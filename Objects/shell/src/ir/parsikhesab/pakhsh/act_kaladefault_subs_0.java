package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class act_kaladefault_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,138);
if (RapidSub.canDelegate("activity_create")) { return ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","activity_create", _firsttime);}
RemoteObject _op = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _op1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 138;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(512);
 BA.debugLineNum = 139;BA.debugLine="Activity.LoadLayout(\"L_KalaDefault_2\")";
Debug.ShouldStop(1024);
act_kaladefault.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("L_KalaDefault_2")),act_kaladefault.mostCurrent.activityBA);
 BA.debugLineNum = 140;BA.debugLine="Try";
Debug.ShouldStop(2048);
try { BA.debugLineNum = 141;BA.debugLine="If FirstTime Then";
Debug.ShouldStop(4096);
if (_firsttime.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 142;BA.debugLine="FeeTip=0";
Debug.ShouldStop(8192);
act_kaladefault._feetip = BA.NumberToString(0);
 BA.debugLineNum = 143;BA.debugLine="MCode.feeTip=0";
Debug.ShouldStop(16384);
act_kaladefault.mostCurrent._mcode._feetip /*RemoteObject*/  = BA.NumberToString(0);
 };
 BA.debugLineNum = 149;BA.debugLine="sidemenu.Initialize(\"sidmenu\")";
Debug.ShouldStop(1048576);
act_kaladefault.mostCurrent._sidemenu.runVoidMethod ("Initialize",act_kaladefault.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("sidmenu")));
 BA.debugLineNum = 150;BA.debugLine="sidemenu.Menu.LoadLayout(\"groupkalamenulyr\")";
Debug.ShouldStop(2097152);
act_kaladefault.mostCurrent._sidemenu.runMethod(false,"getMenu").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("groupkalamenulyr")),act_kaladefault.mostCurrent.activityBA);
 BA.debugLineNum = 151;BA.debugLine="sidemenu.Mode=sidemenu.LEFT";
Debug.ShouldStop(4194304);
act_kaladefault.mostCurrent._sidemenu.runMethod(true,"setMode",act_kaladefault.mostCurrent._sidemenu.getField(true,"LEFT"));
 BA.debugLineNum = 152;BA.debugLine="sidemenu.BehindOffset=33%x";
Debug.ShouldStop(8388608);
act_kaladefault.mostCurrent._sidemenu.runVoidMethod ("setBehindOffset",act_kaladefault.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 33)),act_kaladefault.mostCurrent.activityBA));
 BA.debugLineNum = 153;BA.debugLine="HLVGoroohKala.Initializer(\"HLVGoroohKala\").ListV";
Debug.ShouldStop(16777216);
act_kaladefault.mostCurrent._hlvgoroohkala.runMethod(false,"Initializer",act_kaladefault.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("HLVGoroohKala"))).runMethod(false,"ListView").runVoidMethod ("Build");
 BA.debugLineNum = 154;BA.debugLine="pnlGroup.AddView(HLVGoroohKala,1%x,1%y,65%x,87%y";
Debug.ShouldStop(33554432);
act_kaladefault.mostCurrent._pnlgroup.runVoidMethod ("AddView",(Object)((act_kaladefault.mostCurrent._hlvgoroohkala.getObject())),(Object)(act_kaladefault.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 1)),act_kaladefault.mostCurrent.activityBA)),(Object)(act_kaladefault.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),act_kaladefault.mostCurrent.activityBA)),(Object)(act_kaladefault.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 65)),act_kaladefault.mostCurrent.activityBA)),(Object)(act_kaladefault.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 87)),act_kaladefault.mostCurrent.activityBA)));
 BA.debugLineNum = 156;BA.debugLine="lstSelectedCodeGroupKala.Initialize";
Debug.ShouldStop(134217728);
act_kaladefault.mostCurrent._lstselectedcodegroupkala.runVoidMethod ("Initialize");
 BA.debugLineNum = 157;BA.debugLine="lstGroup1.Initialize";
Debug.ShouldStop(268435456);
act_kaladefault.mostCurrent._lstgroup1.runVoidMethod ("Initialize");
 BA.debugLineNum = 158;BA.debugLine="lstGroup2.Initialize";
Debug.ShouldStop(536870912);
act_kaladefault.mostCurrent._lstgroup2.runVoidMethod ("Initialize");
 BA.debugLineNum = 160;BA.debugLine="HLV.Initializer(\"HLV\").ListView.Build";
Debug.ShouldStop(-2147483648);
act_kaladefault.mostCurrent._hlv.runMethod(false,"Initializer",act_kaladefault.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("HLV"))).runMethod(false,"ListView").runVoidMethod ("Build");
 BA.debugLineNum = 161;BA.debugLine="pnl_HLV.AddView(HLV,0,0,100%x,pnl_HLV.Height)";
Debug.ShouldStop(1);
act_kaladefault.mostCurrent._pnl_hlv.runVoidMethod ("AddView",(Object)((act_kaladefault.mostCurrent._hlv.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_kaladefault.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),act_kaladefault.mostCurrent.activityBA)),(Object)(act_kaladefault.mostCurrent._pnl_hlv.runMethod(true,"getHeight")));
 BA.debugLineNum = 162;BA.debugLine="Key.Initialize(\"Key\")";
Debug.ShouldStop(2);
act_kaladefault.mostCurrent._key.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("Key")));
 BA.debugLineNum = 163;BA.debugLine="Key.SetCustomFilter(txtFee,txtFee.INPUT_TYPE_NUM";
Debug.ShouldStop(4);
act_kaladefault.mostCurrent._key.runVoidMethod ("SetCustomFilter",(Object)((act_kaladefault.mostCurrent._txtfee.getObject())),(Object)(act_kaladefault.mostCurrent._txtfee.getField(true,"INPUT_TYPE_NUMBERS")),(Object)(RemoteObject.createImmutable("0123456789")));
 BA.debugLineNum = 164;BA.debugLine="Key.SetCustomFilter(txtDarsadTakhfif,txtDarsadTa";
Debug.ShouldStop(8);
act_kaladefault.mostCurrent._key.runVoidMethod ("SetCustomFilter",(Object)((act_kaladefault.mostCurrent._txtdarsadtakhfif.getObject())),(Object)(act_kaladefault.mostCurrent._txtdarsadtakhfif.getField(true,"INPUT_TYPE_NUMBERS")),(Object)(RemoteObject.createImmutable("0123456789")));
 BA.debugLineNum = 165;BA.debugLine="If MCode.Action=\"SabtFaktor\" Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",act_kaladefault.mostCurrent._mcode._action /*RemoteObject*/ ,BA.ObjectToString("SabtFaktor"))) { 
 BA.debugLineNum = 166;BA.debugLine="MCode.page = \"KalaDefault\"";
Debug.ShouldStop(32);
act_kaladefault.mostCurrent._mcode._page /*RemoteObject*/  = BA.ObjectToString("KalaDefault");
 BA.debugLineNum = 167;BA.debugLine="lblTitile.Text=\"انتخاب کالا\"";
Debug.ShouldStop(64);
act_kaladefault.mostCurrent._lbltitile.runMethod(true,"setText",BA.ObjectToCharSequence("انتخاب کالا"));
 };
 BA.debugLineNum = 169;BA.debugLine="If MCode.Action=\"SabtMarjooii\" Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",act_kaladefault.mostCurrent._mcode._action /*RemoteObject*/ ,BA.ObjectToString("SabtMarjooii"))) { 
 BA.debugLineNum = 170;BA.debugLine="MCode.page = \"SabtMarjooii\"";
Debug.ShouldStop(512);
act_kaladefault.mostCurrent._mcode._page /*RemoteObject*/  = BA.ObjectToString("SabtMarjooii");
 BA.debugLineNum = 171;BA.debugLine="lblTitile.Text=\"ثبت مرجوعی\"";
Debug.ShouldStop(1024);
act_kaladefault.mostCurrent._lbltitile.runMethod(true,"setText",BA.ObjectToCharSequence("ثبت مرجوعی"));
 };
 BA.debugLineNum = 174;BA.debugLine="If MCode.ArzeshAfzodeEnable=1 Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",act_kaladefault.mostCurrent._mcode._arzeshafzodeenable /*RemoteObject*/ ,BA.NumberToString(1))) { 
 BA.debugLineNum = 175;BA.debugLine="SwArzeshAfzodeEnable.Checked=True";
Debug.ShouldStop(16384);
act_kaladefault.mostCurrent._swarzeshafzodeenable.runMethodAndSync(true,"setChecked",act_kaladefault.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 176;BA.debugLine="lblDarsadArzeshAfzode.Text=$\" ارزش افزوده: ${MC";
Debug.ShouldStop(32768);
act_kaladefault.mostCurrent._lbldarsadarzeshafzode.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable(" ارزش افزوده: "),act_kaladefault.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((act_kaladefault.mostCurrent._mcode._arzeshafzode /*RemoteObject*/ ))),RemoteObject.createImmutable(" %")))));
 BA.debugLineNum = 177;BA.debugLine="lblArzeshAfzode.Text=\"مبلغ ارزش افزوده: 0\"";
Debug.ShouldStop(65536);
act_kaladefault.mostCurrent._lblarzeshafzode.runMethod(true,"setText",BA.ObjectToCharSequence("مبلغ ارزش افزوده: 0"));
 }else {
 BA.debugLineNum = 179;BA.debugLine="SwArzeshAfzodeEnable.Checked=False";
Debug.ShouldStop(262144);
act_kaladefault.mostCurrent._swarzeshafzodeenable.runMethodAndSync(true,"setChecked",act_kaladefault.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 180;BA.debugLine="lblDarsadArzeshAfzode.Text=\"ارزش افزوده: 0 %\"";
Debug.ShouldStop(524288);
act_kaladefault.mostCurrent._lbldarsadarzeshafzode.runMethod(true,"setText",BA.ObjectToCharSequence("ارزش افزوده: 0 %"));
 BA.debugLineNum = 181;BA.debugLine="lblArzeshAfzode.Text=\"مبلغ ارزش افزوده: 0\"";
Debug.ShouldStop(1048576);
act_kaladefault.mostCurrent._lblarzeshafzode.runMethod(true,"setText",BA.ObjectToCharSequence("مبلغ ارزش افزوده: 0"));
 };
 BA.debugLineNum = 185;BA.debugLine="Dialog.Initialize (Activity)";
Debug.ShouldStop(16777216);
act_kaladefault.mostCurrent._dialog.runClassMethod (ir.parsikhesab.pakhsh.b4xdialog.class, "_initialize" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), act_kaladefault.mostCurrent._activity.getObject()));
 BA.debugLineNum = 186;BA.debugLine="ListGoroohKala1.Initialize";
Debug.ShouldStop(33554432);
act_kaladefault.mostCurrent._listgoroohkala1.runVoidMethod ("Initialize");
 BA.debugLineNum = 187;BA.debugLine="OriginalListGoroohKala1.Initialize";
Debug.ShouldStop(67108864);
act_kaladefault.mostCurrent._originallistgoroohkala1.runVoidMethod ("Initialize");
 BA.debugLineNum = 189;BA.debugLine="ListGoroohKala2.Initialize";
Debug.ShouldStop(268435456);
act_kaladefault.mostCurrent._listgoroohkala2.runVoidMethod ("Initialize");
 BA.debugLineNum = 190;BA.debugLine="OriginalListGoroohKala2.Initialize";
Debug.ShouldStop(536870912);
act_kaladefault.mostCurrent._originallistgoroohkala2.runVoidMethod ("Initialize");
 BA.debugLineNum = 192;BA.debugLine="ListGroohKala.Initialize";
Debug.ShouldStop(-2147483648);
act_kaladefault.mostCurrent._listgroohkala.runVoidMethod ("Initialize");
 BA.debugLineNum = 193;BA.debugLine="lstEshantionGroup.Initialize";
Debug.ShouldStop(1);
act_kaladefault.mostCurrent._lsteshantiongroup.runVoidMethod ("Initialize");
 BA.debugLineNum = 194;BA.debugLine="lstEshantionGroupTable.Initialize";
Debug.ShouldStop(2);
act_kaladefault.mostCurrent._lsteshantiongrouptable.runVoidMethod ("Initialize");
 BA.debugLineNum = 195;BA.debugLine="NiceSpinner.Initialize(\"NiceSpinner\")";
Debug.ShouldStop(4);
act_kaladefault.mostCurrent._nicespinner.runVoidMethod ("Initialize",act_kaladefault.processBA,(Object)(RemoteObject.createImmutable("NiceSpinner")));
 BA.debugLineNum = 196;BA.debugLine="NiceSpinner.TextColor = Colors.Black";
Debug.ShouldStop(8);
act_kaladefault.mostCurrent._nicespinner.runMethod(true,"setTextColor",act_kaladefault.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 197;BA.debugLine="NiceSpinner.Gravity = Gravity.CENTER_HORIZONTAL";
Debug.ShouldStop(16);
act_kaladefault.mostCurrent._nicespinner.runMethod(true,"setGravity",act_kaladefault.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL"));
 BA.debugLineNum = 198;BA.debugLine="NiceSpinner.Typeface = Typeface.LoadFromAssets(\"";
Debug.ShouldStop(32);
act_kaladefault.mostCurrent._nicespinner.runMethod(false,"setTypeface",act_kaladefault.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("IRANSansMobile_Medium.ttf"))));
 BA.debugLineNum = 199;BA.debugLine="PnlSpGroup.AddView(NiceSpinner,B4XComboBox1.mBas";
Debug.ShouldStop(64);
act_kaladefault.mostCurrent._pnlspgroup.runVoidMethod ("AddView",(Object)((act_kaladefault.mostCurrent._nicespinner.getObject())),(Object)(act_kaladefault.mostCurrent._b4xcombobox1.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getLeft")),(Object)(act_kaladefault.mostCurrent._b4xcombobox1.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getTop")),(Object)(act_kaladefault.mostCurrent._b4xcombobox1.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(act_kaladefault.mostCurrent._b4xcombobox1.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 200;BA.debugLine="B4XComboBox1.cmbBox.DropdownTextColor=Colors.Bla";
Debug.ShouldStop(128);
act_kaladefault.mostCurrent._b4xcombobox1.getField(false,"_cmbbox" /*RemoteObject*/ ).runMethod(true,"setDropdownTextColor",act_kaladefault.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 201;BA.debugLine="Dim op As ColorDrawable";
Debug.ShouldStop(256);
_op = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("op", _op);
 BA.debugLineNum = 202;BA.debugLine="op.Initialize2(Colors.White,8dip,2dip,Colors.Bla";
Debug.ShouldStop(512);
_op.runVoidMethod ("Initialize2",(Object)(act_kaladefault.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(act_kaladefault.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 8)))),(Object)(act_kaladefault.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(act_kaladefault.mostCurrent.__c.getField(false,"Colors").getField(true,"Black")));
 BA.debugLineNum = 203;BA.debugLine="NiceSpinner.Background=op";
Debug.ShouldStop(1024);
act_kaladefault.mostCurrent._nicespinner.runMethod(false,"setBackground",(_op.getObject()));
 BA.debugLineNum = 205;BA.debugLine="NiceSpinner1.Initialize(\"NiceSpinner1\")";
Debug.ShouldStop(4096);
act_kaladefault.mostCurrent._nicespinner1.runVoidMethod ("Initialize",act_kaladefault.processBA,(Object)(RemoteObject.createImmutable("NiceSpinner1")));
 BA.debugLineNum = 206;BA.debugLine="NiceSpinner1.TextColor = Colors.Black";
Debug.ShouldStop(8192);
act_kaladefault.mostCurrent._nicespinner1.runMethod(true,"setTextColor",act_kaladefault.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 207;BA.debugLine="NiceSpinner1.Gravity = Gravity.CENTER_HORIZONTAL";
Debug.ShouldStop(16384);
act_kaladefault.mostCurrent._nicespinner1.runMethod(true,"setGravity",act_kaladefault.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL"));
 BA.debugLineNum = 208;BA.debugLine="NiceSpinner1.Typeface = Typeface.LoadFromAssets(";
Debug.ShouldStop(32768);
act_kaladefault.mostCurrent._nicespinner1.runMethod(false,"setTypeface",act_kaladefault.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("IRANSansMobile_Medium.ttf"))));
 BA.debugLineNum = 209;BA.debugLine="PnlSpGroup.AddView(NiceSpinner1,B4XComboBox2.mBa";
Debug.ShouldStop(65536);
act_kaladefault.mostCurrent._pnlspgroup.runVoidMethod ("AddView",(Object)((act_kaladefault.mostCurrent._nicespinner1.getObject())),(Object)(act_kaladefault.mostCurrent._b4xcombobox2.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getLeft")),(Object)(act_kaladefault.mostCurrent._b4xcombobox2.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getTop")),(Object)(act_kaladefault.mostCurrent._b4xcombobox2.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(act_kaladefault.mostCurrent._b4xcombobox2.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 211;BA.debugLine="Dim op1 As ColorDrawable";
Debug.ShouldStop(262144);
_op1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("op1", _op1);
 BA.debugLineNum = 212;BA.debugLine="op1.Initialize2(Colors.White,8dip,2dip,Colors.Bl";
Debug.ShouldStop(524288);
_op1.runVoidMethod ("Initialize2",(Object)(act_kaladefault.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(act_kaladefault.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 8)))),(Object)(act_kaladefault.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(act_kaladefault.mostCurrent.__c.getField(false,"Colors").getField(true,"Black")));
 BA.debugLineNum = 213;BA.debugLine="NiceSpinner1.Background=op1";
Debug.ShouldStop(1048576);
act_kaladefault.mostCurrent._nicespinner1.runMethod(false,"setBackground",(_op1.getObject()));
 BA.debugLineNum = 214;BA.debugLine="lstGroup2.Add(\"همه گروه ها\")";
Debug.ShouldStop(2097152);
act_kaladefault.mostCurrent._lstgroup2.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("همه گروه ها"))));
 BA.debugLineNum = 215;BA.debugLine="NiceSpinner1.attachDataSource(lstGroup2)";
Debug.ShouldStop(4194304);
act_kaladefault.mostCurrent._nicespinner1.runVoidMethod ("attachDataSource",(Object)((act_kaladefault.mostCurrent._lstgroup2.getObject())));
 BA.debugLineNum = 219;BA.debugLine="OrginalListKala.Initialize";
Debug.ShouldStop(67108864);
act_kaladefault.mostCurrent._orginallistkala.runVoidMethod ("Initialize");
 BA.debugLineNum = 220;BA.debugLine="ListKalaSp.Initialize";
Debug.ShouldStop(134217728);
act_kaladefault.mostCurrent._listkalasp.runVoidMethod ("Initialize");
 BA.debugLineNum = 221;BA.debugLine="ListKalaTxt.Initialize";
Debug.ShouldStop(268435456);
act_kaladefault.mostCurrent._listkalatxt.runVoidMethod ("Initialize");
 BA.debugLineNum = 223;BA.debugLine="LoadAcSpGroohKala";
Debug.ShouldStop(1073741824);
_loadacspgroohkala();
 BA.debugLineNum = 224;BA.debugLine="LoadListGoroohKala";
Debug.ShouldStop(-2147483648);
_loadlistgoroohkala();
 BA.debugLineNum = 225;BA.debugLine="th.Initialise(\"th\")";
Debug.ShouldStop(1);
act_kaladefault._th.runVoidMethod ("Initialise",act_kaladefault.processBA,(Object)(RemoteObject.createImmutable("th")));
 BA.debugLineNum = 226;BA.debugLine="HLVGoroohKala.CardView.BackgroundColor(0x8aacc8)";
Debug.ShouldStop(2);
act_kaladefault.mostCurrent._hlvgoroohkala.runMethod(false,"CardView").runVoidMethod ("BackgroundColor",(Object)(BA.numberCast(int.class, ((int)0x8aacc8))));
 BA.debugLineNum = 227;BA.debugLine="HLVGoroohKala.Ripple.Color(0x8aacc8)";
Debug.ShouldStop(4);
act_kaladefault.mostCurrent._hlvgoroohkala.runMethod(false,"Ripple").runVoidMethod ("Color",(Object)(BA.numberCast(int.class, ((int)0x8aacc8))));
 BA.debugLineNum = 228;BA.debugLine="HLVGoroohKala.CardView.CardElevation(0dip).Radiu";
Debug.ShouldStop(8);
act_kaladefault.mostCurrent._hlvgoroohkala.runMethod(false,"CardView").runMethod(false,"CardElevation",(Object)(BA.numberCast(float.class, act_kaladefault.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))))).runVoidMethod ("Radius",(Object)(BA.numberCast(float.class, act_kaladefault.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4))))));
 BA.debugLineNum = 231;BA.debugLine="HLVGoroohKala.Show";
Debug.ShouldStop(64);
act_kaladefault.mostCurrent._hlvgoroohkala.runVoidMethodAndSync ("Show");
 BA.debugLineNum = 235;BA.debugLine="HLV.Show";
Debug.ShouldStop(1024);
act_kaladefault.mostCurrent._hlv.runVoidMethodAndSync ("Show");
 BA.debugLineNum = 248;BA.debugLine="ListTasvie.Initialize";
Debug.ShouldStop(8388608);
act_kaladefault.mostCurrent._listtasvie.runVoidMethod ("Initialize");
 BA.debugLineNum = 249;BA.debugLine="BtnShowSumFilterPnl_Click";
Debug.ShouldStop(16777216);
_btnshowsumfilterpnl_click();
 BA.debugLineNum = 251;BA.debugLine="If MCode.EshantionGroup=1 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",act_kaladefault.mostCurrent._mcode._eshantiongroup /*RemoteObject*/ ,BA.NumberToString(1))) { 
 BA.debugLineNum = 252;BA.debugLine="MCode.SaveUpdate(\"Delete from tblEshantionGroup";
Debug.ShouldStop(134217728);
act_kaladefault.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Delete from tblEshantionGroupTemp")));
 };
 BA.debugLineNum = 256;BA.debugLine="Log(MCode.page)";
Debug.ShouldStop(-2147483648);
act_kaladefault.mostCurrent.__c.runVoidMethod ("LogImpl","534406518",act_kaladefault.mostCurrent._mcode._page /*RemoteObject*/ ,0);
 BA.debugLineNum = 257;BA.debugLine="LoadKala";
Debug.ShouldStop(1);
_loadkala();
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e84) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_kaladefault.processBA, e84.toString()); BA.debugLineNum = 259;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4);
act_kaladefault.mostCurrent.__c.runVoidMethod ("LogImpl","534406521",BA.ObjectToString(act_kaladefault.mostCurrent.__c.runMethod(false,"LastException",act_kaladefault.mostCurrent.activityBA)),0);
 BA.debugLineNum = 260;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(8);
act_kaladefault.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_kaladefault.mostCurrent.__c.runMethod(false,"LastException",act_kaladefault.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_kaladefault.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-Activity_Create"))));
 };
 BA.debugLineNum = 263;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_keypress(RemoteObject _keycode) throws Exception{
try {
		Debug.PushSubsStack("Activity_KeyPress (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,1815);
if (RapidSub.canDelegate("activity_keypress")) { return ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","activity_keypress", _keycode);}
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 1815;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 1816;BA.debugLine="If KeyCode=KeyCodes.KEYCODE_ENTER Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, act_kaladefault.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_ENTER")))) { 
 BA.debugLineNum = 1817;BA.debugLine="If TxtSearch.RequestFocus Then";
Debug.ShouldStop(16777216);
if (act_kaladefault.mostCurrent._txtsearch.runMethod(true,"RequestFocus").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1818;BA.debugLine="BtnSearch_Click";
Debug.ShouldStop(33554432);
_btnsearch_click();
 };
 BA.debugLineNum = 1820;BA.debugLine="Return True";
Debug.ShouldStop(134217728);
if (true) return act_kaladefault.mostCurrent.__c.getField(true,"True");
 };
 BA.debugLineNum = 1822;BA.debugLine="If KeyCode=KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, act_kaladefault.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 1823;BA.debugLine="If sidemenu.Visible Then";
Debug.ShouldStop(1073741824);
if (act_kaladefault.mostCurrent._sidemenu.runMethod(true,"getVisible").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1824;BA.debugLine="If MCode.C_LayeKala.Length > 3 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean(">",act_kaladefault.mostCurrent._mcode._c_layekala /*RemoteObject*/ .runMethod(true,"length"),BA.numberCast(double.class, 3))) { 
 BA.debugLineNum = 1825;BA.debugLine="LoadGoroohKalaBack(MCode.C_LayeKala)";
Debug.ShouldStop(1);
_loadgoroohkalaback(act_kaladefault.mostCurrent._mcode._c_layekala /*RemoteObject*/ );
 BA.debugLineNum = 1826;BA.debugLine="Return True";
Debug.ShouldStop(2);
if (true) return act_kaladefault.mostCurrent.__c.getField(true,"True");
 }else {
 BA.debugLineNum = 1828;BA.debugLine="sidemenu.HideMenus";
Debug.ShouldStop(8);
act_kaladefault.mostCurrent._sidemenu.runVoidMethod ("HideMenus");
 BA.debugLineNum = 1829;BA.debugLine="Return True";
Debug.ShouldStop(16);
if (true) return act_kaladefault.mostCurrent.__c.getField(true,"True");
 };
 };
 BA.debugLineNum = 1833;BA.debugLine="If PnlFee.Visible Then";
Debug.ShouldStop(256);
if (act_kaladefault.mostCurrent._pnlfee.runMethod(true,"getVisible").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1834;BA.debugLine="btnClose_Click";
Debug.ShouldStop(512);
_btnclose_click();
 BA.debugLineNum = 1835;BA.debugLine="Return True";
Debug.ShouldStop(1024);
if (true) return act_kaladefault.mostCurrent.__c.getField(true,"True");
 };
 BA.debugLineNum = 1837;BA.debugLine="btn_Back_Click";
Debug.ShouldStop(4096);
_btn_back_click();
 BA.debugLineNum = 1838;BA.debugLine="Return True";
Debug.ShouldStop(8192);
if (true) return act_kaladefault.mostCurrent.__c.getField(true,"True");
 };
 BA.debugLineNum = 1840;BA.debugLine="Return True";
Debug.ShouldStop(32768);
if (true) return act_kaladefault.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 1841;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,570);
if (RapidSub.canDelegate("activity_pause")) { return ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 570;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 572;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,527);
if (RapidSub.canDelegate("activity_resume")) { return ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","activity_resume");}
 BA.debugLineNum = 527;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(16384);
 BA.debugLineNum = 528;BA.debugLine="Try";
Debug.ShouldStop(32768);
try { BA.debugLineNum = 529;BA.debugLine="If MCode.page=\"Show_Image2\" Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",act_kaladefault.mostCurrent._mcode._page /*RemoteObject*/ ,BA.ObjectToString("Show_Image2"))) { 
 BA.debugLineNum = 530;BA.debugLine="If MCode.Action=\"SabtFaktor\" Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",act_kaladefault.mostCurrent._mcode._action /*RemoteObject*/ ,BA.ObjectToString("SabtFaktor"))) { 
 BA.debugLineNum = 531;BA.debugLine="MCode.page = \"KalaDefault\"";
Debug.ShouldStop(262144);
act_kaladefault.mostCurrent._mcode._page /*RemoteObject*/  = BA.ObjectToString("KalaDefault");
 };
 BA.debugLineNum = 533;BA.debugLine="If MCode.Action=\"SabtMarjooii\" Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",act_kaladefault.mostCurrent._mcode._action /*RemoteObject*/ ,BA.ObjectToString("SabtMarjooii"))) { 
 BA.debugLineNum = 534;BA.debugLine="MCode.page = \"SabtMarjooii\"";
Debug.ShouldStop(2097152);
act_kaladefault.mostCurrent._mcode._page /*RemoteObject*/  = BA.ObjectToString("SabtMarjooii");
 };
 BA.debugLineNum = 536;BA.debugLine="Return";
Debug.ShouldStop(8388608);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 538;BA.debugLine="MCode.CreateReportSabad";
Debug.ShouldStop(33554432);
act_kaladefault.mostCurrent._mcode.runVoidMethod ("_createreportsabad" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA);
 BA.debugLineNum = 541;BA.debugLine="If MCode.ManedEtebarEnable Then";
Debug.ShouldStop(268435456);
if (act_kaladefault.mostCurrent._mcode._manedetebarenable /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 542;BA.debugLine="LblMandeEtebar.Text=\"مانده اعتبار : \" & myCode.";
Debug.ShouldStop(536870912);
act_kaladefault.mostCurrent._lblmandeetebar.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("مانده اعتبار : "),act_kaladefault.mostCurrent._mycode.runMethod(true,"_adadtoprice" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(act_kaladefault.mostCurrent._mcode._mandeetebar /*RemoteObject*/ )))));
 }else {
 BA.debugLineNum = 545;BA.debugLine="LblMandeEtebar.Text=\"مانده اعتبار : 0\"";
Debug.ShouldStop(1);
act_kaladefault.mostCurrent._lblmandeetebar.runMethod(true,"setText",BA.ObjectToCharSequence("مانده اعتبار : 0"));
 };
 BA.debugLineNum = 548;BA.debugLine="If MCode.IsConnected=False And MCode.ConnectionS";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",act_kaladefault.mostCurrent._mcode.runMethod(true,"_isconnected" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA),act_kaladefault.mostCurrent.__c.getField(true,"False")) && RemoteObject.solveBoolean("=",act_kaladefault.mostCurrent._mcode._connectionstatus /*RemoteObject*/ ,BA.NumberToString(1))) { 
 BA.debugLineNum = 549;BA.debugLine="ToastMessageShow(\"لطفا ارتباط اینترنت گوشی خود";
Debug.ShouldStop(16);
act_kaladefault.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("لطفا ارتباط اینترنت گوشی خود را بررسی نمایید")),(Object)(act_kaladefault.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 558;BA.debugLine="StartService(FusedLocationService)";
Debug.ShouldStop(8192);
act_kaladefault.mostCurrent.__c.runVoidMethod ("StartService",act_kaladefault.processBA,(Object)((act_kaladefault.mostCurrent._fusedlocationservice.getObject())));
 BA.debugLineNum = 560;BA.debugLine="Log(\"Gps Start\")";
Debug.ShouldStop(32768);
act_kaladefault.mostCurrent.__c.runVoidMethod ("LogImpl","534734113",RemoteObject.createImmutable("Gps Start"),0);
 BA.debugLineNum = 561;BA.debugLine="LoadKala";
Debug.ShouldStop(65536);
_loadkala();
 BA.debugLineNum = 562;BA.debugLine="RefreshLblSabad";
Debug.ShouldStop(131072);
_refreshlblsabad();
 BA.debugLineNum = 563;BA.debugLine="MojavezSefaresh";
Debug.ShouldStop(262144);
_mojavezsefaresh();
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e26) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_kaladefault.processBA, e26.toString()); BA.debugLineNum = 565;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1048576);
act_kaladefault.mostCurrent.__c.runVoidMethod ("LogImpl","534734118",BA.ObjectToString(act_kaladefault.mostCurrent.__c.runMethod(false,"LastException",act_kaladefault.mostCurrent.activityBA)),0);
 BA.debugLineNum = 566;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(2097152);
act_kaladefault.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_kaladefault.mostCurrent.__c.runMethod(false,"LastException",act_kaladefault.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_kaladefault.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-Activity_Resume"))));
 };
 BA.debugLineNum = 568;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addeshantion(RemoteObject _itemsabad) throws Exception{
try {
		Debug.PushSubsStack("AddEshantion (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,2695);
if (RapidSub.canDelegate("addeshantion")) { return ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","addeshantion", _itemsabad);}
RemoteObject _codekala = RemoteObject.createImmutable("");
RemoteObject _tedaddarkarton = RemoteObject.createImmutable("");
RemoteObject _fldtedaddarsabadjoz = RemoteObject.createImmutable("");
RemoteObject _fldtedaddarsabadkol = RemoteObject.createImmutable("");
RemoteObject _eshantion = RemoteObject.createImmutable("");
RemoteObject _tedadsabad = RemoteObject.createImmutable("");
RemoteObject _tedadkol = RemoteObject.createImmutable(0);
RemoteObject _listeshantion = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _itemmax = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlisteshantion");
RemoteObject _fldtedadforooshmax = RemoteObject.createImmutable(0);
RemoteObject _fldtedadeshantionmax = RemoteObject.createImmutable(0);
RemoteObject _tedadeshantion = RemoteObject.createImmutable("");
RemoteObject _codekalaeshantation = RemoteObject.createImmutable("");
RemoteObject _u = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlisteshantion");
RemoteObject _fldtedadforoosh = RemoteObject.createImmutable(0);
RemoteObject _fldtedadeshantion = RemoteObject.createImmutable(0);
RemoteObject _item1 = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlistkala");
RemoteObject _rec = RemoteObject.declareNull("ir.parsikhesab.pakhsh.cls_recdefultkala");
int _j = 0;
Debug.locals.put("ItemSabad", _itemsabad);
 BA.debugLineNum = 2695;BA.debugLine="Sub AddEshantion(ItemSabad As Cursor)";
Debug.ShouldStop(64);
 BA.debugLineNum = 2696;BA.debugLine="Try";
Debug.ShouldStop(128);
try { BA.debugLineNum = 2697;BA.debugLine="Dim CodeKala As String =ItemSabad.GetString(\"FldC";
Debug.ShouldStop(256);
_codekala = _itemsabad.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldCodeKala")));Debug.locals.put("CodeKala", _codekala);Debug.locals.put("CodeKala", _codekala);
 BA.debugLineNum = 2698;BA.debugLine="Dim TedadDarKarton As String =myCode.Is_Null_adad";
Debug.ShouldStop(512);
_tedaddarkarton = act_kaladefault.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(_itemsabad.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTedadDarKarton")))));Debug.locals.put("TedadDarKarton", _tedaddarkarton);Debug.locals.put("TedadDarKarton", _tedaddarkarton);
 BA.debugLineNum = 2699;BA.debugLine="Dim FldTedadDarSabadJoz As String =myCode.Is_Null";
Debug.ShouldStop(1024);
_fldtedaddarsabadjoz = act_kaladefault.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(_itemsabad.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTedadDarSabadJoz")))));Debug.locals.put("FldTedadDarSabadJoz", _fldtedaddarsabadjoz);Debug.locals.put("FldTedadDarSabadJoz", _fldtedaddarsabadjoz);
 BA.debugLineNum = 2700;BA.debugLine="Dim FldTedadDarSabadKol As String =myCode.Is_Null";
Debug.ShouldStop(2048);
_fldtedaddarsabadkol = act_kaladefault.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(_itemsabad.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTedadDarSabadKol")))));Debug.locals.put("FldTedadDarSabadKol", _fldtedaddarsabadkol);Debug.locals.put("FldTedadDarSabadKol", _fldtedaddarsabadkol);
 BA.debugLineNum = 2701;BA.debugLine="Dim Eshantion As String= ItemSabad.GetString(\"Fld";
Debug.ShouldStop(4096);
_eshantion = _itemsabad.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldEshantion")));Debug.locals.put("Eshantion", _eshantion);Debug.locals.put("Eshantion", _eshantion);
 BA.debugLineNum = 2702;BA.debugLine="Dim TedadSabad As String=0";
Debug.ShouldStop(8192);
_tedadsabad = BA.NumberToString(0);Debug.locals.put("TedadSabad", _tedadsabad);Debug.locals.put("TedadSabad", _tedadsabad);
 BA.debugLineNum = 2703;BA.debugLine="If TedadDarKarton>0 Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _tedaddarkarton),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2704;BA.debugLine="Dim tedadKol As Int=(TedadDarKarton*FldTedadDarS";
Debug.ShouldStop(32768);
_tedadkol = BA.numberCast(int.class, (RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _tedaddarkarton),BA.numberCast(double.class, _fldtedaddarsabadkol)}, "*",0, 0)));Debug.locals.put("tedadKol", _tedadkol);Debug.locals.put("tedadKol", _tedadkol);
 BA.debugLineNum = 2705;BA.debugLine="TedadSabad=tedadKol+FldTedadDarSabadJoz";
Debug.ShouldStop(65536);
_tedadsabad = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {_tedadkol,BA.numberCast(double.class, _fldtedaddarsabadjoz)}, "+",1, 0));Debug.locals.put("TedadSabad", _tedadsabad);
 }else {
 BA.debugLineNum = 2707;BA.debugLine="TedadSabad=FldTedadDarSabadJoz";
Debug.ShouldStop(262144);
_tedadsabad = _fldtedaddarsabadjoz;Debug.locals.put("TedadSabad", _tedadsabad);
 };
 BA.debugLineNum = 2709;BA.debugLine="Dim ListEshantion As List";
Debug.ShouldStop(1048576);
_listeshantion = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("ListEshantion", _listeshantion);
 BA.debugLineNum = 2710;BA.debugLine="ListEshantion.Initialize";
Debug.ShouldStop(2097152);
_listeshantion.runVoidMethod ("Initialize");
 BA.debugLineNum = 2711;BA.debugLine="ListEshantion=MCode.LoadEshantionTabaghati(CodeK";
Debug.ShouldStop(4194304);
_listeshantion = act_kaladefault.mostCurrent._mcode.runMethod(false,"_loadeshantiontabaghati" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(_codekala));Debug.locals.put("ListEshantion", _listeshantion);
 BA.debugLineNum = 2712;BA.debugLine="If ListEshantion.Size>0 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean(">",_listeshantion.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2713;BA.debugLine="Dim ItemMax = ListEshantion.Get(ListEshantion.Si";
Debug.ShouldStop(16777216);
_itemmax = (_listeshantion.runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {_listeshantion.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1))));Debug.locals.put("ItemMax", _itemmax);Debug.locals.put("ItemMax", _itemmax);
 BA.debugLineNum = 2714;BA.debugLine="Dim fldTedadForooshMax As Int=ItemMax.fldTedadFo";
Debug.ShouldStop(33554432);
_fldtedadforooshmax = BA.numberCast(int.class, _itemmax.getField(true,"fldTedadForoosh" /*RemoteObject*/ ));Debug.locals.put("fldTedadForooshMax", _fldtedadforooshmax);Debug.locals.put("fldTedadForooshMax", _fldtedadforooshmax);
 BA.debugLineNum = 2715;BA.debugLine="Dim fldTedadEshantionMax As Int=ItemMax.fldTedad";
Debug.ShouldStop(67108864);
_fldtedadeshantionmax = BA.numberCast(int.class, _itemmax.getField(true,"fldTedadEshantion" /*RemoteObject*/ ));Debug.locals.put("fldTedadEshantionMax", _fldtedadeshantionmax);Debug.locals.put("fldTedadEshantionMax", _fldtedadeshantionmax);
 BA.debugLineNum = 2716;BA.debugLine="Dim TedadEshantion As String";
Debug.ShouldStop(134217728);
_tedadeshantion = RemoteObject.createImmutable("");Debug.locals.put("TedadEshantion", _tedadeshantion);
 BA.debugLineNum = 2717;BA.debugLine="Dim CodeKalaEshantation As String=0";
Debug.ShouldStop(268435456);
_codekalaeshantation = BA.NumberToString(0);Debug.locals.put("CodeKalaEshantation", _codekalaeshantation);Debug.locals.put("CodeKalaEshantation", _codekalaeshantation);
 BA.debugLineNum = 2718;BA.debugLine="CodeKalaEshantation=ItemMax.fldCodeKalaEshantion";
Debug.ShouldStop(536870912);
_codekalaeshantation = _itemmax.getField(true,"fldCodeKalaEshantion" /*RemoteObject*/ );Debug.locals.put("CodeKalaEshantation", _codekalaeshantation);
 BA.debugLineNum = 2719;BA.debugLine="If TedadSabad=fldTedadForooshMax Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_tedadsabad,BA.NumberToString(_fldtedadforooshmax))) { 
 BA.debugLineNum = 2720;BA.debugLine="TedadEshantion=fldTedadEshantionMax";
Debug.ShouldStop(-2147483648);
_tedadeshantion = BA.NumberToString(_fldtedadeshantionmax);Debug.locals.put("TedadEshantion", _tedadeshantion);
 }else 
{ BA.debugLineNum = 2721;BA.debugLine="else if TedadSabad > fldTedadForooshMax Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _tedadsabad),BA.numberCast(double.class, _fldtedadforooshmax))) { 
 BA.debugLineNum = 2722;BA.debugLine="Dim u As Int=0";
Debug.ShouldStop(2);
_u = BA.numberCast(int.class, 0);Debug.locals.put("u", _u);Debug.locals.put("u", _u);
 BA.debugLineNum = 2723;BA.debugLine="u=(TedadSabad/fldTedadForooshMax)";
Debug.ShouldStop(4);
_u = BA.numberCast(int.class, (RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _tedadsabad),_fldtedadforooshmax}, "/",0, 0)));Debug.locals.put("u", _u);
 BA.debugLineNum = 2724;BA.debugLine="TedadEshantion=u*fldTedadEshantionMax";
Debug.ShouldStop(8);
_tedadeshantion = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {_u,_fldtedadeshantionmax}, "*",0, 1));Debug.locals.put("TedadEshantion", _tedadeshantion);
 }else 
{ BA.debugLineNum = 2725;BA.debugLine="Else If TedadSabad < fldTedadForooshMax Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("<",BA.numberCast(double.class, _tedadsabad),BA.numberCast(double.class, _fldtedadforooshmax))) { 
 BA.debugLineNum = 2726;BA.debugLine="For i=0 To ListEshantion.Size-2";
Debug.ShouldStop(32);
{
final int step31 = 1;
final int limit31 = RemoteObject.solve(new RemoteObject[] {_listeshantion.runMethod(true,"getSize"),RemoteObject.createImmutable(2)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step31 > 0 && _i <= limit31) || (step31 < 0 && _i >= limit31) ;_i = ((int)(0 + _i + step31))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 2727;BA.debugLine="Dim Item = ListEshantion.Get(i) As AdapterList";
Debug.ShouldStop(64);
_item = (_listeshantion.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 2728;BA.debugLine="Log(Item.fldCodeKalaForoosh)";
Debug.ShouldStop(128);
act_kaladefault.mostCurrent.__c.runVoidMethod ("LogImpl","538862881",_item.getField(true,"fldCodeKalaForoosh" /*RemoteObject*/ ),0);
 BA.debugLineNum = 2729;BA.debugLine="Log(Item.fldCodeKalaEshantion)";
Debug.ShouldStop(256);
act_kaladefault.mostCurrent.__c.runVoidMethod ("LogImpl","538862882",_item.getField(true,"fldCodeKalaEshantion" /*RemoteObject*/ ),0);
 BA.debugLineNum = 2730;BA.debugLine="Dim fldTedadForoosh As Int=Item.fldTedadForoos";
Debug.ShouldStop(512);
_fldtedadforoosh = BA.numberCast(int.class, _item.getField(true,"fldTedadForoosh" /*RemoteObject*/ ));Debug.locals.put("fldTedadForoosh", _fldtedadforoosh);Debug.locals.put("fldTedadForoosh", _fldtedadforoosh);
 BA.debugLineNum = 2731;BA.debugLine="Dim fldTedadEshantion As Int=Item.fldTedadEsha";
Debug.ShouldStop(1024);
_fldtedadeshantion = BA.numberCast(int.class, _item.getField(true,"fldTedadEshantion" /*RemoteObject*/ ));Debug.locals.put("fldTedadEshantion", _fldtedadeshantion);Debug.locals.put("fldTedadEshantion", _fldtedadeshantion);
 BA.debugLineNum = 2732;BA.debugLine="CodeKalaEshantation=Item.fldCodeKalaEshantion";
Debug.ShouldStop(2048);
_codekalaeshantation = _item.getField(true,"fldCodeKalaEshantion" /*RemoteObject*/ );Debug.locals.put("CodeKalaEshantation", _codekalaeshantation);
 BA.debugLineNum = 2733;BA.debugLine="Log(fldTedadForoosh)";
Debug.ShouldStop(4096);
act_kaladefault.mostCurrent.__c.runVoidMethod ("LogImpl","538862886",BA.NumberToString(_fldtedadforoosh),0);
 BA.debugLineNum = 2734;BA.debugLine="Log(Item.fldTedadEshantion)";
Debug.ShouldStop(8192);
act_kaladefault.mostCurrent.__c.runVoidMethod ("LogImpl","538862887",_item.getField(true,"fldTedadEshantion" /*RemoteObject*/ ),0);
 BA.debugLineNum = 2735;BA.debugLine="If TedadSabad= fldTedadForoosh Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_tedadsabad,BA.NumberToString(_fldtedadforoosh))) { 
 BA.debugLineNum = 2736;BA.debugLine="TedadEshantion=fldTedadEshantion";
Debug.ShouldStop(32768);
_tedadeshantion = BA.NumberToString(_fldtedadeshantion);Debug.locals.put("TedadEshantion", _tedadeshantion);
 }else 
{ BA.debugLineNum = 2737;BA.debugLine="else if TedadSabad>fldTedadForoosh Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _tedadsabad),BA.numberCast(double.class, _fldtedadforoosh))) { 
 BA.debugLineNum = 2738;BA.debugLine="Dim u As Int=0";
Debug.ShouldStop(131072);
_u = BA.numberCast(int.class, 0);Debug.locals.put("u", _u);Debug.locals.put("u", _u);
 BA.debugLineNum = 2739;BA.debugLine="u=(TedadSabad/fldTedadForoosh)";
Debug.ShouldStop(262144);
_u = BA.numberCast(int.class, (RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _tedadsabad),_fldtedadforoosh}, "/",0, 0)));Debug.locals.put("u", _u);
 BA.debugLineNum = 2740;BA.debugLine="TedadEshantion=u*fldTedadEshantion";
Debug.ShouldStop(524288);
_tedadeshantion = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {_u,_fldtedadeshantion}, "*",0, 1));Debug.locals.put("TedadEshantion", _tedadeshantion);
 }else 
{ BA.debugLineNum = 2741;BA.debugLine="else if TedadSabad<fldTedadForoosh Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("<",BA.numberCast(double.class, _tedadsabad),BA.numberCast(double.class, _fldtedadforoosh))) { 
 BA.debugLineNum = 2742;BA.debugLine="TedadEshantion=0";
Debug.ShouldStop(2097152);
_tedadeshantion = BA.NumberToString(0);Debug.locals.put("TedadEshantion", _tedadeshantion);
 }}}
;
 }
}Debug.locals.put("i", _i);
;
 }}}
;
 BA.debugLineNum = 2746;BA.debugLine="If TedadEshantion>0 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _tedadeshantion),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2747;BA.debugLine="If SwSearchNumber.Checked Then";
Debug.ShouldStop(67108864);
if (act_kaladefault.mostCurrent._swsearchnumber.runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2748;BA.debugLine="SwSearchNumber.Checked=False";
Debug.ShouldStop(134217728);
act_kaladefault.mostCurrent._swsearchnumber.runMethodAndSync(true,"setChecked",act_kaladefault.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 2750;BA.debugLine="TxtSearch.Text=CodeKalaEshantation";
Debug.ShouldStop(536870912);
act_kaladefault.mostCurrent._txtsearch.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_codekalaeshantation));
 BA.debugLineNum = 2751;BA.debugLine="Dim Item1 = ListKalaTxt.Get(0) As AdapterListKa";
Debug.ShouldStop(1073741824);
_item1 = (act_kaladefault.mostCurrent._listkalatxt.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("Item1", _item1);Debug.locals.put("Item1", _item1);
 BA.debugLineNum = 2752;BA.debugLine="Dim rec As CLs_RecDefultKala";
Debug.ShouldStop(-2147483648);
_rec = RemoteObject.createNew ("ir.parsikhesab.pakhsh.cls_recdefultkala");Debug.locals.put("rec", _rec);
 BA.debugLineNum = 2753;BA.debugLine="rec.Initialize(Me)";
Debug.ShouldStop(1);
_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_recdefultkala.class, "_initialize" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(act_kaladefault.getObject()));
 BA.debugLineNum = 2754;BA.debugLine="rec.Show(Item1,0)";
Debug.ShouldStop(2);
_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_recdefultkala.class, "_show" /*void*/ ,(Object)(_item1),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 2755;BA.debugLine="Item1.TedadDarSabadJoz=0";
Debug.ShouldStop(4);
_item1.setField ("TedadDarSabadJoz" /*RemoteObject*/ ,BA.NumberToString(0));
 BA.debugLineNum = 2756;BA.debugLine="Item1.TedadDarSabadKol=0";
Debug.ShouldStop(8);
_item1.setField ("TedadDarSabadKol" /*RemoteObject*/ ,BA.NumberToString(0));
 BA.debugLineNum = 2757;BA.debugLine="Item1.fldCountEshantion=TedadEshantion";
Debug.ShouldStop(16);
_item1.setField ("fldCountEshantion" /*RemoteObject*/ ,_tedadeshantion);
 BA.debugLineNum = 2759;BA.debugLine="For j=0 To TedadEshantion-1";
Debug.ShouldStop(64);
{
final int step63 = 1;
final int limit63 = (int) (0 + RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _tedadeshantion),RemoteObject.createImmutable(1)}, "-",1, 0).<Double>get().doubleValue());
_j = 0 ;
for (;(step63 > 0 && _j <= limit63) || (step63 < 0 && _j >= limit63) ;_j = ((int)(0 + _j + step63))  ) {
Debug.locals.put("j", _j);
 BA.debugLineNum = 2760;BA.debugLine="rec.BtnUpEshan_Click";
Debug.ShouldStop(128);
_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_recdefultkala.class, "_btnupeshan_click" /*RemoteObject*/ );
 }
}Debug.locals.put("j", _j);
;
 BA.debugLineNum = 2763;BA.debugLine="MCode.AddToSabad(Item1)";
Debug.ShouldStop(1024);
act_kaladefault.mostCurrent._mcode.runVoidMethod ("_addtosabad" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(_item1));
 BA.debugLineNum = 2764;BA.debugLine="TxtSearch.Text=\"\"";
Debug.ShouldStop(2048);
act_kaladefault.mostCurrent._txtsearch.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 };
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e71) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_kaladefault.processBA, e71.toString()); BA.debugLineNum = 2769;BA.debugLine="Log(LastException)";
Debug.ShouldStop(65536);
act_kaladefault.mostCurrent.__c.runVoidMethod ("LogImpl","538862922",BA.ObjectToString(act_kaladefault.mostCurrent.__c.runMethod(false,"LastException",act_kaladefault.mostCurrent.activityBA)),0);
 BA.debugLineNum = 2770;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(131072);
act_kaladefault.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_kaladefault.mostCurrent.__c.runMethod(false,"LastException",act_kaladefault.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_kaladefault.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-AddEshantion"))));
 };
 BA.debugLineNum = 2799;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addeshantiongroup(RemoteObject _codegroup) throws Exception{
try {
		Debug.PushSubsStack("AddEshantionGroup (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,2532);
if (RapidSub.canDelegate("addeshantiongroup")) { return ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","addeshantiongroup", _codegroup);}
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _tedadsabad = RemoteObject.createImmutable("");
int _i = 0;
RemoteObject _tedaddarkarton = RemoteObject.createImmutable("");
RemoteObject _fldtedaddarsabadjoz = RemoteObject.createImmutable("");
RemoteObject _fldtedaddarsabadkol = RemoteObject.createImmutable("");
RemoteObject _eshantion = RemoteObject.createImmutable("");
RemoteObject _tedadkol = RemoteObject.createImmutable(0);
RemoteObject _listeshantion = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _itemmax = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlisteshantiongroup");
RemoteObject _fldtedadforooshmax = RemoteObject.createImmutable(0);
RemoteObject _fldtedadeshantionmax = RemoteObject.createImmutable(0);
RemoteObject _tedadeshantion = RemoteObject.createImmutable("");
RemoteObject _codegroupkalaeshantion = RemoteObject.createImmutable("");
RemoteObject _u = RemoteObject.createImmutable(0);
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlisteshantiongroup");
RemoteObject _fldtedadforoosh = RemoteObject.createImmutable(0);
RemoteObject _fldtedadeshantion = RemoteObject.createImmutable(0);
RemoteObject _eshant = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlisteshantiongroup");
RemoteObject _index = RemoteObject.createImmutable(0);
Debug.locals.put("CodeGroup", _codegroup);
 BA.debugLineNum = 2532;BA.debugLine="Sub AddEshantionGroup(CodeGroup As String)";
Debug.ShouldStop(8);
 BA.debugLineNum = 2533;BA.debugLine="Try";
Debug.ShouldStop(16);
try { BA.debugLineNum = 2536;BA.debugLine="If LblGiftCount.Text=0 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",act_kaladefault.mostCurrent._lblgiftcount.runMethod(true,"getText"),BA.NumberToString(0))) { 
 BA.debugLineNum = 2537;BA.debugLine="LblGiftCount.Visible=False";
Debug.ShouldStop(256);
act_kaladefault.mostCurrent._lblgiftcount.runMethod(true,"setVisible",act_kaladefault.mostCurrent.__c.getField(true,"False"));
 }else {
 BA.debugLineNum = 2539;BA.debugLine="LblGiftCount.Visible=True";
Debug.ShouldStop(1024);
act_kaladefault.mostCurrent._lblgiftcount.runMethod(true,"setVisible",act_kaladefault.mostCurrent.__c.getField(true,"True"));
 };
 BA.debugLineNum = 2541;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From T";
Debug.ShouldStop(4096);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_kaladefault.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select * From TblSabad where fldCodeGroup="),_codegroup,RemoteObject.createImmutable("  and fldCodeGroup IN(SELECT tblEshantionGroup.fldCodeGroupKala FROM tblEshantionGroup)"))));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 2542;BA.debugLine="If Cu.RowCount>0 Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2543;BA.debugLine="Dim TedadSabad As String=0";
Debug.ShouldStop(16384);
_tedadsabad = BA.NumberToString(0);Debug.locals.put("TedadSabad", _tedadsabad);Debug.locals.put("TedadSabad", _tedadsabad);
 BA.debugLineNum = 2544;BA.debugLine="For i=0 To Cu.RowCount -1";
Debug.ShouldStop(32768);
{
final int step10 = 1;
final int limit10 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step10 > 0 && _i <= limit10) || (step10 < 0 && _i >= limit10) ;_i = ((int)(0 + _i + step10))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 2545;BA.debugLine="Cu.Position=i";
Debug.ShouldStop(65536);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 2546;BA.debugLine="Dim TedadDarKarton As String =myCode.Is_Null_a";
Debug.ShouldStop(131072);
_tedaddarkarton = act_kaladefault.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTedadDarKarton")))));Debug.locals.put("TedadDarKarton", _tedaddarkarton);Debug.locals.put("TedadDarKarton", _tedaddarkarton);
 BA.debugLineNum = 2547;BA.debugLine="Dim FldTedadDarSabadJoz As String =myCode.Is_N";
Debug.ShouldStop(262144);
_fldtedaddarsabadjoz = act_kaladefault.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTedadDarSabadJoz")))));Debug.locals.put("FldTedadDarSabadJoz", _fldtedaddarsabadjoz);Debug.locals.put("FldTedadDarSabadJoz", _fldtedaddarsabadjoz);
 BA.debugLineNum = 2548;BA.debugLine="Dim FldTedadDarSabadKol As String =myCode.Is_N";
Debug.ShouldStop(524288);
_fldtedaddarsabadkol = act_kaladefault.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTedadDarSabadKol")))));Debug.locals.put("FldTedadDarSabadKol", _fldtedaddarsabadkol);Debug.locals.put("FldTedadDarSabadKol", _fldtedaddarsabadkol);
 BA.debugLineNum = 2549;BA.debugLine="Dim Eshantion As String= Cu.GetString(\"FldEsha";
Debug.ShouldStop(1048576);
_eshantion = _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldEshantion")));Debug.locals.put("Eshantion", _eshantion);Debug.locals.put("Eshantion", _eshantion);
 BA.debugLineNum = 2551;BA.debugLine="If TedadDarKarton>0 Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _tedaddarkarton),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2552;BA.debugLine="Dim tedadKol As Int=(TedadDarKarton*FldTedadD";
Debug.ShouldStop(8388608);
_tedadkol = BA.numberCast(int.class, (RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _tedaddarkarton),BA.numberCast(double.class, _fldtedaddarsabadkol)}, "*",0, 0)));Debug.locals.put("tedadKol", _tedadkol);Debug.locals.put("tedadKol", _tedadkol);
 BA.debugLineNum = 2553;BA.debugLine="TedadSabad =TedadSabad + tedadKol+FldTedadDar";
Debug.ShouldStop(16777216);
_tedadsabad = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _tedadsabad),_tedadkol,BA.numberCast(double.class, _fldtedaddarsabadjoz)}, "++",2, 0));Debug.locals.put("TedadSabad", _tedadsabad);
 }else {
 BA.debugLineNum = 2555;BA.debugLine="TedadSabad=TedadSabad + FldTedadDarSabadJoz";
Debug.ShouldStop(67108864);
_tedadsabad = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _tedadsabad),BA.numberCast(double.class, _fldtedaddarsabadjoz)}, "+",1, 0));Debug.locals.put("TedadSabad", _tedadsabad);
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2559;BA.debugLine="Log(CodeGroup)";
Debug.ShouldStop(1073741824);
act_kaladefault.mostCurrent.__c.runVoidMethod ("LogImpl","538469659",_codegroup,0);
 BA.debugLineNum = 2560;BA.debugLine="Log(TedadSabad)";
Debug.ShouldStop(-2147483648);
act_kaladefault.mostCurrent.__c.runVoidMethod ("LogImpl","538469660",_tedadsabad,0);
 BA.debugLineNum = 2561;BA.debugLine="Dim ListEshantion As List";
Debug.ShouldStop(1);
_listeshantion = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("ListEshantion", _listeshantion);
 BA.debugLineNum = 2562;BA.debugLine="ListEshantion.Initialize";
Debug.ShouldStop(2);
_listeshantion.runVoidMethod ("Initialize");
 BA.debugLineNum = 2563;BA.debugLine="ListEshantion=MCode.LoadEshantionGroup(CodeGrou";
Debug.ShouldStop(4);
_listeshantion = act_kaladefault.mostCurrent._mcode.runMethod(false,"_loadeshantiongroup" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(_codegroup));Debug.locals.put("ListEshantion", _listeshantion);
 BA.debugLineNum = 2564;BA.debugLine="If ListEshantion.Size>0 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean(">",_listeshantion.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2565;BA.debugLine="Dim ItemMax = ListEshantion.Get(ListEshantion.";
Debug.ShouldStop(16);
_itemmax = (_listeshantion.runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {_listeshantion.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1))));Debug.locals.put("ItemMax", _itemmax);Debug.locals.put("ItemMax", _itemmax);
 BA.debugLineNum = 2566;BA.debugLine="Dim fldTedadForooshMax As Int=ItemMax.fldTedad";
Debug.ShouldStop(32);
_fldtedadforooshmax = BA.numberCast(int.class, _itemmax.getField(true,"fldTedadForoosh" /*RemoteObject*/ ));Debug.locals.put("fldTedadForooshMax", _fldtedadforooshmax);Debug.locals.put("fldTedadForooshMax", _fldtedadforooshmax);
 BA.debugLineNum = 2567;BA.debugLine="Dim fldTedadEshantionMax As Int=ItemMax.fldTed";
Debug.ShouldStop(64);
_fldtedadeshantionmax = BA.numberCast(int.class, _itemmax.getField(true,"fldTedadEshantion" /*RemoteObject*/ ));Debug.locals.put("fldTedadEshantionMax", _fldtedadeshantionmax);Debug.locals.put("fldTedadEshantionMax", _fldtedadeshantionmax);
 BA.debugLineNum = 2568;BA.debugLine="Dim TedadEshantion As String=0";
Debug.ShouldStop(128);
_tedadeshantion = BA.NumberToString(0);Debug.locals.put("TedadEshantion", _tedadeshantion);Debug.locals.put("TedadEshantion", _tedadeshantion);
 BA.debugLineNum = 2569;BA.debugLine="Dim CodeGroupKalaEshantion As String=0";
Debug.ShouldStop(256);
_codegroupkalaeshantion = BA.NumberToString(0);Debug.locals.put("CodeGroupKalaEshantion", _codegroupkalaeshantion);Debug.locals.put("CodeGroupKalaEshantion", _codegroupkalaeshantion);
 BA.debugLineNum = 2570;BA.debugLine="CodeGroupKalaEshantion=ItemMax.fldCodeGroupKal";
Debug.ShouldStop(512);
_codegroupkalaeshantion = _itemmax.getField(true,"fldCodeGroupKalaEshantion" /*RemoteObject*/ );Debug.locals.put("CodeGroupKalaEshantion", _codegroupkalaeshantion);
 BA.debugLineNum = 2571;BA.debugLine="If TedadSabad=fldTedadForooshMax Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_tedadsabad,BA.NumberToString(_fldtedadforooshmax))) { 
 BA.debugLineNum = 2572;BA.debugLine="TedadEshantion=fldTedadEshantionMax";
Debug.ShouldStop(2048);
_tedadeshantion = BA.NumberToString(_fldtedadeshantionmax);Debug.locals.put("TedadEshantion", _tedadeshantion);
 }else 
{ BA.debugLineNum = 2573;BA.debugLine="else if TedadSabad > fldTedadForooshMax Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _tedadsabad),BA.numberCast(double.class, _fldtedadforooshmax))) { 
 BA.debugLineNum = 2574;BA.debugLine="Dim u As Int=0";
Debug.ShouldStop(8192);
_u = BA.numberCast(int.class, 0);Debug.locals.put("u", _u);Debug.locals.put("u", _u);
 BA.debugLineNum = 2575;BA.debugLine="u=(TedadSabad/fldTedadForooshMax)";
Debug.ShouldStop(16384);
_u = BA.numberCast(int.class, (RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _tedadsabad),_fldtedadforooshmax}, "/",0, 0)));Debug.locals.put("u", _u);
 BA.debugLineNum = 2576;BA.debugLine="TedadEshantion=u*fldTedadEshantionMax";
Debug.ShouldStop(32768);
_tedadeshantion = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {_u,_fldtedadeshantionmax}, "*",0, 1));Debug.locals.put("TedadEshantion", _tedadeshantion);
 }else 
{ BA.debugLineNum = 2577;BA.debugLine="Else If TedadSabad < fldTedadForooshMax Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("<",BA.numberCast(double.class, _tedadsabad),BA.numberCast(double.class, _fldtedadforooshmax))) { 
 BA.debugLineNum = 2578;BA.debugLine="For i=0 To ListEshantion.Size-2";
Debug.ShouldStop(131072);
{
final int step42 = 1;
final int limit42 = RemoteObject.solve(new RemoteObject[] {_listeshantion.runMethod(true,"getSize"),RemoteObject.createImmutable(2)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step42 > 0 && _i <= limit42) || (step42 < 0 && _i >= limit42) ;_i = ((int)(0 + _i + step42))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 2579;BA.debugLine="Dim Item = ListEshantion.Get(i) As AdapterLi";
Debug.ShouldStop(262144);
_item = (_listeshantion.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 2580;BA.debugLine="Log(Item.fldCodeGroupKala)";
Debug.ShouldStop(524288);
act_kaladefault.mostCurrent.__c.runVoidMethod ("LogImpl","538469680",_item.getField(true,"fldCodeGroupKala" /*RemoteObject*/ ),0);
 BA.debugLineNum = 2581;BA.debugLine="Log(Item.fldCodeGroupKalaEshantion)";
Debug.ShouldStop(1048576);
act_kaladefault.mostCurrent.__c.runVoidMethod ("LogImpl","538469681",_item.getField(true,"fldCodeGroupKalaEshantion" /*RemoteObject*/ ),0);
 BA.debugLineNum = 2582;BA.debugLine="Dim fldTedadForoosh As Int=Item.fldTedadForo";
Debug.ShouldStop(2097152);
_fldtedadforoosh = BA.numberCast(int.class, _item.getField(true,"fldTedadForoosh" /*RemoteObject*/ ));Debug.locals.put("fldTedadForoosh", _fldtedadforoosh);Debug.locals.put("fldTedadForoosh", _fldtedadforoosh);
 BA.debugLineNum = 2583;BA.debugLine="Dim fldTedadEshantion As Int=Item.fldTedadEs";
Debug.ShouldStop(4194304);
_fldtedadeshantion = BA.numberCast(int.class, _item.getField(true,"fldTedadEshantion" /*RemoteObject*/ ));Debug.locals.put("fldTedadEshantion", _fldtedadeshantion);Debug.locals.put("fldTedadEshantion", _fldtedadeshantion);
 BA.debugLineNum = 2584;BA.debugLine="CodeGroupKalaEshantion=Item.fldCodeGroupKala";
Debug.ShouldStop(8388608);
_codegroupkalaeshantion = _item.getField(true,"fldCodeGroupKalaEshantion" /*RemoteObject*/ );Debug.locals.put("CodeGroupKalaEshantion", _codegroupkalaeshantion);
 BA.debugLineNum = 2585;BA.debugLine="Log(fldTedadForoosh)";
Debug.ShouldStop(16777216);
act_kaladefault.mostCurrent.__c.runVoidMethod ("LogImpl","538469685",BA.NumberToString(_fldtedadforoosh),0);
 BA.debugLineNum = 2586;BA.debugLine="Log(Item.fldTedadEshantion)";
Debug.ShouldStop(33554432);
act_kaladefault.mostCurrent.__c.runVoidMethod ("LogImpl","538469686",_item.getField(true,"fldTedadEshantion" /*RemoteObject*/ ),0);
 BA.debugLineNum = 2587;BA.debugLine="If TedadSabad= fldTedadForoosh Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_tedadsabad,BA.NumberToString(_fldtedadforoosh))) { 
 BA.debugLineNum = 2588;BA.debugLine="TedadEshantion=fldTedadEshantion";
Debug.ShouldStop(134217728);
_tedadeshantion = BA.NumberToString(_fldtedadeshantion);Debug.locals.put("TedadEshantion", _tedadeshantion);
 }else 
{ BA.debugLineNum = 2589;BA.debugLine="else if TedadSabad>fldTedadForoosh Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _tedadsabad),BA.numberCast(double.class, _fldtedadforoosh))) { 
 BA.debugLineNum = 2590;BA.debugLine="Dim u As Int=0";
Debug.ShouldStop(536870912);
_u = BA.numberCast(int.class, 0);Debug.locals.put("u", _u);Debug.locals.put("u", _u);
 BA.debugLineNum = 2591;BA.debugLine="u=(TedadSabad/fldTedadForoosh)";
Debug.ShouldStop(1073741824);
_u = BA.numberCast(int.class, (RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _tedadsabad),_fldtedadforoosh}, "/",0, 0)));Debug.locals.put("u", _u);
 BA.debugLineNum = 2592;BA.debugLine="TedadEshantion=u*fldTedadEshantion";
Debug.ShouldStop(-2147483648);
_tedadeshantion = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {_u,_fldtedadeshantion}, "*",0, 1));Debug.locals.put("TedadEshantion", _tedadeshantion);
 }else 
{ BA.debugLineNum = 2593;BA.debugLine="else if TedadSabad<fldTedadForoosh Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("<",BA.numberCast(double.class, _tedadsabad),BA.numberCast(double.class, _fldtedadforoosh))) { 
 BA.debugLineNum = 2594;BA.debugLine="TedadEshantion=0";
Debug.ShouldStop(2);
_tedadeshantion = BA.NumberToString(0);Debug.locals.put("TedadEshantion", _tedadeshantion);
 }}}
;
 }
}Debug.locals.put("i", _i);
;
 }}}
;
 BA.debugLineNum = 2598;BA.debugLine="If TedadEshantion>0 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _tedadeshantion),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2599;BA.debugLine="Dim Eshant As AdapterListEshantionGroup";
Debug.ShouldStop(64);
_eshant = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapterlisteshantiongroup");Debug.locals.put("Eshant", _eshant);
 BA.debugLineNum = 2600;BA.debugLine="Eshant.fldCodeGroupKala=CodeGroup";
Debug.ShouldStop(128);
_eshant.setField ("fldCodeGroupKala" /*RemoteObject*/ ,_codegroup);
 BA.debugLineNum = 2601;BA.debugLine="Eshant.fldCodeGroupKalaEshantion=CodeGroupKal";
Debug.ShouldStop(256);
_eshant.setField ("fldCodeGroupKalaEshantion" /*RemoteObject*/ ,_codegroupkalaeshantion);
 BA.debugLineNum = 2602;BA.debugLine="Eshant.fldTedadForoosh=fldTedadForoosh";
Debug.ShouldStop(512);
_eshant.setField ("fldTedadForoosh" /*RemoteObject*/ ,BA.NumberToString(_fldtedadforoosh));
 BA.debugLineNum = 2603;BA.debugLine="Eshant.fldTedadEshantion=TedadEshantion";
Debug.ShouldStop(1024);
_eshant.setField ("fldTedadEshantion" /*RemoteObject*/ ,_tedadeshantion);
 BA.debugLineNum = 2604;BA.debugLine="Log(CodeGroupKalaEshantion)";
Debug.ShouldStop(2048);
act_kaladefault.mostCurrent.__c.runVoidMethod ("LogImpl","538469704",_codegroupkalaeshantion,0);
 BA.debugLineNum = 2605;BA.debugLine="Log(TedadEshantion)";
Debug.ShouldStop(4096);
act_kaladefault.mostCurrent.__c.runVoidMethod ("LogImpl","538469705",_tedadeshantion,0);
 BA.debugLineNum = 2607;BA.debugLine="MCode.SaveUpdate(\"Delete from tblEshantionGro";
Debug.ShouldStop(16384);
act_kaladefault.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Delete from tblEshantionGroupTemp where fldCodeGroupKala='"),_codegroup,RemoteObject.createImmutable("'"))));
 BA.debugLineNum = 2608;BA.debugLine="MCode.SaveUpdate($\"Insert into tblEshantionGr";
Debug.ShouldStop(32768);
act_kaladefault.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("Insert into tblEshantionGroupTemp(fldCodeGroupKala, fldCodeGroupKalaEshantion ,fldTedadEshantion) Values('"),act_kaladefault.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_codegroup))),RemoteObject.createImmutable("','"),act_kaladefault.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_codegroupkalaeshantion))),RemoteObject.createImmutable("','"),act_kaladefault.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tedadeshantion))),RemoteObject.createImmutable("')")))));
 BA.debugLineNum = 2609;BA.debugLine="Dim index As Int=CheckGroupForEshantation(Cod";
Debug.ShouldStop(65536);
_index = _checkgroupforeshantation(_codegroup,_codegroupkalaeshantion);Debug.locals.put("index", _index);Debug.locals.put("index", _index);
 BA.debugLineNum = 2610;BA.debugLine="If index>-1 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean(">",_index,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 2611;BA.debugLine="lstEshantionGroup.RemoveAt(index)";
Debug.ShouldStop(262144);
act_kaladefault.mostCurrent._lsteshantiongroup.runVoidMethod ("RemoveAt",(Object)(_index));
 };
 BA.debugLineNum = 2614;BA.debugLine="lstEshantionGroup.Add(Eshant)";
Debug.ShouldStop(2097152);
act_kaladefault.mostCurrent._lsteshantiongroup.runVoidMethod ("Add",(Object)((_eshant)));
 }else {
 BA.debugLineNum = 2616;BA.debugLine="MCode.SaveUpdate(\"Delete from tblEshantionGro";
Debug.ShouldStop(8388608);
act_kaladefault.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Delete from tblEshantionGroupTemp where fldCodeGroupKala='"),_codegroup,RemoteObject.createImmutable("'"))));
 };
 };
 }else {
 BA.debugLineNum = 2622;BA.debugLine="MCode.SaveUpdate(\"Delete from tblEshantionGroup";
Debug.ShouldStop(536870912);
act_kaladefault.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Delete from tblEshantionGroupTemp where fldCodeGroupKala='"),_codegroup,RemoteObject.createImmutable("'"))));
 };
 BA.debugLineNum = 2624;BA.debugLine="RefreshCountEshantionGroup";
Debug.ShouldStop(-2147483648);
_refreshcounteshantiongroup();
 BA.debugLineNum = 2625;BA.debugLine="If Table1.IsInitialized Then";
Debug.ShouldStop(1);
if (act_kaladefault.mostCurrent._table1.runMethod(true,"IsInitialized" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2626;BA.debugLine="Grid";
Debug.ShouldStop(2);
_grid();
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e89) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_kaladefault.processBA, e89.toString()); BA.debugLineNum = 2630;BA.debugLine="Log(LastException)";
Debug.ShouldStop(32);
act_kaladefault.mostCurrent.__c.runVoidMethod ("LogImpl","538469730",BA.ObjectToString(act_kaladefault.mostCurrent.__c.runMethod(false,"LastException",act_kaladefault.mostCurrent.activityBA)),0);
 };
 BA.debugLineNum = 2632;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addtosabad(RemoteObject _item) throws Exception{
try {
		Debug.PushSubsStack("AddToSabad (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,2405);
if (RapidSub.canDelegate("addtosabad")) { return ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","addtosabad", _item);}
RemoteObject _tedadkol = RemoteObject.createImmutable("");
RemoteObject _feekol = RemoteObject.createImmutable("");
RemoteObject _rec = RemoteObject.declareNull("ir.parsikhesab.pakhsh.cls_recdefultkala");
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _check = RemoteObject.createImmutable(false);
int _i = 0;
RemoteObject _ishas = RemoteObject.createImmutable(false);
RemoteObject _c = RemoteObject.createImmutable(0);
RemoteObject _item2 = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterchangefeekala");
Debug.locals.put("Item", _item);
 BA.debugLineNum = 2405;BA.debugLine="Sub AddToSabad(Item As AdapterListKala)";
Debug.ShouldStop(16);
 BA.debugLineNum = 2406;BA.debugLine="Try";
Debug.ShouldStop(32);
try { BA.debugLineNum = 2407;BA.debugLine="If myCode.Is_Null_adad(Item.fldDarsadTakhfif)>0";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, act_kaladefault.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(_item.getField(true,"fldDarsadTakhfif" /*RemoteObject*/ )))),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2408;BA.debugLine="Dim tedadKol As String=myCode.Is_Null_adad(Item";
Debug.ShouldStop(128);
_tedadkol = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, act_kaladefault.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(_item.getField(true,"TedadDarSabadJoz" /*RemoteObject*/ )))),(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, act_kaladefault.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(_item.getField(true,"TedadDarSabadKol" /*RemoteObject*/ )))),BA.numberCast(double.class, act_kaladefault.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(_item.getField(true,"TedadDarKarton" /*RemoteObject*/ ))))}, "*",0, 0))}, "+",1, 0));Debug.locals.put("tedadKol", _tedadkol);Debug.locals.put("tedadKol", _tedadkol);
 BA.debugLineNum = 2409;BA.debugLine="Dim FeeKol As String=(Item.FeeForoosh*tedadKol)";
Debug.ShouldStop(256);
_feekol = BA.NumberToString((RemoteObject.solve(new RemoteObject[] {_item.getField(true,"FeeForoosh" /*RemoteObject*/ ),BA.numberCast(double.class, _tedadkol)}, "*",0, 0)));Debug.locals.put("FeeKol", _feekol);Debug.locals.put("FeeKol", _feekol);
 BA.debugLineNum = 2410;BA.debugLine="If tedadKol>0 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _tedadkol),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2411;BA.debugLine="Item.MablaghTakhfif=(((Item.FeeForoosh*tedadKo";
Debug.ShouldStop(1024);
_item.setField ("MablaghTakhfif" /*RemoteObject*/ ,BA.numberCast(int.class, (RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_item.getField(true,"FeeForoosh" /*RemoteObject*/ ),BA.numberCast(double.class, _tedadkol)}, "*",0, 0)),BA.numberCast(double.class, _item.getField(true,"fldDarsadTakhfif" /*RemoteObject*/ ))}, "*",0, 0)),RemoteObject.createImmutable(100)}, "/",0, 0))));
 BA.debugLineNum = 2412;BA.debugLine="Item.fldFeeBadAzTakhfif=FeeKol-Item.MablaghTak";
Debug.ShouldStop(2048);
_item.setField ("fldFeeBadAzTakhfif" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _feekol),_item.getField(true,"MablaghTakhfif" /*RemoteObject*/ )}, "-",1, 0)));
 }else {
 BA.debugLineNum = 2414;BA.debugLine="If myCode.Is_Null_adad(Item.fldDarsadTakhfif)>";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, act_kaladefault.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(_item.getField(true,"fldDarsadTakhfif" /*RemoteObject*/ )))),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2415;BA.debugLine="Item.MablaghTakhfif=(((Item.FeeForoosh)*Item.";
Debug.ShouldStop(16384);
_item.setField ("MablaghTakhfif" /*RemoteObject*/ ,BA.numberCast(int.class, (RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {(_item.getField(true,"FeeForoosh" /*RemoteObject*/ )),BA.numberCast(double.class, _item.getField(true,"fldDarsadTakhfif" /*RemoteObject*/ ))}, "*",0, 0)),RemoteObject.createImmutable(100)}, "/",0, 0))));
 BA.debugLineNum = 2416;BA.debugLine="Item.fldFeeBadAzTakhfif=Item.FeeForoosh-Item.";
Debug.ShouldStop(32768);
_item.setField ("fldFeeBadAzTakhfif" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {_item.getField(true,"FeeForoosh" /*RemoteObject*/ ),_item.getField(true,"MablaghTakhfif" /*RemoteObject*/ )}, "-",1, 1)));
 };
 };
 };
 BA.debugLineNum = 2422;BA.debugLine="Dim rec As CLs_RecDefultKala";
Debug.ShouldStop(2097152);
_rec = RemoteObject.createNew ("ir.parsikhesab.pakhsh.cls_recdefultkala");Debug.locals.put("rec", _rec);
 BA.debugLineNum = 2423;BA.debugLine="rec.Initialize(Me)";
Debug.ShouldStop(4194304);
_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_recdefultkala.class, "_initialize" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(act_kaladefault.getObject()));
 BA.debugLineNum = 2424;BA.debugLine="rec.Show(Item,0)";
Debug.ShouldStop(8388608);
_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_recdefultkala.class, "_show" /*void*/ ,(Object)(_item),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 2425;BA.debugLine="FeeKol=rec.CheckArzeshAfzode";
Debug.ShouldStop(16777216);
_feekol = _rec.runClassMethod (ir.parsikhesab.pakhsh.cls_recdefultkala.class, "_checkarzeshafzode" /*RemoteObject*/ );Debug.locals.put("FeeKol", _feekol);
 BA.debugLineNum = 2427;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From Tb";
Debug.ShouldStop(67108864);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_kaladefault.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Select * From TblSabad")));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 2428;BA.debugLine="Dim Check As Boolean";
Debug.ShouldStop(134217728);
_check = RemoteObject.createImmutable(false);Debug.locals.put("Check", _check);
 BA.debugLineNum = 2429;BA.debugLine="For i=0 To Cu.RowCount -1";
Debug.ShouldStop(268435456);
{
final int step21 = 1;
final int limit21 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step21 > 0 && _i <= limit21) || (step21 < 0 && _i >= limit21) ;_i = ((int)(0 + _i + step21))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 2430;BA.debugLine="Cu.Position=i";
Debug.ShouldStop(536870912);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 2431;BA.debugLine="If Cu.GetString(\"FldCodeKala\") = Item.CodeKala T";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldCodeKala"))),_item.getField(true,"CodeKala" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 2432;BA.debugLine="If Item.TedadDarSabadJoz = 0 And Item.TedadDarS";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_item.getField(true,"TedadDarSabadJoz" /*RemoteObject*/ ),BA.NumberToString(0)) && RemoteObject.solveBoolean("=",_item.getField(true,"TedadDarSabadKol" /*RemoteObject*/ ),BA.NumberToString(0))) { 
 BA.debugLineNum = 2433;BA.debugLine="MCode.SaveUpdate(\"Delete From TblSabad Where";
Debug.ShouldStop(1);
act_kaladefault.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Delete From TblSabad Where FldCodeKala = '"),_item.getField(true,"CodeKala" /*RemoteObject*/ ),RemoteObject.createImmutable("'"))));
 BA.debugLineNum = 2434;BA.debugLine="Dim ishas As Boolean=False";
Debug.ShouldStop(2);
_ishas = act_kaladefault.mostCurrent.__c.getField(true,"False");Debug.locals.put("ishas", _ishas);Debug.locals.put("ishas", _ishas);
 BA.debugLineNum = 2435;BA.debugLine="Dim c As Int=0";
Debug.ShouldStop(4);
_c = BA.numberCast(int.class, 0);Debug.locals.put("c", _c);Debug.locals.put("c", _c);
 BA.debugLineNum = 2436;BA.debugLine="For i=0 To MCode.lstChangeFeeKala.Size-1";
Debug.ShouldStop(8);
{
final int step28 = 1;
final int limit28 = RemoteObject.solve(new RemoteObject[] {act_kaladefault.mostCurrent._mcode._lstchangefeekala /*RemoteObject*/ .runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step28 > 0 && _i <= limit28) || (step28 < 0 && _i >= limit28) ;_i = ((int)(0 + _i + step28))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 2437;BA.debugLine="Dim Item2 = MCode.lstChangeFeeKala.Get(i) As";
Debug.ShouldStop(16);
_item2 = (act_kaladefault.mostCurrent._mcode._lstchangefeekala /*RemoteObject*/ .runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("Item2", _item2);Debug.locals.put("Item2", _item2);
 BA.debugLineNum = 2438;BA.debugLine="If Item2.FldCodKala=Item.CodeKala Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",_item2.getField(true,"FldCodKala" /*RemoteObject*/ ),_item.getField(true,"CodeKala" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 2439;BA.debugLine="ishas=True";
Debug.ShouldStop(64);
_ishas = act_kaladefault.mostCurrent.__c.getField(true,"True");Debug.locals.put("ishas", _ishas);
 BA.debugLineNum = 2440;BA.debugLine="c=i";
Debug.ShouldStop(128);
_c = BA.numberCast(int.class, _i);Debug.locals.put("c", _c);
 BA.debugLineNum = 2441;BA.debugLine="Exit";
Debug.ShouldStop(256);
if (true) break;
 }else {
 BA.debugLineNum = 2443;BA.debugLine="ishas=False";
Debug.ShouldStop(1024);
_ishas = act_kaladefault.mostCurrent.__c.getField(true,"False");Debug.locals.put("ishas", _ishas);
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2447;BA.debugLine="If ishas Then";
Debug.ShouldStop(16384);
if (_ishas.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2448;BA.debugLine="MCode.lstChangeFeeKala.RemoveAt(c)";
Debug.ShouldStop(32768);
act_kaladefault.mostCurrent._mcode._lstchangefeekala /*RemoteObject*/ .runVoidMethod ("RemoveAt",(Object)(_c));
 };
 }else {
 BA.debugLineNum = 2454;BA.debugLine="MCode.SaveUpdate(\"Update TblSabad Set FldTeda";
Debug.ShouldStop(2097152);
act_kaladefault.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update TblSabad Set FldTedadDarSabadJoz = '"),_item.getField(true,"TedadDarSabadJoz" /*RemoteObject*/ ),RemoteObject.createImmutable("',FldTedadDarSabadKol = '"),_item.getField(true,"TedadDarSabadKol" /*RemoteObject*/ ),RemoteObject.createImmutable("',FldMablaghTakhfif = '"),_item.getField(true,"MablaghTakhfif" /*RemoteObject*/ ),RemoteObject.createImmutable("',FldDarsadTakhfif = '"),act_kaladefault.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(_item.getField(true,"fldDarsadTakhfif" /*RemoteObject*/ ))),RemoteObject.createImmutable("',fldFeeBadAzTakhfif = '"),act_kaladefault.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(_item.getField(true,"fldFeeBadAzTakhfif" /*RemoteObject*/ ))),RemoteObject.createImmutable("',FldEshantion = '"),_item.getField(true,"FldEshantion" /*RemoteObject*/ ),RemoteObject.createImmutable("',fldArzeshAfzode='"),_item.getField(true,"fldArzeshAfzodeKala" /*RemoteObject*/ ),RemoteObject.createImmutable("',fldDarsadArzeshAfzode='"),_item.getField(true,"fldDarsadArzeshAfzodeKala" /*RemoteObject*/ ),RemoteObject.createImmutable("' Where FldCodeKala = '"),_item.getField(true,"CodeKala" /*RemoteObject*/ ),RemoteObject.createImmutable("'"))));
 };
 BA.debugLineNum = 2457;BA.debugLine="Check = True";
Debug.ShouldStop(16777216);
_check = act_kaladefault.mostCurrent.__c.getField(true,"True");Debug.locals.put("Check", _check);
 BA.debugLineNum = 2458;BA.debugLine="Exit";
Debug.ShouldStop(33554432);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2461;BA.debugLine="If Check = False Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_check,act_kaladefault.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 2462;BA.debugLine="MCode.AddToSabad(Item)";
Debug.ShouldStop(536870912);
act_kaladefault.mostCurrent._mcode.runVoidMethod ("_addtosabad" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(_item));
 };
 BA.debugLineNum = 2464;BA.debugLine="RefreshLblSabad";
Debug.ShouldStop(-2147483648);
_refreshlblsabad();
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e53) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_kaladefault.processBA, e53.toString()); BA.debugLineNum = 2466;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2);
act_kaladefault.mostCurrent.__c.runVoidMethod ("LogImpl","538338621",BA.ObjectToString(act_kaladefault.mostCurrent.__c.runMethod(false,"LastException",act_kaladefault.mostCurrent.activityBA)),0);
 BA.debugLineNum = 2467;BA.debugLine="Log(LastException.Message)";
Debug.ShouldStop(4);
act_kaladefault.mostCurrent.__c.runVoidMethod ("LogImpl","538338622",act_kaladefault.mostCurrent.__c.runMethod(false,"LastException",act_kaladefault.mostCurrent.activityBA).runMethod(true,"getMessage"),0);
 BA.debugLineNum = 2471;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(64);
act_kaladefault.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_kaladefault.mostCurrent.__c.runMethod(false,"LastException",act_kaladefault.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_kaladefault.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-AddToSabad"))));
 };
 BA.debugLineNum = 2474;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _application_error(RemoteObject _error,RemoteObject _stacktrace) throws Exception{
try {
		Debug.PushSubsStack("Application_Error (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,2855);
if (RapidSub.canDelegate("application_error")) { return ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","application_error", _error, _stacktrace);}
Debug.locals.put("Error", _error);
Debug.locals.put("StackTrace", _stacktrace);
 BA.debugLineNum = 2855;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
Debug.ShouldStop(64);
 BA.debugLineNum = 2856;BA.debugLine="Log(\"Error KalaDefault: \"&Error)";
Debug.ShouldStop(128);
act_kaladefault.mostCurrent.__c.runVoidMethod ("LogImpl","539190529",RemoteObject.concat(RemoteObject.createImmutable("Error KalaDefault: "),_error),0);
 BA.debugLineNum = 2858;BA.debugLine="Return True";
Debug.ShouldStop(512);
if (true) return act_kaladefault.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 2859;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_back_click() throws Exception{
try {
		Debug.PushSubsStack("btn_Back_Click (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,1786);
if (RapidSub.canDelegate("btn_back_click")) { return ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","btn_back_click");}
RemoteObject _cu1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _res = RemoteObject.createImmutable(0);
 BA.debugLineNum = 1786;BA.debugLine="Sub btn_Back_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 1788;BA.debugLine="Dim Cu1 As Cursor = MCode.Result(\"Select * From T";
Debug.ShouldStop(134217728);
_cu1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu1 = act_kaladefault.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Select * From TblSabad")));Debug.locals.put("Cu1", _cu1);Debug.locals.put("Cu1", _cu1);
 BA.debugLineNum = 1789;BA.debugLine="If Cu1.RowCount>0 Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean(">",_cu1.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1790;BA.debugLine="Dim Res As Int = Msgbox2(\"با خارج شدن از این صفح";
Debug.ShouldStop(536870912);
_res = act_kaladefault.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("با خارج شدن از این صفحه، سبد خرید شما خالی میشود. آیا از این صفحه خارج می شوید؟")),(Object)(BA.ObjectToCharSequence("توجه")),(Object)(BA.ObjectToString("بله")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("خیر")),(Object)((act_kaladefault.mostCurrent.__c.getField(false,"Null"))),act_kaladefault.mostCurrent.activityBA);Debug.locals.put("Res", _res);Debug.locals.put("Res", _res);
 BA.debugLineNum = 1791;BA.debugLine="If Res = DialogResponse.POSITIVE Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, act_kaladefault.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 1792;BA.debugLine="MCode.SaveUpdate(\"delete from TblSabad\")";
Debug.ShouldStop(-2147483648);
act_kaladefault.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("delete from TblSabad")));
 BA.debugLineNum = 1793;BA.debugLine="If MCode.EshantionGroup=1 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",act_kaladefault.mostCurrent._mcode._eshantiongroup /*RemoteObject*/ ,BA.NumberToString(1))) { 
 BA.debugLineNum = 1794;BA.debugLine="MCode.SaveUpdate(\"Delete from tblEshantionGrou";
Debug.ShouldStop(2);
act_kaladefault.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Delete from tblEshantionGroupTemp")));
 };
 BA.debugLineNum = 1796;BA.debugLine="close";
Debug.ShouldStop(8);
_close();
 };
 }else {
 BA.debugLineNum = 1799;BA.debugLine="close";
Debug.ShouldStop(64);
_close();
 };
 BA.debugLineNum = 1802;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_discount_click(RemoteObject _item) throws Exception{
try {
		Debug.PushSubsStack("btn_discount_Click (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,2279);
if (RapidSub.canDelegate("btn_discount_click")) { return ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","btn_discount_click", _item);}
Debug.locals.put("Item", _item);
 BA.debugLineNum = 2279;BA.debugLine="Sub btn_discount_Click(Item As AdapterListKala)";
Debug.ShouldStop(64);
 BA.debugLineNum = 2280;BA.debugLine="Try";
Debug.ShouldStop(128);
try { BA.debugLineNum = 2281;BA.debugLine="PnlDarsadTakhfif.Visible=True";
Debug.ShouldStop(256);
act_kaladefault.mostCurrent._pnldarsadtakhfif.runMethod(true,"setVisible",act_kaladefault.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 2282;BA.debugLine="FeeType=\"btn_discount_Click\"";
Debug.ShouldStop(512);
act_kaladefault.mostCurrent._feetype = BA.ObjectToString("btn_discount_Click");
 BA.debugLineNum = 2283;BA.debugLine="ItemSelected=Item";
Debug.ShouldStop(1024);
act_kaladefault.mostCurrent._itemselected = _item;
 BA.debugLineNum = 2284;BA.debugLine="lblTitle.Text=\"مبلغ تخفیف را وارد کنید\"";
Debug.ShouldStop(2048);
act_kaladefault.mostCurrent._lbltitle.runMethod(true,"setText",BA.ObjectToCharSequence("مبلغ تخفیف را وارد کنید"));
 BA.debugLineNum = 2285;BA.debugLine="txtFee.Hint=\"مبلغ را وارد نمایید\"";
Debug.ShouldStop(4096);
act_kaladefault.mostCurrent._txtfee.runMethod(true,"setHint",BA.ObjectToString("مبلغ را وارد نمایید"));
 BA.debugLineNum = 2286;BA.debugLine="PnlFee.Visible=True";
Debug.ShouldStop(8192);
act_kaladefault.mostCurrent._pnlfee.runMethod(true,"setVisible",act_kaladefault.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 2287;BA.debugLine="MCode.AnimationOpen(PnlFee)";
Debug.ShouldStop(16384);
act_kaladefault.mostCurrent._mcode.runVoidMethod ("_animationopen" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)((act_kaladefault.mostCurrent._pnlfee.getObject())));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e10) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_kaladefault.processBA, e10.toString()); BA.debugLineNum = 2331;BA.debugLine="Log(LastException)";
Debug.ShouldStop(67108864);
act_kaladefault.mostCurrent.__c.runVoidMethod ("LogImpl","538142004",BA.ObjectToString(act_kaladefault.mostCurrent.__c.runMethod(false,"LastException",act_kaladefault.mostCurrent.activityBA)),0);
 BA.debugLineNum = 2332;BA.debugLine="myCode.SendError(LastException.Message,Activity.";
Debug.ShouldStop(134217728);
act_kaladefault.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(act_kaladefault.mostCurrent.__c.runMethod(false,"LastException",act_kaladefault.mostCurrent.activityBA).runMethod(true,"getMessage")),(Object)(RemoteObject.concat(act_kaladefault.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-btn_discount_Click"))));
 };
 BA.debugLineNum = 2335;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_edit_price_click(RemoteObject _item) throws Exception{
try {
		Debug.PushSubsStack("btn_edit_Price_Click (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,2184);
if (RapidSub.canDelegate("btn_edit_price_click")) { return ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","btn_edit_price_click", _item);}
Debug.locals.put("Item", _item);
 BA.debugLineNum = 2184;BA.debugLine="Sub btn_edit_Price_Click(Item As AdapterListKala)";
Debug.ShouldStop(128);
 BA.debugLineNum = 2185;BA.debugLine="Try";
Debug.ShouldStop(256);
try { BA.debugLineNum = 2186;BA.debugLine="PnlDarsadTakhfif.Visible=False";
Debug.ShouldStop(512);
act_kaladefault.mostCurrent._pnldarsadtakhfif.runMethod(true,"setVisible",act_kaladefault.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 2187;BA.debugLine="FeeType=\"btn_edit_Price_Click\"";
Debug.ShouldStop(1024);
act_kaladefault.mostCurrent._feetype = BA.ObjectToString("btn_edit_Price_Click");
 BA.debugLineNum = 2188;BA.debugLine="ItemSelected=Item";
Debug.ShouldStop(2048);
act_kaladefault.mostCurrent._itemselected = _item;
 BA.debugLineNum = 2189;BA.debugLine="lblTitle.Text=\"قیمت جدید را وارد کنید\"";
Debug.ShouldStop(4096);
act_kaladefault.mostCurrent._lbltitle.runMethod(true,"setText",BA.ObjectToCharSequence("قیمت جدید را وارد کنید"));
 BA.debugLineNum = 2190;BA.debugLine="txtFee.Hint=\"مبلغ را وارد نمایید\"";
Debug.ShouldStop(8192);
act_kaladefault.mostCurrent._txtfee.runMethod(true,"setHint",BA.ObjectToString("مبلغ را وارد نمایید"));
 BA.debugLineNum = 2191;BA.debugLine="PnlFee.Visible=True";
Debug.ShouldStop(16384);
act_kaladefault.mostCurrent._pnlfee.runMethod(true,"setVisible",act_kaladefault.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 2192;BA.debugLine="MCode.AnimationOpen(PnlFee)";
Debug.ShouldStop(32768);
act_kaladefault.mostCurrent._mcode.runVoidMethod ("_animationopen" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)((act_kaladefault.mostCurrent._pnlfee.getObject())));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e10) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_kaladefault.processBA, e10.toString()); BA.debugLineNum = 2229;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1048576);
act_kaladefault.mostCurrent.__c.runVoidMethod ("LogImpl","537945389",BA.ObjectToString(act_kaladefault.mostCurrent.__c.runMethod(false,"LastException",act_kaladefault.mostCurrent.activityBA)),0);
 BA.debugLineNum = 2230;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(2097152);
act_kaladefault.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_kaladefault.mostCurrent.__c.runMethod(false,"LastException",act_kaladefault.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_kaladefault.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-btn_edit_Price_Click"))));
 };
 BA.debugLineNum = 2233;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnclose_click() throws Exception{
try {
		Debug.PushSubsStack("btnClose_Click (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,2069);
if (RapidSub.canDelegate("btnclose_click")) { return ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","btnclose_click");}
 BA.debugLineNum = 2069;BA.debugLine="Private Sub btnClose_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 2070;BA.debugLine="PnlFee.Visible=False";
Debug.ShouldStop(2097152);
act_kaladefault.mostCurrent._pnlfee.runMethod(true,"setVisible",act_kaladefault.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 2071;BA.debugLine="MCode.AnimationClose(PnlFee)";
Debug.ShouldStop(4194304);
act_kaladefault.mostCurrent._mcode.runVoidMethod ("_animationclose" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)((act_kaladefault.mostCurrent._pnlfee.getObject())));
 BA.debugLineNum = 2073;BA.debugLine="txtFee.Text=\"0\"";
Debug.ShouldStop(16777216);
act_kaladefault.mostCurrent._txtfee.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("0"));
 BA.debugLineNum = 2074;BA.debugLine="txtDarsadTakhfif.Text=\"0\"";
Debug.ShouldStop(33554432);
act_kaladefault.mostCurrent._txtdarsadtakhfif.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("0"));
 BA.debugLineNum = 2075;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btncloseeshantiongroup_click() throws Exception{
try {
		Debug.PushSubsStack("btnCloseEshantionGroup_Click (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,2978);
if (RapidSub.canDelegate("btncloseeshantiongroup_click")) { return ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","btncloseeshantiongroup_click");}
 BA.debugLineNum = 2978;BA.debugLine="Private Sub btnCloseEshantionGroup_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 2979;BA.debugLine="PnlEshantion.Visible=False";
Debug.ShouldStop(4);
act_kaladefault.mostCurrent._pnleshantion.runMethod(true,"setVisible",act_kaladefault.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 2980;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btncloserestorpnl_click() throws Exception{
try {
		Debug.PushSubsStack("btnCloseRestorpnl_Click (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,2802);
if (RapidSub.canDelegate("btncloserestorpnl_click")) { return ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","btncloserestorpnl_click");}
 BA.debugLineNum = 2802;BA.debugLine="Sub btnCloseRestorpnl_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 2804;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btncommentexit_click() throws Exception{
try {
		Debug.PushSubsStack("BtnCommentExit_Click (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,1717);
if (RapidSub.canDelegate("btncommentexit_click")) { return ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","btncommentexit_click");}
 BA.debugLineNum = 1717;BA.debugLine="Sub BtnCommentExit_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 1718;BA.debugLine="pnlFilter.SetVisibleAnimated(300,False)";
Debug.ShouldStop(2097152);
act_kaladefault.mostCurrent._pnlfilter.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 300)),(Object)(act_kaladefault.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 1719;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnmenugroup_click() throws Exception{
try {
		Debug.PushSubsStack("btnMenuGroup_Click (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,2923);
if (RapidSub.canDelegate("btnmenugroup_click")) { return ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","btnmenugroup_click");}
 BA.debugLineNum = 2923;BA.debugLine="Private Sub btnMenuGroup_Click";
Debug.ShouldStop(1024);
 BA.debugLineNum = 2924;BA.debugLine="sidemenu.ShowMenu";
Debug.ShouldStop(2048);
act_kaladefault.mostCurrent._sidemenu.runVoidMethod ("ShowMenu");
 BA.debugLineNum = 2925;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnsavefee_click() throws Exception{
try {
		Debug.PushSubsStack("btnSaveFee_Click (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,2105);
if (RapidSub.canDelegate("btnsavefee_click")) { return ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","btnsavefee_click");}
RemoteObject _res = RemoteObject.createImmutable(0L);
RemoteObject _tedadkol1 = RemoteObject.createImmutable("");
RemoteObject _feekol = RemoteObject.createImmutable("");
RemoteObject _tedadkol = RemoteObject.createImmutable(0);
RemoteObject _feefeebadaztakhfifkala = RemoteObject.createImmutable(0);
RemoteObject _feebadaztakhfif = RemoteObject.createImmutable(0);
 BA.debugLineNum = 2105;BA.debugLine="Private Sub btnSaveFee_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 2106;BA.debugLine="Select FeeType";
Debug.ShouldStop(33554432);
switch (BA.switchObjectToInt(act_kaladefault.mostCurrent._feetype,BA.ObjectToString("btn_edit_Price_Click"),BA.ObjectToString("btn_discount_Click"))) {
case 0: {
 BA.debugLineNum = 2108;BA.debugLine="If txtFee.Text=\"\" Then txtFee.Text=0";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",act_kaladefault.mostCurrent._txtfee.runMethod(true,"getText"),BA.ObjectToString(""))) { 
act_kaladefault.mostCurrent._txtfee.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(0));};
 BA.debugLineNum = 2109;BA.debugLine="Dim res As Long = MCode.RemoveqomaAshar(txtFee.";
Debug.ShouldStop(268435456);
_res = BA.numberCast(long.class, act_kaladefault.mostCurrent._mcode.runMethod(true,"_removeqomaashar" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(act_kaladefault.mostCurrent._txtfee.runMethod(true,"getText"))));Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 2110;BA.debugLine="ItemSelected.FeeForoosh=res";
Debug.ShouldStop(536870912);
act_kaladefault.mostCurrent._itemselected.setField ("FeeForoosh" /*RemoteObject*/ ,BA.numberCast(int.class, _res));
 BA.debugLineNum = 2112;BA.debugLine="If myCode.Is_Null_adad(ItemSelected.fldDarsadTa";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, act_kaladefault.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(act_kaladefault.mostCurrent._itemselected.getField(true,"fldDarsadTakhfif" /*RemoteObject*/ )))),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2113;BA.debugLine="Dim tedadKol1 As String=myCode.Is_Null_adad(It";
Debug.ShouldStop(1);
_tedadkol1 = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, act_kaladefault.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(act_kaladefault.mostCurrent._itemselected.getField(true,"TedadDarSabadJoz" /*RemoteObject*/ )))),(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, act_kaladefault.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(act_kaladefault.mostCurrent._itemselected.getField(true,"TedadDarSabadKol" /*RemoteObject*/ )))),BA.numberCast(double.class, act_kaladefault.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(act_kaladefault.mostCurrent._itemselected.getField(true,"TedadDarKarton" /*RemoteObject*/ ))))}, "*",0, 0))}, "+",1, 0));Debug.locals.put("tedadKol1", _tedadkol1);Debug.locals.put("tedadKol1", _tedadkol1);
 BA.debugLineNum = 2114;BA.debugLine="Dim FeeKol As String=(ItemSelected.FeeForoosh*";
Debug.ShouldStop(2);
_feekol = BA.NumberToString((RemoteObject.solve(new RemoteObject[] {act_kaladefault.mostCurrent._itemselected.getField(true,"FeeForoosh" /*RemoteObject*/ ),BA.numberCast(double.class, _tedadkol1)}, "*",0, 0)));Debug.locals.put("FeeKol", _feekol);Debug.locals.put("FeeKol", _feekol);
 BA.debugLineNum = 2115;BA.debugLine="If tedadKol1>0 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _tedadkol1),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2116;BA.debugLine="ItemSelected.MablaghTakhfif=(((ItemSelected.F";
Debug.ShouldStop(8);
act_kaladefault.mostCurrent._itemselected.setField ("MablaghTakhfif" /*RemoteObject*/ ,BA.numberCast(int.class, (RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {act_kaladefault.mostCurrent._itemselected.getField(true,"FeeForoosh" /*RemoteObject*/ ),BA.numberCast(double.class, _tedadkol1)}, "*",0, 0)),BA.numberCast(double.class, act_kaladefault.mostCurrent._itemselected.getField(true,"fldDarsadTakhfif" /*RemoteObject*/ ))}, "*",0, 0)),RemoteObject.createImmutable(100)}, "/",0, 0))));
 BA.debugLineNum = 2117;BA.debugLine="ItemSelected.fldFeeBadAzTakhfif=FeeKol-ItemSe";
Debug.ShouldStop(16);
act_kaladefault.mostCurrent._itemselected.setField ("fldFeeBadAzTakhfif" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _feekol),act_kaladefault.mostCurrent._itemselected.getField(true,"MablaghTakhfif" /*RemoteObject*/ )}, "-",1, 0)));
 }else {
 BA.debugLineNum = 2119;BA.debugLine="If myCode.Is_Null_adad(ItemSelected.fldDarsad";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, act_kaladefault.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(act_kaladefault.mostCurrent._itemselected.getField(true,"fldDarsadTakhfif" /*RemoteObject*/ )))),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2120;BA.debugLine="ItemSelected.MablaghTakhfif=(((ItemSelected.";
Debug.ShouldStop(128);
act_kaladefault.mostCurrent._itemselected.setField ("MablaghTakhfif" /*RemoteObject*/ ,BA.numberCast(int.class, (RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {(act_kaladefault.mostCurrent._itemselected.getField(true,"FeeForoosh" /*RemoteObject*/ )),BA.numberCast(double.class, act_kaladefault.mostCurrent._itemselected.getField(true,"fldDarsadTakhfif" /*RemoteObject*/ ))}, "*",0, 0)),RemoteObject.createImmutable(100)}, "/",0, 0))));
 BA.debugLineNum = 2121;BA.debugLine="ItemSelected.fldFeeBadAzTakhfif=ItemSelected";
Debug.ShouldStop(256);
act_kaladefault.mostCurrent._itemselected.setField ("fldFeeBadAzTakhfif" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {act_kaladefault.mostCurrent._itemselected.getField(true,"FeeForoosh" /*RemoteObject*/ ),act_kaladefault.mostCurrent._itemselected.getField(true,"MablaghTakhfif" /*RemoteObject*/ )}, "-",1, 1)));
 };
 };
 };
 BA.debugLineNum = 2130;BA.debugLine="MCode.UpdateFeeSabad2(ItemSelected)";
Debug.ShouldStop(131072);
act_kaladefault.mostCurrent._mcode.runVoidMethod ("_updatefeesabad2" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(act_kaladefault.mostCurrent._itemselected));
 BA.debugLineNum = 2131;BA.debugLine="RefreshLblSabad";
Debug.ShouldStop(262144);
_refreshlblsabad();
 BA.debugLineNum = 2133;BA.debugLine="HLV.notifyDataSetChanged";
Debug.ShouldStop(1048576);
act_kaladefault.mostCurrent._hlv.runVoidMethodAndSync ("notifyDataSetChanged");
 break; }
case 1: {
 BA.debugLineNum = 2135;BA.debugLine="If txtFee.Text=\"\" Then txtFee.Text=0";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",act_kaladefault.mostCurrent._txtfee.runMethod(true,"getText"),BA.ObjectToString(""))) { 
act_kaladefault.mostCurrent._txtfee.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(0));};
 BA.debugLineNum = 2136;BA.debugLine="Dim res As Long =  MCode.RemoveqomaAshar(txtFee";
Debug.ShouldStop(8388608);
_res = BA.numberCast(long.class, act_kaladefault.mostCurrent._mcode.runMethod(true,"_removeqomaashar" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(act_kaladefault.mostCurrent._txtfee.runMethod(true,"getText"))));Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 2137;BA.debugLine="Dim tedadKol As Int =ItemSelected.TedadDarSabad";
Debug.ShouldStop(16777216);
_tedadkol = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, act_kaladefault.mostCurrent._itemselected.getField(true,"TedadDarSabadJoz" /*RemoteObject*/ )),(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, act_kaladefault.mostCurrent._itemselected.getField(true,"TedadDarSabadKol" /*RemoteObject*/ )),BA.numberCast(double.class, act_kaladefault.mostCurrent._itemselected.getField(true,"TedadDarKarton" /*RemoteObject*/ ))}, "*",0, 0))}, "+",1, 0));Debug.locals.put("tedadKol", _tedadkol);Debug.locals.put("tedadKol", _tedadkol);
 BA.debugLineNum = 2138;BA.debugLine="If ItemSelected.FeeForoosh<res And tedadKol<2 T";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("<",act_kaladefault.mostCurrent._itemselected.getField(true,"FeeForoosh" /*RemoteObject*/ ),BA.numberCast(double.class, _res)) && RemoteObject.solveBoolean("<",_tedadkol,BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 2139;BA.debugLine="ToastMessageShow(\"مبلغ تخفیف نمیتواند بیشتر از";
Debug.ShouldStop(67108864);
act_kaladefault.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("مبلغ تخفیف نمیتواند بیشتر از فی فروش باشد")),(Object)(act_kaladefault.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 2140;BA.debugLine="Return";
Debug.ShouldStop(134217728);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 2149;BA.debugLine="Dim feefeebadaztakhfifKala As Int=MCode.SingleR";
Debug.ShouldStop(16);
_feefeebadaztakhfifkala = BA.numberCast(int.class, act_kaladefault.mostCurrent._mcode.runMethod(false,"_singleresult" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("SELECT fldFeeBadAzTakhfif FROM TblKala WHERE fldCodeKala='"),act_kaladefault.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((act_kaladefault.mostCurrent._itemselected.getField(true,"CodeKala" /*RemoteObject*/ )))),RemoteObject.createImmutable("'"))))));Debug.locals.put("feefeebadaztakhfifKala", _feefeebadaztakhfifkala);Debug.locals.put("feefeebadaztakhfifKala", _feefeebadaztakhfifkala);
 BA.debugLineNum = 2150;BA.debugLine="Dim feebadaztakhfif As Int=ItemSelected.fldFeeB";
Debug.ShouldStop(32);
_feebadaztakhfif = BA.numberCast(int.class, act_kaladefault.mostCurrent._itemselected.getField(true,"fldFeeBadAzTakhfif" /*RemoteObject*/ ));Debug.locals.put("feebadaztakhfif", _feebadaztakhfif);Debug.locals.put("feebadaztakhfif", _feebadaztakhfif);
 BA.debugLineNum = 2151;BA.debugLine="If txtDarsadTakhfif.Text=100 Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",act_kaladefault.mostCurrent._txtdarsadtakhfif.runMethod(true,"getText"),BA.NumberToString(100))) { 
 BA.debugLineNum = 2152;BA.debugLine="ItemSelected.fldFeeBadAzTakhfif=0";
Debug.ShouldStop(128);
act_kaladefault.mostCurrent._itemselected.setField ("fldFeeBadAzTakhfif" /*RemoteObject*/ ,BA.NumberToString(0));
 }else {
 BA.debugLineNum = 2154;BA.debugLine="If res>0 And feebadaztakhfif=0 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean(">",_res,BA.numberCast(long.class, 0)) && RemoteObject.solveBoolean("=",_feebadaztakhfif,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2155;BA.debugLine="ItemSelected.fldFeeBadAzTakhfif=(ItemSelected.";
Debug.ShouldStop(1024);
act_kaladefault.mostCurrent._itemselected.setField ("fldFeeBadAzTakhfif" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {act_kaladefault.mostCurrent._itemselected.getField(true,"FeeForoosh" /*RemoteObject*/ ),_tedadkol}, "*",0, 1)),_res}, "-",1, 2)));
 BA.debugLineNum = 2156;BA.debugLine="ToastMessageShow(\"تخفیف با موفقیت اعمال شد ، ج";
Debug.ShouldStop(2048);
act_kaladefault.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("تخفیف با موفقیت اعمال شد ، جهت انصراف از تخفیف مبلغ تخفیف را صفر وارد نمایید.")),(Object)(act_kaladefault.mostCurrent.__c.getField(true,"True")));
 }else 
{ BA.debugLineNum = 2157;BA.debugLine="Else If res>0 And feebadaztakhfif>0 Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean(">",_res,BA.numberCast(long.class, 0)) && RemoteObject.solveBoolean(">",_feebadaztakhfif,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2158;BA.debugLine="ItemSelected.fldFeeBadAzTakhfif=feebadaztakhf";
Debug.ShouldStop(8192);
act_kaladefault.mostCurrent._itemselected.setField ("fldFeeBadAzTakhfif" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {_feebadaztakhfif,_res}, "-",1, 2)));
 BA.debugLineNum = 2159;BA.debugLine="ToastMessageShow(\"تخفیف با موفقیت اعمال شد ،";
Debug.ShouldStop(16384);
act_kaladefault.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("تخفیف با موفقیت اعمال شد ، جهت انصراف از تخفیف مبلغ تخفیف را صفر وارد نمایید.")),(Object)(act_kaladefault.mostCurrent.__c.getField(true,"True")));
 }else 
{ BA.debugLineNum = 2160;BA.debugLine="Else if res=0 And feebadaztakhfif=0 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(long.class, 0)) && RemoteObject.solveBoolean("=",_feebadaztakhfif,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2161;BA.debugLine="ItemSelected.fldFeeBadAzTakhfif=res";
Debug.ShouldStop(65536);
act_kaladefault.mostCurrent._itemselected.setField ("fldFeeBadAzTakhfif" /*RemoteObject*/ ,BA.NumberToString(_res));
 BA.debugLineNum = 2162;BA.debugLine="ItemSelected.MablaghTakhfif=res";
Debug.ShouldStop(131072);
act_kaladefault.mostCurrent._itemselected.setField ("MablaghTakhfif" /*RemoteObject*/ ,BA.numberCast(int.class, _res));
 }else 
{ BA.debugLineNum = 2163;BA.debugLine="Else if res=0 And feefeebadaztakhfifKala=0 The";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(long.class, 0)) && RemoteObject.solveBoolean("=",_feefeebadaztakhfifkala,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2164;BA.debugLine="ItemSelected.fldFeeBadAzTakhfif=0";
Debug.ShouldStop(524288);
act_kaladefault.mostCurrent._itemselected.setField ("fldFeeBadAzTakhfif" /*RemoteObject*/ ,BA.NumberToString(0));
 }else 
{ BA.debugLineNum = 2165;BA.debugLine="Else if res=0 And feebadaztakhfif>0 Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(long.class, 0)) && RemoteObject.solveBoolean(">",_feebadaztakhfif,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2167;BA.debugLine="ItemSelected.fldFeeBadAzTakhfif=feebadaztakhf";
Debug.ShouldStop(4194304);
act_kaladefault.mostCurrent._itemselected.setField ("fldFeeBadAzTakhfif" /*RemoteObject*/ ,BA.NumberToString(_feebadaztakhfif));
 }else 
{ BA.debugLineNum = 2168;BA.debugLine="Else if res=0 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(long.class, 0))) { 
 BA.debugLineNum = 2169;BA.debugLine="ItemSelected.fldFeeBadAzTakhfif=0";
Debug.ShouldStop(16777216);
act_kaladefault.mostCurrent._itemselected.setField ("fldFeeBadAzTakhfif" /*RemoteObject*/ ,BA.NumberToString(0));
 }}}}}}
;
 };
 BA.debugLineNum = 2172;BA.debugLine="ItemSelected.MablaghTakhfif=res";
Debug.ShouldStop(134217728);
act_kaladefault.mostCurrent._itemselected.setField ("MablaghTakhfif" /*RemoteObject*/ ,BA.numberCast(int.class, _res));
 BA.debugLineNum = 2173;BA.debugLine="ItemSelected.fldDarsadTakhfif=myCode.Is_Null_ad";
Debug.ShouldStop(268435456);
act_kaladefault.mostCurrent._itemselected.setField ("fldDarsadTakhfif" /*RemoteObject*/ ,act_kaladefault.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(act_kaladefault.mostCurrent._txtdarsadtakhfif.runMethod(true,"getText"))));
 BA.debugLineNum = 2174;BA.debugLine="If FeeTip>0 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, act_kaladefault._feetip),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2175;BA.debugLine="FeeTip=FeeTip-1";
Debug.ShouldStop(1073741824);
act_kaladefault._feetip = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, act_kaladefault._feetip),RemoteObject.createImmutable(1)}, "-",1, 0));
 };
 BA.debugLineNum = 2177;BA.debugLine="MCode.UpdateNoeTasvieDarSabad(FeeTip,ItemSelect";
Debug.ShouldStop(1);
act_kaladefault.mostCurrent._mcode.runVoidMethod ("_updatenoetasviedarsabad" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, act_kaladefault._feetip)),(Object)(act_kaladefault.mostCurrent._itemselected));
 BA.debugLineNum = 2178;BA.debugLine="RefreshLblSabad";
Debug.ShouldStop(2);
_refreshlblsabad();
 BA.debugLineNum = 2179;BA.debugLine="HLV.notifyDataSetChanged";
Debug.ShouldStop(4);
act_kaladefault.mostCurrent._hlv.runVoidMethodAndSync ("notifyDataSetChanged");
 break; }
}
;
 BA.debugLineNum = 2182;BA.debugLine="btnClose_Click";
Debug.ShouldStop(32);
_btnclose_click();
 BA.debugLineNum = 2183;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnsearch_click() throws Exception{
try {
		Debug.PushSubsStack("BtnSearch_Click (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,1883);
if (RapidSub.canDelegate("btnsearch_click")) { return ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","btnsearch_click");}
 BA.debugLineNum = 1883;BA.debugLine="Sub BtnSearch_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 1885;BA.debugLine="Try";
Debug.ShouldStop(268435456);
try { BA.debugLineNum = 1895;BA.debugLine="LoadKala";
Debug.ShouldStop(64);
_loadkala();
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e4) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_kaladefault.processBA, e4.toString()); BA.debugLineNum = 1897;BA.debugLine="Log(LastException)";
Debug.ShouldStop(256);
act_kaladefault.mostCurrent.__c.runVoidMethod ("LogImpl","537158926",BA.ObjectToString(act_kaladefault.mostCurrent.__c.runMethod(false,"LastException",act_kaladefault.mostCurrent.activityBA)),0);
 BA.debugLineNum = 1898;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(512);
act_kaladefault.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_kaladefault.mostCurrent.__c.runMethod(false,"LastException",act_kaladefault.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_kaladefault.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-BtnSearch_Click"))));
 };
 BA.debugLineNum = 1900;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btnshowfilterpnl_click() throws Exception{
try {
		Debug.PushSubsStack("BtnShowFilterPnl_Click (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,1721);
if (RapidSub.canDelegate("btnshowfilterpnl_click")) { ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","btnshowfilterpnl_click"); return;}
ResumableSub_BtnShowFilterPnl_Click rsub = new ResumableSub_BtnShowFilterPnl_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_BtnShowFilterPnl_Click extends BA.ResumableSub {
public ResumableSub_BtnShowFilterPnl_Click(ir.parsikhesab.pakhsh.act_kaladefault parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_kaladefault parent;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("BtnShowFilterPnl_Click (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,1721);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 1722;BA.debugLine="Sleep(200)";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("Sleep",act_kaladefault.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_kaladefault", "btnshowfilterpnl_click"),BA.numberCast(int.class, 200));
this.state = 7;
return;
case 7:
//C
this.state = 1;
;
 BA.debugLineNum = 1723;BA.debugLine="If Panel2.Height = Label11.top Then";
Debug.ShouldStop(67108864);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._panel2.runMethod(true,"getHeight"),BA.numberCast(double.class, parent.mostCurrent._label11.runMethod(true,"getTop")))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 1724;BA.debugLine="Panel2.SetLayoutAnimated(500,Panel2.Left,Panel2.";
Debug.ShouldStop(134217728);
parent.mostCurrent._panel2.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 500)),(Object)(parent.mostCurrent._panel2.runMethod(true,"getLeft")),(Object)(parent.mostCurrent._panel2.runMethod(true,"getTop")),(Object)(parent.mostCurrent._panel2.runMethod(true,"getWidth")),(Object)(RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._lblpoint.runMethod(true,"getTop"),parent.mostCurrent._lblpoint.runMethod(true,"getHeight")}, "+",1, 1)));
 BA.debugLineNum = 1725;BA.debugLine="Pnl_Tools.SetLayoutAnimated(500,Pnl_Tools.Left,P";
Debug.ShouldStop(268435456);
parent.mostCurrent._pnl_tools.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 500)),(Object)(parent.mostCurrent._pnl_tools.runMethod(true,"getLeft")),(Object)(RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._panel2.runMethod(true,"getTop"),parent.mostCurrent._panel2.runMethod(true,"getHeight"),parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),act_kaladefault.mostCurrent.activityBA)}, "++",2, 1)),(Object)(parent.mostCurrent._pnl_tools.runMethod(true,"getWidth")),(Object)(parent.mostCurrent._pnl_tools.runMethod(true,"getHeight")));
 BA.debugLineNum = 1726;BA.debugLine="pnl_HLV.SetLayoutAnimated(500,pnl_HLV.Left,Pnl_T";
Debug.ShouldStop(536870912);
parent.mostCurrent._pnl_hlv.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 500)),(Object)(parent.mostCurrent._pnl_hlv.runMethod(true,"getLeft")),(Object)(RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._pnl_tools.runMethod(true,"getTop"),parent.mostCurrent._pnl_tools.runMethod(true,"getHeight")}, "+",1, 1)),(Object)(parent.mostCurrent._pnl_hlv.runMethod(true,"getWidth")),(Object)(RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._pnl_down.runMethod(true,"getTop"),parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 13)),act_kaladefault.mostCurrent.activityBA),parent.mostCurrent._pnl_tools.runMethod(true,"getTop"),parent.mostCurrent._pnl_tools.runMethod(true,"getHeight")}, "--+",3, 1)));
 BA.debugLineNum = 1727;BA.debugLine="HLV.Height=pnl_HLV.Height - 15%y";
Debug.ShouldStop(1073741824);
parent.mostCurrent._hlv.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._pnl_hlv.runMethod(true,"getHeight"),parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 15)),act_kaladefault.mostCurrent.activityBA)}, "-",1, 1));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1729;BA.debugLine="Panel2.SetLayoutAnimated(500,Panel2.Left,Panel2.";
Debug.ShouldStop(1);
parent.mostCurrent._panel2.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 500)),(Object)(parent.mostCurrent._panel2.runMethod(true,"getLeft")),(Object)(parent.mostCurrent._panel2.runMethod(true,"getTop")),(Object)(parent.mostCurrent._panel2.runMethod(true,"getWidth")),(Object)(parent.mostCurrent._label11.runMethod(true,"getTop")));
 BA.debugLineNum = 1730;BA.debugLine="Pnl_Tools.SetLayoutAnimated(500,Pnl_Tools.Left,P";
Debug.ShouldStop(2);
parent.mostCurrent._pnl_tools.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 500)),(Object)(parent.mostCurrent._pnl_tools.runMethod(true,"getLeft")),(Object)(RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._pnl_top.runMethod(true,"getTop"),parent.mostCurrent._pnl_top.runMethod(true,"getHeight")}, "+",1, 1)),(Object)(parent.mostCurrent._pnl_tools.runMethod(true,"getWidth")),(Object)(parent.mostCurrent._pnl_tools.runMethod(true,"getHeight")));
 BA.debugLineNum = 1731;BA.debugLine="pnl_HLV.SetLayoutAnimated(500,pnl_HLV.Left,Pnl_T";
Debug.ShouldStop(4);
parent.mostCurrent._pnl_hlv.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 500)),(Object)(parent.mostCurrent._pnl_hlv.runMethod(true,"getLeft")),(Object)(RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._pnl_tools.runMethod(true,"getTop"),parent.mostCurrent._pnl_tools.runMethod(true,"getHeight")}, "+",1, 1)),(Object)(parent.mostCurrent._pnl_hlv.runMethod(true,"getWidth")),(Object)(RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._pnl_down.runMethod(true,"getTop"),parent.mostCurrent._pnl_tools.runMethod(true,"getTop"),parent.mostCurrent._pnl_tools.runMethod(true,"getHeight")}, "-+",2, 1)));
 BA.debugLineNum = 1732;BA.debugLine="HLV.Height=pnl_HLV.Height - 28%y";
Debug.ShouldStop(8);
parent.mostCurrent._hlv.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._pnl_hlv.runMethod(true,"getHeight"),parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 28)),act_kaladefault.mostCurrent.activityBA)}, "-",1, 1));
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 1734;BA.debugLine="Sleep(200)";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("Sleep",act_kaladefault.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_kaladefault", "btnshowfilterpnl_click"),BA.numberCast(int.class, 200));
this.state = 8;
return;
case 8:
//C
this.state = -1;
;
 BA.debugLineNum = 1735;BA.debugLine="End Sub";
Debug.ShouldStop(64);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _btnshowsumfilterpnl_click() throws Exception{
try {
		Debug.PushSubsStack("BtnShowSumFilterPnl_Click (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,1737);
if (RapidSub.canDelegate("btnshowsumfilterpnl_click")) { ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","btnshowsumfilterpnl_click"); return;}
ResumableSub_BtnShowSumFilterPnl_Click rsub = new ResumableSub_BtnShowSumFilterPnl_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_BtnShowSumFilterPnl_Click extends BA.ResumableSub {
public ResumableSub_BtnShowSumFilterPnl_Click(ir.parsikhesab.pakhsh.act_kaladefault parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_kaladefault parent;
RemoteObject _t1 = RemoteObject.createImmutable(0);
RemoteObject _h1 = RemoteObject.createImmutable(0);
RemoteObject _t2 = RemoteObject.createImmutable(0);
RemoteObject _h2 = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("BtnShowSumFilterPnl_Click (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,1737);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 1738;BA.debugLine="Sleep(200)";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("Sleep",act_kaladefault.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_kaladefault", "btnshowsumfilterpnl_click"),BA.numberCast(int.class, 200));
this.state = 7;
return;
case 7:
//C
this.state = 1;
;
 BA.debugLineNum = 1740;BA.debugLine="Log(\"top1: \"& Panel9.Top)";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","536831235",RemoteObject.concat(RemoteObject.createImmutable("top1: "),parent.mostCurrent._panel9.runMethod(true,"getTop")),0);
 BA.debugLineNum = 1741;BA.debugLine="Log(\"Height1: \"& Panel9.Height)";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","536831236",RemoteObject.concat(RemoteObject.createImmutable("Height1: "),parent.mostCurrent._panel9.runMethod(true,"getHeight")),0);
 BA.debugLineNum = 1744;BA.debugLine="Dim t1,h1 As Int";
Debug.ShouldStop(32768);
_t1 = RemoteObject.createImmutable(0);Debug.locals.put("t1", _t1);
_h1 = RemoteObject.createImmutable(0);Debug.locals.put("h1", _h1);
 BA.debugLineNum = 1745;BA.debugLine="Dim t2,h2 As Int";
Debug.ShouldStop(65536);
_t2 = RemoteObject.createImmutable(0);Debug.locals.put("t2", _t2);
_h2 = RemoteObject.createImmutable(0);Debug.locals.put("h2", _h2);
 BA.debugLineNum = 1748;BA.debugLine="If Panel9.Top=75%y Then";
Debug.ShouldStop(524288);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._panel9.runMethod(true,"getTop"),BA.numberCast(double.class, parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 75)),act_kaladefault.mostCurrent.activityBA)))) { 
this.state = 3;
}else 
{ BA.debugLineNum = 1759;BA.debugLine="Else If Panel9.Top=88%y Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",parent.mostCurrent._panel9.runMethod(true,"getTop"),BA.numberCast(double.class, parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 88)),act_kaladefault.mostCurrent.activityBA)))) { 
this.state = 5;
}}
if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 1751;BA.debugLine="t1=75%y '2";
Debug.ShouldStop(4194304);
_t1 = parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 75)),act_kaladefault.mostCurrent.activityBA);Debug.locals.put("t1", _t1);
 BA.debugLineNum = 1752;BA.debugLine="h1=19%y '2";
Debug.ShouldStop(8388608);
_h1 = parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 19)),act_kaladefault.mostCurrent.activityBA);Debug.locals.put("h1", _h1);
 BA.debugLineNum = 1754;BA.debugLine="t2=88%y '1";
Debug.ShouldStop(33554432);
_t2 = parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 88)),act_kaladefault.mostCurrent.activityBA);Debug.locals.put("t2", _t2);
 BA.debugLineNum = 1755;BA.debugLine="h2=6%y '1";
Debug.ShouldStop(67108864);
_h2 = parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 6)),act_kaladefault.mostCurrent.activityBA);Debug.locals.put("h2", _h2);
 BA.debugLineNum = 1757;BA.debugLine="BtnShowSumFilterPnl.Text=Chr(0xF139)";
Debug.ShouldStop(268435456);
parent.mostCurrent._btnshowsumfilterpnl.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xf139))))));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1761;BA.debugLine="t1=88%y '1";
Debug.ShouldStop(1);
_t1 = parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 88)),act_kaladefault.mostCurrent.activityBA);Debug.locals.put("t1", _t1);
 BA.debugLineNum = 1762;BA.debugLine="h1=6%y '1";
Debug.ShouldStop(2);
_h1 = parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 6)),act_kaladefault.mostCurrent.activityBA);Debug.locals.put("h1", _h1);
 BA.debugLineNum = 1764;BA.debugLine="t2=75%y '2";
Debug.ShouldStop(8);
_t2 = parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 75)),act_kaladefault.mostCurrent.activityBA);Debug.locals.put("t2", _t2);
 BA.debugLineNum = 1765;BA.debugLine="h2=19%y '2";
Debug.ShouldStop(16);
_h2 = parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 19)),act_kaladefault.mostCurrent.activityBA);Debug.locals.put("h2", _h2);
 BA.debugLineNum = 1767;BA.debugLine="BtnShowSumFilterPnl.Text=Chr(0xF13A)";
Debug.ShouldStop(64);
parent.mostCurrent._btnshowsumfilterpnl.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xf13a))))));
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 1770;BA.debugLine="Panel9.SetLayoutAnimated(500,Panel9.Left,t1,Panel";
Debug.ShouldStop(512);
parent.mostCurrent._panel9.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 500)),(Object)(parent.mostCurrent._panel9.runMethod(true,"getLeft")),(Object)(_t1),(Object)(parent.mostCurrent._panel9.runMethod(true,"getWidth")),(Object)(_h1));
 BA.debugLineNum = 1771;BA.debugLine="Panel9.SetLayoutAnimated(500,Panel9.Left,t2,Panel";
Debug.ShouldStop(1024);
parent.mostCurrent._panel9.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 500)),(Object)(parent.mostCurrent._panel9.runMethod(true,"getLeft")),(Object)(_t2),(Object)(parent.mostCurrent._panel9.runMethod(true,"getWidth")),(Object)(_h2));
 BA.debugLineNum = 1772;BA.debugLine="pnl_HLV.SetLayoutAnimated(500,pnl_HLV.Left,pnl_HL";
Debug.ShouldStop(2048);
parent.mostCurrent._pnl_hlv.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 500)),(Object)(parent.mostCurrent._pnl_hlv.runMethod(true,"getLeft")),(Object)(parent.mostCurrent._pnl_hlv.runMethod(true,"getTop")),(Object)(parent.mostCurrent._pnl_hlv.runMethod(true,"getWidth")),(Object)(RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._panel9.runMethod(true,"getTop"),parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 25)),act_kaladefault.mostCurrent.activityBA)}, "-",1, 1)));
 BA.debugLineNum = 1773;BA.debugLine="HLV.SetLayoutAnimated(500,HLV.Left,HLV.Top,HLV.Wi";
Debug.ShouldStop(4096);
parent.mostCurrent._hlv.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 500)),(Object)(parent.mostCurrent._hlv.runMethod(true,"getLeft")),(Object)(parent.mostCurrent._hlv.runMethod(true,"getTop")),(Object)(parent.mostCurrent._hlv.runMethod(true,"getWidth")),(Object)(RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._panel9.runMethod(true,"getTop"),parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 25)),act_kaladefault.mostCurrent.activityBA)}, "-",1, 1)));
 BA.debugLineNum = 1774;BA.debugLine="Log(\"top2: \"& Panel9.Top)";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","536831269",RemoteObject.concat(RemoteObject.createImmutable("top2: "),parent.mostCurrent._panel9.runMethod(true,"getTop")),0);
 BA.debugLineNum = 1775;BA.debugLine="Log(\"Height2: \"& Panel9.Height)";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","536831270",RemoteObject.concat(RemoteObject.createImmutable("Height2: "),parent.mostCurrent._panel9.runMethod(true,"getHeight")),0);
 BA.debugLineNum = 1779;BA.debugLine="Sleep(200)";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("Sleep",act_kaladefault.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_kaladefault", "btnshowsumfilterpnl_click"),BA.numberCast(int.class, 200));
this.state = 8;
return;
case 8:
//C
this.state = -1;
;
 BA.debugLineNum = 1780;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _btnupdate_click() throws Exception{
try {
		Debug.PushSubsStack("btnUpdate_Click (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,280);
if (RapidSub.canDelegate("btnupdate_click")) { return ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","btnupdate_click");}
 BA.debugLineNum = 280;BA.debugLine="Sub btnUpdate_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 281;BA.debugLine="If MCode.IsConnected Then";
Debug.ShouldStop(16777216);
if (act_kaladefault.mostCurrent._mcode.runMethod(true,"_isconnected" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 283;BA.debugLine="FirebaseMessaging.mode=\"GetGalleryKala\"";
Debug.ShouldStop(67108864);
act_kaladefault.mostCurrent._firebasemessaging._mode /*RemoteObject*/  = BA.ObjectToString("GetGalleryKala");
 BA.debugLineNum = 286;BA.debugLine="StartService(FirebaseMessaging)";
Debug.ShouldStop(536870912);
act_kaladefault.mostCurrent.__c.runVoidMethod ("StartService",act_kaladefault.processBA,(Object)((act_kaladefault.mostCurrent._firebasemessaging.getObject())));
 }else {
 BA.debugLineNum = 289;BA.debugLine="LoadKala";
Debug.ShouldStop(1);
_loadkala();
 };
 BA.debugLineNum = 292;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checkgroupeshantation(RemoteObject _codegroup) throws Exception{
try {
		Debug.PushSubsStack("CheckGroupEshantation (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,2634);
if (RapidSub.canDelegate("checkgroupeshantation")) { return ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","checkgroupeshantation", _codegroup);}
int _i = 0;
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlisteshantiongroup");
Debug.locals.put("CodeGroup", _codegroup);
 BA.debugLineNum = 2634;BA.debugLine="Public Sub CheckGroupEshantation(CodeGroup As Stri";
Debug.ShouldStop(512);
 BA.debugLineNum = 2635;BA.debugLine="For i=0 To lstEshantionGroup.Size-1";
Debug.ShouldStop(1024);
{
final int step1 = 1;
final int limit1 = RemoteObject.solve(new RemoteObject[] {act_kaladefault.mostCurrent._lsteshantiongroup.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 2636;BA.debugLine="Dim Item = lstEshantionGroup.Get(i) As AdapterLi";
Debug.ShouldStop(2048);
_item = (act_kaladefault.mostCurrent._lsteshantiongroup.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 2637;BA.debugLine="If Item.fldCodeGroupKalaEshantion=CodeGroup Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_item.getField(true,"fldCodeGroupKalaEshantion" /*RemoteObject*/ ),_codegroup)) { 
 BA.debugLineNum = 2638;BA.debugLine="Return Item";
Debug.ShouldStop(8192);
if (true) return _item;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2641;BA.debugLine="Return Null";
Debug.ShouldStop(65536);
if (true) return (act_kaladefault.mostCurrent.__c.getField(false,"Null"));
 BA.debugLineNum = 2642;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checkgroupforeshantation(RemoteObject _codegroup,RemoteObject _codegroupeshantion) throws Exception{
try {
		Debug.PushSubsStack("CheckGroupForEshantation (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,2644);
if (RapidSub.canDelegate("checkgroupforeshantation")) { return ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","checkgroupforeshantation", _codegroup, _codegroupeshantion);}
int _i = 0;
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlisteshantiongroup");
Debug.locals.put("CodeGroup", _codegroup);
Debug.locals.put("CodeGroupEshantion", _codegroupeshantion);
 BA.debugLineNum = 2644;BA.debugLine="Public Sub CheckGroupForEshantation(CodeGroup As S";
Debug.ShouldStop(524288);
 BA.debugLineNum = 2645;BA.debugLine="For i=0 To lstEshantionGroup.Size-1";
Debug.ShouldStop(1048576);
{
final int step1 = 1;
final int limit1 = RemoteObject.solve(new RemoteObject[] {act_kaladefault.mostCurrent._lsteshantiongroup.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 2646;BA.debugLine="Dim Item = lstEshantionGroup.Get(i) As AdapterLi";
Debug.ShouldStop(2097152);
_item = (act_kaladefault.mostCurrent._lsteshantiongroup.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 2647;BA.debugLine="If Item.fldCodeGroupKala=CodeGroup And Item.fldC";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_item.getField(true,"fldCodeGroupKala" /*RemoteObject*/ ),_codegroup) && RemoteObject.solveBoolean("=",_item.getField(true,"fldCodeGroupKalaEshantion" /*RemoteObject*/ ),_codegroupeshantion)) { 
 BA.debugLineNum = 2649;BA.debugLine="Return i";
Debug.ShouldStop(16777216);
if (true) return BA.numberCast(int.class, _i);
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2652;BA.debugLine="Return -1";
Debug.ShouldStop(134217728);
if (true) return BA.numberCast(int.class, -(double) (0 + 1));
 BA.debugLineNum = 2653;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _close() throws Exception{
try {
		Debug.PushSubsStack("close (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,1803);
if (RapidSub.canDelegate("close")) { return ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","close");}
 BA.debugLineNum = 1803;BA.debugLine="Sub close";
Debug.ShouldStop(1024);
 BA.debugLineNum = 1804;BA.debugLine="MCode.lstChangeFeeKala.Clear";
Debug.ShouldStop(2048);
act_kaladefault.mostCurrent._mcode._lstchangefeekala /*RemoteObject*/ .runVoidMethod ("Clear");
 BA.debugLineNum = 1805;BA.debugLine="FeeTip=0";
Debug.ShouldStop(4096);
act_kaladefault._feetip = BA.NumberToString(0);
 BA.debugLineNum = 1806;BA.debugLine="MCode.isAmani=0";
Debug.ShouldStop(8192);
act_kaladefault.mostCurrent._mcode._isamani /*RemoteObject*/  = BA.NumberToString(0);
 BA.debugLineNum = 1807;BA.debugLine="MCode.feeTip=0";
Debug.ShouldStop(16384);
act_kaladefault.mostCurrent._mcode._feetip /*RemoteObject*/  = BA.NumberToString(0);
 BA.debugLineNum = 1808;BA.debugLine="MCode.C_Tafzili=0";
Debug.ShouldStop(32768);
act_kaladefault.mostCurrent._mcode._c_tafzili /*RemoteObject*/  = BA.NumberToString(0);
 BA.debugLineNum = 1809;BA.debugLine="MCode.C_LayeKala=\"\"";
Debug.ShouldStop(65536);
act_kaladefault.mostCurrent._mcode._c_layekala /*RemoteObject*/  = BA.ObjectToString("");
 BA.debugLineNum = 1810;BA.debugLine="MCode.MandeEtebar=0";
Debug.ShouldStop(131072);
act_kaladefault.mostCurrent._mcode._mandeetebar /*RemoteObject*/  = BA.NumberToString(0);
 BA.debugLineNum = 1811;BA.debugLine="MCode.ManedEtebarEnable=False";
Debug.ShouldStop(262144);
act_kaladefault.mostCurrent._mcode._manedetebarenable /*RemoteObject*/  = act_kaladefault.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 1812;BA.debugLine="CallSub(ImageDownloader, \"ActivityIsPaused\")";
Debug.ShouldStop(524288);
act_kaladefault.mostCurrent.__c.runMethodAndSync(false,"CallSubNew",act_kaladefault.processBA,(Object)((act_kaladefault.mostCurrent._imagedownloader.getObject())),(Object)(RemoteObject.createImmutable("ActivityIsPaused")));
 BA.debugLineNum = 1813;BA.debugLine="Activity.Finish";
Debug.ShouldStop(1048576);
act_kaladefault.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 1814;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cmbbox1_selectedindexchanged(RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("CmbBox1_SelectedIndexChanged (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,2822);
if (RapidSub.canDelegate("cmbbox1_selectedindexchanged")) { return ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","cmbbox1_selectedindexchanged", _index);}
RemoteObject _itemtasvie = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlistnoetasvie");
Debug.locals.put("Index", _index);
 BA.debugLineNum = 2822;BA.debugLine="Sub CmbBox1_SelectedIndexChanged (Index As Int)";
Debug.ShouldStop(32);
 BA.debugLineNum = 2823;BA.debugLine="Try";
Debug.ShouldStop(64);
try { BA.debugLineNum = 2824;BA.debugLine="FeeTip = 0";
Debug.ShouldStop(128);
act_kaladefault._feetip = BA.NumberToString(0);
 BA.debugLineNum = 2825;BA.debugLine="MCode.feeTip=0";
Debug.ShouldStop(256);
act_kaladefault.mostCurrent._mcode._feetip /*RemoteObject*/  = BA.NumberToString(0);
 BA.debugLineNum = 2826;BA.debugLine="MCode.feeCode=0";
Debug.ShouldStop(512);
act_kaladefault.mostCurrent._mcode._feecode /*RemoteObject*/  = BA.NumberToString(0);
 BA.debugLineNum = 2827;BA.debugLine="If Index=0 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_index,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2828;BA.debugLine="LoadKala";
Debug.ShouldStop(2048);
_loadkala();
 }else {
 BA.debugLineNum = 2830;BA.debugLine="Dim ItemTasvie As AdapterListNoeTasvie";
Debug.ShouldStop(8192);
_itemtasvie = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapterlistnoetasvie");Debug.locals.put("ItemTasvie", _itemtasvie);
 BA.debugLineNum = 2831;BA.debugLine="FeeTip = Index";
Debug.ShouldStop(16384);
act_kaladefault._feetip = BA.NumberToString(_index);
 BA.debugLineNum = 2832;BA.debugLine="MCode.feeTip=Index";
Debug.ShouldStop(32768);
act_kaladefault.mostCurrent._mcode._feetip /*RemoteObject*/  = BA.NumberToString(_index);
 BA.debugLineNum = 2833;BA.debugLine="ItemTasvie.Initialize";
Debug.ShouldStop(65536);
_itemtasvie.runVoidMethod ("Initialize");
 BA.debugLineNum = 2834;BA.debugLine="ItemTasvie=ListTasvie.Get(FeeTip-1)";
Debug.ShouldStop(131072);
_itemtasvie = (act_kaladefault.mostCurrent._listtasvie.runMethod(false,"Get",(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, act_kaladefault._feetip),RemoteObject.createImmutable(1)}, "-",1, 0)))));Debug.locals.put("ItemTasvie", _itemtasvie);
 BA.debugLineNum = 2836;BA.debugLine="MCode.feeCode=ItemTasvie.FldC_Tasvie";
Debug.ShouldStop(524288);
act_kaladefault.mostCurrent._mcode._feecode /*RemoteObject*/  = _itemtasvie.getField(true,"FldC_Tasvie" /*RemoteObject*/ );
 BA.debugLineNum = 2837;BA.debugLine="Log(\"Fee: \"&Index)";
Debug.ShouldStop(1048576);
act_kaladefault.mostCurrent.__c.runVoidMethod ("LogImpl","539059471",RemoteObject.concat(RemoteObject.createImmutable("Fee: "),_index),0);
 BA.debugLineNum = 2840;BA.debugLine="UpdateFee";
Debug.ShouldStop(8388608);
_updatefee();
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e18) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_kaladefault.processBA, e18.toString()); BA.debugLineNum = 2843;BA.debugLine="Log(LastException)";
Debug.ShouldStop(67108864);
act_kaladefault.mostCurrent.__c.runVoidMethod ("LogImpl","539059477",BA.ObjectToString(act_kaladefault.mostCurrent.__c.runMethod(false,"LastException",act_kaladefault.mostCurrent.activityBA)),0);
 BA.debugLineNum = 2844;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(134217728);
act_kaladefault.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_kaladefault.mostCurrent.__c.runMethod(false,"LastException",act_kaladefault.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_kaladefault.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-CmbBox1_SelectedIndexChanged"))));
 };
 BA.debugLineNum = 2847;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _disablearzeshafzode(RemoteObject _item,RemoteObject _swdisablearzeshafzode) throws Exception{
try {
		Debug.PushSubsStack("DisableArzeshAfzode (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,2238);
if (RapidSub.canDelegate("disablearzeshafzode")) { return ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","disablearzeshafzode", _item, _swdisablearzeshafzode);}
RemoteObject _tedadkol = RemoteObject.createImmutable("");
RemoteObject _feekol = RemoteObject.createImmutable("");
Debug.locals.put("Item", _item);
Debug.locals.put("SwDisableArzeshAfzode", _swdisablearzeshafzode);
 BA.debugLineNum = 2238;BA.debugLine="Sub DisableArzeshAfzode(Item As AdapterListKala,Sw";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 2240;BA.debugLine="Try";
Debug.ShouldStop(-2147483648);
try { BA.debugLineNum = 2241;BA.debugLine="If SwDisableArzeshAfzode.Checked=False Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_swdisablearzeshafzode.runMethod(true,"getChecked"),act_kaladefault.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 2242;BA.debugLine="If myCode.Is_Null_adad(Item.fldDarsadArzeshAfzo";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",act_kaladefault.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(_item.getField(true,"fldDarsadArzeshAfzodeKala" /*RemoteObject*/ ))),BA.NumberToString(0)) && RemoteObject.solveBoolean("=",act_kaladefault.mostCurrent._mcode._arzeshafzodeenable /*RemoteObject*/ ,BA.NumberToString(1))) { 
 BA.debugLineNum = 2243;BA.debugLine="Item.fldDarsadArzeshAfzodeKala=myCode.Is_Null_";
Debug.ShouldStop(4);
_item.setField ("fldDarsadArzeshAfzodeKala" /*RemoteObject*/ ,act_kaladefault.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(act_kaladefault.mostCurrent._mcode._arzeshafzode /*RemoteObject*/ )));
 };
 BA.debugLineNum = 2245;BA.debugLine="SwDisableArzeshAfzode.Tag=Item.fldDarsadArzeshA";
Debug.ShouldStop(16);
_swdisablearzeshafzode.runMethod(false,"setTag",(_item.getField(true,"fldDarsadArzeshAfzodeKala" /*RemoteObject*/ )));
 BA.debugLineNum = 2246;BA.debugLine="Item.fldDarsadArzeshAfzodeKala=0";
Debug.ShouldStop(32);
_item.setField ("fldDarsadArzeshAfzodeKala" /*RemoteObject*/ ,BA.NumberToString(0));
 BA.debugLineNum = 2247;BA.debugLine="Item.fldArzeshAfzodeKala=0";
Debug.ShouldStop(64);
_item.setField ("fldArzeshAfzodeKala" /*RemoteObject*/ ,BA.NumberToString(0));
 BA.debugLineNum = 2248;BA.debugLine="MCode.SaveUpdate($\"Update TblSabad Set fldArzes";
Debug.ShouldStop(128);
act_kaladefault.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("Update TblSabad Set fldArzeshAfzode='0',fldDarsadArzeshAfzode='0' where FldCodeKala='"),act_kaladefault.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_item.getField(true,"CodeKala" /*RemoteObject*/ )))),RemoteObject.createImmutable("'")))));
 }else {
 BA.debugLineNum = 2250;BA.debugLine="Item.fldDarsadArzeshAfzodeKala=SwDisableArzeshA";
Debug.ShouldStop(512);
_item.setField ("fldDarsadArzeshAfzodeKala" /*RemoteObject*/ ,BA.ObjectToString(_swdisablearzeshafzode.runMethod(false,"getTag")));
 BA.debugLineNum = 2252;BA.debugLine="Dim tedadKol As String=myCode.Is_Null_adad(Item";
Debug.ShouldStop(2048);
_tedadkol = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, act_kaladefault.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(_item.getField(true,"TedadDarSabadJoz" /*RemoteObject*/ )))),(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, act_kaladefault.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(_item.getField(true,"TedadDarSabadKol" /*RemoteObject*/ )))),BA.numberCast(double.class, act_kaladefault.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(_item.getField(true,"TedadDarKarton" /*RemoteObject*/ ))))}, "*",0, 0))}, "+",1, 0));Debug.locals.put("tedadKol", _tedadkol);Debug.locals.put("tedadKol", _tedadkol);
 BA.debugLineNum = 2253;BA.debugLine="Dim FeeKol As String=(Item.FeeForoosh*tedadKol)";
Debug.ShouldStop(4096);
_feekol = BA.NumberToString((RemoteObject.solve(new RemoteObject[] {_item.getField(true,"FeeForoosh" /*RemoteObject*/ ),BA.numberCast(double.class, _tedadkol)}, "*",0, 0)));Debug.locals.put("FeeKol", _feekol);Debug.locals.put("FeeKol", _feekol);
 BA.debugLineNum = 2254;BA.debugLine="If myCode.Is_Null_adad(Item.fldDarsadArzeshAfzo";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, act_kaladefault.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(_item.getField(true,"fldDarsadArzeshAfzodeKala" /*RemoteObject*/ )))),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean(".",_swdisablearzeshafzode.runMethod(true,"getChecked"))) { 
 BA.debugLineNum = 2255;BA.debugLine="Item.fldArzeshAfzodeKala=myCode.Is_Null_adad(M";
Debug.ShouldStop(16384);
_item.setField ("fldArzeshAfzodeKala" /*RemoteObject*/ ,act_kaladefault.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(BA.NumberToString(act_kaladefault.mostCurrent._mcode.runMethod(true,"_mohasbearzeshafzodekala" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(BA.numberCast(long.class, _feekol)),(Object)(_item.getField(true,"fldDarsadArzeshAfzodeKala" /*RemoteObject*/ )))))));
 BA.debugLineNum = 2256;BA.debugLine="If Item.fldArzeshAfzodeKala>0 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _item.getField(true,"fldArzeshAfzodeKala" /*RemoteObject*/ )),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2258;BA.debugLine="FeeKol=FeeKol+Item.fldArzeshAfzodeKala";
Debug.ShouldStop(131072);
_feekol = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _feekol),BA.numberCast(double.class, _item.getField(true,"fldArzeshAfzodeKala" /*RemoteObject*/ ))}, "+",1, 0));Debug.locals.put("FeeKol", _feekol);
 };
 }else {
 };
 BA.debugLineNum = 2263;BA.debugLine="MCode.SaveUpdate($\"Update TblSabad Set fldArzes";
Debug.ShouldStop(4194304);
act_kaladefault.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("Update TblSabad Set fldArzeshAfzode='"),act_kaladefault.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_item.getField(true,"fldArzeshAfzodeKala" /*RemoteObject*/ )))),RemoteObject.createImmutable("',fldDarsadArzeshAfzode='"),act_kaladefault.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_item.getField(true,"fldDarsadArzeshAfzodeKala" /*RemoteObject*/ )))),RemoteObject.createImmutable("' where FldCodeKala='"),act_kaladefault.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_item.getField(true,"CodeKala" /*RemoteObject*/ )))),RemoteObject.createImmutable("'")))));
 BA.debugLineNum = 2264;BA.debugLine="SwDisableArzeshAfzode.Tag=0";
Debug.ShouldStop(8388608);
_swdisablearzeshafzode.runMethod(false,"setTag",RemoteObject.createImmutable((0)));
 };
 BA.debugLineNum = 2267;BA.debugLine="ItemSelected=Item";
Debug.ShouldStop(67108864);
act_kaladefault.mostCurrent._itemselected = _item;
 BA.debugLineNum = 2270;BA.debugLine="RefreshLblSabad";
Debug.ShouldStop(536870912);
_refreshlblsabad();
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e27) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_kaladefault.processBA, e27.toString()); BA.debugLineNum = 2272;BA.debugLine="Log(LastException)";
Debug.ShouldStop(-2147483648);
act_kaladefault.mostCurrent.__c.runVoidMethod ("LogImpl","538076450",BA.ObjectToString(act_kaladefault.mostCurrent.__c.runMethod(false,"LastException",act_kaladefault.mostCurrent.activityBA)),0);
 BA.debugLineNum = 2273;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(1);
act_kaladefault.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_kaladefault.mostCurrent.__c.runMethod(false,"LastException",act_kaladefault.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_kaladefault.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-DisableArzeshAfzode"))));
 };
 BA.debugLineNum = 2276;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _downeshantion(RemoteObject _itemkala,RemoteObject _count) throws Exception{
try {
		Debug.PushSubsStack("DownEshantion (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,2681);
if (RapidSub.canDelegate("downeshantion")) { return ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","downeshantion", _itemkala, _count);}
RemoteObject _sum = RemoteObject.createImmutable(0);
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlisteshantiongroup");
Debug.locals.put("ItemKala", _itemkala);
Debug.locals.put("Count", _count);
 BA.debugLineNum = 2681;BA.debugLine="Public Sub DownEshantion(ItemKala As AdapterListKa";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 2682;BA.debugLine="Dim sum As Int=MCode.GetCountEshantionGroup(ItemK";
Debug.ShouldStop(33554432);
_sum = act_kaladefault.mostCurrent._mcode.runMethod(true,"_getcounteshantiongroup" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(_itemkala.getField(true,"CodeGroup" /*RemoteObject*/ )));Debug.locals.put("sum", _sum);Debug.locals.put("sum", _sum);
 BA.debugLineNum = 2683;BA.debugLine="Dim item As AdapterListEshantionGroup=CheckGroupE";
Debug.ShouldStop(67108864);
_item = _checkgroupeshantation(_itemkala.getField(true,"CodeGroup" /*RemoteObject*/ ));Debug.locals.put("item", _item);Debug.locals.put("item", _item);
 BA.debugLineNum = 2684;BA.debugLine="If item.fldTedadEshantion>sum Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _item.getField(true,"fldTedadEshantion" /*RemoteObject*/ )),BA.numberCast(double.class, _sum))) { 
 BA.debugLineNum = 2685;BA.debugLine="sum=sum+1";
Debug.ShouldStop(268435456);
_sum = RemoteObject.solve(new RemoteObject[] {_sum,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("sum", _sum);
 BA.debugLineNum = 2686;BA.debugLine="MCode.SaveUpdate(\"Update tblEshantionGroupTemp S";
Debug.ShouldStop(536870912);
act_kaladefault.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update tblEshantionGroupTemp Set fldTedadEshantion="),_sum,RemoteObject.createImmutable(" where fldCodeGroupKalaEshantion="),_itemkala.getField(true,"CodeGroup" /*RemoteObject*/ ))));
 BA.debugLineNum = 2687;BA.debugLine="If sum=item.fldTedadEshantion Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_sum,BA.numberCast(double.class, _item.getField(true,"fldTedadEshantion" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 2688;BA.debugLine="MCode.SaveUpdate(\"Delete From TblSabad Where Fl";
Debug.ShouldStop(-2147483648);
act_kaladefault.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Delete From TblSabad Where FldCodeKala = '"),_itemkala.getField(true,"CodeGroup" /*RemoteObject*/ ),RemoteObject.createImmutable("'"))));
 };
 BA.debugLineNum = 2690;BA.debugLine="RefreshCountEshantionGroup";
Debug.ShouldStop(2);
_refreshcounteshantiongroup();
 };
 BA.debugLineNum = 2693;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Dim HLV As Hitex_LayoutView";
act_kaladefault.mostCurrent._hlv = RemoteObject.createNew ("wir.hitex.recycler.Hitex_LayoutView");
 //BA.debugLineNum = 17;BA.debugLine="Public NiceSpinner As NiceSpinner";
act_kaladefault.mostCurrent._nicespinner = RemoteObject.createNew ("nicespinnerwrapper.niceSpinnerWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Public NiceSpinner1 As NiceSpinner";
act_kaladefault.mostCurrent._nicespinner1 = RemoteObject.createNew ("nicespinnerwrapper.niceSpinnerWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Dim Key As IME";
act_kaladefault.mostCurrent._key = RemoteObject.createNew ("anywheresoftware.b4a.objects.IME");
 //BA.debugLineNum = 20;BA.debugLine="Dim ListKalaTxt,ListKalaSp,OrginalListKala As Lis";
act_kaladefault.mostCurrent._listkalatxt = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
act_kaladefault.mostCurrent._listkalasp = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
act_kaladefault.mostCurrent._orginallistkala = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 21;BA.debugLine="Dim ListGroohKala As List";
act_kaladefault.mostCurrent._listgroohkala = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 23;BA.debugLine="Private Str_sort As String = \" Order by fldCodeKa";
act_kaladefault.mostCurrent._str_sort = BA.ObjectToString(" Order by fldCodeKala Asc");
 //BA.debugLineNum = 25;BA.debugLine="Dim Barcode As JhsIceZxing1";
act_kaladefault.mostCurrent._barcode = RemoteObject.createNew ("ice.zxing.b4aZXingLib");
 //BA.debugLineNum = 29;BA.debugLine="Private LblBasketCount As Label";
act_kaladefault.mostCurrent._lblbasketcount = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private LblBasket As Label";
act_kaladefault.mostCurrent._lblbasket = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private BtnShowFilterPnl As ImageView";
act_kaladefault.mostCurrent._btnshowfilterpnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private TxtSearch As EditText";
act_kaladefault.mostCurrent._txtsearch = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private B4XComboBox1 As B4XComboBox";
act_kaladefault.mostCurrent._b4xcombobox1 = RemoteObject.createNew ("ir.parsikhesab.pakhsh.b4xcombobox");
 //BA.debugLineNum = 34;BA.debugLine="Private B4XComboBox2 As B4XComboBox";
act_kaladefault.mostCurrent._b4xcombobox2 = RemoteObject.createNew ("ir.parsikhesab.pakhsh.b4xcombobox");
 //BA.debugLineNum = 35;BA.debugLine="Private BtnCommentExit As Button";
act_kaladefault.mostCurrent._btncommentexit = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Private BtnCommentOK As Button";
act_kaladefault.mostCurrent._btncommentok = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Private pnlFilter As Panel";
act_kaladefault.mostCurrent._pnlfilter = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private pnl_HLV As Panel";
act_kaladefault.mostCurrent._pnl_hlv = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Private NumberSearch As EditText";
act_kaladefault.mostCurrent._numbersearch = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 40;BA.debugLine="Private Pnl_Top As Panel";
act_kaladefault.mostCurrent._pnl_top = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 41;BA.debugLine="Private ImageView1 As ImageView";
act_kaladefault.mostCurrent._imageview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 42;BA.debugLine="Private btn_Back As Button";
act_kaladefault.mostCurrent._btn_back = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 43;BA.debugLine="Private Label4 As Label";
act_kaladefault.mostCurrent._label4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 44;BA.debugLine="Private Panel2 As Panel";
act_kaladefault.mostCurrent._panel2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 45;BA.debugLine="Private Panel3 As Panel";
act_kaladefault.mostCurrent._panel3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 46;BA.debugLine="Private Label5 As Label";
act_kaladefault.mostCurrent._label5 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 47;BA.debugLine="Private Label6 As Label";
act_kaladefault.mostCurrent._label6 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 52;BA.debugLine="Private BtnSearch As Label";
act_kaladefault.mostCurrent._btnsearch = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 59;BA.debugLine="Private Dialog As B4XDialog";
act_kaladefault.mostCurrent._dialog = RemoteObject.createNew ("ir.parsikhesab.pakhsh.b4xdialog");
 //BA.debugLineNum = 60;BA.debugLine="Private XUI As XUI";
act_kaladefault.mostCurrent._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 62;BA.debugLine="Private Img_barcode As ImageView";
act_kaladefault.mostCurrent._img_barcode = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 63;BA.debugLine="Private Img_Paging As ImageView";
act_kaladefault.mostCurrent._img_paging = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 64;BA.debugLine="Private Img_sort As ImageView";
act_kaladefault.mostCurrent._img_sort = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 65;BA.debugLine="Private Img_TipFee As ImageView";
act_kaladefault.mostCurrent._img_tipfee = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 66;BA.debugLine="Private Label11 As Label";
act_kaladefault.mostCurrent._label11 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 67;BA.debugLine="Private Pnl_Tools As Panel";
act_kaladefault.mostCurrent._pnl_tools = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 68;BA.debugLine="Private LblPoint As Label";
act_kaladefault.mostCurrent._lblpoint = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 70;BA.debugLine="Private SwGift As ACSwitch";
act_kaladefault.mostCurrent._swgift = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACSwitchCompatWrapper");
 //BA.debugLineNum = 71;BA.debugLine="Private SwMojoodi As ACSwitch";
act_kaladefault.mostCurrent._swmojoodi = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACSwitchCompatWrapper");
 //BA.debugLineNum = 72;BA.debugLine="Private SwPic As ACSwitch";
act_kaladefault.mostCurrent._swpic = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACSwitchCompatWrapper");
 //BA.debugLineNum = 73;BA.debugLine="Private SwTakhfif As ACSwitch";
act_kaladefault.mostCurrent._swtakhfif = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACSwitchCompatWrapper");
 //BA.debugLineNum = 74;BA.debugLine="Private Pnl_Down As Panel";
act_kaladefault.mostCurrent._pnl_down = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 75;BA.debugLine="Private Lbl_Bascket As Label";
act_kaladefault.mostCurrent._lbl_bascket = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 76;BA.debugLine="Dim ListGoroohKala1,OriginalListGoroohKala1 As Li";
act_kaladefault.mostCurrent._listgoroohkala1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
act_kaladefault.mostCurrent._originallistgoroohkala1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 77;BA.debugLine="Dim ListGoroohKala2,OriginalListGoroohKala2 As Li";
act_kaladefault.mostCurrent._listgoroohkala2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
act_kaladefault.mostCurrent._originallistgoroohkala2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 78;BA.debugLine="Dim GroupCodeSelect1 As String=\"0\"";
act_kaladefault.mostCurrent._groupcodeselect1 = BA.ObjectToString("0");
 //BA.debugLineNum = 79;BA.debugLine="Dim GroupNameSelect1 As String=\"\"";
act_kaladefault.mostCurrent._groupnameselect1 = BA.ObjectToString("");
 //BA.debugLineNum = 80;BA.debugLine="Dim GroupCodeSelect2 As String=\"0\"";
act_kaladefault.mostCurrent._groupcodeselect2 = BA.ObjectToString("0");
 //BA.debugLineNum = 81;BA.debugLine="Dim GroupNameSelect2 As String=\"\"";
act_kaladefault.mostCurrent._groupnameselect2 = BA.ObjectToString("");
 //BA.debugLineNum = 82;BA.debugLine="Dim lstSelectedCodeGroupKala As List";
act_kaladefault.mostCurrent._lstselectedcodegroupkala = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 83;BA.debugLine="Dim ListTasvie As List";
act_kaladefault.mostCurrent._listtasvie = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 84;BA.debugLine="Dim bm As Bitmap";
act_kaladefault.mostCurrent._bm = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 //BA.debugLineNum = 85;BA.debugLine="Private CmbBox1 As B4XComboBox";
act_kaladefault.mostCurrent._cmbbox1 = RemoteObject.createNew ("ir.parsikhesab.pakhsh.b4xcombobox");
 //BA.debugLineNum = 86;BA.debugLine="Private MapFragment1 As MapFragment";
act_kaladefault.mostCurrent._mapfragment1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.MapFragmentWrapper");
 //BA.debugLineNum = 88;BA.debugLine="Private rp As RuntimePermissions";
act_kaladefault._rp = RemoteObject.createNew ("anywheresoftware.b4a.objects.RuntimePermissions");
 //BA.debugLineNum = 91;BA.debugLine="Private PnlActivate As Panel";
act_kaladefault.mostCurrent._pnlactivate = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 92;BA.debugLine="Private txtFee As EditText";
act_kaladefault.mostCurrent._txtfee = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 93;BA.debugLine="Private btnSaveFee As Button";
act_kaladefault.mostCurrent._btnsavefee = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 94;BA.debugLine="Private lblTitle As Label";
act_kaladefault.mostCurrent._lbltitle = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 95;BA.debugLine="Dim FeeType As String";
act_kaladefault.mostCurrent._feetype = RemoteObject.createImmutable("");
 //BA.debugLineNum = 96;BA.debugLine="Private PnlFee As Panel";
act_kaladefault.mostCurrent._pnlfee = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 97;BA.debugLine="Dim ItemSelected As AdapterListKala";
act_kaladefault.mostCurrent._itemselected = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapterlistkala");
 //BA.debugLineNum = 98;BA.debugLine="Private txtchanged As Boolean=False";
act_kaladefault._txtchanged = act_kaladefault.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 99;BA.debugLine="Private PnlDarsadTakhfif As Panel";
act_kaladefault.mostCurrent._pnldarsadtakhfif = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 100;BA.debugLine="Private txtDarsadTakhfif As EditText";
act_kaladefault.mostCurrent._txtdarsadtakhfif = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 101;BA.debugLine="Private Img_SelectMoshtari As ImageView";
act_kaladefault.mostCurrent._img_selectmoshtari = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 102;BA.debugLine="Private lblMojavezSefareshText As Label";
act_kaladefault.mostCurrent._lblmojavezsefareshtext = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 103;BA.debugLine="Private PnlSpGroup As Panel";
act_kaladefault.mostCurrent._pnlspgroup = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 104;BA.debugLine="Dim lstGroup1 As List";
act_kaladefault.mostCurrent._lstgroup1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 105;BA.debugLine="Dim lstGroup2 As List";
act_kaladefault.mostCurrent._lstgroup2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 106;BA.debugLine="Private Img_RotatePic As ImageView";
act_kaladefault.mostCurrent._img_rotatepic = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 107;BA.debugLine="Private btnMenuGroup As Button";
act_kaladefault.mostCurrent._btnmenugroup = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 108;BA.debugLine="Private sidemenu As SlidingMenu";
act_kaladefault.mostCurrent._sidemenu = RemoteObject.createNew ("anywheresoftware.b4a.objects.SlidingMenuWrapper");
 //BA.debugLineNum = 109;BA.debugLine="Dim HLVGoroohKala As Hitex_LayoutView";
act_kaladefault.mostCurrent._hlvgoroohkala = RemoteObject.createNew ("wir.hitex.recycler.Hitex_LayoutView");
 //BA.debugLineNum = 110;BA.debugLine="Private pnlGroup As Panel";
act_kaladefault.mostCurrent._pnlgroup = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 111;BA.debugLine="Private lblBackGroup As Label";
act_kaladefault.mostCurrent._lblbackgroup = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 112;BA.debugLine="Private lblTitile As Label";
act_kaladefault.mostCurrent._lbltitile = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 113;BA.debugLine="Dim SearchNumber As String=0";
act_kaladefault.mostCurrent._searchnumber = BA.NumberToString(0);
 //BA.debugLineNum = 114;BA.debugLine="Private SwSearchNumber As ACSwitch";
act_kaladefault.mostCurrent._swsearchnumber = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACSwitchCompatWrapper");
 //BA.debugLineNum = 115;BA.debugLine="Private LblGift As Label";
act_kaladefault.mostCurrent._lblgift = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 116;BA.debugLine="Private LblGiftCount As Label";
act_kaladefault.mostCurrent._lblgiftcount = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 117;BA.debugLine="Private lblSumKhales As Label";
act_kaladefault.mostCurrent._lblsumkhales = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 118;BA.debugLine="Private LblMandeEtebar As Label";
act_kaladefault.mostCurrent._lblmandeetebar = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 119;BA.debugLine="Dim lstEshantionGroup As List";
act_kaladefault.mostCurrent._lsteshantiongroup = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 120;BA.debugLine="Dim lstEshantionGroupTable As List";
act_kaladefault.mostCurrent._lsteshantiongrouptable = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 121;BA.debugLine="Private PnlEshantion As Panel";
act_kaladefault.mostCurrent._pnleshantion = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 122;BA.debugLine="Dim Table1 As Table";
act_kaladefault.mostCurrent._table1 = RemoteObject.createNew ("ir.parsikhesab.pakhsh.table");
 //BA.debugLineNum = 123;BA.debugLine="Private PnlTableEshantion As Panel";
act_kaladefault.mostCurrent._pnltableeshantion = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 124;BA.debugLine="Dim Utils As Hitex_Utils";
act_kaladefault.mostCurrent._utils = RemoteObject.createNew ("wir.hitex.recycler.Hitex_Utils");
 //BA.debugLineNum = 126;BA.debugLine="Private LblSumFactor As Label";
act_kaladefault.mostCurrent._lblsumfactor = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 127;BA.debugLine="Private LblSumTakhfif As Label";
act_kaladefault.mostCurrent._lblsumtakhfif = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 128;BA.debugLine="Private SwArzeshAfzodeEnable As ACSwitch";
act_kaladefault.mostCurrent._swarzeshafzodeenable = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACSwitchCompatWrapper");
 //BA.debugLineNum = 129;BA.debugLine="Private lblDarsadArzeshAfzode As Label";
act_kaladefault.mostCurrent._lbldarsadarzeshafzode = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 130;BA.debugLine="Private lblArzeshAfzode As Label";
act_kaladefault.mostCurrent._lblarzeshafzode = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 132;BA.debugLine="Private LblSumKolBadAzTakhfif As Label";
act_kaladefault.mostCurrent._lblsumkolbadaztakhfif = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 133;BA.debugLine="Private Panel9 As Panel";
act_kaladefault.mostCurrent._panel9 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 134;BA.debugLine="Private BtnShowSumFilterPnl As Label";
act_kaladefault.mostCurrent._btnshowsumfilterpnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 135;BA.debugLine="Private Label8 As Label";
act_kaladefault.mostCurrent._label8 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 136;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _grid() throws Exception{
try {
		Debug.PushSubsStack("Grid (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,2960);
if (RapidSub.canDelegate("grid")) { return ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","grid");}
RemoteObject _lst_colnametitle = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
 BA.debugLineNum = 2960;BA.debugLine="Sub Grid";
Debug.ShouldStop(32768);
 BA.debugLineNum = 2961;BA.debugLine="Dim Lst_ColNameTitle As List";
Debug.ShouldStop(65536);
_lst_colnametitle = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Lst_ColNameTitle", _lst_colnametitle);
 BA.debugLineNum = 2962;BA.debugLine="Lst_ColNameTitle.Initialize";
Debug.ShouldStop(131072);
_lst_colnametitle.runVoidMethod ("Initialize");
 BA.debugLineNum = 2964;BA.debugLine="Lst_ColNameTitle.AddAll(Array As String(\"ردیف\",\"ک";
Debug.ShouldStop(524288);
_lst_colnametitle.runVoidMethod ("AddAll",(Object)(act_kaladefault.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {6},new Object[] {BA.ObjectToString("ردیف"),BA.ObjectToString("کد گروه"),BA.ObjectToString("نام گروه"),BA.ObjectToString("کد گروه اشانتیون"),BA.ObjectToString("نام گروه اشانتیون"),RemoteObject.createImmutable("تعداد اشانتیون")})))));
 BA.debugLineNum = 2967;BA.debugLine="Table1.LoadEshantionGroupList(lstEshantionGroup,L";
Debug.ShouldStop(4194304);
act_kaladefault.mostCurrent._table1.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_loadeshantiongrouplist" /*RemoteObject*/ ,(Object)(act_kaladefault.mostCurrent._lsteshantiongroup),(Object)(_lst_colnametitle),(Object)(BA.numberCast(int.class, 6)));
 BA.debugLineNum = 2970;BA.debugLine="Table1.SetColumnsWidths(Array As Int(50dip,50dip,";
Debug.ShouldStop(33554432);
act_kaladefault.mostCurrent._table1.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_setcolumnswidths" /*RemoteObject*/ ,(Object)(RemoteObject.createNewArray("int",new int[] {6},new Object[] {act_kaladefault.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))),act_kaladefault.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))),act_kaladefault.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 66))),act_kaladefault.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))),act_kaladefault.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 66))),act_kaladefault.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))})));
 BA.debugLineNum = 2973;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hlv_getitemcount() throws Exception{
try {
		Debug.PushSubsStack("HLV_GetItemCount (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,1432);
if (RapidSub.canDelegate("hlv_getitemcount")) { return ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","hlv_getitemcount");}
 BA.debugLineNum = 1432;BA.debugLine="Sub HLV_GetItemCount As Int 								        '💯 It";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 1433;BA.debugLine="Return ListKalaTxt.Size";
Debug.ShouldStop(16777216);
if (true) return act_kaladefault.mostCurrent._listkalatxt.runMethod(true,"getSize");
 BA.debugLineNum = 1434;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hlv_onbindviewholder(RemoteObject _parent,RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("HLV_onBindViewHolder (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,1441);
if (RapidSub.canDelegate("hlv_onbindviewholder")) { return ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","hlv_onbindviewholder", _parent, _position);}
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlistkala");
RemoteObject _rec = RemoteObject.declareNull("ir.parsikhesab.pakhsh.cls_recdefultkala");
Debug.locals.put("Parent", _parent);
Debug.locals.put("Position", _position);
 BA.debugLineNum = 1441;BA.debugLine="Sub HLV_onBindViewHolder (Parent As Panel, Positio";
Debug.ShouldStop(1);
 BA.debugLineNum = 1442;BA.debugLine="Dim Item = ListKalaTxt.Get(Position) As AdapterLi";
Debug.ShouldStop(2);
_item = (act_kaladefault.mostCurrent._listkalatxt.runMethod(false,"Get",(Object)(_position)));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 1443;BA.debugLine="Dim rec As CLs_RecDefultKala=Parent.Tag";
Debug.ShouldStop(4);
_rec = (_parent.runMethod(false,"getTag"));Debug.locals.put("rec", _rec);Debug.locals.put("rec", _rec);
 BA.debugLineNum = 1444;BA.debugLine="rec.Show(Item,Position)";
Debug.ShouldStop(8);
_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_recdefultkala.class, "_show" /*void*/ ,(Object)(_item),(Object)(_position));
 BA.debugLineNum = 1445;BA.debugLine="Parent.Height=rec.Height";
Debug.ShouldStop(16);
_parent.runMethod(true,"setHeight",_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_recdefultkala.class, "_getheight" /*RemoteObject*/ ));
 BA.debugLineNum = 1446;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hlv_oncreateviewholder(RemoteObject _parent,RemoteObject _viewtype) throws Exception{
try {
		Debug.PushSubsStack("HLV_onCreateViewHolder (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,1435);
if (RapidSub.canDelegate("hlv_oncreateviewholder")) { return ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","hlv_oncreateviewholder", _parent, _viewtype);}
RemoteObject _rec = RemoteObject.declareNull("ir.parsikhesab.pakhsh.cls_recdefultkala");
Debug.locals.put("Parent", _parent);
Debug.locals.put("ViewType", _viewtype);
 BA.debugLineNum = 1435;BA.debugLine="Sub HLV_onCreateViewHolder (Parent As Panel, ViewT";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 1436;BA.debugLine="Dim rec As CLs_RecDefultKala";
Debug.ShouldStop(134217728);
_rec = RemoteObject.createNew ("ir.parsikhesab.pakhsh.cls_recdefultkala");Debug.locals.put("rec", _rec);
 BA.debugLineNum = 1437;BA.debugLine="rec.Initialize(Me)";
Debug.ShouldStop(268435456);
_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_recdefultkala.class, "_initialize" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(act_kaladefault.getObject()));
 BA.debugLineNum = 1438;BA.debugLine="Parent.AddView(rec.Panel,0,0,100%x,rec.Height)";
Debug.ShouldStop(536870912);
_parent.runVoidMethod ("AddView",(Object)((_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_recdefultkala.class, "_getpanel" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_kaladefault.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),act_kaladefault.mostCurrent.activityBA)),(Object)(_rec.runClassMethod (ir.parsikhesab.pakhsh.cls_recdefultkala.class, "_getheight" /*RemoteObject*/ )));
 BA.debugLineNum = 1439;BA.debugLine="Parent.Tag=rec";
Debug.ShouldStop(1073741824);
_parent.runMethod(false,"setTag",(_rec));
 BA.debugLineNum = 1440;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hlvgoroohkala_getitemcount() throws Exception{
try {
		Debug.PushSubsStack("HLVGoroohKala_GetItemCount (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,684);
if (RapidSub.canDelegate("hlvgoroohkala_getitemcount")) { return ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","hlvgoroohkala_getitemcount");}
 BA.debugLineNum = 684;BA.debugLine="Sub HLVGoroohKala_GetItemCount As Int";
Debug.ShouldStop(2048);
 BA.debugLineNum = 685;BA.debugLine="Return ListGoroohKala2.Size";
Debug.ShouldStop(4096);
if (true) return act_kaladefault.mostCurrent._listgoroohkala2.runMethod(true,"getSize");
 BA.debugLineNum = 686;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hlvgoroohkala_itemclick(RemoteObject _clickeditem,RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("HLVGoroohKala_ItemClick (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,679);
if (RapidSub.canDelegate("hlvgoroohkala_itemclick")) { return ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","hlvgoroohkala_itemclick", _clickeditem, _position);}
Debug.locals.put("ClickedItem", _clickeditem);
Debug.locals.put("Position", _position);
 BA.debugLineNum = 679;BA.debugLine="Sub HLVGoroohKala_ItemClick (ClickedItem As Panel,";
Debug.ShouldStop(64);
 BA.debugLineNum = 680;BA.debugLine="LoadGoroohKalaGo(Position)";
Debug.ShouldStop(128);
_loadgoroohkalago(_position);
 BA.debugLineNum = 681;BA.debugLine="sidemenu.HideMenus";
Debug.ShouldStop(256);
act_kaladefault.mostCurrent._sidemenu.runVoidMethod ("HideMenus");
 BA.debugLineNum = 682;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hlvgoroohkala_onbindviewholder(RemoteObject _parent,RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("HLVGoroohKala_onBindViewHolder (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,690);
if (RapidSub.canDelegate("hlvgoroohkala_onbindviewholder")) { return ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","hlvgoroohkala_onbindviewholder", _parent, _position);}
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adaptergoroohkala");
RemoteObject _lblsharh = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("Parent", _parent);
Debug.locals.put("Position", _position);
 BA.debugLineNum = 690;BA.debugLine="Sub HLVGoroohKala_onBindViewHolder (Parent As Pane";
Debug.ShouldStop(131072);
 BA.debugLineNum = 691;BA.debugLine="Dim Item = ListGoroohKala2.Get(Position) As Adapt";
Debug.ShouldStop(262144);
_item = (act_kaladefault.mostCurrent._listgoroohkala2.runMethod(false,"Get",(Object)(_position)));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 692;BA.debugLine="Dim LblSharh As Label  = Parent.getview(0)";
Debug.ShouldStop(524288);
_lblsharh = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lblsharh = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), _parent.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("LblSharh", _lblsharh);Debug.locals.put("LblSharh", _lblsharh);
 BA.debugLineNum = 693;BA.debugLine="LblSharh.Text = Item.FldN_Gorooh";
Debug.ShouldStop(1048576);
_lblsharh.runMethod(true,"setText",BA.ObjectToCharSequence(_item.getField(true,"FldN_Gorooh" /*RemoteObject*/ )));
 BA.debugLineNum = 694;BA.debugLine="Parent.Elevation=1dip";
Debug.ShouldStop(2097152);
_parent.runMethod(true,"setElevation",BA.numberCast(float.class, act_kaladefault.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))));
 BA.debugLineNum = 695;BA.debugLine="Parent.Height = 9%y";
Debug.ShouldStop(4194304);
_parent.runMethod(true,"setHeight",act_kaladefault.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 9)),act_kaladefault.mostCurrent.activityBA));
 BA.debugLineNum = 696;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hlvgoroohkala_oncreateviewholder(RemoteObject _parent,RemoteObject _viewtype) throws Exception{
try {
		Debug.PushSubsStack("HLVGoroohKala_onCreateViewHolder (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,665);
if (RapidSub.canDelegate("hlvgoroohkala_oncreateviewholder")) { return ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","hlvgoroohkala_oncreateviewholder", _parent, _viewtype);}
RemoteObject _lblsharh = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _bmp1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.BitmapDrawable");
Debug.locals.put("Parent", _parent);
Debug.locals.put("ViewType", _viewtype);
 BA.debugLineNum = 665;BA.debugLine="Sub HLVGoroohKala_onCreateViewHolder (Parent As Pa";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 666;BA.debugLine="Dim LblSharh As Label";
Debug.ShouldStop(33554432);
_lblsharh = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("LblSharh", _lblsharh);
 BA.debugLineNum = 667;BA.debugLine="Dim bmp1 As BitmapDrawable";
Debug.ShouldStop(67108864);
_bmp1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.BitmapDrawable");Debug.locals.put("bmp1", _bmp1);
 BA.debugLineNum = 668;BA.debugLine="LblSharh.Initialize(\"LblSharh\")";
Debug.ShouldStop(134217728);
_lblsharh.runVoidMethod ("Initialize",act_kaladefault.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("LblSharh")));
 BA.debugLineNum = 669;BA.debugLine="LblSharh.TextColor=Colors.black";
Debug.ShouldStop(268435456);
_lblsharh.runMethod(true,"setTextColor",act_kaladefault.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 670;BA.debugLine="LblSharh.TextSize=20";
Debug.ShouldStop(536870912);
_lblsharh.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 671;BA.debugLine="LblSharh.Gravity=Gravity.CENTER";
Debug.ShouldStop(1073741824);
_lblsharh.runMethod(true,"setGravity",act_kaladefault.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 672;BA.debugLine="LblSharh.SingleLine=False";
Debug.ShouldStop(-2147483648);
_lblsharh.runVoidMethod ("setSingleLine",act_kaladefault.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 673;BA.debugLine="bmp1.Initialize(LoadBitmap(File.DirAssets,\"button";
Debug.ShouldStop(1);
_bmp1.runVoidMethod ("Initialize",(Object)((act_kaladefault.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(act_kaladefault.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("button5.png"))).getObject())));
 BA.debugLineNum = 674;BA.debugLine="LblSharh.Background=bmp1";
Debug.ShouldStop(2);
_lblsharh.runMethod(false,"setBackground",(_bmp1.getObject()));
 BA.debugLineNum = 675;BA.debugLine="LblSharh.Typeface= MCode.Font2";
Debug.ShouldStop(4);
_lblsharh.runMethod(false,"setTypeface",(act_kaladefault.mostCurrent._mcode._font2 /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 676;BA.debugLine="Parent.AddView(LblSharh,2%x,1%y,61%x,7%y)";
Debug.ShouldStop(8);
_parent.runVoidMethod ("AddView",(Object)((_lblsharh.getObject())),(Object)(act_kaladefault.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),act_kaladefault.mostCurrent.activityBA)),(Object)(act_kaladefault.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),act_kaladefault.mostCurrent.activityBA)),(Object)(act_kaladefault.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 61)),act_kaladefault.mostCurrent.activityBA)),(Object)(act_kaladefault.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 7)),act_kaladefault.mostCurrent.activityBA)));
 BA.debugLineNum = 677;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _img_barcode_click() throws Exception{
try {
		Debug.PushSubsStack("Img_barcode_Click (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,1454);
if (RapidSub.canDelegate("img_barcode_click")) { ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","img_barcode_click"); return;}
ResumableSub_Img_barcode_Click rsub = new ResumableSub_Img_barcode_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Img_barcode_Click extends BA.ResumableSub {
public ResumableSub_Img_barcode_Click(ir.parsikhesab.pakhsh.act_kaladefault parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_kaladefault parent;
RemoteObject _result = RemoteObject.createImmutable(false);
RemoteObject _permission = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Img_barcode_Click (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,1454);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 1455;BA.debugLine="Dim Result As Boolean = True";
Debug.ShouldStop(16384);
_result = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("Result", _result);Debug.locals.put("Result", _result);
 BA.debugLineNum = 1456;BA.debugLine="If Not(rp.Check(rp.PERMISSION_CAMERA)) Then";
Debug.ShouldStop(32768);
if (true) break;

case 1:
//if
this.state = 4;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent._rp.runMethod(true,"Check",(Object)(parent._rp.getField(true,"PERMISSION_CAMERA"))))).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1457;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_CAMERA)";
Debug.ShouldStop(65536);
parent._rp.runVoidMethod ("CheckAndRequest",act_kaladefault.processBA,(Object)(parent._rp.getField(true,"PERMISSION_CAMERA")));
 BA.debugLineNum = 1458;BA.debugLine="Wait For Activity_PermissionResult (Permission A";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","activity_permissionresult", act_kaladefault.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_kaladefault", "img_barcode_click"), null);
this.state = 10;
return;
case 10:
//C
this.state = 4;
_permission = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Permission", _permission);
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 if (true) break;
;
 BA.debugLineNum = 1460;BA.debugLine="If Result=False Then";
Debug.ShouldStop(524288);

case 4:
//if
this.state = 9;
if (RemoteObject.solveBoolean("=",_result,parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 1461;BA.debugLine="Return";
Debug.ShouldStop(1048576);
if (true) return ;
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 1464;BA.debugLine="Barcode.isportrait = True";
Debug.ShouldStop(8388608);
parent.mostCurrent._barcode.setField ("isportrait",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1465;BA.debugLine="Barcode.useFrontCam = False";
Debug.ShouldStop(16777216);
parent.mostCurrent._barcode.setField ("useFrontCam",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1468;BA.debugLine="Barcode.timeoutDuration = 30000";
Debug.ShouldStop(134217728);
parent.mostCurrent._barcode.setField ("timeoutDuration",BA.numberCast(int.class, 30000));
 BA.debugLineNum = 1472;BA.debugLine="Barcode.theViewFinderXfactor = 0.7";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._barcode.setField ("theViewFinderXfactor",BA.numberCast(double.class, 0.7));
 BA.debugLineNum = 1473;BA.debugLine="Barcode.theViewFinderYfactor = 0.5";
Debug.ShouldStop(1);
parent.mostCurrent._barcode.setField ("theViewFinderYfactor",BA.numberCast(double.class, 0.5));
 BA.debugLineNum = 1474;BA.debugLine="Barcode.theFrameColor = Colors.Blue";
Debug.ShouldStop(2);
parent.mostCurrent._barcode.setField ("theFrameColor",parent.mostCurrent.__c.getField(false,"Colors").getField(true,"Blue"));
 BA.debugLineNum = 1475;BA.debugLine="Barcode.theLaserColor = Colors.Yellow";
Debug.ShouldStop(4);
parent.mostCurrent._barcode.setField ("theLaserColor",parent.mostCurrent.__c.getField(false,"Colors").getField(true,"Yellow"));
 BA.debugLineNum = 1476;BA.debugLine="Barcode.theMaskColor = Colors.argb(95, 0, 0, 255";
Debug.ShouldStop(8);
parent.mostCurrent._barcode.setField ("theMaskColor",parent.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 95)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 1477;BA.debugLine="Barcode.theResultColor = Colors.Green";
Debug.ShouldStop(16);
parent.mostCurrent._barcode.setField ("theResultColor",parent.mostCurrent.__c.getField(false,"Colors").getField(true,"Green"));
 BA.debugLineNum = 1478;BA.debugLine="Barcode.theResultPointColor = Colors.Red";
Debug.ShouldStop(32);
parent.mostCurrent._barcode.setField ("theResultPointColor",parent.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 1481;BA.debugLine="Barcode.theTopPromptMessage = \"\"";
Debug.ShouldStop(256);
parent.mostCurrent._barcode.setField ("theTopPromptMessage",BA.ObjectToString(""));
 BA.debugLineNum = 1482;BA.debugLine="Barcode.theTopPromptTextSize = 5%y 'text size";
Debug.ShouldStop(512);
parent.mostCurrent._barcode.setField ("theTopPromptTextSize",parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),act_kaladefault.mostCurrent.activityBA));
 BA.debugLineNum = 1483;BA.debugLine="Barcode.topPromptColor = Colors.Red";
Debug.ShouldStop(1024);
parent.mostCurrent._barcode.setField ("topPromptColor",parent.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 1484;BA.debugLine="Barcode.topPromptDistanceFromTop = 1%y 'pixel di";
Debug.ShouldStop(2048);
parent.mostCurrent._barcode.setField ("topPromptDistanceFromTop",parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),act_kaladefault.mostCurrent.activityBA));
 BA.debugLineNum = 1486;BA.debugLine="Barcode.theBottomPromptMessage = \"\"";
Debug.ShouldStop(8192);
parent.mostCurrent._barcode.setField ("theBottomPromptMessage",BA.ObjectToString(""));
 BA.debugLineNum = 1487;BA.debugLine="Barcode.theBottomPromptTextSize = 5%y  'text siz";
Debug.ShouldStop(16384);
parent.mostCurrent._barcode.setField ("theBottomPromptTextSize",parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),act_kaladefault.mostCurrent.activityBA));
 BA.debugLineNum = 1488;BA.debugLine="Barcode.bottomPromptColor = Colors.Blue";
Debug.ShouldStop(32768);
parent.mostCurrent._barcode.setField ("bottomPromptColor",parent.mostCurrent.__c.getField(false,"Colors").getField(true,"Blue"));
 BA.debugLineNum = 1489;BA.debugLine="Barcode.bottomPromptDistanceFromBottom = 5%y  'p";
Debug.ShouldStop(65536);
parent.mostCurrent._barcode.setField ("bottomPromptDistanceFromBottom",parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),act_kaladefault.mostCurrent.activityBA));
 BA.debugLineNum = 1493;BA.debugLine="Barcode.BeginScan(\"myzx\")";
Debug.ShouldStop(1048576);
parent.mostCurrent._barcode.runVoidMethod ("BeginScan",act_kaladefault.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("myzx")));
 if (true) break;

case 9:
//C
this.state = -1;
;
 BA.debugLineNum = 1495;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _activity_permissionresult(RemoteObject _permission,RemoteObject _result) throws Exception{
}
public static void  _img_barcode_click1() throws Exception{
try {
		Debug.PushSubsStack("Img_barcode_Click1 (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,1526);
if (RapidSub.canDelegate("img_barcode_click1")) { ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","img_barcode_click1"); return;}
ResumableSub_Img_barcode_Click1 rsub = new ResumableSub_Img_barcode_Click1(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Img_barcode_Click1 extends BA.ResumableSub {
public ResumableSub_Img_barcode_Click1(ir.parsikhesab.pakhsh.act_kaladefault parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_kaladefault parent;
RemoteObject _result = RemoteObject.createImmutable(false);
RemoteObject _permission = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Img_barcode_Click1 (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,1526);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 1527;BA.debugLine="Dim Result As Boolean = True";
Debug.ShouldStop(4194304);
_result = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("Result", _result);Debug.locals.put("Result", _result);
 BA.debugLineNum = 1528;BA.debugLine="If Not(rp.Check(rp.PERMISSION_CAMERA)) Then";
Debug.ShouldStop(8388608);
if (true) break;

case 1:
//if
this.state = 4;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent._rp.runMethod(true,"Check",(Object)(parent._rp.getField(true,"PERMISSION_CAMERA"))))).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1529;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_CAMERA)";
Debug.ShouldStop(16777216);
parent._rp.runVoidMethod ("CheckAndRequest",act_kaladefault.processBA,(Object)(parent._rp.getField(true,"PERMISSION_CAMERA")));
 BA.debugLineNum = 1530;BA.debugLine="Wait For Activity_PermissionResult (Permission A";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","activity_permissionresult", act_kaladefault.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_kaladefault", "img_barcode_click1"), null);
this.state = 10;
return;
case 10:
//C
this.state = 4;
_permission = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Permission", _permission);
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 if (true) break;
;
 BA.debugLineNum = 1532;BA.debugLine="If Result=False Then";
Debug.ShouldStop(134217728);

case 4:
//if
this.state = 9;
if (RemoteObject.solveBoolean("=",_result,parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 1533;BA.debugLine="Return";
Debug.ShouldStop(268435456);
if (true) return ;
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 1536;BA.debugLine="Barcode.isportrait = True";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._barcode.setField ("isportrait",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1537;BA.debugLine="Barcode.useFrontCam = False";
Debug.ShouldStop(1);
parent.mostCurrent._barcode.setField ("useFrontCam",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1545;BA.debugLine="Barcode.theViewFinderXfactor = 0.7";
Debug.ShouldStop(256);
parent.mostCurrent._barcode.setField ("theViewFinderXfactor",BA.numberCast(double.class, 0.7));
 BA.debugLineNum = 1546;BA.debugLine="Barcode.theViewFinderYfactor = 0.5";
Debug.ShouldStop(512);
parent.mostCurrent._barcode.setField ("theViewFinderYfactor",BA.numberCast(double.class, 0.5));
 BA.debugLineNum = 1547;BA.debugLine="Barcode.theFrameColor = Colors.Blue";
Debug.ShouldStop(1024);
parent.mostCurrent._barcode.setField ("theFrameColor",parent.mostCurrent.__c.getField(false,"Colors").getField(true,"Blue"));
 BA.debugLineNum = 1548;BA.debugLine="Barcode.theLaserColor = Colors.Yellow";
Debug.ShouldStop(2048);
parent.mostCurrent._barcode.setField ("theLaserColor",parent.mostCurrent.__c.getField(false,"Colors").getField(true,"Yellow"));
 BA.debugLineNum = 1549;BA.debugLine="Barcode.theMaskColor = Colors.argb(95, 0, 0, 255";
Debug.ShouldStop(4096);
parent.mostCurrent._barcode.setField ("theMaskColor",parent.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 95)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 1550;BA.debugLine="Barcode.theResultColor = Colors.Green";
Debug.ShouldStop(8192);
parent.mostCurrent._barcode.setField ("theResultColor",parent.mostCurrent.__c.getField(false,"Colors").getField(true,"Green"));
 BA.debugLineNum = 1551;BA.debugLine="Barcode.theResultPointColor = Colors.Red";
Debug.ShouldStop(16384);
parent.mostCurrent._barcode.setField ("theResultPointColor",parent.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 1554;BA.debugLine="Barcode.theTopPromptMessage = \"\"";
Debug.ShouldStop(131072);
parent.mostCurrent._barcode.setField ("theTopPromptMessage",BA.ObjectToString(""));
 BA.debugLineNum = 1555;BA.debugLine="Barcode.theTopPromptTextSize = 5%y 'text size";
Debug.ShouldStop(262144);
parent.mostCurrent._barcode.setField ("theTopPromptTextSize",parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),act_kaladefault.mostCurrent.activityBA));
 BA.debugLineNum = 1556;BA.debugLine="Barcode.topPromptColor = Colors.Red";
Debug.ShouldStop(524288);
parent.mostCurrent._barcode.setField ("topPromptColor",parent.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 1557;BA.debugLine="Barcode.topPromptDistanceFromTop = 1%y 'pixel di";
Debug.ShouldStop(1048576);
parent.mostCurrent._barcode.setField ("topPromptDistanceFromTop",parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),act_kaladefault.mostCurrent.activityBA));
 BA.debugLineNum = 1559;BA.debugLine="Barcode.theBottomPromptMessage = \"\"";
Debug.ShouldStop(4194304);
parent.mostCurrent._barcode.setField ("theBottomPromptMessage",BA.ObjectToString(""));
 BA.debugLineNum = 1560;BA.debugLine="Barcode.theBottomPromptTextSize = 5%y  'text siz";
Debug.ShouldStop(8388608);
parent.mostCurrent._barcode.setField ("theBottomPromptTextSize",parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),act_kaladefault.mostCurrent.activityBA));
 BA.debugLineNum = 1561;BA.debugLine="Barcode.bottomPromptColor = Colors.Blue";
Debug.ShouldStop(16777216);
parent.mostCurrent._barcode.setField ("bottomPromptColor",parent.mostCurrent.__c.getField(false,"Colors").getField(true,"Blue"));
 BA.debugLineNum = 1562;BA.debugLine="Barcode.bottomPromptDistanceFromBottom = 5%y  'p";
Debug.ShouldStop(33554432);
parent.mostCurrent._barcode.setField ("bottomPromptDistanceFromBottom",parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),act_kaladefault.mostCurrent.activityBA));
 BA.debugLineNum = 1566;BA.debugLine="Barcode.BeginScan(\"myzx\")";
Debug.ShouldStop(536870912);
parent.mostCurrent._barcode.runVoidMethod ("BeginScan",act_kaladefault.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("myzx")));
 if (true) break;

case 9:
//C
this.state = -1;
;
 BA.debugLineNum = 1568;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _img_paging_click() throws Exception{
try {
		Debug.PushSubsStack("Img_Paging_Click (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,1707);
if (RapidSub.canDelegate("img_paging_click")) { return ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","img_paging_click");}
 BA.debugLineNum = 1707;BA.debugLine="Private Sub Img_Paging_Click";
Debug.ShouldStop(1024);
 BA.debugLineNum = 1708;BA.debugLine="Try";
Debug.ShouldStop(2048);
try { BA.debugLineNum = 1709;BA.debugLine="Act_KalaPaging.listKala=ListKalaTxt";
Debug.ShouldStop(4096);
act_kaladefault.mostCurrent._act_kalapaging._listkala /*RemoteObject*/  = act_kaladefault.mostCurrent._listkalatxt;
 BA.debugLineNum = 1710;BA.debugLine="StartActivity(Act_KalaPaging)";
Debug.ShouldStop(8192);
act_kaladefault.mostCurrent.__c.runVoidMethod ("StartActivity",act_kaladefault.processBA,(Object)((act_kaladefault.mostCurrent._act_kalapaging.getObject())));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e5) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_kaladefault.processBA, e5.toString()); BA.debugLineNum = 1712;BA.debugLine="Log(LastException)";
Debug.ShouldStop(32768);
act_kaladefault.mostCurrent.__c.runVoidMethod ("LogImpl","536634629",BA.ObjectToString(act_kaladefault.mostCurrent.__c.runMethod(false,"LastException",act_kaladefault.mostCurrent.activityBA)),0);
 BA.debugLineNum = 1713;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(65536);
act_kaladefault.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_kaladefault.mostCurrent.__c.runMethod(false,"LastException",act_kaladefault.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_kaladefault.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-Img_Paging_Click"))));
 };
 BA.debugLineNum = 1715;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _img_rotatepic_click() throws Exception{
try {
		Debug.PushSubsStack("Img_RotatePic_Click (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,2914);
if (RapidSub.canDelegate("img_rotatepic_click")) { return ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","img_rotatepic_click");}
 BA.debugLineNum = 2914;BA.debugLine="Private Sub Img_RotatePic_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 2915;BA.debugLine="If MCode.RotatePic=False Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",act_kaladefault.mostCurrent._mcode._rotatepic /*RemoteObject*/ ,act_kaladefault.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 2916;BA.debugLine="MCode.RotatePic=True";
Debug.ShouldStop(8);
act_kaladefault.mostCurrent._mcode._rotatepic /*RemoteObject*/  = act_kaladefault.mostCurrent.__c.getField(true,"True");
 }else {
 BA.debugLineNum = 2918;BA.debugLine="MCode.RotatePic=False";
Debug.ShouldStop(32);
act_kaladefault.mostCurrent._mcode._rotatepic /*RemoteObject*/  = act_kaladefault.mostCurrent.__c.getField(true,"False");
 };
 BA.debugLineNum = 2920;BA.debugLine="LoadKala";
Debug.ShouldStop(128);
_loadkala();
 BA.debugLineNum = 2921;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _img_selectmoshtari_click() throws Exception{
try {
		Debug.PushSubsStack("Img_SelectMoshtari_Click (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,2909);
if (RapidSub.canDelegate("img_selectmoshtari_click")) { return ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","img_selectmoshtari_click");}
 BA.debugLineNum = 2909;BA.debugLine="Private Sub Img_SelectMoshtari_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 2910;BA.debugLine="MCode.page=\"Act_SelectMantage\"";
Debug.ShouldStop(536870912);
act_kaladefault.mostCurrent._mcode._page /*RemoteObject*/  = BA.ObjectToString("Act_SelectMantage");
 BA.debugLineNum = 2911;BA.debugLine="StartActivity(Act_SelectMantage)";
Debug.ShouldStop(1073741824);
act_kaladefault.mostCurrent.__c.runVoidMethod ("StartActivity",act_kaladefault.processBA,(Object)((act_kaladefault.mostCurrent._act_selectmantage.getObject())));
 BA.debugLineNum = 2912;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _img_sort_click() throws Exception{
try {
		Debug.PushSubsStack("Img_sort_Click (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,1843);
if (RapidSub.canDelegate("img_sort_click")) { return ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","img_sort_click");}
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _res = RemoteObject.createImmutable(0);
 BA.debugLineNum = 1843;BA.debugLine="Sub Img_sort_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 1851;BA.debugLine="Try";
Debug.ShouldStop(67108864);
try { BA.debugLineNum = 1853;BA.debugLine="Dim Lst As List = Array As String(\"کد کالا\",\"کد گ";
Debug.ShouldStop(268435456);
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lst = act_kaladefault.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {8},new Object[] {BA.ObjectToString("کد کالا"),BA.ObjectToString("کد گروه"),BA.ObjectToString("نام کالا نزولی"),BA.ObjectToString("نام کالا صعودی"),BA.ObjectToString("ارزان ترین قیمت"),BA.ObjectToString("گرانترین قیمت"),BA.ObjectToString("کمترین موجودی"),RemoteObject.createImmutable("بیشترین موجودی")})));Debug.locals.put("Lst", _lst);Debug.locals.put("Lst", _lst);
 BA.debugLineNum = 1854;BA.debugLine="Dim res As Int = InputList(Lst,\"مرتب سازی براساس:";
Debug.ShouldStop(536870912);
_res = act_kaladefault.mostCurrent.__c.runMethodAndSync(true,"InputList",(Object)(_lst),(Object)(BA.ObjectToCharSequence("مرتب سازی براساس:")),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),act_kaladefault.mostCurrent.activityBA);Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 1855;BA.debugLine="Select Case res";
Debug.ShouldStop(1073741824);
switch (BA.switchObjectToInt(_res,BA.numberCast(int.class, 0),BA.numberCast(int.class, 1),BA.numberCast(int.class, 2),BA.numberCast(int.class, 3),BA.numberCast(int.class, 4),BA.numberCast(int.class, 5),BA.numberCast(int.class, 6),BA.numberCast(int.class, 7))) {
case 0: {
 BA.debugLineNum = 1857;BA.debugLine="Str_sort = \" Order by fldCodeKala Asc\"";
Debug.ShouldStop(1);
act_kaladefault.mostCurrent._str_sort = BA.ObjectToString(" Order by fldCodeKala Asc");
 break; }
case 1: {
 BA.debugLineNum = 1859;BA.debugLine="Str_sort = \" Order by fldCodeGroup Asc\"";
Debug.ShouldStop(4);
act_kaladefault.mostCurrent._str_sort = BA.ObjectToString(" Order by fldCodeGroup Asc");
 break; }
case 2: {
 BA.debugLineNum = 1861;BA.debugLine="Str_sort = \" Order by fldNameKala\"";
Debug.ShouldStop(16);
act_kaladefault.mostCurrent._str_sort = BA.ObjectToString(" Order by fldNameKala");
 break; }
case 3: {
 BA.debugLineNum = 1863;BA.debugLine="Str_sort = \" Order by fldNameKala Desc\"";
Debug.ShouldStop(64);
act_kaladefault.mostCurrent._str_sort = BA.ObjectToString(" Order by fldNameKala Desc");
 break; }
case 4: {
 BA.debugLineNum = 1865;BA.debugLine="Str_sort = \" Order by fldFeeForoosh\"";
Debug.ShouldStop(256);
act_kaladefault.mostCurrent._str_sort = BA.ObjectToString(" Order by fldFeeForoosh");
 break; }
case 5: {
 BA.debugLineNum = 1867;BA.debugLine="Str_sort = \" Order by fldFeeForoosh Desc\"";
Debug.ShouldStop(1024);
act_kaladefault.mostCurrent._str_sort = BA.ObjectToString(" Order by fldFeeForoosh Desc");
 break; }
case 6: {
 BA.debugLineNum = 1869;BA.debugLine="Str_sort = \" Order by SumMande\"";
Debug.ShouldStop(4096);
act_kaladefault.mostCurrent._str_sort = BA.ObjectToString(" Order by SumMande");
 break; }
case 7: {
 BA.debugLineNum = 1871;BA.debugLine="Str_sort = \" Order by SumMande Desc\"";
Debug.ShouldStop(16384);
act_kaladefault.mostCurrent._str_sort = BA.ObjectToString(" Order by SumMande Desc");
 break; }
}
;
 BA.debugLineNum = 1873;BA.debugLine="Log(Str_sort)";
Debug.ShouldStop(65536);
act_kaladefault.mostCurrent.__c.runVoidMethod ("LogImpl","537093406",act_kaladefault.mostCurrent._str_sort,0);
 BA.debugLineNum = 1875;BA.debugLine="LoadKala";
Debug.ShouldStop(262144);
_loadkala();
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e25) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_kaladefault.processBA, e25.toString()); BA.debugLineNum = 1877;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1048576);
act_kaladefault.mostCurrent.__c.runVoidMethod ("LogImpl","537093410",BA.ObjectToString(act_kaladefault.mostCurrent.__c.runMethod(false,"LastException",act_kaladefault.mostCurrent.activityBA)),0);
 BA.debugLineNum = 1878;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(2097152);
act_kaladefault.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_kaladefault.mostCurrent.__c.runMethod(false,"LastException",act_kaladefault.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_kaladefault.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-Img_sort_Click"))));
 };
 BA.debugLineNum = 1881;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _img_tipfee_click() throws Exception{
try {
		Debug.PushSubsStack("Img_TipFee_Click (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,1944);
if (RapidSub.canDelegate("img_tipfee_click")) { ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","img_tipfee_click"); return;}
ResumableSub_Img_TipFee_Click rsub = new ResumableSub_Img_TipFee_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Img_TipFee_Click extends BA.ResumableSub {
public ResumableSub_Img_TipFee_Click(ir.parsikhesab.pakhsh.act_kaladefault parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_kaladefault parent;
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _res = RemoteObject.createImmutable(0);
RemoteObject _itemtasvie = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlistnoetasvie");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Img_TipFee_Click (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,1944);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 1945;BA.debugLine="Dim Lst As List";
Debug.ShouldStop(16777216);
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Lst", _lst);
 BA.debugLineNum = 1946;BA.debugLine="Lst.Initialize";
Debug.ShouldStop(33554432);
_lst.runVoidMethod ("Initialize");
 BA.debugLineNum = 1955;BA.debugLine="Lst.Initialize2(MCode.ArrayTasvieForKala)";
Debug.ShouldStop(4);
_lst.runVoidMethod ("Initialize2",(Object)(parent.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(parent.mostCurrent._mcode._arraytasvieforkala /*RemoteObject*/ ))));
 BA.debugLineNum = 1956;BA.debugLine="InputListAsync(Lst,\"تیپ قیمت را انتخاب کنید\",Fee";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("InputListAsync",(Object)(_lst),(Object)(BA.ObjectToCharSequence("تیپ قیمت را انتخاب کنید")),(Object)(BA.numberCast(int.class, parent._feetip)),act_kaladefault.processBA,(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 1957;BA.debugLine="Wait For InputList_Result (Result As Int)";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","inputlist_result", act_kaladefault.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_kaladefault", "img_tipfee_click"), null);
this.state = 15;
return;
case 15:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1958;BA.debugLine="If Result <> -3 Then";
Debug.ShouldStop(32);
if (true) break;

case 1:
//if
this.state = 14;
if (RemoteObject.solveBoolean("!",_result,BA.numberCast(double.class, -(double) (0 + 3)))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1959;BA.debugLine="Dim Res As Int=Msgbox2(\"توجه داشته باشید که با";
Debug.ShouldStop(64);
_res = parent.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("توجه داشته باشید که با تغییر تیپ قیمت سبد خرید شما حذف می گردد، آیا می خواهید تیپ قیمت تغییر کند؟")),(Object)(BA.ObjectToCharSequence("توجه")),(Object)(BA.ObjectToString("بله")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("خیر")),(Object)((parent.mostCurrent.__c.getField(false,"Null"))),act_kaladefault.mostCurrent.activityBA);Debug.locals.put("Res", _res);Debug.locals.put("Res", _res);
 BA.debugLineNum = 1960;BA.debugLine="If Res = DialogResponse.POSITIVE Then";
Debug.ShouldStop(128);
if (true) break;

case 4:
//if
this.state = 13;
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 1962;BA.debugLine="If Result=0 Then";
Debug.ShouldStop(512);
if (true) break;

case 7:
//if
this.state = 12;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, 0))) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 BA.debugLineNum = 1963;BA.debugLine="FeeTip = 0";
Debug.ShouldStop(1024);
parent._feetip = BA.NumberToString(0);
 BA.debugLineNum = 1964;BA.debugLine="MCode.feeTip=0";
Debug.ShouldStop(2048);
parent.mostCurrent._mcode._feetip /*RemoteObject*/  = BA.NumberToString(0);
 BA.debugLineNum = 1965;BA.debugLine="MCode.feeCode=0";
Debug.ShouldStop(4096);
parent.mostCurrent._mcode._feecode /*RemoteObject*/  = BA.NumberToString(0);
 BA.debugLineNum = 1966;BA.debugLine="LoadKala";
Debug.ShouldStop(8192);
_loadkala();
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 1968;BA.debugLine="Dim ItemTasvie As AdapterListNoeTasvie";
Debug.ShouldStop(32768);
_itemtasvie = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapterlistnoetasvie");Debug.locals.put("ItemTasvie", _itemtasvie);
 BA.debugLineNum = 1969;BA.debugLine="ItemTasvie.Initialize";
Debug.ShouldStop(65536);
_itemtasvie.runVoidMethod ("Initialize");
 BA.debugLineNum = 1970;BA.debugLine="ItemTasvie=ListTasvie.Get(FeeTip)";
Debug.ShouldStop(131072);
_itemtasvie = (parent.mostCurrent._listtasvie.runMethod(false,"Get",(Object)(BA.numberCast(int.class, parent._feetip))));Debug.locals.put("ItemTasvie", _itemtasvie);
 BA.debugLineNum = 1971;BA.debugLine="FeeTip = Result";
Debug.ShouldStop(262144);
parent._feetip = BA.NumberToString(_result);
 BA.debugLineNum = 1972;BA.debugLine="MCode.feeTip=Result";
Debug.ShouldStop(524288);
parent.mostCurrent._mcode._feetip /*RemoteObject*/  = BA.NumberToString(_result);
 BA.debugLineNum = 1973;BA.debugLine="MCode.feeCode=ItemTasvie.FldC_Tasvie";
Debug.ShouldStop(1048576);
parent.mostCurrent._mcode._feecode /*RemoteObject*/  = _itemtasvie.getField(true,"FldC_Tasvie" /*RemoteObject*/ );
 BA.debugLineNum = 1974;BA.debugLine="Log(\"Fee: \"&Result)";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","537552158",RemoteObject.concat(RemoteObject.createImmutable("Fee: "),_result),0);
 BA.debugLineNum = 1976;BA.debugLine="UpdateFee";
Debug.ShouldStop(8388608);
_updatefee();
 if (true) break;

case 12:
//C
this.state = 13;
;
 if (true) break;

case 13:
//C
this.state = 14;
;
 if (true) break;

case 14:
//C
this.state = -1;
;
 BA.debugLineNum = 1985;BA.debugLine="End Sub";
Debug.ShouldStop(1);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _inputlist_result(RemoteObject _result) throws Exception{
}
public static RemoteObject  _input_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("input_TextChanged (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,2234);
if (RapidSub.canDelegate("input_textchanged")) { return ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","input_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 2234;BA.debugLine="Sub input_TextChanged (Old As String, New As Strin";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 2235;BA.debugLine="Log(Old)";
Debug.ShouldStop(67108864);
act_kaladefault.mostCurrent.__c.runVoidMethod ("LogImpl","538010881",_old,0);
 BA.debugLineNum = 2236;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lblbackgroup_click() throws Exception{
try {
		Debug.PushSubsStack("lblBackGroup_Click (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,2927);
if (RapidSub.canDelegate("lblbackgroup_click")) { return ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","lblbackgroup_click");}
 BA.debugLineNum = 2927;BA.debugLine="Private Sub lblBackGroup_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 2928;BA.debugLine="If MCode.C_LayeKala.Length > 3 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean(">",act_kaladefault.mostCurrent._mcode._c_layekala /*RemoteObject*/ .runMethod(true,"length"),BA.numberCast(double.class, 3))) { 
 BA.debugLineNum = 2930;BA.debugLine="If MCode.C_LayeKala.Length=6 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",act_kaladefault.mostCurrent._mcode._c_layekala /*RemoteObject*/ .runMethod(true,"length"),BA.numberCast(double.class, 6))) { 
 BA.debugLineNum = 2931;BA.debugLine="lblBackGroup.Visible=False";
Debug.ShouldStop(262144);
act_kaladefault.mostCurrent._lblbackgroup.runMethod(true,"setVisible",act_kaladefault.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 2933;BA.debugLine="LoadGoroohKalaBack(MCode.C_LayeKala)";
Debug.ShouldStop(1048576);
_loadgoroohkalaback(act_kaladefault.mostCurrent._mcode._c_layekala /*RemoteObject*/ );
 }else {
 BA.debugLineNum = 2935;BA.debugLine="lblBackGroup.Visible=False";
Debug.ShouldStop(4194304);
act_kaladefault.mostCurrent._lblbackgroup.runMethod(true,"setVisible",act_kaladefault.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 2937;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lblgift_click() throws Exception{
try {
		Debug.PushSubsStack("LblGift_Click (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,2947);
if (RapidSub.canDelegate("lblgift_click")) { return ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","lblgift_click");}
 BA.debugLineNum = 2947;BA.debugLine="Private Sub LblGift_Click";
Debug.ShouldStop(4);
 BA.debugLineNum = 2948;BA.debugLine="If LblGiftCount.Text>0 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, act_kaladefault.mostCurrent._lblgiftcount.runMethod(true,"getText")),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2949;BA.debugLine="If Table1.IsInitialized Then";
Debug.ShouldStop(16);
if (act_kaladefault.mostCurrent._table1.runMethod(true,"IsInitialized" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2950;BA.debugLine="PnlTableEshantion.RemoveAllViews";
Debug.ShouldStop(32);
act_kaladefault.mostCurrent._pnltableeshantion.runVoidMethod ("RemoveAllViews");
 };
 BA.debugLineNum = 2952;BA.debugLine="Table1.Initialize(Me, \"Table1\",6)";
Debug.ShouldStop(128);
act_kaladefault.mostCurrent._table1.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_initialize" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(act_kaladefault.getObject()),(Object)(BA.ObjectToString("Table1")),(Object)(BA.numberCast(int.class, 6)));
 BA.debugLineNum = 2953;BA.debugLine="Table1.AddToActivity(PnlTableEshantion, 1%x,1%y,";
Debug.ShouldStop(256);
act_kaladefault.mostCurrent._table1.runClassMethod (ir.parsikhesab.pakhsh.table.class, "_addtoactivity" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ActivityWrapper"), act_kaladefault.mostCurrent._pnltableeshantion.getObject()),(Object)(act_kaladefault.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 1)),act_kaladefault.mostCurrent.activityBA)),(Object)(act_kaladefault.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),act_kaladefault.mostCurrent.activityBA)),(Object)(act_kaladefault.mostCurrent._pnltableeshantion.runMethod(true,"getWidth")),(Object)(act_kaladefault.mostCurrent._pnltableeshantion.runMethod(true,"getHeight")));
 BA.debugLineNum = 2954;BA.debugLine="Grid";
Debug.ShouldStop(512);
_grid();
 BA.debugLineNum = 2955;BA.debugLine="PnlEshantion.Visible=True";
Debug.ShouldStop(1024);
act_kaladefault.mostCurrent._pnleshantion.runMethod(true,"setVisible",act_kaladefault.mostCurrent.__c.getField(true,"True"));
 };
 BA.debugLineNum = 2958;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _lbltedadjoz_click(RemoteObject _item) throws Exception{
try {
		Debug.PushSubsStack("LblTedadJoz_Click (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,2337);
if (RapidSub.canDelegate("lbltedadjoz_click")) { ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","lbltedadjoz_click", _item); return;}
ResumableSub_LblTedadJoz_Click rsub = new ResumableSub_LblTedadJoz_Click(null,_item);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_LblTedadJoz_Click extends BA.ResumableSub {
public ResumableSub_LblTedadJoz_Click(ir.parsikhesab.pakhsh.act_kaladefault parent,RemoteObject _item) {
this.parent = parent;
this._item = _item;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_kaladefault parent;
RemoteObject _item;
RemoteObject _input = RemoteObject.declareNull("ir.parsikhesab.pakhsh.b4xinputtemplate");
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _res = RemoteObject.createImmutable(0f);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("LblTedadJoz_Click (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,2337);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("Item", _item);
 BA.debugLineNum = 2338;BA.debugLine="Dialog.Title = \"  \"";
Debug.ShouldStop(2);
parent.mostCurrent._dialog.setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("  ")));
 BA.debugLineNum = 2339;BA.debugLine="Dim input As B4XInputTemplate";
Debug.ShouldStop(4);
_input = RemoteObject.createNew ("ir.parsikhesab.pakhsh.b4xinputtemplate");Debug.locals.put("input", _input);
 BA.debugLineNum = 2340;BA.debugLine="input.Initialize";
Debug.ShouldStop(8);
_input.runClassMethod (ir.parsikhesab.pakhsh.b4xinputtemplate.class, "_initialize" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA);
 BA.debugLineNum = 2341;BA.debugLine="input.lblTitle.Text = \" تعداد \"&Item.NameVahed";
Debug.ShouldStop(16);
_input.getField(false,"_lbltitle" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable(" تعداد "),_item.getField(true,"NameVahed" /*RemoteObject*/ ))));
 BA.debugLineNum = 2342;BA.debugLine="Log(MCode.isFloat)";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","538207493",BA.ObjectToString(parent.mostCurrent._mcode._isfloat /*RemoteObject*/ ),0);
 BA.debugLineNum = 2343;BA.debugLine="MCode.isFloat = True";
Debug.ShouldStop(64);
parent.mostCurrent._mcode._isfloat /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 2344;BA.debugLine="Select Case MCode.isFloat";
Debug.ShouldStop(128);
if (true) break;

case 1:
//select
this.state = 6;
switch (BA.switchObjectToInt(parent.mostCurrent._mcode._isfloat /*RemoteObject*/ ,parent.mostCurrent.__c.getField(true,"True"),parent.mostCurrent.__c.getField(true,"False"))) {
case 0: {
this.state = 3;
if (true) break;
}
case 1: {
this.state = 5;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 2346;BA.debugLine="input.ConfigureForNumbers(True, True)";
Debug.ShouldStop(512);
_input.runClassMethod (ir.parsikhesab.pakhsh.b4xinputtemplate.class, "_configurefornumbers" /*RemoteObject*/ ,(Object)(parent.mostCurrent.__c.getField(true,"True")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 2348;BA.debugLine="input.ConfigureForNumbers(False, True)";
Debug.ShouldStop(2048);
_input.runClassMethod (ir.parsikhesab.pakhsh.b4xinputtemplate.class, "_configurefornumbers" /*RemoteObject*/ ,(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 2351;BA.debugLine="Dim rs As ResumableSub =Dialog.ShowTemplate(input";
Debug.ShouldStop(16384);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = parent.mostCurrent._dialog.runClassMethod (ir.parsikhesab.pakhsh.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_input)),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("CANCEL"))));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 2352;BA.debugLine="Dialog.Base.Top = 50%y - Dialog.Base.Height / 2";
Debug.ShouldStop(32768);
parent.mostCurrent._dialog.getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"setTop",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 50)),act_kaladefault.mostCurrent.activityBA),parent.mostCurrent._dialog.getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "-/",1, 0)));
 BA.debugLineNum = 2353;BA.debugLine="Wait For (rs) Complete (Result As Int)";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", act_kaladefault.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_kaladefault", "lbltedadjoz_click"), _rs);
this.state = 27;
return;
case 27:
//C
this.state = 7;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2354;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
Debug.ShouldStop(131072);
if (true) break;

case 7:
//if
this.state = 26;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent._xui.getField(true,"DialogResponse_Positive")))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 2355;BA.debugLine="Dim res As Float = input.Text 'no need to check";
Debug.ShouldStop(262144);
_res = BA.numberCast(float.class, _input.getField(true,"_text" /*RemoteObject*/ ));Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 2356;BA.debugLine="If res>=0 Then";
Debug.ShouldStop(524288);
if (true) break;

case 10:
//if
this.state = 25;
if (RemoteObject.solveBoolean("g",_res,BA.numberCast(double.class, 0))) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 2357;BA.debugLine="If MCode.ForooshBishAzMojoodi = \"1\" Then";
Debug.ShouldStop(1048576);
if (true) break;

case 13:
//if
this.state = 24;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._mcode._forooshbishazmojoodi /*RemoteObject*/ ,BA.ObjectToString("1"))) { 
this.state = 15;
}else {
this.state = 17;
}if (true) break;

case 15:
//C
this.state = 24;
 BA.debugLineNum = 2358;BA.debugLine="Item.SumMande = Item.SumMande - (res-Item.Teda";
Debug.ShouldStop(2097152);
_item.setField ("SumMande" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _item.getField(true,"SumMande" /*RemoteObject*/ )),(RemoteObject.solve(new RemoteObject[] {_res,BA.numberCast(double.class, _item.getField(true,"TedadDarSabadJoz" /*RemoteObject*/ ))}, "-",1, 0))}, "-",1, 0)));
 BA.debugLineNum = 2359;BA.debugLine="Item.TedadDarSabadJoz = res";
Debug.ShouldStop(4194304);
_item.setField ("TedadDarSabadJoz" /*RemoteObject*/ ,BA.NumberToString(_res));
 BA.debugLineNum = 2360;BA.debugLine="AddToSabad(Item)";
Debug.ShouldStop(8388608);
_addtosabad(_item);
 if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 2362;BA.debugLine="If (Item.SumMande + Item.TedadDarSabadJoz) >=";
Debug.ShouldStop(33554432);
if (true) break;

case 18:
//if
this.state = 23;
if (RemoteObject.solveBoolean("g",(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _item.getField(true,"SumMande" /*RemoteObject*/ )),BA.numberCast(double.class, _item.getField(true,"TedadDarSabadJoz" /*RemoteObject*/ ))}, "+",1, 0)),BA.numberCast(double.class, _res))) { 
this.state = 20;
}else {
this.state = 22;
}if (true) break;

case 20:
//C
this.state = 23;
 BA.debugLineNum = 2363;BA.debugLine="Item.SumMande = Item.SumMande - (res-Item.Ted";
Debug.ShouldStop(67108864);
_item.setField ("SumMande" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _item.getField(true,"SumMande" /*RemoteObject*/ )),(RemoteObject.solve(new RemoteObject[] {_res,BA.numberCast(double.class, _item.getField(true,"TedadDarSabadJoz" /*RemoteObject*/ ))}, "-",1, 0))}, "-",1, 0)));
 BA.debugLineNum = 2364;BA.debugLine="Item.TedadDarSabadJoz = res";
Debug.ShouldStop(134217728);
_item.setField ("TedadDarSabadJoz" /*RemoteObject*/ ,BA.NumberToString(_res));
 BA.debugLineNum = 2365;BA.debugLine="AddToSabad(Item)";
Debug.ShouldStop(268435456);
_addtosabad(_item);
 if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 2367;BA.debugLine="ToastMessageShow(\"سفارش شما بیشتر از موجودی م";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("سفارش شما بیشتر از موجودی می باشد")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;

case 23:
//C
this.state = 24;
;
 if (true) break;

case 24:
//C
this.state = 25;
;
 if (true) break;

case 25:
//C
this.state = 26;
;
 if (true) break;

case 26:
//C
this.state = -1;
;
 BA.debugLineNum = 2373;BA.debugLine="End Sub";
Debug.ShouldStop(16);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _complete(RemoteObject _result) throws Exception{
}
public static void  _lbltedadkol_click(RemoteObject _item) throws Exception{
try {
		Debug.PushSubsStack("LblTedadkol_Click (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,2375);
if (RapidSub.canDelegate("lbltedadkol_click")) { ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","lbltedadkol_click", _item); return;}
ResumableSub_LblTedadkol_Click rsub = new ResumableSub_LblTedadkol_Click(null,_item);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_LblTedadkol_Click extends BA.ResumableSub {
public ResumableSub_LblTedadkol_Click(ir.parsikhesab.pakhsh.act_kaladefault parent,RemoteObject _item) {
this.parent = parent;
this._item = _item;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_kaladefault parent;
RemoteObject _item;
RemoteObject _input = RemoteObject.declareNull("ir.parsikhesab.pakhsh.b4xinputtemplate");
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _res = RemoteObject.createImmutable(0f);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("LblTedadkol_Click (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,2375);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("Item", _item);
 BA.debugLineNum = 2376;BA.debugLine="Dialog.Title = \"  \"";
Debug.ShouldStop(128);
parent.mostCurrent._dialog.setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("  ")));
 BA.debugLineNum = 2377;BA.debugLine="Dim input As B4XInputTemplate";
Debug.ShouldStop(256);
_input = RemoteObject.createNew ("ir.parsikhesab.pakhsh.b4xinputtemplate");Debug.locals.put("input", _input);
 BA.debugLineNum = 2378;BA.debugLine="input.Initialize";
Debug.ShouldStop(512);
_input.runClassMethod (ir.parsikhesab.pakhsh.b4xinputtemplate.class, "_initialize" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA);
 BA.debugLineNum = 2379;BA.debugLine="input.lblTitle.Text = \" تعداد \"&Item.NameVahed2";
Debug.ShouldStop(1024);
_input.getField(false,"_lbltitle" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable(" تعداد "),_item.getField(true,"NameVahed2" /*RemoteObject*/ ))));
 BA.debugLineNum = 2380;BA.debugLine="input.ConfigureForNumbers(True, True)";
Debug.ShouldStop(2048);
_input.runClassMethod (ir.parsikhesab.pakhsh.b4xinputtemplate.class, "_configurefornumbers" /*RemoteObject*/ ,(Object)(parent.mostCurrent.__c.getField(true,"True")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 2382;BA.debugLine="Dim rs As ResumableSub =Dialog.ShowTemplate(input";
Debug.ShouldStop(8192);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = parent.mostCurrent._dialog.runClassMethod (ir.parsikhesab.pakhsh.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_input)),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("CANCEL"))));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 2383;BA.debugLine="Dialog.Base.Top = 50%y - Dialog.Base.Height / 2";
Debug.ShouldStop(16384);
parent.mostCurrent._dialog.getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"setTop",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 50)),act_kaladefault.mostCurrent.activityBA),parent.mostCurrent._dialog.getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "-/",1, 0)));
 BA.debugLineNum = 2384;BA.debugLine="Wait For (rs) Complete (Result As Int)";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", act_kaladefault.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_kaladefault", "lbltedadkol_click"), _rs);
this.state = 21;
return;
case 21:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2385;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
Debug.ShouldStop(65536);
if (true) break;

case 1:
//if
this.state = 20;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent._xui.getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 2386;BA.debugLine="Dim res As Float = input.Text 'no need to check";
Debug.ShouldStop(131072);
_res = BA.numberCast(float.class, _input.getField(true,"_text" /*RemoteObject*/ ));Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 2387;BA.debugLine="If res>=0 Then";
Debug.ShouldStop(262144);
if (true) break;

case 4:
//if
this.state = 19;
if (RemoteObject.solveBoolean("g",_res,BA.numberCast(double.class, 0))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 2388;BA.debugLine="If MCode.ForooshBishAzMojoodi = \"1\" Then";
Debug.ShouldStop(524288);
if (true) break;

case 7:
//if
this.state = 18;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._mcode._forooshbishazmojoodi /*RemoteObject*/ ,BA.ObjectToString("1"))) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 18;
 BA.debugLineNum = 2389;BA.debugLine="Item.SumMande = Item.SumMande - ((res*Item.Ted";
Debug.ShouldStop(1048576);
_item.setField ("SumMande" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _item.getField(true,"SumMande" /*RemoteObject*/ )),(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_res,BA.numberCast(double.class, _item.getField(true,"TedadDarKarton" /*RemoteObject*/ ))}, "*",0, 0)),(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _item.getField(true,"TedadDarSabadKol" /*RemoteObject*/ )),BA.numberCast(double.class, _item.getField(true,"TedadDarKarton" /*RemoteObject*/ ))}, "*",0, 0))}, "-",1, 0))}, "-",1, 0)));
 BA.debugLineNum = 2390;BA.debugLine="Item.TedadDarSabadKol = res";
Debug.ShouldStop(2097152);
_item.setField ("TedadDarSabadKol" /*RemoteObject*/ ,BA.NumberToString(_res));
 BA.debugLineNum = 2391;BA.debugLine="AddToSabad(Item)";
Debug.ShouldStop(4194304);
_addtosabad(_item);
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 2393;BA.debugLine="If (Item.SumMande + (Item.TedadDarSabadKol*Ite";
Debug.ShouldStop(16777216);
if (true) break;

case 12:
//if
this.state = 17;
if (RemoteObject.solveBoolean("g",(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _item.getField(true,"SumMande" /*RemoteObject*/ )),(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _item.getField(true,"TedadDarSabadKol" /*RemoteObject*/ )),BA.numberCast(double.class, _item.getField(true,"TedadDarKarton" /*RemoteObject*/ ))}, "*",0, 0))}, "+",1, 0)),(RemoteObject.solve(new RemoteObject[] {_res,BA.numberCast(double.class, _item.getField(true,"TedadDarKarton" /*RemoteObject*/ ))}, "*",0, 0)))) { 
this.state = 14;
}else {
this.state = 16;
}if (true) break;

case 14:
//C
this.state = 17;
 BA.debugLineNum = 2394;BA.debugLine="Item.SumMande = Item.SumMande - ((res*Item.Te";
Debug.ShouldStop(33554432);
_item.setField ("SumMande" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _item.getField(true,"SumMande" /*RemoteObject*/ )),(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_res,BA.numberCast(double.class, _item.getField(true,"TedadDarKarton" /*RemoteObject*/ ))}, "*",0, 0)),(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _item.getField(true,"TedadDarSabadKol" /*RemoteObject*/ )),BA.numberCast(double.class, _item.getField(true,"TedadDarKarton" /*RemoteObject*/ ))}, "*",0, 0))}, "-",1, 0))}, "-",1, 0)));
 BA.debugLineNum = 2395;BA.debugLine="Item.TedadDarSabadKol = res";
Debug.ShouldStop(67108864);
_item.setField ("TedadDarSabadKol" /*RemoteObject*/ ,BA.NumberToString(_res));
 BA.debugLineNum = 2396;BA.debugLine="AddToSabad(Item)";
Debug.ShouldStop(134217728);
_addtosabad(_item);
 if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 2398;BA.debugLine="ToastMessageShow(\"سفارش شما بیشتر از موجودی م";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("سفارش شما بیشتر از موجودی می باشد")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;

case 17:
//C
this.state = 18;
;
 if (true) break;

case 18:
//C
this.state = 19;
;
 if (true) break;

case 19:
//C
this.state = 20;
;
 if (true) break;

case 20:
//C
this.state = -1;
;
 BA.debugLineNum = 2403;BA.debugLine="End Sub";
Debug.ShouldStop(4);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _loadacspgroohkala() throws Exception{
try {
		Debug.PushSubsStack("LoadAcSpGroohKala (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,594);
if (RapidSub.canDelegate("loadacspgroohkala")) { return ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","loadacspgroohkala");}
RemoteObject _dt1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
RemoteObject _sizecode = RemoteObject.createImmutable(0L);
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adaptergoroohkala");
RemoteObject _code = RemoteObject.createImmutable("");
RemoteObject _count = RemoteObject.createImmutable(0L);
RemoteObject _mincode = RemoteObject.createImmutable("");
RemoteObject _a = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adaptergoroohkala");
RemoteObject _namegroup = RemoteObject.createImmutable("");
RemoteObject _codegroup = RemoteObject.createImmutable("");
 BA.debugLineNum = 594;BA.debugLine="Sub LoadAcSpGroohKala";
Debug.ShouldStop(131072);
 BA.debugLineNum = 595;BA.debugLine="Try";
Debug.ShouldStop(262144);
try { BA.debugLineNum = 596;BA.debugLine="lstGroup1.Add(\"همه گروه ها\")";
Debug.ShouldStop(524288);
act_kaladefault.mostCurrent._lstgroup1.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("همه گروه ها"))));
 BA.debugLineNum = 597;BA.debugLine="Dim Dt1 As Cursor = MCode.Result(\"Select FldC_Go";
Debug.ShouldStop(1048576);
_dt1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_dt1 = act_kaladefault.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Select FldC_Gorooh,FldN_Gorooh From TblGoroohKala")));Debug.locals.put("Dt1", _dt1);Debug.locals.put("Dt1", _dt1);
 BA.debugLineNum = 598;BA.debugLine="For i=0 To Dt1.RowCount-1";
Debug.ShouldStop(2097152);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {_dt1.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 599;BA.debugLine="Dt1.Position=i";
Debug.ShouldStop(4194304);
_dt1.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 601;BA.debugLine="Dim sizeCode As Long=Dt1.GetString(\"FldC_Gorooh";
Debug.ShouldStop(16777216);
_sizecode = BA.numberCast(long.class, _dt1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Gorooh"))).runMethod(true,"length"));Debug.locals.put("sizeCode", _sizecode);Debug.locals.put("sizeCode", _sizecode);
 BA.debugLineNum = 602;BA.debugLine="If sizeCode=3 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_sizecode,BA.numberCast(long.class, 3))) { 
 BA.debugLineNum = 603;BA.debugLine="Dim Item As AdapterGoroohKala";
Debug.ShouldStop(67108864);
_item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adaptergoroohkala");Debug.locals.put("Item", _item);
 BA.debugLineNum = 604;BA.debugLine="Item.FldC_Gorooh= Dt1.GetString(\"FldC_Gorooh\")";
Debug.ShouldStop(134217728);
_item.setField ("FldC_Gorooh" /*RemoteObject*/ ,_dt1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Gorooh"))));
 BA.debugLineNum = 605;BA.debugLine="Item.FldN_Gorooh= Dt1.GetString(\"FldN_Gorooh\")";
Debug.ShouldStop(268435456);
_item.setField ("FldN_Gorooh" /*RemoteObject*/ ,_dt1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldN_Gorooh"))));
 BA.debugLineNum = 606;BA.debugLine="OriginalListGoroohKala1.Add(Item)";
Debug.ShouldStop(536870912);
act_kaladefault.mostCurrent._originallistgoroohkala1.runVoidMethod ("Add",(Object)((_item)));
 BA.debugLineNum = 607;BA.debugLine="lstGroup1.Add(Item.FldN_Gorooh)";
Debug.ShouldStop(1073741824);
act_kaladefault.mostCurrent._lstgroup1.runVoidMethod ("Add",(Object)((_item.getField(true,"FldN_Gorooh" /*RemoteObject*/ ))));
 }else {
 BA.debugLineNum = 609;BA.debugLine="Dim code As String=Dt1.GetString(\"FldC_Gorooh\"";
Debug.ShouldStop(1);
_code = _dt1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Gorooh"))).runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 3)));Debug.locals.put("code", _code);Debug.locals.put("code", _code);
 BA.debugLineNum = 610;BA.debugLine="Dim count As Long";
Debug.ShouldStop(2);
_count = RemoteObject.createImmutable(0L);Debug.locals.put("count", _count);
 BA.debugLineNum = 611;BA.debugLine="Dim MinCode As String =MCode.SingleResult(\"Sel";
Debug.ShouldStop(4);
_mincode = BA.ObjectToString(act_kaladefault.mostCurrent._mcode.runMethod(false,"_singleresult" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select min(FldC_Gorooh) From TblGoroohKala where FldC_Gorooh Like '"),_code,RemoteObject.createImmutable("%'")))));Debug.locals.put("MinCode", _mincode);Debug.locals.put("MinCode", _mincode);
 BA.debugLineNum = 612;BA.debugLine="For Each a As AdapterGoroohKala In OriginalLis";
Debug.ShouldStop(8);
{
final RemoteObject group17 = act_kaladefault.mostCurrent._originallistgoroohkala1;
final int groupLen17 = group17.runMethod(true,"getSize").<Integer>get()
;int index17 = 0;
;
for (; index17 < groupLen17;index17++){
_a = (group17.runMethod(false,"Get",index17));Debug.locals.put("a", _a);
Debug.locals.put("a", _a);
 BA.debugLineNum = 613;BA.debugLine="If a.FldC_Gorooh.SubString2(0,3)=code Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_a.getField(true,"FldC_Gorooh" /*RemoteObject*/ ).runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 3))),_code)) { 
 BA.debugLineNum = 614;BA.debugLine="count=1";
Debug.ShouldStop(32);
_count = BA.numberCast(long.class, 1);Debug.locals.put("count", _count);
 BA.debugLineNum = 615;BA.debugLine="Exit";
Debug.ShouldStop(64);
if (true) break;
 };
 }
}Debug.locals.put("a", _a);
;
 BA.debugLineNum = 618;BA.debugLine="If count =0 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_count,BA.numberCast(long.class, 0))) { 
 BA.debugLineNum = 619;BA.debugLine="Dim NameGroup,CodeGroup As String";
Debug.ShouldStop(1024);
_namegroup = RemoteObject.createImmutable("");Debug.locals.put("NameGroup", _namegroup);
_codegroup = RemoteObject.createImmutable("");Debug.locals.put("CodeGroup", _codegroup);
 BA.debugLineNum = 620;BA.debugLine="CodeGroup=MinCode";
Debug.ShouldStop(2048);
_codegroup = _mincode;Debug.locals.put("CodeGroup", _codegroup);
 BA.debugLineNum = 621;BA.debugLine="NameGroup=MCode.SingleResult(\"Select FldN_Gor";
Debug.ShouldStop(4096);
_namegroup = BA.ObjectToString(act_kaladefault.mostCurrent._mcode.runMethod(false,"_singleresult" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select FldN_Gorooh From TblGoroohKala where FldC_Gorooh='"),_mincode,RemoteObject.createImmutable("'")))));Debug.locals.put("NameGroup", _namegroup);
 BA.debugLineNum = 622;BA.debugLine="Dim Item As AdapterGoroohKala";
Debug.ShouldStop(8192);
_item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adaptergoroohkala");Debug.locals.put("Item", _item);
 BA.debugLineNum = 623;BA.debugLine="Item.FldC_Gorooh= CodeGroup";
Debug.ShouldStop(16384);
_item.setField ("FldC_Gorooh" /*RemoteObject*/ ,_codegroup);
 BA.debugLineNum = 624;BA.debugLine="Item.FldN_Gorooh= NameGroup";
Debug.ShouldStop(32768);
_item.setField ("FldN_Gorooh" /*RemoteObject*/ ,_namegroup);
 BA.debugLineNum = 625;BA.debugLine="OriginalListGoroohKala1.Add(Item)";
Debug.ShouldStop(65536);
act_kaladefault.mostCurrent._originallistgoroohkala1.runVoidMethod ("Add",(Object)((_item)));
 BA.debugLineNum = 626;BA.debugLine="lstGroup1.Add(Item.FldN_Gorooh)";
Debug.ShouldStop(131072);
act_kaladefault.mostCurrent._lstgroup1.runVoidMethod ("Add",(Object)((_item.getField(true,"FldN_Gorooh" /*RemoteObject*/ ))));
 };
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 632;BA.debugLine="NiceSpinner.attachDataSource(lstGroup1)";
Debug.ShouldStop(8388608);
act_kaladefault.mostCurrent._nicespinner.runVoidMethod ("attachDataSource",(Object)((act_kaladefault.mostCurrent._lstgroup1.getObject())));
 BA.debugLineNum = 633;BA.debugLine="NiceSpinner.SelectedTextColor = Colors.blue";
Debug.ShouldStop(16777216);
act_kaladefault.mostCurrent._nicespinner.runVoidMethod ("setSelectedTextColor",act_kaladefault.mostCurrent.__c.getField(false,"Colors").getField(true,"Blue"));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e38) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_kaladefault.processBA, e38.toString()); BA.debugLineNum = 636;BA.debugLine="Log(LastException)";
Debug.ShouldStop(134217728);
act_kaladefault.mostCurrent.__c.runVoidMethod ("LogImpl","534930730",BA.ObjectToString(act_kaladefault.mostCurrent.__c.runMethod(false,"LastException",act_kaladefault.mostCurrent.activityBA)),0);
 BA.debugLineNum = 637;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(268435456);
act_kaladefault.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_kaladefault.mostCurrent.__c.runMethod(false,"LastException",act_kaladefault.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_kaladefault.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-LoadAcSpGroohKala"))));
 };
 BA.debugLineNum = 639;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadacspnoetasvie() throws Exception{
try {
		Debug.PushSubsStack("LoadAcSpNoeTasvie (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,1917);
if (RapidSub.canDelegate("loadacspnoetasvie")) { return ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","loadacspnoetasvie");}
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _somearray = null;
int _i = 0;
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlistnoetasvie");
 BA.debugLineNum = 1917;BA.debugLine="Sub LoadAcSpNoeTasvie As List";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 1918;BA.debugLine="Try";
Debug.ShouldStop(536870912);
try { BA.debugLineNum = 1919;BA.debugLine="Dim ListTasvie As List";
Debug.ShouldStop(1073741824);
act_kaladefault.mostCurrent._listtasvie = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 BA.debugLineNum = 1920;BA.debugLine="ListTasvie.Initialize";
Debug.ShouldStop(-2147483648);
act_kaladefault.mostCurrent._listtasvie.runVoidMethod ("Initialize");
 BA.debugLineNum = 1921;BA.debugLine="Dim Cu As Cursor =MCode.Result(\"Select * From Tbl";
Debug.ShouldStop(1);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_kaladefault.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Select * From TblTasvie")));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 1922;BA.debugLine="Dim SomeArray(Cu.RowCount+1) As String";
Debug.ShouldStop(2);
_somearray = RemoteObject.createNewArray ("String", new int[] {RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "+",1, 1).<Integer>get().intValue()}, new Object[]{});Debug.locals.put("SomeArray", _somearray);
 BA.debugLineNum = 1923;BA.debugLine="SomeArray(0)=\"انتخاب کنید\"";
Debug.ShouldStop(4);
_somearray.setArrayElement (BA.ObjectToString("انتخاب کنید"),BA.numberCast(int.class, 0));
 BA.debugLineNum = 1924;BA.debugLine="If Cu.RowCount>0 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1925;BA.debugLine="For i = 0 To Cu.RowCount-1";
Debug.ShouldStop(16);
{
final int step8 = 1;
final int limit8 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step8 > 0 && _i <= limit8) || (step8 < 0 && _i >= limit8) ;_i = ((int)(0 + _i + step8))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1926;BA.debugLine="Cu.Position=i";
Debug.ShouldStop(32);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 1927;BA.debugLine="Dim Item As AdapterListNoeTasvie";
Debug.ShouldStop(64);
_item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapterlistnoetasvie");Debug.locals.put("Item", _item);
 BA.debugLineNum = 1928;BA.debugLine="Item.FldC_Tasvie=Cu.GetString(\"FldCode\")";
Debug.ShouldStop(128);
_item.setField ("FldC_Tasvie" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldCode"))));
 BA.debugLineNum = 1929;BA.debugLine="Item.FldN_Tasvie=Cu.GetString(\"FldName\")";
Debug.ShouldStop(256);
_item.setField ("FldN_Tasvie" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldName"))));
 BA.debugLineNum = 1930;BA.debugLine="ListTasvie.Add(Item)";
Debug.ShouldStop(512);
act_kaladefault.mostCurrent._listtasvie.runVoidMethod ("Add",(Object)((_item)));
 BA.debugLineNum = 1932;BA.debugLine="SomeArray(i+1)=Cu.GetString(\"FldName\")";
Debug.ShouldStop(2048);
_somearray.setArrayElement (_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldName"))),RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1934;BA.debugLine="MCode.ArrayTasvieForKala=SomeArray";
Debug.ShouldStop(8192);
act_kaladefault.mostCurrent._mcode._arraytasvieforkala /*RemoteObject*/  = _somearray;
 };
 BA.debugLineNum = 1936;BA.debugLine="Return ListTasvie";
Debug.ShouldStop(32768);
Debug.CheckDeviceExceptions();if (true) return act_kaladefault.mostCurrent._listtasvie;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e20) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_kaladefault.processBA, e20.toString()); BA.debugLineNum = 1939;BA.debugLine="Log(LastException)";
Debug.ShouldStop(262144);
act_kaladefault.mostCurrent.__c.runVoidMethod ("LogImpl","537486614",BA.ObjectToString(act_kaladefault.mostCurrent.__c.runMethod(false,"LastException",act_kaladefault.mostCurrent.activityBA)),0);
 BA.debugLineNum = 1940;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(524288);
act_kaladefault.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_kaladefault.mostCurrent.__c.runMethod(false,"LastException",act_kaladefault.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_kaladefault.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-Img_sort_Click"))));
 BA.debugLineNum = 1941;BA.debugLine="Return Null";
Debug.ShouldStop(1048576);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), act_kaladefault.mostCurrent.__c.getField(false,"Null"));
 };
 BA.debugLineNum = 1943;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadgoroohkalaback(RemoteObject _code) throws Exception{
try {
		Debug.PushSubsStack("LoadGoroohKalaBack (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,641);
if (RapidSub.canDelegate("loadgoroohkalaback")) { return ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","loadgoroohkalaback", _code);}
RemoteObject _c_gorooh = RemoteObject.createImmutable("");
RemoteObject _count = RemoteObject.createImmutable(0);
RemoteObject _dt = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _item1 = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adaptergoroohkala");
int _i = 0;
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adaptergoroohkala");
Debug.locals.put("Code", _code);
 BA.debugLineNum = 641;BA.debugLine="Sub LoadGoroohKalaBack(Code As String)";
Debug.ShouldStop(1);
 BA.debugLineNum = 642;BA.debugLine="Dim C_Gorooh As String = MCode.Sf.Left(Code,Code.";
Debug.ShouldStop(2);
_c_gorooh = act_kaladefault.mostCurrent._mcode._sf /*RemoteObject*/ .runMethod(true,"_vv0",(Object)(_code),(Object)(BA.numberCast(long.class, RemoteObject.solve(new RemoteObject[] {_code.runMethod(true,"length"),RemoteObject.createImmutable(6)}, "-",1, 1))));Debug.locals.put("C_Gorooh", _c_gorooh);Debug.locals.put("C_Gorooh", _c_gorooh);
 BA.debugLineNum = 643;BA.debugLine="Dim Count As Int = C_Gorooh.Length + 3";
Debug.ShouldStop(4);
_count = RemoteObject.solve(new RemoteObject[] {_c_gorooh.runMethod(true,"length"),RemoteObject.createImmutable(3)}, "+",1, 1);Debug.locals.put("Count", _count);Debug.locals.put("Count", _count);
 BA.debugLineNum = 644;BA.debugLine="Dim Dt As Cursor=MCode.Result(\"Select FldC_Gorooh";
Debug.ShouldStop(8);
_dt = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_dt = act_kaladefault.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select FldC_Gorooh,FldN_Gorooh From TblGoroohKala where FldC_Gorooh Like '"),_c_gorooh,RemoteObject.createImmutable("%' And Length(FldC_Gorooh) = "),_count,RemoteObject.createImmutable(" ORDER BY FldC_Gorooh"))));Debug.locals.put("Dt", _dt);Debug.locals.put("Dt", _dt);
 BA.debugLineNum = 645;BA.debugLine="If Dt.RowCount>0 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean(">",_dt.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 646;BA.debugLine="OriginalListGoroohKala2.Clear";
Debug.ShouldStop(32);
act_kaladefault.mostCurrent._originallistgoroohkala2.runVoidMethod ("Clear");
 BA.debugLineNum = 647;BA.debugLine="Dim Item1 As AdapterGoroohKala";
Debug.ShouldStop(64);
_item1 = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adaptergoroohkala");Debug.locals.put("Item1", _item1);
 BA.debugLineNum = 648;BA.debugLine="Item1.FldC_Gorooh= 0";
Debug.ShouldStop(128);
_item1.setField ("FldC_Gorooh" /*RemoteObject*/ ,BA.NumberToString(0));
 BA.debugLineNum = 649;BA.debugLine="Item1.FldN_Gorooh= \"همه گروه ها\"";
Debug.ShouldStop(256);
_item1.setField ("FldN_Gorooh" /*RemoteObject*/ ,BA.ObjectToString("همه گروه ها"));
 BA.debugLineNum = 650;BA.debugLine="OriginalListGoroohKala2.Add(Item1)";
Debug.ShouldStop(512);
act_kaladefault.mostCurrent._originallistgoroohkala2.runVoidMethod ("Add",(Object)((_item1)));
 BA.debugLineNum = 651;BA.debugLine="For i=0 To Dt.RowCount-1";
Debug.ShouldStop(1024);
{
final int step10 = 1;
final int limit10 = RemoteObject.solve(new RemoteObject[] {_dt.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step10 > 0 && _i <= limit10) || (step10 < 0 && _i >= limit10) ;_i = ((int)(0 + _i + step10))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 652;BA.debugLine="Dt.Position=i";
Debug.ShouldStop(2048);
_dt.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 653;BA.debugLine="Dim Item As AdapterGoroohKala";
Debug.ShouldStop(4096);
_item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adaptergoroohkala");Debug.locals.put("Item", _item);
 BA.debugLineNum = 654;BA.debugLine="Item.FldC_Gorooh= Dt.GetString(\"FldC_Gorooh\")";
Debug.ShouldStop(8192);
_item.setField ("FldC_Gorooh" /*RemoteObject*/ ,_dt.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Gorooh"))));
 BA.debugLineNum = 655;BA.debugLine="Item.FldN_Gorooh= Dt.GetString(\"FldN_Gorooh\")";
Debug.ShouldStop(16384);
_item.setField ("FldN_Gorooh" /*RemoteObject*/ ,_dt.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldN_Gorooh"))));
 BA.debugLineNum = 656;BA.debugLine="OriginalListGoroohKala2.Add(Item)";
Debug.ShouldStop(32768);
act_kaladefault.mostCurrent._originallistgoroohkala2.runVoidMethod ("Add",(Object)((_item)));
 BA.debugLineNum = 657;BA.debugLine="MCode.C_LayeKala=Item.FldC_Gorooh";
Debug.ShouldStop(65536);
act_kaladefault.mostCurrent._mcode._c_layekala /*RemoteObject*/  = _item.getField(true,"FldC_Gorooh" /*RemoteObject*/ );
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 659;BA.debugLine="ListGoroohKala2 = OriginalListGoroohKala2";
Debug.ShouldStop(262144);
act_kaladefault.mostCurrent._listgoroohkala2 = act_kaladefault.mostCurrent._originallistgoroohkala2;
 BA.debugLineNum = 660;BA.debugLine="HLVGoroohKala.notifyDataSetChanged";
Debug.ShouldStop(524288);
act_kaladefault.mostCurrent._hlvgoroohkala.runVoidMethodAndSync ("notifyDataSetChanged");
 };
 BA.debugLineNum = 662;BA.debugLine="LoadKala";
Debug.ShouldStop(2097152);
_loadkala();
 BA.debugLineNum = 663;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _loadgoroohkalago(RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("LoadGoroohKalaGo (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,698);
if (RapidSub.canDelegate("loadgoroohkalago")) { ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","loadgoroohkalago", _position); return;}
ResumableSub_LoadGoroohKalaGo rsub = new ResumableSub_LoadGoroohKalaGo(null,_position);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_LoadGoroohKalaGo extends BA.ResumableSub {
public ResumableSub_LoadGoroohKalaGo(ir.parsikhesab.pakhsh.act_kaladefault parent,RemoteObject _position) {
this.parent = parent;
this._position = _position;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_kaladefault parent;
RemoteObject _position;
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adaptergoroohkala");
RemoteObject _count = RemoteObject.createImmutable(0);
RemoteObject _dt = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
int step10;
int limit10;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("LoadGoroohKalaGo (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,698);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("Position", _position);
 BA.debugLineNum = 699;BA.debugLine="Sleep(100)";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("Sleep",act_kaladefault.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_kaladefault", "loadgoroohkalago"),BA.numberCast(int.class, 100));
this.state = 9;
return;
case 9:
//C
this.state = 1;
;
 BA.debugLineNum = 700;BA.debugLine="Dim Item = ListGoroohKala2.Get(Position) As Adapt";
Debug.ShouldStop(134217728);
_item = (parent.mostCurrent._listgoroohkala2.runMethod(false,"Get",(Object)(_position)));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 701;BA.debugLine="GroupCodeSelect1=Item.FldC_Gorooh";
Debug.ShouldStop(268435456);
parent.mostCurrent._groupcodeselect1 = _item.getField(true,"FldC_Gorooh" /*RemoteObject*/ );
 BA.debugLineNum = 703;BA.debugLine="Dim Count As Int = Item.FldC_Gorooh.Length + 3";
Debug.ShouldStop(1073741824);
_count = RemoteObject.solve(new RemoteObject[] {_item.getField(true,"FldC_Gorooh" /*RemoteObject*/ ).runMethod(true,"length"),RemoteObject.createImmutable(3)}, "+",1, 1);Debug.locals.put("Count", _count);Debug.locals.put("Count", _count);
 BA.debugLineNum = 704;BA.debugLine="Dim Dt As Cursor=MCode.Result(\"Select FldC_Gorooh";
Debug.ShouldStop(-2147483648);
_dt = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_dt = parent.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select FldC_Gorooh,FldN_Gorooh From TblGoroohKala where FldC_Gorooh Like '"),_item.getField(true,"FldC_Gorooh" /*RemoteObject*/ ),RemoteObject.createImmutable("%' And Length(FldC_Gorooh) = "),_count,RemoteObject.createImmutable(" ORDER BY FldC_Gorooh"))));Debug.locals.put("Dt", _dt);Debug.locals.put("Dt", _dt);
 BA.debugLineNum = 705;BA.debugLine="If Dt.RowCount>0 Then";
Debug.ShouldStop(1);
if (true) break;

case 1:
//if
this.state = 8;
if (RemoteObject.solveBoolean(">",_dt.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 706;BA.debugLine="lblBackGroup.Visible=True";
Debug.ShouldStop(2);
parent.mostCurrent._lblbackgroup.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 707;BA.debugLine="ListGoroohKala2.Clear";
Debug.ShouldStop(4);
parent.mostCurrent._listgoroohkala2.runVoidMethod ("Clear");
 BA.debugLineNum = 708;BA.debugLine="OriginalListGoroohKala2.Clear";
Debug.ShouldStop(8);
parent.mostCurrent._originallistgoroohkala2.runVoidMethod ("Clear");
 BA.debugLineNum = 710;BA.debugLine="For i=0 To Dt.RowCount-1";
Debug.ShouldStop(32);
if (true) break;

case 4:
//for
this.state = 7;
step10 = 1;
limit10 = RemoteObject.solve(new RemoteObject[] {_dt.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 10;
if (true) break;

case 10:
//C
this.state = 7;
if ((step10 > 0 && _i <= limit10) || (step10 < 0 && _i >= limit10)) this.state = 6;
if (true) break;

case 11:
//C
this.state = 10;
_i = ((int)(0 + _i + step10)) ;
Debug.locals.put("i", _i);
if (true) break;

case 6:
//C
this.state = 11;
 BA.debugLineNum = 711;BA.debugLine="Dt.Position=i";
Debug.ShouldStop(64);
_dt.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 712;BA.debugLine="Dim Item As AdapterGoroohKala";
Debug.ShouldStop(128);
_item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adaptergoroohkala");Debug.locals.put("Item", _item);
 BA.debugLineNum = 713;BA.debugLine="Item.FldC_Gorooh= Dt.GetString(\"FldC_Gorooh\")";
Debug.ShouldStop(256);
_item.setField ("FldC_Gorooh" /*RemoteObject*/ ,_dt.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Gorooh"))));
 BA.debugLineNum = 714;BA.debugLine="Item.FldN_Gorooh= Dt.GetString(\"FldN_Gorooh\")";
Debug.ShouldStop(512);
_item.setField ("FldN_Gorooh" /*RemoteObject*/ ,_dt.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldN_Gorooh"))));
 BA.debugLineNum = 715;BA.debugLine="OriginalListGoroohKala2.Add(Item)";
Debug.ShouldStop(1024);
parent.mostCurrent._originallistgoroohkala2.runVoidMethod ("Add",(Object)((_item)));
 BA.debugLineNum = 716;BA.debugLine="MCode.C_LayeKala=Item.FldC_Gorooh";
Debug.ShouldStop(2048);
parent.mostCurrent._mcode._c_layekala /*RemoteObject*/  = _item.getField(true,"FldC_Gorooh" /*RemoteObject*/ );
 if (true) break;
if (true) break;

case 7:
//C
this.state = 8;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 718;BA.debugLine="ListGoroohKala2 = OriginalListGoroohKala2";
Debug.ShouldStop(8192);
parent.mostCurrent._listgoroohkala2 = parent.mostCurrent._originallistgoroohkala2;
 BA.debugLineNum = 719;BA.debugLine="HLVGoroohKala.notifyDataSetChanged";
Debug.ShouldStop(16384);
parent.mostCurrent._hlvgoroohkala.runVoidMethodAndSync ("notifyDataSetChanged");
 if (true) break;

case 8:
//C
this.state = -1;
;
 BA.debugLineNum = 721;BA.debugLine="LoadKala";
Debug.ShouldStop(65536);
_loadkala();
 BA.debugLineNum = 722;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _loadkala() throws Exception{
try {
		Debug.PushSubsStack("LoadKala (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,294);
if (RapidSub.canDelegate("loadkala")) { return ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","loadkala");}
RemoteObject _str = RemoteObject.createImmutable("");
RemoteObject _countfilter = RemoteObject.createImmutable(0);
RemoteObject _filter = RemoteObject.createImmutable(false);
 BA.debugLineNum = 294;BA.debugLine="Sub LoadKala";
Debug.ShouldStop(32);
 BA.debugLineNum = 295;BA.debugLine="Try";
Debug.ShouldStop(64);
try { BA.debugLineNum = 297;BA.debugLine="Dim str As String=\"\"";
Debug.ShouldStop(256);
_str = BA.ObjectToString("");Debug.locals.put("str", _str);Debug.locals.put("str", _str);
 BA.debugLineNum = 298;BA.debugLine="Dim countfilter As Int=0";
Debug.ShouldStop(512);
_countfilter = BA.numberCast(int.class, 0);Debug.locals.put("countfilter", _countfilter);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 299;BA.debugLine="Dim filter As Boolean=False";
Debug.ShouldStop(1024);
_filter = act_kaladefault.mostCurrent.__c.getField(true,"False");Debug.locals.put("filter", _filter);Debug.locals.put("filter", _filter);
 BA.debugLineNum = 301;BA.debugLine="ListTasvie.Clear";
Debug.ShouldStop(4096);
act_kaladefault.mostCurrent._listtasvie.runVoidMethod ("Clear");
 BA.debugLineNum = 302;BA.debugLine="ListTasvie=LoadAcSpNoeTasvie";
Debug.ShouldStop(8192);
act_kaladefault.mostCurrent._listtasvie = _loadacspnoetasvie();
 BA.debugLineNum = 303;BA.debugLine="LoadNoeTasvie";
Debug.ShouldStop(16384);
_loadnoetasvie();
 BA.debugLineNum = 305;BA.debugLine="Log(GroupCodeSelect1)";
Debug.ShouldStop(65536);
act_kaladefault.mostCurrent.__c.runVoidMethod ("LogImpl","534668555",act_kaladefault.mostCurrent._groupcodeselect1,0);
 BA.debugLineNum = 306;BA.debugLine="Log(GroupCodeSelect2)";
Debug.ShouldStop(131072);
act_kaladefault.mostCurrent.__c.runVoidMethod ("LogImpl","534668556",act_kaladefault.mostCurrent._groupcodeselect2,0);
 BA.debugLineNum = 307;BA.debugLine="If GroupCodeSelect1=0 And GroupCodeSelect2=0 Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",act_kaladefault.mostCurrent._groupcodeselect1,BA.NumberToString(0)) && RemoteObject.solveBoolean("=",act_kaladefault.mostCurrent._groupcodeselect2,BA.NumberToString(0))) { 
 BA.debugLineNum = 308;BA.debugLine="If SwGift.Checked=True Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",act_kaladefault.mostCurrent._swgift.runMethod(true,"getChecked"),act_kaladefault.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 309;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(1048576);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 312;BA.debugLine="If MCode.EshantionGroup=1 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",act_kaladefault.mostCurrent._mcode._eshantiongroup /*RemoteObject*/ ,BA.NumberToString(1))) { 
 BA.debugLineNum = 313;BA.debugLine="str= str & \" and TblKala.fldCodeGroup IN(SELE";
Debug.ShouldStop(16777216);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and TblKala.fldCodeGroup IN(SELECT tblEshantionGroup.fldCodeGroupKala FROM tblEshantionGroup)"));Debug.locals.put("str", _str);
 }else {
 BA.debugLineNum = 315;BA.debugLine="str= str & \" and TblKala.fldCodeKala IN(SELEC";
Debug.ShouldStop(67108864);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and TblKala.fldCodeKala IN(SELECT tblEshantionTabaghati.fldCodeKalaForoosh FROM tblEshantionTabaghati)"));Debug.locals.put("str", _str);
 };
 BA.debugLineNum = 318;BA.debugLine="filter=True";
Debug.ShouldStop(536870912);
_filter = act_kaladefault.mostCurrent.__c.getField(true,"True");Debug.locals.put("filter", _filter);
 BA.debugLineNum = 319;BA.debugLine="If countfilter=1 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_countfilter,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 320;BA.debugLine="str=str.Replace(\" and \",\"\")";
Debug.ShouldStop(-2147483648);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString(" and ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 };
 };
 BA.debugLineNum = 323;BA.debugLine="If SwTakhfif.Checked=True Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",act_kaladefault.mostCurrent._swtakhfif.runMethod(true,"getChecked"),act_kaladefault.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 324;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(8);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 325;BA.debugLine="str= str & \" and fldFeeBadAzTakhfif <> '0.0000'";
Debug.ShouldStop(16);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and fldFeeBadAzTakhfif <> '0.0000'"));Debug.locals.put("str", _str);
 BA.debugLineNum = 326;BA.debugLine="filter=True";
Debug.ShouldStop(32);
_filter = act_kaladefault.mostCurrent.__c.getField(true,"True");Debug.locals.put("filter", _filter);
 BA.debugLineNum = 327;BA.debugLine="If countfilter=1 Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_countfilter,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 328;BA.debugLine="str=str.Replace(\" and \",\"\")";
Debug.ShouldStop(128);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString(" and ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 };
 };
 BA.debugLineNum = 331;BA.debugLine="If MCode.NamayeshKalaSefr=0 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",act_kaladefault.mostCurrent._mcode._namayeshkalasefr /*RemoteObject*/ ,BA.NumberToString(0))) { 
 BA.debugLineNum = 332;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(2048);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 333;BA.debugLine="str= str & \" and SumMande > '0'\"";
Debug.ShouldStop(4096);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and SumMande > '0'"));Debug.locals.put("str", _str);
 BA.debugLineNum = 334;BA.debugLine="filter=True";
Debug.ShouldStop(8192);
_filter = act_kaladefault.mostCurrent.__c.getField(true,"True");Debug.locals.put("filter", _filter);
 BA.debugLineNum = 335;BA.debugLine="If countfilter=1 Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_countfilter,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 336;BA.debugLine="str=str.Replace(\" and \",\"\")";
Debug.ShouldStop(32768);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString(" and ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 };
 };
 BA.debugLineNum = 340;BA.debugLine="If SwMojoodi.Checked=True Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",act_kaladefault.mostCurrent._swmojoodi.runMethod(true,"getChecked"),act_kaladefault.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 341;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(1048576);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 342;BA.debugLine="str= str & \" and SumMande > '0'\"";
Debug.ShouldStop(2097152);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and SumMande > '0'"));Debug.locals.put("str", _str);
 BA.debugLineNum = 343;BA.debugLine="filter=True";
Debug.ShouldStop(4194304);
_filter = act_kaladefault.mostCurrent.__c.getField(true,"True");Debug.locals.put("filter", _filter);
 BA.debugLineNum = 344;BA.debugLine="If countfilter=1 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_countfilter,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 345;BA.debugLine="str=str.Replace(\" and \",\"\")";
Debug.ShouldStop(16777216);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString(" and ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 };
 };
 BA.debugLineNum = 348;BA.debugLine="If SwPic.Checked=True Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",act_kaladefault.mostCurrent._swpic.runMethod(true,"getChecked"),act_kaladefault.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 349;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(268435456);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 350;BA.debugLine="str= str & \" and fldPathPic <> '0'\"";
Debug.ShouldStop(536870912);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and fldPathPic <> '0'"));Debug.locals.put("str", _str);
 BA.debugLineNum = 351;BA.debugLine="filter=True";
Debug.ShouldStop(1073741824);
_filter = act_kaladefault.mostCurrent.__c.getField(true,"True");Debug.locals.put("filter", _filter);
 BA.debugLineNum = 352;BA.debugLine="If countfilter=1 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_countfilter,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 353;BA.debugLine="str=str.Replace(\" and \",\"\")";
Debug.ShouldStop(1);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString(" and ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 };
 };
 BA.debugLineNum = 380;BA.debugLine="If filter=True And str<>\"\" Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_filter,act_kaladefault.mostCurrent.__c.getField(true,"True")) && RemoteObject.solveBoolean("!",_str,BA.ObjectToString(""))) { 
 BA.debugLineNum = 383;BA.debugLine="str=\"select * from TblKala where \"&str&\" \"&Str_";
Debug.ShouldStop(1073741824);
_str = RemoteObject.concat(RemoteObject.createImmutable("select * from TblKala where "),_str,RemoteObject.createImmutable(" "),act_kaladefault.mostCurrent._str_sort);Debug.locals.put("str", _str);
 }else {
 BA.debugLineNum = 385;BA.debugLine="str=\"select * from TblKala  \"&Str_sort";
Debug.ShouldStop(1);
_str = RemoteObject.concat(RemoteObject.createImmutable("select * from TblKala  "),act_kaladefault.mostCurrent._str_sort);Debug.locals.put("str", _str);
 };
 BA.debugLineNum = 387;BA.debugLine="Log(str)";
Debug.ShouldStop(4);
act_kaladefault.mostCurrent.__c.runVoidMethod ("LogImpl","534668637",_str,0);
 };
 BA.debugLineNum = 390;BA.debugLine="If GroupCodeSelect1<>0 And GroupCodeSelect2=0 The";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("!",act_kaladefault.mostCurrent._groupcodeselect1,BA.NumberToString(0)) && RemoteObject.solveBoolean("=",act_kaladefault.mostCurrent._groupcodeselect2,BA.NumberToString(0))) { 
 BA.debugLineNum = 391;BA.debugLine="If SwGift.Checked=True Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",act_kaladefault.mostCurrent._swgift.runMethod(true,"getChecked"),act_kaladefault.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 392;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(128);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 393;BA.debugLine="If MCode.EshantionGroup=1 Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",act_kaladefault.mostCurrent._mcode._eshantiongroup /*RemoteObject*/ ,BA.NumberToString(1))) { 
 BA.debugLineNum = 394;BA.debugLine="str= str & \" and TblKala.fldCodeGroup IN(SELE";
Debug.ShouldStop(512);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and TblKala.fldCodeGroup IN(SELECT tblEshantionGroup.fldCodeGroupKala FROM tblEshantionGroup)"));Debug.locals.put("str", _str);
 }else {
 BA.debugLineNum = 396;BA.debugLine="str= str & \" and TblKala.fldCodeKala IN(SELEC";
Debug.ShouldStop(2048);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and TblKala.fldCodeKala IN(SELECT tblEshantionTabaghati.fldCodeKalaForoosh FROM tblEshantionTabaghati)"));Debug.locals.put("str", _str);
 };
 };
 BA.debugLineNum = 399;BA.debugLine="If SwTakhfif.Checked=True Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",act_kaladefault.mostCurrent._swtakhfif.runMethod(true,"getChecked"),act_kaladefault.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 400;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(32768);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 401;BA.debugLine="str= str & \" and fldFeeBadAzTakhfif <> '0.0000'";
Debug.ShouldStop(65536);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and fldFeeBadAzTakhfif <> '0.0000'"));Debug.locals.put("str", _str);
 };
 BA.debugLineNum = 403;BA.debugLine="If SwMojoodi.Checked=True Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",act_kaladefault.mostCurrent._swmojoodi.runMethod(true,"getChecked"),act_kaladefault.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 404;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(524288);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 405;BA.debugLine="str= str & \" and SumMande > '0'\"";
Debug.ShouldStop(1048576);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and SumMande > '0'"));Debug.locals.put("str", _str);
 };
 BA.debugLineNum = 407;BA.debugLine="If MCode.NamayeshKalaSefr=0 Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",act_kaladefault.mostCurrent._mcode._namayeshkalasefr /*RemoteObject*/ ,BA.NumberToString(0))) { 
 BA.debugLineNum = 408;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(8388608);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 409;BA.debugLine="str= str & \" and SumMande > '0'\"";
Debug.ShouldStop(16777216);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and SumMande > '0'"));Debug.locals.put("str", _str);
 BA.debugLineNum = 410;BA.debugLine="filter=True";
Debug.ShouldStop(33554432);
_filter = act_kaladefault.mostCurrent.__c.getField(true,"True");Debug.locals.put("filter", _filter);
 BA.debugLineNum = 411;BA.debugLine="If countfilter=1 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_countfilter,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 412;BA.debugLine="str=str.Replace(\" and \",\"\")";
Debug.ShouldStop(134217728);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString(" and ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 };
 };
 BA.debugLineNum = 415;BA.debugLine="If SwPic.Checked=True Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",act_kaladefault.mostCurrent._swpic.runMethod(true,"getChecked"),act_kaladefault.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 416;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(-2147483648);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 417;BA.debugLine="str= str & \" and fldPathPic <> '0'\"";
Debug.ShouldStop(1);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and fldPathPic <> '0'"));Debug.locals.put("str", _str);
 };
 BA.debugLineNum = 441;BA.debugLine="If	filter=True And str<>\"\" Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_filter,act_kaladefault.mostCurrent.__c.getField(true,"True")) && RemoteObject.solveBoolean("!",_str,BA.ObjectToString(""))) { 
 BA.debugLineNum = 442;BA.debugLine="str=\"select * from TblKala where fldCodeGroup";
Debug.ShouldStop(33554432);
_str = RemoteObject.concat(RemoteObject.createImmutable("select * from TblKala where fldCodeGroup like '"),act_kaladefault.mostCurrent._groupcodeselect1,RemoteObject.createImmutable("%' and "),_str,RemoteObject.createImmutable(" "),act_kaladefault.mostCurrent._str_sort);Debug.locals.put("str", _str);
 }else {
 BA.debugLineNum = 444;BA.debugLine="str=\"select * from TblKala where fldCodeGroup";
Debug.ShouldStop(134217728);
_str = RemoteObject.concat(RemoteObject.createImmutable("select * from TblKala where fldCodeGroup like '"),act_kaladefault.mostCurrent._groupcodeselect1,RemoteObject.createImmutable("%' "),act_kaladefault.mostCurrent._str_sort);Debug.locals.put("str", _str);
 };
 BA.debugLineNum = 448;BA.debugLine="Log(str)";
Debug.ShouldStop(-2147483648);
act_kaladefault.mostCurrent.__c.runVoidMethod ("LogImpl","534668698",_str,0);
 };
 BA.debugLineNum = 451;BA.debugLine="If GroupCodeSelect1<>0 And GroupCodeSelect2<>0 Th";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("!",act_kaladefault.mostCurrent._groupcodeselect1,BA.NumberToString(0)) && RemoteObject.solveBoolean("!",act_kaladefault.mostCurrent._groupcodeselect2,BA.NumberToString(0))) { 
 BA.debugLineNum = 452;BA.debugLine="If SwGift.Checked=True Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",act_kaladefault.mostCurrent._swgift.runMethod(true,"getChecked"),act_kaladefault.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 453;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(16);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 454;BA.debugLine="If MCode.EshantionGroup=1 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",act_kaladefault.mostCurrent._mcode._eshantiongroup /*RemoteObject*/ ,BA.NumberToString(1))) { 
 BA.debugLineNum = 455;BA.debugLine="str= str & \" and TblKala.fldCodeGroup IN(SELE";
Debug.ShouldStop(64);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and TblKala.fldCodeGroup IN(SELECT tblEshantionGroup.fldCodeGroupKala FROM tblEshantionGroup)"));Debug.locals.put("str", _str);
 }else {
 BA.debugLineNum = 457;BA.debugLine="str= str & \" and TblKala.fldCodeKala IN(SELEC";
Debug.ShouldStop(256);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and TblKala.fldCodeKala IN(SELECT tblEshantionTabaghati.fldCodeKalaForoosh FROM tblEshantionTabaghati)"));Debug.locals.put("str", _str);
 };
 };
 BA.debugLineNum = 461;BA.debugLine="If SwTakhfif.Checked=True Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",act_kaladefault.mostCurrent._swtakhfif.runMethod(true,"getChecked"),act_kaladefault.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 462;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(8192);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 463;BA.debugLine="str= str & \" and fldFeeBadAzTakhfif <> '0.0000'";
Debug.ShouldStop(16384);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and fldFeeBadAzTakhfif <> '0.0000'"));Debug.locals.put("str", _str);
 };
 BA.debugLineNum = 466;BA.debugLine="If SwMojoodi.Checked=True Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",act_kaladefault.mostCurrent._swmojoodi.runMethod(true,"getChecked"),act_kaladefault.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 467;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(262144);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 468;BA.debugLine="str= str & \" and SumMande > '0'\"";
Debug.ShouldStop(524288);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and SumMande > '0'"));Debug.locals.put("str", _str);
 };
 BA.debugLineNum = 471;BA.debugLine="If MCode.NamayeshKalaSefr=0 Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",act_kaladefault.mostCurrent._mcode._namayeshkalasefr /*RemoteObject*/ ,BA.NumberToString(0))) { 
 BA.debugLineNum = 472;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(8388608);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 473;BA.debugLine="str= str & \" and SumMande > '0'\"";
Debug.ShouldStop(16777216);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and SumMande > '0'"));Debug.locals.put("str", _str);
 BA.debugLineNum = 474;BA.debugLine="filter=True";
Debug.ShouldStop(33554432);
_filter = act_kaladefault.mostCurrent.__c.getField(true,"True");Debug.locals.put("filter", _filter);
 BA.debugLineNum = 475;BA.debugLine="If countfilter=1 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_countfilter,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 476;BA.debugLine="str=str.Replace(\" and \",\"\")";
Debug.ShouldStop(134217728);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString(" and ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 };
 };
 BA.debugLineNum = 479;BA.debugLine="If SwPic.Checked=True Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",act_kaladefault.mostCurrent._swpic.runMethod(true,"getChecked"),act_kaladefault.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 480;BA.debugLine="countfilter=countfilter+1";
Debug.ShouldStop(-2147483648);
_countfilter = RemoteObject.solve(new RemoteObject[] {_countfilter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("countfilter", _countfilter);
 BA.debugLineNum = 481;BA.debugLine="str= str & \" and fldPathPic <> '0'\"";
Debug.ShouldStop(1);
_str = RemoteObject.concat(_str,RemoteObject.createImmutable(" and fldPathPic <> '0'"));Debug.locals.put("str", _str);
 };
 BA.debugLineNum = 507;BA.debugLine="If	filter=True And str<>\"\" Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_filter,act_kaladefault.mostCurrent.__c.getField(true,"True")) && RemoteObject.solveBoolean("!",_str,BA.ObjectToString(""))) { 
 BA.debugLineNum = 508;BA.debugLine="str=\"select * from TblKala where fldCodeGroup";
Debug.ShouldStop(134217728);
_str = RemoteObject.concat(RemoteObject.createImmutable("select * from TblKala where fldCodeGroup like '"),act_kaladefault.mostCurrent._groupcodeselect2,RemoteObject.createImmutable("%' and "),_str,RemoteObject.createImmutable(" "),act_kaladefault.mostCurrent._str_sort);Debug.locals.put("str", _str);
 }else {
 BA.debugLineNum = 510;BA.debugLine="str=\"select * from TblKala where fldCodeGroup";
Debug.ShouldStop(536870912);
_str = RemoteObject.concat(RemoteObject.createImmutable("select * from TblKala where fldCodeGroup like '"),act_kaladefault.mostCurrent._groupcodeselect2,RemoteObject.createImmutable("%' "),act_kaladefault.mostCurrent._str_sort);Debug.locals.put("str", _str);
 };
 BA.debugLineNum = 512;BA.debugLine="Log(str)";
Debug.ShouldStop(-2147483648);
act_kaladefault.mostCurrent.__c.runVoidMethod ("LogImpl","534668762",_str,0);
 };
 BA.debugLineNum = 514;BA.debugLine="FirebaseMessaging.mode=\"stop\"";
Debug.ShouldStop(2);
act_kaladefault.mostCurrent._firebasemessaging._mode /*RemoteObject*/  = BA.ObjectToString("stop");
 BA.debugLineNum = 516;BA.debugLine="th.RunOnGuiThread(\"LoadListKala\",Array As Object";
Debug.ShouldStop(8);
act_kaladefault._th.runVoidMethod ("RunOnGuiThread",(Object)(BA.ObjectToString("LoadListKala")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_str)})));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e137) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_kaladefault.processBA, e137.toString()); BA.debugLineNum = 522;BA.debugLine="Log(LastException)";
Debug.ShouldStop(512);
act_kaladefault.mostCurrent.__c.runVoidMethod ("LogImpl","534668772",BA.ObjectToString(act_kaladefault.mostCurrent.__c.runMethod(false,"LastException",act_kaladefault.mostCurrent.activityBA)),0);
 BA.debugLineNum = 523;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(1024);
act_kaladefault.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_kaladefault.mostCurrent.__c.runMethod(false,"LastException",act_kaladefault.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_kaladefault.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-LoadKala"))));
 };
 BA.debugLineNum = 525;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadlistgoroohkala() throws Exception{
try {
		Debug.PushSubsStack("LoadListGoroohKala (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,574);
if (RapidSub.canDelegate("loadlistgoroohkala")) { return ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","loadlistgoroohkala");}
RemoteObject _item1 = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adaptergoroohkala");
RemoteObject _dt = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adaptergoroohkala");
 BA.debugLineNum = 574;BA.debugLine="Sub LoadListGoroohKala";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 576;BA.debugLine="Dim Item1 As AdapterGoroohKala";
Debug.ShouldStop(-2147483648);
_item1 = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adaptergoroohkala");Debug.locals.put("Item1", _item1);
 BA.debugLineNum = 577;BA.debugLine="Item1.FldC_Gorooh= 0";
Debug.ShouldStop(1);
_item1.setField ("FldC_Gorooh" /*RemoteObject*/ ,BA.NumberToString(0));
 BA.debugLineNum = 578;BA.debugLine="Item1.FldN_Gorooh= \"همه گروه ها\"";
Debug.ShouldStop(2);
_item1.setField ("FldN_Gorooh" /*RemoteObject*/ ,BA.ObjectToString("همه گروه ها"));
 BA.debugLineNum = 579;BA.debugLine="OriginalListGoroohKala2.Add(Item1)";
Debug.ShouldStop(4);
act_kaladefault.mostCurrent._originallistgoroohkala2.runVoidMethod ("Add",(Object)((_item1)));
 BA.debugLineNum = 580;BA.debugLine="Dim Dt As Cursor = MCode.Result(\"Select FldC_Goro";
Debug.ShouldStop(8);
_dt = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_dt = act_kaladefault.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Select FldC_Gorooh,FldN_Gorooh From TblGoroohKala where Length(FldC_Gorooh) = 3 ORDER BY FldC_Gorooh")));Debug.locals.put("Dt", _dt);Debug.locals.put("Dt", _dt);
 BA.debugLineNum = 581;BA.debugLine="For i=0 To Dt.RowCount-1";
Debug.ShouldStop(16);
{
final int step6 = 1;
final int limit6 = RemoteObject.solve(new RemoteObject[] {_dt.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6) ;_i = ((int)(0 + _i + step6))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 582;BA.debugLine="Dt.Position=i";
Debug.ShouldStop(32);
_dt.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 583;BA.debugLine="Dim Item As AdapterGoroohKala";
Debug.ShouldStop(64);
_item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adaptergoroohkala");Debug.locals.put("Item", _item);
 BA.debugLineNum = 584;BA.debugLine="Item.FldC_Gorooh= Dt.GetString(\"FldC_Gorooh\")";
Debug.ShouldStop(128);
_item.setField ("FldC_Gorooh" /*RemoteObject*/ ,_dt.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Gorooh"))));
 BA.debugLineNum = 585;BA.debugLine="Item.FldN_Gorooh= Dt.GetString(\"FldN_Gorooh\")";
Debug.ShouldStop(256);
_item.setField ("FldN_Gorooh" /*RemoteObject*/ ,_dt.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldN_Gorooh"))));
 BA.debugLineNum = 586;BA.debugLine="OriginalListGoroohKala2.Add(Item)";
Debug.ShouldStop(512);
act_kaladefault.mostCurrent._originallistgoroohkala2.runVoidMethod ("Add",(Object)((_item)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 590;BA.debugLine="ListGoroohKala2 = OriginalListGoroohKala2";
Debug.ShouldStop(8192);
act_kaladefault.mostCurrent._listgoroohkala2 = act_kaladefault.mostCurrent._originallistgoroohkala2;
 BA.debugLineNum = 592;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _loadlistkala(RemoteObject _query) throws Exception{
try {
		Debug.PushSubsStack("LoadListKala (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,725);
if (RapidSub.canDelegate("loadlistkala")) { ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","loadlistkala", _query); return;}
ResumableSub_LoadListKala rsub = new ResumableSub_LoadListKala(null,_query);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_LoadListKala extends BA.ResumableSub {
public ResumableSub_LoadListKala(ir.parsikhesab.pakhsh.act_kaladefault parent,RemoteObject _query) {
this.parent = parent;
this._query = _query;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_kaladefault parent;
RemoteObject _query;
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
RemoteObject _itemkala = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlistkala");
RemoteObject _fee = RemoteObject.createImmutable("");
RemoteObject _countsabad = RemoteObject.createImmutable("");
RemoteObject _cu1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _fldfeeforoosh = RemoteObject.createImmutable(0);
RemoteObject _fldtedaddarkarton = RemoteObject.createImmutable(0);
RemoteObject _summande = RemoteObject.createImmutable(0);
RemoteObject _sumkol = RemoteObject.createImmutable(0L);
int step6;
int limit6;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("LoadListKala (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,725);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("Query", _query);
 BA.debugLineNum = 726;BA.debugLine="Try";
Debug.ShouldStop(2097152);
if (true) break;

case 1:
//try
this.state = 114;
this.catchState = 113;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 113;
 BA.debugLineNum = 732;BA.debugLine="OrginalListKala.Clear";
Debug.ShouldStop(134217728);
parent.mostCurrent._orginallistkala.runVoidMethod ("Clear");
 BA.debugLineNum = 733;BA.debugLine="Dim Cu As Cursor = MCode.Result(Query)";
Debug.ShouldStop(268435456);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = parent.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(_query));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 734;BA.debugLine="If Cu.RowCount > 0 Then";
Debug.ShouldStop(536870912);
if (true) break;

case 4:
//if
this.state = 111;
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 735;BA.debugLine="StopService(FusedLocationService)";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("StopService",act_kaladefault.processBA,(Object)((parent.mostCurrent._fusedlocationservice.getObject())));
 BA.debugLineNum = 738;BA.debugLine="For i = 0 To Cu.RowCount - 1";
Debug.ShouldStop(2);
if (true) break;

case 7:
//for
this.state = 110;
step6 = 1;
limit6 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 115;
if (true) break;

case 115:
//C
this.state = 110;
if ((step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6)) this.state = 9;
if (true) break;

case 116:
//C
this.state = 115;
_i = ((int)(0 + _i + step6)) ;
Debug.locals.put("i", _i);
if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 739;BA.debugLine="Dim ItemKala As AdapterListKala";
Debug.ShouldStop(4);
_itemkala = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapterlistkala");Debug.locals.put("ItemKala", _itemkala);
 BA.debugLineNum = 740;BA.debugLine="Cu.Position=i";
Debug.ShouldStop(8);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 741;BA.debugLine="ItemKala.CodeGroup=Cu.Getstring(\"fldCodeGroup\"";
Debug.ShouldStop(16);
_itemkala.setField ("CodeGroup" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldCodeGroup"))));
 BA.debugLineNum = 742;BA.debugLine="ItemKala.CodeKala=Cu.Getstring(\"fldCodeKala\")";
Debug.ShouldStop(32);
_itemkala.setField ("CodeKala" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldCodeKala"))));
 BA.debugLineNum = 743;BA.debugLine="ItemKala.NameKala=Cu.Getstring(\"fldNameKala\")";
Debug.ShouldStop(64);
_itemkala.setField ("NameKala" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldNameKala"))));
 BA.debugLineNum = 744;BA.debugLine="ItemKala.NameVahed=Cu.Getstring(\"fldNameVahed\"";
Debug.ShouldStop(128);
_itemkala.setField ("NameVahed" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldNameVahed"))));
 BA.debugLineNum = 745;BA.debugLine="ItemKala.NameVahed2=Cu.Getstring(\"fldNameVahed";
Debug.ShouldStop(256);
_itemkala.setField ("NameVahed2" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldNameVahed2"))));
 BA.debugLineNum = 746;BA.debugLine="ItemKala.fldSharh=Cu.Getstring(\"fldSharh\")";
Debug.ShouldStop(512);
_itemkala.setField ("fldSharh" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldSharh"))));
 BA.debugLineNum = 747;BA.debugLine="ItemKala.SumMande=Cu.Getstring(\"SumMande\")";
Debug.ShouldStop(1024);
_itemkala.setField ("SumMande" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("SumMande"))));
 BA.debugLineNum = 748;BA.debugLine="ItemKala.fldDarsadArzeshAfzodeKala=myCode.Is_N";
Debug.ShouldStop(2048);
_itemkala.setField ("fldDarsadArzeshAfzodeKala" /*RemoteObject*/ ,parent.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldArzeshAfzode"))))));
 BA.debugLineNum = 749;BA.debugLine="ItemKala.TedadDarKarton =Cu.Getstring(\"fldTeda";
Debug.ShouldStop(4096);
_itemkala.setField ("TedadDarKarton" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldTedadDarKarton"))));
 BA.debugLineNum = 752;BA.debugLine="Dim fee As String";
Debug.ShouldStop(32768);
_fee = RemoteObject.createImmutable("");Debug.locals.put("fee", _fee);
 BA.debugLineNum = 753;BA.debugLine="If MCode.feeTip=0 Then";
Debug.ShouldStop(65536);
if (true) break;

case 10:
//if
this.state = 29;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._mcode._feetip /*RemoteObject*/ ,BA.NumberToString(0))) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 29;
 BA.debugLineNum = 754;BA.debugLine="fee=Cu.GetInt(\"fldFeeForoosh\")";
Debug.ShouldStop(131072);
_fee = BA.NumberToString(_cu.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("fldFeeForoosh"))));Debug.locals.put("fee", _fee);
 if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 760;BA.debugLine="fee=myCode.Is_Null_adad(Cu.GetString(\"fldFeeT";
Debug.ShouldStop(8388608);
_fee = parent.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldFeeTasvie")))));Debug.locals.put("fee", _fee);
 BA.debugLineNum = 762;BA.debugLine="If 	IsNumber(fee) And fee>0 Then";
Debug.ShouldStop(33554432);
if (true) break;

case 15:
//if
this.state = 28;
if (RemoteObject.solveBoolean(".",parent.mostCurrent.__c.runMethod(true,"IsNumber",(Object)(_fee))) && RemoteObject.solveBoolean(">",BA.numberCast(double.class, _fee),BA.numberCast(double.class, 0))) { 
this.state = 17;
}else {
this.state = 27;
}if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 763;BA.debugLine="Log(Cu.GetString(\"fldFeeTasvie\"))";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","535389478",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldFeeTasvie"))),0);
 BA.debugLineNum = 765;BA.debugLine="If  fee>Cu.GetString(\"fldFeeBadAzTakhfif\") T";
Debug.ShouldStop(268435456);
if (true) break;

case 18:
//if
this.state = 25;
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _fee),BA.numberCast(double.class, _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldFeeBadAzTakhfif")))))) { 
this.state = 20;
}else 
{ BA.debugLineNum = 768;BA.debugLine="Else if fee<Cu.GetString(\"fldFeeBadAzTakhfif";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("<",BA.numberCast(double.class, _fee),BA.numberCast(double.class, _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldFeeBadAzTakhfif")))))) { 
this.state = 22;
}else {
this.state = 24;
}}
if (true) break;

case 20:
//C
this.state = 25;
 BA.debugLineNum = 767;BA.debugLine="ItemKala.fldFeeBadAzTakhfif=\"0\"";
Debug.ShouldStop(1073741824);
_itemkala.setField ("fldFeeBadAzTakhfif" /*RemoteObject*/ ,BA.ObjectToString("0"));
 if (true) break;

case 22:
//C
this.state = 25;
 BA.debugLineNum = 769;BA.debugLine="ItemKala.fldFeeBadAzTakhfif=fee";
Debug.ShouldStop(1);
_itemkala.setField ("fldFeeBadAzTakhfif" /*RemoteObject*/ ,_fee);
 BA.debugLineNum = 770;BA.debugLine="fee=Cu.GetInt(\"fldFeeForoosh\")";
Debug.ShouldStop(2);
_fee = BA.NumberToString(_cu.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("fldFeeForoosh"))));Debug.locals.put("fee", _fee);
 if (true) break;

case 24:
//C
this.state = 25;
 BA.debugLineNum = 774;BA.debugLine="ItemKala.fldFeeBadAzTakhfif=Cu.GetString(\"f";
Debug.ShouldStop(32);
_itemkala.setField ("fldFeeBadAzTakhfif" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldFeeBadAzTakhfif"))));
 BA.debugLineNum = 775;BA.debugLine="fee=Cu.GetInt(\"fldFeeForoosh\")";
Debug.ShouldStop(64);
_fee = BA.NumberToString(_cu.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("fldFeeForoosh"))));Debug.locals.put("fee", _fee);
 if (true) break;

case 25:
//C
this.state = 28;
;
 if (true) break;

case 27:
//C
this.state = 28;
 BA.debugLineNum = 779;BA.debugLine="fee=Cu.GetInt(\"fldFeeForoosh\")";
Debug.ShouldStop(1024);
_fee = BA.NumberToString(_cu.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("fldFeeForoosh"))));Debug.locals.put("fee", _fee);
 if (true) break;

case 28:
//C
this.state = 29;
;
 if (true) break;

case 29:
//C
this.state = 30;
;
 BA.debugLineNum = 793;BA.debugLine="Dim countSabad As String=MCode.SingleResult(\"s";
Debug.ShouldStop(16777216);
_countsabad = BA.ObjectToString(parent.mostCurrent._mcode.runMethod(false,"_singleresult" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("select count(FldId) from TblSabad where FldCodeKala="),_itemkala.getField(true,"CodeKala" /*RemoteObject*/ )))));Debug.locals.put("countSabad", _countsabad);Debug.locals.put("countSabad", _countsabad);
 BA.debugLineNum = 794;BA.debugLine="If countSabad>0 Then";
Debug.ShouldStop(33554432);
if (true) break;

case 30:
//if
this.state = 109;
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _countsabad),BA.numberCast(double.class, 0))) { 
this.state = 32;
}else {
this.state = 89;
}if (true) break;

case 32:
//C
this.state = 33;
 BA.debugLineNum = 795;BA.debugLine="Dim cu1 As Cursor=MCode.Result(\"select * from";
Debug.ShouldStop(67108864);
_cu1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu1 = parent.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("select * from TblSabad where FldCodeKala="),_itemkala.getField(true,"CodeKala" /*RemoteObject*/ ))));Debug.locals.put("cu1", _cu1);Debug.locals.put("cu1", _cu1);
 BA.debugLineNum = 796;BA.debugLine="cu1.Position=0";
Debug.ShouldStop(134217728);
_cu1.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 797;BA.debugLine="FeeTip=MCode.feeTip";
Debug.ShouldStop(268435456);
parent._feetip = parent.mostCurrent._mcode._feetip /*RemoteObject*/ ;
 BA.debugLineNum = 798;BA.debugLine="ItemKala.TedadDarSabadJoz =cu1.Getstring(\"Fld";
Debug.ShouldStop(536870912);
_itemkala.setField ("TedadDarSabadJoz" /*RemoteObject*/ ,_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTedadDarSabadJoz"))));
 BA.debugLineNum = 799;BA.debugLine="ItemKala.TedadDarSabadKol =cu1.Getstring(\"Fld";
Debug.ShouldStop(1073741824);
_itemkala.setField ("TedadDarSabadKol" /*RemoteObject*/ ,_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTedadDarSabadKol"))));
 BA.debugLineNum = 800;BA.debugLine="ItemKala.SumMande=Cu.Getstring(\"SumMande\")-cu";
Debug.ShouldStop(-2147483648);
_itemkala.setField ("SumMande" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("SumMande")))),BA.numberCast(double.class, _cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTedadDarSabadJoz"))))}, "-",1, 0)));
 BA.debugLineNum = 801;BA.debugLine="If Cu.Getstring(\"fldNameVahed2\") <> \"\" Then";
Debug.ShouldStop(1);
if (true) break;

case 33:
//if
this.state = 36;
if (RemoteObject.solveBoolean("!",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldNameVahed2"))),BA.ObjectToString(""))) { 
this.state = 35;
}if (true) break;

case 35:
//C
this.state = 36;
 BA.debugLineNum = 802;BA.debugLine="Dim FldFeeForoosh As Int = MCode.Sf.Val(Cu.G";
Debug.ShouldStop(2);
_fldfeeforoosh = BA.numberCast(int.class, parent.mostCurrent._mcode._sf /*RemoteObject*/ .runMethod(true,"_vvvvv1",(Object)(BA.NumberToString(_cu.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("fldFeeForoosh")))))));Debug.locals.put("FldFeeForoosh", _fldfeeforoosh);Debug.locals.put("FldFeeForoosh", _fldfeeforoosh);
 BA.debugLineNum = 803;BA.debugLine="Dim FldTedadDarKarton As Int = MCode.Sf.Val(";
Debug.ShouldStop(4);
_fldtedaddarkarton = BA.numberCast(int.class, parent.mostCurrent._mcode._sf /*RemoteObject*/ .runMethod(true,"_vvvvv1",(Object)(_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldTedadDarSabadKol"))))));Debug.locals.put("FldTedadDarKarton", _fldtedaddarkarton);Debug.locals.put("FldTedadDarKarton", _fldtedaddarkarton);
 BA.debugLineNum = 804;BA.debugLine="Dim SumMande As Int = Cu.Getstring(\"SumMande";
Debug.ShouldStop(8);
_summande = BA.numberCast(int.class, _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("SumMande"))));Debug.locals.put("SumMande", _summande);Debug.locals.put("SumMande", _summande);
 BA.debugLineNum = 805;BA.debugLine="ItemKala.FeeForooshKarton=FldFeeForoosh * Fl";
Debug.ShouldStop(16);
_itemkala.setField ("FeeForooshKarton" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {_fldfeeforoosh,_fldtedaddarkarton}, "*",0, 1)));
 BA.debugLineNum = 806;BA.debugLine="ItemKala.SumMandeKarton=Round2( SumMande / F";
Debug.ShouldStop(32);
_itemkala.setField ("SumMandeKarton" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {parent.mostCurrent.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {_summande,_fldtedaddarkarton}, "/",0, 0)),(Object)(BA.numberCast(int.class, 0))),BA.numberCast(double.class, parent.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(_itemkala.getField(true,"TedadDarSabadKol" /*RemoteObject*/ ))))}, "-",1, 0)));
 if (true) break;

case 36:
//C
this.state = 37;
;
 BA.debugLineNum = 808;BA.debugLine="CmbBox1.SelectedIndex=MCode.feeTip";
Debug.ShouldStop(128);
parent.mostCurrent._cmbbox1.runClassMethod (ir.parsikhesab.pakhsh.b4xcombobox.class, "_setselectedindex" /*RemoteObject*/ ,BA.numberCast(int.class, parent.mostCurrent._mcode._feetip /*RemoteObject*/ ));
 BA.debugLineNum = 809;BA.debugLine="If MCode.feeTip=0 Then";
Debug.ShouldStop(256);
if (true) break;

case 37:
//if
this.state = 42;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._mcode._feetip /*RemoteObject*/ ,BA.NumberToString(0))) { 
this.state = 39;
}else {
this.state = 41;
}if (true) break;

case 39:
//C
this.state = 42;
 BA.debugLineNum = 810;BA.debugLine="fee=cu1.GetString(\"FldFeeForoosh\")";
Debug.ShouldStop(512);
_fee = _cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldFeeForoosh")));Debug.locals.put("fee", _fee);
 if (true) break;

case 41:
//C
this.state = 42;
 BA.debugLineNum = 812;BA.debugLine="fee=MCode.GetUpdateFeeSabad(fee,ItemKala.Cod";
Debug.ShouldStop(2048);
_fee = parent.mostCurrent._mcode.runMethod(true,"_getupdatefeesabad" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(_fee),(Object)(_itemkala.getField(true,"CodeKala" /*RemoteObject*/ )));Debug.locals.put("fee", _fee);
 if (true) break;

case 42:
//C
this.state = 43;
;
 BA.debugLineNum = 818;BA.debugLine="ItemKala.FldEshantion=cu1.Getstring(\"FldEshan";
Debug.ShouldStop(131072);
_itemkala.setField ("FldEshantion" /*RemoteObject*/ ,_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldEshantion"))));
 BA.debugLineNum = 822;BA.debugLine="If myCode.Is_Null_adad(cu1.GetString(\"FldDars";
Debug.ShouldStop(2097152);
if (true) break;

case 43:
//if
this.state = 54;
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, parent.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldDarsadTakhfif")))))),BA.numberCast(double.class, 0))) { 
this.state = 45;
}else {
this.state = 47;
}if (true) break;

case 45:
//C
this.state = 54;
 BA.debugLineNum = 826;BA.debugLine="ItemKala.fldDarsadTakhfif=cu1.GetString(\"Fld";
Debug.ShouldStop(33554432);
_itemkala.setField ("fldDarsadTakhfif" /*RemoteObject*/ ,_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldDarsadTakhfif"))));
 BA.debugLineNum = 827;BA.debugLine="ItemKala.MablaghTakhfif=((fee*cu1.GetString(";
Debug.ShouldStop(67108864);
_itemkala.setField ("MablaghTakhfif" /*RemoteObject*/ ,BA.numberCast(int.class, (RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _fee),BA.numberCast(double.class, _cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldDarsadTakhfif"))))}, "*",0, 0)),RemoteObject.createImmutable(100)}, "/",0, 0))));
 BA.debugLineNum = 829;BA.debugLine="txtFee.Text=MCode.qomaAshar(ItemKala.Mablagh";
Debug.ShouldStop(268435456);
parent.mostCurrent._txtfee.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._mcode.runMethod(true,"_qomaashar" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)((_itemkala.getField(true,"MablaghTakhfif" /*RemoteObject*/ ))))));
 BA.debugLineNum = 830;BA.debugLine="txtDarsadTakhfif.Text=cu1.GetString(\"FldDars";
Debug.ShouldStop(536870912);
parent.mostCurrent._txtdarsadtakhfif.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldDarsadTakhfif")))));
 if (true) break;

case 47:
//C
this.state = 48;
 BA.debugLineNum = 834;BA.debugLine="If cu1.GetString(\"FldMablaghTakhfif\")>0 And";
Debug.ShouldStop(2);
if (true) break;

case 48:
//if
this.state = 53;
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldMablaghTakhfif")))),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("N",_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldMablaghTakhfif"))))) { 
this.state = 50;
}else {
this.state = 52;
}if (true) break;

case 50:
//C
this.state = 53;
 BA.debugLineNum = 836;BA.debugLine="ItemKala.MablaghTakhfif=cu1.GetString(\"FldM";
Debug.ShouldStop(8);
_itemkala.setField ("MablaghTakhfif" /*RemoteObject*/ ,BA.numberCast(int.class, _cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldMablaghTakhfif")))));
 BA.debugLineNum = 837;BA.debugLine="ItemKala.fldDarsadTakhfif=\"0\"";
Debug.ShouldStop(16);
_itemkala.setField ("fldDarsadTakhfif" /*RemoteObject*/ ,BA.ObjectToString("0"));
 if (true) break;

case 52:
//C
this.state = 53;
 BA.debugLineNum = 841;BA.debugLine="ItemKala.MablaghTakhfif=\"0\"";
Debug.ShouldStop(256);
_itemkala.setField ("MablaghTakhfif" /*RemoteObject*/ ,BA.numberCast(int.class, "0"));
 BA.debugLineNum = 842;BA.debugLine="ItemKala.fldDarsadTakhfif=\"0\"";
Debug.ShouldStop(512);
_itemkala.setField ("fldDarsadTakhfif" /*RemoteObject*/ ,BA.ObjectToString("0"));
 if (true) break;

case 53:
//C
this.state = 54;
;
 if (true) break;
;
 BA.debugLineNum = 852;BA.debugLine="If Cu.GetString(\"fldFeeBadAzTakhfif\")<>Null T";
Debug.ShouldStop(524288);

case 54:
//if
this.state = 59;
if (RemoteObject.solveBoolean("N",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldFeeBadAzTakhfif"))))) { 
this.state = 56;
}else {
this.state = 58;
}if (true) break;

case 56:
//C
this.state = 59;
 BA.debugLineNum = 854;BA.debugLine="ItemKala.fldFeeBadAzTakhfif=Cu.GetString(\"fl";
Debug.ShouldStop(2097152);
_itemkala.setField ("fldFeeBadAzTakhfif" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldFeeBadAzTakhfif"))));
 if (true) break;

case 58:
//C
this.state = 59;
 BA.debugLineNum = 858;BA.debugLine="ItemKala.fldFeeBadAzTakhfif=\"0\"";
Debug.ShouldStop(33554432);
_itemkala.setField ("fldFeeBadAzTakhfif" /*RemoteObject*/ ,BA.ObjectToString("0"));
 if (true) break;
;
 BA.debugLineNum = 861;BA.debugLine="If ItemKala.MablaghTakhfif>0 Then";
Debug.ShouldStop(268435456);

case 59:
//if
this.state = 62;
if (RemoteObject.solveBoolean(">",_itemkala.getField(true,"MablaghTakhfif" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
this.state = 61;
}if (true) break;

case 61:
//C
this.state = 62;
 BA.debugLineNum = 862;BA.debugLine="ItemKala.fldFeeBadAzTakhfif=fee-ItemKala.Mab";
Debug.ShouldStop(536870912);
_itemkala.setField ("fldFeeBadAzTakhfif" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _fee),_itemkala.getField(true,"MablaghTakhfif" /*RemoteObject*/ )}, "-",1, 0)));
 if (true) break;

case 62:
//C
this.state = 63;
;
 BA.debugLineNum = 865;BA.debugLine="ItemKala.FeeForoosh=fee";
Debug.ShouldStop(1);
_itemkala.setField ("FeeForoosh" /*RemoteObject*/ ,BA.numberCast(int.class, _fee));
 BA.debugLineNum = 868;BA.debugLine="ItemKala.FldMablaghMasrafKonande=Cu.GetString";
Debug.ShouldStop(8);
_itemkala.setField ("FldMablaghMasrafKonande" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldGhymatMasrafkonande"))));
 BA.debugLineNum = 872;BA.debugLine="ItemKala.fldPathPic=Cu.GetString(\"fldPathPic\"";
Debug.ShouldStop(128);
_itemkala.setField ("fldPathPic" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldPathPic"))));
 BA.debugLineNum = 879;BA.debugLine="If Cu.Getstring(\"fldNameVahed2\") <> \"\"  Then";
Debug.ShouldStop(16384);
if (true) break;

case 63:
//if
this.state = 72;
if (RemoteObject.solveBoolean("!",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldNameVahed2"))),BA.ObjectToString(""))) { 
this.state = 65;
}if (true) break;

case 65:
//C
this.state = 66;
 BA.debugLineNum = 880;BA.debugLine="Dim FldFeeForoosh As Int = MCode.Sf.Val(Cu.G";
Debug.ShouldStop(32768);
_fldfeeforoosh = BA.numberCast(int.class, parent.mostCurrent._mcode._sf /*RemoteObject*/ .runMethod(true,"_vvvvv1",(Object)(BA.NumberToString(_cu.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("fldFeeForoosh")))))));Debug.locals.put("FldFeeForoosh", _fldfeeforoosh);Debug.locals.put("FldFeeForoosh", _fldfeeforoosh);
 BA.debugLineNum = 881;BA.debugLine="Dim FldTedadDarKarton As Int = MCode.Sf.Val(";
Debug.ShouldStop(65536);
_fldtedaddarkarton = BA.numberCast(int.class, parent.mostCurrent._mcode._sf /*RemoteObject*/ .runMethod(true,"_vvvvv1",(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldTedadDarKarton"))))));Debug.locals.put("FldTedadDarKarton", _fldtedaddarkarton);Debug.locals.put("FldTedadDarKarton", _fldtedaddarkarton);
 BA.debugLineNum = 882;BA.debugLine="Dim SumMande As Int = Cu.Getstring(\"SumMande";
Debug.ShouldStop(131072);
_summande = BA.numberCast(int.class, _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("SumMande"))));Debug.locals.put("SumMande", _summande);Debug.locals.put("SumMande", _summande);
 BA.debugLineNum = 883;BA.debugLine="If FldTedadDarKarton>0 Then";
Debug.ShouldStop(262144);
if (true) break;

case 66:
//if
this.state = 71;
if (RemoteObject.solveBoolean(">",_fldtedaddarkarton,BA.numberCast(double.class, 0))) { 
this.state = 68;
}else {
this.state = 70;
}if (true) break;

case 68:
//C
this.state = 71;
 BA.debugLineNum = 884;BA.debugLine="ItemKala.FeeForooshKarton=FldFeeForoosh * F";
Debug.ShouldStop(524288);
_itemkala.setField ("FeeForooshKarton" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {_fldfeeforoosh,_fldtedaddarkarton}, "*",0, 1)));
 BA.debugLineNum = 886;BA.debugLine="Dim SumKol As Long=(SumMande / FldTedadDarK";
Debug.ShouldStop(2097152);
_sumkol = BA.numberCast(long.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_summande,_fldtedaddarkarton}, "/",0, 0)),BA.numberCast(double.class, parent.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(_itemkala.getField(true,"TedadDarSabadKol" /*RemoteObject*/ ))))}, "-",1, 0));Debug.locals.put("SumKol", _sumkol);Debug.locals.put("SumKol", _sumkol);
 BA.debugLineNum = 887;BA.debugLine="ItemKala.SumMandeKarton=SumKol";
Debug.ShouldStop(4194304);
_itemkala.setField ("SumMandeKarton" /*RemoteObject*/ ,BA.NumberToString(_sumkol));
 if (true) break;

case 70:
//C
this.state = 71;
 BA.debugLineNum = 889;BA.debugLine="ItemKala.SumMandeKarton=0";
Debug.ShouldStop(16777216);
_itemkala.setField ("SumMandeKarton" /*RemoteObject*/ ,BA.NumberToString(0));
 if (true) break;

case 71:
//C
this.state = 72;
;
 if (true) break;
;
 BA.debugLineNum = 895;BA.debugLine="If MCode.UpdateSefaresh Then";
Debug.ShouldStop(1073741824);

case 72:
//if
this.state = 87;
if (parent.mostCurrent._mcode._updatesefaresh /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
this.state = 74;
}else {
this.state = 80;
}if (true) break;

case 74:
//C
this.state = 75;
 BA.debugLineNum = 896;BA.debugLine="ItemKala.fldDarsadArzeshAfzode=myCode.Is_Nul";
Debug.ShouldStop(-2147483648);
_itemkala.setField ("fldDarsadArzeshAfzode" /*RemoteObject*/ ,parent.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldDarsadArzeshAfzode"))))));
 BA.debugLineNum = 897;BA.debugLine="If ItemKala.fldDarsadArzeshAfzode>0 Then";
Debug.ShouldStop(1);
if (true) break;

case 75:
//if
this.state = 78;
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _itemkala.getField(true,"fldDarsadArzeshAfzode" /*RemoteObject*/ )),BA.numberCast(double.class, 0))) { 
this.state = 77;
}if (true) break;

case 77:
//C
this.state = 78;
 BA.debugLineNum = 898;BA.debugLine="ItemKala.fldArzeshAfzode=cu1.Getstring(\"fld";
Debug.ShouldStop(2);
_itemkala.setField ("fldArzeshAfzode" /*RemoteObject*/ ,_cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldArzeshAfzode"))));
 BA.debugLineNum = 899;BA.debugLine="SwArzeshAfzodeEnable.Checked=True";
Debug.ShouldStop(4);
parent.mostCurrent._swarzeshafzodeenable.runMethodAndSync(true,"setChecked",parent.mostCurrent.__c.getField(true,"True"));
 if (true) break;

case 78:
//C
this.state = 87;
;
 if (true) break;

case 80:
//C
this.state = 81;
 BA.debugLineNum = 902;BA.debugLine="If SwArzeshAfzodeEnable.Checked Then";
Debug.ShouldStop(32);
if (true) break;

case 81:
//if
this.state = 86;
if (parent.mostCurrent._swarzeshafzodeenable.runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
this.state = 83;
}else {
this.state = 85;
}if (true) break;

case 83:
//C
this.state = 86;
 BA.debugLineNum = 903;BA.debugLine="ItemKala.fldDarsadArzeshAfzode=MCode.Arzesh";
Debug.ShouldStop(64);
_itemkala.setField ("fldDarsadArzeshAfzode" /*RemoteObject*/ ,parent.mostCurrent._mcode._arzeshafzode /*RemoteObject*/ );
 if (true) break;

case 85:
//C
this.state = 86;
 BA.debugLineNum = 905;BA.debugLine="ItemSelected.fldDarsadArzeshAfzode=0";
Debug.ShouldStop(256);
parent.mostCurrent._itemselected.setField ("fldDarsadArzeshAfzode" /*RemoteObject*/ ,BA.NumberToString(0));
 if (true) break;

case 86:
//C
this.state = 87;
;
 if (true) break;

case 87:
//C
this.state = 109;
;
 BA.debugLineNum = 909;BA.debugLine="cu1.Close";
Debug.ShouldStop(4096);
_cu1.runVoidMethod ("Close");
 if (true) break;

case 89:
//C
this.state = 90;
 BA.debugLineNum = 912;BA.debugLine="If Cu.GetString(\"fldFeeBadAzTakhfif\")<>Null T";
Debug.ShouldStop(32768);
if (true) break;

case 90:
//if
this.state = 95;
if (RemoteObject.solveBoolean("N",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldFeeBadAzTakhfif"))))) { 
this.state = 92;
}else {
this.state = 94;
}if (true) break;

case 92:
//C
this.state = 95;
 BA.debugLineNum = 914;BA.debugLine="ItemKala.fldFeeBadAzTakhfif=Cu.GetString(\"fl";
Debug.ShouldStop(131072);
_itemkala.setField ("fldFeeBadAzTakhfif" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldFeeBadAzTakhfif"))));
 if (true) break;

case 94:
//C
this.state = 95;
 BA.debugLineNum = 918;BA.debugLine="ItemKala.fldFeeBadAzTakhfif=\"0\"";
Debug.ShouldStop(2097152);
_itemkala.setField ("fldFeeBadAzTakhfif" /*RemoteObject*/ ,BA.ObjectToString("0"));
 if (true) break;
;
 BA.debugLineNum = 921;BA.debugLine="If ItemKala.MablaghTakhfif>0 Then";
Debug.ShouldStop(16777216);

case 95:
//if
this.state = 98;
if (RemoteObject.solveBoolean(">",_itemkala.getField(true,"MablaghTakhfif" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
this.state = 97;
}if (true) break;

case 97:
//C
this.state = 98;
 BA.debugLineNum = 922;BA.debugLine="ItemKala.fldFeeBadAzTakhfif=fee-ItemKala.Mab";
Debug.ShouldStop(33554432);
_itemkala.setField ("fldFeeBadAzTakhfif" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _fee),_itemkala.getField(true,"MablaghTakhfif" /*RemoteObject*/ )}, "-",1, 0)));
 if (true) break;

case 98:
//C
this.state = 99;
;
 BA.debugLineNum = 925;BA.debugLine="ItemKala.FeeForoosh=fee";
Debug.ShouldStop(268435456);
_itemkala.setField ("FeeForoosh" /*RemoteObject*/ ,BA.numberCast(int.class, _fee));
 BA.debugLineNum = 928;BA.debugLine="ItemKala.FldMablaghMasrafKonande=Cu.GetString";
Debug.ShouldStop(-2147483648);
_itemkala.setField ("FldMablaghMasrafKonande" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldGhymatMasrafkonande"))));
 BA.debugLineNum = 932;BA.debugLine="ItemKala.fldPathPic=Cu.GetString(\"fldPathPic\"";
Debug.ShouldStop(8);
_itemkala.setField ("fldPathPic" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldPathPic"))));
 BA.debugLineNum = 939;BA.debugLine="If Cu.Getstring(\"fldNameVahed2\") <> \"\"  Then";
Debug.ShouldStop(1024);
if (true) break;

case 99:
//if
this.state = 108;
if (RemoteObject.solveBoolean("!",_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldNameVahed2"))),BA.ObjectToString(""))) { 
this.state = 101;
}if (true) break;

case 101:
//C
this.state = 102;
 BA.debugLineNum = 940;BA.debugLine="Dim FldFeeForoosh As Int = MCode.Sf.Val(Cu.G";
Debug.ShouldStop(2048);
_fldfeeforoosh = BA.numberCast(int.class, parent.mostCurrent._mcode._sf /*RemoteObject*/ .runMethod(true,"_vvvvv1",(Object)(BA.NumberToString(_cu.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("fldFeeForoosh")))))));Debug.locals.put("FldFeeForoosh", _fldfeeforoosh);Debug.locals.put("FldFeeForoosh", _fldfeeforoosh);
 BA.debugLineNum = 941;BA.debugLine="Dim FldTedadDarKarton As Int = MCode.Sf.Val(";
Debug.ShouldStop(4096);
_fldtedaddarkarton = BA.numberCast(int.class, parent.mostCurrent._mcode._sf /*RemoteObject*/ .runMethod(true,"_vvvvv1",(Object)(_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("fldTedadDarKarton"))))));Debug.locals.put("FldTedadDarKarton", _fldtedaddarkarton);Debug.locals.put("FldTedadDarKarton", _fldtedaddarkarton);
 BA.debugLineNum = 942;BA.debugLine="Dim SumMande As Int = Cu.Getstring(\"SumMande";
Debug.ShouldStop(8192);
_summande = BA.numberCast(int.class, _cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("SumMande"))));Debug.locals.put("SumMande", _summande);Debug.locals.put("SumMande", _summande);
 BA.debugLineNum = 943;BA.debugLine="If FldTedadDarKarton>0 Then";
Debug.ShouldStop(16384);
if (true) break;

case 102:
//if
this.state = 107;
if (RemoteObject.solveBoolean(">",_fldtedaddarkarton,BA.numberCast(double.class, 0))) { 
this.state = 104;
}else {
this.state = 106;
}if (true) break;

case 104:
//C
this.state = 107;
 BA.debugLineNum = 944;BA.debugLine="ItemKala.FeeForooshKarton=FldFeeForoosh * F";
Debug.ShouldStop(32768);
_itemkala.setField ("FeeForooshKarton" /*RemoteObject*/ ,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {_fldfeeforoosh,_fldtedaddarkarton}, "*",0, 1)));
 BA.debugLineNum = 946;BA.debugLine="Dim SumKol As Long=(SumMande / FldTedadDarK";
Debug.ShouldStop(131072);
_sumkol = BA.numberCast(long.class, (RemoteObject.solve(new RemoteObject[] {_summande,_fldtedaddarkarton}, "/",0, 0)));Debug.locals.put("SumKol", _sumkol);Debug.locals.put("SumKol", _sumkol);
 BA.debugLineNum = 947;BA.debugLine="ItemKala.SumMandeKarton=SumKol";
Debug.ShouldStop(262144);
_itemkala.setField ("SumMandeKarton" /*RemoteObject*/ ,BA.NumberToString(_sumkol));
 if (true) break;

case 106:
//C
this.state = 107;
 BA.debugLineNum = 949;BA.debugLine="ItemKala.SumMandeKarton=0";
Debug.ShouldStop(1048576);
_itemkala.setField ("SumMandeKarton" /*RemoteObject*/ ,BA.NumberToString(0));
 if (true) break;

case 107:
//C
this.state = 108;
;
 if (true) break;

case 108:
//C
this.state = 109;
;
 if (true) break;

case 109:
//C
this.state = 116;
;
 BA.debugLineNum = 959;BA.debugLine="OrginalListKala.Add(ItemKala)";
Debug.ShouldStop(1073741824);
parent.mostCurrent._orginallistkala.runVoidMethod ("Add",(Object)((_itemkala)));
 if (true) break;
if (true) break;

case 110:
//C
this.state = 111;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 964;BA.debugLine="Cu.Close";
Debug.ShouldStop(8);
_cu.runVoidMethod ("Close");
 if (true) break;

case 111:
//C
this.state = 114;
;
 BA.debugLineNum = 977;BA.debugLine="ListKalaSp=OrginalListKala";
Debug.ShouldStop(65536);
parent.mostCurrent._listkalasp = parent.mostCurrent._orginallistkala;
 BA.debugLineNum = 978;BA.debugLine="ListKalaTxt=ListKalaSp";
Debug.ShouldStop(131072);
parent.mostCurrent._listkalatxt = parent.mostCurrent._listkalasp;
 BA.debugLineNum = 979;BA.debugLine="HLV.notifyDataSetChanged";
Debug.ShouldStop(262144);
parent.mostCurrent._hlv.runVoidMethodAndSync ("notifyDataSetChanged");
 BA.debugLineNum = 980;BA.debugLine="Sleep(100)";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("Sleep",act_kaladefault.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_kaladefault", "loadlistkala"),BA.numberCast(int.class, 100));
this.state = 117;
return;
case 117:
//C
this.state = 114;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 113:
//C
this.state = 114;
this.catchState = 0;
 BA.debugLineNum = 983;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","535389698",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",act_kaladefault.mostCurrent.activityBA)),0);
 BA.debugLineNum = 984;BA.debugLine="Log(LastException.Message)";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","535389699",parent.mostCurrent.__c.runMethod(false,"LastException",act_kaladefault.mostCurrent.activityBA).runMethod(true,"getMessage"),0);
 BA.debugLineNum = 985;BA.debugLine="myCode.SendError(LastException.Message,Activity.";
Debug.ShouldStop(16777216);
parent.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(parent.mostCurrent.__c.runMethod(false,"LastException",act_kaladefault.mostCurrent.activityBA).runMethod(true,"getMessage")),(Object)(RemoteObject.concat(parent.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-LoadListKala"))));
 if (true) break;
if (true) break;

case 114:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 1000;BA.debugLine="End Sub";
Debug.ShouldStop(128);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",act_kaladefault.processBA, e0.toString());}
            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _loadnoetasvie() throws Exception{
try {
		Debug.PushSubsStack("LoadNoeTasvie (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,2806);
if (RapidSub.canDelegate("loadnoetasvie")) { return ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","loadnoetasvie");}
RemoteObject _itemtasvie = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlistnoetasvie");
RemoteObject _count = RemoteObject.createImmutable(0);
int _i = 0;
 BA.debugLineNum = 2806;BA.debugLine="Sub LoadNoeTasvie";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 2807;BA.debugLine="Dim ItemTasvie As AdapterListNoeTasvie";
Debug.ShouldStop(4194304);
_itemtasvie = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adapterlistnoetasvie");Debug.locals.put("ItemTasvie", _itemtasvie);
 BA.debugLineNum = 2808;BA.debugLine="ItemTasvie.Initialize";
Debug.ShouldStop(8388608);
_itemtasvie.runVoidMethod ("Initialize");
 BA.debugLineNum = 2809;BA.debugLine="CmbBox1.cmbBox.Clear";
Debug.ShouldStop(16777216);
act_kaladefault.mostCurrent._cmbbox1.getField(false,"_cmbbox" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 2810;BA.debugLine="CmbBox1.cmbBox.Add(\"انتخاب کنید\")";
Debug.ShouldStop(33554432);
act_kaladefault.mostCurrent._cmbbox1.getField(false,"_cmbbox" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("انتخاب کنید")));
 BA.debugLineNum = 2811;BA.debugLine="Dim count As Int =ListTasvie.Size";
Debug.ShouldStop(67108864);
_count = act_kaladefault.mostCurrent._listtasvie.runMethod(true,"getSize");Debug.locals.put("count", _count);Debug.locals.put("count", _count);
 BA.debugLineNum = 2812;BA.debugLine="If count> 0 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean(">",_count,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2813;BA.debugLine="For i = 0 To count-1";
Debug.ShouldStop(268435456);
{
final int step7 = 1;
final int limit7 = RemoteObject.solve(new RemoteObject[] {_count,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step7 > 0 && _i <= limit7) || (step7 < 0 && _i >= limit7) ;_i = ((int)(0 + _i + step7))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 2814;BA.debugLine="ItemTasvie=ListTasvie.Get(i)";
Debug.ShouldStop(536870912);
_itemtasvie = (act_kaladefault.mostCurrent._listtasvie.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("ItemTasvie", _itemtasvie);
 BA.debugLineNum = 2816;BA.debugLine="CmbBox1.cmbBox.Add(ItemTasvie.FldN_Tasvie)";
Debug.ShouldStop(-2147483648);
act_kaladefault.mostCurrent._cmbbox1.getField(false,"_cmbbox" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(_itemtasvie.getField(true,"FldN_Tasvie" /*RemoteObject*/ )));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2818;BA.debugLine="CmbBox1.SelectedIndex=MCode.feeTip";
Debug.ShouldStop(2);
act_kaladefault.mostCurrent._cmbbox1.runClassMethod (ir.parsikhesab.pakhsh.b4xcombobox.class, "_setselectedindex" /*RemoteObject*/ ,BA.numberCast(int.class, act_kaladefault.mostCurrent._mcode._feetip /*RemoteObject*/ ));
 };
 BA.debugLineNum = 2820;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mojavezsefaresh() throws Exception{
try {
		Debug.PushSubsStack("MojavezSefaresh (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,269);
if (RapidSub.canDelegate("mojavezsefaresh")) { return ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","mojavezsefaresh");}
 BA.debugLineNum = 269;BA.debugLine="Private Sub MojavezSefaresh";
Debug.ShouldStop(4096);
 BA.debugLineNum = 270;BA.debugLine="Select MCode.MojavezSefaresh";
Debug.ShouldStop(8192);
switch (BA.switchObjectToInt(act_kaladefault.mostCurrent._mcode._mojavezsefaresh /*RemoteObject*/ ,BA.NumberToString(0),BA.NumberToString(1),BA.NumberToString(2))) {
case 0: {
 BA.debugLineNum = 272;BA.debugLine="lblMojavezSefareshText.Text=\"\"";
Debug.ShouldStop(32768);
act_kaladefault.mostCurrent._lblmojavezsefareshtext.runMethod(true,"setText",BA.ObjectToCharSequence(""));
 break; }
case 1: {
 BA.debugLineNum = 274;BA.debugLine="lblMojavezSefareshText.Text=\"توجه : شما مجوز فر";
Debug.ShouldStop(131072);
act_kaladefault.mostCurrent._lblmojavezsefareshtext.runMethod(true,"setText",BA.ObjectToCharSequence("توجه : شما مجوز فروش کل را ندارید"));
 break; }
case 2: {
 BA.debugLineNum = 276;BA.debugLine="lblMojavezSefareshText.Text=\"توجه : شما مجوز فر";
Debug.ShouldStop(524288);
act_kaladefault.mostCurrent._lblmojavezsefareshtext.runMethod(true,"setText",BA.ObjectToCharSequence("توجه : شما مجوز فروش جزء را ندارید"));
 break; }
}
;
 BA.debugLineNum = 278;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _myzx_noscan1(RemoteObject _atype,RemoteObject _values) throws Exception{
try {
		Debug.PushSubsStack("myzx_noscan1 (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,1573);
if (RapidSub.canDelegate("myzx_noscan1")) { return ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","myzx_noscan1", _atype, _values);}
Debug.locals.put("atype", _atype);
Debug.locals.put("Values", _values);
 BA.debugLineNum = 1573;BA.debugLine="Sub myzx_noscan1(atype As String,Values As String)";
Debug.ShouldStop(16);
 BA.debugLineNum = 1574;BA.debugLine="Msgbox(Values,\"type:\" & atype)";
Debug.ShouldStop(32);
act_kaladefault.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(_values)),(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("type:"),_atype))),act_kaladefault.mostCurrent.activityBA);
 BA.debugLineNum = 1575;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _myzx_result(RemoteObject _atype,RemoteObject _value,RemoteObject _image) throws Exception{
try {
		Debug.PushSubsStack("myzx_result (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,1497);
if (RapidSub.canDelegate("myzx_result")) { return ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","myzx_result", _atype, _value, _image);}
Debug.locals.put("atype", _atype);
Debug.locals.put("Value", _value);
Debug.locals.put("image", _image);
 BA.debugLineNum = 1497;BA.debugLine="Sub myzx_result(atype As String,Value As String, i";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 1498;BA.debugLine="Try";
Debug.ShouldStop(33554432);
try { BA.debugLineNum = 1499;BA.debugLine="LogColor(\"type:\"&atype&\"values:\"&Value,Colors.re";
Debug.ShouldStop(67108864);
act_kaladefault.mostCurrent.__c.runVoidMethod ("LogImpl","536044802",RemoteObject.concat(RemoteObject.createImmutable("type:"),_atype,RemoteObject.createImmutable("values:"),_value),act_kaladefault.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 1502;BA.debugLine="TxtSearch.Text=Value";
Debug.ShouldStop(536870912);
act_kaladefault.mostCurrent._txtsearch.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_value));
 BA.debugLineNum = 1503;BA.debugLine="BtnSearch.Tag=True";
Debug.ShouldStop(1073741824);
act_kaladefault.mostCurrent._btnsearch.runMethod(false,"setTag",(act_kaladefault.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 1504;BA.debugLine="BtnSearch_Click";
Debug.ShouldStop(-2147483648);
_btnsearch_click();
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e7) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_kaladefault.processBA, e7.toString()); BA.debugLineNum = 1506;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2);
act_kaladefault.mostCurrent.__c.runVoidMethod ("LogImpl","536044809",BA.ObjectToString(act_kaladefault.mostCurrent.__c.runMethod(false,"LastException",act_kaladefault.mostCurrent.activityBA)),0);
 BA.debugLineNum = 1507;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(4);
act_kaladefault.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_kaladefault.mostCurrent.__c.runMethod(false,"LastException",act_kaladefault.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_kaladefault.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-myzx_result"))));
 };
 BA.debugLineNum = 1509;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _myzx_result1(RemoteObject _atype,RemoteObject _values) throws Exception{
try {
		Debug.PushSubsStack("myzx_result1 (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,1570);
if (RapidSub.canDelegate("myzx_result1")) { return ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","myzx_result1", _atype, _values);}
Debug.locals.put("atype", _atype);
Debug.locals.put("Values", _values);
 BA.debugLineNum = 1570;BA.debugLine="Sub myzx_result1(atype As String,Values As String)";
Debug.ShouldStop(2);
 BA.debugLineNum = 1572;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _myzx_timedout(RemoteObject _timedout) throws Exception{
try {
		Debug.PushSubsStack("myzx_timedout (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,1518);
if (RapidSub.canDelegate("myzx_timedout")) { return ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","myzx_timedout", _timedout);}
Debug.locals.put("timedOut", _timedout);
 BA.debugLineNum = 1518;BA.debugLine="Sub myzx_timedout(timedOut As Boolean)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 1519;BA.debugLine="Log(\"timedOut \" & timedOut)";
Debug.ShouldStop(16384);
act_kaladefault.mostCurrent.__c.runVoidMethod ("LogImpl","536110337",RemoteObject.concat(RemoteObject.createImmutable("timedOut "),_timedout),0);
 BA.debugLineNum = 1521;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _myzx_usercancelled(RemoteObject _usercancelled) throws Exception{
try {
		Debug.PushSubsStack("myzx_usercancelled (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,1523);
if (RapidSub.canDelegate("myzx_usercancelled")) { return ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","myzx_usercancelled", _usercancelled);}
Debug.locals.put("userCancelled", _usercancelled);
 BA.debugLineNum = 1523;BA.debugLine="Sub myzx_usercancelled(userCancelled As Boolean)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 1524;BA.debugLine="Log(\"userCancelled \" & userCancelled)";
Debug.ShouldStop(524288);
act_kaladefault.mostCurrent.__c.runVoidMethod ("LogImpl","536175873",RemoteObject.concat(RemoteObject.createImmutable("userCancelled "),_usercancelled),0);
 BA.debugLineNum = 1525;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _nicespinner_item_clicked() throws Exception{
try {
		Debug.PushSubsStack("NiceSpinner_item_clicked (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,1166);
if (RapidSub.canDelegate("nicespinner_item_clicked")) { return ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","nicespinner_item_clicked");}
RemoteObject _position = RemoteObject.createImmutable(0);
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _index = RemoteObject.createImmutable(0);
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adaptergoroohkala");
RemoteObject _mc = RemoteObject.createImmutable("");
RemoteObject _count = RemoteObject.createImmutable(0);
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
 BA.debugLineNum = 1166;BA.debugLine="Sub NiceSpinner_item_clicked";
Debug.ShouldStop(8192);
 BA.debugLineNum = 1167;BA.debugLine="Dim Position As Int=NiceSpinner.SelectedIndex";
Debug.ShouldStop(16384);
_position = act_kaladefault.mostCurrent._nicespinner.runMethod(true,"getSelectedIndex");Debug.locals.put("Position", _position);Debug.locals.put("Position", _position);
 BA.debugLineNum = 1168;BA.debugLine="Log(\"ns1 item \" & NiceSpinner.SelectedIndex &\" se";
Debug.ShouldStop(32768);
act_kaladefault.mostCurrent.__c.runVoidMethod ("LogImpl","535520514",RemoteObject.concat(RemoteObject.createImmutable("ns1 item "),act_kaladefault.mostCurrent._nicespinner.runMethod(true,"getSelectedIndex"),RemoteObject.createImmutable(" selected")),0);
 BA.debugLineNum = 1169;BA.debugLine="Log(\"ns1 item \" & NiceSpinner.Text &\" selected\")";
Debug.ShouldStop(65536);
act_kaladefault.mostCurrent.__c.runVoidMethod ("LogImpl","535520515",RemoteObject.concat(RemoteObject.createImmutable("ns1 item "),act_kaladefault.mostCurrent._nicespinner.runMethod(true,"getText"),RemoteObject.createImmutable(" selected")),0);
 BA.debugLineNum = 1171;BA.debugLine="Try";
Debug.ShouldStop(262144);
try { BA.debugLineNum = 1172;BA.debugLine="Key.HideKeyboard";
Debug.ShouldStop(524288);
act_kaladefault.mostCurrent._key.runVoidMethod ("HideKeyboard",act_kaladefault.mostCurrent.activityBA);
 BA.debugLineNum = 1174;BA.debugLine="If Position = 0 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_position,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1175;BA.debugLine="ListGoroohKala1.Clear";
Debug.ShouldStop(4194304);
act_kaladefault.mostCurrent._listgoroohkala1.runVoidMethod ("Clear");
 BA.debugLineNum = 1176;BA.debugLine="lstSelectedCodeGroupKala.Clear";
Debug.ShouldStop(8388608);
act_kaladefault.mostCurrent._lstselectedcodegroupkala.runVoidMethod ("Clear");
 BA.debugLineNum = 1178;BA.debugLine="lstGroup2.Clear";
Debug.ShouldStop(33554432);
act_kaladefault.mostCurrent._lstgroup2.runVoidMethod ("Clear");
 BA.debugLineNum = 1180;BA.debugLine="lstGroup2.Add(\"همه گروه ها\")";
Debug.ShouldStop(134217728);
act_kaladefault.mostCurrent._lstgroup2.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("همه گروه ها"))));
 BA.debugLineNum = 1182;BA.debugLine="GroupCodeSelect1=\"0\"";
Debug.ShouldStop(536870912);
act_kaladefault.mostCurrent._groupcodeselect1 = BA.ObjectToString("0");
 BA.debugLineNum = 1183;BA.debugLine="GroupNameSelect1=\"\"";
Debug.ShouldStop(1073741824);
act_kaladefault.mostCurrent._groupnameselect1 = BA.ObjectToString("");
 BA.debugLineNum = 1184;BA.debugLine="GroupCodeSelect2=\"0\"";
Debug.ShouldStop(-2147483648);
act_kaladefault.mostCurrent._groupcodeselect2 = BA.ObjectToString("0");
 BA.debugLineNum = 1185;BA.debugLine="GroupNameSelect2=\"\"";
Debug.ShouldStop(1);
act_kaladefault.mostCurrent._groupnameselect2 = BA.ObjectToString("");
 }else {
 BA.debugLineNum = 1188;BA.debugLine="Dim lst As List=OriginalListGoroohKala1";
Debug.ShouldStop(8);
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lst = act_kaladefault.mostCurrent._originallistgoroohkala1;Debug.locals.put("lst", _lst);Debug.locals.put("lst", _lst);
 BA.debugLineNum = 1189;BA.debugLine="Log(NiceSpinner.SelectedIndex-1)";
Debug.ShouldStop(16);
act_kaladefault.mostCurrent.__c.runVoidMethod ("LogImpl","535520535",BA.NumberToString(RemoteObject.solve(new RemoteObject[] {act_kaladefault.mostCurrent._nicespinner.runMethod(true,"getSelectedIndex"),RemoteObject.createImmutable(1)}, "-",1, 1)),0);
 BA.debugLineNum = 1190;BA.debugLine="Dim index As Int=Position-1";
Debug.ShouldStop(32);
_index = RemoteObject.solve(new RemoteObject[] {_position,RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("index", _index);Debug.locals.put("index", _index);
 BA.debugLineNum = 1191;BA.debugLine="Dim Item As AdapterGoroohKala=lst.Get(index)";
Debug.ShouldStop(64);
_item = (_lst.runMethod(false,"Get",(Object)(_index)));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 1192;BA.debugLine="Log(Item.FldN_Gorooh)";
Debug.ShouldStop(128);
act_kaladefault.mostCurrent.__c.runVoidMethod ("LogImpl","535520538",_item.getField(true,"FldN_Gorooh" /*RemoteObject*/ ),0);
 BA.debugLineNum = 1193;BA.debugLine="Log(Item.FldC_Gorooh)";
Debug.ShouldStop(256);
act_kaladefault.mostCurrent.__c.runVoidMethod ("LogImpl","535520539",_item.getField(true,"FldC_Gorooh" /*RemoteObject*/ ),0);
 BA.debugLineNum = 1194;BA.debugLine="GroupCodeSelect1=Item.FldC_Gorooh";
Debug.ShouldStop(512);
act_kaladefault.mostCurrent._groupcodeselect1 = _item.getField(true,"FldC_Gorooh" /*RemoteObject*/ );
 BA.debugLineNum = 1195;BA.debugLine="GroupNameSelect1=Item.FldN_Gorooh";
Debug.ShouldStop(1024);
act_kaladefault.mostCurrent._groupnameselect1 = _item.getField(true,"FldN_Gorooh" /*RemoteObject*/ );
 BA.debugLineNum = 1196;BA.debugLine="GroupCodeSelect2=\"0\"";
Debug.ShouldStop(2048);
act_kaladefault.mostCurrent._groupcodeselect2 = BA.ObjectToString("0");
 BA.debugLineNum = 1197;BA.debugLine="GroupNameSelect2=\"\"";
Debug.ShouldStop(4096);
act_kaladefault.mostCurrent._groupnameselect2 = BA.ObjectToString("");
 BA.debugLineNum = 1198;BA.debugLine="Dim mc As String=Item.FldC_Gorooh";
Debug.ShouldStop(8192);
_mc = _item.getField(true,"FldC_Gorooh" /*RemoteObject*/ );Debug.locals.put("mc", _mc);Debug.locals.put("mc", _mc);
 BA.debugLineNum = 1200;BA.debugLine="Dim Count As Int = Item.FldC_Gorooh.Length + 3";
Debug.ShouldStop(32768);
_count = RemoteObject.solve(new RemoteObject[] {_item.getField(true,"FldC_Gorooh" /*RemoteObject*/ ).runMethod(true,"length"),RemoteObject.createImmutable(3)}, "+",1, 1);Debug.locals.put("Count", _count);Debug.locals.put("Count", _count);
 BA.debugLineNum = 1201;BA.debugLine="Dim Cu As Cursor=MCode.Result(\"Select FldC_Goro";
Debug.ShouldStop(65536);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_kaladefault.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select FldC_Gorooh,FldN_Gorooh From TblGoroohKala where FldC_Gorooh Like '"),_mc,RemoteObject.createImmutable("%' And Length(FldC_Gorooh) = "),_count,RemoteObject.createImmutable(" ORDER BY FldC_Gorooh"))));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 1202;BA.debugLine="If Cu.RowCount>0 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1203;BA.debugLine="lstSelectedCodeGroupKala.Clear";
Debug.ShouldStop(262144);
act_kaladefault.mostCurrent._lstselectedcodegroupkala.runVoidMethod ("Clear");
 BA.debugLineNum = 1205;BA.debugLine="lstGroup2.Clear";
Debug.ShouldStop(1048576);
act_kaladefault.mostCurrent._lstgroup2.runVoidMethod ("Clear");
 BA.debugLineNum = 1207;BA.debugLine="lstGroup2.Add(\"همه گروه ها\")";
Debug.ShouldStop(4194304);
act_kaladefault.mostCurrent._lstgroup2.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("همه گروه ها"))));
 BA.debugLineNum = 1208;BA.debugLine="For i=0 To Cu.RowCount-1";
Debug.ShouldStop(8388608);
{
final int step33 = 1;
final int limit33 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step33 > 0 && _i <= limit33) || (step33 < 0 && _i >= limit33) ;_i = ((int)(0 + _i + step33))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1209;BA.debugLine="Cu.Position=i";
Debug.ShouldStop(16777216);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 1210;BA.debugLine="Dim Item As AdapterGoroohKala";
Debug.ShouldStop(33554432);
_item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adaptergoroohkala");Debug.locals.put("Item", _item);
 BA.debugLineNum = 1211;BA.debugLine="Item.FldC_Gorooh=Cu.GetString(\"FldC_Gorooh\")";
Debug.ShouldStop(67108864);
_item.setField ("FldC_Gorooh" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Gorooh"))));
 BA.debugLineNum = 1212;BA.debugLine="Item.FldN_Gorooh=Cu.GetString(\"FldN_Gorooh\")";
Debug.ShouldStop(134217728);
_item.setField ("FldN_Gorooh" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldN_Gorooh"))));
 BA.debugLineNum = 1213;BA.debugLine="ListGoroohKala1.Add(Item)";
Debug.ShouldStop(268435456);
act_kaladefault.mostCurrent._listgoroohkala1.runVoidMethod ("Add",(Object)((_item)));
 BA.debugLineNum = 1215;BA.debugLine="lstGroup2.Add(Cu.GetString(\"FldN_Gorooh\"))";
Debug.ShouldStop(1073741824);
act_kaladefault.mostCurrent._lstgroup2.runVoidMethod ("Add",(Object)((_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldN_Gorooh"))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1218;BA.debugLine="NiceSpinner1.attachDataSource(lstGroup2)";
Debug.ShouldStop(2);
act_kaladefault.mostCurrent._nicespinner1.runVoidMethod ("attachDataSource",(Object)((act_kaladefault.mostCurrent._lstgroup2.getObject())));
 BA.debugLineNum = 1220;BA.debugLine="lstSelectedCodeGroupKala.Add(GroupCodeSelect1)";
Debug.ShouldStop(8);
act_kaladefault.mostCurrent._lstselectedcodegroupkala.runVoidMethod ("Add",(Object)((act_kaladefault.mostCurrent._groupcodeselect1)));
 }else {
 BA.debugLineNum = 1222;BA.debugLine="ListGoroohKala1.Clear";
Debug.ShouldStop(32);
act_kaladefault.mostCurrent._listgoroohkala1.runVoidMethod ("Clear");
 BA.debugLineNum = 1223;BA.debugLine="lstSelectedCodeGroupKala.Clear";
Debug.ShouldStop(64);
act_kaladefault.mostCurrent._lstselectedcodegroupkala.runVoidMethod ("Clear");
 BA.debugLineNum = 1225;BA.debugLine="lstGroup2.Clear";
Debug.ShouldStop(256);
act_kaladefault.mostCurrent._lstgroup2.runVoidMethod ("Clear");
 BA.debugLineNum = 1227;BA.debugLine="lstGroup2.Add(\"همه گروه ها\")";
Debug.ShouldStop(1024);
act_kaladefault.mostCurrent._lstgroup2.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("همه گروه ها"))));
 BA.debugLineNum = 1228;BA.debugLine="GroupCodeSelect2=\"0\"";
Debug.ShouldStop(2048);
act_kaladefault.mostCurrent._groupcodeselect2 = BA.ObjectToString("0");
 BA.debugLineNum = 1229;BA.debugLine="GroupNameSelect2=\"\"";
Debug.ShouldStop(4096);
act_kaladefault.mostCurrent._groupnameselect2 = BA.ObjectToString("");
 };
 };
 BA.debugLineNum = 1234;BA.debugLine="LoadKala";
Debug.ShouldStop(131072);
_loadkala();
 BA.debugLineNum = 1235;BA.debugLine="Log(\"CodeGroupSelect1: \"&GroupCodeSelect1)";
Debug.ShouldStop(262144);
act_kaladefault.mostCurrent.__c.runVoidMethod ("LogImpl","535520581",RemoteObject.concat(RemoteObject.createImmutable("CodeGroupSelect1: "),act_kaladefault.mostCurrent._groupcodeselect1),0);
 BA.debugLineNum = 1236;BA.debugLine="Log(\"postion1: \"&Position)";
Debug.ShouldStop(524288);
act_kaladefault.mostCurrent.__c.runVoidMethod ("LogImpl","535520582",RemoteObject.concat(RemoteObject.createImmutable("postion1: "),_position),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e56) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_kaladefault.processBA, e56.toString()); BA.debugLineNum = 1238;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2097152);
act_kaladefault.mostCurrent.__c.runVoidMethod ("LogImpl","535520584",BA.ObjectToString(act_kaladefault.mostCurrent.__c.runMethod(false,"LastException",act_kaladefault.mostCurrent.activityBA)),0);
 BA.debugLineNum = 1239;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(4194304);
act_kaladefault.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_kaladefault.mostCurrent.__c.runMethod(false,"LastException",act_kaladefault.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_kaladefault.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-NiceSpinner_ItemClick"))));
 };
 BA.debugLineNum = 1241;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _nicespinner_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("NiceSpinner_ItemClick (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,1308);
if (RapidSub.canDelegate("nicespinner_itemclick")) { return ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","nicespinner_itemclick", _position, _value);}
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _index = RemoteObject.createImmutable(0);
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adaptergoroohkala");
RemoteObject _mc = RemoteObject.createImmutable("");
RemoteObject _count = RemoteObject.createImmutable(0);
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 1308;BA.debugLine="Sub NiceSpinner_ItemClick (Position As Int, Value";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 1310;BA.debugLine="Try";
Debug.ShouldStop(536870912);
try { BA.debugLineNum = 1311;BA.debugLine="Key.HideKeyboard";
Debug.ShouldStop(1073741824);
act_kaladefault.mostCurrent._key.runVoidMethod ("HideKeyboard",act_kaladefault.mostCurrent.activityBA);
 BA.debugLineNum = 1313;BA.debugLine="If Position = 0 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_position,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1314;BA.debugLine="ListGoroohKala1.Clear";
Debug.ShouldStop(2);
act_kaladefault.mostCurrent._listgoroohkala1.runVoidMethod ("Clear");
 BA.debugLineNum = 1315;BA.debugLine="lstSelectedCodeGroupKala.Clear";
Debug.ShouldStop(4);
act_kaladefault.mostCurrent._lstselectedcodegroupkala.runVoidMethod ("Clear");
 BA.debugLineNum = 1317;BA.debugLine="lstGroup2.Clear";
Debug.ShouldStop(16);
act_kaladefault.mostCurrent._lstgroup2.runVoidMethod ("Clear");
 BA.debugLineNum = 1318;BA.debugLine="lstGroup2.Add(\"همه گروه ها\")";
Debug.ShouldStop(32);
act_kaladefault.mostCurrent._lstgroup2.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("همه گروه ها"))));
 BA.debugLineNum = 1320;BA.debugLine="GroupCodeSelect1=\"0\"";
Debug.ShouldStop(128);
act_kaladefault.mostCurrent._groupcodeselect1 = BA.ObjectToString("0");
 BA.debugLineNum = 1321;BA.debugLine="GroupNameSelect1=\"\"";
Debug.ShouldStop(256);
act_kaladefault.mostCurrent._groupnameselect1 = BA.ObjectToString("");
 BA.debugLineNum = 1322;BA.debugLine="GroupCodeSelect2=\"0\"";
Debug.ShouldStop(512);
act_kaladefault.mostCurrent._groupcodeselect2 = BA.ObjectToString("0");
 BA.debugLineNum = 1323;BA.debugLine="GroupNameSelect2=\"\"";
Debug.ShouldStop(1024);
act_kaladefault.mostCurrent._groupnameselect2 = BA.ObjectToString("");
 BA.debugLineNum = 1324;BA.debugLine="NiceSpinner1.SelectedIndex=0";
Debug.ShouldStop(2048);
act_kaladefault.mostCurrent._nicespinner1.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 }else {
 BA.debugLineNum = 1326;BA.debugLine="Dim lst As List=OriginalListGoroohKala1";
Debug.ShouldStop(8192);
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lst = act_kaladefault.mostCurrent._originallistgoroohkala1;Debug.locals.put("lst", _lst);Debug.locals.put("lst", _lst);
 BA.debugLineNum = 1327;BA.debugLine="Log(NiceSpinner.SelectedIndex-1)";
Debug.ShouldStop(16384);
act_kaladefault.mostCurrent.__c.runVoidMethod ("LogImpl","535651603",BA.NumberToString(RemoteObject.solve(new RemoteObject[] {act_kaladefault.mostCurrent._nicespinner.runMethod(true,"getSelectedIndex"),RemoteObject.createImmutable(1)}, "-",1, 1)),0);
 BA.debugLineNum = 1328;BA.debugLine="Dim index As Int=Position-1";
Debug.ShouldStop(32768);
_index = RemoteObject.solve(new RemoteObject[] {_position,RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("index", _index);Debug.locals.put("index", _index);
 BA.debugLineNum = 1329;BA.debugLine="Dim Item As AdapterGoroohKala=lst.Get(index)";
Debug.ShouldStop(65536);
_item = (_lst.runMethod(false,"Get",(Object)(_index)));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 1330;BA.debugLine="Log(Item.FldN_Gorooh)";
Debug.ShouldStop(131072);
act_kaladefault.mostCurrent.__c.runVoidMethod ("LogImpl","535651606",_item.getField(true,"FldN_Gorooh" /*RemoteObject*/ ),0);
 BA.debugLineNum = 1331;BA.debugLine="Log(Item.FldC_Gorooh)";
Debug.ShouldStop(262144);
act_kaladefault.mostCurrent.__c.runVoidMethod ("LogImpl","535651607",_item.getField(true,"FldC_Gorooh" /*RemoteObject*/ ),0);
 BA.debugLineNum = 1332;BA.debugLine="GroupCodeSelect1=Item.FldC_Gorooh";
Debug.ShouldStop(524288);
act_kaladefault.mostCurrent._groupcodeselect1 = _item.getField(true,"FldC_Gorooh" /*RemoteObject*/ );
 BA.debugLineNum = 1333;BA.debugLine="GroupNameSelect1=Item.FldN_Gorooh";
Debug.ShouldStop(1048576);
act_kaladefault.mostCurrent._groupnameselect1 = _item.getField(true,"FldN_Gorooh" /*RemoteObject*/ );
 BA.debugLineNum = 1334;BA.debugLine="GroupCodeSelect2=\"0\"";
Debug.ShouldStop(2097152);
act_kaladefault.mostCurrent._groupcodeselect2 = BA.ObjectToString("0");
 BA.debugLineNum = 1335;BA.debugLine="GroupNameSelect2=\"\"";
Debug.ShouldStop(4194304);
act_kaladefault.mostCurrent._groupnameselect2 = BA.ObjectToString("");
 BA.debugLineNum = 1336;BA.debugLine="Dim mc As String=Item.FldC_Gorooh";
Debug.ShouldStop(8388608);
_mc = _item.getField(true,"FldC_Gorooh" /*RemoteObject*/ );Debug.locals.put("mc", _mc);Debug.locals.put("mc", _mc);
 BA.debugLineNum = 1338;BA.debugLine="Dim Count As Int = Item.FldC_Gorooh.Length + 3";
Debug.ShouldStop(33554432);
_count = RemoteObject.solve(new RemoteObject[] {_item.getField(true,"FldC_Gorooh" /*RemoteObject*/ ).runMethod(true,"length"),RemoteObject.createImmutable(3)}, "+",1, 1);Debug.locals.put("Count", _count);Debug.locals.put("Count", _count);
 BA.debugLineNum = 1339;BA.debugLine="Dim Cu As Cursor=MCode.Result(\"Select FldC_Goro";
Debug.ShouldStop(67108864);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_kaladefault.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select FldC_Gorooh,FldN_Gorooh From TblGoroohKala where FldC_Gorooh Like '"),_mc,RemoteObject.createImmutable("%' And Length(FldC_Gorooh) = "),_count,RemoteObject.createImmutable(" ORDER BY FldC_Gorooh"))));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 1340;BA.debugLine="If Cu.RowCount>0 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1341;BA.debugLine="lstSelectedCodeGroupKala.Clear";
Debug.ShouldStop(268435456);
act_kaladefault.mostCurrent._lstselectedcodegroupkala.runVoidMethod ("Clear");
 BA.debugLineNum = 1343;BA.debugLine="lstGroup2.Clear";
Debug.ShouldStop(1073741824);
act_kaladefault.mostCurrent._lstgroup2.runVoidMethod ("Clear");
 BA.debugLineNum = 1345;BA.debugLine="lstGroup2.Add(\"همه گروه ها\")";
Debug.ShouldStop(1);
act_kaladefault.mostCurrent._lstgroup2.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("همه گروه ها"))));
 BA.debugLineNum = 1346;BA.debugLine="For i=0 To Cu.RowCount-1";
Debug.ShouldStop(2);
{
final int step31 = 1;
final int limit31 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step31 > 0 && _i <= limit31) || (step31 < 0 && _i >= limit31) ;_i = ((int)(0 + _i + step31))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1347;BA.debugLine="Cu.Position=i";
Debug.ShouldStop(4);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 1348;BA.debugLine="Dim Item As AdapterGoroohKala";
Debug.ShouldStop(8);
_item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adaptergoroohkala");Debug.locals.put("Item", _item);
 BA.debugLineNum = 1349;BA.debugLine="Item.FldC_Gorooh=Cu.GetString(\"FldC_Gorooh\")";
Debug.ShouldStop(16);
_item.setField ("FldC_Gorooh" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Gorooh"))));
 BA.debugLineNum = 1350;BA.debugLine="Item.FldN_Gorooh=Cu.GetString(\"FldN_Gorooh\")";
Debug.ShouldStop(32);
_item.setField ("FldN_Gorooh" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldN_Gorooh"))));
 BA.debugLineNum = 1351;BA.debugLine="ListGoroohKala1.Add(Item)";
Debug.ShouldStop(64);
act_kaladefault.mostCurrent._listgoroohkala1.runVoidMethod ("Add",(Object)((_item)));
 BA.debugLineNum = 1353;BA.debugLine="lstGroup2.Add(Cu.GetString(\"FldN_Gorooh\"))";
Debug.ShouldStop(256);
act_kaladefault.mostCurrent._lstgroup2.runVoidMethod ("Add",(Object)((_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldN_Gorooh"))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1356;BA.debugLine="NiceSpinner1.attachDataSource(lstGroup2)";
Debug.ShouldStop(2048);
act_kaladefault.mostCurrent._nicespinner1.runVoidMethod ("attachDataSource",(Object)((act_kaladefault.mostCurrent._lstgroup2.getObject())));
 BA.debugLineNum = 1357;BA.debugLine="NiceSpinner1.SelectedIndex = 0";
Debug.ShouldStop(4096);
act_kaladefault.mostCurrent._nicespinner1.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 BA.debugLineNum = 1358;BA.debugLine="lstSelectedCodeGroupKala.Add(GroupCodeSelect1)";
Debug.ShouldStop(8192);
act_kaladefault.mostCurrent._lstselectedcodegroupkala.runVoidMethod ("Add",(Object)((act_kaladefault.mostCurrent._groupcodeselect1)));
 }else {
 BA.debugLineNum = 1360;BA.debugLine="ListGoroohKala1.Clear";
Debug.ShouldStop(32768);
act_kaladefault.mostCurrent._listgoroohkala1.runVoidMethod ("Clear");
 BA.debugLineNum = 1361;BA.debugLine="lstSelectedCodeGroupKala.Clear";
Debug.ShouldStop(65536);
act_kaladefault.mostCurrent._lstselectedcodegroupkala.runVoidMethod ("Clear");
 BA.debugLineNum = 1363;BA.debugLine="lstGroup2.Clear";
Debug.ShouldStop(262144);
act_kaladefault.mostCurrent._lstgroup2.runVoidMethod ("Clear");
 BA.debugLineNum = 1365;BA.debugLine="lstGroup2.Add(\"همه گروه ها\")";
Debug.ShouldStop(1048576);
act_kaladefault.mostCurrent._lstgroup2.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("همه گروه ها"))));
 BA.debugLineNum = 1366;BA.debugLine="GroupCodeSelect2=\"0\"";
Debug.ShouldStop(2097152);
act_kaladefault.mostCurrent._groupcodeselect2 = BA.ObjectToString("0");
 BA.debugLineNum = 1367;BA.debugLine="GroupNameSelect2=\"\"";
Debug.ShouldStop(4194304);
act_kaladefault.mostCurrent._groupnameselect2 = BA.ObjectToString("");
 BA.debugLineNum = 1368;BA.debugLine="NiceSpinner1.SelectedIndex=0";
Debug.ShouldStop(8388608);
act_kaladefault.mostCurrent._nicespinner1.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 };
 };
 BA.debugLineNum = 1372;BA.debugLine="LoadKala";
Debug.ShouldStop(134217728);
_loadkala();
 BA.debugLineNum = 1373;BA.debugLine="Log(\"CodeGroupSelect1: \"&GroupCodeSelect1)";
Debug.ShouldStop(268435456);
act_kaladefault.mostCurrent.__c.runVoidMethod ("LogImpl","535651649",RemoteObject.concat(RemoteObject.createImmutable("CodeGroupSelect1: "),act_kaladefault.mostCurrent._groupcodeselect1),0);
 BA.debugLineNum = 1374;BA.debugLine="Log(\"postion1: \"&Position)";
Debug.ShouldStop(536870912);
act_kaladefault.mostCurrent.__c.runVoidMethod ("LogImpl","535651650",RemoteObject.concat(RemoteObject.createImmutable("postion1: "),_position),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e56) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_kaladefault.processBA, e56.toString()); BA.debugLineNum = 1376;BA.debugLine="Log(LastException)";
Debug.ShouldStop(-2147483648);
act_kaladefault.mostCurrent.__c.runVoidMethod ("LogImpl","535651652",BA.ObjectToString(act_kaladefault.mostCurrent.__c.runMethod(false,"LastException",act_kaladefault.mostCurrent.activityBA)),0);
 BA.debugLineNum = 1377;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(1);
act_kaladefault.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_kaladefault.mostCurrent.__c.runMethod(false,"LastException",act_kaladefault.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_kaladefault.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-NiceSpinner_ItemClick"))));
 };
 BA.debugLineNum = 1379;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _nicespinner1_item_clicked() throws Exception{
try {
		Debug.PushSubsStack("NiceSpinner1_item_clicked (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,1243);
if (RapidSub.canDelegate("nicespinner1_item_clicked")) { return ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","nicespinner1_item_clicked");}
RemoteObject _position = RemoteObject.createImmutable(0);
RemoteObject _value = RemoteObject.declareNull("Object");
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adaptergoroohkala");
RemoteObject _mc = RemoteObject.createImmutable("");
RemoteObject _count = RemoteObject.createImmutable(0);
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
RemoteObject _op1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
 BA.debugLineNum = 1243;BA.debugLine="Sub NiceSpinner1_item_clicked";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 1244;BA.debugLine="Dim Position As Int=NiceSpinner1.SelectedIndex";
Debug.ShouldStop(134217728);
_position = act_kaladefault.mostCurrent._nicespinner1.runMethod(true,"getSelectedIndex");Debug.locals.put("Position", _position);Debug.locals.put("Position", _position);
 BA.debugLineNum = 1245;BA.debugLine="Dim Value As Object=NiceSpinner1.Text";
Debug.ShouldStop(268435456);
_value = (act_kaladefault.mostCurrent._nicespinner1.runMethod(true,"getText"));Debug.locals.put("Value", _value);Debug.locals.put("Value", _value);
 BA.debugLineNum = 1246;BA.debugLine="Log(\"ns2 item \" & NiceSpinner1.SelectedIndex &\" s";
Debug.ShouldStop(536870912);
act_kaladefault.mostCurrent.__c.runVoidMethod ("LogImpl","535586051",RemoteObject.concat(RemoteObject.createImmutable("ns2 item "),act_kaladefault.mostCurrent._nicespinner1.runMethod(true,"getSelectedIndex"),RemoteObject.createImmutable(" selected")),0);
 BA.debugLineNum = 1247;BA.debugLine="Log(\"ns2 item \" & NiceSpinner1.Text &\" selected\")";
Debug.ShouldStop(1073741824);
act_kaladefault.mostCurrent.__c.runVoidMethod ("LogImpl","535586052",RemoteObject.concat(RemoteObject.createImmutable("ns2 item "),act_kaladefault.mostCurrent._nicespinner1.runMethod(true,"getText"),RemoteObject.createImmutable(" selected")),0);
 BA.debugLineNum = 1248;BA.debugLine="Try";
Debug.ShouldStop(-2147483648);
try { BA.debugLineNum = 1249;BA.debugLine="If Position=0 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_position,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1250;BA.debugLine="If lstSelectedCodeGroupKala.Size>0 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean(">",act_kaladefault.mostCurrent._lstselectedcodegroupkala.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1251;BA.debugLine="GroupCodeSelect2=lstSelectedCodeGroupKala.Get(";
Debug.ShouldStop(4);
act_kaladefault.mostCurrent._groupcodeselect2 = BA.ObjectToString(act_kaladefault.mostCurrent._lstselectedcodegroupkala.runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {act_kaladefault.mostCurrent._lstselectedcodegroupkala.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1))));
 };
 }else {
 BA.debugLineNum = 1255;BA.debugLine="Dim lst As List=ListGoroohKala1";
Debug.ShouldStop(64);
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lst = act_kaladefault.mostCurrent._listgoroohkala1;Debug.locals.put("lst", _lst);Debug.locals.put("lst", _lst);
 BA.debugLineNum = 1256;BA.debugLine="Dim Item As AdapterGoroohKala=lst.Get(Position-";
Debug.ShouldStop(128);
_item = (_lst.runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {_position,RemoteObject.createImmutable(1)}, "-",1, 1))));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 1257;BA.debugLine="GroupCodeSelect2=Item.FldC_Gorooh";
Debug.ShouldStop(256);
act_kaladefault.mostCurrent._groupcodeselect2 = _item.getField(true,"FldC_Gorooh" /*RemoteObject*/ );
 BA.debugLineNum = 1259;BA.debugLine="Dim mc As String=Item.FldC_Gorooh";
Debug.ShouldStop(1024);
_mc = _item.getField(true,"FldC_Gorooh" /*RemoteObject*/ );Debug.locals.put("mc", _mc);Debug.locals.put("mc", _mc);
 BA.debugLineNum = 1261;BA.debugLine="Dim Count As Int = mc.Length + 3";
Debug.ShouldStop(4096);
_count = RemoteObject.solve(new RemoteObject[] {_mc.runMethod(true,"length"),RemoteObject.createImmutable(3)}, "+",1, 1);Debug.locals.put("Count", _count);Debug.locals.put("Count", _count);
 BA.debugLineNum = 1262;BA.debugLine="Dim Cu As Cursor=MCode.Result(\"Select FldC_Goro";
Debug.ShouldStop(8192);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_kaladefault.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select FldC_Gorooh,FldN_Gorooh From TblGoroohKala where FldC_Gorooh Like '"),_mc,RemoteObject.createImmutable("%' And Length(FldC_Gorooh) = "),_count,RemoteObject.createImmutable(" ORDER BY FldC_Gorooh"))));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 1263;BA.debugLine="If Cu.RowCount>0 Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1264;BA.debugLine="ListGoroohKala1.Clear";
Debug.ShouldStop(32768);
act_kaladefault.mostCurrent._listgoroohkala1.runVoidMethod ("Clear");
 BA.debugLineNum = 1268;BA.debugLine="lstSelectedCodeGroupKala.Add(Item.FldC_Gorooh)";
Debug.ShouldStop(524288);
act_kaladefault.mostCurrent._lstselectedcodegroupkala.runVoidMethod ("Add",(Object)((_item.getField(true,"FldC_Gorooh" /*RemoteObject*/ ))));
 BA.debugLineNum = 1272;BA.debugLine="lstGroup2.Clear";
Debug.ShouldStop(8388608);
act_kaladefault.mostCurrent._lstgroup2.runVoidMethod ("Clear");
 BA.debugLineNum = 1274;BA.debugLine="lstGroup2.Add(\"همه گروه ها\")";
Debug.ShouldStop(33554432);
act_kaladefault.mostCurrent._lstgroup2.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("همه گروه ها"))));
 BA.debugLineNum = 1276;BA.debugLine="For i=0 To Cu.RowCount-1";
Debug.ShouldStop(134217728);
{
final int step22 = 1;
final int limit22 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step22 > 0 && _i <= limit22) || (step22 < 0 && _i >= limit22) ;_i = ((int)(0 + _i + step22))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1277;BA.debugLine="Cu.Position=i";
Debug.ShouldStop(268435456);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 1278;BA.debugLine="Dim Item As AdapterGoroohKala";
Debug.ShouldStop(536870912);
_item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adaptergoroohkala");Debug.locals.put("Item", _item);
 BA.debugLineNum = 1279;BA.debugLine="Item.FldC_Gorooh=Cu.GetString(\"FldC_Gorooh\")";
Debug.ShouldStop(1073741824);
_item.setField ("FldC_Gorooh" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Gorooh"))));
 BA.debugLineNum = 1280;BA.debugLine="Item.FldN_Gorooh=Cu.GetString(\"FldN_Gorooh\")";
Debug.ShouldStop(-2147483648);
_item.setField ("FldN_Gorooh" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldN_Gorooh"))));
 BA.debugLineNum = 1281;BA.debugLine="ListGoroohKala1.Add(Item)";
Debug.ShouldStop(1);
act_kaladefault.mostCurrent._listgoroohkala1.runVoidMethod ("Add",(Object)((_item)));
 BA.debugLineNum = 1283;BA.debugLine="lstGroup2.Add(Cu.GetString(\"FldN_Gorooh\"))";
Debug.ShouldStop(4);
act_kaladefault.mostCurrent._lstgroup2.runVoidMethod ("Add",(Object)((_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldN_Gorooh"))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1286;BA.debugLine="NiceSpinner1.RemoveView";
Debug.ShouldStop(32);
act_kaladefault.mostCurrent._nicespinner1.runVoidMethod ("RemoveView");
 BA.debugLineNum = 1287;BA.debugLine="NiceSpinner1.Initialize(\"NiceSpinner1\")";
Debug.ShouldStop(64);
act_kaladefault.mostCurrent._nicespinner1.runVoidMethod ("Initialize",act_kaladefault.processBA,(Object)(RemoteObject.createImmutable("NiceSpinner1")));
 BA.debugLineNum = 1288;BA.debugLine="PnlSpGroup.AddView(NiceSpinner1,B4XComboBox2.m";
Debug.ShouldStop(128);
act_kaladefault.mostCurrent._pnlspgroup.runVoidMethod ("AddView",(Object)((act_kaladefault.mostCurrent._nicespinner1.getObject())),(Object)(act_kaladefault.mostCurrent._b4xcombobox2.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getLeft")),(Object)(act_kaladefault.mostCurrent._b4xcombobox2.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getTop")),(Object)(act_kaladefault.mostCurrent._b4xcombobox2.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(act_kaladefault.mostCurrent._b4xcombobox2.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 1289;BA.debugLine="NiceSpinner1.TextColor = Colors.Black";
Debug.ShouldStop(256);
act_kaladefault.mostCurrent._nicespinner1.runMethod(true,"setTextColor",act_kaladefault.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 1290;BA.debugLine="NiceSpinner1.Gravity = Gravity.CENTER_HORIZONT";
Debug.ShouldStop(512);
act_kaladefault.mostCurrent._nicespinner1.runMethod(true,"setGravity",act_kaladefault.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL"));
 BA.debugLineNum = 1291;BA.debugLine="NiceSpinner1.Typeface = Typeface.LoadFromAsset";
Debug.ShouldStop(1024);
act_kaladefault.mostCurrent._nicespinner1.runMethod(false,"setTypeface",act_kaladefault.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("p_font.ttf"))));
 BA.debugLineNum = 1292;BA.debugLine="Dim op1 As ColorDrawable";
Debug.ShouldStop(2048);
_op1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("op1", _op1);
 BA.debugLineNum = 1293;BA.debugLine="op1.Initialize2(Colors.White,8dip,2dip,Colors.";
Debug.ShouldStop(4096);
_op1.runVoidMethod ("Initialize2",(Object)(act_kaladefault.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(act_kaladefault.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 8)))),(Object)(act_kaladefault.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(act_kaladefault.mostCurrent.__c.getField(false,"Colors").getField(true,"Black")));
 BA.debugLineNum = 1294;BA.debugLine="NiceSpinner1.Background=op1";
Debug.ShouldStop(8192);
act_kaladefault.mostCurrent._nicespinner1.runMethod(false,"setBackground",(_op1.getObject()));
 BA.debugLineNum = 1295;BA.debugLine="NiceSpinner1.attachDataSource(lstGroup2)";
Debug.ShouldStop(16384);
act_kaladefault.mostCurrent._nicespinner1.runVoidMethod ("attachDataSource",(Object)((act_kaladefault.mostCurrent._lstgroup2.getObject())));
 };
 };
 BA.debugLineNum = 1299;BA.debugLine="LoadKala";
Debug.ShouldStop(262144);
_loadkala();
 BA.debugLineNum = 1300;BA.debugLine="Log(\"CodeGroupSelect2: \"&GroupCodeSelect2)";
Debug.ShouldStop(524288);
act_kaladefault.mostCurrent.__c.runVoidMethod ("LogImpl","535586105",RemoteObject.concat(RemoteObject.createImmutable("CodeGroupSelect2: "),act_kaladefault.mostCurrent._groupcodeselect2),0);
 BA.debugLineNum = 1301;BA.debugLine="Log(\"position2: \"&Position)";
Debug.ShouldStop(1048576);
act_kaladefault.mostCurrent.__c.runVoidMethod ("LogImpl","535586106",RemoteObject.concat(RemoteObject.createImmutable("position2: "),_position),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e46) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_kaladefault.processBA, e46.toString()); BA.debugLineNum = 1303;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4194304);
act_kaladefault.mostCurrent.__c.runVoidMethod ("LogImpl","535586108",BA.ObjectToString(act_kaladefault.mostCurrent.__c.runMethod(false,"LastException",act_kaladefault.mostCurrent.activityBA)),0);
 BA.debugLineNum = 1304;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(8388608);
act_kaladefault.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_kaladefault.mostCurrent.__c.runMethod(false,"LastException",act_kaladefault.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_kaladefault.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-NiceSpinner1_ItemClick"))));
 };
 BA.debugLineNum = 1306;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _nicespinner1_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("NiceSpinner1_ItemClick (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,1381);
if (RapidSub.canDelegate("nicespinner1_itemclick")) { return ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","nicespinner1_itemclick", _position, _value);}
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adaptergoroohkala");
RemoteObject _mc = RemoteObject.createImmutable("");
RemoteObject _count = RemoteObject.createImmutable(0);
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 1381;BA.debugLine="Sub NiceSpinner1_ItemClick (Position As Int, Value";
Debug.ShouldStop(16);
 BA.debugLineNum = 1382;BA.debugLine="Try";
Debug.ShouldStop(32);
try { BA.debugLineNum = 1383;BA.debugLine="If Position=0 Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_position,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1384;BA.debugLine="GroupCodeSelect2=lstSelectedCodeGroupKala.Get(l";
Debug.ShouldStop(128);
act_kaladefault.mostCurrent._groupcodeselect2 = BA.ObjectToString(act_kaladefault.mostCurrent._lstselectedcodegroupkala.runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {act_kaladefault.mostCurrent._lstselectedcodegroupkala.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1))));
 }else {
 BA.debugLineNum = 1386;BA.debugLine="Dim lst As List=ListGoroohKala1";
Debug.ShouldStop(512);
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lst = act_kaladefault.mostCurrent._listgoroohkala1;Debug.locals.put("lst", _lst);Debug.locals.put("lst", _lst);
 BA.debugLineNum = 1387;BA.debugLine="Dim Item As AdapterGoroohKala=lst.Get(Position-";
Debug.ShouldStop(1024);
_item = (_lst.runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {_position,RemoteObject.createImmutable(1)}, "-",1, 1))));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 1388;BA.debugLine="GroupCodeSelect2=Item.FldC_Gorooh";
Debug.ShouldStop(2048);
act_kaladefault.mostCurrent._groupcodeselect2 = _item.getField(true,"FldC_Gorooh" /*RemoteObject*/ );
 BA.debugLineNum = 1390;BA.debugLine="Dim mc As String=Item.FldC_Gorooh";
Debug.ShouldStop(8192);
_mc = _item.getField(true,"FldC_Gorooh" /*RemoteObject*/ );Debug.locals.put("mc", _mc);Debug.locals.put("mc", _mc);
 BA.debugLineNum = 1392;BA.debugLine="Dim Count As Int = mc.Length + 3";
Debug.ShouldStop(32768);
_count = RemoteObject.solve(new RemoteObject[] {_mc.runMethod(true,"length"),RemoteObject.createImmutable(3)}, "+",1, 1);Debug.locals.put("Count", _count);Debug.locals.put("Count", _count);
 BA.debugLineNum = 1393;BA.debugLine="Dim Cu As Cursor=MCode.Result(\"Select FldC_Goro";
Debug.ShouldStop(65536);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_kaladefault.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Select FldC_Gorooh,FldN_Gorooh From TblGoroohKala where FldC_Gorooh Like '"),_mc,RemoteObject.createImmutable("%' And Length(FldC_Gorooh) = "),_count,RemoteObject.createImmutable(" ORDER BY FldC_Gorooh"))));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 1394;BA.debugLine="If Cu.RowCount>0 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1395;BA.debugLine="ListGoroohKala1.Clear";
Debug.ShouldStop(262144);
act_kaladefault.mostCurrent._listgoroohkala1.runVoidMethod ("Clear");
 BA.debugLineNum = 1399;BA.debugLine="lstSelectedCodeGroupKala.Add(Item.FldC_Gorooh)";
Debug.ShouldStop(4194304);
act_kaladefault.mostCurrent._lstselectedcodegroupkala.runVoidMethod ("Add",(Object)((_item.getField(true,"FldC_Gorooh" /*RemoteObject*/ ))));
 BA.debugLineNum = 1403;BA.debugLine="lstGroup2.Clear";
Debug.ShouldStop(67108864);
act_kaladefault.mostCurrent._lstgroup2.runVoidMethod ("Clear");
 BA.debugLineNum = 1405;BA.debugLine="lstGroup2.Add(\"همه گروه ها\")";
Debug.ShouldStop(268435456);
act_kaladefault.mostCurrent._lstgroup2.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("همه گروه ها"))));
 BA.debugLineNum = 1407;BA.debugLine="For i=0 To Cu.RowCount-1";
Debug.ShouldStop(1073741824);
{
final int step16 = 1;
final int limit16 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step16 > 0 && _i <= limit16) || (step16 < 0 && _i >= limit16) ;_i = ((int)(0 + _i + step16))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1408;BA.debugLine="Cu.Position=i";
Debug.ShouldStop(-2147483648);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 1409;BA.debugLine="Dim Item As AdapterGoroohKala";
Debug.ShouldStop(1);
_item = RemoteObject.createNew ("ir.parsikhesab.pakhsh.mcode._adaptergoroohkala");Debug.locals.put("Item", _item);
 BA.debugLineNum = 1410;BA.debugLine="Item.FldC_Gorooh=Cu.GetString(\"FldC_Gorooh\")";
Debug.ShouldStop(2);
_item.setField ("FldC_Gorooh" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldC_Gorooh"))));
 BA.debugLineNum = 1411;BA.debugLine="Item.FldN_Gorooh=Cu.GetString(\"FldN_Gorooh\")";
Debug.ShouldStop(4);
_item.setField ("FldN_Gorooh" /*RemoteObject*/ ,_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldN_Gorooh"))));
 BA.debugLineNum = 1412;BA.debugLine="ListGoroohKala1.Add(Item)";
Debug.ShouldStop(8);
act_kaladefault.mostCurrent._listgoroohkala1.runVoidMethod ("Add",(Object)((_item)));
 BA.debugLineNum = 1414;BA.debugLine="lstGroup2.Add(Cu.GetString(\"FldN_Gorooh\"))";
Debug.ShouldStop(32);
act_kaladefault.mostCurrent._lstgroup2.runVoidMethod ("Add",(Object)((_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldN_Gorooh"))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1419;BA.debugLine="NiceSpinner1.attachDataSource(lstGroup2)";
Debug.ShouldStop(1024);
act_kaladefault.mostCurrent._nicespinner1.runVoidMethod ("attachDataSource",(Object)((act_kaladefault.mostCurrent._lstgroup2.getObject())));
 BA.debugLineNum = 1420;BA.debugLine="NiceSpinner1.SelectedIndex = 0";
Debug.ShouldStop(2048);
act_kaladefault.mostCurrent._nicespinner1.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 };
 };
 BA.debugLineNum = 1423;BA.debugLine="LoadKala";
Debug.ShouldStop(16384);
_loadkala();
 BA.debugLineNum = 1424;BA.debugLine="Log(\"CodeGroupSelect2: \"&GroupCodeSelect2)";
Debug.ShouldStop(32768);
act_kaladefault.mostCurrent.__c.runVoidMethod ("LogImpl","535717163",RemoteObject.concat(RemoteObject.createImmutable("CodeGroupSelect2: "),act_kaladefault.mostCurrent._groupcodeselect2),0);
 BA.debugLineNum = 1425;BA.debugLine="Log(\"position2: \"&Position)";
Debug.ShouldStop(65536);
act_kaladefault.mostCurrent.__c.runVoidMethod ("LogImpl","535717164",RemoteObject.concat(RemoteObject.createImmutable("position2: "),_position),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e32) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_kaladefault.processBA, e32.toString()); BA.debugLineNum = 1427;BA.debugLine="Log(LastException)";
Debug.ShouldStop(262144);
act_kaladefault.mostCurrent.__c.runVoidMethod ("LogImpl","535717166",BA.ObjectToString(act_kaladefault.mostCurrent.__c.runMethod(false,"LastException",act_kaladefault.mostCurrent.activityBA)),0);
 BA.debugLineNum = 1428;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(524288);
act_kaladefault.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_kaladefault.mostCurrent.__c.runMethod(false,"LastException",act_kaladefault.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_kaladefault.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-NiceSpinner1_ItemClick"))));
 };
 BA.debugLineNum = 1430;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _numbersearch_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("NumberSearch_TextChanged (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,1647);
if (RapidSub.canDelegate("numbersearch_textchanged")) { return ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","numbersearch_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 1647;BA.debugLine="Sub NumberSearch_TextChanged (Old As String, New A";
Debug.ShouldStop(16384);
 BA.debugLineNum = 1648;BA.debugLine="If TxtSearch.Text.StartsWith(\" \") Then";
Debug.ShouldStop(32768);
if (act_kaladefault.mostCurrent._txtsearch.runMethod(true,"getText").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable(" "))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1649;BA.debugLine="TxtSearch.Text=TxtSearch.Text.SubString(1)";
Debug.ShouldStop(65536);
act_kaladefault.mostCurrent._txtsearch.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(act_kaladefault.mostCurrent._txtsearch.runMethod(true,"getText").runMethod(true,"substring",(Object)(BA.numberCast(int.class, 1)))));
 };
 BA.debugLineNum = 1651;BA.debugLine="TxtSearch.SelectionStart=TxtSearch.Text.Length";
Debug.ShouldStop(262144);
act_kaladefault.mostCurrent._txtsearch.runMethod(true,"setSelectionStart",act_kaladefault.mostCurrent._txtsearch.runMethod(true,"getText").runMethod(true,"length"));
 BA.debugLineNum = 1652;BA.debugLine="LoadKala";
Debug.ShouldStop(524288);
_loadkala();
 BA.debugLineNum = 1653;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pnl_down_click() throws Exception{
try {
		Debug.PushSubsStack("Pnl_Down_Click (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,2485);
if (RapidSub.canDelegate("pnl_down_click")) { return ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","pnl_down_click");}
RemoteObject _count = RemoteObject.createImmutable(0);
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
 BA.debugLineNum = 2485;BA.debugLine="Sub Pnl_Down_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 2486;BA.debugLine="If MCode.feeTip=0 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",act_kaladefault.mostCurrent._mcode._feetip /*RemoteObject*/ ,BA.NumberToString(0))) { 
 BA.debugLineNum = 2487;BA.debugLine="ToastMessageShow(\"لطفا تیپ قیمت را مشخص کنید\",Fa";
Debug.ShouldStop(4194304);
act_kaladefault.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("لطفا تیپ قیمت را مشخص کنید")),(Object)(act_kaladefault.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 2488;BA.debugLine="Return";
Debug.ShouldStop(8388608);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 2490;BA.debugLine="If MCode.C_Tafzili=0 Or myCode.Check_Is_Null(MCod";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",act_kaladefault.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ,BA.NumberToString(0)) || RemoteObject.solveBoolean(".",act_kaladefault.mostCurrent._mycode.runMethod(true,"_check_is_null" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(act_kaladefault.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ))) || RemoteObject.solveBoolean("=",act_kaladefault.mostCurrent._mcode._c_tafzili /*RemoteObject*/ ,BA.ObjectToString(""))) { 
 BA.debugLineNum = 2491;BA.debugLine="ToastMessageShow(\"لطفا مشتری را انتخاب کنید\",Fal";
Debug.ShouldStop(67108864);
act_kaladefault.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("لطفا مشتری را انتخاب کنید")),(Object)(act_kaladefault.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 2492;BA.debugLine="Return";
Debug.ShouldStop(134217728);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 2494;BA.debugLine="If MCode.CheckBlackList(MCode.C_Tafzili) Then";
Debug.ShouldStop(536870912);
if (act_kaladefault.mostCurrent._mcode.runMethod(true,"_checkblacklist" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(act_kaladefault.mostCurrent._mcode._c_tafzili /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2495;BA.debugLine="ToastMessageShow(\"این مشتری در لیست سیاه میباشد\"";
Debug.ShouldStop(1073741824);
act_kaladefault.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("این مشتری در لیست سیاه میباشد")),(Object)(act_kaladefault.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 2496;BA.debugLine="Return";
Debug.ShouldStop(-2147483648);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 2499;BA.debugLine="If MCode.ManedEtebarEnable=True And MCode.MandeEt";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",act_kaladefault.mostCurrent._mcode._manedetebarenable /*RemoteObject*/ ,act_kaladefault.mostCurrent.__c.getField(true,"True")) && RemoteObject.solveBoolean("=",act_kaladefault.mostCurrent._mcode._mandeetebar /*RemoteObject*/ ,BA.NumberToString(0))) { 
 BA.debugLineNum = 2500;BA.debugLine="ToastMessageShow(\"سقف اعتبار این مشتری به اتمام";
Debug.ShouldStop(8);
act_kaladefault.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("سقف اعتبار این مشتری به اتمام رسیده است.")),(Object)(act_kaladefault.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 2501;BA.debugLine="Return";
Debug.ShouldStop(16);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 2504;BA.debugLine="If MCode.ManedEtebarEnable And MCode.FinalFaktor.";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean(".",act_kaladefault.mostCurrent._mcode._manedetebarenable /*RemoteObject*/ ) && RemoteObject.solveBoolean(">",BA.numberCast(double.class, act_kaladefault.mostCurrent._mcode._finalfaktor /*RemoteObject*/ .getField(true,"GablePardakht" /*RemoteObject*/ )),BA.numberCast(double.class, act_kaladefault.mostCurrent._mcode._mandeetebar /*RemoteObject*/ ))) { 
 BA.debugLineNum = 2505;BA.debugLine="ToastMessageShow(\"جمع مبلغ سفارش از اعتبار مشتری";
Debug.ShouldStop(256);
act_kaladefault.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("جمع مبلغ سفارش از اعتبار مشتری بیشتر میباشد.")),(Object)(act_kaladefault.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 2506;BA.debugLine="Return";
Debug.ShouldStop(512);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 2513;BA.debugLine="If LblBasketCount.Visible Then";
Debug.ShouldStop(65536);
if (act_kaladefault.mostCurrent._lblbasketcount.runMethod(true,"getVisible").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2514;BA.debugLine="If MCode.EshantionTabaghati=1 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",act_kaladefault.mostCurrent._mcode._eshantiontabaghati /*RemoteObject*/ ,BA.NumberToString(1))) { 
 BA.debugLineNum = 2515;BA.debugLine="MCode.SaveUpdate(\"Delete from TblSabad where Fl";
Debug.ShouldStop(262144);
act_kaladefault.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Delete from TblSabad where FldEshantion<>'0'")));
 BA.debugLineNum = 2516;BA.debugLine="Dim count As Int=MCode.SingleResult(\"Select Cou";
Debug.ShouldStop(524288);
_count = BA.numberCast(int.class, act_kaladefault.mostCurrent._mcode.runMethod(false,"_singleresult" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Select Count(FldCodeKala) From TblSabad "))));Debug.locals.put("count", _count);Debug.locals.put("count", _count);
 BA.debugLineNum = 2517;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From";
Debug.ShouldStop(1048576);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cu = act_kaladefault.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Select * From TblSabad where FldCodeKala IN(SELECT tblEshantionTabaghati.fldCodeKalaForoosh FROM tblEshantionTabaghati)")));Debug.locals.put("Cu", _cu);Debug.locals.put("Cu", _cu);
 BA.debugLineNum = 2518;BA.debugLine="For i=0 To Cu.RowCount -1";
Debug.ShouldStop(2097152);
{
final int step26 = 1;
final int limit26 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step26 > 0 && _i <= limit26) || (step26 < 0 && _i >= limit26) ;_i = ((int)(0 + _i + step26))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 2519;BA.debugLine="Cu.Position=i";
Debug.ShouldStop(4194304);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 2521;BA.debugLine="AddEshantion(Cu)";
Debug.ShouldStop(16777216);
_addeshantion(_cu);
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 2524;BA.debugLine="StartActivity(Act_Sabad)";
Debug.ShouldStop(134217728);
act_kaladefault.mostCurrent.__c.runVoidMethod ("StartActivity",act_kaladefault.processBA,(Object)((act_kaladefault.mostCurrent._act_sabad.getObject())));
 }else {
 BA.debugLineNum = 2527;BA.debugLine="ToastMessageShow(\"سبد خرید خالی است\",False)";
Debug.ShouldStop(1073741824);
act_kaladefault.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("سبد خرید خالی است")),(Object)(act_kaladefault.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 2529;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pnltedad_click() throws Exception{
try {
		Debug.PushSubsStack("PnlTedad_Click (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,1663);
if (RapidSub.canDelegate("pnltedad_click")) { return ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","pnltedad_click");}
 BA.debugLineNum = 1663;BA.debugLine="Sub PnlTedad_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 1665;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Dim rp As RuntimePermissions";
act_kaladefault._rp = RemoteObject.createNew ("anywheresoftware.b4a.objects.RuntimePermissions");
 //BA.debugLineNum = 9;BA.debugLine="Dim FeeTip As String";
act_kaladefault._feetip = RemoteObject.createImmutable("");
 //BA.debugLineNum = 12;BA.debugLine="Dim th As Thread";
act_kaladefault._th = RemoteObject.createNew ("anywheresoftware.b4a.agraham.threading.Threading");
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _refreshcounteshantiongroup() throws Exception{
try {
		Debug.PushSubsStack("RefreshCountEshantionGroup (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,2655);
if (RapidSub.canDelegate("refreshcounteshantiongroup")) { return ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","refreshcounteshantiongroup");}
RemoteObject _count = RemoteObject.createImmutable(0);
 BA.debugLineNum = 2655;BA.debugLine="Public Sub RefreshCountEshantionGroup";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 2656;BA.debugLine="Dim Count As Int=0";
Debug.ShouldStop(-2147483648);
_count = BA.numberCast(int.class, 0);Debug.locals.put("Count", _count);Debug.locals.put("Count", _count);
 BA.debugLineNum = 2657;BA.debugLine="Count=myCode.Is_Null_adad(MCode.SingleResult(\"Sel";
Debug.ShouldStop(1);
_count = BA.numberCast(int.class, act_kaladefault.mostCurrent._mycode.runMethod(true,"_is_null_adad" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_kaladefault.mostCurrent._mcode.runMethod(false,"_singleresult" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Select Sum(fldTedadEshantion) from tblEshantionGroupTemp")))))));Debug.locals.put("Count", _count);
 BA.debugLineNum = 2658;BA.debugLine="If Count>0 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean(">",_count,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2659;BA.debugLine="LblGiftCount.Text=Count";
Debug.ShouldStop(4);
act_kaladefault.mostCurrent._lblgiftcount.runMethod(true,"setText",BA.ObjectToCharSequence(_count));
 BA.debugLineNum = 2660;BA.debugLine="LblGiftCount.Visible=True";
Debug.ShouldStop(8);
act_kaladefault.mostCurrent._lblgiftcount.runMethod(true,"setVisible",act_kaladefault.mostCurrent.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 2662;BA.debugLine="LblGiftCount.Text=0";
Debug.ShouldStop(32);
act_kaladefault.mostCurrent._lblgiftcount.runMethod(true,"setText",BA.ObjectToCharSequence(0));
 BA.debugLineNum = 2663;BA.debugLine="LblGiftCount.Visible=False";
Debug.ShouldStop(64);
act_kaladefault.mostCurrent._lblgiftcount.runMethod(true,"setVisible",act_kaladefault.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 2665;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _refreshlblsabad() throws Exception{
try {
		Debug.PushSubsStack("RefreshLblSabad (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,1004);
if (RapidSub.canDelegate("refreshlblsabad")) { return ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","refreshlblsabad");}
RemoteObject _countsabad = RemoteObject.createImmutable("");
 BA.debugLineNum = 1004;BA.debugLine="Sub RefreshLblSabad";
Debug.ShouldStop(2048);
 BA.debugLineNum = 1005;BA.debugLine="Try";
Debug.ShouldStop(4096);
try { BA.debugLineNum = 1006;BA.debugLine="Dim countSabad As String = MCode.SingleResult(\"S";
Debug.ShouldStop(8192);
_countsabad = BA.ObjectToString(act_kaladefault.mostCurrent._mcode.runMethod(false,"_singleresult" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Select Count(FldId) From TblSabad"))));Debug.locals.put("countSabad", _countsabad);Debug.locals.put("countSabad", _countsabad);
 BA.debugLineNum = 1008;BA.debugLine="If countSabad>0 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _countsabad),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1009;BA.debugLine="LblBasketCount.Visible=True";
Debug.ShouldStop(65536);
act_kaladefault.mostCurrent._lblbasketcount.runMethod(true,"setVisible",act_kaladefault.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1010;BA.debugLine="LblBasketCount.Text=countSabad";
Debug.ShouldStop(131072);
act_kaladefault.mostCurrent._lblbasketcount.runMethod(true,"setText",BA.ObjectToCharSequence(_countsabad));
 BA.debugLineNum = 1011;BA.debugLine="MCode.CreateReportSabad";
Debug.ShouldStop(262144);
act_kaladefault.mostCurrent._mcode.runVoidMethod ("_createreportsabad" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA);
 BA.debugLineNum = 1012;BA.debugLine="LblSumTakhfif.Text=\"مبلغ کل تخفیف : \"& myCode.A";
Debug.ShouldStop(524288);
act_kaladefault.mostCurrent._lblsumtakhfif.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("مبلغ کل تخفیف : "),act_kaladefault.mostCurrent._mycode.runMethod(true,"_adadtoprice" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(act_kaladefault.mostCurrent._mcode._finalfaktor /*RemoteObject*/ .getField(true,"TakhfifKol" /*RemoteObject*/ ))))));
 BA.debugLineNum = 1013;BA.debugLine="LblSumFactor.Text=\"مبلغ کل فاکتور : \"& myCode.A";
Debug.ShouldStop(1048576);
act_kaladefault.mostCurrent._lblsumfactor.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("مبلغ کل فاکتور : "),act_kaladefault.mostCurrent._mycode.runMethod(true,"_adadtoprice" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(act_kaladefault.mostCurrent._mcode._finalfaktor /*RemoteObject*/ .getField(true,"KhamFaktor" /*RemoteObject*/ ))))));
 BA.debugLineNum = 1014;BA.debugLine="LblSumKolBadAzTakhfif.Text=\"مبلغ بعد از تخفیف :";
Debug.ShouldStop(2097152);
act_kaladefault.mostCurrent._lblsumkolbadaztakhfif.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("مبلغ بعد از تخفیف : "),act_kaladefault.mostCurrent._mycode.runMethod(true,"_adadtoprice" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(act_kaladefault.mostCurrent._mcode._finalfaktor /*RemoteObject*/ .getField(true,"SumKolBadazTahkfif" /*RemoteObject*/ ))))));
 BA.debugLineNum = 1015;BA.debugLine="lblSumKhales.Text=\"مبلغ خالص : \"& myCode.AdadTo";
Debug.ShouldStop(4194304);
act_kaladefault.mostCurrent._lblsumkhales.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("مبلغ خالص : "),act_kaladefault.mostCurrent._mycode.runMethod(true,"_adadtoprice" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(act_kaladefault.mostCurrent._mcode._finalfaktor /*RemoteObject*/ .getField(true,"GablePardakht" /*RemoteObject*/ ))))));
 BA.debugLineNum = 1016;BA.debugLine="If MCode.ArzeshAfzodeEnable=1 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",act_kaladefault.mostCurrent._mcode._arzeshafzodeenable /*RemoteObject*/ ,BA.NumberToString(1))) { 
 BA.debugLineNum = 1017;BA.debugLine="lblArzeshAfzode.Text=\"مبلغ ارزش افزوده : \"& my";
Debug.ShouldStop(16777216);
act_kaladefault.mostCurrent._lblarzeshafzode.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("مبلغ ارزش افزوده : "),act_kaladefault.mostCurrent._mycode.runMethod(true,"_adadtoprice" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(act_kaladefault.mostCurrent._mcode._finalfaktor /*RemoteObject*/ .getField(true,"fldArzeshAfzode" /*RemoteObject*/ ))))));
 }else {
 BA.debugLineNum = 1019;BA.debugLine="lblArzeshAfzode.Text=\"مبلغ ارزش افزوده: 0\"";
Debug.ShouldStop(67108864);
act_kaladefault.mostCurrent._lblarzeshafzode.runMethod(true,"setText",BA.ObjectToCharSequence("مبلغ ارزش افزوده: 0"));
 };
 BA.debugLineNum = 1021;BA.debugLine="If MCode.ManedEtebarEnable Then";
Debug.ShouldStop(268435456);
if (act_kaladefault.mostCurrent._mcode._manedetebarenable /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1022;BA.debugLine="If MCode.FinalFaktor.GablePardakht> MCode.Mand";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, act_kaladefault.mostCurrent._mcode._finalfaktor /*RemoteObject*/ .getField(true,"GablePardakht" /*RemoteObject*/ )),BA.numberCast(double.class, act_kaladefault.mostCurrent._mcode._mandeetebar /*RemoteObject*/ ))) { 
 BA.debugLineNum = 1023;BA.debugLine="lblSumKhales.TextColor=Colors.Red";
Debug.ShouldStop(1073741824);
act_kaladefault.mostCurrent._lblsumkhales.runMethod(true,"setTextColor",act_kaladefault.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 1024;BA.debugLine="ToastMessageShow(\"جمع مبلغ سفارش از اعتبار مش";
Debug.ShouldStop(-2147483648);
act_kaladefault.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("جمع مبلغ سفارش از اعتبار مشتری بیشتر میباشد.")),(Object)(act_kaladefault.mostCurrent.__c.getField(true,"True")));
 }else {
 BA.debugLineNum = 1026;BA.debugLine="lblSumKhales.TextColor=Colors.White";
Debug.ShouldStop(2);
act_kaladefault.mostCurrent._lblsumkhales.runMethod(true,"setTextColor",act_kaladefault.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 };
 }else {
 BA.debugLineNum = 1029;BA.debugLine="lblSumKhales.TextColor=Colors.White";
Debug.ShouldStop(16);
act_kaladefault.mostCurrent._lblsumkhales.runMethod(true,"setTextColor",act_kaladefault.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 };
 }else {
 BA.debugLineNum = 1033;BA.debugLine="LblBasketCount.Visible=False";
Debug.ShouldStop(256);
act_kaladefault.mostCurrent._lblbasketcount.runMethod(true,"setVisible",act_kaladefault.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1034;BA.debugLine="lblArzeshAfzode.Text=\"مبلغ ارزش افزوده: 0\"";
Debug.ShouldStop(512);
act_kaladefault.mostCurrent._lblarzeshafzode.runMethod(true,"setText",BA.ObjectToCharSequence("مبلغ ارزش افزوده: 0"));
 BA.debugLineNum = 1035;BA.debugLine="LblSumTakhfif.Text=\"مبلغ کل تخفیف : 0\"";
Debug.ShouldStop(1024);
act_kaladefault.mostCurrent._lblsumtakhfif.runMethod(true,"setText",BA.ObjectToCharSequence("مبلغ کل تخفیف : 0"));
 BA.debugLineNum = 1036;BA.debugLine="LblSumFactor.Text=\"مبلغ کل فاکتور : 0\"";
Debug.ShouldStop(2048);
act_kaladefault.mostCurrent._lblsumfactor.runMethod(true,"setText",BA.ObjectToCharSequence("مبلغ کل فاکتور : 0"));
 BA.debugLineNum = 1037;BA.debugLine="lblSumKhales.Text=\"مبلغ خالص : 0\"";
Debug.ShouldStop(4096);
act_kaladefault.mostCurrent._lblsumkhales.runMethod(true,"setText",BA.ObjectToCharSequence("مبلغ خالص : 0"));
 BA.debugLineNum = 1038;BA.debugLine="LblSumKolBadAzTakhfif.Text=\"مبلغ بعد از تخفیف :";
Debug.ShouldStop(8192);
act_kaladefault.mostCurrent._lblsumkolbadaztakhfif.runMethod(true,"setText",BA.ObjectToCharSequence("مبلغ بعد از تخفیف : 0"));
 BA.debugLineNum = 1039;BA.debugLine="lblSumKhales.TextColor=Colors.White";
Debug.ShouldStop(16384);
act_kaladefault.mostCurrent._lblsumkhales.runMethod(true,"setTextColor",act_kaladefault.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 };
 BA.debugLineNum = 1041;BA.debugLine="HLV.notifyDataSetChanged";
Debug.ShouldStop(65536);
act_kaladefault.mostCurrent._hlv.runVoidMethodAndSync ("notifyDataSetChanged");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e37) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_kaladefault.processBA, e37.toString()); BA.debugLineNum = 1043;BA.debugLine="Log(LastException)";
Debug.ShouldStop(262144);
act_kaladefault.mostCurrent.__c.runVoidMethod ("LogImpl","535455015",BA.ObjectToString(act_kaladefault.mostCurrent.__c.runMethod(false,"LastException",act_kaladefault.mostCurrent.activityBA)),0);
 BA.debugLineNum = 1044;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(524288);
act_kaladefault.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_kaladefault.mostCurrent.__c.runMethod(false,"LastException",act_kaladefault.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_kaladefault.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-RefreshLblSabad"))));
 };
 BA.debugLineNum = 1046;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showlastexception() throws Exception{
try {
		Debug.PushSubsStack("ShowLastException (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,2848);
if (RapidSub.canDelegate("showlastexception")) { return ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","showlastexception");}
RemoteObject _ex = RemoteObject.createImmutable("");
RemoteObject _stripex = RemoteObject.createImmutable("");
 BA.debugLineNum = 2848;BA.debugLine="Sub ShowLastException";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 2849;BA.debugLine="Dim EX As String";
Debug.ShouldStop(1);
_ex = RemoteObject.createImmutable("");Debug.locals.put("EX", _ex);
 BA.debugLineNum = 2850;BA.debugLine="Dim stripEX As String";
Debug.ShouldStop(2);
_stripex = RemoteObject.createImmutable("");Debug.locals.put("stripEX", _stripex);
 BA.debugLineNum = 2851;BA.debugLine="EX = LastException.Message ' this is line 3";
Debug.ShouldStop(4);
_ex = act_kaladefault.mostCurrent.__c.runMethod(false,"LastException",act_kaladefault.mostCurrent.activityBA).runMethod(true,"getMessage");Debug.locals.put("EX", _ex);
 BA.debugLineNum = 2852;BA.debugLine="stripEX = EX.SubString(28)";
Debug.ShouldStop(8);
_stripex = _ex.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 28)));Debug.locals.put("stripEX", _stripex);
 BA.debugLineNum = 2853;BA.debugLine="Msgbox(stripEX, \"Login error\")";
Debug.ShouldStop(16);
act_kaladefault.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(_stripex)),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Login error"))),act_kaladefault.mostCurrent.activityBA);
 BA.debugLineNum = 2854;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _swarzeshafzodeenable_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("SwArzeshAfzodeEnable_CheckedChange (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,2982);
if (RapidSub.canDelegate("swarzeshafzodeenable_checkedchange")) { return ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","swarzeshafzodeenable_checkedchange", _checked);}
RemoteObject _countsabad = RemoteObject.createImmutable("");
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 2982;BA.debugLine="Private Sub SwArzeshAfzodeEnable_CheckedChange(Che";
Debug.ShouldStop(32);
 BA.debugLineNum = 2984;BA.debugLine="If Checked Then";
Debug.ShouldStop(128);
if (_checked.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2985;BA.debugLine="ItemSelected.fldDarsadArzeshAfzode=MCode.ArzeshA";
Debug.ShouldStop(256);
act_kaladefault.mostCurrent._itemselected.setField ("fldDarsadArzeshAfzode" /*RemoteObject*/ ,act_kaladefault.mostCurrent._mcode._arzeshafzode /*RemoteObject*/ );
 BA.debugLineNum = 2987;BA.debugLine="MCode.ArzeshAfzodeEnable=1";
Debug.ShouldStop(1024);
act_kaladefault.mostCurrent._mcode._arzeshafzodeenable /*RemoteObject*/  = BA.NumberToString(1);
 BA.debugLineNum = 2988;BA.debugLine="lblDarsadArzeshAfzode.Text=$\" ارزش افزوده: ${MCo";
Debug.ShouldStop(2048);
act_kaladefault.mostCurrent._lbldarsadarzeshafzode.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable(" ارزش افزوده: "),act_kaladefault.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((act_kaladefault.mostCurrent._mcode._arzeshafzode /*RemoteObject*/ ))),RemoteObject.createImmutable(" %")))));
 BA.debugLineNum = 2989;BA.debugLine="lblArzeshAfzode.Text=\"مبلغ ارزش افزوده: 0\"";
Debug.ShouldStop(4096);
act_kaladefault.mostCurrent._lblarzeshafzode.runMethod(true,"setText",BA.ObjectToCharSequence("مبلغ ارزش افزوده: 0"));
 }else {
 BA.debugLineNum = 2992;BA.debugLine="ItemSelected.fldDarsadArzeshAfzode=0";
Debug.ShouldStop(32768);
act_kaladefault.mostCurrent._itemselected.setField ("fldDarsadArzeshAfzode" /*RemoteObject*/ ,BA.NumberToString(0));
 BA.debugLineNum = 2993;BA.debugLine="ItemSelected.fldDarsadArzeshAfzodeKala=0";
Debug.ShouldStop(65536);
act_kaladefault.mostCurrent._itemselected.setField ("fldDarsadArzeshAfzodeKala" /*RemoteObject*/ ,BA.NumberToString(0));
 BA.debugLineNum = 2994;BA.debugLine="ItemSelected.fldArzeshAfzodeKala=0";
Debug.ShouldStop(131072);
act_kaladefault.mostCurrent._itemselected.setField ("fldArzeshAfzodeKala" /*RemoteObject*/ ,BA.NumberToString(0));
 BA.debugLineNum = 2995;BA.debugLine="MCode.ArzeshAfzodeEnable=0";
Debug.ShouldStop(262144);
act_kaladefault.mostCurrent._mcode._arzeshafzodeenable /*RemoteObject*/  = BA.NumberToString(0);
 BA.debugLineNum = 2996;BA.debugLine="lblDarsadArzeshAfzode.Text=\"ارزش افزوده: 0 %\"";
Debug.ShouldStop(524288);
act_kaladefault.mostCurrent._lbldarsadarzeshafzode.runMethod(true,"setText",BA.ObjectToCharSequence("ارزش افزوده: 0 %"));
 BA.debugLineNum = 2997;BA.debugLine="lblArzeshAfzode.Text=\"مبلغ ارزش افزوده: 0\"";
Debug.ShouldStop(1048576);
act_kaladefault.mostCurrent._lblarzeshafzode.runMethod(true,"setText",BA.ObjectToCharSequence("مبلغ ارزش افزوده: 0"));
 };
 BA.debugLineNum = 3000;BA.debugLine="Dim countSabad As String = MCode.SingleResult(\"Se";
Debug.ShouldStop(8388608);
_countsabad = BA.ObjectToString(act_kaladefault.mostCurrent._mcode.runMethod(false,"_singleresult" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Select Count(FldId) From TblSabad"))));Debug.locals.put("countSabad", _countsabad);Debug.locals.put("countSabad", _countsabad);
 BA.debugLineNum = 3001;BA.debugLine="If countSabad>0 Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _countsabad),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 3002;BA.debugLine="MCode.SaveUpdate(\"Update TblSabad Set fldDarsadA";
Debug.ShouldStop(33554432);
act_kaladefault.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update TblSabad Set fldDarsadArzeshAfzode='"),act_kaladefault.mostCurrent._itemselected.getField(true,"fldDarsadArzeshAfzode" /*RemoteObject*/ ),RemoteObject.createImmutable("'"))));
 };
 BA.debugLineNum = 3005;BA.debugLine="MCode.CreateReportSabad";
Debug.ShouldStop(268435456);
act_kaladefault.mostCurrent._mcode.runVoidMethod ("_createreportsabad" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA);
 BA.debugLineNum = 3006;BA.debugLine="RefreshLblSabad";
Debug.ShouldStop(536870912);
_refreshlblsabad();
 BA.debugLineNum = 3007;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _swgift_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("SwGift_CheckedChange (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,1902);
if (RapidSub.canDelegate("swgift_checkedchange")) { return ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","swgift_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 1902;BA.debugLine="Sub SwGift_CheckedChange(Checked As Boolean)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 1903;BA.debugLine="LoadKala";
Debug.ShouldStop(16384);
_loadkala();
 BA.debugLineNum = 1904;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _swmojoodi_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("SwMojoodi_CheckedChange (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,1910);
if (RapidSub.canDelegate("swmojoodi_checkedchange")) { return ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","swmojoodi_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 1910;BA.debugLine="Sub SwMojoodi_CheckedChange(Checked As Boolean)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 1911;BA.debugLine="LoadKala";
Debug.ShouldStop(4194304);
_loadkala();
 BA.debugLineNum = 1912;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _swpic_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("SwPic_CheckedChange (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,1914);
if (RapidSub.canDelegate("swpic_checkedchange")) { return ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","swpic_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 1914;BA.debugLine="Sub SwPic_CheckedChange(Checked As Boolean)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 1915;BA.debugLine="LoadKala";
Debug.ShouldStop(67108864);
_loadkala();
 BA.debugLineNum = 1916;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _swsearchnumber_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("SwSearchNumber_CheckedChange (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,2939);
if (RapidSub.canDelegate("swsearchnumber_checkedchange")) { return ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","swsearchnumber_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 2939;BA.debugLine="Private Sub SwSearchNumber_CheckedChange(Checked A";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 2940;BA.debugLine="If Checked Then";
Debug.ShouldStop(134217728);
if (_checked.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2941;BA.debugLine="SearchNumber=1";
Debug.ShouldStop(268435456);
act_kaladefault.mostCurrent._searchnumber = BA.NumberToString(1);
 }else {
 BA.debugLineNum = 2943;BA.debugLine="SearchNumber=0";
Debug.ShouldStop(1073741824);
act_kaladefault.mostCurrent._searchnumber = BA.NumberToString(0);
 };
 BA.debugLineNum = 2945;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _swtakhfif_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("SwTakhfif_CheckedChange (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,1906);
if (RapidSub.canDelegate("swtakhfif_checkedchange")) { return ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","swtakhfif_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 1906;BA.debugLine="Sub SwTakhfif_CheckedChange(Checked As Boolean)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 1907;BA.debugLine="LoadKala";
Debug.ShouldStop(262144);
_loadkala();
 BA.debugLineNum = 1908;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _th_ended(RemoteObject _endedok,RemoteObject _error) throws Exception{
try {
		Debug.PushSubsStack("th_Ended (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,266);
if (RapidSub.canDelegate("th_ended")) { return ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","th_ended", _endedok, _error);}
Debug.locals.put("endedOK", _endedok);
Debug.locals.put("error", _error);
 BA.debugLineNum = 266;BA.debugLine="Private Sub th_Ended(endedOK As Boolean, error As";
Debug.ShouldStop(512);
 BA.debugLineNum = 267;BA.debugLine="Log(\"th \" & endedOK)";
Debug.ShouldStop(1024);
act_kaladefault.mostCurrent.__c.runVoidMethod ("LogImpl","534471937",RemoteObject.concat(RemoteObject.createImmutable("th "),_endedok),0);
 BA.debugLineNum = 268;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _txtdarsadtakhfif_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("txtDarsadTakhfif_TextChanged (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,2863);
if (RapidSub.canDelegate("txtdarsadtakhfif_textchanged")) { return ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","txtdarsadtakhfif_textchanged", _old, _new);}
RemoteObject _no = RemoteObject.createImmutable(0L);
RemoteObject _tedadkol = RemoteObject.createImmutable("");
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 2863;BA.debugLine="Private Sub txtDarsadTakhfif_TextChanged (Old As S";
Debug.ShouldStop(16384);
 BA.debugLineNum = 2864;BA.debugLine="Try";
Debug.ShouldStop(32768);
try { BA.debugLineNum = 2865;BA.debugLine="Dim no As Long";
Debug.ShouldStop(65536);
_no = RemoteObject.createImmutable(0L);Debug.locals.put("no", _no);
 BA.debugLineNum = 2866;BA.debugLine="If MCode.ConvertNumbersPersian2English(Old) <> MCo";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("!",act_kaladefault.mostCurrent._mcode.runMethod(true,"_convertnumberspersian2english" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(_old)),act_kaladefault.mostCurrent._mcode.runMethod(true,"_convertnumberspersian2english" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(_new)))) { 
 BA.debugLineNum = 2867;BA.debugLine="Try";
Debug.ShouldStop(262144);
try { BA.debugLineNum = 2869;BA.debugLine="no = txtDarsadTakhfif.Text";
Debug.ShouldStop(1048576);
_no = BA.numberCast(long.class, act_kaladefault.mostCurrent._txtdarsadtakhfif.runMethod(true,"getText"));Debug.locals.put("no", _no);
 BA.debugLineNum = 2870;BA.debugLine="If no>100 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean(">",_no,BA.numberCast(long.class, 100))) { 
 BA.debugLineNum = 2871;BA.debugLine="no=Old";
Debug.ShouldStop(4194304);
_no = BA.numberCast(long.class, _old);Debug.locals.put("no", _no);
 };
 BA.debugLineNum = 2874;BA.debugLine="txtchanged=True";
Debug.ShouldStop(33554432);
act_kaladefault._txtchanged = act_kaladefault.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 2876;BA.debugLine="Log(no)";
Debug.ShouldStop(134217728);
act_kaladefault.mostCurrent.__c.runVoidMethod ("LogImpl","539256077",BA.NumberToString(_no),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e12) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_kaladefault.processBA, e12.toString()); BA.debugLineNum = 2881;BA.debugLine="no=0";
Debug.ShouldStop(1);
_no = BA.numberCast(long.class, 0);Debug.locals.put("no", _no);
 BA.debugLineNum = 2882;BA.debugLine="txtFee.Text=\"\"";
Debug.ShouldStop(2);
act_kaladefault.mostCurrent._txtfee.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 2883;BA.debugLine="txtDarsadTakhfif.Text=\"\"";
Debug.ShouldStop(4);
act_kaladefault.mostCurrent._txtdarsadtakhfif.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 };
 };
 BA.debugLineNum = 2886;BA.debugLine="If txtchanged Then";
Debug.ShouldStop(32);
if (act_kaladefault._txtchanged.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2887;BA.debugLine="txtchanged=False";
Debug.ShouldStop(64);
act_kaladefault._txtchanged = act_kaladefault.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 2888;BA.debugLine="txtDarsadTakhfif.Tag=no";
Debug.ShouldStop(128);
act_kaladefault.mostCurrent._txtdarsadtakhfif.runMethod(false,"setTag",(_no));
 BA.debugLineNum = 2889;BA.debugLine="txtDarsadTakhfif.Text=no";
Debug.ShouldStop(256);
act_kaladefault.mostCurrent._txtdarsadtakhfif.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_no));
 BA.debugLineNum = 2890;BA.debugLine="Dim TedadKol As String=ItemSelected.TedadDarSab";
Debug.ShouldStop(512);
_tedadkol = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, act_kaladefault.mostCurrent._itemselected.getField(true,"TedadDarSabadJoz" /*RemoteObject*/ )),(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, act_kaladefault.mostCurrent._itemselected.getField(true,"TedadDarSabadKol" /*RemoteObject*/ )),BA.numberCast(double.class, act_kaladefault.mostCurrent._itemselected.getField(true,"TedadDarKarton" /*RemoteObject*/ ))}, "*",0, 0))}, "+",1, 0));Debug.locals.put("TedadKol", _tedadkol);Debug.locals.put("TedadKol", _tedadkol);
 BA.debugLineNum = 2891;BA.debugLine="If no>0 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean(">",_no,BA.numberCast(long.class, 0))) { 
 BA.debugLineNum = 2892;BA.debugLine="If TedadKol> 0 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _tedadkol),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2893;BA.debugLine="txtFee.Text=(((ItemSelected.FeeForoosh*TedadK";
Debug.ShouldStop(4096);
act_kaladefault.mostCurrent._txtfee.runMethodAndSync(true,"setText",BA.ObjectToCharSequence((RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {act_kaladefault.mostCurrent._itemselected.getField(true,"FeeForoosh" /*RemoteObject*/ ),BA.numberCast(double.class, _tedadkol)}, "*",0, 0)),_no}, "*",0, 0)),RemoteObject.createImmutable(100)}, "/",0, 0))));
 }else {
 BA.debugLineNum = 2895;BA.debugLine="txtFee.Text=(((ItemSelected.FeeForoosh)*no)/1";
Debug.ShouldStop(16384);
act_kaladefault.mostCurrent._txtfee.runMethodAndSync(true,"setText",BA.ObjectToCharSequence((RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {(act_kaladefault.mostCurrent._itemselected.getField(true,"FeeForoosh" /*RemoteObject*/ )),_no}, "*",0, 2)),RemoteObject.createImmutable(100)}, "/",0, 0))));
 };
 }else {
 BA.debugLineNum = 2899;BA.debugLine="txtFee.Text=no";
Debug.ShouldStop(262144);
act_kaladefault.mostCurrent._txtfee.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_no));
 };
 };
 BA.debugLineNum = 2902;BA.debugLine="txtDarsadTakhfif.SelectionStart=txtDarsadTakhfif.T";
Debug.ShouldStop(2097152);
act_kaladefault.mostCurrent._txtdarsadtakhfif.runMethod(true,"setSelectionStart",act_kaladefault.mostCurrent._txtdarsadtakhfif.runMethod(true,"getText").runMethod(true,"length"));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e34) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_kaladefault.processBA, e34.toString()); BA.debugLineNum = 2904;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8388608);
act_kaladefault.mostCurrent.__c.runVoidMethod ("LogImpl","539256105",BA.ObjectToString(act_kaladefault.mostCurrent.__c.runMethod(false,"LastException",act_kaladefault.mostCurrent.activityBA)),0);
 BA.debugLineNum = 2905;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-tx";
Debug.ShouldStop(16777216);
act_kaladefault.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_kaladefault.mostCurrent.__c.runMethod(false,"LastException",act_kaladefault.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_kaladefault.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-txtDarsadTakhfif_TextChanged"))));
 };
 BA.debugLineNum = 2907;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _txtfee_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("txtFee_TextChanged (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,2077);
if (RapidSub.canDelegate("txtfee_textchanged")) { return ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","txtfee_textchanged", _old, _new);}
RemoteObject _no = RemoteObject.createImmutable(0L);
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 2077;BA.debugLine="Private Sub txtFee_TextChanged (Old As String, New";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 2078;BA.debugLine="Try";
Debug.ShouldStop(536870912);
try { BA.debugLineNum = 2079;BA.debugLine="Dim no As Long";
Debug.ShouldStop(1073741824);
_no = RemoteObject.createImmutable(0L);Debug.locals.put("no", _no);
 BA.debugLineNum = 2080;BA.debugLine="If MCode.ConvertNumbersPersian2English(Old) <> M";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("!",act_kaladefault.mostCurrent._mcode.runMethod(true,"_convertnumberspersian2english" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(_old)),act_kaladefault.mostCurrent._mcode.runMethod(true,"_convertnumberspersian2english" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(_new)))) { 
 BA.debugLineNum = 2081;BA.debugLine="Try";
Debug.ShouldStop(1);
try { BA.debugLineNum = 2082;BA.debugLine="no = txtFee.Text.Replace(\",\",\"\")";
Debug.ShouldStop(2);
_no = BA.numberCast(long.class, act_kaladefault.mostCurrent._txtfee.runMethod(true,"getText").runMethod(true,"replace",(Object)(BA.ObjectToString(",")),(Object)(RemoteObject.createImmutable(""))));Debug.locals.put("no", _no);
 BA.debugLineNum = 2083;BA.debugLine="txtchanged=True";
Debug.ShouldStop(4);
act_kaladefault._txtchanged = act_kaladefault.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 2084;BA.debugLine="Log(no)";
Debug.ShouldStop(8);
act_kaladefault.mostCurrent.__c.runVoidMethod ("LogImpl","537814279",BA.NumberToString(_no),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e9) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_kaladefault.processBA, e9.toString()); BA.debugLineNum = 2086;BA.debugLine="no=0";
Debug.ShouldStop(32);
_no = BA.numberCast(long.class, 0);Debug.locals.put("no", _no);
 BA.debugLineNum = 2087;BA.debugLine="txtFee.Text=\"\"";
Debug.ShouldStop(64);
act_kaladefault.mostCurrent._txtfee.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 2088;BA.debugLine="If FeeType=\"btn_discount_Click\" Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",act_kaladefault.mostCurrent._feetype,BA.ObjectToString("btn_discount_Click"))) { 
 BA.debugLineNum = 2089;BA.debugLine="txtDarsadTakhfif.Text=\"\"";
Debug.ShouldStop(256);
act_kaladefault.mostCurrent._txtdarsadtakhfif.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 };
 };
 };
 BA.debugLineNum = 2093;BA.debugLine="If txtchanged Then";
Debug.ShouldStop(4096);
if (act_kaladefault._txtchanged.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2094;BA.debugLine="txtchanged=False";
Debug.ShouldStop(8192);
act_kaladefault._txtchanged = act_kaladefault.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 2095;BA.debugLine="txtFee.Tag=no";
Debug.ShouldStop(16384);
act_kaladefault.mostCurrent._txtfee.runMethod(false,"setTag",(_no));
 BA.debugLineNum = 2096;BA.debugLine="txtFee.Text=NumberFormat2(no,0,0,0,True)";
Debug.ShouldStop(32768);
act_kaladefault.mostCurrent._txtfee.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(act_kaladefault.mostCurrent.__c.runMethod(true,"NumberFormat2",(Object)(BA.numberCast(double.class, _no)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(act_kaladefault.mostCurrent.__c.getField(true,"True")))));
 };
 BA.debugLineNum = 2098;BA.debugLine="txtFee.SetSelection(txtFee.Text.Length,0)";
Debug.ShouldStop(131072);
act_kaladefault.mostCurrent._txtfee.runVoidMethod ("SetSelection",(Object)(act_kaladefault.mostCurrent._txtfee.runMethod(true,"getText").runMethod(true,"length")),(Object)(BA.numberCast(int.class, 0)));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e23) {
			BA.rdebugUtils.runVoidMethod("setLastException",act_kaladefault.processBA, e23.toString()); BA.debugLineNum = 2100;BA.debugLine="Log(LastException)";
Debug.ShouldStop(524288);
act_kaladefault.mostCurrent.__c.runVoidMethod ("LogImpl","537814295",BA.ObjectToString(act_kaladefault.mostCurrent.__c.runMethod(false,"LastException",act_kaladefault.mostCurrent.activityBA)),0);
 BA.debugLineNum = 2101;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
Debug.ShouldStop(1048576);
act_kaladefault.mostCurrent._mycode.runVoidMethod ("_senderror" /*void*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(BA.ObjectToString(act_kaladefault.mostCurrent.__c.runMethod(false,"LastException",act_kaladefault.mostCurrent.activityBA))),(Object)(RemoteObject.concat(act_kaladefault.mostCurrent._activity.runMethod(false,"getTitle"),RemoteObject.createImmutable("-txtFee_TextChanged"))));
 };
 BA.debugLineNum = 2103;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _txtsearch_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("TxtSearch_TextChanged (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,1669);
if (RapidSub.canDelegate("txtsearch_textchanged")) { return ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","txtsearch_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 1669;BA.debugLine="Sub TxtSearch_TextChanged (Old As String, New As S";
Debug.ShouldStop(16);
 BA.debugLineNum = 1671;BA.debugLine="If IsNumber(New) And SearchNumber=0 Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean(".",act_kaladefault.mostCurrent.__c.runMethod(true,"IsNumber",(Object)(_new))) && RemoteObject.solveBoolean("=",act_kaladefault.mostCurrent._searchnumber,BA.NumberToString(0))) { 
 BA.debugLineNum = 1672;BA.debugLine="New=MCode.ConvertNumbersPersian2English(New)";
Debug.ShouldStop(128);
_new = act_kaladefault.mostCurrent._mcode.runMethod(true,"_convertnumberspersian2english" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(_new));Debug.locals.put("New", _new);
 BA.debugLineNum = 1673;BA.debugLine="ListKalaTxt = Utils.FilterSearchList(\"CodeKala\",";
Debug.ShouldStop(256);
act_kaladefault.mostCurrent._listkalatxt = act_kaladefault.mostCurrent._utils.runMethod(false,"FilterSearchList",(Object)(BA.ObjectToString("CodeKala")),(Object)(act_kaladefault.mostCurrent._orginallistkala)).runMethod(false,"Contains",(Object)(_new));
 }else 
{ BA.debugLineNum = 1674;BA.debugLine="else If IsNumber(New) And SearchNumber=1 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean(".",act_kaladefault.mostCurrent.__c.runMethod(true,"IsNumber",(Object)(_new))) && RemoteObject.solveBoolean("=",act_kaladefault.mostCurrent._searchnumber,BA.NumberToString(1))) { 
 BA.debugLineNum = 1675;BA.debugLine="New=MCode.ConvertNumbersPersian2English(New)";
Debug.ShouldStop(1024);
_new = act_kaladefault.mostCurrent._mcode.runMethod(true,"_convertnumberspersian2english" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(_new));Debug.locals.put("New", _new);
 BA.debugLineNum = 1676;BA.debugLine="ListKalaTxt = Utils.FilterSearchList(\"NameKala\",";
Debug.ShouldStop(2048);
act_kaladefault.mostCurrent._listkalatxt = act_kaladefault.mostCurrent._utils.runMethod(false,"FilterSearchList",(Object)(BA.ObjectToString("NameKala")),(Object)(act_kaladefault.mostCurrent._orginallistkala)).runMethod(false,"Contains",(Object)(_new));
 }else {
 BA.debugLineNum = 1678;BA.debugLine="ListKalaTxt = Utils.FilterSearchList(\"NameKala\",";
Debug.ShouldStop(8192);
act_kaladefault.mostCurrent._listkalatxt = act_kaladefault.mostCurrent._utils.runMethod(false,"FilterSearchList",(Object)(BA.ObjectToString("NameKala")),(Object)(act_kaladefault.mostCurrent._orginallistkala)).runMethod(false,"Contains",(Object)(_new));
 }}
;
 BA.debugLineNum = 1680;BA.debugLine="HLV.ScrollToPosition(0)";
Debug.ShouldStop(32768);
act_kaladefault.mostCurrent._hlv.runVoidMethod ("ScrollToPosition",(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 1681;BA.debugLine="HLV.notifyDataSetChanged";
Debug.ShouldStop(65536);
act_kaladefault.mostCurrent._hlv.runVoidMethodAndSync ("notifyDataSetChanged");
 BA.debugLineNum = 1701;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _updatefee() throws Exception{
try {
		Debug.PushSubsStack("UpdateFee (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,1991);
if (RapidSub.canDelegate("updatefee")) { ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","updatefee"); return;}
ResumableSub_UpdateFee rsub = new ResumableSub_UpdateFee(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_UpdateFee extends BA.ResumableSub {
public ResumableSub_UpdateFee(ir.parsikhesab.pakhsh.act_kaladefault parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.act_kaladefault parent;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("UpdateFee (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,1991);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 BA.debugLineNum = 2000;BA.debugLine="Log(\"UpdateFee Offline\")";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","537617673",RemoteObject.createImmutable("UpdateFee Offline"),0);
 BA.debugLineNum = 2001;BA.debugLine="UpdateFeeOffline";
Debug.ShouldStop(65536);
_updatefeeoffline();
 BA.debugLineNum = 2004;BA.debugLine="Sleep(200)";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("Sleep",act_kaladefault.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "act_kaladefault", "updatefee"),BA.numberCast(int.class, 200));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 BA.debugLineNum = 2007;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _updatefeeoffline() throws Exception{
try {
		Debug.PushSubsStack("UpdateFeeOffline (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,2012);
if (RapidSub.canDelegate("updatefeeoffline")) { return ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","updatefeeoffline");}
RemoteObject _cu = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
 BA.debugLineNum = 2012;BA.debugLine="Sub UpdateFeeOffline";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 2013;BA.debugLine="If IsNumber(MCode.feeCode) And MCode.feeCode>0 Th";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean(".",act_kaladefault.mostCurrent.__c.runMethod(true,"IsNumber",(Object)(act_kaladefault.mostCurrent._mcode._feecode /*RemoteObject*/ ))) && RemoteObject.solveBoolean(">",BA.numberCast(double.class, act_kaladefault.mostCurrent._mcode._feecode /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2014;BA.debugLine="Dim cu As Cursor";
Debug.ShouldStop(536870912);
_cu = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("cu", _cu);
 BA.debugLineNum = 2015;BA.debugLine="cu=MCode.Result(\"select * from TblFee where FldC";
Debug.ShouldStop(1073741824);
_cu = act_kaladefault.mostCurrent._mcode.runMethod(false,"_result" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("select * from TblFee where FldCodeTasvie="),act_kaladefault.mostCurrent._mcode._feecode /*RemoteObject*/ )));Debug.locals.put("cu", _cu);
 BA.debugLineNum = 2016;BA.debugLine="If cu.RowCount>0 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean(">",_cu.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2017;BA.debugLine="For i=0 To cu.RowCount-1";
Debug.ShouldStop(1);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {_cu.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 2018;BA.debugLine="cu.Position=i";
Debug.ShouldStop(2);
_cu.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 2019;BA.debugLine="Log(\"FldCodeKala:\"& cu.GetString(\"FldCodeKala\"";
Debug.ShouldStop(4);
act_kaladefault.mostCurrent.__c.runVoidMethod ("LogImpl","537683207",RemoteObject.concat(RemoteObject.createImmutable("FldCodeKala:"),_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldCodeKala")))),0);
 BA.debugLineNum = 2020;BA.debugLine="Log(\"fldFeeTasvie:\"& cu.GetString(\"FldFee\"))";
Debug.ShouldStop(8);
act_kaladefault.mostCurrent.__c.runVoidMethod ("LogImpl","537683208",RemoteObject.concat(RemoteObject.createImmutable("fldFeeTasvie:"),_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldFee")))),0);
 BA.debugLineNum = 2021;BA.debugLine="MCode.SaveUpdate(\"Update TblKala Set fldFeeTas";
Debug.ShouldStop(16);
act_kaladefault.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update TblKala Set fldFeeTasvie='"),_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldFee"))),RemoteObject.createImmutable("'"),RemoteObject.createImmutable(" where fldCodeKala="),_cu.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("FldCodeKala"))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2024;BA.debugLine="LoadKala";
Debug.ShouldStop(128);
_loadkala();
 };
 };
 BA.debugLineNum = 2027;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _upeshantion(RemoteObject _codegroup,RemoteObject _minas) throws Exception{
try {
		Debug.PushSubsStack("UpEshantion (act_kaladefault) ","act_kaladefault",17,act_kaladefault.mostCurrent.activityBA,act_kaladefault.mostCurrent,2667);
if (RapidSub.canDelegate("upeshantion")) { return ir.parsikhesab.pakhsh.act_kaladefault.remoteMe.runUserSub(false, "act_kaladefault","upeshantion", _codegroup, _minas);}
RemoteObject _item = RemoteObject.declareNull("ir.parsikhesab.pakhsh.mcode._adapterlisteshantiongroup");
Debug.locals.put("CodeGroup", _codegroup);
Debug.locals.put("minas", _minas);
 BA.debugLineNum = 2667;BA.debugLine="Public Sub UpEshantion(CodeGroup As String,minas A";
Debug.ShouldStop(1024);
 BA.debugLineNum = 2669;BA.debugLine="Dim Item As AdapterListEshantionGroup=CheckGroupE";
Debug.ShouldStop(4096);
_item = _checkgroupeshantation(_codegroup);Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 2670;BA.debugLine="If Item.fldTedadEshantion>0 Or Item.fldTedadEshan";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _item.getField(true,"fldTedadEshantion" /*RemoteObject*/ )),BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean("=",_item.getField(true,"fldTedadEshantion" /*RemoteObject*/ ),BA.NumberToString(_minas))) { 
 BA.debugLineNum = 2671;BA.debugLine="minas=minas-1";
Debug.ShouldStop(16384);
_minas = RemoteObject.solve(new RemoteObject[] {_minas,RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("minas", _minas);
 BA.debugLineNum = 2672;BA.debugLine="MCode.SaveUpdate(\"Update tblEshantionGroupTemp S";
Debug.ShouldStop(32768);
act_kaladefault.mostCurrent._mcode.runVoidMethod ("_saveupdate" /*RemoteObject*/ ,act_kaladefault.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Update tblEshantionGroupTemp Set fldTedadEshantion="),_minas,RemoteObject.createImmutable(" where fldCodeGroupKalaEshantion="),_codegroup)));
 BA.debugLineNum = 2674;BA.debugLine="RefreshCountEshantionGroup";
Debug.ShouldStop(131072);
_refreshcounteshantiongroup();
 };
 BA.debugLineNum = 2679;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}