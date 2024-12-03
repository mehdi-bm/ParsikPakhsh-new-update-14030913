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

public class act_rizhavale extends Activity implements B4AActivity{
	public static act_rizhavale mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.act_rizhavale");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (act_rizhavale).");
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
		activityBA = new BA(this, layout, processBA, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.act_rizhavale");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "ir.parsikhesab.pakhsh.act_rizhavale", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (act_rizhavale) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (act_rizhavale) Resume **");
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
		return act_rizhavale.class;
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
            BA.LogInfo("** Activity (act_rizhavale) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (act_rizhavale) Pause event (activity is not paused). **");
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
            act_rizhavale mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (act_rizhavale) Resume **");
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
public static ir.parsikhesab.pakhsh.mcode._adapterephavale _item1 = null;
public anywheresoftware.b4a.objects.RuntimePermissions _rp = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblsumfactor = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblcountfactor = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbldate = null;
public wir.hitex.recycler.Hitex_LayoutView _hlv = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnl_hlv = null;
public anywheresoftware.b4a.objects.collections.List _listfaktor = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblshomarehavale = null;
public anywheresoftware.b4a.objects.MapFragmentWrapper _mapfragment1 = null;
public anywheresoftware.b4a.objects.MapFragmentWrapper.GoogleMapWrapper _gmap = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbllat = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbllon = null;
public de.amberhome.objects.appcompat.ACSwitchCompatWrapper _swlocation = null;
public igolub.fused.b4a.location.FusedLocationProviderClientWrapper _fused = null;
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
RDebugUtils.currentModule="act_rizhavale";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=69926912;
 //BA.debugLineNum = 69926912;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=69926914;
 //BA.debugLineNum = 69926914;BA.debugLine="Try";
try {RDebugUtils.currentLine=69926915;
 //BA.debugLineNum = 69926915;BA.debugLine="Activity.LoadLayout(\"l_RizeHavale\")";
mostCurrent._activity.LoadLayout("l_RizeHavale",mostCurrent.activityBA);
RDebugUtils.currentLine=69926916;
 //BA.debugLineNum = 69926916;BA.debugLine="Fused.Initialize(\"FusedLocation\")";
mostCurrent._fused.Initialize(processBA,"FusedLocation");
RDebugUtils.currentLine=69926917;
 //BA.debugLineNum = 69926917;BA.debugLine="Gps.Initialize(\"Gps\")";
_gps.Initialize("Gps");
RDebugUtils.currentLine=69926918;
 //BA.debugLineNum = 69926918;BA.debugLine="t1.Initialize(\"t1\",1000)";
_t1.Initialize(processBA,"t1",(long) (1000));
RDebugUtils.currentLine=69926919;
 //BA.debugLineNum = 69926919;BA.debugLine="HLV.Initializer(\"HLV\").ListView.Build";
mostCurrent._hlv.Initializer(mostCurrent.activityBA,"HLV").ListView().Build();
RDebugUtils.currentLine=69926920;
 //BA.debugLineNum = 69926920;BA.debugLine="pnl_HLV.AddView(HLV,0,0,pnl_HLV.Width,pnl_HLV.Hei";
mostCurrent._pnl_hlv.AddView((android.view.View)(mostCurrent._hlv.getObject()),(int) (0),(int) (0),mostCurrent._pnl_hlv.getWidth(),mostCurrent._pnl_hlv.getHeight());
RDebugUtils.currentLine=69926921;
 //BA.debugLineNum = 69926921;BA.debugLine="ListFaktor.Initialize";
mostCurrent._listfaktor.Initialize();
RDebugUtils.currentLine=69926923;
 //BA.debugLineNum = 69926923;BA.debugLine="HLV.Ripple.Color(0xFF909090)";
mostCurrent._hlv.Ripple().Color(((int)0xff909090));
RDebugUtils.currentLine=69926925;
 //BA.debugLineNum = 69926925;BA.debugLine="HLV.Show";
mostCurrent._hlv.Show();
 } 
       catch (Exception e12) {
			processBA.setLastException(e12);RDebugUtils.currentLine=69926928;
 //BA.debugLineNum = 69926928;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("569926928",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=69926929;
 //BA.debugLineNum = 69926929;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-Activity_Create");
 };
RDebugUtils.currentLine=69926932;
 //BA.debugLineNum = 69926932;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="act_rizhavale";
RDebugUtils.currentLine=70713344;
 //BA.debugLineNum = 70713344;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=70713346;
 //BA.debugLineNum = 70713346;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="act_rizhavale";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=70582272;
 //BA.debugLineNum = 70582272;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=70582273;
 //BA.debugLineNum = 70582273;BA.debugLine="If SwLocation.Checked Then";
if (mostCurrent._swlocation.getChecked()) { 
RDebugUtils.currentLine=70582274;
 //BA.debugLineNum = 70582274;BA.debugLine="SaveGps";
_savegps();
 }else {
RDebugUtils.currentLine=70582276;
 //BA.debugLineNum = 70582276;BA.debugLine="Create";
_create();
 };
RDebugUtils.currentLine=70582281;
 //BA.debugLineNum = 70582281;BA.debugLine="HLV.notifyDataSetChanged";
mostCurrent._hlv.notifyDataSetChanged();
RDebugUtils.currentLine=70582282;
 //BA.debugLineNum = 70582282;BA.debugLine="End Sub";
return "";
}
public static String  _savegps() throws Exception{
RDebugUtils.currentModule="act_rizhavale";
if (Debug.shouldDelegate(mostCurrent.activityBA, "savegps", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "savegps", null));}
RDebugUtils.currentLine=70057984;
 //BA.debugLineNum = 70057984;BA.debugLine="Sub SaveGps";
RDebugUtils.currentLine=70057985;
 //BA.debugLineNum = 70057985;BA.debugLine="Try";
try {RDebugUtils.currentLine=70057986;
 //BA.debugLineNum = 70057986;BA.debugLine="If Gps.GPSEnabled=False Then";
if (_gps.getGPSEnabled()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=70057987;
 //BA.debugLineNum = 70057987;BA.debugLine="ToastMessageShow(\"موقعیت مکانی خود را روشن کنید\"";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("موقعیت مکانی خود را روشن کنید"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=70057988;
 //BA.debugLineNum = 70057988;BA.debugLine="t1.Enabled=False";
_t1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=70057989;
 //BA.debugLineNum = 70057989;BA.debugLine="StartActivity(Gps.LocationSettingsIntent)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(_gps.getLocationSettingsIntent()));
 }else {
RDebugUtils.currentLine=70057992;
 //BA.debugLineNum = 70057992;BA.debugLine="t1.Enabled=True";
_t1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 };
 } 
       catch (Exception e10) {
			processBA.setLastException(e10);RDebugUtils.currentLine=70057996;
 //BA.debugLineNum = 70057996;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("570057996",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=70057997;
 //BA.debugLineNum = 70057997;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-SaveGps");
 };
RDebugUtils.currentLine=70057999;
 //BA.debugLineNum = 70057999;BA.debugLine="End Sub";
return "";
}
public static String  _create() throws Exception{
RDebugUtils.currentModule="act_rizhavale";
if (Debug.shouldDelegate(mostCurrent.activityBA, "create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "create", null));}
RDebugUtils.currentLine=69992448;
 //BA.debugLineNum = 69992448;BA.debugLine="Sub Create";
RDebugUtils.currentLine=69992449;
 //BA.debugLineNum = 69992449;BA.debugLine="Try";
try {RDebugUtils.currentLine=69992450;
 //BA.debugLineNum = 69992450;BA.debugLine="ProgressDialogShow(\"در حال بارگذاری اطلاعات . . .";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("در حال بارگذاری اطلاعات . . ."));
RDebugUtils.currentLine=69992451;
 //BA.debugLineNum = 69992451;BA.debugLine="lblShomareHavale.Text=Item1.fldShomareHavale";
mostCurrent._lblshomarehavale.setText(BA.ObjectToCharSequence(_item1.fldShomareHavale /*String*/ ));
RDebugUtils.currentLine=69992452;
 //BA.debugLineNum = 69992452;BA.debugLine="LblDate.Text=MCode.PersianDateDash(Item1.fldDate)";
mostCurrent._lbldate.setText(BA.ObjectToCharSequence(mostCurrent._mcode._persiandatedash /*String*/ (mostCurrent.activityBA,_item1.fldDate /*String*/ )));
RDebugUtils.currentLine=69992453;
 //BA.debugLineNum = 69992453;BA.debugLine="LblCountFactor.Text=Item1.fldCountFactor";
mostCurrent._lblcountfactor.setText(BA.ObjectToCharSequence(_item1.fldCountFactor /*String*/ ));
RDebugUtils.currentLine=69992454;
 //BA.debugLineNum = 69992454;BA.debugLine="If Item1.fldMandeFactor>0 Then";
if ((double)(Double.parseDouble(_item1.fldMandeFactor /*String*/ ))>0) { 
RDebugUtils.currentLine=69992455;
 //BA.debugLineNum = 69992455;BA.debugLine="LblSumFactor.Text=MCode.qomaAshar(Item1.fldMande";
mostCurrent._lblsumfactor.setText(BA.ObjectToCharSequence(mostCurrent._mcode._qomaashar /*String*/ (mostCurrent.activityBA,(Object)(_item1.fldMandeFactor /*String*/ ))+" "+mostCurrent._mcode._vahedpool /*String*/ ));
 }else {
RDebugUtils.currentLine=69992457;
 //BA.debugLineNum = 69992457;BA.debugLine="LblSumFactor.Text=0";
mostCurrent._lblsumfactor.setText(BA.ObjectToCharSequence(0));
 };
RDebugUtils.currentLine=69992459;
 //BA.debugLineNum = 69992459;BA.debugLine="LblLat.Text=MCode.Lat";
mostCurrent._lbllat.setText(BA.ObjectToCharSequence(mostCurrent._mcode._lat /*String*/ ));
RDebugUtils.currentLine=69992460;
 //BA.debugLineNum = 69992460;BA.debugLine="LoadData";
_loaddata();
RDebugUtils.currentLine=69992461;
 //BA.debugLineNum = 69992461;BA.debugLine="LblLon.Text=MCode.Lon";
mostCurrent._lbllon.setText(BA.ObjectToCharSequence(mostCurrent._mcode._lon /*String*/ ));
 } 
       catch (Exception e15) {
			processBA.setLastException(e15);RDebugUtils.currentLine=69992463;
 //BA.debugLineNum = 69992463;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("569992463",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=69992464;
 //BA.debugLineNum = 69992464;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-Create");
 };
RDebugUtils.currentLine=69992467;
 //BA.debugLineNum = 69992467;BA.debugLine="End Sub";
return "";
}
public static boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
RDebugUtils.currentModule="act_rizhavale";
if (Debug.shouldDelegate(mostCurrent.activityBA, "application_error", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "application_error", new Object[] {_error,_stacktrace}));}
RDebugUtils.currentLine=70975488;
 //BA.debugLineNum = 70975488;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
RDebugUtils.currentLine=70975490;
 //BA.debugLineNum = 70975490;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=70975491;
 //BA.debugLineNum = 70975491;BA.debugLine="End Sub";
return false;
}
public static String  _btnlistprofile_click() throws Exception{
RDebugUtils.currentModule="act_rizhavale";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnlistprofile_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnlistprofile_click", null));}
RDebugUtils.currentLine=70647808;
 //BA.debugLineNum = 70647808;BA.debugLine="Sub BtnListProfile_Click";
RDebugUtils.currentLine=70647811;
 //BA.debugLineNum = 70647811;BA.debugLine="End Sub";
return "";
}
public static String  _loaddata() throws Exception{
RDebugUtils.currentModule="act_rizhavale";
if (Debug.shouldDelegate(mostCurrent.activityBA, "loaddata", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "loaddata", null));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cr = null;
int _i = 0;
ir.parsikhesab.pakhsh.mcode._adapterizhavale _item = null;
RDebugUtils.currentLine=70254592;
 //BA.debugLineNum = 70254592;BA.debugLine="Sub LoadData";
RDebugUtils.currentLine=70254593;
 //BA.debugLineNum = 70254593;BA.debugLine="Try";
try {RDebugUtils.currentLine=70254594;
 //BA.debugLineNum = 70254594;BA.debugLine="ListFaktor.Clear";
mostCurrent._listfaktor.Clear();
RDebugUtils.currentLine=70254595;
 //BA.debugLineNum = 70254595;BA.debugLine="Dim cr As Cursor=MCode.Result(\"select fldShomareF";
_cr = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cr = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"select fldShomareFactor,Sum(fldMablaghKhales) as fldMablaghKhales,fldDate,fldCodeTafzili,fldSharhTafzili,fldLat,fldLon,fldTell,fldAddress,fldVaziat from TblRizFactorHavale where fldShomareHavale="+mostCurrent._lblshomarehavale.getText()+" GROUP BY fldShomareFactor");
RDebugUtils.currentLine=70254596;
 //BA.debugLineNum = 70254596;BA.debugLine="If cr.RowCount>0 Then";
if (_cr.getRowCount()>0) { 
RDebugUtils.currentLine=70254599;
 //BA.debugLineNum = 70254599;BA.debugLine="For i=0 To cr.RowCount-1";
{
final int step5 = 1;
final int limit5 = (int) (_cr.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=70254600;
 //BA.debugLineNum = 70254600;BA.debugLine="cr.Position=i";
_cr.setPosition(_i);
RDebugUtils.currentLine=70254601;
 //BA.debugLineNum = 70254601;BA.debugLine="Dim Item As AdapteRizHavale";
_item = new ir.parsikhesab.pakhsh.mcode._adapterizhavale();
RDebugUtils.currentLine=70254602;
 //BA.debugLineNum = 70254602;BA.debugLine="Item.fldShomareFactor=cr.GetString(\"fldShomareF";
_item.fldShomareFactor /*String*/  = _cr.GetString("fldShomareFactor");
RDebugUtils.currentLine=70254603;
 //BA.debugLineNum = 70254603;BA.debugLine="Item.fldMablaghKhales=cr.GetString(\"fldMablaghK";
_item.fldMablaghKhales /*String*/  = _cr.GetString("fldMablaghKhales");
RDebugUtils.currentLine=70254604;
 //BA.debugLineNum = 70254604;BA.debugLine="Item.fldDate=cr.GetString(\"fldDate\")";
_item.fldDate /*String*/  = _cr.GetString("fldDate");
RDebugUtils.currentLine=70254605;
 //BA.debugLineNum = 70254605;BA.debugLine="Item.fldCodeTafzili=cr.GetString(\"fldCodeTafzil";
_item.fldCodeTafzili /*String*/  = _cr.GetString("fldCodeTafzili");
RDebugUtils.currentLine=70254606;
 //BA.debugLineNum = 70254606;BA.debugLine="Item.fldSharhTafzili=cr.GetString(\"fldSharhTafz";
_item.fldSharhTafzili /*String*/  = _cr.GetString("fldSharhTafzili");
RDebugUtils.currentLine=70254607;
 //BA.debugLineNum = 70254607;BA.debugLine="Item.fldLat=cr.GetString(\"fldLat\")";
_item.fldLat /*String*/  = _cr.GetString("fldLat");
RDebugUtils.currentLine=70254608;
 //BA.debugLineNum = 70254608;BA.debugLine="Item.fldLon=cr.GetString(\"fldLon\")";
_item.fldLon /*String*/  = _cr.GetString("fldLon");
RDebugUtils.currentLine=70254609;
 //BA.debugLineNum = 70254609;BA.debugLine="Item.fldTell=cr.GetString(\"fldTell\")";
_item.fldTell /*String*/  = _cr.GetString("fldTell");
RDebugUtils.currentLine=70254610;
 //BA.debugLineNum = 70254610;BA.debugLine="Item.fldAddress=cr.GetString(\"fldAddress\")";
_item.fldAddress /*String*/  = _cr.GetString("fldAddress");
RDebugUtils.currentLine=70254611;
 //BA.debugLineNum = 70254611;BA.debugLine="Item.fldVaziat=cr.GetString(\"fldVaziat\")";
_item.fldVaziat /*String*/  = _cr.GetString("fldVaziat");
RDebugUtils.currentLine=70254612;
 //BA.debugLineNum = 70254612;BA.debugLine="If SwLocation.Checked Then";
if (mostCurrent._swlocation.getChecked()) { 
RDebugUtils.currentLine=70254613;
 //BA.debugLineNum = 70254613;BA.debugLine="If Item.fldLat<>\"\" And Item.fldLon<>\"\" Then";
if ((_item.fldLat /*String*/ ).equals("") == false && (_item.fldLon /*String*/ ).equals("") == false) { 
RDebugUtils.currentLine=70254614;
 //BA.debugLineNum = 70254614;BA.debugLine="Item.Distance=MCode.CalculateDistance(MCode.L";
_item.Distance /*String*/  = BA.NumberToString(mostCurrent._mcode._calculatedistance /*long*/ (mostCurrent.activityBA,mostCurrent._mcode._lat /*String*/ ,mostCurrent._mcode._lon /*String*/ ,_item.fldLat /*String*/ ,_item.fldLon /*String*/ ));
 }else {
RDebugUtils.currentLine=70254616;
 //BA.debugLineNum = 70254616;BA.debugLine="Item.Distance=0";
_item.Distance /*String*/  = BA.NumberToString(0);
 };
 }else {
RDebugUtils.currentLine=70254619;
 //BA.debugLineNum = 70254619;BA.debugLine="Item.Distance=0";
_item.Distance /*String*/  = BA.NumberToString(0);
 };
RDebugUtils.currentLine=70254624;
 //BA.debugLineNum = 70254624;BA.debugLine="ListFaktor.Add(Item)";
mostCurrent._listfaktor.Add((Object)(_item));
 }
};
RDebugUtils.currentLine=70254628;
 //BA.debugLineNum = 70254628;BA.debugLine="If SwLocation.Checked Then";
if (mostCurrent._swlocation.getChecked()) { 
RDebugUtils.currentLine=70254629;
 //BA.debugLineNum = 70254629;BA.debugLine="ListFaktor.SortType(\"Distance\",True)";
mostCurrent._listfaktor.SortType("Distance",anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=70254631;
 //BA.debugLineNum = 70254631;BA.debugLine="HLV.notifyDataSetChanged";
mostCurrent._hlv.notifyDataSetChanged();
RDebugUtils.currentLine=70254632;
 //BA.debugLineNum = 70254632;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 };
 } 
       catch (Exception e36) {
			processBA.setLastException(e36);RDebugUtils.currentLine=70254635;
 //BA.debugLineNum = 70254635;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("570254635",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=70254636;
 //BA.debugLineNum = 70254636;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-LoadData");
 };
RDebugUtils.currentLine=70254638;
 //BA.debugLineNum = 70254638;BA.debugLine="End Sub";
return "";
}
public static void  _getlocation() throws Exception{
RDebugUtils.currentModule="act_rizhavale";
if (Debug.shouldDelegate(mostCurrent.activityBA, "getlocation", false))
	 {Debug.delegate(mostCurrent.activityBA, "getlocation", null); return;}
ResumableSub_GetLocation rsub = new ResumableSub_GetLocation(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_GetLocation extends BA.ResumableSub {
public ResumableSub_GetLocation(ir.parsikhesab.pakhsh.act_rizhavale parent) {
this.parent = parent;
}
ir.parsikhesab.pakhsh.act_rizhavale parent;
boolean _available = false;
igolub.fused.b4a.location.LocationResultWrapper _result = null;
igolub.fused.b4a.location.android.location.LocationFWrapper _lastlocation = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_rizhavale";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=70123521;
 //BA.debugLineNum = 70123521;BA.debugLine="If Fused.IsLocationEnabledInSettings Then";
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
RDebugUtils.currentLine=70123522;
 //BA.debugLineNum = 70123522;BA.debugLine="Fused.GetLocationAvailability";
parent.mostCurrent._fused.GetLocationAvailability();
RDebugUtils.currentLine=70123524;
 //BA.debugLineNum = 70123524;BA.debugLine="Wait For FusedLocation_LocationAvailabilityReque";
anywheresoftware.b4a.keywords.Common.WaitFor("fusedlocation_locationavailabilityrequestcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_rizhavale", "getlocation"), null);
this.state = 21;
return;
case 21:
//C
this.state = 4;
_available = (Boolean) result[0];
;
RDebugUtils.currentLine=70123525;
 //BA.debugLineNum = 70123525;BA.debugLine="Log(\"LocationAvailable=\" & Available)";
anywheresoftware.b4a.keywords.Common.LogImpl("570123525","LocationAvailable="+BA.ObjectToString(_available),0);
RDebugUtils.currentLine=70123526;
 //BA.debugLineNum = 70123526;BA.debugLine="If Available Then";
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
RDebugUtils.currentLine=70123527;
 //BA.debugLineNum = 70123527;BA.debugLine="Fused.GetLastLocation";
parent.mostCurrent._fused.GetLastLocation();
RDebugUtils.currentLine=70123528;
 //BA.debugLineNum = 70123528;BA.debugLine="Wait For FusedLocation_LocationRequestCompleted";
anywheresoftware.b4a.keywords.Common.WaitFor("fusedlocation_locationrequestcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_rizhavale", "getlocation"), null);
this.state = 22;
return;
case 22:
//C
this.state = 7;
_result = (igolub.fused.b4a.location.LocationResultWrapper) result[0];
;
RDebugUtils.currentLine=70123529;
 //BA.debugLineNum = 70123529;BA.debugLine="If Result.Status=LocationResult.STATUS_SUCCESSF";
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
RDebugUtils.currentLine=70123530;
 //BA.debugLineNum = 70123530;BA.debugLine="If Result.Location.IsInitialized Then";
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
RDebugUtils.currentLine=70123531;
 //BA.debugLineNum = 70123531;BA.debugLine="Dim LastLocation As LocationF = Result.Locati";
_lastlocation = new igolub.fused.b4a.location.android.location.LocationFWrapper();
_lastlocation = _result.getLocation();
RDebugUtils.currentLine=70123532;
 //BA.debugLineNum = 70123532;BA.debugLine="Log(\"LastLocation Latitude = \" & LastLocation";
anywheresoftware.b4a.keywords.Common.LogImpl("570123532","LastLocation Latitude = "+BA.NumberToString(_lastlocation.getLatitude()),0);
RDebugUtils.currentLine=70123533;
 //BA.debugLineNum = 70123533;BA.debugLine="Log(\"LastLocation Longitude = \" & LastLocatio";
anywheresoftware.b4a.keywords.Common.LogImpl("570123533","LastLocation Longitude = "+BA.NumberToString(_lastlocation.getLongitude()),0);
RDebugUtils.currentLine=70123535;
 //BA.debugLineNum = 70123535;BA.debugLine="MCode.Lat = LastLocation.Latitude";
parent.mostCurrent._mcode._lat /*String*/  = BA.NumberToString(_lastlocation.getLatitude());
RDebugUtils.currentLine=70123536;
 //BA.debugLineNum = 70123536;BA.debugLine="MCode.Lon = LastLocation.Longitude";
parent.mostCurrent._mcode._lon /*String*/  = BA.NumberToString(_lastlocation.getLongitude());
RDebugUtils.currentLine=70123537;
 //BA.debugLineNum = 70123537;BA.debugLine="Create";
_create();
 if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=70123539;
 //BA.debugLineNum = 70123539;BA.debugLine="Log(\"Unknown last location\")";
anywheresoftware.b4a.keywords.Common.LogImpl("570123539","Unknown last location",0);
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
RDebugUtils.currentLine=70123544;
 //BA.debugLineNum = 70123544;BA.debugLine="MsgboxAsync(\"Location is turned off in devices's";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Location is turned off in devices's settings. Turn it on."),BA.ObjectToCharSequence("Warning"),processBA);
RDebugUtils.currentLine=70123545;
 //BA.debugLineNum = 70123545;BA.debugLine="StartActivity(Fused.LocationSettingsIntent)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._fused.getLocationSettingsIntent().getObject()));
 if (true) break;

case 20:
//C
this.state = -1;
;
RDebugUtils.currentLine=70123547;
 //BA.debugLineNum = 70123547;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static int  _hlv_getitemcount() throws Exception{
RDebugUtils.currentModule="act_rizhavale";
if (Debug.shouldDelegate(mostCurrent.activityBA, "hlv_getitemcount", false))
	 {return ((Integer) Debug.delegate(mostCurrent.activityBA, "hlv_getitemcount", null));}
RDebugUtils.currentLine=70320128;
 //BA.debugLineNum = 70320128;BA.debugLine="Sub HLV_GetItemCount As Int 								        '💯 It";
RDebugUtils.currentLine=70320129;
 //BA.debugLineNum = 70320129;BA.debugLine="Return ListFaktor.Size";
if (true) return mostCurrent._listfaktor.getSize();
RDebugUtils.currentLine=70320130;
 //BA.debugLineNum = 70320130;BA.debugLine="End Sub";
return 0;
}
public static String  _hlv_itemclick(anywheresoftware.b4a.objects.PanelWrapper _clickeditem,int _position) throws Exception{
RDebugUtils.currentModule="act_rizhavale";
if (Debug.shouldDelegate(mostCurrent.activityBA, "hlv_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "hlv_itemclick", new Object[] {_clickeditem,_position}));}
ir.parsikhesab.pakhsh.cls_rizhavale _rec = null;
RDebugUtils.currentLine=70516736;
 //BA.debugLineNum = 70516736;BA.debugLine="Sub HLV_ItemClick (ClickedItem As Panel, Position";
RDebugUtils.currentLine=70516737;
 //BA.debugLineNum = 70516737;BA.debugLine="Dim rec As Cls_RizHavale=ClickedItem.Tag";
_rec = (ir.parsikhesab.pakhsh.cls_rizhavale)(_clickeditem.getTag());
RDebugUtils.currentLine=70516738;
 //BA.debugLineNum = 70516738;BA.debugLine="rec.lblShowHavale_Click";
_rec._lblshowhavale_click /*String*/ (null);
RDebugUtils.currentLine=70516739;
 //BA.debugLineNum = 70516739;BA.debugLine="End Sub";
return "";
}
public static String  _hlv_onbindviewholder(anywheresoftware.b4a.objects.PanelWrapper _parent,int _position) throws Exception{
RDebugUtils.currentModule="act_rizhavale";
if (Debug.shouldDelegate(mostCurrent.activityBA, "hlv_onbindviewholder", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "hlv_onbindviewholder", new Object[] {_parent,_position}));}
ir.parsikhesab.pakhsh.mcode._adapterizhavale _item = null;
ir.parsikhesab.pakhsh.cls_rizhavale _rec = null;
RDebugUtils.currentLine=70451200;
 //BA.debugLineNum = 70451200;BA.debugLine="Sub HLV_onBindViewHolder (Parent As Panel, Positio";
RDebugUtils.currentLine=70451202;
 //BA.debugLineNum = 70451202;BA.debugLine="Dim Item = ListFaktor.Get(Position) As AdapteRizH";
_item = (ir.parsikhesab.pakhsh.mcode._adapterizhavale)(mostCurrent._listfaktor.Get(_position));
RDebugUtils.currentLine=70451203;
 //BA.debugLineNum = 70451203;BA.debugLine="Dim rec As Cls_RizHavale=Parent.Tag";
_rec = (ir.parsikhesab.pakhsh.cls_rizhavale)(_parent.getTag());
RDebugUtils.currentLine=70451204;
 //BA.debugLineNum = 70451204;BA.debugLine="rec.shomareHavale=lblShomareHavale.Text";
_rec._shomarehavale /*String*/  = mostCurrent._lblshomarehavale.getText();
RDebugUtils.currentLine=70451205;
 //BA.debugLineNum = 70451205;BA.debugLine="rec.Show(Item,Position)";
_rec._show /*String*/ (null,_item,_position);
RDebugUtils.currentLine=70451206;
 //BA.debugLineNum = 70451206;BA.debugLine="Parent.Height=rec.Height";
_parent.setHeight(_rec._getheight /*int*/ (null));
RDebugUtils.currentLine=70451207;
 //BA.debugLineNum = 70451207;BA.debugLine="End Sub";
return "";
}
public static String  _hlv_oncreateviewholder(anywheresoftware.b4a.objects.PanelWrapper _parent,int _viewtype) throws Exception{
RDebugUtils.currentModule="act_rizhavale";
if (Debug.shouldDelegate(mostCurrent.activityBA, "hlv_oncreateviewholder", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "hlv_oncreateviewholder", new Object[] {_parent,_viewtype}));}
ir.parsikhesab.pakhsh.cls_rizhavale _rec = null;
RDebugUtils.currentLine=70385664;
 //BA.debugLineNum = 70385664;BA.debugLine="Sub HLV_onCreateViewHolder (Parent As Panel, ViewT";
RDebugUtils.currentLine=70385665;
 //BA.debugLineNum = 70385665;BA.debugLine="Dim rec As Cls_RizHavale";
_rec = new ir.parsikhesab.pakhsh.cls_rizhavale();
RDebugUtils.currentLine=70385666;
 //BA.debugLineNum = 70385666;BA.debugLine="rec.Initialize(Me)";
_rec._initialize /*String*/ (null,mostCurrent.activityBA,act_rizhavale.getObject());
RDebugUtils.currentLine=70385667;
 //BA.debugLineNum = 70385667;BA.debugLine="Parent.AddView(rec.Panel,0,0,100%x,rec.Height)";
_parent.AddView((android.view.View)(_rec._getpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ (null).getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),_rec._getheight /*int*/ (null));
RDebugUtils.currentLine=70385668;
 //BA.debugLineNum = 70385668;BA.debugLine="Parent.Tag=rec";
_parent.setTag((Object)(_rec));
RDebugUtils.currentLine=70385669;
 //BA.debugLineNum = 70385669;BA.debugLine="End Sub";
return "";
}
public static String  _lblback_click() throws Exception{
RDebugUtils.currentModule="act_rizhavale";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lblback_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lblback_click", null));}
RDebugUtils.currentLine=70778880;
 //BA.debugLineNum = 70778880;BA.debugLine="Sub LblBack_Click";
RDebugUtils.currentLine=70778881;
 //BA.debugLineNum = 70778881;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=70778882;
 //BA.debugLineNum = 70778882;BA.debugLine="End Sub";
return "";
}
public static void  _mapfragment1_ready() throws Exception{
RDebugUtils.currentModule="act_rizhavale";
if (Debug.shouldDelegate(mostCurrent.activityBA, "mapfragment1_ready", false))
	 {Debug.delegate(mostCurrent.activityBA, "mapfragment1_ready", null); return;}
ResumableSub_MapFragment1_Ready rsub = new ResumableSub_MapFragment1_Ready(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_MapFragment1_Ready extends BA.ResumableSub {
public ResumableSub_MapFragment1_Ready(ir.parsikhesab.pakhsh.act_rizhavale parent) {
this.parent = parent;
}
ir.parsikhesab.pakhsh.act_rizhavale parent;
String _permission = "";
boolean _result = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_rizhavale";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=70844417;
 //BA.debugLineNum = 70844417;BA.debugLine="Sleep(100)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_rizhavale", "mapfragment1_ready"),(int) (100));
this.state = 13;
return;
case 13:
//C
this.state = 1;
;
RDebugUtils.currentLine=70844418;
 //BA.debugLineNum = 70844418;BA.debugLine="Try";
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
RDebugUtils.currentLine=70844419;
 //BA.debugLineNum = 70844419;BA.debugLine="gmap = MapFragment1.GetMap";
parent.mostCurrent._gmap = parent.mostCurrent._mapfragment1.GetMap();
RDebugUtils.currentLine=70844420;
 //BA.debugLineNum = 70844420;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_ACCESS_FINE_LOC";
parent.mostCurrent._rp.CheckAndRequest(processBA,parent.mostCurrent._rp.PERMISSION_ACCESS_FINE_LOCATION);
RDebugUtils.currentLine=70844421;
 //BA.debugLineNum = 70844421;BA.debugLine="Wait For Activity_PermissionResult (Permission A";
anywheresoftware.b4a.keywords.Common.WaitFor("activity_permissionresult", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_rizhavale", "mapfragment1_ready"), null);
this.state = 14;
return;
case 14:
//C
this.state = 4;
_permission = (String) result[0];
_result = (Boolean) result[1];
;
RDebugUtils.currentLine=70844422;
 //BA.debugLineNum = 70844422;BA.debugLine="If Result Then";
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
RDebugUtils.currentLine=70844423;
 //BA.debugLineNum = 70844423;BA.debugLine="gmap.MyLocationEnabled = True";
parent.mostCurrent._gmap.setMyLocationEnabled(anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=70844425;
 //BA.debugLineNum = 70844425;BA.debugLine="Log(\"No permission!\")";
anywheresoftware.b4a.keywords.Common.LogImpl("570844425","No permission!",0);
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
RDebugUtils.currentLine=70844428;
 //BA.debugLineNum = 70844428;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("570844428",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=70844430;
 //BA.debugLineNum = 70844430;BA.debugLine="End Sub";
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
public static String  _swlocation_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="act_rizhavale";
if (Debug.shouldDelegate(mostCurrent.activityBA, "swlocation_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "swlocation_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=70909952;
 //BA.debugLineNum = 70909952;BA.debugLine="Private Sub SwLocation_CheckedChange(Checked As Bo";
RDebugUtils.currentLine=70909953;
 //BA.debugLineNum = 70909953;BA.debugLine="If Checked Then";
if (_checked) { 
RDebugUtils.currentLine=70909954;
 //BA.debugLineNum = 70909954;BA.debugLine="SaveGps";
_savegps();
 }else {
RDebugUtils.currentLine=70909956;
 //BA.debugLineNum = 70909956;BA.debugLine="Create";
_create();
 };
RDebugUtils.currentLine=70909961;
 //BA.debugLineNum = 70909961;BA.debugLine="HLV.notifyDataSetChanged";
mostCurrent._hlv.notifyDataSetChanged();
RDebugUtils.currentLine=70909962;
 //BA.debugLineNum = 70909962;BA.debugLine="End Sub";
return "";
}
public static String  _t1_tick() throws Exception{
RDebugUtils.currentModule="act_rizhavale";
if (Debug.shouldDelegate(mostCurrent.activityBA, "t1_tick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "t1_tick", null));}
RDebugUtils.currentLine=70189056;
 //BA.debugLineNum = 70189056;BA.debugLine="Sub t1_tick";
RDebugUtils.currentLine=70189058;
 //BA.debugLineNum = 70189058;BA.debugLine="t1.Enabled=False";
_t1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=70189060;
 //BA.debugLineNum = 70189060;BA.debugLine="Try";
try {RDebugUtils.currentLine=70189072;
 //BA.debugLineNum = 70189072;BA.debugLine="GetLocation";
_getlocation();
 } 
       catch (Exception e5) {
			processBA.setLastException(e5);RDebugUtils.currentLine=70189075;
 //BA.debugLineNum = 70189075;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("570189075",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=70189076;
 //BA.debugLineNum = 70189076;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-t1_tick");
 };
RDebugUtils.currentLine=70189079;
 //BA.debugLineNum = 70189079;BA.debugLine="End Sub";
return "";
}
}