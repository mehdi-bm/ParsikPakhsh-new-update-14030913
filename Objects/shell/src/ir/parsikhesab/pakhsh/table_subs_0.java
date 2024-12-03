package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class table_subs_0 {


public static RemoteObject  _addrow(RemoteObject __ref,RemoteObject _values) throws Exception{
try {
		Debug.PushSubsStack("AddRow (table) ","table",102,__ref.getField(false, "ba"),__ref,161);
if (RapidSub.canDelegate("addrow")) { return __ref.runUserSub(false, "table","addrow", __ref, _values);}
RemoteObject _lastrow = RemoteObject.createImmutable(0);
Debug.locals.put("Values", _values);
 BA.debugLineNum = 161;BA.debugLine="Public Sub AddRow(Values() As String)";
Debug.ShouldStop(1);
 BA.debugLineNum = 162;BA.debugLine="If Values.Length <> NumberOfColumns Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("!",_values.getField(true,"length"),BA.numberCast(double.class, __ref.getField(true,"_numberofcolumns" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 163;BA.debugLine="Log(\"Wrong number of values.\")";
Debug.ShouldStop(4);
table.__c.runVoidMethod ("LogImpl","5121831426",RemoteObject.createImmutable("Wrong number of values."),0);
 BA.debugLineNum = 164;BA.debugLine="Return";
Debug.ShouldStop(8);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 166;BA.debugLine="Data.Add(Values)";
Debug.ShouldStop(32);
__ref.getField(false,"_data" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_values)));
 BA.debugLineNum = 167;BA.debugLine="Dim lastRow As Int";
Debug.ShouldStop(64);
_lastrow = RemoteObject.createImmutable(0);Debug.locals.put("lastRow", _lastrow);
 BA.debugLineNum = 168;BA.debugLine="lastRow = Data.Size - 1";
Debug.ShouldStop(128);
_lastrow = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("lastRow", _lastrow);
 BA.debugLineNum = 169;BA.debugLine="If lastRow < (SV.VerticalScrollPosition + SV.Heig";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("<",_lastrow,RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"getVerticalScrollPosition"),__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "+",1, 1)),__ref.getField(true,"_rowheight" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "/+",1, 0))) { 
 BA.debugLineNum = 170;BA.debugLine="ShowRow(lastRow)";
Debug.ShouldStop(512);
__ref.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_showrow" /*RemoteObject*/ ,(Object)(_lastrow));
 };
 BA.debugLineNum = 172;BA.debugLine="SV.Panel.Height = Data.Size * RowHeight";
Debug.ShouldStop(2048);
__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(false,"getPanel").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(true,"getSize"),__ref.getField(true,"_rowheight" /*RemoteObject*/ )}, "*",0, 1));
 BA.debugLineNum = 173;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addtoactivity(RemoteObject __ref,RemoteObject _act,RemoteObject _left,RemoteObject _top,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("AddToActivity (table) ","table",102,__ref.getField(false, "ba"),__ref,138);
if (RapidSub.canDelegate("addtoactivity")) { return __ref.runUserSub(false, "table","addtoactivity", __ref, _act, _left, _top, _width, _height);}
Debug.locals.put("Act", _act);
Debug.locals.put("Left", _left);
Debug.locals.put("Top", _top);
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 138;BA.debugLine="Public Sub AddToActivity(Act As Activity, Left As";
Debug.ShouldStop(512);
 BA.debugLineNum = 139;BA.debugLine="visible = True";
Debug.ShouldStop(1024);
__ref.setField ("_visible" /*RemoteObject*/ ,table.__c.getField(true,"True"));
 BA.debugLineNum = 140;BA.debugLine="Header.Initialize(\"\")";
Debug.ShouldStop(2048);
__ref.getField(false,"_header" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 143;BA.debugLine="Header.Color = TableColor";
Debug.ShouldStop(16384);
__ref.getField(false,"_header" /*RemoteObject*/ ).runVoidMethod ("setColor",__ref.getField(true,"_tablecolor" /*RemoteObject*/ ));
 BA.debugLineNum = 144;BA.debugLine="Act.AddView(Header, Left, Top , Width, RowHeight)";
Debug.ShouldStop(32768);
_act.runVoidMethod ("AddView",(Object)((__ref.getField(false,"_header" /*RemoteObject*/ ).getObject())),(Object)(_left),(Object)(_top),(Object)(_width),(Object)(__ref.getField(true,"_rowheight" /*RemoteObject*/ )));
 BA.debugLineNum = 145;BA.debugLine="Act.AddView(SV, Left, Top + RowHeight, Width, Hei";
Debug.ShouldStop(65536);
_act.runVoidMethod ("AddView",(Object)((__ref.getField(false,"_sv" /*RemoteObject*/ ).getObject())),(Object)(_left),(Object)(RemoteObject.solve(new RemoteObject[] {_top,__ref.getField(true,"_rowheight" /*RemoteObject*/ )}, "+",1, 1)),(Object)(_width),(Object)(RemoteObject.solve(new RemoteObject[] {_height,__ref.getField(true,"_rowheight" /*RemoteObject*/ )}, "-",1, 1)));
 BA.debugLineNum = 146;BA.debugLine="ColumnWidth = SV.Width / NumberOfColumns";
Debug.ShouldStop(131072);
__ref.setField ("_columnwidth" /*RemoteObject*/ ,BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(true,"_numberofcolumns" /*RemoteObject*/ )}, "/",0, 0)));
 BA.debugLineNum = 148;BA.debugLine="SV_ScrollChanged(0, 0)";
Debug.ShouldStop(524288);
__ref.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_sv_scrollchanged" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 150;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cell_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Cell_Click (table) ","table",102,__ref.getField(false, "ba"),__ref,276);
if (RapidSub.canDelegate("cell_click")) { return __ref.runUserSub(false, "table","cell_click", __ref);}
RemoteObject _rc = RemoteObject.declareNull("ir.parsikhesab.pakhsh.table._rowcol");
RemoteObject _l = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
 BA.debugLineNum = 276;BA.debugLine="private  Sub Cell_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 277;BA.debugLine="Dim rc As RowCol";
Debug.ShouldStop(1048576);
_rc = RemoteObject.createNew ("ir.parsikhesab.pakhsh.table._rowcol");Debug.locals.put("rc", _rc);
 BA.debugLineNum = 278;BA.debugLine="Dim l As Label";
Debug.ShouldStop(2097152);
_l = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("l", _l);
 BA.debugLineNum = 279;BA.debugLine="l = Sender";
Debug.ShouldStop(4194304);
_l = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), table.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("l", _l);
 BA.debugLineNum = 280;BA.debugLine="rc = l.Tag";
Debug.ShouldStop(8388608);
_rc = (_l.runMethod(false,"getTag"));Debug.locals.put("rc", _rc);
 BA.debugLineNum = 281;BA.debugLine="SelectRow(rc.Row)";
Debug.ShouldStop(16777216);
__ref.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_selectrow" /*RemoteObject*/ ,(Object)(_rc.getField(true,"Row" /*RemoteObject*/ )));
 BA.debugLineNum = 282;BA.debugLine="If SubExists(Callback, \"Grid\" & \"_CellClick\") The";
Debug.ShouldStop(33554432);
if (table.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_callback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Grid"),RemoteObject.createImmutable("_CellClick")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 283;BA.debugLine="CallSub3(Callback, \"Grid\" & \"_CellClick\", rc.Col";
Debug.ShouldStop(67108864);
table.__c.runMethodAndSync(false,"CallSubNew3",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_callback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Grid"),RemoteObject.createImmutable("_CellClick"))),(Object)((_rc.getField(true,"Col" /*RemoteObject*/ ))),(Object)((_rc.getField(true,"Row" /*RemoteObject*/ ))));
 };
 BA.debugLineNum = 285;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cell_longclick(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Cell_LongClick (table) ","table",102,__ref.getField(false, "ba"),__ref,287);
if (RapidSub.canDelegate("cell_longclick")) { return __ref.runUserSub(false, "table","cell_longclick", __ref);}
RemoteObject _rc = RemoteObject.declareNull("ir.parsikhesab.pakhsh.table._rowcol");
RemoteObject _l = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
 BA.debugLineNum = 287;BA.debugLine="Private Sub Cell_LongClick";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 288;BA.debugLine="Dim rc As RowCol";
Debug.ShouldStop(-2147483648);
_rc = RemoteObject.createNew ("ir.parsikhesab.pakhsh.table._rowcol");Debug.locals.put("rc", _rc);
 BA.debugLineNum = 289;BA.debugLine="Dim l As Label";
Debug.ShouldStop(1);
_l = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("l", _l);
 BA.debugLineNum = 290;BA.debugLine="l = Sender";
Debug.ShouldStop(2);
_l = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), table.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("l", _l);
 BA.debugLineNum = 291;BA.debugLine="rc = l.Tag";
Debug.ShouldStop(4);
_rc = (_l.runMethod(false,"getTag"));Debug.locals.put("rc", _rc);
 BA.debugLineNum = 292;BA.debugLine="SelectRow(rc.Row)";
Debug.ShouldStop(8);
__ref.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_selectrow" /*RemoteObject*/ ,(Object)(_rc.getField(true,"Row" /*RemoteObject*/ )));
 BA.debugLineNum = 293;BA.debugLine="If SubExists(Callback, \"Grid\" & \"_CellLongClick\")";
Debug.ShouldStop(16);
if (table.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_callback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Grid"),RemoteObject.createImmutable("_CellLongClick")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 294;BA.debugLine="CallSub3(Callback, \"Grid\" & \"_CellLongClick\", rc";
Debug.ShouldStop(32);
table.__c.runMethodAndSync(false,"CallSubNew3",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_callback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Grid"),RemoteObject.createImmutable("_CellLongClick"))),(Object)((_rc.getField(true,"Col" /*RemoteObject*/ ))),(Object)((_rc.getField(true,"Row" /*RemoteObject*/ ))));
 };
 BA.debugLineNum = 296;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 5;BA.debugLine="Private StringUtils1 As StringUtils";
table._stringutils1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.StringUtils");__ref.setField("_stringutils1",table._stringutils1);
 //BA.debugLineNum = 6;BA.debugLine="Private SV As ScrollView2D";
table._sv = RemoteObject.createNew ("flm.b4a.scrollview2d.ScrollView2DWrapper");__ref.setField("_sv",table._sv);
 //BA.debugLineNum = 7;BA.debugLine="Private Header As Panel";
table._header = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_header",table._header);
 //BA.debugLineNum = 8;BA.debugLine="Private Callback As Object";
table._callback = RemoteObject.createNew ("Object");__ref.setField("_callback",table._callback);
 //BA.debugLineNum = 9;BA.debugLine="Private Event As String";
table._event = RemoteObject.createImmutable("");__ref.setField("_event",table._event);
 //BA.debugLineNum = 10;BA.debugLine="Private SelectedRow As Int";
table._selectedrow = RemoteObject.createImmutable(0);__ref.setField("_selectedrow",table._selectedrow);
 //BA.debugLineNum = 11;BA.debugLine="Private Data As List";
table._data = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_data",table._data);
 //BA.debugLineNum = 12;BA.debugLine="Private LabelsCache As List";
table._labelscache = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_labelscache",table._labelscache);
 //BA.debugLineNum = 13;BA.debugLine="Private minVisibleRow, maxVisibleRow As Int";
table._minvisiblerow = RemoteObject.createImmutable(0);__ref.setField("_minvisiblerow",table._minvisiblerow);
table._maxvisiblerow = RemoteObject.createImmutable(0);__ref.setField("_maxvisiblerow",table._maxvisiblerow);
 //BA.debugLineNum = 14;BA.debugLine="Private visible As Boolean";
table._visible = RemoteObject.createImmutable(false);__ref.setField("_visible",table._visible);
 //BA.debugLineNum = 15;BA.debugLine="Private visibleRows As Map";
table._visiblerows = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_visiblerows",table._visiblerows);
 //BA.debugLineNum = 16;BA.debugLine="Private NumberOfColumns, ColumnWidth As Int";
table._numberofcolumns = RemoteObject.createImmutable(0);__ref.setField("_numberofcolumns",table._numberofcolumns);
table._columnwidth = RemoteObject.createImmutable(0);__ref.setField("_columnwidth",table._columnwidth);
 //BA.debugLineNum = 17;BA.debugLine="Public RowHeight, HeaderColor, TableColor, FontCo";
table._rowheight = RemoteObject.createImmutable(0);__ref.setField("_rowheight",table._rowheight);
table._headercolor = RemoteObject.createImmutable(0);__ref.setField("_headercolor",table._headercolor);
table._tablecolor = RemoteObject.createImmutable(0);__ref.setField("_tablecolor",table._tablecolor);
table._fontcolor = RemoteObject.createImmutable(0);__ref.setField("_fontcolor",table._fontcolor);
table._headerfontcolor = RemoteObject.createImmutable(0);__ref.setField("_headerfontcolor",table._headerfontcolor);
 //BA.debugLineNum = 18;BA.debugLine="Public FontSize As Float";
table._fontsize = RemoteObject.createImmutable(0f);__ref.setField("_fontsize",table._fontsize);
 //BA.debugLineNum = 19;BA.debugLine="Type RowCol (Row As Int, Col As Int)";
;
 //BA.debugLineNum = 20;BA.debugLine="Public Alignment As Int";
table._alignment = RemoteObject.createImmutable(0);__ref.setField("_alignment",table._alignment);
 //BA.debugLineNum = 21;BA.debugLine="Public SelectedDrawable(), Drawable1(), Drawable2";
table._selecteddrawable = RemoteObject.createNewArray ("Object", new int[] {0}, new Object[]{});__ref.setField("_selecteddrawable",table._selecteddrawable);
table._drawable1 = RemoteObject.createNewArray ("Object", new int[] {0}, new Object[]{});__ref.setField("_drawable1",table._drawable1);
table._drawable2 = RemoteObject.createNewArray ("Object", new int[] {0}, new Object[]{});__ref.setField("_drawable2",table._drawable2);
 //BA.debugLineNum = 23;BA.debugLine="HeaderColor = Colors.RGB(83,99,255)";
__ref.setField ("_headercolor" /*RemoteObject*/ ,table.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 83)),(Object)(BA.numberCast(int.class, 99)),(Object)(BA.numberCast(int.class, 255))));
 //BA.debugLineNum = 24;BA.debugLine="RowHeight = 60dip";
__ref.setField ("_rowheight" /*RemoteObject*/ ,table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60))));
 //BA.debugLineNum = 25;BA.debugLine="TableColor = Colors.RGB(94,108,249)";
__ref.setField ("_tablecolor" /*RemoteObject*/ ,table.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 94)),(Object)(BA.numberCast(int.class, 108)),(Object)(BA.numberCast(int.class, 249))));
 //BA.debugLineNum = 26;BA.debugLine="FontColor = Colors.Black";
__ref.setField ("_fontcolor" /*RemoteObject*/ ,table.__c.getField(false,"Colors").getField(true,"Black"));
 //BA.debugLineNum = 27;BA.debugLine="HeaderFontColor = Colors.White";
__ref.setField ("_headerfontcolor" /*RemoteObject*/ ,table.__c.getField(false,"Colors").getField(true,"White"));
 //BA.debugLineNum = 28;BA.debugLine="FontSize = 12";
__ref.setField ("_fontsize" /*RemoteObject*/ ,BA.numberCast(float.class, 12));
 //BA.debugLineNum = 29;BA.debugLine="Alignment = Gravity.CENTER 'change to Gravity.LEF";
__ref.setField ("_alignment" /*RemoteObject*/ ,table.__c.getField(false,"Gravity").getField(true,"CENTER"));
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _clearall(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ClearAll (table) ","table",102,__ref.getField(false, "ba"),__ref,41);
if (RapidSub.canDelegate("clearall")) { return __ref.runUserSub(false, "table","clearall", __ref);}
 BA.debugLineNum = 41;BA.debugLine="Public Sub ClearAll";
Debug.ShouldStop(256);
 BA.debugLineNum = 42;BA.debugLine="innerClearAll(NumberOfColumns)";
Debug.ShouldStop(512);
__ref.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_innerclearall" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_numberofcolumns" /*RemoteObject*/ )));
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createnewlabels(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreateNewLabels (table) ","table",102,__ref.getField(false, "ba"),__ref,236);
if (RapidSub.canDelegate("createnewlabels")) { return __ref.runUserSub(false, "table","createnewlabels", __ref);}
RemoteObject _lbls = null;
int _i = 0;
RemoteObject _rc = RemoteObject.declareNull("ir.parsikhesab.pakhsh.table._rowcol");
RemoteObject _l = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
 BA.debugLineNum = 236;BA.debugLine="Private Sub CreateNewLabels As Label()";
Debug.ShouldStop(2048);
 BA.debugLineNum = 237;BA.debugLine="Dim lbls(NumberOfColumns) As Label";
Debug.ShouldStop(4096);
_lbls = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.LabelWrapper", new int[] {__ref.getField(true,"_numberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});Debug.locals.put("lbls", _lbls);
 BA.debugLineNum = 238;BA.debugLine="For I = 0 To NumberOfColumns - 1";
Debug.ShouldStop(8192);
{
final int step2 = 1;
final int limit2 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_numberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
Debug.locals.put("I", _i);
 BA.debugLineNum = 239;BA.debugLine="Dim rc As RowCol";
Debug.ShouldStop(16384);
_rc = RemoteObject.createNew ("ir.parsikhesab.pakhsh.table._rowcol");Debug.locals.put("rc", _rc);
 BA.debugLineNum = 240;BA.debugLine="rc.Col = I";
Debug.ShouldStop(32768);
_rc.setField ("Col" /*RemoteObject*/ ,BA.numberCast(int.class, _i));
 BA.debugLineNum = 241;BA.debugLine="Dim l As Label";
Debug.ShouldStop(65536);
_l = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("l", _l);
 BA.debugLineNum = 242;BA.debugLine="l.Initialize(\"cell\")";
Debug.ShouldStop(131072);
_l.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("cell")));
 BA.debugLineNum = 243;BA.debugLine="l.Gravity = Alignment";
Debug.ShouldStop(262144);
_l.runMethod(true,"setGravity",__ref.getField(true,"_alignment" /*RemoteObject*/ ));
 BA.debugLineNum = 244;BA.debugLine="l.TextSize = FontSize";
Debug.ShouldStop(524288);
_l.runMethod(true,"setTextSize",__ref.getField(true,"_fontsize" /*RemoteObject*/ ));
 BA.debugLineNum = 245;BA.debugLine="l.TextColor = FontColor";
Debug.ShouldStop(1048576);
_l.runMethod(true,"setTextColor",__ref.getField(true,"_fontcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 246;BA.debugLine="l.Typeface=Typeface.LoadFromAssets(\"iransansmono";
Debug.ShouldStop(2097152);
_l.runMethod(false,"setTypeface",table.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("iransansmonospacednum_bold.ttf"))));
 BA.debugLineNum = 247;BA.debugLine="l.Tag = rc";
Debug.ShouldStop(4194304);
_l.runMethod(false,"setTag",(_rc));
 BA.debugLineNum = 248;BA.debugLine="lbls(I) = l";
Debug.ShouldStop(8388608);
_lbls.setArrayElement (_l,BA.numberCast(int.class, _i));
 }
}Debug.locals.put("I", _i);
;
 BA.debugLineNum = 250;BA.debugLine="Return lbls";
Debug.ShouldStop(33554432);
if (true) return _lbls;
 BA.debugLineNum = 251;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getlabels(RemoteObject __ref,RemoteObject _row) throws Exception{
try {
		Debug.PushSubsStack("GetLabels (table) ","table",102,__ref.getField(false, "ba"),__ref,219);
if (RapidSub.canDelegate("getlabels")) { return __ref.runUserSub(false, "table","getlabels", __ref, _row);}
RemoteObject _lbls = null;
int _i = 0;
RemoteObject _rc = RemoteObject.declareNull("ir.parsikhesab.pakhsh.table._rowcol");
Debug.locals.put("Row", _row);
 BA.debugLineNum = 219;BA.debugLine="Private Sub GetLabels(Row As Int) As Label()";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 220;BA.debugLine="Dim lbls() As Label";
Debug.ShouldStop(134217728);
_lbls = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.LabelWrapper", new int[] {0}, new Object[]{});Debug.locals.put("lbls", _lbls);
 BA.debugLineNum = 221;BA.debugLine="If LabelsCache.Size > 0 Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_labelscache" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 223;BA.debugLine="lbls = LabelsCache.Get(LabelsCache.Size - 1)";
Debug.ShouldStop(1073741824);
_lbls = (__ref.getField(false,"_labelscache" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_labelscache" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1))));Debug.locals.put("lbls", _lbls);
 BA.debugLineNum = 224;BA.debugLine="LabelsCache.RemoveAt(LabelsCache.Size - 1)";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_labelscache" /*RemoteObject*/ ).runVoidMethod ("RemoveAt",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_labelscache" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1)));
 }else {
 BA.debugLineNum = 226;BA.debugLine="lbls = CreateNewLabels";
Debug.ShouldStop(2);
_lbls = __ref.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_createnewlabels" /*RemoteObject*/ );Debug.locals.put("lbls", _lbls);
 };
 BA.debugLineNum = 228;BA.debugLine="For I = 0 To lbls.Length - 1";
Debug.ShouldStop(8);
{
final int step8 = 1;
final int limit8 = RemoteObject.solve(new RemoteObject[] {_lbls.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step8 > 0 && _i <= limit8) || (step8 < 0 && _i >= limit8) ;_i = ((int)(0 + _i + step8))  ) {
Debug.locals.put("I", _i);
 BA.debugLineNum = 229;BA.debugLine="Dim rc As RowCol";
Debug.ShouldStop(16);
_rc = RemoteObject.createNew ("ir.parsikhesab.pakhsh.table._rowcol");Debug.locals.put("rc", _rc);
 BA.debugLineNum = 230;BA.debugLine="rc = lbls(I).Tag";
Debug.ShouldStop(32);
_rc = (_lbls.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(false,"getTag"));Debug.locals.put("rc", _rc);
 BA.debugLineNum = 231;BA.debugLine="rc.Row = Row";
Debug.ShouldStop(64);
_rc.setField ("Row" /*RemoteObject*/ ,_row);
 }
}Debug.locals.put("I", _i);
;
 BA.debugLineNum = 233;BA.debugLine="Return lbls";
Debug.ShouldStop(256);
if (true) return _lbls;
 BA.debugLineNum = 234;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getvalue(RemoteObject __ref,RemoteObject _col,RemoteObject _row) throws Exception{
try {
		Debug.PushSubsStack("GetValue (table) ","table",102,__ref.getField(false, "ba"),__ref,309);
if (RapidSub.canDelegate("getvalue")) { return __ref.runUserSub(false, "table","getvalue", __ref, _col, _row);}
RemoteObject _values = null;
Debug.locals.put("Col", _col);
Debug.locals.put("Row", _row);
 BA.debugLineNum = 309;BA.debugLine="Public Sub GetValue(Col As Int, Row As Int)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 310;BA.debugLine="Dim values() As String";
Debug.ShouldStop(2097152);
_values = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("values", _values);
 BA.debugLineNum = 311;BA.debugLine="values = Data.Get(Row)";
Debug.ShouldStop(4194304);
_values = (__ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(_row)));Debug.locals.put("values", _values);
 BA.debugLineNum = 312;BA.debugLine="Return values(Col)";
Debug.ShouldStop(8388608);
if (true) return _values.getArrayElement(true,_col);
 BA.debugLineNum = 313;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _header_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Header_Click (table) ","table",102,__ref.getField(false, "ba"),__ref,298);
if (RapidSub.canDelegate("header_click")) { return __ref.runUserSub(false, "table","header_click", __ref);}
RemoteObject _l = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _col = RemoteObject.createImmutable(0);
 BA.debugLineNum = 298;BA.debugLine="Private Sub Header_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 299;BA.debugLine="Dim l As Label";
Debug.ShouldStop(1024);
_l = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("l", _l);
 BA.debugLineNum = 300;BA.debugLine="Dim col As Int";
Debug.ShouldStop(2048);
_col = RemoteObject.createImmutable(0);Debug.locals.put("col", _col);
 BA.debugLineNum = 301;BA.debugLine="l = Sender";
Debug.ShouldStop(4096);
_l = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), table.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("l", _l);
 BA.debugLineNum = 302;BA.debugLine="col = l.Tag";
Debug.ShouldStop(8192);
_col = BA.numberCast(int.class, _l.runMethod(false,"getTag"));Debug.locals.put("col", _col);
 BA.debugLineNum = 303;BA.debugLine="If SubExists(Callback, Event & \"_HeaderClick\") Th";
Debug.ShouldStop(16384);
if (table.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_callback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_event" /*RemoteObject*/ ),RemoteObject.createImmutable("_HeaderClick")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 304;BA.debugLine="CallSub2(Callback, Event & \"_HeaderClick\", col)";
Debug.ShouldStop(32768);
table.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_callback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_event" /*RemoteObject*/ ),RemoteObject.createImmutable("_HeaderClick"))),(Object)((_col)));
 };
 BA.debugLineNum = 306;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hiderow(RemoteObject __ref,RemoteObject _row) throws Exception{
try {
		Debug.PushSubsStack("HideRow (table) ","table",102,__ref.getField(false, "ba"),__ref,204);
if (RapidSub.canDelegate("hiderow")) { return __ref.runUserSub(false, "table","hiderow", __ref, _row);}
RemoteObject _lbls = null;
int _i = 0;
Debug.locals.put("Row", _row);
 BA.debugLineNum = 204;BA.debugLine="Private Sub HideRow (Row As Int)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 206;BA.debugLine="Dim lbls() As Label";
Debug.ShouldStop(8192);
_lbls = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.LabelWrapper", new int[] {0}, new Object[]{});Debug.locals.put("lbls", _lbls);
 BA.debugLineNum = 207;BA.debugLine="lbls = visibleRows.Get(Row)";
Debug.ShouldStop(16384);
_lbls = (__ref.getField(false,"_visiblerows" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_row))));Debug.locals.put("lbls", _lbls);
 BA.debugLineNum = 208;BA.debugLine="If lbls = Null Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("n",_lbls)) { 
 BA.debugLineNum = 209;BA.debugLine="Log(\"HideRow: (null) \" & Row)";
Debug.ShouldStop(65536);
table.__c.runVoidMethod ("LogImpl","5122028037",RemoteObject.concat(RemoteObject.createImmutable("HideRow: (null) "),_row),0);
 BA.debugLineNum = 210;BA.debugLine="Return";
Debug.ShouldStop(131072);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 212;BA.debugLine="For I = 0 To lbls.Length - 1";
Debug.ShouldStop(524288);
{
final int step7 = 1;
final int limit7 = RemoteObject.solve(new RemoteObject[] {_lbls.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step7 > 0 && _i <= limit7) || (step7 < 0 && _i >= limit7) ;_i = ((int)(0 + _i + step7))  ) {
Debug.locals.put("I", _i);
 BA.debugLineNum = 213;BA.debugLine="lbls(I).RemoveView";
Debug.ShouldStop(1048576);
_lbls.getArrayElement(false,BA.numberCast(int.class, _i)).runVoidMethod ("RemoveView");
 }
}Debug.locals.put("I", _i);
;
 BA.debugLineNum = 215;BA.debugLine="visibleRows.Remove(Row)";
Debug.ShouldStop(4194304);
__ref.getField(false,"_visiblerows" /*RemoteObject*/ ).runVoidMethod ("Remove",(Object)((_row)));
 BA.debugLineNum = 216;BA.debugLine="LabelsCache.Add(lbls)";
Debug.ShouldStop(8388608);
__ref.getField(false,"_labelscache" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_lbls)));
 BA.debugLineNum = 217;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callbackmodule,RemoteObject _eventname,RemoteObject _vnumberofcolumns) throws Exception{
try {
		Debug.PushSubsStack("Initialize (table) ","table",102,__ref.getField(false, "ba"),__ref,32);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "table","initialize", __ref, _ba, _callbackmodule, _eventname, _vnumberofcolumns);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("CallbackModule", _callbackmodule);
Debug.locals.put("EventName", _eventname);
Debug.locals.put("vNumberOfColumns", _vnumberofcolumns);
 BA.debugLineNum = 32;BA.debugLine="Public Sub Initialize (CallbackModule As Object, E";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 33;BA.debugLine="SV.Initialize(0, 0, \"SV\")";
Debug.ShouldStop(1);
__ref.getField(false,"_sv" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.createImmutable("SV")));
 BA.debugLineNum = 34;BA.debugLine="SV.Panel.Color = TableColor";
Debug.ShouldStop(2);
__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(false,"getPanel").runVoidMethod ("setColor",__ref.getField(true,"_tablecolor" /*RemoteObject*/ ));
 BA.debugLineNum = 35;BA.debugLine="Callback = CallbackModule";
Debug.ShouldStop(4);
__ref.setField ("_callback" /*RemoteObject*/ ,_callbackmodule);
 BA.debugLineNum = 36;BA.debugLine="Event = EventName";
Debug.ShouldStop(8);
__ref.setField ("_event" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 37;BA.debugLine="innerClearAll(vNumberOfColumns)";
Debug.ShouldStop(16);
__ref.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_innerclearall" /*RemoteObject*/ ,(Object)(_vnumberofcolumns));
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _innerclearall(RemoteObject __ref,RemoteObject _vnumberofcolumns) throws Exception{
try {
		Debug.PushSubsStack("innerClearAll (table) ","table",102,__ref.getField(false, "ba"),__ref,68);
if (RapidSub.canDelegate("innerclearall")) { return __ref.runUserSub(false, "table","innerclearall", __ref, _vnumberofcolumns);}
int _i = 0;
RemoteObject _cd1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _cd2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _cd3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
Debug.locals.put("vNumberOfColumns", _vnumberofcolumns);
 BA.debugLineNum = 68;BA.debugLine="Private Sub innerClearAll(vNumberOfColumns As Int)";
Debug.ShouldStop(8);
 BA.debugLineNum = 69;BA.debugLine="For i = SV.Panel.NumberOfViews -1 To 0 Step -1";
Debug.ShouldStop(16);
{
final int step1 = -1;
final int limit1 = 0;
_i = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(false,"getPanel").runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue() ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 70;BA.debugLine="SV.Panel.RemoveViewAt(i)";
Debug.ShouldStop(32);
__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(false,"getPanel").runVoidMethod ("RemoveViewAt",(Object)(BA.numberCast(int.class, _i)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 72;BA.debugLine="NumberOfColumns = vNumberOfColumns";
Debug.ShouldStop(128);
__ref.setField ("_numberofcolumns" /*RemoteObject*/ ,_vnumberofcolumns);
 BA.debugLineNum = 73;BA.debugLine="Dim Drawable1(NumberOfColumns) As Object";
Debug.ShouldStop(256);
table._drawable1 = RemoteObject.createNewArray ("Object", new int[] {__ref.getField(true,"_numberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});__ref.setField("_drawable1",table._drawable1);
 BA.debugLineNum = 74;BA.debugLine="Dim Drawable2(NumberOfColumns) As Object";
Debug.ShouldStop(512);
table._drawable2 = RemoteObject.createNewArray ("Object", new int[] {__ref.getField(true,"_numberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});__ref.setField("_drawable2",table._drawable2);
 BA.debugLineNum = 75;BA.debugLine="Dim SelectedDrawable(NumberOfColumns) As Object";
Debug.ShouldStop(1024);
table._selecteddrawable = RemoteObject.createNewArray ("Object", new int[] {__ref.getField(true,"_numberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});__ref.setField("_selecteddrawable",table._selecteddrawable);
 BA.debugLineNum = 76;BA.debugLine="For i = 0 To NumberOfColumns - 1";
Debug.ShouldStop(2048);
{
final int step8 = 1;
final int limit8 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_numberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step8 > 0 && _i <= limit8) || (step8 < 0 && _i >= limit8) ;_i = ((int)(0 + _i + step8))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 77;BA.debugLine="Dim cd1, cd2, cd3 As ColorDrawable";
Debug.ShouldStop(4096);
_cd1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("cd1", _cd1);
_cd2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("cd2", _cd2);
_cd3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("cd3", _cd3);
 BA.debugLineNum = 78;BA.debugLine="cd1.Initialize(Colors.White, 0)";
Debug.ShouldStop(8192);
_cd1.runVoidMethod ("Initialize",(Object)(table.__c.getField(false,"Colors").getField(true,"White")),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 80;BA.debugLine="cd2.Initialize(0xFFE3E3E3, 0)";
Debug.ShouldStop(32768);
_cd2.runVoidMethod ("Initialize",(Object)(BA.numberCast(int.class, ((int)0xffe3e3e3))),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 81;BA.debugLine="cd3.Initialize(0xFF007FFF, 0)";
Debug.ShouldStop(65536);
_cd3.runVoidMethod ("Initialize",(Object)(BA.numberCast(int.class, ((int)0xff007fff))),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 82;BA.debugLine="Drawable1(i) = cd1";
Debug.ShouldStop(131072);
__ref.getField(false,"_drawable1" /*RemoteObject*/ ).setArrayElement ((_cd1.getObject()),BA.numberCast(int.class, _i));
 BA.debugLineNum = 83;BA.debugLine="Drawable2(i) = cd2";
Debug.ShouldStop(262144);
__ref.getField(false,"_drawable2" /*RemoteObject*/ ).setArrayElement ((_cd2.getObject()),BA.numberCast(int.class, _i));
 BA.debugLineNum = 84;BA.debugLine="SelectedDrawable(i) = cd3";
Debug.ShouldStop(524288);
__ref.getField(false,"_selecteddrawable" /*RemoteObject*/ ).setArrayElement ((_cd3.getObject()),BA.numberCast(int.class, _i));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 86;BA.debugLine="SV.Panel.Height = 0";
Debug.ShouldStop(2097152);
__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(false,"getPanel").runMethod(true,"setHeight",BA.numberCast(int.class, 0));
 BA.debugLineNum = 87;BA.debugLine="SelectedRow = -1";
Debug.ShouldStop(4194304);
__ref.setField ("_selectedrow" /*RemoteObject*/ ,BA.numberCast(int.class, -(double) (0 + 1)));
 BA.debugLineNum = 88;BA.debugLine="minVisibleRow = -1";
Debug.ShouldStop(8388608);
__ref.setField ("_minvisiblerow" /*RemoteObject*/ ,BA.numberCast(int.class, -(double) (0 + 1)));
 BA.debugLineNum = 89;BA.debugLine="maxVisibleRow = 0";
Debug.ShouldStop(16777216);
__ref.setField ("_maxvisiblerow" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 90;BA.debugLine="Data.Initialize";
Debug.ShouldStop(33554432);
__ref.getField(false,"_data" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 91;BA.debugLine="LabelsCache.Initialize";
Debug.ShouldStop(67108864);
__ref.getField(false,"_labelscache" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 92;BA.debugLine="visibleRows.Initialize";
Debug.ShouldStop(134217728);
__ref.getField(false,"_visiblerows" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 93;BA.debugLine="SV.VerticalScrollPosition = 0";
Debug.ShouldStop(268435456);
__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"setVerticalScrollPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 94;BA.debugLine="DoEvents";
Debug.ShouldStop(536870912);
table.__c.runVoidMethodAndSync ("DoEvents");
 BA.debugLineNum = 95;BA.debugLine="SV.VerticalScrollPosition = 0";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"setVerticalScrollPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 96;BA.debugLine="For i = 1 To 80 'fill the cache to avoid delay on";
Debug.ShouldStop(-2147483648);
{
final int step27 = 1;
final int limit27 = 80;
_i = 1 ;
for (;(step27 > 0 && _i <= limit27) || (step27 < 0 && _i >= limit27) ;_i = ((int)(0 + _i + step27))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 97;BA.debugLine="LabelsCache.Add(CreateNewLabels)";
Debug.ShouldStop(1);
__ref.getField(false,"_labelscache" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((__ref.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_createnewlabels" /*RemoteObject*/ ))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 99;BA.debugLine="If visible Then";
Debug.ShouldStop(4);
if (__ref.getField(true,"_visible" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 100;BA.debugLine="SV_ScrollChanged(0, 0)";
Debug.ShouldStop(8);
__ref.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_sv_scrollchanged" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)));
 };
 BA.debugLineNum = 102;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isrowvisible(RemoteObject __ref,RemoteObject _row) throws Exception{
try {
		Debug.PushSubsStack("IsRowVisible (table) ","table",102,__ref.getField(false, "ba"),__ref,199);
if (RapidSub.canDelegate("isrowvisible")) { return __ref.runUserSub(false, "table","isrowvisible", __ref, _row);}
Debug.locals.put("Row", _row);
 BA.debugLineNum = 199;BA.debugLine="Private Sub IsRowVisible(Row As Int) As Boolean";
Debug.ShouldStop(64);
 BA.debugLineNum = 200;BA.debugLine="Return Row < (SV.VerticalScrollPosition + SV.Heig";
Debug.ShouldStop(128);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean("<",_row,RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"getVerticalScrollPosition"),__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "+",1, 1)),(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_rowheight" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1))}, "/",0, 0)) && RemoteObject.solveBoolean(">",_row,RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"getVerticalScrollPosition"),__ref.getField(true,"_rowheight" /*RemoteObject*/ )}, "/",0, 0)));
 BA.debugLineNum = 202;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _jumptorow(RemoteObject __ref,RemoteObject _row) throws Exception{
try {
		Debug.PushSubsStack("JumpToRow (table) ","table",102,__ref.getField(false, "ba"),__ref,348);
if (RapidSub.canDelegate("jumptorow")) { return __ref.runUserSub(false, "table","jumptorow", __ref, _row);}
Debug.locals.put("Row", _row);
 BA.debugLineNum = 348;BA.debugLine="Public Sub JumpToRow(Row As Int)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 349;BA.debugLine="SV.VerticalScrollPosition = Row * RowHeight";
Debug.ShouldStop(268435456);
__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"setVerticalScrollPosition",RemoteObject.solve(new RemoteObject[] {_row,__ref.getField(true,"_rowheight" /*RemoteObject*/ )}, "*",0, 1));
 BA.debugLineNum = 350;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadeshantiongrouplist(RemoteObject __ref,RemoteObject _lst,RemoteObject _lst_colnametitle,RemoteObject _n_col) throws Exception{
try {
		Debug.PushSubsStack("LoadEshantionGroupList (table) ","table",102,__ref.getField(false, "ba"),__ref,441);
if (RapidSub.canDelegate("loadeshantiongrouplist")) { return __ref.runUserSub(false, "table","loadeshantiongrouplist", __ref, _lst, _lst_colnametitle, _n_col);}
RemoteObject _headers = null;
RemoteObject _widths = null;
RemoteObject _col = RemoteObject.createImmutable(0);
RemoteObject _row = RemoteObject.createImmutable(0);
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlisteshantiongroup");
RemoteObject _r = null;
Debug.locals.put("Lst", _lst);
Debug.locals.put("Lst_ColNameTitle", _lst_colnametitle);
Debug.locals.put("N_Col", _n_col);
 BA.debugLineNum = 441;BA.debugLine="Public Sub LoadEshantionGroupList(Lst As List,Lst_";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 442;BA.debugLine="NumberOfColumns = N_Col";
Debug.ShouldStop(33554432);
__ref.setField ("_numberofcolumns" /*RemoteObject*/ ,_n_col);
 BA.debugLineNum = 443;BA.debugLine="innerClearAll(NumberOfColumns)";
Debug.ShouldStop(67108864);
__ref.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_innerclearall" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_numberofcolumns" /*RemoteObject*/ )));
 BA.debugLineNum = 445;BA.debugLine="Dim headers(NumberOfColumns) As String";
Debug.ShouldStop(268435456);
_headers = RemoteObject.createNewArray ("String", new int[] {__ref.getField(true,"_numberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});Debug.locals.put("headers", _headers);
 BA.debugLineNum = 446;BA.debugLine="Dim Widths(NumberOfColumns) As Int";
Debug.ShouldStop(536870912);
_widths = RemoteObject.createNewArray ("int", new int[] {__ref.getField(true,"_numberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});Debug.locals.put("Widths", _widths);
 BA.debugLineNum = 447;BA.debugLine="Dim col, row As Int";
Debug.ShouldStop(1073741824);
_col = RemoteObject.createImmutable(0);Debug.locals.put("col", _col);
_row = RemoteObject.createImmutable(0);Debug.locals.put("row", _row);
 BA.debugLineNum = 448;BA.debugLine="For col = 0 To NumberOfColumns - 1";
Debug.ShouldStop(-2147483648);
{
final int step6 = 1;
final int limit6 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_numberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = BA.numberCast(int.class, 0) ;
for (;(step6 > 0 && _col.<Integer>get().intValue() <= limit6) || (step6 < 0 && _col.<Integer>get().intValue() >= limit6) ;_col = RemoteObject.createImmutable((int)(0 + _col.<Integer>get().intValue() + step6))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 449;BA.debugLine="headers(col) = Lst_ColNameTitle.get(col)";
Debug.ShouldStop(1);
_headers.setArrayElement (BA.ObjectToString(_lst_colnametitle.runMethod(false,"Get",(Object)(_col))),_col);
 BA.debugLineNum = 450;BA.debugLine="Widths(col) = 162dip";
Debug.ShouldStop(2);
_widths.setArrayElement (table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 162))),_col);
 }
}Debug.locals.put("col", _col);
;
 BA.debugLineNum = 452;BA.debugLine="SetHeader(headers,Widths)";
Debug.ShouldStop(8);
__ref.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_setheader" /*RemoteObject*/ ,(Object)(_headers),(Object)(_widths));
 BA.debugLineNum = 453;BA.debugLine="SetColumnsWidths(Widths)";
Debug.ShouldStop(16);
__ref.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_setcolumnswidths" /*RemoteObject*/ ,(Object)(_widths));
 BA.debugLineNum = 456;BA.debugLine="For row = 0 To Lst.Size - 1";
Debug.ShouldStop(128);
{
final int step12 = 1;
final int limit12 = RemoteObject.solve(new RemoteObject[] {_lst.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_row = BA.numberCast(int.class, 0) ;
for (;(step12 > 0 && _row.<Integer>get().intValue() <= limit12) || (step12 < 0 && _row.<Integer>get().intValue() >= limit12) ;_row = RemoteObject.createImmutable((int)(0 + _row.<Integer>get().intValue() + step12))  ) {
Debug.locals.put("row", _row);
 BA.debugLineNum = 457;BA.debugLine="Dim Item = Lst.Get(row) As AdapterListEshantionG";
Debug.ShouldStop(256);
_item = (_lst.runMethod(false,"Get",(Object)(_row)));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 458;BA.debugLine="Dim r(NumberOfColumns) As String";
Debug.ShouldStop(512);
_r = RemoteObject.createNewArray ("String", new int[] {__ref.getField(true,"_numberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});Debug.locals.put("r", _r);
 BA.debugLineNum = 460;BA.debugLine="r(0) = row+1";
Debug.ShouldStop(2048);
_r.setArrayElement (BA.NumberToString(RemoteObject.solve(new RemoteObject[] {_row,RemoteObject.createImmutable(1)}, "+",1, 1)),BA.numberCast(int.class, 0));
 BA.debugLineNum = 461;BA.debugLine="r(1) = Item.fldCodeGroupKala";
Debug.ShouldStop(4096);
_r.setArrayElement (_item.getField(true,"fldCodeGroupKala" /*RemoteObject*/ ),BA.numberCast(int.class, 1));
 BA.debugLineNum = 462;BA.debugLine="r(2) = MCode.GetNameGroupKala(Item.fldCodeGroupK";
Debug.ShouldStop(8192);
_r.setArrayElement (table._mcode.runMethod(true,"_getnamegroupkala" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_item.getField(true,"fldCodeGroupKala" /*RemoteObject*/ ))),BA.numberCast(int.class, 2));
 BA.debugLineNum = 463;BA.debugLine="r(3) = Item.fldCodeGroupKalaEshantion";
Debug.ShouldStop(16384);
_r.setArrayElement (_item.getField(true,"fldCodeGroupKalaEshantion" /*RemoteObject*/ ),BA.numberCast(int.class, 3));
 BA.debugLineNum = 464;BA.debugLine="r(4) = MCode.GetNameGroupKala(Item.fldCodeGroupK";
Debug.ShouldStop(32768);
_r.setArrayElement (table._mcode.runMethod(true,"_getnamegroupkala" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_item.getField(true,"fldCodeGroupKalaEshantion" /*RemoteObject*/ ))),BA.numberCast(int.class, 4));
 BA.debugLineNum = 465;BA.debugLine="r(5) = Item.fldTedadEshantion";
Debug.ShouldStop(65536);
_r.setArrayElement (_item.getField(true,"fldTedadEshantion" /*RemoteObject*/ ),BA.numberCast(int.class, 5));
 BA.debugLineNum = 467;BA.debugLine="AddRow(r)";
Debug.ShouldStop(262144);
__ref.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_addrow" /*RemoteObject*/ ,(Object)(_r));
 }
}Debug.locals.put("row", _row);
;
 BA.debugLineNum = 469;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadslist(RemoteObject __ref,RemoteObject _lst,RemoteObject _lst_colnametitle,RemoteObject _n_col) throws Exception{
try {
		Debug.PushSubsStack("LoadSList (table) ","table",102,__ref.getField(false, "ba"),__ref,386);
if (RapidSub.canDelegate("loadslist")) { return __ref.runUserSub(false, "table","loadslist", __ref, _lst, _lst_colnametitle, _n_col);}
RemoteObject _headers = null;
RemoteObject _widths = null;
RemoteObject _col = RemoteObject.createImmutable(0);
RemoteObject _row = RemoteObject.createImmutable(0);
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlistkala");
RemoteObject _r = null;
Debug.locals.put("Lst", _lst);
Debug.locals.put("Lst_ColNameTitle", _lst_colnametitle);
Debug.locals.put("N_Col", _n_col);
 BA.debugLineNum = 386;BA.debugLine="Public Sub LoadSList(Lst As List,Lst_ColNameTitle";
Debug.ShouldStop(2);
 BA.debugLineNum = 387;BA.debugLine="NumberOfColumns = N_Col";
Debug.ShouldStop(4);
__ref.setField ("_numberofcolumns" /*RemoteObject*/ ,_n_col);
 BA.debugLineNum = 388;BA.debugLine="innerClearAll(NumberOfColumns)";
Debug.ShouldStop(8);
__ref.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_innerclearall" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_numberofcolumns" /*RemoteObject*/ )));
 BA.debugLineNum = 390;BA.debugLine="Dim headers(NumberOfColumns) As String";
Debug.ShouldStop(32);
_headers = RemoteObject.createNewArray ("String", new int[] {__ref.getField(true,"_numberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});Debug.locals.put("headers", _headers);
 BA.debugLineNum = 391;BA.debugLine="Dim Widths(NumberOfColumns) As Int";
Debug.ShouldStop(64);
_widths = RemoteObject.createNewArray ("int", new int[] {__ref.getField(true,"_numberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});Debug.locals.put("Widths", _widths);
 BA.debugLineNum = 392;BA.debugLine="Dim col, row As Int";
Debug.ShouldStop(128);
_col = RemoteObject.createImmutable(0);Debug.locals.put("col", _col);
_row = RemoteObject.createImmutable(0);Debug.locals.put("row", _row);
 BA.debugLineNum = 393;BA.debugLine="For col = 0 To NumberOfColumns - 1";
Debug.ShouldStop(256);
{
final int step6 = 1;
final int limit6 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_numberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = BA.numberCast(int.class, 0) ;
for (;(step6 > 0 && _col.<Integer>get().intValue() <= limit6) || (step6 < 0 && _col.<Integer>get().intValue() >= limit6) ;_col = RemoteObject.createImmutable((int)(0 + _col.<Integer>get().intValue() + step6))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 394;BA.debugLine="headers(col) = Lst_ColNameTitle.get(col)";
Debug.ShouldStop(512);
_headers.setArrayElement (BA.ObjectToString(_lst_colnametitle.runMethod(false,"Get",(Object)(_col))),_col);
 BA.debugLineNum = 395;BA.debugLine="Widths(col) = 162dip";
Debug.ShouldStop(1024);
_widths.setArrayElement (table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 162))),_col);
 }
}Debug.locals.put("col", _col);
;
 BA.debugLineNum = 397;BA.debugLine="SetHeader(headers,Widths)";
Debug.ShouldStop(4096);
__ref.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_setheader" /*RemoteObject*/ ,(Object)(_headers),(Object)(_widths));
 BA.debugLineNum = 398;BA.debugLine="SetColumnsWidths(Widths)";
Debug.ShouldStop(8192);
__ref.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_setcolumnswidths" /*RemoteObject*/ ,(Object)(_widths));
 BA.debugLineNum = 401;BA.debugLine="For row = 0 To Lst.Size - 1";
Debug.ShouldStop(65536);
{
final int step12 = 1;
final int limit12 = RemoteObject.solve(new RemoteObject[] {_lst.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_row = BA.numberCast(int.class, 0) ;
for (;(step12 > 0 && _row.<Integer>get().intValue() <= limit12) || (step12 < 0 && _row.<Integer>get().intValue() >= limit12) ;_row = RemoteObject.createImmutable((int)(0 + _row.<Integer>get().intValue() + step12))  ) {
Debug.locals.put("row", _row);
 BA.debugLineNum = 402;BA.debugLine="Dim Item = Lst.Get(row) As AdapterListKala";
Debug.ShouldStop(131072);
_item = (_lst.runMethod(false,"Get",(Object)(_row)));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 403;BA.debugLine="Dim r(NumberOfColumns) As String";
Debug.ShouldStop(262144);
_r = RemoteObject.createNewArray ("String", new int[] {__ref.getField(true,"_numberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});Debug.locals.put("r", _r);
 BA.debugLineNum = 405;BA.debugLine="r(0) = row+1";
Debug.ShouldStop(1048576);
_r.setArrayElement (BA.NumberToString(RemoteObject.solve(new RemoteObject[] {_row,RemoteObject.createImmutable(1)}, "+",1, 1)),BA.numberCast(int.class, 0));
 BA.debugLineNum = 407;BA.debugLine="r(1) = Item.NameKala";
Debug.ShouldStop(4194304);
_r.setArrayElement (_item.getField(true,"NameKala" /*RemoteObject*/ ),BA.numberCast(int.class, 1));
 BA.debugLineNum = 408;BA.debugLine="r(2) = Item.CodeKala";
Debug.ShouldStop(8388608);
_r.setArrayElement (_item.getField(true,"CodeKala" /*RemoteObject*/ ),BA.numberCast(int.class, 2));
 BA.debugLineNum = 410;BA.debugLine="r(3) = NumberFormat(Item.FeeForoosh	,1,3)";
Debug.ShouldStop(33554432);
_r.setArrayElement (table.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _item.getField(true,"FeeForoosh" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),BA.numberCast(int.class, 3));
 BA.debugLineNum = 411;BA.debugLine="r(4) = NumberFormat(Item.fldFeeBadAzTakhfif,1,3)";
Debug.ShouldStop(67108864);
_r.setArrayElement (table.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _item.getField(true,"fldFeeBadAzTakhfif" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),BA.numberCast(int.class, 4));
 BA.debugLineNum = 413;BA.debugLine="r(5) = NumberFormat(Item.MablaghTakhfif,1,3)";
Debug.ShouldStop(268435456);
_r.setArrayElement (table.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _item.getField(true,"MablaghTakhfif" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),BA.numberCast(int.class, 5));
 BA.debugLineNum = 414;BA.debugLine="r(6) = NumberFormat(Item.fldDarsadTakhfif,1,3)";
Debug.ShouldStop(536870912);
_r.setArrayElement (table.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _item.getField(true,"fldDarsadTakhfif" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),BA.numberCast(int.class, 6));
 BA.debugLineNum = 415;BA.debugLine="If Item.MablaghTakhfif>0 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean(">",_item.getField(true,"MablaghTakhfif" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 416;BA.debugLine="r(7) =0";
Debug.ShouldStop(-2147483648);
_r.setArrayElement (BA.NumberToString(0),BA.numberCast(int.class, 7));
 }else {
 BA.debugLineNum = 418;BA.debugLine="If Item.fldFeeBadAzTakhfif>0 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _item.getField(true,"fldFeeBadAzTakhfif" /*RemoteObject*/ )),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 419;BA.debugLine="r(7) = NumberFormat(Item.FeeForoosh-Item.fldFe";
Debug.ShouldStop(4);
_r.setArrayElement (table.__c.runMethod(true,"NumberFormat",(Object)(RemoteObject.solve(new RemoteObject[] {_item.getField(true,"FeeForoosh" /*RemoteObject*/ ),BA.numberCast(double.class, _item.getField(true,"fldFeeBadAzTakhfif" /*RemoteObject*/ ))}, "-",1, 0)),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),BA.numberCast(int.class, 7));
 }else {
 BA.debugLineNum = 421;BA.debugLine="r(7) =0";
Debug.ShouldStop(16);
_r.setArrayElement (BA.NumberToString(0),BA.numberCast(int.class, 7));
 };
 };
 BA.debugLineNum = 427;BA.debugLine="r(8) = myCode.Is_Null_adad(Item.fldDarsadArzeshA";
Debug.ShouldStop(1024);
_r.setArrayElement (table._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_item.getField(true,"fldDarsadArzeshAfzode" /*RemoteObject*/ ))),BA.numberCast(int.class, 8));
 BA.debugLineNum = 428;BA.debugLine="r(9) = myCode.Is_Null_Price(Item.fldArzeshAfzode";
Debug.ShouldStop(2048);
_r.setArrayElement (table._mycode.runMethod(true,"_is_null_price" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_item.getField(true,"fldArzeshAfzode" /*RemoteObject*/ ))),BA.numberCast(int.class, 9));
 BA.debugLineNum = 430;BA.debugLine="r(10) = Item.TedadDarSabadJoz";
Debug.ShouldStop(8192);
_r.setArrayElement (_item.getField(true,"TedadDarSabadJoz" /*RemoteObject*/ ),BA.numberCast(int.class, 10));
 BA.debugLineNum = 431;BA.debugLine="r(11) = Item.NameVahed";
Debug.ShouldStop(16384);
_r.setArrayElement (_item.getField(true,"NameVahed" /*RemoteObject*/ ),BA.numberCast(int.class, 11));
 BA.debugLineNum = 433;BA.debugLine="r(12) = Item.TedadDarSabadKol";
Debug.ShouldStop(65536);
_r.setArrayElement (_item.getField(true,"TedadDarSabadKol" /*RemoteObject*/ ),BA.numberCast(int.class, 12));
 BA.debugLineNum = 434;BA.debugLine="r(13) = Item.NameVahed2";
Debug.ShouldStop(131072);
_r.setArrayElement (_item.getField(true,"NameVahed2" /*RemoteObject*/ ),BA.numberCast(int.class, 13));
 BA.debugLineNum = 436;BA.debugLine="r(14) = Item.Tozihat";
Debug.ShouldStop(524288);
_r.setArrayElement (_item.getField(true,"Tozihat" /*RemoteObject*/ ),BA.numberCast(int.class, 14));
 BA.debugLineNum = 437;BA.debugLine="AddRow(r)";
Debug.ShouldStop(1048576);
__ref.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_addrow" /*RemoteObject*/ ,(Object)(_r));
 }
}Debug.locals.put("row", _row);
;
 BA.debugLineNum = 439;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadslistreportrizebargasht(RemoteObject __ref,RemoteObject _lst,RemoteObject _lst_colnametitle,RemoteObject _n_col) throws Exception{
try {
		Debug.PushSubsStack("LoadSListReportRizeBargasht (table) ","table",102,__ref.getField(false, "ba"),__ref,471);
if (RapidSub.canDelegate("loadslistreportrizebargasht")) { return __ref.runUserSub(false, "table","loadslistreportrizebargasht", __ref, _lst, _lst_colnametitle, _n_col);}
RemoteObject _headers = null;
RemoteObject _widths = null;
RemoteObject _col = RemoteObject.createImmutable(0);
RemoteObject _row = RemoteObject.createImmutable(0);
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlistrizefaktor");
RemoteObject _r = null;
Debug.locals.put("Lst", _lst);
Debug.locals.put("Lst_ColNameTitle", _lst_colnametitle);
Debug.locals.put("N_Col", _n_col);
 BA.debugLineNum = 471;BA.debugLine="Public Sub LoadSListReportRizeBargasht(Lst As List";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 472;BA.debugLine="NumberOfColumns = N_Col";
Debug.ShouldStop(8388608);
__ref.setField ("_numberofcolumns" /*RemoteObject*/ ,_n_col);
 BA.debugLineNum = 473;BA.debugLine="innerClearAll(NumberOfColumns)";
Debug.ShouldStop(16777216);
__ref.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_innerclearall" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_numberofcolumns" /*RemoteObject*/ )));
 BA.debugLineNum = 475;BA.debugLine="Dim headers(NumberOfColumns) As String";
Debug.ShouldStop(67108864);
_headers = RemoteObject.createNewArray ("String", new int[] {__ref.getField(true,"_numberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});Debug.locals.put("headers", _headers);
 BA.debugLineNum = 476;BA.debugLine="Dim Widths(NumberOfColumns) As Int";
Debug.ShouldStop(134217728);
_widths = RemoteObject.createNewArray ("int", new int[] {__ref.getField(true,"_numberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});Debug.locals.put("Widths", _widths);
 BA.debugLineNum = 477;BA.debugLine="Dim col, row As Int";
Debug.ShouldStop(268435456);
_col = RemoteObject.createImmutable(0);Debug.locals.put("col", _col);
_row = RemoteObject.createImmutable(0);Debug.locals.put("row", _row);
 BA.debugLineNum = 478;BA.debugLine="For col = 0 To NumberOfColumns - 1";
Debug.ShouldStop(536870912);
{
final int step6 = 1;
final int limit6 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_numberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = BA.numberCast(int.class, 0) ;
for (;(step6 > 0 && _col.<Integer>get().intValue() <= limit6) || (step6 < 0 && _col.<Integer>get().intValue() >= limit6) ;_col = RemoteObject.createImmutable((int)(0 + _col.<Integer>get().intValue() + step6))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 479;BA.debugLine="headers(col) = Lst_ColNameTitle.get(col)";
Debug.ShouldStop(1073741824);
_headers.setArrayElement (BA.ObjectToString(_lst_colnametitle.runMethod(false,"Get",(Object)(_col))),_col);
 BA.debugLineNum = 480;BA.debugLine="Widths(col) = 162dip";
Debug.ShouldStop(-2147483648);
_widths.setArrayElement (table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 162))),_col);
 }
}Debug.locals.put("col", _col);
;
 BA.debugLineNum = 482;BA.debugLine="SetHeader(headers,Widths)";
Debug.ShouldStop(2);
__ref.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_setheader" /*RemoteObject*/ ,(Object)(_headers),(Object)(_widths));
 BA.debugLineNum = 483;BA.debugLine="SetColumnsWidths(Widths)";
Debug.ShouldStop(4);
__ref.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_setcolumnswidths" /*RemoteObject*/ ,(Object)(_widths));
 BA.debugLineNum = 486;BA.debugLine="For row = 0 To Lst.Size - 1";
Debug.ShouldStop(32);
{
final int step12 = 1;
final int limit12 = RemoteObject.solve(new RemoteObject[] {_lst.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_row = BA.numberCast(int.class, 0) ;
for (;(step12 > 0 && _row.<Integer>get().intValue() <= limit12) || (step12 < 0 && _row.<Integer>get().intValue() >= limit12) ;_row = RemoteObject.createImmutable((int)(0 + _row.<Integer>get().intValue() + step12))  ) {
Debug.locals.put("row", _row);
 BA.debugLineNum = 487;BA.debugLine="Dim Item = Lst.Get(row) As AdapterListRizeFaktor";
Debug.ShouldStop(64);
_item = (_lst.runMethod(false,"Get",(Object)(_row)));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 488;BA.debugLine="Dim r(NumberOfColumns) As String";
Debug.ShouldStop(128);
_r = RemoteObject.createNewArray ("String", new int[] {__ref.getField(true,"_numberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});Debug.locals.put("r", _r);
 BA.debugLineNum = 490;BA.debugLine="r(0) = row+1";
Debug.ShouldStop(512);
_r.setArrayElement (BA.NumberToString(RemoteObject.solve(new RemoteObject[] {_row,RemoteObject.createImmutable(1)}, "+",1, 1)),BA.numberCast(int.class, 0));
 BA.debugLineNum = 492;BA.debugLine="r(1) = Item.fldCodeKala";
Debug.ShouldStop(2048);
_r.setArrayElement (_item.getField(true,"fldCodeKala" /*RemoteObject*/ ),BA.numberCast(int.class, 1));
 BA.debugLineNum = 493;BA.debugLine="r(2) = Item.fldSharhKala";
Debug.ShouldStop(4096);
_r.setArrayElement (_item.getField(true,"fldSharhKala" /*RemoteObject*/ ),BA.numberCast(int.class, 2));
 BA.debugLineNum = 495;BA.debugLine="r(3) = myCode.Is_Null_adad(Item.fldTedadJoz)";
Debug.ShouldStop(16384);
_r.setArrayElement (table._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_item.getField(true,"fldTedadJoz" /*RemoteObject*/ ))),BA.numberCast(int.class, 3));
 BA.debugLineNum = 496;BA.debugLine="r(4) = myCode.Is_Null_adad(Item.fldTedadCarton)";
Debug.ShouldStop(32768);
_r.setArrayElement (table._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_item.getField(true,"fldTedadCarton" /*RemoteObject*/ ))),BA.numberCast(int.class, 4));
 BA.debugLineNum = 497;BA.debugLine="r(5)=Item.FldType";
Debug.ShouldStop(65536);
_r.setArrayElement (_item.getField(true,"FldType" /*RemoteObject*/ ),BA.numberCast(int.class, 5));
 BA.debugLineNum = 498;BA.debugLine="AddRow(r)";
Debug.ShouldStop(131072);
__ref.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_addrow" /*RemoteObject*/ ,(Object)(_r));
 }
}Debug.locals.put("row", _row);
;
 BA.debugLineNum = 500;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadslistreportrizebargashtresult(RemoteObject __ref,RemoteObject _lst,RemoteObject _lst_colnametitle,RemoteObject _n_col) throws Exception{
try {
		Debug.PushSubsStack("LoadSListReportRizeBargashtResult (table) ","table",102,__ref.getField(false, "ba"),__ref,502);
if (RapidSub.canDelegate("loadslistreportrizebargashtresult")) { return __ref.runUserSub(false, "table","loadslistreportrizebargashtresult", __ref, _lst, _lst_colnametitle, _n_col);}
RemoteObject _headers = null;
RemoteObject _widths = null;
RemoteObject _col = RemoteObject.createImmutable(0);
RemoteObject _row = RemoteObject.createImmutable(0);
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlistrizefaktor");
RemoteObject _r = null;
Debug.locals.put("Lst", _lst);
Debug.locals.put("Lst_ColNameTitle", _lst_colnametitle);
Debug.locals.put("N_Col", _n_col);
 BA.debugLineNum = 502;BA.debugLine="Public Sub LoadSListReportRizeBargashtResult(Lst A";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 503;BA.debugLine="NumberOfColumns = N_Col";
Debug.ShouldStop(4194304);
__ref.setField ("_numberofcolumns" /*RemoteObject*/ ,_n_col);
 BA.debugLineNum = 504;BA.debugLine="innerClearAll(NumberOfColumns)";
Debug.ShouldStop(8388608);
__ref.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_innerclearall" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_numberofcolumns" /*RemoteObject*/ )));
 BA.debugLineNum = 506;BA.debugLine="Dim headers(NumberOfColumns) As String";
Debug.ShouldStop(33554432);
_headers = RemoteObject.createNewArray ("String", new int[] {__ref.getField(true,"_numberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});Debug.locals.put("headers", _headers);
 BA.debugLineNum = 507;BA.debugLine="Dim Widths(NumberOfColumns) As Int";
Debug.ShouldStop(67108864);
_widths = RemoteObject.createNewArray ("int", new int[] {__ref.getField(true,"_numberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});Debug.locals.put("Widths", _widths);
 BA.debugLineNum = 508;BA.debugLine="Dim col, row As Int";
Debug.ShouldStop(134217728);
_col = RemoteObject.createImmutable(0);Debug.locals.put("col", _col);
_row = RemoteObject.createImmutable(0);Debug.locals.put("row", _row);
 BA.debugLineNum = 509;BA.debugLine="For col = 0 To NumberOfColumns - 1";
Debug.ShouldStop(268435456);
{
final int step6 = 1;
final int limit6 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_numberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = BA.numberCast(int.class, 0) ;
for (;(step6 > 0 && _col.<Integer>get().intValue() <= limit6) || (step6 < 0 && _col.<Integer>get().intValue() >= limit6) ;_col = RemoteObject.createImmutable((int)(0 + _col.<Integer>get().intValue() + step6))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 510;BA.debugLine="headers(col) = Lst_ColNameTitle.get(col)";
Debug.ShouldStop(536870912);
_headers.setArrayElement (BA.ObjectToString(_lst_colnametitle.runMethod(false,"Get",(Object)(_col))),_col);
 BA.debugLineNum = 511;BA.debugLine="Widths(col) = 162dip";
Debug.ShouldStop(1073741824);
_widths.setArrayElement (table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 162))),_col);
 }
}Debug.locals.put("col", _col);
;
 BA.debugLineNum = 513;BA.debugLine="SetHeader(headers,Widths)";
Debug.ShouldStop(1);
__ref.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_setheader" /*RemoteObject*/ ,(Object)(_headers),(Object)(_widths));
 BA.debugLineNum = 514;BA.debugLine="SetColumnsWidths(Widths)";
Debug.ShouldStop(2);
__ref.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_setcolumnswidths" /*RemoteObject*/ ,(Object)(_widths));
 BA.debugLineNum = 517;BA.debugLine="For row = 0 To Lst.Size - 1";
Debug.ShouldStop(16);
{
final int step12 = 1;
final int limit12 = RemoteObject.solve(new RemoteObject[] {_lst.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_row = BA.numberCast(int.class, 0) ;
for (;(step12 > 0 && _row.<Integer>get().intValue() <= limit12) || (step12 < 0 && _row.<Integer>get().intValue() >= limit12) ;_row = RemoteObject.createImmutable((int)(0 + _row.<Integer>get().intValue() + step12))  ) {
Debug.locals.put("row", _row);
 BA.debugLineNum = 518;BA.debugLine="Dim Item = Lst.Get(row) As AdapterListRizeFaktor";
Debug.ShouldStop(32);
_item = (_lst.runMethod(false,"Get",(Object)(_row)));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 519;BA.debugLine="Dim r(NumberOfColumns) As String";
Debug.ShouldStop(64);
_r = RemoteObject.createNewArray ("String", new int[] {__ref.getField(true,"_numberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});Debug.locals.put("r", _r);
 BA.debugLineNum = 521;BA.debugLine="r(0) = row+1";
Debug.ShouldStop(256);
_r.setArrayElement (BA.NumberToString(RemoteObject.solve(new RemoteObject[] {_row,RemoteObject.createImmutable(1)}, "+",1, 1)),BA.numberCast(int.class, 0));
 BA.debugLineNum = 522;BA.debugLine="r(1) = Item.fldCodeKala";
Debug.ShouldStop(512);
_r.setArrayElement (_item.getField(true,"fldCodeKala" /*RemoteObject*/ ),BA.numberCast(int.class, 1));
 BA.debugLineNum = 523;BA.debugLine="r(2) = Item.fldSharhKala";
Debug.ShouldStop(1024);
_r.setArrayElement (_item.getField(true,"fldSharhKala" /*RemoteObject*/ ),BA.numberCast(int.class, 2));
 BA.debugLineNum = 525;BA.debugLine="r(3) = myCode.Is_Null_adad(Item.fldTedadJoz)";
Debug.ShouldStop(4096);
_r.setArrayElement (table._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_item.getField(true,"fldTedadJoz" /*RemoteObject*/ ))),BA.numberCast(int.class, 3));
 BA.debugLineNum = 526;BA.debugLine="r(4) = myCode.Is_Null_adad(Item.fldTedadCarton)";
Debug.ShouldStop(8192);
_r.setArrayElement (table._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_item.getField(true,"fldTedadCarton" /*RemoteObject*/ ))),BA.numberCast(int.class, 4));
 BA.debugLineNum = 527;BA.debugLine="r(5) = \"مانده\"";
Debug.ShouldStop(16384);
_r.setArrayElement (BA.ObjectToString("مانده"),BA.numberCast(int.class, 5));
 BA.debugLineNum = 528;BA.debugLine="AddRow(r)";
Debug.ShouldStop(32768);
__ref.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_addrow" /*RemoteObject*/ ,(Object)(_r));
 }
}Debug.locals.put("row", _row);
;
 BA.debugLineNum = 530;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadslistrizfactorhavale(RemoteObject __ref,RemoteObject _lst,RemoteObject _lst_colnametitle,RemoteObject _n_col) throws Exception{
try {
		Debug.PushSubsStack("LoadSListRizFactorHavale (table) ","table",102,__ref.getField(false, "ba"),__ref,532);
if (RapidSub.canDelegate("loadslistrizfactorhavale")) { return __ref.runUserSub(false, "table","loadslistrizfactorhavale", __ref, _lst, _lst_colnametitle, _n_col);}
RemoteObject _headers = null;
RemoteObject _widths = null;
RemoteObject _col = RemoteObject.createImmutable(0);
RemoteObject _row = RemoteObject.createImmutable(0);
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterizfactorhavale");
RemoteObject _r = null;
Debug.locals.put("Lst", _lst);
Debug.locals.put("Lst_ColNameTitle", _lst_colnametitle);
Debug.locals.put("N_Col", _n_col);
 BA.debugLineNum = 532;BA.debugLine="Public Sub LoadSListRizFactorHavale(Lst As List,Ls";
Debug.ShouldStop(524288);
 BA.debugLineNum = 533;BA.debugLine="NumberOfColumns = N_Col";
Debug.ShouldStop(1048576);
__ref.setField ("_numberofcolumns" /*RemoteObject*/ ,_n_col);
 BA.debugLineNum = 534;BA.debugLine="innerClearAll(NumberOfColumns)";
Debug.ShouldStop(2097152);
__ref.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_innerclearall" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_numberofcolumns" /*RemoteObject*/ )));
 BA.debugLineNum = 536;BA.debugLine="Dim headers(NumberOfColumns) As String";
Debug.ShouldStop(8388608);
_headers = RemoteObject.createNewArray ("String", new int[] {__ref.getField(true,"_numberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});Debug.locals.put("headers", _headers);
 BA.debugLineNum = 537;BA.debugLine="Dim Widths(NumberOfColumns) As Int";
Debug.ShouldStop(16777216);
_widths = RemoteObject.createNewArray ("int", new int[] {__ref.getField(true,"_numberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});Debug.locals.put("Widths", _widths);
 BA.debugLineNum = 538;BA.debugLine="Dim col, row As Int";
Debug.ShouldStop(33554432);
_col = RemoteObject.createImmutable(0);Debug.locals.put("col", _col);
_row = RemoteObject.createImmutable(0);Debug.locals.put("row", _row);
 BA.debugLineNum = 539;BA.debugLine="For col = 0 To NumberOfColumns - 1";
Debug.ShouldStop(67108864);
{
final int step6 = 1;
final int limit6 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_numberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = BA.numberCast(int.class, 0) ;
for (;(step6 > 0 && _col.<Integer>get().intValue() <= limit6) || (step6 < 0 && _col.<Integer>get().intValue() >= limit6) ;_col = RemoteObject.createImmutable((int)(0 + _col.<Integer>get().intValue() + step6))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 540;BA.debugLine="headers(col) = Lst_ColNameTitle.get(col)";
Debug.ShouldStop(134217728);
_headers.setArrayElement (BA.ObjectToString(_lst_colnametitle.runMethod(false,"Get",(Object)(_col))),_col);
 BA.debugLineNum = 541;BA.debugLine="Widths(col) = 162dip";
Debug.ShouldStop(268435456);
_widths.setArrayElement (table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 162))),_col);
 }
}Debug.locals.put("col", _col);
;
 BA.debugLineNum = 543;BA.debugLine="SetHeader(headers,Widths)";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_setheader" /*RemoteObject*/ ,(Object)(_headers),(Object)(_widths));
 BA.debugLineNum = 544;BA.debugLine="SetColumnsWidths(Widths)";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_setcolumnswidths" /*RemoteObject*/ ,(Object)(_widths));
 BA.debugLineNum = 547;BA.debugLine="For row = 0 To Lst.Size - 1";
Debug.ShouldStop(4);
{
final int step12 = 1;
final int limit12 = RemoteObject.solve(new RemoteObject[] {_lst.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_row = BA.numberCast(int.class, 0) ;
for (;(step12 > 0 && _row.<Integer>get().intValue() <= limit12) || (step12 < 0 && _row.<Integer>get().intValue() >= limit12) ;_row = RemoteObject.createImmutable((int)(0 + _row.<Integer>get().intValue() + step12))  ) {
Debug.locals.put("row", _row);
 BA.debugLineNum = 548;BA.debugLine="Dim Item = Lst.Get(row) As AdapteRizFactorHavale";
Debug.ShouldStop(8);
_item = (_lst.runMethod(false,"Get",(Object)(_row)));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 549;BA.debugLine="Dim r(NumberOfColumns) As String";
Debug.ShouldStop(16);
_r = RemoteObject.createNewArray ("String", new int[] {__ref.getField(true,"_numberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});Debug.locals.put("r", _r);
 BA.debugLineNum = 551;BA.debugLine="r(0) = row+1";
Debug.ShouldStop(64);
_r.setArrayElement (BA.NumberToString(RemoteObject.solve(new RemoteObject[] {_row,RemoteObject.createImmutable(1)}, "+",1, 1)),BA.numberCast(int.class, 0));
 BA.debugLineNum = 553;BA.debugLine="r(1) = Item.fldSharhKala";
Debug.ShouldStop(256);
_r.setArrayElement (_item.getField(true,"fldSharhKala" /*RemoteObject*/ ),BA.numberCast(int.class, 1));
 BA.debugLineNum = 554;BA.debugLine="r(2) = Item.fldCodeKala";
Debug.ShouldStop(512);
_r.setArrayElement (_item.getField(true,"fldCodeKala" /*RemoteObject*/ ),BA.numberCast(int.class, 2));
 BA.debugLineNum = 556;BA.debugLine="r(3) = NumberFormat(Item.fldFeeJoz	,1,3)";
Debug.ShouldStop(2048);
_r.setArrayElement (table.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _item.getField(true,"fldFeeJoz" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),BA.numberCast(int.class, 3));
 BA.debugLineNum = 557;BA.debugLine="r(4) = NumberFormat(Item.fldFeeYekCarton,1,3)";
Debug.ShouldStop(4096);
_r.setArrayElement (table.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _item.getField(true,"fldFeeYekCarton" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),BA.numberCast(int.class, 4));
 BA.debugLineNum = 560;BA.debugLine="If Item.fldMablaghTakhfif>0 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _item.getField(true,"fldMablaghTakhfif" /*RemoteObject*/ )),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 561;BA.debugLine="r(5) = NumberFormat(Item.fldMablaghTakhfif,1,3)";
Debug.ShouldStop(65536);
_r.setArrayElement (table.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _item.getField(true,"fldMablaghTakhfif" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),BA.numberCast(int.class, 5));
 BA.debugLineNum = 562;BA.debugLine="r(6) =Item.fldDarsadTakhfif";
Debug.ShouldStop(131072);
_r.setArrayElement (_item.getField(true,"fldDarsadTakhfif" /*RemoteObject*/ ),BA.numberCast(int.class, 6));
 }else {
 BA.debugLineNum = 564;BA.debugLine="r(5) =0";
Debug.ShouldStop(524288);
_r.setArrayElement (BA.NumberToString(0),BA.numberCast(int.class, 5));
 BA.debugLineNum = 565;BA.debugLine="r(6) =0";
Debug.ShouldStop(1048576);
_r.setArrayElement (BA.NumberToString(0),BA.numberCast(int.class, 6));
 };
 BA.debugLineNum = 568;BA.debugLine="r(7) = Item.fldTedadJoz";
Debug.ShouldStop(8388608);
_r.setArrayElement (_item.getField(true,"fldTedadJoz" /*RemoteObject*/ ),BA.numberCast(int.class, 7));
 BA.debugLineNum = 569;BA.debugLine="r(8) = Item.fldTedadCarton";
Debug.ShouldStop(16777216);
_r.setArrayElement (_item.getField(true,"fldTedadCarton" /*RemoteObject*/ ),BA.numberCast(int.class, 8));
 BA.debugLineNum = 571;BA.debugLine="r(9) = Item.fldCodeAnbar";
Debug.ShouldStop(67108864);
_r.setArrayElement (_item.getField(true,"fldCodeAnbar" /*RemoteObject*/ ),BA.numberCast(int.class, 9));
 BA.debugLineNum = 572;BA.debugLine="r(10) = Item.fldCodeVasete";
Debug.ShouldStop(134217728);
_r.setArrayElement (_item.getField(true,"fldCodeVasete" /*RemoteObject*/ ),BA.numberCast(int.class, 10));
 BA.debugLineNum = 573;BA.debugLine="r(11) = Item.fldC_Ranandeh";
Debug.ShouldStop(268435456);
_r.setArrayElement (_item.getField(true,"fldC_Ranandeh" /*RemoteObject*/ ),BA.numberCast(int.class, 11));
 BA.debugLineNum = 574;BA.debugLine="r(12) = Item.fldN_Ranandeh";
Debug.ShouldStop(536870912);
_r.setArrayElement (_item.getField(true,"fldN_Ranandeh" /*RemoteObject*/ ),BA.numberCast(int.class, 12));
 BA.debugLineNum = 576;BA.debugLine="AddRow(r)";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_addrow" /*RemoteObject*/ ,(Object)(_r));
 }
}Debug.locals.put("row", _row);
;
 BA.debugLineNum = 578;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadslistsoorathesab(RemoteObject __ref,RemoteObject _lst,RemoteObject _lst_colnametitle,RemoteObject _n_col) throws Exception{
try {
		Debug.PushSubsStack("LoadSListSoorathesab (table) ","table",102,__ref.getField(false, "ba"),__ref,616);
if (RapidSub.canDelegate("loadslistsoorathesab")) { return __ref.runUserSub(false, "table","loadslistsoorathesab", __ref, _lst, _lst_colnametitle, _n_col);}
RemoteObject _headers = null;
RemoteObject _widths = null;
RemoteObject _col = RemoteObject.createImmutable(0);
RemoteObject _row = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterreportsoorathesab");
RemoteObject _fldmande = RemoteObject.createImmutable("");
RemoteObject _fldbestankar = RemoteObject.createImmutable("");
RemoteObject _fldbedehkar = RemoteObject.createImmutable("");
Debug.locals.put("Lst", _lst);
Debug.locals.put("Lst_ColNameTitle", _lst_colnametitle);
Debug.locals.put("N_Col", _n_col);
 BA.debugLineNum = 616;BA.debugLine="Sub LoadSListSoorathesab(Lst As List,Lst_ColNameTi";
Debug.ShouldStop(128);
 BA.debugLineNum = 617;BA.debugLine="NumberOfColumns = N_Col";
Debug.ShouldStop(256);
__ref.setField ("_numberofcolumns" /*RemoteObject*/ ,_n_col);
 BA.debugLineNum = 618;BA.debugLine="innerClearAll(NumberOfColumns)";
Debug.ShouldStop(512);
__ref.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_innerclearall" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_numberofcolumns" /*RemoteObject*/ )));
 BA.debugLineNum = 620;BA.debugLine="Dim headers(NumberOfColumns) As String";
Debug.ShouldStop(2048);
_headers = RemoteObject.createNewArray ("String", new int[] {__ref.getField(true,"_numberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});Debug.locals.put("headers", _headers);
 BA.debugLineNum = 621;BA.debugLine="Dim Widths(NumberOfColumns) As Int";
Debug.ShouldStop(4096);
_widths = RemoteObject.createNewArray ("int", new int[] {__ref.getField(true,"_numberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});Debug.locals.put("Widths", _widths);
 BA.debugLineNum = 622;BA.debugLine="Dim col, row As Int";
Debug.ShouldStop(8192);
_col = RemoteObject.createImmutable(0);Debug.locals.put("col", _col);
_row = RemoteObject.createImmutable(0);Debug.locals.put("row", _row);
 BA.debugLineNum = 623;BA.debugLine="For col = 0 To NumberOfColumns - 1";
Debug.ShouldStop(16384);
{
final int step6 = 1;
final int limit6 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_numberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = BA.numberCast(int.class, 0) ;
for (;(step6 > 0 && _col.<Integer>get().intValue() <= limit6) || (step6 < 0 && _col.<Integer>get().intValue() >= limit6) ;_col = RemoteObject.createImmutable((int)(0 + _col.<Integer>get().intValue() + step6))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 624;BA.debugLine="headers(col) = Lst_ColNameTitle.get(col)";
Debug.ShouldStop(32768);
_headers.setArrayElement (BA.ObjectToString(_lst_colnametitle.runMethod(false,"Get",(Object)(_col))),_col);
 BA.debugLineNum = 625;BA.debugLine="Widths(col) = 162dip";
Debug.ShouldStop(65536);
_widths.setArrayElement (table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 162))),_col);
 }
}Debug.locals.put("col", _col);
;
 BA.debugLineNum = 627;BA.debugLine="SetHeader(headers,Widths)";
Debug.ShouldStop(262144);
__ref.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_setheader" /*RemoteObject*/ ,(Object)(_headers),(Object)(_widths));
 BA.debugLineNum = 628;BA.debugLine="SetColumnsWidths(Widths)";
Debug.ShouldStop(524288);
__ref.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_setcolumnswidths" /*RemoteObject*/ ,(Object)(_widths));
 BA.debugLineNum = 639;BA.debugLine="For i=0 To Lst.Size-1";
Debug.ShouldStop(1073741824);
{
final int step12 = 1;
final int limit12 = RemoteObject.solve(new RemoteObject[] {_lst.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step12 > 0 && _i <= limit12) || (step12 < 0 && _i >= limit12) ;_i = ((int)(0 + _i + step12))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 640;BA.debugLine="Dim Item = Lst.Get(i) As AdapterReportSooratHesa";
Debug.ShouldStop(-2147483648);
_item = (_lst.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 641;BA.debugLine="Dim fldMande As String";
Debug.ShouldStop(1);
_fldmande = RemoteObject.createImmutable("");Debug.locals.put("fldMande", _fldmande);
 BA.debugLineNum = 642;BA.debugLine="Dim fldBestankar As String";
Debug.ShouldStop(2);
_fldbestankar = RemoteObject.createImmutable("");Debug.locals.put("fldBestankar", _fldbestankar);
 BA.debugLineNum = 643;BA.debugLine="Dim fldBedehkar As String";
Debug.ShouldStop(4);
_fldbedehkar = RemoteObject.createImmutable("");Debug.locals.put("fldBedehkar", _fldbedehkar);
 BA.debugLineNum = 645;BA.debugLine="If Item.fldMande<>Null Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("N",_item.getField(true,"fldMande" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 646;BA.debugLine="fldMande=NumberFormat(Item.fldMande,1,3)";
Debug.ShouldStop(32);
_fldmande = table.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _item.getField(true,"fldMande" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3)));Debug.locals.put("fldMande", _fldmande);
 }else {
 BA.debugLineNum = 648;BA.debugLine="fldMande=0";
Debug.ShouldStop(128);
_fldmande = BA.NumberToString(0);Debug.locals.put("fldMande", _fldmande);
 };
 BA.debugLineNum = 651;BA.debugLine="If Item.fldBestankar<>Null Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("N",_item.getField(true,"fldBestankar" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 652;BA.debugLine="fldBestankar=NumberFormat(Item.fldBestankar,1,3";
Debug.ShouldStop(2048);
_fldbestankar = table.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _item.getField(true,"fldBestankar" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3)));Debug.locals.put("fldBestankar", _fldbestankar);
 }else {
 BA.debugLineNum = 654;BA.debugLine="fldBestankar=0";
Debug.ShouldStop(8192);
_fldbestankar = BA.NumberToString(0);Debug.locals.put("fldBestankar", _fldbestankar);
 };
 BA.debugLineNum = 657;BA.debugLine="If Item.fldBedehkar<>Null Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("N",_item.getField(true,"fldBedehkar" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 658;BA.debugLine="fldBedehkar=NumberFormat(Item.fldBedehkar,1,3)";
Debug.ShouldStop(131072);
_fldbedehkar = table.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _item.getField(true,"fldBedehkar" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3)));Debug.locals.put("fldBedehkar", _fldbedehkar);
 }else {
 BA.debugLineNum = 660;BA.debugLine="fldBedehkar=0";
Debug.ShouldStop(524288);
_fldbedehkar = BA.NumberToString(0);Debug.locals.put("fldBedehkar", _fldbedehkar);
 };
 BA.debugLineNum = 664;BA.debugLine="AddRow(Array As String (fldMande,fldBestankar,fl";
Debug.ShouldStop(8388608);
__ref.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_addrow" /*RemoteObject*/ ,(Object)(RemoteObject.createNewArray("String",new int[] {9},new Object[] {_fldmande,_fldbestankar,_fldbedehkar,_item.getField(true,"fldDate" /*RemoteObject*/ ),_item.getField(true,"fldRiz" /*RemoteObject*/ ),_item.getField(true,"fldSharh" /*RemoteObject*/ ),_item.getField(true,"fldSanad" /*RemoteObject*/ ),_item.getField(true,"shomare" /*RemoteObject*/ ),_item.getField(true,"fldRadif" /*RemoteObject*/ )})));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 671;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(1073741824);
table.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 673;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadslistvisitor(RemoteObject __ref,RemoteObject _lst,RemoteObject _lst_colnametitle,RemoteObject _n_col) throws Exception{
try {
		Debug.PushSubsStack("LoadSListVisitor (table) ","table",102,__ref.getField(false, "ba"),__ref,580);
if (RapidSub.canDelegate("loadslistvisitor")) { return __ref.runUserSub(false, "table","loadslistvisitor", __ref, _lst, _lst_colnametitle, _n_col);}
RemoteObject _headers = null;
RemoteObject _widths = null;
RemoteObject _col = RemoteObject.createImmutable(0);
RemoteObject _row = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterreportvisitor");
Debug.locals.put("Lst", _lst);
Debug.locals.put("Lst_ColNameTitle", _lst_colnametitle);
Debug.locals.put("N_Col", _n_col);
 BA.debugLineNum = 580;BA.debugLine="Sub LoadSListVisitor(Lst As List,Lst_ColNameTitle";
Debug.ShouldStop(8);
 BA.debugLineNum = 581;BA.debugLine="NumberOfColumns = N_Col";
Debug.ShouldStop(16);
__ref.setField ("_numberofcolumns" /*RemoteObject*/ ,_n_col);
 BA.debugLineNum = 582;BA.debugLine="innerClearAll(NumberOfColumns)";
Debug.ShouldStop(32);
__ref.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_innerclearall" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_numberofcolumns" /*RemoteObject*/ )));
 BA.debugLineNum = 584;BA.debugLine="Dim headers(NumberOfColumns) As String";
Debug.ShouldStop(128);
_headers = RemoteObject.createNewArray ("String", new int[] {__ref.getField(true,"_numberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});Debug.locals.put("headers", _headers);
 BA.debugLineNum = 585;BA.debugLine="Dim Widths(NumberOfColumns) As Int";
Debug.ShouldStop(256);
_widths = RemoteObject.createNewArray ("int", new int[] {__ref.getField(true,"_numberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});Debug.locals.put("Widths", _widths);
 BA.debugLineNum = 586;BA.debugLine="Dim col, row As Int";
Debug.ShouldStop(512);
_col = RemoteObject.createImmutable(0);Debug.locals.put("col", _col);
_row = RemoteObject.createImmutable(0);Debug.locals.put("row", _row);
 BA.debugLineNum = 587;BA.debugLine="For col = 0 To NumberOfColumns - 1";
Debug.ShouldStop(1024);
{
final int step6 = 1;
final int limit6 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_numberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = BA.numberCast(int.class, 0) ;
for (;(step6 > 0 && _col.<Integer>get().intValue() <= limit6) || (step6 < 0 && _col.<Integer>get().intValue() >= limit6) ;_col = RemoteObject.createImmutable((int)(0 + _col.<Integer>get().intValue() + step6))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 588;BA.debugLine="headers(col) = Lst_ColNameTitle.get(col)";
Debug.ShouldStop(2048);
_headers.setArrayElement (BA.ObjectToString(_lst_colnametitle.runMethod(false,"Get",(Object)(_col))),_col);
 BA.debugLineNum = 589;BA.debugLine="Widths(col) = 162dip";
Debug.ShouldStop(4096);
_widths.setArrayElement (table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 162))),_col);
 }
}Debug.locals.put("col", _col);
;
 BA.debugLineNum = 591;BA.debugLine="SetHeader(headers,Widths)";
Debug.ShouldStop(16384);
__ref.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_setheader" /*RemoteObject*/ ,(Object)(_headers),(Object)(_widths));
 BA.debugLineNum = 592;BA.debugLine="SetColumnsWidths(Widths)";
Debug.ShouldStop(32768);
__ref.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_setcolumnswidths" /*RemoteObject*/ ,(Object)(_widths));
 BA.debugLineNum = 603;BA.debugLine="For i=0 To Lst.Size-1";
Debug.ShouldStop(67108864);
{
final int step12 = 1;
final int limit12 = RemoteObject.solve(new RemoteObject[] {_lst.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step12 > 0 && _i <= limit12) || (step12 < 0 && _i >= limit12) ;_i = ((int)(0 + _i + step12))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 604;BA.debugLine="Dim Item = Lst.Get(i) As AdapterReportVisitor";
Debug.ShouldStop(134217728);
_item = (_lst.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 605;BA.debugLine="AddRow(Array As String (NumberFormat(Item.fldFee";
Debug.ShouldStop(268435456);
__ref.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_addrow" /*RemoteObject*/ ,(Object)(RemoteObject.createNewArray("String",new int[] {6},new Object[] {table.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _item.getField(true,"fldFeeJoz" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),_item.getField(true,"fldCount" /*RemoteObject*/ ),_item.getField(true,"fldTedadKol" /*RemoteObject*/ ),_item.getField(true,"fldTedadCarton" /*RemoteObject*/ ),_item.getField(true,"fldTedadJoz" /*RemoteObject*/ ),_item.getField(true,"fldSharhKala" /*RemoteObject*/ )})));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 612;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(8);
table.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 614;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadsqlitedb(RemoteObject __ref,RemoteObject _dir,RemoteObject _filename,RemoteObject _sqlite,RemoteObject _query) throws Exception{
try {
		Debug.PushSubsStack("LoadSQLiteDB (table) ","table",102,__ref.getField(false, "ba"),__ref,352);
if (RapidSub.canDelegate("loadsqlitedb")) { return __ref.runUserSub(false, "table","loadsqlitedb", __ref, _dir, _filename, _sqlite, _query);}
RemoteObject _curs = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _headers = null;
RemoteObject _widths = null;
RemoteObject _col = RemoteObject.createImmutable(0);
RemoteObject _row = RemoteObject.createImmutable(0);
RemoteObject _r = null;
Debug.locals.put("Dir", _dir);
Debug.locals.put("Filename", _filename);
Debug.locals.put("SQLite", _sqlite);
Debug.locals.put("Query", _query);
 BA.debugLineNum = 352;BA.debugLine="Public Sub LoadSQLiteDB(Dir As String, Filename As";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 353;BA.debugLine="If File.Exists(Dir, Filename) = False Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",table.__c.getField(false,"File").runMethod(true,"Exists",(Object)(_dir),(Object)(_filename)),table.__c.getField(true,"False"))) { 
 BA.debugLineNum = 354;BA.debugLine="ToastMessageShow(\"This file : \" & Filename & \" d";
Debug.ShouldStop(2);
table.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("This file : "),_filename,RemoteObject.createImmutable(" doesn't exist")))),(Object)(table.__c.getField(true,"False")));
 BA.debugLineNum = 355;BA.debugLine="Return";
Debug.ShouldStop(4);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 358;BA.debugLine="Dim Curs As Cursor";
Debug.ShouldStop(32);
_curs = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Curs", _curs);
 BA.debugLineNum = 359;BA.debugLine="Curs = SQLite.ExecQuery(Query)";
Debug.ShouldStop(64);
_curs = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), _sqlite.runMethod(false,"ExecQuery",(Object)(_query)));Debug.locals.put("Curs", _curs);
 BA.debugLineNum = 361;BA.debugLine="NumberOfColumns = Curs.ColumnCount";
Debug.ShouldStop(256);
__ref.setField ("_numberofcolumns" /*RemoteObject*/ ,_curs.runMethod(true,"getColumnCount"));
 BA.debugLineNum = 362;BA.debugLine="innerClearAll(NumberOfColumns)";
Debug.ShouldStop(512);
__ref.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_innerclearall" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_numberofcolumns" /*RemoteObject*/ )));
 BA.debugLineNum = 364;BA.debugLine="Dim headers(NumberOfColumns) As String";
Debug.ShouldStop(2048);
_headers = RemoteObject.createNewArray ("String", new int[] {__ref.getField(true,"_numberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});Debug.locals.put("headers", _headers);
 BA.debugLineNum = 365;BA.debugLine="Dim Widths(NumberOfColumns) As Int";
Debug.ShouldStop(4096);
_widths = RemoteObject.createNewArray ("int", new int[] {__ref.getField(true,"_numberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});Debug.locals.put("Widths", _widths);
 BA.debugLineNum = 366;BA.debugLine="Dim col, row As Int";
Debug.ShouldStop(8192);
_col = RemoteObject.createImmutable(0);Debug.locals.put("col", _col);
_row = RemoteObject.createImmutable(0);Debug.locals.put("row", _row);
 BA.debugLineNum = 367;BA.debugLine="For col = 0 To NumberOfColumns - 1";
Debug.ShouldStop(16384);
{
final int step12 = 1;
final int limit12 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_numberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = BA.numberCast(int.class, 0) ;
for (;(step12 > 0 && _col.<Integer>get().intValue() <= limit12) || (step12 < 0 && _col.<Integer>get().intValue() >= limit12) ;_col = RemoteObject.createImmutable((int)(0 + _col.<Integer>get().intValue() + step12))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 368;BA.debugLine="headers(col) = Curs.GetColumnName(col)";
Debug.ShouldStop(32768);
_headers.setArrayElement (_curs.runMethod(true,"GetColumnName",(Object)(_col)),_col);
 BA.debugLineNum = 369;BA.debugLine="Widths(col) = 162dip";
Debug.ShouldStop(65536);
_widths.setArrayElement (table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 162))),_col);
 }
}Debug.locals.put("col", _col);
;
 BA.debugLineNum = 371;BA.debugLine="SetHeader(headers,Widths)";
Debug.ShouldStop(262144);
__ref.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_setheader" /*RemoteObject*/ ,(Object)(_headers),(Object)(_widths));
 BA.debugLineNum = 372;BA.debugLine="SetColumnsWidths(Widths)";
Debug.ShouldStop(524288);
__ref.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_setcolumnswidths" /*RemoteObject*/ ,(Object)(_widths));
 BA.debugLineNum = 374;BA.debugLine="For row = 0 To Curs.RowCount - 1";
Debug.ShouldStop(2097152);
{
final int step18 = 1;
final int limit18 = RemoteObject.solve(new RemoteObject[] {_curs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_row = BA.numberCast(int.class, 0) ;
for (;(step18 > 0 && _row.<Integer>get().intValue() <= limit18) || (step18 < 0 && _row.<Integer>get().intValue() >= limit18) ;_row = RemoteObject.createImmutable((int)(0 + _row.<Integer>get().intValue() + step18))  ) {
Debug.locals.put("row", _row);
 BA.debugLineNum = 375;BA.debugLine="Dim r(NumberOfColumns) As String";
Debug.ShouldStop(4194304);
_r = RemoteObject.createNewArray ("String", new int[] {__ref.getField(true,"_numberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});Debug.locals.put("r", _r);
 BA.debugLineNum = 376;BA.debugLine="For col = 0 To NumberOfColumns - 1";
Debug.ShouldStop(8388608);
{
final int step20 = 1;
final int limit20 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_numberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = BA.numberCast(int.class, 0) ;
for (;(step20 > 0 && _col.<Integer>get().intValue() <= limit20) || (step20 < 0 && _col.<Integer>get().intValue() >= limit20) ;_col = RemoteObject.createImmutable((int)(0 + _col.<Integer>get().intValue() + step20))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 377;BA.debugLine="Curs.Position = row";
Debug.ShouldStop(16777216);
_curs.runMethod(true,"setPosition",_row);
 BA.debugLineNum = 378;BA.debugLine="r(col) = Curs.GetString2(col)";
Debug.ShouldStop(33554432);
_r.setArrayElement (_curs.runMethod(true,"GetString2",(Object)(_col)),_col);
 }
}Debug.locals.put("col", _col);
;
 BA.debugLineNum = 380;BA.debugLine="AddRow(r)";
Debug.ShouldStop(134217728);
__ref.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_addrow" /*RemoteObject*/ ,(Object)(_r));
 }
}Debug.locals.put("row", _row);
;
 BA.debugLineNum = 383;BA.debugLine="Curs.Close";
Debug.ShouldStop(1073741824);
_curs.runVoidMethod ("Close");
 BA.debugLineNum = 384;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _savetabletocsv(RemoteObject __ref,RemoteObject _dir,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("SaveTableToCSV (table) ","table",102,__ref.getField(false, "ba"),__ref,742);
if (RapidSub.canDelegate("savetabletocsv")) { return __ref.runUserSub(false, "table","savetabletocsv", __ref, _dir, _filename);}
RemoteObject _headers = null;
int _i = 0;
RemoteObject _l = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("Dir", _dir);
Debug.locals.put("Filename", _filename);
 BA.debugLineNum = 742;BA.debugLine="Public Sub SaveTableToCSV(Dir As String, Filename";
Debug.ShouldStop(32);
 BA.debugLineNum = 743;BA.debugLine="Dim headers(NumberOfColumns) As String";
Debug.ShouldStop(64);
_headers = RemoteObject.createNewArray ("String", new int[] {__ref.getField(true,"_numberofcolumns" /*RemoteObject*/ ).<Integer>get().intValue()}, new Object[]{});Debug.locals.put("headers", _headers);
 BA.debugLineNum = 744;BA.debugLine="For i = 0 To headers.Length - 1";
Debug.ShouldStop(128);
{
final int step2 = 1;
final int limit2 = RemoteObject.solve(new RemoteObject[] {_headers.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 745;BA.debugLine="Dim l As Label";
Debug.ShouldStop(256);
_l = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("l", _l);
 BA.debugLineNum = 746;BA.debugLine="l = Header.GetView(i)";
Debug.ShouldStop(512);
_l = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), __ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, _i))).getObject());Debug.locals.put("l", _l);
 BA.debugLineNum = 747;BA.debugLine="headers(i) = l.Text";
Debug.ShouldStop(1024);
_headers.setArrayElement (_l.runMethod(true,"getText"),BA.numberCast(int.class, _i));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 749;BA.debugLine="StringUtils1.SaveCSV2(Dir, Filename, \",\", Data, h";
Debug.ShouldStop(4096);
__ref.getField(false,"_stringutils1" /*RemoteObject*/ ).runVoidMethod ("SaveCSV2",(Object)(_dir),(Object)(_filename),(Object)(BA.ObjectToChar(",")),(Object)(__ref.getField(false,"_data" /*RemoteObject*/ )),(Object)(table.__c.runMethod(false, "ArrayToList", (Object)(_headers))));
 BA.debugLineNum = 750;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _selectrow(RemoteObject __ref,RemoteObject _row) throws Exception{
try {
		Debug.PushSubsStack("SelectRow (table) ","table",102,__ref.getField(false, "ba"),__ref,327);
if (RapidSub.canDelegate("selectrow")) { return __ref.runUserSub(false, "table","selectrow", __ref, _row);}
RemoteObject _prev = RemoteObject.createImmutable(0);
int _col = 0;
Debug.locals.put("Row", _row);
 BA.debugLineNum = 327;BA.debugLine="Private Sub SelectRow(Row As Int)";
Debug.ShouldStop(64);
 BA.debugLineNum = 328;BA.debugLine="Dim prev As Int";
Debug.ShouldStop(128);
_prev = RemoteObject.createImmutable(0);Debug.locals.put("prev", _prev);
 BA.debugLineNum = 329;BA.debugLine="prev = SelectedRow";
Debug.ShouldStop(256);
_prev = __ref.getField(true,"_selectedrow" /*RemoteObject*/ );Debug.locals.put("prev", _prev);
 BA.debugLineNum = 330;BA.debugLine="SelectedRow = Row";
Debug.ShouldStop(512);
__ref.setField ("_selectedrow" /*RemoteObject*/ ,_row);
 BA.debugLineNum = 332;BA.debugLine="If prev > -1 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean(">",_prev,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 333;BA.debugLine="If visibleRows.ContainsKey(prev) Then";
Debug.ShouldStop(4096);
if (__ref.getField(false,"_visiblerows" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_prev))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 334;BA.debugLine="HideRow(prev)";
Debug.ShouldStop(8192);
__ref.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_hiderow" /*RemoteObject*/ ,(Object)(_prev));
 BA.debugLineNum = 335;BA.debugLine="ShowRow(prev)";
Debug.ShouldStop(16384);
__ref.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_showrow" /*RemoteObject*/ ,(Object)(_prev));
 };
 };
 BA.debugLineNum = 338;BA.debugLine="SelectedRow = Row";
Debug.ShouldStop(131072);
__ref.setField ("_selectedrow" /*RemoteObject*/ ,_row);
 BA.debugLineNum = 339;BA.debugLine="For col = 0 To NumberOfColumns - 1";
Debug.ShouldStop(262144);
{
final int step11 = 1;
final int limit11 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_numberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = 0 ;
for (;(step11 > 0 && _col <= limit11) || (step11 < 0 && _col >= limit11) ;_col = ((int)(0 + _col + step11))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 340;BA.debugLine="If visibleRows.ContainsKey(SelectedRow) Then";
Debug.ShouldStop(524288);
if (__ref.getField(false,"_visiblerows" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((__ref.getField(true,"_selectedrow" /*RemoteObject*/ )))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 341;BA.debugLine="HideRow(SelectedRow)";
Debug.ShouldStop(1048576);
__ref.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_hiderow" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_selectedrow" /*RemoteObject*/ )));
 BA.debugLineNum = 342;BA.debugLine="ShowRow(SelectedRow)";
Debug.ShouldStop(2097152);
__ref.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_showrow" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_selectedrow" /*RemoteObject*/ )));
 };
 }
}Debug.locals.put("col", _col);
;
 BA.debugLineNum = 345;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolumnswidths(RemoteObject __ref,RemoteObject _widths) throws Exception{
try {
		Debug.PushSubsStack("SetColumnsWidths (table) ","table",102,__ref.getField(false, "ba"),__ref,47);
if (RapidSub.canDelegate("setcolumnswidths")) { return __ref.runUserSub(false, "table","setcolumnswidths", __ref, _widths);}
RemoteObject _v = RemoteObject.declareNull("anywheresoftware.b4a.objects.ConcreteViewWrapper");
int _i = 0;
RemoteObject _lbls = null;
int _lbl = 0;
Debug.locals.put("Widths", _widths);
 BA.debugLineNum = 47;BA.debugLine="Public Sub SetColumnsWidths(Widths() As Int)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 48;BA.debugLine="Dim v As View";
Debug.ShouldStop(32768);
_v = RemoteObject.createNew ("anywheresoftware.b4a.objects.ConcreteViewWrapper");Debug.locals.put("v", _v);
 BA.debugLineNum = 49;BA.debugLine="For i = 0 To Widths.Length - 1";
Debug.ShouldStop(65536);
{
final int step2 = 1;
final int limit2 = RemoteObject.solve(new RemoteObject[] {_widths.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 50;BA.debugLine="v = Header.GetView(i)";
Debug.ShouldStop(131072);
_v = __ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, _i)));Debug.locals.put("v", _v);
 BA.debugLineNum = 51;BA.debugLine="v.Width = Widths(i) - 1dip";
Debug.ShouldStop(262144);
_v.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_widths.getArrayElement(true,BA.numberCast(int.class, _i)),table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))}, "-",1, 1));
 BA.debugLineNum = 52;BA.debugLine="If i > 0 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean(">",RemoteObject.createImmutable(_i),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 53;BA.debugLine="v.Left = Header.GetView(i-1).Left + Widths(i-1)";
Debug.ShouldStop(1048576);
_v.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "-",1, 1))).runMethod(true,"getLeft"),_widths.getArrayElement(true,RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "-",1, 1))}, "+",1, 1));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 56;BA.debugLine="Header.Width = Header.GetView(Widths.Length - 1).";
Debug.ShouldStop(8388608);
__ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(RemoteObject.solve(new RemoteObject[] {_widths.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1))).runMethod(true,"getLeft"),_widths.getArrayElement(true,RemoteObject.solve(new RemoteObject[] {_widths.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1))}, "+",1, 1));
 BA.debugLineNum = 57;BA.debugLine="SV.Panel.Width = Header.Width";
Debug.ShouldStop(16777216);
__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(false,"getPanel").runMethod(true,"setWidth",__ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(true,"getWidth"));
 BA.debugLineNum = 58;BA.debugLine="Dim lbls() As Label";
Debug.ShouldStop(33554432);
_lbls = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.LabelWrapper", new int[] {0}, new Object[]{});Debug.locals.put("lbls", _lbls);
 BA.debugLineNum = 59;BA.debugLine="For i = 0 To visibleRows.Size - 1";
Debug.ShouldStop(67108864);
{
final int step12 = 1;
final int limit12 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_visiblerows" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step12 > 0 && _i <= limit12) || (step12 < 0 && _i >= limit12) ;_i = ((int)(0 + _i + step12))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 60;BA.debugLine="lbls = visibleRows.GetValueAt(i)";
Debug.ShouldStop(134217728);
_lbls = (__ref.getField(false,"_visiblerows" /*RemoteObject*/ ).runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("lbls", _lbls);
 BA.debugLineNum = 61;BA.debugLine="For lbl = 0 To lbls.Length - 1";
Debug.ShouldStop(268435456);
{
final int step14 = 1;
final int limit14 = RemoteObject.solve(new RemoteObject[] {_lbls.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_lbl = 0 ;
for (;(step14 > 0 && _lbl <= limit14) || (step14 < 0 && _lbl >= limit14) ;_lbl = ((int)(0 + _lbl + step14))  ) {
Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 62;BA.debugLine="lbls(lbl).SetLayout(Header.GetView(lbl).Left, l";
Debug.ShouldStop(536870912);
_lbls.getArrayElement(false,BA.numberCast(int.class, _lbl)).runVoidMethod ("SetLayout",(Object)(__ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, _lbl))).runMethod(true,"getLeft")),(Object)(_lbls.getArrayElement(false,BA.numberCast(int.class, _lbl)).runMethod(true,"getTop")),(Object)(__ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, _lbl))).runMethod(true,"getWidth")),(Object)(__ref.getField(true,"_rowheight" /*RemoteObject*/ )));
 }
}Debug.locals.put("lbl", _lbl);
;
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 66;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setheader(RemoteObject __ref,RemoteObject _values,RemoteObject _width) throws Exception{
try {
		Debug.PushSubsStack("SetHeader (table) ","table",102,__ref.getField(false, "ba"),__ref,255);
if (RapidSub.canDelegate("setheader")) { return __ref.runUserSub(false, "table","setheader", __ref, _values, _width);}
int _i = 0;
RemoteObject _lngwidth = RemoteObject.createImmutable(0);
RemoteObject _l = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("Values", _values);
Debug.locals.put("Width", _width);
 BA.debugLineNum = 255;BA.debugLine="Public Sub SetHeader(Values() As String,Width() As";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 256;BA.debugLine="For I = Header.NumberOfViews - 1 To 0 Step -1";
Debug.ShouldStop(-2147483648);
{
final int step1 = -1;
final int limit1 = 0;
_i = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue() ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
Debug.locals.put("I", _i);
 BA.debugLineNum = 257;BA.debugLine="Header.RemoveViewAt(I)";
Debug.ShouldStop(1);
__ref.getField(false,"_header" /*RemoteObject*/ ).runVoidMethod ("RemoveViewAt",(Object)(BA.numberCast(int.class, _i)));
 }
}Debug.locals.put("I", _i);
;
 BA.debugLineNum = 259;BA.debugLine="Dim LngWidth As Int";
Debug.ShouldStop(4);
_lngwidth = RemoteObject.createImmutable(0);Debug.locals.put("LngWidth", _lngwidth);
 BA.debugLineNum = 260;BA.debugLine="For I = 0 To NumberOfColumns - 1";
Debug.ShouldStop(8);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_numberofcolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("I", _i);
 BA.debugLineNum = 261;BA.debugLine="Dim l As Label";
Debug.ShouldStop(16);
_l = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("l", _l);
 BA.debugLineNum = 262;BA.debugLine="l.Initialize(\"header\")";
Debug.ShouldStop(32);
_l.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("header")));
 BA.debugLineNum = 263;BA.debugLine="l.Gravity = Gravity.CENTER";
Debug.ShouldStop(64);
_l.runMethod(true,"setGravity",table.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 264;BA.debugLine="l.TextSize = FontSize";
Debug.ShouldStop(128);
_l.runMethod(true,"setTextSize",__ref.getField(true,"_fontsize" /*RemoteObject*/ ));
 BA.debugLineNum = 265;BA.debugLine="l.Color = HeaderColor";
Debug.ShouldStop(256);
_l.runVoidMethod ("setColor",__ref.getField(true,"_headercolor" /*RemoteObject*/ ));
 BA.debugLineNum = 266;BA.debugLine="l.TextColor = HeaderFontColor";
Debug.ShouldStop(512);
_l.runMethod(true,"setTextColor",__ref.getField(true,"_headerfontcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 267;BA.debugLine="l.Typeface=Typeface.LoadFromAssets(\"iransansmono";
Debug.ShouldStop(1024);
_l.runMethod(false,"setTypeface",table.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("iransansmonospacednum_bold.ttf"))));
 BA.debugLineNum = 268;BA.debugLine="l.Text = Values(I)";
Debug.ShouldStop(2048);
_l.runMethod(true,"setText",BA.ObjectToCharSequence(_values.getArrayElement(true,BA.numberCast(int.class, _i))));
 BA.debugLineNum = 269;BA.debugLine="l.Tag = I";
Debug.ShouldStop(4096);
_l.runMethod(false,"setTag",RemoteObject.createImmutable((_i)));
 BA.debugLineNum = 271;BA.debugLine="Header.AddView(l, LngWidth, 0, Width(I) - 1dip ,";
Debug.ShouldStop(16384);
__ref.getField(false,"_header" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((_l.getObject())),(Object)(_lngwidth),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_width.getArrayElement(true,BA.numberCast(int.class, _i)),table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))}, "-",1, 1)),(Object)(__ref.getField(true,"_rowheight" /*RemoteObject*/ )));
 BA.debugLineNum = 272;BA.debugLine="LngWidth=LngWidth+Width(I)";
Debug.ShouldStop(32768);
_lngwidth = RemoteObject.solve(new RemoteObject[] {_lngwidth,_width.getArrayElement(true,BA.numberCast(int.class, _i))}, "+",1, 1);Debug.locals.put("LngWidth", _lngwidth);
 }
}Debug.locals.put("I", _i);
;
 BA.debugLineNum = 274;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setvalue(RemoteObject __ref,RemoteObject _col,RemoteObject _row,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SetValue (table) ","table",102,__ref.getField(false, "ba"),__ref,316);
if (RapidSub.canDelegate("setvalue")) { return __ref.runUserSub(false, "table","setvalue", __ref, _col, _row, _value);}
RemoteObject _values = null;
RemoteObject _lbls = null;
Debug.locals.put("Col", _col);
Debug.locals.put("Row", _row);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 316;BA.debugLine="Public Sub SetValue(Col As Int, Row As Int, Value";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 317;BA.debugLine="Dim values() As String";
Debug.ShouldStop(268435456);
_values = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("values", _values);
 BA.debugLineNum = 318;BA.debugLine="values = Data.Get(Row)";
Debug.ShouldStop(536870912);
_values = (__ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(_row)));Debug.locals.put("values", _values);
 BA.debugLineNum = 319;BA.debugLine="values(Col) = Value";
Debug.ShouldStop(1073741824);
_values.setArrayElement (_value,_col);
 BA.debugLineNum = 320;BA.debugLine="If visibleRows.ContainsKey(Row) Then";
Debug.ShouldStop(-2147483648);
if (__ref.getField(false,"_visiblerows" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_row))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 321;BA.debugLine="Dim lbls() As Label";
Debug.ShouldStop(1);
_lbls = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.LabelWrapper", new int[] {0}, new Object[]{});Debug.locals.put("lbls", _lbls);
 BA.debugLineNum = 322;BA.debugLine="lbls = visibleRows.Get(Row)";
Debug.ShouldStop(2);
_lbls = (__ref.getField(false,"_visiblerows" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_row))));Debug.locals.put("lbls", _lbls);
 BA.debugLineNum = 323;BA.debugLine="lbls(Col).Text = Value";
Debug.ShouldStop(4);
_lbls.getArrayElement(false,_col).runMethod(true,"setText",BA.ObjectToCharSequence(_value));
 };
 BA.debugLineNum = 325;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showrow(RemoteObject __ref,RemoteObject _row) throws Exception{
try {
		Debug.PushSubsStack("ShowRow (table) ","table",102,__ref.getField(false, "ba"),__ref,175);
if (RapidSub.canDelegate("showrow")) { return __ref.runUserSub(false, "table","showrow", __ref, _row);}
RemoteObject _lbls = null;
RemoteObject _values = null;
RemoteObject _rowcolor = null;
int _i = 0;
Debug.locals.put("row", _row);
 BA.debugLineNum = 175;BA.debugLine="Private Sub ShowRow(row As Int)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 176;BA.debugLine="If visibleRows.ContainsKey(row) Then Return";
Debug.ShouldStop(32768);
if (__ref.getField(false,"_visiblerows" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_row))).<Boolean>get().booleanValue()) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 178;BA.debugLine="Dim lbls() As Label";
Debug.ShouldStop(131072);
_lbls = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.LabelWrapper", new int[] {0}, new Object[]{});Debug.locals.put("lbls", _lbls);
 BA.debugLineNum = 179;BA.debugLine="Dim values() As String";
Debug.ShouldStop(262144);
_values = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("values", _values);
 BA.debugLineNum = 180;BA.debugLine="lbls = GetLabels(row)";
Debug.ShouldStop(524288);
_lbls = __ref.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_getlabels" /*RemoteObject*/ ,(Object)(_row));Debug.locals.put("lbls", _lbls);
 BA.debugLineNum = 181;BA.debugLine="values = Data.Get(row)";
Debug.ShouldStop(1048576);
_values = (__ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(_row)));Debug.locals.put("values", _values);
 BA.debugLineNum = 182;BA.debugLine="visibleRows.Put(row, lbls)";
Debug.ShouldStop(2097152);
__ref.getField(false,"_visiblerows" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_row)),(Object)((_lbls)));
 BA.debugLineNum = 183;BA.debugLine="Dim rowColor() As Object";
Debug.ShouldStop(4194304);
_rowcolor = RemoteObject.createNewArray ("Object", new int[] {0}, new Object[]{});Debug.locals.put("rowColor", _rowcolor);
 BA.debugLineNum = 184;BA.debugLine="If row = SelectedRow Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_row,BA.numberCast(double.class, __ref.getField(true,"_selectedrow" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 185;BA.debugLine="rowColor = SelectedDrawable";
Debug.ShouldStop(16777216);
_rowcolor = __ref.getField(false,"_selecteddrawable" /*RemoteObject*/ );Debug.locals.put("rowColor", _rowcolor);
 }else 
{ BA.debugLineNum = 186;BA.debugLine="Else If row Mod 2 = 0 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",RemoteObject.solve(new RemoteObject[] {_row,RemoteObject.createImmutable(2)}, "%",0, 1),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 187;BA.debugLine="rowColor = Drawable1";
Debug.ShouldStop(67108864);
_rowcolor = __ref.getField(false,"_drawable1" /*RemoteObject*/ );Debug.locals.put("rowColor", _rowcolor);
 }else {
 BA.debugLineNum = 189;BA.debugLine="rowColor = Drawable2";
Debug.ShouldStop(268435456);
_rowcolor = __ref.getField(false,"_drawable2" /*RemoteObject*/ );Debug.locals.put("rowColor", _rowcolor);
 }}
;
 BA.debugLineNum = 191;BA.debugLine="For I = 0 To lbls.Length - 1";
Debug.ShouldStop(1073741824);
{
final int step15 = 1;
final int limit15 = RemoteObject.solve(new RemoteObject[] {_lbls.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step15 > 0 && _i <= limit15) || (step15 < 0 && _i >= limit15) ;_i = ((int)(0 + _i + step15))  ) {
Debug.locals.put("I", _i);
 BA.debugLineNum = 192;BA.debugLine="SV.Panel.AddView(lbls(I), Header.GetView(I).Left";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((_lbls.getArrayElement(false,BA.numberCast(int.class, _i)).getObject())),(Object)(__ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, _i))).runMethod(true,"getLeft")),(Object)(RemoteObject.solve(new RemoteObject[] {_row,__ref.getField(true,"_rowheight" /*RemoteObject*/ )}, "*",0, 1)),(Object)(__ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, _i))).runMethod(true,"getWidth")),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_rowheight" /*RemoteObject*/ ),table.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))}, "-",1, 1)));
 BA.debugLineNum = 194;BA.debugLine="lbls(I).Text = values(I)";
Debug.ShouldStop(2);
_lbls.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"setText",BA.ObjectToCharSequence(_values.getArrayElement(true,BA.numberCast(int.class, _i))));
 BA.debugLineNum = 195;BA.debugLine="lbls(I).Background = rowColor(I)";
Debug.ShouldStop(4);
_lbls.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(false,"setBackground",(_rowcolor.getArrayElement(false,BA.numberCast(int.class, _i))));
 }
}Debug.locals.put("I", _i);
;
 BA.debugLineNum = 197;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sv_scrollchanged(RemoteObject __ref,RemoteObject _posx,RemoteObject _posy) throws Exception{
try {
		Debug.PushSubsStack("SV_ScrollChanged (table) ","table",102,__ref.getField(false, "ba"),__ref,104);
if (RapidSub.canDelegate("sv_scrollchanged")) { return __ref.runUserSub(false, "table","sv_scrollchanged", __ref, _posx, _posy);}
RemoteObject _currentmin = RemoteObject.createImmutable(0);
RemoteObject _currentmax = RemoteObject.createImmutable(0);
int _i = 0;
Debug.locals.put("PosX", _posx);
Debug.locals.put("PosY", _posy);
 BA.debugLineNum = 104;BA.debugLine="Private Sub SV_ScrollChanged(PosX As Int, PosY As";
Debug.ShouldStop(128);
 BA.debugLineNum = 105;BA.debugLine="Dim currentMin, currentMax As Int";
Debug.ShouldStop(256);
_currentmin = RemoteObject.createImmutable(0);Debug.locals.put("currentMin", _currentmin);
_currentmax = RemoteObject.createImmutable(0);Debug.locals.put("currentMax", _currentmax);
 BA.debugLineNum = 106;BA.debugLine="currentMin = Max(0, PosY / RowHeight - 30)";
Debug.ShouldStop(512);
_currentmin = BA.numberCast(int.class, table.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_posy,__ref.getField(true,"_rowheight" /*RemoteObject*/ ),RemoteObject.createImmutable(30)}, "/-",1, 0))));Debug.locals.put("currentMin", _currentmin);
 BA.debugLineNum = 107;BA.debugLine="currentMax = Min(Data.Size - 1, (PosY + SV.Height";
Debug.ShouldStop(1024);
_currentmax = BA.numberCast(int.class, table.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1))),(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_posy,__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "+",1, 1)),__ref.getField(true,"_rowheight" /*RemoteObject*/ ),RemoteObject.createImmutable(30)}, "/+",1, 0))));Debug.locals.put("currentMax", _currentmax);
 BA.debugLineNum = 108;BA.debugLine="If minVisibleRow > -1 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_minvisiblerow" /*RemoteObject*/ ),BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 109;BA.debugLine="If minVisibleRow < currentMin Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("<",__ref.getField(true,"_minvisiblerow" /*RemoteObject*/ ),BA.numberCast(double.class, _currentmin))) { 
 BA.debugLineNum = 111;BA.debugLine="For I = minVisibleRow To Min(currentMin - 1, ma";
Debug.ShouldStop(16384);
{
final int step6 = 1;
final int limit6 = (int) (0 + table.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_currentmin,RemoteObject.createImmutable(1)}, "-",1, 1))),(Object)(BA.numberCast(double.class, __ref.getField(true,"_maxvisiblerow" /*RemoteObject*/ )))).<Double>get().doubleValue());
_i = __ref.getField(true,"_minvisiblerow" /*RemoteObject*/ ).<Integer>get().intValue() ;
for (;(step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6) ;_i = ((int)(0 + _i + step6))  ) {
Debug.locals.put("I", _i);
 BA.debugLineNum = 112;BA.debugLine="HideRow(I)";
Debug.ShouldStop(32768);
__ref.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_hiderow" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _i)));
 }
}Debug.locals.put("I", _i);
;
 }else 
{ BA.debugLineNum = 114;BA.debugLine="Else If minVisibleRow > currentMin Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_minvisiblerow" /*RemoteObject*/ ),BA.numberCast(double.class, _currentmin))) { 
 BA.debugLineNum = 116;BA.debugLine="For I = currentMin To Min(minVisibleRow - 1, cu";
Debug.ShouldStop(524288);
{
final int step10 = 1;
final int limit10 = (int) (0 + table.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_minvisiblerow" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1))),(Object)(BA.numberCast(double.class, _currentmax))).<Double>get().doubleValue());
_i = _currentmin.<Integer>get().intValue() ;
for (;(step10 > 0 && _i <= limit10) || (step10 < 0 && _i >= limit10) ;_i = ((int)(0 + _i + step10))  ) {
Debug.locals.put("I", _i);
 BA.debugLineNum = 117;BA.debugLine="ShowRow(I)";
Debug.ShouldStop(1048576);
__ref.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_showrow" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _i)));
 }
}Debug.locals.put("I", _i);
;
 }}
;
 BA.debugLineNum = 120;BA.debugLine="If maxVisibleRow > currentMax Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_maxvisiblerow" /*RemoteObject*/ ),BA.numberCast(double.class, _currentmax))) { 
 BA.debugLineNum = 122;BA.debugLine="For I = maxVisibleRow To Max(currentMax + 1, mi";
Debug.ShouldStop(33554432);
{
final int step15 = -1;
final int limit15 = (int) (0 + table.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_currentmax,RemoteObject.createImmutable(1)}, "+",1, 1))),(Object)(BA.numberCast(double.class, __ref.getField(true,"_minvisiblerow" /*RemoteObject*/ )))).<Double>get().doubleValue());
_i = __ref.getField(true,"_maxvisiblerow" /*RemoteObject*/ ).<Integer>get().intValue() ;
for (;(step15 > 0 && _i <= limit15) || (step15 < 0 && _i >= limit15) ;_i = ((int)(0 + _i + step15))  ) {
Debug.locals.put("I", _i);
 BA.debugLineNum = 123;BA.debugLine="HideRow(I)";
Debug.ShouldStop(67108864);
__ref.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_hiderow" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _i)));
 }
}Debug.locals.put("I", _i);
;
 }else 
{ BA.debugLineNum = 125;BA.debugLine="Else If maxVisibleRow < currentMax Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("<",__ref.getField(true,"_maxvisiblerow" /*RemoteObject*/ ),BA.numberCast(double.class, _currentmax))) { 
 BA.debugLineNum = 127;BA.debugLine="For I = currentMax To Max(maxVisibleRow + 1, cu";
Debug.ShouldStop(1073741824);
{
final int step19 = -1;
final int limit19 = (int) (0 + table.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_maxvisiblerow" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1))),(Object)(BA.numberCast(double.class, _currentmin))).<Double>get().doubleValue());
_i = _currentmax.<Integer>get().intValue() ;
for (;(step19 > 0 && _i <= limit19) || (step19 < 0 && _i >= limit19) ;_i = ((int)(0 + _i + step19))  ) {
Debug.locals.put("I", _i);
 BA.debugLineNum = 128;BA.debugLine="ShowRow(I)";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_showrow" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _i)));
 }
}Debug.locals.put("I", _i);
;
 }}
;
 };
 BA.debugLineNum = 132;BA.debugLine="minVisibleRow = currentMin";
Debug.ShouldStop(8);
__ref.setField ("_minvisiblerow" /*RemoteObject*/ ,_currentmin);
 BA.debugLineNum = 133;BA.debugLine="maxVisibleRow = currentMax";
Debug.ShouldStop(16);
__ref.setField ("_maxvisiblerow" /*RemoteObject*/ ,_currentmax);
 BA.debugLineNum = 134;BA.debugLine="Header.Left = -PosX";
Debug.ShouldStop(32);
__ref.getField(false,"_header" /*RemoteObject*/ ).runMethod(true,"setLeft",BA.numberCast(int.class, -(double) (0 + _posx.<Integer>get().intValue())));
 BA.debugLineNum = 135;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}