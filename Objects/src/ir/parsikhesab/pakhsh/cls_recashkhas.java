package ir.parsikhesab.pakhsh;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class cls_recashkhas extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "ir.parsikhesab.pakhsh.cls_recashkhas");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", ir.parsikhesab.pakhsh.cls_recashkhas.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.LabelWrapper _lblvisit = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblkharid = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbllastsefaresh = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbllastvisit = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbladdress = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbln_ashkhas = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblc_ashkhas = null;
public anywheresoftware.b4a.objects.drawable.ColorDrawable _opcol1 = null;
public anywheresoftware.b4a.objects.drawable.ColorDrawable _opcol2 = null;
public ir.parsikhesab.pakhsh.mcode._adapterlistashkhas _shakhs = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblmande = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblmovaghat = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbledit = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbldelete = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblsend = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblblacklist = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblmandeetebar = null;
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
public anywheresoftware.b4a.objects.PanelWrapper  _getpanel(ir.parsikhesab.pakhsh.cls_recashkhas __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recashkhas";
if (Debug.shouldDelegate(ba, "getpanel", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "getpanel", null));}
RDebugUtils.currentLine=25821184;
 //BA.debugLineNum = 25821184;BA.debugLine="Public Sub getPanel As Panel";
RDebugUtils.currentLine=25821185;
 //BA.debugLineNum = 25821185;BA.debugLine="pnl_bk.RemoveView";
__ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .RemoveView();
RDebugUtils.currentLine=25821186;
 //BA.debugLineNum = 25821186;BA.debugLine="Return pnl_bk";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ ;
RDebugUtils.currentLine=25821187;
 //BA.debugLineNum = 25821187;BA.debugLine="End Sub";
return null;
}
public int  _getheight(ir.parsikhesab.pakhsh.cls_recashkhas __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recashkhas";
if (Debug.shouldDelegate(ba, "getheight", false))
	 {return ((Integer) Debug.delegate(ba, "getheight", null));}
RDebugUtils.currentLine=25886720;
 //BA.debugLineNum = 25886720;BA.debugLine="Public Sub getHeight As Int";
RDebugUtils.currentLine=25886721;
 //BA.debugLineNum = 25886721;BA.debugLine="Return pnl_bk.Height";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight();
RDebugUtils.currentLine=25886722;
 //BA.debugLineNum = 25886722;BA.debugLine="End Sub";
return 0;
}
public String  _show(ir.parsikhesab.pakhsh.cls_recashkhas __ref,ir.parsikhesab.pakhsh.mcode._adapterlistashkhas _item,String _date) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recashkhas";
if (Debug.shouldDelegate(ba, "show", false))
	 {return ((String) Debug.delegate(ba, "show", new Object[] {_item,_date}));}
String _mande = "";
String _lastvisit = "";
anywheresoftware.b4a.objects.collections.List _str = null;
anywheresoftware.b4a.objects.collections.List _dt = null;
String _lastvisitdate = "";
String _lastvisittime = "";
String _datetimelastsefaresh = "";
long _countsefaresh = 0L;
String _lastsefareshdate = "";
String _lastsefareshtime = "";
String _dateshamsi = "";
anywheresoftware.b4a.objects.collections.List _lstdate = null;
RDebugUtils.currentLine=25755648;
 //BA.debugLineNum = 25755648;BA.debugLine="Public Sub show(item As AdapterListAshkhas,date As";
RDebugUtils.currentLine=25755649;
 //BA.debugLineNum = 25755649;BA.debugLine="shakhs=item";
__ref._shakhs /*ir.parsikhesab.pakhsh.mcode._adapterlistashkhas*/  = _item;
RDebugUtils.currentLine=25755650;
 //BA.debugLineNum = 25755650;BA.debugLine="LblN_Ashkhas.Text =\"نام:\"& item.SharhTafzili";
__ref._lbln_ashkhas /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("نام:"+_item.SharhTafzili /*String*/ ));
RDebugUtils.currentLine=25755653;
 //BA.debugLineNum = 25755653;BA.debugLine="If item.CodeTafzili <> Null  Then";
if (_item.CodeTafzili /*String*/ != null) { 
RDebugUtils.currentLine=25755654;
 //BA.debugLineNum = 25755654;BA.debugLine="LblC_Ashkhas.Text =\"کد:\"& item.CodeTafzili";
__ref._lblc_ashkhas /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("کد:"+_item.CodeTafzili /*String*/ ));
 }else {
RDebugUtils.currentLine=25755656;
 //BA.debugLineNum = 25755656;BA.debugLine="LblC_Ashkhas.Text =\"کد:\"";
__ref._lblc_ashkhas /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("کد:"));
 };
RDebugUtils.currentLine=25755659;
 //BA.debugLineNum = 25755659;BA.debugLine="If item.fldBlackList=1 Then";
if ((_item.fldBlackList /*String*/ ).equals(BA.NumberToString(1))) { 
RDebugUtils.currentLine=25755660;
 //BA.debugLineNum = 25755660;BA.debugLine="LblBlackList.Visible=True";
__ref._lblblacklist /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.True);
 }else {
RDebugUtils.currentLine=25755662;
 //BA.debugLineNum = 25755662;BA.debugLine="LblBlackList.Visible=False";
__ref._lblblacklist /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
 };
RDebugUtils.currentLine=25755668;
 //BA.debugLineNum = 25755668;BA.debugLine="If myCode.Is_Null(item.Mande)=\"\" Or item.Mande=";
if ((_mycode._is_null /*String*/ (ba,_item.Mande /*String*/ )).equals("") || (_item.Mande /*String*/ ).equals("")) { 
_item.Mande /*String*/  = BA.NumberToString(0);};
RDebugUtils.currentLine=25755669;
 //BA.debugLineNum = 25755669;BA.debugLine="If item.Mande=0 Then";
if ((_item.Mande /*String*/ ).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=25755670;
 //BA.debugLineNum = 25755670;BA.debugLine="LblMande.TextColor=Colors.Black";
__ref._lblmande /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=25755671;
 //BA.debugLineNum = 25755671;BA.debugLine="LblMande.Text =\"مانده حساب: \"&item.Mande";
__ref._lblmande /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("مانده حساب: "+_item.Mande /*String*/ ));
RDebugUtils.currentLine=25755672;
 //BA.debugLineNum = 25755672;BA.debugLine="LblMandeEtebar.Text=\"مانده اعتبار: \"&myCode.Adad";
__ref._lblmandeetebar /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("مانده اعتبار: "+_mycode._adadtoprice /*String*/ (ba,_item.fldSaghfeEtebar /*String*/ )));
 }else 
{RDebugUtils.currentLine=25755673;
 //BA.debugLineNum = 25755673;BA.debugLine="else If item.Mande>0 Then";
if ((double)(Double.parseDouble(_item.Mande /*String*/ ))>0) { 
RDebugUtils.currentLine=25755674;
 //BA.debugLineNum = 25755674;BA.debugLine="LblMande.TextColor=Colors.red";
__ref._lblmande /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(__c.Colors.Red);
RDebugUtils.currentLine=25755675;
 //BA.debugLineNum = 25755675;BA.debugLine="LblMande.Text =\"مانده حساب: \"& NumberFormat( A";
__ref._lblmande /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("مانده حساب: "+__c.NumberFormat(__c.Abs((double)(Double.parseDouble(_item.Mande /*String*/ ))),(int) (1),(int) (3))+" بد"));
RDebugUtils.currentLine=25755676;
 //BA.debugLineNum = 25755676;BA.debugLine="Dim mande As String=myCode.Is_Null_adad(item.Man";
_mande = _mycode._is_null_adad /*String*/ (ba,_item.Mande /*String*/ );
RDebugUtils.currentLine=25755677;
 //BA.debugLineNum = 25755677;BA.debugLine="LblMandeEtebar.Text=\"مانده اعتبار: \"&myCode.Adad";
__ref._lblmandeetebar /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("مانده اعتبار: "+_mycode._adadtoprice /*String*/ (ba,BA.NumberToString((double)(Double.parseDouble(_item.fldSaghfeEtebar /*String*/ ))-(double)(Double.parseDouble(_mande))))));
 }else 
{RDebugUtils.currentLine=25755678;
 //BA.debugLineNum = 25755678;BA.debugLine="Else if item.Mande<0 Then";
if ((double)(Double.parseDouble(_item.Mande /*String*/ ))<0) { 
RDebugUtils.currentLine=25755679;
 //BA.debugLineNum = 25755679;BA.debugLine="LblMande.TextColor= Colors.RGB(10,176,0)";
__ref._lblmande /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(__c.Colors.RGB((int) (10),(int) (176),(int) (0)));
RDebugUtils.currentLine=25755680;
 //BA.debugLineNum = 25755680;BA.debugLine="LblMande.Text =\"مانده حساب: \"& NumberFormat( A";
__ref._lblmande /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("مانده حساب: "+__c.NumberFormat(__c.Abs((double)(Double.parseDouble(_item.Mande /*String*/ ))),(int) (1),(int) (3))+" بس"));
RDebugUtils.currentLine=25755682;
 //BA.debugLineNum = 25755682;BA.debugLine="LblMandeEtebar.Text=\"مانده اعتبار: \"&myCode.Adad";
__ref._lblmandeetebar /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("مانده اعتبار: "+_mycode._adadtoprice /*String*/ (ba,_item.fldSaghfeEtebar /*String*/ )));
 }}}
;
RDebugUtils.currentLine=25755688;
 //BA.debugLineNum = 25755688;BA.debugLine="LblAddress.text =\"آدرس: \"& item.Address";
__ref._lbladdress /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("آدرس: "+_item.Address /*String*/ ));
RDebugUtils.currentLine=25755689;
 //BA.debugLineNum = 25755689;BA.debugLine="LblAddress.Typeface=MCode.Font2";
__ref._lbladdress /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTypeface((android.graphics.Typeface)(_mcode._font2 /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()));
RDebugUtils.currentLine=25755692;
 //BA.debugLineNum = 25755692;BA.debugLine="Dim lastVisit As String = myCode.Is_Null(item.las";
_lastvisit = _mycode._is_null /*String*/ (ba,_item.lastSeen /*String*/ );
RDebugUtils.currentLine=25755693;
 //BA.debugLineNum = 25755693;BA.debugLine="If lastVisit.Length = 0 Then";
if (_lastvisit.length()==0) { 
RDebugUtils.currentLine=25755694;
 //BA.debugLineNum = 25755694;BA.debugLine="LblLastVisit.Text=\"//\"";
__ref._lbllastvisit /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("//"));
 }else {
RDebugUtils.currentLine=25755696;
 //BA.debugLineNum = 25755696;BA.debugLine="Dim Str As List";
_str = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=25755697;
 //BA.debugLineNum = 25755697;BA.debugLine="Str.Initialize";
_str.Initialize();
RDebugUtils.currentLine=25755698;
 //BA.debugLineNum = 25755698;BA.debugLine="Str = MCode.Sf.Split(lastVisit.Replace(\"-\",\"/\"),";
_str = _mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvvv4(_lastvisit.replace("-","/"),"T");
RDebugUtils.currentLine=25755700;
 //BA.debugLineNum = 25755700;BA.debugLine="Dim DT As List = MCode.Sf.Split(Str.get(0),\"/\")";
_dt = new anywheresoftware.b4a.objects.collections.List();
_dt = _mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvvv4(BA.ObjectToString(_str.Get((int) (0))),"/");
RDebugUtils.currentLine=25755702;
 //BA.debugLineNum = 25755702;BA.debugLine="Log(DT.Get(0))";
__c.LogImpl("525755702",BA.ObjectToString(_dt.Get((int) (0))),0);
RDebugUtils.currentLine=25755705;
 //BA.debugLineNum = 25755705;BA.debugLine="Dim lastVisitDate As String =MCode.PersianDateDa";
_lastvisitdate = _mcode._persiandatedash /*String*/ (ba,BA.ObjectToString(_dt.Get((int) (0))));
RDebugUtils.currentLine=25755706;
 //BA.debugLineNum = 25755706;BA.debugLine="Dim lastVisitTime As String = Str.get(1)";
_lastvisittime = BA.ObjectToString(_str.Get((int) (1)));
RDebugUtils.currentLine=25755707;
 //BA.debugLineNum = 25755707;BA.debugLine="LblLastVisit.Text=lastVisitDate & CRLF & lastVis";
__ref._lbllastvisit /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_lastvisitdate+__c.CRLF+_lastvisittime));
 };
RDebugUtils.currentLine=25755710;
 //BA.debugLineNum = 25755710;BA.debugLine="If item.CodeTafzili.Length>5 Then";
if (_item.CodeTafzili /*String*/ .length()>5) { 
RDebugUtils.currentLine=25755711;
 //BA.debugLineNum = 25755711;BA.debugLine="LblMovaghat.Visible=True";
__ref._lblmovaghat /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=25755712;
 //BA.debugLineNum = 25755712;BA.debugLine="Dim DateTimeLastSefaresh As String = myCode.Is_N";
_datetimelastsefaresh = _mycode._is_null /*String*/ (ba,_item.lastOrderDate /*String*/ );
RDebugUtils.currentLine=25755713;
 //BA.debugLineNum = 25755713;BA.debugLine="Dim countSefaresh As Long=myCode.Is_Null_adad(MC";
_countsefaresh = (long)(Double.parseDouble(_mycode._is_null_adad /*String*/ (ba,BA.ObjectToString(_mcode._singleresult /*Object*/ (ba,"Select Count(FldId) From TblFaktor where FldC_Tafzili='"+_item.CodeTafzili /*String*/ +"'")))));
RDebugUtils.currentLine=25755714;
 //BA.debugLineNum = 25755714;BA.debugLine="If countSefaresh>0 And item.FldSync<>\"True\" Then";
if (_countsefaresh>0 && (_item.FldSync /*String*/ ).equals("True") == false) { 
RDebugUtils.currentLine=25755715;
 //BA.debugLineNum = 25755715;BA.debugLine="LblDelete.Visible=False";
__ref._lbldelete /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
 }else {
RDebugUtils.currentLine=25755717;
 //BA.debugLineNum = 25755717;BA.debugLine="LblDelete.Visible=True";
__ref._lbldelete /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.True);
 };
RDebugUtils.currentLine=25755720;
 //BA.debugLineNum = 25755720;BA.debugLine="If item.FldSync=\"True\" Then";
if ((_item.FldSync /*String*/ ).equals("True")) { 
RDebugUtils.currentLine=25755721;
 //BA.debugLineNum = 25755721;BA.debugLine="LblSend.Visible=True";
__ref._lblsend /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=25755722;
 //BA.debugLineNum = 25755722;BA.debugLine="LblEdit.Visible=False";
__ref._lbledit /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
 }else {
RDebugUtils.currentLine=25755724;
 //BA.debugLineNum = 25755724;BA.debugLine="LblSend.Visible=False";
__ref._lblsend /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=25755726;
 //BA.debugLineNum = 25755726;BA.debugLine="LblEdit.Visible=True";
__ref._lbledit /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.True);
 };
 }else {
RDebugUtils.currentLine=25755729;
 //BA.debugLineNum = 25755729;BA.debugLine="LblMovaghat.Visible=False";
__ref._lblmovaghat /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=25755730;
 //BA.debugLineNum = 25755730;BA.debugLine="LblEdit.Visible=False";
__ref._lbledit /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=25755731;
 //BA.debugLineNum = 25755731;BA.debugLine="LblDelete.Visible=False";
__ref._lbldelete /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=25755732;
 //BA.debugLineNum = 25755732;BA.debugLine="LblSend.Visible=False";
__ref._lblsend /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
 };
RDebugUtils.currentLine=25755737;
 //BA.debugLineNum = 25755737;BA.debugLine="Dim DateTimeLastSefaresh As String = myCode.Is_Nu";
_datetimelastsefaresh = _mycode._is_null /*String*/ (ba,_item.lastOrderDate /*String*/ );
RDebugUtils.currentLine=25755738;
 //BA.debugLineNum = 25755738;BA.debugLine="If DateTimeLastSefaresh.Length = 0 Then";
if (_datetimelastsefaresh.length()==0) { 
RDebugUtils.currentLine=25755739;
 //BA.debugLineNum = 25755739;BA.debugLine="LblLastSefaresh.Text=\"//\"";
__ref._lbllastsefaresh /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("//"));
 }else {
RDebugUtils.currentLine=25755741;
 //BA.debugLineNum = 25755741;BA.debugLine="Dim Str As List";
_str = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=25755742;
 //BA.debugLineNum = 25755742;BA.debugLine="Str.Initialize";
_str.Initialize();
RDebugUtils.currentLine=25755743;
 //BA.debugLineNum = 25755743;BA.debugLine="Str = MCode.Sf.Split(DateTimeLastSefaresh.Replac";
_str = _mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvvv4(_datetimelastsefaresh.replace("-","/"),"T");
RDebugUtils.currentLine=25755745;
 //BA.debugLineNum = 25755745;BA.debugLine="Dim DT As List = MCode.Sf.Split(Str.get(0),\"/\")";
_dt = new anywheresoftware.b4a.objects.collections.List();
_dt = _mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvvv4(BA.ObjectToString(_str.Get((int) (0))),"/");
RDebugUtils.currentLine=25755746;
 //BA.debugLineNum = 25755746;BA.debugLine="Dim LastSefareshDate As String = MCode.PersianDa";
_lastsefareshdate = _mcode._persiandatedash /*String*/ (ba,BA.ObjectToString(_dt.Get((int) (0))));
RDebugUtils.currentLine=25755747;
 //BA.debugLineNum = 25755747;BA.debugLine="Dim LastSefareshTime As String = Str.get(1)";
_lastsefareshtime = BA.ObjectToString(_str.Get((int) (1)));
RDebugUtils.currentLine=25755748;
 //BA.debugLineNum = 25755748;BA.debugLine="LblLastSefaresh.Text=LastSefareshDate & CRLF & L";
__ref._lbllastsefaresh /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_lastsefareshdate+__c.CRLF+_lastsefareshtime));
 };
RDebugUtils.currentLine=25755767;
 //BA.debugLineNum = 25755767;BA.debugLine="DateTime.DateFormat=\"yyyy-MM-dd\"";
__c.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=25755769;
 //BA.debugLineNum = 25755769;BA.debugLine="Dim DateShamsi As String = MCode.DatePersian";
_dateshamsi = _mcode._datepersian /*String*/ (ba);
RDebugUtils.currentLine=25755770;
 //BA.debugLineNum = 25755770;BA.debugLine="Dim LstDate As List";
_lstdate = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=25755771;
 //BA.debugLineNum = 25755771;BA.debugLine="LstDate.Initialize";
_lstdate.Initialize();
RDebugUtils.currentLine=25755773;
 //BA.debugLineNum = 25755773;BA.debugLine="If myCode.Is_Null(item.lastOrderDate).Length>2 Th";
if (_mycode._is_null /*String*/ (ba,_item.lastOrderDate /*String*/ ).length()>2) { 
RDebugUtils.currentLine=25755774;
 //BA.debugLineNum = 25755774;BA.debugLine="LstDate = MCode.Sf.Split(item.lastOrderDate,\"T\")";
_lstdate = _mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvvv4(_item.lastOrderDate /*String*/ ,"T");
RDebugUtils.currentLine=25755775;
 //BA.debugLineNum = 25755775;BA.debugLine="If LstDate.get(0)=DateShamsi Then";
if ((_lstdate.Get((int) (0))).equals((Object)(_dateshamsi))) { 
RDebugUtils.currentLine=25755776;
 //BA.debugLineNum = 25755776;BA.debugLine="LblKharid.Text= \"سفارش داده\"";
__ref._lblkharid /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("سفارش داده"));
RDebugUtils.currentLine=25755777;
 //BA.debugLineNum = 25755777;BA.debugLine="LblKharid.Background=OpCol2";
__ref._lblkharid /*anywheresoftware.b4a.objects.LabelWrapper*/ .setBackground((android.graphics.drawable.Drawable)(__ref._opcol2 /*anywheresoftware.b4a.objects.drawable.ColorDrawable*/ .getObject()));
 }else {
RDebugUtils.currentLine=25755779;
 //BA.debugLineNum = 25755779;BA.debugLine="LblKharid.Text= \"سفارش نداده\"";
__ref._lblkharid /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("سفارش نداده"));
RDebugUtils.currentLine=25755780;
 //BA.debugLineNum = 25755780;BA.debugLine="LblKharid.Background=OpCol1";
__ref._lblkharid /*anywheresoftware.b4a.objects.LabelWrapper*/ .setBackground((android.graphics.drawable.Drawable)(__ref._opcol1 /*anywheresoftware.b4a.objects.drawable.ColorDrawable*/ .getObject()));
 };
 }else {
RDebugUtils.currentLine=25755783;
 //BA.debugLineNum = 25755783;BA.debugLine="LblKharid.Text= \"سفارش نداده\"";
__ref._lblkharid /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("سفارش نداده"));
RDebugUtils.currentLine=25755784;
 //BA.debugLineNum = 25755784;BA.debugLine="LblKharid.Background=OpCol1";
__ref._lblkharid /*anywheresoftware.b4a.objects.LabelWrapper*/ .setBackground((android.graphics.drawable.Drawable)(__ref._opcol1 /*anywheresoftware.b4a.objects.drawable.ColorDrawable*/ .getObject()));
 };
RDebugUtils.currentLine=25755787;
 //BA.debugLineNum = 25755787;BA.debugLine="LstDate.Initialize";
_lstdate.Initialize();
RDebugUtils.currentLine=25755788;
 //BA.debugLineNum = 25755788;BA.debugLine="If myCode.Is_Null(item.lastSeen).Length>2 Then";
if (_mycode._is_null /*String*/ (ba,_item.lastSeen /*String*/ ).length()>2) { 
RDebugUtils.currentLine=25755789;
 //BA.debugLineNum = 25755789;BA.debugLine="Dim LstDate As List = MCode.Sf.Split(item.lastSe";
_lstdate = new anywheresoftware.b4a.objects.collections.List();
_lstdate = _mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvvv4(_item.lastSeen /*String*/ ,"T");
RDebugUtils.currentLine=25755790;
 //BA.debugLineNum = 25755790;BA.debugLine="If LstDate.get(0)=DateShamsi Then";
if ((_lstdate.Get((int) (0))).equals((Object)(_dateshamsi))) { 
RDebugUtils.currentLine=25755791;
 //BA.debugLineNum = 25755791;BA.debugLine="LblVisit.Text= \"ویزیت شده\"";
__ref._lblvisit /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("ویزیت شده"));
RDebugUtils.currentLine=25755792;
 //BA.debugLineNum = 25755792;BA.debugLine="LblVisit.Background=OpCol2";
__ref._lblvisit /*anywheresoftware.b4a.objects.LabelWrapper*/ .setBackground((android.graphics.drawable.Drawable)(__ref._opcol2 /*anywheresoftware.b4a.objects.drawable.ColorDrawable*/ .getObject()));
 }else {
RDebugUtils.currentLine=25755794;
 //BA.debugLineNum = 25755794;BA.debugLine="LblVisit.Text= \"ویزیت نشده\"";
__ref._lblvisit /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("ویزیت نشده"));
RDebugUtils.currentLine=25755795;
 //BA.debugLineNum = 25755795;BA.debugLine="LblVisit.Background=OpCol1";
__ref._lblvisit /*anywheresoftware.b4a.objects.LabelWrapper*/ .setBackground((android.graphics.drawable.Drawable)(__ref._opcol1 /*anywheresoftware.b4a.objects.drawable.ColorDrawable*/ .getObject()));
 };
 }else {
RDebugUtils.currentLine=25755798;
 //BA.debugLineNum = 25755798;BA.debugLine="LblVisit.Text= \"ویزیت نشده\"";
__ref._lblvisit /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("ویزیت نشده"));
RDebugUtils.currentLine=25755799;
 //BA.debugLineNum = 25755799;BA.debugLine="LblVisit.Background=OpCol1";
__ref._lblvisit /*anywheresoftware.b4a.objects.LabelWrapper*/ .setBackground((android.graphics.drawable.Drawable)(__ref._opcol1 /*anywheresoftware.b4a.objects.drawable.ColorDrawable*/ .getObject()));
 };
RDebugUtils.currentLine=25755801;
 //BA.debugLineNum = 25755801;BA.debugLine="End Sub";
return "";
}
public String  _initialize(ir.parsikhesab.pakhsh.cls_recashkhas __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cls_recashkhas";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
anywheresoftware.b4a.objects.drawable.ColorDrawable _op = null;
RDebugUtils.currentLine=25690112;
 //BA.debugLineNum = 25690112;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=25690113;
 //BA.debugLineNum = 25690113;BA.debugLine="p.Initialize(\"\")";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=25690114;
 //BA.debugLineNum = 25690114;BA.debugLine="p.SetLayout(0,0,100%x,100%y)";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .SetLayout((int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
RDebugUtils.currentLine=25690115;
 //BA.debugLineNum = 25690115;BA.debugLine="p.LoadLayout(\"L_RecAshkhas\")";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .LoadLayout("L_RecAshkhas",ba);
RDebugUtils.currentLine=25690116;
 //BA.debugLineNum = 25690116;BA.debugLine="Dim op As ColorDrawable";
_op = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=25690117;
 //BA.debugLineNum = 25690117;BA.debugLine="op.Initialize2(Colors.White,8dip,2dip,Colors.Blac";
_op.Initialize2(__c.Colors.White,__c.DipToCurrent((int) (8)),__c.DipToCurrent((int) (2)),__c.Colors.Black);
RDebugUtils.currentLine=25690118;
 //BA.debugLineNum = 25690118;BA.debugLine="OpCol1.Initialize2(Colors.RGB(255,106,106),5dip,1";
__ref._opcol1 /*anywheresoftware.b4a.objects.drawable.ColorDrawable*/ .Initialize2(__c.Colors.RGB((int) (255),(int) (106),(int) (106)),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (1)),__c.Colors.Black);
RDebugUtils.currentLine=25690119;
 //BA.debugLineNum = 25690119;BA.debugLine="OpCol2.Initialize2(Colors.RGB(213,213,0),5dip,1di";
__ref._opcol2 /*anywheresoftware.b4a.objects.drawable.ColorDrawable*/ .Initialize2(__c.Colors.RGB((int) (213),(int) (213),(int) (0)),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (1)),__c.Colors.Black);
RDebugUtils.currentLine=25690120;
 //BA.debugLineNum = 25690120;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(ir.parsikhesab.pakhsh.cls_recashkhas __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recashkhas";
RDebugUtils.currentLine=25624576;
 //BA.debugLineNum = 25624576;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=25624577;
 //BA.debugLineNum = 25624577;BA.debugLine="Private p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=25624578;
 //BA.debugLineNum = 25624578;BA.debugLine="Private pnl_bk As Panel";
_pnl_bk = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=25624579;
 //BA.debugLineNum = 25624579;BA.debugLine="Private LblVisit As Label";
_lblvisit = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=25624580;
 //BA.debugLineNum = 25624580;BA.debugLine="Private LblKharid As Label";
_lblkharid = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=25624581;
 //BA.debugLineNum = 25624581;BA.debugLine="Private LblLastSefaresh As Label";
_lbllastsefaresh = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=25624582;
 //BA.debugLineNum = 25624582;BA.debugLine="Private LblLastVisit As Label";
_lbllastvisit = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=25624583;
 //BA.debugLineNum = 25624583;BA.debugLine="Private LblAddress As Label";
_lbladdress = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=25624584;
 //BA.debugLineNum = 25624584;BA.debugLine="Private LblN_Ashkhas As Label";
_lbln_ashkhas = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=25624585;
 //BA.debugLineNum = 25624585;BA.debugLine="Private LblC_Ashkhas As Label";
_lblc_ashkhas = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=25624586;
 //BA.debugLineNum = 25624586;BA.debugLine="Private OpCol1 As ColorDrawable";
_opcol1 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=25624587;
 //BA.debugLineNum = 25624587;BA.debugLine="Private OpCol2 As ColorDrawable";
_opcol2 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=25624588;
 //BA.debugLineNum = 25624588;BA.debugLine="Private shakhs As AdapterListAshkhas";
_shakhs = new ir.parsikhesab.pakhsh.mcode._adapterlistashkhas();
RDebugUtils.currentLine=25624589;
 //BA.debugLineNum = 25624589;BA.debugLine="Private Panel1 As Panel";
_panel1 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=25624591;
 //BA.debugLineNum = 25624591;BA.debugLine="Private LblMande As Label";
_lblmande = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=25624592;
 //BA.debugLineNum = 25624592;BA.debugLine="Private LblMovaghat As Label";
_lblmovaghat = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=25624593;
 //BA.debugLineNum = 25624593;BA.debugLine="Private LblEdit As Label";
_lbledit = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=25624594;
 //BA.debugLineNum = 25624594;BA.debugLine="Private LblDelete As Label";
_lbldelete = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=25624595;
 //BA.debugLineNum = 25624595;BA.debugLine="Private LblSend As Label";
_lblsend = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=25624596;
 //BA.debugLineNum = 25624596;BA.debugLine="Private LblBlackList As Label";
_lblblacklist = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=25624597;
 //BA.debugLineNum = 25624597;BA.debugLine="Private LblMandeEtebar As Label";
_lblmandeetebar = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=25624599;
 //BA.debugLineNum = 25624599;BA.debugLine="End Sub";
return "";
}
public String  _kaladefault(ir.parsikhesab.pakhsh.cls_recashkhas __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recashkhas";
if (Debug.shouldDelegate(ba, "kaladefault", false))
	 {return ((String) Debug.delegate(ba, "kaladefault", null));}
RDebugUtils.currentLine=25952256;
 //BA.debugLineNum = 25952256;BA.debugLine="Sub KalaDefault";
RDebugUtils.currentLine=25952264;
 //BA.debugLineNum = 25952264;BA.debugLine="StartActivity(Act_KalaDefault)";
__c.StartActivity(ba,(Object)(_act_kaladefault.getObject()));
RDebugUtils.currentLine=25952265;
 //BA.debugLineNum = 25952265;BA.debugLine="CallSubDelayed(Act_SelectMantage,\"btn_Back_Click";
__c.CallSubDelayed(ba,(Object)(_act_selectmantage.getObject()),"btn_Back_Click");
RDebugUtils.currentLine=25952268;
 //BA.debugLineNum = 25952268;BA.debugLine="End Sub";
return "";
}
public String  _lbldelete_click(ir.parsikhesab.pakhsh.cls_recashkhas __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recashkhas";
if (Debug.shouldDelegate(ba, "lbldelete_click", false))
	 {return ((String) Debug.delegate(ba, "lbldelete_click", null));}
int _result = 0;
RDebugUtils.currentLine=26279936;
 //BA.debugLineNum = 26279936;BA.debugLine="Private Sub LblDelete_Click";
RDebugUtils.currentLine=26279937;
 //BA.debugLineNum = 26279937;BA.debugLine="Try";
try {RDebugUtils.currentLine=26279938;
 //BA.debugLineNum = 26279938;BA.debugLine="Dim result As Int";
_result = 0;
RDebugUtils.currentLine=26279939;
 //BA.debugLineNum = 26279939;BA.debugLine="result = Msgbox2(\"آیا مشتری جدید حذف شود؟\", \"حذف";
_result = __c.Msgbox2(BA.ObjectToCharSequence("آیا مشتری جدید حذف شود؟"),BA.ObjectToCharSequence("حذف مشتری جدید"),"بله","","خیر",(android.graphics.Bitmap)(__c.LoadBitmap(__c.File.getDirAssets(),"icon.png").getObject()),ba);
RDebugUtils.currentLine=26279940;
 //BA.debugLineNum = 26279940;BA.debugLine="If result = DialogResponse.Positive Then";
if (_result==__c.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=26279941;
 //BA.debugLineNum = 26279941;BA.debugLine="MCode.SaveUpdate(\"Delete From TblAshkhas where";
_mcode._saveupdate /*String*/ (ba,"Delete From TblAshkhas where fldCodetafzili='"+__ref._shakhs /*ir.parsikhesab.pakhsh.mcode._adapterlistashkhas*/ .CodeTafzili /*String*/ +"'");
RDebugUtils.currentLine=26279942;
 //BA.debugLineNum = 26279942;BA.debugLine="MCode.SaveUpdate(\"Delete From TblAshkhasNew whe";
_mcode._saveupdate /*String*/ (ba,"Delete From TblAshkhasNew where FldCodeTafzili='"+__ref._shakhs /*ir.parsikhesab.pakhsh.mcode._adapterlistashkhas*/ .CodeTafzili /*String*/ +"'");
RDebugUtils.currentLine=26279944;
 //BA.debugLineNum = 26279944;BA.debugLine="CallSub(Act_SelectMantage,\"LoadAshkhas\")";
__c.CallSubDebug(ba,(Object)(_act_selectmantage.getObject()),"LoadAshkhas");
RDebugUtils.currentLine=26279948;
 //BA.debugLineNum = 26279948;BA.debugLine="ToastMessageShow(\"شخص جدید با موفقیت حذف شد\",Fal";
__c.ToastMessageShow(BA.ObjectToCharSequence("شخص جدید با موفقیت حذف شد"),__c.False);
 };
 } 
       catch (Exception e11) {
			ba.setLastException(e11);RDebugUtils.currentLine=26279951;
 //BA.debugLineNum = 26279951;BA.debugLine="Log(LastException)";
__c.LogImpl("526279951",BA.ObjectToString(__c.LastException(ba)),0);
RDebugUtils.currentLine=26279952;
 //BA.debugLineNum = 26279952;BA.debugLine="ToastMessageShow(\"خطا در حذف شخص جدید\",False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("خطا در حذف شخص جدید"),__c.False);
 };
RDebugUtils.currentLine=26279955;
 //BA.debugLineNum = 26279955;BA.debugLine="End Sub";
return "";
}
public String  _lbledit_click(ir.parsikhesab.pakhsh.cls_recashkhas __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recashkhas";
if (Debug.shouldDelegate(ba, "lbledit_click", false))
	 {return ((String) Debug.delegate(ba, "lbledit_click", null));}
int _result = 0;
RDebugUtils.currentLine=26214400;
 //BA.debugLineNum = 26214400;BA.debugLine="Private Sub LblEdit_Click";
RDebugUtils.currentLine=26214401;
 //BA.debugLineNum = 26214401;BA.debugLine="Dim result As Int";
_result = 0;
RDebugUtils.currentLine=26214402;
 //BA.debugLineNum = 26214402;BA.debugLine="result = Msgbox2(\"آیا مشتری جدید ویرایش شود؟\", \"و";
_result = __c.Msgbox2(BA.ObjectToCharSequence("آیا مشتری جدید ویرایش شود؟"),BA.ObjectToCharSequence("ویرایش مشتری جدید"),"بله","","خیر",(android.graphics.Bitmap)(__c.LoadBitmap(__c.File.getDirAssets(),"icon.png").getObject()),ba);
RDebugUtils.currentLine=26214403;
 //BA.debugLineNum = 26214403;BA.debugLine="If result = DialogResponse.Positive Then";
if (_result==__c.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=26214404;
 //BA.debugLineNum = 26214404;BA.debugLine="MCode.UpdateShakhs=True";
_mcode._updateshakhs /*boolean*/  = __c.True;
RDebugUtils.currentLine=26214405;
 //BA.debugLineNum = 26214405;BA.debugLine="Act_NewAshkhas.shakhs=shakhs";
_act_newashkhas._shakhs /*ir.parsikhesab.pakhsh.mcode._adapterlistashkhas*/  = __ref._shakhs /*ir.parsikhesab.pakhsh.mcode._adapterlistashkhas*/ ;
RDebugUtils.currentLine=26214406;
 //BA.debugLineNum = 26214406;BA.debugLine="StartActivity(Act_NewAshkhas)";
__c.StartActivity(ba,(Object)(_act_newashkhas.getObject()));
 }else {
 };
RDebugUtils.currentLine=26214410;
 //BA.debugLineNum = 26214410;BA.debugLine="End Sub";
return "";
}
public String  _panel1_click(ir.parsikhesab.pakhsh.cls_recashkhas __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recashkhas";
if (Debug.shouldDelegate(ba, "panel1_click", false))
	 {return ((String) Debug.delegate(ba, "panel1_click", null));}
String _mande = "";
String _saghfeetebar = "";
RDebugUtils.currentLine=26017792;
 //BA.debugLineNum = 26017792;BA.debugLine="Sub Panel1_Click";
RDebugUtils.currentLine=26017794;
 //BA.debugLineNum = 26017794;BA.debugLine="MCode.C_Tafzili=shakhs.CodeTafzili";
_mcode._c_tafzili /*String*/  = __ref._shakhs /*ir.parsikhesab.pakhsh.mcode._adapterlistashkhas*/ .CodeTafzili /*String*/ ;
RDebugUtils.currentLine=26017795;
 //BA.debugLineNum = 26017795;BA.debugLine="MCode.N_Tafzili=shakhs.SharhTafzili";
_mcode._n_tafzili /*String*/  = __ref._shakhs /*ir.parsikhesab.pakhsh.mcode._adapterlistashkhas*/ .SharhTafzili /*String*/ ;
RDebugUtils.currentLine=26017796;
 //BA.debugLineNum = 26017796;BA.debugLine="Dim mande As String=myCode.Is_Null_adad(shakhs.Ma";
_mande = _mycode._is_null_adad /*String*/ (ba,__ref._shakhs /*ir.parsikhesab.pakhsh.mcode._adapterlistashkhas*/ .Mande /*String*/ );
RDebugUtils.currentLine=26017797;
 //BA.debugLineNum = 26017797;BA.debugLine="Dim SaghfeEtebar As String=myCode.Is_Null_adad(sh";
_saghfeetebar = _mycode._is_null_adad /*String*/ (ba,__ref._shakhs /*ir.parsikhesab.pakhsh.mcode._adapterlistashkhas*/ .fldSaghfeEtebar /*String*/ );
RDebugUtils.currentLine=26017798;
 //BA.debugLineNum = 26017798;BA.debugLine="MCode.MandeHesab=mande";
_mcode._mandehesab /*String*/  = _mande;
RDebugUtils.currentLine=26017799;
 //BA.debugLineNum = 26017799;BA.debugLine="If SaghfeEtebar>0 Then";
if ((double)(Double.parseDouble(_saghfeetebar))>0) { 
RDebugUtils.currentLine=26017800;
 //BA.debugLineNum = 26017800;BA.debugLine="If mande>0 Then";
if ((double)(Double.parseDouble(_mande))>0) { 
RDebugUtils.currentLine=26017801;
 //BA.debugLineNum = 26017801;BA.debugLine="MCode.MandeEtebar=SaghfeEtebar - mande";
_mcode._mandeetebar /*String*/  = BA.NumberToString((double)(Double.parseDouble(_saghfeetebar))-(double)(Double.parseDouble(_mande)));
 }else {
RDebugUtils.currentLine=26017803;
 //BA.debugLineNum = 26017803;BA.debugLine="MCode.MandeEtebar=SaghfeEtebar";
_mcode._mandeetebar /*String*/  = _saghfeetebar;
 };
RDebugUtils.currentLine=26017806;
 //BA.debugLineNum = 26017806;BA.debugLine="MCode.ManedEtebarEnable=True";
_mcode._manedetebarenable /*boolean*/  = __c.True;
 }else {
RDebugUtils.currentLine=26017808;
 //BA.debugLineNum = 26017808;BA.debugLine="MCode.ManedEtebarEnable=False";
_mcode._manedetebarenable /*boolean*/  = __c.False;
RDebugUtils.currentLine=26017809;
 //BA.debugLineNum = 26017809;BA.debugLine="MCode.MandeEtebar=0";
_mcode._mandeetebar /*String*/  = BA.NumberToString(0);
 };
RDebugUtils.currentLine=26017812;
 //BA.debugLineNum = 26017812;BA.debugLine="Log(\"مانده: \"& mande)";
__c.LogImpl("526017812","مانده: "+_mande,0);
RDebugUtils.currentLine=26017813;
 //BA.debugLineNum = 26017813;BA.debugLine="Log(\"سقف اعتبار: \"&SaghfeEtebar)";
__c.LogImpl("526017813","سقف اعتبار: "+_saghfeetebar,0);
RDebugUtils.currentLine=26017814;
 //BA.debugLineNum = 26017814;BA.debugLine="Log(\"مانده اعتبار: \"&MCode.MandeEtebar)";
__c.LogImpl("526017814","مانده اعتبار: "+_mcode._mandeetebar /*String*/ ,0);
RDebugUtils.currentLine=26017815;
 //BA.debugLineNum = 26017815;BA.debugLine="Log(\"وضعیت مانده اعتبار: \"&MCode.ManedEtebarEnabl";
__c.LogImpl("526017815","وضعیت مانده اعتبار: "+BA.ObjectToString(_mcode._manedetebarenable /*boolean*/ ),0);
RDebugUtils.currentLine=26017817;
 //BA.debugLineNum = 26017817;BA.debugLine="Select Case MCode.page";
switch (BA.switchObjectToInt(_mcode._page /*String*/ ,"Act_Moshtarian")) {
case 0: {
RDebugUtils.currentLine=26017820;
 //BA.debugLineNum = 26017820;BA.debugLine="StartActivity(Act_Profile)";
__c.StartActivity(ba,(Object)(_act_profile.getObject()));
 break; }
default: {
RDebugUtils.currentLine=26017822;
 //BA.debugLineNum = 26017822;BA.debugLine="visit";
__ref._visit /*String*/ (null);
RDebugUtils.currentLine=26017826;
 //BA.debugLineNum = 26017826;BA.debugLine="StartActivity(Act_KalaDefault)";
__c.StartActivity(ba,(Object)(_act_kaladefault.getObject()));
 break; }
}
;
RDebugUtils.currentLine=26017829;
 //BA.debugLineNum = 26017829;BA.debugLine="End Sub";
return "";
}
public String  _visit(ir.parsikhesab.pakhsh.cls_recashkhas __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recashkhas";
if (Debug.shouldDelegate(ba, "visit", false))
	 {return ((String) Debug.delegate(ba, "visit", null));}
String _date = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
RDebugUtils.currentLine=26083328;
 //BA.debugLineNum = 26083328;BA.debugLine="Sub visit";
RDebugUtils.currentLine=26083329;
 //BA.debugLineNum = 26083329;BA.debugLine="Dim Date As String = MCode.ConvertNumbersPersian2";
_date = _mcode._convertnumberspersian2english /*String*/ (ba,_mcode._datepersian /*String*/ (ba));
RDebugUtils.currentLine=26083330;
 //BA.debugLineNum = 26083330;BA.debugLine="If MCode.editFactor=False Then";
if (_mcode._editfactor /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=26083331;
 //BA.debugLineNum = 26083331;BA.debugLine="MCode.FaktorSelect=\"\"";
_mcode._faktorselect /*String*/  = "";
 };
RDebugUtils.currentLine=26083333;
 //BA.debugLineNum = 26083333;BA.debugLine="MCode.Action=\"SabtFaktor\"";
_mcode._action /*String*/  = "SabtFaktor";
RDebugUtils.currentLine=26083334;
 //BA.debugLineNum = 26083334;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * from Tb";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = _mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (ba,"Select * from TblLogVisitSefaresh Where FldC_Ashkhas = '"+_mcode._c_tafzili /*String*/ +"'");
RDebugUtils.currentLine=26083335;
 //BA.debugLineNum = 26083335;BA.debugLine="If Cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=26083336;
 //BA.debugLineNum = 26083336;BA.debugLine="MCode.SaveUpdate(\"Update TblLogVisitSefaresh Set";
_mcode._saveupdate /*String*/ (ba,"Update TblLogVisitSefaresh Set FldVisit = '"+_date+"' Where FldC_Ashkhas = '"+_mcode._c_tafzili /*String*/ +"'");
 }else {
RDebugUtils.currentLine=26083338;
 //BA.debugLineNum = 26083338;BA.debugLine="MCode.SaveUpdate(\"Insert Into TblLogVisitSefares";
_mcode._saveupdate /*String*/ (ba,"Insert Into TblLogVisitSefaresh (FldC_Ashkhas,FldVisit,FldSefaresh,FldElatSefaresh,FldLat,FldLon) Values ('"+_mcode._c_tafzili /*String*/ +"','"+_date+"','','','','')");
 };
RDebugUtils.currentLine=26083340;
 //BA.debugLineNum = 26083340;BA.debugLine="MCode.SaveUpdate(\"Update TblAshkhas Set FldLastVi";
_mcode._saveupdate /*String*/ (ba,"Update TblAshkhas Set FldLastVisit = '"+_date+"' Where fldCodetafzili = '"+_mcode._c_tafzili /*String*/ +"'");
RDebugUtils.currentLine=26083341;
 //BA.debugLineNum = 26083341;BA.debugLine="MCode.SaveUpdate(\"Update TblVisitorTour Set FldLa";
_mcode._saveupdate /*String*/ (ba,"Update TblVisitorTour Set FldLastVisit = '"+_date+"' Where FldC_Ashkhas = '"+_mcode._c_tafzili /*String*/ +"'");
RDebugUtils.currentLine=26083342;
 //BA.debugLineNum = 26083342;BA.debugLine="SaveLastSeen";
__ref._savelastseen /*String*/ (null);
RDebugUtils.currentLine=26083343;
 //BA.debugLineNum = 26083343;BA.debugLine="End Sub";
return "";
}
public String  _savelastseen(ir.parsikhesab.pakhsh.cls_recashkhas __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recashkhas";
if (Debug.shouldDelegate(ba, "savelastseen", false))
	 {return ((String) Debug.delegate(ba, "savelastseen", null));}
String _dateshamsi = "";
String _time = "";
String _d = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
int _count = 0;
int _maxradif = 0;
RDebugUtils.currentLine=26148864;
 //BA.debugLineNum = 26148864;BA.debugLine="Sub SaveLastSeen";
RDebugUtils.currentLine=26148866;
 //BA.debugLineNum = 26148866;BA.debugLine="DateTime.DateFormat=\"yyyy-MM-dd\"";
__c.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=26148868;
 //BA.debugLineNum = 26148868;BA.debugLine="Dim DateShamsi As String = MCode.DatePersian";
_dateshamsi = _mcode._datepersian /*String*/ (ba);
RDebugUtils.currentLine=26148869;
 //BA.debugLineNum = 26148869;BA.debugLine="Dim Time As String = DateTime.Time(DateTime.Now)";
_time = __c.DateTime.Time(__c.DateTime.getNow());
RDebugUtils.currentLine=26148870;
 //BA.debugLineNum = 26148870;BA.debugLine="Dim D As String = DateShamsi & \"T\" & Time";
_d = _dateshamsi+"T"+_time;
RDebugUtils.currentLine=26148871;
 //BA.debugLineNum = 26148871;BA.debugLine="LogColor(\"D: \" & D,Colors.Red)";
__c.LogImpl("526148871","D: "+_d,__c.Colors.Red);
RDebugUtils.currentLine=26148873;
 //BA.debugLineNum = 26148873;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From Tb";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = _mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (ba,"Select * From TblLastSeen Where FldC_Ashkhas = '"+_mcode._c_tafzili /*String*/ +"'");
RDebugUtils.currentLine=26148874;
 //BA.debugLineNum = 26148874;BA.debugLine="If Cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=26148875;
 //BA.debugLineNum = 26148875;BA.debugLine="MCode.SaveUpdate(\"Update TblLastSeen Set LastSee";
_mcode._saveupdate /*String*/ (ba,"Update TblLastSeen Set LastSeen = '"+_d+"' Where FldC_Ashkhas = '"+_mcode._c_tafzili /*String*/ +"'");
 }else {
RDebugUtils.currentLine=26148877;
 //BA.debugLineNum = 26148877;BA.debugLine="MCode.SaveUpdate(\"Insert Into TblLastSeen (FldC_";
_mcode._saveupdate /*String*/ (ba,"Insert Into TblLastSeen (FldC_Ashkhas,LastSeen) Values ('"+_mcode._c_tafzili /*String*/ +"','"+_d+"')");
 };
RDebugUtils.currentLine=26148879;
 //BA.debugLineNum = 26148879;BA.debugLine="MCode.SaveUpdate(\"Update TblAshkhas Set lastSeen";
_mcode._saveupdate /*String*/ (ba,"Update TblAshkhas Set lastSeen = '"+_d+"' Where fldCodetafzili = '"+_mcode._c_tafzili /*String*/ +"'");
RDebugUtils.currentLine=26148881;
 //BA.debugLineNum = 26148881;BA.debugLine="If MCode.TourVisitSW And MCode.TourVisit=1 Then";
if (_mcode._tourvisitsw /*boolean*/  && (_mcode._tourvisit /*String*/ ).equals(BA.NumberToString(1))) { 
RDebugUtils.currentLine=26148882;
 //BA.debugLineNum = 26148882;BA.debugLine="MCode.SaveUpdate(\"Update tblTourVisitor Set fldV";
_mcode._saveupdate /*String*/ (ba,"Update tblTourVisitor Set fldVaziat='2',fldTimeVisit='"+_time+"',fldSend='False' Where fldCodeTafzili = '"+_mcode._c_tafzili /*String*/ +"' and fldDateVisit='"+_mcode._datepersian /*String*/ (ba)+"' and fldType='Tour'");
 }else {
RDebugUtils.currentLine=26148884;
 //BA.debugLineNum = 26148884;BA.debugLine="Dim Count As Int = MCode.SingleResult($\"Select C";
_count = (int)(BA.ObjectToNumber(_mcode._singleresult /*Object*/ (ba,("Select Count(fldRadif) from tblTourVisitor where  fldDateVisit='"+__c.SmartStringFormatter("",(Object)(_mcode._datepersian /*String*/ (ba)))+"' and fldType='Free'"))));
RDebugUtils.currentLine=26148885;
 //BA.debugLineNum = 26148885;BA.debugLine="Dim MaxRadif As Int";
_maxradif = 0;
RDebugUtils.currentLine=26148886;
 //BA.debugLineNum = 26148886;BA.debugLine="If Count=0 Then";
if (_count==0) { 
RDebugUtils.currentLine=26148887;
 //BA.debugLineNum = 26148887;BA.debugLine="MaxRadif=1";
_maxradif = (int) (1);
 }else {
RDebugUtils.currentLine=26148889;
 //BA.debugLineNum = 26148889;BA.debugLine="MaxRadif= MCode.SingleResult($\"Select Max(fldRa";
_maxradif = (int)(BA.ObjectToNumber(_mcode._singleresult /*Object*/ (ba,("Select Max(fldRadif) from tblTourVisitor where  fldDateVisit='"+__c.SmartStringFormatter("",(Object)(_mcode._datepersian /*String*/ (ba)))+"' and fldType='Free'"))));
RDebugUtils.currentLine=26148890;
 //BA.debugLineNum = 26148890;BA.debugLine="MaxRadif=MaxRadif+1";
_maxradif = (int) (_maxradif+1);
 };
RDebugUtils.currentLine=26148892;
 //BA.debugLineNum = 26148892;BA.debugLine="Cu = MCode.Result($\"SELECT * FROM TblAshkhas WHE";
_cu = _mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (ba,("SELECT * FROM TblAshkhas WHERE TblAshkhas.fldCodetafzili ="+__c.SmartStringFormatter("",(Object)(_mcode._c_tafzili /*String*/ ))+""));
RDebugUtils.currentLine=26148894;
 //BA.debugLineNum = 26148894;BA.debugLine="Cu.Position=0";
_cu.setPosition((int) (0));
RDebugUtils.currentLine=26148895;
 //BA.debugLineNum = 26148895;BA.debugLine="MCode.SaveUpdate(\"Insert into tblTourVisitor(fld";
_mcode._saveupdate /*String*/ (ba,"Insert into tblTourVisitor(fldRadif,fldCodeSuperVisor,fldCodeGroup,fldCodeVisitor,fldCodeTafzili,fldSharheTafzili,fldDate,fldDateVisit,fldTimeVisit,fldDateNextVisit,fldDateTozie,fldShomareSefaresh,fldTimeSefaresh,fldSharh,fldVaziat,fldShomareFactor,fldSend,fldType) Values("+BA.NumberToString(_maxradif)+",0,'"+_cu.GetString("fldCodeGroup")+"','"+_mcode._c_visitor /*String*/ +"','"+_mcode._c_tafzili /*String*/ +"','"+_mcode._n_tafzili /*String*/ +"','"+_mcode._datepersian /*String*/ (ba)+"','"+_mcode._datepersian /*String*/ (ba)+"','"+_time+"','0','0','0','','0','2','0','False','Free')");
 };
RDebugUtils.currentLine=26148898;
 //BA.debugLineNum = 26148898;BA.debugLine="End Sub";
return "";
}
}