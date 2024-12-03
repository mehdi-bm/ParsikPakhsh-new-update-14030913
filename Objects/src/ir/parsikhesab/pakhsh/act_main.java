package ir.parsikhesab.pakhsh;

import java.util.concurrent.Callable;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import java.io.PrintWriter;
import java.io.StringWriter;

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

public class act_main extends androidx.appcompat.app.AppCompatActivity implements B4AActivity{
	public static act_main mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.act_main");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (act_main).");
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
		activityBA = new BA(this, layout, processBA, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.act_main");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "ir.parsikhesab.pakhsh.act_main", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (act_main) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (act_main) Resume **");
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
		return act_main.class;
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
            BA.LogInfo("** Activity (act_main) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (act_main) Pause event (activity is not paused). **");
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
            act_main mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (act_main) Resume **");
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
public static anywheresoftware.b4a.objects.Timer _t_enterexit = null;
public static anywheresoftware.b4a.objects.Timer _t_exit = null;
public static anywheresoftware.b4a.objects.Timer _t_datacheck = null;
public static String _noeget = "";
public static anywheresoftware.b4a.objects.Timer _t_gps = null;
public ir.parsikhesab.pakhsh.httpjob _jobinternet = null;
public anywheresoftware.b4a.objects.SlidingMenuWrapper _sidemenu = null;
public anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog _dialoggetdata = null;
public anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog _dialogbackup = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnbackmenu = null;
public b4a.example3.customlistview _clv1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _pcantent = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnl_body1 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_search = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblappname = null;
public anywheresoftware.b4a.objects.LabelWrapper _label2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblver = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlmenu = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnl_top = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_menu = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_mnutext = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button3 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button2 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnl_bottom = null;
public ir.parsikhesab.pakhsh.cls_submenu1 _submenu1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_title = null;
public b4a.example3.customlistview _clvh = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.RuntimePermissions _rp = null;
public static byte _intexit = (byte)0;
public ir.parsikhesab.pakhsh.scrollinglabel _lbl_etelaeresani = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlgetdata = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlsenddata = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlsabtesefaresh = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlnewmoshtari = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_menuimei = null;
public b4a.util.BClipboard _clip = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblvisitorname = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_codevisitor = null;
public ir.parsikhesab.pakhsh.asbuttonslider _asb1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltext = null;
public anywheresoftware.b4a.objects.MapFragmentWrapper.GoogleMapWrapper _gmap = null;
public static int _vaziat = 0;
public static String _lat = "";
public static String _lon = "";
public static boolean _modeenterexit = false;
public anywheresoftware.b4a.objects.PanelWrapper _pnlreport = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlmoshtarian = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button4 = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlshift = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnl_bk = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlbackup = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlbak = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtbackupfile = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnbackuppnl = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnclosebackuppnl = null;
public ir.parsikhesab.pakhsh.cl_appupdate _apkupdt = null;
public static String _verflag = "";
public anywheresoftware.b4a.objects.PanelWrapper _pnl_smartphone = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnl_map = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_lock = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btncloseactivate = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtcodemoshtari = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtnamevisitor = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnsendactivate = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlactivate = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblvaziat = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlactivestatus = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btndarkmode = null;
public anywheresoftware.b4a.objects.LabelWrapper _label7 = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnltopactivate = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnltabligh = null;
public anywheresoftware.b4a.objects.MapFragmentWrapper _mapfragment1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_dateversion = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnldateversion = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlimei = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnl_havale = null;
public wir.hitex.recycler.Hitex_LayoutView _hlv = null;
public anywheresoftware.b4a.objects.collections.List _listitemhome = null;
public anywheresoftware.b4a.objects.collections.List _listtempitemhome = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnl_body2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblversion1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblversionnumber1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbldateversion1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltypeversion = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblimei2 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnsetting = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltypeversion1 = null;
public igolub.fused.b4a.location.android.location.LocationFWrapper.LocationFStatic _locationf = null;
public igolub.fused.b4a.location.LocationResultWrapper.LocationResultConstants _locationresult = null;
public igolub.fused.b4a.location.LocationRequestWrapper.LocationRequestConstants _locationrequest = null;
public igolub.fused.b4a.location.staticmodules.PriorityWrapper _priority = null;
public igolub.fused.b4a.location.staticmodules.GranularityWrapper _granularity = null;
public igolub.permissionmanager.b4a.PermissionsManagerFileProvider _fileprovider = null;
public igolub.permissionmanager.b4a.PermissionsManagerConstants _permissionsmanager = null;
public b4a.example.dateutils _dateutils = null;
public ir.parsikhesab.pakhsh.main _main = null;
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
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="act_main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
anywheresoftware.b4a.objects.PanelWrapper _p = null;
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="Try";
try {RDebugUtils.currentLine=1245187;
 //BA.debugLineNum = 1245187;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=1245188;
 //BA.debugLineNum = 1245188;BA.debugLine="MCode.UpdateDataBase";
mostCurrent._mcode._updatedatabase /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=1245189;
 //BA.debugLineNum = 1245189;BA.debugLine="MCode.UpdateSetting";
mostCurrent._mcode._updatesetting /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=1245190;
 //BA.debugLineNum = 1245190;BA.debugLine="gps.Initialize(\"gps\")";
_gps.Initialize("gps");
RDebugUtils.currentLine=1245192;
 //BA.debugLineNum = 1245192;BA.debugLine="sidemenu.Initialize(\"sidmenu\")";
mostCurrent._sidemenu.Initialize(mostCurrent.activityBA,"sidmenu");
RDebugUtils.currentLine=1245193;
 //BA.debugLineNum = 1245193;BA.debugLine="sidemenu.Menu.LoadLayout(\"mainmenulyr\")";
mostCurrent._sidemenu.getMenu().LoadLayout("mainmenulyr",mostCurrent.activityBA);
RDebugUtils.currentLine=1245194;
 //BA.debugLineNum = 1245194;BA.debugLine="sidemenu.Mode=sidemenu.RIGHT";
mostCurrent._sidemenu.setMode(mostCurrent._sidemenu.RIGHT);
RDebugUtils.currentLine=1245195;
 //BA.debugLineNum = 1245195;BA.debugLine="sidemenu.BehindOffset=33%x";
mostCurrent._sidemenu.setBehindOffset(anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (33),mostCurrent.activityBA));
RDebugUtils.currentLine=1245197;
 //BA.debugLineNum = 1245197;BA.debugLine="jobInternet.Initialize(\"jobInternet\",Me)";
mostCurrent._jobinternet._initialize /*String*/ (null,processBA,"jobInternet",act_main.getObject());
RDebugUtils.currentLine=1245203;
 //BA.debugLineNum = 1245203;BA.debugLine="lblAppName.Text=MCode.AppName";
mostCurrent._lblappname.setText(BA.ObjectToCharSequence(mostCurrent._mcode._appname /*String*/ ));
RDebugUtils.currentLine=1245204;
 //BA.debugLineNum = 1245204;BA.debugLine="If MCode.TypeVersion=\"Stable\" Then";
if ((mostCurrent._mcode._typeversion /*String*/ ).equals("Stable")) { 
RDebugUtils.currentLine=1245205;
 //BA.debugLineNum = 1245205;BA.debugLine="apkupdt.Initialize(Me,\"update\")";
mostCurrent._apkupdt._initialize /*String*/ (null,mostCurrent.activityBA,act_main.getObject(),"update");
RDebugUtils.currentLine=1245206;
 //BA.debugLineNum = 1245206;BA.debugLine="apkupdt.Verbose = True";
mostCurrent._apkupdt._setverbose(null,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1245207;
 //BA.debugLineNum = 1245207;BA.debugLine="VerFlag=\"checkupdate\"";
mostCurrent._verflag = "checkupdate";
RDebugUtils.currentLine=1245208;
 //BA.debugLineNum = 1245208;BA.debugLine="btnCompare_Click";
_btncompare_click();
RDebugUtils.currentLine=1245209;
 //BA.debugLineNum = 1245209;BA.debugLine="lblTypeVersion.Text=\"نوع نسخه : عمومی\"";
mostCurrent._lbltypeversion.setText(BA.ObjectToCharSequence("نوع نسخه : عمومی"));
 }else 
{RDebugUtils.currentLine=1245210;
 //BA.debugLineNum = 1245210;BA.debugLine="Else if MCode.TypeVersion=\"UpdateNew\" Then";
if ((mostCurrent._mcode._typeversion /*String*/ ).equals("UpdateNew")) { 
RDebugUtils.currentLine=1245211;
 //BA.debugLineNum = 1245211;BA.debugLine="lblTypeVersion.Text=\"نوع نسخه : اختصاصی\"";
mostCurrent._lbltypeversion.setText(BA.ObjectToCharSequence("نوع نسخه : اختصاصی"));
 }}
;
RDebugUtils.currentLine=1245214;
 //BA.debugLineNum = 1245214;BA.debugLine="If MCode.PrinterType=1 Then";
if (mostCurrent._mcode._printertype /*int*/ ==1) { 
RDebugUtils.currentLine=1245215;
 //BA.debugLineNum = 1245215;BA.debugLine="apkupdt.Initialize(Me,\"update\")";
mostCurrent._apkupdt._initialize /*String*/ (null,mostCurrent.activityBA,act_main.getObject(),"update");
RDebugUtils.currentLine=1245216;
 //BA.debugLineNum = 1245216;BA.debugLine="apkupdt.Verbose = True";
mostCurrent._apkupdt._setverbose(null,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1245217;
 //BA.debugLineNum = 1245217;BA.debugLine="VerFlag=\"checkupdate\"";
mostCurrent._verflag = "checkupdate";
RDebugUtils.currentLine=1245218;
 //BA.debugLineNum = 1245218;BA.debugLine="btnCompare_Click";
_btncompare_click();
RDebugUtils.currentLine=1245219;
 //BA.debugLineNum = 1245219;BA.debugLine="lblTypeVersion.Text=\"نوع نسخه : کارتخوان\"";
mostCurrent._lbltypeversion.setText(BA.ObjectToCharSequence("نوع نسخه : کارتخوان"));
 };
RDebugUtils.currentLine=1245222;
 //BA.debugLineNum = 1245222;BA.debugLine="Label2.Text=MCode.MenuTitle2";
mostCurrent._label2.setText(BA.ObjectToCharSequence(mostCurrent._mcode._menutitle2 /*String*/ ));
RDebugUtils.currentLine=1245224;
 //BA.debugLineNum = 1245224;BA.debugLine="subMenu1.Initialize(Me,pnlMenu.Width)";
mostCurrent._submenu1._initialize /*String*/ (null,mostCurrent.activityBA,act_main.getObject(),mostCurrent._pnlmenu.getWidth());
RDebugUtils.currentLine=1245225;
 //BA.debugLineNum = 1245225;BA.debugLine="clv1.Add(subMenu1.Panel,subMenu1)";
mostCurrent._clv1._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(mostCurrent._submenu1._getpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ (null).getObject())),(Object)(mostCurrent._submenu1));
RDebugUtils.currentLine=1245227;
 //BA.debugLineNum = 1245227;BA.debugLine="pCantent.Initialize(\"\")";
mostCurrent._pcantent.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=1245228;
 //BA.debugLineNum = 1245228;BA.debugLine="pCantent.SetLayout(0,0,100%x,100%y)";
mostCurrent._pcantent.SetLayout((int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=1245229;
 //BA.debugLineNum = 1245229;BA.debugLine="Activity.AddView(pCantent,0,0,100%x,100%y)";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._pcantent.getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=1245231;
 //BA.debugLineNum = 1245231;BA.debugLine="pCantent.LoadLayout(\"L_Body\")";
mostCurrent._pcantent.LoadLayout("L_Body",mostCurrent.activityBA);
RDebugUtils.currentLine=1245240;
 //BA.debugLineNum = 1245240;BA.debugLine="lbl_Title.text = Application.LabelName";
mostCurrent._lbl_title.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Application.getLabelName()));
RDebugUtils.currentLine=1245241;
 //BA.debugLineNum = 1245241;BA.debugLine="pnl_body1.LoadLayout(\"L_CLV\")";
mostCurrent._pnl_body1.LoadLayout("L_CLV",mostCurrent.activityBA);
RDebugUtils.currentLine=1245242;
 //BA.debugLineNum = 1245242;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=1245243;
 //BA.debugLineNum = 1245243;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=1245244;
 //BA.debugLineNum = 1245244;BA.debugLine="p.SetLayout(0,0,pnl_body1.Width,120%y)";
_p.SetLayout((int) (0),(int) (0),mostCurrent._pnl_body1.getWidth(),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (120),mostCurrent.activityBA));
RDebugUtils.currentLine=1245248;
 //BA.debugLineNum = 1245248;BA.debugLine="p.LoadLayout(\"L_HomeBody\")";
_p.LoadLayout("L_HomeBody",mostCurrent.activityBA);
RDebugUtils.currentLine=1245249;
 //BA.debugLineNum = 1245249;BA.debugLine="clvH.Add(p,0)";
mostCurrent._clvh._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_p.getObject())),(Object)(0));
RDebugUtils.currentLine=1245251;
 //BA.debugLineNum = 1245251;BA.debugLine="HLV.Initializer(\"HLV\").GridView(2).Build";
mostCurrent._hlv.Initializer(mostCurrent.activityBA,"HLV").GridView((int) (2)).Build();
RDebugUtils.currentLine=1245252;
 //BA.debugLineNum = 1245252;BA.debugLine="ListItemHome.Initialize";
mostCurrent._listitemhome.Initialize();
RDebugUtils.currentLine=1245253;
 //BA.debugLineNum = 1245253;BA.debugLine="ListTempItemHome.Initialize";
mostCurrent._listtempitemhome.Initialize();
RDebugUtils.currentLine=1245258;
 //BA.debugLineNum = 1245258;BA.debugLine="StartService(Service_Helper)";
anywheresoftware.b4a.keywords.Common.StartService(processBA,(Object)(mostCurrent._service_helper.getObject()));
RDebugUtils.currentLine=1245263;
 //BA.debugLineNum = 1245263;BA.debugLine="CreateLabel(ASB1.LeftTopPnl,\"اتمام ویزیت\",xui.Cr";
_createlabel(mostCurrent._asb1._getlefttoppnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null),"اتمام ویزیت",mostCurrent._xui.CreateDefaultBoldFont((float) (15)));
RDebugUtils.currentLine=1245264;
 //BA.debugLineNum = 1245264;BA.debugLine="CreateLabel(ASB1.RightBottomPnl,\"شروع ویزیت\",xui";
_createlabel(mostCurrent._asb1._getrightbottompnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null),"شروع ویزیت",mostCurrent._xui.CreateDefaultBoldFont((float) (15)));
RDebugUtils.currentLine=1245265;
 //BA.debugLineNum = 1245265;BA.debugLine="T_EnterExit.Initialize(\"T_EnterExit\",5000)";
_t_enterexit.Initialize(processBA,"T_EnterExit",(long) (5000));
RDebugUtils.currentLine=1245266;
 //BA.debugLineNum = 1245266;BA.debugLine="T_Exit.Initialize(\"T_Exit\",1500)";
_t_exit.Initialize(processBA,"T_Exit",(long) (1500));
RDebugUtils.currentLine=1245269;
 //BA.debugLineNum = 1245269;BA.debugLine="MCode.page=\"Act_Main\"";
mostCurrent._mcode._page /*String*/  = "Act_Main";
 } 
       catch (Exception e52) {
			processBA.setLastException(e52);RDebugUtils.currentLine=1245272;
 //BA.debugLineNum = 1245272;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("51245272",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=1245273;
 //BA.debugLineNum = 1245273;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-Activity_Create");
 };
RDebugUtils.currentLine=1245275;
 //BA.debugLineNum = 1245275;BA.debugLine="End Sub";
return "";
}
public static String  _btncompare_click() throws Exception{
RDebugUtils.currentModule="act_main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btncompare_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btncompare_click", null));}
RDebugUtils.currentLine=4784128;
 //BA.debugLineNum = 4784128;BA.debugLine="Sub btnCompare_Click";
RDebugUtils.currentLine=4784129;
 //BA.debugLineNum = 4784129;BA.debugLine="Try";
try {RDebugUtils.currentLine=4784130;
 //BA.debugLineNum = 4784130;BA.debugLine="VerFlag=\"checkupdate\"";
mostCurrent._verflag = "checkupdate";
RDebugUtils.currentLine=4784131;
 //BA.debugLineNum = 4784131;BA.debugLine="GetVersion";
_getversion();
 } 
       catch (Exception e5) {
			processBA.setLastException(e5);RDebugUtils.currentLine=4784133;
 //BA.debugLineNum = 4784133;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("54784133",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=4784134;
 //BA.debugLineNum = 4784134;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-btnCompare_Click");
 };
RDebugUtils.currentLine=4784136;
 //BA.debugLineNum = 4784136;BA.debugLine="End Sub";
return "";
}
public static String  _createlabel(anywheresoftware.b4a.objects.B4XViewWrapper _parent,String _text,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _font) throws Exception{
RDebugUtils.currentModule="act_main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createlabel", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "createlabel", new Object[] {_parent,_text,_font}));}
anywheresoftware.b4a.objects.LabelWrapper _tmp_lbl = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xtmp_lbl = null;
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Private Sub CreateLabel(Parent As B4XView,Text As";
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="Dim tmp_lbl As Label";
_tmp_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=1835011;
 //BA.debugLineNum = 1835011;BA.debugLine="tmp_lbl.Initialize(\"\")";
_tmp_lbl.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=1835012;
 //BA.debugLineNum = 1835012;BA.debugLine="Dim xtmp_lbl As B4XView = tmp_lbl";
_xtmp_lbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xtmp_lbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_tmp_lbl.getObject()));
RDebugUtils.currentLine=1835014;
 //BA.debugLineNum = 1835014;BA.debugLine="Parent.AddView(xtmp_lbl,0,0,Parent.Width,Parent.H";
_parent.AddView((android.view.View)(_xtmp_lbl.getObject()),(int) (0),(int) (0),_parent.getWidth(),_parent.getHeight());
RDebugUtils.currentLine=1835015;
 //BA.debugLineNum = 1835015;BA.debugLine="xtmp_lbl.Font = Font";
_xtmp_lbl.setFont(_font);
RDebugUtils.currentLine=1835016;
 //BA.debugLineNum = 1835016;BA.debugLine="xtmp_lbl.Text = Text";
_xtmp_lbl.setText(BA.ObjectToCharSequence(_text));
RDebugUtils.currentLine=1835017;
 //BA.debugLineNum = 1835017;BA.debugLine="xtmp_lbl.SetTextAlignment(\"CENTER\",\"CENTER\")";
_xtmp_lbl.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=1835018;
 //BA.debugLineNum = 1835018;BA.debugLine="xtmp_lbl.TextColor = xui.Color_White";
_xtmp_lbl.setTextColor(mostCurrent._xui.Color_White);
RDebugUtils.currentLine=1835020;
 //BA.debugLineNum = 1835020;BA.debugLine="End Sub";
return "";
}
public static boolean  _activity_keypress(int _keycode) throws Exception{
RDebugUtils.currentModule="act_main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_keypress", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "activity_keypress", new Object[] {_keycode}));}
RDebugUtils.currentLine=3407872;
 //BA.debugLineNum = 3407872;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
RDebugUtils.currentLine=3407873;
 //BA.debugLineNum = 3407873;BA.debugLine="Try";
try {RDebugUtils.currentLine=3407874;
 //BA.debugLineNum = 3407874;BA.debugLine="If KeyCode=KeyCodes.KEYCODE_BACK Then";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK) { 
RDebugUtils.currentLine=3407875;
 //BA.debugLineNum = 3407875;BA.debugLine="If sidemenu.Visible Then";
if (mostCurrent._sidemenu.getVisible()) { 
RDebugUtils.currentLine=3407876;
 //BA.debugLineNum = 3407876;BA.debugLine="sidemenu.HideMenus";
mostCurrent._sidemenu.HideMenus();
RDebugUtils.currentLine=3407877;
 //BA.debugLineNum = 3407877;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 }else 
{RDebugUtils.currentLine=3407878;
 //BA.debugLineNum = 3407878;BA.debugLine="Else If PnlActivate.Visible Then";
if (mostCurrent._pnlactivate.getVisible()) { 
RDebugUtils.currentLine=3407879;
 //BA.debugLineNum = 3407879;BA.debugLine="PnlActivate.Visible=False";
mostCurrent._pnlactivate.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3407880;
 //BA.debugLineNum = 3407880;BA.debugLine="MCode.AnimationClose(PnlActivate)";
mostCurrent._mcode._animationclose /*String*/ (mostCurrent.activityBA,(Object)(mostCurrent._pnlactivate.getObject()));
RDebugUtils.currentLine=3407881;
 //BA.debugLineNum = 3407881;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 }else {
RDebugUtils.currentLine=3407883;
 //BA.debugLineNum = 3407883;BA.debugLine="If IntExit = 1 Then";
if (_intexit==1) { 
RDebugUtils.currentLine=3407885;
 //BA.debugLineNum = 3407885;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=3407886;
 //BA.debugLineNum = 3407886;BA.debugLine="CloseActivities";
_closeactivities();
 }else 
{RDebugUtils.currentLine=3407887;
 //BA.debugLineNum = 3407887;BA.debugLine="Else if IntExit = 0 Then";
if (_intexit==0) { 
RDebugUtils.currentLine=3407888;
 //BA.debugLineNum = 3407888;BA.debugLine="IntExit = IntExit + 1";
_intexit = (byte) (_intexit+1);
RDebugUtils.currentLine=3407889;
 //BA.debugLineNum = 3407889;BA.debugLine="ToastMessageShow(\"برای خروج کلید Back را مجدد";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("برای خروج کلید Back را مجدداً فشار دهید"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3407890;
 //BA.debugLineNum = 3407890;BA.debugLine="T_Exit.Enabled = True";
_t_exit.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3407891;
 //BA.debugLineNum = 3407891;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 }}
;
 }}
;
 };
 } 
       catch (Exception e23) {
			processBA.setLastException(e23);RDebugUtils.currentLine=3407896;
 //BA.debugLineNum = 3407896;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("53407896",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=3407897;
 //BA.debugLineNum = 3407897;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-Activity_KeyPress");
 };
RDebugUtils.currentLine=3407899;
 //BA.debugLineNum = 3407899;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=3407900;
 //BA.debugLineNum = 3407900;BA.debugLine="End Sub";
return false;
}
public static String  _closeactivities() throws Exception{
RDebugUtils.currentModule="act_main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "closeactivities", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "closeactivities", null));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=3473408;
 //BA.debugLineNum = 3473408;BA.debugLine="Sub CloseActivities";
RDebugUtils.currentLine=3473409;
 //BA.debugLineNum = 3473409;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=3473410;
 //BA.debugLineNum = 3473410;BA.debugLine="jo.InitializeContext";
_jo.InitializeContext(processBA);
RDebugUtils.currentLine=3473411;
 //BA.debugLineNum = 3473411;BA.debugLine="jo.RunMethod(\"finishAffinity\", Null)";
_jo.RunMethod("finishAffinity",(Object[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=3473412;
 //BA.debugLineNum = 3473412;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="act_main";
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=2621441;
 //BA.debugLineNum = 2621441;BA.debugLine="T_DataCheck.Enabled=False";
_t_datacheck.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2621443;
 //BA.debugLineNum = 2621443;BA.debugLine="End Sub";
return "";
}
public static String  _activity_permissionresult(String _permission,boolean _result) throws Exception{
RDebugUtils.currentModule="act_main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_permissionresult", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_permissionresult", new Object[] {_permission,_result}));}
RDebugUtils.currentLine=3866624;
 //BA.debugLineNum = 3866624;BA.debugLine="Sub Activity_PermissionResult (Permission As Strin";
RDebugUtils.currentLine=3866625;
 //BA.debugLineNum = 3866625;BA.debugLine="If Permission=rp.PERMISSION_READ_PHONE_STATE Then";
if ((_permission).equals(mostCurrent._rp.PERMISSION_READ_PHONE_STATE)) { 
RDebugUtils.currentLine=3866626;
 //BA.debugLineNum = 3866626;BA.debugLine="If Result=True Then";
if (_result==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=3866627;
 //BA.debugLineNum = 3866627;BA.debugLine="Log(\"---Get IMEI\")";
anywheresoftware.b4a.keywords.Common.LogImpl("53866627","---Get IMEI",0);
RDebugUtils.currentLine=3866628;
 //BA.debugLineNum = 3866628;BA.debugLine="If MCode.PImei.SdkVersion < 29 Then";
if (mostCurrent._mcode._pimei /*anywheresoftware.b4a.phone.Phone*/ .getSdkVersion()<29) { 
RDebugUtils.currentLine=3866629;
 //BA.debugLineNum = 3866629;BA.debugLine="MCode.strImei = MCode.Imei.GetDeviceId";
mostCurrent._mcode._strimei /*String*/  = mostCurrent._mcode._imei /*anywheresoftware.b4a.phone.Phone.PhoneId*/ .GetDeviceId();
RDebugUtils.currentLine=3866630;
 //BA.debugLineNum = 3866630;BA.debugLine="lbl_MenuIMEI.Text=MCode.strImei";
mostCurrent._lbl_menuimei.setText(BA.ObjectToCharSequence(mostCurrent._mcode._strimei /*String*/ ));
 }else {
RDebugUtils.currentLine=3866632;
 //BA.debugLineNum = 3866632;BA.debugLine="GetImei10";
_getimei10();
 };
 }else {
RDebugUtils.currentLine=3866635;
 //BA.debugLineNum = 3866635;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_READ_PHONE_STA";
mostCurrent._rp.CheckAndRequest(processBA,mostCurrent._rp.PERMISSION_READ_PHONE_STATE);
 };
 };
RDebugUtils.currentLine=3866638;
 //BA.debugLineNum = 3866638;BA.debugLine="If Permission=rp.PERMISSION_ACCESS_COARSE_LOCATIO";
if ((_permission).equals(mostCurrent._rp.PERMISSION_ACCESS_COARSE_LOCATION)) { 
RDebugUtils.currentLine=3866639;
 //BA.debugLineNum = 3866639;BA.debugLine="If Result=True Then";
if (_result==anywheresoftware.b4a.keywords.Common.True) { 
 }else {
RDebugUtils.currentLine=3866643;
 //BA.debugLineNum = 3866643;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_ACCESS_COARSE_";
mostCurrent._rp.CheckAndRequest(processBA,mostCurrent._rp.PERMISSION_ACCESS_COARSE_LOCATION);
 };
 };
RDebugUtils.currentLine=3866646;
 //BA.debugLineNum = 3866646;BA.debugLine="If Permission=rp.PERMISSION_ACCESS_FINE_LOCATION";
if ((_permission).equals(mostCurrent._rp.PERMISSION_ACCESS_FINE_LOCATION)) { 
RDebugUtils.currentLine=3866647;
 //BA.debugLineNum = 3866647;BA.debugLine="If Result=True Then";
if (_result==anywheresoftware.b4a.keywords.Common.True) { 
 }else {
RDebugUtils.currentLine=3866651;
 //BA.debugLineNum = 3866651;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_ACCESS_FINE_LO";
mostCurrent._rp.CheckAndRequest(processBA,mostCurrent._rp.PERMISSION_ACCESS_FINE_LOCATION);
 };
 };
RDebugUtils.currentLine=3866654;
 //BA.debugLineNum = 3866654;BA.debugLine="If Permission= rp.PERMISSION_CALL_PHONE Then";
if ((_permission).equals(mostCurrent._rp.PERMISSION_CALL_PHONE)) { 
RDebugUtils.currentLine=3866655;
 //BA.debugLineNum = 3866655;BA.debugLine="Log(Result)";
anywheresoftware.b4a.keywords.Common.LogImpl("53866655",BA.ObjectToString(_result),0);
RDebugUtils.currentLine=3866656;
 //BA.debugLineNum = 3866656;BA.debugLine="If Result=True Then";
if (_result==anywheresoftware.b4a.keywords.Common.True) { 
 }else {
RDebugUtils.currentLine=3866660;
 //BA.debugLineNum = 3866660;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_CALL_PHONE)";
mostCurrent._rp.CheckAndRequest(processBA,mostCurrent._rp.PERMISSION_CALL_PHONE);
 };
 };
RDebugUtils.currentLine=3866663;
 //BA.debugLineNum = 3866663;BA.debugLine="End Sub";
return "";
}
public static void  _getimei10() throws Exception{
RDebugUtils.currentModule="act_main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "getimei10", false))
	 {Debug.delegate(mostCurrent.activityBA, "getimei10", null); return;}
ResumableSub_GetImei10 rsub = new ResumableSub_GetImei10(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_GetImei10 extends BA.ResumableSub {
public ResumableSub_GetImei10(ir.parsikhesab.pakhsh.act_main parent) {
this.parent = parent;
}
ir.parsikhesab.pakhsh.act_main parent;
String _id = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_main";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=3604481;
 //BA.debugLineNum = 3604481;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 12;
this.catchState = 11;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 11;
RDebugUtils.currentLine=3604482;
 //BA.debugLineNum = 3604482;BA.debugLine="Wait For (GetAdvertisingId) Complete (Id As Stri";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_main", "getimei10"), _getadvertisingid());
this.state = 13;
return;
case 13:
//C
this.state = 4;
_id = (String) result[0];
;
RDebugUtils.currentLine=3604483;
 //BA.debugLineNum = 3604483;BA.debugLine="Sleep(2000)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_main", "getimei10"),(int) (2000));
this.state = 14;
return;
case 14:
//C
this.state = 4;
;
RDebugUtils.currentLine=3604484;
 //BA.debugLineNum = 3604484;BA.debugLine="If Id <> \"\" Then";
if (true) break;

case 4:
//if
this.state = 9;
if ((_id).equals("") == false) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=3604485;
 //BA.debugLineNum = 3604485;BA.debugLine="MCode.strImei = Id.Replace(\"-\",\"\")";
parent.mostCurrent._mcode._strimei /*String*/  = _id.replace("-","");
RDebugUtils.currentLine=3604486;
 //BA.debugLineNum = 3604486;BA.debugLine="lbl_MenuIMEI.Text=MCode.strImei";
parent.mostCurrent._lbl_menuimei.setText(BA.ObjectToCharSequence(parent.mostCurrent._mcode._strimei /*String*/ ));
RDebugUtils.currentLine=3604487;
 //BA.debugLineNum = 3604487;BA.debugLine="Log(MCode.strImei)";
anywheresoftware.b4a.keywords.Common.LogImpl("53604487",parent.mostCurrent._mcode._strimei /*String*/ ,0);
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=3604489;
 //BA.debugLineNum = 3604489;BA.debugLine="MCode.strImei = GetDeviceId";
parent.mostCurrent._mcode._strimei /*String*/  = _getdeviceid();
RDebugUtils.currentLine=3604490;
 //BA.debugLineNum = 3604490;BA.debugLine="lbl_MenuIMEI.Text =MCode.strImei";
parent.mostCurrent._lbl_menuimei.setText(BA.ObjectToCharSequence(parent.mostCurrent._mcode._strimei /*String*/ ));
RDebugUtils.currentLine=3604491;
 //BA.debugLineNum = 3604491;BA.debugLine="Log(MCode.strImei)";
anywheresoftware.b4a.keywords.Common.LogImpl("53604491",parent.mostCurrent._mcode._strimei /*String*/ ,0);
 if (true) break;

case 9:
//C
this.state = 12;
;
 if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
RDebugUtils.currentLine=3604494;
 //BA.debugLineNum = 3604494;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("53604494",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=3604495;
 //BA.debugLineNum = 3604495;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
parent.mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(parent.mostCurrent._activity.getTitle())+"-GetImei10");
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=3604497;
 //BA.debugLineNum = 3604497;BA.debugLine="End Sub";
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
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="act_main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=2031617;
 //BA.debugLineNum = 2031617;BA.debugLine="Try";
try {RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="lblVer.Text=\"نسخه \" & MCode.Version";
mostCurrent._lblver.setText(BA.ObjectToCharSequence("نسخه "+mostCurrent._mcode._version /*String*/ ));
RDebugUtils.currentLine=2031619;
 //BA.debugLineNum = 2031619;BA.debugLine="Lbl_DateVersion.Text=\"تاریخ نسخه \" & MCode.DateV";
mostCurrent._lbl_dateversion.setText(BA.ObjectToCharSequence("تاریخ نسخه "+mostCurrent._mcode._dateversion /*String*/ ));
RDebugUtils.currentLine=2031620;
 //BA.debugLineNum = 2031620;BA.debugLine="lblVersion1.Text=MCode.Version";
mostCurrent._lblversion1.setText(BA.ObjectToCharSequence(mostCurrent._mcode._version /*String*/ ));
RDebugUtils.currentLine=2031621;
 //BA.debugLineNum = 2031621;BA.debugLine="lblVersionNumber1.Text=MCode.NumberVersion";
mostCurrent._lblversionnumber1.setText(BA.ObjectToCharSequence(mostCurrent._mcode._numberversion /*String*/ ));
RDebugUtils.currentLine=2031622;
 //BA.debugLineNum = 2031622;BA.debugLine="lblDateVersion1.Text=MCode.DateVersion";
mostCurrent._lbldateversion1.setText(BA.ObjectToCharSequence(mostCurrent._mcode._dateversion /*String*/ ));
RDebugUtils.currentLine=2031623;
 //BA.debugLineNum = 2031623;BA.debugLine="If MCode.TypeVersion=\"Stable\" Then";
if ((mostCurrent._mcode._typeversion /*String*/ ).equals("Stable")) { 
RDebugUtils.currentLine=2031624;
 //BA.debugLineNum = 2031624;BA.debugLine="lblTypeVersion1.Text=\"عمومی\"";
mostCurrent._lbltypeversion1.setText(BA.ObjectToCharSequence("عمومی"));
 }else 
{RDebugUtils.currentLine=2031625;
 //BA.debugLineNum = 2031625;BA.debugLine="Else if MCode.TypeVersion=\"UpdateNew\" Then";
if ((mostCurrent._mcode._typeversion /*String*/ ).equals("UpdateNew")) { 
RDebugUtils.currentLine=2031626;
 //BA.debugLineNum = 2031626;BA.debugLine="lblTypeVersion1.Text=\"اختصاصی\"";
mostCurrent._lbltypeversion1.setText(BA.ObjectToCharSequence("اختصاصی"));
 }}
;
RDebugUtils.currentLine=2031629;
 //BA.debugLineNum = 2031629;BA.debugLine="If MCode.PrinterType=1 Then";
if (mostCurrent._mcode._printertype /*int*/ ==1) { 
RDebugUtils.currentLine=2031630;
 //BA.debugLineNum = 2031630;BA.debugLine="lblTypeVersion1.Text=\"کارت خوان\"";
mostCurrent._lbltypeversion1.setText(BA.ObjectToCharSequence("کارت خوان"));
 };
RDebugUtils.currentLine=2031633;
 //BA.debugLineNum = 2031633;BA.debugLine="LoadPage";
_loadpage();
RDebugUtils.currentLine=2031642;
 //BA.debugLineNum = 2031642;BA.debugLine="pnlTabligh.Visible=False";
mostCurrent._pnltabligh.setVisible(anywheresoftware.b4a.keywords.Common.False);
 } 
       catch (Exception e18) {
			processBA.setLastException(e18);RDebugUtils.currentLine=2031645;
 //BA.debugLineNum = 2031645;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("52031645",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=2031646;
 //BA.debugLineNum = 2031646;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-Activity_Resume");
 };
RDebugUtils.currentLine=2031650;
 //BA.debugLineNum = 2031650;BA.debugLine="End Sub";
return "";
}
public static void  _loadpage() throws Exception{
RDebugUtils.currentModule="act_main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "loadpage", false))
	 {Debug.delegate(mostCurrent.activityBA, "loadpage", null); return;}
ResumableSub_LoadPage rsub = new ResumableSub_LoadPage(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_LoadPage extends BA.ResumableSub {
public ResumableSub_LoadPage(ir.parsikhesab.pakhsh.act_main parent) {
this.parent = parent;
}
ir.parsikhesab.pakhsh.act_main parent;
String _id = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_main";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 26;
this.catchState = 25;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 25;
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="MCode.UpdateSetting";
parent.mostCurrent._mcode._updatesetting /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=1966084;
 //BA.debugLineNum = 1966084;BA.debugLine="CheckAdmin";
_checkadmin();
RDebugUtils.currentLine=1966085;
 //BA.debugLineNum = 1966085;BA.debugLine="CheckTozie";
_checktozie();
RDebugUtils.currentLine=1966086;
 //BA.debugLineNum = 1966086;BA.debugLine="CheckGetTourVisitorToday";
_checkgettourvisitortoday();
RDebugUtils.currentLine=1966088;
 //BA.debugLineNum = 1966088;BA.debugLine="lbl_CodeVisitor.Text = \"کد ویزیتور\"";
parent.mostCurrent._lbl_codevisitor.setText(BA.ObjectToCharSequence("کد ویزیتور"));
RDebugUtils.currentLine=1966089;
 //BA.debugLineNum = 1966089;BA.debugLine="lblVisitorName.Text = \"نام ویزیتور\"";
parent.mostCurrent._lblvisitorname.setText(BA.ObjectToCharSequence("نام ویزیتور"));
RDebugUtils.currentLine=1966091;
 //BA.debugLineNum = 1966091;BA.debugLine="PermissionActive4";
_permissionactive4();
RDebugUtils.currentLine=1966092;
 //BA.debugLineNum = 1966092;BA.debugLine="Dim Id As String";
_id = "";
RDebugUtils.currentLine=1966093;
 //BA.debugLineNum = 1966093;BA.debugLine="Id=MCode.GetDeviceId";
_id = parent.mostCurrent._mcode._getdeviceid /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=1966094;
 //BA.debugLineNum = 1966094;BA.debugLine="If Id = \"\" Then";
if (true) break;

case 4:
//if
this.state = 9;
if ((_id).equals("")) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=1966095;
 //BA.debugLineNum = 1966095;BA.debugLine="Wait For (GetAdvertisingId) Complete (Id As Str";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_main", "loadpage"), _getadvertisingid());
this.state = 27;
return;
case 27:
//C
this.state = 9;
_id = (String) result[0];
;
RDebugUtils.currentLine=1966097;
 //BA.debugLineNum = 1966097;BA.debugLine="Log(MCode.GetApiVersion)";
anywheresoftware.b4a.keywords.Common.LogImpl("51966097",BA.NumberToString(parent.mostCurrent._mcode._getapiversion /*int*/ (mostCurrent.activityBA)),0);
RDebugUtils.currentLine=1966098;
 //BA.debugLineNum = 1966098;BA.debugLine="MCode.DeviceId=Id";
parent.mostCurrent._mcode._deviceid /*String*/  = _id;
RDebugUtils.currentLine=1966099;
 //BA.debugLineNum = 1966099;BA.debugLine="Log(Id)";
anywheresoftware.b4a.keywords.Common.LogImpl("51966099",_id,0);
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=1966101;
 //BA.debugLineNum = 1966101;BA.debugLine="Log(Id)";
anywheresoftware.b4a.keywords.Common.LogImpl("51966101",_id,0);
RDebugUtils.currentLine=1966102;
 //BA.debugLineNum = 1966102;BA.debugLine="MCode.DeviceId=Id";
parent.mostCurrent._mcode._deviceid /*String*/  = _id;
 if (true) break;

case 9:
//C
this.state = 10;
;
RDebugUtils.currentLine=1966104;
 //BA.debugLineNum = 1966104;BA.debugLine="lbl_MenuIMEI.Text=\"سریال گوشی:  \"& MCode.DeviceI";
parent.mostCurrent._lbl_menuimei.setText(BA.ObjectToCharSequence("سریال گوشی:  "+parent.mostCurrent._mcode._deviceid /*String*/ ));
RDebugUtils.currentLine=1966105;
 //BA.debugLineNum = 1966105;BA.debugLine="lblImei2.Text=MCode.DeviceId";
parent.mostCurrent._lblimei2.setText(BA.ObjectToCharSequence(parent.mostCurrent._mcode._deviceid /*String*/ ));
RDebugUtils.currentLine=1966106;
 //BA.debugLineNum = 1966106;BA.debugLine="If MCode.Vaziat=0 Then";
if (true) break;

case 10:
//if
this.state = 23;
if (parent.mostCurrent._mcode._vaziat /*int*/ ==0) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 23;
RDebugUtils.currentLine=1966107;
 //BA.debugLineNum = 1966107;BA.debugLine="btn_Lock.Text= Chr(0xE897)";
parent.mostCurrent._btn_lock.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr(((int)0xe897))));
RDebugUtils.currentLine=1966108;
 //BA.debugLineNum = 1966108;BA.debugLine="btn_Lock.TextColor=Colors.Black";
parent.mostCurrent._btn_lock.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=1966109;
 //BA.debugLineNum = 1966109;BA.debugLine="lblVaziat.Text=\"غیر فعال\"";
parent.mostCurrent._lblvaziat.setText(BA.ObjectToCharSequence("غیر فعال"));
 if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=1966113;
 //BA.debugLineNum = 1966113;BA.debugLine="lbl_CodeVisitor.Text =  MCode.C_Visitor";
parent.mostCurrent._lbl_codevisitor.setText(BA.ObjectToCharSequence(parent.mostCurrent._mcode._c_visitor /*String*/ ));
RDebugUtils.currentLine=1966114;
 //BA.debugLineNum = 1966114;BA.debugLine="lblVisitorName.Text =  MCode.N_Visitor";
parent.mostCurrent._lblvisitorname.setText(BA.ObjectToCharSequence(parent.mostCurrent._mcode._n_visitor /*String*/ ));
RDebugUtils.currentLine=1966116;
 //BA.debugLineNum = 1966116;BA.debugLine="btn_Lock.Text=Chr(0xE0DA)";
parent.mostCurrent._btn_lock.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr(((int)0xe0da))));
RDebugUtils.currentLine=1966117;
 //BA.debugLineNum = 1966117;BA.debugLine="btn_Lock.TextColor=Colors.Green";
parent.mostCurrent._btn_lock.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Green);
RDebugUtils.currentLine=1966118;
 //BA.debugLineNum = 1966118;BA.debugLine="lblVaziat.Text=\"فعال\"";
parent.mostCurrent._lblvaziat.setText(BA.ObjectToCharSequence("فعال"));
RDebugUtils.currentLine=1966119;
 //BA.debugLineNum = 1966119;BA.debugLine="txtCodeMoshtari.Text=MCode.CodeMoshtari";
parent.mostCurrent._txtcodemoshtari.setText(BA.ObjectToCharSequence(parent.mostCurrent._mcode._codemoshtari /*String*/ ));
RDebugUtils.currentLine=1966121;
 //BA.debugLineNum = 1966121;BA.debugLine="If MCode.Gps=1 Then";
if (true) break;

case 15:
//if
this.state = 18;
if ((parent.mostCurrent._mcode._gps /*String*/ ).equals(BA.NumberToString(1))) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=1966123;
 //BA.debugLineNum = 1966123;BA.debugLine="StartService(FusedLocationService)";
anywheresoftware.b4a.keywords.Common.StartService(processBA,(Object)(parent.mostCurrent._fusedlocationservice.getObject()));
 if (true) break;

case 18:
//C
this.state = 19;
;
RDebugUtils.currentLine=1966126;
 //BA.debugLineNum = 1966126;BA.debugLine="Log(\"Gps Start\")";
anywheresoftware.b4a.keywords.Common.LogImpl("51966126","Gps Start",0);
RDebugUtils.currentLine=1966127;
 //BA.debugLineNum = 1966127;BA.debugLine="If MCode.GetDataOnline=1 Then";
if (true) break;

case 19:
//if
this.state = 22;
if ((parent.mostCurrent._mcode._getdataonline /*String*/ ).equals(BA.NumberToString(1))) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
 if (true) break;

case 22:
//C
this.state = 23;
;
 if (true) break;

case 23:
//C
this.state = 26;
;
 if (true) break;

case 25:
//C
this.state = 26;
this.catchState = 0;
RDebugUtils.currentLine=1966135;
 //BA.debugLineNum = 1966135;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("51966135",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=1966136;
 //BA.debugLineNum = 1966136;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
parent.mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(parent.mostCurrent._activity.getTitle())+"-LoadPage");
 if (true) break;
if (true) break;

case 26:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=1966138;
 //BA.debugLineNum = 1966138;BA.debugLine="End Sub";
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
RDebugUtils.currentModule="act_main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "application_error", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "application_error", new Object[] {_error,_stacktrace}));}
RDebugUtils.currentLine=5963776;
 //BA.debugLineNum = 5963776;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
RDebugUtils.currentLine=5963778;
 //BA.debugLineNum = 5963778;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=5963779;
 //BA.debugLineNum = 5963779;BA.debugLine="End Sub";
return false;
}
public static String  _asb1_reachedlefttop() throws Exception{
RDebugUtils.currentModule="act_main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "asb1_reachedlefttop", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "asb1_reachedlefttop", null));}
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Sub ASB1_ReachedLeftTop";
RDebugUtils.currentLine=2293761;
 //BA.debugLineNum = 2293761;BA.debugLine="ModeEnterExit = False";
_modeenterexit = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=2293763;
 //BA.debugLineNum = 2293763;BA.debugLine="ProgressDialogShow2(\"در حال ثبت خروج  \",False)";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(mostCurrent.activityBA,BA.ObjectToCharSequence("در حال ثبت خروج  "),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2293764;
 //BA.debugLineNum = 2293764;BA.debugLine="SaveGps";
_savegps();
RDebugUtils.currentLine=2293765;
 //BA.debugLineNum = 2293765;BA.debugLine="myCode.setSetting(\"OUT.dat\",\"input\",0)";
mostCurrent._mycode._setsetting /*String*/ (mostCurrent.activityBA,"OUT.dat","input",BA.NumberToString(0));
RDebugUtils.currentLine=2293766;
 //BA.debugLineNum = 2293766;BA.debugLine="End Sub";
return "";
}
public static String  _savegps() throws Exception{
RDebugUtils.currentModule="act_main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "savegps", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "savegps", null));}
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Sub SaveGps";
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="Try";
try {RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="If gps.GPSEnabled=False Then";
if (_gps.getGPSEnabled()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=2359299;
 //BA.debugLineNum = 2359299;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=2359300;
 //BA.debugLineNum = 2359300;BA.debugLine="ToastMessageShow(\"موقعیت مکانی خود را روشن کنید";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("موقعیت مکانی خود را روشن کنید"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2359301;
 //BA.debugLineNum = 2359301;BA.debugLine="T_EnterExit.Enabled=False";
_t_enterexit.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2359302;
 //BA.debugLineNum = 2359302;BA.debugLine="StartActivity(gps.LocationSettingsIntent)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(_gps.getLocationSettingsIntent()));
 }else {
RDebugUtils.currentLine=2359304;
 //BA.debugLineNum = 2359304;BA.debugLine="ProgressDialogShow2(\"لطفا تا دریافت موقعیت مکان";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(mostCurrent.activityBA,BA.ObjectToCharSequence("لطفا تا دریافت موقعیت مکانی صبر کنید"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2359305;
 //BA.debugLineNum = 2359305;BA.debugLine="T_EnterExit.Enabled=True";
_t_enterexit.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 };
 } 
       catch (Exception e12) {
			processBA.setLastException(e12);RDebugUtils.currentLine=2359309;
 //BA.debugLineNum = 2359309;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("52359309",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=2359310;
 //BA.debugLineNum = 2359310;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-SaveGps");
 };
RDebugUtils.currentLine=2359312;
 //BA.debugLineNum = 2359312;BA.debugLine="End Sub";
return "";
}
public static void  _asb1_reachedrightbottom() throws Exception{
RDebugUtils.currentModule="act_main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "asb1_reachedrightbottom", false))
	 {Debug.delegate(mostCurrent.activityBA, "asb1_reachedrightbottom", null); return;}
ResumableSub_ASB1_ReachedRightBottom rsub = new ResumableSub_ASB1_ReachedRightBottom(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_ASB1_ReachedRightBottom extends BA.ResumableSub {
public ResumableSub_ASB1_ReachedRightBottom(ir.parsikhesab.pakhsh.act_main parent) {
this.parent = parent;
}
ir.parsikhesab.pakhsh.act_main parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_main";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="Sleep(100)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_main", "asb1_reachedrightbottom"),(int) (100));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="ModeEnterExit = True";
parent._modeenterexit = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=2228227;
 //BA.debugLineNum = 2228227;BA.debugLine="Dim xui As XUI";
parent.mostCurrent._xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=2228229;
 //BA.debugLineNum = 2228229;BA.debugLine="ProgressDialogShow2(\"در حال ثبت ورود  \",False)";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(mostCurrent.activityBA,BA.ObjectToCharSequence("در حال ثبت ورود  "),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2228230;
 //BA.debugLineNum = 2228230;BA.debugLine="SaveGps";
_savegps();
RDebugUtils.currentLine=2228232;
 //BA.debugLineNum = 2228232;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _btn_lock_click() throws Exception{
RDebugUtils.currentModule="act_main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_lock_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_lock_click", null));}
RDebugUtils.currentLine=5505024;
 //BA.debugLineNum = 5505024;BA.debugLine="Sub btn_Lock_Click";
RDebugUtils.currentLine=5505025;
 //BA.debugLineNum = 5505025;BA.debugLine="PnlActivate.Visible=True";
mostCurrent._pnlactivate.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=5505026;
 //BA.debugLineNum = 5505026;BA.debugLine="MCode.AnimationOpen(PnlActivate)";
mostCurrent._mcode._animationopen /*String*/ (mostCurrent.activityBA,(Object)(mostCurrent._pnlactivate.getObject()));
RDebugUtils.currentLine=5505027;
 //BA.debugLineNum = 5505027;BA.debugLine="End Sub";
return "";
}
public static String  _btn_menu_click() throws Exception{
RDebugUtils.currentModule="act_main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_menu_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_menu_click", null));}
RDebugUtils.currentLine=3276800;
 //BA.debugLineNum = 3276800;BA.debugLine="private Sub btn_menu_Click";
RDebugUtils.currentLine=3276801;
 //BA.debugLineNum = 3276801;BA.debugLine="sidemenu.ShowSecondaryMenu";
mostCurrent._sidemenu.ShowSecondaryMenu();
RDebugUtils.currentLine=3276802;
 //BA.debugLineNum = 3276802;BA.debugLine="End Sub";
return "";
}
public static String  _btn_search_click() throws Exception{
RDebugUtils.currentModule="act_main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_search_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_search_click", null));}
RDebugUtils.currentLine=3342336;
 //BA.debugLineNum = 3342336;BA.debugLine="private Sub Btn_Search_Click";
RDebugUtils.currentLine=3342337;
 //BA.debugLineNum = 3342337;BA.debugLine="Button4_Click";
_button4_click();
RDebugUtils.currentLine=3342338;
 //BA.debugLineNum = 3342338;BA.debugLine="End Sub";
return "";
}
public static String  _button4_click() throws Exception{
RDebugUtils.currentModule="act_main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "button4_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "button4_click", null));}
RDebugUtils.currentLine=4194304;
 //BA.debugLineNum = 4194304;BA.debugLine="Sub Button4_Click";
RDebugUtils.currentLine=4194306;
 //BA.debugLineNum = 4194306;BA.debugLine="Try";
try {RDebugUtils.currentLine=4194307;
 //BA.debugLineNum = 4194307;BA.debugLine="If MCode.C_Visitor=\"کد ویزیتور\"  Then";
if ((mostCurrent._mcode._c_visitor /*String*/ ).equals("کد ویزیتور")) { 
RDebugUtils.currentLine=4194308;
 //BA.debugLineNum = 4194308;BA.debugLine="ToastMessageShow(\"ابتدا دریافت اطلاعات را انجام";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("ابتدا دریافت اطلاعات را انجام دهید"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=4194309;
 //BA.debugLineNum = 4194309;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=4194311;
 //BA.debugLineNum = 4194311;BA.debugLine="If MCode.C_Visitor.Length<5 Then";
if (mostCurrent._mcode._c_visitor /*String*/ .length()<5) { 
RDebugUtils.currentLine=4194312;
 //BA.debugLineNum = 4194312;BA.debugLine="ToastMessageShow(\"کد ویزیتور شما صحیح نیست\",Tru";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("کد ویزیتور شما صحیح نیست"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=4194313;
 //BA.debugLineNum = 4194313;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=4194315;
 //BA.debugLineNum = 4194315;BA.debugLine="If	MCode.Visitor=\"0\" Then";
if ((mostCurrent._mcode._visitor /*String*/ ).equals("0")) { 
RDebugUtils.currentLine=4194316;
 //BA.debugLineNum = 4194316;BA.debugLine="ToastMessageShow(\"این بخش مربوط به نسخه ویزیتور";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("این بخش مربوط به نسخه ویزیتور می باشد ، در صورت نیاز به فعالسازی و استفاده از این بخش با واحد مشاوره و فروش مربوطه تماس حاصل فرمایید"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=4194317;
 //BA.debugLineNum = 4194317;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=4194319;
 //BA.debugLineNum = 4194319;BA.debugLine="KalaSearch";
_kalasearch();
RDebugUtils.currentLine=4194320;
 //BA.debugLineNum = 4194320;BA.debugLine="MCode.SetAnimation(\"zoom_enter1\", \"zoom_exit1\")";
mostCurrent._mcode._setanimation /*String*/ (mostCurrent.activityBA,"zoom_enter1","zoom_exit1");
 } 
       catch (Exception e17) {
			processBA.setLastException(e17);RDebugUtils.currentLine=4194322;
 //BA.debugLineNum = 4194322;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("54194322",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 };
RDebugUtils.currentLine=4194324;
 //BA.debugLineNum = 4194324;BA.debugLine="End Sub";
return "";
}
public static String  _btnbackmenu_click() throws Exception{
RDebugUtils.currentModule="act_main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnbackmenu_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnbackmenu_click", null));}
RDebugUtils.currentLine=4259840;
 //BA.debugLineNum = 4259840;BA.debugLine="Sub BtnBackMenu_Click";
RDebugUtils.currentLine=4259841;
 //BA.debugLineNum = 4259841;BA.debugLine="sidemenu.HideMenus";
mostCurrent._sidemenu.HideMenus();
RDebugUtils.currentLine=4259842;
 //BA.debugLineNum = 4259842;BA.debugLine="End Sub";
return "";
}
public static void  _btnbackuppnl_click() throws Exception{
RDebugUtils.currentModule="act_main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnbackuppnl_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "btnbackuppnl_click", null); return;}
ResumableSub_BtnBackUpPnl_Click rsub = new ResumableSub_BtnBackUpPnl_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_BtnBackUpPnl_Click extends BA.ResumableSub {
public ResumableSub_BtnBackUpPnl_Click(ir.parsikhesab.pakhsh.act_main parent) {
this.parent = parent;
}
ir.parsikhesab.pakhsh.act_main parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_main";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=4390913;
 //BA.debugLineNum = 4390913;BA.debugLine="If txtBackUpFile.Text<>\"\" Then";
if (true) break;

case 1:
//if
this.state = 6;
if ((parent.mostCurrent._txtbackupfile.getText()).equals("") == false) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=4390914;
 //BA.debugLineNum = 4390914;BA.debugLine="Sleep(200)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_main", "btnbackuppnl_click"),(int) (200));
this.state = 7;
return;
case 7:
//C
this.state = 6;
;
RDebugUtils.currentLine=4390915;
 //BA.debugLineNum = 4390915;BA.debugLine="MCode.CreateBK(txtBackUpFile.Text)";
parent.mostCurrent._mcode._createbk /*void*/ (mostCurrent.activityBA,parent.mostCurrent._txtbackupfile.getText());
RDebugUtils.currentLine=4390916;
 //BA.debugLineNum = 4390916;BA.debugLine="ToastMessageShow(\"پشتیبان اطلاعات با موفقیت تهیه";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("پشتیبان اطلاعات با موفقیت تهیه شد"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=4390917;
 //BA.debugLineNum = 4390917;BA.debugLine="pnlbak.Visible=False";
parent.mostCurrent._pnlbak.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=4390918;
 //BA.debugLineNum = 4390918;BA.debugLine="MCode.AnimationClose(pnlbak)";
parent.mostCurrent._mcode._animationclose /*String*/ (mostCurrent.activityBA,(Object)(parent.mostCurrent._pnlbak.getObject()));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=4390921;
 //BA.debugLineNum = 4390921;BA.debugLine="ToastMessageShow(\"لطفا نام فایل پشتیبانی را وارد";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("لطفا نام فایل پشتیبانی را وارد نمایید"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=4390922;
 //BA.debugLineNum = 4390922;BA.debugLine="txtBackUpFile.SelectionStart=0";
parent.mostCurrent._txtbackupfile.setSelectionStart((int) (0));
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=4390924;
 //BA.debugLineNum = 4390924;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _btncloseactivate_click() throws Exception{
RDebugUtils.currentModule="act_main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btncloseactivate_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btncloseactivate_click", null));}
RDebugUtils.currentLine=5570560;
 //BA.debugLineNum = 5570560;BA.debugLine="Sub btnCloseActivate_Click";
RDebugUtils.currentLine=5570561;
 //BA.debugLineNum = 5570561;BA.debugLine="PnlActivate.Visible=False";
mostCurrent._pnlactivate.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=5570562;
 //BA.debugLineNum = 5570562;BA.debugLine="MCode.AnimationClose(PnlActivate)";
mostCurrent._mcode._animationclose /*String*/ (mostCurrent.activityBA,(Object)(mostCurrent._pnlactivate.getObject()));
RDebugUtils.currentLine=5570563;
 //BA.debugLineNum = 5570563;BA.debugLine="End Sub";
return "";
}
public static String  _btnclosebackuppnl_click() throws Exception{
RDebugUtils.currentModule="act_main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnclosebackuppnl_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnclosebackuppnl_click", null));}
RDebugUtils.currentLine=4456448;
 //BA.debugLineNum = 4456448;BA.debugLine="Sub BtnCloseBackUpPnl_Click";
RDebugUtils.currentLine=4456449;
 //BA.debugLineNum = 4456449;BA.debugLine="pnlbak.Visible=False";
mostCurrent._pnlbak.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=4456450;
 //BA.debugLineNum = 4456450;BA.debugLine="MCode.AnimationClose(pnlbak)";
mostCurrent._mcode._animationclose /*String*/ (mostCurrent.activityBA,(Object)(mostCurrent._pnlbak.getObject()));
RDebugUtils.currentLine=4456451;
 //BA.debugLineNum = 4456451;BA.debugLine="End Sub";
return "";
}
public static String  _getversion() throws Exception{
RDebugUtils.currentModule="act_main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "getversion", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "getversion", null));}
String _str = "";
RDebugUtils.currentLine=5177344;
 //BA.debugLineNum = 5177344;BA.debugLine="Sub GetVersion";
RDebugUtils.currentLine=5177345;
 //BA.debugLineNum = 5177345;BA.debugLine="Try";
try {RDebugUtils.currentLine=5177346;
 //BA.debugLineNum = 5177346;BA.debugLine="jobInternet.JobName =\"GetVersion\"";
mostCurrent._jobinternet._jobname /*String*/  = "GetVersion";
RDebugUtils.currentLine=5177347;
 //BA.debugLineNum = 5177347;BA.debugLine="Dim str As String=\"parsiknew-\"&MCode.TypeVersion";
_str = "parsiknew-"+mostCurrent._mcode._typeversion /*String*/ ;
RDebugUtils.currentLine=5177348;
 //BA.debugLineNum = 5177348;BA.debugLine="If MCode.PrinterType=1 Then";
if (mostCurrent._mcode._printertype /*int*/ ==1) { 
RDebugUtils.currentLine=5177349;
 //BA.debugLineNum = 5177349;BA.debugLine="str=\"parsikPos\"";
_str = "parsikPos";
 };
RDebugUtils.currentLine=5177351;
 //BA.debugLineNum = 5177351;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"";
mostCurrent._jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/Version","Imei="+mostCurrent._mcode._deviceid /*String*/ +" &Type="+_str);
 } 
       catch (Exception e9) {
			processBA.setLastException(e9);RDebugUtils.currentLine=5177353;
 //BA.debugLineNum = 5177353;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("55177353",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=5177354;
 //BA.debugLineNum = 5177354;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-GetVersion");
 };
RDebugUtils.currentLine=5177356;
 //BA.debugLineNum = 5177356;BA.debugLine="End Sub";
return "";
}
public static String  _btndarkmode_click() throws Exception{
RDebugUtils.currentModule="act_main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btndarkmode_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btndarkmode_click", null));}
RDebugUtils.currentLine=5767168;
 //BA.debugLineNum = 5767168;BA.debugLine="Sub btnDarkMode_Click";
RDebugUtils.currentLine=5767169;
 //BA.debugLineNum = 5767169;BA.debugLine="If MCode.DarkMode=\"True\" Then";
if ((mostCurrent._mcode._darkmode /*String*/ ).equals("True")) { 
RDebugUtils.currentLine=5767170;
 //BA.debugLineNum = 5767170;BA.debugLine="MCode.DarkMode=\"False\"";
mostCurrent._mcode._darkmode /*String*/  = "False";
RDebugUtils.currentLine=5767171;
 //BA.debugLineNum = 5767171;BA.debugLine="btnDarkMode.Text=Chr(0xE3A8)";
mostCurrent._btndarkmode.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr(((int)0xe3a8))));
 }else {
RDebugUtils.currentLine=5767174;
 //BA.debugLineNum = 5767174;BA.debugLine="MCode.DarkMode=\"True\"";
mostCurrent._mcode._darkmode /*String*/  = "True";
RDebugUtils.currentLine=5767175;
 //BA.debugLineNum = 5767175;BA.debugLine="btnDarkMode.Text=Chr(0xE3AA)";
mostCurrent._btndarkmode.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr(((int)0xe3aa))));
 };
RDebugUtils.currentLine=5767178;
 //BA.debugLineNum = 5767178;BA.debugLine="SetColorItems";
_setcoloritems();
RDebugUtils.currentLine=5767179;
 //BA.debugLineNum = 5767179;BA.debugLine="End Sub";
return "";
}
public static String  _setcoloritems() throws Exception{
RDebugUtils.currentModule="act_main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "setcoloritems", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "setcoloritems", null));}
de.amberhome.objects.appcompat.AppCompatBase _ac = null;
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Public Sub SetColorItems";
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="Dim ac As AppCompat";
_ac = new de.amberhome.objects.appcompat.AppCompatBase();
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="MCode.colorPrimary=ac.GetThemeAttribute(\"colorPr";
mostCurrent._mcode._colorprimary /*int*/  = _ac.GetThemeAttribute(mostCurrent.activityBA,"colorPrimary");
RDebugUtils.currentLine=1310723;
 //BA.debugLineNum = 1310723;BA.debugLine="MCode.colorPrimaryDark=ac.GetThemeAttribute(\"colo";
mostCurrent._mcode._colorprimarydark /*int*/  = _ac.GetThemeAttribute(mostCurrent.activityBA,"colorPrimaryDark");
RDebugUtils.currentLine=1310724;
 //BA.debugLineNum = 1310724;BA.debugLine="MCode.colorAccent=ac.GetThemeAttribute(\"colorAcce";
mostCurrent._mcode._coloraccent /*int*/  = _ac.GetThemeAttribute(mostCurrent.activityBA,"colorAccent");
RDebugUtils.currentLine=1310725;
 //BA.debugLineNum = 1310725;BA.debugLine="Log(MCode.colorPrimary)";
anywheresoftware.b4a.keywords.Common.LogImpl("51310725",BA.NumberToString(mostCurrent._mcode._colorprimary /*int*/ ),0);
RDebugUtils.currentLine=1310726;
 //BA.debugLineNum = 1310726;BA.debugLine="Log(MCode.colorPrimaryDark)";
anywheresoftware.b4a.keywords.Common.LogImpl("51310726",BA.NumberToString(mostCurrent._mcode._colorprimarydark /*int*/ ),0);
RDebugUtils.currentLine=1310727;
 //BA.debugLineNum = 1310727;BA.debugLine="Log(MCode.colorAccent)";
anywheresoftware.b4a.keywords.Common.LogImpl("51310727",BA.NumberToString(mostCurrent._mcode._coloraccent /*int*/ ),0);
RDebugUtils.currentLine=1310729;
 //BA.debugLineNum = 1310729;BA.debugLine="If MCode.DarkMode=\"True\" Then";
if ((mostCurrent._mcode._darkmode /*String*/ ).equals("True")) { 
RDebugUtils.currentLine=1310730;
 //BA.debugLineNum = 1310730;BA.debugLine="pnlActiveStatus.Color=MCode.colorPrimaryDark";
mostCurrent._pnlactivestatus.setColor(mostCurrent._mcode._colorprimarydark /*int*/ );
RDebugUtils.currentLine=1310731;
 //BA.debugLineNum = 1310731;BA.debugLine="Pnl_Top.Color=MCode.colorPrimaryDark";
mostCurrent._pnl_top.setColor(mostCurrent._mcode._colorprimarydark /*int*/ );
RDebugUtils.currentLine=1310732;
 //BA.debugLineNum = 1310732;BA.debugLine="PnlTopActivate.Color =MCode.colorPrimaryDark";
mostCurrent._pnltopactivate.setColor(mostCurrent._mcode._colorprimarydark /*int*/ );
RDebugUtils.currentLine=1310733;
 //BA.debugLineNum = 1310733;BA.debugLine="btnSendActivate.Color=MCode.colorPrimaryDark";
mostCurrent._btnsendactivate.setColor(mostCurrent._mcode._colorprimarydark /*int*/ );
RDebugUtils.currentLine=1310734;
 //BA.debugLineNum = 1310734;BA.debugLine="BtnBackUpPnl.Color=MCode.colorPrimaryDark";
mostCurrent._btnbackuppnl.setColor(mostCurrent._mcode._colorprimarydark /*int*/ );
RDebugUtils.currentLine=1310735;
 //BA.debugLineNum = 1310735;BA.debugLine="pnlMenu.Color=MCode.colorPrimaryDark";
mostCurrent._pnlmenu.setColor(mostCurrent._mcode._colorprimarydark /*int*/ );
RDebugUtils.currentLine=1310736;
 //BA.debugLineNum = 1310736;BA.debugLine="pnlImei.Color=MCode.colorPrimaryDark";
mostCurrent._pnlimei.setColor(mostCurrent._mcode._colorprimarydark /*int*/ );
RDebugUtils.currentLine=1310737;
 //BA.debugLineNum = 1310737;BA.debugLine="PnlDateVersion.Color=MCode.colorPrimaryDark";
mostCurrent._pnldateversion.setColor(mostCurrent._mcode._colorprimarydark /*int*/ );
RDebugUtils.currentLine=1310738;
 //BA.debugLineNum = 1310738;BA.debugLine="btnSetting.Color=MCode.colorPrimaryDark";
mostCurrent._btnsetting.setColor(mostCurrent._mcode._colorprimarydark /*int*/ );
 }else {
RDebugUtils.currentLine=1310740;
 //BA.debugLineNum = 1310740;BA.debugLine="pnlActiveStatus.Color=MCode.colorPrimary";
mostCurrent._pnlactivestatus.setColor(mostCurrent._mcode._colorprimary /*int*/ );
RDebugUtils.currentLine=1310741;
 //BA.debugLineNum = 1310741;BA.debugLine="Pnl_Top.Color=MCode.colorPrimary";
mostCurrent._pnl_top.setColor(mostCurrent._mcode._colorprimary /*int*/ );
RDebugUtils.currentLine=1310742;
 //BA.debugLineNum = 1310742;BA.debugLine="PnlTopActivate.Color=MCode.colorPrimary";
mostCurrent._pnltopactivate.setColor(mostCurrent._mcode._colorprimary /*int*/ );
RDebugUtils.currentLine=1310743;
 //BA.debugLineNum = 1310743;BA.debugLine="btnSendActivate.Color=MCode.colorPrimary";
mostCurrent._btnsendactivate.setColor(mostCurrent._mcode._colorprimary /*int*/ );
RDebugUtils.currentLine=1310744;
 //BA.debugLineNum = 1310744;BA.debugLine="BtnBackUpPnl.Color=MCode.colorPrimary";
mostCurrent._btnbackuppnl.setColor(mostCurrent._mcode._colorprimary /*int*/ );
RDebugUtils.currentLine=1310745;
 //BA.debugLineNum = 1310745;BA.debugLine="pnlMenu.Color=MCode.colorPrimary";
mostCurrent._pnlmenu.setColor(mostCurrent._mcode._colorprimary /*int*/ );
RDebugUtils.currentLine=1310746;
 //BA.debugLineNum = 1310746;BA.debugLine="pnlImei.Color=MCode.colorPrimary";
mostCurrent._pnlimei.setColor(mostCurrent._mcode._colorprimary /*int*/ );
RDebugUtils.currentLine=1310747;
 //BA.debugLineNum = 1310747;BA.debugLine="PnlDateVersion.Color=MCode.colorPrimary";
mostCurrent._pnldateversion.setColor(mostCurrent._mcode._colorprimary /*int*/ );
RDebugUtils.currentLine=1310748;
 //BA.debugLineNum = 1310748;BA.debugLine="btnSetting.Color=MCode.colorPrimary";
mostCurrent._btnsetting.setColor(mostCurrent._mcode._colorprimary /*int*/ );
 };
RDebugUtils.currentLine=1310751;
 //BA.debugLineNum = 1310751;BA.debugLine="End Sub";
return "";
}
public static String  _btndwnld_click() throws Exception{
RDebugUtils.currentModule="act_main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btndwnld_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btndwnld_click", null));}
RDebugUtils.currentLine=4849664;
 //BA.debugLineNum = 4849664;BA.debugLine="Sub btnDwnld_Click";
RDebugUtils.currentLine=4849666;
 //BA.debugLineNum = 4849666;BA.debugLine="Try";
try {RDebugUtils.currentLine=4849667;
 //BA.debugLineNum = 4849667;BA.debugLine="apkupdt.DownloadApk  'send out command; async re";
mostCurrent._apkupdt._downloadapk /*void*/ (null);
 } 
       catch (Exception e4) {
			processBA.setLastException(e4);RDebugUtils.currentLine=4849669;
 //BA.debugLineNum = 4849669;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("54849669",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=4849670;
 //BA.debugLineNum = 4849670;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-btnDwnld_Click");
 };
RDebugUtils.currentLine=4849672;
 //BA.debugLineNum = 4849672;BA.debugLine="End Sub";
return "";
}
public static void  _btninstall_click() throws Exception{
RDebugUtils.currentModule="act_main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btninstall_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "btninstall_click", null); return;}
ResumableSub_btnInstall_Click rsub = new ResumableSub_btnInstall_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_btnInstall_Click extends BA.ResumableSub {
public ResumableSub_btnInstall_Click(ir.parsikhesab.pakhsh.act_main parent) {
this.parent = parent;
}
ir.parsikhesab.pakhsh.act_main parent;
boolean _result = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_main";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=4915201;
 //BA.debugLineNum = 4915201;BA.debugLine="Try";
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
RDebugUtils.currentLine=4915202;
 //BA.debugLineNum = 4915202;BA.debugLine="Wait For (CheckInstallationRequirements) Complet";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_main", "btninstall_click"), _checkinstallationrequirements());
this.state = 7;
return;
case 7:
//C
this.state = 6;
_result = (Boolean) result[0];
;
RDebugUtils.currentLine=4915203;
 //BA.debugLineNum = 4915203;BA.debugLine="apkupdt.InstallApk(Result)  'send out command; a";
parent.mostCurrent._apkupdt._installapk /*String*/ (null,_result);
 if (true) break;

case 5:
//C
this.state = 6;
this.catchState = 0;
RDebugUtils.currentLine=4915205;
 //BA.debugLineNum = 4915205;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("54915205",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=4915206;
 //BA.debugLineNum = 4915206;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
parent.mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(parent.mostCurrent._activity.getTitle())+"-btnInstall_Click");
 if (true) break;
if (true) break;

case 6:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=4915208;
 //BA.debugLineNum = 4915208;BA.debugLine="End Sub";
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
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _checkinstallationrequirements() throws Exception{
RDebugUtils.currentModule="act_main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "checkinstallationrequirements", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "checkinstallationrequirements", null));}
ResumableSub_CheckInstallationRequirements rsub = new ResumableSub_CheckInstallationRequirements(null);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CheckInstallationRequirements extends BA.ResumableSub {
public ResumableSub_CheckInstallationRequirements(ir.parsikhesab.pakhsh.act_main parent) {
this.parent = parent;
}
ir.parsikhesab.pakhsh.act_main parent;
int _result = 0;
anywheresoftware.b4a.objects.IntentWrapper _in = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_main";

    while (true) {
try {

        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=5111809;
 //BA.debugLineNum = 5111809;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 16;
this.catchState = 15;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 15;
RDebugUtils.currentLine=5111810;
 //BA.debugLineNum = 5111810;BA.debugLine="If File.ExternalWritable = False Then";
if (true) break;

case 4:
//if
this.state = 13;
if (anywheresoftware.b4a.keywords.Common.File.getExternalWritable()==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 6;
}else 
{RDebugUtils.currentLine=5111813;
 //BA.debugLineNum = 5111813;BA.debugLine="Else If MCode.PImei.SdkVersion >= 26 And apkupdt";
if (parent.mostCurrent._mcode._pimei /*anywheresoftware.b4a.phone.Phone*/ .getSdkVersion()>=26 && parent.mostCurrent._apkupdt._canrequestpackageinstalls /*boolean*/ (null)==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 8;
}else 
{RDebugUtils.currentLine=5111821;
 //BA.debugLineNum = 5111821;BA.debugLine="Else If apkupdt.CheckNonMarketAppsEnabled = Fals";
if (parent.mostCurrent._apkupdt._checknonmarketappsenabled /*boolean*/ (null)==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 10;
}else {
this.state = 12;
}}}
if (true) break;

case 6:
//C
this.state = 13;
RDebugUtils.currentLine=5111811;
 //BA.debugLineNum = 5111811;BA.debugLine="MsgboxAsync(\"Storage card not available. Make s";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Storage card not available. Make sure that your device is not connected in USB storage mode."),BA.ObjectToCharSequence(""),processBA);
RDebugUtils.currentLine=5111812;
 //BA.debugLineNum = 5111812;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 8:
//C
this.state = 13;
RDebugUtils.currentLine=5111814;
 //BA.debugLineNum = 5111814;BA.debugLine="MsgboxAsync(\"Please allow me to install applica";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Please allow me to install applications."),BA.ObjectToCharSequence(""),processBA);
RDebugUtils.currentLine=5111815;
 //BA.debugLineNum = 5111815;BA.debugLine="Wait For Msgbox_Result(Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_main", "checkinstallationrequirements"), null);
this.state = 17;
return;
case 17:
//C
this.state = 13;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=5111816;
 //BA.debugLineNum = 5111816;BA.debugLine="Dim in As Intent";
_in = new anywheresoftware.b4a.objects.IntentWrapper();
RDebugUtils.currentLine=5111817;
 //BA.debugLineNum = 5111817;BA.debugLine="in.Initialize(\"android.settings.MANAGE_UNKNOWN_";
_in.Initialize("android.settings.MANAGE_UNKNOWN_APP_SOURCES","package:"+anywheresoftware.b4a.keywords.Common.Application.getPackageName());
RDebugUtils.currentLine=5111818;
 //BA.debugLineNum = 5111818;BA.debugLine="StartActivity(in)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(_in.getObject()));
RDebugUtils.currentLine=5111819;
 //BA.debugLineNum = 5111819;BA.debugLine="Wait For Activity_Resume '<-- wait for Activity";
anywheresoftware.b4a.keywords.Common.WaitFor("activity_resume", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_main", "checkinstallationrequirements"), null);
this.state = 18;
return;
case 18:
//C
this.state = 13;
;
RDebugUtils.currentLine=5111820;
 //BA.debugLineNum = 5111820;BA.debugLine="Return apkupdt.CanRequestPackageInstalls";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(parent.mostCurrent._apkupdt._canrequestpackageinstalls /*boolean*/ (null)));return;};
 if (true) break;

case 10:
//C
this.state = 13;
RDebugUtils.currentLine=5111822;
 //BA.debugLineNum = 5111822;BA.debugLine="MsgboxAsync(\"Please enable installation of non-";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Please enable installation of non-market applications."+anywheresoftware.b4a.keywords.Common.CRLF+"Under Settings - Security - Unknown sources"+anywheresoftware.b4a.keywords.Common.CRLF+"Or Settings - Applications - Unknown sources"),BA.ObjectToCharSequence(""),processBA);
RDebugUtils.currentLine=5111824;
 //BA.debugLineNum = 5111824;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=5111826;
 //BA.debugLineNum = 5111826;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 13:
//C
this.state = 16;
;
 if (true) break;

case 15:
//C
this.state = 16;
this.catchState = 0;
RDebugUtils.currentLine=5111829;
 //BA.debugLineNum = 5111829;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("55111829",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=5111830;
 //BA.debugLineNum = 5111830;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
parent.mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(parent.mostCurrent._activity.getTitle())+"-CheckInstallationRequirements");
RDebugUtils.currentLine=5111831;
 //BA.debugLineNum = 5111831;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;
if (true) break;

case 16:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=5111833;
 //BA.debugLineNum = 5111833;BA.debugLine="End Sub";
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
public static String  _btnno_click() throws Exception{
RDebugUtils.currentModule="act_main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnno_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnno_click", null));}
RDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Sub btnNo_Click";
RDebugUtils.currentLine=2818049;
 //BA.debugLineNum = 2818049;BA.debugLine="DialogGetData.CloseDialog(DialogResponse.NEGATIVE";
mostCurrent._dialoggetdata.CloseDialog(mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.DialogResponse.NEGATIVE);
RDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="End Sub";
return "";
}
public static String  _btnsendactivate_click() throws Exception{
RDebugUtils.currentModule="act_main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnsendactivate_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnsendactivate_click", null));}
String _query = "";
RDebugUtils.currentLine=5701632;
 //BA.debugLineNum = 5701632;BA.debugLine="Sub btnSendActivate_Click";
RDebugUtils.currentLine=5701633;
 //BA.debugLineNum = 5701633;BA.debugLine="Try";
try {RDebugUtils.currentLine=5701634;
 //BA.debugLineNum = 5701634;BA.debugLine="If txtCodeMoshtari.Text<>\"\" And txtNameVisitor.T";
if ((mostCurrent._txtcodemoshtari.getText()).equals("") == false && (mostCurrent._txtnamevisitor.getText()).equals("") == false) { 
RDebugUtils.currentLine=5701636;
 //BA.debugLineNum = 5701636;BA.debugLine="MCode.CodeMoshtari=txtCodeMoshtari.Text";
mostCurrent._mcode._codemoshtari /*String*/  = mostCurrent._txtcodemoshtari.getText();
RDebugUtils.currentLine=5701637;
 //BA.debugLineNum = 5701637;BA.debugLine="MCode.N_Visitor=txtNameVisitor.Text";
mostCurrent._mcode._n_visitor /*String*/  = mostCurrent._txtnamevisitor.getText();
RDebugUtils.currentLine=5701639;
 //BA.debugLineNum = 5701639;BA.debugLine="Dim Query As String=\"Update TblSetting Set FldT";
_query = "Update TblSetting Set FldTokenId = '"+mostCurrent._mcode._deviceid /*String*/ +"',FldCodeMoshtari = '"+mostCurrent._txtcodemoshtari.getText()+"',FldNameVisitor = '"+mostCurrent._txtnamevisitor.getText()+"'";
RDebugUtils.currentLine=5701640;
 //BA.debugLineNum = 5701640;BA.debugLine="MCode.SaveUpdate(Query)";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,_query);
RDebugUtils.currentLine=5701641;
 //BA.debugLineNum = 5701641;BA.debugLine="MCode.page=\"Act_Main\"";
mostCurrent._mcode._page /*String*/  = "Act_Main";
RDebugUtils.currentLine=5701642;
 //BA.debugLineNum = 5701642;BA.debugLine="MCode.NoeGet=\"SendTokenId\"";
mostCurrent._mcode._noeget /*String*/  = "SendTokenId";
RDebugUtils.currentLine=5701644;
 //BA.debugLineNum = 5701644;BA.debugLine="StopService(FusedLocationService)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(mostCurrent._fusedlocationservice.getObject()));
RDebugUtils.currentLine=5701645;
 //BA.debugLineNum = 5701645;BA.debugLine="MCode.GpsIsEnable=False";
mostCurrent._mcode._gpsisenable /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=5701646;
 //BA.debugLineNum = 5701646;BA.debugLine="Log(\"Gps Stop\")";
anywheresoftware.b4a.keywords.Common.LogImpl("55701646","Gps Stop",0);
RDebugUtils.currentLine=5701648;
 //BA.debugLineNum = 5701648;BA.debugLine="StartService(Service_Server)";
anywheresoftware.b4a.keywords.Common.StartService(processBA,(Object)(mostCurrent._service_server.getObject()));
RDebugUtils.currentLine=5701651;
 //BA.debugLineNum = 5701651;BA.debugLine="PnlActivate.Visible=False";
mostCurrent._pnlactivate.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=5701652;
 //BA.debugLineNum = 5701652;BA.debugLine="MCode.AnimationClose(PnlActivate)";
mostCurrent._mcode._animationclose /*String*/ (mostCurrent.activityBA,(Object)(mostCurrent._pnlactivate.getObject()));
 }else {
RDebugUtils.currentLine=5701655;
 //BA.debugLineNum = 5701655;BA.debugLine="ToastMessageShow(\"لطفا فیلد های خالی را تکمیل ن";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("لطفا فیلد های خالی را تکمیل نمایید"),anywheresoftware.b4a.keywords.Common.False);
 };
 } 
       catch (Exception e19) {
			processBA.setLastException(e19);RDebugUtils.currentLine=5701658;
 //BA.debugLineNum = 5701658;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("55701658",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=5701659;
 //BA.debugLineNum = 5701659;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-btnSendActivate_Click");
 };
RDebugUtils.currentLine=5701661;
 //BA.debugLineNum = 5701661;BA.debugLine="End Sub";
return "";
}
public static String  _btnsetting_click() throws Exception{
RDebugUtils.currentModule="act_main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnsetting_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnsetting_click", null));}
RDebugUtils.currentLine=6029312;
 //BA.debugLineNum = 6029312;BA.debugLine="Private Sub btnSetting_Click";
RDebugUtils.currentLine=6029313;
 //BA.debugLineNum = 6029313;BA.debugLine="StartActivity(Act_Setting)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._act_setting.getObject()));
RDebugUtils.currentLine=6029314;
 //BA.debugLineNum = 6029314;BA.debugLine="End Sub";
return "";
}
public static String  _btnwebver_click() throws Exception{
RDebugUtils.currentModule="act_main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnwebver_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnwebver_click", null));}
RDebugUtils.currentLine=4718592;
 //BA.debugLineNum = 4718592;BA.debugLine="Sub btnWebVer_Click";
RDebugUtils.currentLine=4718594;
 //BA.debugLineNum = 4718594;BA.debugLine="apkupdt.ReadWebVN  'send out command; async resul";
mostCurrent._apkupdt._readwebvn /*void*/ (null);
RDebugUtils.currentLine=4718595;
 //BA.debugLineNum = 4718595;BA.debugLine="End Sub";
return "";
}
public static String  _btnyes_click() throws Exception{
RDebugUtils.currentModule="act_main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnyes_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnyes_click", null));}
String _date = "";
String _time = "";
String _dt = "";
RDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Sub BtnYes_Click";
RDebugUtils.currentLine=2883585;
 //BA.debugLineNum = 2883585;BA.debugLine="Try";
try {RDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="DialogGetData.CloseDialog(DialogResponse.POSITIV";
mostCurrent._dialoggetdata.CloseDialog(mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE);
RDebugUtils.currentLine=2883587;
 //BA.debugLineNum = 2883587;BA.debugLine="Log(\"pnlGetData_Click\")";
anywheresoftware.b4a.keywords.Common.LogImpl("52883587","pnlGetData_Click",0);
RDebugUtils.currentLine=2883588;
 //BA.debugLineNum = 2883588;BA.debugLine="Dim Date As String = MCode.ConvertNumbersPersian";
_date = mostCurrent._mcode._convertnumberspersian2english /*String*/ (mostCurrent.activityBA,mostCurrent._mcode._datepersian /*String*/ (mostCurrent.activityBA));
RDebugUtils.currentLine=2883589;
 //BA.debugLineNum = 2883589;BA.debugLine="Dim Time As String = DateTime.Time(DateTime.Now)";
_time = anywheresoftware.b4a.keywords.Common.DateTime.Time(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
RDebugUtils.currentLine=2883590;
 //BA.debugLineNum = 2883590;BA.debugLine="Date = MCode.sf.Mid(Date,1,4) & \"/\" & MCode.sf.M";
_date = mostCurrent._mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvv5(_date,(int) (1),(int) (4))+"/"+mostCurrent._mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvv5(_date,(int) (5),(int) (2))+"/"+mostCurrent._mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvv5(_date,(int) (7),(int) (2));
RDebugUtils.currentLine=2883591;
 //BA.debugLineNum = 2883591;BA.debugLine="Dim Dt As String = Date & \"   \" & Time";
_dt = _date+"   "+_time;
RDebugUtils.currentLine=2883592;
 //BA.debugLineNum = 2883592;BA.debugLine="MCode.saveUpdate(\"Update TblSetting Set FldDateT";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Update TblSetting Set FldDateTimeRecive = '"+_dt+"'");
RDebugUtils.currentLine=2883593;
 //BA.debugLineNum = 2883593;BA.debugLine="ProgressDialogShow2(\"درحال دریافت اطلاعات...\",Fa";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(mostCurrent.activityBA,BA.ObjectToCharSequence("درحال دریافت اطلاعات..."),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2883599;
 //BA.debugLineNum = 2883599;BA.debugLine="StopService(FusedLocationService)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(mostCurrent._fusedlocationservice.getObject()));
RDebugUtils.currentLine=2883600;
 //BA.debugLineNum = 2883600;BA.debugLine="MCode.GpsIsEnable=False";
mostCurrent._mcode._gpsisenable /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=2883601;
 //BA.debugLineNum = 2883601;BA.debugLine="Log(\"Gps Stop\")";
anywheresoftware.b4a.keywords.Common.LogImpl("52883601","Gps Stop",0);
RDebugUtils.currentLine=2883602;
 //BA.debugLineNum = 2883602;BA.debugLine="StopService(FirebaseMessaging)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(mostCurrent._firebasemessaging.getObject()));
RDebugUtils.currentLine=2883603;
 //BA.debugLineNum = 2883603;BA.debugLine="Log(\"FirebaseMessaging Stop\")";
anywheresoftware.b4a.keywords.Common.LogImpl("52883603","FirebaseMessaging Stop",0);
RDebugUtils.currentLine=2883604;
 //BA.debugLineNum = 2883604;BA.debugLine="MCode.NoeGet=\"DaryaftEtlaat\"";
mostCurrent._mcode._noeget /*String*/  = "DaryaftEtlaat";
RDebugUtils.currentLine=2883605;
 //BA.debugLineNum = 2883605;BA.debugLine="ProgressDialogShow2(\"نرم افزار درحال دریافت اطلا";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(mostCurrent.activityBA,BA.ObjectToCharSequence("نرم افزار درحال دریافت اطلاعات از سرور میباشد، لطفا تا پایان عملیات دریافت منتظر بمانید"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2883608;
 //BA.debugLineNum = 2883608;BA.debugLine="StartService(Service_Server)";
anywheresoftware.b4a.keywords.Common.StartService(processBA,(Object)(mostCurrent._service_server.getObject()));
 } 
       catch (Exception e19) {
			processBA.setLastException(e19);RDebugUtils.currentLine=2883610;
 //BA.debugLineNum = 2883610;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("52883610",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=2883611;
 //BA.debugLineNum = 2883611;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-BtnYes_Click");
 };
RDebugUtils.currentLine=2883613;
 //BA.debugLineNum = 2883613;BA.debugLine="End Sub";
return "";
}
public static String  _button1_click() throws Exception{
RDebugUtils.currentModule="act_main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "button1_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "button1_click", null));}
RDebugUtils.currentLine=3932160;
 //BA.debugLineNum = 3932160;BA.debugLine="Sub Button1_Click";
RDebugUtils.currentLine=3932162;
 //BA.debugLineNum = 3932162;BA.debugLine="If MCode.C_Visitor=\"کد ویزیتور\"  Then";
if ((mostCurrent._mcode._c_visitor /*String*/ ).equals("کد ویزیتور")) { 
RDebugUtils.currentLine=3932163;
 //BA.debugLineNum = 3932163;BA.debugLine="ToastMessageShow(\"ابتدا دریافت اطلاعات را انجام";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("ابتدا دریافت اطلاعات را انجام دهید"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3932164;
 //BA.debugLineNum = 3932164;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=3932166;
 //BA.debugLineNum = 3932166;BA.debugLine="If MCode.C_Visitor.Length<5 Then";
if (mostCurrent._mcode._c_visitor /*String*/ .length()<5) { 
RDebugUtils.currentLine=3932167;
 //BA.debugLineNum = 3932167;BA.debugLine="ToastMessageShow(\"کد ویزیتور شما صحیح نیست\",True";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("کد ویزیتور شما صحیح نیست"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3932168;
 //BA.debugLineNum = 3932168;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=3932170;
 //BA.debugLineNum = 3932170;BA.debugLine="StartActivity(Act_Notif)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._act_notif.getObject()));
RDebugUtils.currentLine=3932171;
 //BA.debugLineNum = 3932171;BA.debugLine="End Sub";
return "";
}
public static String  _button2_click() throws Exception{
RDebugUtils.currentModule="act_main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "button2_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "button2_click", null));}
RDebugUtils.currentLine=3997696;
 //BA.debugLineNum = 3997696;BA.debugLine="Sub Button2_Click";
RDebugUtils.currentLine=3997698;
 //BA.debugLineNum = 3997698;BA.debugLine="StartActivity(Act_Support)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._act_support.getObject()));
RDebugUtils.currentLine=3997699;
 //BA.debugLineNum = 3997699;BA.debugLine="End Sub";
return "";
}
public static String  _button3_click() throws Exception{
RDebugUtils.currentModule="act_main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "button3_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "button3_click", null));}
RDebugUtils.currentLine=4063232;
 //BA.debugLineNum = 4063232;BA.debugLine="Sub Button3_Click";
RDebugUtils.currentLine=4063234;
 //BA.debugLineNum = 4063234;BA.debugLine="StartActivity(Act_Ticket)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._act_ticket.getObject()));
RDebugUtils.currentLine=4063235;
 //BA.debugLineNum = 4063235;BA.debugLine="End Sub";
return "";
}
public static String  _kalasearch() throws Exception{
RDebugUtils.currentModule="act_main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "kalasearch", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "kalasearch", null));}
RDebugUtils.currentLine=4128768;
 //BA.debugLineNum = 4128768;BA.debugLine="Sub KalaSearch";
RDebugUtils.currentLine=4128778;
 //BA.debugLineNum = 4128778;BA.debugLine="StartActivity(Act_Search)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._act_search.getObject()));
RDebugUtils.currentLine=4128779;
 //BA.debugLineNum = 4128779;BA.debugLine="End Sub";
return "";
}
public static void  _buttonupdate_click() throws Exception{
RDebugUtils.currentModule="act_main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonupdate_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "buttonupdate_click", null); return;}
ResumableSub_ButtonUpdate_Click rsub = new ResumableSub_ButtonUpdate_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_ButtonUpdate_Click extends BA.ResumableSub {
public ResumableSub_ButtonUpdate_Click(ir.parsikhesab.pakhsh.act_main parent) {
this.parent = parent;
}
ir.parsikhesab.pakhsh.act_main parent;
boolean _result = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_main";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=4980737;
 //BA.debugLineNum = 4980737;BA.debugLine="Try";
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
RDebugUtils.currentLine=4980739;
 //BA.debugLineNum = 4980739;BA.debugLine="Wait For (CheckInstallationRequirements) Complet";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_main", "buttonupdate_click"), _checkinstallationrequirements());
this.state = 7;
return;
case 7:
//C
this.state = 6;
_result = (Boolean) result[0];
;
RDebugUtils.currentLine=4980741;
 //BA.debugLineNum = 4980741;BA.debugLine="apkupdt.SetAndStartSplashScreen(Activity,LoadBit";
parent.mostCurrent._apkupdt._setandstartsplashscreen /*String*/ (null,parent.mostCurrent._activity,anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"bg-update-parsik-splash.jpg"));
RDebugUtils.currentLine=4980743;
 //BA.debugLineNum = 4980743;BA.debugLine="apkupdt.UpdateApk(Result) 'checks for newer apk,";
parent.mostCurrent._apkupdt._updateapk /*void*/ (null,_result);
 if (true) break;

case 5:
//C
this.state = 6;
this.catchState = 0;
RDebugUtils.currentLine=4980745;
 //BA.debugLineNum = 4980745;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("54980745",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=4980746;
 //BA.debugLineNum = 4980746;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
parent.mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(parent.mostCurrent._activity.getTitle())+"-ButtonUpdate_Click");
 if (true) break;
if (true) break;

case 6:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=4980748;
 //BA.debugLineNum = 4980748;BA.debugLine="End Sub";
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
public static String  _checkadmin() throws Exception{
RDebugUtils.currentModule="act_main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "checkadmin", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "checkadmin", null));}
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Public Sub CheckAdmin";
RDebugUtils.currentLine=1572865;
 //BA.debugLineNum = 1572865;BA.debugLine="Try";
try {RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="If MCode.Admin=\"1\" Then";
if ((mostCurrent._mcode._admin /*String*/ ).equals("1")) { 
RDebugUtils.currentLine=1572867;
 //BA.debugLineNum = 1572867;BA.debugLine="pnl_smartphone.Visible=False";
mostCurrent._pnl_smartphone.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1572868;
 //BA.debugLineNum = 1572868;BA.debugLine="pnl_map.Visible=True";
mostCurrent._pnl_map.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1572869;
 //BA.debugLineNum = 1572869;BA.debugLine="If MCode.Tozie=0 Then";
if ((mostCurrent._mcode._tozie /*String*/ ).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=1572870;
 //BA.debugLineNum = 1572870;BA.debugLine="pnl_map.Top=pnl_smartphone.Top";
mostCurrent._pnl_map.setTop(mostCurrent._pnl_smartphone.getTop());
 }else {
RDebugUtils.currentLine=1572872;
 //BA.debugLineNum = 1572872;BA.debugLine="pnl_map.Top=pnl_Havale.Top";
mostCurrent._pnl_map.setTop(mostCurrent._pnl_havale.getTop());
RDebugUtils.currentLine=1572873;
 //BA.debugLineNum = 1572873;BA.debugLine="pnl_map.Left=pnl_Havale.Left+43%x";
mostCurrent._pnl_map.setLeft((int) (mostCurrent._pnl_havale.getLeft()+anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (43),mostCurrent.activityBA)));
 };
 }else {
RDebugUtils.currentLine=1572877;
 //BA.debugLineNum = 1572877;BA.debugLine="pnl_smartphone.Visible=False";
mostCurrent._pnl_smartphone.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1572878;
 //BA.debugLineNum = 1572878;BA.debugLine="pnl_map.Visible=False";
mostCurrent._pnl_map.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
 } 
       catch (Exception e16) {
			processBA.setLastException(e16);RDebugUtils.currentLine=1572881;
 //BA.debugLineNum = 1572881;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("51572881",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=1572882;
 //BA.debugLineNum = 1572882;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-CheckAdmin");
 };
RDebugUtils.currentLine=1572884;
 //BA.debugLineNum = 1572884;BA.debugLine="End Sub";
return "";
}
public static String  _checkgettourvisitortoday() throws Exception{
RDebugUtils.currentModule="act_main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "checkgettourvisitortoday", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "checkgettourvisitortoday", null));}
int _count = 0;
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Sub CheckGetTourVisitorToday";
RDebugUtils.currentLine=1769473;
 //BA.debugLineNum = 1769473;BA.debugLine="Try";
try {RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="If MCode.Vaziat=0 Then";
if (mostCurrent._mcode._vaziat /*int*/ ==0) { 
RDebugUtils.currentLine=1769475;
 //BA.debugLineNum = 1769475;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=1769477;
 //BA.debugLineNum = 1769477;BA.debugLine="If MCode.C_Visitor=\"کد ویزیتور\"  Then";
if ((mostCurrent._mcode._c_visitor /*String*/ ).equals("کد ویزیتور")) { 
RDebugUtils.currentLine=1769478;
 //BA.debugLineNum = 1769478;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=1769480;
 //BA.debugLineNum = 1769480;BA.debugLine="If MCode.C_Visitor.Length<5 Then";
if (mostCurrent._mcode._c_visitor /*String*/ .length()<5) { 
RDebugUtils.currentLine=1769481;
 //BA.debugLineNum = 1769481;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=1769484;
 //BA.debugLineNum = 1769484;BA.debugLine="If MCode.TourVisit=1 Then";
if ((mostCurrent._mcode._tourvisit /*String*/ ).equals(BA.NumberToString(1))) { 
RDebugUtils.currentLine=1769485;
 //BA.debugLineNum = 1769485;BA.debugLine="Dim count As Int=MCode.SingleResult($\"Select Co";
_count = (int)(BA.ObjectToNumber(mostCurrent._mcode._singleresult /*Object*/ (mostCurrent.activityBA,("Select Count(Id) from tblTourVisitor where fldDateVisit="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._mcode._datepersian /*String*/ (mostCurrent.activityBA)))+""))));
RDebugUtils.currentLine=1769486;
 //BA.debugLineNum = 1769486;BA.debugLine="If count=0 Then";
if (_count==0) { 
RDebugUtils.currentLine=1769487;
 //BA.debugLineNum = 1769487;BA.debugLine="ProgressDialogShow(\"جهت دریافت لیست تور های جدی";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("جهت دریافت لیست تور های جدید لطفا چند لحظه صبر کنید..."));
RDebugUtils.currentLine=1769488;
 //BA.debugLineNum = 1769488;BA.debugLine="MCode.NoeGet=\"GetTourVisitor\"";
mostCurrent._mcode._noeget /*String*/  = "GetTourVisitor";
RDebugUtils.currentLine=1769489;
 //BA.debugLineNum = 1769489;BA.debugLine="CallSubDelayed(Service_Server,\"GetTourVisitor";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,(Object)(mostCurrent._service_server.getObject()),"GetTourVisitor");
 };
 };
 } 
       catch (Exception e20) {
			processBA.setLastException(e20);RDebugUtils.currentLine=1769495;
 //BA.debugLineNum = 1769495;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("51769495",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=1769496;
 //BA.debugLineNum = 1769496;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-CheckGetTourVisitorToday");
 };
RDebugUtils.currentLine=1769498;
 //BA.debugLineNum = 1769498;BA.debugLine="End Sub";
return "";
}
public static String  _checktozie() throws Exception{
RDebugUtils.currentModule="act_main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "checktozie", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "checktozie", null));}
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Public Sub CheckTozie";
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="Try";
try {RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="If MCode.Tozie=\"1\" Then";
if ((mostCurrent._mcode._tozie /*String*/ ).equals("1")) { 
RDebugUtils.currentLine=1638403;
 //BA.debugLineNum = 1638403;BA.debugLine="pnl_Havale.Visible=True";
mostCurrent._pnl_havale.setVisible(anywheresoftware.b4a.keywords.Common.True);
 }else {
RDebugUtils.currentLine=1638405;
 //BA.debugLineNum = 1638405;BA.debugLine="pnl_Havale.Visible=False";
mostCurrent._pnl_havale.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
 } 
       catch (Exception e8) {
			processBA.setLastException(e8);RDebugUtils.currentLine=1638408;
 //BA.debugLineNum = 1638408;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("51638408",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=1638409;
 //BA.debugLineNum = 1638409;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-CheckTozie");
 };
RDebugUtils.currentLine=1638411;
 //BA.debugLineNum = 1638411;BA.debugLine="End Sub";
return "";
}
public static String  _checkvaziat() throws Exception{
RDebugUtils.currentModule="act_main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "checkvaziat", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "checkvaziat", null));}
String _query = "";
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Sub CheckVaziat";
RDebugUtils.currentLine=1703937;
 //BA.debugLineNum = 1703937;BA.debugLine="If MCode.IsConnected Then";
if (mostCurrent._mcode._isconnected /*boolean*/ (mostCurrent.activityBA)) { 
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="If MCode.CodeMoshtari=0 Then";
if ((mostCurrent._mcode._codemoshtari /*String*/ ).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=1703939;
 //BA.debugLineNum = 1703939;BA.debugLine="Dim Query As String=\"Update TblSetting Set FldV";
_query = "Update TblSetting Set FldVaziat = '0'";
RDebugUtils.currentLine=1703940;
 //BA.debugLineNum = 1703940;BA.debugLine="MCode.SaveUpdate(Query)";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,_query);
RDebugUtils.currentLine=1703942;
 //BA.debugLineNum = 1703942;BA.debugLine="MCode.Vaziat=0";
mostCurrent._mcode._vaziat /*int*/  = (int) (0);
 };
RDebugUtils.currentLine=1703944;
 //BA.debugLineNum = 1703944;BA.debugLine="ProgressDialogShow(\"جهت بررسی وضعیت نرم افزار لط";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("جهت بررسی وضعیت نرم افزار لطفا چند لحظه صبر کنید..."));
RDebugUtils.currentLine=1703945;
 //BA.debugLineNum = 1703945;BA.debugLine="If MCode.Vaziat=0 Then";
if (mostCurrent._mcode._vaziat /*int*/ ==0) { 
RDebugUtils.currentLine=1703946;
 //BA.debugLineNum = 1703946;BA.debugLine="MCode.NoeGet=\"GetVaziat\"";
mostCurrent._mcode._noeget /*String*/  = "GetVaziat";
 }else {
RDebugUtils.currentLine=1703948;
 //BA.debugLineNum = 1703948;BA.debugLine="MCode.NoeGet=\"GetCodeMoshtari\"";
mostCurrent._mcode._noeget /*String*/  = "GetCodeMoshtari";
 };
RDebugUtils.currentLine=1703951;
 //BA.debugLineNum = 1703951;BA.debugLine="StartService(Service_Server)";
anywheresoftware.b4a.keywords.Common.StartService(processBA,(Object)(mostCurrent._service_server.getObject()));
 }else {
RDebugUtils.currentLine=1703953;
 //BA.debugLineNum = 1703953;BA.debugLine="LoadPage";
_loadpage();
 };
RDebugUtils.currentLine=1703957;
 //BA.debugLineNum = 1703957;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _getadvertisingid() throws Exception{
RDebugUtils.currentModule="act_main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "getadvertisingid", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "getadvertisingid", null));}
ResumableSub_GetAdvertisingId rsub = new ResumableSub_GetAdvertisingId(null);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_GetAdvertisingId extends BA.ResumableSub {
public ResumableSub_GetAdvertisingId(ir.parsikhesab.pakhsh.act_main parent) {
this.parent = parent;
}
ir.parsikhesab.pakhsh.act_main parent;
anywheresoftware.b4j.object.JavaObject _jo = null;
boolean _success = false;
String _id = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_main";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=3670017;
 //BA.debugLineNum = 3670017;BA.debugLine="Dim jo As JavaObject = Me";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(act_main.getObject()));
RDebugUtils.currentLine=3670018;
 //BA.debugLineNum = 3670018;BA.debugLine="jo.RunMethod(\"GetAdvertisingId\", Null)";
_jo.RunMethod("GetAdvertisingId",(Object[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=3670019;
 //BA.debugLineNum = 3670019;BA.debugLine="Wait For AdvertisingId_Ready (Success As Boolean,";
anywheresoftware.b4a.keywords.Common.WaitFor("advertisingid_ready", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_main", "getadvertisingid"), null);
this.state = 1;
return;
case 1:
//C
this.state = -1;
_success = (Boolean) result[0];
_id = (String) result[1];
;
RDebugUtils.currentLine=3670020;
 //BA.debugLineNum = 3670020;BA.debugLine="Return Id";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_id));return;};
RDebugUtils.currentLine=3670021;
 //BA.debugLineNum = 3670021;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _getdeviceid() throws Exception{
RDebugUtils.currentModule="act_main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "getdeviceid", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "getdeviceid", null));}
anywheresoftware.b4a.phone.Phone _p = null;
String _id = "";
RDebugUtils.currentLine=3735552;
 //BA.debugLineNum = 3735552;BA.debugLine="Sub GetDeviceId As String";
RDebugUtils.currentLine=3735553;
 //BA.debugLineNum = 3735553;BA.debugLine="Dim P As Phone";
_p = new anywheresoftware.b4a.phone.Phone();
RDebugUtils.currentLine=3735554;
 //BA.debugLineNum = 3735554;BA.debugLine="Dim id As String";
_id = "";
RDebugUtils.currentLine=3735578;
 //BA.debugLineNum = 3735578;BA.debugLine="id= P.GetSettings(\"android_id\")";
_id = _p.GetSettings("android_id");
RDebugUtils.currentLine=3735579;
 //BA.debugLineNum = 3735579;BA.debugLine="id = id.Replace(\"-\",\"\")";
_id = _id.replace("-","");
RDebugUtils.currentLine=3735583;
 //BA.debugLineNum = 3735583;BA.debugLine="Return id";
if (true) return _id;
RDebugUtils.currentLine=3735584;
 //BA.debugLineNum = 3735584;BA.debugLine="End Sub";
return "";
}
public static int  _hlv_getitemcount() throws Exception{
RDebugUtils.currentModule="act_main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "hlv_getitemcount", false))
	 {return ((Integer) Debug.delegate(mostCurrent.activityBA, "hlv_getitemcount", null));}
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Sub HLV_GetItemCount As Int 								        '💯 It";
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="Return ListItemHome.Size";
if (true) return mostCurrent._listitemhome.getSize();
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="End Sub";
return 0;
}
public static String  _hlv_onbindviewholder(anywheresoftware.b4a.objects.PanelWrapper _parent,int _position) throws Exception{
RDebugUtils.currentModule="act_main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "hlv_onbindviewholder", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "hlv_onbindviewholder", new Object[] {_parent,_position}));}
ir.parsikhesab.pakhsh.mcode._adapteritemhome _item = null;
ir.parsikhesab.pakhsh.cls_item_home _rec = null;
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Sub HLV_onBindViewHolder (Parent As Panel, Positio";
RDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="Dim Item = ListItemHome.Get(Position) As AdapterI";
_item = (ir.parsikhesab.pakhsh.mcode._adapteritemhome)(mostCurrent._listitemhome.Get(_position));
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="Dim rec As cls_Item_Home=Parent.Tag";
_rec = (ir.parsikhesab.pakhsh.cls_item_home)(_parent.getTag());
RDebugUtils.currentLine=1507331;
 //BA.debugLineNum = 1507331;BA.debugLine="rec.show(Item)";
_rec._show /*String*/ (null,_item);
RDebugUtils.currentLine=1507332;
 //BA.debugLineNum = 1507332;BA.debugLine="Parent.Height=rec.Height";
_parent.setHeight(_rec._getheight /*int*/ (null));
RDebugUtils.currentLine=1507333;
 //BA.debugLineNum = 1507333;BA.debugLine="End Sub";
return "";
}
public static String  _hlv_oncreateviewholder(anywheresoftware.b4a.objects.PanelWrapper _parent,int _viewtype) throws Exception{
RDebugUtils.currentModule="act_main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "hlv_oncreateviewholder", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "hlv_oncreateviewholder", new Object[] {_parent,_viewtype}));}
ir.parsikhesab.pakhsh.cls_item_home _rec = null;
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Sub HLV_onCreateViewHolder (Parent As Panel, ViewT";
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="Dim rec As cls_Item_Home";
_rec = new ir.parsikhesab.pakhsh.cls_item_home();
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="rec.Initialize";
_rec._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=1441795;
 //BA.debugLineNum = 1441795;BA.debugLine="Parent.AddView(rec.Panel,0,0,100%x,rec.Height)";
_parent.AddView((android.view.View)(_rec._getpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ (null).getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),_rec._getheight /*int*/ (null));
RDebugUtils.currentLine=1441796;
 //BA.debugLineNum = 1441796;BA.debugLine="Parent.Tag=rec";
_parent.setTag((Object)(_rec));
RDebugUtils.currentLine=1441797;
 //BA.debugLineNum = 1441797;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(ir.parsikhesab.pakhsh.httpjob _job) throws Exception{
RDebugUtils.currentModule="act_main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "jobdone", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "jobdone", new Object[] {_job}));}
String _str = "";
RDebugUtils.currentLine=5308416;
 //BA.debugLineNum = 5308416;BA.debugLine="Sub JobDone (Job As HttpJob)";
RDebugUtils.currentLine=5308417;
 //BA.debugLineNum = 5308417;BA.debugLine="Try";
try {RDebugUtils.currentLine=5308418;
 //BA.debugLineNum = 5308418;BA.debugLine="Job.GetRequest.Timeout=50000";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout((int) (50000));
RDebugUtils.currentLine=5308419;
 //BA.debugLineNum = 5308419;BA.debugLine="If Job.Success Then";
if (_job._success /*boolean*/ ) { 
RDebugUtils.currentLine=5308421;
 //BA.debugLineNum = 5308421;BA.debugLine="Dim Str As String = Job.GetString";
_str = _job._getstring /*String*/ (null);
RDebugUtils.currentLine=5308422;
 //BA.debugLineNum = 5308422;BA.debugLine="Select Case Job.JobName";
switch (BA.switchObjectToInt(_job._jobname /*String*/ ,"GetVersion")) {
case 0: {
RDebugUtils.currentLine=5308424;
 //BA.debugLineNum = 5308424;BA.debugLine="If Str = \"No Result\" Then";
if ((_str).equals("No Result")) { 
RDebugUtils.currentLine=5308425;
 //BA.debugLineNum = 5308425;BA.debugLine="ToastMessageShow(\"امکان آپدیت نرم افزار وجود";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("امکان آپدیت نرم افزار وجود ندارد"),anywheresoftware.b4a.keywords.Common.True);
 }else {
RDebugUtils.currentLine=5308427;
 //BA.debugLineNum = 5308427;BA.debugLine="LoadGetVersion(Str)";
_loadgetversion(_str);
 };
 break; }
}
;
 }else {
RDebugUtils.currentLine=5308431;
 //BA.debugLineNum = 5308431;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 };
RDebugUtils.currentLine=5308434;
 //BA.debugLineNum = 5308434;BA.debugLine="jobInternet.Release";
mostCurrent._jobinternet._release /*String*/ (null);
 } 
       catch (Exception e18) {
			processBA.setLastException(e18);RDebugUtils.currentLine=5308436;
 //BA.debugLineNum = 5308436;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("55308436",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=5308437;
 //BA.debugLineNum = 5308437;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-JobDone");
 };
RDebugUtils.currentLine=5308439;
 //BA.debugLineNum = 5308439;BA.debugLine="End Sub";
return "";
}
public static void  _loadgetversion(String _str) throws Exception{
RDebugUtils.currentModule="act_main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "loadgetversion", false))
	 {Debug.delegate(mostCurrent.activityBA, "loadgetversion", new Object[] {_str}); return;}
ResumableSub_LoadGetVersion rsub = new ResumableSub_LoadGetVersion(null,_str);
rsub.resume(processBA, null);
}
public static class ResumableSub_LoadGetVersion extends BA.ResumableSub {
public ResumableSub_LoadGetVersion(ir.parsikhesab.pakhsh.act_main parent,String _str) {
this.parent = parent;
this._str = _str;
}
ir.parsikhesab.pakhsh.act_main parent;
String _str;
anywheresoftware.b4a.objects.collections.List _rowslist = null;
anywheresoftware.b4a.objects.collections.Map _row = null;
String _numver = "";
Object _sf = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_main";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=5242881;
 //BA.debugLineNum = 5242881;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 25;
this.catchState = 24;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 24;
RDebugUtils.currentLine=5242882;
 //BA.debugLineNum = 5242882;BA.debugLine="Dim RowsList As List";
_rowslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=5242883;
 //BA.debugLineNum = 5242883;BA.debugLine="Dim Row As Map";
_row = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=5242884;
 //BA.debugLineNum = 5242884;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
parent.mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_str.trim());
RDebugUtils.currentLine=5242885;
 //BA.debugLineNum = 5242885;BA.debugLine="RowsList = MCode.Json.NextArray";
_rowslist = parent.mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=5242886;
 //BA.debugLineNum = 5242886;BA.debugLine="Row=RowsList.Get(0)";
_row = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_rowslist.Get((int) (0))));
RDebugUtils.currentLine=5242887;
 //BA.debugLineNum = 5242887;BA.debugLine="MCode.NewVersion = Row.Get(\"FldVersion\")";
parent.mostCurrent._mcode._newversion /*String*/  = BA.ObjectToString(_row.Get((Object)("FldVersion")));
RDebugUtils.currentLine=5242888;
 //BA.debugLineNum = 5242888;BA.debugLine="MCode.LinkDownload = Row.Get(\"FldLink\")";
parent.mostCurrent._mcode._linkdownload /*String*/  = BA.ObjectToString(_row.Get((Object)("FldLink")));
RDebugUtils.currentLine=5242889;
 //BA.debugLineNum = 5242889;BA.debugLine="Dim NumVer As String=Row.Get(\"FldNumberVersion\")";
_numver = BA.ObjectToString(_row.Get((Object)("FldNumberVersion")));
RDebugUtils.currentLine=5242890;
 //BA.debugLineNum = 5242890;BA.debugLine="If NumVer>MCode.NumberVersion Then";
if (true) break;

case 4:
//if
this.state = 22;
if ((double)(Double.parseDouble(_numver))>(double)(Double.parseDouble(parent.mostCurrent._mcode._numberversion /*String*/ ))) { 
this.state = 6;
}else {
this.state = 21;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=5242891;
 //BA.debugLineNum = 5242891;BA.debugLine="If VerFlag=\"update\" Then";
if (true) break;

case 7:
//if
this.state = 10;
if ((parent.mostCurrent._verflag).equals("update")) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=5242892;
 //BA.debugLineNum = 5242892;BA.debugLine="UpdateApp";
_updateapp();
 if (true) break;
;
RDebugUtils.currentLine=5242895;
 //BA.debugLineNum = 5242895;BA.debugLine="If VerFlag=\"checkupdate\" Then";

case 10:
//if
this.state = 19;
if ((parent.mostCurrent._verflag).equals("checkupdate")) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=5242896;
 //BA.debugLineNum = 5242896;BA.debugLine="Dim sf As Object = Msgbox2Async(\"نسخه جدید موج";
_sf = anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("نسخه جدید موجود است لطفا بروزرسانی کنید"),BA.ObjectToCharSequence("هشدار بروزرسانی"),"بروزرسانی","","بعدا بروزرسانی میکنم",anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"icon.png"),processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=5242897;
 //BA.debugLineNum = 5242897;BA.debugLine="Wait For (sf) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_main", "loadgetversion"), _sf);
this.state = 26;
return;
case 26:
//C
this.state = 13;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=5242898;
 //BA.debugLineNum = 5242898;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 13:
//if
this.state = 18;
if (_result==parent.mostCurrent._xui.DialogResponse_Positive) { 
this.state = 15;
}else {
this.state = 17;
}if (true) break;

case 15:
//C
this.state = 18;
RDebugUtils.currentLine=5242899;
 //BA.debugLineNum = 5242899;BA.debugLine="MCode.CreateBK(\"\")";
parent.mostCurrent._mcode._createbk /*void*/ (mostCurrent.activityBA,"");
RDebugUtils.currentLine=5242900;
 //BA.debugLineNum = 5242900;BA.debugLine="UpdateVersion";
_updateversion();
 if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=5242902;
 //BA.debugLineNum = 5242902;BA.debugLine="ToastMessageShow(\"نسخه جدید موجود است لطفا بر";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("نسخه جدید موجود است لطفا بروزرسانی کنید"),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 18:
//C
this.state = 19;
;
 if (true) break;

case 19:
//C
this.state = 22;
;
 if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=5242908;
 //BA.debugLineNum = 5242908;BA.debugLine="ToastMessageShow(\"شما از آخرین ورژن استفاده می";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("شما از آخرین ورژن استفاده می کنید"),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 22:
//C
this.state = 25;
;
 if (true) break;

case 24:
//C
this.state = 25;
this.catchState = 0;
RDebugUtils.currentLine=5242911;
 //BA.debugLineNum = 5242911;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("55242911",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=5242912;
 //BA.debugLineNum = 5242912;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
parent.mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(parent.mostCurrent._activity.getTitle())+"-LoadGetVersion");
 if (true) break;
if (true) break;

case 25:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=5242914;
 //BA.debugLineNum = 5242914;BA.debugLine="End Sub";
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
public static String  _lbl_mnutext_click() throws Exception{
RDebugUtils.currentModule="act_main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lbl_mnutext_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lbl_mnutext_click", null));}
RDebugUtils.currentLine=3801088;
 //BA.debugLineNum = 3801088;BA.debugLine="Sub lbl_mnuText_Click";
RDebugUtils.currentLine=3801089;
 //BA.debugLineNum = 3801089;BA.debugLine="btn_menu_Click";
_btn_menu_click();
RDebugUtils.currentLine=3801090;
 //BA.debugLineNum = 3801090;BA.debugLine="End Sub";
return "";
}
public static void  _loaddialogbackup(anywheresoftware.b4a.objects.collections.List _list) throws Exception{
RDebugUtils.currentModule="act_main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "loaddialogbackup", false))
	 {Debug.delegate(mostCurrent.activityBA, "loaddialogbackup", new Object[] {_list}); return;}
ResumableSub_LoadDialogBackup rsub = new ResumableSub_LoadDialogBackup(null,_list);
rsub.resume(processBA, null);
}
public static class ResumableSub_LoadDialogBackup extends BA.ResumableSub {
public ResumableSub_LoadDialogBackup(ir.parsikhesab.pakhsh.act_main parent,anywheresoftware.b4a.objects.collections.List _list) {
this.parent = parent;
this._list = _list;
}
ir.parsikhesab.pakhsh.act_main parent;
anywheresoftware.b4a.objects.collections.List _list;
Object _sf = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_main";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=2752513;
 //BA.debugLineNum = 2752513;BA.debugLine="Try";
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
RDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="Dim sf As Object = DialogBackup.ShowAsync(\"\", \"\"";
_sf = parent.mostCurrent._dialogbackup.ShowAsync("","","","",mostCurrent.activityBA,(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2752522;
 //BA.debugLineNum = 2752522;BA.debugLine="Wait For (sf) Dialog_Ready(pnl As Panel)";
anywheresoftware.b4a.keywords.Common.WaitFor("dialog_ready", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_main", "loaddialogbackup"), _sf);
this.state = 7;
return;
case 7:
//C
this.state = 6;
_pnl = (anywheresoftware.b4a.objects.PanelWrapper) result[0];
;
RDebugUtils.currentLine=2752525;
 //BA.debugLineNum = 2752525;BA.debugLine="pnl.Initialize(\"pnl\")";
_pnl.Initialize(mostCurrent.activityBA,"pnl");
RDebugUtils.currentLine=2752526;
 //BA.debugLineNum = 2752526;BA.debugLine="Pnl_Bk.Initialize(\"Pnl_Bk\")";
parent.mostCurrent._pnl_bk.Initialize(mostCurrent.activityBA,"Pnl_Bk");
RDebugUtils.currentLine=2752527;
 //BA.debugLineNum = 2752527;BA.debugLine="pnl.LoadLayout(\"l_ShowListFileBackup\")";
_pnl.LoadLayout("l_ShowListFileBackup",mostCurrent.activityBA);
RDebugUtils.currentLine=2752528;
 //BA.debugLineNum = 2752528;BA.debugLine="pnl.SetLayout(0,0,Pnl_Bk.Width,Pnl_Bk.Height)";
_pnl.SetLayout((int) (0),(int) (0),parent.mostCurrent._pnl_bk.getWidth(),parent.mostCurrent._pnl_bk.getHeight());
RDebugUtils.currentLine=2752529;
 //BA.debugLineNum = 2752529;BA.debugLine="DialogBackup.SetSize(Pnl_Bk.Width + 5%x,Pnl_Bk.H";
parent.mostCurrent._dialogbackup.SetSize((int) (parent.mostCurrent._pnl_bk.getWidth()+anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA)),(int) (parent.mostCurrent._pnl_bk.getHeight()+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),mostCurrent.activityBA)));
 if (true) break;

case 5:
//C
this.state = 6;
this.catchState = 0;
RDebugUtils.currentLine=2752534;
 //BA.debugLineNum = 2752534;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("52752534",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=2752535;
 //BA.debugLineNum = 2752535;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
parent.mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(parent.mostCurrent._activity.getTitle())+"-LoadDialogBackup");
 if (true) break;
if (true) break;

case 6:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=2752537;
 //BA.debugLineNum = 2752537;BA.debugLine="End Sub";
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
public static void  _loaddialoggetdata() throws Exception{
RDebugUtils.currentModule="act_main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "loaddialoggetdata", false))
	 {Debug.delegate(mostCurrent.activityBA, "loaddialoggetdata", null); return;}
ResumableSub_LoadDialogGetData rsub = new ResumableSub_LoadDialogGetData(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_LoadDialogGetData extends BA.ResumableSub {
public ResumableSub_LoadDialogGetData(ir.parsikhesab.pakhsh.act_main parent) {
this.parent = parent;
}
ir.parsikhesab.pakhsh.act_main parent;
Object _sf = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_main";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=2686977;
 //BA.debugLineNum = 2686977;BA.debugLine="Try";
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
RDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="Dim sf As Object = DialogGetData.ShowAsync(\"\", \"";
_sf = parent.mostCurrent._dialoggetdata.ShowAsync("","","","",mostCurrent.activityBA,(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2686986;
 //BA.debugLineNum = 2686986;BA.debugLine="Wait For (sf) Dialog_Ready(pnl As Panel)";
anywheresoftware.b4a.keywords.Common.WaitFor("dialog_ready", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_main", "loaddialoggetdata"), _sf);
this.state = 7;
return;
case 7:
//C
this.state = 6;
_pnl = (anywheresoftware.b4a.objects.PanelWrapper) result[0];
;
RDebugUtils.currentLine=2686989;
 //BA.debugLineNum = 2686989;BA.debugLine="pnl.LoadLayout(\"L_YesNo\")";
_pnl.LoadLayout("L_YesNo",mostCurrent.activityBA);
RDebugUtils.currentLine=2686990;
 //BA.debugLineNum = 2686990;BA.debugLine="pnl.SetLayout(0,0,Pnl_Bk.Width,Pnl_Bk.Height)";
_pnl.SetLayout((int) (0),(int) (0),parent.mostCurrent._pnl_bk.getWidth(),parent.mostCurrent._pnl_bk.getHeight());
RDebugUtils.currentLine=2686991;
 //BA.debugLineNum = 2686991;BA.debugLine="DialogGetData.SetSize(Pnl_Bk.Width + 5%x,Pnl_Bk.";
parent.mostCurrent._dialoggetdata.SetSize((int) (parent.mostCurrent._pnl_bk.getWidth()+anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA)),(int) (parent.mostCurrent._pnl_bk.getHeight()+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),mostCurrent.activityBA)));
 if (true) break;

case 5:
//C
this.state = 6;
this.catchState = 0;
RDebugUtils.currentLine=2686993;
 //BA.debugLineNum = 2686993;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("52686993",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=2686994;
 //BA.debugLineNum = 2686994;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
parent.mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(parent.mostCurrent._activity.getTitle())+"-LoadDialogGetData");
 if (true) break;
if (true) break;

case 6:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=2686996;
 //BA.debugLineNum = 2686996;BA.debugLine="End Sub";
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
public static String  _updateapp() throws Exception{
RDebugUtils.currentModule="act_main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "updateapp", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "updateapp", null));}
RDebugUtils.currentLine=4653056;
 //BA.debugLineNum = 4653056;BA.debugLine="Sub UpdateApp";
RDebugUtils.currentLine=4653057;
 //BA.debugLineNum = 4653057;BA.debugLine="Try";
try {RDebugUtils.currentLine=4653058;
 //BA.debugLineNum = 4653058;BA.debugLine="apkupdt.PackageName = \"ir.parsikhesab.pakhsh\"";
mostCurrent._apkupdt._setpackagename /*String*/ (null,"ir.parsikhesab.pakhsh");
RDebugUtils.currentLine=4653059;
 //BA.debugLineNum = 4653059;BA.debugLine="apkupdt.NewVerApk = MCode.LinkDownload";
mostCurrent._apkupdt._setnewverapk(null,mostCurrent._mcode._linkdownload /*String*/ );
RDebugUtils.currentLine=4653060;
 //BA.debugLineNum = 4653060;BA.debugLine="apkupdt.setCredentials(\"test\",\"test\")";
mostCurrent._apkupdt._setcredentials /*String*/ (null,"test","test");
RDebugUtils.currentLine=4653061;
 //BA.debugLineNum = 4653061;BA.debugLine="ButtonUpdate_Click";
_buttonupdate_click();
 } 
       catch (Exception e7) {
			processBA.setLastException(e7);RDebugUtils.currentLine=4653063;
 //BA.debugLineNum = 4653063;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("54653063",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=4653064;
 //BA.debugLineNum = 4653064;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-UpdateApp");
 };
RDebugUtils.currentLine=4653069;
 //BA.debugLineNum = 4653069;BA.debugLine="End Sub";
return "";
}
public static String  _updateversion() throws Exception{
RDebugUtils.currentModule="act_main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "updateversion", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "updateversion", null));}
RDebugUtils.currentLine=4587520;
 //BA.debugLineNum = 4587520;BA.debugLine="Sub UpdateVersion";
RDebugUtils.currentLine=4587521;
 //BA.debugLineNum = 4587521;BA.debugLine="Try";
try {RDebugUtils.currentLine=4587522;
 //BA.debugLineNum = 4587522;BA.debugLine="GetVersion";
_getversion();
RDebugUtils.currentLine=4587523;
 //BA.debugLineNum = 4587523;BA.debugLine="VerFlag=\"update\"";
mostCurrent._verflag = "update";
RDebugUtils.currentLine=4587524;
 //BA.debugLineNum = 4587524;BA.debugLine="ToastMessageShow(\"در حال بررسی ورژن نرم افزار .";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("در حال بررسی ورژن نرم افزار . . ."),anywheresoftware.b4a.keywords.Common.True);
 } 
       catch (Exception e6) {
			processBA.setLastException(e6);RDebugUtils.currentLine=4587526;
 //BA.debugLineNum = 4587526;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("54587526",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=4587527;
 //BA.debugLineNum = 4587527;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-UpdateVersion");
 };
RDebugUtils.currentLine=4587529;
 //BA.debugLineNum = 4587529;BA.debugLine="End Sub";
return "";
}
public static void  _permissionactive4() throws Exception{
RDebugUtils.currentModule="act_main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "permissionactive4", false))
	 {Debug.delegate(mostCurrent.activityBA, "permissionactive4", null); return;}
ResumableSub_PermissionActive4 rsub = new ResumableSub_PermissionActive4(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_PermissionActive4 extends BA.ResumableSub {
public ResumableSub_PermissionActive4(ir.parsikhesab.pakhsh.act_main parent) {
this.parent = parent;
}
ir.parsikhesab.pakhsh.act_main parent;
String _permission = "";
boolean _result = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_main";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=1900545;
 //BA.debugLineNum = 1900545;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_CALL_PHONE)";
parent.mostCurrent._rp.CheckAndRequest(processBA,parent.mostCurrent._rp.PERMISSION_CALL_PHONE);
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="Wait For Activity_PermissonResult (Permission As";
anywheresoftware.b4a.keywords.Common.WaitFor("activity_permissonresult", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_main", "permissionactive4"), null);
this.state = 1;
return;
case 1:
//C
this.state = -1;
_permission = (String) result[0];
_result = (Boolean) result[1];
;
RDebugUtils.currentLine=1900547;
 //BA.debugLineNum = 1900547;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _mapfragment1_ready() throws Exception{
RDebugUtils.currentModule="act_main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "mapfragment1_ready", false))
	 {Debug.delegate(mostCurrent.activityBA, "mapfragment1_ready", null); return;}
ResumableSub_MapFragment1_Ready rsub = new ResumableSub_MapFragment1_Ready(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_MapFragment1_Ready extends BA.ResumableSub {
public ResumableSub_MapFragment1_Ready(ir.parsikhesab.pakhsh.act_main parent) {
this.parent = parent;
}
ir.parsikhesab.pakhsh.act_main parent;
String _permission = "";
boolean _result = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_main";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="Sleep(100)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_main", "mapfragment1_ready"),(int) (100));
this.state = 23;
return;
case 23:
//C
this.state = 1;
;
RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 22;
this.catchState = 21;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 21;
RDebugUtils.currentLine=2424836;
 //BA.debugLineNum = 2424836;BA.debugLine="If MCode.Gps=\"1\" Then";
if (true) break;

case 4:
//if
this.state = 19;
if ((parent.mostCurrent._mcode._gps /*String*/ ).equals("1")) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=2424837;
 //BA.debugLineNum = 2424837;BA.debugLine="If gps.GPSEnabled=True Then";
if (true) break;

case 7:
//if
this.state = 18;
if (parent._gps.getGPSEnabled()==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 9;
}else {
this.state = 17;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=2424838;
 //BA.debugLineNum = 2424838;BA.debugLine="gmap = MapFragment1.GetMap";
parent.mostCurrent._gmap = parent.mostCurrent._mapfragment1.GetMap();
RDebugUtils.currentLine=2424839;
 //BA.debugLineNum = 2424839;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_ACCESS_FINE_L";
parent.mostCurrent._rp.CheckAndRequest(processBA,parent.mostCurrent._rp.PERMISSION_ACCESS_FINE_LOCATION);
RDebugUtils.currentLine=2424840;
 //BA.debugLineNum = 2424840;BA.debugLine="Wait For Activity_PermissionResult (Permission";
anywheresoftware.b4a.keywords.Common.WaitFor("activity_permissionresult", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_main", "mapfragment1_ready"), null);
this.state = 24;
return;
case 24:
//C
this.state = 10;
_permission = (String) result[0];
_result = (Boolean) result[1];
;
RDebugUtils.currentLine=2424841;
 //BA.debugLineNum = 2424841;BA.debugLine="If Result Then";
if (true) break;

case 10:
//if
this.state = 15;
if (_result) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 15;
RDebugUtils.currentLine=2424842;
 //BA.debugLineNum = 2424842;BA.debugLine="gmap.MyLocationEnabled = True";
parent.mostCurrent._gmap.setMyLocationEnabled(anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=2424846;
 //BA.debugLineNum = 2424846;BA.debugLine="Log(\"No permission!\")";
anywheresoftware.b4a.keywords.Common.LogImpl("52424846","No permission!",0);
 if (true) break;

case 15:
//C
this.state = 18;
;
 if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=2424849;
 //BA.debugLineNum = 2424849;BA.debugLine="gmap.MyLocationEnabled=False";
parent.mostCurrent._gmap.setMyLocationEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2424850;
 //BA.debugLineNum = 2424850;BA.debugLine="ToastMessageShow(\"لطفا GPS گوشی خود را فعال کن";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("لطفا GPS گوشی خود را فعال کنید"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2424851;
 //BA.debugLineNum = 2424851;BA.debugLine="StartActivity(gps.LocationSettingsIntent)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent._gps.getLocationSettingsIntent()));
 if (true) break;

case 18:
//C
this.state = 19;
;
 if (true) break;

case 19:
//C
this.state = 22;
;
 if (true) break;

case 21:
//C
this.state = 22;
this.catchState = 0;
RDebugUtils.currentLine=2424855;
 //BA.debugLineNum = 2424855;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("52424855",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=2424856;
 //BA.debugLineNum = 2424856;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
parent.mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(parent.mostCurrent._activity.getTitle())+"-MapFragment1_Ready");
 if (true) break;
if (true) break;

case 22:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=2424859;
 //BA.debugLineNum = 2424859;BA.debugLine="End Sub";
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
public static String  _openbackuppnl() throws Exception{
RDebugUtils.currentModule="act_main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "openbackuppnl", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "openbackuppnl", null));}
RDebugUtils.currentLine=4325376;
 //BA.debugLineNum = 4325376;BA.debugLine="Sub OpenBackUpPnl";
RDebugUtils.currentLine=4325377;
 //BA.debugLineNum = 4325377;BA.debugLine="pnlbak.Visible=True";
mostCurrent._pnlbak.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=4325379;
 //BA.debugLineNum = 4325379;BA.debugLine="MCode.AnimationOpen(pnlbak)";
mostCurrent._mcode._animationopen /*String*/ (mostCurrent.activityBA,(Object)(mostCurrent._pnlbak.getObject()));
RDebugUtils.currentLine=4325380;
 //BA.debugLineNum = 4325380;BA.debugLine="End Sub";
return "";
}
public static String  _pnl_havale_click() throws Exception{
RDebugUtils.currentModule="act_main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "pnl_havale_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "pnl_havale_click", null));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
RDebugUtils.currentLine=5898240;
 //BA.debugLineNum = 5898240;BA.debugLine="Private Sub pnl_Havale_Click";
RDebugUtils.currentLine=5898242;
 //BA.debugLineNum = 5898242;BA.debugLine="If MCode.Vaziat=0 Then";
if (mostCurrent._mcode._vaziat /*int*/ ==0) { 
RDebugUtils.currentLine=5898243;
 //BA.debugLineNum = 5898243;BA.debugLine="ToastMessageShow(\"نرم افزار شما غیر فعال میباشد\"";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("نرم افزار شما غیر فعال میباشد"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=5898244;
 //BA.debugLineNum = 5898244;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=5898246;
 //BA.debugLineNum = 5898246;BA.debugLine="Dim cu As Cursor=MCode.Result(\"Select * from TblH";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * from TblHavale");
RDebugUtils.currentLine=5898247;
 //BA.debugLineNum = 5898247;BA.debugLine="If cu.RowCount=0 Then";
if (_cu.getRowCount()==0) { 
RDebugUtils.currentLine=5898248;
 //BA.debugLineNum = 5898248;BA.debugLine="ToastMessageShow(\"حواله موجود نمی باشد\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("حواله موجود نمی باشد"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=5898249;
 //BA.debugLineNum = 5898249;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=5898251;
 //BA.debugLineNum = 5898251;BA.debugLine="StartActivity(Act_HavaleTozie)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._act_havaletozie.getObject()));
RDebugUtils.currentLine=5898252;
 //BA.debugLineNum = 5898252;BA.debugLine="End Sub";
return "";
}
public static String  _pnl_map_click() throws Exception{
RDebugUtils.currentModule="act_main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "pnl_map_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "pnl_map_click", null));}
RDebugUtils.currentLine=5439488;
 //BA.debugLineNum = 5439488;BA.debugLine="Sub pnl_map_Click";
RDebugUtils.currentLine=5439489;
 //BA.debugLineNum = 5439489;BA.debugLine="If MCode.Vaziat=0 Then";
if (mostCurrent._mcode._vaziat /*int*/ ==0) { 
RDebugUtils.currentLine=5439490;
 //BA.debugLineNum = 5439490;BA.debugLine="ToastMessageShow(\"نرم افزار شما غیر فعال میباشد\"";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("نرم افزار شما غیر فعال میباشد"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=5439491;
 //BA.debugLineNum = 5439491;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=5439493;
 //BA.debugLineNum = 5439493;BA.debugLine="StartActivity(Act_LocationVisitor)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._act_locationvisitor.getObject()));
RDebugUtils.currentLine=5439494;
 //BA.debugLineNum = 5439494;BA.debugLine="End Sub";
return "";
}
public static String  _pnl_smartphone_click() throws Exception{
RDebugUtils.currentModule="act_main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "pnl_smartphone_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "pnl_smartphone_click", null));}
RDebugUtils.currentLine=5373952;
 //BA.debugLineNum = 5373952;BA.debugLine="Sub pnl_smartphone_Click";
RDebugUtils.currentLine=5373954;
 //BA.debugLineNum = 5373954;BA.debugLine="End Sub";
return "";
}
public static String  _pnlgetdata_click() throws Exception{
RDebugUtils.currentModule="act_main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "pnlgetdata_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "pnlgetdata_click", null));}
RDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Sub pnlGetData_Click";
RDebugUtils.currentLine=2949121;
 //BA.debugLineNum = 2949121;BA.debugLine="Try";
try {RDebugUtils.currentLine=2949122;
 //BA.debugLineNum = 2949122;BA.debugLine="If MCode.Vaziat=0 Then";
if (mostCurrent._mcode._vaziat /*int*/ ==0) { 
RDebugUtils.currentLine=2949123;
 //BA.debugLineNum = 2949123;BA.debugLine="ToastMessageShow(\"نرم افزار شما غیر فعال میباشد";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("نرم افزار شما غیر فعال میباشد"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2949124;
 //BA.debugLineNum = 2949124;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=2949126;
 //BA.debugLineNum = 2949126;BA.debugLine="If MCode.IsConnected=False And MCode.ConnectionS";
if (mostCurrent._mcode._isconnected /*boolean*/ (mostCurrent.activityBA)==anywheresoftware.b4a.keywords.Common.False && (mostCurrent._mcode._connectionstatus /*String*/ ).equals(BA.NumberToString(1))) { 
RDebugUtils.currentLine=2949127;
 //BA.debugLineNum = 2949127;BA.debugLine="ToastMessageShow(\"لطفا ارتباط اینترنت گوشی خود";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("لطفا ارتباط اینترنت گوشی خود را بررسی نمایید"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2949128;
 //BA.debugLineNum = 2949128;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=2949145;
 //BA.debugLineNum = 2949145;BA.debugLine="LoadDialogGetData";
_loaddialoggetdata();
 } 
       catch (Exception e12) {
			processBA.setLastException(e12);RDebugUtils.currentLine=2949150;
 //BA.debugLineNum = 2949150;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("52949150",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=2949151;
 //BA.debugLineNum = 2949151;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-pnlGetData_Click");
 };
RDebugUtils.currentLine=2949153;
 //BA.debugLineNum = 2949153;BA.debugLine="End Sub";
return "";
}
public static String  _pnlgoinsta_click() throws Exception{
RDebugUtils.currentModule="act_main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "pnlgoinsta_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "pnlgoinsta_click", null));}
RDebugUtils.currentLine=6160384;
 //BA.debugLineNum = 6160384;BA.debugLine="Private Sub pnlGoInsta_Click";
RDebugUtils.currentLine=6160385;
 //BA.debugLineNum = 6160385;BA.debugLine="MCode.OpenLinkInWebBrwoser(\"https://zaya.io/v10gw";
mostCurrent._mcode._openlinkinwebbrwoser /*String*/ (mostCurrent.activityBA,"https://zaya.io/v10gw");
RDebugUtils.currentLine=6160386;
 //BA.debugLineNum = 6160386;BA.debugLine="End Sub";
return "";
}
public static String  _pnlgosite_click() throws Exception{
RDebugUtils.currentModule="act_main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "pnlgosite_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "pnlgosite_click", null));}
RDebugUtils.currentLine=6094848;
 //BA.debugLineNum = 6094848;BA.debugLine="Private Sub pnlGoSite_Click";
RDebugUtils.currentLine=6094849;
 //BA.debugLineNum = 6094849;BA.debugLine="MCode.OpenLinkInWebBrwoser(\"https://zaya.io/fbkzq";
mostCurrent._mcode._openlinkinwebbrwoser /*String*/ (mostCurrent.activityBA,"https://zaya.io/fbkzq");
RDebugUtils.currentLine=6094850;
 //BA.debugLineNum = 6094850;BA.debugLine="End Sub";
return "";
}
public static String  _pnlmoshtarian_click() throws Exception{
RDebugUtils.currentModule="act_main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "pnlmoshtarian_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "pnlmoshtarian_click", null));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
RDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Sub PnlMoshtarian_Click";
RDebugUtils.currentLine=3145729;
 //BA.debugLineNum = 3145729;BA.debugLine="If MCode.Vaziat=0 Then";
if (mostCurrent._mcode._vaziat /*int*/ ==0) { 
RDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="ToastMessageShow(\"نرم افزار شما غیر فعال میباشد\"";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("نرم افزار شما غیر فعال میباشد"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3145731;
 //BA.debugLineNum = 3145731;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=3145733;
 //BA.debugLineNum = 3145733;BA.debugLine="If MCode.C_Visitor=\"کد ویزیتور\"  Then";
if ((mostCurrent._mcode._c_visitor /*String*/ ).equals("کد ویزیتور")) { 
RDebugUtils.currentLine=3145734;
 //BA.debugLineNum = 3145734;BA.debugLine="ToastMessageShow(\"ابتدا دریافت اطلاعات را انجام";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("ابتدا دریافت اطلاعات را انجام دهید"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3145735;
 //BA.debugLineNum = 3145735;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=3145737;
 //BA.debugLineNum = 3145737;BA.debugLine="If MCode.C_Visitor.Length<5 Then";
if (mostCurrent._mcode._c_visitor /*String*/ .length()<5) { 
RDebugUtils.currentLine=3145738;
 //BA.debugLineNum = 3145738;BA.debugLine="ToastMessageShow(\"کد ویزیتور شما صحیح نیست\",True";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("کد ویزیتور شما صحیح نیست"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3145739;
 //BA.debugLineNum = 3145739;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=3145741;
 //BA.debugLineNum = 3145741;BA.debugLine="MCode.page = \"Act_Moshtarian\"";
mostCurrent._mcode._page /*String*/  = "Act_Moshtarian";
RDebugUtils.currentLine=3145742;
 //BA.debugLineNum = 3145742;BA.debugLine="Try";
try {RDebugUtils.currentLine=3145743;
 //BA.debugLineNum = 3145743;BA.debugLine="Dim Cu As Cursor";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=3145744;
 //BA.debugLineNum = 3145744;BA.debugLine="Cu=MCode.Result(\"Select * From TblSetting\")";
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblSetting");
RDebugUtils.currentLine=3145745;
 //BA.debugLineNum = 3145745;BA.debugLine="Cu.Position=0";
_cu.setPosition((int) (0));
RDebugUtils.currentLine=3145746;
 //BA.debugLineNum = 3145746;BA.debugLine="Log(Cu.GetString(\"FldC_Visitor\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("53145746",_cu.GetString("FldC_Visitor"),0);
RDebugUtils.currentLine=3145747;
 //BA.debugLineNum = 3145747;BA.debugLine="If Cu.GetString(\"FldC_Visitor\") = \"کد ویزیتور\" T";
if ((_cu.GetString("FldC_Visitor")).equals("کد ویزیتور")) { 
RDebugUtils.currentLine=3145748;
 //BA.debugLineNum = 3145748;BA.debugLine="ToastMessageShow(\"ابتدا دریافت اطلاعات بزنید بع";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("ابتدا دریافت اطلاعات بزنید بعد به این بخش مراجعه نمائید"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3145749;
 //BA.debugLineNum = 3145749;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=3145751;
 //BA.debugLineNum = 3145751;BA.debugLine="StartActivity(Act_SelectMantage)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._act_selectmantage.getObject()));
 } 
       catch (Exception e25) {
			processBA.setLastException(e25);RDebugUtils.currentLine=3145753;
 //BA.debugLineNum = 3145753;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("53145753",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=3145754;
 //BA.debugLineNum = 3145754;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-PnlMoshtarian_Click");
 };
RDebugUtils.currentLine=3145756;
 //BA.debugLineNum = 3145756;BA.debugLine="End Sub";
return "";
}
public static String  _pnlnewmoshtari_click() throws Exception{
RDebugUtils.currentModule="act_main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "pnlnewmoshtari_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "pnlnewmoshtari_click", null));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
RDebugUtils.currentLine=3211264;
 //BA.debugLineNum = 3211264;BA.debugLine="Sub pnlNewMoshtari_Click";
RDebugUtils.currentLine=3211266;
 //BA.debugLineNum = 3211266;BA.debugLine="Try";
try {RDebugUtils.currentLine=3211267;
 //BA.debugLineNum = 3211267;BA.debugLine="If MCode.Vaziat=0 Then";
if (mostCurrent._mcode._vaziat /*int*/ ==0) { 
RDebugUtils.currentLine=3211268;
 //BA.debugLineNum = 3211268;BA.debugLine="ToastMessageShow(\"نرم افزار شما غیر فعال میباشد";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("نرم افزار شما غیر فعال میباشد"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3211269;
 //BA.debugLineNum = 3211269;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=3211271;
 //BA.debugLineNum = 3211271;BA.debugLine="Dim Cu As Cursor";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=3211272;
 //BA.debugLineNum = 3211272;BA.debugLine="Cu=MCode.Result(\"Select * From TblSetting\")";
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblSetting");
RDebugUtils.currentLine=3211273;
 //BA.debugLineNum = 3211273;BA.debugLine="Cu.Position=0";
_cu.setPosition((int) (0));
RDebugUtils.currentLine=3211274;
 //BA.debugLineNum = 3211274;BA.debugLine="Log(Cu.GetString(\"FldC_Visitor\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("53211274",_cu.GetString("FldC_Visitor"),0);
RDebugUtils.currentLine=3211275;
 //BA.debugLineNum = 3211275;BA.debugLine="If Cu.GetString(\"FldC_Visitor\") = \"کد ویزیتور\" T";
if ((_cu.GetString("FldC_Visitor")).equals("کد ویزیتور")) { 
RDebugUtils.currentLine=3211276;
 //BA.debugLineNum = 3211276;BA.debugLine="ToastMessageShow(\"ابتدا دریافت اطلاعات بزنید بع";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("ابتدا دریافت اطلاعات بزنید بعد به این بخش مراجعه نمائید"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3211277;
 //BA.debugLineNum = 3211277;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=3211279;
 //BA.debugLineNum = 3211279;BA.debugLine="If MCode.C_Visitor.Length<5 Then";
if (mostCurrent._mcode._c_visitor /*String*/ .length()<5) { 
RDebugUtils.currentLine=3211280;
 //BA.debugLineNum = 3211280;BA.debugLine="ToastMessageShow(\"کد ویزیتور شما صحیح نیست\",Tru";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("کد ویزیتور شما صحیح نیست"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3211281;
 //BA.debugLineNum = 3211281;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=3211283;
 //BA.debugLineNum = 3211283;BA.debugLine="MCode.UpdateShakhs=False";
mostCurrent._mcode._updateshakhs /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=3211284;
 //BA.debugLineNum = 3211284;BA.debugLine="StartActivity(Act_NewAshkhas)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._act_newashkhas.getObject()));
 } 
       catch (Exception e21) {
			processBA.setLastException(e21);RDebugUtils.currentLine=3211289;
 //BA.debugLineNum = 3211289;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("53211289",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=3211290;
 //BA.debugLineNum = 3211290;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-pnlNewMoshtari_Click");
 };
RDebugUtils.currentLine=3211292;
 //BA.debugLineNum = 3211292;BA.debugLine="End Sub";
return "";
}
public static String  _pnlreport_click() throws Exception{
RDebugUtils.currentModule="act_main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "pnlreport_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "pnlreport_click", null));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
RDebugUtils.currentLine=4521984;
 //BA.debugLineNum = 4521984;BA.debugLine="Sub PnlReport_Click";
RDebugUtils.currentLine=4521986;
 //BA.debugLineNum = 4521986;BA.debugLine="If MCode.Vaziat=0 Then";
if (mostCurrent._mcode._vaziat /*int*/ ==0) { 
RDebugUtils.currentLine=4521987;
 //BA.debugLineNum = 4521987;BA.debugLine="ToastMessageShow(\"نرم افزار شما غیر فعال میباشد\"";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("نرم افزار شما غیر فعال میباشد"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=4521988;
 //BA.debugLineNum = 4521988;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=4521990;
 //BA.debugLineNum = 4521990;BA.debugLine="Dim Cu As Cursor";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=4521991;
 //BA.debugLineNum = 4521991;BA.debugLine="Cu=MCode.Result(\"Select * From TblSetting\")";
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblSetting");
RDebugUtils.currentLine=4521992;
 //BA.debugLineNum = 4521992;BA.debugLine="Cu.Position=0";
_cu.setPosition((int) (0));
RDebugUtils.currentLine=4521993;
 //BA.debugLineNum = 4521993;BA.debugLine="Log(Cu.GetString(\"FldC_Visitor\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("54521993",_cu.GetString("FldC_Visitor"),0);
RDebugUtils.currentLine=4521994;
 //BA.debugLineNum = 4521994;BA.debugLine="If Cu.GetString(\"FldC_Visitor\") = \"کد ویزیتور\" Th";
if ((_cu.GetString("FldC_Visitor")).equals("کد ویزیتور")) { 
RDebugUtils.currentLine=4521995;
 //BA.debugLineNum = 4521995;BA.debugLine="ToastMessageShow(\"ابتدا دریافت اطلاعات بزنید بعد";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("ابتدا دریافت اطلاعات بزنید بعد به این بخش مراجعه نمائید"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=4521996;
 //BA.debugLineNum = 4521996;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=4521998;
 //BA.debugLineNum = 4521998;BA.debugLine="StartActivity(Act_Choose_Report)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._act_choose_report.getObject()));
RDebugUtils.currentLine=4522010;
 //BA.debugLineNum = 4522010;BA.debugLine="End Sub";
return "";
}
public static String  _pnlsabtesefaresh_click() throws Exception{
RDebugUtils.currentModule="act_main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "pnlsabtesefaresh_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "pnlsabtesefaresh_click", null));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
RDebugUtils.currentLine=3080192;
 //BA.debugLineNum = 3080192;BA.debugLine="Sub pnlSabteSefaresh_Click";
RDebugUtils.currentLine=3080193;
 //BA.debugLineNum = 3080193;BA.debugLine="Try";
try {RDebugUtils.currentLine=3080194;
 //BA.debugLineNum = 3080194;BA.debugLine="If MCode.Vaziat=0 Then";
if (mostCurrent._mcode._vaziat /*int*/ ==0) { 
RDebugUtils.currentLine=3080195;
 //BA.debugLineNum = 3080195;BA.debugLine="ToastMessageShow(\"نرم افزار شما غیر فعال میباشد";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("نرم افزار شما غیر فعال میباشد"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3080196;
 //BA.debugLineNum = 3080196;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=3080198;
 //BA.debugLineNum = 3080198;BA.debugLine="If	MCode.Visitor=\"0\" Then";
if ((mostCurrent._mcode._visitor /*String*/ ).equals("0")) { 
RDebugUtils.currentLine=3080199;
 //BA.debugLineNum = 3080199;BA.debugLine="ToastMessageShow(\"این بخش مربوط به نسخه ویزیتور";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("این بخش مربوط به نسخه ویزیتور می باشد ، در صورت نیاز به فعالسازی و استفاده از این بخش با واحد مشاوره و فروش مربوطه تماس حاصل فرمایید"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3080200;
 //BA.debugLineNum = 3080200;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=3080202;
 //BA.debugLineNum = 3080202;BA.debugLine="Dim Cu As Cursor";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=3080203;
 //BA.debugLineNum = 3080203;BA.debugLine="Cu=MCode.Result(\"Select * From TblSetting\")";
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblSetting");
RDebugUtils.currentLine=3080204;
 //BA.debugLineNum = 3080204;BA.debugLine="Cu.Position=0";
_cu.setPosition((int) (0));
RDebugUtils.currentLine=3080205;
 //BA.debugLineNum = 3080205;BA.debugLine="Log(Cu.GetString(\"FldC_Visitor\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("53080205",_cu.GetString("FldC_Visitor"),0);
RDebugUtils.currentLine=3080206;
 //BA.debugLineNum = 3080206;BA.debugLine="If Cu.GetString(\"FldC_Visitor\") = \"کد ویزیتور\" T";
if ((_cu.GetString("FldC_Visitor")).equals("کد ویزیتور")) { 
RDebugUtils.currentLine=3080207;
 //BA.debugLineNum = 3080207;BA.debugLine="ToastMessageShow(\"ابتدا دریافت اطلاعات بزنید بع";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("ابتدا دریافت اطلاعات بزنید بعد به این بخش مراجعه نمائید"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3080208;
 //BA.debugLineNum = 3080208;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=3080210;
 //BA.debugLineNum = 3080210;BA.debugLine="If MCode.C_Visitor=\"کد ویزیتور\"  Then";
if ((mostCurrent._mcode._c_visitor /*String*/ ).equals("کد ویزیتور")) { 
RDebugUtils.currentLine=3080211;
 //BA.debugLineNum = 3080211;BA.debugLine="ToastMessageShow(\"ابتدا دریافت اطلاعات را انجام";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("ابتدا دریافت اطلاعات را انجام دهید"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3080212;
 //BA.debugLineNum = 3080212;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=3080214;
 //BA.debugLineNum = 3080214;BA.debugLine="If MCode.C_Visitor.Length<5 Then";
if (mostCurrent._mcode._c_visitor /*String*/ .length()<5) { 
RDebugUtils.currentLine=3080215;
 //BA.debugLineNum = 3080215;BA.debugLine="ToastMessageShow(\"کد ویزیتور شما صحیح نیست\",Tru";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("کد ویزیتور شما صحیح نیست"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3080216;
 //BA.debugLineNum = 3080216;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=3080223;
 //BA.debugLineNum = 3080223;BA.debugLine="Cu=MCode.Result(\"Select * From TblKala\")";
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblKala");
RDebugUtils.currentLine=3080224;
 //BA.debugLineNum = 3080224;BA.debugLine="If Cu.RowCount=0 Then";
if (_cu.getRowCount()==0) { 
RDebugUtils.currentLine=3080225;
 //BA.debugLineNum = 3080225;BA.debugLine="ToastMessageShow(\"لیست کالا به درستی دریافت نشد";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("لیست کالا به درستی دریافت نشده است"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3080226;
 //BA.debugLineNum = 3080226;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=3080228;
 //BA.debugLineNum = 3080228;BA.debugLine="Cu=MCode.Result(\"Select * From TblGoroohKala\")";
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblGoroohKala");
RDebugUtils.currentLine=3080229;
 //BA.debugLineNum = 3080229;BA.debugLine="If Cu.RowCount=0 Then";
if (_cu.getRowCount()==0) { 
RDebugUtils.currentLine=3080230;
 //BA.debugLineNum = 3080230;BA.debugLine="ToastMessageShow(\"جدول گروه کالا به درستی دریاف";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("جدول گروه کالا به درستی دریافت نشده است"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3080231;
 //BA.debugLineNum = 3080231;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=3080233;
 //BA.debugLineNum = 3080233;BA.debugLine="Cu=MCode.Result(\"Select * From TblTasvie\")";
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblTasvie");
RDebugUtils.currentLine=3080234;
 //BA.debugLineNum = 3080234;BA.debugLine="If Cu.RowCount=0 Then";
if (_cu.getRowCount()==0) { 
RDebugUtils.currentLine=3080235;
 //BA.debugLineNum = 3080235;BA.debugLine="ToastMessageShow(\"جدول تسویه حساب به درستی دریا";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("جدول تسویه حساب به درستی دریافت نشده است"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3080236;
 //BA.debugLineNum = 3080236;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=3080239;
 //BA.debugLineNum = 3080239;BA.debugLine="MCode.Action=\"SabtFaktor\"";
mostCurrent._mcode._action /*String*/  = "SabtFaktor";
RDebugUtils.currentLine=3080240;
 //BA.debugLineNum = 3080240;BA.debugLine="StartActivity(Act_KalaDefault)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._act_kaladefault.getObject()));
 } 
       catch (Exception e44) {
			processBA.setLastException(e44);RDebugUtils.currentLine=3080242;
 //BA.debugLineNum = 3080242;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("53080242",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=3080243;
 //BA.debugLineNum = 3080243;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-pnlSabteSefaresh_Click");
 };
RDebugUtils.currentLine=3080245;
 //BA.debugLineNum = 3080245;BA.debugLine="End Sub";
return "";
}
public static String  _pnlsenddata_click() throws Exception{
RDebugUtils.currentModule="act_main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "pnlsenddata_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "pnlsenddata_click", null));}
RDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="Sub pnlSendData_Click";
RDebugUtils.currentLine=3014657;
 //BA.debugLineNum = 3014657;BA.debugLine="If MCode.Vaziat=0 Then";
if (mostCurrent._mcode._vaziat /*int*/ ==0) { 
RDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="ToastMessageShow(\"نرم افزار شما غیر فعال میباشد\"";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("نرم افزار شما غیر فعال میباشد"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3014659;
 //BA.debugLineNum = 3014659;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=3014661;
 //BA.debugLineNum = 3014661;BA.debugLine="StartActivity(Act_SendData)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._act_senddata.getObject()));
RDebugUtils.currentLine=3014662;
 //BA.debugLineNum = 3014662;BA.debugLine="End Sub";
return "";
}
public static String  _pnltabligh_click() throws Exception{
RDebugUtils.currentModule="act_main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "pnltabligh_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "pnltabligh_click", null));}
RDebugUtils.currentLine=5832704;
 //BA.debugLineNum = 5832704;BA.debugLine="Sub pnlTabligh_Click";
RDebugUtils.currentLine=5832705;
 //BA.debugLineNum = 5832705;BA.debugLine="lbl_etelaeResani.TextColor=Colors.RGB(Rnd(0,255),";
mostCurrent._lbl_etelaeresani._settextcolor /*int*/ (null,anywheresoftware.b4a.keywords.Common.Colors.RGB(anywheresoftware.b4a.keywords.Common.Rnd((int) (0),(int) (255)),anywheresoftware.b4a.keywords.Common.Rnd((int) (0),(int) (255)),anywheresoftware.b4a.keywords.Common.Rnd((int) (0),(int) (255))));
RDebugUtils.currentLine=5832706;
 //BA.debugLineNum = 5832706;BA.debugLine="End Sub";
return "";
}
public static String  _setvaziat() throws Exception{
RDebugUtils.currentModule="act_main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "setvaziat", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "setvaziat", null));}
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Sub SetVaziat";
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="Try";
try {RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="If MCode.Vaziat=0 Then";
if (mostCurrent._mcode._vaziat /*int*/ ==0) { 
RDebugUtils.currentLine=2097155;
 //BA.debugLineNum = 2097155;BA.debugLine="btn_Lock.Text= Chr(0xE897)";
mostCurrent._btn_lock.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr(((int)0xe897))));
RDebugUtils.currentLine=2097156;
 //BA.debugLineNum = 2097156;BA.debugLine="btn_Lock.TextColor=Colors.Black";
mostCurrent._btn_lock.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 }else {
RDebugUtils.currentLine=2097158;
 //BA.debugLineNum = 2097158;BA.debugLine="StartService(Service_Notification)";
anywheresoftware.b4a.keywords.Common.StartService(processBA,(Object)(mostCurrent._service_notification.getObject()));
RDebugUtils.currentLine=2097159;
 //BA.debugLineNum = 2097159;BA.debugLine="btn_Lock.Text=Chr(0xE0DA)";
mostCurrent._btn_lock.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr(((int)0xe0da))));
RDebugUtils.currentLine=2097160;
 //BA.debugLineNum = 2097160;BA.debugLine="btn_Lock.TextColor=Colors.Green";
mostCurrent._btn_lock.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Green);
 };
 } 
       catch (Exception e11) {
			processBA.setLastException(e11);RDebugUtils.currentLine=2097163;
 //BA.debugLineNum = 2097163;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("52097163",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=2097164;
 //BA.debugLineNum = 2097164;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-SetVaziat");
 };
RDebugUtils.currentLine=2097166;
 //BA.debugLineNum = 2097166;BA.debugLine="End Sub";
return "";
}
public static String  _statusbutton(boolean _ena) throws Exception{
RDebugUtils.currentModule="act_main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "statusbutton", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "statusbutton", new Object[] {_ena}));}
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Sub StatusButton(Ena As Boolean)";
RDebugUtils.currentLine=2162689;
 //BA.debugLineNum = 2162689;BA.debugLine="pnlSabteSefaresh.Enabled=Ena";
mostCurrent._pnlsabtesefaresh.setEnabled(_ena);
RDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="pnlNewMoshtari.Enabled=Ena";
mostCurrent._pnlnewmoshtari.setEnabled(_ena);
RDebugUtils.currentLine=2162691;
 //BA.debugLineNum = 2162691;BA.debugLine="pnlSendData.Enabled=Ena";
mostCurrent._pnlsenddata.setEnabled(_ena);
RDebugUtils.currentLine=2162692;
 //BA.debugLineNum = 2162692;BA.debugLine="PnlReport.Enabled=Ena";
mostCurrent._pnlreport.setEnabled(_ena);
RDebugUtils.currentLine=2162693;
 //BA.debugLineNum = 2162693;BA.debugLine="PnlMoshtarian.Enabled=Ena";
mostCurrent._pnlmoshtarian.setEnabled(_ena);
RDebugUtils.currentLine=2162694;
 //BA.debugLineNum = 2162694;BA.debugLine="Button1.Enabled=Ena";
mostCurrent._button1.setEnabled(_ena);
RDebugUtils.currentLine=2162695;
 //BA.debugLineNum = 2162695;BA.debugLine="Button2.Enabled=Ena";
mostCurrent._button2.setEnabled(_ena);
RDebugUtils.currentLine=2162696;
 //BA.debugLineNum = 2162696;BA.debugLine="Button3.Enabled=Ena";
mostCurrent._button3.setEnabled(_ena);
RDebugUtils.currentLine=2162697;
 //BA.debugLineNum = 2162697;BA.debugLine="Button4.Enabled=Ena";
mostCurrent._button4.setEnabled(_ena);
RDebugUtils.currentLine=2162698;
 //BA.debugLineNum = 2162698;BA.debugLine="End Sub";
return "";
}
public static String  _t_datacheck_tick() throws Exception{
RDebugUtils.currentModule="act_main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "t_datacheck_tick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "t_datacheck_tick", null));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Sub T_DataCheck_Tick";
RDebugUtils.currentLine=2555905;
 //BA.debugLineNum = 2555905;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From Tb";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblLastSeen");
RDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="If Cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=2555907;
 //BA.debugLineNum = 2555907;BA.debugLine="LblText.Text = \"اطلاعات ارسال نشده وجود دارد\"";
mostCurrent._lbltext.setText(BA.ObjectToCharSequence("اطلاعات ارسال نشده وجود دارد"));
 }else {
RDebugUtils.currentLine=2555909;
 //BA.debugLineNum = 2555909;BA.debugLine="LblText.Text = \"\"";
mostCurrent._lbltext.setText(BA.ObjectToCharSequence(""));
 };
RDebugUtils.currentLine=2555911;
 //BA.debugLineNum = 2555911;BA.debugLine="End Sub";
return "";
}
public static String  _t_enterexit_tick() throws Exception{
RDebugUtils.currentModule="act_main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "t_enterexit_tick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "t_enterexit_tick", null));}
int _status = 0;
String _time = "";
String _date = "";
anywheresoftware.b4a.objects.MapFragmentWrapper.CameraPositionWrapper _cl = null;
String _code = "";
ir.parsikhesab.pakhsh.mcode._adapteenterexitvisitor _item = null;
String _response = "";
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Sub T_EnterExit_tick";
RDebugUtils.currentLine=2490369;
 //BA.debugLineNum = 2490369;BA.debugLine="T_EnterExit.Enabled=False";
_t_enterexit.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="Dim Status As Int";
_status = 0;
RDebugUtils.currentLine=2490371;
 //BA.debugLineNum = 2490371;BA.debugLine="If gmap.IsInitialized Then";
if (mostCurrent._gmap.IsInitialized()) { 
RDebugUtils.currentLine=2490372;
 //BA.debugLineNum = 2490372;BA.debugLine="Try";
try {RDebugUtils.currentLine=2490373;
 //BA.debugLineNum = 2490373;BA.debugLine="Dim Time As String = DateTime.Time(DateTime.Now";
_time = anywheresoftware.b4a.keywords.Common.DateTime.Time(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
RDebugUtils.currentLine=2490374;
 //BA.debugLineNum = 2490374;BA.debugLine="Dim Date As String =MCode.DatePersian";
_date = mostCurrent._mcode._datepersian /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=2490376;
 //BA.debugLineNum = 2490376;BA.debugLine="Dim cl As CameraPosition";
_cl = new anywheresoftware.b4a.objects.MapFragmentWrapper.CameraPositionWrapper();
RDebugUtils.currentLine=2490377;
 //BA.debugLineNum = 2490377;BA.debugLine="cl.Initialize(gmap.MyLocation.Latitude,gmap.MyL";
_cl.Initialize(mostCurrent._gmap.getMyLocation().getLatitude(),mostCurrent._gmap.getMyLocation().getLongitude(),(float) (15));
RDebugUtils.currentLine=2490378;
 //BA.debugLineNum = 2490378;BA.debugLine="gmap.AnimateCamera(cl)";
mostCurrent._gmap.AnimateCamera((com.google.android.gms.maps.model.CameraPosition)(_cl.getObject()));
RDebugUtils.currentLine=2490379;
 //BA.debugLineNum = 2490379;BA.debugLine="Lat = gmap.MyLocation.Latitude";
mostCurrent._lat = BA.NumberToString(mostCurrent._gmap.getMyLocation().getLatitude());
RDebugUtils.currentLine=2490380;
 //BA.debugLineNum = 2490380;BA.debugLine="Lon = gmap.MyLocation.Longitude";
mostCurrent._lon = BA.NumberToString(mostCurrent._gmap.getMyLocation().getLongitude());
RDebugUtils.currentLine=2490381;
 //BA.debugLineNum = 2490381;BA.debugLine="Log(Lat)";
anywheresoftware.b4a.keywords.Common.LogImpl("52490381",mostCurrent._lat,0);
RDebugUtils.currentLine=2490382;
 //BA.debugLineNum = 2490382;BA.debugLine="Log(Lon)";
anywheresoftware.b4a.keywords.Common.LogImpl("52490382",mostCurrent._lon,0);
RDebugUtils.currentLine=2490383;
 //BA.debugLineNum = 2490383;BA.debugLine="gps.Stop";
_gps.Stop();
RDebugUtils.currentLine=2490387;
 //BA.debugLineNum = 2490387;BA.debugLine="If ModeEnterExit =True Then";
if (_modeenterexit==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=2490389;
 //BA.debugLineNum = 2490389;BA.debugLine="Status = 1";
_status = (int) (1);
 }else 
{RDebugUtils.currentLine=2490390;
 //BA.debugLineNum = 2490390;BA.debugLine="Else If ModeEnterExit = False Then";
if (_modeenterexit==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=2490392;
 //BA.debugLineNum = 2490392;BA.debugLine="Status = 0";
_status = (int) (0);
 }}
;
RDebugUtils.currentLine=2490394;
 //BA.debugLineNum = 2490394;BA.debugLine="Dim Code As String=myCode.getSetting(\"OUT.dat\",";
_code = mostCurrent._mycode._getsetting /*String*/ (mostCurrent.activityBA,"OUT.dat","CodeInput",BA.NumberToString(100));
RDebugUtils.currentLine=2490395;
 //BA.debugLineNum = 2490395;BA.debugLine="Dim item As AdapteEnterExitVisitor";
_item = new ir.parsikhesab.pakhsh.mcode._adapteenterexitvisitor();
RDebugUtils.currentLine=2490396;
 //BA.debugLineNum = 2490396;BA.debugLine="item.Initialize";
_item.Initialize();
RDebugUtils.currentLine=2490397;
 //BA.debugLineNum = 2490397;BA.debugLine="item.fldCode=Code";
_item.fldCode /*String*/  = _code;
RDebugUtils.currentLine=2490398;
 //BA.debugLineNum = 2490398;BA.debugLine="item.fldType=Status";
_item.fldType /*String*/  = BA.NumberToString(_status);
RDebugUtils.currentLine=2490399;
 //BA.debugLineNum = 2490399;BA.debugLine="item.fldDate=Date";
_item.fldDate /*String*/  = _date;
RDebugUtils.currentLine=2490400;
 //BA.debugLineNum = 2490400;BA.debugLine="item.fldTime=Time";
_item.fldTime /*String*/  = _time;
RDebugUtils.currentLine=2490401;
 //BA.debugLineNum = 2490401;BA.debugLine="item.fldLat=Lat";
_item.fldLat /*String*/  = mostCurrent._lat;
RDebugUtils.currentLine=2490402;
 //BA.debugLineNum = 2490402;BA.debugLine="item.fldLon=Lon";
_item.fldLon /*String*/  = mostCurrent._lon;
RDebugUtils.currentLine=2490403;
 //BA.debugLineNum = 2490403;BA.debugLine="Dim response As String = MCode.EnterExitVisito";
_response = mostCurrent._mcode._enterexitvisitor /*String*/ (mostCurrent.activityBA,_item);
RDebugUtils.currentLine=2490405;
 //BA.debugLineNum = 2490405;BA.debugLine="LogColor(response,Colors.red)";
anywheresoftware.b4a.keywords.Common.LogImpl("52490405",_response,anywheresoftware.b4a.keywords.Common.Colors.Red);
RDebugUtils.currentLine=2490406;
 //BA.debugLineNum = 2490406;BA.debugLine="Select Case response";
switch (BA.switchObjectToInt(_response,"Success","DuplicateEnter","DuplicateExit","NoEnter")) {
case 0: {
RDebugUtils.currentLine=2490408;
 //BA.debugLineNum = 2490408;BA.debugLine="myCode.setSetting(\"OUT.dat\",\"input\",Status)";
mostCurrent._mycode._setsetting /*String*/ (mostCurrent.activityBA,"OUT.dat","input",BA.NumberToString(_status));
RDebugUtils.currentLine=2490409;
 //BA.debugLineNum = 2490409;BA.debugLine="If Status=0 Then";
if (_status==0) { 
RDebugUtils.currentLine=2490410;
 //BA.debugLineNum = 2490410;BA.debugLine="If MCode.IsConnected Then";
if (mostCurrent._mcode._isconnected /*boolean*/ (mostCurrent.activityBA)) { 
 };
RDebugUtils.currentLine=2490413;
 //BA.debugLineNum = 2490413;BA.debugLine="myCode.setSetting(\"OUT.dat\",\"CodeInput\",Code";
mostCurrent._mycode._setsetting /*String*/ (mostCurrent.activityBA,"OUT.dat","CodeInput",BA.NumberToString((double)(Double.parseDouble(_code))+1));
 };
RDebugUtils.currentLine=2490417;
 //BA.debugLineNum = 2490417;BA.debugLine="MsgboxAsync(\"عملیات با موفقیت انجام گردید\",\"";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("عملیات با موفقیت انجام گردید"),BA.ObjectToCharSequence(""),processBA);
RDebugUtils.currentLine=2490418;
 //BA.debugLineNum = 2490418;BA.debugLine="Activity_Resume";
_activity_resume();
 break; }
case 1: {
RDebugUtils.currentLine=2490420;
 //BA.debugLineNum = 2490420;BA.debugLine="myCode.setSetting(\"OUT.dat\",\"input\",Status)";
mostCurrent._mycode._setsetting /*String*/ (mostCurrent.activityBA,"OUT.dat","input",BA.NumberToString(_status));
RDebugUtils.currentLine=2490421;
 //BA.debugLineNum = 2490421;BA.debugLine="ToastMessageShow(\"ورود شما قبلا ثبت شده است\"";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("ورود شما قبلا ثبت شده است"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2490422;
 //BA.debugLineNum = 2490422;BA.debugLine="Activity_Resume";
_activity_resume();
 break; }
case 2: {
RDebugUtils.currentLine=2490424;
 //BA.debugLineNum = 2490424;BA.debugLine="myCode.setSetting(\"OUT.dat\",\"input\",Status)";
mostCurrent._mycode._setsetting /*String*/ (mostCurrent.activityBA,"OUT.dat","input",BA.NumberToString(_status));
RDebugUtils.currentLine=2490425;
 //BA.debugLineNum = 2490425;BA.debugLine="ToastMessageShow(\"خروج شما قبلا ثبت شده است\"";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("خروج شما قبلا ثبت شده است"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2490426;
 //BA.debugLineNum = 2490426;BA.debugLine="Activity_Resume";
_activity_resume();
 break; }
case 3: {
RDebugUtils.currentLine=2490428;
 //BA.debugLineNum = 2490428;BA.debugLine="ToastMessageShow(\"ورود شما ثبت نشده بدون ورو";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("ورود شما ثبت نشده بدون ورود نمی توانید خروج ثبت کنید"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2490429;
 //BA.debugLineNum = 2490429;BA.debugLine="Activity_Resume";
_activity_resume();
 break; }
default: {
RDebugUtils.currentLine=2490431;
 //BA.debugLineNum = 2490431;BA.debugLine="ToastMessageShow(\"خطایی در ثبت حضور و غیاب ر";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("خطایی در ثبت حضور و غیاب رخ داده است"),anywheresoftware.b4a.keywords.Common.True);
 break; }
}
;
RDebugUtils.currentLine=2490434;
 //BA.debugLineNum = 2490434;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 } 
       catch (Exception e57) {
			processBA.setLastException(e57);RDebugUtils.currentLine=2490437;
 //BA.debugLineNum = 2490437;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("52490437",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=2490438;
 //BA.debugLineNum = 2490438;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-T_EnterExit_tick");
 };
 };
RDebugUtils.currentLine=2490441;
 //BA.debugLineNum = 2490441;BA.debugLine="End Sub";
return "";
}
public static String  _t_exit_tick() throws Exception{
RDebugUtils.currentModule="act_main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "t_exit_tick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "t_exit_tick", null));}
RDebugUtils.currentLine=3538944;
 //BA.debugLineNum = 3538944;BA.debugLine="Sub T_Exit_Tick";
RDebugUtils.currentLine=3538945;
 //BA.debugLineNum = 3538945;BA.debugLine="IntExit = 0";
_intexit = (byte) (0);
RDebugUtils.currentLine=3538946;
 //BA.debugLineNum = 3538946;BA.debugLine="T_Exit.Enabled = False";
_t_exit.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3538947;
 //BA.debugLineNum = 3538947;BA.debugLine="End Sub";
return "";
}
public static String  _txtcodemoshtari_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="act_main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "txtcodemoshtari_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "txtcodemoshtari_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=5636096;
 //BA.debugLineNum = 5636096;BA.debugLine="Sub txtCodeMoshtari_TextChanged (Old As String, Ne";
RDebugUtils.currentLine=5636097;
 //BA.debugLineNum = 5636097;BA.debugLine="If txtCodeMoshtari.Text.Length>14 Then";
if (mostCurrent._txtcodemoshtari.getText().length()>14) { 
RDebugUtils.currentLine=5636098;
 //BA.debugLineNum = 5636098;BA.debugLine="txtCodeMoshtari.Text=Old";
mostCurrent._txtcodemoshtari.setText(BA.ObjectToCharSequence(_old));
RDebugUtils.currentLine=5636099;
 //BA.debugLineNum = 5636099;BA.debugLine="txtCodeMoshtari.SelectionStart=txtCodeMoshtari.T";
mostCurrent._txtcodemoshtari.setSelectionStart(mostCurrent._txtcodemoshtari.getText().length());
 };
RDebugUtils.currentLine=5636101;
 //BA.debugLineNum = 5636101;BA.debugLine="End Sub";
return "";
}
public static String  _update_updatecomplete() throws Exception{
RDebugUtils.currentModule="act_main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "update_updatecomplete", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "update_updatecomplete", null));}
RDebugUtils.currentLine=5046272;
 //BA.debugLineNum = 5046272;BA.debugLine="Sub update_UpdateComplete";
RDebugUtils.currentLine=5046273;
 //BA.debugLineNum = 5046273;BA.debugLine="Try";
try {RDebugUtils.currentLine=5046274;
 //BA.debugLineNum = 5046274;BA.debugLine="LogColor($\"UpdateComplete - time: ${DateTime.Tim";
anywheresoftware.b4a.keywords.Common.LogImpl("55046274",("UpdateComplete - time: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.DateTime.Time(anywheresoftware.b4a.keywords.Common.DateTime.getNow())))+""),((int)0xff556b2f));
RDebugUtils.currentLine=5046275;
 //BA.debugLineNum = 5046275;BA.debugLine="apkupdt.StopSplashScreen";
mostCurrent._apkupdt._stopsplashscreen /*String*/ (null);
RDebugUtils.currentLine=5046277;
 //BA.debugLineNum = 5046277;BA.debugLine="Select apkupdt.Status";
switch (BA.switchObjectToInt(mostCurrent._apkupdt._getstatus /*int*/ (null),mostCurrent._apkupdt._ok_curver /*int*/ ,mostCurrent._apkupdt._ok_webver /*int*/ ,mostCurrent._apkupdt._ok_newerapk /*int*/ ,mostCurrent._apkupdt._no_newerapk /*int*/ ,mostCurrent._apkupdt._ok_download /*int*/ ,mostCurrent._apkupdt._ok_install /*int*/ ,mostCurrent._apkupdt._err_noperm /*int*/ )) {
case 0: {
RDebugUtils.currentLine=5046279;
 //BA.debugLineNum = 5046279;BA.debugLine="Log($\"Running apk version: ${apkupdt.CurVN}${C";
anywheresoftware.b4a.keywords.Common.LogImpl("55046279",("Running apk version: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._apkupdt._getcurvn /*String*/ (null)))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.CRLF))+""),0);
 break; }
case 1: {
RDebugUtils.currentLine=5046281;
 //BA.debugLineNum = 5046281;BA.debugLine="Log($\"Webserver apk version: ${apkupdt.WebVN}$";
anywheresoftware.b4a.keywords.Common.LogImpl("55046281",("Webserver apk version: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._apkupdt._getwebvn /*String*/ (null)))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.CRLF))+""),0);
 break; }
case 2: {
 break; }
case 3: {
 break; }
case 4: {
 break; }
case 5: {
 break; }
case 6: {
RDebugUtils.currentLine=5046293;
 //BA.debugLineNum = 5046293;BA.debugLine="Log(\"No permission to install\")";
anywheresoftware.b4a.keywords.Common.LogImpl("55046293","No permission to install",0);
 break; }
default: {
 break; }
}
;
 } 
       catch (Exception e18) {
			processBA.setLastException(e18);RDebugUtils.currentLine=5046299;
 //BA.debugLineNum = 5046299;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("55046299",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=5046300;
 //BA.debugLineNum = 5046300;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-update_UpdateComplete");
 };
RDebugUtils.currentLine=5046302;
 //BA.debugLineNum = 5046302;BA.debugLine="End Sub";
return "";
}

public static void GetAdvertisingId() {
   BA.runAsync(processBA, mostCurrent, "advertisingid_ready", new Object[] {false, ""}
       , new Callable<Object[]>() {
                   @Override
                   public Object[] call() throws Exception {
                       String id = AdvertisingIdClient.getAdvertisingIdInfo(mostCurrent).getId();
                       return new Object[] {true, id};
                   }
               }); }

public static String GetJavaStackTrace(Exception e) {
    StringWriter sw = new StringWriter();
    PrintWriter pw = new PrintWriter(sw);
    e.printStackTrace(pw);
    return sw.toString();
}
}