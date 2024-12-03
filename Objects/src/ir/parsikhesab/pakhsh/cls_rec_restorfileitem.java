package ir.parsikhesab.pakhsh;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class cls_rec_restorfileitem extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "ir.parsikhesab.pakhsh.cls_rec_restorfileitem");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", ir.parsikhesab.pakhsh.cls_rec_restorfileitem.class).invoke(this, new Object[] {null});
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
public Object _base = null;
public anywheresoftware.b4a.objects.IME _key = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblnamefile = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbldate = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltime = null;
public ir.parsikhesab.pakhsh.mcode._adapterlistbackupfile _item = null;
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
public String  _show(ir.parsikhesab.pakhsh.cls_rec_restorfileitem __ref,ir.parsikhesab.pakhsh.mcode._adapterlistbackupfile _item1,int _position) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_rec_restorfileitem";
if (Debug.shouldDelegate(ba, "show", false))
	 {return ((String) Debug.delegate(ba, "show", new Object[] {_item1,_position}));}
RDebugUtils.currentLine=99155968;
 //BA.debugLineNum = 99155968;BA.debugLine="Public Sub Show(Item1 As AdapterListBackupFile,pos";
RDebugUtils.currentLine=99155969;
 //BA.debugLineNum = 99155969;BA.debugLine="item=Item1";
__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistbackupfile*/  = _item1;
RDebugUtils.currentLine=99155970;
 //BA.debugLineNum = 99155970;BA.debugLine="lblNameFile.Text=\"نام فایل: \"&Item1.FileName";
__ref._lblnamefile /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("نام فایل: "+_item1.FileName /*String*/ ));
RDebugUtils.currentLine=99155971;
 //BA.debugLineNum = 99155971;BA.debugLine="lblDate.Text=\"تاریخ: \"& Item1.Date";
__ref._lbldate /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("تاریخ: "+_item1.Date /*String*/ ));
RDebugUtils.currentLine=99155972;
 //BA.debugLineNum = 99155972;BA.debugLine="lblTime.Text=\"ساعت: \"&Item1.Time";
__ref._lbltime /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("ساعت: "+_item1.Time /*String*/ ));
RDebugUtils.currentLine=99155973;
 //BA.debugLineNum = 99155973;BA.debugLine="End Sub";
return "";
}
public int  _getheight(ir.parsikhesab.pakhsh.cls_rec_restorfileitem __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_rec_restorfileitem";
if (Debug.shouldDelegate(ba, "getheight", false))
	 {return ((Integer) Debug.delegate(ba, "getheight", null));}
RDebugUtils.currentLine=99221504;
 //BA.debugLineNum = 99221504;BA.debugLine="Public Sub getHeight As Int";
RDebugUtils.currentLine=99221505;
 //BA.debugLineNum = 99221505;BA.debugLine="Return pnl_bk.Height";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight();
RDebugUtils.currentLine=99221506;
 //BA.debugLineNum = 99221506;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(ir.parsikhesab.pakhsh.cls_rec_restorfileitem __ref,anywheresoftware.b4a.BA _ba,Object _mdl) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cls_rec_restorfileitem";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_mdl}));}
RDebugUtils.currentLine=99090432;
 //BA.debugLineNum = 99090432;BA.debugLine="Public Sub Initialize(mdl As Object)";
RDebugUtils.currentLine=99090433;
 //BA.debugLineNum = 99090433;BA.debugLine="Try";
try {RDebugUtils.currentLine=99090434;
 //BA.debugLineNum = 99090434;BA.debugLine="base = mdl";
__ref._base /*Object*/  = _mdl;
RDebugUtils.currentLine=99090435;
 //BA.debugLineNum = 99090435;BA.debugLine="Key.Initialize(\"Key\")";
__ref._key /*anywheresoftware.b4a.objects.IME*/ .Initialize("Key");
RDebugUtils.currentLine=99090436;
 //BA.debugLineNum = 99090436;BA.debugLine="p.Initialize(\"\")";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=99090437;
 //BA.debugLineNum = 99090437;BA.debugLine="p.SetLayout(0,0,100%x,100%y)";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .SetLayout((int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
RDebugUtils.currentLine=99090438;
 //BA.debugLineNum = 99090438;BA.debugLine="p.LoadLayout(\"l_ClsRecBackupitem\")";
__ref._p /*anywheresoftware.b4a.objects.PanelWrapper*/ .LoadLayout("l_ClsRecBackupitem",ba);
 } 
       catch (Exception e8) {
			ba.setLastException(e8);RDebugUtils.currentLine=99090443;
 //BA.debugLineNum = 99090443;BA.debugLine="MCode.SendError(LastException)";
_mcode._senderror /*String*/ (ba,BA.ObjectToString(__c.LastException(ba)));
RDebugUtils.currentLine=99090444;
 //BA.debugLineNum = 99090444;BA.debugLine="Log(LastException)";
__c.LogImpl("599090444",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=99090446;
 //BA.debugLineNum = 99090446;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _getpanel(ir.parsikhesab.pakhsh.cls_rec_restorfileitem __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_rec_restorfileitem";
if (Debug.shouldDelegate(ba, "getpanel", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "getpanel", null));}
RDebugUtils.currentLine=99287040;
 //BA.debugLineNum = 99287040;BA.debugLine="Public Sub getPanel As Panel";
RDebugUtils.currentLine=99287041;
 //BA.debugLineNum = 99287041;BA.debugLine="pnl_bk.RemoveView";
__ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ .RemoveView();
RDebugUtils.currentLine=99287042;
 //BA.debugLineNum = 99287042;BA.debugLine="Return pnl_bk";
if (true) return __ref._pnl_bk /*anywheresoftware.b4a.objects.PanelWrapper*/ ;
RDebugUtils.currentLine=99287043;
 //BA.debugLineNum = 99287043;BA.debugLine="End Sub";
return null;
}
public void  _btnrestore_click(ir.parsikhesab.pakhsh.cls_rec_restorfileitem __ref) throws Exception{
RDebugUtils.currentModule="cls_rec_restorfileitem";
if (Debug.shouldDelegate(ba, "btnrestore_click", false))
	 {Debug.delegate(ba, "btnrestore_click", null); return;}
ResumableSub_btnRestore_Click rsub = new ResumableSub_btnRestore_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnRestore_Click extends BA.ResumableSub {
public ResumableSub_btnRestore_Click(ir.parsikhesab.pakhsh.cls_rec_restorfileitem parent,ir.parsikhesab.pakhsh.cls_rec_restorfileitem __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
ir.parsikhesab.pakhsh.cls_rec_restorfileitem __ref;
ir.parsikhesab.pakhsh.cls_rec_restorfileitem parent;
int _result = 0;
String _restorefile = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cls_rec_restorfileitem";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=99352577;
 //BA.debugLineNum = 99352577;BA.debugLine="Log(item.FileName)";
parent.__c.LogImpl("599352577",__ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistbackupfile*/ .FileName /*String*/ ,0);
RDebugUtils.currentLine=99352578;
 //BA.debugLineNum = 99352578;BA.debugLine="Msgbox2Async(\"\" & CRLF & \"آیا از اطلاعات فعلی فای";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence(""+parent.__c.CRLF+"آیا از اطلاعات فعلی فایل نسخه پیشتیبانی گرفته شود؟"),BA.ObjectToCharSequence("توجه"),"بله","انصراف","خیر",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(parent.__c.Null)),ba,parent.__c.False);
RDebugUtils.currentLine=99352579;
 //BA.debugLineNum = 99352579;BA.debugLine="Wait For Msgbox_Result(Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cls_rec_restorfileitem", "btnrestore_click"), null);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=99352580;
 //BA.debugLineNum = 99352580;BA.debugLine="Dim RestoreFile As String=item.FileName&\".db\"";
_restorefile = __ref._item /*ir.parsikhesab.pakhsh.mcode._adapterlistbackupfile*/ .FileName /*String*/ +".db";
RDebugUtils.currentLine=99352581;
 //BA.debugLineNum = 99352581;BA.debugLine="If Result=DialogResponse.POSITIVE Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_result==parent.__c.DialogResponse.POSITIVE) { 
this.state = 3;
}else 
{RDebugUtils.currentLine=99352590;
 //BA.debugLineNum = 99352590;BA.debugLine="Else If Result=DialogResponse.NEGATIVE Then";
if (_result==parent.__c.DialogResponse.NEGATIVE) { 
this.state = 5;
}}
if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=99352582;
 //BA.debugLineNum = 99352582;BA.debugLine="MCode.CreateBK(\"\")";
parent._mcode._createbk /*void*/ (ba,"");
RDebugUtils.currentLine=99352583;
 //BA.debugLineNum = 99352583;BA.debugLine="File.Delete(File.DirDefaultExternal &\"/Parsik\",\"";
parent.__c.File.Delete(parent.__c.File.getDirDefaultExternal()+"/Parsik","parsik_db.db");
RDebugUtils.currentLine=99352585;
 //BA.debugLineNum = 99352585;BA.debugLine="File.Copy(File.DirDefaultExternal &\"/Parsik/Back";
parent.__c.File.Copy(parent.__c.File.getDirDefaultExternal()+"/Parsik/Backup",_restorefile,parent.__c.File.getDirDefaultExternal()+"/Parsik","parsik_db.db");
RDebugUtils.currentLine=99352586;
 //BA.debugLineNum = 99352586;BA.debugLine="ToastMessageShow(\"فایل پشتیبانی با موفقیت بازیاب";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("فایل پشتیبانی با موفقیت بازیابی شد"),parent.__c.False);
RDebugUtils.currentLine=99352588;
 //BA.debugLineNum = 99352588;BA.debugLine="MCode.Sql1.Close";
parent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=99352589;
 //BA.debugLineNum = 99352589;BA.debugLine="StartActivity(Main)";
parent.__c.StartActivity(ba,(Object)(parent._main.getObject()));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=99352592;
 //BA.debugLineNum = 99352592;BA.debugLine="File.Delete(File.DirDefaultExternal &\"/Parsik\",\"";
parent.__c.File.Delete(parent.__c.File.getDirDefaultExternal()+"/Parsik","parsik_db.db");
RDebugUtils.currentLine=99352594;
 //BA.debugLineNum = 99352594;BA.debugLine="File.Copy(File.DirDefaultExternal &\"/Parsik/Back";
parent.__c.File.Copy(parent.__c.File.getDirDefaultExternal()+"/Parsik/Backup",_restorefile,parent.__c.File.getDirDefaultExternal()+"/Parsik","parsik_db.db");
RDebugUtils.currentLine=99352595;
 //BA.debugLineNum = 99352595;BA.debugLine="ToastMessageShow(\"فایل پشتیبانی با موفقیت بازیاب";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("فایل پشتیبانی با موفقیت بازیابی شد"),parent.__c.False);
RDebugUtils.currentLine=99352597;
 //BA.debugLineNum = 99352597;BA.debugLine="MCode.Sql1.Close";
parent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=99352598;
 //BA.debugLineNum = 99352598;BA.debugLine="CallSubDelayed(Act_Restore,\"btn_Back_Click\")";
parent.__c.CallSubDelayed(ba,(Object)(parent._act_restore.getObject()),"btn_Back_Click");
RDebugUtils.currentLine=99352599;
 //BA.debugLineNum = 99352599;BA.debugLine="StartActivity(Main)";
parent.__c.StartActivity(ba,(Object)(parent._main.getObject()));
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=99352602;
 //BA.debugLineNum = 99352602;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _btnshare_click(ir.parsikhesab.pakhsh.cls_rec_restorfileitem __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_rec_restorfileitem";
if (Debug.shouldDelegate(ba, "btnshare_click", false))
	 {return ((String) Debug.delegate(ba, "btnshare_click", null));}
RDebugUtils.currentLine=99418112;
 //BA.debugLineNum = 99418112;BA.debugLine="Private Sub btnShare_Click";
RDebugUtils.currentLine=99418113;
 //BA.debugLineNum = 99418113;BA.debugLine="Try";
try { } 
       catch (Exception e3) {
			ba.setLastException(e3);RDebugUtils.currentLine=99418138;
 //BA.debugLineNum = 99418138;BA.debugLine="Log(LastException)";
__c.LogImpl("599418138",BA.ObjectToString(__c.LastException(ba)),0);
RDebugUtils.currentLine=99418139;
 //BA.debugLineNum = 99418139;BA.debugLine="ToastMessageShow(\"برنامه ای جهت اشتراک گذاری یاف";
__c.ToastMessageShow(BA.ObjectToCharSequence("برنامه ای جهت اشتراک گذاری یافت نشد"),__c.True);
 };
RDebugUtils.currentLine=99418141;
 //BA.debugLineNum = 99418141;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(ir.parsikhesab.pakhsh.cls_rec_restorfileitem __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_rec_restorfileitem";
RDebugUtils.currentLine=99024896;
 //BA.debugLineNum = 99024896;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=99024897;
 //BA.debugLineNum = 99024897;BA.debugLine="Private p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=99024898;
 //BA.debugLineNum = 99024898;BA.debugLine="Private pnl_bk As Panel";
_pnl_bk = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=99024899;
 //BA.debugLineNum = 99024899;BA.debugLine="Private base As Object";
_base = new Object();
RDebugUtils.currentLine=99024900;
 //BA.debugLineNum = 99024900;BA.debugLine="Private Key As IME";
_key = new anywheresoftware.b4a.objects.IME();
RDebugUtils.currentLine=99024901;
 //BA.debugLineNum = 99024901;BA.debugLine="Private lblNameFile As Label";
_lblnamefile = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=99024902;
 //BA.debugLineNum = 99024902;BA.debugLine="Private lblDate As Label";
_lbldate = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=99024903;
 //BA.debugLineNum = 99024903;BA.debugLine="Private lblTime As Label";
_lbltime = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=99024904;
 //BA.debugLineNum = 99024904;BA.debugLine="Dim item As AdapterListBackupFile";
_item = new ir.parsikhesab.pakhsh.mcode._adapterlistbackupfile();
RDebugUtils.currentLine=99024906;
 //BA.debugLineNum = 99024906;BA.debugLine="End Sub";
return "";
}
public String  _zip_finish(ir.parsikhesab.pakhsh.cls_rec_restorfileitem __ref,boolean _success) throws Exception{
__ref = this;
RDebugUtils.currentModule="cls_rec_restorfileitem";
if (Debug.shouldDelegate(ba, "zip_finish", false))
	 {return ((String) Debug.delegate(ba, "zip_finish", new Object[] {_success}));}
RDebugUtils.currentLine=99483648;
 //BA.debugLineNum = 99483648;BA.debugLine="Private Sub zip_finish (Success As Boolean)";
RDebugUtils.currentLine=99483649;
 //BA.debugLineNum = 99483649;BA.debugLine="Log(Success)";
__c.LogImpl("599483649",BA.ObjectToString(_success),0);
RDebugUtils.currentLine=99483650;
 //BA.debugLineNum = 99483650;BA.debugLine="End Sub";
return "";
}
}