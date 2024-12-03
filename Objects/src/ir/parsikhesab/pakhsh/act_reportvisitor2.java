package ir.parsikhesab.pakhsh;


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

public class act_reportvisitor2 extends Activity implements B4AActivity{
	public static act_reportvisitor2 mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.act_reportvisitor2");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (act_reportvisitor2).");
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
		activityBA = new BA(this, layout, processBA, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.act_reportvisitor2");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "ir.parsikhesab.pakhsh.act_reportvisitor2", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (act_reportvisitor2) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (act_reportvisitor2) Resume **");
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
		return act_reportvisitor2.class;
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
            BA.LogInfo("** Activity (act_reportvisitor2) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (act_reportvisitor2) Pause event (activity is not paused). **");
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
            act_reportvisitor2 mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (act_reportvisitor2) Resume **");
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
public ir.parsikhesab.pakhsh.table _table1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlgrid = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltedadfaktor = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblsumfaktor = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblpoorsant = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnaz = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnta = null;
public static String _dateaz = "";
public static String _dateta = "";
public anywheresoftware.b4a.objects.collections.List _lstreport = null;
public static long[] _titlereport = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _img_chart = null;
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
RDebugUtils.currentModule="act_reportvisitor2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=65077248;
 //BA.debugLineNum = 65077248;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=65077249;
 //BA.debugLineNum = 65077249;BA.debugLine="Activity.LoadLayout(\"L_ReportVisitor2\")";
mostCurrent._activity.LoadLayout("L_ReportVisitor2",mostCurrent.activityBA);
RDebugUtils.currentLine=65077250;
 //BA.debugLineNum = 65077250;BA.debugLine="LstReport.Initialize";
mostCurrent._lstreport.Initialize();
RDebugUtils.currentLine=65077251;
 //BA.debugLineNum = 65077251;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="act_reportvisitor2";
RDebugUtils.currentLine=65273856;
 //BA.debugLineNum = 65273856;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=65273858;
 //BA.debugLineNum = 65273858;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="act_reportvisitor2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=65208320;
 //BA.debugLineNum = 65208320;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=65208322;
 //BA.debugLineNum = 65208322;BA.debugLine="End Sub";
return "";
}
public static boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
RDebugUtils.currentModule="act_reportvisitor2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "application_error", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "application_error", new Object[] {_error,_stacktrace}));}
RDebugUtils.currentLine=66191360;
 //BA.debugLineNum = 66191360;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
RDebugUtils.currentLine=66191362;
 //BA.debugLineNum = 66191362;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=66191363;
 //BA.debugLineNum = 66191363;BA.debugLine="End Sub";
return false;
}
public static String  _btnaz_click() throws Exception{
RDebugUtils.currentModule="act_reportvisitor2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnaz_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnaz_click", null));}
com.porya.datetimepicker.PersianMaterialDatePickerWrapper _p = null;
RDebugUtils.currentLine=65470464;
 //BA.debugLineNum = 65470464;BA.debugLine="Sub BtnAz_Click";
RDebugUtils.currentLine=65470465;
 //BA.debugLineNum = 65470465;BA.debugLine="Dim p As PersianMaterialDatePicker";
_p = new com.porya.datetimepicker.PersianMaterialDatePickerWrapper();
RDebugUtils.currentLine=65470466;
 //BA.debugLineNum = 65470466;BA.debugLine="p.Initialize(\"p\",p.PersianYear,p.PersianMonth,p.P";
_p.Initialize(mostCurrent.activityBA,"p",_p.getPersianYear(),_p.getPersianMonth(),_p.getPersianDay());
RDebugUtils.currentLine=65470467;
 //BA.debugLineNum = 65470467;BA.debugLine="p.AccentColor = Colors.RGB(83,99,255)";
_p.setAccentColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (83),(int) (99),(int) (255)));
RDebugUtils.currentLine=65470468;
 //BA.debugLineNum = 65470468;BA.debugLine="p.OkText = \"تایید\"";
_p.setOkText("تایید");
RDebugUtils.currentLine=65470469;
 //BA.debugLineNum = 65470469;BA.debugLine="p.CancelText = \"لغو\"";
_p.setCancelText("لغو");
RDebugUtils.currentLine=65470470;
 //BA.debugLineNum = 65470470;BA.debugLine="p.Title = \"از تاریخ\"";
_p.setTitle("از تاریخ");
RDebugUtils.currentLine=65470471;
 //BA.debugLineNum = 65470471;BA.debugLine="p.Typeface = \"iransansmonospacednum.ttf\"";
_p.setTypeface("iransansmonospacednum.ttf");
RDebugUtils.currentLine=65470472;
 //BA.debugLineNum = 65470472;BA.debugLine="p.Show(\"p\")";
_p.Show("p");
RDebugUtils.currentLine=65470473;
 //BA.debugLineNum = 65470473;BA.debugLine="End Sub";
return "";
}
public static String  _btnreport_click() throws Exception{
RDebugUtils.currentModule="act_reportvisitor2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnreport_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnreport_click", null));}
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=65339392;
 //BA.debugLineNum = 65339392;BA.debugLine="Sub BtnReport_Click";
RDebugUtils.currentLine=65339393;
 //BA.debugLineNum = 65339393;BA.debugLine="If MCode.Sf.Len(BtnAz.Tag) = 8 And MCode.Sf.Len(B";
if (mostCurrent._mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvv1(BA.ObjectToString(mostCurrent._btnaz.getTag()))==8 && mostCurrent._mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvv1(BA.ObjectToString(mostCurrent._btnta.getTag()))==8) { 
RDebugUtils.currentLine=65339394;
 //BA.debugLineNum = 65339394;BA.debugLine="ProgressDialogShow2(\"در حال دریافت اطلاعات . . .";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(mostCurrent.activityBA,BA.ObjectToCharSequence("در حال دریافت اطلاعات . . ."),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=65339395;
 //BA.debugLineNum = 65339395;BA.debugLine="Dim M As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=65339396;
 //BA.debugLineNum = 65339396;BA.debugLine="M.Initialize";
_m.Initialize();
RDebugUtils.currentLine=65339397;
 //BA.debugLineNum = 65339397;BA.debugLine="M.Put(\"Imei\" , MCode.DeviceId)";
_m.Put((Object)("Imei"),(Object)(mostCurrent._mcode._deviceid /*String*/ ));
RDebugUtils.currentLine=65339398;
 //BA.debugLineNum = 65339398;BA.debugLine="M.Put(\"CodeVisitor\",MCode.C_Visitor)";
_m.Put((Object)("CodeVisitor"),(Object)(mostCurrent._mcode._c_visitor /*String*/ ));
RDebugUtils.currentLine=65339399;
 //BA.debugLineNum = 65339399;BA.debugLine="M.Put(\"DateAz\",MCode.ConvertNumbersPersian2Engli";
_m.Put((Object)("DateAz"),(Object)(mostCurrent._mcode._convertnumberspersian2english /*String*/ (mostCurrent.activityBA,mostCurrent._dateaz)));
RDebugUtils.currentLine=65339400;
 //BA.debugLineNum = 65339400;BA.debugLine="M.Put(\"DateTa\",MCode.ConvertNumbersPersian2Engli";
_m.Put((Object)("DateTa"),(Object)(mostCurrent._mcode._convertnumberspersian2english /*String*/ (mostCurrent.activityBA,mostCurrent._dateta)));
RDebugUtils.currentLine=65339402;
 //BA.debugLineNum = 65339402;BA.debugLine="ProgressDialogShow2(\"لطفا صبر کنید . . .\",False)";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(mostCurrent.activityBA,BA.ObjectToCharSequence("لطفا صبر کنید . . ."),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=65339403;
 //BA.debugLineNum = 65339403;BA.debugLine="CallSubDelayed3(Service_Server,\"GetReportVisitor";
anywheresoftware.b4a.keywords.Common.CallSubDelayed3(processBA,(Object)(mostCurrent._service_server.getObject()),"GetReportVisitor",(Object)(mostCurrent._mcode._convertnumberspersian2english /*String*/ (mostCurrent.activityBA,mostCurrent._dateaz)),(Object)(mostCurrent._mcode._convertnumberspersian2english /*String*/ (mostCurrent.activityBA,mostCurrent._dateta)));
 }else {
RDebugUtils.currentLine=65339405;
 //BA.debugLineNum = 65339405;BA.debugLine="ToastMessageShow(\"تاریخ را به طور صحیح وارد نمای";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("تاریخ را به طور صحیح وارد نمایید"),anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=65339407;
 //BA.debugLineNum = 65339407;BA.debugLine="End Sub";
return "";
}
public static String  _btnta_click() throws Exception{
RDebugUtils.currentModule="act_reportvisitor2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnta_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnta_click", null));}
com.porya.datetimepicker.PersianMaterialDatePickerWrapper _p1 = null;
RDebugUtils.currentLine=65732608;
 //BA.debugLineNum = 65732608;BA.debugLine="Sub BtnTa_Click";
RDebugUtils.currentLine=65732609;
 //BA.debugLineNum = 65732609;BA.debugLine="Dim p1 As PersianMaterialDatePicker";
_p1 = new com.porya.datetimepicker.PersianMaterialDatePickerWrapper();
RDebugUtils.currentLine=65732610;
 //BA.debugLineNum = 65732610;BA.debugLine="p1.Initialize(\"p1\",p1.PersianYear,p1.PersianMonth";
_p1.Initialize(mostCurrent.activityBA,"p1",_p1.getPersianYear(),_p1.getPersianMonth(),_p1.getPersianDay());
RDebugUtils.currentLine=65732611;
 //BA.debugLineNum = 65732611;BA.debugLine="p1.AccentColor = Colors.RGB(83,99,255)";
_p1.setAccentColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (83),(int) (99),(int) (255)));
RDebugUtils.currentLine=65732612;
 //BA.debugLineNum = 65732612;BA.debugLine="p1.OkText = \"تایید\"";
_p1.setOkText("تایید");
RDebugUtils.currentLine=65732613;
 //BA.debugLineNum = 65732613;BA.debugLine="p1.CancelText = \"لغو\"";
_p1.setCancelText("لغو");
RDebugUtils.currentLine=65732614;
 //BA.debugLineNum = 65732614;BA.debugLine="p1.Title = \"تا تاریخ\"";
_p1.setTitle("تا تاریخ");
RDebugUtils.currentLine=65732615;
 //BA.debugLineNum = 65732615;BA.debugLine="p1.Typeface = \"iransansmonospacednum.ttf\"";
_p1.setTypeface("iransansmonospacednum.ttf");
RDebugUtils.currentLine=65732616;
 //BA.debugLineNum = 65732616;BA.debugLine="p1.Show(\"p1\")";
_p1.Show("p1");
RDebugUtils.currentLine=65732617;
 //BA.debugLineNum = 65732617;BA.debugLine="End Sub";
return "";
}
public static String  _creategrid() throws Exception{
RDebugUtils.currentModule="act_reportvisitor2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "creategrid", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "creategrid", null));}
anywheresoftware.b4a.objects.collections.List _lst_colnametitle = null;
RDebugUtils.currentLine=65142784;
 //BA.debugLineNum = 65142784;BA.debugLine="Sub CreateGrid";
RDebugUtils.currentLine=65142785;
 //BA.debugLineNum = 65142785;BA.debugLine="Table1.Initialize(Me, \"Table1\",6)";
mostCurrent._table1._initialize /*String*/ (null,mostCurrent.activityBA,act_reportvisitor2.getObject(),"Table1",(int) (6));
RDebugUtils.currentLine=65142786;
 //BA.debugLineNum = 65142786;BA.debugLine="Table1.AddToActivity(PnlGrid, 0,0,100%x,PnlGrid.H";
mostCurrent._table1._addtoactivity /*String*/ (null,(anywheresoftware.b4a.objects.ActivityWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ActivityWrapper(), (anywheresoftware.b4a.BALayout)(mostCurrent._pnlgrid.getObject())),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),mostCurrent._pnlgrid.getHeight());
RDebugUtils.currentLine=65142788;
 //BA.debugLineNum = 65142788;BA.debugLine="Dim Lst_ColNameTitle As List";
_lst_colnametitle = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=65142789;
 //BA.debugLineNum = 65142789;BA.debugLine="Lst_ColNameTitle.Initialize";
_lst_colnametitle.Initialize();
RDebugUtils.currentLine=65142790;
 //BA.debugLineNum = 65142790;BA.debugLine="Lst_ColNameTitle.AddAll(Array As String(\"مبلغ\",\"ت";
_lst_colnametitle.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"مبلغ","ت.فاکتور","ت.کل","ت.کارتن","ت.جزء","نام کالا"}));
RDebugUtils.currentLine=65142793;
 //BA.debugLineNum = 65142793;BA.debugLine="Table1.LoadSListVisitor(LstReport,Lst_ColNameTitl";
mostCurrent._table1._loadslistvisitor /*String*/ (null,mostCurrent._lstreport,_lst_colnametitle,(int) (6));
RDebugUtils.currentLine=65142794;
 //BA.debugLineNum = 65142794;BA.debugLine="Table1.SetColumnsWidths(Array As Int(25%x, 14%x,1";
mostCurrent._table1._setcolumnswidths /*String*/ (null,new int[]{anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (25),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (14),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (14),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (14),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (14),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (33),mostCurrent.activityBA)});
RDebugUtils.currentLine=65142795;
 //BA.debugLineNum = 65142795;BA.debugLine="Table1.SetHeader(Array As String(\"مبلغ\",\"ت.فاکتور";
mostCurrent._table1._setheader /*String*/ (null,new String[]{"مبلغ","ت.فاکتور","ت.کل","ت.کارتن","ت.جزء","نام کالا"},new int[]{anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (25),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (14),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (14),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (14),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (14),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (33),mostCurrent.activityBA)});
RDebugUtils.currentLine=65142797;
 //BA.debugLineNum = 65142797;BA.debugLine="LblTedadFaktor.Text = TitleReport(0)";
mostCurrent._lbltedadfaktor.setText(BA.ObjectToCharSequence(_titlereport[(int) (0)]));
RDebugUtils.currentLine=65142798;
 //BA.debugLineNum = 65142798;BA.debugLine="LblSumFaktor.Text = NumberFormat(TitleReport(1),1";
mostCurrent._lblsumfaktor.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.NumberFormat(_titlereport[(int) (1)],(int) (1),(int) (3))+" ریال "));
RDebugUtils.currentLine=65142799;
 //BA.debugLineNum = 65142799;BA.debugLine="LblPoorsant.Text = NumberFormat(TitleReport(2),1,";
mostCurrent._lblpoorsant.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.NumberFormat(_titlereport[(int) (2)],(int) (1),(int) (3))+" ریال "));
RDebugUtils.currentLine=65142802;
 //BA.debugLineNum = 65142802;BA.debugLine="End Sub";
return "";
}
public static String  _createlist(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
RDebugUtils.currentModule="act_reportvisitor2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createlist", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "createlist", new Object[] {_lst}));}
anywheresoftware.b4a.objects.collections.Map _coljroot = null;
ir.parsikhesab.pakhsh.mcode._adapterreportvisitor _item = null;
RDebugUtils.currentLine=65404928;
 //BA.debugLineNum = 65404928;BA.debugLine="Sub CreateList(Lst As List)";
RDebugUtils.currentLine=65404929;
 //BA.debugLineNum = 65404929;BA.debugLine="LstReport.Clear";
mostCurrent._lstreport.Clear();
RDebugUtils.currentLine=65404930;
 //BA.debugLineNum = 65404930;BA.debugLine="TitleReport(0) = 0";
_titlereport[(int) (0)] = (long) (0);
RDebugUtils.currentLine=65404931;
 //BA.debugLineNum = 65404931;BA.debugLine="TitleReport(1) =0";
_titlereport[(int) (1)] = (long) (0);
RDebugUtils.currentLine=65404932;
 //BA.debugLineNum = 65404932;BA.debugLine="For Each coljRoot As Map In Lst";
_coljroot = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group4 = _lst;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_coljroot = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group4.Get(index4)));
RDebugUtils.currentLine=65404933;
 //BA.debugLineNum = 65404933;BA.debugLine="Dim Item As AdapterReportVisitor";
_item = new ir.parsikhesab.pakhsh.mcode._adapterreportvisitor();
RDebugUtils.currentLine=65404934;
 //BA.debugLineNum = 65404934;BA.debugLine="Item.fldSharhKala = coljRoot.Get(\"fldSharhKala\")";
_item.fldSharhKala /*String*/  = BA.ObjectToString(_coljroot.Get((Object)("fldSharhKala")));
RDebugUtils.currentLine=65404935;
 //BA.debugLineNum = 65404935;BA.debugLine="Item.fldTedadJoz = coljRoot.Get(\"fldTedadJoz\")";
_item.fldTedadJoz /*String*/  = BA.ObjectToString(_coljroot.Get((Object)("fldTedadJoz")));
RDebugUtils.currentLine=65404936;
 //BA.debugLineNum = 65404936;BA.debugLine="Item.fldTedadCarton = coljRoot.Get(\"fldTedadCart";
_item.fldTedadCarton /*String*/  = BA.ObjectToString(_coljroot.Get((Object)("fldTedadCarton")));
RDebugUtils.currentLine=65404937;
 //BA.debugLineNum = 65404937;BA.debugLine="Item.fldTedadKol = coljRoot.Get(\"fldTedadKol\")";
_item.fldTedadKol /*String*/  = BA.ObjectToString(_coljroot.Get((Object)("fldTedadKol")));
RDebugUtils.currentLine=65404938;
 //BA.debugLineNum = 65404938;BA.debugLine="Item.fldCount = coljRoot.Get(\"fldCount\")";
_item.fldCount /*String*/  = BA.ObjectToString(_coljroot.Get((Object)("fldCount")));
RDebugUtils.currentLine=65404939;
 //BA.debugLineNum = 65404939;BA.debugLine="Item.fldFeeJoz = coljRoot.Get(\"fldFeeJoz\")";
_item.fldFeeJoz /*String*/  = BA.ObjectToString(_coljroot.Get((Object)("fldFeeJoz")));
RDebugUtils.currentLine=65404941;
 //BA.debugLineNum = 65404941;BA.debugLine="LstReport.Add(Item)";
mostCurrent._lstreport.Add((Object)(_item));
RDebugUtils.currentLine=65404943;
 //BA.debugLineNum = 65404943;BA.debugLine="TitleReport(0) = TitleReport(0) + coljRoot.Get(\"";
_titlereport[(int) (0)] = (long) (_titlereport[(int) (0)]+(double)(BA.ObjectToNumber(_coljroot.Get((Object)("fldCount")))));
RDebugUtils.currentLine=65404944;
 //BA.debugLineNum = 65404944;BA.debugLine="TitleReport(1) = TitleReport(1) + coljRoot.Get(\"";
_titlereport[(int) (1)] = (long) (_titlereport[(int) (1)]+(double)(BA.ObjectToNumber(_coljroot.Get((Object)("fldFeeJoz")))));
 }
};
RDebugUtils.currentLine=65404947;
 //BA.debugLineNum = 65404947;BA.debugLine="CreateGrid";
_creategrid();
RDebugUtils.currentLine=65404948;
 //BA.debugLineNum = 65404948;BA.debugLine="End Sub";
return "";
}
public static String  _img_chart_click() throws Exception{
RDebugUtils.currentModule="act_reportvisitor2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "img_chart_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "img_chart_click", null));}
RDebugUtils.currentLine=66125824;
 //BA.debugLineNum = 66125824;BA.debugLine="Sub Img_Chart_Click";
RDebugUtils.currentLine=66125827;
 //BA.debugLineNum = 66125827;BA.debugLine="End Sub";
return "";
}
public static String  _img_sort_click() throws Exception{
RDebugUtils.currentModule="act_reportvisitor2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "img_sort_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "img_sort_click", null));}
anywheresoftware.b4a.objects.collections.List _lst = null;
int _res = 0;
RDebugUtils.currentLine=66060288;
 //BA.debugLineNum = 66060288;BA.debugLine="Sub Img_Sort_Click";
RDebugUtils.currentLine=66060289;
 //BA.debugLineNum = 66060289;BA.debugLine="Dim Lst As List = Array As String(\"مبلغ کم به زیا";
_lst = new anywheresoftware.b4a.objects.collections.List();
_lst = anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"مبلغ کم به زیاد","مبلغ زیاد به کم"});
RDebugUtils.currentLine=66060290;
 //BA.debugLineNum = 66060290;BA.debugLine="Dim res As Int = InputList(Lst,\"مرتب سازی براساس:";
_res = anywheresoftware.b4a.keywords.Common.InputList(_lst,BA.ObjectToCharSequence("مرتب سازی براساس:"),(int) (-1),mostCurrent.activityBA);
RDebugUtils.currentLine=66060291;
 //BA.debugLineNum = 66060291;BA.debugLine="Select Case res";
switch (_res) {
case 0: {
RDebugUtils.currentLine=66060293;
 //BA.debugLineNum = 66060293;BA.debugLine="LstReport.SortType(\"fldFeeJoz\",False)";
mostCurrent._lstreport.SortType("fldFeeJoz",anywheresoftware.b4a.keywords.Common.False);
 break; }
case 1: {
RDebugUtils.currentLine=66060295;
 //BA.debugLineNum = 66060295;BA.debugLine="LstReport.SortType(\"fldFeeJoz\",True)";
mostCurrent._lstreport.SortType("fldFeeJoz",anywheresoftware.b4a.keywords.Common.True);
 break; }
}
;
RDebugUtils.currentLine=66060297;
 //BA.debugLineNum = 66060297;BA.debugLine="ProgressDialogShow(\"لطفا چند لحظه صبر کنید\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("لطفا چند لحظه صبر کنید"));
RDebugUtils.currentLine=66060298;
 //BA.debugLineNum = 66060298;BA.debugLine="CreateGrid";
_creategrid();
RDebugUtils.currentLine=66060299;
 //BA.debugLineNum = 66060299;BA.debugLine="End Sub";
return "";
}
public static String  _lblback_click() throws Exception{
RDebugUtils.currentModule="act_reportvisitor2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lblback_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lblback_click", null));}
RDebugUtils.currentLine=65994752;
 //BA.debugLineNum = 65994752;BA.debugLine="Sub LblBack_Click";
RDebugUtils.currentLine=65994753;
 //BA.debugLineNum = 65994753;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=65994754;
 //BA.debugLineNum = 65994754;BA.debugLine="End Sub";
return "";
}
public static String  _p_oncancel() throws Exception{
RDebugUtils.currentModule="act_reportvisitor2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "p_oncancel", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "p_oncancel", null));}
RDebugUtils.currentLine=65601536;
 //BA.debugLineNum = 65601536;BA.debugLine="Sub p_onCancel";
RDebugUtils.currentLine=65601537;
 //BA.debugLineNum = 65601537;BA.debugLine="Log(\"cancel\")";
anywheresoftware.b4a.keywords.Common.LogImpl("565601537","cancel",0);
RDebugUtils.currentLine=65601538;
 //BA.debugLineNum = 65601538;BA.debugLine="End Sub";
return "";
}
public static String  _p_ondateset(int _year,int _month,int _day) throws Exception{
RDebugUtils.currentModule="act_reportvisitor2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "p_ondateset", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "p_ondateset", new Object[] {_year,_month,_day}));}
RDebugUtils.currentLine=65536000;
 //BA.debugLineNum = 65536000;BA.debugLine="Sub p_onDateSet(year As Int,month As Int,day As In";
RDebugUtils.currentLine=65536001;
 //BA.debugLineNum = 65536001;BA.debugLine="Log(year&\"/\"&month&\"/\"&day)";
anywheresoftware.b4a.keywords.Common.LogImpl("565536001",BA.NumberToString(_year)+"/"+BA.NumberToString(_month)+"/"+BA.NumberToString(_day),0);
RDebugUtils.currentLine=65536002;
 //BA.debugLineNum = 65536002;BA.debugLine="BtnAz.Text=year&\"/\"&NumberFormat(month,2,0)&\"/\"&N";
mostCurrent._btnaz.setText(BA.ObjectToCharSequence(BA.NumberToString(_year)+"/"+anywheresoftware.b4a.keywords.Common.NumberFormat(_month,(int) (2),(int) (0))+"/"+anywheresoftware.b4a.keywords.Common.NumberFormat(_day,(int) (2),(int) (0))));
RDebugUtils.currentLine=65536003;
 //BA.debugLineNum = 65536003;BA.debugLine="BtnAz.Tag =year&NumberFormat(day,2,0)&NumberForma";
mostCurrent._btnaz.setTag((Object)(BA.NumberToString(_year)+anywheresoftware.b4a.keywords.Common.NumberFormat(_day,(int) (2),(int) (0))+anywheresoftware.b4a.keywords.Common.NumberFormat(_month,(int) (2),(int) (0))));
RDebugUtils.currentLine=65536007;
 //BA.debugLineNum = 65536007;BA.debugLine="DateAz=year&NumberFormat(month,2,0)&NumberFormat(";
mostCurrent._dateaz = BA.NumberToString(_year)+anywheresoftware.b4a.keywords.Common.NumberFormat(_month,(int) (2),(int) (0))+anywheresoftware.b4a.keywords.Common.NumberFormat(_day,(int) (2),(int) (0));
RDebugUtils.currentLine=65536008;
 //BA.debugLineNum = 65536008;BA.debugLine="LogColor(DateAz,Colors.Magenta)";
anywheresoftware.b4a.keywords.Common.LogImpl("565536008",mostCurrent._dateaz,anywheresoftware.b4a.keywords.Common.Colors.Magenta);
RDebugUtils.currentLine=65536009;
 //BA.debugLineNum = 65536009;BA.debugLine="End Sub";
return "";
}
public static String  _p_ondismiss() throws Exception{
RDebugUtils.currentModule="act_reportvisitor2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "p_ondismiss", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "p_ondismiss", null));}
RDebugUtils.currentLine=65667072;
 //BA.debugLineNum = 65667072;BA.debugLine="Sub p_onDismiss";
RDebugUtils.currentLine=65667073;
 //BA.debugLineNum = 65667073;BA.debugLine="Log(\"dismiss\")";
anywheresoftware.b4a.keywords.Common.LogImpl("565667073","dismiss",0);
RDebugUtils.currentLine=65667074;
 //BA.debugLineNum = 65667074;BA.debugLine="End Sub";
return "";
}
public static String  _p1_oncancel() throws Exception{
RDebugUtils.currentModule="act_reportvisitor2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "p1_oncancel", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "p1_oncancel", null));}
RDebugUtils.currentLine=65863680;
 //BA.debugLineNum = 65863680;BA.debugLine="Sub p1_onCancel";
RDebugUtils.currentLine=65863681;
 //BA.debugLineNum = 65863681;BA.debugLine="Log(\"cancel\")";
anywheresoftware.b4a.keywords.Common.LogImpl("565863681","cancel",0);
RDebugUtils.currentLine=65863682;
 //BA.debugLineNum = 65863682;BA.debugLine="End Sub";
return "";
}
public static String  _p1_ondateset(int _year,int _month,int _day) throws Exception{
RDebugUtils.currentModule="act_reportvisitor2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "p1_ondateset", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "p1_ondateset", new Object[] {_year,_month,_day}));}
RDebugUtils.currentLine=65798144;
 //BA.debugLineNum = 65798144;BA.debugLine="Sub p1_onDateSet(year As Int,month As Int,day As I";
RDebugUtils.currentLine=65798145;
 //BA.debugLineNum = 65798145;BA.debugLine="Log(year&\"/\"&month&\"/\"&day)";
anywheresoftware.b4a.keywords.Common.LogImpl("565798145",BA.NumberToString(_year)+"/"+BA.NumberToString(_month)+"/"+BA.NumberToString(_day),0);
RDebugUtils.currentLine=65798146;
 //BA.debugLineNum = 65798146;BA.debugLine="BtnTa.Text=year&\"/\"&NumberFormat(month,2,0)&\"/\"&N";
mostCurrent._btnta.setText(BA.ObjectToCharSequence(BA.NumberToString(_year)+"/"+anywheresoftware.b4a.keywords.Common.NumberFormat(_month,(int) (2),(int) (0))+"/"+anywheresoftware.b4a.keywords.Common.NumberFormat(_day,(int) (2),(int) (0))));
RDebugUtils.currentLine=65798147;
 //BA.debugLineNum = 65798147;BA.debugLine="BtnTa.Tag=year&NumberFormat(month,2,0)&NumberForm";
mostCurrent._btnta.setTag((Object)(BA.NumberToString(_year)+anywheresoftware.b4a.keywords.Common.NumberFormat(_month,(int) (2),(int) (0))+anywheresoftware.b4a.keywords.Common.NumberFormat(_day,(int) (2),(int) (0))));
RDebugUtils.currentLine=65798151;
 //BA.debugLineNum = 65798151;BA.debugLine="DateTa=year&NumberFormat(month,2,0)&NumberFormat(";
mostCurrent._dateta = BA.NumberToString(_year)+anywheresoftware.b4a.keywords.Common.NumberFormat(_month,(int) (2),(int) (0))+anywheresoftware.b4a.keywords.Common.NumberFormat(_day,(int) (2),(int) (0));
RDebugUtils.currentLine=65798152;
 //BA.debugLineNum = 65798152;BA.debugLine="LogColor(DateTa,Colors.Magenta)";
anywheresoftware.b4a.keywords.Common.LogImpl("565798152",mostCurrent._dateta,anywheresoftware.b4a.keywords.Common.Colors.Magenta);
RDebugUtils.currentLine=65798153;
 //BA.debugLineNum = 65798153;BA.debugLine="End Sub";
return "";
}
public static String  _p1_ondismiss() throws Exception{
RDebugUtils.currentModule="act_reportvisitor2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "p1_ondismiss", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "p1_ondismiss", null));}
RDebugUtils.currentLine=65929216;
 //BA.debugLineNum = 65929216;BA.debugLine="Sub p1_onDismiss";
RDebugUtils.currentLine=65929217;
 //BA.debugLineNum = 65929217;BA.debugLine="Log(\"dismiss\")";
anywheresoftware.b4a.keywords.Common.LogImpl("565929217","dismiss",0);
RDebugUtils.currentLine=65929218;
 //BA.debugLineNum = 65929218;BA.debugLine="End Sub";
return "";
}
}