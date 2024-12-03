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

public class act_mali extends Activity implements B4AActivity{
	public static act_mali mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.act_mali");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (act_mali).");
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
		activityBA = new BA(this, layout, processBA, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.act_mali");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "ir.parsikhesab.pakhsh.act_mali", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (act_mali) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (act_mali) Resume **");
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
		return act_mali.class;
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
            BA.LogInfo("** Activity (act_mali) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (act_mali) Pause event (activity is not paused). **");
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
            act_mali mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (act_mali) Resume **");
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
public static Object _ion = null;
public static String _shomarefactor = "";
public static String _codemoshtari = "";
public static String _namemoshtari = "";
public static String _shomaretell = "";
public static String _mabalghghablepardakht = "";
public static String _mabalghkolfactor = "";
public static String _shomarehavale = "";
public static boolean _issend = false;
public hitex.nice.spinner.Hitex_NiceSpinner _nsn_bankd = null;
public hitex.nice.spinner.Hitex_NiceSpinner _nsn_sandooghd = null;
public wir.hitex.recycler.Hitex_LayoutView _hlv = null;
public anywheresoftware.b4a.objects.IME _key = null;
public static int _err = 0;
public static String _datecheck = "";
public anywheresoftware.b4a.objects.EditTextWrapper _txtshomarecheckd = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btndatecheckd = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnsaved = null;
public static boolean _txtchanged = false;
public anywheresoftware.b4a.objects.collections.List _listtarakonesh = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblshomarecheckd = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbldatecheckd = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbln_bankd = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlndaryaft = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnl_hlv = null;
public static String _lastmablag = "";
public anywheresoftware.b4a.objects.LabelWrapper _lbldaryaft = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlnsandoogh = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtmablaghnaghdi = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblshomaredaryaft = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblshomarefactor = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblghabelepardakht = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlnaghdi = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlbanki = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlchecki = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtsharhnaghdi = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblsharhnaghdi = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblnsandoogh = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblmablaghnaghdi = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblnbank = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtsharhbanki = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblsharhbanki = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtmablaghchecki = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtsharhchecki = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtdarsadtakhfif = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtmablaghtakhfif = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtsharhtakhfif = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblsharhtakhfif = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblmablaghtakhfif = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbldarsadtakhfif = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblmablaghchecki = null;
public anywheresoftware.b4a.objects.PanelWrapper _btnrizchecki = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblsharhchecki = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtmablaghbanki = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlnbank = null;
public static int _c1 = 0;
public static int _c2 = 0;
public static int _c3 = 0;
public static int _c4 = 0;
public static long _mablaghdaryafti = 0L;
public static long _mablaghtakhfif = 0L;
public static String _query = "";
public static String _daryaftmode = "";
public static int _shomarhdaryafti = 0;
public static int _radif = 0;
public static int _countdaryaft = 0;
public static int _countradif = 0;
public anywheresoftware.b4a.objects.collections.List _lstcodesandogh = null;
public static String _codesandogh = "";
public static String _namesandogh = "";
public anywheresoftware.b4a.objects.collections.List _lstcodebank1 = null;
public static String _codebank1 = "";
public static String _namebank1 = "";
public anywheresoftware.b4a.objects.TabHostWrapper _tab1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnltakhfif = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblmablaghkoldaryafti = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblmablaghmande = null;
public static String _id1 = "";
public static String _id2 = "";
public static String _id3 = "";
public static String _id4 = "";
public anywheresoftware.b4a.objects.LabelWrapper _lblcodemoshtari = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblnamemoshtari = null;
public anywheresoftware.b4a.objects.collections.List _lstcheck = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblmablaghkolfactor = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblmablaghkoltakhfif = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_delete = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_sendinfo = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_print = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtsharhkol = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnnew = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnbacktrack = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnnexttrack = null;
public anywheresoftware.b4a.objects.collections.List _listdaryaft = null;
public static int _current = 0;
public static boolean _isnew = false;
public anywheresoftware.b4a.objects.PanelWrapper _btnpaymentcard = null;
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
RDebugUtils.currentModule="act_mali";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
anywheresoftware.b4a.objects.drawable.ColorDrawable _op = null;
RDebugUtils.currentLine=45875200;
 //BA.debugLineNum = 45875200;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=45875201;
 //BA.debugLineNum = 45875201;BA.debugLine="Activity.LoadLayout(\"L_Mali\")";
mostCurrent._activity.LoadLayout("L_Mali",mostCurrent.activityBA);
RDebugUtils.currentLine=45875202;
 //BA.debugLineNum = 45875202;BA.debugLine="Try";
try {RDebugUtils.currentLine=45875204;
 //BA.debugLineNum = 45875204;BA.debugLine="Tab1.AddTab(\"نقدی\",\"l_Daryaftnaghdi\")";
mostCurrent._tab1.AddTab(mostCurrent.activityBA,"نقدی","l_Daryaftnaghdi");
RDebugUtils.currentLine=45875205;
 //BA.debugLineNum = 45875205;BA.debugLine="Tab1.AddTab(\"بانکی\",\"l_Daryaftbanki\")";
mostCurrent._tab1.AddTab(mostCurrent.activityBA,"بانکی","l_Daryaftbanki");
RDebugUtils.currentLine=45875206;
 //BA.debugLineNum = 45875206;BA.debugLine="Tab1.AddTab(\"چکی\",\"l_Daryaftchecki\")";
mostCurrent._tab1.AddTab(mostCurrent.activityBA,"چکی","l_Daryaftchecki");
RDebugUtils.currentLine=45875207;
 //BA.debugLineNum = 45875207;BA.debugLine="Tab1.AddTab(\"تخفیف\",\"l_DaryaftTakhfif\")";
mostCurrent._tab1.AddTab(mostCurrent.activityBA,"تخفیف","l_DaryaftTakhfif");
RDebugUtils.currentLine=45875209;
 //BA.debugLineNum = 45875209;BA.debugLine="Btn_SendInfo.Enabled=False";
mostCurrent._btn_sendinfo.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=45875210;
 //BA.debugLineNum = 45875210;BA.debugLine="NSN_BankD.Initialize(\"NSN_BankD\",True,False)";
mostCurrent._nsn_bankd.Initialize(mostCurrent.activityBA,"NSN_BankD",anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=45875211;
 //BA.debugLineNum = 45875211;BA.debugLine="PnlNBank.AddView(NSN_BankD,0,0,PnlNBank.Width,Pn";
mostCurrent._pnlnbank.AddView((android.view.View)(mostCurrent._nsn_bankd.getObject()),(int) (0),(int) (0),mostCurrent._pnlnbank.getWidth(),mostCurrent._pnlnbank.getHeight());
RDebugUtils.currentLine=45875212;
 //BA.debugLineNum = 45875212;BA.debugLine="NSN_BankD.TextColor = Colors.RGB(192,53,38)";
mostCurrent._nsn_bankd.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (192),(int) (53),(int) (38)));
RDebugUtils.currentLine=45875213;
 //BA.debugLineNum = 45875213;BA.debugLine="NSN_BankD.Gravity = Gravity.CENTER";
mostCurrent._nsn_bankd.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER);
RDebugUtils.currentLine=45875214;
 //BA.debugLineNum = 45875214;BA.debugLine="NSN_BankD.Typeface = Typeface.LoadFromAssets(\"p_";
mostCurrent._nsn_bankd.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("p_font.ttf"));
RDebugUtils.currentLine=45875215;
 //BA.debugLineNum = 45875215;BA.debugLine="Dim op As ColorDrawable";
_op = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=45875216;
 //BA.debugLineNum = 45875216;BA.debugLine="op.Initialize2(Colors.White,5dip,0dip,Colors.Bla";
_op.Initialize2(anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=45875217;
 //BA.debugLineNum = 45875217;BA.debugLine="NSN_BankD.Background=op";
mostCurrent._nsn_bankd.setBackground((android.graphics.drawable.Drawable)(_op.getObject()));
RDebugUtils.currentLine=45875219;
 //BA.debugLineNum = 45875219;BA.debugLine="NSN_SandooghD.Initialize(\"NSN_SandooghD\",True,Fa";
mostCurrent._nsn_sandooghd.Initialize(mostCurrent.activityBA,"NSN_SandooghD",anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=45875220;
 //BA.debugLineNum = 45875220;BA.debugLine="pnlNSandoogh.AddView(NSN_SandooghD,0,0,pnlNSando";
mostCurrent._pnlnsandoogh.AddView((android.view.View)(mostCurrent._nsn_sandooghd.getObject()),(int) (0),(int) (0),mostCurrent._pnlnsandoogh.getWidth(),mostCurrent._pnlnsandoogh.getHeight());
RDebugUtils.currentLine=45875221;
 //BA.debugLineNum = 45875221;BA.debugLine="NSN_SandooghD.TextColor = Colors.RGB(192,53,38)";
mostCurrent._nsn_sandooghd.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (192),(int) (53),(int) (38)));
RDebugUtils.currentLine=45875222;
 //BA.debugLineNum = 45875222;BA.debugLine="NSN_SandooghD.Gravity = Gravity.CENTER";
mostCurrent._nsn_sandooghd.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER);
RDebugUtils.currentLine=45875223;
 //BA.debugLineNum = 45875223;BA.debugLine="NSN_SandooghD.Typeface = Typeface.LoadFromAssets";
mostCurrent._nsn_sandooghd.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("p_font.ttf"));
RDebugUtils.currentLine=45875224;
 //BA.debugLineNum = 45875224;BA.debugLine="Dim op As ColorDrawable";
_op = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=45875225;
 //BA.debugLineNum = 45875225;BA.debugLine="op.Initialize2(Colors.White,5dip,0dip,Colors.Bla";
_op.Initialize2(anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=45875226;
 //BA.debugLineNum = 45875226;BA.debugLine="NSN_SandooghD.Background=op";
mostCurrent._nsn_sandooghd.setBackground((android.graphics.drawable.Drawable)(_op.getObject()));
RDebugUtils.currentLine=45875228;
 //BA.debugLineNum = 45875228;BA.debugLine="Key.Initialize(\"Key\")";
mostCurrent._key.Initialize("Key");
RDebugUtils.currentLine=45875229;
 //BA.debugLineNum = 45875229;BA.debugLine="Key.SetCustomFilter(TxtMablaghNaghdi,TxtMablaghN";
mostCurrent._key.SetCustomFilter((android.widget.EditText)(mostCurrent._txtmablaghnaghdi.getObject()),mostCurrent._txtmablaghnaghdi.INPUT_TYPE_NUMBERS,"0123456789");
RDebugUtils.currentLine=45875230;
 //BA.debugLineNum = 45875230;BA.debugLine="Key.SetCustomFilter(TxtMablaghBanki,TxtMablaghBa";
mostCurrent._key.SetCustomFilter((android.widget.EditText)(mostCurrent._txtmablaghbanki.getObject()),mostCurrent._txtmablaghbanki.INPUT_TYPE_NUMBERS,"0123456789");
RDebugUtils.currentLine=45875231;
 //BA.debugLineNum = 45875231;BA.debugLine="Key.SetCustomFilter(TxtMablaghChecki,TxtMablaghC";
mostCurrent._key.SetCustomFilter((android.widget.EditText)(mostCurrent._txtmablaghchecki.getObject()),mostCurrent._txtmablaghchecki.INPUT_TYPE_NUMBERS,"0123456789");
RDebugUtils.currentLine=45875232;
 //BA.debugLineNum = 45875232;BA.debugLine="Key.SetCustomFilter(TxtMablaghTakhfif,TxtMablagh";
mostCurrent._key.SetCustomFilter((android.widget.EditText)(mostCurrent._txtmablaghtakhfif.getObject()),mostCurrent._txtmablaghtakhfif.INPUT_TYPE_NUMBERS,"0123456789");
RDebugUtils.currentLine=45875233;
 //BA.debugLineNum = 45875233;BA.debugLine="Key.SetCustomFilter(TxtDarsadTakhfif,TxtDarsadTa";
mostCurrent._key.SetCustomFilter((android.widget.EditText)(mostCurrent._txtdarsadtakhfif.getObject()),mostCurrent._txtdarsadtakhfif.INPUT_TYPE_NUMBERS,"0123456789");
RDebugUtils.currentLine=45875238;
 //BA.debugLineNum = 45875238;BA.debugLine="ListDaryaft.Initialize";
mostCurrent._listdaryaft.Initialize();
RDebugUtils.currentLine=45875239;
 //BA.debugLineNum = 45875239;BA.debugLine="lstCodeSandogh.Initialize";
mostCurrent._lstcodesandogh.Initialize();
RDebugUtils.currentLine=45875240;
 //BA.debugLineNum = 45875240;BA.debugLine="lstCodeBank1.Initialize";
mostCurrent._lstcodebank1.Initialize();
RDebugUtils.currentLine=45875241;
 //BA.debugLineNum = 45875241;BA.debugLine="lstCheck.Initialize";
mostCurrent._lstcheck.Initialize();
RDebugUtils.currentLine=45875245;
 //BA.debugLineNum = 45875245;BA.debugLine="lblShomareFactor.Text=ShomareFactor";
mostCurrent._lblshomarefactor.setText(BA.ObjectToCharSequence(_shomarefactor));
RDebugUtils.currentLine=45875246;
 //BA.debugLineNum = 45875246;BA.debugLine="lblCodeMoshtari.Text=MCode.C_Tafzili";
mostCurrent._lblcodemoshtari.setText(BA.ObjectToCharSequence(mostCurrent._mcode._c_tafzili /*String*/ ));
RDebugUtils.currentLine=45875247;
 //BA.debugLineNum = 45875247;BA.debugLine="lblNameMoshtari.Text=MCode.N_Tafzili";
mostCurrent._lblnamemoshtari.setText(BA.ObjectToCharSequence(mostCurrent._mcode._n_tafzili /*String*/ ));
RDebugUtils.currentLine=45875248;
 //BA.debugLineNum = 45875248;BA.debugLine="MabalghKolFactor=MabalghGhablepardakht";
_mabalghkolfactor = _mabalghghablepardakht;
RDebugUtils.currentLine=45875249;
 //BA.debugLineNum = 45875249;BA.debugLine="LblMablaghKolFactor.Text=myCode.AdadToPrice(Maba";
mostCurrent._lblmablaghkolfactor.setText(BA.ObjectToCharSequence(mostCurrent._mycode._adadtoprice /*String*/ (mostCurrent.activityBA,_mabalghkolfactor)));
RDebugUtils.currentLine=45875250;
 //BA.debugLineNum = 45875250;BA.debugLine="LoadSp";
_loadsp();
 } 
       catch (Exception e41) {
			processBA.setLastException(e41);RDebugUtils.currentLine=45875252;
 //BA.debugLineNum = 45875252;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("545875252",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=45875253;
 //BA.debugLineNum = 45875253;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-Activity_Create");
 };
RDebugUtils.currentLine=45875255;
 //BA.debugLineNum = 45875255;BA.debugLine="End Sub";
return "";
}
public static String  _loadsp() throws Exception{
RDebugUtils.currentModule="act_mali";
if (Debug.shouldDelegate(mostCurrent.activityBA, "loadsp", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "loadsp", null));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cr = null;
int _i = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cr1 = null;
RDebugUtils.currentLine=45940736;
 //BA.debugLineNum = 45940736;BA.debugLine="Sub LoadSp";
RDebugUtils.currentLine=45940737;
 //BA.debugLineNum = 45940737;BA.debugLine="Try";
try {RDebugUtils.currentLine=45940738;
 //BA.debugLineNum = 45940738;BA.debugLine="Dim cr As Cursor=MCode.Result(\"Select * from Tbl";
_cr = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cr = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * from TblSandoogh");
RDebugUtils.currentLine=45940739;
 //BA.debugLineNum = 45940739;BA.debugLine="lstCodeSandogh.Clear";
mostCurrent._lstcodesandogh.Clear();
RDebugUtils.currentLine=45940740;
 //BA.debugLineNum = 45940740;BA.debugLine="For i=0 To cr.RowCount-1";
{
final int step4 = 1;
final int limit4 = (int) (_cr.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=45940741;
 //BA.debugLineNum = 45940741;BA.debugLine="cr.Position=i";
_cr.setPosition(_i);
RDebugUtils.currentLine=45940742;
 //BA.debugLineNum = 45940742;BA.debugLine="NSN_SandooghD.Add(cr.GetString(\"fldNameSandoogh";
mostCurrent._nsn_sandooghd.Add(_cr.GetString("fldNameSandoogh"));
RDebugUtils.currentLine=45940743;
 //BA.debugLineNum = 45940743;BA.debugLine="lstCodeSandogh.Add(cr.GetString(\"fldCodeSandoog";
mostCurrent._lstcodesandogh.Add((Object)(_cr.GetString("fldCodeSandoogh")));
 }
};
RDebugUtils.currentLine=45940746;
 //BA.debugLineNum = 45940746;BA.debugLine="Dim cr1 As Cursor=MCode.Result(\"Select * from Tb";
_cr1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cr1 = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * from TblBankMa");
RDebugUtils.currentLine=45940747;
 //BA.debugLineNum = 45940747;BA.debugLine="lstCodeBank1.Clear";
mostCurrent._lstcodebank1.Clear();
RDebugUtils.currentLine=45940748;
 //BA.debugLineNum = 45940748;BA.debugLine="For i=0 To cr1.RowCount-1";
{
final int step11 = 1;
final int limit11 = (int) (_cr1.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit11 ;_i = _i + step11 ) {
RDebugUtils.currentLine=45940749;
 //BA.debugLineNum = 45940749;BA.debugLine="cr1.Position=i";
_cr1.setPosition(_i);
RDebugUtils.currentLine=45940750;
 //BA.debugLineNum = 45940750;BA.debugLine="NSN_BankD.Add(cr1.GetString(\"fldNameBank\"))";
mostCurrent._nsn_bankd.Add(_cr1.GetString("fldNameBank"));
RDebugUtils.currentLine=45940751;
 //BA.debugLineNum = 45940751;BA.debugLine="lstCodeBank1.Add(cr1.GetString(\"fldCodeBank\"))";
mostCurrent._lstcodebank1.Add((Object)(_cr1.GetString("fldCodeBank")));
 }
};
RDebugUtils.currentLine=45940753;
 //BA.debugLineNum = 45940753;BA.debugLine="If MCode.PrinterType=1 Then";
if (mostCurrent._mcode._printertype /*int*/ ==1) { 
RDebugUtils.currentLine=45940754;
 //BA.debugLineNum = 45940754;BA.debugLine="btnPaymentCard.Visible=True";
mostCurrent._btnpaymentcard.setVisible(anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=45940758;
 //BA.debugLineNum = 45940758;BA.debugLine="NSN_SandooghD.Show(Colors.Black, 16)";
mostCurrent._nsn_sandooghd.Show(anywheresoftware.b4a.keywords.Common.Colors.Black,(float) (16));
RDebugUtils.currentLine=45940759;
 //BA.debugLineNum = 45940759;BA.debugLine="NSN_BankD.Show(Colors.Black, 16)";
mostCurrent._nsn_bankd.Show(anywheresoftware.b4a.keywords.Common.Colors.Black,(float) (16));
RDebugUtils.currentLine=45940761;
 //BA.debugLineNum = 45940761;BA.debugLine="CodeSandogh=lstCodeSandogh.Get(0)";
mostCurrent._codesandogh = BA.ObjectToString(mostCurrent._lstcodesandogh.Get((int) (0)));
RDebugUtils.currentLine=45940762;
 //BA.debugLineNum = 45940762;BA.debugLine="NameSandogh=NSN_SandooghD.Text";
mostCurrent._namesandogh = mostCurrent._nsn_sandooghd.getText();
RDebugUtils.currentLine=45940763;
 //BA.debugLineNum = 45940763;BA.debugLine="Log(CodeSandogh)";
anywheresoftware.b4a.keywords.Common.LogImpl("545940763",mostCurrent._codesandogh,0);
RDebugUtils.currentLine=45940764;
 //BA.debugLineNum = 45940764;BA.debugLine="Log(NameSandogh)";
anywheresoftware.b4a.keywords.Common.LogImpl("545940764",mostCurrent._namesandogh,0);
RDebugUtils.currentLine=45940766;
 //BA.debugLineNum = 45940766;BA.debugLine="CodeBank1=lstCodeBank1.Get(0)";
mostCurrent._codebank1 = BA.ObjectToString(mostCurrent._lstcodebank1.Get((int) (0)));
RDebugUtils.currentLine=45940767;
 //BA.debugLineNum = 45940767;BA.debugLine="NameBank1=NSN_BankD.Text";
mostCurrent._namebank1 = mostCurrent._nsn_bankd.getText();
RDebugUtils.currentLine=45940768;
 //BA.debugLineNum = 45940768;BA.debugLine="Log(CodeBank1)";
anywheresoftware.b4a.keywords.Common.LogImpl("545940768",mostCurrent._codebank1,0);
RDebugUtils.currentLine=45940769;
 //BA.debugLineNum = 45940769;BA.debugLine="Log(NameBank1)";
anywheresoftware.b4a.keywords.Common.LogImpl("545940769",mostCurrent._namebank1,0);
RDebugUtils.currentLine=45940773;
 //BA.debugLineNum = 45940773;BA.debugLine="btnNew_Click";
_btnnew_click();
 } 
       catch (Exception e31) {
			processBA.setLastException(e31);RDebugUtils.currentLine=45940775;
 //BA.debugLineNum = 45940775;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("545940775",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=45940776;
 //BA.debugLineNum = 45940776;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-LoadSp");
 };
RDebugUtils.currentLine=45940778;
 //BA.debugLineNum = 45940778;BA.debugLine="End Sub";
return "";
}
public static boolean  _activity_keypress(int _keycode) throws Exception{
RDebugUtils.currentModule="act_mali";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_keypress", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "activity_keypress", new Object[] {_keycode}));}
RDebugUtils.currentLine=46399488;
 //BA.debugLineNum = 46399488;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
RDebugUtils.currentLine=46399489;
 //BA.debugLineNum = 46399489;BA.debugLine="If KeyCode=KeyCodes.KEYCODE_BACK Then";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK) { 
RDebugUtils.currentLine=46399490;
 //BA.debugLineNum = 46399490;BA.debugLine="Key.HideKeyboard";
mostCurrent._key.HideKeyboard(mostCurrent.activityBA);
RDebugUtils.currentLine=46399491;
 //BA.debugLineNum = 46399491;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 };
RDebugUtils.currentLine=46399493;
 //BA.debugLineNum = 46399493;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=46399494;
 //BA.debugLineNum = 46399494;BA.debugLine="End Sub";
return false;
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="act_mali";
RDebugUtils.currentLine=46530560;
 //BA.debugLineNum = 46530560;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=46530561;
 //BA.debugLineNum = 46530561;BA.debugLine="lblCodeMoshtari.Text=MCode.C_Tafzili";
mostCurrent._lblcodemoshtari.setText(BA.ObjectToCharSequence(mostCurrent._mcode._c_tafzili /*String*/ ));
RDebugUtils.currentLine=46530562;
 //BA.debugLineNum = 46530562;BA.debugLine="lblNameMoshtari.Text=MCode.N_Tafzili";
mostCurrent._lblnamemoshtari.setText(BA.ObjectToCharSequence(mostCurrent._mcode._n_tafzili /*String*/ ));
RDebugUtils.currentLine=46530563;
 //BA.debugLineNum = 46530563;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="act_mali";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=46465024;
 //BA.debugLineNum = 46465024;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=46465025;
 //BA.debugLineNum = 46465025;BA.debugLine="lblCodeMoshtari.Text=MCode.C_Tafzili";
mostCurrent._lblcodemoshtari.setText(BA.ObjectToCharSequence(mostCurrent._mcode._c_tafzili /*String*/ ));
RDebugUtils.currentLine=46465026;
 //BA.debugLineNum = 46465026;BA.debugLine="lblNameMoshtari.Text=MCode.N_Tafzili";
mostCurrent._lblnamemoshtari.setText(BA.ObjectToCharSequence(mostCurrent._mcode._n_tafzili /*String*/ ));
RDebugUtils.currentLine=46465027;
 //BA.debugLineNum = 46465027;BA.debugLine="End Sub";
return "";
}
public static boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
RDebugUtils.currentModule="act_mali";
if (Debug.shouldDelegate(mostCurrent.activityBA, "application_error", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "application_error", new Object[] {_error,_stacktrace}));}
RDebugUtils.currentLine=47448064;
 //BA.debugLineNum = 47448064;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
RDebugUtils.currentLine=47448066;
 //BA.debugLineNum = 47448066;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=47448067;
 //BA.debugLineNum = 47448067;BA.debugLine="End Sub";
return false;
}
public static String  _btn_back_click() throws Exception{
RDebugUtils.currentModule="act_mali";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_back_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_back_click", null));}
RDebugUtils.currentLine=46727168;
 //BA.debugLineNum = 46727168;BA.debugLine="Sub btn_Back_Click";
RDebugUtils.currentLine=46727169;
 //BA.debugLineNum = 46727169;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=46727170;
 //BA.debugLineNum = 46727170;BA.debugLine="End Sub";
return "";
}
public static String  _btn_delete_click() throws Exception{
RDebugUtils.currentModule="act_mali";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_delete_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_delete_click", null));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
int _result = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu2 = null;
RDebugUtils.currentLine=47120384;
 //BA.debugLineNum = 47120384;BA.debugLine="Private Sub Btn_Delete_Click";
RDebugUtils.currentLine=47120385;
 //BA.debugLineNum = 47120385;BA.debugLine="Try";
try {RDebugUtils.currentLine=47120386;
 //BA.debugLineNum = 47120386;BA.debugLine="Query=\"SELECT * from TblDaryaft where fldShomare";
mostCurrent._query = "SELECT * from TblDaryaft where fldShomareDaryaft="+mostCurrent._lblshomaredaryaft.getText();
RDebugUtils.currentLine=47120387;
 //BA.debugLineNum = 47120387;BA.debugLine="Dim cu As Cursor=MCode.Result(Query)";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,mostCurrent._query);
RDebugUtils.currentLine=47120388;
 //BA.debugLineNum = 47120388;BA.debugLine="If cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=47120389;
 //BA.debugLineNum = 47120389;BA.debugLine="Dim result As Int";
_result = 0;
RDebugUtils.currentLine=47120390;
 //BA.debugLineNum = 47120390;BA.debugLine="result = Msgbox2(\"آیا از حذف اطلاعات دریافتی اط";
_result = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("آیا از حذف اطلاعات دریافتی اطمینان دارید؟"),BA.ObjectToCharSequence("حذف دریافتی"),"بله","","خیر",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"icon.png").getObject()),mostCurrent.activityBA);
RDebugUtils.currentLine=47120391;
 //BA.debugLineNum = 47120391;BA.debugLine="If result = DialogResponse.Positive Then";
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=47120392;
 //BA.debugLineNum = 47120392;BA.debugLine="Query=\"SELECT * from TblCheckDaryafti where fl";
mostCurrent._query = "SELECT * from TblCheckDaryafti where fldShomareDaryaft="+mostCurrent._lblshomaredaryaft.getText();
RDebugUtils.currentLine=47120393;
 //BA.debugLineNum = 47120393;BA.debugLine="Dim cu2 As Cursor=MCode.Result(Query)";
_cu2 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu2 = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,mostCurrent._query);
RDebugUtils.currentLine=47120394;
 //BA.debugLineNum = 47120394;BA.debugLine="If cu2.RowCount>0 Then";
if (_cu2.getRowCount()>0) { 
RDebugUtils.currentLine=47120395;
 //BA.debugLineNum = 47120395;BA.debugLine="Query=\"Delete From TblCheckDaryafti where fld";
mostCurrent._query = "Delete From TblCheckDaryafti where fldShomareDaryaft="+mostCurrent._lblshomaredaryaft.getText();
RDebugUtils.currentLine=47120396;
 //BA.debugLineNum = 47120396;BA.debugLine="MCode.SaveUpdate(Query)";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,mostCurrent._query);
 };
RDebugUtils.currentLine=47120398;
 //BA.debugLineNum = 47120398;BA.debugLine="Query=\"Delete From TblDaryaft where fldShomare";
mostCurrent._query = "Delete From TblDaryaft where fldShomareDaryaft="+mostCurrent._lblshomaredaryaft.getText();
RDebugUtils.currentLine=47120399;
 //BA.debugLineNum = 47120399;BA.debugLine="MCode.SaveUpdate(Query)";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,mostCurrent._query);
RDebugUtils.currentLine=47120400;
 //BA.debugLineNum = 47120400;BA.debugLine="btnNew_Click";
_btnnew_click();
RDebugUtils.currentLine=47120401;
 //BA.debugLineNum = 47120401;BA.debugLine="GetSum";
_getsum();
 };
 }else {
RDebugUtils.currentLine=47120405;
 //BA.debugLineNum = 47120405;BA.debugLine="ToastMessageShow(\"اطلاعاتی جهت حذف وجود ندارد\",";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("اطلاعاتی جهت حذف وجود ندارد"),anywheresoftware.b4a.keywords.Common.False);
 };
 } 
       catch (Exception e23) {
			processBA.setLastException(e23);RDebugUtils.currentLine=47120408;
 //BA.debugLineNum = 47120408;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("547120408",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=47120409;
 //BA.debugLineNum = 47120409;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-Btn_Delete_Click");
 };
RDebugUtils.currentLine=47120411;
 //BA.debugLineNum = 47120411;BA.debugLine="End Sub";
return "";
}
public static String  _btnnew_click() throws Exception{
RDebugUtils.currentModule="act_mali";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnnew_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnnew_click", null));}
RDebugUtils.currentLine=47251456;
 //BA.debugLineNum = 47251456;BA.debugLine="Private Sub btnNew_Click";
RDebugUtils.currentLine=47251457;
 //BA.debugLineNum = 47251457;BA.debugLine="BtnSaveD.Enabled=True";
mostCurrent._btnsaved.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=47251458;
 //BA.debugLineNum = 47251458;BA.debugLine="LoadDaryaft(0)";
_loaddaryaft(BA.NumberToString(0));
RDebugUtils.currentLine=47251459;
 //BA.debugLineNum = 47251459;BA.debugLine="End Sub";
return "";
}
public static String  _getsum() throws Exception{
RDebugUtils.currentModule="act_mali";
if (Debug.shouldDelegate(mostCurrent.activityBA, "getsum", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "getsum", null));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
String _sum = "";
String _sumtakhfif = "";
int _i = 0;
String _mande = "";
RDebugUtils.currentLine=46268416;
 //BA.debugLineNum = 46268416;BA.debugLine="Sub GetSum";
RDebugUtils.currentLine=46268417;
 //BA.debugLineNum = 46268417;BA.debugLine="Try";
try {RDebugUtils.currentLine=46268418;
 //BA.debugLineNum = 46268418;BA.debugLine="Query=\"SELECT * from TblDaryaft where  fldShomar";
mostCurrent._query = "SELECT * from TblDaryaft where  fldShomareFactor="+_shomarefactor;
RDebugUtils.currentLine=46268419;
 //BA.debugLineNum = 46268419;BA.debugLine="If ShomareFactor=0 Then";
if ((_shomarefactor).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=46268421;
 //BA.debugLineNum = 46268421;BA.debugLine="Query=\"SELECT * from TblDaryaft where  fldShoma";
mostCurrent._query = "SELECT * from TblDaryaft where  fldShomareFactor=0 and fldCodeTafzili='"+mostCurrent._lblcodemoshtari.getText()+"'";
 };
RDebugUtils.currentLine=46268423;
 //BA.debugLineNum = 46268423;BA.debugLine="Dim cu As Cursor=MCode.Result(Query)";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,mostCurrent._query);
RDebugUtils.currentLine=46268425;
 //BA.debugLineNum = 46268425;BA.debugLine="If cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=46268427;
 //BA.debugLineNum = 46268427;BA.debugLine="Dim sum As String=0";
_sum = BA.NumberToString(0);
RDebugUtils.currentLine=46268428;
 //BA.debugLineNum = 46268428;BA.debugLine="Dim sumTakhfif As String=0";
_sumtakhfif = BA.NumberToString(0);
RDebugUtils.currentLine=46268429;
 //BA.debugLineNum = 46268429;BA.debugLine="For i=0 To cu.RowCount-1";
{
final int step10 = 1;
final int limit10 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit10 ;_i = _i + step10 ) {
RDebugUtils.currentLine=46268430;
 //BA.debugLineNum = 46268430;BA.debugLine="cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=46268431;
 //BA.debugLineNum = 46268431;BA.debugLine="If cu.GetString(\"fldType\")=0 Then";
if ((_cu.GetString("fldType")).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=46268432;
 //BA.debugLineNum = 46268432;BA.debugLine="sum=sum+cu.GetString(\"fldMablaghDaryafti\")";
_sum = BA.NumberToString((double)(Double.parseDouble(_sum))+(double)(Double.parseDouble(_cu.GetString("fldMablaghDaryafti"))));
 }else 
{RDebugUtils.currentLine=46268433;
 //BA.debugLineNum = 46268433;BA.debugLine="Else if cu.GetString(\"fldType\")=1 Then";
if ((_cu.GetString("fldType")).equals(BA.NumberToString(1))) { 
RDebugUtils.currentLine=46268434;
 //BA.debugLineNum = 46268434;BA.debugLine="sum=sum+cu.GetString(\"fldMablaghDaryafti\")";
_sum = BA.NumberToString((double)(Double.parseDouble(_sum))+(double)(Double.parseDouble(_cu.GetString("fldMablaghDaryafti"))));
 }else 
{RDebugUtils.currentLine=46268435;
 //BA.debugLineNum = 46268435;BA.debugLine="Else if cu.GetString(\"fldType\")=2 Then";
if ((_cu.GetString("fldType")).equals(BA.NumberToString(2))) { 
RDebugUtils.currentLine=46268436;
 //BA.debugLineNum = 46268436;BA.debugLine="sum=sum+cu.GetString(\"fldMablaghDaryafti\")";
_sum = BA.NumberToString((double)(Double.parseDouble(_sum))+(double)(Double.parseDouble(_cu.GetString("fldMablaghDaryafti"))));
 }else 
{RDebugUtils.currentLine=46268437;
 //BA.debugLineNum = 46268437;BA.debugLine="Else if cu.GetString(\"fldType\")=3 Then";
if ((_cu.GetString("fldType")).equals(BA.NumberToString(3))) { 
RDebugUtils.currentLine=46268438;
 //BA.debugLineNum = 46268438;BA.debugLine="MablaghTakhfif= cu.GetString(\"FldMablaghTakhf";
_mablaghtakhfif = (long)(Double.parseDouble(_cu.GetString("FldMablaghTakhfif")));
RDebugUtils.currentLine=46268439;
 //BA.debugLineNum = 46268439;BA.debugLine="sumTakhfif=sumTakhfif+MablaghTakhfif";
_sumtakhfif = BA.NumberToString((double)(Double.parseDouble(_sumtakhfif))+_mablaghtakhfif);
 }}}}
;
 }
};
RDebugUtils.currentLine=46268443;
 //BA.debugLineNum = 46268443;BA.debugLine="LblMablaghKolTakhfif.Text=myCode.AdadToPrice(su";
mostCurrent._lblmablaghkoltakhfif.setText(BA.ObjectToCharSequence(mostCurrent._mycode._adadtoprice /*String*/ (mostCurrent.activityBA,_sumtakhfif)));
RDebugUtils.currentLine=46268444;
 //BA.debugLineNum = 46268444;BA.debugLine="MabalghGhablepardakht=MabalghKolFactor-sumTakhf";
_mabalghghablepardakht = BA.NumberToString((double)(Double.parseDouble(_mabalghkolfactor))-(double)(Double.parseDouble(_sumtakhfif)));
RDebugUtils.currentLine=46268445;
 //BA.debugLineNum = 46268445;BA.debugLine="LblGHabelePardakht.Text=myCode.AdadToPrice(Maba";
mostCurrent._lblghabelepardakht.setText(BA.ObjectToCharSequence(mostCurrent._mycode._adadtoprice /*String*/ (mostCurrent.activityBA,_mabalghghablepardakht)));
RDebugUtils.currentLine=46268446;
 //BA.debugLineNum = 46268446;BA.debugLine="lblMablaghKolDaryafti.Text=myCode.AdadToPrice(s";
mostCurrent._lblmablaghkoldaryafti.setText(BA.ObjectToCharSequence(mostCurrent._mycode._adadtoprice /*String*/ (mostCurrent.activityBA,_sum)));
RDebugUtils.currentLine=46268447;
 //BA.debugLineNum = 46268447;BA.debugLine="If lblShomareFactor.Text=0 Then";
if ((mostCurrent._lblshomarefactor.getText()).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=46268448;
 //BA.debugLineNum = 46268448;BA.debugLine="lblMablaghMande.Text=myCode.AdadToPrice(Mabalg";
mostCurrent._lblmablaghmande.setText(BA.ObjectToCharSequence(mostCurrent._mycode._adadtoprice /*String*/ (mostCurrent.activityBA,_mabalghghablepardakht)));
 }else {
RDebugUtils.currentLine=46268450;
 //BA.debugLineNum = 46268450;BA.debugLine="Dim mande As String=MabalghGhablepardakht-sum";
_mande = BA.NumberToString((double)(Double.parseDouble(_mabalghghablepardakht))-(double)(Double.parseDouble(_sum)));
RDebugUtils.currentLine=46268451;
 //BA.debugLineNum = 46268451;BA.debugLine="lblMablaghMande.Text=myCode.AdadToPrice(mande)";
mostCurrent._lblmablaghmande.setText(BA.ObjectToCharSequence(mostCurrent._mycode._adadtoprice /*String*/ (mostCurrent.activityBA,_mande)));
 };
 }else {
RDebugUtils.currentLine=46268454;
 //BA.debugLineNum = 46268454;BA.debugLine="LblGHabelePardakht.Text=0 &\" \"& MCode.VahedPool";
mostCurrent._lblghabelepardakht.setText(BA.ObjectToCharSequence(BA.NumberToString(0)+" "+mostCurrent._mcode._vahedpool /*String*/ ));
RDebugUtils.currentLine=46268455;
 //BA.debugLineNum = 46268455;BA.debugLine="lblMablaghKolDaryafti.Text=0 &\" \"& MCode.VahedP";
mostCurrent._lblmablaghkoldaryafti.setText(BA.ObjectToCharSequence(BA.NumberToString(0)+" "+mostCurrent._mcode._vahedpool /*String*/ ));
RDebugUtils.currentLine=46268456;
 //BA.debugLineNum = 46268456;BA.debugLine="LblMablaghKolTakhfif.Text=0 &\" \"& MCode.VahedPo";
mostCurrent._lblmablaghkoltakhfif.setText(BA.ObjectToCharSequence(BA.NumberToString(0)+" "+mostCurrent._mcode._vahedpool /*String*/ ));
RDebugUtils.currentLine=46268457;
 //BA.debugLineNum = 46268457;BA.debugLine="lblMablaghMande.Text=myCode.AdadToPrice(Mabalgh";
mostCurrent._lblmablaghmande.setText(BA.ObjectToCharSequence(mostCurrent._mycode._adadtoprice /*String*/ (mostCurrent.activityBA,_mabalghghablepardakht)));
 };
 } 
       catch (Exception e40) {
			processBA.setLastException(e40);RDebugUtils.currentLine=46268460;
 //BA.debugLineNum = 46268460;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("546268460",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=46268461;
 //BA.debugLineNum = 46268461;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-GetSum");
 };
RDebugUtils.currentLine=46268463;
 //BA.debugLineNum = 46268463;BA.debugLine="End Sub";
return "";
}
public static String  _btn_sendinfo_click() throws Exception{
RDebugUtils.currentModule="act_mali";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_sendinfo_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_sendinfo_click", null));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
String _dtdaryaft = "";
String _dtcheckdaryaft = "";
int _result = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu2 = null;
RDebugUtils.currentLine=47185920;
 //BA.debugLineNum = 47185920;BA.debugLine="Private Sub Btn_SendInfo_Click";
RDebugUtils.currentLine=47185921;
 //BA.debugLineNum = 47185921;BA.debugLine="Try";
try {RDebugUtils.currentLine=47185922;
 //BA.debugLineNum = 47185922;BA.debugLine="If MCode.IsConnected=False And MCode.ConnectionS";
if (mostCurrent._mcode._isconnected /*boolean*/ (mostCurrent.activityBA)==anywheresoftware.b4a.keywords.Common.False && (mostCurrent._mcode._connectionstatus /*String*/ ).equals(BA.NumberToString(1))) { 
RDebugUtils.currentLine=47185923;
 //BA.debugLineNum = 47185923;BA.debugLine="ToastMessageShow(\"لطفا ارتباط اینترنت گوشی خود";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("لطفا ارتباط اینترنت گوشی خود را بررسی نمایید"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=47185924;
 //BA.debugLineNum = 47185924;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=47185926;
 //BA.debugLineNum = 47185926;BA.debugLine="Query=\"SELECT fldShomareDaryaft,fldShomareHavale";
mostCurrent._query = "SELECT fldShomareDaryaft,fldShomareHavale,fldMablaghDaryafti,FldDarsadTakhfif as fldDarsadTakhfif"+",FldMablaghTakhfif as fldMablaghTakhfif,fldSharhKol,fldCodeTafzili,fldSharheTafzili,fldShomareTell,fldSharh,fldCodeVaste,fldCodeSandoogh"+",fldCodeBank,FldDateDaryaft as fldDateDaryaft,fldType,fldShomareFactor from TblDaryaft where fldShomareDaryaft="+mostCurrent._lblshomaredaryaft.getText();
RDebugUtils.currentLine=47185929;
 //BA.debugLineNum = 47185929;BA.debugLine="Dim cu As Cursor=MCode.Result(Query)";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,mostCurrent._query);
RDebugUtils.currentLine=47185930;
 //BA.debugLineNum = 47185930;BA.debugLine="If cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=47185931;
 //BA.debugLineNum = 47185931;BA.debugLine="Dim dtDaryaft,dtCheckDaryaft As String";
_dtdaryaft = "";
_dtcheckdaryaft = "";
RDebugUtils.currentLine=47185932;
 //BA.debugLineNum = 47185932;BA.debugLine="Dim result As Int";
_result = 0;
RDebugUtils.currentLine=47185933;
 //BA.debugLineNum = 47185933;BA.debugLine="dtDaryaft=MCode.DtToJson(cu)";
_dtdaryaft = mostCurrent._mcode._dttojson /*String*/ (mostCurrent.activityBA,_cu);
RDebugUtils.currentLine=47185934;
 //BA.debugLineNum = 47185934;BA.debugLine="Query=\"SELECT fldShomareCheck,fldShomareHesab,f";
mostCurrent._query = "SELECT fldShomareCheck,fldShomareHesab,fldDate,fldDateSarResid,fldCodeBank,fldShobe,fldMablagh as fldMablaghDaryafti,fldCodeSahebeCheck as fldCodeTafzili,fldShomareDaryaft,fldSharh,fldCodeVaste from TblCheckDaryafti where fldShomareDaryaft="+mostCurrent._lblshomaredaryaft.getText();
RDebugUtils.currentLine=47185935;
 //BA.debugLineNum = 47185935;BA.debugLine="Dim cu2 As Cursor=MCode.Result(Query)";
_cu2 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu2 = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,mostCurrent._query);
RDebugUtils.currentLine=47185936;
 //BA.debugLineNum = 47185936;BA.debugLine="If cu2.RowCount>0 Then";
if (_cu2.getRowCount()>0) { 
RDebugUtils.currentLine=47185937;
 //BA.debugLineNum = 47185937;BA.debugLine="dtCheckDaryaft=MCode.DtToJson(cu2)";
_dtcheckdaryaft = mostCurrent._mcode._dttojson /*String*/ (mostCurrent.activityBA,_cu2);
 };
RDebugUtils.currentLine=47185939;
 //BA.debugLineNum = 47185939;BA.debugLine="result = Msgbox2(\"آیا از ارسال اطلاعات دریافتی";
_result = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("آیا از ارسال اطلاعات دریافتی اطمینان دارید؟"),BA.ObjectToCharSequence("ارسال دریافتی"),"بله","","خیر",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"icon.png").getObject()),mostCurrent.activityBA);
RDebugUtils.currentLine=47185940;
 //BA.debugLineNum = 47185940;BA.debugLine="If result = DialogResponse.Positive Then";
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=47185941;
 //BA.debugLineNum = 47185941;BA.debugLine="Service_Server.shomareFactorSelect=lblShomareF";
mostCurrent._service_server._shomarefactorselect /*int*/  = (int)(Double.parseDouble(mostCurrent._lblshomarefactor.getText()));
RDebugUtils.currentLine=47185942;
 //BA.debugLineNum = 47185942;BA.debugLine="CallSubDelayed3(Service_Server,\"LoadSendDaryaf";
anywheresoftware.b4a.keywords.Common.CallSubDelayed3(processBA,(Object)(mostCurrent._service_server.getObject()),"LoadSendDaryaft",(Object)(_dtdaryaft),(Object)(_dtcheckdaryaft));
 };
RDebugUtils.currentLine=47185944;
 //BA.debugLineNum = 47185944;BA.debugLine="Btn_SendInfo.Enabled=False";
mostCurrent._btn_sendinfo.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=47185945;
 //BA.debugLineNum = 47185945;BA.debugLine="Btn_Delete.Enabled=False";
mostCurrent._btn_delete.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=47185946;
 //BA.debugLineNum = 47185946;BA.debugLine="IsSend=True";
_issend = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=47185947;
 //BA.debugLineNum = 47185947;BA.debugLine="btnNew_Click";
_btnnew_click();
 }else {
RDebugUtils.currentLine=47185949;
 //BA.debugLineNum = 47185949;BA.debugLine="ToastMessageShow(\"اطلاعاتی جهت ارسال وجود ندارد";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("اطلاعاتی جهت ارسال وجود ندارد"),anywheresoftware.b4a.keywords.Common.False);
 };
 } 
       catch (Exception e30) {
			processBA.setLastException(e30);RDebugUtils.currentLine=47185952;
 //BA.debugLineNum = 47185952;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("547185952",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=47185953;
 //BA.debugLineNum = 47185953;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-Btn_SendInfo_Click");
 };
RDebugUtils.currentLine=47185955;
 //BA.debugLineNum = 47185955;BA.debugLine="End Sub";
return "";
}
public static String  _btnbacktrack_click() throws Exception{
RDebugUtils.currentModule="act_mali";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnbacktrack_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnbacktrack_click", null));}
int _shomare = 0;
RDebugUtils.currentLine=47316992;
 //BA.debugLineNum = 47316992;BA.debugLine="Private Sub btnBackTrack_Click";
RDebugUtils.currentLine=47316993;
 //BA.debugLineNum = 47316993;BA.debugLine="Try";
try {RDebugUtils.currentLine=47316994;
 //BA.debugLineNum = 47316994;BA.debugLine="If btnBackTrack.Enabled=True And Current>0 Then";
if (mostCurrent._btnbacktrack.getEnabled()==anywheresoftware.b4a.keywords.Common.True && _current>0) { 
RDebugUtils.currentLine=47316995;
 //BA.debugLineNum = 47316995;BA.debugLine="Dim shomare As Int=0";
_shomare = (int) (0);
RDebugUtils.currentLine=47316996;
 //BA.debugLineNum = 47316996;BA.debugLine="Current=Current-1";
_current = (int) (_current-1);
RDebugUtils.currentLine=47316997;
 //BA.debugLineNum = 47316997;BA.debugLine="shomare=ListDaryaft.Get(Current)";
_shomare = (int)(BA.ObjectToNumber(mostCurrent._listdaryaft.Get(_current)));
RDebugUtils.currentLine=47316999;
 //BA.debugLineNum = 47316999;BA.debugLine="LoadDaryaft(shomare)";
_loaddaryaft(BA.NumberToString(_shomare));
 };
 } 
       catch (Exception e9) {
			processBA.setLastException(e9);RDebugUtils.currentLine=47317002;
 //BA.debugLineNum = 47317002;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("547317002",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=47317003;
 //BA.debugLineNum = 47317003;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-btnBackTrack_Click");
 };
RDebugUtils.currentLine=47317005;
 //BA.debugLineNum = 47317005;BA.debugLine="End Sub";
return "";
}
public static String  _loaddaryaft(String _strshomaredaryaft) throws Exception{
RDebugUtils.currentModule="act_mali";
if (Debug.shouldDelegate(mostCurrent.activityBA, "loaddaryaft", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "loaddaryaft", new Object[] {_strshomaredaryaft}));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cukol = null;
int _maxshomaredaryaft = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
int _i = 0;
String _sum = "";
RDebugUtils.currentLine=46137344;
 //BA.debugLineNum = 46137344;BA.debugLine="Sub LoadDaryaft(strShomareDaryaft As String)";
RDebugUtils.currentLine=46137345;
 //BA.debugLineNum = 46137345;BA.debugLine="Try";
try {RDebugUtils.currentLine=46137346;
 //BA.debugLineNum = 46137346;BA.debugLine="lblCodeMoshtari.Text=MCode.C_Tafzili";
mostCurrent._lblcodemoshtari.setText(BA.ObjectToCharSequence(mostCurrent._mcode._c_tafzili /*String*/ ));
RDebugUtils.currentLine=46137347;
 //BA.debugLineNum = 46137347;BA.debugLine="lblNameMoshtari.Text=MCode.N_Tafzili";
mostCurrent._lblnamemoshtari.setText(BA.ObjectToCharSequence(mostCurrent._mcode._n_tafzili /*String*/ ));
RDebugUtils.currentLine=46137348;
 //BA.debugLineNum = 46137348;BA.debugLine="clearAllText";
_clearalltext();
RDebugUtils.currentLine=46137350;
 //BA.debugLineNum = 46137350;BA.debugLine="Dim cuKol As Cursor=MCode.Result(\"Select * from";
_cukol = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cukol = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * from TblDaryaft");
RDebugUtils.currentLine=46137351;
 //BA.debugLineNum = 46137351;BA.debugLine="If cuKol.RowCount=0 Then";
if (_cukol.getRowCount()==0) { 
RDebugUtils.currentLine=46137352;
 //BA.debugLineNum = 46137352;BA.debugLine="lblShomareDaryaft.Text=1";
mostCurrent._lblshomaredaryaft.setText(BA.ObjectToCharSequence(1));
RDebugUtils.currentLine=46137353;
 //BA.debugLineNum = 46137353;BA.debugLine="Btn_Delete.Enabled=False";
mostCurrent._btn_delete.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=46137354;
 //BA.debugLineNum = 46137354;BA.debugLine="Btn_SendInfo.Enabled=False";
mostCurrent._btn_sendinfo.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=46137355;
 //BA.debugLineNum = 46137355;BA.debugLine="btnBackTrack.Enabled=False";
mostCurrent._btnbacktrack.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=46137356;
 //BA.debugLineNum = 46137356;BA.debugLine="btnNextTrack.Enabled=False";
mostCurrent._btnnexttrack.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=46137357;
 //BA.debugLineNum = 46137357;BA.debugLine="IsSend=False";
_issend = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=46137358;
 //BA.debugLineNum = 46137358;BA.debugLine="GetSum";
_getsum();
 }else {
RDebugUtils.currentLine=46137361;
 //BA.debugLineNum = 46137361;BA.debugLine="If strShomareDaryaft=0 Then";
if ((_strshomaredaryaft).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=46137362;
 //BA.debugLineNum = 46137362;BA.debugLine="Dim MaxShomareDaryaft As Int=cuKol.RowCount'MC";
_maxshomaredaryaft = _cukol.getRowCount();
RDebugUtils.currentLine=46137363;
 //BA.debugLineNum = 46137363;BA.debugLine="lblShomareDaryaft.Text=MaxShomareDaryaft+1";
mostCurrent._lblshomaredaryaft.setText(BA.ObjectToCharSequence(_maxshomaredaryaft+1));
RDebugUtils.currentLine=46137364;
 //BA.debugLineNum = 46137364;BA.debugLine="Query=\"SELECT distinct  fldShomareDaryaft  fro";
mostCurrent._query = "SELECT distinct  fldShomareDaryaft  from TblDaryaft where fldShomareFactor="+_shomarefactor;
RDebugUtils.currentLine=46137365;
 //BA.debugLineNum = 46137365;BA.debugLine="If ShomareFactor=0 Then";
if ((_shomarefactor).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=46137366;
 //BA.debugLineNum = 46137366;BA.debugLine="Query=\"SELECT distinct  fldShomareDaryaft  fr";
mostCurrent._query = "SELECT distinct  fldShomareDaryaft  from TblDaryaft where fldShomareFactor=0 and fldCodeTafzili="+mostCurrent._lblcodemoshtari.getText();
 };
RDebugUtils.currentLine=46137369;
 //BA.debugLineNum = 46137369;BA.debugLine="Dim cu As Cursor=MCode.Result(Query)";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,mostCurrent._query);
RDebugUtils.currentLine=46137370;
 //BA.debugLineNum = 46137370;BA.debugLine="Current=cu.RowCount";
_current = _cu.getRowCount();
RDebugUtils.currentLine=46137371;
 //BA.debugLineNum = 46137371;BA.debugLine="ListDaryaft.Clear";
mostCurrent._listdaryaft.Clear();
RDebugUtils.currentLine=46137372;
 //BA.debugLineNum = 46137372;BA.debugLine="For i=0 To cu.RowCount-1";
{
final int step25 = 1;
final int limit25 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit25 ;_i = _i + step25 ) {
RDebugUtils.currentLine=46137373;
 //BA.debugLineNum = 46137373;BA.debugLine="cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=46137374;
 //BA.debugLineNum = 46137374;BA.debugLine="ListDaryaft.Add(cu.GetString(\"fldShomareDarya";
mostCurrent._listdaryaft.Add((Object)(_cu.GetString("fldShomareDaryaft")));
 }
};
RDebugUtils.currentLine=46137378;
 //BA.debugLineNum = 46137378;BA.debugLine="Btn_Delete.Enabled=False";
mostCurrent._btn_delete.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=46137379;
 //BA.debugLineNum = 46137379;BA.debugLine="Btn_SendInfo.Enabled=False";
mostCurrent._btn_sendinfo.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=46137380;
 //BA.debugLineNum = 46137380;BA.debugLine="IsSend=False";
_issend = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=46137398;
 //BA.debugLineNum = 46137398;BA.debugLine="If Current=0 Then";
if (_current==0) { 
RDebugUtils.currentLine=46137399;
 //BA.debugLineNum = 46137399;BA.debugLine="btnBackTrack.Enabled=False";
mostCurrent._btnbacktrack.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 }else {
RDebugUtils.currentLine=46137402;
 //BA.debugLineNum = 46137402;BA.debugLine="btnBackTrack.Enabled=True";
mostCurrent._btnbacktrack.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=46137405;
 //BA.debugLineNum = 46137405;BA.debugLine="If ListDaryaft.Size=Current Or ListDaryaft.Siz";
if (mostCurrent._listdaryaft.getSize()==_current || mostCurrent._listdaryaft.getSize()==1) { 
RDebugUtils.currentLine=46137406;
 //BA.debugLineNum = 46137406;BA.debugLine="btnNextTrack.Enabled=False";
mostCurrent._btnnexttrack.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 }else {
RDebugUtils.currentLine=46137408;
 //BA.debugLineNum = 46137408;BA.debugLine="btnNextTrack.Enabled=True";
mostCurrent._btnnexttrack.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=46137411;
 //BA.debugLineNum = 46137411;BA.debugLine="clearAllText";
_clearalltext();
RDebugUtils.currentLine=46137412;
 //BA.debugLineNum = 46137412;BA.debugLine="GetSum";
_getsum();
 }else {
RDebugUtils.currentLine=46137414;
 //BA.debugLineNum = 46137414;BA.debugLine="clearAllText";
_clearalltext();
RDebugUtils.currentLine=46137423;
 //BA.debugLineNum = 46137423;BA.debugLine="If Current=0 Then";
if (_current==0) { 
RDebugUtils.currentLine=46137424;
 //BA.debugLineNum = 46137424;BA.debugLine="btnBackTrack.Enabled=False";
mostCurrent._btnbacktrack.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 }else {
RDebugUtils.currentLine=46137427;
 //BA.debugLineNum = 46137427;BA.debugLine="btnBackTrack.Enabled=True";
mostCurrent._btnbacktrack.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=46137430;
 //BA.debugLineNum = 46137430;BA.debugLine="If ListDaryaft.Size=Current Or ListDaryaft.Siz";
if (mostCurrent._listdaryaft.getSize()==_current || mostCurrent._listdaryaft.getSize()==1) { 
RDebugUtils.currentLine=46137431;
 //BA.debugLineNum = 46137431;BA.debugLine="btnNextTrack.Enabled=False";
mostCurrent._btnnexttrack.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 }else {
RDebugUtils.currentLine=46137433;
 //BA.debugLineNum = 46137433;BA.debugLine="btnNextTrack.Enabled=True";
mostCurrent._btnnexttrack.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=46137436;
 //BA.debugLineNum = 46137436;BA.debugLine="Query=\"SELECT * from TblDaryaft where fldShoma";
mostCurrent._query = "SELECT * from TblDaryaft where fldShomareDaryaft="+_strshomaredaryaft+" and fldShomareFactor="+_shomarefactor;
RDebugUtils.currentLine=46137437;
 //BA.debugLineNum = 46137437;BA.debugLine="If ShomareFactor=0 Then";
if ((_shomarefactor).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=46137438;
 //BA.debugLineNum = 46137438;BA.debugLine="Query=\"SELECT * from TblDaryaft where fldShom";
mostCurrent._query = "SELECT * from TblDaryaft where fldShomareDaryaft="+_strshomaredaryaft+" and fldShomareFactor=0 and fldCodeTafzili="+mostCurrent._lblcodemoshtari.getText();
 };
RDebugUtils.currentLine=46137441;
 //BA.debugLineNum = 46137441;BA.debugLine="Dim cu As Cursor=MCode.Result(Query)";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,mostCurrent._query);
RDebugUtils.currentLine=46137442;
 //BA.debugLineNum = 46137442;BA.debugLine="If cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=46137444;
 //BA.debugLineNum = 46137444;BA.debugLine="Dim sum As String=0";
_sum = BA.NumberToString(0);
RDebugUtils.currentLine=46137445;
 //BA.debugLineNum = 46137445;BA.debugLine="For i=0 To cu.RowCount-1";
{
final int step63 = 1;
final int limit63 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit63 ;_i = _i + step63 ) {
RDebugUtils.currentLine=46137446;
 //BA.debugLineNum = 46137446;BA.debugLine="cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=46137447;
 //BA.debugLineNum = 46137447;BA.debugLine="If cu.GetString(\"fldSend\")=\"1\" Then";
if ((_cu.GetString("fldSend")).equals("1")) { 
RDebugUtils.currentLine=46137448;
 //BA.debugLineNum = 46137448;BA.debugLine="BtnSaveD.Enabled=False";
mostCurrent._btnsaved.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=46137449;
 //BA.debugLineNum = 46137449;BA.debugLine="Btn_SendInfo.Enabled=False";
mostCurrent._btn_sendinfo.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=46137450;
 //BA.debugLineNum = 46137450;BA.debugLine="Btn_Delete.Enabled=False";
mostCurrent._btn_delete.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=46137451;
 //BA.debugLineNum = 46137451;BA.debugLine="IsSend=True";
_issend = anywheresoftware.b4a.keywords.Common.True;
 }else {
RDebugUtils.currentLine=46137453;
 //BA.debugLineNum = 46137453;BA.debugLine="BtnSaveD.Enabled=True";
mostCurrent._btnsaved.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=46137454;
 //BA.debugLineNum = 46137454;BA.debugLine="Btn_SendInfo.Enabled=True";
mostCurrent._btn_sendinfo.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=46137455;
 //BA.debugLineNum = 46137455;BA.debugLine="Btn_Delete.Enabled=True";
mostCurrent._btn_delete.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=46137456;
 //BA.debugLineNum = 46137456;BA.debugLine="IsSend=False";
_issend = anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=46137460;
 //BA.debugLineNum = 46137460;BA.debugLine="lblShomareDaryaft.Text=strShomareDaryaft";
mostCurrent._lblshomaredaryaft.setText(BA.ObjectToCharSequence(_strshomaredaryaft));
RDebugUtils.currentLine=46137461;
 //BA.debugLineNum = 46137461;BA.debugLine="TxtSharhKol.Text=cu.GetString(\"fldSharhKol\")";
mostCurrent._txtsharhkol.setText(BA.ObjectToCharSequence(_cu.GetString("fldSharhKol")));
RDebugUtils.currentLine=46137462;
 //BA.debugLineNum = 46137462;BA.debugLine="If cu.GetString(\"fldType\")=0 Then";
if ((_cu.GetString("fldType")).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=46137464;
 //BA.debugLineNum = 46137464;BA.debugLine="TxtMablaghNaghdi.Text=NumberFormat2(cu.GetS";
mostCurrent._txtmablaghnaghdi.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.NumberFormat2((double)(Double.parseDouble(_cu.GetString("fldMablaghDaryafti"))),(int) (0),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.True)));
RDebugUtils.currentLine=46137465;
 //BA.debugLineNum = 46137465;BA.debugLine="TxtSharhNaghdi.Text=cu.GetString(\"fldSharh\"";
mostCurrent._txtsharhnaghdi.setText(BA.ObjectToCharSequence(_cu.GetString("fldSharh")));
RDebugUtils.currentLine=46137466;
 //BA.debugLineNum = 46137466;BA.debugLine="id1=cu.GetInt(\"ID\")";
mostCurrent._id1 = BA.NumberToString(_cu.GetInt("ID"));
RDebugUtils.currentLine=46137468;
 //BA.debugLineNum = 46137468;BA.debugLine="CodeSandogh=cu.GetString(\"fldCodeSandoogh\")";
mostCurrent._codesandogh = _cu.GetString("fldCodeSandoogh");
RDebugUtils.currentLine=46137469;
 //BA.debugLineNum = 46137469;BA.debugLine="Log(lstCodeSandogh.IndexOf(CodeSandogh))";
anywheresoftware.b4a.keywords.Common.LogImpl("546137469",BA.NumberToString(mostCurrent._lstcodesandogh.IndexOf((Object)(mostCurrent._codesandogh))),0);
RDebugUtils.currentLine=46137470;
 //BA.debugLineNum = 46137470;BA.debugLine="NSN_SandooghD.SelectedIndex=lstCodeSandogh.";
mostCurrent._nsn_sandooghd.setSelectedIndex(mostCurrent._lstcodesandogh.IndexOf((Object)(mostCurrent._codesandogh)));
 }else 
{RDebugUtils.currentLine=46137473;
 //BA.debugLineNum = 46137473;BA.debugLine="Else if cu.GetString(\"fldType\")=1 Then";
if ((_cu.GetString("fldType")).equals(BA.NumberToString(1))) { 
RDebugUtils.currentLine=46137475;
 //BA.debugLineNum = 46137475;BA.debugLine="TxtMablaghBanki.Text=NumberFormat2(cu.GetSt";
mostCurrent._txtmablaghbanki.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.NumberFormat2((double)(Double.parseDouble(_cu.GetString("fldMablaghDaryafti"))),(int) (0),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.True)));
RDebugUtils.currentLine=46137476;
 //BA.debugLineNum = 46137476;BA.debugLine="TxtSharhBanki.Text=cu.GetString(\"fldSharh\")";
mostCurrent._txtsharhbanki.setText(BA.ObjectToCharSequence(_cu.GetString("fldSharh")));
RDebugUtils.currentLine=46137477;
 //BA.debugLineNum = 46137477;BA.debugLine="id2=cu.GetInt(\"ID\")";
mostCurrent._id2 = BA.NumberToString(_cu.GetInt("ID"));
RDebugUtils.currentLine=46137479;
 //BA.debugLineNum = 46137479;BA.debugLine="CodeBank1= cu.GetString(\"fldCodeBank\")";
mostCurrent._codebank1 = _cu.GetString("fldCodeBank");
RDebugUtils.currentLine=46137480;
 //BA.debugLineNum = 46137480;BA.debugLine="Log(lstCodeBank1.IndexOf(CodeBank1))";
anywheresoftware.b4a.keywords.Common.LogImpl("546137480",BA.NumberToString(mostCurrent._lstcodebank1.IndexOf((Object)(mostCurrent._codebank1))),0);
RDebugUtils.currentLine=46137481;
 //BA.debugLineNum = 46137481;BA.debugLine="NSN_BankD.SelectedIndex=lstCodeBank1.IndexO";
mostCurrent._nsn_bankd.setSelectedIndex(mostCurrent._lstcodebank1.IndexOf((Object)(mostCurrent._codebank1)));
 }else 
{RDebugUtils.currentLine=46137483;
 //BA.debugLineNum = 46137483;BA.debugLine="Else if cu.GetString(\"fldType\")=2 Then";
if ((_cu.GetString("fldType")).equals(BA.NumberToString(2))) { 
RDebugUtils.currentLine=46137485;
 //BA.debugLineNum = 46137485;BA.debugLine="TxtMablaghChecki.Text=NumberFormat2(cu.GetS";
mostCurrent._txtmablaghchecki.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.NumberFormat2((double)(Double.parseDouble(_cu.GetString("fldMablaghDaryafti"))),(int) (0),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.True)));
RDebugUtils.currentLine=46137486;
 //BA.debugLineNum = 46137486;BA.debugLine="TxtSharhChecki.Text=cu.GetString(\"fldSharh\"";
mostCurrent._txtsharhchecki.setText(BA.ObjectToCharSequence(_cu.GetString("fldSharh")));
RDebugUtils.currentLine=46137487;
 //BA.debugLineNum = 46137487;BA.debugLine="id3=cu.GetInt(\"ID\")";
mostCurrent._id3 = BA.NumberToString(_cu.GetInt("ID"));
 }else 
{RDebugUtils.currentLine=46137490;
 //BA.debugLineNum = 46137490;BA.debugLine="Else if cu.GetString(\"fldType\")=3 Then";
if ((_cu.GetString("fldType")).equals(BA.NumberToString(3))) { 
RDebugUtils.currentLine=46137491;
 //BA.debugLineNum = 46137491;BA.debugLine="MablaghTakhfif= cu.GetString(\"FldMablaghTak";
_mablaghtakhfif = (long)(Double.parseDouble(_cu.GetString("FldMablaghTakhfif")));
RDebugUtils.currentLine=46137492;
 //BA.debugLineNum = 46137492;BA.debugLine="TxtMablaghTakhfif.Text=NumberFormat2(Mablag";
mostCurrent._txtmablaghtakhfif.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.NumberFormat2(_mablaghtakhfif,(int) (0),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.True)));
RDebugUtils.currentLine=46137494;
 //BA.debugLineNum = 46137494;BA.debugLine="TxtDarsadTakhfif.Text=myCode.Is_int(cu.GetS";
mostCurrent._txtdarsadtakhfif.setText(BA.ObjectToCharSequence(mostCurrent._mycode._is_int /*int*/ (mostCurrent.activityBA,_cu.GetString("FldDarsadTakhfif"))));
RDebugUtils.currentLine=46137495;
 //BA.debugLineNum = 46137495;BA.debugLine="TxtSharhTakhfif.Text=cu.GetString(\"fldSharh";
mostCurrent._txtsharhtakhfif.setText(BA.ObjectToCharSequence(_cu.GetString("fldSharh")));
RDebugUtils.currentLine=46137497;
 //BA.debugLineNum = 46137497;BA.debugLine="id4=cu.GetInt(\"ID\")";
mostCurrent._id4 = BA.NumberToString(_cu.GetInt("ID"));
 }}}}
;
 }
};
RDebugUtils.currentLine=46137504;
 //BA.debugLineNum = 46137504;BA.debugLine="GetSum";
_getsum();
 };
 };
 };
 } 
       catch (Exception e109) {
			processBA.setLastException(e109);RDebugUtils.currentLine=46137510;
 //BA.debugLineNum = 46137510;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("546137510",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=46137511;
 //BA.debugLineNum = 46137511;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-LoadDaryaft");
 };
RDebugUtils.currentLine=46137513;
 //BA.debugLineNum = 46137513;BA.debugLine="End Sub";
return "";
}
public static String  _btnnexttrack_click() throws Exception{
RDebugUtils.currentModule="act_mali";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnnexttrack_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnnexttrack_click", null));}
int _shomare = 0;
RDebugUtils.currentLine=47382528;
 //BA.debugLineNum = 47382528;BA.debugLine="Private Sub btnNextTrack_Click";
RDebugUtils.currentLine=47382529;
 //BA.debugLineNum = 47382529;BA.debugLine="Try";
try {RDebugUtils.currentLine=47382530;
 //BA.debugLineNum = 47382530;BA.debugLine="If btnNextTrack.Enabled=True Then";
if (mostCurrent._btnnexttrack.getEnabled()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=47382531;
 //BA.debugLineNum = 47382531;BA.debugLine="Dim shomare As Int=0";
_shomare = (int) (0);
RDebugUtils.currentLine=47382532;
 //BA.debugLineNum = 47382532;BA.debugLine="Current=Current+1";
_current = (int) (_current+1);
RDebugUtils.currentLine=47382533;
 //BA.debugLineNum = 47382533;BA.debugLine="If Current = ListDaryaft.Size Then";
if (_current==mostCurrent._listdaryaft.getSize()) { 
RDebugUtils.currentLine=47382534;
 //BA.debugLineNum = 47382534;BA.debugLine="btnNew_Click";
_btnnew_click();
RDebugUtils.currentLine=47382535;
 //BA.debugLineNum = 47382535;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=47382537;
 //BA.debugLineNum = 47382537;BA.debugLine="shomare=ListDaryaft.Get(Current)";
_shomare = (int)(BA.ObjectToNumber(mostCurrent._listdaryaft.Get(_current)));
RDebugUtils.currentLine=47382539;
 //BA.debugLineNum = 47382539;BA.debugLine="LoadDaryaft(shomare)";
_loaddaryaft(BA.NumberToString(_shomare));
 };
 } 
       catch (Exception e13) {
			processBA.setLastException(e13);RDebugUtils.currentLine=47382542;
 //BA.debugLineNum = 47382542;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("547382542",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=47382543;
 //BA.debugLineNum = 47382543;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-btnNextTrack_Click");
 };
RDebugUtils.currentLine=47382545;
 //BA.debugLineNum = 47382545;BA.debugLine="End Sub";
return "";
}
public static String  _btnpaymentcard_click() throws Exception{
RDebugUtils.currentModule="act_mali";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnpaymentcard_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnpaymentcard_click", null));}
anywheresoftware.b4a.objects.IntentWrapper _intent2 = null;
RDebugUtils.currentLine=47513600;
 //BA.debugLineNum = 47513600;BA.debugLine="Private Sub btnPaymentCard_Click";
RDebugUtils.currentLine=47513601;
 //BA.debugLineNum = 47513601;BA.debugLine="If TxtMablaghBanki.Text=\"\" Or TxtMablaghBanki.Tex";
if ((mostCurrent._txtmablaghbanki.getText()).equals("") || (mostCurrent._txtmablaghbanki.getText()).equals("0")) { 
RDebugUtils.currentLine=47513602;
 //BA.debugLineNum = 47513602;BA.debugLine="ToastMessageShow(\"لطفا مبلغ بانکی را وارد نمایید";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("لطفا مبلغ بانکی را وارد نمایید"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=47513603;
 //BA.debugLineNum = 47513603;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=47513606;
 //BA.debugLineNum = 47513606;BA.debugLine="Try";
try {RDebugUtils.currentLine=47513607;
 //BA.debugLineNum = 47513607;BA.debugLine="Dim intent2 As Intent";
_intent2 = new anywheresoftware.b4a.objects.IntentWrapper();
RDebugUtils.currentLine=47513608;
 //BA.debugLineNum = 47513608;BA.debugLine="intent2.Initialize(\"com.parsikhesab.parsianpos.S";
_intent2.Initialize("com.parsikhesab.parsianpos.Sale","");
RDebugUtils.currentLine=47513609;
 //BA.debugLineNum = 47513609;BA.debugLine="intent2.SetComponent(MCode.PackageNamePosParsian";
_intent2.SetComponent(mostCurrent._mcode._packagenameposparsian /*String*/ +"/.MainActivity");
RDebugUtils.currentLine=47513610;
 //BA.debugLineNum = 47513610;BA.debugLine="intent2.PutExtra(\"CompanyName\", MCode.CompanyNam";
_intent2.PutExtra("CompanyName",(Object)(mostCurrent._mcode._companyname /*String*/ ));
RDebugUtils.currentLine=47513611;
 //BA.debugLineNum = 47513611;BA.debugLine="intent2.PutExtra(\"AMOUNT\", TxtMablaghBanki.Text.";
_intent2.PutExtra("AMOUNT",(Object)(mostCurrent._txtmablaghbanki.getText().replace(",","")));
RDebugUtils.currentLine=47513612;
 //BA.debugLineNum = 47513612;BA.debugLine="intent2.PutExtra(\"SignCode\", \"100015\") ' ارسال د";
_intent2.PutExtra("SignCode",(Object)("100015"));
RDebugUtils.currentLine=47513613;
 //BA.debugLineNum = 47513613;BA.debugLine="intent2.PutExtra(\"additionalData\",TxtSharhKol.Te";
_intent2.PutExtra("additionalData",(Object)(mostCurrent._txtsharhkol.getText()));
RDebugUtils.currentLine=47513614;
 //BA.debugLineNum = 47513614;BA.debugLine="StartActivity(intent2)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(_intent2.getObject()));
 } 
       catch (Exception e15) {
			processBA.setLastException(e15);RDebugUtils.currentLine=47513616;
 //BA.debugLineNum = 47513616;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("547513616",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 };
RDebugUtils.currentLine=47513618;
 //BA.debugLineNum = 47513618;BA.debugLine="End Sub";
return "";
}
public static String  _btnrizchecki_click() throws Exception{
RDebugUtils.currentModule="act_mali";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnrizchecki_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnrizchecki_click", null));}
RDebugUtils.currentLine=47054848;
 //BA.debugLineNum = 47054848;BA.debugLine="Private Sub btnRizChecki_Click";
RDebugUtils.currentLine=47054849;
 //BA.debugLineNum = 47054849;BA.debugLine="Try";
try {RDebugUtils.currentLine=47054850;
 //BA.debugLineNum = 47054850;BA.debugLine="Act_SabtRizCheck.ShomareDaryafti=lblShomareDarya";
mostCurrent._act_sabtrizcheck._shomaredaryafti /*String*/  = mostCurrent._lblshomaredaryaft.getText();
RDebugUtils.currentLine=47054851;
 //BA.debugLineNum = 47054851;BA.debugLine="Act_SabtRizCheck.ShomareFactor=ShomareFactor";
mostCurrent._act_sabtrizcheck._shomarefactor /*String*/  = _shomarefactor;
RDebugUtils.currentLine=47054852;
 //BA.debugLineNum = 47054852;BA.debugLine="Act_SabtRizCheck.CodeMoshtari=CodeMoshtari";
mostCurrent._act_sabtrizcheck._codemoshtari /*String*/  = _codemoshtari;
RDebugUtils.currentLine=47054853;
 //BA.debugLineNum = 47054853;BA.debugLine="Act_SabtRizCheck.NameMoshtari=NameMoshtari";
mostCurrent._act_sabtrizcheck._namemoshtari /*String*/  = _namemoshtari;
RDebugUtils.currentLine=47054854;
 //BA.debugLineNum = 47054854;BA.debugLine="Act_SabtRizCheck.issend=IsSend";
mostCurrent._act_sabtrizcheck._issend /*boolean*/  = _issend;
RDebugUtils.currentLine=47054856;
 //BA.debugLineNum = 47054856;BA.debugLine="StartActivity(Act_SabtRizCheck)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._act_sabtrizcheck.getObject()));
 } 
       catch (Exception e9) {
			processBA.setLastException(e9);RDebugUtils.currentLine=47054858;
 //BA.debugLineNum = 47054858;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("547054858",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=47054859;
 //BA.debugLineNum = 47054859;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-btnRizChecki_Click");
 };
RDebugUtils.currentLine=47054861;
 //BA.debugLineNum = 47054861;BA.debugLine="End Sub";
return "";
}
public static String  _btnsaved_click() throws Exception{
RDebugUtils.currentModule="act_mali";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnsaved_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnsaved_click", null));}
String _status = "";
String _sharh = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
anywheresoftware.b4a.objects.collections.Map _fields = null;
anywheresoftware.b4a.objects.collections.Map _where = null;
String _darsad = "";
RDebugUtils.currentLine=46333952;
 //BA.debugLineNum = 46333952;BA.debugLine="Sub BtnSaveD_Click";
RDebugUtils.currentLine=46333953;
 //BA.debugLineNum = 46333953;BA.debugLine="Try";
try {RDebugUtils.currentLine=46333955;
 //BA.debugLineNum = 46333955;BA.debugLine="Dim status As String=\"Not Ok\"";
_status = "Not Ok";
RDebugUtils.currentLine=46333956;
 //BA.debugLineNum = 46333956;BA.debugLine="Dim sharh As String";
_sharh = "";
RDebugUtils.currentLine=46333957;
 //BA.debugLineNum = 46333957;BA.debugLine="MCode.ShomareDaryaft=lblShomareDaryaft.Text";
mostCurrent._mcode._shomaredaryaft /*String*/  = mostCurrent._lblshomaredaryaft.getText();
RDebugUtils.currentLine=46333958;
 //BA.debugLineNum = 46333958;BA.debugLine="MCode.SQL1.BeginTransaction";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .BeginTransaction();
RDebugUtils.currentLine=46333960;
 //BA.debugLineNum = 46333960;BA.debugLine="If TxtSharhKol.Text=\"\" Then";
if ((mostCurrent._txtsharhkol.getText()).equals("")) { 
RDebugUtils.currentLine=46333961;
 //BA.debugLineNum = 46333961;BA.debugLine="TxtSharhKol.Text= \"  \"&lblCodeMoshtari.Text &\"";
mostCurrent._txtsharhkol.setText(BA.ObjectToCharSequence("  "+mostCurrent._lblcodemoshtari.getText()+" _ "+mostCurrent._lblnamemoshtari.getText()));
 }else 
{RDebugUtils.currentLine=46333962;
 //BA.debugLineNum = 46333962;BA.debugLine="Else if TxtSharhKol.Text.Contains(\"  \"&lblCodeMo";
if (mostCurrent._txtsharhkol.getText().contains("  "+mostCurrent._lblcodemoshtari.getText()+" _ "+mostCurrent._lblnamemoshtari.getText())==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=46333963;
 //BA.debugLineNum = 46333963;BA.debugLine="TxtSharhKol.Text= TxtSharhKol.Text &\"  \"&lblCod";
mostCurrent._txtsharhkol.setText(BA.ObjectToCharSequence(mostCurrent._txtsharhkol.getText()+"  "+mostCurrent._lblcodemoshtari.getText()+" _ "+mostCurrent._lblnamemoshtari.getText()));
 }}
;
RDebugUtils.currentLine=46333966;
 //BA.debugLineNum = 46333966;BA.debugLine="If ShomareHavale=\"\" Then";
if ((_shomarehavale).equals("")) { 
RDebugUtils.currentLine=46333967;
 //BA.debugLineNum = 46333967;BA.debugLine="ShomareHavale=\"0\"";
_shomarehavale = "0";
 };
RDebugUtils.currentLine=46333970;
 //BA.debugLineNum = 46333970;BA.debugLine="Try";
try {RDebugUtils.currentLine=46333971;
 //BA.debugLineNum = 46333971;BA.debugLine="If TxtMablaghNaghdi.Text<>\"0\" Then";
if ((mostCurrent._txtmablaghnaghdi.getText()).equals("0") == false) { 
RDebugUtils.currentLine=46333972;
 //BA.debugLineNum = 46333972;BA.debugLine="Log(\"نقدی\")";
anywheresoftware.b4a.keywords.Common.LogImpl("546333972","نقدی",0);
RDebugUtils.currentLine=46333973;
 //BA.debugLineNum = 46333973;BA.debugLine="lblCodeMoshtari.Text=MCode.C_Tafzili";
mostCurrent._lblcodemoshtari.setText(BA.ObjectToCharSequence(mostCurrent._mcode._c_tafzili /*String*/ ));
RDebugUtils.currentLine=46333974;
 //BA.debugLineNum = 46333974;BA.debugLine="lblNameMoshtari.Text=MCode.N_Tafzili";
mostCurrent._lblnamemoshtari.setText(BA.ObjectToCharSequence(mostCurrent._mcode._n_tafzili /*String*/ ));
RDebugUtils.currentLine=46333976;
 //BA.debugLineNum = 46333976;BA.debugLine="MablaghDaryafti=TxtMablaghNaghdi.Text.Replace(";
_mablaghdaryafti = (long)(Double.parseDouble(mostCurrent._txtmablaghnaghdi.getText().replace(",","")));
RDebugUtils.currentLine=46333977;
 //BA.debugLineNum = 46333977;BA.debugLine="sharh=TxtSharhNaghdi.Text";
_sharh = mostCurrent._txtsharhnaghdi.getText();
RDebugUtils.currentLine=46333978;
 //BA.debugLineNum = 46333978;BA.debugLine="If myCode.Is_Null_adad(CodeSandogh)=0 Then";
if ((mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,mostCurrent._codesandogh)).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=46333979;
 //BA.debugLineNum = 46333979;BA.debugLine="ToastMessageShow(\"لیست کد صندوق به خوبی دریاف";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("لیست کد صندوق به خوبی دریافت نشده لطفا دریافت اطلاعات را بزنید"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=46333980;
 //BA.debugLineNum = 46333980;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=46333983;
 //BA.debugLineNum = 46333983;BA.debugLine="Query=\"SELECT * from TblDaryaft where fldShoma";
mostCurrent._query = "SELECT * from TblDaryaft where fldShomareDaryaft="+mostCurrent._lblshomaredaryaft.getText()+" and fldShomareFactor="+_shomarefactor+" and fldType=0";
RDebugUtils.currentLine=46333984;
 //BA.debugLineNum = 46333984;BA.debugLine="Dim cu As Cursor=MCode.Result(Query)";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,mostCurrent._query);
RDebugUtils.currentLine=46333985;
 //BA.debugLineNum = 46333985;BA.debugLine="If cu.RowCount=0 Then";
if (_cu.getRowCount()==0) { 
RDebugUtils.currentLine=46333986;
 //BA.debugLineNum = 46333986;BA.debugLine="Query=\"INSERT into TblDaryaft(FldRadif,fldSho";
mostCurrent._query = "INSERT into TblDaryaft(FldRadif,fldShomareDaryaft,fldShomareFactor,fldShomareHavale,fldMablaghDaryafti,FldMablaghTakhfif,fldCodeTafzili,fldSharh,fldCodeVaste,fldCodeSandoogh,FldDateDaryaft,fldCodeBank,fldType,FldSharhKol,FldDarsadTakhfif,fldSharheTafzili,fldShomareTell,fldSend) VALUES("+BA.NumberToString(_radif)+","+mostCurrent._lblshomaredaryaft.getText()+","+_shomarefactor+","+_shomarehavale+","+BA.NumberToString(_mablaghdaryafti)+",0,'"+mostCurrent._lblcodemoshtari.getText()+"','"+_sharh+"',"+mostCurrent._mcode._c_visitor /*String*/ +","+mostCurrent._codesandogh+",'"+mostCurrent._mcode._datepersian /*String*/ (mostCurrent.activityBA)+"',0,'0','"+mostCurrent._txtsharhkol.getText()+"',0,'"+mostCurrent._lblnamemoshtari.getText()+"','"+_shomaretell+"',0) ";
RDebugUtils.currentLine=46333987;
 //BA.debugLineNum = 46333987;BA.debugLine="MCode.SQL1.ExecNonQuery(Query)";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(mostCurrent._query);
RDebugUtils.currentLine=46333988;
 //BA.debugLineNum = 46333988;BA.debugLine="Log(\"Sucessful\")";
anywheresoftware.b4a.keywords.Common.LogImpl("546333988","Sucessful",0);
RDebugUtils.currentLine=46333989;
 //BA.debugLineNum = 46333989;BA.debugLine="status=\"OK\"";
_status = "OK";
 }else {
RDebugUtils.currentLine=46333991;
 //BA.debugLineNum = 46333991;BA.debugLine="If MablaghDaryafti>0 Then";
if (_mablaghdaryafti>0) { 
RDebugUtils.currentLine=46333992;
 //BA.debugLineNum = 46333992;BA.debugLine="Dim Fields As Map";
_fields = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=46333993;
 //BA.debugLineNum = 46333993;BA.debugLine="Dim Where As Map";
_where = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=46333995;
 //BA.debugLineNum = 46333995;BA.debugLine="Fields.Initialize";
_fields.Initialize();
RDebugUtils.currentLine=46333996;
 //BA.debugLineNum = 46333996;BA.debugLine="Where.Initialize";
_where.Initialize();
RDebugUtils.currentLine=46333998;
 //BA.debugLineNum = 46333998;BA.debugLine="Fields.Put(\"fldShomareDaryaft\",lblShomareDar";
_fields.Put((Object)("fldShomareDaryaft"),(Object)(mostCurrent._lblshomaredaryaft.getText()));
RDebugUtils.currentLine=46333999;
 //BA.debugLineNum = 46333999;BA.debugLine="Fields.Put(\"fldShomareHavale\",ShomareHavale)";
_fields.Put((Object)("fldShomareHavale"),(Object)(_shomarehavale));
RDebugUtils.currentLine=46334000;
 //BA.debugLineNum = 46334000;BA.debugLine="Fields.Put(\"fldShomareFactor\",ShomareFactor)";
_fields.Put((Object)("fldShomareFactor"),(Object)(_shomarefactor));
RDebugUtils.currentLine=46334001;
 //BA.debugLineNum = 46334001;BA.debugLine="Fields.Put(\"fldMablaghDaryafti\",MablaghDarya";
_fields.Put((Object)("fldMablaghDaryafti"),(Object)(_mablaghdaryafti));
RDebugUtils.currentLine=46334002;
 //BA.debugLineNum = 46334002;BA.debugLine="Fields.Put(\"fldCodeTafzili\",lblCodeMoshtari.";
_fields.Put((Object)("fldCodeTafzili"),(Object)(mostCurrent._lblcodemoshtari.getText()));
RDebugUtils.currentLine=46334003;
 //BA.debugLineNum = 46334003;BA.debugLine="Fields.Put(\"fldSharheTafzili\",lblNameMoshtar";
_fields.Put((Object)("fldSharheTafzili"),(Object)(mostCurrent._lblnamemoshtari.getText()));
RDebugUtils.currentLine=46334004;
 //BA.debugLineNum = 46334004;BA.debugLine="Fields.Put(\"fldShomareTell\",ShomareTell)";
_fields.Put((Object)("fldShomareTell"),(Object)(_shomaretell));
RDebugUtils.currentLine=46334005;
 //BA.debugLineNum = 46334005;BA.debugLine="Fields.Put(\"fldSharh\",sharh)";
_fields.Put((Object)("fldSharh"),(Object)(_sharh));
RDebugUtils.currentLine=46334006;
 //BA.debugLineNum = 46334006;BA.debugLine="Fields.Put(\"fldCodeVaste\",MCode.C_Visitor)";
_fields.Put((Object)("fldCodeVaste"),(Object)(mostCurrent._mcode._c_visitor /*String*/ ));
RDebugUtils.currentLine=46334007;
 //BA.debugLineNum = 46334007;BA.debugLine="Fields.Put(\"fldCodeSandoogh\",CodeSandogh)";
_fields.Put((Object)("fldCodeSandoogh"),(Object)(mostCurrent._codesandogh));
RDebugUtils.currentLine=46334008;
 //BA.debugLineNum = 46334008;BA.debugLine="Fields.Put(\"FldDateDaryaft\",MCode.DatePersia";
_fields.Put((Object)("FldDateDaryaft"),(Object)(mostCurrent._mcode._datepersian /*String*/ (mostCurrent.activityBA)));
RDebugUtils.currentLine=46334009;
 //BA.debugLineNum = 46334009;BA.debugLine="Fields.Put(\"FldSharhKol\",TxtSharhKol.Text)";
_fields.Put((Object)("FldSharhKol"),(Object)(mostCurrent._txtsharhkol.getText()));
RDebugUtils.currentLine=46334010;
 //BA.debugLineNum = 46334010;BA.debugLine="Where.Put(\"fldShomareDaryaft\",lblShomareDary";
_where.Put((Object)("fldShomareDaryaft"),(Object)(mostCurrent._lblshomaredaryaft.getText()));
RDebugUtils.currentLine=46334011;
 //BA.debugLineNum = 46334011;BA.debugLine="Where.Put(\"fldShomareFactor\",lblShomareFacto";
_where.Put((Object)("fldShomareFactor"),(Object)(mostCurrent._lblshomarefactor.getText()));
RDebugUtils.currentLine=46334012;
 //BA.debugLineNum = 46334012;BA.debugLine="Where.Put(\"fldType\",\"0\")";
_where.Put((Object)("fldType"),(Object)("0"));
RDebugUtils.currentLine=46334014;
 //BA.debugLineNum = 46334014;BA.debugLine="DBUtils.UpdateRecord2(MCode.Sql1,\"TblDaryaft";
mostCurrent._dbutils._updaterecord2 /*String*/ (mostCurrent.activityBA,mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ ,"TblDaryaft",_fields,_where);
RDebugUtils.currentLine=46334015;
 //BA.debugLineNum = 46334015;BA.debugLine="Log(\"Sucessful\")";
anywheresoftware.b4a.keywords.Common.LogImpl("546334015","Sucessful",0);
RDebugUtils.currentLine=46334016;
 //BA.debugLineNum = 46334016;BA.debugLine="ToastMessageShow(\"دریافت نقدی موفقیت بروزرسا";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("دریافت نقدی موفقیت بروزرسانی شد"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=46334017;
 //BA.debugLineNum = 46334017;BA.debugLine="status=\"OK\"";
_status = "OK";
 };
 };
 }else {
RDebugUtils.currentLine=46334023;
 //BA.debugLineNum = 46334023;BA.debugLine="Query=\"SELECT * from TblDaryaft where fldShoma";
mostCurrent._query = "SELECT * from TblDaryaft where fldShomareDaryaft="+mostCurrent._lblshomaredaryaft.getText()+" and fldShomareFactor="+_shomarefactor+" and fldType=0";
RDebugUtils.currentLine=46334024;
 //BA.debugLineNum = 46334024;BA.debugLine="Dim cu As Cursor=MCode.Result(Query)";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,mostCurrent._query);
RDebugUtils.currentLine=46334025;
 //BA.debugLineNum = 46334025;BA.debugLine="If cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=46334026;
 //BA.debugLineNum = 46334026;BA.debugLine="Query=\"Delete From TblDaryaft where fldShomar";
mostCurrent._query = "Delete From TblDaryaft where fldShomareDaryaft="+mostCurrent._lblshomaredaryaft.getText()+" and fldShomareFactor="+_shomarefactor+" and fldType=0 ";
RDebugUtils.currentLine=46334027;
 //BA.debugLineNum = 46334027;BA.debugLine="MCode.SQL1.ExecNonQuery(Query)";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(mostCurrent._query);
 };
 };
 } 
       catch (Exception e68) {
			processBA.setLastException(e68);RDebugUtils.currentLine=46334031;
 //BA.debugLineNum = 46334031;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("546334031",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=46334032;
 //BA.debugLineNum = 46334032;BA.debugLine="err=1";
_err = (int) (1);
 };
RDebugUtils.currentLine=46334034;
 //BA.debugLineNum = 46334034;BA.debugLine="Try";
try {RDebugUtils.currentLine=46334035;
 //BA.debugLineNum = 46334035;BA.debugLine="If TxtMablaghBanki.Text<>\"0\" Then";
if ((mostCurrent._txtmablaghbanki.getText()).equals("0") == false) { 
RDebugUtils.currentLine=46334036;
 //BA.debugLineNum = 46334036;BA.debugLine="Log(\"بانکی\")";
anywheresoftware.b4a.keywords.Common.LogImpl("546334036","بانکی",0);
RDebugUtils.currentLine=46334037;
 //BA.debugLineNum = 46334037;BA.debugLine="lblCodeMoshtari.Text=MCode.C_Tafzili";
mostCurrent._lblcodemoshtari.setText(BA.ObjectToCharSequence(mostCurrent._mcode._c_tafzili /*String*/ ));
RDebugUtils.currentLine=46334038;
 //BA.debugLineNum = 46334038;BA.debugLine="lblNameMoshtari.Text=MCode.N_Tafzili";
mostCurrent._lblnamemoshtari.setText(BA.ObjectToCharSequence(mostCurrent._mcode._n_tafzili /*String*/ ));
RDebugUtils.currentLine=46334040;
 //BA.debugLineNum = 46334040;BA.debugLine="MablaghDaryafti=TxtMablaghBanki.Text.Replace(\"";
_mablaghdaryafti = (long)(Double.parseDouble(mostCurrent._txtmablaghbanki.getText().replace(",","")));
RDebugUtils.currentLine=46334041;
 //BA.debugLineNum = 46334041;BA.debugLine="sharh=TxtSharhBanki.Text";
_sharh = mostCurrent._txtsharhbanki.getText();
RDebugUtils.currentLine=46334042;
 //BA.debugLineNum = 46334042;BA.debugLine="Query=\"SELECT * from TblDaryaft where fldShoma";
mostCurrent._query = "SELECT * from TblDaryaft where fldShomareDaryaft="+mostCurrent._lblshomaredaryaft.getText()+" and fldShomareFactor="+_shomarefactor+" and fldType=1";
RDebugUtils.currentLine=46334043;
 //BA.debugLineNum = 46334043;BA.debugLine="Dim cu As Cursor=MCode.Result(Query)";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,mostCurrent._query);
RDebugUtils.currentLine=46334044;
 //BA.debugLineNum = 46334044;BA.debugLine="If cu.RowCount=0 Then";
if (_cu.getRowCount()==0) { 
RDebugUtils.currentLine=46334045;
 //BA.debugLineNum = 46334045;BA.debugLine="Query=\"INSERT into TblDaryaft(FldRadif,fldSho";
mostCurrent._query = "INSERT into TblDaryaft(FldRadif,fldShomareDaryaft,fldShomareFactor,fldShomareHavale,fldMablaghDaryafti,FldMablaghTakhfif,fldCodeTafzili,fldSharh,fldCodeVaste,fldCodeSandoogh,FldDateDaryaft,fldCodeBank,fldType,FldSharhKol,FldDarsadTakhfif,fldSharheTafzili,fldShomareTell,fldSend) VALUES("+BA.NumberToString(_radif)+","+mostCurrent._lblshomaredaryaft.getText()+","+_shomarefactor+","+_shomarehavale+","+BA.NumberToString(_mablaghdaryafti)+",0,'"+mostCurrent._lblcodemoshtari.getText()+"','"+_sharh+"',"+mostCurrent._mcode._c_visitor /*String*/ +","+mostCurrent._codesandogh+",'"+mostCurrent._mcode._datepersian /*String*/ (mostCurrent.activityBA)+"',"+mostCurrent._codebank1+",'1','"+mostCurrent._txtsharhkol.getText()+"',0,'"+mostCurrent._lblnamemoshtari.getText()+"','"+_shomaretell+"',0) ";
RDebugUtils.currentLine=46334046;
 //BA.debugLineNum = 46334046;BA.debugLine="MCode.SQL1.ExecNonQuery(Query)";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(mostCurrent._query);
RDebugUtils.currentLine=46334047;
 //BA.debugLineNum = 46334047;BA.debugLine="Log(\"Sucessful\")";
anywheresoftware.b4a.keywords.Common.LogImpl("546334047","Sucessful",0);
RDebugUtils.currentLine=46334048;
 //BA.debugLineNum = 46334048;BA.debugLine="ToastMessageShow(\"دریافت بانکی با موفقیت ثبت";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("دریافت بانکی با موفقیت ثبت گردید"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=46334049;
 //BA.debugLineNum = 46334049;BA.debugLine="status=\"OK\"";
_status = "OK";
 }else {
RDebugUtils.currentLine=46334052;
 //BA.debugLineNum = 46334052;BA.debugLine="Dim Fields As Map";
_fields = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=46334053;
 //BA.debugLineNum = 46334053;BA.debugLine="Dim Where As Map";
_where = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=46334055;
 //BA.debugLineNum = 46334055;BA.debugLine="Fields.Initialize";
_fields.Initialize();
RDebugUtils.currentLine=46334056;
 //BA.debugLineNum = 46334056;BA.debugLine="Where.Initialize";
_where.Initialize();
RDebugUtils.currentLine=46334058;
 //BA.debugLineNum = 46334058;BA.debugLine="Fields.Put(\"fldShomareDaryaft\",lblShomareDary";
_fields.Put((Object)("fldShomareDaryaft"),(Object)(mostCurrent._lblshomaredaryaft.getText()));
RDebugUtils.currentLine=46334059;
 //BA.debugLineNum = 46334059;BA.debugLine="Fields.Put(\"fldShomareFactor\",ShomareFactor)";
_fields.Put((Object)("fldShomareFactor"),(Object)(_shomarefactor));
RDebugUtils.currentLine=46334060;
 //BA.debugLineNum = 46334060;BA.debugLine="Fields.Put(\"fldShomareHavale\",ShomareHavale)";
_fields.Put((Object)("fldShomareHavale"),(Object)(_shomarehavale));
RDebugUtils.currentLine=46334061;
 //BA.debugLineNum = 46334061;BA.debugLine="Fields.Put(\"fldMablaghDaryafti\",MablaghDaryaf";
_fields.Put((Object)("fldMablaghDaryafti"),(Object)(_mablaghdaryafti));
RDebugUtils.currentLine=46334062;
 //BA.debugLineNum = 46334062;BA.debugLine="Fields.Put(\"fldCodeTafzili\",lblCodeMoshtari.T";
_fields.Put((Object)("fldCodeTafzili"),(Object)(mostCurrent._lblcodemoshtari.getText()));
RDebugUtils.currentLine=46334063;
 //BA.debugLineNum = 46334063;BA.debugLine="Fields.Put(\"fldSharheTafzili\",lblNameMoshtari";
_fields.Put((Object)("fldSharheTafzili"),(Object)(mostCurrent._lblnamemoshtari.getText()));
RDebugUtils.currentLine=46334064;
 //BA.debugLineNum = 46334064;BA.debugLine="Fields.Put(\"fldShomareTell\",ShomareTell)";
_fields.Put((Object)("fldShomareTell"),(Object)(_shomaretell));
RDebugUtils.currentLine=46334065;
 //BA.debugLineNum = 46334065;BA.debugLine="Fields.Put(\"fldSharh\",sharh)";
_fields.Put((Object)("fldSharh"),(Object)(_sharh));
RDebugUtils.currentLine=46334066;
 //BA.debugLineNum = 46334066;BA.debugLine="Fields.Put(\"fldCodeBank\",CodeBank1)";
_fields.Put((Object)("fldCodeBank"),(Object)(mostCurrent._codebank1));
RDebugUtils.currentLine=46334067;
 //BA.debugLineNum = 46334067;BA.debugLine="Fields.Put(\"FldDateDaryaft\",MCode.DatePersian";
_fields.Put((Object)("FldDateDaryaft"),(Object)(mostCurrent._mcode._datepersian /*String*/ (mostCurrent.activityBA)));
RDebugUtils.currentLine=46334068;
 //BA.debugLineNum = 46334068;BA.debugLine="Fields.Put(\"FldSharhKol\",TxtSharhKol.Text)";
_fields.Put((Object)("FldSharhKol"),(Object)(mostCurrent._txtsharhkol.getText()));
RDebugUtils.currentLine=46334069;
 //BA.debugLineNum = 46334069;BA.debugLine="Where.Put(\"fldShomareDaryaft\",lblShomareDarya";
_where.Put((Object)("fldShomareDaryaft"),(Object)(mostCurrent._lblshomaredaryaft.getText()));
RDebugUtils.currentLine=46334070;
 //BA.debugLineNum = 46334070;BA.debugLine="Where.Put(\"fldShomareFactor\",lblShomareFactor";
_where.Put((Object)("fldShomareFactor"),(Object)(mostCurrent._lblshomarefactor.getText()));
RDebugUtils.currentLine=46334071;
 //BA.debugLineNum = 46334071;BA.debugLine="Where.Put(\"fldType\",\"1\")";
_where.Put((Object)("fldType"),(Object)("1"));
RDebugUtils.currentLine=46334073;
 //BA.debugLineNum = 46334073;BA.debugLine="DBUtils.UpdateRecord2(MCode.Sql1,\"TblDaryaft\"";
mostCurrent._dbutils._updaterecord2 /*String*/ (mostCurrent.activityBA,mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ ,"TblDaryaft",_fields,_where);
RDebugUtils.currentLine=46334074;
 //BA.debugLineNum = 46334074;BA.debugLine="Log(\"Sucessful\")";
anywheresoftware.b4a.keywords.Common.LogImpl("546334074","Sucessful",0);
RDebugUtils.currentLine=46334075;
 //BA.debugLineNum = 46334075;BA.debugLine="ToastMessageShow(\"دریافت بانکی با موفقیت بروز";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("دریافت بانکی با موفقیت بروزرسانی شد"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=46334076;
 //BA.debugLineNum = 46334076;BA.debugLine="status=\"OK\"";
_status = "OK";
 };
 }else {
RDebugUtils.currentLine=46334080;
 //BA.debugLineNum = 46334080;BA.debugLine="Query=\"SELECT * from TblDaryaft where fldShoma";
mostCurrent._query = "SELECT * from TblDaryaft where fldShomareDaryaft="+mostCurrent._lblshomaredaryaft.getText()+" and fldShomareFactor="+_shomarefactor+" and fldType=1";
RDebugUtils.currentLine=46334081;
 //BA.debugLineNum = 46334081;BA.debugLine="Dim cu As Cursor=MCode.Result(Query)";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,mostCurrent._query);
RDebugUtils.currentLine=46334082;
 //BA.debugLineNum = 46334082;BA.debugLine="If cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=46334083;
 //BA.debugLineNum = 46334083;BA.debugLine="Query=\"Delete From TblDaryaft where fldShomar";
mostCurrent._query = "Delete From TblDaryaft where fldShomareDaryaft="+mostCurrent._lblshomaredaryaft.getText()+" and fldShomareFactor="+_shomarefactor+" and fldType=1 ";
RDebugUtils.currentLine=46334084;
 //BA.debugLineNum = 46334084;BA.debugLine="MCode.SQL1.ExecNonQuery(Query)";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(mostCurrent._query);
 };
 };
 } 
       catch (Exception e119) {
			processBA.setLastException(e119);RDebugUtils.currentLine=46334088;
 //BA.debugLineNum = 46334088;BA.debugLine="Log(LastException.Message)";
anywheresoftware.b4a.keywords.Common.LogImpl("546334088",anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getMessage(),0);
RDebugUtils.currentLine=46334089;
 //BA.debugLineNum = 46334089;BA.debugLine="err=2";
_err = (int) (2);
 };
RDebugUtils.currentLine=46334092;
 //BA.debugLineNum = 46334092;BA.debugLine="Try";
try {RDebugUtils.currentLine=46334093;
 //BA.debugLineNum = 46334093;BA.debugLine="If	TxtMablaghChecki.Text<>\"0\" Then";
if ((mostCurrent._txtmablaghchecki.getText()).equals("0") == false) { 
RDebugUtils.currentLine=46334094;
 //BA.debugLineNum = 46334094;BA.debugLine="Log(\"چکی\")";
anywheresoftware.b4a.keywords.Common.LogImpl("546334094","چکی",0);
RDebugUtils.currentLine=46334095;
 //BA.debugLineNum = 46334095;BA.debugLine="lblCodeMoshtari.Text=MCode.C_Tafzili";
mostCurrent._lblcodemoshtari.setText(BA.ObjectToCharSequence(mostCurrent._mcode._c_tafzili /*String*/ ));
RDebugUtils.currentLine=46334096;
 //BA.debugLineNum = 46334096;BA.debugLine="lblNameMoshtari.Text=MCode.N_Tafzili";
mostCurrent._lblnamemoshtari.setText(BA.ObjectToCharSequence(mostCurrent._mcode._n_tafzili /*String*/ ));
RDebugUtils.currentLine=46334097;
 //BA.debugLineNum = 46334097;BA.debugLine="MablaghDaryafti=TxtMablaghChecki.Text.Replace(";
_mablaghdaryafti = (long)(Double.parseDouble(mostCurrent._txtmablaghchecki.getText().replace(",","")));
RDebugUtils.currentLine=46334098;
 //BA.debugLineNum = 46334098;BA.debugLine="sharh=TxtSharhChecki.Text";
_sharh = mostCurrent._txtsharhchecki.getText();
RDebugUtils.currentLine=46334099;
 //BA.debugLineNum = 46334099;BA.debugLine="Query=\"SELECT * from TblDaryaft where fldShoma";
mostCurrent._query = "SELECT * from TblDaryaft where fldShomareDaryaft="+mostCurrent._lblshomaredaryaft.getText()+" and fldShomareFactor="+_shomarefactor+" and fldType=2";
RDebugUtils.currentLine=46334100;
 //BA.debugLineNum = 46334100;BA.debugLine="Dim cu As Cursor=MCode.Result(Query)";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,mostCurrent._query);
RDebugUtils.currentLine=46334103;
 //BA.debugLineNum = 46334103;BA.debugLine="If cu.RowCount=0 Then";
if (_cu.getRowCount()==0) { 
RDebugUtils.currentLine=46334104;
 //BA.debugLineNum = 46334104;BA.debugLine="Query=\"INSERT into TblDaryaft(FldRadif,fldSho";
mostCurrent._query = "INSERT into TblDaryaft(FldRadif,fldShomareDaryaft,fldShomareFactor,fldShomareHavale,fldMablaghDaryafti,FldMablaghTakhfif,fldCodeTafzili,fldSharh,fldCodeVaste,fldCodeSandoogh,FldDateDaryaft,fldCodeBank,fldType,FldSharhKol,FldDarsadTakhfif,fldSharheTafzili,fldShomareTell,fldSend) VALUES("+BA.NumberToString(_radif)+","+mostCurrent._lblshomaredaryaft.getText()+","+_shomarefactor+","+_shomarehavale+","+BA.NumberToString(_mablaghdaryafti)+",0,'"+mostCurrent._lblcodemoshtari.getText()+"','"+_sharh+"',"+mostCurrent._mcode._c_visitor /*String*/ +",0,'"+mostCurrent._mcode._datepersian /*String*/ (mostCurrent.activityBA)+"',0,'2','"+mostCurrent._txtsharhkol.getText()+"',0,'"+mostCurrent._lblnamemoshtari.getText()+"','"+_shomaretell+"',0) ";
RDebugUtils.currentLine=46334105;
 //BA.debugLineNum = 46334105;BA.debugLine="MCode.SQL1.ExecNonQuery(Query)";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(mostCurrent._query);
RDebugUtils.currentLine=46334106;
 //BA.debugLineNum = 46334106;BA.debugLine="Log(\"Sucessful\")";
anywheresoftware.b4a.keywords.Common.LogImpl("546334106","Sucessful",0);
RDebugUtils.currentLine=46334107;
 //BA.debugLineNum = 46334107;BA.debugLine="ToastMessageShow(\"دریافت چکی با موفقیت ثبت گر";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("دریافت چکی با موفقیت ثبت گردید"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=46334108;
 //BA.debugLineNum = 46334108;BA.debugLine="status=\"OK\"";
_status = "OK";
 }else {
RDebugUtils.currentLine=46334111;
 //BA.debugLineNum = 46334111;BA.debugLine="Dim Fields As Map";
_fields = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=46334112;
 //BA.debugLineNum = 46334112;BA.debugLine="Dim Where As Map";
_where = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=46334114;
 //BA.debugLineNum = 46334114;BA.debugLine="Fields.Initialize";
_fields.Initialize();
RDebugUtils.currentLine=46334115;
 //BA.debugLineNum = 46334115;BA.debugLine="Where.Initialize";
_where.Initialize();
RDebugUtils.currentLine=46334117;
 //BA.debugLineNum = 46334117;BA.debugLine="Fields.Put(\"fldShomareDaryaft\",lblShomareDary";
_fields.Put((Object)("fldShomareDaryaft"),(Object)(mostCurrent._lblshomaredaryaft.getText()));
RDebugUtils.currentLine=46334118;
 //BA.debugLineNum = 46334118;BA.debugLine="Fields.Put(\"fldShomareFactor\",ShomareFactor)";
_fields.Put((Object)("fldShomareFactor"),(Object)(_shomarefactor));
RDebugUtils.currentLine=46334119;
 //BA.debugLineNum = 46334119;BA.debugLine="Fields.Put(\"fldShomareHavale\",ShomareHavale)";
_fields.Put((Object)("fldShomareHavale"),(Object)(_shomarehavale));
RDebugUtils.currentLine=46334120;
 //BA.debugLineNum = 46334120;BA.debugLine="Fields.Put(\"fldMablaghDaryafti\",MablaghDaryaf";
_fields.Put((Object)("fldMablaghDaryafti"),(Object)(_mablaghdaryafti));
RDebugUtils.currentLine=46334121;
 //BA.debugLineNum = 46334121;BA.debugLine="Fields.Put(\"fldCodeTafzili\",lblCodeMoshtari.T";
_fields.Put((Object)("fldCodeTafzili"),(Object)(mostCurrent._lblcodemoshtari.getText()));
RDebugUtils.currentLine=46334122;
 //BA.debugLineNum = 46334122;BA.debugLine="Fields.Put(\"fldSharheTafzili\",lblNameMoshtari";
_fields.Put((Object)("fldSharheTafzili"),(Object)(mostCurrent._lblnamemoshtari.getText()));
RDebugUtils.currentLine=46334123;
 //BA.debugLineNum = 46334123;BA.debugLine="Fields.Put(\"fldShomareTell\",ShomareTell)";
_fields.Put((Object)("fldShomareTell"),(Object)(_shomaretell));
RDebugUtils.currentLine=46334124;
 //BA.debugLineNum = 46334124;BA.debugLine="Fields.Put(\"fldSharh\",sharh)";
_fields.Put((Object)("fldSharh"),(Object)(_sharh));
RDebugUtils.currentLine=46334125;
 //BA.debugLineNum = 46334125;BA.debugLine="Fields.Put(\"FldDateDaryaft\",MCode.DatePersian";
_fields.Put((Object)("FldDateDaryaft"),(Object)(mostCurrent._mcode._datepersian /*String*/ (mostCurrent.activityBA)));
RDebugUtils.currentLine=46334126;
 //BA.debugLineNum = 46334126;BA.debugLine="Fields.Put(\"FldSharhKol\",TxtSharhKol.Text)";
_fields.Put((Object)("FldSharhKol"),(Object)(mostCurrent._txtsharhkol.getText()));
RDebugUtils.currentLine=46334127;
 //BA.debugLineNum = 46334127;BA.debugLine="Where.Put(\"fldShomareDaryaft\",lblShomareDarya";
_where.Put((Object)("fldShomareDaryaft"),(Object)(mostCurrent._lblshomaredaryaft.getText()));
RDebugUtils.currentLine=46334128;
 //BA.debugLineNum = 46334128;BA.debugLine="Where.Put(\"fldShomareFactor\",lblShomareFactor";
_where.Put((Object)("fldShomareFactor"),(Object)(mostCurrent._lblshomarefactor.getText()));
RDebugUtils.currentLine=46334129;
 //BA.debugLineNum = 46334129;BA.debugLine="Where.Put(\"fldType\",\"2\")";
_where.Put((Object)("fldType"),(Object)("2"));
RDebugUtils.currentLine=46334131;
 //BA.debugLineNum = 46334131;BA.debugLine="DBUtils.UpdateRecord2(MCode.Sql1,\"TblDaryaft\"";
mostCurrent._dbutils._updaterecord2 /*String*/ (mostCurrent.activityBA,mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ ,"TblDaryaft",_fields,_where);
RDebugUtils.currentLine=46334132;
 //BA.debugLineNum = 46334132;BA.debugLine="Log(\"Sucessful\")";
anywheresoftware.b4a.keywords.Common.LogImpl("546334132","Sucessful",0);
RDebugUtils.currentLine=46334133;
 //BA.debugLineNum = 46334133;BA.debugLine="ToastMessageShow(\"دریافت چکی با موفقیت بروزرس";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("دریافت چکی با موفقیت بروزرسانی شد"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=46334134;
 //BA.debugLineNum = 46334134;BA.debugLine="status=\"OK\"";
_status = "OK";
 };
 }else {
RDebugUtils.currentLine=46334140;
 //BA.debugLineNum = 46334140;BA.debugLine="Query=\"SELECT * from TblDaryaft where fldShoma";
mostCurrent._query = "SELECT * from TblDaryaft where fldShomareDaryaft="+mostCurrent._lblshomaredaryaft.getText()+" and fldShomareFactor="+_shomarefactor+" and fldType=2";
RDebugUtils.currentLine=46334141;
 //BA.debugLineNum = 46334141;BA.debugLine="Dim cu As Cursor=MCode.Result(Query)";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,mostCurrent._query);
RDebugUtils.currentLine=46334142;
 //BA.debugLineNum = 46334142;BA.debugLine="If cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=46334143;
 //BA.debugLineNum = 46334143;BA.debugLine="Query=\"Delete From TblDaryaft where fldShomar";
mostCurrent._query = "Delete From TblDaryaft where fldShomareDaryaft="+mostCurrent._lblshomaredaryaft.getText()+" and fldShomareFactor="+_shomarefactor+" and fldType=2 ";
RDebugUtils.currentLine=46334144;
 //BA.debugLineNum = 46334144;BA.debugLine="MCode.SQL1.ExecNonQuery(Query)";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(mostCurrent._query);
 };
 };
 } 
       catch (Exception e169) {
			processBA.setLastException(e169);RDebugUtils.currentLine=46334149;
 //BA.debugLineNum = 46334149;BA.debugLine="Log(LastException.Message)";
anywheresoftware.b4a.keywords.Common.LogImpl("546334149",anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getMessage(),0);
RDebugUtils.currentLine=46334150;
 //BA.debugLineNum = 46334150;BA.debugLine="err=3";
_err = (int) (3);
 };
RDebugUtils.currentLine=46334153;
 //BA.debugLineNum = 46334153;BA.debugLine="Try";
try {RDebugUtils.currentLine=46334154;
 //BA.debugLineNum = 46334154;BA.debugLine="If	TxtMablaghTakhfif.Text<>\"0\" Or TxtDarsadTakh";
if ((mostCurrent._txtmablaghtakhfif.getText()).equals("0") == false || (mostCurrent._txtdarsadtakhfif.getText()).equals("0") == false) { 
RDebugUtils.currentLine=46334155;
 //BA.debugLineNum = 46334155;BA.debugLine="Log(\"تخفیف\")";
anywheresoftware.b4a.keywords.Common.LogImpl("546334155","تخفیف",0);
RDebugUtils.currentLine=46334157;
 //BA.debugLineNum = 46334157;BA.debugLine="lblCodeMoshtari.Text=MCode.C_Tafzili";
mostCurrent._lblcodemoshtari.setText(BA.ObjectToCharSequence(mostCurrent._mcode._c_tafzili /*String*/ ));
RDebugUtils.currentLine=46334158;
 //BA.debugLineNum = 46334158;BA.debugLine="lblNameMoshtari.Text=MCode.N_Tafzili";
mostCurrent._lblnamemoshtari.setText(BA.ObjectToCharSequence(mostCurrent._mcode._n_tafzili /*String*/ ));
RDebugUtils.currentLine=46334160;
 //BA.debugLineNum = 46334160;BA.debugLine="If TxtMablaghTakhfif.Text=\"0\" Or TxtMablaghTak";
if ((mostCurrent._txtmablaghtakhfif.getText()).equals("0") || (mostCurrent._txtmablaghtakhfif.getText()).equals("")) { 
RDebugUtils.currentLine=46334161;
 //BA.debugLineNum = 46334161;BA.debugLine="Dim darsad As String=TxtDarsadTakhfif.Text";
_darsad = mostCurrent._txtdarsadtakhfif.getText();
RDebugUtils.currentLine=46334162;
 //BA.debugLineNum = 46334162;BA.debugLine="MablaghTakhfif=(MabalghKolFactor*darsad)/100";
_mablaghtakhfif = (long) (((double)(Double.parseDouble(_mabalghkolfactor))*(double)(Double.parseDouble(_darsad)))/(double)100);
 }else {
RDebugUtils.currentLine=46334164;
 //BA.debugLineNum = 46334164;BA.debugLine="MablaghTakhfif=TxtMablaghTakhfif.Text.Replace";
_mablaghtakhfif = (long)(Double.parseDouble(mostCurrent._txtmablaghtakhfif.getText().replace(",","")));
 };
RDebugUtils.currentLine=46334166;
 //BA.debugLineNum = 46334166;BA.debugLine="sharh=TxtSharhTakhfif.Text";
_sharh = mostCurrent._txtsharhtakhfif.getText();
RDebugUtils.currentLine=46334167;
 //BA.debugLineNum = 46334167;BA.debugLine="Query=\"SELECT * from TblDaryaft where fldShoma";
mostCurrent._query = "SELECT * from TblDaryaft where fldShomareDaryaft="+mostCurrent._lblshomaredaryaft.getText()+" and fldShomareFactor="+_shomarefactor+" and fldType=3";
RDebugUtils.currentLine=46334168;
 //BA.debugLineNum = 46334168;BA.debugLine="Dim cu As Cursor=MCode.Result(Query)";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,mostCurrent._query);
RDebugUtils.currentLine=46334169;
 //BA.debugLineNum = 46334169;BA.debugLine="If cu.RowCount=0 Then";
if (_cu.getRowCount()==0) { 
RDebugUtils.currentLine=46334170;
 //BA.debugLineNum = 46334170;BA.debugLine="Query=\"INSERT into TblDaryaft(FldRadif,fldSho";
mostCurrent._query = "INSERT into TblDaryaft(FldRadif,fldShomareDaryaft,fldShomareFactor,fldShomareHavale,fldMablaghDaryafti,FldMablaghTakhfif,fldCodeTafzili,fldSharh,fldCodeVaste,fldCodeSandoogh,FldDateDaryaft,fldCodeBank,fldType,FldSharhKol,FldDarsadTakhfif,fldSharheTafzili,fldShomareTell,fldSend) VALUES("+BA.NumberToString(_radif)+","+mostCurrent._lblshomaredaryaft.getText()+","+_shomarefactor+","+_shomarehavale+",0,"+BA.NumberToString(_mablaghtakhfif)+",'"+mostCurrent._lblcodemoshtari.getText()+"','"+_sharh+"',"+mostCurrent._mcode._c_visitor /*String*/ +",0,'"+mostCurrent._mcode._datepersian /*String*/ (mostCurrent.activityBA)+"',0,'3','"+mostCurrent._txtsharhkol.getText()+"','"+_darsad+"','"+mostCurrent._lblnamemoshtari.getText()+"','"+_shomaretell+"',0) ";
RDebugUtils.currentLine=46334171;
 //BA.debugLineNum = 46334171;BA.debugLine="MCode.SQL1.ExecNonQuery(Query)";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(mostCurrent._query);
RDebugUtils.currentLine=46334172;
 //BA.debugLineNum = 46334172;BA.debugLine="Log(\"Sucessful\")";
anywheresoftware.b4a.keywords.Common.LogImpl("546334172","Sucessful",0);
RDebugUtils.currentLine=46334173;
 //BA.debugLineNum = 46334173;BA.debugLine="ToastMessageShow(\"دریافت تخفیف با موفقیت ثبت";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("دریافت تخفیف با موفقیت ثبت گردید"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=46334174;
 //BA.debugLineNum = 46334174;BA.debugLine="status=\"OK\"";
_status = "OK";
 }else {
RDebugUtils.currentLine=46334177;
 //BA.debugLineNum = 46334177;BA.debugLine="Dim Fields As Map";
_fields = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=46334178;
 //BA.debugLineNum = 46334178;BA.debugLine="Dim Where As Map";
_where = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=46334180;
 //BA.debugLineNum = 46334180;BA.debugLine="Fields.Initialize";
_fields.Initialize();
RDebugUtils.currentLine=46334181;
 //BA.debugLineNum = 46334181;BA.debugLine="Where.Initialize";
_where.Initialize();
RDebugUtils.currentLine=46334183;
 //BA.debugLineNum = 46334183;BA.debugLine="Fields.Put(\"fldShomareDaryaft\",lblShomareDary";
_fields.Put((Object)("fldShomareDaryaft"),(Object)(mostCurrent._lblshomaredaryaft.getText()));
RDebugUtils.currentLine=46334184;
 //BA.debugLineNum = 46334184;BA.debugLine="Fields.Put(\"fldShomareFactor\",ShomareFactor)";
_fields.Put((Object)("fldShomareFactor"),(Object)(_shomarefactor));
RDebugUtils.currentLine=46334185;
 //BA.debugLineNum = 46334185;BA.debugLine="Fields.Put(\"fldShomareHavale\",ShomareHavale)";
_fields.Put((Object)("fldShomareHavale"),(Object)(_shomarehavale));
RDebugUtils.currentLine=46334186;
 //BA.debugLineNum = 46334186;BA.debugLine="Fields.Put(\"FldMablaghTakhfif\",MablaghTakhfif";
_fields.Put((Object)("FldMablaghTakhfif"),(Object)(_mablaghtakhfif));
RDebugUtils.currentLine=46334187;
 //BA.debugLineNum = 46334187;BA.debugLine="Fields.Put(\"fldCodeTafzili\",lblCodeMoshtari.T";
_fields.Put((Object)("fldCodeTafzili"),(Object)(mostCurrent._lblcodemoshtari.getText()));
RDebugUtils.currentLine=46334188;
 //BA.debugLineNum = 46334188;BA.debugLine="Fields.Put(\"fldSharheTafzili\",lblNameMoshtari";
_fields.Put((Object)("fldSharheTafzili"),(Object)(mostCurrent._lblnamemoshtari.getText()));
RDebugUtils.currentLine=46334189;
 //BA.debugLineNum = 46334189;BA.debugLine="Fields.Put(\"fldShomareTell\",ShomareTell)";
_fields.Put((Object)("fldShomareTell"),(Object)(_shomaretell));
RDebugUtils.currentLine=46334190;
 //BA.debugLineNum = 46334190;BA.debugLine="Fields.Put(\"fldSharh\",sharh)";
_fields.Put((Object)("fldSharh"),(Object)(_sharh));
RDebugUtils.currentLine=46334191;
 //BA.debugLineNum = 46334191;BA.debugLine="Fields.Put(\"FldDarsadTakhfif\",darsad)";
_fields.Put((Object)("FldDarsadTakhfif"),(Object)(_darsad));
RDebugUtils.currentLine=46334192;
 //BA.debugLineNum = 46334192;BA.debugLine="Fields.Put(\"FldDateDaryaft\",MCode.DatePersian";
_fields.Put((Object)("FldDateDaryaft"),(Object)(mostCurrent._mcode._datepersian /*String*/ (mostCurrent.activityBA)));
RDebugUtils.currentLine=46334193;
 //BA.debugLineNum = 46334193;BA.debugLine="Fields.Put(\"FldSharhKol\",TxtSharhKol.Text)";
_fields.Put((Object)("FldSharhKol"),(Object)(mostCurrent._txtsharhkol.getText()));
RDebugUtils.currentLine=46334194;
 //BA.debugLineNum = 46334194;BA.debugLine="Where.Put(\"fldShomareDaryaft\",lblShomareDarya";
_where.Put((Object)("fldShomareDaryaft"),(Object)(mostCurrent._lblshomaredaryaft.getText()));
RDebugUtils.currentLine=46334195;
 //BA.debugLineNum = 46334195;BA.debugLine="Where.Put(\"fldShomareFactor\",lblShomareFactor";
_where.Put((Object)("fldShomareFactor"),(Object)(mostCurrent._lblshomarefactor.getText()));
RDebugUtils.currentLine=46334196;
 //BA.debugLineNum = 46334196;BA.debugLine="Where.Put(\"fldType\",\"3\")";
_where.Put((Object)("fldType"),(Object)("3"));
RDebugUtils.currentLine=46334198;
 //BA.debugLineNum = 46334198;BA.debugLine="DBUtils.UpdateRecord2(MCode.Sql1,\"TblDaryaft\"";
mostCurrent._dbutils._updaterecord2 /*String*/ (mostCurrent.activityBA,mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ ,"TblDaryaft",_fields,_where);
RDebugUtils.currentLine=46334199;
 //BA.debugLineNum = 46334199;BA.debugLine="Log(\"Sucessful\")";
anywheresoftware.b4a.keywords.Common.LogImpl("546334199","Sucessful",0);
RDebugUtils.currentLine=46334200;
 //BA.debugLineNum = 46334200;BA.debugLine="ToastMessageShow(\"دریافت تخفیف با موفقیت بروز";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("دریافت تخفیف با موفقیت بروزرسانی شد"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=46334201;
 //BA.debugLineNum = 46334201;BA.debugLine="status=\"OK\"";
_status = "OK";
 };
 }else {
RDebugUtils.currentLine=46334207;
 //BA.debugLineNum = 46334207;BA.debugLine="Query=\"SELECT * from TblDaryaft where fldShoma";
mostCurrent._query = "SELECT * from TblDaryaft where fldShomareDaryaft="+mostCurrent._lblshomaredaryaft.getText()+" and fldShomareFactor="+_shomarefactor+" and fldType=3";
RDebugUtils.currentLine=46334208;
 //BA.debugLineNum = 46334208;BA.debugLine="Dim cu As Cursor=MCode.Result(Query)";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,mostCurrent._query);
RDebugUtils.currentLine=46334209;
 //BA.debugLineNum = 46334209;BA.debugLine="If cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=46334210;
 //BA.debugLineNum = 46334210;BA.debugLine="Query=\"Delete From TblDaryaft where fldShomar";
mostCurrent._query = "Delete From TblDaryaft where fldShomareDaryaft="+mostCurrent._lblshomaredaryaft.getText()+" and fldShomareFactor="+_shomarefactor+" and fldType=3 ";
RDebugUtils.currentLine=46334211;
 //BA.debugLineNum = 46334211;BA.debugLine="MCode.SQL1.ExecNonQuery(Query)";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(mostCurrent._query);
 };
 };
 } 
       catch (Exception e225) {
			processBA.setLastException(e225);RDebugUtils.currentLine=46334215;
 //BA.debugLineNum = 46334215;BA.debugLine="Log(LastException.Message)";
anywheresoftware.b4a.keywords.Common.LogImpl("546334215",anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getMessage(),0);
RDebugUtils.currentLine=46334216;
 //BA.debugLineNum = 46334216;BA.debugLine="err=4";
_err = (int) (4);
 };
RDebugUtils.currentLine=46334219;
 //BA.debugLineNum = 46334219;BA.debugLine="Try";
try {RDebugUtils.currentLine=46334220;
 //BA.debugLineNum = 46334220;BA.debugLine="If status=\"OK\" Then";
if ((_status).equals("OK")) { 
RDebugUtils.currentLine=46334221;
 //BA.debugLineNum = 46334221;BA.debugLine="MCode.SQL1.TransactionSuccessful";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .TransactionSuccessful();
RDebugUtils.currentLine=46334222;
 //BA.debugLineNum = 46334222;BA.debugLine="Btn_SendInfo_Click";
_btn_sendinfo_click();
 };
 } 
       catch (Exception e234) {
			processBA.setLastException(e234);RDebugUtils.currentLine=46334226;
 //BA.debugLineNum = 46334226;BA.debugLine="Log(LastException.Message)";
anywheresoftware.b4a.keywords.Common.LogImpl("546334226",anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getMessage(),0);
RDebugUtils.currentLine=46334227;
 //BA.debugLineNum = 46334227;BA.debugLine="If err=1 Then";
if (_err==1) { 
RDebugUtils.currentLine=46334228;
 //BA.debugLineNum = 46334228;BA.debugLine="ToastMessageShow(\"دریافت نقدی ناموفق بود\",Fals";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("دریافت نقدی ناموفق بود"),anywheresoftware.b4a.keywords.Common.False);
 }else 
{RDebugUtils.currentLine=46334229;
 //BA.debugLineNum = 46334229;BA.debugLine="else if err=2 Then";
if (_err==2) { 
RDebugUtils.currentLine=46334230;
 //BA.debugLineNum = 46334230;BA.debugLine="ToastMessageShow(\"دریافت بانکی ناموفق بود\",Fal";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("دریافت بانکی ناموفق بود"),anywheresoftware.b4a.keywords.Common.False);
 }else 
{RDebugUtils.currentLine=46334231;
 //BA.debugLineNum = 46334231;BA.debugLine="else if err=3 Then";
if (_err==3) { 
RDebugUtils.currentLine=46334232;
 //BA.debugLineNum = 46334232;BA.debugLine="ToastMessageShow(\"دریافت چکی ناموفق بود\",False";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("دریافت چکی ناموفق بود"),anywheresoftware.b4a.keywords.Common.False);
 }else 
{RDebugUtils.currentLine=46334233;
 //BA.debugLineNum = 46334233;BA.debugLine="else if err=4 Then";
if (_err==4) { 
RDebugUtils.currentLine=46334234;
 //BA.debugLineNum = 46334234;BA.debugLine="ToastMessageShow(\"ثبت تخفیف ناموفق بود\",False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("ثبت تخفیف ناموفق بود"),anywheresoftware.b4a.keywords.Common.False);
 }}}}
;
 };
RDebugUtils.currentLine=46334239;
 //BA.debugLineNum = 46334239;BA.debugLine="MCode.SQL1.EndTransaction";
mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .EndTransaction();
 } 
       catch (Exception e247) {
			processBA.setLastException(e247);RDebugUtils.currentLine=46334241;
 //BA.debugLineNum = 46334241;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("546334241",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=46334242;
 //BA.debugLineNum = 46334242;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-BtnSaveD_Click");
 };
RDebugUtils.currentLine=46334244;
 //BA.debugLineNum = 46334244;BA.debugLine="End Sub";
return "";
}
public static String  _clearalltext() throws Exception{
RDebugUtils.currentModule="act_mali";
if (Debug.shouldDelegate(mostCurrent.activityBA, "clearalltext", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "clearalltext", null));}
RDebugUtils.currentLine=46202880;
 //BA.debugLineNum = 46202880;BA.debugLine="Sub clearAllText";
RDebugUtils.currentLine=46202881;
 //BA.debugLineNum = 46202881;BA.debugLine="TxtMablaghNaghdi.Text=0";
mostCurrent._txtmablaghnaghdi.setText(BA.ObjectToCharSequence(0));
RDebugUtils.currentLine=46202882;
 //BA.debugLineNum = 46202882;BA.debugLine="TxtSharhNaghdi.Text=\"\"";
mostCurrent._txtsharhnaghdi.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=46202883;
 //BA.debugLineNum = 46202883;BA.debugLine="NSN_SandooghD.SelectedIndex=0";
mostCurrent._nsn_sandooghd.setSelectedIndex((int) (0));
RDebugUtils.currentLine=46202885;
 //BA.debugLineNum = 46202885;BA.debugLine="TxtMablaghBanki.Text=0";
mostCurrent._txtmablaghbanki.setText(BA.ObjectToCharSequence(0));
RDebugUtils.currentLine=46202886;
 //BA.debugLineNum = 46202886;BA.debugLine="TxtSharhBanki.Text=\"\"";
mostCurrent._txtsharhbanki.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=46202887;
 //BA.debugLineNum = 46202887;BA.debugLine="NSN_BankD.SelectedIndex=0";
mostCurrent._nsn_bankd.setSelectedIndex((int) (0));
RDebugUtils.currentLine=46202889;
 //BA.debugLineNum = 46202889;BA.debugLine="TxtMablaghChecki.Text=0";
mostCurrent._txtmablaghchecki.setText(BA.ObjectToCharSequence(0));
RDebugUtils.currentLine=46202890;
 //BA.debugLineNum = 46202890;BA.debugLine="TxtSharhChecki.Text=\"\"";
mostCurrent._txtsharhchecki.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=46202892;
 //BA.debugLineNum = 46202892;BA.debugLine="TxtDarsadTakhfif.Text=0";
mostCurrent._txtdarsadtakhfif.setText(BA.ObjectToCharSequence(0));
RDebugUtils.currentLine=46202893;
 //BA.debugLineNum = 46202893;BA.debugLine="TxtMablaghTakhfif.Text=0";
mostCurrent._txtmablaghtakhfif.setText(BA.ObjectToCharSequence(0));
RDebugUtils.currentLine=46202894;
 //BA.debugLineNum = 46202894;BA.debugLine="TxtSharhTakhfif.Text=\"\"";
mostCurrent._txtsharhtakhfif.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=46202896;
 //BA.debugLineNum = 46202896;BA.debugLine="TxtSharhKol.Text=\"\"";
mostCurrent._txtsharhkol.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=46202897;
 //BA.debugLineNum = 46202897;BA.debugLine="End Sub";
return "";
}
public static String  _nsn_bankd_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="act_mali";
if (Debug.shouldDelegate(mostCurrent.activityBA, "nsn_bankd_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "nsn_bankd_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=46071808;
 //BA.debugLineNum = 46071808;BA.debugLine="Sub NSN_BankD_ItemClick (Position As Int, Value As";
RDebugUtils.currentLine=46071809;
 //BA.debugLineNum = 46071809;BA.debugLine="Try";
try {RDebugUtils.currentLine=46071810;
 //BA.debugLineNum = 46071810;BA.debugLine="CodeBank1=lstCodeBank1.Get(Position)";
mostCurrent._codebank1 = BA.ObjectToString(mostCurrent._lstcodebank1.Get(_position));
RDebugUtils.currentLine=46071811;
 //BA.debugLineNum = 46071811;BA.debugLine="NameBank1=Value";
mostCurrent._namebank1 = BA.ObjectToString(_value);
RDebugUtils.currentLine=46071812;
 //BA.debugLineNum = 46071812;BA.debugLine="Log(CodeBank1)";
anywheresoftware.b4a.keywords.Common.LogImpl("546071812",mostCurrent._codebank1,0);
RDebugUtils.currentLine=46071813;
 //BA.debugLineNum = 46071813;BA.debugLine="Log(NameBank1)";
anywheresoftware.b4a.keywords.Common.LogImpl("546071813",mostCurrent._namebank1,0);
 } 
       catch (Exception e7) {
			processBA.setLastException(e7);RDebugUtils.currentLine=46071815;
 //BA.debugLineNum = 46071815;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("546071815",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=46071816;
 //BA.debugLineNum = 46071816;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-NSN_BankD_ItemClick");
 };
RDebugUtils.currentLine=46071818;
 //BA.debugLineNum = 46071818;BA.debugLine="End Sub";
return "";
}
public static String  _nsn_sandooghd_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="act_mali";
if (Debug.shouldDelegate(mostCurrent.activityBA, "nsn_sandooghd_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "nsn_sandooghd_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=46006272;
 //BA.debugLineNum = 46006272;BA.debugLine="Sub NSN_SandooghD_ItemClick (Position As Int, Valu";
RDebugUtils.currentLine=46006273;
 //BA.debugLineNum = 46006273;BA.debugLine="Try";
try {RDebugUtils.currentLine=46006274;
 //BA.debugLineNum = 46006274;BA.debugLine="CodeSandogh=lstCodeSandogh.Get(Position)";
mostCurrent._codesandogh = BA.ObjectToString(mostCurrent._lstcodesandogh.Get(_position));
RDebugUtils.currentLine=46006275;
 //BA.debugLineNum = 46006275;BA.debugLine="NameSandogh=Value";
mostCurrent._namesandogh = BA.ObjectToString(_value);
RDebugUtils.currentLine=46006276;
 //BA.debugLineNum = 46006276;BA.debugLine="Log(CodeSandogh)";
anywheresoftware.b4a.keywords.Common.LogImpl("546006276",mostCurrent._codesandogh,0);
RDebugUtils.currentLine=46006277;
 //BA.debugLineNum = 46006277;BA.debugLine="Log(NameSandogh)";
anywheresoftware.b4a.keywords.Common.LogImpl("546006277",mostCurrent._namesandogh,0);
 } 
       catch (Exception e7) {
			processBA.setLastException(e7);RDebugUtils.currentLine=46006279;
 //BA.debugLineNum = 46006279;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("546006279",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=46006280;
 //BA.debugLineNum = 46006280;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-NSN_SandooghD_ItemClick");
 };
RDebugUtils.currentLine=46006282;
 //BA.debugLineNum = 46006282;BA.debugLine="End Sub";
return "";
}
public static String  _savecheck() throws Exception{
RDebugUtils.currentModule="act_mali";
if (Debug.shouldDelegate(mostCurrent.activityBA, "savecheck", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "savecheck", null));}
String _mablagh = "";
RDebugUtils.currentLine=46596096;
 //BA.debugLineNum = 46596096;BA.debugLine="Public Sub SaveCheck";
RDebugUtils.currentLine=46596097;
 //BA.debugLineNum = 46596097;BA.debugLine="Try";
try {RDebugUtils.currentLine=46596098;
 //BA.debugLineNum = 46596098;BA.debugLine="lblCodeMoshtari.Text=MCode.C_Tafzili";
mostCurrent._lblcodemoshtari.setText(BA.ObjectToCharSequence(mostCurrent._mcode._c_tafzili /*String*/ ));
RDebugUtils.currentLine=46596099;
 //BA.debugLineNum = 46596099;BA.debugLine="lblNameMoshtari.Text=MCode.N_Tafzili";
mostCurrent._lblnamemoshtari.setText(BA.ObjectToCharSequence(mostCurrent._mcode._n_tafzili /*String*/ ));
RDebugUtils.currentLine=46596100;
 //BA.debugLineNum = 46596100;BA.debugLine="Dim mablagh As String=MCode.SingleResult(\"select";
_mablagh = BA.ObjectToString(mostCurrent._mcode._singleresult /*Object*/ (mostCurrent.activityBA,"select sum(fldMablagh) as fldMablagh from TblCheckDaryafti where fldShomareDaryaft="+mostCurrent._lblshomaredaryaft.getText()+" and fldShomareFactor="+_shomarefactor));
RDebugUtils.currentLine=46596101;
 //BA.debugLineNum = 46596101;BA.debugLine="If IsNumber(mablagh) Then";
if (anywheresoftware.b4a.keywords.Common.IsNumber(_mablagh)) { 
RDebugUtils.currentLine=46596102;
 //BA.debugLineNum = 46596102;BA.debugLine="TxtMablaghChecki.Text= NumberFormat2(mablagh,0,";
mostCurrent._txtmablaghchecki.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.NumberFormat2((double)(Double.parseDouble(_mablagh)),(int) (0),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.True)));
 }else {
RDebugUtils.currentLine=46596104;
 //BA.debugLineNum = 46596104;BA.debugLine="TxtMablaghChecki.Text=0";
mostCurrent._txtmablaghchecki.setText(BA.ObjectToCharSequence(0));
 };
 } 
       catch (Exception e11) {
			processBA.setLastException(e11);RDebugUtils.currentLine=46596107;
 //BA.debugLineNum = 46596107;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("546596107",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=46596108;
 //BA.debugLineNum = 46596108;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-SaveCheck");
 };
RDebugUtils.currentLine=46596110;
 //BA.debugLineNum = 46596110;BA.debugLine="End Sub";
return "";
}
public static String  _txtdarsadtakhfif_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="act_mali";
if (Debug.shouldDelegate(mostCurrent.activityBA, "txtdarsadtakhfif_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "txtdarsadtakhfif_textchanged", new Object[] {_old,_new}));}
long _no = 0L;
RDebugUtils.currentLine=46923776;
 //BA.debugLineNum = 46923776;BA.debugLine="Private Sub TxtDarsadTakhfif_TextChanged (Old As S";
RDebugUtils.currentLine=46923777;
 //BA.debugLineNum = 46923777;BA.debugLine="Try";
try {RDebugUtils.currentLine=46923778;
 //BA.debugLineNum = 46923778;BA.debugLine="Dim no As Long";
_no = 0L;
RDebugUtils.currentLine=46923779;
 //BA.debugLineNum = 46923779;BA.debugLine="If MCode.ConvertNumbersPersian2English(Old) <> M";
if ((mostCurrent._mcode._convertnumberspersian2english /*String*/ (mostCurrent.activityBA,_old)).equals(mostCurrent._mcode._convertnumberspersian2english /*String*/ (mostCurrent.activityBA,_new)) == false) { 
RDebugUtils.currentLine=46923780;
 //BA.debugLineNum = 46923780;BA.debugLine="Try";
try {RDebugUtils.currentLine=46923782;
 //BA.debugLineNum = 46923782;BA.debugLine="no = TxtDarsadTakhfif.Text";
_no = (long)(Double.parseDouble(mostCurrent._txtdarsadtakhfif.getText()));
RDebugUtils.currentLine=46923783;
 //BA.debugLineNum = 46923783;BA.debugLine="If no>100 Then";
if (_no>100) { 
RDebugUtils.currentLine=46923784;
 //BA.debugLineNum = 46923784;BA.debugLine="no=Old";
_no = (long)(Double.parseDouble(_old));
 };
RDebugUtils.currentLine=46923786;
 //BA.debugLineNum = 46923786;BA.debugLine="txtchanged=True";
_txtchanged = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=46923788;
 //BA.debugLineNum = 46923788;BA.debugLine="Log(no)";
anywheresoftware.b4a.keywords.Common.LogImpl("546923788",BA.NumberToString(_no),0);
 } 
       catch (Exception e12) {
			processBA.setLastException(e12);RDebugUtils.currentLine=46923790;
 //BA.debugLineNum = 46923790;BA.debugLine="no=0";
_no = (long) (0);
RDebugUtils.currentLine=46923791;
 //BA.debugLineNum = 46923791;BA.debugLine="TxtDarsadTakhfif.Text=\"0\"";
mostCurrent._txtdarsadtakhfif.setText(BA.ObjectToCharSequence("0"));
 };
 };
RDebugUtils.currentLine=46923794;
 //BA.debugLineNum = 46923794;BA.debugLine="If txtchanged Then";
if (_txtchanged) { 
RDebugUtils.currentLine=46923795;
 //BA.debugLineNum = 46923795;BA.debugLine="txtchanged=False";
_txtchanged = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=46923796;
 //BA.debugLineNum = 46923796;BA.debugLine="TxtDarsadTakhfif.Tag=no";
mostCurrent._txtdarsadtakhfif.setTag((Object)(_no));
RDebugUtils.currentLine=46923797;
 //BA.debugLineNum = 46923797;BA.debugLine="TxtDarsadTakhfif.Text=no";
mostCurrent._txtdarsadtakhfif.setText(BA.ObjectToCharSequence(_no));
 };
RDebugUtils.currentLine=46923799;
 //BA.debugLineNum = 46923799;BA.debugLine="TxtDarsadTakhfif.SelectionStart=TxtDarsadTakhfif";
mostCurrent._txtdarsadtakhfif.setSelectionStart(mostCurrent._txtdarsadtakhfif.getText().length());
 } 
       catch (Exception e23) {
			processBA.setLastException(e23);RDebugUtils.currentLine=46923801;
 //BA.debugLineNum = 46923801;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("546923801",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=46923802;
 //BA.debugLineNum = 46923802;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-TxtDarsadTakhfif_TextChanged");
 };
RDebugUtils.currentLine=46923804;
 //BA.debugLineNum = 46923804;BA.debugLine="End Sub";
return "";
}
public static String  _txtmablaghbanki_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="act_mali";
if (Debug.shouldDelegate(mostCurrent.activityBA, "txtmablaghbanki_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "txtmablaghbanki_textchanged", new Object[] {_old,_new}));}
long _no = 0L;
RDebugUtils.currentLine=46792704;
 //BA.debugLineNum = 46792704;BA.debugLine="Private Sub TxtMablaghBanki_TextChanged (Old As St";
RDebugUtils.currentLine=46792705;
 //BA.debugLineNum = 46792705;BA.debugLine="Try";
try {RDebugUtils.currentLine=46792706;
 //BA.debugLineNum = 46792706;BA.debugLine="Dim no As Long";
_no = 0L;
RDebugUtils.currentLine=46792707;
 //BA.debugLineNum = 46792707;BA.debugLine="If MCode.ConvertNumbersPersian2English(Old) <> M";
if ((mostCurrent._mcode._convertnumberspersian2english /*String*/ (mostCurrent.activityBA,_old)).equals(mostCurrent._mcode._convertnumberspersian2english /*String*/ (mostCurrent.activityBA,_new)) == false) { 
RDebugUtils.currentLine=46792708;
 //BA.debugLineNum = 46792708;BA.debugLine="Try";
try {RDebugUtils.currentLine=46792709;
 //BA.debugLineNum = 46792709;BA.debugLine="no = TxtMablaghBanki.Text.Replace(\",\",\"\")";
_no = (long)(Double.parseDouble(mostCurrent._txtmablaghbanki.getText().replace(",","")));
RDebugUtils.currentLine=46792710;
 //BA.debugLineNum = 46792710;BA.debugLine="txtchanged=True";
_txtchanged = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=46792711;
 //BA.debugLineNum = 46792711;BA.debugLine="Log(no)";
anywheresoftware.b4a.keywords.Common.LogImpl("546792711",BA.NumberToString(_no),0);
 } 
       catch (Exception e9) {
			processBA.setLastException(e9);RDebugUtils.currentLine=46792713;
 //BA.debugLineNum = 46792713;BA.debugLine="no=0";
_no = (long) (0);
RDebugUtils.currentLine=46792714;
 //BA.debugLineNum = 46792714;BA.debugLine="TxtMablaghBanki.Text=\"0\"";
mostCurrent._txtmablaghbanki.setText(BA.ObjectToCharSequence("0"));
 };
 };
RDebugUtils.currentLine=46792717;
 //BA.debugLineNum = 46792717;BA.debugLine="If txtchanged Then";
if (_txtchanged) { 
RDebugUtils.currentLine=46792718;
 //BA.debugLineNum = 46792718;BA.debugLine="txtchanged=False";
_txtchanged = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=46792719;
 //BA.debugLineNum = 46792719;BA.debugLine="TxtMablaghBanki.Tag=no";
mostCurrent._txtmablaghbanki.setTag((Object)(_no));
RDebugUtils.currentLine=46792720;
 //BA.debugLineNum = 46792720;BA.debugLine="TxtMablaghBanki.Text=NumberFormat2(no,0,0,0,Tru";
mostCurrent._txtmablaghbanki.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.NumberFormat2(_no,(int) (0),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.True)));
 };
RDebugUtils.currentLine=46792722;
 //BA.debugLineNum = 46792722;BA.debugLine="TxtMablaghBanki.SetSelection(TxtMablaghBanki.Tex";
mostCurrent._txtmablaghbanki.SetSelection(mostCurrent._txtmablaghbanki.getText().length(),(int) (0));
 } 
       catch (Exception e20) {
			processBA.setLastException(e20);RDebugUtils.currentLine=46792724;
 //BA.debugLineNum = 46792724;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("546792724",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=46792725;
 //BA.debugLineNum = 46792725;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-TxtMablaghBanki_TextChanged");
 };
RDebugUtils.currentLine=46792727;
 //BA.debugLineNum = 46792727;BA.debugLine="End Sub";
return "";
}
public static String  _txtmablaghchecki_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="act_mali";
if (Debug.shouldDelegate(mostCurrent.activityBA, "txtmablaghchecki_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "txtmablaghchecki_textchanged", new Object[] {_old,_new}));}
long _no = 0L;
RDebugUtils.currentLine=46858240;
 //BA.debugLineNum = 46858240;BA.debugLine="Private Sub TxtMablaghChecki_TextChanged (Old As S";
RDebugUtils.currentLine=46858241;
 //BA.debugLineNum = 46858241;BA.debugLine="Try";
try {RDebugUtils.currentLine=46858242;
 //BA.debugLineNum = 46858242;BA.debugLine="Dim no As Long";
_no = 0L;
RDebugUtils.currentLine=46858243;
 //BA.debugLineNum = 46858243;BA.debugLine="If MCode.ConvertNumbersPersian2English(Old) <> M";
if ((mostCurrent._mcode._convertnumberspersian2english /*String*/ (mostCurrent.activityBA,_old)).equals(mostCurrent._mcode._convertnumberspersian2english /*String*/ (mostCurrent.activityBA,_new)) == false) { 
RDebugUtils.currentLine=46858244;
 //BA.debugLineNum = 46858244;BA.debugLine="Try";
try {RDebugUtils.currentLine=46858245;
 //BA.debugLineNum = 46858245;BA.debugLine="no = TxtMablaghChecki.Text.Replace(\",\",\"\")";
_no = (long)(Double.parseDouble(mostCurrent._txtmablaghchecki.getText().replace(",","")));
RDebugUtils.currentLine=46858246;
 //BA.debugLineNum = 46858246;BA.debugLine="txtchanged=True";
_txtchanged = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=46858247;
 //BA.debugLineNum = 46858247;BA.debugLine="Log(no)";
anywheresoftware.b4a.keywords.Common.LogImpl("546858247",BA.NumberToString(_no),0);
 } 
       catch (Exception e9) {
			processBA.setLastException(e9);RDebugUtils.currentLine=46858249;
 //BA.debugLineNum = 46858249;BA.debugLine="no=0";
_no = (long) (0);
RDebugUtils.currentLine=46858250;
 //BA.debugLineNum = 46858250;BA.debugLine="TxtMablaghChecki.Text=\"0\"";
mostCurrent._txtmablaghchecki.setText(BA.ObjectToCharSequence("0"));
 };
 };
RDebugUtils.currentLine=46858253;
 //BA.debugLineNum = 46858253;BA.debugLine="If txtchanged Then";
if (_txtchanged) { 
RDebugUtils.currentLine=46858254;
 //BA.debugLineNum = 46858254;BA.debugLine="txtchanged=False";
_txtchanged = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=46858255;
 //BA.debugLineNum = 46858255;BA.debugLine="TxtMablaghChecki.Tag=no";
mostCurrent._txtmablaghchecki.setTag((Object)(_no));
RDebugUtils.currentLine=46858256;
 //BA.debugLineNum = 46858256;BA.debugLine="TxtMablaghChecki.Text=NumberFormat2(no,0,0,0,Tr";
mostCurrent._txtmablaghchecki.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.NumberFormat2(_no,(int) (0),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.True)));
 };
RDebugUtils.currentLine=46858258;
 //BA.debugLineNum = 46858258;BA.debugLine="TxtMablaghChecki.SetSelection(TxtMablaghChecki.T";
mostCurrent._txtmablaghchecki.SetSelection(mostCurrent._txtmablaghchecki.getText().length(),(int) (0));
 } 
       catch (Exception e20) {
			processBA.setLastException(e20);RDebugUtils.currentLine=46858260;
 //BA.debugLineNum = 46858260;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("546858260",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=46858261;
 //BA.debugLineNum = 46858261;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-TxtMablaghChecki_TextChanged");
 };
RDebugUtils.currentLine=46858263;
 //BA.debugLineNum = 46858263;BA.debugLine="End Sub";
return "";
}
public static String  _txtmablaghnaghdi_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="act_mali";
if (Debug.shouldDelegate(mostCurrent.activityBA, "txtmablaghnaghdi_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "txtmablaghnaghdi_textchanged", new Object[] {_old,_new}));}
long _no = 0L;
RDebugUtils.currentLine=46661632;
 //BA.debugLineNum = 46661632;BA.debugLine="Sub TxtMablaghNaghdi_TextChanged (Old As String, N";
RDebugUtils.currentLine=46661633;
 //BA.debugLineNum = 46661633;BA.debugLine="Try";
try {RDebugUtils.currentLine=46661634;
 //BA.debugLineNum = 46661634;BA.debugLine="Dim no As Long";
_no = 0L;
RDebugUtils.currentLine=46661635;
 //BA.debugLineNum = 46661635;BA.debugLine="If MCode.ConvertNumbersPersian2English(Old) <> M";
if ((mostCurrent._mcode._convertnumberspersian2english /*String*/ (mostCurrent.activityBA,_old)).equals(mostCurrent._mcode._convertnumberspersian2english /*String*/ (mostCurrent.activityBA,_new)) == false) { 
RDebugUtils.currentLine=46661636;
 //BA.debugLineNum = 46661636;BA.debugLine="Try";
try {RDebugUtils.currentLine=46661637;
 //BA.debugLineNum = 46661637;BA.debugLine="no = TxtMablaghNaghdi.Text.Replace(\",\",\"\")";
_no = (long)(Double.parseDouble(mostCurrent._txtmablaghnaghdi.getText().replace(",","")));
RDebugUtils.currentLine=46661638;
 //BA.debugLineNum = 46661638;BA.debugLine="txtchanged=True";
_txtchanged = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=46661639;
 //BA.debugLineNum = 46661639;BA.debugLine="Log(no)";
anywheresoftware.b4a.keywords.Common.LogImpl("546661639",BA.NumberToString(_no),0);
 } 
       catch (Exception e9) {
			processBA.setLastException(e9);RDebugUtils.currentLine=46661641;
 //BA.debugLineNum = 46661641;BA.debugLine="no=0";
_no = (long) (0);
RDebugUtils.currentLine=46661642;
 //BA.debugLineNum = 46661642;BA.debugLine="TxtMablaghNaghdi.Text=\"0\"";
mostCurrent._txtmablaghnaghdi.setText(BA.ObjectToCharSequence("0"));
 };
 };
RDebugUtils.currentLine=46661645;
 //BA.debugLineNum = 46661645;BA.debugLine="If txtchanged Then";
if (_txtchanged) { 
RDebugUtils.currentLine=46661646;
 //BA.debugLineNum = 46661646;BA.debugLine="txtchanged=False";
_txtchanged = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=46661647;
 //BA.debugLineNum = 46661647;BA.debugLine="TxtMablaghNaghdi.Tag=no";
mostCurrent._txtmablaghnaghdi.setTag((Object)(_no));
RDebugUtils.currentLine=46661648;
 //BA.debugLineNum = 46661648;BA.debugLine="TxtMablaghNaghdi.Text=NumberFormat2(no,0,0,0,Tr";
mostCurrent._txtmablaghnaghdi.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.NumberFormat2(_no,(int) (0),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.True)));
 };
RDebugUtils.currentLine=46661650;
 //BA.debugLineNum = 46661650;BA.debugLine="TxtMablaghNaghdi.SetSelection(TxtMablaghNaghdi.T";
mostCurrent._txtmablaghnaghdi.SetSelection(mostCurrent._txtmablaghnaghdi.getText().length(),(int) (0));
 } 
       catch (Exception e20) {
			processBA.setLastException(e20);RDebugUtils.currentLine=46661652;
 //BA.debugLineNum = 46661652;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("546661652",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=46661653;
 //BA.debugLineNum = 46661653;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-TxtMablaghNaghdi_TextChanged");
 };
RDebugUtils.currentLine=46661655;
 //BA.debugLineNum = 46661655;BA.debugLine="End Sub";
return "";
}
public static String  _txtmablaghtakhfif_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="act_mali";
if (Debug.shouldDelegate(mostCurrent.activityBA, "txtmablaghtakhfif_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "txtmablaghtakhfif_textchanged", new Object[] {_old,_new}));}
long _no = 0L;
RDebugUtils.currentLine=46989312;
 //BA.debugLineNum = 46989312;BA.debugLine="Private Sub TxtMablaghTakhfif_TextChanged (Old As";
RDebugUtils.currentLine=46989313;
 //BA.debugLineNum = 46989313;BA.debugLine="Dim no As Long";
_no = 0L;
RDebugUtils.currentLine=46989314;
 //BA.debugLineNum = 46989314;BA.debugLine="If MCode.ConvertNumbersPersian2English(Old) <> MC";
if ((mostCurrent._mcode._convertnumberspersian2english /*String*/ (mostCurrent.activityBA,_old)).equals(mostCurrent._mcode._convertnumberspersian2english /*String*/ (mostCurrent.activityBA,_new)) == false) { 
RDebugUtils.currentLine=46989315;
 //BA.debugLineNum = 46989315;BA.debugLine="Try";
try {RDebugUtils.currentLine=46989316;
 //BA.debugLineNum = 46989316;BA.debugLine="no = TxtMablaghTakhfif.Text.Replace(\",\",\"\")";
_no = (long)(Double.parseDouble(mostCurrent._txtmablaghtakhfif.getText().replace(",","")));
RDebugUtils.currentLine=46989317;
 //BA.debugLineNum = 46989317;BA.debugLine="txtchanged=True";
_txtchanged = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=46989318;
 //BA.debugLineNum = 46989318;BA.debugLine="Log(no)";
anywheresoftware.b4a.keywords.Common.LogImpl("546989318",BA.NumberToString(_no),0);
 } 
       catch (Exception e8) {
			processBA.setLastException(e8);RDebugUtils.currentLine=46989320;
 //BA.debugLineNum = 46989320;BA.debugLine="no=0";
_no = (long) (0);
RDebugUtils.currentLine=46989321;
 //BA.debugLineNum = 46989321;BA.debugLine="TxtMablaghTakhfif.Text=\"0\"";
mostCurrent._txtmablaghtakhfif.setText(BA.ObjectToCharSequence("0"));
 };
 };
RDebugUtils.currentLine=46989324;
 //BA.debugLineNum = 46989324;BA.debugLine="If txtchanged Then";
if (_txtchanged) { 
RDebugUtils.currentLine=46989325;
 //BA.debugLineNum = 46989325;BA.debugLine="txtchanged=False";
_txtchanged = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=46989326;
 //BA.debugLineNum = 46989326;BA.debugLine="TxtMablaghTakhfif.Tag=no";
mostCurrent._txtmablaghtakhfif.setTag((Object)(_no));
RDebugUtils.currentLine=46989327;
 //BA.debugLineNum = 46989327;BA.debugLine="TxtMablaghTakhfif.Text=NumberFormat2(no,0,0,0,Tr";
mostCurrent._txtmablaghtakhfif.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.NumberFormat2(_no,(int) (0),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.True)));
 };
RDebugUtils.currentLine=46989329;
 //BA.debugLineNum = 46989329;BA.debugLine="TxtMablaghTakhfif.SetSelection(TxtMablaghTakhfif.";
mostCurrent._txtmablaghtakhfif.SetSelection(mostCurrent._txtmablaghtakhfif.getText().length(),(int) (0));
RDebugUtils.currentLine=46989330;
 //BA.debugLineNum = 46989330;BA.debugLine="End Sub";
return "";
}
}