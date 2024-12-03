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

public class act_locationvisitor extends Activity implements B4AActivity{
	public static act_locationvisitor mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.act_locationvisitor");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (act_locationvisitor).");
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
		activityBA = new BA(this, layout, processBA, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.act_locationvisitor");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "ir.parsikhesab.pakhsh.act_locationvisitor", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (act_locationvisitor) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (act_locationvisitor) Resume **");
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
		return act_locationvisitor.class;
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
            BA.LogInfo("** Activity (act_locationvisitor) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (act_locationvisitor) Pause event (activity is not paused). **");
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
            act_locationvisitor mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (act_locationvisitor) Resume **");
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
public static anywheresoftware.b4a.gps.LocationWrapper _location = null;
public static String _name = "";
public anywheresoftware.b4a.objects.MapFragmentWrapper.GoogleMapWrapper _gmap = null;
public anywheresoftware.b4a.objects.MapFragmentWrapper _mapfragment1 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public ir.parsikhesab.pakhsh.b4xdialog _dialog = null;
public ir.parsikhesab.pakhsh.b4xdialog _dialog1 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _base = null;
public ir.parsikhesab.pakhsh.b4xsearchtemplate _searchtemplate = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel1 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnta = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_selvisitor = null;
public static String _dateta = "";
public anywheresoftware.b4a.objects.PanelWrapper _pnlmap = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btncount = null;
public anywheresoftware.b4a.objects.collections.List _lstlocation = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnltop = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnclearmap = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btngetlocation = null;
public anywheresoftware.b4a.objects.collections.List _points = null;
public static double _deghat = 0;
public anywheresoftware.b4a.objects.SeekBarWrapper _sb1 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btntimeaz = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btntimeta = null;
public com.porya.datetimepicker.PersianMaterialTimePickerWrapper _mdtime = null;
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
RDebugUtils.currentModule="act_locationvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=43712512;
 //BA.debugLineNum = 43712512;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=43712513;
 //BA.debugLineNum = 43712513;BA.debugLine="Activity.LoadLayout(\"l_visitorlocation\")";
mostCurrent._activity.LoadLayout("l_visitorlocation",mostCurrent.activityBA);
RDebugUtils.currentLine=43712514;
 //BA.debugLineNum = 43712514;BA.debugLine="Base = Activity";
mostCurrent._base = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(mostCurrent._activity.getObject()));
RDebugUtils.currentLine=43712515;
 //BA.debugLineNum = 43712515;BA.debugLine="LstLocation.Initialize";
mostCurrent._lstlocation.Initialize();
RDebugUtils.currentLine=43712516;
 //BA.debugLineNum = 43712516;BA.debugLine="SearchTemplate.Initialize";
mostCurrent._searchtemplate._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=43712517;
 //BA.debugLineNum = 43712517;BA.debugLine="Dialog1.Initialize (Activity)";
mostCurrent._dialog1._initialize /*String*/ (null,mostCurrent.activityBA,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(mostCurrent._activity.getObject())));
RDebugUtils.currentLine=43712518;
 //BA.debugLineNum = 43712518;BA.debugLine="MCode.page=\"Act_LocationVisitor\"";
mostCurrent._mcode._page /*String*/  = "Act_LocationVisitor";
RDebugUtils.currentLine=43712519;
 //BA.debugLineNum = 43712519;BA.debugLine="MCode.NoeGet=\"GetVisitor\"";
mostCurrent._mcode._noeget /*String*/  = "GetVisitor";
RDebugUtils.currentLine=43712520;
 //BA.debugLineNum = 43712520;BA.debugLine="StartService(Service_Server)";
anywheresoftware.b4a.keywords.Common.StartService(processBA,(Object)(mostCurrent._service_server.getObject()));
RDebugUtils.currentLine=43712521;
 //BA.debugLineNum = 43712521;BA.debugLine="MCode.CodeVisitorSelect=0";
mostCurrent._mcode._codevisitorselect /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=43712522;
 //BA.debugLineNum = 43712522;BA.debugLine="Location.Initialize";
_location.Initialize();
RDebugUtils.currentLine=43712523;
 //BA.debugLineNum = 43712523;BA.debugLine="points.Initialize";
mostCurrent._points.Initialize();
RDebugUtils.currentLine=43712524;
 //BA.debugLineNum = 43712524;BA.debugLine="SB1.Value=0";
mostCurrent._sb1.setValue((int) (0));
RDebugUtils.currentLine=43712525;
 //BA.debugLineNum = 43712525;BA.debugLine="mdtime.Initialize(\"mdtime\",0,0,True)";
mostCurrent._mdtime.Initialize(mostCurrent.activityBA,"mdtime",(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=43712526;
 //BA.debugLineNum = 43712526;BA.debugLine="End Sub";
return "";
}
public static boolean  _activity_keypress(int _keycode) throws Exception{
RDebugUtils.currentModule="act_locationvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_keypress", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "activity_keypress", new Object[] {_keycode}));}
RDebugUtils.currentLine=44105728;
 //BA.debugLineNum = 44105728;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
RDebugUtils.currentLine=44105729;
 //BA.debugLineNum = 44105729;BA.debugLine="If KeyCode=KeyCodes.KEYCODE_BACK Then";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK) { 
RDebugUtils.currentLine=44105730;
 //BA.debugLineNum = 44105730;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 }else {
RDebugUtils.currentLine=44105732;
 //BA.debugLineNum = 44105732;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 };
RDebugUtils.currentLine=44105734;
 //BA.debugLineNum = 44105734;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=44105735;
 //BA.debugLineNum = 44105735;BA.debugLine="End Sub";
return false;
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="act_locationvisitor";
RDebugUtils.currentLine=44040192;
 //BA.debugLineNum = 44040192;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=44040194;
 //BA.debugLineNum = 44040194;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="act_locationvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=43974656;
 //BA.debugLineNum = 43974656;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=43974658;
 //BA.debugLineNum = 43974658;BA.debugLine="End Sub";
return "";
}
public static String  _animatedialog(ir.parsikhesab.pakhsh.b4xdialog _dlg,String _fromedge) throws Exception{
RDebugUtils.currentModule="act_locationvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "animatedialog", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "animatedialog", new Object[] {_dlg,_fromedge}));}
int _top = 0;
int _left = 0;
RDebugUtils.currentLine=44761088;
 //BA.debugLineNum = 44761088;BA.debugLine="Sub AnimateDialog (dlg As B4XDialog, FromEdge As S";
RDebugUtils.currentLine=44761089;
 //BA.debugLineNum = 44761089;BA.debugLine="Dim Base As B4XView = dlg.Base";
mostCurrent._base = new anywheresoftware.b4a.objects.B4XViewWrapper();
mostCurrent._base = _dlg._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=44761090;
 //BA.debugLineNum = 44761090;BA.debugLine="Dim top As Int = Base.Top";
_top = mostCurrent._base.getTop();
RDebugUtils.currentLine=44761091;
 //BA.debugLineNum = 44761091;BA.debugLine="Dim left As Int = Base.Left";
_left = mostCurrent._base.getLeft();
RDebugUtils.currentLine=44761092;
 //BA.debugLineNum = 44761092;BA.debugLine="Select FromEdge.ToLowerCase";
switch (BA.switchObjectToInt(_fromedge.toLowerCase(),"bottom","top","left","right")) {
case 0: {
RDebugUtils.currentLine=44761094;
 //BA.debugLineNum = 44761094;BA.debugLine="Base.Top = Base.Parent.Height";
mostCurrent._base.setTop(mostCurrent._base.getParent().getHeight());
 break; }
case 1: {
RDebugUtils.currentLine=44761096;
 //BA.debugLineNum = 44761096;BA.debugLine="Base.Top = -Base.Height";
mostCurrent._base.setTop((int) (-mostCurrent._base.getHeight()));
 break; }
case 2: {
RDebugUtils.currentLine=44761098;
 //BA.debugLineNum = 44761098;BA.debugLine="Base.Left = -Base.Width";
mostCurrent._base.setLeft((int) (-mostCurrent._base.getWidth()));
 break; }
case 3: {
RDebugUtils.currentLine=44761100;
 //BA.debugLineNum = 44761100;BA.debugLine="Base.Left = Base.Parent.Width";
mostCurrent._base.setLeft(mostCurrent._base.getParent().getWidth());
 break; }
}
;
RDebugUtils.currentLine=44761102;
 //BA.debugLineNum = 44761102;BA.debugLine="Base.SetLayoutAnimated(300, left, top, Base.Width";
mostCurrent._base.SetLayoutAnimated((int) (300),_left,_top,mostCurrent._base.getWidth(),mostCurrent._base.getHeight());
RDebugUtils.currentLine=44761103;
 //BA.debugLineNum = 44761103;BA.debugLine="End Sub";
return "";
}
public static boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
RDebugUtils.currentModule="act_locationvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "application_error", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "application_error", new Object[] {_error,_stacktrace}));}
RDebugUtils.currentLine=45678592;
 //BA.debugLineNum = 45678592;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
RDebugUtils.currentLine=45678594;
 //BA.debugLineNum = 45678594;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=45678595;
 //BA.debugLineNum = 45678595;BA.debugLine="End Sub";
return false;
}
public static String  _btn_back_click() throws Exception{
RDebugUtils.currentModule="act_locationvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_back_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_back_click", null));}
RDebugUtils.currentLine=44826624;
 //BA.debugLineNum = 44826624;BA.debugLine="Sub btn_Back_Click";
RDebugUtils.currentLine=44826625;
 //BA.debugLineNum = 44826625;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=44826626;
 //BA.debugLineNum = 44826626;BA.debugLine="End Sub";
return "";
}
public static void  _btn_selvisitor_click() throws Exception{
RDebugUtils.currentModule="act_locationvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_selvisitor_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "btn_selvisitor_click", null); return;}
ResumableSub_Btn_SelVisitor_Click rsub = new ResumableSub_Btn_SelVisitor_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Btn_SelVisitor_Click extends BA.ResumableSub {
public ResumableSub_Btn_SelVisitor_Click(ir.parsikhesab.pakhsh.act_locationvisitor parent) {
this.parent = parent;
}
ir.parsikhesab.pakhsh.act_locationvisitor parent;
Object _rs = null;
int _result = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_locationvisitor";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=44695553;
 //BA.debugLineNum = 44695553;BA.debugLine="Dialog.Initialize (Panel1)";
parent.mostCurrent._dialog._initialize /*String*/ (null,mostCurrent.activityBA,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent.mostCurrent._panel1.getObject())));
RDebugUtils.currentLine=44695554;
 //BA.debugLineNum = 44695554;BA.debugLine="Dialog.Title = \"جستجو\"";
parent.mostCurrent._dialog._title /*Object*/  = (Object)("جستجو");
RDebugUtils.currentLine=44695555;
 //BA.debugLineNum = 44695555;BA.debugLine="Panel1.BringToFront";
parent.mostCurrent._panel1.BringToFront();
RDebugUtils.currentLine=44695556;
 //BA.debugLineNum = 44695556;BA.debugLine="Panel1.Visible=True";
parent.mostCurrent._panel1.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=44695557;
 //BA.debugLineNum = 44695557;BA.debugLine="SearchTemplate.SearchField.HintText=\"نام ویزیتور\"";
parent.mostCurrent._searchtemplate._searchfield /*ir.parsikhesab.pakhsh.b4xfloattextfield*/ ._hinttext /*String*/  = "نام ویزیتور";
RDebugUtils.currentLine=44695558;
 //BA.debugLineNum = 44695558;BA.debugLine="SearchTemplate.SearchField.lblClear.Text=\"\"";
parent.mostCurrent._searchtemplate._searchfield /*ir.parsikhesab.pakhsh.b4xfloattextfield*/ ._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=44695559;
 //BA.debugLineNum = 44695559;BA.debugLine="SearchTemplate.SearchField.lblV.Text=\"\"";
parent.mostCurrent._searchtemplate._searchfield /*ir.parsikhesab.pakhsh.b4xfloattextfield*/ ._lblv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=44695560;
 //BA.debugLineNum = 44695560;BA.debugLine="SearchTemplate.SearchField.Update";
parent.mostCurrent._searchtemplate._searchfield /*ir.parsikhesab.pakhsh.b4xfloattextfield*/ ._update /*String*/ (null);
RDebugUtils.currentLine=44695561;
 //BA.debugLineNum = 44695561;BA.debugLine="Dim rs As Object = Dialog.ShowTemplate(SearchTemp";
_rs = parent.mostCurrent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(parent.mostCurrent._searchtemplate),(Object)(""),(Object)(""),(Object)("انصراف"));
RDebugUtils.currentLine=44695562;
 //BA.debugLineNum = 44695562;BA.debugLine="AnimateDialog(Dialog, \"right\")";
_animatedialog(parent.mostCurrent._dialog,"right");
RDebugUtils.currentLine=44695563;
 //BA.debugLineNum = 44695563;BA.debugLine="Wait For (rs) Complete (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_locationvisitor", "btn_selvisitor_click"), _rs);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=44695564;
 //BA.debugLineNum = 44695564;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=44695565;
 //BA.debugLineNum = 44695565;BA.debugLine="Btn_SelVisitor.Text = SearchTemplate.SelectedIte";
parent.mostCurrent._btn_selvisitor.setText(BA.ObjectToCharSequence(parent.mostCurrent._searchtemplate._selecteditem /*String*/ ));
RDebugUtils.currentLine=44695566;
 //BA.debugLineNum = 44695566;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From T";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = parent.mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblVisitor where FldN_Visitor='"+parent.mostCurrent._btn_selvisitor.getText()+"'");
RDebugUtils.currentLine=44695567;
 //BA.debugLineNum = 44695567;BA.debugLine="Cu.Position=0";
_cu.setPosition((int) (0));
RDebugUtils.currentLine=44695568;
 //BA.debugLineNum = 44695568;BA.debugLine="MCode.CodeVisitorSelect =  Cu.GetString(\"FldC_Vi";
parent.mostCurrent._mcode._codevisitorselect /*String*/  = _cu.GetString("FldC_Visitor");
RDebugUtils.currentLine=44695569;
 //BA.debugLineNum = 44695569;BA.debugLine="Log(\"کد ویزیتور : \"&Cu.GetString(\"FldC_Visitor\")";
anywheresoftware.b4a.keywords.Common.LogImpl("544695569","کد ویزیتور : "+_cu.GetString("FldC_Visitor"),0);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=44695571;
 //BA.debugLineNum = 44695571;BA.debugLine="Btn_SelVisitor.Text = \"انتخاب ویزیتور\"";
parent.mostCurrent._btn_selvisitor.setText(BA.ObjectToCharSequence("انتخاب ویزیتور"));
RDebugUtils.currentLine=44695572;
 //BA.debugLineNum = 44695572;BA.debugLine="MCode.CodeVisitorSelect=0";
parent.mostCurrent._mcode._codevisitorselect /*String*/  = BA.NumberToString(0);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=44695574;
 //BA.debugLineNum = 44695574;BA.debugLine="Panel1.Visible=False";
parent.mostCurrent._panel1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=44695575;
 //BA.debugLineNum = 44695575;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _btnclearmap_click() throws Exception{
RDebugUtils.currentModule="act_locationvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnclearmap_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnclearmap_click", null));}
RDebugUtils.currentLine=45023232;
 //BA.debugLineNum = 45023232;BA.debugLine="Private Sub BtnClearMap_Click";
RDebugUtils.currentLine=45023233;
 //BA.debugLineNum = 45023233;BA.debugLine="If gmap.IsInitialized And Location.IsInitialized";
if (mostCurrent._gmap.IsInitialized() && _location.IsInitialized()) { 
RDebugUtils.currentLine=45023234;
 //BA.debugLineNum = 45023234;BA.debugLine="gmap.Clear";
mostCurrent._gmap.Clear();
RDebugUtils.currentLine=45023235;
 //BA.debugLineNum = 45023235;BA.debugLine="points.Clear";
mostCurrent._points.Clear();
 };
RDebugUtils.currentLine=45023237;
 //BA.debugLineNum = 45023237;BA.debugLine="End Sub";
return "";
}
public static void  _btncount_click() throws Exception{
RDebugUtils.currentModule="act_locationvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btncount_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "btncount_click", null); return;}
ResumableSub_BtnCount_Click rsub = new ResumableSub_BtnCount_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_BtnCount_Click extends BA.ResumableSub {
public ResumableSub_BtnCount_Click(ir.parsikhesab.pakhsh.act_locationvisitor parent) {
this.parent = parent;
}
ir.parsikhesab.pakhsh.act_locationvisitor parent;
ir.parsikhesab.pakhsh.b4xinputtemplate _input = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rs = null;
int _result = 0;
int _res = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_locationvisitor";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=44892161;
 //BA.debugLineNum = 44892161;BA.debugLine="Try";
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
RDebugUtils.currentLine=44892162;
 //BA.debugLineNum = 44892162;BA.debugLine="Dim input As B4XInputTemplate";
_input = new ir.parsikhesab.pakhsh.b4xinputtemplate();
RDebugUtils.currentLine=44892163;
 //BA.debugLineNum = 44892163;BA.debugLine="input.Initialize";
_input._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=44892164;
 //BA.debugLineNum = 44892164;BA.debugLine="input.lblTitle.Text = \"تعداد نقطه ها:\"";
_input._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("تعداد نقطه ها:"));
RDebugUtils.currentLine=44892165;
 //BA.debugLineNum = 44892165;BA.debugLine="input.ConfigureForNumbers(True, True)";
_input._configurefornumbers /*String*/ (null,anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=44892166;
 //BA.debugLineNum = 44892166;BA.debugLine="Dim rs As ResumableSub = Dialog1.ShowTemplate(in";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = parent.mostCurrent._dialog1._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_input),(Object)("OK"),(Object)(""),(Object)("CANCEL"));
RDebugUtils.currentLine=44892167;
 //BA.debugLineNum = 44892167;BA.debugLine="Dialog1.Base.Top = 50%y - Dialog1.Base.Height /";
parent.mostCurrent._dialog1._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTop((int) (anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (50),mostCurrent.activityBA)-parent.mostCurrent._dialog1._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2));
RDebugUtils.currentLine=44892168;
 //BA.debugLineNum = 44892168;BA.debugLine="Wait For (rs) Complete (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_locationvisitor", "btncount_click"), _rs);
this.state = 17;
return;
case 17:
//C
this.state = 4;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=44892169;
 //BA.debugLineNum = 44892169;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
if (true) break;

case 4:
//if
this.state = 13;
if (_result==parent.mostCurrent._xui.DialogResponse_Positive) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=44892170;
 //BA.debugLineNum = 44892170;BA.debugLine="If input.Text=\"\" Then input.Text=0";
if (true) break;

case 7:
//if
this.state = 12;
if ((_input._text /*String*/ ).equals("")) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
_input._text /*String*/  = BA.NumberToString(0);
if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=44892171;
 //BA.debugLineNum = 44892171;BA.debugLine="Dim res As Int = input.Text 'no need to check w";
_res = (int)(Double.parseDouble(_input._text /*String*/ ));
RDebugUtils.currentLine=44892172;
 //BA.debugLineNum = 44892172;BA.debugLine="BtnCount.Text=res";
parent.mostCurrent._btncount.setText(BA.ObjectToCharSequence(_res));
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
RDebugUtils.currentLine=44892175;
 //BA.debugLineNum = 44892175;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("544892175",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=44892176;
 //BA.debugLineNum = 44892176;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
parent.mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(parent.mostCurrent._activity.getTitle())+"-BtnCount_Click");
 if (true) break;
if (true) break;

case 16:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=44892178;
 //BA.debugLineNum = 44892178;BA.debugLine="End Sub";
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
public static String  _btngetlocation_click() throws Exception{
RDebugUtils.currentModule="act_locationvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btngetlocation_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btngetlocation_click", null));}
RDebugUtils.currentLine=44957696;
 //BA.debugLineNum = 44957696;BA.debugLine="Private Sub btnGetLocation_Click";
RDebugUtils.currentLine=44957697;
 //BA.debugLineNum = 44957697;BA.debugLine="Try";
try {RDebugUtils.currentLine=44957698;
 //BA.debugLineNum = 44957698;BA.debugLine="If	MCode.CodeVisitorSelect=0 Then";
if ((mostCurrent._mcode._codevisitorselect /*String*/ ).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=44957699;
 //BA.debugLineNum = 44957699;BA.debugLine="ToastMessageShow(\"لطفا ویزیتور را انتخاب نمایید";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("لطفا ویزیتور را انتخاب نمایید."),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=44957700;
 //BA.debugLineNum = 44957700;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=44957702;
 //BA.debugLineNum = 44957702;BA.debugLine="ProgressDialogShow2(\"در حال دریافت اطلاعات . . .";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(mostCurrent.activityBA,BA.ObjectToCharSequence("در حال دریافت اطلاعات . . ."),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=44957703;
 //BA.debugLineNum = 44957703;BA.debugLine="MCode.CountShowGpsMap=0";
mostCurrent._mcode._countshowgpsmap /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=44957704;
 //BA.debugLineNum = 44957704;BA.debugLine="MCode.GpsDateTa=0";
mostCurrent._mcode._gpsdateta /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=44957705;
 //BA.debugLineNum = 44957705;BA.debugLine="MCode.GpsTimeAz=0";
mostCurrent._mcode._gpstimeaz /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=44957706;
 //BA.debugLineNum = 44957706;BA.debugLine="MCode.GpsTimeTa=0";
mostCurrent._mcode._gpstimeta /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=44957707;
 //BA.debugLineNum = 44957707;BA.debugLine="CallSubDelayed(Service_Server,\"GetListGpsVisitor";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,(Object)(mostCurrent._service_server.getObject()),"GetListGpsVisitor");
 } 
       catch (Exception e13) {
			processBA.setLastException(e13);RDebugUtils.currentLine=44957709;
 //BA.debugLineNum = 44957709;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("544957709",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=44957710;
 //BA.debugLineNum = 44957710;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-btnGetLocation_Click");
 };
RDebugUtils.currentLine=44957713;
 //BA.debugLineNum = 44957713;BA.debugLine="End Sub";
return "";
}
public static String  _btnreport_click() throws Exception{
RDebugUtils.currentModule="act_locationvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnreport_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnreport_click", null));}
RDebugUtils.currentLine=44302336;
 //BA.debugLineNum = 44302336;BA.debugLine="Sub BtnReport_Click";
RDebugUtils.currentLine=44302337;
 //BA.debugLineNum = 44302337;BA.debugLine="Try";
try {RDebugUtils.currentLine=44302338;
 //BA.debugLineNum = 44302338;BA.debugLine="If	MCode.CodeVisitorSelect=0 Then";
if ((mostCurrent._mcode._codevisitorselect /*String*/ ).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=44302339;
 //BA.debugLineNum = 44302339;BA.debugLine="ToastMessageShow(\"لطفا ویزیتور را انتخاب نمایید.";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("لطفا ویزیتور را انتخاب نمایید."),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=44302340;
 //BA.debugLineNum = 44302340;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=44302343;
 //BA.debugLineNum = 44302343;BA.debugLine="If  MCode.Sf.Len(BtnTa.Tag) <> 8 Then";
if (mostCurrent._mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvv1(BA.ObjectToString(mostCurrent._btnta.getTag()))!=8) { 
RDebugUtils.currentLine=44302344;
 //BA.debugLineNum = 44302344;BA.debugLine="ToastMessageShow(\"تاریخ را به طور صحیح وارد نمای";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("تاریخ را به طور صحیح وارد نمایید"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=44302345;
 //BA.debugLineNum = 44302345;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=44302349;
 //BA.debugLineNum = 44302349;BA.debugLine="If MCode.Sf.Len(BtnTimeAz.Text)<>5 And MCode.Sf.L";
if (mostCurrent._mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvv1(mostCurrent._btntimeaz.getText())!=5 && mostCurrent._mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvv1(mostCurrent._btntimeta.getText())!=5) { 
RDebugUtils.currentLine=44302350;
 //BA.debugLineNum = 44302350;BA.debugLine="ToastMessageShow(\"ساعت را به طور صحیح وارد نمایی";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("ساعت را به طور صحیح وارد نمایید"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=44302351;
 //BA.debugLineNum = 44302351;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=44302354;
 //BA.debugLineNum = 44302354;BA.debugLine="ProgressDialogShow2(\"در حال دریافت اطلاعات . . .\"";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(mostCurrent.activityBA,BA.ObjectToCharSequence("در حال دریافت اطلاعات . . ."),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=44302355;
 //BA.debugLineNum = 44302355;BA.debugLine="MCode.CountShowGpsMap=BtnCount.Text";
mostCurrent._mcode._countshowgpsmap /*String*/  = mostCurrent._btncount.getText();
RDebugUtils.currentLine=44302356;
 //BA.debugLineNum = 44302356;BA.debugLine="MCode.GpsDateTa=MCode.ConvertNumbersPersian2Engl";
mostCurrent._mcode._gpsdateta /*String*/  = mostCurrent._mcode._convertnumberspersian2english /*String*/ (mostCurrent.activityBA,mostCurrent._dateta);
RDebugUtils.currentLine=44302357;
 //BA.debugLineNum = 44302357;BA.debugLine="MCode.GpsTimeAz=BtnTimeAz.Text.Replace(\":\",\"\")";
mostCurrent._mcode._gpstimeaz /*String*/  = mostCurrent._btntimeaz.getText().replace(":","");
RDebugUtils.currentLine=44302358;
 //BA.debugLineNum = 44302358;BA.debugLine="MCode.GpsTimeTa=BtnTimeTa.Text.Replace(\":\",\"\")";
mostCurrent._mcode._gpstimeta /*String*/  = mostCurrent._btntimeta.getText().replace(":","");
RDebugUtils.currentLine=44302359;
 //BA.debugLineNum = 44302359;BA.debugLine="CallSubDelayed(Service_Server,\"GetListGpsVisitor";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,(Object)(mostCurrent._service_server.getObject()),"GetListGpsVisitor");
 } 
       catch (Exception e21) {
			processBA.setLastException(e21);RDebugUtils.currentLine=44302361;
 //BA.debugLineNum = 44302361;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("544302361",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=44302362;
 //BA.debugLineNum = 44302362;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-BtnReport_Click");
 };
RDebugUtils.currentLine=44302364;
 //BA.debugLineNum = 44302364;BA.debugLine="End Sub";
return "";
}
public static String  _btnta_click() throws Exception{
RDebugUtils.currentModule="act_locationvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnta_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnta_click", null));}
com.porya.datetimepicker.PersianMaterialDatePickerWrapper _p1 = null;
RDebugUtils.currentLine=44367872;
 //BA.debugLineNum = 44367872;BA.debugLine="Sub BtnTa_Click";
RDebugUtils.currentLine=44367873;
 //BA.debugLineNum = 44367873;BA.debugLine="Dim p1 As PersianMaterialDatePicker";
_p1 = new com.porya.datetimepicker.PersianMaterialDatePickerWrapper();
RDebugUtils.currentLine=44367874;
 //BA.debugLineNum = 44367874;BA.debugLine="p1.Initialize(\"p1\",p1.PersianYear,p1.PersianMonth";
_p1.Initialize(mostCurrent.activityBA,"p1",_p1.getPersianYear(),_p1.getPersianMonth(),_p1.getPersianDay());
RDebugUtils.currentLine=44367875;
 //BA.debugLineNum = 44367875;BA.debugLine="p1.AccentColor = Colors.RGB(83,99,255)";
_p1.setAccentColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (83),(int) (99),(int) (255)));
RDebugUtils.currentLine=44367876;
 //BA.debugLineNum = 44367876;BA.debugLine="p1.OkText = \"تایید\"";
_p1.setOkText("تایید");
RDebugUtils.currentLine=44367877;
 //BA.debugLineNum = 44367877;BA.debugLine="p1.CancelText = \"لغو\"";
_p1.setCancelText("لغو");
RDebugUtils.currentLine=44367878;
 //BA.debugLineNum = 44367878;BA.debugLine="p1.Title = \"تا تاریخ\"";
_p1.setTitle("تا تاریخ");
RDebugUtils.currentLine=44367879;
 //BA.debugLineNum = 44367879;BA.debugLine="p1.Typeface = \"iransansmobile(fanum)_bold.ttf\"";
_p1.setTypeface("iransansmobile(fanum)_bold.ttf");
RDebugUtils.currentLine=44367880;
 //BA.debugLineNum = 44367880;BA.debugLine="p1.Show(\"p1\")";
_p1.Show("p1");
RDebugUtils.currentLine=44367881;
 //BA.debugLineNum = 44367881;BA.debugLine="End Sub";
return "";
}
public static String  _btntimeaz_click() throws Exception{
RDebugUtils.currentModule="act_locationvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btntimeaz_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btntimeaz_click", null));}
com.porya.datetimepicker.PersianMaterialTimePickerWrapper _t1 = null;
RDebugUtils.currentLine=45154304;
 //BA.debugLineNum = 45154304;BA.debugLine="Private Sub BtnTimeAz_Click";
RDebugUtils.currentLine=45154305;
 //BA.debugLineNum = 45154305;BA.debugLine="Dim t1 As PersianMaterialTimePicker";
_t1 = new com.porya.datetimepicker.PersianMaterialTimePickerWrapper();
RDebugUtils.currentLine=45154306;
 //BA.debugLineNum = 45154306;BA.debugLine="t1.Initialize(\"t1\",t1.Hour,t1.Minute,True)";
_t1.Initialize(mostCurrent.activityBA,"t1",_t1.getHour(),_t1.getMinute(),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=45154307;
 //BA.debugLineNum = 45154307;BA.debugLine="t1.AccentColor = Colors.RGB(83,99,255)";
_t1.setAccentColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (83),(int) (99),(int) (255)));
RDebugUtils.currentLine=45154308;
 //BA.debugLineNum = 45154308;BA.debugLine="t1.OkText = \"تایید\"";
_t1.setOkText("تایید");
RDebugUtils.currentLine=45154309;
 //BA.debugLineNum = 45154309;BA.debugLine="t1.CancelText = \"لغو\"";
_t1.setCancelText("لغو");
RDebugUtils.currentLine=45154310;
 //BA.debugLineNum = 45154310;BA.debugLine="t1.Title = \"از ساعت\"";
_t1.setTitle("از ساعت");
RDebugUtils.currentLine=45154311;
 //BA.debugLineNum = 45154311;BA.debugLine="t1.Typeface = \"iransansmobile(fanum)_bold.ttf\"";
_t1.setTypeface("iransansmobile(fanum)_bold.ttf");
RDebugUtils.currentLine=45154312;
 //BA.debugLineNum = 45154312;BA.debugLine="t1.Show(\"t1\")";
_t1.Show("t1");
RDebugUtils.currentLine=45154313;
 //BA.debugLineNum = 45154313;BA.debugLine="End Sub";
return "";
}
public static String  _btntimeta_click() throws Exception{
RDebugUtils.currentModule="act_locationvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btntimeta_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btntimeta_click", null));}
com.porya.datetimepicker.PersianMaterialTimePickerWrapper _t2 = null;
RDebugUtils.currentLine=45416448;
 //BA.debugLineNum = 45416448;BA.debugLine="Private Sub BtnTimeTa_Click";
RDebugUtils.currentLine=45416449;
 //BA.debugLineNum = 45416449;BA.debugLine="Dim t2 As PersianMaterialTimePicker";
_t2 = new com.porya.datetimepicker.PersianMaterialTimePickerWrapper();
RDebugUtils.currentLine=45416450;
 //BA.debugLineNum = 45416450;BA.debugLine="t2.Initialize(\"t2\",t2.Hour,t2.Minute,True)";
_t2.Initialize(mostCurrent.activityBA,"t2",_t2.getHour(),_t2.getMinute(),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=45416451;
 //BA.debugLineNum = 45416451;BA.debugLine="t2.AccentColor = Colors.RGB(83,99,255)";
_t2.setAccentColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (83),(int) (99),(int) (255)));
RDebugUtils.currentLine=45416452;
 //BA.debugLineNum = 45416452;BA.debugLine="t2.OkText = \"تایید\"";
_t2.setOkText("تایید");
RDebugUtils.currentLine=45416453;
 //BA.debugLineNum = 45416453;BA.debugLine="t2.CancelText = \"لغو\"";
_t2.setCancelText("لغو");
RDebugUtils.currentLine=45416454;
 //BA.debugLineNum = 45416454;BA.debugLine="t2.Title = \"تا ساعت\"";
_t2.setTitle("تا ساعت");
RDebugUtils.currentLine=45416455;
 //BA.debugLineNum = 45416455;BA.debugLine="t2.Typeface = \"iransansmobile(fanum)_bold.ttf\"";
_t2.setTypeface("iransansmobile(fanum)_bold.ttf");
RDebugUtils.currentLine=45416456;
 //BA.debugLineNum = 45416456;BA.debugLine="t2.Show(\"t2\")";
_t2.Show("t2");
RDebugUtils.currentLine=45416457;
 //BA.debugLineNum = 45416457;BA.debugLine="End Sub";
return "";
}
public static String  _getlocation() throws Exception{
RDebugUtils.currentModule="act_locationvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "getlocation", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "getlocation", null));}
anywheresoftware.b4a.objects.collections.Map _row = null;
double _lat = 0;
double _lon = 0;
double _latmin = 0;
double _latmax = 0;
double _latlast = 0;
String _strtimeaz = "";
String _strtimeta = "";
int _i = 0;
String _time = "";
String _date = "";
anywheresoftware.b4a.objects.MapFragmentWrapper.LatLngWrapper _llpoint = null;
anywheresoftware.b4a.objects.MapFragmentWrapper.CameraPositionWrapper _cl = null;
anywheresoftware.b4a.objects.MapFragmentWrapper.PolylineWrapper _pl = null;
RDebugUtils.currentLine=44236800;
 //BA.debugLineNum = 44236800;BA.debugLine="Private Sub GetLocation";
RDebugUtils.currentLine=44236801;
 //BA.debugLineNum = 44236801;BA.debugLine="If gmap.IsInitialized Then";
if (mostCurrent._gmap.IsInitialized()) { 
RDebugUtils.currentLine=44236802;
 //BA.debugLineNum = 44236802;BA.debugLine="Try";
try {RDebugUtils.currentLine=44236806;
 //BA.debugLineNum = 44236806;BA.debugLine="Dim Row As Map";
_row = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=44236807;
 //BA.debugLineNum = 44236807;BA.debugLine="Dim Lat, Lon, LatMin, LatMax, LatLast As Double";
_lat = 0;
_lon = 0;
_latmin = 0;
_latmax = 0;
_latlast = 0;
RDebugUtils.currentLine=44236808;
 //BA.debugLineNum = 44236808;BA.debugLine="Dim strTimeAz, strTimeTa As String";
_strtimeaz = "";
_strtimeta = "";
RDebugUtils.currentLine=44236810;
 //BA.debugLineNum = 44236810;BA.debugLine="If Location.IsInitialized Then";
if (_location.IsInitialized()) { 
RDebugUtils.currentLine=44236811;
 //BA.debugLineNum = 44236811;BA.debugLine="gmap.Clear";
mostCurrent._gmap.Clear();
RDebugUtils.currentLine=44236812;
 //BA.debugLineNum = 44236812;BA.debugLine="points.Clear";
mostCurrent._points.Clear();
RDebugUtils.currentLine=44236813;
 //BA.debugLineNum = 44236813;BA.debugLine="LatMin=100";
_latmin = 100;
RDebugUtils.currentLine=44236814;
 //BA.debugLineNum = 44236814;BA.debugLine="LatMax=0";
_latmax = 0;
RDebugUtils.currentLine=44236815;
 //BA.debugLineNum = 44236815;BA.debugLine="For i=0 To LstLocation.Size-1";
{
final int step11 = 1;
final int limit11 = (int) (mostCurrent._lstlocation.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit11 ;_i = _i + step11 ) {
RDebugUtils.currentLine=44236816;
 //BA.debugLineNum = 44236816;BA.debugLine="Row=LstLocation.Get(i)";
_row = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(mostCurrent._lstlocation.Get(_i)));
RDebugUtils.currentLine=44236818;
 //BA.debugLineNum = 44236818;BA.debugLine="Lat = Row.Get(\"FldLat\")";
_lat = (double)(BA.ObjectToNumber(_row.Get((Object)("FldLat"))));
RDebugUtils.currentLine=44236819;
 //BA.debugLineNum = 44236819;BA.debugLine="Lon = Row.Get(\"FldLon\")";
_lon = (double)(BA.ObjectToNumber(_row.Get((Object)("FldLon"))));
RDebugUtils.currentLine=44236820;
 //BA.debugLineNum = 44236820;BA.debugLine="If Lat > LatMin And Lat < LatMax Then";
if (_lat>_latmin && _lat<_latmax) { 
 }else {
RDebugUtils.currentLine=44236823;
 //BA.debugLineNum = 44236823;BA.debugLine="Dim Time As String= MCode.ConvertNumToTime(R";
_time = mostCurrent._mcode._convertnumtotime /*String*/ (mostCurrent.activityBA,BA.ObjectToString(_row.Get((Object)("FldTime"))));
RDebugUtils.currentLine=44236824;
 //BA.debugLineNum = 44236824;BA.debugLine="Dim Date As String= MCode.PersianDateDash(Ro";
_date = mostCurrent._mcode._persiandatedash /*String*/ (mostCurrent.activityBA,BA.ObjectToString(_row.Get((Object)("FldTarikh"))));
RDebugUtils.currentLine=44236825;
 //BA.debugLineNum = 44236825;BA.debugLine="Dim llPoint As LatLng";
_llpoint = new anywheresoftware.b4a.objects.MapFragmentWrapper.LatLngWrapper();
RDebugUtils.currentLine=44236827;
 //BA.debugLineNum = 44236827;BA.debugLine="llPoint.Initialize(Lat,Lon)";
_llpoint.Initialize(_lat,_lon);
RDebugUtils.currentLine=44236828;
 //BA.debugLineNum = 44236828;BA.debugLine="points.Add(llPoint)";
mostCurrent._points.Add((Object)(_llpoint.getObject()));
RDebugUtils.currentLine=44236829;
 //BA.debugLineNum = 44236829;BA.debugLine="gmap.AddMarker(Lat,Lon,Time &\" \" & Date)";
mostCurrent._gmap.AddMarker(_lat,_lon,_time+" "+_date);
RDebugUtils.currentLine=44236833;
 //BA.debugLineNum = 44236833;BA.debugLine="Dim cl As CameraPosition";
_cl = new anywheresoftware.b4a.objects.MapFragmentWrapper.CameraPositionWrapper();
RDebugUtils.currentLine=44236834;
 //BA.debugLineNum = 44236834;BA.debugLine="cl.Initialize(Lat,Lon,50)";
_cl.Initialize(_lat,_lon,(float) (50));
RDebugUtils.currentLine=44236835;
 //BA.debugLineNum = 44236835;BA.debugLine="gmap.AnimateCamera(cl)";
mostCurrent._gmap.AnimateCamera((com.google.android.gms.maps.model.CameraPosition)(_cl.getObject()));
 };
RDebugUtils.currentLine=44236838;
 //BA.debugLineNum = 44236838;BA.debugLine="LatLast = Lat";
_latlast = _lat;
RDebugUtils.currentLine=44236839;
 //BA.debugLineNum = 44236839;BA.debugLine="LatMin = LatLast - Deghat";
_latmin = _latlast-_deghat;
RDebugUtils.currentLine=44236840;
 //BA.debugLineNum = 44236840;BA.debugLine="LatMax = LatLast + Deghat";
_latmax = _latlast+_deghat;
 }
};
RDebugUtils.currentLine=44236842;
 //BA.debugLineNum = 44236842;BA.debugLine="Dim pl As Polyline = gmap.AddPolyline";
_pl = new anywheresoftware.b4a.objects.MapFragmentWrapper.PolylineWrapper();
_pl = mostCurrent._gmap.AddPolyline();
RDebugUtils.currentLine=44236843;
 //BA.debugLineNum = 44236843;BA.debugLine="pl.points = points";
_pl.setPoints(mostCurrent._points);
RDebugUtils.currentLine=44236844;
 //BA.debugLineNum = 44236844;BA.debugLine="pl.Color = Colors.Blue";
_pl.setColor(anywheresoftware.b4a.keywords.Common.Colors.Blue);
RDebugUtils.currentLine=44236845;
 //BA.debugLineNum = 44236845;BA.debugLine="SB1.Value = BtnCount.Text";
mostCurrent._sb1.setValue((int)(Double.parseDouble(mostCurrent._btncount.getText())));
RDebugUtils.currentLine=44236846;
 //BA.debugLineNum = 44236846;BA.debugLine="Deghat = BtnCount.Text / 100000";
_deghat = (double)(Double.parseDouble(mostCurrent._btncount.getText()))/(double)100000;
 };
RDebugUtils.currentLine=44236854;
 //BA.debugLineNum = 44236854;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 } 
       catch (Exception e39) {
			processBA.setLastException(e39);RDebugUtils.currentLine=44236856;
 //BA.debugLineNum = 44236856;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("544236856",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 };
 };
RDebugUtils.currentLine=44236860;
 //BA.debugLineNum = 44236860;BA.debugLine="End Sub";
return "";
}
public static String  _lblback_click() throws Exception{
RDebugUtils.currentModule="act_locationvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lblback_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lblback_click", null));}
RDebugUtils.currentLine=44630016;
 //BA.debugLineNum = 44630016;BA.debugLine="Sub LblBack_Click";
RDebugUtils.currentLine=44630017;
 //BA.debugLineNum = 44630017;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=44630018;
 //BA.debugLineNum = 44630018;BA.debugLine="End Sub";
return "";
}
public static String  _loaddata(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
RDebugUtils.currentModule="act_locationvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "loaddata", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "loaddata", new Object[] {_lst}));}
RDebugUtils.currentLine=43843584;
 //BA.debugLineNum = 43843584;BA.debugLine="Sub LoadData(lst As List)";
RDebugUtils.currentLine=43843585;
 //BA.debugLineNum = 43843585;BA.debugLine="If lst.Size>0 Then";
if (_lst.getSize()>0) { 
RDebugUtils.currentLine=43843586;
 //BA.debugLineNum = 43843586;BA.debugLine="LstLocation=lst";
mostCurrent._lstlocation = _lst;
RDebugUtils.currentLine=43843587;
 //BA.debugLineNum = 43843587;BA.debugLine="LoadMap";
_loadmap();
 };
RDebugUtils.currentLine=43843589;
 //BA.debugLineNum = 43843589;BA.debugLine="End Sub";
return "";
}
public static void  _loadmap() throws Exception{
RDebugUtils.currentModule="act_locationvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "loadmap", false))
	 {Debug.delegate(mostCurrent.activityBA, "loadmap", null); return;}
ResumableSub_LoadMap rsub = new ResumableSub_LoadMap(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_LoadMap extends BA.ResumableSub {
public ResumableSub_LoadMap(ir.parsikhesab.pakhsh.act_locationvisitor parent) {
this.parent = parent;
}
ir.parsikhesab.pakhsh.act_locationvisitor parent;
String _permission = "";
boolean _result = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_locationvisitor";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=43909121;
 //BA.debugLineNum = 43909121;BA.debugLine="If MCode.IsConnected=False And MCode.ConnectionSt";
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
RDebugUtils.currentLine=43909122;
 //BA.debugLineNum = 43909122;BA.debugLine="ToastMessageShow(\"لطفا ارتباط اینترنت گوشی خود ر";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("لطفا ارتباط اینترنت گوشی خود را بررسی نمایید"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=43909123;
 //BA.debugLineNum = 43909123;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=43909125;
 //BA.debugLineNum = 43909125;BA.debugLine="If MapFragment1.IsGooglePlayServicesAvailable = F";

case 4:
//if
this.state = 7;
if (parent.mostCurrent._mapfragment1.IsGooglePlayServicesAvailable(mostCurrent.activityBA)==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=43909126;
 //BA.debugLineNum = 43909126;BA.debugLine="ToastMessageShow(\"Please install Google Play Ser";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Please install Google Play Services."),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=43909127;
 //BA.debugLineNum = 43909127;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 7:
//C
this.state = 8;
;
RDebugUtils.currentLine=43909129;
 //BA.debugLineNum = 43909129;BA.debugLine="Sleep(100)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_locationvisitor", "loadmap"),(int) (100));
this.state = 21;
return;
case 21:
//C
this.state = 8;
;
RDebugUtils.currentLine=43909130;
 //BA.debugLineNum = 43909130;BA.debugLine="gmap = MapFragment1.GetMap";
parent.mostCurrent._gmap = parent.mostCurrent._mapfragment1.GetMap();
RDebugUtils.currentLine=43909131;
 //BA.debugLineNum = 43909131;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_ACCESS_FINE_LOCA";
parent._rp.CheckAndRequest(processBA,parent._rp.PERMISSION_ACCESS_FINE_LOCATION);
RDebugUtils.currentLine=43909132;
 //BA.debugLineNum = 43909132;BA.debugLine="Wait For Activity_PermissionResult (Permission As";
anywheresoftware.b4a.keywords.Common.WaitFor("activity_permissionresult", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_locationvisitor", "loadmap"), null);
this.state = 22;
return;
case 22:
//C
this.state = 8;
_permission = (String) result[0];
_result = (Boolean) result[1];
;
RDebugUtils.currentLine=43909133;
 //BA.debugLineNum = 43909133;BA.debugLine="If Result Then";
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
RDebugUtils.currentLine=43909134;
 //BA.debugLineNum = 43909134;BA.debugLine="If LstLocation.Size>0 Then";
if (true) break;

case 11:
//if
this.state = 14;
if (parent.mostCurrent._lstlocation.getSize()>0) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=43909135;
 //BA.debugLineNum = 43909135;BA.debugLine="gmap.MyLocationEnabled = True";
parent.mostCurrent._gmap.setMyLocationEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=43909136;
 //BA.debugLineNum = 43909136;BA.debugLine="GetLocation";
_getlocation();
 if (true) break;
;
RDebugUtils.currentLine=43909138;
 //BA.debugLineNum = 43909138;BA.debugLine="If pnlMap.Visible=False Then";

case 14:
//if
this.state = 17;
if (parent.mostCurrent._pnlmap.getVisible()==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=43909139;
 //BA.debugLineNum = 43909139;BA.debugLine="pnlMap.Visible=True";
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
RDebugUtils.currentLine=43909142;
 //BA.debugLineNum = 43909142;BA.debugLine="Log(\"No permission!\")";
anywheresoftware.b4a.keywords.Common.LogImpl("543909142","No permission!",0);
 if (true) break;

case 20:
//C
this.state = -1;
;
RDebugUtils.currentLine=43909145;
 //BA.debugLineNum = 43909145;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _loadvisitor() throws Exception{
RDebugUtils.currentModule="act_locationvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "loadvisitor", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "loadvisitor", null));}
anywheresoftware.b4a.objects.collections.List _items = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
int _i = 0;
RDebugUtils.currentLine=43778048;
 //BA.debugLineNum = 43778048;BA.debugLine="Sub LoadVisitor";
RDebugUtils.currentLine=43778049;
 //BA.debugLineNum = 43778049;BA.debugLine="Dim Items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=43778050;
 //BA.debugLineNum = 43778050;BA.debugLine="Items.Initialize";
_items.Initialize();
RDebugUtils.currentLine=43778051;
 //BA.debugLineNum = 43778051;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From Tb";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblVisitor ");
RDebugUtils.currentLine=43778052;
 //BA.debugLineNum = 43778052;BA.debugLine="For i=0 To Cu.RowCount-1";
{
final int step4 = 1;
final int limit4 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=43778053;
 //BA.debugLineNum = 43778053;BA.debugLine="Cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=43778054;
 //BA.debugLineNum = 43778054;BA.debugLine="Dim Name As String =  Cu.GetString(\"FldN_Visitor";
_name = _cu.GetString("FldN_Visitor");
RDebugUtils.currentLine=43778055;
 //BA.debugLineNum = 43778055;BA.debugLine="Items.Add(Name)";
_items.Add((Object)(_name));
 }
};
RDebugUtils.currentLine=43778057;
 //BA.debugLineNum = 43778057;BA.debugLine="SearchTemplate.SetItems(Items)";
mostCurrent._searchtemplate._setitems /*Object*/ (null,_items);
RDebugUtils.currentLine=43778058;
 //BA.debugLineNum = 43778058;BA.debugLine="SearchTemplate.GetPanel(Dialog).BringToFront";
mostCurrent._searchtemplate._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,mostCurrent._dialog).BringToFront();
RDebugUtils.currentLine=43778059;
 //BA.debugLineNum = 43778059;BA.debugLine="End Sub";
return "";
}
public static String  _mdtime_ontimeset(int _hourofday,int _minute) throws Exception{
RDebugUtils.currentModule="act_locationvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "mdtime_ontimeset", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "mdtime_ontimeset", new Object[] {_hourofday,_minute}));}
RDebugUtils.currentLine=44171264;
 //BA.debugLineNum = 44171264;BA.debugLine="Private Sub mdtime_onTimeSet(hourOfday As Int,minu";
RDebugUtils.currentLine=44171266;
 //BA.debugLineNum = 44171266;BA.debugLine="End Sub";
return "";
}
public static String  _p1_oncancel() throws Exception{
RDebugUtils.currentModule="act_locationvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "p1_oncancel", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "p1_oncancel", null));}
RDebugUtils.currentLine=44498944;
 //BA.debugLineNum = 44498944;BA.debugLine="Sub p1_onCancel";
RDebugUtils.currentLine=44498945;
 //BA.debugLineNum = 44498945;BA.debugLine="Log(\"cancel\")";
anywheresoftware.b4a.keywords.Common.LogImpl("544498945","cancel",0);
RDebugUtils.currentLine=44498946;
 //BA.debugLineNum = 44498946;BA.debugLine="End Sub";
return "";
}
public static String  _p1_ondateset(int _year,int _month,int _day) throws Exception{
RDebugUtils.currentModule="act_locationvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "p1_ondateset", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "p1_ondateset", new Object[] {_year,_month,_day}));}
RDebugUtils.currentLine=44433408;
 //BA.debugLineNum = 44433408;BA.debugLine="Sub p1_onDateSet(year As Int,month As Int,day As I";
RDebugUtils.currentLine=44433409;
 //BA.debugLineNum = 44433409;BA.debugLine="Log(year&\"/\"&month&\"/\"&day)";
anywheresoftware.b4a.keywords.Common.LogImpl("544433409",BA.NumberToString(_year)+"/"+BA.NumberToString(_month)+"/"+BA.NumberToString(_day),0);
RDebugUtils.currentLine=44433410;
 //BA.debugLineNum = 44433410;BA.debugLine="BtnTa.Text=year&\"/\"&NumberFormat(month,2,0)&\"/\"&N";
mostCurrent._btnta.setText(BA.ObjectToCharSequence(BA.NumberToString(_year)+"/"+anywheresoftware.b4a.keywords.Common.NumberFormat(_month,(int) (2),(int) (0))+"/"+anywheresoftware.b4a.keywords.Common.NumberFormat(_day,(int) (2),(int) (0))));
RDebugUtils.currentLine=44433411;
 //BA.debugLineNum = 44433411;BA.debugLine="BtnTa.Tag=year&NumberFormat(month,2,0)&NumberForm";
mostCurrent._btnta.setTag((Object)(BA.NumberToString(_year)+anywheresoftware.b4a.keywords.Common.NumberFormat(_month,(int) (2),(int) (0))+anywheresoftware.b4a.keywords.Common.NumberFormat(_day,(int) (2),(int) (0))));
RDebugUtils.currentLine=44433415;
 //BA.debugLineNum = 44433415;BA.debugLine="DateTa=year&NumberFormat(month,2,0)&NumberFormat(";
mostCurrent._dateta = BA.NumberToString(_year)+anywheresoftware.b4a.keywords.Common.NumberFormat(_month,(int) (2),(int) (0))+anywheresoftware.b4a.keywords.Common.NumberFormat(_day,(int) (2),(int) (0));
RDebugUtils.currentLine=44433416;
 //BA.debugLineNum = 44433416;BA.debugLine="LogColor(DateTa,Colors.Magenta)";
anywheresoftware.b4a.keywords.Common.LogImpl("544433416",mostCurrent._dateta,anywheresoftware.b4a.keywords.Common.Colors.Magenta);
RDebugUtils.currentLine=44433417;
 //BA.debugLineNum = 44433417;BA.debugLine="End Sub";
return "";
}
public static String  _p1_ondismiss() throws Exception{
RDebugUtils.currentModule="act_locationvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "p1_ondismiss", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "p1_ondismiss", null));}
RDebugUtils.currentLine=44564480;
 //BA.debugLineNum = 44564480;BA.debugLine="Sub p1_onDismiss";
RDebugUtils.currentLine=44564481;
 //BA.debugLineNum = 44564481;BA.debugLine="Log(\"dismiss\")";
anywheresoftware.b4a.keywords.Common.LogImpl("544564481","dismiss",0);
RDebugUtils.currentLine=44564482;
 //BA.debugLineNum = 44564482;BA.debugLine="End Sub";
return "";
}
public static String  _sb1_valuechanged(int _value,boolean _userchanged) throws Exception{
RDebugUtils.currentModule="act_locationvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "sb1_valuechanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "sb1_valuechanged", new Object[] {_value,_userchanged}));}
RDebugUtils.currentLine=45088768;
 //BA.debugLineNum = 45088768;BA.debugLine="Private Sub SB1_ValueChanged (Value As Int, UserCh";
RDebugUtils.currentLine=45088769;
 //BA.debugLineNum = 45088769;BA.debugLine="If UserChanged Then";
if (_userchanged) { 
RDebugUtils.currentLine=45088770;
 //BA.debugLineNum = 45088770;BA.debugLine="BtnCount.Text=SB1.Value";
mostCurrent._btncount.setText(BA.ObjectToCharSequence(mostCurrent._sb1.getValue()));
RDebugUtils.currentLine=45088771;
 //BA.debugLineNum = 45088771;BA.debugLine="Deghat=SB1.Value/100000";
_deghat = mostCurrent._sb1.getValue()/(double)100000;
 };
RDebugUtils.currentLine=45088774;
 //BA.debugLineNum = 45088774;BA.debugLine="SB1.Max = 200";
mostCurrent._sb1.setMax((int) (200));
RDebugUtils.currentLine=45088775;
 //BA.debugLineNum = 45088775;BA.debugLine="If BtnCount.Text = \"\" Then";
if ((mostCurrent._btncount.getText()).equals("")) { 
RDebugUtils.currentLine=45088776;
 //BA.debugLineNum = 45088776;BA.debugLine="BtnCount.Text = 1";
mostCurrent._btncount.setText(BA.ObjectToCharSequence(1));
 };
RDebugUtils.currentLine=45088778;
 //BA.debugLineNum = 45088778;BA.debugLine="If BtnCount.Text <= 200 And BtnCount.Text >= 1 Th";
if ((double)(Double.parseDouble(mostCurrent._btncount.getText()))<=200 && (double)(Double.parseDouble(mostCurrent._btncount.getText()))>=1) { 
RDebugUtils.currentLine=45088779;
 //BA.debugLineNum = 45088779;BA.debugLine="SB1.Value = BtnCount.Text";
mostCurrent._sb1.setValue((int)(Double.parseDouble(mostCurrent._btncount.getText())));
RDebugUtils.currentLine=45088780;
 //BA.debugLineNum = 45088780;BA.debugLine="Deghat = SB1.Value / 100000";
_deghat = mostCurrent._sb1.getValue()/(double)100000;
 }else {
RDebugUtils.currentLine=45088782;
 //BA.debugLineNum = 45088782;BA.debugLine="ToastMessageShow(\"لطفا مقداری بین 1 تا 200 را وا";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("لطفا مقداری بین 1 تا 200 را وارد نمایید"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=45088783;
 //BA.debugLineNum = 45088783;BA.debugLine="BtnCount.Text = 200";
mostCurrent._btncount.setText(BA.ObjectToCharSequence(200));
 };
RDebugUtils.currentLine=45088785;
 //BA.debugLineNum = 45088785;BA.debugLine="End Sub";
return "";
}
public static String  _t1_oncancel() throws Exception{
RDebugUtils.currentModule="act_locationvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "t1_oncancel", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "t1_oncancel", null));}
RDebugUtils.currentLine=45219840;
 //BA.debugLineNum = 45219840;BA.debugLine="Private Sub t1_onCancel";
RDebugUtils.currentLine=45219841;
 //BA.debugLineNum = 45219841;BA.debugLine="Log(\"cancel\")";
anywheresoftware.b4a.keywords.Common.LogImpl("545219841","cancel",0);
RDebugUtils.currentLine=45219842;
 //BA.debugLineNum = 45219842;BA.debugLine="End Sub";
return "";
}
public static String  _t1_ondismiss() throws Exception{
RDebugUtils.currentModule="act_locationvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "t1_ondismiss", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "t1_ondismiss", null));}
RDebugUtils.currentLine=45285376;
 //BA.debugLineNum = 45285376;BA.debugLine="Private Sub t1_onDismiss";
RDebugUtils.currentLine=45285377;
 //BA.debugLineNum = 45285377;BA.debugLine="Log(\"dismiss\")";
anywheresoftware.b4a.keywords.Common.LogImpl("545285377","dismiss",0);
RDebugUtils.currentLine=45285378;
 //BA.debugLineNum = 45285378;BA.debugLine="End Sub";
return "";
}
public static String  _t1_ontimeset(int _hourofday,int _minute) throws Exception{
RDebugUtils.currentModule="act_locationvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "t1_ontimeset", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "t1_ontimeset", new Object[] {_hourofday,_minute}));}
RDebugUtils.currentLine=45350912;
 //BA.debugLineNum = 45350912;BA.debugLine="Private Sub t1_onTimeSet(hourOfday As Int,minute A";
RDebugUtils.currentLine=45350913;
 //BA.debugLineNum = 45350913;BA.debugLine="Log(\"time1 : \"&hourOfday&\":\"&minute)";
anywheresoftware.b4a.keywords.Common.LogImpl("545350913","time1 : "+BA.NumberToString(_hourofday)+":"+BA.NumberToString(_minute),0);
RDebugUtils.currentLine=45350916;
 //BA.debugLineNum = 45350916;BA.debugLine="BtnTimeAz.Text=MCode.ConvertNumToTime2(hourOfday,";
mostCurrent._btntimeaz.setText(BA.ObjectToCharSequence(mostCurrent._mcode._convertnumtotime2 /*String*/ (mostCurrent.activityBA,BA.NumberToString(_hourofday),BA.NumberToString(_minute))));
RDebugUtils.currentLine=45350917;
 //BA.debugLineNum = 45350917;BA.debugLine="End Sub";
return "";
}
public static String  _t2_oncancel() throws Exception{
RDebugUtils.currentModule="act_locationvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "t2_oncancel", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "t2_oncancel", null));}
RDebugUtils.currentLine=45481984;
 //BA.debugLineNum = 45481984;BA.debugLine="Private Sub t2_onCancel";
RDebugUtils.currentLine=45481985;
 //BA.debugLineNum = 45481985;BA.debugLine="Log(\"cancel\")";
anywheresoftware.b4a.keywords.Common.LogImpl("545481985","cancel",0);
RDebugUtils.currentLine=45481986;
 //BA.debugLineNum = 45481986;BA.debugLine="End Sub";
return "";
}
public static String  _t2_ondismiss() throws Exception{
RDebugUtils.currentModule="act_locationvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "t2_ondismiss", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "t2_ondismiss", null));}
RDebugUtils.currentLine=45547520;
 //BA.debugLineNum = 45547520;BA.debugLine="Private Sub t2_onDismiss";
RDebugUtils.currentLine=45547521;
 //BA.debugLineNum = 45547521;BA.debugLine="Log(\"dismiss\")";
anywheresoftware.b4a.keywords.Common.LogImpl("545547521","dismiss",0);
RDebugUtils.currentLine=45547522;
 //BA.debugLineNum = 45547522;BA.debugLine="End Sub";
return "";
}
public static String  _t2_ontimeset(int _hourofday,int _minute) throws Exception{
RDebugUtils.currentModule="act_locationvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "t2_ontimeset", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "t2_ontimeset", new Object[] {_hourofday,_minute}));}
RDebugUtils.currentLine=45613056;
 //BA.debugLineNum = 45613056;BA.debugLine="Private Sub t2_onTimeSet(hourOfday As Int,minute A";
RDebugUtils.currentLine=45613057;
 //BA.debugLineNum = 45613057;BA.debugLine="Log(\"time2 : \"&hourOfday&\":\"&minute)";
anywheresoftware.b4a.keywords.Common.LogImpl("545613057","time2 : "+BA.NumberToString(_hourofday)+":"+BA.NumberToString(_minute),0);
RDebugUtils.currentLine=45613060;
 //BA.debugLineNum = 45613060;BA.debugLine="BtnTimeTa.Text=MCode.ConvertNumToTime2(hourOfday,";
mostCurrent._btntimeta.setText(BA.ObjectToCharSequence(mostCurrent._mcode._convertnumtotime2 /*String*/ (mostCurrent.activityBA,BA.NumberToString(_hourofday),BA.NumberToString(_minute))));
RDebugUtils.currentLine=45613061;
 //BA.debugLineNum = 45613061;BA.debugLine="End Sub";
return "";
}
}