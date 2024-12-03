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

public class act_locationmoshtarian extends Activity implements B4AActivity{
	public static act_locationmoshtarian mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.act_locationmoshtarian");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (act_locationmoshtarian).");
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
		activityBA = new BA(this, layout, processBA, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.act_locationmoshtarian");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "ir.parsikhesab.pakhsh.act_locationmoshtarian", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (act_locationmoshtarian) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (act_locationmoshtarian) Resume **");
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
		return act_locationmoshtarian.class;
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
            BA.LogInfo("** Activity (act_locationmoshtarian) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (act_locationmoshtarian) Pause event (activity is not paused). **");
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
            act_locationmoshtarian mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (act_locationmoshtarian) Resume **");
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
public static anywheresoftware.b4a.objects.collections.List _lstlocation = null;
public anywheresoftware.b4a.objects.MapFragmentWrapper.GoogleMapWrapper _gmap = null;
public anywheresoftware.b4a.objects.MapFragmentWrapper _mapfragment1 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlmap = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnltop = null;
public anywheresoftware.b4a.objects.collections.List _points = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnforward = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnnext = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnvisit = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbladdress = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblcall = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblcodemoshtari = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblgotolocation = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblnamemoshtari = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblradif = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblshomaretell = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblvaziatvisit = null;
public ir.parsikhesab.pakhsh.mcode._adapterlistashkhas _itemselect = null;
public static String _n = "";
public anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
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
RDebugUtils.currentModule="act_locationmoshtarian";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=42139648;
 //BA.debugLineNum = 42139648;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=42139649;
 //BA.debugLineNum = 42139649;BA.debugLine="Activity.LoadLayout(\"l_moshtarianlocation\")";
mostCurrent._activity.LoadLayout("l_moshtarianlocation",mostCurrent.activityBA);
RDebugUtils.currentLine=42139651;
 //BA.debugLineNum = 42139651;BA.debugLine="End Sub";
return "";
}
public static boolean  _activity_keypress(int _keycode) throws Exception{
RDebugUtils.currentModule="act_locationmoshtarian";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_keypress", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "activity_keypress", new Object[] {_keycode}));}
RDebugUtils.currentLine=43057152;
 //BA.debugLineNum = 43057152;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
RDebugUtils.currentLine=43057153;
 //BA.debugLineNum = 43057153;BA.debugLine="If KeyCode=KeyCodes.KEYCODE_BACK Then";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK) { 
RDebugUtils.currentLine=43057154;
 //BA.debugLineNum = 43057154;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 }else {
RDebugUtils.currentLine=43057156;
 //BA.debugLineNum = 43057156;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 };
RDebugUtils.currentLine=43057158;
 //BA.debugLineNum = 43057158;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=43057159;
 //BA.debugLineNum = 43057159;BA.debugLine="End Sub";
return false;
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="act_locationmoshtarian";
RDebugUtils.currentLine=42991616;
 //BA.debugLineNum = 42991616;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=42991618;
 //BA.debugLineNum = 42991618;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="act_locationmoshtarian";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=42926080;
 //BA.debugLineNum = 42926080;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=42926081;
 //BA.debugLineNum = 42926081;BA.debugLine="LoadMap";
_loadmap();
RDebugUtils.currentLine=42926083;
 //BA.debugLineNum = 42926083;BA.debugLine="End Sub";
return "";
}
public static void  _loadmap() throws Exception{
RDebugUtils.currentModule="act_locationmoshtarian";
if (Debug.shouldDelegate(mostCurrent.activityBA, "loadmap", false))
	 {Debug.delegate(mostCurrent.activityBA, "loadmap", null); return;}
ResumableSub_LoadMap rsub = new ResumableSub_LoadMap(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_LoadMap extends BA.ResumableSub {
public ResumableSub_LoadMap(ir.parsikhesab.pakhsh.act_locationmoshtarian parent) {
this.parent = parent;
}
ir.parsikhesab.pakhsh.act_locationmoshtarian parent;
String _permission = "";
boolean _result = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_locationmoshtarian";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=42270721;
 //BA.debugLineNum = 42270721;BA.debugLine="If MCode.IsConnected=False And MCode.ConnectionSt";
if (true) break;

case 1:
//if
this.state = 4;
if (parent.mostCurrent._mcode._isconnected /*boolean*/ (mostCurrent.activityBA)==anywheresoftware.b4a.keywords.Common.False && (parent.mostCurrent._mcode._connectionstatus /*String*/ ).equals(BA.NumberToString(1))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=42270722;
 //BA.debugLineNum = 42270722;BA.debugLine="ToastMessageShow(\"لطفا ارتباط اینترنت گوشی خود ر";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("لطفا ارتباط اینترنت گوشی خود را بررسی نمایید"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=42270723;
 //BA.debugLineNum = 42270723;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=42270725;
 //BA.debugLineNum = 42270725;BA.debugLine="If MapFragment1.IsGooglePlayServicesAvailable = F";

case 4:
//if
this.state = 7;
if (parent.mostCurrent._mapfragment1.IsGooglePlayServicesAvailable(mostCurrent.activityBA)==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=42270726;
 //BA.debugLineNum = 42270726;BA.debugLine="ToastMessageShow(\"Please install Google Play Ser";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Please install Google Play Services."),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=42270727;
 //BA.debugLineNum = 42270727;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 7:
//C
this.state = 8;
;
RDebugUtils.currentLine=42270729;
 //BA.debugLineNum = 42270729;BA.debugLine="Sleep(200)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_locationmoshtarian", "loadmap"),(int) (200));
this.state = 21;
return;
case 21:
//C
this.state = 8;
;
RDebugUtils.currentLine=42270730;
 //BA.debugLineNum = 42270730;BA.debugLine="gmap = MapFragment1.GetMap";
parent.mostCurrent._gmap = parent.mostCurrent._mapfragment1.GetMap();
RDebugUtils.currentLine=42270731;
 //BA.debugLineNum = 42270731;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_ACCESS_FINE_LOCA";
parent._rp.CheckAndRequest(processBA,parent._rp.PERMISSION_ACCESS_FINE_LOCATION);
RDebugUtils.currentLine=42270732;
 //BA.debugLineNum = 42270732;BA.debugLine="Wait For Activity_PermissionResult (Permission As";
anywheresoftware.b4a.keywords.Common.WaitFor("activity_permissionresult", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_locationmoshtarian", "loadmap"), null);
this.state = 22;
return;
case 22:
//C
this.state = 8;
_permission = (String) result[0];
_result = (Boolean) result[1];
;
RDebugUtils.currentLine=42270733;
 //BA.debugLineNum = 42270733;BA.debugLine="If Result Then";
if (true) break;

case 8:
//if
this.state = 20;
if (_result) { 
this.state = 10;
}else {
this.state = 19;
}if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=42270734;
 //BA.debugLineNum = 42270734;BA.debugLine="If LstLocation.Size>0 Then";
if (true) break;

case 11:
//if
this.state = 14;
if (parent._lstlocation.getSize()>0) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=42270735;
 //BA.debugLineNum = 42270735;BA.debugLine="gmap.MyLocationEnabled = True";
parent.mostCurrent._gmap.setMyLocationEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=42270736;
 //BA.debugLineNum = 42270736;BA.debugLine="GetLocation";
_getlocation();
 if (true) break;
;
RDebugUtils.currentLine=42270738;
 //BA.debugLineNum = 42270738;BA.debugLine="If pnlMap.Visible=False Then";

case 14:
//if
this.state = 17;
if (parent.mostCurrent._pnlmap.getVisible()==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=42270739;
 //BA.debugLineNum = 42270739;BA.debugLine="pnlMap.Visible=True";
parent.mostCurrent._pnlmap.setVisible(anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 17:
//C
this.state = 20;
;
 if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=42270742;
 //BA.debugLineNum = 42270742;BA.debugLine="Log(\"No permission!\")";
anywheresoftware.b4a.keywords.Common.LogImpl("542270742","No permission!",0);
 if (true) break;

case 20:
//C
this.state = -1;
;
RDebugUtils.currentLine=42270745;
 //BA.debugLineNum = 42270745;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
RDebugUtils.currentModule="act_locationmoshtarian";
if (Debug.shouldDelegate(mostCurrent.activityBA, "application_error", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "application_error", new Object[] {_error,_stacktrace}));}
RDebugUtils.currentLine=43122688;
 //BA.debugLineNum = 43122688;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
RDebugUtils.currentLine=43122690;
 //BA.debugLineNum = 43122690;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=43122691;
 //BA.debugLineNum = 43122691;BA.debugLine="End Sub";
return false;
}
public static String  _btn_back_click() throws Exception{
RDebugUtils.currentModule="act_locationmoshtarian";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_back_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_back_click", null));}
RDebugUtils.currentLine=42860544;
 //BA.debugLineNum = 42860544;BA.debugLine="Sub btn_Back_Click";
RDebugUtils.currentLine=42860545;
 //BA.debugLineNum = 42860545;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=42860546;
 //BA.debugLineNum = 42860546;BA.debugLine="End Sub";
return "";
}
public static String  _btnforward_click() throws Exception{
RDebugUtils.currentModule="act_locationmoshtarian";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnforward_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnforward_click", null));}
RDebugUtils.currentLine=43515904;
 //BA.debugLineNum = 43515904;BA.debugLine="Private Sub btnForward_Click";
RDebugUtils.currentLine=43515905;
 //BA.debugLineNum = 43515905;BA.debugLine="If n=0 Then";
if ((mostCurrent._n).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=43515907;
 //BA.debugLineNum = 43515907;BA.debugLine="SelectData";
_selectdata();
RDebugUtils.currentLine=43515908;
 //BA.debugLineNum = 43515908;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=43515910;
 //BA.debugLineNum = 43515910;BA.debugLine="n=n-1";
mostCurrent._n = BA.NumberToString((double)(Double.parseDouble(mostCurrent._n))-1);
RDebugUtils.currentLine=43515911;
 //BA.debugLineNum = 43515911;BA.debugLine="SelectData";
_selectdata();
RDebugUtils.currentLine=43515912;
 //BA.debugLineNum = 43515912;BA.debugLine="End Sub";
return "";
}
public static String  _selectdata() throws Exception{
RDebugUtils.currentModule="act_locationmoshtarian";
if (Debug.shouldDelegate(mostCurrent.activityBA, "selectdata", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "selectdata", null));}
anywheresoftware.b4a.objects.MapFragmentWrapper.CameraPositionWrapper _cl = null;
RDebugUtils.currentLine=42467328;
 //BA.debugLineNum = 42467328;BA.debugLine="Sub SelectData";
RDebugUtils.currentLine=42467329;
 //BA.debugLineNum = 42467329;BA.debugLine="If MCode.TourVisitSW Then";
if (mostCurrent._mcode._tourvisitsw /*boolean*/ ) { 
RDebugUtils.currentLine=42467330;
 //BA.debugLineNum = 42467330;BA.debugLine="Cu = MCode.Result($\"SELECT tblTourVisitor.fldRad";
mostCurrent._cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,("SELECT tblTourVisitor.fldRadif,tblTourVisitor.fldCodeSuperVisor,tblTourVisitor.fldCodeVisitor,tblTourVisitor.fldCodeGroup,tblTourVisitor.fldCodeTafzili,TblAshkhas.fldSharheTafzili,tblTourVisitor.fldDate,tblTourVisitor.fldDateVisit,tblTourVisitor.fldTimeVisit,tblTourVisitor.fldDateNextVisit,tblTourVisitor.fldDateTozie,tblTourVisitor.fldShomareSefaresh,tblTourVisitor.fldSharh,tblTourVisitor.fldVaziat,tblTourVisitor.fldShomareFactor,TblAshkhas.FldLat,TblAshkhas.FldLon,TblAshkhas.fldTell,TblAshkhas.fldAdress,TblAshkhas.fldMande,TblAshkhas.fldSaghfeEtebar,TblAshkhas.fldBlackList  FROM TblAshkhas,tblTourVisitor WHERE TblAshkhas.fldCodetafzili = tblTourVisitor.fldCodeTafzili AND fldDateVisit = "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._mcode._datepersian /*String*/ (mostCurrent.activityBA)))+" and fldType='Tour' ORDER BY tblTourVisitor.fldRadif ASC"));
RDebugUtils.currentLine=42467332;
 //BA.debugLineNum = 42467332;BA.debugLine="Cu.Position=n";
mostCurrent._cu.setPosition((int)(Double.parseDouble(mostCurrent._n)));
RDebugUtils.currentLine=42467334;
 //BA.debugLineNum = 42467334;BA.debugLine="lblCodeMoshtari.Text=\"کد مشتری: \"&Cu.GetString(\"";
mostCurrent._lblcodemoshtari.setText(BA.ObjectToCharSequence("کد مشتری: "+mostCurrent._cu.GetString("fldCodeTafzili")));
RDebugUtils.currentLine=42467335;
 //BA.debugLineNum = 42467335;BA.debugLine="lblNameMoshtari.Text=\"نام مشتری: \"&Cu.GetString(";
mostCurrent._lblnamemoshtari.setText(BA.ObjectToCharSequence("نام مشتری: "+mostCurrent._cu.GetString("fldSharheTafzili")));
RDebugUtils.currentLine=42467336;
 //BA.debugLineNum = 42467336;BA.debugLine="lblShomareTell.Text=\"شماره تماس: \"&Cu.GetString(";
mostCurrent._lblshomaretell.setText(BA.ObjectToCharSequence("شماره تماس: "+mostCurrent._cu.GetString("fldTell")));
RDebugUtils.currentLine=42467337;
 //BA.debugLineNum = 42467337;BA.debugLine="lblShomareTell.Tag=Cu.GetString(\"fldTell\")";
mostCurrent._lblshomaretell.setTag((Object)(mostCurrent._cu.GetString("fldTell")));
RDebugUtils.currentLine=42467338;
 //BA.debugLineNum = 42467338;BA.debugLine="lblRadif.Text=\"اولویت: \"& Cu.GetString(\"fldRadif";
mostCurrent._lblradif.setText(BA.ObjectToCharSequence("اولویت: "+mostCurrent._cu.GetString("fldRadif")));
RDebugUtils.currentLine=42467339;
 //BA.debugLineNum = 42467339;BA.debugLine="lblVaziatVisit.Text=\"وضعیت: \"& GetVaziat(Cu.GetS";
mostCurrent._lblvaziatvisit.setText(BA.ObjectToCharSequence("وضعیت: "+_getvaziat(mostCurrent._cu.GetString("fldVaziat"))));
RDebugUtils.currentLine=42467340;
 //BA.debugLineNum = 42467340;BA.debugLine="lblAddress.Text=\"آدرس: \"&Cu.GetString(\"fldAdress";
mostCurrent._lbladdress.setText(BA.ObjectToCharSequence("آدرس: "+mostCurrent._cu.GetString("fldAdress")));
RDebugUtils.currentLine=42467341;
 //BA.debugLineNum = 42467341;BA.debugLine="Dim cl As CameraPosition";
_cl = new anywheresoftware.b4a.objects.MapFragmentWrapper.CameraPositionWrapper();
RDebugUtils.currentLine=42467342;
 //BA.debugLineNum = 42467342;BA.debugLine="cl.Initialize(Cu.GetString(\"FldLat\"),Cu.GetStrin";
_cl.Initialize((double)(Double.parseDouble(mostCurrent._cu.GetString("FldLat"))),(double)(Double.parseDouble(mostCurrent._cu.GetString("FldLon"))),(float) (50));
RDebugUtils.currentLine=42467343;
 //BA.debugLineNum = 42467343;BA.debugLine="gmap.AnimateCamera(cl)";
mostCurrent._gmap.AnimateCamera((com.google.android.gms.maps.model.CameraPosition)(_cl.getObject()));
RDebugUtils.currentLine=42467344;
 //BA.debugLineNum = 42467344;BA.debugLine="Log(Cu.GetString(\"fldSharheTafzili\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("542467344",mostCurrent._cu.GetString("fldSharheTafzili"),0);
 }else {
RDebugUtils.currentLine=42467346;
 //BA.debugLineNum = 42467346;BA.debugLine="itemSelect=LstLocation.Get(n)";
mostCurrent._itemselect = (ir.parsikhesab.pakhsh.mcode._adapterlistashkhas)(_lstlocation.Get((int)(Double.parseDouble(mostCurrent._n))));
RDebugUtils.currentLine=42467347;
 //BA.debugLineNum = 42467347;BA.debugLine="lblCodeMoshtari.Text=\"کد مشتری: \"&itemSelect.Cod";
mostCurrent._lblcodemoshtari.setText(BA.ObjectToCharSequence("کد مشتری: "+mostCurrent._itemselect.CodeTafzili /*String*/ ));
RDebugUtils.currentLine=42467348;
 //BA.debugLineNum = 42467348;BA.debugLine="lblNameMoshtari.Text=\"نام مشتری: \"&itemSelect.Sh";
mostCurrent._lblnamemoshtari.setText(BA.ObjectToCharSequence("نام مشتری: "+mostCurrent._itemselect.SharhTafzili /*String*/ ));
RDebugUtils.currentLine=42467349;
 //BA.debugLineNum = 42467349;BA.debugLine="lblShomareTell.Text=\"شماره تماس: \"&itemSelect.Te";
mostCurrent._lblshomaretell.setText(BA.ObjectToCharSequence("شماره تماس: "+mostCurrent._itemselect.Tell /*String*/ ));
RDebugUtils.currentLine=42467350;
 //BA.debugLineNum = 42467350;BA.debugLine="lblShomareTell.Tag=itemSelect.Tell";
mostCurrent._lblshomaretell.setTag((Object)(mostCurrent._itemselect.Tell /*String*/ ));
RDebugUtils.currentLine=42467351;
 //BA.debugLineNum = 42467351;BA.debugLine="lblRadif.Text=\"اولویت: \"&itemSelect.fldRadif";
mostCurrent._lblradif.setText(BA.ObjectToCharSequence("اولویت: "+BA.NumberToString(mostCurrent._itemselect.fldRadif /*int*/ )));
RDebugUtils.currentLine=42467352;
 //BA.debugLineNum = 42467352;BA.debugLine="lblVaziatVisit.Text=\"وضعیت: \"& GetVaziat(itemSel";
mostCurrent._lblvaziatvisit.setText(BA.ObjectToCharSequence("وضعیت: "+_getvaziat(mostCurrent._itemselect.fldVaziatTour /*String*/ )));
RDebugUtils.currentLine=42467353;
 //BA.debugLineNum = 42467353;BA.debugLine="lblAddress.Text=\"آدرس: \"&itemSelect.Address";
mostCurrent._lbladdress.setText(BA.ObjectToCharSequence("آدرس: "+mostCurrent._itemselect.Address /*String*/ ));
RDebugUtils.currentLine=42467354;
 //BA.debugLineNum = 42467354;BA.debugLine="Dim cl As CameraPosition";
_cl = new anywheresoftware.b4a.objects.MapFragmentWrapper.CameraPositionWrapper();
RDebugUtils.currentLine=42467355;
 //BA.debugLineNum = 42467355;BA.debugLine="cl.Initialize(itemSelect.Lat,itemSelect.Lon,50)";
_cl.Initialize((double)(Double.parseDouble(mostCurrent._itemselect.Lat /*String*/ )),(double)(Double.parseDouble(mostCurrent._itemselect.Lon /*String*/ )),(float) (50));
RDebugUtils.currentLine=42467356;
 //BA.debugLineNum = 42467356;BA.debugLine="gmap.AnimateCamera(cl)";
mostCurrent._gmap.AnimateCamera((com.google.android.gms.maps.model.CameraPosition)(_cl.getObject()));
RDebugUtils.currentLine=42467357;
 //BA.debugLineNum = 42467357;BA.debugLine="Log(itemSelect.SharhTafzili)";
anywheresoftware.b4a.keywords.Common.LogImpl("542467357",mostCurrent._itemselect.SharhTafzili /*String*/ ,0);
 };
RDebugUtils.currentLine=42467363;
 //BA.debugLineNum = 42467363;BA.debugLine="End Sub";
return "";
}
public static String  _btnnext_click() throws Exception{
RDebugUtils.currentModule="act_locationmoshtarian";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnnext_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnnext_click", null));}
RDebugUtils.currentLine=43450368;
 //BA.debugLineNum = 43450368;BA.debugLine="Private Sub btnNext_Click";
RDebugUtils.currentLine=43450369;
 //BA.debugLineNum = 43450369;BA.debugLine="If n=LstLocation.Size-1 Then";
if ((mostCurrent._n).equals(BA.NumberToString(_lstlocation.getSize()-1))) { 
RDebugUtils.currentLine=43450370;
 //BA.debugLineNum = 43450370;BA.debugLine="SelectData";
_selectdata();
RDebugUtils.currentLine=43450371;
 //BA.debugLineNum = 43450371;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=43450373;
 //BA.debugLineNum = 43450373;BA.debugLine="n=n+1";
mostCurrent._n = BA.NumberToString((double)(Double.parseDouble(mostCurrent._n))+1);
RDebugUtils.currentLine=43450374;
 //BA.debugLineNum = 43450374;BA.debugLine="SelectData";
_selectdata();
RDebugUtils.currentLine=43450375;
 //BA.debugLineNum = 43450375;BA.debugLine="End Sub";
return "";
}
public static String  _btnvisit_click() throws Exception{
RDebugUtils.currentModule="act_locationmoshtarian";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnvisit_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnvisit_click", null));}
RDebugUtils.currentLine=43384832;
 //BA.debugLineNum = 43384832;BA.debugLine="Private Sub btnVisit_Click";
RDebugUtils.currentLine=43384833;
 //BA.debugLineNum = 43384833;BA.debugLine="If MCode.TourVisitSW Then";
if (mostCurrent._mcode._tourvisitsw /*boolean*/ ) { 
RDebugUtils.currentLine=43384834;
 //BA.debugLineNum = 43384834;BA.debugLine="If Cu.GetString(\"fldVaziat\")=\"1\" Or Cu.GetString";
if ((mostCurrent._cu.GetString("fldVaziat")).equals("1") || (mostCurrent._cu.GetString("fldVaziat")).equals("2")) { 
RDebugUtils.currentLine=43384835;
 //BA.debugLineNum = 43384835;BA.debugLine="GoToVisit2";
_gotovisit2();
 };
 }else {
RDebugUtils.currentLine=43384839;
 //BA.debugLineNum = 43384839;BA.debugLine="GoToVisit(itemSelect)";
_gotovisit(mostCurrent._itemselect);
 };
RDebugUtils.currentLine=43384841;
 //BA.debugLineNum = 43384841;BA.debugLine="End Sub";
return "";
}
public static String  _gotovisit2() throws Exception{
RDebugUtils.currentModule="act_locationmoshtarian";
if (Debug.shouldDelegate(mostCurrent.activityBA, "gotovisit2", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "gotovisit2", null));}
String _mande = "";
String _saghfeetebar = "";
RDebugUtils.currentLine=42663936;
 //BA.debugLineNum = 42663936;BA.debugLine="Sub GoToVisit2";
RDebugUtils.currentLine=42663939;
 //BA.debugLineNum = 42663939;BA.debugLine="MCode.C_Tafzili=Cu.GetString(\"fldCodeTafzili\")";
mostCurrent._mcode._c_tafzili /*String*/  = mostCurrent._cu.GetString("fldCodeTafzili");
RDebugUtils.currentLine=42663940;
 //BA.debugLineNum = 42663940;BA.debugLine="MCode.N_Tafzili=Cu.GetString(\"fldSharheTafzili\")";
mostCurrent._mcode._n_tafzili /*String*/  = mostCurrent._cu.GetString("fldSharheTafzili");
RDebugUtils.currentLine=42663941;
 //BA.debugLineNum = 42663941;BA.debugLine="Dim mande As String=myCode.Is_Null_adad(Cu.GetStr";
_mande = mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,mostCurrent._cu.GetString("fldMande"));
RDebugUtils.currentLine=42663942;
 //BA.debugLineNum = 42663942;BA.debugLine="Dim SaghfeEtebar As String=myCode.Is_Null_adad(Cu";
_saghfeetebar = mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,mostCurrent._cu.GetString("fldSaghfeEtebar"));
RDebugUtils.currentLine=42663943;
 //BA.debugLineNum = 42663943;BA.debugLine="MCode.MandeHesab=mande";
mostCurrent._mcode._mandehesab /*String*/  = _mande;
RDebugUtils.currentLine=42663944;
 //BA.debugLineNum = 42663944;BA.debugLine="If SaghfeEtebar>0 Then";
if ((double)(Double.parseDouble(_saghfeetebar))>0) { 
RDebugUtils.currentLine=42663945;
 //BA.debugLineNum = 42663945;BA.debugLine="If mande>0 Then";
if ((double)(Double.parseDouble(_mande))>0) { 
RDebugUtils.currentLine=42663946;
 //BA.debugLineNum = 42663946;BA.debugLine="MCode.MandeEtebar=SaghfeEtebar - mande";
mostCurrent._mcode._mandeetebar /*String*/  = BA.NumberToString((double)(Double.parseDouble(_saghfeetebar))-(double)(Double.parseDouble(_mande)));
 }else {
RDebugUtils.currentLine=42663948;
 //BA.debugLineNum = 42663948;BA.debugLine="MCode.MandeEtebar=SaghfeEtebar";
mostCurrent._mcode._mandeetebar /*String*/  = _saghfeetebar;
 };
RDebugUtils.currentLine=42663951;
 //BA.debugLineNum = 42663951;BA.debugLine="MCode.ManedEtebarEnable=True";
mostCurrent._mcode._manedetebarenable /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 }else {
RDebugUtils.currentLine=42663953;
 //BA.debugLineNum = 42663953;BA.debugLine="MCode.ManedEtebarEnable=False";
mostCurrent._mcode._manedetebarenable /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=42663954;
 //BA.debugLineNum = 42663954;BA.debugLine="MCode.MandeEtebar=0";
mostCurrent._mcode._mandeetebar /*String*/  = BA.NumberToString(0);
 };
RDebugUtils.currentLine=42663957;
 //BA.debugLineNum = 42663957;BA.debugLine="Log(\"مانده: \"& mande)";
anywheresoftware.b4a.keywords.Common.LogImpl("542663957","مانده: "+_mande,0);
RDebugUtils.currentLine=42663958;
 //BA.debugLineNum = 42663958;BA.debugLine="Log(\"سقف اعتبار: \"&SaghfeEtebar)";
anywheresoftware.b4a.keywords.Common.LogImpl("542663958","سقف اعتبار: "+_saghfeetebar,0);
RDebugUtils.currentLine=42663959;
 //BA.debugLineNum = 42663959;BA.debugLine="Log(\"مانده اعتبار: \"&MCode.MandeEtebar)";
anywheresoftware.b4a.keywords.Common.LogImpl("542663959","مانده اعتبار: "+mostCurrent._mcode._mandeetebar /*String*/ ,0);
RDebugUtils.currentLine=42663960;
 //BA.debugLineNum = 42663960;BA.debugLine="Log(\"وضعیت مانده اعتبار: \"&MCode.ManedEtebarEnabl";
anywheresoftware.b4a.keywords.Common.LogImpl("542663960","وضعیت مانده اعتبار: "+BA.ObjectToString(mostCurrent._mcode._manedetebarenable /*boolean*/ ),0);
RDebugUtils.currentLine=42663963;
 //BA.debugLineNum = 42663963;BA.debugLine="visit";
_visit();
RDebugUtils.currentLine=42663965;
 //BA.debugLineNum = 42663965;BA.debugLine="StartActivity(Act_KalaDefault)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._act_kaladefault.getObject()));
RDebugUtils.currentLine=42663967;
 //BA.debugLineNum = 42663967;BA.debugLine="End Sub";
return "";
}
public static String  _gotovisit(ir.parsikhesab.pakhsh.mcode._adapterlistashkhas _item) throws Exception{
RDebugUtils.currentModule="act_locationmoshtarian";
if (Debug.shouldDelegate(mostCurrent.activityBA, "gotovisit", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "gotovisit", new Object[] {_item}));}
String _mande = "";
String _saghfeetebar = "";
RDebugUtils.currentLine=42598400;
 //BA.debugLineNum = 42598400;BA.debugLine="Sub GoToVisit(item As AdapterListAshkhas)";
RDebugUtils.currentLine=42598402;
 //BA.debugLineNum = 42598402;BA.debugLine="MCode.C_Tafzili=item.CodeTafzili";
mostCurrent._mcode._c_tafzili /*String*/  = _item.CodeTafzili /*String*/ ;
RDebugUtils.currentLine=42598403;
 //BA.debugLineNum = 42598403;BA.debugLine="MCode.N_Tafzili=item.SharhTafzili";
mostCurrent._mcode._n_tafzili /*String*/  = _item.SharhTafzili /*String*/ ;
RDebugUtils.currentLine=42598404;
 //BA.debugLineNum = 42598404;BA.debugLine="Dim mande As String=myCode.Is_Null_adad(item.Mand";
_mande = mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_item.Mande /*String*/ );
RDebugUtils.currentLine=42598405;
 //BA.debugLineNum = 42598405;BA.debugLine="Dim SaghfeEtebar As String=myCode.Is_Null_adad(it";
_saghfeetebar = mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_item.fldSaghfeEtebar /*String*/ );
RDebugUtils.currentLine=42598406;
 //BA.debugLineNum = 42598406;BA.debugLine="MCode.MandeHesab=mande";
mostCurrent._mcode._mandehesab /*String*/  = _mande;
RDebugUtils.currentLine=42598407;
 //BA.debugLineNum = 42598407;BA.debugLine="If SaghfeEtebar>0 Then";
if ((double)(Double.parseDouble(_saghfeetebar))>0) { 
RDebugUtils.currentLine=42598408;
 //BA.debugLineNum = 42598408;BA.debugLine="If mande>0 Then";
if ((double)(Double.parseDouble(_mande))>0) { 
RDebugUtils.currentLine=42598409;
 //BA.debugLineNum = 42598409;BA.debugLine="MCode.MandeEtebar=SaghfeEtebar - mande";
mostCurrent._mcode._mandeetebar /*String*/  = BA.NumberToString((double)(Double.parseDouble(_saghfeetebar))-(double)(Double.parseDouble(_mande)));
 }else {
RDebugUtils.currentLine=42598411;
 //BA.debugLineNum = 42598411;BA.debugLine="MCode.MandeEtebar=SaghfeEtebar";
mostCurrent._mcode._mandeetebar /*String*/  = _saghfeetebar;
 };
RDebugUtils.currentLine=42598414;
 //BA.debugLineNum = 42598414;BA.debugLine="MCode.ManedEtebarEnable=True";
mostCurrent._mcode._manedetebarenable /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 }else {
RDebugUtils.currentLine=42598416;
 //BA.debugLineNum = 42598416;BA.debugLine="MCode.ManedEtebarEnable=False";
mostCurrent._mcode._manedetebarenable /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=42598417;
 //BA.debugLineNum = 42598417;BA.debugLine="MCode.MandeEtebar=0";
mostCurrent._mcode._mandeetebar /*String*/  = BA.NumberToString(0);
 };
RDebugUtils.currentLine=42598420;
 //BA.debugLineNum = 42598420;BA.debugLine="Log(\"مانده: \"& mande)";
anywheresoftware.b4a.keywords.Common.LogImpl("542598420","مانده: "+_mande,0);
RDebugUtils.currentLine=42598421;
 //BA.debugLineNum = 42598421;BA.debugLine="Log(\"سقف اعتبار: \"&SaghfeEtebar)";
anywheresoftware.b4a.keywords.Common.LogImpl("542598421","سقف اعتبار: "+_saghfeetebar,0);
RDebugUtils.currentLine=42598422;
 //BA.debugLineNum = 42598422;BA.debugLine="Log(\"مانده اعتبار: \"&MCode.MandeEtebar)";
anywheresoftware.b4a.keywords.Common.LogImpl("542598422","مانده اعتبار: "+mostCurrent._mcode._mandeetebar /*String*/ ,0);
RDebugUtils.currentLine=42598423;
 //BA.debugLineNum = 42598423;BA.debugLine="Log(\"وضعیت مانده اعتبار: \"&MCode.ManedEtebarEnabl";
anywheresoftware.b4a.keywords.Common.LogImpl("542598423","وضعیت مانده اعتبار: "+BA.ObjectToString(mostCurrent._mcode._manedetebarenable /*boolean*/ ),0);
RDebugUtils.currentLine=42598426;
 //BA.debugLineNum = 42598426;BA.debugLine="visit";
_visit();
RDebugUtils.currentLine=42598428;
 //BA.debugLineNum = 42598428;BA.debugLine="StartActivity(Act_KalaDefault)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._act_kaladefault.getObject()));
RDebugUtils.currentLine=42598430;
 //BA.debugLineNum = 42598430;BA.debugLine="End Sub";
return "";
}
public static String  _getlocation() throws Exception{
RDebugUtils.currentModule="act_locationmoshtarian";
if (Debug.shouldDelegate(mostCurrent.activityBA, "getlocation", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "getlocation", null));}
int _i = 0;
anywheresoftware.b4a.objects.MapFragmentWrapper.LatLngWrapper _llpoint = null;
float _color = 0f;
String _vaziat = "";
ir.parsikhesab.pakhsh.mcode._adapterlistashkhas _first = null;
anywheresoftware.b4a.objects.MapFragmentWrapper.CameraPositionWrapper _cl = null;
anywheresoftware.b4a.objects.MapFragmentWrapper.PolylineWrapper _pl = null;
ir.parsikhesab.pakhsh.mcode._adapterlistashkhas _item = null;
RDebugUtils.currentLine=42336256;
 //BA.debugLineNum = 42336256;BA.debugLine="Private Sub GetLocation";
RDebugUtils.currentLine=42336257;
 //BA.debugLineNum = 42336257;BA.debugLine="If gmap.IsInitialized Then";
if (mostCurrent._gmap.IsInitialized()) { 
RDebugUtils.currentLine=42336258;
 //BA.debugLineNum = 42336258;BA.debugLine="Try";
try {RDebugUtils.currentLine=42336259;
 //BA.debugLineNum = 42336259;BA.debugLine="points.Initialize";
mostCurrent._points.Initialize();
RDebugUtils.currentLine=42336260;
 //BA.debugLineNum = 42336260;BA.debugLine="gmap.Clear";
mostCurrent._gmap.Clear();
RDebugUtils.currentLine=42336261;
 //BA.debugLineNum = 42336261;BA.debugLine="points.Clear";
mostCurrent._points.Clear();
RDebugUtils.currentLine=42336262;
 //BA.debugLineNum = 42336262;BA.debugLine="If MCode.TourVisitSW Then";
if (mostCurrent._mcode._tourvisitsw /*boolean*/ ) { 
RDebugUtils.currentLine=42336264;
 //BA.debugLineNum = 42336264;BA.debugLine="Cu = MCode.Result($\"SELECT tblTourVisitor.fldR";
mostCurrent._cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,("SELECT tblTourVisitor.fldRadif,tblTourVisitor.fldCodeSuperVisor,tblTourVisitor.fldCodeVisitor,tblTourVisitor.fldCodeGroup,tblTourVisitor.fldCodeTafzili,TblAshkhas.fldSharheTafzili,tblTourVisitor.fldDate,tblTourVisitor.fldDateVisit,tblTourVisitor.fldTimeVisit,tblTourVisitor.fldDateNextVisit,tblTourVisitor.fldDateTozie,tblTourVisitor.fldShomareSefaresh,tblTourVisitor.fldSharh,tblTourVisitor.fldVaziat,tblTourVisitor.fldShomareFactor,TblAshkhas.FldLat,TblAshkhas.FldLon,TblAshkhas.fldTell,TblAshkhas.fldAdress,TblAshkhas.fldMande,TblAshkhas.fldSaghfeEtebar,TblAshkhas.fldBlackList  FROM TblAshkhas,tblTourVisitor WHERE TblAshkhas.fldCodetafzili = tblTourVisitor.fldCodeTafzili AND fldDateVisit = "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._mcode._datepersian /*String*/ (mostCurrent.activityBA)))+" and fldType='Tour' ORDER BY tblTourVisitor.fldRadif ASC"));
RDebugUtils.currentLine=42336266;
 //BA.debugLineNum = 42336266;BA.debugLine="If Cu.RowCount>0 Then";
if (mostCurrent._cu.getRowCount()>0) { 
RDebugUtils.currentLine=42336267;
 //BA.debugLineNum = 42336267;BA.debugLine="For i=0 To Cu.RowCount-1";
{
final int step9 = 1;
final int limit9 = (int) (mostCurrent._cu.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=42336268;
 //BA.debugLineNum = 42336268;BA.debugLine="Dim llPoint As LatLng";
_llpoint = new anywheresoftware.b4a.objects.MapFragmentWrapper.LatLngWrapper();
RDebugUtils.currentLine=42336269;
 //BA.debugLineNum = 42336269;BA.debugLine="Dim color As Float";
_color = 0f;
RDebugUtils.currentLine=42336270;
 //BA.debugLineNum = 42336270;BA.debugLine="Dim vaziat As String";
_vaziat = "";
RDebugUtils.currentLine=42336271;
 //BA.debugLineNum = 42336271;BA.debugLine="Cu.Position=i";
mostCurrent._cu.setPosition(_i);
RDebugUtils.currentLine=42336272;
 //BA.debugLineNum = 42336272;BA.debugLine="If Cu.GetString(\"fldVaziat\")=\"1\" Then";
if ((mostCurrent._cu.GetString("fldVaziat")).equals("1")) { 
RDebugUtils.currentLine=42336273;
 //BA.debugLineNum = 42336273;BA.debugLine="color=gmap.HUE_RED";
_color = mostCurrent._gmap.HUE_RED;
RDebugUtils.currentLine=42336274;
 //BA.debugLineNum = 42336274;BA.debugLine="vaziat=\"ویزیت نشده\"";
_vaziat = "ویزیت نشده";
 }else 
{RDebugUtils.currentLine=42336275;
 //BA.debugLineNum = 42336275;BA.debugLine="Else if Cu.GetString(\"fldVaziat\")=\"2\" Then";
if ((mostCurrent._cu.GetString("fldVaziat")).equals("2")) { 
RDebugUtils.currentLine=42336276;
 //BA.debugLineNum = 42336276;BA.debugLine="color=gmap.HUE_BLUE";
_color = mostCurrent._gmap.HUE_BLUE;
RDebugUtils.currentLine=42336277;
 //BA.debugLineNum = 42336277;BA.debugLine="vaziat=\"ویزیت شده\"";
_vaziat = "ویزیت شده";
 }else 
{RDebugUtils.currentLine=42336278;
 //BA.debugLineNum = 42336278;BA.debugLine="Else if Cu.GetString(\"fldVaziat\")=\"3\" Then";
if ((mostCurrent._cu.GetString("fldVaziat")).equals("3")) { 
RDebugUtils.currentLine=42336279;
 //BA.debugLineNum = 42336279;BA.debugLine="color=gmap.HUE_GREEN";
_color = mostCurrent._gmap.HUE_GREEN;
RDebugUtils.currentLine=42336280;
 //BA.debugLineNum = 42336280;BA.debugLine="vaziat=\"سفارش گرفته\"";
_vaziat = "سفارش گرفته";
 }else {
RDebugUtils.currentLine=42336282;
 //BA.debugLineNum = 42336282;BA.debugLine="color=gmap.HUE_RED";
_color = mostCurrent._gmap.HUE_RED;
RDebugUtils.currentLine=42336283;
 //BA.debugLineNum = 42336283;BA.debugLine="vaziat=\"ویزیت نشده\"";
_vaziat = "ویزیت نشده";
 }}}
;
RDebugUtils.currentLine=42336285;
 //BA.debugLineNum = 42336285;BA.debugLine="gmap.AddMarker2(Cu.GetString(\"FldLat\"),Cu.Ge";
mostCurrent._gmap.AddMarker2((double)(Double.parseDouble(mostCurrent._cu.GetString("FldLat"))),(double)(Double.parseDouble(mostCurrent._cu.GetString("FldLon"))),mostCurrent._cu.GetString("fldRadif")+") :"+"کد: "+mostCurrent._cu.GetString("fldCodeTafzili")+" نام: "+mostCurrent._cu.GetString("fldSharheTafzili")+" وضعیت: "+_vaziat,_color).setSnippet(BA.NumberToString(_i));
RDebugUtils.currentLine=42336286;
 //BA.debugLineNum = 42336286;BA.debugLine="llPoint.Initialize(Cu.GetString(\"FldLat\"),Cu";
_llpoint.Initialize((double)(Double.parseDouble(mostCurrent._cu.GetString("FldLat"))),(double)(Double.parseDouble(mostCurrent._cu.GetString("FldLon"))));
RDebugUtils.currentLine=42336287;
 //BA.debugLineNum = 42336287;BA.debugLine="points.Add(llPoint)";
mostCurrent._points.Add((Object)(_llpoint.getObject()));
RDebugUtils.currentLine=42336288;
 //BA.debugLineNum = 42336288;BA.debugLine="If i=Cu.RowCount-1 Then";
if (_i==mostCurrent._cu.getRowCount()-1) { 
RDebugUtils.currentLine=42336289;
 //BA.debugLineNum = 42336289;BA.debugLine="Dim first As AdapterListAshkhas=LstLocation";
_first = (ir.parsikhesab.pakhsh.mcode._adapterlistashkhas)(_lstlocation.Get((int) (0)));
RDebugUtils.currentLine=42336290;
 //BA.debugLineNum = 42336290;BA.debugLine="Dim cl As CameraPosition";
_cl = new anywheresoftware.b4a.objects.MapFragmentWrapper.CameraPositionWrapper();
RDebugUtils.currentLine=42336291;
 //BA.debugLineNum = 42336291;BA.debugLine="cl.Initialize(first.Lat,first.Lon,50)";
_cl.Initialize((double)(Double.parseDouble(_first.Lat /*String*/ )),(double)(Double.parseDouble(_first.Lon /*String*/ )),(float) (50));
RDebugUtils.currentLine=42336292;
 //BA.debugLineNum = 42336292;BA.debugLine="gmap.AnimateCamera(cl)";
mostCurrent._gmap.AnimateCamera((com.google.android.gms.maps.model.CameraPosition)(_cl.getObject()));
 };
 }
};
RDebugUtils.currentLine=42336296;
 //BA.debugLineNum = 42336296;BA.debugLine="Dim pl As Polyline = gmap.AddPolyline";
_pl = new anywheresoftware.b4a.objects.MapFragmentWrapper.PolylineWrapper();
_pl = mostCurrent._gmap.AddPolyline();
RDebugUtils.currentLine=42336297;
 //BA.debugLineNum = 42336297;BA.debugLine="pl.points = points";
_pl.setPoints(mostCurrent._points);
RDebugUtils.currentLine=42336298;
 //BA.debugLineNum = 42336298;BA.debugLine="pl.Color = Colors.Blue";
_pl.setColor(anywheresoftware.b4a.keywords.Common.Colors.Blue);
 };
 }else {
RDebugUtils.currentLine=42336302;
 //BA.debugLineNum = 42336302;BA.debugLine="For i=0 To LstLocation.Size-1";
{
final int step42 = 1;
final int limit42 = (int) (_lstlocation.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit42 ;_i = _i + step42 ) {
RDebugUtils.currentLine=42336303;
 //BA.debugLineNum = 42336303;BA.debugLine="Dim item As AdapterListAshkhas=LstLocation.Ge";
_item = (ir.parsikhesab.pakhsh.mcode._adapterlistashkhas)(_lstlocation.Get(_i));
RDebugUtils.currentLine=42336304;
 //BA.debugLineNum = 42336304;BA.debugLine="Dim llPoint As LatLng";
_llpoint = new anywheresoftware.b4a.objects.MapFragmentWrapper.LatLngWrapper();
RDebugUtils.currentLine=42336305;
 //BA.debugLineNum = 42336305;BA.debugLine="Dim color As Float";
_color = 0f;
RDebugUtils.currentLine=42336307;
 //BA.debugLineNum = 42336307;BA.debugLine="If IsNumber(item.Lat) And IsNumber(item.Lon )";
if (anywheresoftware.b4a.keywords.Common.IsNumber(_item.Lat /*String*/ ) && anywheresoftware.b4a.keywords.Common.IsNumber(_item.Lon /*String*/ ) && (double)(Double.parseDouble(_item.Lat /*String*/ ))>0 && (double)(Double.parseDouble(_item.Lon /*String*/ ))>0) { 
RDebugUtils.currentLine=42336310;
 //BA.debugLineNum = 42336310;BA.debugLine="llPoint.Initialize(item.Lat,item.Lon)";
_llpoint.Initialize((double)(Double.parseDouble(_item.Lat /*String*/ )),(double)(Double.parseDouble(_item.Lon /*String*/ )));
RDebugUtils.currentLine=42336311;
 //BA.debugLineNum = 42336311;BA.debugLine="points.Add(llPoint)";
mostCurrent._points.Add((Object)(_llpoint.getObject()));
RDebugUtils.currentLine=42336314;
 //BA.debugLineNum = 42336314;BA.debugLine="color=gmap.HUE_RED";
_color = mostCurrent._gmap.HUE_RED;
RDebugUtils.currentLine=42336315;
 //BA.debugLineNum = 42336315;BA.debugLine="gmap.AddMarker2(item.Lat,item.Lon,item.Shar";
mostCurrent._gmap.AddMarker2((double)(Double.parseDouble(_item.Lat /*String*/ )),(double)(Double.parseDouble(_item.Lon /*String*/ )),_item.SharhTafzili /*String*/ ,_color).setSnippet(BA.NumberToString(_i));
 };
RDebugUtils.currentLine=42336320;
 //BA.debugLineNum = 42336320;BA.debugLine="If i=LstLocation.Size-1 Then";
if (_i==_lstlocation.getSize()-1) { 
RDebugUtils.currentLine=42336321;
 //BA.debugLineNum = 42336321;BA.debugLine="Dim first As AdapterListAshkhas=LstLocation.";
_first = (ir.parsikhesab.pakhsh.mcode._adapterlistashkhas)(_lstlocation.Get((int) (0)));
RDebugUtils.currentLine=42336322;
 //BA.debugLineNum = 42336322;BA.debugLine="Dim cl As CameraPosition";
_cl = new anywheresoftware.b4a.objects.MapFragmentWrapper.CameraPositionWrapper();
RDebugUtils.currentLine=42336323;
 //BA.debugLineNum = 42336323;BA.debugLine="cl.Initialize(first.Lat,first.Lon,50)";
_cl.Initialize((double)(Double.parseDouble(_first.Lat /*String*/ )),(double)(Double.parseDouble(_first.Lon /*String*/ )),(float) (50));
RDebugUtils.currentLine=42336324;
 //BA.debugLineNum = 42336324;BA.debugLine="gmap.AnimateCamera(cl)";
mostCurrent._gmap.AnimateCamera((com.google.android.gms.maps.model.CameraPosition)(_cl.getObject()));
 };
 }
};
 };
RDebugUtils.currentLine=42336330;
 //BA.debugLineNum = 42336330;BA.debugLine="n=0";
mostCurrent._n = BA.NumberToString(0);
RDebugUtils.currentLine=42336331;
 //BA.debugLineNum = 42336331;BA.debugLine="SelectData";
_selectdata();
RDebugUtils.currentLine=42336332;
 //BA.debugLineNum = 42336332;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 } 
       catch (Exception e64) {
			processBA.setLastException(e64);RDebugUtils.currentLine=42336334;
 //BA.debugLineNum = 42336334;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("542336334",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 };
 };
RDebugUtils.currentLine=42336338;
 //BA.debugLineNum = 42336338;BA.debugLine="End Sub";
return "";
}
public static String  _getvaziat(String _str) throws Exception{
RDebugUtils.currentModule="act_locationmoshtarian";
if (Debug.shouldDelegate(mostCurrent.activityBA, "getvaziat", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "getvaziat", new Object[] {_str}));}
RDebugUtils.currentLine=42532864;
 //BA.debugLineNum = 42532864;BA.debugLine="Sub GetVaziat(str As String) As String";
RDebugUtils.currentLine=42532865;
 //BA.debugLineNum = 42532865;BA.debugLine="If str=\"1\" Then";
if ((_str).equals("1")) { 
RDebugUtils.currentLine=42532866;
 //BA.debugLineNum = 42532866;BA.debugLine="Return \"ویزیت نشده\"";
if (true) return "ویزیت نشده";
 }else 
{RDebugUtils.currentLine=42532867;
 //BA.debugLineNum = 42532867;BA.debugLine="Else if str=\"2\" Then";
if ((_str).equals("2")) { 
RDebugUtils.currentLine=42532868;
 //BA.debugLineNum = 42532868;BA.debugLine="Return \"ویزیت شده\"";
if (true) return "ویزیت شده";
 }else 
{RDebugUtils.currentLine=42532869;
 //BA.debugLineNum = 42532869;BA.debugLine="Else if str=\"3\" Then";
if ((_str).equals("3")) { 
RDebugUtils.currentLine=42532870;
 //BA.debugLineNum = 42532870;BA.debugLine="Return \"سفارش گرفته\"";
if (true) return "سفارش گرفته";
 }else {
RDebugUtils.currentLine=42532872;
 //BA.debugLineNum = 42532872;BA.debugLine="Return \"ویزیت نشده\"";
if (true) return "ویزیت نشده";
 }}}
;
RDebugUtils.currentLine=42532874;
 //BA.debugLineNum = 42532874;BA.debugLine="End Sub";
return "";
}
public static String  _visit() throws Exception{
RDebugUtils.currentModule="act_locationmoshtarian";
if (Debug.shouldDelegate(mostCurrent.activityBA, "visit", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "visit", null));}
String _date = "";
RDebugUtils.currentLine=42729472;
 //BA.debugLineNum = 42729472;BA.debugLine="Sub visit";
RDebugUtils.currentLine=42729473;
 //BA.debugLineNum = 42729473;BA.debugLine="Dim Date As String = MCode.ConvertNumbersPersian2";
_date = mostCurrent._mcode._convertnumberspersian2english /*String*/ (mostCurrent.activityBA,mostCurrent._mcode._datepersian /*String*/ (mostCurrent.activityBA));
RDebugUtils.currentLine=42729474;
 //BA.debugLineNum = 42729474;BA.debugLine="If MCode.editFactor=False Then";
if (mostCurrent._mcode._editfactor /*boolean*/ ==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=42729475;
 //BA.debugLineNum = 42729475;BA.debugLine="MCode.FaktorSelect=\"\"";
mostCurrent._mcode._faktorselect /*String*/  = "";
 };
RDebugUtils.currentLine=42729477;
 //BA.debugLineNum = 42729477;BA.debugLine="MCode.Action=\"SabtFaktor\"";
mostCurrent._mcode._action /*String*/  = "SabtFaktor";
RDebugUtils.currentLine=42729478;
 //BA.debugLineNum = 42729478;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * from Tb";
mostCurrent._cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
mostCurrent._cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * from TblLogVisitSefaresh Where FldC_Ashkhas = '"+mostCurrent._mcode._c_tafzili /*String*/ +"'");
RDebugUtils.currentLine=42729479;
 //BA.debugLineNum = 42729479;BA.debugLine="If Cu.RowCount>0 Then";
if (mostCurrent._cu.getRowCount()>0) { 
RDebugUtils.currentLine=42729480;
 //BA.debugLineNum = 42729480;BA.debugLine="MCode.SaveUpdate(\"Update TblLogVisitSefaresh Set";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Update TblLogVisitSefaresh Set FldVisit = '"+_date+"' Where FldC_Ashkhas = '"+mostCurrent._mcode._c_tafzili /*String*/ +"'");
 }else {
RDebugUtils.currentLine=42729482;
 //BA.debugLineNum = 42729482;BA.debugLine="MCode.SaveUpdate(\"Insert Into TblLogVisitSefares";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Insert Into TblLogVisitSefaresh (FldC_Ashkhas,FldVisit,FldSefaresh,FldElatSefaresh,FldLat,FldLon) Values ('"+mostCurrent._mcode._c_tafzili /*String*/ +"','"+_date+"','','','','')");
 };
RDebugUtils.currentLine=42729484;
 //BA.debugLineNum = 42729484;BA.debugLine="MCode.SaveUpdate(\"Update TblAshkhas Set FldLastVi";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Update TblAshkhas Set FldLastVisit = '"+_date+"' Where fldCodetafzili = '"+mostCurrent._mcode._c_tafzili /*String*/ +"'");
RDebugUtils.currentLine=42729485;
 //BA.debugLineNum = 42729485;BA.debugLine="MCode.SaveUpdate(\"Update TblVisitorTour Set FldLa";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Update TblVisitorTour Set FldLastVisit = '"+_date+"' Where FldC_Ashkhas = '"+mostCurrent._mcode._c_tafzili /*String*/ +"'");
RDebugUtils.currentLine=42729486;
 //BA.debugLineNum = 42729486;BA.debugLine="SaveLastSeen";
_savelastseen();
RDebugUtils.currentLine=42729487;
 //BA.debugLineNum = 42729487;BA.debugLine="End Sub";
return "";
}
public static String  _lblcall_click() throws Exception{
RDebugUtils.currentModule="act_locationmoshtarian";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lblcall_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lblcall_click", null));}
String _str = "";
anywheresoftware.b4a.objects.IntentWrapper _i = null;
RDebugUtils.currentLine=43319296;
 //BA.debugLineNum = 43319296;BA.debugLine="Private Sub lblCall_Click";
RDebugUtils.currentLine=43319297;
 //BA.debugLineNum = 43319297;BA.debugLine="Dim str As String=lblShomareTell.tag";
_str = BA.ObjectToString(mostCurrent._lblshomaretell.getTag());
RDebugUtils.currentLine=43319298;
 //BA.debugLineNum = 43319298;BA.debugLine="Dim i As Intent";
_i = new anywheresoftware.b4a.objects.IntentWrapper();
RDebugUtils.currentLine=43319299;
 //BA.debugLineNum = 43319299;BA.debugLine="i.Initialize(i.ACTION_VIEW, \"tel:\"&str)";
_i.Initialize(_i.ACTION_VIEW,"tel:"+_str);
RDebugUtils.currentLine=43319300;
 //BA.debugLineNum = 43319300;BA.debugLine="StartActivity(i)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(_i.getObject()));
RDebugUtils.currentLine=43319301;
 //BA.debugLineNum = 43319301;BA.debugLine="End Sub";
return "";
}
public static String  _lblgotolocation_click() throws Exception{
RDebugUtils.currentModule="act_locationmoshtarian";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lblgotolocation_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lblgotolocation_click", null));}
RDebugUtils.currentLine=43188224;
 //BA.debugLineNum = 43188224;BA.debugLine="Private Sub lblGoToLocation_Click";
RDebugUtils.currentLine=43188225;
 //BA.debugLineNum = 43188225;BA.debugLine="ShowMap(Cu.GetString(\"FldLat\"), Cu.GetString(\"Fld";
_showmap(mostCurrent._cu.GetString("FldLat"),mostCurrent._cu.GetString("FldLon"));
RDebugUtils.currentLine=43188226;
 //BA.debugLineNum = 43188226;BA.debugLine="End Sub";
return "";
}
public static String  _showmap(String _lat1,String _lon1) throws Exception{
RDebugUtils.currentModule="act_locationmoshtarian";
if (Debug.shouldDelegate(mostCurrent.activityBA, "showmap", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "showmap", new Object[] {_lat1,_lon1}));}
double _destlat = 0;
double _destlng = 0;
String _label = "";
String _uri = "";
anywheresoftware.b4a.objects.IntentWrapper _intent = null;
RDebugUtils.currentLine=43253760;
 //BA.debugLineNum = 43253760;BA.debugLine="Sub ShowMap(Lat1 As String,Lon1 As String)";
RDebugUtils.currentLine=43253761;
 //BA.debugLineNum = 43253761;BA.debugLine="If Lat1 =\"\" And Lon1=\"\" Then";
if ((_lat1).equals("") && (_lon1).equals("")) { 
RDebugUtils.currentLine=43253762;
 //BA.debugLineNum = 43253762;BA.debugLine="ToastMessageShow(\"برای این شخص موقعیت ثبت نشده ا";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("برای این شخص موقعیت ثبت نشده است"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=43253763;
 //BA.debugLineNum = 43253763;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=43253766;
 //BA.debugLineNum = 43253766;BA.debugLine="Dim destLat As Double = Lat1 ' عرض جغرافیایی مقصد";
_destlat = (double)(Double.parseDouble(_lat1));
RDebugUtils.currentLine=43253767;
 //BA.debugLineNum = 43253767;BA.debugLine="Dim destLng As Double = Lon1 ' طول جغرافیایی مقصد";
_destlng = (double)(Double.parseDouble(_lon1));
RDebugUtils.currentLine=43253768;
 //BA.debugLineNum = 43253768;BA.debugLine="Dim label As String = \"Destination\" ' برچسب مقصد";
_label = "Destination";
RDebugUtils.currentLine=43253770;
 //BA.debugLineNum = 43253770;BA.debugLine="Dim uri As String";
_uri = "";
RDebugUtils.currentLine=43253771;
 //BA.debugLineNum = 43253771;BA.debugLine="uri = \"google.navigation:q=\" & destLat & \",\" & de";
_uri = "google.navigation:q="+BA.NumberToString(_destlat)+","+BA.NumberToString(_destlng)+"&label="+_label;
RDebugUtils.currentLine=43253773;
 //BA.debugLineNum = 43253773;BA.debugLine="Dim intent As Intent";
_intent = new anywheresoftware.b4a.objects.IntentWrapper();
RDebugUtils.currentLine=43253774;
 //BA.debugLineNum = 43253774;BA.debugLine="intent.Initialize(intent.ACTION_VIEW, uri)";
_intent.Initialize(_intent.ACTION_VIEW,_uri);
RDebugUtils.currentLine=43253775;
 //BA.debugLineNum = 43253775;BA.debugLine="intent.SetComponent(\"com.google.android.apps.maps";
_intent.SetComponent("com.google.android.apps.maps");
RDebugUtils.currentLine=43253777;
 //BA.debugLineNum = 43253777;BA.debugLine="If intent.IsInitialized Then";
if (_intent.IsInitialized()) { 
RDebugUtils.currentLine=43253778;
 //BA.debugLineNum = 43253778;BA.debugLine="StartActivity(intent)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(_intent.getObject()));
 }else {
RDebugUtils.currentLine=43253780;
 //BA.debugLineNum = 43253780;BA.debugLine="ToastMessageShow(\"Google Maps app not found\", Tr";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Google Maps app not found"),anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=43253795;
 //BA.debugLineNum = 43253795;BA.debugLine="End Sub";
return "";
}
public static String  _loaddata(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
RDebugUtils.currentModule="act_locationmoshtarian";
if (Debug.shouldDelegate(mostCurrent.activityBA, "loaddata", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "loaddata", new Object[] {_lst}));}
RDebugUtils.currentLine=42205184;
 //BA.debugLineNum = 42205184;BA.debugLine="Sub LoadData(lst As List)";
RDebugUtils.currentLine=42205185;
 //BA.debugLineNum = 42205185;BA.debugLine="If lst.Size>0 Then";
if (_lst.getSize()>0) { 
RDebugUtils.currentLine=42205186;
 //BA.debugLineNum = 42205186;BA.debugLine="LstLocation=lst";
_lstlocation = _lst;
RDebugUtils.currentLine=42205187;
 //BA.debugLineNum = 42205187;BA.debugLine="LoadMap";
_loadmap();
 };
RDebugUtils.currentLine=42205189;
 //BA.debugLineNum = 42205189;BA.debugLine="End Sub";
return "";
}
public static boolean  _mapfragment1_markerclick(anywheresoftware.b4a.objects.MapFragmentWrapper.MarkerWrapper _selectedmarker) throws Exception{
RDebugUtils.currentModule="act_locationmoshtarian";
if (Debug.shouldDelegate(mostCurrent.activityBA, "mapfragment1_markerclick", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "mapfragment1_markerclick", new Object[] {_selectedmarker}));}
RDebugUtils.currentLine=42401792;
 //BA.debugLineNum = 42401792;BA.debugLine="Sub MapFragment1_MarkerClick (SelectedMarker As Ma";
RDebugUtils.currentLine=42401793;
 //BA.debugLineNum = 42401793;BA.debugLine="n=SelectedMarker.Snippet";
mostCurrent._n = _selectedmarker.getSnippet();
RDebugUtils.currentLine=42401794;
 //BA.debugLineNum = 42401794;BA.debugLine="SelectData";
_selectdata();
RDebugUtils.currentLine=42401798;
 //BA.debugLineNum = 42401798;BA.debugLine="End Sub";
return false;
}
public static String  _savelastseen() throws Exception{
RDebugUtils.currentModule="act_locationmoshtarian";
if (Debug.shouldDelegate(mostCurrent.activityBA, "savelastseen", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "savelastseen", null));}
String _dateshamsi = "";
String _time = "";
String _d = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu1 = null;
int _count = 0;
int _maxradif = 0;
RDebugUtils.currentLine=42795008;
 //BA.debugLineNum = 42795008;BA.debugLine="Sub SaveLastSeen";
RDebugUtils.currentLine=42795010;
 //BA.debugLineNum = 42795010;BA.debugLine="DateTime.DateFormat=\"yyyy-MM-dd\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=42795012;
 //BA.debugLineNum = 42795012;BA.debugLine="Dim DateShamsi As String = MCode.DatePersian";
_dateshamsi = mostCurrent._mcode._datepersian /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=42795013;
 //BA.debugLineNum = 42795013;BA.debugLine="Dim Time As String = DateTime.Time(DateTime.Now)";
_time = anywheresoftware.b4a.keywords.Common.DateTime.Time(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
RDebugUtils.currentLine=42795014;
 //BA.debugLineNum = 42795014;BA.debugLine="Dim D As String = DateShamsi & \"T\" & Time";
_d = _dateshamsi+"T"+_time;
RDebugUtils.currentLine=42795015;
 //BA.debugLineNum = 42795015;BA.debugLine="LogColor(\"D: \" & D,Colors.Red)";
anywheresoftware.b4a.keywords.Common.LogImpl("542795015","D: "+_d,anywheresoftware.b4a.keywords.Common.Colors.Red);
RDebugUtils.currentLine=42795017;
 //BA.debugLineNum = 42795017;BA.debugLine="Dim Cu1 As Cursor = MCode.Result(\"Select * From T";
_cu1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu1 = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblLastSeen Where FldC_Ashkhas = '"+mostCurrent._mcode._c_tafzili /*String*/ +"'");
RDebugUtils.currentLine=42795018;
 //BA.debugLineNum = 42795018;BA.debugLine="If Cu1.RowCount>0 Then";
if (_cu1.getRowCount()>0) { 
RDebugUtils.currentLine=42795019;
 //BA.debugLineNum = 42795019;BA.debugLine="MCode.SaveUpdate(\"Update TblLastSeen Set LastSee";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Update TblLastSeen Set LastSeen = '"+_d+"' Where FldC_Ashkhas = '"+mostCurrent._mcode._c_tafzili /*String*/ +"'");
 }else {
RDebugUtils.currentLine=42795021;
 //BA.debugLineNum = 42795021;BA.debugLine="MCode.SaveUpdate(\"Insert Into TblLastSeen (FldC_";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Insert Into TblLastSeen (FldC_Ashkhas,LastSeen) Values ('"+mostCurrent._mcode._c_tafzili /*String*/ +"','"+_d+"')");
 };
RDebugUtils.currentLine=42795023;
 //BA.debugLineNum = 42795023;BA.debugLine="MCode.SaveUpdate(\"Update TblAshkhas Set lastSeen";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Update TblAshkhas Set lastSeen = '"+_d+"' Where fldCodetafzili = '"+mostCurrent._mcode._c_tafzili /*String*/ +"'");
RDebugUtils.currentLine=42795027;
 //BA.debugLineNum = 42795027;BA.debugLine="If MCode.TourVisitSW And MCode.TourVisit=1 Then";
if (mostCurrent._mcode._tourvisitsw /*boolean*/  && (mostCurrent._mcode._tourvisit /*String*/ ).equals(BA.NumberToString(1))) { 
RDebugUtils.currentLine=42795028;
 //BA.debugLineNum = 42795028;BA.debugLine="MCode.SaveUpdate(\"Update tblTourVisitor Set fldV";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Update tblTourVisitor Set fldVaziat='2',fldTimeVisit='"+_time+"',fldSend='False' Where fldCodeTafzili = '"+mostCurrent._mcode._c_tafzili /*String*/ +"' and fldDateVisit='"+mostCurrent._mcode._datepersian /*String*/ (mostCurrent.activityBA)+"' and fldType='Tour'");
 }else {
RDebugUtils.currentLine=42795030;
 //BA.debugLineNum = 42795030;BA.debugLine="Dim Count As Int = MCode.SingleResult($\"Select C";
_count = (int)(BA.ObjectToNumber(mostCurrent._mcode._singleresult /*Object*/ (mostCurrent.activityBA,("Select Count(fldRadif) from tblTourVisitor where fldCodeTafzili='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._mcode._c_tafzili /*String*/ ))+"' and fldDateVisit='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._mcode._datepersian /*String*/ (mostCurrent.activityBA)))+"' and fldType='Free'"))));
RDebugUtils.currentLine=42795031;
 //BA.debugLineNum = 42795031;BA.debugLine="Dim MaxRadif As Int";
_maxradif = 0;
RDebugUtils.currentLine=42795032;
 //BA.debugLineNum = 42795032;BA.debugLine="Dim Count As Int = MCode.SingleResult($\"Select C";
_count = (int)(BA.ObjectToNumber(mostCurrent._mcode._singleresult /*Object*/ (mostCurrent.activityBA,("Select Count(fldRadif) from tblTourVisitor where  fldDateVisit='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._mcode._datepersian /*String*/ (mostCurrent.activityBA)))+"' and fldType='Free'"))));
RDebugUtils.currentLine=42795033;
 //BA.debugLineNum = 42795033;BA.debugLine="Dim MaxRadif As Int";
_maxradif = 0;
RDebugUtils.currentLine=42795034;
 //BA.debugLineNum = 42795034;BA.debugLine="If Count=0 Then";
if (_count==0) { 
RDebugUtils.currentLine=42795035;
 //BA.debugLineNum = 42795035;BA.debugLine="MaxRadif=1";
_maxradif = (int) (1);
 }else {
RDebugUtils.currentLine=42795037;
 //BA.debugLineNum = 42795037;BA.debugLine="MaxRadif= MCode.SingleResult($\"Select Max(fldRa";
_maxradif = (int)(BA.ObjectToNumber(mostCurrent._mcode._singleresult /*Object*/ (mostCurrent.activityBA,("Select Max(fldRadif) from tblTourVisitor where  fldDateVisit='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._mcode._datepersian /*String*/ (mostCurrent.activityBA)))+"' and fldType='Free'"))));
RDebugUtils.currentLine=42795038;
 //BA.debugLineNum = 42795038;BA.debugLine="MaxRadif=MaxRadif+1";
_maxradif = (int) (_maxradif+1);
 };
RDebugUtils.currentLine=42795041;
 //BA.debugLineNum = 42795041;BA.debugLine="Cu1 = MCode.Result($\"SELECT * FROM TblAshkhas WH";
_cu1 = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,("SELECT * FROM TblAshkhas WHERE TblAshkhas.fldCodetafzili ="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._mcode._c_tafzili /*String*/ ))+""));
RDebugUtils.currentLine=42795043;
 //BA.debugLineNum = 42795043;BA.debugLine="Cu1.Position=0";
_cu1.setPosition((int) (0));
RDebugUtils.currentLine=42795044;
 //BA.debugLineNum = 42795044;BA.debugLine="MCode.SaveUpdate(\"Insert into tblTourVisitor(fld";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Insert into tblTourVisitor(fldRadif,fldCodeSuperVisor,fldCodeGroup,fldCodeVisitor,fldCodeTafzili,fldSharheTafzili,fldDate,fldDateVisit,fldTimeVisit,fldDateNextVisit,fldDateTozie,fldShomareSefaresh,fldTimeSefaresh,fldSharh,fldVaziat,fldShomareFactor,fldSend,fldType) Values("+BA.NumberToString(_maxradif)+",0,'"+mostCurrent._cu.GetString("fldCodeGroup")+"','"+mostCurrent._mcode._c_visitor /*String*/ +"','"+mostCurrent._mcode._c_tafzili /*String*/ +"','"+mostCurrent._mcode._n_tafzili /*String*/ +"','"+mostCurrent._mcode._datepersian /*String*/ (mostCurrent.activityBA)+"','"+mostCurrent._mcode._datepersian /*String*/ (mostCurrent.activityBA)+"','"+_time+"','0','0','0','','0','2','0','False','Free')");
 };
RDebugUtils.currentLine=42795047;
 //BA.debugLineNum = 42795047;BA.debugLine="End Sub";
return "";
}
}