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

public class act_profile extends Activity implements B4AActivity{
	public static act_profile mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.act_profile");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (act_profile).");
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
		activityBA = new BA(this, layout, processBA, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.act_profile");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "ir.parsikhesab.pakhsh.act_profile", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (act_profile) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (act_profile) Resume **");
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
		return act_profile.class;
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
            BA.LogInfo("** Activity (act_profile) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (act_profile) Pause event (activity is not paused). **");
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
            act_profile mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (act_profile) Resume **");
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
public static anywheresoftware.b4a.objects.Timer _t_gps = null;
public static boolean _tourvisit = false;
public anywheresoftware.b4a.objects.collections.List _listfaktor = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnl_hlv = null;
public wir.hitex.recycler.Hitex_LayoutView _hlv = null;
public anywheresoftware.b4a.objects.RuntimePermissions _rp = null;
public anywheresoftware.b4a.objects.LabelWrapper _btnshowcheks = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblvaziat = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbladdress = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblmandehesab = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbllastsefaresh = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbllastvisit = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltell = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblname = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button1 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button2 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button3 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button4 = null;
public anywheresoftware.b4a.objects.MapFragmentWrapper.GoogleMapWrapper _gmap = null;
public anywheresoftware.b4a.objects.MapFragmentWrapper _mapfragment1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnl_location = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnl_menu = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_sabt_locastion = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_show_locastion = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_listi = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_default = null;
public anywheresoftware.b4a.objects.LabelWrapper _btnshowmoeen = null;
public static boolean _gotopage = false;
public anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog _dialognewvisit = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbldate = null;
public com.b4a.manamsoftware.PersianDate.ManamPersianDate _mpd = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtdesc = null;
public ir.parsikhesab.pakhsh.httpjob _jobinternet = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltasvie = null;
public static String _mande = "";
public anywheresoftware.b4a.objects.LabelWrapper _lblcode = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblblacklist = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblmandeetebar = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlnextvisit = null;
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
RDebugUtils.currentModule="act_profile";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=56033280;
 //BA.debugLineNum = 56033280;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=56033281;
 //BA.debugLineNum = 56033281;BA.debugLine="Activity.LoadLayout(\"L_Profile\")";
mostCurrent._activity.LoadLayout("L_Profile",mostCurrent.activityBA);
RDebugUtils.currentLine=56033282;
 //BA.debugLineNum = 56033282;BA.debugLine="jobInternet.Initialize(\"jobInternet\",Me)";
mostCurrent._jobinternet._initialize /*String*/ (null,processBA,"jobInternet",act_profile.getObject());
RDebugUtils.currentLine=56033283;
 //BA.debugLineNum = 56033283;BA.debugLine="ListFaktor.Initialize";
mostCurrent._listfaktor.Initialize();
RDebugUtils.currentLine=56033284;
 //BA.debugLineNum = 56033284;BA.debugLine="ListFaktor.Clear";
mostCurrent._listfaktor.Clear();
RDebugUtils.currentLine=56033285;
 //BA.debugLineNum = 56033285;BA.debugLine="Gps.Initialize(\"Gps\")";
_gps.Initialize("Gps");
RDebugUtils.currentLine=56033286;
 //BA.debugLineNum = 56033286;BA.debugLine="t1.Initialize(\"t1\",5000)";
_t1.Initialize(processBA,"t1",(long) (5000));
RDebugUtils.currentLine=56033287;
 //BA.debugLineNum = 56033287;BA.debugLine="T_Gps.Initialize(\"T_Gps\",7000)";
_t_gps.Initialize(processBA,"T_Gps",(long) (7000));
RDebugUtils.currentLine=56033288;
 //BA.debugLineNum = 56033288;BA.debugLine="HLV.Initializer(\"HLV\").ListView.Build";
mostCurrent._hlv.Initializer(mostCurrent.activityBA,"HLV").ListView().Build();
RDebugUtils.currentLine=56033289;
 //BA.debugLineNum = 56033289;BA.debugLine="pnl_HLV.AddView(HLV,0,0,pnl_HLV.Width,pnl_HLV.Hei";
mostCurrent._pnl_hlv.AddView((android.view.View)(mostCurrent._hlv.getObject()),(int) (0),(int) (0),mostCurrent._pnl_hlv.getWidth(),mostCurrent._pnl_hlv.getHeight());
RDebugUtils.currentLine=56033290;
 //BA.debugLineNum = 56033290;BA.debugLine="HLV.Show";
mostCurrent._hlv.Show();
RDebugUtils.currentLine=56033292;
 //BA.debugLineNum = 56033292;BA.debugLine="Log(\"tour: \"&TourVisit)";
anywheresoftware.b4a.keywords.Common.LogImpl("556033292","tour: "+BA.ObjectToString(_tourvisit),0);
RDebugUtils.currentLine=56033293;
 //BA.debugLineNum = 56033293;BA.debugLine="End Sub";
return "";
}
public static boolean  _activity_keypress(int _keycode) throws Exception{
RDebugUtils.currentModule="act_profile";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_keypress", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "activity_keypress", new Object[] {_keycode}));}
RDebugUtils.currentLine=56295424;
 //BA.debugLineNum = 56295424;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
RDebugUtils.currentLine=56295425;
 //BA.debugLineNum = 56295425;BA.debugLine="Try";
try {RDebugUtils.currentLine=56295426;
 //BA.debugLineNum = 56295426;BA.debugLine="If KeyCode=KeyCodes.KEYCODE_BACK Then";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK) { 
RDebugUtils.currentLine=56295427;
 //BA.debugLineNum = 56295427;BA.debugLine="btn_Back_Click";
_btn_back_click();
 };
RDebugUtils.currentLine=56295429;
 //BA.debugLineNum = 56295429;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 } 
       catch (Exception e7) {
			processBA.setLastException(e7);RDebugUtils.currentLine=56295431;
 //BA.debugLineNum = 56295431;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("556295431",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=56295432;
 //BA.debugLineNum = 56295432;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-Activity_KeyPress");
 };
RDebugUtils.currentLine=56295434;
 //BA.debugLineNum = 56295434;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=56295435;
 //BA.debugLineNum = 56295435;BA.debugLine="End Sub";
return false;
}
public static String  _btn_back_click() throws Exception{
RDebugUtils.currentModule="act_profile";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_back_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_back_click", null));}
RDebugUtils.currentLine=56229888;
 //BA.debugLineNum = 56229888;BA.debugLine="Sub btn_Back_Click";
RDebugUtils.currentLine=56229889;
 //BA.debugLineNum = 56229889;BA.debugLine="MCode.C_Tafzili=0";
mostCurrent._mcode._c_tafzili /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=56229890;
 //BA.debugLineNum = 56229890;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=56229891;
 //BA.debugLineNum = 56229891;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="act_profile";
RDebugUtils.currentLine=56164352;
 //BA.debugLineNum = 56164352;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=56164353;
 //BA.debugLineNum = 56164353;BA.debugLine="Gps.Stop";
_gps.Stop();
RDebugUtils.currentLine=56164354;
 //BA.debugLineNum = 56164354;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="act_profile";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=56098816;
 //BA.debugLineNum = 56098816;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=56098819;
 //BA.debugLineNum = 56098819;BA.debugLine="CreatePage";
_createpage();
RDebugUtils.currentLine=56098820;
 //BA.debugLineNum = 56098820;BA.debugLine="LoadListFaktor";
_loadlistfaktor();
RDebugUtils.currentLine=56098823;
 //BA.debugLineNum = 56098823;BA.debugLine="End Sub";
return "";
}
public static void  _createpage() throws Exception{
RDebugUtils.currentModule="act_profile";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createpage", false))
	 {Debug.delegate(mostCurrent.activityBA, "createpage", null); return;}
ResumableSub_CreatePage rsub = new ResumableSub_CreatePage(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_CreatePage extends BA.ResumableSub {
public ResumableSub_CreatePage(ir.parsikhesab.pakhsh.act_profile parent) {
this.parent = parent;
}
ir.parsikhesab.pakhsh.act_profile parent;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
String _st = "";
String _lastvisit = "";
anywheresoftware.b4a.objects.collections.List _str = null;
anywheresoftware.b4a.objects.collections.List _dt = null;
String _lastvisitdate = "";
String _lastvisittime = "";
String _datetimelastsefaresh = "";
String _lastsefareshdate = "";
String _lastsefareshtime = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_profile";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=56623105;
 //BA.debugLineNum = 56623105;BA.debugLine="Sleep(200)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_profile", "createpage"),(int) (200));
this.state = 40;
return;
case 40:
//C
this.state = 1;
;
RDebugUtils.currentLine=56623106;
 //BA.debugLineNum = 56623106;BA.debugLine="Dim Cu As Cursor=MCode.Result(\"Select * From TblA";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = parent.mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblAshkhas Where fldCodetafzili = '"+parent.mostCurrent._mcode._c_tafzili /*String*/ +"'");
RDebugUtils.currentLine=56623107;
 //BA.debugLineNum = 56623107;BA.debugLine="If Cu.RowCount>0 Then";
if (true) break;

case 1:
//if
this.state = 39;
if (_cu.getRowCount()>0) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=56623108;
 //BA.debugLineNum = 56623108;BA.debugLine="Cu.Position=0";
_cu.setPosition((int) (0));
RDebugUtils.currentLine=56623109;
 //BA.debugLineNum = 56623109;BA.debugLine="LblCode.Text=Cu.GetString(\"fldCodetafzili\")";
parent.mostCurrent._lblcode.setText(BA.ObjectToCharSequence(_cu.GetString("fldCodetafzili")));
RDebugUtils.currentLine=56623110;
 //BA.debugLineNum = 56623110;BA.debugLine="LblName.Text=Cu.GetString(\"fldSharheTafzili\")";
parent.mostCurrent._lblname.setText(BA.ObjectToCharSequence(_cu.GetString("fldSharheTafzili")));
RDebugUtils.currentLine=56623111;
 //BA.debugLineNum = 56623111;BA.debugLine="LblVaziat.Text=\"وضعیت : \"&myCode.Is_Null(Cu.GetS";
parent.mostCurrent._lblvaziat.setText(BA.ObjectToCharSequence("وضعیت : "+parent.mostCurrent._mycode._is_null /*String*/ (mostCurrent.activityBA,_cu.GetString("FldVaziat"))));
RDebugUtils.currentLine=56623113;
 //BA.debugLineNum = 56623113;BA.debugLine="If myCode.Is_Null_adad(Cu.GetString(\"fldBlackLis";
if (true) break;

case 4:
//if
this.state = 9;
if ((parent.mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_cu.GetString("fldBlackList"))).equals(BA.NumberToString(1))) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=56623114;
 //BA.debugLineNum = 56623114;BA.debugLine="LblBlackList.Visible=True";
parent.mostCurrent._lblblacklist.setVisible(anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=56623116;
 //BA.debugLineNum = 56623116;BA.debugLine="LblBlackList.Visible=False";
parent.mostCurrent._lblblacklist.setVisible(anywheresoftware.b4a.keywords.Common.False);
 if (true) break;
;
RDebugUtils.currentLine=56623132;
 //BA.debugLineNum = 56623132;BA.debugLine="If IsNumber(Cu.GetString(\"fldMande\")) Then";

case 9:
//if
this.state = 14;
if (anywheresoftware.b4a.keywords.Common.IsNumber(_cu.GetString("fldMande"))) { 
this.state = 11;
}else {
this.state = 13;
}if (true) break;

case 11:
//C
this.state = 14;
RDebugUtils.currentLine=56623133;
 //BA.debugLineNum = 56623133;BA.debugLine="Dim st As String=NumberFormat2(Cu.GetString(\"";
_st = anywheresoftware.b4a.keywords.Common.NumberFormat2((double)(Double.parseDouble(_cu.GetString("fldMande"))),(int) (1),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=56623134;
 //BA.debugLineNum = 56623134;BA.debugLine="mande=Cu.GetString(\"fldMande\")";
parent.mostCurrent._mande = _cu.GetString("fldMande");
RDebugUtils.currentLine=56623135;
 //BA.debugLineNum = 56623135;BA.debugLine="Log(st)";
anywheresoftware.b4a.keywords.Common.LogImpl("556623135",_st,0);
RDebugUtils.currentLine=56623136;
 //BA.debugLineNum = 56623136;BA.debugLine="Sleep(100)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_profile", "createpage"),(int) (100));
this.state = 41;
return;
case 41:
//C
this.state = 14;
;
RDebugUtils.currentLine=56623137;
 //BA.debugLineNum = 56623137;BA.debugLine="LblMandeHesab.Text = st & \" \" & MCode.VahedPo";
parent.mostCurrent._lblmandehesab.setText(BA.ObjectToCharSequence(_st+" "+parent.mostCurrent._mcode._vahedpool /*String*/ ));
 if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=56623139;
 //BA.debugLineNum = 56623139;BA.debugLine="LblMandeHesab.Text=\" 0 \" & MCode.VahedPool";
parent.mostCurrent._lblmandehesab.setText(BA.ObjectToCharSequence(" 0 "+parent.mostCurrent._mcode._vahedpool /*String*/ ));
RDebugUtils.currentLine=56623140;
 //BA.debugLineNum = 56623140;BA.debugLine="mande=0";
parent.mostCurrent._mande = BA.NumberToString(0);
 if (true) break;
;
RDebugUtils.currentLine=56623142;
 //BA.debugLineNum = 56623142;BA.debugLine="If mande>0 Then";

case 14:
//if
this.state = 19;
if ((double)(Double.parseDouble(parent.mostCurrent._mande))>0) { 
this.state = 16;
}else {
this.state = 18;
}if (true) break;

case 16:
//C
this.state = 19;
RDebugUtils.currentLine=56623143;
 //BA.debugLineNum = 56623143;BA.debugLine="LblMandeEtebar.Text=myCode.AdadToPrice(myCode.I";
parent.mostCurrent._lblmandeetebar.setText(BA.ObjectToCharSequence(parent.mostCurrent._mycode._adadtoprice /*String*/ (mostCurrent.activityBA,BA.NumberToString((double)(Double.parseDouble(parent.mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_cu.GetString("fldSaghfeEtebar"))))-(double)(Double.parseDouble(parent.mostCurrent._mande))))));
 if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=56623145;
 //BA.debugLineNum = 56623145;BA.debugLine="LblMandeEtebar.Text=myCode.AdadToPrice(myCode.I";
parent.mostCurrent._lblmandeetebar.setText(BA.ObjectToCharSequence(parent.mostCurrent._mycode._adadtoprice /*String*/ (mostCurrent.activityBA,parent.mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_cu.GetString("fldSaghfeEtebar")))));
 if (true) break;

case 19:
//C
this.state = 20;
;
RDebugUtils.currentLine=56623164;
 //BA.debugLineNum = 56623164;BA.debugLine="Dim LastVisit As String = myCode.Is_Null(Cu.GetS";
_lastvisit = parent.mostCurrent._mycode._is_null /*String*/ (mostCurrent.activityBA,_cu.GetString("lastSeen"));
RDebugUtils.currentLine=56623165;
 //BA.debugLineNum = 56623165;BA.debugLine="If LastVisit.Length = 0 Then";
if (true) break;

case 20:
//if
this.state = 25;
if (_lastvisit.length()==0) { 
this.state = 22;
}else {
this.state = 24;
}if (true) break;

case 22:
//C
this.state = 25;
RDebugUtils.currentLine=56623166;
 //BA.debugLineNum = 56623166;BA.debugLine="LblLastVisit.Text=\"//\"";
parent.mostCurrent._lbllastvisit.setText(BA.ObjectToCharSequence("//"));
 if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=56623168;
 //BA.debugLineNum = 56623168;BA.debugLine="Dim Str As List";
_str = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=56623169;
 //BA.debugLineNum = 56623169;BA.debugLine="Str.Initialize";
_str.Initialize();
RDebugUtils.currentLine=56623170;
 //BA.debugLineNum = 56623170;BA.debugLine="Str = MCode.Sf.Split(LastVisit.Replace(\"-\",\"/\")";
_str = parent.mostCurrent._mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvvv4(_lastvisit.replace("-","/"),"T");
RDebugUtils.currentLine=56623172;
 //BA.debugLineNum = 56623172;BA.debugLine="Dim DT As List = MCode.Sf.Split(Str.get(0),\"/\")";
_dt = new anywheresoftware.b4a.objects.collections.List();
_dt = parent.mostCurrent._mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvvv4(BA.ObjectToString(_str.Get((int) (0))),"/");
RDebugUtils.currentLine=56623173;
 //BA.debugLineNum = 56623173;BA.debugLine="Dim lastVisitDate As String = MCode.PersianDate";
_lastvisitdate = parent.mostCurrent._mcode._persiandatedash /*String*/ (mostCurrent.activityBA,BA.ObjectToString(_dt.Get((int) (0))));
RDebugUtils.currentLine=56623174;
 //BA.debugLineNum = 56623174;BA.debugLine="Dim lastVisitTime As String = Str.get(1)";
_lastvisittime = BA.ObjectToString(_str.Get((int) (1)));
RDebugUtils.currentLine=56623175;
 //BA.debugLineNum = 56623175;BA.debugLine="LblLastVisit.Text=lastVisitDate & CRLF & lastVi";
parent.mostCurrent._lbllastvisit.setText(BA.ObjectToCharSequence(_lastvisitdate+anywheresoftware.b4a.keywords.Common.CRLF+_lastvisittime));
 if (true) break;

case 25:
//C
this.state = 26;
;
RDebugUtils.currentLine=56623178;
 //BA.debugLineNum = 56623178;BA.debugLine="Dim DateTimeLastSefaresh As String = myCode.Is_N";
_datetimelastsefaresh = parent.mostCurrent._mycode._is_null /*String*/ (mostCurrent.activityBA,_cu.GetString("lastOrderDate"));
RDebugUtils.currentLine=56623179;
 //BA.debugLineNum = 56623179;BA.debugLine="If DateTimeLastSefaresh.Length = 0 Then";
if (true) break;

case 26:
//if
this.state = 31;
if (_datetimelastsefaresh.length()==0) { 
this.state = 28;
}else {
this.state = 30;
}if (true) break;

case 28:
//C
this.state = 31;
RDebugUtils.currentLine=56623180;
 //BA.debugLineNum = 56623180;BA.debugLine="LblLastSefaresh.Text=\"//\"";
parent.mostCurrent._lbllastsefaresh.setText(BA.ObjectToCharSequence("//"));
 if (true) break;

case 30:
//C
this.state = 31;
RDebugUtils.currentLine=56623182;
 //BA.debugLineNum = 56623182;BA.debugLine="Dim Str As List";
_str = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=56623183;
 //BA.debugLineNum = 56623183;BA.debugLine="Str.Initialize";
_str.Initialize();
RDebugUtils.currentLine=56623184;
 //BA.debugLineNum = 56623184;BA.debugLine="Str = MCode.Sf.Split(DateTimeLastSefaresh.Repla";
_str = parent.mostCurrent._mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvvv4(_datetimelastsefaresh.replace("-","/"),"T");
RDebugUtils.currentLine=56623186;
 //BA.debugLineNum = 56623186;BA.debugLine="Dim DT As List = MCode.Sf.Split(Str.get(0),\"/\")";
_dt = new anywheresoftware.b4a.objects.collections.List();
_dt = parent.mostCurrent._mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvvv4(BA.ObjectToString(_str.Get((int) (0))),"/");
RDebugUtils.currentLine=56623187;
 //BA.debugLineNum = 56623187;BA.debugLine="Dim LastSefareshDate As String = MCode.PersianD";
_lastsefareshdate = parent.mostCurrent._mcode._persiandatedash /*String*/ (mostCurrent.activityBA,BA.ObjectToString(_dt.Get((int) (0))));
RDebugUtils.currentLine=56623188;
 //BA.debugLineNum = 56623188;BA.debugLine="Dim LastSefareshTime As String =Str.get(1)";
_lastsefareshtime = BA.ObjectToString(_str.Get((int) (1)));
RDebugUtils.currentLine=56623189;
 //BA.debugLineNum = 56623189;BA.debugLine="LblLastSefaresh.Text=LastSefareshDate & CRLF &";
parent.mostCurrent._lbllastsefaresh.setText(BA.ObjectToCharSequence(_lastsefareshdate+anywheresoftware.b4a.keywords.Common.CRLF+_lastsefareshtime));
 if (true) break;

case 31:
//C
this.state = 32;
;
RDebugUtils.currentLine=56623192;
 //BA.debugLineNum = 56623192;BA.debugLine="LblTell.Text=myCode.Is_Null(Cu.GetString(\"fldTel";
parent.mostCurrent._lbltell.setText(BA.ObjectToCharSequence(parent.mostCurrent._mycode._is_null /*String*/ (mostCurrent.activityBA,_cu.GetString("fldTell"))+" | "+parent.mostCurrent._mycode._is_null /*String*/ (mostCurrent.activityBA,_cu.GetString("FldMobile"))));
RDebugUtils.currentLine=56623193;
 //BA.debugLineNum = 56623193;BA.debugLine="MCode.Tell_Tafzili=LblTell.Text";
parent.mostCurrent._mcode._tell_tafzili /*String*/  = parent.mostCurrent._lbltell.getText();
RDebugUtils.currentLine=56623194;
 //BA.debugLineNum = 56623194;BA.debugLine="If myCode.Is_Null(Cu.GetString(\"FldMobile\")) <>";
if (true) break;

case 32:
//if
this.state = 35;
if ((parent.mostCurrent._mycode._is_null /*String*/ (mostCurrent.activityBA,_cu.GetString("FldMobile"))).equals("") == false) { 
this.state = 34;
}if (true) break;

case 34:
//C
this.state = 35;
RDebugUtils.currentLine=56623195;
 //BA.debugLineNum = 56623195;BA.debugLine="LblTell.tag=Cu.GetString(\"FldMobile\")";
parent.mostCurrent._lbltell.setTag((Object)(_cu.GetString("FldMobile")));
 if (true) break;
;
RDebugUtils.currentLine=56623197;
 //BA.debugLineNum = 56623197;BA.debugLine="If myCode.Is_Null(Cu.GetString(\"fldTell\")) <> \"\"";

case 35:
//if
this.state = 38;
if ((parent.mostCurrent._mycode._is_null /*String*/ (mostCurrent.activityBA,_cu.GetString("fldTell"))).equals("") == false) { 
this.state = 37;
}if (true) break;

case 37:
//C
this.state = 38;
RDebugUtils.currentLine=56623198;
 //BA.debugLineNum = 56623198;BA.debugLine="LblTell.tag=Cu.GetString(\"fldTell\")";
parent.mostCurrent._lbltell.setTag((Object)(_cu.GetString("fldTell")));
 if (true) break;

case 38:
//C
this.state = 39;
;
RDebugUtils.currentLine=56623200;
 //BA.debugLineNum = 56623200;BA.debugLine="LblAddress.Text=Cu.GetString(\"fldAdress\")";
parent.mostCurrent._lbladdress.setText(BA.ObjectToCharSequence(_cu.GetString("fldAdress")));
RDebugUtils.currentLine=56623201;
 //BA.debugLineNum = 56623201;BA.debugLine="MCode.Address_Tafzili=LblAddress.Text";
parent.mostCurrent._mcode._address_tafzili /*String*/  = parent.mostCurrent._lbladdress.getText();
 if (true) break;

case 39:
//C
this.state = -1;
;
RDebugUtils.currentLine=56623212;
 //BA.debugLineNum = 56623212;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _loadlistfaktor() throws Exception{
RDebugUtils.currentModule="act_profile";
if (Debug.shouldDelegate(mostCurrent.activityBA, "loadlistfaktor", false))
	 {Debug.delegate(mostCurrent.activityBA, "loadlistfaktor", null); return;}
ResumableSub_LoadListFaktor rsub = new ResumableSub_LoadListFaktor(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_LoadListFaktor extends BA.ResumableSub {
public ResumableSub_LoadListFaktor(ir.parsikhesab.pakhsh.act_profile parent) {
this.parent = parent;
}
ir.parsikhesab.pakhsh.act_profile parent;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
int _i = 0;
ir.parsikhesab.pakhsh.mcode._adapterlistfaktor _item = null;
String _sd = "";
int step5;
int limit5;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_profile";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=56885249;
 //BA.debugLineNum = 56885249;BA.debugLine="Sleep(200)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_profile", "loadlistfaktor"),(int) (200));
this.state = 27;
return;
case 27:
//C
this.state = 1;
;
RDebugUtils.currentLine=56885250;
 //BA.debugLineNum = 56885250;BA.debugLine="ListFaktor.Clear";
parent.mostCurrent._listfaktor.Clear();
RDebugUtils.currentLine=56885252;
 //BA.debugLineNum = 56885252;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From Tb";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = parent.mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblFaktor Where FldC_Tafzili = '"+parent.mostCurrent._mcode._c_tafzili /*String*/ +"'  Group by FldShomareFaktor,FldTotalFaktor,FldDate,FldTime Order By Cast(FldShomareFaktor As Int)");
RDebugUtils.currentLine=56885253;
 //BA.debugLineNum = 56885253;BA.debugLine="If Cu.RowCount>0 Then";
if (true) break;

case 1:
//if
this.state = 26;
if (_cu.getRowCount()>0) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=56885254;
 //BA.debugLineNum = 56885254;BA.debugLine="For i=0 To Cu.RowCount-1";
if (true) break;

case 4:
//for
this.state = 25;
step5 = 1;
limit5 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
this.state = 28;
if (true) break;

case 28:
//C
this.state = 25;
if ((step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5)) this.state = 6;
if (true) break;

case 29:
//C
this.state = 28;
_i = ((int)(0 + _i + step5)) ;
if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=56885255;
 //BA.debugLineNum = 56885255;BA.debugLine="Try";
if (true) break;

case 7:
//try
this.state = 24;
this.catchState = 23;
this.state = 9;
if (true) break;

case 9:
//C
this.state = 10;
this.catchState = 23;
RDebugUtils.currentLine=56885256;
 //BA.debugLineNum = 56885256;BA.debugLine="Cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=56885257;
 //BA.debugLineNum = 56885257;BA.debugLine="Dim Item As AdapterListFaktor";
_item = new ir.parsikhesab.pakhsh.mcode._adapterlistfaktor();
RDebugUtils.currentLine=56885258;
 //BA.debugLineNum = 56885258;BA.debugLine="Item.FldShomareFaktor=Cu.GetString(\"FldShomare";
_item.fldShomareFaktor /*String*/  = _cu.GetString("FldShomareFaktor");
RDebugUtils.currentLine=56885259;
 //BA.debugLineNum = 56885259;BA.debugLine="If Cu.GetString(\"FldShomareBargasht\")<>0 And C";
if (true) break;

case 10:
//if
this.state = 15;
if ((_cu.GetString("FldShomareBargasht")).equals(BA.NumberToString(0)) == false && _cu.GetString("FldShomareBargasht")!= null) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 15;
RDebugUtils.currentLine=56885260;
 //BA.debugLineNum = 56885260;BA.debugLine="Item.FldShomareBargasht=Cu.GetString(\"FldShom";
_item.FldShomareBargasht /*String*/  = _cu.GetString("FldShomareBargasht");
RDebugUtils.currentLine=56885261;
 //BA.debugLineNum = 56885261;BA.debugLine="Item.wIsBacked=True";
_item.wIsBacked /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=56885263;
 //BA.debugLineNum = 56885263;BA.debugLine="Item.wIsBacked=False";
_item.wIsBacked /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=56885264;
 //BA.debugLineNum = 56885264;BA.debugLine="Item.FldShomareBargasht=0";
_item.FldShomareBargasht /*String*/  = BA.NumberToString(0);
 if (true) break;

case 15:
//C
this.state = 16;
;
RDebugUtils.currentLine=56885267;
 //BA.debugLineNum = 56885267;BA.debugLine="Item.FldTotalFaktor=Cu.GetString(\"FldTotalFakt";
_item.fldTotalFaktor /*String*/  = _cu.GetString("FldTotalFaktor");
RDebugUtils.currentLine=56885268;
 //BA.debugLineNum = 56885268;BA.debugLine="Item.fldC_Ashkhas=Cu.GetString(\"FldC_Tafzili\")";
_item.fldC_Ashkhas /*String*/  = _cu.GetString("FldC_Tafzili");
RDebugUtils.currentLine=56885269;
 //BA.debugLineNum = 56885269;BA.debugLine="Item.fldTozihFaktor = myCode.Is_Null( Cu.GetSt";
_item.fldTozihFaktor /*String*/  = parent.mostCurrent._mycode._is_null /*String*/ (mostCurrent.activityBA,_cu.GetString("FldTozihat"));
RDebugUtils.currentLine=56885270;
 //BA.debugLineNum = 56885270;BA.debugLine="Log(\">>\"&Item.fldC_Ashkhas)";
anywheresoftware.b4a.keywords.Common.LogImpl("556885270",">>"+_item.fldC_Ashkhas /*String*/ ,0);
RDebugUtils.currentLine=56885271;
 //BA.debugLineNum = 56885271;BA.debugLine="Item.C_Name = LblName.Text";
_item.C_Name /*String*/  = parent.mostCurrent._lblname.getText();
RDebugUtils.currentLine=56885272;
 //BA.debugLineNum = 56885272;BA.debugLine="Item.fldC_Tasvie=Cu.GetString(\"FldVaziatPardak";
_item.fldC_Tasvie /*String*/  = _cu.GetString("FldVaziatPardakht");
RDebugUtils.currentLine=56885273;
 //BA.debugLineNum = 56885273;BA.debugLine="Log(myCode.Is_Null(Cu.GetString(\"FldSync\")))";
anywheresoftware.b4a.keywords.Common.LogImpl("556885273",parent.mostCurrent._mycode._is_null /*String*/ (mostCurrent.activityBA,_cu.GetString("FldSync")),0);
RDebugUtils.currentLine=56885274;
 //BA.debugLineNum = 56885274;BA.debugLine="If myCode.Is_Null(Cu.GetString(\"FldSync\"))=\"Tr";
if (true) break;

case 16:
//if
this.state = 21;
if ((parent.mostCurrent._mycode._is_null /*String*/ (mostCurrent.activityBA,_cu.GetString("FldSync"))).equals("True")) { 
this.state = 18;
}else {
this.state = 20;
}if (true) break;

case 18:
//C
this.state = 21;
RDebugUtils.currentLine=56885275;
 //BA.debugLineNum = 56885275;BA.debugLine="Item.synced=True";
_item.synced /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=56885277;
 //BA.debugLineNum = 56885277;BA.debugLine="Item.synced=False";
_item.synced /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;

case 21:
//C
this.state = 24;
;
RDebugUtils.currentLine=56885279;
 //BA.debugLineNum = 56885279;BA.debugLine="Dim MPD As ManamPersianDate";
parent.mostCurrent._mpd = new com.b4a.manamsoftware.PersianDate.ManamPersianDate();
RDebugUtils.currentLine=56885280;
 //BA.debugLineNum = 56885280;BA.debugLine="Dim sd As String	= myCode.Is_Null(Cu.GetString";
_sd = parent.mostCurrent._mycode._is_null /*String*/ (mostCurrent.activityBA,_cu.GetString("FldDate"));
RDebugUtils.currentLine=56885281;
 //BA.debugLineNum = 56885281;BA.debugLine="Log(sd)";
anywheresoftware.b4a.keywords.Common.LogImpl("556885281",_sd,0);
RDebugUtils.currentLine=56885283;
 //BA.debugLineNum = 56885283;BA.debugLine="Item.FldDate=Cu.GetString(\"FldDate\")";
_item.fldDate /*String*/  = _cu.GetString("FldDate");
RDebugUtils.currentLine=56885284;
 //BA.debugLineNum = 56885284;BA.debugLine="Item.FldTime=Cu.GetString(\"FldTime\")";
_item.fldTime /*String*/  = _cu.GetString("FldTime");
RDebugUtils.currentLine=56885285;
 //BA.debugLineNum = 56885285;BA.debugLine="ListFaktor.Add(Item)";
parent.mostCurrent._listfaktor.Add((Object)(_item));
 if (true) break;

case 23:
//C
this.state = 24;
this.catchState = 0;
RDebugUtils.currentLine=56885287;
 //BA.debugLineNum = 56885287;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("556885287",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 24:
//C
this.state = 29;
this.catchState = 0;
;
 if (true) break;
if (true) break;

case 25:
//C
this.state = 26;
;
RDebugUtils.currentLine=56885290;
 //BA.debugLineNum = 56885290;BA.debugLine="HLV.notifyDataSetChanged";
parent.mostCurrent._hlv.notifyDataSetChanged();
 if (true) break;

case 26:
//C
this.state = -1;
;
RDebugUtils.currentLine=56885292;
 //BA.debugLineNum = 56885292;BA.debugLine="Log(ListFaktor.Size)";
anywheresoftware.b4a.keywords.Common.LogImpl("556885292",BA.NumberToString(parent.mostCurrent._listfaktor.getSize()),0);
RDebugUtils.currentLine=56885294;
 //BA.debugLineNum = 56885294;BA.debugLine="End Sub";
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
RDebugUtils.currentModule="act_profile";
if (Debug.shouldDelegate(mostCurrent.activityBA, "application_error", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "application_error", new Object[] {_error,_stacktrace}));}
RDebugUtils.currentLine=58851328;
 //BA.debugLineNum = 58851328;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
RDebugUtils.currentLine=58851330;
 //BA.debugLineNum = 58851330;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=58851331;
 //BA.debugLineNum = 58851331;BA.debugLine="End Sub";
return false;
}
public static String  _btnnextvisit_click() throws Exception{
RDebugUtils.currentModule="act_profile";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnnextvisit_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnnextvisit_click", null));}
RDebugUtils.currentLine=57868288;
 //BA.debugLineNum = 57868288;BA.debugLine="Sub BtnNextVisit_Click";
RDebugUtils.currentLine=57868289;
 //BA.debugLineNum = 57868289;BA.debugLine="OpenDialogNewVisit";
_opendialognewvisit();
RDebugUtils.currentLine=57868290;
 //BA.debugLineNum = 57868290;BA.debugLine="End Sub";
return "";
}
public static String  _opendialognewvisit() throws Exception{
RDebugUtils.currentModule="act_profile";
if (Debug.shouldDelegate(mostCurrent.activityBA, "opendialognewvisit", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "opendialognewvisit", null));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
anywheresoftware.b4a.objects.collections.List _dt = null;
RDebugUtils.currentLine=57933824;
 //BA.debugLineNum = 57933824;BA.debugLine="Sub OpenDialogNewVisit";
RDebugUtils.currentLine=57933825;
 //BA.debugLineNum = 57933825;BA.debugLine="PnlNextVisit.Visible=True";
mostCurrent._pnlnextvisit.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=57933826;
 //BA.debugLineNum = 57933826;BA.debugLine="MCode.AnimationOpen(PnlNextVisit)";
mostCurrent._mcode._animationopen /*String*/ (mostCurrent.activityBA,(Object)(mostCurrent._pnlnextvisit.getObject()));
RDebugUtils.currentLine=57933828;
 //BA.debugLineNum = 57933828;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From Tb";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblNextVisit Where FldC_Ashkhas = '"+mostCurrent._mcode._c_tafzili /*String*/ +"'");
RDebugUtils.currentLine=57933829;
 //BA.debugLineNum = 57933829;BA.debugLine="If Cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=57933830;
 //BA.debugLineNum = 57933830;BA.debugLine="Cu.Position=0";
_cu.setPosition((int) (0));
RDebugUtils.currentLine=57933831;
 //BA.debugLineNum = 57933831;BA.debugLine="TxtDesc.Text = Cu.GetString(\"NextVisitText\")";
mostCurrent._txtdesc.setText(BA.ObjectToCharSequence(_cu.GetString("NextVisitText")));
RDebugUtils.currentLine=57933834;
 //BA.debugLineNum = 57933834;BA.debugLine="Dim DT As List = MCode.Sf.Split(Cu.GetString(\"Ne";
_dt = new anywheresoftware.b4a.objects.collections.List();
_dt = mostCurrent._mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvvv4(_cu.GetString("NextVisitDate"),"-");
RDebugUtils.currentLine=57933835;
 //BA.debugLineNum = 57933835;BA.debugLine="LblDate.Text = MCode.PersianDate.getDate(DT.Get(";
mostCurrent._lbldate.setText(BA.ObjectToCharSequence(mostCurrent._mcode._persiandate /*anywheresoftware.b4a.student.PersianDate*/ .getDate((int)(BA.ObjectToNumber(_dt.Get((int) (0)))),(int)(BA.ObjectToNumber(_dt.Get((int) (1)))),(int)(BA.ObjectToNumber(_dt.Get((int) (2)))),"/")));
 };
RDebugUtils.currentLine=57933837;
 //BA.debugLineNum = 57933837;BA.debugLine="End Sub";
return "";
}
public static String  _btnsave_click() throws Exception{
RDebugUtils.currentModule="act_profile";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnsave_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnsave_click", null));}
boolean _check = false;
String _d = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
RDebugUtils.currentLine=58392576;
 //BA.debugLineNum = 58392576;BA.debugLine="Sub BtnSave_Click";
RDebugUtils.currentLine=58392577;
 //BA.debugLineNum = 58392577;BA.debugLine="Dim Check As Boolean = LblDate.text <> \"انتخاب کن";
_check = (mostCurrent._lbldate.getText()).equals("انتخاب کنید") == false && (mostCurrent._txtdesc.getText()).equals("") == false;
RDebugUtils.currentLine=58392578;
 //BA.debugLineNum = 58392578;BA.debugLine="If Check = True Then";
if (_check==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=58392579;
 //BA.debugLineNum = 58392579;BA.debugLine="Dim D As String = LblDate.Tag '& \" \" & TimePicke";
_d = BA.ObjectToString(mostCurrent._lbldate.getTag());
RDebugUtils.currentLine=58392580;
 //BA.debugLineNum = 58392580;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From T";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblNextVisit Where FldC_Ashkhas = '"+mostCurrent._mcode._c_tafzili /*String*/ +"'");
RDebugUtils.currentLine=58392581;
 //BA.debugLineNum = 58392581;BA.debugLine="If Cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=58392582;
 //BA.debugLineNum = 58392582;BA.debugLine="MCode.SaveUpdate(\"Update TblNextVisit Set NextV";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Update TblNextVisit Set NextVisitDate = '"+_d+"',NextVisitText = '"+mostCurrent._txtdesc.getText()+"' Where FldC_Ashkhas = '"+mostCurrent._mcode._c_tafzili /*String*/ +"'");
 }else {
RDebugUtils.currentLine=58392584;
 //BA.debugLineNum = 58392584;BA.debugLine="MCode.SaveUpdate(\"Insert Into TblNextVisit (Fld";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Insert Into TblNextVisit (FldC_Ashkhas,NextVisitDate,NextVisitText) Values ('"+mostCurrent._mcode._c_tafzili /*String*/ +"','"+_d+"','"+mostCurrent._txtdesc.getText()+"')");
 };
RDebugUtils.currentLine=58392587;
 //BA.debugLineNum = 58392587;BA.debugLine="MCode.SaveUpdate(\"Update TblAshkhas set nextVisi";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Update TblAshkhas set nextVisitDate = '"+_d+"',nextVisitText = '"+mostCurrent._txtdesc.getText()+"' Where FldC_Ashkhas = '"+mostCurrent._mcode._c_tafzili /*String*/ +"'");
RDebugUtils.currentLine=58392589;
 //BA.debugLineNum = 58392589;BA.debugLine="LblBack_Click";
_lblback_click();
 }else {
RDebugUtils.currentLine=58392591;
 //BA.debugLineNum = 58392591;BA.debugLine="ToastMessageShow(\"اطلاعات را به طور کامل وارد کن";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("اطلاعات را به طور کامل وارد کنید"),anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=58392593;
 //BA.debugLineNum = 58392593;BA.debugLine="End Sub";
return "";
}
public static String  _lblback_click() throws Exception{
RDebugUtils.currentModule="act_profile";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lblback_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lblback_click", null));}
RDebugUtils.currentLine=57999360;
 //BA.debugLineNum = 57999360;BA.debugLine="Sub LblBack_Click";
RDebugUtils.currentLine=57999362;
 //BA.debugLineNum = 57999362;BA.debugLine="PnlNextVisit.Visible=False";
mostCurrent._pnlnextvisit.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=57999363;
 //BA.debugLineNum = 57999363;BA.debugLine="MCode.AnimationClose(PnlNextVisit)";
mostCurrent._mcode._animationclose /*String*/ (mostCurrent.activityBA,(Object)(mostCurrent._pnlnextvisit.getObject()));
RDebugUtils.currentLine=57999364;
 //BA.debugLineNum = 57999364;BA.debugLine="End Sub";
return "";
}
public static String  _btnshowcheks_click() throws Exception{
RDebugUtils.currentModule="act_profile";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnshowcheks_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnshowcheks_click", null));}
RDebugUtils.currentLine=56950784;
 //BA.debugLineNum = 56950784;BA.debugLine="Sub BtnShowCheks_Click";
RDebugUtils.currentLine=56950786;
 //BA.debugLineNum = 56950786;BA.debugLine="Log(\"Check\")";
anywheresoftware.b4a.keywords.Common.LogImpl("556950786","Check",0);
RDebugUtils.currentLine=56950787;
 //BA.debugLineNum = 56950787;BA.debugLine="End Sub";
return "";
}
public static String  _btnshowmap_click() throws Exception{
RDebugUtils.currentModule="act_profile";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnshowmap_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnshowmap_click", null));}
RDebugUtils.currentLine=58785792;
 //BA.debugLineNum = 58785792;BA.debugLine="Private Sub BtnShowMap_Click";
RDebugUtils.currentLine=58785794;
 //BA.debugLineNum = 58785794;BA.debugLine="GetLocation(MCode.C_Tafzili)";
_getlocation(mostCurrent._mcode._c_tafzili /*String*/ );
RDebugUtils.currentLine=58785795;
 //BA.debugLineNum = 58785795;BA.debugLine="End Sub";
return "";
}
public static String  _getlocation(String _codetafzili) throws Exception{
RDebugUtils.currentModule="act_profile";
if (Debug.shouldDelegate(mostCurrent.activityBA, "getlocation", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "getlocation", new Object[] {_codetafzili}));}
RDebugUtils.currentLine=58523648;
 //BA.debugLineNum = 58523648;BA.debugLine="Sub GetLocation(CodeTafzili As String)";
RDebugUtils.currentLine=58523649;
 //BA.debugLineNum = 58523649;BA.debugLine="jobInternet.JobName =\"GetLocation\"";
mostCurrent._jobinternet._jobname /*String*/  = "GetLocation";
RDebugUtils.currentLine=58523650;
 //BA.debugLineNum = 58523650;BA.debugLine="jobInternet.PostString(\"http://\" & MCode.Url & \"/";
mostCurrent._jobinternet._poststring /*String*/ (null,"http://"+mostCurrent._mcode._url /*String*/ +"/marashiservice.asmx/GetAndroid","Query=Select FldC_Tafzili,FldLat,FldLon From TblLocation Where FldC_Tafzili = '"+_codetafzili+"'"+"&Imei="+mostCurrent._mcode._deviceid /*String*/ );
RDebugUtils.currentLine=58523651;
 //BA.debugLineNum = 58523651;BA.debugLine="End Sub";
return "";
}
public static String  _btnshowmoeen_click() throws Exception{
RDebugUtils.currentModule="act_profile";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnshowmoeen_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnshowmoeen_click", null));}
RDebugUtils.currentLine=57737216;
 //BA.debugLineNum = 57737216;BA.debugLine="Sub BtnShowMoeen_Click";
RDebugUtils.currentLine=57737219;
 //BA.debugLineNum = 57737219;BA.debugLine="End Sub";
return "";
}
public static String  _button1_click() throws Exception{
RDebugUtils.currentModule="act_profile";
if (Debug.shouldDelegate(mostCurrent.activityBA, "button1_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "button1_click", null));}
RDebugUtils.currentLine=56360960;
 //BA.debugLineNum = 56360960;BA.debugLine="Sub Button1_Click";
RDebugUtils.currentLine=56360962;
 //BA.debugLineNum = 56360962;BA.debugLine="If MCode.Tozie=1 Then";
if ((mostCurrent._mcode._tozie /*String*/ ).equals(BA.NumberToString(1))) { 
RDebugUtils.currentLine=56360963;
 //BA.debugLineNum = 56360963;BA.debugLine="StartActivity(Act_Mali)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._act_mali.getObject()));
 }else {
RDebugUtils.currentLine=56360966;
 //BA.debugLineNum = 56360966;BA.debugLine="ToastMessageShow(\"این دسترسی برای شما فعال نیست";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("این دسترسی برای شما فعال نیست ، با پشتیبانی تماس بگیرید"),anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=56360970;
 //BA.debugLineNum = 56360970;BA.debugLine="End Sub";
return "";
}
public static String  _button2_click() throws Exception{
RDebugUtils.currentModule="act_profile";
if (Debug.shouldDelegate(mostCurrent.activityBA, "button2_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "button2_click", null));}
RDebugUtils.currentLine=56426496;
 //BA.debugLineNum = 56426496;BA.debugLine="Sub Button2_Click";
RDebugUtils.currentLine=56426497;
 //BA.debugLineNum = 56426497;BA.debugLine="If MCode.SendMarjoie = 1 Then";
if ((mostCurrent._mcode._sendmarjoie /*String*/ ).equals(BA.NumberToString(1))) { 
RDebugUtils.currentLine=56426514;
 //BA.debugLineNum = 56426514;BA.debugLine="Log(MCode.C_Tafzili)";
anywheresoftware.b4a.keywords.Common.LogImpl("556426514",mostCurrent._mcode._c_tafzili /*String*/ ,0);
RDebugUtils.currentLine=56426515;
 //BA.debugLineNum = 56426515;BA.debugLine="MCode.FaktorSelect=\"\"";
mostCurrent._mcode._faktorselect /*String*/  = "";
RDebugUtils.currentLine=56426516;
 //BA.debugLineNum = 56426516;BA.debugLine="MCode.Action=\"SabtMarjooii\"";
mostCurrent._mcode._action /*String*/  = "SabtMarjooii";
RDebugUtils.currentLine=56426517;
 //BA.debugLineNum = 56426517;BA.debugLine="StartActivity(Act_KalaDefault)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._act_kaladefault.getObject()));
 }else {
RDebugUtils.currentLine=56426520;
 //BA.debugLineNum = 56426520;BA.debugLine="ToastMessageShow(\"این دسترسی برای شما فعال نیست";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("این دسترسی برای شما فعال نیست ، با پشتیبانی تماس بگیرید"),anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=56426523;
 //BA.debugLineNum = 56426523;BA.debugLine="End Sub";
return "";
}
public static String  _button3_click() throws Exception{
RDebugUtils.currentModule="act_profile";
if (Debug.shouldDelegate(mostCurrent.activityBA, "button3_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "button3_click", null));}
RDebugUtils.currentLine=56492032;
 //BA.debugLineNum = 56492032;BA.debugLine="Sub Button3_Click";
RDebugUtils.currentLine=56492033;
 //BA.debugLineNum = 56492033;BA.debugLine="If	MCode.Visitor=\"0\" Then";
if ((mostCurrent._mcode._visitor /*String*/ ).equals("0")) { 
RDebugUtils.currentLine=56492034;
 //BA.debugLineNum = 56492034;BA.debugLine="ToastMessageShow(\"این بخش مربوط به نسخه ویزیتور";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("این بخش مربوط به نسخه ویزیتور می باشد ، در صورت نیاز به فعالسازی و استفاده از این بخش با واحد مشاوره و فروش مربوطه تماس حاصل فرمایید"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=56492035;
 //BA.debugLineNum = 56492035;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=56492037;
 //BA.debugLineNum = 56492037;BA.debugLine="lbl_Default_Click";
_lbl_default_click();
RDebugUtils.currentLine=56492046;
 //BA.debugLineNum = 56492046;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_default_click() throws Exception{
RDebugUtils.currentModule="act_profile";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lbl_default_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lbl_default_click", null));}
String _date = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
RDebugUtils.currentLine=57016320;
 //BA.debugLineNum = 57016320;BA.debugLine="Sub lbl_Default_Click";
RDebugUtils.currentLine=57016321;
 //BA.debugLineNum = 57016321;BA.debugLine="GotoPage = False";
_gotopage = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=57016322;
 //BA.debugLineNum = 57016322;BA.debugLine="ProgressDialogShow(\"\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=57016325;
 //BA.debugLineNum = 57016325;BA.debugLine="Dim Date As String = MCode.ConvertNumbersPersian2";
_date = mostCurrent._mcode._convertnumberspersian2english /*String*/ (mostCurrent.activityBA,mostCurrent._mcode._datepersian /*String*/ (mostCurrent.activityBA));
RDebugUtils.currentLine=57016326;
 //BA.debugLineNum = 57016326;BA.debugLine="MCode.FaktorSelect=\"\"";
mostCurrent._mcode._faktorselect /*String*/  = "";
RDebugUtils.currentLine=57016327;
 //BA.debugLineNum = 57016327;BA.debugLine="MCode.Action=\"SabtFaktor\"";
mostCurrent._mcode._action /*String*/  = "SabtFaktor";
RDebugUtils.currentLine=57016329;
 //BA.debugLineNum = 57016329;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * from Tb";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * from TblLogVisitSefaresh Where FldC_Ashkhas = '"+mostCurrent._mcode._c_tafzili /*String*/ +"'");
RDebugUtils.currentLine=57016330;
 //BA.debugLineNum = 57016330;BA.debugLine="If Cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=57016331;
 //BA.debugLineNum = 57016331;BA.debugLine="MCode.SaveUpdate(\"Update TblLogVisitSefaresh Set";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Update TblLogVisitSefaresh Set FldVisit = '"+_date+"' Where FldC_Ashkhas = '"+mostCurrent._mcode._c_tafzili /*String*/ +"'");
 }else {
RDebugUtils.currentLine=57016333;
 //BA.debugLineNum = 57016333;BA.debugLine="MCode.SaveUpdate(\"Insert Into TblLogVisitSefares";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Insert Into TblLogVisitSefaresh (FldC_Ashkhas,FldVisit,FldSefaresh,FldElatSefaresh,FldLat,FldLon) Values ('"+mostCurrent._mcode._c_tafzili /*String*/ +"','"+_date+"','','','','')");
 };
RDebugUtils.currentLine=57016335;
 //BA.debugLineNum = 57016335;BA.debugLine="MCode.SaveUpdate(\"Update TblAshkhas Set FldLastVi";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Update TblAshkhas Set FldLastVisit = '"+_date+"' Where fldCodetafzili = '"+mostCurrent._mcode._c_tafzili /*String*/ +"'");
RDebugUtils.currentLine=57016336;
 //BA.debugLineNum = 57016336;BA.debugLine="MCode.SaveUpdate(\"Update TblVisitorTour Set FldLa";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Update TblVisitorTour Set FldLastVisit = '"+_date+"' Where FldC_Ashkhas = '"+mostCurrent._mcode._c_tafzili /*String*/ +"'");
RDebugUtils.currentLine=57016339;
 //BA.debugLineNum = 57016339;BA.debugLine="SaveLastSeen";
_savelastseen();
RDebugUtils.currentLine=57016344;
 //BA.debugLineNum = 57016344;BA.debugLine="Pnl_menu.SetVisibleAnimated(600,False)";
mostCurrent._pnl_menu.SetVisibleAnimated((int) (600),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=57016346;
 //BA.debugLineNum = 57016346;BA.debugLine="KalaDefault";
_kaladefault();
RDebugUtils.currentLine=57016349;
 //BA.debugLineNum = 57016349;BA.debugLine="End Sub";
return "";
}
public static String  _button4_click() throws Exception{
RDebugUtils.currentModule="act_profile";
if (Debug.shouldDelegate(mostCurrent.activityBA, "button4_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "button4_click", null));}
RDebugUtils.currentLine=56557568;
 //BA.debugLineNum = 56557568;BA.debugLine="Sub Button4_Click";
RDebugUtils.currentLine=56557569;
 //BA.debugLineNum = 56557569;BA.debugLine="pnl_location.BringToFront";
mostCurrent._pnl_location.BringToFront();
RDebugUtils.currentLine=56557570;
 //BA.debugLineNum = 56557570;BA.debugLine="Pnl_menu.Visible=False";
mostCurrent._pnl_menu.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=56557571;
 //BA.debugLineNum = 56557571;BA.debugLine="If pnl_location.Visible Then";
if (mostCurrent._pnl_location.getVisible()) { 
RDebugUtils.currentLine=56557572;
 //BA.debugLineNum = 56557572;BA.debugLine="pnl_location.SetVisibleAnimated(600,False)";
mostCurrent._pnl_location.SetVisibleAnimated((int) (600),anywheresoftware.b4a.keywords.Common.False);
 }else {
RDebugUtils.currentLine=56557574;
 //BA.debugLineNum = 56557574;BA.debugLine="pnl_location.SetVisibleAnimated(600,True)";
mostCurrent._pnl_location.SetVisibleAnimated((int) (600),anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=56557576;
 //BA.debugLineNum = 56557576;BA.debugLine="End Sub";
return "";
}
public static String  _gps_locationchanged(anywheresoftware.b4a.gps.LocationWrapper _location1) throws Exception{
RDebugUtils.currentModule="act_profile";
if (Debug.shouldDelegate(mostCurrent.activityBA, "gps_locationchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "gps_locationchanged", new Object[] {_location1}));}
RDebugUtils.currentLine=57540608;
 //BA.debugLineNum = 57540608;BA.debugLine="Sub Gps_LocationChanged (Location1 As Location)";
RDebugUtils.currentLine=57540610;
 //BA.debugLineNum = 57540610;BA.debugLine="End Sub";
return "";
}
public static int  _hlv_getitemcount() throws Exception{
RDebugUtils.currentModule="act_profile";
if (Debug.shouldDelegate(mostCurrent.activityBA, "hlv_getitemcount", false))
	 {return ((Integer) Debug.delegate(mostCurrent.activityBA, "hlv_getitemcount", null));}
RDebugUtils.currentLine=56819712;
 //BA.debugLineNum = 56819712;BA.debugLine="Sub HLV_GetItemCount As Int 								        '💯 It";
RDebugUtils.currentLine=56819713;
 //BA.debugLineNum = 56819713;BA.debugLine="Return ListFaktor.Size '/ItemList.Size";
if (true) return mostCurrent._listfaktor.getSize();
RDebugUtils.currentLine=56819714;
 //BA.debugLineNum = 56819714;BA.debugLine="End Sub";
return 0;
}
public static String  _hlv_onbindviewholder(anywheresoftware.b4a.objects.PanelWrapper _parent,int _position) throws Exception{
RDebugUtils.currentModule="act_profile";
if (Debug.shouldDelegate(mostCurrent.activityBA, "hlv_onbindviewholder", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "hlv_onbindviewholder", new Object[] {_parent,_position}));}
ir.parsikhesab.pakhsh.mcode._adapterlistfaktor _item = null;
ir.parsikhesab.pakhsh.cls_recfaktor _rec = null;
RDebugUtils.currentLine=56754176;
 //BA.debugLineNum = 56754176;BA.debugLine="Sub HLV_onBindViewHolder (Parent As Panel, Positio";
RDebugUtils.currentLine=56754177;
 //BA.debugLineNum = 56754177;BA.debugLine="Dim item As AdapterListFaktor=ListFaktor.Get(Posi";
_item = (ir.parsikhesab.pakhsh.mcode._adapterlistfaktor)(mostCurrent._listfaktor.Get(_position));
RDebugUtils.currentLine=56754178;
 //BA.debugLineNum = 56754178;BA.debugLine="Dim rec As cls_RecFaktor=Parent.Tag";
_rec = (ir.parsikhesab.pakhsh.cls_recfaktor)(_parent.getTag());
RDebugUtils.currentLine=56754179;
 //BA.debugLineNum = 56754179;BA.debugLine="rec.show(item)";
_rec._show /*String*/ (null,_item);
RDebugUtils.currentLine=56754180;
 //BA.debugLineNum = 56754180;BA.debugLine="Parent.Height=rec.Height";
_parent.setHeight(_rec._getheight /*int*/ (null));
RDebugUtils.currentLine=56754181;
 //BA.debugLineNum = 56754181;BA.debugLine="End Sub";
return "";
}
public static String  _hlv_oncreateviewholder(anywheresoftware.b4a.objects.PanelWrapper _parent,int _viewtype) throws Exception{
RDebugUtils.currentModule="act_profile";
if (Debug.shouldDelegate(mostCurrent.activityBA, "hlv_oncreateviewholder", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "hlv_oncreateviewholder", new Object[] {_parent,_viewtype}));}
ir.parsikhesab.pakhsh.cls_recfaktor _rec = null;
RDebugUtils.currentLine=56688640;
 //BA.debugLineNum = 56688640;BA.debugLine="Private Sub HLV_onCreateViewHolder (Parent As Pane";
RDebugUtils.currentLine=56688641;
 //BA.debugLineNum = 56688641;BA.debugLine="Dim rec As cls_RecFaktor";
_rec = new ir.parsikhesab.pakhsh.cls_recfaktor();
RDebugUtils.currentLine=56688642;
 //BA.debugLineNum = 56688642;BA.debugLine="rec.Initialize";
_rec._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=56688643;
 //BA.debugLineNum = 56688643;BA.debugLine="Parent.AddView(rec.Panel,0,0,100%x,rec.Height)";
_parent.AddView((android.view.View)(_rec._getpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ (null).getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),_rec._getheight /*int*/ (null));
RDebugUtils.currentLine=56688644;
 //BA.debugLineNum = 56688644;BA.debugLine="Parent.Tag=rec";
_parent.setTag((Object)(_rec));
RDebugUtils.currentLine=56688645;
 //BA.debugLineNum = 56688645;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(ir.parsikhesab.pakhsh.httpjob _job) throws Exception{
RDebugUtils.currentModule="act_profile";
if (Debug.shouldDelegate(mostCurrent.activityBA, "jobdone", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "jobdone", new Object[] {_job}));}
String _str = "";
RDebugUtils.currentLine=58720256;
 //BA.debugLineNum = 58720256;BA.debugLine="Sub JobDone (Job As HttpJob)";
RDebugUtils.currentLine=58720257;
 //BA.debugLineNum = 58720257;BA.debugLine="Job.GetRequest.Timeout=50000";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout((int) (50000));
RDebugUtils.currentLine=58720258;
 //BA.debugLineNum = 58720258;BA.debugLine="If Job.Success Then";
if (_job._success /*boolean*/ ) { 
RDebugUtils.currentLine=58720260;
 //BA.debugLineNum = 58720260;BA.debugLine="Dim Str As String = Job.GetString";
_str = _job._getstring /*String*/ (null);
RDebugUtils.currentLine=58720261;
 //BA.debugLineNum = 58720261;BA.debugLine="If Str <> \"\" Then";
if ((_str).equals("") == false) { 
RDebugUtils.currentLine=58720262;
 //BA.debugLineNum = 58720262;BA.debugLine="Select Case Job.JobName";
switch (BA.switchObjectToInt(_job._jobname /*String*/ ,"GetLocation")) {
case 0: {
RDebugUtils.currentLine=58720264;
 //BA.debugLineNum = 58720264;BA.debugLine="If Str = \"No Result\" Then";
if ((_str).equals("No Result")) { 
RDebugUtils.currentLine=58720265;
 //BA.debugLineNum = 58720265;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=58720266;
 //BA.debugLineNum = 58720266;BA.debugLine="ToastMessageShow(\"برای این شخص موقعیت ثبت نش";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("برای این شخص موقعیت ثبت نشده است"),anywheresoftware.b4a.keywords.Common.True);
 }else {
RDebugUtils.currentLine=58720268;
 //BA.debugLineNum = 58720268;BA.debugLine="LoadGetLocation(Str)";
_loadgetlocation(_str);
 };
 break; }
}
;
 }else {
RDebugUtils.currentLine=58720272;
 //BA.debugLineNum = 58720272;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 };
 }else {
RDebugUtils.currentLine=58720276;
 //BA.debugLineNum = 58720276;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 };
RDebugUtils.currentLine=58720279;
 //BA.debugLineNum = 58720279;BA.debugLine="jobInternet.Release";
mostCurrent._jobinternet._release /*String*/ (null);
RDebugUtils.currentLine=58720280;
 //BA.debugLineNum = 58720280;BA.debugLine="End Sub";
return "";
}
public static String  _loadgetlocation(String _str) throws Exception{
RDebugUtils.currentModule="act_profile";
if (Debug.shouldDelegate(mostCurrent.activityBA, "loadgetlocation", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "loadgetlocation", new Object[] {_str}));}
anywheresoftware.b4a.objects.collections.List _rowslist = null;
anywheresoftware.b4a.objects.collections.Map _row = null;
int _i = 0;
RDebugUtils.currentLine=58589184;
 //BA.debugLineNum = 58589184;BA.debugLine="Sub LoadGetLocation(Str As String)";
RDebugUtils.currentLine=58589185;
 //BA.debugLineNum = 58589185;BA.debugLine="Dim RowsList As List";
_rowslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=58589186;
 //BA.debugLineNum = 58589186;BA.debugLine="Dim Row As Map";
_row = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=58589187;
 //BA.debugLineNum = 58589187;BA.debugLine="MCode.Json.Initialize(Str.Trim )";
mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_str.trim());
RDebugUtils.currentLine=58589188;
 //BA.debugLineNum = 58589188;BA.debugLine="RowsList = MCode.Json.NextArray";
_rowslist = mostCurrent._mcode._json /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=58589189;
 //BA.debugLineNum = 58589189;BA.debugLine="For i = 0 To RowsList.Size - 1";
{
final int step5 = 1;
final int limit5 = (int) (_rowslist.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=58589190;
 //BA.debugLineNum = 58589190;BA.debugLine="Row=RowsList.Get(i)";
_row = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_rowslist.Get(_i)));
RDebugUtils.currentLine=58589191;
 //BA.debugLineNum = 58589191;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=58589192;
 //BA.debugLineNum = 58589192;BA.debugLine="ShowMap(Row.Get(\"FldLat\"), Row.Get(\"FldLon\"))";
_showmap(BA.ObjectToString(_row.Get((Object)("FldLat"))),BA.ObjectToString(_row.Get((Object)("FldLon"))));
 }
};
RDebugUtils.currentLine=58589194;
 //BA.debugLineNum = 58589194;BA.debugLine="End Sub";
return "";
}
public static String  _kaladefault() throws Exception{
RDebugUtils.currentModule="act_profile";
if (Debug.shouldDelegate(mostCurrent.activityBA, "kaladefault", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "kaladefault", null));}
RDebugUtils.currentLine=57409536;
 //BA.debugLineNum = 57409536;BA.debugLine="Sub KalaDefault";
RDebugUtils.currentLine=57409544;
 //BA.debugLineNum = 57409544;BA.debugLine="StartActivity(Act_KalaDefault)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._act_kaladefault.getObject()));
RDebugUtils.currentLine=57409547;
 //BA.debugLineNum = 57409547;BA.debugLine="End Sub";
return "";
}
public static String  _kalalisti() throws Exception{
RDebugUtils.currentModule="act_profile";
if (Debug.shouldDelegate(mostCurrent.activityBA, "kalalisti", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "kalalisti", null));}
RDebugUtils.currentLine=57475072;
 //BA.debugLineNum = 57475072;BA.debugLine="Sub Kalalisti";
RDebugUtils.currentLine=57475080;
 //BA.debugLineNum = 57475080;BA.debugLine="StartActivity(Act_Kala_listi)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._act_kala_listi.getObject()));
RDebugUtils.currentLine=57475083;
 //BA.debugLineNum = 57475083;BA.debugLine="End Sub";
return "";
}
public static String  _savelastseen() throws Exception{
RDebugUtils.currentModule="act_profile";
if (Debug.shouldDelegate(mostCurrent.activityBA, "savelastseen", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "savelastseen", null));}
String _dateshamsi = "";
String _time = "";
String _d = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
int _count = 0;
int _maxradif = 0;
RDebugUtils.currentLine=57147392;
 //BA.debugLineNum = 57147392;BA.debugLine="Sub SaveLastSeen";
RDebugUtils.currentLine=57147394;
 //BA.debugLineNum = 57147394;BA.debugLine="DateTime.DateFormat=\"yyyy-MM-dd\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=57147396;
 //BA.debugLineNum = 57147396;BA.debugLine="Dim DateShamsi As String = MCode.DatePersian";
_dateshamsi = mostCurrent._mcode._datepersian /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=57147397;
 //BA.debugLineNum = 57147397;BA.debugLine="Dim Time As String = DateTime.Time(DateTime.Now)";
_time = anywheresoftware.b4a.keywords.Common.DateTime.Time(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
RDebugUtils.currentLine=57147398;
 //BA.debugLineNum = 57147398;BA.debugLine="Dim D As String = DateShamsi & \"T\" & Time";
_d = _dateshamsi+"T"+_time;
RDebugUtils.currentLine=57147399;
 //BA.debugLineNum = 57147399;BA.debugLine="LogColor(\"D: \" & D,Colors.Red)";
anywheresoftware.b4a.keywords.Common.LogImpl("557147399","D: "+_d,anywheresoftware.b4a.keywords.Common.Colors.Red);
RDebugUtils.currentLine=57147401;
 //BA.debugLineNum = 57147401;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From Tb";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblLastSeen Where FldC_Ashkhas = '"+mostCurrent._mcode._c_tafzili /*String*/ +"' ");
RDebugUtils.currentLine=57147402;
 //BA.debugLineNum = 57147402;BA.debugLine="If Cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=57147403;
 //BA.debugLineNum = 57147403;BA.debugLine="MCode.SaveUpdate(\"Update TblLastSeen Set LastSee";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Update TblLastSeen Set LastSeen = '"+_d+"' Where FldC_Ashkhas = '"+mostCurrent._mcode._c_tafzili /*String*/ +"'");
 }else {
RDebugUtils.currentLine=57147405;
 //BA.debugLineNum = 57147405;BA.debugLine="MCode.SaveUpdate(\"Insert Into TblLastSeen (FldC_";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Insert Into TblLastSeen (FldC_Ashkhas,LastSeen) Values ('"+mostCurrent._mcode._c_tafzili /*String*/ +"','"+_d+"')");
 };
RDebugUtils.currentLine=57147407;
 //BA.debugLineNum = 57147407;BA.debugLine="MCode.SaveUpdate(\"Update TblAshkhas Set lastSeen";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Update TblAshkhas Set lastSeen = '"+_d+"' Where fldCodetafzili = '"+mostCurrent._mcode._c_tafzili /*String*/ +"'");
RDebugUtils.currentLine=57147409;
 //BA.debugLineNum = 57147409;BA.debugLine="If MCode.TourVisitSW And MCode.TourVisit=1 Then";
if (mostCurrent._mcode._tourvisitsw /*boolean*/  && (mostCurrent._mcode._tourvisit /*String*/ ).equals(BA.NumberToString(1))) { 
RDebugUtils.currentLine=57147410;
 //BA.debugLineNum = 57147410;BA.debugLine="MCode.SaveUpdate(\"Update tblTourVisitor Set fldV";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Update tblTourVisitor Set fldVaziat='2',fldTimeVisit='"+_time+"',fldSend='False' Where fldCodeTafzili = '"+mostCurrent._mcode._c_tafzili /*String*/ +"' and fldDateVisit='"+mostCurrent._mcode._datepersian /*String*/ (mostCurrent.activityBA)+"' and fldType='Tour'");
 }else {
RDebugUtils.currentLine=57147412;
 //BA.debugLineNum = 57147412;BA.debugLine="Dim Count As Int = MCode.SingleResult($\"Select C";
_count = (int)(BA.ObjectToNumber(mostCurrent._mcode._singleresult /*Object*/ (mostCurrent.activityBA,("Select Count(fldRadif) from tblTourVisitor where  fldDateVisit='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._mcode._datepersian /*String*/ (mostCurrent.activityBA)))+"' and fldType='Free'"))));
RDebugUtils.currentLine=57147413;
 //BA.debugLineNum = 57147413;BA.debugLine="Dim MaxRadif As Int";
_maxradif = 0;
RDebugUtils.currentLine=57147414;
 //BA.debugLineNum = 57147414;BA.debugLine="If Count=0 Then";
if (_count==0) { 
RDebugUtils.currentLine=57147415;
 //BA.debugLineNum = 57147415;BA.debugLine="MaxRadif=1";
_maxradif = (int) (1);
 }else {
RDebugUtils.currentLine=57147417;
 //BA.debugLineNum = 57147417;BA.debugLine="MaxRadif= MCode.SingleResult($\"Select Max(fldRa";
_maxradif = (int)(BA.ObjectToNumber(mostCurrent._mcode._singleresult /*Object*/ (mostCurrent.activityBA,("Select Max(fldRadif) from tblTourVisitor where  fldDateVisit='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._mcode._datepersian /*String*/ (mostCurrent.activityBA)))+"' and fldType='Free'"))));
RDebugUtils.currentLine=57147418;
 //BA.debugLineNum = 57147418;BA.debugLine="MaxRadif=MaxRadif+1";
_maxradif = (int) (_maxradif+1);
 };
RDebugUtils.currentLine=57147420;
 //BA.debugLineNum = 57147420;BA.debugLine="Cu = MCode.Result($\"SELECT * FROM TblAshkhas WHE";
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,("SELECT * FROM TblAshkhas WHERE TblAshkhas.fldCodetafzili ="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._mcode._c_tafzili /*String*/ ))+""));
RDebugUtils.currentLine=57147422;
 //BA.debugLineNum = 57147422;BA.debugLine="Cu.Position=0";
_cu.setPosition((int) (0));
RDebugUtils.currentLine=57147423;
 //BA.debugLineNum = 57147423;BA.debugLine="MCode.SaveUpdate(\"Insert into tblTourVisitor(fld";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Insert into tblTourVisitor(fldRadif,fldCodeSuperVisor,fldCodeGroup,fldCodeVisitor,fldCodeTafzili,fldSharheTafzili,fldDate,fldDateVisit,fldTimeVisit,fldDateNextVisit,fldDateTozie,fldShomareSefaresh,fldTimeSefaresh,fldSharh,fldVaziat,fldShomareFactor,fldSend,fldType) Values("+BA.NumberToString(_maxradif)+",0,'"+_cu.GetString("fldCodeGroup")+"','"+mostCurrent._mcode._c_visitor /*String*/ +"','"+mostCurrent._mcode._c_tafzili /*String*/ +"','"+mostCurrent._mcode._n_tafzili /*String*/ +"','"+mostCurrent._mcode._datepersian /*String*/ (mostCurrent.activityBA)+"','"+mostCurrent._mcode._datepersian /*String*/ (mostCurrent.activityBA)+"','"+_time+"','0','0','0','','0','2','0','False','Free')");
 };
RDebugUtils.currentLine=57147427;
 //BA.debugLineNum = 57147427;BA.debugLine="End Sub";
return "";
}
public static String  _lbl_listi_click() throws Exception{
RDebugUtils.currentModule="act_profile";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lbl_listi_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lbl_listi_click", null));}
String _date = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
RDebugUtils.currentLine=57081856;
 //BA.debugLineNum = 57081856;BA.debugLine="Sub lbl_Listi_Click";
RDebugUtils.currentLine=57081857;
 //BA.debugLineNum = 57081857;BA.debugLine="GotoPage = True";
_gotopage = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=57081858;
 //BA.debugLineNum = 57081858;BA.debugLine="ProgressDialogShow(\"\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=57081859;
 //BA.debugLineNum = 57081859;BA.debugLine="MCode.SaveUpdate(\"Delete From TblSabad\")";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Delete From TblSabad");
RDebugUtils.currentLine=57081860;
 //BA.debugLineNum = 57081860;BA.debugLine="Dim Date As String = MCode.ConvertNumbersPersian2";
_date = mostCurrent._mcode._convertnumberspersian2english /*String*/ (mostCurrent.activityBA,mostCurrent._mcode._datepersian /*String*/ (mostCurrent.activityBA));
RDebugUtils.currentLine=57081862;
 //BA.debugLineNum = 57081862;BA.debugLine="MCode.FaktorSelect=\"\"";
mostCurrent._mcode._faktorselect /*String*/  = "";
RDebugUtils.currentLine=57081863;
 //BA.debugLineNum = 57081863;BA.debugLine="MCode.Action=\"SabtFaktor\"";
mostCurrent._mcode._action /*String*/  = "SabtFaktor";
RDebugUtils.currentLine=57081865;
 //BA.debugLineNum = 57081865;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * from Tb";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * from TblLogVisitSefaresh Where FldC_Ashkhas = '"+mostCurrent._mcode._c_tafzili /*String*/ +"'");
RDebugUtils.currentLine=57081866;
 //BA.debugLineNum = 57081866;BA.debugLine="If Cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=57081867;
 //BA.debugLineNum = 57081867;BA.debugLine="MCode.SaveUpdate(\"Update TblLogVisitSefaresh Set";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Update TblLogVisitSefaresh Set FldVisit = '"+_date+"' Where FldC_Ashkhas = '"+mostCurrent._mcode._c_tafzili /*String*/ +"'");
 }else {
RDebugUtils.currentLine=57081869;
 //BA.debugLineNum = 57081869;BA.debugLine="MCode.SaveUpdate(\"Insert Into TblLogVisitSefares";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Insert Into TblLogVisitSefaresh (FldC_Ashkhas,FldVisit,FldSefaresh,FldElatSefaresh,FldLat,FldLon) Values ('"+mostCurrent._mcode._codemoshtari /*String*/ +"','"+_date+"','','','','')");
 };
RDebugUtils.currentLine=57081872;
 //BA.debugLineNum = 57081872;BA.debugLine="MCode.SaveUpdate(\"Update TblVisitorTour Set FldLa";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Update TblVisitorTour Set FldLastVisit = '"+_date+"' Where FldC_Ashkhas = '"+mostCurrent._mcode._c_tafzili /*String*/ +"'");
RDebugUtils.currentLine=57081875;
 //BA.debugLineNum = 57081875;BA.debugLine="SaveLastSeen";
_savelastseen();
RDebugUtils.currentLine=57081880;
 //BA.debugLineNum = 57081880;BA.debugLine="Pnl_menu.SetVisibleAnimated(600,False)";
mostCurrent._pnl_menu.SetVisibleAnimated((int) (600),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=57081882;
 //BA.debugLineNum = 57081882;BA.debugLine="Kalalisti";
_kalalisti();
RDebugUtils.currentLine=57081899;
 //BA.debugLineNum = 57081899;BA.debugLine="End Sub";
return "";
}
public static void  _lbl_sabt_locastion_click() throws Exception{
RDebugUtils.currentModule="act_profile";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lbl_sabt_locastion_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "lbl_sabt_locastion_click", null); return;}
ResumableSub_lbl_sabt_Locastion_Click rsub = new ResumableSub_lbl_sabt_Locastion_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_lbl_sabt_Locastion_Click extends BA.ResumableSub {
public ResumableSub_lbl_sabt_Locastion_Click(ir.parsikhesab.pakhsh.act_profile parent) {
this.parent = parent;
}
ir.parsikhesab.pakhsh.act_profile parent;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_profile";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=57671681;
 //BA.debugLineNum = 57671681;BA.debugLine="pnl_location.SetVisibleAnimated(600,False)";
parent.mostCurrent._pnl_location.SetVisibleAnimated((int) (600),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=57671684;
 //BA.debugLineNum = 57671684;BA.debugLine="If Gps.GPSEnabled=False Then";
if (true) break;

case 1:
//if
this.state = 16;
if (parent._gps.getGPSEnabled()==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 16;
RDebugUtils.currentLine=57671685;
 //BA.debugLineNum = 57671685;BA.debugLine="ToastMessageShow(\"موقعیت مکانی خود را روشن کنید";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("موقعیت مکانی خود را روشن کنید"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=57671686;
 //BA.debugLineNum = 57671686;BA.debugLine="StartActivity(Gps.LocationSettingsIntent)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent._gps.getLocationSettingsIntent()));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=57671688;
 //BA.debugLineNum = 57671688;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select FldLat,F";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = parent.mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select FldLat,FldLon From TblAshkhas Where fldCodetafzili = '"+parent.mostCurrent._mcode._c_tafzili /*String*/ +"' And FldLat <> '0' And FldLon <> '0'");
RDebugUtils.currentLine=57671689;
 //BA.debugLineNum = 57671689;BA.debugLine="If Cu.RowCount>0 Then";
if (true) break;

case 6:
//if
this.state = 15;
if (_cu.getRowCount()>0) { 
this.state = 8;
}else {
this.state = 14;
}if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=57671690;
 //BA.debugLineNum = 57671690;BA.debugLine="Msgbox2Async(\"برای این مشتری موقعیت ثبت شده اس";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("برای این مشتری موقعیت ثبت شده است آیا مایلید موقعیت را اصلاح کنید؟"),BA.ObjectToCharSequence(""),"بله","","خیر",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null)),processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=57671691;
 //BA.debugLineNum = 57671691;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_profile", "lbl_sabt_locastion_click"), null);
this.state = 17;
return;
case 17:
//C
this.state = 9;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=57671692;
 //BA.debugLineNum = 57671692;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
if (true) break;

case 9:
//if
this.state = 12;
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=57671694;
 //BA.debugLineNum = 57671694;BA.debugLine="StartActivity(Act_SaveLocation)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._act_savelocation.getObject()));
 if (true) break;

case 12:
//C
this.state = 15;
;
 if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=57671698;
 //BA.debugLineNum = 57671698;BA.debugLine="StartActivity(Act_SaveLocation)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._act_savelocation.getObject()));
 if (true) break;

case 15:
//C
this.state = 16;
;
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=57671702;
 //BA.debugLineNum = 57671702;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _lbl_show_locastion_click() throws Exception{
RDebugUtils.currentModule="act_profile";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lbl_show_locastion_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lbl_show_locastion_click", null));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
anywheresoftware.b4a.gps.LocationWrapper _l = null;
RDebugUtils.currentLine=57606144;
 //BA.debugLineNum = 57606144;BA.debugLine="Sub lbl_show_Locastion_Click";
RDebugUtils.currentLine=57606145;
 //BA.debugLineNum = 57606145;BA.debugLine="pnl_location.SetVisibleAnimated(600,False)";
mostCurrent._pnl_location.SetVisibleAnimated((int) (600),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=57606148;
 //BA.debugLineNum = 57606148;BA.debugLine="If Gps.GPSEnabled=False Then";
if (_gps.getGPSEnabled()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=57606149;
 //BA.debugLineNum = 57606149;BA.debugLine="ToastMessageShow(\"موقعیت مکانی خود را روشن کنید";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("موقعیت مکانی خود را روشن کنید"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=57606150;
 //BA.debugLineNum = 57606150;BA.debugLine="StartActivity(Gps.LocationSettingsIntent)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(_gps.getLocationSettingsIntent()));
 }else {
RDebugUtils.currentLine=57606152;
 //BA.debugLineNum = 57606152;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From T";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblAshkhas Where fldCodetafzili = '"+mostCurrent._mcode._c_tafzili /*String*/ +"' And FldLat <> '0' And FldLon <> '0'");
RDebugUtils.currentLine=57606153;
 //BA.debugLineNum = 57606153;BA.debugLine="If Cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=57606154;
 //BA.debugLineNum = 57606154;BA.debugLine="Try";
try {RDebugUtils.currentLine=57606155;
 //BA.debugLineNum = 57606155;BA.debugLine="Cu.Position=0";
_cu.setPosition((int) (0));
RDebugUtils.currentLine=57606156;
 //BA.debugLineNum = 57606156;BA.debugLine="Dim l As Location";
_l = new anywheresoftware.b4a.gps.LocationWrapper();
RDebugUtils.currentLine=57606157;
 //BA.debugLineNum = 57606157;BA.debugLine="l.Initialize";
_l.Initialize();
RDebugUtils.currentLine=57606158;
 //BA.debugLineNum = 57606158;BA.debugLine="l.Latitude=Cu.GetString(\"FldLat\")";
_l.setLatitude((double)(Double.parseDouble(_cu.GetString("FldLat"))));
RDebugUtils.currentLine=57606159;
 //BA.debugLineNum = 57606159;BA.debugLine="l.Longitude=Cu.GetString(\"FldLon\")";
_l.setLongitude((double)(Double.parseDouble(_cu.GetString("FldLon"))));
RDebugUtils.currentLine=57606160;
 //BA.debugLineNum = 57606160;BA.debugLine="Act_ShowLocation.Location=l";
mostCurrent._act_showlocation._location /*anywheresoftware.b4a.gps.LocationWrapper*/  = _l;
RDebugUtils.currentLine=57606161;
 //BA.debugLineNum = 57606161;BA.debugLine="Act_ShowLocation.Name=Cu.GetString(\"fldSharheT";
mostCurrent._act_showlocation._name /*String*/  = _cu.GetString("fldSharheTafzili");
RDebugUtils.currentLine=57606162;
 //BA.debugLineNum = 57606162;BA.debugLine="StartActivity(Act_ShowLocation)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._act_showlocation.getObject()));
 } 
       catch (Exception e18) {
			processBA.setLastException(e18);RDebugUtils.currentLine=57606164;
 //BA.debugLineNum = 57606164;BA.debugLine="ToastMessageShow(\"برای این شخص موقعیت ثبت نگر";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("برای این شخص موقعیت ثبت نگردیده است"),anywheresoftware.b4a.keywords.Common.True);
 };
 }else {
RDebugUtils.currentLine=57606168;
 //BA.debugLineNum = 57606168;BA.debugLine="ToastMessageShow(\"برای این شخص موقعیت ثبت نگرد";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("برای این شخص موقعیت ثبت نگردیده است"),anywheresoftware.b4a.keywords.Common.True);
 };
 };
RDebugUtils.currentLine=57606172;
 //BA.debugLineNum = 57606172;BA.debugLine="End Sub";
return "";
}
public static String  _lblcall_click() throws Exception{
RDebugUtils.currentModule="act_profile";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lblcall_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lblcall_click", null));}
int _ispos = 0;
String _str = "";
anywheresoftware.b4a.objects.IntentWrapper _i = null;
RDebugUtils.currentLine=57802752;
 //BA.debugLineNum = 57802752;BA.debugLine="Sub lblCall_Click";
RDebugUtils.currentLine=57802753;
 //BA.debugLineNum = 57802753;BA.debugLine="Dim isPos As Int = myCode.getSetting(\"setting.dat";
_ispos = (int)(Double.parseDouble(mostCurrent._mycode._getsetting /*String*/ (mostCurrent.activityBA,"setting.dat","isPos",BA.NumberToString(0))));
RDebugUtils.currentLine=57802754;
 //BA.debugLineNum = 57802754;BA.debugLine="Select Case isPos";
switch (_ispos) {
case 1: {
RDebugUtils.currentLine=57802756;
 //BA.debugLineNum = 57802756;BA.debugLine="ToastMessageShow(\"این امکان فقط برای تلفن همراه";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("این امکان فقط برای تلفن همراه است"),anywheresoftware.b4a.keywords.Common.True);
 break; }
case 0: {
RDebugUtils.currentLine=57802758;
 //BA.debugLineNum = 57802758;BA.debugLine="Dim str As String=LblTell.tag";
_str = BA.ObjectToString(mostCurrent._lbltell.getTag());
RDebugUtils.currentLine=57802759;
 //BA.debugLineNum = 57802759;BA.debugLine="Dim i As Intent";
_i = new anywheresoftware.b4a.objects.IntentWrapper();
RDebugUtils.currentLine=57802760;
 //BA.debugLineNum = 57802760;BA.debugLine="i.Initialize(i.ACTION_VIEW, \"tel:\"&str)";
_i.Initialize(_i.ACTION_VIEW,"tel:"+_str);
RDebugUtils.currentLine=57802761;
 //BA.debugLineNum = 57802761;BA.debugLine="StartActivity(i)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(_i.getObject()));
 break; }
}
;
RDebugUtils.currentLine=57802765;
 //BA.debugLineNum = 57802765;BA.debugLine="End Sub";
return "";
}
public static String  _lbldate_click() throws Exception{
RDebugUtils.currentModule="act_profile";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lbldate_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lbldate_click", null));}
com.porya.datetimepicker.PersianMaterialDatePickerWrapper _p1 = null;
RDebugUtils.currentLine=58064896;
 //BA.debugLineNum = 58064896;BA.debugLine="Sub LblDate_Click";
RDebugUtils.currentLine=58064897;
 //BA.debugLineNum = 58064897;BA.debugLine="Dim p1 As PersianMaterialDatePicker";
_p1 = new com.porya.datetimepicker.PersianMaterialDatePickerWrapper();
RDebugUtils.currentLine=58064898;
 //BA.debugLineNum = 58064898;BA.debugLine="p1.Initialize(\"p1\",p1.PersianYear,p1.PersianMonth";
_p1.Initialize(mostCurrent.activityBA,"p1",_p1.getPersianYear(),_p1.getPersianMonth(),_p1.getPersianDay());
RDebugUtils.currentLine=58064899;
 //BA.debugLineNum = 58064899;BA.debugLine="p1.AccentColor = Colors.RGB(83,99,255)";
_p1.setAccentColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (83),(int) (99),(int) (255)));
RDebugUtils.currentLine=58064900;
 //BA.debugLineNum = 58064900;BA.debugLine="p1.OkText = \"تایید\"";
_p1.setOkText("تایید");
RDebugUtils.currentLine=58064901;
 //BA.debugLineNum = 58064901;BA.debugLine="p1.CancelText = \"لغو\"";
_p1.setCancelText("لغو");
RDebugUtils.currentLine=58064902;
 //BA.debugLineNum = 58064902;BA.debugLine="p1.Title = \"تا تاریخ\"";
_p1.setTitle("تا تاریخ");
RDebugUtils.currentLine=58064903;
 //BA.debugLineNum = 58064903;BA.debugLine="p1.Typeface = \"iransansmobile(fanum)_bold.ttf\"";
_p1.setTypeface("iransansmobile(fanum)_bold.ttf");
RDebugUtils.currentLine=58064904;
 //BA.debugLineNum = 58064904;BA.debugLine="p1.Show(\"p1\")";
_p1.Show("p1");
RDebugUtils.currentLine=58064905;
 //BA.debugLineNum = 58064905;BA.debugLine="End Sub";
return "";
}
public static String  _lbldesc_click() throws Exception{
RDebugUtils.currentModule="act_profile";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lbldesc_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lbldesc_click", null));}
String _str = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
String _nextvisitdate = "";
anywheresoftware.b4a.objects.collections.List _lst = null;
anywheresoftware.b4a.objects.collections.List _dt = null;
String _lastdate = "";
String _nextvisittext = "";
RDebugUtils.currentLine=58458112;
 //BA.debugLineNum = 58458112;BA.debugLine="Sub LblDesc_Click";
RDebugUtils.currentLine=58458113;
 //BA.debugLineNum = 58458113;BA.debugLine="Dim Str As String";
_str = "";
RDebugUtils.currentLine=58458114;
 //BA.debugLineNum = 58458114;BA.debugLine="Dim Cu As Cursor=MCode.Result(\"Select * From TblA";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblAshkhas Where fldCodetafzili = '"+mostCurrent._mcode._c_tafzili /*String*/ +"'");
RDebugUtils.currentLine=58458115;
 //BA.debugLineNum = 58458115;BA.debugLine="If Cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=58458116;
 //BA.debugLineNum = 58458116;BA.debugLine="Cu.Position=0";
_cu.setPosition((int) (0));
RDebugUtils.currentLine=58458117;
 //BA.debugLineNum = 58458117;BA.debugLine="Dim nextVisitDate As String = myCode.Is_Null(Cu.";
_nextvisitdate = mostCurrent._mycode._is_null /*String*/ (mostCurrent.activityBA,_cu.GetString("nextVisitDate"));
RDebugUtils.currentLine=58458118;
 //BA.debugLineNum = 58458118;BA.debugLine="Dim Lst As List = MCode.Sf.Split(nextVisitDate.R";
_lst = new anywheresoftware.b4a.objects.collections.List();
_lst = mostCurrent._mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvvv4(_nextvisitdate.replace("-","/"),"T");
RDebugUtils.currentLine=58458119;
 //BA.debugLineNum = 58458119;BA.debugLine="If nextVisitDate.Length>0 Then";
if (_nextvisitdate.length()>0) { 
RDebugUtils.currentLine=58458120;
 //BA.debugLineNum = 58458120;BA.debugLine="Dim DT As List = MCode.Sf.Split(Lst.Get(0),\"/\")";
_dt = new anywheresoftware.b4a.objects.collections.List();
_dt = mostCurrent._mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvvv4(BA.ObjectToString(_lst.Get((int) (0))),"/");
RDebugUtils.currentLine=58458121;
 //BA.debugLineNum = 58458121;BA.debugLine="Dim lastDate As String = MCode.PersianDate.getD";
_lastdate = mostCurrent._mcode._persiandate /*anywheresoftware.b4a.student.PersianDate*/ .getDate((int)(BA.ObjectToNumber(_dt.Get((int) (0)))),(int)(BA.ObjectToNumber(_dt.Get((int) (1)))),(int)(BA.ObjectToNumber(_dt.Get((int) (2)))),"/");
RDebugUtils.currentLine=58458122;
 //BA.debugLineNum = 58458122;BA.debugLine="Str = \"آخرین تاریخ ثبت شده: \" & lastDate & CRLF";
_str = "آخرین تاریخ ثبت شده: "+_lastdate+anywheresoftware.b4a.keywords.Common.CRLF;
 }else {
RDebugUtils.currentLine=58458124;
 //BA.debugLineNum = 58458124;BA.debugLine="Str = \"آخرین تاریخ ثبت شده: //\" & CRLF";
_str = "آخرین تاریخ ثبت شده: //"+anywheresoftware.b4a.keywords.Common.CRLF;
 };
RDebugUtils.currentLine=58458127;
 //BA.debugLineNum = 58458127;BA.debugLine="Dim nextVisitText As String = myCode.Is_Null(Cu.";
_nextvisittext = mostCurrent._mycode._is_null /*String*/ (mostCurrent.activityBA,_cu.GetString("nextVisitText"));
RDebugUtils.currentLine=58458128;
 //BA.debugLineNum = 58458128;BA.debugLine="If nextVisitText.Length>0 Then";
if (_nextvisittext.length()>0) { 
RDebugUtils.currentLine=58458129;
 //BA.debugLineNum = 58458129;BA.debugLine="Str = Str & \"آخرین یادداشت ثبت شده: \" & Cu.GetS";
_str = _str+"آخرین یادداشت ثبت شده: "+_cu.GetString("nextVisitText");
 }else {
RDebugUtils.currentLine=58458131;
 //BA.debugLineNum = 58458131;BA.debugLine="Str = Str & \"آخرین یادداشت ثبت شده: ...\"";
_str = _str+"آخرین یادداشت ثبت شده: ...";
 };
RDebugUtils.currentLine=58458133;
 //BA.debugLineNum = 58458133;BA.debugLine="MsgboxAsync(Str,\"\")";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence(_str),BA.ObjectToCharSequence(""),processBA);
 };
RDebugUtils.currentLine=58458135;
 //BA.debugLineNum = 58458135;BA.debugLine="End Sub";
return "";
}
public static String  _lbltasvie_click() throws Exception{
RDebugUtils.currentModule="act_profile";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lbltasvie_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lbltasvie_click", null));}
RDebugUtils.currentLine=58916864;
 //BA.debugLineNum = 58916864;BA.debugLine="Private Sub lblTasvie_Click";
RDebugUtils.currentLine=58916865;
 //BA.debugLineNum = 58916865;BA.debugLine="Act_Mali.ShomareFactor=0";
mostCurrent._act_mali._shomarefactor /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=58916866;
 //BA.debugLineNum = 58916866;BA.debugLine="Act_Mali.MabalghGhablepardakht=mande";
mostCurrent._act_mali._mabalghghablepardakht /*String*/  = mostCurrent._mande;
RDebugUtils.currentLine=58916867;
 //BA.debugLineNum = 58916867;BA.debugLine="Act_Mali.CodeMoshtari=MCode.C_Tafzili";
mostCurrent._act_mali._codemoshtari /*String*/  = mostCurrent._mcode._c_tafzili /*String*/ ;
RDebugUtils.currentLine=58916868;
 //BA.debugLineNum = 58916868;BA.debugLine="Act_Mali.NameMoshtari=MCode.N_Tafzili";
mostCurrent._act_mali._namemoshtari /*String*/  = mostCurrent._mcode._n_tafzili /*String*/ ;
RDebugUtils.currentLine=58916869;
 //BA.debugLineNum = 58916869;BA.debugLine="Act_Mali.ShomareTell=LblTell.Text";
mostCurrent._act_mali._shomaretell /*String*/  = mostCurrent._lbltell.getText();
RDebugUtils.currentLine=58916870;
 //BA.debugLineNum = 58916870;BA.debugLine="StartActivity(Act_Mali)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._act_mali.getObject()));
RDebugUtils.currentLine=58916871;
 //BA.debugLineNum = 58916871;BA.debugLine="End Sub";
return "";
}
public static String  _showmap(String _lat1,String _lon1) throws Exception{
RDebugUtils.currentModule="act_profile";
if (Debug.shouldDelegate(mostCurrent.activityBA, "showmap", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "showmap", new Object[] {_lat1,_lon1}));}
double _destlat = 0;
double _destlng = 0;
String _label = "";
String _uri = "";
anywheresoftware.b4a.objects.IntentWrapper _intent = null;
RDebugUtils.currentLine=58654720;
 //BA.debugLineNum = 58654720;BA.debugLine="Sub ShowMap(Lat1 As String,Lon1 As String)";
RDebugUtils.currentLine=58654721;
 //BA.debugLineNum = 58654721;BA.debugLine="If Lat1 =\"\" And Lon1=\"\" Then";
if ((_lat1).equals("") && (_lon1).equals("")) { 
RDebugUtils.currentLine=58654722;
 //BA.debugLineNum = 58654722;BA.debugLine="ToastMessageShow(\"برای این شخص موقعیت ثبت نشده ا";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("برای این شخص موقعیت ثبت نشده است"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=58654723;
 //BA.debugLineNum = 58654723;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=58654726;
 //BA.debugLineNum = 58654726;BA.debugLine="Dim destLat As Double = Lat1 ' عرض جغرافیایی مقصد";
_destlat = (double)(Double.parseDouble(_lat1));
RDebugUtils.currentLine=58654727;
 //BA.debugLineNum = 58654727;BA.debugLine="Dim destLng As Double = Lon1 ' طول جغرافیایی مقصد";
_destlng = (double)(Double.parseDouble(_lon1));
RDebugUtils.currentLine=58654728;
 //BA.debugLineNum = 58654728;BA.debugLine="Dim label As String = \"Destination\" ' برچسب مقصد";
_label = "Destination";
RDebugUtils.currentLine=58654730;
 //BA.debugLineNum = 58654730;BA.debugLine="Dim uri As String";
_uri = "";
RDebugUtils.currentLine=58654731;
 //BA.debugLineNum = 58654731;BA.debugLine="uri = \"google.navigation:q=\" & destLat & \",\" & de";
_uri = "google.navigation:q="+BA.NumberToString(_destlat)+","+BA.NumberToString(_destlng)+"&label="+_label;
RDebugUtils.currentLine=58654733;
 //BA.debugLineNum = 58654733;BA.debugLine="Dim intent As Intent";
_intent = new anywheresoftware.b4a.objects.IntentWrapper();
RDebugUtils.currentLine=58654734;
 //BA.debugLineNum = 58654734;BA.debugLine="intent.Initialize(intent.ACTION_VIEW, uri)";
_intent.Initialize(_intent.ACTION_VIEW,_uri);
RDebugUtils.currentLine=58654735;
 //BA.debugLineNum = 58654735;BA.debugLine="intent.SetComponent(\"com.google.android.apps.maps";
_intent.SetComponent("com.google.android.apps.maps");
RDebugUtils.currentLine=58654737;
 //BA.debugLineNum = 58654737;BA.debugLine="If intent.IsInitialized Then";
if (_intent.IsInitialized()) { 
RDebugUtils.currentLine=58654738;
 //BA.debugLineNum = 58654738;BA.debugLine="StartActivity(intent)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(_intent.getObject()));
 }else {
RDebugUtils.currentLine=58654740;
 //BA.debugLineNum = 58654740;BA.debugLine="ToastMessageShow(\"Google Maps app not found\", Tr";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Google Maps app not found"),anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=58654755;
 //BA.debugLineNum = 58654755;BA.debugLine="End Sub";
return "";
}
public static void  _mapfragment1_ready() throws Exception{
RDebugUtils.currentModule="act_profile";
if (Debug.shouldDelegate(mostCurrent.activityBA, "mapfragment1_ready", false))
	 {Debug.delegate(mostCurrent.activityBA, "mapfragment1_ready", null); return;}
ResumableSub_MapFragment1_Ready rsub = new ResumableSub_MapFragment1_Ready(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_MapFragment1_Ready extends BA.ResumableSub {
public ResumableSub_MapFragment1_Ready(ir.parsikhesab.pakhsh.act_profile parent) {
this.parent = parent;
}
ir.parsikhesab.pakhsh.act_profile parent;
String _permission = "";
boolean _result = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_profile";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=57278465;
 //BA.debugLineNum = 57278465;BA.debugLine="Sleep(100)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_profile", "mapfragment1_ready"),(int) (100));
this.state = 13;
return;
case 13:
//C
this.state = 1;
;
RDebugUtils.currentLine=57278466;
 //BA.debugLineNum = 57278466;BA.debugLine="Try";
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
RDebugUtils.currentLine=57278467;
 //BA.debugLineNum = 57278467;BA.debugLine="gmap = MapFragment1.GetMap";
parent.mostCurrent._gmap = parent.mostCurrent._mapfragment1.GetMap();
RDebugUtils.currentLine=57278468;
 //BA.debugLineNum = 57278468;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_ACCESS_FINE_LOC";
parent.mostCurrent._rp.CheckAndRequest(processBA,parent.mostCurrent._rp.PERMISSION_ACCESS_FINE_LOCATION);
RDebugUtils.currentLine=57278469;
 //BA.debugLineNum = 57278469;BA.debugLine="Wait For Activity_PermissionResult (Permission A";
anywheresoftware.b4a.keywords.Common.WaitFor("activity_permissionresult", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_profile", "mapfragment1_ready"), null);
this.state = 14;
return;
case 14:
//C
this.state = 4;
_permission = (String) result[0];
_result = (Boolean) result[1];
;
RDebugUtils.currentLine=57278470;
 //BA.debugLineNum = 57278470;BA.debugLine="If Result Then";
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
RDebugUtils.currentLine=57278471;
 //BA.debugLineNum = 57278471;BA.debugLine="gmap.MyLocationEnabled = True";
parent.mostCurrent._gmap.setMyLocationEnabled(anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=57278473;
 //BA.debugLineNum = 57278473;BA.debugLine="Log(\"No permission!\")";
anywheresoftware.b4a.keywords.Common.LogImpl("557278473","No permission!",0);
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
RDebugUtils.currentLine=57278476;
 //BA.debugLineNum = 57278476;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("557278476",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=57278479;
 //BA.debugLineNum = 57278479;BA.debugLine="End Sub";
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
public static String  _p_oncancel() throws Exception{
RDebugUtils.currentModule="act_profile";
if (Debug.shouldDelegate(mostCurrent.activityBA, "p_oncancel", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "p_oncancel", null));}
RDebugUtils.currentLine=58195968;
 //BA.debugLineNum = 58195968;BA.debugLine="Sub p_onCancel";
RDebugUtils.currentLine=58195969;
 //BA.debugLineNum = 58195969;BA.debugLine="Log(\"cancel\")";
anywheresoftware.b4a.keywords.Common.LogImpl("558195969","cancel",0);
RDebugUtils.currentLine=58195970;
 //BA.debugLineNum = 58195970;BA.debugLine="End Sub";
return "";
}
public static String  _p_ondateset(int _year,int _month,int _day) throws Exception{
RDebugUtils.currentModule="act_profile";
if (Debug.shouldDelegate(mostCurrent.activityBA, "p_ondateset", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "p_ondateset", new Object[] {_year,_month,_day}));}
RDebugUtils.currentLine=58130432;
 //BA.debugLineNum = 58130432;BA.debugLine="Sub p_onDateSet(year As Int,month As Int,day As In";
RDebugUtils.currentLine=58130433;
 //BA.debugLineNum = 58130433;BA.debugLine="Log(year&\"/\"&month&\"/\"&day)";
anywheresoftware.b4a.keywords.Common.LogImpl("558130433",BA.NumberToString(_year)+"/"+BA.NumberToString(_month)+"/"+BA.NumberToString(_day),0);
RDebugUtils.currentLine=58130434;
 //BA.debugLineNum = 58130434;BA.debugLine="LblDate.Text=year&\"/\"&NumberFormat(month,2,0)&\"/\"";
mostCurrent._lbldate.setText(BA.ObjectToCharSequence(BA.NumberToString(_year)+"/"+anywheresoftware.b4a.keywords.Common.NumberFormat(_month,(int) (2),(int) (0))+"/"+anywheresoftware.b4a.keywords.Common.NumberFormat(_day,(int) (2),(int) (0))));
RDebugUtils.currentLine=58130435;
 //BA.debugLineNum = 58130435;BA.debugLine="LblDate.Tag=MPD.PersianToGregorian(year,month,day";
mostCurrent._lbldate.setTag((Object)(mostCurrent._mpd.PersianToGregorian(_year,_month,_day).replace("/","-")));
RDebugUtils.currentLine=58130436;
 //BA.debugLineNum = 58130436;BA.debugLine="LogColor(LblDate.Tag,Colors.Magenta)";
anywheresoftware.b4a.keywords.Common.LogImpl("558130436",BA.ObjectToString(mostCurrent._lbldate.getTag()),anywheresoftware.b4a.keywords.Common.Colors.Magenta);
RDebugUtils.currentLine=58130437;
 //BA.debugLineNum = 58130437;BA.debugLine="End Sub";
return "";
}
public static String  _p_ondismiss() throws Exception{
RDebugUtils.currentModule="act_profile";
if (Debug.shouldDelegate(mostCurrent.activityBA, "p_ondismiss", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "p_ondismiss", null));}
RDebugUtils.currentLine=58261504;
 //BA.debugLineNum = 58261504;BA.debugLine="Sub p_onDismiss";
RDebugUtils.currentLine=58261505;
 //BA.debugLineNum = 58261505;BA.debugLine="Log(\"dismiss\")";
anywheresoftware.b4a.keywords.Common.LogImpl("558261505","dismiss",0);
RDebugUtils.currentLine=58261506;
 //BA.debugLineNum = 58261506;BA.debugLine="End Sub";
return "";
}
public static String  _savegps() throws Exception{
RDebugUtils.currentModule="act_profile";
if (Debug.shouldDelegate(mostCurrent.activityBA, "savegps", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "savegps", null));}
RDebugUtils.currentLine=57212928;
 //BA.debugLineNum = 57212928;BA.debugLine="Sub SaveGps";
RDebugUtils.currentLine=57212929;
 //BA.debugLineNum = 57212929;BA.debugLine="If Gps.GPSEnabled=False Then";
if (_gps.getGPSEnabled()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=57212930;
 //BA.debugLineNum = 57212930;BA.debugLine="ToastMessageShow(\"موقعیت مکانی خود را روشن کنید\"";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("موقعیت مکانی خود را روشن کنید"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=57212931;
 //BA.debugLineNum = 57212931;BA.debugLine="t1.Enabled=False";
_t1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=57212932;
 //BA.debugLineNum = 57212932;BA.debugLine="StartActivity(Gps.LocationSettingsIntent)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(_gps.getLocationSettingsIntent()));
 }else {
RDebugUtils.currentLine=57212934;
 //BA.debugLineNum = 57212934;BA.debugLine="ProgressDialogShow2(\"لطفا تا دریافت موقعیت مکانی";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(mostCurrent.activityBA,BA.ObjectToCharSequence("لطفا تا دریافت موقعیت مکانی صبر کنید"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=57212935;
 //BA.debugLineNum = 57212935;BA.debugLine="t1.Enabled=True";
_t1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=57212937;
 //BA.debugLineNum = 57212937;BA.debugLine="End Sub";
return "";
}
public static void  _t1_tick() throws Exception{
RDebugUtils.currentModule="act_profile";
if (Debug.shouldDelegate(mostCurrent.activityBA, "t1_tick", false))
	 {Debug.delegate(mostCurrent.activityBA, "t1_tick", null); return;}
ResumableSub_t1_tick rsub = new ResumableSub_t1_tick(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_t1_tick extends BA.ResumableSub {
public ResumableSub_t1_tick(ir.parsikhesab.pakhsh.act_profile parent) {
this.parent = parent;
}
ir.parsikhesab.pakhsh.act_profile parent;
anywheresoftware.b4a.objects.MapFragmentWrapper.CameraPositionWrapper _cl = null;
String _lat = "";
String _lon = "";
String _time = "";
String _date = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_profile";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=57344001;
 //BA.debugLineNum = 57344001;BA.debugLine="t1.Enabled=False";
parent._t1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=57344002;
 //BA.debugLineNum = 57344002;BA.debugLine="If gmap.IsInitialized Then";
if (true) break;

case 1:
//if
this.state = 24;
if (parent.mostCurrent._gmap.IsInitialized()) { 
this.state = 3;
}else {
this.state = 17;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=57344003;
 //BA.debugLineNum = 57344003;BA.debugLine="Try";
if (true) break;

case 4:
//try
this.state = 15;
this.catchState = 14;
this.state = 6;
if (true) break;

case 6:
//C
this.state = 7;
this.catchState = 14;
RDebugUtils.currentLine=57344004;
 //BA.debugLineNum = 57344004;BA.debugLine="Dim cl As CameraPosition";
_cl = new anywheresoftware.b4a.objects.MapFragmentWrapper.CameraPositionWrapper();
RDebugUtils.currentLine=57344005;
 //BA.debugLineNum = 57344005;BA.debugLine="cl.Initialize(gmap.MyLocation.Latitude,gmap.MyL";
_cl.Initialize(parent.mostCurrent._gmap.getMyLocation().getLatitude(),parent.mostCurrent._gmap.getMyLocation().getLongitude(),(float) (15));
RDebugUtils.currentLine=57344006;
 //BA.debugLineNum = 57344006;BA.debugLine="gmap.AnimateCamera(cl)";
parent.mostCurrent._gmap.AnimateCamera((com.google.android.gms.maps.model.CameraPosition)(_cl.getObject()));
RDebugUtils.currentLine=57344007;
 //BA.debugLineNum = 57344007;BA.debugLine="Dim Lat As String = gmap.MyLocation.Latitude";
_lat = BA.NumberToString(parent.mostCurrent._gmap.getMyLocation().getLatitude());
RDebugUtils.currentLine=57344008;
 //BA.debugLineNum = 57344008;BA.debugLine="Dim Lon As String = gmap.MyLocation.Longitude";
_lon = BA.NumberToString(parent.mostCurrent._gmap.getMyLocation().getLongitude());
RDebugUtils.currentLine=57344009;
 //BA.debugLineNum = 57344009;BA.debugLine="Gps.Stop";
parent._gps.Stop();
RDebugUtils.currentLine=57344011;
 //BA.debugLineNum = 57344011;BA.debugLine="Dim Time As String = MCode.ConvertNumbersPersia";
_time = parent.mostCurrent._mcode._convertnumberspersian2english /*String*/ (mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.DateTime.Time(anywheresoftware.b4a.keywords.Common.DateTime.getNow()));
RDebugUtils.currentLine=57344012;
 //BA.debugLineNum = 57344012;BA.debugLine="Dim Date As String = MCode.ConvertNumbersPersia";
_date = parent.mostCurrent._mcode._convertnumberspersian2english /*String*/ (mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.getNow()));
RDebugUtils.currentLine=57344013;
 //BA.debugLineNum = 57344013;BA.debugLine="Date=Date.Replace(\"/\",\"-\") & \" \" & Time & \".000";
_date = _date.replace("/","-")+" "+_time+".000";
RDebugUtils.currentLine=57344014;
 //BA.debugLineNum = 57344014;BA.debugLine="LogColor(Date,Colors.Magenta)";
anywheresoftware.b4a.keywords.Common.LogImpl("557344014",_date,anywheresoftware.b4a.keywords.Common.Colors.Magenta);
RDebugUtils.currentLine=57344015;
 //BA.debugLineNum = 57344015;BA.debugLine="MCode.SaveUpdate(\"Insert Into TblGpsVisitor (Fl";
parent.mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Insert Into TblGpsVisitor (FldVisitor,FldTarikh,FldTime,FldLat,FldLon) Values ('"+parent.mostCurrent._mcode._c_visitor /*String*/ +"','"+_date+"','"+_time+"','"+_lat+"','"+_lon+"')");
RDebugUtils.currentLine=57344018;
 //BA.debugLineNum = 57344018;BA.debugLine="LogColor(\"Save Locate: \" & Lat & \"--\" & Lon,Col";
anywheresoftware.b4a.keywords.Common.LogImpl("557344018","Save Locate: "+_lat+"--"+_lon,anywheresoftware.b4a.keywords.Common.Colors.Blue);
RDebugUtils.currentLine=57344019;
 //BA.debugLineNum = 57344019;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=57344022;
 //BA.debugLineNum = 57344022;BA.debugLine="Wait For UpdateKala";
anywheresoftware.b4a.keywords.Common.WaitFor("updatekala", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_profile", "t1_tick"), null);
this.state = 25;
return;
case 25:
//C
this.state = 7;
;
RDebugUtils.currentLine=57344024;
 //BA.debugLineNum = 57344024;BA.debugLine="Select Case GotoPage";
if (true) break;

case 7:
//select
this.state = 12;
switch (BA.switchObjectToInt(parent._gotopage,anywheresoftware.b4a.keywords.Common.False,anywheresoftware.b4a.keywords.Common.True)) {
case 0: {
this.state = 9;
if (true) break;
}
case 1: {
this.state = 11;
if (true) break;
}
}
if (true) break;

case 9:
//C
this.state = 12;
RDebugUtils.currentLine=57344026;
 //BA.debugLineNum = 57344026;BA.debugLine="Pnl_menu.SetVisibleAnimated(600,False)";
parent.mostCurrent._pnl_menu.SetVisibleAnimated((int) (600),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=57344027;
 //BA.debugLineNum = 57344027;BA.debugLine="KalaDefault";
_kaladefault();
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=57344029;
 //BA.debugLineNum = 57344029;BA.debugLine="Pnl_menu.SetVisibleAnimated(600,False)";
parent.mostCurrent._pnl_menu.SetVisibleAnimated((int) (600),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=57344030;
 //BA.debugLineNum = 57344030;BA.debugLine="StartActivity(Act_Kala_listi)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._act_kala_listi.getObject()));
 if (true) break;

case 12:
//C
this.state = 15;
;
 if (true) break;

case 14:
//C
this.state = 15;
this.catchState = 0;
RDebugUtils.currentLine=57344033;
 //BA.debugLineNum = 57344033;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("557344033",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 15:
//C
this.state = 24;
this.catchState = 0;
;
 if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=57344036;
 //BA.debugLineNum = 57344036;BA.debugLine="Select Case GotoPage";
if (true) break;

case 18:
//select
this.state = 23;
switch (BA.switchObjectToInt(parent._gotopage,anywheresoftware.b4a.keywords.Common.False,anywheresoftware.b4a.keywords.Common.True)) {
case 0: {
this.state = 20;
if (true) break;
}
case 1: {
this.state = 22;
if (true) break;
}
}
if (true) break;

case 20:
//C
this.state = 23;
RDebugUtils.currentLine=57344038;
 //BA.debugLineNum = 57344038;BA.debugLine="Pnl_menu.SetVisibleAnimated(600,False)";
parent.mostCurrent._pnl_menu.SetVisibleAnimated((int) (600),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=57344039;
 //BA.debugLineNum = 57344039;BA.debugLine="KalaDefault";
_kaladefault();
 if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=57344041;
 //BA.debugLineNum = 57344041;BA.debugLine="Pnl_menu.SetVisibleAnimated(600,False)";
parent.mostCurrent._pnl_menu.SetVisibleAnimated((int) (600),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=57344042;
 //BA.debugLineNum = 57344042;BA.debugLine="StartActivity(Act_Kala_listi)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._act_kala_listi.getObject()));
 if (true) break;

case 23:
//C
this.state = 24;
;
 if (true) break;

case 24:
//C
this.state = -1;
;
RDebugUtils.currentLine=57344045;
 //BA.debugLineNum = 57344045;BA.debugLine="End Sub";
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
public static String  _txtdesc_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="act_profile";
if (Debug.shouldDelegate(mostCurrent.activityBA, "txtdesc_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "txtdesc_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=58327040;
 //BA.debugLineNum = 58327040;BA.debugLine="Sub TxtDesc_TextChanged (Old As String, New As Str";
RDebugUtils.currentLine=58327041;
 //BA.debugLineNum = 58327041;BA.debugLine="If New.Length>245 Then";
if (_new.length()>245) { 
RDebugUtils.currentLine=58327042;
 //BA.debugLineNum = 58327042;BA.debugLine="ToastMessageShow(\"تعداد حروف می بایست 250 حرف با";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("تعداد حروف می بایست 250 حرف باشد"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=58327043;
 //BA.debugLineNum = 58327043;BA.debugLine="TxtDesc.Text = Old";
mostCurrent._txtdesc.setText(BA.ObjectToCharSequence(_old));
 };
RDebugUtils.currentLine=58327045;
 //BA.debugLineNum = 58327045;BA.debugLine="End Sub";
return "";
}
}