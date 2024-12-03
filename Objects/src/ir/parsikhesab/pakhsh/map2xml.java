package ir.parsikhesab.pakhsh;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class map2xml extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "ir.parsikhesab.pakhsh.map2xml");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", ir.parsikhesab.pakhsh.map2xml.class).invoke(this, new Object[] {null});
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
public com.jamesmurty.utils.XMLBuilder _builder = null;
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
public String  _class_globals(ir.parsikhesab.pakhsh.map2xml __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="map2xml";
RDebugUtils.currentLine=132775936;
 //BA.debugLineNum = 132775936;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=132775937;
 //BA.debugLineNum = 132775937;BA.debugLine="Private builder As XMLBuilder";
_builder = new com.jamesmurty.utils.XMLBuilder();
RDebugUtils.currentLine=132775938;
 //BA.debugLineNum = 132775938;BA.debugLine="End Sub";
return "";
}
public String  _handleelement(ir.parsikhesab.pakhsh.map2xml __ref,String _key,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="map2xml";
if (Debug.shouldDelegate(ba, "handleelement", true))
	 {return ((String) Debug.delegate(ba, "handleelement", new Object[] {_key,_value}));}
RDebugUtils.currentLine=133038080;
 //BA.debugLineNum = 133038080;BA.debugLine="Private Sub HandleElement (key As String, value As";
RDebugUtils.currentLine=133038081;
 //BA.debugLineNum = 133038081;BA.debugLine="If value Is Map Then";
if (_value instanceof java.util.Map) { 
RDebugUtils.currentLine=133038082;
 //BA.debugLineNum = 133038082;BA.debugLine="If key <> \"\" Then builder = builder.element(key)";
if ((_key).equals("") == false) { 
__ref._builder /*com.jamesmurty.utils.XMLBuilder*/  = __ref._builder /*com.jamesmurty.utils.XMLBuilder*/ .element(_key);};
RDebugUtils.currentLine=133038083;
 //BA.debugLineNum = 133038083;BA.debugLine="HandleMapElement(value)";
__ref._handlemapelement /*String*/ (null,(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_value)));
RDebugUtils.currentLine=133038084;
 //BA.debugLineNum = 133038084;BA.debugLine="If key <> \"\" Then builder = builder.up";
if ((_key).equals("") == false) { 
__ref._builder /*com.jamesmurty.utils.XMLBuilder*/  = __ref._builder /*com.jamesmurty.utils.XMLBuilder*/ .up();};
 }else 
{RDebugUtils.currentLine=133038085;
 //BA.debugLineNum = 133038085;BA.debugLine="Else if value Is List Then";
if (_value instanceof java.util.List) { 
RDebugUtils.currentLine=133038086;
 //BA.debugLineNum = 133038086;BA.debugLine="HandleListElement (key, value)";
__ref._handlelistelement /*String*/ (null,_key,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_value)));
 }else {
RDebugUtils.currentLine=133038088;
 //BA.debugLineNum = 133038088;BA.debugLine="builder = builder.element(key)";
__ref._builder /*com.jamesmurty.utils.XMLBuilder*/  = __ref._builder /*com.jamesmurty.utils.XMLBuilder*/ .element(_key);
RDebugUtils.currentLine=133038089;
 //BA.debugLineNum = 133038089;BA.debugLine="builder = builder.text(value)";
__ref._builder /*com.jamesmurty.utils.XMLBuilder*/  = __ref._builder /*com.jamesmurty.utils.XMLBuilder*/ .text(BA.ObjectToString(_value));
RDebugUtils.currentLine=133038090;
 //BA.debugLineNum = 133038090;BA.debugLine="builder = builder.up";
__ref._builder /*com.jamesmurty.utils.XMLBuilder*/  = __ref._builder /*com.jamesmurty.utils.XMLBuilder*/ .up();
 }}
;
RDebugUtils.currentLine=133038092;
 //BA.debugLineNum = 133038092;BA.debugLine="End Sub";
return "";
}
public String  _handlemapelement(ir.parsikhesab.pakhsh.map2xml __ref,anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
__ref = this;
RDebugUtils.currentModule="map2xml";
if (Debug.shouldDelegate(ba, "handlemapelement", true))
	 {return ((String) Debug.delegate(ba, "handlemapelement", new Object[] {_m}));}
anywheresoftware.b4a.objects.collections.Map _attributes = null;
String _attr = "";
String _k = "";
Object _value = null;
RDebugUtils.currentLine=132972544;
 //BA.debugLineNum = 132972544;BA.debugLine="Private Sub HandleMapElement (m As Map)";
RDebugUtils.currentLine=132972545;
 //BA.debugLineNum = 132972545;BA.debugLine="Dim attributes As Map = m.Get(\"Attributes\")";
_attributes = new anywheresoftware.b4a.objects.collections.Map();
_attributes = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_m.Get((Object)("Attributes"))));
RDebugUtils.currentLine=132972546;
 //BA.debugLineNum = 132972546;BA.debugLine="If attributes.IsInitialized Then";
if (_attributes.IsInitialized()) { 
RDebugUtils.currentLine=132972547;
 //BA.debugLineNum = 132972547;BA.debugLine="For Each attr As String In attributes.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _attributes.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_attr = BA.ObjectToString(group3.Get(index3));
RDebugUtils.currentLine=132972548;
 //BA.debugLineNum = 132972548;BA.debugLine="builder.attribute(attr, attributes.Get(attr))";
__ref._builder /*com.jamesmurty.utils.XMLBuilder*/ .attribute(_attr,BA.ObjectToString(_attributes.Get((Object)(_attr))));
 }
};
RDebugUtils.currentLine=132972550;
 //BA.debugLineNum = 132972550;BA.debugLine="If m.ContainsKey(\"Text\") Then builder.text(m.Get";
if (_m.ContainsKey((Object)("Text"))) { 
__ref._builder /*com.jamesmurty.utils.XMLBuilder*/ .text(BA.ObjectToString(_m.Get((Object)("Text"))));};
RDebugUtils.currentLine=132972551;
 //BA.debugLineNum = 132972551;BA.debugLine="m.Remove(\"Attributes\")";
_m.Remove((Object)("Attributes"));
RDebugUtils.currentLine=132972552;
 //BA.debugLineNum = 132972552;BA.debugLine="m.Remove(\"Text\")";
_m.Remove((Object)("Text"));
 };
RDebugUtils.currentLine=132972554;
 //BA.debugLineNum = 132972554;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group10 = _m.Keys();
final int groupLen10 = group10.getSize()
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_k = BA.ObjectToString(group10.Get(index10));
RDebugUtils.currentLine=132972555;
 //BA.debugLineNum = 132972555;BA.debugLine="Dim value As Object = m.Get(k)";
_value = _m.Get((Object)(_k));
RDebugUtils.currentLine=132972556;
 //BA.debugLineNum = 132972556;BA.debugLine="HandleElement(k, value)";
__ref._handleelement /*String*/ (null,_k,_value);
 }
};
RDebugUtils.currentLine=132972558;
 //BA.debugLineNum = 132972558;BA.debugLine="End Sub";
return "";
}
public String  _handlelistelement(ir.parsikhesab.pakhsh.map2xml __ref,String _key,anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
__ref = this;
RDebugUtils.currentModule="map2xml";
if (Debug.shouldDelegate(ba, "handlelistelement", true))
	 {return ((String) Debug.delegate(ba, "handlelistelement", new Object[] {_key,_lst}));}
Object _value = null;
RDebugUtils.currentLine=133103616;
 //BA.debugLineNum = 133103616;BA.debugLine="Private Sub HandleListElement (key As String, lst";
RDebugUtils.currentLine=133103617;
 //BA.debugLineNum = 133103617;BA.debugLine="For Each value As Object In lst";
{
final anywheresoftware.b4a.BA.IterableList group1 = _lst;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_value = group1.Get(index1);
RDebugUtils.currentLine=133103618;
 //BA.debugLineNum = 133103618;BA.debugLine="HandleElement(key, value)";
__ref._handleelement /*String*/ (null,_key,_value);
 }
};
RDebugUtils.currentLine=133103620;
 //BA.debugLineNum = 133103620;BA.debugLine="End Sub";
return "";
}
public String  _initialize(ir.parsikhesab.pakhsh.map2xml __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="map2xml";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=132841472;
 //BA.debugLineNum = 132841472;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=132841474;
 //BA.debugLineNum = 132841474;BA.debugLine="End Sub";
return "";
}
public String  _maptoxml(ir.parsikhesab.pakhsh.map2xml __ref,anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
__ref = this;
RDebugUtils.currentModule="map2xml";
if (Debug.shouldDelegate(ba, "maptoxml", true))
	 {return ((String) Debug.delegate(ba, "maptoxml", new Object[] {_m}));}
String _k = "";
anywheresoftware.b4a.objects.collections.Map _props = null;
RDebugUtils.currentLine=132907008;
 //BA.debugLineNum = 132907008;BA.debugLine="Public Sub MapToXml (m As Map) As String";
RDebugUtils.currentLine=132907009;
 //BA.debugLineNum = 132907009;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=132907010;
 //BA.debugLineNum = 132907010;BA.debugLine="builder = builder.create(k)";
__ref._builder /*com.jamesmurty.utils.XMLBuilder*/  = __ref._builder /*com.jamesmurty.utils.XMLBuilder*/ .create(_k);
RDebugUtils.currentLine=132907011;
 //BA.debugLineNum = 132907011;BA.debugLine="HandleElement(\"\", m.Get(k))";
__ref._handleelement /*String*/ (null,"",_m.Get((Object)(_k)));
RDebugUtils.currentLine=132907012;
 //BA.debugLineNum = 132907012;BA.debugLine="Exit";
if (true) break;
 }
};
RDebugUtils.currentLine=132907014;
 //BA.debugLineNum = 132907014;BA.debugLine="builder = builder.up";
__ref._builder /*com.jamesmurty.utils.XMLBuilder*/  = __ref._builder /*com.jamesmurty.utils.XMLBuilder*/ .up();
RDebugUtils.currentLine=132907016;
 //BA.debugLineNum = 132907016;BA.debugLine="Dim props As Map";
_props = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=132907017;
 //BA.debugLineNum = 132907017;BA.debugLine="props.Initialize";
_props.Initialize();
RDebugUtils.currentLine=132907018;
 //BA.debugLineNum = 132907018;BA.debugLine="props.Put(\"{http://xml.apache.org/xslt}indent-amo";
_props.Put((Object)("{http://xml.apache.org/xslt}indent-amount"),(Object)("4"));
RDebugUtils.currentLine=132907019;
 //BA.debugLineNum = 132907019;BA.debugLine="props.Put(\"indent\", \"yes\")";
_props.Put((Object)("indent"),(Object)("yes"));
RDebugUtils.currentLine=132907020;
 //BA.debugLineNum = 132907020;BA.debugLine="Return builder.asString2(props)";
if (true) return __ref._builder /*com.jamesmurty.utils.XMLBuilder*/ .asString2((java.util.Map)(_props.getObject()));
RDebugUtils.currentLine=132907024;
 //BA.debugLineNum = 132907024;BA.debugLine="End Sub";
return "";
}
}