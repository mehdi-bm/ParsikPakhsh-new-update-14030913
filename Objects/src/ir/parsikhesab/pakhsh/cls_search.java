package ir.parsikhesab.pakhsh;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class cls_search extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "ir.parsikhesab.pakhsh.cls_search");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", ir.parsikhesab.pakhsh.cls_search.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.ImageViewWrapper _imagerow = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageoff = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblgift = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_title = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imagecall = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblfee = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblfeebadaztakhfid = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblc_kala = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltozihat = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblmojoodijoz = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblmojoodikol = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltedadkarton = null;
public anywheresoftware.b4a.objects.LabelWrapper _btnupjoz = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltedadjoz = null;
public anywheresoftware.b4a.objects.LabelWrapper _btndownjoz = null;
public anywheresoftware.b4a.objects.LabelWrapper _btndownkol = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltedadkol = null;
public anywheresoftware.b4a.objects.LabelWrapper _btnupkol = null;
public ir.parsikhesab.pakhsh.mcode._adapterlistkala _item = null;
public anywheresoftware.b4a.objects.IME _key = null;
public Object _base = null;
public anywheresoftware.b4a.objects.LabelWrapper _btndowneshan = null;
public anywheresoftware.b4a.objects.LabelWrapper _btnupeshan = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltedadeshan = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblvahedjoz = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblvahedkol = null;
public long _maxkolrond = 0L;
public com.glide.Hitex_Glide _glide = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel4 = null;
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
public String  _show(ir.parsikhesab.pakhsh.cls_search __ref,ir.parsikhesab.pakhsh.mcode._adapterlistkala _item1,int _position) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_search";
if (Debug.shouldDelegate(ba, "show", false))
	 {return ((String) Debug.delegate(ba, "show", new Object[] {_item1,_position}));}
anywheresoftware.b4a.objects.ImageViewWrapper _imagerow1 = null;
RDebugUtils.currentLine=108855296;
 //BA.debugLineNum = 108855296;BA.debugLine="Public Sub Show(Item1 As AdapterListKala,position";
RDebugUtils.currentLine=108855297;
 //BA.debugLineNum = 108855297;BA.debugLine="Item=Item1";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/  = _item1;
RDebugUtils.currentLine=108855298;
 //BA.debugLineNum = 108855298;BA.debugLine="Private ImageRow1 As ImageView";
_imagerow1 = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=108855299;
 //BA.debugLineNum = 108855299;BA.debugLine="ImageRow1.Initialize(\"\")";
_imagerow1.Initialize(ba,"");
RDebugUtils.currentLine=108855300;
 //BA.debugLineNum = 108855300;BA.debugLine="ImageRow1.Tag=position";
_imagerow1.setTag((Object)(_position));
RDebugUtils.currentLine=108855303;
 //BA.debugLineNum = 108855303;BA.debugLine="lbl_title.Text = Item.NameKala";
__ref._lbl_title /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .NameKala /*String*/ ));
RDebugUtils.currentLine=108855304;
 //BA.debugLineNum = 108855304;BA.debugLine="LblC_Kala.Text = \"کد کالا: \" & Item.CodeKala";
__ref._lblc_kala /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("کد کالا: "+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .CodeKala /*String*/ ));
RDebugUtils.currentLine=108855333;
 //BA.debugLineNum = 108855333;BA.debugLine="If IsNumber(Item.FldFeeBadAzTakhfif) = True Then";
if (__c.IsNumber(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldFeeBadAzTakhfif /*String*/ )==__c.True) { 
RDebugUtils.currentLine=108855334;
 //BA.debugLineNum = 108855334;BA.debugLine="If Item.FldFeeBadAzTakhfif > 0 Then";
if ((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldFeeBadAzTakhfif /*String*/ ))>0) { 
RDebugUtils.currentLine=108855335;
 //BA.debugLineNum = 108855335;BA.debugLine="MCode.Rs.Initialize(NumberFormat(Item.FeeForoos";
_mcode._rs /*anywheresoftware.b4a.agraham.richstring.RichStringBuilder.RichString*/ .Initialize(BA.ObjectToCharSequence(__c.NumberFormat(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FeeForoosh /*int*/ ,(int) (1),(int) (3))+" "+_mcode._vahedpool /*String*/ ));
RDebugUtils.currentLine=108855336;
 //BA.debugLineNum = 108855336;BA.debugLine="MCode.Rs.Strikethrough (0, MCode.Rs.Length)";
_mcode._rs /*anywheresoftware.b4a.agraham.richstring.RichStringBuilder.RichString*/ .Strikethrough((int) (0),_mcode._rs /*anywheresoftware.b4a.agraham.richstring.RichStringBuilder.RichString*/ .getLength());
RDebugUtils.currentLine=108855337;
 //BA.debugLineNum = 108855337;BA.debugLine="MCode.Rs.Color(Colors.Red,0, MCode.Rs.Length)";
_mcode._rs /*anywheresoftware.b4a.agraham.richstring.RichStringBuilder.RichString*/ .Color(__c.Colors.Red,(int) (0),_mcode._rs /*anywheresoftware.b4a.agraham.richstring.RichStringBuilder.RichString*/ .getLength());
RDebugUtils.currentLine=108855338;
 //BA.debugLineNum = 108855338;BA.debugLine="LblFee.Text = MCode.Rs";
__ref._lblfee /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_mcode._rs /*anywheresoftware.b4a.agraham.richstring.RichStringBuilder.RichString*/ .getObject()));
RDebugUtils.currentLine=108855339;
 //BA.debugLineNum = 108855339;BA.debugLine="LblFeeBadAzTakhfid.Text = NumberFormat(Item.Fld";
__ref._lblfeebadaztakhfid /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__c.NumberFormat((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldFeeBadAzTakhfif /*String*/ )),(int) (1),(int) (3))+" "+_mcode._vahedpool /*String*/ ));
RDebugUtils.currentLine=108855340;
 //BA.debugLineNum = 108855340;BA.debugLine="ImageOff.Visible=True";
__ref._imageoff /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .setVisible(__c.True);
 }else {
RDebugUtils.currentLine=108855342;
 //BA.debugLineNum = 108855342;BA.debugLine="LblFee.Text = NumberFormat(Item.FeeForoosh,1,3)";
__ref._lblfee /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__c.NumberFormat(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FeeForoosh /*int*/ ,(int) (1),(int) (3))+" "+_mcode._vahedpool /*String*/ ));
RDebugUtils.currentLine=108855343;
 //BA.debugLineNum = 108855343;BA.debugLine="LblFeeBadAzTakhfid.Text = \"\"";
__ref._lblfeebadaztakhfid /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=108855344;
 //BA.debugLineNum = 108855344;BA.debugLine="ImageOff.Visible=False";
__ref._imageoff /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .setVisible(__c.False);
 };
 }else {
RDebugUtils.currentLine=108855347;
 //BA.debugLineNum = 108855347;BA.debugLine="LblFee.Text = NumberFormat(Item.FeeForoosh,1,3)";
__ref._lblfee /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__c.NumberFormat(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FeeForoosh /*int*/ ,(int) (1),(int) (3))+" "+_mcode._vahedpool /*String*/ ));
RDebugUtils.currentLine=108855348;
 //BA.debugLineNum = 108855348;BA.debugLine="LblFeeBadAzTakhfid.Text = \"\"";
__ref._lblfeebadaztakhfid /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(""));
 };
RDebugUtils.currentLine=108855354;
 //BA.debugLineNum = 108855354;BA.debugLine="LblTedadJoz.Text =\"تعداد جزء\"& Item.TedadDarSabad";
__ref._lbltedadjoz /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("تعداد جزء"+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadJoz /*String*/ ));
RDebugUtils.currentLine=108855355;
 //BA.debugLineNum = 108855355;BA.debugLine="lblVahedJoz.Text = \"تعداد به \"& Item.NameVahed";
__ref._lblvahedjoz /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("تعداد به "+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .NameVahed /*String*/ ));
RDebugUtils.currentLine=108855356;
 //BA.debugLineNum = 108855356;BA.debugLine="LblTedadkol.Text =\"تعداد کل\"& Item.TedadDarSabadK";
__ref._lbltedadkol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("تعداد کل"+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadKol /*String*/ ));
RDebugUtils.currentLine=108855357;
 //BA.debugLineNum = 108855357;BA.debugLine="lblVahedKol.Text = \"تعداد به \"& Item.NameVahed2";
__ref._lblvahedkol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("تعداد به "+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .NameVahed2 /*String*/ ));
RDebugUtils.currentLine=108855368;
 //BA.debugLineNum = 108855368;BA.debugLine="If Item.TedadDarKarton<>0 And IsNumber(Item.Tedad";
if ((__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarKarton /*String*/ ).equals(BA.NumberToString(0)) == false && __c.IsNumber(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarKarton /*String*/ )==__c.True) { 
RDebugUtils.currentLine=108855369;
 //BA.debugLineNum = 108855369;BA.debugLine="maxkolRond=(Item.SumMande/Item.TedadDarKarton)";
__ref._maxkolrond /*long*/  = (long) (((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/ ))/(double)(double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarKarton /*String*/ ))));
RDebugUtils.currentLine=108855370;
 //BA.debugLineNum = 108855370;BA.debugLine="LblTedadKarton.Text=\"تعداد در کارتن: \"& Item.Ted";
__ref._lbltedadkarton /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("تعداد در کارتن: "+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarKarton /*String*/ ));
RDebugUtils.currentLine=108855371;
 //BA.debugLineNum = 108855371;BA.debugLine="Log(maxkolRond)";
__c.LogImpl("5108855371",BA.NumberToString(__ref._maxkolrond /*long*/ ),0);
 }else {
RDebugUtils.currentLine=108855373;
 //BA.debugLineNum = 108855373;BA.debugLine="maxkolRond=0";
__ref._maxkolrond /*long*/  = (long) (0);
RDebugUtils.currentLine=108855374;
 //BA.debugLineNum = 108855374;BA.debugLine="LblTedadKarton.Text=\"تعداد در کارتن:\"&maxkolRond";
__ref._lbltedadkarton /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("تعداد در کارتن:"+BA.NumberToString(__ref._maxkolrond /*long*/ )));
RDebugUtils.currentLine=108855375;
 //BA.debugLineNum = 108855375;BA.debugLine="LblMojoodiKol.Text =\"موجودی کل: -\"";
__ref._lblmojoodikol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("موجودی کل: -"));
 };
RDebugUtils.currentLine=108855377;
 //BA.debugLineNum = 108855377;BA.debugLine="Log(maxkolRond)";
__c.LogImpl("5108855377",BA.NumberToString(__ref._maxkolrond /*long*/ ),0);
RDebugUtils.currentLine=108855378;
 //BA.debugLineNum = 108855378;BA.debugLine="LblMojoodiJoz.Text =\"موجودی جزء: \"& Item.SumMande";
__ref._lblmojoodijoz /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("موجودی جزء: "+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/ +" "+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .NameVahed /*String*/ ));
RDebugUtils.currentLine=108855380;
 //BA.debugLineNum = 108855380;BA.debugLine="If  Item.SumMandeKarton <> Null Then";
if (__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMandeKarton /*String*/ != null) { 
RDebugUtils.currentLine=108855381;
 //BA.debugLineNum = 108855381;BA.debugLine="LblMojoodiKol.Text =\"موجودی کل: \"& maxkolRond &";
__ref._lblmojoodikol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("موجودی کل: "+BA.NumberToString(__ref._maxkolrond /*long*/ )+" "+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .NameVahed2 /*String*/ ));
 }else {
RDebugUtils.currentLine=108855383;
 //BA.debugLineNum = 108855383;BA.debugLine="LblMojoodiKol.Text =\"موجودی کل: -\"";
__ref._lblmojoodikol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("موجودی کل: -"));
 };
RDebugUtils.currentLine=108855387;
 //BA.debugLineNum = 108855387;BA.debugLine="LblGift.Visible=MCode.CheckEshantion(Item.CodeKal";
__ref._lblgift /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(_mcode._checkeshantion /*boolean*/ (ba,__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .CodeKala /*String*/ ));
RDebugUtils.currentLine=108855388;
 //BA.debugLineNum = 108855388;BA.debugLine="If MCode.HideMojodi=1 Then";
if ((_mcode._hidemojodi /*String*/ ).equals(BA.NumberToString(1))) { 
RDebugUtils.currentLine=108855389;
 //BA.debugLineNum = 108855389;BA.debugLine="LblMojoodiJoz.Visible=False";
__ref._lblmojoodijoz /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=108855390;
 //BA.debugLineNum = 108855390;BA.debugLine="LblMojoodiKol.Visible=False";
__ref._lblmojoodikol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
 }else {
RDebugUtils.currentLine=108855392;
 //BA.debugLineNum = 108855392;BA.debugLine="LblMojoodiJoz.Visible=True";
__ref._lblmojoodijoz /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=108855393;
 //BA.debugLineNum = 108855393;BA.debugLine="LblMojoodiKol.Visible=True";
__ref._lblmojoodikol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.True);
 };
RDebugUtils.currentLine=108855396;
 //BA.debugLineNum = 108855396;BA.debugLine="Try";
try {RDebugUtils.currentLine=108855413;
 //BA.debugLineNum = 108855413;BA.debugLine="myCode.DownloadImage5(Item.CodeKala,Item.fldPath";
_mycode._downloadimage5 /*String*/ (ba,__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .CodeKala /*String*/ ,__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldPathPic /*String*/ ,__ref._imagerow /*anywheresoftware.b4a.objects.ImageViewWrapper*/ );
 } 
       catch (Exception e55) {
			ba.setLastException(e55);RDebugUtils.currentLine=108855415;
 //BA.debugLineNum = 108855415;BA.debugLine="Log(LastException)";
__c.LogImpl("5108855415",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=108855521;
 //BA.debugLineNum = 108855521;BA.debugLine="End Sub";
return "";
}
public int  _getheight(ir.parsikhesab.pakhsh.cls_search __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_search";
if (Debug.shouldDelegate(ba, "getheight", false))
	 {return ((Integer) Debug.delegate(ba, "getheight", null));}
RDebugUtils.currentLine=108789760;
 //BA.debugLineNum = 108789760;BA.debugLine="Public Sub getHeight As Int";
RDebugUtils.currentLine=108789761;
 //BA.debugLineNum = 108789761;BA.debugLine="Return pnl_bk.Height";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight();
RDebugUtils.currentLine=108789762;
 //BA.debugLineNum = 108789762;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(ir.parsikhesab.pakhsh.cls_search __ref,anywheresoftware.b4a.BA _ba,Object _mdl) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cls_search";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_mdl}));}
RDebugUtils.currentLine=108658688;
 //BA.debugLineNum = 108658688;BA.debugLine="Public Sub Initialize(mdl As Object)";
RDebugUtils.currentLine=108658689;
 //BA.debugLineNum = 108658689;BA.debugLine="base = mdl";
__ref._base /*Object*/  = _mdl;
RDebugUtils.currentLine=108658690;
 //BA.debugLineNum = 108658690;BA.debugLine="Key.Initialize(\"Key\")";
__ref._key /*anywheresoftware.b4a.objects.IME*/ .Initialize("Key");
RDebugUtils.currentLine=108658692;
 //BA.debugLineNum = 108658692;BA.debugLine="p.Initialize(\"\")";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=108658693;
 //BA.debugLineNum = 108658693;BA.debugLine="p.SetLayout(0,0,100%x,100%y)";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .SetLayout((int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
RDebugUtils.currentLine=108658694;
 //BA.debugLineNum = 108658694;BA.debugLine="p.LoadLayout(\"L_RecSearch\")";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .LoadLayout("L_RecSearch",ba);
RDebugUtils.currentLine=108658697;
 //BA.debugLineNum = 108658697;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _getpanel(ir.parsikhesab.pakhsh.cls_search __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_search";
if (Debug.shouldDelegate(ba, "getpanel", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "getpanel", null));}
RDebugUtils.currentLine=108724224;
 //BA.debugLineNum = 108724224;BA.debugLine="Public Sub getPanel As Panel";
RDebugUtils.currentLine=108724225;
 //BA.debugLineNum = 108724225;BA.debugLine="pnl_bk.RemoveView";
__ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .RemoveView();
RDebugUtils.currentLine=108724226;
 //BA.debugLineNum = 108724226;BA.debugLine="Return pnl_bk";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ ;
RDebugUtils.currentLine=108724227;
 //BA.debugLineNum = 108724227;BA.debugLine="End Sub";
return null;
}
public String  _addtosabad(ir.parsikhesab.pakhsh.cls_search __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_search";
if (Debug.shouldDelegate(ba, "addtosabad", false))
	 {return ((String) Debug.delegate(ba, "addtosabad", null));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
boolean _check = false;
int _i = 0;
RDebugUtils.currentLine=109445120;
 //BA.debugLineNum = 109445120;BA.debugLine="Sub AddToSabad";
RDebugUtils.currentLine=109445122;
 //BA.debugLineNum = 109445122;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From Tb";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = _mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (ba,"Select * From TblSabad");
RDebugUtils.currentLine=109445123;
 //BA.debugLineNum = 109445123;BA.debugLine="Dim Check As Boolean";
_check = false;
RDebugUtils.currentLine=109445124;
 //BA.debugLineNum = 109445124;BA.debugLine="For i=0 To Cu.RowCount -1";
{
final int step3 = 1;
final int limit3 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=109445125;
 //BA.debugLineNum = 109445125;BA.debugLine="Cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=109445126;
 //BA.debugLineNum = 109445126;BA.debugLine="If Cu.GetString(\"FldC_Kala\") = Item.CodeKala The";
if ((_cu.GetString("FldC_Kala")).equals(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .CodeKala /*String*/ )) { 
RDebugUtils.currentLine=109445127;
 //BA.debugLineNum = 109445127;BA.debugLine="If Item.TedadDarSabadJoz = 0 And Item.TedadDarS";
if ((__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadJoz /*String*/ ).equals(BA.NumberToString(0)) && (__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadKol /*String*/ ).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=109445128;
 //BA.debugLineNum = 109445128;BA.debugLine="MCode.SaveUpdate(\"Delete From TblSabad Where F";
_mcode._saveupdate /*String*/ (ba,"Delete From TblSabad Where FldC_Kala = '"+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .CodeKala /*String*/ +"'");
 }else {
RDebugUtils.currentLine=109445130;
 //BA.debugLineNum = 109445130;BA.debugLine="MCode.SaveUpdate(\"Update TblSabad Set FldTedad";
_mcode._saveupdate /*String*/ (ba,"Update TblSabad Set FldTedadJoz = '"+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadJoz /*String*/ +"',FldTedadKol = '"+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadKol /*String*/ +"' Where FldC_kala = '"+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .CodeKala /*String*/ +"'");
 };
RDebugUtils.currentLine=109445133;
 //BA.debugLineNum = 109445133;BA.debugLine="Check = True";
_check = __c.True;
RDebugUtils.currentLine=109445134;
 //BA.debugLineNum = 109445134;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=109445137;
 //BA.debugLineNum = 109445137;BA.debugLine="If Check = False Then";
if (_check==__c.False) { 
 };
RDebugUtils.currentLine=109445140;
 //BA.debugLineNum = 109445140;BA.debugLine="CallSubDelayed(base,\"RefreshLblSabad\")";
__c.CallSubDelayed(ba,__ref._base /*Object*/ ,"RefreshLblSabad");
RDebugUtils.currentLine=109445141;
 //BA.debugLineNum = 109445141;BA.debugLine="End Sub";
return "";
}
public String  _btn_call_click(ir.parsikhesab.pakhsh.cls_search __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_search";
if (Debug.shouldDelegate(ba, "btn_call_click", false))
	 {return ((String) Debug.delegate(ba, "btn_call_click", null));}
String _str = "";
RDebugUtils.currentLine=108986368;
 //BA.debugLineNum = 108986368;BA.debugLine="Sub Btn_call_Click";
RDebugUtils.currentLine=108986369;
 //BA.debugLineNum = 108986369;BA.debugLine="Dim str As String=$\"جهت دریافت قیمت همکار لطفا با";
_str = ("جهت دریافت قیمت همکار لطفا با شماره\n"+"		 021-888821546 \n"+"		 تماس بگیرید");
RDebugUtils.currentLine=108986372;
 //BA.debugLineNum = 108986372;BA.debugLine="Msgbox(str,\"قیمت همکاری\")";
__c.Msgbox(BA.ObjectToCharSequence(_str),BA.ObjectToCharSequence("قیمت همکاری"),ba);
RDebugUtils.currentLine=108986373;
 //BA.debugLineNum = 108986373;BA.debugLine="End Sub";
return "";
}
public String  _btndowneshan_click(ir.parsikhesab.pakhsh.cls_search __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_search";
if (Debug.shouldDelegate(ba, "btndowneshan_click", false))
	 {return ((String) Debug.delegate(ba, "btndowneshan_click", null));}
int _a = 0;
RDebugUtils.currentLine=110034944;
 //BA.debugLineNum = 110034944;BA.debugLine="Sub BtnDownEshan_Click";
RDebugUtils.currentLine=110034945;
 //BA.debugLineNum = 110034945;BA.debugLine="Dim A As Int = 0";
_a = (int) (0);
RDebugUtils.currentLine=110034952;
 //BA.debugLineNum = 110034952;BA.debugLine="AddToSabad";
__ref._addtosabad /*String*/ (null);
RDebugUtils.currentLine=110034953;
 //BA.debugLineNum = 110034953;BA.debugLine="End Sub";
return "";
}
public String  _btndownjoz_click(ir.parsikhesab.pakhsh.cls_search __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_search";
if (Debug.shouldDelegate(ba, "btndownjoz_click", false))
	 {return ((String) Debug.delegate(ba, "btndownjoz_click", null));}
float _a = 0f;
float _val = 0f;
RDebugUtils.currentLine=109248512;
 //BA.debugLineNum = 109248512;BA.debugLine="Sub BtnDownJoz_Click";
RDebugUtils.currentLine=109248513;
 //BA.debugLineNum = 109248513;BA.debugLine="Dim A As Float = 0";
_a = (float) (0);
RDebugUtils.currentLine=109248514;
 //BA.debugLineNum = 109248514;BA.debugLine="Dim Val As Float = 0";
_val = (float) (0);
RDebugUtils.currentLine=109248515;
 //BA.debugLineNum = 109248515;BA.debugLine="Select Case MCode.isFloat";
switch (BA.switchObjectToInt(_mcode._isfloat /*boolean*/ ,__c.True,__c.False)) {
case 0: {
RDebugUtils.currentLine=109248517;
 //BA.debugLineNum = 109248517;BA.debugLine="Val = 0.25";
_val = (float) (0.25);
 break; }
case 1: {
RDebugUtils.currentLine=109248519;
 //BA.debugLineNum = 109248519;BA.debugLine="Val = 1";
_val = (float) (1);
 break; }
}
;
RDebugUtils.currentLine=109248522;
 //BA.debugLineNum = 109248522;BA.debugLine="A = Item.TedadDarSabadJoz";
_a = (float)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadJoz /*String*/ ));
RDebugUtils.currentLine=109248523;
 //BA.debugLineNum = 109248523;BA.debugLine="If A > 0 Then";
if (_a>0) { 
RDebugUtils.currentLine=109248524;
 //BA.debugLineNum = 109248524;BA.debugLine="A = A - Val";
_a = (float) (_a-_val);
RDebugUtils.currentLine=109248525;
 //BA.debugLineNum = 109248525;BA.debugLine="Item.SumMande = Item.SumMande + Val";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/  = BA.NumberToString((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/ ))+_val);
RDebugUtils.currentLine=109248526;
 //BA.debugLineNum = 109248526;BA.debugLine="Item.TedadDarSabadJoz = A";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadJoz /*String*/  = BA.NumberToString(_a);
 };
RDebugUtils.currentLine=109248528;
 //BA.debugLineNum = 109248528;BA.debugLine="AddToSabad";
__ref._addtosabad /*String*/ (null);
RDebugUtils.currentLine=109248529;
 //BA.debugLineNum = 109248529;BA.debugLine="End Sub";
return "";
}
public String  _btndownkol_click(ir.parsikhesab.pakhsh.cls_search __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_search";
if (Debug.shouldDelegate(ba, "btndownkol_click", false))
	 {return ((String) Debug.delegate(ba, "btndownkol_click", null));}
int _a = 0;
RDebugUtils.currentLine=109379584;
 //BA.debugLineNum = 109379584;BA.debugLine="Sub BtnDownKol_Click";
RDebugUtils.currentLine=109379585;
 //BA.debugLineNum = 109379585;BA.debugLine="Dim A As Int = 0";
_a = (int) (0);
RDebugUtils.currentLine=109379586;
 //BA.debugLineNum = 109379586;BA.debugLine="A = Item.TedadDarSabadKol";
_a = (int)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadKol /*String*/ ));
RDebugUtils.currentLine=109379587;
 //BA.debugLineNum = 109379587;BA.debugLine="If A > 0 Then";
if (_a>0) { 
RDebugUtils.currentLine=109379588;
 //BA.debugLineNum = 109379588;BA.debugLine="A = A - 1";
_a = (int) (_a-1);
RDebugUtils.currentLine=109379589;
 //BA.debugLineNum = 109379589;BA.debugLine="Item.SumMande = Item.SumMande + Item.TedadDarSab";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/  = BA.NumberToString((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/ ))+(double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadKol /*String*/ )));
RDebugUtils.currentLine=109379590;
 //BA.debugLineNum = 109379590;BA.debugLine="Item.TedadDarSabadKol = A";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadKol /*String*/  = BA.NumberToString(_a);
 };
RDebugUtils.currentLine=109379592;
 //BA.debugLineNum = 109379592;BA.debugLine="AddToSabad";
__ref._addtosabad /*String*/ (null);
RDebugUtils.currentLine=109379593;
 //BA.debugLineNum = 109379593;BA.debugLine="End Sub";
return "";
}
public String  _btnupeshan_click(ir.parsikhesab.pakhsh.cls_search __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_search";
if (Debug.shouldDelegate(ba, "btnupeshan_click", false))
	 {return ((String) Debug.delegate(ba, "btnupeshan_click", null));}
RDebugUtils.currentLine=109969408;
 //BA.debugLineNum = 109969408;BA.debugLine="Sub BtnUpEshan_Click";
RDebugUtils.currentLine=109969425;
 //BA.debugLineNum = 109969425;BA.debugLine="AddToSabad";
__ref._addtosabad /*String*/ (null);
RDebugUtils.currentLine=109969426;
 //BA.debugLineNum = 109969426;BA.debugLine="End Sub";
return "";
}
public String  _btnupjoz_click(ir.parsikhesab.pakhsh.cls_search __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_search";
if (Debug.shouldDelegate(ba, "btnupjoz_click", false))
	 {return ((String) Debug.delegate(ba, "btnupjoz_click", null));}
RDebugUtils.currentLine=109182976;
 //BA.debugLineNum = 109182976;BA.debugLine="Sub BtnUpJoz_Click";
RDebugUtils.currentLine=109183000;
 //BA.debugLineNum = 109183000;BA.debugLine="AddToSabad";
__ref._addtosabad /*String*/ (null);
RDebugUtils.currentLine=109183001;
 //BA.debugLineNum = 109183001;BA.debugLine="End Sub";
return "";
}
public String  _btnupkol_click(ir.parsikhesab.pakhsh.cls_search __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_search";
if (Debug.shouldDelegate(ba, "btnupkol_click", false))
	 {return ((String) Debug.delegate(ba, "btnupkol_click", null));}
RDebugUtils.currentLine=109314048;
 //BA.debugLineNum = 109314048;BA.debugLine="Sub BtnUpKol_Click";
RDebugUtils.currentLine=109314063;
 //BA.debugLineNum = 109314063;BA.debugLine="AddToSabad";
__ref._addtosabad /*String*/ (null);
RDebugUtils.currentLine=109314064;
 //BA.debugLineNum = 109314064;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(ir.parsikhesab.pakhsh.cls_search __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_search";
RDebugUtils.currentLine=108593152;
 //BA.debugLineNum = 108593152;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=108593153;
 //BA.debugLineNum = 108593153;BA.debugLine="Private p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=108593154;
 //BA.debugLineNum = 108593154;BA.debugLine="Private pnl_bk As Panel";
_pnl_bk = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=108593155;
 //BA.debugLineNum = 108593155;BA.debugLine="Private ImageRow As ImageView";
_imagerow = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=108593156;
 //BA.debugLineNum = 108593156;BA.debugLine="Private ImageOff As ImageView";
_imageoff = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=108593157;
 //BA.debugLineNum = 108593157;BA.debugLine="Private LblGift As Label";
_lblgift = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=108593158;
 //BA.debugLineNum = 108593158;BA.debugLine="Private lbl_title As Label";
_lbl_title = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=108593159;
 //BA.debugLineNum = 108593159;BA.debugLine="Private ImageCall As ImageView";
_imagecall = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=108593160;
 //BA.debugLineNum = 108593160;BA.debugLine="Private LblFee As Label";
_lblfee = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=108593161;
 //BA.debugLineNum = 108593161;BA.debugLine="Private LblFeeBadAzTakhfid As Label";
_lblfeebadaztakhfid = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=108593162;
 //BA.debugLineNum = 108593162;BA.debugLine="Private LblC_Kala As Label";
_lblc_kala = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=108593163;
 //BA.debugLineNum = 108593163;BA.debugLine="Private LblTozihat As Label";
_lbltozihat = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=108593164;
 //BA.debugLineNum = 108593164;BA.debugLine="Private LblMojoodiJoz As Label";
_lblmojoodijoz = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=108593165;
 //BA.debugLineNum = 108593165;BA.debugLine="Private LblMojoodiKol As Label";
_lblmojoodikol = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=108593166;
 //BA.debugLineNum = 108593166;BA.debugLine="Private LblTedadKarton As Label";
_lbltedadkarton = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=108593167;
 //BA.debugLineNum = 108593167;BA.debugLine="Private BtnUpJoz As Label";
_btnupjoz = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=108593168;
 //BA.debugLineNum = 108593168;BA.debugLine="Private LblTedadJoz As Label";
_lbltedadjoz = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=108593169;
 //BA.debugLineNum = 108593169;BA.debugLine="Private BtnDownJoz As Label";
_btndownjoz = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=108593170;
 //BA.debugLineNum = 108593170;BA.debugLine="Private BtnDownKol As Label";
_btndownkol = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=108593171;
 //BA.debugLineNum = 108593171;BA.debugLine="Private LblTedadkol As Label";
_lbltedadkol = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=108593172;
 //BA.debugLineNum = 108593172;BA.debugLine="Private BtnUpKol As Label";
_btnupkol = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=108593173;
 //BA.debugLineNum = 108593173;BA.debugLine="Private Item As AdapterListKala";
_item = new ir.parsikhesab.pakhsh.mcode._adapterlistkala();
RDebugUtils.currentLine=108593174;
 //BA.debugLineNum = 108593174;BA.debugLine="Private Key As IME";
_key = new anywheresoftware.b4a.objects.IME();
RDebugUtils.currentLine=108593175;
 //BA.debugLineNum = 108593175;BA.debugLine="Private base As Object";
_base = new Object();
RDebugUtils.currentLine=108593176;
 //BA.debugLineNum = 108593176;BA.debugLine="Private BtnDownEshan As Label";
_btndowneshan = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=108593177;
 //BA.debugLineNum = 108593177;BA.debugLine="Private BtnUpEshan As Label";
_btnupeshan = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=108593178;
 //BA.debugLineNum = 108593178;BA.debugLine="Private LblTedadEshan As Label";
_lbltedadeshan = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=108593179;
 //BA.debugLineNum = 108593179;BA.debugLine="Private lblVahedJoz As Label";
_lblvahedjoz = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=108593180;
 //BA.debugLineNum = 108593180;BA.debugLine="Private lblVahedKol As Label";
_lblvahedkol = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=108593182;
 //BA.debugLineNum = 108593182;BA.debugLine="Dim maxkolRond As Long";
_maxkolrond = 0L;
RDebugUtils.currentLine=108593183;
 //BA.debugLineNum = 108593183;BA.debugLine="Dim Glide As Hitex_Glide";
_glide = new com.glide.Hitex_Glide();
RDebugUtils.currentLine=108593188;
 //BA.debugLineNum = 108593188;BA.debugLine="Private Panel4 As Panel";
_panel4 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=108593189;
 //BA.debugLineNum = 108593189;BA.debugLine="End Sub";
return "";
}
public void  _download(ir.parsikhesab.pakhsh.cls_search __ref,String _link) throws Exception{
RDebugUtils.currentModule="cls_search";
if (Debug.shouldDelegate(ba, "download", false))
	 {Debug.delegate(ba, "download", new Object[] {_link}); return;}
ResumableSub_Download rsub = new ResumableSub_Download(this,__ref,_link);
rsub.resume(ba, null);
}
public static class ResumableSub_Download extends BA.ResumableSub {
public ResumableSub_Download(ir.parsikhesab.pakhsh.cls_search parent,ir.parsikhesab.pakhsh.cls_search __ref,String _link) {
this.parent = parent;
this.__ref = __ref;
this._link = _link;
this.__ref = parent;
}
ir.parsikhesab.pakhsh.cls_search __ref;
ir.parsikhesab.pakhsh.cls_search parent;
String _link;
String _filename = "";
ir.parsikhesab.pakhsh.httpjob _j = null;
ir.parsikhesab.pakhsh.httpjob _job = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cls_search";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=109707265;
 //BA.debugLineNum = 109707265;BA.debugLine="If link.IndexOf(\"http\")>-1 Or link.IndexOf(\"HTTP\"";
if (true) break;

case 1:
//if
this.state = 18;
if (_link.indexOf("http")>-1 || _link.indexOf("HTTP")>-1 || _link.indexOf("Http")>-1) { 
this.state = 3;
}else {
this.state = 17;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=109707266;
 //BA.debugLineNum = 109707266;BA.debugLine="Dim filename As String";
_filename = "";
RDebugUtils.currentLine=109707267;
 //BA.debugLineNum = 109707267;BA.debugLine="filename = GetFilename(link)";
_filename = __ref._getfilename /*String*/ (null,_link);
RDebugUtils.currentLine=109707268;
 //BA.debugLineNum = 109707268;BA.debugLine="If File.Exists(Starter.SharedFolder,filename) Th";
if (true) break;

case 4:
//if
this.state = 15;
if (parent.__c.File.Exists(parent._starter._sharedfolder /*String*/ ,_filename)) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 15;
RDebugUtils.currentLine=109707269;
 //BA.debugLineNum = 109707269;BA.debugLine="ImageRow.Bitmap=LoadBitmapSample(Starter.Shared";
__ref._imagerow /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .setBitmap((android.graphics.Bitmap)(parent.__c.LoadBitmapSample(parent._starter._sharedfolder /*String*/ ,_filename,parent.__c.DipToCurrent((int) (300)),parent.__c.DipToCurrent((int) (300))).getObject()));
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=109707271;
 //BA.debugLineNum = 109707271;BA.debugLine="Dim j As HttpJob";
_j = new ir.parsikhesab.pakhsh.httpjob();
RDebugUtils.currentLine=109707272;
 //BA.debugLineNum = 109707272;BA.debugLine="j.Initialize(link,Me)";
_j._initialize /*String*/ (null,ba,_link,parent);
RDebugUtils.currentLine=109707273;
 //BA.debugLineNum = 109707273;BA.debugLine="j.Download(link)";
_j._download /*String*/ (null,_link);
RDebugUtils.currentLine=109707274;
 //BA.debugLineNum = 109707274;BA.debugLine="Wait For (j) JobDone(Job As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cls_search", "download"), (Object)(_j));
this.state = 19;
return;
case 19:
//C
this.state = 9;
_job = (ir.parsikhesab.pakhsh.httpjob) result[1];
;
RDebugUtils.currentLine=109707275;
 //BA.debugLineNum = 109707275;BA.debugLine="If Job.Success Then";
if (true) break;

case 9:
//if
this.state = 14;
if (_job._success /*boolean*/ ) { 
this.state = 11;
}else {
this.state = 13;
}if (true) break;

case 11:
//C
this.state = 14;
RDebugUtils.currentLine=109707276;
 //BA.debugLineNum = 109707276;BA.debugLine="Dim bmp As Bitmap = Job.GetBitmap";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_bmp = _job._getbitmap /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ (null);
RDebugUtils.currentLine=109707277;
 //BA.debugLineNum = 109707277;BA.debugLine="ImageRow.Bitmap=bmp";
__ref._imagerow /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .setBitmap((android.graphics.Bitmap)(_bmp.getObject()));
RDebugUtils.currentLine=109707278;
 //BA.debugLineNum = 109707278;BA.debugLine="filename = GetFilename(Job.JobName)";
_filename = __ref._getfilename /*String*/ (null,_job._jobname /*String*/ );
RDebugUtils.currentLine=109707279;
 //BA.debugLineNum = 109707279;BA.debugLine="WriteBitmap2File(bmp,90,filename)";
__ref._writebitmap2file /*String*/ (null,_bmp,(int) (90),_filename);
 if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=109707281;
 //BA.debugLineNum = 109707281;BA.debugLine="ImageRow.Bitmap=LoadBitmap(File.DirAssets,\"ICO";
__ref._imagerow /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .setBitmap((android.graphics.Bitmap)(parent.__c.LoadBitmap(parent.__c.File.getDirAssets(),"ICON.png").getObject()));
 if (true) break;

case 14:
//C
this.state = 15;
;
 if (true) break;

case 15:
//C
this.state = 18;
;
 if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=109707285;
 //BA.debugLineNum = 109707285;BA.debugLine="ImageRow.Bitmap=LoadBitmap(File.DirAssets,\"ICON.";
__ref._imagerow /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .setBitmap((android.graphics.Bitmap)(parent.__c.LoadBitmap(parent.__c.File.getDirAssets(),"ICON.png").getObject()));
 if (true) break;

case 18:
//C
this.state = -1;
;
RDebugUtils.currentLine=109707287;
 //BA.debugLineNum = 109707287;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _getfilename(ir.parsikhesab.pakhsh.cls_search __ref,String _fullpath) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_search";
if (Debug.shouldDelegate(ba, "getfilename", false))
	 {return ((String) Debug.delegate(ba, "getfilename", new Object[] {_fullpath}));}
String _res = "";
RDebugUtils.currentLine=109772800;
 //BA.debugLineNum = 109772800;BA.debugLine="Sub GetFilename(fullpath As String) As String";
RDebugUtils.currentLine=109772801;
 //BA.debugLineNum = 109772801;BA.debugLine="Dim res As String";
_res = "";
RDebugUtils.currentLine=109772802;
 //BA.debugLineNum = 109772802;BA.debugLine="res = fullpath.SubString(fullpath.LastIndexOf(\"/\"";
_res = _fullpath.substring((int) (_fullpath.lastIndexOf("/")+1));
RDebugUtils.currentLine=109772803;
 //BA.debugLineNum = 109772803;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=109772804;
 //BA.debugLineNum = 109772804;BA.debugLine="End Sub";
return "";
}
public String  _writebitmap2file(ir.parsikhesab.pakhsh.cls_search __ref,anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _image,int _quality,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_search";
if (Debug.shouldDelegate(ba, "writebitmap2file", false))
	 {return ((String) Debug.delegate(ba, "writebitmap2file", new Object[] {_image,_quality,_filename}));}
RDebugUtils.currentLine=109838336;
 //BA.debugLineNum = 109838336;BA.debugLine="Sub WriteBitmap2File(Image As Bitmap, Quality As I";
RDebugUtils.currentLine=109838345;
 //BA.debugLineNum = 109838345;BA.debugLine="End Sub";
return "";
}
public byte[]  _getbytefrombitmap(ir.parsikhesab.pakhsh.cls_search __ref,anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _img,int _quality) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_search";
if (Debug.shouldDelegate(ba, "getbytefrombitmap", false))
	 {return ((byte[]) Debug.delegate(ba, "getbytefrombitmap", new Object[] {_img,_quality}));}
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
byte[] _data = null;
RDebugUtils.currentLine=109903872;
 //BA.debugLineNum = 109903872;BA.debugLine="Sub GetByteFromBitmap(Img As Bitmap, Quality As In";
RDebugUtils.currentLine=109903873;
 //BA.debugLineNum = 109903873;BA.debugLine="Dim out As OutputStream";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=109903874;
 //BA.debugLineNum = 109903874;BA.debugLine="Dim data() As Byte";
_data = new byte[(int) (0)];
;
RDebugUtils.currentLine=109903875;
 //BA.debugLineNum = 109903875;BA.debugLine="out.InitializeToBytesArray(1)";
_out.InitializeToBytesArray((int) (1));
RDebugUtils.currentLine=109903876;
 //BA.debugLineNum = 109903876;BA.debugLine="Img.WriteToStream(out,Quality,\"JPEG\")";
_img.WriteToStream((java.io.OutputStream)(_out.getObject()),_quality,BA.getEnumFromString(android.graphics.Bitmap.CompressFormat.class,"JPEG"));
RDebugUtils.currentLine=109903877;
 //BA.debugLineNum = 109903877;BA.debugLine="data = out.ToBytesArray";
_data = _out.ToBytesArray();
RDebugUtils.currentLine=109903878;
 //BA.debugLineNum = 109903878;BA.debugLine="out.Close";
_out.Close();
RDebugUtils.currentLine=109903879;
 //BA.debugLineNum = 109903879;BA.debugLine="Return data";
if (true) return _data;
RDebugUtils.currentLine=109903880;
 //BA.debugLineNum = 109903880;BA.debugLine="End Sub";
return null;
}
public String  _imagerow_click(ir.parsikhesab.pakhsh.cls_search __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_search";
if (Debug.shouldDelegate(ba, "imagerow_click", false))
	 {return ((String) Debug.delegate(ba, "imagerow_click", null));}
RDebugUtils.currentLine=109510656;
 //BA.debugLineNum = 109510656;BA.debugLine="Sub ImageRow_Click";
RDebugUtils.currentLine=109510657;
 //BA.debugLineNum = 109510657;BA.debugLine="Act_ImageSlideShow.Item = Item";
_act_imageslideshow._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/  = __ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ ;
RDebugUtils.currentLine=109510658;
 //BA.debugLineNum = 109510658;BA.debugLine="StartActivity(Act_ImageSlideShow)";
__c.StartActivity(ba,(Object)(_act_imageslideshow.getObject()));
RDebugUtils.currentLine=109510660;
 //BA.debugLineNum = 109510660;BA.debugLine="End Sub";
return "";
}
public String  _lblgift_click(ir.parsikhesab.pakhsh.cls_search __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_search";
if (Debug.shouldDelegate(ba, "lblgift_click", false))
	 {return ((String) Debug.delegate(ba, "lblgift_click", null));}
RDebugUtils.currentLine=109051904;
 //BA.debugLineNum = 109051904;BA.debugLine="Sub LblGift_Click";
RDebugUtils.currentLine=109051935;
 //BA.debugLineNum = 109051935;BA.debugLine="End Sub";
return "";
}
public String  _lbltedadjoz_click(ir.parsikhesab.pakhsh.cls_search __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_search";
if (Debug.shouldDelegate(ba, "lbltedadjoz_click", false))
	 {return ((String) Debug.delegate(ba, "lbltedadjoz_click", null));}
RDebugUtils.currentLine=109576192;
 //BA.debugLineNum = 109576192;BA.debugLine="Sub LblTedadJoz_Click";
RDebugUtils.currentLine=109576193;
 //BA.debugLineNum = 109576193;BA.debugLine="CallSubDelayed2(base,\"LblTedadJoz_Click\",Item)";
__c.CallSubDelayed2(ba,__ref._base /*Object*/ ,"LblTedadJoz_Click",(Object)(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ ));
RDebugUtils.currentLine=109576194;
 //BA.debugLineNum = 109576194;BA.debugLine="End Sub";
return "";
}
public String  _lbltedadkol_click(ir.parsikhesab.pakhsh.cls_search __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_search";
if (Debug.shouldDelegate(ba, "lbltedadkol_click", false))
	 {return ((String) Debug.delegate(ba, "lbltedadkol_click", null));}
RDebugUtils.currentLine=109641728;
 //BA.debugLineNum = 109641728;BA.debugLine="Sub LblTedadKol_Click";
RDebugUtils.currentLine=109641729;
 //BA.debugLineNum = 109641729;BA.debugLine="CallSubDelayed2(base,\"LblTedadKol_Click\",Item)";
__c.CallSubDelayed2(ba,__ref._base /*Object*/ ,"LblTedadKol_Click",(Object)(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ ));
RDebugUtils.currentLine=109641730;
 //BA.debugLineNum = 109641730;BA.debugLine="End Sub";
return "";
}
public String  _lbltozihat_click(ir.parsikhesab.pakhsh.cls_search __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_search";
if (Debug.shouldDelegate(ba, "lbltozihat_click", false))
	 {return ((String) Debug.delegate(ba, "lbltozihat_click", null));}
RDebugUtils.currentLine=109117440;
 //BA.debugLineNum = 109117440;BA.debugLine="Sub LblTozihat_Click";
RDebugUtils.currentLine=109117444;
 //BA.debugLineNum = 109117444;BA.debugLine="End Sub";
return "";
}
public String  _pnl_bk_click(ir.parsikhesab.pakhsh.cls_search __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_search";
if (Debug.shouldDelegate(ba, "pnl_bk_click", false))
	 {return ((String) Debug.delegate(ba, "pnl_bk_click", null));}
RDebugUtils.currentLine=110100480;
 //BA.debugLineNum = 110100480;BA.debugLine="Sub pnl_bk_Click";
RDebugUtils.currentLine=110100484;
 //BA.debugLineNum = 110100484;BA.debugLine="End Sub";
return "";
}
public String  _status(ir.parsikhesab.pakhsh.cls_search __ref,boolean _enable) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_search";
if (Debug.shouldDelegate(ba, "status", false))
	 {return ((String) Debug.delegate(ba, "status", new Object[] {_enable}));}
RDebugUtils.currentLine=108920832;
 //BA.debugLineNum = 108920832;BA.debugLine="Sub Status(Enable As Boolean)";
RDebugUtils.currentLine=108920833;
 //BA.debugLineNum = 108920833;BA.debugLine="LogColor(\"status: \"&Enable,Colors.Red)";
__c.LogImpl("5108920833","status: "+BA.ObjectToString(_enable),__c.Colors.Red);
RDebugUtils.currentLine=108920834;
 //BA.debugLineNum = 108920834;BA.debugLine="BtnDownEshan.Enabled=Enable";
__ref._btndowneshan /*anywheresoftware.b4a.objects.LabelWrapper*/ .setEnabled(_enable);
RDebugUtils.currentLine=108920835;
 //BA.debugLineNum = 108920835;BA.debugLine="BtnUpEshan.Enabled=Enable";
__ref._btnupeshan /*anywheresoftware.b4a.objects.LabelWrapper*/ .setEnabled(_enable);
RDebugUtils.currentLine=108920836;
 //BA.debugLineNum = 108920836;BA.debugLine="LblTedadEshan.Enabled=Enable";
__ref._lbltedadeshan /*anywheresoftware.b4a.objects.LabelWrapper*/ .setEnabled(_enable);
RDebugUtils.currentLine=108920838;
 //BA.debugLineNum = 108920838;BA.debugLine="BtnDownJoz.Enabled=Enable";
__ref._btndownjoz /*anywheresoftware.b4a.objects.LabelWrapper*/ .setEnabled(_enable);
RDebugUtils.currentLine=108920839;
 //BA.debugLineNum = 108920839;BA.debugLine="BtnUpJoz.Enabled=Enable";
__ref._btnupjoz /*anywheresoftware.b4a.objects.LabelWrapper*/ .setEnabled(_enable);
RDebugUtils.currentLine=108920840;
 //BA.debugLineNum = 108920840;BA.debugLine="LblTedadJoz.Enabled=Enable";
__ref._lbltedadjoz /*anywheresoftware.b4a.objects.LabelWrapper*/ .setEnabled(_enable);
RDebugUtils.currentLine=108920842;
 //BA.debugLineNum = 108920842;BA.debugLine="BtnDownKol.Enabled=Enable";
__ref._btndownkol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setEnabled(_enable);
RDebugUtils.currentLine=108920843;
 //BA.debugLineNum = 108920843;BA.debugLine="BtnUpKol.Enabled=Enable";
__ref._btnupkol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setEnabled(_enable);
RDebugUtils.currentLine=108920844;
 //BA.debugLineNum = 108920844;BA.debugLine="LblTedadkol.Enabled=Enable";
__ref._lbltedadkol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setEnabled(_enable);
RDebugUtils.currentLine=108920845;
 //BA.debugLineNum = 108920845;BA.debugLine="End Sub";
return "";
}
}