package ir.parsikhesab.pakhsh;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class cls_recsabadkhariditem extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "ir.parsikhesab.pakhsh.cls_recsabadkhariditem");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", ir.parsikhesab.pakhsh.cls_recsabadkhariditem.class).invoke(this, new Object[] {null});
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
public ir.parsikhesab.pakhsh.mcode._adapterlistkala _item = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnl_bk = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_price = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_title = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _img_kala = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltedadjoz = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltedadkol = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblremove = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltedadeshan = null;
public anywheresoftware.b4a.objects.LabelWrapper _btnupjoz = null;
public anywheresoftware.b4a.objects.LabelWrapper _btndownjoz = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _btnupkol = null;
public anywheresoftware.b4a.objects.LabelWrapper _btndownkol = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel3 = null;
public anywheresoftware.b4a.objects.LabelWrapper _btndowneshan = null;
public anywheresoftware.b4a.objects.LabelWrapper _btnupeshan = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtcomment = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblfeebadaztakhfid = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblvahedjoz = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblvahedkol = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblmojoodijoz = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblmojoodikol = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltozihat = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblgift = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageoff = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblc_kala = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltedadkarton = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblbuyprice = null;
public String _maxkolrond = "";
public anywheresoftware.b4a.objects.LabelWrapper _lblsummablaghkala = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblmablaghtakhfif = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbldarsadtakhfif = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnljoz = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlkol = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnleshan = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblfeeyekkarton = null;
public Object _base = null;
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
public String  _show_data(ir.parsikhesab.pakhsh.cls_recsabadkhariditem __ref,ir.parsikhesab.pakhsh.mcode._adapterlistkala _kala) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recsabadkhariditem";
if (Debug.shouldDelegate(ba, "show_data", false))
	 {return ((String) Debug.delegate(ba, "show_data", new Object[] {_kala}));}
int _fee = 0;
String _tedadkol = "";
String _feekol = "";
long _price = 0L;
RDebugUtils.currentLine=106299392;
 //BA.debugLineNum = 106299392;BA.debugLine="Public Sub show_data(kala As AdapterListKala)";
RDebugUtils.currentLine=106299393;
 //BA.debugLineNum = 106299393;BA.debugLine="Try";
try {RDebugUtils.currentLine=106299394;
 //BA.debugLineNum = 106299394;BA.debugLine="item=kala";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/  = _kala;
RDebugUtils.currentLine=106299395;
 //BA.debugLineNum = 106299395;BA.debugLine="LblC_Kala.Text = \"کد کالا: \" & item.CodeKala";
__ref._lblc_kala /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("کد کالا: "+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .CodeKala /*String*/ ));
RDebugUtils.currentLine=106299396;
 //BA.debugLineNum = 106299396;BA.debugLine="lbl_title.Text=item.NameKala";
__ref._lbl_title /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .NameKala /*String*/ ));
RDebugUtils.currentLine=106299414;
 //BA.debugLineNum = 106299414;BA.debugLine="Dim fee As Int";
_fee = 0;
RDebugUtils.currentLine=106299416;
 //BA.debugLineNum = 106299416;BA.debugLine="fee=item.FeeForoosh";
_fee = __ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FeeForoosh /*int*/ ;
RDebugUtils.currentLine=106299418;
 //BA.debugLineNum = 106299418;BA.debugLine="If item.MablaghTakhfif>0 Then";
if (__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .MablaghTakhfif /*int*/ >0) { 
RDebugUtils.currentLine=106299419;
 //BA.debugLineNum = 106299419;BA.debugLine="Dim tedadKol As String=item.TedadDarSabadJoz+(i";
_tedadkol = BA.NumberToString((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadJoz /*String*/ ))+((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadKol /*String*/ ))*(double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarKarton /*String*/ ))));
RDebugUtils.currentLine=106299420;
 //BA.debugLineNum = 106299420;BA.debugLine="Dim FeeKol As String=(item.FeeForoosh*tedadKol)";
_feekol = BA.NumberToString((__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FeeForoosh /*int*/ *(double)(Double.parseDouble(_tedadkol))));
RDebugUtils.currentLine=106299421;
 //BA.debugLineNum = 106299421;BA.debugLine="If tedadKol>0 Then";
if ((double)(Double.parseDouble(_tedadkol))>0) { 
RDebugUtils.currentLine=106299422;
 //BA.debugLineNum = 106299422;BA.debugLine="item.MablaghTakhfif=(((item.FeeForoosh*tedadKo";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .MablaghTakhfif /*int*/  = (int) ((((__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FeeForoosh /*int*/ *(double)(Double.parseDouble(_tedadkol)))*(double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldDarsadTakhfif /*String*/ )))/(double)100));
 }else {
RDebugUtils.currentLine=106299424;
 //BA.debugLineNum = 106299424;BA.debugLine="item.MablaghTakhfif=(((item.FeeForoosh)*item.f";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .MablaghTakhfif /*int*/  = (int) ((((__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FeeForoosh /*int*/ )*(double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldDarsadTakhfif /*String*/ )))/(double)100));
 };
RDebugUtils.currentLine=106299426;
 //BA.debugLineNum = 106299426;BA.debugLine="item.fldFeeBadAzTakhfif=FeeKol-item.MablaghTakh";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldFeeBadAzTakhfif /*String*/  = BA.NumberToString((double)(Double.parseDouble(_feekol))-__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .MablaghTakhfif /*int*/ );
RDebugUtils.currentLine=106299427;
 //BA.debugLineNum = 106299427;BA.debugLine="LblMablaghTakhfif.Text=\"فی تخفیف: \"& myCode.Ada";
__ref._lblmablaghtakhfif /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("فی تخفیف: "+_mycode._adadtoprice /*String*/ (ba,_mycode._is_null_adad /*String*/ (ba,BA.NumberToString(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .MablaghTakhfif /*int*/ )))));
RDebugUtils.currentLine=106299428;
 //BA.debugLineNum = 106299428;BA.debugLine="LblMablaghTakhfif.TextColor=Colors.Red";
__ref._lblmablaghtakhfif /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(__c.Colors.Red);
RDebugUtils.currentLine=106299429;
 //BA.debugLineNum = 106299429;BA.debugLine="lblDarsadTakhfif.TextColor=Colors.Red";
__ref._lbldarsadtakhfif /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(__c.Colors.Red);
RDebugUtils.currentLine=106299430;
 //BA.debugLineNum = 106299430;BA.debugLine="LblMablaghTakhfif.Visible=True";
__ref._lblmablaghtakhfif /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=106299431;
 //BA.debugLineNum = 106299431;BA.debugLine="lblDarsadTakhfif.Visible=True";
__ref._lbldarsadtakhfif /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=106299432;
 //BA.debugLineNum = 106299432;BA.debugLine="lblDarsadTakhfif.Text=\"درصد تخفیف: %\"& myCode.I";
__ref._lbldarsadtakhfif /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("درصد تخفیف: %"+_mycode._is_null_adad /*String*/ (ba,__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldDarsadTakhfif /*String*/ )));
 }else {
RDebugUtils.currentLine=106299434;
 //BA.debugLineNum = 106299434;BA.debugLine="lblDarsadTakhfif.Text=0";
__ref._lbldarsadtakhfif /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(0));
RDebugUtils.currentLine=106299435;
 //BA.debugLineNum = 106299435;BA.debugLine="LblMablaghTakhfif.Text=0";
__ref._lblmablaghtakhfif /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(0));
RDebugUtils.currentLine=106299436;
 //BA.debugLineNum = 106299436;BA.debugLine="LblMablaghTakhfif.Visible=False";
__ref._lblmablaghtakhfif /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=106299437;
 //BA.debugLineNum = 106299437;BA.debugLine="lblDarsadTakhfif.Visible=False";
__ref._lbldarsadtakhfif /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
 };
RDebugUtils.currentLine=106299441;
 //BA.debugLineNum = 106299441;BA.debugLine="If IsNumber(item.FldFeeBadAzTakhfif) = True Then";
if (__c.IsNumber(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldFeeBadAzTakhfif /*String*/ )==__c.True) { 
RDebugUtils.currentLine=106299448;
 //BA.debugLineNum = 106299448;BA.debugLine="If item.FldFeeBadAzTakhfif > 0 Then";
if ((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldFeeBadAzTakhfif /*String*/ ))>0) { 
RDebugUtils.currentLine=106299449;
 //BA.debugLineNum = 106299449;BA.debugLine="MCode.Rs.Initialize(\"فی فروش: \"& NumberFormat(";
_mcode._rs /*anywheresoftware.b4a.agraham.richstring.RichStringBuilder.RichString*/ .Initialize(BA.ObjectToCharSequence("فی فروش: "+__c.NumberFormat((double)(Double.parseDouble(_mycode._is_null_adad /*String*/ (ba,BA.NumberToString(_fee)))),(int) (1),(int) (3))+" "+_mcode._vahedpool /*String*/ ));
RDebugUtils.currentLine=106299450;
 //BA.debugLineNum = 106299450;BA.debugLine="MCode.Rs.Strikethrough (0, MCode.Rs.Length)";
_mcode._rs /*anywheresoftware.b4a.agraham.richstring.RichStringBuilder.RichString*/ .Strikethrough((int) (0),_mcode._rs /*anywheresoftware.b4a.agraham.richstring.RichStringBuilder.RichString*/ .getLength());
RDebugUtils.currentLine=106299451;
 //BA.debugLineNum = 106299451;BA.debugLine="MCode.Rs.Color(Colors.Red,0, MCode.Rs.Length)";
_mcode._rs /*anywheresoftware.b4a.agraham.richstring.RichStringBuilder.RichString*/ .Color(__c.Colors.Red,(int) (0),_mcode._rs /*anywheresoftware.b4a.agraham.richstring.RichStringBuilder.RichString*/ .getLength());
RDebugUtils.currentLine=106299452;
 //BA.debugLineNum = 106299452;BA.debugLine="lbl_Price.Text = MCode.Rs";
__ref._lbl_price /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_mcode._rs /*anywheresoftware.b4a.agraham.richstring.RichStringBuilder.RichString*/ .getObject()));
RDebugUtils.currentLine=106299453;
 //BA.debugLineNum = 106299453;BA.debugLine="LblFeeBadAzTakhfid.Text =\"فی بعد از تخفیف: \"&";
__ref._lblfeebadaztakhfid /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("فی بعد از تخفیف: "+__c.NumberFormat((double)(Double.parseDouble(_mycode._is_null_adad /*String*/ (ba,__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldFeeBadAzTakhfif /*String*/ ))),(int) (1),(int) (3))+" "+_mcode._vahedpool /*String*/ ));
RDebugUtils.currentLine=106299454;
 //BA.debugLineNum = 106299454;BA.debugLine="ImageOff.Visible=True";
__ref._imageoff /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .setVisible(__c.True);
 }else 
{RDebugUtils.currentLine=106299455;
 //BA.debugLineNum = 106299455;BA.debugLine="Else If item.FldFeeBadAzTakhfif = 0 And item.fl";
if ((__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldFeeBadAzTakhfif /*String*/ ).equals(BA.NumberToString(0)) && (__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldDarsadTakhfif /*String*/ ).equals(BA.NumberToString(100))) { 
RDebugUtils.currentLine=106299456;
 //BA.debugLineNum = 106299456;BA.debugLine="MCode.Rs.Initialize(\"فی فروش: \"& NumberFormat(";
_mcode._rs /*anywheresoftware.b4a.agraham.richstring.RichStringBuilder.RichString*/ .Initialize(BA.ObjectToCharSequence("فی فروش: "+__c.NumberFormat((double)(Double.parseDouble(_mycode._is_null_adad /*String*/ (ba,BA.NumberToString(_fee)))),(int) (1),(int) (3))+" "+_mcode._vahedpool /*String*/ ));
RDebugUtils.currentLine=106299457;
 //BA.debugLineNum = 106299457;BA.debugLine="MCode.Rs.Strikethrough (0, MCode.Rs.Length)";
_mcode._rs /*anywheresoftware.b4a.agraham.richstring.RichStringBuilder.RichString*/ .Strikethrough((int) (0),_mcode._rs /*anywheresoftware.b4a.agraham.richstring.RichStringBuilder.RichString*/ .getLength());
RDebugUtils.currentLine=106299458;
 //BA.debugLineNum = 106299458;BA.debugLine="MCode.Rs.Color(Colors.Red,0, MCode.Rs.Length)";
_mcode._rs /*anywheresoftware.b4a.agraham.richstring.RichStringBuilder.RichString*/ .Color(__c.Colors.Red,(int) (0),_mcode._rs /*anywheresoftware.b4a.agraham.richstring.RichStringBuilder.RichString*/ .getLength());
RDebugUtils.currentLine=106299459;
 //BA.debugLineNum = 106299459;BA.debugLine="item.MablaghTakhfif=(item.FeeForoosh*item.Teda";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .MablaghTakhfif /*int*/  = (int) ((__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FeeForoosh /*int*/ *(double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadJoz /*String*/ ))+((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadKol /*String*/ ))*(double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarKarton /*String*/ )))));
RDebugUtils.currentLine=106299460;
 //BA.debugLineNum = 106299460;BA.debugLine="item.FldFeeBadAzTakhfif=0";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldFeeBadAzTakhfif /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=106299461;
 //BA.debugLineNum = 106299461;BA.debugLine="lbl_Price.Text = 0";
__ref._lbl_price /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(0));
RDebugUtils.currentLine=106299462;
 //BA.debugLineNum = 106299462;BA.debugLine="LblFeeBadAzTakhfid.Text =\"فی بعد از تخفیف: \"&";
__ref._lblfeebadaztakhfid /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("فی بعد از تخفیف: "+__c.NumberFormat((double)(Double.parseDouble(_mycode._is_null_adad /*String*/ (ba,__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldFeeBadAzTakhfif /*String*/ ))),(int) (1),(int) (3))+" "+_mcode._vahedpool /*String*/ ));
RDebugUtils.currentLine=106299463;
 //BA.debugLineNum = 106299463;BA.debugLine="ImageOff.Visible=True";
__ref._imageoff /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .setVisible(__c.True);
 }else 
{RDebugUtils.currentLine=106299464;
 //BA.debugLineNum = 106299464;BA.debugLine="Else If item.FldFeeBadAzTakhfif = 0 Then";
if ((__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldFeeBadAzTakhfif /*String*/ ).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=106299465;
 //BA.debugLineNum = 106299465;BA.debugLine="MCode.Rs.Initialize(\"فی فروش: \"& NumberFormat(";
_mcode._rs /*anywheresoftware.b4a.agraham.richstring.RichStringBuilder.RichString*/ .Initialize(BA.ObjectToCharSequence("فی فروش: "+__c.NumberFormat((double)(Double.parseDouble(_mycode._is_null_adad /*String*/ (ba,BA.NumberToString(_fee)))),(int) (1),(int) (3))+" "+_mcode._vahedpool /*String*/ ));
RDebugUtils.currentLine=106299466;
 //BA.debugLineNum = 106299466;BA.debugLine="MCode.Rs.Strikethrough (0, MCode.Rs.Length)";
_mcode._rs /*anywheresoftware.b4a.agraham.richstring.RichStringBuilder.RichString*/ .Strikethrough((int) (0),_mcode._rs /*anywheresoftware.b4a.agraham.richstring.RichStringBuilder.RichString*/ .getLength());
RDebugUtils.currentLine=106299467;
 //BA.debugLineNum = 106299467;BA.debugLine="MCode.Rs.Color(Colors.Red,0, MCode.Rs.Length)";
_mcode._rs /*anywheresoftware.b4a.agraham.richstring.RichStringBuilder.RichString*/ .Color(__c.Colors.Red,(int) (0),_mcode._rs /*anywheresoftware.b4a.agraham.richstring.RichStringBuilder.RichString*/ .getLength());
RDebugUtils.currentLine=106299468;
 //BA.debugLineNum = 106299468;BA.debugLine="lbl_Price.Text = MCode.Rs";
__ref._lbl_price /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_mcode._rs /*anywheresoftware.b4a.agraham.richstring.RichStringBuilder.RichString*/ .getObject()));
RDebugUtils.currentLine=106299469;
 //BA.debugLineNum = 106299469;BA.debugLine="LblFeeBadAzTakhfid.Text =\"فی بعد از تخفیف: \"&";
__ref._lblfeebadaztakhfid /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("فی بعد از تخفیف: "+__c.NumberFormat((double)(Double.parseDouble(_mycode._is_null_adad /*String*/ (ba,__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldFeeBadAzTakhfif /*String*/ ))),(int) (1),(int) (3))+" "+_mcode._vahedpool /*String*/ ));
RDebugUtils.currentLine=106299470;
 //BA.debugLineNum = 106299470;BA.debugLine="ImageOff.Visible=True";
__ref._imageoff /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .setVisible(__c.True);
 }else {
RDebugUtils.currentLine=106299472;
 //BA.debugLineNum = 106299472;BA.debugLine="lbl_Price.Text =\"فی فروش: \"& NumberFormat(myCo";
__ref._lbl_price /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("فی فروش: "+__c.NumberFormat((double)(Double.parseDouble(_mycode._is_null_adad /*String*/ (ba,BA.NumberToString(_fee)))),(int) (1),(int) (3))+" "+_mcode._vahedpool /*String*/ ));
RDebugUtils.currentLine=106299473;
 //BA.debugLineNum = 106299473;BA.debugLine="LblFeeBadAzTakhfid.Text = \"\"";
__ref._lblfeebadaztakhfid /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=106299474;
 //BA.debugLineNum = 106299474;BA.debugLine="ImageOff.Visible=False";
__ref._imageoff /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .setVisible(__c.False);
 }}}
;
 }else {
RDebugUtils.currentLine=106299477;
 //BA.debugLineNum = 106299477;BA.debugLine="lbl_Price.Text =\"فی فروش: \"& NumberFormat(myCod";
__ref._lbl_price /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("فی فروش: "+__c.NumberFormat((double)(Double.parseDouble(_mycode._is_null_adad /*String*/ (ba,BA.NumberToString(_fee)))),(int) (1),(int) (3))+" "+_mcode._vahedpool /*String*/ ));
RDebugUtils.currentLine=106299478;
 //BA.debugLineNum = 106299478;BA.debugLine="LblFeeBadAzTakhfid.Text = \"\"";
__ref._lblfeebadaztakhfid /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(""));
 };
RDebugUtils.currentLine=106299539;
 //BA.debugLineNum = 106299539;BA.debugLine="item.FldEshantion=myCode.Is_Null_adad(item.FldEs";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FldEshantion /*String*/  = _mycode._is_null_adad /*String*/ (ba,__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FldEshantion /*String*/ );
RDebugUtils.currentLine=106299542;
 //BA.debugLineNum = 106299542;BA.debugLine="Dim Price As Long=0";
_price = (long) (0);
RDebugUtils.currentLine=106299549;
 //BA.debugLineNum = 106299549;BA.debugLine="Price = item.FeeForoosh * ((item.TedadDarSabadKo";
_price = (long) (__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FeeForoosh /*int*/ *(((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadKol /*String*/ ))*(double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarKarton /*String*/ )))+(double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadJoz /*String*/ ))));
RDebugUtils.currentLine=106299553;
 //BA.debugLineNum = 106299553;BA.debugLine="If Price>0 Then";
if (_price>0) { 
RDebugUtils.currentLine=106299554;
 //BA.debugLineNum = 106299554;BA.debugLine="lblSumMablaghKala.Text=\"جمع مبلغ: \"& NumberForm";
__ref._lblsummablaghkala /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("جمع مبلغ: "+__c.NumberFormat((double)(Double.parseDouble(_mycode._is_null_adad /*String*/ (ba,BA.NumberToString(_price)))),(int) (1),(int) (3))+" "+_mcode._vahedpool /*String*/ ));
 }else {
RDebugUtils.currentLine=106299556;
 //BA.debugLineNum = 106299556;BA.debugLine="lblSumMablaghKala.Text=\"جمع مبلغ: 0\"";
__ref._lblsummablaghkala /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("جمع مبلغ: 0"));
 };
RDebugUtils.currentLine=106299559;
 //BA.debugLineNum = 106299559;BA.debugLine="lblTedadjoz.Text = item.TedadDarSabadJoz";
__ref._lbltedadjoz /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadJoz /*String*/ ));
RDebugUtils.currentLine=106299560;
 //BA.debugLineNum = 106299560;BA.debugLine="lblVahedJoz.Text = \"تعداد به \"& item.NameVahed";
__ref._lblvahedjoz /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("تعداد به "+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .NameVahed /*String*/ ));
RDebugUtils.currentLine=106299561;
 //BA.debugLineNum = 106299561;BA.debugLine="lblTedadKol.Text = item.TedadDarSabadKol";
__ref._lbltedadkol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadKol /*String*/ ));
RDebugUtils.currentLine=106299562;
 //BA.debugLineNum = 106299562;BA.debugLine="lblVahedKol.Text = \"تعداد به \"& item.NameVahed2";
__ref._lblvahedkol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("تعداد به "+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .NameVahed2 /*String*/ ));
RDebugUtils.currentLine=106299563;
 //BA.debugLineNum = 106299563;BA.debugLine="LblTedadEshan.Text = myCode.Is_Null_adad(item.Fl";
__ref._lbltedadeshan /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_mycode._is_null_adad /*String*/ (ba,__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FldEshantion /*String*/ )));
RDebugUtils.currentLine=106299564;
 //BA.debugLineNum = 106299564;BA.debugLine="txtComment.Text=item.Tozihat";
__ref._txtcomment /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .Tozihat /*String*/ ));
RDebugUtils.currentLine=106299566;
 //BA.debugLineNum = 106299566;BA.debugLine="If item.Tozihat <> \"\"   Then";
if ((__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .Tozihat /*String*/ ).equals("") == false) { 
RDebugUtils.currentLine=106299567;
 //BA.debugLineNum = 106299567;BA.debugLine="LblTozihat.Visible=True";
__ref._lbltozihat /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.True);
 }else {
RDebugUtils.currentLine=106299569;
 //BA.debugLineNum = 106299569;BA.debugLine="LblTozihat.Visible=False";
__ref._lbltozihat /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
 };
RDebugUtils.currentLine=106299571;
 //BA.debugLineNum = 106299571;BA.debugLine="myCode.DownloadImage5(item.CodeKala,item.fldPath";
_mycode._downloadimage5 /*String*/ (ba,__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .CodeKala /*String*/ ,__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldPathPic /*String*/ ,__ref._img_kala /*anywheresoftware.b4a.objects.ImageViewWrapper*/ );
RDebugUtils.currentLine=106299587;
 //BA.debugLineNum = 106299587;BA.debugLine="If item.TedadDarKarton<>0 And IsNumber(item.Teda";
if ((__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarKarton /*String*/ ).equals(BA.NumberToString(0)) == false && __c.IsNumber(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarKarton /*String*/ )==__c.True) { 
RDebugUtils.currentLine=106299588;
 //BA.debugLineNum = 106299588;BA.debugLine="maxkolRond=(item.SumMandeKarton)";
__ref._maxkolrond /*String*/  = (__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMandeKarton /*String*/ );
RDebugUtils.currentLine=106299590;
 //BA.debugLineNum = 106299590;BA.debugLine="If item.NameVahed2=\"\" Then";
if ((__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .NameVahed2 /*String*/ ).equals("")) { 
RDebugUtils.currentLine=106299591;
 //BA.debugLineNum = 106299591;BA.debugLine="LblTedadKarton.Text=\"تعداد در کارتن: \"& item.T";
__ref._lbltedadkarton /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("تعداد در کارتن: "+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarKarton /*String*/ ));
 }else {
RDebugUtils.currentLine=106299593;
 //BA.debugLineNum = 106299593;BA.debugLine="LblTedadKarton.Text=\"تعداد در \"&item.NameVahed";
__ref._lbltedadkarton /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("تعداد در "+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .NameVahed2 /*String*/ +": "+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarKarton /*String*/ ));
 };
RDebugUtils.currentLine=106299595;
 //BA.debugLineNum = 106299595;BA.debugLine="LblFeeYekKarton.Text=\"فی یک کارتن: \"&myCode.Ada";
__ref._lblfeeyekkarton /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("فی یک کارتن: "+_mycode._adadtoprice /*String*/ (ba,BA.NumberToString(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FeeForoosh /*int*/ *(double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarKarton /*String*/ ))))));
RDebugUtils.currentLine=106299596;
 //BA.debugLineNum = 106299596;BA.debugLine="Log(maxkolRond)";
__c.LogImpl("5106299596",__ref._maxkolrond /*String*/ ,0);
 }else {
RDebugUtils.currentLine=106299598;
 //BA.debugLineNum = 106299598;BA.debugLine="maxkolRond=0";
__ref._maxkolrond /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=106299600;
 //BA.debugLineNum = 106299600;BA.debugLine="If item.NameVahed2=\"\" Then";
if ((__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .NameVahed2 /*String*/ ).equals("")) { 
RDebugUtils.currentLine=106299601;
 //BA.debugLineNum = 106299601;BA.debugLine="LblTedadKarton.Text=\"تعداد در کارتن: \"& maxkol";
__ref._lbltedadkarton /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("تعداد در کارتن: "+__ref._maxkolrond /*String*/ ));
 }else {
RDebugUtils.currentLine=106299603;
 //BA.debugLineNum = 106299603;BA.debugLine="LblTedadKarton.Text=\"تعداد در \"&item.NameVahed";
__ref._lbltedadkarton /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("تعداد در "+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .NameVahed2 /*String*/ +": "+__ref._maxkolrond /*String*/ ));
 };
RDebugUtils.currentLine=106299605;
 //BA.debugLineNum = 106299605;BA.debugLine="LblFeeYekKarton.Text=\"فی یک کارتن: \"&0";
__ref._lblfeeyekkarton /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("فی یک کارتن: "+BA.NumberToString(0)));
RDebugUtils.currentLine=106299606;
 //BA.debugLineNum = 106299606;BA.debugLine="LblMojoodiKol.Text =\"موجودی کل: -\"";
__ref._lblmojoodikol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("موجودی کل: -"));
 };
RDebugUtils.currentLine=106299608;
 //BA.debugLineNum = 106299608;BA.debugLine="Log(maxkolRond)";
__c.LogImpl("5106299608",__ref._maxkolrond /*String*/ ,0);
RDebugUtils.currentLine=106299609;
 //BA.debugLineNum = 106299609;BA.debugLine="LblMojoodiJoz.Text =\"موجودی جزء: \"& item.SumMand";
__ref._lblmojoodijoz /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("موجودی جزء: "+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/ +" "+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .NameVahed /*String*/ ));
RDebugUtils.currentLine=106299611;
 //BA.debugLineNum = 106299611;BA.debugLine="If  item.SumMandeKarton <> Null Then";
if (__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMandeKarton /*String*/ != null) { 
RDebugUtils.currentLine=106299612;
 //BA.debugLineNum = 106299612;BA.debugLine="LblMojoodiKol.Text =\"موجودی کل: \"& maxkolRond &";
__ref._lblmojoodikol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("موجودی کل: "+__ref._maxkolrond /*String*/ +" "+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .NameVahed2 /*String*/ ));
 }else {
RDebugUtils.currentLine=106299614;
 //BA.debugLineNum = 106299614;BA.debugLine="LblMojoodiKol.Text =\"موجودی کل: -\"";
__ref._lblmojoodikol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("موجودی کل: -"));
 };
RDebugUtils.currentLine=106299618;
 //BA.debugLineNum = 106299618;BA.debugLine="AddEshantion(item.TedadDarSabadJoz)";
__ref._addeshantion /*String*/ (null,(int)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadJoz /*String*/ )));
RDebugUtils.currentLine=106299619;
 //BA.debugLineNum = 106299619;BA.debugLine="LblBuyPrice.Text=\"قیمت مصرف کننده \"& myCode.Adad";
__ref._lblbuyprice /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("قیمت مصرف کننده "+_mycode._adadtoprice /*String*/ (ba,__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FldMablaghMasrafKonande /*String*/ )));
RDebugUtils.currentLine=106299620;
 //BA.debugLineNum = 106299620;BA.debugLine="LblTedadKarton.Text=\"تعداد در کارتن \"&item.Tedad";
__ref._lbltedadkarton /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("تعداد در کارتن "+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarKarton /*String*/ ));
RDebugUtils.currentLine=106299641;
 //BA.debugLineNum = 106299641;BA.debugLine="If MCode.HideMojodi=1 Then";
if ((_mcode._hidemojodi /*String*/ ).equals(BA.NumberToString(1))) { 
RDebugUtils.currentLine=106299642;
 //BA.debugLineNum = 106299642;BA.debugLine="LblMojoodiJoz.Visible=False";
__ref._lblmojoodijoz /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=106299643;
 //BA.debugLineNum = 106299643;BA.debugLine="LblMojoodiKol.Visible=False";
__ref._lblmojoodikol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
 }else {
RDebugUtils.currentLine=106299645;
 //BA.debugLineNum = 106299645;BA.debugLine="LblMojoodiJoz.Visible=True";
__ref._lblmojoodijoz /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=106299646;
 //BA.debugLineNum = 106299646;BA.debugLine="LblMojoodiKol.Visible=True";
__ref._lblmojoodikol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.True);
 };
 } 
       catch (Exception e118) {
			ba.setLastException(e118);RDebugUtils.currentLine=106299725;
 //BA.debugLineNum = 106299725;BA.debugLine="Log(kala.NameKala)";
__c.LogImpl("5106299725",_kala.NameKala /*String*/ ,0);
RDebugUtils.currentLine=106299726;
 //BA.debugLineNum = 106299726;BA.debugLine="Img_Kala.Enabled=False";
__ref._img_kala /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=106299727;
 //BA.debugLineNum = 106299727;BA.debugLine="Log(LastException)";
__c.LogImpl("5106299727",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=106299735;
 //BA.debugLineNum = 106299735;BA.debugLine="End Sub";
return "";
}
public int  _getheight(ir.parsikhesab.pakhsh.cls_recsabadkhariditem __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recsabadkhariditem";
if (Debug.shouldDelegate(ba, "getheight", false))
	 {return ((Integer) Debug.delegate(ba, "getheight", null));}
RDebugUtils.currentLine=106692608;
 //BA.debugLineNum = 106692608;BA.debugLine="Public Sub getHeight As Int";
RDebugUtils.currentLine=106692609;
 //BA.debugLineNum = 106692609;BA.debugLine="Return pnl_BK.Height+10dip";
if (true) return (int) (__ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()+__c.DipToCurrent((int) (10)));
RDebugUtils.currentLine=106692610;
 //BA.debugLineNum = 106692610;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(ir.parsikhesab.pakhsh.cls_recsabadkhariditem __ref,anywheresoftware.b4a.BA _ba,Object _mdl) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cls_recsabadkhariditem";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_mdl}));}
RDebugUtils.currentLine=106168320;
 //BA.debugLineNum = 106168320;BA.debugLine="Public Sub Initialize(mdl As Object)";
RDebugUtils.currentLine=106168321;
 //BA.debugLineNum = 106168321;BA.debugLine="base = mdl";
__ref._base /*Object*/  = _mdl;
RDebugUtils.currentLine=106168322;
 //BA.debugLineNum = 106168322;BA.debugLine="p.Initialize(\"\")";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=106168323;
 //BA.debugLineNum = 106168323;BA.debugLine="p.SetLayout(0,0,100%x,100%y)";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .SetLayout((int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
RDebugUtils.currentLine=106168324;
 //BA.debugLineNum = 106168324;BA.debugLine="p.LoadLayout(\"L_RecSabadKharidItem_2\")";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .LoadLayout("L_RecSabadKharidItem_2",ba);
RDebugUtils.currentLine=106168326;
 //BA.debugLineNum = 106168326;BA.debugLine="MojavezSefaresh";
__ref._mojavezsefaresh /*String*/ (null);
RDebugUtils.currentLine=106168327;
 //BA.debugLineNum = 106168327;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _getpanel(ir.parsikhesab.pakhsh.cls_recsabadkhariditem __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recsabadkhariditem";
if (Debug.shouldDelegate(ba, "getpanel", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "getpanel", null));}
RDebugUtils.currentLine=106627072;
 //BA.debugLineNum = 106627072;BA.debugLine="Public Sub getPanel As Panel";
RDebugUtils.currentLine=106627073;
 //BA.debugLineNum = 106627073;BA.debugLine="pnl_BK.RemoveView";
__ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .RemoveView();
RDebugUtils.currentLine=106627074;
 //BA.debugLineNum = 106627074;BA.debugLine="Return pnl_BK";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ ;
RDebugUtils.currentLine=106627075;
 //BA.debugLineNum = 106627075;BA.debugLine="End Sub";
return null;
}
public int  _getwidth(ir.parsikhesab.pakhsh.cls_recsabadkhariditem __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recsabadkhariditem";
if (Debug.shouldDelegate(ba, "getwidth", false))
	 {return ((Integer) Debug.delegate(ba, "getwidth", null));}
RDebugUtils.currentLine=106758144;
 //BA.debugLineNum = 106758144;BA.debugLine="Public Sub getWidth As Int";
RDebugUtils.currentLine=106758145;
 //BA.debugLineNum = 106758145;BA.debugLine="Return pnl_BK.Width+5dip";
if (true) return (int) (__ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()+__c.DipToCurrent((int) (5)));
RDebugUtils.currentLine=106758146;
 //BA.debugLineNum = 106758146;BA.debugLine="End Sub";
return 0;
}
public String  _addeshantion(ir.parsikhesab.pakhsh.cls_recsabadkhariditem __ref,int _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recsabadkhariditem";
if (Debug.shouldDelegate(ba, "addeshantion", false))
	 {return ((String) Debug.delegate(ba, "addeshantion", new Object[] {_t}));}
RDebugUtils.currentLine=106364928;
 //BA.debugLineNum = 106364928;BA.debugLine="Sub AddEshantion(t As Int)";
RDebugUtils.currentLine=106364957;
 //BA.debugLineNum = 106364957;BA.debugLine="End Sub";
return "";
}
public String  _addeshantion2(ir.parsikhesab.pakhsh.cls_recsabadkhariditem __ref,anywheresoftware.b4a.sql.SQL.CursorWrapper _itemsabad) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recsabadkhariditem";
if (Debug.shouldDelegate(ba, "addeshantion2", false))
	 {return ((String) Debug.delegate(ba, "addeshantion2", new Object[] {_itemsabad}));}
String _codekala = "";
String _tedaddarkarton = "";
String _fldtedaddarsabadjoz = "";
String _fldtedaddarsabadkol = "";
String _eshantion = "";
String _tedadsabad = "";
int _tedadkol = 0;
anywheresoftware.b4a.objects.collections.List _listeshantion = null;
ir.parsikhesab.pakhsh.mcode._adapterlisteshantion _itemmax = null;
int _fldtedadforooshmax = 0;
int _fldtedadeshantionmax = 0;
String _tedadeshantion = "";
String _codekalaeshantation = "";
int _u = 0;
int _i = 0;
ir.parsikhesab.pakhsh.mcode._adapterlisteshantion _item1 = null;
int _fldtedadforoosh = 0;
int _fldtedadeshantion = 0;
String _query = "";
anywheresoftware.b4a.objects.collections.List _lst = null;
ir.parsikhesab.pakhsh.mcode._adapterlistkala _item2 = null;
ir.parsikhesab.pakhsh.cls_recdefultkala _rec = null;
int _j = 0;
RDebugUtils.currentLine=106496000;
 //BA.debugLineNum = 106496000;BA.debugLine="Sub AddEshantion2(ItemSabad As Cursor)";
RDebugUtils.currentLine=106496001;
 //BA.debugLineNum = 106496001;BA.debugLine="Try";
try {RDebugUtils.currentLine=106496002;
 //BA.debugLineNum = 106496002;BA.debugLine="Dim CodeKala As String =ItemSabad.GetString(\"Fld";
_codekala = _itemsabad.GetString("FldCodeKala");
RDebugUtils.currentLine=106496003;
 //BA.debugLineNum = 106496003;BA.debugLine="Dim TedadDarKarton As String =myCode.Is_Null_ada";
_tedaddarkarton = _mycode._is_null_adad /*String*/ (ba,_itemsabad.GetString("FldTedadDarKarton"));
RDebugUtils.currentLine=106496004;
 //BA.debugLineNum = 106496004;BA.debugLine="Dim FldTedadDarSabadJoz As String =myCode.Is_Nul";
_fldtedaddarsabadjoz = _mycode._is_null_adad /*String*/ (ba,_itemsabad.GetString("FldTedadDarSabadJoz"));
RDebugUtils.currentLine=106496005;
 //BA.debugLineNum = 106496005;BA.debugLine="Dim FldTedadDarSabadKol As String =myCode.Is_Nul";
_fldtedaddarsabadkol = _mycode._is_null_adad /*String*/ (ba,_itemsabad.GetString("FldTedadDarSabadKol"));
RDebugUtils.currentLine=106496006;
 //BA.debugLineNum = 106496006;BA.debugLine="Dim Eshantion As String= ItemSabad.GetString(\"Fl";
_eshantion = _itemsabad.GetString("FldEshantion");
RDebugUtils.currentLine=106496007;
 //BA.debugLineNum = 106496007;BA.debugLine="Dim TedadSabad As String=0";
_tedadsabad = BA.NumberToString(0);
RDebugUtils.currentLine=106496008;
 //BA.debugLineNum = 106496008;BA.debugLine="If TedadDarKarton>0 Then";
if ((double)(Double.parseDouble(_tedaddarkarton))>0) { 
RDebugUtils.currentLine=106496009;
 //BA.debugLineNum = 106496009;BA.debugLine="Dim tedadKol As Int=(TedadDarKarton*FldTedadDar";
_tedadkol = (int) (((double)(Double.parseDouble(_tedaddarkarton))*(double)(Double.parseDouble(_fldtedaddarsabadkol))));
RDebugUtils.currentLine=106496010;
 //BA.debugLineNum = 106496010;BA.debugLine="TedadSabad=tedadKol+FldTedadDarSabadJoz";
_tedadsabad = BA.NumberToString(_tedadkol+(double)(Double.parseDouble(_fldtedaddarsabadjoz)));
 }else {
RDebugUtils.currentLine=106496012;
 //BA.debugLineNum = 106496012;BA.debugLine="TedadSabad=FldTedadDarSabadJoz";
_tedadsabad = _fldtedaddarsabadjoz;
 };
RDebugUtils.currentLine=106496014;
 //BA.debugLineNum = 106496014;BA.debugLine="Dim ListEshantion As List";
_listeshantion = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=106496015;
 //BA.debugLineNum = 106496015;BA.debugLine="ListEshantion.Initialize";
_listeshantion.Initialize();
RDebugUtils.currentLine=106496016;
 //BA.debugLineNum = 106496016;BA.debugLine="ListEshantion=MCode.LoadEshantionTabaghati(CodeK";
_listeshantion = _mcode._loadeshantiontabaghati /*anywheresoftware.b4a.objects.collections.List*/ (ba,_codekala);
RDebugUtils.currentLine=106496017;
 //BA.debugLineNum = 106496017;BA.debugLine="If ListEshantion.Size>0 Then";
if (_listeshantion.getSize()>0) { 
RDebugUtils.currentLine=106496018;
 //BA.debugLineNum = 106496018;BA.debugLine="Dim ItemMax = ListEshantion.Get(ListEshantion.S";
_itemmax = (ir.parsikhesab.pakhsh.mcode._adapterlisteshantion)(_listeshantion.Get((int) (_listeshantion.getSize()-1)));
RDebugUtils.currentLine=106496019;
 //BA.debugLineNum = 106496019;BA.debugLine="Dim fldTedadForooshMax As Int=ItemMax.fldTedadF";
_fldtedadforooshmax = (int)(Double.parseDouble(_itemmax.fldTedadForoosh /*String*/ ));
RDebugUtils.currentLine=106496020;
 //BA.debugLineNum = 106496020;BA.debugLine="Dim fldTedadEshantionMax As Int=ItemMax.fldTeda";
_fldtedadeshantionmax = (int)(Double.parseDouble(_itemmax.fldTedadEshantion /*String*/ ));
RDebugUtils.currentLine=106496021;
 //BA.debugLineNum = 106496021;BA.debugLine="Dim TedadEshantion As String";
_tedadeshantion = "";
RDebugUtils.currentLine=106496022;
 //BA.debugLineNum = 106496022;BA.debugLine="Dim CodeKalaEshantation As String=0";
_codekalaeshantation = BA.NumberToString(0);
RDebugUtils.currentLine=106496023;
 //BA.debugLineNum = 106496023;BA.debugLine="CodeKalaEshantation=ItemMax.fldCodeKalaEshantio";
_codekalaeshantation = _itemmax.fldCodeKalaEshantion /*String*/ ;
RDebugUtils.currentLine=106496024;
 //BA.debugLineNum = 106496024;BA.debugLine="If TedadSabad=fldTedadForooshMax Then";
if ((_tedadsabad).equals(BA.NumberToString(_fldtedadforooshmax))) { 
RDebugUtils.currentLine=106496025;
 //BA.debugLineNum = 106496025;BA.debugLine="TedadEshantion=fldTedadEshantionMax";
_tedadeshantion = BA.NumberToString(_fldtedadeshantionmax);
 }else 
{RDebugUtils.currentLine=106496026;
 //BA.debugLineNum = 106496026;BA.debugLine="else if TedadSabad > fldTedadForooshMax Then";
if ((double)(Double.parseDouble(_tedadsabad))>_fldtedadforooshmax) { 
RDebugUtils.currentLine=106496027;
 //BA.debugLineNum = 106496027;BA.debugLine="Dim u As Int=0";
_u = (int) (0);
RDebugUtils.currentLine=106496028;
 //BA.debugLineNum = 106496028;BA.debugLine="u=(TedadSabad/fldTedadForooshMax)";
_u = (int) (((double)(Double.parseDouble(_tedadsabad))/(double)_fldtedadforooshmax));
RDebugUtils.currentLine=106496029;
 //BA.debugLineNum = 106496029;BA.debugLine="TedadEshantion=u*fldTedadEshantionMax";
_tedadeshantion = BA.NumberToString(_u*_fldtedadeshantionmax);
 }else 
{RDebugUtils.currentLine=106496030;
 //BA.debugLineNum = 106496030;BA.debugLine="Else If TedadSabad < fldTedadForooshMax Then";
if ((double)(Double.parseDouble(_tedadsabad))<_fldtedadforooshmax) { 
RDebugUtils.currentLine=106496031;
 //BA.debugLineNum = 106496031;BA.debugLine="For i=0 To ListEshantion.Size-2";
{
final int step31 = 1;
final int limit31 = (int) (_listeshantion.getSize()-2);
_i = (int) (0) ;
for (;_i <= limit31 ;_i = _i + step31 ) {
RDebugUtils.currentLine=106496032;
 //BA.debugLineNum = 106496032;BA.debugLine="Dim item1 = ListEshantion.Get(i) As AdapterLi";
_item1 = (ir.parsikhesab.pakhsh.mcode._adapterlisteshantion)(_listeshantion.Get(_i));
RDebugUtils.currentLine=106496033;
 //BA.debugLineNum = 106496033;BA.debugLine="Log(item1.fldCodeKalaForoosh)";
__c.LogImpl("5106496033",_item1.fldCodeKalaForoosh /*String*/ ,0);
RDebugUtils.currentLine=106496034;
 //BA.debugLineNum = 106496034;BA.debugLine="Log(item1.fldCodeKalaEshantion)";
__c.LogImpl("5106496034",_item1.fldCodeKalaEshantion /*String*/ ,0);
RDebugUtils.currentLine=106496035;
 //BA.debugLineNum = 106496035;BA.debugLine="Dim fldTedadForoosh As Int=item1.fldTedadForo";
_fldtedadforoosh = (int)(Double.parseDouble(_item1.fldTedadForoosh /*String*/ ));
RDebugUtils.currentLine=106496036;
 //BA.debugLineNum = 106496036;BA.debugLine="Dim fldTedadEshantion As Int=item1.fldTedadEs";
_fldtedadeshantion = (int)(Double.parseDouble(_item1.fldTedadEshantion /*String*/ ));
RDebugUtils.currentLine=106496037;
 //BA.debugLineNum = 106496037;BA.debugLine="CodeKalaEshantation=item1.fldCodeKalaEshantio";
_codekalaeshantation = _item1.fldCodeKalaEshantion /*String*/ ;
RDebugUtils.currentLine=106496038;
 //BA.debugLineNum = 106496038;BA.debugLine="Log(fldTedadForoosh)";
__c.LogImpl("5106496038",BA.NumberToString(_fldtedadforoosh),0);
RDebugUtils.currentLine=106496039;
 //BA.debugLineNum = 106496039;BA.debugLine="Log(item1.fldTedadEshantion)";
__c.LogImpl("5106496039",_item1.fldTedadEshantion /*String*/ ,0);
RDebugUtils.currentLine=106496040;
 //BA.debugLineNum = 106496040;BA.debugLine="If TedadSabad= fldTedadForoosh Then";
if ((_tedadsabad).equals(BA.NumberToString(_fldtedadforoosh))) { 
RDebugUtils.currentLine=106496041;
 //BA.debugLineNum = 106496041;BA.debugLine="TedadEshantion=fldTedadEshantion";
_tedadeshantion = BA.NumberToString(_fldtedadeshantion);
 }else 
{RDebugUtils.currentLine=106496042;
 //BA.debugLineNum = 106496042;BA.debugLine="else if TedadSabad>fldTedadForoosh Then";
if ((double)(Double.parseDouble(_tedadsabad))>_fldtedadforoosh) { 
RDebugUtils.currentLine=106496043;
 //BA.debugLineNum = 106496043;BA.debugLine="Dim u As Int=0";
_u = (int) (0);
RDebugUtils.currentLine=106496044;
 //BA.debugLineNum = 106496044;BA.debugLine="u=(TedadSabad/fldTedadForoosh)";
_u = (int) (((double)(Double.parseDouble(_tedadsabad))/(double)_fldtedadforoosh));
RDebugUtils.currentLine=106496045;
 //BA.debugLineNum = 106496045;BA.debugLine="TedadEshantion=u*fldTedadEshantion";
_tedadeshantion = BA.NumberToString(_u*_fldtedadeshantion);
 }else 
{RDebugUtils.currentLine=106496046;
 //BA.debugLineNum = 106496046;BA.debugLine="else if TedadSabad<fldTedadForoosh Then";
if ((double)(Double.parseDouble(_tedadsabad))<_fldtedadforoosh) { 
RDebugUtils.currentLine=106496047;
 //BA.debugLineNum = 106496047;BA.debugLine="TedadEshantion=0";
_tedadeshantion = BA.NumberToString(0);
 }}}
;
 }
};
 }}}
;
RDebugUtils.currentLine=106496051;
 //BA.debugLineNum = 106496051;BA.debugLine="If TedadEshantion>0 Then";
if ((double)(Double.parseDouble(_tedadeshantion))>0) { 
RDebugUtils.currentLine=106496053;
 //BA.debugLineNum = 106496053;BA.debugLine="Dim Query As String=\"select * from TblKala whe";
_query = "select * from TblKala where fldCodeKala="+_codekalaeshantation;
RDebugUtils.currentLine=106496054;
 //BA.debugLineNum = 106496054;BA.debugLine="Dim lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=106496055;
 //BA.debugLineNum = 106496055;BA.debugLine="lst.Initialize";
_lst.Initialize();
RDebugUtils.currentLine=106496056;
 //BA.debugLineNum = 106496056;BA.debugLine="lst=MCode.LoadListKala(Query)";
_lst = _mcode._loadlistkala /*anywheresoftware.b4a.objects.collections.List*/ (ba,_query);
RDebugUtils.currentLine=106496057;
 //BA.debugLineNum = 106496057;BA.debugLine="Dim item2 = lst.Get(0) As AdapterListKala";
_item2 = (ir.parsikhesab.pakhsh.mcode._adapterlistkala)(_lst.Get((int) (0)));
RDebugUtils.currentLine=106496058;
 //BA.debugLineNum = 106496058;BA.debugLine="Dim rec As CLs_RecDefultKala";
_rec = new ir.parsikhesab.pakhsh.cls_recdefultkala();
RDebugUtils.currentLine=106496059;
 //BA.debugLineNum = 106496059;BA.debugLine="rec.Initialize(Me)";
_rec._initialize /*String*/ (null,ba,this);
RDebugUtils.currentLine=106496060;
 //BA.debugLineNum = 106496060;BA.debugLine="rec.Show(item2,0)";
_rec._show /*void*/ (null,_item2,(int) (0));
RDebugUtils.currentLine=106496061;
 //BA.debugLineNum = 106496061;BA.debugLine="item2.TedadDarSabadJoz=0";
_item2.TedadDarSabadJoz /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=106496062;
 //BA.debugLineNum = 106496062;BA.debugLine="item2.TedadDarSabadKol=0";
_item2.TedadDarSabadKol /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=106496063;
 //BA.debugLineNum = 106496063;BA.debugLine="item2.fldCountEshantion=TedadEshantion";
_item2.fldCountEshantion /*String*/  = _tedadeshantion;
RDebugUtils.currentLine=106496065;
 //BA.debugLineNum = 106496065;BA.debugLine="For j=0 To TedadEshantion-1";
{
final int step63 = 1;
final int limit63 = (int) ((double)(Double.parseDouble(_tedadeshantion))-1);
_j = (int) (0) ;
for (;_j <= limit63 ;_j = _j + step63 ) {
RDebugUtils.currentLine=106496066;
 //BA.debugLineNum = 106496066;BA.debugLine="rec.BtnUpEshan_Click";
_rec._btnupeshan_click /*String*/ (null);
 }
};
RDebugUtils.currentLine=106496069;
 //BA.debugLineNum = 106496069;BA.debugLine="MCode.AddToSabad(item2)";
_mcode._addtosabad /*String*/ (ba,_item2);
 };
RDebugUtils.currentLine=106496073;
 //BA.debugLineNum = 106496073;BA.debugLine="CallSubDelayed(Act_Sabad,\"LoadListSabad\")";
__c.CallSubDelayed(ba,(Object)(_act_sabad.getObject()),"LoadListSabad");
 };
 } 
       catch (Exception e71) {
			ba.setLastException(e71);RDebugUtils.currentLine=106496077;
 //BA.debugLineNum = 106496077;BA.debugLine="Log(LastException)";
__c.LogImpl("5106496077",BA.ObjectToString(__c.LastException(ba)),0);
RDebugUtils.currentLine=106496078;
 //BA.debugLineNum = 106496078;BA.debugLine="myCode.SendError(LastException,\"AddEshantion2\")";
_mycode._senderror /*void*/ (ba,BA.ObjectToString(__c.LastException(ba)),"AddEshantion2");
 };
RDebugUtils.currentLine=106496107;
 //BA.debugLineNum = 106496107;BA.debugLine="End Sub";
return "";
}
public String  _addtosabad(ir.parsikhesab.pakhsh.cls_recsabadkhariditem __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recsabadkhariditem";
if (Debug.shouldDelegate(ba, "addtosabad", false))
	 {return ((String) Debug.delegate(ba, "addtosabad", null));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
boolean _check = false;
int _i = 0;
RDebugUtils.currentLine=107413504;
 //BA.debugLineNum = 107413504;BA.debugLine="Sub AddToSabad";
RDebugUtils.currentLine=107413550;
 //BA.debugLineNum = 107413550;BA.debugLine="lblTedadjoz.Text = item.TedadDarSabadJoz";
__ref._lbltedadjoz /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadJoz /*String*/ ));
RDebugUtils.currentLine=107413551;
 //BA.debugLineNum = 107413551;BA.debugLine="lblTedadKol.Text = item.TedadDarSabadKol";
__ref._lbltedadkol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadKol /*String*/ ));
RDebugUtils.currentLine=107413552;
 //BA.debugLineNum = 107413552;BA.debugLine="LblTedadEshan.Text = item.FldEshantion";
__ref._lbltedadeshan /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FldEshantion /*String*/ ));
RDebugUtils.currentLine=107413554;
 //BA.debugLineNum = 107413554;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From Tb";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = _mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (ba,"Select * From TblSabad");
RDebugUtils.currentLine=107413555;
 //BA.debugLineNum = 107413555;BA.debugLine="Dim Check As Boolean";
_check = false;
RDebugUtils.currentLine=107413556;
 //BA.debugLineNum = 107413556;BA.debugLine="For i=0 To Cu.RowCount -1";
{
final int step6 = 1;
final int limit6 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=107413557;
 //BA.debugLineNum = 107413557;BA.debugLine="Cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=107413558;
 //BA.debugLineNum = 107413558;BA.debugLine="If Cu.GetString(\"FldCodeKala\") = item.CodeKala T";
if ((_cu.GetString("FldCodeKala")).equals(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .CodeKala /*String*/ )) { 
RDebugUtils.currentLine=107413559;
 //BA.debugLineNum = 107413559;BA.debugLine="If item.TedadDarSabadJoz = 0 And item.TedadDarS";
if ((__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadJoz /*String*/ ).equals(BA.NumberToString(0)) && (__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadKol /*String*/ ).equals(BA.NumberToString(0)) && (__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FldEshantion /*String*/ ).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=107413560;
 //BA.debugLineNum = 107413560;BA.debugLine="MCode.SaveUpdate(\"Delete From TblSabad Where F";
_mcode._saveupdate /*String*/ (ba,"Delete From TblSabad Where FldCodeKala = '"+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .CodeKala /*String*/ +"'");
 }else {
RDebugUtils.currentLine=107413562;
 //BA.debugLineNum = 107413562;BA.debugLine="MCode.SaveUpdate(\"Update TblSabad Set FldTedad";
_mcode._saveupdate /*String*/ (ba,"Update TblSabad Set FldTedadDarSabadJoz = '"+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadJoz /*String*/ +"',FldTedadDarSabadKol = '"+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadKol /*String*/ +"',FldMablaghTakhfif = '"+BA.NumberToString(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .MablaghTakhfif /*int*/ )+"',FldEshantion = '"+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FldEshantion /*String*/ +"' Where FldCodeKala = '"+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .CodeKala /*String*/ +"'");
 };
RDebugUtils.currentLine=107413565;
 //BA.debugLineNum = 107413565;BA.debugLine="Check = True";
_check = __c.True;
RDebugUtils.currentLine=107413566;
 //BA.debugLineNum = 107413566;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=107413569;
 //BA.debugLineNum = 107413569;BA.debugLine="If Check = False Then";
if (_check==__c.False) { 
RDebugUtils.currentLine=107413570;
 //BA.debugLineNum = 107413570;BA.debugLine="MCode.AddToSabad(item)";
_mcode._addtosabad /*String*/ (ba,__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ );
 };
RDebugUtils.currentLine=107413573;
 //BA.debugLineNum = 107413573;BA.debugLine="CallSubDelayed(Act_Sabad,\"SaveChange\")";
__c.CallSubDelayed(ba,(Object)(_act_sabad.getObject()),"SaveChange");
RDebugUtils.currentLine=107413574;
 //BA.debugLineNum = 107413574;BA.debugLine="End Sub";
return "";
}
public String  _btndowneshan_click(ir.parsikhesab.pakhsh.cls_recsabadkhariditem __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recsabadkhariditem";
if (Debug.shouldDelegate(ba, "btndowneshan_click", false))
	 {return ((String) Debug.delegate(ba, "btndowneshan_click", null));}
int _a = 0;
RDebugUtils.currentLine=107347968;
 //BA.debugLineNum = 107347968;BA.debugLine="Sub BtnDownEshan_Click";
RDebugUtils.currentLine=107347969;
 //BA.debugLineNum = 107347969;BA.debugLine="If item.FldEshantion>0 Then";
if ((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FldEshantion /*String*/ ))>0) { 
RDebugUtils.currentLine=107347970;
 //BA.debugLineNum = 107347970;BA.debugLine="If MCode.EshantionRemove=0 Then";
if ((_mcode._eshantionremove /*String*/ ).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=107347971;
 //BA.debugLineNum = 107347971;BA.debugLine="ToastMessageShow(\"شما مجوز حذف قلم اشانتیون را";
__c.ToastMessageShow(BA.ObjectToCharSequence("شما مجوز حذف قلم اشانتیون را ندارید"),__c.False);
RDebugUtils.currentLine=107347972;
 //BA.debugLineNum = 107347972;BA.debugLine="Return";
if (true) return "";
 };
 };
RDebugUtils.currentLine=107347975;
 //BA.debugLineNum = 107347975;BA.debugLine="Dim A As Int = 0";
_a = (int) (0);
RDebugUtils.currentLine=107347976;
 //BA.debugLineNum = 107347976;BA.debugLine="A = item.FldEshantion";
_a = (int)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FldEshantion /*String*/ ));
RDebugUtils.currentLine=107347977;
 //BA.debugLineNum = 107347977;BA.debugLine="If A > 0 Then";
if (_a>0) { 
RDebugUtils.currentLine=107347978;
 //BA.debugLineNum = 107347978;BA.debugLine="A = A - 1";
_a = (int) (_a-1);
RDebugUtils.currentLine=107347979;
 //BA.debugLineNum = 107347979;BA.debugLine="item.SumMande = item.SumMande + 1";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/  = BA.NumberToString((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/ ))+1);
RDebugUtils.currentLine=107347980;
 //BA.debugLineNum = 107347980;BA.debugLine="item.FldEshantion  = A";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FldEshantion /*String*/  = BA.NumberToString(_a);
 };
RDebugUtils.currentLine=107347982;
 //BA.debugLineNum = 107347982;BA.debugLine="AddToSabad";
__ref._addtosabad /*String*/ (null);
RDebugUtils.currentLine=107347983;
 //BA.debugLineNum = 107347983;BA.debugLine="End Sub";
return "";
}
public String  _btndownjoz_click(ir.parsikhesab.pakhsh.cls_recsabadkhariditem __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recsabadkhariditem";
if (Debug.shouldDelegate(ba, "btndownjoz_click", false))
	 {return ((String) Debug.delegate(ba, "btndownjoz_click", null));}
float _a = 0f;
float _val = 0f;
RDebugUtils.currentLine=107085824;
 //BA.debugLineNum = 107085824;BA.debugLine="Sub BtnDownJoz_Click";
RDebugUtils.currentLine=107085825;
 //BA.debugLineNum = 107085825;BA.debugLine="Dim A As Float = 0";
_a = (float) (0);
RDebugUtils.currentLine=107085826;
 //BA.debugLineNum = 107085826;BA.debugLine="Dim Val As Float = 0";
_val = (float) (0);
RDebugUtils.currentLine=107085831;
 //BA.debugLineNum = 107085831;BA.debugLine="Val = 1";
_val = (float) (1);
RDebugUtils.currentLine=107085834;
 //BA.debugLineNum = 107085834;BA.debugLine="A = item.TedadDarSabadJoz";
_a = (float)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadJoz /*String*/ ));
RDebugUtils.currentLine=107085835;
 //BA.debugLineNum = 107085835;BA.debugLine="If A > 0 Then";
if (_a>0) { 
RDebugUtils.currentLine=107085836;
 //BA.debugLineNum = 107085836;BA.debugLine="A = A - Val";
_a = (float) (_a-_val);
RDebugUtils.currentLine=107085837;
 //BA.debugLineNum = 107085837;BA.debugLine="item.SumMande = item.SumMande + Val";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/  = BA.NumberToString((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/ ))+_val);
RDebugUtils.currentLine=107085838;
 //BA.debugLineNum = 107085838;BA.debugLine="item.TedadDarSabadJoz = A";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadJoz /*String*/  = BA.NumberToString(_a);
 }else {
RDebugUtils.currentLine=107085840;
 //BA.debugLineNum = 107085840;BA.debugLine="lblRemove_Click";
__ref._lblremove_click /*void*/ (null);
 };
RDebugUtils.currentLine=107085842;
 //BA.debugLineNum = 107085842;BA.debugLine="AddEshantion(A)";
__ref._addeshantion /*String*/ (null,(int) (_a));
RDebugUtils.currentLine=107085843;
 //BA.debugLineNum = 107085843;BA.debugLine="AddToSabad";
__ref._addtosabad /*String*/ (null);
RDebugUtils.currentLine=107085844;
 //BA.debugLineNum = 107085844;BA.debugLine="If MCode.EshantionTabaghati=1 Then";
if ((_mcode._eshantiontabaghati /*String*/ ).equals(BA.NumberToString(1))) { 
RDebugUtils.currentLine=107085845;
 //BA.debugLineNum = 107085845;BA.debugLine="SetEshantion";
__ref._seteshantion /*String*/ (null);
 };
RDebugUtils.currentLine=107085847;
 //BA.debugLineNum = 107085847;BA.debugLine="End Sub";
return "";
}
public void  _lblremove_click(ir.parsikhesab.pakhsh.cls_recsabadkhariditem __ref) throws Exception{
RDebugUtils.currentModule="cls_recsabadkhariditem";
if (Debug.shouldDelegate(ba, "lblremove_click", false))
	 {Debug.delegate(ba, "lblremove_click", null); return;}
ResumableSub_lblRemove_Click rsub = new ResumableSub_lblRemove_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_lblRemove_Click extends BA.ResumableSub {
public ResumableSub_lblRemove_Click(ir.parsikhesab.pakhsh.cls_recsabadkhariditem parent,ir.parsikhesab.pakhsh.cls_recsabadkhariditem __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
ir.parsikhesab.pakhsh.cls_recsabadkhariditem __ref;
ir.parsikhesab.pakhsh.cls_recsabadkhariditem parent;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
Object _sf = null;
int _result = 0;
int step9;
int limit9;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cls_recsabadkhariditem";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=106889217;
 //BA.debugLineNum = 106889217;BA.debugLine="If item.FldEshantion>0 Then";
if (true) break;

case 1:
//if
this.state = 22;
if ((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FldEshantion /*String*/ ))>0) { 
this.state = 3;
}else {
this.state = 9;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=106889218;
 //BA.debugLineNum = 106889218;BA.debugLine="If MCode.EshantionRemove=0 Then";
if (true) break;

case 4:
//if
this.state = 7;
if ((parent._mcode._eshantionremove /*String*/ ).equals(BA.NumberToString(0))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=106889219;
 //BA.debugLineNum = 106889219;BA.debugLine="ToastMessageShow(\"شما مجوز حذف قلم اشانتیون را";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("شما مجوز حذف قلم اشانتیون را ندارید"),parent.__c.False);
RDebugUtils.currentLine=106889220;
 //BA.debugLineNum = 106889220;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 7:
//C
this.state = 22;
;
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=106889223;
 //BA.debugLineNum = 106889223;BA.debugLine="If MCode.EshantionTabaghati=1 Then";
if (true) break;

case 10:
//if
this.state = 21;
if ((parent._mcode._eshantiontabaghati /*String*/ ).equals(BA.NumberToString(1))) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=106889224;
 //BA.debugLineNum = 106889224;BA.debugLine="Dim cu As Cursor=MCode.Result(\"Select * from Tb";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = parent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (ba,"Select * from TblSabad where FldEshantion>0 ");
RDebugUtils.currentLine=106889225;
 //BA.debugLineNum = 106889225;BA.debugLine="For i=0 To cu.RowCount-1";
if (true) break;

case 13:
//for
this.state = 20;
step9 = 1;
limit9 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
this.state = 27;
if (true) break;

case 27:
//C
this.state = 20;
if ((step9 > 0 && _i <= limit9) || (step9 < 0 && _i >= limit9)) this.state = 15;
if (true) break;

case 28:
//C
this.state = 27;
_i = ((int)(0 + _i + step9)) ;
if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=106889226;
 //BA.debugLineNum = 106889226;BA.debugLine="cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=106889227;
 //BA.debugLineNum = 106889227;BA.debugLine="If MCode.CheckCodeKalaEshantion(item.CodeKala,";
if (true) break;

case 16:
//if
this.state = 19;
if (parent._mcode._checkcodekalaeshantion /*boolean*/ (ba,__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .CodeKala /*String*/ ,_cu.GetString("FldCodeKala"))) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=106889228;
 //BA.debugLineNum = 106889228;BA.debugLine="MCode.SaveUpdate(\"delete From TblSabad where";
parent._mcode._saveupdate /*String*/ (ba,"delete From TblSabad where FldCodeKala='"+_cu.GetString("FldCodeKala")+"'");
RDebugUtils.currentLine=106889229;
 //BA.debugLineNum = 106889229;BA.debugLine="Exit";
this.state = 20;
if (true) break;
 if (true) break;

case 19:
//C
this.state = 28;
;
 if (true) break;
if (true) break;

case 20:
//C
this.state = 21;
;
 if (true) break;

case 21:
//C
this.state = 22;
;
 if (true) break;

case 22:
//C
this.state = 23;
;
RDebugUtils.currentLine=106889236;
 //BA.debugLineNum = 106889236;BA.debugLine="Dim xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=106889237;
 //BA.debugLineNum = 106889237;BA.debugLine="Dim sf As Object = xui.Msgbox2Async(\"آیا مایل به";
_sf = _xui.Msgbox2Async(ba,BA.ObjectToCharSequence("آیا مایل به حذف این محصول از سبد خرید هستید؟"),BA.ObjectToCharSequence(""),"بله","","خیر",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(parent.__c.Null)));
RDebugUtils.currentLine=106889238;
 //BA.debugLineNum = 106889238;BA.debugLine="Wait For (sf) Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cls_recsabadkhariditem", "lblremove_click"), _sf);
this.state = 29;
return;
case 29:
//C
this.state = 23;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=106889239;
 //BA.debugLineNum = 106889239;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 23:
//if
this.state = 26;
if (_result==_xui.DialogResponse_Positive) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=106889240;
 //BA.debugLineNum = 106889240;BA.debugLine="Log(\"Deleted!!!\")";
parent.__c.LogImpl("5106889240","Deleted!!!",0);
RDebugUtils.currentLine=106889241;
 //BA.debugLineNum = 106889241;BA.debugLine="MCode.SaveUpdate(\"delete From TblSabad where Fld";
parent._mcode._saveupdate /*String*/ (ba,"delete From TblSabad where FldCodeKala='"+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .CodeKala /*String*/ +"'");
RDebugUtils.currentLine=106889242;
 //BA.debugLineNum = 106889242;BA.debugLine="CallSubDelayed(Act_Sabad,\"LoadListSabad\")";
parent.__c.CallSubDelayed(ba,(Object)(parent._act_sabad.getObject()),"LoadListSabad");
 if (true) break;

case 26:
//C
this.state = -1;
;
RDebugUtils.currentLine=106889244;
 //BA.debugLineNum = 106889244;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _seteshantion(ir.parsikhesab.pakhsh.cls_recsabadkhariditem __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recsabadkhariditem";
if (Debug.shouldDelegate(ba, "seteshantion", false))
	 {return ((String) Debug.delegate(ba, "seteshantion", null));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
int _i = 0;
RDebugUtils.currentLine=106430464;
 //BA.debugLineNum = 106430464;BA.debugLine="Sub SetEshantion";
RDebugUtils.currentLine=106430465;
 //BA.debugLineNum = 106430465;BA.debugLine="MCode.SaveUpdate(\"Delete from TblSabad where FldE";
_mcode._saveupdate /*String*/ (ba,"Delete from TblSabad where FldEshantion<>'0'");
RDebugUtils.currentLine=106430467;
 //BA.debugLineNum = 106430467;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From Tb";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = _mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (ba,"Select * From TblSabad where FldCodeKala IN(SELECT tblEshantionTabaghati.fldCodeKalaForoosh FROM tblEshantionTabaghati)");
RDebugUtils.currentLine=106430468;
 //BA.debugLineNum = 106430468;BA.debugLine="For i=0 To Cu.RowCount -1";
{
final int step3 = 1;
final int limit3 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=106430469;
 //BA.debugLineNum = 106430469;BA.debugLine="Cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=106430471;
 //BA.debugLineNum = 106430471;BA.debugLine="AddEshantion2(Cu)";
__ref._addeshantion2 /*String*/ (null,_cu);
 }
};
RDebugUtils.currentLine=106430473;
 //BA.debugLineNum = 106430473;BA.debugLine="End Sub";
return "";
}
public String  _btndownkol_click(ir.parsikhesab.pakhsh.cls_recsabadkhariditem __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recsabadkhariditem";
if (Debug.shouldDelegate(ba, "btndownkol_click", false))
	 {return ((String) Debug.delegate(ba, "btndownkol_click", null));}
float _a = 0f;
float _val = 0f;
RDebugUtils.currentLine=107216896;
 //BA.debugLineNum = 107216896;BA.debugLine="Sub BtnDownKol_Click";
RDebugUtils.currentLine=107216909;
 //BA.debugLineNum = 107216909;BA.debugLine="If item.TedadDarKarton=0 Then";
if ((__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarKarton /*String*/ ).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=107216910;
 //BA.debugLineNum = 107216910;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=107216912;
 //BA.debugLineNum = 107216912;BA.debugLine="Dim A As Float = 0";
_a = (float) (0);
RDebugUtils.currentLine=107216913;
 //BA.debugLineNum = 107216913;BA.debugLine="Dim Val As Float = 1";
_val = (float) (1);
RDebugUtils.currentLine=107216916;
 //BA.debugLineNum = 107216916;BA.debugLine="A = item.TedadDarSabadKol";
_a = (float)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadKol /*String*/ ));
RDebugUtils.currentLine=107216917;
 //BA.debugLineNum = 107216917;BA.debugLine="A = A - 1";
_a = (float) (_a-1);
RDebugUtils.currentLine=107216918;
 //BA.debugLineNum = 107216918;BA.debugLine="item.SumMandeKarton = item.SumMandeKarton + Val";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMandeKarton /*String*/  = BA.NumberToString((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMandeKarton /*String*/ ))+_val);
RDebugUtils.currentLine=107216919;
 //BA.debugLineNum = 107216919;BA.debugLine="item.TedadDarSabadKol = A";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadKol /*String*/  = BA.NumberToString(_a);
RDebugUtils.currentLine=107216921;
 //BA.debugLineNum = 107216921;BA.debugLine="AddToSabad";
__ref._addtosabad /*String*/ (null);
RDebugUtils.currentLine=107216922;
 //BA.debugLineNum = 107216922;BA.debugLine="If MCode.EshantionTabaghati=1 Then";
if ((_mcode._eshantiontabaghati /*String*/ ).equals(BA.NumberToString(1))) { 
RDebugUtils.currentLine=107216923;
 //BA.debugLineNum = 107216923;BA.debugLine="SetEshantion";
__ref._seteshantion /*String*/ (null);
 };
RDebugUtils.currentLine=107216925;
 //BA.debugLineNum = 107216925;BA.debugLine="End Sub";
return "";
}
public String  _btnupeshan_click(ir.parsikhesab.pakhsh.cls_recsabadkhariditem __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recsabadkhariditem";
if (Debug.shouldDelegate(ba, "btnupeshan_click", false))
	 {return ((String) Debug.delegate(ba, "btnupeshan_click", null));}
int _a = 0;
int _b = 0;
RDebugUtils.currentLine=107282432;
 //BA.debugLineNum = 107282432;BA.debugLine="Sub BtnUpEshan_Click";
RDebugUtils.currentLine=107282433;
 //BA.debugLineNum = 107282433;BA.debugLine="Dim A As Int = 0";
_a = (int) (0);
RDebugUtils.currentLine=107282434;
 //BA.debugLineNum = 107282434;BA.debugLine="Dim B As Int = 0";
_b = (int) (0);
RDebugUtils.currentLine=107282435;
 //BA.debugLineNum = 107282435;BA.debugLine="A = item.FldEshantion";
_a = (int)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FldEshantion /*String*/ ));
RDebugUtils.currentLine=107282436;
 //BA.debugLineNum = 107282436;BA.debugLine="If MCode.ForooshBishAzMojoodi = \"1\" Then";
if ((_mcode._forooshbishazmojoodi /*String*/ ).equals("1")) { 
RDebugUtils.currentLine=107282437;
 //BA.debugLineNum = 107282437;BA.debugLine="If item.FldEshantion<item.fldCountEshantion Then";
if ((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FldEshantion /*String*/ ))<(double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldCountEshantion /*String*/ ))) { 
RDebugUtils.currentLine=107282438;
 //BA.debugLineNum = 107282438;BA.debugLine="A = A + 1";
_a = (int) (_a+1);
RDebugUtils.currentLine=107282439;
 //BA.debugLineNum = 107282439;BA.debugLine="item.SumMande = item.SumMande - 1";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/  = BA.NumberToString((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/ ))-1);
 };
 }else 
{RDebugUtils.currentLine=107282442;
 //BA.debugLineNum = 107282442;BA.debugLine="Else if MCode.ForooshBishAzMojoodi = \"0\" Then";
if ((_mcode._forooshbishazmojoodi /*String*/ ).equals("0")) { 
RDebugUtils.currentLine=107282443;
 //BA.debugLineNum = 107282443;BA.debugLine="B = item.SumMande - ((item.TedadDarSabadKol * it";
_b = (int) ((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/ ))-(((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadKol /*String*/ ))*(double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarKarton /*String*/ )))+(double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadJoz /*String*/ ))+(double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FldEshantion /*String*/ ))));
RDebugUtils.currentLine=107282444;
 //BA.debugLineNum = 107282444;BA.debugLine="If B > 0 Then";
if (_b>0) { 
RDebugUtils.currentLine=107282445;
 //BA.debugLineNum = 107282445;BA.debugLine="If item.FldEshantion<item.fldCountEshantion The";
if ((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FldEshantion /*String*/ ))<(double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldCountEshantion /*String*/ ))) { 
RDebugUtils.currentLine=107282446;
 //BA.debugLineNum = 107282446;BA.debugLine="A = A + 1";
_a = (int) (_a+1);
RDebugUtils.currentLine=107282447;
 //BA.debugLineNum = 107282447;BA.debugLine="item.SumMande = item.SumMande - 1";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/  = BA.NumberToString((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/ ))-1);
 };
 }else {
RDebugUtils.currentLine=107282451;
 //BA.debugLineNum = 107282451;BA.debugLine="ToastMessageShow(\"سفارش شما بیشتر از موجودی می";
__c.ToastMessageShow(BA.ObjectToCharSequence("سفارش شما بیشتر از موجودی می باشد"),__c.True);
 };
 }}
;
RDebugUtils.currentLine=107282454;
 //BA.debugLineNum = 107282454;BA.debugLine="item.FldEshantion = A";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FldEshantion /*String*/  = BA.NumberToString(_a);
RDebugUtils.currentLine=107282455;
 //BA.debugLineNum = 107282455;BA.debugLine="AddToSabad";
__ref._addtosabad /*String*/ (null);
RDebugUtils.currentLine=107282456;
 //BA.debugLineNum = 107282456;BA.debugLine="End Sub";
return "";
}
public String  _btnupjoz_click(ir.parsikhesab.pakhsh.cls_recsabadkhariditem __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recsabadkhariditem";
if (Debug.shouldDelegate(ba, "btnupjoz_click", false))
	 {return ((String) Debug.delegate(ba, "btnupjoz_click", null));}
float _a = 0f;
float _val = 0f;
RDebugUtils.currentLine=107020288;
 //BA.debugLineNum = 107020288;BA.debugLine="Sub BtnUpJoz_Click";
RDebugUtils.currentLine=107020289;
 //BA.debugLineNum = 107020289;BA.debugLine="Dim A As Float = 0";
_a = (float) (0);
RDebugUtils.currentLine=107020290;
 //BA.debugLineNum = 107020290;BA.debugLine="Dim Val As Float = 0";
_val = (float) (0);
RDebugUtils.currentLine=107020295;
 //BA.debugLineNum = 107020295;BA.debugLine="Val = 1";
_val = (float) (1);
RDebugUtils.currentLine=107020298;
 //BA.debugLineNum = 107020298;BA.debugLine="A = item.TedadDarSabadJoz";
_a = (float)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadJoz /*String*/ ));
RDebugUtils.currentLine=107020299;
 //BA.debugLineNum = 107020299;BA.debugLine="If MCode.ForooshBishAzMojoodi = \"1\" Then";
if ((_mcode._forooshbishazmojoodi /*String*/ ).equals("1")) { 
RDebugUtils.currentLine=107020300;
 //BA.debugLineNum = 107020300;BA.debugLine="A = A + Val";
_a = (float) (_a+_val);
RDebugUtils.currentLine=107020301;
 //BA.debugLineNum = 107020301;BA.debugLine="item.SumMande = item.SumMande - Val";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/  = BA.NumberToString((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/ ))-_val);
 }else 
{RDebugUtils.currentLine=107020303;
 //BA.debugLineNum = 107020303;BA.debugLine="Else if MCode.ForooshBishAzMojoodi = \"0\" Then";
if ((_mcode._forooshbishazmojoodi /*String*/ ).equals("0")) { 
RDebugUtils.currentLine=107020304;
 //BA.debugLineNum = 107020304;BA.debugLine="If MCode.Action=\"SabtMarjooii\" Then";
if ((_mcode._action /*String*/ ).equals("SabtMarjooii")) { 
RDebugUtils.currentLine=107020305;
 //BA.debugLineNum = 107020305;BA.debugLine="A = A + Val";
_a = (float) (_a+_val);
RDebugUtils.currentLine=107020306;
 //BA.debugLineNum = 107020306;BA.debugLine="item.SumMande = item.SumMande - Val";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/  = BA.NumberToString((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/ ))-_val);
 }else {
RDebugUtils.currentLine=107020308;
 //BA.debugLineNum = 107020308;BA.debugLine="If item.SumMande > 0 Then";
if ((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/ ))>0) { 
RDebugUtils.currentLine=107020309;
 //BA.debugLineNum = 107020309;BA.debugLine="A = A + Val";
_a = (float) (_a+_val);
RDebugUtils.currentLine=107020310;
 //BA.debugLineNum = 107020310;BA.debugLine="item.SumMande = item.SumMande - Val";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/  = BA.NumberToString((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/ ))-_val);
 }else {
RDebugUtils.currentLine=107020312;
 //BA.debugLineNum = 107020312;BA.debugLine="ToastMessageShow(\"سفارش شما بیشتر از موجودی می";
__c.ToastMessageShow(BA.ObjectToCharSequence("سفارش شما بیشتر از موجودی می باشد"),__c.True);
 };
 };
 }}
;
RDebugUtils.currentLine=107020317;
 //BA.debugLineNum = 107020317;BA.debugLine="item.TedadDarSabadJoz = A";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadJoz /*String*/  = BA.NumberToString(_a);
RDebugUtils.currentLine=107020318;
 //BA.debugLineNum = 107020318;BA.debugLine="AddEshantion(A)";
__ref._addeshantion /*String*/ (null,(int) (_a));
RDebugUtils.currentLine=107020319;
 //BA.debugLineNum = 107020319;BA.debugLine="AddToSabad";
__ref._addtosabad /*String*/ (null);
RDebugUtils.currentLine=107020322;
 //BA.debugLineNum = 107020322;BA.debugLine="If MCode.EshantionTabaghati=1 Then";
if ((_mcode._eshantiontabaghati /*String*/ ).equals(BA.NumberToString(1))) { 
RDebugUtils.currentLine=107020323;
 //BA.debugLineNum = 107020323;BA.debugLine="SetEshantion";
__ref._seteshantion /*String*/ (null);
 };
RDebugUtils.currentLine=107020325;
 //BA.debugLineNum = 107020325;BA.debugLine="End Sub";
return "";
}
public String  _btnupkol_click(ir.parsikhesab.pakhsh.cls_recsabadkhariditem __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recsabadkhariditem";
if (Debug.shouldDelegate(ba, "btnupkol_click", false))
	 {return ((String) Debug.delegate(ba, "btnupkol_click", null));}
float _a = 0f;
float _val = 0f;
RDebugUtils.currentLine=107151360;
 //BA.debugLineNum = 107151360;BA.debugLine="Sub BtnUpKol_Click";
RDebugUtils.currentLine=107151362;
 //BA.debugLineNum = 107151362;BA.debugLine="If item.TedadDarKarton=0 Then";
if ((__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarKarton /*String*/ ).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=107151363;
 //BA.debugLineNum = 107151363;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=107151365;
 //BA.debugLineNum = 107151365;BA.debugLine="Dim A As Float = 0";
_a = (float) (0);
RDebugUtils.currentLine=107151366;
 //BA.debugLineNum = 107151366;BA.debugLine="Dim Val As Float = 1";
_val = (float) (1);
RDebugUtils.currentLine=107151369;
 //BA.debugLineNum = 107151369;BA.debugLine="A = item.TedadDarSabadKol";
_a = (float)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadKol /*String*/ ));
RDebugUtils.currentLine=107151370;
 //BA.debugLineNum = 107151370;BA.debugLine="If MCode.Action=\"SabtMarjooii\" Then";
if ((_mcode._action /*String*/ ).equals("SabtMarjooii")) { 
RDebugUtils.currentLine=107151371;
 //BA.debugLineNum = 107151371;BA.debugLine="A = A + 1";
_a = (float) (_a+1);
RDebugUtils.currentLine=107151372;
 //BA.debugLineNum = 107151372;BA.debugLine="item.SumMandeKarton = item.SumMandeKarton - Val";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMandeKarton /*String*/  = BA.NumberToString((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMandeKarton /*String*/ ))-_val);
 }else {
RDebugUtils.currentLine=107151374;
 //BA.debugLineNum = 107151374;BA.debugLine="If MCode.ForooshBishAzMojoodi = \"1\" Then";
if ((_mcode._forooshbishazmojoodi /*String*/ ).equals("1")) { 
RDebugUtils.currentLine=107151375;
 //BA.debugLineNum = 107151375;BA.debugLine="A = A + 1";
_a = (float) (_a+1);
RDebugUtils.currentLine=107151376;
 //BA.debugLineNum = 107151376;BA.debugLine="item.SumMandeKarton = item.SumMandeKarton - Val";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMandeKarton /*String*/  = BA.NumberToString((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMandeKarton /*String*/ ))-_val);
 }else 
{RDebugUtils.currentLine=107151377;
 //BA.debugLineNum = 107151377;BA.debugLine="Else if MCode.ForooshBishAzMojoodi = \"0\" Then";
if ((_mcode._forooshbishazmojoodi /*String*/ ).equals("0")) { 
RDebugUtils.currentLine=107151378;
 //BA.debugLineNum = 107151378;BA.debugLine="If item.SumMandeKarton > 0 Then";
if ((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMandeKarton /*String*/ ))>0) { 
RDebugUtils.currentLine=107151379;
 //BA.debugLineNum = 107151379;BA.debugLine="A = A + Val";
_a = (float) (_a+_val);
RDebugUtils.currentLine=107151380;
 //BA.debugLineNum = 107151380;BA.debugLine="item.SumMandeKarton = item.SumMandeKarton - Va";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMandeKarton /*String*/  = BA.NumberToString((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMandeKarton /*String*/ ))-_val);
 }else {
RDebugUtils.currentLine=107151382;
 //BA.debugLineNum = 107151382;BA.debugLine="ToastMessageShow(\"سفارش شما بیشتر از موجودی می";
__c.ToastMessageShow(BA.ObjectToCharSequence("سفارش شما بیشتر از موجودی می باشد"),__c.True);
 };
 }}
;
 };
RDebugUtils.currentLine=107151393;
 //BA.debugLineNum = 107151393;BA.debugLine="item.TedadDarSabadKol = A";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadKol /*String*/  = BA.NumberToString(_a);
RDebugUtils.currentLine=107151396;
 //BA.debugLineNum = 107151396;BA.debugLine="AddToSabad";
__ref._addtosabad /*String*/ (null);
RDebugUtils.currentLine=107151398;
 //BA.debugLineNum = 107151398;BA.debugLine="If MCode.EshantionTabaghati=1 Then";
if ((_mcode._eshantiontabaghati /*String*/ ).equals(BA.NumberToString(1))) { 
RDebugUtils.currentLine=107151399;
 //BA.debugLineNum = 107151399;BA.debugLine="SetEshantion";
__ref._seteshantion /*String*/ (null);
 };
RDebugUtils.currentLine=107151401;
 //BA.debugLineNum = 107151401;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(ir.parsikhesab.pakhsh.cls_recsabadkhariditem __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recsabadkhariditem";
RDebugUtils.currentLine=106102784;
 //BA.debugLineNum = 106102784;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=106102785;
 //BA.debugLineNum = 106102785;BA.debugLine="Private p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=106102786;
 //BA.debugLineNum = 106102786;BA.debugLine="Private item As AdapterListKala";
_item = new ir.parsikhesab.pakhsh.mcode._adapterlistkala();
RDebugUtils.currentLine=106102787;
 //BA.debugLineNum = 106102787;BA.debugLine="Private pnl_BK As Panel";
_pnl_bk = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=106102788;
 //BA.debugLineNum = 106102788;BA.debugLine="Private lbl_Price As Label";
_lbl_price = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=106102789;
 //BA.debugLineNum = 106102789;BA.debugLine="Private lbl_title As Label";
_lbl_title = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=106102790;
 //BA.debugLineNum = 106102790;BA.debugLine="Private Img_Kala As ImageView";
_img_kala = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=106102791;
 //BA.debugLineNum = 106102791;BA.debugLine="Private lblTedadjoz As Label";
_lbltedadjoz = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=106102792;
 //BA.debugLineNum = 106102792;BA.debugLine="Private lblTedadKol As Label";
_lbltedadkol = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=106102793;
 //BA.debugLineNum = 106102793;BA.debugLine="Private lblRemove As Label";
_lblremove = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=106102794;
 //BA.debugLineNum = 106102794;BA.debugLine="Private LblTedadEshan As Label";
_lbltedadeshan = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=106102795;
 //BA.debugLineNum = 106102795;BA.debugLine="Private BtnUpJoz As Label";
_btnupjoz = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=106102796;
 //BA.debugLineNum = 106102796;BA.debugLine="Private BtnDownJoz As Label";
_btndownjoz = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=106102797;
 //BA.debugLineNum = 106102797;BA.debugLine="Private lblTedadjoz As Label";
_lbltedadjoz = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=106102798;
 //BA.debugLineNum = 106102798;BA.debugLine="Private Panel2 As Panel";
_panel2 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=106102799;
 //BA.debugLineNum = 106102799;BA.debugLine="Private BtnUpKol As Label";
_btnupkol = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=106102800;
 //BA.debugLineNum = 106102800;BA.debugLine="Private BtnDownKol As Label";
_btndownkol = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=106102801;
 //BA.debugLineNum = 106102801;BA.debugLine="Private lblTedadKol As Label";
_lbltedadkol = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=106102802;
 //BA.debugLineNum = 106102802;BA.debugLine="Private Panel3 As Panel";
_panel3 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=106102803;
 //BA.debugLineNum = 106102803;BA.debugLine="Private BtnDownEshan As Label";
_btndowneshan = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=106102804;
 //BA.debugLineNum = 106102804;BA.debugLine="Private BtnUpEshan As Label";
_btnupeshan = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=106102805;
 //BA.debugLineNum = 106102805;BA.debugLine="Private txtComment As EditText";
_txtcomment = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=106102806;
 //BA.debugLineNum = 106102806;BA.debugLine="Private LblFeeBadAzTakhfid As Label";
_lblfeebadaztakhfid = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=106102807;
 //BA.debugLineNum = 106102807;BA.debugLine="Private lblVahedJoz As Label";
_lblvahedjoz = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=106102808;
 //BA.debugLineNum = 106102808;BA.debugLine="Private lblVahedKol As Label";
_lblvahedkol = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=106102809;
 //BA.debugLineNum = 106102809;BA.debugLine="Private LblMojoodiJoz As Label";
_lblmojoodijoz = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=106102810;
 //BA.debugLineNum = 106102810;BA.debugLine="Private LblMojoodiKol As Label";
_lblmojoodikol = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=106102811;
 //BA.debugLineNum = 106102811;BA.debugLine="Private LblTozihat As Label";
_lbltozihat = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=106102812;
 //BA.debugLineNum = 106102812;BA.debugLine="Private LblGift As Label";
_lblgift = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=106102813;
 //BA.debugLineNum = 106102813;BA.debugLine="Private ImageOff As ImageView";
_imageoff = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=106102814;
 //BA.debugLineNum = 106102814;BA.debugLine="Private LblC_Kala As Label";
_lblc_kala = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=106102815;
 //BA.debugLineNum = 106102815;BA.debugLine="Private LblTedadKarton As Label";
_lbltedadkarton = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=106102816;
 //BA.debugLineNum = 106102816;BA.debugLine="Private LblBuyPrice As Label";
_lblbuyprice = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=106102817;
 //BA.debugLineNum = 106102817;BA.debugLine="Dim maxkolRond As String";
_maxkolrond = "";
RDebugUtils.currentLine=106102818;
 //BA.debugLineNum = 106102818;BA.debugLine="Private lblSumMablaghKala As Label";
_lblsummablaghkala = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=106102819;
 //BA.debugLineNum = 106102819;BA.debugLine="Private LblMablaghTakhfif As Label";
_lblmablaghtakhfif = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=106102820;
 //BA.debugLineNum = 106102820;BA.debugLine="Private lblDarsadTakhfif As Label";
_lbldarsadtakhfif = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=106102821;
 //BA.debugLineNum = 106102821;BA.debugLine="Private pnlJoz As Panel";
_pnljoz = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=106102822;
 //BA.debugLineNum = 106102822;BA.debugLine="Private pnlKol As Panel";
_pnlkol = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=106102823;
 //BA.debugLineNum = 106102823;BA.debugLine="Private pnlEshan As Panel";
_pnleshan = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=106102824;
 //BA.debugLineNum = 106102824;BA.debugLine="Private LblFeeYekKarton As Label";
_lblfeeyekkarton = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=106102825;
 //BA.debugLineNum = 106102825;BA.debugLine="Private base As Object";
_base = new Object();
RDebugUtils.currentLine=106102826;
 //BA.debugLineNum = 106102826;BA.debugLine="End Sub";
return "";
}
public String  _mojavezsefaresh(ir.parsikhesab.pakhsh.cls_recsabadkhariditem __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recsabadkhariditem";
if (Debug.shouldDelegate(ba, "mojavezsefaresh", false))
	 {return ((String) Debug.delegate(ba, "mojavezsefaresh", null));}
RDebugUtils.currentLine=106233856;
 //BA.debugLineNum = 106233856;BA.debugLine="Private Sub MojavezSefaresh";
RDebugUtils.currentLine=106233857;
 //BA.debugLineNum = 106233857;BA.debugLine="Select MCode.MojavezSefaresh";
switch (BA.switchObjectToInt(_mcode._mojavezsefaresh /*String*/ ,BA.NumberToString(0),BA.NumberToString(1),BA.NumberToString(2))) {
case 0: {
RDebugUtils.currentLine=106233859;
 //BA.debugLineNum = 106233859;BA.debugLine="BtnUpJoz.Enabled=True";
__ref._btnupjoz /*anywheresoftware.b4a.objects.LabelWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=106233860;
 //BA.debugLineNum = 106233860;BA.debugLine="BtnDownJoz.Enabled=True";
__ref._btndownjoz /*anywheresoftware.b4a.objects.LabelWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=106233861;
 //BA.debugLineNum = 106233861;BA.debugLine="pnlJoz.Enabled=True";
__ref._pnljoz /*anywheresoftware.b4a.objects.PanelWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=106233862;
 //BA.debugLineNum = 106233862;BA.debugLine="lblTedadjoz.Enabled=True";
__ref._lbltedadjoz /*anywheresoftware.b4a.objects.LabelWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=106233864;
 //BA.debugLineNum = 106233864;BA.debugLine="BtnUpKol.Enabled=True";
__ref._btnupkol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=106233865;
 //BA.debugLineNum = 106233865;BA.debugLine="BtnDownKol.Enabled=True";
__ref._btndownkol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=106233866;
 //BA.debugLineNum = 106233866;BA.debugLine="pnlKol.Enabled=True";
__ref._pnlkol /*anywheresoftware.b4a.objects.PanelWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=106233867;
 //BA.debugLineNum = 106233867;BA.debugLine="lblTedadKol.Enabled=True";
__ref._lbltedadkol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setEnabled(__c.True);
 break; }
case 1: {
RDebugUtils.currentLine=106233869;
 //BA.debugLineNum = 106233869;BA.debugLine="BtnUpJoz.Enabled=True";
__ref._btnupjoz /*anywheresoftware.b4a.objects.LabelWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=106233870;
 //BA.debugLineNum = 106233870;BA.debugLine="BtnDownJoz.Enabled=True";
__ref._btndownjoz /*anywheresoftware.b4a.objects.LabelWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=106233871;
 //BA.debugLineNum = 106233871;BA.debugLine="pnlJoz.Enabled=True";
__ref._pnljoz /*anywheresoftware.b4a.objects.PanelWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=106233872;
 //BA.debugLineNum = 106233872;BA.debugLine="lblTedadjoz.Enabled=True";
__ref._lbltedadjoz /*anywheresoftware.b4a.objects.LabelWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=106233874;
 //BA.debugLineNum = 106233874;BA.debugLine="BtnUpKol.Enabled=False";
__ref._btnupkol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=106233875;
 //BA.debugLineNum = 106233875;BA.debugLine="BtnDownKol.Enabled=False";
__ref._btndownkol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=106233876;
 //BA.debugLineNum = 106233876;BA.debugLine="pnlKol.Enabled=False";
__ref._pnlkol /*anywheresoftware.b4a.objects.PanelWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=106233877;
 //BA.debugLineNum = 106233877;BA.debugLine="lblTedadKol.Enabled=False";
__ref._lbltedadkol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setEnabled(__c.False);
 break; }
case 2: {
RDebugUtils.currentLine=106233879;
 //BA.debugLineNum = 106233879;BA.debugLine="BtnUpJoz.Enabled=False";
__ref._btnupjoz /*anywheresoftware.b4a.objects.LabelWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=106233880;
 //BA.debugLineNum = 106233880;BA.debugLine="BtnDownJoz.Enabled=False";
__ref._btndownjoz /*anywheresoftware.b4a.objects.LabelWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=106233881;
 //BA.debugLineNum = 106233881;BA.debugLine="pnlJoz.Enabled=False";
__ref._pnljoz /*anywheresoftware.b4a.objects.PanelWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=106233882;
 //BA.debugLineNum = 106233882;BA.debugLine="lblTedadjoz.Enabled=False";
__ref._lbltedadjoz /*anywheresoftware.b4a.objects.LabelWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=106233884;
 //BA.debugLineNum = 106233884;BA.debugLine="BtnUpKol.Enabled=True";
__ref._btnupkol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=106233885;
 //BA.debugLineNum = 106233885;BA.debugLine="BtnDownKol.Enabled=True";
__ref._btndownkol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=106233886;
 //BA.debugLineNum = 106233886;BA.debugLine="pnlKol.Enabled=True";
__ref._pnlkol /*anywheresoftware.b4a.objects.PanelWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=106233887;
 //BA.debugLineNum = 106233887;BA.debugLine="lblTedadKol.Enabled=True";
__ref._lbltedadkol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setEnabled(__c.True);
 break; }
}
;
RDebugUtils.currentLine=106233889;
 //BA.debugLineNum = 106233889;BA.debugLine="End Sub";
return "";
}
public String  _lbltedadjoz_click(ir.parsikhesab.pakhsh.cls_recsabadkhariditem __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recsabadkhariditem";
if (Debug.shouldDelegate(ba, "lbltedadjoz_click", false))
	 {return ((String) Debug.delegate(ba, "lbltedadjoz_click", null));}
RDebugUtils.currentLine=107544576;
 //BA.debugLineNum = 107544576;BA.debugLine="Sub LblTedadJoz_Click";
RDebugUtils.currentLine=107544578;
 //BA.debugLineNum = 107544578;BA.debugLine="CallSubDelayed2(base,\"LblTedadJoz_Click\",item)";
__c.CallSubDelayed2(ba,__ref._base /*Object*/ ,"LblTedadJoz_Click",(Object)(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ ));
RDebugUtils.currentLine=107544581;
 //BA.debugLineNum = 107544581;BA.debugLine="End Sub";
return "";
}
public String  _lbltedadkol_click(ir.parsikhesab.pakhsh.cls_recsabadkhariditem __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recsabadkhariditem";
if (Debug.shouldDelegate(ba, "lbltedadkol_click", false))
	 {return ((String) Debug.delegate(ba, "lbltedadkol_click", null));}
RDebugUtils.currentLine=107610112;
 //BA.debugLineNum = 107610112;BA.debugLine="Sub LblTedadKol_Click";
RDebugUtils.currentLine=107610113;
 //BA.debugLineNum = 107610113;BA.debugLine="If myCode.Is_Null_adad(item.TedadDarKarton)=0 The";
if ((_mycode._is_null_adad /*String*/ (ba,__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarKarton /*String*/ )).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=107610114;
 //BA.debugLineNum = 107610114;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=107610117;
 //BA.debugLineNum = 107610117;BA.debugLine="CallSubDelayed2(base,\"LblTedadKol_Click\",item)";
__c.CallSubDelayed2(ba,__ref._base /*Object*/ ,"LblTedadKol_Click",(Object)(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ ));
RDebugUtils.currentLine=107610120;
 //BA.debugLineNum = 107610120;BA.debugLine="End Sub";
return "";
}
public String  _lbltozihat_click(ir.parsikhesab.pakhsh.cls_recsabadkhariditem __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recsabadkhariditem";
if (Debug.shouldDelegate(ba, "lbltozihat_click", false))
	 {return ((String) Debug.delegate(ba, "lbltozihat_click", null));}
RDebugUtils.currentLine=106954752;
 //BA.debugLineNum = 106954752;BA.debugLine="Sub LblTozihat_Click";
RDebugUtils.currentLine=106954753;
 //BA.debugLineNum = 106954753;BA.debugLine="If item.Tozihat <> \"\" Then";
if ((__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .Tozihat /*String*/ ).equals("") == false) { 
RDebugUtils.currentLine=106954754;
 //BA.debugLineNum = 106954754;BA.debugLine="Msgbox(item.Tozihat,\"توضیحات کالا\")";
__c.Msgbox(BA.ObjectToCharSequence(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .Tozihat /*String*/ ),BA.ObjectToCharSequence("توضیحات کالا"),ba);
 };
RDebugUtils.currentLine=106954756;
 //BA.debugLineNum = 106954756;BA.debugLine="End Sub";
return "";
}
public String  _pnl_bk_click(ir.parsikhesab.pakhsh.cls_recsabadkhariditem __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recsabadkhariditem";
if (Debug.shouldDelegate(ba, "pnl_bk_click", false))
	 {return ((String) Debug.delegate(ba, "pnl_bk_click", null));}
RDebugUtils.currentLine=106823680;
 //BA.debugLineNum = 106823680;BA.debugLine="Private Sub pnl_bk_Click";
RDebugUtils.currentLine=106823683;
 //BA.debugLineNum = 106823683;BA.debugLine="End Sub";
return "";
}
public String  _status(ir.parsikhesab.pakhsh.cls_recsabadkhariditem __ref,boolean _enable) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recsabadkhariditem";
if (Debug.shouldDelegate(ba, "status", false))
	 {return ((String) Debug.delegate(ba, "status", new Object[] {_enable}));}
RDebugUtils.currentLine=106561536;
 //BA.debugLineNum = 106561536;BA.debugLine="Sub Status(Enable As Boolean)";
RDebugUtils.currentLine=106561549;
 //BA.debugLineNum = 106561549;BA.debugLine="End Sub";
return "";
}
public String  _txtcomment_textchanged(ir.parsikhesab.pakhsh.cls_recsabadkhariditem __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recsabadkhariditem";
if (Debug.shouldDelegate(ba, "txtcomment_textchanged", false))
	 {return ((String) Debug.delegate(ba, "txtcomment_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=107479040;
 //BA.debugLineNum = 107479040;BA.debugLine="Sub txtComment_TextChanged (Old As String, New As";
RDebugUtils.currentLine=107479041;
 //BA.debugLineNum = 107479041;BA.debugLine="item.Tozihat=MCode.ConvertNumbersPersian2English(";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .Tozihat /*String*/  = _mcode._convertnumberspersian2english /*String*/ (ba,_new);
RDebugUtils.currentLine=107479042;
 //BA.debugLineNum = 107479042;BA.debugLine="MCode.SaveUpdate($\"Update TblSabad Set FldTozihat";
_mcode._saveupdate /*String*/ (ba,("Update TblSabad Set FldTozihat = '"+__c.SmartStringFormatter("",(Object)(_new))+"' Where FldCodeKala = '"+__c.SmartStringFormatter("",(Object)(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .CodeKala /*String*/ ))+"'"));
RDebugUtils.currentLine=107479043;
 //BA.debugLineNum = 107479043;BA.debugLine="End Sub";
return "";
}
}