package ir.parsikhesab.pakhsh;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class xmlviewex {
private static xmlviewex mostCurrent = new xmlviewex();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 
public anywheresoftware.b4a.keywords.Common __c = null;
public static int _vis_visible = 0;
public static int _vis_invisible = 0;
public static int _vis_gone = 0;
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
public ir.parsikhesab.pakhsh.newinst2 _newinst2 = null;
public ir.parsikhesab.pakhsh.base64encodedecodeimage _base64encodedecodeimage = null;
public ir.parsikhesab.pakhsh.httputils2service _httputils2service = null;
public ir.parsikhesab.pakhsh.xuiviewsutils _xuiviewsutils = null;
public static anywheresoftware.b4a.objects.ConcreteViewWrapper  _findview(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.ConcreteViewWrapper _parent,String _viewname) throws Exception{
RDebugUtils.currentModule="xmlviewex";
if (Debug.shouldDelegate(null, "findview", false))
	 {return ((anywheresoftware.b4a.objects.ConcreteViewWrapper) Debug.delegate(null, "findview", new Object[] {_ba,_parent,_viewname}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=124518400;
 //BA.debugLineNum = 124518400;BA.debugLine="Public Sub FindView(Parent As View, ViewName As St";
RDebugUtils.currentLine=124518401;
 //BA.debugLineNum = 124518401;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=124518403;
 //BA.debugLineNum = 124518403;BA.debugLine="jo = Parent";
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_parent.getObject()));
RDebugUtils.currentLine=124518404;
 //BA.debugLineNum = 124518404;BA.debugLine="Return jo.RunMethod(\"findViewById\", Array As Obje";
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_jo.RunMethod("findViewById",new Object[]{(Object)(_getresourceid(_ba,"id",_viewname))})));
RDebugUtils.currentLine=124518405;
 //BA.debugLineNum = 124518405;BA.debugLine="End Sub";
return null;
}
public static int  _getresourceid(anywheresoftware.b4a.BA _ba,String _restype,String _name) throws Exception{
RDebugUtils.currentModule="xmlviewex";
if (Debug.shouldDelegate(null, "getresourceid", false))
	 {return ((Integer) Debug.delegate(null, "getresourceid", new Object[] {_ba,_restype,_name}));}
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
RDebugUtils.currentLine=124977152;
 //BA.debugLineNum = 124977152;BA.debugLine="Private Sub GetResourceId(ResType As String, Name";
RDebugUtils.currentLine=124977153;
 //BA.debugLineNum = 124977153;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=124977154;
 //BA.debugLineNum = 124977154;BA.debugLine="Return r.GetStaticField(Application.PackageName &";
if (true) return (int)(BA.ObjectToNumber(_r.GetStaticField(anywheresoftware.b4a.keywords.Common.Application.getPackageName()+".R$"+_restype,_name)));
RDebugUtils.currentLine=124977155;
 //BA.debugLineNum = 124977155;BA.debugLine="End Sub";
return 0;
}
public static anywheresoftware.b4a.objects.ConcreteViewWrapper  _inflatexmllayout(anywheresoftware.b4a.BA _ba,String _layout) throws Exception{
RDebugUtils.currentModule="xmlviewex";
if (Debug.shouldDelegate(null, "inflatexmllayout", false))
	 {return ((anywheresoftware.b4a.objects.ConcreteViewWrapper) Debug.delegate(null, "inflatexmllayout", new Object[] {_ba,_layout}));}
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
int _id = 0;
RDebugUtils.currentLine=124452864;
 //BA.debugLineNum = 124452864;BA.debugLine="Public Sub InflateXmlLayout(Layout As String) As V";
RDebugUtils.currentLine=124452865;
 //BA.debugLineNum = 124452865;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=124452866;
 //BA.debugLineNum = 124452866;BA.debugLine="Dim id As Int";
_id = 0;
RDebugUtils.currentLine=124452868;
 //BA.debugLineNum = 124452868;BA.debugLine="r.Target = r.GetContext";
_r.Target = (Object)(_r.GetContext((_ba.processBA == null ? _ba : _ba.processBA)));
RDebugUtils.currentLine=124452869;
 //BA.debugLineNum = 124452869;BA.debugLine="r.Target = r.RunMethod2(\"getSystemService\", \"layo";
_r.Target = _r.RunMethod2("getSystemService","layout_inflater","java.lang.String");
RDebugUtils.currentLine=124452871;
 //BA.debugLineNum = 124452871;BA.debugLine="id = r.GetStaticField(Application.PackageName & \"";
_id = (int)(BA.ObjectToNumber(_r.GetStaticField(anywheresoftware.b4a.keywords.Common.Application.getPackageName()+".R$layout",_layout)));
RDebugUtils.currentLine=124452872;
 //BA.debugLineNum = 124452872;BA.debugLine="Return r.RunMethod4(\"inflate\", Array As Object(id";
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_r.RunMethod4("inflate",new Object[]{(Object)(_id),anywheresoftware.b4a.keywords.Common.Null},new String[]{"java.lang.int","android.view.ViewGroup"})));
RDebugUtils.currentLine=124452873;
 //BA.debugLineNum = 124452873;BA.debugLine="End Sub";
return null;
}
public static String  _setxmlviewalpha(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.ConcreteViewWrapper _targetview,int _alpha) throws Exception{
RDebugUtils.currentModule="xmlviewex";
if (Debug.shouldDelegate(null, "setxmlviewalpha", false))
	 {return ((String) Debug.delegate(null, "setxmlviewalpha", new Object[] {_ba,_targetview,_alpha}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=124715008;
 //BA.debugLineNum = 124715008;BA.debugLine="Public Sub SetXmlViewAlpha(TargetView As View, Alp";
RDebugUtils.currentLine=124715009;
 //BA.debugLineNum = 124715009;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=124715011;
 //BA.debugLineNum = 124715011;BA.debugLine="jo = TargetView";
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_targetview.getObject()));
RDebugUtils.currentLine=124715012;
 //BA.debugLineNum = 124715012;BA.debugLine="jo.RunMethod(\"setAlpha\", Array As Object(Alpha))";
_jo.RunMethod("setAlpha",new Object[]{(Object)(_alpha)});
RDebugUtils.currentLine=124715013;
 //BA.debugLineNum = 124715013;BA.debugLine="End Sub";
return "";
}
public static String  _setxmlviewcolor(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.ConcreteViewWrapper _targetview,int _color) throws Exception{
RDebugUtils.currentModule="xmlviewex";
if (Debug.shouldDelegate(null, "setxmlviewcolor", false))
	 {return ((String) Debug.delegate(null, "setxmlviewcolor", new Object[] {_ba,_targetview,_color}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=124846080;
 //BA.debugLineNum = 124846080;BA.debugLine="Public Sub SetXmlViewColor(TargetView As View, Col";
RDebugUtils.currentLine=124846081;
 //BA.debugLineNum = 124846081;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=124846083;
 //BA.debugLineNum = 124846083;BA.debugLine="jo = TargetView";
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_targetview.getObject()));
RDebugUtils.currentLine=124846084;
 //BA.debugLineNum = 124846084;BA.debugLine="If Color = -1 Then";
if (_color==-1) { 
RDebugUtils.currentLine=124846085;
 //BA.debugLineNum = 124846085;BA.debugLine="jo.RunMethod(\"clearColorFilter\", Null)";
_jo.RunMethod("clearColorFilter",(Object[])(anywheresoftware.b4a.keywords.Common.Null));
 }else {
RDebugUtils.currentLine=124846087;
 //BA.debugLineNum = 124846087;BA.debugLine="jo.RunMethod(\"setColorFilter\", Array As Object(C";
_jo.RunMethod("setColorFilter",new Object[]{(Object)(_color)});
 };
RDebugUtils.currentLine=124846089;
 //BA.debugLineNum = 124846089;BA.debugLine="End Sub";
return "";
}
public static String  _setxmlviewimage(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.ConcreteViewWrapper _targetview,anywheresoftware.b4a.objects.drawable.BitmapDrawable _icon) throws Exception{
RDebugUtils.currentModule="xmlviewex";
if (Debug.shouldDelegate(null, "setxmlviewimage", false))
	 {return ((String) Debug.delegate(null, "setxmlviewimage", new Object[] {_ba,_targetview,_icon}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=124911616;
 //BA.debugLineNum = 124911616;BA.debugLine="Public Sub SetXmlViewImage(TargetView As View, Ico";
RDebugUtils.currentLine=124911617;
 //BA.debugLineNum = 124911617;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=124911619;
 //BA.debugLineNum = 124911619;BA.debugLine="jo = TargetView";
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_targetview.getObject()));
RDebugUtils.currentLine=124911620;
 //BA.debugLineNum = 124911620;BA.debugLine="jo.RunMethod(\"setImageDrawable\", Array As Object(";
_jo.RunMethod("setImageDrawable",new Object[]{(Object)(_icon.getObject())});
RDebugUtils.currentLine=124911621;
 //BA.debugLineNum = 124911621;BA.debugLine="End Sub";
return "";
}
public static String  _setxmlviewtext(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.ConcreteViewWrapper _targetview,String _text) throws Exception{
RDebugUtils.currentModule="xmlviewex";
if (Debug.shouldDelegate(null, "setxmlviewtext", false))
	 {return ((String) Debug.delegate(null, "setxmlviewtext", new Object[] {_ba,_targetview,_text}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=124583936;
 //BA.debugLineNum = 124583936;BA.debugLine="Public Sub SetXmlViewText(TargetView As View, Text";
RDebugUtils.currentLine=124583937;
 //BA.debugLineNum = 124583937;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=124583939;
 //BA.debugLineNum = 124583939;BA.debugLine="jo = TargetView";
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_targetview.getObject()));
RDebugUtils.currentLine=124583940;
 //BA.debugLineNum = 124583940;BA.debugLine="jo.RunMethod(\"setText\", Array As Object(Text))";
_jo.RunMethod("setText",new Object[]{(Object)(_text)});
RDebugUtils.currentLine=124583941;
 //BA.debugLineNum = 124583941;BA.debugLine="End Sub";
return "";
}
public static String  _setxmlviewtextcolor(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.ConcreteViewWrapper _targetview,int _color) throws Exception{
RDebugUtils.currentModule="xmlviewex";
if (Debug.shouldDelegate(null, "setxmlviewtextcolor", false))
	 {return ((String) Debug.delegate(null, "setxmlviewtextcolor", new Object[] {_ba,_targetview,_color}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=124649472;
 //BA.debugLineNum = 124649472;BA.debugLine="Public Sub SetXmlViewTextColor(TargetView As View,";
RDebugUtils.currentLine=124649473;
 //BA.debugLineNum = 124649473;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=124649475;
 //BA.debugLineNum = 124649475;BA.debugLine="jo = TargetView";
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_targetview.getObject()));
RDebugUtils.currentLine=124649476;
 //BA.debugLineNum = 124649476;BA.debugLine="jo.RunMethod(\"setTextColor\", Array As Object(Colo";
_jo.RunMethod("setTextColor",new Object[]{(Object)(_color)});
RDebugUtils.currentLine=124649477;
 //BA.debugLineNum = 124649477;BA.debugLine="End Sub";
return "";
}
public static String  _setxmlviewvisible(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.ConcreteViewWrapper _targetview,int _visibility) throws Exception{
RDebugUtils.currentModule="xmlviewex";
if (Debug.shouldDelegate(null, "setxmlviewvisible", false))
	 {return ((String) Debug.delegate(null, "setxmlviewvisible", new Object[] {_ba,_targetview,_visibility}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=124780544;
 //BA.debugLineNum = 124780544;BA.debugLine="Public Sub SetXmlViewVisible(TargetView As View, V";
RDebugUtils.currentLine=124780545;
 //BA.debugLineNum = 124780545;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=124780547;
 //BA.debugLineNum = 124780547;BA.debugLine="jo = TargetView";
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_targetview.getObject()));
RDebugUtils.currentLine=124780548;
 //BA.debugLineNum = 124780548;BA.debugLine="jo.RunMethod(\"setVisibility\", Array As Object(Vis";
_jo.RunMethod("setVisibility",new Object[]{(Object)(_visibility)});
RDebugUtils.currentLine=124780549;
 //BA.debugLineNum = 124780549;BA.debugLine="End Sub";
return "";
}
}