package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class mdatabase_subs_0 {


public static RemoteObject  _createdatabasenewtable(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("CreateDataBaseNewTable (mdatabase) ","mdatabase",5,_ba,mdatabase.mostCurrent,9);
if (RapidSub.canDelegate("createdatabasenewtable")) { return ir.parsikhesab.pakhsh.mdatabase.remoteMe.runUserSub(false, "mdatabase","createdatabasenewtable", _ba);}
RemoteObject _check = RemoteObject.createImmutable(0);
RemoteObject _cur = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
;
 BA.debugLineNum = 9;BA.debugLine="Sub CreateDataBaseNewTable";
Debug.ShouldStop(256);
 BA.debugLineNum = 10;BA.debugLine="Dim Check As Int";
Debug.ShouldStop(512);
_check = RemoteObject.createImmutable(0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 11;BA.debugLine="Dim Cur As Cursor";
Debug.ShouldStop(1024);
_cur = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 13;BA.debugLine="Cur = MCode.Sql1.ExecQuery(\"SELECT name FROM sqli";
Debug.ShouldStop(4096);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT name FROM sqlite_master WHERE type='table' AND name='TblAshkhasNew'"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 14;BA.debugLine="If Cur.RowCount = 0 Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 15;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Create Table TblAshkhas";
Debug.ShouldStop(16384);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Create Table TblAshkhasNew (FldId integer NOT NULL PRIMARY KEY,FldCodeTafzili Text,FldSharheTafzili Text,FldVisitor Text,FldTell Text,FldC_Meli Text,FldC_Posti Text,FldShomarehesab Text,FldAddress Text,FldCodeGroup Text)")));
 BA.debugLineNum = 16;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(32768);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 17;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(65536);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 20;BA.debugLine="Cur = MCode.Sql1.ExecQuery(\"SELECT name FROM sqli";
Debug.ShouldStop(524288);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT name FROM sqlite_master WHERE type='table' AND name='TblGoroohKala'"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 21;BA.debugLine="If Cur.RowCount = 0 Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 22;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Create Table TblGoroohK";
Debug.ShouldStop(2097152);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Create Table TblGoroohKala (FldC_Gorooh Text,FldN_Gorooh Text)")));
 BA.debugLineNum = 23;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(4194304);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 24;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(8388608);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 27;BA.debugLine="Cur = MCode.Sql1.ExecQuery(\"SELECT name FROM sqli";
Debug.ShouldStop(67108864);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT name FROM sqlite_master WHERE type='table' AND name='TblGoroohAshkhas'"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 28;BA.debugLine="If Cur.RowCount = 0 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 29;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Create Table TblGoroohA";
Debug.ShouldStop(268435456);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Create Table TblGoroohAshkhas (FldC_Gorooh Text,FldN_Gorooh Text)")));
 BA.debugLineNum = 30;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(536870912);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 31;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(1073741824);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 34;BA.debugLine="Cur = MCode.Sql1.ExecQuery(\"SELECT name FROM sqli";
Debug.ShouldStop(2);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT name FROM sqlite_master WHERE type='table' AND name='TblSooratHesab'"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 35;BA.debugLine="If Cur.RowCount = 0 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 36;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Create Table TblSooratH";
Debug.ShouldStop(8);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Create Table TblSooratHesab (FldId integer NOT NULL PRIMARY KEY,FldCodeTafzili Text,FldSharheTafzili Text,FldShomareFactor Text,FldMandeTalab Text,FldMablagheKolDaryafti Text,FldMandeTasfieNashode Text,FldDateSarResid Text)")));
 BA.debugLineNum = 37;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(16);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 38;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(32);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 41;BA.debugLine="Cur = MCode.Sql1.ExecQuery(\"SELECT name FROM sqli";
Debug.ShouldStop(256);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT name FROM sqlite_master WHERE type='table' AND name='TblNotifi'"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 42;BA.debugLine="If Cur.RowCount = 0 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 43;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Create Table TblNotifi";
Debug.ShouldStop(1024);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Create Table TblNotifi (FldId integer NOT NULL PRIMARY KEY,Id INTEGER,FldTitle Text,FldBody Text,FldDate Text,FldTime Text,FldStatus Text)")));
 BA.debugLineNum = 44;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(2048);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 45;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(4096);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 50;BA.debugLine="Cur = MCode.Sql1.ExecQuery(\"SELECT name FROM sqli";
Debug.ShouldStop(131072);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT name FROM sqlite_master WHERE type='table' AND name='TblTablighVisitor'"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 51;BA.debugLine="If Cur.RowCount = 0 Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 52;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Create Table TblTabligh";
Debug.ShouldStop(524288);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Create Table TblTablighVisitor (Id integer NOT NULL PRIMARY KEY,FldTitle Text,FldMessage Text,FldDate Text,FldTime Text,FldVaziat Text,FldLink Text)")));
 BA.debugLineNum = 53;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(1048576);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 54;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(2097152);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 58;BA.debugLine="Cur = MCode.Sql1.ExecQuery(\"SELECT name FROM sqli";
Debug.ShouldStop(33554432);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT name FROM sqlite_master WHERE type='table' AND name='TblLogVisitSefaresh'"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 59;BA.debugLine="If Cur.RowCount = 0 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 60;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Create Table TblLogVisi";
Debug.ShouldStop(134217728);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Create Table TblLogVisitSefaresh (FldId INTEGER NOT NULL PRIMARY KEY,FldC_Ashkhas Text,FldVisit Text,FldSefaresh Text,FldElatSefaresh Text,FldLat Text,FldLon Text)")));
 BA.debugLineNum = 61;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(268435456);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 62;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(536870912);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 64;BA.debugLine="Cur = MCode.Sql1.ExecQuery(\"SELECT name FROM sqli";
Debug.ShouldStop(-2147483648);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT name FROM sqlite_master WHERE type='table' AND name='TblLastSeen'"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 65;BA.debugLine="If Cur.RowCount = 0 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 66;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Create Table TblLastSee";
Debug.ShouldStop(2);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Create Table TblLastSeen (FldC_Ashkhas Text,LastSeen Text)")));
 BA.debugLineNum = 67;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(4);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 68;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(8);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 71;BA.debugLine="Cur = MCode.Sql1.ExecQuery(\"SELECT name FROM sqli";
Debug.ShouldStop(64);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT name FROM sqlite_master WHERE type='table' AND name='TblNextVisit'"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 72;BA.debugLine="If Cur.RowCount = 0 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 73;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Create Table TblNextVis";
Debug.ShouldStop(256);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Create Table TblNextVisit (FldC_Ashkhas Text,NextVisitDate Text,NextVisitText Text)")));
 BA.debugLineNum = 74;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(512);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 75;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(1024);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 78;BA.debugLine="Cur = MCode.Sql1.ExecQuery(\"SELECT name FROM sqli";
Debug.ShouldStop(8192);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT name FROM sqlite_master WHERE type='table' AND name='TblVisitorTour'"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 79;BA.debugLine="If Cur.RowCount = 0 Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 80;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Create Table TblVisitor";
Debug.ShouldStop(32768);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Create Table TblVisitorTour (FldId Text,FldC_Ashkhas Text,FldN_Ashkhas Text,FldAddress Text,FldTell Text,FldMob Text,FldC_City Text,FldN_City Text,FldC_Visitor Text,FldVaziat Text,FldEtebar Text,FldMandeHesab Text,FldLat Text,FldLon Text,FldTakhfifVizhe Text,FldTipFee Text,FldC_Visitor1 Text,FldC_Visitor2 Text,FldC_Visitor3 Text,FldC_Visitor4 Text,FldC_Visitor5 Text,FldC_Visitor6 Text,FldC_Visitor7 Text,FldC_Visitor8 Text,FldC_Visitor9 Text,FldLastVisit Text,FldLastSefaresh Text,lastSeen Text,lastOrderDate Text,nextVisitDate Text,nextVisitText Text,visitTourDate Text,visitTourText Text,fldC_Ashkhas_C Text)")));
 BA.debugLineNum = 81;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(65536);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 82;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(131072);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 85;BA.debugLine="Cur = MCode.Sql1.ExecQuery(\"SELECT name FROM sqli";
Debug.ShouldStop(1048576);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT name FROM sqlite_master WHERE type='table' AND name='TblGalleryPic'"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 86;BA.debugLine="If Cur.RowCount = 0 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 87;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Create Table TblGallery";
Debug.ShouldStop(4194304);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Create Table TblGalleryPic (Id integer NOT NULL PRIMARY KEY,fldCodeKala Text,fldImageNumber Text,fldImage Text,fldShow Text)")));
 BA.debugLineNum = 88;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(8388608);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 89;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(16777216);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 92;BA.debugLine="Cur = MCode.Sql1.ExecQuery(\"SELECT name FROM sqli";
Debug.ShouldStop(134217728);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT name FROM sqlite_master WHERE type='table' AND name='tblEshantionVisitori'"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 93;BA.debugLine="If Cur.RowCount = 0 Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 94;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Create Table tblEshanti";
Debug.ShouldStop(536870912);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Create Table tblEshantionVisitori(Id integer NOT NULL PRIMARY KEY,fldCodeKala Text,fldVahed Text,fldTedadEshantion Text,fldCountForoosh Text,fldVaziat Text)")));
 BA.debugLineNum = 95;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(1073741824);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 96;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(-2147483648);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 99;BA.debugLine="Cur = MCode.Sql1.ExecQuery(\"SELECT name FROM sqli";
Debug.ShouldStop(4);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT name FROM sqlite_master WHERE type='table' AND name='tblEshantionTabaghati'"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 100;BA.debugLine="If Cur.RowCount = 0 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 101;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Create Table tblEshanti";
Debug.ShouldStop(16);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Create Table tblEshantionTabaghati(ID integer NOT NULL PRIMARY KEY,fldCodeKalaForoosh Text,fldShomareTabaghe Text,fldTedadForoosh Text,fldCodeKalaEshantion Text,fldTedadEshantion Text)")));
 BA.debugLineNum = 102;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(32);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 103;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(64);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 106;BA.debugLine="Cur = MCode.Sql1.ExecQuery(\"SELECT name FROM sqli";
Debug.ShouldStop(512);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT name FROM sqlite_master WHERE type='table' AND name='tblEshantionGroup'"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 107;BA.debugLine="If Cur.RowCount = 0 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 108;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Create Table tblEshanti";
Debug.ShouldStop(2048);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Create Table tblEshantionGroup(ID integer NOT NULL PRIMARY KEY,fldCodeGroupKala Text,fldShomareTabaghe Text,fldTedadForoosh Text,fldCodeGroupKalaEshantion Text,fldTedadEshantion Text)")));
 BA.debugLineNum = 109;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(4096);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 110;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(8192);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 113;BA.debugLine="Cur = MCode.Sql1.ExecQuery(\"SELECT name FROM sqli";
Debug.ShouldStop(65536);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT name FROM sqlite_master WHERE type='table' AND name='tblEshantionGroupTemp'"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 114;BA.debugLine="If Cur.RowCount = 0 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 115;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Create Table tblEshanti";
Debug.ShouldStop(262144);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Create Table tblEshantionGroupTemp(fldCodeGroupKala Text,fldCodeGroupKalaEshantion Text,fldTedadEshantion Text)")));
 BA.debugLineNum = 116;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(524288);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 117;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(1048576);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 120;BA.debugLine="Cur = MCode.Sql1.ExecQuery(\"SELECT name FROM sqli";
Debug.ShouldStop(8388608);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT name FROM sqlite_master WHERE type='table' AND name='TblVisitor'"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 121;BA.debugLine="If Cur.RowCount = 0 Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 122;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Create Table TblVisitor";
Debug.ShouldStop(33554432);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Create Table TblVisitor (FldC_Visitor Text,FldN_Visitor Text)")));
 BA.debugLineNum = 123;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(67108864);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 124;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(134217728);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 126;BA.debugLine="Cur = MCode.Sql1.ExecQuery(\"SELECT name FROM sqli";
Debug.ShouldStop(536870912);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT name FROM sqlite_master WHERE type='table' AND name='TblSabt'"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 127;BA.debugLine="If Cur.RowCount = 0 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 128;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Create Table TblSabt (F";
Debug.ShouldStop(-2147483648);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Create Table TblSabt (FldShomareSabt Text,FldC_Visitor Text,FldN_Visitor Text,FldC_Ashkhas Text,FldType Text,FldNoe Text,FldMablagh Text,FldShomareCheck Text,FldDateCheck Text,FldBankName Text,FldDateSabt Text)")));
 BA.debugLineNum = 129;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(1);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 130;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(2);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 132;BA.debugLine="Cur = MCode.Sql1.ExecQuery(\"SELECT name FROM sqli";
Debug.ShouldStop(8);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT name FROM sqlite_master WHERE type='table' AND name='TblHavale'"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 133;BA.debugLine="If Cur.RowCount = 0 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 134;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Create Table TblHavale";
Debug.ShouldStop(32);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Create Table TblHavale (fldShomareHavale Text,fldDate Text,fldVaziat int,fldMandeFactor Text,fldCountFactor Text)")));
 BA.debugLineNum = 135;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(64);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 136;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(128);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 138;BA.debugLine="Cur = MCode.Sql1.ExecQuery(\"SELECT name FROM sqli";
Debug.ShouldStop(512);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT name FROM sqlite_master WHERE type='table' AND name='TblRizFactorHavale'"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 139;BA.debugLine="If Cur.RowCount = 0 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 140;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Create Table TblRizFact";
Debug.ShouldStop(2048);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Create Table TblRizFactorHavale (fldShomareFactor text,fldShomareHavale text,fldShomareSanad text,fldCodeAnbar text,fldRadif text,fldCodeKala text,fldSharhKala text,fldCodeTafzili text,fldSharhTafzili text,fldTedadCarton text,fldTedadJoz text,fldFeeJoz text,fldFeeYekCarton text,fldFeeKol text,fldDarsadTakhfif,fldMablaghTakhfif text,fldArzeshAfzode text,fldMablaghKhales text,fldNameCompany text,fldC_Ranandeh text,fldN_Ranandeh text,fldAddress text,fldTell text,fldCodeVasete text,fldDateFactor text,fldDate text,fldTime text,fldLat text,fldLon text,fldMandeTalab text,fldMablagheKolDaryafti text,fldMandeTasfieNashode text,fldDateSarResid text,fldVaziat int,fldDateTahvil text,fldTimeTahvil text,fldSignature text,fldSharhFactor text)")));
 BA.debugLineNum = 141;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(4096);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 142;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(8192);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 145;BA.debugLine="Cur = MCode.Sql1.ExecQuery(\"SELECT name FROM sqli";
Debug.ShouldStop(65536);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT name FROM sqlite_master WHERE type='table' AND name='TblBankMa'"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 146;BA.debugLine="If Cur.RowCount = 0 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 147;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Create Table TblBankMa";
Debug.ShouldStop(262144);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Create Table TblBankMa (fldCodeBank text,fldNameBank text)")));
 BA.debugLineNum = 148;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(524288);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 149;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(1048576);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 152;BA.debugLine="Cur = MCode.Sql1.ExecQuery(\"SELECT name FROM sqli";
Debug.ShouldStop(8388608);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT name FROM sqlite_master WHERE type='table' AND name='TblBankMoshtari'"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 153;BA.debugLine="If Cur.RowCount = 0 Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 154;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Create Table TblBankMos";
Debug.ShouldStop(33554432);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Create Table TblBankMoshtari (fldCodeBank text,fldNameBank text)")));
 BA.debugLineNum = 155;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(67108864);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 156;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(134217728);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 159;BA.debugLine="Cur = MCode.Sql1.ExecQuery(\"SELECT name FROM sqli";
Debug.ShouldStop(1073741824);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT name FROM sqlite_master WHERE type='table' AND name='TblSandoogh'"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 160;BA.debugLine="If Cur.RowCount = 0 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 161;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Create Table TblSandoog";
Debug.ShouldStop(1);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Create Table TblSandoogh (fldCodeSandoogh text,fldNameSandoogh text)")));
 BA.debugLineNum = 162;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(2);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 163;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(4);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 167;BA.debugLine="Cur = MCode.Sql1.ExecQuery(\"SELECT name FROM sqli";
Debug.ShouldStop(64);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT name FROM sqlite_master WHERE type='table' AND name='TblDaryaft'"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 168;BA.debugLine="If Cur.RowCount = 0 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 169;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Create Table TblDaryaft";
Debug.ShouldStop(256);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Create Table TblDaryaft (ID integer NOT NULL PRIMARY KEY,fldShomareDaryaft Text,fldMablaghDaryafti Text,fldShomareFactor Text,fldShomareSanad Text,fldCodeTafzili Text,fldSharh Text,fldCodeVaste Text,fldCodeSandoogh Text,fldCodeBank Text,fldType Text,FldRadif Text,FldDateDaryaft Text,FldShomareDaryaftReal Text,FldShomareCheck Text,FldDarsadTakhfif Text,FldMablaghTakhfif Text,fldSharhKol Text,fldSend Text)")));
 BA.debugLineNum = 170;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(512);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 171;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(1024);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 174;BA.debugLine="Cur = MCode.Sql1.ExecQuery(\"SELECT name FROM sqli";
Debug.ShouldStop(8192);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT name FROM sqlite_master WHERE type='table' AND name='TblCheckDaryafti'"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 175;BA.debugLine="If Cur.RowCount = 0 Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 176;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Create Table TblCheckDa";
Debug.ShouldStop(32768);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Create Table TblCheckDaryafti (ID integer NOT NULL PRIMARY KEY,fldShomareCheck Text,fldShomareHesab Text,fldDate Text,fldDateSarResid Text,fldCodeBank Text,fldShobe Text,fldMablagh Text,fldCodeSahebeCheck Text,fldShomareDaryaft Text,fldNameBank Text,fldNameSahebeCheck Text,fldShomareFactor Text,fldSharh Text,fldSend Text,fldCodeVaste Text)")));
 BA.debugLineNum = 177;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(65536);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 178;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(131072);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 181;BA.debugLine="Cur = MCode.Sql1.ExecQuery(\"SELECT name FROM sqli";
Debug.ShouldStop(1048576);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT name FROM sqlite_master WHERE type='table' AND name='TblEnterExitVisitor'"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 182;BA.debugLine="If Cur.RowCount = 0 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 183;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Create Table TblEnterEx";
Debug.ShouldStop(4194304);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Create Table TblEnterExitVisitor (ID integer NOT NULL PRIMARY KEY,fldType Text,fldDate Text,fldTime Text,fldLat Text,fldLon Text,fldSend Text)")));
 BA.debugLineNum = 184;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(8388608);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 185;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(16777216);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 188;BA.debugLine="Cur = MCode.Sql1.ExecQuery(\"SELECT name FROM sqli";
Debug.ShouldStop(134217728);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT name FROM sqlite_master WHERE type='table' AND name='TblSettingPos'"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 189;BA.debugLine="If Cur.RowCount = 0 Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 190;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Create Table TblSetting";
Debug.ShouldStop(536870912);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Create Table TblSettingPos (ID integer NOT NULL PRIMARY KEY,fldPosName Text,fldCompanyName Text,fldAMOUNT Text,fldSignCode Text,fldAdditionalData Text)")));
 BA.debugLineNum = 191;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(1073741824);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 192;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(-2147483648);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 195;BA.debugLine="Cur = MCode.Sql1.ExecQuery(\"SELECT name FROM sqli";
Debug.ShouldStop(4);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT name FROM sqlite_master WHERE type='table' AND name='tblDaftarcheTell'"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 196;BA.debugLine="If Cur.RowCount = 0 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 197;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Create Table tblDaftarc";
Debug.ShouldStop(16);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Create Table tblDaftarcheTell (fldIdDaftarche integer NOT NULL PRIMARY KEY,fldCodeTafzili Text,fldName Text,fldShomare Text)")));
 BA.debugLineNum = 198;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(32);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 199;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(64);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 202;BA.debugLine="Cur = MCode.Sql1.ExecQuery(\"SELECT name FROM sqli";
Debug.ShouldStop(512);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT name FROM sqlite_master WHERE type='table' AND name='tblGroupDastrasi'"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 203;BA.debugLine="If Cur.RowCount = 0 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 204;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Create Table tblGroupDa";
Debug.ShouldStop(2048);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Create Table tblGroupDastrasi (ID integer NOT NULL PRIMARY KEY,fldCodeGroup Text)")));
 BA.debugLineNum = 205;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(4096);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 206;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(8192);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 209;BA.debugLine="Cur = MCode.Sql1.ExecQuery(\"SELECT name FROM sqli";
Debug.ShouldStop(65536);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT name FROM sqlite_master WHERE type='table' AND name='tblTourVisitor'"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 210;BA.debugLine="If Cur.RowCount = 0 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 211;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Create Table tblTourVis";
Debug.ShouldStop(262144);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Create Table tblTourVisitor (ID integer NOT NULL PRIMARY KEY,fldRadif int,fldCodeSuperVisor Text,fldCodeVisitor Text,fldCodeGroup Text,fldCodeTafzili Text,fldSharheTafzili Text,fldDate Text,fldDateVisit Text,fldTimeVisit Text,fldDateNextVisit Text,fldDateTozie Text,fldShomareSefaresh Text,fldTimeSefaresh Text,fldSharh Text,fldVaziat Text,fldShomareFactor Text,fldType Text,fldSend Text)")));
 BA.debugLineNum = 212;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(524288);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 213;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(1048576);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 215;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _updatedatabaseashkhas(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("UpdateDataBaseAshkhas (mdatabase) ","mdatabase",5,_ba,mdatabase.mostCurrent,1052);
if (RapidSub.canDelegate("updatedatabaseashkhas")) { return ir.parsikhesab.pakhsh.mdatabase.remoteMe.runUserSub(false, "mdatabase","updatedatabaseashkhas", _ba);}
RemoteObject _check = RemoteObject.createImmutable(0);
RemoteObject _cur = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
;
 BA.debugLineNum = 1052;BA.debugLine="Sub UpdateDataBaseAshkhas";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 1053;BA.debugLine="Dim Check As Int";
Debug.ShouldStop(268435456);
_check = RemoteObject.createImmutable(0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1054;BA.debugLine="Dim Cur As Cursor";
Debug.ShouldStop(536870912);
_cur = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 1056;BA.debugLine="Check=0";
Debug.ShouldStop(-2147483648);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1057;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblAshkha";
Debug.ShouldStop(1);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblAshkhas"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 1058;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(2);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1059;BA.debugLine="If  Cur.GetColumnName(i)=\"FldSync\" Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldSync"))) { 
 BA.debugLineNum = 1060;BA.debugLine="Check=1";
Debug.ShouldStop(8);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1061;BA.debugLine="Exit";
Debug.ShouldStop(16);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1064;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1065;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblAshkhas";
Debug.ShouldStop(256);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblAshkhas ADD FldSync Text")));
 BA.debugLineNum = 1066;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(512);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 1067;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(1024);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 1070;BA.debugLine="Check=0";
Debug.ShouldStop(8192);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1071;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblAshkha";
Debug.ShouldStop(16384);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblAshkhas"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 1072;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(32768);
{
final int step18 = 1;
final int limit18 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step18 > 0 && _i <= limit18) || (step18 < 0 && _i >= limit18) ;_i = ((int)(0 + _i + step18))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1073;BA.debugLine="If  Cur.GetColumnName(i)=\"FldMobile\" Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldMobile"))) { 
 BA.debugLineNum = 1074;BA.debugLine="Check=1";
Debug.ShouldStop(131072);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1075;BA.debugLine="Exit";
Debug.ShouldStop(262144);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1078;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1079;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblAshkhas";
Debug.ShouldStop(4194304);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblAshkhas ADD FldMobile Text")));
 BA.debugLineNum = 1080;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblAshkhas";
Debug.ShouldStop(8388608);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblAshkhas ADD FldC_Meli Text")));
 BA.debugLineNum = 1081;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblAshkhas";
Debug.ShouldStop(16777216);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblAshkhas ADD FldC_Posti Text")));
 BA.debugLineNum = 1082;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblAshkhas";
Debug.ShouldStop(33554432);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblAshkhas ADD FldShomarehesab Text")));
 BA.debugLineNum = 1083;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblAshkhas";
Debug.ShouldStop(67108864);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblAshkhas ADD FldLastVisit Text")));
 BA.debugLineNum = 1084;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblAshkhas";
Debug.ShouldStop(134217728);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblAshkhas ADD FldLastSefaresh Text")));
 BA.debugLineNum = 1085;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblAshkhas";
Debug.ShouldStop(268435456);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblAshkhas ADD FldVaziat Text")));
 BA.debugLineNum = 1086;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblAshkhas";
Debug.ShouldStop(536870912);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblAshkhas ADD FldEtebar Text")));
 BA.debugLineNum = 1087;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblAshkhas";
Debug.ShouldStop(1073741824);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblAshkhas ADD lastSeen Text")));
 BA.debugLineNum = 1088;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblAshkhas";
Debug.ShouldStop(-2147483648);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblAshkhas ADD lastOrderDate Text")));
 BA.debugLineNum = 1089;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(1);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 1090;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(2);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 1092;BA.debugLine="Check=0";
Debug.ShouldStop(8);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1093;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblAshkha";
Debug.ShouldStop(16);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblAshkhas"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 1094;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(32);
{
final int step40 = 1;
final int limit40 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step40 > 0 && _i <= limit40) || (step40 < 0 && _i >= limit40) ;_i = ((int)(0 + _i + step40))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1095;BA.debugLine="If  Cur.GetColumnName(i)=\"fldBlackList\" Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("fldBlackList"))) { 
 BA.debugLineNum = 1096;BA.debugLine="Check=1";
Debug.ShouldStop(128);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1097;BA.debugLine="Exit";
Debug.ShouldStop(256);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1100;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1101;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblAshkhas";
Debug.ShouldStop(4096);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblAshkhas ADD fldBlackList Text")));
 BA.debugLineNum = 1102;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(8192);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 1103;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(16384);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 1105;BA.debugLine="Check=0";
Debug.ShouldStop(65536);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1106;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblAshkha";
Debug.ShouldStop(131072);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblAshkhas"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 1107;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(262144);
{
final int step53 = 1;
final int limit53 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step53 > 0 && _i <= limit53) || (step53 < 0 && _i >= limit53) ;_i = ((int)(0 + _i + step53))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1108;BA.debugLine="If  Cur.GetColumnName(i)=\"fldSaghfeEtebar\" Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("fldSaghfeEtebar"))) { 
 BA.debugLineNum = 1109;BA.debugLine="Check=1";
Debug.ShouldStop(1048576);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1110;BA.debugLine="Exit";
Debug.ShouldStop(2097152);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1113;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1114;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblAshkhas";
Debug.ShouldStop(33554432);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblAshkhas ADD fldSaghfeEtebar Text")));
 BA.debugLineNum = 1115;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(67108864);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 1116;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(134217728);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 1118;BA.debugLine="Check=0";
Debug.ShouldStop(536870912);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1119;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblAshkha";
Debug.ShouldStop(1073741824);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblAshkhas"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 1120;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(-2147483648);
{
final int step66 = 1;
final int limit66 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step66 > 0 && _i <= limit66) || (step66 < 0 && _i >= limit66) ;_i = ((int)(0 + _i + step66))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1121;BA.debugLine="If  Cur.GetColumnName(i)=\"fldCodeMovaghat\" Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("fldCodeMovaghat"))) { 
 BA.debugLineNum = 1122;BA.debugLine="Check=1";
Debug.ShouldStop(2);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1123;BA.debugLine="Exit";
Debug.ShouldStop(4);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1126;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1127;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblAshkhas";
Debug.ShouldStop(64);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblAshkhas ADD fldCodeMovaghat Text")));
 BA.debugLineNum = 1128;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(128);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 1129;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(256);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 1131;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updatedatabaseashkhasnew(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("UpdateDataBaseAshkhasNew (mdatabase) ","mdatabase",5,_ba,mdatabase.mostCurrent,1932);
if (RapidSub.canDelegate("updatedatabaseashkhasnew")) { return ir.parsikhesab.pakhsh.mdatabase.remoteMe.runUserSub(false, "mdatabase","updatedatabaseashkhasnew", _ba);}
RemoteObject _check = RemoteObject.createImmutable(0);
RemoteObject _cur = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
;
 BA.debugLineNum = 1932;BA.debugLine="Sub UpdateDataBaseAshkhasNew";
Debug.ShouldStop(2048);
 BA.debugLineNum = 1933;BA.debugLine="Dim Check As Int";
Debug.ShouldStop(4096);
_check = RemoteObject.createImmutable(0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1934;BA.debugLine="Dim Cur As Cursor";
Debug.ShouldStop(8192);
_cur = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 1936;BA.debugLine="Check=0";
Debug.ShouldStop(32768);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1937;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblAshkha";
Debug.ShouldStop(65536);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblAshkhasNew"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 1938;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(131072);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1939;BA.debugLine="If  Cur.GetColumnName(i)=\"FldCodeGroup\" Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldCodeGroup"))) { 
 BA.debugLineNum = 1940;BA.debugLine="Check=1";
Debug.ShouldStop(524288);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1941;BA.debugLine="Exit";
Debug.ShouldStop(1048576);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1944;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1945;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblAshkhasN";
Debug.ShouldStop(16777216);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblAshkhasNew ADD FldCodeGroup Text")));
 BA.debugLineNum = 1946;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(33554432);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 1947;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(67108864);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 1949;BA.debugLine="Check=0";
Debug.ShouldStop(268435456);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1950;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblAshkha";
Debug.ShouldStop(536870912);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblAshkhasNew"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 1951;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(1073741824);
{
final int step18 = 1;
final int limit18 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step18 > 0 && _i <= limit18) || (step18 < 0 && _i >= limit18) ;_i = ((int)(0 + _i + step18))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1952;BA.debugLine="If  Cur.GetColumnName(i)=\"FldC_Meli\" Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldC_Meli"))) { 
 BA.debugLineNum = 1953;BA.debugLine="Check=1";
Debug.ShouldStop(1);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1954;BA.debugLine="Exit";
Debug.ShouldStop(2);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1957;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1958;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblAshkhasN";
Debug.ShouldStop(32);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblAshkhasNew ADD FldC_Meli Text")));
 BA.debugLineNum = 1959;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(64);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 1960;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(128);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 1962;BA.debugLine="Check=0";
Debug.ShouldStop(512);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1964;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblAshkha";
Debug.ShouldStop(2048);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblAshkhasNew"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 1965;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(4096);
{
final int step31 = 1;
final int limit31 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step31 > 0 && _i <= limit31) || (step31 < 0 && _i >= limit31) ;_i = ((int)(0 + _i + step31))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1966;BA.debugLine="If  Cur.GetColumnName(i)=\"FldC_Posti\" Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldC_Posti"))) { 
 BA.debugLineNum = 1967;BA.debugLine="Check=1";
Debug.ShouldStop(16384);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1968;BA.debugLine="Exit";
Debug.ShouldStop(32768);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1971;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1972;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblAshkhasN";
Debug.ShouldStop(524288);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblAshkhasNew ADD FldC_Posti Text")));
 BA.debugLineNum = 1973;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(1048576);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 1974;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(2097152);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 1976;BA.debugLine="Check=0";
Debug.ShouldStop(8388608);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1977;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblAshkha";
Debug.ShouldStop(16777216);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblAshkhasNew"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 1978;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(33554432);
{
final int step44 = 1;
final int limit44 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step44 > 0 && _i <= limit44) || (step44 < 0 && _i >= limit44) ;_i = ((int)(0 + _i + step44))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1979;BA.debugLine="If  Cur.GetColumnName(i)=\"FldMobile\" Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldMobile"))) { 
 BA.debugLineNum = 1980;BA.debugLine="Check=1";
Debug.ShouldStop(134217728);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1981;BA.debugLine="Exit";
Debug.ShouldStop(268435456);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1984;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1985;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblAshkhasN";
Debug.ShouldStop(1);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblAshkhasNew ADD FldMobile Text")));
 BA.debugLineNum = 1986;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(2);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 1987;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(4);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 1989;BA.debugLine="Check=0";
Debug.ShouldStop(16);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1991;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblAshkha";
Debug.ShouldStop(64);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblAshkhasNew"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 1992;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(128);
{
final int step57 = 1;
final int limit57 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step57 > 0 && _i <= limit57) || (step57 < 0 && _i >= limit57) ;_i = ((int)(0 + _i + step57))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1993;BA.debugLine="If  Cur.GetColumnName(i)=\"FldLat\" Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldLat"))) { 
 BA.debugLineNum = 1994;BA.debugLine="Check=1";
Debug.ShouldStop(512);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1995;BA.debugLine="Exit";
Debug.ShouldStop(1024);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1998;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1999;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblAshkhasN";
Debug.ShouldStop(16384);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblAshkhasNew ADD FldLat Text")));
 BA.debugLineNum = 2000;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(32768);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 2001;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(65536);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 2003;BA.debugLine="Check=0";
Debug.ShouldStop(262144);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 2005;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblAshkha";
Debug.ShouldStop(1048576);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblAshkhasNew"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 2006;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(2097152);
{
final int step70 = 1;
final int limit70 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step70 > 0 && _i <= limit70) || (step70 < 0 && _i >= limit70) ;_i = ((int)(0 + _i + step70))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 2007;BA.debugLine="If  Cur.GetColumnName(i)=\"FldLon\" Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldLon"))) { 
 BA.debugLineNum = 2008;BA.debugLine="Check=1";
Debug.ShouldStop(8388608);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 2009;BA.debugLine="Exit";
Debug.ShouldStop(16777216);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2012;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2013;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblAshkhasN";
Debug.ShouldStop(268435456);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblAshkhasNew ADD FldLon Text")));
 BA.debugLineNum = 2014;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(536870912);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 2015;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(1073741824);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 2017;BA.debugLine="Check=0";
Debug.ShouldStop(1);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 2019;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblAshkha";
Debug.ShouldStop(4);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblAshkhasNew"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 2020;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(8);
{
final int step83 = 1;
final int limit83 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step83 > 0 && _i <= limit83) || (step83 < 0 && _i >= limit83) ;_i = ((int)(0 + _i + step83))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 2021;BA.debugLine="If  Cur.GetColumnName(i)=\"FldShomarehesab\" Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldShomarehesab"))) { 
 BA.debugLineNum = 2022;BA.debugLine="Check=1";
Debug.ShouldStop(32);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 2023;BA.debugLine="Exit";
Debug.ShouldStop(64);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2026;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2027;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblAshkhasN";
Debug.ShouldStop(1024);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblAshkhasNew ADD FldShomarehesab Text")));
 BA.debugLineNum = 2028;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(2048);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 2029;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(4096);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 2031;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updatedatabasedaryaft(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("UpdateDataBaseDaryaft (mdatabase) ","mdatabase",5,_ba,mdatabase.mostCurrent,1830);
if (RapidSub.canDelegate("updatedatabasedaryaft")) { return ir.parsikhesab.pakhsh.mdatabase.remoteMe.runUserSub(false, "mdatabase","updatedatabasedaryaft", _ba);}
RemoteObject _check = RemoteObject.createImmutable(0);
RemoteObject _cur = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
;
 BA.debugLineNum = 1830;BA.debugLine="Sub UpdateDataBaseDaryaft";
Debug.ShouldStop(32);
 BA.debugLineNum = 1831;BA.debugLine="Dim Check As Int";
Debug.ShouldStop(64);
_check = RemoteObject.createImmutable(0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1832;BA.debugLine="Dim Cur As Cursor";
Debug.ShouldStop(128);
_cur = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 1834;BA.debugLine="Check=0";
Debug.ShouldStop(512);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1835;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblDaryaf";
Debug.ShouldStop(1024);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblDaryaft"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 1836;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(2048);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1837;BA.debugLine="If  Cur.GetColumnName(i)=\"fldSharheTafzili\" Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("fldSharheTafzili"))) { 
 BA.debugLineNum = 1838;BA.debugLine="Check=1";
Debug.ShouldStop(8192);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1839;BA.debugLine="Exit";
Debug.ShouldStop(16384);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1842;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1843;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblDaryaft";
Debug.ShouldStop(262144);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblDaryaft ADD fldSharheTafzili Text")));
 BA.debugLineNum = 1844;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(524288);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 1845;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(1048576);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 1847;BA.debugLine="Check=0";
Debug.ShouldStop(4194304);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1848;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblDaryaf";
Debug.ShouldStop(8388608);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblDaryaft"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 1849;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(16777216);
{
final int step18 = 1;
final int limit18 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step18 > 0 && _i <= limit18) || (step18 < 0 && _i >= limit18) ;_i = ((int)(0 + _i + step18))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1850;BA.debugLine="If  Cur.GetColumnName(i)=\"fldShomareHavale\" Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("fldShomareHavale"))) { 
 BA.debugLineNum = 1851;BA.debugLine="Check=1";
Debug.ShouldStop(67108864);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1852;BA.debugLine="Exit";
Debug.ShouldStop(134217728);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1855;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1856;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblDaryaft";
Debug.ShouldStop(-2147483648);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblDaryaft ADD fldShomareHavale Text")));
 BA.debugLineNum = 1857;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(1);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 1858;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(2);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 1860;BA.debugLine="Check=0";
Debug.ShouldStop(8);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1861;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblDaryaf";
Debug.ShouldStop(16);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblDaryaft"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 1862;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(32);
{
final int step31 = 1;
final int limit31 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step31 > 0 && _i <= limit31) || (step31 < 0 && _i >= limit31) ;_i = ((int)(0 + _i + step31))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1863;BA.debugLine="If  Cur.GetColumnName(i)=\"fldShomareTell\" Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("fldShomareTell"))) { 
 BA.debugLineNum = 1864;BA.debugLine="Check=1";
Debug.ShouldStop(128);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1865;BA.debugLine="Exit";
Debug.ShouldStop(256);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1868;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1869;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblDaryaft";
Debug.ShouldStop(4096);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblDaryaft ADD fldShomareTell Text")));
 BA.debugLineNum = 1870;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(8192);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 1871;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(16384);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 1873;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updatedatabaseenterexitvisitor(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("UpdateDataBaseEnterExitVisitor (mdatabase) ","mdatabase",5,_ba,mdatabase.mostCurrent,1875);
if (RapidSub.canDelegate("updatedatabaseenterexitvisitor")) { return ir.parsikhesab.pakhsh.mdatabase.remoteMe.runUserSub(false, "mdatabase","updatedatabaseenterexitvisitor", _ba);}
RemoteObject _check = RemoteObject.createImmutable(0);
RemoteObject _cur = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
;
 BA.debugLineNum = 1875;BA.debugLine="Sub UpdateDataBaseEnterExitVisitor";
Debug.ShouldStop(262144);
 BA.debugLineNum = 1876;BA.debugLine="Dim Check As Int";
Debug.ShouldStop(524288);
_check = RemoteObject.createImmutable(0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1877;BA.debugLine="Dim Cur As Cursor";
Debug.ShouldStop(1048576);
_cur = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 1879;BA.debugLine="Check=0";
Debug.ShouldStop(4194304);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1880;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblEnterE";
Debug.ShouldStop(8388608);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblEnterExitVisitor"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 1881;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(16777216);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1882;BA.debugLine="If  Cur.GetColumnName(i)=\"FldCode\" Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldCode"))) { 
 BA.debugLineNum = 1883;BA.debugLine="Check=1";
Debug.ShouldStop(67108864);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1884;BA.debugLine="Exit";
Debug.ShouldStop(134217728);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1887;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1888;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblEnterExi";
Debug.ShouldStop(-2147483648);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblEnterExitVisitor ADD FldCode Text")));
 BA.debugLineNum = 1889;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(1);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 1890;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(2);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 1892;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updatedatabasefactor(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("UpdateDataBaseFactor (mdatabase) ","mdatabase",5,_ba,mdatabase.mostCurrent,1374);
if (RapidSub.canDelegate("updatedatabasefactor")) { return ir.parsikhesab.pakhsh.mdatabase.remoteMe.runUserSub(false, "mdatabase","updatedatabasefactor", _ba);}
RemoteObject _check = RemoteObject.createImmutable(0);
RemoteObject _cur = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
;
 BA.debugLineNum = 1374;BA.debugLine="Sub UpdateDataBaseFactor";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 1375;BA.debugLine="Dim Check As Int";
Debug.ShouldStop(1073741824);
_check = RemoteObject.createImmutable(0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1376;BA.debugLine="Dim Cur As Cursor";
Debug.ShouldStop(-2147483648);
_cur = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 1378;BA.debugLine="Check=0";
Debug.ShouldStop(2);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1379;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblFaktor";
Debug.ShouldStop(4);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblFaktor"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 1380;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(8);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1381;BA.debugLine="If  Cur.GetColumnName(i)=\"FldTozih\" Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldTozih"))) { 
 BA.debugLineNum = 1382;BA.debugLine="Check=1";
Debug.ShouldStop(32);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1383;BA.debugLine="Exit";
Debug.ShouldStop(64);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1386;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1387;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblFaktor A";
Debug.ShouldStop(1024);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblFaktor ADD FldTozih Text")));
 BA.debugLineNum = 1388;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(2048);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 1389;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(4096);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 1392;BA.debugLine="Check=0";
Debug.ShouldStop(32768);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1393;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblFaktor";
Debug.ShouldStop(65536);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblFaktor"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 1394;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(131072);
{
final int step18 = 1;
final int limit18 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step18 > 0 && _i <= limit18) || (step18 < 0 && _i >= limit18) ;_i = ((int)(0 + _i + step18))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1395;BA.debugLine="If  Cur.GetColumnName(i)=\"FldDateTahvilKala\" The";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldDateTahvilKala"))) { 
 BA.debugLineNum = 1396;BA.debugLine="Check=1";
Debug.ShouldStop(524288);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1397;BA.debugLine="Exit";
Debug.ShouldStop(1048576);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1400;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1401;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblFaktor A";
Debug.ShouldStop(16777216);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblFaktor ADD FldDateTahvilKala Text")));
 BA.debugLineNum = 1402;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(33554432);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 1403;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(67108864);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 1406;BA.debugLine="Check=0";
Debug.ShouldStop(536870912);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1407;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblFaktor";
Debug.ShouldStop(1073741824);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblFaktor"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 1408;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(-2147483648);
{
final int step31 = 1;
final int limit31 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step31 > 0 && _i <= limit31) || (step31 < 0 && _i >= limit31) ;_i = ((int)(0 + _i + step31))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1409;BA.debugLine="If  Cur.GetColumnName(i)=\"FldVaziatPardakhti\" Th";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldVaziatPardakhti"))) { 
 BA.debugLineNum = 1410;BA.debugLine="Check=1";
Debug.ShouldStop(2);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1411;BA.debugLine="Exit";
Debug.ShouldStop(4);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1414;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1415;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblFaktor A";
Debug.ShouldStop(64);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblFaktor ADD FldVaziatPardakhti varchar")));
 BA.debugLineNum = 1416;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(128);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 1417;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(256);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 1419;BA.debugLine="Check=0";
Debug.ShouldStop(1024);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1422;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblFaktor";
Debug.ShouldStop(8192);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblFaktor"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 1423;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(16384);
{
final int step44 = 1;
final int limit44 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step44 > 0 && _i <= limit44) || (step44 < 0 && _i >= limit44) ;_i = ((int)(0 + _i + step44))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1424;BA.debugLine="If  Cur.GetColumnName(i)=\"fldDarsadArzeshAfzode\"";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("fldDarsadArzeshAfzode"))) { 
 BA.debugLineNum = 1425;BA.debugLine="Check=1";
Debug.ShouldStop(65536);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1426;BA.debugLine="Exit";
Debug.ShouldStop(131072);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1429;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1430;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblFaktor A";
Debug.ShouldStop(2097152);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblFaktor ADD fldDarsadArzeshAfzode Text")));
 BA.debugLineNum = 1431;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(4194304);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 1432;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(8388608);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 1434;BA.debugLine="Check=0";
Debug.ShouldStop(33554432);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1437;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblFaktor";
Debug.ShouldStop(268435456);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblFaktor"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 1438;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(536870912);
{
final int step57 = 1;
final int limit57 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step57 > 0 && _i <= limit57) || (step57 < 0 && _i >= limit57) ;_i = ((int)(0 + _i + step57))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1439;BA.debugLine="If  Cur.GetColumnName(i)=\"fldArzeshAfzode\" Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("fldArzeshAfzode"))) { 
 BA.debugLineNum = 1440;BA.debugLine="Check=1";
Debug.ShouldStop(-2147483648);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1441;BA.debugLine="Exit";
Debug.ShouldStop(1);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1444;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1445;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblFaktor A";
Debug.ShouldStop(16);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblFaktor ADD fldArzeshAfzode Text")));
 BA.debugLineNum = 1446;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(32);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 1447;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(64);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 1449;BA.debugLine="Check=0";
Debug.ShouldStop(256);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1450;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblFaktor";
Debug.ShouldStop(512);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblFaktor"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 1451;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(1024);
{
final int step70 = 1;
final int limit70 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step70 > 0 && _i <= limit70) || (step70 < 0 && _i >= limit70) ;_i = ((int)(0 + _i + step70))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1452;BA.debugLine="If  Cur.GetColumnName(i)=\"FldTozihat\" Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldTozihat"))) { 
 BA.debugLineNum = 1453;BA.debugLine="Check=1";
Debug.ShouldStop(4096);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1454;BA.debugLine="Exit";
Debug.ShouldStop(8192);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1457;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1458;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblFaktor A";
Debug.ShouldStop(131072);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblFaktor ADD FldTozihat varchar")));
 BA.debugLineNum = 1459;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(262144);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 1460;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(524288);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 1463;BA.debugLine="Check=0";
Debug.ShouldStop(4194304);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1464;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(8388608);
{
final int step82 = 1;
final int limit82 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step82 > 0 && _i <= limit82) || (step82 < 0 && _i >= limit82) ;_i = ((int)(0 + _i + step82))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1465;BA.debugLine="If  Cur.GetColumnName(i)=\"FldMablaghMasrafKonand";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldMablaghMasrafKonande"))) { 
 BA.debugLineNum = 1466;BA.debugLine="Check=1";
Debug.ShouldStop(33554432);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1467;BA.debugLine="Exit";
Debug.ShouldStop(67108864);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1470;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1471;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblFaktor A";
Debug.ShouldStop(1073741824);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblFaktor ADD FldMablaghMasrafKonande Text")));
 BA.debugLineNum = 1472;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(-2147483648);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 1473;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(1);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 1475;BA.debugLine="Check=0";
Debug.ShouldStop(4);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1477;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(16);
{
final int step94 = 1;
final int limit94 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step94 > 0 && _i <= limit94) || (step94 < 0 && _i >= limit94) ;_i = ((int)(0 + _i + step94))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1478;BA.debugLine="If  Cur.GetColumnName(i)=\"FldType\" Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldType"))) { 
 BA.debugLineNum = 1479;BA.debugLine="Check=1";
Debug.ShouldStop(64);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1480;BA.debugLine="Exit";
Debug.ShouldStop(128);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1483;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1484;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblFaktor A";
Debug.ShouldStop(2048);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblFaktor ADD FldType Text")));
 BA.debugLineNum = 1485;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(4096);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 1486;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(8192);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 1489;BA.debugLine="Check=0";
Debug.ShouldStop(65536);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1490;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(131072);
{
final int step106 = 1;
final int limit106 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step106 > 0 && _i <= limit106) || (step106 < 0 && _i >= limit106) ;_i = ((int)(0 + _i + step106))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1491;BA.debugLine="If  Cur.GetColumnName(i)=\"FldC_Visitor\" Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldC_Visitor"))) { 
 BA.debugLineNum = 1492;BA.debugLine="Check=1";
Debug.ShouldStop(524288);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1493;BA.debugLine="Exit";
Debug.ShouldStop(1048576);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1496;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1497;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblFaktor A";
Debug.ShouldStop(16777216);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblFaktor ADD FldC_Visitor Text")));
 BA.debugLineNum = 1498;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(33554432);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 1499;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(67108864);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 1502;BA.debugLine="Check=0";
Debug.ShouldStop(536870912);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1503;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblFaktor";
Debug.ShouldStop(1073741824);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblFaktor"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 1504;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(-2147483648);
{
final int step119 = 1;
final int limit119 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step119 > 0 && _i <= limit119) || (step119 < 0 && _i >= limit119) ;_i = ((int)(0 + _i + step119))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1505;BA.debugLine="If  Cur.GetColumnName(i)=\"FldMablaghTakhfif\" The";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldMablaghTakhfif"))) { 
 BA.debugLineNum = 1506;BA.debugLine="Check=1";
Debug.ShouldStop(2);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1507;BA.debugLine="Exit";
Debug.ShouldStop(4);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1510;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1511;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblFaktor A";
Debug.ShouldStop(64);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblFaktor ADD FldMablaghTakhfif Text")));
 BA.debugLineNum = 1512;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(128);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 1513;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(256);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 1516;BA.debugLine="Check=0";
Debug.ShouldStop(2048);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1517;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblFaktor";
Debug.ShouldStop(4096);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblFaktor"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 1518;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(8192);
{
final int step132 = 1;
final int limit132 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step132 > 0 && _i <= limit132) || (step132 < 0 && _i >= limit132) ;_i = ((int)(0 + _i + step132))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1519;BA.debugLine="If  Cur.GetColumnName(i)=\"FldDarsadTakhfif\" Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldDarsadTakhfif"))) { 
 BA.debugLineNum = 1520;BA.debugLine="Check=1";
Debug.ShouldStop(32768);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1521;BA.debugLine="Exit";
Debug.ShouldStop(65536);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1524;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1525;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblFaktor A";
Debug.ShouldStop(1048576);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblFaktor ADD FldDarsadTakhfif Text")));
 BA.debugLineNum = 1526;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(2097152);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 1527;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(4194304);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 BA.debugLineNum = 1528;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblFaktor Set Fl";
Debug.ShouldStop(8388608);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Update TblFaktor Set FldDarsadTakhfif='0'")));
 };
 BA.debugLineNum = 1530;BA.debugLine="Check=0";
Debug.ShouldStop(33554432);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1531;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblFaktor";
Debug.ShouldStop(67108864);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblFaktor"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 1532;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(134217728);
{
final int step146 = 1;
final int limit146 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step146 > 0 && _i <= limit146) || (step146 < 0 && _i >= limit146) ;_i = ((int)(0 + _i + step146))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1533;BA.debugLine="If  Cur.GetColumnName(i)=\"FldSumMablaghTakhfifVi";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldSumMablaghTakhfifVizhe"))) { 
 BA.debugLineNum = 1534;BA.debugLine="Check=1";
Debug.ShouldStop(536870912);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1535;BA.debugLine="Exit";
Debug.ShouldStop(1073741824);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1538;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1539;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblFaktor A";
Debug.ShouldStop(4);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblFaktor ADD FldSumMablaghTakhfifVizhe Text")));
 BA.debugLineNum = 1540;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(8);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 1541;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(16);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 1544;BA.debugLine="Check=0";
Debug.ShouldStop(128);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1545;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblFaktor";
Debug.ShouldStop(256);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblFaktor"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 1546;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(512);
{
final int step159 = 1;
final int limit159 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step159 > 0 && _i <= limit159) || (step159 < 0 && _i >= limit159) ;_i = ((int)(0 + _i + step159))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1547;BA.debugLine="If  Cur.GetColumnName(i)=\"FldSumMablaghTakhfifKa";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldSumMablaghTakhfifKala"))) { 
 BA.debugLineNum = 1548;BA.debugLine="Check=1";
Debug.ShouldStop(2048);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1549;BA.debugLine="Exit";
Debug.ShouldStop(4096);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1552;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1553;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblFaktor A";
Debug.ShouldStop(65536);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblFaktor ADD FldSumMablaghTakhfifKala Text")));
 BA.debugLineNum = 1554;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(131072);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 1555;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(262144);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 1558;BA.debugLine="Check=0";
Debug.ShouldStop(2097152);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1559;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblFaktor";
Debug.ShouldStop(4194304);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblFaktor"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 1560;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(8388608);
{
final int step172 = 1;
final int limit172 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step172 > 0 && _i <= limit172) || (step172 < 0 && _i >= limit172) ;_i = ((int)(0 + _i + step172))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1561;BA.debugLine="If  Cur.GetColumnName(i)=\"FldDate\" Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldDate"))) { 
 BA.debugLineNum = 1562;BA.debugLine="Check=1";
Debug.ShouldStop(33554432);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1563;BA.debugLine="Exit";
Debug.ShouldStop(67108864);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1566;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1567;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblFaktor A";
Debug.ShouldStop(1073741824);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblFaktor ADD FldDate Text")));
 BA.debugLineNum = 1568;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(-2147483648);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 1569;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(1);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 1572;BA.debugLine="Check=0";
Debug.ShouldStop(8);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1573;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblFaktor";
Debug.ShouldStop(16);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblFaktor"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 1574;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(32);
{
final int step185 = 1;
final int limit185 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step185 > 0 && _i <= limit185) || (step185 < 0 && _i >= limit185) ;_i = ((int)(0 + _i + step185))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1575;BA.debugLine="If  Cur.GetColumnName(i)=\"FldTime\" Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldTime"))) { 
 BA.debugLineNum = 1576;BA.debugLine="Check=1";
Debug.ShouldStop(128);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1577;BA.debugLine="Exit";
Debug.ShouldStop(256);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1580;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1581;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblFaktor A";
Debug.ShouldStop(4096);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblFaktor ADD FldTime Text")));
 BA.debugLineNum = 1582;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(8192);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 1583;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(16384);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 1586;BA.debugLine="Check=0";
Debug.ShouldStop(131072);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1587;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblFaktor";
Debug.ShouldStop(262144);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblFaktor"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 1588;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(524288);
{
final int step198 = 1;
final int limit198 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step198 > 0 && _i <= limit198) || (step198 < 0 && _i >= limit198) ;_i = ((int)(0 + _i + step198))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1589;BA.debugLine="If  Cur.GetColumnName(i)=\"FldTotalFaktor\" Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldTotalFaktor"))) { 
 BA.debugLineNum = 1590;BA.debugLine="Check=1";
Debug.ShouldStop(2097152);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1591;BA.debugLine="Exit";
Debug.ShouldStop(4194304);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1594;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1595;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblFaktor A";
Debug.ShouldStop(67108864);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblFaktor ADD FldTotalFaktor Text")));
 BA.debugLineNum = 1596;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(134217728);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 1597;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(268435456);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 1600;BA.debugLine="Check=0";
Debug.ShouldStop(-2147483648);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1601;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblFaktor";
Debug.ShouldStop(1);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblFaktor"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 1602;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(2);
{
final int step211 = 1;
final int limit211 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step211 > 0 && _i <= limit211) || (step211 < 0 && _i >= limit211) ;_i = ((int)(0 + _i + step211))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1603;BA.debugLine="If  Cur.GetColumnName(i)=\"FldSumMande\" Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldSumMande"))) { 
 BA.debugLineNum = 1604;BA.debugLine="Check=1";
Debug.ShouldStop(8);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1605;BA.debugLine="Exit";
Debug.ShouldStop(16);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1608;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1609;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblFaktor A";
Debug.ShouldStop(256);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblFaktor ADD FldSumMande Text")));
 BA.debugLineNum = 1610;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(512);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 1611;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(1024);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 1614;BA.debugLine="Check=0";
Debug.ShouldStop(8192);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1615;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblFaktor";
Debug.ShouldStop(16384);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblFaktor"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 1616;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(32768);
{
final int step224 = 1;
final int limit224 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step224 > 0 && _i <= limit224) || (step224 < 0 && _i >= limit224) ;_i = ((int)(0 + _i + step224))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1617;BA.debugLine="If  Cur.GetColumnName(i)=\"FldSync\" Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldSync"))) { 
 BA.debugLineNum = 1618;BA.debugLine="Check=1";
Debug.ShouldStop(131072);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1619;BA.debugLine="Exit";
Debug.ShouldStop(262144);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1622;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1623;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblFaktor A";
Debug.ShouldStop(4194304);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblFaktor ADD FldSync Text")));
 BA.debugLineNum = 1624;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(8388608);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 1625;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(16777216);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 1628;BA.debugLine="Check=0";
Debug.ShouldStop(134217728);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1629;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblFaktor";
Debug.ShouldStop(268435456);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblFaktor"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 1630;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(536870912);
{
final int step237 = 1;
final int limit237 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step237 > 0 && _i <= limit237) || (step237 < 0 && _i >= limit237) ;_i = ((int)(0 + _i + step237))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1631;BA.debugLine="If  Cur.GetColumnName(i)=\"fldPathPicOffline\" The";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("fldPathPicOffline"))) { 
 BA.debugLineNum = 1632;BA.debugLine="Check=1";
Debug.ShouldStop(-2147483648);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1633;BA.debugLine="Exit";
Debug.ShouldStop(1);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1636;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1637;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblFaktor AD";
Debug.ShouldStop(16);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblFaktor ADD fldPathPicOffline Text")));
 BA.debugLineNum = 1638;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(32);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 1639;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(64);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 1642;BA.debugLine="Check=0";
Debug.ShouldStop(512);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1643;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblFaktor";
Debug.ShouldStop(1024);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblFaktor"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 1644;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(2048);
{
final int step250 = 1;
final int limit250 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step250 > 0 && _i <= limit250) || (step250 < 0 && _i >= limit250) ;_i = ((int)(0 + _i + step250))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1645;BA.debugLine="If  Cur.GetColumnName(i)=\"fldPathPic\" Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("fldPathPic"))) { 
 BA.debugLineNum = 1646;BA.debugLine="Check=1";
Debug.ShouldStop(8192);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1647;BA.debugLine="Exit";
Debug.ShouldStop(16384);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1650;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1651;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblFaktor A";
Debug.ShouldStop(262144);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblFaktor ADD fldPathPic Text")));
 BA.debugLineNum = 1652;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(524288);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 1653;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(1048576);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 1656;BA.debugLine="Check=0";
Debug.ShouldStop(8388608);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1658;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblFaktor";
Debug.ShouldStop(33554432);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblFaktor"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 1659;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(67108864);
{
final int step263 = 1;
final int limit263 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step263 > 0 && _i <= limit263) || (step263 < 0 && _i >= limit263) ;_i = ((int)(0 + _i + step263))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1660;BA.debugLine="If  Cur.GetColumnName(i)=\"FldMablaghTakhfifKol\"";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldMablaghTakhfifKol"))) { 
 BA.debugLineNum = 1661;BA.debugLine="Check=1";
Debug.ShouldStop(268435456);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1662;BA.debugLine="Exit";
Debug.ShouldStop(536870912);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1665;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1666;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblFaktor A";
Debug.ShouldStop(2);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblFaktor ADD FldMablaghTakhfifKol Text")));
 BA.debugLineNum = 1667;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(4);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 1668;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(8);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 1671;BA.debugLine="Check=0";
Debug.ShouldStop(64);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1673;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblFaktor";
Debug.ShouldStop(256);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblFaktor"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 1674;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(512);
{
final int step276 = 1;
final int limit276 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step276 > 0 && _i <= limit276) || (step276 < 0 && _i >= limit276) ;_i = ((int)(0 + _i + step276))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1675;BA.debugLine="If  Cur.GetColumnName(i)=\"FldMablaghKol\" Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldMablaghKol"))) { 
 BA.debugLineNum = 1676;BA.debugLine="Check=1";
Debug.ShouldStop(2048);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1677;BA.debugLine="Exit";
Debug.ShouldStop(4096);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1680;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1681;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblFaktor A";
Debug.ShouldStop(65536);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblFaktor ADD FldMablaghKol Text")));
 BA.debugLineNum = 1682;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(131072);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 1683;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(262144);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 1686;BA.debugLine="Check=0";
Debug.ShouldStop(2097152);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1688;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblFaktor";
Debug.ShouldStop(8388608);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblFaktor"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 1689;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(16777216);
{
final int step289 = 1;
final int limit289 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step289 > 0 && _i <= limit289) || (step289 < 0 && _i >= limit289) ;_i = ((int)(0 + _i + step289))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1690;BA.debugLine="If  Cur.GetColumnName(i)=\"WIsBacked\" Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("WIsBacked"))) { 
 BA.debugLineNum = 1691;BA.debugLine="Check=1";
Debug.ShouldStop(67108864);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1692;BA.debugLine="Exit";
Debug.ShouldStop(134217728);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1695;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1696;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblFaktor A";
Debug.ShouldStop(-2147483648);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblFaktor ADD WIsBacked Text")));
 BA.debugLineNum = 1697;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(1);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 1698;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(2);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 1701;BA.debugLine="Check=0";
Debug.ShouldStop(16);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1702;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblFaktor";
Debug.ShouldStop(32);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblFaktor"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 1703;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(64);
{
final int step302 = 1;
final int limit302 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step302 > 0 && _i <= limit302) || (step302 < 0 && _i >= limit302) ;_i = ((int)(0 + _i + step302))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1704;BA.debugLine="If  Cur.GetColumnName(i)=\"WSendFrom\" Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("WSendFrom"))) { 
 BA.debugLineNum = 1705;BA.debugLine="Check=1";
Debug.ShouldStop(256);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1706;BA.debugLine="Exit";
Debug.ShouldStop(512);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1709;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1710;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblFaktor A";
Debug.ShouldStop(8192);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblFaktor ADD WSendFrom Text")));
 BA.debugLineNum = 1711;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(16384);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 1712;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(32768);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 1715;BA.debugLine="Check=0";
Debug.ShouldStop(262144);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1716;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblFaktor";
Debug.ShouldStop(524288);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblFaktor"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 1717;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(1048576);
{
final int step315 = 1;
final int limit315 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step315 > 0 && _i <= limit315) || (step315 < 0 && _i >= limit315) ;_i = ((int)(0 + _i + step315))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1718;BA.debugLine="If  Cur.GetColumnName(i)=\"FldAmani\" Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldAmani"))) { 
 BA.debugLineNum = 1719;BA.debugLine="Check=1";
Debug.ShouldStop(4194304);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1720;BA.debugLine="Exit";
Debug.ShouldStop(8388608);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1723;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1724;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblFaktor A";
Debug.ShouldStop(134217728);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblFaktor ADD FldAmani Text")));
 BA.debugLineNum = 1725;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(268435456);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 1726;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(536870912);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 BA.debugLineNum = 1727;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblFaktor Set Fl";
Debug.ShouldStop(1073741824);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Update TblFaktor Set FldAmani='0'")));
 };
 BA.debugLineNum = 1730;BA.debugLine="Check=0";
Debug.ShouldStop(2);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1731;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblFaktor";
Debug.ShouldStop(4);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblFaktor"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 1732;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(8);
{
final int step329 = 1;
final int limit329 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step329 > 0 && _i <= limit329) || (step329 < 0 && _i >= limit329) ;_i = ((int)(0 + _i + step329))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1733;BA.debugLine="If  Cur.GetColumnName(i)=\"fldShomareFactorReal\"";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("fldShomareFactorReal"))) { 
 BA.debugLineNum = 1734;BA.debugLine="Check=1";
Debug.ShouldStop(32);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1735;BA.debugLine="Exit";
Debug.ShouldStop(64);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1738;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1739;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblFaktor A";
Debug.ShouldStop(1024);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblFaktor ADD fldShomareFactorReal Text")));
 BA.debugLineNum = 1740;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(2048);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 1741;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(4096);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 BA.debugLineNum = 1742;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblFaktor Set fl";
Debug.ShouldStop(8192);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Update TblFaktor Set fldShomareFactorReal='0'")));
 };
 BA.debugLineNum = 1745;BA.debugLine="Check=0";
Debug.ShouldStop(65536);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1746;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblFaktor";
Debug.ShouldStop(131072);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblFaktor"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 1747;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(262144);
{
final int step343 = 1;
final int limit343 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step343 > 0 && _i <= limit343) || (step343 < 0 && _i >= limit343) ;_i = ((int)(0 + _i + step343))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1748;BA.debugLine="If  Cur.GetColumnName(i)=\"FldSignatureBitmapStri";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldSignatureBitmapString"))) { 
 BA.debugLineNum = 1749;BA.debugLine="Check=1";
Debug.ShouldStop(1048576);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1750;BA.debugLine="Exit";
Debug.ShouldStop(2097152);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1753;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1754;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblFaktor A";
Debug.ShouldStop(33554432);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblFaktor ADD FldSignatureBitmapString Text")));
 BA.debugLineNum = 1755;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(67108864);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 1756;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(134217728);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 1759;BA.debugLine="Check=0";
Debug.ShouldStop(1073741824);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1760;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblFaktor";
Debug.ShouldStop(-2147483648);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblFaktor"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 1761;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(1);
{
final int step356 = 1;
final int limit356 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step356 > 0 && _i <= limit356) || (step356 < 0 && _i >= limit356) ;_i = ((int)(0 + _i + step356))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1762;BA.debugLine="If  Cur.GetColumnName(i)=\"fldFeeBadAzTakhfif\" Th";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("fldFeeBadAzTakhfif"))) { 
 BA.debugLineNum = 1763;BA.debugLine="Check=1";
Debug.ShouldStop(4);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1764;BA.debugLine="Exit";
Debug.ShouldStop(8);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1767;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1768;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblFaktor A";
Debug.ShouldStop(128);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblFaktor ADD fldFeeBadAzTakhfif Text")));
 BA.debugLineNum = 1769;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(256);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 1770;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(512);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 1773;BA.debugLine="Check=0";
Debug.ShouldStop(4096);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1774;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblFaktor";
Debug.ShouldStop(8192);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblFaktor"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 1775;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(16384);
{
final int step369 = 1;
final int limit369 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step369 > 0 && _i <= limit369) || (step369 < 0 && _i >= limit369) ;_i = ((int)(0 + _i + step369))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1776;BA.debugLine="If  Cur.GetColumnName(i)=\"FldNameVahed\" Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldNameVahed"))) { 
 BA.debugLineNum = 1777;BA.debugLine="Check=1";
Debug.ShouldStop(65536);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1778;BA.debugLine="Exit";
Debug.ShouldStop(131072);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1781;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1782;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblFaktor A";
Debug.ShouldStop(2097152);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblFaktor ADD FldNameVahed Text")));
 BA.debugLineNum = 1783;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(4194304);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 1784;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(8388608);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 1787;BA.debugLine="Check=0";
Debug.ShouldStop(67108864);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1788;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblFaktor";
Debug.ShouldStop(134217728);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblFaktor"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 1789;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(268435456);
{
final int step382 = 1;
final int limit382 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step382 > 0 && _i <= limit382) || (step382 < 0 && _i >= limit382) ;_i = ((int)(0 + _i + step382))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1790;BA.debugLine="If  Cur.GetColumnName(i)=\"FldNameVahed2\" Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldNameVahed2"))) { 
 BA.debugLineNum = 1791;BA.debugLine="Check=1";
Debug.ShouldStop(1073741824);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1792;BA.debugLine="Exit";
Debug.ShouldStop(-2147483648);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1795;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1796;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblFaktor A";
Debug.ShouldStop(8);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblFaktor ADD FldNameVahed2 Text")));
 BA.debugLineNum = 1797;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(16);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 1798;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(32);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 1800;BA.debugLine="Check=0";
Debug.ShouldStop(128);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1801;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblFaktor";
Debug.ShouldStop(256);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblFaktor"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 1802;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(512);
{
final int step395 = 1;
final int limit395 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step395 > 0 && _i <= limit395) || (step395 < 0 && _i >= limit395) ;_i = ((int)(0 + _i + step395))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1803;BA.debugLine="If  Cur.GetColumnName(i)=\"fldShomareForoosh\" The";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("fldShomareForoosh"))) { 
 BA.debugLineNum = 1804;BA.debugLine="Check=1";
Debug.ShouldStop(2048);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1805;BA.debugLine="Exit";
Debug.ShouldStop(4096);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1808;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1809;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblFaktor A";
Debug.ShouldStop(65536);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblFaktor ADD fldShomareForoosh Text")));
 BA.debugLineNum = 1810;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(131072);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 1811;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(262144);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 BA.debugLineNum = 1812;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblFaktor Set fl";
Debug.ShouldStop(524288);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Update TblFaktor Set fldShomareForoosh='0'")));
 };
 BA.debugLineNum = 1815;BA.debugLine="Check=0";
Debug.ShouldStop(4194304);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1816;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblFaktor";
Debug.ShouldStop(8388608);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblFaktor"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 1817;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(16777216);
{
final int step409 = 1;
final int limit409 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step409 > 0 && _i <= limit409) || (step409 < 0 && _i >= limit409) ;_i = ((int)(0 + _i + step409))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1818;BA.debugLine="If  Cur.GetColumnName(i)=\"FldShomareBargasht\" Th";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldShomareBargasht"))) { 
 BA.debugLineNum = 1819;BA.debugLine="Check=1";
Debug.ShouldStop(67108864);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1820;BA.debugLine="Exit";
Debug.ShouldStop(134217728);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1823;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1824;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblFaktor A";
Debug.ShouldStop(-2147483648);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblFaktor ADD FldShomareBargasht Text")));
 BA.debugLineNum = 1825;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(1);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 1826;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(2);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 1828;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updatedatabasegpsvisitor(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("UpdateDataBaseGpsVisitor (mdatabase) ","mdatabase",5,_ba,mdatabase.mostCurrent,1894);
if (RapidSub.canDelegate("updatedatabasegpsvisitor")) { return ir.parsikhesab.pakhsh.mdatabase.remoteMe.runUserSub(false, "mdatabase","updatedatabasegpsvisitor", _ba);}
RemoteObject _check = RemoteObject.createImmutable(0);
RemoteObject _cur = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
;
 BA.debugLineNum = 1894;BA.debugLine="Sub UpdateDataBaseGpsVisitor";
Debug.ShouldStop(32);
 BA.debugLineNum = 1895;BA.debugLine="Dim Check As Int";
Debug.ShouldStop(64);
_check = RemoteObject.createImmutable(0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1896;BA.debugLine="Dim Cur As Cursor";
Debug.ShouldStop(128);
_cur = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 1898;BA.debugLine="Check=0";
Debug.ShouldStop(512);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1899;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblGpsVis";
Debug.ShouldStop(1024);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblGpsVisitor"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 1900;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(2048);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1901;BA.debugLine="If  Cur.GetColumnName(i)=\"FldVaziat\" Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldVaziat"))) { 
 BA.debugLineNum = 1902;BA.debugLine="Check=1";
Debug.ShouldStop(8192);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1903;BA.debugLine="Exit";
Debug.ShouldStop(16384);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1906;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1907;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblGpsVisit";
Debug.ShouldStop(262144);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblGpsVisitor ADD FldVaziat Text")));
 BA.debugLineNum = 1908;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(524288);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 1909;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(1048576);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 1911;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updatedatabasehavale(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("UpdateDataBaseHavale (mdatabase) ","mdatabase",5,_ba,mdatabase.mostCurrent,1913);
if (RapidSub.canDelegate("updatedatabasehavale")) { return ir.parsikhesab.pakhsh.mdatabase.remoteMe.runUserSub(false, "mdatabase","updatedatabasehavale", _ba);}
RemoteObject _check = RemoteObject.createImmutable(0);
RemoteObject _cur = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
;
 BA.debugLineNum = 1913;BA.debugLine="Sub UpdateDataBaseHavale";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 1914;BA.debugLine="Dim Check As Int";
Debug.ShouldStop(33554432);
_check = RemoteObject.createImmutable(0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1915;BA.debugLine="Dim Cur As Cursor";
Debug.ShouldStop(67108864);
_cur = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 1917;BA.debugLine="Check=0";
Debug.ShouldStop(268435456);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1918;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblHavale";
Debug.ShouldStop(536870912);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblHavale"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 1919;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(1073741824);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1920;BA.debugLine="If  Cur.GetColumnName(i)=\"fldMande\" Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("fldMande"))) { 
 BA.debugLineNum = 1921;BA.debugLine="Check=1";
Debug.ShouldStop(1);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1922;BA.debugLine="Exit";
Debug.ShouldStop(2);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1925;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1926;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblHavale A";
Debug.ShouldStop(32);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblHavale ADD fldMande Text")));
 BA.debugLineNum = 1927;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(64);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 1928;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(128);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 1930;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updatedatabasekala(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("UpdateDataBaseKala (mdatabase) ","mdatabase",5,_ba,mdatabase.mostCurrent,905);
if (RapidSub.canDelegate("updatedatabasekala")) { return ir.parsikhesab.pakhsh.mdatabase.remoteMe.runUserSub(false, "mdatabase","updatedatabasekala", _ba);}
RemoteObject _check = RemoteObject.createImmutable(0);
RemoteObject _cur = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
;
 BA.debugLineNum = 905;BA.debugLine="Sub UpdateDataBaseKala";
Debug.ShouldStop(256);
 BA.debugLineNum = 906;BA.debugLine="Dim Check As Int";
Debug.ShouldStop(512);
_check = RemoteObject.createImmutable(0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 907;BA.debugLine="Dim Cur As Cursor";
Debug.ShouldStop(1024);
_cur = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 909;BA.debugLine="Check=0";
Debug.ShouldStop(4096);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 910;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblKala\")";
Debug.ShouldStop(8192);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblKala"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 911;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(16384);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 912;BA.debugLine="If  Cur.GetColumnName(i)=\"FldDateUpdate\" Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldDateUpdate"))) { 
 BA.debugLineNum = 913;BA.debugLine="Check=1";
Debug.ShouldStop(65536);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 914;BA.debugLine="Exit";
Debug.ShouldStop(131072);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 917;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 918;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblKala ADD";
Debug.ShouldStop(2097152);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblKala ADD FldDateUpdate Text")));
 BA.debugLineNum = 919;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(4194304);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 920;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(8388608);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 BA.debugLineNum = 921;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblKala Set FldD";
Debug.ShouldStop(16777216);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Update TblKala Set FldDateUpdate='0'")));
 };
 BA.debugLineNum = 924;BA.debugLine="Check=0";
Debug.ShouldStop(134217728);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 925;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblKala\")";
Debug.ShouldStop(268435456);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblKala"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 926;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(536870912);
{
final int step19 = 1;
final int limit19 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step19 > 0 && _i <= limit19) || (step19 < 0 && _i >= limit19) ;_i = ((int)(0 + _i + step19))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 927;BA.debugLine="If  Cur.GetColumnName(i)=\"fldCodeGroup\" Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("fldCodeGroup"))) { 
 BA.debugLineNum = 928;BA.debugLine="Check=1";
Debug.ShouldStop(-2147483648);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 929;BA.debugLine="Exit";
Debug.ShouldStop(1);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 932;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 933;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblKala ADD";
Debug.ShouldStop(16);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblKala ADD fldCodeGroup Text")));
 BA.debugLineNum = 934;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(32);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 935;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(64);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 937;BA.debugLine="Check=0";
Debug.ShouldStop(256);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 938;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblKala\")";
Debug.ShouldStop(512);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblKala"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 939;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(1024);
{
final int step32 = 1;
final int limit32 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step32 > 0 && _i <= limit32) || (step32 < 0 && _i >= limit32) ;_i = ((int)(0 + _i + step32))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 940;BA.debugLine="If  Cur.GetColumnName(i)=\"fldPathPic\" Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("fldPathPic"))) { 
 BA.debugLineNum = 941;BA.debugLine="Check=1";
Debug.ShouldStop(4096);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 942;BA.debugLine="Exit";
Debug.ShouldStop(8192);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 945;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 946;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblKala ADD";
Debug.ShouldStop(131072);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblKala ADD fldPathPic Text")));
 BA.debugLineNum = 947;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(262144);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 948;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(524288);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 951;BA.debugLine="Check=0";
Debug.ShouldStop(4194304);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 952;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblKala\")";
Debug.ShouldStop(8388608);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblKala"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 953;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(16777216);
{
final int step45 = 1;
final int limit45 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step45 > 0 && _i <= limit45) || (step45 < 0 && _i >= limit45) ;_i = ((int)(0 + _i + step45))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 954;BA.debugLine="If  Cur.GetColumnName(i)=\"fldPathPicOffline\" The";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("fldPathPicOffline"))) { 
 BA.debugLineNum = 955;BA.debugLine="Check=1";
Debug.ShouldStop(67108864);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 956;BA.debugLine="Exit";
Debug.ShouldStop(134217728);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 959;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 960;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblKala ADD";
Debug.ShouldStop(-2147483648);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblKala ADD fldPathPicOffline Text")));
 BA.debugLineNum = 961;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(1);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 962;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(2);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 965;BA.debugLine="Check=0";
Debug.ShouldStop(16);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 966;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblKala\")";
Debug.ShouldStop(32);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblKala"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 967;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(64);
{
final int step58 = 1;
final int limit58 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step58 > 0 && _i <= limit58) || (step58 < 0 && _i >= limit58) ;_i = ((int)(0 + _i + step58))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 968;BA.debugLine="If  Cur.GetColumnName(i)=\"fldFeeBadAzTakhfif\" Th";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("fldFeeBadAzTakhfif"))) { 
 BA.debugLineNum = 969;BA.debugLine="Check=1";
Debug.ShouldStop(256);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 970;BA.debugLine="Exit";
Debug.ShouldStop(512);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 973;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 974;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblKala ADD";
Debug.ShouldStop(8192);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblKala ADD fldFeeBadAzTakhfif Text")));
 BA.debugLineNum = 975;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(16384);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 976;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(32768);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 979;BA.debugLine="Check=0";
Debug.ShouldStop(262144);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 980;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblKala\")";
Debug.ShouldStop(524288);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblKala"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 981;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(1048576);
{
final int step71 = 1;
final int limit71 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step71 > 0 && _i <= limit71) || (step71 < 0 && _i >= limit71) ;_i = ((int)(0 + _i + step71))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 982;BA.debugLine="If  Cur.GetColumnName(i)=\"fldSerial\" Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("fldSerial"))) { 
 BA.debugLineNum = 983;BA.debugLine="Check=1";
Debug.ShouldStop(4194304);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 984;BA.debugLine="Exit";
Debug.ShouldStop(8388608);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 987;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 988;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblKala ADD";
Debug.ShouldStop(134217728);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblKala ADD fldSerial Text")));
 BA.debugLineNum = 989;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(268435456);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 990;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(536870912);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 993;BA.debugLine="Check=0";
Debug.ShouldStop(1);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 994;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblKala\")";
Debug.ShouldStop(2);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblKala"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 995;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(4);
{
final int step84 = 1;
final int limit84 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step84 > 0 && _i <= limit84) || (step84 < 0 && _i >= limit84) ;_i = ((int)(0 + _i + step84))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 996;BA.debugLine="If  Cur.GetColumnName(i)=\"fldSharh\" Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("fldSharh"))) { 
 BA.debugLineNum = 997;BA.debugLine="Check=1";
Debug.ShouldStop(16);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 998;BA.debugLine="Exit";
Debug.ShouldStop(32);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1001;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1002;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblKala ADD";
Debug.ShouldStop(512);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblKala ADD fldSharh Text")));
 BA.debugLineNum = 1003;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(1024);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 1004;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(2048);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 1007;BA.debugLine="Check=0";
Debug.ShouldStop(16384);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1008;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblKala\")";
Debug.ShouldStop(32768);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblKala"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 1009;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(65536);
{
final int step97 = 1;
final int limit97 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step97 > 0 && _i <= limit97) || (step97 < 0 && _i >= limit97) ;_i = ((int)(0 + _i + step97))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1010;BA.debugLine="If  Cur.GetColumnName(i)=\"FldMablaghTakhfif\" The";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldMablaghTakhfif"))) { 
 BA.debugLineNum = 1011;BA.debugLine="Check=1";
Debug.ShouldStop(262144);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1012;BA.debugLine="Exit";
Debug.ShouldStop(524288);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1015;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1016;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblKala ADD";
Debug.ShouldStop(8388608);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblKala ADD FldMablaghTakhfif Text")));
 BA.debugLineNum = 1017;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(16777216);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 1018;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(33554432);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 1021;BA.debugLine="Check=0";
Debug.ShouldStop(268435456);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1022;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblKala\")";
Debug.ShouldStop(536870912);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblKala"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 1023;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(1073741824);
{
final int step110 = 1;
final int limit110 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step110 > 0 && _i <= limit110) || (step110 < 0 && _i >= limit110) ;_i = ((int)(0 + _i + step110))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1024;BA.debugLine="If  Cur.GetColumnName(i)=\"fldFeeTasvie\" Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("fldFeeTasvie"))) { 
 BA.debugLineNum = 1025;BA.debugLine="Check=1";
Debug.ShouldStop(1);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1026;BA.debugLine="Exit";
Debug.ShouldStop(2);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1029;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1030;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblKala ADD";
Debug.ShouldStop(32);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblKala ADD fldFeeTasvie Text")));
 BA.debugLineNum = 1031;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(64);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 1032;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(128);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 1034;BA.debugLine="Check=0";
Debug.ShouldStop(512);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1037;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblKala\")";
Debug.ShouldStop(4096);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblKala"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 1038;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(8192);
{
final int step123 = 1;
final int limit123 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step123 > 0 && _i <= limit123) || (step123 < 0 && _i >= limit123) ;_i = ((int)(0 + _i + step123))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1039;BA.debugLine="If  Cur.GetColumnName(i)=\"fldArzeshAfzode\" Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("fldArzeshAfzode"))) { 
 BA.debugLineNum = 1040;BA.debugLine="Check=1";
Debug.ShouldStop(32768);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1041;BA.debugLine="Exit";
Debug.ShouldStop(65536);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1044;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1045;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblKala ADD";
Debug.ShouldStop(1048576);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblKala ADD fldArzeshAfzode Text")));
 BA.debugLineNum = 1046;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(2097152);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 1047;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(4194304);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 1050;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updatedatabasesabad(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("UpdateDataBaseSabad (mdatabase) ","mdatabase",5,_ba,mdatabase.mostCurrent,1133);
if (RapidSub.canDelegate("updatedatabasesabad")) { return ir.parsikhesab.pakhsh.mdatabase.remoteMe.runUserSub(false, "mdatabase","updatedatabasesabad", _ba);}
RemoteObject _check = RemoteObject.createImmutable(0);
RemoteObject _cur = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
;
 BA.debugLineNum = 1133;BA.debugLine="Sub UpdateDataBaseSabad";
Debug.ShouldStop(4096);
 BA.debugLineNum = 1134;BA.debugLine="Dim Check As Int";
Debug.ShouldStop(8192);
_check = RemoteObject.createImmutable(0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1135;BA.debugLine="Dim Cur As Cursor";
Debug.ShouldStop(16384);
_cur = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 1137;BA.debugLine="Check=0";
Debug.ShouldStop(65536);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1138;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSabad\"";
Debug.ShouldStop(131072);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblSabad"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 1139;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(262144);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1140;BA.debugLine="If  Cur.GetColumnName(i)=\"FldTozihat\" Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldTozihat"))) { 
 BA.debugLineNum = 1141;BA.debugLine="Check=1";
Debug.ShouldStop(1048576);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1142;BA.debugLine="Exit";
Debug.ShouldStop(2097152);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1145;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1146;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSabad AD";
Debug.ShouldStop(33554432);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblSabad ADD FldTozihat varchar")));
 BA.debugLineNum = 1147;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(67108864);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 1148;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(134217728);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 1151;BA.debugLine="Check=0";
Debug.ShouldStop(1073741824);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1152;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSabad\"";
Debug.ShouldStop(-2147483648);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblSabad"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 1153;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(1);
{
final int step18 = 1;
final int limit18 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step18 > 0 && _i <= limit18) || (step18 < 0 && _i >= limit18) ;_i = ((int)(0 + _i + step18))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1154;BA.debugLine="If  Cur.GetColumnName(i)=\"FldVaziatPardakht\" The";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldVaziatPardakht"))) { 
 BA.debugLineNum = 1155;BA.debugLine="Check=1";
Debug.ShouldStop(4);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1156;BA.debugLine="Exit";
Debug.ShouldStop(8);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1159;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1160;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSabad AD";
Debug.ShouldStop(128);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblSabad ADD FldVaziatPardakht varchar")));
 BA.debugLineNum = 1161;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(256);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 1162;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(512);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 1165;BA.debugLine="Check=0";
Debug.ShouldStop(4096);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1166;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(8192);
{
final int step30 = 1;
final int limit30 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step30 > 0 && _i <= limit30) || (step30 < 0 && _i >= limit30) ;_i = ((int)(0 + _i + step30))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1167;BA.debugLine="If  Cur.GetColumnName(i)=\"FldMablaghMasrafKonand";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldMablaghMasrafKonande"))) { 
 BA.debugLineNum = 1168;BA.debugLine="Check=1";
Debug.ShouldStop(32768);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1169;BA.debugLine="Exit";
Debug.ShouldStop(65536);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1172;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1173;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSabad AD";
Debug.ShouldStop(1048576);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblSabad ADD FldMablaghMasrafKonande Text")));
 BA.debugLineNum = 1174;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(2097152);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 1175;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(4194304);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 1178;BA.debugLine="Check=0";
Debug.ShouldStop(33554432);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1179;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSabad\"";
Debug.ShouldStop(67108864);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblSabad"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 1180;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(134217728);
{
final int step43 = 1;
final int limit43 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step43 > 0 && _i <= limit43) || (step43 < 0 && _i >= limit43) ;_i = ((int)(0 + _i + step43))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1181;BA.debugLine="If  Cur.GetColumnName(i)=\"FldMablaghTakhfif\" The";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldMablaghTakhfif"))) { 
 BA.debugLineNum = 1182;BA.debugLine="Check=1";
Debug.ShouldStop(536870912);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1183;BA.debugLine="Exit";
Debug.ShouldStop(1073741824);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1186;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1187;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSabad AD";
Debug.ShouldStop(4);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblSabad ADD FldMablaghTakhfif Text")));
 BA.debugLineNum = 1188;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(8);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 1189;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(16);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 1192;BA.debugLine="Check=0";
Debug.ShouldStop(128);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1193;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSabad\"";
Debug.ShouldStop(256);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblSabad"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 1194;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(512);
{
final int step56 = 1;
final int limit56 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step56 > 0 && _i <= limit56) || (step56 < 0 && _i >= limit56) ;_i = ((int)(0 + _i + step56))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1195;BA.debugLine="If  Cur.GetColumnName(i)=\"FldDarsadTakhfif\" Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldDarsadTakhfif"))) { 
 BA.debugLineNum = 1196;BA.debugLine="Check=1";
Debug.ShouldStop(2048);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1197;BA.debugLine="Exit";
Debug.ShouldStop(4096);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1200;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1201;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSabad AD";
Debug.ShouldStop(65536);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblSabad ADD FldDarsadTakhfif Text")));
 BA.debugLineNum = 1202;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(131072);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 1203;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(262144);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 1206;BA.debugLine="Check=0";
Debug.ShouldStop(2097152);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1207;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSabad\"";
Debug.ShouldStop(4194304);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblSabad"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 1208;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(8388608);
{
final int step69 = 1;
final int limit69 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step69 > 0 && _i <= limit69) || (step69 < 0 && _i >= limit69) ;_i = ((int)(0 + _i + step69))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1209;BA.debugLine="If  Cur.GetColumnName(i)=\"FldupdateFee\" Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldupdateFee"))) { 
 BA.debugLineNum = 1210;BA.debugLine="Check=1";
Debug.ShouldStop(33554432);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1211;BA.debugLine="Exit";
Debug.ShouldStop(67108864);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1214;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1215;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSabad AD";
Debug.ShouldStop(1073741824);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblSabad ADD FldupdateFee Text")));
 BA.debugLineNum = 1216;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(-2147483648);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 1217;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(1);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 1220;BA.debugLine="Check=0";
Debug.ShouldStop(8);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1221;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSabad\"";
Debug.ShouldStop(16);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblSabad"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 1222;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(32);
{
final int step82 = 1;
final int limit82 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step82 > 0 && _i <= limit82) || (step82 < 0 && _i >= limit82) ;_i = ((int)(0 + _i + step82))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1223;BA.debugLine="If  Cur.GetColumnName(i)=\"fldFeeBadAzTakhfif\" Th";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("fldFeeBadAzTakhfif"))) { 
 BA.debugLineNum = 1224;BA.debugLine="Check=1";
Debug.ShouldStop(128);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1225;BA.debugLine="Exit";
Debug.ShouldStop(256);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1228;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1229;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSabad AD";
Debug.ShouldStop(4096);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblSabad ADD fldFeeBadAzTakhfif Text")));
 BA.debugLineNum = 1230;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(8192);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 1231;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(16384);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 1233;BA.debugLine="Check=0";
Debug.ShouldStop(65536);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1234;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSabad\"";
Debug.ShouldStop(131072);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblSabad"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 1235;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(262144);
{
final int step95 = 1;
final int limit95 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step95 > 0 && _i <= limit95) || (step95 < 0 && _i >= limit95) ;_i = ((int)(0 + _i + step95))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1236;BA.debugLine="If  Cur.GetColumnName(i)=\"fldPathPic\" Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("fldPathPic"))) { 
 BA.debugLineNum = 1237;BA.debugLine="Check=1";
Debug.ShouldStop(1048576);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1238;BA.debugLine="Exit";
Debug.ShouldStop(2097152);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1241;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1242;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSabad AD";
Debug.ShouldStop(33554432);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblSabad ADD fldPathPic Text")));
 BA.debugLineNum = 1243;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(67108864);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 1244;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(134217728);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 1247;BA.debugLine="Check=0";
Debug.ShouldStop(1073741824);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1248;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSabad\"";
Debug.ShouldStop(-2147483648);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblSabad"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 1249;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(1);
{
final int step108 = 1;
final int limit108 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step108 > 0 && _i <= limit108) || (step108 < 0 && _i >= limit108) ;_i = ((int)(0 + _i + step108))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1250;BA.debugLine="If  Cur.GetColumnName(i)=\"fldPathPicOffline\" The";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("fldPathPicOffline"))) { 
 BA.debugLineNum = 1251;BA.debugLine="Check=1";
Debug.ShouldStop(4);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1252;BA.debugLine="Exit";
Debug.ShouldStop(8);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1255;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1256;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSabad AD";
Debug.ShouldStop(128);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblSabad ADD fldPathPicOffline Text")));
 BA.debugLineNum = 1257;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(256);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 1258;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(512);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 1260;BA.debugLine="Check=0";
Debug.ShouldStop(2048);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1261;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSabad\"";
Debug.ShouldStop(4096);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblSabad"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 1262;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(8192);
{
final int step121 = 1;
final int limit121 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step121 > 0 && _i <= limit121) || (step121 < 0 && _i >= limit121) ;_i = ((int)(0 + _i + step121))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1263;BA.debugLine="If  Cur.GetColumnName(i)=\"fldSharh\" Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("fldSharh"))) { 
 BA.debugLineNum = 1264;BA.debugLine="Check=1";
Debug.ShouldStop(32768);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1265;BA.debugLine="Exit";
Debug.ShouldStop(65536);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1268;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1269;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSabad AD";
Debug.ShouldStop(1048576);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblSabad ADD fldSharh Text")));
 BA.debugLineNum = 1270;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(2097152);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 1271;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(4194304);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 1273;BA.debugLine="Check=0";
Debug.ShouldStop(16777216);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1274;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSabad\"";
Debug.ShouldStop(33554432);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblSabad"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 1275;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(67108864);
{
final int step134 = 1;
final int limit134 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step134 > 0 && _i <= limit134) || (step134 < 0 && _i >= limit134) ;_i = ((int)(0 + _i + step134))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1276;BA.debugLine="If  Cur.GetColumnName(i)=\"FldSumMande\" Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldSumMande"))) { 
 BA.debugLineNum = 1277;BA.debugLine="Check=1";
Debug.ShouldStop(268435456);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1278;BA.debugLine="Exit";
Debug.ShouldStop(536870912);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1281;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1282;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSabad AD";
Debug.ShouldStop(2);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblSabad ADD FldSumMande Text")));
 BA.debugLineNum = 1283;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(4);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 1284;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(8);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 1286;BA.debugLine="Check=0";
Debug.ShouldStop(32);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1287;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSabad\"";
Debug.ShouldStop(64);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblSabad"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 1288;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(128);
{
final int step147 = 1;
final int limit147 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step147 > 0 && _i <= limit147) || (step147 < 0 && _i >= limit147) ;_i = ((int)(0 + _i + step147))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1289;BA.debugLine="If  Cur.GetColumnName(i)=\"FldEshantion\" Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldEshantion"))) { 
 BA.debugLineNum = 1290;BA.debugLine="Check=1";
Debug.ShouldStop(512);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1291;BA.debugLine="Exit";
Debug.ShouldStop(1024);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1294;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1295;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSabad AD";
Debug.ShouldStop(16384);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblSabad ADD FldEshantion Text")));
 BA.debugLineNum = 1296;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(32768);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 1297;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(65536);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 1300;BA.debugLine="Check=0";
Debug.ShouldStop(524288);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1301;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSabad\"";
Debug.ShouldStop(1048576);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblSabad"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 1302;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(2097152);
{
final int step160 = 1;
final int limit160 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step160 > 0 && _i <= limit160) || (step160 < 0 && _i >= limit160) ;_i = ((int)(0 + _i + step160))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1303;BA.debugLine="If  Cur.GetColumnName(i)=\"fldCodeGroup\" Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("fldCodeGroup"))) { 
 BA.debugLineNum = 1304;BA.debugLine="Check=1";
Debug.ShouldStop(8388608);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1305;BA.debugLine="Exit";
Debug.ShouldStop(16777216);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1308;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1309;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSabad AD";
Debug.ShouldStop(268435456);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblSabad ADD fldCodeGroup Text")));
 BA.debugLineNum = 1310;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(536870912);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 1311;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(1073741824);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 1314;BA.debugLine="Check=0";
Debug.ShouldStop(2);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1315;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSabad\"";
Debug.ShouldStop(4);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblSabad"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 1316;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(8);
{
final int step173 = 1;
final int limit173 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step173 > 0 && _i <= limit173) || (step173 < 0 && _i >= limit173) ;_i = ((int)(0 + _i + step173))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1317;BA.debugLine="If  Cur.GetColumnName(i)=\"FldAmani\" Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldAmani"))) { 
 BA.debugLineNum = 1318;BA.debugLine="Check=1";
Debug.ShouldStop(32);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1319;BA.debugLine="Exit";
Debug.ShouldStop(64);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1322;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1323;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSabad AD";
Debug.ShouldStop(1024);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblSabad ADD FldAmani Text")));
 BA.debugLineNum = 1324;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(2048);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 1325;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(4096);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 1327;BA.debugLine="Check=0";
Debug.ShouldStop(16384);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1328;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSabad\"";
Debug.ShouldStop(32768);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblSabad"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 1329;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(65536);
{
final int step186 = 1;
final int limit186 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step186 > 0 && _i <= limit186) || (step186 < 0 && _i >= limit186) ;_i = ((int)(0 + _i + step186))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1330;BA.debugLine="If  Cur.GetColumnName(i)=\"fldShomareForoosh\" The";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("fldShomareForoosh"))) { 
 BA.debugLineNum = 1331;BA.debugLine="Check=1";
Debug.ShouldStop(262144);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1332;BA.debugLine="Exit";
Debug.ShouldStop(524288);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1335;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1336;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSabad AD";
Debug.ShouldStop(8388608);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblSabad ADD fldShomareForoosh Text")));
 BA.debugLineNum = 1337;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(16777216);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 1338;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(33554432);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 1341;BA.debugLine="Check=0";
Debug.ShouldStop(268435456);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1344;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSabad\"";
Debug.ShouldStop(-2147483648);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblSabad"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 1345;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(1);
{
final int step199 = 1;
final int limit199 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step199 > 0 && _i <= limit199) || (step199 < 0 && _i >= limit199) ;_i = ((int)(0 + _i + step199))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1346;BA.debugLine="If  Cur.GetColumnName(i)=\"fldDarsadArzeshAfzode\"";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("fldDarsadArzeshAfzode"))) { 
 BA.debugLineNum = 1347;BA.debugLine="Check=1";
Debug.ShouldStop(4);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1348;BA.debugLine="Exit";
Debug.ShouldStop(8);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1351;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1352;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSabad AD";
Debug.ShouldStop(128);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblSabad ADD fldDarsadArzeshAfzode Text")));
 BA.debugLineNum = 1353;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(256);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 1354;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(512);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 1356;BA.debugLine="Check=0";
Debug.ShouldStop(2048);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1359;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSabad\"";
Debug.ShouldStop(16384);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblSabad"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 1360;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(32768);
{
final int step212 = 1;
final int limit212 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step212 > 0 && _i <= limit212) || (step212 < 0 && _i >= limit212) ;_i = ((int)(0 + _i + step212))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1361;BA.debugLine="If  Cur.GetColumnName(i)=\"fldArzeshAfzode\" Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("fldArzeshAfzode"))) { 
 BA.debugLineNum = 1362;BA.debugLine="Check=1";
Debug.ShouldStop(131072);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1363;BA.debugLine="Exit";
Debug.ShouldStop(262144);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1366;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1367;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSabad AD";
Debug.ShouldStop(4194304);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblSabad ADD fldArzeshAfzode Text")));
 BA.debugLineNum = 1368;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(8388608);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 1369;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(16777216);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 1371;BA.debugLine="Check=0";
Debug.ShouldStop(67108864);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 1372;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updatedatabasesetting(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("UpdateDataBaseSetting (mdatabase) ","mdatabase",5,_ba,mdatabase.mostCurrent,217);
if (RapidSub.canDelegate("updatedatabasesetting")) { return ir.parsikhesab.pakhsh.mdatabase.remoteMe.runUserSub(false, "mdatabase","updatedatabasesetting", _ba);}
RemoteObject _check = RemoteObject.createImmutable(0);
RemoteObject _cur = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
;
 BA.debugLineNum = 217;BA.debugLine="Sub UpdateDataBaseSetting";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 218;BA.debugLine="Dim Check As Int";
Debug.ShouldStop(33554432);
_check = RemoteObject.createImmutable(0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 219;BA.debugLine="Dim Cur As Cursor";
Debug.ShouldStop(67108864);
_cur = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 221;BA.debugLine="Check=0";
Debug.ShouldStop(268435456);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 222;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
Debug.ShouldStop(536870912);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblSetting"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 223;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(1073741824);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 224;BA.debugLine="If  Cur.GetColumnName(i)=\"FldAshkhas\" Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldAshkhas"))) { 
 BA.debugLineNum = 225;BA.debugLine="Check=1";
Debug.ShouldStop(1);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 226;BA.debugLine="Exit";
Debug.ShouldStop(2);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 229;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 230;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
Debug.ShouldStop(32);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblSetting ADD FldAshkhas Text")));
 BA.debugLineNum = 231;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
Debug.ShouldStop(64);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblSetting ADD FldKala Text")));
 BA.debugLineNum = 232;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
Debug.ShouldStop(128);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblSetting ADD FldFee Text")));
 BA.debugLineNum = 233;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
Debug.ShouldStop(256);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblSetting ADD FldTasvie Text")));
 BA.debugLineNum = 234;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
Debug.ShouldStop(512);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblSetting ADD FldIntervalDownload Text")));
 BA.debugLineNum = 235;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(1024);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 236;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(2048);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 BA.debugLineNum = 237;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblSetting Set F";
Debug.ShouldStop(4096);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Update TblSetting Set FldAshkhas = '0', FldKala = '0', FldFee = '0', FldTasvie = '0', FldIntervalDownload = '0',FldDateUpdate='0'")));
 };
 BA.debugLineNum = 239;BA.debugLine="Check=0";
Debug.ShouldStop(16384);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 240;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
Debug.ShouldStop(32768);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblSetting"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 241;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(65536);
{
final int step23 = 1;
final int limit23 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step23 > 0 && _i <= limit23) || (step23 < 0 && _i >= limit23) ;_i = ((int)(0 + _i + step23))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 242;BA.debugLine="If  Cur.GetColumnName(i)=\"FldDateUpdate\" Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldDateUpdate"))) { 
 BA.debugLineNum = 243;BA.debugLine="Check=1";
Debug.ShouldStop(262144);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 244;BA.debugLine="Exit";
Debug.ShouldStop(524288);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 247;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 248;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
Debug.ShouldStop(8388608);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblSetting ADD FldDateUpdate Text")));
 BA.debugLineNum = 249;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(16777216);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 250;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(33554432);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 253;BA.debugLine="Check=0";
Debug.ShouldStop(268435456);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 254;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
Debug.ShouldStop(536870912);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblSetting"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 255;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(1073741824);
{
final int step36 = 1;
final int limit36 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step36 > 0 && _i <= limit36) || (step36 < 0 && _i >= limit36) ;_i = ((int)(0 + _i + step36))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 256;BA.debugLine="If  Cur.GetColumnName(i)=\"FldToken\" Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldToken"))) { 
 BA.debugLineNum = 257;BA.debugLine="Check=1";
Debug.ShouldStop(1);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 258;BA.debugLine="Exit";
Debug.ShouldStop(2);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 261;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 262;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
Debug.ShouldStop(32);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblSetting ADD FldToken Text")));
 BA.debugLineNum = 263;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(64);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 264;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(128);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 266;BA.debugLine="Check=0";
Debug.ShouldStop(512);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 267;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
Debug.ShouldStop(1024);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblSetting"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 268;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(2048);
{
final int step49 = 1;
final int limit49 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step49 > 0 && _i <= limit49) || (step49 < 0 && _i >= limit49) ;_i = ((int)(0 + _i + step49))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 269;BA.debugLine="If  Cur.GetColumnName(i)=\"FldDateTimeSend\" Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldDateTimeSend"))) { 
 BA.debugLineNum = 270;BA.debugLine="Check=1";
Debug.ShouldStop(8192);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 271;BA.debugLine="Exit";
Debug.ShouldStop(16384);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 274;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 275;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
Debug.ShouldStop(262144);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblSetting ADD FldDateTimeSend Text")));
 BA.debugLineNum = 276;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(524288);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 277;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(1048576);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 279;BA.debugLine="Check=0";
Debug.ShouldStop(4194304);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 280;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
Debug.ShouldStop(8388608);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblSetting"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 281;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(16777216);
{
final int step62 = 1;
final int limit62 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step62 > 0 && _i <= limit62) || (step62 < 0 && _i >= limit62) ;_i = ((int)(0 + _i + step62))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 282;BA.debugLine="If  Cur.GetColumnName(i)=\"FldSendFactor\" Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldSendFactor"))) { 
 BA.debugLineNum = 283;BA.debugLine="Check=1";
Debug.ShouldStop(67108864);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 284;BA.debugLine="Exit";
Debug.ShouldStop(134217728);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 287;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 288;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
Debug.ShouldStop(-2147483648);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblSetting ADD FldSendFactor Text")));
 BA.debugLineNum = 289;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(1);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 290;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(2);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 BA.debugLineNum = 291;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblSetting Set F";
Debug.ShouldStop(4);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Update TblSetting Set FldDateUpdate='0',FldSendFactor='1'")));
 };
 BA.debugLineNum = 293;BA.debugLine="Check=0";
Debug.ShouldStop(16);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 294;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
Debug.ShouldStop(32);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblSetting"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 295;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(64);
{
final int step76 = 1;
final int limit76 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step76 > 0 && _i <= limit76) || (step76 < 0 && _i >= limit76) ;_i = ((int)(0 + _i + step76))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 296;BA.debugLine="If  Cur.GetColumnName(i)=\"FldPrinterType\" Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldPrinterType"))) { 
 BA.debugLineNum = 297;BA.debugLine="Check=1";
Debug.ShouldStop(256);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 298;BA.debugLine="Exit";
Debug.ShouldStop(512);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 301;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 302;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
Debug.ShouldStop(8192);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblSetting ADD FldPrinterType Text")));
 BA.debugLineNum = 303;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(16384);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 304;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(32768);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 BA.debugLineNum = 305;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblSetting Set F";
Debug.ShouldStop(65536);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Update TblSetting Set FldPrinterType='0'")));
 };
 BA.debugLineNum = 308;BA.debugLine="Check=0";
Debug.ShouldStop(524288);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 309;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
Debug.ShouldStop(1048576);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblSetting"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 310;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(2097152);
{
final int step90 = 1;
final int limit90 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step90 > 0 && _i <= limit90) || (step90 < 0 && _i >= limit90) ;_i = ((int)(0 + _i + step90))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 311;BA.debugLine="If  Cur.GetColumnName(i)=\"fldArzeshAfzodeEnable\"";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("fldArzeshAfzodeEnable"))) { 
 BA.debugLineNum = 312;BA.debugLine="Check=1";
Debug.ShouldStop(8388608);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 313;BA.debugLine="Exit";
Debug.ShouldStop(16777216);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 316;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 317;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
Debug.ShouldStop(268435456);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblSetting ADD fldArzeshAfzodeEnable Text")));
 BA.debugLineNum = 318;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(536870912);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 319;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(1073741824);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 BA.debugLineNum = 320;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblSetting Set f";
Debug.ShouldStop(-2147483648);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Update TblSetting Set fldArzeshAfzodeEnable='0'")));
 };
 BA.debugLineNum = 322;BA.debugLine="Check=0";
Debug.ShouldStop(2);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 323;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
Debug.ShouldStop(4);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblSetting"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 324;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(8);
{
final int step104 = 1;
final int limit104 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step104 > 0 && _i <= limit104) || (step104 < 0 && _i >= limit104) ;_i = ((int)(0 + _i + step104))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 325;BA.debugLine="If  Cur.GetColumnName(i)=\"fldArzeshAfzode\" Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("fldArzeshAfzode"))) { 
 BA.debugLineNum = 326;BA.debugLine="Check=1";
Debug.ShouldStop(32);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 327;BA.debugLine="Exit";
Debug.ShouldStop(64);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 330;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 331;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
Debug.ShouldStop(1024);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblSetting ADD fldArzeshAfzode Text")));
 BA.debugLineNum = 332;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(2048);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 333;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(4096);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 BA.debugLineNum = 334;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblSetting Set f";
Debug.ShouldStop(8192);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Update TblSetting Set fldArzeshAfzode='0'")));
 };
 BA.debugLineNum = 336;BA.debugLine="Check=0";
Debug.ShouldStop(32768);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 337;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
Debug.ShouldStop(65536);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblSetting"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 338;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(131072);
{
final int step118 = 1;
final int limit118 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step118 > 0 && _i <= limit118) || (step118 < 0 && _i >= limit118) ;_i = ((int)(0 + _i + step118))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 339;BA.debugLine="If  Cur.GetColumnName(i)=\"FldDateTimeRecive\" The";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldDateTimeRecive"))) { 
 BA.debugLineNum = 340;BA.debugLine="Check=1";
Debug.ShouldStop(524288);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 341;BA.debugLine="Exit";
Debug.ShouldStop(1048576);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 344;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 345;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
Debug.ShouldStop(16777216);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblSetting ADD FldDateTimeRecive Text")));
 BA.debugLineNum = 346;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(33554432);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 347;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(67108864);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 350;BA.debugLine="Check=0";
Debug.ShouldStop(536870912);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 351;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
Debug.ShouldStop(1073741824);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblSetting"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 352;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(-2147483648);
{
final int step131 = 1;
final int limit131 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step131 > 0 && _i <= limit131) || (step131 < 0 && _i >= limit131) ;_i = ((int)(0 + _i + step131))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 353;BA.debugLine="If  Cur.GetColumnName(i)=\"FldTakhfifKala\" Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldTakhfifKala"))) { 
 BA.debugLineNum = 354;BA.debugLine="Check=1";
Debug.ShouldStop(2);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 355;BA.debugLine="Exit";
Debug.ShouldStop(4);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 358;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 359;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
Debug.ShouldStop(64);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblSetting ADD FldTakhfifKala Text")));
 BA.debugLineNum = 360;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(128);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 361;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(256);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 363;BA.debugLine="Check=0";
Debug.ShouldStop(1024);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 364;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
Debug.ShouldStop(2048);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblSetting"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 365;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(4096);
{
final int step144 = 1;
final int limit144 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step144 > 0 && _i <= limit144) || (step144 < 0 && _i >= limit144) ;_i = ((int)(0 + _i + step144))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 366;BA.debugLine="If  Cur.GetColumnName(i)=\"FldDateTimeSend\" Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldDateTimeSend"))) { 
 BA.debugLineNum = 367;BA.debugLine="Check=1";
Debug.ShouldStop(16384);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 368;BA.debugLine="Exit";
Debug.ShouldStop(32768);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 371;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 372;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
Debug.ShouldStop(524288);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblSetting ADD FldDateTimeSend Text")));
 BA.debugLineNum = 373;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(1048576);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 374;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(2097152);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 377;BA.debugLine="Check=0";
Debug.ShouldStop(16777216);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 378;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
Debug.ShouldStop(33554432);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblSetting"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 379;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(67108864);
{
final int step157 = 1;
final int limit157 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step157 > 0 && _i <= limit157) || (step157 < 0 && _i >= limit157) ;_i = ((int)(0 + _i + step157))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 380;BA.debugLine="If  Cur.GetColumnName(i)=\"FldSaveFactorInLocatio";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldSaveFactorInLocation"))) { 
 BA.debugLineNum = 381;BA.debugLine="Check=1";
Debug.ShouldStop(268435456);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 382;BA.debugLine="Exit";
Debug.ShouldStop(536870912);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 385;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 386;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
Debug.ShouldStop(2);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblSetting ADD FldSaveFactorInLocation Text")));
 BA.debugLineNum = 387;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(4);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 388;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(8);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 BA.debugLineNum = 389;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblSetting Set F";
Debug.ShouldStop(16);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Update TblSetting Set FldSaveFactorInLocation='0'")));
 };
 BA.debugLineNum = 391;BA.debugLine="Check=0";
Debug.ShouldStop(64);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 392;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
Debug.ShouldStop(128);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblSetting"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 393;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(256);
{
final int step171 = 1;
final int limit171 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step171 > 0 && _i <= limit171) || (step171 < 0 && _i >= limit171) ;_i = ((int)(0 + _i + step171))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 394;BA.debugLine="If  Cur.GetColumnName(i)=\"FldMasafat\" Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldMasafat"))) { 
 BA.debugLineNum = 395;BA.debugLine="Check=1";
Debug.ShouldStop(1024);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 396;BA.debugLine="Exit";
Debug.ShouldStop(2048);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 399;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 400;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
Debug.ShouldStop(32768);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblSetting ADD FldMasafat Text")));
 BA.debugLineNum = 401;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(65536);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 402;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(131072);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 BA.debugLineNum = 403;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblSetting Set F";
Debug.ShouldStop(262144);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Update TblSetting Set FldMasafat='50'")));
 };
 BA.debugLineNum = 406;BA.debugLine="Check=0";
Debug.ShouldStop(2097152);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 407;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
Debug.ShouldStop(4194304);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblSetting"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 408;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(8388608);
{
final int step185 = 1;
final int limit185 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step185 > 0 && _i <= limit185) || (step185 < 0 && _i >= limit185) ;_i = ((int)(0 + _i + step185))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 409;BA.debugLine="If  Cur.GetColumnName(i)=\"FldTaghirFeeKala\" Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldTaghirFeeKala"))) { 
 BA.debugLineNum = 410;BA.debugLine="Check=1";
Debug.ShouldStop(33554432);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 411;BA.debugLine="Exit";
Debug.ShouldStop(67108864);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 414;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 415;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
Debug.ShouldStop(1073741824);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblSetting ADD FldKalaManfi Text")));
 BA.debugLineNum = 416;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
Debug.ShouldStop(-2147483648);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblSetting ADD FldTaghirFeeKala Text")));
 BA.debugLineNum = 417;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(1);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 418;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(2);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 BA.debugLineNum = 419;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblSetting Set F";
Debug.ShouldStop(4);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Update TblSetting Set FldKalaManfi = '0', FldTaghirFeeKala='0'")));
 };
 BA.debugLineNum = 422;BA.debugLine="Check=0";
Debug.ShouldStop(32);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 423;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
Debug.ShouldStop(64);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblSetting"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 424;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(128);
{
final int step200 = 1;
final int limit200 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step200 > 0 && _i <= limit200) || (step200 < 0 && _i >= limit200) ;_i = ((int)(0 + _i + step200))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 425;BA.debugLine="If  Cur.GetColumnName(i)=\"FldTokenId\" Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldTokenId"))) { 
 BA.debugLineNum = 426;BA.debugLine="Check=1";
Debug.ShouldStop(512);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 427;BA.debugLine="Exit";
Debug.ShouldStop(1024);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 430;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 431;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
Debug.ShouldStop(16384);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblSetting ADD FldTokenId Text")));
 BA.debugLineNum = 432;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(32768);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 433;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(65536);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 436;BA.debugLine="Check=0";
Debug.ShouldStop(524288);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 437;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
Debug.ShouldStop(1048576);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblSetting"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 438;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(2097152);
{
final int step213 = 1;
final int limit213 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step213 > 0 && _i <= limit213) || (step213 < 0 && _i >= limit213) ;_i = ((int)(0 + _i + step213))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 439;BA.debugLine="If  Cur.GetColumnName(i)=\"FldCodeMoshtari\" Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldCodeMoshtari"))) { 
 BA.debugLineNum = 440;BA.debugLine="Check=1";
Debug.ShouldStop(8388608);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 441;BA.debugLine="Exit";
Debug.ShouldStop(16777216);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 444;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 445;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
Debug.ShouldStop(268435456);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblSetting ADD FldCodeMoshtari Text")));
 BA.debugLineNum = 446;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(536870912);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 447;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(1073741824);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 450;BA.debugLine="Check=0";
Debug.ShouldStop(2);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 451;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
Debug.ShouldStop(4);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblSetting"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 452;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(8);
{
final int step226 = 1;
final int limit226 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step226 > 0 && _i <= limit226) || (step226 < 0 && _i >= limit226) ;_i = ((int)(0 + _i + step226))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 453;BA.debugLine="If  Cur.GetColumnName(i)=\"FldNameVisitor\" Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldNameVisitor"))) { 
 BA.debugLineNum = 454;BA.debugLine="Check=1";
Debug.ShouldStop(32);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 455;BA.debugLine="Exit";
Debug.ShouldStop(64);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 458;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 459;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
Debug.ShouldStop(1024);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblSetting ADD FldNameVisitor Text")));
 BA.debugLineNum = 460;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(2048);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 461;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(4096);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 464;BA.debugLine="Check=0";
Debug.ShouldStop(32768);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 465;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
Debug.ShouldStop(65536);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblSetting"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 466;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(131072);
{
final int step239 = 1;
final int limit239 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step239 > 0 && _i <= limit239) || (step239 < 0 && _i >= limit239) ;_i = ((int)(0 + _i + step239))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 467;BA.debugLine="If  Cur.GetColumnName(i)=\"FldVaziat\" Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldVaziat"))) { 
 BA.debugLineNum = 468;BA.debugLine="Check=1";
Debug.ShouldStop(524288);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 469;BA.debugLine="Exit";
Debug.ShouldStop(1048576);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 472;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 473;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
Debug.ShouldStop(16777216);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblSetting ADD FldVaziat Integer")));
 BA.debugLineNum = 474;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(33554432);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 475;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(67108864);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 BA.debugLineNum = 476;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblSetting Set F";
Debug.ShouldStop(134217728);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Update TblSetting Set FldVaziat='0'")));
 };
 BA.debugLineNum = 479;BA.debugLine="Check=0";
Debug.ShouldStop(1073741824);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 480;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
Debug.ShouldStop(-2147483648);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblSetting"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 481;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(1);
{
final int step253 = 1;
final int limit253 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step253 > 0 && _i <= limit253) || (step253 < 0 && _i >= limit253) ;_i = ((int)(0 + _i + step253))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 482;BA.debugLine="If  Cur.GetColumnName(i)=\"FldPicOnline\" Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldPicOnline"))) { 
 BA.debugLineNum = 483;BA.debugLine="Check=1";
Debug.ShouldStop(4);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 484;BA.debugLine="Exit";
Debug.ShouldStop(8);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 487;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 488;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
Debug.ShouldStop(128);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblSetting ADD FldPicOnline Text")));
 BA.debugLineNum = 489;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(256);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 490;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(512);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 BA.debugLineNum = 491;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblSetting Set F";
Debug.ShouldStop(1024);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Update TblSetting Set FldPicOnline='0'")));
 };
 BA.debugLineNum = 494;BA.debugLine="Check=0";
Debug.ShouldStop(8192);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 495;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
Debug.ShouldStop(16384);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblSetting"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 496;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(32768);
{
final int step267 = 1;
final int limit267 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step267 > 0 && _i <= limit267) || (step267 < 0 && _i >= limit267) ;_i = ((int)(0 + _i + step267))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 497;BA.debugLine="If  Cur.GetColumnName(i)=\"FldDaryaft\" Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldDaryaft"))) { 
 BA.debugLineNum = 498;BA.debugLine="Check=1";
Debug.ShouldStop(131072);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 499;BA.debugLine="Exit";
Debug.ShouldStop(262144);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 502;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 503;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
Debug.ShouldStop(4194304);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblSetting ADD FldDaryaft Text")));
 BA.debugLineNum = 504;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(8388608);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 505;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(16777216);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 BA.debugLineNum = 506;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblSetting Set F";
Debug.ShouldStop(33554432);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Update TblSetting Set FldDaryaft='0'")));
 };
 BA.debugLineNum = 508;BA.debugLine="Check=0";
Debug.ShouldStop(134217728);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 509;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
Debug.ShouldStop(268435456);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblSetting"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 510;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(536870912);
{
final int step281 = 1;
final int limit281 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step281 > 0 && _i <= limit281) || (step281 < 0 && _i >= limit281) ;_i = ((int)(0 + _i + step281))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 511;BA.debugLine="If  Cur.GetColumnName(i)=\"FldMojavezSefaresh\" Th";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldMojavezSefaresh"))) { 
 BA.debugLineNum = 512;BA.debugLine="Check=1";
Debug.ShouldStop(-2147483648);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 513;BA.debugLine="Exit";
Debug.ShouldStop(1);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 516;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 517;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
Debug.ShouldStop(16);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblSetting ADD FldMojavezSefaresh Text")));
 BA.debugLineNum = 518;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(32);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 519;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(64);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 BA.debugLineNum = 520;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblSetting Set F";
Debug.ShouldStop(128);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Update TblSetting Set FldMojavezSefaresh='0'")));
 };
 BA.debugLineNum = 523;BA.debugLine="Check=0";
Debug.ShouldStop(1024);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 525;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
Debug.ShouldStop(4096);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblSetting"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 526;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(8192);
{
final int step295 = 1;
final int limit295 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step295 > 0 && _i <= limit295) || (step295 < 0 && _i >= limit295) ;_i = ((int)(0 + _i + step295))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 527;BA.debugLine="If  Cur.GetColumnName(i)=\"FldEshantionTabaghati\"";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldEshantionTabaghati"))) { 
 BA.debugLineNum = 528;BA.debugLine="Check=1";
Debug.ShouldStop(32768);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 529;BA.debugLine="Exit";
Debug.ShouldStop(65536);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 532;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 533;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
Debug.ShouldStop(1048576);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblSetting ADD FldEshantionTabaghati Text")));
 BA.debugLineNum = 534;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(2097152);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 535;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(4194304);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 BA.debugLineNum = 536;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblSetting Set F";
Debug.ShouldStop(8388608);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Update TblSetting Set FldEshantionTabaghati='0'")));
 };
 BA.debugLineNum = 539;BA.debugLine="Check=0";
Debug.ShouldStop(67108864);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 540;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
Debug.ShouldStop(134217728);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblSetting"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 541;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(268435456);
{
final int step309 = 1;
final int limit309 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step309 > 0 && _i <= limit309) || (step309 < 0 && _i >= limit309) ;_i = ((int)(0 + _i + step309))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 542;BA.debugLine="If  Cur.GetColumnName(i)=\"FldEshantionRemove\" Th";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldEshantionRemove"))) { 
 BA.debugLineNum = 543;BA.debugLine="Check=1";
Debug.ShouldStop(1073741824);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 544;BA.debugLine="Exit";
Debug.ShouldStop(-2147483648);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 547;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 548;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
Debug.ShouldStop(8);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblSetting ADD FldEshantionRemove Text")));
 BA.debugLineNum = 549;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(16);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 550;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(32);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 BA.debugLineNum = 551;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblSetting Set F";
Debug.ShouldStop(64);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Update TblSetting Set FldEshantionRemove='0'")));
 };
 BA.debugLineNum = 554;BA.debugLine="Check=0";
Debug.ShouldStop(512);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 555;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
Debug.ShouldStop(1024);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblSetting"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 556;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(2048);
{
final int step323 = 1;
final int limit323 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step323 > 0 && _i <= limit323) || (step323 < 0 && _i >= limit323) ;_i = ((int)(0 + _i + step323))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 557;BA.debugLine="If  Cur.GetColumnName(i)=\"FldEshantionGroup\" The";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldEshantionGroup"))) { 
 BA.debugLineNum = 558;BA.debugLine="Check=1";
Debug.ShouldStop(8192);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 559;BA.debugLine="Exit";
Debug.ShouldStop(16384);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 562;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 563;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
Debug.ShouldStop(262144);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblSetting ADD FldEshantionGroup Text")));
 BA.debugLineNum = 564;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(524288);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 565;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(1048576);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 BA.debugLineNum = 566;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblSetting Set F";
Debug.ShouldStop(2097152);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Update TblSetting Set FldEshantionGroup='0'")));
 };
 BA.debugLineNum = 568;BA.debugLine="Check=0";
Debug.ShouldStop(8388608);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 569;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
Debug.ShouldStop(16777216);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblSetting"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 570;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(33554432);
{
final int step337 = 1;
final int limit337 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step337 > 0 && _i <= limit337) || (step337 < 0 && _i >= limit337) ;_i = ((int)(0 + _i + step337))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 571;BA.debugLine="If  Cur.GetColumnName(i)=\"FldGetDataOnline\" Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldGetDataOnline"))) { 
 BA.debugLineNum = 572;BA.debugLine="Check=1";
Debug.ShouldStop(134217728);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 573;BA.debugLine="Exit";
Debug.ShouldStop(268435456);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 576;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 577;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
Debug.ShouldStop(1);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblSetting ADD FldGetDataOnline Text")));
 BA.debugLineNum = 578;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(2);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 579;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(4);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 BA.debugLineNum = 580;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblSetting Set F";
Debug.ShouldStop(8);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Update TblSetting Set FldGetDataOnline='0'")));
 };
 BA.debugLineNum = 583;BA.debugLine="Check=0";
Debug.ShouldStop(64);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 584;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
Debug.ShouldStop(128);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblSetting"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 585;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(256);
{
final int step351 = 1;
final int limit351 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step351 > 0 && _i <= limit351) || (step351 < 0 && _i >= limit351) ;_i = ((int)(0 + _i + step351))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 586;BA.debugLine="If  Cur.GetColumnName(i)=\"FldVersion\" Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldVersion"))) { 
 BA.debugLineNum = 587;BA.debugLine="Check=1";
Debug.ShouldStop(1024);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 588;BA.debugLine="Exit";
Debug.ShouldStop(2048);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 591;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 592;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
Debug.ShouldStop(32768);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblSetting ADD FldVersion Text")));
 BA.debugLineNum = 593;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(65536);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 594;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(131072);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 597;BA.debugLine="Check=0";
Debug.ShouldStop(1048576);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 598;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From Tb";
Debug.ShouldStop(2097152);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = mdatabase.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,_ba,(Object)(RemoteObject.createImmutable("Select * From TblSetting")));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 599;BA.debugLine="Cu.Position=0";
Debug.ShouldStop(4194304);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 600;BA.debugLine="If MCode.OriginalListFaktor.IsInitialized=False T";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",mdatabase.mostCurrent._mcode._originallistfaktor /*RemoteObject*/ .runMethod(true,"IsInitialized"),mdatabase.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 601;BA.debugLine="MCode.OriginalListFaktor.Initialize";
Debug.ShouldStop(16777216);
mdatabase.mostCurrent._mcode._originallistfaktor /*RemoteObject*/ .runVoidMethod ("Initialize");
 BA.debugLineNum = 602;BA.debugLine="MCode.OriginalListFaktor.Clear";
Debug.ShouldStop(33554432);
mdatabase.mostCurrent._mcode._originallistfaktor /*RemoteObject*/ .runVoidMethod ("Clear");
 };
 BA.debugLineNum = 605;BA.debugLine="Check=0";
Debug.ShouldStop(268435456);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 606;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
Debug.ShouldStop(536870912);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblSetting"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 607;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(1073741824);
{
final int step371 = 1;
final int limit371 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step371 > 0 && _i <= limit371) || (step371 < 0 && _i >= limit371) ;_i = ((int)(0 + _i + step371))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 608;BA.debugLine="If  Cur.GetColumnName(i)=\"FldNamayeshKalaSefr\" T";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldNamayeshKalaSefr"))) { 
 BA.debugLineNum = 609;BA.debugLine="Check=1";
Debug.ShouldStop(1);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 610;BA.debugLine="Exit";
Debug.ShouldStop(2);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 613;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 614;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
Debug.ShouldStop(32);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblSetting ADD FldNamayeshKalaSefr Text")));
 BA.debugLineNum = 615;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(64);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 616;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(128);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 BA.debugLineNum = 617;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblSetting Set F";
Debug.ShouldStop(256);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Update TblSetting Set FldNamayeshKalaSefr = '1'")));
 };
 BA.debugLineNum = 620;BA.debugLine="Check=0";
Debug.ShouldStop(2048);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 621;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
Debug.ShouldStop(4096);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblSetting"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 622;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(8192);
{
final int step385 = 1;
final int limit385 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step385 > 0 && _i <= limit385) || (step385 < 0 && _i >= limit385) ;_i = ((int)(0 + _i + step385))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 623;BA.debugLine="If  Cur.GetColumnName(i)=\"FldPrinterType\" Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldPrinterType"))) { 
 BA.debugLineNum = 624;BA.debugLine="Check=1";
Debug.ShouldStop(32768);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 625;BA.debugLine="Exit";
Debug.ShouldStop(65536);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 628;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 629;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
Debug.ShouldStop(1048576);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblSetting ADD FldPrinterType Integer")));
 BA.debugLineNum = 630;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(2097152);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 631;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(4194304);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 BA.debugLineNum = 632;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblSetting Set F";
Debug.ShouldStop(8388608);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Update TblSetting Set FldPrinterType = 0")));
 };
 BA.debugLineNum = 635;BA.debugLine="Check=0";
Debug.ShouldStop(67108864);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 637;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
Debug.ShouldStop(268435456);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblSetting"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 638;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(536870912);
{
final int step399 = 1;
final int limit399 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step399 > 0 && _i <= limit399) || (step399 < 0 && _i >= limit399) ;_i = ((int)(0 + _i + step399))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 639;BA.debugLine="If  Cur.GetColumnName(i)=\"FldHideMojodi\" Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldHideMojodi"))) { 
 BA.debugLineNum = 640;BA.debugLine="Check=1";
Debug.ShouldStop(-2147483648);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 641;BA.debugLine="Exit";
Debug.ShouldStop(1);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 644;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 645;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
Debug.ShouldStop(16);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblSetting ADD FldHideMojodi Text")));
 BA.debugLineNum = 646;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(32);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 647;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(64);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 BA.debugLineNum = 648;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblSetting Set F";
Debug.ShouldStop(128);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Update TblSetting Set FldHideMojodi = '0'")));
 };
 BA.debugLineNum = 651;BA.debugLine="Check=0";
Debug.ShouldStop(1024);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 653;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
Debug.ShouldStop(4096);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblSetting"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 654;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(8192);
{
final int step413 = 1;
final int limit413 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step413 > 0 && _i <= limit413) || (step413 < 0 && _i >= limit413) ;_i = ((int)(0 + _i + step413))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 655;BA.debugLine="If  Cur.GetColumnName(i)=\"FldConnectionStatus\" T";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldConnectionStatus"))) { 
 BA.debugLineNum = 656;BA.debugLine="Check=1";
Debug.ShouldStop(32768);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 657;BA.debugLine="Exit";
Debug.ShouldStop(65536);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 660;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 661;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
Debug.ShouldStop(1048576);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblSetting ADD FldConnectionStatus Text")));
 BA.debugLineNum = 662;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(2097152);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 663;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(4194304);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 BA.debugLineNum = 664;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblSetting Set F";
Debug.ShouldStop(8388608);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Update TblSetting Set FldConnectionStatus = '0'")));
 };
 BA.debugLineNum = 667;BA.debugLine="Check=0";
Debug.ShouldStop(67108864);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 669;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
Debug.ShouldStop(268435456);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblSetting"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 670;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(536870912);
{
final int step427 = 1;
final int limit427 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step427 > 0 && _i <= limit427) || (step427 < 0 && _i >= limit427) ;_i = ((int)(0 + _i + step427))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 671;BA.debugLine="If  Cur.GetColumnName(i)=\"FldAdmin\" Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldAdmin"))) { 
 BA.debugLineNum = 672;BA.debugLine="Check=1";
Debug.ShouldStop(-2147483648);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 673;BA.debugLine="Exit";
Debug.ShouldStop(1);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 676;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 677;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
Debug.ShouldStop(16);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblSetting ADD FldAdmin Text")));
 BA.debugLineNum = 678;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(32);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 679;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(64);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 BA.debugLineNum = 680;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblSetting Set F";
Debug.ShouldStop(128);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Update TblSetting Set FldAdmin='0'")));
 };
 BA.debugLineNum = 683;BA.debugLine="Check=0";
Debug.ShouldStop(1024);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 685;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
Debug.ShouldStop(4096);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblSetting"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 686;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(8192);
{
final int step441 = 1;
final int limit441 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step441 > 0 && _i <= limit441) || (step441 < 0 && _i >= limit441) ;_i = ((int)(0 + _i + step441))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 687;BA.debugLine="If  Cur.GetColumnName(i)=\"FldTozie\" Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldTozie"))) { 
 BA.debugLineNum = 688;BA.debugLine="Check=1";
Debug.ShouldStop(32768);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 689;BA.debugLine="Exit";
Debug.ShouldStop(65536);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 692;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 693;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
Debug.ShouldStop(1048576);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblSetting ADD FldTozie Text")));
 BA.debugLineNum = 694;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(2097152);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 695;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(4194304);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 BA.debugLineNum = 696;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblSetting Set F";
Debug.ShouldStop(8388608);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Update TblSetting Set FldTozie='0'")));
 };
 BA.debugLineNum = 699;BA.debugLine="Check=0";
Debug.ShouldStop(67108864);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 701;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
Debug.ShouldStop(268435456);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblSetting"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 702;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(536870912);
{
final int step455 = 1;
final int limit455 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step455 > 0 && _i <= limit455) || (step455 < 0 && _i >= limit455) ;_i = ((int)(0 + _i + step455))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 703;BA.debugLine="If  Cur.GetColumnName(i)=\"FldVisitor\" Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldVisitor"))) { 
 BA.debugLineNum = 704;BA.debugLine="Check=1";
Debug.ShouldStop(-2147483648);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 705;BA.debugLine="Exit";
Debug.ShouldStop(1);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 708;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 709;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
Debug.ShouldStop(16);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblSetting ADD FldVisitor Text")));
 BA.debugLineNum = 710;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(32);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 711;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(64);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 BA.debugLineNum = 712;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblSetting Set F";
Debug.ShouldStop(128);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Update TblSetting Set FldVisitor='0'")));
 };
 BA.debugLineNum = 715;BA.debugLine="Check=0";
Debug.ShouldStop(1024);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 717;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
Debug.ShouldStop(4096);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblSetting"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 718;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(8192);
{
final int step469 = 1;
final int limit469 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step469 > 0 && _i <= limit469) || (step469 < 0 && _i >= limit469) ;_i = ((int)(0 + _i + step469))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 719;BA.debugLine="If  Cur.GetColumnName(i)=\"FldLinkPicKala\" Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldLinkPicKala"))) { 
 BA.debugLineNum = 720;BA.debugLine="Check=1";
Debug.ShouldStop(32768);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 721;BA.debugLine="Exit";
Debug.ShouldStop(65536);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 724;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 725;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
Debug.ShouldStop(1048576);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblSetting ADD FldLinkPicKala Text")));
 BA.debugLineNum = 726;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(2097152);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 727;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(4194304);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 };
 BA.debugLineNum = 729;BA.debugLine="Check=0";
Debug.ShouldStop(16777216);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 731;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
Debug.ShouldStop(67108864);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblSetting"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 732;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(134217728);
{
final int step482 = 1;
final int limit482 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step482 > 0 && _i <= limit482) || (step482 < 0 && _i >= limit482) ;_i = ((int)(0 + _i + step482))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 733;BA.debugLine="If  Cur.GetColumnName(i)=\"FldSendMarjoie\" Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldSendMarjoie"))) { 
 BA.debugLineNum = 734;BA.debugLine="Check=1";
Debug.ShouldStop(536870912);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 735;BA.debugLine="Exit";
Debug.ShouldStop(1073741824);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 738;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 739;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
Debug.ShouldStop(4);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblSetting ADD FldSendMarjoie Text")));
 BA.debugLineNum = 740;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(8);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 741;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(16);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 BA.debugLineNum = 742;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblSetting Set F";
Debug.ShouldStop(32);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Update TblSetting Set FldSendMarjoie='0'")));
 };
 BA.debugLineNum = 745;BA.debugLine="Check=0";
Debug.ShouldStop(256);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 747;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
Debug.ShouldStop(1024);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblSetting"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 748;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(2048);
{
final int step496 = 1;
final int limit496 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step496 > 0 && _i <= limit496) || (step496 < 0 && _i >= limit496) ;_i = ((int)(0 + _i + step496))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 749;BA.debugLine="If  Cur.GetColumnName(i)=\"FldAmani\" Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldAmani"))) { 
 BA.debugLineNum = 750;BA.debugLine="Check=1";
Debug.ShouldStop(8192);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 751;BA.debugLine="Exit";
Debug.ShouldStop(16384);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 754;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 755;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
Debug.ShouldStop(262144);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblSetting ADD FldAmani Text")));
 BA.debugLineNum = 756;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(524288);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 757;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(1048576);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 BA.debugLineNum = 758;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblSetting Set F";
Debug.ShouldStop(2097152);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Update TblSetting Set FldAmani='0'")));
 };
 BA.debugLineNum = 763;BA.debugLine="Check=0";
Debug.ShouldStop(67108864);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 764;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
Debug.ShouldStop(134217728);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblSetting"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 765;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(268435456);
{
final int step510 = 1;
final int limit510 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step510 > 0 && _i <= limit510) || (step510 < 0 && _i >= limit510) ;_i = ((int)(0 + _i + step510))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 766;BA.debugLine="If  Cur.GetColumnName(i)=\"fldNumberVersion\" Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("fldNumberVersion"))) { 
 BA.debugLineNum = 767;BA.debugLine="Check=1";
Debug.ShouldStop(1073741824);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 768;BA.debugLine="Exit";
Debug.ShouldStop(-2147483648);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 771;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 772;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
Debug.ShouldStop(8);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblSetting ADD fldNumberVersion Text")));
 BA.debugLineNum = 773;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
Debug.ShouldStop(16);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblSetting ADD fldDateVersion Text")));
 BA.debugLineNum = 774;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
Debug.ShouldStop(32);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblSetting ADD fldLastVersion Text")));
 BA.debugLineNum = 775;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
Debug.ShouldStop(64);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblSetting ADD fldTypeVersion Text")));
 BA.debugLineNum = 776;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
Debug.ShouldStop(128);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblSetting ADD fldDateSetup Text")));
 BA.debugLineNum = 777;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(256);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 778;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(512);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 BA.debugLineNum = 781;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSetti";
Debug.ShouldStop(4096);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblSetting"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 782;BA.debugLine="Cur.Position=0";
Debug.ShouldStop(8192);
_cur.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 783;BA.debugLine="Log(Cur.GetString(\"FldVersion\"))";
Debug.ShouldStop(16384);
mdatabase.mostCurrent.__c.runVoidMethod ("LogImpl","519726902",_cur.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldVersion"))),0);
 BA.debugLineNum = 784;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblSetting Set f";
Debug.ShouldStop(32768);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update TblSetting Set fldLastVersion='"),_cur.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldVersion"))),RemoteObject.createImmutable("'"))));
 };
 BA.debugLineNum = 790;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
Debug.ShouldStop(2097152);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblSetting"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 791;BA.debugLine="Cur.Position=0";
Debug.ShouldStop(4194304);
_cur.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 792;BA.debugLine="If IsNumber(Cur.GetString(\"FldC_Visitor\")) Then";
Debug.ShouldStop(8388608);
if (mdatabase.mostCurrent.__c.runMethod(true,"IsNumber",(Object)(_cur.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Visitor"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 794;BA.debugLine="If myCode.Is_Null_adad(Cur.GetString(\"fldNumberV";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("!",mdatabase.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,_ba,(Object)(_cur.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldNumberVersion"))))),mdatabase.mostCurrent._mcode._numberversion /*RemoteObject*/ )) { 
 BA.debugLineNum = 795;BA.debugLine="Log(Cur.GetString(\"fldLastVersion\"))";
Debug.ShouldStop(67108864);
mdatabase.mostCurrent.__c.runVoidMethod ("LogImpl","519726914",_cur.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldLastVersion"))),0);
 BA.debugLineNum = 796;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblSetting Set";
Debug.ShouldStop(134217728);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update TblSetting Set fldNumberVersion='"),mdatabase.mostCurrent._mcode._numberversion /*RemoteObject*/ ,RemoteObject.createImmutable("'"))));
 BA.debugLineNum = 797;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblSetting Set";
Debug.ShouldStop(268435456);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update TblSetting Set fldDateVersion='"),mdatabase.mostCurrent._mcode._dateversion /*RemoteObject*/ .runMethod(true,"replace",(Object)(BA.ObjectToString("/")),(Object)(RemoteObject.createImmutable(""))),RemoteObject.createImmutable("'"))));
 BA.debugLineNum = 798;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblSetting Set";
Debug.ShouldStop(536870912);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update TblSetting Set fldLastVersion='"),_cur.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldLastVersion"))),RemoteObject.createImmutable("'"))));
 BA.debugLineNum = 799;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblSetting Set";
Debug.ShouldStop(1073741824);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update TblSetting Set fldTypeVersion='"),mdatabase.mostCurrent._mcode._typeversion /*RemoteObject*/ ,RemoteObject.createImmutable("'"))));
 BA.debugLineNum = 800;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblSetting Set";
Debug.ShouldStop(-2147483648);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update TblSetting Set fldDateSetup='"),mdatabase.mostCurrent._mcode.runMethod(true,"_getdatenow" /*RemoteObject*/ ,_ba),RemoteObject.createImmutable("'"))));
 BA.debugLineNum = 803;BA.debugLine="CallSubDelayed(Service_Server,\"SaveVersionAndro";
Debug.ShouldStop(4);
mdatabase.mostCurrent.__c.runVoidMethod ("CallSubDelayed",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba),(Object)((mdatabase.mostCurrent._service_server.getObject())),(Object)(RemoteObject.createImmutable("SaveVersionAndroidInfo")));
 };
 };
 BA.debugLineNum = 807;BA.debugLine="Check=0";
Debug.ShouldStop(64);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 810;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
Debug.ShouldStop(512);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblSetting"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 811;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(1024);
{
final int step544 = 1;
final int limit544 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step544 > 0 && _i <= limit544) || (step544 < 0 && _i >= limit544) ;_i = ((int)(0 + _i + step544))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 812;BA.debugLine="If  Cur.GetColumnName(i)=\"FldCheckAdmin\" Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldCheckAdmin"))) { 
 BA.debugLineNum = 813;BA.debugLine="Check=1";
Debug.ShouldStop(4096);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 814;BA.debugLine="Exit";
Debug.ShouldStop(8192);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 817;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 818;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
Debug.ShouldStop(131072);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblSetting ADD FldCheckAdmin Text")));
 BA.debugLineNum = 819;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(262144);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 820;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(524288);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 BA.debugLineNum = 821;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblSetting Set F";
Debug.ShouldStop(1048576);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Update TblSetting Set FldCheckAdmin='0'")));
 };
 BA.debugLineNum = 823;BA.debugLine="Check=0";
Debug.ShouldStop(4194304);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 824;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
Debug.ShouldStop(8388608);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblSetting"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 825;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(16777216);
{
final int step558 = 1;
final int limit558 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step558 > 0 && _i <= limit558) || (step558 < 0 && _i >= limit558) ;_i = ((int)(0 + _i + step558))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 826;BA.debugLine="If  Cur.GetColumnName(i)=\"fldDateUpdateKala\" The";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("fldDateUpdateKala"))) { 
 BA.debugLineNum = 827;BA.debugLine="Check=1";
Debug.ShouldStop(67108864);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 828;BA.debugLine="Exit";
Debug.ShouldStop(134217728);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 831;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 832;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
Debug.ShouldStop(-2147483648);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblSetting ADD fldDateUpdateKala Text")));
 BA.debugLineNum = 833;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(1);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 834;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(2);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 BA.debugLineNum = 835;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblSetting Set f";
Debug.ShouldStop(4);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Update TblSetting Set fldDateUpdateKala='0'")));
 };
 BA.debugLineNum = 838;BA.debugLine="Check=0";
Debug.ShouldStop(32);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 840;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
Debug.ShouldStop(128);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblSetting"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 841;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(256);
{
final int step572 = 1;
final int limit572 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step572 > 0 && _i <= limit572) || (step572 < 0 && _i >= limit572) ;_i = ((int)(0 + _i + step572))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 842;BA.debugLine="If  Cur.GetColumnName(i)=\"FldNameCompany\" Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldNameCompany"))) { 
 BA.debugLineNum = 843;BA.debugLine="Check=1";
Debug.ShouldStop(1024);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 844;BA.debugLine="Exit";
Debug.ShouldStop(2048);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 847;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 848;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
Debug.ShouldStop(32768);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblSetting ADD FldNameCompany Text")));
 BA.debugLineNum = 849;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(65536);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 850;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(131072);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 BA.debugLineNum = 851;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblSetting Set F";
Debug.ShouldStop(262144);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Update TblSetting Set FldNameCompany=''")));
 };
 BA.debugLineNum = 854;BA.debugLine="Check=0";
Debug.ShouldStop(2097152);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 856;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
Debug.ShouldStop(8388608);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblSetting"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 857;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(16777216);
{
final int step586 = 1;
final int limit586 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step586 > 0 && _i <= limit586) || (step586 < 0 && _i >= limit586) ;_i = ((int)(0 + _i + step586))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 858;BA.debugLine="If  Cur.GetColumnName(i)=\"FldTellCompany\" Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldTellCompany"))) { 
 BA.debugLineNum = 859;BA.debugLine="Check=1";
Debug.ShouldStop(67108864);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 860;BA.debugLine="Exit";
Debug.ShouldStop(134217728);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 863;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 864;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
Debug.ShouldStop(-2147483648);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblSetting ADD FldTellCompany Text")));
 BA.debugLineNum = 865;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(1);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 866;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(2);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 BA.debugLineNum = 867;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblSetting Set F";
Debug.ShouldStop(4);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Update TblSetting Set FldTellCompany=''")));
 };
 BA.debugLineNum = 871;BA.debugLine="Check=0";
Debug.ShouldStop(64);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 873;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
Debug.ShouldStop(256);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblSetting"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 874;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(512);
{
final int step600 = 1;
final int limit600 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step600 > 0 && _i <= limit600) || (step600 < 0 && _i >= limit600) ;_i = ((int)(0 + _i + step600))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 875;BA.debugLine="If  Cur.GetColumnName(i)=\"FldAddressCompany\" The";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldAddressCompany"))) { 
 BA.debugLineNum = 876;BA.debugLine="Check=1";
Debug.ShouldStop(2048);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 877;BA.debugLine="Exit";
Debug.ShouldStop(4096);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 880;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 881;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
Debug.ShouldStop(65536);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblSetting ADD FldAddressCompany Text")));
 BA.debugLineNum = 882;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(131072);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 883;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(262144);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 BA.debugLineNum = 884;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblSetting Set F";
Debug.ShouldStop(524288);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Update TblSetting Set FldAddressCompany=''")));
 };
 BA.debugLineNum = 887;BA.debugLine="Check=0";
Debug.ShouldStop(4194304);
_check = BA.numberCast(int.class, 0);Debug.locals.put("Check", _check);
 BA.debugLineNum = 889;BA.debugLine="Cur=MCode.Sql1.ExecQuery(\"Select * From TblSettin";
Debug.ShouldStop(16777216);
_cur = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("Select * From TblSetting"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 890;BA.debugLine="For i=0 To Cur.ColumnCount-1";
Debug.ShouldStop(33554432);
{
final int step614 = 1;
final int limit614 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step614 > 0 && _i <= limit614) || (step614 < 0 && _i >= limit614) ;_i = ((int)(0 + _i + step614))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 891;BA.debugLine="If  Cur.GetColumnName(i)=\"FldMobileIsImportent\"";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToString("FldMobileIsImportent"))) { 
 BA.debugLineNum = 892;BA.debugLine="Check=1";
Debug.ShouldStop(134217728);
_check = BA.numberCast(int.class, 1);Debug.locals.put("Check", _check);
 BA.debugLineNum = 893;BA.debugLine="Exit";
Debug.ShouldStop(268435456);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 896;BA.debugLine="If Check=0 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_check,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 897;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Alter Table TblSetting";
Debug.ShouldStop(1);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Alter Table TblSetting ADD FldMobileIsImportent Text")));
 BA.debugLineNum = 898;BA.debugLine="MCode.Sql1.Close";
Debug.ShouldStop(2);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("Close");
 BA.debugLineNum = 899;BA.debugLine="MCode.Initialize";
Debug.ShouldStop(4);
mdatabase.mostCurrent._mcode.runVoidMethod ("_initialize" /*RemoteObject*/ ,_ba);
 BA.debugLineNum = 900;BA.debugLine="MCode.Sql1.ExecNonQuery(\"Update TblSetting Set F";
Debug.ShouldStop(8);
mdatabase.mostCurrent._mcode._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Update TblSetting Set FldMobileIsImportent='0'")));
 };
 BA.debugLineNum = 903;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}