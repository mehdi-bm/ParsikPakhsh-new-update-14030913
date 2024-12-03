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

public class act_savelocation extends Activity implements B4AActivity{
	public static act_savelocation mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.act_savelocation");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (act_savelocation).");
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
		activityBA = new BA(this, layout, processBA, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.act_savelocation");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "ir.parsikhesab.pakhsh.act_savelocation", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (act_savelocation) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (act_savelocation) Resume **");
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
		return act_savelocation.class;
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
            BA.LogInfo("** Activity (act_savelocation) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (act_savelocation) Pause event (activity is not paused). **");
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
            act_savelocation mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (act_savelocation) Resume **");
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
public static anywheresoftware.b4a.objects.RuntimePermissions _rp = null;
public static anywheresoftware.b4a.objects.Timer _t1 = null;
public anywheresoftware.b4a.gps.LocationWrapper _location1 = null;
public anywheresoftware.b4a.objects.MapFragmentWrapper.GoogleMapWrapper _gmap = null;
public anywheresoftware.b4a.objects.MapFragmentWrapper _mapfragment1 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public static String _lat = "";
public static String _lon = "";
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
public ir.parsikhesab.pakhsh.act_rizhavale _act_rizhavale = null;
public ir.parsikhesab.pakhsh.act_sabad _act_sabad = null;
public ir.parsikhesab.pakhsh.act_sabtmarjooii _act_sabtmarjooii = null;
public ir.parsikhesab.pakhsh.act_sabtrizcheck _act_sabtrizcheck = null;
public ir.parsikhesab.pakhsh.act_saveinfocompany _act_saveinfocompany = null;
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
RDebugUtils.currentModule="act_savelocation";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
int _result = 0;
RDebugUtils.currentLine=78053376;
 //BA.debugLineNum = 78053376;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=78053377;
 //BA.debugLineNum = 78053377;BA.debugLine="Location1.Initialize";
mostCurrent._location1.Initialize();
RDebugUtils.currentLine=78053378;
 //BA.debugLineNum = 78053378;BA.debugLine="Activity.LoadLayout(\"L_SaveLocation\")";
mostCurrent._activity.LoadLayout("L_SaveLocation",mostCurrent.activityBA);
RDebugUtils.currentLine=78053379;
 //BA.debugLineNum = 78053379;BA.debugLine="If MapFragment1.IsGooglePlayServicesAvailable = F";
if (mostCurrent._mapfragment1.IsGooglePlayServicesAvailable(mostCurrent.activityBA)==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=78053380;
 //BA.debugLineNum = 78053380;BA.debugLine="ToastMessageShow(\"Please install Google Play Ser";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Please install Google Play Services."),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=78053381;
 //BA.debugLineNum = 78053381;BA.debugLine="Dim result As Int";
_result = 0;
RDebugUtils.currentLine=78053382;
 //BA.debugLineNum = 78053382;BA.debugLine="result = Msgbox2(\"لطفا سرویس های گوگل را نصب و ف";
_result = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("لطفا سرویس های گوگل را نصب و فعال نمایید"),BA.ObjectToCharSequence("Google Play Services"),"","","انصراف",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"Google-Play-icon.png").getObject()),mostCurrent.activityBA);
RDebugUtils.currentLine=78053384;
 //BA.debugLineNum = 78053384;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 }else {
RDebugUtils.currentLine=78053386;
 //BA.debugLineNum = 78053386;BA.debugLine="t1.Initialize(\"t1\",1000)";
_t1.Initialize(processBA,"t1",(long) (1000));
RDebugUtils.currentLine=78053387;
 //BA.debugLineNum = 78053387;BA.debugLine="t1.Enabled = True";
_t1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=78053388;
 //BA.debugLineNum = 78053388;BA.debugLine="ProgressDialogShow2(\"چند لحظه صبر کنید درحال دری";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(mostCurrent.activityBA,BA.ObjectToCharSequence("چند لحظه صبر کنید درحال دریافت موقعیت"),anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=78053392;
 //BA.debugLineNum = 78053392;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="act_savelocation";
RDebugUtils.currentLine=78184448;
 //BA.debugLineNum = 78184448;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=78184450;
 //BA.debugLineNum = 78184450;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="act_savelocation";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=78118912;
 //BA.debugLineNum = 78118912;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=78118914;
 //BA.debugLineNum = 78118914;BA.debugLine="End Sub";
return "";
}
public static boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
RDebugUtils.currentModule="act_savelocation";
if (Debug.shouldDelegate(mostCurrent.activityBA, "application_error", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "application_error", new Object[] {_error,_stacktrace}));}
RDebugUtils.currentLine=78577664;
 //BA.debugLineNum = 78577664;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
RDebugUtils.currentLine=78577666;
 //BA.debugLineNum = 78577666;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=78577667;
 //BA.debugLineNum = 78577667;BA.debugLine="End Sub";
return false;
}
public static String  _btn_back_click() throws Exception{
RDebugUtils.currentModule="act_savelocation";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_back_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_back_click", null));}
RDebugUtils.currentLine=78512128;
 //BA.debugLineNum = 78512128;BA.debugLine="Sub btn_Back_Click";
RDebugUtils.currentLine=78512129;
 //BA.debugLineNum = 78512129;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=78512130;
 //BA.debugLineNum = 78512130;BA.debugLine="End Sub";
return "";
}
public static String  _btnsave_click() throws Exception{
RDebugUtils.currentModule="act_savelocation";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnsave_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnsave_click", null));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
RDebugUtils.currentLine=78446592;
 //BA.debugLineNum = 78446592;BA.debugLine="Sub BtnSave_Click";
RDebugUtils.currentLine=78446593;
 //BA.debugLineNum = 78446593;BA.debugLine="Try";
try {RDebugUtils.currentLine=78446594;
 //BA.debugLineNum = 78446594;BA.debugLine="If MCode.IsConnected=False And MCode.ConnectionS";
if (mostCurrent._mcode._isconnected /*boolean*/ (mostCurrent.activityBA)==anywheresoftware.b4a.keywords.Common.False && (mostCurrent._mcode._connectionstatus /*String*/ ).equals(BA.NumberToString(1))) { 
RDebugUtils.currentLine=78446595;
 //BA.debugLineNum = 78446595;BA.debugLine="ToastMessageShow(\"لطفا ارتباط اینترنت گوشی خود";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("لطفا ارتباط اینترنت گوشی خود را بررسی نمایید"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=78446596;
 //BA.debugLineNum = 78446596;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=78446598;
 //BA.debugLineNum = 78446598;BA.debugLine="If Lat<>0 And Lon <>0 Then";
if ((mostCurrent._lat).equals(BA.NumberToString(0)) == false && (mostCurrent._lon).equals(BA.NumberToString(0)) == false) { 
RDebugUtils.currentLine=78446599;
 //BA.debugLineNum = 78446599;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * from";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * from TblLogVisitSefaresh Where FldC_Ashkhas = '"+mostCurrent._mcode._c_tafzili /*String*/ +"'");
RDebugUtils.currentLine=78446600;
 //BA.debugLineNum = 78446600;BA.debugLine="If Cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=78446601;
 //BA.debugLineNum = 78446601;BA.debugLine="MCode.SaveUpdate(\"Update TblLogVisitSefaresh S";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Update TblLogVisitSefaresh Set FldLat = '"+mostCurrent._lat+"' , FldLon = '"+mostCurrent._lon+"' Where FldC_Ashkhas = '"+mostCurrent._mcode._c_tafzili /*String*/ +"'");
 }else {
RDebugUtils.currentLine=78446603;
 //BA.debugLineNum = 78446603;BA.debugLine="MCode.SaveUpdate(\"Insert Into TblLogVisitSefar";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Insert Into TblLogVisitSefaresh (FldC_Ashkhas,FldVisit,FldSefaresh,FldElatSefaresh,FldLat,FldLon) Values ('"+mostCurrent._mcode._c_tafzili /*String*/ +"','','','','"+mostCurrent._lat+"','"+mostCurrent._lon+"')");
 };
RDebugUtils.currentLine=78446605;
 //BA.debugLineNum = 78446605;BA.debugLine="MCode.SaveUpdate(\"Update TblAshkhas Set FldLat";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Update TblAshkhas Set FldLat = '"+mostCurrent._lat+"', FldLon = '"+mostCurrent._lon+"' Where fldCodetafzili = '"+mostCurrent._mcode._c_tafzili /*String*/ +"'");
RDebugUtils.currentLine=78446606;
 //BA.debugLineNum = 78446606;BA.debugLine="CallSubDelayed3(Service_Server,\"SaveLocationMos";
anywheresoftware.b4a.keywords.Common.CallSubDelayed3(processBA,(Object)(mostCurrent._service_server.getObject()),"SaveLocationMoshtari",(Object)(mostCurrent._lat),(Object)(mostCurrent._lon));
RDebugUtils.currentLine=78446608;
 //BA.debugLineNum = 78446608;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=78446609;
 //BA.debugLineNum = 78446609;BA.debugLine="ToastMessageShow(\"موقعیت با موفقیت ثبت گردید\",T";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("موقعیت با موفقیت ثبت گردید"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=78446610;
 //BA.debugLineNum = 78446610;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 }else {
RDebugUtils.currentLine=78446612;
 //BA.debugLineNum = 78446612;BA.debugLine="ToastMessageShow(\"لطفا نقطه مورد نظر را انتخاب";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("لطفا نقطه مورد نظر را انتخاب کنید"),anywheresoftware.b4a.keywords.Common.False);
 };
 } 
       catch (Exception e22) {
			processBA.setLastException(e22);RDebugUtils.currentLine=78446615;
 //BA.debugLineNum = 78446615;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("578446615",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 };
RDebugUtils.currentLine=78446617;
 //BA.debugLineNum = 78446617;BA.debugLine="End Sub";
return "";
}
public static String  _mapfragment1_longclick(anywheresoftware.b4a.objects.MapFragmentWrapper.LatLngWrapper _point) throws Exception{
RDebugUtils.currentModule="act_savelocation";
if (Debug.shouldDelegate(mostCurrent.activityBA, "mapfragment1_longclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "mapfragment1_longclick", new Object[] {_point}));}
RDebugUtils.currentLine=78381056;
 //BA.debugLineNum = 78381056;BA.debugLine="Sub MapFragment1_LongClick (Point As LatLng)";
RDebugUtils.currentLine=78381057;
 //BA.debugLineNum = 78381057;BA.debugLine="gmap.Clear()";
mostCurrent._gmap.Clear();
RDebugUtils.currentLine=78381058;
 //BA.debugLineNum = 78381058;BA.debugLine="gmap.AddMarker(Point.Latitude, Point.Longitude, M";
mostCurrent._gmap.AddMarker(_point.getLatitude(),_point.getLongitude(),mostCurrent._mcode._n_tafzili /*String*/ );
RDebugUtils.currentLine=78381059;
 //BA.debugLineNum = 78381059;BA.debugLine="Lat=Point.Latitude";
mostCurrent._lat = BA.NumberToString(_point.getLatitude());
RDebugUtils.currentLine=78381060;
 //BA.debugLineNum = 78381060;BA.debugLine="Lon=Point.Longitude";
mostCurrent._lon = BA.NumberToString(_point.getLongitude());
RDebugUtils.currentLine=78381061;
 //BA.debugLineNum = 78381061;BA.debugLine="Log(\"Lat= \"&Lat &\" Lon= \"&Lon)";
anywheresoftware.b4a.keywords.Common.LogImpl("578381061","Lat= "+mostCurrent._lat+" Lon= "+mostCurrent._lon,0);
RDebugUtils.currentLine=78381063;
 //BA.debugLineNum = 78381063;BA.debugLine="End Sub";
return "";
}
public static void  _mapfragment1_ready() throws Exception{
RDebugUtils.currentModule="act_savelocation";
if (Debug.shouldDelegate(mostCurrent.activityBA, "mapfragment1_ready", false))
	 {Debug.delegate(mostCurrent.activityBA, "mapfragment1_ready", null); return;}
ResumableSub_MapFragment1_Ready rsub = new ResumableSub_MapFragment1_Ready(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_MapFragment1_Ready extends BA.ResumableSub {
public ResumableSub_MapFragment1_Ready(ir.parsikhesab.pakhsh.act_savelocation parent) {
this.parent = parent;
}
ir.parsikhesab.pakhsh.act_savelocation parent;
String _permission = "";
boolean _result = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_savelocation";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=78249985;
 //BA.debugLineNum = 78249985;BA.debugLine="Sleep(100)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_savelocation", "mapfragment1_ready"),(int) (100));
this.state = 7;
return;
case 7:
//C
this.state = 1;
;
RDebugUtils.currentLine=78249986;
 //BA.debugLineNum = 78249986;BA.debugLine="gmap = MapFragment1.GetMap";
parent.mostCurrent._gmap = parent.mostCurrent._mapfragment1.GetMap();
RDebugUtils.currentLine=78249987;
 //BA.debugLineNum = 78249987;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_ACCESS_FINE_LOCA";
parent._rp.CheckAndRequest(processBA,parent._rp.PERMISSION_ACCESS_FINE_LOCATION);
RDebugUtils.currentLine=78249988;
 //BA.debugLineNum = 78249988;BA.debugLine="Wait For Activity_PermissionResult (Permission As";
anywheresoftware.b4a.keywords.Common.WaitFor("activity_permissionresult", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_savelocation", "mapfragment1_ready"), null);
this.state = 8;
return;
case 8:
//C
this.state = 1;
_permission = (String) result[0];
_result = (Boolean) result[1];
;
RDebugUtils.currentLine=78249989;
 //BA.debugLineNum = 78249989;BA.debugLine="If Result Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_result) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=78249990;
 //BA.debugLineNum = 78249990;BA.debugLine="gmap.MyLocationEnabled = True";
parent.mostCurrent._gmap.setMyLocationEnabled(anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=78249993;
 //BA.debugLineNum = 78249993;BA.debugLine="Log(\"No permission!\")";
anywheresoftware.b4a.keywords.Common.LogImpl("578249993","No permission!",0);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=78249995;
 //BA.debugLineNum = 78249995;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _t1_tick() throws Exception{
RDebugUtils.currentModule="act_savelocation";
if (Debug.shouldDelegate(mostCurrent.activityBA, "t1_tick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "t1_tick", null));}
anywheresoftware.b4a.objects.MapFragmentWrapper.CameraPositionWrapper _cl = null;
RDebugUtils.currentLine=78315520;
 //BA.debugLineNum = 78315520;BA.debugLine="Sub t1_tick";
RDebugUtils.currentLine=78315522;
 //BA.debugLineNum = 78315522;BA.debugLine="If gmap.IsInitialized Then";
if (mostCurrent._gmap.IsInitialized()) { 
RDebugUtils.currentLine=78315523;
 //BA.debugLineNum = 78315523;BA.debugLine="Try";
try {RDebugUtils.currentLine=78315524;
 //BA.debugLineNum = 78315524;BA.debugLine="Location1.Latitude  = gmap.MyLocation.Latitude";
mostCurrent._location1.setLatitude(mostCurrent._gmap.getMyLocation().getLatitude());
RDebugUtils.currentLine=78315525;
 //BA.debugLineNum = 78315525;BA.debugLine="Location1.Longitude = gmap.MyLocation.Longitude";
mostCurrent._location1.setLongitude(mostCurrent._gmap.getMyLocation().getLongitude());
RDebugUtils.currentLine=78315527;
 //BA.debugLineNum = 78315527;BA.debugLine="Dim cl As CameraPosition";
_cl = new anywheresoftware.b4a.objects.MapFragmentWrapper.CameraPositionWrapper();
RDebugUtils.currentLine=78315528;
 //BA.debugLineNum = 78315528;BA.debugLine="cl.Initialize(gmap.MyLocation.Latitude,gmap.MyL";
_cl.Initialize(mostCurrent._gmap.getMyLocation().getLatitude(),mostCurrent._gmap.getMyLocation().getLongitude(),(float) (15));
RDebugUtils.currentLine=78315529;
 //BA.debugLineNum = 78315529;BA.debugLine="gmap.AnimateCamera(cl)";
mostCurrent._gmap.AnimateCamera((com.google.android.gms.maps.model.CameraPosition)(_cl.getObject()));
RDebugUtils.currentLine=78315530;
 //BA.debugLineNum = 78315530;BA.debugLine="t1.Enabled=False";
_t1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=78315531;
 //BA.debugLineNum = 78315531;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 } 
       catch (Exception e11) {
			processBA.setLastException(e11);RDebugUtils.currentLine=78315533;
 //BA.debugLineNum = 78315533;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("578315533",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 };
 }else {
RDebugUtils.currentLine=78315536;
 //BA.debugLineNum = 78315536;BA.debugLine="t1.Enabled=True";
_t1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=78315538;
 //BA.debugLineNum = 78315538;BA.debugLine="End Sub";
return "";
}
}