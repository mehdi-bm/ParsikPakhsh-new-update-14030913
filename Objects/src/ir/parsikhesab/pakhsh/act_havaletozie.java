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

public class act_havaletozie extends Activity implements B4AActivity{
	public static act_havaletozie mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.act_havaletozie");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (act_havaletozie).");
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
		activityBA = new BA(this, layout, processBA, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.act_havaletozie");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "ir.parsikhesab.pakhsh.act_havaletozie", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (act_havaletozie) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (act_havaletozie) Resume **");
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
		return act_havaletozie.class;
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
            BA.LogInfo("** Activity (act_havaletozie) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (act_havaletozie) Pause event (activity is not paused). **");
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
            act_havaletozie mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (act_havaletozie) Resume **");
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
public anywheresoftware.b4a.objects.PanelWrapper _pnl_hlv = null;
public wir.hitex.recycler.Hitex_LayoutView _hlv = null;
public com.b4a.manamsoftware.PersianDate.ManamPersianDate _mpd = null;
public static String _dateaz = "";
public static String _dateta = "";
public anywheresoftware.b4a.objects.ButtonWrapper _btnta = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnaz = null;
public de.amberhome.objects.appcompat.ACSwitchCompatWrapper _swopen = null;
public de.amberhome.objects.appcompat.ACSwitchCompatWrapper _swclose = null;
public de.amberhome.objects.appcompat.ACSwitchCompatWrapper _swtoday = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtsearch = null;
public anywheresoftware.b4a.objects.collections.List _listhavale = null;
public anywheresoftware.b4a.objects.collections.List _originallisthavale = null;
public static String _orderby = "";
public anywheresoftware.b4a.objects.LabelWrapper _lbltedadtoday = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltedadclose = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltedadopen = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _img_sort = null;
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
RDebugUtils.currentModule="act_havaletozie";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=28639232;
 //BA.debugLineNum = 28639232;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=28639233;
 //BA.debugLineNum = 28639233;BA.debugLine="Try";
try {RDebugUtils.currentLine=28639234;
 //BA.debugLineNum = 28639234;BA.debugLine="Activity.LoadLayout(\"L_HavaleTozie\")";
mostCurrent._activity.LoadLayout("L_HavaleTozie",mostCurrent.activityBA);
RDebugUtils.currentLine=28639235;
 //BA.debugLineNum = 28639235;BA.debugLine="listHavale.Initialize";
mostCurrent._listhavale.Initialize();
RDebugUtils.currentLine=28639236;
 //BA.debugLineNum = 28639236;BA.debugLine="OriginallistHavale.Initialize";
mostCurrent._originallisthavale.Initialize();
RDebugUtils.currentLine=28639237;
 //BA.debugLineNum = 28639237;BA.debugLine="HLV.Initializer(\"HLV\").ListView.Build";
mostCurrent._hlv.Initializer(mostCurrent.activityBA,"HLV").ListView().Build();
RDebugUtils.currentLine=28639238;
 //BA.debugLineNum = 28639238;BA.debugLine="pnl_HLV.AddView(HLV,0,0,pnl_HLV.Width,pnl_HLV.Hei";
mostCurrent._pnl_hlv.AddView((android.view.View)(mostCurrent._hlv.getObject()),(int) (0),(int) (0),mostCurrent._pnl_hlv.getWidth(),mostCurrent._pnl_hlv.getHeight());
RDebugUtils.currentLine=28639239;
 //BA.debugLineNum = 28639239;BA.debugLine="HLV.Show";
mostCurrent._hlv.Show();
 } 
       catch (Exception e9) {
			processBA.setLastException(e9);RDebugUtils.currentLine=28639241;
 //BA.debugLineNum = 28639241;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("528639241",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=28639242;
 //BA.debugLineNum = 28639242;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-Activity_Create");
 };
RDebugUtils.currentLine=28639244;
 //BA.debugLineNum = 28639244;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="act_havaletozie";
RDebugUtils.currentLine=29229056;
 //BA.debugLineNum = 29229056;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=29229058;
 //BA.debugLineNum = 29229058;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="act_havaletozie";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=29163520;
 //BA.debugLineNum = 29163520;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=29163521;
 //BA.debugLineNum = 29163521;BA.debugLine="btnUpdate_Click";
_btnupdate_click();
RDebugUtils.currentLine=29163523;
 //BA.debugLineNum = 29163523;BA.debugLine="End Sub";
return "";
}
public static String  _btnupdate_click() throws Exception{
RDebugUtils.currentModule="act_havaletozie";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnupdate_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnupdate_click", null));}
RDebugUtils.currentLine=30212096;
 //BA.debugLineNum = 30212096;BA.debugLine="Private Sub btnUpdate_Click";
RDebugUtils.currentLine=30212098;
 //BA.debugLineNum = 30212098;BA.debugLine="Try";
try {RDebugUtils.currentLine=30212099;
 //BA.debugLineNum = 30212099;BA.debugLine="ProgressDialogShow(\"لطفا چند لحظه صبر کنید...\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("لطفا چند لحظه صبر کنید..."));
RDebugUtils.currentLine=30212100;
 //BA.debugLineNum = 30212100;BA.debugLine="MCode.page=\"Act_HavaleTozie\"";
mostCurrent._mcode._page /*String*/  = "Act_HavaleTozie";
RDebugUtils.currentLine=30212101;
 //BA.debugLineNum = 30212101;BA.debugLine="If MCode.IsConnected Then";
if (mostCurrent._mcode._isconnected /*boolean*/ (mostCurrent.activityBA)) { 
RDebugUtils.currentLine=30212102;
 //BA.debugLineNum = 30212102;BA.debugLine="MCode.GetHavaleFlag=0";
mostCurrent._mcode._gethavaleflag /*int*/  = (int) (0);
RDebugUtils.currentLine=30212104;
 //BA.debugLineNum = 30212104;BA.debugLine="CallSubDelayed(Service_Server,\"GetHavaleByUser\"";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,(Object)(mostCurrent._service_server.getObject()),"GetHavaleByUser");
 }else {
RDebugUtils.currentLine=30212106;
 //BA.debugLineNum = 30212106;BA.debugLine="LoadFilter";
_loadfilter();
 };
 } 
       catch (Exception e11) {
			processBA.setLastException(e11);RDebugUtils.currentLine=30212110;
 //BA.debugLineNum = 30212110;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("530212110",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=30212111;
 //BA.debugLineNum = 30212111;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-btnUpdate_Click");
 };
RDebugUtils.currentLine=30212118;
 //BA.debugLineNum = 30212118;BA.debugLine="End Sub";
return "";
}
public static boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
RDebugUtils.currentModule="act_havaletozie";
if (Debug.shouldDelegate(mostCurrent.activityBA, "application_error", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "application_error", new Object[] {_error,_stacktrace}));}
RDebugUtils.currentLine=30277632;
 //BA.debugLineNum = 30277632;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
RDebugUtils.currentLine=30277634;
 //BA.debugLineNum = 30277634;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=30277635;
 //BA.debugLineNum = 30277635;BA.debugLine="End Sub";
return false;
}
public static String  _btn_back_click() throws Exception{
RDebugUtils.currentModule="act_havaletozie";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_back_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_back_click", null));}
RDebugUtils.currentLine=29294592;
 //BA.debugLineNum = 29294592;BA.debugLine="Sub btn_Back_Click";
RDebugUtils.currentLine=29294593;
 //BA.debugLineNum = 29294593;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=29294594;
 //BA.debugLineNum = 29294594;BA.debugLine="End Sub";
return "";
}
public static String  _btn_sort_click() throws Exception{
RDebugUtils.currentModule="act_havaletozie";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_sort_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_sort_click", null));}
RDebugUtils.currentLine=30146560;
 //BA.debugLineNum = 30146560;BA.debugLine="Private Sub btn_sort_Click";
RDebugUtils.currentLine=30146562;
 //BA.debugLineNum = 30146562;BA.debugLine="End Sub";
return "";
}
public static String  _btnaz_click() throws Exception{
RDebugUtils.currentModule="act_havaletozie";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnaz_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnaz_click", null));}
com.porya.datetimepicker.PersianMaterialDatePickerWrapper _p = null;
RDebugUtils.currentLine=29360128;
 //BA.debugLineNum = 29360128;BA.debugLine="Sub BtnAz_Click";
RDebugUtils.currentLine=29360129;
 //BA.debugLineNum = 29360129;BA.debugLine="Try";
try {RDebugUtils.currentLine=29360130;
 //BA.debugLineNum = 29360130;BA.debugLine="Dim p As PersianMaterialDatePicker";
_p = new com.porya.datetimepicker.PersianMaterialDatePickerWrapper();
RDebugUtils.currentLine=29360131;
 //BA.debugLineNum = 29360131;BA.debugLine="p.Initialize(\"p\",p.PersianYear,p.PersianMonth,p.P";
_p.Initialize(mostCurrent.activityBA,"p",_p.getPersianYear(),_p.getPersianMonth(),_p.getPersianDay());
RDebugUtils.currentLine=29360132;
 //BA.debugLineNum = 29360132;BA.debugLine="p.AccentColor = Colors.RGB(83,99,255)";
_p.setAccentColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (83),(int) (99),(int) (255)));
RDebugUtils.currentLine=29360133;
 //BA.debugLineNum = 29360133;BA.debugLine="p.OkText = \"تایید\"";
_p.setOkText("تایید");
RDebugUtils.currentLine=29360134;
 //BA.debugLineNum = 29360134;BA.debugLine="p.CancelText = \"لغو\"";
_p.setCancelText("لغو");
RDebugUtils.currentLine=29360135;
 //BA.debugLineNum = 29360135;BA.debugLine="p.Title = \"از تاریخ\"";
_p.setTitle("از تاریخ");
RDebugUtils.currentLine=29360136;
 //BA.debugLineNum = 29360136;BA.debugLine="p.Typeface = \"iransansmonospacednum.ttf\"";
_p.setTypeface("iransansmonospacednum.ttf");
RDebugUtils.currentLine=29360137;
 //BA.debugLineNum = 29360137;BA.debugLine="p.Show(\"p\")";
_p.Show("p");
 } 
       catch (Exception e11) {
			processBA.setLastException(e11);RDebugUtils.currentLine=29360139;
 //BA.debugLineNum = 29360139;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("529360139",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=29360140;
 //BA.debugLineNum = 29360140;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-BtnAz_Click");
 };
RDebugUtils.currentLine=29360142;
 //BA.debugLineNum = 29360142;BA.debugLine="End Sub";
return "";
}
public static String  _btnta_click() throws Exception{
RDebugUtils.currentModule="act_havaletozie";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnta_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnta_click", null));}
com.porya.datetimepicker.PersianMaterialDatePickerWrapper _p1 = null;
RDebugUtils.currentLine=29622272;
 //BA.debugLineNum = 29622272;BA.debugLine="Sub BtnTa_Click";
RDebugUtils.currentLine=29622273;
 //BA.debugLineNum = 29622273;BA.debugLine="Try";
try {RDebugUtils.currentLine=29622274;
 //BA.debugLineNum = 29622274;BA.debugLine="Dim p1 As PersianMaterialDatePicker";
_p1 = new com.porya.datetimepicker.PersianMaterialDatePickerWrapper();
RDebugUtils.currentLine=29622275;
 //BA.debugLineNum = 29622275;BA.debugLine="p1.Initialize(\"p1\",p1.PersianYear,p1.PersianMonth";
_p1.Initialize(mostCurrent.activityBA,"p1",_p1.getPersianYear(),_p1.getPersianMonth(),_p1.getPersianDay());
RDebugUtils.currentLine=29622276;
 //BA.debugLineNum = 29622276;BA.debugLine="p1.AccentColor = Colors.RGB(83,99,255)";
_p1.setAccentColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (83),(int) (99),(int) (255)));
RDebugUtils.currentLine=29622277;
 //BA.debugLineNum = 29622277;BA.debugLine="p1.OkText = \"تایید\"";
_p1.setOkText("تایید");
RDebugUtils.currentLine=29622278;
 //BA.debugLineNum = 29622278;BA.debugLine="p1.CancelText = \"لغو\"";
_p1.setCancelText("لغو");
RDebugUtils.currentLine=29622279;
 //BA.debugLineNum = 29622279;BA.debugLine="p1.Title = \"تا تاریخ\"";
_p1.setTitle("تا تاریخ");
RDebugUtils.currentLine=29622280;
 //BA.debugLineNum = 29622280;BA.debugLine="p1.Typeface = \"iransansmonospacednum.ttf\"";
_p1.setTypeface("iransansmonospacednum.ttf");
RDebugUtils.currentLine=29622281;
 //BA.debugLineNum = 29622281;BA.debugLine="p1.Show(\"p1\")";
_p1.Show("p1");
 } 
       catch (Exception e11) {
			processBA.setLastException(e11);RDebugUtils.currentLine=29622283;
 //BA.debugLineNum = 29622283;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("529622283",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=29622284;
 //BA.debugLineNum = 29622284;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-BtnTa_Click");
 };
RDebugUtils.currentLine=29622286;
 //BA.debugLineNum = 29622286;BA.debugLine="End Sub";
return "";
}
public static String  _loadfilter() throws Exception{
RDebugUtils.currentModule="act_havaletozie";
if (Debug.shouldDelegate(mostCurrent.activityBA, "loadfilter", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "loadfilter", null));}
String _str = "";
int _countfilter = 0;
boolean _filter = false;
String _datep = "";
String _search = "";
RDebugUtils.currentLine=28704768;
 //BA.debugLineNum = 28704768;BA.debugLine="Public Sub LoadFilter";
RDebugUtils.currentLine=28704769;
 //BA.debugLineNum = 28704769;BA.debugLine="Try";
try {RDebugUtils.currentLine=28704770;
 //BA.debugLineNum = 28704770;BA.debugLine="Dim str As String=\"\"";
_str = "";
RDebugUtils.currentLine=28704771;
 //BA.debugLineNum = 28704771;BA.debugLine="Dim countfilter As Int=0";
_countfilter = (int) (0);
RDebugUtils.currentLine=28704772;
 //BA.debugLineNum = 28704772;BA.debugLine="Dim Filter As Boolean=False";
_filter = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=28704774;
 //BA.debugLineNum = 28704774;BA.debugLine="If SwOpen.Checked Then";
if (mostCurrent._swopen.getChecked()) { 
RDebugUtils.currentLine=28704775;
 //BA.debugLineNum = 28704775;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=28704776;
 //BA.debugLineNum = 28704776;BA.debugLine="str= str & \" and fldVaziat=1\"";
_str = _str+" and fldVaziat=1";
RDebugUtils.currentLine=28704777;
 //BA.debugLineNum = 28704777;BA.debugLine="Filter=True";
_filter = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=28704778;
 //BA.debugLineNum = 28704778;BA.debugLine="If countfilter=1 Then";
if (_countfilter==1) { 
RDebugUtils.currentLine=28704779;
 //BA.debugLineNum = 28704779;BA.debugLine="str=str.Replace(\" and \",\"\")";
_str = _str.replace(" and ","");
 };
 };
RDebugUtils.currentLine=28704783;
 //BA.debugLineNum = 28704783;BA.debugLine="If SwClose.Checked Then";
if (mostCurrent._swclose.getChecked()) { 
RDebugUtils.currentLine=28704784;
 //BA.debugLineNum = 28704784;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=28704785;
 //BA.debugLineNum = 28704785;BA.debugLine="str= str & \" and fldVaziat<>1\"";
_str = _str+" and fldVaziat<>1";
RDebugUtils.currentLine=28704786;
 //BA.debugLineNum = 28704786;BA.debugLine="Filter=True";
_filter = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=28704787;
 //BA.debugLineNum = 28704787;BA.debugLine="If countfilter=1 Then";
if (_countfilter==1) { 
RDebugUtils.currentLine=28704788;
 //BA.debugLineNum = 28704788;BA.debugLine="str=str.Replace(\" and \",\"\")";
_str = _str.replace(" and ","");
 };
 };
RDebugUtils.currentLine=28704792;
 //BA.debugLineNum = 28704792;BA.debugLine="If BtnAz.Text<>\"تعیین تاریخ\" And BtnTa.Text<>\"تع";
if ((mostCurrent._btnaz.getText()).equals("تعیین تاریخ") == false && (mostCurrent._btnta.getText()).equals("تعیین تاریخ") == false) { 
RDebugUtils.currentLine=28704793;
 //BA.debugLineNum = 28704793;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=28704794;
 //BA.debugLineNum = 28704794;BA.debugLine="str= str & \" and fldDate between \"&BtnAz.Text.R";
_str = _str+" and fldDate between "+mostCurrent._btnaz.getText().replace("/","")+" , "+mostCurrent._btnta.getText().replace("/","");
RDebugUtils.currentLine=28704795;
 //BA.debugLineNum = 28704795;BA.debugLine="Filter=True";
_filter = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=28704796;
 //BA.debugLineNum = 28704796;BA.debugLine="If countfilter=1 Then";
if (_countfilter==1) { 
RDebugUtils.currentLine=28704797;
 //BA.debugLineNum = 28704797;BA.debugLine="str=str.Replace(\" and \",\"\")";
_str = _str.replace(" and ","");
RDebugUtils.currentLine=28704798;
 //BA.debugLineNum = 28704798;BA.debugLine="str=str.Replace(\" , \",\" and \")";
_str = _str.replace(" , "," and ");
 };
 };
RDebugUtils.currentLine=28704803;
 //BA.debugLineNum = 28704803;BA.debugLine="If SwToday.Checked Then";
if (mostCurrent._swtoday.getChecked()) { 
RDebugUtils.currentLine=28704804;
 //BA.debugLineNum = 28704804;BA.debugLine="Dim datep As String =MCode.DatePersian";
_datep = mostCurrent._mcode._datepersian /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=28704805;
 //BA.debugLineNum = 28704805;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=28704806;
 //BA.debugLineNum = 28704806;BA.debugLine="str= str & \" and fldDate=\"&datep";
_str = _str+" and fldDate="+_datep;
RDebugUtils.currentLine=28704807;
 //BA.debugLineNum = 28704807;BA.debugLine="Filter=True";
_filter = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=28704808;
 //BA.debugLineNum = 28704808;BA.debugLine="If countfilter=1 Then";
if (_countfilter==1) { 
RDebugUtils.currentLine=28704809;
 //BA.debugLineNum = 28704809;BA.debugLine="str=str.Replace(\" and \",\"\")";
_str = _str.replace(" and ","");
 };
 };
RDebugUtils.currentLine=28704814;
 //BA.debugLineNum = 28704814;BA.debugLine="If TxtSearch.Text.Length>0 And TxtSearch.Text<>\"";
if (mostCurrent._txtsearch.getText().length()>0 && (mostCurrent._txtsearch.getText()).equals(" ") == false && (mostCurrent._txtsearch.getText()).equals("") == false) { 
RDebugUtils.currentLine=28704815;
 //BA.debugLineNum = 28704815;BA.debugLine="Dim Search As String=MCode.ConvertNumbersPersia";
_search = mostCurrent._mcode._convertnumberspersian2english /*String*/ (mostCurrent.activityBA,mostCurrent._txtsearch.getText());
RDebugUtils.currentLine=28704816;
 //BA.debugLineNum = 28704816;BA.debugLine="If Search=\"\" Then";
if ((_search).equals("")) { 
RDebugUtils.currentLine=28704817;
 //BA.debugLineNum = 28704817;BA.debugLine="Search=TxtSearch.Text";
_search = mostCurrent._txtsearch.getText();
 };
RDebugUtils.currentLine=28704819;
 //BA.debugLineNum = 28704819;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=28704820;
 //BA.debugLineNum = 28704820;BA.debugLine="If IsNumber(Search) Then";
if (anywheresoftware.b4a.keywords.Common.IsNumber(_search)) { 
RDebugUtils.currentLine=28704821;
 //BA.debugLineNum = 28704821;BA.debugLine="str = str & $\" and  (fldShomareHavale = '${Sea";
_str = _str+(" and  (fldShomareHavale = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_search))+"') ");
 };
RDebugUtils.currentLine=28704823;
 //BA.debugLineNum = 28704823;BA.debugLine="Filter=True";
_filter = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=28704824;
 //BA.debugLineNum = 28704824;BA.debugLine="If countfilter=1 Then";
if (_countfilter==1) { 
RDebugUtils.currentLine=28704825;
 //BA.debugLineNum = 28704825;BA.debugLine="str=str.Replace(\" and \",\"\")";
_str = _str.replace(" and ","");
 };
 };
RDebugUtils.currentLine=28704832;
 //BA.debugLineNum = 28704832;BA.debugLine="If Filter=True And str<>\"\" Then";
if (_filter==anywheresoftware.b4a.keywords.Common.True && (_str).equals("") == false) { 
RDebugUtils.currentLine=28704835;
 //BA.debugLineNum = 28704835;BA.debugLine="str=\"select * from TblHavale where \"&str&\" \" &";
_str = "select * from TblHavale where "+_str+" "+mostCurrent._orderby;
 }else {
RDebugUtils.currentLine=28704837;
 //BA.debugLineNum = 28704837;BA.debugLine="str=\"select * from TblHavale  \" & OrderBy";
_str = "select * from TblHavale  "+mostCurrent._orderby;
 };
RDebugUtils.currentLine=28704839;
 //BA.debugLineNum = 28704839;BA.debugLine="LoadHavale(str)";
_loadhavale(_str);
 } 
       catch (Exception e60) {
			processBA.setLastException(e60);RDebugUtils.currentLine=28704842;
 //BA.debugLineNum = 28704842;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("528704842",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=28704843;
 //BA.debugLineNum = 28704843;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-LoadFilter");
 };
RDebugUtils.currentLine=28704847;
 //BA.debugLineNum = 28704847;BA.debugLine="End Sub";
return "";
}
public static String  _checkvaziat(String _shomarehavale) throws Exception{
RDebugUtils.currentModule="act_havaletozie";
if (Debug.shouldDelegate(mostCurrent.activityBA, "checkvaziat", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "checkvaziat", new Object[] {_shomarehavale}));}
String _countall = "";
String _countvaziattahvilshode = "";
String _vaziat = "";
RDebugUtils.currentLine=28770304;
 //BA.debugLineNum = 28770304;BA.debugLine="Public Sub CheckVaziat(ShomareHavale As String) As";
RDebugUtils.currentLine=28770305;
 //BA.debugLineNum = 28770305;BA.debugLine="Dim countAll As String=0";
_countall = BA.NumberToString(0);
RDebugUtils.currentLine=28770306;
 //BA.debugLineNum = 28770306;BA.debugLine="Dim countVaziatTahvilShode As String=0";
_countvaziattahvilshode = BA.NumberToString(0);
RDebugUtils.currentLine=28770307;
 //BA.debugLineNum = 28770307;BA.debugLine="Dim vaziat As String=0";
_vaziat = BA.NumberToString(0);
RDebugUtils.currentLine=28770309;
 //BA.debugLineNum = 28770309;BA.debugLine="countAll=MCode.SingleResult($\"select count(fldSho";
_countall = BA.ObjectToString(mostCurrent._mcode._singleresult /*Object*/ (mostCurrent.activityBA,("select count(fldShomareHavale) from TblRizFactorHavale where fldShomareHavale="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_shomarehavale))+" ")));
RDebugUtils.currentLine=28770310;
 //BA.debugLineNum = 28770310;BA.debugLine="countVaziatTahvilShode=MCode.SingleResult($\"selec";
_countvaziattahvilshode = BA.ObjectToString(mostCurrent._mcode._singleresult /*Object*/ (mostCurrent.activityBA,("select count(fldShomareHavale) from TblRizFactorHavale where fldShomareHavale="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_shomarehavale))+" and fldVaziat=1 ")));
RDebugUtils.currentLine=28770311;
 //BA.debugLineNum = 28770311;BA.debugLine="If countAll=countVaziatTahvilShode Then";
if ((_countall).equals(_countvaziattahvilshode)) { 
RDebugUtils.currentLine=28770312;
 //BA.debugLineNum = 28770312;BA.debugLine="vaziat=1";
_vaziat = BA.NumberToString(1);
 };
RDebugUtils.currentLine=28770315;
 //BA.debugLineNum = 28770315;BA.debugLine="Return vaziat";
if (true) return _vaziat;
RDebugUtils.currentLine=28770316;
 //BA.debugLineNum = 28770316;BA.debugLine="End Sub";
return "";
}
public static int  _hlv_getitemcount() throws Exception{
RDebugUtils.currentModule="act_havaletozie";
if (Debug.shouldDelegate(mostCurrent.activityBA, "hlv_getitemcount", false))
	 {return ((Integer) Debug.delegate(mostCurrent.activityBA, "hlv_getitemcount", null));}
RDebugUtils.currentLine=29097984;
 //BA.debugLineNum = 29097984;BA.debugLine="Sub HLV_GetItemCount As Int 								        '💯 It";
RDebugUtils.currentLine=29097985;
 //BA.debugLineNum = 29097985;BA.debugLine="Return listHavale.Size '/ItemList.Size";
if (true) return mostCurrent._listhavale.getSize();
RDebugUtils.currentLine=29097986;
 //BA.debugLineNum = 29097986;BA.debugLine="End Sub";
return 0;
}
public static String  _hlv_itemclick(anywheresoftware.b4a.objects.PanelWrapper _clickeditem,int _position) throws Exception{
RDebugUtils.currentModule="act_havaletozie";
if (Debug.shouldDelegate(mostCurrent.activityBA, "hlv_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "hlv_itemclick", new Object[] {_clickeditem,_position}));}
ir.parsikhesab.pakhsh.cls_rec_havale _rec = null;
RDebugUtils.currentLine=29032448;
 //BA.debugLineNum = 29032448;BA.debugLine="Sub HLV_ItemClick (ClickedItem As Panel, Position";
RDebugUtils.currentLine=29032449;
 //BA.debugLineNum = 29032449;BA.debugLine="Dim rec As Cls_Rec_Havale=ClickedItem.Tag";
_rec = (ir.parsikhesab.pakhsh.cls_rec_havale)(_clickeditem.getTag());
RDebugUtils.currentLine=29032450;
 //BA.debugLineNum = 29032450;BA.debugLine="rec.lblShowHavale_Click";
_rec._lblshowhavale_click /*String*/ (null);
RDebugUtils.currentLine=29032451;
 //BA.debugLineNum = 29032451;BA.debugLine="End Sub";
return "";
}
public static String  _hlv_onbindviewholder(anywheresoftware.b4a.objects.PanelWrapper _parent,int _position) throws Exception{
RDebugUtils.currentModule="act_havaletozie";
if (Debug.shouldDelegate(mostCurrent.activityBA, "hlv_onbindviewholder", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "hlv_onbindviewholder", new Object[] {_parent,_position}));}
ir.parsikhesab.pakhsh.mcode._adapterephavale _item = null;
ir.parsikhesab.pakhsh.cls_rec_havale _rec = null;
RDebugUtils.currentLine=28966912;
 //BA.debugLineNum = 28966912;BA.debugLine="Sub HLV_onBindViewHolder (Parent As Panel, Positio";
RDebugUtils.currentLine=28966913;
 //BA.debugLineNum = 28966913;BA.debugLine="Dim item As AdapteRepHavale=listHavale.Get(Positi";
_item = (ir.parsikhesab.pakhsh.mcode._adapterephavale)(mostCurrent._listhavale.Get(_position));
RDebugUtils.currentLine=28966914;
 //BA.debugLineNum = 28966914;BA.debugLine="Dim rec As Cls_Rec_Havale=Parent.Tag";
_rec = (ir.parsikhesab.pakhsh.cls_rec_havale)(_parent.getTag());
RDebugUtils.currentLine=28966915;
 //BA.debugLineNum = 28966915;BA.debugLine="rec.show(item)";
_rec._show /*String*/ (null,_item);
RDebugUtils.currentLine=28966916;
 //BA.debugLineNum = 28966916;BA.debugLine="Parent.Height=rec.Height";
_parent.setHeight(_rec._getheight /*int*/ (null));
RDebugUtils.currentLine=28966917;
 //BA.debugLineNum = 28966917;BA.debugLine="End Sub";
return "";
}
public static String  _hlv_oncreateviewholder(anywheresoftware.b4a.objects.PanelWrapper _parent,int _viewtype) throws Exception{
RDebugUtils.currentModule="act_havaletozie";
if (Debug.shouldDelegate(mostCurrent.activityBA, "hlv_oncreateviewholder", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "hlv_oncreateviewholder", new Object[] {_parent,_viewtype}));}
ir.parsikhesab.pakhsh.cls_rec_havale _rec = null;
RDebugUtils.currentLine=28901376;
 //BA.debugLineNum = 28901376;BA.debugLine="Private Sub HLV_onCreateViewHolder (Parent As Pane";
RDebugUtils.currentLine=28901377;
 //BA.debugLineNum = 28901377;BA.debugLine="Dim rec As Cls_Rec_Havale";
_rec = new ir.parsikhesab.pakhsh.cls_rec_havale();
RDebugUtils.currentLine=28901378;
 //BA.debugLineNum = 28901378;BA.debugLine="rec.Initialize(Me)";
_rec._initialize /*String*/ (null,mostCurrent.activityBA,act_havaletozie.getObject());
RDebugUtils.currentLine=28901379;
 //BA.debugLineNum = 28901379;BA.debugLine="Parent.AddView(rec.Panel,0,0,100%x,rec.Height)";
_parent.AddView((android.view.View)(_rec._getpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ (null).getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),_rec._getheight /*int*/ (null));
RDebugUtils.currentLine=28901380;
 //BA.debugLineNum = 28901380;BA.debugLine="Parent.Tag=rec";
_parent.setTag((Object)(_rec));
RDebugUtils.currentLine=28901381;
 //BA.debugLineNum = 28901381;BA.debugLine="End Sub";
return "";
}
public static String  _img_sort_click() throws Exception{
RDebugUtils.currentModule="act_havaletozie";
if (Debug.shouldDelegate(mostCurrent.activityBA, "img_sort_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "img_sort_click", null));}
anywheresoftware.b4a.objects.collections.List _lst = null;
int _res = 0;
RDebugUtils.currentLine=30343168;
 //BA.debugLineNum = 30343168;BA.debugLine="Private Sub Img_sort_Click";
RDebugUtils.currentLine=30343169;
 //BA.debugLineNum = 30343169;BA.debugLine="Try";
try {RDebugUtils.currentLine=30343171;
 //BA.debugLineNum = 30343171;BA.debugLine="Dim Lst As List = Array As String(\"از قدیم به جد";
_lst = new anywheresoftware.b4a.objects.collections.List();
_lst = anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"از قدیم به جدید","از جدید به قدیم"});
RDebugUtils.currentLine=30343172;
 //BA.debugLineNum = 30343172;BA.debugLine="Dim res As Int = InputList(Lst,\"مرتب سازی براساس";
_res = anywheresoftware.b4a.keywords.Common.InputList(_lst,BA.ObjectToCharSequence("مرتب سازی براساس:"),(int) (-1),mostCurrent.activityBA);
RDebugUtils.currentLine=30343173;
 //BA.debugLineNum = 30343173;BA.debugLine="Select Case res";
switch (_res) {
case 0: {
RDebugUtils.currentLine=30343175;
 //BA.debugLineNum = 30343175;BA.debugLine="OrderBy = \" Order By fldShomareHavale Asc\"";
mostCurrent._orderby = " Order By fldShomareHavale Asc";
 break; }
case 1: {
RDebugUtils.currentLine=30343177;
 //BA.debugLineNum = 30343177;BA.debugLine="OrderBy = \" Order By fldShomareHavale Desc\"";
mostCurrent._orderby = " Order By fldShomareHavale Desc";
 break; }
}
;
RDebugUtils.currentLine=30343180;
 //BA.debugLineNum = 30343180;BA.debugLine="Log(OrderBy)";
anywheresoftware.b4a.keywords.Common.LogImpl("530343180",mostCurrent._orderby,0);
RDebugUtils.currentLine=30343182;
 //BA.debugLineNum = 30343182;BA.debugLine="LoadFilter";
_loadfilter();
 } 
       catch (Exception e13) {
			processBA.setLastException(e13);RDebugUtils.currentLine=30343184;
 //BA.debugLineNum = 30343184;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("530343184",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=30343185;
 //BA.debugLineNum = 30343185;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-Img_sort_Click");
 };
RDebugUtils.currentLine=30343187;
 //BA.debugLineNum = 30343187;BA.debugLine="End Sub";
return "";
}
public static String  _loadhavale(String _query) throws Exception{
RDebugUtils.currentModule="act_havaletozie";
if (Debug.shouldDelegate(mostCurrent.activityBA, "loadhavale", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "loadhavale", new Object[] {_query}));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
int _i = 0;
ir.parsikhesab.pakhsh.mcode._adapterephavale _item = null;
RDebugUtils.currentLine=28835840;
 //BA.debugLineNum = 28835840;BA.debugLine="Public Sub LoadHavale(query As String)";
RDebugUtils.currentLine=28835841;
 //BA.debugLineNum = 28835841;BA.debugLine="Try";
try {RDebugUtils.currentLine=28835842;
 //BA.debugLineNum = 28835842;BA.debugLine="listHavale.Clear";
mostCurrent._listhavale.Clear();
RDebugUtils.currentLine=28835843;
 //BA.debugLineNum = 28835843;BA.debugLine="OriginallistHavale.Clear";
mostCurrent._originallisthavale.Clear();
RDebugUtils.currentLine=28835844;
 //BA.debugLineNum = 28835844;BA.debugLine="Dim cu As Cursor";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=28835845;
 //BA.debugLineNum = 28835845;BA.debugLine="cu=MCode.Result(query)";
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,_query);
RDebugUtils.currentLine=28835846;
 //BA.debugLineNum = 28835846;BA.debugLine="If	cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=28835847;
 //BA.debugLineNum = 28835847;BA.debugLine="For i=0 To cu.RowCount-1";
{
final int step7 = 1;
final int limit7 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
RDebugUtils.currentLine=28835848;
 //BA.debugLineNum = 28835848;BA.debugLine="cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=28835849;
 //BA.debugLineNum = 28835849;BA.debugLine="Dim item As AdapteRepHavale";
_item = new ir.parsikhesab.pakhsh.mcode._adapterephavale();
RDebugUtils.currentLine=28835850;
 //BA.debugLineNum = 28835850;BA.debugLine="item.fldShomareHavale=cu.GetString(\"fldShomareH";
_item.fldShomareHavale /*String*/  = _cu.GetString("fldShomareHavale");
RDebugUtils.currentLine=28835851;
 //BA.debugLineNum = 28835851;BA.debugLine="item.fldDate=cu.GetString(\"fldDate\")";
_item.fldDate /*String*/  = _cu.GetString("fldDate");
RDebugUtils.currentLine=28835852;
 //BA.debugLineNum = 28835852;BA.debugLine="item.fldVaziat=cu.GetString(\"fldVaziat\")'CheckV";
_item.fldVaziat /*String*/  = _cu.GetString("fldVaziat");
RDebugUtils.currentLine=28835853;
 //BA.debugLineNum = 28835853;BA.debugLine="item.fldMandeFactor=cu.GetString(\"fldMandeFacto";
_item.fldMandeFactor /*String*/  = _cu.GetString("fldMandeFactor");
RDebugUtils.currentLine=28835854;
 //BA.debugLineNum = 28835854;BA.debugLine="item.fldCountFactor=cu.GetString(\"fldCountFacto";
_item.fldCountFactor /*String*/  = _cu.GetString("fldCountFactor");
RDebugUtils.currentLine=28835855;
 //BA.debugLineNum = 28835855;BA.debugLine="OriginallistHavale.Add(item)";
mostCurrent._originallisthavale.Add((Object)(_item));
 }
};
RDebugUtils.currentLine=28835857;
 //BA.debugLineNum = 28835857;BA.debugLine="cu.Close";
_cu.Close();
 };
RDebugUtils.currentLine=28835860;
 //BA.debugLineNum = 28835860;BA.debugLine="listHavale=OriginallistHavale";
mostCurrent._listhavale = mostCurrent._originallisthavale;
RDebugUtils.currentLine=28835861;
 //BA.debugLineNum = 28835861;BA.debugLine="If	SwToday.Checked Then";
if (mostCurrent._swtoday.getChecked()) { 
RDebugUtils.currentLine=28835862;
 //BA.debugLineNum = 28835862;BA.debugLine="LblTedadToday.Text=listHavale.Size";
mostCurrent._lbltedadtoday.setText(BA.ObjectToCharSequence(mostCurrent._listhavale.getSize()));
 }else {
RDebugUtils.currentLine=28835864;
 //BA.debugLineNum = 28835864;BA.debugLine="LblTedadToday.Text=0";
mostCurrent._lbltedadtoday.setText(BA.ObjectToCharSequence(0));
 };
RDebugUtils.currentLine=28835866;
 //BA.debugLineNum = 28835866;BA.debugLine="If	SwOpen.Checked Then";
if (mostCurrent._swopen.getChecked()) { 
RDebugUtils.currentLine=28835867;
 //BA.debugLineNum = 28835867;BA.debugLine="lblTedadOpen.Text=listHavale.Size";
mostCurrent._lbltedadopen.setText(BA.ObjectToCharSequence(mostCurrent._listhavale.getSize()));
 }else {
RDebugUtils.currentLine=28835869;
 //BA.debugLineNum = 28835869;BA.debugLine="lblTedadOpen.Text=0";
mostCurrent._lbltedadopen.setText(BA.ObjectToCharSequence(0));
 };
RDebugUtils.currentLine=28835871;
 //BA.debugLineNum = 28835871;BA.debugLine="If	SwClose.Checked Then";
if (mostCurrent._swclose.getChecked()) { 
RDebugUtils.currentLine=28835872;
 //BA.debugLineNum = 28835872;BA.debugLine="LblTedadClose.Text=listHavale.Size";
mostCurrent._lbltedadclose.setText(BA.ObjectToCharSequence(mostCurrent._listhavale.getSize()));
 }else {
RDebugUtils.currentLine=28835874;
 //BA.debugLineNum = 28835874;BA.debugLine="LblTedadClose.Text=0";
mostCurrent._lbltedadclose.setText(BA.ObjectToCharSequence(0));
 };
RDebugUtils.currentLine=28835877;
 //BA.debugLineNum = 28835877;BA.debugLine="HLV.notifyDataSetChanged";
mostCurrent._hlv.notifyDataSetChanged();
 } 
       catch (Exception e37) {
			processBA.setLastException(e37);RDebugUtils.currentLine=28835879;
 //BA.debugLineNum = 28835879;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("528835879",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=28835880;
 //BA.debugLineNum = 28835880;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-LoadHavale");
 };
RDebugUtils.currentLine=28835882;
 //BA.debugLineNum = 28835882;BA.debugLine="End Sub";
return "";
}
public static String  _p_oncancel() throws Exception{
RDebugUtils.currentModule="act_havaletozie";
if (Debug.shouldDelegate(mostCurrent.activityBA, "p_oncancel", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "p_oncancel", null));}
RDebugUtils.currentLine=29491200;
 //BA.debugLineNum = 29491200;BA.debugLine="Sub p_onCancel";
RDebugUtils.currentLine=29491201;
 //BA.debugLineNum = 29491201;BA.debugLine="Log(\"cancel\")";
anywheresoftware.b4a.keywords.Common.LogImpl("529491201","cancel",0);
RDebugUtils.currentLine=29491202;
 //BA.debugLineNum = 29491202;BA.debugLine="End Sub";
return "";
}
public static String  _p_ondateset(int _year,int _month,int _day) throws Exception{
RDebugUtils.currentModule="act_havaletozie";
if (Debug.shouldDelegate(mostCurrent.activityBA, "p_ondateset", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "p_ondateset", new Object[] {_year,_month,_day}));}
RDebugUtils.currentLine=29425664;
 //BA.debugLineNum = 29425664;BA.debugLine="Sub p_onDateSet(year As Int,month As Int,day As In";
RDebugUtils.currentLine=29425665;
 //BA.debugLineNum = 29425665;BA.debugLine="Try";
try {RDebugUtils.currentLine=29425666;
 //BA.debugLineNum = 29425666;BA.debugLine="Log(year&\"/\"&month&\"/\"&day)";
anywheresoftware.b4a.keywords.Common.LogImpl("529425666",BA.NumberToString(_year)+"/"+BA.NumberToString(_month)+"/"+BA.NumberToString(_day),0);
RDebugUtils.currentLine=29425667;
 //BA.debugLineNum = 29425667;BA.debugLine="BtnAz.Text=year&\"/\"&NumberFormat(month,2,0)&\"/\"&N";
mostCurrent._btnaz.setText(BA.ObjectToCharSequence(BA.NumberToString(_year)+"/"+anywheresoftware.b4a.keywords.Common.NumberFormat(_month,(int) (2),(int) (0))+"/"+anywheresoftware.b4a.keywords.Common.NumberFormat(_day,(int) (2),(int) (0))));
RDebugUtils.currentLine=29425668;
 //BA.debugLineNum = 29425668;BA.debugLine="BtnAz.Tag=year&NumberFormat(month,2,0)&NumberForm";
mostCurrent._btnaz.setTag((Object)(BA.NumberToString(_year)+anywheresoftware.b4a.keywords.Common.NumberFormat(_month,(int) (2),(int) (0))+anywheresoftware.b4a.keywords.Common.NumberFormat(_day,(int) (2),(int) (0))));
RDebugUtils.currentLine=29425669;
 //BA.debugLineNum = 29425669;BA.debugLine="DateAz=MPD.PersianToGregorian(year,month,day)";
mostCurrent._dateaz = mostCurrent._mpd.PersianToGregorian(_year,_month,_day);
RDebugUtils.currentLine=29425672;
 //BA.debugLineNum = 29425672;BA.debugLine="DateAz=year&NumberFormat(month,2,0)&NumberFormat(";
mostCurrent._dateaz = BA.NumberToString(_year)+anywheresoftware.b4a.keywords.Common.NumberFormat(_month,(int) (2),(int) (0))+anywheresoftware.b4a.keywords.Common.NumberFormat(_day,(int) (2),(int) (0));
RDebugUtils.currentLine=29425673;
 //BA.debugLineNum = 29425673;BA.debugLine="LogColor(DateAz,Colors.Magenta)";
anywheresoftware.b4a.keywords.Common.LogImpl("529425673",mostCurrent._dateaz,anywheresoftware.b4a.keywords.Common.Colors.Magenta);
 } 
       catch (Exception e9) {
			processBA.setLastException(e9);RDebugUtils.currentLine=29425675;
 //BA.debugLineNum = 29425675;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("529425675",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=29425676;
 //BA.debugLineNum = 29425676;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-p_onDateSet");
 };
RDebugUtils.currentLine=29425678;
 //BA.debugLineNum = 29425678;BA.debugLine="End Sub";
return "";
}
public static String  _p_ondismiss() throws Exception{
RDebugUtils.currentModule="act_havaletozie";
if (Debug.shouldDelegate(mostCurrent.activityBA, "p_ondismiss", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "p_ondismiss", null));}
RDebugUtils.currentLine=29556736;
 //BA.debugLineNum = 29556736;BA.debugLine="Sub p_onDismiss";
RDebugUtils.currentLine=29556737;
 //BA.debugLineNum = 29556737;BA.debugLine="Log(\"dismiss1\")";
anywheresoftware.b4a.keywords.Common.LogImpl("529556737","dismiss1",0);
RDebugUtils.currentLine=29556738;
 //BA.debugLineNum = 29556738;BA.debugLine="LoadFilter";
_loadfilter();
RDebugUtils.currentLine=29556739;
 //BA.debugLineNum = 29556739;BA.debugLine="End Sub";
return "";
}
public static String  _p1_oncancel() throws Exception{
RDebugUtils.currentModule="act_havaletozie";
if (Debug.shouldDelegate(mostCurrent.activityBA, "p1_oncancel", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "p1_oncancel", null));}
RDebugUtils.currentLine=29753344;
 //BA.debugLineNum = 29753344;BA.debugLine="Sub p1_onCancel";
RDebugUtils.currentLine=29753345;
 //BA.debugLineNum = 29753345;BA.debugLine="Log(\"cancel\")";
anywheresoftware.b4a.keywords.Common.LogImpl("529753345","cancel",0);
RDebugUtils.currentLine=29753346;
 //BA.debugLineNum = 29753346;BA.debugLine="End Sub";
return "";
}
public static String  _p1_ondateset(int _year,int _month,int _day) throws Exception{
RDebugUtils.currentModule="act_havaletozie";
if (Debug.shouldDelegate(mostCurrent.activityBA, "p1_ondateset", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "p1_ondateset", new Object[] {_year,_month,_day}));}
RDebugUtils.currentLine=29687808;
 //BA.debugLineNum = 29687808;BA.debugLine="Sub p1_onDateSet(year As Int,month As Int,day As I";
RDebugUtils.currentLine=29687809;
 //BA.debugLineNum = 29687809;BA.debugLine="Try";
try {RDebugUtils.currentLine=29687810;
 //BA.debugLineNum = 29687810;BA.debugLine="Log(year&\"/\"&month&\"/\"&day)";
anywheresoftware.b4a.keywords.Common.LogImpl("529687810",BA.NumberToString(_year)+"/"+BA.NumberToString(_month)+"/"+BA.NumberToString(_day),0);
RDebugUtils.currentLine=29687811;
 //BA.debugLineNum = 29687811;BA.debugLine="BtnTa.Text=year&\"/\"&NumberFormat(month,2,0)&\"/\"&N";
mostCurrent._btnta.setText(BA.ObjectToCharSequence(BA.NumberToString(_year)+"/"+anywheresoftware.b4a.keywords.Common.NumberFormat(_month,(int) (2),(int) (0))+"/"+anywheresoftware.b4a.keywords.Common.NumberFormat(_day,(int) (2),(int) (0))));
RDebugUtils.currentLine=29687812;
 //BA.debugLineNum = 29687812;BA.debugLine="BtnTa.Tag=year&NumberFormat(month,2,0)&NumberForm";
mostCurrent._btnta.setTag((Object)(BA.NumberToString(_year)+anywheresoftware.b4a.keywords.Common.NumberFormat(_month,(int) (2),(int) (0))+anywheresoftware.b4a.keywords.Common.NumberFormat(_day,(int) (2),(int) (0))));
RDebugUtils.currentLine=29687813;
 //BA.debugLineNum = 29687813;BA.debugLine="DateTa= MPD.PersianToGregorian(year,month,day)";
mostCurrent._dateta = mostCurrent._mpd.PersianToGregorian(_year,_month,_day);
RDebugUtils.currentLine=29687816;
 //BA.debugLineNum = 29687816;BA.debugLine="DateTa=year&NumberFormat(month,2,0)&NumberFormat(";
mostCurrent._dateta = BA.NumberToString(_year)+anywheresoftware.b4a.keywords.Common.NumberFormat(_month,(int) (2),(int) (0))+anywheresoftware.b4a.keywords.Common.NumberFormat(_day,(int) (2),(int) (0));
RDebugUtils.currentLine=29687817;
 //BA.debugLineNum = 29687817;BA.debugLine="LogColor(DateTa,Colors.Magenta)";
anywheresoftware.b4a.keywords.Common.LogImpl("529687817",mostCurrent._dateta,anywheresoftware.b4a.keywords.Common.Colors.Magenta);
 } 
       catch (Exception e9) {
			processBA.setLastException(e9);RDebugUtils.currentLine=29687819;
 //BA.debugLineNum = 29687819;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("529687819",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=29687820;
 //BA.debugLineNum = 29687820;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-p1_onDateSet");
 };
RDebugUtils.currentLine=29687822;
 //BA.debugLineNum = 29687822;BA.debugLine="End Sub";
return "";
}
public static String  _p1_ondismiss() throws Exception{
RDebugUtils.currentModule="act_havaletozie";
if (Debug.shouldDelegate(mostCurrent.activityBA, "p1_ondismiss", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "p1_ondismiss", null));}
RDebugUtils.currentLine=29818880;
 //BA.debugLineNum = 29818880;BA.debugLine="Sub p1_onDismiss";
RDebugUtils.currentLine=29818881;
 //BA.debugLineNum = 29818881;BA.debugLine="Log(\"dismiss\")";
anywheresoftware.b4a.keywords.Common.LogImpl("529818881","dismiss",0);
RDebugUtils.currentLine=29818882;
 //BA.debugLineNum = 29818882;BA.debugLine="LoadFilter";
_loadfilter();
RDebugUtils.currentLine=29818883;
 //BA.debugLineNum = 29818883;BA.debugLine="End Sub";
return "";
}
public static String  _swclose_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="act_havaletozie";
if (Debug.shouldDelegate(mostCurrent.activityBA, "swclose_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "swclose_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=29949952;
 //BA.debugLineNum = 29949952;BA.debugLine="Private Sub SwClose_CheckedChange(Checked As Boole";
RDebugUtils.currentLine=29949953;
 //BA.debugLineNum = 29949953;BA.debugLine="LoadFilter";
_loadfilter();
RDebugUtils.currentLine=29949954;
 //BA.debugLineNum = 29949954;BA.debugLine="End Sub";
return "";
}
public static String  _swopen_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="act_havaletozie";
if (Debug.shouldDelegate(mostCurrent.activityBA, "swopen_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "swopen_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=29884416;
 //BA.debugLineNum = 29884416;BA.debugLine="Private Sub SwOpen_CheckedChange(Checked As Boolea";
RDebugUtils.currentLine=29884417;
 //BA.debugLineNum = 29884417;BA.debugLine="LoadFilter";
_loadfilter();
RDebugUtils.currentLine=29884418;
 //BA.debugLineNum = 29884418;BA.debugLine="End Sub";
return "";
}
public static String  _swtoday_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="act_havaletozie";
if (Debug.shouldDelegate(mostCurrent.activityBA, "swtoday_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "swtoday_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=30015488;
 //BA.debugLineNum = 30015488;BA.debugLine="Private Sub SwToday_CheckedChange(Checked As Boole";
RDebugUtils.currentLine=30015489;
 //BA.debugLineNum = 30015489;BA.debugLine="LoadFilter";
_loadfilter();
RDebugUtils.currentLine=30015490;
 //BA.debugLineNum = 30015490;BA.debugLine="End Sub";
return "";
}
public static String  _txtsearch_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="act_havaletozie";
if (Debug.shouldDelegate(mostCurrent.activityBA, "txtsearch_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "txtsearch_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=30081024;
 //BA.debugLineNum = 30081024;BA.debugLine="Private Sub TxtSearch_TextChanged (Old As String,";
RDebugUtils.currentLine=30081025;
 //BA.debugLineNum = 30081025;BA.debugLine="LoadFilter";
_loadfilter();
RDebugUtils.currentLine=30081026;
 //BA.debugLineNum = 30081026;BA.debugLine="End Sub";
return "";
}
}