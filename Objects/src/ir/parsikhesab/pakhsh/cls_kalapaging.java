package ir.parsikhesab.pakhsh;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class cls_kalapaging extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "ir.parsikhesab.pakhsh.cls_kalapaging");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", ir.parsikhesab.pakhsh.cls_kalapaging.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.IME _key = null;
public ir.parsikhesab.pakhsh.mcode._adapterlistkala _item = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_title = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblfee = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _btnupjoz = null;
public anywheresoftware.b4a.objects.LabelWrapper _btndownjoz = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltedadjoz = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _btnupkol = null;
public anywheresoftware.b4a.objects.LabelWrapper _btndownkol = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltedadkol = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel3 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label4 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblfeebadaztakhfid = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltedadkarton = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblmojoodijoz = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblmojoodikol = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblc_kala = null;
public ir.parsikhesab.pakhsh.b4xlisttemplate _options = null;
public ir.parsikhesab.pakhsh.b4xdialog _dialog = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _base = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_changeprice = null;
public anywheresoftware.b4a.objects.LabelWrapper _btn_edit_price = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltedadeshan = null;
public anywheresoftware.b4a.objects.LabelWrapper _btndowneshan = null;
public anywheresoftware.b4a.objects.LabelWrapper _btnupeshan = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imagerow = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageoff = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblvahedkol = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblvahedjoz = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblgift = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltozihat = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_bascket = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblbasketcount = null;
public long _maxkolrond = 0L;
public anywheresoftware.b4a.objects.LabelWrapper _lblcounteshantion = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblmablaghmasrafkonande = null;
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
public String  _show(ir.parsikhesab.pakhsh.cls_kalapaging __ref,ir.parsikhesab.pakhsh.mcode._adapterlistkala _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_kalapaging";
if (Debug.shouldDelegate(ba, "show", false))
	 {return ((String) Debug.delegate(ba, "show", new Object[] {_data}));}
RDebugUtils.currentLine=93782016;
 //BA.debugLineNum = 93782016;BA.debugLine="Sub show(data As AdapterListKala)";
RDebugUtils.currentLine=93782017;
 //BA.debugLineNum = 93782017;BA.debugLine="Item=data";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/  = _data;
RDebugUtils.currentLine=93782019;
 //BA.debugLineNum = 93782019;BA.debugLine="RefreshLblSabad";
__ref._refreshlblsabad /*String*/ (null);
RDebugUtils.currentLine=93782020;
 //BA.debugLineNum = 93782020;BA.debugLine="Try";
try {RDebugUtils.currentLine=93782022;
 //BA.debugLineNum = 93782022;BA.debugLine="lbl_title.Text = Item.NameKala";
__ref._lbl_title /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .NameKala /*String*/ ));
RDebugUtils.currentLine=93782023;
 //BA.debugLineNum = 93782023;BA.debugLine="LblC_Kala.Text = \"کد کالا: \" & Item.CodeKala";
__ref._lblc_kala /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("کد کالا: "+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .CodeKala /*String*/ ));
RDebugUtils.currentLine=93782052;
 //BA.debugLineNum = 93782052;BA.debugLine="If IsNumber(Item.FldFeeBadAzTakhfif) = True Then";
if (__c.IsNumber(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldFeeBadAzTakhfif /*String*/ )==__c.True) { 
RDebugUtils.currentLine=93782053;
 //BA.debugLineNum = 93782053;BA.debugLine="If Item.FldFeeBadAzTakhfif > 0 Then";
if ((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldFeeBadAzTakhfif /*String*/ ))>0) { 
RDebugUtils.currentLine=93782054;
 //BA.debugLineNum = 93782054;BA.debugLine="MCode.Rs.Initialize(NumberFormat(Item.FeeForoo";
_mcode._rs /*anywheresoftware.b4a.agraham.richstring.RichStringBuilder.RichString*/ .Initialize(BA.ObjectToCharSequence(__c.NumberFormat(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FeeForoosh /*int*/ ,(int) (1),(int) (3))+" "+_mcode._vahedpool /*String*/ ));
RDebugUtils.currentLine=93782055;
 //BA.debugLineNum = 93782055;BA.debugLine="MCode.Rs.Strikethrough (0, MCode.Rs.Length)";
_mcode._rs /*anywheresoftware.b4a.agraham.richstring.RichStringBuilder.RichString*/ .Strikethrough((int) (0),_mcode._rs /*anywheresoftware.b4a.agraham.richstring.RichStringBuilder.RichString*/ .getLength());
RDebugUtils.currentLine=93782056;
 //BA.debugLineNum = 93782056;BA.debugLine="MCode.Rs.Color(Colors.Red,0, MCode.Rs.Length)";
_mcode._rs /*anywheresoftware.b4a.agraham.richstring.RichStringBuilder.RichString*/ .Color(__c.Colors.Red,(int) (0),_mcode._rs /*anywheresoftware.b4a.agraham.richstring.RichStringBuilder.RichString*/ .getLength());
RDebugUtils.currentLine=93782057;
 //BA.debugLineNum = 93782057;BA.debugLine="LblFee.Text = MCode.Rs";
__ref._lblfee /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_mcode._rs /*anywheresoftware.b4a.agraham.richstring.RichStringBuilder.RichString*/ .getObject()));
RDebugUtils.currentLine=93782058;
 //BA.debugLineNum = 93782058;BA.debugLine="LblFeeBadAzTakhfid.Text = NumberFormat(Item.Fl";
__ref._lblfeebadaztakhfid /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__c.NumberFormat((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldFeeBadAzTakhfif /*String*/ )),(int) (1),(int) (3))+" "+_mcode._vahedpool /*String*/ ));
RDebugUtils.currentLine=93782059;
 //BA.debugLineNum = 93782059;BA.debugLine="ImageOff.Visible=True";
__ref._imageoff /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .setVisible(__c.True);
 }else {
RDebugUtils.currentLine=93782061;
 //BA.debugLineNum = 93782061;BA.debugLine="LblFee.Text = NumberFormat(Item.FeeForoosh,1,3";
__ref._lblfee /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__c.NumberFormat(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FeeForoosh /*int*/ ,(int) (1),(int) (3))+" "+_mcode._vahedpool /*String*/ ));
RDebugUtils.currentLine=93782062;
 //BA.debugLineNum = 93782062;BA.debugLine="LblFeeBadAzTakhfid.Text = \"\"";
__ref._lblfeebadaztakhfid /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=93782063;
 //BA.debugLineNum = 93782063;BA.debugLine="ImageOff.Visible=False";
__ref._imageoff /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .setVisible(__c.False);
 };
 }else {
RDebugUtils.currentLine=93782066;
 //BA.debugLineNum = 93782066;BA.debugLine="LblFee.Text = NumberFormat(Item.FeeForoosh,1,3)";
__ref._lblfee /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__c.NumberFormat(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FeeForoosh /*int*/ ,(int) (1),(int) (3))+" "+_mcode._vahedpool /*String*/ ));
RDebugUtils.currentLine=93782067;
 //BA.debugLineNum = 93782067;BA.debugLine="LblFeeBadAzTakhfid.Text = \"\"";
__ref._lblfeebadaztakhfid /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(""));
 };
RDebugUtils.currentLine=93782071;
 //BA.debugLineNum = 93782071;BA.debugLine="If Item.TedadDarSabadJoz=Null Then";
if (__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadJoz /*String*/ == null) { 
RDebugUtils.currentLine=93782072;
 //BA.debugLineNum = 93782072;BA.debugLine="LblTedadJoz.Text=0";
__ref._lbltedadjoz /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(0));
RDebugUtils.currentLine=93782073;
 //BA.debugLineNum = 93782073;BA.debugLine="Item.TedadDarSabadJoz=0";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadJoz /*String*/  = BA.NumberToString(0);
 }else {
RDebugUtils.currentLine=93782075;
 //BA.debugLineNum = 93782075;BA.debugLine="LblTedadJoz.Text =Item.TedadDarSabadJoz";
__ref._lbltedadjoz /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadJoz /*String*/ ));
 };
RDebugUtils.currentLine=93782077;
 //BA.debugLineNum = 93782077;BA.debugLine="lblVahedJoz.Text = \"تعداد به \"& Item.NameVahed";
__ref._lblvahedjoz /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("تعداد به "+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .NameVahed /*String*/ ));
RDebugUtils.currentLine=93782079;
 //BA.debugLineNum = 93782079;BA.debugLine="If Item.TedadDarSabadKol=Null Then";
if (__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadKol /*String*/ == null) { 
RDebugUtils.currentLine=93782080;
 //BA.debugLineNum = 93782080;BA.debugLine="LblTedadkol.Text=0";
__ref._lbltedadkol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(0));
RDebugUtils.currentLine=93782081;
 //BA.debugLineNum = 93782081;BA.debugLine="Item.TedadDarSabadKol=0";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadKol /*String*/  = BA.NumberToString(0);
 }else {
RDebugUtils.currentLine=93782083;
 //BA.debugLineNum = 93782083;BA.debugLine="LblTedadkol.Text =Item.TedadDarSabadKol";
__ref._lbltedadkol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadKol /*String*/ ));
 };
RDebugUtils.currentLine=93782085;
 //BA.debugLineNum = 93782085;BA.debugLine="lblVahedKol.Text = \"تعداد به \"& Item.NameVahed2";
__ref._lblvahedkol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("تعداد به "+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .NameVahed2 /*String*/ ));
RDebugUtils.currentLine=93782097;
 //BA.debugLineNum = 93782097;BA.debugLine="If Item.FldEshantion=Null Then";
if (__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FldEshantion /*String*/ == null) { 
RDebugUtils.currentLine=93782098;
 //BA.debugLineNum = 93782098;BA.debugLine="Item.FldEshantion=0";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FldEshantion /*String*/  = BA.NumberToString(0);
 };
RDebugUtils.currentLine=93782101;
 //BA.debugLineNum = 93782101;BA.debugLine="If Item.TedadDarKarton<>0 And IsNumber(Item.Teda";
if ((__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarKarton /*String*/ ).equals(BA.NumberToString(0)) == false && __c.IsNumber(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarKarton /*String*/ )==__c.True) { 
RDebugUtils.currentLine=93782102;
 //BA.debugLineNum = 93782102;BA.debugLine="maxkolRond=(Item.SumMandeKarton)";
__ref._maxkolrond /*long*/  = (long)(Double.parseDouble((__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMandeKarton /*String*/ )));
RDebugUtils.currentLine=93782103;
 //BA.debugLineNum = 93782103;BA.debugLine="LblTedadKarton.Text=\"تعداد در کارتن: \"& Item.Te";
__ref._lbltedadkarton /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("تعداد در کارتن: "+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarKarton /*String*/ ));
RDebugUtils.currentLine=93782104;
 //BA.debugLineNum = 93782104;BA.debugLine="Log(maxkolRond)";
__c.LogImpl("593782104",BA.NumberToString(__ref._maxkolrond /*long*/ ),0);
 }else {
RDebugUtils.currentLine=93782106;
 //BA.debugLineNum = 93782106;BA.debugLine="maxkolRond=0";
__ref._maxkolrond /*long*/  = (long) (0);
RDebugUtils.currentLine=93782107;
 //BA.debugLineNum = 93782107;BA.debugLine="LblTedadKarton.Text=\"تعداد در کارتن:\"&maxkolRon";
__ref._lbltedadkarton /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("تعداد در کارتن:"+BA.NumberToString(__ref._maxkolrond /*long*/ )));
RDebugUtils.currentLine=93782108;
 //BA.debugLineNum = 93782108;BA.debugLine="LblMojoodiKol.Text =\"موجودی کل: -\"";
__ref._lblmojoodikol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("موجودی کل: -"));
 };
RDebugUtils.currentLine=93782110;
 //BA.debugLineNum = 93782110;BA.debugLine="Log(maxkolRond)";
__c.LogImpl("593782110",BA.NumberToString(__ref._maxkolrond /*long*/ ),0);
RDebugUtils.currentLine=93782111;
 //BA.debugLineNum = 93782111;BA.debugLine="LblMojoodiJoz.Text =\"موجودی جزء: \"& Item.SumMand";
__ref._lblmojoodijoz /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("موجودی جزء: "+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/ +" "+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .NameVahed /*String*/ ));
RDebugUtils.currentLine=93782113;
 //BA.debugLineNum = 93782113;BA.debugLine="If  Item.SumMandeKarton <> Null Then";
if (__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMandeKarton /*String*/ != null) { 
RDebugUtils.currentLine=93782114;
 //BA.debugLineNum = 93782114;BA.debugLine="LblMojoodiKol.Text =\"موجودی کل: \"& maxkolRond &";
__ref._lblmojoodikol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("موجودی کل: "+BA.NumberToString(__ref._maxkolrond /*long*/ )+" "+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .NameVahed2 /*String*/ ));
 }else {
RDebugUtils.currentLine=93782116;
 //BA.debugLineNum = 93782116;BA.debugLine="LblMojoodiKol.Text =\"موجودی کل: -\"";
__ref._lblmojoodikol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("موجودی کل: -"));
 };
RDebugUtils.currentLine=93782121;
 //BA.debugLineNum = 93782121;BA.debugLine="If myCode.Is_Null_adad(Item.FldMablaghMasrafKona";
if ((double)(Double.parseDouble(_mycode._is_null_adad /*String*/ (ba,__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FldMablaghMasrafKonande /*String*/ )))>0) { 
RDebugUtils.currentLine=93782122;
 //BA.debugLineNum = 93782122;BA.debugLine="LblMablaghMasrafkonande.Text=\"قیمت مصرف کننده:";
__ref._lblmablaghmasrafkonande /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("قیمت مصرف کننده: "+__c.NumberFormat((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FldMablaghMasrafKonande /*String*/ )),(int) (1),(int) (3))+" "+_mcode._vahedpool /*String*/ ));
 }else {
RDebugUtils.currentLine=93782124;
 //BA.debugLineNum = 93782124;BA.debugLine="LblMablaghMasrafkonande.Text=\"قیمت مصرف کننده:";
__ref._lblmablaghmasrafkonande /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("قیمت مصرف کننده: 0"));
 };
RDebugUtils.currentLine=93782127;
 //BA.debugLineNum = 93782127;BA.debugLine="If Item.fldCountEshantion<>Null Then";
if (__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldCountEshantion /*String*/ != null) { 
RDebugUtils.currentLine=93782128;
 //BA.debugLineNum = 93782128;BA.debugLine="LblCountEshantion.Text=\"تعداد هدیه : \" & Item.f";
__ref._lblcounteshantion /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("تعداد هدیه : "+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldCountEshantion /*String*/ ));
RDebugUtils.currentLine=93782129;
 //BA.debugLineNum = 93782129;BA.debugLine="LblTedadEshan.Text=Item.FldEshantion";
__ref._lbltedadeshan /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FldEshantion /*String*/ ));
 }else {
RDebugUtils.currentLine=93782131;
 //BA.debugLineNum = 93782131;BA.debugLine="LblCountEshantion.Text=\"تعداد هدیه : 0\"";
__ref._lblcounteshantion /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("تعداد هدیه : 0"));
 };
RDebugUtils.currentLine=93782136;
 //BA.debugLineNum = 93782136;BA.debugLine="If MCode.HideMojodi=1 Then";
if ((_mcode._hidemojodi /*String*/ ).equals(BA.NumberToString(1))) { 
RDebugUtils.currentLine=93782137;
 //BA.debugLineNum = 93782137;BA.debugLine="LblMojoodiJoz.Visible=False";
__ref._lblmojoodijoz /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=93782138;
 //BA.debugLineNum = 93782138;BA.debugLine="LblMojoodiKol.Visible=False";
__ref._lblmojoodikol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
 }else {
RDebugUtils.currentLine=93782140;
 //BA.debugLineNum = 93782140;BA.debugLine="LblMojoodiJoz.Visible=True";
__ref._lblmojoodijoz /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=93782141;
 //BA.debugLineNum = 93782141;BA.debugLine="LblMojoodiKol.Visible=True";
__ref._lblmojoodikol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.True);
 };
RDebugUtils.currentLine=93782143;
 //BA.debugLineNum = 93782143;BA.debugLine="Try";
try {RDebugUtils.currentLine=93782144;
 //BA.debugLineNum = 93782144;BA.debugLine="myCode.DownloadImage5(Item.CodeKala,Item.fldPat";
_mycode._downloadimage5 /*String*/ (ba,__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .CodeKala /*String*/ ,__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldPathPic /*String*/ ,__ref._imagerow /*anywheresoftware.b4a.objects.ImageViewWrapper*/ );
 } 
       catch (Exception e77) {
			ba.setLastException(e77);RDebugUtils.currentLine=93782164;
 //BA.debugLineNum = 93782164;BA.debugLine="Log(LastException)";
__c.LogImpl("593782164",BA.ObjectToString(__c.LastException(ba)),0);
 };
 } 
       catch (Exception e80) {
			ba.setLastException(e80);RDebugUtils.currentLine=93782168;
 //BA.debugLineNum = 93782168;BA.debugLine="Log(LastException)";
__c.LogImpl("593782168",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=93782170;
 //BA.debugLineNum = 93782170;BA.debugLine="If MCode.Action=\"SabtMarjooii\" Then";
if ((_mcode._action /*String*/ ).equals("SabtMarjooii")) { 
RDebugUtils.currentLine=93782171;
 //BA.debugLineNum = 93782171;BA.debugLine="BtnUpEshan.Enabled=False";
__ref._btnupeshan /*anywheresoftware.b4a.objects.LabelWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=93782172;
 //BA.debugLineNum = 93782172;BA.debugLine="BtnDownEshan.Enabled=False";
__ref._btndowneshan /*anywheresoftware.b4a.objects.LabelWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=93782173;
 //BA.debugLineNum = 93782173;BA.debugLine="LblTedadEshan.Color=Colors.LightGray";
__ref._lbltedadeshan /*anywheresoftware.b4a.objects.LabelWrapper*/ .setColor(__c.Colors.LightGray);
 };
RDebugUtils.currentLine=93782175;
 //BA.debugLineNum = 93782175;BA.debugLine="End Sub";
return "";
}
public int  _getwidth(ir.parsikhesab.pakhsh.cls_kalapaging __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_kalapaging";
if (Debug.shouldDelegate(ba, "getwidth", false))
	 {return ((Integer) Debug.delegate(ba, "getwidth", null));}
RDebugUtils.currentLine=93716480;
 //BA.debugLineNum = 93716480;BA.debugLine="Public Sub getWidth As Int";
RDebugUtils.currentLine=93716481;
 //BA.debugLineNum = 93716481;BA.debugLine="Return pnl_bk.Width";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth();
RDebugUtils.currentLine=93716482;
 //BA.debugLineNum = 93716482;BA.debugLine="End Sub";
return 0;
}
public int  _getheight(ir.parsikhesab.pakhsh.cls_kalapaging __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_kalapaging";
if (Debug.shouldDelegate(ba, "getheight", false))
	 {return ((Integer) Debug.delegate(ba, "getheight", null));}
RDebugUtils.currentLine=93650944;
 //BA.debugLineNum = 93650944;BA.debugLine="Public Sub getHeight As Int";
RDebugUtils.currentLine=93650945;
 //BA.debugLineNum = 93650945;BA.debugLine="Return pnl_bk.Height";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight();
RDebugUtils.currentLine=93650946;
 //BA.debugLineNum = 93650946;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(ir.parsikhesab.pakhsh.cls_kalapaging __ref,anywheresoftware.b4a.BA _ba,Object _mdl) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cls_kalapaging";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_mdl}));}
RDebugUtils.currentLine=93519872;
 //BA.debugLineNum = 93519872;BA.debugLine="Public Sub Initialize(mdl As Object)";
RDebugUtils.currentLine=93519873;
 //BA.debugLineNum = 93519873;BA.debugLine="base = mdl";
__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_mdl));
RDebugUtils.currentLine=93519874;
 //BA.debugLineNum = 93519874;BA.debugLine="Key.Initialize(\"Key\")";
__ref._key /*anywheresoftware.b4a.objects.IME*/ .Initialize("Key");
RDebugUtils.currentLine=93519875;
 //BA.debugLineNum = 93519875;BA.debugLine="p.Initialize(\"\")";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=93519876;
 //BA.debugLineNum = 93519876;BA.debugLine="p.SetLayout(0,0,100%x,100%y)";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .SetLayout((int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
RDebugUtils.currentLine=93519877;
 //BA.debugLineNum = 93519877;BA.debugLine="p.LoadLayout(\"L_PageKala_2\")";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .LoadLayout("L_PageKala_2",ba);
RDebugUtils.currentLine=93519879;
 //BA.debugLineNum = 93519879;BA.debugLine="Dialog.Initialize (base)";
__ref._dialog /*ir.parsikhesab.pakhsh.b4xdialog*/ ._initialize /*String*/ (null,ba,__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=93519880;
 //BA.debugLineNum = 93519880;BA.debugLine="options.Initialize";
__ref._options /*ir.parsikhesab.pakhsh.b4xlisttemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=93519881;
 //BA.debugLineNum = 93519881;BA.debugLine="options.AllowMultiSelection = False";
__ref._options /*ir.parsikhesab.pakhsh.b4xlisttemplate*/ ._allowmultiselection /*boolean*/  = __c.False;
RDebugUtils.currentLine=93519882;
 //BA.debugLineNum = 93519882;BA.debugLine="options.MultiSelectionMinimum = 1";
__ref._options /*ir.parsikhesab.pakhsh.b4xlisttemplate*/ ._multiselectionminimum /*int*/  = (int) (1);
RDebugUtils.currentLine=93519884;
 //BA.debugLineNum = 93519884;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _getpanel(ir.parsikhesab.pakhsh.cls_kalapaging __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_kalapaging";
if (Debug.shouldDelegate(ba, "getpanel", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "getpanel", null));}
RDebugUtils.currentLine=93585408;
 //BA.debugLineNum = 93585408;BA.debugLine="Public Sub getPanel As Panel";
RDebugUtils.currentLine=93585409;
 //BA.debugLineNum = 93585409;BA.debugLine="pnl_bk.RemoveView";
__ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .RemoveView();
RDebugUtils.currentLine=93585410;
 //BA.debugLineNum = 93585410;BA.debugLine="Return pnl_bk";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ ;
RDebugUtils.currentLine=93585411;
 //BA.debugLineNum = 93585411;BA.debugLine="End Sub";
return null;
}
public String  _add_item(ir.parsikhesab.pakhsh.cls_kalapaging __ref,String _s) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_kalapaging";
if (Debug.shouldDelegate(ba, "add_item", false))
	 {return ((String) Debug.delegate(ba, "add_item", new Object[] {_s}));}
RDebugUtils.currentLine=93913088;
 //BA.debugLineNum = 93913088;BA.debugLine="Private Sub Add_Item(s As String)";
RDebugUtils.currentLine=93913090;
 //BA.debugLineNum = 93913090;BA.debugLine="If s=Null Then";
if (_s== null) { 
RDebugUtils.currentLine=93913091;
 //BA.debugLineNum = 93913091;BA.debugLine="Log(\"Null\")";
__c.LogImpl("593913091","Null",0);
 }else 
{RDebugUtils.currentLine=93913092;
 //BA.debugLineNum = 93913092;BA.debugLine="Else If s.Trim=\"\" Then";
if ((_s.trim()).equals("")) { 
RDebugUtils.currentLine=93913093;
 //BA.debugLineNum = 93913093;BA.debugLine="Log(\"empty\")";
__c.LogImpl("593913093","empty",0);
 }else 
{RDebugUtils.currentLine=93913094;
 //BA.debugLineNum = 93913094;BA.debugLine="Else If s.Trim=\"0\" Then";
if ((_s.trim()).equals("0")) { 
RDebugUtils.currentLine=93913095;
 //BA.debugLineNum = 93913095;BA.debugLine="Log(\"zeroo\")";
__c.LogImpl("593913095","zeroo",0);
 }else {
RDebugUtils.currentLine=93913097;
 //BA.debugLineNum = 93913097;BA.debugLine="options.Options.Add(s)";
__ref._options /*ir.parsikhesab.pakhsh.b4xlisttemplate*/ ._options /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_s));
 }}}
;
RDebugUtils.currentLine=93913099;
 //BA.debugLineNum = 93913099;BA.debugLine="End Sub";
return "";
}
public String  _addeshantion(ir.parsikhesab.pakhsh.cls_kalapaging __ref,int _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_kalapaging";
if (Debug.shouldDelegate(ba, "addeshantion", false))
	 {return ((String) Debug.delegate(ba, "addeshantion", new Object[] {_t}));}
RDebugUtils.currentLine=94109696;
 //BA.debugLineNum = 94109696;BA.debugLine="Sub AddEshantion(t As Int)";
RDebugUtils.currentLine=94109728;
 //BA.debugLineNum = 94109728;BA.debugLine="End Sub";
return "";
}
public String  _addtosabad(ir.parsikhesab.pakhsh.cls_kalapaging __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_kalapaging";
if (Debug.shouldDelegate(ba, "addtosabad", false))
	 {return ((String) Debug.delegate(ba, "addtosabad", null));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
boolean _check = false;
int _i = 0;
RDebugUtils.currentLine=94437376;
 //BA.debugLineNum = 94437376;BA.debugLine="Sub AddToSabad";
RDebugUtils.currentLine=94437378;
 //BA.debugLineNum = 94437378;BA.debugLine="LblTedadJoz.Text = Item.TedadDarSabadJoz";
__ref._lbltedadjoz /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadJoz /*String*/ ));
RDebugUtils.currentLine=94437379;
 //BA.debugLineNum = 94437379;BA.debugLine="LblTedadkol.Text = Item.TedadDarSabadKol";
__ref._lbltedadkol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadKol /*String*/ ));
RDebugUtils.currentLine=94437380;
 //BA.debugLineNum = 94437380;BA.debugLine="LblTedadEshan.Text = Item.FldEshantion";
__ref._lbltedadeshan /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FldEshantion /*String*/ ));
RDebugUtils.currentLine=94437382;
 //BA.debugLineNum = 94437382;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From Tb";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = _mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (ba,"Select * From TblSabad");
RDebugUtils.currentLine=94437383;
 //BA.debugLineNum = 94437383;BA.debugLine="Dim Check As Boolean";
_check = false;
RDebugUtils.currentLine=94437384;
 //BA.debugLineNum = 94437384;BA.debugLine="For i=0 To Cu.RowCount -1";
{
final int step6 = 1;
final int limit6 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=94437385;
 //BA.debugLineNum = 94437385;BA.debugLine="Cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=94437386;
 //BA.debugLineNum = 94437386;BA.debugLine="If Cu.GetString(\"FldCodeKala\") = Item.CodeKala T";
if ((_cu.GetString("FldCodeKala")).equals(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .CodeKala /*String*/ )) { 
RDebugUtils.currentLine=94437387;
 //BA.debugLineNum = 94437387;BA.debugLine="If Item.TedadDarSabadJoz = 0 And Item.TedadDarS";
if ((__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadJoz /*String*/ ).equals(BA.NumberToString(0)) && (__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadKol /*String*/ ).equals(BA.NumberToString(0)) && (__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FldEshantion /*String*/ ).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=94437388;
 //BA.debugLineNum = 94437388;BA.debugLine="MCode.SaveUpdate(\"Delete From TblSabad Where F";
_mcode._saveupdate /*String*/ (ba,"Delete From TblSabad Where FldCodeKala = '"+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .CodeKala /*String*/ +"'");
 }else {
RDebugUtils.currentLine=94437390;
 //BA.debugLineNum = 94437390;BA.debugLine="MCode.SaveUpdate(\"Update TblSabad Set FldTedad";
_mcode._saveupdate /*String*/ (ba,"Update TblSabad Set FldTedadDarSabadJoz = '"+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadJoz /*String*/ +"',FldTedadDarSabadKol = '"+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadKol /*String*/ +"', FldEshantion = '"+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FldEshantion /*String*/ +"' Where FldCodeKala = '"+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .CodeKala /*String*/ +"'");
 };
RDebugUtils.currentLine=94437393;
 //BA.debugLineNum = 94437393;BA.debugLine="Check = True";
_check = __c.True;
RDebugUtils.currentLine=94437394;
 //BA.debugLineNum = 94437394;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=94437397;
 //BA.debugLineNum = 94437397;BA.debugLine="If Check = False Then";
if (_check==__c.False) { 
RDebugUtils.currentLine=94437398;
 //BA.debugLineNum = 94437398;BA.debugLine="MCode.AddToSabad(Item)";
_mcode._addtosabad /*String*/ (ba,__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ );
 };
RDebugUtils.currentLine=94437401;
 //BA.debugLineNum = 94437401;BA.debugLine="RefreshLblSabad";
__ref._refreshlblsabad /*String*/ (null);
RDebugUtils.currentLine=94437402;
 //BA.debugLineNum = 94437402;BA.debugLine="End Sub";
return "";
}
public String  _refreshlblsabad(ir.parsikhesab.pakhsh.cls_kalapaging __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_kalapaging";
if (Debug.shouldDelegate(ba, "refreshlblsabad", false))
	 {return ((String) Debug.delegate(ba, "refreshlblsabad", null));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
RDebugUtils.currentLine=95158272;
 //BA.debugLineNum = 95158272;BA.debugLine="Sub RefreshLblSabad";
RDebugUtils.currentLine=95158273;
 //BA.debugLineNum = 95158273;BA.debugLine="Try";
try {RDebugUtils.currentLine=95158274;
 //BA.debugLineNum = 95158274;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From T";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = _mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (ba,"Select * From TblSabad");
RDebugUtils.currentLine=95158275;
 //BA.debugLineNum = 95158275;BA.debugLine="If Cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=95158276;
 //BA.debugLineNum = 95158276;BA.debugLine="LblBasketCount.Visible=True";
__ref._lblbasketcount /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=95158277;
 //BA.debugLineNum = 95158277;BA.debugLine="LblBasketCount.Text=Cu.RowCount";
__ref._lblbasketcount /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_cu.getRowCount()));
 }else {
RDebugUtils.currentLine=95158280;
 //BA.debugLineNum = 95158280;BA.debugLine="LblBasketCount.Visible=False";
__ref._lblbasketcount /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
 };
 } 
       catch (Exception e10) {
			ba.setLastException(e10);RDebugUtils.currentLine=95158283;
 //BA.debugLineNum = 95158283;BA.debugLine="Log(LastException)";
__c.LogImpl("595158283",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=95158286;
 //BA.debugLineNum = 95158286;BA.debugLine="End Sub";
return "";
}
public String  _btn_back_click(ir.parsikhesab.pakhsh.cls_kalapaging __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_kalapaging";
if (Debug.shouldDelegate(ba, "btn_back_click", false))
	 {return ((String) Debug.delegate(ba, "btn_back_click", null));}
RDebugUtils.currentLine=94502912;
 //BA.debugLineNum = 94502912;BA.debugLine="Private Sub btn_back_Click";
RDebugUtils.currentLine=94502915;
 //BA.debugLineNum = 94502915;BA.debugLine="End Sub";
return "";
}
public String  _btn_close_click(ir.parsikhesab.pakhsh.cls_kalapaging __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_kalapaging";
if (Debug.shouldDelegate(ba, "btn_close_click", false))
	 {return ((String) Debug.delegate(ba, "btn_close_click", null));}
RDebugUtils.currentLine=94568448;
 //BA.debugLineNum = 94568448;BA.debugLine="Private Sub btn_close_Click";
RDebugUtils.currentLine=94568449;
 //BA.debugLineNum = 94568449;BA.debugLine="btn_back_Click";
__ref._btn_back_click /*String*/ (null);
RDebugUtils.currentLine=94568450;
 //BA.debugLineNum = 94568450;BA.debugLine="End Sub";
return "";
}
public String  _btn_edit_price_click(ir.parsikhesab.pakhsh.cls_kalapaging __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_kalapaging";
if (Debug.shouldDelegate(ba, "btn_edit_price_click", false))
	 {return ((String) Debug.delegate(ba, "btn_edit_price_click", null));}
RDebugUtils.currentLine=94896128;
 //BA.debugLineNum = 94896128;BA.debugLine="Private Sub btn_edit_Price_Click";
RDebugUtils.currentLine=94896145;
 //BA.debugLineNum = 94896145;BA.debugLine="End Sub";
return "";
}
public String  _btndowneshan_click(ir.parsikhesab.pakhsh.cls_kalapaging __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_kalapaging";
if (Debug.shouldDelegate(ba, "btndowneshan_click", false))
	 {return ((String) Debug.delegate(ba, "btndowneshan_click", null));}
int _a = 0;
RDebugUtils.currentLine=95027200;
 //BA.debugLineNum = 95027200;BA.debugLine="Sub BtnDownEshan_Click";
RDebugUtils.currentLine=95027201;
 //BA.debugLineNum = 95027201;BA.debugLine="Try";
try {RDebugUtils.currentLine=95027202;
 //BA.debugLineNum = 95027202;BA.debugLine="Dim A As Int = 0";
_a = (int) (0);
RDebugUtils.currentLine=95027203;
 //BA.debugLineNum = 95027203;BA.debugLine="A = Item.FldEshantion";
_a = (int)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FldEshantion /*String*/ ));
RDebugUtils.currentLine=95027204;
 //BA.debugLineNum = 95027204;BA.debugLine="If A > 0 Then";
if (_a>0) { 
RDebugUtils.currentLine=95027205;
 //BA.debugLineNum = 95027205;BA.debugLine="A = A - 1";
_a = (int) (_a-1);
RDebugUtils.currentLine=95027206;
 //BA.debugLineNum = 95027206;BA.debugLine="Item.SumMande = Item.SumMande + 1";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/  = BA.NumberToString((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/ ))+1);
RDebugUtils.currentLine=95027207;
 //BA.debugLineNum = 95027207;BA.debugLine="Item.FldEshantion  = A";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FldEshantion /*String*/  = BA.NumberToString(_a);
 };
RDebugUtils.currentLine=95027209;
 //BA.debugLineNum = 95027209;BA.debugLine="AddToSabad";
__ref._addtosabad /*String*/ (null);
 } 
       catch (Exception e11) {
			ba.setLastException(e11);RDebugUtils.currentLine=95027211;
 //BA.debugLineNum = 95027211;BA.debugLine="MCode.SendError(LastException)";
_mcode._senderror /*String*/ (ba,BA.ObjectToString(__c.LastException(ba)));
RDebugUtils.currentLine=95027212;
 //BA.debugLineNum = 95027212;BA.debugLine="Log(LastException)";
__c.LogImpl("595027212",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=95027214;
 //BA.debugLineNum = 95027214;BA.debugLine="End Sub";
return "";
}
public String  _btndownjoz_click(ir.parsikhesab.pakhsh.cls_kalapaging __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_kalapaging";
if (Debug.shouldDelegate(ba, "btndownjoz_click", false))
	 {return ((String) Debug.delegate(ba, "btndownjoz_click", null));}
float _a = 0f;
float _val = 0f;
RDebugUtils.currentLine=94240768;
 //BA.debugLineNum = 94240768;BA.debugLine="Sub BtnDownJoz_Click";
RDebugUtils.currentLine=94240770;
 //BA.debugLineNum = 94240770;BA.debugLine="Dim A As Float = 0";
_a = (float) (0);
RDebugUtils.currentLine=94240771;
 //BA.debugLineNum = 94240771;BA.debugLine="Dim Val As Float = 0";
_val = (float) (0);
RDebugUtils.currentLine=94240772;
 //BA.debugLineNum = 94240772;BA.debugLine="Select Case MCode.isFloat";
switch (BA.switchObjectToInt(_mcode._isfloat /*boolean*/ ,__c.True,__c.False)) {
case 0: {
RDebugUtils.currentLine=94240774;
 //BA.debugLineNum = 94240774;BA.debugLine="Val = 0.25";
_val = (float) (0.25);
 break; }
case 1: {
RDebugUtils.currentLine=94240776;
 //BA.debugLineNum = 94240776;BA.debugLine="Val = 1";
_val = (float) (1);
 break; }
}
;
RDebugUtils.currentLine=94240779;
 //BA.debugLineNum = 94240779;BA.debugLine="A = Item.TedadDarSabadJoz";
_a = (float)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadJoz /*String*/ ));
RDebugUtils.currentLine=94240780;
 //BA.debugLineNum = 94240780;BA.debugLine="If A > 0 Then";
if (_a>0) { 
RDebugUtils.currentLine=94240781;
 //BA.debugLineNum = 94240781;BA.debugLine="A = A - Val";
_a = (float) (_a-_val);
RDebugUtils.currentLine=94240782;
 //BA.debugLineNum = 94240782;BA.debugLine="Item.SumMande = Item.SumMande + Val";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/  = BA.NumberToString((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/ ))+_val);
RDebugUtils.currentLine=94240783;
 //BA.debugLineNum = 94240783;BA.debugLine="Item.TedadDarSabadJoz = A";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadJoz /*String*/  = BA.NumberToString(_a);
 };
RDebugUtils.currentLine=94240791;
 //BA.debugLineNum = 94240791;BA.debugLine="AddToSabad";
__ref._addtosabad /*String*/ (null);
RDebugUtils.currentLine=94240792;
 //BA.debugLineNum = 94240792;BA.debugLine="End Sub";
return "";
}
public String  _btndownkol_click(ir.parsikhesab.pakhsh.cls_kalapaging __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_kalapaging";
if (Debug.shouldDelegate(ba, "btndownkol_click", false))
	 {return ((String) Debug.delegate(ba, "btndownkol_click", null));}
int _a = 0;
RDebugUtils.currentLine=94371840;
 //BA.debugLineNum = 94371840;BA.debugLine="Sub BtnDownKol_Click";
RDebugUtils.currentLine=94371841;
 //BA.debugLineNum = 94371841;BA.debugLine="Dim A As Int = 0";
_a = (int) (0);
RDebugUtils.currentLine=94371842;
 //BA.debugLineNum = 94371842;BA.debugLine="A = Item.TedadDarSabadKol";
_a = (int)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadKol /*String*/ ));
RDebugUtils.currentLine=94371843;
 //BA.debugLineNum = 94371843;BA.debugLine="If A > 0 Then";
if (_a>0) { 
RDebugUtils.currentLine=94371844;
 //BA.debugLineNum = 94371844;BA.debugLine="A = A - 1";
_a = (int) (_a-1);
RDebugUtils.currentLine=94371845;
 //BA.debugLineNum = 94371845;BA.debugLine="Item.SumMandeKarton = Item.SumMandeKarton + Item";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMandeKarton /*String*/  = BA.NumberToString((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMandeKarton /*String*/ ))+(double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadKol /*String*/ )));
RDebugUtils.currentLine=94371846;
 //BA.debugLineNum = 94371846;BA.debugLine="Item.TedadDarSabadKol = A";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadKol /*String*/  = BA.NumberToString(_a);
 };
RDebugUtils.currentLine=94371848;
 //BA.debugLineNum = 94371848;BA.debugLine="AddToSabad";
__ref._addtosabad /*String*/ (null);
RDebugUtils.currentLine=94371849;
 //BA.debugLineNum = 94371849;BA.debugLine="End Sub";
return "";
}
public String  _btnupeshan_click(ir.parsikhesab.pakhsh.cls_kalapaging __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_kalapaging";
if (Debug.shouldDelegate(ba, "btnupeshan_click", false))
	 {return ((String) Debug.delegate(ba, "btnupeshan_click", null));}
int _a = 0;
int _b = 0;
RDebugUtils.currentLine=94961664;
 //BA.debugLineNum = 94961664;BA.debugLine="Sub BtnUpEshan_Click";
RDebugUtils.currentLine=94961665;
 //BA.debugLineNum = 94961665;BA.debugLine="Try";
try {RDebugUtils.currentLine=94961666;
 //BA.debugLineNum = 94961666;BA.debugLine="Dim A As Int = 0";
_a = (int) (0);
RDebugUtils.currentLine=94961667;
 //BA.debugLineNum = 94961667;BA.debugLine="Dim B As Int = 0";
_b = (int) (0);
RDebugUtils.currentLine=94961668;
 //BA.debugLineNum = 94961668;BA.debugLine="A = Item.FldEshantion";
_a = (int)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FldEshantion /*String*/ ));
RDebugUtils.currentLine=94961669;
 //BA.debugLineNum = 94961669;BA.debugLine="If MCode.ForooshBishAzMojoodi = \"1\" Then";
if ((_mcode._forooshbishazmojoodi /*String*/ ).equals("1")) { 
RDebugUtils.currentLine=94961670;
 //BA.debugLineNum = 94961670;BA.debugLine="If Item.FldEshantion<Item.fldCountEshantion The";
if ((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FldEshantion /*String*/ ))<(double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldCountEshantion /*String*/ ))) { 
RDebugUtils.currentLine=94961671;
 //BA.debugLineNum = 94961671;BA.debugLine="A = A + 1";
_a = (int) (_a+1);
RDebugUtils.currentLine=94961672;
 //BA.debugLineNum = 94961672;BA.debugLine="Item.SumMande = Item.SumMande - 1";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/  = BA.NumberToString((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/ ))-1);
 };
 }else 
{RDebugUtils.currentLine=94961675;
 //BA.debugLineNum = 94961675;BA.debugLine="Else if MCode.ForooshBishAzMojoodi = \"0\" Then";
if ((_mcode._forooshbishazmojoodi /*String*/ ).equals("0")) { 
RDebugUtils.currentLine=94961676;
 //BA.debugLineNum = 94961676;BA.debugLine="B = Item.SumMande - ((Item.TedadDarSabadKol * I";
_b = (int) ((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/ ))-(((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadKol /*String*/ ))*(double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarKarton /*String*/ )))+(double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadJoz /*String*/ ))+(double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FldEshantion /*String*/ ))));
RDebugUtils.currentLine=94961677;
 //BA.debugLineNum = 94961677;BA.debugLine="If B > 0 Then";
if (_b>0) { 
RDebugUtils.currentLine=94961678;
 //BA.debugLineNum = 94961678;BA.debugLine="If Item.FldEshantion<Item.fldCountEshantion Th";
if ((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FldEshantion /*String*/ ))<(double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldCountEshantion /*String*/ ))) { 
RDebugUtils.currentLine=94961679;
 //BA.debugLineNum = 94961679;BA.debugLine="A = A + 1";
_a = (int) (_a+1);
RDebugUtils.currentLine=94961680;
 //BA.debugLineNum = 94961680;BA.debugLine="Item.SumMande = Item.SumMande - 1";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/  = BA.NumberToString((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/ ))-1);
 };
 }else {
RDebugUtils.currentLine=94961683;
 //BA.debugLineNum = 94961683;BA.debugLine="ToastMessageShow(\"سفارش شما بیشتر از موجودی می";
__c.ToastMessageShow(BA.ObjectToCharSequence("سفارش شما بیشتر از موجودی می باشد"),__c.True);
 };
 }}
;
RDebugUtils.currentLine=94961686;
 //BA.debugLineNum = 94961686;BA.debugLine="Item.FldEshantion = A";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FldEshantion /*String*/  = BA.NumberToString(_a);
RDebugUtils.currentLine=94961687;
 //BA.debugLineNum = 94961687;BA.debugLine="AddToSabad";
__ref._addtosabad /*String*/ (null);
 } 
       catch (Exception e24) {
			ba.setLastException(e24);RDebugUtils.currentLine=94961689;
 //BA.debugLineNum = 94961689;BA.debugLine="MCode.SendError(LastException)";
_mcode._senderror /*String*/ (ba,BA.ObjectToString(__c.LastException(ba)));
RDebugUtils.currentLine=94961690;
 //BA.debugLineNum = 94961690;BA.debugLine="Log(LastException)";
__c.LogImpl("594961690",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=94961692;
 //BA.debugLineNum = 94961692;BA.debugLine="End Sub";
return "";
}
public String  _btnupjoz_click(ir.parsikhesab.pakhsh.cls_kalapaging __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_kalapaging";
if (Debug.shouldDelegate(ba, "btnupjoz_click", false))
	 {return ((String) Debug.delegate(ba, "btnupjoz_click", null));}
float _a = 0f;
float _val = 0f;
RDebugUtils.currentLine=94175232;
 //BA.debugLineNum = 94175232;BA.debugLine="Sub BtnUpJoz_Click";
RDebugUtils.currentLine=94175233;
 //BA.debugLineNum = 94175233;BA.debugLine="Dim A As Float = 0";
_a = (float) (0);
RDebugUtils.currentLine=94175234;
 //BA.debugLineNum = 94175234;BA.debugLine="Dim Val As Float = 0";
_val = (float) (0);
RDebugUtils.currentLine=94175235;
 //BA.debugLineNum = 94175235;BA.debugLine="Select Case MCode.isFloat";
switch (BA.switchObjectToInt(_mcode._isfloat /*boolean*/ ,__c.True,__c.False)) {
case 0: {
RDebugUtils.currentLine=94175237;
 //BA.debugLineNum = 94175237;BA.debugLine="Val = 0.25";
_val = (float) (0.25);
 break; }
case 1: {
RDebugUtils.currentLine=94175239;
 //BA.debugLineNum = 94175239;BA.debugLine="Val = 1";
_val = (float) (1);
 break; }
}
;
RDebugUtils.currentLine=94175241;
 //BA.debugLineNum = 94175241;BA.debugLine="If	Item.TedadDarSabadJoz=Null Then";
if (__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadJoz /*String*/ == null) { 
RDebugUtils.currentLine=94175242;
 //BA.debugLineNum = 94175242;BA.debugLine="Item.TedadDarSabadJoz=0";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadJoz /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=94175243;
 //BA.debugLineNum = 94175243;BA.debugLine="LblTedadJoz.Text=0";
__ref._lbltedadjoz /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(0));
 };
RDebugUtils.currentLine=94175246;
 //BA.debugLineNum = 94175246;BA.debugLine="A = Item.TedadDarSabadJoz";
_a = (float)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadJoz /*String*/ ));
RDebugUtils.currentLine=94175247;
 //BA.debugLineNum = 94175247;BA.debugLine="If MCode.ForooshBishAzMojoodi = \"1\" Then";
if ((_mcode._forooshbishazmojoodi /*String*/ ).equals("1")) { 
RDebugUtils.currentLine=94175248;
 //BA.debugLineNum = 94175248;BA.debugLine="A = A + Val";
_a = (float) (_a+_val);
RDebugUtils.currentLine=94175249;
 //BA.debugLineNum = 94175249;BA.debugLine="Item.SumMande = Item.SumMande - Val";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/  = BA.NumberToString((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/ ))-_val);
 }else 
{RDebugUtils.currentLine=94175250;
 //BA.debugLineNum = 94175250;BA.debugLine="Else if MCode.ForooshBishAzMojoodi = \"0\" Then";
if ((_mcode._forooshbishazmojoodi /*String*/ ).equals("0")) { 
RDebugUtils.currentLine=94175251;
 //BA.debugLineNum = 94175251;BA.debugLine="If MCode.Action=\"SabtMarjooii\" Then";
if ((_mcode._action /*String*/ ).equals("SabtMarjooii")) { 
RDebugUtils.currentLine=94175252;
 //BA.debugLineNum = 94175252;BA.debugLine="A = A + Val";
_a = (float) (_a+_val);
RDebugUtils.currentLine=94175253;
 //BA.debugLineNum = 94175253;BA.debugLine="Item.SumMande = Item.SumMande - Val";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/  = BA.NumberToString((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/ ))-_val);
 }else {
RDebugUtils.currentLine=94175255;
 //BA.debugLineNum = 94175255;BA.debugLine="If Item.SumMande > 0 Then";
if ((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/ ))>0) { 
RDebugUtils.currentLine=94175256;
 //BA.debugLineNum = 94175256;BA.debugLine="A = A + Val";
_a = (float) (_a+_val);
RDebugUtils.currentLine=94175257;
 //BA.debugLineNum = 94175257;BA.debugLine="Item.SumMande = Item.SumMande - Val";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/  = BA.NumberToString((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/ ))-_val);
 }else {
RDebugUtils.currentLine=94175259;
 //BA.debugLineNum = 94175259;BA.debugLine="ToastMessageShow(\"سفارش شما بیشتر از موجودی می";
__c.ToastMessageShow(BA.ObjectToCharSequence("سفارش شما بیشتر از موجودی می باشد"),__c.True);
 };
 };
 }}
;
RDebugUtils.currentLine=94175263;
 //BA.debugLineNum = 94175263;BA.debugLine="Item.TedadDarSabadJoz = A";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadJoz /*String*/  = BA.NumberToString(_a);
RDebugUtils.currentLine=94175270;
 //BA.debugLineNum = 94175270;BA.debugLine="AddToSabad";
__ref._addtosabad /*String*/ (null);
RDebugUtils.currentLine=94175271;
 //BA.debugLineNum = 94175271;BA.debugLine="End Sub";
return "";
}
public String  _btnupkol_click(ir.parsikhesab.pakhsh.cls_kalapaging __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_kalapaging";
if (Debug.shouldDelegate(ba, "btnupkol_click", false))
	 {return ((String) Debug.delegate(ba, "btnupkol_click", null));}
int _a = 0;
RDebugUtils.currentLine=94306304;
 //BA.debugLineNum = 94306304;BA.debugLine="Sub BtnUpKol_Click";
RDebugUtils.currentLine=94306305;
 //BA.debugLineNum = 94306305;BA.debugLine="If Item.TedadDarKarton=0 Then";
if ((__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarKarton /*String*/ ).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=94306306;
 //BA.debugLineNum = 94306306;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=94306308;
 //BA.debugLineNum = 94306308;BA.debugLine="Dim A As Int = 0";
_a = (int) (0);
RDebugUtils.currentLine=94306309;
 //BA.debugLineNum = 94306309;BA.debugLine="A = Item.TedadDarSabadKol";
_a = (int)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadKol /*String*/ ));
RDebugUtils.currentLine=94306310;
 //BA.debugLineNum = 94306310;BA.debugLine="If MCode.ForooshBishAzMojoodi = \"1\" Then";
if ((_mcode._forooshbishazmojoodi /*String*/ ).equals("1")) { 
RDebugUtils.currentLine=94306311;
 //BA.debugLineNum = 94306311;BA.debugLine="A = A + 1";
_a = (int) (_a+1);
RDebugUtils.currentLine=94306312;
 //BA.debugLineNum = 94306312;BA.debugLine="Item.SumMandeKarton = Item.SumMandeKarton - A";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMandeKarton /*String*/  = BA.NumberToString((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMandeKarton /*String*/ ))-_a);
 }else 
{RDebugUtils.currentLine=94306313;
 //BA.debugLineNum = 94306313;BA.debugLine="Else if MCode.ForooshBishAzMojoodi = \"0\" Then";
if ((_mcode._forooshbishazmojoodi /*String*/ ).equals("0")) { 
RDebugUtils.currentLine=94306314;
 //BA.debugLineNum = 94306314;BA.debugLine="If MCode.Action=\"SabtMarjooii\" Then";
if ((_mcode._action /*String*/ ).equals("SabtMarjooii")) { 
RDebugUtils.currentLine=94306315;
 //BA.debugLineNum = 94306315;BA.debugLine="A = A + 1";
_a = (int) (_a+1);
RDebugUtils.currentLine=94306316;
 //BA.debugLineNum = 94306316;BA.debugLine="Item.SumMandeKarton = Item.SumMandeKarton - Ite";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMandeKarton /*String*/  = BA.NumberToString((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMandeKarton /*String*/ ))-(double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadKol /*String*/ )));
 }else {
RDebugUtils.currentLine=94306318;
 //BA.debugLineNum = 94306318;BA.debugLine="If Item.SumMandeKarton >= Item.TedadDarSabadKol";
if ((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMandeKarton /*String*/ ))>=(double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadKol /*String*/ ))) { 
RDebugUtils.currentLine=94306319;
 //BA.debugLineNum = 94306319;BA.debugLine="A = A + 1";
_a = (int) (_a+1);
RDebugUtils.currentLine=94306320;
 //BA.debugLineNum = 94306320;BA.debugLine="Item.SumMandeKarton = Item.SumMandeKarton - It";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMandeKarton /*String*/  = BA.NumberToString((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMandeKarton /*String*/ ))-(double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadKol /*String*/ )));
 }else {
RDebugUtils.currentLine=94306322;
 //BA.debugLineNum = 94306322;BA.debugLine="ToastMessageShow(\"سفارش شما بیشتر از موجودی می";
__c.ToastMessageShow(BA.ObjectToCharSequence("سفارش شما بیشتر از موجودی می باشد"),__c.True);
 };
 };
 }}
;
RDebugUtils.currentLine=94306327;
 //BA.debugLineNum = 94306327;BA.debugLine="Item.TedadDarSabadKol = A";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadKol /*String*/  = BA.NumberToString(_a);
RDebugUtils.currentLine=94306328;
 //BA.debugLineNum = 94306328;BA.debugLine="AddToSabad";
__ref._addtosabad /*String*/ (null);
RDebugUtils.currentLine=94306329;
 //BA.debugLineNum = 94306329;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(ir.parsikhesab.pakhsh.cls_kalapaging __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_kalapaging";
RDebugUtils.currentLine=93454336;
 //BA.debugLineNum = 93454336;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=93454337;
 //BA.debugLineNum = 93454337;BA.debugLine="Private p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=93454338;
 //BA.debugLineNum = 93454338;BA.debugLine="Private pnl_bk As Panel";
_pnl_bk = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=93454339;
 //BA.debugLineNum = 93454339;BA.debugLine="Private Key As IME";
_key = new anywheresoftware.b4a.objects.IME();
RDebugUtils.currentLine=93454340;
 //BA.debugLineNum = 93454340;BA.debugLine="Private Item  As AdapterListKala";
_item = new ir.parsikhesab.pakhsh.mcode._adapterlistkala();
RDebugUtils.currentLine=93454342;
 //BA.debugLineNum = 93454342;BA.debugLine="Private pnl_bk As Panel";
_pnl_bk = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=93454343;
 //BA.debugLineNum = 93454343;BA.debugLine="Private lbl_title As Label";
_lbl_title = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=93454344;
 //BA.debugLineNum = 93454344;BA.debugLine="Private LblFee As Label";
_lblfee = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=93454345;
 //BA.debugLineNum = 93454345;BA.debugLine="Private Panel1 As Panel";
_panel1 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=93454346;
 //BA.debugLineNum = 93454346;BA.debugLine="Private BtnUpJoz As Label";
_btnupjoz = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=93454347;
 //BA.debugLineNum = 93454347;BA.debugLine="Private BtnDownJoz As Label";
_btndownjoz = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=93454348;
 //BA.debugLineNum = 93454348;BA.debugLine="Private LblTedadJoz As Label";
_lbltedadjoz = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=93454349;
 //BA.debugLineNum = 93454349;BA.debugLine="Private Panel2 As Panel";
_panel2 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=93454350;
 //BA.debugLineNum = 93454350;BA.debugLine="Private BtnUpKol As Label";
_btnupkol = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=93454351;
 //BA.debugLineNum = 93454351;BA.debugLine="Private BtnDownKol As Label";
_btndownkol = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=93454352;
 //BA.debugLineNum = 93454352;BA.debugLine="Private LblTedadkol As Label";
_lbltedadkol = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=93454353;
 //BA.debugLineNum = 93454353;BA.debugLine="Private Panel3 As Panel";
_panel3 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=93454356;
 //BA.debugLineNum = 93454356;BA.debugLine="Private Label4 As Label";
_label4 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=93454357;
 //BA.debugLineNum = 93454357;BA.debugLine="Private LblFeeBadAzTakhfid As Label";
_lblfeebadaztakhfid = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=93454358;
 //BA.debugLineNum = 93454358;BA.debugLine="Private LblTedadKarton As Label";
_lbltedadkarton = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=93454359;
 //BA.debugLineNum = 93454359;BA.debugLine="Private LblMojoodiJoz As Label";
_lblmojoodijoz = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=93454360;
 //BA.debugLineNum = 93454360;BA.debugLine="Private LblMojoodiKol As Label";
_lblmojoodikol = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=93454361;
 //BA.debugLineNum = 93454361;BA.debugLine="Private LblC_Kala As Label";
_lblc_kala = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=93454363;
 //BA.debugLineNum = 93454363;BA.debugLine="Private options As B4XListTemplate";
_options = new ir.parsikhesab.pakhsh.b4xlisttemplate();
RDebugUtils.currentLine=93454364;
 //BA.debugLineNum = 93454364;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new ir.parsikhesab.pakhsh.b4xdialog();
RDebugUtils.currentLine=93454365;
 //BA.debugLineNum = 93454365;BA.debugLine="Private XUI As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=93454366;
 //BA.debugLineNum = 93454366;BA.debugLine="Private base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=93454368;
 //BA.debugLineNum = 93454368;BA.debugLine="Private lbl_changePrice As Label";
_lbl_changeprice = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=93454369;
 //BA.debugLineNum = 93454369;BA.debugLine="Private btn_edit_Price As Label";
_btn_edit_price = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=93454370;
 //BA.debugLineNum = 93454370;BA.debugLine="Private LblTedadEshan As Label";
_lbltedadeshan = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=93454371;
 //BA.debugLineNum = 93454371;BA.debugLine="Private BtnDownEshan As Label";
_btndowneshan = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=93454372;
 //BA.debugLineNum = 93454372;BA.debugLine="Private BtnUpEshan As Label";
_btnupeshan = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=93454373;
 //BA.debugLineNum = 93454373;BA.debugLine="Private ImageRow As ImageView";
_imagerow = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=93454374;
 //BA.debugLineNum = 93454374;BA.debugLine="Private ImageOff As ImageView";
_imageoff = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=93454377;
 //BA.debugLineNum = 93454377;BA.debugLine="Private lblVahedKol As Label";
_lblvahedkol = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=93454378;
 //BA.debugLineNum = 93454378;BA.debugLine="Private lblVahedJoz As Label";
_lblvahedjoz = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=93454379;
 //BA.debugLineNum = 93454379;BA.debugLine="Private LblGift As Label";
_lblgift = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=93454380;
 //BA.debugLineNum = 93454380;BA.debugLine="Private LblTozihat As Label";
_lbltozihat = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=93454381;
 //BA.debugLineNum = 93454381;BA.debugLine="Private Lbl_Bascket As Label";
_lbl_bascket = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=93454382;
 //BA.debugLineNum = 93454382;BA.debugLine="Private LblBasketCount As Label";
_lblbasketcount = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=93454383;
 //BA.debugLineNum = 93454383;BA.debugLine="Dim maxkolRond As Long";
_maxkolrond = 0L;
RDebugUtils.currentLine=93454384;
 //BA.debugLineNum = 93454384;BA.debugLine="Private LblCountEshantion As Label";
_lblcounteshantion = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=93454385;
 //BA.debugLineNum = 93454385;BA.debugLine="Private LblMablaghMasrafkonande As Label";
_lblmablaghmasrafkonande = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=93454386;
 //BA.debugLineNum = 93454386;BA.debugLine="End Sub";
return "";
}
public String  _imagerow_click(ir.parsikhesab.pakhsh.cls_kalapaging __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_kalapaging";
if (Debug.shouldDelegate(ba, "imagerow_click", false))
	 {return ((String) Debug.delegate(ba, "imagerow_click", null));}
RDebugUtils.currentLine=94633984;
 //BA.debugLineNum = 94633984;BA.debugLine="Private Sub ImageRow_Click";
RDebugUtils.currentLine=94633985;
 //BA.debugLineNum = 94633985;BA.debugLine="Act_ImageSlideShow.Item = Item";
_act_imageslideshow._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/  = __ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ ;
RDebugUtils.currentLine=94633986;
 //BA.debugLineNum = 94633986;BA.debugLine="StartActivity(Act_ImageSlideShow)";
__c.StartActivity(ba,(Object)(_act_imageslideshow.getObject()));
RDebugUtils.currentLine=94633988;
 //BA.debugLineNum = 94633988;BA.debugLine="End Sub";
return "";
}
public void  _lbl_changeprice_click(ir.parsikhesab.pakhsh.cls_kalapaging __ref) throws Exception{
RDebugUtils.currentModule="cls_kalapaging";
if (Debug.shouldDelegate(ba, "lbl_changeprice_click", false))
	 {Debug.delegate(ba, "lbl_changeprice_click", null); return;}
ResumableSub_lbl_changePrice_Click rsub = new ResumableSub_lbl_changePrice_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_lbl_changePrice_Click extends BA.ResumableSub {
public ResumableSub_lbl_changePrice_Click(ir.parsikhesab.pakhsh.cls_kalapaging parent,ir.parsikhesab.pakhsh.cls_kalapaging __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
ir.parsikhesab.pakhsh.cls_kalapaging __ref;
ir.parsikhesab.pakhsh.cls_kalapaging parent;
ir.parsikhesab.pakhsh.b4xtimedtemplate _timedtemplate = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cls_kalapaging";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=94699521;
 //BA.debugLineNum = 94699521;BA.debugLine="Dialog.Title = \"انتخاب تیپ قیمت\"";
__ref._dialog /*ir.parsikhesab.pakhsh.b4xdialog*/ ._title /*Object*/  = (Object)("انتخاب تیپ قیمت");
RDebugUtils.currentLine=94699522;
 //BA.debugLineNum = 94699522;BA.debugLine="If options.Options.Size<1 Then";
if (true) break;

case 1:
//if
this.state = 4;
if (__ref._options /*ir.parsikhesab.pakhsh.b4xlisttemplate*/ ._options /*anywheresoftware.b4a.objects.collections.List*/ .getSize()<1) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=94699523;
 //BA.debugLineNum = 94699523;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=94699525;
 //BA.debugLineNum = 94699525;BA.debugLine="Dim TimedTemplate As B4XTimedTemplate";
_timedtemplate = new ir.parsikhesab.pakhsh.b4xtimedtemplate();
RDebugUtils.currentLine=94699526;
 //BA.debugLineNum = 94699526;BA.debugLine="TimedTemplate.Initialize(options)";
_timedtemplate._initialize /*String*/ (null,ba,(Object)(__ref._options /*ir.parsikhesab.pakhsh.b4xlisttemplate*/ ));
RDebugUtils.currentLine=94699527;
 //BA.debugLineNum = 94699527;BA.debugLine="TimedTemplate.TimeoutMilliseconds = 10000 'close";
_timedtemplate._timeoutmilliseconds /*int*/  = (int) (10000);
RDebugUtils.currentLine=94699528;
 //BA.debugLineNum = 94699528;BA.debugLine="Wait For (Dialog.ShowTemplate(TimedTemplate, \"OK\"";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cls_kalapaging", "lbl_changeprice_click"), __ref._dialog /*ir.parsikhesab.pakhsh.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_timedtemplate),(Object)("OK"),(Object)(""),(Object)("CANCEL")));
this.state = 9;
return;
case 9:
//C
this.state = 5;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=94699529;
 //BA.debugLineNum = 94699529;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
if (true) break;

case 5:
//if
this.state = 8;
if (_result==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 if (true) break;

case 8:
//C
this.state = -1;
;
RDebugUtils.currentLine=94699534;
 //BA.debugLineNum = 94699534;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _lblgift_click(ir.parsikhesab.pakhsh.cls_kalapaging __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_kalapaging";
if (Debug.shouldDelegate(ba, "lblgift_click", false))
	 {return ((String) Debug.delegate(ba, "lblgift_click", null));}
RDebugUtils.currentLine=93978624;
 //BA.debugLineNum = 93978624;BA.debugLine="Sub LblGift_Click";
RDebugUtils.currentLine=93978625;
 //BA.debugLineNum = 93978625;BA.debugLine="Try";
try { } 
       catch (Exception e3) {
			ba.setLastException(e3);RDebugUtils.currentLine=93978651;
 //BA.debugLineNum = 93978651;BA.debugLine="Log(LastException)";
__c.LogImpl("593978651",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=93978654;
 //BA.debugLineNum = 93978654;BA.debugLine="End Sub";
return "";
}
public String  _lbltedadjoz_click(ir.parsikhesab.pakhsh.cls_kalapaging __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_kalapaging";
if (Debug.shouldDelegate(ba, "lbltedadjoz_click", false))
	 {return ((String) Debug.delegate(ba, "lbltedadjoz_click", null));}
RDebugUtils.currentLine=94765056;
 //BA.debugLineNum = 94765056;BA.debugLine="Sub LblTedadJoz_Click";
RDebugUtils.currentLine=94765057;
 //BA.debugLineNum = 94765057;BA.debugLine="CallSubDelayed2(base,\"LblTedadJoz_Click\",Item)";
__c.CallSubDelayed2(ba,(Object)(__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),"LblTedadJoz_Click",(Object)(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ ));
RDebugUtils.currentLine=94765058;
 //BA.debugLineNum = 94765058;BA.debugLine="End Sub";
return "";
}
public String  _lbltedadkol_click(ir.parsikhesab.pakhsh.cls_kalapaging __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_kalapaging";
if (Debug.shouldDelegate(ba, "lbltedadkol_click", false))
	 {return ((String) Debug.delegate(ba, "lbltedadkol_click", null));}
RDebugUtils.currentLine=94830592;
 //BA.debugLineNum = 94830592;BA.debugLine="Sub LblTedadKol_Click";
RDebugUtils.currentLine=94830593;
 //BA.debugLineNum = 94830593;BA.debugLine="CallSubDelayed2(base,\"LblTedadKol_Click\",Item)";
__c.CallSubDelayed2(ba,(Object)(__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),"LblTedadKol_Click",(Object)(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ ));
RDebugUtils.currentLine=94830594;
 //BA.debugLineNum = 94830594;BA.debugLine="End Sub";
return "";
}
public String  _lbltozihat_click(ir.parsikhesab.pakhsh.cls_kalapaging __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_kalapaging";
if (Debug.shouldDelegate(ba, "lbltozihat_click", false))
	 {return ((String) Debug.delegate(ba, "lbltozihat_click", null));}
RDebugUtils.currentLine=94044160;
 //BA.debugLineNum = 94044160;BA.debugLine="Private Sub LblTozihat_Click";
RDebugUtils.currentLine=94044164;
 //BA.debugLineNum = 94044164;BA.debugLine="End Sub";
return "";
}
public String  _panel3_click(ir.parsikhesab.pakhsh.cls_kalapaging __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_kalapaging";
if (Debug.shouldDelegate(ba, "panel3_click", false))
	 {return ((String) Debug.delegate(ba, "panel3_click", null));}
RDebugUtils.currentLine=95092736;
 //BA.debugLineNum = 95092736;BA.debugLine="Sub Panel3_Click";
RDebugUtils.currentLine=95092737;
 //BA.debugLineNum = 95092737;BA.debugLine="If LblBasketCount.Visible Then";
if (__ref._lblbasketcount /*anywheresoftware.b4a.objects.LabelWrapper*/ .getVisible()) { 
RDebugUtils.currentLine=95092738;
 //BA.debugLineNum = 95092738;BA.debugLine="CallSubDelayed(Act_KalaPaging,\"Panel3_Click\")";
__c.CallSubDelayed(ba,(Object)(_act_kalapaging.getObject()),"Panel3_Click");
 }else {
RDebugUtils.currentLine=95092740;
 //BA.debugLineNum = 95092740;BA.debugLine="ToastMessageShow(\"سبد خرید خالی است\",False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("سبد خرید خالی است"),__c.False);
 };
RDebugUtils.currentLine=95092742;
 //BA.debugLineNum = 95092742;BA.debugLine="End Sub";
return "";
}
public String  _status(ir.parsikhesab.pakhsh.cls_kalapaging __ref,boolean _enable) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_kalapaging";
if (Debug.shouldDelegate(ba, "status", false))
	 {return ((String) Debug.delegate(ba, "status", new Object[] {_enable}));}
RDebugUtils.currentLine=93847552;
 //BA.debugLineNum = 93847552;BA.debugLine="Sub Status(Enable As Boolean)";
RDebugUtils.currentLine=93847553;
 //BA.debugLineNum = 93847553;BA.debugLine="LogColor(\"status: \"&Enable,Colors.Red)";
__c.LogImpl("593847553","status: "+BA.ObjectToString(_enable),__c.Colors.Red);
RDebugUtils.currentLine=93847554;
 //BA.debugLineNum = 93847554;BA.debugLine="BtnDownEshan.Enabled=Enable";
__ref._btndowneshan /*anywheresoftware.b4a.objects.LabelWrapper*/ .setEnabled(_enable);
RDebugUtils.currentLine=93847555;
 //BA.debugLineNum = 93847555;BA.debugLine="BtnUpEshan.Enabled=Enable";
__ref._btnupeshan /*anywheresoftware.b4a.objects.LabelWrapper*/ .setEnabled(_enable);
RDebugUtils.currentLine=93847556;
 //BA.debugLineNum = 93847556;BA.debugLine="LblTedadEshan.Enabled=Enable";
__ref._lbltedadeshan /*anywheresoftware.b4a.objects.LabelWrapper*/ .setEnabled(_enable);
RDebugUtils.currentLine=93847558;
 //BA.debugLineNum = 93847558;BA.debugLine="BtnDownJoz.Enabled=Enable";
__ref._btndownjoz /*anywheresoftware.b4a.objects.LabelWrapper*/ .setEnabled(_enable);
RDebugUtils.currentLine=93847559;
 //BA.debugLineNum = 93847559;BA.debugLine="BtnUpJoz.Enabled=Enable";
__ref._btnupjoz /*anywheresoftware.b4a.objects.LabelWrapper*/ .setEnabled(_enable);
RDebugUtils.currentLine=93847560;
 //BA.debugLineNum = 93847560;BA.debugLine="LblTedadJoz.Enabled=Enable";
__ref._lbltedadjoz /*anywheresoftware.b4a.objects.LabelWrapper*/ .setEnabled(_enable);
RDebugUtils.currentLine=93847562;
 //BA.debugLineNum = 93847562;BA.debugLine="BtnDownKol.Enabled=Enable";
__ref._btndownkol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setEnabled(_enable);
RDebugUtils.currentLine=93847563;
 //BA.debugLineNum = 93847563;BA.debugLine="BtnUpKol.Enabled=Enable";
__ref._btnupkol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setEnabled(_enable);
RDebugUtils.currentLine=93847564;
 //BA.debugLineNum = 93847564;BA.debugLine="LblTedadkol.Enabled=Enable";
__ref._lbltedadkol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setEnabled(_enable);
RDebugUtils.currentLine=93847565;
 //BA.debugLineNum = 93847565;BA.debugLine="End Sub";
return "";
}
}