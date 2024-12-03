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

public class act_setting extends Activity implements B4AActivity{
	public static act_setting mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.act_setting");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (act_setting).");
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
		activityBA = new BA(this, layout, processBA, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.act_setting");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "ir.parsikhesab.pakhsh.act_setting", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (act_setting) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (act_setting) Resume **");
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
		return act_setting.class;
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
            BA.LogInfo("** Activity (act_setting) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (act_setting) Pause event (activity is not paused). **");
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
            act_setting mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (act_setting) Resume **");
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
public anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper _rb_printerbluetooth = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper _rb_printerpos = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblsettingposparsian = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbldownloadposparsian = null;
public ir.parsikhesab.pakhsh.cl_appupdate _apkupdt = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel5 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnsaveinfocompany = null;
public de.amberhome.objects.appcompat.ACSwitchCompatWrapper _swarzeshafzodeenable = null;
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
public ir.parsikhesab.pakhsh.act_savelocation _act_savelocation = null;
public ir.parsikhesab.pakhsh.act_search _act_search = null;
public ir.parsikhesab.pakhsh.act_selfaktor _act_selfaktor = null;
public ir.parsikhesab.pakhsh.act_senddata _act_senddata = null;
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
RDebugUtils.currentModule="act_setting";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=82313216;
 //BA.debugLineNum = 82313216;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=82313218;
 //BA.debugLineNum = 82313218;BA.debugLine="Activity.LoadLayout(\"l_setting\")";
mostCurrent._activity.LoadLayout("l_setting",mostCurrent.activityBA);
RDebugUtils.currentLine=82313219;
 //BA.debugLineNum = 82313219;BA.debugLine="apkupdt.Initialize(Me,\"update\")";
mostCurrent._apkupdt._initialize /*String*/ (null,mostCurrent.activityBA,act_setting.getObject(),"update");
RDebugUtils.currentLine=82313220;
 //BA.debugLineNum = 82313220;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="act_setting";
RDebugUtils.currentLine=82575360;
 //BA.debugLineNum = 82575360;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=82575362;
 //BA.debugLineNum = 82575362;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="act_setting";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=82509824;
 //BA.debugLineNum = 82509824;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=82509825;
 //BA.debugLineNum = 82509825;BA.debugLine="MCode.page=\"act_setting\"";
mostCurrent._mcode._page /*String*/  = "act_setting";
RDebugUtils.currentLine=82509826;
 //BA.debugLineNum = 82509826;BA.debugLine="CheckPrinter";
_checkprinter();
RDebugUtils.currentLine=82509827;
 //BA.debugLineNum = 82509827;BA.debugLine="CheckArzeshAfzode";
_checkarzeshafzode();
RDebugUtils.currentLine=82509828;
 //BA.debugLineNum = 82509828;BA.debugLine="End Sub";
return "";
}
public static String  _checkprinter() throws Exception{
RDebugUtils.currentModule="act_setting";
if (Debug.shouldDelegate(mostCurrent.activityBA, "checkprinter", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "checkprinter", null));}
RDebugUtils.currentLine=82640896;
 //BA.debugLineNum = 82640896;BA.debugLine="Sub CheckPrinter";
RDebugUtils.currentLine=82640897;
 //BA.debugLineNum = 82640897;BA.debugLine="Select MCode.PrinterType";
switch (BA.switchObjectToInt(mostCurrent._mcode._printertype /*int*/ ,(int) (0),(int) (1))) {
case 0: {
RDebugUtils.currentLine=82640899;
 //BA.debugLineNum = 82640899;BA.debugLine="RB_PrinterBluetooth.Checked=True";
mostCurrent._rb_printerbluetooth.setChecked(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=82640900;
 //BA.debugLineNum = 82640900;BA.debugLine="lblSettingPosParsian.Visible=False";
mostCurrent._lblsettingposparsian.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=82640901;
 //BA.debugLineNum = 82640901;BA.debugLine="lblDownloadPosParsian.Visible=False";
mostCurrent._lbldownloadposparsian.setVisible(anywheresoftware.b4a.keywords.Common.False);
 break; }
case 1: {
RDebugUtils.currentLine=82640903;
 //BA.debugLineNum = 82640903;BA.debugLine="RB_PrinterPos.Checked=True";
mostCurrent._rb_printerpos.setChecked(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=82640904;
 //BA.debugLineNum = 82640904;BA.debugLine="lblSettingPosParsian.Visible=True";
mostCurrent._lblsettingposparsian.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=82640905;
 //BA.debugLineNum = 82640905;BA.debugLine="lblDownloadPosParsian.Visible=True";
mostCurrent._lbldownloadposparsian.setVisible(anywheresoftware.b4a.keywords.Common.True);
 break; }
}
;
RDebugUtils.currentLine=82640907;
 //BA.debugLineNum = 82640907;BA.debugLine="End Sub";
return "";
}
public static String  _checkarzeshafzode() throws Exception{
RDebugUtils.currentModule="act_setting";
if (Debug.shouldDelegate(mostCurrent.activityBA, "checkarzeshafzode", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "checkarzeshafzode", null));}
RDebugUtils.currentLine=82706432;
 //BA.debugLineNum = 82706432;BA.debugLine="Sub CheckArzeshAfzode";
RDebugUtils.currentLine=82706433;
 //BA.debugLineNum = 82706433;BA.debugLine="Select MCode.ArzeshAfzodeEnable";
switch (BA.switchObjectToInt(mostCurrent._mcode._arzeshafzodeenable /*String*/ ,BA.NumberToString(0),BA.NumberToString(1))) {
case 0: {
RDebugUtils.currentLine=82706435;
 //BA.debugLineNum = 82706435;BA.debugLine="SwArzeshAfzodeEnable.Checked=False";
mostCurrent._swarzeshafzodeenable.setChecked(anywheresoftware.b4a.keywords.Common.False);
 break; }
case 1: {
RDebugUtils.currentLine=82706437;
 //BA.debugLineNum = 82706437;BA.debugLine="SwArzeshAfzodeEnable.Checked=True";
mostCurrent._swarzeshafzodeenable.setChecked(anywheresoftware.b4a.keywords.Common.True);
 break; }
}
;
RDebugUtils.currentLine=82706439;
 //BA.debugLineNum = 82706439;BA.debugLine="End Sub";
return "";
}
public static String  _btn_back_click() throws Exception{
RDebugUtils.currentModule="act_setting";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_back_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_back_click", null));}
RDebugUtils.currentLine=82771968;
 //BA.debugLineNum = 82771968;BA.debugLine="Sub btn_Back_Click";
RDebugUtils.currentLine=82771969;
 //BA.debugLineNum = 82771969;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=82771970;
 //BA.debugLineNum = 82771970;BA.debugLine="End Sub";
return "";
}
public static String  _btnsaveinfocompany_click() throws Exception{
RDebugUtils.currentModule="act_setting";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnsaveinfocompany_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnsaveinfocompany_click", null));}
RDebugUtils.currentLine=83099648;
 //BA.debugLineNum = 83099648;BA.debugLine="Private Sub btnSaveInfoCompany_Click";
RDebugUtils.currentLine=83099649;
 //BA.debugLineNum = 83099649;BA.debugLine="StartActivity(Act_SaveInfoCompany)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._act_saveinfocompany.getObject()));
RDebugUtils.currentLine=83099650;
 //BA.debugLineNum = 83099650;BA.debugLine="End Sub";
return "";
}
public static String  _downloadapppos() throws Exception{
RDebugUtils.currentModule="act_setting";
if (Debug.shouldDelegate(mostCurrent.activityBA, "downloadapppos", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "downloadapppos", null));}
String _link = "";
RDebugUtils.currentLine=82378752;
 //BA.debugLineNum = 82378752;BA.debugLine="Sub DownloadAppPos As String";
RDebugUtils.currentLine=82378753;
 //BA.debugLineNum = 82378753;BA.debugLine="Dim link As String= MCode.linkposparsian";
_link = mostCurrent._mcode._linkposparsian /*String*/ ;
RDebugUtils.currentLine=82378754;
 //BA.debugLineNum = 82378754;BA.debugLine="apkupdt.PackageName = \"com.pec.cpsdk\"";
mostCurrent._apkupdt._setpackagename /*String*/ (null,"com.pec.cpsdk");
RDebugUtils.currentLine=82378755;
 //BA.debugLineNum = 82378755;BA.debugLine="apkupdt.NewVerApk = link";
mostCurrent._apkupdt._setnewverapk(null,_link);
RDebugUtils.currentLine=82378757;
 //BA.debugLineNum = 82378757;BA.debugLine="apkupdt.DownloadApk";
mostCurrent._apkupdt._downloadapk /*void*/ (null);
RDebugUtils.currentLine=82378758;
 //BA.debugLineNum = 82378758;BA.debugLine="ProgressDialogShow(\"لطفا منتظر بمانید\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("لطفا منتظر بمانید"));
RDebugUtils.currentLine=82378759;
 //BA.debugLineNum = 82378759;BA.debugLine="End Sub";
return "";
}
public static String  _lbldownloadposparsian_click() throws Exception{
RDebugUtils.currentModule="act_setting";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lbldownloadposparsian_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lbldownloadposparsian_click", null));}
RDebugUtils.currentLine=82903040;
 //BA.debugLineNum = 82903040;BA.debugLine="Private Sub lblDownloadPosParsian_Click";
RDebugUtils.currentLine=82903041;
 //BA.debugLineNum = 82903041;BA.debugLine="CallSubDelayed2(Service_Server,\"GetVersion\",\"Pos-";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(mostCurrent._service_server.getObject()),"GetVersion",(Object)("Pos-Parsian"));
RDebugUtils.currentLine=82903044;
 //BA.debugLineNum = 82903044;BA.debugLine="End Sub";
return "";
}
public static String  _lblsettingposparsian_click() throws Exception{
RDebugUtils.currentModule="act_setting";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lblsettingposparsian_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lblsettingposparsian_click", null));}
RDebugUtils.currentLine=82837504;
 //BA.debugLineNum = 82837504;BA.debugLine="Private Sub lblSettingPosParsian_Click";
RDebugUtils.currentLine=82837506;
 //BA.debugLineNum = 82837506;BA.debugLine="End Sub";
return "";
}
public static String  _rb_printerbluetooth_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="act_setting";
if (Debug.shouldDelegate(mostCurrent.activityBA, "rb_printerbluetooth_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "rb_printerbluetooth_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=82968576;
 //BA.debugLineNum = 82968576;BA.debugLine="Private Sub RB_PrinterBluetooth_CheckedChange(Chec";
RDebugUtils.currentLine=82968577;
 //BA.debugLineNum = 82968577;BA.debugLine="Try";
try {RDebugUtils.currentLine=82968578;
 //BA.debugLineNum = 82968578;BA.debugLine="MCode.PrinterType=0";
mostCurrent._mcode._printertype /*int*/  = (int) (0);
RDebugUtils.currentLine=82968579;
 //BA.debugLineNum = 82968579;BA.debugLine="MCode.SaveUpdate(\"update TblSetting Set FldPrint";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"update TblSetting Set FldPrinterType="+BA.NumberToString(mostCurrent._mcode._printertype /*int*/ ));
RDebugUtils.currentLine=82968580;
 //BA.debugLineNum = 82968580;BA.debugLine="CheckPrinter";
_checkprinter();
 } 
       catch (Exception e6) {
			processBA.setLastException(e6);RDebugUtils.currentLine=82968582;
 //BA.debugLineNum = 82968582;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("582968582",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=82968583;
 //BA.debugLineNum = 82968583;BA.debugLine="myCode.SendError(LastException,MCode.page&\"-RB_P";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),mostCurrent._mcode._page /*String*/ +"-RB_PrinterBluetooth_CheckedChange");
 };
RDebugUtils.currentLine=82968585;
 //BA.debugLineNum = 82968585;BA.debugLine="End Sub";
return "";
}
public static String  _rb_printerpos_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="act_setting";
if (Debug.shouldDelegate(mostCurrent.activityBA, "rb_printerpos_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "rb_printerpos_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=83034112;
 //BA.debugLineNum = 83034112;BA.debugLine="Private Sub RB_PrinterPos_CheckedChange(Checked As";
RDebugUtils.currentLine=83034113;
 //BA.debugLineNum = 83034113;BA.debugLine="Try";
try {RDebugUtils.currentLine=83034114;
 //BA.debugLineNum = 83034114;BA.debugLine="MCode.PrinterType=1";
mostCurrent._mcode._printertype /*int*/  = (int) (1);
RDebugUtils.currentLine=83034115;
 //BA.debugLineNum = 83034115;BA.debugLine="MCode.SaveUpdate(\"update TblSetting Set FldPrint";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"update TblSetting Set FldPrinterType="+BA.NumberToString(mostCurrent._mcode._printertype /*int*/ ));
RDebugUtils.currentLine=83034116;
 //BA.debugLineNum = 83034116;BA.debugLine="CheckPrinter";
_checkprinter();
 } 
       catch (Exception e6) {
			processBA.setLastException(e6);RDebugUtils.currentLine=83034118;
 //BA.debugLineNum = 83034118;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("583034118",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=83034119;
 //BA.debugLineNum = 83034119;BA.debugLine="myCode.SendError(LastException,MCode.page&\"-RB_P";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),mostCurrent._mcode._page /*String*/ +"-RB_PrinterPos_CheckedChange");
 };
RDebugUtils.currentLine=83034123;
 //BA.debugLineNum = 83034123;BA.debugLine="End Sub";
return "";
}
public static String  _swarzeshafzodeenable_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="act_setting";
if (Debug.shouldDelegate(mostCurrent.activityBA, "swarzeshafzodeenable_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "swarzeshafzodeenable_checkedchange", new Object[] {_checked}));}
String _enable = "";
RDebugUtils.currentLine=83165184;
 //BA.debugLineNum = 83165184;BA.debugLine="Private Sub SwArzeshAfzodeEnable_CheckedChange(Che";
RDebugUtils.currentLine=83165185;
 //BA.debugLineNum = 83165185;BA.debugLine="Try";
try {RDebugUtils.currentLine=83165186;
 //BA.debugLineNum = 83165186;BA.debugLine="Dim enable As String=0";
_enable = BA.NumberToString(0);
RDebugUtils.currentLine=83165187;
 //BA.debugLineNum = 83165187;BA.debugLine="If Checked Then";
if (_checked) { 
RDebugUtils.currentLine=83165188;
 //BA.debugLineNum = 83165188;BA.debugLine="enable=1";
_enable = BA.NumberToString(1);
 };
RDebugUtils.currentLine=83165190;
 //BA.debugLineNum = 83165190;BA.debugLine="MCode.ArzeshAfzodeEnable=enable";
mostCurrent._mcode._arzeshafzodeenable /*String*/  = _enable;
RDebugUtils.currentLine=83165191;
 //BA.debugLineNum = 83165191;BA.debugLine="MCode.SaveUpdate(\"update TblSetting Set fldArzes";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"update TblSetting Set fldArzeshAfzodeEnable='"+_enable+"'");
RDebugUtils.currentLine=83165192;
 //BA.debugLineNum = 83165192;BA.debugLine="CheckArzeshAfzode";
_checkarzeshafzode();
 } 
       catch (Exception e10) {
			processBA.setLastException(e10);RDebugUtils.currentLine=83165194;
 //BA.debugLineNum = 83165194;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("583165194",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=83165195;
 //BA.debugLineNum = 83165195;BA.debugLine="myCode.SendError(LastException,MCode.page&\"-SwAr";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),mostCurrent._mcode._page /*String*/ +"-SwArzeshAfzodeEnable_CheckedChange");
 };
RDebugUtils.currentLine=83165197;
 //BA.debugLineNum = 83165197;BA.debugLine="End Sub";
return "";
}
public static String  _update_updatecomplete() throws Exception{
RDebugUtils.currentModule="act_setting";
if (Debug.shouldDelegate(mostCurrent.activityBA, "update_updatecomplete", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "update_updatecomplete", null));}
RDebugUtils.currentLine=82444288;
 //BA.debugLineNum = 82444288;BA.debugLine="Sub update_UpdateComplete";
RDebugUtils.currentLine=82444289;
 //BA.debugLineNum = 82444289;BA.debugLine="LogColor($\"UpdateComplete - time: ${DateTime.Time";
anywheresoftware.b4a.keywords.Common.LogImpl("582444289",("UpdateComplete - time: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.DateTime.Time(anywheresoftware.b4a.keywords.Common.DateTime.getNow())))+""),((int)0xff556b2f));
RDebugUtils.currentLine=82444290;
 //BA.debugLineNum = 82444290;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=82444292;
 //BA.debugLineNum = 82444292;BA.debugLine="Select apkupdt.Status";
switch (BA.switchObjectToInt(mostCurrent._apkupdt._getstatus /*int*/ (null),mostCurrent._apkupdt._ok_curver /*int*/ ,mostCurrent._apkupdt._ok_webver /*int*/ ,mostCurrent._apkupdt._ok_newerapk /*int*/ ,mostCurrent._apkupdt._no_newerapk /*int*/ ,mostCurrent._apkupdt._ok_download /*int*/ ,mostCurrent._apkupdt._ok_install /*int*/ ,mostCurrent._apkupdt._err_noperm /*int*/ )) {
case 0: {
RDebugUtils.currentLine=82444294;
 //BA.debugLineNum = 82444294;BA.debugLine="Log($\"Running apk version: ${apkupdt.CurVN}${CR";
anywheresoftware.b4a.keywords.Common.LogImpl("582444294",("Running apk version: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._apkupdt._getcurvn /*String*/ (null)))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.CRLF))+""),0);
 break; }
case 1: {
RDebugUtils.currentLine=82444297;
 //BA.debugLineNum = 82444297;BA.debugLine="Log($\"Webserver apk version: ${apkupdt.WebVN}${";
anywheresoftware.b4a.keywords.Common.LogImpl("582444297",("Webserver apk version: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._apkupdt._getwebvn /*String*/ (null)))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.CRLF))+""),0);
 break; }
case 2: {
 break; }
case 3: {
 break; }
case 4: {
RDebugUtils.currentLine=82444305;
 //BA.debugLineNum = 82444305;BA.debugLine="Log(\"OK_DOWNLOAD\")";
anywheresoftware.b4a.keywords.Common.LogImpl("582444305","OK_DOWNLOAD",0);
RDebugUtils.currentLine=82444307;
 //BA.debugLineNum = 82444307;BA.debugLine="apkupdt.InstallApk(True)";
mostCurrent._apkupdt._installapk /*String*/ (null,anywheresoftware.b4a.keywords.Common.True);
 break; }
case 5: {
RDebugUtils.currentLine=82444310;
 //BA.debugLineNum = 82444310;BA.debugLine="Log(\"OK_INSTALL\")";
anywheresoftware.b4a.keywords.Common.LogImpl("582444310","OK_INSTALL",0);
 break; }
case 6: {
RDebugUtils.currentLine=82444313;
 //BA.debugLineNum = 82444313;BA.debugLine="Log(\"No permission to install\")";
anywheresoftware.b4a.keywords.Common.LogImpl("582444313","No permission to install",0);
 break; }
default: {
 break; }
}
;
RDebugUtils.currentLine=82444318;
 //BA.debugLineNum = 82444318;BA.debugLine="End Sub";
return "";
}
}