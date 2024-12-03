package ir.parsikhesab.pakhsh;

import android.os.StrictMode;

import anywheresoftware.b4a.B4AMenuItem;
import android.app.Activity;
import android.os.Bundle;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.B4AActivity;
import anywheresoftware.b4a.ObjectWrapper;
import anywheresoftware.b4a.objects.ActivityWrapper;
import java.lang.reflect.InvocationTargetException;
import anywheresoftware.b4a.B4AUncaughtException;
import anywheresoftware.b4a.debug.*;
import java.lang.ref.WeakReference;

public class act_printpic extends Activity implements B4AActivity{
	public static act_printpic mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = false;
	public static final boolean includeTitle = false;
    public static WeakReference<Activity> previousOne;
    public static boolean dontPause;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        mostCurrent = this;
		if (processBA == null) {
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.act_printpic");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (act_printpic).");
				p.finish();
			}
		}
        processBA.setActivityPaused(true);
        processBA.runHook("oncreate", this, null);
		if (!includeTitle) {
        	this.getWindow().requestFeature(android.view.Window.FEATURE_NO_TITLE);
        }
        if (fullScreen) {
        	getWindow().setFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN,   
        			android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
		
        processBA.sharedProcessBA.activityBA = null;
		layout = new BALayout(this);
		setContentView(layout);
		afterFirstLayout = false;
        WaitForLayout wl = new WaitForLayout();
        if (anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startFromActivity(this, processBA, wl, false))
		    BA.handler.postDelayed(wl, 5);

	}
	static class WaitForLayout implements Runnable {
		public void run() {
			if (afterFirstLayout)
				return;
			if (mostCurrent == null)
				return;
            
			if (mostCurrent.layout.getWidth() == 0) {
				BA.handler.postDelayed(this, 5);
				return;
			}
			mostCurrent.layout.getLayoutParams().height = mostCurrent.layout.getHeight();
			mostCurrent.layout.getLayoutParams().width = mostCurrent.layout.getWidth();
			afterFirstLayout = true;
			mostCurrent.afterFirstLayout();
		}
	}
	private void afterFirstLayout() {
        if (this != mostCurrent)
			return;
		activityBA = new BA(this, layout, processBA, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.act_printpic");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "ir.parsikhesab.pakhsh.act_printpic", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (act_printpic) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (act_printpic) Resume **");
        processBA.raiseEvent(null, "activity_resume");
        if (android.os.Build.VERSION.SDK_INT >= 11) {
			try {
				android.app.Activity.class.getMethod("invalidateOptionsMenu").invoke(this,(Object[]) null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	public void addMenuItem(B4AMenuItem item) {
		if (menuItems == null)
			menuItems = new java.util.ArrayList<B4AMenuItem>();
		menuItems.add(item);
	}
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		super.onCreateOptionsMenu(menu);
        try {
            if (processBA.subExists("activity_actionbarhomeclick")) {
                Class.forName("android.app.ActionBar").getMethod("setHomeButtonEnabled", boolean.class).invoke(
                    getClass().getMethod("getActionBar").invoke(this), true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (processBA.runHook("oncreateoptionsmenu", this, new Object[] {menu}))
            return true;
		if (menuItems == null)
			return false;
		for (B4AMenuItem bmi : menuItems) {
			android.view.MenuItem mi = menu.add(bmi.title);
			if (bmi.drawable != null)
				mi.setIcon(bmi.drawable);
            if (android.os.Build.VERSION.SDK_INT >= 11) {
				try {
                    if (bmi.addToBar) {
				        android.view.MenuItem.class.getMethod("setShowAsAction", int.class).invoke(mi, 1);
                    }
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			mi.setOnMenuItemClickListener(new B4AMenuItemsClickListener(bmi.eventName.toLowerCase(BA.cul)));
		}
        
		return true;
	}   
 @Override
 public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (item.getItemId() == 16908332) {
        processBA.raiseEvent(null, "activity_actionbarhomeclick");
        return true;
    }
    else
        return super.onOptionsItemSelected(item); 
}
@Override
 public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    processBA.runHook("onprepareoptionsmenu", this, new Object[] {menu});
    return true;
    
 }
 protected void onStart() {
    super.onStart();
    processBA.runHook("onstart", this, null);
}
 protected void onStop() {
    super.onStop();
    processBA.runHook("onstop", this, null);
}
    public void onWindowFocusChanged(boolean hasFocus) {
       super.onWindowFocusChanged(hasFocus);
       if (processBA.subExists("activity_windowfocuschanged"))
           processBA.raiseEvent2(null, true, "activity_windowfocuschanged", false, hasFocus);
    }
	private class B4AMenuItemsClickListener implements android.view.MenuItem.OnMenuItemClickListener {
		private final String eventName;
		public B4AMenuItemsClickListener(String eventName) {
			this.eventName = eventName;
		}
		public boolean onMenuItemClick(android.view.MenuItem item) {
			processBA.raiseEventFromUI(item.getTitle(), eventName + "_click");
			return true;
		}
	}
    public static Class<?> getObject() {
		return act_printpic.class;
	}
    private Boolean onKeySubExist = null;
    private Boolean onKeyUpSubExist = null;
	@Override
	public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeydown", this, new Object[] {keyCode, event}))
            return true;
		if (onKeySubExist == null)
			onKeySubExist = processBA.subExists("activity_keypress");
		if (onKeySubExist) {
			if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK &&
					android.os.Build.VERSION.SDK_INT >= 18) {
				HandleKeyDelayed hk = new HandleKeyDelayed();
				hk.kc = keyCode;
				BA.handler.post(hk);
				return true;
			}
			else {
				boolean res = new HandleKeyDelayed().runDirectly(keyCode);
				if (res)
					return true;
			}
		}
		return super.onKeyDown(keyCode, event);
	}
	private class HandleKeyDelayed implements Runnable {
		int kc;
		public void run() {
			runDirectly(kc);
		}
		public boolean runDirectly(int keyCode) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keypress", false, keyCode);
			if (res == null || res == true) {
                return true;
            }
            else if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK) {
				finish();
				return true;
			}
            return false;
		}
		
	}
    @Override
	public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeyup", this, new Object[] {keyCode, event}))
            return true;
		if (onKeyUpSubExist == null)
			onKeyUpSubExist = processBA.subExists("activity_keyup");
		if (onKeyUpSubExist) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keyup", false, keyCode);
			if (res == null || res == true)
				return true;
		}
		return super.onKeyUp(keyCode, event);
	}
	@Override
	public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
		this.setIntent(intent);
        processBA.runHook("onnewintent", this, new Object[] {intent});
	}
    @Override 
	public void onPause() {
		super.onPause();
        if (_activity == null)
            return;
        if (this != mostCurrent)
			return;
		anywheresoftware.b4a.Msgbox.dismiss(true);
        if (!dontPause)
            BA.LogInfo("** Activity (act_printpic) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (act_printpic) Pause event (activity is not paused). **");
        if (mostCurrent != null)
            processBA.raiseEvent2(_activity, true, "activity_pause", false, activityBA.activity.isFinishing());		
        if (!dontPause) {
            processBA.setActivityPaused(true);
            mostCurrent = null;
        }

        if (!activityBA.activity.isFinishing())
			previousOne = new WeakReference<Activity>(this);
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        processBA.runHook("onpause", this, null);
	}

	@Override
	public void onDestroy() {
        super.onDestroy();
		previousOne = null;
        processBA.runHook("ondestroy", this, null);
	}
    @Override 
	public void onResume() {
		super.onResume();
        mostCurrent = this;
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (activityBA != null) { //will be null during activity create (which waits for AfterLayout).
        	ResumeMessage rm = new ResumeMessage(mostCurrent);
        	BA.handler.post(rm);
        }
        processBA.runHook("onresume", this, null);
	}
    private static class ResumeMessage implements Runnable {
    	private final WeakReference<Activity> activity;
    	public ResumeMessage(Activity activity) {
    		this.activity = new WeakReference<Activity>(activity);
    	}
		public void run() {
            act_printpic mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (act_printpic) Resume **");
            if (mc != mostCurrent)
                return;
		    processBA.raiseEvent(mc._activity, "activity_resume", (Object[])null);
		}
    }
	@Override
	protected void onActivityResult(int requestCode, int resultCode,
	      android.content.Intent data) {
		processBA.onActivityResult(requestCode, resultCode, data);
        processBA.runHook("onactivityresult", this, new Object[] {requestCode, resultCode});
	}
	private static void initializeGlobals() {
		processBA.raiseEvent2(null, true, "globals", false, (Object[])null);
	}
    public void onRequestPermissionsResult(int requestCode,
        String permissions[], int[] grantResults) {
        for (int i = 0;i < permissions.length;i++) {
            Object[] o = new Object[] {permissions[i], grantResults[i] == 0};
            processBA.raiseEventFromDifferentThread(null,null, 0, "activity_permissionresult", true, o);
        }
            
    }



public static void initializeProcessGlobals() {
             try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
}
public anywheresoftware.b4a.keywords.Common __c = null;
public static ir.parsikhesab.pakhsh.mcode._adapterlistfaktor _faktor = null;
public static anywheresoftware.b4a.objects.collections.List _listkala = null;
public static int _typeprint = 0;
public static uk.agraham.bluetoothprinter.escposprinter _printer1 = null;
public Object _ion = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblprint = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview1 = null;
public b4a.example3.customlistview _clv1 = null;
public static String _imagesignature = "";
public static String _signatureupdate = "";
public anywheresoftware.b4a.objects.LabelWrapper _lblsettingbtprinter = null;
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
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="act_printpic";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=53346304;
 //BA.debugLineNum = 53346304;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=53346305;
 //BA.debugLineNum = 53346305;BA.debugLine="Activity.LoadLayout(\"L_PrintPic\")";
mostCurrent._activity.LoadLayout("L_PrintPic",mostCurrent.activityBA);
RDebugUtils.currentLine=53346307;
 //BA.debugLineNum = 53346307;BA.debugLine="Printer1.Initialize(Me, \"Printer1\")";
_printer1._initialize(processBA,act_printpic.getObject(),"Printer1");
RDebugUtils.currentLine=53346310;
 //BA.debugLineNum = 53346310;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="act_printpic";
RDebugUtils.currentLine=53542912;
 //BA.debugLineNum = 53542912;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=53542914;
 //BA.debugLineNum = 53542914;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="act_printpic";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=53477376;
 //BA.debugLineNum = 53477376;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=53477377;
 //BA.debugLineNum = 53477377;BA.debugLine="clv1.Clear";
mostCurrent._clv1._clear();
RDebugUtils.currentLine=53477378;
 //BA.debugLineNum = 53477378;BA.debugLine="CreateSign";
_createsign();
RDebugUtils.currentLine=53477379;
 //BA.debugLineNum = 53477379;BA.debugLine="Select TypePrint";
switch (_typeprint) {
case 0: {
RDebugUtils.currentLine=53477381;
 //BA.debugLineNum = 53477381;BA.debugLine="CreateReport";
_createreport();
 break; }
case 1: {
RDebugUtils.currentLine=53477383;
 //BA.debugLineNum = 53477383;BA.debugLine="CreateReport1";
_createreport1();
 break; }
}
;
RDebugUtils.currentLine=53477386;
 //BA.debugLineNum = 53477386;BA.debugLine="Select MCode.PrinterType";
switch (BA.switchObjectToInt(mostCurrent._mcode._printertype /*int*/ ,(int) (0),(int) (1))) {
case 0: {
 break; }
case 1: {
 break; }
}
;
RDebugUtils.currentLine=53477413;
 //BA.debugLineNum = 53477413;BA.debugLine="End Sub";
return "";
}
public static String  _createsign() throws Exception{
RDebugUtils.currentModule="act_printpic";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createsign", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "createsign", null));}
String _dates = "";
String _time = "";
String _query = "";
RDebugUtils.currentLine=53411840;
 //BA.debugLineNum = 53411840;BA.debugLine="Sub CreateSign";
RDebugUtils.currentLine=53411841;
 //BA.debugLineNum = 53411841;BA.debugLine="If File.Exists(File.DirDefaultExternal & \"/Parsik";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal()+"/Parsik/Signature",mostCurrent._mcode._c_tafzili /*String*/ +".png")) { 
RDebugUtils.currentLine=53411842;
 //BA.debugLineNum = 53411842;BA.debugLine="SignatureUpdate=\"OK\"";
mostCurrent._signatureupdate = "OK";
RDebugUtils.currentLine=53411843;
 //BA.debugLineNum = 53411843;BA.debugLine="Dim DateS As String =MCode.DatePersian";
_dates = mostCurrent._mcode._datepersian /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=53411844;
 //BA.debugLineNum = 53411844;BA.debugLine="Dim Time As String =DateTime.Time(DateTime.Now)";
_time = anywheresoftware.b4a.keywords.Common.DateTime.Time(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
RDebugUtils.currentLine=53411845;
 //BA.debugLineNum = 53411845;BA.debugLine="ImageSignature =MCode.Encrypted(MCode.ConvertBlo";
mostCurrent._imagesignature = mostCurrent._mcode._encrypted /*String*/ (mostCurrent.activityBA,mostCurrent._mcode._convertblobtostring /*String*/ (mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal()+"/Parsik/Signature",mostCurrent._mcode._c_tafzili /*String*/ +".png"));
RDebugUtils.currentLine=53411846;
 //BA.debugLineNum = 53411846;BA.debugLine="Dim query As String=\"Update TblFaktor Set FldSig";
_query = "Update TblFaktor Set FldSignatureBitmapString='"+mostCurrent._imagesignature+"' where FldShomareFaktor="+_faktor.fldShomareFaktor /*String*/ ;
RDebugUtils.currentLine=53411847;
 //BA.debugLineNum = 53411847;BA.debugLine="MCode.SaveUpdate(query)";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,_query);
RDebugUtils.currentLine=53411849;
 //BA.debugLineNum = 53411849;BA.debugLine="File.Delete(File.DirDefaultExternal & \"/Parsik/S";
anywheresoftware.b4a.keywords.Common.File.Delete(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal()+"/Parsik/Signature",mostCurrent._mcode._c_tafzili /*String*/ +".png");
 };
RDebugUtils.currentLine=53411851;
 //BA.debugLineNum = 53411851;BA.debugLine="End Sub";
return "";
}
public static String  _createreport() throws Exception{
RDebugUtils.currentModule="act_printpic";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createreport", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "createreport", null));}
ir.parsikhesab.pakhsh.cls_faktor1_type1 _rec1 = null;
String _date = "";
String _datefactor = "";
String _time = "";
String _query = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
String _radif = "";
String _codekala = "";
String _namekala = "";
int _fee = 0;
int _takhfifkala = 0;
int _takhfifvizhe = 0;
String _tedadjoze = "";
String _tedadkol = "";
int _tedaddarkarton = 0;
String _sum = "";
String _sumkol = "";
String _summablaghkhales = "";
int _count = 0;
String _sumfactor = "";
String _sumpardakht = "";
String _sumkhales = "";
String _sumkoltakhfif = "";
String _tozihat = "";
String _vaziatpardakht = "";
String _signaturebitmapstring = "";
String _sumtakhfifkala = "";
String _sumtakhfifvizhe = "";
String _summandeazghabl = "";
int _i = 0;
ir.parsikhesab.pakhsh.mcode._adapterlistkala _item = null;
ir.parsikhesab.pakhsh.cls_faktor2_type1 _rec2 = null;
String _darsadarzeshafzode = "";
String _arzeshafzode = "";
ir.parsikhesab.pakhsh.cls_faktor3_type1 _rec3 = null;
RDebugUtils.currentLine=54394880;
 //BA.debugLineNum = 54394880;BA.debugLine="Sub CreateReport";
RDebugUtils.currentLine=54394884;
 //BA.debugLineNum = 54394884;BA.debugLine="Dim rec1 As cls_Faktor1_Type1";
_rec1 = new ir.parsikhesab.pakhsh.cls_faktor1_type1();
RDebugUtils.currentLine=54394885;
 //BA.debugLineNum = 54394885;BA.debugLine="Dim Date As String= MCode.Sf.Mid(MCode.DatePersia";
_date = mostCurrent._mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvv5(mostCurrent._mcode._datepersian /*String*/ (mostCurrent.activityBA),(int) (1),(int) (4))+"/"+mostCurrent._mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvv5(mostCurrent._mcode._datepersian /*String*/ (mostCurrent.activityBA),(int) (5),(int) (2))+"/"+mostCurrent._mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvv5(mostCurrent._mcode._datepersian /*String*/ (mostCurrent.activityBA),(int) (7),(int) (2));
RDebugUtils.currentLine=54394886;
 //BA.debugLineNum = 54394886;BA.debugLine="Dim DateFactor As String= MCode.Sf.Mid(Faktor.fld";
_datefactor = mostCurrent._mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvv5(_faktor.fldDate /*String*/ ,(int) (1),(int) (4))+"/"+mostCurrent._mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvv5(_faktor.fldDate /*String*/ ,(int) (5),(int) (2))+"/"+mostCurrent._mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvv5(_faktor.fldDate /*String*/ ,(int) (7),(int) (2));
RDebugUtils.currentLine=54394887;
 //BA.debugLineNum = 54394887;BA.debugLine="Dim Time As String=DateTime.Time(DateTime.Now)";
_time = anywheresoftware.b4a.keywords.Common.DateTime.Time(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
RDebugUtils.currentLine=54394888;
 //BA.debugLineNum = 54394888;BA.debugLine="rec1.Initialize(MCode.C_Tafzili,Faktor.C_Name,MCo";
_rec1._initialize /*String*/ (null,mostCurrent.activityBA,mostCurrent._mcode._c_tafzili /*String*/ ,_faktor.C_Name /*String*/ ,mostCurrent._mcode._c_visitor /*String*/ ,mostCurrent._mcode._n_visitor /*String*/ ,mostCurrent._mcode._appname /*String*/ ,mostCurrent._mcode._faktorselect /*String*/ ,_datefactor,_date,_time,mostCurrent._mcode._tell_tafzili /*String*/ ,mostCurrent._mcode._address_tafzili /*String*/ ,mostCurrent._mcode._companyname /*String*/ ,mostCurrent._mcode._companytell /*String*/ ,mostCurrent._mcode._companyaddress /*String*/ );
RDebugUtils.currentLine=54394889;
 //BA.debugLineNum = 54394889;BA.debugLine="clv1.Add(rec1.Panel,0)";
mostCurrent._clv1._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_rec1._getpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ (null).getObject())),(Object)(0));
RDebugUtils.currentLine=54394892;
 //BA.debugLineNum = 54394892;BA.debugLine="Dim Query As String";
_query = "";
RDebugUtils.currentLine=54394893;
 //BA.debugLineNum = 54394893;BA.debugLine="Query = \"SELECT  TblFaktor.FldRadif,TblFaktor.Fld";
_query = "SELECT  TblFaktor.FldRadif,TblFaktor.FldNamekala,Cast(Round(TblFaktor.FldFeeForoosh,'"+mostCurrent._mcode._raghamashar /*String*/ +"') As Int) As FldFeeForoosh ,TblFaktor.FldTedadDarSabadJoz,TblKala.FldNamevahed,TblFaktor.FldTedadDarSabadKol,TblKala.FldNameVahed2,TblFaktor.FldCodeKala,TblFaktor.FldMablaghMasrafKonande,TblFaktor.FldTozihat FROM TblFaktor,TblKala WHERE TblFaktor.FldCodeKala = TblKala.FldCodeKala And FldShomareFaktor = '"+mostCurrent._mcode._shomarefaktor /*String*/ +"'";
RDebugUtils.currentLine=54394894;
 //BA.debugLineNum = 54394894;BA.debugLine="Dim Cu As Cursor =MCode.Result(Query)";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,_query);
RDebugUtils.currentLine=54394895;
 //BA.debugLineNum = 54394895;BA.debugLine="Dim Radif As String";
_radif = "";
RDebugUtils.currentLine=54394896;
 //BA.debugLineNum = 54394896;BA.debugLine="Dim CodeKala As String";
_codekala = "";
RDebugUtils.currentLine=54394897;
 //BA.debugLineNum = 54394897;BA.debugLine="Dim NameKala As String";
_namekala = "";
RDebugUtils.currentLine=54394898;
 //BA.debugLineNum = 54394898;BA.debugLine="Dim Fee As Int";
_fee = 0;
RDebugUtils.currentLine=54394899;
 //BA.debugLineNum = 54394899;BA.debugLine="Dim TakhfifKala As Int";
_takhfifkala = 0;
RDebugUtils.currentLine=54394900;
 //BA.debugLineNum = 54394900;BA.debugLine="Dim TakhfifVizhe As Int";
_takhfifvizhe = 0;
RDebugUtils.currentLine=54394901;
 //BA.debugLineNum = 54394901;BA.debugLine="Dim TedadJoze As String";
_tedadjoze = "";
RDebugUtils.currentLine=54394902;
 //BA.debugLineNum = 54394902;BA.debugLine="Dim TedadKol As String";
_tedadkol = "";
RDebugUtils.currentLine=54394903;
 //BA.debugLineNum = 54394903;BA.debugLine="Dim TedadDarKarton As Int";
_tedaddarkarton = 0;
RDebugUtils.currentLine=54394904;
 //BA.debugLineNum = 54394904;BA.debugLine="Dim Sum As String";
_sum = "";
RDebugUtils.currentLine=54394905;
 //BA.debugLineNum = 54394905;BA.debugLine="Dim SumKol As String=0";
_sumkol = BA.NumberToString(0);
RDebugUtils.currentLine=54394906;
 //BA.debugLineNum = 54394906;BA.debugLine="Dim SumMablaghKhales As String=0";
_summablaghkhales = BA.NumberToString(0);
RDebugUtils.currentLine=54394907;
 //BA.debugLineNum = 54394907;BA.debugLine="Dim count As Int=0";
_count = (int) (0);
RDebugUtils.currentLine=54394908;
 //BA.debugLineNum = 54394908;BA.debugLine="Dim sumFactor,sumPardakht,sumKhales,SumKolTakhfif";
_sumfactor = "";
_sumpardakht = "";
_sumkhales = "";
_sumkoltakhfif = BA.NumberToString(0);
RDebugUtils.currentLine=54394909;
 //BA.debugLineNum = 54394909;BA.debugLine="Dim Tozihat,VaziatPardakht,SignatureBitmapString";
_tozihat = "";
_vaziatpardakht = "";
_signaturebitmapstring = "";
RDebugUtils.currentLine=54394910;
 //BA.debugLineNum = 54394910;BA.debugLine="Dim sumTakhfifKala As String=0";
_sumtakhfifkala = BA.NumberToString(0);
RDebugUtils.currentLine=54394911;
 //BA.debugLineNum = 54394911;BA.debugLine="Dim sumTakhfifVizhe As String=0";
_sumtakhfifvizhe = BA.NumberToString(0);
RDebugUtils.currentLine=54394912;
 //BA.debugLineNum = 54394912;BA.debugLine="Dim sumMandeAzGhabl As String=0";
_summandeazghabl = BA.NumberToString(0);
RDebugUtils.currentLine=54394934;
 //BA.debugLineNum = 54394934;BA.debugLine="For i=0 To listKala.Size-1";
{
final int step28 = 1;
final int limit28 = (int) (_listkala.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit28 ;_i = _i + step28 ) {
RDebugUtils.currentLine=54394935;
 //BA.debugLineNum = 54394935;BA.debugLine="Dim item As AdapterListKala=listKala.Get(i)";
_item = (ir.parsikhesab.pakhsh.mcode._adapterlistkala)(_listkala.Get(_i));
RDebugUtils.currentLine=54394936;
 //BA.debugLineNum = 54394936;BA.debugLine="Radif=i+1";
_radif = BA.NumberToString(_i+1);
RDebugUtils.currentLine=54394937;
 //BA.debugLineNum = 54394937;BA.debugLine="CodeKala=item.CodeKala";
_codekala = _item.CodeKala /*String*/ ;
RDebugUtils.currentLine=54394938;
 //BA.debugLineNum = 54394938;BA.debugLine="NameKala=item.NameKala";
_namekala = _item.NameKala /*String*/ ;
RDebugUtils.currentLine=54394939;
 //BA.debugLineNum = 54394939;BA.debugLine="Fee=item.FeeForoosh";
_fee = _item.FeeForoosh /*int*/ ;
RDebugUtils.currentLine=54394955;
 //BA.debugLineNum = 54394955;BA.debugLine="TakhfifKala=myCode.Is_Null_adad(item.TakhfifKala";
_takhfifkala = (int)(Double.parseDouble(mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_item.TakhfifKala /*String*/ )));
RDebugUtils.currentLine=54394956;
 //BA.debugLineNum = 54394956;BA.debugLine="sumTakhfifKala=sumTakhfifKala+TakhfifKala";
_sumtakhfifkala = BA.NumberToString((double)(Double.parseDouble(_sumtakhfifkala))+_takhfifkala);
RDebugUtils.currentLine=54394957;
 //BA.debugLineNum = 54394957;BA.debugLine="TakhfifVizhe=myCode.Is_Null_adad(item.MablaghTak";
_takhfifvizhe = (int)(Double.parseDouble(mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,BA.NumberToString(_item.MablaghTakhfif /*int*/ ))));
RDebugUtils.currentLine=54394958;
 //BA.debugLineNum = 54394958;BA.debugLine="sumTakhfifVizhe=sumTakhfifVizhe+TakhfifVizhe";
_sumtakhfifvizhe = BA.NumberToString((double)(Double.parseDouble(_sumtakhfifvizhe))+_takhfifvizhe);
RDebugUtils.currentLine=54394959;
 //BA.debugLineNum = 54394959;BA.debugLine="Tozihat=item.Tozihat";
_tozihat = _item.Tozihat /*String*/ ;
RDebugUtils.currentLine=54394960;
 //BA.debugLineNum = 54394960;BA.debugLine="TedadJoze=item.TedadDarSabadJoz";
_tedadjoze = _item.TedadDarSabadJoz /*String*/ ;
RDebugUtils.currentLine=54394961;
 //BA.debugLineNum = 54394961;BA.debugLine="TedadKol=item.TedadDarSabadKol";
_tedadkol = _item.TedadDarSabadKol /*String*/ ;
RDebugUtils.currentLine=54394962;
 //BA.debugLineNum = 54394962;BA.debugLine="TedadDarKarton=item.TedadDarKarton";
_tedaddarkarton = (int)(Double.parseDouble(_item.TedadDarKarton /*String*/ ));
RDebugUtils.currentLine=54394963;
 //BA.debugLineNum = 54394963;BA.debugLine="Sum=((TedadKol*TedadDarKarton)+TedadJoze)*Fee";
_sum = BA.NumberToString((((double)(Double.parseDouble(_tedadkol))*_tedaddarkarton)+(double)(Double.parseDouble(_tedadjoze)))*_fee);
RDebugUtils.currentLine=54394964;
 //BA.debugLineNum = 54394964;BA.debugLine="SumKol=SumKol+Sum";
_sumkol = BA.NumberToString((double)(Double.parseDouble(_sumkol))+(double)(Double.parseDouble(_sum)));
RDebugUtils.currentLine=54394965;
 //BA.debugLineNum = 54394965;BA.debugLine="SumMablaghKhales=SumMablaghKhales+Sum-(TakhfifKa";
_summablaghkhales = BA.NumberToString((double)(Double.parseDouble(_summablaghkhales))+(double)(Double.parseDouble(_sum))-(_takhfifkala+_takhfifvizhe));
RDebugUtils.currentLine=54394969;
 //BA.debugLineNum = 54394969;BA.debugLine="Dim rec2 As cls_Faktor2_Type1";
_rec2 = new ir.parsikhesab.pakhsh.cls_faktor2_type1();
RDebugUtils.currentLine=54394971;
 //BA.debugLineNum = 54394971;BA.debugLine="rec2.Initialize(Radif,item.CodeKala,item.NameKal";
_rec2._initialize /*String*/ (null,mostCurrent.activityBA,_radif,_item.CodeKala /*String*/ ,_item.NameKala /*String*/ ,mostCurrent._mycode._adadtoprice /*String*/ (mostCurrent.activityBA,BA.NumberToString(_item.FeeForoosh /*int*/ )),mostCurrent._mycode._adadtoprice /*String*/ (mostCurrent.activityBA,BA.NumberToString(_takhfifkala)),mostCurrent._mycode._adadtoprice /*String*/ (mostCurrent.activityBA,BA.NumberToString(_takhfifvizhe)),anywheresoftware.b4a.keywords.Common.NumberFormat2((double)(Double.parseDouble(_sum)),(int) (0),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.True)+" "+mostCurrent._mcode._vahedpool /*String*/ ,anywheresoftware.b4a.keywords.Common.NumberFormat2((double)(Double.parseDouble(_summablaghkhales)),(int) (0),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.True)+" "+mostCurrent._mcode._vahedpool /*String*/ ,_tedadjoze,_tedadkol,BA.NumberToString(_tedaddarkarton),_tozihat);
RDebugUtils.currentLine=54394972;
 //BA.debugLineNum = 54394972;BA.debugLine="count=i+1";
_count = (int) (_i+1);
RDebugUtils.currentLine=54394974;
 //BA.debugLineNum = 54394974;BA.debugLine="clv1.Add(rec2.Panel,i)";
mostCurrent._clv1._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_rec2._getpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ (null).getObject())),(Object)(_i));
 }
};
RDebugUtils.currentLine=54394979;
 //BA.debugLineNum = 54394979;BA.debugLine="Dim DarsadArzeshAfzode As String";
_darsadarzeshafzode = "";
RDebugUtils.currentLine=54394980;
 //BA.debugLineNum = 54394980;BA.debugLine="Dim ArzeshAfzode As String";
_arzeshafzode = "";
RDebugUtils.currentLine=54394990;
 //BA.debugLineNum = 54394990;BA.debugLine="Log(\"تخفیف کالا : \" & sumTakhfifKala)";
anywheresoftware.b4a.keywords.Common.LogImpl("554394990","تخفیف کالا : "+_sumtakhfifkala,0);
RDebugUtils.currentLine=54395001;
 //BA.debugLineNum = 54395001;BA.debugLine="Log(\"تخفیف ویژه : \" & sumTakhfifVizhe)";
anywheresoftware.b4a.keywords.Common.LogImpl("554395001","تخفیف ویژه : "+_sumtakhfifvizhe,0);
RDebugUtils.currentLine=54395003;
 //BA.debugLineNum = 54395003;BA.debugLine="SumKolTakhfif=sumTakhfifKala+sumTakhfifVizhe";
_sumkoltakhfif = BA.NumberToString((double)(Double.parseDouble(_sumtakhfifkala))+(double)(Double.parseDouble(_sumtakhfifvizhe)));
RDebugUtils.currentLine=54395006;
 //BA.debugLineNum = 54395006;BA.debugLine="sumFactor=NumberFormat2(Faktor.fldMablaghKol,0,0,";
_sumfactor = anywheresoftware.b4a.keywords.Common.NumberFormat2((double)(Double.parseDouble(_faktor.fldMablaghKol /*String*/ )),(int) (0),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.True)+" "+mostCurrent._mcode._vahedpool /*String*/ ;
RDebugUtils.currentLine=54395007;
 //BA.debugLineNum = 54395007;BA.debugLine="sumPardakht=NumberFormat2(Faktor.fldTotalFaktor,0";
_sumpardakht = anywheresoftware.b4a.keywords.Common.NumberFormat2((double)(Double.parseDouble(_faktor.fldTotalFaktor /*String*/ )),(int) (0),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.True)+" "+mostCurrent._mcode._vahedpool /*String*/ ;
RDebugUtils.currentLine=54395008;
 //BA.debugLineNum = 54395008;BA.debugLine="SumMablaghKhales=NumberFormat2(Faktor.fldTotalFak";
_summablaghkhales = anywheresoftware.b4a.keywords.Common.NumberFormat2((double)(Double.parseDouble(_faktor.fldTotalFaktor /*String*/ )),(int) (0),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.True)+" "+mostCurrent._mcode._vahedpool /*String*/ ;
RDebugUtils.currentLine=54395009;
 //BA.debugLineNum = 54395009;BA.debugLine="sumTakhfifKala=NumberFormat2(sumTakhfifKala,0,0,0";
_sumtakhfifkala = anywheresoftware.b4a.keywords.Common.NumberFormat2((double)(Double.parseDouble(_sumtakhfifkala)),(int) (0),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.True)+" "+mostCurrent._mcode._vahedpool /*String*/ ;
RDebugUtils.currentLine=54395010;
 //BA.debugLineNum = 54395010;BA.debugLine="sumTakhfifVizhe=NumberFormat2(sumTakhfifVizhe,0,0";
_sumtakhfifvizhe = anywheresoftware.b4a.keywords.Common.NumberFormat2((double)(Double.parseDouble(_sumtakhfifvizhe)),(int) (0),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.True)+" "+mostCurrent._mcode._vahedpool /*String*/ ;
RDebugUtils.currentLine=54395011;
 //BA.debugLineNum = 54395011;BA.debugLine="SumKolTakhfif=NumberFormat2(SumKolTakhfif,0,0,0,T";
_sumkoltakhfif = anywheresoftware.b4a.keywords.Common.NumberFormat2((double)(Double.parseDouble(_sumkoltakhfif)),(int) (0),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.True)+" "+mostCurrent._mcode._vahedpool /*String*/ ;
RDebugUtils.currentLine=54395012;
 //BA.debugLineNum = 54395012;BA.debugLine="SumKol=NumberFormat2(SumKol,0,0,0,True)&\" \"&MCode";
_sumkol = anywheresoftware.b4a.keywords.Common.NumberFormat2((double)(Double.parseDouble(_sumkol)),(int) (0),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.True)+" "+mostCurrent._mcode._vahedpool /*String*/ ;
RDebugUtils.currentLine=54395013;
 //BA.debugLineNum = 54395013;BA.debugLine="Tozihat=MCode.Tozihat_faktor";
_tozihat = mostCurrent._mcode._tozihat_faktor /*String*/ ;
RDebugUtils.currentLine=54395014;
 //BA.debugLineNum = 54395014;BA.debugLine="VaziatPardakht=MCode.NoeTasvieFaktor";
_vaziatpardakht = mostCurrent._mcode._noetasviefaktor /*String*/ ;
RDebugUtils.currentLine=54395015;
 //BA.debugLineNum = 54395015;BA.debugLine="DarsadArzeshAfzode =$\"% ${Faktor.fldDarsadArzeshA";
_darsadarzeshafzode = ("% "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_faktor.fldDarsadArzeshAfzode /*String*/ ))+"");
RDebugUtils.currentLine=54395016;
 //BA.debugLineNum = 54395016;BA.debugLine="ArzeshAfzode=myCode.AdadToPrice(Faktor.fldArzeshA";
_arzeshafzode = mostCurrent._mycode._adadtoprice /*String*/ (mostCurrent.activityBA,_faktor.fldArzeshAfzode /*String*/ );
RDebugUtils.currentLine=54395017;
 //BA.debugLineNum = 54395017;BA.debugLine="sumMandeAzGhabl=IIf(Faktor.fldSumMandeAzGhabl=0,0";
_summandeazghabl = BA.ObjectToString((((_faktor.fldSumMandeAzGhabl /*String*/ ).equals(BA.NumberToString(0))) ? ((Object)(0)) : ((Object)(mostCurrent._mycode._adadtoprice /*String*/ (mostCurrent.activityBA,_faktor.fldSumMandeAzGhabl /*String*/ )))));
RDebugUtils.currentLine=54395018;
 //BA.debugLineNum = 54395018;BA.debugLine="If SignatureUpdate=\"OK\" Then";
if ((mostCurrent._signatureupdate).equals("OK")) { 
RDebugUtils.currentLine=54395019;
 //BA.debugLineNum = 54395019;BA.debugLine="SignatureBitmapString=ImageSignature";
_signaturebitmapstring = mostCurrent._imagesignature;
 }else {
RDebugUtils.currentLine=54395021;
 //BA.debugLineNum = 54395021;BA.debugLine="SignatureBitmapString=Faktor.Signature";
_signaturebitmapstring = _faktor.Signature /*String*/ ;
 };
RDebugUtils.currentLine=54395024;
 //BA.debugLineNum = 54395024;BA.debugLine="Dim rec3 As cls_Faktor3_Type1";
_rec3 = new ir.parsikhesab.pakhsh.cls_faktor3_type1();
RDebugUtils.currentLine=54395025;
 //BA.debugLineNum = 54395025;BA.debugLine="rec3.Initialize(SumKol,sumPardakht,VaziatPardakht";
_rec3._initialize /*String*/ (null,mostCurrent.activityBA,_sumkol,_sumpardakht,_vaziatpardakht,_summablaghkhales,_sumtakhfifkala,_sumtakhfifvizhe,_sumkoltakhfif,_tozihat,_signaturebitmapstring,_darsadarzeshafzode,_arzeshafzode,_summandeazghabl);
RDebugUtils.currentLine=54395027;
 //BA.debugLineNum = 54395027;BA.debugLine="clv1.Add(rec3.Panel,count+1)";
mostCurrent._clv1._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_rec3._getpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ (null).getObject())),(Object)(_count+1));
RDebugUtils.currentLine=54395029;
 //BA.debugLineNum = 54395029;BA.debugLine="End Sub";
return "";
}
public static String  _createreport1() throws Exception{
RDebugUtils.currentModule="act_printpic";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createreport1", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "createreport1", null));}
ir.parsikhesab.pakhsh.cls_factor1_type2 _rec1 = null;
String _date = "";
String _datefactor = "";
String _time = "";
String _query = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
String _radif = "";
String _codekala = "";
String _namekala = "";
int _fee = 0;
int _takhfifkala = 0;
int _takhfifvizhe = 0;
String _tedadjoze = "";
String _tedadkol = "";
int _tedaddarkarton = 0;
String _sum = "";
String _sumkol = "";
String _summablaghkhales = "";
int _count = 0;
String _sumfactor = "";
String _sumpardakht = "";
String _sumkhales = "";
String _sumkoltakhfif = "";
String _tozihat = "";
String _vaziatpardakht = "";
String _signaturebitmapstring = "";
String _sumtakhfifkala = "";
String _sumtakhfifvizhe = "";
String _summandeazghabl = "";
int _i = 0;
ir.parsikhesab.pakhsh.mcode._adapterlistkala _item = null;
ir.parsikhesab.pakhsh.cls_factor2_type2 _rec2 = null;
ir.parsikhesab.pakhsh.cls_factor3_type2 _rec3 = null;
RDebugUtils.currentLine=54460416;
 //BA.debugLineNum = 54460416;BA.debugLine="Sub CreateReport1";
RDebugUtils.currentLine=54460420;
 //BA.debugLineNum = 54460420;BA.debugLine="Dim rec1 As cls_Factor1_Type2";
_rec1 = new ir.parsikhesab.pakhsh.cls_factor1_type2();
RDebugUtils.currentLine=54460421;
 //BA.debugLineNum = 54460421;BA.debugLine="Dim Date As String= MCode.Sf.Mid(MCode.DatePersia";
_date = mostCurrent._mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvv5(mostCurrent._mcode._datepersian /*String*/ (mostCurrent.activityBA),(int) (1),(int) (4))+"/"+mostCurrent._mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvv5(mostCurrent._mcode._datepersian /*String*/ (mostCurrent.activityBA),(int) (5),(int) (2))+"/"+mostCurrent._mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvv5(mostCurrent._mcode._datepersian /*String*/ (mostCurrent.activityBA),(int) (7),(int) (2));
RDebugUtils.currentLine=54460422;
 //BA.debugLineNum = 54460422;BA.debugLine="Dim DateFactor As String= MCode.Sf.Mid(Faktor.fld";
_datefactor = mostCurrent._mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvv5(_faktor.fldDate /*String*/ ,(int) (1),(int) (4))+"/"+mostCurrent._mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvv5(_faktor.fldDate /*String*/ ,(int) (5),(int) (2))+"/"+mostCurrent._mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvv5(_faktor.fldDate /*String*/ ,(int) (7),(int) (2));
RDebugUtils.currentLine=54460423;
 //BA.debugLineNum = 54460423;BA.debugLine="Dim Time As String=DateTime.Time(DateTime.Now)";
_time = anywheresoftware.b4a.keywords.Common.DateTime.Time(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
RDebugUtils.currentLine=54460424;
 //BA.debugLineNum = 54460424;BA.debugLine="rec1.Initialize(MCode.C_Tafzili,Faktor.C_Name,MCo";
_rec1._initialize /*String*/ (null,mostCurrent.activityBA,mostCurrent._mcode._c_tafzili /*String*/ ,_faktor.C_Name /*String*/ ,mostCurrent._mcode._c_visitor /*String*/ ,mostCurrent._mcode._n_visitor /*String*/ ,mostCurrent._mcode._appname /*String*/ ,mostCurrent._mcode._faktorselect /*String*/ ,_datefactor,_date,_time,mostCurrent._mcode._tell_tafzili /*String*/ ,mostCurrent._mcode._address_tafzili /*String*/ ,mostCurrent._mcode._companyname /*String*/ ,mostCurrent._mcode._companytell /*String*/ ,mostCurrent._mcode._companyaddress /*String*/ );
RDebugUtils.currentLine=54460425;
 //BA.debugLineNum = 54460425;BA.debugLine="clv1.Add(rec1.Panel,0)";
mostCurrent._clv1._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_rec1._getpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ (null).getObject())),(Object)(0));
RDebugUtils.currentLine=54460428;
 //BA.debugLineNum = 54460428;BA.debugLine="Dim Query As String";
_query = "";
RDebugUtils.currentLine=54460429;
 //BA.debugLineNum = 54460429;BA.debugLine="Query = \"SELECT  TblFaktor.FldRadif,TblFaktor.Fld";
_query = "SELECT  TblFaktor.FldRadif,TblFaktor.FldNamekala,Cast(Round(TblFaktor.FldFeeForoosh,'"+mostCurrent._mcode._raghamashar /*String*/ +"') As Int) As FldFeeForoosh ,TblFaktor.FldTedadDarSabadJoz,TblKala.FldNamevahed,TblFaktor.FldTedadDarSabadKol,TblKala.FldNameVahed2,TblFaktor.FldCodeKala,TblFaktor.FldMablaghMasrafKonande,TblFaktor.FldTozihat FROM TblFaktor,TblKala WHERE TblFaktor.FldCodeKala = TblKala.FldCodeKala And FldShomareFaktor = '"+mostCurrent._mcode._shomarefaktor /*String*/ +"'";
RDebugUtils.currentLine=54460430;
 //BA.debugLineNum = 54460430;BA.debugLine="Dim Cu As Cursor =MCode.Result(Query)";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,_query);
RDebugUtils.currentLine=54460431;
 //BA.debugLineNum = 54460431;BA.debugLine="Dim Radif As String";
_radif = "";
RDebugUtils.currentLine=54460432;
 //BA.debugLineNum = 54460432;BA.debugLine="Dim CodeKala As String";
_codekala = "";
RDebugUtils.currentLine=54460433;
 //BA.debugLineNum = 54460433;BA.debugLine="Dim NameKala As String";
_namekala = "";
RDebugUtils.currentLine=54460434;
 //BA.debugLineNum = 54460434;BA.debugLine="Dim Fee As Int";
_fee = 0;
RDebugUtils.currentLine=54460435;
 //BA.debugLineNum = 54460435;BA.debugLine="Dim TakhfifKala As Int";
_takhfifkala = 0;
RDebugUtils.currentLine=54460436;
 //BA.debugLineNum = 54460436;BA.debugLine="Dim TakhfifVizhe As Int";
_takhfifvizhe = 0;
RDebugUtils.currentLine=54460437;
 //BA.debugLineNum = 54460437;BA.debugLine="Dim TedadJoze As String";
_tedadjoze = "";
RDebugUtils.currentLine=54460438;
 //BA.debugLineNum = 54460438;BA.debugLine="Dim TedadKol As String";
_tedadkol = "";
RDebugUtils.currentLine=54460439;
 //BA.debugLineNum = 54460439;BA.debugLine="Dim TedadDarKarton As Int";
_tedaddarkarton = 0;
RDebugUtils.currentLine=54460440;
 //BA.debugLineNum = 54460440;BA.debugLine="Dim Sum As String";
_sum = "";
RDebugUtils.currentLine=54460441;
 //BA.debugLineNum = 54460441;BA.debugLine="Dim SumKol As String=0";
_sumkol = BA.NumberToString(0);
RDebugUtils.currentLine=54460442;
 //BA.debugLineNum = 54460442;BA.debugLine="Dim SumMablaghKhales As String=0";
_summablaghkhales = BA.NumberToString(0);
RDebugUtils.currentLine=54460443;
 //BA.debugLineNum = 54460443;BA.debugLine="Dim count As Int=0";
_count = (int) (0);
RDebugUtils.currentLine=54460444;
 //BA.debugLineNum = 54460444;BA.debugLine="Dim sumFactor,sumPardakht,sumKhales,SumKolTakhfif";
_sumfactor = "";
_sumpardakht = "";
_sumkhales = "";
_sumkoltakhfif = BA.NumberToString(0);
RDebugUtils.currentLine=54460445;
 //BA.debugLineNum = 54460445;BA.debugLine="Dim Tozihat,VaziatPardakht,SignatureBitmapString";
_tozihat = "";
_vaziatpardakht = "";
_signaturebitmapstring = "";
RDebugUtils.currentLine=54460446;
 //BA.debugLineNum = 54460446;BA.debugLine="Dim sumTakhfifKala As String=0";
_sumtakhfifkala = BA.NumberToString(0);
RDebugUtils.currentLine=54460447;
 //BA.debugLineNum = 54460447;BA.debugLine="Dim sumTakhfifVizhe As String=0";
_sumtakhfifvizhe = BA.NumberToString(0);
RDebugUtils.currentLine=54460448;
 //BA.debugLineNum = 54460448;BA.debugLine="Dim sumMandeAzGhabl As String=0";
_summandeazghabl = BA.NumberToString(0);
RDebugUtils.currentLine=54460470;
 //BA.debugLineNum = 54460470;BA.debugLine="For i=0 To listKala.Size-1";
{
final int step28 = 1;
final int limit28 = (int) (_listkala.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit28 ;_i = _i + step28 ) {
RDebugUtils.currentLine=54460471;
 //BA.debugLineNum = 54460471;BA.debugLine="Dim item As AdapterListKala=listKala.Get(i)";
_item = (ir.parsikhesab.pakhsh.mcode._adapterlistkala)(_listkala.Get(_i));
RDebugUtils.currentLine=54460472;
 //BA.debugLineNum = 54460472;BA.debugLine="Radif=i+1";
_radif = BA.NumberToString(_i+1);
RDebugUtils.currentLine=54460473;
 //BA.debugLineNum = 54460473;BA.debugLine="CodeKala=item.CodeKala";
_codekala = _item.CodeKala /*String*/ ;
RDebugUtils.currentLine=54460474;
 //BA.debugLineNum = 54460474;BA.debugLine="NameKala=item.NameKala";
_namekala = _item.NameKala /*String*/ ;
RDebugUtils.currentLine=54460475;
 //BA.debugLineNum = 54460475;BA.debugLine="Fee=item.FeeForoosh";
_fee = _item.FeeForoosh /*int*/ ;
RDebugUtils.currentLine=54460477;
 //BA.debugLineNum = 54460477;BA.debugLine="If item.MablaghTakhfif=0 And item.fldFeeBadAzTak";
if (_item.MablaghTakhfif /*int*/ ==0 && (double)(Double.parseDouble(_item.fldFeeBadAzTakhfif /*String*/ ))>0) { 
RDebugUtils.currentLine=54460478;
 //BA.debugLineNum = 54460478;BA.debugLine="TakhfifKala=(item.FeeForoosh-item.fldFeeBadAzTa";
_takhfifkala = (int) ((_item.FeeForoosh /*int*/ -(double)(Double.parseDouble(_item.fldFeeBadAzTakhfif /*String*/ )))*(((double)(Double.parseDouble(_item.TedadDarSabadKol /*String*/ ))*(double)(Double.parseDouble(_item.TedadDarKarton /*String*/ )))+(double)(Double.parseDouble(_item.TedadDarSabadJoz /*String*/ ))));
RDebugUtils.currentLine=54460479;
 //BA.debugLineNum = 54460479;BA.debugLine="sumTakhfifKala=sumTakhfifKala+TakhfifKala";
_sumtakhfifkala = BA.NumberToString((double)(Double.parseDouble(_sumtakhfifkala))+_takhfifkala);
 }else {
RDebugUtils.currentLine=54460481;
 //BA.debugLineNum = 54460481;BA.debugLine="TakhfifKala=0";
_takhfifkala = (int) (0);
 };
RDebugUtils.currentLine=54460485;
 //BA.debugLineNum = 54460485;BA.debugLine="If item.MablaghTakhfif>0 Then";
if (_item.MablaghTakhfif /*int*/ >0) { 
RDebugUtils.currentLine=54460486;
 //BA.debugLineNum = 54460486;BA.debugLine="TakhfifVizhe=(item.MablaghTakhfif)";
_takhfifvizhe = (_item.MablaghTakhfif /*int*/ );
RDebugUtils.currentLine=54460487;
 //BA.debugLineNum = 54460487;BA.debugLine="sumTakhfifVizhe=sumTakhfifVizhe+TakhfifVizhe";
_sumtakhfifvizhe = BA.NumberToString((double)(Double.parseDouble(_sumtakhfifvizhe))+_takhfifvizhe);
 }else {
RDebugUtils.currentLine=54460489;
 //BA.debugLineNum = 54460489;BA.debugLine="TakhfifVizhe=0";
_takhfifvizhe = (int) (0);
 };
RDebugUtils.currentLine=54460491;
 //BA.debugLineNum = 54460491;BA.debugLine="Tozihat=item.Tozihat";
_tozihat = _item.Tozihat /*String*/ ;
RDebugUtils.currentLine=54460492;
 //BA.debugLineNum = 54460492;BA.debugLine="TedadJoze=item.TedadDarSabadJoz";
_tedadjoze = _item.TedadDarSabadJoz /*String*/ ;
RDebugUtils.currentLine=54460493;
 //BA.debugLineNum = 54460493;BA.debugLine="TedadKol=item.TedadDarSabadKol";
_tedadkol = _item.TedadDarSabadKol /*String*/ ;
RDebugUtils.currentLine=54460494;
 //BA.debugLineNum = 54460494;BA.debugLine="TedadDarKarton=item.TedadDarKarton";
_tedaddarkarton = (int)(Double.parseDouble(_item.TedadDarKarton /*String*/ ));
RDebugUtils.currentLine=54460495;
 //BA.debugLineNum = 54460495;BA.debugLine="Sum=((TedadKol*TedadDarKarton)+TedadJoze)*Fee";
_sum = BA.NumberToString((((double)(Double.parseDouble(_tedadkol))*_tedaddarkarton)+(double)(Double.parseDouble(_tedadjoze)))*_fee);
RDebugUtils.currentLine=54460496;
 //BA.debugLineNum = 54460496;BA.debugLine="SumKol=SumKol+Sum";
_sumkol = BA.NumberToString((double)(Double.parseDouble(_sumkol))+(double)(Double.parseDouble(_sum)));
RDebugUtils.currentLine=54460497;
 //BA.debugLineNum = 54460497;BA.debugLine="SumMablaghKhales=SumMablaghKhales+Sum-TakhfifKal";
_summablaghkhales = BA.NumberToString((double)(Double.parseDouble(_summablaghkhales))+(double)(Double.parseDouble(_sum))-_takhfifkala-_takhfifvizhe);
RDebugUtils.currentLine=54460501;
 //BA.debugLineNum = 54460501;BA.debugLine="Dim rec2 As cls_Factor2_Type2";
_rec2 = new ir.parsikhesab.pakhsh.cls_factor2_type2();
RDebugUtils.currentLine=54460502;
 //BA.debugLineNum = 54460502;BA.debugLine="rec2.Initialize(Radif,CodeKala,NameKala,NumberFo";
_rec2._initialize /*String*/ (null,mostCurrent.activityBA,_radif,_codekala,_namekala,anywheresoftware.b4a.keywords.Common.NumberFormat2(_fee,(int) (0),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.True)+" "+mostCurrent._mcode._vahedpool /*String*/ ,anywheresoftware.b4a.keywords.Common.NumberFormat2(_takhfifkala,(int) (0),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.True)+" "+mostCurrent._mcode._vahedpool /*String*/ ,anywheresoftware.b4a.keywords.Common.NumberFormat2(_takhfifvizhe,(int) (0),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.True)+" "+mostCurrent._mcode._vahedpool /*String*/ ,anywheresoftware.b4a.keywords.Common.NumberFormat2((double)(Double.parseDouble(_sum)),(int) (0),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.True)+" "+mostCurrent._mcode._vahedpool /*String*/ ,anywheresoftware.b4a.keywords.Common.NumberFormat2((double)(Double.parseDouble(_summablaghkhales)),(int) (0),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.True)+" "+mostCurrent._mcode._vahedpool /*String*/ ,_tedadjoze,_tedadkol,BA.NumberToString(_tedaddarkarton),_tozihat);
RDebugUtils.currentLine=54460503;
 //BA.debugLineNum = 54460503;BA.debugLine="count=i+1";
_count = (int) (_i+1);
RDebugUtils.currentLine=54460505;
 //BA.debugLineNum = 54460505;BA.debugLine="clv1.Add(rec2.Panel,i)";
mostCurrent._clv1._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_rec2._getpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ (null).getObject())),(Object)(_i));
 }
};
RDebugUtils.currentLine=54460520;
 //BA.debugLineNum = 54460520;BA.debugLine="Log(\"تخفیف کالا : \" & sumTakhfifKala)";
anywheresoftware.b4a.keywords.Common.LogImpl("554460520","تخفیف کالا : "+_sumtakhfifkala,0);
RDebugUtils.currentLine=54460531;
 //BA.debugLineNum = 54460531;BA.debugLine="Log(\"تخفیف ویژه : \" & sumTakhfifVizhe)";
anywheresoftware.b4a.keywords.Common.LogImpl("554460531","تخفیف ویژه : "+_sumtakhfifvizhe,0);
RDebugUtils.currentLine=54460533;
 //BA.debugLineNum = 54460533;BA.debugLine="SumKolTakhfif=sumTakhfifKala+sumTakhfifVizhe";
_sumkoltakhfif = BA.NumberToString((double)(Double.parseDouble(_sumtakhfifkala))+(double)(Double.parseDouble(_sumtakhfifvizhe)));
RDebugUtils.currentLine=54460536;
 //BA.debugLineNum = 54460536;BA.debugLine="sumFactor=NumberFormat2(Faktor.fldMablaghKol,0,0,";
_sumfactor = anywheresoftware.b4a.keywords.Common.NumberFormat2((double)(Double.parseDouble(_faktor.fldMablaghKol /*String*/ )),(int) (0),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.True)+" "+mostCurrent._mcode._vahedpool /*String*/ ;
RDebugUtils.currentLine=54460537;
 //BA.debugLineNum = 54460537;BA.debugLine="sumPardakht=NumberFormat2(Faktor.fldTotalFaktor,0";
_sumpardakht = anywheresoftware.b4a.keywords.Common.NumberFormat2((double)(Double.parseDouble(_faktor.fldTotalFaktor /*String*/ )),(int) (0),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.True)+" "+mostCurrent._mcode._vahedpool /*String*/ ;
RDebugUtils.currentLine=54460538;
 //BA.debugLineNum = 54460538;BA.debugLine="SumMablaghKhales=NumberFormat2(Faktor.fldTotalFak";
_summablaghkhales = anywheresoftware.b4a.keywords.Common.NumberFormat2((double)(Double.parseDouble(_faktor.fldTotalFaktor /*String*/ )),(int) (0),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.True)+" "+mostCurrent._mcode._vahedpool /*String*/ ;
RDebugUtils.currentLine=54460539;
 //BA.debugLineNum = 54460539;BA.debugLine="sumTakhfifKala=NumberFormat2(sumTakhfifKala,0,0,0";
_sumtakhfifkala = anywheresoftware.b4a.keywords.Common.NumberFormat2((double)(Double.parseDouble(_sumtakhfifkala)),(int) (0),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.True)+" "+mostCurrent._mcode._vahedpool /*String*/ ;
RDebugUtils.currentLine=54460540;
 //BA.debugLineNum = 54460540;BA.debugLine="sumTakhfifVizhe=NumberFormat2(sumTakhfifVizhe,0,0";
_sumtakhfifvizhe = anywheresoftware.b4a.keywords.Common.NumberFormat2((double)(Double.parseDouble(_sumtakhfifvizhe)),(int) (0),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.True)+" "+mostCurrent._mcode._vahedpool /*String*/ ;
RDebugUtils.currentLine=54460541;
 //BA.debugLineNum = 54460541;BA.debugLine="SumKolTakhfif=NumberFormat2(SumKolTakhfif,0,0,0,T";
_sumkoltakhfif = anywheresoftware.b4a.keywords.Common.NumberFormat2((double)(Double.parseDouble(_sumkoltakhfif)),(int) (0),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.True)+" "+mostCurrent._mcode._vahedpool /*String*/ ;
RDebugUtils.currentLine=54460542;
 //BA.debugLineNum = 54460542;BA.debugLine="SumKol=NumberFormat2(SumKol,0,0,0,True)&\" \"&MCode";
_sumkol = anywheresoftware.b4a.keywords.Common.NumberFormat2((double)(Double.parseDouble(_sumkol)),(int) (0),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.True)+" "+mostCurrent._mcode._vahedpool /*String*/ ;
RDebugUtils.currentLine=54460544;
 //BA.debugLineNum = 54460544;BA.debugLine="Tozihat=MCode.Tozihat_faktor";
_tozihat = mostCurrent._mcode._tozihat_faktor /*String*/ ;
RDebugUtils.currentLine=54460545;
 //BA.debugLineNum = 54460545;BA.debugLine="VaziatPardakht=MCode.NoeTasvieFaktor";
_vaziatpardakht = mostCurrent._mcode._noetasviefaktor /*String*/ ;
RDebugUtils.currentLine=54460546;
 //BA.debugLineNum = 54460546;BA.debugLine="If SignatureUpdate=\"OK\" Then";
if ((mostCurrent._signatureupdate).equals("OK")) { 
RDebugUtils.currentLine=54460547;
 //BA.debugLineNum = 54460547;BA.debugLine="SignatureBitmapString=ImageSignature";
_signaturebitmapstring = mostCurrent._imagesignature;
 }else {
RDebugUtils.currentLine=54460549;
 //BA.debugLineNum = 54460549;BA.debugLine="SignatureBitmapString=Faktor.Signature";
_signaturebitmapstring = _faktor.Signature /*String*/ ;
 };
RDebugUtils.currentLine=54460551;
 //BA.debugLineNum = 54460551;BA.debugLine="Dim rec3 As cls_Factor3_Type2";
_rec3 = new ir.parsikhesab.pakhsh.cls_factor3_type2();
RDebugUtils.currentLine=54460552;
 //BA.debugLineNum = 54460552;BA.debugLine="rec3.Initialize(SumKol,sumPardakht,VaziatPardakht";
_rec3._initialize /*String*/ (null,mostCurrent.activityBA,_sumkol,_sumpardakht,_vaziatpardakht,_summablaghkhales,_sumtakhfifkala,_sumtakhfifvizhe,_sumkoltakhfif,_tozihat,_signaturebitmapstring);
RDebugUtils.currentLine=54460554;
 //BA.debugLineNum = 54460554;BA.debugLine="clv1.Add(rec3.Panel,count+1)";
mostCurrent._clv1._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_rec3._getpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ (null).getObject())),(Object)(_count+1));
RDebugUtils.currentLine=54460556;
 //BA.debugLineNum = 54460556;BA.debugLine="End Sub";
return "";
}
public static String  _btn_back_click() throws Exception{
RDebugUtils.currentModule="act_printpic";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_back_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_back_click", null));}
RDebugUtils.currentLine=54525952;
 //BA.debugLineNum = 54525952;BA.debugLine="Sub btn_Back_Click";
RDebugUtils.currentLine=54525953;
 //BA.debugLineNum = 54525953;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=54525954;
 //BA.debugLineNum = 54525954;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper  _crop_image(anywheresoftware.b4a.objects.B4XViewWrapper _v,int _left,int _top,int _width,int _height) throws Exception{
RDebugUtils.currentModule="act_printpic";
if (Debug.shouldDelegate(mostCurrent.activityBA, "crop_image", false))
	 {return ((anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) Debug.delegate(mostCurrent.activityBA, "crop_image", new Object[] {_v,_left,_top,_width,_height}));}
RDebugUtils.currentLine=54198272;
 //BA.debugLineNum = 54198272;BA.debugLine="Sub Crop_Image(V As B4XView, left As Int, top As I";
RDebugUtils.currentLine=54198274;
 //BA.debugLineNum = 54198274;BA.debugLine="Return V.Snapshot.Crop(left, top, width, height)";
if (true) return (anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(_v.Snapshot().Crop(_left,_top,_width,_height).getObject()));
RDebugUtils.currentLine=54198276;
 //BA.debugLineNum = 54198276;BA.debugLine="End Sub";
return null;
}
public static Object  _getba() throws Exception{
RDebugUtils.currentModule="act_printpic";
if (Debug.shouldDelegate(mostCurrent.activityBA, "getba", false))
	 {return ((Object) Debug.delegate(mostCurrent.activityBA, "getba", null));}
anywheresoftware.b4j.object.JavaObject _jo = null;
String _cls = "";
RDebugUtils.currentLine=54329344;
 //BA.debugLineNum = 54329344;BA.debugLine="Sub GetBA As Object";
RDebugUtils.currentLine=54329345;
 //BA.debugLineNum = 54329345;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=54329346;
 //BA.debugLineNum = 54329346;BA.debugLine="Dim cls As String = Me";
_cls = BA.ObjectToString(act_printpic.getObject());
RDebugUtils.currentLine=54329347;
 //BA.debugLineNum = 54329347;BA.debugLine="cls = cls.SubString(\"class \".Length)";
_cls = _cls.substring("class ".length());
RDebugUtils.currentLine=54329348;
 //BA.debugLineNum = 54329348;BA.debugLine="jo.InitializeStatic(cls)";
_jo.InitializeStatic(_cls);
RDebugUtils.currentLine=54329349;
 //BA.debugLineNum = 54329349;BA.debugLine="Return jo.GetField(\"processBA\")";
if (true) return _jo.GetField("processBA");
RDebugUtils.currentLine=54329350;
 //BA.debugLineNum = 54329350;BA.debugLine="End Sub";
return null;
}
public static String  _lblprint_click() throws Exception{
RDebugUtils.currentModule="act_printpic";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lblprint_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lblprint_click", null));}
RDebugUtils.currentLine=53739520;
 //BA.debugLineNum = 53739520;BA.debugLine="Private Sub LblPrint_Click";
RDebugUtils.currentLine=53739522;
 //BA.debugLineNum = 53739522;BA.debugLine="Select MCode.PrinterType";
switch (BA.switchObjectToInt(mostCurrent._mcode._printertype /*int*/ ,(int) (0),(int) (1))) {
case 0: {
RDebugUtils.currentLine=53739525;
 //BA.debugLineNum = 53739525;BA.debugLine="If Printer1.IsBluetoothOn = False Then";
if (_printer1._isbluetoothon()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=53739526;
 //BA.debugLineNum = 53739526;BA.debugLine="Msgbox(\"لطفا بلوتوث گوشی خود را فعال نمائید و";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("لطفا بلوتوث گوشی خود را فعال نمائید و دستگاه پرینتر خود را انتخاب کنید."),BA.ObjectToCharSequence(""),mostCurrent.activityBA);
 }else 
{RDebugUtils.currentLine=53739527;
 //BA.debugLineNum = 53739527;BA.debugLine="Else If Printer1.IsConnected = False Then";
if (_printer1._isconnected()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=53739528;
 //BA.debugLineNum = 53739528;BA.debugLine="Printer1.Connect";
_printer1._connect();
 }else {
RDebugUtils.currentLine=53739530;
 //BA.debugLineNum = 53739530;BA.debugLine="PrintBluetooth";
_printbluetooth();
 }}
;
 break; }
case 1: {
RDebugUtils.currentLine=53739535;
 //BA.debugLineNum = 53739535;BA.debugLine="PrintPos";
_printpos();
 break; }
}
;
RDebugUtils.currentLine=53739538;
 //BA.debugLineNum = 53739538;BA.debugLine="End Sub";
return "";
}
public static void  _printbluetooth() throws Exception{
RDebugUtils.currentModule="act_printpic";
if (Debug.shouldDelegate(mostCurrent.activityBA, "printbluetooth", false))
	 {Debug.delegate(mostCurrent.activityBA, "printbluetooth", null); return;}
ResumableSub_PrintBluetooth rsub = new ResumableSub_PrintBluetooth(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_PrintBluetooth extends BA.ResumableSub {
public ResumableSub_PrintBluetooth(ir.parsikhesab.pakhsh.act_printpic parent) {
this.parent = parent;
}
ir.parsikhesab.pakhsh.act_printpic parent;
String _filename = "";
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp1 = null;
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
boolean _highdensity = false;
boolean _dots24 = false;
int _lowxdpi = 0;
int _highxdpi = 0;
int _dots8ydpi = 0;
int _dots24ydpi = 0;
int _maxwidth = 0;
int _xdpi = 0;
int _ydpi = 0;
int _sliceheight = 0;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp = null;
uk.agraham.bluetoothprinter.escposprinter._animage _myimage = null;
int _lastslice = 0;
int _excess = 0;
int _i = 0;
byte[] _slice = null;
int step39;
int limit39;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_printpic";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=53805057;
 //BA.debugLineNum = 53805057;BA.debugLine="Printer1.Reset";
parent._printer1._reset();
RDebugUtils.currentLine=53805058;
 //BA.debugLineNum = 53805058;BA.debugLine="Dim filename As String=MCode.FaktorSelect & \".jpg";
_filename = parent.mostCurrent._mcode._faktorselect /*String*/ +".jpg";
RDebugUtils.currentLine=53805060;
 //BA.debugLineNum = 53805060;BA.debugLine="Dim bmp1 As B4XBitmap = clv1.sv.ScrollViewInnerPa";
_bmp1 = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_bmp1 = parent.mostCurrent._clv1._sv.getScrollViewInnerPanel().Snapshot();
RDebugUtils.currentLine=53805061;
 //BA.debugLineNum = 53805061;BA.debugLine="Dim out As OutputStream";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=53805062;
 //BA.debugLineNum = 53805062;BA.debugLine="out = File.OpenOutput(File.DirInternalCache, file";
_out = anywheresoftware.b4a.keywords.Common.File.OpenOutput(anywheresoftware.b4a.keywords.Common.File.getDirInternalCache(),_filename,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=53805063;
 //BA.debugLineNum = 53805063;BA.debugLine="bmp1.WriteToStream(out, 100, \"JPEG\")";
_bmp1.WriteToStream((java.io.OutputStream)(_out.getObject()),(int) (100),BA.getEnumFromString(android.graphics.Bitmap.CompressFormat.class,"JPEG"));
RDebugUtils.currentLine=53805064;
 //BA.debugLineNum = 53805064;BA.debugLine="out.Close";
_out.Close();
RDebugUtils.currentLine=53805065;
 //BA.debugLineNum = 53805065;BA.debugLine="Sleep(200)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_printpic", "printbluetooth"),(int) (200));
this.state = 18;
return;
case 18:
//C
this.state = 1;
;
RDebugUtils.currentLine=53805066;
 //BA.debugLineNum = 53805066;BA.debugLine="File.Copy(File.DirInternalCache, filename,File.Di";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirInternalCache(),_filename,anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),_filename);
RDebugUtils.currentLine=53805067;
 //BA.debugLineNum = 53805067;BA.debugLine="Sleep(200)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_printpic", "printbluetooth"),(int) (200));
this.state = 19;
return;
case 19:
//C
this.state = 1;
;
RDebugUtils.currentLine=53805069;
 //BA.debugLineNum = 53805069;BA.debugLine="Dim highdensity As Boolean = True";
_highdensity = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=53805070;
 //BA.debugLineNum = 53805070;BA.debugLine="Dim dots24 As Boolean = True";
_dots24 = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=53805073;
 //BA.debugLineNum = 53805073;BA.debugLine="Dim LowXdpi As Int = 90";
_lowxdpi = (int) (90);
RDebugUtils.currentLine=53805074;
 //BA.debugLineNum = 53805074;BA.debugLine="Dim HighXdpi As Int = 180";
_highxdpi = (int) (180);
RDebugUtils.currentLine=53805076;
 //BA.debugLineNum = 53805076;BA.debugLine="Dim dots8Ydpi As Int = 60";
_dots8ydpi = (int) (60);
RDebugUtils.currentLine=53805077;
 //BA.debugLineNum = 53805077;BA.debugLine="Dim dots24Ydpi As Int = 180";
_dots24ydpi = (int) (180);
RDebugUtils.currentLine=53805080;
 //BA.debugLineNum = 53805080;BA.debugLine="Dim maxwidth As Int  = 288";
_maxwidth = (int) (288);
RDebugUtils.currentLine=53805081;
 //BA.debugLineNum = 53805081;BA.debugLine="Dim Xdpi As Int = LowXdpi";
_xdpi = _lowxdpi;
RDebugUtils.currentLine=53805082;
 //BA.debugLineNum = 53805082;BA.debugLine="Dim Ydpi As Int = dots8Ydpi";
_ydpi = _dots8ydpi;
RDebugUtils.currentLine=53805083;
 //BA.debugLineNum = 53805083;BA.debugLine="Dim sliceheight As Int = 8";
_sliceheight = (int) (8);
RDebugUtils.currentLine=53805085;
 //BA.debugLineNum = 53805085;BA.debugLine="If highdensity Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_highdensity) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=53805086;
 //BA.debugLineNum = 53805086;BA.debugLine="maxwidth = 288*2";
_maxwidth = (int) (288*2);
RDebugUtils.currentLine=53805087;
 //BA.debugLineNum = 53805087;BA.debugLine="Xdpi = HighXdpi";
_xdpi = _highxdpi;
 if (true) break;
;
RDebugUtils.currentLine=53805090;
 //BA.debugLineNum = 53805090;BA.debugLine="If dots24 Then";

case 4:
//if
this.state = 7;
if (_dots24) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=53805091;
 //BA.debugLineNum = 53805091;BA.debugLine="Ydpi = dots24Ydpi";
_ydpi = _dots24ydpi;
RDebugUtils.currentLine=53805092;
 //BA.debugLineNum = 53805092;BA.debugLine="sliceheight = 24";
_sliceheight = (int) (24);
 if (true) break;

case 7:
//C
this.state = 8;
;
RDebugUtils.currentLine=53805095;
 //BA.debugLineNum = 53805095;BA.debugLine="Dim bmp As Bitmap";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=53805097;
 //BA.debugLineNum = 53805097;BA.debugLine="bmp.InitializeResize(File.DirDefaultExternal,file";
_bmp.InitializeResize(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),_filename,_maxwidth,(int) (3000),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=53805100;
 //BA.debugLineNum = 53805100;BA.debugLine="bmp = bmp.Resize(bmp.Width, bmp.Height * Ydpi / X";
_bmp = _bmp.Resize((float) (_bmp.getWidth()),(float) (_bmp.getHeight()*_ydpi/(double)_xdpi),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=53805103;
 //BA.debugLineNum = 53805103;BA.debugLine="Dim myimage As AnImage = Printer1.ImageToBWIMage(";
_myimage = parent._printer1._imagetobwimage(_bmp);
RDebugUtils.currentLine=53805108;
 //BA.debugLineNum = 53805108;BA.debugLine="myimage = Printer1.DitherImage2D(myimage, 128)";
_myimage = parent._printer1._ditherimage2d(_myimage,(int) (128));
RDebugUtils.currentLine=53805112;
 //BA.debugLineNum = 53805112;BA.debugLine="Dim lastslice As Int = myimage.Height / sliceheig";
_lastslice = (int) (_myimage.Height/(double)_sliceheight-1);
RDebugUtils.currentLine=53805113;
 //BA.debugLineNum = 53805113;BA.debugLine="Dim excess As Int = myimage.Height * sliceheight";
_excess = (int) (_myimage.Height*_sliceheight-_lastslice);
RDebugUtils.currentLine=53805114;
 //BA.debugLineNum = 53805114;BA.debugLine="If excess > 0 Then lastslice = lastslice - 1";
if (true) break;

case 8:
//if
this.state = 13;
if (_excess>0) { 
this.state = 10;
;}if (true) break;

case 10:
//C
this.state = 13;
_lastslice = (int) (_lastslice-1);
if (true) break;

case 13:
//C
this.state = 14;
;
RDebugUtils.currentLine=53805116;
 //BA.debugLineNum = 53805116;BA.debugLine="Printer1.LineSpacing = 0";
parent._printer1._setlinespacing((int) (0));
RDebugUtils.currentLine=53805117;
 //BA.debugLineNum = 53805117;BA.debugLine="Printer1.WriteString(CRLF) ' to show the user som";
parent._printer1._writestring(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=53805118;
 //BA.debugLineNum = 53805118;BA.debugLine="For i = 0 To lastslice";
if (true) break;

case 14:
//for
this.state = 17;
step39 = 1;
limit39 = _lastslice;
_i = (int) (0) ;
this.state = 20;
if (true) break;

case 20:
//C
this.state = 17;
if ((step39 > 0 && _i <= limit39) || (step39 < 0 && _i >= limit39)) this.state = 16;
if (true) break;

case 21:
//C
this.state = 20;
_i = ((int)(0 + _i + step39)) ;
if (true) break;

case 16:
//C
this.state = 21;
RDebugUtils.currentLine=53805119;
 //BA.debugLineNum = 53805119;BA.debugLine="Dim slice() As Byte = Printer1.PackImageSlice(my";
_slice = parent._printer1._packimageslice(_myimage,_i,_dots24);
RDebugUtils.currentLine=53805120;
 //BA.debugLineNum = 53805120;BA.debugLine="Printer1.PrintImage2(myimage.Width, slice, highd";
parent._printer1._printimage2(_myimage.Width,_slice,_highdensity,_dots24);
RDebugUtils.currentLine=53805121;
 //BA.debugLineNum = 53805121;BA.debugLine="Sleep(350)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_printpic", "printbluetooth"),(int) (350));
this.state = 22;
return;
case 22:
//C
this.state = 21;
;
 if (true) break;
if (true) break;

case 17:
//C
this.state = -1;
;
RDebugUtils.currentLine=53805123;
 //BA.debugLineNum = 53805123;BA.debugLine="Printer1.WriteString(CRLF  & CRLF & \"Ended\" & CRL";
parent._printer1._writestring(anywheresoftware.b4a.keywords.Common.CRLF+anywheresoftware.b4a.keywords.Common.CRLF+"Ended"+anywheresoftware.b4a.keywords.Common.CRLF+anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=53805125;
 //BA.debugLineNum = 53805125;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _printpos() throws Exception{
RDebugUtils.currentModule="act_printpic";
if (Debug.shouldDelegate(mostCurrent.activityBA, "printpos", false))
	 {Debug.delegate(mostCurrent.activityBA, "printpos", null); return;}
ResumableSub_PrintPos rsub = new ResumableSub_PrintPos(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_PrintPos extends BA.ResumableSub {
public ResumableSub_PrintPos(ir.parsikhesab.pakhsh.act_printpic parent) {
this.parent = parent;
}
ir.parsikhesab.pakhsh.act_printpic parent;
String _filename = "";
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp1 = null;
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
String _pathimage = "";
anywheresoftware.b4a.objects.IntentWrapper _intent = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_printpic";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=53870595;
 //BA.debugLineNum = 53870595;BA.debugLine="Dim filename As String=MCode.FaktorSelect & \".jpg";
_filename = parent.mostCurrent._mcode._faktorselect /*String*/ +".jpg";
RDebugUtils.currentLine=53870597;
 //BA.debugLineNum = 53870597;BA.debugLine="Dim bmp1 As B4XBitmap = clv1.sv.ScrollViewInnerPa";
_bmp1 = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_bmp1 = parent.mostCurrent._clv1._sv.getScrollViewInnerPanel().Snapshot();
RDebugUtils.currentLine=53870598;
 //BA.debugLineNum = 53870598;BA.debugLine="Dim out As OutputStream";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=53870599;
 //BA.debugLineNum = 53870599;BA.debugLine="out = File.OpenOutput(File.DirInternalCache, file";
_out = anywheresoftware.b4a.keywords.Common.File.OpenOutput(anywheresoftware.b4a.keywords.Common.File.getDirInternalCache(),_filename,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=53870600;
 //BA.debugLineNum = 53870600;BA.debugLine="bmp1.WriteToStream(out, 100, \"JPEG\")";
_bmp1.WriteToStream((java.io.OutputStream)(_out.getObject()),(int) (100),BA.getEnumFromString(android.graphics.Bitmap.CompressFormat.class,"JPEG"));
RDebugUtils.currentLine=53870601;
 //BA.debugLineNum = 53870601;BA.debugLine="out.Close";
_out.Close();
RDebugUtils.currentLine=53870602;
 //BA.debugLineNum = 53870602;BA.debugLine="Sleep(200)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_printpic", "printpos"),(int) (200));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=53870603;
 //BA.debugLineNum = 53870603;BA.debugLine="File.Copy(File.DirInternalCache, filename,File.Di";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirInternalCache(),_filename,anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),_filename);
RDebugUtils.currentLine=53870604;
 //BA.debugLineNum = 53870604;BA.debugLine="Sleep(200)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_printpic", "printpos"),(int) (200));
this.state = 2;
return;
case 2:
//C
this.state = -1;
;
RDebugUtils.currentLine=53870605;
 //BA.debugLineNum = 53870605;BA.debugLine="Dim pathimage As String=File.Combine(File.DirDefa";
_pathimage = anywheresoftware.b4a.keywords.Common.File.Combine(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),_filename);
RDebugUtils.currentLine=53870606;
 //BA.debugLineNum = 53870606;BA.debugLine="Dim intent As Intent";
_intent = new anywheresoftware.b4a.objects.IntentWrapper();
RDebugUtils.currentLine=53870607;
 //BA.debugLineNum = 53870607;BA.debugLine="intent.Initialize(\"Print\", \"\")";
_intent.Initialize("Print","");
RDebugUtils.currentLine=53870608;
 //BA.debugLineNum = 53870608;BA.debugLine="intent.SetComponent(MCode.PackageNamePosParsian &";
_intent.SetComponent(parent.mostCurrent._mcode._packagenameposparsian /*String*/ +"/.MyJavaService");
RDebugUtils.currentLine=53870610;
 //BA.debugLineNum = 53870610;BA.debugLine="intent.PutExtra(\"imagepath\", pathimage) ' ارسال د";
_intent.PutExtra("imagepath",(Object)(_pathimage));
RDebugUtils.currentLine=53870611;
 //BA.debugLineNum = 53870611;BA.debugLine="intent.PutExtra(\"CompanyName\", \"Parsik\") ' ارسال";
_intent.PutExtra("CompanyName",(Object)("Parsik"));
RDebugUtils.currentLine=53870612;
 //BA.debugLineNum = 53870612;BA.debugLine="StartService(intent)";
anywheresoftware.b4a.keywords.Common.StartService(processBA,(Object)(_intent.getObject()));
RDebugUtils.currentLine=53870614;
 //BA.debugLineNum = 53870614;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _lblsettingbtprinter_click() throws Exception{
RDebugUtils.currentModule="act_printpic";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lblsettingbtprinter_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lblsettingbtprinter_click", null));}
RDebugUtils.currentLine=53673984;
 //BA.debugLineNum = 53673984;BA.debugLine="Private Sub LblSettingBTPrinter_Click";
RDebugUtils.currentLine=53673985;
 //BA.debugLineNum = 53673985;BA.debugLine="Printer1.Connect";
_printer1._connect();
RDebugUtils.currentLine=53673986;
 //BA.debugLineNum = 53673986;BA.debugLine="End Sub";
return "";
}
public static void  _lblshare_click() throws Exception{
RDebugUtils.currentModule="act_printpic";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lblshare_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "lblshare_click", null); return;}
ResumableSub_LblShare_Click rsub = new ResumableSub_LblShare_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_LblShare_Click extends BA.ResumableSub {
public ResumableSub_LblShare_Click(ir.parsikhesab.pakhsh.act_printpic parent) {
this.parent = parent;
}
ir.parsikhesab.pakhsh.act_printpic parent;
String _filename = "";
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp = null;
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
ir.cafetoseeh.PNMultipleSharing _pn = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_printpic";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=53608449;
 //BA.debugLineNum = 53608449;BA.debugLine="Dim filename As String=MCode.FaktorSelect & \".jpg";
_filename = parent.mostCurrent._mcode._faktorselect /*String*/ +".jpg";
RDebugUtils.currentLine=53608451;
 //BA.debugLineNum = 53608451;BA.debugLine="Dim bmp As B4XBitmap = clv1.sv.ScrollViewInnerPan";
_bmp = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_bmp = parent.mostCurrent._clv1._sv.getScrollViewInnerPanel().Snapshot();
RDebugUtils.currentLine=53608452;
 //BA.debugLineNum = 53608452;BA.debugLine="Dim out As OutputStream";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=53608453;
 //BA.debugLineNum = 53608453;BA.debugLine="out = File.OpenOutput(File.DirInternalCache, file";
_out = anywheresoftware.b4a.keywords.Common.File.OpenOutput(anywheresoftware.b4a.keywords.Common.File.getDirInternalCache(),_filename,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=53608454;
 //BA.debugLineNum = 53608454;BA.debugLine="bmp.WriteToStream(out, 100, \"JPEG\")";
_bmp.WriteToStream((java.io.OutputStream)(_out.getObject()),(int) (100),BA.getEnumFromString(android.graphics.Bitmap.CompressFormat.class,"JPEG"));
RDebugUtils.currentLine=53608455;
 //BA.debugLineNum = 53608455;BA.debugLine="out.Close";
_out.Close();
RDebugUtils.currentLine=53608456;
 //BA.debugLineNum = 53608456;BA.debugLine="Sleep(200)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_printpic", "lblshare_click"),(int) (200));
this.state = 7;
return;
case 7:
//C
this.state = 1;
;
RDebugUtils.currentLine=53608457;
 //BA.debugLineNum = 53608457;BA.debugLine="File.Copy(File.DirInternalCache, filename,File.Di";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirInternalCache(),_filename,anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),_filename);
RDebugUtils.currentLine=53608458;
 //BA.debugLineNum = 53608458;BA.debugLine="Sleep(200)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_printpic", "lblshare_click"),(int) (200));
this.state = 8;
return;
case 8:
//C
this.state = 1;
;
RDebugUtils.currentLine=53608462;
 //BA.debugLineNum = 53608462;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 6;
this.catchState = 5;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 6;
this.catchState = 5;
RDebugUtils.currentLine=53608463;
 //BA.debugLineNum = 53608463;BA.debugLine="Dim pn As PNMultipleSharing";
_pn = new ir.cafetoseeh.PNMultipleSharing();
RDebugUtils.currentLine=53608464;
 //BA.debugLineNum = 53608464;BA.debugLine="pn.ShareFileWithCaption(File.DirDefaultExternal,";
_pn.ShareFileWithCaption(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),_filename,"image/*","فاکتور ","اشتراک گذاری");
 if (true) break;

case 5:
//C
this.state = 6;
this.catchState = 0;
RDebugUtils.currentLine=53608466;
 //BA.debugLineNum = 53608466;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("553608466",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=53608467;
 //BA.debugLineNum = 53608467;BA.debugLine="ToastMessageShow(\"برنامه ای جهت اشتراک گذاری یاف";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("برنامه ای جهت اشتراک گذاری یافت نشد"),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;
if (true) break;

case 6:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=53608470;
 //BA.debugLineNum = 53608470;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
processBA.setLastException(e0);}
            }
        }
    }
}
public static String  _lblsign_click() throws Exception{
RDebugUtils.currentModule="act_printpic";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lblsign_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lblsign_click", null));}
RDebugUtils.currentLine=54263808;
 //BA.debugLineNum = 54263808;BA.debugLine="Sub LblSign_Click";
RDebugUtils.currentLine=54263810;
 //BA.debugLineNum = 54263810;BA.debugLine="StartActivity(Act_Emza)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._act_emza.getObject()));
RDebugUtils.currentLine=54263812;
 //BA.debugLineNum = 54263812;BA.debugLine="End Sub";
return "";
}
public static String  _printer_terminated() throws Exception{
RDebugUtils.currentModule="act_printpic";
if (Debug.shouldDelegate(mostCurrent.activityBA, "printer_terminated", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "printer_terminated", null));}
RDebugUtils.currentLine=54132736;
 //BA.debugLineNum = 54132736;BA.debugLine="Private Sub Printer_Terminated";
RDebugUtils.currentLine=54132737;
 //BA.debugLineNum = 54132737;BA.debugLine="ToastMessageShow(\"Connection is terminated.\", Tru";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Connection is terminated."),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=54132739;
 //BA.debugLineNum = 54132739;BA.debugLine="End Sub";
return "";
}
public static String  _printer1_connected(boolean _success) throws Exception{
RDebugUtils.currentModule="act_printpic";
if (Debug.shouldDelegate(mostCurrent.activityBA, "printer1_connected", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "printer1_connected", new Object[] {_success}));}
RDebugUtils.currentLine=53936128;
 //BA.debugLineNum = 53936128;BA.debugLine="Sub Printer1_Connected (Success As Boolean)";
RDebugUtils.currentLine=53936129;
 //BA.debugLineNum = 53936129;BA.debugLine="If Success Then";
if (_success) { 
RDebugUtils.currentLine=53936130;
 //BA.debugLineNum = 53936130;BA.debugLine="ToastMessageShow(\"اتصال پرینتر برقرار شد\", False";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("اتصال پرینتر برقرار شد"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=53936131;
 //BA.debugLineNum = 53936131;BA.debugLine="LblSettingBTPrinter.Enabled=True";
mostCurrent._lblsettingbtprinter.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 }else {
RDebugUtils.currentLine=53936133;
 //BA.debugLineNum = 53936133;BA.debugLine="Msgbox(Printer1.ConnectedErrorMsg, \"خطا در اتصال";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence(_printer1._connectederrormsg()),BA.ObjectToCharSequence("خطا در اتصال پرینتر."),mostCurrent.activityBA);
 };
RDebugUtils.currentLine=53936135;
 //BA.debugLineNum = 53936135;BA.debugLine="End Sub";
return "";
}
public static String  _printer1_error() throws Exception{
RDebugUtils.currentModule="act_printpic";
if (Debug.shouldDelegate(mostCurrent.activityBA, "printer1_error", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "printer1_error", null));}
RDebugUtils.currentLine=54067200;
 //BA.debugLineNum = 54067200;BA.debugLine="Private Sub Printer1_Error";
RDebugUtils.currentLine=54067203;
 //BA.debugLineNum = 54067203;BA.debugLine="End Sub";
return "";
}
public static String  _printer1_newdata(byte[] _buffer) throws Exception{
RDebugUtils.currentModule="act_printpic";
if (Debug.shouldDelegate(mostCurrent.activityBA, "printer1_newdata", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "printer1_newdata", new Object[] {_buffer}));}
RDebugUtils.currentLine=54001664;
 //BA.debugLineNum = 54001664;BA.debugLine="Private Sub Printer1_NewData (Buffer() As Byte)";
RDebugUtils.currentLine=54001665;
 //BA.debugLineNum = 54001665;BA.debugLine="End Sub";
return "";
}
public void _onCreate() { //@cafetoseeh
if (android.os.Build.VERSION.SDK_INT >= 18) {
StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder();
StrictMode.setVmPolicy(builder.build());
//cafetoseeh.ir
builder.detectFileUriExposure();
}}



///////////

}