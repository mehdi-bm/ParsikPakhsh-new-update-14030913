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

public class act_rizefactorhavale extends Activity implements B4AActivity{
	public static act_rizefactorhavale mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.act_rizefactorhavale");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (act_rizefactorhavale).");
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
		activityBA = new BA(this, layout, processBA, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.act_rizefactorhavale");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "ir.parsikhesab.pakhsh.act_rizefactorhavale", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (act_rizefactorhavale) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (act_rizefactorhavale) Resume **");
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
		return act_rizefactorhavale.class;
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
            BA.LogInfo("** Activity (act_rizefactorhavale) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (act_rizefactorhavale) Pause event (activity is not paused). **");
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
            act_rizefactorhavale mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (act_rizefactorhavale) Resume **");
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
public static String _shomarefaktor = "";
public static String _shomarehavale = "";
public static String _codemoshtari = "";
public static String _namemoshtari = "";
public static String _date = "";
public static String _fldlat = "";
public static String _fldlon = "";
public static anywheresoftware.b4a.gps.GPS _gps = null;
public static anywheresoftware.b4a.objects.Timer _t1 = null;
public ir.parsikhesab.pakhsh.table _table1 = null;
public anywheresoftware.b4a.objects.IME _key = null;
public anywheresoftware.b4a.objects.collections.List _listkala = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblnamemoshtari = null;
public anywheresoftware.b4a.objects.LabelWrapper _txtsharhfaktor = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_print = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnltable = null;
public anywheresoftware.b4a.objects.RuntimePermissions _rp = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblghabelepardakht = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblmandeghabl = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltakhfifkala = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltotalfaktor2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblmablaghkhales = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblshomarefactor = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_tasvie = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnshowmap = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btncheck = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblcodemoshtari = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblshomarehavale = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbldate = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblmablaghekoldaryafti = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblvaziat = null;
public static String _vaziat = "";
public anywheresoftware.b4a.objects.MapFragmentWrapper _mapfragment1 = null;
public anywheresoftware.b4a.objects.MapFragmentWrapper.GoogleMapWrapper _gmap = null;
public static String _mablaghfinal = "";
public anywheresoftware.b4a.objects.LabelWrapper _lblmabalghtahkfifdaryafti = null;
public anywheresoftware.b4a.objects.MapFragmentWrapper.LatLngWrapper _loc = null;
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
RDebugUtils.currentModule="act_rizefactorhavale";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=67043328;
 //BA.debugLineNum = 67043328;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=67043329;
 //BA.debugLineNum = 67043329;BA.debugLine="Activity.LoadLayout(\"L_RizeFactorHavale\")";
mostCurrent._activity.LoadLayout("L_RizeFactorHavale",mostCurrent.activityBA);
RDebugUtils.currentLine=67043332;
 //BA.debugLineNum = 67043332;BA.debugLine="Key.Initialize(\"Key\")";
mostCurrent._key.Initialize("Key");
RDebugUtils.currentLine=67043333;
 //BA.debugLineNum = 67043333;BA.debugLine="Listkala.Initialize";
mostCurrent._listkala.Initialize();
RDebugUtils.currentLine=67043334;
 //BA.debugLineNum = 67043334;BA.debugLine="Gps.Initialize(\"Gps\")";
_gps.Initialize("Gps");
RDebugUtils.currentLine=67043335;
 //BA.debugLineNum = 67043335;BA.debugLine="t1.Initialize(\"t1\",3000)";
_t1.Initialize(processBA,"t1",(long) (3000));
RDebugUtils.currentLine=67043345;
 //BA.debugLineNum = 67043345;BA.debugLine="Table1.Initialize(Me, \"Table1\",9)";
mostCurrent._table1._initialize /*String*/ (null,mostCurrent.activityBA,act_rizefactorhavale.getObject(),"Table1",(int) (9));
RDebugUtils.currentLine=67043346;
 //BA.debugLineNum = 67043346;BA.debugLine="Table1.AddToActivity(PnlTable, 0,0,100%x,PnlTable";
mostCurrent._table1._addtoactivity /*String*/ (null,(anywheresoftware.b4a.objects.ActivityWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ActivityWrapper(), (anywheresoftware.b4a.BALayout)(mostCurrent._pnltable.getObject())),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),mostCurrent._pnltable.getHeight());
RDebugUtils.currentLine=67043356;
 //BA.debugLineNum = 67043356;BA.debugLine="End Sub";
return "";
}
public static boolean  _activity_keypress(int _keycode) throws Exception{
RDebugUtils.currentModule="act_rizefactorhavale";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_keypress", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "activity_keypress", new Object[] {_keycode}));}
RDebugUtils.currentLine=67305472;
 //BA.debugLineNum = 67305472;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
RDebugUtils.currentLine=67305473;
 //BA.debugLineNum = 67305473;BA.debugLine="If KeyCode=KeyCodes.KEYCODE_BACK Then";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK) { 
RDebugUtils.currentLine=67305475;
 //BA.debugLineNum = 67305475;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 };
RDebugUtils.currentLine=67305477;
 //BA.debugLineNum = 67305477;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=67305478;
 //BA.debugLineNum = 67305478;BA.debugLine="End Sub";
return false;
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="act_rizefactorhavale";
RDebugUtils.currentLine=67436544;
 //BA.debugLineNum = 67436544;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=67436546;
 //BA.debugLineNum = 67436546;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="act_rizefactorhavale";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=67371008;
 //BA.debugLineNum = 67371008;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=67371009;
 //BA.debugLineNum = 67371009;BA.debugLine="CreatePge";
_createpge();
RDebugUtils.currentLine=67371010;
 //BA.debugLineNum = 67371010;BA.debugLine="End Sub";
return "";
}
public static String  _createpge() throws Exception{
RDebugUtils.currentModule="act_rizefactorhavale";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createpge", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "createpge", null));}
RDebugUtils.currentLine=67174400;
 //BA.debugLineNum = 67174400;BA.debugLine="Sub CreatePge";
RDebugUtils.currentLine=67174401;
 //BA.debugLineNum = 67174401;BA.debugLine="ProgressDialogShow(\"در حال بارگذاری اطلاعات . . .";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("در حال بارگذاری اطلاعات . . ."));
RDebugUtils.currentLine=67174402;
 //BA.debugLineNum = 67174402;BA.debugLine="Try";
try {RDebugUtils.currentLine=67174403;
 //BA.debugLineNum = 67174403;BA.debugLine="MCode.page=\"Act_RizeFactorHavale\"";
mostCurrent._mcode._page /*String*/  = "Act_RizeFactorHavale";
RDebugUtils.currentLine=67174404;
 //BA.debugLineNum = 67174404;BA.debugLine="lblShomareFactor.Text=ShomareFaktor";
mostCurrent._lblshomarefactor.setText(BA.ObjectToCharSequence(_shomarefaktor));
RDebugUtils.currentLine=67174405;
 //BA.debugLineNum = 67174405;BA.debugLine="lblShomareHavale.Text=ShomareHavale";
mostCurrent._lblshomarehavale.setText(BA.ObjectToCharSequence(_shomarehavale));
RDebugUtils.currentLine=67174406;
 //BA.debugLineNum = 67174406;BA.debugLine="MCode.ShomareFaktor=ShomareFaktor";
mostCurrent._mcode._shomarefaktor /*String*/  = _shomarefaktor;
RDebugUtils.currentLine=67174407;
 //BA.debugLineNum = 67174407;BA.debugLine="LblCodeMoshtari.Text=CodeMoshtari";
mostCurrent._lblcodemoshtari.setText(BA.ObjectToCharSequence(_codemoshtari));
RDebugUtils.currentLine=67174408;
 //BA.debugLineNum = 67174408;BA.debugLine="LblNameMoshtari.Text=NameMoshtari";
mostCurrent._lblnamemoshtari.setText(BA.ObjectToCharSequence(_namemoshtari));
RDebugUtils.currentLine=67174409;
 //BA.debugLineNum = 67174409;BA.debugLine="lblDate.Text=date";
mostCurrent._lbldate.setText(BA.ObjectToCharSequence(_date));
RDebugUtils.currentLine=67174410;
 //BA.debugLineNum = 67174410;BA.debugLine="t1.Enabled=True";
_t1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=67174411;
 //BA.debugLineNum = 67174411;BA.debugLine="LoadData";
_loaddata();
 } 
       catch (Exception e13) {
			processBA.setLastException(e13);RDebugUtils.currentLine=67174414;
 //BA.debugLineNum = 67174414;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("567174414",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=67174415;
 //BA.debugLineNum = 67174415;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-CreatePge");
 };
RDebugUtils.currentLine=67174417;
 //BA.debugLineNum = 67174417;BA.debugLine="End Sub";
return "";
}
public static String  _btn_back_click() throws Exception{
RDebugUtils.currentModule="act_rizefactorhavale";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_back_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_back_click", null));}
RDebugUtils.currentLine=67567616;
 //BA.debugLineNum = 67567616;BA.debugLine="Sub btn_Back_Click";
RDebugUtils.currentLine=67567617;
 //BA.debugLineNum = 67567617;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=67567618;
 //BA.debugLineNum = 67567618;BA.debugLine="End Sub";
return "";
}
public static String  _btn_print_click() throws Exception{
RDebugUtils.currentModule="act_rizefactorhavale";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_print_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_print_click", null));}
anywheresoftware.b4a.objects.collections.List _lst = null;
int _res = 0;
RDebugUtils.currentLine=67502080;
 //BA.debugLineNum = 67502080;BA.debugLine="Sub Btn_print_Click";
RDebugUtils.currentLine=67502081;
 //BA.debugLineNum = 67502081;BA.debugLine="Act_PrintPic2.DateFactor= lblDate.Text";
mostCurrent._act_printpic2._datefactor /*String*/  = mostCurrent._lbldate.getText();
RDebugUtils.currentLine=67502082;
 //BA.debugLineNum = 67502082;BA.debugLine="Act_PrintPic2.listKala = Listkala";
mostCurrent._act_printpic2._listkala /*anywheresoftware.b4a.objects.collections.List*/  = mostCurrent._listkala;
RDebugUtils.currentLine=67502083;
 //BA.debugLineNum = 67502083;BA.debugLine="Dim Lst As List = Array As String(\"چاپ 1\",\"چاپ 2\"";
_lst = new anywheresoftware.b4a.objects.collections.List();
_lst = anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"چاپ 1","چاپ 2"});
RDebugUtils.currentLine=67502084;
 //BA.debugLineNum = 67502084;BA.debugLine="Dim res As Int = InputList(Lst,\"نوع چاپ را انتخاب";
_res = anywheresoftware.b4a.keywords.Common.InputList(_lst,BA.ObjectToCharSequence("نوع چاپ را انتخاب نمایید:"),(int) (-1),mostCurrent.activityBA);
RDebugUtils.currentLine=67502085;
 //BA.debugLineNum = 67502085;BA.debugLine="Select Case res";
switch (_res) {
case 0: {
RDebugUtils.currentLine=67502087;
 //BA.debugLineNum = 67502087;BA.debugLine="Act_PrintPic2.TypePrint=res";
mostCurrent._act_printpic2._typeprint /*int*/  = _res;
RDebugUtils.currentLine=67502088;
 //BA.debugLineNum = 67502088;BA.debugLine="StartActivity(Act_PrintPic2)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._act_printpic2.getObject()));
 break; }
case 1: {
RDebugUtils.currentLine=67502090;
 //BA.debugLineNum = 67502090;BA.debugLine="Act_PrintPic2.TypePrint=res";
mostCurrent._act_printpic2._typeprint /*int*/  = _res;
RDebugUtils.currentLine=67502091;
 //BA.debugLineNum = 67502091;BA.debugLine="StartActivity(Act_PrintPic2)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._act_printpic2.getObject()));
 break; }
}
;
RDebugUtils.currentLine=67502093;
 //BA.debugLineNum = 67502093;BA.debugLine="End Sub";
return "";
}
public static String  _btn_tasvie_click() throws Exception{
RDebugUtils.currentModule="act_rizefactorhavale";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_tasvie_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_tasvie_click", null));}
RDebugUtils.currentLine=67633152;
 //BA.debugLineNum = 67633152;BA.debugLine="Private Sub Btn_Tasvie_Click";
RDebugUtils.currentLine=67633153;
 //BA.debugLineNum = 67633153;BA.debugLine="Act_Mali.ShomareFactor=lblShomareFactor.Text";
mostCurrent._act_mali._shomarefactor /*String*/  = mostCurrent._lblshomarefactor.getText();
RDebugUtils.currentLine=67633154;
 //BA.debugLineNum = 67633154;BA.debugLine="Act_Mali.MabalghGhablepardakht=mablaghFinal";
mostCurrent._act_mali._mabalghghablepardakht /*String*/  = mostCurrent._mablaghfinal;
RDebugUtils.currentLine=67633155;
 //BA.debugLineNum = 67633155;BA.debugLine="Act_Mali.CodeMoshtari=CodeMoshtari";
mostCurrent._act_mali._codemoshtari /*String*/  = _codemoshtari;
RDebugUtils.currentLine=67633156;
 //BA.debugLineNum = 67633156;BA.debugLine="Act_Mali.NameMoshtari=LblNameMoshtari.Text";
mostCurrent._act_mali._namemoshtari /*String*/  = mostCurrent._lblnamemoshtari.getText();
RDebugUtils.currentLine=67633157;
 //BA.debugLineNum = 67633157;BA.debugLine="Act_Mali.ShomareHavale=ShomareHavale";
mostCurrent._act_mali._shomarehavale /*String*/  = _shomarehavale;
RDebugUtils.currentLine=67633158;
 //BA.debugLineNum = 67633158;BA.debugLine="StartActivity(Act_Mali)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._act_mali.getObject()));
RDebugUtils.currentLine=67633159;
 //BA.debugLineNum = 67633159;BA.debugLine="End Sub";
return "";
}
public static String  _btncheck_click() throws Exception{
RDebugUtils.currentModule="act_rizefactorhavale";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btncheck_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btncheck_click", null));}
RDebugUtils.currentLine=67764224;
 //BA.debugLineNum = 67764224;BA.debugLine="Private Sub BtnCheck_Click";
RDebugUtils.currentLine=67764225;
 //BA.debugLineNum = 67764225;BA.debugLine="MCode.C_Tafzili=LblCodeMoshtari.Text";
mostCurrent._mcode._c_tafzili /*String*/  = mostCurrent._lblcodemoshtari.getText();
RDebugUtils.currentLine=67764226;
 //BA.debugLineNum = 67764226;BA.debugLine="StartActivity(Act_Emza)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._act_emza.getObject()));
RDebugUtils.currentLine=67764227;
 //BA.debugLineNum = 67764227;BA.debugLine="End Sub";
return "";
}
public static String  _btnshowmap_click() throws Exception{
RDebugUtils.currentModule="act_rizefactorhavale";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnshowmap_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnshowmap_click", null));}
double _destlat = 0;
double _destlng = 0;
String _label = "";
String _uri = "";
anywheresoftware.b4a.objects.IntentWrapper _intent = null;
RDebugUtils.currentLine=67698688;
 //BA.debugLineNum = 67698688;BA.debugLine="Private Sub BtnShowMap_Click";
RDebugUtils.currentLine=67698689;
 //BA.debugLineNum = 67698689;BA.debugLine="If fldLat =\"\" And fldLon=\"\" Then";
if ((_fldlat).equals("") && (_fldlon).equals("")) { 
RDebugUtils.currentLine=67698690;
 //BA.debugLineNum = 67698690;BA.debugLine="ToastMessageShow(\"برای این شخص موقعیت ثبت نشده ا";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("برای این شخص موقعیت ثبت نشده است"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=67698691;
 //BA.debugLineNum = 67698691;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=67698694;
 //BA.debugLineNum = 67698694;BA.debugLine="Dim destLat As Double = fldLat ' عرض جغرافیایی مق";
_destlat = (double)(Double.parseDouble(_fldlat));
RDebugUtils.currentLine=67698695;
 //BA.debugLineNum = 67698695;BA.debugLine="Dim destLng As Double = fldLon ' طول جغرافیایی مق";
_destlng = (double)(Double.parseDouble(_fldlon));
RDebugUtils.currentLine=67698697;
 //BA.debugLineNum = 67698697;BA.debugLine="Dim label As String = \"Destination\" ' برچسب مقصد";
_label = "Destination";
RDebugUtils.currentLine=67698699;
 //BA.debugLineNum = 67698699;BA.debugLine="Dim uri As String";
_uri = "";
RDebugUtils.currentLine=67698700;
 //BA.debugLineNum = 67698700;BA.debugLine="uri = \"google.navigation:q=\" & destLat & \",\" & de";
_uri = "google.navigation:q="+BA.NumberToString(_destlat)+","+BA.NumberToString(_destlng)+"&label="+_label;
RDebugUtils.currentLine=67698702;
 //BA.debugLineNum = 67698702;BA.debugLine="Dim intent As Intent";
_intent = new anywheresoftware.b4a.objects.IntentWrapper();
RDebugUtils.currentLine=67698703;
 //BA.debugLineNum = 67698703;BA.debugLine="intent.Initialize(intent.ACTION_VIEW, uri)";
_intent.Initialize(_intent.ACTION_VIEW,_uri);
RDebugUtils.currentLine=67698704;
 //BA.debugLineNum = 67698704;BA.debugLine="intent.SetComponent(\"com.google.android.apps.maps";
_intent.SetComponent("com.google.android.apps.maps");
RDebugUtils.currentLine=67698706;
 //BA.debugLineNum = 67698706;BA.debugLine="If intent.IsInitialized Then";
if (_intent.IsInitialized()) { 
RDebugUtils.currentLine=67698707;
 //BA.debugLineNum = 67698707;BA.debugLine="StartActivity(intent)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(_intent.getObject()));
 }else {
RDebugUtils.currentLine=67698709;
 //BA.debugLineNum = 67698709;BA.debugLine="ToastMessageShow(\"Google Maps app not found\", Tr";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Google Maps app not found"),anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=67698724;
 //BA.debugLineNum = 67698724;BA.debugLine="End Sub";
return "";
}
public static String  _btnupdate_click() throws Exception{
RDebugUtils.currentModule="act_rizefactorhavale";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnupdate_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnupdate_click", null));}
RDebugUtils.currentLine=68091904;
 //BA.debugLineNum = 68091904;BA.debugLine="Private Sub btnUpdate_Click";
RDebugUtils.currentLine=68091905;
 //BA.debugLineNum = 68091905;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=68091906;
 //BA.debugLineNum = 68091906;BA.debugLine="StartActivity(Act_HavaleTozie)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._act_havaletozie.getObject()));
RDebugUtils.currentLine=68091907;
 //BA.debugLineNum = 68091907;BA.debugLine="End Sub";
return "";
}
public static String  _loaddata() throws Exception{
RDebugUtils.currentModule="act_rizefactorhavale";
if (Debug.shouldDelegate(mostCurrent.activityBA, "loaddata", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "loaddata", null));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cr = null;
long _mablaghkhales = 0L;
long _mablaghtakhfif = 0L;
long _mablaghtakhfifdaryafti = 0L;
long _mandetalab = 0L;
long _mandetasfienashode = 0L;
long _mablaghekoldaryafti = 0L;
long _totalfaktor2 = 0L;
int _i = 0;
ir.parsikhesab.pakhsh.mcode._adapterizfactorhavale _item = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _dr = null;
RDebugUtils.currentLine=67239936;
 //BA.debugLineNum = 67239936;BA.debugLine="Sub LoadData";
RDebugUtils.currentLine=67239937;
 //BA.debugLineNum = 67239937;BA.debugLine="Try";
try {RDebugUtils.currentLine=67239938;
 //BA.debugLineNum = 67239938;BA.debugLine="Dim cr As Cursor=MCode.Result(\"select * from TblR";
_cr = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cr = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"select * from TblRizFactorHavale where fldShomareFactor='"+mostCurrent._lblshomarefactor.getText()+"' and fldShomareHavale='"+mostCurrent._lblshomarehavale.getText()+"'");
RDebugUtils.currentLine=67239939;
 //BA.debugLineNum = 67239939;BA.debugLine="Listkala.Clear";
mostCurrent._listkala.Clear();
RDebugUtils.currentLine=67239940;
 //BA.debugLineNum = 67239940;BA.debugLine="If cr.RowCount>0 Then";
if (_cr.getRowCount()>0) { 
RDebugUtils.currentLine=67239941;
 //BA.debugLineNum = 67239941;BA.debugLine="Dim MablaghKhales As Long=0";
_mablaghkhales = (long) (0);
RDebugUtils.currentLine=67239942;
 //BA.debugLineNum = 67239942;BA.debugLine="Dim MablaghTakhfif As Long=0";
_mablaghtakhfif = (long) (0);
RDebugUtils.currentLine=67239943;
 //BA.debugLineNum = 67239943;BA.debugLine="Dim MablaghTakhfifDaryafti As Long=0";
_mablaghtakhfifdaryafti = (long) (0);
RDebugUtils.currentLine=67239944;
 //BA.debugLineNum = 67239944;BA.debugLine="Dim MandeTalab As Long=0";
_mandetalab = (long) (0);
RDebugUtils.currentLine=67239945;
 //BA.debugLineNum = 67239945;BA.debugLine="Dim MandeTasfieNashode As Long=0";
_mandetasfienashode = (long) (0);
RDebugUtils.currentLine=67239946;
 //BA.debugLineNum = 67239946;BA.debugLine="Dim MablagheKolDaryafti As Long=0";
_mablaghekoldaryafti = (long) (0);
RDebugUtils.currentLine=67239947;
 //BA.debugLineNum = 67239947;BA.debugLine="Dim TotalFaktor2 As Long=0";
_totalfaktor2 = (long) (0);
RDebugUtils.currentLine=67239948;
 //BA.debugLineNum = 67239948;BA.debugLine="For i=0 To cr.RowCount-1";
{
final int step12 = 1;
final int limit12 = (int) (_cr.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit12 ;_i = _i + step12 ) {
RDebugUtils.currentLine=67239949;
 //BA.debugLineNum = 67239949;BA.debugLine="cr.Position=i";
_cr.setPosition(_i);
RDebugUtils.currentLine=67239950;
 //BA.debugLineNum = 67239950;BA.debugLine="Dim Item As AdapteRizFactorHavale";
_item = new ir.parsikhesab.pakhsh.mcode._adapterizfactorhavale();
RDebugUtils.currentLine=67239951;
 //BA.debugLineNum = 67239951;BA.debugLine="Item.fldShomareFactor=cr.GetString(\"fldShomareF";
_item.fldShomareFactor /*String*/  = _cr.GetString("fldShomareFactor");
RDebugUtils.currentLine=67239952;
 //BA.debugLineNum = 67239952;BA.debugLine="Item.fldShomareHavale=cr.GetString(\"fldShomareH";
_item.fldShomareHavale /*String*/  = _cr.GetString("fldShomareHavale");
RDebugUtils.currentLine=67239953;
 //BA.debugLineNum = 67239953;BA.debugLine="lblShomareHavale.Text=Item.fldShomareHavale";
mostCurrent._lblshomarehavale.setText(BA.ObjectToCharSequence(_item.fldShomareHavale /*String*/ ));
RDebugUtils.currentLine=67239954;
 //BA.debugLineNum = 67239954;BA.debugLine="Item.fldShomareSanad=cr.GetString(\"fldShomareSa";
_item.fldShomareSanad /*String*/  = _cr.GetString("fldShomareSanad");
RDebugUtils.currentLine=67239955;
 //BA.debugLineNum = 67239955;BA.debugLine="Item.fldC_Ranandeh=cr.GetString(\"fldC_Ranandeh\"";
_item.fldC_Ranandeh /*String*/  = _cr.GetString("fldC_Ranandeh");
RDebugUtils.currentLine=67239956;
 //BA.debugLineNum = 67239956;BA.debugLine="Item.fldN_Ranandeh=cr.GetString(\"fldN_Ranandeh\"";
_item.fldN_Ranandeh /*String*/  = _cr.GetString("fldN_Ranandeh");
RDebugUtils.currentLine=67239957;
 //BA.debugLineNum = 67239957;BA.debugLine="Item.fldCodeVasete=cr.GetString(\"fldCodeVasete\"";
_item.fldCodeVasete /*String*/  = _cr.GetString("fldCodeVasete");
RDebugUtils.currentLine=67239958;
 //BA.debugLineNum = 67239958;BA.debugLine="Item.fldCodeAnbar=cr.GetString(\"fldCodeAnbar\")";
_item.fldCodeAnbar /*String*/  = _cr.GetString("fldCodeAnbar");
RDebugUtils.currentLine=67239959;
 //BA.debugLineNum = 67239959;BA.debugLine="Item.fldRadif=cr.GetString(\"fldRadif\")";
_item.fldRadif /*String*/  = _cr.GetString("fldRadif");
RDebugUtils.currentLine=67239960;
 //BA.debugLineNum = 67239960;BA.debugLine="Item.fldCodeKala=cr.GetString(\"fldCodeKala\")";
_item.fldCodeKala /*String*/  = _cr.GetString("fldCodeKala");
RDebugUtils.currentLine=67239961;
 //BA.debugLineNum = 67239961;BA.debugLine="Item.fldSharhKala=cr.GetString(\"fldSharhKala\")";
_item.fldSharhKala /*String*/  = _cr.GetString("fldSharhKala");
RDebugUtils.currentLine=67239962;
 //BA.debugLineNum = 67239962;BA.debugLine="Item.fldDarsadTakhfif=myCode.Is_Null_adad(Item.";
_item.fldDarsadTakhfif /*String*/  = mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_item.fldDarsadTakhfif /*String*/ );
RDebugUtils.currentLine=67239963;
 //BA.debugLineNum = 67239963;BA.debugLine="Item.fldMablaghTakhfif=myCode.Is_Null_adad(cr.G";
_item.fldMablaghTakhfif /*String*/  = mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_cr.GetString("fldMablaghTakhfif"));
RDebugUtils.currentLine=67239964;
 //BA.debugLineNum = 67239964;BA.debugLine="Item.fldMandeTalab=myCode.Is_Null_adad(cr.GetSt";
_item.fldMandeTalab /*String*/  = mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_cr.GetString("fldMandeTalab"));
RDebugUtils.currentLine=67239965;
 //BA.debugLineNum = 67239965;BA.debugLine="Item.fldMandeTasfieNashode=myCode.Is_Null_adad(";
_item.fldMandeTasfieNashode /*String*/  = mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_cr.GetString("fldMandeTasfieNashode"));
RDebugUtils.currentLine=67239966;
 //BA.debugLineNum = 67239966;BA.debugLine="Item.fldMablaghKhales=myCode.Is_Null_adad(cr.Ge";
_item.fldMablaghKhales /*String*/  = mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_cr.GetString("fldMablaghKhales"));
RDebugUtils.currentLine=67239967;
 //BA.debugLineNum = 67239967;BA.debugLine="Item.fldMablagheKolDaryafti=myCode.Is_Null_adad";
_item.fldMablagheKolDaryafti /*String*/  = mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_cr.GetString("fldMablagheKolDaryafti"));
RDebugUtils.currentLine=67239968;
 //BA.debugLineNum = 67239968;BA.debugLine="Item.fldTedadCarton=cr.GetString(\"fldTedadCarto";
_item.fldTedadCarton /*String*/  = _cr.GetString("fldTedadCarton");
RDebugUtils.currentLine=67239969;
 //BA.debugLineNum = 67239969;BA.debugLine="Item.fldTedadJoz=cr.GetString(\"fldTedadJoz\")";
_item.fldTedadJoz /*String*/  = _cr.GetString("fldTedadJoz");
RDebugUtils.currentLine=67239970;
 //BA.debugLineNum = 67239970;BA.debugLine="Item.fldFeeJoz=cr.GetString(\"fldFeeJoz\")";
_item.fldFeeJoz /*String*/  = _cr.GetString("fldFeeJoz");
RDebugUtils.currentLine=67239971;
 //BA.debugLineNum = 67239971;BA.debugLine="Item.fldFeeKol=cr.GetString(\"fldFeeKol\")";
_item.fldFeeKol /*String*/  = _cr.GetString("fldFeeKol");
RDebugUtils.currentLine=67239972;
 //BA.debugLineNum = 67239972;BA.debugLine="Item.fldDateSarResid=cr.GetString(\"fldDateSarRe";
_item.fldDateSarResid /*String*/  = _cr.GetString("fldDateSarResid");
RDebugUtils.currentLine=67239973;
 //BA.debugLineNum = 67239973;BA.debugLine="Item.fldDateFactor=cr.GetString(\"fldDateFactor\"";
_item.fldDateFactor /*String*/  = _cr.GetString("fldDateFactor");
RDebugUtils.currentLine=67239974;
 //BA.debugLineNum = 67239974;BA.debugLine="Item.fldDate=cr.GetString(\"fldDate\")";
_item.fldDate /*String*/  = _cr.GetString("fldDate");
RDebugUtils.currentLine=67239975;
 //BA.debugLineNum = 67239975;BA.debugLine="Item.fldTime=cr.GetString(\"fldTime\")";
_item.fldTime /*String*/  = _cr.GetString("fldTime");
RDebugUtils.currentLine=67239976;
 //BA.debugLineNum = 67239976;BA.debugLine="Item.fldCodeTafzili=cr.GetString(\"fldCodeTafzil";
_item.fldCodeTafzili /*String*/  = _cr.GetString("fldCodeTafzili");
RDebugUtils.currentLine=67239977;
 //BA.debugLineNum = 67239977;BA.debugLine="Item.fldSharhTafzili=cr.GetString(\"fldSharhTafz";
_item.fldSharhTafzili /*String*/  = _cr.GetString("fldSharhTafzili");
RDebugUtils.currentLine=67239978;
 //BA.debugLineNum = 67239978;BA.debugLine="Item.fldLat=cr.GetString(\"fldLat\")";
_item.fldLat /*String*/  = _cr.GetString("fldLat");
RDebugUtils.currentLine=67239979;
 //BA.debugLineNum = 67239979;BA.debugLine="Item.fldLon=cr.GetString(\"fldLon\")";
_item.fldLon /*String*/  = _cr.GetString("fldLon");
RDebugUtils.currentLine=67239980;
 //BA.debugLineNum = 67239980;BA.debugLine="Item.fldFeeYekCarton=cr.GetString(\"fldFeeYekCar";
_item.fldFeeYekCarton /*String*/  = _cr.GetString("fldFeeYekCarton");
RDebugUtils.currentLine=67239981;
 //BA.debugLineNum = 67239981;BA.debugLine="Item.fldArzeshAfzode=cr.GetString(\"fldArzeshAfz";
_item.fldArzeshAfzode /*String*/  = _cr.GetString("fldArzeshAfzode");
RDebugUtils.currentLine=67239982;
 //BA.debugLineNum = 67239982;BA.debugLine="Item.fldTell=cr.GetString(\"fldTell\")";
_item.fldTell /*String*/  = _cr.GetString("fldTell");
RDebugUtils.currentLine=67239983;
 //BA.debugLineNum = 67239983;BA.debugLine="Item.fldAddress=cr.GetString(\"fldAddress\")";
_item.fldAddress /*String*/  = _cr.GetString("fldAddress");
RDebugUtils.currentLine=67239984;
 //BA.debugLineNum = 67239984;BA.debugLine="Item.fldVaziat=cr.GetString(\"fldVaziat\")";
_item.fldVaziat /*String*/  = _cr.GetString("fldVaziat");
RDebugUtils.currentLine=67239985;
 //BA.debugLineNum = 67239985;BA.debugLine="Item.fldDateTahvil=cr.GetString(\"fldDateTahvil\"";
_item.fldDateTahvil /*String*/  = _cr.GetString("fldDateTahvil");
RDebugUtils.currentLine=67239986;
 //BA.debugLineNum = 67239986;BA.debugLine="Item.fldTimeTahvil=cr.GetString(\"fldTimeTahvil\"";
_item.fldTimeTahvil /*String*/  = _cr.GetString("fldTimeTahvil");
RDebugUtils.currentLine=67239987;
 //BA.debugLineNum = 67239987;BA.debugLine="Item.fldSignature=cr.GetString(\"fldSignature\")";
_item.fldSignature /*String*/  = _cr.GetString("fldSignature");
RDebugUtils.currentLine=67239988;
 //BA.debugLineNum = 67239988;BA.debugLine="Item.fldSharhFactor=cr.GetString(\"fldSharhFacto";
_item.fldSharhFactor /*String*/  = _cr.GetString("fldSharhFactor");
RDebugUtils.currentLine=67239989;
 //BA.debugLineNum = 67239989;BA.debugLine="Listkala.Add(Item)";
mostCurrent._listkala.Add((Object)(_item));
RDebugUtils.currentLine=67239991;
 //BA.debugLineNum = 67239991;BA.debugLine="MablaghKhales=MablaghKhales+Item.fldMablaghKhal";
_mablaghkhales = (long) (_mablaghkhales+(double)(Double.parseDouble(_item.fldMablaghKhales /*String*/ )));
RDebugUtils.currentLine=67239992;
 //BA.debugLineNum = 67239992;BA.debugLine="MablaghTakhfif=MablaghTakhfif+Item.fldMablaghTa";
_mablaghtakhfif = (long) (_mablaghtakhfif+(double)(Double.parseDouble(_item.fldMablaghTakhfif /*String*/ )));
RDebugUtils.currentLine=67239993;
 //BA.debugLineNum = 67239993;BA.debugLine="MandeTalab=Item.fldMandeTalab";
_mandetalab = (long)(Double.parseDouble(_item.fldMandeTalab /*String*/ ));
RDebugUtils.currentLine=67239994;
 //BA.debugLineNum = 67239994;BA.debugLine="MandeTasfieNashode=Item.fldMandeTasfieNashode";
_mandetasfienashode = (long)(Double.parseDouble(_item.fldMandeTasfieNashode /*String*/ ));
RDebugUtils.currentLine=67239995;
 //BA.debugLineNum = 67239995;BA.debugLine="MablagheKolDaryafti=Item.fldMablagheKolDaryafti";
_mablaghekoldaryafti = (long)(Double.parseDouble(_item.fldMablagheKolDaryafti /*String*/ ));
RDebugUtils.currentLine=67239997;
 //BA.debugLineNum = 67239997;BA.debugLine="Vaziat=Item.fldVaziat";
mostCurrent._vaziat = _item.fldVaziat /*String*/ ;
RDebugUtils.currentLine=67239998;
 //BA.debugLineNum = 67239998;BA.debugLine="MCode.C_Tafzili=Item.fldCodeTafzili";
mostCurrent._mcode._c_tafzili /*String*/  = _item.fldCodeTafzili /*String*/ ;
RDebugUtils.currentLine=67239999;
 //BA.debugLineNum = 67239999;BA.debugLine="MCode.N_Tafzili=Item.fldSharhTafzili";
mostCurrent._mcode._n_tafzili /*String*/  = _item.fldSharhTafzili /*String*/ ;
RDebugUtils.currentLine=67240000;
 //BA.debugLineNum = 67240000;BA.debugLine="MCode.N_Tafzili=Item.fldSharhTafzili";
mostCurrent._mcode._n_tafzili /*String*/  = _item.fldSharhTafzili /*String*/ ;
RDebugUtils.currentLine=67240001;
 //BA.debugLineNum = 67240001;BA.debugLine="MCode.Tell_Tafzili=Item.fldTell";
mostCurrent._mcode._tell_tafzili /*String*/  = _item.fldTell /*String*/ ;
RDebugUtils.currentLine=67240002;
 //BA.debugLineNum = 67240002;BA.debugLine="MCode.Address_Tafzili=Item.fldAddress";
mostCurrent._mcode._address_tafzili /*String*/  = _item.fldAddress /*String*/ ;
RDebugUtils.currentLine=67240003;
 //BA.debugLineNum = 67240003;BA.debugLine="TxtSharhFaktor.Text=Item.fldSharhFactor";
mostCurrent._txtsharhfaktor.setText(BA.ObjectToCharSequence(_item.fldSharhFactor /*String*/ ));
 }
};
RDebugUtils.currentLine=67240006;
 //BA.debugLineNum = 67240006;BA.debugLine="TotalFaktor2=MablaghKhales+MablaghTakhfif";
_totalfaktor2 = (long) (_mablaghkhales+_mablaghtakhfif);
RDebugUtils.currentLine=67240008;
 //BA.debugLineNum = 67240008;BA.debugLine="LblMablaghKhales.text = NumberFormat(myCode.Is_N";
mostCurrent._lblmablaghkhales.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.NumberFormat((double)(Double.parseDouble(mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,BA.NumberToString(_mablaghkhales)))),(int) (1),(int) (3))+" "+mostCurrent._mcode._vahedpool /*String*/ ));
RDebugUtils.currentLine=67240009;
 //BA.debugLineNum = 67240009;BA.debugLine="mablaghFinal=MablaghKhales";
mostCurrent._mablaghfinal = BA.NumberToString(_mablaghkhales);
RDebugUtils.currentLine=67240010;
 //BA.debugLineNum = 67240010;BA.debugLine="Dim dr As Cursor=MCode.Result(\"select * from Tbl";
_dr = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_dr = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"select * from TblDaryaft where fldShomareFactor="+_shomarefaktor);
RDebugUtils.currentLine=67240011;
 //BA.debugLineNum = 67240011;BA.debugLine="If dr.RowCount>0 Then";
if (_dr.getRowCount()>0) { 
RDebugUtils.currentLine=67240012;
 //BA.debugLineNum = 67240012;BA.debugLine="MablagheKolDaryafti=MCode.SingleResult(\"select";
_mablaghekoldaryafti = BA.ObjectToLongNumber(mostCurrent._mcode._singleresult /*Object*/ (mostCurrent.activityBA,"select sum(fldMablaghDaryafti) as fldMablaghDaryafti from TblDaryaft where fldType<>3 and fldShomareFactor="+_shomarefaktor));
RDebugUtils.currentLine=67240013;
 //BA.debugLineNum = 67240013;BA.debugLine="MablaghTakhfifDaryafti=myCode.Is_Null_adad(MCod";
_mablaghtakhfifdaryafti = (long)(Double.parseDouble(mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,BA.ObjectToString(mostCurrent._mcode._singleresult /*Object*/ (mostCurrent.activityBA,"select sum(FldMablaghTakhfif) as fldMablaghTakhfifDaryafti from TblDaryaft where fldType=3 and fldShomareFactor="+_shomarefaktor)))));
RDebugUtils.currentLine=67240014;
 //BA.debugLineNum = 67240014;BA.debugLine="MandeTalab=MablaghKhales-MablagheKolDaryafti-my";
_mandetalab = (long) (_mablaghkhales-_mablaghekoldaryafti-(double)(Double.parseDouble(mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,BA.NumberToString(_mablaghtakhfifdaryafti)))));
RDebugUtils.currentLine=67240015;
 //BA.debugLineNum = 67240015;BA.debugLine="MandeTasfieNashode=MablaghKhales-MablagheKolDar";
_mandetasfienashode = (long) (_mablaghkhales-_mablaghekoldaryafti);
RDebugUtils.currentLine=67240016;
 //BA.debugLineNum = 67240016;BA.debugLine="LblMabalghTahkfifDaryafti.Text=NumberFormat(myC";
mostCurrent._lblmabalghtahkfifdaryafti.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.NumberFormat((double)(Double.parseDouble(mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,BA.NumberToString(_mablaghtakhfifdaryafti)))),(int) (1),(int) (3))+" "+mostCurrent._mcode._vahedpool /*String*/ ));
RDebugUtils.currentLine=67240017;
 //BA.debugLineNum = 67240017;BA.debugLine="LblGHabelePardakht.text = NumberFormat(myCode.I";
mostCurrent._lblghabelepardakht.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.NumberFormat((double)(Double.parseDouble(mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,BA.NumberToString(_mandetalab)))),(int) (1),(int) (3))+" "+mostCurrent._mcode._vahedpool /*String*/ ));
 }else {
RDebugUtils.currentLine=67240019;
 //BA.debugLineNum = 67240019;BA.debugLine="LblGHabelePardakht.text = NumberFormat(myCode.I";
mostCurrent._lblghabelepardakht.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.NumberFormat((double)(Double.parseDouble(mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,BA.NumberToString(_mablaghkhales)))),(int) (1),(int) (3))+" "+mostCurrent._mcode._vahedpool /*String*/ ));
 };
RDebugUtils.currentLine=67240021;
 //BA.debugLineNum = 67240021;BA.debugLine="LblTakhfifKala.text = NumberFormat(myCode.Is_Nul";
mostCurrent._lbltakhfifkala.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.NumberFormat((double)(Double.parseDouble(mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,BA.NumberToString(_mablaghtakhfif)))),(int) (1),(int) (3))+" "+mostCurrent._mcode._vahedpool /*String*/ ));
RDebugUtils.currentLine=67240022;
 //BA.debugLineNum = 67240022;BA.debugLine="LblMandeGhabl.text = NumberFormat(myCode.Is_Null";
mostCurrent._lblmandeghabl.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.NumberFormat((double)(Double.parseDouble(mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,BA.NumberToString(_mandetalab)))),(int) (1),(int) (3))+" "+mostCurrent._mcode._vahedpool /*String*/ ));
RDebugUtils.currentLine=67240024;
 //BA.debugLineNum = 67240024;BA.debugLine="lblMablagheKolDaryafti.text = NumberFormat(myCod";
mostCurrent._lblmablaghekoldaryafti.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.NumberFormat((double)(Double.parseDouble(mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,BA.NumberToString(_mablaghekoldaryafti)))),(int) (1),(int) (3))+" "+mostCurrent._mcode._vahedpool /*String*/ ));
RDebugUtils.currentLine=67240025;
 //BA.debugLineNum = 67240025;BA.debugLine="LblTotalFaktor2.text = NumberFormat(myCode.Is_Nu";
mostCurrent._lbltotalfaktor2.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.NumberFormat((double)(Double.parseDouble(mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,BA.NumberToString(_totalfaktor2)))),(int) (1),(int) (3))+" "+mostCurrent._mcode._vahedpool /*String*/ ));
RDebugUtils.currentLine=67240027;
 //BA.debugLineNum = 67240027;BA.debugLine="If myCode.Is_Null_adad(Vaziat)=0 Then";
if ((mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,mostCurrent._vaziat)).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=67240028;
 //BA.debugLineNum = 67240028;BA.debugLine="LblVaziat.TextColor=Colors.Red";
mostCurrent._lblvaziat.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Red);
RDebugUtils.currentLine=67240029;
 //BA.debugLineNum = 67240029;BA.debugLine="LblVaziat.Text=\"تحویل داده نشده\"";
mostCurrent._lblvaziat.setText(BA.ObjectToCharSequence("تحویل داده نشده"));
 }else {
RDebugUtils.currentLine=67240031;
 //BA.debugLineNum = 67240031;BA.debugLine="LblVaziat.TextColor=Colors.Green";
mostCurrent._lblvaziat.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Green);
RDebugUtils.currentLine=67240032;
 //BA.debugLineNum = 67240032;BA.debugLine="LblVaziat.Text=\"تحویل داده شده\"";
mostCurrent._lblvaziat.setText(BA.ObjectToCharSequence("تحویل داده شده"));
RDebugUtils.currentLine=67240033;
 //BA.debugLineNum = 67240033;BA.debugLine="BtnCheck.Enabled=False";
mostCurrent._btncheck.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=67240035;
 //BA.debugLineNum = 67240035;BA.debugLine="Grid";
_grid();
 };
 } 
       catch (Exception e96) {
			processBA.setLastException(e96);RDebugUtils.currentLine=67240038;
 //BA.debugLineNum = 67240038;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("567240038",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=67240039;
 //BA.debugLineNum = 67240039;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-LoadData");
 };
RDebugUtils.currentLine=67240041;
 //BA.debugLineNum = 67240041;BA.debugLine="End Sub";
return "";
}
public static String  _grid() throws Exception{
RDebugUtils.currentModule="act_rizefactorhavale";
if (Debug.shouldDelegate(mostCurrent.activityBA, "grid", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "grid", null));}
anywheresoftware.b4a.objects.collections.List _lst_colnametitle = null;
RDebugUtils.currentLine=67108864;
 //BA.debugLineNum = 67108864;BA.debugLine="Sub Grid";
RDebugUtils.currentLine=67108865;
 //BA.debugLineNum = 67108865;BA.debugLine="Dim Lst_ColNameTitle As List";
_lst_colnametitle = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=67108866;
 //BA.debugLineNum = 67108866;BA.debugLine="Lst_ColNameTitle.Initialize";
_lst_colnametitle.Initialize();
RDebugUtils.currentLine=67108868;
 //BA.debugLineNum = 67108868;BA.debugLine="Lst_ColNameTitle.AddAll(Array As String(\"ردیف\",\"ن";
_lst_colnametitle.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"ردیف","نام کالا","کد کالا","فروش فی","فی کارتن","مبلغ تخفیف","درصد تخفیف","تعداد جزء","تعداد کل","کد انبار","کد واسطه","کد راننده","نام راننده"}));
RDebugUtils.currentLine=67108871;
 //BA.debugLineNum = 67108871;BA.debugLine="Table1.LoadSListRizFactorHavale(Listkala,Lst_ColN";
mostCurrent._table1._loadslistrizfactorhavale /*String*/ (null,mostCurrent._listkala,_lst_colnametitle,(int) (13));
RDebugUtils.currentLine=67108874;
 //BA.debugLineNum = 67108874;BA.debugLine="Table1.SetColumnsWidths(Array As Int(50dip,100dip";
mostCurrent._table1._setcolumnswidths /*String*/ (null,new int[]{anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (70)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (70)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (70)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (70)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (80)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (90)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (80)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (80)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (150))});
RDebugUtils.currentLine=67108877;
 //BA.debugLineNum = 67108877;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=67108878;
 //BA.debugLineNum = 67108878;BA.debugLine="End Sub";
return "";
}
public static String  _loadcheck() throws Exception{
RDebugUtils.currentModule="act_rizefactorhavale";
if (Debug.shouldDelegate(mostCurrent.activityBA, "loadcheck", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "loadcheck", null));}
String _imagesignature = "";
String _dates = "";
String _time = "";
String _queryandroid = "";
String _queryserver = "";
RDebugUtils.currentLine=67829760;
 //BA.debugLineNum = 67829760;BA.debugLine="Sub LoadCheck";
RDebugUtils.currentLine=67829761;
 //BA.debugLineNum = 67829761;BA.debugLine="If File.Exists(File.DirDefaultExternal & \"/Parsi";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal()+"/Parsik/Signature",mostCurrent._mcode._c_tafzili /*String*/ +".png")) { 
RDebugUtils.currentLine=67829762;
 //BA.debugLineNum = 67829762;BA.debugLine="Log(\"Check\")";
anywheresoftware.b4a.keywords.Common.LogImpl("567829762","Check",0);
RDebugUtils.currentLine=67829763;
 //BA.debugLineNum = 67829763;BA.debugLine="Dim ImageSignature As String";
_imagesignature = "";
RDebugUtils.currentLine=67829764;
 //BA.debugLineNum = 67829764;BA.debugLine="Dim DateS As String =MCode.DatePersian";
_dates = mostCurrent._mcode._datepersian /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=67829765;
 //BA.debugLineNum = 67829765;BA.debugLine="Dim Time As String =DateTime.Time(DateTime.Now)";
_time = anywheresoftware.b4a.keywords.Common.DateTime.Time(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
RDebugUtils.currentLine=67829766;
 //BA.debugLineNum = 67829766;BA.debugLine="ImageSignature =MCode.Encrypted(MCode.ConvertBlo";
_imagesignature = mostCurrent._mcode._encrypted /*String*/ (mostCurrent.activityBA,mostCurrent._mcode._convertblobtostring /*String*/ (mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal()+"/Parsik/Signature",mostCurrent._mcode._c_tafzili /*String*/ +".png"));
RDebugUtils.currentLine=67829769;
 //BA.debugLineNum = 67829769;BA.debugLine="Try";
try {RDebugUtils.currentLine=67829770;
 //BA.debugLineNum = 67829770;BA.debugLine="Dim QueryAndroid As String=\"Update TblRizFactor";
_queryandroid = "Update TblRizFactorHavale "+"set fldVaziat='1',fldDateTahvil='"+_dates+"',fldTimeTahvil='"+_time+"',fldLat='"+mostCurrent._mcode._lat /*String*/ +"',fldLon='"+mostCurrent._mcode._lon /*String*/ +"',fldSignature='"+_imagesignature+"'"+"where fldShomareFactor='"+mostCurrent._lblshomarefactor.getText()+"' and fldShomareHavale='"+mostCurrent._lblshomarehavale.getText()+"'";
RDebugUtils.currentLine=67829774;
 //BA.debugLineNum = 67829774;BA.debugLine="MCode.SaveUpdate(QueryAndroid)";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,_queryandroid);
RDebugUtils.currentLine=67829776;
 //BA.debugLineNum = 67829776;BA.debugLine="Dim queryServer As String=\"Update zomorodo_maji";
_queryserver = "Update zomorodo_majidmarashi.tblHavaleGroohi Set fldVaziat=1,fldDateTahvil="+_dates+",fldTimeTahvil='"+_time+"',fldLat='"+mostCurrent._mcode._lat /*String*/ +"',fldLon='"+mostCurrent._mcode._lon /*String*/ +"',fldSignature='"+_imagesignature+"' where fldShomareFactor="+mostCurrent._lblshomarefactor.getText();
RDebugUtils.currentLine=67829777;
 //BA.debugLineNum = 67829777;BA.debugLine="SendVaziat(queryServer)";
_sendvaziat(_queryserver);
 } 
       catch (Exception e13) {
			processBA.setLastException(e13);RDebugUtils.currentLine=67829779;
 //BA.debugLineNum = 67829779;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("567829779",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 };
 };
RDebugUtils.currentLine=67829784;
 //BA.debugLineNum = 67829784;BA.debugLine="End Sub";
return "";
}
public static String  _sendvaziat(String _query) throws Exception{
RDebugUtils.currentModule="act_rizefactorhavale";
if (Debug.shouldDelegate(mostCurrent.activityBA, "sendvaziat", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "sendvaziat", new Object[] {_query}));}
RDebugUtils.currentLine=67895296;
 //BA.debugLineNum = 67895296;BA.debugLine="Private Sub SendVaziat(Query As String)";
RDebugUtils.currentLine=67895297;
 //BA.debugLineNum = 67895297;BA.debugLine="CallSubDelayed2(Service_Server,\"SendUpdateQuery\",";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(mostCurrent._service_server.getObject()),"SendUpdateQuery",(Object)(_query));
RDebugUtils.currentLine=67895298;
 //BA.debugLineNum = 67895298;BA.debugLine="File.Delete(File.DirDefaultExternal & \"/Parsik/Si";
anywheresoftware.b4a.keywords.Common.File.Delete(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal()+"/Parsik/Signature",mostCurrent._mcode._c_tafzili /*String*/ +".png");
RDebugUtils.currentLine=67895299;
 //BA.debugLineNum = 67895299;BA.debugLine="End Sub";
return "";
}
public static void  _mapfragment1_ready() throws Exception{
RDebugUtils.currentModule="act_rizefactorhavale";
if (Debug.shouldDelegate(mostCurrent.activityBA, "mapfragment1_ready", false))
	 {Debug.delegate(mostCurrent.activityBA, "mapfragment1_ready", null); return;}
ResumableSub_MapFragment1_Ready rsub = new ResumableSub_MapFragment1_Ready(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_MapFragment1_Ready extends BA.ResumableSub {
public ResumableSub_MapFragment1_Ready(ir.parsikhesab.pakhsh.act_rizefactorhavale parent) {
this.parent = parent;
}
ir.parsikhesab.pakhsh.act_rizefactorhavale parent;
String _permission = "";
boolean _result = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_rizefactorhavale";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=67960835;
 //BA.debugLineNum = 67960835;BA.debugLine="Try";
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
RDebugUtils.currentLine=67960836;
 //BA.debugLineNum = 67960836;BA.debugLine="gmap = MapFragment1.GetMap";
parent.mostCurrent._gmap = parent.mostCurrent._mapfragment1.GetMap();
RDebugUtils.currentLine=67960837;
 //BA.debugLineNum = 67960837;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_ACCESS_FINE_LOC";
parent.mostCurrent._rp.CheckAndRequest(processBA,parent.mostCurrent._rp.PERMISSION_ACCESS_FINE_LOCATION);
RDebugUtils.currentLine=67960838;
 //BA.debugLineNum = 67960838;BA.debugLine="Wait For Activity_PermissionResult (Permission A";
anywheresoftware.b4a.keywords.Common.WaitFor("activity_permissionresult", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_rizefactorhavale", "mapfragment1_ready"), null);
this.state = 13;
return;
case 13:
//C
this.state = 4;
_permission = (String) result[0];
_result = (Boolean) result[1];
;
RDebugUtils.currentLine=67960839;
 //BA.debugLineNum = 67960839;BA.debugLine="If Result Then";
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
RDebugUtils.currentLine=67960840;
 //BA.debugLineNum = 67960840;BA.debugLine="gmap.MyLocationEnabled = True";
parent.mostCurrent._gmap.setMyLocationEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=67960844;
 //BA.debugLineNum = 67960844;BA.debugLine="Sleep(200)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_rizefactorhavale", "mapfragment1_ready"),(int) (200));
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
RDebugUtils.currentLine=67960853;
 //BA.debugLineNum = 67960853;BA.debugLine="Log(\"No permission!\")";
anywheresoftware.b4a.keywords.Common.LogImpl("567960853","No permission!",0);
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
RDebugUtils.currentLine=67960856;
 //BA.debugLineNum = 67960856;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("567960856",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=67960857;
 //BA.debugLineNum = 67960857;BA.debugLine="myCode.SendError(LastException, Activity.Title&\"";
parent.mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(parent.mostCurrent._activity.getTitle())+"-MapFragment1_Ready");
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=67960859;
 //BA.debugLineNum = 67960859;BA.debugLine="End Sub";
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
public static String  _t1_tick() throws Exception{
RDebugUtils.currentModule="act_rizefactorhavale";
if (Debug.shouldDelegate(mostCurrent.activityBA, "t1_tick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "t1_tick", null));}
RDebugUtils.currentLine=68026368;
 //BA.debugLineNum = 68026368;BA.debugLine="Sub t1_tick";
RDebugUtils.currentLine=68026369;
 //BA.debugLineNum = 68026369;BA.debugLine="t1.Enabled=False";
_t1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=68026370;
 //BA.debugLineNum = 68026370;BA.debugLine="If gmap.IsInitialized Then";
if (mostCurrent._gmap.IsInitialized()) { 
RDebugUtils.currentLine=68026371;
 //BA.debugLineNum = 68026371;BA.debugLine="Try";
try {RDebugUtils.currentLine=68026377;
 //BA.debugLineNum = 68026377;BA.debugLine="Log(\"GetLocation ok\")";
anywheresoftware.b4a.keywords.Common.LogImpl("568026377","GetLocation ok",0);
RDebugUtils.currentLine=68026390;
 //BA.debugLineNum = 68026390;BA.debugLine="loc.Initialize(gmap.MyLocation.Latitude,gmap.My";
mostCurrent._loc.Initialize(mostCurrent._gmap.getMyLocation().getLatitude(),mostCurrent._gmap.getMyLocation().getLongitude());
RDebugUtils.currentLine=68026391;
 //BA.debugLineNum = 68026391;BA.debugLine="If loc.IsInitialized Then";
if (mostCurrent._loc.IsInitialized()) { 
RDebugUtils.currentLine=68026392;
 //BA.debugLineNum = 68026392;BA.debugLine="MCode.Lat = loc.Latitude";
mostCurrent._mcode._lat /*String*/  = BA.NumberToString(mostCurrent._loc.getLatitude());
RDebugUtils.currentLine=68026393;
 //BA.debugLineNum = 68026393;BA.debugLine="MCode.Lon = loc.Longitude";
mostCurrent._mcode._lon /*String*/  = BA.NumberToString(mostCurrent._loc.getLongitude());
RDebugUtils.currentLine=68026394;
 //BA.debugLineNum = 68026394;BA.debugLine="Log(MCode.Lat)";
anywheresoftware.b4a.keywords.Common.LogImpl("568026394",mostCurrent._mcode._lat /*String*/ ,0);
RDebugUtils.currentLine=68026395;
 //BA.debugLineNum = 68026395;BA.debugLine="Log(MCode.Lon)";
anywheresoftware.b4a.keywords.Common.LogImpl("568026395",mostCurrent._mcode._lon /*String*/ ,0);
RDebugUtils.currentLine=68026396;
 //BA.debugLineNum = 68026396;BA.debugLine="Gps.Stop";
_gps.Stop();
 };
 } 
       catch (Exception e14) {
			processBA.setLastException(e14);RDebugUtils.currentLine=68026400;
 //BA.debugLineNum = 68026400;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("568026400",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=68026401;
 //BA.debugLineNum = 68026401;BA.debugLine="myCode.SendError(LastException, Activity.Title&";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-t1_tick");
 };
 }else {
RDebugUtils.currentLine=68026404;
 //BA.debugLineNum = 68026404;BA.debugLine="t1.Enabled=True";
_t1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=68026406;
 //BA.debugLineNum = 68026406;BA.debugLine="End Sub";
return "";
}
}