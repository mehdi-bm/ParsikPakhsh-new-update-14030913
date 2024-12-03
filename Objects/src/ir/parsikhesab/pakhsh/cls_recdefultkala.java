package ir.parsikhesab.pakhsh;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class cls_recdefultkala extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "ir.parsikhesab.pakhsh.cls_recdefultkala");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", ir.parsikhesab.pakhsh.cls_recdefultkala.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.LabelWrapper _lbl_title = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imagecall = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblfee = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblfeebadaztakhfid = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblc_kala = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imagetozihat = null;
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
public anywheresoftware.b4a.objects.LabelWrapper _lblbuyprice = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel4 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblgift = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltozihat = null;
public anywheresoftware.b4a.objects.LabelWrapper _btn_edit_price = null;
public String _maxkolrond = "";
public anywheresoftware.b4a.objects.LabelWrapper _lblcounteshantion = null;
public anywheresoftware.b4a.objects.LabelWrapper _btn_discount = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblmablaghtakhfif = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblmablaghmasrafkonande = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblsummablaghkala = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbldarsadtakhfif = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnljoz = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlkol = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnleshan = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblcodegroup = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblfeeyekkarton = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbldarsadarzeshafzodekala = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblarzeshafzodekala = null;
public de.amberhome.objects.appcompat.ACSwitchCompatWrapper _swdisablearzeshafzode = null;
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
public String  _initialize(ir.parsikhesab.pakhsh.cls_recdefultkala __ref,anywheresoftware.b4a.BA _ba,Object _mdl) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cls_recdefultkala";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_mdl}));}
int _btnchangeprice = 0;
int _btndiscount = 0;
RDebugUtils.currentLine=101384192;
 //BA.debugLineNum = 101384192;BA.debugLine="Public Sub Initialize(mdl As Object)";
RDebugUtils.currentLine=101384193;
 //BA.debugLineNum = 101384193;BA.debugLine="Try";
try {RDebugUtils.currentLine=101384194;
 //BA.debugLineNum = 101384194;BA.debugLine="base = mdl";
__ref._base /*Object*/  = _mdl;
RDebugUtils.currentLine=101384195;
 //BA.debugLineNum = 101384195;BA.debugLine="Key.Initialize(\"Key\")";
__ref._key /*anywheresoftware.b4a.objects.IME*/ .Initialize("Key");
RDebugUtils.currentLine=101384196;
 //BA.debugLineNum = 101384196;BA.debugLine="p.Initialize(\"\")";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=101384197;
 //BA.debugLineNum = 101384197;BA.debugLine="p.SetLayout(0,0,100%x,100%y)";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .SetLayout((int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
RDebugUtils.currentLine=101384198;
 //BA.debugLineNum = 101384198;BA.debugLine="p.LoadLayout(\"l_rechomeitem_2\")";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .LoadLayout("l_rechomeitem_2",ba);
RDebugUtils.currentLine=101384201;
 //BA.debugLineNum = 101384201;BA.debugLine="Dim btnChangePrice As Int=MCode.TaghirFeeKala";
_btnchangeprice = (int)(Double.parseDouble(_mcode._taghirfeekala /*String*/ ));
RDebugUtils.currentLine=101384202;
 //BA.debugLineNum = 101384202;BA.debugLine="If btnChangePrice=0 Then";
if (_btnchangeprice==0) { 
RDebugUtils.currentLine=101384203;
 //BA.debugLineNum = 101384203;BA.debugLine="btn_edit_Price.Visible=False";
__ref._btn_edit_price /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
 }else {
RDebugUtils.currentLine=101384205;
 //BA.debugLineNum = 101384205;BA.debugLine="btn_edit_Price.Visible=True";
__ref._btn_edit_price /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.True);
 };
RDebugUtils.currentLine=101384208;
 //BA.debugLineNum = 101384208;BA.debugLine="Dim btndiscount As Int=MCode.TakhfifKala";
_btndiscount = (int)(Double.parseDouble(_mcode._takhfifkala /*String*/ ));
RDebugUtils.currentLine=101384209;
 //BA.debugLineNum = 101384209;BA.debugLine="If btndiscount=0 Then";
if (_btndiscount==0) { 
RDebugUtils.currentLine=101384210;
 //BA.debugLineNum = 101384210;BA.debugLine="btn_discount.Visible=False";
__ref._btn_discount /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
 }else {
RDebugUtils.currentLine=101384212;
 //BA.debugLineNum = 101384212;BA.debugLine="btn_discount.Visible=True";
__ref._btn_discount /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.True);
 };
 } 
       catch (Exception e20) {
			ba.setLastException(e20);RDebugUtils.currentLine=101384216;
 //BA.debugLineNum = 101384216;BA.debugLine="MCode.SendError(LastException)";
_mcode._senderror /*String*/ (ba,BA.ObjectToString(__c.LastException(ba)));
RDebugUtils.currentLine=101384217;
 //BA.debugLineNum = 101384217;BA.debugLine="Log(LastException)";
__c.LogImpl("5101384217",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=101384219;
 //BA.debugLineNum = 101384219;BA.debugLine="End Sub";
return "";
}
public void  _show(ir.parsikhesab.pakhsh.cls_recdefultkala __ref,ir.parsikhesab.pakhsh.mcode._adapterlistkala _item1,int _position) throws Exception{
RDebugUtils.currentModule="cls_recdefultkala";
if (Debug.shouldDelegate(ba, "show", false))
	 {Debug.delegate(ba, "show", new Object[] {_item1,_position}); return;}
ResumableSub_Show rsub = new ResumableSub_Show(this,__ref,_item1,_position);
rsub.resume(ba, null);
}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(ir.parsikhesab.pakhsh.cls_recdefultkala parent,ir.parsikhesab.pakhsh.cls_recdefultkala __ref,ir.parsikhesab.pakhsh.mcode._adapterlistkala _item1,int _position) {
this.parent = parent;
this.__ref = __ref;
this._item1 = _item1;
this._position = _position;
this.__ref = parent;
}
ir.parsikhesab.pakhsh.cls_recdefultkala __ref;
ir.parsikhesab.pakhsh.cls_recdefultkala parent;
ir.parsikhesab.pakhsh.mcode._adapterlistkala _item1;
int _position;
anywheresoftware.b4a.objects.ImageViewWrapper _imagerow1 = null;
int _fee = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
String _tedadkol = "";
String _feekol = "";
long _price = 0L;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cls_recdefultkala";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=101580801;
 //BA.debugLineNum = 101580801;BA.debugLine="Item=Item1";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/  = _item1;
RDebugUtils.currentLine=101580802;
 //BA.debugLineNum = 101580802;BA.debugLine="Private ImageRow1 As ImageView";
_imagerow1 = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=101580803;
 //BA.debugLineNum = 101580803;BA.debugLine="ImageRow1.Initialize(\"\")";
_imagerow1.Initialize(ba,"");
RDebugUtils.currentLine=101580804;
 //BA.debugLineNum = 101580804;BA.debugLine="ImageRow1.Tag=position";
_imagerow1.setTag((Object)(_position));
RDebugUtils.currentLine=101580807;
 //BA.debugLineNum = 101580807;BA.debugLine="lbl_title.Text = Item.NameKala";
__ref._lbl_title /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .NameKala /*String*/ ));
RDebugUtils.currentLine=101580808;
 //BA.debugLineNum = 101580808;BA.debugLine="LblCodeGroup.Text = \"کد گروه: \" & Item.CodeGroup";
__ref._lblcodegroup /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("کد گروه: "+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .CodeGroup /*String*/ ));
RDebugUtils.currentLine=101580809;
 //BA.debugLineNum = 101580809;BA.debugLine="LblC_Kala.Text = \"کد کالا: \" & Item.CodeKala";
__ref._lblc_kala /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("کد کالا: "+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .CodeKala /*String*/ ));
RDebugUtils.currentLine=101580810;
 //BA.debugLineNum = 101580810;BA.debugLine="Dim fee As Int";
_fee = 0;
RDebugUtils.currentLine=101580812;
 //BA.debugLineNum = 101580812;BA.debugLine="fee=Item.FeeForoosh";
_fee = __ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FeeForoosh /*int*/ ;
RDebugUtils.currentLine=101580813;
 //BA.debugLineNum = 101580813;BA.debugLine="Dim cu As Cursor=MCode.Result(\"select * from TblS";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = parent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (ba,"select * from TblSabad where FldCodeKala="+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .CodeKala /*String*/ );
RDebugUtils.currentLine=101580814;
 //BA.debugLineNum = 101580814;BA.debugLine="cu.Position=0";
_cu.setPosition((int) (0));
RDebugUtils.currentLine=101580815;
 //BA.debugLineNum = 101580815;BA.debugLine="If cu.RowCount>0 Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_cu.getRowCount()>0) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=101580816;
 //BA.debugLineNum = 101580816;BA.debugLine="fee=cu.GetString(\"FldFeeForoosh\")";
_fee = (int)(Double.parseDouble(_cu.GetString("FldFeeForoosh")));
 if (true) break;
;
RDebugUtils.currentLine=101580855;
 //BA.debugLineNum = 101580855;BA.debugLine="If Item.MablaghTakhfif>0 Then";

case 4:
//if
this.state = 15;
if (__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .MablaghTakhfif /*int*/ >0) { 
this.state = 6;
}else {
this.state = 14;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=101580856;
 //BA.debugLineNum = 101580856;BA.debugLine="Dim tedadKol As String=myCode.Is_Null_adad(Item.";
_tedadkol = BA.NumberToString((double)(Double.parseDouble(parent._mycode._is_null_adad /*String*/ (ba,__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadJoz /*String*/ )))+((double)(Double.parseDouble(parent._mycode._is_null_adad /*String*/ (ba,__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadKol /*String*/ )))*(double)(Double.parseDouble(parent._mycode._is_null_adad /*String*/ (ba,__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarKarton /*String*/ )))));
RDebugUtils.currentLine=101580857;
 //BA.debugLineNum = 101580857;BA.debugLine="Dim FeeKol As String=(Item.FeeForoosh*tedadKol)";
_feekol = BA.NumberToString((__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FeeForoosh /*int*/ *(double)(Double.parseDouble(_tedadkol))));
RDebugUtils.currentLine=101580858;
 //BA.debugLineNum = 101580858;BA.debugLine="If tedadKol>0 Then";
if (true) break;

case 7:
//if
this.state = 12;
if ((double)(Double.parseDouble(_tedadkol))>0) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
RDebugUtils.currentLine=101580859;
 //BA.debugLineNum = 101580859;BA.debugLine="Item.MablaghTakhfif=(((Item.FeeForoosh*tedadKol";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .MablaghTakhfif /*int*/  = (int) ((((__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FeeForoosh /*int*/ *(double)(Double.parseDouble(_tedadkol)))*(double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldDarsadTakhfif /*String*/ )))/(double)100));
RDebugUtils.currentLine=101580860;
 //BA.debugLineNum = 101580860;BA.debugLine="Item.fldFeeBadAzTakhfif=FeeKol-Item.MablaghT";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldFeeBadAzTakhfif /*String*/  = BA.NumberToString((double)(Double.parseDouble(_feekol))-__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .MablaghTakhfif /*int*/ );
 if (true) break;

case 11:
//C
this.state = 12;
 if (true) break;

case 12:
//C
this.state = 15;
;
RDebugUtils.currentLine=101580864;
 //BA.debugLineNum = 101580864;BA.debugLine="LblMablaghTakhfif.Text=\"فی تخفیف: \"& myCode.Adad";
__ref._lblmablaghtakhfif /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("فی تخفیف: "+parent._mycode._adadtoprice /*String*/ (ba,parent._mycode._is_null_adad /*String*/ (ba,BA.NumberToString(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .MablaghTakhfif /*int*/ )))));
RDebugUtils.currentLine=101580865;
 //BA.debugLineNum = 101580865;BA.debugLine="LblMablaghTakhfif.TextColor=Colors.Red";
__ref._lblmablaghtakhfif /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(parent.__c.Colors.Red);
RDebugUtils.currentLine=101580866;
 //BA.debugLineNum = 101580866;BA.debugLine="lblDarsadTakhfif.TextColor=Colors.Red";
__ref._lbldarsadtakhfif /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(parent.__c.Colors.Red);
RDebugUtils.currentLine=101580867;
 //BA.debugLineNum = 101580867;BA.debugLine="LblMablaghTakhfif.Visible=True";
__ref._lblmablaghtakhfif /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(parent.__c.True);
RDebugUtils.currentLine=101580868;
 //BA.debugLineNum = 101580868;BA.debugLine="lblDarsadTakhfif.Visible=True";
__ref._lbldarsadtakhfif /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(parent.__c.True);
RDebugUtils.currentLine=101580869;
 //BA.debugLineNum = 101580869;BA.debugLine="lblDarsadTakhfif.Text=\"درصد تخفیف: %\"& myCode.Is";
__ref._lbldarsadtakhfif /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("درصد تخفیف: %"+parent._mycode._is_null_adad /*String*/ (ba,__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldDarsadTakhfif /*String*/ )));
 if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=101580871;
 //BA.debugLineNum = 101580871;BA.debugLine="lblDarsadTakhfif.Text=0";
__ref._lbldarsadtakhfif /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(0));
RDebugUtils.currentLine=101580872;
 //BA.debugLineNum = 101580872;BA.debugLine="LblMablaghTakhfif.Text=0";
__ref._lblmablaghtakhfif /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(0));
RDebugUtils.currentLine=101580873;
 //BA.debugLineNum = 101580873;BA.debugLine="LblMablaghTakhfif.Visible=False";
__ref._lblmablaghtakhfif /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(parent.__c.False);
RDebugUtils.currentLine=101580874;
 //BA.debugLineNum = 101580874;BA.debugLine="lblDarsadTakhfif.Visible=False";
__ref._lbldarsadtakhfif /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(parent.__c.False);
 if (true) break;

case 15:
//C
this.state = 16;
;
RDebugUtils.currentLine=101580878;
 //BA.debugLineNum = 101580878;BA.debugLine="Log(fee)";
parent.__c.LogImpl("5101580878",BA.NumberToString(_fee),0);
RDebugUtils.currentLine=101580879;
 //BA.debugLineNum = 101580879;BA.debugLine="If IsNumber(Item.FldFeeBadAzTakhfif) = True Then";
if (true) break;

case 16:
//if
this.state = 31;
if (parent.__c.IsNumber(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldFeeBadAzTakhfif /*String*/ )==parent.__c.True) { 
this.state = 18;
}else {
this.state = 30;
}if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=101580886;
 //BA.debugLineNum = 101580886;BA.debugLine="If Item.FldFeeBadAzTakhfif > 0 Then";
if (true) break;

case 19:
//if
this.state = 28;
if ((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldFeeBadAzTakhfif /*String*/ ))>0) { 
this.state = 21;
}else 
{RDebugUtils.currentLine=101580893;
 //BA.debugLineNum = 101580893;BA.debugLine="Else If Item.FldFeeBadAzTakhfif = 0 And myCode.I";
if ((__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldFeeBadAzTakhfif /*String*/ ).equals(BA.NumberToString(0)) && (parent._mycode._is_null_adad /*String*/ (ba,__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldDarsadTakhfif /*String*/ )).equals(BA.NumberToString(100))) { 
this.state = 23;
}else 
{RDebugUtils.currentLine=101580902;
 //BA.debugLineNum = 101580902;BA.debugLine="Else If Item.FldFeeBadAzTakhfif = 0 Then";
if ((__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldFeeBadAzTakhfif /*String*/ ).equals(BA.NumberToString(0))) { 
this.state = 25;
}else {
this.state = 27;
}}}
if (true) break;

case 21:
//C
this.state = 28;
RDebugUtils.currentLine=101580887;
 //BA.debugLineNum = 101580887;BA.debugLine="MCode.Rs.Initialize(\"فی فروش: \"& NumberFormat(m";
parent._mcode._rs /*anywheresoftware.b4a.agraham.richstring.RichStringBuilder.RichString*/ .Initialize(BA.ObjectToCharSequence("فی فروش: "+parent.__c.NumberFormat((double)(Double.parseDouble(parent._mycode._is_null_adad /*String*/ (ba,BA.NumberToString(_fee)))),(int) (1),(int) (3))+" "+parent._mcode._vahedpool /*String*/ ));
RDebugUtils.currentLine=101580888;
 //BA.debugLineNum = 101580888;BA.debugLine="MCode.Rs.Strikethrough (0, MCode.Rs.Length)";
parent._mcode._rs /*anywheresoftware.b4a.agraham.richstring.RichStringBuilder.RichString*/ .Strikethrough((int) (0),parent._mcode._rs /*anywheresoftware.b4a.agraham.richstring.RichStringBuilder.RichString*/ .getLength());
RDebugUtils.currentLine=101580889;
 //BA.debugLineNum = 101580889;BA.debugLine="MCode.Rs.Color(Colors.Red,0, MCode.Rs.Length)";
parent._mcode._rs /*anywheresoftware.b4a.agraham.richstring.RichStringBuilder.RichString*/ .Color(parent.__c.Colors.Red,(int) (0),parent._mcode._rs /*anywheresoftware.b4a.agraham.richstring.RichStringBuilder.RichString*/ .getLength());
RDebugUtils.currentLine=101580890;
 //BA.debugLineNum = 101580890;BA.debugLine="LblFee.Text = MCode.Rs";
__ref._lblfee /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(parent._mcode._rs /*anywheresoftware.b4a.agraham.richstring.RichStringBuilder.RichString*/ .getObject()));
RDebugUtils.currentLine=101580891;
 //BA.debugLineNum = 101580891;BA.debugLine="LblFeeBadAzTakhfid.Text =\"فی بعد از تخفیف: \"& N";
__ref._lblfeebadaztakhfid /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("فی بعد از تخفیف: "+parent.__c.NumberFormat((double)(Double.parseDouble(parent._mycode._is_null_adad /*String*/ (ba,__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldFeeBadAzTakhfif /*String*/ ))),(int) (1),(int) (3))+" "+parent._mcode._vahedpool /*String*/ ));
RDebugUtils.currentLine=101580892;
 //BA.debugLineNum = 101580892;BA.debugLine="ImageOff.Visible=True";
__ref._imageoff /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .setVisible(parent.__c.True);
 if (true) break;

case 23:
//C
this.state = 28;
RDebugUtils.currentLine=101580894;
 //BA.debugLineNum = 101580894;BA.debugLine="MCode.Rs.Initialize(\"فی فروش: \"& NumberFormat(m";
parent._mcode._rs /*anywheresoftware.b4a.agraham.richstring.RichStringBuilder.RichString*/ .Initialize(BA.ObjectToCharSequence("فی فروش: "+parent.__c.NumberFormat((double)(Double.parseDouble(parent._mycode._is_null_adad /*String*/ (ba,BA.NumberToString(_fee)))),(int) (1),(int) (3))+" "+parent._mcode._vahedpool /*String*/ ));
RDebugUtils.currentLine=101580895;
 //BA.debugLineNum = 101580895;BA.debugLine="MCode.Rs.Strikethrough (0, MCode.Rs.Length)";
parent._mcode._rs /*anywheresoftware.b4a.agraham.richstring.RichStringBuilder.RichString*/ .Strikethrough((int) (0),parent._mcode._rs /*anywheresoftware.b4a.agraham.richstring.RichStringBuilder.RichString*/ .getLength());
RDebugUtils.currentLine=101580896;
 //BA.debugLineNum = 101580896;BA.debugLine="MCode.Rs.Color(Colors.Red,0, MCode.Rs.Length)";
parent._mcode._rs /*anywheresoftware.b4a.agraham.richstring.RichStringBuilder.RichString*/ .Color(parent.__c.Colors.Red,(int) (0),parent._mcode._rs /*anywheresoftware.b4a.agraham.richstring.RichStringBuilder.RichString*/ .getLength());
RDebugUtils.currentLine=101580897;
 //BA.debugLineNum = 101580897;BA.debugLine="Item.MablaghTakhfif=(Item.FeeForoosh*Item.Tedad";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .MablaghTakhfif /*int*/  = (int) ((__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FeeForoosh /*int*/ *(double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadJoz /*String*/ ))+((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadKol /*String*/ ))*(double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarKarton /*String*/ )))));
RDebugUtils.currentLine=101580898;
 //BA.debugLineNum = 101580898;BA.debugLine="Item.FldFeeBadAzTakhfif=0";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldFeeBadAzTakhfif /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=101580899;
 //BA.debugLineNum = 101580899;BA.debugLine="LblFee.Text = 0";
__ref._lblfee /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(0));
RDebugUtils.currentLine=101580900;
 //BA.debugLineNum = 101580900;BA.debugLine="LblFeeBadAzTakhfid.Text =\"فی بعد از تخفیف: \"& N";
__ref._lblfeebadaztakhfid /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("فی بعد از تخفیف: "+parent.__c.NumberFormat((double)(Double.parseDouble(parent._mycode._is_null_adad /*String*/ (ba,__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldFeeBadAzTakhfif /*String*/ ))),(int) (1),(int) (3))+" "+parent._mcode._vahedpool /*String*/ ));
RDebugUtils.currentLine=101580901;
 //BA.debugLineNum = 101580901;BA.debugLine="ImageOff.Visible=True";
__ref._imageoff /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .setVisible(parent.__c.True);
 if (true) break;

case 25:
//C
this.state = 28;
RDebugUtils.currentLine=101580903;
 //BA.debugLineNum = 101580903;BA.debugLine="MCode.Rs.Initialize(\"فی فروش: \"& NumberFormat(m";
parent._mcode._rs /*anywheresoftware.b4a.agraham.richstring.RichStringBuilder.RichString*/ .Initialize(BA.ObjectToCharSequence("فی فروش: "+parent.__c.NumberFormat((double)(Double.parseDouble(parent._mycode._is_null_adad /*String*/ (ba,BA.NumberToString(_fee)))),(int) (1),(int) (3))+" "+parent._mcode._vahedpool /*String*/ ));
RDebugUtils.currentLine=101580904;
 //BA.debugLineNum = 101580904;BA.debugLine="MCode.Rs.Strikethrough (0, MCode.Rs.Length)";
parent._mcode._rs /*anywheresoftware.b4a.agraham.richstring.RichStringBuilder.RichString*/ .Strikethrough((int) (0),parent._mcode._rs /*anywheresoftware.b4a.agraham.richstring.RichStringBuilder.RichString*/ .getLength());
RDebugUtils.currentLine=101580905;
 //BA.debugLineNum = 101580905;BA.debugLine="MCode.Rs.Color(Colors.Red,0, MCode.Rs.Length)";
parent._mcode._rs /*anywheresoftware.b4a.agraham.richstring.RichStringBuilder.RichString*/ .Color(parent.__c.Colors.Red,(int) (0),parent._mcode._rs /*anywheresoftware.b4a.agraham.richstring.RichStringBuilder.RichString*/ .getLength());
RDebugUtils.currentLine=101580906;
 //BA.debugLineNum = 101580906;BA.debugLine="LblFee.Text = MCode.Rs";
__ref._lblfee /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(parent._mcode._rs /*anywheresoftware.b4a.agraham.richstring.RichStringBuilder.RichString*/ .getObject()));
RDebugUtils.currentLine=101580907;
 //BA.debugLineNum = 101580907;BA.debugLine="LblFeeBadAzTakhfid.Text =\"فی بعد از تخفیف: \"& N";
__ref._lblfeebadaztakhfid /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("فی بعد از تخفیف: "+parent.__c.NumberFormat((double)(Double.parseDouble(parent._mycode._is_null_adad /*String*/ (ba,__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldFeeBadAzTakhfif /*String*/ ))),(int) (1),(int) (3))+" "+parent._mcode._vahedpool /*String*/ ));
RDebugUtils.currentLine=101580908;
 //BA.debugLineNum = 101580908;BA.debugLine="ImageOff.Visible=True";
__ref._imageoff /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .setVisible(parent.__c.True);
 if (true) break;

case 27:
//C
this.state = 28;
RDebugUtils.currentLine=101580910;
 //BA.debugLineNum = 101580910;BA.debugLine="LblFee.Text =\"فی فروش: \"& NumberFormat(myCode.I";
__ref._lblfee /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("فی فروش: "+parent.__c.NumberFormat((double)(Double.parseDouble(parent._mycode._is_null_adad /*String*/ (ba,BA.NumberToString(_fee)))),(int) (1),(int) (3))+" "+parent._mcode._vahedpool /*String*/ ));
RDebugUtils.currentLine=101580911;
 //BA.debugLineNum = 101580911;BA.debugLine="LblFeeBadAzTakhfid.Text = \"\"";
__ref._lblfeebadaztakhfid /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=101580912;
 //BA.debugLineNum = 101580912;BA.debugLine="ImageOff.Visible=False";
__ref._imageoff /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .setVisible(parent.__c.False);
 if (true) break;

case 28:
//C
this.state = 31;
;
 if (true) break;

case 30:
//C
this.state = 31;
RDebugUtils.currentLine=101580915;
 //BA.debugLineNum = 101580915;BA.debugLine="LblFee.Text =\"فی فروش: \"& NumberFormat(myCode.Is";
__ref._lblfee /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("فی فروش: "+parent.__c.NumberFormat((double)(Double.parseDouble(parent._mycode._is_null_adad /*String*/ (ba,BA.NumberToString(_fee)))),(int) (1),(int) (3))+" "+parent._mcode._vahedpool /*String*/ ));
RDebugUtils.currentLine=101580916;
 //BA.debugLineNum = 101580916;BA.debugLine="LblFeeBadAzTakhfid.Text = \"\"";
__ref._lblfeebadaztakhfid /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(""));
 if (true) break;
;
RDebugUtils.currentLine=101580919;
 //BA.debugLineNum = 101580919;BA.debugLine="If Item.TedadDarSabadJoz=Null Then";

case 31:
//if
this.state = 36;
if (__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadJoz /*String*/ == null) { 
this.state = 33;
}else {
this.state = 35;
}if (true) break;

case 33:
//C
this.state = 36;
RDebugUtils.currentLine=101580920;
 //BA.debugLineNum = 101580920;BA.debugLine="LblTedadJoz.Text=0";
__ref._lbltedadjoz /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(0));
RDebugUtils.currentLine=101580921;
 //BA.debugLineNum = 101580921;BA.debugLine="Item.TedadDarSabadJoz=0";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadJoz /*String*/  = BA.NumberToString(0);
 if (true) break;

case 35:
//C
this.state = 36;
RDebugUtils.currentLine=101580923;
 //BA.debugLineNum = 101580923;BA.debugLine="LblTedadJoz.Text =Item.TedadDarSabadJoz";
__ref._lbltedadjoz /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadJoz /*String*/ ));
 if (true) break;

case 36:
//C
this.state = 37;
;
RDebugUtils.currentLine=101580925;
 //BA.debugLineNum = 101580925;BA.debugLine="lblVahedJoz.Text = \"تعداد به \"& Item.NameVahed";
__ref._lblvahedjoz /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("تعداد به "+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .NameVahed /*String*/ ));
RDebugUtils.currentLine=101580927;
 //BA.debugLineNum = 101580927;BA.debugLine="If Item.TedadDarSabadKol=Null Then";
if (true) break;

case 37:
//if
this.state = 42;
if (__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadKol /*String*/ == null) { 
this.state = 39;
}else {
this.state = 41;
}if (true) break;

case 39:
//C
this.state = 42;
RDebugUtils.currentLine=101580928;
 //BA.debugLineNum = 101580928;BA.debugLine="LblTedadkol.Text=0";
__ref._lbltedadkol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(0));
RDebugUtils.currentLine=101580929;
 //BA.debugLineNum = 101580929;BA.debugLine="Item.TedadDarSabadKol=0";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadKol /*String*/  = BA.NumberToString(0);
 if (true) break;

case 41:
//C
this.state = 42;
RDebugUtils.currentLine=101580931;
 //BA.debugLineNum = 101580931;BA.debugLine="LblTedadkol.Text =Item.TedadDarSabadKol";
__ref._lbltedadkol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadKol /*String*/ ));
 if (true) break;
;
RDebugUtils.currentLine=101580933;
 //BA.debugLineNum = 101580933;BA.debugLine="If Item.NameVahed2=\"\" Then";

case 42:
//if
this.state = 47;
if ((__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .NameVahed2 /*String*/ ).equals("")) { 
this.state = 44;
}else {
this.state = 46;
}if (true) break;

case 44:
//C
this.state = 47;
RDebugUtils.currentLine=101580934;
 //BA.debugLineNum = 101580934;BA.debugLine="lblVahedKol.Text = \"تعداد به کارتن \"& Item.NameV";
__ref._lblvahedkol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("تعداد به کارتن "+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .NameVahed2 /*String*/ ));
 if (true) break;

case 46:
//C
this.state = 47;
RDebugUtils.currentLine=101580936;
 //BA.debugLineNum = 101580936;BA.debugLine="lblVahedKol.Text = \"تعداد به \"& Item.NameVahed2";
__ref._lblvahedkol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("تعداد به "+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .NameVahed2 /*String*/ ));
 if (true) break;

case 47:
//C
this.state = 48;
;
RDebugUtils.currentLine=101580951;
 //BA.debugLineNum = 101580951;BA.debugLine="Item.FldEshantion=myCode.Is_Null_adad(Item.FldEsh";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FldEshantion /*String*/  = parent._mycode._is_null_adad /*String*/ (ba,__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FldEshantion /*String*/ );
RDebugUtils.currentLine=101580953;
 //BA.debugLineNum = 101580953;BA.debugLine="Dim Price As Long=0";
_price = (long) (0);
RDebugUtils.currentLine=101580954;
 //BA.debugLineNum = 101580954;BA.debugLine="If myCode.Is_Null_adad(Item.FldFeeBadAzTakhfif) >";
if (true) break;

case 48:
//if
this.state = 55;
if ((double)(Double.parseDouble(parent._mycode._is_null_adad /*String*/ (ba,__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldFeeBadAzTakhfif /*String*/ )))>0) { 
this.state = 50;
}else 
{RDebugUtils.currentLine=101580957;
 //BA.debugLineNum = 101580957;BA.debugLine="Else If myCode.Is_Null_adad(Item.FldFeeBadAzTakhf";
if ((parent._mycode._is_null_adad /*String*/ (ba,__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldFeeBadAzTakhfif /*String*/ )).equals(BA.NumberToString(0)) && (parent._mycode._is_null_adad /*String*/ (ba,__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldDarsadTakhfif /*String*/ )).equals(BA.NumberToString(100))) { 
this.state = 52;
}else {
this.state = 54;
}}
if (true) break;

case 50:
//C
this.state = 55;
RDebugUtils.currentLine=101580955;
 //BA.debugLineNum = 101580955;BA.debugLine="Price = Item.FldFeeBadAzTakhfif * ((Item.TedadDa";
_price = (long) ((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldFeeBadAzTakhfif /*String*/ ))*(((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadKol /*String*/ ))*(double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarKarton /*String*/ )))+(double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadJoz /*String*/ ))));
RDebugUtils.currentLine=101580956;
 //BA.debugLineNum = 101580956;BA.debugLine="ImageOff.Visible=True";
__ref._imageoff /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .setVisible(parent.__c.True);
 if (true) break;

case 52:
//C
this.state = 55;
RDebugUtils.currentLine=101580958;
 //BA.debugLineNum = 101580958;BA.debugLine="Price=0";
_price = (long) (0);
 if (true) break;

case 54:
//C
this.state = 55;
RDebugUtils.currentLine=101580960;
 //BA.debugLineNum = 101580960;BA.debugLine="Price = Item.FeeForoosh * ((Item.TedadDarSabadKol";
_price = (long) (__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FeeForoosh /*int*/ *(((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadKol /*String*/ ))*(double)(Double.parseDouble(parent._mycode._is_null_adad /*String*/ (ba,__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarKarton /*String*/ ))))+(double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadJoz /*String*/ ))));
RDebugUtils.currentLine=101580961;
 //BA.debugLineNum = 101580961;BA.debugLine="ImageOff.Visible=False";
__ref._imageoff /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .setVisible(parent.__c.False);
 if (true) break;
;
RDebugUtils.currentLine=101580964;
 //BA.debugLineNum = 101580964;BA.debugLine="If myCode.Is_Null_adad(Item.fldDarsadArzeshAfzode";

case 55:
//if
this.state = 62;
if ((parent._mycode._is_null_adad /*String*/ (ba,__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldDarsadArzeshAfzodeKala /*String*/ )).equals(BA.NumberToString(0)) && (parent._mcode._arzeshafzodeenable /*String*/ ).equals(BA.NumberToString(1)) && __ref._swdisablearzeshafzode /*de.amberhome.objects.appcompat.ACSwitchCompatWrapper*/ .getChecked()==parent.__c.True) { 
this.state = 57;
}else 
{RDebugUtils.currentLine=101580966;
 //BA.debugLineNum = 101580966;BA.debugLine="Else If myCode.Is_Null_adad(Item.fldDarsadArzeshA";
if ((double)(Double.parseDouble(parent._mycode._is_null_adad /*String*/ (ba,__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldDarsadArzeshAfzodeKala /*String*/ )))>0 && (parent._mcode._arzeshafzodeenable /*String*/ ).equals(BA.NumberToString(1))) { 
this.state = 59;
}else {
this.state = 61;
}}
if (true) break;

case 57:
//C
this.state = 62;
RDebugUtils.currentLine=101580965;
 //BA.debugLineNum = 101580965;BA.debugLine="Item.fldDarsadArzeshAfzodeKala=myCode.Is_Null_ad";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldDarsadArzeshAfzodeKala /*String*/  = parent._mycode._is_null_adad /*String*/ (ba,parent._mcode._arzeshafzode /*String*/ );
 if (true) break;

case 59:
//C
this.state = 62;
RDebugUtils.currentLine=101580967;
 //BA.debugLineNum = 101580967;BA.debugLine="Item.fldDarsadArzeshAfzodeKala=myCode.Is_Null_ad";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldDarsadArzeshAfzodeKala /*String*/  = parent._mycode._is_null_adad /*String*/ (ba,__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldDarsadArzeshAfzodeKala /*String*/ );
 if (true) break;

case 61:
//C
this.state = 62;
RDebugUtils.currentLine=101580969;
 //BA.debugLineNum = 101580969;BA.debugLine="Item.fldDarsadArzeshAfzodeKala=0";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldDarsadArzeshAfzodeKala /*String*/  = BA.NumberToString(0);
 if (true) break;

case 62:
//C
this.state = 63;
;
RDebugUtils.currentLine=101580972;
 //BA.debugLineNum = 101580972;BA.debugLine="LblDarsadArzeshAfzodeKala.Text=\"درصد ارزش افزوده:";
__ref._lbldarsadarzeshafzodekala /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("درصد ارزش افزوده: %"+parent._mycode._is_null_adad /*String*/ (ba,__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldDarsadArzeshAfzodeKala /*String*/ )));
RDebugUtils.currentLine=101580975;
 //BA.debugLineNum = 101580975;BA.debugLine="If Item.TedadDarKarton<>0 And IsNumber(Item.Tedad";
if (true) break;

case 63:
//if
this.state = 80;
if ((__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarKarton /*String*/ ).equals(BA.NumberToString(0)) == false && parent.__c.IsNumber(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarKarton /*String*/ )==parent.__c.True) { 
this.state = 65;
}else {
this.state = 73;
}if (true) break;

case 65:
//C
this.state = 66;
RDebugUtils.currentLine=101580976;
 //BA.debugLineNum = 101580976;BA.debugLine="maxkolRond=(Item.SumMandeKarton)";
__ref._maxkolrond /*String*/  = (__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMandeKarton /*String*/ );
RDebugUtils.currentLine=101580978;
 //BA.debugLineNum = 101580978;BA.debugLine="If Item.NameVahed2=\"\" Then";
if (true) break;

case 66:
//if
this.state = 71;
if ((__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .NameVahed2 /*String*/ ).equals("")) { 
this.state = 68;
}else {
this.state = 70;
}if (true) break;

case 68:
//C
this.state = 71;
RDebugUtils.currentLine=101580979;
 //BA.debugLineNum = 101580979;BA.debugLine="LblTedadKarton.Text=\"تعداد در کارتن: \"& Item.Te";
__ref._lbltedadkarton /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("تعداد در کارتن: "+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarKarton /*String*/ ));
 if (true) break;

case 70:
//C
this.state = 71;
RDebugUtils.currentLine=101580981;
 //BA.debugLineNum = 101580981;BA.debugLine="LblTedadKarton.Text=\"تعداد در \"&Item.NameVahed2";
__ref._lbltedadkarton /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("تعداد در "+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .NameVahed2 /*String*/ +": "+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarKarton /*String*/ ));
 if (true) break;

case 71:
//C
this.state = 80;
;
RDebugUtils.currentLine=101580983;
 //BA.debugLineNum = 101580983;BA.debugLine="LblFeeYekKarton.Text=\"فی یک کارتن: \"&myCode.Adad";
__ref._lblfeeyekkarton /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("فی یک کارتن: "+parent._mycode._adadtoprice /*String*/ (ba,BA.NumberToString(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FeeForoosh /*int*/ *(double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarKarton /*String*/ ))))));
RDebugUtils.currentLine=101580984;
 //BA.debugLineNum = 101580984;BA.debugLine="Log(maxkolRond)";
parent.__c.LogImpl("5101580984",__ref._maxkolrond /*String*/ ,0);
 if (true) break;

case 73:
//C
this.state = 74;
RDebugUtils.currentLine=101580986;
 //BA.debugLineNum = 101580986;BA.debugLine="maxkolRond=0";
__ref._maxkolrond /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=101580988;
 //BA.debugLineNum = 101580988;BA.debugLine="If Item.NameVahed2=\"\" Then";
if (true) break;

case 74:
//if
this.state = 79;
if ((__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .NameVahed2 /*String*/ ).equals("")) { 
this.state = 76;
}else {
this.state = 78;
}if (true) break;

case 76:
//C
this.state = 79;
RDebugUtils.currentLine=101580989;
 //BA.debugLineNum = 101580989;BA.debugLine="LblTedadKarton.Text=\"تعداد در کارتن: \"& maxkolR";
__ref._lbltedadkarton /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("تعداد در کارتن: "+__ref._maxkolrond /*String*/ ));
 if (true) break;

case 78:
//C
this.state = 79;
RDebugUtils.currentLine=101580991;
 //BA.debugLineNum = 101580991;BA.debugLine="LblTedadKarton.Text=\"تعداد در \"&Item.NameVahed2";
__ref._lbltedadkarton /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("تعداد در "+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .NameVahed2 /*String*/ +": "+__ref._maxkolrond /*String*/ ));
 if (true) break;

case 79:
//C
this.state = 80;
;
RDebugUtils.currentLine=101580993;
 //BA.debugLineNum = 101580993;BA.debugLine="LblFeeYekKarton.Text=\"فی یک کارتن: \"&0";
__ref._lblfeeyekkarton /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("فی یک کارتن: "+BA.NumberToString(0)));
RDebugUtils.currentLine=101580994;
 //BA.debugLineNum = 101580994;BA.debugLine="LblMojoodiKol.Text =\"موجودی کل: -\"";
__ref._lblmojoodikol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("موجودی کل: -"));
 if (true) break;

case 80:
//C
this.state = 81;
;
RDebugUtils.currentLine=101580996;
 //BA.debugLineNum = 101580996;BA.debugLine="Log(maxkolRond)";
parent.__c.LogImpl("5101580996",__ref._maxkolrond /*String*/ ,0);
RDebugUtils.currentLine=101580997;
 //BA.debugLineNum = 101580997;BA.debugLine="LblMojoodiJoz.Text =\"موجودی جزء: \"& Item.SumMande";
__ref._lblmojoodijoz /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("موجودی جزء: "+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/ +" "+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .NameVahed /*String*/ ));
RDebugUtils.currentLine=101580999;
 //BA.debugLineNum = 101580999;BA.debugLine="If  Item.SumMandeKarton <> Null Then";
if (true) break;

case 81:
//if
this.state = 86;
if (__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMandeKarton /*String*/ != null) { 
this.state = 83;
}else {
this.state = 85;
}if (true) break;

case 83:
//C
this.state = 86;
RDebugUtils.currentLine=101581000;
 //BA.debugLineNum = 101581000;BA.debugLine="LblMojoodiKol.Text =\"موجودی کل: \"& maxkolRond &";
__ref._lblmojoodikol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("موجودی کل: "+__ref._maxkolrond /*String*/ +" "+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .NameVahed2 /*String*/ ));
 if (true) break;

case 85:
//C
this.state = 86;
RDebugUtils.currentLine=101581002;
 //BA.debugLineNum = 101581002;BA.debugLine="LblMojoodiKol.Text =\"موجودی کل: -\"";
__ref._lblmojoodikol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("موجودی کل: -"));
 if (true) break;
;
RDebugUtils.currentLine=101581005;
 //BA.debugLineNum = 101581005;BA.debugLine="If Item.TedadDarSabadJoz>0 Then";

case 86:
//if
this.state = 89;
if ((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadJoz /*String*/ ))>0) { 
this.state = 88;
}if (true) break;

case 88:
//C
this.state = 89;
RDebugUtils.currentLine=101581006;
 //BA.debugLineNum = 101581006;BA.debugLine="AddEshantion(Item.TedadDarSabadJoz)";
__ref._addeshantion /*String*/ (null,(int)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadJoz /*String*/ )));
RDebugUtils.currentLine=101581007;
 //BA.debugLineNum = 101581007;BA.debugLine="LblTedadEshan.Text = Item.FldEshantion";
__ref._lbltedadeshan /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FldEshantion /*String*/ ));
 if (true) break;
;
RDebugUtils.currentLine=101581009;
 //BA.debugLineNum = 101581009;BA.debugLine="If Item.fldCountEshantion<>Null Then";

case 89:
//if
this.state = 94;
if (__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldCountEshantion /*String*/ != null) { 
this.state = 91;
}else {
this.state = 93;
}if (true) break;

case 91:
//C
this.state = 94;
RDebugUtils.currentLine=101581010;
 //BA.debugLineNum = 101581010;BA.debugLine="LblCountEshantion.Text=\"تعداد هدیه : \" & Item.fl";
__ref._lblcounteshantion /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("تعداد هدیه : "+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldCountEshantion /*String*/ ));
RDebugUtils.currentLine=101581011;
 //BA.debugLineNum = 101581011;BA.debugLine="LblTedadEshan.Text=Item.FldEshantion";
__ref._lbltedadeshan /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FldEshantion /*String*/ ));
 if (true) break;

case 93:
//C
this.state = 94;
RDebugUtils.currentLine=101581013;
 //BA.debugLineNum = 101581013;BA.debugLine="LblCountEshantion.Text=\"تعداد هدیه : 0\"";
__ref._lblcounteshantion /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("تعداد هدیه : 0"));
 if (true) break;
;
RDebugUtils.currentLine=101581015;
 //BA.debugLineNum = 101581015;BA.debugLine="If MCode.EshantionGroup=1 Then";

case 94:
//if
this.state = 97;
if ((parent._mcode._eshantiongroup /*String*/ ).equals(BA.NumberToString(1))) { 
this.state = 96;
}if (true) break;

case 96:
//C
this.state = 97;
RDebugUtils.currentLine=101581016;
 //BA.debugLineNum = 101581016;BA.debugLine="LblTedadEshan.Text=Item.FldEshantion";
__ref._lbltedadeshan /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FldEshantion /*String*/ ));
 if (true) break;
;
RDebugUtils.currentLine=101581022;
 //BA.debugLineNum = 101581022;BA.debugLine="If Price>0 Then";

case 97:
//if
this.state = 112;
if (_price>0) { 
this.state = 99;
}else {
this.state = 111;
}if (true) break;

case 99:
//C
this.state = 100;
RDebugUtils.currentLine=101581023;
 //BA.debugLineNum = 101581023;BA.debugLine="If myCode.Is_Null_adad(Item.fldDarsadArzeshAfzo";
if (true) break;

case 100:
//if
this.state = 109;
if ((double)(Double.parseDouble(parent._mycode._is_null_adad /*String*/ (ba,__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldDarsadArzeshAfzodeKala /*String*/ )))>0 && __ref._swdisablearzeshafzode /*de.amberhome.objects.appcompat.ACSwitchCompatWrapper*/ .getChecked()) { 
this.state = 102;
}else {
this.state = 108;
}if (true) break;

case 102:
//C
this.state = 103;
RDebugUtils.currentLine=101581024;
 //BA.debugLineNum = 101581024;BA.debugLine="Item.fldArzeshAfzodeKala=myCode.Is_Null_adad(M";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldArzeshAfzodeKala /*String*/  = parent._mycode._is_null_adad /*String*/ (ba,BA.NumberToString(parent._mcode._mohasbearzeshafzodekala /*long*/ (ba,_price,__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldDarsadArzeshAfzodeKala /*String*/ )));
RDebugUtils.currentLine=101581025;
 //BA.debugLineNum = 101581025;BA.debugLine="If Item.fldArzeshAfzodeKala>0 Then";
if (true) break;

case 103:
//if
this.state = 106;
if ((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldArzeshAfzodeKala /*String*/ ))>0) { 
this.state = 105;
}if (true) break;

case 105:
//C
this.state = 106;
RDebugUtils.currentLine=101581026;
 //BA.debugLineNum = 101581026;BA.debugLine="LblArzeshAfzodeKala.Text=\"مبلغ ارزش افزوده: \"";
__ref._lblarzeshafzodekala /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("مبلغ ارزش افزوده: "+parent._mycode._adadtoprice /*String*/ (ba,__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldArzeshAfzodeKala /*String*/ )));
RDebugUtils.currentLine=101581027;
 //BA.debugLineNum = 101581027;BA.debugLine="Price=Price+Item.fldArzeshAfzodeKala";
_price = (long) (_price+(double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldArzeshAfzodeKala /*String*/ )));
 if (true) break;

case 106:
//C
this.state = 109;
;
 if (true) break;

case 108:
//C
this.state = 109;
RDebugUtils.currentLine=101581030;
 //BA.debugLineNum = 101581030;BA.debugLine="LblArzeshAfzodeKala.Text=\"مبلغ ارزش افزوده: \"&";
__ref._lblarzeshafzodekala /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("مبلغ ارزش افزوده: "+parent._mycode._is_null_adad /*String*/ (ba,__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldArzeshAfzodeKala /*String*/ )));
 if (true) break;

case 109:
//C
this.state = 112;
;
RDebugUtils.currentLine=101581033;
 //BA.debugLineNum = 101581033;BA.debugLine="lblSumMablaghKala.Text=\"جمع مبلغ: \"& NumberForma";
__ref._lblsummablaghkala /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("جمع مبلغ: "+parent.__c.NumberFormat((double)(Double.parseDouble(parent._mycode._is_null_adad /*String*/ (ba,BA.NumberToString(_price)))),(int) (1),(int) (3))+" "+parent._mcode._vahedpool /*String*/ ));
 if (true) break;

case 111:
//C
this.state = 112;
RDebugUtils.currentLine=101581035;
 //BA.debugLineNum = 101581035;BA.debugLine="lblSumMablaghKala.Text=\"جمع مبلغ: 0\"";
__ref._lblsummablaghkala /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("جمع مبلغ: 0"));
 if (true) break;
;
RDebugUtils.currentLine=101581058;
 //BA.debugLineNum = 101581058;BA.debugLine="If myCode.Is_Null_adad(Item.FldMablaghMasrafKonan";

case 112:
//if
this.state = 117;
if ((double)(Double.parseDouble(parent._mycode._is_null_adad /*String*/ (ba,__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FldMablaghMasrafKonande /*String*/ )))>0) { 
this.state = 114;
}else {
this.state = 116;
}if (true) break;

case 114:
//C
this.state = 117;
RDebugUtils.currentLine=101581059;
 //BA.debugLineNum = 101581059;BA.debugLine="LblMablaghMasrafkonande.Text=\"قیمت مصرف کننده: \"";
__ref._lblmablaghmasrafkonande /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("قیمت مصرف کننده: "+parent.__c.NumberFormat((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FldMablaghMasrafKonande /*String*/ )),(int) (1),(int) (3))+" "+parent._mcode._vahedpool /*String*/ ));
 if (true) break;

case 116:
//C
this.state = 117;
RDebugUtils.currentLine=101581061;
 //BA.debugLineNum = 101581061;BA.debugLine="LblMablaghMasrafkonande.Text=\"قیمت مصرف کننده: 0";
__ref._lblmablaghmasrafkonande /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("قیمت مصرف کننده: 0"));
 if (true) break;
;
RDebugUtils.currentLine=101581064;
 //BA.debugLineNum = 101581064;BA.debugLine="If MCode.HideMojodi=1 Then";

case 117:
//if
this.state = 122;
if ((parent._mcode._hidemojodi /*String*/ ).equals(BA.NumberToString(1))) { 
this.state = 119;
}else {
this.state = 121;
}if (true) break;

case 119:
//C
this.state = 122;
RDebugUtils.currentLine=101581065;
 //BA.debugLineNum = 101581065;BA.debugLine="LblMojoodiJoz.Visible=False";
__ref._lblmojoodijoz /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(parent.__c.False);
RDebugUtils.currentLine=101581066;
 //BA.debugLineNum = 101581066;BA.debugLine="LblMojoodiKol.Visible=False";
__ref._lblmojoodikol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(parent.__c.False);
 if (true) break;

case 121:
//C
this.state = 122;
RDebugUtils.currentLine=101581068;
 //BA.debugLineNum = 101581068;BA.debugLine="LblMojoodiJoz.Visible=True";
__ref._lblmojoodijoz /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(parent.__c.True);
RDebugUtils.currentLine=101581069;
 //BA.debugLineNum = 101581069;BA.debugLine="LblMojoodiKol.Visible=True";
__ref._lblmojoodikol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(parent.__c.True);
 if (true) break;
;
RDebugUtils.currentLine=101581073;
 //BA.debugLineNum = 101581073;BA.debugLine="Try";

case 122:
//try
this.state = 127;
this.catchState = 126;
this.state = 124;
if (true) break;

case 124:
//C
this.state = 127;
this.catchState = 126;
RDebugUtils.currentLine=101581146;
 //BA.debugLineNum = 101581146;BA.debugLine="MCode.placeHolder=MCode.GetPicKala(Item.CodeKal";
parent._mcode._placeholder /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/  = parent._mcode._getpickala /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ (ba,__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .CodeKala /*String*/ );
RDebugUtils.currentLine=101581147;
 //BA.debugLineNum = 101581147;BA.debugLine="ImageRow.Bitmap=MCode.placeHolder";
__ref._imagerow /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .setBitmap((android.graphics.Bitmap)(parent._mcode._placeholder /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ .getObject()));
RDebugUtils.currentLine=101581149;
 //BA.debugLineNum = 101581149;BA.debugLine="MojavezSefaresh";
__ref._mojavezsefaresh /*String*/ (null);
RDebugUtils.currentLine=101581150;
 //BA.debugLineNum = 101581150;BA.debugLine="Sleep(200)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cls_recdefultkala", "show"),(int) (200));
this.state = 131;
return;
case 131:
//C
this.state = 127;
;
 if (true) break;

case 126:
//C
this.state = 127;
this.catchState = 0;
RDebugUtils.currentLine=101581153;
 //BA.debugLineNum = 101581153;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("5101581153",BA.ObjectToString(parent.__c.LastException(ba)),0);
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=101581155;
 //BA.debugLineNum = 101581155;BA.debugLine="If MCode.EshantionTabaghati=1 Then";

case 127:
//if
this.state = 130;
this.catchState = 0;
if ((parent._mcode._eshantiontabaghati /*String*/ ).equals(BA.NumberToString(1))) { 
this.state = 129;
}if (true) break;

case 129:
//C
this.state = 130;
RDebugUtils.currentLine=101581156;
 //BA.debugLineNum = 101581156;BA.debugLine="LblGift.Visible=MCode.CheckEshantion(Item.CodeKa";
__ref._lblgift /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(parent._mcode._checkeshantion /*boolean*/ (ba,__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .CodeKala /*String*/ ));
 if (true) break;

case 130:
//C
this.state = -1;
;
RDebugUtils.currentLine=101581160;
 //BA.debugLineNum = 101581160;BA.debugLine="LblGift.Visible=MCode.CheckEshantionGroup(Item.Co";
__ref._lblgift /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(parent._mcode._checkeshantiongroup /*boolean*/ (ba,__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .CodeGroup /*String*/ ));
RDebugUtils.currentLine=101581163;
 //BA.debugLineNum = 101581163;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public String  _btnupeshan_click(ir.parsikhesab.pakhsh.cls_recdefultkala __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recdefultkala";
if (Debug.shouldDelegate(ba, "btnupeshan_click", false))
	 {return ((String) Debug.delegate(ba, "btnupeshan_click", null));}
int _a = 0;
int _b = 0;
int _minas = 0;
RDebugUtils.currentLine=102629376;
 //BA.debugLineNum = 102629376;BA.debugLine="Sub BtnUpEshan_Click";
RDebugUtils.currentLine=102629377;
 //BA.debugLineNum = 102629377;BA.debugLine="Try";
try {RDebugUtils.currentLine=102629378;
 //BA.debugLineNum = 102629378;BA.debugLine="Dim A As Int = 0";
_a = (int) (0);
RDebugUtils.currentLine=102629379;
 //BA.debugLineNum = 102629379;BA.debugLine="Dim B As Int = 0";
_b = (int) (0);
RDebugUtils.currentLine=102629380;
 //BA.debugLineNum = 102629380;BA.debugLine="Dim minas As Int=MCode.GetCountEshantionGroup(Ite";
_minas = _mcode._getcounteshantiongroup /*int*/ (ba,__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .CodeGroup /*String*/ );
RDebugUtils.currentLine=102629384;
 //BA.debugLineNum = 102629384;BA.debugLine="If minas=0 Then";
if (_minas==0) { 
RDebugUtils.currentLine=102629385;
 //BA.debugLineNum = 102629385;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=102629388;
 //BA.debugLineNum = 102629388;BA.debugLine="A = Item.FldEshantion";
_a = (int)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FldEshantion /*String*/ ));
RDebugUtils.currentLine=102629389;
 //BA.debugLineNum = 102629389;BA.debugLine="If MCode.ForooshBishAzMojoodi = \"1\" Then";
if ((_mcode._forooshbishazmojoodi /*String*/ ).equals("1")) { 
RDebugUtils.currentLine=102629390;
 //BA.debugLineNum = 102629390;BA.debugLine="If Item.FldEshantion<myCode.Is_Null_adad(Item.fl";
if ((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FldEshantion /*String*/ ))<(double)(Double.parseDouble(_mycode._is_null_adad /*String*/ (ba,__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldCountEshantion /*String*/ ))) || (double)(Double.parseDouble(_mycode._is_null_adad /*String*/ (ba,BA.NumberToString(_mcode._getcounteshantiongroup /*int*/ (ba,__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .CodeGroup /*String*/ )))))>0) { 
RDebugUtils.currentLine=102629391;
 //BA.debugLineNum = 102629391;BA.debugLine="A = A + 1";
_a = (int) (_a+1);
RDebugUtils.currentLine=102629392;
 //BA.debugLineNum = 102629392;BA.debugLine="Item.SumMande = Item.SumMande - 1";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/  = BA.NumberToString((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/ ))-1);
 };
 }else 
{RDebugUtils.currentLine=102629395;
 //BA.debugLineNum = 102629395;BA.debugLine="Else if MCode.ForooshBishAzMojoodi = \"0\" Then";
if ((_mcode._forooshbishazmojoodi /*String*/ ).equals("0")) { 
RDebugUtils.currentLine=102629396;
 //BA.debugLineNum = 102629396;BA.debugLine="B = Item.SumMande - ((Item.TedadDarSabadKol * It";
_b = (int) ((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/ ))-(((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadKol /*String*/ ))*(double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarKarton /*String*/ )))+(double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadJoz /*String*/ ))+(double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FldEshantion /*String*/ ))));
RDebugUtils.currentLine=102629397;
 //BA.debugLineNum = 102629397;BA.debugLine="If B > 0 Then";
if (_b>0) { 
RDebugUtils.currentLine=102629398;
 //BA.debugLineNum = 102629398;BA.debugLine="If Item.FldEshantion<myCode.Is_Null_adad(Item.";
if ((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FldEshantion /*String*/ ))<(double)(Double.parseDouble(_mycode._is_null_adad /*String*/ (ba,__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldCountEshantion /*String*/ ))) || _mcode._getcounteshantiongroup /*int*/ (ba,__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .CodeGroup /*String*/ )>0) { 
RDebugUtils.currentLine=102629399;
 //BA.debugLineNum = 102629399;BA.debugLine="A = A + 1";
_a = (int) (_a+1);
RDebugUtils.currentLine=102629400;
 //BA.debugLineNum = 102629400;BA.debugLine="Item.SumMande = Item.SumMande - 1";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/  = BA.NumberToString((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/ ))-1);
 };
 }else {
RDebugUtils.currentLine=102629403;
 //BA.debugLineNum = 102629403;BA.debugLine="ToastMessageShow(\"سفارش شما بیشتر از موجودی می";
__c.ToastMessageShow(BA.ObjectToCharSequence("سفارش شما بیشتر از موجودی می باشد"),__c.True);
 };
 }}
;
RDebugUtils.currentLine=102629406;
 //BA.debugLineNum = 102629406;BA.debugLine="Item.FldEshantion = A";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FldEshantion /*String*/  = BA.NumberToString(_a);
RDebugUtils.currentLine=102629410;
 //BA.debugLineNum = 102629410;BA.debugLine="AddToSabad";
__ref._addtosabad /*String*/ (null);
RDebugUtils.currentLine=102629412;
 //BA.debugLineNum = 102629412;BA.debugLine="If minas>0 Then";
if (_minas>0) { 
RDebugUtils.currentLine=102629413;
 //BA.debugLineNum = 102629413;BA.debugLine="CallSubDelayed3(Act_KalaDefault,\"UpEshantion\",I";
__c.CallSubDelayed3(ba,(Object)(_act_kaladefault.getObject()),"UpEshantion",(Object)(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .CodeGroup /*String*/ ),(Object)(_minas));
 };
 } 
       catch (Exception e31) {
			ba.setLastException(e31);RDebugUtils.currentLine=102629417;
 //BA.debugLineNum = 102629417;BA.debugLine="MCode.SendError(LastException)";
_mcode._senderror /*String*/ (ba,BA.ObjectToString(__c.LastException(ba)));
RDebugUtils.currentLine=102629418;
 //BA.debugLineNum = 102629418;BA.debugLine="Log(LastException)";
__c.LogImpl("5102629418",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=102629420;
 //BA.debugLineNum = 102629420;BA.debugLine="End Sub";
return "";
}
public String  _checkarzeshafzode(ir.parsikhesab.pakhsh.cls_recdefultkala __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recdefultkala";
if (Debug.shouldDelegate(ba, "checkarzeshafzode", false))
	 {return ((String) Debug.delegate(ba, "checkarzeshafzode", null));}
String _tedadkol = "";
String _feekol = "";
RDebugUtils.currentLine=102105088;
 //BA.debugLineNum = 102105088;BA.debugLine="Sub CheckArzeshAfzode As String";
RDebugUtils.currentLine=102105089;
 //BA.debugLineNum = 102105089;BA.debugLine="Dim tedadKol As String=myCode.Is_Null_adad(Item.T";
_tedadkol = BA.NumberToString((double)(Double.parseDouble(_mycode._is_null_adad /*String*/ (ba,__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadJoz /*String*/ )))+((double)(Double.parseDouble(_mycode._is_null_adad /*String*/ (ba,__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadKol /*String*/ )))*(double)(Double.parseDouble(_mycode._is_null_adad /*String*/ (ba,__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarKarton /*String*/ )))));
RDebugUtils.currentLine=102105090;
 //BA.debugLineNum = 102105090;BA.debugLine="Dim FeeKol As String=(Item.FeeForoosh*tedadKol)";
_feekol = BA.NumberToString((__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FeeForoosh /*int*/ *(double)(Double.parseDouble(_tedadkol))));
RDebugUtils.currentLine=102105091;
 //BA.debugLineNum = 102105091;BA.debugLine="If myCode.Is_Null_adad(Item.fldDarsadArzeshAfzode";
if ((double)(Double.parseDouble(_mycode._is_null_adad /*String*/ (ba,__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldDarsadArzeshAfzodeKala /*String*/ )))>0 && __ref._swdisablearzeshafzode /*de.amberhome.objects.appcompat.ACSwitchCompatWrapper*/ .getChecked()) { 
RDebugUtils.currentLine=102105092;
 //BA.debugLineNum = 102105092;BA.debugLine="Item.fldArzeshAfzodeKala=myCode.Is_Null_adad(MCo";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldArzeshAfzodeKala /*String*/  = _mycode._is_null_adad /*String*/ (ba,BA.NumberToString(_mcode._mohasbearzeshafzodekala /*long*/ (ba,(long)(Double.parseDouble(_feekol)),__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldDarsadArzeshAfzodeKala /*String*/ )));
RDebugUtils.currentLine=102105093;
 //BA.debugLineNum = 102105093;BA.debugLine="If Item.fldArzeshAfzodeKala>0 Then";
if ((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldArzeshAfzodeKala /*String*/ ))>0) { 
RDebugUtils.currentLine=102105094;
 //BA.debugLineNum = 102105094;BA.debugLine="LblArzeshAfzodeKala.Text=\"مبلغ ارزش افزوده: \"&";
__ref._lblarzeshafzodekala /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("مبلغ ارزش افزوده: "+_mycode._adadtoprice /*String*/ (ba,__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldArzeshAfzodeKala /*String*/ )));
RDebugUtils.currentLine=102105095;
 //BA.debugLineNum = 102105095;BA.debugLine="FeeKol=FeeKol+Item.fldArzeshAfzodeKala";
_feekol = BA.NumberToString((double)(Double.parseDouble(_feekol))+(double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldArzeshAfzodeKala /*String*/ )));
 };
 }else {
RDebugUtils.currentLine=102105098;
 //BA.debugLineNum = 102105098;BA.debugLine="LblArzeshAfzodeKala.Text=\"مبلغ ارزش افزوده: \"& m";
__ref._lblarzeshafzodekala /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("مبلغ ارزش افزوده: "+_mycode._is_null_adad /*String*/ (ba,__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldArzeshAfzodeKala /*String*/ )));
 };
RDebugUtils.currentLine=102105100;
 //BA.debugLineNum = 102105100;BA.debugLine="Return FeeKol";
if (true) return _feekol;
RDebugUtils.currentLine=102105101;
 //BA.debugLineNum = 102105101;BA.debugLine="End Sub";
return "";
}
public int  _getheight(ir.parsikhesab.pakhsh.cls_recdefultkala __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recdefultkala";
if (Debug.shouldDelegate(ba, "getheight", false))
	 {return ((Integer) Debug.delegate(ba, "getheight", null));}
RDebugUtils.currentLine=101515264;
 //BA.debugLineNum = 101515264;BA.debugLine="Public Sub getHeight As Int";
RDebugUtils.currentLine=101515265;
 //BA.debugLineNum = 101515265;BA.debugLine="Return pnl_bk.Height";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight();
RDebugUtils.currentLine=101515266;
 //BA.debugLineNum = 101515266;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.PanelWrapper  _getpanel(ir.parsikhesab.pakhsh.cls_recdefultkala __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recdefultkala";
if (Debug.shouldDelegate(ba, "getpanel", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "getpanel", null));}
RDebugUtils.currentLine=101449728;
 //BA.debugLineNum = 101449728;BA.debugLine="Public Sub getPanel As Panel";
RDebugUtils.currentLine=101449729;
 //BA.debugLineNum = 101449729;BA.debugLine="pnl_bk.RemoveView";
__ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .RemoveView();
RDebugUtils.currentLine=101449730;
 //BA.debugLineNum = 101449730;BA.debugLine="Return pnl_bk";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ ;
RDebugUtils.currentLine=101449731;
 //BA.debugLineNum = 101449731;BA.debugLine="End Sub";
return null;
}
public String  _addeshantion(ir.parsikhesab.pakhsh.cls_recdefultkala __ref,int _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recdefultkala";
if (Debug.shouldDelegate(ba, "addeshantion", false))
	 {return ((String) Debug.delegate(ba, "addeshantion", new Object[] {_t}));}
RDebugUtils.currentLine=101842944;
 //BA.debugLineNum = 101842944;BA.debugLine="Sub AddEshantion(t As Int)";
RDebugUtils.currentLine=101842973;
 //BA.debugLineNum = 101842973;BA.debugLine="End Sub";
return "";
}
public String  _addtosabad(ir.parsikhesab.pakhsh.cls_recdefultkala __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recdefultkala";
if (Debug.shouldDelegate(ba, "addtosabad", false))
	 {return ((String) Debug.delegate(ba, "addtosabad", null));}
String _tedadkol = "";
String _feekol = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
boolean _check = false;
int _i = 0;
RDebugUtils.currentLine=102170624;
 //BA.debugLineNum = 102170624;BA.debugLine="Sub AddToSabad";
RDebugUtils.currentLine=102170642;
 //BA.debugLineNum = 102170642;BA.debugLine="Dim tedadKol As String=myCode.Is_Null_adad(Item.T";
_tedadkol = BA.NumberToString((double)(Double.parseDouble(_mycode._is_null_adad /*String*/ (ba,__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadJoz /*String*/ )))+((double)(Double.parseDouble(_mycode._is_null_adad /*String*/ (ba,__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadKol /*String*/ )))*(double)(Double.parseDouble(_mycode._is_null_adad /*String*/ (ba,__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarKarton /*String*/ )))));
RDebugUtils.currentLine=102170643;
 //BA.debugLineNum = 102170643;BA.debugLine="Dim FeeKol As String=(Item.FeeForoosh*tedadKol)";
_feekol = BA.NumberToString((__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FeeForoosh /*int*/ *(double)(Double.parseDouble(_tedadkol))));
RDebugUtils.currentLine=102170646;
 //BA.debugLineNum = 102170646;BA.debugLine="If tedadKol>0 Then";
if ((double)(Double.parseDouble(_tedadkol))>0) { 
RDebugUtils.currentLine=102170647;
 //BA.debugLineNum = 102170647;BA.debugLine="If Item.MablaghTakhfif>0 Then";
if (__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .MablaghTakhfif /*int*/ >0) { 
RDebugUtils.currentLine=102170648;
 //BA.debugLineNum = 102170648;BA.debugLine="Item.MablaghTakhfif=(((Item.FeeForoosh*tedadKo";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .MablaghTakhfif /*int*/  = (int) ((((__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FeeForoosh /*int*/ *(double)(Double.parseDouble(_tedadkol)))*(double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldDarsadTakhfif /*String*/ )))/(double)100));
RDebugUtils.currentLine=102170649;
 //BA.debugLineNum = 102170649;BA.debugLine="Item.fldFeeBadAzTakhfif=FeeKol-Item.MablaghTak";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldFeeBadAzTakhfif /*String*/  = BA.NumberToString((double)(Double.parseDouble(_feekol))-__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .MablaghTakhfif /*int*/ );
 };
 }else {
RDebugUtils.currentLine=102170653;
 //BA.debugLineNum = 102170653;BA.debugLine="If myCode.Is_Null_adad(Item.fldDarsadTakhfif)>0";
if ((double)(Double.parseDouble(_mycode._is_null_adad /*String*/ (ba,__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldDarsadTakhfif /*String*/ )))>0) { 
RDebugUtils.currentLine=102170654;
 //BA.debugLineNum = 102170654;BA.debugLine="Item.MablaghTakhfif=(((Item.FeeForoosh)*Item.f";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .MablaghTakhfif /*int*/  = (int) ((((__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FeeForoosh /*int*/ )*(double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldDarsadTakhfif /*String*/ )))/(double)100));
RDebugUtils.currentLine=102170655;
 //BA.debugLineNum = 102170655;BA.debugLine="Item.fldFeeBadAzTakhfif=Item.FeeForoosh-Item.M";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldFeeBadAzTakhfif /*String*/  = BA.NumberToString(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FeeForoosh /*int*/ -__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .MablaghTakhfif /*int*/ );
 };
 };
RDebugUtils.currentLine=102170659;
 //BA.debugLineNum = 102170659;BA.debugLine="FeeKol=CheckArzeshAfzode";
_feekol = __ref._checkarzeshafzode /*String*/ (null);
RDebugUtils.currentLine=102170661;
 //BA.debugLineNum = 102170661;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From Tb";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = _mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (ba,"Select * From TblSabad");
RDebugUtils.currentLine=102170662;
 //BA.debugLineNum = 102170662;BA.debugLine="Dim Check As Boolean";
_check = false;
RDebugUtils.currentLine=102170663;
 //BA.debugLineNum = 102170663;BA.debugLine="For i=0 To Cu.RowCount -1";
{
final int step17 = 1;
final int limit17 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit17 ;_i = _i + step17 ) {
RDebugUtils.currentLine=102170664;
 //BA.debugLineNum = 102170664;BA.debugLine="Cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=102170665;
 //BA.debugLineNum = 102170665;BA.debugLine="If Cu.GetString(\"FldCodeKala\") = Item.CodeKala T";
if ((_cu.GetString("FldCodeKala")).equals(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .CodeKala /*String*/ )) { 
RDebugUtils.currentLine=102170666;
 //BA.debugLineNum = 102170666;BA.debugLine="If Item.TedadDarSabadJoz = 0 And Item.TedadDarS";
if ((__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadJoz /*String*/ ).equals(BA.NumberToString(0)) && (__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadKol /*String*/ ).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=102170667;
 //BA.debugLineNum = 102170667;BA.debugLine="If Item.FldEshantion>0 Then";
if ((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FldEshantion /*String*/ ))>0) { 
RDebugUtils.currentLine=102170668;
 //BA.debugLineNum = 102170668;BA.debugLine="MCode.SaveUpdate(\"Update TblSabad Set FldTeda";
_mcode._saveupdate /*String*/ (ba,"Update TblSabad Set FldTedadDarSabadJoz = '"+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadJoz /*String*/ +"',FldTedadDarSabadKol = '"+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadKol /*String*/ +"',FldMablaghTakhfif = '"+BA.NumberToString(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .MablaghTakhfif /*int*/ )+"',FldDarsadTakhfif = '"+_mycode._is_null_adad /*String*/ (ba,__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldDarsadTakhfif /*String*/ )+",fldFeeBadAzTakhfif = '"+_mycode._is_null_adad /*String*/ (ba,__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldFeeBadAzTakhfif /*String*/ )+"',fldArzeshAfzode = '"+_mycode._is_null_adad /*String*/ (ba,__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldArzeshAfzodeKala /*String*/ )+"',fldDarsadArzeshAfzode = '"+_mycode._is_null_adad /*String*/ (ba,__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldDarsadArzeshAfzodeKala /*String*/ )+"', FldEshantion = '"+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FldEshantion /*String*/ +"' Where FldCodeKala = '"+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .CodeKala /*String*/ +"'");
 }else {
RDebugUtils.currentLine=102170671;
 //BA.debugLineNum = 102170671;BA.debugLine="MCode.SaveUpdate(\"Delete From TblSabad Where";
_mcode._saveupdate /*String*/ (ba,"Delete From TblSabad Where FldCodeKala = '"+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .CodeKala /*String*/ +"'");
 };
 }else {
RDebugUtils.currentLine=102170679;
 //BA.debugLineNum = 102170679;BA.debugLine="MCode.SaveUpdate(\"Update TblSabad Set FldTedad";
_mcode._saveupdate /*String*/ (ba,"Update TblSabad Set FldTedadDarSabadJoz = '"+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadJoz /*String*/ +"',FldTedadDarSabadKol = '"+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadKol /*String*/ +"',FldMablaghTakhfif = '"+BA.NumberToString(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .MablaghTakhfif /*int*/ )+"',FldDarsadTakhfif = '"+_mycode._is_null_adad /*String*/ (ba,__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldDarsadTakhfif /*String*/ )+"',fldFeeBadAzTakhfif = '"+_mycode._is_null_adad /*String*/ (ba,__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldFeeBadAzTakhfif /*String*/ )+"',fldArzeshAfzode = '"+_mycode._is_null_adad /*String*/ (ba,__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldArzeshAfzodeKala /*String*/ )+"',fldDarsadArzeshAfzode = '"+_mycode._is_null_adad /*String*/ (ba,__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldDarsadArzeshAfzodeKala /*String*/ )+"',FldEshantion = '"+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FldEshantion /*String*/ +"' Where FldCodeKala = '"+__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .CodeKala /*String*/ +"'");
 };
RDebugUtils.currentLine=102170682;
 //BA.debugLineNum = 102170682;BA.debugLine="Check = True";
_check = __c.True;
RDebugUtils.currentLine=102170683;
 //BA.debugLineNum = 102170683;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=102170686;
 //BA.debugLineNum = 102170686;BA.debugLine="If Check = False Then";
if (_check==__c.False) { 
RDebugUtils.currentLine=102170687;
 //BA.debugLineNum = 102170687;BA.debugLine="MCode.AddToSabad(Item)";
_mcode._addtosabad /*String*/ (ba,__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ );
 };
RDebugUtils.currentLine=102170690;
 //BA.debugLineNum = 102170690;BA.debugLine="CallSubDelayed(base,\"RefreshLblSabad\")";
__c.CallSubDelayed(ba,__ref._base /*Object*/ ,"RefreshLblSabad");
RDebugUtils.currentLine=102170691;
 //BA.debugLineNum = 102170691;BA.debugLine="End Sub";
return "";
}
public String  _btn_discount_click(ir.parsikhesab.pakhsh.cls_recdefultkala __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recdefultkala";
if (Debug.shouldDelegate(ba, "btn_discount_click", false))
	 {return ((String) Debug.delegate(ba, "btn_discount_click", null));}
RDebugUtils.currentLine=102891520;
 //BA.debugLineNum = 102891520;BA.debugLine="Sub btn_discount_Click";
RDebugUtils.currentLine=102891521;
 //BA.debugLineNum = 102891521;BA.debugLine="If MCode.TakhfifKala=1 Then";
if ((_mcode._takhfifkala /*String*/ ).equals(BA.NumberToString(1))) { 
RDebugUtils.currentLine=102891522;
 //BA.debugLineNum = 102891522;BA.debugLine="CallSubDelayed2(base,\"btn_discount_Click\",Item)";
__c.CallSubDelayed2(ba,__ref._base /*Object*/ ,"btn_discount_Click",(Object)(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ ));
 };
RDebugUtils.currentLine=102891524;
 //BA.debugLineNum = 102891524;BA.debugLine="End Sub";
return "";
}
public String  _btn_edit_price_click(ir.parsikhesab.pakhsh.cls_recdefultkala __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recdefultkala";
if (Debug.shouldDelegate(ba, "btn_edit_price_click", false))
	 {return ((String) Debug.delegate(ba, "btn_edit_price_click", null));}
RDebugUtils.currentLine=102760448;
 //BA.debugLineNum = 102760448;BA.debugLine="Sub btn_edit_Price_Click";
RDebugUtils.currentLine=102760449;
 //BA.debugLineNum = 102760449;BA.debugLine="If MCode.TaghirFeeKala=1 Then";
if ((_mcode._taghirfeekala /*String*/ ).equals(BA.NumberToString(1))) { 
RDebugUtils.currentLine=102760450;
 //BA.debugLineNum = 102760450;BA.debugLine="CallSubDelayed2(base,\"btn_edit_Price_Click\",Ite";
__c.CallSubDelayed2(ba,__ref._base /*Object*/ ,"btn_edit_Price_Click",(Object)(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ ));
 };
RDebugUtils.currentLine=102760452;
 //BA.debugLineNum = 102760452;BA.debugLine="End Sub";
return "";
}
public String  _btndowneshan_click(ir.parsikhesab.pakhsh.cls_recdefultkala __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recdefultkala";
if (Debug.shouldDelegate(ba, "btndowneshan_click", false))
	 {return ((String) Debug.delegate(ba, "btndowneshan_click", null));}
int _a = 0;
RDebugUtils.currentLine=102694912;
 //BA.debugLineNum = 102694912;BA.debugLine="Sub BtnDownEshan_Click";
RDebugUtils.currentLine=102694913;
 //BA.debugLineNum = 102694913;BA.debugLine="Try";
try {RDebugUtils.currentLine=102694914;
 //BA.debugLineNum = 102694914;BA.debugLine="If Item.FldEshantion>0 Then";
if ((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FldEshantion /*String*/ ))>0) { 
RDebugUtils.currentLine=102694915;
 //BA.debugLineNum = 102694915;BA.debugLine="If MCode.EshantionRemove=0 And MCode.EshantionT";
if ((_mcode._eshantionremove /*String*/ ).equals(BA.NumberToString(0)) && (_mcode._eshantiontabaghati /*String*/ ).equals(BA.NumberToString(1))) { 
RDebugUtils.currentLine=102694916;
 //BA.debugLineNum = 102694916;BA.debugLine="ToastMessageShow(\"شما مجوز حذف قلم اشانتیون را";
__c.ToastMessageShow(BA.ObjectToCharSequence("شما مجوز حذف قلم اشانتیون را ندارید"),__c.False);
RDebugUtils.currentLine=102694917;
 //BA.debugLineNum = 102694917;BA.debugLine="Return";
if (true) return "";
 };
 };
RDebugUtils.currentLine=102694920;
 //BA.debugLineNum = 102694920;BA.debugLine="Dim A As Int = 0";
_a = (int) (0);
RDebugUtils.currentLine=102694921;
 //BA.debugLineNum = 102694921;BA.debugLine="A = Item.FldEshantion";
_a = (int)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FldEshantion /*String*/ ));
RDebugUtils.currentLine=102694922;
 //BA.debugLineNum = 102694922;BA.debugLine="If A > 0 Then";
if (_a>0) { 
RDebugUtils.currentLine=102694923;
 //BA.debugLineNum = 102694923;BA.debugLine="A = A - 1";
_a = (int) (_a-1);
RDebugUtils.currentLine=102694924;
 //BA.debugLineNum = 102694924;BA.debugLine="Item.SumMande = Item.SumMande + 1";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/  = BA.NumberToString((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/ ))+1);
RDebugUtils.currentLine=102694925;
 //BA.debugLineNum = 102694925;BA.debugLine="Item.FldEshantion  = A";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .FldEshantion /*String*/  = BA.NumberToString(_a);
RDebugUtils.currentLine=102694926;
 //BA.debugLineNum = 102694926;BA.debugLine="If A=0 Then";
if (_a==0) { 
RDebugUtils.currentLine=102694927;
 //BA.debugLineNum = 102694927;BA.debugLine="Item.fldDarsadTakhfif=0";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldDarsadTakhfif /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=102694928;
 //BA.debugLineNum = 102694928;BA.debugLine="Item.MablaghTakhfif=0";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .MablaghTakhfif /*int*/  = (int) (0);
RDebugUtils.currentLine=102694929;
 //BA.debugLineNum = 102694929;BA.debugLine="Item.Tozihat=\"\"";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .Tozihat /*String*/  = "";
 };
 };
RDebugUtils.currentLine=102694932;
 //BA.debugLineNum = 102694932;BA.debugLine="AddToSabad";
__ref._addtosabad /*String*/ (null);
RDebugUtils.currentLine=102694933;
 //BA.debugLineNum = 102694933;BA.debugLine="CallSubDelayed3(Act_KalaDefault,\"DownEshantion\",";
__c.CallSubDelayed3(ba,(Object)(_act_kaladefault.getObject()),"DownEshantion",(Object)(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ ),(Object)(_a));
 } 
       catch (Exception e23) {
			ba.setLastException(e23);RDebugUtils.currentLine=102694935;
 //BA.debugLineNum = 102694935;BA.debugLine="MCode.SendError(LastException)";
_mcode._senderror /*String*/ (ba,BA.ObjectToString(__c.LastException(ba)));
RDebugUtils.currentLine=102694936;
 //BA.debugLineNum = 102694936;BA.debugLine="Log(LastException)";
__c.LogImpl("5102694936",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=102694938;
 //BA.debugLineNum = 102694938;BA.debugLine="End Sub";
return "";
}
public String  _btndownjoz_click(ir.parsikhesab.pakhsh.cls_recdefultkala __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recdefultkala";
if (Debug.shouldDelegate(ba, "btndownjoz_click", false))
	 {return ((String) Debug.delegate(ba, "btndownjoz_click", null));}
float _a = 0f;
float _val = 0f;
RDebugUtils.currentLine=101908480;
 //BA.debugLineNum = 101908480;BA.debugLine="Sub BtnDownJoz_Click";
RDebugUtils.currentLine=101908482;
 //BA.debugLineNum = 101908482;BA.debugLine="Dim A As Float = 0";
_a = (float) (0);
RDebugUtils.currentLine=101908483;
 //BA.debugLineNum = 101908483;BA.debugLine="Dim Val As Float = 0";
_val = (float) (0);
RDebugUtils.currentLine=101908488;
 //BA.debugLineNum = 101908488;BA.debugLine="Val = 1";
_val = (float) (1);
RDebugUtils.currentLine=101908491;
 //BA.debugLineNum = 101908491;BA.debugLine="A = Item.TedadDarSabadJoz";
_a = (float)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadJoz /*String*/ ));
RDebugUtils.currentLine=101908492;
 //BA.debugLineNum = 101908492;BA.debugLine="If A > 0 Then";
if (_a>0) { 
RDebugUtils.currentLine=101908493;
 //BA.debugLineNum = 101908493;BA.debugLine="A = A - Val";
_a = (float) (_a-_val);
RDebugUtils.currentLine=101908494;
 //BA.debugLineNum = 101908494;BA.debugLine="Item.SumMande = Item.SumMande + Val";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/  = BA.NumberToString((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/ ))+_val);
RDebugUtils.currentLine=101908495;
 //BA.debugLineNum = 101908495;BA.debugLine="Item.TedadDarSabadJoz = A";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadJoz /*String*/  = BA.NumberToString(_a);
 };
RDebugUtils.currentLine=101908505;
 //BA.debugLineNum = 101908505;BA.debugLine="AddToSabad";
__ref._addtosabad /*String*/ (null);
RDebugUtils.currentLine=101908507;
 //BA.debugLineNum = 101908507;BA.debugLine="If MCode.EshantionGroup=1 Then";
if ((_mcode._eshantiongroup /*String*/ ).equals(BA.NumberToString(1))) { 
RDebugUtils.currentLine=101908511;
 //BA.debugLineNum = 101908511;BA.debugLine="CallSubDelayed2(Act_KalaDefault,\"AddEshantionGro";
__c.CallSubDelayed2(ba,(Object)(_act_kaladefault.getObject()),"AddEshantionGroup",(Object)(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .CodeGroup /*String*/ ));
 };
RDebugUtils.currentLine=101908514;
 //BA.debugLineNum = 101908514;BA.debugLine="End Sub";
return "";
}
public String  _btndownkol_click(ir.parsikhesab.pakhsh.cls_recdefultkala __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recdefultkala";
if (Debug.shouldDelegate(ba, "btndownkol_click", false))
	 {return ((String) Debug.delegate(ba, "btndownkol_click", null));}
float _a = 0f;
float _val = 0f;
RDebugUtils.currentLine=102039552;
 //BA.debugLineNum = 102039552;BA.debugLine="Sub BtnDownKol_Click";
RDebugUtils.currentLine=102039565;
 //BA.debugLineNum = 102039565;BA.debugLine="If Item.TedadDarKarton=0 Then";
if ((__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarKarton /*String*/ ).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=102039566;
 //BA.debugLineNum = 102039566;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=102039568;
 //BA.debugLineNum = 102039568;BA.debugLine="Dim A As Float = 0";
_a = (float) (0);
RDebugUtils.currentLine=102039569;
 //BA.debugLineNum = 102039569;BA.debugLine="Dim Val As Float = 1";
_val = (float) (1);
RDebugUtils.currentLine=102039572;
 //BA.debugLineNum = 102039572;BA.debugLine="A = Item.TedadDarSabadKol";
_a = (float)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadKol /*String*/ ));
RDebugUtils.currentLine=102039573;
 //BA.debugLineNum = 102039573;BA.debugLine="A = A - 1";
_a = (float) (_a-1);
RDebugUtils.currentLine=102039574;
 //BA.debugLineNum = 102039574;BA.debugLine="Item.SumMandeKarton = Item.SumMandeKarton + Val";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMandeKarton /*String*/  = BA.NumberToString((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMandeKarton /*String*/ ))+_val);
RDebugUtils.currentLine=102039575;
 //BA.debugLineNum = 102039575;BA.debugLine="Item.TedadDarSabadKol = A";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadKol /*String*/  = BA.NumberToString(_a);
RDebugUtils.currentLine=102039577;
 //BA.debugLineNum = 102039577;BA.debugLine="AddToSabad";
__ref._addtosabad /*String*/ (null);
RDebugUtils.currentLine=102039578;
 //BA.debugLineNum = 102039578;BA.debugLine="If MCode.EshantionGroup=1 Then";
if ((_mcode._eshantiongroup /*String*/ ).equals(BA.NumberToString(1))) { 
RDebugUtils.currentLine=102039582;
 //BA.debugLineNum = 102039582;BA.debugLine="CallSubDelayed2(Act_KalaDefault,\"AddEshantionGro";
__c.CallSubDelayed2(ba,(Object)(_act_kaladefault.getObject()),"AddEshantionGroup",(Object)(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .CodeGroup /*String*/ ));
 };
RDebugUtils.currentLine=102039585;
 //BA.debugLineNum = 102039585;BA.debugLine="End Sub";
return "";
}
public String  _btnupjoz_click(ir.parsikhesab.pakhsh.cls_recdefultkala __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recdefultkala";
if (Debug.shouldDelegate(ba, "btnupjoz_click", false))
	 {return ((String) Debug.delegate(ba, "btnupjoz_click", null));}
float _a = 0f;
float _val = 0f;
RDebugUtils.currentLine=101777408;
 //BA.debugLineNum = 101777408;BA.debugLine="Sub BtnUpJoz_Click";
RDebugUtils.currentLine=101777409;
 //BA.debugLineNum = 101777409;BA.debugLine="Dim A As Float = 0";
_a = (float) (0);
RDebugUtils.currentLine=101777410;
 //BA.debugLineNum = 101777410;BA.debugLine="Dim Val As Float = 0";
_val = (float) (0);
RDebugUtils.currentLine=101777415;
 //BA.debugLineNum = 101777415;BA.debugLine="Val = 1";
_val = (float) (1);
RDebugUtils.currentLine=101777417;
 //BA.debugLineNum = 101777417;BA.debugLine="If	Item.TedadDarSabadJoz=Null Then";
if (__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadJoz /*String*/ == null) { 
RDebugUtils.currentLine=101777418;
 //BA.debugLineNum = 101777418;BA.debugLine="Item.TedadDarSabadJoz=0";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadJoz /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=101777419;
 //BA.debugLineNum = 101777419;BA.debugLine="LblTedadJoz.Text=0";
__ref._lbltedadjoz /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(0));
 };
RDebugUtils.currentLine=101777422;
 //BA.debugLineNum = 101777422;BA.debugLine="A = Item.TedadDarSabadJoz";
_a = (float)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadJoz /*String*/ ));
RDebugUtils.currentLine=101777423;
 //BA.debugLineNum = 101777423;BA.debugLine="If MCode.ForooshBishAzMojoodi = \"1\" Then";
if ((_mcode._forooshbishazmojoodi /*String*/ ).equals("1")) { 
RDebugUtils.currentLine=101777424;
 //BA.debugLineNum = 101777424;BA.debugLine="A = A + Val";
_a = (float) (_a+_val);
RDebugUtils.currentLine=101777425;
 //BA.debugLineNum = 101777425;BA.debugLine="Item.SumMande = Item.SumMande - Val";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/  = BA.NumberToString((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/ ))-_val);
 }else 
{RDebugUtils.currentLine=101777426;
 //BA.debugLineNum = 101777426;BA.debugLine="Else if MCode.ForooshBishAzMojoodi = \"0\" Then";
if ((_mcode._forooshbishazmojoodi /*String*/ ).equals("0")) { 
RDebugUtils.currentLine=101777427;
 //BA.debugLineNum = 101777427;BA.debugLine="If MCode.Action=\"SabtMarjooii\" Then";
if ((_mcode._action /*String*/ ).equals("SabtMarjooii")) { 
RDebugUtils.currentLine=101777428;
 //BA.debugLineNum = 101777428;BA.debugLine="A = A + Val";
_a = (float) (_a+_val);
RDebugUtils.currentLine=101777429;
 //BA.debugLineNum = 101777429;BA.debugLine="Item.SumMande = Item.SumMande - Val";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/  = BA.NumberToString((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/ ))-_val);
 }else {
RDebugUtils.currentLine=101777431;
 //BA.debugLineNum = 101777431;BA.debugLine="If Item.SumMande > 0 Then";
if ((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/ ))>0) { 
RDebugUtils.currentLine=101777432;
 //BA.debugLineNum = 101777432;BA.debugLine="A = A + Val";
_a = (float) (_a+_val);
RDebugUtils.currentLine=101777433;
 //BA.debugLineNum = 101777433;BA.debugLine="Item.SumMande = Item.SumMande - Val";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/  = BA.NumberToString((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMande /*String*/ ))-_val);
 }else {
RDebugUtils.currentLine=101777435;
 //BA.debugLineNum = 101777435;BA.debugLine="ToastMessageShow(\"سفارش شما بیشتر از موجودی می";
__c.ToastMessageShow(BA.ObjectToCharSequence("سفارش شما بیشتر از موجودی می باشد"),__c.True);
 };
 };
 }}
;
RDebugUtils.currentLine=101777439;
 //BA.debugLineNum = 101777439;BA.debugLine="Item.TedadDarSabadJoz = A";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadJoz /*String*/  = BA.NumberToString(_a);
RDebugUtils.currentLine=101777450;
 //BA.debugLineNum = 101777450;BA.debugLine="AddToSabad";
__ref._addtosabad /*String*/ (null);
RDebugUtils.currentLine=101777452;
 //BA.debugLineNum = 101777452;BA.debugLine="If MCode.EshantionGroup=1 Then";
if ((_mcode._eshantiongroup /*String*/ ).equals(BA.NumberToString(1))) { 
RDebugUtils.currentLine=101777456;
 //BA.debugLineNum = 101777456;BA.debugLine="CallSubDelayed2(Act_KalaDefault,\"AddEshantionGro";
__c.CallSubDelayed2(ba,(Object)(_act_kaladefault.getObject()),"AddEshantionGroup",(Object)(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .CodeGroup /*String*/ ));
 };
RDebugUtils.currentLine=101777459;
 //BA.debugLineNum = 101777459;BA.debugLine="End Sub";
return "";
}
public String  _btnupkol_click(ir.parsikhesab.pakhsh.cls_recdefultkala __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recdefultkala";
if (Debug.shouldDelegate(ba, "btnupkol_click", false))
	 {return ((String) Debug.delegate(ba, "btnupkol_click", null));}
float _a = 0f;
float _val = 0f;
RDebugUtils.currentLine=101974016;
 //BA.debugLineNum = 101974016;BA.debugLine="Sub BtnUpKol_Click";
RDebugUtils.currentLine=101974018;
 //BA.debugLineNum = 101974018;BA.debugLine="If Item.TedadDarKarton=0 Then";
if ((__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarKarton /*String*/ ).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=101974019;
 //BA.debugLineNum = 101974019;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=101974021;
 //BA.debugLineNum = 101974021;BA.debugLine="Dim A As Float = 0";
_a = (float) (0);
RDebugUtils.currentLine=101974022;
 //BA.debugLineNum = 101974022;BA.debugLine="Dim Val As Float = 1";
_val = (float) (1);
RDebugUtils.currentLine=101974025;
 //BA.debugLineNum = 101974025;BA.debugLine="A = Item.TedadDarSabadKol";
_a = (float)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadKol /*String*/ ));
RDebugUtils.currentLine=101974026;
 //BA.debugLineNum = 101974026;BA.debugLine="If MCode.Action=\"SabtMarjooii\" Then";
if ((_mcode._action /*String*/ ).equals("SabtMarjooii")) { 
RDebugUtils.currentLine=101974027;
 //BA.debugLineNum = 101974027;BA.debugLine="A = A + 1";
_a = (float) (_a+1);
RDebugUtils.currentLine=101974028;
 //BA.debugLineNum = 101974028;BA.debugLine="Item.SumMandeKarton = Item.SumMandeKarton - Val";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMandeKarton /*String*/  = BA.NumberToString((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMandeKarton /*String*/ ))-_val);
 }else {
RDebugUtils.currentLine=101974030;
 //BA.debugLineNum = 101974030;BA.debugLine="If MCode.ForooshBishAzMojoodi = \"1\" Then";
if ((_mcode._forooshbishazmojoodi /*String*/ ).equals("1")) { 
RDebugUtils.currentLine=101974031;
 //BA.debugLineNum = 101974031;BA.debugLine="A = A + 1";
_a = (float) (_a+1);
RDebugUtils.currentLine=101974032;
 //BA.debugLineNum = 101974032;BA.debugLine="Item.SumMandeKarton = Item.SumMandeKarton - Val";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMandeKarton /*String*/  = BA.NumberToString((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMandeKarton /*String*/ ))-_val);
 }else 
{RDebugUtils.currentLine=101974033;
 //BA.debugLineNum = 101974033;BA.debugLine="Else if MCode.ForooshBishAzMojoodi = \"0\" Then";
if ((_mcode._forooshbishazmojoodi /*String*/ ).equals("0")) { 
RDebugUtils.currentLine=101974034;
 //BA.debugLineNum = 101974034;BA.debugLine="If Item.SumMandeKarton > 0 Then";
if ((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMandeKarton /*String*/ ))>0) { 
RDebugUtils.currentLine=101974035;
 //BA.debugLineNum = 101974035;BA.debugLine="A = A + Val";
_a = (float) (_a+_val);
RDebugUtils.currentLine=101974036;
 //BA.debugLineNum = 101974036;BA.debugLine="Item.SumMandeKarton = Item.SumMandeKarton - Va";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMandeKarton /*String*/  = BA.NumberToString((double)(Double.parseDouble(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .SumMandeKarton /*String*/ ))-_val);
 }else {
RDebugUtils.currentLine=101974038;
 //BA.debugLineNum = 101974038;BA.debugLine="ToastMessageShow(\"سفارش شما بیشتر از موجودی می";
__c.ToastMessageShow(BA.ObjectToCharSequence("سفارش شما بیشتر از موجودی می باشد"),__c.True);
 };
 }}
;
 };
RDebugUtils.currentLine=101974049;
 //BA.debugLineNum = 101974049;BA.debugLine="Item.TedadDarSabadKol = A";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarSabadKol /*String*/  = BA.NumberToString(_a);
RDebugUtils.currentLine=101974052;
 //BA.debugLineNum = 101974052;BA.debugLine="AddToSabad";
__ref._addtosabad /*String*/ (null);
RDebugUtils.currentLine=101974054;
 //BA.debugLineNum = 101974054;BA.debugLine="If MCode.EshantionGroup=1 Then";
if ((_mcode._eshantiongroup /*String*/ ).equals(BA.NumberToString(1))) { 
RDebugUtils.currentLine=101974058;
 //BA.debugLineNum = 101974058;BA.debugLine="CallSubDelayed2(Act_KalaDefault,\"AddEshantionGro";
__c.CallSubDelayed2(ba,(Object)(_act_kaladefault.getObject()),"AddEshantionGroup",(Object)(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .CodeGroup /*String*/ ));
 };
RDebugUtils.currentLine=101974061;
 //BA.debugLineNum = 101974061;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(ir.parsikhesab.pakhsh.cls_recdefultkala __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recdefultkala";
RDebugUtils.currentLine=101318656;
 //BA.debugLineNum = 101318656;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=101318657;
 //BA.debugLineNum = 101318657;BA.debugLine="Private p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=101318658;
 //BA.debugLineNum = 101318658;BA.debugLine="Private pnl_bk As Panel";
_pnl_bk = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=101318659;
 //BA.debugLineNum = 101318659;BA.debugLine="Private ImageRow As ImageView";
_imagerow = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=101318660;
 //BA.debugLineNum = 101318660;BA.debugLine="Private ImageOff As ImageView";
_imageoff = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=101318662;
 //BA.debugLineNum = 101318662;BA.debugLine="Private lbl_title As Label";
_lbl_title = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=101318663;
 //BA.debugLineNum = 101318663;BA.debugLine="Private ImageCall As ImageView";
_imagecall = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=101318664;
 //BA.debugLineNum = 101318664;BA.debugLine="Private LblFee As Label";
_lblfee = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=101318665;
 //BA.debugLineNum = 101318665;BA.debugLine="Private LblFeeBadAzTakhfid As Label";
_lblfeebadaztakhfid = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=101318666;
 //BA.debugLineNum = 101318666;BA.debugLine="Private LblC_Kala As Label";
_lblc_kala = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=101318667;
 //BA.debugLineNum = 101318667;BA.debugLine="Private ImageTozihat As ImageView";
_imagetozihat = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=101318668;
 //BA.debugLineNum = 101318668;BA.debugLine="Private LblMojoodiJoz As Label";
_lblmojoodijoz = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=101318669;
 //BA.debugLineNum = 101318669;BA.debugLine="Private LblMojoodiKol As Label";
_lblmojoodikol = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=101318670;
 //BA.debugLineNum = 101318670;BA.debugLine="Private LblTedadKarton As Label";
_lbltedadkarton = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=101318671;
 //BA.debugLineNum = 101318671;BA.debugLine="Private BtnUpJoz As Label";
_btnupjoz = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=101318672;
 //BA.debugLineNum = 101318672;BA.debugLine="Private LblTedadJoz As Label";
_lbltedadjoz = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=101318673;
 //BA.debugLineNum = 101318673;BA.debugLine="Private BtnDownJoz As Label";
_btndownjoz = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=101318674;
 //BA.debugLineNum = 101318674;BA.debugLine="Private BtnDownKol As Label";
_btndownkol = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=101318675;
 //BA.debugLineNum = 101318675;BA.debugLine="Private LblTedadkol As Label";
_lbltedadkol = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=101318676;
 //BA.debugLineNum = 101318676;BA.debugLine="Private BtnUpKol As Label";
_btnupkol = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=101318677;
 //BA.debugLineNum = 101318677;BA.debugLine="Private Item As AdapterListKala";
_item = new ir.parsikhesab.pakhsh.mcode._adapterlistkala();
RDebugUtils.currentLine=101318678;
 //BA.debugLineNum = 101318678;BA.debugLine="Private Key As IME";
_key = new anywheresoftware.b4a.objects.IME();
RDebugUtils.currentLine=101318679;
 //BA.debugLineNum = 101318679;BA.debugLine="Private base As Object";
_base = new Object();
RDebugUtils.currentLine=101318680;
 //BA.debugLineNum = 101318680;BA.debugLine="Private BtnDownEshan As Label";
_btndowneshan = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=101318681;
 //BA.debugLineNum = 101318681;BA.debugLine="Private BtnUpEshan As Label";
_btnupeshan = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=101318682;
 //BA.debugLineNum = 101318682;BA.debugLine="Private LblTedadEshan As Label";
_lbltedadeshan = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=101318683;
 //BA.debugLineNum = 101318683;BA.debugLine="Private lblVahedJoz As Label";
_lblvahedjoz = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=101318684;
 //BA.debugLineNum = 101318684;BA.debugLine="Private lblVahedKol As Label";
_lblvahedkol = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=101318685;
 //BA.debugLineNum = 101318685;BA.debugLine="Private LblBuyPrice As Label";
_lblbuyprice = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=101318686;
 //BA.debugLineNum = 101318686;BA.debugLine="Private Panel4 As Panel";
_panel4 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=101318687;
 //BA.debugLineNum = 101318687;BA.debugLine="Private LblGift As Label";
_lblgift = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=101318688;
 //BA.debugLineNum = 101318688;BA.debugLine="Private LblTozihat As Label";
_lbltozihat = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=101318690;
 //BA.debugLineNum = 101318690;BA.debugLine="Private btn_edit_Price As Label";
_btn_edit_price = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=101318691;
 //BA.debugLineNum = 101318691;BA.debugLine="Dim maxkolRond As String";
_maxkolrond = "";
RDebugUtils.currentLine=101318693;
 //BA.debugLineNum = 101318693;BA.debugLine="Private LblCountEshantion As Label";
_lblcounteshantion = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=101318695;
 //BA.debugLineNum = 101318695;BA.debugLine="Private btn_discount As Label";
_btn_discount = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=101318696;
 //BA.debugLineNum = 101318696;BA.debugLine="Private LblMablaghTakhfif As Label";
_lblmablaghtakhfif = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=101318697;
 //BA.debugLineNum = 101318697;BA.debugLine="Private LblMablaghMasrafkonande As Label";
_lblmablaghmasrafkonande = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=101318698;
 //BA.debugLineNum = 101318698;BA.debugLine="Private lblSumMablaghKala As Label";
_lblsummablaghkala = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=101318699;
 //BA.debugLineNum = 101318699;BA.debugLine="Private lblDarsadTakhfif As Label";
_lbldarsadtakhfif = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=101318700;
 //BA.debugLineNum = 101318700;BA.debugLine="Private pnlJoz As Panel";
_pnljoz = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=101318701;
 //BA.debugLineNum = 101318701;BA.debugLine="Private pnlKol As Panel";
_pnlkol = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=101318702;
 //BA.debugLineNum = 101318702;BA.debugLine="Private pnlEshan As Panel";
_pnleshan = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=101318703;
 //BA.debugLineNum = 101318703;BA.debugLine="Private LblCodeGroup As Label";
_lblcodegroup = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=101318704;
 //BA.debugLineNum = 101318704;BA.debugLine="Private LblFeeYekKarton As Label";
_lblfeeyekkarton = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=101318708;
 //BA.debugLineNum = 101318708;BA.debugLine="Private LblDarsadArzeshAfzodeKala As Label";
_lbldarsadarzeshafzodekala = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=101318709;
 //BA.debugLineNum = 101318709;BA.debugLine="Private LblArzeshAfzodeKala As Label";
_lblarzeshafzodekala = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=101318710;
 //BA.debugLineNum = 101318710;BA.debugLine="Private SwDisableArzeshAfzode As ACSwitch";
_swdisablearzeshafzode = new de.amberhome.objects.appcompat.ACSwitchCompatWrapper();
RDebugUtils.currentLine=101318711;
 //BA.debugLineNum = 101318711;BA.debugLine="End Sub";
return "";
}
public String  _disablearzeshafzodekala(ir.parsikhesab.pakhsh.cls_recdefultkala __ref,boolean _checked) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recdefultkala";
if (Debug.shouldDelegate(ba, "disablearzeshafzodekala", false))
	 {return ((String) Debug.delegate(ba, "disablearzeshafzodekala", new Object[] {_checked}));}
RDebugUtils.currentLine=102957056;
 //BA.debugLineNum = 102957056;BA.debugLine="Sub DisableArzeshAfzodeKala(Checked As Boolean)";
RDebugUtils.currentLine=102957057;
 //BA.debugLineNum = 102957057;BA.debugLine="SwDisableArzeshAfzode.Checked=Checked";
__ref._swdisablearzeshafzode /*de.amberhome.objects.appcompat.ACSwitchCompatWrapper*/ .setChecked(_checked);
RDebugUtils.currentLine=102957058;
 //BA.debugLineNum = 102957058;BA.debugLine="End Sub";
return "";
}
public byte[]  _getbytefrombitmap(ir.parsikhesab.pakhsh.cls_recdefultkala __ref,anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _img,int _quality) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recdefultkala";
if (Debug.shouldDelegate(ba, "getbytefrombitmap", false))
	 {return ((byte[]) Debug.delegate(ba, "getbytefrombitmap", new Object[] {_img,_quality}));}
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
byte[] _data = null;
RDebugUtils.currentLine=102563840;
 //BA.debugLineNum = 102563840;BA.debugLine="Sub GetByteFromBitmap(img As Bitmap, Quality As In";
RDebugUtils.currentLine=102563842;
 //BA.debugLineNum = 102563842;BA.debugLine="Dim out As OutputStream";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=102563843;
 //BA.debugLineNum = 102563843;BA.debugLine="Dim data() As Byte";
_data = new byte[(int) (0)];
;
RDebugUtils.currentLine=102563844;
 //BA.debugLineNum = 102563844;BA.debugLine="out.InitializeToBytesArray(1)";
_out.InitializeToBytesArray((int) (1));
RDebugUtils.currentLine=102563845;
 //BA.debugLineNum = 102563845;BA.debugLine="img.WriteToStream(out,Quality,\"JPEG\")";
_img.WriteToStream((java.io.OutputStream)(_out.getObject()),_quality,BA.getEnumFromString(android.graphics.Bitmap.CompressFormat.class,"JPEG"));
RDebugUtils.currentLine=102563846;
 //BA.debugLineNum = 102563846;BA.debugLine="data = out.ToBytesArray";
_data = _out.ToBytesArray();
RDebugUtils.currentLine=102563847;
 //BA.debugLineNum = 102563847;BA.debugLine="out.Close";
_out.Close();
RDebugUtils.currentLine=102563848;
 //BA.debugLineNum = 102563848;BA.debugLine="Return data";
if (true) return _data;
RDebugUtils.currentLine=102563849;
 //BA.debugLineNum = 102563849;BA.debugLine="End Sub";
return null;
}
public String  _getfilename(ir.parsikhesab.pakhsh.cls_recdefultkala __ref,String _fullpath) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recdefultkala";
if (Debug.shouldDelegate(ba, "getfilename", false))
	 {return ((String) Debug.delegate(ba, "getfilename", new Object[] {_fullpath}));}
String _res = "";
RDebugUtils.currentLine=102432768;
 //BA.debugLineNum = 102432768;BA.debugLine="Sub GetFilename(fullpath As String) As String";
RDebugUtils.currentLine=102432769;
 //BA.debugLineNum = 102432769;BA.debugLine="Dim res As String";
_res = "";
RDebugUtils.currentLine=102432770;
 //BA.debugLineNum = 102432770;BA.debugLine="res = fullpath.SubString(fullpath.LastIndexOf(\"/\"";
_res = _fullpath.substring((int) (_fullpath.lastIndexOf("/")+1));
RDebugUtils.currentLine=102432771;
 //BA.debugLineNum = 102432771;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=102432772;
 //BA.debugLineNum = 102432772;BA.debugLine="End Sub";
return "";
}
public String  _imagerow_click(ir.parsikhesab.pakhsh.cls_recdefultkala __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recdefultkala";
if (Debug.shouldDelegate(ba, "imagerow_click", false))
	 {return ((String) Debug.delegate(ba, "imagerow_click", null));}
RDebugUtils.currentLine=102236160;
 //BA.debugLineNum = 102236160;BA.debugLine="Sub ImageRow_Click";
RDebugUtils.currentLine=102236162;
 //BA.debugLineNum = 102236162;BA.debugLine="Act_ImageSlideShow.Item = Item";
_act_imageslideshow._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/  = __ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ ;
RDebugUtils.currentLine=102236163;
 //BA.debugLineNum = 102236163;BA.debugLine="StartActivity(Act_ImageSlideShow)";
__c.StartActivity(ba,(Object)(_act_imageslideshow.getObject()));
RDebugUtils.currentLine=102236167;
 //BA.debugLineNum = 102236167;BA.debugLine="End Sub";
return "";
}
public String  _lbltedadjoz_click(ir.parsikhesab.pakhsh.cls_recdefultkala __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recdefultkala";
if (Debug.shouldDelegate(ba, "lbltedadjoz_click", false))
	 {return ((String) Debug.delegate(ba, "lbltedadjoz_click", null));}
RDebugUtils.currentLine=102301696;
 //BA.debugLineNum = 102301696;BA.debugLine="Sub LblTedadJoz_Click";
RDebugUtils.currentLine=102301698;
 //BA.debugLineNum = 102301698;BA.debugLine="CallSubDelayed2(base,\"LblTedadJoz_Click\",Item)";
__c.CallSubDelayed2(ba,__ref._base /*Object*/ ,"LblTedadJoz_Click",(Object)(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ ));
RDebugUtils.currentLine=102301701;
 //BA.debugLineNum = 102301701;BA.debugLine="End Sub";
return "";
}
public String  _lbltedadkol_click(ir.parsikhesab.pakhsh.cls_recdefultkala __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recdefultkala";
if (Debug.shouldDelegate(ba, "lbltedadkol_click", false))
	 {return ((String) Debug.delegate(ba, "lbltedadkol_click", null));}
RDebugUtils.currentLine=102367232;
 //BA.debugLineNum = 102367232;BA.debugLine="Sub LblTedadKol_Click";
RDebugUtils.currentLine=102367233;
 //BA.debugLineNum = 102367233;BA.debugLine="If myCode.Is_Null_adad(Item.TedadDarKarton)=0 The";
if ((_mycode._is_null_adad /*String*/ (ba,__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .TedadDarKarton /*String*/ )).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=102367234;
 //BA.debugLineNum = 102367234;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=102367237;
 //BA.debugLineNum = 102367237;BA.debugLine="CallSubDelayed2(base,\"LblTedadKol_Click\",Item)";
__c.CallSubDelayed2(ba,__ref._base /*Object*/ ,"LblTedadKol_Click",(Object)(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ ));
RDebugUtils.currentLine=102367240;
 //BA.debugLineNum = 102367240;BA.debugLine="End Sub";
return "";
}
public String  _lbltozihat_click(ir.parsikhesab.pakhsh.cls_recdefultkala __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recdefultkala";
if (Debug.shouldDelegate(ba, "lbltozihat_click", false))
	 {return ((String) Debug.delegate(ba, "lbltozihat_click", null));}
RDebugUtils.currentLine=101711872;
 //BA.debugLineNum = 101711872;BA.debugLine="Sub LblTozihat_Click";
RDebugUtils.currentLine=101711873;
 //BA.debugLineNum = 101711873;BA.debugLine="If myCode.Is_Null(Item.fldSharh) <> \"\" Then";
if ((_mycode._is_null /*String*/ (ba,__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldSharh /*String*/ )).equals("") == false) { 
RDebugUtils.currentLine=101711874;
 //BA.debugLineNum = 101711874;BA.debugLine="Msgbox(myCode.Is_Null(Item.fldSharh),\"توضیحات کا";
__c.Msgbox(BA.ObjectToCharSequence(_mycode._is_null /*String*/ (ba,__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ .fldSharh /*String*/ )),BA.ObjectToCharSequence("توضیحات کالا"),ba);
 }else {
RDebugUtils.currentLine=101711876;
 //BA.debugLineNum = 101711876;BA.debugLine="ToastMessageShow(\"این کالا فاقد توضیحات است\",Fa";
__c.ToastMessageShow(BA.ObjectToCharSequence("این کالا فاقد توضیحات است"),__c.False);
 };
RDebugUtils.currentLine=101711878;
 //BA.debugLineNum = 101711878;BA.debugLine="End Sub";
return "";
}
public String  _mojavezsefaresh(ir.parsikhesab.pakhsh.cls_recdefultkala __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recdefultkala";
if (Debug.shouldDelegate(ba, "mojavezsefaresh", false))
	 {return ((String) Debug.delegate(ba, "mojavezsefaresh", null));}
RDebugUtils.currentLine=101646336;
 //BA.debugLineNum = 101646336;BA.debugLine="Private Sub MojavezSefaresh";
RDebugUtils.currentLine=101646337;
 //BA.debugLineNum = 101646337;BA.debugLine="Select MCode.MojavezSefaresh";
switch (BA.switchObjectToInt(_mcode._mojavezsefaresh /*String*/ ,BA.NumberToString(0),BA.NumberToString(1),BA.NumberToString(2))) {
case 0: {
RDebugUtils.currentLine=101646339;
 //BA.debugLineNum = 101646339;BA.debugLine="BtnUpJoz.Enabled=True";
__ref._btnupjoz /*anywheresoftware.b4a.objects.LabelWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=101646340;
 //BA.debugLineNum = 101646340;BA.debugLine="BtnDownJoz.Enabled=True";
__ref._btndownjoz /*anywheresoftware.b4a.objects.LabelWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=101646341;
 //BA.debugLineNum = 101646341;BA.debugLine="pnlJoz.Enabled=True";
__ref._pnljoz /*anywheresoftware.b4a.objects.PanelWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=101646342;
 //BA.debugLineNum = 101646342;BA.debugLine="LblTedadJoz.Enabled=True";
__ref._lbltedadjoz /*anywheresoftware.b4a.objects.LabelWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=101646344;
 //BA.debugLineNum = 101646344;BA.debugLine="BtnUpKol.Enabled=True";
__ref._btnupkol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=101646345;
 //BA.debugLineNum = 101646345;BA.debugLine="BtnDownKol.Enabled=True";
__ref._btndownkol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=101646346;
 //BA.debugLineNum = 101646346;BA.debugLine="pnlKol.Enabled=True";
__ref._pnlkol /*anywheresoftware.b4a.objects.PanelWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=101646347;
 //BA.debugLineNum = 101646347;BA.debugLine="LblTedadkol.Enabled=True";
__ref._lbltedadkol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setEnabled(__c.True);
 break; }
case 1: {
RDebugUtils.currentLine=101646349;
 //BA.debugLineNum = 101646349;BA.debugLine="BtnUpJoz.Enabled=True";
__ref._btnupjoz /*anywheresoftware.b4a.objects.LabelWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=101646350;
 //BA.debugLineNum = 101646350;BA.debugLine="BtnDownJoz.Enabled=True";
__ref._btndownjoz /*anywheresoftware.b4a.objects.LabelWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=101646351;
 //BA.debugLineNum = 101646351;BA.debugLine="pnlJoz.Enabled=True";
__ref._pnljoz /*anywheresoftware.b4a.objects.PanelWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=101646352;
 //BA.debugLineNum = 101646352;BA.debugLine="LblTedadJoz.Enabled=True";
__ref._lbltedadjoz /*anywheresoftware.b4a.objects.LabelWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=101646354;
 //BA.debugLineNum = 101646354;BA.debugLine="BtnUpKol.Enabled=False";
__ref._btnupkol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=101646355;
 //BA.debugLineNum = 101646355;BA.debugLine="BtnDownKol.Enabled=False";
__ref._btndownkol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=101646356;
 //BA.debugLineNum = 101646356;BA.debugLine="pnlKol.Enabled=False";
__ref._pnlkol /*anywheresoftware.b4a.objects.PanelWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=101646357;
 //BA.debugLineNum = 101646357;BA.debugLine="LblTedadkol.Enabled=False";
__ref._lbltedadkol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setEnabled(__c.False);
 break; }
case 2: {
RDebugUtils.currentLine=101646359;
 //BA.debugLineNum = 101646359;BA.debugLine="BtnUpJoz.Enabled=False";
__ref._btnupjoz /*anywheresoftware.b4a.objects.LabelWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=101646360;
 //BA.debugLineNum = 101646360;BA.debugLine="BtnDownJoz.Enabled=False";
__ref._btndownjoz /*anywheresoftware.b4a.objects.LabelWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=101646361;
 //BA.debugLineNum = 101646361;BA.debugLine="pnlJoz.Enabled=False";
__ref._pnljoz /*anywheresoftware.b4a.objects.PanelWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=101646362;
 //BA.debugLineNum = 101646362;BA.debugLine="LblTedadJoz.Enabled=False";
__ref._lbltedadjoz /*anywheresoftware.b4a.objects.LabelWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=101646364;
 //BA.debugLineNum = 101646364;BA.debugLine="BtnUpKol.Enabled=True";
__ref._btnupkol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=101646365;
 //BA.debugLineNum = 101646365;BA.debugLine="BtnDownKol.Enabled=True";
__ref._btndownkol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=101646366;
 //BA.debugLineNum = 101646366;BA.debugLine="pnlKol.Enabled=True";
__ref._pnlkol /*anywheresoftware.b4a.objects.PanelWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=101646367;
 //BA.debugLineNum = 101646367;BA.debugLine="LblTedadkol.Enabled=True";
__ref._lbltedadkol /*anywheresoftware.b4a.objects.LabelWrapper*/ .setEnabled(__c.True);
 break; }
}
;
RDebugUtils.currentLine=101646369;
 //BA.debugLineNum = 101646369;BA.debugLine="End Sub";
return "";
}
public String  _pnl_bk_click(ir.parsikhesab.pakhsh.cls_recdefultkala __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recdefultkala";
if (Debug.shouldDelegate(ba, "pnl_bk_click", false))
	 {return ((String) Debug.delegate(ba, "pnl_bk_click", null));}
RDebugUtils.currentLine=102825984;
 //BA.debugLineNum = 102825984;BA.debugLine="Sub pnl_bk_Click";
RDebugUtils.currentLine=102825987;
 //BA.debugLineNum = 102825987;BA.debugLine="End Sub";
return "";
}
public String  _swdisablearzeshafzode_checkedchange(ir.parsikhesab.pakhsh.cls_recdefultkala __ref,boolean _checked) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recdefultkala";
if (Debug.shouldDelegate(ba, "swdisablearzeshafzode_checkedchange", false))
	 {return ((String) Debug.delegate(ba, "swdisablearzeshafzode_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=103022592;
 //BA.debugLineNum = 103022592;BA.debugLine="Private Sub SwDisableArzeshAfzode_CheckedChange(Ch";
RDebugUtils.currentLine=103022593;
 //BA.debugLineNum = 103022593;BA.debugLine="CallSubDelayed3(base,\"DisableArzeshAfzode\",Item,S";
__c.CallSubDelayed3(ba,__ref._base /*Object*/ ,"DisableArzeshAfzode",(Object)(__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistkala*/ ),(Object)(__ref._swdisablearzeshafzode /*de.amberhome.objects.appcompat.ACSwitchCompatWrapper*/ ));
RDebugUtils.currentLine=103022594;
 //BA.debugLineNum = 103022594;BA.debugLine="End Sub";
return "";
}
public String  _writebitmap2file(ir.parsikhesab.pakhsh.cls_recdefultkala __ref,anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _image,int _quality,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_recdefultkala";
if (Debug.shouldDelegate(ba, "writebitmap2file", false))
	 {return ((String) Debug.delegate(ba, "writebitmap2file", new Object[] {_image,_quality,_filename}));}
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
byte[] _data = null;
RDebugUtils.currentLine=102498304;
 //BA.debugLineNum = 102498304;BA.debugLine="Sub WriteBitmap2File(Image As Bitmap, Quality As I";
RDebugUtils.currentLine=102498305;
 //BA.debugLineNum = 102498305;BA.debugLine="Try";
try {RDebugUtils.currentLine=102498306;
 //BA.debugLineNum = 102498306;BA.debugLine="Dim out As OutputStream = File.OpenOutput(Starte";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = __c.File.OpenOutput(_starter._sharedfolder /*String*/ ,_filename,__c.False);
RDebugUtils.currentLine=102498307;
 //BA.debugLineNum = 102498307;BA.debugLine="Dim data() As Byte = GetByteFromBitmap(Image, Qu";
_data = __ref._getbytefrombitmap /*byte[]*/ (null,_image,_quality);
RDebugUtils.currentLine=102498308;
 //BA.debugLineNum = 102498308;BA.debugLine="out.WriteBytes(data, 0, data.Length)";
_out.WriteBytes(_data,(int) (0),_data.length);
 } 
       catch (Exception e6) {
			ba.setLastException(e6);RDebugUtils.currentLine=102498310;
 //BA.debugLineNum = 102498310;BA.debugLine="Log(DateTime.Date(DateTime.Now)&\"=\"&\"WriteBitmap";
__c.LogImpl("5102498310",__c.DateTime.Date(__c.DateTime.getNow())+"="+"WriteBitmap2File",0);
 };
RDebugUtils.currentLine=102498312;
 //BA.debugLineNum = 102498312;BA.debugLine="out.Close";
_out.Close();
RDebugUtils.currentLine=102498313;
 //BA.debugLineNum = 102498313;BA.debugLine="End Sub";
return "";
}
}