package ir.parsikhesab.pakhsh;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class clskala {
private static clskala mostCurrent = new clskala();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 
public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.objects.collections.List _orginallistkala = null;
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
public static String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="clskala";
if (Debug.shouldDelegate(null, "initialize", false))
	 {return ((String) Debug.delegate(null, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=112459776;
 //BA.debugLineNum = 112459776;BA.debugLine="Sub Initialize";
RDebugUtils.currentLine=112459777;
 //BA.debugLineNum = 112459777;BA.debugLine="OrginalListKala.Initialize";
_orginallistkala.Initialize();
RDebugUtils.currentLine=112459778;
 //BA.debugLineNum = 112459778;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.List  _selectfordefaultkalalist(anywheresoftware.b4a.BA _ba,String _query) throws Exception{
RDebugUtils.currentModule="clskala";
if (Debug.shouldDelegate(null, "selectfordefaultkalalist", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(null, "selectfordefaultkalalist", new Object[] {_ba,_query}));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
int _i = 0;
ir.parsikhesab.pakhsh.mcode._adapterlistkala _itemkala = null;
String _fee = "";
long _c = 0L;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu1 = null;
int _fldfeeforoosh = 0;
int _fldtedaddarkarton = 0;
int _summande = 0;
RDebugUtils.currentLine=112525312;
 //BA.debugLineNum = 112525312;BA.debugLine="Sub SelectForDefaultKalaList(query As String) As L";
RDebugUtils.currentLine=112525314;
 //BA.debugLineNum = 112525314;BA.debugLine="Dim Cu As Cursor = MCode.Result(query)";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (_ba,_query);
RDebugUtils.currentLine=112525315;
 //BA.debugLineNum = 112525315;BA.debugLine="If Cu.RowCount > 0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=112525317;
 //BA.debugLineNum = 112525317;BA.debugLine="For i = 0 To Cu.RowCount - 1";
{
final int step3 = 1;
final int limit3 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=112525318;
 //BA.debugLineNum = 112525318;BA.debugLine="Dim ItemKala As AdapterListKala";
_itemkala = new ir.parsikhesab.pakhsh.mcode._adapterlistkala();
RDebugUtils.currentLine=112525319;
 //BA.debugLineNum = 112525319;BA.debugLine="Cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=112525320;
 //BA.debugLineNum = 112525320;BA.debugLine="ItemKala.CodeKala=Cu.Getstring(\"fldCodeKala\")";
_itemkala.CodeKala /*String*/  = _cu.GetString("fldCodeKala");
RDebugUtils.currentLine=112525321;
 //BA.debugLineNum = 112525321;BA.debugLine="ItemKala.NameKala=Cu.Getstring(\"fldNameKala\")";
_itemkala.NameKala /*String*/  = _cu.GetString("fldNameKala");
RDebugUtils.currentLine=112525322;
 //BA.debugLineNum = 112525322;BA.debugLine="ItemKala.NameVahed=Cu.Getstring(\"fldNameVahed\")";
_itemkala.NameVahed /*String*/  = _cu.GetString("fldNameVahed");
RDebugUtils.currentLine=112525323;
 //BA.debugLineNum = 112525323;BA.debugLine="ItemKala.NameVahed2=Cu.Getstring(\"fldNameVahed2\"";
_itemkala.NameVahed2 /*String*/  = _cu.GetString("fldNameVahed2");
RDebugUtils.currentLine=112525324;
 //BA.debugLineNum = 112525324;BA.debugLine="ItemKala.fldSharh=Cu.Getstring(\"fldSharh\")";
_itemkala.fldSharh /*String*/  = _cu.GetString("fldSharh");
RDebugUtils.currentLine=112525325;
 //BA.debugLineNum = 112525325;BA.debugLine="ItemKala.SumMande=Cu.Getstring(\"SumMande\")";
_itemkala.SumMande /*String*/  = _cu.GetString("SumMande");
RDebugUtils.currentLine=112525326;
 //BA.debugLineNum = 112525326;BA.debugLine="ItemKala.TedadDarKarton =Cu.Getstring(\"fldTedadD";
_itemkala.TedadDarKarton /*String*/  = _cu.GetString("fldTedadDarKarton");
RDebugUtils.currentLine=112525327;
 //BA.debugLineNum = 112525327;BA.debugLine="Dim fee As String";
_fee = "";
RDebugUtils.currentLine=112525328;
 //BA.debugLineNum = 112525328;BA.debugLine="If MCode.feeTip=0 Then";
if ((mostCurrent._mcode._feetip /*String*/ ).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=112525329;
 //BA.debugLineNum = 112525329;BA.debugLine="fee=Cu.GetInt(\"fldFeeForoosh\")";
_fee = BA.NumberToString(_cu.GetInt("fldFeeForoosh"));
 }else {
RDebugUtils.currentLine=112525333;
 //BA.debugLineNum = 112525333;BA.debugLine="fee=myCode.Is_Null_adad(Cu.GetString(\"fldFeeTas";
_fee = mostCurrent._mycode._is_null_adad /*String*/ (_ba,_cu.GetString("fldFeeTasvie"));
RDebugUtils.currentLine=112525335;
 //BA.debugLineNum = 112525335;BA.debugLine="If 	IsNumber(fee) And fee>0 Then";
if (anywheresoftware.b4a.keywords.Common.IsNumber(_fee) && (double)(Double.parseDouble(_fee))>0) { 
RDebugUtils.currentLine=112525336;
 //BA.debugLineNum = 112525336;BA.debugLine="Log(Cu.GetString(\"fldFeeTasvie\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("5112525336",_cu.GetString("fldFeeTasvie"),0);
RDebugUtils.currentLine=112525338;
 //BA.debugLineNum = 112525338;BA.debugLine="If  fee>Cu.GetString(\"fldFeeBadAzTakhfif\") The";
if ((double)(Double.parseDouble(_fee))>(double)(Double.parseDouble(_cu.GetString("fldFeeBadAzTakhfif")))) { 
RDebugUtils.currentLine=112525340;
 //BA.debugLineNum = 112525340;BA.debugLine="ItemKala.fldFeeBadAzTakhfif=\"0\"";
_itemkala.fldFeeBadAzTakhfif /*String*/  = "0";
 }else 
{RDebugUtils.currentLine=112525341;
 //BA.debugLineNum = 112525341;BA.debugLine="Else if fee<Cu.GetString(\"fldFeeBadAzTakhfif\")";
if ((double)(Double.parseDouble(_fee))<(double)(Double.parseDouble(_cu.GetString("fldFeeBadAzTakhfif")))) { 
RDebugUtils.currentLine=112525342;
 //BA.debugLineNum = 112525342;BA.debugLine="ItemKala.fldFeeBadAzTakhfif=fee";
_itemkala.fldFeeBadAzTakhfif /*String*/  = _fee;
RDebugUtils.currentLine=112525343;
 //BA.debugLineNum = 112525343;BA.debugLine="fee=Cu.GetInt(\"fldFeeForoosh\")";
_fee = BA.NumberToString(_cu.GetInt("fldFeeForoosh"));
 }else {
RDebugUtils.currentLine=112525347;
 //BA.debugLineNum = 112525347;BA.debugLine="ItemKala.fldFeeBadAzTakhfif=Cu.GetString(\"fld";
_itemkala.fldFeeBadAzTakhfif /*String*/  = _cu.GetString("fldFeeBadAzTakhfif");
RDebugUtils.currentLine=112525348;
 //BA.debugLineNum = 112525348;BA.debugLine="fee=Cu.GetInt(\"fldFeeForoosh\")";
_fee = BA.NumberToString(_cu.GetInt("fldFeeForoosh"));
 }}
;
 }else {
RDebugUtils.currentLine=112525352;
 //BA.debugLineNum = 112525352;BA.debugLine="fee=Cu.GetInt(\"fldFeeForoosh\")";
_fee = BA.NumberToString(_cu.GetInt("fldFeeForoosh"));
 };
 };
RDebugUtils.currentLine=112525364;
 //BA.debugLineNum = 112525364;BA.debugLine="fee=MCode.GetUpdateFeeSabad(fee,ItemKala.CodeKal";
_fee = mostCurrent._mcode._getupdatefeesabad /*String*/ (_ba,_fee,_itemkala.CodeKala /*String*/ );
RDebugUtils.currentLine=112525368;
 //BA.debugLineNum = 112525368;BA.debugLine="If Cu.GetString(\"fldFeeBadAzTakhfif\")<>Null Then";
if (_cu.GetString("fldFeeBadAzTakhfif")!= null) { 
RDebugUtils.currentLine=112525370;
 //BA.debugLineNum = 112525370;BA.debugLine="ItemKala.fldFeeBadAzTakhfif=Cu.GetString(\"fldFe";
_itemkala.fldFeeBadAzTakhfif /*String*/  = _cu.GetString("fldFeeBadAzTakhfif");
 }else {
RDebugUtils.currentLine=112525374;
 //BA.debugLineNum = 112525374;BA.debugLine="ItemKala.fldFeeBadAzTakhfif=\"0\"";
_itemkala.fldFeeBadAzTakhfif /*String*/  = "0";
 };
RDebugUtils.currentLine=112525377;
 //BA.debugLineNum = 112525377;BA.debugLine="If ItemKala.MablaghTakhfif>0 Then";
if (_itemkala.MablaghTakhfif /*int*/ >0) { 
RDebugUtils.currentLine=112525378;
 //BA.debugLineNum = 112525378;BA.debugLine="ItemKala.fldFeeBadAzTakhfif=fee-ItemKala.Mablag";
_itemkala.fldFeeBadAzTakhfif /*String*/  = BA.NumberToString((double)(Double.parseDouble(_fee))-_itemkala.MablaghTakhfif /*int*/ );
 };
RDebugUtils.currentLine=112525381;
 //BA.debugLineNum = 112525381;BA.debugLine="ItemKala.FeeForoosh=fee";
_itemkala.FeeForoosh /*int*/  = (int)(Double.parseDouble(_fee));
RDebugUtils.currentLine=112525384;
 //BA.debugLineNum = 112525384;BA.debugLine="ItemKala.FldMablaghMasrafKonande=Cu.GetString(\"f";
_itemkala.FldMablaghMasrafKonande /*String*/  = _cu.GetString("fldGhymatMasrafkonande");
RDebugUtils.currentLine=112525387;
 //BA.debugLineNum = 112525387;BA.debugLine="ItemKala.fldPathPic=Cu.GetString(\"fldPathPic\")";
_itemkala.fldPathPic /*String*/  = _cu.GetString("fldPathPic");
RDebugUtils.currentLine=112525388;
 //BA.debugLineNum = 112525388;BA.debugLine="Dim c As Long=MCode.SingleResult(\"select count(F";
_c = BA.ObjectToLongNumber(mostCurrent._mcode._singleresult /*Object*/ (_ba,"select count(FldCodeKala) as count from TblSabad where FldCodeKala="+_itemkala.CodeKala /*String*/ ));
RDebugUtils.currentLine=112525389;
 //BA.debugLineNum = 112525389;BA.debugLine="If c>0 Then";
if (_c>0) { 
RDebugUtils.currentLine=112525390;
 //BA.debugLineNum = 112525390;BA.debugLine="Dim cu1 As Cursor=MCode.Result(\"select * from T";
_cu1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu1 = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (_ba,"select * from TblSabad where FldCodeKala="+_itemkala.CodeKala /*String*/ );
RDebugUtils.currentLine=112525391;
 //BA.debugLineNum = 112525391;BA.debugLine="If cu1.RowCount>0 Then";
if (_cu1.getRowCount()>0) { 
RDebugUtils.currentLine=112525392;
 //BA.debugLineNum = 112525392;BA.debugLine="cu1.Position=0";
_cu1.setPosition((int) (0));
RDebugUtils.currentLine=112525394;
 //BA.debugLineNum = 112525394;BA.debugLine="ItemKala.TedadDarSabadJoz =cu1.Getstring(\"FldT";
_itemkala.TedadDarSabadJoz /*String*/  = _cu1.GetString("FldTedadDarSabadJoz");
RDebugUtils.currentLine=112525395;
 //BA.debugLineNum = 112525395;BA.debugLine="ItemKala.TedadDarSabadKol =cu1.Getstring(\"FldT";
_itemkala.TedadDarSabadKol /*String*/  = _cu1.GetString("FldTedadDarSabadKol");
RDebugUtils.currentLine=112525396;
 //BA.debugLineNum = 112525396;BA.debugLine="ItemKala.SumMande=Cu.Getstring(\"SumMande\")-cu1";
_itemkala.SumMande /*String*/  = BA.NumberToString((double)(Double.parseDouble(_cu.GetString("SumMande")))-(double)(Double.parseDouble(_cu1.GetString("FldTedadDarSabadJoz"))));
RDebugUtils.currentLine=112525397;
 //BA.debugLineNum = 112525397;BA.debugLine="If Cu.Getstring(\"fldNameVahed2\") <> \"\" Then";
if ((_cu.GetString("fldNameVahed2")).equals("") == false) { 
RDebugUtils.currentLine=112525398;
 //BA.debugLineNum = 112525398;BA.debugLine="Dim FldFeeForoosh As Int = MCode.Sf.Val(Cu.Ge";
_fldfeeforoosh = (int) (mostCurrent._mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvvvv1(BA.NumberToString(_cu.GetInt("fldFeeForoosh"))));
RDebugUtils.currentLine=112525399;
 //BA.debugLineNum = 112525399;BA.debugLine="Dim FldTedadDarKarton As Int = MCode.Sf.Val(c";
_fldtedaddarkarton = (int) (mostCurrent._mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvvvv1(_cu1.GetString("FldTedadDarSabadKol")));
RDebugUtils.currentLine=112525400;
 //BA.debugLineNum = 112525400;BA.debugLine="Dim SumMande As Int = Cu.Getstring(\"SumMande\"";
_summande = (int)(Double.parseDouble(_cu.GetString("SumMande")));
RDebugUtils.currentLine=112525401;
 //BA.debugLineNum = 112525401;BA.debugLine="ItemKala.FeeForooshKarton=FldFeeForoosh * Fld";
_itemkala.FeeForooshKarton /*String*/  = BA.NumberToString(_fldfeeforoosh*_fldtedaddarkarton);
RDebugUtils.currentLine=112525402;
 //BA.debugLineNum = 112525402;BA.debugLine="ItemKala.SumMandeKarton=Round2( SumMande / Fl";
_itemkala.SumMandeKarton /*String*/  = BA.NumberToString(anywheresoftware.b4a.keywords.Common.Round2(_summande/(double)_fldtedaddarkarton,(int) (0)));
 };
RDebugUtils.currentLine=112525406;
 //BA.debugLineNum = 112525406;BA.debugLine="ItemKala.FldEshantion=cu1.Getstring(\"FldEshant";
_itemkala.FldEshantion /*String*/  = _cu1.GetString("FldEshantion");
RDebugUtils.currentLine=112525408;
 //BA.debugLineNum = 112525408;BA.debugLine="If	MCode.TakhfifKala=\"1\" Then";
if ((mostCurrent._mcode._takhfifkala /*String*/ ).equals("1")) { 
RDebugUtils.currentLine=112525411;
 //BA.debugLineNum = 112525411;BA.debugLine="If cu1.GetString(\"FldMablaghTakhfif\")>0 And c";
if ((double)(Double.parseDouble(_cu1.GetString("FldMablaghTakhfif")))>0 && _cu1.GetString("FldMablaghTakhfif")!= null) { 
RDebugUtils.currentLine=112525413;
 //BA.debugLineNum = 112525413;BA.debugLine="ItemKala.fldDarsadTakhfif=cu1.GetString(\"Fld";
_itemkala.fldDarsadTakhfif /*String*/  = _cu1.GetString("FldDarsadTakhfif");
RDebugUtils.currentLine=112525414;
 //BA.debugLineNum = 112525414;BA.debugLine="ItemKala.MablaghTakhfif=cu1.GetString(\"FldMa";
_itemkala.MablaghTakhfif /*int*/  = (int)(Double.parseDouble(_cu1.GetString("FldMablaghTakhfif")));
 }else {
RDebugUtils.currentLine=112525418;
 //BA.debugLineNum = 112525418;BA.debugLine="ItemKala.MablaghTakhfif=\"0\"";
_itemkala.MablaghTakhfif /*int*/  = (int)(Double.parseDouble("0"));
 };
 };
 };
RDebugUtils.currentLine=112525424;
 //BA.debugLineNum = 112525424;BA.debugLine="cu1.Close";
_cu1.Close();
 };
RDebugUtils.currentLine=112525427;
 //BA.debugLineNum = 112525427;BA.debugLine="If Cu.Getstring(\"fldNameVahed2\") <> \"\"  Then";
if ((_cu.GetString("fldNameVahed2")).equals("") == false) { 
RDebugUtils.currentLine=112525428;
 //BA.debugLineNum = 112525428;BA.debugLine="Dim FldFeeForoosh As Int = MCode.Sf.Val(Cu.GetI";
_fldfeeforoosh = (int) (mostCurrent._mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvvvv1(BA.NumberToString(_cu.GetInt("fldFeeForoosh"))));
RDebugUtils.currentLine=112525429;
 //BA.debugLineNum = 112525429;BA.debugLine="Dim FldTedadDarKarton As Int = MCode.Sf.Val(Cu.";
_fldtedaddarkarton = (int) (mostCurrent._mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvvvv1(_cu.GetString("fldTedadDarKarton")));
RDebugUtils.currentLine=112525430;
 //BA.debugLineNum = 112525430;BA.debugLine="Dim SumMande As Int = Cu.Getstring(\"SumMande\")";
_summande = (int)(Double.parseDouble(_cu.GetString("SumMande")));
RDebugUtils.currentLine=112525431;
 //BA.debugLineNum = 112525431;BA.debugLine="ItemKala.FeeForooshKarton=FldFeeForoosh * FldTe";
_itemkala.FeeForooshKarton /*String*/  = BA.NumberToString(_fldfeeforoosh*_fldtedaddarkarton);
RDebugUtils.currentLine=112525432;
 //BA.debugLineNum = 112525432;BA.debugLine="ItemKala.SumMandeKarton=Round2( SumMande / FldT";
_itemkala.SumMandeKarton /*String*/  = BA.NumberToString(anywheresoftware.b4a.keywords.Common.Round2(_summande/(double)_fldtedaddarkarton,(int) (0)));
 };
RDebugUtils.currentLine=112525437;
 //BA.debugLineNum = 112525437;BA.debugLine="OrginalListKala.Add(ItemKala)";
_orginallistkala.Add((Object)(_itemkala));
 }
};
 };
RDebugUtils.currentLine=112525443;
 //BA.debugLineNum = 112525443;BA.debugLine="Cu.Close";
_cu.Close();
RDebugUtils.currentLine=112525444;
 //BA.debugLineNum = 112525444;BA.debugLine="Return OrginalListKala";
if (true) return _orginallistkala;
RDebugUtils.currentLine=112525445;
 //BA.debugLineNum = 112525445;BA.debugLine="End Sub";
return null;
}
}