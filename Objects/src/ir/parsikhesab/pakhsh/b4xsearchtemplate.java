package ir.parsikhesab.pakhsh;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xsearchtemplate extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "ir.parsikhesab.pakhsh.b4xsearchtemplate");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", ir.parsikhesab.pakhsh.b4xsearchtemplate.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public b4a.example3.customlistview _customlistview1 = null;
public ir.parsikhesab.pakhsh.b4xdialog _xdialog = null;
public ir.parsikhesab.pakhsh.b4xfloattextfield _searchfield = null;
public anywheresoftware.b4a.objects.collections.Map _prefixlist = null;
public anywheresoftware.b4a.objects.collections.Map _substringlist = null;
public int _texthighlightcolor = 0;
public int _itemhightlightcolor = 0;
public int _max_limit = 0;
public int _maxnumberofitemstoshow = 0;
public anywheresoftware.b4a.objects.collections.List _itemscache = null;
public anywheresoftware.b4a.objects.collections.List _allitems = null;
public String _selecteditem = "";
public String _lastterm = "";
public anywheresoftware.b4a.objects.IME _ime = null;
public boolean _allowunlistedtext = false;
public boolean _prefixonly = false;
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
public String  _initialize(ir.parsikhesab.pakhsh.b4xsearchtemplate __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xsearchtemplate";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
int _height = 0;
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=148504576;
 //BA.debugLineNum = 148504576;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=148504577;
 //BA.debugLineNum = 148504577;BA.debugLine="mBase = xui.CreatePanel(\"mBase\")";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"mBase");
RDebugUtils.currentLine=148504579;
 //BA.debugLineNum = 148504579;BA.debugLine="Dim height As Int";
_height = 0;
RDebugUtils.currentLine=148504580;
 //BA.debugLineNum = 148504580;BA.debugLine="If xui.IsB4A Or xui.IsB4i Then height = 220dip El";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A() || __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i()) { 
_height = __c.DipToCurrent((int) (220));}
else {
_height = __c.DipToCurrent((int) (300));};
RDebugUtils.currentLine=148504581;
 //BA.debugLineNum = 148504581;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, 300dip, height)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),__c.DipToCurrent((int) (300)),_height);
RDebugUtils.currentLine=148504582;
 //BA.debugLineNum = 148504582;BA.debugLine="mBase.LoadLayout(\"SearchTemplate\")";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("SearchTemplate",ba);
RDebugUtils.currentLine=148504583;
 //BA.debugLineNum = 148504583;BA.debugLine="mBase.SetColorAndBorder(xui.Color_Transparent, 0,";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=148504584;
 //BA.debugLineNum = 148504584;BA.debugLine="CustomListView1.sv.SetColorAndBorder(xui.Color_Tr";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._sv.SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=148504585;
 //BA.debugLineNum = 148504585;BA.debugLine="CustomListView1.DefaultTextBackgroundColor = 0xFF";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._defaulttextbackgroundcolor = ((int)0xff555555);
RDebugUtils.currentLine=148504586;
 //BA.debugLineNum = 148504586;BA.debugLine="CustomListView1.DefaultTextColor = xui.Color_Whit";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._defaulttextcolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=148504596;
 //BA.debugLineNum = 148504596;BA.debugLine="ItemsCache.Initialize";
__ref._itemscache /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=148504597;
 //BA.debugLineNum = 148504597;BA.debugLine="prefixList.Initialize";
__ref._prefixlist /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=148504598;
 //BA.debugLineNum = 148504598;BA.debugLine="substringList.Initialize";
__ref._substringlist /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=148504600;
 //BA.debugLineNum = 148504600;BA.debugLine="IME.Initialize(\"\")";
__ref._ime /*anywheresoftware.b4a.objects.IME*/ .Initialize("");
RDebugUtils.currentLine=148504601;
 //BA.debugLineNum = 148504601;BA.debugLine="Dim jo As JavaObject = SearchField.TextField";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._searchfield /*ir.parsikhesab.pakhsh.b4xfloattextfield*/ ._gettextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).getObject()));
RDebugUtils.currentLine=148504602;
 //BA.debugLineNum = 148504602;BA.debugLine="jo.RunMethod(\"setImeOptions\", Array(Bit.Or(335544";
_jo.RunMethod("setImeOptions",new Object[]{(Object)(__c.Bit.Or((int) (33554432),(int) (6)))});
RDebugUtils.currentLine=148504604;
 //BA.debugLineNum = 148504604;BA.debugLine="End Sub";
return "";
}
public Object  _setitems(ir.parsikhesab.pakhsh.b4xsearchtemplate __ref,anywheresoftware.b4a.objects.collections.List _items) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xsearchtemplate";
if (Debug.shouldDelegate(ba, "setitems", true))
	 {return ((Object) Debug.delegate(ba, "setitems", new Object[] {_items}));}
long _starttime = 0L;
anywheresoftware.b4a.objects.collections.Map _noduplicates = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
anywheresoftware.b4a.objects.collections.List _li = null;
int _i = 0;
String _itemnotlower = "";
String _itemtolower = "";
int _start = 0;
int _count = 0;
String _str = "";
RDebugUtils.currentLine=149094400;
 //BA.debugLineNum = 149094400;BA.debugLine="Public Sub SetItems(Items As List) As Object";
RDebugUtils.currentLine=149094401;
 //BA.debugLineNum = 149094401;BA.debugLine="Dim startTime As Long";
_starttime = 0L;
RDebugUtils.currentLine=149094402;
 //BA.debugLineNum = 149094402;BA.debugLine="startTime = DateTime.Now";
_starttime = __c.DateTime.getNow();
RDebugUtils.currentLine=149094403;
 //BA.debugLineNum = 149094403;BA.debugLine="Dim noDuplicates As Map";
_noduplicates = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=149094404;
 //BA.debugLineNum = 149094404;BA.debugLine="noDuplicates.Initialize";
_noduplicates.Initialize();
RDebugUtils.currentLine=149094405;
 //BA.debugLineNum = 149094405;BA.debugLine="prefixList.Clear";
__ref._prefixlist /*anywheresoftware.b4a.objects.collections.Map*/ .Clear();
RDebugUtils.currentLine=149094406;
 //BA.debugLineNum = 149094406;BA.debugLine="substringList.Clear";
__ref._substringlist /*anywheresoftware.b4a.objects.collections.Map*/ .Clear();
RDebugUtils.currentLine=149094407;
 //BA.debugLineNum = 149094407;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=149094408;
 //BA.debugLineNum = 149094408;BA.debugLine="Dim li As List";
_li = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=149094409;
 //BA.debugLineNum = 149094409;BA.debugLine="For i = 0 To Items.Size - 1";
{
final int step9 = 1;
final int limit9 = (int) (_items.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=149094410;
 //BA.debugLineNum = 149094410;BA.debugLine="Dim itemNotLower As String = Items.Get(i)";
_itemnotlower = BA.ObjectToString(_items.Get(_i));
RDebugUtils.currentLine=149094411;
 //BA.debugLineNum = 149094411;BA.debugLine="Dim itemToLower As String = itemNotLower.ToLower";
_itemtolower = _itemnotlower.toLowerCase();
RDebugUtils.currentLine=149094412;
 //BA.debugLineNum = 149094412;BA.debugLine="noDuplicates.Clear";
_noduplicates.Clear();
RDebugUtils.currentLine=149094413;
 //BA.debugLineNum = 149094413;BA.debugLine="For start = 0 To IIf(PrefixOnly, 0, itemToLower.";
{
final int step13 = 1;
final int limit13 = (int)(BA.ObjectToNumber(((__ref._prefixonly /*boolean*/ ) ? ((Object)(0)) : ((Object)(_itemtolower.length()-1)))));
_start = (int) (0) ;
for (;_start <= limit13 ;_start = _start + step13 ) {
RDebugUtils.currentLine=149094414;
 //BA.debugLineNum = 149094414;BA.debugLine="Dim count As Int = 1";
_count = (int) (1);
RDebugUtils.currentLine=149094415;
 //BA.debugLineNum = 149094415;BA.debugLine="Do While count <= MAX_LIMIT And start + count <";
while (_count<=__ref._max_limit /*int*/  && _start+_count<=_itemtolower.length()) {
RDebugUtils.currentLine=149094416;
 //BA.debugLineNum = 149094416;BA.debugLine="Dim str As String = itemToLower.SubString2(sta";
_str = _itemtolower.substring(_start,(int) (_start+_count));
RDebugUtils.currentLine=149094417;
 //BA.debugLineNum = 149094417;BA.debugLine="If noDuplicates.ContainsKey(str) = False Then";
if (_noduplicates.ContainsKey((Object)(_str))==__c.False) { 
RDebugUtils.currentLine=149094418;
 //BA.debugLineNum = 149094418;BA.debugLine="noDuplicates.Put(str, \"\")";
_noduplicates.Put((Object)(_str),(Object)(""));
RDebugUtils.currentLine=149094419;
 //BA.debugLineNum = 149094419;BA.debugLine="If start = 0 Then m = prefixList Else m = sub";
if (_start==0) { 
_m = __ref._prefixlist /*anywheresoftware.b4a.objects.collections.Map*/ ;}
else {
_m = __ref._substringlist /*anywheresoftware.b4a.objects.collections.Map*/ ;};
RDebugUtils.currentLine=149094420;
 //BA.debugLineNum = 149094420;BA.debugLine="li = m.Get(str)";
_li = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_m.Get((Object)(_str))));
RDebugUtils.currentLine=149094421;
 //BA.debugLineNum = 149094421;BA.debugLine="If li.IsInitialized = False Then";
if (_li.IsInitialized()==__c.False) { 
RDebugUtils.currentLine=149094422;
 //BA.debugLineNum = 149094422;BA.debugLine="li.Initialize";
_li.Initialize();
RDebugUtils.currentLine=149094423;
 //BA.debugLineNum = 149094423;BA.debugLine="m.Put(str, li)";
_m.Put((Object)(_str),(Object)(_li.getObject()));
 };
RDebugUtils.currentLine=149094425;
 //BA.debugLineNum = 149094425;BA.debugLine="li.Add(itemNotLower)";
_li.Add((Object)(_itemnotlower));
 };
RDebugUtils.currentLine=149094427;
 //BA.debugLineNum = 149094427;BA.debugLine="count = count + 1";
_count = (int) (_count+1);
 }
;
 }
};
 }
};
RDebugUtils.currentLine=149094431;
 //BA.debugLineNum = 149094431;BA.debugLine="Log(\"Index time: \" & (DateTime.Now - startTime) &";
__c.LogImpl("9149094431","Index time: "+BA.NumberToString((__c.DateTime.getNow()-_starttime))+" ms ("+BA.NumberToString(_items.getSize())+" Items)",0);
RDebugUtils.currentLine=149094432;
 //BA.debugLineNum = 149094432;BA.debugLine="AllItems = Items";
__ref._allitems /*anywheresoftware.b4a.objects.collections.List*/  = _items;
RDebugUtils.currentLine=149094433;
 //BA.debugLineNum = 149094433;BA.debugLine="Return Array(prefixList, substringList, AllItems)";
if (true) return (Object)(new Object[]{(Object)(__ref._prefixlist /*anywheresoftware.b4a.objects.collections.Map*/ .getObject()),(Object)(__ref._substringlist /*anywheresoftware.b4a.objects.collections.Map*/ .getObject()),(Object)(__ref._allitems /*anywheresoftware.b4a.objects.collections.List*/ .getObject())});
RDebugUtils.currentLine=149094434;
 //BA.debugLineNum = 149094434;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getpanel(ir.parsikhesab.pakhsh.b4xsearchtemplate __ref,ir.parsikhesab.pakhsh.b4xdialog _dialog) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xsearchtemplate";
if (Debug.shouldDelegate(ba, "getpanel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getpanel", new Object[] {_dialog}));}
RDebugUtils.currentLine=148635648;
 //BA.debugLineNum = 148635648;BA.debugLine="Public Sub GetPanel (Dialog As B4XDialog) As B4XVi";
RDebugUtils.currentLine=148635649;
 //BA.debugLineNum = 148635649;BA.debugLine="Return mBase";
if (true) return __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=148635650;
 //BA.debugLineNum = 148635650;BA.debugLine="End Sub";
return null;
}
public void  _show(ir.parsikhesab.pakhsh.b4xsearchtemplate __ref,ir.parsikhesab.pakhsh.b4xdialog _dialog) throws Exception{
RDebugUtils.currentModule="b4xsearchtemplate";
if (Debug.shouldDelegate(ba, "show", true))
	 {Debug.delegate(ba, "show", new Object[] {_dialog}); return;}
ResumableSub_Show rsub = new ResumableSub_Show(this,__ref,_dialog);
rsub.resume(ba, null);
}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(ir.parsikhesab.pakhsh.b4xsearchtemplate parent,ir.parsikhesab.pakhsh.b4xsearchtemplate __ref,ir.parsikhesab.pakhsh.b4xdialog _dialog) {
this.parent = parent;
this.__ref = __ref;
this._dialog = _dialog;
this.__ref = parent;
}
ir.parsikhesab.pakhsh.b4xsearchtemplate __ref;
ir.parsikhesab.pakhsh.b4xsearchtemplate parent;
ir.parsikhesab.pakhsh.b4xdialog _dialog;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xsearchtemplate";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=148701185;
 //BA.debugLineNum = 148701185;BA.debugLine="xDialog = Dialog";
__ref._xdialog /*ir.parsikhesab.pakhsh.b4xdialog*/  = _dialog;
RDebugUtils.currentLine=148701186;
 //BA.debugLineNum = 148701186;BA.debugLine="xDialog.PutAtTop = xui.IsB4A Or xui.IsB4i";
__ref._xdialog /*ir.parsikhesab.pakhsh.b4xdialog*/ ._putattop /*boolean*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A() || __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i();
RDebugUtils.currentLine=148701187;
 //BA.debugLineNum = 148701187;BA.debugLine="CustomListView1.AsView.Color = xui.Color_Transpar";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._asview().setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=148701188;
 //BA.debugLineNum = 148701188;BA.debugLine="CustomListView1.sv.Color = xui.Color_Transparent";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._sv.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=148701189;
 //BA.debugLineNum = 148701189;BA.debugLine="mBase.Color = xui.Color_Transparent";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=148701190;
 //BA.debugLineNum = 148701190;BA.debugLine="Sleep(20)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xsearchtemplate", "show"),(int) (20));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=148701191;
 //BA.debugLineNum = 148701191;BA.debugLine="Update(\"\", True)";
__ref._update /*String*/ (null,"",parent.__c.True);
RDebugUtils.currentLine=148701192;
 //BA.debugLineNum = 148701192;BA.debugLine="CustomListView1.JumpToItem(0)";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._jumptoitem((int) (0));
RDebugUtils.currentLine=148701193;
 //BA.debugLineNum = 148701193;BA.debugLine="SearchField.Text = \"\"";
__ref._searchfield /*ir.parsikhesab.pakhsh.b4xfloattextfield*/ ._settext /*String*/ (null,"");
RDebugUtils.currentLine=148701194;
 //BA.debugLineNum = 148701194;BA.debugLine="SearchField.TextField.RequestFocus";
__ref._searchfield /*ir.parsikhesab.pakhsh.b4xfloattextfield*/ ._gettextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).RequestFocus();
RDebugUtils.currentLine=148701196;
 //BA.debugLineNum = 148701196;BA.debugLine="IME.ShowKeyboard(SearchField.TextField)";
__ref._ime /*anywheresoftware.b4a.objects.IME*/ .ShowKeyboard((android.view.View)(__ref._searchfield /*ir.parsikhesab.pakhsh.b4xfloattextfield*/ ._gettextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).getObject()));
RDebugUtils.currentLine=148701198;
 //BA.debugLineNum = 148701198;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _dialogclosed(ir.parsikhesab.pakhsh.b4xsearchtemplate __ref,int _result) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xsearchtemplate";
if (Debug.shouldDelegate(ba, "dialogclosed", true))
	 {return ((String) Debug.delegate(ba, "dialogclosed", new Object[] {_result}));}
RDebugUtils.currentLine=149225472;
 //BA.debugLineNum = 149225472;BA.debugLine="Private Sub DialogClosed(Result As Int) 'ignore";
RDebugUtils.currentLine=149225474;
 //BA.debugLineNum = 149225474;BA.debugLine="End Sub";
return "";
}
public String  _additemstolist(ir.parsikhesab.pakhsh.b4xsearchtemplate __ref,anywheresoftware.b4a.objects.collections.List _li,String _full) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xsearchtemplate";
if (Debug.shouldDelegate(ba, "additemstolist", true))
	 {return ((String) Debug.delegate(ba, "additemstolist", new Object[] {_li,_full}));}
int _i = 0;
String _item = "";
int _x = 0;
int _pnlcolor = 0;
anywheresoftware.b4a.objects.CSBuilder _cs = null;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
RDebugUtils.currentLine=149028864;
 //BA.debugLineNum = 149028864;BA.debugLine="Private Sub AddItemsToList(li As List, full As Str";
RDebugUtils.currentLine=149028865;
 //BA.debugLineNum = 149028865;BA.debugLine="If li.IsInitialized = False Then Return";
if (_li.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=149028870;
 //BA.debugLineNum = 149028870;BA.debugLine="For i = 0 To li.Size - 1";
{
final int step2 = 1;
final int limit2 = (int) (_li.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=149028871;
 //BA.debugLineNum = 149028871;BA.debugLine="If CustomListView1.Size >= MaxNumberOfItemsToSho";
if (__ref._customlistview1 /*b4a.example3.customlistview*/ ._getsize()>=__ref._maxnumberofitemstoshow /*int*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=149028872;
 //BA.debugLineNum = 149028872;BA.debugLine="Dim item As String = li.Get(i)";
_item = BA.ObjectToString(_li.Get(_i));
RDebugUtils.currentLine=149028873;
 //BA.debugLineNum = 149028873;BA.debugLine="Dim x As Int = item.ToLowerCase.IndexOf(full)";
_x = _item.toLowerCase().indexOf(_full);
RDebugUtils.currentLine=149028874;
 //BA.debugLineNum = 149028874;BA.debugLine="If x = -1 Then";
if (_x==-1) { 
RDebugUtils.currentLine=149028875;
 //BA.debugLineNum = 149028875;BA.debugLine="Continue";
if (true) continue;
 };
RDebugUtils.currentLine=149028877;
 //BA.debugLineNum = 149028877;BA.debugLine="Dim pnlColor As Int";
_pnlcolor = 0;
RDebugUtils.currentLine=149028878;
 //BA.debugLineNum = 149028878;BA.debugLine="If CustomListView1.Size = 0 And full.Length > 0";
if (__ref._customlistview1 /*b4a.example3.customlistview*/ ._getsize()==0 && _full.length()>0 && __ref._allowunlistedtext /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=149028879;
 //BA.debugLineNum = 149028879;BA.debugLine="pnlColor = ItemHightlightColor";
_pnlcolor = __ref._itemhightlightcolor /*int*/ ;
 }else {
RDebugUtils.currentLine=149028881;
 //BA.debugLineNum = 149028881;BA.debugLine="pnlColor = CustomListView1.DefaultTextBackgroun";
_pnlcolor = __ref._customlistview1 /*b4a.example3.customlistview*/ ._defaulttextbackgroundcolor;
 };
RDebugUtils.currentLine=149028884;
 //BA.debugLineNum = 149028884;BA.debugLine="Dim cs As CSBuilder";
_cs = new anywheresoftware.b4a.objects.CSBuilder();
RDebugUtils.currentLine=149028885;
 //BA.debugLineNum = 149028885;BA.debugLine="cs.Initialize.Append(item.SubString2(0, x)).Colo";
_cs.Initialize().Append(BA.ObjectToCharSequence(_item.substring((int) (0),_x))).Color(__ref._texthighlightcolor /*int*/ ).Append(BA.ObjectToCharSequence(_item.substring(_x,(int) (_x+_full.length())))).Pop();
RDebugUtils.currentLine=149028886;
 //BA.debugLineNum = 149028886;BA.debugLine="cs.Append(item.SubString(x + full.Length))";
_cs.Append(BA.ObjectToCharSequence(_item.substring((int) (_x+_full.length()))));
RDebugUtils.currentLine=149028887;
 //BA.debugLineNum = 149028887;BA.debugLine="If ItemsCache.Size > 0 Then";
if (__ref._itemscache /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=149028888;
 //BA.debugLineNum = 149028888;BA.debugLine="Dim p As B4XView = ItemsCache.Get(ItemsCache.Si";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._itemscache /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (__ref._itemscache /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1))));
RDebugUtils.currentLine=149028889;
 //BA.debugLineNum = 149028889;BA.debugLine="ItemsCache.RemoveAt(ItemsCache.Size - 1)";
__ref._itemscache /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (__ref._itemscache /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1));
RDebugUtils.currentLine=149028891;
 //BA.debugLineNum = 149028891;BA.debugLine="p.GetView(0).Text = cs";
_p.GetView((int) (0)).setText(BA.ObjectToCharSequence(_cs.getObject()));
RDebugUtils.currentLine=149028896;
 //BA.debugLineNum = 149028896;BA.debugLine="p.Color = pnlColor";
_p.setColor(_pnlcolor);
RDebugUtils.currentLine=149028897;
 //BA.debugLineNum = 149028897;BA.debugLine="CustomListView1.Add(p, item)";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._add(_p,(Object)(_item));
 }else {
RDebugUtils.currentLine=149028899;
 //BA.debugLineNum = 149028899;BA.debugLine="CustomListView1.AddTextItem(cs, item)";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._addtextitem((Object)(_cs.getObject()),(Object)(_item));
 };
 }
};
RDebugUtils.currentLine=149028920;
 //BA.debugLineNum = 149028920;BA.debugLine="For i = 0 To li.Size - 1";
{
final int step28 = 1;
final int limit28 = (int) (_li.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit28 ;_i = _i + step28 ) {
RDebugUtils.currentLine=149028921;
 //BA.debugLineNum = 149028921;BA.debugLine="Dim item As String = li.Get(i)";
_item = BA.ObjectToString(_li.Get(_i));
RDebugUtils.currentLine=149028922;
 //BA.debugLineNum = 149028922;BA.debugLine="Dim x As Int = item.ToLowerCase.IndexOf(full)";
_x = _item.toLowerCase().indexOf(_full);
RDebugUtils.currentLine=149028923;
 //BA.debugLineNum = 149028923;BA.debugLine="If x = -1 Then";
if (_x==-1) { 
RDebugUtils.currentLine=149028924;
 //BA.debugLineNum = 149028924;BA.debugLine="Continue";
if (true) continue;
 };
 }
};
RDebugUtils.currentLine=149028927;
 //BA.debugLineNum = 149028927;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(ir.parsikhesab.pakhsh.b4xsearchtemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xsearchtemplate";
RDebugUtils.currentLine=148439040;
 //BA.debugLineNum = 148439040;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=148439041;
 //BA.debugLineNum = 148439041;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=148439042;
 //BA.debugLineNum = 148439042;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=148439043;
 //BA.debugLineNum = 148439043;BA.debugLine="Public CustomListView1 As CustomListView";
_customlistview1 = new b4a.example3.customlistview();
RDebugUtils.currentLine=148439044;
 //BA.debugLineNum = 148439044;BA.debugLine="Private xDialog As B4XDialog";
_xdialog = new ir.parsikhesab.pakhsh.b4xdialog();
RDebugUtils.currentLine=148439045;
 //BA.debugLineNum = 148439045;BA.debugLine="Public SearchField As B4XFloatTextField";
_searchfield = new ir.parsikhesab.pakhsh.b4xfloattextfield();
RDebugUtils.currentLine=148439046;
 //BA.debugLineNum = 148439046;BA.debugLine="Private prefixList As Map";
_prefixlist = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=148439047;
 //BA.debugLineNum = 148439047;BA.debugLine="Private substringList As Map";
_substringlist = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=148439048;
 //BA.debugLineNum = 148439048;BA.debugLine="Public TextHighlightColor As Int = 0xFFFD5C5C";
_texthighlightcolor = ((int)0xfffd5c5c);
RDebugUtils.currentLine=148439049;
 //BA.debugLineNum = 148439049;BA.debugLine="Public ItemHightlightColor As Int = 0x7E008EFF";
_itemhightlightcolor = ((int)0x7e008eff);
RDebugUtils.currentLine=148439050;
 //BA.debugLineNum = 148439050;BA.debugLine="Private MAX_LIMIT = 4 As Int";
_max_limit = (int) (4);
RDebugUtils.currentLine=148439051;
 //BA.debugLineNum = 148439051;BA.debugLine="Public MaxNumberOfItemsToShow As Int = 100";
_maxnumberofitemstoshow = (int) (100);
RDebugUtils.currentLine=148439052;
 //BA.debugLineNum = 148439052;BA.debugLine="Private ItemsCache As List";
_itemscache = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=148439053;
 //BA.debugLineNum = 148439053;BA.debugLine="Private AllItems As List";
_allitems = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=148439054;
 //BA.debugLineNum = 148439054;BA.debugLine="Public SelectedItem As String";
_selecteditem = "";
RDebugUtils.currentLine=148439055;
 //BA.debugLineNum = 148439055;BA.debugLine="Private LastTerm As String";
_lastterm = "";
RDebugUtils.currentLine=148439057;
 //BA.debugLineNum = 148439057;BA.debugLine="Private IME As IME";
_ime = new anywheresoftware.b4a.objects.IME();
RDebugUtils.currentLine=148439059;
 //BA.debugLineNum = 148439059;BA.debugLine="Public AllowUnlistedText As Boolean";
_allowunlistedtext = false;
RDebugUtils.currentLine=148439060;
 //BA.debugLineNum = 148439060;BA.debugLine="Public PrefixOnly As Boolean";
_prefixonly = false;
RDebugUtils.currentLine=148439061;
 //BA.debugLineNum = 148439061;BA.debugLine="End Sub";
return "";
}
public String  _customlistview1_itemclick(ir.parsikhesab.pakhsh.b4xsearchtemplate __ref,int _index,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xsearchtemplate";
if (Debug.shouldDelegate(ba, "customlistview1_itemclick", true))
	 {return ((String) Debug.delegate(ba, "customlistview1_itemclick", new Object[] {_index,_value}));}
RDebugUtils.currentLine=148963328;
 //BA.debugLineNum = 148963328;BA.debugLine="Private Sub CustomListView1_ItemClick (Index As In";
RDebugUtils.currentLine=148963329;
 //BA.debugLineNum = 148963329;BA.debugLine="If Value = \"\" Then Return";
if ((_value).equals((Object)(""))) { 
if (true) return "";};
RDebugUtils.currentLine=148963330;
 //BA.debugLineNum = 148963330;BA.debugLine="SelectedItem = Value";
__ref._selecteditem /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=148963331;
 //BA.debugLineNum = 148963331;BA.debugLine="xDialog.Close(xui.DialogResponse_Positive)";
__ref._xdialog /*ir.parsikhesab.pakhsh.b4xdialog*/ ._close /*boolean*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive);
RDebugUtils.currentLine=148963332;
 //BA.debugLineNum = 148963332;BA.debugLine="End Sub";
return "";
}
public String  _resize(ir.parsikhesab.pakhsh.b4xsearchtemplate __ref,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xsearchtemplate";
if (Debug.shouldDelegate(ba, "resize", true))
	 {return ((String) Debug.delegate(ba, "resize", new Object[] {_width,_height}));}
anywheresoftware.b4a.objects.B4XViewWrapper _c = null;
RDebugUtils.currentLine=148570112;
 //BA.debugLineNum = 148570112;BA.debugLine="Public Sub Resize(Width As Int, Height As Int)";
RDebugUtils.currentLine=148570113;
 //BA.debugLineNum = 148570113;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, Width, Height)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),_width,_height);
RDebugUtils.currentLine=148570114;
 //BA.debugLineNum = 148570114;BA.debugLine="Dim c As B4XView = CustomListView1.AsView";
_c = new anywheresoftware.b4a.objects.B4XViewWrapper();
_c = __ref._customlistview1 /*b4a.example3.customlistview*/ ._asview();
RDebugUtils.currentLine=148570115;
 //BA.debugLineNum = 148570115;BA.debugLine="c.SetLayoutAnimated(0, 0, c.Top, Width, Height -";
_c.SetLayoutAnimated((int) (0),(int) (0),_c.getTop(),_width,(int) (_height-_c.getTop()));
RDebugUtils.currentLine=148570116;
 //BA.debugLineNum = 148570116;BA.debugLine="CustomListView1.Base_Resize(Width, c.Height)";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._base_resize(_width,_c.getHeight());
RDebugUtils.currentLine=148570117;
 //BA.debugLineNum = 148570117;BA.debugLine="End Sub";
return "";
}
public String  _searchfield_enterpressed(ir.parsikhesab.pakhsh.b4xsearchtemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xsearchtemplate";
if (Debug.shouldDelegate(ba, "searchfield_enterpressed", true))
	 {return ((String) Debug.delegate(ba, "searchfield_enterpressed", null));}
RDebugUtils.currentLine=148897792;
 //BA.debugLineNum = 148897792;BA.debugLine="Private Sub SearchField_EnterPressed";
RDebugUtils.currentLine=148897793;
 //BA.debugLineNum = 148897793;BA.debugLine="If AllowUnlistedText Then";
if (__ref._allowunlistedtext /*boolean*/ ) { 
RDebugUtils.currentLine=148897794;
 //BA.debugLineNum = 148897794;BA.debugLine="SelectedItem = LastTerm";
__ref._selecteditem /*String*/  = __ref._lastterm /*String*/ ;
RDebugUtils.currentLine=148897795;
 //BA.debugLineNum = 148897795;BA.debugLine="xDialog.Close(xui.DialogResponse_Positive)";
__ref._xdialog /*ir.parsikhesab.pakhsh.b4xdialog*/ ._close /*boolean*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive);
 }else 
{RDebugUtils.currentLine=148897796;
 //BA.debugLineNum = 148897796;BA.debugLine="Else If CustomListView1.Size > 0 And LastTerm.Len";
if (__ref._customlistview1 /*b4a.example3.customlistview*/ ._getsize()>0 && __ref._lastterm /*String*/ .length()>0) { 
RDebugUtils.currentLine=148897797;
 //BA.debugLineNum = 148897797;BA.debugLine="CustomListView1_ItemClick(0, CustomListView1.Get";
__ref._customlistview1_itemclick /*String*/ (null,(int) (0),__ref._customlistview1 /*b4a.example3.customlistview*/ ._getvalue((int) (0)));
 }}
;
RDebugUtils.currentLine=148897799;
 //BA.debugLineNum = 148897799;BA.debugLine="End Sub";
return "";
}
public String  _searchfield_textchanged(ir.parsikhesab.pakhsh.b4xsearchtemplate __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xsearchtemplate";
if (Debug.shouldDelegate(ba, "searchfield_textchanged", true))
	 {return ((String) Debug.delegate(ba, "searchfield_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=148766720;
 //BA.debugLineNum = 148766720;BA.debugLine="Private Sub SearchField_TextChanged (Old As String";
RDebugUtils.currentLine=148766721;
 //BA.debugLineNum = 148766721;BA.debugLine="Update(New, False)";
__ref._update /*String*/ (null,_new,__c.False);
RDebugUtils.currentLine=148766722;
 //BA.debugLineNum = 148766722;BA.debugLine="End Sub";
return "";
}
public String  _update(ir.parsikhesab.pakhsh.b4xsearchtemplate __ref,String _term,boolean _force) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xsearchtemplate";
if (Debug.shouldDelegate(ba, "update", true))
	 {return ((String) Debug.delegate(ba, "update", new Object[] {_term,_force}));}
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
String _str1 = "";
String _str2 = "";
RDebugUtils.currentLine=148832256;
 //BA.debugLineNum = 148832256;BA.debugLine="Private Sub Update(Term As String, Force As Boolea";
RDebugUtils.currentLine=148832257;
 //BA.debugLineNum = 148832257;BA.debugLine="If Term = LastTerm And Force = False Then Return";
if ((_term).equals(__ref._lastterm /*String*/ ) && _force==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=148832258;
 //BA.debugLineNum = 148832258;BA.debugLine="LastTerm = Term";
__ref._lastterm /*String*/  = _term;
RDebugUtils.currentLine=148832259;
 //BA.debugLineNum = 148832259;BA.debugLine="If xui.IsB4J = False Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J()==__c.False) { 
RDebugUtils.currentLine=148832260;
 //BA.debugLineNum = 148832260;BA.debugLine="For i = 0 To CustomListView1.Size - 1";
{
final int step4 = 1;
final int limit4 = (int) (__ref._customlistview1 /*b4a.example3.customlistview*/ ._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=148832261;
 //BA.debugLineNum = 148832261;BA.debugLine="Dim p As B4XView = CustomListView1.GetPanel(i)";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._customlistview1 /*b4a.example3.customlistview*/ ._getpanel(_i);
RDebugUtils.currentLine=148832262;
 //BA.debugLineNum = 148832262;BA.debugLine="p.RemoveViewFromParent";
_p.RemoveViewFromParent();
RDebugUtils.currentLine=148832263;
 //BA.debugLineNum = 148832263;BA.debugLine="ItemsCache.Add(p)";
__ref._itemscache /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_p.getObject()));
 }
};
 };
RDebugUtils.currentLine=148832266;
 //BA.debugLineNum = 148832266;BA.debugLine="CustomListView1.Clear";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._clear();
RDebugUtils.currentLine=148832268;
 //BA.debugLineNum = 148832268;BA.debugLine="Dim str1, str2 As String";
_str1 = "";
_str2 = "";
RDebugUtils.currentLine=148832269;
 //BA.debugLineNum = 148832269;BA.debugLine="str1 = Term.ToLowerCase";
_str1 = _term.toLowerCase();
RDebugUtils.currentLine=148832270;
 //BA.debugLineNum = 148832270;BA.debugLine="If Term = \"\" Then";
if ((_term).equals("")) { 
RDebugUtils.currentLine=148832271;
 //BA.debugLineNum = 148832271;BA.debugLine="AddItemsToList(AllItems, str1)";
__ref._additemstolist /*String*/ (null,__ref._allitems /*anywheresoftware.b4a.objects.collections.List*/ ,_str1);
 }else {
RDebugUtils.currentLine=148832273;
 //BA.debugLineNum = 148832273;BA.debugLine="If str1.Length > MAX_LIMIT Then";
if (_str1.length()>__ref._max_limit /*int*/ ) { 
RDebugUtils.currentLine=148832274;
 //BA.debugLineNum = 148832274;BA.debugLine="str2 = str1.SubString2(0, MAX_LIMIT)";
_str2 = _str1.substring((int) (0),__ref._max_limit /*int*/ );
 }else {
RDebugUtils.currentLine=148832276;
 //BA.debugLineNum = 148832276;BA.debugLine="str2 = str1";
_str2 = _str1;
 };
RDebugUtils.currentLine=148832278;
 //BA.debugLineNum = 148832278;BA.debugLine="AddItemsToList(prefixList.Get(str2), str1)";
__ref._additemstolist /*String*/ (null,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__ref._prefixlist /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_str2)))),_str1);
RDebugUtils.currentLine=148832279;
 //BA.debugLineNum = 148832279;BA.debugLine="AddItemsToList(substringList.Get(str2), str1)";
__ref._additemstolist /*String*/ (null,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__ref._substringlist /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_str2)))),_str1);
 };
RDebugUtils.currentLine=148832281;
 //BA.debugLineNum = 148832281;BA.debugLine="End Sub";
return "";
}
public String  _setindex(ir.parsikhesab.pakhsh.b4xsearchtemplate __ref,Object _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xsearchtemplate";
if (Debug.shouldDelegate(ba, "setindex", true))
	 {return ((String) Debug.delegate(ba, "setindex", new Object[] {_index}));}
Object[] _obj = null;
RDebugUtils.currentLine=149159936;
 //BA.debugLineNum = 149159936;BA.debugLine="Public Sub SetIndex(Index As Object)";
RDebugUtils.currentLine=149159937;
 //BA.debugLineNum = 149159937;BA.debugLine="Dim obj() As Object";
_obj = new Object[(int) (0)];
{
int d0 = _obj.length;
for (int i0 = 0;i0 < d0;i0++) {
_obj[i0] = new Object();
}
}
;
RDebugUtils.currentLine=149159938;
 //BA.debugLineNum = 149159938;BA.debugLine="obj = Index";
_obj = (Object[])(_index);
RDebugUtils.currentLine=149159939;
 //BA.debugLineNum = 149159939;BA.debugLine="prefixList = obj(0)";
__ref._prefixlist /*anywheresoftware.b4a.objects.collections.Map*/  = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_obj[(int) (0)]));
RDebugUtils.currentLine=149159940;
 //BA.debugLineNum = 149159940;BA.debugLine="substringList = obj(1)";
__ref._substringlist /*anywheresoftware.b4a.objects.collections.Map*/  = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_obj[(int) (1)]));
RDebugUtils.currentLine=149159941;
 //BA.debugLineNum = 149159941;BA.debugLine="Dim AllItems As List = obj(2)";
_allitems = new anywheresoftware.b4a.objects.collections.List();
_allitems = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_obj[(int) (2)]));
RDebugUtils.currentLine=149159942;
 //BA.debugLineNum = 149159942;BA.debugLine="End Sub";
return "";
}
public void RemoveWarning() throws Exception{
	anywheresoftware.b4a.shell.Shell s = anywheresoftware.b4a.shell.Shell.INSTANCE;
	java.lang.reflect.Field f = s.getClass().getDeclaredField("errorMessagesForSyncEvents");
	f.setAccessible(true);
	java.util.HashSet<String> h = (java.util.HashSet<String>)f.get(s);
	if (h == null) {
		h = new java.util.HashSet<String>();
		f.set(s, h);
	}
	h.add("tf_focuschanged");
}
}