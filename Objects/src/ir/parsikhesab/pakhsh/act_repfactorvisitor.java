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

public class act_repfactorvisitor extends Activity implements B4AActivity{
	public static act_repfactorvisitor mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.act_repfactorvisitor");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (act_repfactorvisitor).");
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
		activityBA = new BA(this, layout, processBA, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.act_repfactorvisitor");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "ir.parsikhesab.pakhsh.act_repfactorvisitor", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (act_repfactorvisitor) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (act_repfactorvisitor) Resume **");
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
		return act_repfactorvisitor.class;
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
            BA.LogInfo("** Activity (act_repfactorvisitor) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (act_repfactorvisitor) Pause event (activity is not paused). **");
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
            act_repfactorvisitor mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (act_repfactorvisitor) Resume **");
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
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public ir.parsikhesab.pakhsh.b4xdialog _dialog = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _base = null;
public ir.parsikhesab.pakhsh.b4xsearchtemplate _searchtemplate = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlgrid = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel1 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnaz = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnta = null;
public static String _dateaz = "";
public static String _dateta = "";
public anywheresoftware.b4a.objects.collections.List _lstreport = null;
public static long[] _titlereport = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_selvisitor = null;
public wir.hitex.recycler.Hitex_LayoutView _hlv = null;
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
RDebugUtils.currentModule="act_repfactorvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=59965440;
 //BA.debugLineNum = 59965440;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=59965441;
 //BA.debugLineNum = 59965441;BA.debugLine="Activity.LoadLayout(\"l_repfactorvisitor\")";
mostCurrent._activity.LoadLayout("l_repfactorvisitor",mostCurrent.activityBA);
RDebugUtils.currentLine=59965442;
 //BA.debugLineNum = 59965442;BA.debugLine="LstReport.Initialize";
mostCurrent._lstreport.Initialize();
RDebugUtils.currentLine=59965443;
 //BA.debugLineNum = 59965443;BA.debugLine="Base = Activity";
mostCurrent._base = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(mostCurrent._activity.getObject()));
RDebugUtils.currentLine=59965444;
 //BA.debugLineNum = 59965444;BA.debugLine="Dialog.Initialize (Panel1)";
mostCurrent._dialog._initialize /*String*/ (null,mostCurrent.activityBA,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(mostCurrent._panel1.getObject())));
RDebugUtils.currentLine=59965445;
 //BA.debugLineNum = 59965445;BA.debugLine="Dialog.Title = \"جستجو\"";
mostCurrent._dialog._title /*Object*/  = (Object)("جستجو");
RDebugUtils.currentLine=59965446;
 //BA.debugLineNum = 59965446;BA.debugLine="SearchTemplate.Initialize";
mostCurrent._searchtemplate._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=59965447;
 //BA.debugLineNum = 59965447;BA.debugLine="MCode.page=\"Act_RepFactorVisitor\"";
mostCurrent._mcode._page /*String*/  = "Act_RepFactorVisitor";
RDebugUtils.currentLine=59965448;
 //BA.debugLineNum = 59965448;BA.debugLine="MCode.NoeGet=\"GetVisitor\"";
mostCurrent._mcode._noeget /*String*/  = "GetVisitor";
RDebugUtils.currentLine=59965449;
 //BA.debugLineNum = 59965449;BA.debugLine="StartService(Service_Server)";
anywheresoftware.b4a.keywords.Common.StartService(processBA,(Object)(mostCurrent._service_server.getObject()));
RDebugUtils.currentLine=59965450;
 //BA.debugLineNum = 59965450;BA.debugLine="MCode.CodeVisitorSelect=0";
mostCurrent._mcode._codevisitorselect /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=59965451;
 //BA.debugLineNum = 59965451;BA.debugLine="End Sub";
return "";
}
public static boolean  _activity_keypress(int _keycode) throws Exception{
RDebugUtils.currentModule="act_repfactorvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_keypress", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "activity_keypress", new Object[] {_keycode}));}
RDebugUtils.currentLine=60489728;
 //BA.debugLineNum = 60489728;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
RDebugUtils.currentLine=60489729;
 //BA.debugLineNum = 60489729;BA.debugLine="If KeyCode=KeyCodes.KEYCODE_BACK Then";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK) { 
RDebugUtils.currentLine=60489730;
 //BA.debugLineNum = 60489730;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 }else {
RDebugUtils.currentLine=60489732;
 //BA.debugLineNum = 60489732;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 };
RDebugUtils.currentLine=60489734;
 //BA.debugLineNum = 60489734;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=60489735;
 //BA.debugLineNum = 60489735;BA.debugLine="End Sub";
return false;
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="act_repfactorvisitor";
RDebugUtils.currentLine=60424192;
 //BA.debugLineNum = 60424192;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=60424194;
 //BA.debugLineNum = 60424194;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="act_repfactorvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=60358656;
 //BA.debugLineNum = 60358656;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=60358657;
 //BA.debugLineNum = 60358657;BA.debugLine="BtnReport_Click";
_btnreport_click();
RDebugUtils.currentLine=60358658;
 //BA.debugLineNum = 60358658;BA.debugLine="End Sub";
return "";
}
public static String  _btnreport_click() throws Exception{
RDebugUtils.currentModule="act_repfactorvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnreport_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnreport_click", null));}
RDebugUtils.currentLine=60555264;
 //BA.debugLineNum = 60555264;BA.debugLine="Sub BtnReport_Click";
RDebugUtils.currentLine=60555265;
 //BA.debugLineNum = 60555265;BA.debugLine="If MCode.Sf.Len(BtnAz.Tag) = 8 And MCode.Sf.Len(B";
if (mostCurrent._mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvv1(BA.ObjectToString(mostCurrent._btnaz.getTag()))==8 && mostCurrent._mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvv1(BA.ObjectToString(mostCurrent._btnta.getTag()))==8) { 
RDebugUtils.currentLine=60555266;
 //BA.debugLineNum = 60555266;BA.debugLine="ProgressDialogShow2(\"در حال دریافت اطلاعات . . .";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(mostCurrent.activityBA,BA.ObjectToCharSequence("در حال دریافت اطلاعات . . ."),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=60555268;
 //BA.debugLineNum = 60555268;BA.debugLine="CallSubDelayed3(Service_Server,\"GetReportFactorV";
anywheresoftware.b4a.keywords.Common.CallSubDelayed3(processBA,(Object)(mostCurrent._service_server.getObject()),"GetReportFactorVisitor",(Object)(mostCurrent._mcode._convertnumberspersian2english /*String*/ (mostCurrent.activityBA,mostCurrent._dateaz)),(Object)(mostCurrent._mcode._convertnumberspersian2english /*String*/ (mostCurrent.activityBA,mostCurrent._dateta)));
 }else {
RDebugUtils.currentLine=60555270;
 //BA.debugLineNum = 60555270;BA.debugLine="ToastMessageShow(\"تاریخ را به طور صحیح وارد نمای";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("تاریخ را به طور صحیح وارد نمایید"),anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=60555272;
 //BA.debugLineNum = 60555272;BA.debugLine="End Sub";
return "";
}
public static String  _animatedialog(ir.parsikhesab.pakhsh.b4xdialog _dlg,String _fromedge) throws Exception{
RDebugUtils.currentModule="act_repfactorvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "animatedialog", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "animatedialog", new Object[] {_dlg,_fromedge}));}
int _top = 0;
int _left = 0;
RDebugUtils.currentLine=61276160;
 //BA.debugLineNum = 61276160;BA.debugLine="Sub AnimateDialog (dlg As B4XDialog, FromEdge As S";
RDebugUtils.currentLine=61276161;
 //BA.debugLineNum = 61276161;BA.debugLine="Dim Base As B4XView = dlg.Base";
mostCurrent._base = new anywheresoftware.b4a.objects.B4XViewWrapper();
mostCurrent._base = _dlg._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=61276162;
 //BA.debugLineNum = 61276162;BA.debugLine="Dim top As Int = Base.Top";
_top = mostCurrent._base.getTop();
RDebugUtils.currentLine=61276163;
 //BA.debugLineNum = 61276163;BA.debugLine="Dim left As Int = Base.Left";
_left = mostCurrent._base.getLeft();
RDebugUtils.currentLine=61276164;
 //BA.debugLineNum = 61276164;BA.debugLine="Select FromEdge.ToLowerCase";
switch (BA.switchObjectToInt(_fromedge.toLowerCase(),"bottom","top","left","right")) {
case 0: {
RDebugUtils.currentLine=61276166;
 //BA.debugLineNum = 61276166;BA.debugLine="Base.Top = Base.Parent.Height";
mostCurrent._base.setTop(mostCurrent._base.getParent().getHeight());
 break; }
case 1: {
RDebugUtils.currentLine=61276168;
 //BA.debugLineNum = 61276168;BA.debugLine="Base.Top = -Base.Height";
mostCurrent._base.setTop((int) (-mostCurrent._base.getHeight()));
 break; }
case 2: {
RDebugUtils.currentLine=61276170;
 //BA.debugLineNum = 61276170;BA.debugLine="Base.Left = -Base.Width";
mostCurrent._base.setLeft((int) (-mostCurrent._base.getWidth()));
 break; }
case 3: {
RDebugUtils.currentLine=61276172;
 //BA.debugLineNum = 61276172;BA.debugLine="Base.Left = Base.Parent.Width";
mostCurrent._base.setLeft(mostCurrent._base.getParent().getWidth());
 break; }
}
;
RDebugUtils.currentLine=61276174;
 //BA.debugLineNum = 61276174;BA.debugLine="Base.SetLayoutAnimated(300, left, top, Base.Width";
mostCurrent._base.SetLayoutAnimated((int) (300),_left,_top,mostCurrent._base.getWidth(),mostCurrent._base.getHeight());
RDebugUtils.currentLine=61276175;
 //BA.debugLineNum = 61276175;BA.debugLine="End Sub";
return "";
}
public static boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
RDebugUtils.currentModule="act_repfactorvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "application_error", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "application_error", new Object[] {_error,_stacktrace}));}
RDebugUtils.currentLine=61407232;
 //BA.debugLineNum = 61407232;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
RDebugUtils.currentLine=61407234;
 //BA.debugLineNum = 61407234;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=61407235;
 //BA.debugLineNum = 61407235;BA.debugLine="End Sub";
return false;
}
public static void  _btn_selvisitor_click() throws Exception{
RDebugUtils.currentModule="act_repfactorvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_selvisitor_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "btn_selvisitor_click", null); return;}
ResumableSub_Btn_SelVisitor_Click rsub = new ResumableSub_Btn_SelVisitor_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Btn_SelVisitor_Click extends BA.ResumableSub {
public ResumableSub_Btn_SelVisitor_Click(ir.parsikhesab.pakhsh.act_repfactorvisitor parent) {
this.parent = parent;
}
ir.parsikhesab.pakhsh.act_repfactorvisitor parent;
Object _rs = null;
int _result = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_repfactorvisitor";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=61210627;
 //BA.debugLineNum = 61210627;BA.debugLine="Panel1.BringToFront";
parent.mostCurrent._panel1.BringToFront();
RDebugUtils.currentLine=61210628;
 //BA.debugLineNum = 61210628;BA.debugLine="Panel1.Visible=True";
parent.mostCurrent._panel1.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=61210629;
 //BA.debugLineNum = 61210629;BA.debugLine="SearchTemplate.SearchField.HintText=\"نام ویزیتور\"";
parent.mostCurrent._searchtemplate._searchfield /*ir.parsikhesab.pakhsh.b4xfloattextfield*/ ._hinttext /*String*/  = "نام ویزیتور";
RDebugUtils.currentLine=61210630;
 //BA.debugLineNum = 61210630;BA.debugLine="SearchTemplate.SearchField.lblClear.Text=\"\"";
parent.mostCurrent._searchtemplate._searchfield /*ir.parsikhesab.pakhsh.b4xfloattextfield*/ ._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=61210631;
 //BA.debugLineNum = 61210631;BA.debugLine="SearchTemplate.SearchField.lblV.Text=\"\"";
parent.mostCurrent._searchtemplate._searchfield /*ir.parsikhesab.pakhsh.b4xfloattextfield*/ ._lblv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=61210632;
 //BA.debugLineNum = 61210632;BA.debugLine="SearchTemplate.SearchField.Update";
parent.mostCurrent._searchtemplate._searchfield /*ir.parsikhesab.pakhsh.b4xfloattextfield*/ ._update /*String*/ (null);
RDebugUtils.currentLine=61210633;
 //BA.debugLineNum = 61210633;BA.debugLine="Dim rs As Object = Dialog.ShowTemplate(SearchTemp";
_rs = parent.mostCurrent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(parent.mostCurrent._searchtemplate),(Object)(""),(Object)(""),(Object)("انصراف"));
RDebugUtils.currentLine=61210634;
 //BA.debugLineNum = 61210634;BA.debugLine="AnimateDialog(Dialog, \"right\")";
_animatedialog(parent.mostCurrent._dialog,"right");
RDebugUtils.currentLine=61210635;
 //BA.debugLineNum = 61210635;BA.debugLine="Wait For (rs) Complete (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_repfactorvisitor", "btn_selvisitor_click"), _rs);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=61210636;
 //BA.debugLineNum = 61210636;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=61210637;
 //BA.debugLineNum = 61210637;BA.debugLine="Btn_SelVisitor.Text = SearchTemplate.SelectedIte";
parent.mostCurrent._btn_selvisitor.setText(BA.ObjectToCharSequence(parent.mostCurrent._searchtemplate._selecteditem /*String*/ ));
RDebugUtils.currentLine=61210638;
 //BA.debugLineNum = 61210638;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From T";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = parent.mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblVisitor where FldN_Visitor='"+parent.mostCurrent._btn_selvisitor.getText()+"'");
RDebugUtils.currentLine=61210639;
 //BA.debugLineNum = 61210639;BA.debugLine="Cu.Position=0";
_cu.setPosition((int) (0));
RDebugUtils.currentLine=61210640;
 //BA.debugLineNum = 61210640;BA.debugLine="MCode.CodeVisitorSelect =  Cu.GetString(\"FldC_Vi";
parent.mostCurrent._mcode._codevisitorselect /*String*/  = _cu.GetString("FldC_Visitor");
RDebugUtils.currentLine=61210641;
 //BA.debugLineNum = 61210641;BA.debugLine="Log(\"کد ویزیتور : \"&Cu.GetString(\"FldC_Visitor\")";
anywheresoftware.b4a.keywords.Common.LogImpl("561210641","کد ویزیتور : "+_cu.GetString("FldC_Visitor"),0);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=61210643;
 //BA.debugLineNum = 61210643;BA.debugLine="Btn_SelVisitor.Text = \"انتخاب ویزیتور\"";
parent.mostCurrent._btn_selvisitor.setText(BA.ObjectToCharSequence("انتخاب ویزیتور"));
RDebugUtils.currentLine=61210644;
 //BA.debugLineNum = 61210644;BA.debugLine="MCode.CodeVisitorSelect=0";
parent.mostCurrent._mcode._codevisitorselect /*String*/  = BA.NumberToString(0);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=61210646;
 //BA.debugLineNum = 61210646;BA.debugLine="Panel1.Visible=False";
parent.mostCurrent._panel1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=61210647;
 //BA.debugLineNum = 61210647;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _btnaz_click() throws Exception{
RDebugUtils.currentModule="act_repfactorvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnaz_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnaz_click", null));}
com.porya.datetimepicker.PersianMaterialDatePickerWrapper _p = null;
RDebugUtils.currentLine=60686336;
 //BA.debugLineNum = 60686336;BA.debugLine="Sub BtnAz_Click";
RDebugUtils.currentLine=60686337;
 //BA.debugLineNum = 60686337;BA.debugLine="Dim p As PersianMaterialDatePicker";
_p = new com.porya.datetimepicker.PersianMaterialDatePickerWrapper();
RDebugUtils.currentLine=60686338;
 //BA.debugLineNum = 60686338;BA.debugLine="p.Initialize(\"p\",p.PersianYear,p.PersianMonth,p.P";
_p.Initialize(mostCurrent.activityBA,"p",_p.getPersianYear(),_p.getPersianMonth(),_p.getPersianDay());
RDebugUtils.currentLine=60686339;
 //BA.debugLineNum = 60686339;BA.debugLine="p.AccentColor = Colors.RGB(83,99,255)";
_p.setAccentColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (83),(int) (99),(int) (255)));
RDebugUtils.currentLine=60686340;
 //BA.debugLineNum = 60686340;BA.debugLine="p.OkText = \"تایید\"";
_p.setOkText("تایید");
RDebugUtils.currentLine=60686341;
 //BA.debugLineNum = 60686341;BA.debugLine="p.CancelText = \"لغو\"";
_p.setCancelText("لغو");
RDebugUtils.currentLine=60686342;
 //BA.debugLineNum = 60686342;BA.debugLine="p.Title = \"از تاریخ\"";
_p.setTitle("از تاریخ");
RDebugUtils.currentLine=60686343;
 //BA.debugLineNum = 60686343;BA.debugLine="p.Typeface = \"iransansmobile(fanum)_bold.ttf\"";
_p.setTypeface("iransansmobile(fanum)_bold.ttf");
RDebugUtils.currentLine=60686344;
 //BA.debugLineNum = 60686344;BA.debugLine="p.Show(\"p\")";
_p.Show("p");
RDebugUtils.currentLine=60686345;
 //BA.debugLineNum = 60686345;BA.debugLine="End Sub";
return "";
}
public static String  _btnta_click() throws Exception{
RDebugUtils.currentModule="act_repfactorvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnta_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnta_click", null));}
com.porya.datetimepicker.PersianMaterialDatePickerWrapper _p1 = null;
RDebugUtils.currentLine=60817408;
 //BA.debugLineNum = 60817408;BA.debugLine="Sub BtnTa_Click";
RDebugUtils.currentLine=60817409;
 //BA.debugLineNum = 60817409;BA.debugLine="Dim p1 As PersianMaterialDatePicker";
_p1 = new com.porya.datetimepicker.PersianMaterialDatePickerWrapper();
RDebugUtils.currentLine=60817410;
 //BA.debugLineNum = 60817410;BA.debugLine="p1.Initialize(\"p1\",p1.PersianYear,p1.PersianMonth";
_p1.Initialize(mostCurrent.activityBA,"p1",_p1.getPersianYear(),_p1.getPersianMonth(),_p1.getPersianDay());
RDebugUtils.currentLine=60817411;
 //BA.debugLineNum = 60817411;BA.debugLine="p1.AccentColor = Colors.RGB(83,99,255)";
_p1.setAccentColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (83),(int) (99),(int) (255)));
RDebugUtils.currentLine=60817412;
 //BA.debugLineNum = 60817412;BA.debugLine="p1.OkText = \"تایید\"";
_p1.setOkText("تایید");
RDebugUtils.currentLine=60817413;
 //BA.debugLineNum = 60817413;BA.debugLine="p1.CancelText = \"لغو\"";
_p1.setCancelText("لغو");
RDebugUtils.currentLine=60817414;
 //BA.debugLineNum = 60817414;BA.debugLine="p1.Title = \"تا تاریخ\"";
_p1.setTitle("تا تاریخ");
RDebugUtils.currentLine=60817415;
 //BA.debugLineNum = 60817415;BA.debugLine="p1.Typeface = \"iransansmobile(fanum)_bold.ttf\"";
_p1.setTypeface("iransansmobile(fanum)_bold.ttf");
RDebugUtils.currentLine=60817416;
 //BA.debugLineNum = 60817416;BA.debugLine="p1.Show(\"p1\")";
_p1.Show("p1");
RDebugUtils.currentLine=60817417;
 //BA.debugLineNum = 60817417;BA.debugLine="End Sub";
return "";
}
public static String  _creategrid() throws Exception{
RDebugUtils.currentModule="act_repfactorvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "creategrid", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "creategrid", null));}
RDebugUtils.currentLine=60096512;
 //BA.debugLineNum = 60096512;BA.debugLine="Sub CreateGrid";
RDebugUtils.currentLine=60096531;
 //BA.debugLineNum = 60096531;BA.debugLine="End Sub";
return "";
}
public static String  _createlist(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
RDebugUtils.currentModule="act_repfactorvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createlist", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "createlist", new Object[] {_lst}));}
anywheresoftware.b4a.objects.collections.Map _coljroot = null;
ir.parsikhesab.pakhsh.mcode._adapterepfactorvisitor _item = null;
RDebugUtils.currentLine=60620800;
 //BA.debugLineNum = 60620800;BA.debugLine="Sub CreateList(Lst As List)";
RDebugUtils.currentLine=60620801;
 //BA.debugLineNum = 60620801;BA.debugLine="LstReport.Clear";
mostCurrent._lstreport.Clear();
RDebugUtils.currentLine=60620802;
 //BA.debugLineNum = 60620802;BA.debugLine="TitleReport(0) = 0";
_titlereport[(int) (0)] = (long) (0);
RDebugUtils.currentLine=60620803;
 //BA.debugLineNum = 60620803;BA.debugLine="TitleReport(1) = 0";
_titlereport[(int) (1)] = (long) (0);
RDebugUtils.currentLine=60620804;
 //BA.debugLineNum = 60620804;BA.debugLine="TitleReport(2) = 0";
_titlereport[(int) (2)] = (long) (0);
RDebugUtils.currentLine=60620806;
 //BA.debugLineNum = 60620806;BA.debugLine="For Each coljRoot As Map In Lst";
_coljroot = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group5 = _lst;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_coljroot = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group5.Get(index5)));
RDebugUtils.currentLine=60620807;
 //BA.debugLineNum = 60620807;BA.debugLine="Dim Item As AdapteRepFactorVisitor";
_item = new ir.parsikhesab.pakhsh.mcode._adapterepfactorvisitor();
RDebugUtils.currentLine=60620808;
 //BA.debugLineNum = 60620808;BA.debugLine="Item.fldShomareFactor =  coljRoot.Get(\"fldShomar";
_item.fldShomareFactor /*String*/  = BA.ObjectToString(_coljroot.Get((Object)("fldShomareFactor")));
RDebugUtils.currentLine=60620809;
 //BA.debugLineNum = 60620809;BA.debugLine="Item.fldCodeVasete = coljRoot.Get(\"fldCodeVasete";
_item.fldCodeVasete /*String*/  = BA.ObjectToString(_coljroot.Get((Object)("fldCodeVasete")));
RDebugUtils.currentLine=60620810;
 //BA.debugLineNum = 60620810;BA.debugLine="Item.FldN_Visitor =coljRoot.Get(\"FldN_Visitor\")";
_item.FldN_Visitor /*String*/  = BA.ObjectToString(_coljroot.Get((Object)("FldN_Visitor")));
RDebugUtils.currentLine=60620811;
 //BA.debugLineNum = 60620811;BA.debugLine="Item.fldDate =coljRoot.Get(\"fldDate\")";
_item.fldDate /*String*/  = BA.ObjectToString(_coljroot.Get((Object)("fldDate")));
RDebugUtils.currentLine=60620812;
 //BA.debugLineNum = 60620812;BA.debugLine="Item.fldTime =coljRoot.Get(\"fldTime\")";
_item.fldTime /*String*/  = BA.ObjectToString(_coljroot.Get((Object)("fldTime")));
RDebugUtils.currentLine=60620824;
 //BA.debugLineNum = 60620824;BA.debugLine="If coljRoot.Get(\"fldNahveTasvie\")<>\"0\" Then";
if ((_coljroot.Get((Object)("fldNahveTasvie"))).equals((Object)("0")) == false) { 
RDebugUtils.currentLine=60620825;
 //BA.debugLineNum = 60620825;BA.debugLine="Item.fldNahveTasvie=MCode.GetNahvieTasfie(coljR";
_item.fldNahveTasvie /*String*/  = mostCurrent._mcode._getnahvietasfie /*String*/ (mostCurrent.activityBA,BA.ObjectToString(_coljroot.Get((Object)("fldNahveTasvie"))));
 }else {
RDebugUtils.currentLine=60620827;
 //BA.debugLineNum = 60620827;BA.debugLine="Item.fldNahveTasvie=\"نامشخص\"";
_item.fldNahveTasvie /*String*/  = "نامشخص";
 };
RDebugUtils.currentLine=60620830;
 //BA.debugLineNum = 60620830;BA.debugLine="Item.fldCodeTafsili =coljRoot.Get(\"fldCodeTafsil";
_item.fldCodeTafsili /*String*/  = BA.ObjectToString(_coljroot.Get((Object)("fldCodeTafsili")));
RDebugUtils.currentLine=60620831;
 //BA.debugLineNum = 60620831;BA.debugLine="Item.fldSharheTafzili =coljRoot.Get(\"fldSharheTa";
_item.fldSharheTafzili /*String*/  = BA.ObjectToString(_coljroot.Get((Object)("fldSharheTafzili")));
RDebugUtils.currentLine=60620832;
 //BA.debugLineNum = 60620832;BA.debugLine="Item.fldTozihat =coljRoot.Get(\"fldTozihat\")";
_item.fldTozihat /*String*/  = BA.ObjectToString(_coljroot.Get((Object)("fldTozihat")));
RDebugUtils.currentLine=60620839;
 //BA.debugLineNum = 60620839;BA.debugLine="Item.fldShomareFactorReal =coljRoot.Get(\"fldShom";
_item.fldShomareFactorReal /*String*/  = BA.ObjectToString(_coljroot.Get((Object)("fldShomareFactorReal")));
RDebugUtils.currentLine=60620842;
 //BA.debugLineNum = 60620842;BA.debugLine="LstReport.Add(Item)";
mostCurrent._lstreport.Add((Object)(_item));
 }
};
RDebugUtils.currentLine=60620863;
 //BA.debugLineNum = 60620863;BA.debugLine="LstReport.SortType(\"fldShomareFactor\",False)";
mostCurrent._lstreport.SortType("fldShomareFactor",anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=60620865;
 //BA.debugLineNum = 60620865;BA.debugLine="HLV.Show";
mostCurrent._hlv.Show();
RDebugUtils.currentLine=60620867;
 //BA.debugLineNum = 60620867;BA.debugLine="End Sub";
return "";
}
public static int  _hlv_getitemcount() throws Exception{
RDebugUtils.currentModule="act_repfactorvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "hlv_getitemcount", false))
	 {return ((Integer) Debug.delegate(mostCurrent.activityBA, "hlv_getitemcount", null));}
RDebugUtils.currentLine=60293120;
 //BA.debugLineNum = 60293120;BA.debugLine="Sub HLV_GetItemCount As Int 								        '$ Ite";
RDebugUtils.currentLine=60293121;
 //BA.debugLineNum = 60293121;BA.debugLine="Return LstReport.Size";
if (true) return mostCurrent._lstreport.getSize();
RDebugUtils.currentLine=60293122;
 //BA.debugLineNum = 60293122;BA.debugLine="End Sub";
return 0;
}
public static String  _hlv_onbindviewholder(anywheresoftware.b4a.objects.PanelWrapper _parent,int _position) throws Exception{
RDebugUtils.currentModule="act_repfactorvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "hlv_onbindviewholder", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "hlv_onbindviewholder", new Object[] {_parent,_position}));}
ir.parsikhesab.pakhsh.mcode._adapterepfactorvisitor _item = null;
ir.parsikhesab.pakhsh.cls_rec_factorvisitor _rec = null;
RDebugUtils.currentLine=60227584;
 //BA.debugLineNum = 60227584;BA.debugLine="Sub HLV_onBindViewHolder (Parent As Panel, Positio";
RDebugUtils.currentLine=60227585;
 //BA.debugLineNum = 60227585;BA.debugLine="Dim Item = LstReport.Get(Position) As AdapteRepFa";
_item = (ir.parsikhesab.pakhsh.mcode._adapterepfactorvisitor)(mostCurrent._lstreport.Get(_position));
RDebugUtils.currentLine=60227586;
 //BA.debugLineNum = 60227586;BA.debugLine="Dim rec As Cls_Rec_FactorVisitor=Parent.Tag";
_rec = (ir.parsikhesab.pakhsh.cls_rec_factorvisitor)(_parent.getTag());
RDebugUtils.currentLine=60227587;
 //BA.debugLineNum = 60227587;BA.debugLine="rec.Show(Item)";
_rec._show /*String*/ (null,_item);
RDebugUtils.currentLine=60227588;
 //BA.debugLineNum = 60227588;BA.debugLine="Parent.Height=rec.Height";
_parent.setHeight(_rec._getheight /*int*/ (null));
RDebugUtils.currentLine=60227589;
 //BA.debugLineNum = 60227589;BA.debugLine="End Sub";
return "";
}
public static String  _hlv_oncreateviewholder(anywheresoftware.b4a.objects.PanelWrapper _parent,int _viewtype) throws Exception{
RDebugUtils.currentModule="act_repfactorvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "hlv_oncreateviewholder", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "hlv_oncreateviewholder", new Object[] {_parent,_viewtype}));}
ir.parsikhesab.pakhsh.cls_rec_factorvisitor _rec = null;
RDebugUtils.currentLine=60162048;
 //BA.debugLineNum = 60162048;BA.debugLine="Sub HLV_onCreateViewHolder (Parent As Panel, ViewT";
RDebugUtils.currentLine=60162049;
 //BA.debugLineNum = 60162049;BA.debugLine="Dim rec As Cls_Rec_FactorVisitor";
_rec = new ir.parsikhesab.pakhsh.cls_rec_factorvisitor();
RDebugUtils.currentLine=60162050;
 //BA.debugLineNum = 60162050;BA.debugLine="rec.Initialize(Me)";
_rec._initialize /*String*/ (null,mostCurrent.activityBA,act_repfactorvisitor.getObject());
RDebugUtils.currentLine=60162051;
 //BA.debugLineNum = 60162051;BA.debugLine="Parent.AddView(rec.Panel,0,0,100%x,rec.Height)";
_parent.AddView((android.view.View)(_rec._getpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ (null).getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),_rec._getheight /*int*/ (null));
RDebugUtils.currentLine=60162052;
 //BA.debugLineNum = 60162052;BA.debugLine="Parent.Tag=rec";
_parent.setTag((Object)(_rec));
RDebugUtils.currentLine=60162053;
 //BA.debugLineNum = 60162053;BA.debugLine="End Sub";
return "";
}
public static String  _img_chart_click() throws Exception{
RDebugUtils.currentModule="act_repfactorvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "img_chart_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "img_chart_click", null));}
RDebugUtils.currentLine=61341696;
 //BA.debugLineNum = 61341696;BA.debugLine="Sub Img_Chart_Click";
RDebugUtils.currentLine=61341699;
 //BA.debugLineNum = 61341699;BA.debugLine="End Sub";
return "";
}
public static String  _img_sort_click() throws Exception{
RDebugUtils.currentModule="act_repfactorvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "img_sort_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "img_sort_click", null));}
anywheresoftware.b4a.objects.collections.List _lst = null;
int _res = 0;
RDebugUtils.currentLine=61145088;
 //BA.debugLineNum = 61145088;BA.debugLine="Sub Img_Sort_Click";
RDebugUtils.currentLine=61145089;
 //BA.debugLineNum = 61145089;BA.debugLine="Dim Lst As List = Array As String(\"مبلغ کم به زیا";
_lst = new anywheresoftware.b4a.objects.collections.List();
_lst = anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"مبلغ کم به زیاد","مبلغ زیاد به کم"});
RDebugUtils.currentLine=61145090;
 //BA.debugLineNum = 61145090;BA.debugLine="Dim res As Int = InputList(Lst,\"مرتب سازی براساس:";
_res = anywheresoftware.b4a.keywords.Common.InputList(_lst,BA.ObjectToCharSequence("مرتب سازی براساس:"),(int) (-1),mostCurrent.activityBA);
RDebugUtils.currentLine=61145091;
 //BA.debugLineNum = 61145091;BA.debugLine="Select Case res";
switch (_res) {
case 0: {
RDebugUtils.currentLine=61145093;
 //BA.debugLineNum = 61145093;BA.debugLine="LstReport.SortType(\"fldFeeJoz\",False)";
mostCurrent._lstreport.SortType("fldFeeJoz",anywheresoftware.b4a.keywords.Common.False);
 break; }
case 1: {
RDebugUtils.currentLine=61145095;
 //BA.debugLineNum = 61145095;BA.debugLine="LstReport.SortType(\"fldFeeJoz\",True)";
mostCurrent._lstreport.SortType("fldFeeJoz",anywheresoftware.b4a.keywords.Common.True);
 break; }
}
;
RDebugUtils.currentLine=61145097;
 //BA.debugLineNum = 61145097;BA.debugLine="ProgressDialogShow(\"لطفا چند لحظه صبر کنید\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("لطفا چند لحظه صبر کنید"));
RDebugUtils.currentLine=61145098;
 //BA.debugLineNum = 61145098;BA.debugLine="CreateGrid";
_creategrid();
RDebugUtils.currentLine=61145099;
 //BA.debugLineNum = 61145099;BA.debugLine="End Sub";
return "";
}
public static String  _lblback_click() throws Exception{
RDebugUtils.currentModule="act_repfactorvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lblback_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lblback_click", null));}
RDebugUtils.currentLine=61079552;
 //BA.debugLineNum = 61079552;BA.debugLine="Sub LblBack_Click";
RDebugUtils.currentLine=61079553;
 //BA.debugLineNum = 61079553;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=61079554;
 //BA.debugLineNum = 61079554;BA.debugLine="End Sub";
return "";
}
public static String  _loaddata() throws Exception{
RDebugUtils.currentModule="act_repfactorvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "loaddata", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "loaddata", null));}
anywheresoftware.b4a.objects.collections.List _items = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
int _i = 0;
String _name = "";
RDebugUtils.currentLine=60030976;
 //BA.debugLineNum = 60030976;BA.debugLine="Public Sub LoadData";
RDebugUtils.currentLine=60030977;
 //BA.debugLineNum = 60030977;BA.debugLine="MCode.page=\"Act_RepFactorVisitor\"";
mostCurrent._mcode._page /*String*/  = "Act_RepFactorVisitor";
RDebugUtils.currentLine=60030978;
 //BA.debugLineNum = 60030978;BA.debugLine="Dim Items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=60030979;
 //BA.debugLineNum = 60030979;BA.debugLine="Items.Initialize";
_items.Initialize();
RDebugUtils.currentLine=60030980;
 //BA.debugLineNum = 60030980;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From Tb";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblVisitor ");
RDebugUtils.currentLine=60030981;
 //BA.debugLineNum = 60030981;BA.debugLine="For i=0 To Cu.RowCount-1";
{
final int step5 = 1;
final int limit5 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=60030982;
 //BA.debugLineNum = 60030982;BA.debugLine="Cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=60030983;
 //BA.debugLineNum = 60030983;BA.debugLine="Dim Name As String =  Cu.GetString(\"FldN_Visitor";
_name = _cu.GetString("FldN_Visitor");
RDebugUtils.currentLine=60030984;
 //BA.debugLineNum = 60030984;BA.debugLine="Items.Add(Name)";
_items.Add((Object)(_name));
 }
};
RDebugUtils.currentLine=60030986;
 //BA.debugLineNum = 60030986;BA.debugLine="SearchTemplate.SetItems(Items)";
mostCurrent._searchtemplate._setitems /*Object*/ (null,_items);
RDebugUtils.currentLine=60030987;
 //BA.debugLineNum = 60030987;BA.debugLine="SearchTemplate.GetPanel(Dialog).BringToFront";
mostCurrent._searchtemplate._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,mostCurrent._dialog).BringToFront();
RDebugUtils.currentLine=60030989;
 //BA.debugLineNum = 60030989;BA.debugLine="HLV.Initializer(\"HLV\").ListView.Build";
mostCurrent._hlv.Initializer(mostCurrent.activityBA,"HLV").ListView().Build();
RDebugUtils.currentLine=60030990;
 //BA.debugLineNum = 60030990;BA.debugLine="PnlGrid.AddView(HLV,0,0,PnlGrid.Width,PnlGrid.Hei";
mostCurrent._pnlgrid.AddView((android.view.View)(mostCurrent._hlv.getObject()),(int) (0),(int) (0),mostCurrent._pnlgrid.getWidth(),mostCurrent._pnlgrid.getHeight());
RDebugUtils.currentLine=60030991;
 //BA.debugLineNum = 60030991;BA.debugLine="End Sub";
return "";
}
public static String  _p_ondateset(int _year,int _month,int _day) throws Exception{
RDebugUtils.currentModule="act_repfactorvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "p_ondateset", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "p_ondateset", new Object[] {_year,_month,_day}));}
RDebugUtils.currentLine=60751872;
 //BA.debugLineNum = 60751872;BA.debugLine="Sub p_onDateSet(year As Int,month As Int,day As In";
RDebugUtils.currentLine=60751873;
 //BA.debugLineNum = 60751873;BA.debugLine="Log(year&\"/\"&month&\"/\"&day)";
anywheresoftware.b4a.keywords.Common.LogImpl("560751873",BA.NumberToString(_year)+"/"+BA.NumberToString(_month)+"/"+BA.NumberToString(_day),0);
RDebugUtils.currentLine=60751874;
 //BA.debugLineNum = 60751874;BA.debugLine="BtnAz.Text=year&\"/\"&NumberFormat(month,2,0)&\"/\"&N";
mostCurrent._btnaz.setText(BA.ObjectToCharSequence(BA.NumberToString(_year)+"/"+anywheresoftware.b4a.keywords.Common.NumberFormat(_month,(int) (2),(int) (0))+"/"+anywheresoftware.b4a.keywords.Common.NumberFormat(_day,(int) (2),(int) (0))));
RDebugUtils.currentLine=60751875;
 //BA.debugLineNum = 60751875;BA.debugLine="BtnAz.Tag =year&NumberFormat(day,2,0)&NumberForma";
mostCurrent._btnaz.setTag((Object)(BA.NumberToString(_year)+anywheresoftware.b4a.keywords.Common.NumberFormat(_day,(int) (2),(int) (0))+anywheresoftware.b4a.keywords.Common.NumberFormat(_month,(int) (2),(int) (0))));
RDebugUtils.currentLine=60751879;
 //BA.debugLineNum = 60751879;BA.debugLine="DateAz=year&NumberFormat(month,2,0)&NumberFormat(";
mostCurrent._dateaz = BA.NumberToString(_year)+anywheresoftware.b4a.keywords.Common.NumberFormat(_month,(int) (2),(int) (0))+anywheresoftware.b4a.keywords.Common.NumberFormat(_day,(int) (2),(int) (0));
RDebugUtils.currentLine=60751880;
 //BA.debugLineNum = 60751880;BA.debugLine="LogColor(DateAz,Colors.Magenta)";
anywheresoftware.b4a.keywords.Common.LogImpl("560751880",mostCurrent._dateaz,anywheresoftware.b4a.keywords.Common.Colors.Magenta);
RDebugUtils.currentLine=60751881;
 //BA.debugLineNum = 60751881;BA.debugLine="End Sub";
return "";
}
public static String  _p1_oncancel() throws Exception{
RDebugUtils.currentModule="act_repfactorvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "p1_oncancel", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "p1_oncancel", null));}
RDebugUtils.currentLine=60948480;
 //BA.debugLineNum = 60948480;BA.debugLine="Sub p1_onCancel";
RDebugUtils.currentLine=60948481;
 //BA.debugLineNum = 60948481;BA.debugLine="Log(\"cancel\")";
anywheresoftware.b4a.keywords.Common.LogImpl("560948481","cancel",0);
RDebugUtils.currentLine=60948482;
 //BA.debugLineNum = 60948482;BA.debugLine="End Sub";
return "";
}
public static String  _p1_ondateset(int _year,int _month,int _day) throws Exception{
RDebugUtils.currentModule="act_repfactorvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "p1_ondateset", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "p1_ondateset", new Object[] {_year,_month,_day}));}
RDebugUtils.currentLine=60882944;
 //BA.debugLineNum = 60882944;BA.debugLine="Sub p1_onDateSet(year As Int,month As Int,day As I";
RDebugUtils.currentLine=60882945;
 //BA.debugLineNum = 60882945;BA.debugLine="Log(year&\"/\"&month&\"/\"&day)";
anywheresoftware.b4a.keywords.Common.LogImpl("560882945",BA.NumberToString(_year)+"/"+BA.NumberToString(_month)+"/"+BA.NumberToString(_day),0);
RDebugUtils.currentLine=60882946;
 //BA.debugLineNum = 60882946;BA.debugLine="BtnTa.Text=year&\"/\"&NumberFormat(month,2,0)&\"/\"&N";
mostCurrent._btnta.setText(BA.ObjectToCharSequence(BA.NumberToString(_year)+"/"+anywheresoftware.b4a.keywords.Common.NumberFormat(_month,(int) (2),(int) (0))+"/"+anywheresoftware.b4a.keywords.Common.NumberFormat(_day,(int) (2),(int) (0))));
RDebugUtils.currentLine=60882947;
 //BA.debugLineNum = 60882947;BA.debugLine="BtnTa.Tag=year&NumberFormat(month,2,0)&NumberForm";
mostCurrent._btnta.setTag((Object)(BA.NumberToString(_year)+anywheresoftware.b4a.keywords.Common.NumberFormat(_month,(int) (2),(int) (0))+anywheresoftware.b4a.keywords.Common.NumberFormat(_day,(int) (2),(int) (0))));
RDebugUtils.currentLine=60882951;
 //BA.debugLineNum = 60882951;BA.debugLine="DateTa=year&NumberFormat(month,2,0)&NumberFormat(";
mostCurrent._dateta = BA.NumberToString(_year)+anywheresoftware.b4a.keywords.Common.NumberFormat(_month,(int) (2),(int) (0))+anywheresoftware.b4a.keywords.Common.NumberFormat(_day,(int) (2),(int) (0));
RDebugUtils.currentLine=60882952;
 //BA.debugLineNum = 60882952;BA.debugLine="LogColor(DateTa,Colors.Magenta)";
anywheresoftware.b4a.keywords.Common.LogImpl("560882952",mostCurrent._dateta,anywheresoftware.b4a.keywords.Common.Colors.Magenta);
RDebugUtils.currentLine=60882953;
 //BA.debugLineNum = 60882953;BA.debugLine="End Sub";
return "";
}
public static String  _p1_ondismiss() throws Exception{
RDebugUtils.currentModule="act_repfactorvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "p1_ondismiss", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "p1_ondismiss", null));}
RDebugUtils.currentLine=61014016;
 //BA.debugLineNum = 61014016;BA.debugLine="Sub p1_onDismiss";
RDebugUtils.currentLine=61014017;
 //BA.debugLineNum = 61014017;BA.debugLine="Log(\"dismiss\")";
anywheresoftware.b4a.keywords.Common.LogImpl("561014017","dismiss",0);
RDebugUtils.currentLine=61014018;
 //BA.debugLineNum = 61014018;BA.debugLine="End Sub";
return "";
}
}