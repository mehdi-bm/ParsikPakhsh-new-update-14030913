package ir.parsikhesab.pakhsh;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class cls_reckalalisti extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "ir.parsikhesab.pakhsh.cls_reckalalisti");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", ir.parsikhesab.pakhsh.cls_reckalalisti.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.LabelWrapper _btn_edit_price = null;
public long _maxkolrond = 0L;
public anywheresoftware.b4a.objects.LabelWrapper _lblcounteshantion = null;
public anywheresoftware.b4a.objects.LabelWrapper _btn_discount = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblmablaghtakhfif = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblmablaghmasrafkonande = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblsummablaghkala = null;
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
public String  _show(ir.parsikhesab.pakhsh.cls_reckalalisti __ref,ir.parsikhesab.pakhsh.mcode._adapterlistkala _item1,int _position) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_reckalalisti";
if (Debug.shouldDelegate(ba, "show", false))
	 {return ((String) Debug.delegate(ba, "show", new Object[] {_item1,_position}));}
anywheresoftware.b4a.objects.ImageViewWrapper _imagerow1 = null;
int _feebadaztakhfif = 0;
int _fee = 0;
long _price = 0L;
RDebugUtils.currentLine=104398848;
 //BA.debugLineNum = 104398848;BA.debugLine="Public Sub Show(Item1 As AdapterListKala,position";
RDebugUtils.currentLine=104398849;
 //BA.debugLineNum = 104398849;BA.debugLine="Item=Item1";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/  = _item1;
RDebugUtils.currentLine=104398850;
 //BA.debugLineNum = 104398850;BA.debugLine="Private ImageRow1 As ImageView";
_imagerow1 = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=104398851;
 //BA.debugLineNum = 104398851;BA.debugLine="ImageRow1.Initialize(\"\")";
_imagerow1.Initialize(ba,"");
RDebugUtils.currentLine=104398852;
 //BA.debugLineNum = 104398852;BA.debugLine="ImageRow1.Tag=position";
_imagerow1.setTag((Object)(_position));
RDebugUtils.currentLine=104398855;
 //BA.debugLineNum = 104398855;BA.debugLine="lbl_title.Text = Item.NameKala";
__ref._lbl_title /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .NameKala /*String*/ ));
RDebugUtils.currentLine=104398856;
 //BA.debugLineNum = 104398856;BA.debugLine="LblC_Kala.Text = \"کد کالا: \" & Item.CodeKala";
__ref._lblc_kala /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("کد کالا: "+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .CodeKala /*String*/ ));
RDebugUtils.currentLine=104398859;
 //BA.debugLineNum = 104398859;BA.debugLine="Dim feebadaztakhfif As Int=(MCode.SingleResult(\"s";
_feebadaztakhfif = (int)(BA.ObjectToNumber((_mcode._singleresult /*Object*/ (ba,"select fldFeeBadAzTakhfif from TblKala where fldCodeKala="+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .CodeKala /*String*/ ))));
RDebugUtils.currentLine=104398860;
 //BA.debugLineNum = 104398860;BA.debugLine="If Item.MablaghTakhfif>0 And feebadaztakhfif=0 Th";
if (__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .MablaghTakhfif /*int*/ >0 && _feebadaztakhfif==0) { 
RDebugUtils.currentLine=104398861;
 //BA.debugLineNum = 104398861;BA.debugLine="Item.fldFeeBadAzTakhfif=Item.FeeForoosh-Item.Mab";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldFeeBadAzTakhfif /*String*/  = BA.NumberToString(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FeeForoosh /*int*/ -__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .MablaghTakhfif /*int*/ );
 }else 
{RDebugUtils.currentLine=104398863;
 //BA.debugLineNum = 104398863;BA.debugLine="else If Item.MablaghTakhfif>0 And feebadaztakhfif";
if (__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .MablaghTakhfif /*int*/ >0 && _feebadaztakhfif>0) { 
RDebugUtils.currentLine=104398864;
 //BA.debugLineNum = 104398864;BA.debugLine="Item.fldFeeBadAzTakhfif=feebadaztakhfif-Item.Mab";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldFeeBadAzTakhfif /*String*/  = BA.NumberToString(_feebadaztakhfif-__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .MablaghTakhfif /*int*/ );
 }else 
{RDebugUtils.currentLine=104398866;
 //BA.debugLineNum = 104398866;BA.debugLine="Else if Item.MablaghTakhfif=0 And feebadaztakhfif";
if (__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .MablaghTakhfif /*int*/ ==0 && _feebadaztakhfif==0) { 
RDebugUtils.currentLine=104398867;
 //BA.debugLineNum = 104398867;BA.debugLine="Item.fldFeeBadAzTakhfif=Item.MablaghTakhfif";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldFeeBadAzTakhfif /*String*/  = BA.NumberToString(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .MablaghTakhfif /*int*/ );
RDebugUtils.currentLine=104398868;
 //BA.debugLineNum = 104398868;BA.debugLine="Item.MablaghTakhfif=Item.MablaghTakhfif";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .MablaghTakhfif /*int*/  = __ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .MablaghTakhfif /*int*/ ;
 }else 
{RDebugUtils.currentLine=104398869;
 //BA.debugLineNum = 104398869;BA.debugLine="Else if Item.MablaghTakhfif=0 And feebadaztakhfif";
if (__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .MablaghTakhfif /*int*/ ==0 && _feebadaztakhfif>0) { 
RDebugUtils.currentLine=104398870;
 //BA.debugLineNum = 104398870;BA.debugLine="Item.fldFeeBadAzTakhfif=feebadaztakhfif";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldFeeBadAzTakhfif /*String*/  = BA.NumberToString(_feebadaztakhfif);
 }}}}
;
RDebugUtils.currentLine=104398873;
 //BA.debugLineNum = 104398873;BA.debugLine="Dim fee As Int";
_fee = 0;
RDebugUtils.currentLine=104398875;
 //BA.debugLineNum = 104398875;BA.debugLine="fee=Item.FeeForoosh";
_fee = __ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FeeForoosh /*int*/ ;
RDebugUtils.currentLine=104398876;
 //BA.debugLineNum = 104398876;BA.debugLine="If Item.MablaghTakhfif>0 Then";
if (__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .MablaghTakhfif /*int*/ >0) { 
RDebugUtils.currentLine=104398877;
 //BA.debugLineNum = 104398877;BA.debugLine="Item.fldFeeBadAzTakhfif=fee-Item.MablaghTakhfif";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldFeeBadAzTakhfif /*String*/  = BA.NumberToString(_fee-__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .MablaghTakhfif /*int*/ );
RDebugUtils.currentLine=104398878;
 //BA.debugLineNum = 104398878;BA.debugLine="LblMablaghTakhfif.Text=\"فی تخفیف: \"& NumberForma";
__ref._lblmablaghtakhfif /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("فی تخفیف: "+__c.NumberFormat(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .MablaghTakhfif /*int*/ ,(int) (1),(int) (3))+" "+_mcode._vahedpool /*String*/ ));
RDebugUtils.currentLine=104398879;
 //BA.debugLineNum = 104398879;BA.debugLine="LblMablaghTakhfif.TextColor=Colors.Red";
__ref._lblmablaghtakhfif /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(__c.Colors.Red);
RDebugUtils.currentLine=104398880;
 //BA.debugLineNum = 104398880;BA.debugLine="LblMablaghTakhfif.Visible=True";
__ref._lblmablaghtakhfif /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.True);
 }else {
RDebugUtils.currentLine=104398882;
 //BA.debugLineNum = 104398882;BA.debugLine="LblMablaghTakhfif.Text=0";
__ref._lblmablaghtakhfif /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(0));
RDebugUtils.currentLine=104398883;
 //BA.debugLineNum = 104398883;BA.debugLine="LblMablaghTakhfif.Visible=False";
__ref._lblmablaghtakhfif /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
 };
RDebugUtils.currentLine=104398901;
 //BA.debugLineNum = 104398901;BA.debugLine="Log(fee)";
__c.LogImpl("5104398901",BA.NumberToString(_fee),0);
RDebugUtils.currentLine=104398902;
 //BA.debugLineNum = 104398902;BA.debugLine="If IsNumber(Item.FldFeeBadAzTakhfif) = True Then";
if (__c.IsNumber(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldFeeBadAzTakhfif /*String*/ )==__c.True) { 
RDebugUtils.currentLine=104398904;
 //BA.debugLineNum = 104398904;BA.debugLine="If Item.fldFeeBadAzTakhfif>=fee Then";
if ((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldFeeBadAzTakhfif /*String*/ ))>=_fee) { 
RDebugUtils.currentLine=104398905;
 //BA.debugLineNum = 104398905;BA.debugLine="LblFee.Text =\"فی فروش: \"& NumberFormat(fee,1,3)";
__ref._lblfee /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("فی فروش: "+__c.NumberFormat(_fee,(int) (1),(int) (3))+" "+_mcode._vahedpool /*String*/ ));
RDebugUtils.currentLine=104398906;
 //BA.debugLineNum = 104398906;BA.debugLine="LblFeeBadAzTakhfid.Text = \"\"";
__ref._lblfeebadaztakhfid /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=104398907;
 //BA.debugLineNum = 104398907;BA.debugLine="Item.FldFeeBadAzTakhfif=0";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldFeeBadAzTakhfif /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=104398908;
 //BA.debugLineNum = 104398908;BA.debugLine="ImageOff.Visible=False";
__ref._imageoff /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .setVisible(__c.False);
 }else 
{RDebugUtils.currentLine=104398909;
 //BA.debugLineNum = 104398909;BA.debugLine="Else If Item.FldFeeBadAzTakhfif > 0 Then";
if ((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldFeeBadAzTakhfif /*String*/ ))>0) { 
RDebugUtils.currentLine=104398910;
 //BA.debugLineNum = 104398910;BA.debugLine="MCode.Rs.Initialize(\"فی فروش: \"& NumberFormat(f";
_mcode._rs /*anywheresoftware.b4a.agraham.richstring.RichStringBuilder.RichString*/ .Initialize(BA.ObjectToCharSequence("فی فروش: "+__c.NumberFormat(_fee,(int) (1),(int) (3))+" "+_mcode._vahedpool /*String*/ ));
RDebugUtils.currentLine=104398911;
 //BA.debugLineNum = 104398911;BA.debugLine="MCode.Rs.Strikethrough (0, MCode.Rs.Length)";
_mcode._rs /*anywheresoftware.b4a.agraham.richstring.RichStringBuilder.RichString*/ .Strikethrough((int) (0),_mcode._rs /*anywheresoftware.b4a.agraham.richstring.RichStringBuilder.RichString*/ .getLength());
RDebugUtils.currentLine=104398912;
 //BA.debugLineNum = 104398912;BA.debugLine="MCode.Rs.Color(Colors.Red,0, MCode.Rs.Length)";
_mcode._rs /*anywheresoftware.b4a.agraham.richstring.RichStringBuilder.RichString*/ .Color(__c.Colors.Red,(int) (0),_mcode._rs /*anywheresoftware.b4a.agraham.richstring.RichStringBuilder.RichString*/ .getLength());
RDebugUtils.currentLine=104398913;
 //BA.debugLineNum = 104398913;BA.debugLine="LblFee.Text = MCode.Rs";
__ref._lblfee /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_mcode._rs /*anywheresoftware.b4a.agraham.richstring.RichStringBuilder.RichString*/ .getObject()));
RDebugUtils.currentLine=104398914;
 //BA.debugLineNum = 104398914;BA.debugLine="LblFeeBadAzTakhfid.Text =\"فی بعد از تخفیف: \"& N";
__ref._lblfeebadaztakhfid /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("فی بعد از تخفیف: "+__c.NumberFormat((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldFeeBadAzTakhfif /*String*/ )),(int) (1),(int) (3))+" "+_mcode._vahedpool /*String*/ ));
RDebugUtils.currentLine=104398915;
 //BA.debugLineNum = 104398915;BA.debugLine="ImageOff.Visible=True";
__ref._imageoff /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .setVisible(__c.True);
 }else {
RDebugUtils.currentLine=104398917;
 //BA.debugLineNum = 104398917;BA.debugLine="LblFee.Text =\"فی فروش: \"& NumberFormat(fee,1,3)";
__ref._lblfee /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("فی فروش: "+__c.NumberFormat(_fee,(int) (1),(int) (3))+" "+_mcode._vahedpool /*String*/ ));
RDebugUtils.currentLine=104398918;
 //BA.debugLineNum = 104398918;BA.debugLine="LblFeeBadAzTakhfid.Text = \"\"";
__ref._lblfeebadaztakhfid /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=104398919;
 //BA.debugLineNum = 104398919;BA.debugLine="ImageOff.Visible=False";
__ref._imageoff /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .setVisible(__c.False);
 }}
;
 }else {
RDebugUtils.currentLine=104398922;
 //BA.debugLineNum = 104398922;BA.debugLine="LblFee.Text =\"فی فروش: \"& NumberFormat(fee,1,3)";
__ref._lblfee /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("فی فروش: "+__c.NumberFormat(_fee,(int) (1),(int) (3))+" "+_mcode._vahedpool /*String*/ ));
RDebugUtils.currentLine=104398923;
 //BA.debugLineNum = 104398923;BA.debugLine="LblFeeBadAzTakhfid.Text = \"\"";
__ref._lblfeebadaztakhfid /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(""));
 };
RDebugUtils.currentLine=104398926;
 //BA.debugLineNum = 104398926;BA.debugLine="If Item.TedadDarSabadJoz=Null Then";
if (__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadJoz /*String*/ == null) { 
RDebugUtils.currentLine=104398927;
 //BA.debugLineNum = 104398927;BA.debugLine="LblTedadJoz.Text=0";
__ref._lbltedadjoz /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(0));
RDebugUtils.currentLine=104398928;
 //BA.debugLineNum = 104398928;BA.debugLine="Item.TedadDarSabadJoz=0";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadJoz /*String*/  = BA.NumberToString(0);
 }else {
RDebugUtils.currentLine=104398930;
 //BA.debugLineNum = 104398930;BA.debugLine="LblTedadJoz.Text =Item.TedadDarSabadJoz";
__ref._lbltedadjoz /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadJoz /*String*/ ));
 };
RDebugUtils.currentLine=104398932;
 //BA.debugLineNum = 104398932;BA.debugLine="lblVahedJoz.Text = \"تعداد به \"& Item.NameVahed";
__ref._lblvahedjoz /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("تعداد به "+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .NameVahed /*String*/ ));
RDebugUtils.currentLine=104398934;
 //BA.debugLineNum = 104398934;BA.debugLine="If Item.TedadDarSabadKol=Null Then";
if (__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadKol /*String*/ == null) { 
RDebugUtils.currentLine=104398935;
 //BA.debugLineNum = 104398935;BA.debugLine="LblTedadkol.Text=0";
__ref._lbltedadkol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(0));
RDebugUtils.currentLine=104398936;
 //BA.debugLineNum = 104398936;BA.debugLine="Item.TedadDarSabadKol=0";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadKol /*String*/  = BA.NumberToString(0);
 }else {
RDebugUtils.currentLine=104398938;
 //BA.debugLineNum = 104398938;BA.debugLine="LblTedadkol.Text =Item.TedadDarSabadKol";
__ref._lbltedadkol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadKol /*String*/ ));
 };
RDebugUtils.currentLine=104398940;
 //BA.debugLineNum = 104398940;BA.debugLine="lblVahedKol.Text = \"تعداد به \"& Item.NameVahed2";
__ref._lblvahedkol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("تعداد به "+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .NameVahed2 /*String*/ ));
RDebugUtils.currentLine=104398952;
 //BA.debugLineNum = 104398952;BA.debugLine="If Item.FldEshantion=Null Then";
if (__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FldEshantion /*String*/ == null) { 
RDebugUtils.currentLine=104398953;
 //BA.debugLineNum = 104398953;BA.debugLine="Item.FldEshantion=0";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FldEshantion /*String*/  = BA.NumberToString(0);
 };
RDebugUtils.currentLine=104398955;
 //BA.debugLineNum = 104398955;BA.debugLine="Dim Price As Long=0";
_price = (long) (0);
RDebugUtils.currentLine=104398956;
 //BA.debugLineNum = 104398956;BA.debugLine="If Item.FldFeeBadAzTakhfif > 0 Then";
if ((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldFeeBadAzTakhfif /*String*/ ))>0) { 
RDebugUtils.currentLine=104398957;
 //BA.debugLineNum = 104398957;BA.debugLine="Price = Item.FldFeeBadAzTakhfif * ((Item.TedadDa";
_price = (long) ((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldFeeBadAzTakhfif /*String*/ ))*(((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadKol /*String*/ ))*(double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarKarton /*String*/ )))+(double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadJoz /*String*/ ))));
RDebugUtils.currentLine=104398958;
 //BA.debugLineNum = 104398958;BA.debugLine="ImageOff.Visible=True";
__ref._imageoff /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .setVisible(__c.True);
 }else {
RDebugUtils.currentLine=104398960;
 //BA.debugLineNum = 104398960;BA.debugLine="Price = Item.FeeForoosh * ((Item.TedadDarSabadKo";
_price = (long) (__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FeeForoosh /*int*/ *(((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadKol /*String*/ ))*(double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarKarton /*String*/ )))+(double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadJoz /*String*/ ))));
RDebugUtils.currentLine=104398961;
 //BA.debugLineNum = 104398961;BA.debugLine="ImageOff.Visible=False";
__ref._imageoff /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .setVisible(__c.False);
 };
RDebugUtils.currentLine=104398963;
 //BA.debugLineNum = 104398963;BA.debugLine="If Price>0 Then";
if (_price>0) { 
RDebugUtils.currentLine=104398964;
 //BA.debugLineNum = 104398964;BA.debugLine="lblSumMablaghKala.Text=\"جمع مبلغ: \"& NumberForma";
__ref._lblsummablaghkala /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("جمع مبلغ: "+__c.NumberFormat(_price,(int) (1),(int) (3))+" "+_mcode._vahedpool /*String*/ ));
 }else {
RDebugUtils.currentLine=104398966;
 //BA.debugLineNum = 104398966;BA.debugLine="lblSumMablaghKala.Text=\"جمع مبلغ: 0\"";
__ref._lblsummablaghkala /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("جمع مبلغ: 0"));
 };
RDebugUtils.currentLine=104398969;
 //BA.debugLineNum = 104398969;BA.debugLine="If Item.TedadDarKarton<>0 And IsNumber(Item.Tedad";
if ((__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarKarton /*String*/ ).equals(BA.NumberToString(0)) == false && __c.IsNumber(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarKarton /*String*/ )==__c.True) { 
RDebugUtils.currentLine=104398970;
 //BA.debugLineNum = 104398970;BA.debugLine="maxkolRond=(Item.SumMandeKarton)";
__ref._maxkolrond /*long*/  = (long)(Double.parseDouble((__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMandeKarton /*String*/ )));
RDebugUtils.currentLine=104398972;
 //BA.debugLineNum = 104398972;BA.debugLine="If Item.NameVahed2=\"\" Then";
if ((__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .NameVahed2 /*String*/ ).equals("")) { 
RDebugUtils.currentLine=104398973;
 //BA.debugLineNum = 104398973;BA.debugLine="LblTedadKarton.Text=\"تعداد در کارتن: \"& Item.Te";
__ref._lbltedadkarton /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("تعداد در کارتن: "+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarKarton /*String*/ ));
 }else {
RDebugUtils.currentLine=104398975;
 //BA.debugLineNum = 104398975;BA.debugLine="LblTedadKarton.Text=\"تعداد در \"&Item.NameVahed2";
__ref._lbltedadkarton /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("تعداد در "+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .NameVahed2 /*String*/ +": "+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarKarton /*String*/ ));
 };
RDebugUtils.currentLine=104398977;
 //BA.debugLineNum = 104398977;BA.debugLine="Log(maxkolRond)";
__c.LogImpl("5104398977",BA.NumberToString(__ref._maxkolrond /*long*/ ),0);
 }else {
RDebugUtils.currentLine=104398979;
 //BA.debugLineNum = 104398979;BA.debugLine="maxkolRond=0";
__ref._maxkolrond /*long*/  = (long) (0);
RDebugUtils.currentLine=104398981;
 //BA.debugLineNum = 104398981;BA.debugLine="If Item.NameVahed2=\"\" Then";
if ((__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .NameVahed2 /*String*/ ).equals("")) { 
RDebugUtils.currentLine=104398982;
 //BA.debugLineNum = 104398982;BA.debugLine="LblTedadKarton.Text=\"تعداد در کارتن: \"& maxkolR";
__ref._lbltedadkarton /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("تعداد در کارتن: "+BA.NumberToString(__ref._maxkolrond /*long*/ )));
 }else {
RDebugUtils.currentLine=104398984;
 //BA.debugLineNum = 104398984;BA.debugLine="LblTedadKarton.Text=\"تعداد در \"&Item.NameVahed2";
__ref._lbltedadkarton /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("تعداد در "+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .NameVahed2 /*String*/ +": "+BA.NumberToString(__ref._maxkolrond /*long*/ )));
 };
RDebugUtils.currentLine=104398986;
 //BA.debugLineNum = 104398986;BA.debugLine="LblMojoodiKol.Text =\"موجودی کل: -\"";
__ref._lblmojoodikol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("موجودی کل: -"));
 };
RDebugUtils.currentLine=104398988;
 //BA.debugLineNum = 104398988;BA.debugLine="Log(maxkolRond)";
__c.LogImpl("5104398988",BA.NumberToString(__ref._maxkolrond /*long*/ ),0);
RDebugUtils.currentLine=104398989;
 //BA.debugLineNum = 104398989;BA.debugLine="LblMojoodiJoz.Text =\"موجودی جزء: \"& Item.SumMande";
__ref._lblmojoodijoz /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("موجودی جزء: "+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/ +" "+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .NameVahed /*String*/ ));
RDebugUtils.currentLine=104398991;
 //BA.debugLineNum = 104398991;BA.debugLine="If  Item.SumMandeKarton <> Null Then";
if (__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMandeKarton /*String*/ != null) { 
RDebugUtils.currentLine=104398992;
 //BA.debugLineNum = 104398992;BA.debugLine="LblMojoodiKol.Text =\"موجودی کل: \"& maxkolRond &";
__ref._lblmojoodikol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("موجودی کل: "+BA.NumberToString(__ref._maxkolrond /*long*/ )+" "+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .NameVahed2 /*String*/ ));
 }else {
RDebugUtils.currentLine=104398994;
 //BA.debugLineNum = 104398994;BA.debugLine="LblMojoodiKol.Text =\"موجودی کل: -\"";
__ref._lblmojoodikol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("موجودی کل: -"));
 };
RDebugUtils.currentLine=104398997;
 //BA.debugLineNum = 104398997;BA.debugLine="If Item.TedadDarSabadJoz>0 Then";
if ((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadJoz /*String*/ ))>0) { 
RDebugUtils.currentLine=104398998;
 //BA.debugLineNum = 104398998;BA.debugLine="AddEshantion(Item.TedadDarSabadJoz)";
__ref._addeshantion /*String*/ (null,(int)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadJoz /*String*/ )));
RDebugUtils.currentLine=104398999;
 //BA.debugLineNum = 104398999;BA.debugLine="LblTedadEshan.Text = Item.FldEshantion";
__ref._lbltedadeshan /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FldEshantion /*String*/ ));
 };
RDebugUtils.currentLine=104399001;
 //BA.debugLineNum = 104399001;BA.debugLine="If Item.fldCountEshantion<>Null Then";
if (__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldCountEshantion /*String*/ != null) { 
RDebugUtils.currentLine=104399002;
 //BA.debugLineNum = 104399002;BA.debugLine="LblCountEshantion.Text=\"تعداد هدیه : \" & Item.fl";
__ref._lblcounteshantion /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("تعداد هدیه : "+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldCountEshantion /*String*/ ));
RDebugUtils.currentLine=104399003;
 //BA.debugLineNum = 104399003;BA.debugLine="LblTedadEshan.Text=Item.FldEshantion";
__ref._lbltedadeshan /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FldEshantion /*String*/ ));
 }else {
RDebugUtils.currentLine=104399005;
 //BA.debugLineNum = 104399005;BA.debugLine="LblCountEshantion.Text=\"تعداد هدیه : 0\"";
__ref._lblcounteshantion /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("تعداد هدیه : 0"));
 };
RDebugUtils.currentLine=104399011;
 //BA.debugLineNum = 104399011;BA.debugLine="If Item.FldMablaghMasrafKonande>0 Then";
if ((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FldMablaghMasrafKonande /*String*/ ))>0) { 
RDebugUtils.currentLine=104399012;
 //BA.debugLineNum = 104399012;BA.debugLine="LblMablaghMasrafkonande.Text=\"قیمت مصرف کننده: \"";
__ref._lblmablaghmasrafkonande /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("قیمت مصرف کننده: "+__c.NumberFormat((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FldMablaghMasrafKonande /*String*/ )),(int) (1),(int) (3))+" "+_mcode._vahedpool /*String*/ ));
 }else {
RDebugUtils.currentLine=104399014;
 //BA.debugLineNum = 104399014;BA.debugLine="LblMablaghMasrafkonande.Text=\"قیمت مصرف کننده: 0";
__ref._lblmablaghmasrafkonande /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("قیمت مصرف کننده: 0"));
 };
RDebugUtils.currentLine=104399016;
 //BA.debugLineNum = 104399016;BA.debugLine="If MCode.HideMojodi=1 Then";
if ((_mcode._hidemojodi /*String*/ ).equals(BA.NumberToString(1))) { 
RDebugUtils.currentLine=104399017;
 //BA.debugLineNum = 104399017;BA.debugLine="LblMojoodiJoz.Visible=False";
__ref._lblmojoodijoz /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=104399018;
 //BA.debugLineNum = 104399018;BA.debugLine="LblMojoodiKol.Visible=False";
__ref._lblmojoodikol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
 }else {
RDebugUtils.currentLine=104399020;
 //BA.debugLineNum = 104399020;BA.debugLine="LblMojoodiJoz.Visible=True";
__ref._lblmojoodijoz /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=104399021;
 //BA.debugLineNum = 104399021;BA.debugLine="LblMojoodiKol.Visible=True";
__ref._lblmojoodikol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.True);
 };
RDebugUtils.currentLine=104399024;
 //BA.debugLineNum = 104399024;BA.debugLine="LblGift.Visible=MCode.CheckEshantion(Item.CodeKal";
__ref._lblgift /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(_mcode._checkeshantion /*boolean*/ (ba,__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .CodeKala /*String*/ ));
RDebugUtils.currentLine=104399026;
 //BA.debugLineNum = 104399026;BA.debugLine="End Sub";
return "";
}
public int  _getheight(ir.parsikhesab.pakhsh.cls_reckalalisti __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_reckalalisti";
if (Debug.shouldDelegate(ba, "getheight", false))
	 {return ((Integer) Debug.delegate(ba, "getheight", null));}
RDebugUtils.currentLine=104333312;
 //BA.debugLineNum = 104333312;BA.debugLine="Public Sub getHeight As Int";
RDebugUtils.currentLine=104333313;
 //BA.debugLineNum = 104333313;BA.debugLine="Return pnl_bk.Height";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight();
RDebugUtils.currentLine=104333314;
 //BA.debugLineNum = 104333314;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(ir.parsikhesab.pakhsh.cls_reckalalisti __ref,anywheresoftware.b4a.BA _ba,Object _mdl) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cls_reckalalisti";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_mdl}));}
int _btnchangeprice = 0;
int _btndiscount = 0;
RDebugUtils.currentLine=104202240;
 //BA.debugLineNum = 104202240;BA.debugLine="Public Sub Initialize(mdl As Object)";
RDebugUtils.currentLine=104202241;
 //BA.debugLineNum = 104202241;BA.debugLine="base = mdl";
__ref._base /*Object*/  = _mdl;
RDebugUtils.currentLine=104202242;
 //BA.debugLineNum = 104202242;BA.debugLine="Key.Initialize(\"Key\")";
__ref._key /*anywheresoftware.b4a.objects.IME*/ .Initialize("Key");
RDebugUtils.currentLine=104202243;
 //BA.debugLineNum = 104202243;BA.debugLine="p.Initialize(\"\")";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=104202244;
 //BA.debugLineNum = 104202244;BA.debugLine="p.SetLayout(0,0,100%x,100%y)";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .SetLayout((int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
RDebugUtils.currentLine=104202245;
 //BA.debugLineNum = 104202245;BA.debugLine="p.LoadLayout(\"L_RecKalaListi_2\")";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .LoadLayout("L_RecKalaListi_2",ba);
RDebugUtils.currentLine=104202247;
 //BA.debugLineNum = 104202247;BA.debugLine="Dim btnChangePrice As Int=MCode.TaghirFeeKala";
_btnchangeprice = (int)(Double.parseDouble(_mcode._taghirfeekala /*String*/ ));
RDebugUtils.currentLine=104202248;
 //BA.debugLineNum = 104202248;BA.debugLine="If btnChangePrice=0 Then";
if (_btnchangeprice==0) { 
RDebugUtils.currentLine=104202249;
 //BA.debugLineNum = 104202249;BA.debugLine="btn_edit_Price.Visible=False";
__ref._btn_edit_price /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
 }else {
RDebugUtils.currentLine=104202251;
 //BA.debugLineNum = 104202251;BA.debugLine="btn_edit_Price.Visible=True";
__ref._btn_edit_price /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.True);
 };
RDebugUtils.currentLine=104202254;
 //BA.debugLineNum = 104202254;BA.debugLine="Dim btndiscount As Int=MCode.TakhfifKala";
_btndiscount = (int)(Double.parseDouble(_mcode._takhfifkala /*String*/ ));
RDebugUtils.currentLine=104202255;
 //BA.debugLineNum = 104202255;BA.debugLine="If btndiscount=0 Then";
if (_btndiscount==0) { 
RDebugUtils.currentLine=104202256;
 //BA.debugLineNum = 104202256;BA.debugLine="btn_discount.Visible=False";
__ref._btn_discount /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
 }else {
RDebugUtils.currentLine=104202258;
 //BA.debugLineNum = 104202258;BA.debugLine="btn_discount.Visible=True";
__ref._btn_discount /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.True);
 };
RDebugUtils.currentLine=104202260;
 //BA.debugLineNum = 104202260;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _getpanel(ir.parsikhesab.pakhsh.cls_reckalalisti __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_reckalalisti";
if (Debug.shouldDelegate(ba, "getpanel", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "getpanel", null));}
RDebugUtils.currentLine=104267776;
 //BA.debugLineNum = 104267776;BA.debugLine="Public Sub getPanel As Panel";
RDebugUtils.currentLine=104267777;
 //BA.debugLineNum = 104267777;BA.debugLine="pnl_bk.RemoveView";
__ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .RemoveView();
RDebugUtils.currentLine=104267778;
 //BA.debugLineNum = 104267778;BA.debugLine="Return pnl_bk";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ ;
RDebugUtils.currentLine=104267779;
 //BA.debugLineNum = 104267779;BA.debugLine="End Sub";
return null;
}
public String  _addeshantion(ir.parsikhesab.pakhsh.cls_reckalalisti __ref,int _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_reckalalisti";
if (Debug.shouldDelegate(ba, "addeshantion", false))
	 {return ((String) Debug.delegate(ba, "addeshantion", new Object[] {_t}));}
RDebugUtils.currentLine=104660992;
 //BA.debugLineNum = 104660992;BA.debugLine="Sub AddEshantion(t As Int)";
RDebugUtils.currentLine=104661021;
 //BA.debugLineNum = 104661021;BA.debugLine="End Sub";
return "";
}
public String  _addtosabad(ir.parsikhesab.pakhsh.cls_reckalalisti __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_reckalalisti";
if (Debug.shouldDelegate(ba, "addtosabad", false))
	 {return ((String) Debug.delegate(ba, "addtosabad", null));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
boolean _check = false;
int _i = 0;
RDebugUtils.currentLine=104923136;
 //BA.debugLineNum = 104923136;BA.debugLine="Sub AddToSabad";
RDebugUtils.currentLine=104923138;
 //BA.debugLineNum = 104923138;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From Tb";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = _mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (ba,"Select * From TblSabad");
RDebugUtils.currentLine=104923139;
 //BA.debugLineNum = 104923139;BA.debugLine="Dim Check As Boolean";
_check = false;
RDebugUtils.currentLine=104923140;
 //BA.debugLineNum = 104923140;BA.debugLine="For i=0 To Cu.RowCount -1";
{
final int step3 = 1;
final int limit3 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=104923141;
 //BA.debugLineNum = 104923141;BA.debugLine="Cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=104923142;
 //BA.debugLineNum = 104923142;BA.debugLine="If Cu.GetString(\"FldCodeKala\") = Item.CodeKala T";
if ((_cu.GetString("FldCodeKala")).equals(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .CodeKala /*String*/ )) { 
RDebugUtils.currentLine=104923143;
 //BA.debugLineNum = 104923143;BA.debugLine="If Item.TedadDarSabadJoz = 0 And Item.TedadDarS";
if ((__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadJoz /*String*/ ).equals(BA.NumberToString(0)) && (__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadKol /*String*/ ).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=104923144;
 //BA.debugLineNum = 104923144;BA.debugLine="MCode.SaveUpdate(\"Delete From TblSabad Where F";
_mcode._saveupdate /*String*/ (ba,"Delete From TblSabad Where FldCodeKala = '"+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .CodeKala /*String*/ +"'");
 }else {
RDebugUtils.currentLine=104923146;
 //BA.debugLineNum = 104923146;BA.debugLine="MCode.SaveUpdate(\"Update TblSabad Set FldTedad";
_mcode._saveupdate /*String*/ (ba,"Update TblSabad Set FldTedadDarSabadJoz = '"+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadJoz /*String*/ +"',FldTedadDarSabadKol = '"+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadKol /*String*/ +"',FldEshantion = '"+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FldEshantion /*String*/ +"' Where FldCodeKala = '"+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .CodeKala /*String*/ +"'");
 };
RDebugUtils.currentLine=104923149;
 //BA.debugLineNum = 104923149;BA.debugLine="Check = True";
_check = __c.True;
RDebugUtils.currentLine=104923150;
 //BA.debugLineNum = 104923150;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=104923153;
 //BA.debugLineNum = 104923153;BA.debugLine="If Check = False Then";
if (_check==__c.False) { 
RDebugUtils.currentLine=104923154;
 //BA.debugLineNum = 104923154;BA.debugLine="MCode.AddToSabad(Item)";
_mcode._addtosabad /*String*/ (ba,__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ );
 };
RDebugUtils.currentLine=104923156;
 //BA.debugLineNum = 104923156;BA.debugLine="CallSubDelayed(base,\"RefreshLblSabad\")";
__c.CallSubDelayed(ba,__ref._base /*Object*/ ,"RefreshLblSabad");
RDebugUtils.currentLine=104923158;
 //BA.debugLineNum = 104923158;BA.debugLine="End Sub";
return "";
}
public String  _btn_call_click(ir.parsikhesab.pakhsh.cls_reckalalisti __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_reckalalisti";
if (Debug.shouldDelegate(ba, "btn_call_click", false))
	 {return ((String) Debug.delegate(ba, "btn_call_click", null));}
String _str = "";
RDebugUtils.currentLine=104529920;
 //BA.debugLineNum = 104529920;BA.debugLine="Sub Btn_call_Click";
RDebugUtils.currentLine=104529921;
 //BA.debugLineNum = 104529921;BA.debugLine="Dim str As String=$\"جهت دریافت قیمت همکار لطفا با";
_str = ("جهت دریافت قیمت همکار لطفا با شماره\n"+"		 021-888821546 \n"+"		 تماس بگیرید");
RDebugUtils.currentLine=104529924;
 //BA.debugLineNum = 104529924;BA.debugLine="Msgbox(str,\"قیمت همکاری\")";
__c.Msgbox(BA.ObjectToCharSequence(_str),BA.ObjectToCharSequence("قیمت همکاری"),ba);
RDebugUtils.currentLine=104529925;
 //BA.debugLineNum = 104529925;BA.debugLine="End Sub";
return "";
}
public String  _btn_discount_click(ir.parsikhesab.pakhsh.cls_reckalalisti __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_reckalalisti";
if (Debug.shouldDelegate(ba, "btn_discount_click", false))
	 {return ((String) Debug.delegate(ba, "btn_discount_click", null));}
RDebugUtils.currentLine=105578496;
 //BA.debugLineNum = 105578496;BA.debugLine="Sub btn_discount_Click";
RDebugUtils.currentLine=105578497;
 //BA.debugLineNum = 105578497;BA.debugLine="If MCode.TakhfifKala=1 Then";
if ((_mcode._takhfifkala /*String*/ ).equals(BA.NumberToString(1))) { 
RDebugUtils.currentLine=105578498;
 //BA.debugLineNum = 105578498;BA.debugLine="CallSubDelayed2(base,\"btn_discount_Click\",Item)";
__c.CallSubDelayed2(ba,__ref._base /*Object*/ ,"btn_discount_Click",(Object)(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ ));
 };
RDebugUtils.currentLine=105578500;
 //BA.debugLineNum = 105578500;BA.debugLine="End Sub";
return "";
}
public String  _btn_edit_price_click(ir.parsikhesab.pakhsh.cls_reckalalisti __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_reckalalisti";
if (Debug.shouldDelegate(ba, "btn_edit_price_click", false))
	 {return ((String) Debug.delegate(ba, "btn_edit_price_click", null));}
RDebugUtils.currentLine=105447424;
 //BA.debugLineNum = 105447424;BA.debugLine="Sub btn_edit_Price_Click";
RDebugUtils.currentLine=105447425;
 //BA.debugLineNum = 105447425;BA.debugLine="CallSubDelayed2(base,\"btn_edit_Price_Click\",Item)";
__c.CallSubDelayed2(ba,__ref._base /*Object*/ ,"btn_edit_Price_Click",(Object)(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ ));
RDebugUtils.currentLine=105447426;
 //BA.debugLineNum = 105447426;BA.debugLine="End Sub";
return "";
}
public String  _btndowneshan_click(ir.parsikhesab.pakhsh.cls_reckalalisti __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_reckalalisti";
if (Debug.shouldDelegate(ba, "btndowneshan_click", false))
	 {return ((String) Debug.delegate(ba, "btndowneshan_click", null));}
int _a = 0;
RDebugUtils.currentLine=105381888;
 //BA.debugLineNum = 105381888;BA.debugLine="Sub BtnDownEshan_Click";
RDebugUtils.currentLine=105381889;
 //BA.debugLineNum = 105381889;BA.debugLine="Dim A As Int = 0";
_a = (int) (0);
RDebugUtils.currentLine=105381890;
 //BA.debugLineNum = 105381890;BA.debugLine="A = Item.FldEshantion";
_a = (int)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FldEshantion /*String*/ ));
RDebugUtils.currentLine=105381891;
 //BA.debugLineNum = 105381891;BA.debugLine="If A > 0 Then";
if (_a>0) { 
RDebugUtils.currentLine=105381892;
 //BA.debugLineNum = 105381892;BA.debugLine="A = A - 1";
_a = (int) (_a-1);
RDebugUtils.currentLine=105381893;
 //BA.debugLineNum = 105381893;BA.debugLine="Item.SumMande = Item.SumMande + 1";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/  = BA.NumberToString((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/ ))+1);
RDebugUtils.currentLine=105381894;
 //BA.debugLineNum = 105381894;BA.debugLine="Item.FldEshantion  = A";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FldEshantion /*String*/  = BA.NumberToString(_a);
 };
RDebugUtils.currentLine=105381896;
 //BA.debugLineNum = 105381896;BA.debugLine="AddToSabad";
__ref._addtosabad /*String*/ (null);
RDebugUtils.currentLine=105381897;
 //BA.debugLineNum = 105381897;BA.debugLine="End Sub";
return "";
}
public String  _btndownjoz_click(ir.parsikhesab.pakhsh.cls_reckalalisti __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_reckalalisti";
if (Debug.shouldDelegate(ba, "btndownjoz_click", false))
	 {return ((String) Debug.delegate(ba, "btndownjoz_click", null));}
float _a = 0f;
float _val = 0f;
RDebugUtils.currentLine=104726528;
 //BA.debugLineNum = 104726528;BA.debugLine="Sub BtnDownJoz_Click";
RDebugUtils.currentLine=104726530;
 //BA.debugLineNum = 104726530;BA.debugLine="Dim A As Float = 0";
_a = (float) (0);
RDebugUtils.currentLine=104726531;
 //BA.debugLineNum = 104726531;BA.debugLine="Dim Val As Float = 0";
_val = (float) (0);
RDebugUtils.currentLine=104726532;
 //BA.debugLineNum = 104726532;BA.debugLine="Select Case MCode.isFloat";
switch (BA.switchObjectToInt(_mcode._isfloat /*boolean*/ ,__c.True,__c.False)) {
case 0: {
RDebugUtils.currentLine=104726534;
 //BA.debugLineNum = 104726534;BA.debugLine="Val = 0.25";
_val = (float) (0.25);
 break; }
case 1: {
RDebugUtils.currentLine=104726536;
 //BA.debugLineNum = 104726536;BA.debugLine="Val = 1";
_val = (float) (1);
 break; }
}
;
RDebugUtils.currentLine=104726539;
 //BA.debugLineNum = 104726539;BA.debugLine="A = Item.TedadDarSabadJoz";
_a = (float)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadJoz /*String*/ ));
RDebugUtils.currentLine=104726540;
 //BA.debugLineNum = 104726540;BA.debugLine="If A > 0 Then";
if (_a>0) { 
RDebugUtils.currentLine=104726541;
 //BA.debugLineNum = 104726541;BA.debugLine="A = A - Val";
_a = (float) (_a-_val);
RDebugUtils.currentLine=104726542;
 //BA.debugLineNum = 104726542;BA.debugLine="Item.SumMande = Item.SumMande + Val";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/  = BA.NumberToString((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/ ))+_val);
RDebugUtils.currentLine=104726543;
 //BA.debugLineNum = 104726543;BA.debugLine="Item.TedadDarSabadJoz = A";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadJoz /*String*/  = BA.NumberToString(_a);
 };
RDebugUtils.currentLine=104726545;
 //BA.debugLineNum = 104726545;BA.debugLine="AddEshantion(A)";
__ref._addeshantion /*String*/ (null,(int) (_a));
RDebugUtils.currentLine=104726546;
 //BA.debugLineNum = 104726546;BA.debugLine="AddToSabad";
__ref._addtosabad /*String*/ (null);
RDebugUtils.currentLine=104726547;
 //BA.debugLineNum = 104726547;BA.debugLine="End Sub";
return "";
}
public String  _btndownkol_click(ir.parsikhesab.pakhsh.cls_reckalalisti __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_reckalalisti";
if (Debug.shouldDelegate(ba, "btndownkol_click", false))
	 {return ((String) Debug.delegate(ba, "btndownkol_click", null));}
int _a = 0;
RDebugUtils.currentLine=104857600;
 //BA.debugLineNum = 104857600;BA.debugLine="Sub BtnDownKol_Click";
RDebugUtils.currentLine=104857601;
 //BA.debugLineNum = 104857601;BA.debugLine="Dim A As Int = 0";
_a = (int) (0);
RDebugUtils.currentLine=104857602;
 //BA.debugLineNum = 104857602;BA.debugLine="A = Item.TedadDarSabadKol";
_a = (int)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadKol /*String*/ ));
RDebugUtils.currentLine=104857603;
 //BA.debugLineNum = 104857603;BA.debugLine="If A > 0 Then";
if (_a>0) { 
RDebugUtils.currentLine=104857604;
 //BA.debugLineNum = 104857604;BA.debugLine="A = A - 1";
_a = (int) (_a-1);
RDebugUtils.currentLine=104857605;
 //BA.debugLineNum = 104857605;BA.debugLine="Item.SumMandeKarton = Item.SumMandeKarton + Item";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMandeKarton /*String*/  = BA.NumberToString((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMandeKarton /*String*/ ))+(double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadKol /*String*/ )));
RDebugUtils.currentLine=104857606;
 //BA.debugLineNum = 104857606;BA.debugLine="Item.TedadDarSabadKol = A";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadKol /*String*/  = BA.NumberToString(_a);
 };
RDebugUtils.currentLine=104857608;
 //BA.debugLineNum = 104857608;BA.debugLine="AddToSabad";
__ref._addtosabad /*String*/ (null);
RDebugUtils.currentLine=104857609;
 //BA.debugLineNum = 104857609;BA.debugLine="End Sub";
return "";
}
public String  _btnupeshan_click(ir.parsikhesab.pakhsh.cls_reckalalisti __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_reckalalisti";
if (Debug.shouldDelegate(ba, "btnupeshan_click", false))
	 {return ((String) Debug.delegate(ba, "btnupeshan_click", null));}
int _a = 0;
int _b = 0;
RDebugUtils.currentLine=105316352;
 //BA.debugLineNum = 105316352;BA.debugLine="Sub BtnUpEshan_Click";
RDebugUtils.currentLine=105316353;
 //BA.debugLineNum = 105316353;BA.debugLine="Dim A As Int = 0";
_a = (int) (0);
RDebugUtils.currentLine=105316354;
 //BA.debugLineNum = 105316354;BA.debugLine="Dim B As Int = 0";
_b = (int) (0);
RDebugUtils.currentLine=105316355;
 //BA.debugLineNum = 105316355;BA.debugLine="A = Item.FldEshantion";
_a = (int)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FldEshantion /*String*/ ));
RDebugUtils.currentLine=105316356;
 //BA.debugLineNum = 105316356;BA.debugLine="If MCode.ForooshBishAzMojoodi = \"1\" Then";
if ((_mcode._forooshbishazmojoodi /*String*/ ).equals("1")) { 
RDebugUtils.currentLine=105316357;
 //BA.debugLineNum = 105316357;BA.debugLine="If Item.FldEshantion<Item.fldCountEshantion Then";
if ((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FldEshantion /*String*/ ))<(double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldCountEshantion /*String*/ ))) { 
RDebugUtils.currentLine=105316358;
 //BA.debugLineNum = 105316358;BA.debugLine="A = A + 1";
_a = (int) (_a+1);
RDebugUtils.currentLine=105316359;
 //BA.debugLineNum = 105316359;BA.debugLine="Item.SumMande = Item.SumMande - 1";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/  = BA.NumberToString((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/ ))-1);
 };
 }else 
{RDebugUtils.currentLine=105316362;
 //BA.debugLineNum = 105316362;BA.debugLine="Else if MCode.ForooshBishAzMojoodi = \"0\" Then";
if ((_mcode._forooshbishazmojoodi /*String*/ ).equals("0")) { 
RDebugUtils.currentLine=105316363;
 //BA.debugLineNum = 105316363;BA.debugLine="B = Item.SumMande - ((Item.TedadDarSabadKol * It";
_b = (int) ((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/ ))-(((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadKol /*String*/ ))*(double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarKarton /*String*/ )))+(double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadJoz /*String*/ ))+(double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FldEshantion /*String*/ ))));
RDebugUtils.currentLine=105316364;
 //BA.debugLineNum = 105316364;BA.debugLine="If B > 0 Then";
if (_b>0) { 
RDebugUtils.currentLine=105316365;
 //BA.debugLineNum = 105316365;BA.debugLine="If Item.FldEshantion<Item.fldCountEshantion The";
if ((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FldEshantion /*String*/ ))<(double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldCountEshantion /*String*/ ))) { 
RDebugUtils.currentLine=105316366;
 //BA.debugLineNum = 105316366;BA.debugLine="A = A + 1";
_a = (int) (_a+1);
RDebugUtils.currentLine=105316367;
 //BA.debugLineNum = 105316367;BA.debugLine="Item.SumMande = Item.SumMande - 1";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/  = BA.NumberToString((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/ ))-1);
 };
 }else {
RDebugUtils.currentLine=105316370;
 //BA.debugLineNum = 105316370;BA.debugLine="ToastMessageShow(\"سفارش شما بیشتر از موجودی می";
__c.ToastMessageShow(BA.ObjectToCharSequence("سفارش شما بیشتر از موجودی می باشد"),__c.True);
 };
 }}
;
RDebugUtils.currentLine=105316373;
 //BA.debugLineNum = 105316373;BA.debugLine="Item.FldEshantion = A";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FldEshantion /*String*/  = BA.NumberToString(_a);
RDebugUtils.currentLine=105316374;
 //BA.debugLineNum = 105316374;BA.debugLine="AddToSabad";
__ref._addtosabad /*String*/ (null);
RDebugUtils.currentLine=105316375;
 //BA.debugLineNum = 105316375;BA.debugLine="End Sub";
return "";
}
public String  _btnupjoz_click(ir.parsikhesab.pakhsh.cls_reckalalisti __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_reckalalisti";
if (Debug.shouldDelegate(ba, "btnupjoz_click", false))
	 {return ((String) Debug.delegate(ba, "btnupjoz_click", null));}
float _a = 0f;
float _val = 0f;
RDebugUtils.currentLine=104595456;
 //BA.debugLineNum = 104595456;BA.debugLine="Sub BtnUpJoz_Click";
RDebugUtils.currentLine=104595457;
 //BA.debugLineNum = 104595457;BA.debugLine="Dim A As Float = 0";
_a = (float) (0);
RDebugUtils.currentLine=104595458;
 //BA.debugLineNum = 104595458;BA.debugLine="Dim Val As Float = 0";
_val = (float) (0);
RDebugUtils.currentLine=104595459;
 //BA.debugLineNum = 104595459;BA.debugLine="Select Case MCode.isFloat";
switch (BA.switchObjectToInt(_mcode._isfloat /*boolean*/ ,__c.True,__c.False)) {
case 0: {
RDebugUtils.currentLine=104595461;
 //BA.debugLineNum = 104595461;BA.debugLine="Val = 0.25";
_val = (float) (0.25);
 break; }
case 1: {
RDebugUtils.currentLine=104595463;
 //BA.debugLineNum = 104595463;BA.debugLine="Val = 1";
_val = (float) (1);
 break; }
}
;
RDebugUtils.currentLine=104595465;
 //BA.debugLineNum = 104595465;BA.debugLine="If	Item.TedadDarSabadJoz=Null Then";
if (__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadJoz /*String*/ == null) { 
RDebugUtils.currentLine=104595466;
 //BA.debugLineNum = 104595466;BA.debugLine="Item.TedadDarSabadJoz=0";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadJoz /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=104595467;
 //BA.debugLineNum = 104595467;BA.debugLine="LblTedadJoz.Text=0";
__ref._lbltedadjoz /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(0));
 };
RDebugUtils.currentLine=104595470;
 //BA.debugLineNum = 104595470;BA.debugLine="A = Item.TedadDarSabadJoz";
_a = (float)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadJoz /*String*/ ));
RDebugUtils.currentLine=104595471;
 //BA.debugLineNum = 104595471;BA.debugLine="If MCode.ForooshBishAzMojoodi = \"1\" Then";
if ((_mcode._forooshbishazmojoodi /*String*/ ).equals("1")) { 
RDebugUtils.currentLine=104595472;
 //BA.debugLineNum = 104595472;BA.debugLine="A = A + Val";
_a = (float) (_a+_val);
RDebugUtils.currentLine=104595473;
 //BA.debugLineNum = 104595473;BA.debugLine="Item.SumMande = Item.SumMande - Val";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/  = BA.NumberToString((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/ ))-_val);
 }else 
{RDebugUtils.currentLine=104595474;
 //BA.debugLineNum = 104595474;BA.debugLine="Else if MCode.ForooshBishAzMojoodi = \"0\" Then";
if ((_mcode._forooshbishazmojoodi /*String*/ ).equals("0")) { 
RDebugUtils.currentLine=104595475;
 //BA.debugLineNum = 104595475;BA.debugLine="If MCode.Action=\"SabtMarjooii\" Then";
if ((_mcode._action /*String*/ ).equals("SabtMarjooii")) { 
RDebugUtils.currentLine=104595476;
 //BA.debugLineNum = 104595476;BA.debugLine="A = A + Val";
_a = (float) (_a+_val);
RDebugUtils.currentLine=104595477;
 //BA.debugLineNum = 104595477;BA.debugLine="Item.SumMande = Item.SumMande - Val";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/  = BA.NumberToString((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/ ))-_val);
 }else {
RDebugUtils.currentLine=104595479;
 //BA.debugLineNum = 104595479;BA.debugLine="If Item.SumMande > 0 Then";
if ((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/ ))>0) { 
RDebugUtils.currentLine=104595480;
 //BA.debugLineNum = 104595480;BA.debugLine="A = A + Val";
_a = (float) (_a+_val);
RDebugUtils.currentLine=104595481;
 //BA.debugLineNum = 104595481;BA.debugLine="Item.SumMande = Item.SumMande - Val";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/  = BA.NumberToString((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/ ))-_val);
 }else {
RDebugUtils.currentLine=104595483;
 //BA.debugLineNum = 104595483;BA.debugLine="ToastMessageShow(\"سفارش شما بیشتر از موجودی می";
__c.ToastMessageShow(BA.ObjectToCharSequence("سفارش شما بیشتر از موجودی می باشد"),__c.True);
 };
 };
 }}
;
RDebugUtils.currentLine=104595487;
 //BA.debugLineNum = 104595487;BA.debugLine="Item.TedadDarSabadJoz = A";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadJoz /*String*/  = BA.NumberToString(_a);
RDebugUtils.currentLine=104595488;
 //BA.debugLineNum = 104595488;BA.debugLine="AddEshantion(A)";
__ref._addeshantion /*String*/ (null,(int) (_a));
RDebugUtils.currentLine=104595489;
 //BA.debugLineNum = 104595489;BA.debugLine="AddToSabad";
__ref._addtosabad /*String*/ (null);
RDebugUtils.currentLine=104595490;
 //BA.debugLineNum = 104595490;BA.debugLine="End Sub";
return "";
}
public String  _btnupkol_click(ir.parsikhesab.pakhsh.cls_reckalalisti __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_reckalalisti";
if (Debug.shouldDelegate(ba, "btnupkol_click", false))
	 {return ((String) Debug.delegate(ba, "btnupkol_click", null));}
int _a = 0;
float _val = 0f;
RDebugUtils.currentLine=104792064;
 //BA.debugLineNum = 104792064;BA.debugLine="Sub BtnUpKol_Click";
RDebugUtils.currentLine=104792065;
 //BA.debugLineNum = 104792065;BA.debugLine="If Item.TedadDarKarton=0 Then";
if ((__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarKarton /*String*/ ).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=104792066;
 //BA.debugLineNum = 104792066;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=104792068;
 //BA.debugLineNum = 104792068;BA.debugLine="Dim A As Int = 0";
_a = (int) (0);
RDebugUtils.currentLine=104792069;
 //BA.debugLineNum = 104792069;BA.debugLine="Dim Val As Float = 1";
_val = (float) (1);
RDebugUtils.currentLine=104792070;
 //BA.debugLineNum = 104792070;BA.debugLine="A = Item.TedadDarSabadKol";
_a = (int)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadKol /*String*/ ));
RDebugUtils.currentLine=104792071;
 //BA.debugLineNum = 104792071;BA.debugLine="If MCode.ForooshBishAzMojoodi = \"1\" Then";
if ((_mcode._forooshbishazmojoodi /*String*/ ).equals("1")) { 
RDebugUtils.currentLine=104792072;
 //BA.debugLineNum = 104792072;BA.debugLine="A = A + 1";
_a = (int) (_a+1);
RDebugUtils.currentLine=104792073;
 //BA.debugLineNum = 104792073;BA.debugLine="Item.SumMandeKarton = Item.SumMandeKarton - A";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMandeKarton /*String*/  = BA.NumberToString((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMandeKarton /*String*/ ))-_a);
 }else 
{RDebugUtils.currentLine=104792074;
 //BA.debugLineNum = 104792074;BA.debugLine="Else if MCode.ForooshBishAzMojoodi = \"0\" Then";
if ((_mcode._forooshbishazmojoodi /*String*/ ).equals("0")) { 
RDebugUtils.currentLine=104792075;
 //BA.debugLineNum = 104792075;BA.debugLine="If MCode.Action=\"SabtMarjooii\" Then";
if ((_mcode._action /*String*/ ).equals("SabtMarjooii")) { 
RDebugUtils.currentLine=104792076;
 //BA.debugLineNum = 104792076;BA.debugLine="A = A + 1";
_a = (int) (_a+1);
RDebugUtils.currentLine=104792077;
 //BA.debugLineNum = 104792077;BA.debugLine="Item.SumMandeKarton = Item.SumMandeKarton - Val";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMandeKarton /*String*/  = BA.NumberToString((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMandeKarton /*String*/ ))-_val);
 }else {
RDebugUtils.currentLine=104792079;
 //BA.debugLineNum = 104792079;BA.debugLine="If Item.SumMandeKarton >= Item.TedadDarSabadKol";
if ((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMandeKarton /*String*/ ))>=(double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadKol /*String*/ ))) { 
RDebugUtils.currentLine=104792080;
 //BA.debugLineNum = 104792080;BA.debugLine="A = A + 1";
_a = (int) (_a+1);
RDebugUtils.currentLine=104792081;
 //BA.debugLineNum = 104792081;BA.debugLine="Item.SumMandeKarton = Item.SumMandeKarton - Va";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMandeKarton /*String*/  = BA.NumberToString((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMandeKarton /*String*/ ))-_val);
 }else {
RDebugUtils.currentLine=104792083;
 //BA.debugLineNum = 104792083;BA.debugLine="ToastMessageShow(\"سفارش شما بیشتر از موجودی می";
__c.ToastMessageShow(BA.ObjectToCharSequence("سفارش شما بیشتر از موجودی می باشد"),__c.True);
 };
 };
 }}
;
RDebugUtils.currentLine=104792088;
 //BA.debugLineNum = 104792088;BA.debugLine="Item.TedadDarSabadKol = A";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadKol /*String*/  = BA.NumberToString(_a);
RDebugUtils.currentLine=104792089;
 //BA.debugLineNum = 104792089;BA.debugLine="AddToSabad";
__ref._addtosabad /*String*/ (null);
RDebugUtils.currentLine=104792090;
 //BA.debugLineNum = 104792090;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(ir.parsikhesab.pakhsh.cls_reckalalisti __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_reckalalisti";
RDebugUtils.currentLine=104136704;
 //BA.debugLineNum = 104136704;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=104136705;
 //BA.debugLineNum = 104136705;BA.debugLine="Private p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=104136706;
 //BA.debugLineNum = 104136706;BA.debugLine="Private pnl_bk As Panel";
_pnl_bk = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=104136708;
 //BA.debugLineNum = 104136708;BA.debugLine="Private ImageOff As ImageView";
_imageoff = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=104136709;
 //BA.debugLineNum = 104136709;BA.debugLine="Private LblGift As Label";
_lblgift = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=104136710;
 //BA.debugLineNum = 104136710;BA.debugLine="Private lbl_title As Label";
_lbl_title = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=104136711;
 //BA.debugLineNum = 104136711;BA.debugLine="Private ImageCall As ImageView";
_imagecall = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=104136712;
 //BA.debugLineNum = 104136712;BA.debugLine="Private LblFee As Label";
_lblfee = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=104136713;
 //BA.debugLineNum = 104136713;BA.debugLine="Private LblFeeBadAzTakhfid As Label";
_lblfeebadaztakhfid = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=104136714;
 //BA.debugLineNum = 104136714;BA.debugLine="Private LblC_Kala As Label";
_lblc_kala = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=104136715;
 //BA.debugLineNum = 104136715;BA.debugLine="Private LblTozihat As Label";
_lbltozihat = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=104136716;
 //BA.debugLineNum = 104136716;BA.debugLine="Private LblMojoodiJoz As Label";
_lblmojoodijoz = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=104136717;
 //BA.debugLineNum = 104136717;BA.debugLine="Private LblMojoodiKol As Label";
_lblmojoodikol = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=104136718;
 //BA.debugLineNum = 104136718;BA.debugLine="Private LblTedadKarton As Label";
_lbltedadkarton = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=104136719;
 //BA.debugLineNum = 104136719;BA.debugLine="Private BtnUpJoz As Label";
_btnupjoz = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=104136720;
 //BA.debugLineNum = 104136720;BA.debugLine="Private LblTedadJoz As Label";
_lbltedadjoz = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=104136721;
 //BA.debugLineNum = 104136721;BA.debugLine="Private BtnDownJoz As Label";
_btndownjoz = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=104136722;
 //BA.debugLineNum = 104136722;BA.debugLine="Private BtnDownKol As Label";
_btndownkol = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=104136723;
 //BA.debugLineNum = 104136723;BA.debugLine="Private LblTedadkol As Label";
_lbltedadkol = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=104136724;
 //BA.debugLineNum = 104136724;BA.debugLine="Private BtnUpKol As Label";
_btnupkol = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=104136725;
 //BA.debugLineNum = 104136725;BA.debugLine="Private Item As AdapterListKala";
_item = new ir.parsikhesab.pakhsh.mcode._adapterlistkala();
RDebugUtils.currentLine=104136726;
 //BA.debugLineNum = 104136726;BA.debugLine="Private Key As IME";
_key = new anywheresoftware.b4a.objects.IME();
RDebugUtils.currentLine=104136727;
 //BA.debugLineNum = 104136727;BA.debugLine="Private base As Object";
_base = new Object();
RDebugUtils.currentLine=104136728;
 //BA.debugLineNum = 104136728;BA.debugLine="Private BtnDownEshan As Label";
_btndowneshan = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=104136729;
 //BA.debugLineNum = 104136729;BA.debugLine="Private BtnUpEshan As Label";
_btnupeshan = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=104136730;
 //BA.debugLineNum = 104136730;BA.debugLine="Private LblTedadEshan As Label";
_lbltedadeshan = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=104136731;
 //BA.debugLineNum = 104136731;BA.debugLine="Private lblVahedJoz As Label";
_lblvahedjoz = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=104136732;
 //BA.debugLineNum = 104136732;BA.debugLine="Private lblVahedKol As Label";
_lblvahedkol = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=104136735;
 //BA.debugLineNum = 104136735;BA.debugLine="Private btn_edit_Price As Label";
_btn_edit_price = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=104136736;
 //BA.debugLineNum = 104136736;BA.debugLine="Dim maxkolRond As Long";
_maxkolrond = 0L;
RDebugUtils.currentLine=104136737;
 //BA.debugLineNum = 104136737;BA.debugLine="Private LblCountEshantion As Label";
_lblcounteshantion = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=104136738;
 //BA.debugLineNum = 104136738;BA.debugLine="Private btn_discount As Label";
_btn_discount = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=104136739;
 //BA.debugLineNum = 104136739;BA.debugLine="Private LblMablaghTakhfif As Label";
_lblmablaghtakhfif = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=104136740;
 //BA.debugLineNum = 104136740;BA.debugLine="Private LblMablaghMasrafkonande As Label";
_lblmablaghmasrafkonande = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=104136741;
 //BA.debugLineNum = 104136741;BA.debugLine="Private lblSumMablaghKala As Label";
_lblsummablaghkala = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=104136742;
 //BA.debugLineNum = 104136742;BA.debugLine="End Sub";
return "";
}
public byte[]  _getbytefrombitmap(ir.parsikhesab.pakhsh.cls_reckalalisti __ref,anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _img,int _quality) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_reckalalisti";
if (Debug.shouldDelegate(ba, "getbytefrombitmap", false))
	 {return ((byte[]) Debug.delegate(ba, "getbytefrombitmap", new Object[] {_img,_quality}));}
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
byte[] _data = null;
RDebugUtils.currentLine=105250816;
 //BA.debugLineNum = 105250816;BA.debugLine="Sub GetByteFromBitmap(img As Bitmap, Quality As In";
RDebugUtils.currentLine=105250817;
 //BA.debugLineNum = 105250817;BA.debugLine="Dim out As OutputStream";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=105250818;
 //BA.debugLineNum = 105250818;BA.debugLine="Dim data() As Byte";
_data = new byte[(int) (0)];
;
RDebugUtils.currentLine=105250819;
 //BA.debugLineNum = 105250819;BA.debugLine="out.InitializeToBytesArray(1)";
_out.InitializeToBytesArray((int) (1));
RDebugUtils.currentLine=105250820;
 //BA.debugLineNum = 105250820;BA.debugLine="img.WriteToStream(out,Quality,\"JPEG\")";
_img.WriteToStream((java.io.OutputStream)(_out.getObject()),_quality,BA.getEnumFromString(android.graphics.Bitmap.CompressFormat.class,"JPEG"));
RDebugUtils.currentLine=105250821;
 //BA.debugLineNum = 105250821;BA.debugLine="data = out.ToBytesArray";
_data = _out.ToBytesArray();
RDebugUtils.currentLine=105250822;
 //BA.debugLineNum = 105250822;BA.debugLine="out.Close";
_out.Close();
RDebugUtils.currentLine=105250823;
 //BA.debugLineNum = 105250823;BA.debugLine="Return data";
if (true) return _data;
RDebugUtils.currentLine=105250824;
 //BA.debugLineNum = 105250824;BA.debugLine="End Sub";
return null;
}
public String  _getfilename(ir.parsikhesab.pakhsh.cls_reckalalisti __ref,String _fullpath) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_reckalalisti";
if (Debug.shouldDelegate(ba, "getfilename", false))
	 {return ((String) Debug.delegate(ba, "getfilename", new Object[] {_fullpath}));}
String _res = "";
RDebugUtils.currentLine=105119744;
 //BA.debugLineNum = 105119744;BA.debugLine="Sub GetFilename(fullpath As String) As String";
RDebugUtils.currentLine=105119745;
 //BA.debugLineNum = 105119745;BA.debugLine="Dim res As String";
_res = "";
RDebugUtils.currentLine=105119746;
 //BA.debugLineNum = 105119746;BA.debugLine="res = fullpath.SubString(fullpath.LastIndexOf(\"/\"";
_res = _fullpath.substring((int) (_fullpath.lastIndexOf("/")+1));
RDebugUtils.currentLine=105119747;
 //BA.debugLineNum = 105119747;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=105119748;
 //BA.debugLineNum = 105119748;BA.debugLine="End Sub";
return "";
}
public String  _lbltedadjoz_click(ir.parsikhesab.pakhsh.cls_reckalalisti __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_reckalalisti";
if (Debug.shouldDelegate(ba, "lbltedadjoz_click", false))
	 {return ((String) Debug.delegate(ba, "lbltedadjoz_click", null));}
RDebugUtils.currentLine=104988672;
 //BA.debugLineNum = 104988672;BA.debugLine="Sub LblTedadJoz_Click";
RDebugUtils.currentLine=104988673;
 //BA.debugLineNum = 104988673;BA.debugLine="CallSubDelayed2(base,\"LblTedadJoz_Click\",Item)";
__c.CallSubDelayed2(ba,__ref._base /*Object*/ ,"LblTedadJoz_Click",(Object)(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ ));
RDebugUtils.currentLine=104988674;
 //BA.debugLineNum = 104988674;BA.debugLine="End Sub";
return "";
}
public String  _lbltedadkol_click(ir.parsikhesab.pakhsh.cls_reckalalisti __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_reckalalisti";
if (Debug.shouldDelegate(ba, "lbltedadkol_click", false))
	 {return ((String) Debug.delegate(ba, "lbltedadkol_click", null));}
RDebugUtils.currentLine=105054208;
 //BA.debugLineNum = 105054208;BA.debugLine="Sub LblTedadKol_Click";
RDebugUtils.currentLine=105054209;
 //BA.debugLineNum = 105054209;BA.debugLine="CallSubDelayed2(base,\"LblTedadKol_Click\",Item)";
__c.CallSubDelayed2(ba,__ref._base /*Object*/ ,"LblTedadKol_Click",(Object)(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ ));
RDebugUtils.currentLine=105054210;
 //BA.debugLineNum = 105054210;BA.debugLine="End Sub";
return "";
}
public String  _pnl_bk_click(ir.parsikhesab.pakhsh.cls_reckalalisti __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_reckalalisti";
if (Debug.shouldDelegate(ba, "pnl_bk_click", false))
	 {return ((String) Debug.delegate(ba, "pnl_bk_click", null));}
RDebugUtils.currentLine=105512960;
 //BA.debugLineNum = 105512960;BA.debugLine="Sub pnl_bk_Click";
RDebugUtils.currentLine=105512963;
 //BA.debugLineNum = 105512963;BA.debugLine="End Sub";
return "";
}
public String  _status(ir.parsikhesab.pakhsh.cls_reckalalisti __ref,boolean _enable) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_reckalalisti";
if (Debug.shouldDelegate(ba, "status", false))
	 {return ((String) Debug.delegate(ba, "status", new Object[] {_enable}));}
RDebugUtils.currentLine=104464384;
 //BA.debugLineNum = 104464384;BA.debugLine="Sub Status(Enable As Boolean)";
RDebugUtils.currentLine=104464385;
 //BA.debugLineNum = 104464385;BA.debugLine="LogColor(\"status: \"&Enable,Colors.Red)";
__c.LogImpl("5104464385","status: "+BA.ObjectToString(_enable),__c.Colors.Red);
RDebugUtils.currentLine=104464386;
 //BA.debugLineNum = 104464386;BA.debugLine="BtnDownEshan.Enabled=Enable";
__ref._btndowneshan /*anywheresoftware.b4a.objects.LabelWrapper*/ .setEnabled(_enable);
RDebugUtils.currentLine=104464387;
 //BA.debugLineNum = 104464387;BA.debugLine="BtnUpEshan.Enabled=Enable";
__ref._btnupeshan /*anywheresoftware.b4a.objects.LabelWrapper*/ .setEnabled(_enable);
RDebugUtils.currentLine=104464388;
 //BA.debugLineNum = 104464388;BA.debugLine="LblTedadEshan.Enabled=Enable";
__ref._lbltedadeshan /*anywheresoftware.b4a.objects.LabelWrapper*/ .setEnabled(_enable);
RDebugUtils.currentLine=104464390;
 //BA.debugLineNum = 104464390;BA.debugLine="BtnDownJoz.Enabled=Enable";
__ref._btndownjoz /*anywheresoftware.b4a.objects.LabelWrapper*/ .setEnabled(_enable);
RDebugUtils.currentLine=104464391;
 //BA.debugLineNum = 104464391;BA.debugLine="BtnUpJoz.Enabled=Enable";
__ref._btnupjoz /*anywheresoftware.b4a.objects.LabelWrapper*/ .setEnabled(_enable);
RDebugUtils.currentLine=104464392;
 //BA.debugLineNum = 104464392;BA.debugLine="LblTedadJoz.Enabled=Enable";
__ref._lbltedadjoz /*anywheresoftware.b4a.objects.LabelWrapper*/ .setEnabled(_enable);
RDebugUtils.currentLine=104464394;
 //BA.debugLineNum = 104464394;BA.debugLine="BtnDownKol.Enabled=Enable";
__ref._btndownkol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setEnabled(_enable);
RDebugUtils.currentLine=104464395;
 //BA.debugLineNum = 104464395;BA.debugLine="BtnUpKol.Enabled=Enable";
__ref._btnupkol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setEnabled(_enable);
RDebugUtils.currentLine=104464396;
 //BA.debugLineNum = 104464396;BA.debugLine="LblTedadkol.Enabled=Enable";
__ref._lbltedadkol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setEnabled(_enable);
RDebugUtils.currentLine=104464397;
 //BA.debugLineNum = 104464397;BA.debugLine="End Sub";
return "";
}
public String  _writebitmap2file(ir.parsikhesab.pakhsh.cls_reckalalisti __ref,anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _image,int _quality,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_reckalalisti";
if (Debug.shouldDelegate(ba, "writebitmap2file", false))
	 {return ((String) Debug.delegate(ba, "writebitmap2file", new Object[] {_image,_quality,_filename}));}
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
byte[] _data = null;
RDebugUtils.currentLine=105185280;
 //BA.debugLineNum = 105185280;BA.debugLine="Sub WriteBitmap2File(Image As Bitmap, Quality As I";
RDebugUtils.currentLine=105185281;
 //BA.debugLineNum = 105185281;BA.debugLine="Try";
try {RDebugUtils.currentLine=105185282;
 //BA.debugLineNum = 105185282;BA.debugLine="Dim out As OutputStream = File.OpenOutput(Starte";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = __c.File.OpenOutput(_starter._sharedfolder /*String*/ ,_filename,__c.False);
RDebugUtils.currentLine=105185283;
 //BA.debugLineNum = 105185283;BA.debugLine="Dim data() As Byte = GetByteFromBitmap(Image, Qu";
_data = __ref._getbytefrombitmap /*byte[]*/ (null,_image,_quality);
RDebugUtils.currentLine=105185284;
 //BA.debugLineNum = 105185284;BA.debugLine="out.WriteBytes(data, 0, data.Length)";
_out.WriteBytes(_data,(int) (0),_data.length);
 } 
       catch (Exception e6) {
			ba.setLastException(e6);RDebugUtils.currentLine=105185286;
 //BA.debugLineNum = 105185286;BA.debugLine="Log(DateTime.Date(DateTime.Now)&\"=\"&\"WriteBitmap";
__c.LogImpl("5105185286",__c.DateTime.Date(__c.DateTime.getNow())+"="+"WriteBitmap2File",0);
 };
RDebugUtils.currentLine=105185288;
 //BA.debugLineNum = 105185288;BA.debugLine="out.Close";
_out.Close();
RDebugUtils.currentLine=105185289;
 //BA.debugLineNum = 105185289;BA.debugLine="End Sub";
return "";
}
}