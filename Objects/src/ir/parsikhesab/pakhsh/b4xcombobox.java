package ir.parsikhesab.pakhsh;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xcombobox extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "ir.parsikhesab.pakhsh.b4xcombobox");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", ir.parsikhesab.pakhsh.b4xcombobox.class).invoke(this, new Object[] {null});
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
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public int _lastselectedindex = 0;
public anywheresoftware.b4a.objects.SpinnerWrapper _cmbbox = null;
public int _delaybeforechangeevent = 0;
public int _delayindex = 0;
public Object _tag = null;
public String _b4icancelbutton = "";
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
public String  _setselectedindex(ir.parsikhesab.pakhsh.b4xcombobox __ref,int _i) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcombobox";
if (Debug.shouldDelegate(ba, "setselectedindex", true))
	 {return ((String) Debug.delegate(ba, "setselectedindex", new Object[] {_i}));}
RDebugUtils.currentLine=138149888;
 //BA.debugLineNum = 138149888;BA.debugLine="Public Sub setSelectedIndex(i As Int)";
RDebugUtils.currentLine=138149889;
 //BA.debugLineNum = 138149889;BA.debugLine="LastSelectedIndex = i";
__ref._lastselectedindex /*int*/  = _i;
RDebugUtils.currentLine=138149891;
 //BA.debugLineNum = 138149891;BA.debugLine="cmbBox.SelectedIndex = i";
__ref._cmbbox /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setSelectedIndex(_i);
RDebugUtils.currentLine=138149900;
 //BA.debugLineNum = 138149900;BA.debugLine="End Sub";
return "";
}
public int  _getselectedindex(ir.parsikhesab.pakhsh.b4xcombobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcombobox";
if (Debug.shouldDelegate(ba, "getselectedindex", true))
	 {return ((Integer) Debug.delegate(ba, "getselectedindex", null));}
RDebugUtils.currentLine=138084352;
 //BA.debugLineNum = 138084352;BA.debugLine="Public Sub getSelectedIndex As Int";
RDebugUtils.currentLine=138084354;
 //BA.debugLineNum = 138084354;BA.debugLine="Return cmbBox.SelectedIndex";
if (true) return __ref._cmbbox /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedIndex();
RDebugUtils.currentLine=138084358;
 //BA.debugLineNum = 138084358;BA.debugLine="End Sub";
return 0;
}
public String  _base_resize(ir.parsikhesab.pakhsh.b4xcombobox __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcombobox";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=137822208;
 //BA.debugLineNum = 137822208;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=137822209;
 //BA.debugLineNum = 137822209;BA.debugLine="mBase.GetView(0).SetLayoutAnimated(0, 0, 0, Width";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0)).SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
RDebugUtils.currentLine=137822210;
 //BA.debugLineNum = 137822210;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(ir.parsikhesab.pakhsh.b4xcombobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcombobox";
RDebugUtils.currentLine=137625600;
 //BA.debugLineNum = 137625600;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=137625601;
 //BA.debugLineNum = 137625601;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=137625602;
 //BA.debugLineNum = 137625602;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=137625603;
 //BA.debugLineNum = 137625603;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=137625604;
 //BA.debugLineNum = 137625604;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=137625605;
 //BA.debugLineNum = 137625605;BA.debugLine="Private LastSelectedIndex As Int";
_lastselectedindex = 0;
RDebugUtils.currentLine=137625609;
 //BA.debugLineNum = 137625609;BA.debugLine="Public cmbBox As Spinner";
_cmbbox = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=137625615;
 //BA.debugLineNum = 137625615;BA.debugLine="Public DelayBeforeChangeEvent As Int";
_delaybeforechangeevent = 0;
RDebugUtils.currentLine=137625617;
 //BA.debugLineNum = 137625617;BA.debugLine="Private DelayIndex As Int";
_delayindex = 0;
RDebugUtils.currentLine=137625618;
 //BA.debugLineNum = 137625618;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=137625619;
 //BA.debugLineNum = 137625619;BA.debugLine="Public B4iCancelButton As String = \"Cancel\"";
_b4icancelbutton = "Cancel";
RDebugUtils.currentLine=137625620;
 //BA.debugLineNum = 137625620;BA.debugLine="End Sub";
return "";
}
public String  _cmbbox_itemclick(ir.parsikhesab.pakhsh.b4xcombobox __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcombobox";
if (Debug.shouldDelegate(ba, "cmbbox_itemclick", true))
	 {return ((String) Debug.delegate(ba, "cmbbox_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=138412032;
 //BA.debugLineNum = 138412032;BA.debugLine="Private Sub CmbBox_ItemClick (Position As Int, Val";
RDebugUtils.currentLine=138412033;
 //BA.debugLineNum = 138412033;BA.debugLine="RaiseEvent";
__ref._raiseevent /*void*/ (null);
RDebugUtils.currentLine=138412034;
 //BA.debugLineNum = 138412034;BA.debugLine="End Sub";
return "";
}
public void  _raiseevent(ir.parsikhesab.pakhsh.b4xcombobox __ref) throws Exception{
RDebugUtils.currentModule="b4xcombobox";
if (Debug.shouldDelegate(ba, "raiseevent", true))
	 {Debug.delegate(ba, "raiseevent", null); return;}
ResumableSub_RaiseEvent rsub = new ResumableSub_RaiseEvent(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_RaiseEvent extends BA.ResumableSub {
public ResumableSub_RaiseEvent(ir.parsikhesab.pakhsh.b4xcombobox parent,ir.parsikhesab.pakhsh.b4xcombobox __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
ir.parsikhesab.pakhsh.b4xcombobox __ref;
ir.parsikhesab.pakhsh.b4xcombobox parent;
int _index = 0;
int _myindex = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xcombobox";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=138346497;
 //BA.debugLineNum = 138346497;BA.debugLine="Dim index As Int = getSelectedIndex";
_index = __ref._getselectedindex /*int*/ (null);
RDebugUtils.currentLine=138346498;
 //BA.debugLineNum = 138346498;BA.debugLine="If LastSelectedIndex = index Then Return";
if (true) break;

case 1:
//if
this.state = 6;
if (__ref._lastselectedindex /*int*/ ==_index) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) return ;
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=138346499;
 //BA.debugLineNum = 138346499;BA.debugLine="If DelayBeforeChangeEvent > 0 Then";
if (true) break;

case 7:
//if
this.state = 16;
if (__ref._delaybeforechangeevent /*int*/ >0) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=138346500;
 //BA.debugLineNum = 138346500;BA.debugLine="DelayIndex = DelayIndex + 1";
__ref._delayindex /*int*/  = (int) (__ref._delayindex /*int*/ +1);
RDebugUtils.currentLine=138346501;
 //BA.debugLineNum = 138346501;BA.debugLine="Dim MyIndex As Int = DelayIndex";
_myindex = __ref._delayindex /*int*/ ;
RDebugUtils.currentLine=138346502;
 //BA.debugLineNum = 138346502;BA.debugLine="Sleep(DelayBeforeChangeEvent)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xcombobox", "raiseevent"),__ref._delaybeforechangeevent /*int*/ );
this.state = 21;
return;
case 21:
//C
this.state = 10;
;
RDebugUtils.currentLine=138346503;
 //BA.debugLineNum = 138346503;BA.debugLine="If MyIndex <> DelayIndex Then Return";
if (true) break;

case 10:
//if
this.state = 15;
if (_myindex!=__ref._delayindex /*int*/ ) { 
this.state = 12;
;}if (true) break;

case 12:
//C
this.state = 15;
if (true) return ;
if (true) break;

case 15:
//C
this.state = 16;
;
 if (true) break;

case 16:
//C
this.state = 17;
;
RDebugUtils.currentLine=138346505;
 //BA.debugLineNum = 138346505;BA.debugLine="LastSelectedIndex = index";
__ref._lastselectedindex /*int*/  = _index;
RDebugUtils.currentLine=138346506;
 //BA.debugLineNum = 138346506;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Select";
if (true) break;

case 17:
//if
this.state = 20;
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_SelectedIndexChanged",(int) (1))) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=138346507;
 //BA.debugLineNum = 138346507;BA.debugLine="CallSub2(mCallBack, mEventName & \"_SelectedIndex";
parent.__c.CallSubNew2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_SelectedIndexChanged",(Object)(_index));
 if (true) break;

case 20:
//C
this.state = -1;
;
RDebugUtils.currentLine=138346509;
 //BA.debugLineNum = 138346509;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _designercreateview(ir.parsikhesab.pakhsh.b4xcombobox __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcombobox";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
RDebugUtils.currentLine=137756672;
 //BA.debugLineNum = 137756672;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=137756673;
 //BA.debugLineNum = 137756673;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=137756674;
 //BA.debugLineNum = 137756674;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=137756674;
 //BA.debugLineNum = 137756674;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=137756675;
 //BA.debugLineNum = 137756675;BA.debugLine="Dim xlbl As B4XView = Lbl";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=137756682;
 //BA.debugLineNum = 137756682;BA.debugLine="cmbBox.Initialize(\"cmbBox\")";
__ref._cmbbox /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Initialize(ba,"cmbBox");
RDebugUtils.currentLine=137756683;
 //BA.debugLineNum = 137756683;BA.debugLine="cmbBox.TextSize = xlbl.TextSize";
__ref._cmbbox /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setTextSize(_xlbl.getTextSize());
RDebugUtils.currentLine=137756684;
 //BA.debugLineNum = 137756684;BA.debugLine="mBase.AddView(cmbBox, 0, 0, mBase.Width, mBase.He";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._cmbbox /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getObject()),(int) (0),(int) (0),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=137756693;
 //BA.debugLineNum = 137756693;BA.debugLine="End Sub";
return "";
}
public String  _getitem(ir.parsikhesab.pakhsh.b4xcombobox __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcombobox";
if (Debug.shouldDelegate(ba, "getitem", true))
	 {return ((String) Debug.delegate(ba, "getitem", new Object[] {_index}));}
RDebugUtils.currentLine=138280960;
 //BA.debugLineNum = 138280960;BA.debugLine="Public Sub GetItem(Index As Int) As String";
RDebugUtils.currentLine=138280964;
 //BA.debugLineNum = 138280964;BA.debugLine="Return cmbBox.GetItem(Index)";
if (true) return __ref._cmbbox /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .GetItem(_index);
RDebugUtils.currentLine=138280968;
 //BA.debugLineNum = 138280968;BA.debugLine="End Sub";
return "";
}
public String  _getselecteditem(ir.parsikhesab.pakhsh.b4xcombobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcombobox";
if (Debug.shouldDelegate(ba, "getselecteditem", true))
	 {return ((String) Debug.delegate(ba, "getselecteditem", null));}
int _i = 0;
RDebugUtils.currentLine=138215424;
 //BA.debugLineNum = 138215424;BA.debugLine="Public Sub getSelectedItem As String";
RDebugUtils.currentLine=138215425;
 //BA.debugLineNum = 138215425;BA.debugLine="Dim i As Int = getSelectedIndex";
_i = __ref._getselectedindex /*int*/ (null);
RDebugUtils.currentLine=138215426;
 //BA.debugLineNum = 138215426;BA.debugLine="If i = -1 Then Return \"\"";
if (_i==-1) { 
if (true) return "";};
RDebugUtils.currentLine=138215427;
 //BA.debugLineNum = 138215427;BA.debugLine="Return GetItem(i)";
if (true) return __ref._getitem /*String*/ (null,_i);
RDebugUtils.currentLine=138215428;
 //BA.debugLineNum = 138215428;BA.debugLine="End Sub";
return "";
}
public int  _getsize(ir.parsikhesab.pakhsh.b4xcombobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcombobox";
if (Debug.shouldDelegate(ba, "getsize", true))
	 {return ((Integer) Debug.delegate(ba, "getsize", null));}
RDebugUtils.currentLine=137953280;
 //BA.debugLineNum = 137953280;BA.debugLine="Public Sub getSize As Int";
RDebugUtils.currentLine=137953284;
 //BA.debugLineNum = 137953284;BA.debugLine="Return cmbBox.Size";
if (true) return __ref._cmbbox /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSize();
RDebugUtils.currentLine=137953288;
 //BA.debugLineNum = 137953288;BA.debugLine="End Sub";
return 0;
}
public int  _indexof(ir.parsikhesab.pakhsh.b4xcombobox __ref,String _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcombobox";
if (Debug.shouldDelegate(ba, "indexof", true))
	 {return ((Integer) Debug.delegate(ba, "indexof", new Object[] {_item}));}
RDebugUtils.currentLine=138018816;
 //BA.debugLineNum = 138018816;BA.debugLine="Public Sub IndexOf(Item As String) As Int";
RDebugUtils.currentLine=138018820;
 //BA.debugLineNum = 138018820;BA.debugLine="Return cmbBox.IndexOf(Item)";
if (true) return __ref._cmbbox /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .IndexOf(_item);
RDebugUtils.currentLine=138018824;
 //BA.debugLineNum = 138018824;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(ir.parsikhesab.pakhsh.b4xcombobox __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xcombobox";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=137691136;
 //BA.debugLineNum = 137691136;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=137691137;
 //BA.debugLineNum = 137691137;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=137691138;
 //BA.debugLineNum = 137691138;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=137691139;
 //BA.debugLineNum = 137691139;BA.debugLine="LastSelectedIndex = -1";
__ref._lastselectedindex /*int*/  = (int) (-1);
RDebugUtils.currentLine=137691140;
 //BA.debugLineNum = 137691140;BA.debugLine="If xui.IsB4J Then DelayBeforeChangeEvent = 500";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J()) { 
__ref._delaybeforechangeevent /*int*/  = (int) (500);};
RDebugUtils.currentLine=137691141;
 //BA.debugLineNum = 137691141;BA.debugLine="End Sub";
return "";
}
public String  _setitems(ir.parsikhesab.pakhsh.b4xcombobox __ref,anywheresoftware.b4a.objects.collections.List _items) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcombobox";
if (Debug.shouldDelegate(ba, "setitems", true))
	 {return ((String) Debug.delegate(ba, "setitems", new Object[] {_items}));}
RDebugUtils.currentLine=137887744;
 //BA.debugLineNum = 137887744;BA.debugLine="Public Sub SetItems(Items As List)";
RDebugUtils.currentLine=137887749;
 //BA.debugLineNum = 137887749;BA.debugLine="cmbBox.Clear";
__ref._cmbbox /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Clear();
RDebugUtils.currentLine=137887750;
 //BA.debugLineNum = 137887750;BA.debugLine="cmbBox.AddAll(Items)";
__ref._cmbbox /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .AddAll(_items);
RDebugUtils.currentLine=137887757;
 //BA.debugLineNum = 137887757;BA.debugLine="If Items.Size > 0 Then setSelectedIndex(0)";
if (_items.getSize()>0) { 
__ref._setselectedindex /*String*/ (null,(int) (0));};
RDebugUtils.currentLine=137887758;
 //BA.debugLineNum = 137887758;BA.debugLine="End Sub";
return "";
}
}