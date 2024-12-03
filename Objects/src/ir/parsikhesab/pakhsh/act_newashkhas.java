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

public class act_newashkhas extends Activity implements B4AActivity{
	public static act_newashkhas mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.act_newashkhas");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (act_newashkhas).");
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
		activityBA = new BA(this, layout, processBA, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.act_newashkhas");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "ir.parsikhesab.pakhsh.act_newashkhas", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (act_newashkhas) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (act_newashkhas) Resume **");
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
		return act_newashkhas.class;
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
            BA.LogInfo("** Activity (act_newashkhas) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (act_newashkhas) Pause event (activity is not paused). **");
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
            act_newashkhas mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (act_newashkhas) Resume **");
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
public static anywheresoftware.b4a.gps.GPS _gps1 = null;
public static anywheresoftware.b4a.objects.Timer _t1 = null;
public static ir.parsikhesab.pakhsh.mcode._adapterlistashkhas _shakhs = null;
public anywheresoftware.b4a.objects.RuntimePermissions _rp = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtname = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txttell = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtmob = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtaddress = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnsavenewmoshtari = null;
public static String _lat = "";
public static String _lon = "";
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _chgps = null;
public anywheresoftware.b4a.objects.IME _key = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtshomarehesab = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtlat = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtlon = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtc_meli = null;
public anywheresoftware.b4a.objects.LabelWrapper _btnnewnumber = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlspcity = null;
public nicespinnerwrapper.niceSpinnerWrapper _nicespinner = null;
public nicespinnerwrapper.niceSpinnerWrapper _nicespinner1 = null;
public ir.parsikhesab.pakhsh.b4xcombobox _b4xcombobox1 = null;
public ir.parsikhesab.pakhsh.b4xcombobox _b4xcombobox2 = null;
public anywheresoftware.b4a.objects.collections.List _listgoroohashkhas1 = null;
public anywheresoftware.b4a.objects.collections.List _originallistgoroohashkhas1 = null;
public anywheresoftware.b4a.objects.collections.List _listgoroohashkhas2 = null;
public anywheresoftware.b4a.objects.collections.List _originallistgoroohashkhas2 = null;
public static long _groupcodeselect = 0L;
public static String _groupnameselect = "";
public anywheresoftware.b4a.objects.MapFragmentWrapper.GoogleMapWrapper _gmap = null;
public anywheresoftware.b4a.objects.MapFragmentWrapper _mapfragment1 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtc_posti = null;
public anywheresoftware.b4a.objects.MapFragmentWrapper.LatLngWrapper _loc = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlspgroup = null;
public anywheresoftware.b4a.objects.collections.List _lstgroup1 = null;
public anywheresoftware.b4a.objects.collections.List _lstgroup2 = null;
public anywheresoftware.b4a.objects.collections.List _lstsearchgroup1 = null;
public anywheresoftware.b4a.objects.collections.List _lstsearchgroup2 = null;
public anywheresoftware.b4a.objects.collections.List _lstselectedcodegroupashkhas = null;
public static String _groupcodeselect1 = "";
public static String _groupnameselect1 = "";
public static String _groupcodeselect2 = "";
public static String _groupnameselect2 = "";
public static int _indexgroup1 = 0;
public static int _indexgroup2 = 0;
public anywheresoftware.b4a.objects.LabelWrapper _lbltitle = null;
public static String _typeselectgroup = "";
public anywheresoftware.b4a.objects.EditTextWrapper _txtcodemostari = null;
public ir.parsikhesab.pakhsh.b4xsearchtemplate _searchtemplate1 = null;
public ir.parsikhesab.pakhsh.b4xsearchtemplate _searchtemplate2 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public ir.parsikhesab.pakhsh.b4xdialog _dialog = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _base = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel1 = null;
public igolub.fused.b4a.location.FusedLocationProviderClientWrapper _fused = null;
public anywheresoftware.b4a.objects.LabelWrapper _btnsearchgroup1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _btnsearchgroup2 = null;
public static String _querysearch1 = "";
public static String _querysearch2 = "";
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
RDebugUtils.currentModule="act_newashkhas";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=49479680;
 //BA.debugLineNum = 49479680;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=49479681;
 //BA.debugLineNum = 49479681;BA.debugLine="Try";
try {RDebugUtils.currentLine=49479682;
 //BA.debugLineNum = 49479682;BA.debugLine="Activity.LoadLayout(\"L_NewAshkhas\")";
mostCurrent._activity.LoadLayout("L_NewAshkhas",mostCurrent.activityBA);
RDebugUtils.currentLine=49479683;
 //BA.debugLineNum = 49479683;BA.debugLine="Base = Activity";
mostCurrent._base = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(mostCurrent._activity.getObject()));
RDebugUtils.currentLine=49479684;
 //BA.debugLineNum = 49479684;BA.debugLine="Dialog.Initialize (Panel1)";
mostCurrent._dialog._initialize /*String*/ (null,mostCurrent.activityBA,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(mostCurrent._panel1.getObject())));
RDebugUtils.currentLine=49479685;
 //BA.debugLineNum = 49479685;BA.debugLine="Dialog.Title = \"جستجوی گروه اشخاص\"";
mostCurrent._dialog._title /*Object*/  = (Object)("جستجوی گروه اشخاص");
RDebugUtils.currentLine=49479686;
 //BA.debugLineNum = 49479686;BA.debugLine="SearchTemplate1.Initialize";
mostCurrent._searchtemplate1._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=49479687;
 //BA.debugLineNum = 49479687;BA.debugLine="SearchTemplate2.Initialize";
mostCurrent._searchtemplate2._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=49479689;
 //BA.debugLineNum = 49479689;BA.debugLine="OriginalListGoroohAshkhas1.Initialize";
mostCurrent._originallistgoroohashkhas1.Initialize();
RDebugUtils.currentLine=49479690;
 //BA.debugLineNum = 49479690;BA.debugLine="OriginalListGoroohAshkhas2.Initialize";
mostCurrent._originallistgoroohashkhas2.Initialize();
RDebugUtils.currentLine=49479691;
 //BA.debugLineNum = 49479691;BA.debugLine="ListGoroohAshkhas1.Initialize";
mostCurrent._listgoroohashkhas1.Initialize();
RDebugUtils.currentLine=49479692;
 //BA.debugLineNum = 49479692;BA.debugLine="ListGoroohAshkhas2.Initialize";
mostCurrent._listgoroohashkhas2.Initialize();
RDebugUtils.currentLine=49479693;
 //BA.debugLineNum = 49479693;BA.debugLine="lstSelectedCodeGroupAshkhas.Initialize";
mostCurrent._lstselectedcodegroupashkhas.Initialize();
RDebugUtils.currentLine=49479694;
 //BA.debugLineNum = 49479694;BA.debugLine="lstGroup1.Initialize";
mostCurrent._lstgroup1.Initialize();
RDebugUtils.currentLine=49479695;
 //BA.debugLineNum = 49479695;BA.debugLine="lstGroup2.Initialize";
mostCurrent._lstgroup2.Initialize();
RDebugUtils.currentLine=49479696;
 //BA.debugLineNum = 49479696;BA.debugLine="lstSearchGroup1.Initialize";
mostCurrent._lstsearchgroup1.Initialize();
RDebugUtils.currentLine=49479697;
 //BA.debugLineNum = 49479697;BA.debugLine="lstSearchGroup2.Initialize";
mostCurrent._lstsearchgroup2.Initialize();
RDebugUtils.currentLine=49479698;
 //BA.debugLineNum = 49479698;BA.debugLine="Fused.Initialize(\"FusedLocation\")";
mostCurrent._fused.Initialize(processBA,"FusedLocation");
RDebugUtils.currentLine=49479699;
 //BA.debugLineNum = 49479699;BA.debugLine="GPS1.Initialize(\"GPS1\")";
_gps1.Initialize("GPS1");
RDebugUtils.currentLine=49479700;
 //BA.debugLineNum = 49479700;BA.debugLine="Key.Initialize(\"Key\")";
mostCurrent._key.Initialize("Key");
RDebugUtils.currentLine=49479701;
 //BA.debugLineNum = 49479701;BA.debugLine="t1.Initialize(\"t1\",5000)";
_t1.Initialize(processBA,"t1",(long) (5000));
RDebugUtils.currentLine=49479702;
 //BA.debugLineNum = 49479702;BA.debugLine="CreatePage";
_createpage();
RDebugUtils.currentLine=49479703;
 //BA.debugLineNum = 49479703;BA.debugLine="If GPS1.GPSEnabled = False Then";
if (_gps1.getGPSEnabled()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=49479704;
 //BA.debugLineNum = 49479704;BA.debugLine="ToastMessageShow(\"موقعیت مکانی خود را روشن کنید";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("موقعیت مکانی خود را روشن کنید"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=49479705;
 //BA.debugLineNum = 49479705;BA.debugLine="StartActivity(GPS1.LocationSettingsIntent) 'Wil";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(_gps1.getLocationSettingsIntent()));
 }else {
RDebugUtils.currentLine=49479707;
 //BA.debugLineNum = 49479707;BA.debugLine="t1.Enabled=True";
_t1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=49479710;
 //BA.debugLineNum = 49479710;BA.debugLine="Log(Activity.Title)";
anywheresoftware.b4a.keywords.Common.LogImpl("549479710",BA.ObjectToString(mostCurrent._activity.getTitle()),0);
 } 
       catch (Exception e30) {
			processBA.setLastException(e30);RDebugUtils.currentLine=49479712;
 //BA.debugLineNum = 49479712;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("549479712",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=49479713;
 //BA.debugLineNum = 49479713;BA.debugLine="myCode.SendError(LastException, Activity.Title&\"";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-Activity_Create");
 };
RDebugUtils.currentLine=49479715;
 //BA.debugLineNum = 49479715;BA.debugLine="End Sub";
return "";
}
public static String  _createpage() throws Exception{
RDebugUtils.currentModule="act_newashkhas";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createpage", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "createpage", null));}
anywheresoftware.b4a.objects.drawable.ColorDrawable _op = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _op1 = null;
String _time = "";
String _newcode = "";
RDebugUtils.currentLine=49610752;
 //BA.debugLineNum = 49610752;BA.debugLine="Sub CreatePage";
RDebugUtils.currentLine=49610754;
 //BA.debugLineNum = 49610754;BA.debugLine="Try";
try {RDebugUtils.currentLine=49610755;
 //BA.debugLineNum = 49610755;BA.debugLine="Key.SetCustomFilter(TxtTell,TxtTell.INPUT_TYPE_N";
mostCurrent._key.SetCustomFilter((android.widget.EditText)(mostCurrent._txttell.getObject()),mostCurrent._txttell.INPUT_TYPE_NUMBERS,"0123456789");
RDebugUtils.currentLine=49610756;
 //BA.debugLineNum = 49610756;BA.debugLine="Key.SetCustomFilter(TxtMob,TxtMob.INPUT_TYPE_NUM";
mostCurrent._key.SetCustomFilter((android.widget.EditText)(mostCurrent._txtmob.getObject()),mostCurrent._txtmob.INPUT_TYPE_NUMBERS,"0123456789");
RDebugUtils.currentLine=49610757;
 //BA.debugLineNum = 49610757;BA.debugLine="Key.SetCustomFilter(TxtLat,TxtLat.INPUT_TYPE_NUM";
mostCurrent._key.SetCustomFilter((android.widget.EditText)(mostCurrent._txtlat.getObject()),mostCurrent._txtlat.INPUT_TYPE_NUMBERS,"0123456789.");
RDebugUtils.currentLine=49610758;
 //BA.debugLineNum = 49610758;BA.debugLine="Key.SetCustomFilter(TxtLon,TxtLon.INPUT_TYPE_NUM";
mostCurrent._key.SetCustomFilter((android.widget.EditText)(mostCurrent._txtlon.getObject()),mostCurrent._txtlon.INPUT_TYPE_NUMBERS,"0123456789.");
RDebugUtils.currentLine=49610759;
 //BA.debugLineNum = 49610759;BA.debugLine="Key.SetCustomFilter(TxtShomarehesab,TxtShomarehe";
mostCurrent._key.SetCustomFilter((android.widget.EditText)(mostCurrent._txtshomarehesab.getObject()),mostCurrent._txtshomarehesab.INPUT_TYPE_NUMBERS,"0123456789");
RDebugUtils.currentLine=49610760;
 //BA.debugLineNum = 49610760;BA.debugLine="Key.SetCustomFilter(TxtC_Posti,TxtC_Posti.INPUT_";
mostCurrent._key.SetCustomFilter((android.widget.EditText)(mostCurrent._txtc_posti.getObject()),mostCurrent._txtc_posti.INPUT_TYPE_NUMBERS,"0123456789");
RDebugUtils.currentLine=49610761;
 //BA.debugLineNum = 49610761;BA.debugLine="Key.SetLengthFilter(TxtMob,11)";
mostCurrent._key.SetLengthFilter((android.widget.EditText)(mostCurrent._txtmob.getObject()),(int) (11));
RDebugUtils.currentLine=49610762;
 //BA.debugLineNum = 49610762;BA.debugLine="Key.SetLengthFilter(TxtC_Posti,10)";
mostCurrent._key.SetLengthFilter((android.widget.EditText)(mostCurrent._txtc_posti.getObject()),(int) (10));
RDebugUtils.currentLine=49610763;
 //BA.debugLineNum = 49610763;BA.debugLine="Key.SetLengthFilter(TxtC_Meli,10)";
mostCurrent._key.SetLengthFilter((android.widget.EditText)(mostCurrent._txtc_meli.getObject()),(int) (10));
RDebugUtils.currentLine=49610764;
 //BA.debugLineNum = 49610764;BA.debugLine="Key.SetLengthFilter(TxtShomarehesab,29)";
mostCurrent._key.SetLengthFilter((android.widget.EditText)(mostCurrent._txtshomarehesab.getObject()),(int) (29));
RDebugUtils.currentLine=49610765;
 //BA.debugLineNum = 49610765;BA.debugLine="Key.SetLengthFilter(TxtName,50)";
mostCurrent._key.SetLengthFilter((android.widget.EditText)(mostCurrent._txtname.getObject()),(int) (50));
RDebugUtils.currentLine=49610766;
 //BA.debugLineNum = 49610766;BA.debugLine="Key.SetLengthFilter(TxtAddress,200)";
mostCurrent._key.SetLengthFilter((android.widget.EditText)(mostCurrent._txtaddress.getObject()),(int) (200));
RDebugUtils.currentLine=49610767;
 //BA.debugLineNum = 49610767;BA.debugLine="Key.SetLengthFilter(TxtTell,11)";
mostCurrent._key.SetLengthFilter((android.widget.EditText)(mostCurrent._txttell.getObject()),(int) (11));
RDebugUtils.currentLine=49610768;
 //BA.debugLineNum = 49610768;BA.debugLine="If MCode.Gps=1 Then";
if ((mostCurrent._mcode._gps /*String*/ ).equals(BA.NumberToString(1))) { 
RDebugUtils.currentLine=49610769;
 //BA.debugLineNum = 49610769;BA.debugLine="ChGps.Enabled=False";
mostCurrent._chgps.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 }else {
RDebugUtils.currentLine=49610771;
 //BA.debugLineNum = 49610771;BA.debugLine="ChGps.Enabled=True";
mostCurrent._chgps.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=49610773;
 //BA.debugLineNum = 49610773;BA.debugLine="NiceSpinner.Initialize(\"NiceSpinner\")";
mostCurrent._nicespinner.Initialize(processBA,"NiceSpinner");
RDebugUtils.currentLine=49610774;
 //BA.debugLineNum = 49610774;BA.debugLine="NiceSpinner.TextColor = Colors.Black";
mostCurrent._nicespinner.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=49610775;
 //BA.debugLineNum = 49610775;BA.debugLine="NiceSpinner.Gravity = Gravity.CENTER_HORIZONTAL";
mostCurrent._nicespinner.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL);
RDebugUtils.currentLine=49610776;
 //BA.debugLineNum = 49610776;BA.debugLine="NiceSpinner.Typeface = Typeface.LoadFromAssets(\"";
mostCurrent._nicespinner.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("p_font.ttf"));
RDebugUtils.currentLine=49610777;
 //BA.debugLineNum = 49610777;BA.debugLine="PnlSpGroup.AddView(NiceSpinner,B4XComboBox1.mBas";
mostCurrent._pnlspgroup.AddView((android.view.View)(mostCurrent._nicespinner.getObject()),mostCurrent._b4xcombobox1._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft(),mostCurrent._b4xcombobox1._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop(),mostCurrent._b4xcombobox1._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),mostCurrent._b4xcombobox1._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=49610779;
 //BA.debugLineNum = 49610779;BA.debugLine="Dim op As ColorDrawable";
_op = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=49610780;
 //BA.debugLineNum = 49610780;BA.debugLine="op.Initialize2(Colors.White,8dip,2dip,Colors.Bla";
_op.Initialize2(anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (8)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2)),anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=49610781;
 //BA.debugLineNum = 49610781;BA.debugLine="NiceSpinner.Background=op";
mostCurrent._nicespinner.setBackground((android.graphics.drawable.Drawable)(_op.getObject()));
RDebugUtils.currentLine=49610783;
 //BA.debugLineNum = 49610783;BA.debugLine="NiceSpinner1.Initialize(\"NiceSpinner1\")";
mostCurrent._nicespinner1.Initialize(processBA,"NiceSpinner1");
RDebugUtils.currentLine=49610784;
 //BA.debugLineNum = 49610784;BA.debugLine="NiceSpinner1.TextColor = Colors.Black";
mostCurrent._nicespinner1.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=49610785;
 //BA.debugLineNum = 49610785;BA.debugLine="NiceSpinner1.Gravity = Gravity.CENTER_HORIZONTAL";
mostCurrent._nicespinner1.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL);
RDebugUtils.currentLine=49610786;
 //BA.debugLineNum = 49610786;BA.debugLine="NiceSpinner1.Typeface = Typeface.LoadFromAssets(";
mostCurrent._nicespinner1.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("p_font.ttf"));
RDebugUtils.currentLine=49610787;
 //BA.debugLineNum = 49610787;BA.debugLine="PnlSpGroup.AddView(NiceSpinner1,B4XComboBox2.mBa";
mostCurrent._pnlspgroup.AddView((android.view.View)(mostCurrent._nicespinner1.getObject()),mostCurrent._b4xcombobox2._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft(),mostCurrent._b4xcombobox2._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop(),mostCurrent._b4xcombobox2._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),mostCurrent._b4xcombobox2._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=49610789;
 //BA.debugLineNum = 49610789;BA.debugLine="Dim op1 As ColorDrawable";
_op1 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=49610790;
 //BA.debugLineNum = 49610790;BA.debugLine="op1.Initialize2(Colors.White,8dip,2dip,Colors.Bl";
_op1.Initialize2(anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (8)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2)),anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=49610791;
 //BA.debugLineNum = 49610791;BA.debugLine="NiceSpinner1.Background=op1";
mostCurrent._nicespinner1.setBackground((android.graphics.drawable.Drawable)(_op1.getObject()));
RDebugUtils.currentLine=49610792;
 //BA.debugLineNum = 49610792;BA.debugLine="lstGroup2.Add(\"همه گروه ها\")";
mostCurrent._lstgroup2.Add((Object)("همه گروه ها"));
RDebugUtils.currentLine=49610793;
 //BA.debugLineNum = 49610793;BA.debugLine="NiceSpinner1.attachDataSource(lstGroup2)";
mostCurrent._nicespinner1.attachDataSource((java.util.List)(mostCurrent._lstgroup2.getObject()));
RDebugUtils.currentLine=49610795;
 //BA.debugLineNum = 49610795;BA.debugLine="LoadAcSpGroohAshkas";
_loadacspgroohashkas();
RDebugUtils.currentLine=49610796;
 //BA.debugLineNum = 49610796;BA.debugLine="Dim Time As String = DateTime.Time(DateTime.Now)";
_time = anywheresoftware.b4a.keywords.Common.DateTime.Time(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
RDebugUtils.currentLine=49610797;
 //BA.debugLineNum = 49610797;BA.debugLine="Dim NewCode As String = MCode.ConvertNumbersPers";
_newcode = mostCurrent._mcode._convertnumberspersian2english /*String*/ (mostCurrent.activityBA,mostCurrent._mcode._c_visitor /*String*/ +mostCurrent._mcode._datepersian /*String*/ (mostCurrent.activityBA)+_time.replace(":",""));
RDebugUtils.currentLine=49610798;
 //BA.debugLineNum = 49610798;BA.debugLine="TxtCodeMostari.Text=NewCode";
mostCurrent._txtcodemostari.setText(BA.ObjectToCharSequence(_newcode));
RDebugUtils.currentLine=49610799;
 //BA.debugLineNum = 49610799;BA.debugLine="If MCode.UpdateShakhs=True Then";
if (mostCurrent._mcode._updateshakhs /*boolean*/ ==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=49610800;
 //BA.debugLineNum = 49610800;BA.debugLine="LoadUpdateShakhs";
_loadupdateshakhs();
 };
 } 
       catch (Exception e46) {
			processBA.setLastException(e46);RDebugUtils.currentLine=49610803;
 //BA.debugLineNum = 49610803;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("549610803",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=49610804;
 //BA.debugLineNum = 49610804;BA.debugLine="myCode.SendError(LastException, Activity.Title&\"";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-CreatePage");
 };
RDebugUtils.currentLine=49610806;
 //BA.debugLineNum = 49610806;BA.debugLine="End Sub";
return "";
}
public static boolean  _activity_keypress(int _keycode) throws Exception{
RDebugUtils.currentModule="act_newashkhas";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_keypress", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "activity_keypress", new Object[] {_keycode}));}
RDebugUtils.currentLine=50266112;
 //BA.debugLineNum = 50266112;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
RDebugUtils.currentLine=50266113;
 //BA.debugLineNum = 50266113;BA.debugLine="If KeyCode=KeyCodes.KEYCODE_BACK Then";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK) { 
RDebugUtils.currentLine=50266114;
 //BA.debugLineNum = 50266114;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=50266115;
 //BA.debugLineNum = 50266115;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 }else {
RDebugUtils.currentLine=50266117;
 //BA.debugLineNum = 50266117;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 };
RDebugUtils.currentLine=50266119;
 //BA.debugLineNum = 50266119;BA.debugLine="End Sub";
return false;
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="act_newashkhas";
RDebugUtils.currentLine=50397184;
 //BA.debugLineNum = 50397184;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=50397185;
 //BA.debugLineNum = 50397185;BA.debugLine="GPS1.Stop";
_gps1.Stop();
RDebugUtils.currentLine=50397186;
 //BA.debugLineNum = 50397186;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="act_newashkhas";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=50331648;
 //BA.debugLineNum = 50331648;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=50331649;
 //BA.debugLineNum = 50331649;BA.debugLine="If MCode.IsConnected=False And MCode.ConnectionSt";
if (mostCurrent._mcode._isconnected /*boolean*/ (mostCurrent.activityBA)==anywheresoftware.b4a.keywords.Common.False && (mostCurrent._mcode._connectionstatus /*String*/ ).equals(BA.NumberToString(1))) { 
RDebugUtils.currentLine=50331650;
 //BA.debugLineNum = 50331650;BA.debugLine="ToastMessageShow(\"لطفا ارتباط اینترنت گوشی خود ر";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("لطفا ارتباط اینترنت گوشی خود را بررسی نمایید"),anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=50331659;
 //BA.debugLineNum = 50331659;BA.debugLine="If GPS1.GPSEnabled=True Then";
if (_gps1.getGPSEnabled()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=50331660;
 //BA.debugLineNum = 50331660;BA.debugLine="t1.Enabled=True";
_t1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=50331663;
 //BA.debugLineNum = 50331663;BA.debugLine="End Sub";
return "";
}
public static String  _animatedialog(ir.parsikhesab.pakhsh.b4xdialog _dlg,String _fromedge) throws Exception{
RDebugUtils.currentModule="act_newashkhas";
if (Debug.shouldDelegate(mostCurrent.activityBA, "animatedialog", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "animatedialog", new Object[] {_dlg,_fromedge}));}
int _top = 0;
int _left = 0;
RDebugUtils.currentLine=51445760;
 //BA.debugLineNum = 51445760;BA.debugLine="Sub AnimateDialog (dlg As B4XDialog, FromEdge As S";
RDebugUtils.currentLine=51445761;
 //BA.debugLineNum = 51445761;BA.debugLine="Dim Base As B4XView = dlg.Base";
mostCurrent._base = new anywheresoftware.b4a.objects.B4XViewWrapper();
mostCurrent._base = _dlg._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=51445762;
 //BA.debugLineNum = 51445762;BA.debugLine="Dim top As Int = Base.Top";
_top = mostCurrent._base.getTop();
RDebugUtils.currentLine=51445763;
 //BA.debugLineNum = 51445763;BA.debugLine="Dim left As Int = Base.Left";
_left = mostCurrent._base.getLeft();
RDebugUtils.currentLine=51445764;
 //BA.debugLineNum = 51445764;BA.debugLine="Select FromEdge.ToLowerCase";
switch (BA.switchObjectToInt(_fromedge.toLowerCase(),"bottom","top","left","right")) {
case 0: {
RDebugUtils.currentLine=51445766;
 //BA.debugLineNum = 51445766;BA.debugLine="Base.Top = Base.Parent.Height";
mostCurrent._base.setTop(mostCurrent._base.getParent().getHeight());
 break; }
case 1: {
RDebugUtils.currentLine=51445768;
 //BA.debugLineNum = 51445768;BA.debugLine="Base.Top = -Base.Height";
mostCurrent._base.setTop((int) (-mostCurrent._base.getHeight()));
 break; }
case 2: {
RDebugUtils.currentLine=51445770;
 //BA.debugLineNum = 51445770;BA.debugLine="Base.Left = -Base.Width";
mostCurrent._base.setLeft((int) (-mostCurrent._base.getWidth()));
 break; }
case 3: {
RDebugUtils.currentLine=51445772;
 //BA.debugLineNum = 51445772;BA.debugLine="Base.Left = Base.Parent.Width";
mostCurrent._base.setLeft(mostCurrent._base.getParent().getWidth());
 break; }
}
;
RDebugUtils.currentLine=51445774;
 //BA.debugLineNum = 51445774;BA.debugLine="Base.SetLayoutAnimated(300, left, top, Base.Width";
mostCurrent._base.SetLayoutAnimated((int) (300),_left,_top,mostCurrent._base.getWidth(),mostCurrent._base.getHeight());
RDebugUtils.currentLine=51445775;
 //BA.debugLineNum = 51445775;BA.debugLine="End Sub";
return "";
}
public static boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
RDebugUtils.currentModule="act_newashkhas";
if (Debug.shouldDelegate(mostCurrent.activityBA, "application_error", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "application_error", new Object[] {_error,_stacktrace}));}
RDebugUtils.currentLine=51380224;
 //BA.debugLineNum = 51380224;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
RDebugUtils.currentLine=51380226;
 //BA.debugLineNum = 51380226;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=51380227;
 //BA.debugLineNum = 51380227;BA.debugLine="End Sub";
return false;
}
public static String  _btn_back_click() throws Exception{
RDebugUtils.currentModule="act_newashkhas";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_back_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_back_click", null));}
RDebugUtils.currentLine=51314688;
 //BA.debugLineNum = 51314688;BA.debugLine="Sub btn_Back_Click";
RDebugUtils.currentLine=51314689;
 //BA.debugLineNum = 51314689;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=51314690;
 //BA.debugLineNum = 51314690;BA.debugLine="End Sub";
return "";
}
public static String  _btnnewnumber_click() throws Exception{
RDebugUtils.currentModule="act_newashkhas";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnnewnumber_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnnewnumber_click", null));}
String _str = "";
RDebugUtils.currentLine=51249152;
 //BA.debugLineNum = 51249152;BA.debugLine="Sub BtnNewNumber_Click";
RDebugUtils.currentLine=51249153;
 //BA.debugLineNum = 51249153;BA.debugLine="Dim str As String=DateTime.Now";
_str = BA.NumberToString(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
RDebugUtils.currentLine=51249154;
 //BA.debugLineNum = 51249154;BA.debugLine="TxtMob.Text=\"09\"&str.SubString(str.Length-9)";
mostCurrent._txtmob.setText(BA.ObjectToCharSequence("09"+_str.substring((int) (_str.length()-9))));
RDebugUtils.currentLine=51249155;
 //BA.debugLineNum = 51249155;BA.debugLine="End Sub";
return "";
}
public static String  _btnsavenewmoshtari_click() throws Exception{
RDebugUtils.currentModule="act_newashkhas";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnsavenewmoshtari_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnsavenewmoshtari_click", null));}
RDebugUtils.currentLine=50659328;
 //BA.debugLineNum = 50659328;BA.debugLine="Sub BtnSaveNewMoshtari_Click";
RDebugUtils.currentLine=50659329;
 //BA.debugLineNum = 50659329;BA.debugLine="Try";
try {RDebugUtils.currentLine=50659331;
 //BA.debugLineNum = 50659331;BA.debugLine="If TxtName.Text = \"\" Then";
if ((mostCurrent._txtname.getText()).equals("")) { 
RDebugUtils.currentLine=50659332;
 //BA.debugLineNum = 50659332;BA.debugLine="ToastMessageShow(\"نام مشتری را وارد نمایید\",Tru";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("نام مشتری را وارد نمایید"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=50659333;
 //BA.debugLineNum = 50659333;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=50659336;
 //BA.debugLineNum = 50659336;BA.debugLine="If MCode.MobileIsImportent=\"1\" Then";
if ((mostCurrent._mcode._mobileisimportent /*String*/ ).equals("1")) { 
RDebugUtils.currentLine=50659337;
 //BA.debugLineNum = 50659337;BA.debugLine="If TxtMob.Text = \"\" And MCode.MobileIsImportent";
if ((mostCurrent._txtmob.getText()).equals("") && (mostCurrent._mcode._mobileisimportent /*String*/ ).equals("1")) { 
RDebugUtils.currentLine=50659338;
 //BA.debugLineNum = 50659338;BA.debugLine="ToastMessageShow(\"شماره همراه مشتری را وارد نم";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("شماره همراه مشتری را وارد نمایید"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=50659339;
 //BA.debugLineNum = 50659339;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=50659342;
 //BA.debugLineNum = 50659342;BA.debugLine="If (MCode.Sf.Len(TxtMob.Text.Trim) <> 11 And MC";
if ((mostCurrent._mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvv1(mostCurrent._txtmob.getText().trim())!=11 && (mostCurrent._mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vv0(mostCurrent._txtmob.getText().trim(),(long) (2))).equals("09") == false)) { 
RDebugUtils.currentLine=50659343;
 //BA.debugLineNum = 50659343;BA.debugLine="ToastMessageShow(\"شماره همراه را به طور کامل و";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("شماره همراه را به طور کامل و صحیح وارد نمایید"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=50659344;
 //BA.debugLineNum = 50659344;BA.debugLine="Return";
if (true) return "";
 };
 };
RDebugUtils.currentLine=50659348;
 //BA.debugLineNum = 50659348;BA.debugLine="If TxtTell.Text<>\"\"  Then";
if ((mostCurrent._txttell.getText()).equals("") == false) { 
RDebugUtils.currentLine=50659349;
 //BA.debugLineNum = 50659349;BA.debugLine="If MCode.Sf.Len(TxtTell.Text.Trim) <> 11 Then";
if (mostCurrent._mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvv1(mostCurrent._txttell.getText().trim())!=11) { 
RDebugUtils.currentLine=50659350;
 //BA.debugLineNum = 50659350;BA.debugLine="ToastMessageShow(\"تلفن ثابت را به طور کامل و ص";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("تلفن ثابت را به طور کامل و صحیح وارد نمایید"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=50659351;
 //BA.debugLineNum = 50659351;BA.debugLine="Return";
if (true) return "";
 };
 };
RDebugUtils.currentLine=50659356;
 //BA.debugLineNum = 50659356;BA.debugLine="If TxtAddress.Text = \"\" Then";
if ((mostCurrent._txtaddress.getText()).equals("")) { 
RDebugUtils.currentLine=50659357;
 //BA.debugLineNum = 50659357;BA.debugLine="ToastMessageShow(\"آدرس مشتری را وارد نمایید\",Tr";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("آدرس مشتری را وارد نمایید"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=50659358;
 //BA.debugLineNum = 50659358;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=50659360;
 //BA.debugLineNum = 50659360;BA.debugLine="If CheckSubGroup(GroupCodeSelect)=False Then";
if (_checksubgroup(BA.NumberToString(_groupcodeselect))==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=50659361;
 //BA.debugLineNum = 50659361;BA.debugLine="ToastMessageShow(\"امکان ثبت شخص جدید در گروهی ک";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("امکان ثبت شخص جدید در گروهی که زیر گروه دارد وجود ندارد , لطفا در زیر گروه این گروه مد نظر شما ثبت نمایید"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=50659362;
 //BA.debugLineNum = 50659362;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=50659365;
 //BA.debugLineNum = 50659365;BA.debugLine="SaveNewMoshtari";
_savenewmoshtari();
 } 
       catch (Exception e32) {
			processBA.setLastException(e32);RDebugUtils.currentLine=50659367;
 //BA.debugLineNum = 50659367;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("550659367",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=50659368;
 //BA.debugLineNum = 50659368;BA.debugLine="myCode.SendError(LastException, Activity.Title&\"";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-BtnSaveNewMoshtari_Click");
 };
RDebugUtils.currentLine=50659371;
 //BA.debugLineNum = 50659371;BA.debugLine="End Sub";
return "";
}
public static boolean  _checksubgroup(String _codegroup) throws Exception{
RDebugUtils.currentModule="act_newashkhas";
if (Debug.shouldDelegate(mostCurrent.activityBA, "checksubgroup", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "checksubgroup", new Object[] {_codegroup}));}
String _mc = "";
int _count = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
RDebugUtils.currentLine=50135040;
 //BA.debugLineNum = 50135040;BA.debugLine="Public Sub CheckSubGroup(CodeGroup As String) As B";
RDebugUtils.currentLine=50135041;
 //BA.debugLineNum = 50135041;BA.debugLine="Dim mc As String=CodeGroup";
_mc = _codegroup;
RDebugUtils.currentLine=50135042;
 //BA.debugLineNum = 50135042;BA.debugLine="Dim Count As Int = mc.Length + 3";
_count = (int) (_mc.length()+3);
RDebugUtils.currentLine=50135043;
 //BA.debugLineNum = 50135043;BA.debugLine="Dim Cu As Cursor=MCode.Result(\"Select FldC_Gorooh";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas where FldC_Gorooh Like '"+_mc+"%' And Length(FldC_Gorooh) = "+BA.NumberToString(_count)+" ORDER BY FldC_Gorooh");
RDebugUtils.currentLine=50135044;
 //BA.debugLineNum = 50135044;BA.debugLine="If Cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=50135045;
 //BA.debugLineNum = 50135045;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=50135047;
 //BA.debugLineNum = 50135047;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=50135048;
 //BA.debugLineNum = 50135048;BA.debugLine="End Sub";
return false;
}
public static String  _savenewmoshtari() throws Exception{
RDebugUtils.currentModule="act_newashkhas";
if (Debug.shouldDelegate(mostCurrent.activityBA, "savenewmoshtari", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "savenewmoshtari", null));}
String _time = "";
boolean _chek = false;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
RDebugUtils.currentLine=50855936;
 //BA.debugLineNum = 50855936;BA.debugLine="Sub SaveNewMoshtari";
RDebugUtils.currentLine=50855938;
 //BA.debugLineNum = 50855938;BA.debugLine="Try";
try {RDebugUtils.currentLine=50855939;
 //BA.debugLineNum = 50855939;BA.debugLine="Dim Time As String = DateTime.Time(DateTime.Now)";
_time = anywheresoftware.b4a.keywords.Common.DateTime.Time(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
RDebugUtils.currentLine=50855944;
 //BA.debugLineNum = 50855944;BA.debugLine="Dim Chek As Boolean";
_chek = false;
RDebugUtils.currentLine=50855945;
 //BA.debugLineNum = 50855945;BA.debugLine="If ChGps.Checked=True Then";
if (mostCurrent._chgps.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=50855946;
 //BA.debugLineNum = 50855946;BA.debugLine="Chek=True";
_chek = anywheresoftware.b4a.keywords.Common.True;
 }else {
RDebugUtils.currentLine=50855948;
 //BA.debugLineNum = 50855948;BA.debugLine="If Lat.Length>0 And Lon.Length>0 Then";
if (mostCurrent._lat.length()>0 && mostCurrent._lon.length()>0) { 
RDebugUtils.currentLine=50855949;
 //BA.debugLineNum = 50855949;BA.debugLine="Chek=True";
_chek = anywheresoftware.b4a.keywords.Common.True;
 }else {
RDebugUtils.currentLine=50855951;
 //BA.debugLineNum = 50855951;BA.debugLine="ToastMessageShow(\"تا دریافت موقعیت مکانی کمی ص";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("تا دریافت موقعیت مکانی کمی صبر کنید"),anywheresoftware.b4a.keywords.Common.True);
 };
 };
RDebugUtils.currentLine=50855954;
 //BA.debugLineNum = 50855954;BA.debugLine="If	GroupCodeSelect=0  Then";
if (_groupcodeselect==0) { 
RDebugUtils.currentLine=50855955;
 //BA.debugLineNum = 50855955;BA.debugLine="ToastMessageShow(\"لطفا گروه مورد نظر را انتخاب";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("لطفا گروه مورد نظر را انتخاب کنید"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=50855956;
 //BA.debugLineNum = 50855956;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=50855958;
 //BA.debugLineNum = 50855958;BA.debugLine="If myCode.Check_Is_Null(MCode.C_Visitor) Or MCod";
if (mostCurrent._mycode._check_is_null /*boolean*/ (mostCurrent.activityBA,mostCurrent._mcode._c_visitor /*String*/ ) || (mostCurrent._mcode._c_visitor /*String*/ ).equals("")) { 
RDebugUtils.currentLine=50855959;
 //BA.debugLineNum = 50855959;BA.debugLine="Dim Cu As Cursor =MCode.Result(\"Select * From T";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblSetting");
RDebugUtils.currentLine=50855960;
 //BA.debugLineNum = 50855960;BA.debugLine="Cu.Position=0";
_cu.setPosition((int) (0));
RDebugUtils.currentLine=50855961;
 //BA.debugLineNum = 50855961;BA.debugLine="MCode.C_Visitor = Cu.GetString(\"FldC_Visitor\")";
mostCurrent._mcode._c_visitor /*String*/  = _cu.GetString("FldC_Visitor");
RDebugUtils.currentLine=50855962;
 //BA.debugLineNum = 50855962;BA.debugLine="MCode.N_Visitor = Cu.GetString(\"FldN_Visitor\")";
mostCurrent._mcode._n_visitor /*String*/  = _cu.GetString("FldN_Visitor");
RDebugUtils.currentLine=50855963;
 //BA.debugLineNum = 50855963;BA.debugLine="myCode.SendError(\"SaveNewMoshtari NoSetCodeVisi";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,"SaveNewMoshtari NoSetCodeVisitor",BA.ObjectToString(mostCurrent._activity.getTitle())+"-SaveNewMoshtari");
 };
RDebugUtils.currentLine=50855965;
 //BA.debugLineNum = 50855965;BA.debugLine="If Chek=True Then";
if (_chek==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=50855966;
 //BA.debugLineNum = 50855966;BA.debugLine="If Lat = \"\" Or Lon = \"\" Then";
if ((mostCurrent._lat).equals("") || (mostCurrent._lon).equals("")) { 
RDebugUtils.currentLine=50855967;
 //BA.debugLineNum = 50855967;BA.debugLine="Lat = \"\"";
mostCurrent._lat = "";
RDebugUtils.currentLine=50855968;
 //BA.debugLineNum = 50855968;BA.debugLine="Lon = \"\"";
mostCurrent._lon = "";
 };
RDebugUtils.currentLine=50855973;
 //BA.debugLineNum = 50855973;BA.debugLine="If TxtC_Meli.Text = \"\" Then TxtC_Meli.Text = \"\"";
if ((mostCurrent._txtc_meli.getText()).equals("")) { 
mostCurrent._txtc_meli.setText(BA.ObjectToCharSequence(""));};
RDebugUtils.currentLine=50855974;
 //BA.debugLineNum = 50855974;BA.debugLine="If TxtTell.Text<>\"\"  Then";
if ((mostCurrent._txttell.getText()).equals("") == false) { 
RDebugUtils.currentLine=50855975;
 //BA.debugLineNum = 50855975;BA.debugLine="If CheckTekrariMoshtari2(TxtTell.text)  Then";
if (_checktekrarimoshtari2(mostCurrent._txttell.getText())) { 
RDebugUtils.currentLine=50855976;
 //BA.debugLineNum = 50855976;BA.debugLine="ToastMessageShow(\"شماره تلفن وارد شده تکراری";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("شماره تلفن وارد شده تکراری می باشد"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=50855977;
 //BA.debugLineNum = 50855977;BA.debugLine="Return";
if (true) return "";
 };
 };
RDebugUtils.currentLine=50855980;
 //BA.debugLineNum = 50855980;BA.debugLine="If TxtMob.Text<>\"\" Then";
if ((mostCurrent._txtmob.getText()).equals("") == false) { 
RDebugUtils.currentLine=50855981;
 //BA.debugLineNum = 50855981;BA.debugLine="If CheckTekrariMoshtari2(TxtMob.text) Then";
if (_checktekrarimoshtari2(mostCurrent._txtmob.getText())) { 
RDebugUtils.currentLine=50855982;
 //BA.debugLineNum = 50855982;BA.debugLine="ToastMessageShow(\"شماره موبایل وارد شده تکرار";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("شماره موبایل وارد شده تکراری می باشد"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=50855983;
 //BA.debugLineNum = 50855983;BA.debugLine="Return";
if (true) return "";
 };
 };
RDebugUtils.currentLine=50855987;
 //BA.debugLineNum = 50855987;BA.debugLine="If MCode.UpdateShakhs=False Then";
if (mostCurrent._mcode._updateshakhs /*boolean*/ ==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=50855992;
 //BA.debugLineNum = 50855992;BA.debugLine="MCode.SaveUpdate(\"Insert Into TblAshkhasNew (F";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Insert Into TblAshkhasNew (FldCodeTafzili,FldSharheTafzili,FldVisitor,FldTell,FldMobile,FldAddress,FldCodeGroup,FldC_Meli,FldC_Posti,FldShomarehesab,FldLat,FldLon) Values ('"+mostCurrent._txtcodemostari.getText()+"', '"+mostCurrent._txtname.getText()+"', '"+mostCurrent._mcode._c_visitor /*String*/ +"', '"+mostCurrent._txttell.getText()+"','"+mostCurrent._txtmob.getText()+"','"+mostCurrent._txtaddress.getText()+"','"+BA.NumberToString(_groupcodeselect)+"','"+mostCurrent._txtc_meli.getText()+"','"+mostCurrent._txtc_posti.getText()+"','"+mostCurrent._txtshomarehesab.getText()+"','"+mostCurrent._txtlat.getText()+"','"+mostCurrent._txtlon.getText()+"')");
RDebugUtils.currentLine=50855997;
 //BA.debugLineNum = 50855997;BA.debugLine="MCode.SaveUpdate(\"Insert Into TblAshkhas (fldC";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Insert Into TblAshkhas (fldCodetafzili,fldSharheTafzili,fldVisitor,fldTell,FldMobile,FldC_Meli,FldC_Posti,FldShomarehesab,fldAdress,fldMande,fldCodeGroup,fldNameGroup,FldLat,FldLon,FldSync) Values ('"+mostCurrent._txtcodemostari.getText()+"', '"+mostCurrent._txtname.getText()+"', '"+mostCurrent._mcode._c_visitor /*String*/ +"', '"+mostCurrent._txttell.getText()+"','"+mostCurrent._txtmob.getText()+"','"+mostCurrent._txtc_meli.getText()+"','"+mostCurrent._txtc_posti.getText()+"','"+mostCurrent._txtshomarehesab.getText()+"','"+mostCurrent._txtaddress.getText()+"','0','"+BA.NumberToString(_groupcodeselect)+"','"+mostCurrent._groupnameselect+"','"+mostCurrent._txtlat.getText()+"','"+mostCurrent._txtlon.getText()+"','False')");
RDebugUtils.currentLine=50856003;
 //BA.debugLineNum = 50856003;BA.debugLine="MCode.C_Tafzili=TxtCodeMostari.Text";
mostCurrent._mcode._c_tafzili /*String*/  = mostCurrent._txtcodemostari.getText();
RDebugUtils.currentLine=50856004;
 //BA.debugLineNum = 50856004;BA.debugLine="CallSub3(Service_Server,\"SaveLocationMoshtari\"";
anywheresoftware.b4a.keywords.Common.CallSubDebug3(processBA,(Object)(mostCurrent._service_server.getObject()),"SaveLocationMoshtari",(Object)(mostCurrent._txtlat.getText()),(Object)(mostCurrent._txtlon.getText()));
RDebugUtils.currentLine=50856005;
 //BA.debugLineNum = 50856005;BA.debugLine="ToastMessageShow(\"اطلاعات با موفقیت ثبت گردید\"";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("اطلاعات با موفقیت ثبت گردید"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=50856006;
 //BA.debugLineNum = 50856006;BA.debugLine="GPS1.stop";
_gps1.Stop();
RDebugUtils.currentLine=50856007;
 //BA.debugLineNum = 50856007;BA.debugLine="Activity_KeyPress(KeyCodes.KEYCODE_BACK)";
_activity_keypress(anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK);
 }else {
RDebugUtils.currentLine=50856011;
 //BA.debugLineNum = 50856011;BA.debugLine="UpdateAshkhasNew";
_updateashkhasnew();
RDebugUtils.currentLine=50856013;
 //BA.debugLineNum = 50856013;BA.debugLine="UpdateAshkhas";
_updateashkhas();
 };
RDebugUtils.currentLine=50856023;
 //BA.debugLineNum = 50856023;BA.debugLine="ToastMessageShow(\"اطلاعات با موفقیت ثبت گردید\",";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("اطلاعات با موفقیت ثبت گردید"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=50856024;
 //BA.debugLineNum = 50856024;BA.debugLine="GPS1.stop";
_gps1.Stop();
RDebugUtils.currentLine=50856025;
 //BA.debugLineNum = 50856025;BA.debugLine="Activity_KeyPress(KeyCodes.KEYCODE_BACK)";
_activity_keypress(anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK);
 };
 } 
       catch (Exception e59) {
			processBA.setLastException(e59);RDebugUtils.currentLine=50856028;
 //BA.debugLineNum = 50856028;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("550856028",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=50856029;
 //BA.debugLineNum = 50856029;BA.debugLine="myCode.SendError(LastException, Activity.Title&\"";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-SaveNewMoshtari");
 };
RDebugUtils.currentLine=50856031;
 //BA.debugLineNum = 50856031;BA.debugLine="End Sub";
return "";
}
public static void  _btnsearchgroup1_click() throws Exception{
RDebugUtils.currentModule="act_newashkhas";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnsearchgroup1_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "btnsearchgroup1_click", null); return;}
ResumableSub_btnSearchGroup1_Click rsub = new ResumableSub_btnSearchGroup1_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_btnSearchGroup1_Click extends BA.ResumableSub {
public ResumableSub_btnSearchGroup1_Click(ir.parsikhesab.pakhsh.act_newashkhas parent) {
this.parent = parent;
}
ir.parsikhesab.pakhsh.act_newashkhas parent;
Object _rs = null;
int _result = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_newashkhas";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=51511298;
 //BA.debugLineNum = 51511298;BA.debugLine="Panel1.BringToFront";
parent.mostCurrent._panel1.BringToFront();
RDebugUtils.currentLine=51511299;
 //BA.debugLineNum = 51511299;BA.debugLine="Panel1.Visible=True";
parent.mostCurrent._panel1.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=51511300;
 //BA.debugLineNum = 51511300;BA.debugLine="SearchTemplate1.SearchField.HintText=\"نام گروه مو";
parent.mostCurrent._searchtemplate1._searchfield /*ir.parsikhesab.pakhsh.b4xfloattextfield*/ ._hinttext /*String*/  = "نام گروه مورد نظر را جستجو نمایید";
RDebugUtils.currentLine=51511301;
 //BA.debugLineNum = 51511301;BA.debugLine="SearchTemplate1.SearchField.lblClear.Text=\"\"";
parent.mostCurrent._searchtemplate1._searchfield /*ir.parsikhesab.pakhsh.b4xfloattextfield*/ ._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=51511302;
 //BA.debugLineNum = 51511302;BA.debugLine="SearchTemplate1.SearchField.lblV.Text=\"\"";
parent.mostCurrent._searchtemplate1._searchfield /*ir.parsikhesab.pakhsh.b4xfloattextfield*/ ._lblv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=51511303;
 //BA.debugLineNum = 51511303;BA.debugLine="SearchTemplate1.SearchField.Update";
parent.mostCurrent._searchtemplate1._searchfield /*ir.parsikhesab.pakhsh.b4xfloattextfield*/ ._update /*String*/ (null);
RDebugUtils.currentLine=51511304;
 //BA.debugLineNum = 51511304;BA.debugLine="Dim rs As Object = Dialog.ShowTemplate(SearchTemp";
_rs = parent.mostCurrent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(parent.mostCurrent._searchtemplate1),(Object)(""),(Object)(""),(Object)("انصراف"));
RDebugUtils.currentLine=51511305;
 //BA.debugLineNum = 51511305;BA.debugLine="AnimateDialog(Dialog, \"right\")";
_animatedialog(parent.mostCurrent._dialog,"right");
RDebugUtils.currentLine=51511306;
 //BA.debugLineNum = 51511306;BA.debugLine="Wait For (rs) Complete (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_newashkhas", "btnsearchgroup1_click"), _rs);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=51511307;
 //BA.debugLineNum = 51511307;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_result==parent.mostCurrent._xui.DialogResponse_Positive) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=51511311;
 //BA.debugLineNum = 51511311;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select FldC_Gor";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = parent.mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas where FldN_Gorooh='"+parent.mostCurrent._searchtemplate1._selecteditem /*String*/ +"'");
RDebugUtils.currentLine=51511312;
 //BA.debugLineNum = 51511312;BA.debugLine="Cu.Position=0";
_cu.setPosition((int) (0));
RDebugUtils.currentLine=51511313;
 //BA.debugLineNum = 51511313;BA.debugLine="GroupCodeSelect1 =  Cu.GetString(\"FldC_Gorooh\")";
parent.mostCurrent._groupcodeselect1 = _cu.GetString("FldC_Gorooh");
RDebugUtils.currentLine=51511314;
 //BA.debugLineNum = 51511314;BA.debugLine="GroupNameSelect1 =  Cu.GetString(\"FldN_Gorooh\")";
parent.mostCurrent._groupnameselect1 = _cu.GetString("FldN_Gorooh");
RDebugUtils.currentLine=51511315;
 //BA.debugLineNum = 51511315;BA.debugLine="Log(\"کد گروه اشخاص : \"&Cu.GetString(\"FldC_Gorooh";
anywheresoftware.b4a.keywords.Common.LogImpl("551511315","کد گروه اشخاص : "+_cu.GetString("FldC_Gorooh"),0);
RDebugUtils.currentLine=51511316;
 //BA.debugLineNum = 51511316;BA.debugLine="Log(\"نام گروه اشخاص : \"&Cu.GetString(\"FldN_Goroo";
anywheresoftware.b4a.keywords.Common.LogImpl("551511316","نام گروه اشخاص : "+_cu.GetString("FldN_Gorooh"),0);
RDebugUtils.currentLine=51511321;
 //BA.debugLineNum = 51511321;BA.debugLine="NiceSpinner.Text=GroupNameSelect1";
parent.mostCurrent._nicespinner.setText((Object)(parent.mostCurrent._groupnameselect1));
RDebugUtils.currentLine=51511322;
 //BA.debugLineNum = 51511322;BA.debugLine="NiceSpinner_item_clicked1";
_nicespinner_item_clicked1();
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=51511327;
 //BA.debugLineNum = 51511327;BA.debugLine="GroupCodeSelect1=0";
parent.mostCurrent._groupcodeselect1 = BA.NumberToString(0);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=51511329;
 //BA.debugLineNum = 51511329;BA.debugLine="Panel1.Visible=False";
parent.mostCurrent._panel1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=51511330;
 //BA.debugLineNum = 51511330;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _nicespinner_item_clicked1() throws Exception{
RDebugUtils.currentModule="act_newashkhas";
if (Debug.shouldDelegate(mostCurrent.activityBA, "nicespinner_item_clicked1", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "nicespinner_item_clicked1", null));}
String _mc = "";
int _count = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
int _i = 0;
RDebugUtils.currentLine=49872896;
 //BA.debugLineNum = 49872896;BA.debugLine="Sub NiceSpinner_item_clicked1";
RDebugUtils.currentLine=49872903;
 //BA.debugLineNum = 49872903;BA.debugLine="Log(\"ns1 item \" & NiceSpinner.Text &\" selected\")";
anywheresoftware.b4a.keywords.Common.LogImpl("549872903","ns1 item "+mostCurrent._nicespinner.getText()+" selected",0);
RDebugUtils.currentLine=49872905;
 //BA.debugLineNum = 49872905;BA.debugLine="Try";
try {RDebugUtils.currentLine=49872906;
 //BA.debugLineNum = 49872906;BA.debugLine="Key.HideKeyboard";
mostCurrent._key.HideKeyboard(mostCurrent.activityBA);
RDebugUtils.currentLine=49872910;
 //BA.debugLineNum = 49872910;BA.debugLine="lstSearchGroup2.Clear";
mostCurrent._lstsearchgroup2.Clear();
RDebugUtils.currentLine=49872911;
 //BA.debugLineNum = 49872911;BA.debugLine="GroupCodeSelect2=\"0\"";
mostCurrent._groupcodeselect2 = "0";
RDebugUtils.currentLine=49872912;
 //BA.debugLineNum = 49872912;BA.debugLine="GroupNameSelect2=\"\"";
mostCurrent._groupnameselect2 = "";
RDebugUtils.currentLine=49872913;
 //BA.debugLineNum = 49872913;BA.debugLine="Dim mc As String=GroupCodeSelect1";
_mc = mostCurrent._groupcodeselect1;
RDebugUtils.currentLine=49872915;
 //BA.debugLineNum = 49872915;BA.debugLine="Dim Count As Int = 3";
_count = (int) (3);
RDebugUtils.currentLine=49872916;
 //BA.debugLineNum = 49872916;BA.debugLine="querySearch2=\"Select FldC_Gorooh,FldN_Gorooh Fro";
mostCurrent._querysearch2 = "Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas where FldC_Gorooh Like '"+_mc+"%' And Length(FldC_Gorooh) > "+BA.NumberToString(_count)+" ORDER BY FldC_Gorooh";
RDebugUtils.currentLine=49872917;
 //BA.debugLineNum = 49872917;BA.debugLine="Dim Cu As Cursor=MCode.Result(querySearch2)";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,mostCurrent._querysearch2);
RDebugUtils.currentLine=49872918;
 //BA.debugLineNum = 49872918;BA.debugLine="If Cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=49872921;
 //BA.debugLineNum = 49872921;BA.debugLine="For i=0 To Cu.RowCount-1";
{
final int step12 = 1;
final int limit12 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit12 ;_i = _i + step12 ) {
RDebugUtils.currentLine=49872922;
 //BA.debugLineNum = 49872922;BA.debugLine="Cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=49872924;
 //BA.debugLineNum = 49872924;BA.debugLine="lstSearchGroup2.Add(Cu.GetString(\"FldN_Gorooh\"";
mostCurrent._lstsearchgroup2.Add((Object)(_cu.GetString("FldN_Gorooh")));
 }
};
 };
RDebugUtils.currentLine=49872930;
 //BA.debugLineNum = 49872930;BA.debugLine="Log(\"CodeGroupSelect1: \"&GroupCodeSelect1)";
anywheresoftware.b4a.keywords.Common.LogImpl("549872930","CodeGroupSelect1: "+mostCurrent._groupcodeselect1,0);
RDebugUtils.currentLine=49872931;
 //BA.debugLineNum = 49872931;BA.debugLine="GroupCodeSelect=GroupCodeSelect1";
_groupcodeselect = (long)(Double.parseDouble(mostCurrent._groupcodeselect1));
RDebugUtils.currentLine=49872935;
 //BA.debugLineNum = 49872935;BA.debugLine="SearchTemplate2.SetItems(lstSearchGroup2)";
mostCurrent._searchtemplate2._setitems /*Object*/ (null,mostCurrent._lstsearchgroup2);
RDebugUtils.currentLine=49872936;
 //BA.debugLineNum = 49872936;BA.debugLine="SearchTemplate2.GetPanel(Dialog).BringToFront";
mostCurrent._searchtemplate2._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,mostCurrent._dialog).BringToFront();
 } 
       catch (Exception e22) {
			processBA.setLastException(e22);RDebugUtils.currentLine=49872939;
 //BA.debugLineNum = 49872939;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("549872939",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=49872940;
 //BA.debugLineNum = 49872940;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-NiceSpinner_ItemClick");
 };
RDebugUtils.currentLine=49872942;
 //BA.debugLineNum = 49872942;BA.debugLine="End Sub";
return "";
}
public static void  _btnsearchgroup2_click() throws Exception{
RDebugUtils.currentModule="act_newashkhas";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnsearchgroup2_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "btnsearchgroup2_click", null); return;}
ResumableSub_btnSearchGroup2_Click rsub = new ResumableSub_btnSearchGroup2_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_btnSearchGroup2_Click extends BA.ResumableSub {
public ResumableSub_btnSearchGroup2_Click(ir.parsikhesab.pakhsh.act_newashkhas parent) {
this.parent = parent;
}
ir.parsikhesab.pakhsh.act_newashkhas parent;
Object _rs = null;
int _result = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_newashkhas";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=51576833;
 //BA.debugLineNum = 51576833;BA.debugLine="If lstSearchGroup2.Size=0 Then";
if (true) break;

case 1:
//if
this.state = 4;
if (parent.mostCurrent._lstsearchgroup2.getSize()==0) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=51576834;
 //BA.debugLineNum = 51576834;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=51576836;
 //BA.debugLineNum = 51576836;BA.debugLine="Panel1.BringToFront";
parent.mostCurrent._panel1.BringToFront();
RDebugUtils.currentLine=51576837;
 //BA.debugLineNum = 51576837;BA.debugLine="Panel1.Visible=True";
parent.mostCurrent._panel1.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=51576838;
 //BA.debugLineNum = 51576838;BA.debugLine="SearchTemplate2.SearchField.HintText=\"نام گروه مو";
parent.mostCurrent._searchtemplate2._searchfield /*ir.parsikhesab.pakhsh.b4xfloattextfield*/ ._hinttext /*String*/  = "نام گروه مورد نظر را جستجو نمایید";
RDebugUtils.currentLine=51576839;
 //BA.debugLineNum = 51576839;BA.debugLine="SearchTemplate2.SearchField.lblClear.Text=\"\"";
parent.mostCurrent._searchtemplate2._searchfield /*ir.parsikhesab.pakhsh.b4xfloattextfield*/ ._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=51576840;
 //BA.debugLineNum = 51576840;BA.debugLine="SearchTemplate2.SearchField.lblV.Text=\"\"";
parent.mostCurrent._searchtemplate2._searchfield /*ir.parsikhesab.pakhsh.b4xfloattextfield*/ ._lblv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=51576841;
 //BA.debugLineNum = 51576841;BA.debugLine="SearchTemplate2.SearchField.Update";
parent.mostCurrent._searchtemplate2._searchfield /*ir.parsikhesab.pakhsh.b4xfloattextfield*/ ._update /*String*/ (null);
RDebugUtils.currentLine=51576842;
 //BA.debugLineNum = 51576842;BA.debugLine="Dim rs As Object = Dialog.ShowTemplate(SearchTemp";
_rs = parent.mostCurrent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(parent.mostCurrent._searchtemplate2),(Object)(""),(Object)(""),(Object)("انصراف"));
RDebugUtils.currentLine=51576843;
 //BA.debugLineNum = 51576843;BA.debugLine="AnimateDialog(Dialog, \"right\")";
_animatedialog(parent.mostCurrent._dialog,"right");
RDebugUtils.currentLine=51576844;
 //BA.debugLineNum = 51576844;BA.debugLine="Wait For (rs) Complete (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_newashkhas", "btnsearchgroup2_click"), _rs);
this.state = 11;
return;
case 11:
//C
this.state = 5;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=51576845;
 //BA.debugLineNum = 51576845;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
if (true) break;

case 5:
//if
this.state = 10;
if (_result==parent.mostCurrent._xui.DialogResponse_Positive) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 10;
RDebugUtils.currentLine=51576856;
 //BA.debugLineNum = 51576856;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From T";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = parent.mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblGoroohAshkhas where FldN_Gorooh='"+parent.mostCurrent._searchtemplate2._selecteditem /*String*/ +"'");
RDebugUtils.currentLine=51576863;
 //BA.debugLineNum = 51576863;BA.debugLine="Cu.Position=0";
_cu.setPosition((int) (0));
RDebugUtils.currentLine=51576864;
 //BA.debugLineNum = 51576864;BA.debugLine="GroupCodeSelect2 =  Cu.GetString(\"FldC_Gorooh\")";
parent.mostCurrent._groupcodeselect2 = _cu.GetString("FldC_Gorooh");
RDebugUtils.currentLine=51576865;
 //BA.debugLineNum = 51576865;BA.debugLine="GroupNameSelect2 =  Cu.GetString(\"FldN_Gorooh\")";
parent.mostCurrent._groupnameselect2 = _cu.GetString("FldN_Gorooh");
RDebugUtils.currentLine=51576866;
 //BA.debugLineNum = 51576866;BA.debugLine="Log(\"کد گروه اشخاص : \"&Cu.GetString(\"FldC_Gorooh";
anywheresoftware.b4a.keywords.Common.LogImpl("551576866","کد گروه اشخاص : "+_cu.GetString("FldC_Gorooh"),0);
RDebugUtils.currentLine=51576867;
 //BA.debugLineNum = 51576867;BA.debugLine="Log(\"نام گروه اشخاص : \"&Cu.GetString(\"FldN_Goroo";
anywheresoftware.b4a.keywords.Common.LogImpl("551576867","نام گروه اشخاص : "+_cu.GetString("FldN_Gorooh"),0);
RDebugUtils.currentLine=51576875;
 //BA.debugLineNum = 51576875;BA.debugLine="NiceSpinner1.Text=GroupNameSelect2";
parent.mostCurrent._nicespinner1.setText((Object)(parent.mostCurrent._groupnameselect2));
RDebugUtils.currentLine=51576876;
 //BA.debugLineNum = 51576876;BA.debugLine="NiceSpinner1_item_clicked1";
_nicespinner1_item_clicked1();
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=51576879;
 //BA.debugLineNum = 51576879;BA.debugLine="GroupCodeSelect2=0";
parent.mostCurrent._groupcodeselect2 = BA.NumberToString(0);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=51576881;
 //BA.debugLineNum = 51576881;BA.debugLine="Panel1.Visible=False";
parent.mostCurrent._panel1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=51576882;
 //BA.debugLineNum = 51576882;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _nicespinner1_item_clicked1() throws Exception{
RDebugUtils.currentModule="act_newashkhas";
if (Debug.shouldDelegate(mostCurrent.activityBA, "nicespinner1_item_clicked1", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "nicespinner1_item_clicked1", null));}
String _mc = "";
int _count = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
int _i = 0;
RDebugUtils.currentLine=49938432;
 //BA.debugLineNum = 49938432;BA.debugLine="Sub NiceSpinner1_item_clicked1";
RDebugUtils.currentLine=49938439;
 //BA.debugLineNum = 49938439;BA.debugLine="Log(\"ns2 item \" & NiceSpinner1.Text &\" selected\")";
anywheresoftware.b4a.keywords.Common.LogImpl("549938439","ns2 item "+mostCurrent._nicespinner1.getText()+" selected",0);
RDebugUtils.currentLine=49938440;
 //BA.debugLineNum = 49938440;BA.debugLine="Try";
try {RDebugUtils.currentLine=49938443;
 //BA.debugLineNum = 49938443;BA.debugLine="Dim mc As String=GroupCodeSelect2";
_mc = mostCurrent._groupcodeselect2;
RDebugUtils.currentLine=49938445;
 //BA.debugLineNum = 49938445;BA.debugLine="Dim Count As Int =3";
_count = (int) (3);
RDebugUtils.currentLine=49938446;
 //BA.debugLineNum = 49938446;BA.debugLine="querySearch2=\"Select FldC_Gorooh,FldN_Gorooh Fro";
mostCurrent._querysearch2 = "Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas where FldC_Gorooh Like '"+_mc+"%' And Length(FldC_Gorooh) > "+BA.NumberToString(_count)+" ORDER BY FldC_Gorooh";
RDebugUtils.currentLine=49938447;
 //BA.debugLineNum = 49938447;BA.debugLine="Dim Cu As Cursor=MCode.Result(querySearch2)";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,mostCurrent._querysearch2);
RDebugUtils.currentLine=49938448;
 //BA.debugLineNum = 49938448;BA.debugLine="If Cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=49938450;
 //BA.debugLineNum = 49938450;BA.debugLine="lstSearchGroup2.Clear";
mostCurrent._lstsearchgroup2.Clear();
RDebugUtils.currentLine=49938452;
 //BA.debugLineNum = 49938452;BA.debugLine="For i=0 To Cu.RowCount-1";
{
final int step9 = 1;
final int limit9 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=49938453;
 //BA.debugLineNum = 49938453;BA.debugLine="Cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=49938454;
 //BA.debugLineNum = 49938454;BA.debugLine="lstSearchGroup2.Add(Cu.GetString(\"FldN_Gorooh\"";
mostCurrent._lstsearchgroup2.Add((Object)(_cu.GetString("FldN_Gorooh")));
 }
};
 };
RDebugUtils.currentLine=49938458;
 //BA.debugLineNum = 49938458;BA.debugLine="GroupCodeSelect=GroupCodeSelect2";
_groupcodeselect = (long)(Double.parseDouble(mostCurrent._groupcodeselect2));
RDebugUtils.currentLine=49938459;
 //BA.debugLineNum = 49938459;BA.debugLine="Log(\"CodeGroupSelect2: \"&GroupCodeSelect2)";
anywheresoftware.b4a.keywords.Common.LogImpl("549938459","CodeGroupSelect2: "+mostCurrent._groupcodeselect2,0);
RDebugUtils.currentLine=49938461;
 //BA.debugLineNum = 49938461;BA.debugLine="Log(\"lstSearchGroup2: \"& lstSearchGroup2.Size)";
anywheresoftware.b4a.keywords.Common.LogImpl("549938461","lstSearchGroup2: "+BA.NumberToString(mostCurrent._lstsearchgroup2.getSize()),0);
RDebugUtils.currentLine=49938462;
 //BA.debugLineNum = 49938462;BA.debugLine="SearchTemplate2.SetItems(lstSearchGroup2)";
mostCurrent._searchtemplate2._setitems /*Object*/ (null,mostCurrent._lstsearchgroup2);
RDebugUtils.currentLine=49938463;
 //BA.debugLineNum = 49938463;BA.debugLine="SearchTemplate2.GetPanel(Dialog).BringToFront";
mostCurrent._searchtemplate2._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,mostCurrent._dialog).BringToFront();
 } 
       catch (Exception e20) {
			processBA.setLastException(e20);RDebugUtils.currentLine=49938465;
 //BA.debugLineNum = 49938465;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("549938465",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=49938466;
 //BA.debugLineNum = 49938466;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-NiceSpinner1_ItemClick");
 };
RDebugUtils.currentLine=49938468;
 //BA.debugLineNum = 49938468;BA.debugLine="End Sub";
return "";
}
public static boolean  _checktekrarimoshtari(String _strnumber) throws Exception{
RDebugUtils.currentModule="act_newashkhas";
if (Debug.shouldDelegate(mostCurrent.activityBA, "checktekrarimoshtari", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "checktekrarimoshtari", new Object[] {_strnumber}));}
boolean _b = false;
String _count = "";
RDebugUtils.currentLine=50790400;
 //BA.debugLineNum = 50790400;BA.debugLine="Sub CheckTekrariMoshtari(strNumber As String) As B";
RDebugUtils.currentLine=50790401;
 //BA.debugLineNum = 50790401;BA.debugLine="Dim b As Boolean=False";
_b = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=50790402;
 //BA.debugLineNum = 50790402;BA.debugLine="Dim count As String=0";
_count = BA.NumberToString(0);
RDebugUtils.currentLine=50790404;
 //BA.debugLineNum = 50790404;BA.debugLine="If MCode.UpdateShakhs=True Then";
if (mostCurrent._mcode._updateshakhs /*boolean*/ ==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=50790406;
 //BA.debugLineNum = 50790406;BA.debugLine="count=MCode.SingleResult(\"select count(fldCodeta";
_count = BA.ObjectToString(mostCurrent._mcode._singleresult /*Object*/ (mostCurrent.activityBA,"select count(fldCodetafzili) as fldCodetafzili from TblAshkhas where fldTell='"+_strnumber+"' and fldCodetafzili='"+mostCurrent._mcode._c_tafzili /*String*/ +"'"));
RDebugUtils.currentLine=50790408;
 //BA.debugLineNum = 50790408;BA.debugLine="count=myCode.Is_Null_adad(count)";
_count = mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_count);
RDebugUtils.currentLine=50790409;
 //BA.debugLineNum = 50790409;BA.debugLine="If count>0 Then";
if ((double)(Double.parseDouble(_count))>0) { 
RDebugUtils.currentLine=50790410;
 //BA.debugLineNum = 50790410;BA.debugLine="b=True";
_b = anywheresoftware.b4a.keywords.Common.True;
 };
RDebugUtils.currentLine=50790413;
 //BA.debugLineNum = 50790413;BA.debugLine="count=MCode.SingleResult(\"select count(fldCodeta";
_count = BA.ObjectToString(mostCurrent._mcode._singleresult /*Object*/ (mostCurrent.activityBA,"select count(fldCodetafzili) as fldCodetafzili from TblAshkhas where FldMobile='"+_strnumber+"' and fldCodetafzili='"+mostCurrent._mcode._c_tafzili /*String*/ +"'"));
RDebugUtils.currentLine=50790414;
 //BA.debugLineNum = 50790414;BA.debugLine="count=myCode.Is_Null_adad(count)";
_count = mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_count);
RDebugUtils.currentLine=50790415;
 //BA.debugLineNum = 50790415;BA.debugLine="If count>0 Then";
if ((double)(Double.parseDouble(_count))>0) { 
RDebugUtils.currentLine=50790416;
 //BA.debugLineNum = 50790416;BA.debugLine="b=True";
_b = anywheresoftware.b4a.keywords.Common.True;
 };
 }else {
RDebugUtils.currentLine=50790421;
 //BA.debugLineNum = 50790421;BA.debugLine="count=MCode.SingleResult(\"select count(fldCodeta";
_count = BA.ObjectToString(mostCurrent._mcode._singleresult /*Object*/ (mostCurrent.activityBA,"select count(fldCodetafzili) as fldCodetafzili from TblAshkhas where fldTell='"+_strnumber+"'"));
RDebugUtils.currentLine=50790422;
 //BA.debugLineNum = 50790422;BA.debugLine="count=myCode.Is_Null_adad(count)";
_count = mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_count);
RDebugUtils.currentLine=50790423;
 //BA.debugLineNum = 50790423;BA.debugLine="If count>0 Then";
if ((double)(Double.parseDouble(_count))>0) { 
RDebugUtils.currentLine=50790424;
 //BA.debugLineNum = 50790424;BA.debugLine="b=True";
_b = anywheresoftware.b4a.keywords.Common.True;
 };
RDebugUtils.currentLine=50790427;
 //BA.debugLineNum = 50790427;BA.debugLine="count=MCode.SingleResult(\"select count(fldCodeta";
_count = BA.ObjectToString(mostCurrent._mcode._singleresult /*Object*/ (mostCurrent.activityBA,"select count(fldCodetafzili) as fldCodetafzili from TblAshkhas where FldMobile='"+_strnumber+"'"));
RDebugUtils.currentLine=50790428;
 //BA.debugLineNum = 50790428;BA.debugLine="count=myCode.Is_Null_adad(count)";
_count = mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_count);
RDebugUtils.currentLine=50790429;
 //BA.debugLineNum = 50790429;BA.debugLine="If count>0 Then";
if ((double)(Double.parseDouble(_count))>0) { 
RDebugUtils.currentLine=50790430;
 //BA.debugLineNum = 50790430;BA.debugLine="b=True";
_b = anywheresoftware.b4a.keywords.Common.True;
 };
 };
RDebugUtils.currentLine=50790436;
 //BA.debugLineNum = 50790436;BA.debugLine="Return b";
if (true) return _b;
RDebugUtils.currentLine=50790437;
 //BA.debugLineNum = 50790437;BA.debugLine="End Sub";
return false;
}
public static boolean  _checktekrarimoshtari2(String _strnumber) throws Exception{
RDebugUtils.currentModule="act_newashkhas";
if (Debug.shouldDelegate(mostCurrent.activityBA, "checktekrarimoshtari2", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "checktekrarimoshtari2", new Object[] {_strnumber}));}
boolean _b = false;
String _count = "";
RDebugUtils.currentLine=50724864;
 //BA.debugLineNum = 50724864;BA.debugLine="Sub CheckTekrariMoshtari2(strNumber As String) As";
RDebugUtils.currentLine=50724865;
 //BA.debugLineNum = 50724865;BA.debugLine="Dim b As Boolean=False";
_b = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=50724866;
 //BA.debugLineNum = 50724866;BA.debugLine="Dim count As String=0";
_count = BA.NumberToString(0);
RDebugUtils.currentLine=50724867;
 //BA.debugLineNum = 50724867;BA.debugLine="If MCode.UpdateShakhs=True Then";
if (mostCurrent._mcode._updateshakhs /*boolean*/ ==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=50724869;
 //BA.debugLineNum = 50724869;BA.debugLine="count=MCode.SingleResult(\"select count(fldCodeTa";
_count = BA.ObjectToString(mostCurrent._mcode._singleresult /*Object*/ (mostCurrent.activityBA,"select count(fldCodeTafzili) from tblDaftarcheTell where fldShomare='"+_strnumber+"' and fldCodeTafzili<>'"+mostCurrent._mcode._c_tafzili /*String*/ +"'"));
RDebugUtils.currentLine=50724871;
 //BA.debugLineNum = 50724871;BA.debugLine="count=myCode.Is_Null_adad(count)";
_count = mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_count);
RDebugUtils.currentLine=50724872;
 //BA.debugLineNum = 50724872;BA.debugLine="If count>0 Then";
if ((double)(Double.parseDouble(_count))>0) { 
RDebugUtils.currentLine=50724873;
 //BA.debugLineNum = 50724873;BA.debugLine="b=True";
_b = anywheresoftware.b4a.keywords.Common.True;
 };
 }else {
RDebugUtils.currentLine=50724877;
 //BA.debugLineNum = 50724877;BA.debugLine="count=MCode.SingleResult(\"select count(fldCodeTa";
_count = BA.ObjectToString(mostCurrent._mcode._singleresult /*Object*/ (mostCurrent.activityBA,"select count(fldCodeTafzili) from tblDaftarcheTell where fldShomare='"+_strnumber+"'"));
RDebugUtils.currentLine=50724879;
 //BA.debugLineNum = 50724879;BA.debugLine="count=myCode.Is_Null_adad(count)";
_count = mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_count);
RDebugUtils.currentLine=50724880;
 //BA.debugLineNum = 50724880;BA.debugLine="If count>0 Then";
if ((double)(Double.parseDouble(_count))>0) { 
RDebugUtils.currentLine=50724881;
 //BA.debugLineNum = 50724881;BA.debugLine="b=True";
_b = anywheresoftware.b4a.keywords.Common.True;
 };
 };
RDebugUtils.currentLine=50724886;
 //BA.debugLineNum = 50724886;BA.debugLine="Return b";
if (true) return _b;
RDebugUtils.currentLine=50724887;
 //BA.debugLineNum = 50724887;BA.debugLine="End Sub";
return false;
}
public static String  _chgps_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="act_newashkhas";
if (Debug.shouldDelegate(mostCurrent.activityBA, "chgps_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "chgps_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=51052544;
 //BA.debugLineNum = 51052544;BA.debugLine="Sub ChGps_CheckedChange(Checked As Boolean)";
RDebugUtils.currentLine=51052545;
 //BA.debugLineNum = 51052545;BA.debugLine="If Checked=True Then";
if (_checked==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=51052546;
 //BA.debugLineNum = 51052546;BA.debugLine="TxtLat.Enabled=True";
mostCurrent._txtlat.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=51052547;
 //BA.debugLineNum = 51052547;BA.debugLine="TxtLon.Enabled=True";
mostCurrent._txtlon.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 }else {
RDebugUtils.currentLine=51052549;
 //BA.debugLineNum = 51052549;BA.debugLine="TxtLat.Enabled=False";
mostCurrent._txtlat.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=51052550;
 //BA.debugLineNum = 51052550;BA.debugLine="TxtLon.Enabled=False";
mostCurrent._txtlon.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=51052552;
 //BA.debugLineNum = 51052552;BA.debugLine="End Sub";
return "";
}
public static String  _loadacspgroohashkas() throws Exception{
RDebugUtils.currentModule="act_newashkhas";
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
RDebugUtils.currentLine=49741824;
 //BA.debugLineNum = 49741824;BA.debugLine="Sub LoadAcSpGroohAshkas";
RDebugUtils.currentLine=49741825;
 //BA.debugLineNum = 49741825;BA.debugLine="Try";
try {RDebugUtils.currentLine=49741826;
 //BA.debugLineNum = 49741826;BA.debugLine="Dim lstTemp As List";
_lsttemp = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=49741827;
 //BA.debugLineNum = 49741827;BA.debugLine="lstTemp.Initialize";
_lsttemp.Initialize();
RDebugUtils.currentLine=49741829;
 //BA.debugLineNum = 49741829;BA.debugLine="lstGroup1.Add(\"همه گروه ها\")";
mostCurrent._lstgroup1.Add((Object)("همه گروه ها"));
RDebugUtils.currentLine=49741830;
 //BA.debugLineNum = 49741830;BA.debugLine="querySearch1=\"Select FldC_Gorooh,FldN_Gorooh Fro";
mostCurrent._querysearch1 = "Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas ";
RDebugUtils.currentLine=49741831;
 //BA.debugLineNum = 49741831;BA.debugLine="Dim Dt1 As Cursor = MCode.Result(querySearch1)";
_dt1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_dt1 = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,mostCurrent._querysearch1);
RDebugUtils.currentLine=49741832;
 //BA.debugLineNum = 49741832;BA.debugLine="For i=0 To Dt1.RowCount-1";
{
final int step7 = 1;
final int limit7 = (int) (_dt1.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
RDebugUtils.currentLine=49741833;
 //BA.debugLineNum = 49741833;BA.debugLine="Dt1.Position=i";
_dt1.setPosition(_i);
RDebugUtils.currentLine=49741834;
 //BA.debugLineNum = 49741834;BA.debugLine="Dim code As String=Dt1.GetString(\"FldC_Gorooh\")";
_code = _dt1.GetString("FldC_Gorooh").substring((int) (0),(int) (3));
RDebugUtils.currentLine=49741835;
 //BA.debugLineNum = 49741835;BA.debugLine="Dim indexTemp As String=lstTemp.IndexOf(code)";
_indextemp = BA.NumberToString(_lsttemp.IndexOf((Object)(_code)));
RDebugUtils.currentLine=49741836;
 //BA.debugLineNum = 49741836;BA.debugLine="If indexTemp=-1 Then";
if ((_indextemp).equals(BA.NumberToString(-1))) { 
RDebugUtils.currentLine=49741837;
 //BA.debugLineNum = 49741837;BA.debugLine="Dim dt2 As Cursor =MCode.Result(\"Select * From";
_dt2 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_dt2 = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblGoroohAshkhas where FldC_Gorooh Like '"+_code+"%'");
RDebugUtils.currentLine=49741838;
 //BA.debugLineNum = 49741838;BA.debugLine="If dt2.RowCount>0 Then";
if (_dt2.getRowCount()>0) { 
RDebugUtils.currentLine=49741839;
 //BA.debugLineNum = 49741839;BA.debugLine="For j=0 To dt2.RowCount-1";
{
final int step14 = 1;
final int limit14 = (int) (_dt2.getRowCount()-1);
_j = (int) (0) ;
for (;_j <= limit14 ;_j = _j + step14 ) {
RDebugUtils.currentLine=49741840;
 //BA.debugLineNum = 49741840;BA.debugLine="dt2.Position=j";
_dt2.setPosition(_j);
RDebugUtils.currentLine=49741841;
 //BA.debugLineNum = 49741841;BA.debugLine="Dim code2 As String=dt2.GetString(\"FldC_Goro";
_code2 = _dt2.GetString("FldC_Gorooh").substring((int) (0),(int) (3));
RDebugUtils.currentLine=49741843;
 //BA.debugLineNum = 49741843;BA.debugLine="Dim count As Long";
_count = 0L;
RDebugUtils.currentLine=49741844;
 //BA.debugLineNum = 49741844;BA.debugLine="Dim MinCode As String =MCode.SingleResult(\"S";
_mincode = BA.ObjectToString(mostCurrent._mcode._singleresult /*Object*/ (mostCurrent.activityBA,"Select min(FldC_Gorooh) From TblGoroohAshkhas where FldC_Gorooh Like '"+_code2+"%'"));
RDebugUtils.currentLine=49741845;
 //BA.debugLineNum = 49741845;BA.debugLine="Dim sizeCode As Long=dt2.GetString(\"FldC_Gor";
_sizecode = (long) (_dt2.GetString("FldC_Gorooh").length());
RDebugUtils.currentLine=49741846;
 //BA.debugLineNum = 49741846;BA.debugLine="If MinCode.Length=sizeCode Then";
if (_mincode.length()==_sizecode) { 
RDebugUtils.currentLine=49741847;
 //BA.debugLineNum = 49741847;BA.debugLine="Dim Item As AdapterGoroohAshkhas";
_item = new ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas();
RDebugUtils.currentLine=49741848;
 //BA.debugLineNum = 49741848;BA.debugLine="Item.FldC_Gorooh= dt2.GetString(\"FldC_Goroo";
_item.FldC_Gorooh /*String*/  = _dt2.GetString("FldC_Gorooh");
RDebugUtils.currentLine=49741849;
 //BA.debugLineNum = 49741849;BA.debugLine="Item.FldN_Gorooh= dt2.GetString(\"FldN_Goroo";
_item.FldN_Gorooh /*String*/  = _dt2.GetString("FldN_Gorooh");
RDebugUtils.currentLine=49741850;
 //BA.debugLineNum = 49741850;BA.debugLine="OriginalListGoroohAshkhas1.Add(Item)";
mostCurrent._originallistgoroohashkhas1.Add((Object)(_item));
RDebugUtils.currentLine=49741851;
 //BA.debugLineNum = 49741851;BA.debugLine="lstGroup1.Add(Item.FldN_Gorooh)";
mostCurrent._lstgroup1.Add((Object)(_item.FldN_Gorooh /*String*/ ));
RDebugUtils.currentLine=49741852;
 //BA.debugLineNum = 49741852;BA.debugLine="lstSearchGroup1.Add(Item.FldN_Gorooh)";
mostCurrent._lstsearchgroup1.Add((Object)(_item.FldN_Gorooh /*String*/ ));
 }else {
RDebugUtils.currentLine=49741855;
 //BA.debugLineNum = 49741855;BA.debugLine="If MinCode.Length=sizeCode Then";
if (_mincode.length()==_sizecode) { 
RDebugUtils.currentLine=49741856;
 //BA.debugLineNum = 49741856;BA.debugLine="For Each a As AdapterGoroohAshkhas In Orig";
{
final anywheresoftware.b4a.BA.IterableList group29 = mostCurrent._originallistgoroohashkhas1;
final int groupLen29 = group29.getSize()
;int index29 = 0;
;
for (; index29 < groupLen29;index29++){
_a = (ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas)(group29.Get(index29));
RDebugUtils.currentLine=49741857;
 //BA.debugLineNum = 49741857;BA.debugLine="If a.FldC_Gorooh.SubString2(0,3)=code2 Th";
if ((_a.FldC_Gorooh /*String*/ .substring((int) (0),(int) (3))).equals(_code2)) { 
RDebugUtils.currentLine=49741858;
 //BA.debugLineNum = 49741858;BA.debugLine="count=1";
_count = (long) (1);
RDebugUtils.currentLine=49741859;
 //BA.debugLineNum = 49741859;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=49741862;
 //BA.debugLineNum = 49741862;BA.debugLine="If count =0 Then";
if (_count==0) { 
RDebugUtils.currentLine=49741863;
 //BA.debugLineNum = 49741863;BA.debugLine="Dim NameGroup,CodeGroup As String";
_namegroup = "";
_codegroup = "";
RDebugUtils.currentLine=49741864;
 //BA.debugLineNum = 49741864;BA.debugLine="CodeGroup=MinCode";
_codegroup = _mincode;
RDebugUtils.currentLine=49741865;
 //BA.debugLineNum = 49741865;BA.debugLine="NameGroup=MCode.SingleResult(\"Select FldN";
_namegroup = BA.ObjectToString(mostCurrent._mcode._singleresult /*Object*/ (mostCurrent.activityBA,"Select FldN_Gorooh From TblGoroohAshkhas where FldC_Gorooh='"+_mincode+"'"));
RDebugUtils.currentLine=49741866;
 //BA.debugLineNum = 49741866;BA.debugLine="Dim Item As AdapterGoroohAshkhas";
_item = new ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas();
RDebugUtils.currentLine=49741867;
 //BA.debugLineNum = 49741867;BA.debugLine="Item.FldC_Gorooh= CodeGroup";
_item.FldC_Gorooh /*String*/  = _codegroup;
RDebugUtils.currentLine=49741868;
 //BA.debugLineNum = 49741868;BA.debugLine="Item.FldN_Gorooh= NameGroup";
_item.FldN_Gorooh /*String*/  = _namegroup;
RDebugUtils.currentLine=49741869;
 //BA.debugLineNum = 49741869;BA.debugLine="OriginalListGoroohAshkhas1.Add(Item)";
mostCurrent._originallistgoroohashkhas1.Add((Object)(_item));
RDebugUtils.currentLine=49741870;
 //BA.debugLineNum = 49741870;BA.debugLine="lstGroup1.Add(Item.FldN_Gorooh)";
mostCurrent._lstgroup1.Add((Object)(_item.FldN_Gorooh /*String*/ ));
RDebugUtils.currentLine=49741871;
 //BA.debugLineNum = 49741871;BA.debugLine="lstSearchGroup1.Add(Item.FldN_Gorooh)";
mostCurrent._lstsearchgroup1.Add((Object)(_item.FldN_Gorooh /*String*/ ));
 };
 }else {
 };
 };
 }
};
 };
RDebugUtils.currentLine=49741889;
 //BA.debugLineNum = 49741889;BA.debugLine="lstTemp.Add(code)";
_lsttemp.Add((Object)(_code));
 };
 }
};
RDebugUtils.currentLine=49741897;
 //BA.debugLineNum = 49741897;BA.debugLine="Log(\"lstSearchGroup1: \"& lstSearchGroup1.Size)";
anywheresoftware.b4a.keywords.Common.LogImpl("549741897","lstSearchGroup1: "+BA.NumberToString(mostCurrent._lstsearchgroup1.getSize()),0);
RDebugUtils.currentLine=49741898;
 //BA.debugLineNum = 49741898;BA.debugLine="SearchTemplate1.SetItems(lstSearchGroup1)";
mostCurrent._searchtemplate1._setitems /*Object*/ (null,mostCurrent._lstsearchgroup1);
RDebugUtils.currentLine=49741900;
 //BA.debugLineNum = 49741900;BA.debugLine="SearchTemplate1.GetPanel(Dialog).BringToFront";
mostCurrent._searchtemplate1._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,mostCurrent._dialog).BringToFront();
RDebugUtils.currentLine=49741924;
 //BA.debugLineNum = 49741924;BA.debugLine="NiceSpinner.attachDataSource(lstGroup1)";
mostCurrent._nicespinner.attachDataSource((java.util.List)(mostCurrent._lstgroup1.getObject()));
 } 
       catch (Exception e59) {
			processBA.setLastException(e59);RDebugUtils.currentLine=49741926;
 //BA.debugLineNum = 49741926;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("549741926",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=49741927;
 //BA.debugLineNum = 49741927;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-LoadAcSpGroohAshkas");
 };
RDebugUtils.currentLine=49741929;
 //BA.debugLineNum = 49741929;BA.debugLine="End Sub";
return "";
}
public static String  _loadupdateshakhs() throws Exception{
RDebugUtils.currentModule="act_newashkhas";
if (Debug.shouldDelegate(mostCurrent.activityBA, "loadupdateshakhs", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "loadupdateshakhs", null));}
RDebugUtils.currentLine=49676288;
 //BA.debugLineNum = 49676288;BA.debugLine="Sub LoadUpdateShakhs";
RDebugUtils.currentLine=49676289;
 //BA.debugLineNum = 49676289;BA.debugLine="TxtName.Text=shakhs.SharhTafzili";
mostCurrent._txtname.setText(BA.ObjectToCharSequence(_shakhs.SharhTafzili /*String*/ ));
RDebugUtils.currentLine=49676290;
 //BA.debugLineNum = 49676290;BA.debugLine="TxtTell.Text=shakhs.Tell";
mostCurrent._txttell.setText(BA.ObjectToCharSequence(_shakhs.Tell /*String*/ ));
RDebugUtils.currentLine=49676291;
 //BA.debugLineNum = 49676291;BA.debugLine="TxtAddress.Text=shakhs.Address";
mostCurrent._txtaddress.setText(BA.ObjectToCharSequence(_shakhs.Address /*String*/ ));
RDebugUtils.currentLine=49676292;
 //BA.debugLineNum = 49676292;BA.debugLine="TxtC_Meli.Text=myCode.Is_Null(shakhs.FldC_Meli)";
mostCurrent._txtc_meli.setText(BA.ObjectToCharSequence(mostCurrent._mycode._is_null /*String*/ (mostCurrent.activityBA,_shakhs.FldC_Meli /*String*/ )));
RDebugUtils.currentLine=49676293;
 //BA.debugLineNum = 49676293;BA.debugLine="TxtC_Posti.Text=myCode.Is_Null(shakhs.FldC_Posti)";
mostCurrent._txtc_posti.setText(BA.ObjectToCharSequence(mostCurrent._mycode._is_null /*String*/ (mostCurrent.activityBA,_shakhs.FldC_Posti /*String*/ )));
RDebugUtils.currentLine=49676294;
 //BA.debugLineNum = 49676294;BA.debugLine="TxtShomarehesab.Text=myCode.Is_Null(shakhs.FldSho";
mostCurrent._txtshomarehesab.setText(BA.ObjectToCharSequence(mostCurrent._mycode._is_null /*String*/ (mostCurrent.activityBA,_shakhs.FldShomarehesab /*String*/ )));
RDebugUtils.currentLine=49676295;
 //BA.debugLineNum = 49676295;BA.debugLine="TxtMob.Text=shakhs.FldMobile";
mostCurrent._txtmob.setText(BA.ObjectToCharSequence(_shakhs.FldMobile /*String*/ ));
RDebugUtils.currentLine=49676296;
 //BA.debugLineNum = 49676296;BA.debugLine="TxtCodeMostari.Text= shakhs.CodeTafzili";
mostCurrent._txtcodemostari.setText(BA.ObjectToCharSequence(_shakhs.CodeTafzili /*String*/ ));
RDebugUtils.currentLine=49676298;
 //BA.debugLineNum = 49676298;BA.debugLine="lblTitle.Text=\"ویرایش مشتری جدید\"";
mostCurrent._lbltitle.setText(BA.ObjectToCharSequence("ویرایش مشتری جدید"));
RDebugUtils.currentLine=49676301;
 //BA.debugLineNum = 49676301;BA.debugLine="TypeSelectGroup=\"Update\"";
mostCurrent._typeselectgroup = "Update";
RDebugUtils.currentLine=49676321;
 //BA.debugLineNum = 49676321;BA.debugLine="End Sub";
return "";
}
public static void  _getlocation() throws Exception{
RDebugUtils.currentModule="act_newashkhas";
if (Debug.shouldDelegate(mostCurrent.activityBA, "getlocation", false))
	 {Debug.delegate(mostCurrent.activityBA, "getlocation", null); return;}
ResumableSub_GetLocation rsub = new ResumableSub_GetLocation(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_GetLocation extends BA.ResumableSub {
public ResumableSub_GetLocation(ir.parsikhesab.pakhsh.act_newashkhas parent) {
this.parent = parent;
}
ir.parsikhesab.pakhsh.act_newashkhas parent;
boolean _available = false;
igolub.fused.b4a.location.LocationResultWrapper _result = null;
igolub.fused.b4a.location.android.location.LocationFWrapper _lastlocation = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_newashkhas";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=50528257;
 //BA.debugLineNum = 50528257;BA.debugLine="If Fused.IsLocationEnabledInSettings Then";
if (true) break;

case 1:
//if
this.state = 20;
if (parent.mostCurrent._fused.getIsLocationEnabledInSettings()) { 
this.state = 3;
}else {
this.state = 19;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=50528258;
 //BA.debugLineNum = 50528258;BA.debugLine="Fused.GetLocationAvailability";
parent.mostCurrent._fused.GetLocationAvailability();
RDebugUtils.currentLine=50528260;
 //BA.debugLineNum = 50528260;BA.debugLine="Wait For FusedLocation_LocationAvailabilityReque";
anywheresoftware.b4a.keywords.Common.WaitFor("fusedlocation_locationavailabilityrequestcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_newashkhas", "getlocation"), null);
this.state = 21;
return;
case 21:
//C
this.state = 4;
_available = (Boolean) result[0];
;
RDebugUtils.currentLine=50528261;
 //BA.debugLineNum = 50528261;BA.debugLine="Log(\"LocationAvailable=\" & Available)";
anywheresoftware.b4a.keywords.Common.LogImpl("550528261","LocationAvailable="+BA.ObjectToString(_available),0);
RDebugUtils.currentLine=50528262;
 //BA.debugLineNum = 50528262;BA.debugLine="If Available Then";
if (true) break;

case 4:
//if
this.state = 17;
if (_available) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=50528263;
 //BA.debugLineNum = 50528263;BA.debugLine="Fused.GetLastLocation";
parent.mostCurrent._fused.GetLastLocation();
RDebugUtils.currentLine=50528264;
 //BA.debugLineNum = 50528264;BA.debugLine="Wait For FusedLocation_LocationRequestCompleted";
anywheresoftware.b4a.keywords.Common.WaitFor("fusedlocation_locationrequestcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_newashkhas", "getlocation"), null);
this.state = 22;
return;
case 22:
//C
this.state = 7;
_result = (igolub.fused.b4a.location.LocationResultWrapper) result[0];
;
RDebugUtils.currentLine=50528265;
 //BA.debugLineNum = 50528265;BA.debugLine="If Result.Status=LocationResult.STATUS_SUCCESSF";
if (true) break;

case 7:
//if
this.state = 16;
if (_result.getStatus()==parent.mostCurrent._locationresult.STATUS_SUCCESSFUL) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=50528266;
 //BA.debugLineNum = 50528266;BA.debugLine="If Result.Location.IsInitialized Then";
if (true) break;

case 10:
//if
this.state = 15;
if (_result.getLocation().IsInitialized()) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 15;
RDebugUtils.currentLine=50528267;
 //BA.debugLineNum = 50528267;BA.debugLine="Dim LastLocation As LocationF = Result.Locati";
_lastlocation = new igolub.fused.b4a.location.android.location.LocationFWrapper();
_lastlocation = _result.getLocation();
RDebugUtils.currentLine=50528268;
 //BA.debugLineNum = 50528268;BA.debugLine="Log(\"LastLocation Latitude = \" & LastLocation";
anywheresoftware.b4a.keywords.Common.LogImpl("550528268","LastLocation Latitude = "+BA.NumberToString(_lastlocation.getLatitude()),0);
RDebugUtils.currentLine=50528269;
 //BA.debugLineNum = 50528269;BA.debugLine="Log(\"LastLocation Longitude = \" & LastLocatio";
anywheresoftware.b4a.keywords.Common.LogImpl("550528269","LastLocation Longitude = "+BA.NumberToString(_lastlocation.getLongitude()),0);
RDebugUtils.currentLine=50528271;
 //BA.debugLineNum = 50528271;BA.debugLine="TxtLat.text = LastLocation.Latitude";
parent.mostCurrent._txtlat.setText(BA.ObjectToCharSequence(_lastlocation.getLatitude()));
RDebugUtils.currentLine=50528272;
 //BA.debugLineNum = 50528272;BA.debugLine="TxtLon.text = LastLocation.Longitude";
parent.mostCurrent._txtlon.setText(BA.ObjectToCharSequence(_lastlocation.getLongitude()));
 if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=50528274;
 //BA.debugLineNum = 50528274;BA.debugLine="Log(\"Unknown last location\")";
anywheresoftware.b4a.keywords.Common.LogImpl("550528274","Unknown last location",0);
 if (true) break;

case 15:
//C
this.state = 16;
;
 if (true) break;

case 16:
//C
this.state = 17;
;
 if (true) break;

case 17:
//C
this.state = 20;
;
 if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=50528279;
 //BA.debugLineNum = 50528279;BA.debugLine="MsgboxAsync(\"Location is turned off in devices's";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Location is turned off in devices's settings. Turn it on."),BA.ObjectToCharSequence("Warning"),processBA);
RDebugUtils.currentLine=50528280;
 //BA.debugLineNum = 50528280;BA.debugLine="StartActivity(Fused.LocationSettingsIntent)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._fused.getLocationSettingsIntent().getObject()));
 if (true) break;

case 20:
//C
this.state = -1;
;
RDebugUtils.currentLine=50528282;
 //BA.debugLineNum = 50528282;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _gps1_locationchanged(anywheresoftware.b4a.gps.LocationWrapper _location1) throws Exception{
RDebugUtils.currentModule="act_newashkhas";
if (Debug.shouldDelegate(mostCurrent.activityBA, "gps1_locationchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "gps1_locationchanged", new Object[] {_location1}));}
RDebugUtils.currentLine=50200576;
 //BA.debugLineNum = 50200576;BA.debugLine="Sub GPS1_LocationChanged (Location1 As Location)";
RDebugUtils.currentLine=50200581;
 //BA.debugLineNum = 50200581;BA.debugLine="GPS1.Stop";
_gps1.Stop();
RDebugUtils.currentLine=50200582;
 //BA.debugLineNum = 50200582;BA.debugLine="End Sub";
return "";
}
public static String  _gps1_userenabled(boolean _enabled) throws Exception{
RDebugUtils.currentModule="act_newashkhas";
if (Debug.shouldDelegate(mostCurrent.activityBA, "gps1_userenabled", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "gps1_userenabled", new Object[] {_enabled}));}
RDebugUtils.currentLine=49545216;
 //BA.debugLineNum = 49545216;BA.debugLine="Sub GPS1_UserEnabled (Enabled As Boolean)";
RDebugUtils.currentLine=49545217;
 //BA.debugLineNum = 49545217;BA.debugLine="If Enabled=True Then";
if (_enabled==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=49545218;
 //BA.debugLineNum = 49545218;BA.debugLine="t1.Enabled=True";
_t1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=49545220;
 //BA.debugLineNum = 49545220;BA.debugLine="End Sub";
return "";
}
public static String  _loadacspgroohashkas2() throws Exception{
RDebugUtils.currentModule="act_newashkhas";
if (Debug.shouldDelegate(mostCurrent.activityBA, "loadacspgroohashkas2", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "loadacspgroohashkas2", null));}
anywheresoftware.b4a.objects.collections.List _lsttemp = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
int _i = 0;
String _name = "";
RDebugUtils.currentLine=49807360;
 //BA.debugLineNum = 49807360;BA.debugLine="Sub LoadAcSpGroohAshkas2";
RDebugUtils.currentLine=49807361;
 //BA.debugLineNum = 49807361;BA.debugLine="Try";
try {RDebugUtils.currentLine=49807362;
 //BA.debugLineNum = 49807362;BA.debugLine="Dim lstTemp As List";
_lsttemp = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=49807363;
 //BA.debugLineNum = 49807363;BA.debugLine="lstTemp.Initialize";
_lsttemp.Initialize();
RDebugUtils.currentLine=49807364;
 //BA.debugLineNum = 49807364;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From T";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblGoroohAshkhas ");
RDebugUtils.currentLine=49807365;
 //BA.debugLineNum = 49807365;BA.debugLine="For i=0 To Cu.RowCount-1";
{
final int step5 = 1;
final int limit5 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=49807366;
 //BA.debugLineNum = 49807366;BA.debugLine="Cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=49807367;
 //BA.debugLineNum = 49807367;BA.debugLine="Dim Name As String =  Cu.GetString(\"FldN_Gorooh";
_name = _cu.GetString("FldN_Gorooh");
RDebugUtils.currentLine=49807368;
 //BA.debugLineNum = 49807368;BA.debugLine="lstTemp.Add(Name)";
_lsttemp.Add((Object)(_name));
 }
};
RDebugUtils.currentLine=49807370;
 //BA.debugLineNum = 49807370;BA.debugLine="SearchTemplate1.SetItems(lstTemp)";
mostCurrent._searchtemplate1._setitems /*Object*/ (null,_lsttemp);
RDebugUtils.currentLine=49807371;
 //BA.debugLineNum = 49807371;BA.debugLine="SearchTemplate1.GetPanel(Dialog).BringToFront";
mostCurrent._searchtemplate1._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,mostCurrent._dialog).BringToFront();
 } 
       catch (Exception e13) {
			processBA.setLastException(e13);RDebugUtils.currentLine=49807462;
 //BA.debugLineNum = 49807462;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("549807462",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=49807463;
 //BA.debugLineNum = 49807463;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-LoadAcSpGroohAshkas");
 };
RDebugUtils.currentLine=49807465;
 //BA.debugLineNum = 49807465;BA.debugLine="End Sub";
return "";
}
public static void  _mapfragment1_ready() throws Exception{
RDebugUtils.currentModule="act_newashkhas";
if (Debug.shouldDelegate(mostCurrent.activityBA, "mapfragment1_ready", false))
	 {Debug.delegate(mostCurrent.activityBA, "mapfragment1_ready", null); return;}
ResumableSub_MapFragment1_Ready rsub = new ResumableSub_MapFragment1_Ready(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_MapFragment1_Ready extends BA.ResumableSub {
public ResumableSub_MapFragment1_Ready(ir.parsikhesab.pakhsh.act_newashkhas parent) {
this.parent = parent;
}
ir.parsikhesab.pakhsh.act_newashkhas parent;
String _permission = "";
boolean _result = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_newashkhas";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=50462723;
 //BA.debugLineNum = 50462723;BA.debugLine="Try";
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
RDebugUtils.currentLine=50462724;
 //BA.debugLineNum = 50462724;BA.debugLine="gmap = MapFragment1.GetMap";
parent.mostCurrent._gmap = parent.mostCurrent._mapfragment1.GetMap();
RDebugUtils.currentLine=50462725;
 //BA.debugLineNum = 50462725;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_ACCESS_FINE_LOC";
parent.mostCurrent._rp.CheckAndRequest(processBA,parent.mostCurrent._rp.PERMISSION_ACCESS_FINE_LOCATION);
RDebugUtils.currentLine=50462726;
 //BA.debugLineNum = 50462726;BA.debugLine="Wait For Activity_PermissionResult (Permission A";
anywheresoftware.b4a.keywords.Common.WaitFor("activity_permissionresult", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_newashkhas", "mapfragment1_ready"), null);
this.state = 13;
return;
case 13:
//C
this.state = 4;
_permission = (String) result[0];
_result = (Boolean) result[1];
;
RDebugUtils.currentLine=50462727;
 //BA.debugLineNum = 50462727;BA.debugLine="If Result Then";
if (true) break;

case 4:
//if
this.state = 9;
if (_result) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=50462728;
 //BA.debugLineNum = 50462728;BA.debugLine="gmap.MyLocationEnabled = True";
parent.mostCurrent._gmap.setMyLocationEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=50462732;
 //BA.debugLineNum = 50462732;BA.debugLine="Sleep(200)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_newashkhas", "mapfragment1_ready"),(int) (200));
this.state = 14;
return;
case 14:
//C
this.state = 9;
;
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=50462741;
 //BA.debugLineNum = 50462741;BA.debugLine="Log(\"No permission!\")";
anywheresoftware.b4a.keywords.Common.LogImpl("550462741","No permission!",0);
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
RDebugUtils.currentLine=50462744;
 //BA.debugLineNum = 50462744;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("550462744",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=50462745;
 //BA.debugLineNum = 50462745;BA.debugLine="myCode.SendError(LastException, Activity.Title&\"";
parent.mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(parent.mostCurrent._activity.getTitle())+"-MapFragment1_Ready");
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=50462747;
 //BA.debugLineNum = 50462747;BA.debugLine="End Sub";
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
public static String  _nicespinner_item_clicked() throws Exception{
RDebugUtils.currentModule="act_newashkhas";
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
RDebugUtils.currentLine=50003968;
 //BA.debugLineNum = 50003968;BA.debugLine="Sub NiceSpinner_item_clicked";
RDebugUtils.currentLine=50003969;
 //BA.debugLineNum = 50003969;BA.debugLine="Dim Position As Int=NiceSpinner.SelectedIndex";
_position = mostCurrent._nicespinner.getSelectedIndex();
RDebugUtils.currentLine=50003970;
 //BA.debugLineNum = 50003970;BA.debugLine="Log(\"ns1 item \" & NiceSpinner.SelectedIndex &\" se";
anywheresoftware.b4a.keywords.Common.LogImpl("550003970","ns1 item "+BA.NumberToString(mostCurrent._nicespinner.getSelectedIndex())+" selected",0);
RDebugUtils.currentLine=50003971;
 //BA.debugLineNum = 50003971;BA.debugLine="Log(\"ns1 item \" & NiceSpinner.Text &\" selected\")";
anywheresoftware.b4a.keywords.Common.LogImpl("550003971","ns1 item "+mostCurrent._nicespinner.getText()+" selected",0);
RDebugUtils.currentLine=50003973;
 //BA.debugLineNum = 50003973;BA.debugLine="Try";
try {RDebugUtils.currentLine=50003974;
 //BA.debugLineNum = 50003974;BA.debugLine="Key.HideKeyboard";
mostCurrent._key.HideKeyboard(mostCurrent.activityBA);
RDebugUtils.currentLine=50003976;
 //BA.debugLineNum = 50003976;BA.debugLine="If Position = 0 Then";
if (_position==0) { 
RDebugUtils.currentLine=50003977;
 //BA.debugLineNum = 50003977;BA.debugLine="ListGoroohAshkhas1.Clear";
mostCurrent._listgoroohashkhas1.Clear();
RDebugUtils.currentLine=50003978;
 //BA.debugLineNum = 50003978;BA.debugLine="lstSelectedCodeGroupAshkhas.Clear";
mostCurrent._lstselectedcodegroupashkhas.Clear();
RDebugUtils.currentLine=50003980;
 //BA.debugLineNum = 50003980;BA.debugLine="lstGroup2.Clear";
mostCurrent._lstgroup2.Clear();
RDebugUtils.currentLine=50003982;
 //BA.debugLineNum = 50003982;BA.debugLine="lstGroup2.Add(\"همه گروه ها\")";
mostCurrent._lstgroup2.Add((Object)("همه گروه ها"));
RDebugUtils.currentLine=50003984;
 //BA.debugLineNum = 50003984;BA.debugLine="GroupCodeSelect1=\"0\"";
mostCurrent._groupcodeselect1 = "0";
RDebugUtils.currentLine=50003985;
 //BA.debugLineNum = 50003985;BA.debugLine="GroupNameSelect1=\"\"";
mostCurrent._groupnameselect1 = "";
RDebugUtils.currentLine=50003986;
 //BA.debugLineNum = 50003986;BA.debugLine="GroupCodeSelect2=\"0\"";
mostCurrent._groupcodeselect2 = "0";
RDebugUtils.currentLine=50003987;
 //BA.debugLineNum = 50003987;BA.debugLine="GroupNameSelect2=\"\"";
mostCurrent._groupnameselect2 = "";
 }else {
RDebugUtils.currentLine=50003990;
 //BA.debugLineNum = 50003990;BA.debugLine="Dim lst As List=OriginalListGoroohAshkhas1";
_lst = new anywheresoftware.b4a.objects.collections.List();
_lst = mostCurrent._originallistgoroohashkhas1;
RDebugUtils.currentLine=50003991;
 //BA.debugLineNum = 50003991;BA.debugLine="Log(NiceSpinner.SelectedIndex-1)";
anywheresoftware.b4a.keywords.Common.LogImpl("550003991",BA.NumberToString(mostCurrent._nicespinner.getSelectedIndex()-1),0);
RDebugUtils.currentLine=50003992;
 //BA.debugLineNum = 50003992;BA.debugLine="Dim index As Int=Position-1";
_index = (int) (_position-1);
RDebugUtils.currentLine=50003993;
 //BA.debugLineNum = 50003993;BA.debugLine="Dim Item As AdapterGoroohAshkhas=lst.Get(index)";
_item = (ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas)(_lst.Get(_index));
RDebugUtils.currentLine=50003994;
 //BA.debugLineNum = 50003994;BA.debugLine="Log(Item.FldN_Gorooh)";
anywheresoftware.b4a.keywords.Common.LogImpl("550003994",_item.FldN_Gorooh /*String*/ ,0);
RDebugUtils.currentLine=50003995;
 //BA.debugLineNum = 50003995;BA.debugLine="Log(Item.FldC_Gorooh)";
anywheresoftware.b4a.keywords.Common.LogImpl("550003995",_item.FldC_Gorooh /*String*/ ,0);
RDebugUtils.currentLine=50003996;
 //BA.debugLineNum = 50003996;BA.debugLine="GroupCodeSelect1=Item.FldC_Gorooh";
mostCurrent._groupcodeselect1 = _item.FldC_Gorooh /*String*/ ;
RDebugUtils.currentLine=50003997;
 //BA.debugLineNum = 50003997;BA.debugLine="GroupNameSelect1=Item.FldN_Gorooh";
mostCurrent._groupnameselect1 = _item.FldN_Gorooh /*String*/ ;
RDebugUtils.currentLine=50003998;
 //BA.debugLineNum = 50003998;BA.debugLine="GroupCodeSelect2=\"0\"";
mostCurrent._groupcodeselect2 = "0";
RDebugUtils.currentLine=50003999;
 //BA.debugLineNum = 50003999;BA.debugLine="GroupNameSelect2=\"\"";
mostCurrent._groupnameselect2 = "";
RDebugUtils.currentLine=50004000;
 //BA.debugLineNum = 50004000;BA.debugLine="Dim mc As String=Item.FldC_Gorooh";
_mc = _item.FldC_Gorooh /*String*/ ;
RDebugUtils.currentLine=50004002;
 //BA.debugLineNum = 50004002;BA.debugLine="Dim Count As Int = Item.FldC_Gorooh.Length + 3";
_count = (int) (_item.FldC_Gorooh /*String*/ .length()+3);
RDebugUtils.currentLine=50004003;
 //BA.debugLineNum = 50004003;BA.debugLine="Dim Cu As Cursor=MCode.Result(\"Select FldC_Goro";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas where FldC_Gorooh Like '"+_mc+"%' And Length(FldC_Gorooh) = "+BA.NumberToString(_count)+" ORDER BY FldC_Gorooh");
RDebugUtils.currentLine=50004004;
 //BA.debugLineNum = 50004004;BA.debugLine="If Cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=50004005;
 //BA.debugLineNum = 50004005;BA.debugLine="lstSelectedCodeGroupAshkhas.Clear";
mostCurrent._lstselectedcodegroupashkhas.Clear();
RDebugUtils.currentLine=50004007;
 //BA.debugLineNum = 50004007;BA.debugLine="lstGroup2.Clear";
mostCurrent._lstgroup2.Clear();
RDebugUtils.currentLine=50004009;
 //BA.debugLineNum = 50004009;BA.debugLine="lstGroup2.Add(\"همه گروه ها\")";
mostCurrent._lstgroup2.Add((Object)("همه گروه ها"));
RDebugUtils.currentLine=50004010;
 //BA.debugLineNum = 50004010;BA.debugLine="For i=0 To Cu.RowCount-1";
{
final int step33 = 1;
final int limit33 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit33 ;_i = _i + step33 ) {
RDebugUtils.currentLine=50004011;
 //BA.debugLineNum = 50004011;BA.debugLine="Cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=50004012;
 //BA.debugLineNum = 50004012;BA.debugLine="Dim Item As AdapterGoroohAshkhas";
_item = new ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas();
RDebugUtils.currentLine=50004013;
 //BA.debugLineNum = 50004013;BA.debugLine="Item.FldC_Gorooh=Cu.GetString(\"FldC_Gorooh\")";
_item.FldC_Gorooh /*String*/  = _cu.GetString("FldC_Gorooh");
RDebugUtils.currentLine=50004014;
 //BA.debugLineNum = 50004014;BA.debugLine="Item.FldN_Gorooh=Cu.GetString(\"FldN_Gorooh\")";
_item.FldN_Gorooh /*String*/  = _cu.GetString("FldN_Gorooh");
RDebugUtils.currentLine=50004015;
 //BA.debugLineNum = 50004015;BA.debugLine="ListGoroohAshkhas1.Add(Item)";
mostCurrent._listgoroohashkhas1.Add((Object)(_item));
RDebugUtils.currentLine=50004017;
 //BA.debugLineNum = 50004017;BA.debugLine="lstGroup2.Add(Cu.GetString(\"FldN_Gorooh\"))";
mostCurrent._lstgroup2.Add((Object)(_cu.GetString("FldN_Gorooh")));
 }
};
RDebugUtils.currentLine=50004020;
 //BA.debugLineNum = 50004020;BA.debugLine="NiceSpinner1.attachDataSource(lstGroup2)";
mostCurrent._nicespinner1.attachDataSource((java.util.List)(mostCurrent._lstgroup2.getObject()));
RDebugUtils.currentLine=50004022;
 //BA.debugLineNum = 50004022;BA.debugLine="lstSelectedCodeGroupAshkhas.Add(GroupCodeSelec";
mostCurrent._lstselectedcodegroupashkhas.Add((Object)(mostCurrent._groupcodeselect1));
 }else {
RDebugUtils.currentLine=50004024;
 //BA.debugLineNum = 50004024;BA.debugLine="ListGoroohAshkhas1.Clear";
mostCurrent._listgoroohashkhas1.Clear();
RDebugUtils.currentLine=50004025;
 //BA.debugLineNum = 50004025;BA.debugLine="lstSelectedCodeGroupAshkhas.Clear";
mostCurrent._lstselectedcodegroupashkhas.Clear();
RDebugUtils.currentLine=50004027;
 //BA.debugLineNum = 50004027;BA.debugLine="lstGroup2.Clear";
mostCurrent._lstgroup2.Clear();
RDebugUtils.currentLine=50004029;
 //BA.debugLineNum = 50004029;BA.debugLine="lstGroup2.Add(\"همه گروه ها\")";
mostCurrent._lstgroup2.Add((Object)("همه گروه ها"));
RDebugUtils.currentLine=50004030;
 //BA.debugLineNum = 50004030;BA.debugLine="GroupCodeSelect2=\"0\"";
mostCurrent._groupcodeselect2 = "0";
RDebugUtils.currentLine=50004031;
 //BA.debugLineNum = 50004031;BA.debugLine="GroupNameSelect2=\"\"";
mostCurrent._groupnameselect2 = "";
 };
 };
RDebugUtils.currentLine=50004037;
 //BA.debugLineNum = 50004037;BA.debugLine="Log(\"CodeGroupSelect1: \"&GroupCodeSelect1)";
anywheresoftware.b4a.keywords.Common.LogImpl("550004037","CodeGroupSelect1: "+mostCurrent._groupcodeselect1,0);
RDebugUtils.currentLine=50004038;
 //BA.debugLineNum = 50004038;BA.debugLine="GroupCodeSelect=GroupCodeSelect1";
_groupcodeselect = (long)(Double.parseDouble(mostCurrent._groupcodeselect1));
RDebugUtils.currentLine=50004039;
 //BA.debugLineNum = 50004039;BA.debugLine="Log(\"postion1: \"&Position)";
anywheresoftware.b4a.keywords.Common.LogImpl("550004039","postion1: "+BA.NumberToString(_position),0);
 } 
       catch (Exception e56) {
			processBA.setLastException(e56);RDebugUtils.currentLine=50004041;
 //BA.debugLineNum = 50004041;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("550004041",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=50004042;
 //BA.debugLineNum = 50004042;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-NiceSpinner_ItemClick");
 };
RDebugUtils.currentLine=50004044;
 //BA.debugLineNum = 50004044;BA.debugLine="End Sub";
return "";
}
public static String  _nicespinner1_item_clicked() throws Exception{
RDebugUtils.currentModule="act_newashkhas";
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
RDebugUtils.currentLine=50069504;
 //BA.debugLineNum = 50069504;BA.debugLine="Sub NiceSpinner1_item_clicked";
RDebugUtils.currentLine=50069505;
 //BA.debugLineNum = 50069505;BA.debugLine="Dim Position As Int=NiceSpinner1.SelectedIndex";
_position = mostCurrent._nicespinner1.getSelectedIndex();
RDebugUtils.currentLine=50069506;
 //BA.debugLineNum = 50069506;BA.debugLine="Dim Value As Object=NiceSpinner1.Text";
_value = (Object)(mostCurrent._nicespinner1.getText());
RDebugUtils.currentLine=50069507;
 //BA.debugLineNum = 50069507;BA.debugLine="Log(\"ns2 item \" & NiceSpinner1.SelectedIndex &\" s";
anywheresoftware.b4a.keywords.Common.LogImpl("550069507","ns2 item "+BA.NumberToString(mostCurrent._nicespinner1.getSelectedIndex())+" selected",0);
RDebugUtils.currentLine=50069508;
 //BA.debugLineNum = 50069508;BA.debugLine="Log(\"ns2 item \" & NiceSpinner1.Text &\" selected\")";
anywheresoftware.b4a.keywords.Common.LogImpl("550069508","ns2 item "+mostCurrent._nicespinner1.getText()+" selected",0);
RDebugUtils.currentLine=50069509;
 //BA.debugLineNum = 50069509;BA.debugLine="Try";
try {RDebugUtils.currentLine=50069510;
 //BA.debugLineNum = 50069510;BA.debugLine="If Position=0 Then";
if (_position==0) { 
RDebugUtils.currentLine=50069511;
 //BA.debugLineNum = 50069511;BA.debugLine="If lstSelectedCodeGroupAshkhas.Size>0 Then";
if (mostCurrent._lstselectedcodegroupashkhas.getSize()>0) { 
RDebugUtils.currentLine=50069512;
 //BA.debugLineNum = 50069512;BA.debugLine="GroupCodeSelect2=lstSelectedCodeGroupAshkhas.G";
mostCurrent._groupcodeselect2 = BA.ObjectToString(mostCurrent._lstselectedcodegroupashkhas.Get((int) (mostCurrent._lstselectedcodegroupashkhas.getSize()-1)));
 };
 }else {
RDebugUtils.currentLine=50069516;
 //BA.debugLineNum = 50069516;BA.debugLine="Dim lst As List=ListGoroohAshkhas1";
_lst = new anywheresoftware.b4a.objects.collections.List();
_lst = mostCurrent._listgoroohashkhas1;
RDebugUtils.currentLine=50069517;
 //BA.debugLineNum = 50069517;BA.debugLine="Dim Item As AdapterGoroohAshkhas=lst.Get(Positi";
_item = (ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas)(_lst.Get((int) (_position-1)));
RDebugUtils.currentLine=50069518;
 //BA.debugLineNum = 50069518;BA.debugLine="GroupCodeSelect2=Item.FldC_Gorooh";
mostCurrent._groupcodeselect2 = _item.FldC_Gorooh /*String*/ ;
RDebugUtils.currentLine=50069520;
 //BA.debugLineNum = 50069520;BA.debugLine="Dim mc As String=Item.FldC_Gorooh";
_mc = _item.FldC_Gorooh /*String*/ ;
RDebugUtils.currentLine=50069522;
 //BA.debugLineNum = 50069522;BA.debugLine="Dim Count As Int = mc.Length + 3";
_count = (int) (_mc.length()+3);
RDebugUtils.currentLine=50069523;
 //BA.debugLineNum = 50069523;BA.debugLine="Dim Cu As Cursor=MCode.Result(\"Select FldC_Goro";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas where FldC_Gorooh Like '"+_mc+"%' And Length(FldC_Gorooh) = "+BA.NumberToString(_count)+" ORDER BY FldC_Gorooh");
RDebugUtils.currentLine=50069524;
 //BA.debugLineNum = 50069524;BA.debugLine="If Cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=50069525;
 //BA.debugLineNum = 50069525;BA.debugLine="ListGoroohAshkhas1.Clear";
mostCurrent._listgoroohashkhas1.Clear();
RDebugUtils.currentLine=50069529;
 //BA.debugLineNum = 50069529;BA.debugLine="lstSelectedCodeGroupAshkhas.Add(Item.FldC_Goro";
mostCurrent._lstselectedcodegroupashkhas.Add((Object)(_item.FldC_Gorooh /*String*/ ));
RDebugUtils.currentLine=50069533;
 //BA.debugLineNum = 50069533;BA.debugLine="lstGroup2.Clear";
mostCurrent._lstgroup2.Clear();
RDebugUtils.currentLine=50069535;
 //BA.debugLineNum = 50069535;BA.debugLine="lstGroup2.Add(\"همه گروه ها\")";
mostCurrent._lstgroup2.Add((Object)("همه گروه ها"));
RDebugUtils.currentLine=50069537;
 //BA.debugLineNum = 50069537;BA.debugLine="For i=0 To Cu.RowCount-1";
{
final int step22 = 1;
final int limit22 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit22 ;_i = _i + step22 ) {
RDebugUtils.currentLine=50069538;
 //BA.debugLineNum = 50069538;BA.debugLine="Cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=50069539;
 //BA.debugLineNum = 50069539;BA.debugLine="Dim Item As AdapterGoroohAshkhas";
_item = new ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas();
RDebugUtils.currentLine=50069540;
 //BA.debugLineNum = 50069540;BA.debugLine="Item.FldC_Gorooh=Cu.GetString(\"FldC_Gorooh\")";
_item.FldC_Gorooh /*String*/  = _cu.GetString("FldC_Gorooh");
RDebugUtils.currentLine=50069541;
 //BA.debugLineNum = 50069541;BA.debugLine="Item.FldN_Gorooh=Cu.GetString(\"FldN_Gorooh\")";
_item.FldN_Gorooh /*String*/  = _cu.GetString("FldN_Gorooh");
RDebugUtils.currentLine=50069542;
 //BA.debugLineNum = 50069542;BA.debugLine="ListGoroohAshkhas1.Add(Item)";
mostCurrent._listgoroohashkhas1.Add((Object)(_item));
RDebugUtils.currentLine=50069544;
 //BA.debugLineNum = 50069544;BA.debugLine="lstGroup2.Add(Cu.GetString(\"FldN_Gorooh\"))";
mostCurrent._lstgroup2.Add((Object)(_cu.GetString("FldN_Gorooh")));
 }
};
RDebugUtils.currentLine=50069547;
 //BA.debugLineNum = 50069547;BA.debugLine="NiceSpinner1.RemoveView";
mostCurrent._nicespinner1.RemoveView();
RDebugUtils.currentLine=50069548;
 //BA.debugLineNum = 50069548;BA.debugLine="NiceSpinner1.Initialize(\"NiceSpinner1\")";
mostCurrent._nicespinner1.Initialize(processBA,"NiceSpinner1");
RDebugUtils.currentLine=50069549;
 //BA.debugLineNum = 50069549;BA.debugLine="PnlSpGroup.AddView(NiceSpinner1,B4XComboBox2.m";
mostCurrent._pnlspgroup.AddView((android.view.View)(mostCurrent._nicespinner1.getObject()),mostCurrent._b4xcombobox2._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft(),mostCurrent._b4xcombobox2._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop(),mostCurrent._b4xcombobox2._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),mostCurrent._b4xcombobox2._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=50069550;
 //BA.debugLineNum = 50069550;BA.debugLine="NiceSpinner1.TextColor = Colors.Black";
mostCurrent._nicespinner1.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=50069551;
 //BA.debugLineNum = 50069551;BA.debugLine="NiceSpinner1.Gravity = Gravity.CENTER_HORIZONT";
mostCurrent._nicespinner1.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL);
RDebugUtils.currentLine=50069552;
 //BA.debugLineNum = 50069552;BA.debugLine="NiceSpinner1.Typeface = Typeface.LoadFromAsset";
mostCurrent._nicespinner1.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("p_font.ttf"));
RDebugUtils.currentLine=50069553;
 //BA.debugLineNum = 50069553;BA.debugLine="Dim op1 As ColorDrawable";
_op1 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=50069554;
 //BA.debugLineNum = 50069554;BA.debugLine="op1.Initialize2(Colors.White,8dip,2dip,Colors.";
_op1.Initialize2(anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (8)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2)),anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=50069555;
 //BA.debugLineNum = 50069555;BA.debugLine="NiceSpinner1.Background=op1";
mostCurrent._nicespinner1.setBackground((android.graphics.drawable.Drawable)(_op1.getObject()));
RDebugUtils.currentLine=50069556;
 //BA.debugLineNum = 50069556;BA.debugLine="NiceSpinner1.attachDataSource(lstGroup2)";
mostCurrent._nicespinner1.attachDataSource((java.util.List)(mostCurrent._lstgroup2.getObject()));
 };
 };
RDebugUtils.currentLine=50069560;
 //BA.debugLineNum = 50069560;BA.debugLine="GroupCodeSelect=GroupCodeSelect2";
_groupcodeselect = (long)(Double.parseDouble(mostCurrent._groupcodeselect2));
RDebugUtils.currentLine=50069561;
 //BA.debugLineNum = 50069561;BA.debugLine="Log(\"CodeGroupSelect2: \"&GroupCodeSelect2)";
anywheresoftware.b4a.keywords.Common.LogImpl("550069561","CodeGroupSelect2: "+mostCurrent._groupcodeselect2,0);
RDebugUtils.currentLine=50069562;
 //BA.debugLineNum = 50069562;BA.debugLine="Log(\"position2: \"&Position)";
anywheresoftware.b4a.keywords.Common.LogImpl("550069562","position2: "+BA.NumberToString(_position),0);
 } 
       catch (Exception e46) {
			processBA.setLastException(e46);RDebugUtils.currentLine=50069564;
 //BA.debugLineNum = 50069564;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("550069564",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=50069565;
 //BA.debugLineNum = 50069565;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-NiceSpinner1_ItemClick");
 };
RDebugUtils.currentLine=50069567;
 //BA.debugLineNum = 50069567;BA.debugLine="End Sub";
return "";
}
public static String  _updateashkhasnew() throws Exception{
RDebugUtils.currentModule="act_newashkhas";
if (Debug.shouldDelegate(mostCurrent.activityBA, "updateashkhasnew", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "updateashkhasnew", null));}
anywheresoftware.b4a.objects.collections.Map _fields = null;
anywheresoftware.b4a.objects.collections.Map _where = null;
RDebugUtils.currentLine=50921472;
 //BA.debugLineNum = 50921472;BA.debugLine="Sub UpdateAshkhasNew";
RDebugUtils.currentLine=50921473;
 //BA.debugLineNum = 50921473;BA.debugLine="Dim Fields As Map";
_fields = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=50921474;
 //BA.debugLineNum = 50921474;BA.debugLine="Dim Where As Map";
_where = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=50921476;
 //BA.debugLineNum = 50921476;BA.debugLine="Fields.Initialize";
_fields.Initialize();
RDebugUtils.currentLine=50921477;
 //BA.debugLineNum = 50921477;BA.debugLine="Where.Initialize";
_where.Initialize();
RDebugUtils.currentLine=50921479;
 //BA.debugLineNum = 50921479;BA.debugLine="Fields.Put(\"FldSharheTafzili\",TxtName.Text)";
_fields.Put((Object)("FldSharheTafzili"),(Object)(mostCurrent._txtname.getText()));
RDebugUtils.currentLine=50921480;
 //BA.debugLineNum = 50921480;BA.debugLine="Fields.Put(\"FldTell\",TxtTell.Text)";
_fields.Put((Object)("FldTell"),(Object)(mostCurrent._txttell.getText()));
RDebugUtils.currentLine=50921481;
 //BA.debugLineNum = 50921481;BA.debugLine="Fields.Put(\"FldMobile\",TxtMob.Text)";
_fields.Put((Object)("FldMobile"),(Object)(mostCurrent._txtmob.getText()));
RDebugUtils.currentLine=50921482;
 //BA.debugLineNum = 50921482;BA.debugLine="Fields.Put(\"FldAddress\",TxtAddress.Text)";
_fields.Put((Object)("FldAddress"),(Object)(mostCurrent._txtaddress.getText()));
RDebugUtils.currentLine=50921483;
 //BA.debugLineNum = 50921483;BA.debugLine="Fields.Put(\"fldCodeGroup\",GroupCodeSelect)";
_fields.Put((Object)("fldCodeGroup"),(Object)(_groupcodeselect));
RDebugUtils.currentLine=50921484;
 //BA.debugLineNum = 50921484;BA.debugLine="Fields.Put(\"FldC_Meli\",TxtC_Meli.Text)";
_fields.Put((Object)("FldC_Meli"),(Object)(mostCurrent._txtc_meli.getText()));
RDebugUtils.currentLine=50921485;
 //BA.debugLineNum = 50921485;BA.debugLine="Fields.Put(\"FldC_Posti\",TxtC_Posti.Text)";
_fields.Put((Object)("FldC_Posti"),(Object)(mostCurrent._txtc_posti.getText()));
RDebugUtils.currentLine=50921486;
 //BA.debugLineNum = 50921486;BA.debugLine="Fields.Put(\"FldShomarehesab\",TxtShomarehesab.Text";
_fields.Put((Object)("FldShomarehesab"),(Object)(mostCurrent._txtshomarehesab.getText()));
RDebugUtils.currentLine=50921487;
 //BA.debugLineNum = 50921487;BA.debugLine="Fields.Put(\"FldLat\",TxtLat.Text)";
_fields.Put((Object)("FldLat"),(Object)(mostCurrent._txtlat.getText()));
RDebugUtils.currentLine=50921488;
 //BA.debugLineNum = 50921488;BA.debugLine="Fields.Put(\"FldLon\",TxtLon.Text)";
_fields.Put((Object)("FldLon"),(Object)(mostCurrent._txtlon.getText()));
RDebugUtils.currentLine=50921490;
 //BA.debugLineNum = 50921490;BA.debugLine="Where.Put(\"FldCodeTafzili\",shakhs.CodeTafzili)";
_where.Put((Object)("FldCodeTafzili"),(Object)(_shakhs.CodeTafzili /*String*/ ));
RDebugUtils.currentLine=50921493;
 //BA.debugLineNum = 50921493;BA.debugLine="DBUtils.UpdateRecord2(MCode.Sql1,\"TblAshkhasNew\",";
mostCurrent._dbutils._updaterecord2 /*String*/ (mostCurrent.activityBA,mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ ,"TblAshkhasNew",_fields,_where);
RDebugUtils.currentLine=50921494;
 //BA.debugLineNum = 50921494;BA.debugLine="End Sub";
return "";
}
public static String  _updateashkhas() throws Exception{
RDebugUtils.currentModule="act_newashkhas";
if (Debug.shouldDelegate(mostCurrent.activityBA, "updateashkhas", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "updateashkhas", null));}
anywheresoftware.b4a.objects.collections.Map _fields = null;
anywheresoftware.b4a.objects.collections.Map _where = null;
RDebugUtils.currentLine=50987008;
 //BA.debugLineNum = 50987008;BA.debugLine="Sub UpdateAshkhas";
RDebugUtils.currentLine=50987009;
 //BA.debugLineNum = 50987009;BA.debugLine="Dim Fields As Map";
_fields = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=50987010;
 //BA.debugLineNum = 50987010;BA.debugLine="Dim Where As Map";
_where = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=50987012;
 //BA.debugLineNum = 50987012;BA.debugLine="Fields.Initialize";
_fields.Initialize();
RDebugUtils.currentLine=50987013;
 //BA.debugLineNum = 50987013;BA.debugLine="Where.Initialize";
_where.Initialize();
RDebugUtils.currentLine=50987015;
 //BA.debugLineNum = 50987015;BA.debugLine="Fields.Put(\"fldSharheTafzili\",TxtName.Text)";
_fields.Put((Object)("fldSharheTafzili"),(Object)(mostCurrent._txtname.getText()));
RDebugUtils.currentLine=50987016;
 //BA.debugLineNum = 50987016;BA.debugLine="Fields.Put(\"fldTell\",TxtTell.Text)";
_fields.Put((Object)("fldTell"),(Object)(mostCurrent._txttell.getText()));
RDebugUtils.currentLine=50987017;
 //BA.debugLineNum = 50987017;BA.debugLine="Fields.Put(\"FldMobile\",TxtMob.Text)";
_fields.Put((Object)("FldMobile"),(Object)(mostCurrent._txtmob.getText()));
RDebugUtils.currentLine=50987018;
 //BA.debugLineNum = 50987018;BA.debugLine="Fields.Put(\"fldAdress\",TxtAddress.Text)";
_fields.Put((Object)("fldAdress"),(Object)(mostCurrent._txtaddress.getText()));
RDebugUtils.currentLine=50987019;
 //BA.debugLineNum = 50987019;BA.debugLine="Fields.Put(\"fldCodeGroup\",GroupCodeSelect)";
_fields.Put((Object)("fldCodeGroup"),(Object)(_groupcodeselect));
RDebugUtils.currentLine=50987020;
 //BA.debugLineNum = 50987020;BA.debugLine="Fields.Put(\"fldNameGroup\",GroupNameSelect)";
_fields.Put((Object)("fldNameGroup"),(Object)(mostCurrent._groupnameselect));
RDebugUtils.currentLine=50987021;
 //BA.debugLineNum = 50987021;BA.debugLine="Fields.Put(\"FldC_Meli\",TxtC_Meli.Text)";
_fields.Put((Object)("FldC_Meli"),(Object)(mostCurrent._txtc_meli.getText()));
RDebugUtils.currentLine=50987022;
 //BA.debugLineNum = 50987022;BA.debugLine="Fields.Put(\"FldC_Posti\",TxtC_Posti.Text)";
_fields.Put((Object)("FldC_Posti"),(Object)(mostCurrent._txtc_posti.getText()));
RDebugUtils.currentLine=50987023;
 //BA.debugLineNum = 50987023;BA.debugLine="Fields.Put(\"FldShomarehesab\",TxtShomarehesab.Text";
_fields.Put((Object)("FldShomarehesab"),(Object)(mostCurrent._txtshomarehesab.getText()));
RDebugUtils.currentLine=50987024;
 //BA.debugLineNum = 50987024;BA.debugLine="Fields.Put(\"FldLat\",TxtLat.Text)";
_fields.Put((Object)("FldLat"),(Object)(mostCurrent._txtlat.getText()));
RDebugUtils.currentLine=50987025;
 //BA.debugLineNum = 50987025;BA.debugLine="Fields.Put(\"FldLon\",TxtLon.Text)";
_fields.Put((Object)("FldLon"),(Object)(mostCurrent._txtlon.getText()));
RDebugUtils.currentLine=50987027;
 //BA.debugLineNum = 50987027;BA.debugLine="Where.Put(\"fldCodetafzili\",shakhs.CodeTafzili)";
_where.Put((Object)("fldCodetafzili"),(Object)(_shakhs.CodeTafzili /*String*/ ));
RDebugUtils.currentLine=50987030;
 //BA.debugLineNum = 50987030;BA.debugLine="DBUtils.UpdateRecord2(MCode.Sql1,\"TblAshkhas\",Fie";
mostCurrent._dbutils._updaterecord2 /*String*/ (mostCurrent.activityBA,mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ ,"TblAshkhas",_fields,_where);
RDebugUtils.currentLine=50987031;
 //BA.debugLineNum = 50987031;BA.debugLine="End Sub";
return "";
}
public static String  _t1_tick() throws Exception{
RDebugUtils.currentModule="act_newashkhas";
if (Debug.shouldDelegate(mostCurrent.activityBA, "t1_tick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "t1_tick", null));}
RDebugUtils.currentLine=50593792;
 //BA.debugLineNum = 50593792;BA.debugLine="Sub t1_tick";
RDebugUtils.currentLine=50593793;
 //BA.debugLineNum = 50593793;BA.debugLine="t1.Enabled=False";
_t1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=50593794;
 //BA.debugLineNum = 50593794;BA.debugLine="Try";
try {RDebugUtils.currentLine=50593795;
 //BA.debugLineNum = 50593795;BA.debugLine="GetLocation";
_getlocation();
 } 
       catch (Exception e5) {
			processBA.setLastException(e5);RDebugUtils.currentLine=50593798;
 //BA.debugLineNum = 50593798;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("550593798",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=50593799;
 //BA.debugLineNum = 50593799;BA.debugLine="myCode.SendError(LastException, Activity.Title&\"";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-t1_tick");
 };
RDebugUtils.currentLine=50593825;
 //BA.debugLineNum = 50593825;BA.debugLine="End Sub";
return "";
}
public static String  _txtlat_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="act_newashkhas";
if (Debug.shouldDelegate(mostCurrent.activityBA, "txtlat_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "txtlat_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=51183616;
 //BA.debugLineNum = 51183616;BA.debugLine="Sub TxtLat_TextChanged (Old As String, New As Stri";
RDebugUtils.currentLine=51183617;
 //BA.debugLineNum = 51183617;BA.debugLine="Lat=MCode.ConvertNumbersPersian2English(TxtLat.te";
mostCurrent._lat = mostCurrent._mcode._convertnumberspersian2english /*String*/ (mostCurrent.activityBA,mostCurrent._txtlat.getText());
RDebugUtils.currentLine=51183618;
 //BA.debugLineNum = 51183618;BA.debugLine="End Sub";
return "";
}
public static String  _txtlon_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="act_newashkhas";
if (Debug.shouldDelegate(mostCurrent.activityBA, "txtlon_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "txtlon_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=51118080;
 //BA.debugLineNum = 51118080;BA.debugLine="Sub TxtLon_TextChanged (Old As String, New As Stri";
RDebugUtils.currentLine=51118081;
 //BA.debugLineNum = 51118081;BA.debugLine="Lon=MCode.ConvertNumbersPersian2English(TxtLon.te";
mostCurrent._lon = mostCurrent._mcode._convertnumberspersian2english /*String*/ (mostCurrent.activityBA,mostCurrent._txtlon.getText());
RDebugUtils.currentLine=51118082;
 //BA.debugLineNum = 51118082;BA.debugLine="End Sub";
return "";
}
}