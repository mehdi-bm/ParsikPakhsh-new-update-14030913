package ir.parsikhesab.pakhsh;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class xml2map extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "ir.parsikhesab.pakhsh.xml2map");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", ir.parsikhesab.pakhsh.xml2map.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _xmlelement{
public boolean IsInitialized;
public String Name;
public anywheresoftware.b4a.objects.collections.List Children;
public String Text;
public anywheresoftware.b4a.objects.collections.Map Attributes;
public void Initialize() {
IsInitialized = true;
Name = "";
Children = new anywheresoftware.b4a.objects.collections.List();
Text = "";
Attributes = new anywheresoftware.b4a.objects.collections.Map();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.SaxParser _parser = null;
public anywheresoftware.b4a.objects.collections.List _elements = null;
public boolean _mstripnamespaces = false;
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
public String  _class_globals(ir.parsikhesab.pakhsh.xml2map __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="xml2map";
RDebugUtils.currentLine=133169152;
 //BA.debugLineNum = 133169152;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=133169153;
 //BA.debugLineNum = 133169153;BA.debugLine="Private parser As SaxParser";
_parser = new anywheresoftware.b4a.objects.SaxParser();
RDebugUtils.currentLine=133169154;
 //BA.debugLineNum = 133169154;BA.debugLine="Type XmlElement (Name As String, Children As List";
;
RDebugUtils.currentLine=133169155;
 //BA.debugLineNum = 133169155;BA.debugLine="Private elements As List";
_elements = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=133169156;
 //BA.debugLineNum = 133169156;BA.debugLine="Private mStripNamespaces As Boolean";
_mstripnamespaces = false;
RDebugUtils.currentLine=133169157;
 //BA.debugLineNum = 133169157;BA.debugLine="End Sub";
return "";
}
public ir.parsikhesab.pakhsh.xml2map._xmlelement  _createelement(ir.parsikhesab.pakhsh.xml2map __ref,String _name) throws Exception{
__ref = this;
RDebugUtils.currentModule="xml2map";
if (Debug.shouldDelegate(ba, "createelement", true))
	 {return ((ir.parsikhesab.pakhsh.xml2map._xmlelement) Debug.delegate(ba, "createelement", new Object[] {_name}));}
ir.parsikhesab.pakhsh.xml2map._xmlelement _xe = null;
RDebugUtils.currentLine=133627904;
 //BA.debugLineNum = 133627904;BA.debugLine="Private Sub CreateElement (Name As String) As XmlE";
RDebugUtils.currentLine=133627905;
 //BA.debugLineNum = 133627905;BA.debugLine="Dim xe As XmlElement";
_xe = new ir.parsikhesab.pakhsh.xml2map._xmlelement();
RDebugUtils.currentLine=133627906;
 //BA.debugLineNum = 133627906;BA.debugLine="xe.Initialize";
_xe.Initialize();
RDebugUtils.currentLine=133627907;
 //BA.debugLineNum = 133627907;BA.debugLine="xe.Children.Initialize";
_xe.Children /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=133627908;
 //BA.debugLineNum = 133627908;BA.debugLine="xe.Name = Name";
_xe.Name /*String*/  = _name;
RDebugUtils.currentLine=133627914;
 //BA.debugLineNum = 133627914;BA.debugLine="Return xe";
if (true) return _xe;
RDebugUtils.currentLine=133627915;
 //BA.debugLineNum = 133627915;BA.debugLine="End Sub";
return null;
}
public Object  _elementtoobject(ir.parsikhesab.pakhsh.xml2map __ref,ir.parsikhesab.pakhsh.xml2map._xmlelement _element) throws Exception{
__ref = this;
RDebugUtils.currentModule="xml2map";
if (Debug.shouldDelegate(ba, "elementtoobject", true))
	 {return ((Object) Debug.delegate(ba, "elementtoobject", new Object[] {_element}));}
anywheresoftware.b4a.objects.collections.Map _m = null;
ir.parsikhesab.pakhsh.xml2map._xmlelement _child = null;
Object _childobject = null;
Object _currentitem = null;
anywheresoftware.b4a.objects.collections.List _list = null;
RDebugUtils.currentLine=133562368;
 //BA.debugLineNum = 133562368;BA.debugLine="Private Sub ElementToObject (Element As XmlElement";
RDebugUtils.currentLine=133562369;
 //BA.debugLineNum = 133562369;BA.debugLine="If Element.Children.Size = 0 And Element.Attribut";
if (_element.Children /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0 && _element.Attributes /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
if (true) return (Object)(_element.Text /*String*/ );};
RDebugUtils.currentLine=133562370;
 //BA.debugLineNum = 133562370;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=133562371;
 //BA.debugLineNum = 133562371;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=133562372;
 //BA.debugLineNum = 133562372;BA.debugLine="If Element.Attributes.IsInitialized Then m.Put(\"A";
if (_element.Attributes /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()) { 
_m.Put((Object)("Attributes"),(Object)(_element.Attributes /*anywheresoftware.b4a.objects.collections.Map*/ .getObject()));};
RDebugUtils.currentLine=133562373;
 //BA.debugLineNum = 133562373;BA.debugLine="If Element.Children.Size = 0 Then m.Put(\"Text\", E";
if (_element.Children /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
_m.Put((Object)("Text"),(Object)(_element.Text /*String*/ ));};
RDebugUtils.currentLine=133562374;
 //BA.debugLineNum = 133562374;BA.debugLine="For Each child As XmlElement In Element.Children";
{
final anywheresoftware.b4a.BA.IterableList group6 = _element.Children /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_child = (ir.parsikhesab.pakhsh.xml2map._xmlelement)(group6.Get(index6));
RDebugUtils.currentLine=133562375;
 //BA.debugLineNum = 133562375;BA.debugLine="Dim childObject As Object = ElementToObject(chil";
_childobject = __ref._elementtoobject /*Object*/ (null,_child);
RDebugUtils.currentLine=133562376;
 //BA.debugLineNum = 133562376;BA.debugLine="If m.ContainsKey(child.Name) Then";
if (_m.ContainsKey((Object)(_child.Name /*String*/ ))) { 
RDebugUtils.currentLine=133562377;
 //BA.debugLineNum = 133562377;BA.debugLine="Dim currentItem As Object = m.Get(child.Name)";
_currentitem = _m.Get((Object)(_child.Name /*String*/ ));
RDebugUtils.currentLine=133562378;
 //BA.debugLineNum = 133562378;BA.debugLine="Dim list As List";
_list = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=133562379;
 //BA.debugLineNum = 133562379;BA.debugLine="If currentItem Is List Then";
if (_currentitem instanceof java.util.List) { 
RDebugUtils.currentLine=133562380;
 //BA.debugLineNum = 133562380;BA.debugLine="list = currentItem";
_list = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_currentitem));
 }else {
RDebugUtils.currentLine=133562382;
 //BA.debugLineNum = 133562382;BA.debugLine="list.Initialize";
_list.Initialize();
RDebugUtils.currentLine=133562383;
 //BA.debugLineNum = 133562383;BA.debugLine="list.Add(currentItem)";
_list.Add(_currentitem);
RDebugUtils.currentLine=133562384;
 //BA.debugLineNum = 133562384;BA.debugLine="m.Put(child.Name, list)";
_m.Put((Object)(_child.Name /*String*/ ),(Object)(_list.getObject()));
 };
RDebugUtils.currentLine=133562386;
 //BA.debugLineNum = 133562386;BA.debugLine="list.Add(childObject)";
_list.Add(_childobject);
 }else {
RDebugUtils.currentLine=133562388;
 //BA.debugLineNum = 133562388;BA.debugLine="m.Put(child.Name, childObject)";
_m.Put((Object)(_child.Name /*String*/ ),_childobject);
 };
 }
};
RDebugUtils.currentLine=133562391;
 //BA.debugLineNum = 133562391;BA.debugLine="Return m";
if (true) return (Object)(_m.getObject());
RDebugUtils.currentLine=133562392;
 //BA.debugLineNum = 133562392;BA.debugLine="End Sub";
return null;
}
public ir.parsikhesab.pakhsh.xml2map._xmlelement  _getlastelement(ir.parsikhesab.pakhsh.xml2map __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="xml2map";
if (Debug.shouldDelegate(ba, "getlastelement", true))
	 {return ((ir.parsikhesab.pakhsh.xml2map._xmlelement) Debug.delegate(ba, "getlastelement", null));}
RDebugUtils.currentLine=133824512;
 //BA.debugLineNum = 133824512;BA.debugLine="Private Sub GetLastElement As XmlElement";
RDebugUtils.currentLine=133824513;
 //BA.debugLineNum = 133824513;BA.debugLine="Return elements.Get(elements.Size - 1)";
if (true) return (ir.parsikhesab.pakhsh.xml2map._xmlelement)(__ref._elements /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (__ref._elements /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1)));
RDebugUtils.currentLine=133824514;
 //BA.debugLineNum = 133824514;BA.debugLine="End Sub";
return null;
}
public boolean  _getstripnamespaces(ir.parsikhesab.pakhsh.xml2map __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="xml2map";
if (Debug.shouldDelegate(ba, "getstripnamespaces", true))
	 {return ((Boolean) Debug.delegate(ba, "getstripnamespaces", null));}
RDebugUtils.currentLine=133300224;
 //BA.debugLineNum = 133300224;BA.debugLine="Public Sub getStripNamespaces As Boolean";
RDebugUtils.currentLine=133300225;
 //BA.debugLineNum = 133300225;BA.debugLine="Return mStripNamespaces";
if (true) return __ref._mstripnamespaces /*boolean*/ ;
RDebugUtils.currentLine=133300226;
 //BA.debugLineNum = 133300226;BA.debugLine="End Sub";
return false;
}
public String  _initialize(ir.parsikhesab.pakhsh.xml2map __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="xml2map";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=133234688;
 //BA.debugLineNum = 133234688;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=133234689;
 //BA.debugLineNum = 133234689;BA.debugLine="parser.Initialize";
__ref._parser /*anywheresoftware.b4a.objects.SaxParser*/ .Initialize(ba);
RDebugUtils.currentLine=133234690;
 //BA.debugLineNum = 133234690;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _parse(ir.parsikhesab.pakhsh.xml2map __ref,String _xml) throws Exception{
__ref = this;
RDebugUtils.currentModule="xml2map";
if (Debug.shouldDelegate(ba, "parse", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "parse", new Object[] {_xml}));}
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in = null;
byte[] _b = null;
RDebugUtils.currentLine=133431296;
 //BA.debugLineNum = 133431296;BA.debugLine="Public Sub Parse(XML As String) As Map";
RDebugUtils.currentLine=133431297;
 //BA.debugLineNum = 133431297;BA.debugLine="Dim in As InputStream";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
RDebugUtils.currentLine=133431298;
 //BA.debugLineNum = 133431298;BA.debugLine="Dim b() As Byte = XML.GetBytes(\"UTF8\")";
_b = _xml.getBytes("UTF8");
RDebugUtils.currentLine=133431299;
 //BA.debugLineNum = 133431299;BA.debugLine="in.InitializeFromBytesArray(b, 0, b.Length)";
_in.InitializeFromBytesArray(_b,(int) (0),_b.length);
RDebugUtils.currentLine=133431300;
 //BA.debugLineNum = 133431300;BA.debugLine="Return Parse2(in)";
if (true) return __ref._parse2 /*anywheresoftware.b4a.objects.collections.Map*/ (null,_in);
RDebugUtils.currentLine=133431301;
 //BA.debugLineNum = 133431301;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _parse2(ir.parsikhesab.pakhsh.xml2map __ref,anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _input) throws Exception{
__ref = this;
RDebugUtils.currentModule="xml2map";
if (Debug.shouldDelegate(ba, "parse2", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "parse2", new Object[] {_input}));}
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=133496832;
 //BA.debugLineNum = 133496832;BA.debugLine="Public Sub Parse2(Input As InputStream) As Map";
RDebugUtils.currentLine=133496833;
 //BA.debugLineNum = 133496833;BA.debugLine="elements.Initialize";
__ref._elements /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=133496834;
 //BA.debugLineNum = 133496834;BA.debugLine="elements.Add(CreateElement(\"stub\"))";
__ref._elements /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createelement /*ir.parsikhesab.pakhsh.xml2map._xmlelement*/ (null,"stub")));
RDebugUtils.currentLine=133496835;
 //BA.debugLineNum = 133496835;BA.debugLine="parser.Parse(Input, \"parser\")";
__ref._parser /*anywheresoftware.b4a.objects.SaxParser*/ .Parse((java.io.InputStream)(_input.getObject()),"parser");
RDebugUtils.currentLine=133496836;
 //BA.debugLineNum = 133496836;BA.debugLine="Dim m As Map = ElementToObject(elements.Get(0))";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._elementtoobject /*Object*/ (null,(ir.parsikhesab.pakhsh.xml2map._xmlelement)(__ref._elements /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0))))));
RDebugUtils.currentLine=133496837;
 //BA.debugLineNum = 133496837;BA.debugLine="Return m";
if (true) return _m;
RDebugUtils.currentLine=133496838;
 //BA.debugLineNum = 133496838;BA.debugLine="End Sub";
return null;
}
public String  _parser_endelement(ir.parsikhesab.pakhsh.xml2map __ref,String _uri,String _name,anywheresoftware.b4a.keywords.StringBuilderWrapper _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="xml2map";
if (Debug.shouldDelegate(ba, "parser_endelement", true))
	 {return ((String) Debug.delegate(ba, "parser_endelement", new Object[] {_uri,_name,_text}));}
ir.parsikhesab.pakhsh.xml2map._xmlelement _element = null;
RDebugUtils.currentLine=133890048;
 //BA.debugLineNum = 133890048;BA.debugLine="Private Sub Parser_EndElement (Uri As String, Name";
RDebugUtils.currentLine=133890049;
 //BA.debugLineNum = 133890049;BA.debugLine="Dim Element As XmlElement = GetLastElement";
_element = __ref._getlastelement /*ir.parsikhesab.pakhsh.xml2map._xmlelement*/ (null);
RDebugUtils.currentLine=133890050;
 //BA.debugLineNum = 133890050;BA.debugLine="Element.Text = Text.ToString";
_element.Text /*String*/  = _text.ToString();
RDebugUtils.currentLine=133890051;
 //BA.debugLineNum = 133890051;BA.debugLine="elements.RemoveAt(elements.Size - 1)";
__ref._elements /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (__ref._elements /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1));
RDebugUtils.currentLine=133890052;
 //BA.debugLineNum = 133890052;BA.debugLine="End Sub";
return "";
}
public String  _parser_startelement(ir.parsikhesab.pakhsh.xml2map __ref,String _uri,String _name,anywheresoftware.b4a.objects.SaxParser.AttributesWrapper _attributes) throws Exception{
__ref = this;
RDebugUtils.currentModule="xml2map";
if (Debug.shouldDelegate(ba, "parser_startelement", true))
	 {return ((String) Debug.delegate(ba, "parser_startelement", new Object[] {_uri,_name,_attributes}));}
ir.parsikhesab.pakhsh.xml2map._xmlelement _element = null;
anywheresoftware.b4a.objects.collections.Map _att = null;
int _i = 0;
String _key = "";
RDebugUtils.currentLine=133693440;
 //BA.debugLineNum = 133693440;BA.debugLine="Private Sub Parser_StartElement (Uri As String, Na";
RDebugUtils.currentLine=133693442;
 //BA.debugLineNum = 133693442;BA.debugLine="Dim Element As XmlElement = CreateElement(Name)";
_element = __ref._createelement /*ir.parsikhesab.pakhsh.xml2map._xmlelement*/ (null,_name);
RDebugUtils.currentLine=133693443;
 //BA.debugLineNum = 133693443;BA.debugLine="If Attributes.IsInitialized And Attributes.Size >";
if (_attributes.IsInitialized() && _attributes.getSize()>0) { 
RDebugUtils.currentLine=133693444;
 //BA.debugLineNum = 133693444;BA.debugLine="Dim att As Map";
_att = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=133693456;
 //BA.debugLineNum = 133693456;BA.debugLine="att.Initialize";
_att.Initialize();
RDebugUtils.currentLine=133693457;
 //BA.debugLineNum = 133693457;BA.debugLine="For i = 0 To Attributes.Size - 1";
{
final int step5 = 1;
final int limit5 = (int) (_attributes.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=133693458;
 //BA.debugLineNum = 133693458;BA.debugLine="Dim key As String = Attributes.GetName(i)";
_key = _attributes.GetName(_i);
RDebugUtils.currentLine=133693459;
 //BA.debugLineNum = 133693459;BA.debugLine="If mStripNamespaces Then key = StripNamespace(k";
if (__ref._mstripnamespaces /*boolean*/ ) { 
_key = __ref._stripnamespace /*String*/ (null,_key);};
RDebugUtils.currentLine=133693460;
 //BA.debugLineNum = 133693460;BA.debugLine="att.Put(key, Attributes.GetValue(i))";
_att.Put((Object)(_key),(Object)(_attributes.GetValue(_i)));
 }
};
RDebugUtils.currentLine=133693463;
 //BA.debugLineNum = 133693463;BA.debugLine="Element.Attributes = att";
_element.Attributes /*anywheresoftware.b4a.objects.collections.Map*/  = _att;
 };
RDebugUtils.currentLine=133693465;
 //BA.debugLineNum = 133693465;BA.debugLine="GetLastElement.Children.Add(Element)";
__ref._getlastelement /*ir.parsikhesab.pakhsh.xml2map._xmlelement*/ (null).Children /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_element));
RDebugUtils.currentLine=133693466;
 //BA.debugLineNum = 133693466;BA.debugLine="elements.Add(Element)";
__ref._elements /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_element));
RDebugUtils.currentLine=133693467;
 //BA.debugLineNum = 133693467;BA.debugLine="End Sub";
return "";
}
public String  _stripnamespace(ir.parsikhesab.pakhsh.xml2map __ref,String _s) throws Exception{
__ref = this;
RDebugUtils.currentModule="xml2map";
if (Debug.shouldDelegate(ba, "stripnamespace", true))
	 {return ((String) Debug.delegate(ba, "stripnamespace", new Object[] {_s}));}
RDebugUtils.currentLine=133758976;
 //BA.debugLineNum = 133758976;BA.debugLine="Private Sub StripNamespace(s As String) As String";
RDebugUtils.currentLine=133758978;
 //BA.debugLineNum = 133758978;BA.debugLine="Return s";
if (true) return _s;
RDebugUtils.currentLine=133758987;
 //BA.debugLineNum = 133758987;BA.debugLine="End Sub";
return "";
}
public String  _setstripnamespaces(ir.parsikhesab.pakhsh.xml2map __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="xml2map";
if (Debug.shouldDelegate(ba, "setstripnamespaces", true))
	 {return ((String) Debug.delegate(ba, "setstripnamespaces", new Object[] {_b}));}
RDebugUtils.currentLine=133365760;
 //BA.debugLineNum = 133365760;BA.debugLine="Public Sub setStripNamespaces (b As Boolean)";
RDebugUtils.currentLine=133365761;
 //BA.debugLineNum = 133365761;BA.debugLine="mStripNamespaces = b";
__ref._mstripnamespaces /*boolean*/  = _b;
RDebugUtils.currentLine=133365762;
 //BA.debugLineNum = 133365762;BA.debugLine="End Sub";
return "";
}
}