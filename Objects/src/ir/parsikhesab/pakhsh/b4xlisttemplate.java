package ir.parsikhesab.pakhsh;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xlisttemplate extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "ir.parsikhesab.pakhsh.b4xlisttemplate");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", ir.parsikhesab.pakhsh.b4xlisttemplate.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.collections.List _options = null;
public String _selecteditem = "";
public ir.parsikhesab.pakhsh.b4xdialog _xdialog = null;
public boolean _allowmultiselection = false;
public int _selectioncolor = 0;
public anywheresoftware.b4a.objects.collections.List _selecteditems = null;
public int _multiselectionminimum = 0;
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
public String  _initialize(ir.parsikhesab.pakhsh.b4xlisttemplate __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xlisttemplate";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=144637952;
 //BA.debugLineNum = 144637952;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=144637953;
 //BA.debugLineNum = 144637953;BA.debugLine="mBase = xui.CreatePanel(\"mBase\")";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"mBase");
RDebugUtils.currentLine=144637954;
 //BA.debugLineNum = 144637954;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, 300dip, 300dip)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),__c.DipToCurrent((int) (300)),__c.DipToCurrent((int) (300)));
RDebugUtils.currentLine=144637955;
 //BA.debugLineNum = 144637955;BA.debugLine="mBase.LoadLayout(\"ListTemplate\")";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("ListTemplate",ba);
RDebugUtils.currentLine=144637956;
 //BA.debugLineNum = 144637956;BA.debugLine="mBase.SetColorAndBorder(xui.Color_Transparent, 0,";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=144637957;
 //BA.debugLineNum = 144637957;BA.debugLine="CustomListView1.sv.SetColorAndBorder(xui.Color_Tr";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._sv.SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=144637958;
 //BA.debugLineNum = 144637958;BA.debugLine="CustomListView1.DefaultTextBackgroundColor = 0xFF";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._defaulttextbackgroundcolor = ((int)0xff555555);
RDebugUtils.currentLine=144637959;
 //BA.debugLineNum = 144637959;BA.debugLine="CustomListView1.DefaultTextColor = xui.Color_Whit";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._defaulttextcolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=144637964;
 //BA.debugLineNum = 144637964;BA.debugLine="Options.Initialize";
__ref._options /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=144637965;
 //BA.debugLineNum = 144637965;BA.debugLine="SelectedItems.Initialize";
__ref._selecteditems /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=144637966;
 //BA.debugLineNum = 144637966;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getpanel(ir.parsikhesab.pakhsh.b4xlisttemplate __ref,ir.parsikhesab.pakhsh.b4xdialog _dialog) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xlisttemplate";
if (Debug.shouldDelegate(ba, "getpanel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getpanel", new Object[] {_dialog}));}
RDebugUtils.currentLine=144769024;
 //BA.debugLineNum = 144769024;BA.debugLine="Public Sub GetPanel (Dialog As B4XDialog) As B4XVi";
RDebugUtils.currentLine=144769025;
 //BA.debugLineNum = 144769025;BA.debugLine="Return mBase";
if (true) return __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=144769026;
 //BA.debugLineNum = 144769026;BA.debugLine="End Sub";
return null;
}
public void  _show(ir.parsikhesab.pakhsh.b4xlisttemplate __ref,ir.parsikhesab.pakhsh.b4xdialog _dialog) throws Exception{
RDebugUtils.currentModule="b4xlisttemplate";
if (Debug.shouldDelegate(ba, "show", true))
	 {Debug.delegate(ba, "show", new Object[] {_dialog}); return;}
ResumableSub_Show rsub = new ResumableSub_Show(this,__ref,_dialog);
rsub.resume(ba, null);
}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(ir.parsikhesab.pakhsh.b4xlisttemplate parent,ir.parsikhesab.pakhsh.b4xlisttemplate __ref,ir.parsikhesab.pakhsh.b4xdialog _dialog) {
this.parent = parent;
this.__ref = __ref;
this._dialog = _dialog;
this.__ref = parent;
}
ir.parsikhesab.pakhsh.b4xlisttemplate __ref;
ir.parsikhesab.pakhsh.b4xlisttemplate parent;
ir.parsikhesab.pakhsh.b4xdialog _dialog;
Object _opt = null;
int _i = 0;
b4a.example3.customlistview._clvitem _item = null;
anywheresoftware.b4a.BA.IterableList group3;
int index3;
int groupLen3;
int step8;
int limit8;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xlisttemplate";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=144834561;
 //BA.debugLineNum = 144834561;BA.debugLine="xDialog = Dialog";
__ref._xdialog /*ir.parsikhesab.pakhsh.b4xdialog*/  = _dialog;
RDebugUtils.currentLine=144834562;
 //BA.debugLineNum = 144834562;BA.debugLine="CustomListView1.Clear";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._clear();
RDebugUtils.currentLine=144834563;
 //BA.debugLineNum = 144834563;BA.debugLine="For Each opt As Object In Options";
if (true) break;

case 1:
//for
this.state = 4;
group3 = __ref._options /*anywheresoftware.b4a.objects.collections.List*/ ;
index3 = 0;
groupLen3 = group3.getSize();
this.state = 12;
if (true) break;

case 12:
//C
this.state = 4;
if (index3 < groupLen3) {
this.state = 3;
_opt = group3.Get(index3);}
if (true) break;

case 13:
//C
this.state = 12;
index3++;
if (true) break;

case 3:
//C
this.state = 13;
RDebugUtils.currentLine=144834564;
 //BA.debugLineNum = 144834564;BA.debugLine="CustomListView1.AddTextItem(opt, opt)";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._addtextitem(_opt,_opt);
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=144834566;
 //BA.debugLineNum = 144834566;BA.debugLine="If AllowMultiSelection Then";

case 4:
//if
this.state = 11;
if (__ref._allowmultiselection /*boolean*/ ) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=144834567;
 //BA.debugLineNum = 144834567;BA.debugLine="Sleep(20)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xlisttemplate", "show"),(int) (20));
this.state = 14;
return;
case 14:
//C
this.state = 7;
;
RDebugUtils.currentLine=144834568;
 //BA.debugLineNum = 144834568;BA.debugLine="For i = 0 To CustomListView1.Size - 1";
if (true) break;

case 7:
//for
this.state = 10;
step8 = 1;
limit8 = (int) (__ref._customlistview1 /*b4a.example3.customlistview*/ ._getsize()-1);
_i = (int) (0) ;
this.state = 15;
if (true) break;

case 15:
//C
this.state = 10;
if ((step8 > 0 && _i <= limit8) || (step8 < 0 && _i >= limit8)) this.state = 9;
if (true) break;

case 16:
//C
this.state = 15;
_i = ((int)(0 + _i + step8)) ;
if (true) break;

case 9:
//C
this.state = 16;
RDebugUtils.currentLine=144834569;
 //BA.debugLineNum = 144834569;BA.debugLine="Dim item As CLVItem = CustomListView1.GetRawLis";
_item = __ref._customlistview1 /*b4a.example3.customlistview*/ ._getrawlistitem(_i);
RDebugUtils.currentLine=144834570;
 //BA.debugLineNum = 144834570;BA.debugLine="SelectItem (item, False)";
__ref._selectitem /*String*/ (null,_item,parent.__c.False);
 if (true) break;
if (true) break;

case 10:
//C
this.state = 11;
;
 if (true) break;

case 11:
//C
this.state = -1;
;
RDebugUtils.currentLine=144834573;
 //BA.debugLineNum = 144834573;BA.debugLine="XUIViewsUtils.AddStubToCLVIfNeeded(CustomListView";
parent._xuiviewsutils._addstubtoclvifneeded /*String*/ (ba,__ref._customlistview1 /*b4a.example3.customlistview*/ ,__ref._customlistview1 /*b4a.example3.customlistview*/ ._defaulttextbackgroundcolor);
RDebugUtils.currentLine=144834574;
 //BA.debugLineNum = 144834574;BA.debugLine="SelectedItem = \"\"";
__ref._selecteditem /*String*/  = "";
RDebugUtils.currentLine=144834576;
 //BA.debugLineNum = 144834576;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _dialogclosed(ir.parsikhesab.pakhsh.b4xlisttemplate __ref,int _result) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xlisttemplate";
if (Debug.shouldDelegate(ba, "dialogclosed", true))
	 {return ((String) Debug.delegate(ba, "dialogclosed", new Object[] {_result}));}
RDebugUtils.currentLine=145031168;
 //BA.debugLineNum = 145031168;BA.debugLine="Private Sub DialogClosed(Result As Int) 'ignore";
RDebugUtils.currentLine=145031170;
 //BA.debugLineNum = 145031170;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(ir.parsikhesab.pakhsh.b4xlisttemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xlisttemplate";
RDebugUtils.currentLine=144572416;
 //BA.debugLineNum = 144572416;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=144572417;
 //BA.debugLineNum = 144572417;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=144572418;
 //BA.debugLineNum = 144572418;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=144572419;
 //BA.debugLineNum = 144572419;BA.debugLine="Public CustomListView1 As CustomListView";
_customlistview1 = new b4a.example3.customlistview();
RDebugUtils.currentLine=144572420;
 //BA.debugLineNum = 144572420;BA.debugLine="Public Options As List";
_options = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=144572421;
 //BA.debugLineNum = 144572421;BA.debugLine="Public SelectedItem As String";
_selecteditem = "";
RDebugUtils.currentLine=144572422;
 //BA.debugLineNum = 144572422;BA.debugLine="Private xDialog As B4XDialog";
_xdialog = new ir.parsikhesab.pakhsh.b4xdialog();
RDebugUtils.currentLine=144572423;
 //BA.debugLineNum = 144572423;BA.debugLine="Public AllowMultiSelection As Boolean";
_allowmultiselection = false;
RDebugUtils.currentLine=144572424;
 //BA.debugLineNum = 144572424;BA.debugLine="Public SelectionColor As Int = 0xAA0086FF";
_selectioncolor = ((int)0xaa0086ff);
RDebugUtils.currentLine=144572425;
 //BA.debugLineNum = 144572425;BA.debugLine="Public SelectedItems As List";
_selecteditems = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=144572426;
 //BA.debugLineNum = 144572426;BA.debugLine="Public MultiSelectionMinimum As Int = 0";
_multiselectionminimum = (int) (0);
RDebugUtils.currentLine=144572427;
 //BA.debugLineNum = 144572427;BA.debugLine="End Sub";
return "";
}
public String  _customlistview1_itemclick(ir.parsikhesab.pakhsh.b4xlisttemplate __ref,int _index,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xlisttemplate";
if (Debug.shouldDelegate(ba, "customlistview1_itemclick", true))
	 {return ((String) Debug.delegate(ba, "customlistview1_itemclick", new Object[] {_index,_value}));}
b4a.example3.customlistview._clvitem _item = null;
RDebugUtils.currentLine=144965632;
 //BA.debugLineNum = 144965632;BA.debugLine="Private Sub CustomListView1_ItemClick (Index As In";
RDebugUtils.currentLine=144965633;
 //BA.debugLineNum = 144965633;BA.debugLine="If Value = \"\" Then Return";
if ((_value).equals((Object)(""))) { 
if (true) return "";};
RDebugUtils.currentLine=144965634;
 //BA.debugLineNum = 144965634;BA.debugLine="If AllowMultiSelection Then";
if (__ref._allowmultiselection /*boolean*/ ) { 
RDebugUtils.currentLine=144965635;
 //BA.debugLineNum = 144965635;BA.debugLine="Dim Item As CLVItem = CustomListView1.GetRawList";
_item = __ref._customlistview1 /*b4a.example3.customlistview*/ ._getrawlistitem(_index);
RDebugUtils.currentLine=144965636;
 //BA.debugLineNum = 144965636;BA.debugLine="SelectItem (Item, True)";
__ref._selectitem /*String*/ (null,_item,__c.True);
 }else {
RDebugUtils.currentLine=144965638;
 //BA.debugLineNum = 144965638;BA.debugLine="SelectedItem = Value";
__ref._selecteditem /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=144965639;
 //BA.debugLineNum = 144965639;BA.debugLine="SelectedItems.Clear";
__ref._selecteditems /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=144965640;
 //BA.debugLineNum = 144965640;BA.debugLine="SelectedItems.Add(Value)";
__ref._selecteditems /*anywheresoftware.b4a.objects.collections.List*/ .Add(_value);
RDebugUtils.currentLine=144965641;
 //BA.debugLineNum = 144965641;BA.debugLine="xDialog.Close(xui.DialogResponse_Positive)";
__ref._xdialog /*ir.parsikhesab.pakhsh.b4xdialog*/ ._close /*boolean*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive);
 };
RDebugUtils.currentLine=144965643;
 //BA.debugLineNum = 144965643;BA.debugLine="End Sub";
return "";
}
public String  _selectitem(ir.parsikhesab.pakhsh.b4xlisttemplate __ref,b4a.example3.customlistview._clvitem _item,boolean _toggle) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xlisttemplate";
if (Debug.shouldDelegate(ba, "selectitem", true))
	 {return ((String) Debug.delegate(ba, "selectitem", new Object[] {_item,_toggle}));}
int _index = 0;
boolean _selected = false;
RDebugUtils.currentLine=144900096;
 //BA.debugLineNum = 144900096;BA.debugLine="Private Sub SelectItem (Item As CLVItem, Toggle As";
RDebugUtils.currentLine=144900097;
 //BA.debugLineNum = 144900097;BA.debugLine="Dim index As Int = SelectedItems.IndexOf(Item.Val";
_index = __ref._selecteditems /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf(_item.Value);
RDebugUtils.currentLine=144900098;
 //BA.debugLineNum = 144900098;BA.debugLine="Dim Selected As Boolean = index > -1";
_selected = _index>-1;
RDebugUtils.currentLine=144900099;
 //BA.debugLineNum = 144900099;BA.debugLine="If Toggle Then Selected = Not(Selected)";
if (_toggle) { 
_selected = __c.Not(_selected);};
RDebugUtils.currentLine=144900100;
 //BA.debugLineNum = 144900100;BA.debugLine="If Selected Then";
if (_selected) { 
RDebugUtils.currentLine=144900101;
 //BA.debugLineNum = 144900101;BA.debugLine="If Not(Toggle) Then Item.Panel.Color = Selection";
if (__c.Not(_toggle)) { 
_item.Panel.setColor(__ref._selectioncolor /*int*/ );};
RDebugUtils.currentLine=144900102;
 //BA.debugLineNum = 144900102;BA.debugLine="Item.Color = CustomListView1.DefaultTextBackgrou";
_item.Color = __ref._customlistview1 /*b4a.example3.customlistview*/ ._defaulttextbackgroundcolor;
RDebugUtils.currentLine=144900103;
 //BA.debugLineNum = 144900103;BA.debugLine="If index = -1 Then SelectedItems.Add(Item.Value)";
if (_index==-1) { 
__ref._selecteditems /*anywheresoftware.b4a.objects.collections.List*/ .Add(_item.Value);};
 }else {
RDebugUtils.currentLine=144900105;
 //BA.debugLineNum = 144900105;BA.debugLine="Item.Color = SelectionColor";
_item.Color = __ref._selectioncolor /*int*/ ;
RDebugUtils.currentLine=144900106;
 //BA.debugLineNum = 144900106;BA.debugLine="If Not(Toggle) Then Item.Panel.Color = CustomLis";
if (__c.Not(_toggle)) { 
_item.Panel.setColor(__ref._customlistview1 /*b4a.example3.customlistview*/ ._defaulttextbackgroundcolor);};
RDebugUtils.currentLine=144900107;
 //BA.debugLineNum = 144900107;BA.debugLine="If index > -1 Then SelectedItems.RemoveAt(index)";
if (_index>-1) { 
__ref._selecteditems /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(_index);};
 };
RDebugUtils.currentLine=144900109;
 //BA.debugLineNum = 144900109;BA.debugLine="xDialog.SetButtonState(xui.DialogResponse_Positiv";
__ref._xdialog /*ir.parsikhesab.pakhsh.b4xdialog*/ ._setbuttonstate /*String*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive,__ref._selecteditems /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>=__ref._multiselectionminimum /*int*/ );
RDebugUtils.currentLine=144900110;
 //BA.debugLineNum = 144900110;BA.debugLine="End Sub";
return "";
}
public String  _resize(ir.parsikhesab.pakhsh.b4xlisttemplate __ref,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xlisttemplate";
if (Debug.shouldDelegate(ba, "resize", true))
	 {return ((String) Debug.delegate(ba, "resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=144703488;
 //BA.debugLineNum = 144703488;BA.debugLine="Public Sub Resize(Width As Int, Height As Int)";
RDebugUtils.currentLine=144703489;
 //BA.debugLineNum = 144703489;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, Width, Height)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),_width,_height);
RDebugUtils.currentLine=144703490;
 //BA.debugLineNum = 144703490;BA.debugLine="CustomListView1.Base_Resize(Width, Height)";
__ref._customlistview1 /*b4a.example3.customlistview*/ ._base_resize(_width,_height);
RDebugUtils.currentLine=144703491;
 //BA.debugLineNum = 144703491;BA.debugLine="End Sub";
return "";
}
}