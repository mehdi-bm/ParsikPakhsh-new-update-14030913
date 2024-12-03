package ir.parsikhesab.pakhsh;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class cls_factor3_type2 extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "ir.parsikhesab.pakhsh.cls_factor3_type2");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", ir.parsikhesab.pakhsh.cls_factor3_type2.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.ImageViewWrapper _imgsign = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblsumfaktor = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblsumpardakht = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltozihat = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblsigns = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblsumkoltakhfif = null;
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
public String  _initialize(ir.parsikhesab.pakhsh.cls_factor3_type2 __ref,anywheresoftware.b4a.BA _ba,String _sumfaktor,String _sumpardakht,String _vaziatpardakht,String _sumkhales,String _sumtakhfifkala,String _sumtahkfifvizhe,String _sumkoltakhfif,String _tozihat,String _signaturebitmapstring) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cls_factor3_type2";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_sumfaktor,_sumpardakht,_vaziatpardakht,_sumkhales,_sumtakhfifkala,_sumtahkfifvizhe,_sumkoltakhfif,_tozihat,_signaturebitmapstring}));}
String _str2 = "";
RDebugUtils.currentLine=87818240;
 //BA.debugLineNum = 87818240;BA.debugLine="Public Sub Initialize(sumFaktor,sumPardakht,Vaziat";
RDebugUtils.currentLine=87818241;
 //BA.debugLineNum = 87818241;BA.debugLine="p.Initialize(\"\")";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=87818242;
 //BA.debugLineNum = 87818242;BA.debugLine="p.SetLayout(0,0,100%x,100%y)";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .SetLayout((int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
RDebugUtils.currentLine=87818243;
 //BA.debugLineNum = 87818243;BA.debugLine="p.LoadLayout(\"l_faktor3_type2\")";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .LoadLayout("l_faktor3_type2",ba);
RDebugUtils.currentLine=87818244;
 //BA.debugLineNum = 87818244;BA.debugLine="lblSumFaktor.Text=sumFaktor";
__ref._lblsumfaktor /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_sumfaktor));
RDebugUtils.currentLine=87818245;
 //BA.debugLineNum = 87818245;BA.debugLine="lblSumPardakht.Text=sumPardakht";
__ref._lblsumpardakht /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_sumpardakht));
RDebugUtils.currentLine=87818246;
 //BA.debugLineNum = 87818246;BA.debugLine="lblSumKolTakhfif.Text=SumKolTakhfif";
__ref._lblsumkoltakhfif /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_sumkoltakhfif));
RDebugUtils.currentLine=87818247;
 //BA.debugLineNum = 87818247;BA.debugLine="lblTozihat.Text=Tozihat";
__ref._lbltozihat /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_tozihat));
RDebugUtils.currentLine=87818253;
 //BA.debugLineNum = 87818253;BA.debugLine="Try";
try {RDebugUtils.currentLine=87818255;
 //BA.debugLineNum = 87818255;BA.debugLine="Log(\"FldSignatureBitmapString: \" & SignatureBitm";
__c.LogImpl("587818255","FldSignatureBitmapString: "+_signaturebitmapstring,0);
RDebugUtils.currentLine=87818256;
 //BA.debugLineNum = 87818256;BA.debugLine="Log(SignatureBitmapString)";
__c.LogImpl("587818256",_signaturebitmapstring,0);
RDebugUtils.currentLine=87818257;
 //BA.debugLineNum = 87818257;BA.debugLine="Log(SignatureBitmapString.Length)";
__c.LogImpl("587818257",BA.NumberToString(_signaturebitmapstring.length()),0);
RDebugUtils.currentLine=87818259;
 //BA.debugLineNum = 87818259;BA.debugLine="Dim str2 As String=MCode.Decrypted(SignatureBitm";
_str2 = _mcode._decrypted /*String*/ (ba,_signaturebitmapstring);
RDebugUtils.currentLine=87818260;
 //BA.debugLineNum = 87818260;BA.debugLine="If SignatureBitmapString<>\"\" Then";
if ((_signaturebitmapstring).equals("") == false) { 
RDebugUtils.currentLine=87818262;
 //BA.debugLineNum = 87818262;BA.debugLine="imgSign.Bitmap=ReadBlob(str2.Trim)";
__ref._imgsign /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .setBitmap((android.graphics.Bitmap)(__ref._readblob /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ (null,_str2.trim()).getObject()));
 };
 } 
       catch (Exception e17) {
			ba.setLastException(e17);RDebugUtils.currentLine=87818265;
 //BA.debugLineNum = 87818265;BA.debugLine="lblSignS.Text=\"\"";
__ref._lblsigns /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=87818266;
 //BA.debugLineNum = 87818266;BA.debugLine="imgSign.Visible=True";
__ref._imgsign /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=87818267;
 //BA.debugLineNum = 87818267;BA.debugLine="Log(\"error emza....\")";
__c.LogImpl("587818267","error emza....",0);
 };
RDebugUtils.currentLine=87818269;
 //BA.debugLineNum = 87818269;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _getpanel(ir.parsikhesab.pakhsh.cls_factor3_type2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_factor3_type2";
if (Debug.shouldDelegate(ba, "getpanel", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "getpanel", null));}
RDebugUtils.currentLine=87883776;
 //BA.debugLineNum = 87883776;BA.debugLine="Public Sub getPanel As Panel";
RDebugUtils.currentLine=87883777;
 //BA.debugLineNum = 87883777;BA.debugLine="pnl_bk.RemoveView";
__ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .RemoveView();
RDebugUtils.currentLine=87883778;
 //BA.debugLineNum = 87883778;BA.debugLine="Return pnl_bk";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ ;
RDebugUtils.currentLine=87883779;
 //BA.debugLineNum = 87883779;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(ir.parsikhesab.pakhsh.cls_factor3_type2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_factor3_type2";
RDebugUtils.currentLine=87752704;
 //BA.debugLineNum = 87752704;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=87752705;
 //BA.debugLineNum = 87752705;BA.debugLine="Private p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=87752706;
 //BA.debugLineNum = 87752706;BA.debugLine="Private pnl_bk As Panel";
_pnl_bk = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=87752709;
 //BA.debugLineNum = 87752709;BA.debugLine="Private imgSign As ImageView";
_imgsign = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=87752710;
 //BA.debugLineNum = 87752710;BA.debugLine="Private lblSumFaktor As Label";
_lblsumfaktor = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=87752711;
 //BA.debugLineNum = 87752711;BA.debugLine="Private lblSumPardakht As Label";
_lblsumpardakht = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=87752712;
 //BA.debugLineNum = 87752712;BA.debugLine="Private lblTozihat As Label";
_lbltozihat = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=87752713;
 //BA.debugLineNum = 87752713;BA.debugLine="Private lblSignS As Label";
_lblsigns = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=87752714;
 //BA.debugLineNum = 87752714;BA.debugLine="Private lblSumKolTakhfif As Label";
_lblsumkoltakhfif = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=87752715;
 //BA.debugLineNum = 87752715;BA.debugLine="End Sub";
return "";
}
public int  _getheight(ir.parsikhesab.pakhsh.cls_factor3_type2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_factor3_type2";
if (Debug.shouldDelegate(ba, "getheight", false))
	 {return ((Integer) Debug.delegate(ba, "getheight", null));}
RDebugUtils.currentLine=88014848;
 //BA.debugLineNum = 88014848;BA.debugLine="Public Sub getHeight As Int";
RDebugUtils.currentLine=88014849;
 //BA.debugLineNum = 88014849;BA.debugLine="Return pnl_bk.Height";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight();
RDebugUtils.currentLine=88014850;
 //BA.debugLineNum = 88014850;BA.debugLine="End Sub";
return 0;
}
public int  _getleft(ir.parsikhesab.pakhsh.cls_factor3_type2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_factor3_type2";
if (Debug.shouldDelegate(ba, "getleft", false))
	 {return ((Integer) Debug.delegate(ba, "getleft", null));}
RDebugUtils.currentLine=88145920;
 //BA.debugLineNum = 88145920;BA.debugLine="Public Sub getLeft As Int";
RDebugUtils.currentLine=88145921;
 //BA.debugLineNum = 88145921;BA.debugLine="Return pnl_bk.Left";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .getLeft();
RDebugUtils.currentLine=88145922;
 //BA.debugLineNum = 88145922;BA.debugLine="End Sub";
return 0;
}
public int  _gettop(ir.parsikhesab.pakhsh.cls_factor3_type2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_factor3_type2";
if (Debug.shouldDelegate(ba, "gettop", false))
	 {return ((Integer) Debug.delegate(ba, "gettop", null));}
RDebugUtils.currentLine=88080384;
 //BA.debugLineNum = 88080384;BA.debugLine="Public Sub getTop As Int";
RDebugUtils.currentLine=88080385;
 //BA.debugLineNum = 88080385;BA.debugLine="Return pnl_bk.Top";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .getTop();
RDebugUtils.currentLine=88080386;
 //BA.debugLineNum = 88080386;BA.debugLine="End Sub";
return 0;
}
public int  _getwidth(ir.parsikhesab.pakhsh.cls_factor3_type2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_factor3_type2";
if (Debug.shouldDelegate(ba, "getwidth", false))
	 {return ((Integer) Debug.delegate(ba, "getwidth", null));}
RDebugUtils.currentLine=87949312;
 //BA.debugLineNum = 87949312;BA.debugLine="Public Sub getWidth As Int";
RDebugUtils.currentLine=87949313;
 //BA.debugLineNum = 87949313;BA.debugLine="Return pnl_bk.Width";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth();
RDebugUtils.currentLine=87949314;
 //BA.debugLineNum = 87949314;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper  _readblob(ir.parsikhesab.pakhsh.cls_factor3_type2 __ref,String _emza) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_factor3_type2";
if (Debug.shouldDelegate(ba, "readblob", false))
	 {return ((anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) Debug.delegate(ba, "readblob", new Object[] {_emza}));}
byte[] _buffer = null;
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _inputstream1 = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bitmap1 = null;
RDebugUtils.currentLine=88211456;
 //BA.debugLineNum = 88211456;BA.debugLine="Sub ReadBlob(emza As String) As Bitmap";
RDebugUtils.currentLine=88211458;
 //BA.debugLineNum = 88211458;BA.debugLine="Dim Buffer() As Byte 'declare an empty byte array";
_buffer = new byte[(int) (0)];
;
RDebugUtils.currentLine=88211459;
 //BA.debugLineNum = 88211459;BA.debugLine="Buffer=MCode.Su.DecodeBase64(emza)";
_buffer = _mcode._su /*anywheresoftware.b4a.objects.StringUtils*/ .DecodeBase64(_emza);
RDebugUtils.currentLine=88211461;
 //BA.debugLineNum = 88211461;BA.debugLine="Dim InputStream1 As InputStream";
_inputstream1 = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
RDebugUtils.currentLine=88211462;
 //BA.debugLineNum = 88211462;BA.debugLine="InputStream1.InitializeFromBytesArray(Buffer, 0,";
_inputstream1.InitializeFromBytesArray(_buffer,(int) (0),_buffer.length);
RDebugUtils.currentLine=88211464;
 //BA.debugLineNum = 88211464;BA.debugLine="Dim Bitmap1 As Bitmap";
_bitmap1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=88211465;
 //BA.debugLineNum = 88211465;BA.debugLine="Bitmap1.Initialize2(InputStream1)";
_bitmap1.Initialize2((java.io.InputStream)(_inputstream1.getObject()));
RDebugUtils.currentLine=88211467;
 //BA.debugLineNum = 88211467;BA.debugLine="InputStream1.Close";
_inputstream1.Close();
RDebugUtils.currentLine=88211469;
 //BA.debugLineNum = 88211469;BA.debugLine="Return Bitmap1";
if (true) return _bitmap1;
RDebugUtils.currentLine=88211470;
 //BA.debugLineNum = 88211470;BA.debugLine="End Sub";
return null;
}
}