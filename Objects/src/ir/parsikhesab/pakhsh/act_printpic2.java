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

public class act_printpic2 extends Activity implements B4AActivity{
	public static act_printpic2 mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.act_printpic2");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (act_printpic2).");
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
		activityBA = new BA(this, layout, processBA, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.act_printpic2");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "ir.parsikhesab.pakhsh.act_printpic2", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (act_printpic2) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (act_printpic2) Resume **");
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
		return act_printpic2.class;
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
            BA.LogInfo("** Activity (act_printpic2) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (act_printpic2) Pause event (activity is not paused). **");
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
            act_printpic2 mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (act_printpic2) Resume **");
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
public static anywheresoftware.b4a.objects.collections.List _listkala = null;
public static String _datefactor = "";
public static int _typeprint = 0;
public static uk.agraham.bluetoothprinter.escposprinter _printer1 = null;
public Object _ion = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblprint = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview1 = null;
public b4a.example3.customlistview _clv1 = null;
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
public ir.parsikhesab.pakhsh.act_printpic _act_printpic = null;
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
RDebugUtils.currentModule="act_printpic2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=54722560;
 //BA.debugLineNum = 54722560;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=54722561;
 //BA.debugLineNum = 54722561;BA.debugLine="Activity.LoadLayout(\"L_PrintPic2\")";
mostCurrent._activity.LoadLayout("L_PrintPic2",mostCurrent.activityBA);
RDebugUtils.currentLine=54722563;
 //BA.debugLineNum = 54722563;BA.debugLine="Printer1.Initialize(Me, \"Printer1\")";
_printer1._initialize(processBA,act_printpic2.getObject(),"Printer1");
RDebugUtils.currentLine=54722564;
 //BA.debugLineNum = 54722564;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="act_printpic2";
RDebugUtils.currentLine=54853632;
 //BA.debugLineNum = 54853632;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=54853634;
 //BA.debugLineNum = 54853634;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="act_printpic2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=54788096;
 //BA.debugLineNum = 54788096;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=54788097;
 //BA.debugLineNum = 54788097;BA.debugLine="clv1.Clear";
mostCurrent._clv1._clear();
RDebugUtils.currentLine=54788098;
 //BA.debugLineNum = 54788098;BA.debugLine="Select TypePrint";
switch (_typeprint) {
case 0: {
RDebugUtils.currentLine=54788100;
 //BA.debugLineNum = 54788100;BA.debugLine="CreateReport";
_createreport();
 break; }
case 1: {
RDebugUtils.currentLine=54788102;
 //BA.debugLineNum = 54788102;BA.debugLine="CreateReport2";
_createreport2();
 break; }
}
;
RDebugUtils.currentLine=54788110;
 //BA.debugLineNum = 54788110;BA.debugLine="End Sub";
return "";
}
public static String  _createreport() throws Exception{
RDebugUtils.currentModule="act_printpic2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createreport", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "createreport", null));}
ir.parsikhesab.pakhsh.cls_faktor1_havale_type1 _rec1 = null;
String _date = "";
String _time = "";
String _radif = "";
String _codekala = "";
String _namekala = "";
String _fee = "";
String _darsadtakhfif = "";
String _feetakhfif = "";
String _tedadjoze = "";
String _tedadkol = "";
String _feeyekkarton = "";
String _sharhfactor = "";
int _count = 0;
long _mablaghkhales = 0L;
long _mablaghtakhfif = 0L;
long _mandetalab = 0L;
long _mandetasfienashode = 0L;
long _mablaghekoldaryafti = 0L;
long _mablaghtakhfifdaryafti = 0L;
long _totalfaktor = 0L;
String _signature = "";
long _ghabelepardakht = 0L;
int _i = 0;
ir.parsikhesab.pakhsh.mcode._adapterizfactorhavale _item = null;
ir.parsikhesab.pakhsh.cls_faktor2_havale_type1 _rec2 = null;
String _strmablaghkhales = "";
String _strmablaghtakhfif = "";
String _strmandetalab = "";
String _strmandetasfienashode = "";
String _strmablaghekoldaryafti = "";
String _strmablaghtakhfifdaryafti = "";
String _strtotalfaktor = "";
String _strghabelepardakht = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _dr = null;
ir.parsikhesab.pakhsh.cls_faktor3_havale_type1 _rec3 = null;
RDebugUtils.currentLine=55705600;
 //BA.debugLineNum = 55705600;BA.debugLine="Sub CreateReport";
RDebugUtils.currentLine=55705605;
 //BA.debugLineNum = 55705605;BA.debugLine="Dim rec1 As cls_Faktor1_Havale_Type1";
_rec1 = new ir.parsikhesab.pakhsh.cls_faktor1_havale_type1();
RDebugUtils.currentLine=55705606;
 //BA.debugLineNum = 55705606;BA.debugLine="Dim Date As String= MCode.Sf.Mid(MCode.DatePersia";
_date = mostCurrent._mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvv5(mostCurrent._mcode._datepersian /*String*/ (mostCurrent.activityBA),(int) (1),(int) (4))+"/"+mostCurrent._mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvv5(mostCurrent._mcode._datepersian /*String*/ (mostCurrent.activityBA),(int) (5),(int) (2))+"/"+mostCurrent._mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvv5(mostCurrent._mcode._datepersian /*String*/ (mostCurrent.activityBA),(int) (7),(int) (2));
RDebugUtils.currentLine=55705607;
 //BA.debugLineNum = 55705607;BA.debugLine="Dim DateFactor As String= DateFactor";
_datefactor = _datefactor;
RDebugUtils.currentLine=55705608;
 //BA.debugLineNum = 55705608;BA.debugLine="Dim Time As String=DateTime.Time(DateTime.Now)";
_time = anywheresoftware.b4a.keywords.Common.DateTime.Time(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
RDebugUtils.currentLine=55705609;
 //BA.debugLineNum = 55705609;BA.debugLine="rec1.Initialize(MCode.C_Tafzili,MCode.N_Tafzili,M";
_rec1._initialize /*String*/ (null,mostCurrent.activityBA,mostCurrent._mcode._c_tafzili /*String*/ ,mostCurrent._mcode._n_tafzili /*String*/ ,mostCurrent._mcode._c_visitor /*String*/ ,mostCurrent._mcode._n_visitor /*String*/ ,mostCurrent._mcode._appname /*String*/ ,mostCurrent._mcode._shomarefaktor /*String*/ ,_datefactor,_date,_time,mostCurrent._mcode._tell_tafzili /*String*/ ,mostCurrent._mcode._address_tafzili /*String*/ ,mostCurrent._mcode._companyname /*String*/ ,mostCurrent._mcode._companytell /*String*/ ,mostCurrent._mcode._companyaddress /*String*/ );
RDebugUtils.currentLine=55705610;
 //BA.debugLineNum = 55705610;BA.debugLine="clv1.Add(rec1.Panel,0)";
mostCurrent._clv1._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_rec1._getpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ (null).getObject())),(Object)(0));
RDebugUtils.currentLine=55705616;
 //BA.debugLineNum = 55705616;BA.debugLine="Dim Radif As String";
_radif = "";
RDebugUtils.currentLine=55705617;
 //BA.debugLineNum = 55705617;BA.debugLine="Dim CodeKala As String";
_codekala = "";
RDebugUtils.currentLine=55705618;
 //BA.debugLineNum = 55705618;BA.debugLine="Dim NameKala As String";
_namekala = "";
RDebugUtils.currentLine=55705619;
 //BA.debugLineNum = 55705619;BA.debugLine="Dim Fee As String";
_fee = "";
RDebugUtils.currentLine=55705620;
 //BA.debugLineNum = 55705620;BA.debugLine="Dim DarsadTakhfif As String";
_darsadtakhfif = "";
RDebugUtils.currentLine=55705621;
 //BA.debugLineNum = 55705621;BA.debugLine="Dim FeeTakhfif As String";
_feetakhfif = "";
RDebugUtils.currentLine=55705622;
 //BA.debugLineNum = 55705622;BA.debugLine="Dim TedadJoze As String";
_tedadjoze = "";
RDebugUtils.currentLine=55705623;
 //BA.debugLineNum = 55705623;BA.debugLine="Dim TedadKol As String";
_tedadkol = "";
RDebugUtils.currentLine=55705624;
 //BA.debugLineNum = 55705624;BA.debugLine="Dim FeeYekKarton As String";
_feeyekkarton = "";
RDebugUtils.currentLine=55705625;
 //BA.debugLineNum = 55705625;BA.debugLine="Dim SharhFactor As String";
_sharhfactor = "";
RDebugUtils.currentLine=55705627;
 //BA.debugLineNum = 55705627;BA.debugLine="Dim count As Int=0";
_count = (int) (0);
RDebugUtils.currentLine=55705629;
 //BA.debugLineNum = 55705629;BA.debugLine="Dim MablaghKhales As Long=0";
_mablaghkhales = (long) (0);
RDebugUtils.currentLine=55705630;
 //BA.debugLineNum = 55705630;BA.debugLine="Dim MablaghTakhfif As Long=0";
_mablaghtakhfif = (long) (0);
RDebugUtils.currentLine=55705631;
 //BA.debugLineNum = 55705631;BA.debugLine="Dim MandeTalab As Long=0";
_mandetalab = (long) (0);
RDebugUtils.currentLine=55705632;
 //BA.debugLineNum = 55705632;BA.debugLine="Dim MandeTasfieNashode As Long=0";
_mandetasfienashode = (long) (0);
RDebugUtils.currentLine=55705633;
 //BA.debugLineNum = 55705633;BA.debugLine="Dim MablagheKolDaryafti As Long=0";
_mablaghekoldaryafti = (long) (0);
RDebugUtils.currentLine=55705634;
 //BA.debugLineNum = 55705634;BA.debugLine="Dim MablaghTakhfifDaryafti As Long=0";
_mablaghtakhfifdaryafti = (long) (0);
RDebugUtils.currentLine=55705635;
 //BA.debugLineNum = 55705635;BA.debugLine="Dim TotalFaktor As Long=0";
_totalfaktor = (long) (0);
RDebugUtils.currentLine=55705636;
 //BA.debugLineNum = 55705636;BA.debugLine="Dim Signature As String";
_signature = "";
RDebugUtils.currentLine=55705637;
 //BA.debugLineNum = 55705637;BA.debugLine="Dim GHabelePardakht As Long=0";
_ghabelepardakht = (long) (0);
RDebugUtils.currentLine=55705642;
 //BA.debugLineNum = 55705642;BA.debugLine="For i=0 To Listkala.Size-1";
{
final int step27 = 1;
final int limit27 = (int) (_listkala.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit27 ;_i = _i + step27 ) {
RDebugUtils.currentLine=55705643;
 //BA.debugLineNum = 55705643;BA.debugLine="Dim item As AdapteRizFactorHavale=Listkala.Get(i";
_item = (ir.parsikhesab.pakhsh.mcode._adapterizfactorhavale)(_listkala.Get(_i));
RDebugUtils.currentLine=55705644;
 //BA.debugLineNum = 55705644;BA.debugLine="Radif=i+1";
_radif = BA.NumberToString(_i+1);
RDebugUtils.currentLine=55705645;
 //BA.debugLineNum = 55705645;BA.debugLine="CodeKala=item.fldCodeKala";
_codekala = _item.fldCodeKala /*String*/ ;
RDebugUtils.currentLine=55705646;
 //BA.debugLineNum = 55705646;BA.debugLine="NameKala=item.fldSharhKala";
_namekala = _item.fldSharhKala /*String*/ ;
RDebugUtils.currentLine=55705647;
 //BA.debugLineNum = 55705647;BA.debugLine="Fee=item.fldFeeJoz";
_fee = _item.fldFeeJoz /*String*/ ;
RDebugUtils.currentLine=55705648;
 //BA.debugLineNum = 55705648;BA.debugLine="TedadJoze=item.fldTedadJoz";
_tedadjoze = _item.fldTedadJoz /*String*/ ;
RDebugUtils.currentLine=55705649;
 //BA.debugLineNum = 55705649;BA.debugLine="TedadKol=item.fldTedadCarton";
_tedadkol = _item.fldTedadCarton /*String*/ ;
RDebugUtils.currentLine=55705651;
 //BA.debugLineNum = 55705651;BA.debugLine="If  item.fldMablaghTakhfif>0 Then";
if ((double)(Double.parseDouble(_item.fldMablaghTakhfif /*String*/ ))>0) { 
RDebugUtils.currentLine=55705652;
 //BA.debugLineNum = 55705652;BA.debugLine="FeeTakhfif=item.fldMablaghTakhfif";
_feetakhfif = _item.fldMablaghTakhfif /*String*/ ;
 }else {
RDebugUtils.currentLine=55705655;
 //BA.debugLineNum = 55705655;BA.debugLine="FeeTakhfif=0";
_feetakhfif = BA.NumberToString(0);
 };
RDebugUtils.currentLine=55705657;
 //BA.debugLineNum = 55705657;BA.debugLine="If item.fldDarsadTakhfif=0 And item.fldDarsadTak";
if ((_item.fldDarsadTakhfif /*String*/ ).equals(BA.NumberToString(0)) && (double)(Double.parseDouble(_item.fldDarsadTakhfif /*String*/ ))>0) { 
RDebugUtils.currentLine=55705658;
 //BA.debugLineNum = 55705658;BA.debugLine="DarsadTakhfif=item.fldDarsadTakhfif";
_darsadtakhfif = _item.fldDarsadTakhfif /*String*/ ;
 }else {
RDebugUtils.currentLine=55705661;
 //BA.debugLineNum = 55705661;BA.debugLine="DarsadTakhfif=0";
_darsadtakhfif = BA.NumberToString(0);
 };
RDebugUtils.currentLine=55705664;
 //BA.debugLineNum = 55705664;BA.debugLine="FeeYekKarton=item.fldFeeYekCarton";
_feeyekkarton = _item.fldFeeYekCarton /*String*/ ;
RDebugUtils.currentLine=55705665;
 //BA.debugLineNum = 55705665;BA.debugLine="Signature=item.fldSignature";
_signature = _item.fldSignature /*String*/ ;
RDebugUtils.currentLine=55705667;
 //BA.debugLineNum = 55705667;BA.debugLine="Dim rec2 As cls_Faktor2_Havale_Type1";
_rec2 = new ir.parsikhesab.pakhsh.cls_faktor2_havale_type1();
RDebugUtils.currentLine=55705668;
 //BA.debugLineNum = 55705668;BA.debugLine="rec2.Initialize(Radif,CodeKala,NameKala,myCode.A";
_rec2._initialize /*String*/ (null,mostCurrent.activityBA,_radif,_codekala,_namekala,mostCurrent._mycode._adadtoprice /*String*/ (mostCurrent.activityBA,_fee),mostCurrent._mycode._adadtoprice /*String*/ (mostCurrent.activityBA,_feeyekkarton),mostCurrent._mycode._adadtoprice /*String*/ (mostCurrent.activityBA,_feetakhfif),_darsadtakhfif,_tedadjoze,_tedadkol);
RDebugUtils.currentLine=55705669;
 //BA.debugLineNum = 55705669;BA.debugLine="SharhFactor=item.fldSharhFactor";
_sharhfactor = _item.fldSharhFactor /*String*/ ;
RDebugUtils.currentLine=55705670;
 //BA.debugLineNum = 55705670;BA.debugLine="clv1.Add(rec2.Panel,i)";
mostCurrent._clv1._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_rec2._getpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ (null).getObject())),(Object)(_i));
RDebugUtils.currentLine=55705673;
 //BA.debugLineNum = 55705673;BA.debugLine="MablaghKhales=MablaghKhales+item.fldMablaghKhale";
_mablaghkhales = (long) (_mablaghkhales+(double)(Double.parseDouble(_item.fldMablaghKhales /*String*/ )));
RDebugUtils.currentLine=55705674;
 //BA.debugLineNum = 55705674;BA.debugLine="MablaghTakhfif=MablaghTakhfif+item.fldMablaghTak";
_mablaghtakhfif = (long) (_mablaghtakhfif+(double)(Double.parseDouble(_item.fldMablaghTakhfif /*String*/ )));
RDebugUtils.currentLine=55705675;
 //BA.debugLineNum = 55705675;BA.debugLine="MandeTalab=item.fldMandeTalab";
_mandetalab = (long)(Double.parseDouble(_item.fldMandeTalab /*String*/ ));
RDebugUtils.currentLine=55705676;
 //BA.debugLineNum = 55705676;BA.debugLine="MandeTasfieNashode=item.fldMandeTasfieNashode";
_mandetasfienashode = (long)(Double.parseDouble(_item.fldMandeTasfieNashode /*String*/ ));
RDebugUtils.currentLine=55705677;
 //BA.debugLineNum = 55705677;BA.debugLine="MablagheKolDaryafti=item.fldMablagheKolDaryafti";
_mablaghekoldaryafti = (long)(Double.parseDouble(_item.fldMablagheKolDaryafti /*String*/ ));
 }
};
RDebugUtils.currentLine=55705680;
 //BA.debugLineNum = 55705680;BA.debugLine="TotalFaktor=MablaghKhales+MablaghTakhfif";
_totalfaktor = (long) (_mablaghkhales+_mablaghtakhfif);
RDebugUtils.currentLine=55705681;
 //BA.debugLineNum = 55705681;BA.debugLine="Dim StrMablaghKhales As String=0";
_strmablaghkhales = BA.NumberToString(0);
RDebugUtils.currentLine=55705682;
 //BA.debugLineNum = 55705682;BA.debugLine="Dim StrMablaghTakhfif As String=0";
_strmablaghtakhfif = BA.NumberToString(0);
RDebugUtils.currentLine=55705683;
 //BA.debugLineNum = 55705683;BA.debugLine="Dim StrMandeTalab As String=0";
_strmandetalab = BA.NumberToString(0);
RDebugUtils.currentLine=55705684;
 //BA.debugLineNum = 55705684;BA.debugLine="Dim StrMandeTasfieNashode As String=0";
_strmandetasfienashode = BA.NumberToString(0);
RDebugUtils.currentLine=55705685;
 //BA.debugLineNum = 55705685;BA.debugLine="Dim StrMablagheKolDaryafti As String=0";
_strmablaghekoldaryafti = BA.NumberToString(0);
RDebugUtils.currentLine=55705686;
 //BA.debugLineNum = 55705686;BA.debugLine="Dim StrMablaghTakhfifDaryafti As String=0";
_strmablaghtakhfifdaryafti = BA.NumberToString(0);
RDebugUtils.currentLine=55705687;
 //BA.debugLineNum = 55705687;BA.debugLine="Dim StrTotalFaktor As String=0";
_strtotalfaktor = BA.NumberToString(0);
RDebugUtils.currentLine=55705688;
 //BA.debugLineNum = 55705688;BA.debugLine="Dim StrGHabelePardakht As String=0";
_strghabelepardakht = BA.NumberToString(0);
RDebugUtils.currentLine=55705689;
 //BA.debugLineNum = 55705689;BA.debugLine="Dim dr As Cursor=MCode.Result(\"select * from TblD";
_dr = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_dr = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"select * from TblDaryaft where fldShomareFactor="+mostCurrent._mcode._shomarefaktor /*String*/ );
RDebugUtils.currentLine=55705690;
 //BA.debugLineNum = 55705690;BA.debugLine="If dr.RowCount>0 Then";
if (_dr.getRowCount()>0) { 
RDebugUtils.currentLine=55705691;
 //BA.debugLineNum = 55705691;BA.debugLine="MablagheKolDaryafti=MCode.SingleResult(\"select s";
_mablaghekoldaryafti = BA.ObjectToLongNumber(mostCurrent._mcode._singleresult /*Object*/ (mostCurrent.activityBA,"select sum(fldMablaghDaryafti) as fldMablaghDaryafti from TblDaryaft where fldType<>3 and fldShomareFactor="+mostCurrent._mcode._shomarefaktor /*String*/ ));
RDebugUtils.currentLine=55705692;
 //BA.debugLineNum = 55705692;BA.debugLine="MablaghTakhfifDaryafti=MCode.SingleResult(\"selec";
_mablaghtakhfifdaryafti = BA.ObjectToLongNumber(mostCurrent._mcode._singleresult /*Object*/ (mostCurrent.activityBA,"select sum(FldMablaghTakhfif) as fldMablaghTakhfifDaryafti from TblDaryaft where fldType=3 and fldShomareFactor="+mostCurrent._mcode._shomarefaktor /*String*/ ));
RDebugUtils.currentLine=55705695;
 //BA.debugLineNum = 55705695;BA.debugLine="MandeTasfieNashode=MablaghKhales-MablagheKolDary";
_mandetasfienashode = (long) (_mablaghkhales-_mablaghekoldaryafti);
RDebugUtils.currentLine=55705696;
 //BA.debugLineNum = 55705696;BA.debugLine="StrMablaghTakhfifDaryafti=NumberFormat(myCode.Is";
_strmablaghtakhfifdaryafti = anywheresoftware.b4a.keywords.Common.NumberFormat((double)(Double.parseDouble(mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,BA.NumberToString(_mablaghtakhfifdaryafti)))),(int) (1),(int) (3))+" "+mostCurrent._mcode._vahedpool /*String*/ ;
RDebugUtils.currentLine=55705697;
 //BA.debugLineNum = 55705697;BA.debugLine="StrGHabelePardakht = NumberFormat(myCode.Is_Null";
_strghabelepardakht = anywheresoftware.b4a.keywords.Common.NumberFormat((double)(Double.parseDouble(mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,BA.NumberToString(_mandetalab)))),(int) (1),(int) (3))+" "+mostCurrent._mcode._vahedpool /*String*/ ;
 }else {
RDebugUtils.currentLine=55705699;
 //BA.debugLineNum = 55705699;BA.debugLine="StrGHabelePardakht = NumberFormat(myCode.Is_Null";
_strghabelepardakht = anywheresoftware.b4a.keywords.Common.NumberFormat((double)(Double.parseDouble(mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,BA.NumberToString(_mablaghkhales)))),(int) (1),(int) (3))+" "+mostCurrent._mcode._vahedpool /*String*/ ;
 };
RDebugUtils.currentLine=55705702;
 //BA.debugLineNum = 55705702;BA.debugLine="StrMablaghKhales = myCode.AdadToPrice(MablaghKhal";
_strmablaghkhales = mostCurrent._mycode._adadtoprice /*String*/ (mostCurrent.activityBA,BA.NumberToString(_mablaghkhales));
RDebugUtils.currentLine=55705703;
 //BA.debugLineNum = 55705703;BA.debugLine="StrTotalFaktor = myCode.AdadToPrice(TotalFaktor)";
_strtotalfaktor = mostCurrent._mycode._adadtoprice /*String*/ (mostCurrent.activityBA,BA.NumberToString(_totalfaktor));
RDebugUtils.currentLine=55705705;
 //BA.debugLineNum = 55705705;BA.debugLine="StrMablaghTakhfif = myCode.AdadToPrice(MablaghTak";
_strmablaghtakhfif = mostCurrent._mycode._adadtoprice /*String*/ (mostCurrent.activityBA,BA.NumberToString(_mablaghtakhfif));
RDebugUtils.currentLine=55705706;
 //BA.debugLineNum = 55705706;BA.debugLine="StrMandeTalab = myCode.AdadToPrice(MandeTalab)";
_strmandetalab = mostCurrent._mycode._adadtoprice /*String*/ (mostCurrent.activityBA,BA.NumberToString(_mandetalab));
RDebugUtils.currentLine=55705707;
 //BA.debugLineNum = 55705707;BA.debugLine="StrMandeTasfieNashode = myCode.AdadToPrice(MandeT";
_strmandetasfienashode = mostCurrent._mycode._adadtoprice /*String*/ (mostCurrent.activityBA,BA.NumberToString(_mandetasfienashode));
RDebugUtils.currentLine=55705708;
 //BA.debugLineNum = 55705708;BA.debugLine="StrMablagheKolDaryafti = myCode.AdadToPrice(Mabla";
_strmablaghekoldaryafti = mostCurrent._mycode._adadtoprice /*String*/ (mostCurrent.activityBA,BA.NumberToString(_mablaghekoldaryafti));
RDebugUtils.currentLine=55705711;
 //BA.debugLineNum = 55705711;BA.debugLine="Dim rec3 As cls_Faktor3_Havale_Type1";
_rec3 = new ir.parsikhesab.pakhsh.cls_faktor3_havale_type1();
RDebugUtils.currentLine=55705712;
 //BA.debugLineNum = 55705712;BA.debugLine="rec3.Initialize(StrGHabelePardakht,StrMablaghKhal";
_rec3._initialize /*String*/ (null,mostCurrent.activityBA,_strghabelepardakht,_strmablaghkhales,_strmablaghtakhfifdaryafti,_strmandetasfienashode,_strmablaghtakhfif,_strmablaghekoldaryafti,_strtotalfaktor,_sharhfactor,_signature);
RDebugUtils.currentLine=55705714;
 //BA.debugLineNum = 55705714;BA.debugLine="clv1.Add(rec3.Panel,count+1)";
mostCurrent._clv1._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_rec3._getpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ (null).getObject())),(Object)(_count+1));
RDebugUtils.currentLine=55705716;
 //BA.debugLineNum = 55705716;BA.debugLine="End Sub";
return "";
}
public static String  _createreport2() throws Exception{
RDebugUtils.currentModule="act_printpic2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createreport2", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "createreport2", null));}
ir.parsikhesab.pakhsh.cls_faktor1_havale_type2 _rec1 = null;
String _date = "";
String _time = "";
String _radif = "";
String _codekala = "";
String _namekala = "";
String _fee = "";
String _darsadtakhfif = "";
String _feetakhfif = "";
String _tedadjoze = "";
String _tedadkol = "";
String _feeyekkarton = "";
String _sharhfactor = "";
int _count = 0;
long _mablaghkhales = 0L;
long _mablaghtakhfif = 0L;
long _mandetalab = 0L;
long _mandetasfienashode = 0L;
long _mablaghekoldaryafti = 0L;
long _mablaghtakhfifdaryafti = 0L;
long _totalfaktor = 0L;
String _signature = "";
long _ghabelepardakht = 0L;
int _i = 0;
ir.parsikhesab.pakhsh.mcode._adapterizfactorhavale _item = null;
ir.parsikhesab.pakhsh.cls_faktor2_havale_type2 _rec2 = null;
String _strmablaghkhales = "";
String _strmablaghtakhfif = "";
String _strmandetalab = "";
String _strmandetasfienashode = "";
String _strmablaghekoldaryafti = "";
String _strmablaghtakhfifdaryafti = "";
String _strtotalfaktor = "";
String _strghabelepardakht = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _dr = null;
ir.parsikhesab.pakhsh.cls_faktor3_havale_type2 _rec3 = null;
RDebugUtils.currentLine=55771136;
 //BA.debugLineNum = 55771136;BA.debugLine="Sub CreateReport2";
RDebugUtils.currentLine=55771141;
 //BA.debugLineNum = 55771141;BA.debugLine="Dim rec1 As cls_Faktor1_Havale_Type2";
_rec1 = new ir.parsikhesab.pakhsh.cls_faktor1_havale_type2();
RDebugUtils.currentLine=55771142;
 //BA.debugLineNum = 55771142;BA.debugLine="Dim Date As String= MCode.Sf.Mid(MCode.DatePersia";
_date = mostCurrent._mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvv5(mostCurrent._mcode._datepersian /*String*/ (mostCurrent.activityBA),(int) (1),(int) (4))+"/"+mostCurrent._mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvv5(mostCurrent._mcode._datepersian /*String*/ (mostCurrent.activityBA),(int) (5),(int) (2))+"/"+mostCurrent._mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvv5(mostCurrent._mcode._datepersian /*String*/ (mostCurrent.activityBA),(int) (7),(int) (2));
RDebugUtils.currentLine=55771143;
 //BA.debugLineNum = 55771143;BA.debugLine="Dim DateFactor As String= DateFactor";
_datefactor = _datefactor;
RDebugUtils.currentLine=55771144;
 //BA.debugLineNum = 55771144;BA.debugLine="Dim Time As String=DateTime.Time(DateTime.Now)";
_time = anywheresoftware.b4a.keywords.Common.DateTime.Time(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
RDebugUtils.currentLine=55771145;
 //BA.debugLineNum = 55771145;BA.debugLine="rec1.Initialize(MCode.C_Tafzili,MCode.N_Tafzili,M";
_rec1._initialize /*String*/ (null,mostCurrent.activityBA,mostCurrent._mcode._c_tafzili /*String*/ ,mostCurrent._mcode._n_tafzili /*String*/ ,mostCurrent._mcode._c_visitor /*String*/ ,mostCurrent._mcode._n_visitor /*String*/ ,mostCurrent._mcode._appname /*String*/ ,mostCurrent._mcode._shomarefaktor /*String*/ ,_datefactor,_date,_time,mostCurrent._mcode._tell_tafzili /*String*/ ,mostCurrent._mcode._address_tafzili /*String*/ ,mostCurrent._mcode._companyname /*String*/ ,mostCurrent._mcode._companytell /*String*/ ,mostCurrent._mcode._companyaddress /*String*/ );
RDebugUtils.currentLine=55771146;
 //BA.debugLineNum = 55771146;BA.debugLine="clv1.Add(rec1.Panel,0)";
mostCurrent._clv1._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_rec1._getpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ (null).getObject())),(Object)(0));
RDebugUtils.currentLine=55771152;
 //BA.debugLineNum = 55771152;BA.debugLine="Dim Radif As String";
_radif = "";
RDebugUtils.currentLine=55771153;
 //BA.debugLineNum = 55771153;BA.debugLine="Dim CodeKala As String";
_codekala = "";
RDebugUtils.currentLine=55771154;
 //BA.debugLineNum = 55771154;BA.debugLine="Dim NameKala As String";
_namekala = "";
RDebugUtils.currentLine=55771155;
 //BA.debugLineNum = 55771155;BA.debugLine="Dim Fee As String";
_fee = "";
RDebugUtils.currentLine=55771156;
 //BA.debugLineNum = 55771156;BA.debugLine="Dim DarsadTakhfif As String";
_darsadtakhfif = "";
RDebugUtils.currentLine=55771157;
 //BA.debugLineNum = 55771157;BA.debugLine="Dim FeeTakhfif As String";
_feetakhfif = "";
RDebugUtils.currentLine=55771158;
 //BA.debugLineNum = 55771158;BA.debugLine="Dim TedadJoze As String";
_tedadjoze = "";
RDebugUtils.currentLine=55771159;
 //BA.debugLineNum = 55771159;BA.debugLine="Dim TedadKol As String";
_tedadkol = "";
RDebugUtils.currentLine=55771160;
 //BA.debugLineNum = 55771160;BA.debugLine="Dim FeeYekKarton As String";
_feeyekkarton = "";
RDebugUtils.currentLine=55771161;
 //BA.debugLineNum = 55771161;BA.debugLine="Dim SharhFactor As String";
_sharhfactor = "";
RDebugUtils.currentLine=55771163;
 //BA.debugLineNum = 55771163;BA.debugLine="Dim count As Int=0";
_count = (int) (0);
RDebugUtils.currentLine=55771165;
 //BA.debugLineNum = 55771165;BA.debugLine="Dim MablaghKhales As Long=0";
_mablaghkhales = (long) (0);
RDebugUtils.currentLine=55771166;
 //BA.debugLineNum = 55771166;BA.debugLine="Dim MablaghTakhfif As Long=0";
_mablaghtakhfif = (long) (0);
RDebugUtils.currentLine=55771167;
 //BA.debugLineNum = 55771167;BA.debugLine="Dim MandeTalab As Long=0";
_mandetalab = (long) (0);
RDebugUtils.currentLine=55771168;
 //BA.debugLineNum = 55771168;BA.debugLine="Dim MandeTasfieNashode As Long=0";
_mandetasfienashode = (long) (0);
RDebugUtils.currentLine=55771169;
 //BA.debugLineNum = 55771169;BA.debugLine="Dim MablagheKolDaryafti As Long=0";
_mablaghekoldaryafti = (long) (0);
RDebugUtils.currentLine=55771170;
 //BA.debugLineNum = 55771170;BA.debugLine="Dim MablaghTakhfifDaryafti As Long=0";
_mablaghtakhfifdaryafti = (long) (0);
RDebugUtils.currentLine=55771171;
 //BA.debugLineNum = 55771171;BA.debugLine="Dim TotalFaktor As Long=0";
_totalfaktor = (long) (0);
RDebugUtils.currentLine=55771172;
 //BA.debugLineNum = 55771172;BA.debugLine="Dim Signature As String";
_signature = "";
RDebugUtils.currentLine=55771173;
 //BA.debugLineNum = 55771173;BA.debugLine="Dim GHabelePardakht As Long=0";
_ghabelepardakht = (long) (0);
RDebugUtils.currentLine=55771178;
 //BA.debugLineNum = 55771178;BA.debugLine="For i=0 To Listkala.Size-1";
{
final int step27 = 1;
final int limit27 = (int) (_listkala.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit27 ;_i = _i + step27 ) {
RDebugUtils.currentLine=55771179;
 //BA.debugLineNum = 55771179;BA.debugLine="Dim item As AdapteRizFactorHavale=Listkala.Get(i";
_item = (ir.parsikhesab.pakhsh.mcode._adapterizfactorhavale)(_listkala.Get(_i));
RDebugUtils.currentLine=55771180;
 //BA.debugLineNum = 55771180;BA.debugLine="Radif=i+1";
_radif = BA.NumberToString(_i+1);
RDebugUtils.currentLine=55771181;
 //BA.debugLineNum = 55771181;BA.debugLine="CodeKala=item.fldCodeKala";
_codekala = _item.fldCodeKala /*String*/ ;
RDebugUtils.currentLine=55771182;
 //BA.debugLineNum = 55771182;BA.debugLine="NameKala=item.fldSharhKala";
_namekala = _item.fldSharhKala /*String*/ ;
RDebugUtils.currentLine=55771183;
 //BA.debugLineNum = 55771183;BA.debugLine="Fee=item.fldFeeJoz";
_fee = _item.fldFeeJoz /*String*/ ;
RDebugUtils.currentLine=55771184;
 //BA.debugLineNum = 55771184;BA.debugLine="TedadJoze=item.fldTedadJoz";
_tedadjoze = _item.fldTedadJoz /*String*/ ;
RDebugUtils.currentLine=55771185;
 //BA.debugLineNum = 55771185;BA.debugLine="TedadKol=item.fldTedadCarton";
_tedadkol = _item.fldTedadCarton /*String*/ ;
RDebugUtils.currentLine=55771187;
 //BA.debugLineNum = 55771187;BA.debugLine="If  item.fldMablaghTakhfif>0 Then";
if ((double)(Double.parseDouble(_item.fldMablaghTakhfif /*String*/ ))>0) { 
RDebugUtils.currentLine=55771188;
 //BA.debugLineNum = 55771188;BA.debugLine="FeeTakhfif=item.fldMablaghTakhfif";
_feetakhfif = _item.fldMablaghTakhfif /*String*/ ;
 }else {
RDebugUtils.currentLine=55771191;
 //BA.debugLineNum = 55771191;BA.debugLine="FeeTakhfif=0";
_feetakhfif = BA.NumberToString(0);
 };
RDebugUtils.currentLine=55771193;
 //BA.debugLineNum = 55771193;BA.debugLine="If item.fldDarsadTakhfif=0 And item.fldDarsadTak";
if ((_item.fldDarsadTakhfif /*String*/ ).equals(BA.NumberToString(0)) && (double)(Double.parseDouble(_item.fldDarsadTakhfif /*String*/ ))>0) { 
RDebugUtils.currentLine=55771194;
 //BA.debugLineNum = 55771194;BA.debugLine="DarsadTakhfif=item.fldDarsadTakhfif";
_darsadtakhfif = _item.fldDarsadTakhfif /*String*/ ;
 }else {
RDebugUtils.currentLine=55771197;
 //BA.debugLineNum = 55771197;BA.debugLine="DarsadTakhfif=0";
_darsadtakhfif = BA.NumberToString(0);
 };
RDebugUtils.currentLine=55771200;
 //BA.debugLineNum = 55771200;BA.debugLine="FeeYekKarton=item.fldFeeYekCarton";
_feeyekkarton = _item.fldFeeYekCarton /*String*/ ;
RDebugUtils.currentLine=55771201;
 //BA.debugLineNum = 55771201;BA.debugLine="Signature=item.fldSignature";
_signature = _item.fldSignature /*String*/ ;
RDebugUtils.currentLine=55771203;
 //BA.debugLineNum = 55771203;BA.debugLine="Dim rec2 As cls_Faktor2_Havale_Type2";
_rec2 = new ir.parsikhesab.pakhsh.cls_faktor2_havale_type2();
RDebugUtils.currentLine=55771204;
 //BA.debugLineNum = 55771204;BA.debugLine="rec2.Initialize(Radif,CodeKala,NameKala,myCode.A";
_rec2._initialize /*String*/ (null,mostCurrent.activityBA,_radif,_codekala,_namekala,mostCurrent._mycode._adadtoprice /*String*/ (mostCurrent.activityBA,_fee),mostCurrent._mycode._adadtoprice /*String*/ (mostCurrent.activityBA,_feeyekkarton),mostCurrent._mycode._adadtoprice /*String*/ (mostCurrent.activityBA,_feetakhfif),_darsadtakhfif,_tedadjoze,_tedadkol);
RDebugUtils.currentLine=55771205;
 //BA.debugLineNum = 55771205;BA.debugLine="SharhFactor=item.fldSharhFactor";
_sharhfactor = _item.fldSharhFactor /*String*/ ;
RDebugUtils.currentLine=55771206;
 //BA.debugLineNum = 55771206;BA.debugLine="clv1.Add(rec2.Panel,i)";
mostCurrent._clv1._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_rec2._getpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ (null).getObject())),(Object)(_i));
RDebugUtils.currentLine=55771209;
 //BA.debugLineNum = 55771209;BA.debugLine="MablaghKhales=MablaghKhales+item.fldMablaghKhale";
_mablaghkhales = (long) (_mablaghkhales+(double)(Double.parseDouble(_item.fldMablaghKhales /*String*/ )));
RDebugUtils.currentLine=55771210;
 //BA.debugLineNum = 55771210;BA.debugLine="MablaghTakhfif=MablaghTakhfif+item.fldMablaghTak";
_mablaghtakhfif = (long) (_mablaghtakhfif+(double)(Double.parseDouble(_item.fldMablaghTakhfif /*String*/ )));
RDebugUtils.currentLine=55771211;
 //BA.debugLineNum = 55771211;BA.debugLine="MandeTalab=item.fldMandeTalab";
_mandetalab = (long)(Double.parseDouble(_item.fldMandeTalab /*String*/ ));
RDebugUtils.currentLine=55771212;
 //BA.debugLineNum = 55771212;BA.debugLine="MandeTasfieNashode=item.fldMandeTasfieNashode";
_mandetasfienashode = (long)(Double.parseDouble(_item.fldMandeTasfieNashode /*String*/ ));
RDebugUtils.currentLine=55771213;
 //BA.debugLineNum = 55771213;BA.debugLine="MablagheKolDaryafti=item.fldMablagheKolDaryafti";
_mablaghekoldaryafti = (long)(Double.parseDouble(_item.fldMablagheKolDaryafti /*String*/ ));
 }
};
RDebugUtils.currentLine=55771216;
 //BA.debugLineNum = 55771216;BA.debugLine="TotalFaktor=MablaghKhales+MablaghTakhfif";
_totalfaktor = (long) (_mablaghkhales+_mablaghtakhfif);
RDebugUtils.currentLine=55771217;
 //BA.debugLineNum = 55771217;BA.debugLine="Dim StrMablaghKhales As String=0";
_strmablaghkhales = BA.NumberToString(0);
RDebugUtils.currentLine=55771218;
 //BA.debugLineNum = 55771218;BA.debugLine="Dim StrMablaghTakhfif As String=0";
_strmablaghtakhfif = BA.NumberToString(0);
RDebugUtils.currentLine=55771219;
 //BA.debugLineNum = 55771219;BA.debugLine="Dim StrMandeTalab As String=0";
_strmandetalab = BA.NumberToString(0);
RDebugUtils.currentLine=55771220;
 //BA.debugLineNum = 55771220;BA.debugLine="Dim StrMandeTasfieNashode As String=0";
_strmandetasfienashode = BA.NumberToString(0);
RDebugUtils.currentLine=55771221;
 //BA.debugLineNum = 55771221;BA.debugLine="Dim StrMablagheKolDaryafti As String=0";
_strmablaghekoldaryafti = BA.NumberToString(0);
RDebugUtils.currentLine=55771222;
 //BA.debugLineNum = 55771222;BA.debugLine="Dim StrMablaghTakhfifDaryafti As String=0";
_strmablaghtakhfifdaryafti = BA.NumberToString(0);
RDebugUtils.currentLine=55771223;
 //BA.debugLineNum = 55771223;BA.debugLine="Dim StrTotalFaktor As String=0";
_strtotalfaktor = BA.NumberToString(0);
RDebugUtils.currentLine=55771224;
 //BA.debugLineNum = 55771224;BA.debugLine="Dim StrGHabelePardakht As String=0";
_strghabelepardakht = BA.NumberToString(0);
RDebugUtils.currentLine=55771225;
 //BA.debugLineNum = 55771225;BA.debugLine="Dim dr As Cursor=MCode.Result(\"select * from TblD";
_dr = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_dr = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"select * from TblDaryaft where fldShomareFactor="+mostCurrent._mcode._shomarefaktor /*String*/ );
RDebugUtils.currentLine=55771226;
 //BA.debugLineNum = 55771226;BA.debugLine="If dr.RowCount>0 Then";
if (_dr.getRowCount()>0) { 
RDebugUtils.currentLine=55771227;
 //BA.debugLineNum = 55771227;BA.debugLine="MablagheKolDaryafti=MCode.SingleResult(\"select s";
_mablaghekoldaryafti = BA.ObjectToLongNumber(mostCurrent._mcode._singleresult /*Object*/ (mostCurrent.activityBA,"select sum(fldMablaghDaryafti) as fldMablaghDaryafti from TblDaryaft where fldType<>3 and fldShomareFactor="+mostCurrent._mcode._shomarefaktor /*String*/ ));
RDebugUtils.currentLine=55771228;
 //BA.debugLineNum = 55771228;BA.debugLine="MablaghTakhfifDaryafti=MCode.SingleResult(\"selec";
_mablaghtakhfifdaryafti = BA.ObjectToLongNumber(mostCurrent._mcode._singleresult /*Object*/ (mostCurrent.activityBA,"select sum(FldMablaghTakhfif) as fldMablaghTakhfifDaryafti from TblDaryaft where fldType=3 and fldShomareFactor="+mostCurrent._mcode._shomarefaktor /*String*/ ));
RDebugUtils.currentLine=55771231;
 //BA.debugLineNum = 55771231;BA.debugLine="MandeTasfieNashode=MablaghKhales-MablagheKolDary";
_mandetasfienashode = (long) (_mablaghkhales-_mablaghekoldaryafti);
RDebugUtils.currentLine=55771232;
 //BA.debugLineNum = 55771232;BA.debugLine="StrMablaghTakhfifDaryafti=NumberFormat(myCode.Is";
_strmablaghtakhfifdaryafti = anywheresoftware.b4a.keywords.Common.NumberFormat((double)(Double.parseDouble(mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,BA.NumberToString(_mablaghtakhfifdaryafti)))),(int) (1),(int) (3))+" "+mostCurrent._mcode._vahedpool /*String*/ ;
RDebugUtils.currentLine=55771233;
 //BA.debugLineNum = 55771233;BA.debugLine="StrGHabelePardakht = NumberFormat(myCode.Is_Null";
_strghabelepardakht = anywheresoftware.b4a.keywords.Common.NumberFormat((double)(Double.parseDouble(mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,BA.NumberToString(_mandetalab)))),(int) (1),(int) (3))+" "+mostCurrent._mcode._vahedpool /*String*/ ;
 }else {
RDebugUtils.currentLine=55771235;
 //BA.debugLineNum = 55771235;BA.debugLine="StrGHabelePardakht = NumberFormat(myCode.Is_Null";
_strghabelepardakht = anywheresoftware.b4a.keywords.Common.NumberFormat((double)(Double.parseDouble(mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,BA.NumberToString(_mablaghkhales)))),(int) (1),(int) (3))+" "+mostCurrent._mcode._vahedpool /*String*/ ;
 };
RDebugUtils.currentLine=55771238;
 //BA.debugLineNum = 55771238;BA.debugLine="StrMablaghKhales = myCode.AdadToPrice(MablaghKhal";
_strmablaghkhales = mostCurrent._mycode._adadtoprice /*String*/ (mostCurrent.activityBA,BA.NumberToString(_mablaghkhales));
RDebugUtils.currentLine=55771239;
 //BA.debugLineNum = 55771239;BA.debugLine="StrTotalFaktor = myCode.AdadToPrice(TotalFaktor)";
_strtotalfaktor = mostCurrent._mycode._adadtoprice /*String*/ (mostCurrent.activityBA,BA.NumberToString(_totalfaktor));
RDebugUtils.currentLine=55771241;
 //BA.debugLineNum = 55771241;BA.debugLine="StrMablaghTakhfif = myCode.AdadToPrice(MablaghTak";
_strmablaghtakhfif = mostCurrent._mycode._adadtoprice /*String*/ (mostCurrent.activityBA,BA.NumberToString(_mablaghtakhfif));
RDebugUtils.currentLine=55771242;
 //BA.debugLineNum = 55771242;BA.debugLine="StrMandeTalab = myCode.AdadToPrice(MandeTalab)";
_strmandetalab = mostCurrent._mycode._adadtoprice /*String*/ (mostCurrent.activityBA,BA.NumberToString(_mandetalab));
RDebugUtils.currentLine=55771243;
 //BA.debugLineNum = 55771243;BA.debugLine="StrMandeTasfieNashode = myCode.AdadToPrice(MandeT";
_strmandetasfienashode = mostCurrent._mycode._adadtoprice /*String*/ (mostCurrent.activityBA,BA.NumberToString(_mandetasfienashode));
RDebugUtils.currentLine=55771244;
 //BA.debugLineNum = 55771244;BA.debugLine="StrMablagheKolDaryafti = myCode.AdadToPrice(Mabla";
_strmablaghekoldaryafti = mostCurrent._mycode._adadtoprice /*String*/ (mostCurrent.activityBA,BA.NumberToString(_mablaghekoldaryafti));
RDebugUtils.currentLine=55771247;
 //BA.debugLineNum = 55771247;BA.debugLine="Dim rec3 As cls_Faktor3_Havale_Type2";
_rec3 = new ir.parsikhesab.pakhsh.cls_faktor3_havale_type2();
RDebugUtils.currentLine=55771248;
 //BA.debugLineNum = 55771248;BA.debugLine="rec3.Initialize(StrGHabelePardakht,StrMablaghKhal";
_rec3._initialize /*String*/ (null,mostCurrent.activityBA,_strghabelepardakht,_strmablaghkhales,_strmablaghtakhfifdaryafti,_strmandetasfienashode,_strmablaghtakhfif,_strmablaghekoldaryafti,_strtotalfaktor,_sharhfactor,_signature);
RDebugUtils.currentLine=55771250;
 //BA.debugLineNum = 55771250;BA.debugLine="clv1.Add(rec3.Panel,count+1)";
mostCurrent._clv1._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_rec3._getpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ (null).getObject())),(Object)(_count+1));
RDebugUtils.currentLine=55771252;
 //BA.debugLineNum = 55771252;BA.debugLine="End Sub";
return "";
}
public static String  _btn_back_click() throws Exception{
RDebugUtils.currentModule="act_printpic2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_back_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_back_click", null));}
RDebugUtils.currentLine=55836672;
 //BA.debugLineNum = 55836672;BA.debugLine="Sub btn_Back_Click";
RDebugUtils.currentLine=55836673;
 //BA.debugLineNum = 55836673;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=55836674;
 //BA.debugLineNum = 55836674;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper  _crop_image(anywheresoftware.b4a.objects.B4XViewWrapper _v,int _left,int _top,int _width,int _height) throws Exception{
RDebugUtils.currentModule="act_printpic2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "crop_image", false))
	 {return ((anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) Debug.delegate(mostCurrent.activityBA, "crop_image", new Object[] {_v,_left,_top,_width,_height}));}
RDebugUtils.currentLine=54984704;
 //BA.debugLineNum = 54984704;BA.debugLine="Sub Crop_Image(V As B4XView, left As Int, top As I";
RDebugUtils.currentLine=54984706;
 //BA.debugLineNum = 54984706;BA.debugLine="Return V.Snapshot.Crop(left, top, width, height)";
if (true) return (anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(_v.Snapshot().Crop(_left,_top,_width,_height).getObject()));
RDebugUtils.currentLine=54984708;
 //BA.debugLineNum = 54984708;BA.debugLine="End Sub";
return null;
}
public static Object  _getba() throws Exception{
RDebugUtils.currentModule="act_printpic2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "getba", false))
	 {return ((Object) Debug.delegate(mostCurrent.activityBA, "getba", null));}
anywheresoftware.b4j.object.JavaObject _jo = null;
String _cls = "";
RDebugUtils.currentLine=55640064;
 //BA.debugLineNum = 55640064;BA.debugLine="Sub GetBA As Object";
RDebugUtils.currentLine=55640065;
 //BA.debugLineNum = 55640065;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=55640066;
 //BA.debugLineNum = 55640066;BA.debugLine="Dim cls As String = Me";
_cls = BA.ObjectToString(act_printpic2.getObject());
RDebugUtils.currentLine=55640067;
 //BA.debugLineNum = 55640067;BA.debugLine="cls = cls.SubString(\"class \".Length)";
_cls = _cls.substring("class ".length());
RDebugUtils.currentLine=55640068;
 //BA.debugLineNum = 55640068;BA.debugLine="jo.InitializeStatic(cls)";
_jo.InitializeStatic(_cls);
RDebugUtils.currentLine=55640069;
 //BA.debugLineNum = 55640069;BA.debugLine="Return jo.GetField(\"processBA\")";
if (true) return _jo.GetField("processBA");
RDebugUtils.currentLine=55640070;
 //BA.debugLineNum = 55640070;BA.debugLine="End Sub";
return null;
}
public static String  _lblprint_click() throws Exception{
RDebugUtils.currentModule="act_printpic2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lblprint_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lblprint_click", null));}
RDebugUtils.currentLine=55115776;
 //BA.debugLineNum = 55115776;BA.debugLine="Private Sub LblPrint_Click";
RDebugUtils.currentLine=55115778;
 //BA.debugLineNum = 55115778;BA.debugLine="Select MCode.PrinterType";
switch (BA.switchObjectToInt(mostCurrent._mcode._printertype /*int*/ ,(int) (0),(int) (1))) {
case 0: {
RDebugUtils.currentLine=55115781;
 //BA.debugLineNum = 55115781;BA.debugLine="If Printer1.IsBluetoothOn = False Then";
if (_printer1._isbluetoothon()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=55115782;
 //BA.debugLineNum = 55115782;BA.debugLine="Msgbox(\"لطفا بلوتوث گوشی خود را فعال نمائید و";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("لطفا بلوتوث گوشی خود را فعال نمائید و دستگاه پرینتر خود را انتخاب کنید."),BA.ObjectToCharSequence(""),mostCurrent.activityBA);
 }else 
{RDebugUtils.currentLine=55115783;
 //BA.debugLineNum = 55115783;BA.debugLine="Else If Printer1.IsConnected = False Then";
if (_printer1._isconnected()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=55115784;
 //BA.debugLineNum = 55115784;BA.debugLine="Printer1.Connect";
_printer1._connect();
 }else {
RDebugUtils.currentLine=55115786;
 //BA.debugLineNum = 55115786;BA.debugLine="PrintBluetooth";
_printbluetooth();
 }}
;
 break; }
case 1: {
RDebugUtils.currentLine=55115791;
 //BA.debugLineNum = 55115791;BA.debugLine="PrintPos";
_printpos();
 break; }
}
;
RDebugUtils.currentLine=55115794;
 //BA.debugLineNum = 55115794;BA.debugLine="End Sub";
return "";
}
public static void  _printbluetooth() throws Exception{
RDebugUtils.currentModule="act_printpic2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "printbluetooth", false))
	 {Debug.delegate(mostCurrent.activityBA, "printbluetooth", null); return;}
ResumableSub_PrintBluetooth rsub = new ResumableSub_PrintBluetooth(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_PrintBluetooth extends BA.ResumableSub {
public ResumableSub_PrintBluetooth(ir.parsikhesab.pakhsh.act_printpic2 parent) {
this.parent = parent;
}
ir.parsikhesab.pakhsh.act_printpic2 parent;
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
RDebugUtils.currentModule="act_printpic2";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=55181313;
 //BA.debugLineNum = 55181313;BA.debugLine="Printer1.Reset";
parent._printer1._reset();
RDebugUtils.currentLine=55181314;
 //BA.debugLineNum = 55181314;BA.debugLine="Dim filename As String=MCode.FaktorSelect & \".jpg";
_filename = parent.mostCurrent._mcode._faktorselect /*String*/ +".jpg";
RDebugUtils.currentLine=55181316;
 //BA.debugLineNum = 55181316;BA.debugLine="Dim bmp1 As B4XBitmap = clv1.sv.ScrollViewInnerPa";
_bmp1 = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_bmp1 = parent.mostCurrent._clv1._sv.getScrollViewInnerPanel().Snapshot();
RDebugUtils.currentLine=55181317;
 //BA.debugLineNum = 55181317;BA.debugLine="Dim out As OutputStream";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=55181318;
 //BA.debugLineNum = 55181318;BA.debugLine="out = File.OpenOutput(File.DirInternalCache, file";
_out = anywheresoftware.b4a.keywords.Common.File.OpenOutput(anywheresoftware.b4a.keywords.Common.File.getDirInternalCache(),_filename,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=55181319;
 //BA.debugLineNum = 55181319;BA.debugLine="bmp1.WriteToStream(out, 100, \"JPEG\")";
_bmp1.WriteToStream((java.io.OutputStream)(_out.getObject()),(int) (100),BA.getEnumFromString(android.graphics.Bitmap.CompressFormat.class,"JPEG"));
RDebugUtils.currentLine=55181320;
 //BA.debugLineNum = 55181320;BA.debugLine="out.Close";
_out.Close();
RDebugUtils.currentLine=55181321;
 //BA.debugLineNum = 55181321;BA.debugLine="Sleep(200)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_printpic2", "printbluetooth"),(int) (200));
this.state = 18;
return;
case 18:
//C
this.state = 1;
;
RDebugUtils.currentLine=55181322;
 //BA.debugLineNum = 55181322;BA.debugLine="File.Copy(File.DirInternalCache, filename,File.Di";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirInternalCache(),_filename,anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),_filename);
RDebugUtils.currentLine=55181323;
 //BA.debugLineNum = 55181323;BA.debugLine="Sleep(200)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_printpic2", "printbluetooth"),(int) (200));
this.state = 19;
return;
case 19:
//C
this.state = 1;
;
RDebugUtils.currentLine=55181325;
 //BA.debugLineNum = 55181325;BA.debugLine="Dim highdensity As Boolean = True";
_highdensity = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=55181326;
 //BA.debugLineNum = 55181326;BA.debugLine="Dim dots24 As Boolean = True";
_dots24 = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=55181329;
 //BA.debugLineNum = 55181329;BA.debugLine="Dim LowXdpi As Int = 90";
_lowxdpi = (int) (90);
RDebugUtils.currentLine=55181330;
 //BA.debugLineNum = 55181330;BA.debugLine="Dim HighXdpi As Int = 180";
_highxdpi = (int) (180);
RDebugUtils.currentLine=55181332;
 //BA.debugLineNum = 55181332;BA.debugLine="Dim dots8Ydpi As Int = 60";
_dots8ydpi = (int) (60);
RDebugUtils.currentLine=55181333;
 //BA.debugLineNum = 55181333;BA.debugLine="Dim dots24Ydpi As Int = 180";
_dots24ydpi = (int) (180);
RDebugUtils.currentLine=55181336;
 //BA.debugLineNum = 55181336;BA.debugLine="Dim maxwidth As Int  = 288";
_maxwidth = (int) (288);
RDebugUtils.currentLine=55181337;
 //BA.debugLineNum = 55181337;BA.debugLine="Dim Xdpi As Int = LowXdpi";
_xdpi = _lowxdpi;
RDebugUtils.currentLine=55181338;
 //BA.debugLineNum = 55181338;BA.debugLine="Dim Ydpi As Int = dots8Ydpi";
_ydpi = _dots8ydpi;
RDebugUtils.currentLine=55181339;
 //BA.debugLineNum = 55181339;BA.debugLine="Dim sliceheight As Int = 8";
_sliceheight = (int) (8);
RDebugUtils.currentLine=55181341;
 //BA.debugLineNum = 55181341;BA.debugLine="If highdensity Then";
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
RDebugUtils.currentLine=55181342;
 //BA.debugLineNum = 55181342;BA.debugLine="maxwidth = 288*2";
_maxwidth = (int) (288*2);
RDebugUtils.currentLine=55181343;
 //BA.debugLineNum = 55181343;BA.debugLine="Xdpi = HighXdpi";
_xdpi = _highxdpi;
 if (true) break;
;
RDebugUtils.currentLine=55181346;
 //BA.debugLineNum = 55181346;BA.debugLine="If dots24 Then";

case 4:
//if
this.state = 7;
if (_dots24) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=55181347;
 //BA.debugLineNum = 55181347;BA.debugLine="Ydpi = dots24Ydpi";
_ydpi = _dots24ydpi;
RDebugUtils.currentLine=55181348;
 //BA.debugLineNum = 55181348;BA.debugLine="sliceheight = 24";
_sliceheight = (int) (24);
 if (true) break;

case 7:
//C
this.state = 8;
;
RDebugUtils.currentLine=55181351;
 //BA.debugLineNum = 55181351;BA.debugLine="Dim bmp As Bitmap";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=55181353;
 //BA.debugLineNum = 55181353;BA.debugLine="bmp.InitializeResize(File.DirDefaultExternal,file";
_bmp.InitializeResize(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),_filename,_maxwidth,(int) (3000),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=55181356;
 //BA.debugLineNum = 55181356;BA.debugLine="bmp = bmp.Resize(bmp.Width, bmp.Height * Ydpi / X";
_bmp = _bmp.Resize((float) (_bmp.getWidth()),(float) (_bmp.getHeight()*_ydpi/(double)_xdpi),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=55181359;
 //BA.debugLineNum = 55181359;BA.debugLine="Dim myimage As AnImage = Printer1.ImageToBWIMage(";
_myimage = parent._printer1._imagetobwimage(_bmp);
RDebugUtils.currentLine=55181364;
 //BA.debugLineNum = 55181364;BA.debugLine="myimage = Printer1.DitherImage2D(myimage, 128)";
_myimage = parent._printer1._ditherimage2d(_myimage,(int) (128));
RDebugUtils.currentLine=55181368;
 //BA.debugLineNum = 55181368;BA.debugLine="Dim lastslice As Int = myimage.Height / sliceheig";
_lastslice = (int) (_myimage.Height/(double)_sliceheight-1);
RDebugUtils.currentLine=55181369;
 //BA.debugLineNum = 55181369;BA.debugLine="Dim excess As Int = myimage.Height * sliceheight";
_excess = (int) (_myimage.Height*_sliceheight-_lastslice);
RDebugUtils.currentLine=55181370;
 //BA.debugLineNum = 55181370;BA.debugLine="If excess > 0 Then lastslice = lastslice - 1";
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
RDebugUtils.currentLine=55181372;
 //BA.debugLineNum = 55181372;BA.debugLine="Printer1.LineSpacing = 0";
parent._printer1._setlinespacing((int) (0));
RDebugUtils.currentLine=55181373;
 //BA.debugLineNum = 55181373;BA.debugLine="Printer1.WriteString(CRLF) ' to show the user som";
parent._printer1._writestring(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=55181374;
 //BA.debugLineNum = 55181374;BA.debugLine="For i = 0 To lastslice";
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
RDebugUtils.currentLine=55181375;
 //BA.debugLineNum = 55181375;BA.debugLine="Dim slice() As Byte = Printer1.PackImageSlice(my";
_slice = parent._printer1._packimageslice(_myimage,_i,_dots24);
RDebugUtils.currentLine=55181376;
 //BA.debugLineNum = 55181376;BA.debugLine="Printer1.PrintImage2(myimage.Width, slice, highd";
parent._printer1._printimage2(_myimage.Width,_slice,_highdensity,_dots24);
RDebugUtils.currentLine=55181377;
 //BA.debugLineNum = 55181377;BA.debugLine="Sleep(350)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_printpic2", "printbluetooth"),(int) (350));
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
RDebugUtils.currentLine=55181379;
 //BA.debugLineNum = 55181379;BA.debugLine="Printer1.WriteString(CRLF  & CRLF & \"Ended\" & CRL";
parent._printer1._writestring(anywheresoftware.b4a.keywords.Common.CRLF+anywheresoftware.b4a.keywords.Common.CRLF+"Ended"+anywheresoftware.b4a.keywords.Common.CRLF+anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=55181381;
 //BA.debugLineNum = 55181381;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _printpos() throws Exception{
RDebugUtils.currentModule="act_printpic2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "printpos", false))
	 {Debug.delegate(mostCurrent.activityBA, "printpos", null); return;}
ResumableSub_PrintPos rsub = new ResumableSub_PrintPos(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_PrintPos extends BA.ResumableSub {
public ResumableSub_PrintPos(ir.parsikhesab.pakhsh.act_printpic2 parent) {
this.parent = parent;
}
ir.parsikhesab.pakhsh.act_printpic2 parent;
String _filename = "";
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp1 = null;
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
String _pathimage = "";
anywheresoftware.b4a.objects.IntentWrapper _intent = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_printpic2";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=55246851;
 //BA.debugLineNum = 55246851;BA.debugLine="Dim filename As String=MCode.FaktorSelect & \".jpg";
_filename = parent.mostCurrent._mcode._faktorselect /*String*/ +".jpg";
RDebugUtils.currentLine=55246853;
 //BA.debugLineNum = 55246853;BA.debugLine="Dim bmp1 As B4XBitmap = clv1.sv.ScrollViewInnerPa";
_bmp1 = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_bmp1 = parent.mostCurrent._clv1._sv.getScrollViewInnerPanel().Snapshot();
RDebugUtils.currentLine=55246854;
 //BA.debugLineNum = 55246854;BA.debugLine="Dim out As OutputStream";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=55246855;
 //BA.debugLineNum = 55246855;BA.debugLine="out = File.OpenOutput(File.DirInternalCache, file";
_out = anywheresoftware.b4a.keywords.Common.File.OpenOutput(anywheresoftware.b4a.keywords.Common.File.getDirInternalCache(),_filename,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=55246856;
 //BA.debugLineNum = 55246856;BA.debugLine="bmp1.WriteToStream(out, 100, \"JPEG\")";
_bmp1.WriteToStream((java.io.OutputStream)(_out.getObject()),(int) (100),BA.getEnumFromString(android.graphics.Bitmap.CompressFormat.class,"JPEG"));
RDebugUtils.currentLine=55246857;
 //BA.debugLineNum = 55246857;BA.debugLine="out.Close";
_out.Close();
RDebugUtils.currentLine=55246858;
 //BA.debugLineNum = 55246858;BA.debugLine="Sleep(200)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_printpic2", "printpos"),(int) (200));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=55246859;
 //BA.debugLineNum = 55246859;BA.debugLine="File.Copy(File.DirInternalCache, filename,File.Di";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirInternalCache(),_filename,anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),_filename);
RDebugUtils.currentLine=55246860;
 //BA.debugLineNum = 55246860;BA.debugLine="Sleep(200)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_printpic2", "printpos"),(int) (200));
this.state = 2;
return;
case 2:
//C
this.state = -1;
;
RDebugUtils.currentLine=55246861;
 //BA.debugLineNum = 55246861;BA.debugLine="Dim pathimage As String=File.Combine(File.DirDefa";
_pathimage = anywheresoftware.b4a.keywords.Common.File.Combine(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),_filename);
RDebugUtils.currentLine=55246862;
 //BA.debugLineNum = 55246862;BA.debugLine="Dim intent As Intent";
_intent = new anywheresoftware.b4a.objects.IntentWrapper();
RDebugUtils.currentLine=55246863;
 //BA.debugLineNum = 55246863;BA.debugLine="intent.Initialize(\"Print\", \"\")";
_intent.Initialize("Print","");
RDebugUtils.currentLine=55246864;
 //BA.debugLineNum = 55246864;BA.debugLine="intent.SetComponent(MCode.PackageNamePosParsian &";
_intent.SetComponent(parent.mostCurrent._mcode._packagenameposparsian /*String*/ +"/.MyJavaService");
RDebugUtils.currentLine=55246866;
 //BA.debugLineNum = 55246866;BA.debugLine="intent.PutExtra(\"imagepath\", pathimage) ' ارسال د";
_intent.PutExtra("imagepath",(Object)(_pathimage));
RDebugUtils.currentLine=55246867;
 //BA.debugLineNum = 55246867;BA.debugLine="intent.PutExtra(\"CompanyName\", \"Parsik\") ' ارسال";
_intent.PutExtra("CompanyName",(Object)("Parsik"));
RDebugUtils.currentLine=55246868;
 //BA.debugLineNum = 55246868;BA.debugLine="StartService(intent)";
anywheresoftware.b4a.keywords.Common.StartService(processBA,(Object)(_intent.getObject()));
RDebugUtils.currentLine=55246870;
 //BA.debugLineNum = 55246870;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _lblsettingbtprinter_click() throws Exception{
RDebugUtils.currentModule="act_printpic2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lblsettingbtprinter_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lblsettingbtprinter_click", null));}
RDebugUtils.currentLine=55050240;
 //BA.debugLineNum = 55050240;BA.debugLine="Private Sub LblSettingBTPrinter_Click";
RDebugUtils.currentLine=55050241;
 //BA.debugLineNum = 55050241;BA.debugLine="Printer1.Connect";
_printer1._connect();
RDebugUtils.currentLine=55050242;
 //BA.debugLineNum = 55050242;BA.debugLine="End Sub";
return "";
}
public static void  _lblshare_click() throws Exception{
RDebugUtils.currentModule="act_printpic2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lblshare_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "lblshare_click", null); return;}
ResumableSub_LblShare_Click rsub = new ResumableSub_LblShare_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_LblShare_Click extends BA.ResumableSub {
public ResumableSub_LblShare_Click(ir.parsikhesab.pakhsh.act_printpic2 parent) {
this.parent = parent;
}
ir.parsikhesab.pakhsh.act_printpic2 parent;
String _filename = "";
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp = null;
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
ir.cafetoseeh.PNMultipleSharing _pn = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_printpic2";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=54919169;
 //BA.debugLineNum = 54919169;BA.debugLine="Dim filename As String=MCode.FaktorSelect & \".jpg";
_filename = parent.mostCurrent._mcode._faktorselect /*String*/ +".jpg";
RDebugUtils.currentLine=54919171;
 //BA.debugLineNum = 54919171;BA.debugLine="Dim bmp As B4XBitmap = clv1.sv.ScrollViewInnerPan";
_bmp = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_bmp = parent.mostCurrent._clv1._sv.getScrollViewInnerPanel().Snapshot();
RDebugUtils.currentLine=54919172;
 //BA.debugLineNum = 54919172;BA.debugLine="Dim out As OutputStream";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=54919173;
 //BA.debugLineNum = 54919173;BA.debugLine="out = File.OpenOutput(File.DirInternalCache, file";
_out = anywheresoftware.b4a.keywords.Common.File.OpenOutput(anywheresoftware.b4a.keywords.Common.File.getDirInternalCache(),_filename,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=54919174;
 //BA.debugLineNum = 54919174;BA.debugLine="bmp.WriteToStream(out, 100, \"JPEG\")";
_bmp.WriteToStream((java.io.OutputStream)(_out.getObject()),(int) (100),BA.getEnumFromString(android.graphics.Bitmap.CompressFormat.class,"JPEG"));
RDebugUtils.currentLine=54919175;
 //BA.debugLineNum = 54919175;BA.debugLine="out.Close";
_out.Close();
RDebugUtils.currentLine=54919176;
 //BA.debugLineNum = 54919176;BA.debugLine="Sleep(200)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_printpic2", "lblshare_click"),(int) (200));
this.state = 7;
return;
case 7:
//C
this.state = 1;
;
RDebugUtils.currentLine=54919177;
 //BA.debugLineNum = 54919177;BA.debugLine="File.Copy(File.DirInternalCache, filename,File.Di";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirInternalCache(),_filename,anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),_filename);
RDebugUtils.currentLine=54919178;
 //BA.debugLineNum = 54919178;BA.debugLine="Sleep(200)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_printpic2", "lblshare_click"),(int) (200));
this.state = 8;
return;
case 8:
//C
this.state = 1;
;
RDebugUtils.currentLine=54919179;
 //BA.debugLineNum = 54919179;BA.debugLine="Try";
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
RDebugUtils.currentLine=54919180;
 //BA.debugLineNum = 54919180;BA.debugLine="Dim pn As PNMultipleSharing";
_pn = new ir.cafetoseeh.PNMultipleSharing();
RDebugUtils.currentLine=54919181;
 //BA.debugLineNum = 54919181;BA.debugLine="pn.ShareFileWithCaption(File.DirDefaultExternal,";
_pn.ShareFileWithCaption(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),_filename,"image/*","فاکتور ","اشتراک گذاری");
 if (true) break;

case 5:
//C
this.state = 6;
this.catchState = 0;
RDebugUtils.currentLine=54919183;
 //BA.debugLineNum = 54919183;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("554919183",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=54919184;
 //BA.debugLineNum = 54919184;BA.debugLine="ToastMessageShow(\"برنامه ای جهت اشتراک گذاری یاف";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("برنامه ای جهت اشتراک گذاری یافت نشد"),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;
if (true) break;

case 6:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=54919187;
 //BA.debugLineNum = 54919187;BA.debugLine="End Sub";
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
public static String  _printer_terminated() throws Exception{
RDebugUtils.currentModule="act_printpic2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "printer_terminated", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "printer_terminated", null));}
RDebugUtils.currentLine=55508992;
 //BA.debugLineNum = 55508992;BA.debugLine="Private Sub Printer_Terminated";
RDebugUtils.currentLine=55508993;
 //BA.debugLineNum = 55508993;BA.debugLine="ToastMessageShow(\"Connection is terminated.\", Tru";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Connection is terminated."),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=55508995;
 //BA.debugLineNum = 55508995;BA.debugLine="End Sub";
return "";
}
public static String  _printer1_connected(boolean _success) throws Exception{
RDebugUtils.currentModule="act_printpic2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "printer1_connected", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "printer1_connected", new Object[] {_success}));}
RDebugUtils.currentLine=55312384;
 //BA.debugLineNum = 55312384;BA.debugLine="Sub Printer1_Connected (Success As Boolean)";
RDebugUtils.currentLine=55312385;
 //BA.debugLineNum = 55312385;BA.debugLine="If Success Then";
if (_success) { 
RDebugUtils.currentLine=55312386;
 //BA.debugLineNum = 55312386;BA.debugLine="ToastMessageShow(\"اتصال پرینتر برقرار شد\", False";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("اتصال پرینتر برقرار شد"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=55312387;
 //BA.debugLineNum = 55312387;BA.debugLine="LblSettingBTPrinter.Enabled=True";
mostCurrent._lblsettingbtprinter.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 }else {
RDebugUtils.currentLine=55312389;
 //BA.debugLineNum = 55312389;BA.debugLine="Msgbox(Printer1.ConnectedErrorMsg, \"خطا در اتصال";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence(_printer1._connectederrormsg()),BA.ObjectToCharSequence("خطا در اتصال پرینتر."),mostCurrent.activityBA);
 };
RDebugUtils.currentLine=55312391;
 //BA.debugLineNum = 55312391;BA.debugLine="End Sub";
return "";
}
public static String  _printer1_error() throws Exception{
RDebugUtils.currentModule="act_printpic2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "printer1_error", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "printer1_error", null));}
RDebugUtils.currentLine=55443456;
 //BA.debugLineNum = 55443456;BA.debugLine="Private Sub Printer1_Error";
RDebugUtils.currentLine=55443459;
 //BA.debugLineNum = 55443459;BA.debugLine="End Sub";
return "";
}
public static String  _printer1_newdata(byte[] _buffer) throws Exception{
RDebugUtils.currentModule="act_printpic2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "printer1_newdata", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "printer1_newdata", new Object[] {_buffer}));}
RDebugUtils.currentLine=55377920;
 //BA.debugLineNum = 55377920;BA.debugLine="Private Sub Printer1_NewData (Buffer() As Byte)";
RDebugUtils.currentLine=55377921;
 //BA.debugLineNum = 55377921;BA.debugLine="End Sub";
return "";
}
public static String  _startactivityforresult(anywheresoftware.b4a.objects.IntentWrapper _i) throws Exception{
RDebugUtils.currentModule="act_printpic2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "startactivityforresult", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "startactivityforresult", new Object[] {_i}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=55574528;
 //BA.debugLineNum = 55574528;BA.debugLine="Sub StartActivityForResult(i As Intent)";
RDebugUtils.currentLine=55574529;
 //BA.debugLineNum = 55574529;BA.debugLine="Dim jo As JavaObject = GetBA";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_getba()));
RDebugUtils.currentLine=55574530;
 //BA.debugLineNum = 55574530;BA.debugLine="ion = jo.CreateEvent(\"anywheresoftware.b4a.IOnAct";
mostCurrent._ion = _jo.CreateEvent(processBA,"anywheresoftware.b4a.IOnActivityResult","ion",anywheresoftware.b4a.keywords.Common.Null);
RDebugUtils.currentLine=55574531;
 //BA.debugLineNum = 55574531;BA.debugLine="jo.RunMethod(\"startActivityForResult\", Array As O";
_jo.RunMethod("startActivityForResult",new Object[]{mostCurrent._ion,(Object)(_i.getObject())});
RDebugUtils.currentLine=55574532;
 //BA.debugLineNum = 55574532;BA.debugLine="End Sub";
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