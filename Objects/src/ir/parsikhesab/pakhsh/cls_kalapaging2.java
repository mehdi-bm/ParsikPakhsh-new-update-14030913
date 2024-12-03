package ir.parsikhesab.pakhsh;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class cls_kalapaging2 extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "ir.parsikhesab.pakhsh.cls_kalapaging2");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", ir.parsikhesab.pakhsh.cls_kalapaging2.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.LabelWrapper _lbl_sum = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblfeebadaztakhfid = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltedadkarton = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblmojoodi = null;
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
public anywheresoftware.b4a.objects.LabelWrapper _label1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblmojoodikol = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblmojoodijoz = null;
public long _maxkolrond = 0L;
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
public String  _show(ir.parsikhesab.pakhsh.cls_kalapaging2 __ref,ir.parsikhesab.pakhsh.mcode._adapterlistkala _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_kalapaging2";
if (Debug.shouldDelegate(ba, "show", false))
	 {return ((String) Debug.delegate(ba, "show", new Object[] {_data}));}
RDebugUtils.currentLine=95551488;
 //BA.debugLineNum = 95551488;BA.debugLine="Sub show(data As AdapterListKala)";
RDebugUtils.currentLine=95551489;
 //BA.debugLineNum = 95551489;BA.debugLine="Item=data";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/  = _data;
RDebugUtils.currentLine=95551490;
 //BA.debugLineNum = 95551490;BA.debugLine="CallSubDelayed(base,\"RefreshLblSabad\")";
__c.CallSubDelayed(ba,(Object)(__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),"RefreshLblSabad");
RDebugUtils.currentLine=95551491;
 //BA.debugLineNum = 95551491;BA.debugLine="Try";
try {RDebugUtils.currentLine=95551492;
 //BA.debugLineNum = 95551492;BA.debugLine="lbl_title.Text = Item.NameKala";
__ref._lbl_title /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .NameKala /*String*/ ));
RDebugUtils.currentLine=95551493;
 //BA.debugLineNum = 95551493;BA.debugLine="LblC_Kala.Text = \"کد کالا: \" & Item.CodeKala";
__ref._lblc_kala /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("کد کالا: "+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .CodeKala /*String*/ ));
RDebugUtils.currentLine=95551494;
 //BA.debugLineNum = 95551494;BA.debugLine="LblGift.Visible=MCode.CheckEshantion(Item.CodeKa";
__ref._lblgift /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(_mcode._checkeshantion /*boolean*/ (ba,__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .CodeKala /*String*/ ));
RDebugUtils.currentLine=95551496;
 //BA.debugLineNum = 95551496;BA.debugLine="If IsNumber(Item.FldFeeBadAzTakhfif) = True Then";
if (__c.IsNumber(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldFeeBadAzTakhfif /*String*/ )==__c.True) { 
RDebugUtils.currentLine=95551497;
 //BA.debugLineNum = 95551497;BA.debugLine="If Item.FldFeeBadAzTakhfif > 0 Then";
if ((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldFeeBadAzTakhfif /*String*/ ))>0) { 
RDebugUtils.currentLine=95551498;
 //BA.debugLineNum = 95551498;BA.debugLine="MCode.Rs.Initialize(NumberFormat(Item.FeeForoo";
_mcode._rs /*anywheresoftware.b4a.agraham.richstring.RichStringBuilder.RichString*/ .Initialize(BA.ObjectToCharSequence(__c.NumberFormat(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FeeForoosh /*int*/ ,(int) (1),(int) (3))+" "+_mcode._vahedpool /*String*/ ));
RDebugUtils.currentLine=95551499;
 //BA.debugLineNum = 95551499;BA.debugLine="MCode.Rs.Strikethrough (0, MCode.Rs.Length)";
_mcode._rs /*anywheresoftware.b4a.agraham.richstring.RichStringBuilder.RichString*/ .Strikethrough((int) (0),_mcode._rs /*anywheresoftware.b4a.agraham.richstring.RichStringBuilder.RichString*/ .getLength());
RDebugUtils.currentLine=95551500;
 //BA.debugLineNum = 95551500;BA.debugLine="MCode.Rs.Color(Colors.Red,0, MCode.Rs.Length)";
_mcode._rs /*anywheresoftware.b4a.agraham.richstring.RichStringBuilder.RichString*/ .Color(__c.Colors.Red,(int) (0),_mcode._rs /*anywheresoftware.b4a.agraham.richstring.RichStringBuilder.RichString*/ .getLength());
RDebugUtils.currentLine=95551501;
 //BA.debugLineNum = 95551501;BA.debugLine="LblFee.Text = MCode.Rs";
__ref._lblfee /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_mcode._rs /*anywheresoftware.b4a.agraham.richstring.RichStringBuilder.RichString*/ .getObject()));
RDebugUtils.currentLine=95551502;
 //BA.debugLineNum = 95551502;BA.debugLine="LblFeeBadAzTakhfid.Text = NumberFormat(Item.Fl";
__ref._lblfeebadaztakhfid /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__c.NumberFormat((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldFeeBadAzTakhfif /*String*/ )),(int) (1),(int) (3))+" "+_mcode._vahedpool /*String*/ ));
RDebugUtils.currentLine=95551503;
 //BA.debugLineNum = 95551503;BA.debugLine="ImageOff.Visible=True";
__ref._imageoff /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .setVisible(__c.True);
 }else {
RDebugUtils.currentLine=95551505;
 //BA.debugLineNum = 95551505;BA.debugLine="LblFee.Text = NumberFormat(Item.FeeForoosh,1,3";
__ref._lblfee /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__c.NumberFormat(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FeeForoosh /*int*/ ,(int) (1),(int) (3))+" "+_mcode._vahedpool /*String*/ ));
RDebugUtils.currentLine=95551506;
 //BA.debugLineNum = 95551506;BA.debugLine="LblFeeBadAzTakhfid.Text = \"\"";
__ref._lblfeebadaztakhfid /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=95551507;
 //BA.debugLineNum = 95551507;BA.debugLine="ImageOff.Visible=False";
__ref._imageoff /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .setVisible(__c.False);
 };
 }else {
RDebugUtils.currentLine=95551510;
 //BA.debugLineNum = 95551510;BA.debugLine="LblFee.Text = NumberFormat(Item.FeeForoosh,1,3)";
__ref._lblfee /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__c.NumberFormat(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FeeForoosh /*int*/ ,(int) (1),(int) (3))+" "+_mcode._vahedpool /*String*/ ));
RDebugUtils.currentLine=95551511;
 //BA.debugLineNum = 95551511;BA.debugLine="LblFeeBadAzTakhfid.Text = \"\"";
__ref._lblfeebadaztakhfid /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(""));
 };
RDebugUtils.currentLine=95551513;
 //BA.debugLineNum = 95551513;BA.debugLine="If Item.TedadDarKarton<>0 And IsNumber(Item.Teda";
if ((__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarKarton /*String*/ ).equals(BA.NumberToString(0)) == false && __c.IsNumber(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarKarton /*String*/ )==__c.True) { 
RDebugUtils.currentLine=95551514;
 //BA.debugLineNum = 95551514;BA.debugLine="maxkolRond=(Item.SumMande/Item.TedadDarKarton)";
__ref._maxkolrond /*long*/  = (long) (((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/ ))/(double)(double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarKarton /*String*/ ))));
RDebugUtils.currentLine=95551515;
 //BA.debugLineNum = 95551515;BA.debugLine="LblTedadKarton.Text=\"تعداد در کارتن: \"& Item.Te";
__ref._lbltedadkarton /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("تعداد در کارتن: "+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarKarton /*String*/ ));
RDebugUtils.currentLine=95551516;
 //BA.debugLineNum = 95551516;BA.debugLine="Log(maxkolRond)";
__c.LogImpl("595551516",BA.NumberToString(__ref._maxkolrond /*long*/ ),0);
 }else {
RDebugUtils.currentLine=95551518;
 //BA.debugLineNum = 95551518;BA.debugLine="maxkolRond=0";
__ref._maxkolrond /*long*/  = (long) (0);
RDebugUtils.currentLine=95551519;
 //BA.debugLineNum = 95551519;BA.debugLine="LblTedadKarton.Text=\"تعداد در کارتن:\"&maxkolRon";
__ref._lbltedadkarton /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("تعداد در کارتن:"+BA.NumberToString(__ref._maxkolrond /*long*/ )));
RDebugUtils.currentLine=95551520;
 //BA.debugLineNum = 95551520;BA.debugLine="LblMojoodiKol.Text =\"موجودی کل: -\"";
__ref._lblmojoodikol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("موجودی کل: -"));
 };
RDebugUtils.currentLine=95551522;
 //BA.debugLineNum = 95551522;BA.debugLine="Log(maxkolRond)";
__c.LogImpl("595551522",BA.NumberToString(__ref._maxkolrond /*long*/ ),0);
RDebugUtils.currentLine=95551523;
 //BA.debugLineNum = 95551523;BA.debugLine="LblMojoodiJoz.Text =\"موجودی جزء: \"& Item.SumMand";
__ref._lblmojoodijoz /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("موجودی جزء: "+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/ +" "+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .NameVahed /*String*/ ));
RDebugUtils.currentLine=95551525;
 //BA.debugLineNum = 95551525;BA.debugLine="If  Item.SumMandeKarton <> Null Then";
if (__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMandeKarton /*String*/ != null) { 
RDebugUtils.currentLine=95551526;
 //BA.debugLineNum = 95551526;BA.debugLine="LblMojoodiKol.Text =\"موجودی کل: \"& maxkolRond &";
__ref._lblmojoodikol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("موجودی کل: "+BA.NumberToString(__ref._maxkolrond /*long*/ )+" "+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .NameVahed2 /*String*/ ));
 }else {
RDebugUtils.currentLine=95551528;
 //BA.debugLineNum = 95551528;BA.debugLine="LblMojoodiKol.Text =\"موجودی کل: -\"";
__ref._lblmojoodikol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("موجودی کل: -"));
 };
RDebugUtils.currentLine=95551531;
 //BA.debugLineNum = 95551531;BA.debugLine="If MCode.HideMojodi=1 Then";
if ((_mcode._hidemojodi /*String*/ ).equals(BA.NumberToString(1))) { 
RDebugUtils.currentLine=95551532;
 //BA.debugLineNum = 95551532;BA.debugLine="LblMojoodiJoz.Visible=False";
__ref._lblmojoodijoz /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=95551533;
 //BA.debugLineNum = 95551533;BA.debugLine="LblMojoodiKol.Visible=False";
__ref._lblmojoodikol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
 }else {
RDebugUtils.currentLine=95551535;
 //BA.debugLineNum = 95551535;BA.debugLine="LblMojoodiJoz.Visible=True";
__ref._lblmojoodijoz /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=95551536;
 //BA.debugLineNum = 95551536;BA.debugLine="LblMojoodiKol.Visible=True";
__ref._lblmojoodikol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.True);
 };
RDebugUtils.currentLine=95551538;
 //BA.debugLineNum = 95551538;BA.debugLine="Try";
try {RDebugUtils.currentLine=95551539;
 //BA.debugLineNum = 95551539;BA.debugLine="myCode.DownloadImage5(Item.CodeKala,Item.fldPat";
_mycode._downloadimage5 /*String*/ (ba,__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .CodeKala /*String*/ ,__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldPathPic /*String*/ ,__ref._imagerow /*anywheresoftware.b4a.objects.ImageViewWrapper*/ );
 } 
       catch (Exception e50) {
			ba.setLastException(e50);RDebugUtils.currentLine=95551559;
 //BA.debugLineNum = 95551559;BA.debugLine="Log(LastException)";
__c.LogImpl("595551559",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=95551561;
 //BA.debugLineNum = 95551561;BA.debugLine="LblGift.Visible=MCode.CheckEshantion(Item.CodeKa";
__ref._lblgift /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(_mcode._checkeshantion /*boolean*/ (ba,__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .CodeKala /*String*/ ));
 } 
       catch (Exception e54) {
			ba.setLastException(e54);RDebugUtils.currentLine=95551677;
 //BA.debugLineNum = 95551677;BA.debugLine="Log(LastException)";
__c.LogImpl("595551677",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=95551684;
 //BA.debugLineNum = 95551684;BA.debugLine="End Sub";
return "";
}
public int  _getwidth(ir.parsikhesab.pakhsh.cls_kalapaging2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_kalapaging2";
if (Debug.shouldDelegate(ba, "getwidth", false))
	 {return ((Integer) Debug.delegate(ba, "getwidth", null));}
RDebugUtils.currentLine=95485952;
 //BA.debugLineNum = 95485952;BA.debugLine="Public Sub getWidth As Int";
RDebugUtils.currentLine=95485953;
 //BA.debugLineNum = 95485953;BA.debugLine="Return pnl_bk.Width";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth();
RDebugUtils.currentLine=95485954;
 //BA.debugLineNum = 95485954;BA.debugLine="End Sub";
return 0;
}
public int  _getheight(ir.parsikhesab.pakhsh.cls_kalapaging2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_kalapaging2";
if (Debug.shouldDelegate(ba, "getheight", false))
	 {return ((Integer) Debug.delegate(ba, "getheight", null));}
RDebugUtils.currentLine=95420416;
 //BA.debugLineNum = 95420416;BA.debugLine="Public Sub getHeight As Int";
RDebugUtils.currentLine=95420417;
 //BA.debugLineNum = 95420417;BA.debugLine="Return pnl_bk.Height";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight();
RDebugUtils.currentLine=95420418;
 //BA.debugLineNum = 95420418;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(ir.parsikhesab.pakhsh.cls_kalapaging2 __ref,anywheresoftware.b4a.BA _ba,Object _mdl) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cls_kalapaging2";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_mdl}));}
RDebugUtils.currentLine=95289344;
 //BA.debugLineNum = 95289344;BA.debugLine="Public Sub Initialize(mdl As Object)";
RDebugUtils.currentLine=95289345;
 //BA.debugLineNum = 95289345;BA.debugLine="base = mdl";
__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_mdl));
RDebugUtils.currentLine=95289346;
 //BA.debugLineNum = 95289346;BA.debugLine="Key.Initialize(\"Key\")";
__ref._key /*anywheresoftware.b4a.objects.IME*/ .Initialize("Key");
RDebugUtils.currentLine=95289347;
 //BA.debugLineNum = 95289347;BA.debugLine="p.Initialize(\"\")";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=95289348;
 //BA.debugLineNum = 95289348;BA.debugLine="p.SetLayout(0,0,100%x,100%y)";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .SetLayout((int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
RDebugUtils.currentLine=95289350;
 //BA.debugLineNum = 95289350;BA.debugLine="p.LoadLayout(\"L_PageKala_Search\")";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .LoadLayout("L_PageKala_Search",ba);
RDebugUtils.currentLine=95289352;
 //BA.debugLineNum = 95289352;BA.debugLine="Dialog.Initialize (base)";
__ref._dialog /*ir.parsikhesab.pakhsh.b4xdialog*/ ._initialize /*String*/ (null,ba,__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=95289353;
 //BA.debugLineNum = 95289353;BA.debugLine="options.Initialize";
__ref._options /*ir.parsikhesab.pakhsh.b4xlisttemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=95289354;
 //BA.debugLineNum = 95289354;BA.debugLine="options.AllowMultiSelection = False";
__ref._options /*ir.parsikhesab.pakhsh.b4xlisttemplate*/ ._allowmultiselection /*boolean*/  = __c.False;
RDebugUtils.currentLine=95289355;
 //BA.debugLineNum = 95289355;BA.debugLine="options.MultiSelectionMinimum = 1";
__ref._options /*ir.parsikhesab.pakhsh.b4xlisttemplate*/ ._multiselectionminimum /*int*/  = (int) (1);
RDebugUtils.currentLine=95289357;
 //BA.debugLineNum = 95289357;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _getpanel(ir.parsikhesab.pakhsh.cls_kalapaging2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_kalapaging2";
if (Debug.shouldDelegate(ba, "getpanel", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "getpanel", null));}
RDebugUtils.currentLine=95354880;
 //BA.debugLineNum = 95354880;BA.debugLine="Public Sub getPanel As Panel";
RDebugUtils.currentLine=95354881;
 //BA.debugLineNum = 95354881;BA.debugLine="pnl_bk.RemoveView";
__ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .RemoveView();
RDebugUtils.currentLine=95354882;
 //BA.debugLineNum = 95354882;BA.debugLine="Return pnl_bk";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ ;
RDebugUtils.currentLine=95354883;
 //BA.debugLineNum = 95354883;BA.debugLine="End Sub";
return null;
}
public String  _add_item(ir.parsikhesab.pakhsh.cls_kalapaging2 __ref,String _s) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_kalapaging2";
if (Debug.shouldDelegate(ba, "add_item", false))
	 {return ((String) Debug.delegate(ba, "add_item", new Object[] {_s}));}
RDebugUtils.currentLine=95682560;
 //BA.debugLineNum = 95682560;BA.debugLine="Private Sub Add_Item(s As String)";
RDebugUtils.currentLine=95682562;
 //BA.debugLineNum = 95682562;BA.debugLine="If s=Null Then";
if (_s== null) { 
RDebugUtils.currentLine=95682563;
 //BA.debugLineNum = 95682563;BA.debugLine="Log(\"Null\")";
__c.LogImpl("595682563","Null",0);
 }else 
{RDebugUtils.currentLine=95682564;
 //BA.debugLineNum = 95682564;BA.debugLine="Else If s.Trim=\"\" Then";
if ((_s.trim()).equals("")) { 
RDebugUtils.currentLine=95682565;
 //BA.debugLineNum = 95682565;BA.debugLine="Log(\"empty\")";
__c.LogImpl("595682565","empty",0);
 }else 
{RDebugUtils.currentLine=95682566;
 //BA.debugLineNum = 95682566;BA.debugLine="Else If s.Trim=\"0\" Then";
if ((_s.trim()).equals("0")) { 
RDebugUtils.currentLine=95682567;
 //BA.debugLineNum = 95682567;BA.debugLine="Log(\"zeroo\")";
__c.LogImpl("595682567","zeroo",0);
 }else {
RDebugUtils.currentLine=95682569;
 //BA.debugLineNum = 95682569;BA.debugLine="options.Options.Add(s)";
__ref._options /*ir.parsikhesab.pakhsh.b4xlisttemplate*/ ._options /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_s));
 }}}
;
RDebugUtils.currentLine=95682571;
 //BA.debugLineNum = 95682571;BA.debugLine="End Sub";
return "";
}
public String  _addtosabad(ir.parsikhesab.pakhsh.cls_kalapaging2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_kalapaging2";
if (Debug.shouldDelegate(ba, "addtosabad", false))
	 {return ((String) Debug.delegate(ba, "addtosabad", null));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
boolean _check = false;
int _i = 0;
RDebugUtils.currentLine=96141312;
 //BA.debugLineNum = 96141312;BA.debugLine="Private Sub AddToSabad";
RDebugUtils.currentLine=96141313;
 //BA.debugLineNum = 96141313;BA.debugLine="LblMojoodi.Text = \"موجودی: \" & Item.SumMande";
__ref._lblmojoodi /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("موجودی: "+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/ ));
RDebugUtils.currentLine=96141314;
 //BA.debugLineNum = 96141314;BA.debugLine="If Item.SumMande < 0 Then";
if ((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/ ))<0) { 
RDebugUtils.currentLine=96141315;
 //BA.debugLineNum = 96141315;BA.debugLine="LblMojoodi.TextColor=Colors.Red";
__ref._lblmojoodi /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(__c.Colors.Red);
 }else {
RDebugUtils.currentLine=96141317;
 //BA.debugLineNum = 96141317;BA.debugLine="LblMojoodi.TextColor=Colors.Black";
__ref._lblmojoodi /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(__c.Colors.Black);
 };
RDebugUtils.currentLine=96141320;
 //BA.debugLineNum = 96141320;BA.debugLine="LblTedadJoz.Text = Item.TedadDarSabadJoz";
__ref._lbltedadjoz /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadJoz /*String*/ ));
RDebugUtils.currentLine=96141321;
 //BA.debugLineNum = 96141321;BA.debugLine="lblVahedJoz.Text = \"تعداد به \"& Item.NameVahed";
__ref._lblvahedjoz /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("تعداد به "+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .NameVahed /*String*/ ));
RDebugUtils.currentLine=96141322;
 //BA.debugLineNum = 96141322;BA.debugLine="LblTedadkol.Text = Item.TedadDarSabadKol";
__ref._lbltedadkol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadKol /*String*/ ));
RDebugUtils.currentLine=96141323;
 //BA.debugLineNum = 96141323;BA.debugLine="lblVahedKol.Text = \"تعداد به \"& Item.NameVahed2";
__ref._lblvahedkol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("تعداد به "+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .NameVahed2 /*String*/ ));
RDebugUtils.currentLine=96141325;
 //BA.debugLineNum = 96141325;BA.debugLine="lbl_sum.Text=NumberFormat2((Item.TedadDarSabadJoz";
__ref._lbl_sum /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__c.NumberFormat2(((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadJoz /*String*/ ))+((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadKol /*String*/ ))*(double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarKarton /*String*/ ))))*__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FeeForoosh /*int*/ ,(int) (0),(int) (0),(int) (0),__c.True)));
RDebugUtils.currentLine=96141327;
 //BA.debugLineNum = 96141327;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From Tb";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = _mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (ba,"Select * From TblSabad");
RDebugUtils.currentLine=96141328;
 //BA.debugLineNum = 96141328;BA.debugLine="Dim Check As Boolean";
_check = false;
RDebugUtils.currentLine=96141329;
 //BA.debugLineNum = 96141329;BA.debugLine="For i=0 To Cu.RowCount -1";
{
final int step14 = 1;
final int limit14 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit14 ;_i = _i + step14 ) {
RDebugUtils.currentLine=96141330;
 //BA.debugLineNum = 96141330;BA.debugLine="Cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=96141331;
 //BA.debugLineNum = 96141331;BA.debugLine="If Cu.GetString(\"FldC_Kala\") = Item.CodeKala The";
if ((_cu.GetString("FldC_Kala")).equals(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .CodeKala /*String*/ )) { 
RDebugUtils.currentLine=96141332;
 //BA.debugLineNum = 96141332;BA.debugLine="If Item.TedadDarSabadJoz = 0 And Item.TedadDarS";
if ((__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadJoz /*String*/ ).equals(BA.NumberToString(0)) && (__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadJoz /*String*/ ).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=96141333;
 //BA.debugLineNum = 96141333;BA.debugLine="MCode.SaveUpdate(\"Delete From TblSabad Where F";
_mcode._saveupdate /*String*/ (ba,"Delete From TblSabad Where FldC_Kala = '"+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .CodeKala /*String*/ +"'");
 }else {
RDebugUtils.currentLine=96141335;
 //BA.debugLineNum = 96141335;BA.debugLine="MCode.SaveUpdate(\"Update TblSabad Set FldTedad";
_mcode._saveupdate /*String*/ (ba,"Update TblSabad Set FldTedadJoz = '"+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadJoz /*String*/ +"',FldTedadKol = '"+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadKol /*String*/ +"'  Where FldC_kala = '"+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .CodeKala /*String*/ +"'");
 };
RDebugUtils.currentLine=96141338;
 //BA.debugLineNum = 96141338;BA.debugLine="Check = True";
_check = __c.True;
RDebugUtils.currentLine=96141339;
 //BA.debugLineNum = 96141339;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=96141342;
 //BA.debugLineNum = 96141342;BA.debugLine="If Check = False Then";
if (_check==__c.False) { 
 };
RDebugUtils.currentLine=96141345;
 //BA.debugLineNum = 96141345;BA.debugLine="CallSubDelayed(base,\"RefreshLblSabad\")";
__c.CallSubDelayed(ba,(Object)(__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),"RefreshLblSabad");
RDebugUtils.currentLine=96141346;
 //BA.debugLineNum = 96141346;BA.debugLine="End Sub";
return "";
}
public String  _btn_back_click(ir.parsikhesab.pakhsh.cls_kalapaging2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_kalapaging2";
if (Debug.shouldDelegate(ba, "btn_back_click", false))
	 {return ((String) Debug.delegate(ba, "btn_back_click", null));}
RDebugUtils.currentLine=96206848;
 //BA.debugLineNum = 96206848;BA.debugLine="Private Sub btn_back_Click";
RDebugUtils.currentLine=96206851;
 //BA.debugLineNum = 96206851;BA.debugLine="End Sub";
return "";
}
public String  _btn_close_click(ir.parsikhesab.pakhsh.cls_kalapaging2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_kalapaging2";
if (Debug.shouldDelegate(ba, "btn_close_click", false))
	 {return ((String) Debug.delegate(ba, "btn_close_click", null));}
RDebugUtils.currentLine=96272384;
 //BA.debugLineNum = 96272384;BA.debugLine="Private Sub btn_close_Click";
RDebugUtils.currentLine=96272385;
 //BA.debugLineNum = 96272385;BA.debugLine="btn_back_Click";
__ref._btn_back_click /*String*/ (null);
RDebugUtils.currentLine=96272386;
 //BA.debugLineNum = 96272386;BA.debugLine="End Sub";
return "";
}
public void  _btn_edit_price_click(ir.parsikhesab.pakhsh.cls_kalapaging2 __ref) throws Exception{
RDebugUtils.currentModule="cls_kalapaging2";
if (Debug.shouldDelegate(ba, "btn_edit_price_click", false))
	 {Debug.delegate(ba, "btn_edit_price_click", null); return;}
ResumableSub_btn_edit_Price_Click rsub = new ResumableSub_btn_edit_Price_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btn_edit_Price_Click extends BA.ResumableSub {
public ResumableSub_btn_edit_Price_Click(ir.parsikhesab.pakhsh.cls_kalapaging2 parent,ir.parsikhesab.pakhsh.cls_kalapaging2 __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
ir.parsikhesab.pakhsh.cls_kalapaging2 __ref;
ir.parsikhesab.pakhsh.cls_kalapaging2 parent;
ir.parsikhesab.pakhsh.b4xinputtemplate _input = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rs = null;
int _result = 0;
float _res = 0f;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cls_kalapaging2";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=96600065;
 //BA.debugLineNum = 96600065;BA.debugLine="Dim input As B4XInputTemplate";
_input = new ir.parsikhesab.pakhsh.b4xinputtemplate();
RDebugUtils.currentLine=96600066;
 //BA.debugLineNum = 96600066;BA.debugLine="input.Initialize";
_input._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=96600067;
 //BA.debugLineNum = 96600067;BA.debugLine="input.lblTitle.Text = \"قیمت جدید:\"";
_input._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("قیمت جدید:"));
RDebugUtils.currentLine=96600068;
 //BA.debugLineNum = 96600068;BA.debugLine="input.ConfigureForNumbers(True, True)";
_input._configurefornumbers /*String*/ (null,parent.__c.True,parent.__c.True);
RDebugUtils.currentLine=96600069;
 //BA.debugLineNum = 96600069;BA.debugLine="Dim rs As ResumableSub = Dialog.ShowTemplate(inpu";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = __ref._dialog /*ir.parsikhesab.pakhsh.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_input),(Object)("OK"),(Object)(""),(Object)("CANCEL"));
RDebugUtils.currentLine=96600070;
 //BA.debugLineNum = 96600070;BA.debugLine="Dialog.Base.Top = 50%y - Dialog.Base.Height / 2";
__ref._dialog /*ir.parsikhesab.pakhsh.b4xdialog*/ ._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTop((int) (parent.__c.PerYToCurrent((float) (50),ba)-__ref._dialog /*ir.parsikhesab.pakhsh.b4xdialog*/ ._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2));
RDebugUtils.currentLine=96600071;
 //BA.debugLineNum = 96600071;BA.debugLine="Wait For (rs) Complete (Result As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cls_kalapaging2", "btn_edit_price_click"), _rs);
this.state = 11;
return;
case 11:
//C
this.state = 1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=96600072;
 //BA.debugLineNum = 96600072;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 10;
if (_result==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=96600073;
 //BA.debugLineNum = 96600073;BA.debugLine="If input.Text=\"\" Then input.Text=0";
if (true) break;

case 4:
//if
this.state = 9;
if ((_input._text /*String*/ ).equals("")) { 
this.state = 6;
;}if (true) break;

case 6:
//C
this.state = 9;
_input._text /*String*/  = BA.NumberToString(0);
if (true) break;

case 9:
//C
this.state = 10;
;
RDebugUtils.currentLine=96600074;
 //BA.debugLineNum = 96600074;BA.debugLine="Dim res As Float = input.Text 'no need to check";
_res = (float)(Double.parseDouble(_input._text /*String*/ ));
RDebugUtils.currentLine=96600075;
 //BA.debugLineNum = 96600075;BA.debugLine="Item.FeeForoosh=res";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FeeForoosh /*int*/  = (int) (_res);
RDebugUtils.currentLine=96600076;
 //BA.debugLineNum = 96600076;BA.debugLine="MCode.SaveUpdate(\"Update TblKala Set FldFee='\"&r";
parent._mcode._saveupdate /*String*/ (ba,"Update TblKala Set FldFee='"+BA.NumberToString(_res)+"' where FldC_Kala = '"+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .CodeKala /*String*/ +"'");
RDebugUtils.currentLine=96600077;
 //BA.debugLineNum = 96600077;BA.debugLine="LblFee.Text = NumberFormat(Item.FeeForoosh,1,3)";
__ref._lblfee /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(parent.__c.NumberFormat(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FeeForoosh /*int*/ ,(int) (1),(int) (3))+" "+parent._mcode._vahedpool /*String*/ ));
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=96600079;
 //BA.debugLineNum = 96600079;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _btndowneshan_click(ir.parsikhesab.pakhsh.cls_kalapaging2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_kalapaging2";
if (Debug.shouldDelegate(ba, "btndowneshan_click", false))
	 {return ((String) Debug.delegate(ba, "btndowneshan_click", null));}
RDebugUtils.currentLine=96731136;
 //BA.debugLineNum = 96731136;BA.debugLine="Private Sub BtnDownEshan_Click";
RDebugUtils.currentLine=96731146;
 //BA.debugLineNum = 96731146;BA.debugLine="End Sub";
return "";
}
public String  _btndownjoz_click(ir.parsikhesab.pakhsh.cls_kalapaging2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_kalapaging2";
if (Debug.shouldDelegate(ba, "btndownjoz_click", false))
	 {return ((String) Debug.delegate(ba, "btndownjoz_click", null));}
float _a = 0f;
float _val = 0f;
RDebugUtils.currentLine=95944704;
 //BA.debugLineNum = 95944704;BA.debugLine="Private Sub BtnDownJoz_Click";
RDebugUtils.currentLine=95944705;
 //BA.debugLineNum = 95944705;BA.debugLine="Dim A As Float = 0";
_a = (float) (0);
RDebugUtils.currentLine=95944706;
 //BA.debugLineNum = 95944706;BA.debugLine="Dim Val As Float = 0";
_val = (float) (0);
RDebugUtils.currentLine=95944707;
 //BA.debugLineNum = 95944707;BA.debugLine="Select Case MCode.isFloat";
switch (BA.switchObjectToInt(_mcode._isfloat /*boolean*/ ,__c.True,__c.False)) {
case 0: {
RDebugUtils.currentLine=95944709;
 //BA.debugLineNum = 95944709;BA.debugLine="Val = 0.25";
_val = (float) (0.25);
 break; }
case 1: {
RDebugUtils.currentLine=95944711;
 //BA.debugLineNum = 95944711;BA.debugLine="Val = 1";
_val = (float) (1);
 break; }
}
;
RDebugUtils.currentLine=95944714;
 //BA.debugLineNum = 95944714;BA.debugLine="A = Item.TedadDarSabadJoz";
_a = (float)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadJoz /*String*/ ));
RDebugUtils.currentLine=95944715;
 //BA.debugLineNum = 95944715;BA.debugLine="If A > 0 Then";
if (_a>0) { 
RDebugUtils.currentLine=95944716;
 //BA.debugLineNum = 95944716;BA.debugLine="A = A - Val";
_a = (float) (_a-_val);
RDebugUtils.currentLine=95944717;
 //BA.debugLineNum = 95944717;BA.debugLine="Item.SumMande = Item.SumMande + Val";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/  = BA.NumberToString((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/ ))+_val);
RDebugUtils.currentLine=95944718;
 //BA.debugLineNum = 95944718;BA.debugLine="Item.TedadDarSabadJoz = A";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadJoz /*String*/  = BA.NumberToString(_a);
 };
RDebugUtils.currentLine=95944721;
 //BA.debugLineNum = 95944721;BA.debugLine="AddToSabad";
__ref._addtosabad /*String*/ (null);
RDebugUtils.currentLine=95944722;
 //BA.debugLineNum = 95944722;BA.debugLine="End Sub";
return "";
}
public String  _btndownkol_click(ir.parsikhesab.pakhsh.cls_kalapaging2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_kalapaging2";
if (Debug.shouldDelegate(ba, "btndownkol_click", false))
	 {return ((String) Debug.delegate(ba, "btndownkol_click", null));}
int _a = 0;
RDebugUtils.currentLine=96075776;
 //BA.debugLineNum = 96075776;BA.debugLine="Private Sub BtnDownKol_Click";
RDebugUtils.currentLine=96075777;
 //BA.debugLineNum = 96075777;BA.debugLine="Dim A As Int = 0";
_a = (int) (0);
RDebugUtils.currentLine=96075779;
 //BA.debugLineNum = 96075779;BA.debugLine="A = Item.TedadDarSabadKol";
_a = (int)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadKol /*String*/ ));
RDebugUtils.currentLine=96075780;
 //BA.debugLineNum = 96075780;BA.debugLine="If A > 0 Then";
if (_a>0) { 
RDebugUtils.currentLine=96075781;
 //BA.debugLineNum = 96075781;BA.debugLine="A = A - 1";
_a = (int) (_a-1);
RDebugUtils.currentLine=96075782;
 //BA.debugLineNum = 96075782;BA.debugLine="Item.SumMande = Item.SumMande + Item.TedadDarKar";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/  = BA.NumberToString((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/ ))+(double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarKarton /*String*/ )));
RDebugUtils.currentLine=96075783;
 //BA.debugLineNum = 96075783;BA.debugLine="Item.TedadDarSabadKol = A";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadKol /*String*/  = BA.NumberToString(_a);
 };
RDebugUtils.currentLine=96075785;
 //BA.debugLineNum = 96075785;BA.debugLine="AddToSabad";
__ref._addtosabad /*String*/ (null);
RDebugUtils.currentLine=96075786;
 //BA.debugLineNum = 96075786;BA.debugLine="End Sub";
return "";
}
public String  _btnupeshan_click(ir.parsikhesab.pakhsh.cls_kalapaging2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_kalapaging2";
if (Debug.shouldDelegate(ba, "btnupeshan_click", false))
	 {return ((String) Debug.delegate(ba, "btnupeshan_click", null));}
int _a = 0;
int _b = 0;
RDebugUtils.currentLine=96665600;
 //BA.debugLineNum = 96665600;BA.debugLine="Private Sub BtnUpEshan_Click";
RDebugUtils.currentLine=96665601;
 //BA.debugLineNum = 96665601;BA.debugLine="Dim A As Int = 0";
_a = (int) (0);
RDebugUtils.currentLine=96665602;
 //BA.debugLineNum = 96665602;BA.debugLine="Dim B As Int";
_b = 0;
RDebugUtils.currentLine=96665628;
 //BA.debugLineNum = 96665628;BA.debugLine="End Sub";
return "";
}
public String  _btnupjoz_click(ir.parsikhesab.pakhsh.cls_kalapaging2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_kalapaging2";
if (Debug.shouldDelegate(ba, "btnupjoz_click", false))
	 {return ((String) Debug.delegate(ba, "btnupjoz_click", null));}
float _a = 0f;
float _val = 0f;
RDebugUtils.currentLine=95879168;
 //BA.debugLineNum = 95879168;BA.debugLine="Private Sub BtnUpJoz_Click";
RDebugUtils.currentLine=95879169;
 //BA.debugLineNum = 95879169;BA.debugLine="Dim A As Float = 0";
_a = (float) (0);
RDebugUtils.currentLine=95879170;
 //BA.debugLineNum = 95879170;BA.debugLine="Dim Val As Float = 0";
_val = (float) (0);
RDebugUtils.currentLine=95879171;
 //BA.debugLineNum = 95879171;BA.debugLine="Select Case MCode.isFloat";
switch (BA.switchObjectToInt(_mcode._isfloat /*boolean*/ ,__c.True,__c.False)) {
case 0: {
RDebugUtils.currentLine=95879173;
 //BA.debugLineNum = 95879173;BA.debugLine="Val = 0.25";
_val = (float) (0.25);
 break; }
case 1: {
RDebugUtils.currentLine=95879175;
 //BA.debugLineNum = 95879175;BA.debugLine="Val = 1";
_val = (float) (1);
 break; }
}
;
RDebugUtils.currentLine=95879178;
 //BA.debugLineNum = 95879178;BA.debugLine="A = Item.TedadDarSabadJoz";
_a = (float)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadJoz /*String*/ ));
RDebugUtils.currentLine=95879192;
 //BA.debugLineNum = 95879192;BA.debugLine="AddToSabad";
__ref._addtosabad /*String*/ (null);
RDebugUtils.currentLine=95879193;
 //BA.debugLineNum = 95879193;BA.debugLine="End Sub";
return "";
}
public String  _btnupkol_click(ir.parsikhesab.pakhsh.cls_kalapaging2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_kalapaging2";
if (Debug.shouldDelegate(ba, "btnupkol_click", false))
	 {return ((String) Debug.delegate(ba, "btnupkol_click", null));}
RDebugUtils.currentLine=96010240;
 //BA.debugLineNum = 96010240;BA.debugLine="Private Sub BtnUpKol_Click";
RDebugUtils.currentLine=96010266;
 //BA.debugLineNum = 96010266;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(ir.parsikhesab.pakhsh.cls_kalapaging2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_kalapaging2";
RDebugUtils.currentLine=95223808;
 //BA.debugLineNum = 95223808;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=95223809;
 //BA.debugLineNum = 95223809;BA.debugLine="Private p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=95223810;
 //BA.debugLineNum = 95223810;BA.debugLine="Private pnl_bk As Panel";
_pnl_bk = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=95223811;
 //BA.debugLineNum = 95223811;BA.debugLine="Private Key As IME";
_key = new anywheresoftware.b4a.objects.IME();
RDebugUtils.currentLine=95223812;
 //BA.debugLineNum = 95223812;BA.debugLine="Private Item  As AdapterListKala";
_item = new ir.parsikhesab.pakhsh.mcode._adapterlistkala();
RDebugUtils.currentLine=95223814;
 //BA.debugLineNum = 95223814;BA.debugLine="Private pnl_bk As Panel";
_pnl_bk = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=95223815;
 //BA.debugLineNum = 95223815;BA.debugLine="Private lbl_title As Label";
_lbl_title = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=95223816;
 //BA.debugLineNum = 95223816;BA.debugLine="Private LblFee As Label";
_lblfee = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=95223817;
 //BA.debugLineNum = 95223817;BA.debugLine="Private Panel1 As Panel";
_panel1 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=95223818;
 //BA.debugLineNum = 95223818;BA.debugLine="Private BtnUpJoz As Label";
_btnupjoz = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=95223819;
 //BA.debugLineNum = 95223819;BA.debugLine="Private BtnDownJoz As Label";
_btndownjoz = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=95223820;
 //BA.debugLineNum = 95223820;BA.debugLine="Private LblTedadJoz As Label";
_lbltedadjoz = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=95223821;
 //BA.debugLineNum = 95223821;BA.debugLine="Private Panel2 As Panel";
_panel2 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=95223822;
 //BA.debugLineNum = 95223822;BA.debugLine="Private BtnUpKol As Label";
_btnupkol = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=95223823;
 //BA.debugLineNum = 95223823;BA.debugLine="Private BtnDownKol As Label";
_btndownkol = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=95223824;
 //BA.debugLineNum = 95223824;BA.debugLine="Private LblTedadkol As Label";
_lbltedadkol = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=95223825;
 //BA.debugLineNum = 95223825;BA.debugLine="Private Panel3 As Panel";
_panel3 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=95223827;
 //BA.debugLineNum = 95223827;BA.debugLine="Private lbl_sum As Label";
_lbl_sum = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=95223829;
 //BA.debugLineNum = 95223829;BA.debugLine="Private LblFeeBadAzTakhfid As Label";
_lblfeebadaztakhfid = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=95223830;
 //BA.debugLineNum = 95223830;BA.debugLine="Private LblTedadKarton As Label";
_lbltedadkarton = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=95223831;
 //BA.debugLineNum = 95223831;BA.debugLine="Private LblMojoodi As Label";
_lblmojoodi = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=95223832;
 //BA.debugLineNum = 95223832;BA.debugLine="Private LblC_Kala As Label";
_lblc_kala = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=95223834;
 //BA.debugLineNum = 95223834;BA.debugLine="Private options As B4XListTemplate";
_options = new ir.parsikhesab.pakhsh.b4xlisttemplate();
RDebugUtils.currentLine=95223835;
 //BA.debugLineNum = 95223835;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new ir.parsikhesab.pakhsh.b4xdialog();
RDebugUtils.currentLine=95223836;
 //BA.debugLineNum = 95223836;BA.debugLine="Private XUI As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=95223837;
 //BA.debugLineNum = 95223837;BA.debugLine="Private base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=95223839;
 //BA.debugLineNum = 95223839;BA.debugLine="Private lbl_changePrice As Label";
_lbl_changeprice = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=95223840;
 //BA.debugLineNum = 95223840;BA.debugLine="Private btn_edit_Price As Label";
_btn_edit_price = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=95223841;
 //BA.debugLineNum = 95223841;BA.debugLine="Private LblTedadEshan As Label";
_lbltedadeshan = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=95223842;
 //BA.debugLineNum = 95223842;BA.debugLine="Private BtnDownEshan As Label";
_btndowneshan = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=95223843;
 //BA.debugLineNum = 95223843;BA.debugLine="Private BtnUpEshan As Label";
_btnupeshan = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=95223844;
 //BA.debugLineNum = 95223844;BA.debugLine="Private ImageRow As ImageView";
_imagerow = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=95223845;
 //BA.debugLineNum = 95223845;BA.debugLine="Private ImageOff As ImageView";
_imageoff = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=95223848;
 //BA.debugLineNum = 95223848;BA.debugLine="Private lblVahedKol As Label";
_lblvahedkol = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=95223849;
 //BA.debugLineNum = 95223849;BA.debugLine="Private lblVahedJoz As Label";
_lblvahedjoz = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=95223850;
 //BA.debugLineNum = 95223850;BA.debugLine="Private LblGift As Label";
_lblgift = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=95223851;
 //BA.debugLineNum = 95223851;BA.debugLine="Private LblTozihat As Label";
_lbltozihat = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=95223852;
 //BA.debugLineNum = 95223852;BA.debugLine="Private Label1 As Label";
_label1 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=95223853;
 //BA.debugLineNum = 95223853;BA.debugLine="Private LblMojoodiKol As Label";
_lblmojoodikol = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=95223854;
 //BA.debugLineNum = 95223854;BA.debugLine="Private LblMojoodiJoz As Label";
_lblmojoodijoz = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=95223855;
 //BA.debugLineNum = 95223855;BA.debugLine="Dim maxkolRond As Long";
_maxkolrond = 0L;
RDebugUtils.currentLine=95223856;
 //BA.debugLineNum = 95223856;BA.debugLine="End Sub";
return "";
}
public String  _imagerow_click(ir.parsikhesab.pakhsh.cls_kalapaging2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_kalapaging2";
if (Debug.shouldDelegate(ba, "imagerow_click", false))
	 {return ((String) Debug.delegate(ba, "imagerow_click", null));}
RDebugUtils.currentLine=96337920;
 //BA.debugLineNum = 96337920;BA.debugLine="Private Sub ImageRow_Click";
RDebugUtils.currentLine=96337921;
 //BA.debugLineNum = 96337921;BA.debugLine="Act_ImageSlideShow.Item = Item";
_act_imageslideshow._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/  = __ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ ;
RDebugUtils.currentLine=96337922;
 //BA.debugLineNum = 96337922;BA.debugLine="StartActivity(Act_ImageSlideShow)";
__c.StartActivity(ba,(Object)(_act_imageslideshow.getObject()));
RDebugUtils.currentLine=96337924;
 //BA.debugLineNum = 96337924;BA.debugLine="End Sub";
return "";
}
public String  _lbl_changeprice_click(ir.parsikhesab.pakhsh.cls_kalapaging2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_kalapaging2";
if (Debug.shouldDelegate(ba, "lbl_changeprice_click", false))
	 {return ((String) Debug.delegate(ba, "lbl_changeprice_click", null));}
RDebugUtils.currentLine=96403456;
 //BA.debugLineNum = 96403456;BA.debugLine="Private Sub lbl_changePrice_Click";
RDebugUtils.currentLine=96403470;
 //BA.debugLineNum = 96403470;BA.debugLine="End Sub";
return "";
}
public String  _lblgift_click(ir.parsikhesab.pakhsh.cls_kalapaging2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_kalapaging2";
if (Debug.shouldDelegate(ba, "lblgift_click", false))
	 {return ((String) Debug.delegate(ba, "lblgift_click", null));}
RDebugUtils.currentLine=95748096;
 //BA.debugLineNum = 95748096;BA.debugLine="Sub LblGift_Click";
RDebugUtils.currentLine=95748126;
 //BA.debugLineNum = 95748126;BA.debugLine="End Sub";
return "";
}
public String  _lbltedadjoz_click(ir.parsikhesab.pakhsh.cls_kalapaging2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_kalapaging2";
if (Debug.shouldDelegate(ba, "lbltedadjoz_click", false))
	 {return ((String) Debug.delegate(ba, "lbltedadjoz_click", null));}
RDebugUtils.currentLine=96468992;
 //BA.debugLineNum = 96468992;BA.debugLine="Private Sub LblTedadJoz_Click";
RDebugUtils.currentLine=96469015;
 //BA.debugLineNum = 96469015;BA.debugLine="End Sub";
return "";
}
public String  _lbltedadkol_click(ir.parsikhesab.pakhsh.cls_kalapaging2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_kalapaging2";
if (Debug.shouldDelegate(ba, "lbltedadkol_click", false))
	 {return ((String) Debug.delegate(ba, "lbltedadkol_click", null));}
RDebugUtils.currentLine=96534528;
 //BA.debugLineNum = 96534528;BA.debugLine="Private Sub LblTedadkol_Click";
RDebugUtils.currentLine=96534545;
 //BA.debugLineNum = 96534545;BA.debugLine="End Sub";
return "";
}
public String  _lbltozihat_click(ir.parsikhesab.pakhsh.cls_kalapaging2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_kalapaging2";
if (Debug.shouldDelegate(ba, "lbltozihat_click", false))
	 {return ((String) Debug.delegate(ba, "lbltozihat_click", null));}
RDebugUtils.currentLine=95813632;
 //BA.debugLineNum = 95813632;BA.debugLine="Private Sub LblTozihat_Click";
RDebugUtils.currentLine=95813636;
 //BA.debugLineNum = 95813636;BA.debugLine="End Sub";
return "";
}
public String  _status(ir.parsikhesab.pakhsh.cls_kalapaging2 __ref,boolean _enable) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_kalapaging2";
if (Debug.shouldDelegate(ba, "status", false))
	 {return ((String) Debug.delegate(ba, "status", new Object[] {_enable}));}
RDebugUtils.currentLine=95617024;
 //BA.debugLineNum = 95617024;BA.debugLine="Sub Status(Enable As Boolean)";
RDebugUtils.currentLine=95617025;
 //BA.debugLineNum = 95617025;BA.debugLine="LogColor(\"status: \"&Enable,Colors.Red)";
__c.LogImpl("595617025","status: "+BA.ObjectToString(_enable),__c.Colors.Red);
RDebugUtils.currentLine=95617026;
 //BA.debugLineNum = 95617026;BA.debugLine="BtnDownEshan.Enabled=Enable";
__ref._btndowneshan /*anywheresoftware.b4a.objects.LabelWrapper*/ .setEnabled(_enable);
RDebugUtils.currentLine=95617027;
 //BA.debugLineNum = 95617027;BA.debugLine="BtnUpEshan.Enabled=Enable";
__ref._btnupeshan /*anywheresoftware.b4a.objects.LabelWrapper*/ .setEnabled(_enable);
RDebugUtils.currentLine=95617028;
 //BA.debugLineNum = 95617028;BA.debugLine="LblTedadEshan.Enabled=Enable";
__ref._lbltedadeshan /*anywheresoftware.b4a.objects.LabelWrapper*/ .setEnabled(_enable);
RDebugUtils.currentLine=95617030;
 //BA.debugLineNum = 95617030;BA.debugLine="BtnDownJoz.Enabled=Enable";
__ref._btndownjoz /*anywheresoftware.b4a.objects.LabelWrapper*/ .setEnabled(_enable);
RDebugUtils.currentLine=95617031;
 //BA.debugLineNum = 95617031;BA.debugLine="BtnUpJoz.Enabled=Enable";
__ref._btnupjoz /*anywheresoftware.b4a.objects.LabelWrapper*/ .setEnabled(_enable);
RDebugUtils.currentLine=95617032;
 //BA.debugLineNum = 95617032;BA.debugLine="LblTedadJoz.Enabled=Enable";
__ref._lbltedadjoz /*anywheresoftware.b4a.objects.LabelWrapper*/ .setEnabled(_enable);
RDebugUtils.currentLine=95617034;
 //BA.debugLineNum = 95617034;BA.debugLine="BtnDownKol.Enabled=Enable";
__ref._btndownkol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setEnabled(_enable);
RDebugUtils.currentLine=95617035;
 //BA.debugLineNum = 95617035;BA.debugLine="BtnUpKol.Enabled=Enable";
__ref._btnupkol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setEnabled(_enable);
RDebugUtils.currentLine=95617036;
 //BA.debugLineNum = 95617036;BA.debugLine="LblTedadkol.Enabled=Enable";
__ref._lbltedadkol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setEnabled(_enable);
RDebugUtils.currentLine=95617037;
 //BA.debugLineNum = 95617037;BA.debugLine="End Sub";
return "";
}
}