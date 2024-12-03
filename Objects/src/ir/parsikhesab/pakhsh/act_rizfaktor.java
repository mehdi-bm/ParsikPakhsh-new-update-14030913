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

public class act_rizfaktor extends Activity implements B4AActivity{
	public static act_rizfaktor mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.act_rizfaktor");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (act_rizfaktor).");
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
		activityBA = new BA(this, layout, processBA, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.act_rizfaktor");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "ir.parsikhesab.pakhsh.act_rizfaktor", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (act_rizfaktor) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (act_rizfaktor) Resume **");
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
		return act_rizfaktor.class;
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
            BA.LogInfo("** Activity (act_rizfaktor) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (act_rizfaktor) Pause event (activity is not paused). **");
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
            act_rizfaktor mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (act_rizfaktor) Resume **");
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
public static ir.parsikhesab.pakhsh.mcode._adapterlistfaktor _faktor = null;
public static anywheresoftware.b4a.agraham.threading.Threading _th = null;
public ir.parsikhesab.pakhsh.table _table1 = null;
public anywheresoftware.b4a.objects.IME _key = null;
public anywheresoftware.b4a.objects.collections.List _listkala = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblnoetasvie = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblnamemoshtari = null;
public anywheresoftware.b4a.objects.LabelWrapper _txtsharhfaktor = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltotalfaktor = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_print = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_sendfactor = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_del = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_edit = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnltable = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblghabelepardakht = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblmandeghabl = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltakhfifvizhe = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltakhfifriali = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltakhfifkala = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltotalfaktor2 = null;
public ir.parsikhesab.pakhsh.mcode._adapterlistkala _item1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblmablaghkhales = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblshomarefactor = null;
public static String _mablaghfinal = "";
public anywheresoftware.b4a.objects.LabelWrapper _lblshomareforoosh = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnmarjooii = null;
public static String _ismarjoei = "";
public anywheresoftware.b4a.objects.LabelWrapper _lblcheckamani = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltype = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblvaziat = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbldarsadarzeshafzode = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblarzeshafzode = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblmablaghbadaztakhfif = null;
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
RDebugUtils.currentModule="act_rizfaktor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=68288512;
 //BA.debugLineNum = 68288512;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=68288513;
 //BA.debugLineNum = 68288513;BA.debugLine="Activity.LoadLayout(\"L_RizFaktor\")";
mostCurrent._activity.LoadLayout("L_RizFaktor",mostCurrent.activityBA);
RDebugUtils.currentLine=68288516;
 //BA.debugLineNum = 68288516;BA.debugLine="Key.Initialize(\"Key\")";
mostCurrent._key.Initialize("Key");
RDebugUtils.currentLine=68288517;
 //BA.debugLineNum = 68288517;BA.debugLine="Listkala.Initialize";
mostCurrent._listkala.Initialize();
RDebugUtils.currentLine=68288527;
 //BA.debugLineNum = 68288527;BA.debugLine="Table1.Initialize(Me, \"Table1\",9)";
mostCurrent._table1._initialize /*String*/ (null,mostCurrent.activityBA,act_rizfaktor.getObject(),"Table1",(int) (9));
RDebugUtils.currentLine=68288528;
 //BA.debugLineNum = 68288528;BA.debugLine="Table1.AddToActivity(PnlTable, 0,0,100%x,PnlTable";
mostCurrent._table1._addtoactivity /*String*/ (null,(anywheresoftware.b4a.objects.ActivityWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ActivityWrapper(), (anywheresoftware.b4a.BALayout)(mostCurrent._pnltable.getObject())),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),mostCurrent._pnltable.getHeight());
RDebugUtils.currentLine=68288532;
 //BA.debugLineNum = 68288532;BA.debugLine="th.Initialise(\"th\")";
_th.Initialise(processBA,"th");
RDebugUtils.currentLine=68288538;
 //BA.debugLineNum = 68288538;BA.debugLine="End Sub";
return "";
}
public static boolean  _activity_keypress(int _keycode) throws Exception{
RDebugUtils.currentModule="act_rizfaktor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_keypress", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "activity_keypress", new Object[] {_keycode}));}
RDebugUtils.currentLine=68681728;
 //BA.debugLineNum = 68681728;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
RDebugUtils.currentLine=68681729;
 //BA.debugLineNum = 68681729;BA.debugLine="If KeyCode=KeyCodes.KEYCODE_BACK Then";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK) { 
RDebugUtils.currentLine=68681731;
 //BA.debugLineNum = 68681731;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 };
RDebugUtils.currentLine=68681733;
 //BA.debugLineNum = 68681733;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=68681734;
 //BA.debugLineNum = 68681734;BA.debugLine="End Sub";
return false;
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="act_rizfaktor";
RDebugUtils.currentLine=68812800;
 //BA.debugLineNum = 68812800;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=68812802;
 //BA.debugLineNum = 68812802;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="act_rizfaktor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=68747264;
 //BA.debugLineNum = 68747264;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=68747275;
 //BA.debugLineNum = 68747275;BA.debugLine="th.RunOnGuiThread(\"LoadListKalaFaktor\",Null)";
_th.RunOnGuiThread("LoadListKalaFaktor",(Object[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=68747276;
 //BA.debugLineNum = 68747276;BA.debugLine="End Sub";
return "";
}
public static boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
RDebugUtils.currentModule="act_rizfaktor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "application_error", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "application_error", new Object[] {_error,_stacktrace}));}
RDebugUtils.currentLine=69664768;
 //BA.debugLineNum = 69664768;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
RDebugUtils.currentLine=69664770;
 //BA.debugLineNum = 69664770;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=69664771;
 //BA.debugLineNum = 69664771;BA.debugLine="End Sub";
return false;
}
public static String  _btn_back_click() throws Exception{
RDebugUtils.currentModule="act_rizfaktor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_back_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_back_click", null));}
RDebugUtils.currentLine=69533696;
 //BA.debugLineNum = 69533696;BA.debugLine="Sub btn_Back_Click";
RDebugUtils.currentLine=69533697;
 //BA.debugLineNum = 69533697;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=69533698;
 //BA.debugLineNum = 69533698;BA.debugLine="End Sub";
return "";
}
public static String  _btn_del_click() throws Exception{
RDebugUtils.currentModule="act_rizfaktor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_del_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_del_click", null));}
int _res = 0;
RDebugUtils.currentLine=69074944;
 //BA.debugLineNum = 69074944;BA.debugLine="Sub Btn_del_Click";
RDebugUtils.currentLine=69074945;
 //BA.debugLineNum = 69074945;BA.debugLine="Dim res As Int = Msgbox2(\"آیا از حذف این فاکتور م";
_res = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("آیا از حذف این فاکتور مطمئن هستید؟"),BA.ObjectToCharSequence("توجه"),"بله","","خیر",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"icon.png").getObject()),mostCurrent.activityBA);
RDebugUtils.currentLine=69074946;
 //BA.debugLineNum = 69074946;BA.debugLine="If res = DialogResponse.POSITIVE Then";
if (_res==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=69074947;
 //BA.debugLineNum = 69074947;BA.debugLine="MCode.CreateBK(\"\")";
mostCurrent._mcode._createbk /*void*/ (mostCurrent.activityBA,"");
RDebugUtils.currentLine=69074948;
 //BA.debugLineNum = 69074948;BA.debugLine="MCode.SaveUpdate(\"Delete From TblFaktor Where Fl";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Delete From TblFaktor Where FldShomareFaktor = '"+mostCurrent._mcode._faktorselect /*String*/ +"'");
RDebugUtils.currentLine=69074951;
 //BA.debugLineNum = 69074951;BA.debugLine="SaveLastVisit";
_savelastvisit();
RDebugUtils.currentLine=69074952;
 //BA.debugLineNum = 69074952;BA.debugLine="ToastMessageShow(\"فاکتور مورد نظر حذف گردید\",Tru";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("فاکتور مورد نظر حذف گردید"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=69074953;
 //BA.debugLineNum = 69074953;BA.debugLine="MCode.FaktorSelect=\"\"";
mostCurrent._mcode._faktorselect /*String*/  = "";
RDebugUtils.currentLine=69074954;
 //BA.debugLineNum = 69074954;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 };
RDebugUtils.currentLine=69074956;
 //BA.debugLineNum = 69074956;BA.debugLine="End Sub";
return "";
}
public static String  _savelastvisit() throws Exception{
RDebugUtils.currentModule="act_rizfaktor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "savelastvisit", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "savelastvisit", null));}
String _datemiladi = "";
String _time = "";
String _d = "";
RDebugUtils.currentLine=69140480;
 //BA.debugLineNum = 69140480;BA.debugLine="Sub SaveLastVisit";
RDebugUtils.currentLine=69140482;
 //BA.debugLineNum = 69140482;BA.debugLine="DateTime.DateFormat=\"yyyy-MM-dd\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=69140483;
 //BA.debugLineNum = 69140483;BA.debugLine="Dim DateMiladi As String = MCode.ConvertNumbersPe";
_datemiladi = mostCurrent._mcode._convertnumberspersian2english /*String*/ (mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.getNow()));
RDebugUtils.currentLine=69140484;
 //BA.debugLineNum = 69140484;BA.debugLine="Dim Time As String = MCode.ConvertNumbersPersian2";
_time = mostCurrent._mcode._convertnumberspersian2english /*String*/ (mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.DateTime.Time(anywheresoftware.b4a.keywords.Common.DateTime.getNow()));
RDebugUtils.currentLine=69140485;
 //BA.debugLineNum = 69140485;BA.debugLine="Dim D As String = DateMiladi & \"T\" & Time";
_d = _datemiladi+"T"+_time;
RDebugUtils.currentLine=69140486;
 //BA.debugLineNum = 69140486;BA.debugLine="LogColor(\"D: \" & D,Colors.Red)";
anywheresoftware.b4a.keywords.Common.LogImpl("569140486","D: "+_d,anywheresoftware.b4a.keywords.Common.Colors.Red);
RDebugUtils.currentLine=69140488;
 //BA.debugLineNum = 69140488;BA.debugLine="MCode.SaveUpdate(\"Update TblAshkhas Set lastOrder";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Update TblAshkhas Set lastOrderDate = '"+_d+"' Where fldCodetafzili = '"+mostCurrent._mcode._codemoshtari /*String*/ +"'");
RDebugUtils.currentLine=69140490;
 //BA.debugLineNum = 69140490;BA.debugLine="End Sub";
return "";
}
public static String  _btn_edit_click() throws Exception{
RDebugUtils.currentModule="act_rizfaktor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_edit_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_edit_click", null));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
int _res = 0;
RDebugUtils.currentLine=69206016;
 //BA.debugLineNum = 69206016;BA.debugLine="Sub Btn_Edit_Click";
RDebugUtils.currentLine=69206018;
 //BA.debugLineNum = 69206018;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From Tb";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblSabad");
RDebugUtils.currentLine=69206019;
 //BA.debugLineNum = 69206019;BA.debugLine="If Cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=69206020;
 //BA.debugLineNum = 69206020;BA.debugLine="Dim res As Int = Msgbox2(\"در صورتی که بخواهید ای";
_res = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("در صورتی که بخواهید این فاکتور را ویرایش کنید ، سبد خرید شما حذف می شود، آیا می خواهید ادامه دهید؟"),BA.ObjectToCharSequence("توجه"),"بله","","خیر",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"logo.png").getObject()),mostCurrent.activityBA);
RDebugUtils.currentLine=69206021;
 //BA.debugLineNum = 69206021;BA.debugLine="If res=DialogResponse.POSITIVE Then";
if (_res==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=69206022;
 //BA.debugLineNum = 69206022;BA.debugLine="MCode.SaveUpdate(\"Delete From TblSabad\")";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Delete From TblSabad");
RDebugUtils.currentLine=69206023;
 //BA.debugLineNum = 69206023;BA.debugLine="FaktorToSabad(\"False\")";
_faktortosabad("False");
 };
 }else {
RDebugUtils.currentLine=69206026;
 //BA.debugLineNum = 69206026;BA.debugLine="FaktorToSabad(\"False\")";
_faktortosabad("False");
 };
RDebugUtils.currentLine=69206028;
 //BA.debugLineNum = 69206028;BA.debugLine="If isMarjoei=\"True\" Then";
if ((mostCurrent._ismarjoei).equals("True")) { 
RDebugUtils.currentLine=69206029;
 //BA.debugLineNum = 69206029;BA.debugLine="MCode.Action=\"UpdateMarjooii\"";
mostCurrent._mcode._action /*String*/  = "UpdateMarjooii";
RDebugUtils.currentLine=69206030;
 //BA.debugLineNum = 69206030;BA.debugLine="StartActivity(Act_KalaDefault)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._act_kaladefault.getObject()));
 }else {
RDebugUtils.currentLine=69206032;
 //BA.debugLineNum = 69206032;BA.debugLine="MCode.Action=\"SabtFaktor\"";
mostCurrent._mcode._action /*String*/  = "SabtFaktor";
RDebugUtils.currentLine=69206033;
 //BA.debugLineNum = 69206033;BA.debugLine="StartActivity(Act_KalaDefault)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._act_kaladefault.getObject()));
 };
RDebugUtils.currentLine=69206035;
 //BA.debugLineNum = 69206035;BA.debugLine="MCode.Action=\"SabtFaktor\"";
mostCurrent._mcode._action /*String*/  = "SabtFaktor";
RDebugUtils.currentLine=69206036;
 //BA.debugLineNum = 69206036;BA.debugLine="End Sub";
return "";
}
public static String  _faktortosabad(String _marjoee) throws Exception{
RDebugUtils.currentModule="act_rizfaktor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "faktortosabad", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "faktortosabad", new Object[] {_marjoee}));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
int _i = 0;
RDebugUtils.currentLine=68878336;
 //BA.debugLineNum = 68878336;BA.debugLine="Sub FaktorToSabad(marjoee As String)";
RDebugUtils.currentLine=68878337;
 //BA.debugLineNum = 68878337;BA.debugLine="Try";
try {RDebugUtils.currentLine=68878338;
 //BA.debugLineNum = 68878338;BA.debugLine="MCode.editFactor=True";
mostCurrent._mcode._editfactor /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=68878339;
 //BA.debugLineNum = 68878339;BA.debugLine="MCode.FaktorSelect=Faktor.FldShomareFaktor";
mostCurrent._mcode._faktorselect /*String*/  = _faktor.fldShomareFaktor /*String*/ ;
RDebugUtils.currentLine=68878340;
 //BA.debugLineNum = 68878340;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From T";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblFaktor Where FldShomareFaktor = '"+mostCurrent._mcode._faktorselect /*String*/ +"' ");
RDebugUtils.currentLine=68878341;
 //BA.debugLineNum = 68878341;BA.debugLine="If Cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=68878342;
 //BA.debugLineNum = 68878342;BA.debugLine="For i=0 To Cu.RowCount-1";
{
final int step6 = 1;
final int limit6 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=68878343;
 //BA.debugLineNum = 68878343;BA.debugLine="Cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=68878344;
 //BA.debugLineNum = 68878344;BA.debugLine="Log(Cu.GetString(\"FldNamekala\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("568878344",_cu.GetString("FldNamekala"),0);
RDebugUtils.currentLine=68878345;
 //BA.debugLineNum = 68878345;BA.debugLine="Log(Cu.GetString(\"FldFeeForoosh\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("568878345",_cu.GetString("FldFeeForoosh"),0);
RDebugUtils.currentLine=68878346;
 //BA.debugLineNum = 68878346;BA.debugLine="MCode.SaveUpdate(\"Insert Into TblSabad (FldCod";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Insert Into TblSabad (FldCodeKala,FldNameKala,FldFeeForoosh,fldFeeBadAzTakhfif,FldNamevahed,FldNameVahed2,fldPathPic,FldTedadDarSabadJoz,FldTedadDarSabadKol,FldTozihat,FldMablaghMasrafKonande,FldSumMande,fldDarsadArzeshAfzode,fldArzeshAfzode,FldTedadDarKarton,FldMablaghTakhfif,FldDarsadTakhfif,FldVaziatPardakht,FldAmani,fldShomareForoosh,fldSharh) Values ('"+_cu.GetString("FldCodeKala")+"','"+_cu.GetString("FldNamekala")+"','"+_cu.GetString("FldFeeForoosh")+"','"+_cu.GetString("fldFeeBadAzTakhfif")+"','"+_cu.GetString("FldNameVahed")+"','"+_cu.GetString("FldNameVahed2")+"','"+_cu.GetString("fldPathPic")+"','"+_cu.GetString("FldTedadDarSabadJoz")+"','"+_cu.GetString("FldTedadDarSabadKol")+"','"+_cu.GetString("FldTozihat")+"','"+_cu.GetString("FldMablaghMasrafKonande")+"','"+_cu.GetString("FldSumMande")+"','"+_cu.GetString("fldDarsadArzeshAfzode")+"','"+_cu.GetString("fldArzeshAfzode")+"','"+_cu.GetString("FldTedadDarKarton")+"','"+_cu.GetString("FldMablaghTakhfif")+"','"+_cu.GetString("FldDarsadTakhfif")+"',"+_cu.GetString("FldVaziatPardakht")+",'"+_cu.GetString("FldAmani")+"','"+_cu.GetString("fldShomareForoosh")+"','"+_cu.GetString("FldTozih")+"')");
RDebugUtils.currentLine=68878354;
 //BA.debugLineNum = 68878354;BA.debugLine="If marjoee=\"False\" Then";
if ((_marjoee).equals("False")) { 
RDebugUtils.currentLine=68878355;
 //BA.debugLineNum = 68878355;BA.debugLine="marjoee=Cu.GetString(\"WIsBacked\")";
_marjoee = _cu.GetString("WIsBacked");
 };
RDebugUtils.currentLine=68878357;
 //BA.debugLineNum = 68878357;BA.debugLine="MCode.isAmani=Cu.GetString(\"FldAmani\")";
mostCurrent._mcode._isamani /*String*/  = _cu.GetString("FldAmani");
 }
};
RDebugUtils.currentLine=68878359;
 //BA.debugLineNum = 68878359;BA.debugLine="MCode.SaveUpdate(\"Update TblSabad Set fldSharh";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Update TblSabad Set fldSharh = '' Where fldSharh = ''");
 };
RDebugUtils.currentLine=68878388;
 //BA.debugLineNum = 68878388;BA.debugLine="MCode.SaveUpdate(\"Update TblSabad Set fldSharh =";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Update TblSabad Set fldSharh = '' Where fldSharh = ''");
RDebugUtils.currentLine=68878389;
 //BA.debugLineNum = 68878389;BA.debugLine="If MCode.Action=\"UpdateMarjooii\" Or MCode.Action";
if ((mostCurrent._mcode._action /*String*/ ).equals("UpdateMarjooii") || (mostCurrent._mcode._action /*String*/ ).equals("SabtMarjooii")) { 
RDebugUtils.currentLine=68878391;
 //BA.debugLineNum = 68878391;BA.debugLine="StartActivity(Act_KalaDefault)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._act_kaladefault.getObject()));
 }else {
RDebugUtils.currentLine=68878393;
 //BA.debugLineNum = 68878393;BA.debugLine="MCode.Action=\"SabtFaktor\"";
mostCurrent._mcode._action /*String*/  = "SabtFaktor";
RDebugUtils.currentLine=68878394;
 //BA.debugLineNum = 68878394;BA.debugLine="StartActivity(Act_KalaDefault)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._act_kaladefault.getObject()));
 };
RDebugUtils.currentLine=68878397;
 //BA.debugLineNum = 68878397;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 } 
       catch (Exception e27) {
			processBA.setLastException(e27);RDebugUtils.currentLine=68878399;
 //BA.debugLineNum = 68878399;BA.debugLine="Log(LastException.Message)";
anywheresoftware.b4a.keywords.Common.LogImpl("568878399",anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getMessage(),0);
RDebugUtils.currentLine=68878400;
 //BA.debugLineNum = 68878400;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-FaktorToSabad");
 };
RDebugUtils.currentLine=68878404;
 //BA.debugLineNum = 68878404;BA.debugLine="End Sub";
return "";
}
public static String  _btn_print_click() throws Exception{
RDebugUtils.currentModule="act_rizfaktor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_print_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_print_click", null));}
anywheresoftware.b4a.objects.collections.List _lst = null;
int _res = 0;
RDebugUtils.currentLine=69009408;
 //BA.debugLineNum = 69009408;BA.debugLine="Sub Btn_print_Click";
RDebugUtils.currentLine=69009409;
 //BA.debugLineNum = 69009409;BA.debugLine="Act_PrintPic.Faktor	  = Faktor";
mostCurrent._act_printpic._faktor /*ir.parsikhesab.pakhsh.mcode._adapterlistfaktor*/  = _faktor;
RDebugUtils.currentLine=69009410;
 //BA.debugLineNum = 69009410;BA.debugLine="Act_PrintPic.listKala = Listkala";
mostCurrent._act_printpic._listkala /*anywheresoftware.b4a.objects.collections.List*/  = mostCurrent._listkala;
RDebugUtils.currentLine=69009411;
 //BA.debugLineNum = 69009411;BA.debugLine="Dim Lst As List = Array As String(\"چاپ 1\",\"چاپ مو";
_lst = new anywheresoftware.b4a.objects.collections.List();
_lst = anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"چاپ 1","چاپ مولایی"});
RDebugUtils.currentLine=69009412;
 //BA.debugLineNum = 69009412;BA.debugLine="Dim res As Int = InputList(Lst,\"نوع چاپ را انتخاب";
_res = anywheresoftware.b4a.keywords.Common.InputList(_lst,BA.ObjectToCharSequence("نوع چاپ را انتخاب نمایید:"),(int) (-1),mostCurrent.activityBA);
RDebugUtils.currentLine=69009413;
 //BA.debugLineNum = 69009413;BA.debugLine="Select Case res";
switch (_res) {
case 0: {
RDebugUtils.currentLine=69009415;
 //BA.debugLineNum = 69009415;BA.debugLine="Act_PrintPic.TypePrint=res";
mostCurrent._act_printpic._typeprint /*int*/  = _res;
RDebugUtils.currentLine=69009416;
 //BA.debugLineNum = 69009416;BA.debugLine="StartActivity(Act_PrintPic)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._act_printpic.getObject()));
 break; }
case 1: {
RDebugUtils.currentLine=69009418;
 //BA.debugLineNum = 69009418;BA.debugLine="Act_PrintPic.TypePrint=res";
mostCurrent._act_printpic._typeprint /*int*/  = _res;
RDebugUtils.currentLine=69009419;
 //BA.debugLineNum = 69009419;BA.debugLine="StartActivity(Act_PrintPic)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._act_printpic.getObject()));
 break; }
}
;
RDebugUtils.currentLine=69009425;
 //BA.debugLineNum = 69009425;BA.debugLine="End Sub";
return "";
}
public static void  _btn_sendfactor_click() throws Exception{
RDebugUtils.currentModule="act_rizfaktor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_sendfactor_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "btn_sendfactor_click", null); return;}
ResumableSub_Btn_SendFactor_Click rsub = new ResumableSub_Btn_SendFactor_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Btn_SendFactor_Click extends BA.ResumableSub {
public ResumableSub_Btn_SendFactor_Click(ir.parsikhesab.pakhsh.act_rizfaktor parent) {
this.parent = parent;
}
ir.parsikhesab.pakhsh.act_rizfaktor parent;
int _shomarefactor = 0;
int _res = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_rizfaktor";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=68943873;
 //BA.debugLineNum = 68943873;BA.debugLine="If MCode.IsConnected=False And MCode.ConnectionSt";
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
RDebugUtils.currentLine=68943874;
 //BA.debugLineNum = 68943874;BA.debugLine="ToastMessageShow(\"لطفا ارتباط اینترنت گوشی خود ر";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("لطفا ارتباط اینترنت گوشی خود را بررسی نمایید"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=68943875;
 //BA.debugLineNum = 68943875;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=68943877;
 //BA.debugLineNum = 68943877;BA.debugLine="ProgressDialogShow2(\"در حال ارسال موارد انتخابی .";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(mostCurrent.activityBA,BA.ObjectToCharSequence("در حال ارسال موارد انتخابی . . ."),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=68943878;
 //BA.debugLineNum = 68943878;BA.debugLine="Btn_SendFactor.Enabled=False";
parent.mostCurrent._btn_sendfactor.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=68943879;
 //BA.debugLineNum = 68943879;BA.debugLine="Dim shomarefactor As Int=0";
_shomarefactor = (int) (0);
RDebugUtils.currentLine=68943880;
 //BA.debugLineNum = 68943880;BA.debugLine="shomarefactor=MCode.FaktorSelect";
_shomarefactor = (int)(Double.parseDouble(parent.mostCurrent._mcode._faktorselect /*String*/ ));
RDebugUtils.currentLine=68943881;
 //BA.debugLineNum = 68943881;BA.debugLine="If shomarefactor>0 Then";
if (true) break;

case 5:
//if
this.state = 20;
if (_shomarefactor>0) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=68943885;
 //BA.debugLineNum = 68943885;BA.debugLine="If Faktor.synced=True Then";
if (true) break;

case 8:
//if
this.state = 19;
if (parent._faktor.synced /*boolean*/ ==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 10;
}else {
this.state = 18;
}if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=68943886;
 //BA.debugLineNum = 68943886;BA.debugLine="Dim Res As Int = Msgbox2(\"این سفارش قبلا ارسال";
_res = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("این سفارش قبلا ارسال شده است آیا مجددا ارسال شود؟"),BA.ObjectToCharSequence("توجه"),"بله","","خیر",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=68943887;
 //BA.debugLineNum = 68943887;BA.debugLine="If Res = DialogResponse.POSITIVE Then";
if (true) break;

case 11:
//if
this.state = 16;
if (_res==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
this.state = 13;
}else {
this.state = 15;
}if (true) break;

case 13:
//C
this.state = 16;
RDebugUtils.currentLine=68943888;
 //BA.debugLineNum = 68943888;BA.debugLine="CallSubDelayed2(Service_Server,\"LoadSend\",shom";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(parent.mostCurrent._service_server.getObject()),"LoadSend",(Object)(_shomarefactor));
RDebugUtils.currentLine=68943889;
 //BA.debugLineNum = 68943889;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_rizfaktor", "btn_sendfactor_click"),(int) (1000));
this.state = 21;
return;
case 21:
//C
this.state = 16;
;
RDebugUtils.currentLine=68943890;
 //BA.debugLineNum = 68943890;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
 if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=68943892;
 //BA.debugLineNum = 68943892;BA.debugLine="Btn_SendFactor.Enabled=True";
parent.mostCurrent._btn_sendfactor.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=68943893;
 //BA.debugLineNum = 68943893;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 if (true) break;

case 16:
//C
this.state = 19;
;
 if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=68943897;
 //BA.debugLineNum = 68943897;BA.debugLine="CallSubDelayed2(Service_Server,\"LoadSend\",shoma";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(parent.mostCurrent._service_server.getObject()),"LoadSend",(Object)(_shomarefactor));
RDebugUtils.currentLine=68943898;
 //BA.debugLineNum = 68943898;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_rizfaktor", "btn_sendfactor_click"),(int) (1000));
this.state = 22;
return;
case 22:
//C
this.state = 19;
;
RDebugUtils.currentLine=68943899;
 //BA.debugLineNum = 68943899;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
 if (true) break;

case 19:
//C
this.state = 20;
;
 if (true) break;

case 20:
//C
this.state = -1;
;
RDebugUtils.currentLine=68943906;
 //BA.debugLineNum = 68943906;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _btnmarjooii_click() throws Exception{
RDebugUtils.currentModule="act_rizfaktor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnmarjooii_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnmarjooii_click", null));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
int _res = 0;
RDebugUtils.currentLine=69730304;
 //BA.debugLineNum = 69730304;BA.debugLine="Private Sub btnMarjooii_Click";
RDebugUtils.currentLine=69730306;
 //BA.debugLineNum = 69730306;BA.debugLine="MCode.Action=\"SabtMarjooii\"";
mostCurrent._mcode._action /*String*/  = "SabtMarjooii";
RDebugUtils.currentLine=69730307;
 //BA.debugLineNum = 69730307;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From Tb";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblSabad");
RDebugUtils.currentLine=69730308;
 //BA.debugLineNum = 69730308;BA.debugLine="If Cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=69730309;
 //BA.debugLineNum = 69730309;BA.debugLine="Dim res As Int = Msgbox2(\"در صورتی که بخواهید ای";
_res = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("در صورتی که بخواهید این فاکتور را ویرایش کنید ، سبد خرید شما حذف می شود، آیا می خواهید ادامه دهید؟"),BA.ObjectToCharSequence("توجه"),"بله","","خیر",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"logo.png").getObject()),mostCurrent.activityBA);
RDebugUtils.currentLine=69730310;
 //BA.debugLineNum = 69730310;BA.debugLine="If res=DialogResponse.POSITIVE Then";
if (_res==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=69730311;
 //BA.debugLineNum = 69730311;BA.debugLine="MCode.SaveUpdate(\"Delete From TblSabad\")";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Delete From TblSabad");
RDebugUtils.currentLine=69730312;
 //BA.debugLineNum = 69730312;BA.debugLine="FaktorToSabad(\"True\")";
_faktortosabad("True");
 };
 }else {
RDebugUtils.currentLine=69730315;
 //BA.debugLineNum = 69730315;BA.debugLine="FaktorToSabad(\"True\")";
_faktortosabad("True");
 };
RDebugUtils.currentLine=69730317;
 //BA.debugLineNum = 69730317;BA.debugLine="End Sub";
return "";
}
public static void  _createpge() throws Exception{
RDebugUtils.currentModule="act_rizfaktor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createpge", false))
	 {Debug.delegate(mostCurrent.activityBA, "createpge", null); return;}
ResumableSub_CreatePge rsub = new ResumableSub_CreatePge(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_CreatePge extends BA.ResumableSub {
public ResumableSub_CreatePge(ir.parsikhesab.pakhsh.act_rizfaktor parent) {
this.parent = parent;
}
ir.parsikhesab.pakhsh.act_rizfaktor parent;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cutasview = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu1 = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_rizfaktor";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=68419585;
 //BA.debugLineNum = 68419585;BA.debugLine="Sleep(200)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_rizfaktor", "createpge"),(int) (200));
this.state = 33;
return;
case 33:
//C
this.state = 1;
;
RDebugUtils.currentLine=68419587;
 //BA.debugLineNum = 68419587;BA.debugLine="TxtSharhFaktor.Text = Faktor.fldTozihFaktor";
parent.mostCurrent._txtsharhfaktor.setText(BA.ObjectToCharSequence(parent._faktor.fldTozihFaktor /*String*/ ));
RDebugUtils.currentLine=68419588;
 //BA.debugLineNum = 68419588;BA.debugLine="MCode.Tozihat_faktor=Faktor.fldTozihFaktor";
parent.mostCurrent._mcode._tozihat_faktor /*String*/  = parent._faktor.fldTozihFaktor /*String*/ ;
RDebugUtils.currentLine=68419589;
 //BA.debugLineNum = 68419589;BA.debugLine="Dim CuTasview As Cursor = MCode.Result(\"Select *";
_cutasview = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cutasview = parent.mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblTasvie Where FldCode = '"+parent._faktor.fldC_Tasvie /*String*/ +"'");
RDebugUtils.currentLine=68419590;
 //BA.debugLineNum = 68419590;BA.debugLine="If CuTasview.RowCount>0 Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_cutasview.getRowCount()>0) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=68419591;
 //BA.debugLineNum = 68419591;BA.debugLine="CuTasview.Position=0";
_cutasview.setPosition((int) (0));
RDebugUtils.currentLine=68419592;
 //BA.debugLineNum = 68419592;BA.debugLine="LblNoeTasvie.Text = CuTasview.GetString(\"FldName";
parent.mostCurrent._lblnoetasvie.setText(BA.ObjectToCharSequence(_cutasview.GetString("FldName")));
RDebugUtils.currentLine=68419593;
 //BA.debugLineNum = 68419593;BA.debugLine="MCode.NoeTasvieFaktor=CuTasview.GetString(\"FldNa";
parent.mostCurrent._mcode._noetasviefaktor /*String*/  = _cutasview.GetString("FldName");
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=68419596;
 //BA.debugLineNum = 68419596;BA.debugLine="LblTotalFaktor.Text = NumberFormat(myCode.Is_Null";
parent.mostCurrent._lbltotalfaktor.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.NumberFormat((double)(Double.parseDouble(parent.mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,parent._faktor.fldMablaghKol /*String*/ ))),(int) (1),(int) (3))+" "+parent.mostCurrent._mcode._vahedpool /*String*/ ));
RDebugUtils.currentLine=68419599;
 //BA.debugLineNum = 68419599;BA.debugLine="LblTotalFaktor2.text = NumberFormat(myCode.Is_Nul";
parent.mostCurrent._lbltotalfaktor2.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.NumberFormat((double)(Double.parseDouble(parent.mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,parent._faktor.fldMablaghKol /*String*/ ))),(int) (1),(int) (3))+" "+parent.mostCurrent._mcode._vahedpool /*String*/ ));
RDebugUtils.currentLine=68419600;
 //BA.debugLineNum = 68419600;BA.debugLine="Try";
if (true) break;

case 5:
//try
this.state = 14;
this.catchState = 13;
this.state = 7;
if (true) break;

case 7:
//C
this.state = 8;
this.catchState = 13;
RDebugUtils.currentLine=68419601;
 //BA.debugLineNum = 68419601;BA.debugLine="If Faktor.fldTozihFaktor = \"\" Then";
if (true) break;

case 8:
//if
this.state = 11;
if ((parent._faktor.fldTozihFaktor /*String*/ ).equals("")) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=68419602;
 //BA.debugLineNum = 68419602;BA.debugLine="TxtSharhFaktor.Text = \"\"";
parent.mostCurrent._txtsharhfaktor.setText(BA.ObjectToCharSequence(""));
 if (true) break;

case 11:
//C
this.state = 14;
;
 if (true) break;

case 13:
//C
this.state = 14;
this.catchState = 0;
RDebugUtils.currentLine=68419605;
 //BA.debugLineNum = 68419605;BA.debugLine="TxtSharhFaktor.Text = \"\"";
parent.mostCurrent._txtsharhfaktor.setText(BA.ObjectToCharSequence(""));
 if (true) break;
if (true) break;

case 14:
//C
this.state = 15;
this.catchState = 0;
;
RDebugUtils.currentLine=68419609;
 //BA.debugLineNum = 68419609;BA.debugLine="Dim Cu1 As Cursor = MCode.Result(\"Select * From T";
_cu1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu1 = parent.mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblAshkhas where fldCodetafzili='"+parent._faktor.fldC_Ashkhas /*String*/ +"'");
RDebugUtils.currentLine=68419610;
 //BA.debugLineNum = 68419610;BA.debugLine="If Cu1.RowCount>0 Then";
if (true) break;

case 15:
//if
this.state = 26;
if (_cu1.getRowCount()>0) { 
this.state = 17;
}else {
this.state = 25;
}if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=68419611;
 //BA.debugLineNum = 68419611;BA.debugLine="Cu1.Position=0";
_cu1.setPosition((int) (0));
RDebugUtils.currentLine=68419612;
 //BA.debugLineNum = 68419612;BA.debugLine="LblNameMoshtari.Text=Cu1.GetString(\"fldSharheTaf";
parent.mostCurrent._lblnamemoshtari.setText(BA.ObjectToCharSequence(_cu1.GetString("fldSharheTafzili")));
RDebugUtils.currentLine=68419613;
 //BA.debugLineNum = 68419613;BA.debugLine="Faktor.C_Name=Cu1.GetString(\"fldSharheTafzili\")";
parent._faktor.C_Name /*String*/  = _cu1.GetString("fldSharheTafzili");
RDebugUtils.currentLine=68419615;
 //BA.debugLineNum = 68419615;BA.debugLine="If IsNumber(Cu1.GetString(\"fldMande\")) = True Th";
if (true) break;

case 18:
//if
this.state = 23;
if (anywheresoftware.b4a.keywords.Common.IsNumber(_cu1.GetString("fldMande"))==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 20;
}else {
this.state = 22;
}if (true) break;

case 20:
//C
this.state = 23;
RDebugUtils.currentLine=68419616;
 //BA.debugLineNum = 68419616;BA.debugLine="LblMandeGhabl.text = NumberFormat(Cu1.GetString";
parent.mostCurrent._lblmandeghabl.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.NumberFormat((double)(Double.parseDouble(_cu1.GetString("fldMande"))),(int) (1),(int) (3))+" "+parent.mostCurrent._mcode._vahedpool /*String*/ ));
RDebugUtils.currentLine=68419617;
 //BA.debugLineNum = 68419617;BA.debugLine="Faktor.fldSumMandeAzGhabl=Cu1.GetString(\"fldMan";
parent._faktor.fldSumMandeAzGhabl /*String*/  = _cu1.GetString("fldMande");
 if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=68419619;
 //BA.debugLineNum = 68419619;BA.debugLine="LblMandeGhabl.text = \"-\"";
parent.mostCurrent._lblmandeghabl.setText(BA.ObjectToCharSequence("-"));
RDebugUtils.currentLine=68419620;
 //BA.debugLineNum = 68419620;BA.debugLine="Faktor.fldSumMandeAzGhabl=0";
parent._faktor.fldSumMandeAzGhabl /*String*/  = BA.NumberToString(0);
 if (true) break;

case 23:
//C
this.state = 26;
;
 if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=68419623;
 //BA.debugLineNum = 68419623;BA.debugLine="ToastMessageShow(\"اطلاعات مشتری یافت نشد احتمالا";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("اطلاعات مشتری یافت نشد احتمالا از لیست مشتریان شما حذف شده است"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=68419624;
 //BA.debugLineNum = 68419624;BA.debugLine="LblNameMoshtari.Text=\"نام مشتری یافت نشد\"";
parent.mostCurrent._lblnamemoshtari.setText(BA.ObjectToCharSequence("نام مشتری یافت نشد"));
 if (true) break;

case 26:
//C
this.state = 27;
;
RDebugUtils.currentLine=68419628;
 //BA.debugLineNum = 68419628;BA.debugLine="LblTakhfifKala.text = NumberFormat(myCode.Is_Null";
parent.mostCurrent._lbltakhfifkala.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.NumberFormat((double)(Double.parseDouble(parent.mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,parent._faktor.FldTakhfifKala /*String*/ ))),(int) (1),(int) (3))+" "+parent.mostCurrent._mcode._vahedpool /*String*/ ));
RDebugUtils.currentLine=68419629;
 //BA.debugLineNum = 68419629;BA.debugLine="LblTakhfifVizhe.text = NumberFormat(myCode.Is_Nul";
parent.mostCurrent._lbltakhfifvizhe.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.NumberFormat((double)(Double.parseDouble(parent.mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,parent._faktor.FldTakhfifVizhe /*String*/ ))),(int) (1),(int) (3))+" "+parent.mostCurrent._mcode._vahedpool /*String*/ ));
RDebugUtils.currentLine=68419630;
 //BA.debugLineNum = 68419630;BA.debugLine="lblMablaghBadAzTakhfif.Text=myCode.AdadToPrice(Fa";
parent.mostCurrent._lblmablaghbadaztakhfif.setText(BA.ObjectToCharSequence(parent.mostCurrent._mycode._adadtoprice /*String*/ (mostCurrent.activityBA,parent._faktor.fldSumMablaghBadAzTakhfif /*String*/ )));
RDebugUtils.currentLine=68419631;
 //BA.debugLineNum = 68419631;BA.debugLine="LblMablaghKhales.text = NumberFormat(myCode.Is_Nu";
parent.mostCurrent._lblmablaghkhales.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.NumberFormat((double)(Double.parseDouble(parent.mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,parent._faktor.fldTotalFaktor /*String*/ ))),(int) (1),(int) (3))+" "+parent.mostCurrent._mcode._vahedpool /*String*/ ));
RDebugUtils.currentLine=68419632;
 //BA.debugLineNum = 68419632;BA.debugLine="LblGHabelePardakht.text = NumberFormat(myCode.Is_";
parent.mostCurrent._lblghabelepardakht.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.NumberFormat((double)(Double.parseDouble(parent.mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,parent._faktor.fldTotalFaktor /*String*/ ))),(int) (1),(int) (3))+" "+parent.mostCurrent._mcode._vahedpool /*String*/ ));
RDebugUtils.currentLine=68419634;
 //BA.debugLineNum = 68419634;BA.debugLine="If MCode.Amani=1 Then";
if (true) break;

case 27:
//if
this.state = 32;
if ((parent.mostCurrent._mcode._amani /*String*/ ).equals(BA.NumberToString(1))) { 
this.state = 29;
}else {
this.state = 31;
}if (true) break;

case 29:
//C
this.state = 32;
RDebugUtils.currentLine=68419635;
 //BA.debugLineNum = 68419635;BA.debugLine="lblCheckAmani.Visible=True";
parent.mostCurrent._lblcheckamani.setVisible(anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 31:
//C
this.state = 32;
RDebugUtils.currentLine=68419637;
 //BA.debugLineNum = 68419637;BA.debugLine="lblCheckAmani.Visible=False";
parent.mostCurrent._lblcheckamani.setVisible(anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 32:
//C
this.state = -1;
;
RDebugUtils.currentLine=68419651;
 //BA.debugLineNum = 68419651;BA.debugLine="Grid";
_grid();
RDebugUtils.currentLine=68419653;
 //BA.debugLineNum = 68419653;BA.debugLine="End Sub";
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
public static void  _grid() throws Exception{
RDebugUtils.currentModule="act_rizfaktor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "grid", false))
	 {Debug.delegate(mostCurrent.activityBA, "grid", null); return;}
ResumableSub_Grid rsub = new ResumableSub_Grid(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Grid extends BA.ResumableSub {
public ResumableSub_Grid(ir.parsikhesab.pakhsh.act_rizfaktor parent) {
this.parent = parent;
}
ir.parsikhesab.pakhsh.act_rizfaktor parent;
anywheresoftware.b4a.objects.collections.List _lst_colnametitle = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_rizfaktor";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=68354049;
 //BA.debugLineNum = 68354049;BA.debugLine="Sleep(200)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_rizfaktor", "grid"),(int) (200));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=68354050;
 //BA.debugLineNum = 68354050;BA.debugLine="Dim Lst_ColNameTitle As List";
_lst_colnametitle = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=68354051;
 //BA.debugLineNum = 68354051;BA.debugLine="Lst_ColNameTitle.Initialize";
_lst_colnametitle.Initialize();
RDebugUtils.currentLine=68354053;
 //BA.debugLineNum = 68354053;BA.debugLine="Lst_ColNameTitle.AddAll(Array As String(\"ردیف\",\"ن";
_lst_colnametitle.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"ردیف","نام کالا","کد کالا","فروش فی","بعد از تخفیف فی","تخفیف ویژه","درصد تخفیف","تخفیف کالا","درصد ارزش افزوده","مبلغ ارزش افزوده","تعداد جزء","واحد جزء","تعداد کل","واحد کل","توضیحات"}));
RDebugUtils.currentLine=68354056;
 //BA.debugLineNum = 68354056;BA.debugLine="Table1.LoadSList(Listkala,Lst_ColNameTitle,15)";
parent.mostCurrent._table1._loadslist /*String*/ (null,parent.mostCurrent._listkala,_lst_colnametitle,(int) (15));
RDebugUtils.currentLine=68354059;
 //BA.debugLineNum = 68354059;BA.debugLine="Table1.SetColumnsWidths(Array As Int(50dip,100dip";
parent.mostCurrent._table1._setcolumnswidths /*String*/ (null,new int[]{anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (70)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (70)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (70)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (70)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (80)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (90)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (80)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (150))});
RDebugUtils.currentLine=68354062;
 //BA.debugLineNum = 68354062;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _lblback_click() throws Exception{
RDebugUtils.currentModule="act_rizfaktor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lblback_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lblback_click", null));}
RDebugUtils.currentLine=68550656;
 //BA.debugLineNum = 68550656;BA.debugLine="Sub LblBack_Click";
RDebugUtils.currentLine=68550657;
 //BA.debugLineNum = 68550657;BA.debugLine="Activity_KeyPress(KeyCodes.KEYCODE_BACK)";
_activity_keypress(anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK);
RDebugUtils.currentLine=68550658;
 //BA.debugLineNum = 68550658;BA.debugLine="End Sub";
return "";
}
public static String  _loaddata(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
RDebugUtils.currentModule="act_rizfaktor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "loaddata", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "loaddata", new Object[] {_lst}));}
int _fldtakhfifvizhe = 0;
int _fldtakhfifkala = 0;
anywheresoftware.b4a.objects.collections.Map _row = null;
int _i = 0;
ir.parsikhesab.pakhsh.mcode._adapterlistkala _item = null;
RDebugUtils.currentLine=69599232;
 //BA.debugLineNum = 69599232;BA.debugLine="Sub LoadData(lst As List)";
RDebugUtils.currentLine=69599234;
 //BA.debugLineNum = 69599234;BA.debugLine="If lst.Size>0 Then";
if (_lst.getSize()>0) { 
RDebugUtils.currentLine=69599235;
 //BA.debugLineNum = 69599235;BA.debugLine="Dim FldTakhfifVizhe,FldTakhfifKala As Int=0";
_fldtakhfifvizhe = 0;
_fldtakhfifkala = (int) (0);
RDebugUtils.currentLine=69599236;
 //BA.debugLineNum = 69599236;BA.debugLine="Dim Row As Map";
_row = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=69599237;
 //BA.debugLineNum = 69599237;BA.debugLine="For i=0 To lst.Size-1";
{
final int step4 = 1;
final int limit4 = (int) (_lst.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=69599238;
 //BA.debugLineNum = 69599238;BA.debugLine="Row=lst.Get(i)";
_row = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lst.Get(_i)));
RDebugUtils.currentLine=69599239;
 //BA.debugLineNum = 69599239;BA.debugLine="Dim Item As AdapterListKala";
_item = new ir.parsikhesab.pakhsh.mcode._adapterlistkala();
RDebugUtils.currentLine=69599243;
 //BA.debugLineNum = 69599243;BA.debugLine="Item.CodeKala=Row.Get(\"fldCodeKala\")";
_item.CodeKala /*String*/  = BA.ObjectToString(_row.Get((Object)("fldCodeKala")));
RDebugUtils.currentLine=69599245;
 //BA.debugLineNum = 69599245;BA.debugLine="Item.NameKala=Row.Get(\"fldSharhKala\")";
_item.NameKala /*String*/  = BA.ObjectToString(_row.Get((Object)("fldSharhKala")));
RDebugUtils.currentLine=69599246;
 //BA.debugLineNum = 69599246;BA.debugLine="Item.FeeForoosh=Row.Get(\"fldFeeForoosh\")";
_item.FeeForoosh /*int*/  = (int)(BA.ObjectToNumber(_row.Get((Object)("fldFeeForoosh"))));
RDebugUtils.currentLine=69599247;
 //BA.debugLineNum = 69599247;BA.debugLine="Item.FldFeeBadAzTakhfif=myCode.Is_Null_adad(Row";
_item.fldFeeBadAzTakhfif /*String*/  = mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,BA.ObjectToString(_row.Get((Object)("fldFeeBadAzTakhfif"))));
RDebugUtils.currentLine=69599248;
 //BA.debugLineNum = 69599248;BA.debugLine="Item.MablaghTakhfif=myCode.Is_Null_adad(Row.Get";
_item.MablaghTakhfif /*int*/  = (int)(Double.parseDouble(mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,BA.ObjectToString(_row.Get((Object)("MablaghTakhfif"))))));
RDebugUtils.currentLine=69599249;
 //BA.debugLineNum = 69599249;BA.debugLine="Item.NameVahed=MCode.SingleResult(\"select FldNa";
_item.NameVahed /*String*/  = BA.ObjectToString(mostCurrent._mcode._singleresult /*Object*/ (mostCurrent.activityBA,"select FldNameVahed from TblKala where fldCodeKala="+BA.ObjectToString(_row.Get((Object)("fldCodeKala")))));
RDebugUtils.currentLine=69599250;
 //BA.debugLineNum = 69599250;BA.debugLine="Item.NameVahed2=MCode.SingleResult(\"select FldN";
_item.NameVahed2 /*String*/  = BA.ObjectToString(mostCurrent._mcode._singleresult /*Object*/ (mostCurrent.activityBA,"select FldNameVahed2 from TblKala where fldCodeKala="+BA.ObjectToString(_row.Get((Object)("fldCodeKala")))));
RDebugUtils.currentLine=69599251;
 //BA.debugLineNum = 69599251;BA.debugLine="Item.fldPathPic=Row.Get(\"fldPathPic\")";
_item.fldPathPic /*String*/  = BA.ObjectToString(_row.Get((Object)("fldPathPic")));
RDebugUtils.currentLine=69599252;
 //BA.debugLineNum = 69599252;BA.debugLine="Item.TedadDarSabadJoz=Row.Get(\"fldTedadJoz\")";
_item.TedadDarSabadJoz /*String*/  = BA.ObjectToString(_row.Get((Object)("fldTedadJoz")));
RDebugUtils.currentLine=69599253;
 //BA.debugLineNum = 69599253;BA.debugLine="Item.TedadDarSabadKol=Row.Get(\"fldTedadCarton\")";
_item.TedadDarSabadKol /*String*/  = BA.ObjectToString(_row.Get((Object)("fldTedadCarton")));
RDebugUtils.currentLine=69599254;
 //BA.debugLineNum = 69599254;BA.debugLine="Item.TedadDarKarton=Row.Get(\"fldTedadDarKarton\"";
_item.TedadDarKarton /*String*/  = BA.ObjectToString(_row.Get((Object)("fldTedadDarKarton")));
RDebugUtils.currentLine=69599255;
 //BA.debugLineNum = 69599255;BA.debugLine="Item.MablaghTakhfif=myCode.Is_Null_adad(Row.Get";
_item.MablaghTakhfif /*int*/  = (int)(Double.parseDouble(mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,BA.ObjectToString(_row.Get((Object)("fldMablaghTakhfif"))))));
RDebugUtils.currentLine=69599256;
 //BA.debugLineNum = 69599256;BA.debugLine="If Item.fldFeeBadAzTakhfif>0 Then";
if ((double)(Double.parseDouble(_item.fldFeeBadAzTakhfif /*String*/ ))>0) { 
RDebugUtils.currentLine=69599257;
 //BA.debugLineNum = 69599257;BA.debugLine="Item.TakhfifKala=Item.FeeForoosh-Item.FldFeeBa";
_item.TakhfifKala /*String*/  = BA.NumberToString(_item.FeeForoosh /*int*/ -(double)(Double.parseDouble(_item.fldFeeBadAzTakhfif /*String*/ )));
RDebugUtils.currentLine=69599258;
 //BA.debugLineNum = 69599258;BA.debugLine="FldTakhfifKala=FldTakhfifKala+Item.TakhfifKala";
_fldtakhfifkala = (int) (_fldtakhfifkala+(double)(Double.parseDouble(_item.TakhfifKala /*String*/ )));
 };
RDebugUtils.currentLine=69599260;
 //BA.debugLineNum = 69599260;BA.debugLine="If Item.MablaghTakhfif>0 Then";
if (_item.MablaghTakhfif /*int*/ >0) { 
RDebugUtils.currentLine=69599261;
 //BA.debugLineNum = 69599261;BA.debugLine="FldTakhfifVizhe=FldTakhfifVizhe+Item.MablaghTa";
_fldtakhfifvizhe = (int) (_fldtakhfifvizhe+_item.MablaghTakhfif /*int*/ );
 };
RDebugUtils.currentLine=69599263;
 //BA.debugLineNum = 69599263;BA.debugLine="Item.FldMablaghMasrafKonande=Row.Get(\"fldGhymat";
_item.FldMablaghMasrafKonande /*String*/  = BA.ObjectToString(_row.Get((Object)("fldGhymatMasrafkonande")));
RDebugUtils.currentLine=69599266;
 //BA.debugLineNum = 69599266;BA.debugLine="Faktor.Signature=Row.Get(\"FldSignatureBitmapStr";
_faktor.Signature /*String*/  = BA.ObjectToString(_row.Get((Object)("FldSignatureBitmapString")));
RDebugUtils.currentLine=69599267;
 //BA.debugLineNum = 69599267;BA.debugLine="Item.Tozihat=myCode.Is_Null(Row.Get(\"fldTozihat";
_item.Tozihat /*String*/  = mostCurrent._mycode._is_null /*String*/ (mostCurrent.activityBA,BA.ObjectToString(_row.Get((Object)("fldTozihatRecord"))));
RDebugUtils.currentLine=69599268;
 //BA.debugLineNum = 69599268;BA.debugLine="Faktor.fldTozihFaktor = myCode.Is_Null(Row.Get(";
_faktor.fldTozihFaktor /*String*/  = mostCurrent._mycode._is_null /*String*/ (mostCurrent.activityBA,BA.ObjectToString(_row.Get((Object)("fldTozihat"))));
RDebugUtils.currentLine=69599270;
 //BA.debugLineNum = 69599270;BA.debugLine="Listkala.Add(Item)";
mostCurrent._listkala.Add((Object)(_item));
 }
};
RDebugUtils.currentLine=69599272;
 //BA.debugLineNum = 69599272;BA.debugLine="Faktor.FldTakhfifKala=FldTakhfifKala";
_faktor.FldTakhfifKala /*String*/  = BA.NumberToString(_fldtakhfifkala);
RDebugUtils.currentLine=69599273;
 //BA.debugLineNum = 69599273;BA.debugLine="Faktor.FldTakhfifVizhe=FldTakhfifVizhe";
_faktor.FldTakhfifVizhe /*String*/  = BA.NumberToString(_fldtakhfifvizhe);
RDebugUtils.currentLine=69599275;
 //BA.debugLineNum = 69599275;BA.debugLine="MCode.IsOnlineDataFactor=0";
mostCurrent._mcode._isonlinedatafactor /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=69599276;
 //BA.debugLineNum = 69599276;BA.debugLine="CreatePge";
_createpge();
 }else {
RDebugUtils.currentLine=69599278;
 //BA.debugLineNum = 69599278;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=69599279;
 //BA.debugLineNum = 69599279;BA.debugLine="ToastMessageShow(\"خطا در دریافت اطلاعات\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("خطا در دریافت اطلاعات"),anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=69599281;
 //BA.debugLineNum = 69599281;BA.debugLine="End Sub";
return "";
}
public static void  _loadlistkalafaktor() throws Exception{
RDebugUtils.currentModule="act_rizfaktor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "loadlistkalafaktor", false))
	 {Debug.delegate(mostCurrent.activityBA, "loadlistkalafaktor", null); return;}
ResumableSub_LoadListKalaFaktor rsub = new ResumableSub_LoadListKalaFaktor(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_LoadListKalaFaktor extends BA.ResumableSub {
public ResumableSub_LoadListKalaFaktor(ir.parsikhesab.pakhsh.act_rizfaktor parent) {
this.parent = parent;
}
ir.parsikhesab.pakhsh.act_rizfaktor parent;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
int _i = 0;
ir.parsikhesab.pakhsh.mcode._adapterlistkala _item = null;
int _flddarsadarzeshafzode = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu1 = null;
int step12;
int limit12;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_rizfaktor";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=68485121;
 //BA.debugLineNum = 68485121;BA.debugLine="Sleep(200)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_rizfaktor", "loadlistkalafaktor"),(int) (200));
this.state = 65;
return;
case 65:
//C
this.state = 1;
;
RDebugUtils.currentLine=68485122;
 //BA.debugLineNum = 68485122;BA.debugLine="Listkala.Clear";
parent.mostCurrent._listkala.Clear();
RDebugUtils.currentLine=68485124;
 //BA.debugLineNum = 68485124;BA.debugLine="If MCode.IsOnlineDataFactor=0 Then";
if (true) break;

case 1:
//if
this.state = 59;
if ((parent.mostCurrent._mcode._isonlinedatafactor /*String*/ ).equals(BA.NumberToString(0))) { 
this.state = 3;
}else {
this.state = 58;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=68485125;
 //BA.debugLineNum = 68485125;BA.debugLine="lblShomareFactor.Text=MCode.FaktorSelect";
parent.mostCurrent._lblshomarefactor.setText(BA.ObjectToCharSequence(parent.mostCurrent._mcode._faktorselect /*String*/ ));
RDebugUtils.currentLine=68485126;
 //BA.debugLineNum = 68485126;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From T";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = parent.mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblFaktor Where FldShomareFaktor = '"+parent.mostCurrent._mcode._faktorselect /*String*/ +"' and FldC_Tafzili="+parent._faktor.fldC_Ashkhas /*String*/ );
RDebugUtils.currentLine=68485127;
 //BA.debugLineNum = 68485127;BA.debugLine="If Cu.RowCount>0 Then";
if (true) break;

case 4:
//if
this.state = 56;
if (_cu.getRowCount()>0) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=68485129;
 //BA.debugLineNum = 68485129;BA.debugLine="Faktor.fldDarsadArzeshAfzode=0";
parent._faktor.fldDarsadArzeshAfzode /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=68485130;
 //BA.debugLineNum = 68485130;BA.debugLine="Faktor.fldArzeshAfzode=0";
parent._faktor.fldArzeshAfzode /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=68485131;
 //BA.debugLineNum = 68485131;BA.debugLine="Faktor.FldTakhfifKala=0";
parent._faktor.FldTakhfifKala /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=68485132;
 //BA.debugLineNum = 68485132;BA.debugLine="Faktor.FldTakhfifVizhe=0";
parent._faktor.FldTakhfifVizhe /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=68485133;
 //BA.debugLineNum = 68485133;BA.debugLine="Faktor.fldSumMablaghBadAzTakhfif=0";
parent._faktor.fldSumMablaghBadAzTakhfif /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=68485135;
 //BA.debugLineNum = 68485135;BA.debugLine="For i=0 To Cu.RowCount-1";
if (true) break;

case 7:
//for
this.state = 55;
step12 = 1;
limit12 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
this.state = 66;
if (true) break;

case 66:
//C
this.state = 55;
if ((step12 > 0 && _i <= limit12) || (step12 < 0 && _i >= limit12)) this.state = 9;
if (true) break;

case 67:
//C
this.state = 66;
_i = ((int)(0 + _i + step12)) ;
if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=68485136;
 //BA.debugLineNum = 68485136;BA.debugLine="Try";
if (true) break;

case 10:
//try
this.state = 54;
this.catchState = 53;
this.state = 12;
if (true) break;

case 12:
//C
this.state = 13;
this.catchState = 53;
RDebugUtils.currentLine=68485137;
 //BA.debugLineNum = 68485137;BA.debugLine="Cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=68485138;
 //BA.debugLineNum = 68485138;BA.debugLine="Dim Item As AdapterListKala";
_item = new ir.parsikhesab.pakhsh.mcode._adapterlistkala();
RDebugUtils.currentLine=68485139;
 //BA.debugLineNum = 68485139;BA.debugLine="Item.CodeKala=Cu.Getstring(\"FldCodeKala\")";
_item.CodeKala /*String*/  = _cu.GetString("FldCodeKala");
RDebugUtils.currentLine=68485140;
 //BA.debugLineNum = 68485140;BA.debugLine="Item.NameKala=Cu.Getstring(\"FldNamekala\")";
_item.NameKala /*String*/  = _cu.GetString("FldNamekala");
RDebugUtils.currentLine=68485141;
 //BA.debugLineNum = 68485141;BA.debugLine="MCode.C_Tafzili=Cu.Getstring(\"FldC_Tafzili\")";
parent.mostCurrent._mcode._c_tafzili /*String*/  = _cu.GetString("FldC_Tafzili");
RDebugUtils.currentLine=68485142;
 //BA.debugLineNum = 68485142;BA.debugLine="Item.FeeForoosh=Cu.Getstring(\"FldFeeForoosh\")";
_item.FeeForoosh /*int*/  = (int)(Double.parseDouble(_cu.GetString("FldFeeForoosh")));
RDebugUtils.currentLine=68485143;
 //BA.debugLineNum = 68485143;BA.debugLine="Item.FldFeeBadAzTakhfif=Cu.Getstring(\"fldFeeB";
_item.fldFeeBadAzTakhfif /*String*/  = _cu.GetString("fldFeeBadAzTakhfif");
RDebugUtils.currentLine=68485144;
 //BA.debugLineNum = 68485144;BA.debugLine="Item.NameVahed=Cu.Getstring(\"FldNameVahed\")";
_item.NameVahed /*String*/  = _cu.GetString("FldNameVahed");
RDebugUtils.currentLine=68485145;
 //BA.debugLineNum = 68485145;BA.debugLine="Item.NameVahed2=Cu.Getstring(\"FldNameVahed2\")";
_item.NameVahed2 /*String*/  = _cu.GetString("FldNameVahed2");
RDebugUtils.currentLine=68485146;
 //BA.debugLineNum = 68485146;BA.debugLine="Item.fldPathPic=Cu.Getstring(\"fldPathPic\")";
_item.fldPathPic /*String*/  = _cu.GetString("fldPathPic");
RDebugUtils.currentLine=68485147;
 //BA.debugLineNum = 68485147;BA.debugLine="Item.TedadDarSabadJoz=Cu.Getstring(\"FldTedadD";
_item.TedadDarSabadJoz /*String*/  = _cu.GetString("FldTedadDarSabadJoz");
RDebugUtils.currentLine=68485148;
 //BA.debugLineNum = 68485148;BA.debugLine="Item.TedadDarSabadKol=Cu.Getstring(\"FldTedadD";
_item.TedadDarSabadKol /*String*/  = _cu.GetString("FldTedadDarSabadKol");
RDebugUtils.currentLine=68485149;
 //BA.debugLineNum = 68485149;BA.debugLine="Item.TedadDarKarton=Cu.Getstring(\"FldTedadDar";
_item.TedadDarKarton /*String*/  = _cu.GetString("FldTedadDarKarton");
RDebugUtils.currentLine=68485150;
 //BA.debugLineNum = 68485150;BA.debugLine="Item.FldMablaghMasrafKonande=Cu.Getstring(\"Fl";
_item.FldMablaghMasrafKonande /*String*/  = _cu.GetString("FldMablaghMasrafKonande");
RDebugUtils.currentLine=68485151;
 //BA.debugLineNum = 68485151;BA.debugLine="Item.MablaghTakhfif=myCode.Is_Null_adad(Cu.Ge";
_item.MablaghTakhfif /*int*/  = (int)(Double.parseDouble(parent.mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_cu.GetString("FldMablaghTakhfif"))));
RDebugUtils.currentLine=68485152;
 //BA.debugLineNum = 68485152;BA.debugLine="Item.fldDarsadTakhfif=myCode.Is_Null_adad(Cu.";
_item.fldDarsadTakhfif /*String*/  = parent.mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_cu.GetString("FldDarsadTakhfif"));
RDebugUtils.currentLine=68485153;
 //BA.debugLineNum = 68485153;BA.debugLine="Item.fldArzeshAfzode=myCode.Is_Null_adad(Cu.G";
_item.fldArzeshAfzode /*String*/  = parent.mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_cu.GetString("fldArzeshAfzode"));
RDebugUtils.currentLine=68485154;
 //BA.debugLineNum = 68485154;BA.debugLine="Dim fldDarsadArzeshAfzode  As Int=myCode.Is_N";
_flddarsadarzeshafzode = (int)(Double.parseDouble(parent.mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_cu.GetString("fldDarsadArzeshAfzode"))));
RDebugUtils.currentLine=68485155;
 //BA.debugLineNum = 68485155;BA.debugLine="Item.fldDarsadArzeshAfzode=fldDarsadArzeshAfz";
_item.fldDarsadArzeshAfzode /*String*/  = BA.NumberToString(_flddarsadarzeshafzode);
RDebugUtils.currentLine=68485156;
 //BA.debugLineNum = 68485156;BA.debugLine="Item.fldShomareForoosh=myCode.Is_Null_adad(Cu";
_item.fldShomareForoosh /*String*/  = parent.mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_cu.GetString("fldShomareForoosh"));
RDebugUtils.currentLine=68485157;
 //BA.debugLineNum = 68485157;BA.debugLine="Item.Tozihat=myCode.Is_Null(Cu.Getstring(\"Fld";
_item.Tozihat /*String*/  = parent.mostCurrent._mycode._is_null /*String*/ (mostCurrent.activityBA,_cu.GetString("FldTozihat"));
RDebugUtils.currentLine=68485158;
 //BA.debugLineNum = 68485158;BA.debugLine="Log(myCode.Is_Null(Cu.Getstring(\"FldTozih\")))";
anywheresoftware.b4a.keywords.Common.LogImpl("568485158",parent.mostCurrent._mycode._is_null /*String*/ (mostCurrent.activityBA,_cu.GetString("FldTozih")),0);
RDebugUtils.currentLine=68485159;
 //BA.debugLineNum = 68485159;BA.debugLine="Item.SumMande=myCode.Is_int(Cu.Getstring(\"Fld";
_item.SumMande /*String*/  = BA.NumberToString(parent.mostCurrent._mycode._is_int /*int*/ (mostCurrent.activityBA,_cu.GetString("FldSumMande")));
RDebugUtils.currentLine=68485160;
 //BA.debugLineNum = 68485160;BA.debugLine="Faktor.fldDarsadArzeshAfzode=fldDarsadArzeshA";
parent._faktor.fldDarsadArzeshAfzode /*String*/  = BA.NumberToString(_flddarsadarzeshafzode);
RDebugUtils.currentLine=68485161;
 //BA.debugLineNum = 68485161;BA.debugLine="Faktor.fldArzeshAfzode=myCode.Is_Null_adad(Fa";
parent._faktor.fldArzeshAfzode /*String*/  = BA.NumberToString((double)(Double.parseDouble(parent.mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,parent._faktor.fldArzeshAfzode /*String*/ )))+(double)(Double.parseDouble(parent.mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_cu.GetString("fldArzeshAfzode")))));
RDebugUtils.currentLine=68485163;
 //BA.debugLineNum = 68485163;BA.debugLine="Faktor.fldSumMablaghBadAzTakhfif=Faktor.fldSu";
parent._faktor.fldSumMablaghBadAzTakhfif /*String*/  = BA.NumberToString((double)(Double.parseDouble(parent._faktor.fldSumMablaghBadAzTakhfif /*String*/ ))+(double)(Double.parseDouble(_item.fldFeeBadAzTakhfif /*String*/ )));
RDebugUtils.currentLine=68485165;
 //BA.debugLineNum = 68485165;BA.debugLine="lblArzeshAfzode.Text=myCode.AdadToPrice(Fakto";
parent.mostCurrent._lblarzeshafzode.setText(BA.ObjectToCharSequence(parent.mostCurrent._mycode._adadtoprice /*String*/ (mostCurrent.activityBA,parent._faktor.fldArzeshAfzode /*String*/ )));
RDebugUtils.currentLine=68485167;
 //BA.debugLineNum = 68485167;BA.debugLine="Faktor.Signature=myCode.Is_Null(Cu.Getstring(";
parent._faktor.Signature /*String*/  = parent.mostCurrent._mycode._is_null /*String*/ (mostCurrent.activityBA,_cu.GetString("FldSignatureBitmapString"));
RDebugUtils.currentLine=68485168;
 //BA.debugLineNum = 68485168;BA.debugLine="Faktor.fldTozihFaktor=myCode.Is_Null(Cu.Getst";
parent._faktor.fldTozihFaktor /*String*/  = parent.mostCurrent._mycode._is_null /*String*/ (mostCurrent.activityBA,_cu.GetString("FldTozih"));
RDebugUtils.currentLine=68485169;
 //BA.debugLineNum = 68485169;BA.debugLine="Faktor.fldC_Tasvie = Cu.Getstring(\"FldVaziatP";
parent._faktor.fldC_Tasvie /*String*/  = _cu.GetString("FldVaziatPardakht");
RDebugUtils.currentLine=68485170;
 //BA.debugLineNum = 68485170;BA.debugLine="Faktor.fldTotalFaktor = myCode.Is_Null_adad(C";
parent._faktor.fldTotalFaktor /*String*/  = parent.mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_cu.GetString("FldTotalFaktor"));
RDebugUtils.currentLine=68485171;
 //BA.debugLineNum = 68485171;BA.debugLine="Faktor.FldTakhfifKala =Faktor.FldTakhfifKala+";
parent._faktor.FldTakhfifKala /*String*/  = BA.NumberToString((double)(Double.parseDouble(parent._faktor.FldTakhfifKala /*String*/ ))+(double)(Double.parseDouble(parent.mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_cu.GetString("FldSumMablaghTakhfifKala")))));
RDebugUtils.currentLine=68485172;
 //BA.debugLineNum = 68485172;BA.debugLine="Faktor.FldTakhfifVizhe =Faktor.FldTakhfifVizh";
parent._faktor.FldTakhfifVizhe /*String*/  = BA.NumberToString((double)(Double.parseDouble(parent._faktor.FldTakhfifVizhe /*String*/ ))+(double)(Double.parseDouble(parent.mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_cu.GetString("FldSumMablaghTakhfifVizhe")))));
RDebugUtils.currentLine=68485173;
 //BA.debugLineNum = 68485173;BA.debugLine="Faktor.fldMablaghKol = myCode.Is_Null_adad(Cu";
parent._faktor.fldMablaghKol /*String*/  = parent.mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_cu.GetString("FldMablaghKol"));
RDebugUtils.currentLine=68485174;
 //BA.debugLineNum = 68485174;BA.debugLine="Faktor.fldC_Ashkhas = Cu.Getstring(\"FldC_Tafz";
parent._faktor.fldC_Ashkhas /*String*/  = _cu.GetString("FldC_Tafzili");
RDebugUtils.currentLine=68485175;
 //BA.debugLineNum = 68485175;BA.debugLine="lblShomareForoosh.Text=Item.fldShomareForoosh";
parent.mostCurrent._lblshomareforoosh.setText(BA.ObjectToCharSequence(_item.fldShomareForoosh /*String*/ ));
RDebugUtils.currentLine=68485176;
 //BA.debugLineNum = 68485176;BA.debugLine="isMarjoei = Cu.Getstring(\"WIsBacked\")";
parent.mostCurrent._ismarjoei = _cu.GetString("WIsBacked");
RDebugUtils.currentLine=68485177;
 //BA.debugLineNum = 68485177;BA.debugLine="If isMarjoei=\"True\" Then";
if (true) break;

case 13:
//if
this.state = 18;
if ((parent.mostCurrent._ismarjoei).equals("True")) { 
this.state = 15;
}else {
this.state = 17;
}if (true) break;

case 15:
//C
this.state = 18;
RDebugUtils.currentLine=68485178;
 //BA.debugLineNum = 68485178;BA.debugLine="lblType.Text=\"فاکتور مرجوعی\"";
parent.mostCurrent._lbltype.setText(BA.ObjectToCharSequence("فاکتور مرجوعی"));
 if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=68485181;
 //BA.debugLineNum = 68485181;BA.debugLine="lblType.Text=\"فاکتور فروش\"";
parent.mostCurrent._lbltype.setText(BA.ObjectToCharSequence("فاکتور فروش"));
 if (true) break;
;
RDebugUtils.currentLine=68485183;
 //BA.debugLineNum = 68485183;BA.debugLine="If Cu.Getstring(\"FldSync\")=\"True\" Then";

case 18:
//if
this.state = 31;
if ((_cu.GetString("FldSync")).equals("True")) { 
this.state = 20;
}else {
this.state = 30;
}if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=68485184;
 //BA.debugLineNum = 68485184;BA.debugLine="Faktor.synced=True";
parent._faktor.synced /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=68485185;
 //BA.debugLineNum = 68485185;BA.debugLine="lblVaziat.Text=\"سفارش ارسال شده\"";
parent.mostCurrent._lblvaziat.setText(BA.ObjectToCharSequence("سفارش ارسال شده"));
RDebugUtils.currentLine=68485186;
 //BA.debugLineNum = 68485186;BA.debugLine="If lblShomareForoosh.Text>0   Then";
if (true) break;

case 21:
//if
this.state = 28;
if ((double)(Double.parseDouble(parent.mostCurrent._lblshomareforoosh.getText()))>0) { 
this.state = 23;
}if (true) break;

case 23:
//C
this.state = 24;
RDebugUtils.currentLine=68485187;
 //BA.debugLineNum = 68485187;BA.debugLine="lblVaziat.Text=\"سفارش تکمیل شده\"";
parent.mostCurrent._lblvaziat.setText(BA.ObjectToCharSequence("سفارش تکمیل شده"));
RDebugUtils.currentLine=68485188;
 //BA.debugLineNum = 68485188;BA.debugLine="Dim cu1 As Cursor=MCode.Result(\"Select * fr";
_cu1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu1 = parent.mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * from TblFaktor where fldShomareForoosh="+_item.fldShomareForoosh /*String*/ +" and WIsBacked='True'");
RDebugUtils.currentLine=68485189;
 //BA.debugLineNum = 68485189;BA.debugLine="If cu1.RowCount>0 And Cu.Getstring(\"FldType";
if (true) break;

case 24:
//if
this.state = 27;
if (_cu1.getRowCount()>0 && (_cu.GetString("FldType")).equals("Marjoee") == false) { 
this.state = 26;
}if (true) break;

case 26:
//C
this.state = 27;
RDebugUtils.currentLine=68485190;
 //BA.debugLineNum = 68485190;BA.debugLine="lblVaziat.Text=\"سفارش مرجوع شده\"";
parent.mostCurrent._lblvaziat.setText(BA.ObjectToCharSequence("سفارش مرجوع شده"));
 if (true) break;

case 27:
//C
this.state = 28;
;
 if (true) break;

case 28:
//C
this.state = 31;
;
 if (true) break;

case 30:
//C
this.state = 31;
RDebugUtils.currentLine=68485194;
 //BA.debugLineNum = 68485194;BA.debugLine="Faktor.synced=False";
parent._faktor.synced /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=68485195;
 //BA.debugLineNum = 68485195;BA.debugLine="lblVaziat.Text=\"سفارش ارسال نشده\"";
parent.mostCurrent._lblvaziat.setText(BA.ObjectToCharSequence("سفارش ارسال نشده"));
 if (true) break;
;
RDebugUtils.currentLine=68485199;
 //BA.debugLineNum = 68485199;BA.debugLine="If myCode.Is_Null_adad(Cu.Getstring(\"FldAmani";

case 31:
//if
this.state = 36;
if ((parent.mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_cu.GetString("FldAmani"))).equals(BA.NumberToString(0))) { 
this.state = 33;
}else {
this.state = 35;
}if (true) break;

case 33:
//C
this.state = 36;
RDebugUtils.currentLine=68485200;
 //BA.debugLineNum = 68485200;BA.debugLine="lblCheckAmani.Text=Chr(0xE835)";
parent.mostCurrent._lblcheckamani.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr(((int)0xe835))));
 if (true) break;

case 35:
//C
this.state = 36;
RDebugUtils.currentLine=68485203;
 //BA.debugLineNum = 68485203;BA.debugLine="lblCheckAmani.Text=Chr(0xE834)";
parent.mostCurrent._lblcheckamani.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr(((int)0xe834))));
 if (true) break;
;
RDebugUtils.currentLine=68485207;
 //BA.debugLineNum = 68485207;BA.debugLine="If Cu.Getstring(\"FldAmani\") =Null Then";

case 36:
//if
this.state = 39;
if (_cu.GetString("FldAmani")== null) { 
this.state = 38;
}if (true) break;

case 38:
//C
this.state = 39;
RDebugUtils.currentLine=68485208;
 //BA.debugLineNum = 68485208;BA.debugLine="MCode.SaveUpdate(\"Update TblFaktor Set FldAm";
parent.mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Update TblFaktor Set FldAmani='0' Where FldShomareFaktor = '"+parent.mostCurrent._mcode._faktorselect /*String*/ +"'");
 if (true) break;
;
RDebugUtils.currentLine=68485210;
 //BA.debugLineNum = 68485210;BA.debugLine="If Cu.Getstring(\"fldShomareForoosh\") =Null Th";

case 39:
//if
this.state = 42;
if (_cu.GetString("fldShomareForoosh")== null) { 
this.state = 41;
}if (true) break;

case 41:
//C
this.state = 42;
RDebugUtils.currentLine=68485211;
 //BA.debugLineNum = 68485211;BA.debugLine="MCode.SaveUpdate(\"Update TblFaktor Set fldSh";
parent.mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Update TblFaktor Set fldShomareForoosh='0' Where FldShomareFaktor = '"+parent.mostCurrent._mcode._faktorselect /*String*/ +"'");
 if (true) break;
;
RDebugUtils.currentLine=68485213;
 //BA.debugLineNum = 68485213;BA.debugLine="If Cu.Getstring(\"FldDarsadTakhfif\") =Null The";

case 42:
//if
this.state = 45;
if (_cu.GetString("FldDarsadTakhfif")== null) { 
this.state = 44;
}if (true) break;

case 44:
//C
this.state = 45;
RDebugUtils.currentLine=68485214;
 //BA.debugLineNum = 68485214;BA.debugLine="MCode.SaveUpdate(\"Update TblFaktor Set FldDa";
parent.mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Update TblFaktor Set FldDarsadTakhfif='0' Where FldShomareFaktor = '"+parent.mostCurrent._mcode._faktorselect /*String*/ +"'");
 if (true) break;

case 45:
//C
this.state = 46;
;
RDebugUtils.currentLine=68485221;
 //BA.debugLineNum = 68485221;BA.debugLine="Listkala.Add(Item)";
parent.mostCurrent._listkala.Add((Object)(_item));
RDebugUtils.currentLine=68485222;
 //BA.debugLineNum = 68485222;BA.debugLine="If MCode.SendMarjoie=1 And Item.fldShomareFor";
if (true) break;

case 46:
//if
this.state = 51;
if ((parent.mostCurrent._mcode._sendmarjoie /*String*/ ).equals(BA.NumberToString(1)) && (double)(Double.parseDouble(_item.fldShomareForoosh /*String*/ ))>0 && (_cu.GetString("FldType")).equals("Marjoee") == false) { 
this.state = 48;
}else {
this.state = 50;
}if (true) break;

case 48:
//C
this.state = 51;
RDebugUtils.currentLine=68485223;
 //BA.debugLineNum = 68485223;BA.debugLine="btnMarjooii.Enabled=True";
parent.mostCurrent._btnmarjooii.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 50:
//C
this.state = 51;
RDebugUtils.currentLine=68485225;
 //BA.debugLineNum = 68485225;BA.debugLine="btnMarjooii.Enabled=False";
parent.mostCurrent._btnmarjooii.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 51:
//C
this.state = 54;
;
 if (true) break;

case 53:
//C
this.state = 54;
this.catchState = 0;
RDebugUtils.currentLine=68485229;
 //BA.debugLineNum = 68485229;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("568485229",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 54:
//C
this.state = 67;
this.catchState = 0;
;
 if (true) break;
if (true) break;

case 55:
//C
this.state = 56;
;
 if (true) break;

case 56:
//C
this.state = 59;
;
 if (true) break;

case 58:
//C
this.state = 59;
RDebugUtils.currentLine=68485234;
 //BA.debugLineNum = 68485234;BA.debugLine="Listkala.Clear";
parent.mostCurrent._listkala.Clear();
RDebugUtils.currentLine=68485235;
 //BA.debugLineNum = 68485235;BA.debugLine="Log(\"load faktor online\")";
anywheresoftware.b4a.keywords.Common.LogImpl("568485235","load faktor online",0);
RDebugUtils.currentLine=68485236;
 //BA.debugLineNum = 68485236;BA.debugLine="ProgressDialogShow2(\"در حال دریافت اطلاعات . . .";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(mostCurrent.activityBA,BA.ObjectToCharSequence("در حال دریافت اطلاعات . . ."),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=68485237;
 //BA.debugLineNum = 68485237;BA.debugLine="MCode.C_Tafzili=Faktor.fldC_Ashkhas";
parent.mostCurrent._mcode._c_tafzili /*String*/  = parent._faktor.fldC_Ashkhas /*String*/ ;
RDebugUtils.currentLine=68485238;
 //BA.debugLineNum = 68485238;BA.debugLine="CallSubDelayed2(Service_Server,\"GetReportRizePis";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(parent.mostCurrent._service_server.getObject()),"GetReportRizePishFactor",(Object)(parent._faktor.fldShomareFaktor /*String*/ ));
RDebugUtils.currentLine=68485239;
 //BA.debugLineNum = 68485239;BA.debugLine="lblShomareFactor.Text=Faktor.fldShomareFaktor";
parent.mostCurrent._lblshomarefactor.setText(BA.ObjectToCharSequence(parent._faktor.fldShomareFaktor /*String*/ ));
RDebugUtils.currentLine=68485240;
 //BA.debugLineNum = 68485240;BA.debugLine="ProgressDialogShow2(\"لطفا صبر کنید . . .\",False)";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(mostCurrent.activityBA,BA.ObjectToCharSequence("لطفا صبر کنید . . ."),anywheresoftware.b4a.keywords.Common.False);
 if (true) break;
;
RDebugUtils.currentLine=68485244;
 //BA.debugLineNum = 68485244;BA.debugLine="If Faktor.synced = False Then";

case 59:
//if
this.state = 64;
if (parent._faktor.synced /*boolean*/ ==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 61;
}else {
this.state = 63;
}if (true) break;

case 61:
//C
this.state = 64;
RDebugUtils.currentLine=68485245;
 //BA.debugLineNum = 68485245;BA.debugLine="Btn_SendFactor.Enabled=True";
parent.mostCurrent._btn_sendfactor.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=68485246;
 //BA.debugLineNum = 68485246;BA.debugLine="Btn_del.Enabled=True";
parent.mostCurrent._btn_del.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=68485247;
 //BA.debugLineNum = 68485247;BA.debugLine="Btn_Edit.Enabled=True";
parent.mostCurrent._btn_edit.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 63:
//C
this.state = 64;
RDebugUtils.currentLine=68485250;
 //BA.debugLineNum = 68485250;BA.debugLine="Btn_del.Enabled=False";
parent.mostCurrent._btn_del.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=68485251;
 //BA.debugLineNum = 68485251;BA.debugLine="Btn_Edit.Enabled=False";
parent.mostCurrent._btn_edit.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 64:
//C
this.state = -1;
;
RDebugUtils.currentLine=68485254;
 //BA.debugLineNum = 68485254;BA.debugLine="CreatePge";
_createpge();
RDebugUtils.currentLine=68485255;
 //BA.debugLineNum = 68485255;BA.debugLine="End Sub";
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
public static String  _pnltozihat_click() throws Exception{
RDebugUtils.currentModule="act_rizfaktor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "pnltozihat_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "pnltozihat_click", null));}
RDebugUtils.currentLine=68616192;
 //BA.debugLineNum = 68616192;BA.debugLine="Sub PnlTozihat_Click";
RDebugUtils.currentLine=68616194;
 //BA.debugLineNum = 68616194;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper  _readblob(anywheresoftware.b4a.sql.SQL.CursorWrapper _cu) throws Exception{
RDebugUtils.currentModule="act_rizfaktor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "readblob", false))
	 {return ((anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) Debug.delegate(mostCurrent.activityBA, "readblob", new Object[] {_cu}));}
byte[] _buffer = null;
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _inputstream1 = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bitmap1 = null;
RDebugUtils.currentLine=69271552;
 //BA.debugLineNum = 69271552;BA.debugLine="Sub ReadBlob(Cu As Cursor) As Bitmap";
RDebugUtils.currentLine=69271553;
 //BA.debugLineNum = 69271553;BA.debugLine="Cu.Position = 0";
_cu.setPosition((int) (0));
RDebugUtils.currentLine=69271554;
 //BA.debugLineNum = 69271554;BA.debugLine="Dim Buffer() As Byte 'declare an empty byte array";
_buffer = new byte[(int) (0)];
;
RDebugUtils.currentLine=69271556;
 //BA.debugLineNum = 69271556;BA.debugLine="Buffer=MCode.Su.DecodeBase64(Cu.Getstring(\"FldSig";
_buffer = mostCurrent._mcode._su /*anywheresoftware.b4a.objects.StringUtils*/ .DecodeBase64(_cu.GetString("FldSignatureBitmapString"));
RDebugUtils.currentLine=69271558;
 //BA.debugLineNum = 69271558;BA.debugLine="Dim InputStream1 As InputStream";
_inputstream1 = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
RDebugUtils.currentLine=69271559;
 //BA.debugLineNum = 69271559;BA.debugLine="InputStream1.InitializeFromBytesArray(Buffer, 0,";
_inputstream1.InitializeFromBytesArray(_buffer,(int) (0),_buffer.length);
RDebugUtils.currentLine=69271566;
 //BA.debugLineNum = 69271566;BA.debugLine="Try";
try {RDebugUtils.currentLine=69271567;
 //BA.debugLineNum = 69271567;BA.debugLine="Dim Bitmap1 As Bitmap";
_bitmap1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=69271568;
 //BA.debugLineNum = 69271568;BA.debugLine="Bitmap1.Initialize2(InputStream1)";
_bitmap1.Initialize2((java.io.InputStream)(_inputstream1.getObject()));
RDebugUtils.currentLine=69271569;
 //BA.debugLineNum = 69271569;BA.debugLine="InputStream1.Close";
_inputstream1.Close();
RDebugUtils.currentLine=69271570;
 //BA.debugLineNum = 69271570;BA.debugLine="Return Bitmap1";
if (true) return _bitmap1;
 } 
       catch (Exception e12) {
			processBA.setLastException(e12);RDebugUtils.currentLine=69271572;
 //BA.debugLineNum = 69271572;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("569271572",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=69271573;
 //BA.debugLineNum = 69271573;BA.debugLine="Return Null";
if (true) return (anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null));
 };
RDebugUtils.currentLine=69271576;
 //BA.debugLineNum = 69271576;BA.debugLine="End Sub";
return null;
}
public static long  _takhfifkala() throws Exception{
RDebugUtils.currentModule="act_rizfaktor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "takhfifkala", false))
	 {return ((Long) Debug.delegate(mostCurrent.activityBA, "takhfifkala", null));}
String _takhfif = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu2 = null;
RDebugUtils.currentLine=69468160;
 //BA.debugLineNum = 69468160;BA.debugLine="Sub TakhfifKala As Long";
RDebugUtils.currentLine=69468161;
 //BA.debugLineNum = 69468161;BA.debugLine="Dim Takhfif As String";
_takhfif = "";
RDebugUtils.currentLine=69468162;
 //BA.debugLineNum = 69468162;BA.debugLine="Dim Cu2 As Cursor= MCode.Result(\"SELECT Sum((FldF";
_cu2 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu2 = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"SELECT Sum((FldFee - FldFeeBadAzTakhfif) * ((FldTedadKol*FldTedadKarton) + FldTedadJoz)) as SumTakhfif FROM TblFaktor Where FldShomareFaktor = '"+mostCurrent._mcode._faktorselect /*String*/ +"' And Cast(FldFeeBadAzTakhfif AS Int) > 0 ");
RDebugUtils.currentLine=69468163;
 //BA.debugLineNum = 69468163;BA.debugLine="Cu2.Position = 0";
_cu2.setPosition((int) (0));
RDebugUtils.currentLine=69468164;
 //BA.debugLineNum = 69468164;BA.debugLine="If Cu2.GetString(\"SumTakhfif\") <> Null Then";
if (_cu2.GetString("SumTakhfif")!= null) { 
RDebugUtils.currentLine=69468165;
 //BA.debugLineNum = 69468165;BA.debugLine="Takhfif = Cu2.GetString(\"SumTakhfif\")";
_takhfif = _cu2.GetString("SumTakhfif");
 }else {
RDebugUtils.currentLine=69468167;
 //BA.debugLineNum = 69468167;BA.debugLine="Takhfif = 0";
_takhfif = BA.NumberToString(0);
 };
RDebugUtils.currentLine=69468169;
 //BA.debugLineNum = 69468169;BA.debugLine="Log(\"تخفیف کالا : \" & Takhfif)";
anywheresoftware.b4a.keywords.Common.LogImpl("569468169","تخفیف کالا : "+_takhfif,0);
RDebugUtils.currentLine=69468170;
 //BA.debugLineNum = 69468170;BA.debugLine="Return Takhfif";
if (true) return (long)(Double.parseDouble(_takhfif));
RDebugUtils.currentLine=69468171;
 //BA.debugLineNum = 69468171;BA.debugLine="End Sub";
return 0L;
}
public static long  _takhfifriali(long _mablaghkhamfaktor) throws Exception{
RDebugUtils.currentModule="act_rizfaktor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "takhfifriali", false))
	 {return ((Long) Debug.delegate(mostCurrent.activityBA, "takhfifriali", new Object[] {_mablaghkhamfaktor}));}
long _takhfif = 0L;
RDebugUtils.currentLine=69337088;
 //BA.debugLineNum = 69337088;BA.debugLine="Sub TakhfifRiali(MablaghKhamFaktor As Long) As Lon";
RDebugUtils.currentLine=69337089;
 //BA.debugLineNum = 69337089;BA.debugLine="Dim Takhfif As Long";
_takhfif = 0L;
RDebugUtils.currentLine=69337090;
 //BA.debugLineNum = 69337090;BA.debugLine="If MCode.KharidBiashAz > 0 Then";
if ((double)(Double.parseDouble(mostCurrent._mcode._kharidbiashaz /*String*/ ))>0) { 
RDebugUtils.currentLine=69337091;
 //BA.debugLineNum = 69337091;BA.debugLine="If MablaghKhamFaktor >= MCode.KharidBiashAz Then";
if (_mablaghkhamfaktor>=(double)(Double.parseDouble(mostCurrent._mcode._kharidbiashaz /*String*/ ))) { 
RDebugUtils.currentLine=69337093;
 //BA.debugLineNum = 69337093;BA.debugLine="Log(\"تخفیف ریالی : \" & Takhfif)";
anywheresoftware.b4a.keywords.Common.LogImpl("569337093","تخفیف ریالی : "+BA.NumberToString(_takhfif),0);
RDebugUtils.currentLine=69337094;
 //BA.debugLineNum = 69337094;BA.debugLine="Return Takhfif";
if (true) return _takhfif;
 }else {
RDebugUtils.currentLine=69337096;
 //BA.debugLineNum = 69337096;BA.debugLine="Return 0";
if (true) return (long) (0);
 };
 }else {
RDebugUtils.currentLine=69337099;
 //BA.debugLineNum = 69337099;BA.debugLine="Return 0";
if (true) return (long) (0);
 };
RDebugUtils.currentLine=69337101;
 //BA.debugLineNum = 69337101;BA.debugLine="End Sub";
return 0L;
}
public static long  _takhfifvizhe(long _mablaghkhamfaktor) throws Exception{
RDebugUtils.currentModule="act_rizfaktor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "takhfifvizhe", false))
	 {return ((Long) Debug.delegate(mostCurrent.activityBA, "takhfifvizhe", new Object[] {_mablaghkhamfaktor}));}
long _takhfif = 0L;
RDebugUtils.currentLine=69402624;
 //BA.debugLineNum = 69402624;BA.debugLine="Sub TakhfifVizhe(MablaghKhamFaktor As Long) As Lon";
RDebugUtils.currentLine=69402625;
 //BA.debugLineNum = 69402625;BA.debugLine="Dim Takhfif As Long = (MCode.DarsadTakhfifVizhe/1";
_takhfif = (long) ((mostCurrent._mcode._darsadtakhfifvizhe /*int*/ /(double)100)*(_mablaghkhamfaktor-_takhfifkala()-_takhfifriali(_mablaghkhamfaktor)));
RDebugUtils.currentLine=69402626;
 //BA.debugLineNum = 69402626;BA.debugLine="Log(\"تخفیف ویژه : \" & Takhfif)";
anywheresoftware.b4a.keywords.Common.LogImpl("569402626","تخفیف ویژه : "+BA.NumberToString(_takhfif),0);
RDebugUtils.currentLine=69402627;
 //BA.debugLineNum = 69402627;BA.debugLine="Return Takhfif";
if (true) return _takhfif;
RDebugUtils.currentLine=69402628;
 //BA.debugLineNum = 69402628;BA.debugLine="End Sub";
return 0L;
}
}