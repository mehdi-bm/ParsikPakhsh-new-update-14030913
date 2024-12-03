package ir.parsikhesab.pakhsh;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class table extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "ir.parsikhesab.pakhsh.table");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", ir.parsikhesab.pakhsh.table.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _rowcol{
public boolean IsInitialized;
public int Row;
public int Col;
public void Initialize() {
IsInitialized = true;
Row = 0;
Col = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.StringUtils _stringutils1 = null;
public flm.b4a.scrollview2d.ScrollView2DWrapper _sv = null;
public anywheresoftware.b4a.objects.PanelWrapper _header = null;
public Object _callback = null;
public String _event = "";
public int _selectedrow = 0;
public anywheresoftware.b4a.objects.collections.List _data = null;
public anywheresoftware.b4a.objects.collections.List _labelscache = null;
public int _minvisiblerow = 0;
public int _maxvisiblerow = 0;
public boolean _visible = false;
public anywheresoftware.b4a.objects.collections.Map _visiblerows = null;
public int _numberofcolumns = 0;
public int _columnwidth = 0;
public int _rowheight = 0;
public int _headercolor = 0;
public int _tablecolor = 0;
public int _fontcolor = 0;
public int _headerfontcolor = 0;
public float _fontsize = 0f;
public int _alignment = 0;
public Object[] _selecteddrawable = null;
public Object[] _drawable1 = null;
public Object[] _drawable2 = null;
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
public String  _loadeshantiongrouplist(ir.parsikhesab.pakhsh.table __ref,anywheresoftware.b4a.objects.collections.List _lst,anywheresoftware.b4a.objects.collections.List _lst_colnametitle,int _n_col) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "loadeshantiongrouplist", false))
	 {return ((String) Debug.delegate(ba, "loadeshantiongrouplist", new Object[] {_lst,_lst_colnametitle,_n_col}));}
String[] _headers = null;
int[] _widths = null;
int _col = 0;
int _row = 0;
ir.parsikhesab.pakhsh.mcode._adapterlisteshantiongroup _item = null;
String[] _r = null;
RDebugUtils.currentLine=122880000;
 //BA.debugLineNum = 122880000;BA.debugLine="Public Sub LoadEshantionGroupList(Lst As List,Lst_";
RDebugUtils.currentLine=122880001;
 //BA.debugLineNum = 122880001;BA.debugLine="NumberOfColumns = N_Col";
__ref._numberofcolumns /*int*/  = _n_col;
RDebugUtils.currentLine=122880002;
 //BA.debugLineNum = 122880002;BA.debugLine="innerClearAll(NumberOfColumns)";
__ref._innerclearall /*String*/ (null,__ref._numberofcolumns /*int*/ );
RDebugUtils.currentLine=122880004;
 //BA.debugLineNum = 122880004;BA.debugLine="Dim headers(NumberOfColumns) As String";
_headers = new String[__ref._numberofcolumns /*int*/ ];
java.util.Arrays.fill(_headers,"");
RDebugUtils.currentLine=122880005;
 //BA.debugLineNum = 122880005;BA.debugLine="Dim Widths(NumberOfColumns) As Int";
_widths = new int[__ref._numberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=122880006;
 //BA.debugLineNum = 122880006;BA.debugLine="Dim col, row As Int";
_col = 0;
_row = 0;
RDebugUtils.currentLine=122880007;
 //BA.debugLineNum = 122880007;BA.debugLine="For col = 0 To NumberOfColumns - 1";
{
final int step6 = 1;
final int limit6 = (int) (__ref._numberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit6 ;_col = _col + step6 ) {
RDebugUtils.currentLine=122880008;
 //BA.debugLineNum = 122880008;BA.debugLine="headers(col) = Lst_ColNameTitle.get(col)";
_headers[_col] = BA.ObjectToString(_lst_colnametitle.Get(_col));
RDebugUtils.currentLine=122880009;
 //BA.debugLineNum = 122880009;BA.debugLine="Widths(col) = 162dip";
_widths[_col] = __c.DipToCurrent((int) (162));
 }
};
RDebugUtils.currentLine=122880011;
 //BA.debugLineNum = 122880011;BA.debugLine="SetHeader(headers,Widths)";
__ref._setheader /*String*/ (null,_headers,_widths);
RDebugUtils.currentLine=122880012;
 //BA.debugLineNum = 122880012;BA.debugLine="SetColumnsWidths(Widths)";
__ref._setcolumnswidths /*String*/ (null,_widths);
RDebugUtils.currentLine=122880015;
 //BA.debugLineNum = 122880015;BA.debugLine="For row = 0 To Lst.Size - 1";
{
final int step12 = 1;
final int limit12 = (int) (_lst.getSize()-1);
_row = (int) (0) ;
for (;_row <= limit12 ;_row = _row + step12 ) {
RDebugUtils.currentLine=122880016;
 //BA.debugLineNum = 122880016;BA.debugLine="Dim Item = Lst.Get(row) As AdapterListEshantionG";
_item = (ir.parsikhesab.pakhsh.mcode._adapterlisteshantiongroup)(_lst.Get(_row));
RDebugUtils.currentLine=122880017;
 //BA.debugLineNum = 122880017;BA.debugLine="Dim r(NumberOfColumns) As String";
_r = new String[__ref._numberofcolumns /*int*/ ];
java.util.Arrays.fill(_r,"");
RDebugUtils.currentLine=122880019;
 //BA.debugLineNum = 122880019;BA.debugLine="r(0) = row+1";
_r[(int) (0)] = BA.NumberToString(_row+1);
RDebugUtils.currentLine=122880020;
 //BA.debugLineNum = 122880020;BA.debugLine="r(1) = Item.fldCodeGroupKala";
_r[(int) (1)] = _item.fldCodeGroupKala /*String*/ ;
RDebugUtils.currentLine=122880021;
 //BA.debugLineNum = 122880021;BA.debugLine="r(2) = MCode.GetNameGroupKala(Item.fldCodeGroupK";
_r[(int) (2)] = _mcode._getnamegroupkala /*String*/ (ba,_item.fldCodeGroupKala /*String*/ );
RDebugUtils.currentLine=122880022;
 //BA.debugLineNum = 122880022;BA.debugLine="r(3) = Item.fldCodeGroupKalaEshantion";
_r[(int) (3)] = _item.fldCodeGroupKalaEshantion /*String*/ ;
RDebugUtils.currentLine=122880023;
 //BA.debugLineNum = 122880023;BA.debugLine="r(4) = MCode.GetNameGroupKala(Item.fldCodeGroupK";
_r[(int) (4)] = _mcode._getnamegroupkala /*String*/ (ba,_item.fldCodeGroupKalaEshantion /*String*/ );
RDebugUtils.currentLine=122880024;
 //BA.debugLineNum = 122880024;BA.debugLine="r(5) = Item.fldTedadEshantion";
_r[(int) (5)] = _item.fldTedadEshantion /*String*/ ;
RDebugUtils.currentLine=122880026;
 //BA.debugLineNum = 122880026;BA.debugLine="AddRow(r)";
__ref._addrow /*String*/ (null,_r);
 }
};
RDebugUtils.currentLine=122880028;
 //BA.debugLineNum = 122880028;BA.debugLine="End Sub";
return "";
}
public String  _setcolumnswidths(ir.parsikhesab.pakhsh.table __ref,int[] _widths) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setcolumnswidths", false))
	 {return ((String) Debug.delegate(ba, "setcolumnswidths", new Object[] {_widths}));}
anywheresoftware.b4a.objects.ConcreteViewWrapper _v = null;
int _i = 0;
anywheresoftware.b4a.objects.LabelWrapper[] _lbls = null;
int _lbl = 0;
RDebugUtils.currentLine=121569280;
 //BA.debugLineNum = 121569280;BA.debugLine="Public Sub SetColumnsWidths(Widths() As Int)";
RDebugUtils.currentLine=121569281;
 //BA.debugLineNum = 121569281;BA.debugLine="Dim v As View";
_v = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
RDebugUtils.currentLine=121569282;
 //BA.debugLineNum = 121569282;BA.debugLine="For i = 0 To Widths.Length - 1";
{
final int step2 = 1;
final int limit2 = (int) (_widths.length-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=121569283;
 //BA.debugLineNum = 121569283;BA.debugLine="v = Header.GetView(i)";
_v = __ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_i);
RDebugUtils.currentLine=121569284;
 //BA.debugLineNum = 121569284;BA.debugLine="v.Width = Widths(i) - 1dip";
_v.setWidth((int) (_widths[_i]-__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=121569285;
 //BA.debugLineNum = 121569285;BA.debugLine="If i > 0 Then";
if (_i>0) { 
RDebugUtils.currentLine=121569286;
 //BA.debugLineNum = 121569286;BA.debugLine="v.Left = Header.GetView(i-1).Left + Widths(i-1)";
_v.setLeft((int) (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView((int) (_i-1)).getLeft()+_widths[(int) (_i-1)]));
 };
 }
};
RDebugUtils.currentLine=121569289;
 //BA.debugLineNum = 121569289;BA.debugLine="Header.Width = Header.GetView(Widths.Length - 1).";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .setWidth((int) (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView((int) (_widths.length-1)).getLeft()+_widths[(int) (_widths.length-1)]));
RDebugUtils.currentLine=121569290;
 //BA.debugLineNum = 121569290;BA.debugLine="SV.Panel.Width = Header.Width";
__ref._sv /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().setWidth(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth());
RDebugUtils.currentLine=121569291;
 //BA.debugLineNum = 121569291;BA.debugLine="Dim lbls() As Label";
_lbls = new anywheresoftware.b4a.objects.LabelWrapper[(int) (0)];
{
int d0 = _lbls.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbls[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=121569292;
 //BA.debugLineNum = 121569292;BA.debugLine="For i = 0 To visibleRows.Size - 1";
{
final int step12 = 1;
final int limit12 = (int) (__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit12 ;_i = _i + step12 ) {
RDebugUtils.currentLine=121569293;
 //BA.debugLineNum = 121569293;BA.debugLine="lbls = visibleRows.GetValueAt(i)";
_lbls = (anywheresoftware.b4a.objects.LabelWrapper[])(__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .GetValueAt(_i));
RDebugUtils.currentLine=121569294;
 //BA.debugLineNum = 121569294;BA.debugLine="For lbl = 0 To lbls.Length - 1";
{
final int step14 = 1;
final int limit14 = (int) (_lbls.length-1);
_lbl = (int) (0) ;
for (;_lbl <= limit14 ;_lbl = _lbl + step14 ) {
RDebugUtils.currentLine=121569295;
 //BA.debugLineNum = 121569295;BA.debugLine="lbls(lbl).SetLayout(Header.GetView(lbl).Left, l";
_lbls[_lbl].SetLayout(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_lbl).getLeft(),_lbls[_lbl].getTop(),__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_lbl).getWidth(),__ref._rowheight /*int*/ );
 }
};
 }
};
RDebugUtils.currentLine=121569299;
 //BA.debugLineNum = 121569299;BA.debugLine="End Sub";
return "";
}
public String  _initialize(ir.parsikhesab.pakhsh.table __ref,anywheresoftware.b4a.BA _ba,Object _callbackmodule,String _eventname,int _vnumberofcolumns) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callbackmodule,_eventname,_vnumberofcolumns}));}
RDebugUtils.currentLine=121438208;
 //BA.debugLineNum = 121438208;BA.debugLine="Public Sub Initialize (CallbackModule As Object, E";
RDebugUtils.currentLine=121438209;
 //BA.debugLineNum = 121438209;BA.debugLine="SV.Initialize(0, 0, \"SV\")";
__ref._sv /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .Initialize(ba,(int) (0),(int) (0),"SV");
RDebugUtils.currentLine=121438210;
 //BA.debugLineNum = 121438210;BA.debugLine="SV.Panel.Color = TableColor";
__ref._sv /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().setColor(__ref._tablecolor /*int*/ );
RDebugUtils.currentLine=121438211;
 //BA.debugLineNum = 121438211;BA.debugLine="Callback = CallbackModule";
__ref._callback /*Object*/  = _callbackmodule;
RDebugUtils.currentLine=121438212;
 //BA.debugLineNum = 121438212;BA.debugLine="Event = EventName";
__ref._event /*String*/  = _eventname;
RDebugUtils.currentLine=121438213;
 //BA.debugLineNum = 121438213;BA.debugLine="innerClearAll(vNumberOfColumns)";
__ref._innerclearall /*String*/ (null,_vnumberofcolumns);
RDebugUtils.currentLine=121438214;
 //BA.debugLineNum = 121438214;BA.debugLine="End Sub";
return "";
}
public String  _addtoactivity(ir.parsikhesab.pakhsh.table __ref,anywheresoftware.b4a.objects.ActivityWrapper _act,int _left,int _top,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "addtoactivity", false))
	 {return ((String) Debug.delegate(ba, "addtoactivity", new Object[] {_act,_left,_top,_width,_height}));}
RDebugUtils.currentLine=121765888;
 //BA.debugLineNum = 121765888;BA.debugLine="Public Sub AddToActivity(Act As Activity, Left As";
RDebugUtils.currentLine=121765889;
 //BA.debugLineNum = 121765889;BA.debugLine="visible = True";
__ref._visible /*boolean*/  = __c.True;
RDebugUtils.currentLine=121765890;
 //BA.debugLineNum = 121765890;BA.debugLine="Header.Initialize(\"\")";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=121765893;
 //BA.debugLineNum = 121765893;BA.debugLine="Header.Color = TableColor";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(__ref._tablecolor /*int*/ );
RDebugUtils.currentLine=121765894;
 //BA.debugLineNum = 121765894;BA.debugLine="Act.AddView(Header, Left, Top , Width, RowHeight)";
_act.AddView((android.view.View)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),_left,_top,_width,__ref._rowheight /*int*/ );
RDebugUtils.currentLine=121765895;
 //BA.debugLineNum = 121765895;BA.debugLine="Act.AddView(SV, Left, Top + RowHeight, Width, Hei";
_act.AddView((android.view.View)(__ref._sv /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getObject()),_left,(int) (_top+__ref._rowheight /*int*/ ),_width,(int) (_height-__ref._rowheight /*int*/ ));
RDebugUtils.currentLine=121765896;
 //BA.debugLineNum = 121765896;BA.debugLine="ColumnWidth = SV.Width / NumberOfColumns";
__ref._columnwidth /*int*/  = (int) (__ref._sv /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getWidth()/(double)__ref._numberofcolumns /*int*/ );
RDebugUtils.currentLine=121765898;
 //BA.debugLineNum = 121765898;BA.debugLine="SV_ScrollChanged(0, 0)";
__ref._sv_scrollchanged /*String*/ (null,(int) (0),(int) (0));
RDebugUtils.currentLine=121765900;
 //BA.debugLineNum = 121765900;BA.debugLine="End Sub";
return "";
}
public String  _loadslistreportrizebargasht(ir.parsikhesab.pakhsh.table __ref,anywheresoftware.b4a.objects.collections.List _lst,anywheresoftware.b4a.objects.collections.List _lst_colnametitle,int _n_col) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "loadslistreportrizebargasht", false))
	 {return ((String) Debug.delegate(ba, "loadslistreportrizebargasht", new Object[] {_lst,_lst_colnametitle,_n_col}));}
String[] _headers = null;
int[] _widths = null;
int _col = 0;
int _row = 0;
ir.parsikhesab.pakhsh.mcode._adapterlistrizefaktor _item = null;
String[] _r = null;
RDebugUtils.currentLine=122945536;
 //BA.debugLineNum = 122945536;BA.debugLine="Public Sub LoadSListReportRizeBargasht(Lst As List";
RDebugUtils.currentLine=122945537;
 //BA.debugLineNum = 122945537;BA.debugLine="NumberOfColumns = N_Col";
__ref._numberofcolumns /*int*/  = _n_col;
RDebugUtils.currentLine=122945538;
 //BA.debugLineNum = 122945538;BA.debugLine="innerClearAll(NumberOfColumns)";
__ref._innerclearall /*String*/ (null,__ref._numberofcolumns /*int*/ );
RDebugUtils.currentLine=122945540;
 //BA.debugLineNum = 122945540;BA.debugLine="Dim headers(NumberOfColumns) As String";
_headers = new String[__ref._numberofcolumns /*int*/ ];
java.util.Arrays.fill(_headers,"");
RDebugUtils.currentLine=122945541;
 //BA.debugLineNum = 122945541;BA.debugLine="Dim Widths(NumberOfColumns) As Int";
_widths = new int[__ref._numberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=122945542;
 //BA.debugLineNum = 122945542;BA.debugLine="Dim col, row As Int";
_col = 0;
_row = 0;
RDebugUtils.currentLine=122945543;
 //BA.debugLineNum = 122945543;BA.debugLine="For col = 0 To NumberOfColumns - 1";
{
final int step6 = 1;
final int limit6 = (int) (__ref._numberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit6 ;_col = _col + step6 ) {
RDebugUtils.currentLine=122945544;
 //BA.debugLineNum = 122945544;BA.debugLine="headers(col) = Lst_ColNameTitle.get(col)";
_headers[_col] = BA.ObjectToString(_lst_colnametitle.Get(_col));
RDebugUtils.currentLine=122945545;
 //BA.debugLineNum = 122945545;BA.debugLine="Widths(col) = 162dip";
_widths[_col] = __c.DipToCurrent((int) (162));
 }
};
RDebugUtils.currentLine=122945547;
 //BA.debugLineNum = 122945547;BA.debugLine="SetHeader(headers,Widths)";
__ref._setheader /*String*/ (null,_headers,_widths);
RDebugUtils.currentLine=122945548;
 //BA.debugLineNum = 122945548;BA.debugLine="SetColumnsWidths(Widths)";
__ref._setcolumnswidths /*String*/ (null,_widths);
RDebugUtils.currentLine=122945551;
 //BA.debugLineNum = 122945551;BA.debugLine="For row = 0 To Lst.Size - 1";
{
final int step12 = 1;
final int limit12 = (int) (_lst.getSize()-1);
_row = (int) (0) ;
for (;_row <= limit12 ;_row = _row + step12 ) {
RDebugUtils.currentLine=122945552;
 //BA.debugLineNum = 122945552;BA.debugLine="Dim Item = Lst.Get(row) As AdapterListRizeFaktor";
_item = (ir.parsikhesab.pakhsh.mcode._adapterlistrizefaktor)(_lst.Get(_row));
RDebugUtils.currentLine=122945553;
 //BA.debugLineNum = 122945553;BA.debugLine="Dim r(NumberOfColumns) As String";
_r = new String[__ref._numberofcolumns /*int*/ ];
java.util.Arrays.fill(_r,"");
RDebugUtils.currentLine=122945555;
 //BA.debugLineNum = 122945555;BA.debugLine="r(0) = row+1";
_r[(int) (0)] = BA.NumberToString(_row+1);
RDebugUtils.currentLine=122945557;
 //BA.debugLineNum = 122945557;BA.debugLine="r(1) = Item.fldCodeKala";
_r[(int) (1)] = _item.fldCodeKala /*String*/ ;
RDebugUtils.currentLine=122945558;
 //BA.debugLineNum = 122945558;BA.debugLine="r(2) = Item.fldSharhKala";
_r[(int) (2)] = _item.fldSharhKala /*String*/ ;
RDebugUtils.currentLine=122945560;
 //BA.debugLineNum = 122945560;BA.debugLine="r(3) = myCode.Is_Null_adad(Item.fldTedadJoz)";
_r[(int) (3)] = _mycode._is_null_adad /*String*/ (ba,_item.fldTedadJoz /*String*/ );
RDebugUtils.currentLine=122945561;
 //BA.debugLineNum = 122945561;BA.debugLine="r(4) = myCode.Is_Null_adad(Item.fldTedadCarton)";
_r[(int) (4)] = _mycode._is_null_adad /*String*/ (ba,_item.fldTedadCarton /*String*/ );
RDebugUtils.currentLine=122945562;
 //BA.debugLineNum = 122945562;BA.debugLine="r(5)=Item.FldType";
_r[(int) (5)] = _item.FldType /*String*/ ;
RDebugUtils.currentLine=122945563;
 //BA.debugLineNum = 122945563;BA.debugLine="AddRow(r)";
__ref._addrow /*String*/ (null,_r);
 }
};
RDebugUtils.currentLine=122945565;
 //BA.debugLineNum = 122945565;BA.debugLine="End Sub";
return "";
}
public String  _loadslistreportrizebargashtresult(ir.parsikhesab.pakhsh.table __ref,anywheresoftware.b4a.objects.collections.List _lst,anywheresoftware.b4a.objects.collections.List _lst_colnametitle,int _n_col) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "loadslistreportrizebargashtresult", false))
	 {return ((String) Debug.delegate(ba, "loadslistreportrizebargashtresult", new Object[] {_lst,_lst_colnametitle,_n_col}));}
String[] _headers = null;
int[] _widths = null;
int _col = 0;
int _row = 0;
ir.parsikhesab.pakhsh.mcode._adapterlistrizefaktor _item = null;
String[] _r = null;
RDebugUtils.currentLine=123011072;
 //BA.debugLineNum = 123011072;BA.debugLine="Public Sub LoadSListReportRizeBargashtResult(Lst A";
RDebugUtils.currentLine=123011073;
 //BA.debugLineNum = 123011073;BA.debugLine="NumberOfColumns = N_Col";
__ref._numberofcolumns /*int*/  = _n_col;
RDebugUtils.currentLine=123011074;
 //BA.debugLineNum = 123011074;BA.debugLine="innerClearAll(NumberOfColumns)";
__ref._innerclearall /*String*/ (null,__ref._numberofcolumns /*int*/ );
RDebugUtils.currentLine=123011076;
 //BA.debugLineNum = 123011076;BA.debugLine="Dim headers(NumberOfColumns) As String";
_headers = new String[__ref._numberofcolumns /*int*/ ];
java.util.Arrays.fill(_headers,"");
RDebugUtils.currentLine=123011077;
 //BA.debugLineNum = 123011077;BA.debugLine="Dim Widths(NumberOfColumns) As Int";
_widths = new int[__ref._numberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=123011078;
 //BA.debugLineNum = 123011078;BA.debugLine="Dim col, row As Int";
_col = 0;
_row = 0;
RDebugUtils.currentLine=123011079;
 //BA.debugLineNum = 123011079;BA.debugLine="For col = 0 To NumberOfColumns - 1";
{
final int step6 = 1;
final int limit6 = (int) (__ref._numberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit6 ;_col = _col + step6 ) {
RDebugUtils.currentLine=123011080;
 //BA.debugLineNum = 123011080;BA.debugLine="headers(col) = Lst_ColNameTitle.get(col)";
_headers[_col] = BA.ObjectToString(_lst_colnametitle.Get(_col));
RDebugUtils.currentLine=123011081;
 //BA.debugLineNum = 123011081;BA.debugLine="Widths(col) = 162dip";
_widths[_col] = __c.DipToCurrent((int) (162));
 }
};
RDebugUtils.currentLine=123011083;
 //BA.debugLineNum = 123011083;BA.debugLine="SetHeader(headers,Widths)";
__ref._setheader /*String*/ (null,_headers,_widths);
RDebugUtils.currentLine=123011084;
 //BA.debugLineNum = 123011084;BA.debugLine="SetColumnsWidths(Widths)";
__ref._setcolumnswidths /*String*/ (null,_widths);
RDebugUtils.currentLine=123011087;
 //BA.debugLineNum = 123011087;BA.debugLine="For row = 0 To Lst.Size - 1";
{
final int step12 = 1;
final int limit12 = (int) (_lst.getSize()-1);
_row = (int) (0) ;
for (;_row <= limit12 ;_row = _row + step12 ) {
RDebugUtils.currentLine=123011088;
 //BA.debugLineNum = 123011088;BA.debugLine="Dim Item = Lst.Get(row) As AdapterListRizeFaktor";
_item = (ir.parsikhesab.pakhsh.mcode._adapterlistrizefaktor)(_lst.Get(_row));
RDebugUtils.currentLine=123011089;
 //BA.debugLineNum = 123011089;BA.debugLine="Dim r(NumberOfColumns) As String";
_r = new String[__ref._numberofcolumns /*int*/ ];
java.util.Arrays.fill(_r,"");
RDebugUtils.currentLine=123011091;
 //BA.debugLineNum = 123011091;BA.debugLine="r(0) = row+1";
_r[(int) (0)] = BA.NumberToString(_row+1);
RDebugUtils.currentLine=123011092;
 //BA.debugLineNum = 123011092;BA.debugLine="r(1) = Item.fldCodeKala";
_r[(int) (1)] = _item.fldCodeKala /*String*/ ;
RDebugUtils.currentLine=123011093;
 //BA.debugLineNum = 123011093;BA.debugLine="r(2) = Item.fldSharhKala";
_r[(int) (2)] = _item.fldSharhKala /*String*/ ;
RDebugUtils.currentLine=123011095;
 //BA.debugLineNum = 123011095;BA.debugLine="r(3) = myCode.Is_Null_adad(Item.fldTedadJoz)";
_r[(int) (3)] = _mycode._is_null_adad /*String*/ (ba,_item.fldTedadJoz /*String*/ );
RDebugUtils.currentLine=123011096;
 //BA.debugLineNum = 123011096;BA.debugLine="r(4) = myCode.Is_Null_adad(Item.fldTedadCarton)";
_r[(int) (4)] = _mycode._is_null_adad /*String*/ (ba,_item.fldTedadCarton /*String*/ );
RDebugUtils.currentLine=123011097;
 //BA.debugLineNum = 123011097;BA.debugLine="r(5) = \"مانده\"";
_r[(int) (5)] = "مانده";
RDebugUtils.currentLine=123011098;
 //BA.debugLineNum = 123011098;BA.debugLine="AddRow(r)";
__ref._addrow /*String*/ (null,_r);
 }
};
RDebugUtils.currentLine=123011100;
 //BA.debugLineNum = 123011100;BA.debugLine="End Sub";
return "";
}
public String  _loadslistsoorathesab(ir.parsikhesab.pakhsh.table __ref,anywheresoftware.b4a.objects.collections.List _lst,anywheresoftware.b4a.objects.collections.List _lst_colnametitle,int _n_col) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "loadslistsoorathesab", false))
	 {return ((String) Debug.delegate(ba, "loadslistsoorathesab", new Object[] {_lst,_lst_colnametitle,_n_col}));}
String[] _headers = null;
int[] _widths = null;
int _col = 0;
int _row = 0;
int _i = 0;
ir.parsikhesab.pakhsh.mcode._adapterreportsoorathesab _item = null;
String _fldmande = "";
String _fldbestankar = "";
String _fldbedehkar = "";
RDebugUtils.currentLine=123207680;
 //BA.debugLineNum = 123207680;BA.debugLine="Sub LoadSListSoorathesab(Lst As List,Lst_ColNameTi";
RDebugUtils.currentLine=123207681;
 //BA.debugLineNum = 123207681;BA.debugLine="NumberOfColumns = N_Col";
__ref._numberofcolumns /*int*/  = _n_col;
RDebugUtils.currentLine=123207682;
 //BA.debugLineNum = 123207682;BA.debugLine="innerClearAll(NumberOfColumns)";
__ref._innerclearall /*String*/ (null,__ref._numberofcolumns /*int*/ );
RDebugUtils.currentLine=123207684;
 //BA.debugLineNum = 123207684;BA.debugLine="Dim headers(NumberOfColumns) As String";
_headers = new String[__ref._numberofcolumns /*int*/ ];
java.util.Arrays.fill(_headers,"");
RDebugUtils.currentLine=123207685;
 //BA.debugLineNum = 123207685;BA.debugLine="Dim Widths(NumberOfColumns) As Int";
_widths = new int[__ref._numberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=123207686;
 //BA.debugLineNum = 123207686;BA.debugLine="Dim col, row As Int";
_col = 0;
_row = 0;
RDebugUtils.currentLine=123207687;
 //BA.debugLineNum = 123207687;BA.debugLine="For col = 0 To NumberOfColumns - 1";
{
final int step6 = 1;
final int limit6 = (int) (__ref._numberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit6 ;_col = _col + step6 ) {
RDebugUtils.currentLine=123207688;
 //BA.debugLineNum = 123207688;BA.debugLine="headers(col) = Lst_ColNameTitle.get(col)";
_headers[_col] = BA.ObjectToString(_lst_colnametitle.Get(_col));
RDebugUtils.currentLine=123207689;
 //BA.debugLineNum = 123207689;BA.debugLine="Widths(col) = 162dip";
_widths[_col] = __c.DipToCurrent((int) (162));
 }
};
RDebugUtils.currentLine=123207691;
 //BA.debugLineNum = 123207691;BA.debugLine="SetHeader(headers,Widths)";
__ref._setheader /*String*/ (null,_headers,_widths);
RDebugUtils.currentLine=123207692;
 //BA.debugLineNum = 123207692;BA.debugLine="SetColumnsWidths(Widths)";
__ref._setcolumnswidths /*String*/ (null,_widths);
RDebugUtils.currentLine=123207703;
 //BA.debugLineNum = 123207703;BA.debugLine="For i=0 To Lst.Size-1";
{
final int step12 = 1;
final int limit12 = (int) (_lst.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit12 ;_i = _i + step12 ) {
RDebugUtils.currentLine=123207704;
 //BA.debugLineNum = 123207704;BA.debugLine="Dim Item = Lst.Get(i) As AdapterReportSooratHesa";
_item = (ir.parsikhesab.pakhsh.mcode._adapterreportsoorathesab)(_lst.Get(_i));
RDebugUtils.currentLine=123207705;
 //BA.debugLineNum = 123207705;BA.debugLine="Dim fldMande As String";
_fldmande = "";
RDebugUtils.currentLine=123207706;
 //BA.debugLineNum = 123207706;BA.debugLine="Dim fldBestankar As String";
_fldbestankar = "";
RDebugUtils.currentLine=123207707;
 //BA.debugLineNum = 123207707;BA.debugLine="Dim fldBedehkar As String";
_fldbedehkar = "";
RDebugUtils.currentLine=123207709;
 //BA.debugLineNum = 123207709;BA.debugLine="If Item.fldMande<>Null Then";
if (_item.fldMande /*String*/ != null) { 
RDebugUtils.currentLine=123207710;
 //BA.debugLineNum = 123207710;BA.debugLine="fldMande=NumberFormat(Item.fldMande,1,3)";
_fldmande = __c.NumberFormat((double)(Double.parseDouble(_item.fldMande /*String*/ )),(int) (1),(int) (3));
 }else {
RDebugUtils.currentLine=123207712;
 //BA.debugLineNum = 123207712;BA.debugLine="fldMande=0";
_fldmande = BA.NumberToString(0);
 };
RDebugUtils.currentLine=123207715;
 //BA.debugLineNum = 123207715;BA.debugLine="If Item.fldBestankar<>Null Then";
if (_item.fldBestankar /*String*/ != null) { 
RDebugUtils.currentLine=123207716;
 //BA.debugLineNum = 123207716;BA.debugLine="fldBestankar=NumberFormat(Item.fldBestankar,1,3";
_fldbestankar = __c.NumberFormat((double)(Double.parseDouble(_item.fldBestankar /*String*/ )),(int) (1),(int) (3));
 }else {
RDebugUtils.currentLine=123207718;
 //BA.debugLineNum = 123207718;BA.debugLine="fldBestankar=0";
_fldbestankar = BA.NumberToString(0);
 };
RDebugUtils.currentLine=123207721;
 //BA.debugLineNum = 123207721;BA.debugLine="If Item.fldBedehkar<>Null Then";
if (_item.fldBedehkar /*String*/ != null) { 
RDebugUtils.currentLine=123207722;
 //BA.debugLineNum = 123207722;BA.debugLine="fldBedehkar=NumberFormat(Item.fldBedehkar,1,3)";
_fldbedehkar = __c.NumberFormat((double)(Double.parseDouble(_item.fldBedehkar /*String*/ )),(int) (1),(int) (3));
 }else {
RDebugUtils.currentLine=123207724;
 //BA.debugLineNum = 123207724;BA.debugLine="fldBedehkar=0";
_fldbedehkar = BA.NumberToString(0);
 };
RDebugUtils.currentLine=123207728;
 //BA.debugLineNum = 123207728;BA.debugLine="AddRow(Array As String (fldMande,fldBestankar,fl";
__ref._addrow /*String*/ (null,new String[]{_fldmande,_fldbestankar,_fldbedehkar,_item.fldDate /*String*/ ,_item.fldRiz /*String*/ ,_item.fldSharh /*String*/ ,_item.fldSanad /*String*/ ,_item.shomare /*String*/ ,_item.fldRadif /*String*/ });
 }
};
RDebugUtils.currentLine=123207735;
 //BA.debugLineNum = 123207735;BA.debugLine="ProgressDialogHide";
__c.ProgressDialogHide();
RDebugUtils.currentLine=123207737;
 //BA.debugLineNum = 123207737;BA.debugLine="End Sub";
return "";
}
public String  _setheader(ir.parsikhesab.pakhsh.table __ref,String[] _values,int[] _width) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setheader", false))
	 {return ((String) Debug.delegate(ba, "setheader", new Object[] {_values,_width}));}
int _i = 0;
int _lngwidth = 0;
anywheresoftware.b4a.objects.LabelWrapper _l = null;
RDebugUtils.currentLine=122224640;
 //BA.debugLineNum = 122224640;BA.debugLine="Public Sub SetHeader(Values() As String,Width() As";
RDebugUtils.currentLine=122224641;
 //BA.debugLineNum = 122224641;BA.debugLine="For I = Header.NumberOfViews - 1 To 0 Step -1";
{
final int step1 = -1;
final int limit1 = (int) (0);
_i = (int) (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()-1) ;
for (;_i >= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=122224642;
 //BA.debugLineNum = 122224642;BA.debugLine="Header.RemoveViewAt(I)";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .RemoveViewAt(_i);
 }
};
RDebugUtils.currentLine=122224644;
 //BA.debugLineNum = 122224644;BA.debugLine="Dim LngWidth As Int";
_lngwidth = 0;
RDebugUtils.currentLine=122224645;
 //BA.debugLineNum = 122224645;BA.debugLine="For I = 0 To NumberOfColumns - 1";
{
final int step5 = 1;
final int limit5 = (int) (__ref._numberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=122224646;
 //BA.debugLineNum = 122224646;BA.debugLine="Dim l As Label";
_l = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=122224647;
 //BA.debugLineNum = 122224647;BA.debugLine="l.Initialize(\"header\")";
_l.Initialize(ba,"header");
RDebugUtils.currentLine=122224648;
 //BA.debugLineNum = 122224648;BA.debugLine="l.Gravity = Gravity.CENTER";
_l.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=122224649;
 //BA.debugLineNum = 122224649;BA.debugLine="l.TextSize = FontSize";
_l.setTextSize(__ref._fontsize /*float*/ );
RDebugUtils.currentLine=122224650;
 //BA.debugLineNum = 122224650;BA.debugLine="l.Color = HeaderColor";
_l.setColor(__ref._headercolor /*int*/ );
RDebugUtils.currentLine=122224651;
 //BA.debugLineNum = 122224651;BA.debugLine="l.TextColor = HeaderFontColor";
_l.setTextColor(__ref._headerfontcolor /*int*/ );
RDebugUtils.currentLine=122224652;
 //BA.debugLineNum = 122224652;BA.debugLine="l.Typeface=Typeface.LoadFromAssets(\"iransansmono";
_l.setTypeface(__c.Typeface.LoadFromAssets("iransansmonospacednum_bold.ttf"));
RDebugUtils.currentLine=122224653;
 //BA.debugLineNum = 122224653;BA.debugLine="l.Text = Values(I)";
_l.setText(BA.ObjectToCharSequence(_values[_i]));
RDebugUtils.currentLine=122224654;
 //BA.debugLineNum = 122224654;BA.debugLine="l.Tag = I";
_l.setTag((Object)(_i));
RDebugUtils.currentLine=122224656;
 //BA.debugLineNum = 122224656;BA.debugLine="Header.AddView(l, LngWidth, 0, Width(I) - 1dip ,";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(_l.getObject()),_lngwidth,(int) (0),(int) (_width[_i]-__c.DipToCurrent((int) (1))),__ref._rowheight /*int*/ );
RDebugUtils.currentLine=122224657;
 //BA.debugLineNum = 122224657;BA.debugLine="LngWidth=LngWidth+Width(I)";
_lngwidth = (int) (_lngwidth+_width[_i]);
 }
};
RDebugUtils.currentLine=122224659;
 //BA.debugLineNum = 122224659;BA.debugLine="End Sub";
return "";
}
public String  _loadslistvisitor(ir.parsikhesab.pakhsh.table __ref,anywheresoftware.b4a.objects.collections.List _lst,anywheresoftware.b4a.objects.collections.List _lst_colnametitle,int _n_col) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "loadslistvisitor", false))
	 {return ((String) Debug.delegate(ba, "loadslistvisitor", new Object[] {_lst,_lst_colnametitle,_n_col}));}
String[] _headers = null;
int[] _widths = null;
int _col = 0;
int _row = 0;
int _i = 0;
ir.parsikhesab.pakhsh.mcode._adapterreportvisitor _item = null;
RDebugUtils.currentLine=123142144;
 //BA.debugLineNum = 123142144;BA.debugLine="Sub LoadSListVisitor(Lst As List,Lst_ColNameTitle";
RDebugUtils.currentLine=123142145;
 //BA.debugLineNum = 123142145;BA.debugLine="NumberOfColumns = N_Col";
__ref._numberofcolumns /*int*/  = _n_col;
RDebugUtils.currentLine=123142146;
 //BA.debugLineNum = 123142146;BA.debugLine="innerClearAll(NumberOfColumns)";
__ref._innerclearall /*String*/ (null,__ref._numberofcolumns /*int*/ );
RDebugUtils.currentLine=123142148;
 //BA.debugLineNum = 123142148;BA.debugLine="Dim headers(NumberOfColumns) As String";
_headers = new String[__ref._numberofcolumns /*int*/ ];
java.util.Arrays.fill(_headers,"");
RDebugUtils.currentLine=123142149;
 //BA.debugLineNum = 123142149;BA.debugLine="Dim Widths(NumberOfColumns) As Int";
_widths = new int[__ref._numberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=123142150;
 //BA.debugLineNum = 123142150;BA.debugLine="Dim col, row As Int";
_col = 0;
_row = 0;
RDebugUtils.currentLine=123142151;
 //BA.debugLineNum = 123142151;BA.debugLine="For col = 0 To NumberOfColumns - 1";
{
final int step6 = 1;
final int limit6 = (int) (__ref._numberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit6 ;_col = _col + step6 ) {
RDebugUtils.currentLine=123142152;
 //BA.debugLineNum = 123142152;BA.debugLine="headers(col) = Lst_ColNameTitle.get(col)";
_headers[_col] = BA.ObjectToString(_lst_colnametitle.Get(_col));
RDebugUtils.currentLine=123142153;
 //BA.debugLineNum = 123142153;BA.debugLine="Widths(col) = 162dip";
_widths[_col] = __c.DipToCurrent((int) (162));
 }
};
RDebugUtils.currentLine=123142155;
 //BA.debugLineNum = 123142155;BA.debugLine="SetHeader(headers,Widths)";
__ref._setheader /*String*/ (null,_headers,_widths);
RDebugUtils.currentLine=123142156;
 //BA.debugLineNum = 123142156;BA.debugLine="SetColumnsWidths(Widths)";
__ref._setcolumnswidths /*String*/ (null,_widths);
RDebugUtils.currentLine=123142167;
 //BA.debugLineNum = 123142167;BA.debugLine="For i=0 To Lst.Size-1";
{
final int step12 = 1;
final int limit12 = (int) (_lst.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit12 ;_i = _i + step12 ) {
RDebugUtils.currentLine=123142168;
 //BA.debugLineNum = 123142168;BA.debugLine="Dim Item = Lst.Get(i) As AdapterReportVisitor";
_item = (ir.parsikhesab.pakhsh.mcode._adapterreportvisitor)(_lst.Get(_i));
RDebugUtils.currentLine=123142169;
 //BA.debugLineNum = 123142169;BA.debugLine="AddRow(Array As String (NumberFormat(Item.fldFee";
__ref._addrow /*String*/ (null,new String[]{__c.NumberFormat((double)(Double.parseDouble(_item.fldFeeJoz /*String*/ )),(int) (1),(int) (3)),_item.fldCount /*String*/ ,_item.fldTedadKol /*String*/ ,_item.fldTedadCarton /*String*/ ,_item.fldTedadJoz /*String*/ ,_item.fldSharhKala /*String*/ });
 }
};
RDebugUtils.currentLine=123142176;
 //BA.debugLineNum = 123142176;BA.debugLine="ProgressDialogHide";
__c.ProgressDialogHide();
RDebugUtils.currentLine=123142178;
 //BA.debugLineNum = 123142178;BA.debugLine="End Sub";
return "";
}
public String  _loadslistrizfactorhavale(ir.parsikhesab.pakhsh.table __ref,anywheresoftware.b4a.objects.collections.List _lst,anywheresoftware.b4a.objects.collections.List _lst_colnametitle,int _n_col) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "loadslistrizfactorhavale", false))
	 {return ((String) Debug.delegate(ba, "loadslistrizfactorhavale", new Object[] {_lst,_lst_colnametitle,_n_col}));}
String[] _headers = null;
int[] _widths = null;
int _col = 0;
int _row = 0;
ir.parsikhesab.pakhsh.mcode._adapterizfactorhavale _item = null;
String[] _r = null;
RDebugUtils.currentLine=123076608;
 //BA.debugLineNum = 123076608;BA.debugLine="Public Sub LoadSListRizFactorHavale(Lst As List,Ls";
RDebugUtils.currentLine=123076609;
 //BA.debugLineNum = 123076609;BA.debugLine="NumberOfColumns = N_Col";
__ref._numberofcolumns /*int*/  = _n_col;
RDebugUtils.currentLine=123076610;
 //BA.debugLineNum = 123076610;BA.debugLine="innerClearAll(NumberOfColumns)";
__ref._innerclearall /*String*/ (null,__ref._numberofcolumns /*int*/ );
RDebugUtils.currentLine=123076612;
 //BA.debugLineNum = 123076612;BA.debugLine="Dim headers(NumberOfColumns) As String";
_headers = new String[__ref._numberofcolumns /*int*/ ];
java.util.Arrays.fill(_headers,"");
RDebugUtils.currentLine=123076613;
 //BA.debugLineNum = 123076613;BA.debugLine="Dim Widths(NumberOfColumns) As Int";
_widths = new int[__ref._numberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=123076614;
 //BA.debugLineNum = 123076614;BA.debugLine="Dim col, row As Int";
_col = 0;
_row = 0;
RDebugUtils.currentLine=123076615;
 //BA.debugLineNum = 123076615;BA.debugLine="For col = 0 To NumberOfColumns - 1";
{
final int step6 = 1;
final int limit6 = (int) (__ref._numberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit6 ;_col = _col + step6 ) {
RDebugUtils.currentLine=123076616;
 //BA.debugLineNum = 123076616;BA.debugLine="headers(col) = Lst_ColNameTitle.get(col)";
_headers[_col] = BA.ObjectToString(_lst_colnametitle.Get(_col));
RDebugUtils.currentLine=123076617;
 //BA.debugLineNum = 123076617;BA.debugLine="Widths(col) = 162dip";
_widths[_col] = __c.DipToCurrent((int) (162));
 }
};
RDebugUtils.currentLine=123076619;
 //BA.debugLineNum = 123076619;BA.debugLine="SetHeader(headers,Widths)";
__ref._setheader /*String*/ (null,_headers,_widths);
RDebugUtils.currentLine=123076620;
 //BA.debugLineNum = 123076620;BA.debugLine="SetColumnsWidths(Widths)";
__ref._setcolumnswidths /*String*/ (null,_widths);
RDebugUtils.currentLine=123076623;
 //BA.debugLineNum = 123076623;BA.debugLine="For row = 0 To Lst.Size - 1";
{
final int step12 = 1;
final int limit12 = (int) (_lst.getSize()-1);
_row = (int) (0) ;
for (;_row <= limit12 ;_row = _row + step12 ) {
RDebugUtils.currentLine=123076624;
 //BA.debugLineNum = 123076624;BA.debugLine="Dim Item = Lst.Get(row) As AdapteRizFactorHavale";
_item = (ir.parsikhesab.pakhsh.mcode._adapterizfactorhavale)(_lst.Get(_row));
RDebugUtils.currentLine=123076625;
 //BA.debugLineNum = 123076625;BA.debugLine="Dim r(NumberOfColumns) As String";
_r = new String[__ref._numberofcolumns /*int*/ ];
java.util.Arrays.fill(_r,"");
RDebugUtils.currentLine=123076627;
 //BA.debugLineNum = 123076627;BA.debugLine="r(0) = row+1";
_r[(int) (0)] = BA.NumberToString(_row+1);
RDebugUtils.currentLine=123076629;
 //BA.debugLineNum = 123076629;BA.debugLine="r(1) = Item.fldSharhKala";
_r[(int) (1)] = _item.fldSharhKala /*String*/ ;
RDebugUtils.currentLine=123076630;
 //BA.debugLineNum = 123076630;BA.debugLine="r(2) = Item.fldCodeKala";
_r[(int) (2)] = _item.fldCodeKala /*String*/ ;
RDebugUtils.currentLine=123076632;
 //BA.debugLineNum = 123076632;BA.debugLine="r(3) = NumberFormat(Item.fldFeeJoz	,1,3)";
_r[(int) (3)] = __c.NumberFormat((double)(Double.parseDouble(_item.fldFeeJoz /*String*/ )),(int) (1),(int) (3));
RDebugUtils.currentLine=123076633;
 //BA.debugLineNum = 123076633;BA.debugLine="r(4) = NumberFormat(Item.fldFeeYekCarton,1,3)";
_r[(int) (4)] = __c.NumberFormat((double)(Double.parseDouble(_item.fldFeeYekCarton /*String*/ )),(int) (1),(int) (3));
RDebugUtils.currentLine=123076636;
 //BA.debugLineNum = 123076636;BA.debugLine="If Item.fldMablaghTakhfif>0 Then";
if ((double)(Double.parseDouble(_item.fldMablaghTakhfif /*String*/ ))>0) { 
RDebugUtils.currentLine=123076637;
 //BA.debugLineNum = 123076637;BA.debugLine="r(5) = NumberFormat(Item.fldMablaghTakhfif,1,3)";
_r[(int) (5)] = __c.NumberFormat((double)(Double.parseDouble(_item.fldMablaghTakhfif /*String*/ )),(int) (1),(int) (3));
RDebugUtils.currentLine=123076638;
 //BA.debugLineNum = 123076638;BA.debugLine="r(6) =Item.fldDarsadTakhfif";
_r[(int) (6)] = _item.fldDarsadTakhfif /*String*/ ;
 }else {
RDebugUtils.currentLine=123076640;
 //BA.debugLineNum = 123076640;BA.debugLine="r(5) =0";
_r[(int) (5)] = BA.NumberToString(0);
RDebugUtils.currentLine=123076641;
 //BA.debugLineNum = 123076641;BA.debugLine="r(6) =0";
_r[(int) (6)] = BA.NumberToString(0);
 };
RDebugUtils.currentLine=123076644;
 //BA.debugLineNum = 123076644;BA.debugLine="r(7) = Item.fldTedadJoz";
_r[(int) (7)] = _item.fldTedadJoz /*String*/ ;
RDebugUtils.currentLine=123076645;
 //BA.debugLineNum = 123076645;BA.debugLine="r(8) = Item.fldTedadCarton";
_r[(int) (8)] = _item.fldTedadCarton /*String*/ ;
RDebugUtils.currentLine=123076647;
 //BA.debugLineNum = 123076647;BA.debugLine="r(9) = Item.fldCodeAnbar";
_r[(int) (9)] = _item.fldCodeAnbar /*String*/ ;
RDebugUtils.currentLine=123076648;
 //BA.debugLineNum = 123076648;BA.debugLine="r(10) = Item.fldCodeVasete";
_r[(int) (10)] = _item.fldCodeVasete /*String*/ ;
RDebugUtils.currentLine=123076649;
 //BA.debugLineNum = 123076649;BA.debugLine="r(11) = Item.fldC_Ranandeh";
_r[(int) (11)] = _item.fldC_Ranandeh /*String*/ ;
RDebugUtils.currentLine=123076650;
 //BA.debugLineNum = 123076650;BA.debugLine="r(12) = Item.fldN_Ranandeh";
_r[(int) (12)] = _item.fldN_Ranandeh /*String*/ ;
RDebugUtils.currentLine=123076652;
 //BA.debugLineNum = 123076652;BA.debugLine="AddRow(r)";
__ref._addrow /*String*/ (null,_r);
 }
};
RDebugUtils.currentLine=123076654;
 //BA.debugLineNum = 123076654;BA.debugLine="End Sub";
return "";
}
public String  _loadslist(ir.parsikhesab.pakhsh.table __ref,anywheresoftware.b4a.objects.collections.List _lst,anywheresoftware.b4a.objects.collections.List _lst_colnametitle,int _n_col) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "loadslist", false))
	 {return ((String) Debug.delegate(ba, "loadslist", new Object[] {_lst,_lst_colnametitle,_n_col}));}
String[] _headers = null;
int[] _widths = null;
int _col = 0;
int _row = 0;
ir.parsikhesab.pakhsh.mcode._adapterlistkala _item = null;
String[] _r = null;
RDebugUtils.currentLine=122814464;
 //BA.debugLineNum = 122814464;BA.debugLine="Public Sub LoadSList(Lst As List,Lst_ColNameTitle";
RDebugUtils.currentLine=122814465;
 //BA.debugLineNum = 122814465;BA.debugLine="NumberOfColumns = N_Col";
__ref._numberofcolumns /*int*/  = _n_col;
RDebugUtils.currentLine=122814466;
 //BA.debugLineNum = 122814466;BA.debugLine="innerClearAll(NumberOfColumns)";
__ref._innerclearall /*String*/ (null,__ref._numberofcolumns /*int*/ );
RDebugUtils.currentLine=122814468;
 //BA.debugLineNum = 122814468;BA.debugLine="Dim headers(NumberOfColumns) As String";
_headers = new String[__ref._numberofcolumns /*int*/ ];
java.util.Arrays.fill(_headers,"");
RDebugUtils.currentLine=122814469;
 //BA.debugLineNum = 122814469;BA.debugLine="Dim Widths(NumberOfColumns) As Int";
_widths = new int[__ref._numberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=122814470;
 //BA.debugLineNum = 122814470;BA.debugLine="Dim col, row As Int";
_col = 0;
_row = 0;
RDebugUtils.currentLine=122814471;
 //BA.debugLineNum = 122814471;BA.debugLine="For col = 0 To NumberOfColumns - 1";
{
final int step6 = 1;
final int limit6 = (int) (__ref._numberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit6 ;_col = _col + step6 ) {
RDebugUtils.currentLine=122814472;
 //BA.debugLineNum = 122814472;BA.debugLine="headers(col) = Lst_ColNameTitle.get(col)";
_headers[_col] = BA.ObjectToString(_lst_colnametitle.Get(_col));
RDebugUtils.currentLine=122814473;
 //BA.debugLineNum = 122814473;BA.debugLine="Widths(col) = 162dip";
_widths[_col] = __c.DipToCurrent((int) (162));
 }
};
RDebugUtils.currentLine=122814475;
 //BA.debugLineNum = 122814475;BA.debugLine="SetHeader(headers,Widths)";
__ref._setheader /*String*/ (null,_headers,_widths);
RDebugUtils.currentLine=122814476;
 //BA.debugLineNum = 122814476;BA.debugLine="SetColumnsWidths(Widths)";
__ref._setcolumnswidths /*String*/ (null,_widths);
RDebugUtils.currentLine=122814479;
 //BA.debugLineNum = 122814479;BA.debugLine="For row = 0 To Lst.Size - 1";
{
final int step12 = 1;
final int limit12 = (int) (_lst.getSize()-1);
_row = (int) (0) ;
for (;_row <= limit12 ;_row = _row + step12 ) {
RDebugUtils.currentLine=122814480;
 //BA.debugLineNum = 122814480;BA.debugLine="Dim Item = Lst.Get(row) As AdapterListKala";
_item = (ir.parsikhesab.pakhsh.mcode._adapterlistkala)(_lst.Get(_row));
RDebugUtils.currentLine=122814481;
 //BA.debugLineNum = 122814481;BA.debugLine="Dim r(NumberOfColumns) As String";
_r = new String[__ref._numberofcolumns /*int*/ ];
java.util.Arrays.fill(_r,"");
RDebugUtils.currentLine=122814483;
 //BA.debugLineNum = 122814483;BA.debugLine="r(0) = row+1";
_r[(int) (0)] = BA.NumberToString(_row+1);
RDebugUtils.currentLine=122814485;
 //BA.debugLineNum = 122814485;BA.debugLine="r(1) = Item.NameKala";
_r[(int) (1)] = _item.NameKala /*String*/ ;
RDebugUtils.currentLine=122814486;
 //BA.debugLineNum = 122814486;BA.debugLine="r(2) = Item.CodeKala";
_r[(int) (2)] = _item.CodeKala /*String*/ ;
RDebugUtils.currentLine=122814488;
 //BA.debugLineNum = 122814488;BA.debugLine="r(3) = NumberFormat(Item.FeeForoosh	,1,3)";
_r[(int) (3)] = __c.NumberFormat(_item.FeeForoosh /*int*/ ,(int) (1),(int) (3));
RDebugUtils.currentLine=122814489;
 //BA.debugLineNum = 122814489;BA.debugLine="r(4) = NumberFormat(Item.fldFeeBadAzTakhfif,1,3)";
_r[(int) (4)] = __c.NumberFormat((double)(Double.parseDouble(_item.fldFeeBadAzTakhfif /*String*/ )),(int) (1),(int) (3));
RDebugUtils.currentLine=122814491;
 //BA.debugLineNum = 122814491;BA.debugLine="r(5) = NumberFormat(Item.MablaghTakhfif,1,3)";
_r[(int) (5)] = __c.NumberFormat(_item.MablaghTakhfif /*int*/ ,(int) (1),(int) (3));
RDebugUtils.currentLine=122814492;
 //BA.debugLineNum = 122814492;BA.debugLine="r(6) = NumberFormat(Item.fldDarsadTakhfif,1,3)";
_r[(int) (6)] = __c.NumberFormat((double)(Double.parseDouble(_item.fldDarsadTakhfif /*String*/ )),(int) (1),(int) (3));
RDebugUtils.currentLine=122814493;
 //BA.debugLineNum = 122814493;BA.debugLine="If Item.MablaghTakhfif>0 Then";
if (_item.MablaghTakhfif /*int*/ >0) { 
RDebugUtils.currentLine=122814494;
 //BA.debugLineNum = 122814494;BA.debugLine="r(7) =0";
_r[(int) (7)] = BA.NumberToString(0);
 }else {
RDebugUtils.currentLine=122814496;
 //BA.debugLineNum = 122814496;BA.debugLine="If Item.fldFeeBadAzTakhfif>0 Then";
if ((double)(Double.parseDouble(_item.fldFeeBadAzTakhfif /*String*/ ))>0) { 
RDebugUtils.currentLine=122814497;
 //BA.debugLineNum = 122814497;BA.debugLine="r(7) = NumberFormat(Item.FeeForoosh-Item.fldFe";
_r[(int) (7)] = __c.NumberFormat(_item.FeeForoosh /*int*/ -(double)(Double.parseDouble(_item.fldFeeBadAzTakhfif /*String*/ )),(int) (1),(int) (3));
 }else {
RDebugUtils.currentLine=122814499;
 //BA.debugLineNum = 122814499;BA.debugLine="r(7) =0";
_r[(int) (7)] = BA.NumberToString(0);
 };
 };
RDebugUtils.currentLine=122814505;
 //BA.debugLineNum = 122814505;BA.debugLine="r(8) = myCode.Is_Null_adad(Item.fldDarsadArzeshA";
_r[(int) (8)] = _mycode._is_null_adad /*String*/ (ba,_item.fldDarsadArzeshAfzode /*String*/ );
RDebugUtils.currentLine=122814506;
 //BA.debugLineNum = 122814506;BA.debugLine="r(9) = myCode.Is_Null_Price(Item.fldArzeshAfzode";
_r[(int) (9)] = _mycode._is_null_price /*String*/ (ba,_item.fldArzeshAfzode /*String*/ );
RDebugUtils.currentLine=122814508;
 //BA.debugLineNum = 122814508;BA.debugLine="r(10) = Item.TedadDarSabadJoz";
_r[(int) (10)] = _item.TedadDarSabadJoz /*String*/ ;
RDebugUtils.currentLine=122814509;
 //BA.debugLineNum = 122814509;BA.debugLine="r(11) = Item.NameVahed";
_r[(int) (11)] = _item.NameVahed /*String*/ ;
RDebugUtils.currentLine=122814511;
 //BA.debugLineNum = 122814511;BA.debugLine="r(12) = Item.TedadDarSabadKol";
_r[(int) (12)] = _item.TedadDarSabadKol /*String*/ ;
RDebugUtils.currentLine=122814512;
 //BA.debugLineNum = 122814512;BA.debugLine="r(13) = Item.NameVahed2";
_r[(int) (13)] = _item.NameVahed2 /*String*/ ;
RDebugUtils.currentLine=122814514;
 //BA.debugLineNum = 122814514;BA.debugLine="r(14) = Item.Tozihat";
_r[(int) (14)] = _item.Tozihat /*String*/ ;
RDebugUtils.currentLine=122814515;
 //BA.debugLineNum = 122814515;BA.debugLine="AddRow(r)";
__ref._addrow /*String*/ (null,_r);
 }
};
RDebugUtils.currentLine=122814517;
 //BA.debugLineNum = 122814517;BA.debugLine="End Sub";
return "";
}
public String  _addrow(ir.parsikhesab.pakhsh.table __ref,String[] _values) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "addrow", false))
	 {return ((String) Debug.delegate(ba, "addrow", new Object[] {_values}));}
int _lastrow = 0;
RDebugUtils.currentLine=121831424;
 //BA.debugLineNum = 121831424;BA.debugLine="Public Sub AddRow(Values() As String)";
RDebugUtils.currentLine=121831425;
 //BA.debugLineNum = 121831425;BA.debugLine="If Values.Length <> NumberOfColumns Then";
if (_values.length!=__ref._numberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=121831426;
 //BA.debugLineNum = 121831426;BA.debugLine="Log(\"Wrong number of values.\")";
__c.LogImpl("5121831426","Wrong number of values.",0);
RDebugUtils.currentLine=121831427;
 //BA.debugLineNum = 121831427;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=121831429;
 //BA.debugLineNum = 121831429;BA.debugLine="Data.Add(Values)";
__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_values));
RDebugUtils.currentLine=121831430;
 //BA.debugLineNum = 121831430;BA.debugLine="Dim lastRow As Int";
_lastrow = 0;
RDebugUtils.currentLine=121831431;
 //BA.debugLineNum = 121831431;BA.debugLine="lastRow = Data.Size - 1";
_lastrow = (int) (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
RDebugUtils.currentLine=121831432;
 //BA.debugLineNum = 121831432;BA.debugLine="If lastRow < (SV.VerticalScrollPosition + SV.Heig";
if (_lastrow<(__ref._sv /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getVerticalScrollPosition()+__ref._sv /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight())/(double)__ref._rowheight /*int*/ +1) { 
RDebugUtils.currentLine=121831433;
 //BA.debugLineNum = 121831433;BA.debugLine="ShowRow(lastRow)";
__ref._showrow /*String*/ (null,_lastrow);
 };
RDebugUtils.currentLine=121831435;
 //BA.debugLineNum = 121831435;BA.debugLine="SV.Panel.Height = Data.Size * RowHeight";
__ref._sv /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().setHeight((int) (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()*__ref._rowheight /*int*/ ));
RDebugUtils.currentLine=121831436;
 //BA.debugLineNum = 121831436;BA.debugLine="End Sub";
return "";
}
public String  _showrow(ir.parsikhesab.pakhsh.table __ref,int _row) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "showrow", false))
	 {return ((String) Debug.delegate(ba, "showrow", new Object[] {_row}));}
anywheresoftware.b4a.objects.LabelWrapper[] _lbls = null;
String[] _values = null;
Object[] _rowcolor = null;
int _i = 0;
RDebugUtils.currentLine=121896960;
 //BA.debugLineNum = 121896960;BA.debugLine="Private Sub ShowRow(row As Int)";
RDebugUtils.currentLine=121896961;
 //BA.debugLineNum = 121896961;BA.debugLine="If visibleRows.ContainsKey(row) Then Return";
if (__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_row))) { 
if (true) return "";};
RDebugUtils.currentLine=121896963;
 //BA.debugLineNum = 121896963;BA.debugLine="Dim lbls() As Label";
_lbls = new anywheresoftware.b4a.objects.LabelWrapper[(int) (0)];
{
int d0 = _lbls.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbls[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=121896964;
 //BA.debugLineNum = 121896964;BA.debugLine="Dim values() As String";
_values = new String[(int) (0)];
java.util.Arrays.fill(_values,"");
RDebugUtils.currentLine=121896965;
 //BA.debugLineNum = 121896965;BA.debugLine="lbls = GetLabels(row)";
_lbls = __ref._getlabels /*anywheresoftware.b4a.objects.LabelWrapper[]*/ (null,_row);
RDebugUtils.currentLine=121896966;
 //BA.debugLineNum = 121896966;BA.debugLine="values = Data.Get(row)";
_values = (String[])(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Get(_row));
RDebugUtils.currentLine=121896967;
 //BA.debugLineNum = 121896967;BA.debugLine="visibleRows.Put(row, lbls)";
__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_row),(Object)(_lbls));
RDebugUtils.currentLine=121896968;
 //BA.debugLineNum = 121896968;BA.debugLine="Dim rowColor() As Object";
_rowcolor = new Object[(int) (0)];
{
int d0 = _rowcolor.length;
for (int i0 = 0;i0 < d0;i0++) {
_rowcolor[i0] = new Object();
}
}
;
RDebugUtils.currentLine=121896969;
 //BA.debugLineNum = 121896969;BA.debugLine="If row = SelectedRow Then";
if (_row==__ref._selectedrow /*int*/ ) { 
RDebugUtils.currentLine=121896970;
 //BA.debugLineNum = 121896970;BA.debugLine="rowColor = SelectedDrawable";
_rowcolor = __ref._selecteddrawable /*Object[]*/ ;
 }else 
{RDebugUtils.currentLine=121896971;
 //BA.debugLineNum = 121896971;BA.debugLine="Else If row Mod 2 = 0 Then";
if (_row%2==0) { 
RDebugUtils.currentLine=121896972;
 //BA.debugLineNum = 121896972;BA.debugLine="rowColor = Drawable1";
_rowcolor = __ref._drawable1 /*Object[]*/ ;
 }else {
RDebugUtils.currentLine=121896974;
 //BA.debugLineNum = 121896974;BA.debugLine="rowColor = Drawable2";
_rowcolor = __ref._drawable2 /*Object[]*/ ;
 }}
;
RDebugUtils.currentLine=121896976;
 //BA.debugLineNum = 121896976;BA.debugLine="For I = 0 To lbls.Length - 1";
{
final int step15 = 1;
final int limit15 = (int) (_lbls.length-1);
_i = (int) (0) ;
for (;_i <= limit15 ;_i = _i + step15 ) {
RDebugUtils.currentLine=121896977;
 //BA.debugLineNum = 121896977;BA.debugLine="SV.Panel.AddView(lbls(I), Header.GetView(I).Left";
__ref._sv /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().AddView((android.view.View)(_lbls[_i].getObject()),__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_i).getLeft(),(int) (_row*__ref._rowheight /*int*/ ),__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_i).getWidth(),(int) (__ref._rowheight /*int*/ -__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=121896979;
 //BA.debugLineNum = 121896979;BA.debugLine="lbls(I).Text = values(I)";
_lbls[_i].setText(BA.ObjectToCharSequence(_values[_i]));
RDebugUtils.currentLine=121896980;
 //BA.debugLineNum = 121896980;BA.debugLine="lbls(I).Background = rowColor(I)";
_lbls[_i].setBackground((android.graphics.drawable.Drawable)(_rowcolor[_i]));
 }
};
RDebugUtils.currentLine=121896982;
 //BA.debugLineNum = 121896982;BA.debugLine="End Sub";
return "";
}
public String  _sv_scrollchanged(ir.parsikhesab.pakhsh.table __ref,int _posx,int _posy) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "sv_scrollchanged", false))
	 {return ((String) Debug.delegate(ba, "sv_scrollchanged", new Object[] {_posx,_posy}));}
int _currentmin = 0;
int _currentmax = 0;
int _i = 0;
RDebugUtils.currentLine=121700352;
 //BA.debugLineNum = 121700352;BA.debugLine="Private Sub SV_ScrollChanged(PosX As Int, PosY As";
RDebugUtils.currentLine=121700353;
 //BA.debugLineNum = 121700353;BA.debugLine="Dim currentMin, currentMax As Int";
_currentmin = 0;
_currentmax = 0;
RDebugUtils.currentLine=121700354;
 //BA.debugLineNum = 121700354;BA.debugLine="currentMin = Max(0, PosY / RowHeight - 30)";
_currentmin = (int) (__c.Max(0,_posy/(double)__ref._rowheight /*int*/ -30));
RDebugUtils.currentLine=121700355;
 //BA.debugLineNum = 121700355;BA.debugLine="currentMax = Min(Data.Size - 1, (PosY + SV.Height";
_currentmax = (int) (__c.Min(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1,(_posy+__ref._sv /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight())/(double)__ref._rowheight /*int*/ +30));
RDebugUtils.currentLine=121700356;
 //BA.debugLineNum = 121700356;BA.debugLine="If minVisibleRow > -1 Then";
if (__ref._minvisiblerow /*int*/ >-1) { 
RDebugUtils.currentLine=121700357;
 //BA.debugLineNum = 121700357;BA.debugLine="If minVisibleRow < currentMin Then";
if (__ref._minvisiblerow /*int*/ <_currentmin) { 
RDebugUtils.currentLine=121700359;
 //BA.debugLineNum = 121700359;BA.debugLine="For I = minVisibleRow To Min(currentMin - 1, ma";
{
final int step6 = 1;
final int limit6 = (int) (__c.Min(_currentmin-1,__ref._maxvisiblerow /*int*/ ));
_i = __ref._minvisiblerow /*int*/  ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=121700360;
 //BA.debugLineNum = 121700360;BA.debugLine="HideRow(I)";
__ref._hiderow /*String*/ (null,_i);
 }
};
 }else 
{RDebugUtils.currentLine=121700362;
 //BA.debugLineNum = 121700362;BA.debugLine="Else If minVisibleRow > currentMin Then";
if (__ref._minvisiblerow /*int*/ >_currentmin) { 
RDebugUtils.currentLine=121700364;
 //BA.debugLineNum = 121700364;BA.debugLine="For I = currentMin To Min(minVisibleRow - 1, cu";
{
final int step10 = 1;
final int limit10 = (int) (__c.Min(__ref._minvisiblerow /*int*/ -1,_currentmax));
_i = _currentmin ;
for (;_i <= limit10 ;_i = _i + step10 ) {
RDebugUtils.currentLine=121700365;
 //BA.debugLineNum = 121700365;BA.debugLine="ShowRow(I)";
__ref._showrow /*String*/ (null,_i);
 }
};
 }}
;
RDebugUtils.currentLine=121700368;
 //BA.debugLineNum = 121700368;BA.debugLine="If maxVisibleRow > currentMax Then";
if (__ref._maxvisiblerow /*int*/ >_currentmax) { 
RDebugUtils.currentLine=121700370;
 //BA.debugLineNum = 121700370;BA.debugLine="For I = maxVisibleRow To Max(currentMax + 1, mi";
{
final int step15 = -1;
final int limit15 = (int) (__c.Max(_currentmax+1,__ref._minvisiblerow /*int*/ ));
_i = __ref._maxvisiblerow /*int*/  ;
for (;_i >= limit15 ;_i = _i + step15 ) {
RDebugUtils.currentLine=121700371;
 //BA.debugLineNum = 121700371;BA.debugLine="HideRow(I)";
__ref._hiderow /*String*/ (null,_i);
 }
};
 }else 
{RDebugUtils.currentLine=121700373;
 //BA.debugLineNum = 121700373;BA.debugLine="Else If maxVisibleRow < currentMax Then";
if (__ref._maxvisiblerow /*int*/ <_currentmax) { 
RDebugUtils.currentLine=121700375;
 //BA.debugLineNum = 121700375;BA.debugLine="For I = currentMax To Max(maxVisibleRow + 1, cu";
{
final int step19 = -1;
final int limit19 = (int) (__c.Max(__ref._maxvisiblerow /*int*/ +1,_currentmin));
_i = _currentmax ;
for (;_i >= limit19 ;_i = _i + step19 ) {
RDebugUtils.currentLine=121700376;
 //BA.debugLineNum = 121700376;BA.debugLine="ShowRow(I)";
__ref._showrow /*String*/ (null,_i);
 }
};
 }}
;
 };
RDebugUtils.currentLine=121700380;
 //BA.debugLineNum = 121700380;BA.debugLine="minVisibleRow = currentMin";
__ref._minvisiblerow /*int*/  = _currentmin;
RDebugUtils.currentLine=121700381;
 //BA.debugLineNum = 121700381;BA.debugLine="maxVisibleRow = currentMax";
__ref._maxvisiblerow /*int*/  = _currentmax;
RDebugUtils.currentLine=121700382;
 //BA.debugLineNum = 121700382;BA.debugLine="Header.Left = -PosX";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .setLeft((int) (-_posx));
RDebugUtils.currentLine=121700383;
 //BA.debugLineNum = 121700383;BA.debugLine="End Sub";
return "";
}
public String  _cell_click(ir.parsikhesab.pakhsh.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "cell_click", false))
	 {return ((String) Debug.delegate(ba, "cell_click", null));}
ir.parsikhesab.pakhsh.table._rowcol _rc = null;
anywheresoftware.b4a.objects.LabelWrapper _l = null;
RDebugUtils.currentLine=122290176;
 //BA.debugLineNum = 122290176;BA.debugLine="private  Sub Cell_Click";
RDebugUtils.currentLine=122290177;
 //BA.debugLineNum = 122290177;BA.debugLine="Dim rc As RowCol";
_rc = new ir.parsikhesab.pakhsh.table._rowcol();
RDebugUtils.currentLine=122290178;
 //BA.debugLineNum = 122290178;BA.debugLine="Dim l As Label";
_l = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=122290179;
 //BA.debugLineNum = 122290179;BA.debugLine="l = Sender";
_l = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__c.Sender(ba)));
RDebugUtils.currentLine=122290180;
 //BA.debugLineNum = 122290180;BA.debugLine="rc = l.Tag";
_rc = (ir.parsikhesab.pakhsh.table._rowcol)(_l.getTag());
RDebugUtils.currentLine=122290181;
 //BA.debugLineNum = 122290181;BA.debugLine="SelectRow(rc.Row)";
__ref._selectrow /*String*/ (null,_rc.Row /*int*/ );
RDebugUtils.currentLine=122290182;
 //BA.debugLineNum = 122290182;BA.debugLine="If SubExists(Callback, \"Grid\" & \"_CellClick\") The";
if (__c.SubExists(ba,__ref._callback /*Object*/ ,"Grid"+"_CellClick")) { 
RDebugUtils.currentLine=122290183;
 //BA.debugLineNum = 122290183;BA.debugLine="CallSub3(Callback, \"Grid\" & \"_CellClick\", rc.Col";
__c.CallSubNew3(ba,__ref._callback /*Object*/ ,"Grid"+"_CellClick",(Object)(_rc.Col /*int*/ ),(Object)(_rc.Row /*int*/ ));
 };
RDebugUtils.currentLine=122290185;
 //BA.debugLineNum = 122290185;BA.debugLine="End Sub";
return "";
}
public String  _selectrow(ir.parsikhesab.pakhsh.table __ref,int _row) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "selectrow", false))
	 {return ((String) Debug.delegate(ba, "selectrow", new Object[] {_row}));}
int _prev = 0;
int _col = 0;
RDebugUtils.currentLine=122617856;
 //BA.debugLineNum = 122617856;BA.debugLine="Private Sub SelectRow(Row As Int)";
RDebugUtils.currentLine=122617857;
 //BA.debugLineNum = 122617857;BA.debugLine="Dim prev As Int";
_prev = 0;
RDebugUtils.currentLine=122617858;
 //BA.debugLineNum = 122617858;BA.debugLine="prev = SelectedRow";
_prev = __ref._selectedrow /*int*/ ;
RDebugUtils.currentLine=122617859;
 //BA.debugLineNum = 122617859;BA.debugLine="SelectedRow = Row";
__ref._selectedrow /*int*/  = _row;
RDebugUtils.currentLine=122617861;
 //BA.debugLineNum = 122617861;BA.debugLine="If prev > -1 Then";
if (_prev>-1) { 
RDebugUtils.currentLine=122617862;
 //BA.debugLineNum = 122617862;BA.debugLine="If visibleRows.ContainsKey(prev) Then";
if (__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_prev))) { 
RDebugUtils.currentLine=122617863;
 //BA.debugLineNum = 122617863;BA.debugLine="HideRow(prev)";
__ref._hiderow /*String*/ (null,_prev);
RDebugUtils.currentLine=122617864;
 //BA.debugLineNum = 122617864;BA.debugLine="ShowRow(prev)";
__ref._showrow /*String*/ (null,_prev);
 };
 };
RDebugUtils.currentLine=122617867;
 //BA.debugLineNum = 122617867;BA.debugLine="SelectedRow = Row";
__ref._selectedrow /*int*/  = _row;
RDebugUtils.currentLine=122617868;
 //BA.debugLineNum = 122617868;BA.debugLine="For col = 0 To NumberOfColumns - 1";
{
final int step11 = 1;
final int limit11 = (int) (__ref._numberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit11 ;_col = _col + step11 ) {
RDebugUtils.currentLine=122617869;
 //BA.debugLineNum = 122617869;BA.debugLine="If visibleRows.ContainsKey(SelectedRow) Then";
if (__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(__ref._selectedrow /*int*/ ))) { 
RDebugUtils.currentLine=122617870;
 //BA.debugLineNum = 122617870;BA.debugLine="HideRow(SelectedRow)";
__ref._hiderow /*String*/ (null,__ref._selectedrow /*int*/ );
RDebugUtils.currentLine=122617871;
 //BA.debugLineNum = 122617871;BA.debugLine="ShowRow(SelectedRow)";
__ref._showrow /*String*/ (null,__ref._selectedrow /*int*/ );
 };
 }
};
RDebugUtils.currentLine=122617874;
 //BA.debugLineNum = 122617874;BA.debugLine="End Sub";
return "";
}
public String  _cell_longclick(ir.parsikhesab.pakhsh.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "cell_longclick", false))
	 {return ((String) Debug.delegate(ba, "cell_longclick", null));}
ir.parsikhesab.pakhsh.table._rowcol _rc = null;
anywheresoftware.b4a.objects.LabelWrapper _l = null;
RDebugUtils.currentLine=122355712;
 //BA.debugLineNum = 122355712;BA.debugLine="Private Sub Cell_LongClick";
RDebugUtils.currentLine=122355713;
 //BA.debugLineNum = 122355713;BA.debugLine="Dim rc As RowCol";
_rc = new ir.parsikhesab.pakhsh.table._rowcol();
RDebugUtils.currentLine=122355714;
 //BA.debugLineNum = 122355714;BA.debugLine="Dim l As Label";
_l = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=122355715;
 //BA.debugLineNum = 122355715;BA.debugLine="l = Sender";
_l = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__c.Sender(ba)));
RDebugUtils.currentLine=122355716;
 //BA.debugLineNum = 122355716;BA.debugLine="rc = l.Tag";
_rc = (ir.parsikhesab.pakhsh.table._rowcol)(_l.getTag());
RDebugUtils.currentLine=122355717;
 //BA.debugLineNum = 122355717;BA.debugLine="SelectRow(rc.Row)";
__ref._selectrow /*String*/ (null,_rc.Row /*int*/ );
RDebugUtils.currentLine=122355718;
 //BA.debugLineNum = 122355718;BA.debugLine="If SubExists(Callback, \"Grid\" & \"_CellLongClick\")";
if (__c.SubExists(ba,__ref._callback /*Object*/ ,"Grid"+"_CellLongClick")) { 
RDebugUtils.currentLine=122355719;
 //BA.debugLineNum = 122355719;BA.debugLine="CallSub3(Callback, \"Grid\" & \"_CellLongClick\", rc";
__c.CallSubNew3(ba,__ref._callback /*Object*/ ,"Grid"+"_CellLongClick",(Object)(_rc.Col /*int*/ ),(Object)(_rc.Row /*int*/ ));
 };
RDebugUtils.currentLine=122355721;
 //BA.debugLineNum = 122355721;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(ir.parsikhesab.pakhsh.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
RDebugUtils.currentLine=121372672;
 //BA.debugLineNum = 121372672;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=121372674;
 //BA.debugLineNum = 121372674;BA.debugLine="Private StringUtils1 As StringUtils";
_stringutils1 = new anywheresoftware.b4a.objects.StringUtils();
RDebugUtils.currentLine=121372675;
 //BA.debugLineNum = 121372675;BA.debugLine="Private SV As ScrollView2D";
_sv = new flm.b4a.scrollview2d.ScrollView2DWrapper();
RDebugUtils.currentLine=121372676;
 //BA.debugLineNum = 121372676;BA.debugLine="Private Header As Panel";
_header = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=121372677;
 //BA.debugLineNum = 121372677;BA.debugLine="Private Callback As Object";
_callback = new Object();
RDebugUtils.currentLine=121372678;
 //BA.debugLineNum = 121372678;BA.debugLine="Private Event As String";
_event = "";
RDebugUtils.currentLine=121372679;
 //BA.debugLineNum = 121372679;BA.debugLine="Private SelectedRow As Int";
_selectedrow = 0;
RDebugUtils.currentLine=121372680;
 //BA.debugLineNum = 121372680;BA.debugLine="Private Data As List";
_data = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=121372681;
 //BA.debugLineNum = 121372681;BA.debugLine="Private LabelsCache As List";
_labelscache = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=121372682;
 //BA.debugLineNum = 121372682;BA.debugLine="Private minVisibleRow, maxVisibleRow As Int";
_minvisiblerow = 0;
_maxvisiblerow = 0;
RDebugUtils.currentLine=121372683;
 //BA.debugLineNum = 121372683;BA.debugLine="Private visible As Boolean";
_visible = false;
RDebugUtils.currentLine=121372684;
 //BA.debugLineNum = 121372684;BA.debugLine="Private visibleRows As Map";
_visiblerows = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=121372685;
 //BA.debugLineNum = 121372685;BA.debugLine="Private NumberOfColumns, ColumnWidth As Int";
_numberofcolumns = 0;
_columnwidth = 0;
RDebugUtils.currentLine=121372686;
 //BA.debugLineNum = 121372686;BA.debugLine="Public RowHeight, HeaderColor, TableColor, FontCo";
_rowheight = 0;
_headercolor = 0;
_tablecolor = 0;
_fontcolor = 0;
_headerfontcolor = 0;
RDebugUtils.currentLine=121372687;
 //BA.debugLineNum = 121372687;BA.debugLine="Public FontSize As Float";
_fontsize = 0f;
RDebugUtils.currentLine=121372688;
 //BA.debugLineNum = 121372688;BA.debugLine="Type RowCol (Row As Int, Col As Int)";
;
RDebugUtils.currentLine=121372689;
 //BA.debugLineNum = 121372689;BA.debugLine="Public Alignment As Int";
_alignment = 0;
RDebugUtils.currentLine=121372690;
 //BA.debugLineNum = 121372690;BA.debugLine="Public SelectedDrawable(), Drawable1(), Drawable2";
_selecteddrawable = new Object[(int) (0)];
{
int d0 = _selecteddrawable.length;
for (int i0 = 0;i0 < d0;i0++) {
_selecteddrawable[i0] = new Object();
}
}
;
_drawable1 = new Object[(int) (0)];
{
int d0 = _drawable1.length;
for (int i0 = 0;i0 < d0;i0++) {
_drawable1[i0] = new Object();
}
}
;
_drawable2 = new Object[(int) (0)];
{
int d0 = _drawable2.length;
for (int i0 = 0;i0 < d0;i0++) {
_drawable2[i0] = new Object();
}
}
;
RDebugUtils.currentLine=121372692;
 //BA.debugLineNum = 121372692;BA.debugLine="HeaderColor = Colors.RGB(83,99,255)";
__ref._headercolor /*int*/  = __c.Colors.RGB((int) (83),(int) (99),(int) (255));
RDebugUtils.currentLine=121372693;
 //BA.debugLineNum = 121372693;BA.debugLine="RowHeight = 60dip";
__ref._rowheight /*int*/  = __c.DipToCurrent((int) (60));
RDebugUtils.currentLine=121372694;
 //BA.debugLineNum = 121372694;BA.debugLine="TableColor = Colors.RGB(94,108,249)";
__ref._tablecolor /*int*/  = __c.Colors.RGB((int) (94),(int) (108),(int) (249));
RDebugUtils.currentLine=121372695;
 //BA.debugLineNum = 121372695;BA.debugLine="FontColor = Colors.Black";
__ref._fontcolor /*int*/  = __c.Colors.Black;
RDebugUtils.currentLine=121372696;
 //BA.debugLineNum = 121372696;BA.debugLine="HeaderFontColor = Colors.White";
__ref._headerfontcolor /*int*/  = __c.Colors.White;
RDebugUtils.currentLine=121372697;
 //BA.debugLineNum = 121372697;BA.debugLine="FontSize = 12";
__ref._fontsize /*float*/  = (float) (12);
RDebugUtils.currentLine=121372698;
 //BA.debugLineNum = 121372698;BA.debugLine="Alignment = Gravity.CENTER 'change to Gravity.LEF";
__ref._alignment /*int*/  = __c.Gravity.CENTER;
RDebugUtils.currentLine=121372699;
 //BA.debugLineNum = 121372699;BA.debugLine="End Sub";
return "";
}
public String  _clearall(ir.parsikhesab.pakhsh.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "clearall", false))
	 {return ((String) Debug.delegate(ba, "clearall", null));}
RDebugUtils.currentLine=121503744;
 //BA.debugLineNum = 121503744;BA.debugLine="Public Sub ClearAll";
RDebugUtils.currentLine=121503745;
 //BA.debugLineNum = 121503745;BA.debugLine="innerClearAll(NumberOfColumns)";
__ref._innerclearall /*String*/ (null,__ref._numberofcolumns /*int*/ );
RDebugUtils.currentLine=121503746;
 //BA.debugLineNum = 121503746;BA.debugLine="End Sub";
return "";
}
public String  _innerclearall(ir.parsikhesab.pakhsh.table __ref,int _vnumberofcolumns) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "innerclearall", false))
	 {return ((String) Debug.delegate(ba, "innerclearall", new Object[] {_vnumberofcolumns}));}
int _i = 0;
anywheresoftware.b4a.objects.drawable.ColorDrawable _cd1 = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _cd2 = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _cd3 = null;
RDebugUtils.currentLine=121634816;
 //BA.debugLineNum = 121634816;BA.debugLine="Private Sub innerClearAll(vNumberOfColumns As Int)";
RDebugUtils.currentLine=121634817;
 //BA.debugLineNum = 121634817;BA.debugLine="For i = SV.Panel.NumberOfViews -1 To 0 Step -1";
{
final int step1 = -1;
final int limit1 = (int) (0);
_i = (int) (__ref._sv /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().getNumberOfViews()-1) ;
for (;_i >= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=121634818;
 //BA.debugLineNum = 121634818;BA.debugLine="SV.Panel.RemoveViewAt(i)";
__ref._sv /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().RemoveViewAt(_i);
 }
};
RDebugUtils.currentLine=121634820;
 //BA.debugLineNum = 121634820;BA.debugLine="NumberOfColumns = vNumberOfColumns";
__ref._numberofcolumns /*int*/  = _vnumberofcolumns;
RDebugUtils.currentLine=121634821;
 //BA.debugLineNum = 121634821;BA.debugLine="Dim Drawable1(NumberOfColumns) As Object";
_drawable1 = new Object[__ref._numberofcolumns /*int*/ ];
{
int d0 = _drawable1.length;
for (int i0 = 0;i0 < d0;i0++) {
_drawable1[i0] = new Object();
}
}
;
RDebugUtils.currentLine=121634822;
 //BA.debugLineNum = 121634822;BA.debugLine="Dim Drawable2(NumberOfColumns) As Object";
_drawable2 = new Object[__ref._numberofcolumns /*int*/ ];
{
int d0 = _drawable2.length;
for (int i0 = 0;i0 < d0;i0++) {
_drawable2[i0] = new Object();
}
}
;
RDebugUtils.currentLine=121634823;
 //BA.debugLineNum = 121634823;BA.debugLine="Dim SelectedDrawable(NumberOfColumns) As Object";
_selecteddrawable = new Object[__ref._numberofcolumns /*int*/ ];
{
int d0 = _selecteddrawable.length;
for (int i0 = 0;i0 < d0;i0++) {
_selecteddrawable[i0] = new Object();
}
}
;
RDebugUtils.currentLine=121634824;
 //BA.debugLineNum = 121634824;BA.debugLine="For i = 0 To NumberOfColumns - 1";
{
final int step8 = 1;
final int limit8 = (int) (__ref._numberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
RDebugUtils.currentLine=121634825;
 //BA.debugLineNum = 121634825;BA.debugLine="Dim cd1, cd2, cd3 As ColorDrawable";
_cd1 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
_cd2 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
_cd3 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=121634826;
 //BA.debugLineNum = 121634826;BA.debugLine="cd1.Initialize(Colors.White, 0)";
_cd1.Initialize(__c.Colors.White,(int) (0));
RDebugUtils.currentLine=121634828;
 //BA.debugLineNum = 121634828;BA.debugLine="cd2.Initialize(0xFFE3E3E3, 0)";
_cd2.Initialize(((int)0xffe3e3e3),(int) (0));
RDebugUtils.currentLine=121634829;
 //BA.debugLineNum = 121634829;BA.debugLine="cd3.Initialize(0xFF007FFF, 0)";
_cd3.Initialize(((int)0xff007fff),(int) (0));
RDebugUtils.currentLine=121634830;
 //BA.debugLineNum = 121634830;BA.debugLine="Drawable1(i) = cd1";
__ref._drawable1 /*Object[]*/ [_i] = (Object)(_cd1.getObject());
RDebugUtils.currentLine=121634831;
 //BA.debugLineNum = 121634831;BA.debugLine="Drawable2(i) = cd2";
__ref._drawable2 /*Object[]*/ [_i] = (Object)(_cd2.getObject());
RDebugUtils.currentLine=121634832;
 //BA.debugLineNum = 121634832;BA.debugLine="SelectedDrawable(i) = cd3";
__ref._selecteddrawable /*Object[]*/ [_i] = (Object)(_cd3.getObject());
 }
};
RDebugUtils.currentLine=121634834;
 //BA.debugLineNum = 121634834;BA.debugLine="SV.Panel.Height = 0";
__ref._sv /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().setHeight((int) (0));
RDebugUtils.currentLine=121634835;
 //BA.debugLineNum = 121634835;BA.debugLine="SelectedRow = -1";
__ref._selectedrow /*int*/  = (int) (-1);
RDebugUtils.currentLine=121634836;
 //BA.debugLineNum = 121634836;BA.debugLine="minVisibleRow = -1";
__ref._minvisiblerow /*int*/  = (int) (-1);
RDebugUtils.currentLine=121634837;
 //BA.debugLineNum = 121634837;BA.debugLine="maxVisibleRow = 0";
__ref._maxvisiblerow /*int*/  = (int) (0);
RDebugUtils.currentLine=121634838;
 //BA.debugLineNum = 121634838;BA.debugLine="Data.Initialize";
__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=121634839;
 //BA.debugLineNum = 121634839;BA.debugLine="LabelsCache.Initialize";
__ref._labelscache /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=121634840;
 //BA.debugLineNum = 121634840;BA.debugLine="visibleRows.Initialize";
__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=121634841;
 //BA.debugLineNum = 121634841;BA.debugLine="SV.VerticalScrollPosition = 0";
__ref._sv /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setVerticalScrollPosition((int) (0));
RDebugUtils.currentLine=121634842;
 //BA.debugLineNum = 121634842;BA.debugLine="DoEvents";
__c.DoEvents();
RDebugUtils.currentLine=121634843;
 //BA.debugLineNum = 121634843;BA.debugLine="SV.VerticalScrollPosition = 0";
__ref._sv /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setVerticalScrollPosition((int) (0));
RDebugUtils.currentLine=121634844;
 //BA.debugLineNum = 121634844;BA.debugLine="For i = 1 To 80 'fill the cache to avoid delay on";
{
final int step27 = 1;
final int limit27 = (int) (80);
_i = (int) (1) ;
for (;_i <= limit27 ;_i = _i + step27 ) {
RDebugUtils.currentLine=121634845;
 //BA.debugLineNum = 121634845;BA.debugLine="LabelsCache.Add(CreateNewLabels)";
__ref._labelscache /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createnewlabels /*anywheresoftware.b4a.objects.LabelWrapper[]*/ (null)));
 }
};
RDebugUtils.currentLine=121634847;
 //BA.debugLineNum = 121634847;BA.debugLine="If visible Then";
if (__ref._visible /*boolean*/ ) { 
RDebugUtils.currentLine=121634848;
 //BA.debugLineNum = 121634848;BA.debugLine="SV_ScrollChanged(0, 0)";
__ref._sv_scrollchanged /*String*/ (null,(int) (0),(int) (0));
 };
RDebugUtils.currentLine=121634850;
 //BA.debugLineNum = 121634850;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.LabelWrapper[]  _createnewlabels(ir.parsikhesab.pakhsh.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "createnewlabels", false))
	 {return ((anywheresoftware.b4a.objects.LabelWrapper[]) Debug.delegate(ba, "createnewlabels", null));}
anywheresoftware.b4a.objects.LabelWrapper[] _lbls = null;
int _i = 0;
ir.parsikhesab.pakhsh.table._rowcol _rc = null;
anywheresoftware.b4a.objects.LabelWrapper _l = null;
RDebugUtils.currentLine=122159104;
 //BA.debugLineNum = 122159104;BA.debugLine="Private Sub CreateNewLabels As Label()";
RDebugUtils.currentLine=122159105;
 //BA.debugLineNum = 122159105;BA.debugLine="Dim lbls(NumberOfColumns) As Label";
_lbls = new anywheresoftware.b4a.objects.LabelWrapper[__ref._numberofcolumns /*int*/ ];
{
int d0 = _lbls.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbls[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=122159106;
 //BA.debugLineNum = 122159106;BA.debugLine="For I = 0 To NumberOfColumns - 1";
{
final int step2 = 1;
final int limit2 = (int) (__ref._numberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=122159107;
 //BA.debugLineNum = 122159107;BA.debugLine="Dim rc As RowCol";
_rc = new ir.parsikhesab.pakhsh.table._rowcol();
RDebugUtils.currentLine=122159108;
 //BA.debugLineNum = 122159108;BA.debugLine="rc.Col = I";
_rc.Col /*int*/  = _i;
RDebugUtils.currentLine=122159109;
 //BA.debugLineNum = 122159109;BA.debugLine="Dim l As Label";
_l = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=122159110;
 //BA.debugLineNum = 122159110;BA.debugLine="l.Initialize(\"cell\")";
_l.Initialize(ba,"cell");
RDebugUtils.currentLine=122159111;
 //BA.debugLineNum = 122159111;BA.debugLine="l.Gravity = Alignment";
_l.setGravity(__ref._alignment /*int*/ );
RDebugUtils.currentLine=122159112;
 //BA.debugLineNum = 122159112;BA.debugLine="l.TextSize = FontSize";
_l.setTextSize(__ref._fontsize /*float*/ );
RDebugUtils.currentLine=122159113;
 //BA.debugLineNum = 122159113;BA.debugLine="l.TextColor = FontColor";
_l.setTextColor(__ref._fontcolor /*int*/ );
RDebugUtils.currentLine=122159114;
 //BA.debugLineNum = 122159114;BA.debugLine="l.Typeface=Typeface.LoadFromAssets(\"iransansmono";
_l.setTypeface(__c.Typeface.LoadFromAssets("iransansmonospacednum_bold.ttf"));
RDebugUtils.currentLine=122159115;
 //BA.debugLineNum = 122159115;BA.debugLine="l.Tag = rc";
_l.setTag((Object)(_rc));
RDebugUtils.currentLine=122159116;
 //BA.debugLineNum = 122159116;BA.debugLine="lbls(I) = l";
_lbls[_i] = _l;
 }
};
RDebugUtils.currentLine=122159118;
 //BA.debugLineNum = 122159118;BA.debugLine="Return lbls";
if (true) return _lbls;
RDebugUtils.currentLine=122159119;
 //BA.debugLineNum = 122159119;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.LabelWrapper[]  _getlabels(ir.parsikhesab.pakhsh.table __ref,int _row) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getlabels", false))
	 {return ((anywheresoftware.b4a.objects.LabelWrapper[]) Debug.delegate(ba, "getlabels", new Object[] {_row}));}
anywheresoftware.b4a.objects.LabelWrapper[] _lbls = null;
int _i = 0;
ir.parsikhesab.pakhsh.table._rowcol _rc = null;
RDebugUtils.currentLine=122093568;
 //BA.debugLineNum = 122093568;BA.debugLine="Private Sub GetLabels(Row As Int) As Label()";
RDebugUtils.currentLine=122093569;
 //BA.debugLineNum = 122093569;BA.debugLine="Dim lbls() As Label";
_lbls = new anywheresoftware.b4a.objects.LabelWrapper[(int) (0)];
{
int d0 = _lbls.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbls[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=122093570;
 //BA.debugLineNum = 122093570;BA.debugLine="If LabelsCache.Size > 0 Then";
if (__ref._labelscache /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=122093572;
 //BA.debugLineNum = 122093572;BA.debugLine="lbls = LabelsCache.Get(LabelsCache.Size - 1)";
_lbls = (anywheresoftware.b4a.objects.LabelWrapper[])(__ref._labelscache /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (__ref._labelscache /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1)));
RDebugUtils.currentLine=122093573;
 //BA.debugLineNum = 122093573;BA.debugLine="LabelsCache.RemoveAt(LabelsCache.Size - 1)";
__ref._labelscache /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (__ref._labelscache /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1));
 }else {
RDebugUtils.currentLine=122093575;
 //BA.debugLineNum = 122093575;BA.debugLine="lbls = CreateNewLabels";
_lbls = __ref._createnewlabels /*anywheresoftware.b4a.objects.LabelWrapper[]*/ (null);
 };
RDebugUtils.currentLine=122093577;
 //BA.debugLineNum = 122093577;BA.debugLine="For I = 0 To lbls.Length - 1";
{
final int step8 = 1;
final int limit8 = (int) (_lbls.length-1);
_i = (int) (0) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
RDebugUtils.currentLine=122093578;
 //BA.debugLineNum = 122093578;BA.debugLine="Dim rc As RowCol";
_rc = new ir.parsikhesab.pakhsh.table._rowcol();
RDebugUtils.currentLine=122093579;
 //BA.debugLineNum = 122093579;BA.debugLine="rc = lbls(I).Tag";
_rc = (ir.parsikhesab.pakhsh.table._rowcol)(_lbls[_i].getTag());
RDebugUtils.currentLine=122093580;
 //BA.debugLineNum = 122093580;BA.debugLine="rc.Row = Row";
_rc.Row /*int*/  = _row;
 }
};
RDebugUtils.currentLine=122093582;
 //BA.debugLineNum = 122093582;BA.debugLine="Return lbls";
if (true) return _lbls;
RDebugUtils.currentLine=122093583;
 //BA.debugLineNum = 122093583;BA.debugLine="End Sub";
return null;
}
public String  _getvalue(ir.parsikhesab.pakhsh.table __ref,int _col,int _row) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getvalue", false))
	 {return ((String) Debug.delegate(ba, "getvalue", new Object[] {_col,_row}));}
String[] _values = null;
RDebugUtils.currentLine=122486784;
 //BA.debugLineNum = 122486784;BA.debugLine="Public Sub GetValue(Col As Int, Row As Int)";
RDebugUtils.currentLine=122486785;
 //BA.debugLineNum = 122486785;BA.debugLine="Dim values() As String";
_values = new String[(int) (0)];
java.util.Arrays.fill(_values,"");
RDebugUtils.currentLine=122486786;
 //BA.debugLineNum = 122486786;BA.debugLine="values = Data.Get(Row)";
_values = (String[])(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Get(_row));
RDebugUtils.currentLine=122486787;
 //BA.debugLineNum = 122486787;BA.debugLine="Return values(Col)";
if (true) return _values[_col];
RDebugUtils.currentLine=122486788;
 //BA.debugLineNum = 122486788;BA.debugLine="End Sub";
return "";
}
public String  _header_click(ir.parsikhesab.pakhsh.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "header_click", false))
	 {return ((String) Debug.delegate(ba, "header_click", null));}
anywheresoftware.b4a.objects.LabelWrapper _l = null;
int _col = 0;
RDebugUtils.currentLine=122421248;
 //BA.debugLineNum = 122421248;BA.debugLine="Private Sub Header_Click";
RDebugUtils.currentLine=122421249;
 //BA.debugLineNum = 122421249;BA.debugLine="Dim l As Label";
_l = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=122421250;
 //BA.debugLineNum = 122421250;BA.debugLine="Dim col As Int";
_col = 0;
RDebugUtils.currentLine=122421251;
 //BA.debugLineNum = 122421251;BA.debugLine="l = Sender";
_l = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__c.Sender(ba)));
RDebugUtils.currentLine=122421252;
 //BA.debugLineNum = 122421252;BA.debugLine="col = l.Tag";
_col = (int)(BA.ObjectToNumber(_l.getTag()));
RDebugUtils.currentLine=122421253;
 //BA.debugLineNum = 122421253;BA.debugLine="If SubExists(Callback, Event & \"_HeaderClick\") Th";
if (__c.SubExists(ba,__ref._callback /*Object*/ ,__ref._event /*String*/ +"_HeaderClick")) { 
RDebugUtils.currentLine=122421254;
 //BA.debugLineNum = 122421254;BA.debugLine="CallSub2(Callback, Event & \"_HeaderClick\", col)";
__c.CallSubNew2(ba,__ref._callback /*Object*/ ,__ref._event /*String*/ +"_HeaderClick",(Object)(_col));
 };
RDebugUtils.currentLine=122421256;
 //BA.debugLineNum = 122421256;BA.debugLine="End Sub";
return "";
}
public String  _hiderow(ir.parsikhesab.pakhsh.table __ref,int _row) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "hiderow", false))
	 {return ((String) Debug.delegate(ba, "hiderow", new Object[] {_row}));}
anywheresoftware.b4a.objects.LabelWrapper[] _lbls = null;
int _i = 0;
RDebugUtils.currentLine=122028032;
 //BA.debugLineNum = 122028032;BA.debugLine="Private Sub HideRow (Row As Int)";
RDebugUtils.currentLine=122028034;
 //BA.debugLineNum = 122028034;BA.debugLine="Dim lbls() As Label";
_lbls = new anywheresoftware.b4a.objects.LabelWrapper[(int) (0)];
{
int d0 = _lbls.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbls[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=122028035;
 //BA.debugLineNum = 122028035;BA.debugLine="lbls = visibleRows.Get(Row)";
_lbls = (anywheresoftware.b4a.objects.LabelWrapper[])(__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_row)));
RDebugUtils.currentLine=122028036;
 //BA.debugLineNum = 122028036;BA.debugLine="If lbls = Null Then";
if (_lbls== null) { 
RDebugUtils.currentLine=122028037;
 //BA.debugLineNum = 122028037;BA.debugLine="Log(\"HideRow: (null) \" & Row)";
__c.LogImpl("5122028037","HideRow: (null) "+BA.NumberToString(_row),0);
RDebugUtils.currentLine=122028038;
 //BA.debugLineNum = 122028038;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=122028040;
 //BA.debugLineNum = 122028040;BA.debugLine="For I = 0 To lbls.Length - 1";
{
final int step7 = 1;
final int limit7 = (int) (_lbls.length-1);
_i = (int) (0) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
RDebugUtils.currentLine=122028041;
 //BA.debugLineNum = 122028041;BA.debugLine="lbls(I).RemoveView";
_lbls[_i].RemoveView();
 }
};
RDebugUtils.currentLine=122028043;
 //BA.debugLineNum = 122028043;BA.debugLine="visibleRows.Remove(Row)";
__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .Remove((Object)(_row));
RDebugUtils.currentLine=122028044;
 //BA.debugLineNum = 122028044;BA.debugLine="LabelsCache.Add(lbls)";
__ref._labelscache /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_lbls));
RDebugUtils.currentLine=122028045;
 //BA.debugLineNum = 122028045;BA.debugLine="End Sub";
return "";
}
public boolean  _isrowvisible(ir.parsikhesab.pakhsh.table __ref,int _row) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "isrowvisible", false))
	 {return ((Boolean) Debug.delegate(ba, "isrowvisible", new Object[] {_row}));}
RDebugUtils.currentLine=121962496;
 //BA.debugLineNum = 121962496;BA.debugLine="Private Sub IsRowVisible(Row As Int) As Boolean";
RDebugUtils.currentLine=121962497;
 //BA.debugLineNum = 121962497;BA.debugLine="Return Row < (SV.VerticalScrollPosition + SV.Heig";
if (true) return _row<(__ref._sv /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getVerticalScrollPosition()+__ref._sv /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight())/(double)(__ref._rowheight /*int*/ +1) && _row>__ref._sv /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getVerticalScrollPosition()/(double)__ref._rowheight /*int*/ ;
RDebugUtils.currentLine=121962499;
 //BA.debugLineNum = 121962499;BA.debugLine="End Sub";
return false;
}
public String  _jumptorow(ir.parsikhesab.pakhsh.table __ref,int _row) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "jumptorow", false))
	 {return ((String) Debug.delegate(ba, "jumptorow", new Object[] {_row}));}
RDebugUtils.currentLine=122683392;
 //BA.debugLineNum = 122683392;BA.debugLine="Public Sub JumpToRow(Row As Int)";
RDebugUtils.currentLine=122683393;
 //BA.debugLineNum = 122683393;BA.debugLine="SV.VerticalScrollPosition = Row * RowHeight";
__ref._sv /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setVerticalScrollPosition((int) (_row*__ref._rowheight /*int*/ ));
RDebugUtils.currentLine=122683394;
 //BA.debugLineNum = 122683394;BA.debugLine="End Sub";
return "";
}
public String  _loadsqlitedb(ir.parsikhesab.pakhsh.table __ref,String _dir,String _filename,anywheresoftware.b4a.sql.SQL _sqlite,String _query) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "loadsqlitedb", false))
	 {return ((String) Debug.delegate(ba, "loadsqlitedb", new Object[] {_dir,_filename,_sqlite,_query}));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _curs = null;
String[] _headers = null;
int[] _widths = null;
int _col = 0;
int _row = 0;
String[] _r = null;
RDebugUtils.currentLine=122748928;
 //BA.debugLineNum = 122748928;BA.debugLine="Public Sub LoadSQLiteDB(Dir As String, Filename As";
RDebugUtils.currentLine=122748929;
 //BA.debugLineNum = 122748929;BA.debugLine="If File.Exists(Dir, Filename) = False Then";
if (__c.File.Exists(_dir,_filename)==__c.False) { 
RDebugUtils.currentLine=122748930;
 //BA.debugLineNum = 122748930;BA.debugLine="ToastMessageShow(\"This file : \" & Filename & \" d";
__c.ToastMessageShow(BA.ObjectToCharSequence("This file : "+_filename+" doesn't exist"),__c.False);
RDebugUtils.currentLine=122748931;
 //BA.debugLineNum = 122748931;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=122748934;
 //BA.debugLineNum = 122748934;BA.debugLine="Dim Curs As Cursor";
_curs = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=122748935;
 //BA.debugLineNum = 122748935;BA.debugLine="Curs = SQLite.ExecQuery(Query)";
_curs = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_sqlite.ExecQuery(_query)));
RDebugUtils.currentLine=122748937;
 //BA.debugLineNum = 122748937;BA.debugLine="NumberOfColumns = Curs.ColumnCount";
__ref._numberofcolumns /*int*/  = _curs.getColumnCount();
RDebugUtils.currentLine=122748938;
 //BA.debugLineNum = 122748938;BA.debugLine="innerClearAll(NumberOfColumns)";
__ref._innerclearall /*String*/ (null,__ref._numberofcolumns /*int*/ );
RDebugUtils.currentLine=122748940;
 //BA.debugLineNum = 122748940;BA.debugLine="Dim headers(NumberOfColumns) As String";
_headers = new String[__ref._numberofcolumns /*int*/ ];
java.util.Arrays.fill(_headers,"");
RDebugUtils.currentLine=122748941;
 //BA.debugLineNum = 122748941;BA.debugLine="Dim Widths(NumberOfColumns) As Int";
_widths = new int[__ref._numberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=122748942;
 //BA.debugLineNum = 122748942;BA.debugLine="Dim col, row As Int";
_col = 0;
_row = 0;
RDebugUtils.currentLine=122748943;
 //BA.debugLineNum = 122748943;BA.debugLine="For col = 0 To NumberOfColumns - 1";
{
final int step12 = 1;
final int limit12 = (int) (__ref._numberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit12 ;_col = _col + step12 ) {
RDebugUtils.currentLine=122748944;
 //BA.debugLineNum = 122748944;BA.debugLine="headers(col) = Curs.GetColumnName(col)";
_headers[_col] = _curs.GetColumnName(_col);
RDebugUtils.currentLine=122748945;
 //BA.debugLineNum = 122748945;BA.debugLine="Widths(col) = 162dip";
_widths[_col] = __c.DipToCurrent((int) (162));
 }
};
RDebugUtils.currentLine=122748947;
 //BA.debugLineNum = 122748947;BA.debugLine="SetHeader(headers,Widths)";
__ref._setheader /*String*/ (null,_headers,_widths);
RDebugUtils.currentLine=122748948;
 //BA.debugLineNum = 122748948;BA.debugLine="SetColumnsWidths(Widths)";
__ref._setcolumnswidths /*String*/ (null,_widths);
RDebugUtils.currentLine=122748950;
 //BA.debugLineNum = 122748950;BA.debugLine="For row = 0 To Curs.RowCount - 1";
{
final int step18 = 1;
final int limit18 = (int) (_curs.getRowCount()-1);
_row = (int) (0) ;
for (;_row <= limit18 ;_row = _row + step18 ) {
RDebugUtils.currentLine=122748951;
 //BA.debugLineNum = 122748951;BA.debugLine="Dim r(NumberOfColumns) As String";
_r = new String[__ref._numberofcolumns /*int*/ ];
java.util.Arrays.fill(_r,"");
RDebugUtils.currentLine=122748952;
 //BA.debugLineNum = 122748952;BA.debugLine="For col = 0 To NumberOfColumns - 1";
{
final int step20 = 1;
final int limit20 = (int) (__ref._numberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit20 ;_col = _col + step20 ) {
RDebugUtils.currentLine=122748953;
 //BA.debugLineNum = 122748953;BA.debugLine="Curs.Position = row";
_curs.setPosition(_row);
RDebugUtils.currentLine=122748954;
 //BA.debugLineNum = 122748954;BA.debugLine="r(col) = Curs.GetString2(col)";
_r[_col] = _curs.GetString2(_col);
 }
};
RDebugUtils.currentLine=122748956;
 //BA.debugLineNum = 122748956;BA.debugLine="AddRow(r)";
__ref._addrow /*String*/ (null,_r);
 }
};
RDebugUtils.currentLine=122748959;
 //BA.debugLineNum = 122748959;BA.debugLine="Curs.Close";
_curs.Close();
RDebugUtils.currentLine=122748960;
 //BA.debugLineNum = 122748960;BA.debugLine="End Sub";
return "";
}
public String  _savetabletocsv(ir.parsikhesab.pakhsh.table __ref,String _dir,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "savetabletocsv", false))
	 {return ((String) Debug.delegate(ba, "savetabletocsv", new Object[] {_dir,_filename}));}
String[] _headers = null;
int _i = 0;
anywheresoftware.b4a.objects.LabelWrapper _l = null;
RDebugUtils.currentLine=123273216;
 //BA.debugLineNum = 123273216;BA.debugLine="Public Sub SaveTableToCSV(Dir As String, Filename";
RDebugUtils.currentLine=123273217;
 //BA.debugLineNum = 123273217;BA.debugLine="Dim headers(NumberOfColumns) As String";
_headers = new String[__ref._numberofcolumns /*int*/ ];
java.util.Arrays.fill(_headers,"");
RDebugUtils.currentLine=123273218;
 //BA.debugLineNum = 123273218;BA.debugLine="For i = 0 To headers.Length - 1";
{
final int step2 = 1;
final int limit2 = (int) (_headers.length-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=123273219;
 //BA.debugLineNum = 123273219;BA.debugLine="Dim l As Label";
_l = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=123273220;
 //BA.debugLineNum = 123273220;BA.debugLine="l = Header.GetView(i)";
_l = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_i).getObject()));
RDebugUtils.currentLine=123273221;
 //BA.debugLineNum = 123273221;BA.debugLine="headers(i) = l.Text";
_headers[_i] = _l.getText();
 }
};
RDebugUtils.currentLine=123273223;
 //BA.debugLineNum = 123273223;BA.debugLine="StringUtils1.SaveCSV2(Dir, Filename, \",\", Data, h";
__ref._stringutils1 /*anywheresoftware.b4a.objects.StringUtils*/ .SaveCSV2(_dir,_filename,BA.ObjectToChar(","),__ref._data /*anywheresoftware.b4a.objects.collections.List*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(_headers));
RDebugUtils.currentLine=123273224;
 //BA.debugLineNum = 123273224;BA.debugLine="End Sub";
return "";
}
public String  _setvalue(ir.parsikhesab.pakhsh.table __ref,int _col,int _row,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setvalue", false))
	 {return ((String) Debug.delegate(ba, "setvalue", new Object[] {_col,_row,_value}));}
String[] _values = null;
anywheresoftware.b4a.objects.LabelWrapper[] _lbls = null;
RDebugUtils.currentLine=122552320;
 //BA.debugLineNum = 122552320;BA.debugLine="Public Sub SetValue(Col As Int, Row As Int, Value";
RDebugUtils.currentLine=122552321;
 //BA.debugLineNum = 122552321;BA.debugLine="Dim values() As String";
_values = new String[(int) (0)];
java.util.Arrays.fill(_values,"");
RDebugUtils.currentLine=122552322;
 //BA.debugLineNum = 122552322;BA.debugLine="values = Data.Get(Row)";
_values = (String[])(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Get(_row));
RDebugUtils.currentLine=122552323;
 //BA.debugLineNum = 122552323;BA.debugLine="values(Col) = Value";
_values[_col] = _value;
RDebugUtils.currentLine=122552324;
 //BA.debugLineNum = 122552324;BA.debugLine="If visibleRows.ContainsKey(Row) Then";
if (__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_row))) { 
RDebugUtils.currentLine=122552325;
 //BA.debugLineNum = 122552325;BA.debugLine="Dim lbls() As Label";
_lbls = new anywheresoftware.b4a.objects.LabelWrapper[(int) (0)];
{
int d0 = _lbls.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbls[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=122552326;
 //BA.debugLineNum = 122552326;BA.debugLine="lbls = visibleRows.Get(Row)";
_lbls = (anywheresoftware.b4a.objects.LabelWrapper[])(__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_row)));
RDebugUtils.currentLine=122552327;
 //BA.debugLineNum = 122552327;BA.debugLine="lbls(Col).Text = Value";
_lbls[_col].setText(BA.ObjectToCharSequence(_value));
 };
RDebugUtils.currentLine=122552329;
 //BA.debugLineNum = 122552329;BA.debugLine="End Sub";
return "";
}
}