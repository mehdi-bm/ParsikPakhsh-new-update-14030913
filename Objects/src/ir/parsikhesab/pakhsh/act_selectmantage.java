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

public class act_selectmantage extends Activity implements B4AActivity{
	public static act_selectmantage mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.act_selectmantage");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (act_selectmantage).");
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
		activityBA = new BA(this, layout, processBA, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.act_selectmantage");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "ir.parsikhesab.pakhsh.act_selectmantage", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (act_selectmantage) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (act_selectmantage) Resume **");
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
		return act_selectmantage.class;
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
            BA.LogInfo("** Activity (act_selectmantage) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (act_selectmantage) Pause event (activity is not paused). **");
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
            act_selectmantage mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (act_selectmantage) Resume **");
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
public static anywheresoftware.b4a.gps.GPS _gps = null;
public static anywheresoftware.b4a.objects.Timer _t1 = null;
public anywheresoftware.b4a.objects.RuntimePermissions _rp = null;
public wir.hitex.recycler.Hitex_Utils _utils = null;
public anywheresoftware.b4a.objects.IME _key = null;
public anywheresoftware.b4a.objects.collections.List _listashkhas = null;
public anywheresoftware.b4a.objects.collections.List _orginallistashkhas = null;
public anywheresoftware.b4a.sql.SQL.CursorWrapper _cuashkhas = null;
public nicespinnerwrapper.niceSpinnerWrapper _nicespinner = null;
public nicespinnerwrapper.niceSpinnerWrapper _nicespinner1 = null;
public ir.parsikhesab.pakhsh.b4xcombobox _b4xcombobox1 = null;
public ir.parsikhesab.pakhsh.b4xcombobox _b4xcombobox2 = null;
public anywheresoftware.b4a.objects.collections.List _listgoroohashkhas1 = null;
public anywheresoftware.b4a.objects.collections.List _originallistgoroohashkhas1 = null;
public anywheresoftware.b4a.objects.collections.List _listgoroohashkhas2 = null;
public anywheresoftware.b4a.objects.collections.List _originallistgoroohashkhas2 = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnl_hlv = null;
public wir.hitex.recycler.Hitex_LayoutView _hlv = null;
public anywheresoftware.b4a.objects.collections.List _listmantaghe = null;
public static String _date = "";
public anywheresoftware.b4a.objects.EditTextWrapper _txtsearch = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltedadvisit = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltedadsefaresh = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltedadkol = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlspgroup = null;
public anywheresoftware.b4a.objects.LabelWrapper _btn_sort = null;
public static String _str_sort = "";
public static String _groupcodeselect1 = "";
public static String _groupnameselect1 = "";
public static String _groupcodeselect2 = "";
public static String _groupnameselect2 = "";
public static int _countvisit = 0;
public static int _countsefaresh = 0;
public de.amberhome.objects.appcompat.ACSwitchCompatWrapper _swvisit = null;
public anywheresoftware.b4a.objects.collections.List _lstselectedcodegroupashkhas = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlbed = null;
public de.amberhome.objects.appcompat.ACSwitchCompatWrapper _swbed = null;
public static int _tcount = 0;
public de.amberhome.objects.appcompat.ACSwitchCompatWrapper _swbes = null;
public de.amberhome.objects.appcompat.ACSwitchCompatWrapper _swnew = null;
public anywheresoftware.b4a.objects.collections.List _lstgroup1 = null;
public anywheresoftware.b4a.objects.collections.List _lstgroup2 = null;
public de.amberhome.objects.appcompat.ACSwitchCompatWrapper _swsearchbyaddress = null;
public anywheresoftware.b4a.objects.PanelWrapper _btnnewashkhas = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnmenugroup = null;
public anywheresoftware.b4a.objects.SlidingMenuWrapper _sidemenu = null;
public wir.hitex.recycler.Hitex_LayoutView _hlvgoroohashkhas = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlgroup = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblbackgroup = null;
public de.amberhome.objects.appcompat.ACSwitchCompatWrapper _swblacklist = null;
public de.amberhome.objects.appcompat.ACSwitchCompatWrapper _swtourtoday = null;
public anywheresoftware.b4a.objects.LabelWrapper _btnlocationmoshtarian = null;
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
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="act_selectmantage";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
anywheresoftware.b4a.objects.drawable.ColorDrawable _op = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _op1 = null;
RDebugUtils.currentLine=22675456;
 //BA.debugLineNum = 22675456;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=22675457;
 //BA.debugLineNum = 22675457;BA.debugLine="Activity.LoadLayout(\"L_SelectMantaghe_2\")";
mostCurrent._activity.LoadLayout("L_SelectMantaghe_2",mostCurrent.activityBA);
RDebugUtils.currentLine=22675458;
 //BA.debugLineNum = 22675458;BA.debugLine="Try";
try {RDebugUtils.currentLine=22675459;
 //BA.debugLineNum = 22675459;BA.debugLine="lstSelectedCodeGroupAshkhas.Initialize";
mostCurrent._lstselectedcodegroupashkhas.Initialize();
RDebugUtils.currentLine=22675460;
 //BA.debugLineNum = 22675460;BA.debugLine="Key.Initialize(\"Key\")";
mostCurrent._key.Initialize("Key");
RDebugUtils.currentLine=22675461;
 //BA.debugLineNum = 22675461;BA.debugLine="ListAshkhas.Initialize";
mostCurrent._listashkhas.Initialize();
RDebugUtils.currentLine=22675462;
 //BA.debugLineNum = 22675462;BA.debugLine="OrginalListAshkhas.Initialize";
mostCurrent._orginallistashkhas.Initialize();
RDebugUtils.currentLine=22675463;
 //BA.debugLineNum = 22675463;BA.debugLine="OriginalListGoroohAshkhas1.Initialize";
mostCurrent._originallistgoroohashkhas1.Initialize();
RDebugUtils.currentLine=22675464;
 //BA.debugLineNum = 22675464;BA.debugLine="ListGoroohAshkhas1.Initialize";
mostCurrent._listgoroohashkhas1.Initialize();
RDebugUtils.currentLine=22675465;
 //BA.debugLineNum = 22675465;BA.debugLine="OriginalListGoroohAshkhas2.Initialize";
mostCurrent._originallistgoroohashkhas2.Initialize();
RDebugUtils.currentLine=22675466;
 //BA.debugLineNum = 22675466;BA.debugLine="ListGoroohAshkhas2.Initialize";
mostCurrent._listgoroohashkhas2.Initialize();
RDebugUtils.currentLine=22675467;
 //BA.debugLineNum = 22675467;BA.debugLine="lstGroup1.Initialize";
mostCurrent._lstgroup1.Initialize();
RDebugUtils.currentLine=22675468;
 //BA.debugLineNum = 22675468;BA.debugLine="lstGroup2.Initialize";
mostCurrent._lstgroup2.Initialize();
RDebugUtils.currentLine=22675469;
 //BA.debugLineNum = 22675469;BA.debugLine="sidemenu.Initialize(\"sidmenu\")";
mostCurrent._sidemenu.Initialize(mostCurrent.activityBA,"sidmenu");
RDebugUtils.currentLine=22675470;
 //BA.debugLineNum = 22675470;BA.debugLine="sidemenu.Menu.LoadLayout(\"groupashkhasmenulyr\")";
mostCurrent._sidemenu.getMenu().LoadLayout("groupashkhasmenulyr",mostCurrent.activityBA);
RDebugUtils.currentLine=22675471;
 //BA.debugLineNum = 22675471;BA.debugLine="sidemenu.Mode=sidemenu.LEFT";
mostCurrent._sidemenu.setMode(mostCurrent._sidemenu.LEFT);
RDebugUtils.currentLine=22675472;
 //BA.debugLineNum = 22675472;BA.debugLine="sidemenu.BehindOffset=33%x";
mostCurrent._sidemenu.setBehindOffset(anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (33),mostCurrent.activityBA));
RDebugUtils.currentLine=22675473;
 //BA.debugLineNum = 22675473;BA.debugLine="HLVGoroohAshkhas.Initializer(\"HLVGoroohAshkhas\").";
mostCurrent._hlvgoroohashkhas.Initializer(mostCurrent.activityBA,"HLVGoroohAshkhas").ListView().Build();
RDebugUtils.currentLine=22675474;
 //BA.debugLineNum = 22675474;BA.debugLine="pnlGroup.AddView(HLVGoroohAshkhas,1%x,1%y,65%x,87";
mostCurrent._pnlgroup.AddView((android.view.View)(mostCurrent._hlvgoroohashkhas.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (1),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (1),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (65),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (87),mostCurrent.activityBA));
RDebugUtils.currentLine=22675476;
 //BA.debugLineNum = 22675476;BA.debugLine="tcount=3";
_tcount = (int) (3);
RDebugUtils.currentLine=22675478;
 //BA.debugLineNum = 22675478;BA.debugLine="Gps.Initialize(\"gps\")";
_gps.Initialize("gps");
RDebugUtils.currentLine=22675479;
 //BA.debugLineNum = 22675479;BA.debugLine="t1.Initialize(\"t1\",5000)";
_t1.Initialize(processBA,"t1",(long) (5000));
RDebugUtils.currentLine=22675481;
 //BA.debugLineNum = 22675481;BA.debugLine="HLV.Initializer(\"HLV\").ListView.Build";
mostCurrent._hlv.Initializer(mostCurrent.activityBA,"HLV").ListView().Build();
RDebugUtils.currentLine=22675483;
 //BA.debugLineNum = 22675483;BA.debugLine="pnl_HLV.AddView(HLV,0,0,pnl_HLV.Width,pnl_HLV.Hei";
mostCurrent._pnl_hlv.AddView((android.view.View)(mostCurrent._hlv.getObject()),(int) (0),(int) (0),mostCurrent._pnl_hlv.getWidth(),mostCurrent._pnl_hlv.getHeight());
RDebugUtils.currentLine=22675485;
 //BA.debugLineNum = 22675485;BA.debugLine="NiceSpinner.Initialize(\"NiceSpinner\")";
mostCurrent._nicespinner.Initialize(processBA,"NiceSpinner");
RDebugUtils.currentLine=22675486;
 //BA.debugLineNum = 22675486;BA.debugLine="PnlSpGroup.AddView(NiceSpinner,B4XComboBox1.mBase";
mostCurrent._pnlspgroup.AddView((android.view.View)(mostCurrent._nicespinner.getObject()),mostCurrent._b4xcombobox1._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft(),mostCurrent._b4xcombobox1._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop(),mostCurrent._b4xcombobox1._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),mostCurrent._b4xcombobox1._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=22675487;
 //BA.debugLineNum = 22675487;BA.debugLine="NiceSpinner.TextColor = Colors.Black";
mostCurrent._nicespinner.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=22675488;
 //BA.debugLineNum = 22675488;BA.debugLine="NiceSpinner.Gravity = Gravity.CENTER_HORIZONTAL";
mostCurrent._nicespinner.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL);
RDebugUtils.currentLine=22675489;
 //BA.debugLineNum = 22675489;BA.debugLine="NiceSpinner.Typeface = Typeface.LoadFromAssets(\"p";
mostCurrent._nicespinner.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("p_font.ttf"));
RDebugUtils.currentLine=22675490;
 //BA.debugLineNum = 22675490;BA.debugLine="Dim op As ColorDrawable";
_op = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=22675491;
 //BA.debugLineNum = 22675491;BA.debugLine="op.Initialize2(Colors.White,8dip,2dip,Colors.Blac";
_op.Initialize2(anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (8)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2)),anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=22675492;
 //BA.debugLineNum = 22675492;BA.debugLine="NiceSpinner.Background=op";
mostCurrent._nicespinner.setBackground((android.graphics.drawable.Drawable)(_op.getObject()));
RDebugUtils.currentLine=22675494;
 //BA.debugLineNum = 22675494;BA.debugLine="NiceSpinner1.Initialize(\"NiceSpinner1\")";
mostCurrent._nicespinner1.Initialize(processBA,"NiceSpinner1");
RDebugUtils.currentLine=22675495;
 //BA.debugLineNum = 22675495;BA.debugLine="PnlSpGroup.AddView(NiceSpinner1,B4XComboBox2.mBas";
mostCurrent._pnlspgroup.AddView((android.view.View)(mostCurrent._nicespinner1.getObject()),mostCurrent._b4xcombobox2._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft(),mostCurrent._b4xcombobox2._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop(),mostCurrent._b4xcombobox2._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),mostCurrent._b4xcombobox2._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=22675496;
 //BA.debugLineNum = 22675496;BA.debugLine="NiceSpinner1.TextColor = Colors.Black";
mostCurrent._nicespinner1.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=22675497;
 //BA.debugLineNum = 22675497;BA.debugLine="NiceSpinner1.Gravity = Gravity.CENTER_HORIZONTAL";
mostCurrent._nicespinner1.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL);
RDebugUtils.currentLine=22675498;
 //BA.debugLineNum = 22675498;BA.debugLine="NiceSpinner1.Typeface = Typeface.LoadFromAssets(\"";
mostCurrent._nicespinner1.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("p_font.ttf"));
RDebugUtils.currentLine=22675499;
 //BA.debugLineNum = 22675499;BA.debugLine="Dim op1 As ColorDrawable";
_op1 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=22675500;
 //BA.debugLineNum = 22675500;BA.debugLine="op1.Initialize2(Colors.White,8dip,2dip,Colors.Bla";
_op1.Initialize2(anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (8)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2)),anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=22675501;
 //BA.debugLineNum = 22675501;BA.debugLine="NiceSpinner1.Background=op1";
mostCurrent._nicespinner1.setBackground((android.graphics.drawable.Drawable)(_op1.getObject()));
RDebugUtils.currentLine=22675502;
 //BA.debugLineNum = 22675502;BA.debugLine="lstGroup2.Add(\"همه گروه ها\")";
mostCurrent._lstgroup2.Add((Object)("همه گروه ها"));
RDebugUtils.currentLine=22675503;
 //BA.debugLineNum = 22675503;BA.debugLine="NiceSpinner1.attachDataSource(lstGroup2)";
mostCurrent._nicespinner1.attachDataSource((java.util.List)(mostCurrent._lstgroup2.getObject()));
RDebugUtils.currentLine=22675505;
 //BA.debugLineNum = 22675505;BA.debugLine="LoadAcSpGroohAshkas";
_loadacspgroohashkas();
RDebugUtils.currentLine=22675506;
 //BA.debugLineNum = 22675506;BA.debugLine="LoadAcSpGroohAshkas2";
_loadacspgroohashkas2();
RDebugUtils.currentLine=22675509;
 //BA.debugLineNum = 22675509;BA.debugLine="HLVGoroohAshkhas.CardView.BackgroundColor(0x8aacc";
mostCurrent._hlvgoroohashkhas.CardView().BackgroundColor(((int)0x8aacc8));
RDebugUtils.currentLine=22675510;
 //BA.debugLineNum = 22675510;BA.debugLine="HLVGoroohAshkhas.Ripple.Color(0x8aacc8)";
mostCurrent._hlvgoroohashkhas.Ripple().Color(((int)0x8aacc8));
RDebugUtils.currentLine=22675511;
 //BA.debugLineNum = 22675511;BA.debugLine="HLVGoroohAshkhas.CardView.CardElevation(0dip).Rad";
mostCurrent._hlvgoroohashkhas.CardView().CardElevation((float) (anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)))).Radius((float) (anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (4))));
RDebugUtils.currentLine=22675514;
 //BA.debugLineNum = 22675514;BA.debugLine="HLVGoroohAshkhas.Show";
mostCurrent._hlvgoroohashkhas.Show();
RDebugUtils.currentLine=22675515;
 //BA.debugLineNum = 22675515;BA.debugLine="HLV.Show";
mostCurrent._hlv.Show();
RDebugUtils.currentLine=22675517;
 //BA.debugLineNum = 22675517;BA.debugLine="Date = MCode.ConvertNumbersPersian2English(MCode.";
mostCurrent._date = mostCurrent._mcode._convertnumberspersian2english /*String*/ (mostCurrent.activityBA,mostCurrent._mcode._datepersian /*String*/ (mostCurrent.activityBA));
RDebugUtils.currentLine=22675519;
 //BA.debugLineNum = 22675519;BA.debugLine="Log(\"showbedehkaran: \" & MCode.showbedehkaran)";
anywheresoftware.b4a.keywords.Common.LogImpl("522675519","showbedehkaran: "+mostCurrent._mcode._showbedehkaran /*String*/ ,0);
 } 
       catch (Exception e52) {
			processBA.setLastException(e52);RDebugUtils.currentLine=22675535;
 //BA.debugLineNum = 22675535;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("522675535",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=22675536;
 //BA.debugLineNum = 22675536;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-Activity_Create");
 };
RDebugUtils.currentLine=22675538;
 //BA.debugLineNum = 22675538;BA.debugLine="End Sub";
return "";
}
public static String  _loadacspgroohashkas() throws Exception{
RDebugUtils.currentModule="act_selectmantage";
if (Debug.shouldDelegate(mostCurrent.activityBA, "loadacspgroohashkas", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "loadacspgroohashkas", null));}
anywheresoftware.b4a.objects.collections.List _lsttemp = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _dt1 = null;
int _i = 0;
String _code = "";
String _indextemp = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _dt2 = null;
int _j = 0;
String _code2 = "";
long _count = 0L;
String _mincode = "";
long _sizecode = 0L;
ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas _item = null;
ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas _a = null;
String _namegroup = "";
String _codegroup = "";
RDebugUtils.currentLine=23134208;
 //BA.debugLineNum = 23134208;BA.debugLine="Sub LoadAcSpGroohAshkas";
RDebugUtils.currentLine=23134209;
 //BA.debugLineNum = 23134209;BA.debugLine="Try";
try {RDebugUtils.currentLine=23134210;
 //BA.debugLineNum = 23134210;BA.debugLine="Dim lstTemp As List";
_lsttemp = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=23134211;
 //BA.debugLineNum = 23134211;BA.debugLine="lstTemp.Initialize";
_lsttemp.Initialize();
RDebugUtils.currentLine=23134213;
 //BA.debugLineNum = 23134213;BA.debugLine="lstGroup1.Add(\"همه گروه ها\")";
mostCurrent._lstgroup1.Add((Object)("همه گروه ها"));
RDebugUtils.currentLine=23134214;
 //BA.debugLineNum = 23134214;BA.debugLine="Dim Dt1 As Cursor = MCode.Result(\"Select FldC_Go";
_dt1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_dt1 = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas");
RDebugUtils.currentLine=23134215;
 //BA.debugLineNum = 23134215;BA.debugLine="For i=0 To Dt1.RowCount-1";
{
final int step6 = 1;
final int limit6 = (int) (_dt1.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=23134216;
 //BA.debugLineNum = 23134216;BA.debugLine="Dt1.Position=i";
_dt1.setPosition(_i);
RDebugUtils.currentLine=23134217;
 //BA.debugLineNum = 23134217;BA.debugLine="Dim code As String=Dt1.GetString(\"FldC_Gorooh\")";
_code = _dt1.GetString("FldC_Gorooh").substring((int) (0),(int) (3));
RDebugUtils.currentLine=23134218;
 //BA.debugLineNum = 23134218;BA.debugLine="Dim indexTemp As String=lstTemp.IndexOf(code)";
_indextemp = BA.NumberToString(_lsttemp.IndexOf((Object)(_code)));
RDebugUtils.currentLine=23134219;
 //BA.debugLineNum = 23134219;BA.debugLine="If indexTemp=-1 Then";
if ((_indextemp).equals(BA.NumberToString(-1))) { 
RDebugUtils.currentLine=23134220;
 //BA.debugLineNum = 23134220;BA.debugLine="Dim dt2 As Cursor =MCode.Result(\"Select * From";
_dt2 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_dt2 = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblGoroohAshkhas where FldC_Gorooh Like '"+_code+"%'");
RDebugUtils.currentLine=23134221;
 //BA.debugLineNum = 23134221;BA.debugLine="If dt2.RowCount>0 Then";
if (_dt2.getRowCount()>0) { 
RDebugUtils.currentLine=23134222;
 //BA.debugLineNum = 23134222;BA.debugLine="For j=0 To dt2.RowCount-1";
{
final int step13 = 1;
final int limit13 = (int) (_dt2.getRowCount()-1);
_j = (int) (0) ;
for (;_j <= limit13 ;_j = _j + step13 ) {
RDebugUtils.currentLine=23134223;
 //BA.debugLineNum = 23134223;BA.debugLine="dt2.Position=j";
_dt2.setPosition(_j);
RDebugUtils.currentLine=23134224;
 //BA.debugLineNum = 23134224;BA.debugLine="Dim code2 As String=dt2.GetString(\"FldC_Goro";
_code2 = _dt2.GetString("FldC_Gorooh").substring((int) (0),(int) (3));
RDebugUtils.currentLine=23134226;
 //BA.debugLineNum = 23134226;BA.debugLine="Dim count As Long";
_count = 0L;
RDebugUtils.currentLine=23134227;
 //BA.debugLineNum = 23134227;BA.debugLine="Dim MinCode As String =MCode.SingleResult(\"S";
_mincode = BA.ObjectToString(mostCurrent._mcode._singleresult /*Object*/ (mostCurrent.activityBA,"Select min(FldC_Gorooh) From TblGoroohAshkhas where FldC_Gorooh Like '"+_code2+"%'"));
RDebugUtils.currentLine=23134228;
 //BA.debugLineNum = 23134228;BA.debugLine="Dim sizeCode As Long=dt2.GetString(\"FldC_Gor";
_sizecode = (long) (_dt2.GetString("FldC_Gorooh").length());
RDebugUtils.currentLine=23134229;
 //BA.debugLineNum = 23134229;BA.debugLine="If MinCode.Length=sizeCode Then";
if (_mincode.length()==_sizecode) { 
RDebugUtils.currentLine=23134230;
 //BA.debugLineNum = 23134230;BA.debugLine="Dim Item As AdapterGoroohAshkhas";
_item = new ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas();
RDebugUtils.currentLine=23134231;
 //BA.debugLineNum = 23134231;BA.debugLine="Item.FldC_Gorooh= dt2.GetString(\"FldC_Goroo";
_item.FldC_Gorooh /*String*/  = _dt2.GetString("FldC_Gorooh");
RDebugUtils.currentLine=23134232;
 //BA.debugLineNum = 23134232;BA.debugLine="Item.FldN_Gorooh= dt2.GetString(\"FldN_Goroo";
_item.FldN_Gorooh /*String*/  = _dt2.GetString("FldN_Gorooh");
RDebugUtils.currentLine=23134233;
 //BA.debugLineNum = 23134233;BA.debugLine="OriginalListGoroohAshkhas1.Add(Item)";
mostCurrent._originallistgoroohashkhas1.Add((Object)(_item));
RDebugUtils.currentLine=23134234;
 //BA.debugLineNum = 23134234;BA.debugLine="lstGroup1.Add(Item.FldN_Gorooh)";
mostCurrent._lstgroup1.Add((Object)(_item.FldN_Gorooh /*String*/ ));
 }else {
RDebugUtils.currentLine=23134237;
 //BA.debugLineNum = 23134237;BA.debugLine="If MinCode.Length=sizeCode Then";
if (_mincode.length()==_sizecode) { 
RDebugUtils.currentLine=23134238;
 //BA.debugLineNum = 23134238;BA.debugLine="For Each a As AdapterGoroohAshkhas In Orig";
{
final anywheresoftware.b4a.BA.IterableList group27 = mostCurrent._originallistgoroohashkhas1;
final int groupLen27 = group27.getSize()
;int index27 = 0;
;
for (; index27 < groupLen27;index27++){
_a = (ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas)(group27.Get(index27));
RDebugUtils.currentLine=23134239;
 //BA.debugLineNum = 23134239;BA.debugLine="If a.FldC_Gorooh.SubString2(0,3)=code2 Th";
if ((_a.FldC_Gorooh /*String*/ .substring((int) (0),(int) (3))).equals(_code2)) { 
RDebugUtils.currentLine=23134240;
 //BA.debugLineNum = 23134240;BA.debugLine="count=1";
_count = (long) (1);
RDebugUtils.currentLine=23134241;
 //BA.debugLineNum = 23134241;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=23134244;
 //BA.debugLineNum = 23134244;BA.debugLine="If count =0 Then";
if (_count==0) { 
RDebugUtils.currentLine=23134245;
 //BA.debugLineNum = 23134245;BA.debugLine="Dim NameGroup,CodeGroup As String";
_namegroup = "";
_codegroup = "";
RDebugUtils.currentLine=23134246;
 //BA.debugLineNum = 23134246;BA.debugLine="CodeGroup=MinCode";
_codegroup = _mincode;
RDebugUtils.currentLine=23134247;
 //BA.debugLineNum = 23134247;BA.debugLine="NameGroup=MCode.SingleResult(\"Select FldN";
_namegroup = BA.ObjectToString(mostCurrent._mcode._singleresult /*Object*/ (mostCurrent.activityBA,"Select FldN_Gorooh From TblGoroohAshkhas where FldC_Gorooh='"+_mincode+"'"));
RDebugUtils.currentLine=23134248;
 //BA.debugLineNum = 23134248;BA.debugLine="Dim Item As AdapterGoroohAshkhas";
_item = new ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas();
RDebugUtils.currentLine=23134249;
 //BA.debugLineNum = 23134249;BA.debugLine="Item.FldC_Gorooh= CodeGroup";
_item.FldC_Gorooh /*String*/  = _codegroup;
RDebugUtils.currentLine=23134250;
 //BA.debugLineNum = 23134250;BA.debugLine="Item.FldN_Gorooh= NameGroup";
_item.FldN_Gorooh /*String*/  = _namegroup;
RDebugUtils.currentLine=23134251;
 //BA.debugLineNum = 23134251;BA.debugLine="OriginalListGoroohAshkhas1.Add(Item)";
mostCurrent._originallistgoroohashkhas1.Add((Object)(_item));
RDebugUtils.currentLine=23134252;
 //BA.debugLineNum = 23134252;BA.debugLine="lstGroup1.Add(Item.FldN_Gorooh)";
mostCurrent._lstgroup1.Add((Object)(_item.FldN_Gorooh /*String*/ ));
 };
 }else {
 };
 };
 }
};
 };
RDebugUtils.currentLine=23134270;
 //BA.debugLineNum = 23134270;BA.debugLine="lstTemp.Add(code)";
_lsttemp.Add((Object)(_code));
 };
 }
};
RDebugUtils.currentLine=23134301;
 //BA.debugLineNum = 23134301;BA.debugLine="NiceSpinner.attachDataSource(lstGroup1)";
mostCurrent._nicespinner.attachDataSource((java.util.List)(mostCurrent._lstgroup1.getObject()));
 } 
       catch (Exception e53) {
			processBA.setLastException(e53);RDebugUtils.currentLine=23134303;
 //BA.debugLineNum = 23134303;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("523134303",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=23134304;
 //BA.debugLineNum = 23134304;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-LoadAcSpGroohAshkas");
 };
RDebugUtils.currentLine=23134306;
 //BA.debugLineNum = 23134306;BA.debugLine="End Sub";
return "";
}
public static String  _loadacspgroohashkas2() throws Exception{
RDebugUtils.currentModule="act_selectmantage";
if (Debug.shouldDelegate(mostCurrent.activityBA, "loadacspgroohashkas2", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "loadacspgroohashkas2", null));}
anywheresoftware.b4a.objects.collections.List _lsttemp = null;
ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas _item1 = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _dt1 = null;
int _i = 0;
String _code = "";
String _indextemp = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _dt2 = null;
int _j = 0;
String _code2 = "";
long _count = 0L;
String _mincode = "";
long _sizecode = 0L;
ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas _item = null;
ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas _a = null;
String _namegroup = "";
String _codegroup = "";
RDebugUtils.currentLine=23068672;
 //BA.debugLineNum = 23068672;BA.debugLine="Sub LoadAcSpGroohAshkas2";
RDebugUtils.currentLine=23068673;
 //BA.debugLineNum = 23068673;BA.debugLine="Try";
try {RDebugUtils.currentLine=23068674;
 //BA.debugLineNum = 23068674;BA.debugLine="Dim lstTemp As List";
_lsttemp = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=23068675;
 //BA.debugLineNum = 23068675;BA.debugLine="lstTemp.Initialize";
_lsttemp.Initialize();
RDebugUtils.currentLine=23068677;
 //BA.debugLineNum = 23068677;BA.debugLine="Dim Item1 As AdapterGoroohAshkhas";
_item1 = new ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas();
RDebugUtils.currentLine=23068678;
 //BA.debugLineNum = 23068678;BA.debugLine="Item1.FldC_Gorooh= 0";
_item1.FldC_Gorooh /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=23068679;
 //BA.debugLineNum = 23068679;BA.debugLine="Item1.FldN_Gorooh= \"همه گروه ها\"";
_item1.FldN_Gorooh /*String*/  = "همه گروه ها";
RDebugUtils.currentLine=23068680;
 //BA.debugLineNum = 23068680;BA.debugLine="OriginalListGoroohAshkhas2.Add(Item1)";
mostCurrent._originallistgoroohashkhas2.Add((Object)(_item1));
RDebugUtils.currentLine=23068681;
 //BA.debugLineNum = 23068681;BA.debugLine="Dim Dt1 As Cursor = MCode.Result(\"Select FldC_Go";
_dt1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_dt1 = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas");
RDebugUtils.currentLine=23068682;
 //BA.debugLineNum = 23068682;BA.debugLine="For i=0 To Dt1.RowCount-1";
{
final int step9 = 1;
final int limit9 = (int) (_dt1.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=23068683;
 //BA.debugLineNum = 23068683;BA.debugLine="Dt1.Position=i";
_dt1.setPosition(_i);
RDebugUtils.currentLine=23068684;
 //BA.debugLineNum = 23068684;BA.debugLine="Dim code As String=Dt1.GetString(\"FldC_Gorooh\")";
_code = _dt1.GetString("FldC_Gorooh").substring((int) (0),(int) (3));
RDebugUtils.currentLine=23068685;
 //BA.debugLineNum = 23068685;BA.debugLine="Dim indexTemp As String=lstTemp.IndexOf(code)";
_indextemp = BA.NumberToString(_lsttemp.IndexOf((Object)(_code)));
RDebugUtils.currentLine=23068686;
 //BA.debugLineNum = 23068686;BA.debugLine="If indexTemp=-1 Then";
if ((_indextemp).equals(BA.NumberToString(-1))) { 
RDebugUtils.currentLine=23068687;
 //BA.debugLineNum = 23068687;BA.debugLine="Dim dt2 As Cursor =MCode.Result(\"Select * From";
_dt2 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_dt2 = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblGoroohAshkhas where FldC_Gorooh Like '"+_code+"%'");
RDebugUtils.currentLine=23068688;
 //BA.debugLineNum = 23068688;BA.debugLine="If dt2.RowCount>0 Then";
if (_dt2.getRowCount()>0) { 
RDebugUtils.currentLine=23068689;
 //BA.debugLineNum = 23068689;BA.debugLine="For j=0 To dt2.RowCount-1";
{
final int step16 = 1;
final int limit16 = (int) (_dt2.getRowCount()-1);
_j = (int) (0) ;
for (;_j <= limit16 ;_j = _j + step16 ) {
RDebugUtils.currentLine=23068690;
 //BA.debugLineNum = 23068690;BA.debugLine="dt2.Position=j";
_dt2.setPosition(_j);
RDebugUtils.currentLine=23068691;
 //BA.debugLineNum = 23068691;BA.debugLine="Dim code2 As String=dt2.GetString(\"FldC_Goro";
_code2 = _dt2.GetString("FldC_Gorooh").substring((int) (0),(int) (3));
RDebugUtils.currentLine=23068693;
 //BA.debugLineNum = 23068693;BA.debugLine="Dim count As Long";
_count = 0L;
RDebugUtils.currentLine=23068694;
 //BA.debugLineNum = 23068694;BA.debugLine="Dim MinCode As String =MCode.SingleResult(\"S";
_mincode = BA.ObjectToString(mostCurrent._mcode._singleresult /*Object*/ (mostCurrent.activityBA,"Select min(FldC_Gorooh) From TblGoroohAshkhas where FldC_Gorooh Like '"+_code2+"%'"));
RDebugUtils.currentLine=23068695;
 //BA.debugLineNum = 23068695;BA.debugLine="Dim sizeCode As Long=dt2.GetString(\"FldC_Gor";
_sizecode = (long) (_dt2.GetString("FldC_Gorooh").length());
RDebugUtils.currentLine=23068696;
 //BA.debugLineNum = 23068696;BA.debugLine="If MinCode.Length=sizeCode Then";
if (_mincode.length()==_sizecode) { 
RDebugUtils.currentLine=23068697;
 //BA.debugLineNum = 23068697;BA.debugLine="Dim Item As AdapterGoroohAshkhas";
_item = new ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas();
RDebugUtils.currentLine=23068698;
 //BA.debugLineNum = 23068698;BA.debugLine="Item.FldC_Gorooh= dt2.GetString(\"FldC_Goroo";
_item.FldC_Gorooh /*String*/  = _dt2.GetString("FldC_Gorooh");
RDebugUtils.currentLine=23068699;
 //BA.debugLineNum = 23068699;BA.debugLine="Item.FldN_Gorooh= dt2.GetString(\"FldN_Goroo";
_item.FldN_Gorooh /*String*/  = _dt2.GetString("FldN_Gorooh");
RDebugUtils.currentLine=23068700;
 //BA.debugLineNum = 23068700;BA.debugLine="OriginalListGoroohAshkhas2.Add(Item)";
mostCurrent._originallistgoroohashkhas2.Add((Object)(_item));
 }else {
RDebugUtils.currentLine=23068704;
 //BA.debugLineNum = 23068704;BA.debugLine="If MinCode.Length=sizeCode Then";
if (_mincode.length()==_sizecode) { 
RDebugUtils.currentLine=23068705;
 //BA.debugLineNum = 23068705;BA.debugLine="For Each a As AdapterGoroohAshkhas In Orig";
{
final anywheresoftware.b4a.BA.IterableList group29 = mostCurrent._originallistgoroohashkhas2;
final int groupLen29 = group29.getSize()
;int index29 = 0;
;
for (; index29 < groupLen29;index29++){
_a = (ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas)(group29.Get(index29));
RDebugUtils.currentLine=23068706;
 //BA.debugLineNum = 23068706;BA.debugLine="If a.FldC_Gorooh.SubString2(0,3)=code2 Th";
if ((_a.FldC_Gorooh /*String*/ .substring((int) (0),(int) (3))).equals(_code2)) { 
RDebugUtils.currentLine=23068707;
 //BA.debugLineNum = 23068707;BA.debugLine="count=1";
_count = (long) (1);
RDebugUtils.currentLine=23068708;
 //BA.debugLineNum = 23068708;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=23068711;
 //BA.debugLineNum = 23068711;BA.debugLine="If count =0 Then";
if (_count==0) { 
RDebugUtils.currentLine=23068712;
 //BA.debugLineNum = 23068712;BA.debugLine="Dim NameGroup,CodeGroup As String";
_namegroup = "";
_codegroup = "";
RDebugUtils.currentLine=23068713;
 //BA.debugLineNum = 23068713;BA.debugLine="CodeGroup=MinCode";
_codegroup = _mincode;
RDebugUtils.currentLine=23068714;
 //BA.debugLineNum = 23068714;BA.debugLine="NameGroup=MCode.SingleResult(\"Select FldN";
_namegroup = BA.ObjectToString(mostCurrent._mcode._singleresult /*Object*/ (mostCurrent.activityBA,"Select FldN_Gorooh From TblGoroohAshkhas where FldC_Gorooh='"+_mincode+"'"));
RDebugUtils.currentLine=23068715;
 //BA.debugLineNum = 23068715;BA.debugLine="Dim Item As AdapterGoroohAshkhas";
_item = new ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas();
RDebugUtils.currentLine=23068716;
 //BA.debugLineNum = 23068716;BA.debugLine="Item.FldC_Gorooh= CodeGroup";
_item.FldC_Gorooh /*String*/  = _codegroup;
RDebugUtils.currentLine=23068717;
 //BA.debugLineNum = 23068717;BA.debugLine="Item.FldN_Gorooh= NameGroup";
_item.FldN_Gorooh /*String*/  = _namegroup;
RDebugUtils.currentLine=23068718;
 //BA.debugLineNum = 23068718;BA.debugLine="OriginalListGoroohAshkhas2.Add(Item)";
mostCurrent._originallistgoroohashkhas2.Add((Object)(_item));
 };
 }else {
 };
 };
 }
};
 };
RDebugUtils.currentLine=23068737;
 //BA.debugLineNum = 23068737;BA.debugLine="lstTemp.Add(code)";
_lsttemp.Add((Object)(_code));
 };
 }
};
RDebugUtils.currentLine=23068828;
 //BA.debugLineNum = 23068828;BA.debugLine="ListGoroohAshkhas2 = OriginalListGoroohAshkhas2";
mostCurrent._listgoroohashkhas2 = mostCurrent._originallistgoroohashkhas2;
 } 
       catch (Exception e54) {
			processBA.setLastException(e54);RDebugUtils.currentLine=23068831;
 //BA.debugLineNum = 23068831;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("523068831",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=23068832;
 //BA.debugLineNum = 23068832;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-LoadAcSpGroohAshkas");
 };
RDebugUtils.currentLine=23068834;
 //BA.debugLineNum = 23068834;BA.debugLine="End Sub";
return "";
}
public static boolean  _activity_keypress(int _keycode) throws Exception{
RDebugUtils.currentModule="act_selectmantage";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_keypress", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "activity_keypress", new Object[] {_keycode}));}
RDebugUtils.currentLine=22740992;
 //BA.debugLineNum = 22740992;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
RDebugUtils.currentLine=22740994;
 //BA.debugLineNum = 22740994;BA.debugLine="If KeyCode=KeyCodes.KEYCODE_BACK Then";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK) { 
RDebugUtils.currentLine=22740995;
 //BA.debugLineNum = 22740995;BA.debugLine="If sidemenu.Visible Then";
if (mostCurrent._sidemenu.getVisible()) { 
RDebugUtils.currentLine=22740996;
 //BA.debugLineNum = 22740996;BA.debugLine="If MCode.C_LayeAshkhas.Length > 3 Then";
if (mostCurrent._mcode._c_layeashkhas /*String*/ .length()>3) { 
RDebugUtils.currentLine=22740997;
 //BA.debugLineNum = 22740997;BA.debugLine="LoadGoroohAshkasBack(MCode.C_LayeAshkhas)";
_loadgoroohashkasback(mostCurrent._mcode._c_layeashkhas /*String*/ );
RDebugUtils.currentLine=22740998;
 //BA.debugLineNum = 22740998;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 }else {
RDebugUtils.currentLine=22741000;
 //BA.debugLineNum = 22741000;BA.debugLine="sidemenu.HideMenus";
mostCurrent._sidemenu.HideMenus();
RDebugUtils.currentLine=22741001;
 //BA.debugLineNum = 22741001;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 };
 };
RDebugUtils.currentLine=22741005;
 //BA.debugLineNum = 22741005;BA.debugLine="btn_Back_Click";
_btn_back_click();
RDebugUtils.currentLine=22741006;
 //BA.debugLineNum = 22741006;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 };
RDebugUtils.currentLine=22741008;
 //BA.debugLineNum = 22741008;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=22741009;
 //BA.debugLineNum = 22741009;BA.debugLine="End Sub";
return false;
}
public static String  _loadgoroohashkasback(String _code) throws Exception{
RDebugUtils.currentModule="act_selectmantage";
if (Debug.shouldDelegate(mostCurrent.activityBA, "loadgoroohashkasback", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "loadgoroohashkasback", new Object[] {_code}));}
String _c_gorooh = "";
int _count = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _dt = null;
ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas _item1 = null;
int _i = 0;
ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas _item = null;
RDebugUtils.currentLine=23265280;
 //BA.debugLineNum = 23265280;BA.debugLine="Sub LoadGoroohAshkasBack(Code As String)";
RDebugUtils.currentLine=23265281;
 //BA.debugLineNum = 23265281;BA.debugLine="Try";
try {RDebugUtils.currentLine=23265282;
 //BA.debugLineNum = 23265282;BA.debugLine="Dim C_Gorooh As String = MCode.Sf.Left(Code,Code";
_c_gorooh = mostCurrent._mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vv0(_code,(long) (_code.length()-6));
RDebugUtils.currentLine=23265283;
 //BA.debugLineNum = 23265283;BA.debugLine="If C_Gorooh.Length=0 Then";
if (_c_gorooh.length()==0) { 
RDebugUtils.currentLine=23265284;
 //BA.debugLineNum = 23265284;BA.debugLine="OriginalListGoroohAshkhas2.Clear";
mostCurrent._originallistgoroohashkhas2.Clear();
RDebugUtils.currentLine=23265285;
 //BA.debugLineNum = 23265285;BA.debugLine="LoadAcSpGroohAshkas2";
_loadacspgroohashkas2();
RDebugUtils.currentLine=23265286;
 //BA.debugLineNum = 23265286;BA.debugLine="HLVGoroohAshkhas.notifyDataSetChanged";
mostCurrent._hlvgoroohashkhas.notifyDataSetChanged();
RDebugUtils.currentLine=23265287;
 //BA.debugLineNum = 23265287;BA.debugLine="LoadAshkhas";
_loadashkhas();
RDebugUtils.currentLine=23265288;
 //BA.debugLineNum = 23265288;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=23265290;
 //BA.debugLineNum = 23265290;BA.debugLine="Dim Count As Int = C_Gorooh.Length + 3";
_count = (int) (_c_gorooh.length()+3);
RDebugUtils.currentLine=23265291;
 //BA.debugLineNum = 23265291;BA.debugLine="Dim Dt As Cursor=MCode.Result(\"Select FldC_Goroo";
_dt = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_dt = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas where FldC_Gorooh Like '"+_c_gorooh+"%' And Length(FldC_Gorooh) = "+BA.NumberToString(_count)+" ORDER BY FldC_Gorooh");
RDebugUtils.currentLine=23265292;
 //BA.debugLineNum = 23265292;BA.debugLine="If Dt.RowCount>0 Then";
if (_dt.getRowCount()>0) { 
RDebugUtils.currentLine=23265293;
 //BA.debugLineNum = 23265293;BA.debugLine="OriginalListGoroohAshkhas2.Clear";
mostCurrent._originallistgoroohashkhas2.Clear();
RDebugUtils.currentLine=23265294;
 //BA.debugLineNum = 23265294;BA.debugLine="Dim Item1 As AdapterGoroohAshkhas";
_item1 = new ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas();
RDebugUtils.currentLine=23265295;
 //BA.debugLineNum = 23265295;BA.debugLine="Item1.FldC_Gorooh= 0";
_item1.FldC_Gorooh /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=23265296;
 //BA.debugLineNum = 23265296;BA.debugLine="Item1.FldN_Gorooh= \"همه گروه ها\"";
_item1.FldN_Gorooh /*String*/  = "همه گروه ها";
RDebugUtils.currentLine=23265297;
 //BA.debugLineNum = 23265297;BA.debugLine="OriginalListGoroohAshkhas2.Add(Item1)";
mostCurrent._originallistgoroohashkhas2.Add((Object)(_item1));
RDebugUtils.currentLine=23265298;
 //BA.debugLineNum = 23265298;BA.debugLine="For i=0 To Dt.RowCount-1";
{
final int step18 = 1;
final int limit18 = (int) (_dt.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit18 ;_i = _i + step18 ) {
RDebugUtils.currentLine=23265299;
 //BA.debugLineNum = 23265299;BA.debugLine="Dt.Position=i";
_dt.setPosition(_i);
RDebugUtils.currentLine=23265300;
 //BA.debugLineNum = 23265300;BA.debugLine="Dim Item As AdapterGoroohAshkhas";
_item = new ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas();
RDebugUtils.currentLine=23265301;
 //BA.debugLineNum = 23265301;BA.debugLine="Item.FldC_Gorooh= Dt.GetString(\"FldC_Gorooh\")";
_item.FldC_Gorooh /*String*/  = _dt.GetString("FldC_Gorooh");
RDebugUtils.currentLine=23265302;
 //BA.debugLineNum = 23265302;BA.debugLine="Item.FldN_Gorooh= Dt.GetString(\"FldN_Gorooh\")";
_item.FldN_Gorooh /*String*/  = _dt.GetString("FldN_Gorooh");
RDebugUtils.currentLine=23265303;
 //BA.debugLineNum = 23265303;BA.debugLine="OriginalListGoroohAshkhas2.Add(Item)";
mostCurrent._originallistgoroohashkhas2.Add((Object)(_item));
RDebugUtils.currentLine=23265304;
 //BA.debugLineNum = 23265304;BA.debugLine="MCode.C_LayeAshkhas=Item.FldC_Gorooh";
mostCurrent._mcode._c_layeashkhas /*String*/  = _item.FldC_Gorooh /*String*/ ;
 }
};
RDebugUtils.currentLine=23265306;
 //BA.debugLineNum = 23265306;BA.debugLine="ListGoroohAshkhas2 = OriginalListGoroohAshkhas2";
mostCurrent._listgoroohashkhas2 = mostCurrent._originallistgoroohashkhas2;
RDebugUtils.currentLine=23265307;
 //BA.debugLineNum = 23265307;BA.debugLine="HLVGoroohAshkhas.notifyDataSetChanged";
mostCurrent._hlvgoroohashkhas.notifyDataSetChanged();
 };
RDebugUtils.currentLine=23265309;
 //BA.debugLineNum = 23265309;BA.debugLine="LoadAshkhas";
_loadashkhas();
 } 
       catch (Exception e31) {
			processBA.setLastException(e31);RDebugUtils.currentLine=23265311;
 //BA.debugLineNum = 23265311;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("523265311",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=23265312;
 //BA.debugLineNum = 23265312;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-LoadGoroohAshkasBack");
 };
RDebugUtils.currentLine=23265314;
 //BA.debugLineNum = 23265314;BA.debugLine="End Sub";
return "";
}
public static String  _btn_back_click() throws Exception{
RDebugUtils.currentModule="act_selectmantage";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_back_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_back_click", null));}
RDebugUtils.currentLine=23789568;
 //BA.debugLineNum = 23789568;BA.debugLine="Sub btn_Back_Click";
RDebugUtils.currentLine=23789569;
 //BA.debugLineNum = 23789569;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=23789570;
 //BA.debugLineNum = 23789570;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="act_selectmantage";
RDebugUtils.currentLine=23724032;
 //BA.debugLineNum = 23724032;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=23724034;
 //BA.debugLineNum = 23724034;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="act_selectmantage";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=23658496;
 //BA.debugLineNum = 23658496;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=23658497;
 //BA.debugLineNum = 23658497;BA.debugLine="Try";
try {RDebugUtils.currentLine=23658500;
 //BA.debugLineNum = 23658500;BA.debugLine="If MCode.IsConnected=False And MCode.ConnectionS";
if (mostCurrent._mcode._isconnected /*boolean*/ (mostCurrent.activityBA)==anywheresoftware.b4a.keywords.Common.False && (mostCurrent._mcode._connectionstatus /*String*/ ).equals(BA.NumberToString(1))) { 
RDebugUtils.currentLine=23658501;
 //BA.debugLineNum = 23658501;BA.debugLine="ToastMessageShow(\"لطفا ارتباط اینترنت گوشی خود";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("لطفا ارتباط اینترنت گوشی خود را بررسی نمایید"),anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=23658510;
 //BA.debugLineNum = 23658510;BA.debugLine="StartService(FusedLocationService)";
anywheresoftware.b4a.keywords.Common.StartService(processBA,(Object)(mostCurrent._fusedlocationservice.getObject()));
RDebugUtils.currentLine=23658512;
 //BA.debugLineNum = 23658512;BA.debugLine="Log(\"Gps Start\")";
anywheresoftware.b4a.keywords.Common.LogImpl("523658512","Gps Start",0);
RDebugUtils.currentLine=23658513;
 //BA.debugLineNum = 23658513;BA.debugLine="LoadAshkhas";
_loadashkhas();
 } 
       catch (Exception e9) {
			processBA.setLastException(e9);RDebugUtils.currentLine=23658519;
 //BA.debugLineNum = 23658519;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("523658519",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=23658520;
 //BA.debugLineNum = 23658520;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-Activity_Resume");
 };
RDebugUtils.currentLine=23658522;
 //BA.debugLineNum = 23658522;BA.debugLine="End Sub";
return "";
}
public static void  _loadashkhas() throws Exception{
RDebugUtils.currentModule="act_selectmantage";
if (Debug.shouldDelegate(mostCurrent.activityBA, "loadashkhas", false))
	 {Debug.delegate(mostCurrent.activityBA, "loadashkhas", null); return;}
ResumableSub_LoadAshkhas rsub = new ResumableSub_LoadAshkhas(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_LoadAshkhas extends BA.ResumableSub {
public ResumableSub_LoadAshkhas(ir.parsikhesab.pakhsh.act_selectmantage parent) {
this.parent = parent;
}
ir.parsikhesab.pakhsh.act_selectmantage parent;
String _str = "";
int _countfilter = 0;
boolean _filter = false;
String _datemiladi = "";
String _time = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _cutedad = null;
String _search = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_selectmantage";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=22937601;
 //BA.debugLineNum = 22937601;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 212;
this.catchState = 211;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 211;
RDebugUtils.currentLine=22937603;
 //BA.debugLineNum = 22937603;BA.debugLine="UpdateVaziatAshkhas";
_updatevaziatashkhas();
RDebugUtils.currentLine=22937604;
 //BA.debugLineNum = 22937604;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_selectmantage", "loadashkhas"),(int) (1000));
this.state = 213;
return;
case 213:
//C
this.state = 4;
;
RDebugUtils.currentLine=22937605;
 //BA.debugLineNum = 22937605;BA.debugLine="Dim str As String=\"\"";
_str = "";
RDebugUtils.currentLine=22937606;
 //BA.debugLineNum = 22937606;BA.debugLine="Dim countfilter As Int=0";
_countfilter = (int) (0);
RDebugUtils.currentLine=22937607;
 //BA.debugLineNum = 22937607;BA.debugLine="Dim filter As Boolean=False";
_filter = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=22937608;
 //BA.debugLineNum = 22937608;BA.debugLine="DateTime.DateFormat=\"yyyy-MM-dd\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=22937609;
 //BA.debugLineNum = 22937609;BA.debugLine="Dim DateMiladi As String = MCode.ConvertNumbersP";
_datemiladi = parent.mostCurrent._mcode._convertnumberspersian2english /*String*/ (mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.getNow()));
RDebugUtils.currentLine=22937610;
 //BA.debugLineNum = 22937610;BA.debugLine="Dim Time As String = DateTime.Time(DateTime.Now)";
_time = anywheresoftware.b4a.keywords.Common.DateTime.Time(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
RDebugUtils.currentLine=22937611;
 //BA.debugLineNum = 22937611;BA.debugLine="Dim Date As String =MCode.DatePersian '& \"T\" & T";
parent.mostCurrent._date = parent.mostCurrent._mcode._datepersian /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=22937612;
 //BA.debugLineNum = 22937612;BA.debugLine="LogColor(\"D: \" & Date,Colors.Red)";
anywheresoftware.b4a.keywords.Common.LogImpl("522937612","D: "+parent.mostCurrent._date,anywheresoftware.b4a.keywords.Common.Colors.Red);
RDebugUtils.currentLine=22937613;
 //BA.debugLineNum = 22937613;BA.debugLine="Dim CuTedad As Cursor";
_cutedad = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=22937614;
 //BA.debugLineNum = 22937614;BA.debugLine="Log(GroupCodeSelect1)";
anywheresoftware.b4a.keywords.Common.LogImpl("522937614",parent.mostCurrent._groupcodeselect1,0);
RDebugUtils.currentLine=22937615;
 //BA.debugLineNum = 22937615;BA.debugLine="Log(GroupCodeSelect2)";
anywheresoftware.b4a.keywords.Common.LogImpl("522937615",parent.mostCurrent._groupcodeselect2,0);
RDebugUtils.currentLine=22937616;
 //BA.debugLineNum = 22937616;BA.debugLine="If GroupCodeSelect1=0 And GroupCodeSelect2=0 The";
if (true) break;

case 4:
//if
this.state = 77;
if ((parent.mostCurrent._groupcodeselect1).equals(BA.NumberToString(0)) && (parent.mostCurrent._groupcodeselect2).equals(BA.NumberToString(0))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=22937617;
 //BA.debugLineNum = 22937617;BA.debugLine="If SwVisit.Checked=True Then";
if (true) break;

case 7:
//if
this.state = 14;
if (parent.mostCurrent._swvisit.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=22937618;
 //BA.debugLineNum = 22937618;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=22937620;
 //BA.debugLineNum = 22937620;BA.debugLine="str= str & \" and FldLastVisit <> 0 \"";
_str = _str+" and FldLastVisit <> 0 ";
RDebugUtils.currentLine=22937621;
 //BA.debugLineNum = 22937621;BA.debugLine="filter=True";
_filter = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=22937622;
 //BA.debugLineNum = 22937622;BA.debugLine="If countfilter=1 Then";
if (true) break;

case 10:
//if
this.state = 13;
if (_countfilter==1) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=22937623;
 //BA.debugLineNum = 22937623;BA.debugLine="str=str.Replace(\" and \",\"\")";
_str = _str.replace(" and ","");
 if (true) break;

case 13:
//C
this.state = 14;
;
 if (true) break;
;
RDebugUtils.currentLine=22937627;
 //BA.debugLineNum = 22937627;BA.debugLine="If SwBlackList.Checked=True Then";

case 14:
//if
this.state = 21;
if (parent.mostCurrent._swblacklist.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=22937628;
 //BA.debugLineNum = 22937628;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=22937630;
 //BA.debugLineNum = 22937630;BA.debugLine="str= str & \" and fldBlackList = 1 \"";
_str = _str+" and fldBlackList = 1 ";
RDebugUtils.currentLine=22937631;
 //BA.debugLineNum = 22937631;BA.debugLine="filter=True";
_filter = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=22937632;
 //BA.debugLineNum = 22937632;BA.debugLine="If countfilter=1 Then";
if (true) break;

case 17:
//if
this.state = 20;
if (_countfilter==1) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=22937633;
 //BA.debugLineNum = 22937633;BA.debugLine="str=str.Replace(\" and \",\"\")";
_str = _str.replace(" and ","");
 if (true) break;

case 20:
//C
this.state = 21;
;
 if (true) break;
;
RDebugUtils.currentLine=22937637;
 //BA.debugLineNum = 22937637;BA.debugLine="If SwNew.Checked=True Then";

case 21:
//if
this.state = 28;
if (parent.mostCurrent._swnew.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 23;
}if (true) break;

case 23:
//C
this.state = 24;
RDebugUtils.currentLine=22937638;
 //BA.debugLineNum = 22937638;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=22937640;
 //BA.debugLineNum = 22937640;BA.debugLine="str= str & \" and length(fldCodetafzili)>5 \"";
_str = _str+" and length(fldCodetafzili)>5 ";
RDebugUtils.currentLine=22937641;
 //BA.debugLineNum = 22937641;BA.debugLine="filter=True";
_filter = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=22937642;
 //BA.debugLineNum = 22937642;BA.debugLine="If countfilter=1 Then";
if (true) break;

case 24:
//if
this.state = 27;
if (_countfilter==1) { 
this.state = 26;
}if (true) break;

case 26:
//C
this.state = 27;
RDebugUtils.currentLine=22937643;
 //BA.debugLineNum = 22937643;BA.debugLine="str=str.Replace(\" and \",\"\")";
_str = _str.replace(" and ","");
 if (true) break;

case 27:
//C
this.state = 28;
;
 if (true) break;
;
RDebugUtils.currentLine=22937647;
 //BA.debugLineNum = 22937647;BA.debugLine="If SwBed.Checked=True Then";

case 28:
//if
this.state = 35;
if (parent.mostCurrent._swbed.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 30;
}if (true) break;

case 30:
//C
this.state = 31;
RDebugUtils.currentLine=22937648;
 //BA.debugLineNum = 22937648;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=22937650;
 //BA.debugLineNum = 22937650;BA.debugLine="str= str & \" and fldMande > 0 \"";
_str = _str+" and fldMande > 0 ";
RDebugUtils.currentLine=22937651;
 //BA.debugLineNum = 22937651;BA.debugLine="filter=True";
_filter = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=22937652;
 //BA.debugLineNum = 22937652;BA.debugLine="If countfilter=1 Then";
if (true) break;

case 31:
//if
this.state = 34;
if (_countfilter==1) { 
this.state = 33;
}if (true) break;

case 33:
//C
this.state = 34;
RDebugUtils.currentLine=22937653;
 //BA.debugLineNum = 22937653;BA.debugLine="str=str.Replace(\" and \",\"\")";
_str = _str.replace(" and ","");
 if (true) break;

case 34:
//C
this.state = 35;
;
 if (true) break;
;
RDebugUtils.currentLine=22937657;
 //BA.debugLineNum = 22937657;BA.debugLine="If SwBes.Checked=True Then";

case 35:
//if
this.state = 42;
if (parent.mostCurrent._swbes.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 37;
}if (true) break;

case 37:
//C
this.state = 38;
RDebugUtils.currentLine=22937658;
 //BA.debugLineNum = 22937658;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=22937660;
 //BA.debugLineNum = 22937660;BA.debugLine="str= str & \" and fldMande < 0 \"";
_str = _str+" and fldMande < 0 ";
RDebugUtils.currentLine=22937661;
 //BA.debugLineNum = 22937661;BA.debugLine="filter=True";
_filter = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=22937662;
 //BA.debugLineNum = 22937662;BA.debugLine="If countfilter=1 Then";
if (true) break;

case 38:
//if
this.state = 41;
if (_countfilter==1) { 
this.state = 40;
}if (true) break;

case 40:
//C
this.state = 41;
RDebugUtils.currentLine=22937663;
 //BA.debugLineNum = 22937663;BA.debugLine="str=str.Replace(\" and \",\"\")";
_str = _str.replace(" and ","");
 if (true) break;

case 41:
//C
this.state = 42;
;
 if (true) break;
;
RDebugUtils.currentLine=22937669;
 //BA.debugLineNum = 22937669;BA.debugLine="If TxtSearch.Text.Length>0 And TxtSearch.Text<>";

case 42:
//if
this.state = 65;
if (parent.mostCurrent._txtsearch.getText().length()>0 && (parent.mostCurrent._txtsearch.getText()).equals(" ") == false && (parent.mostCurrent._txtsearch.getText()).equals("") == false) { 
this.state = 44;
}if (true) break;

case 44:
//C
this.state = 45;
RDebugUtils.currentLine=22937671;
 //BA.debugLineNum = 22937671;BA.debugLine="Dim Search As String=MCode.ConvertNumbersPersi";
_search = parent.mostCurrent._mcode._convertnumberspersian2english /*String*/ (mostCurrent.activityBA,parent.mostCurrent._txtsearch.getText());
RDebugUtils.currentLine=22937672;
 //BA.debugLineNum = 22937672;BA.debugLine="If Search=\"\" Then";
if (true) break;

case 45:
//if
this.state = 48;
if ((_search).equals("")) { 
this.state = 47;
}if (true) break;

case 47:
//C
this.state = 48;
RDebugUtils.currentLine=22937673;
 //BA.debugLineNum = 22937673;BA.debugLine="Search=TxtSearch.Text";
_search = parent.mostCurrent._txtsearch.getText();
 if (true) break;

case 48:
//C
this.state = 49;
;
RDebugUtils.currentLine=22937675;
 //BA.debugLineNum = 22937675;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=22937676;
 //BA.debugLineNum = 22937676;BA.debugLine="If swSearchByAddress.Checked Then";
if (true) break;

case 49:
//if
this.state = 60;
if (parent.mostCurrent._swsearchbyaddress.getChecked()) { 
this.state = 51;
}else {
this.state = 53;
}if (true) break;

case 51:
//C
this.state = 60;
RDebugUtils.currentLine=22937677;
 //BA.debugLineNum = 22937677;BA.debugLine="str = str & $\" and (fldAdress like '%${Search";
_str = _str+(" and (fldAdress like '%"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_search))+"%') ");
 if (true) break;

case 53:
//C
this.state = 54;
RDebugUtils.currentLine=22937679;
 //BA.debugLineNum = 22937679;BA.debugLine="If IsNumber(Search) Then";
if (true) break;

case 54:
//if
this.state = 59;
if (anywheresoftware.b4a.keywords.Common.IsNumber(_search)) { 
this.state = 56;
}else {
this.state = 58;
}if (true) break;

case 56:
//C
this.state = 59;
RDebugUtils.currentLine=22937680;
 //BA.debugLineNum = 22937680;BA.debugLine="str = str & $\" and (fldCodetafzili like '%${";
_str = _str+(" and (fldCodetafzili like '%"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_search))+"%') ");
 if (true) break;

case 58:
//C
this.state = 59;
RDebugUtils.currentLine=22937682;
 //BA.debugLineNum = 22937682;BA.debugLine="str = str & $\" and (fldSharheTafzili like '%";
_str = _str+(" and (fldSharheTafzili like '%"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_search))+"%') ");
 if (true) break;

case 59:
//C
this.state = 60;
;
 if (true) break;

case 60:
//C
this.state = 61;
;
RDebugUtils.currentLine=22937685;
 //BA.debugLineNum = 22937685;BA.debugLine="filter=True";
_filter = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=22937686;
 //BA.debugLineNum = 22937686;BA.debugLine="If countfilter=1 Then";
if (true) break;

case 61:
//if
this.state = 64;
if (_countfilter==1) { 
this.state = 63;
}if (true) break;

case 63:
//C
this.state = 64;
RDebugUtils.currentLine=22937687;
 //BA.debugLineNum = 22937687;BA.debugLine="str=str.Replace(\" and \",\"\")";
_str = _str.replace(" and ","");
 if (true) break;

case 64:
//C
this.state = 65;
;
 if (true) break;
;
RDebugUtils.currentLine=22937691;
 //BA.debugLineNum = 22937691;BA.debugLine="If SwTourToday.Checked=True Then";

case 65:
//if
this.state = 76;
if (parent.mostCurrent._swtourtoday.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 67;
}else {
this.state = 69;
}if (true) break;

case 67:
//C
this.state = 76;
RDebugUtils.currentLine=22937692;
 //BA.debugLineNum = 22937692;BA.debugLine="CuTedad = MCode.Result(\"Select * From TblAshkh";
_cutedad = parent.mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblAshkhas Where FldLastVisit = '"+parent.mostCurrent._date+"'");
RDebugUtils.currentLine=22937693;
 //BA.debugLineNum = 22937693;BA.debugLine="LblTedadVisit.Text =  CuTedad.RowCount";
parent.mostCurrent._lbltedadvisit.setText(BA.ObjectToCharSequence(_cutedad.getRowCount()));
RDebugUtils.currentLine=22937694;
 //BA.debugLineNum = 22937694;BA.debugLine="CuTedad = MCode.Result(\"Select * From TblAshkh";
_cutedad = parent.mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblAshkhas Where FldLastSefaresh = '"+parent.mostCurrent._date+"'");
RDebugUtils.currentLine=22937696;
 //BA.debugLineNum = 22937696;BA.debugLine="str=$\"SELECT TblAshkhas.*, tblTourVisitor.fldR";
_str = ("SELECT TblAshkhas.*, tblTourVisitor.fldRadif, tblTourVisitor.fldDateVisit, tblTourVisitor.fldVaziat as fldVaziatTour,tblTourVisitor.fldType FROM TblAshkhas,tblTourVisitor WHERE TblAshkhas.fldCodetafzili = tblTourVisitor.fldCodeTafzili AND tblTourVisitor.fldType='Tour' AND fldDateVisit = "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._mcode._datepersian /*String*/ (mostCurrent.activityBA)))+" ORDER BY fldRadif ASC");
 if (true) break;

case 69:
//C
this.state = 70;
RDebugUtils.currentLine=22937700;
 //BA.debugLineNum = 22937700;BA.debugLine="If filter=True And str<>\"\" Then";
if (true) break;

case 70:
//if
this.state = 75;
if (_filter==anywheresoftware.b4a.keywords.Common.True && (_str).equals("") == false) { 
this.state = 72;
}else {
this.state = 74;
}if (true) break;

case 72:
//C
this.state = 75;
RDebugUtils.currentLine=22937701;
 //BA.debugLineNum = 22937701;BA.debugLine="CuTedad = MCode.Result(\"Select * From TblAshk";
_cutedad = parent.mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblAshkhas Where "+_str+" and FldLastVisit > '"+parent.mostCurrent._date+"'");
RDebugUtils.currentLine=22937702;
 //BA.debugLineNum = 22937702;BA.debugLine="LblTedadVisit.Text =  CuTedad.RowCount";
parent.mostCurrent._lbltedadvisit.setText(BA.ObjectToCharSequence(_cutedad.getRowCount()));
RDebugUtils.currentLine=22937703;
 //BA.debugLineNum = 22937703;BA.debugLine="CuTedad = MCode.Result(\"Select * From TblAshk";
_cutedad = parent.mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblAshkhas Where "+_str+" and FldLastSefaresh > '"+parent.mostCurrent._date+"'");
RDebugUtils.currentLine=22937704;
 //BA.debugLineNum = 22937704;BA.debugLine="LblTedadSefaresh.Text =  CuTedad.RowCount";
parent.mostCurrent._lbltedadsefaresh.setText(BA.ObjectToCharSequence(_cutedad.getRowCount()));
RDebugUtils.currentLine=22937707;
 //BA.debugLineNum = 22937707;BA.debugLine="str=\"Select * From TblAshkhas where \"&str&\" \"";
_str = "Select * From TblAshkhas where "+_str+" "+parent.mostCurrent._str_sort;
 if (true) break;

case 74:
//C
this.state = 75;
RDebugUtils.currentLine=22937709;
 //BA.debugLineNum = 22937709;BA.debugLine="CuTedad = MCode.Result(\"Select * From TblAshk";
_cutedad = parent.mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblAshkhas Where FldLastVisit = '"+parent.mostCurrent._date+"'");
RDebugUtils.currentLine=22937710;
 //BA.debugLineNum = 22937710;BA.debugLine="LblTedadVisit.Text =  CuTedad.RowCount";
parent.mostCurrent._lbltedadvisit.setText(BA.ObjectToCharSequence(_cutedad.getRowCount()));
RDebugUtils.currentLine=22937711;
 //BA.debugLineNum = 22937711;BA.debugLine="CuTedad = MCode.Result(\"Select * From TblAshk";
_cutedad = parent.mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblAshkhas Where FldLastSefaresh = '"+parent.mostCurrent._date+"'");
RDebugUtils.currentLine=22937712;
 //BA.debugLineNum = 22937712;BA.debugLine="LblTedadSefaresh.Text =  CuTedad.RowCount";
parent.mostCurrent._lbltedadsefaresh.setText(BA.ObjectToCharSequence(_cutedad.getRowCount()));
RDebugUtils.currentLine=22937714;
 //BA.debugLineNum = 22937714;BA.debugLine="str=\"Select * From TblAshkhas \"&Str_sort";
_str = "Select * From TblAshkhas "+parent.mostCurrent._str_sort;
 if (true) break;

case 75:
//C
this.state = 76;
;
RDebugUtils.currentLine=22937717;
 //BA.debugLineNum = 22937717;BA.debugLine="Log(str)";
anywheresoftware.b4a.keywords.Common.LogImpl("522937717",_str,0);
 if (true) break;

case 76:
//C
this.state = 77;
;
 if (true) break;
;
RDebugUtils.currentLine=22937722;
 //BA.debugLineNum = 22937722;BA.debugLine="If GroupCodeSelect1<>0 And GroupCodeSelect2=0 Th";

case 77:
//if
this.state = 143;
if ((parent.mostCurrent._groupcodeselect1).equals(BA.NumberToString(0)) == false && (parent.mostCurrent._groupcodeselect2).equals(BA.NumberToString(0))) { 
this.state = 79;
}if (true) break;

case 79:
//C
this.state = 80;
RDebugUtils.currentLine=22937724;
 //BA.debugLineNum = 22937724;BA.debugLine="If SwVisit.Checked=True Then";
if (true) break;

case 80:
//if
this.state = 87;
if (parent.mostCurrent._swvisit.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 82;
}if (true) break;

case 82:
//C
this.state = 83;
RDebugUtils.currentLine=22937725;
 //BA.debugLineNum = 22937725;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=22937727;
 //BA.debugLineNum = 22937727;BA.debugLine="str= str & \" and FldLastVisit <> 0 \"";
_str = _str+" and FldLastVisit <> 0 ";
RDebugUtils.currentLine=22937728;
 //BA.debugLineNum = 22937728;BA.debugLine="filter=True";
_filter = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=22937729;
 //BA.debugLineNum = 22937729;BA.debugLine="If countfilter=1 Then";
if (true) break;

case 83:
//if
this.state = 86;
if (_countfilter==1) { 
this.state = 85;
}if (true) break;

case 85:
//C
this.state = 86;
RDebugUtils.currentLine=22937730;
 //BA.debugLineNum = 22937730;BA.debugLine="str=str.Replace(\" and \",\"\")";
_str = _str.replace(" and ","");
 if (true) break;

case 86:
//C
this.state = 87;
;
 if (true) break;
;
RDebugUtils.currentLine=22937734;
 //BA.debugLineNum = 22937734;BA.debugLine="If SwNew.Checked=True Then";

case 87:
//if
this.state = 94;
if (parent.mostCurrent._swnew.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 89;
}if (true) break;

case 89:
//C
this.state = 90;
RDebugUtils.currentLine=22937735;
 //BA.debugLineNum = 22937735;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=22937737;
 //BA.debugLineNum = 22937737;BA.debugLine="str= str & \" and length(fldCodetafzili)>5 \"";
_str = _str+" and length(fldCodetafzili)>5 ";
RDebugUtils.currentLine=22937738;
 //BA.debugLineNum = 22937738;BA.debugLine="filter=True";
_filter = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=22937739;
 //BA.debugLineNum = 22937739;BA.debugLine="If countfilter=1 Then";
if (true) break;

case 90:
//if
this.state = 93;
if (_countfilter==1) { 
this.state = 92;
}if (true) break;

case 92:
//C
this.state = 93;
RDebugUtils.currentLine=22937740;
 //BA.debugLineNum = 22937740;BA.debugLine="str=str.Replace(\" and \",\"\")";
_str = _str.replace(" and ","");
 if (true) break;

case 93:
//C
this.state = 94;
;
 if (true) break;
;
RDebugUtils.currentLine=22937744;
 //BA.debugLineNum = 22937744;BA.debugLine="If SwBed.Checked=True Then";

case 94:
//if
this.state = 101;
if (parent.mostCurrent._swbed.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 96;
}if (true) break;

case 96:
//C
this.state = 97;
RDebugUtils.currentLine=22937745;
 //BA.debugLineNum = 22937745;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=22937747;
 //BA.debugLineNum = 22937747;BA.debugLine="str= str & \" and fldMande > 0 \"";
_str = _str+" and fldMande > 0 ";
RDebugUtils.currentLine=22937748;
 //BA.debugLineNum = 22937748;BA.debugLine="filter=True";
_filter = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=22937749;
 //BA.debugLineNum = 22937749;BA.debugLine="If countfilter=1 Then";
if (true) break;

case 97:
//if
this.state = 100;
if (_countfilter==1) { 
this.state = 99;
}if (true) break;

case 99:
//C
this.state = 100;
RDebugUtils.currentLine=22937750;
 //BA.debugLineNum = 22937750;BA.debugLine="str=str.Replace(\" and \",\"\")";
_str = _str.replace(" and ","");
 if (true) break;

case 100:
//C
this.state = 101;
;
 if (true) break;
;
RDebugUtils.currentLine=22937754;
 //BA.debugLineNum = 22937754;BA.debugLine="If SwBes.Checked=True Then";

case 101:
//if
this.state = 108;
if (parent.mostCurrent._swbes.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 103;
}if (true) break;

case 103:
//C
this.state = 104;
RDebugUtils.currentLine=22937755;
 //BA.debugLineNum = 22937755;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=22937757;
 //BA.debugLineNum = 22937757;BA.debugLine="str= str & \" and fldMande < 0 \"";
_str = _str+" and fldMande < 0 ";
RDebugUtils.currentLine=22937758;
 //BA.debugLineNum = 22937758;BA.debugLine="filter=True";
_filter = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=22937759;
 //BA.debugLineNum = 22937759;BA.debugLine="If countfilter=1 Then";
if (true) break;

case 104:
//if
this.state = 107;
if (_countfilter==1) { 
this.state = 106;
}if (true) break;

case 106:
//C
this.state = 107;
RDebugUtils.currentLine=22937760;
 //BA.debugLineNum = 22937760;BA.debugLine="str=str.Replace(\" and \",\"\")";
_str = _str.replace(" and ","");
 if (true) break;

case 107:
//C
this.state = 108;
;
 if (true) break;
;
RDebugUtils.currentLine=22937765;
 //BA.debugLineNum = 22937765;BA.debugLine="If TxtSearch.Text.Length>0 And TxtSearch.Text<>";

case 108:
//if
this.state = 131;
if (parent.mostCurrent._txtsearch.getText().length()>0 && (parent.mostCurrent._txtsearch.getText()).equals(" ") == false && (parent.mostCurrent._txtsearch.getText()).equals("") == false) { 
this.state = 110;
}if (true) break;

case 110:
//C
this.state = 111;
RDebugUtils.currentLine=22937767;
 //BA.debugLineNum = 22937767;BA.debugLine="Dim Search As String=MCode.ConvertNumbersPersi";
_search = parent.mostCurrent._mcode._convertnumberspersian2english /*String*/ (mostCurrent.activityBA,parent.mostCurrent._txtsearch.getText());
RDebugUtils.currentLine=22937768;
 //BA.debugLineNum = 22937768;BA.debugLine="If Search=\"\" Then";
if (true) break;

case 111:
//if
this.state = 114;
if ((_search).equals("")) { 
this.state = 113;
}if (true) break;

case 113:
//C
this.state = 114;
RDebugUtils.currentLine=22937769;
 //BA.debugLineNum = 22937769;BA.debugLine="Search=TxtSearch.Text";
_search = parent.mostCurrent._txtsearch.getText();
 if (true) break;

case 114:
//C
this.state = 115;
;
RDebugUtils.currentLine=22937771;
 //BA.debugLineNum = 22937771;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=22937772;
 //BA.debugLineNum = 22937772;BA.debugLine="If swSearchByAddress.Checked Then";
if (true) break;

case 115:
//if
this.state = 126;
if (parent.mostCurrent._swsearchbyaddress.getChecked()) { 
this.state = 117;
}else {
this.state = 119;
}if (true) break;

case 117:
//C
this.state = 126;
RDebugUtils.currentLine=22937773;
 //BA.debugLineNum = 22937773;BA.debugLine="str = str & $\" and (fldAdress like '%${Search";
_str = _str+(" and (fldAdress like '%"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_search))+"%') ");
 if (true) break;

case 119:
//C
this.state = 120;
RDebugUtils.currentLine=22937775;
 //BA.debugLineNum = 22937775;BA.debugLine="If IsNumber(Search) Then";
if (true) break;

case 120:
//if
this.state = 125;
if (anywheresoftware.b4a.keywords.Common.IsNumber(_search)) { 
this.state = 122;
}else {
this.state = 124;
}if (true) break;

case 122:
//C
this.state = 125;
RDebugUtils.currentLine=22937776;
 //BA.debugLineNum = 22937776;BA.debugLine="str = str & $\" and (fldCodetafzili like '%${";
_str = _str+(" and (fldCodetafzili like '%"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_search))+"%') ");
 if (true) break;

case 124:
//C
this.state = 125;
RDebugUtils.currentLine=22937778;
 //BA.debugLineNum = 22937778;BA.debugLine="str = str & $\" and (fldSharheTafzili like '%";
_str = _str+(" and (fldSharheTafzili like '%"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_search))+"%') ");
 if (true) break;

case 125:
//C
this.state = 126;
;
 if (true) break;

case 126:
//C
this.state = 127;
;
RDebugUtils.currentLine=22937781;
 //BA.debugLineNum = 22937781;BA.debugLine="filter=True";
_filter = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=22937782;
 //BA.debugLineNum = 22937782;BA.debugLine="If countfilter=1 Then";
if (true) break;

case 127:
//if
this.state = 130;
if (_countfilter==1) { 
this.state = 129;
}if (true) break;

case 129:
//C
this.state = 130;
RDebugUtils.currentLine=22937783;
 //BA.debugLineNum = 22937783;BA.debugLine="str=str.Replace(\" and \",\"\")";
_str = _str.replace(" and ","");
 if (true) break;

case 130:
//C
this.state = 131;
;
 if (true) break;
;
RDebugUtils.currentLine=22937786;
 //BA.debugLineNum = 22937786;BA.debugLine="If SwTourToday.Checked=True Then";

case 131:
//if
this.state = 142;
if (parent.mostCurrent._swtourtoday.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 133;
}else {
this.state = 135;
}if (true) break;

case 133:
//C
this.state = 142;
RDebugUtils.currentLine=22937787;
 //BA.debugLineNum = 22937787;BA.debugLine="CuTedad = MCode.Result(\"Select * From TblAshkh";
_cutedad = parent.mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblAshkhas Where FldLastVisit = '"+parent.mostCurrent._date+"'");
RDebugUtils.currentLine=22937788;
 //BA.debugLineNum = 22937788;BA.debugLine="LblTedadVisit.Text =  CuTedad.RowCount";
parent.mostCurrent._lbltedadvisit.setText(BA.ObjectToCharSequence(_cutedad.getRowCount()));
RDebugUtils.currentLine=22937789;
 //BA.debugLineNum = 22937789;BA.debugLine="CuTedad = MCode.Result(\"Select * From TblAshkh";
_cutedad = parent.mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblAshkhas Where FldLastSefaresh = '"+parent.mostCurrent._date+"'");
RDebugUtils.currentLine=22937791;
 //BA.debugLineNum = 22937791;BA.debugLine="str=$\"SELECT TblAshkhas.*, tblTourVisitor.fldR";
_str = ("SELECT TblAshkhas.*, tblTourVisitor.fldRadif, tblTourVisitor.fldDateVisit, tblTourVisitor.fldVaziat as fldVaziatTour,tblTourVisitor.fldType FROM TblAshkhas,tblTourVisitor WHERE TblAshkhas.fldCodetafzili = tblTourVisitor.fldCodeTafzili AND tblTourVisitor.fldType='Tour' AND fldDateVisit = "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._mcode._datepersian /*String*/ (mostCurrent.activityBA)))+" ORDER BY fldRadif ASC");
 if (true) break;

case 135:
//C
this.state = 136;
RDebugUtils.currentLine=22937795;
 //BA.debugLineNum = 22937795;BA.debugLine="If filter=True And str<>\"\" Then";
if (true) break;

case 136:
//if
this.state = 141;
if (_filter==anywheresoftware.b4a.keywords.Common.True && (_str).equals("") == false) { 
this.state = 138;
}else {
this.state = 140;
}if (true) break;

case 138:
//C
this.state = 141;
RDebugUtils.currentLine=22937796;
 //BA.debugLineNum = 22937796;BA.debugLine="CuTedad = MCode.Result(\"Select * From TblAshk";
_cutedad = parent.mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblAshkhas Where fldCodeGroup like '"+parent.mostCurrent._groupcodeselect1+"%' and "+_str+" and FldLastVisit = '"+parent.mostCurrent._date+"'");
RDebugUtils.currentLine=22937797;
 //BA.debugLineNum = 22937797;BA.debugLine="LblTedadVisit.Text =  CuTedad.RowCount";
parent.mostCurrent._lbltedadvisit.setText(BA.ObjectToCharSequence(_cutedad.getRowCount()));
RDebugUtils.currentLine=22937798;
 //BA.debugLineNum = 22937798;BA.debugLine="CuTedad = MCode.Result(\"Select * From TblAshk";
_cutedad = parent.mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblAshkhas Where fldCodeGroup like '"+parent.mostCurrent._groupcodeselect1+"%' and "+_str+" and FldLastSefaresh = '"+parent.mostCurrent._date+"'");
RDebugUtils.currentLine=22937799;
 //BA.debugLineNum = 22937799;BA.debugLine="LblTedadSefaresh.Text =  CuTedad.RowCount";
parent.mostCurrent._lbltedadsefaresh.setText(BA.ObjectToCharSequence(_cutedad.getRowCount()));
RDebugUtils.currentLine=22937801;
 //BA.debugLineNum = 22937801;BA.debugLine="str=\"Select * From TblAshkhas Where fldCodeGr";
_str = "Select * From TblAshkhas Where fldCodeGroup like '"+parent.mostCurrent._groupcodeselect1+"%' and "+_str+" "+parent.mostCurrent._str_sort;
RDebugUtils.currentLine=22937802;
 //BA.debugLineNum = 22937802;BA.debugLine="Log(str)";
anywheresoftware.b4a.keywords.Common.LogImpl("522937802",_str,0);
 if (true) break;

case 140:
//C
this.state = 141;
RDebugUtils.currentLine=22937804;
 //BA.debugLineNum = 22937804;BA.debugLine="CuTedad = MCode.Result(\"Select * From TblAshk";
_cutedad = parent.mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblAshkhas Where fldCodeGroup like '"+parent.mostCurrent._groupcodeselect1+"%' and FldLastVisit = '"+parent.mostCurrent._date+"'");
RDebugUtils.currentLine=22937805;
 //BA.debugLineNum = 22937805;BA.debugLine="LblTedadVisit.Text =  CuTedad.RowCount";
parent.mostCurrent._lbltedadvisit.setText(BA.ObjectToCharSequence(_cutedad.getRowCount()));
RDebugUtils.currentLine=22937806;
 //BA.debugLineNum = 22937806;BA.debugLine="CuTedad = MCode.Result(\"Select * From TblAshk";
_cutedad = parent.mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblAshkhas Where fldCodeGroup like '"+parent.mostCurrent._groupcodeselect1+"%' and FldLastSefaresh = '"+parent.mostCurrent._date+"'");
RDebugUtils.currentLine=22937807;
 //BA.debugLineNum = 22937807;BA.debugLine="LblTedadSefaresh.Text =  CuTedad.RowCount";
parent.mostCurrent._lbltedadsefaresh.setText(BA.ObjectToCharSequence(_cutedad.getRowCount()));
RDebugUtils.currentLine=22937809;
 //BA.debugLineNum = 22937809;BA.debugLine="str=\"Select * From TblAshkhas Where fldCodeGr";
_str = "Select * From TblAshkhas Where fldCodeGroup like '"+parent.mostCurrent._groupcodeselect1+"%' "+parent.mostCurrent._str_sort;
RDebugUtils.currentLine=22937810;
 //BA.debugLineNum = 22937810;BA.debugLine="Log(str)";
anywheresoftware.b4a.keywords.Common.LogImpl("522937810",_str,0);
 if (true) break;

case 141:
//C
this.state = 142;
;
 if (true) break;

case 142:
//C
this.state = 143;
;
 if (true) break;
;
RDebugUtils.currentLine=22937817;
 //BA.debugLineNum = 22937817;BA.debugLine="If GroupCodeSelect1<>0 And GroupCodeSelect2<>0 T";

case 143:
//if
this.state = 209;
if ((parent.mostCurrent._groupcodeselect1).equals(BA.NumberToString(0)) == false && (parent.mostCurrent._groupcodeselect2).equals(BA.NumberToString(0)) == false) { 
this.state = 145;
}if (true) break;

case 145:
//C
this.state = 146;
RDebugUtils.currentLine=22937818;
 //BA.debugLineNum = 22937818;BA.debugLine="If SwVisit.Checked=True Then";
if (true) break;

case 146:
//if
this.state = 153;
if (parent.mostCurrent._swvisit.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 148;
}if (true) break;

case 148:
//C
this.state = 149;
RDebugUtils.currentLine=22937819;
 //BA.debugLineNum = 22937819;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=22937821;
 //BA.debugLineNum = 22937821;BA.debugLine="str= str & \" and FldLastVisit <> 0 \"";
_str = _str+" and FldLastVisit <> 0 ";
RDebugUtils.currentLine=22937822;
 //BA.debugLineNum = 22937822;BA.debugLine="filter=True";
_filter = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=22937823;
 //BA.debugLineNum = 22937823;BA.debugLine="If countfilter=1 Then";
if (true) break;

case 149:
//if
this.state = 152;
if (_countfilter==1) { 
this.state = 151;
}if (true) break;

case 151:
//C
this.state = 152;
RDebugUtils.currentLine=22937824;
 //BA.debugLineNum = 22937824;BA.debugLine="str=str.Replace(\" and \",\"\")";
_str = _str.replace(" and ","");
 if (true) break;

case 152:
//C
this.state = 153;
;
 if (true) break;
;
RDebugUtils.currentLine=22937828;
 //BA.debugLineNum = 22937828;BA.debugLine="If SwNew.Checked=True Then";

case 153:
//if
this.state = 160;
if (parent.mostCurrent._swnew.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 155;
}if (true) break;

case 155:
//C
this.state = 156;
RDebugUtils.currentLine=22937829;
 //BA.debugLineNum = 22937829;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=22937831;
 //BA.debugLineNum = 22937831;BA.debugLine="str= str & \" and length(fldCodetafzili)>5 \"";
_str = _str+" and length(fldCodetafzili)>5 ";
RDebugUtils.currentLine=22937832;
 //BA.debugLineNum = 22937832;BA.debugLine="filter=True";
_filter = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=22937833;
 //BA.debugLineNum = 22937833;BA.debugLine="If countfilter=1 Then";
if (true) break;

case 156:
//if
this.state = 159;
if (_countfilter==1) { 
this.state = 158;
}if (true) break;

case 158:
//C
this.state = 159;
RDebugUtils.currentLine=22937834;
 //BA.debugLineNum = 22937834;BA.debugLine="str=str.Replace(\" and \",\"\")";
_str = _str.replace(" and ","");
 if (true) break;

case 159:
//C
this.state = 160;
;
 if (true) break;
;
RDebugUtils.currentLine=22937838;
 //BA.debugLineNum = 22937838;BA.debugLine="If SwBed.Checked=True Then";

case 160:
//if
this.state = 167;
if (parent.mostCurrent._swbed.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 162;
}if (true) break;

case 162:
//C
this.state = 163;
RDebugUtils.currentLine=22937839;
 //BA.debugLineNum = 22937839;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=22937841;
 //BA.debugLineNum = 22937841;BA.debugLine="str= str & \" and fldMande > 0 \"";
_str = _str+" and fldMande > 0 ";
RDebugUtils.currentLine=22937842;
 //BA.debugLineNum = 22937842;BA.debugLine="filter=True";
_filter = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=22937843;
 //BA.debugLineNum = 22937843;BA.debugLine="If countfilter=1 Then";
if (true) break;

case 163:
//if
this.state = 166;
if (_countfilter==1) { 
this.state = 165;
}if (true) break;

case 165:
//C
this.state = 166;
RDebugUtils.currentLine=22937844;
 //BA.debugLineNum = 22937844;BA.debugLine="str=str.Replace(\" and \",\"\")";
_str = _str.replace(" and ","");
 if (true) break;

case 166:
//C
this.state = 167;
;
 if (true) break;
;
RDebugUtils.currentLine=22937848;
 //BA.debugLineNum = 22937848;BA.debugLine="If SwBes.Checked=True Then";

case 167:
//if
this.state = 174;
if (parent.mostCurrent._swbes.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 169;
}if (true) break;

case 169:
//C
this.state = 170;
RDebugUtils.currentLine=22937849;
 //BA.debugLineNum = 22937849;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=22937851;
 //BA.debugLineNum = 22937851;BA.debugLine="str= str & \" and fldMande < 0 \"";
_str = _str+" and fldMande < 0 ";
RDebugUtils.currentLine=22937852;
 //BA.debugLineNum = 22937852;BA.debugLine="filter=True";
_filter = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=22937853;
 //BA.debugLineNum = 22937853;BA.debugLine="If countfilter=1 Then";
if (true) break;

case 170:
//if
this.state = 173;
if (_countfilter==1) { 
this.state = 172;
}if (true) break;

case 172:
//C
this.state = 173;
RDebugUtils.currentLine=22937854;
 //BA.debugLineNum = 22937854;BA.debugLine="str=str.Replace(\" and \",\"\")";
_str = _str.replace(" and ","");
 if (true) break;

case 173:
//C
this.state = 174;
;
 if (true) break;
;
RDebugUtils.currentLine=22937859;
 //BA.debugLineNum = 22937859;BA.debugLine="If TxtSearch.Text.Length>0 And TxtSearch.Text<>";

case 174:
//if
this.state = 197;
if (parent.mostCurrent._txtsearch.getText().length()>0 && (parent.mostCurrent._txtsearch.getText()).equals(" ") == false && (parent.mostCurrent._txtsearch.getText()).equals("") == false) { 
this.state = 176;
}if (true) break;

case 176:
//C
this.state = 177;
RDebugUtils.currentLine=22937861;
 //BA.debugLineNum = 22937861;BA.debugLine="Dim Search As String=TxtSearch.Text";
_search = parent.mostCurrent._txtsearch.getText();
RDebugUtils.currentLine=22937862;
 //BA.debugLineNum = 22937862;BA.debugLine="If Search=\"\" Then";
if (true) break;

case 177:
//if
this.state = 180;
if ((_search).equals("")) { 
this.state = 179;
}if (true) break;

case 179:
//C
this.state = 180;
RDebugUtils.currentLine=22937863;
 //BA.debugLineNum = 22937863;BA.debugLine="Search=TxtSearch.Text";
_search = parent.mostCurrent._txtsearch.getText();
 if (true) break;

case 180:
//C
this.state = 181;
;
RDebugUtils.currentLine=22937865;
 //BA.debugLineNum = 22937865;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=22937866;
 //BA.debugLineNum = 22937866;BA.debugLine="If swSearchByAddress.Checked Then";
if (true) break;

case 181:
//if
this.state = 192;
if (parent.mostCurrent._swsearchbyaddress.getChecked()) { 
this.state = 183;
}else {
this.state = 185;
}if (true) break;

case 183:
//C
this.state = 192;
RDebugUtils.currentLine=22937867;
 //BA.debugLineNum = 22937867;BA.debugLine="str = str & $\" and (fldAdress like '%${Search";
_str = _str+(" and (fldAdress like '%"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_search))+"%') ");
 if (true) break;

case 185:
//C
this.state = 186;
RDebugUtils.currentLine=22937869;
 //BA.debugLineNum = 22937869;BA.debugLine="If IsNumber(Search) Then";
if (true) break;

case 186:
//if
this.state = 191;
if (anywheresoftware.b4a.keywords.Common.IsNumber(_search)) { 
this.state = 188;
}else {
this.state = 190;
}if (true) break;

case 188:
//C
this.state = 191;
RDebugUtils.currentLine=22937870;
 //BA.debugLineNum = 22937870;BA.debugLine="str = str & $\" and (fldCodetafzili like '%${";
_str = _str+(" and (fldCodetafzili like '%"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_search))+"%') ");
 if (true) break;

case 190:
//C
this.state = 191;
RDebugUtils.currentLine=22937872;
 //BA.debugLineNum = 22937872;BA.debugLine="str = str & $\" and (fldSharheTafzili like '%";
_str = _str+(" and (fldSharheTafzili like '%"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_search))+"%') ");
 if (true) break;

case 191:
//C
this.state = 192;
;
 if (true) break;

case 192:
//C
this.state = 193;
;
RDebugUtils.currentLine=22937876;
 //BA.debugLineNum = 22937876;BA.debugLine="filter=True";
_filter = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=22937877;
 //BA.debugLineNum = 22937877;BA.debugLine="If countfilter=1 Then";
if (true) break;

case 193:
//if
this.state = 196;
if (_countfilter==1) { 
this.state = 195;
}if (true) break;

case 195:
//C
this.state = 196;
RDebugUtils.currentLine=22937878;
 //BA.debugLineNum = 22937878;BA.debugLine="str=str.Replace(\" and \",\"\")";
_str = _str.replace(" and ","");
 if (true) break;

case 196:
//C
this.state = 197;
;
 if (true) break;
;
RDebugUtils.currentLine=22937881;
 //BA.debugLineNum = 22937881;BA.debugLine="If SwTourToday.Checked=True Then";

case 197:
//if
this.state = 208;
if (parent.mostCurrent._swtourtoday.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 199;
}else {
this.state = 201;
}if (true) break;

case 199:
//C
this.state = 208;
RDebugUtils.currentLine=22937882;
 //BA.debugLineNum = 22937882;BA.debugLine="CuTedad = MCode.Result(\"Select * From TblAshkh";
_cutedad = parent.mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblAshkhas Where FldLastVisit = '"+parent.mostCurrent._date+"'");
RDebugUtils.currentLine=22937883;
 //BA.debugLineNum = 22937883;BA.debugLine="LblTedadVisit.Text =  CuTedad.RowCount";
parent.mostCurrent._lbltedadvisit.setText(BA.ObjectToCharSequence(_cutedad.getRowCount()));
RDebugUtils.currentLine=22937884;
 //BA.debugLineNum = 22937884;BA.debugLine="CuTedad = MCode.Result(\"Select * From TblAshkh";
_cutedad = parent.mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblAshkhas Where FldLastSefaresh = '"+parent.mostCurrent._date+"'");
RDebugUtils.currentLine=22937886;
 //BA.debugLineNum = 22937886;BA.debugLine="str=$\"SELECT TblAshkhas.*, tblTourVisitor.fldR";
_str = ("SELECT TblAshkhas.*, tblTourVisitor.fldRadif, tblTourVisitor.fldDateVisit, tblTourVisitor.fldVaziat as fldVaziatTour,tblTourVisitor.fldType FROM TblAshkhas,tblTourVisitor WHERE TblAshkhas.fldCodetafzili = tblTourVisitor.fldCodeTafzili AND tblTourVisitor.fldType='Tour' AND fldDateVisit = "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._mcode._datepersian /*String*/ (mostCurrent.activityBA)))+" ORDER BY fldRadif ASC");
 if (true) break;

case 201:
//C
this.state = 202;
RDebugUtils.currentLine=22937890;
 //BA.debugLineNum = 22937890;BA.debugLine="If filter=True And str<>\"\" Then";
if (true) break;

case 202:
//if
this.state = 207;
if (_filter==anywheresoftware.b4a.keywords.Common.True && (_str).equals("") == false) { 
this.state = 204;
}else {
this.state = 206;
}if (true) break;

case 204:
//C
this.state = 207;
RDebugUtils.currentLine=22937891;
 //BA.debugLineNum = 22937891;BA.debugLine="CuTedad = MCode.Result(\"Select * From TblAshk";
_cutedad = parent.mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblAshkhas Where fldCodeGroup like '"+parent.mostCurrent._groupcodeselect2+"%' and "+_str+" and FldLastVisit = '"+parent.mostCurrent._date+"'");
RDebugUtils.currentLine=22937892;
 //BA.debugLineNum = 22937892;BA.debugLine="LblTedadVisit.Text =  CuTedad.RowCount";
parent.mostCurrent._lbltedadvisit.setText(BA.ObjectToCharSequence(_cutedad.getRowCount()));
RDebugUtils.currentLine=22937893;
 //BA.debugLineNum = 22937893;BA.debugLine="CuTedad = MCode.Result(\"Select * From TblAshk";
_cutedad = parent.mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblAshkhas Where fldCodeGroup like '"+parent.mostCurrent._groupcodeselect2+"%' and "+_str+" and FldLastSefaresh = '"+parent.mostCurrent._date+"'");
RDebugUtils.currentLine=22937894;
 //BA.debugLineNum = 22937894;BA.debugLine="LblTedadSefaresh.Text =  CuTedad.RowCount";
parent.mostCurrent._lbltedadsefaresh.setText(BA.ObjectToCharSequence(_cutedad.getRowCount()));
RDebugUtils.currentLine=22937898;
 //BA.debugLineNum = 22937898;BA.debugLine="str=\"Select * From TblAshkhas Where fldCodeGro";
_str = "Select * From TblAshkhas Where fldCodeGroup like '"+parent.mostCurrent._groupcodeselect2+"%' and "+_str+" "+parent.mostCurrent._str_sort;
 if (true) break;

case 206:
//C
this.state = 207;
RDebugUtils.currentLine=22937900;
 //BA.debugLineNum = 22937900;BA.debugLine="CuTedad = MCode.Result(\"Select * From TblAshk";
_cutedad = parent.mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblAshkhas Where fldCodeGroup like '"+parent.mostCurrent._groupcodeselect2+"%'"+" and FldLastVisit = '"+parent.mostCurrent._date+"'");
RDebugUtils.currentLine=22937901;
 //BA.debugLineNum = 22937901;BA.debugLine="LblTedadVisit.Text =  CuTedad.RowCount";
parent.mostCurrent._lbltedadvisit.setText(BA.ObjectToCharSequence(_cutedad.getRowCount()));
RDebugUtils.currentLine=22937902;
 //BA.debugLineNum = 22937902;BA.debugLine="CuTedad = MCode.Result(\"Select * From TblAshk";
_cutedad = parent.mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblAshkhas Where fldCodeGroup like '"+parent.mostCurrent._groupcodeselect2+"%'"+" and FldLastSefaresh = '"+parent.mostCurrent._date+"'");
RDebugUtils.currentLine=22937903;
 //BA.debugLineNum = 22937903;BA.debugLine="LblTedadSefaresh.Text =  CuTedad.RowCount";
parent.mostCurrent._lbltedadsefaresh.setText(BA.ObjectToCharSequence(_cutedad.getRowCount()));
RDebugUtils.currentLine=22937905;
 //BA.debugLineNum = 22937905;BA.debugLine="str=\"Select * From TblAshkhas Where fldCodeGr";
_str = "Select * From TblAshkhas Where fldCodeGroup like '"+parent.mostCurrent._groupcodeselect2+"%' "+parent.mostCurrent._str_sort;
 if (true) break;

case 207:
//C
this.state = 208;
;
 if (true) break;

case 208:
//C
this.state = 209;
;
RDebugUtils.currentLine=22937910;
 //BA.debugLineNum = 22937910;BA.debugLine="Log(str)";
anywheresoftware.b4a.keywords.Common.LogImpl("522937910",_str,0);
 if (true) break;

case 209:
//C
this.state = 212;
;
RDebugUtils.currentLine=22937912;
 //BA.debugLineNum = 22937912;BA.debugLine="Sleep(200)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_selectmantage", "loadashkhas"),(int) (200));
this.state = 214;
return;
case 214:
//C
this.state = 212;
;
RDebugUtils.currentLine=22937913;
 //BA.debugLineNum = 22937913;BA.debugLine="LoadListAshkhas(str)";
_loadlistashkhas(_str);
 if (true) break;

case 211:
//C
this.state = 212;
this.catchState = 0;
RDebugUtils.currentLine=22937915;
 //BA.debugLineNum = 22937915;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("522937915",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=22937916;
 //BA.debugLineNum = 22937916;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
parent.mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(parent.mostCurrent._activity.getTitle())+"-LoadAshkhas");
 if (true) break;
if (true) break;

case 212:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=22937918;
 //BA.debugLineNum = 22937918;BA.debugLine="End Sub";
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
public static boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
RDebugUtils.currentModule="act_selectmantage";
if (Debug.shouldDelegate(mostCurrent.activityBA, "application_error", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "application_error", new Object[] {_error,_stacktrace}));}
RDebugUtils.currentLine=25100288;
 //BA.debugLineNum = 25100288;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
RDebugUtils.currentLine=25100290;
 //BA.debugLineNum = 25100290;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=25100291;
 //BA.debugLineNum = 25100291;BA.debugLine="End Sub";
return false;
}
public static String  _btn_sort_click() throws Exception{
RDebugUtils.currentModule="act_selectmantage";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_sort_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_sort_click", null));}
anywheresoftware.b4a.objects.collections.List _lst = null;
int _res = 0;
RDebugUtils.currentLine=24444928;
 //BA.debugLineNum = 24444928;BA.debugLine="Sub btn_sort_Click";
RDebugUtils.currentLine=24444929;
 //BA.debugLineNum = 24444929;BA.debugLine="Try";
try {RDebugUtils.currentLine=24444930;
 //BA.debugLineNum = 24444930;BA.debugLine="Dim Lst As List = Array As String(\"کد شخص\",\"نام";
_lst = new anywheresoftware.b4a.objects.collections.List();
_lst = anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"کد شخص","نام شخص نزولی","نام شخص صعودی"});
RDebugUtils.currentLine=24444931;
 //BA.debugLineNum = 24444931;BA.debugLine="Dim res As Int = InputList(Lst,\"مرتب سازی براساس";
_res = anywheresoftware.b4a.keywords.Common.InputList(_lst,BA.ObjectToCharSequence("مرتب سازی براساس:"),(int) (-1),mostCurrent.activityBA);
RDebugUtils.currentLine=24444932;
 //BA.debugLineNum = 24444932;BA.debugLine="Select Case res";
switch (_res) {
case 0: {
RDebugUtils.currentLine=24444934;
 //BA.debugLineNum = 24444934;BA.debugLine="Str_sort = \" Order by fldCodetafzili Asc\"";
mostCurrent._str_sort = " Order by fldCodetafzili Asc";
 break; }
case 1: {
RDebugUtils.currentLine=24444936;
 //BA.debugLineNum = 24444936;BA.debugLine="Str_sort = \" Order by fldSharheTafzili\"";
mostCurrent._str_sort = " Order by fldSharheTafzili";
 break; }
case 2: {
RDebugUtils.currentLine=24444938;
 //BA.debugLineNum = 24444938;BA.debugLine="Str_sort = \" Order by fldSharheTafzili Desc\"";
mostCurrent._str_sort = " Order by fldSharheTafzili Desc";
 break; }
}
;
RDebugUtils.currentLine=24444941;
 //BA.debugLineNum = 24444941;BA.debugLine="Log(Str_sort)";
anywheresoftware.b4a.keywords.Common.LogImpl("524444941",mostCurrent._str_sort,0);
RDebugUtils.currentLine=24444942;
 //BA.debugLineNum = 24444942;BA.debugLine="LoadAshkhas";
_loadashkhas();
 } 
       catch (Exception e15) {
			processBA.setLastException(e15);RDebugUtils.currentLine=24444944;
 //BA.debugLineNum = 24444944;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("524444944",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=24444945;
 //BA.debugLineNum = 24444945;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-btn_sort_Click");
 };
RDebugUtils.currentLine=24444947;
 //BA.debugLineNum = 24444947;BA.debugLine="End Sub";
return "";
}
public static String  _btnlocationmoshtarian_click() throws Exception{
RDebugUtils.currentModule="act_selectmantage";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnlocationmoshtarian_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnlocationmoshtarian_click", null));}
RDebugUtils.currentLine=25493504;
 //BA.debugLineNum = 25493504;BA.debugLine="Private Sub btnLocationMoshtarian_Click";
RDebugUtils.currentLine=25493505;
 //BA.debugLineNum = 25493505;BA.debugLine="StartActivity(Act_LocationMoshtarian)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._act_locationmoshtarian.getObject()));
RDebugUtils.currentLine=25493506;
 //BA.debugLineNum = 25493506;BA.debugLine="Act_LocationMoshtarian.LstLocation=ListAshkhas";
mostCurrent._act_locationmoshtarian._lstlocation /*anywheresoftware.b4a.objects.collections.List*/  = mostCurrent._listashkhas;
RDebugUtils.currentLine=25493509;
 //BA.debugLineNum = 25493509;BA.debugLine="End Sub";
return "";
}
public static String  _btnmenugroup_click() throws Exception{
RDebugUtils.currentModule="act_selectmantage";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnmenugroup_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnmenugroup_click", null));}
RDebugUtils.currentLine=25231360;
 //BA.debugLineNum = 25231360;BA.debugLine="Private Sub btnMenuGroup_Click";
RDebugUtils.currentLine=25231361;
 //BA.debugLineNum = 25231361;BA.debugLine="sidemenu.ShowMenu";
mostCurrent._sidemenu.ShowMenu();
RDebugUtils.currentLine=25231362;
 //BA.debugLineNum = 25231362;BA.debugLine="End Sub";
return "";
}
public static String  _btnnewashkhas_click() throws Exception{
RDebugUtils.currentModule="act_selectmantage";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnnewashkhas_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnnewashkhas_click", null));}
RDebugUtils.currentLine=25165824;
 //BA.debugLineNum = 25165824;BA.debugLine="Private Sub btnNewAshkhas_Click";
RDebugUtils.currentLine=25165825;
 //BA.debugLineNum = 25165825;BA.debugLine="MCode.UpdateShakhs=False";
mostCurrent._mcode._updateshakhs /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=25165826;
 //BA.debugLineNum = 25165826;BA.debugLine="StartActivity(Act_NewAshkhas)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._act_newashkhas.getObject()));
RDebugUtils.currentLine=25165828;
 //BA.debugLineNum = 25165828;BA.debugLine="End Sub";
return "";
}
public static String  _btnupdate_click() throws Exception{
RDebugUtils.currentModule="act_selectmantage";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnupdate_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnupdate_click", null));}
RDebugUtils.currentLine=24969216;
 //BA.debugLineNum = 24969216;BA.debugLine="Sub btnUpdate_Click";
RDebugUtils.currentLine=24969219;
 //BA.debugLineNum = 24969219;BA.debugLine="End Sub";
return "";
}
public static String  _getlisttours() throws Exception{
RDebugUtils.currentModule="act_selectmantage";
if (Debug.shouldDelegate(mostCurrent.activityBA, "getlisttours", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "getlisttours", null));}
RDebugUtils.currentLine=25559040;
 //BA.debugLineNum = 25559040;BA.debugLine="Public Sub GetListTours";
RDebugUtils.currentLine=25559041;
 //BA.debugLineNum = 25559041;BA.debugLine="CallSubDelayed2(Act_LocationMoshtarian,\"LoadData\"";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(mostCurrent._act_locationmoshtarian.getObject()),"LoadData",(Object)(mostCurrent._listashkhas));
RDebugUtils.currentLine=25559042;
 //BA.debugLineNum = 25559042;BA.debugLine="End Sub";
return "";
}
public static String  _gps_locationchanged(anywheresoftware.b4a.gps.LocationWrapper _location1) throws Exception{
RDebugUtils.currentModule="act_selectmantage";
if (Debug.shouldDelegate(mostCurrent.activityBA, "gps_locationchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "gps_locationchanged", new Object[] {_location1}));}
RDebugUtils.currentLine=25034752;
 //BA.debugLineNum = 25034752;BA.debugLine="Sub Gps_LocationChanged (Location1 As Location)";
RDebugUtils.currentLine=25034754;
 //BA.debugLineNum = 25034754;BA.debugLine="End Sub";
return "";
}
public static int  _hlv_getitemcount() throws Exception{
RDebugUtils.currentModule="act_selectmantage";
if (Debug.shouldDelegate(mostCurrent.activityBA, "hlv_getitemcount", false))
	 {return ((Integer) Debug.delegate(mostCurrent.activityBA, "hlv_getitemcount", null));}
RDebugUtils.currentLine=23986176;
 //BA.debugLineNum = 23986176;BA.debugLine="Sub HLV_GetItemCount As Int 								        '💯 It";
RDebugUtils.currentLine=23986177;
 //BA.debugLineNum = 23986177;BA.debugLine="Return ListAshkhas.Size '/ItemList.Size";
if (true) return mostCurrent._listashkhas.getSize();
RDebugUtils.currentLine=23986178;
 //BA.debugLineNum = 23986178;BA.debugLine="End Sub";
return 0;
}
public static String  _hlv_onbindviewholder(anywheresoftware.b4a.objects.PanelWrapper _parent,int _position) throws Exception{
RDebugUtils.currentModule="act_selectmantage";
if (Debug.shouldDelegate(mostCurrent.activityBA, "hlv_onbindviewholder", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "hlv_onbindviewholder", new Object[] {_parent,_position}));}
ir.parsikhesab.pakhsh.mcode._adapterlistashkhas _item = null;
ir.parsikhesab.pakhsh.cls_recashkhas _rec = null;
RDebugUtils.currentLine=23920640;
 //BA.debugLineNum = 23920640;BA.debugLine="Sub HLV_onBindViewHolder (Parent As Panel, Positio";
RDebugUtils.currentLine=23920641;
 //BA.debugLineNum = 23920641;BA.debugLine="Dim item As AdapterListAshkhas=ListAshkhas.Get(Po";
_item = (ir.parsikhesab.pakhsh.mcode._adapterlistashkhas)(mostCurrent._listashkhas.Get(_position));
RDebugUtils.currentLine=23920642;
 //BA.debugLineNum = 23920642;BA.debugLine="Dim rec As cls_RecAshkhas=Parent.Tag";
_rec = (ir.parsikhesab.pakhsh.cls_recashkhas)(_parent.getTag());
RDebugUtils.currentLine=23920643;
 //BA.debugLineNum = 23920643;BA.debugLine="Parent.AddView(rec.Panel,0,0,100%x,rec.Height)";
_parent.AddView((android.view.View)(_rec._getpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ (null).getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),_rec._getheight /*int*/ (null));
RDebugUtils.currentLine=23920644;
 //BA.debugLineNum = 23920644;BA.debugLine="rec.show(item,Date)";
_rec._show /*String*/ (null,_item,mostCurrent._date);
RDebugUtils.currentLine=23920645;
 //BA.debugLineNum = 23920645;BA.debugLine="Parent.Height=rec.Height";
_parent.setHeight(_rec._getheight /*int*/ (null));
RDebugUtils.currentLine=23920646;
 //BA.debugLineNum = 23920646;BA.debugLine="End Sub";
return "";
}
public static String  _hlv_oncreateviewholder(anywheresoftware.b4a.objects.PanelWrapper _parent,int _viewtype) throws Exception{
RDebugUtils.currentModule="act_selectmantage";
if (Debug.shouldDelegate(mostCurrent.activityBA, "hlv_oncreateviewholder", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "hlv_oncreateviewholder", new Object[] {_parent,_viewtype}));}
ir.parsikhesab.pakhsh.cls_recashkhas _rec = null;
RDebugUtils.currentLine=23855104;
 //BA.debugLineNum = 23855104;BA.debugLine="Private Sub HLV_onCreateViewHolder (Parent As Pane";
RDebugUtils.currentLine=23855105;
 //BA.debugLineNum = 23855105;BA.debugLine="Dim rec As cls_RecAshkhas";
_rec = new ir.parsikhesab.pakhsh.cls_recashkhas();
RDebugUtils.currentLine=23855106;
 //BA.debugLineNum = 23855106;BA.debugLine="rec.Initialize";
_rec._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=23855107;
 //BA.debugLineNum = 23855107;BA.debugLine="Parent.Tag=rec";
_parent.setTag((Object)(_rec));
RDebugUtils.currentLine=23855108;
 //BA.debugLineNum = 23855108;BA.debugLine="End Sub";
return "";
}
public static int  _hlvgoroohashkhas_getitemcount() throws Exception{
RDebugUtils.currentModule="act_selectmantage";
if (Debug.shouldDelegate(mostCurrent.activityBA, "hlvgoroohashkhas_getitemcount", false))
	 {return ((Integer) Debug.delegate(mostCurrent.activityBA, "hlvgoroohashkhas_getitemcount", null));}
RDebugUtils.currentLine=23461888;
 //BA.debugLineNum = 23461888;BA.debugLine="Sub HLVGoroohAshkhas_GetItemCount As Int";
RDebugUtils.currentLine=23461889;
 //BA.debugLineNum = 23461889;BA.debugLine="Return ListGoroohAshkhas2.Size";
if (true) return mostCurrent._listgoroohashkhas2.getSize();
RDebugUtils.currentLine=23461890;
 //BA.debugLineNum = 23461890;BA.debugLine="End Sub";
return 0;
}
public static String  _hlvgoroohashkhas_itemclick(anywheresoftware.b4a.objects.PanelWrapper _clickeditem,int _position) throws Exception{
RDebugUtils.currentModule="act_selectmantage";
if (Debug.shouldDelegate(mostCurrent.activityBA, "hlvgoroohashkhas_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "hlvgoroohashkhas_itemclick", new Object[] {_clickeditem,_position}));}
RDebugUtils.currentLine=23396352;
 //BA.debugLineNum = 23396352;BA.debugLine="Sub HLVGoroohAshkhas_ItemClick (ClickedItem As Pan";
RDebugUtils.currentLine=23396353;
 //BA.debugLineNum = 23396353;BA.debugLine="LoadGoroohAshkhasGo(Position)";
_loadgoroohashkhasgo(_position);
RDebugUtils.currentLine=23396354;
 //BA.debugLineNum = 23396354;BA.debugLine="sidemenu.HideMenus";
mostCurrent._sidemenu.HideMenus();
RDebugUtils.currentLine=23396355;
 //BA.debugLineNum = 23396355;BA.debugLine="End Sub";
return "";
}
public static void  _loadgoroohashkhasgo(int _position) throws Exception{
RDebugUtils.currentModule="act_selectmantage";
if (Debug.shouldDelegate(mostCurrent.activityBA, "loadgoroohashkhasgo", false))
	 {Debug.delegate(mostCurrent.activityBA, "loadgoroohashkhasgo", new Object[] {_position}); return;}
ResumableSub_LoadGoroohAshkhasGo rsub = new ResumableSub_LoadGoroohAshkhasGo(null,_position);
rsub.resume(processBA, null);
}
public static class ResumableSub_LoadGoroohAshkhasGo extends BA.ResumableSub {
public ResumableSub_LoadGoroohAshkhasGo(ir.parsikhesab.pakhsh.act_selectmantage parent,int _position) {
this.parent = parent;
this._position = _position;
}
ir.parsikhesab.pakhsh.act_selectmantage parent;
int _position;
ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas _item = null;
int _count = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _dt = null;
int _i = 0;
int step10;
int limit10;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_selectmantage";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=23592961;
 //BA.debugLineNum = 23592961;BA.debugLine="Sleep(100)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_selectmantage", "loadgoroohashkhasgo"),(int) (100));
this.state = 9;
return;
case 9:
//C
this.state = 1;
;
RDebugUtils.currentLine=23592962;
 //BA.debugLineNum = 23592962;BA.debugLine="Dim Item = ListGoroohAshkhas2.Get(Position) As Ad";
_item = (ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas)(parent.mostCurrent._listgoroohashkhas2.Get(_position));
RDebugUtils.currentLine=23592963;
 //BA.debugLineNum = 23592963;BA.debugLine="GroupCodeSelect1=Item.FldC_Gorooh";
parent.mostCurrent._groupcodeselect1 = _item.FldC_Gorooh /*String*/ ;
RDebugUtils.currentLine=23592965;
 //BA.debugLineNum = 23592965;BA.debugLine="Dim Count As Int = Item.FldC_Gorooh.Length + 3";
_count = (int) (_item.FldC_Gorooh /*String*/ .length()+3);
RDebugUtils.currentLine=23592966;
 //BA.debugLineNum = 23592966;BA.debugLine="Dim Dt As Cursor=MCode.Result(\"Select FldC_Gorooh";
_dt = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_dt = parent.mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas where FldC_Gorooh Like '"+_item.FldC_Gorooh /*String*/ +"%' And Length(FldC_Gorooh) = "+BA.NumberToString(_count)+" ORDER BY FldC_Gorooh");
RDebugUtils.currentLine=23592967;
 //BA.debugLineNum = 23592967;BA.debugLine="If Dt.RowCount>0 Then";
if (true) break;

case 1:
//if
this.state = 8;
if (_dt.getRowCount()>0) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=23592968;
 //BA.debugLineNum = 23592968;BA.debugLine="lblBackGroup.Visible=True";
parent.mostCurrent._lblbackgroup.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=23592969;
 //BA.debugLineNum = 23592969;BA.debugLine="ListGoroohAshkhas2.Clear";
parent.mostCurrent._listgoroohashkhas2.Clear();
RDebugUtils.currentLine=23592970;
 //BA.debugLineNum = 23592970;BA.debugLine="OriginalListGoroohAshkhas2.Clear";
parent.mostCurrent._originallistgoroohashkhas2.Clear();
RDebugUtils.currentLine=23592972;
 //BA.debugLineNum = 23592972;BA.debugLine="For i=0 To Dt.RowCount-1";
if (true) break;

case 4:
//for
this.state = 7;
step10 = 1;
limit10 = (int) (_dt.getRowCount()-1);
_i = (int) (0) ;
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
if (true) break;

case 6:
//C
this.state = 11;
RDebugUtils.currentLine=23592973;
 //BA.debugLineNum = 23592973;BA.debugLine="Dt.Position=i";
_dt.setPosition(_i);
RDebugUtils.currentLine=23592974;
 //BA.debugLineNum = 23592974;BA.debugLine="Dim Item As AdapterGoroohAshkhas";
_item = new ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas();
RDebugUtils.currentLine=23592975;
 //BA.debugLineNum = 23592975;BA.debugLine="Item.FldC_Gorooh= Dt.GetString(\"FldC_Gorooh\")";
_item.FldC_Gorooh /*String*/  = _dt.GetString("FldC_Gorooh");
RDebugUtils.currentLine=23592976;
 //BA.debugLineNum = 23592976;BA.debugLine="Item.FldN_Gorooh= Dt.GetString(\"FldN_Gorooh\")";
_item.FldN_Gorooh /*String*/  = _dt.GetString("FldN_Gorooh");
RDebugUtils.currentLine=23592977;
 //BA.debugLineNum = 23592977;BA.debugLine="OriginalListGoroohAshkhas2.Add(Item)";
parent.mostCurrent._originallistgoroohashkhas2.Add((Object)(_item));
RDebugUtils.currentLine=23592978;
 //BA.debugLineNum = 23592978;BA.debugLine="MCode.C_LayeAshkhas=Item.FldC_Gorooh";
parent.mostCurrent._mcode._c_layeashkhas /*String*/  = _item.FldC_Gorooh /*String*/ ;
 if (true) break;
if (true) break;

case 7:
//C
this.state = 8;
;
RDebugUtils.currentLine=23592980;
 //BA.debugLineNum = 23592980;BA.debugLine="ListGoroohAshkhas2 = OriginalListGoroohAshkhas2";
parent.mostCurrent._listgoroohashkhas2 = parent.mostCurrent._originallistgoroohashkhas2;
RDebugUtils.currentLine=23592981;
 //BA.debugLineNum = 23592981;BA.debugLine="HLVGoroohAshkhas.notifyDataSetChanged";
parent.mostCurrent._hlvgoroohashkhas.notifyDataSetChanged();
 if (true) break;

case 8:
//C
this.state = -1;
;
RDebugUtils.currentLine=23592983;
 //BA.debugLineNum = 23592983;BA.debugLine="LoadAshkhas";
_loadashkhas();
RDebugUtils.currentLine=23592984;
 //BA.debugLineNum = 23592984;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _hlvgoroohashkhas_onbindviewholder(anywheresoftware.b4a.objects.PanelWrapper _parent,int _position) throws Exception{
RDebugUtils.currentModule="act_selectmantage";
if (Debug.shouldDelegate(mostCurrent.activityBA, "hlvgoroohashkhas_onbindviewholder", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "hlvgoroohashkhas_onbindviewholder", new Object[] {_parent,_position}));}
ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas _item = null;
anywheresoftware.b4a.objects.LabelWrapper _lblsharh = null;
RDebugUtils.currentLine=23527424;
 //BA.debugLineNum = 23527424;BA.debugLine="Sub HLVGoroohAshkhas_onBindViewHolder (Parent As P";
RDebugUtils.currentLine=23527425;
 //BA.debugLineNum = 23527425;BA.debugLine="Dim Item = ListGoroohAshkhas2.Get(Position) As Ad";
_item = (ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas)(mostCurrent._listgoroohashkhas2.Get(_position));
RDebugUtils.currentLine=23527426;
 //BA.debugLineNum = 23527426;BA.debugLine="Dim LblSharh As Label  = Parent.getview(0)";
_lblsharh = new anywheresoftware.b4a.objects.LabelWrapper();
_lblsharh = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_parent.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=23527427;
 //BA.debugLineNum = 23527427;BA.debugLine="LblSharh.Text = Item.FldN_Gorooh";
_lblsharh.setText(BA.ObjectToCharSequence(_item.FldN_Gorooh /*String*/ ));
RDebugUtils.currentLine=23527428;
 //BA.debugLineNum = 23527428;BA.debugLine="Parent.Elevation=1dip";
_parent.setElevation((float) (anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (1))));
RDebugUtils.currentLine=23527429;
 //BA.debugLineNum = 23527429;BA.debugLine="Parent.Height = 9%y";
_parent.setHeight(anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (9),mostCurrent.activityBA));
RDebugUtils.currentLine=23527430;
 //BA.debugLineNum = 23527430;BA.debugLine="End Sub";
return "";
}
public static String  _hlvgoroohashkhas_oncreateviewholder(anywheresoftware.b4a.objects.PanelWrapper _parent,int _viewtype) throws Exception{
RDebugUtils.currentModule="act_selectmantage";
if (Debug.shouldDelegate(mostCurrent.activityBA, "hlvgoroohashkhas_oncreateviewholder", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "hlvgoroohashkhas_oncreateviewholder", new Object[] {_parent,_viewtype}));}
anywheresoftware.b4a.objects.LabelWrapper _lblsharh = null;
anywheresoftware.b4a.objects.drawable.BitmapDrawable _bmp1 = null;
RDebugUtils.currentLine=23330816;
 //BA.debugLineNum = 23330816;BA.debugLine="Sub HLVGoroohAshkhas_onCreateViewHolder (Parent As";
RDebugUtils.currentLine=23330817;
 //BA.debugLineNum = 23330817;BA.debugLine="Dim LblSharh As Label";
_lblsharh = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=23330818;
 //BA.debugLineNum = 23330818;BA.debugLine="Dim bmp1 As BitmapDrawable";
_bmp1 = new anywheresoftware.b4a.objects.drawable.BitmapDrawable();
RDebugUtils.currentLine=23330819;
 //BA.debugLineNum = 23330819;BA.debugLine="LblSharh.Initialize(\"LblSharh\")";
_lblsharh.Initialize(mostCurrent.activityBA,"LblSharh");
RDebugUtils.currentLine=23330820;
 //BA.debugLineNum = 23330820;BA.debugLine="LblSharh.TextColor=Colors.black";
_lblsharh.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=23330821;
 //BA.debugLineNum = 23330821;BA.debugLine="LblSharh.TextSize=20";
_lblsharh.setTextSize((float) (20));
RDebugUtils.currentLine=23330822;
 //BA.debugLineNum = 23330822;BA.debugLine="LblSharh.Gravity=Gravity.CENTER";
_lblsharh.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER);
RDebugUtils.currentLine=23330823;
 //BA.debugLineNum = 23330823;BA.debugLine="LblSharh.SingleLine=False";
_lblsharh.setSingleLine(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=23330824;
 //BA.debugLineNum = 23330824;BA.debugLine="bmp1.Initialize(LoadBitmap(File.DirAssets,\"button";
_bmp1.Initialize((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"button5.png").getObject()));
RDebugUtils.currentLine=23330825;
 //BA.debugLineNum = 23330825;BA.debugLine="LblSharh.Background=bmp1";
_lblsharh.setBackground((android.graphics.drawable.Drawable)(_bmp1.getObject()));
RDebugUtils.currentLine=23330826;
 //BA.debugLineNum = 23330826;BA.debugLine="LblSharh.Typeface= MCode.Font2";
_lblsharh.setTypeface((android.graphics.Typeface)(mostCurrent._mcode._font2 /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()));
RDebugUtils.currentLine=23330827;
 //BA.debugLineNum = 23330827;BA.debugLine="Parent.AddView(LblSharh,2%x,1%y,61%x,7%y)";
_parent.AddView((android.view.View)(_lblsharh.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (1),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (61),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (7),mostCurrent.activityBA));
RDebugUtils.currentLine=23330828;
 //BA.debugLineNum = 23330828;BA.debugLine="End Sub";
return "";
}
public static String  _lblbackgroup_click() throws Exception{
RDebugUtils.currentModule="act_selectmantage";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lblbackgroup_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lblbackgroup_click", null));}
RDebugUtils.currentLine=25296896;
 //BA.debugLineNum = 25296896;BA.debugLine="Private Sub lblBackGroup_Click";
RDebugUtils.currentLine=25296897;
 //BA.debugLineNum = 25296897;BA.debugLine="If MCode.C_LayeAshkhas.Length > 3 Then";
if (mostCurrent._mcode._c_layeashkhas /*String*/ .length()>3) { 
RDebugUtils.currentLine=25296899;
 //BA.debugLineNum = 25296899;BA.debugLine="If MCode.C_LayeAshkhas.Length=6 Then";
if (mostCurrent._mcode._c_layeashkhas /*String*/ .length()==6) { 
RDebugUtils.currentLine=25296900;
 //BA.debugLineNum = 25296900;BA.debugLine="lblBackGroup.Visible=False";
mostCurrent._lblbackgroup.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=25296902;
 //BA.debugLineNum = 25296902;BA.debugLine="LoadGoroohAshkasBack(MCode.C_LayeAshkhas)";
_loadgoroohashkasback(mostCurrent._mcode._c_layeashkhas /*String*/ );
 }else {
RDebugUtils.currentLine=25296904;
 //BA.debugLineNum = 25296904;BA.debugLine="lblBackGroup.Visible=False";
mostCurrent._lblbackgroup.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=25296906;
 //BA.debugLineNum = 25296906;BA.debugLine="End Sub";
return "";
}
public static String  _updatevaziatashkhas() throws Exception{
RDebugUtils.currentModule="act_selectmantage";
if (Debug.shouldDelegate(mostCurrent.activityBA, "updatevaziatashkhas", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "updatevaziatashkhas", null));}
String _str = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
int _i = 0;
int _count = 0;
int _maxradif = 0;
String _str2 = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu2 = null;
String _d = "";
String _datev = "";
String _s = "";
String _dates = "";
RDebugUtils.currentLine=22872064;
 //BA.debugLineNum = 22872064;BA.debugLine="Sub UpdateVaziatAshkhas";
RDebugUtils.currentLine=22872065;
 //BA.debugLineNum = 22872065;BA.debugLine="Try";
try {RDebugUtils.currentLine=22872066;
 //BA.debugLineNum = 22872066;BA.debugLine="Dim str As String =$\"SELECT DISTINCT fldCodeTafz";
_str = ("SELECT DISTINCT fldCodeTafzili from tblTourVisitor WHERE fldDateVisit = "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._mcode._datepersian /*String*/ (mostCurrent.activityBA)))+" AND fldTimeVisit<>''");
RDebugUtils.currentLine=22872068;
 //BA.debugLineNum = 22872068;BA.debugLine="Dim cu As Cursor=MCode.Result(str)";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,_str);
RDebugUtils.currentLine=22872069;
 //BA.debugLineNum = 22872069;BA.debugLine="If cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=22872070;
 //BA.debugLineNum = 22872070;BA.debugLine="For i=0 To cu.RowCount-1";
{
final int step5 = 1;
final int limit5 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=22872071;
 //BA.debugLineNum = 22872071;BA.debugLine="cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=22872074;
 //BA.debugLineNum = 22872074;BA.debugLine="Dim Count As Int = MCode.SingleResult($\"Select";
_count = (int)(BA.ObjectToNumber(mostCurrent._mcode._singleresult /*Object*/ (mostCurrent.activityBA,("Select Count(fldRadif) from tblTourVisitor where  fldDateVisit='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._mcode._datepersian /*String*/ (mostCurrent.activityBA)))+"' and fldCodeTafzili="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_cu.GetString("fldCodeTafzili")))+" and tblTourVisitor.fldTimeVisit<>''"))));
RDebugUtils.currentLine=22872075;
 //BA.debugLineNum = 22872075;BA.debugLine="Dim MaxRadif As Int";
_maxradif = 0;
RDebugUtils.currentLine=22872076;
 //BA.debugLineNum = 22872076;BA.debugLine="If Count>0 Then";
if (_count>0) { 
RDebugUtils.currentLine=22872077;
 //BA.debugLineNum = 22872077;BA.debugLine="MaxRadif= MCode.SingleResult($\"Select Max(fld";
_maxradif = (int)(BA.ObjectToNumber(mostCurrent._mcode._singleresult /*Object*/ (mostCurrent.activityBA,("Select Max(fldRadif) from tblTourVisitor where  fldDateVisit='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._mcode._datepersian /*String*/ (mostCurrent.activityBA)))+"' and fldCodeTafzili="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_cu.GetString("fldCodeTafzili")))+" and tblTourVisitor.fldTimeVisit<>''"))));
RDebugUtils.currentLine=22872079;
 //BA.debugLineNum = 22872079;BA.debugLine="Dim str2 As String =$\"SELECT TblAshkhas.*, tb";
_str2 = ("SELECT TblAshkhas.*, tblTourVisitor.fldRadif, tblTourVisitor.fldDateVisit,tblTourVisitor.fldTimeVisit, tblTourVisitor.fldVaziat as fldVaziatTour,tblTourVisitor.fldTimeSefaresh FROM TblAshkhas,tblTourVisitor WHERE TblAshkhas.fldCodetafzili = tblTourVisitor.fldCodeTafzili AND tblTourVisitor.fldDateVisit = "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._mcode._datepersian /*String*/ (mostCurrent.activityBA)))+" AND tblTourVisitor.fldTimeVisit<>'' and tblTourVisitor.fldCodeTafzili="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_cu.GetString("fldCodeTafzili")))+" And fldRadif="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_maxradif))+" ORDER BY fldRadif ASC");
RDebugUtils.currentLine=22872080;
 //BA.debugLineNum = 22872080;BA.debugLine="Dim cu2 As Cursor=MCode.Result(str2)";
_cu2 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu2 = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,_str2);
RDebugUtils.currentLine=22872081;
 //BA.debugLineNum = 22872081;BA.debugLine="cu2.Position=0";
_cu2.setPosition((int) (0));
RDebugUtils.currentLine=22872083;
 //BA.debugLineNum = 22872083;BA.debugLine="If cu2.GetString(\"fldTimeVisit\")<>\"\" And cu2.";
if ((_cu2.GetString("fldTimeVisit")).equals("") == false && _cu2.GetString("fldTimeVisit")!= null) { 
RDebugUtils.currentLine=22872084;
 //BA.debugLineNum = 22872084;BA.debugLine="Dim D As String = cu2.GetString(\"fldDateVisi";
_d = _cu2.GetString("fldDateVisit")+"T"+_cu2.GetString("fldTimeVisit");
RDebugUtils.currentLine=22872085;
 //BA.debugLineNum = 22872085;BA.debugLine="Dim DateV As String=cu2.GetString(\"fldDateVi";
_datev = _cu2.GetString("fldDateVisit");
RDebugUtils.currentLine=22872087;
 //BA.debugLineNum = 22872087;BA.debugLine="MCode.SaveUpdate(\"Update TblAshkhas Set last";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Update TblAshkhas Set lastSeen = '"+_d+"',FldLastVisit='"+_datev+"' Where fldCodetafzili = '"+_cu.GetString("fldCodeTafzili")+"'");
 };
 };
RDebugUtils.currentLine=22872093;
 //BA.debugLineNum = 22872093;BA.debugLine="Dim Count As Int = MCode.SingleResult($\"Select";
_count = (int)(BA.ObjectToNumber(mostCurrent._mcode._singleresult /*Object*/ (mostCurrent.activityBA,("Select Count(fldRadif) from tblTourVisitor where  fldDateVisit='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._mcode._datepersian /*String*/ (mostCurrent.activityBA)))+"' and fldCodeTafzili="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_cu.GetString("fldCodeTafzili")))+" and tblTourVisitor.fldTimeSefaresh<>''"))));
RDebugUtils.currentLine=22872094;
 //BA.debugLineNum = 22872094;BA.debugLine="Dim MaxRadif As Int";
_maxradif = 0;
RDebugUtils.currentLine=22872095;
 //BA.debugLineNum = 22872095;BA.debugLine="If Count>0 Then";
if (_count>0) { 
RDebugUtils.currentLine=22872096;
 //BA.debugLineNum = 22872096;BA.debugLine="MaxRadif= MCode.SingleResult($\"Select Max(fld";
_maxradif = (int)(BA.ObjectToNumber(mostCurrent._mcode._singleresult /*Object*/ (mostCurrent.activityBA,("Select Max(fldRadif) from tblTourVisitor where  fldDateVisit='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._mcode._datepersian /*String*/ (mostCurrent.activityBA)))+"' and fldCodeTafzili="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_cu.GetString("fldCodeTafzili")))+" and tblTourVisitor.fldTimeSefaresh<>''"))));
RDebugUtils.currentLine=22872098;
 //BA.debugLineNum = 22872098;BA.debugLine="Dim str2 As String =$\"SELECT TblAshkhas.*, tb";
_str2 = ("SELECT TblAshkhas.*, tblTourVisitor.fldRadif, tblTourVisitor.fldDateVisit,tblTourVisitor.fldTimeVisit, tblTourVisitor.fldVaziat as fldVaziatTour,tblTourVisitor.fldTimeSefaresh FROM TblAshkhas,tblTourVisitor WHERE TblAshkhas.fldCodetafzili = tblTourVisitor.fldCodeTafzili AND tblTourVisitor.fldDateVisit = "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._mcode._datepersian /*String*/ (mostCurrent.activityBA)))+" AND tblTourVisitor.fldTimeSefaresh<>'' and tblTourVisitor.fldCodeTafzili="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_cu.GetString("fldCodeTafzili")))+" And fldRadif="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_maxradif))+" ORDER BY fldRadif ASC");
RDebugUtils.currentLine=22872099;
 //BA.debugLineNum = 22872099;BA.debugLine="Dim cu2 As Cursor=MCode.Result(str2)";
_cu2 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu2 = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,_str2);
RDebugUtils.currentLine=22872100;
 //BA.debugLineNum = 22872100;BA.debugLine="cu2.Position=0";
_cu2.setPosition((int) (0));
RDebugUtils.currentLine=22872101;
 //BA.debugLineNum = 22872101;BA.debugLine="If cu2.GetString(\"fldTimeSefaresh\")<>\"\" And c";
if ((_cu2.GetString("fldTimeSefaresh")).equals("") == false && _cu2.GetString("fldTimeSefaresh")!= null) { 
RDebugUtils.currentLine=22872102;
 //BA.debugLineNum = 22872102;BA.debugLine="Dim s As String = cu2.GetString(\"fldDateVisi";
_s = _cu2.GetString("fldDateVisit")+"T"+_cu2.GetString("fldTimeSefaresh");
RDebugUtils.currentLine=22872103;
 //BA.debugLineNum = 22872103;BA.debugLine="Dim DateS As String=cu2.GetString(\"fldDateVi";
_dates = _cu2.GetString("fldDateVisit");
RDebugUtils.currentLine=22872105;
 //BA.debugLineNum = 22872105;BA.debugLine="MCode.SaveUpdate(\"Update TblAshkhas Set last";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Update TblAshkhas Set lastOrderDate = '"+_s+"' ,FldLastSefaresh='"+_dates+"' Where fldCodetafzili = '"+_cu.GetString("fldCodeTafzili")+"'");
 };
 };
 }
};
 };
 } 
       catch (Exception e36) {
			processBA.setLastException(e36);RDebugUtils.currentLine=22872112;
 //BA.debugLineNum = 22872112;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("522872112",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=22872113;
 //BA.debugLineNum = 22872113;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-UpdateVaziatAshkhas");
 };
RDebugUtils.currentLine=22872115;
 //BA.debugLineNum = 22872115;BA.debugLine="End Sub";
return "";
}
public static String  _loadlistashkhas(String _query) throws Exception{
RDebugUtils.currentModule="act_selectmantage";
if (Debug.shouldDelegate(mostCurrent.activityBA, "loadlistashkhas", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "loadlistashkhas", new Object[] {_query}));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
int _i = 0;
ir.parsikhesab.pakhsh.mcode._adapterlistashkhas _itemashkhas = null;
RDebugUtils.currentLine=24313856;
 //BA.debugLineNum = 24313856;BA.debugLine="Sub LoadListAshkhas(Query As String)";
RDebugUtils.currentLine=24313857;
 //BA.debugLineNum = 24313857;BA.debugLine="Try";
try {RDebugUtils.currentLine=24313858;
 //BA.debugLineNum = 24313858;BA.debugLine="Dim Cu As Cursor = MCode.Result(Query)";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,_query);
RDebugUtils.currentLine=24313859;
 //BA.debugLineNum = 24313859;BA.debugLine="OrginalListAshkhas.Clear";
mostCurrent._orginallistashkhas.Clear();
RDebugUtils.currentLine=24313860;
 //BA.debugLineNum = 24313860;BA.debugLine="If Cu.RowCount > 0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=24313861;
 //BA.debugLineNum = 24313861;BA.debugLine="For i = 0 To Cu.RowCount - 1";
{
final int step5 = 1;
final int limit5 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=24313862;
 //BA.debugLineNum = 24313862;BA.debugLine="Dim ItemAshkhas As AdapterListAshkhas";
_itemashkhas = new ir.parsikhesab.pakhsh.mcode._adapterlistashkhas();
RDebugUtils.currentLine=24313863;
 //BA.debugLineNum = 24313863;BA.debugLine="Cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=24313864;
 //BA.debugLineNum = 24313864;BA.debugLine="ItemAshkhas.CodeTafzili=Cu.Getstring(\"fldCodeta";
_itemashkhas.CodeTafzili /*String*/  = _cu.GetString("fldCodetafzili");
RDebugUtils.currentLine=24313865;
 //BA.debugLineNum = 24313865;BA.debugLine="ItemAshkhas.SharhTafzili=Cu.Getstring(\"fldSharh";
_itemashkhas.SharhTafzili /*String*/  = _cu.GetString("fldSharheTafzili");
RDebugUtils.currentLine=24313866;
 //BA.debugLineNum = 24313866;BA.debugLine="ItemAshkhas.Address=Cu.Getstring(\"fldAdress\")";
_itemashkhas.Address /*String*/  = _cu.GetString("fldAdress");
RDebugUtils.currentLine=24313867;
 //BA.debugLineNum = 24313867;BA.debugLine="ItemAshkhas.Tell=Cu.Getstring(\"fldTell\")";
_itemashkhas.Tell /*String*/  = _cu.GetString("fldTell");
RDebugUtils.currentLine=24313868;
 //BA.debugLineNum = 24313868;BA.debugLine="ItemAshkhas.FldMobile=myCode.Is_Null(Cu.GetStri";
_itemashkhas.FldMobile /*String*/  = mostCurrent._mycode._is_null /*String*/ (mostCurrent.activityBA,_cu.GetString("FldMobile"));
RDebugUtils.currentLine=24313869;
 //BA.debugLineNum = 24313869;BA.debugLine="ItemAshkhas.FldVaziat=myCode.Is_Null(Cu.GetStri";
_itemashkhas.FldVaziat /*String*/  = mostCurrent._mycode._is_null /*String*/ (mostCurrent.activityBA,_cu.GetString("FldVaziat"));
RDebugUtils.currentLine=24313870;
 //BA.debugLineNum = 24313870;BA.debugLine="ItemAshkhas.FldEtebar=myCode.Is_Null(Cu.GetStri";
_itemashkhas.FldEtebar /*String*/  = mostCurrent._mycode._is_null /*String*/ (mostCurrent.activityBA,_cu.GetString("FldEtebar"));
RDebugUtils.currentLine=24313871;
 //BA.debugLineNum = 24313871;BA.debugLine="ItemAshkhas.lastSeen=Cu.GetString(\"lastSeen\")";
_itemashkhas.lastSeen /*String*/  = _cu.GetString("lastSeen");
RDebugUtils.currentLine=24313872;
 //BA.debugLineNum = 24313872;BA.debugLine="ItemAshkhas.lastOrderDate=myCode.Is_Null(Cu.Get";
_itemashkhas.lastOrderDate /*String*/  = mostCurrent._mycode._is_null /*String*/ (mostCurrent.activityBA,_cu.GetString("lastOrderDate"));
RDebugUtils.currentLine=24313873;
 //BA.debugLineNum = 24313873;BA.debugLine="ItemAshkhas.Mande=Cu.Getstring(\"fldMande\")";
_itemashkhas.Mande /*String*/  = _cu.GetString("fldMande");
RDebugUtils.currentLine=24313874;
 //BA.debugLineNum = 24313874;BA.debugLine="ItemAshkhas.FldLastVisit=myCode.Is_Null(Cu.GetS";
_itemashkhas.FldLastVisit /*String*/  = mostCurrent._mycode._is_null /*String*/ (mostCurrent.activityBA,_cu.GetString("FldLastVisit"));
RDebugUtils.currentLine=24313875;
 //BA.debugLineNum = 24313875;BA.debugLine="ItemAshkhas.FldLastSefaresh=myCode.Is_Null(Cu.G";
_itemashkhas.FldLastSefaresh /*String*/  = mostCurrent._mycode._is_null /*String*/ (mostCurrent.activityBA,_cu.GetString("FldLastSefaresh"));
RDebugUtils.currentLine=24313876;
 //BA.debugLineNum = 24313876;BA.debugLine="ItemAshkhas.FldC_Gorooh=Cu.GetString(\"fldCodeGr";
_itemashkhas.FldC_Gorooh /*String*/  = _cu.GetString("fldCodeGroup");
RDebugUtils.currentLine=24313877;
 //BA.debugLineNum = 24313877;BA.debugLine="ItemAshkhas.FldN_Gorooh=Cu.GetString(\"fldNameGr";
_itemashkhas.FldN_Gorooh /*String*/  = _cu.GetString("fldNameGroup");
RDebugUtils.currentLine=24313878;
 //BA.debugLineNum = 24313878;BA.debugLine="ItemAshkhas.FldC_Posti=myCode.Is_Null(Cu.GetStr";
_itemashkhas.FldC_Posti /*String*/  = mostCurrent._mycode._is_null /*String*/ (mostCurrent.activityBA,_cu.GetString("FldC_Posti"));
RDebugUtils.currentLine=24313879;
 //BA.debugLineNum = 24313879;BA.debugLine="ItemAshkhas.FldC_Meli=myCode.Is_Null(Cu.GetStri";
_itemashkhas.FldC_Meli /*String*/  = mostCurrent._mycode._is_null /*String*/ (mostCurrent.activityBA,_cu.GetString("FldC_Meli"));
RDebugUtils.currentLine=24313880;
 //BA.debugLineNum = 24313880;BA.debugLine="ItemAshkhas.FldShomarehesab=myCode.Is_Null(Cu.G";
_itemashkhas.FldShomarehesab /*String*/  = mostCurrent._mycode._is_null /*String*/ (mostCurrent.activityBA,_cu.GetString("FldShomarehesab"));
RDebugUtils.currentLine=24313881;
 //BA.debugLineNum = 24313881;BA.debugLine="ItemAshkhas.fldBlackList=myCode.Is_Null_adad(Cu";
_itemashkhas.fldBlackList /*String*/  = mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_cu.GetString("fldBlackList"));
RDebugUtils.currentLine=24313882;
 //BA.debugLineNum = 24313882;BA.debugLine="ItemAshkhas.fldSaghfeEtebar=myCode.Is_Null_adad";
_itemashkhas.fldSaghfeEtebar /*String*/  = mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_cu.GetString("fldSaghfeEtebar"));
RDebugUtils.currentLine=24313883;
 //BA.debugLineNum = 24313883;BA.debugLine="ItemAshkhas.Lat=myCode.Is_Null_adad(Cu.GetStrin";
_itemashkhas.Lat /*String*/  = mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_cu.GetString("FldLat"));
RDebugUtils.currentLine=24313884;
 //BA.debugLineNum = 24313884;BA.debugLine="ItemAshkhas.Lon=myCode.Is_Null_adad(Cu.GetStrin";
_itemashkhas.Lon /*String*/  = mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_cu.GetString("FldLon"));
RDebugUtils.currentLine=24313885;
 //BA.debugLineNum = 24313885;BA.debugLine="ItemAshkhas.FldSync=myCode.Is_Null(Cu.GetString";
_itemashkhas.FldSync /*String*/  = mostCurrent._mycode._is_null /*String*/ (mostCurrent.activityBA,_cu.GetString("FldSync"));
RDebugUtils.currentLine=24313886;
 //BA.debugLineNum = 24313886;BA.debugLine="If SwTourToday.Checked Then";
if (mostCurrent._swtourtoday.getChecked()) { 
RDebugUtils.currentLine=24313887;
 //BA.debugLineNum = 24313887;BA.debugLine="ItemAshkhas.fldRadif=myCode.Is_Null(Cu.GetStri";
_itemashkhas.fldRadif /*int*/  = (int)(Double.parseDouble(mostCurrent._mycode._is_null /*String*/ (mostCurrent.activityBA,_cu.GetString("fldRadif"))));
RDebugUtils.currentLine=24313888;
 //BA.debugLineNum = 24313888;BA.debugLine="ItemAshkhas.fldDateVisit=myCode.Is_Null(Cu.Get";
_itemashkhas.fldDateVisit /*String*/  = mostCurrent._mycode._is_null /*String*/ (mostCurrent.activityBA,_cu.GetString("fldDateVisit"));
RDebugUtils.currentLine=24313889;
 //BA.debugLineNum = 24313889;BA.debugLine="ItemAshkhas.fldVaziatTour=myCode.Is_Null(Cu.Ge";
_itemashkhas.fldVaziatTour /*String*/  = mostCurrent._mycode._is_null /*String*/ (mostCurrent.activityBA,_cu.GetString("fldVaziatTour"));
 };
RDebugUtils.currentLine=24313896;
 //BA.debugLineNum = 24313896;BA.debugLine="lblTedadKol.Text =  Cu.RowCount";
mostCurrent._lbltedadkol.setText(BA.ObjectToCharSequence(_cu.getRowCount()));
RDebugUtils.currentLine=24313905;
 //BA.debugLineNum = 24313905;BA.debugLine="OrginalListAshkhas.Add(ItemAshkhas)";
mostCurrent._orginallistashkhas.Add((Object)(_itemashkhas));
 }
};
 };
RDebugUtils.currentLine=24313910;
 //BA.debugLineNum = 24313910;BA.debugLine="ListAshkhas=OrginalListAshkhas";
mostCurrent._listashkhas = mostCurrent._orginallistashkhas;
RDebugUtils.currentLine=24313913;
 //BA.debugLineNum = 24313913;BA.debugLine="HLV.notifyDataSetChanged";
mostCurrent._hlv.notifyDataSetChanged();
 } 
       catch (Exception e42) {
			processBA.setLastException(e42);RDebugUtils.currentLine=24313915;
 //BA.debugLineNum = 24313915;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("524313915",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=24313916;
 //BA.debugLineNum = 24313916;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-LoadListAshkhas");
 };
RDebugUtils.currentLine=24313918;
 //BA.debugLineNum = 24313918;BA.debugLine="End Sub";
return "";
}
public static String  _loadgoroohashkasback1(String _code) throws Exception{
RDebugUtils.currentModule="act_selectmantage";
if (Debug.shouldDelegate(mostCurrent.activityBA, "loadgoroohashkasback1", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "loadgoroohashkasback1", new Object[] {_code}));}
String _c_gorooh = "";
int _count = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _dt = null;
ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas _item1 = null;
int _i = 0;
ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas _item = null;
RDebugUtils.currentLine=23199744;
 //BA.debugLineNum = 23199744;BA.debugLine="Sub LoadGoroohAshkasBack1(Code As String)";
RDebugUtils.currentLine=23199745;
 //BA.debugLineNum = 23199745;BA.debugLine="Dim C_Gorooh As String = MCode.Sf.Left(Code,Code.";
_c_gorooh = mostCurrent._mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vv0(_code,(long) (_code.length()-6));
RDebugUtils.currentLine=23199746;
 //BA.debugLineNum = 23199746;BA.debugLine="Dim Count As Int = C_Gorooh.Length + 3";
_count = (int) (_c_gorooh.length()+3);
RDebugUtils.currentLine=23199747;
 //BA.debugLineNum = 23199747;BA.debugLine="Dim Dt As Cursor=MCode.Result(\"Select FldC_Gorooh";
_dt = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_dt = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas where FldC_Gorooh Like '"+_c_gorooh+"%' And Length(FldC_Gorooh) = "+BA.NumberToString(_count)+" ORDER BY FldC_Gorooh");
RDebugUtils.currentLine=23199748;
 //BA.debugLineNum = 23199748;BA.debugLine="If Dt.RowCount>0 Then";
if (_dt.getRowCount()>0) { 
RDebugUtils.currentLine=23199749;
 //BA.debugLineNum = 23199749;BA.debugLine="OriginalListGoroohAshkhas2.Clear";
mostCurrent._originallistgoroohashkhas2.Clear();
RDebugUtils.currentLine=23199750;
 //BA.debugLineNum = 23199750;BA.debugLine="Dim Item1 As AdapterGoroohAshkhas";
_item1 = new ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas();
RDebugUtils.currentLine=23199751;
 //BA.debugLineNum = 23199751;BA.debugLine="Item1.FldC_Gorooh= 0";
_item1.FldC_Gorooh /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=23199752;
 //BA.debugLineNum = 23199752;BA.debugLine="Item1.FldN_Gorooh= \"همه گروه ها\"";
_item1.FldN_Gorooh /*String*/  = "همه گروه ها";
RDebugUtils.currentLine=23199753;
 //BA.debugLineNum = 23199753;BA.debugLine="OriginalListGoroohAshkhas2.Add(Item1)";
mostCurrent._originallistgoroohashkhas2.Add((Object)(_item1));
RDebugUtils.currentLine=23199754;
 //BA.debugLineNum = 23199754;BA.debugLine="For i=0 To Dt.RowCount-1";
{
final int step10 = 1;
final int limit10 = (int) (_dt.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit10 ;_i = _i + step10 ) {
RDebugUtils.currentLine=23199755;
 //BA.debugLineNum = 23199755;BA.debugLine="Dt.Position=i";
_dt.setPosition(_i);
RDebugUtils.currentLine=23199756;
 //BA.debugLineNum = 23199756;BA.debugLine="Dim Item As AdapterGoroohAshkhas";
_item = new ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas();
RDebugUtils.currentLine=23199757;
 //BA.debugLineNum = 23199757;BA.debugLine="Item.FldC_Gorooh= Dt.GetString(\"FldC_Gorooh\")";
_item.FldC_Gorooh /*String*/  = _dt.GetString("FldC_Gorooh");
RDebugUtils.currentLine=23199758;
 //BA.debugLineNum = 23199758;BA.debugLine="Item.FldN_Gorooh= Dt.GetString(\"FldN_Gorooh\")";
_item.FldN_Gorooh /*String*/  = _dt.GetString("FldN_Gorooh");
RDebugUtils.currentLine=23199759;
 //BA.debugLineNum = 23199759;BA.debugLine="OriginalListGoroohAshkhas2.Add(Item)";
mostCurrent._originallistgoroohashkhas2.Add((Object)(_item));
RDebugUtils.currentLine=23199760;
 //BA.debugLineNum = 23199760;BA.debugLine="MCode.C_LayeAshkhas=Item.FldC_Gorooh";
mostCurrent._mcode._c_layeashkhas /*String*/  = _item.FldC_Gorooh /*String*/ ;
 }
};
RDebugUtils.currentLine=23199762;
 //BA.debugLineNum = 23199762;BA.debugLine="ListGoroohAshkhas2 = OriginalListGoroohAshkhas2";
mostCurrent._listgoroohashkhas2 = mostCurrent._originallistgoroohashkhas2;
RDebugUtils.currentLine=23199763;
 //BA.debugLineNum = 23199763;BA.debugLine="HLVGoroohAshkhas.notifyDataSetChanged";
mostCurrent._hlvgoroohashkhas.notifyDataSetChanged();
 };
RDebugUtils.currentLine=23199765;
 //BA.debugLineNum = 23199765;BA.debugLine="LoadAshkhas";
_loadashkhas();
RDebugUtils.currentLine=23199766;
 //BA.debugLineNum = 23199766;BA.debugLine="End Sub";
return "";
}
public static String  _loadlistgoroohashkhas() throws Exception{
RDebugUtils.currentModule="act_selectmantage";
if (Debug.shouldDelegate(mostCurrent.activityBA, "loadlistgoroohashkhas", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "loadlistgoroohashkhas", null));}
ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas _item1 = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _dt = null;
int _i = 0;
ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas _item = null;
RDebugUtils.currentLine=23003136;
 //BA.debugLineNum = 23003136;BA.debugLine="Sub LoadListGoroohAshkhas";
RDebugUtils.currentLine=23003138;
 //BA.debugLineNum = 23003138;BA.debugLine="Dim Item1 As AdapterGoroohAshkhas";
_item1 = new ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas();
RDebugUtils.currentLine=23003139;
 //BA.debugLineNum = 23003139;BA.debugLine="Item1.FldC_Gorooh= 0";
_item1.FldC_Gorooh /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=23003140;
 //BA.debugLineNum = 23003140;BA.debugLine="Item1.FldN_Gorooh= \"همه گروه ها\"";
_item1.FldN_Gorooh /*String*/  = "همه گروه ها";
RDebugUtils.currentLine=23003141;
 //BA.debugLineNum = 23003141;BA.debugLine="OriginalListGoroohAshkhas2.Add(Item1)";
mostCurrent._originallistgoroohashkhas2.Add((Object)(_item1));
RDebugUtils.currentLine=23003142;
 //BA.debugLineNum = 23003142;BA.debugLine="Dim Dt As Cursor = MCode.Result(\"Select FldC_Goro";
_dt = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_dt = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas where Length(FldC_Gorooh) = 3 ORDER BY FldC_Gorooh");
RDebugUtils.currentLine=23003143;
 //BA.debugLineNum = 23003143;BA.debugLine="For i=0 To Dt.RowCount-1";
{
final int step6 = 1;
final int limit6 = (int) (_dt.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=23003144;
 //BA.debugLineNum = 23003144;BA.debugLine="Dt.Position=i";
_dt.setPosition(_i);
RDebugUtils.currentLine=23003145;
 //BA.debugLineNum = 23003145;BA.debugLine="Dim Item As AdapterGoroohAshkhas";
_item = new ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas();
RDebugUtils.currentLine=23003146;
 //BA.debugLineNum = 23003146;BA.debugLine="Item.FldC_Gorooh= Dt.GetString(\"FldC_Gorooh\")";
_item.FldC_Gorooh /*String*/  = _dt.GetString("FldC_Gorooh");
RDebugUtils.currentLine=23003147;
 //BA.debugLineNum = 23003147;BA.debugLine="Item.FldN_Gorooh= Dt.GetString(\"FldN_Gorooh\")";
_item.FldN_Gorooh /*String*/  = _dt.GetString("FldN_Gorooh");
RDebugUtils.currentLine=23003148;
 //BA.debugLineNum = 23003148;BA.debugLine="OriginalListGoroohAshkhas2.Add(Item)";
mostCurrent._originallistgoroohashkhas2.Add((Object)(_item));
 }
};
RDebugUtils.currentLine=23003152;
 //BA.debugLineNum = 23003152;BA.debugLine="ListGoroohAshkhas2 = OriginalListGoroohAshkhas2";
mostCurrent._listgoroohashkhas2 = mostCurrent._originallistgoroohashkhas2;
RDebugUtils.currentLine=23003154;
 //BA.debugLineNum = 23003154;BA.debugLine="End Sub";
return "";
}
public static String  _nicespinner_item_clicked() throws Exception{
RDebugUtils.currentModule="act_selectmantage";
if (Debug.shouldDelegate(mostCurrent.activityBA, "nicespinner_item_clicked", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "nicespinner_item_clicked", null));}
int _position = 0;
anywheresoftware.b4a.objects.collections.List _lst = null;
int _index = 0;
ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas _item = null;
String _mc = "";
int _count = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
int _i = 0;
RDebugUtils.currentLine=24051712;
 //BA.debugLineNum = 24051712;BA.debugLine="Sub NiceSpinner_item_clicked";
RDebugUtils.currentLine=24051713;
 //BA.debugLineNum = 24051713;BA.debugLine="Dim Position As Int=NiceSpinner.SelectedIndex";
_position = mostCurrent._nicespinner.getSelectedIndex();
RDebugUtils.currentLine=24051714;
 //BA.debugLineNum = 24051714;BA.debugLine="Log(\"ns1 item \" & NiceSpinner.SelectedIndex &\" se";
anywheresoftware.b4a.keywords.Common.LogImpl("524051714","ns1 item "+BA.NumberToString(mostCurrent._nicespinner.getSelectedIndex())+" selected",0);
RDebugUtils.currentLine=24051715;
 //BA.debugLineNum = 24051715;BA.debugLine="Log(\"ns1 item \" & NiceSpinner.Text &\" selected\")";
anywheresoftware.b4a.keywords.Common.LogImpl("524051715","ns1 item "+mostCurrent._nicespinner.getText()+" selected",0);
RDebugUtils.currentLine=24051717;
 //BA.debugLineNum = 24051717;BA.debugLine="Try";
try {RDebugUtils.currentLine=24051718;
 //BA.debugLineNum = 24051718;BA.debugLine="Key.HideKeyboard";
mostCurrent._key.HideKeyboard(mostCurrent.activityBA);
RDebugUtils.currentLine=24051720;
 //BA.debugLineNum = 24051720;BA.debugLine="If Position = 0 Then";
if (_position==0) { 
RDebugUtils.currentLine=24051721;
 //BA.debugLineNum = 24051721;BA.debugLine="ListGoroohAshkhas1.Clear";
mostCurrent._listgoroohashkhas1.Clear();
RDebugUtils.currentLine=24051722;
 //BA.debugLineNum = 24051722;BA.debugLine="lstSelectedCodeGroupAshkhas.Clear";
mostCurrent._lstselectedcodegroupashkhas.Clear();
RDebugUtils.currentLine=24051724;
 //BA.debugLineNum = 24051724;BA.debugLine="lstGroup2.Clear";
mostCurrent._lstgroup2.Clear();
RDebugUtils.currentLine=24051726;
 //BA.debugLineNum = 24051726;BA.debugLine="lstGroup2.Add(\"همه گروه ها\")";
mostCurrent._lstgroup2.Add((Object)("همه گروه ها"));
RDebugUtils.currentLine=24051728;
 //BA.debugLineNum = 24051728;BA.debugLine="GroupCodeSelect1=\"0\"";
mostCurrent._groupcodeselect1 = "0";
RDebugUtils.currentLine=24051729;
 //BA.debugLineNum = 24051729;BA.debugLine="GroupNameSelect1=\"\"";
mostCurrent._groupnameselect1 = "";
RDebugUtils.currentLine=24051730;
 //BA.debugLineNum = 24051730;BA.debugLine="GroupCodeSelect2=\"0\"";
mostCurrent._groupcodeselect2 = "0";
RDebugUtils.currentLine=24051731;
 //BA.debugLineNum = 24051731;BA.debugLine="GroupNameSelect2=\"\"";
mostCurrent._groupnameselect2 = "";
 }else {
RDebugUtils.currentLine=24051734;
 //BA.debugLineNum = 24051734;BA.debugLine="Dim lst As List=OriginalListGoroohAshkhas1";
_lst = new anywheresoftware.b4a.objects.collections.List();
_lst = mostCurrent._originallistgoroohashkhas1;
RDebugUtils.currentLine=24051735;
 //BA.debugLineNum = 24051735;BA.debugLine="Log(NiceSpinner.SelectedIndex-1)";
anywheresoftware.b4a.keywords.Common.LogImpl("524051735",BA.NumberToString(mostCurrent._nicespinner.getSelectedIndex()-1),0);
RDebugUtils.currentLine=24051736;
 //BA.debugLineNum = 24051736;BA.debugLine="Dim index As Int=Position-1";
_index = (int) (_position-1);
RDebugUtils.currentLine=24051737;
 //BA.debugLineNum = 24051737;BA.debugLine="Dim Item As AdapterGoroohAshkhas=lst.Get(index)";
_item = (ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas)(_lst.Get(_index));
RDebugUtils.currentLine=24051738;
 //BA.debugLineNum = 24051738;BA.debugLine="Log(Item.FldN_Gorooh)";
anywheresoftware.b4a.keywords.Common.LogImpl("524051738",_item.FldN_Gorooh /*String*/ ,0);
RDebugUtils.currentLine=24051739;
 //BA.debugLineNum = 24051739;BA.debugLine="Log(Item.FldC_Gorooh)";
anywheresoftware.b4a.keywords.Common.LogImpl("524051739",_item.FldC_Gorooh /*String*/ ,0);
RDebugUtils.currentLine=24051740;
 //BA.debugLineNum = 24051740;BA.debugLine="GroupCodeSelect1=Item.FldC_Gorooh";
mostCurrent._groupcodeselect1 = _item.FldC_Gorooh /*String*/ ;
RDebugUtils.currentLine=24051741;
 //BA.debugLineNum = 24051741;BA.debugLine="GroupNameSelect1=Item.FldN_Gorooh";
mostCurrent._groupnameselect1 = _item.FldN_Gorooh /*String*/ ;
RDebugUtils.currentLine=24051742;
 //BA.debugLineNum = 24051742;BA.debugLine="GroupCodeSelect2=\"0\"";
mostCurrent._groupcodeselect2 = "0";
RDebugUtils.currentLine=24051743;
 //BA.debugLineNum = 24051743;BA.debugLine="GroupNameSelect2=\"\"";
mostCurrent._groupnameselect2 = "";
RDebugUtils.currentLine=24051744;
 //BA.debugLineNum = 24051744;BA.debugLine="Dim mc As String=Item.FldC_Gorooh";
_mc = _item.FldC_Gorooh /*String*/ ;
RDebugUtils.currentLine=24051746;
 //BA.debugLineNum = 24051746;BA.debugLine="Dim Count As Int = Item.FldC_Gorooh.Length + 3";
_count = (int) (_item.FldC_Gorooh /*String*/ .length()+3);
RDebugUtils.currentLine=24051747;
 //BA.debugLineNum = 24051747;BA.debugLine="Dim Cu As Cursor=MCode.Result(\"Select FldC_Goro";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas where FldC_Gorooh Like '"+_mc+"%' And Length(FldC_Gorooh) = "+BA.NumberToString(_count)+" ORDER BY FldC_Gorooh");
RDebugUtils.currentLine=24051748;
 //BA.debugLineNum = 24051748;BA.debugLine="If Cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=24051749;
 //BA.debugLineNum = 24051749;BA.debugLine="lstSelectedCodeGroupAshkhas.Clear";
mostCurrent._lstselectedcodegroupashkhas.Clear();
RDebugUtils.currentLine=24051751;
 //BA.debugLineNum = 24051751;BA.debugLine="lstGroup2.Clear";
mostCurrent._lstgroup2.Clear();
RDebugUtils.currentLine=24051753;
 //BA.debugLineNum = 24051753;BA.debugLine="lstGroup2.Add(\"همه گروه ها\")";
mostCurrent._lstgroup2.Add((Object)("همه گروه ها"));
RDebugUtils.currentLine=24051754;
 //BA.debugLineNum = 24051754;BA.debugLine="For i=0 To Cu.RowCount-1";
{
final int step33 = 1;
final int limit33 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit33 ;_i = _i + step33 ) {
RDebugUtils.currentLine=24051755;
 //BA.debugLineNum = 24051755;BA.debugLine="Cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=24051756;
 //BA.debugLineNum = 24051756;BA.debugLine="Dim Item As AdapterGoroohAshkhas";
_item = new ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas();
RDebugUtils.currentLine=24051757;
 //BA.debugLineNum = 24051757;BA.debugLine="Item.FldC_Gorooh=Cu.GetString(\"FldC_Gorooh\")";
_item.FldC_Gorooh /*String*/  = _cu.GetString("FldC_Gorooh");
RDebugUtils.currentLine=24051758;
 //BA.debugLineNum = 24051758;BA.debugLine="Item.FldN_Gorooh=Cu.GetString(\"FldN_Gorooh\")";
_item.FldN_Gorooh /*String*/  = _cu.GetString("FldN_Gorooh");
RDebugUtils.currentLine=24051759;
 //BA.debugLineNum = 24051759;BA.debugLine="ListGoroohAshkhas1.Add(Item)";
mostCurrent._listgoroohashkhas1.Add((Object)(_item));
RDebugUtils.currentLine=24051761;
 //BA.debugLineNum = 24051761;BA.debugLine="lstGroup2.Add(Cu.GetString(\"FldN_Gorooh\"))";
mostCurrent._lstgroup2.Add((Object)(_cu.GetString("FldN_Gorooh")));
 }
};
RDebugUtils.currentLine=24051764;
 //BA.debugLineNum = 24051764;BA.debugLine="NiceSpinner1.attachDataSource(lstGroup2)";
mostCurrent._nicespinner1.attachDataSource((java.util.List)(mostCurrent._lstgroup2.getObject()));
RDebugUtils.currentLine=24051766;
 //BA.debugLineNum = 24051766;BA.debugLine="lstSelectedCodeGroupAshkhas.Add(GroupCodeSelec";
mostCurrent._lstselectedcodegroupashkhas.Add((Object)(mostCurrent._groupcodeselect1));
 }else {
RDebugUtils.currentLine=24051768;
 //BA.debugLineNum = 24051768;BA.debugLine="ListGoroohAshkhas1.Clear";
mostCurrent._listgoroohashkhas1.Clear();
RDebugUtils.currentLine=24051769;
 //BA.debugLineNum = 24051769;BA.debugLine="lstSelectedCodeGroupAshkhas.Clear";
mostCurrent._lstselectedcodegroupashkhas.Clear();
RDebugUtils.currentLine=24051771;
 //BA.debugLineNum = 24051771;BA.debugLine="lstGroup2.Clear";
mostCurrent._lstgroup2.Clear();
RDebugUtils.currentLine=24051773;
 //BA.debugLineNum = 24051773;BA.debugLine="lstGroup2.Add(\"همه گروه ها\")";
mostCurrent._lstgroup2.Add((Object)("همه گروه ها"));
RDebugUtils.currentLine=24051774;
 //BA.debugLineNum = 24051774;BA.debugLine="GroupCodeSelect2=\"0\"";
mostCurrent._groupcodeselect2 = "0";
RDebugUtils.currentLine=24051775;
 //BA.debugLineNum = 24051775;BA.debugLine="GroupNameSelect2=\"\"";
mostCurrent._groupnameselect2 = "";
 };
 };
RDebugUtils.currentLine=24051780;
 //BA.debugLineNum = 24051780;BA.debugLine="LoadAshkhas";
_loadashkhas();
RDebugUtils.currentLine=24051781;
 //BA.debugLineNum = 24051781;BA.debugLine="Log(\"CodeGroupSelect1: \"&GroupCodeSelect1)";
anywheresoftware.b4a.keywords.Common.LogImpl("524051781","CodeGroupSelect1: "+mostCurrent._groupcodeselect1,0);
RDebugUtils.currentLine=24051782;
 //BA.debugLineNum = 24051782;BA.debugLine="Log(\"postion1: \"&Position)";
anywheresoftware.b4a.keywords.Common.LogImpl("524051782","postion1: "+BA.NumberToString(_position),0);
 } 
       catch (Exception e56) {
			processBA.setLastException(e56);RDebugUtils.currentLine=24051784;
 //BA.debugLineNum = 24051784;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("524051784",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=24051785;
 //BA.debugLineNum = 24051785;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-NiceSpinner_ItemClick");
 };
RDebugUtils.currentLine=24051787;
 //BA.debugLineNum = 24051787;BA.debugLine="End Sub";
return "";
}
public static String  _nicespinner_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="act_selectmantage";
if (Debug.shouldDelegate(mostCurrent.activityBA, "nicespinner_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "nicespinner_itemclick", new Object[] {_position,_value}));}
anywheresoftware.b4a.objects.collections.List _lst = null;
int _index = 0;
ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas _item = null;
String _mc = "";
int _count = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
int _i = 0;
RDebugUtils.currentLine=24182784;
 //BA.debugLineNum = 24182784;BA.debugLine="Sub NiceSpinner_ItemClick (Position As Int, Value";
RDebugUtils.currentLine=24182786;
 //BA.debugLineNum = 24182786;BA.debugLine="Try";
try {RDebugUtils.currentLine=24182787;
 //BA.debugLineNum = 24182787;BA.debugLine="Key.HideKeyboard";
mostCurrent._key.HideKeyboard(mostCurrent.activityBA);
RDebugUtils.currentLine=24182789;
 //BA.debugLineNum = 24182789;BA.debugLine="If Position = 0 Then";
if (_position==0) { 
RDebugUtils.currentLine=24182790;
 //BA.debugLineNum = 24182790;BA.debugLine="ListGoroohAshkhas1.Clear";
mostCurrent._listgoroohashkhas1.Clear();
RDebugUtils.currentLine=24182791;
 //BA.debugLineNum = 24182791;BA.debugLine="lstSelectedCodeGroupAshkhas.Clear";
mostCurrent._lstselectedcodegroupashkhas.Clear();
RDebugUtils.currentLine=24182793;
 //BA.debugLineNum = 24182793;BA.debugLine="lstGroup2.Clear";
mostCurrent._lstgroup2.Clear();
RDebugUtils.currentLine=24182794;
 //BA.debugLineNum = 24182794;BA.debugLine="lstGroup2.Add(\"همه گروه ها\")";
mostCurrent._lstgroup2.Add((Object)("همه گروه ها"));
RDebugUtils.currentLine=24182796;
 //BA.debugLineNum = 24182796;BA.debugLine="GroupCodeSelect1=\"0\"";
mostCurrent._groupcodeselect1 = "0";
RDebugUtils.currentLine=24182797;
 //BA.debugLineNum = 24182797;BA.debugLine="GroupNameSelect1=\"\"";
mostCurrent._groupnameselect1 = "";
RDebugUtils.currentLine=24182798;
 //BA.debugLineNum = 24182798;BA.debugLine="GroupCodeSelect2=\"0\"";
mostCurrent._groupcodeselect2 = "0";
RDebugUtils.currentLine=24182799;
 //BA.debugLineNum = 24182799;BA.debugLine="GroupNameSelect2=\"\"";
mostCurrent._groupnameselect2 = "";
RDebugUtils.currentLine=24182800;
 //BA.debugLineNum = 24182800;BA.debugLine="NiceSpinner1.SelectedIndex=0";
mostCurrent._nicespinner1.setSelectedIndex((int) (0));
 }else {
RDebugUtils.currentLine=24182802;
 //BA.debugLineNum = 24182802;BA.debugLine="Dim lst As List=OriginalListGoroohAshkhas1";
_lst = new anywheresoftware.b4a.objects.collections.List();
_lst = mostCurrent._originallistgoroohashkhas1;
RDebugUtils.currentLine=24182803;
 //BA.debugLineNum = 24182803;BA.debugLine="Log(NiceSpinner.SelectedIndex-1)";
anywheresoftware.b4a.keywords.Common.LogImpl("524182803",BA.NumberToString(mostCurrent._nicespinner.getSelectedIndex()-1),0);
RDebugUtils.currentLine=24182804;
 //BA.debugLineNum = 24182804;BA.debugLine="Dim index As Int=Position-1";
_index = (int) (_position-1);
RDebugUtils.currentLine=24182805;
 //BA.debugLineNum = 24182805;BA.debugLine="Dim Item As AdapterGoroohAshkhas=lst.Get(index)";
_item = (ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas)(_lst.Get(_index));
RDebugUtils.currentLine=24182806;
 //BA.debugLineNum = 24182806;BA.debugLine="Log(Item.FldN_Gorooh)";
anywheresoftware.b4a.keywords.Common.LogImpl("524182806",_item.FldN_Gorooh /*String*/ ,0);
RDebugUtils.currentLine=24182807;
 //BA.debugLineNum = 24182807;BA.debugLine="Log(Item.FldC_Gorooh)";
anywheresoftware.b4a.keywords.Common.LogImpl("524182807",_item.FldC_Gorooh /*String*/ ,0);
RDebugUtils.currentLine=24182808;
 //BA.debugLineNum = 24182808;BA.debugLine="GroupCodeSelect1=Item.FldC_Gorooh";
mostCurrent._groupcodeselect1 = _item.FldC_Gorooh /*String*/ ;
RDebugUtils.currentLine=24182809;
 //BA.debugLineNum = 24182809;BA.debugLine="GroupNameSelect1=Item.FldN_Gorooh";
mostCurrent._groupnameselect1 = _item.FldN_Gorooh /*String*/ ;
RDebugUtils.currentLine=24182810;
 //BA.debugLineNum = 24182810;BA.debugLine="GroupCodeSelect2=\"0\"";
mostCurrent._groupcodeselect2 = "0";
RDebugUtils.currentLine=24182811;
 //BA.debugLineNum = 24182811;BA.debugLine="GroupNameSelect2=\"\"";
mostCurrent._groupnameselect2 = "";
RDebugUtils.currentLine=24182812;
 //BA.debugLineNum = 24182812;BA.debugLine="Dim mc As String=Item.FldC_Gorooh";
_mc = _item.FldC_Gorooh /*String*/ ;
RDebugUtils.currentLine=24182814;
 //BA.debugLineNum = 24182814;BA.debugLine="Dim Count As Int = Item.FldC_Gorooh.Length + 3";
_count = (int) (_item.FldC_Gorooh /*String*/ .length()+3);
RDebugUtils.currentLine=24182815;
 //BA.debugLineNum = 24182815;BA.debugLine="Dim Cu As Cursor=MCode.Result(\"Select FldC_Goroo";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas where FldC_Gorooh Like '"+_mc+"%' And Length(FldC_Gorooh) = "+BA.NumberToString(_count)+" ORDER BY FldC_Gorooh");
RDebugUtils.currentLine=24182816;
 //BA.debugLineNum = 24182816;BA.debugLine="If Cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=24182817;
 //BA.debugLineNum = 24182817;BA.debugLine="lstSelectedCodeGroupAshkhas.Clear";
mostCurrent._lstselectedcodegroupashkhas.Clear();
RDebugUtils.currentLine=24182819;
 //BA.debugLineNum = 24182819;BA.debugLine="lstGroup2.Clear";
mostCurrent._lstgroup2.Clear();
RDebugUtils.currentLine=24182821;
 //BA.debugLineNum = 24182821;BA.debugLine="lstGroup2.Add(\"همه گروه ها\")";
mostCurrent._lstgroup2.Add((Object)("همه گروه ها"));
RDebugUtils.currentLine=24182822;
 //BA.debugLineNum = 24182822;BA.debugLine="For i=0 To Cu.RowCount-1";
{
final int step31 = 1;
final int limit31 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit31 ;_i = _i + step31 ) {
RDebugUtils.currentLine=24182823;
 //BA.debugLineNum = 24182823;BA.debugLine="Cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=24182824;
 //BA.debugLineNum = 24182824;BA.debugLine="Dim Item As AdapterGoroohAshkhas";
_item = new ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas();
RDebugUtils.currentLine=24182825;
 //BA.debugLineNum = 24182825;BA.debugLine="Item.FldC_Gorooh=Cu.GetString(\"FldC_Gorooh\")";
_item.FldC_Gorooh /*String*/  = _cu.GetString("FldC_Gorooh");
RDebugUtils.currentLine=24182826;
 //BA.debugLineNum = 24182826;BA.debugLine="Item.FldN_Gorooh=Cu.GetString(\"FldN_Gorooh\")";
_item.FldN_Gorooh /*String*/  = _cu.GetString("FldN_Gorooh");
RDebugUtils.currentLine=24182827;
 //BA.debugLineNum = 24182827;BA.debugLine="ListGoroohAshkhas1.Add(Item)";
mostCurrent._listgoroohashkhas1.Add((Object)(_item));
RDebugUtils.currentLine=24182829;
 //BA.debugLineNum = 24182829;BA.debugLine="lstGroup2.Add(Cu.GetString(\"FldN_Gorooh\"))";
mostCurrent._lstgroup2.Add((Object)(_cu.GetString("FldN_Gorooh")));
 }
};
RDebugUtils.currentLine=24182832;
 //BA.debugLineNum = 24182832;BA.debugLine="NiceSpinner1.attachDataSource(lstGroup2)";
mostCurrent._nicespinner1.attachDataSource((java.util.List)(mostCurrent._lstgroup2.getObject()));
RDebugUtils.currentLine=24182833;
 //BA.debugLineNum = 24182833;BA.debugLine="NiceSpinner1.SelectedIndex = 0";
mostCurrent._nicespinner1.setSelectedIndex((int) (0));
RDebugUtils.currentLine=24182834;
 //BA.debugLineNum = 24182834;BA.debugLine="lstSelectedCodeGroupAshkhas.Add(GroupCodeSelect";
mostCurrent._lstselectedcodegroupashkhas.Add((Object)(mostCurrent._groupcodeselect1));
 }else {
RDebugUtils.currentLine=24182836;
 //BA.debugLineNum = 24182836;BA.debugLine="ListGoroohAshkhas1.Clear";
mostCurrent._listgoroohashkhas1.Clear();
RDebugUtils.currentLine=24182837;
 //BA.debugLineNum = 24182837;BA.debugLine="lstSelectedCodeGroupAshkhas.Clear";
mostCurrent._lstselectedcodegroupashkhas.Clear();
RDebugUtils.currentLine=24182839;
 //BA.debugLineNum = 24182839;BA.debugLine="lstGroup2.Clear";
mostCurrent._lstgroup2.Clear();
RDebugUtils.currentLine=24182841;
 //BA.debugLineNum = 24182841;BA.debugLine="lstGroup2.Add(\"همه گروه ها\")";
mostCurrent._lstgroup2.Add((Object)("همه گروه ها"));
RDebugUtils.currentLine=24182842;
 //BA.debugLineNum = 24182842;BA.debugLine="GroupCodeSelect2=\"0\"";
mostCurrent._groupcodeselect2 = "0";
RDebugUtils.currentLine=24182843;
 //BA.debugLineNum = 24182843;BA.debugLine="GroupNameSelect2=\"\"";
mostCurrent._groupnameselect2 = "";
RDebugUtils.currentLine=24182844;
 //BA.debugLineNum = 24182844;BA.debugLine="NiceSpinner1.SelectedIndex=0";
mostCurrent._nicespinner1.setSelectedIndex((int) (0));
 };
 };
RDebugUtils.currentLine=24182848;
 //BA.debugLineNum = 24182848;BA.debugLine="LoadAshkhas";
_loadashkhas();
RDebugUtils.currentLine=24182849;
 //BA.debugLineNum = 24182849;BA.debugLine="Log(\"CodeGroupSelect1: \"&GroupCodeSelect1)";
anywheresoftware.b4a.keywords.Common.LogImpl("524182849","CodeGroupSelect1: "+mostCurrent._groupcodeselect1,0);
RDebugUtils.currentLine=24182850;
 //BA.debugLineNum = 24182850;BA.debugLine="Log(\"postion1: \"&Position)";
anywheresoftware.b4a.keywords.Common.LogImpl("524182850","postion1: "+BA.NumberToString(_position),0);
 } 
       catch (Exception e56) {
			processBA.setLastException(e56);RDebugUtils.currentLine=24182852;
 //BA.debugLineNum = 24182852;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("524182852",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=24182853;
 //BA.debugLineNum = 24182853;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-NiceSpinner_ItemClick");
 };
RDebugUtils.currentLine=24182855;
 //BA.debugLineNum = 24182855;BA.debugLine="End Sub";
return "";
}
public static String  _nicespinner1_item_clicked() throws Exception{
RDebugUtils.currentModule="act_selectmantage";
if (Debug.shouldDelegate(mostCurrent.activityBA, "nicespinner1_item_clicked", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "nicespinner1_item_clicked", null));}
int _position = 0;
Object _value = null;
anywheresoftware.b4a.objects.collections.List _lst = null;
ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas _item = null;
String _mc = "";
int _count = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
int _i = 0;
anywheresoftware.b4a.objects.drawable.ColorDrawable _op1 = null;
RDebugUtils.currentLine=24117248;
 //BA.debugLineNum = 24117248;BA.debugLine="Sub NiceSpinner1_item_clicked";
RDebugUtils.currentLine=24117249;
 //BA.debugLineNum = 24117249;BA.debugLine="Dim Position As Int=NiceSpinner1.SelectedIndex";
_position = mostCurrent._nicespinner1.getSelectedIndex();
RDebugUtils.currentLine=24117250;
 //BA.debugLineNum = 24117250;BA.debugLine="Dim Value As Object=NiceSpinner1.Text";
_value = (Object)(mostCurrent._nicespinner1.getText());
RDebugUtils.currentLine=24117251;
 //BA.debugLineNum = 24117251;BA.debugLine="Log(\"ns2 item \" & NiceSpinner1.SelectedIndex &\" s";
anywheresoftware.b4a.keywords.Common.LogImpl("524117251","ns2 item "+BA.NumberToString(mostCurrent._nicespinner1.getSelectedIndex())+" selected",0);
RDebugUtils.currentLine=24117252;
 //BA.debugLineNum = 24117252;BA.debugLine="Log(\"ns2 item \" & NiceSpinner1.Text &\" selected\")";
anywheresoftware.b4a.keywords.Common.LogImpl("524117252","ns2 item "+mostCurrent._nicespinner1.getText()+" selected",0);
RDebugUtils.currentLine=24117253;
 //BA.debugLineNum = 24117253;BA.debugLine="Try";
try {RDebugUtils.currentLine=24117254;
 //BA.debugLineNum = 24117254;BA.debugLine="If Position=0 Then";
if (_position==0) { 
RDebugUtils.currentLine=24117255;
 //BA.debugLineNum = 24117255;BA.debugLine="If lstSelectedCodeGroupAshkhas.Size>0 Then";
if (mostCurrent._lstselectedcodegroupashkhas.getSize()>0) { 
RDebugUtils.currentLine=24117256;
 //BA.debugLineNum = 24117256;BA.debugLine="GroupCodeSelect2=lstSelectedCodeGroupAshkhas.G";
mostCurrent._groupcodeselect2 = BA.ObjectToString(mostCurrent._lstselectedcodegroupashkhas.Get((int) (mostCurrent._lstselectedcodegroupashkhas.getSize()-1)));
 };
 }else {
RDebugUtils.currentLine=24117260;
 //BA.debugLineNum = 24117260;BA.debugLine="Dim lst As List=ListGoroohAshkhas1";
_lst = new anywheresoftware.b4a.objects.collections.List();
_lst = mostCurrent._listgoroohashkhas1;
RDebugUtils.currentLine=24117261;
 //BA.debugLineNum = 24117261;BA.debugLine="Dim Item As AdapterGoroohAshkhas=lst.Get(Positi";
_item = (ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas)(_lst.Get((int) (_position-1)));
RDebugUtils.currentLine=24117262;
 //BA.debugLineNum = 24117262;BA.debugLine="GroupCodeSelect2=Item.FldC_Gorooh";
mostCurrent._groupcodeselect2 = _item.FldC_Gorooh /*String*/ ;
RDebugUtils.currentLine=24117264;
 //BA.debugLineNum = 24117264;BA.debugLine="Dim mc As String=Item.FldC_Gorooh";
_mc = _item.FldC_Gorooh /*String*/ ;
RDebugUtils.currentLine=24117266;
 //BA.debugLineNum = 24117266;BA.debugLine="Dim Count As Int = mc.Length + 3";
_count = (int) (_mc.length()+3);
RDebugUtils.currentLine=24117267;
 //BA.debugLineNum = 24117267;BA.debugLine="Dim Cu As Cursor=MCode.Result(\"Select FldC_Goro";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas where FldC_Gorooh Like '"+_mc+"%' And Length(FldC_Gorooh) = "+BA.NumberToString(_count)+" ORDER BY FldC_Gorooh");
RDebugUtils.currentLine=24117268;
 //BA.debugLineNum = 24117268;BA.debugLine="If Cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=24117269;
 //BA.debugLineNum = 24117269;BA.debugLine="ListGoroohAshkhas1.Clear";
mostCurrent._listgoroohashkhas1.Clear();
RDebugUtils.currentLine=24117273;
 //BA.debugLineNum = 24117273;BA.debugLine="lstSelectedCodeGroupAshkhas.Add(Item.FldC_Goro";
mostCurrent._lstselectedcodegroupashkhas.Add((Object)(_item.FldC_Gorooh /*String*/ ));
RDebugUtils.currentLine=24117277;
 //BA.debugLineNum = 24117277;BA.debugLine="lstGroup2.Clear";
mostCurrent._lstgroup2.Clear();
RDebugUtils.currentLine=24117279;
 //BA.debugLineNum = 24117279;BA.debugLine="lstGroup2.Add(\"همه گروه ها\")";
mostCurrent._lstgroup2.Add((Object)("همه گروه ها"));
RDebugUtils.currentLine=24117281;
 //BA.debugLineNum = 24117281;BA.debugLine="For i=0 To Cu.RowCount-1";
{
final int step22 = 1;
final int limit22 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit22 ;_i = _i + step22 ) {
RDebugUtils.currentLine=24117282;
 //BA.debugLineNum = 24117282;BA.debugLine="Cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=24117283;
 //BA.debugLineNum = 24117283;BA.debugLine="Dim Item As AdapterGoroohAshkhas";
_item = new ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas();
RDebugUtils.currentLine=24117284;
 //BA.debugLineNum = 24117284;BA.debugLine="Item.FldC_Gorooh=Cu.GetString(\"FldC_Gorooh\")";
_item.FldC_Gorooh /*String*/  = _cu.GetString("FldC_Gorooh");
RDebugUtils.currentLine=24117285;
 //BA.debugLineNum = 24117285;BA.debugLine="Item.FldN_Gorooh=Cu.GetString(\"FldN_Gorooh\")";
_item.FldN_Gorooh /*String*/  = _cu.GetString("FldN_Gorooh");
RDebugUtils.currentLine=24117286;
 //BA.debugLineNum = 24117286;BA.debugLine="ListGoroohAshkhas1.Add(Item)";
mostCurrent._listgoroohashkhas1.Add((Object)(_item));
RDebugUtils.currentLine=24117288;
 //BA.debugLineNum = 24117288;BA.debugLine="lstGroup2.Add(Cu.GetString(\"FldN_Gorooh\"))";
mostCurrent._lstgroup2.Add((Object)(_cu.GetString("FldN_Gorooh")));
 }
};
RDebugUtils.currentLine=24117291;
 //BA.debugLineNum = 24117291;BA.debugLine="NiceSpinner1.RemoveView";
mostCurrent._nicespinner1.RemoveView();
RDebugUtils.currentLine=24117292;
 //BA.debugLineNum = 24117292;BA.debugLine="NiceSpinner1.Initialize(\"NiceSpinner1\")";
mostCurrent._nicespinner1.Initialize(processBA,"NiceSpinner1");
RDebugUtils.currentLine=24117293;
 //BA.debugLineNum = 24117293;BA.debugLine="PnlSpGroup.AddView(NiceSpinner1,B4XComboBox2.m";
mostCurrent._pnlspgroup.AddView((android.view.View)(mostCurrent._nicespinner1.getObject()),mostCurrent._b4xcombobox2._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft(),mostCurrent._b4xcombobox2._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop(),mostCurrent._b4xcombobox2._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),mostCurrent._b4xcombobox2._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=24117294;
 //BA.debugLineNum = 24117294;BA.debugLine="NiceSpinner1.TextColor = Colors.Black";
mostCurrent._nicespinner1.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=24117295;
 //BA.debugLineNum = 24117295;BA.debugLine="NiceSpinner1.Gravity = Gravity.CENTER_HORIZONT";
mostCurrent._nicespinner1.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL);
RDebugUtils.currentLine=24117296;
 //BA.debugLineNum = 24117296;BA.debugLine="NiceSpinner1.Typeface = Typeface.LoadFromAsset";
mostCurrent._nicespinner1.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("p_font.ttf"));
RDebugUtils.currentLine=24117297;
 //BA.debugLineNum = 24117297;BA.debugLine="Dim op1 As ColorDrawable";
_op1 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=24117298;
 //BA.debugLineNum = 24117298;BA.debugLine="op1.Initialize2(Colors.White,8dip,2dip,Colors.";
_op1.Initialize2(anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (8)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2)),anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=24117299;
 //BA.debugLineNum = 24117299;BA.debugLine="NiceSpinner1.Background=op1";
mostCurrent._nicespinner1.setBackground((android.graphics.drawable.Drawable)(_op1.getObject()));
RDebugUtils.currentLine=24117300;
 //BA.debugLineNum = 24117300;BA.debugLine="NiceSpinner1.attachDataSource(lstGroup2)";
mostCurrent._nicespinner1.attachDataSource((java.util.List)(mostCurrent._lstgroup2.getObject()));
 };
 };
RDebugUtils.currentLine=24117304;
 //BA.debugLineNum = 24117304;BA.debugLine="LoadAshkhas";
_loadashkhas();
RDebugUtils.currentLine=24117305;
 //BA.debugLineNum = 24117305;BA.debugLine="Log(\"CodeGroupSelect2: \"&GroupCodeSelect2)";
anywheresoftware.b4a.keywords.Common.LogImpl("524117305","CodeGroupSelect2: "+mostCurrent._groupcodeselect2,0);
RDebugUtils.currentLine=24117306;
 //BA.debugLineNum = 24117306;BA.debugLine="Log(\"position2: \"&Position)";
anywheresoftware.b4a.keywords.Common.LogImpl("524117306","position2: "+BA.NumberToString(_position),0);
 } 
       catch (Exception e46) {
			processBA.setLastException(e46);RDebugUtils.currentLine=24117308;
 //BA.debugLineNum = 24117308;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("524117308",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=24117309;
 //BA.debugLineNum = 24117309;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-NiceSpinner1_ItemClick");
 };
RDebugUtils.currentLine=24117311;
 //BA.debugLineNum = 24117311;BA.debugLine="End Sub";
return "";
}
public static String  _nicespinner1_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="act_selectmantage";
if (Debug.shouldDelegate(mostCurrent.activityBA, "nicespinner1_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "nicespinner1_itemclick", new Object[] {_position,_value}));}
anywheresoftware.b4a.objects.collections.List _lst = null;
ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas _item = null;
String _mc = "";
int _count = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
int _i = 0;
RDebugUtils.currentLine=24248320;
 //BA.debugLineNum = 24248320;BA.debugLine="Sub NiceSpinner1_ItemClick (Position As Int, Value";
RDebugUtils.currentLine=24248321;
 //BA.debugLineNum = 24248321;BA.debugLine="Try";
try {RDebugUtils.currentLine=24248322;
 //BA.debugLineNum = 24248322;BA.debugLine="If Position=0 Then";
if (_position==0) { 
RDebugUtils.currentLine=24248323;
 //BA.debugLineNum = 24248323;BA.debugLine="GroupCodeSelect2=lstSelectedCodeGroupAshkhas.Get";
mostCurrent._groupcodeselect2 = BA.ObjectToString(mostCurrent._lstselectedcodegroupashkhas.Get((int) (mostCurrent._lstselectedcodegroupashkhas.getSize()-1)));
 }else {
RDebugUtils.currentLine=24248325;
 //BA.debugLineNum = 24248325;BA.debugLine="Dim lst As List=ListGoroohAshkhas1";
_lst = new anywheresoftware.b4a.objects.collections.List();
_lst = mostCurrent._listgoroohashkhas1;
RDebugUtils.currentLine=24248326;
 //BA.debugLineNum = 24248326;BA.debugLine="Dim Item As AdapterGoroohAshkhas=lst.Get(Positio";
_item = (ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas)(_lst.Get((int) (_position-1)));
RDebugUtils.currentLine=24248327;
 //BA.debugLineNum = 24248327;BA.debugLine="GroupCodeSelect2=Item.FldC_Gorooh";
mostCurrent._groupcodeselect2 = _item.FldC_Gorooh /*String*/ ;
RDebugUtils.currentLine=24248329;
 //BA.debugLineNum = 24248329;BA.debugLine="Dim mc As String=Item.FldC_Gorooh";
_mc = _item.FldC_Gorooh /*String*/ ;
RDebugUtils.currentLine=24248331;
 //BA.debugLineNum = 24248331;BA.debugLine="Dim Count As Int = mc.Length + 3";
_count = (int) (_mc.length()+3);
RDebugUtils.currentLine=24248332;
 //BA.debugLineNum = 24248332;BA.debugLine="Dim Cu As Cursor=MCode.Result(\"Select FldC_Goroo";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas where FldC_Gorooh Like '"+_mc+"%' And Length(FldC_Gorooh) = "+BA.NumberToString(_count)+" ORDER BY FldC_Gorooh");
RDebugUtils.currentLine=24248333;
 //BA.debugLineNum = 24248333;BA.debugLine="If Cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=24248334;
 //BA.debugLineNum = 24248334;BA.debugLine="ListGoroohAshkhas1.Clear";
mostCurrent._listgoroohashkhas1.Clear();
RDebugUtils.currentLine=24248338;
 //BA.debugLineNum = 24248338;BA.debugLine="lstSelectedCodeGroupAshkhas.Add(Item.FldC_Goroo";
mostCurrent._lstselectedcodegroupashkhas.Add((Object)(_item.FldC_Gorooh /*String*/ ));
RDebugUtils.currentLine=24248342;
 //BA.debugLineNum = 24248342;BA.debugLine="lstGroup2.Clear";
mostCurrent._lstgroup2.Clear();
RDebugUtils.currentLine=24248344;
 //BA.debugLineNum = 24248344;BA.debugLine="lstGroup2.Add(\"همه گروه ها\")";
mostCurrent._lstgroup2.Add((Object)("همه گروه ها"));
RDebugUtils.currentLine=24248346;
 //BA.debugLineNum = 24248346;BA.debugLine="For i=0 To Cu.RowCount-1";
{
final int step16 = 1;
final int limit16 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit16 ;_i = _i + step16 ) {
RDebugUtils.currentLine=24248347;
 //BA.debugLineNum = 24248347;BA.debugLine="Cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=24248348;
 //BA.debugLineNum = 24248348;BA.debugLine="Dim Item As AdapterGoroohAshkhas";
_item = new ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas();
RDebugUtils.currentLine=24248349;
 //BA.debugLineNum = 24248349;BA.debugLine="Item.FldC_Gorooh=Cu.GetString(\"FldC_Gorooh\")";
_item.FldC_Gorooh /*String*/  = _cu.GetString("FldC_Gorooh");
RDebugUtils.currentLine=24248350;
 //BA.debugLineNum = 24248350;BA.debugLine="Item.FldN_Gorooh=Cu.GetString(\"FldN_Gorooh\")";
_item.FldN_Gorooh /*String*/  = _cu.GetString("FldN_Gorooh");
RDebugUtils.currentLine=24248351;
 //BA.debugLineNum = 24248351;BA.debugLine="ListGoroohAshkhas1.Add(Item)";
mostCurrent._listgoroohashkhas1.Add((Object)(_item));
RDebugUtils.currentLine=24248353;
 //BA.debugLineNum = 24248353;BA.debugLine="lstGroup2.Add(Cu.GetString(\"FldN_Gorooh\"))";
mostCurrent._lstgroup2.Add((Object)(_cu.GetString("FldN_Gorooh")));
 }
};
RDebugUtils.currentLine=24248358;
 //BA.debugLineNum = 24248358;BA.debugLine="NiceSpinner1.attachDataSource(lstGroup2)";
mostCurrent._nicespinner1.attachDataSource((java.util.List)(mostCurrent._lstgroup2.getObject()));
RDebugUtils.currentLine=24248359;
 //BA.debugLineNum = 24248359;BA.debugLine="NiceSpinner1.SelectedIndex = 0";
mostCurrent._nicespinner1.setSelectedIndex((int) (0));
 };
 };
RDebugUtils.currentLine=24248362;
 //BA.debugLineNum = 24248362;BA.debugLine="LoadAshkhas";
_loadashkhas();
RDebugUtils.currentLine=24248363;
 //BA.debugLineNum = 24248363;BA.debugLine="Log(\"CodeGroupSelect2: \"&GroupCodeSelect2)";
anywheresoftware.b4a.keywords.Common.LogImpl("524248363","CodeGroupSelect2: "+mostCurrent._groupcodeselect2,0);
RDebugUtils.currentLine=24248364;
 //BA.debugLineNum = 24248364;BA.debugLine="Log(\"position2: \"&Position)";
anywheresoftware.b4a.keywords.Common.LogImpl("524248364","position2: "+BA.NumberToString(_position),0);
 } 
       catch (Exception e32) {
			processBA.setLastException(e32);RDebugUtils.currentLine=24248366;
 //BA.debugLineNum = 24248366;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("524248366",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=24248367;
 //BA.debugLineNum = 24248367;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-NiceSpinner1_ItemClick");
 };
RDebugUtils.currentLine=24248369;
 //BA.debugLineNum = 24248369;BA.debugLine="End Sub";
return "";
}
public static String  _savegps() throws Exception{
RDebugUtils.currentModule="act_selectmantage";
if (Debug.shouldDelegate(mostCurrent.activityBA, "savegps", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "savegps", null));}
RDebugUtils.currentLine=24838144;
 //BA.debugLineNum = 24838144;BA.debugLine="Sub SaveGps";
RDebugUtils.currentLine=24838146;
 //BA.debugLineNum = 24838146;BA.debugLine="If Gps.GPSEnabled=False Then";
if (_gps.getGPSEnabled()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=24838147;
 //BA.debugLineNum = 24838147;BA.debugLine="ToastMessageShow(\"موقعیت مکانی خود را روشن کنید\"";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("موقعیت مکانی خود را روشن کنید"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=24838148;
 //BA.debugLineNum = 24838148;BA.debugLine="t1.Enabled=False";
_t1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 }else {
RDebugUtils.currentLine=24838151;
 //BA.debugLineNum = 24838151;BA.debugLine="ProgressDialogShow2(\"لطفا تا دریافت موقعیت مکانی";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(mostCurrent.activityBA,BA.ObjectToCharSequence("لطفا تا دریافت موقعیت مکانی صبر کنید"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=24838152;
 //BA.debugLineNum = 24838152;BA.debugLine="t1.Enabled=True";
_t1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=24838154;
 //BA.debugLineNum = 24838154;BA.debugLine="End Sub";
return "";
}
public static String  _swbed_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="act_selectmantage";
if (Debug.shouldDelegate(mostCurrent.activityBA, "swbed_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "swbed_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=24641536;
 //BA.debugLineNum = 24641536;BA.debugLine="Sub SwBed_CheckedChange(Checked As Boolean)";
RDebugUtils.currentLine=24641537;
 //BA.debugLineNum = 24641537;BA.debugLine="If Checked=True Then";
if (_checked==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=24641538;
 //BA.debugLineNum = 24641538;BA.debugLine="SwBes.Checked=False";
mostCurrent._swbes.setChecked(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=24641540;
 //BA.debugLineNum = 24641540;BA.debugLine="LoadAshkhas";
_loadashkhas();
RDebugUtils.currentLine=24641541;
 //BA.debugLineNum = 24641541;BA.debugLine="End Sub";
return "";
}
public static String  _swbes_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="act_selectmantage";
if (Debug.shouldDelegate(mostCurrent.activityBA, "swbes_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "swbes_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=24707072;
 //BA.debugLineNum = 24707072;BA.debugLine="Sub SwBes_CheckedChange(Checked As Boolean)";
RDebugUtils.currentLine=24707073;
 //BA.debugLineNum = 24707073;BA.debugLine="If Checked=True Then";
if (_checked==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=24707074;
 //BA.debugLineNum = 24707074;BA.debugLine="SwBed.Checked=False";
mostCurrent._swbed.setChecked(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=24707076;
 //BA.debugLineNum = 24707076;BA.debugLine="LoadAshkhas";
_loadashkhas();
RDebugUtils.currentLine=24707077;
 //BA.debugLineNum = 24707077;BA.debugLine="End Sub";
return "";
}
public static String  _swblacklist_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="act_selectmantage";
if (Debug.shouldDelegate(mostCurrent.activityBA, "swblacklist_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "swblacklist_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=25362432;
 //BA.debugLineNum = 25362432;BA.debugLine="Private Sub SwBlackList_CheckedChange(Checked As B";
RDebugUtils.currentLine=25362433;
 //BA.debugLineNum = 25362433;BA.debugLine="LoadAshkhas";
_loadashkhas();
RDebugUtils.currentLine=25362434;
 //BA.debugLineNum = 25362434;BA.debugLine="End Sub";
return "";
}
public static String  _swnew_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="act_selectmantage";
if (Debug.shouldDelegate(mostCurrent.activityBA, "swnew_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "swnew_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=24576000;
 //BA.debugLineNum = 24576000;BA.debugLine="Private Sub SwNew_CheckedChange(Checked As Boolean";
RDebugUtils.currentLine=24576001;
 //BA.debugLineNum = 24576001;BA.debugLine="LoadAshkhas";
_loadashkhas();
RDebugUtils.currentLine=24576002;
 //BA.debugLineNum = 24576002;BA.debugLine="End Sub";
return "";
}
public static String  _swsearchbyaddress_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="act_selectmantage";
if (Debug.shouldDelegate(mostCurrent.activityBA, "swsearchbyaddress_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "swsearchbyaddress_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=24772608;
 //BA.debugLineNum = 24772608;BA.debugLine="Private Sub swSearchByAddress_CheckedChange(Checke";
RDebugUtils.currentLine=24772609;
 //BA.debugLineNum = 24772609;BA.debugLine="LoadAshkhas";
_loadashkhas();
RDebugUtils.currentLine=24772610;
 //BA.debugLineNum = 24772610;BA.debugLine="End Sub";
return "";
}
public static String  _swtourtoday_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="act_selectmantage";
if (Debug.shouldDelegate(mostCurrent.activityBA, "swtourtoday_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "swtourtoday_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=25427968;
 //BA.debugLineNum = 25427968;BA.debugLine="Private Sub SwTourToday_CheckedChange(Checked As B";
RDebugUtils.currentLine=25427969;
 //BA.debugLineNum = 25427969;BA.debugLine="MCode.TourVisitSW=Checked";
mostCurrent._mcode._tourvisitsw /*boolean*/  = _checked;
RDebugUtils.currentLine=25427970;
 //BA.debugLineNum = 25427970;BA.debugLine="LoadAshkhas";
_loadashkhas();
RDebugUtils.currentLine=25427971;
 //BA.debugLineNum = 25427971;BA.debugLine="End Sub";
return "";
}
public static String  _swvisit_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="act_selectmantage";
if (Debug.shouldDelegate(mostCurrent.activityBA, "swvisit_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "swvisit_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=24510464;
 //BA.debugLineNum = 24510464;BA.debugLine="Sub SwVisit_CheckedChange(Checked As Boolean)";
RDebugUtils.currentLine=24510465;
 //BA.debugLineNum = 24510465;BA.debugLine="LoadAshkhas";
_loadashkhas();
RDebugUtils.currentLine=24510466;
 //BA.debugLineNum = 24510466;BA.debugLine="End Sub";
return "";
}
public static String  _t1_tick() throws Exception{
RDebugUtils.currentModule="act_selectmantage";
if (Debug.shouldDelegate(mostCurrent.activityBA, "t1_tick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "t1_tick", null));}
RDebugUtils.currentLine=24903680;
 //BA.debugLineNum = 24903680;BA.debugLine="Sub t1_tick";
RDebugUtils.currentLine=24903708;
 //BA.debugLineNum = 24903708;BA.debugLine="End Sub";
return "";
}
public static String  _txtsearch_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="act_selectmantage";
if (Debug.shouldDelegate(mostCurrent.activityBA, "txtsearch_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "txtsearch_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=24379392;
 //BA.debugLineNum = 24379392;BA.debugLine="Sub TxtSearch_TextChanged (Old As String, New As S";
RDebugUtils.currentLine=24379393;
 //BA.debugLineNum = 24379393;BA.debugLine="If TxtSearch.Text.StartsWith(\" \") Then";
if (mostCurrent._txtsearch.getText().startsWith(" ")) { 
RDebugUtils.currentLine=24379394;
 //BA.debugLineNum = 24379394;BA.debugLine="TxtSearch.Text=TxtSearch.Text.SubString(1)";
mostCurrent._txtsearch.setText(BA.ObjectToCharSequence(mostCurrent._txtsearch.getText().substring((int) (1))));
 };
RDebugUtils.currentLine=24379396;
 //BA.debugLineNum = 24379396;BA.debugLine="TxtSearch.SelectionStart=TxtSearch.Text.Length";
mostCurrent._txtsearch.setSelectionStart(mostCurrent._txtsearch.getText().length());
RDebugUtils.currentLine=24379398;
 //BA.debugLineNum = 24379398;BA.debugLine="LoadAshkhas";
_loadashkhas();
RDebugUtils.currentLine=24379399;
 //BA.debugLineNum = 24379399;BA.debugLine="End Sub";
return "";
}
public static String  _update_data() throws Exception{
RDebugUtils.currentModule="act_selectmantage";
if (Debug.shouldDelegate(mostCurrent.activityBA, "update_data", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "update_data", null));}
RDebugUtils.currentLine=22806528;
 //BA.debugLineNum = 22806528;BA.debugLine="Sub update_data";
RDebugUtils.currentLine=22806529;
 //BA.debugLineNum = 22806529;BA.debugLine="Try";
try {RDebugUtils.currentLine=22806530;
 //BA.debugLineNum = 22806530;BA.debugLine="If MCode.IsConnected Then";
if (mostCurrent._mcode._isconnected /*boolean*/ (mostCurrent.activityBA)) { 
RDebugUtils.currentLine=22806532;
 //BA.debugLineNum = 22806532;BA.debugLine="FirebaseMessaging.mode=\"GetGoroohAshkhas\"";
mostCurrent._firebasemessaging._mode /*String*/  = "GetGoroohAshkhas";
RDebugUtils.currentLine=22806533;
 //BA.debugLineNum = 22806533;BA.debugLine="StartService(FirebaseMessaging)";
anywheresoftware.b4a.keywords.Common.StartService(processBA,(Object)(mostCurrent._firebasemessaging.getObject()));
 }else {
RDebugUtils.currentLine=22806535;
 //BA.debugLineNum = 22806535;BA.debugLine="LoadAshkhas";
_loadashkhas();
 };
 } 
       catch (Exception e9) {
			processBA.setLastException(e9);RDebugUtils.currentLine=22806538;
 //BA.debugLineNum = 22806538;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("522806538",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=22806539;
 //BA.debugLineNum = 22806539;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-update_data");
 };
RDebugUtils.currentLine=22806541;
 //BA.debugLineNum = 22806541;BA.debugLine="End Sub";
return "";
}
}