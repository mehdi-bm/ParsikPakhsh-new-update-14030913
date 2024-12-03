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

public class act_moshtarian extends Activity implements B4AActivity{
	public static act_moshtarian mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.act_moshtarian");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (act_moshtarian).");
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
		activityBA = new BA(this, layout, processBA, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.act_moshtarian");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "ir.parsikhesab.pakhsh.act_moshtarian", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (act_moshtarian) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (act_moshtarian) Resume **");
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
		return act_moshtarian.class;
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
            BA.LogInfo("** Activity (act_moshtarian) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (act_moshtarian) Pause event (activity is not paused). **");
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
            act_moshtarian mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (act_moshtarian) Resume **");
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
public static anywheresoftware.b4a.objects.Timer _t_gps = null;
public wir.hitex.recycler.Hitex_Utils _utils = null;
public anywheresoftware.b4a.objects.IME _key = null;
public anywheresoftware.b4a.objects.collections.List _listashkhas = null;
public anywheresoftware.b4a.objects.collections.List _orginallistashkhas = null;
public anywheresoftware.b4a.sql.SQL.CursorWrapper _cuashkhas = null;
public nicespinnerwrapper.niceSpinnerWrapper _nicespinner = null;
public nicespinnerwrapper.niceSpinnerWrapper _nicespinner1 = null;
public ir.parsikhesab.pakhsh.b4xcombobox _b4xcombobox1 = null;
public ir.parsikhesab.pakhsh.b4xcombobox _b4xcombobox2 = null;
public anywheresoftware.b4a.objects.collections.List _listgoroohashkhas = null;
public anywheresoftware.b4a.objects.collections.List _originallistgoroohashkhas = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnl_hlv = null;
public wir.hitex.recycler.Hitex_LayoutView _hlv = null;
public anywheresoftware.b4a.objects.collections.List _listmantaghe = null;
public static String _date = "";
public anywheresoftware.b4a.objects.EditTextWrapper _txtsearch = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltedadvisit = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltedadsefaresh = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltedadkol = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlspgroup = null;
public anywheresoftware.b4a.objects.LabelWrapper _btn_sort = null;
public de.amberhome.objects.appcompat.ACSwitchCompatWrapper _swtour = null;
public de.amberhome.objects.appcompat.ACSwitchCompatWrapper _swbed = null;
public static String _str_sort = "";
public static String _groupcodeselect1 = "";
public static String _groupnameselect1 = "";
public static String _groupcodeselect2 = "";
public static String _groupnameselect2 = "";
public static int _countvisit = 0;
public static int _countsefaresh = 0;
public anywheresoftware.b4a.objects.collections.List _lstselectedcodegroupashkhas = null;
public static int _tcount = 0;
public de.amberhome.objects.appcompat.ACSwitchCompatWrapper _swbes = null;
public anywheresoftware.b4a.objects.MapFragmentWrapper _mapfragment1 = null;
public de.amberhome.objects.appcompat.ACSwitchCompatWrapper _swnew = null;
public anywheresoftware.b4a.objects.collections.List _lstgroup1 = null;
public anywheresoftware.b4a.objects.collections.List _lstgroup2 = null;
public de.amberhome.objects.appcompat.ACSwitchCompatWrapper _swsearchbyaddress = null;
public anywheresoftware.b4a.objects.PanelWrapper _btnnewashkhas = null;
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
public static void  _loadashkhas() throws Exception{
RDebugUtils.currentModule="act_moshtarian";
if (Debug.shouldDelegate(mostCurrent.activityBA, "loadashkhas", false))
	 {Debug.delegate(mostCurrent.activityBA, "loadashkhas", null); return;}
ResumableSub_LoadAshkhas rsub = new ResumableSub_LoadAshkhas(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_LoadAshkhas extends BA.ResumableSub {
public ResumableSub_LoadAshkhas(ir.parsikhesab.pakhsh.act_moshtarian parent) {
this.parent = parent;
}
ir.parsikhesab.pakhsh.act_moshtarian parent;
String _str = "";
int _countfilter = 0;
boolean _filter = false;
String _datemiladi = "";
String _time = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _cutedad = null;
String _search = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_moshtarian";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=47906817;
 //BA.debugLineNum = 47906817;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 187;
this.catchState = 186;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 186;
RDebugUtils.currentLine=47906818;
 //BA.debugLineNum = 47906818;BA.debugLine="MCode.page =\"Act_Moshtarian\"";
parent.mostCurrent._mcode._page /*String*/  = "Act_Moshtarian";
RDebugUtils.currentLine=47906819;
 //BA.debugLineNum = 47906819;BA.debugLine="Dim str As String=\"\"";
_str = "";
RDebugUtils.currentLine=47906820;
 //BA.debugLineNum = 47906820;BA.debugLine="Dim countfilter As Int=0";
_countfilter = (int) (0);
RDebugUtils.currentLine=47906821;
 //BA.debugLineNum = 47906821;BA.debugLine="Dim filter As Boolean=False";
_filter = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=47906822;
 //BA.debugLineNum = 47906822;BA.debugLine="DateTime.DateFormat=\"yyyy-MM-dd\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=47906823;
 //BA.debugLineNum = 47906823;BA.debugLine="Dim DateMiladi As String = MCode.ConvertNumbersP";
_datemiladi = parent.mostCurrent._mcode._convertnumberspersian2english /*String*/ (mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.getNow()));
RDebugUtils.currentLine=47906824;
 //BA.debugLineNum = 47906824;BA.debugLine="Dim Time As String = DateTime.Time(DateTime.Now)";
_time = anywheresoftware.b4a.keywords.Common.DateTime.Time(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
RDebugUtils.currentLine=47906825;
 //BA.debugLineNum = 47906825;BA.debugLine="Dim Date As String =MCode.DatePersian '& \"T\" & T";
parent.mostCurrent._date = parent.mostCurrent._mcode._datepersian /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=47906826;
 //BA.debugLineNum = 47906826;BA.debugLine="LogColor(\"D: \" & Date,Colors.Red)";
anywheresoftware.b4a.keywords.Common.LogImpl("547906826","D: "+parent.mostCurrent._date,anywheresoftware.b4a.keywords.Common.Colors.Red);
RDebugUtils.currentLine=47906827;
 //BA.debugLineNum = 47906827;BA.debugLine="Dim CuTedad As Cursor";
_cutedad = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=47906828;
 //BA.debugLineNum = 47906828;BA.debugLine="Log(GroupCodeSelect1)";
anywheresoftware.b4a.keywords.Common.LogImpl("547906828",parent.mostCurrent._groupcodeselect1,0);
RDebugUtils.currentLine=47906829;
 //BA.debugLineNum = 47906829;BA.debugLine="Log(GroupCodeSelect2)";
anywheresoftware.b4a.keywords.Common.LogImpl("547906829",parent.mostCurrent._groupcodeselect2,0);
RDebugUtils.currentLine=47906830;
 //BA.debugLineNum = 47906830;BA.debugLine="If GroupCodeSelect1=0 And GroupCodeSelect2=0 The";
if (true) break;

case 4:
//if
this.state = 64;
if ((parent.mostCurrent._groupcodeselect1).equals(BA.NumberToString(0)) && (parent.mostCurrent._groupcodeselect2).equals(BA.NumberToString(0))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=47906831;
 //BA.debugLineNum = 47906831;BA.debugLine="If SwTour.Checked=True Then";
if (true) break;

case 7:
//if
this.state = 14;
if (parent.mostCurrent._swtour.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=47906832;
 //BA.debugLineNum = 47906832;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=47906834;
 //BA.debugLineNum = 47906834;BA.debugLine="str= str & \" and FldLastVisit <> 0 \"";
_str = _str+" and FldLastVisit <> 0 ";
RDebugUtils.currentLine=47906835;
 //BA.debugLineNum = 47906835;BA.debugLine="filter=True";
_filter = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=47906836;
 //BA.debugLineNum = 47906836;BA.debugLine="If countfilter=1 Then";
if (true) break;

case 10:
//if
this.state = 13;
if (_countfilter==1) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=47906837;
 //BA.debugLineNum = 47906837;BA.debugLine="str=str.Replace(\" and \",\"\")";
_str = _str.replace(" and ","");
 if (true) break;

case 13:
//C
this.state = 14;
;
 if (true) break;
;
RDebugUtils.currentLine=47906841;
 //BA.debugLineNum = 47906841;BA.debugLine="If SwNew.Checked=True Then";

case 14:
//if
this.state = 21;
if (parent.mostCurrent._swnew.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=47906842;
 //BA.debugLineNum = 47906842;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=47906844;
 //BA.debugLineNum = 47906844;BA.debugLine="str= str & \" and length(fldCodetafzili)>5 \"";
_str = _str+" and length(fldCodetafzili)>5 ";
RDebugUtils.currentLine=47906845;
 //BA.debugLineNum = 47906845;BA.debugLine="filter=True";
_filter = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=47906846;
 //BA.debugLineNum = 47906846;BA.debugLine="If countfilter=1 Then";
if (true) break;

case 17:
//if
this.state = 20;
if (_countfilter==1) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=47906847;
 //BA.debugLineNum = 47906847;BA.debugLine="str=str.Replace(\" and \",\"\")";
_str = _str.replace(" and ","");
 if (true) break;

case 20:
//C
this.state = 21;
;
 if (true) break;
;
RDebugUtils.currentLine=47906851;
 //BA.debugLineNum = 47906851;BA.debugLine="If SwBed.Checked=True Then";

case 21:
//if
this.state = 28;
if (parent.mostCurrent._swbed.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 23;
}if (true) break;

case 23:
//C
this.state = 24;
RDebugUtils.currentLine=47906852;
 //BA.debugLineNum = 47906852;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=47906854;
 //BA.debugLineNum = 47906854;BA.debugLine="str= str & \" and fldMande > 0 \"";
_str = _str+" and fldMande > 0 ";
RDebugUtils.currentLine=47906855;
 //BA.debugLineNum = 47906855;BA.debugLine="filter=True";
_filter = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=47906856;
 //BA.debugLineNum = 47906856;BA.debugLine="If countfilter=1 Then";
if (true) break;

case 24:
//if
this.state = 27;
if (_countfilter==1) { 
this.state = 26;
}if (true) break;

case 26:
//C
this.state = 27;
RDebugUtils.currentLine=47906857;
 //BA.debugLineNum = 47906857;BA.debugLine="str=str.Replace(\" and \",\"\")";
_str = _str.replace(" and ","");
 if (true) break;

case 27:
//C
this.state = 28;
;
 if (true) break;
;
RDebugUtils.currentLine=47906861;
 //BA.debugLineNum = 47906861;BA.debugLine="If SwBes.Checked=True Then";

case 28:
//if
this.state = 35;
if (parent.mostCurrent._swbes.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 30;
}if (true) break;

case 30:
//C
this.state = 31;
RDebugUtils.currentLine=47906862;
 //BA.debugLineNum = 47906862;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=47906864;
 //BA.debugLineNum = 47906864;BA.debugLine="str= str & \" and fldMande < 0 \"";
_str = _str+" and fldMande < 0 ";
RDebugUtils.currentLine=47906865;
 //BA.debugLineNum = 47906865;BA.debugLine="filter=True";
_filter = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=47906866;
 //BA.debugLineNum = 47906866;BA.debugLine="If countfilter=1 Then";
if (true) break;

case 31:
//if
this.state = 34;
if (_countfilter==1) { 
this.state = 33;
}if (true) break;

case 33:
//C
this.state = 34;
RDebugUtils.currentLine=47906867;
 //BA.debugLineNum = 47906867;BA.debugLine="str=str.Replace(\" and \",\"\")";
_str = _str.replace(" and ","");
 if (true) break;

case 34:
//C
this.state = 35;
;
 if (true) break;
;
RDebugUtils.currentLine=47906871;
 //BA.debugLineNum = 47906871;BA.debugLine="If TxtSearch.Text.Length>0 And TxtSearch.Text<>";

case 35:
//if
this.state = 58;
if (parent.mostCurrent._txtsearch.getText().length()>0 && (parent.mostCurrent._txtsearch.getText()).equals(" ") == false && (parent.mostCurrent._txtsearch.getText()).equals("") == false) { 
this.state = 37;
}if (true) break;

case 37:
//C
this.state = 38;
RDebugUtils.currentLine=47906873;
 //BA.debugLineNum = 47906873;BA.debugLine="Dim Search As String=MCode.ConvertNumbersPersi";
_search = parent.mostCurrent._mcode._convertnumberspersian2english /*String*/ (mostCurrent.activityBA,parent.mostCurrent._txtsearch.getText());
RDebugUtils.currentLine=47906874;
 //BA.debugLineNum = 47906874;BA.debugLine="If Search=\"\" Then";
if (true) break;

case 38:
//if
this.state = 41;
if ((_search).equals("")) { 
this.state = 40;
}if (true) break;

case 40:
//C
this.state = 41;
RDebugUtils.currentLine=47906875;
 //BA.debugLineNum = 47906875;BA.debugLine="Search=TxtSearch.Text";
_search = parent.mostCurrent._txtsearch.getText();
 if (true) break;

case 41:
//C
this.state = 42;
;
RDebugUtils.currentLine=47906877;
 //BA.debugLineNum = 47906877;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=47906878;
 //BA.debugLineNum = 47906878;BA.debugLine="If swSearchByAddress.Checked Then";
if (true) break;

case 42:
//if
this.state = 53;
if (parent.mostCurrent._swsearchbyaddress.getChecked()) { 
this.state = 44;
}else {
this.state = 46;
}if (true) break;

case 44:
//C
this.state = 53;
RDebugUtils.currentLine=47906879;
 //BA.debugLineNum = 47906879;BA.debugLine="str = str & $\" and (fldAdress like '%${Search";
_str = _str+(" and (fldAdress like '%"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_search))+"%') ");
 if (true) break;

case 46:
//C
this.state = 47;
RDebugUtils.currentLine=47906881;
 //BA.debugLineNum = 47906881;BA.debugLine="If IsNumber(Search) Then";
if (true) break;

case 47:
//if
this.state = 52;
if (anywheresoftware.b4a.keywords.Common.IsNumber(_search)) { 
this.state = 49;
}else {
this.state = 51;
}if (true) break;

case 49:
//C
this.state = 52;
RDebugUtils.currentLine=47906882;
 //BA.debugLineNum = 47906882;BA.debugLine="str = str & $\" and (fldCodetafzili like '%${";
_str = _str+(" and (fldCodetafzili like '%"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_search))+"%') ");
 if (true) break;

case 51:
//C
this.state = 52;
RDebugUtils.currentLine=47906884;
 //BA.debugLineNum = 47906884;BA.debugLine="str = str & $\" and (fldSharheTafzili like '%";
_str = _str+(" and (fldSharheTafzili like '%"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_search))+"%') ");
 if (true) break;

case 52:
//C
this.state = 53;
;
 if (true) break;

case 53:
//C
this.state = 54;
;
RDebugUtils.currentLine=47906887;
 //BA.debugLineNum = 47906887;BA.debugLine="filter=True";
_filter = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=47906888;
 //BA.debugLineNum = 47906888;BA.debugLine="If countfilter=1 Then";
if (true) break;

case 54:
//if
this.state = 57;
if (_countfilter==1) { 
this.state = 56;
}if (true) break;

case 56:
//C
this.state = 57;
RDebugUtils.currentLine=47906889;
 //BA.debugLineNum = 47906889;BA.debugLine="str=str.Replace(\" and \",\"\")";
_str = _str.replace(" and ","");
 if (true) break;

case 57:
//C
this.state = 58;
;
 if (true) break;
;
RDebugUtils.currentLine=47906892;
 //BA.debugLineNum = 47906892;BA.debugLine="If filter=True And str<>\"\" Then";

case 58:
//if
this.state = 63;
if (_filter==anywheresoftware.b4a.keywords.Common.True && (_str).equals("") == false) { 
this.state = 60;
}else {
this.state = 62;
}if (true) break;

case 60:
//C
this.state = 63;
RDebugUtils.currentLine=47906893;
 //BA.debugLineNum = 47906893;BA.debugLine="CuTedad = MCode.Result(\"Select * From TblAshkh";
_cutedad = parent.mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblAshkhas Where "+_str+" and FldLastVisit > '"+parent.mostCurrent._date+"'");
RDebugUtils.currentLine=47906894;
 //BA.debugLineNum = 47906894;BA.debugLine="LblTedadVisit.Text =  CuTedad.RowCount";
parent.mostCurrent._lbltedadvisit.setText(BA.ObjectToCharSequence(_cutedad.getRowCount()));
RDebugUtils.currentLine=47906895;
 //BA.debugLineNum = 47906895;BA.debugLine="CuTedad = MCode.Result(\"Select * From TblAshkh";
_cutedad = parent.mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblAshkhas Where "+_str+" and FldLastSefaresh > '"+parent.mostCurrent._date+"'");
RDebugUtils.currentLine=47906896;
 //BA.debugLineNum = 47906896;BA.debugLine="LblTedadSefaresh.Text =  CuTedad.RowCount";
parent.mostCurrent._lbltedadsefaresh.setText(BA.ObjectToCharSequence(_cutedad.getRowCount()));
RDebugUtils.currentLine=47906899;
 //BA.debugLineNum = 47906899;BA.debugLine="str=\"Select * From TblAshkhas where \"&str&\" \"&";
_str = "Select * From TblAshkhas where "+_str+" "+parent.mostCurrent._str_sort;
 if (true) break;

case 62:
//C
this.state = 63;
RDebugUtils.currentLine=47906901;
 //BA.debugLineNum = 47906901;BA.debugLine="CuTedad = MCode.Result(\"Select * From TblAshkh";
_cutedad = parent.mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblAshkhas Where FldLastVisit = '"+parent.mostCurrent._date+"'");
RDebugUtils.currentLine=47906902;
 //BA.debugLineNum = 47906902;BA.debugLine="LblTedadVisit.Text =  CuTedad.RowCount";
parent.mostCurrent._lbltedadvisit.setText(BA.ObjectToCharSequence(_cutedad.getRowCount()));
RDebugUtils.currentLine=47906903;
 //BA.debugLineNum = 47906903;BA.debugLine="CuTedad = MCode.Result(\"Select * From TblAshkh";
_cutedad = parent.mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblAshkhas Where FldLastSefaresh = '"+parent.mostCurrent._date+"'");
RDebugUtils.currentLine=47906904;
 //BA.debugLineNum = 47906904;BA.debugLine="LblTedadSefaresh.Text =  CuTedad.RowCount";
parent.mostCurrent._lbltedadsefaresh.setText(BA.ObjectToCharSequence(_cutedad.getRowCount()));
RDebugUtils.currentLine=47906906;
 //BA.debugLineNum = 47906906;BA.debugLine="str=\"Select * From TblAshkhas \"&Str_sort";
_str = "Select * From TblAshkhas "+parent.mostCurrent._str_sort;
 if (true) break;

case 63:
//C
this.state = 64;
;
RDebugUtils.currentLine=47906909;
 //BA.debugLineNum = 47906909;BA.debugLine="Log(str)";
anywheresoftware.b4a.keywords.Common.LogImpl("547906909",_str,0);
 if (true) break;
;
RDebugUtils.currentLine=47906912;
 //BA.debugLineNum = 47906912;BA.debugLine="If GroupCodeSelect1<>0 And GroupCodeSelect2=0 Th";

case 64:
//if
this.state = 124;
if ((parent.mostCurrent._groupcodeselect1).equals(BA.NumberToString(0)) == false && (parent.mostCurrent._groupcodeselect2).equals(BA.NumberToString(0))) { 
this.state = 66;
}if (true) break;

case 66:
//C
this.state = 67;
RDebugUtils.currentLine=47906914;
 //BA.debugLineNum = 47906914;BA.debugLine="If SwTour.Checked=True Then";
if (true) break;

case 67:
//if
this.state = 74;
if (parent.mostCurrent._swtour.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 69;
}if (true) break;

case 69:
//C
this.state = 70;
RDebugUtils.currentLine=47906915;
 //BA.debugLineNum = 47906915;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=47906917;
 //BA.debugLineNum = 47906917;BA.debugLine="str= str & \" and FldLastVisit <> 0 \"";
_str = _str+" and FldLastVisit <> 0 ";
RDebugUtils.currentLine=47906918;
 //BA.debugLineNum = 47906918;BA.debugLine="filter=True";
_filter = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=47906919;
 //BA.debugLineNum = 47906919;BA.debugLine="If countfilter=1 Then";
if (true) break;

case 70:
//if
this.state = 73;
if (_countfilter==1) { 
this.state = 72;
}if (true) break;

case 72:
//C
this.state = 73;
RDebugUtils.currentLine=47906920;
 //BA.debugLineNum = 47906920;BA.debugLine="str=str.Replace(\" and \",\"\")";
_str = _str.replace(" and ","");
 if (true) break;

case 73:
//C
this.state = 74;
;
 if (true) break;
;
RDebugUtils.currentLine=47906924;
 //BA.debugLineNum = 47906924;BA.debugLine="If SwNew.Checked=True Then";

case 74:
//if
this.state = 81;
if (parent.mostCurrent._swnew.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 76;
}if (true) break;

case 76:
//C
this.state = 77;
RDebugUtils.currentLine=47906925;
 //BA.debugLineNum = 47906925;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=47906927;
 //BA.debugLineNum = 47906927;BA.debugLine="str= str & \" and length(fldCodetafzili)>5 \"";
_str = _str+" and length(fldCodetafzili)>5 ";
RDebugUtils.currentLine=47906928;
 //BA.debugLineNum = 47906928;BA.debugLine="filter=True";
_filter = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=47906929;
 //BA.debugLineNum = 47906929;BA.debugLine="If countfilter=1 Then";
if (true) break;

case 77:
//if
this.state = 80;
if (_countfilter==1) { 
this.state = 79;
}if (true) break;

case 79:
//C
this.state = 80;
RDebugUtils.currentLine=47906930;
 //BA.debugLineNum = 47906930;BA.debugLine="str=str.Replace(\" and \",\"\")";
_str = _str.replace(" and ","");
 if (true) break;

case 80:
//C
this.state = 81;
;
 if (true) break;
;
RDebugUtils.currentLine=47906934;
 //BA.debugLineNum = 47906934;BA.debugLine="If SwBed.Checked=True Then";

case 81:
//if
this.state = 88;
if (parent.mostCurrent._swbed.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 83;
}if (true) break;

case 83:
//C
this.state = 84;
RDebugUtils.currentLine=47906935;
 //BA.debugLineNum = 47906935;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=47906937;
 //BA.debugLineNum = 47906937;BA.debugLine="str= str & \" and fldMande > 0 \"";
_str = _str+" and fldMande > 0 ";
RDebugUtils.currentLine=47906938;
 //BA.debugLineNum = 47906938;BA.debugLine="filter=True";
_filter = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=47906939;
 //BA.debugLineNum = 47906939;BA.debugLine="If countfilter=1 Then";
if (true) break;

case 84:
//if
this.state = 87;
if (_countfilter==1) { 
this.state = 86;
}if (true) break;

case 86:
//C
this.state = 87;
RDebugUtils.currentLine=47906940;
 //BA.debugLineNum = 47906940;BA.debugLine="str=str.Replace(\" and \",\"\")";
_str = _str.replace(" and ","");
 if (true) break;

case 87:
//C
this.state = 88;
;
 if (true) break;
;
RDebugUtils.currentLine=47906944;
 //BA.debugLineNum = 47906944;BA.debugLine="If SwBes.Checked=True Then";

case 88:
//if
this.state = 95;
if (parent.mostCurrent._swbes.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 90;
}if (true) break;

case 90:
//C
this.state = 91;
RDebugUtils.currentLine=47906945;
 //BA.debugLineNum = 47906945;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=47906947;
 //BA.debugLineNum = 47906947;BA.debugLine="str= str & \" and fldMande < 0 \"";
_str = _str+" and fldMande < 0 ";
RDebugUtils.currentLine=47906948;
 //BA.debugLineNum = 47906948;BA.debugLine="filter=True";
_filter = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=47906949;
 //BA.debugLineNum = 47906949;BA.debugLine="If countfilter=1 Then";
if (true) break;

case 91:
//if
this.state = 94;
if (_countfilter==1) { 
this.state = 93;
}if (true) break;

case 93:
//C
this.state = 94;
RDebugUtils.currentLine=47906950;
 //BA.debugLineNum = 47906950;BA.debugLine="str=str.Replace(\" and \",\"\")";
_str = _str.replace(" and ","");
 if (true) break;

case 94:
//C
this.state = 95;
;
 if (true) break;
;
RDebugUtils.currentLine=47906954;
 //BA.debugLineNum = 47906954;BA.debugLine="If TxtSearch.Text.Length>0 And TxtSearch.Text<>";

case 95:
//if
this.state = 118;
if (parent.mostCurrent._txtsearch.getText().length()>0 && (parent.mostCurrent._txtsearch.getText()).equals(" ") == false && (parent.mostCurrent._txtsearch.getText()).equals("") == false) { 
this.state = 97;
}if (true) break;

case 97:
//C
this.state = 98;
RDebugUtils.currentLine=47906956;
 //BA.debugLineNum = 47906956;BA.debugLine="Dim Search As String=MCode.ConvertNumbersPersi";
_search = parent.mostCurrent._mcode._convertnumberspersian2english /*String*/ (mostCurrent.activityBA,parent.mostCurrent._txtsearch.getText());
RDebugUtils.currentLine=47906957;
 //BA.debugLineNum = 47906957;BA.debugLine="If Search=\"\" Then";
if (true) break;

case 98:
//if
this.state = 101;
if ((_search).equals("")) { 
this.state = 100;
}if (true) break;

case 100:
//C
this.state = 101;
RDebugUtils.currentLine=47906958;
 //BA.debugLineNum = 47906958;BA.debugLine="Search=TxtSearch.Text";
_search = parent.mostCurrent._txtsearch.getText();
 if (true) break;

case 101:
//C
this.state = 102;
;
RDebugUtils.currentLine=47906960;
 //BA.debugLineNum = 47906960;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=47906961;
 //BA.debugLineNum = 47906961;BA.debugLine="If swSearchByAddress.Checked Then";
if (true) break;

case 102:
//if
this.state = 113;
if (parent.mostCurrent._swsearchbyaddress.getChecked()) { 
this.state = 104;
}else {
this.state = 106;
}if (true) break;

case 104:
//C
this.state = 113;
RDebugUtils.currentLine=47906962;
 //BA.debugLineNum = 47906962;BA.debugLine="str = str & $\" and (fldAdress like '%${Search";
_str = _str+(" and (fldAdress like '%"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_search))+"%') ");
 if (true) break;

case 106:
//C
this.state = 107;
RDebugUtils.currentLine=47906964;
 //BA.debugLineNum = 47906964;BA.debugLine="If IsNumber(Search) Then";
if (true) break;

case 107:
//if
this.state = 112;
if (anywheresoftware.b4a.keywords.Common.IsNumber(_search)) { 
this.state = 109;
}else {
this.state = 111;
}if (true) break;

case 109:
//C
this.state = 112;
RDebugUtils.currentLine=47906965;
 //BA.debugLineNum = 47906965;BA.debugLine="str = str & $\" and (fldCodetafzili like '%${";
_str = _str+(" and (fldCodetafzili like '%"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_search))+"%') ");
 if (true) break;

case 111:
//C
this.state = 112;
RDebugUtils.currentLine=47906967;
 //BA.debugLineNum = 47906967;BA.debugLine="str = str & $\" and (fldSharheTafzili like '%";
_str = _str+(" and (fldSharheTafzili like '%"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_search))+"%') ");
 if (true) break;

case 112:
//C
this.state = 113;
;
 if (true) break;

case 113:
//C
this.state = 114;
;
RDebugUtils.currentLine=47906970;
 //BA.debugLineNum = 47906970;BA.debugLine="filter=True";
_filter = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=47906971;
 //BA.debugLineNum = 47906971;BA.debugLine="If countfilter=1 Then";
if (true) break;

case 114:
//if
this.state = 117;
if (_countfilter==1) { 
this.state = 116;
}if (true) break;

case 116:
//C
this.state = 117;
RDebugUtils.currentLine=47906972;
 //BA.debugLineNum = 47906972;BA.debugLine="str=str.Replace(\" and \",\"\")";
_str = _str.replace(" and ","");
 if (true) break;

case 117:
//C
this.state = 118;
;
 if (true) break;
;
RDebugUtils.currentLine=47906975;
 //BA.debugLineNum = 47906975;BA.debugLine="If filter=True And str<>\"\" Then";

case 118:
//if
this.state = 123;
if (_filter==anywheresoftware.b4a.keywords.Common.True && (_str).equals("") == false) { 
this.state = 120;
}else {
this.state = 122;
}if (true) break;

case 120:
//C
this.state = 123;
RDebugUtils.currentLine=47906976;
 //BA.debugLineNum = 47906976;BA.debugLine="CuTedad = MCode.Result(\"Select * From TblAshkh";
_cutedad = parent.mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblAshkhas Where fldCodeGroup like '"+parent.mostCurrent._groupcodeselect1+"%' and "+_str+" and FldLastVisit = '"+parent.mostCurrent._date+"'");
RDebugUtils.currentLine=47906977;
 //BA.debugLineNum = 47906977;BA.debugLine="LblTedadVisit.Text =  CuTedad.RowCount";
parent.mostCurrent._lbltedadvisit.setText(BA.ObjectToCharSequence(_cutedad.getRowCount()));
RDebugUtils.currentLine=47906978;
 //BA.debugLineNum = 47906978;BA.debugLine="CuTedad = MCode.Result(\"Select * From TblAshkh";
_cutedad = parent.mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblAshkhas Where fldCodeGroup like '"+parent.mostCurrent._groupcodeselect1+"%' and "+_str+" and FldLastSefaresh = '"+parent.mostCurrent._date+"'");
RDebugUtils.currentLine=47906979;
 //BA.debugLineNum = 47906979;BA.debugLine="LblTedadSefaresh.Text =  CuTedad.RowCount";
parent.mostCurrent._lbltedadsefaresh.setText(BA.ObjectToCharSequence(_cutedad.getRowCount()));
RDebugUtils.currentLine=47906981;
 //BA.debugLineNum = 47906981;BA.debugLine="str=\"Select * From TblAshkhas Where fldCodeGro";
_str = "Select * From TblAshkhas Where fldCodeGroup like '"+parent.mostCurrent._groupcodeselect1+"%' and "+_str+" "+parent.mostCurrent._str_sort;
RDebugUtils.currentLine=47906982;
 //BA.debugLineNum = 47906982;BA.debugLine="Log(str)";
anywheresoftware.b4a.keywords.Common.LogImpl("547906982",_str,0);
 if (true) break;

case 122:
//C
this.state = 123;
RDebugUtils.currentLine=47906984;
 //BA.debugLineNum = 47906984;BA.debugLine="CuTedad = MCode.Result(\"Select * From TblAshkh";
_cutedad = parent.mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblAshkhas Where fldCodeGroup like '"+parent.mostCurrent._groupcodeselect1+"%' and FldLastVisit = '"+parent.mostCurrent._date+"'");
RDebugUtils.currentLine=47906985;
 //BA.debugLineNum = 47906985;BA.debugLine="LblTedadVisit.Text =  CuTedad.RowCount";
parent.mostCurrent._lbltedadvisit.setText(BA.ObjectToCharSequence(_cutedad.getRowCount()));
RDebugUtils.currentLine=47906986;
 //BA.debugLineNum = 47906986;BA.debugLine="CuTedad = MCode.Result(\"Select * From TblAshkh";
_cutedad = parent.mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblAshkhas Where fldCodeGroup like '"+parent.mostCurrent._groupcodeselect1+"%' and FldLastSefaresh = '"+parent.mostCurrent._date+"'");
RDebugUtils.currentLine=47906987;
 //BA.debugLineNum = 47906987;BA.debugLine="LblTedadSefaresh.Text =  CuTedad.RowCount";
parent.mostCurrent._lbltedadsefaresh.setText(BA.ObjectToCharSequence(_cutedad.getRowCount()));
RDebugUtils.currentLine=47906989;
 //BA.debugLineNum = 47906989;BA.debugLine="str=\"Select * From TblAshkhas Where fldCodeGro";
_str = "Select * From TblAshkhas Where fldCodeGroup like '"+parent.mostCurrent._groupcodeselect1+"%' "+parent.mostCurrent._str_sort;
 if (true) break;

case 123:
//C
this.state = 124;
;
 if (true) break;
;
RDebugUtils.currentLine=47906995;
 //BA.debugLineNum = 47906995;BA.debugLine="If GroupCodeSelect1<>0 And GroupCodeSelect2<>0 T";

case 124:
//if
this.state = 184;
if ((parent.mostCurrent._groupcodeselect1).equals(BA.NumberToString(0)) == false && (parent.mostCurrent._groupcodeselect2).equals(BA.NumberToString(0)) == false) { 
this.state = 126;
}if (true) break;

case 126:
//C
this.state = 127;
RDebugUtils.currentLine=47906996;
 //BA.debugLineNum = 47906996;BA.debugLine="If SwTour.Checked=True Then";
if (true) break;

case 127:
//if
this.state = 134;
if (parent.mostCurrent._swtour.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 129;
}if (true) break;

case 129:
//C
this.state = 130;
RDebugUtils.currentLine=47906997;
 //BA.debugLineNum = 47906997;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=47906999;
 //BA.debugLineNum = 47906999;BA.debugLine="str= str & \" and FldLastVisit <> 0 \"";
_str = _str+" and FldLastVisit <> 0 ";
RDebugUtils.currentLine=47907000;
 //BA.debugLineNum = 47907000;BA.debugLine="filter=True";
_filter = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=47907001;
 //BA.debugLineNum = 47907001;BA.debugLine="If countfilter=1 Then";
if (true) break;

case 130:
//if
this.state = 133;
if (_countfilter==1) { 
this.state = 132;
}if (true) break;

case 132:
//C
this.state = 133;
RDebugUtils.currentLine=47907002;
 //BA.debugLineNum = 47907002;BA.debugLine="str=str.Replace(\" and \",\"\")";
_str = _str.replace(" and ","");
 if (true) break;

case 133:
//C
this.state = 134;
;
 if (true) break;
;
RDebugUtils.currentLine=47907006;
 //BA.debugLineNum = 47907006;BA.debugLine="If SwNew.Checked=True Then";

case 134:
//if
this.state = 141;
if (parent.mostCurrent._swnew.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 136;
}if (true) break;

case 136:
//C
this.state = 137;
RDebugUtils.currentLine=47907007;
 //BA.debugLineNum = 47907007;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=47907009;
 //BA.debugLineNum = 47907009;BA.debugLine="str= str & \" and length(fldCodetafzili)>5 \"";
_str = _str+" and length(fldCodetafzili)>5 ";
RDebugUtils.currentLine=47907010;
 //BA.debugLineNum = 47907010;BA.debugLine="filter=True";
_filter = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=47907011;
 //BA.debugLineNum = 47907011;BA.debugLine="If countfilter=1 Then";
if (true) break;

case 137:
//if
this.state = 140;
if (_countfilter==1) { 
this.state = 139;
}if (true) break;

case 139:
//C
this.state = 140;
RDebugUtils.currentLine=47907012;
 //BA.debugLineNum = 47907012;BA.debugLine="str=str.Replace(\" and \",\"\")";
_str = _str.replace(" and ","");
 if (true) break;

case 140:
//C
this.state = 141;
;
 if (true) break;
;
RDebugUtils.currentLine=47907016;
 //BA.debugLineNum = 47907016;BA.debugLine="If SwBed.Checked=True Then";

case 141:
//if
this.state = 148;
if (parent.mostCurrent._swbed.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 143;
}if (true) break;

case 143:
//C
this.state = 144;
RDebugUtils.currentLine=47907017;
 //BA.debugLineNum = 47907017;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=47907019;
 //BA.debugLineNum = 47907019;BA.debugLine="str= str & \" and fldMande > 0 \"";
_str = _str+" and fldMande > 0 ";
RDebugUtils.currentLine=47907020;
 //BA.debugLineNum = 47907020;BA.debugLine="filter=True";
_filter = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=47907021;
 //BA.debugLineNum = 47907021;BA.debugLine="If countfilter=1 Then";
if (true) break;

case 144:
//if
this.state = 147;
if (_countfilter==1) { 
this.state = 146;
}if (true) break;

case 146:
//C
this.state = 147;
RDebugUtils.currentLine=47907022;
 //BA.debugLineNum = 47907022;BA.debugLine="str=str.Replace(\" and \",\"\")";
_str = _str.replace(" and ","");
 if (true) break;

case 147:
//C
this.state = 148;
;
 if (true) break;
;
RDebugUtils.currentLine=47907026;
 //BA.debugLineNum = 47907026;BA.debugLine="If SwBes.Checked=True Then";

case 148:
//if
this.state = 155;
if (parent.mostCurrent._swbes.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 150;
}if (true) break;

case 150:
//C
this.state = 151;
RDebugUtils.currentLine=47907027;
 //BA.debugLineNum = 47907027;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=47907029;
 //BA.debugLineNum = 47907029;BA.debugLine="str= str & \" and fldMande < 0 \"";
_str = _str+" and fldMande < 0 ";
RDebugUtils.currentLine=47907030;
 //BA.debugLineNum = 47907030;BA.debugLine="filter=True";
_filter = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=47907031;
 //BA.debugLineNum = 47907031;BA.debugLine="If countfilter=1 Then";
if (true) break;

case 151:
//if
this.state = 154;
if (_countfilter==1) { 
this.state = 153;
}if (true) break;

case 153:
//C
this.state = 154;
RDebugUtils.currentLine=47907032;
 //BA.debugLineNum = 47907032;BA.debugLine="str=str.Replace(\" and \",\"\")";
_str = _str.replace(" and ","");
 if (true) break;

case 154:
//C
this.state = 155;
;
 if (true) break;
;
RDebugUtils.currentLine=47907036;
 //BA.debugLineNum = 47907036;BA.debugLine="If TxtSearch.Text.Length>0 And TxtSearch.Text<>";

case 155:
//if
this.state = 178;
if (parent.mostCurrent._txtsearch.getText().length()>0 && (parent.mostCurrent._txtsearch.getText()).equals(" ") == false && (parent.mostCurrent._txtsearch.getText()).equals("") == false) { 
this.state = 157;
}if (true) break;

case 157:
//C
this.state = 158;
RDebugUtils.currentLine=47907038;
 //BA.debugLineNum = 47907038;BA.debugLine="Dim Search As String=TxtSearch.Text";
_search = parent.mostCurrent._txtsearch.getText();
RDebugUtils.currentLine=47907039;
 //BA.debugLineNum = 47907039;BA.debugLine="If Search=\"\" Then";
if (true) break;

case 158:
//if
this.state = 161;
if ((_search).equals("")) { 
this.state = 160;
}if (true) break;

case 160:
//C
this.state = 161;
RDebugUtils.currentLine=47907040;
 //BA.debugLineNum = 47907040;BA.debugLine="Search=TxtSearch.Text";
_search = parent.mostCurrent._txtsearch.getText();
 if (true) break;

case 161:
//C
this.state = 162;
;
RDebugUtils.currentLine=47907042;
 //BA.debugLineNum = 47907042;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=47907043;
 //BA.debugLineNum = 47907043;BA.debugLine="If swSearchByAddress.Checked Then";
if (true) break;

case 162:
//if
this.state = 173;
if (parent.mostCurrent._swsearchbyaddress.getChecked()) { 
this.state = 164;
}else {
this.state = 166;
}if (true) break;

case 164:
//C
this.state = 173;
RDebugUtils.currentLine=47907044;
 //BA.debugLineNum = 47907044;BA.debugLine="str = str & $\" and (fldAdress like '%${Search";
_str = _str+(" and (fldAdress like '%"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_search))+"%') ");
 if (true) break;

case 166:
//C
this.state = 167;
RDebugUtils.currentLine=47907046;
 //BA.debugLineNum = 47907046;BA.debugLine="If IsNumber(Search) Then";
if (true) break;

case 167:
//if
this.state = 172;
if (anywheresoftware.b4a.keywords.Common.IsNumber(_search)) { 
this.state = 169;
}else {
this.state = 171;
}if (true) break;

case 169:
//C
this.state = 172;
RDebugUtils.currentLine=47907047;
 //BA.debugLineNum = 47907047;BA.debugLine="str = str & $\" and (fldCodetafzili like '%${";
_str = _str+(" and (fldCodetafzili like '%"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_search))+"%') ");
 if (true) break;

case 171:
//C
this.state = 172;
RDebugUtils.currentLine=47907049;
 //BA.debugLineNum = 47907049;BA.debugLine="str = str & $\" and (fldSharheTafzili like '%";
_str = _str+(" and (fldSharheTafzili like '%"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_search))+"%') ");
 if (true) break;

case 172:
//C
this.state = 173;
;
 if (true) break;

case 173:
//C
this.state = 174;
;
RDebugUtils.currentLine=47907053;
 //BA.debugLineNum = 47907053;BA.debugLine="filter=True";
_filter = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=47907054;
 //BA.debugLineNum = 47907054;BA.debugLine="If countfilter=1 Then";
if (true) break;

case 174:
//if
this.state = 177;
if (_countfilter==1) { 
this.state = 176;
}if (true) break;

case 176:
//C
this.state = 177;
RDebugUtils.currentLine=47907055;
 //BA.debugLineNum = 47907055;BA.debugLine="str=str.Replace(\" and \",\"\")";
_str = _str.replace(" and ","");
 if (true) break;

case 177:
//C
this.state = 178;
;
 if (true) break;
;
RDebugUtils.currentLine=47907059;
 //BA.debugLineNum = 47907059;BA.debugLine="If filter=True And str<>\"\" Then";

case 178:
//if
this.state = 183;
if (_filter==anywheresoftware.b4a.keywords.Common.True && (_str).equals("") == false) { 
this.state = 180;
}else {
this.state = 182;
}if (true) break;

case 180:
//C
this.state = 183;
RDebugUtils.currentLine=47907060;
 //BA.debugLineNum = 47907060;BA.debugLine="CuTedad = MCode.Result(\"Select * From TblAshkh";
_cutedad = parent.mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblAshkhas Where fldCodeGroup like '"+parent.mostCurrent._groupcodeselect2+"%' and "+_str+" and FldLastVisit = '"+parent.mostCurrent._date+"'");
RDebugUtils.currentLine=47907061;
 //BA.debugLineNum = 47907061;BA.debugLine="LblTedadVisit.Text =  CuTedad.RowCount";
parent.mostCurrent._lbltedadvisit.setText(BA.ObjectToCharSequence(_cutedad.getRowCount()));
RDebugUtils.currentLine=47907062;
 //BA.debugLineNum = 47907062;BA.debugLine="CuTedad = MCode.Result(\"Select * From TblAshkh";
_cutedad = parent.mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblAshkhas Where fldCodeGroup like '"+parent.mostCurrent._groupcodeselect2+"%' and "+_str+" and FldLastSefaresh = '"+parent.mostCurrent._date+"'");
RDebugUtils.currentLine=47907063;
 //BA.debugLineNum = 47907063;BA.debugLine="LblTedadSefaresh.Text =  CuTedad.RowCount";
parent.mostCurrent._lbltedadsefaresh.setText(BA.ObjectToCharSequence(_cutedad.getRowCount()));
RDebugUtils.currentLine=47907067;
 //BA.debugLineNum = 47907067;BA.debugLine="str=\"Select * From TblAshkhas Where fldCodeGro";
_str = "Select * From TblAshkhas Where fldCodeGroup like '"+parent.mostCurrent._groupcodeselect2+"%' and "+_str+" "+parent.mostCurrent._str_sort;
 if (true) break;

case 182:
//C
this.state = 183;
RDebugUtils.currentLine=47907069;
 //BA.debugLineNum = 47907069;BA.debugLine="CuTedad = MCode.Result(\"Select * From TblAshkh";
_cutedad = parent.mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblAshkhas Where fldCodeGroup like '"+parent.mostCurrent._groupcodeselect2+"%'"+" and FldLastVisit = '"+parent.mostCurrent._date+"'");
RDebugUtils.currentLine=47907070;
 //BA.debugLineNum = 47907070;BA.debugLine="LblTedadVisit.Text =  CuTedad.RowCount";
parent.mostCurrent._lbltedadvisit.setText(BA.ObjectToCharSequence(_cutedad.getRowCount()));
RDebugUtils.currentLine=47907071;
 //BA.debugLineNum = 47907071;BA.debugLine="CuTedad = MCode.Result(\"Select * From TblAshkh";
_cutedad = parent.mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblAshkhas Where fldCodeGroup like '"+parent.mostCurrent._groupcodeselect2+"%'"+" and FldLastSefaresh = '"+parent.mostCurrent._date+"'");
RDebugUtils.currentLine=47907072;
 //BA.debugLineNum = 47907072;BA.debugLine="LblTedadSefaresh.Text =  CuTedad.RowCount";
parent.mostCurrent._lbltedadsefaresh.setText(BA.ObjectToCharSequence(_cutedad.getRowCount()));
RDebugUtils.currentLine=47907074;
 //BA.debugLineNum = 47907074;BA.debugLine="str=\"Select * From TblAshkhas Where fldCodeGro";
_str = "Select * From TblAshkhas Where fldCodeGroup like '"+parent.mostCurrent._groupcodeselect2+"%' "+parent.mostCurrent._str_sort;
 if (true) break;

case 183:
//C
this.state = 184;
;
RDebugUtils.currentLine=47907077;
 //BA.debugLineNum = 47907077;BA.debugLine="Log(str)";
anywheresoftware.b4a.keywords.Common.LogImpl("547907077",_str,0);
 if (true) break;

case 184:
//C
this.state = 187;
;
RDebugUtils.currentLine=47907079;
 //BA.debugLineNum = 47907079;BA.debugLine="Sleep(200)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_moshtarian", "loadashkhas"),(int) (200));
this.state = 188;
return;
case 188:
//C
this.state = 187;
;
RDebugUtils.currentLine=47907080;
 //BA.debugLineNum = 47907080;BA.debugLine="LoadListAshkhas(str)";
_loadlistashkhas(_str);
 if (true) break;

case 186:
//C
this.state = 187;
this.catchState = 0;
RDebugUtils.currentLine=47907082;
 //BA.debugLineNum = 47907082;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("547907082",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=47907083;
 //BA.debugLineNum = 47907083;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
parent.mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(parent.mostCurrent._activity.getTitle())+"-LoadAshkhas");
 if (true) break;
if (true) break;

case 187:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=47907085;
 //BA.debugLineNum = 47907085;BA.debugLine="End Sub";
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
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="act_moshtarian";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
anywheresoftware.b4a.objects.drawable.ColorDrawable _op = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _op1 = null;
RDebugUtils.currentLine=47710208;
 //BA.debugLineNum = 47710208;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=47710209;
 //BA.debugLineNum = 47710209;BA.debugLine="Activity.LoadLayout(\"L_SelectMantaghe_2\")";
mostCurrent._activity.LoadLayout("L_SelectMantaghe_2",mostCurrent.activityBA);
RDebugUtils.currentLine=47710210;
 //BA.debugLineNum = 47710210;BA.debugLine="Try";
try {RDebugUtils.currentLine=47710211;
 //BA.debugLineNum = 47710211;BA.debugLine="lstSelectedCodeGroupAshkhas.Initialize";
mostCurrent._lstselectedcodegroupashkhas.Initialize();
RDebugUtils.currentLine=47710212;
 //BA.debugLineNum = 47710212;BA.debugLine="Key.Initialize(\"Key\")";
mostCurrent._key.Initialize("Key");
RDebugUtils.currentLine=47710213;
 //BA.debugLineNum = 47710213;BA.debugLine="ListAshkhas.Initialize";
mostCurrent._listashkhas.Initialize();
RDebugUtils.currentLine=47710214;
 //BA.debugLineNum = 47710214;BA.debugLine="OrginalListAshkhas.Initialize";
mostCurrent._orginallistashkhas.Initialize();
RDebugUtils.currentLine=47710215;
 //BA.debugLineNum = 47710215;BA.debugLine="OriginalListGoroohAshkhas.Initialize";
mostCurrent._originallistgoroohashkhas.Initialize();
RDebugUtils.currentLine=47710216;
 //BA.debugLineNum = 47710216;BA.debugLine="ListGoroohAshkhas.Initialize";
mostCurrent._listgoroohashkhas.Initialize();
RDebugUtils.currentLine=47710217;
 //BA.debugLineNum = 47710217;BA.debugLine="gps.Initialize(\"gps\")";
_gps.Initialize("gps");
RDebugUtils.currentLine=47710221;
 //BA.debugLineNum = 47710221;BA.debugLine="lstGroup1.Initialize";
mostCurrent._lstgroup1.Initialize();
RDebugUtils.currentLine=47710222;
 //BA.debugLineNum = 47710222;BA.debugLine="lstGroup2.Initialize";
mostCurrent._lstgroup2.Initialize();
RDebugUtils.currentLine=47710224;
 //BA.debugLineNum = 47710224;BA.debugLine="HLV.Initializer(\"HLV\").ListView.Build";
mostCurrent._hlv.Initializer(mostCurrent.activityBA,"HLV").ListView().Build();
RDebugUtils.currentLine=47710226;
 //BA.debugLineNum = 47710226;BA.debugLine="pnl_HLV.AddView(HLV,0,0,pnl_HLV.Width,pnl_HLV.He";
mostCurrent._pnl_hlv.AddView((android.view.View)(mostCurrent._hlv.getObject()),(int) (0),(int) (0),mostCurrent._pnl_hlv.getWidth(),mostCurrent._pnl_hlv.getHeight());
RDebugUtils.currentLine=47710228;
 //BA.debugLineNum = 47710228;BA.debugLine="NiceSpinner.Initialize(\"NiceSpinner\")";
mostCurrent._nicespinner.Initialize(processBA,"NiceSpinner");
RDebugUtils.currentLine=47710229;
 //BA.debugLineNum = 47710229;BA.debugLine="PnlSpGroup.AddView(NiceSpinner,B4XComboBox1.mBas";
mostCurrent._pnlspgroup.AddView((android.view.View)(mostCurrent._nicespinner.getObject()),mostCurrent._b4xcombobox1._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft(),mostCurrent._b4xcombobox1._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop(),mostCurrent._b4xcombobox1._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),mostCurrent._b4xcombobox1._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=47710230;
 //BA.debugLineNum = 47710230;BA.debugLine="NiceSpinner.TextColor = Colors.Black";
mostCurrent._nicespinner.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=47710231;
 //BA.debugLineNum = 47710231;BA.debugLine="NiceSpinner.Gravity = Gravity.CENTER_HORIZONTAL";
mostCurrent._nicespinner.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL);
RDebugUtils.currentLine=47710232;
 //BA.debugLineNum = 47710232;BA.debugLine="NiceSpinner.Typeface = Typeface.LoadFromAssets(\"";
mostCurrent._nicespinner.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("p_font.ttf"));
RDebugUtils.currentLine=47710233;
 //BA.debugLineNum = 47710233;BA.debugLine="Dim op As ColorDrawable";
_op = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=47710234;
 //BA.debugLineNum = 47710234;BA.debugLine="op.Initialize2(Colors.White,8dip,2dip,Colors.Bla";
_op.Initialize2(anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (8)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2)),anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=47710235;
 //BA.debugLineNum = 47710235;BA.debugLine="NiceSpinner.Background=op";
mostCurrent._nicespinner.setBackground((android.graphics.drawable.Drawable)(_op.getObject()));
RDebugUtils.currentLine=47710237;
 //BA.debugLineNum = 47710237;BA.debugLine="NiceSpinner1.Initialize(\"NiceSpinner1\")";
mostCurrent._nicespinner1.Initialize(processBA,"NiceSpinner1");
RDebugUtils.currentLine=47710238;
 //BA.debugLineNum = 47710238;BA.debugLine="PnlSpGroup.AddView(NiceSpinner1,B4XComboBox2.mBa";
mostCurrent._pnlspgroup.AddView((android.view.View)(mostCurrent._nicespinner1.getObject()),mostCurrent._b4xcombobox2._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft(),mostCurrent._b4xcombobox2._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop(),mostCurrent._b4xcombobox2._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),mostCurrent._b4xcombobox2._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=47710239;
 //BA.debugLineNum = 47710239;BA.debugLine="NiceSpinner1.TextColor = Colors.Black";
mostCurrent._nicespinner1.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=47710240;
 //BA.debugLineNum = 47710240;BA.debugLine="NiceSpinner1.Gravity = Gravity.CENTER_HORIZONTAL";
mostCurrent._nicespinner1.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL);
RDebugUtils.currentLine=47710241;
 //BA.debugLineNum = 47710241;BA.debugLine="NiceSpinner1.Typeface = Typeface.LoadFromAssets(";
mostCurrent._nicespinner1.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("p_font.ttf"));
RDebugUtils.currentLine=47710242;
 //BA.debugLineNum = 47710242;BA.debugLine="Dim op1 As ColorDrawable";
_op1 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=47710243;
 //BA.debugLineNum = 47710243;BA.debugLine="op1.Initialize2(Colors.White,8dip,2dip,Colors.Bl";
_op1.Initialize2(anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (8)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2)),anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=47710244;
 //BA.debugLineNum = 47710244;BA.debugLine="NiceSpinner1.Background=op1";
mostCurrent._nicespinner1.setBackground((android.graphics.drawable.Drawable)(_op1.getObject()));
RDebugUtils.currentLine=47710245;
 //BA.debugLineNum = 47710245;BA.debugLine="lstGroup2.Add(\"همه گروه ها\")";
mostCurrent._lstgroup2.Add((Object)("همه گروه ها"));
RDebugUtils.currentLine=47710246;
 //BA.debugLineNum = 47710246;BA.debugLine="NiceSpinner1.attachDataSource(lstGroup2)";
mostCurrent._nicespinner1.attachDataSource((java.util.List)(mostCurrent._lstgroup2.getObject()));
RDebugUtils.currentLine=47710247;
 //BA.debugLineNum = 47710247;BA.debugLine="LoadAcSpGroohAshkas";
_loadacspgroohashkas();
RDebugUtils.currentLine=47710249;
 //BA.debugLineNum = 47710249;BA.debugLine="HLV.Show";
mostCurrent._hlv.Show();
RDebugUtils.currentLine=47710251;
 //BA.debugLineNum = 47710251;BA.debugLine="Date = MCode.ConvertNumbersPersian2English(MCode.";
mostCurrent._date = mostCurrent._mcode._convertnumberspersian2english /*String*/ (mostCurrent.activityBA,mostCurrent._mcode._datepersian /*String*/ (mostCurrent.activityBA));
RDebugUtils.currentLine=47710253;
 //BA.debugLineNum = 47710253;BA.debugLine="Log(\"showbedehkaran: \" & MCode.showbedehkaran)";
anywheresoftware.b4a.keywords.Common.LogImpl("547710253","showbedehkaran: "+mostCurrent._mcode._showbedehkaran /*String*/ ,0);
 } 
       catch (Exception e37) {
			processBA.setLastException(e37);RDebugUtils.currentLine=47710267;
 //BA.debugLineNum = 47710267;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("547710267",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=47710268;
 //BA.debugLineNum = 47710268;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-Activity_Create");
 };
RDebugUtils.currentLine=47710272;
 //BA.debugLineNum = 47710272;BA.debugLine="End Sub";
return "";
}
public static String  _loadacspgroohashkas() throws Exception{
RDebugUtils.currentModule="act_moshtarian";
if (Debug.shouldDelegate(mostCurrent.activityBA, "loadacspgroohashkas", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "loadacspgroohashkas", null));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _dt1 = null;
int _i = 0;
long _sizecode = 0L;
ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas _item = null;
String _code = "";
long _count = 0L;
String _mincode = "";
ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas _a = null;
String _namegroup = "";
String _codegroup = "";
RDebugUtils.currentLine=47972352;
 //BA.debugLineNum = 47972352;BA.debugLine="Sub LoadAcSpGroohAshkas";
RDebugUtils.currentLine=47972353;
 //BA.debugLineNum = 47972353;BA.debugLine="Try";
try {RDebugUtils.currentLine=47972354;
 //BA.debugLineNum = 47972354;BA.debugLine="lstGroup1.Add(\"همه گروه ها\")";
mostCurrent._lstgroup1.Add((Object)("همه گروه ها"));
RDebugUtils.currentLine=47972355;
 //BA.debugLineNum = 47972355;BA.debugLine="Dim Dt1 As Cursor = MCode.Result(\"Select FldC_Go";
_dt1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_dt1 = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas");
RDebugUtils.currentLine=47972356;
 //BA.debugLineNum = 47972356;BA.debugLine="For i=0 To Dt1.RowCount-1";
{
final int step4 = 1;
final int limit4 = (int) (_dt1.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=47972357;
 //BA.debugLineNum = 47972357;BA.debugLine="Dt1.Position=i";
_dt1.setPosition(_i);
RDebugUtils.currentLine=47972359;
 //BA.debugLineNum = 47972359;BA.debugLine="Dim sizeCode As Long=Dt1.GetString(\"FldC_Gorooh";
_sizecode = (long) (_dt1.GetString("FldC_Gorooh").length());
RDebugUtils.currentLine=47972360;
 //BA.debugLineNum = 47972360;BA.debugLine="If sizeCode=3 Then";
if (_sizecode==3) { 
RDebugUtils.currentLine=47972361;
 //BA.debugLineNum = 47972361;BA.debugLine="Dim Item As AdapterGoroohAshkhas";
_item = new ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas();
RDebugUtils.currentLine=47972362;
 //BA.debugLineNum = 47972362;BA.debugLine="Item.FldC_Gorooh= Dt1.GetString(\"FldC_Gorooh\")";
_item.FldC_Gorooh /*String*/  = _dt1.GetString("FldC_Gorooh");
RDebugUtils.currentLine=47972363;
 //BA.debugLineNum = 47972363;BA.debugLine="Item.FldN_Gorooh= Dt1.GetString(\"FldN_Gorooh\")";
_item.FldN_Gorooh /*String*/  = _dt1.GetString("FldN_Gorooh");
RDebugUtils.currentLine=47972364;
 //BA.debugLineNum = 47972364;BA.debugLine="OriginalListGoroohAshkhas.Add(Item)";
mostCurrent._originallistgoroohashkhas.Add((Object)(_item));
RDebugUtils.currentLine=47972365;
 //BA.debugLineNum = 47972365;BA.debugLine="lstGroup1.Add(Item.FldN_Gorooh)";
mostCurrent._lstgroup1.Add((Object)(_item.FldN_Gorooh /*String*/ ));
 }else {
RDebugUtils.currentLine=47972367;
 //BA.debugLineNum = 47972367;BA.debugLine="Dim code As String=Dt1.GetString(\"FldC_Gorooh\"";
_code = _dt1.GetString("FldC_Gorooh").substring((int) (0),(int) (3));
RDebugUtils.currentLine=47972368;
 //BA.debugLineNum = 47972368;BA.debugLine="Dim count As Long";
_count = 0L;
RDebugUtils.currentLine=47972369;
 //BA.debugLineNum = 47972369;BA.debugLine="Dim MinCode As String =MCode.SingleResult(\"Sel";
_mincode = BA.ObjectToString(mostCurrent._mcode._singleresult /*Object*/ (mostCurrent.activityBA,"Select min(FldC_Gorooh) From TblGoroohAshkhas where FldC_Gorooh Like '"+_code+"%'"));
RDebugUtils.currentLine=47972370;
 //BA.debugLineNum = 47972370;BA.debugLine="For Each a As AdapterGoroohAshkhas In Original";
{
final anywheresoftware.b4a.BA.IterableList group17 = mostCurrent._originallistgoroohashkhas;
final int groupLen17 = group17.getSize()
;int index17 = 0;
;
for (; index17 < groupLen17;index17++){
_a = (ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas)(group17.Get(index17));
RDebugUtils.currentLine=47972371;
 //BA.debugLineNum = 47972371;BA.debugLine="If a.FldC_Gorooh.SubString2(0,3)=code Then";
if ((_a.FldC_Gorooh /*String*/ .substring((int) (0),(int) (3))).equals(_code)) { 
RDebugUtils.currentLine=47972372;
 //BA.debugLineNum = 47972372;BA.debugLine="count=1";
_count = (long) (1);
RDebugUtils.currentLine=47972373;
 //BA.debugLineNum = 47972373;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=47972376;
 //BA.debugLineNum = 47972376;BA.debugLine="If count =0 Then";
if (_count==0) { 
RDebugUtils.currentLine=47972377;
 //BA.debugLineNum = 47972377;BA.debugLine="Dim NameGroup,CodeGroup As String";
_namegroup = "";
_codegroup = "";
RDebugUtils.currentLine=47972378;
 //BA.debugLineNum = 47972378;BA.debugLine="CodeGroup=MinCode";
_codegroup = _mincode;
RDebugUtils.currentLine=47972379;
 //BA.debugLineNum = 47972379;BA.debugLine="NameGroup=MCode.SingleResult(\"Select FldN_Gor";
_namegroup = BA.ObjectToString(mostCurrent._mcode._singleresult /*Object*/ (mostCurrent.activityBA,"Select FldN_Gorooh From TblGoroohAshkhas where FldC_Gorooh='"+_mincode+"'"));
RDebugUtils.currentLine=47972380;
 //BA.debugLineNum = 47972380;BA.debugLine="Dim Item As AdapterGoroohAshkhas";
_item = new ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas();
RDebugUtils.currentLine=47972381;
 //BA.debugLineNum = 47972381;BA.debugLine="Item.FldC_Gorooh= CodeGroup";
_item.FldC_Gorooh /*String*/  = _codegroup;
RDebugUtils.currentLine=47972382;
 //BA.debugLineNum = 47972382;BA.debugLine="Item.FldN_Gorooh= NameGroup";
_item.FldN_Gorooh /*String*/  = _namegroup;
RDebugUtils.currentLine=47972383;
 //BA.debugLineNum = 47972383;BA.debugLine="OriginalListGoroohAshkhas.Add(Item)";
mostCurrent._originallistgoroohashkhas.Add((Object)(_item));
RDebugUtils.currentLine=47972384;
 //BA.debugLineNum = 47972384;BA.debugLine="lstGroup1.Add(Item.FldN_Gorooh)";
mostCurrent._lstgroup1.Add((Object)(_item.FldN_Gorooh /*String*/ ));
 };
 };
 }
};
RDebugUtils.currentLine=47972413;
 //BA.debugLineNum = 47972413;BA.debugLine="NiceSpinner.attachDataSource(lstGroup1)";
mostCurrent._nicespinner.attachDataSource((java.util.List)(mostCurrent._lstgroup1.getObject()));
 } 
       catch (Exception e37) {
			processBA.setLastException(e37);RDebugUtils.currentLine=47972415;
 //BA.debugLineNum = 47972415;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("547972415",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=47972416;
 //BA.debugLineNum = 47972416;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-LoadAcSpGroohAshkas");
 };
RDebugUtils.currentLine=47972418;
 //BA.debugLineNum = 47972418;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="act_moshtarian";
RDebugUtils.currentLine=48103424;
 //BA.debugLineNum = 48103424;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=48103426;
 //BA.debugLineNum = 48103426;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="act_moshtarian";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=48037888;
 //BA.debugLineNum = 48037888;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=48037889;
 //BA.debugLineNum = 48037889;BA.debugLine="Try";
try {RDebugUtils.currentLine=48037890;
 //BA.debugLineNum = 48037890;BA.debugLine="MCode.UpdateSetting";
mostCurrent._mcode._updatesetting /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=48037892;
 //BA.debugLineNum = 48037892;BA.debugLine="StartService(FusedLocationService)";
anywheresoftware.b4a.keywords.Common.StartService(processBA,(Object)(mostCurrent._fusedlocationservice.getObject()));
RDebugUtils.currentLine=48037893;
 //BA.debugLineNum = 48037893;BA.debugLine="Log(\"Gps Start\")";
anywheresoftware.b4a.keywords.Common.LogImpl("548037893","Gps Start",0);
RDebugUtils.currentLine=48037895;
 //BA.debugLineNum = 48037895;BA.debugLine="LoadAshkhas";
_loadashkhas();
 } 
       catch (Exception e7) {
			processBA.setLastException(e7);RDebugUtils.currentLine=48037900;
 //BA.debugLineNum = 48037900;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("548037900",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=48037901;
 //BA.debugLineNum = 48037901;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-Activity_Resume");
 };
RDebugUtils.currentLine=48037903;
 //BA.debugLineNum = 48037903;BA.debugLine="End Sub";
return "";
}
public static boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
RDebugUtils.currentModule="act_moshtarian";
if (Debug.shouldDelegate(mostCurrent.activityBA, "application_error", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "application_error", new Object[] {_error,_stacktrace}));}
RDebugUtils.currentLine=49217536;
 //BA.debugLineNum = 49217536;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
RDebugUtils.currentLine=49217537;
 //BA.debugLineNum = 49217537;BA.debugLine="Log(\"Error Moshtarian: \"&Error)";
anywheresoftware.b4a.keywords.Common.LogImpl("549217537","Error Moshtarian: "+BA.ObjectToString(_error),0);
RDebugUtils.currentLine=49217539;
 //BA.debugLineNum = 49217539;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=49217540;
 //BA.debugLineNum = 49217540;BA.debugLine="End Sub";
return false;
}
public static String  _btn_back_click() throws Exception{
RDebugUtils.currentModule="act_moshtarian";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_back_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_back_click", null));}
RDebugUtils.currentLine=48168960;
 //BA.debugLineNum = 48168960;BA.debugLine="Sub btn_Back_Click";
RDebugUtils.currentLine=48168961;
 //BA.debugLineNum = 48168961;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=48168962;
 //BA.debugLineNum = 48168962;BA.debugLine="End Sub";
return "";
}
public static String  _btn_sort_click() throws Exception{
RDebugUtils.currentModule="act_moshtarian";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_sort_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_sort_click", null));}
anywheresoftware.b4a.objects.collections.List _lst = null;
int _res = 0;
RDebugUtils.currentLine=48824320;
 //BA.debugLineNum = 48824320;BA.debugLine="Sub btn_sort_Click";
RDebugUtils.currentLine=48824321;
 //BA.debugLineNum = 48824321;BA.debugLine="Try";
try {RDebugUtils.currentLine=48824322;
 //BA.debugLineNum = 48824322;BA.debugLine="Dim Lst As List = Array As String(\"کد شخص\",\"نام";
_lst = new anywheresoftware.b4a.objects.collections.List();
_lst = anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"کد شخص","نام شخص نزولی","نام شخص صعودی"});
RDebugUtils.currentLine=48824323;
 //BA.debugLineNum = 48824323;BA.debugLine="Dim res As Int = InputList(Lst,\"مرتب سازی براساس";
_res = anywheresoftware.b4a.keywords.Common.InputList(_lst,BA.ObjectToCharSequence("مرتب سازی براساس:"),(int) (-1),mostCurrent.activityBA);
RDebugUtils.currentLine=48824324;
 //BA.debugLineNum = 48824324;BA.debugLine="Select Case res";
switch (_res) {
case 0: {
RDebugUtils.currentLine=48824326;
 //BA.debugLineNum = 48824326;BA.debugLine="Str_sort = \" Order by fldCodetafzili Asc\"";
mostCurrent._str_sort = " Order by fldCodetafzili Asc";
 break; }
case 1: {
RDebugUtils.currentLine=48824328;
 //BA.debugLineNum = 48824328;BA.debugLine="Str_sort = \" Order by fldSharheTafzili\"";
mostCurrent._str_sort = " Order by fldSharheTafzili";
 break; }
case 2: {
RDebugUtils.currentLine=48824330;
 //BA.debugLineNum = 48824330;BA.debugLine="Str_sort = \" Order by fldSharheTafzili Desc\"";
mostCurrent._str_sort = " Order by fldSharheTafzili Desc";
 break; }
}
;
RDebugUtils.currentLine=48824332;
 //BA.debugLineNum = 48824332;BA.debugLine="Log(Str_sort)";
anywheresoftware.b4a.keywords.Common.LogImpl("548824332",mostCurrent._str_sort,0);
RDebugUtils.currentLine=48824333;
 //BA.debugLineNum = 48824333;BA.debugLine="LoadAshkhas";
_loadashkhas();
 } 
       catch (Exception e15) {
			processBA.setLastException(e15);RDebugUtils.currentLine=48824335;
 //BA.debugLineNum = 48824335;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("548824335",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=48824336;
 //BA.debugLineNum = 48824336;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-btn_sort_Click");
 };
RDebugUtils.currentLine=48824338;
 //BA.debugLineNum = 48824338;BA.debugLine="End Sub";
return "";
}
public static String  _btnnewashkhas_click() throws Exception{
RDebugUtils.currentModule="act_moshtarian";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnnewashkhas_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnnewashkhas_click", null));}
RDebugUtils.currentLine=49283072;
 //BA.debugLineNum = 49283072;BA.debugLine="Private Sub btnNewAshkhas_Click";
RDebugUtils.currentLine=49283073;
 //BA.debugLineNum = 49283073;BA.debugLine="MCode.UpdateShakhs=False";
mostCurrent._mcode._updateshakhs /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=49283074;
 //BA.debugLineNum = 49283074;BA.debugLine="StartActivity(Act_NewAshkhas)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._act_newashkhas.getObject()));
RDebugUtils.currentLine=49283075;
 //BA.debugLineNum = 49283075;BA.debugLine="End Sub";
return "";
}
public static String  _btnupdate_click() throws Exception{
RDebugUtils.currentModule="act_moshtarian";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnupdate_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnupdate_click", null));}
RDebugUtils.currentLine=49152000;
 //BA.debugLineNum = 49152000;BA.debugLine="Sub btnUpdate_Click";
RDebugUtils.currentLine=49152001;
 //BA.debugLineNum = 49152001;BA.debugLine="tcount=3";
_tcount = (int) (3);
RDebugUtils.currentLine=49152003;
 //BA.debugLineNum = 49152003;BA.debugLine="End Sub";
return "";
}
public static int  _hlv_getitemcount() throws Exception{
RDebugUtils.currentModule="act_moshtarian";
if (Debug.shouldDelegate(mostCurrent.activityBA, "hlv_getitemcount", false))
	 {return ((Integer) Debug.delegate(mostCurrent.activityBA, "hlv_getitemcount", null));}
RDebugUtils.currentLine=48365568;
 //BA.debugLineNum = 48365568;BA.debugLine="Sub HLV_GetItemCount As Int 								        '💯 It";
RDebugUtils.currentLine=48365569;
 //BA.debugLineNum = 48365569;BA.debugLine="Return ListAshkhas.Size '/ItemList.Size";
if (true) return mostCurrent._listashkhas.getSize();
RDebugUtils.currentLine=48365570;
 //BA.debugLineNum = 48365570;BA.debugLine="End Sub";
return 0;
}
public static String  _hlv_onbindviewholder(anywheresoftware.b4a.objects.PanelWrapper _parent,int _position) throws Exception{
RDebugUtils.currentModule="act_moshtarian";
if (Debug.shouldDelegate(mostCurrent.activityBA, "hlv_onbindviewholder", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "hlv_onbindviewholder", new Object[] {_parent,_position}));}
ir.parsikhesab.pakhsh.mcode._adapterlistashkhas _item = null;
ir.parsikhesab.pakhsh.cls_recashkhas _rec = null;
RDebugUtils.currentLine=48300032;
 //BA.debugLineNum = 48300032;BA.debugLine="Sub HLV_onBindViewHolder (Parent As Panel, Positio";
RDebugUtils.currentLine=48300033;
 //BA.debugLineNum = 48300033;BA.debugLine="Dim item As AdapterListAshkhas=ListAshkhas.Get(Po";
_item = (ir.parsikhesab.pakhsh.mcode._adapterlistashkhas)(mostCurrent._listashkhas.Get(_position));
RDebugUtils.currentLine=48300034;
 //BA.debugLineNum = 48300034;BA.debugLine="Dim rec As cls_RecAshkhas=Parent.Tag";
_rec = (ir.parsikhesab.pakhsh.cls_recashkhas)(_parent.getTag());
RDebugUtils.currentLine=48300035;
 //BA.debugLineNum = 48300035;BA.debugLine="Parent.AddView(rec.Panel,0,0,100%x,rec.Height)";
_parent.AddView((android.view.View)(_rec._getpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ (null).getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),_rec._getheight /*int*/ (null));
RDebugUtils.currentLine=48300036;
 //BA.debugLineNum = 48300036;BA.debugLine="rec.show(item,Date)";
_rec._show /*String*/ (null,_item,mostCurrent._date);
RDebugUtils.currentLine=48300037;
 //BA.debugLineNum = 48300037;BA.debugLine="Parent.Height=rec.Height";
_parent.setHeight(_rec._getheight /*int*/ (null));
RDebugUtils.currentLine=48300038;
 //BA.debugLineNum = 48300038;BA.debugLine="End Sub";
return "";
}
public static String  _hlv_oncreateviewholder(anywheresoftware.b4a.objects.PanelWrapper _parent,int _viewtype) throws Exception{
RDebugUtils.currentModule="act_moshtarian";
if (Debug.shouldDelegate(mostCurrent.activityBA, "hlv_oncreateviewholder", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "hlv_oncreateviewholder", new Object[] {_parent,_viewtype}));}
ir.parsikhesab.pakhsh.cls_recashkhas _rec = null;
RDebugUtils.currentLine=48234496;
 //BA.debugLineNum = 48234496;BA.debugLine="Private Sub HLV_onCreateViewHolder (Parent As Pane";
RDebugUtils.currentLine=48234497;
 //BA.debugLineNum = 48234497;BA.debugLine="Dim rec As cls_RecAshkhas";
_rec = new ir.parsikhesab.pakhsh.cls_recashkhas();
RDebugUtils.currentLine=48234498;
 //BA.debugLineNum = 48234498;BA.debugLine="rec.Initialize";
_rec._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=48234499;
 //BA.debugLineNum = 48234499;BA.debugLine="Parent.Tag=rec";
_parent.setTag((Object)(_rec));
RDebugUtils.currentLine=48234500;
 //BA.debugLineNum = 48234500;BA.debugLine="End Sub";
return "";
}
public static String  _loadlistashkhas(String _query) throws Exception{
RDebugUtils.currentModule="act_moshtarian";
if (Debug.shouldDelegate(mostCurrent.activityBA, "loadlistashkhas", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "loadlistashkhas", new Object[] {_query}));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
int _i = 0;
ir.parsikhesab.pakhsh.mcode._adapterlistashkhas _itemashkhas = null;
RDebugUtils.currentLine=48693248;
 //BA.debugLineNum = 48693248;BA.debugLine="Sub LoadListAshkhas(Query As String)";
RDebugUtils.currentLine=48693249;
 //BA.debugLineNum = 48693249;BA.debugLine="Try";
try {RDebugUtils.currentLine=48693250;
 //BA.debugLineNum = 48693250;BA.debugLine="Dim Cu As Cursor = MCode.Result(Query)";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,_query);
RDebugUtils.currentLine=48693251;
 //BA.debugLineNum = 48693251;BA.debugLine="OrginalListAshkhas.Clear";
mostCurrent._orginallistashkhas.Clear();
RDebugUtils.currentLine=48693252;
 //BA.debugLineNum = 48693252;BA.debugLine="If Cu.RowCount > 0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=48693253;
 //BA.debugLineNum = 48693253;BA.debugLine="For i = 0 To Cu.RowCount - 1";
{
final int step5 = 1;
final int limit5 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=48693254;
 //BA.debugLineNum = 48693254;BA.debugLine="Dim ItemAshkhas As AdapterListAshkhas";
_itemashkhas = new ir.parsikhesab.pakhsh.mcode._adapterlistashkhas();
RDebugUtils.currentLine=48693255;
 //BA.debugLineNum = 48693255;BA.debugLine="Cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=48693256;
 //BA.debugLineNum = 48693256;BA.debugLine="ItemAshkhas.CodeTafzili=Cu.Getstring(\"fldCodeta";
_itemashkhas.CodeTafzili /*String*/  = _cu.GetString("fldCodetafzili");
RDebugUtils.currentLine=48693257;
 //BA.debugLineNum = 48693257;BA.debugLine="ItemAshkhas.SharhTafzili=Cu.Getstring(\"fldSharh";
_itemashkhas.SharhTafzili /*String*/  = _cu.GetString("fldSharheTafzili");
RDebugUtils.currentLine=48693258;
 //BA.debugLineNum = 48693258;BA.debugLine="ItemAshkhas.Address=myCode.Is_Null(Cu.Getstrin";
_itemashkhas.Address /*String*/  = mostCurrent._mycode._is_null /*String*/ (mostCurrent.activityBA,_cu.GetString("fldAdress"));
RDebugUtils.currentLine=48693259;
 //BA.debugLineNum = 48693259;BA.debugLine="ItemAshkhas.Tell=Cu.Getstring(\"fldTell\")";
_itemashkhas.Tell /*String*/  = _cu.GetString("fldTell");
RDebugUtils.currentLine=48693260;
 //BA.debugLineNum = 48693260;BA.debugLine="ItemAshkhas.FldMobile=myCode.Is_Null(Cu.GetStr";
_itemashkhas.FldMobile /*String*/  = mostCurrent._mycode._is_null /*String*/ (mostCurrent.activityBA,_cu.GetString("FldMobile"));
RDebugUtils.currentLine=48693261;
 //BA.debugLineNum = 48693261;BA.debugLine="ItemAshkhas.FldVaziat=myCode.Is_Null(Cu.GetStri";
_itemashkhas.FldVaziat /*String*/  = mostCurrent._mycode._is_null /*String*/ (mostCurrent.activityBA,_cu.GetString("FldVaziat"));
RDebugUtils.currentLine=48693262;
 //BA.debugLineNum = 48693262;BA.debugLine="ItemAshkhas.FldEtebar=myCode.Is_Null(Cu.GetStri";
_itemashkhas.FldEtebar /*String*/  = mostCurrent._mycode._is_null /*String*/ (mostCurrent.activityBA,_cu.GetString("FldEtebar"));
RDebugUtils.currentLine=48693263;
 //BA.debugLineNum = 48693263;BA.debugLine="ItemAshkhas.lastSeen=Cu.GetString(\"lastSeen\")";
_itemashkhas.lastSeen /*String*/  = _cu.GetString("lastSeen");
RDebugUtils.currentLine=48693264;
 //BA.debugLineNum = 48693264;BA.debugLine="ItemAshkhas.lastOrderDate=myCode.Is_Null(Cu.Get";
_itemashkhas.lastOrderDate /*String*/  = mostCurrent._mycode._is_null /*String*/ (mostCurrent.activityBA,_cu.GetString("lastOrderDate"));
RDebugUtils.currentLine=48693265;
 //BA.debugLineNum = 48693265;BA.debugLine="ItemAshkhas.Mande=Cu.Getstring(\"fldMande\")";
_itemashkhas.Mande /*String*/  = _cu.GetString("fldMande");
RDebugUtils.currentLine=48693266;
 //BA.debugLineNum = 48693266;BA.debugLine="ItemAshkhas.FldLastVisit=myCode.Is_Null(Cu.GetS";
_itemashkhas.FldLastVisit /*String*/  = mostCurrent._mycode._is_null /*String*/ (mostCurrent.activityBA,_cu.GetString("FldLastVisit"));
RDebugUtils.currentLine=48693267;
 //BA.debugLineNum = 48693267;BA.debugLine="ItemAshkhas.FldLastSefaresh=myCode.Is_Null(Cu.G";
_itemashkhas.FldLastSefaresh /*String*/  = mostCurrent._mycode._is_null /*String*/ (mostCurrent.activityBA,_cu.GetString("FldLastSefaresh"));
RDebugUtils.currentLine=48693268;
 //BA.debugLineNum = 48693268;BA.debugLine="ItemAshkhas.FldC_Gorooh=Cu.GetString(\"fldCodeGr";
_itemashkhas.FldC_Gorooh /*String*/  = _cu.GetString("fldCodeGroup");
RDebugUtils.currentLine=48693269;
 //BA.debugLineNum = 48693269;BA.debugLine="ItemAshkhas.FldN_Gorooh=Cu.GetString(\"fldNameGr";
_itemashkhas.FldN_Gorooh /*String*/  = _cu.GetString("fldNameGroup");
RDebugUtils.currentLine=48693270;
 //BA.debugLineNum = 48693270;BA.debugLine="ItemAshkhas.FldC_Posti=myCode.Is_Null(Cu.GetStr";
_itemashkhas.FldC_Posti /*String*/  = mostCurrent._mycode._is_null /*String*/ (mostCurrent.activityBA,_cu.GetString("FldC_Posti"));
RDebugUtils.currentLine=48693271;
 //BA.debugLineNum = 48693271;BA.debugLine="ItemAshkhas.FldC_Meli=myCode.Is_Null(Cu.GetStri";
_itemashkhas.FldC_Meli /*String*/  = mostCurrent._mycode._is_null /*String*/ (mostCurrent.activityBA,_cu.GetString("FldC_Meli"));
RDebugUtils.currentLine=48693272;
 //BA.debugLineNum = 48693272;BA.debugLine="ItemAshkhas.FldShomarehesab=myCode.Is_Null(Cu.G";
_itemashkhas.FldShomarehesab /*String*/  = mostCurrent._mycode._is_null /*String*/ (mostCurrent.activityBA,_cu.GetString("FldShomarehesab"));
RDebugUtils.currentLine=48693273;
 //BA.debugLineNum = 48693273;BA.debugLine="ItemAshkhas.FldSync=myCode.Is_Null(Cu.GetString";
_itemashkhas.FldSync /*String*/  = mostCurrent._mycode._is_null /*String*/ (mostCurrent.activityBA,_cu.GetString("FldSync"));
RDebugUtils.currentLine=48693276;
 //BA.debugLineNum = 48693276;BA.debugLine="lblTedadKol.Text =  Cu.RowCount";
mostCurrent._lbltedadkol.setText(BA.ObjectToCharSequence(_cu.getRowCount()));
RDebugUtils.currentLine=48693285;
 //BA.debugLineNum = 48693285;BA.debugLine="OrginalListAshkhas.Add(ItemAshkhas)";
mostCurrent._orginallistashkhas.Add((Object)(_itemashkhas));
 }
};
 };
RDebugUtils.currentLine=48693290;
 //BA.debugLineNum = 48693290;BA.debugLine="ListAshkhas=OrginalListAshkhas";
mostCurrent._listashkhas = mostCurrent._orginallistashkhas;
RDebugUtils.currentLine=48693293;
 //BA.debugLineNum = 48693293;BA.debugLine="HLV.notifyDataSetChanged";
mostCurrent._hlv.notifyDataSetChanged();
 } 
       catch (Exception e33) {
			processBA.setLastException(e33);RDebugUtils.currentLine=48693295;
 //BA.debugLineNum = 48693295;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("548693295",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=48693296;
 //BA.debugLineNum = 48693296;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-LoadListAshkhas");
 };
RDebugUtils.currentLine=48693298;
 //BA.debugLineNum = 48693298;BA.debugLine="End Sub";
return "";
}
public static String  _nicespinner_item_clicked() throws Exception{
RDebugUtils.currentModule="act_moshtarian";
if (Debug.shouldDelegate(mostCurrent.activityBA, "nicespinner_item_clicked", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "nicespinner_item_clicked", null));}
int _position = 0;
Object _value = null;
anywheresoftware.b4a.objects.collections.List _lst = null;
int _index = 0;
ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas _item = null;
String _mc = "";
int _count = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
int _i = 0;
RDebugUtils.currentLine=48431104;
 //BA.debugLineNum = 48431104;BA.debugLine="Sub NiceSpinner_item_clicked";
RDebugUtils.currentLine=48431105;
 //BA.debugLineNum = 48431105;BA.debugLine="Dim Position As Int=NiceSpinner.SelectedIndex";
_position = mostCurrent._nicespinner.getSelectedIndex();
RDebugUtils.currentLine=48431106;
 //BA.debugLineNum = 48431106;BA.debugLine="Dim Value As Object=NiceSpinner.Text";
_value = (Object)(mostCurrent._nicespinner.getText());
RDebugUtils.currentLine=48431107;
 //BA.debugLineNum = 48431107;BA.debugLine="Log(\"ns1 item \" & NiceSpinner.SelectedIndex &\" se";
anywheresoftware.b4a.keywords.Common.LogImpl("548431107","ns1 item "+BA.NumberToString(mostCurrent._nicespinner.getSelectedIndex())+" selected",0);
RDebugUtils.currentLine=48431108;
 //BA.debugLineNum = 48431108;BA.debugLine="Log(\"ns1 item \" & NiceSpinner.Text &\" selected\")";
anywheresoftware.b4a.keywords.Common.LogImpl("548431108","ns1 item "+mostCurrent._nicespinner.getText()+" selected",0);
RDebugUtils.currentLine=48431110;
 //BA.debugLineNum = 48431110;BA.debugLine="Try";
try {RDebugUtils.currentLine=48431111;
 //BA.debugLineNum = 48431111;BA.debugLine="Key.HideKeyboard";
mostCurrent._key.HideKeyboard(mostCurrent.activityBA);
RDebugUtils.currentLine=48431113;
 //BA.debugLineNum = 48431113;BA.debugLine="If Position = 0 Then";
if (_position==0) { 
RDebugUtils.currentLine=48431114;
 //BA.debugLineNum = 48431114;BA.debugLine="ListGoroohAshkhas.Clear";
mostCurrent._listgoroohashkhas.Clear();
RDebugUtils.currentLine=48431115;
 //BA.debugLineNum = 48431115;BA.debugLine="lstSelectedCodeGroupAshkhas.Clear";
mostCurrent._lstselectedcodegroupashkhas.Clear();
RDebugUtils.currentLine=48431117;
 //BA.debugLineNum = 48431117;BA.debugLine="lstGroup2.Clear";
mostCurrent._lstgroup2.Clear();
RDebugUtils.currentLine=48431119;
 //BA.debugLineNum = 48431119;BA.debugLine="lstGroup2.Add(\"همه گروه ها\")";
mostCurrent._lstgroup2.Add((Object)("همه گروه ها"));
RDebugUtils.currentLine=48431121;
 //BA.debugLineNum = 48431121;BA.debugLine="GroupCodeSelect1=\"0\"";
mostCurrent._groupcodeselect1 = "0";
RDebugUtils.currentLine=48431122;
 //BA.debugLineNum = 48431122;BA.debugLine="GroupNameSelect1=\"\"";
mostCurrent._groupnameselect1 = "";
RDebugUtils.currentLine=48431123;
 //BA.debugLineNum = 48431123;BA.debugLine="GroupCodeSelect2=\"0\"";
mostCurrent._groupcodeselect2 = "0";
RDebugUtils.currentLine=48431124;
 //BA.debugLineNum = 48431124;BA.debugLine="GroupNameSelect2=\"\"";
mostCurrent._groupnameselect2 = "";
 }else {
RDebugUtils.currentLine=48431127;
 //BA.debugLineNum = 48431127;BA.debugLine="Dim lst As List=OriginalListGoroohAshkhas";
_lst = new anywheresoftware.b4a.objects.collections.List();
_lst = mostCurrent._originallistgoroohashkhas;
RDebugUtils.currentLine=48431128;
 //BA.debugLineNum = 48431128;BA.debugLine="Log(NiceSpinner.SelectedIndex-1)";
anywheresoftware.b4a.keywords.Common.LogImpl("548431128",BA.NumberToString(mostCurrent._nicespinner.getSelectedIndex()-1),0);
RDebugUtils.currentLine=48431129;
 //BA.debugLineNum = 48431129;BA.debugLine="Dim index As Int=Position-1";
_index = (int) (_position-1);
RDebugUtils.currentLine=48431130;
 //BA.debugLineNum = 48431130;BA.debugLine="Dim Item As AdapterGoroohAshkhas=lst.Get(index)";
_item = (ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas)(_lst.Get(_index));
RDebugUtils.currentLine=48431131;
 //BA.debugLineNum = 48431131;BA.debugLine="Log(Item.FldN_Gorooh)";
anywheresoftware.b4a.keywords.Common.LogImpl("548431131",_item.FldN_Gorooh /*String*/ ,0);
RDebugUtils.currentLine=48431132;
 //BA.debugLineNum = 48431132;BA.debugLine="Log(Item.FldC_Gorooh)";
anywheresoftware.b4a.keywords.Common.LogImpl("548431132",_item.FldC_Gorooh /*String*/ ,0);
RDebugUtils.currentLine=48431133;
 //BA.debugLineNum = 48431133;BA.debugLine="GroupCodeSelect1=Item.FldC_Gorooh";
mostCurrent._groupcodeselect1 = _item.FldC_Gorooh /*String*/ ;
RDebugUtils.currentLine=48431134;
 //BA.debugLineNum = 48431134;BA.debugLine="GroupNameSelect1=Item.FldN_Gorooh";
mostCurrent._groupnameselect1 = _item.FldN_Gorooh /*String*/ ;
RDebugUtils.currentLine=48431135;
 //BA.debugLineNum = 48431135;BA.debugLine="GroupCodeSelect2=\"0\"";
mostCurrent._groupcodeselect2 = "0";
RDebugUtils.currentLine=48431136;
 //BA.debugLineNum = 48431136;BA.debugLine="GroupNameSelect2=\"\"";
mostCurrent._groupnameselect2 = "";
RDebugUtils.currentLine=48431137;
 //BA.debugLineNum = 48431137;BA.debugLine="Dim mc As String=Item.FldC_Gorooh";
_mc = _item.FldC_Gorooh /*String*/ ;
RDebugUtils.currentLine=48431140;
 //BA.debugLineNum = 48431140;BA.debugLine="Dim Count As Int = Item.FldC_Gorooh.Length + 3";
_count = (int) (_item.FldC_Gorooh /*String*/ .length()+3);
RDebugUtils.currentLine=48431144;
 //BA.debugLineNum = 48431144;BA.debugLine="Dim Cu As Cursor=MCode.Result(\"Select FldC_Goro";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas where FldC_Gorooh Like '"+_mc+"%' And Length(FldC_Gorooh) = "+BA.NumberToString(_count)+" ORDER BY FldC_Gorooh");
RDebugUtils.currentLine=48431145;
 //BA.debugLineNum = 48431145;BA.debugLine="If Cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=48431146;
 //BA.debugLineNum = 48431146;BA.debugLine="lstSelectedCodeGroupAshkhas.Clear";
mostCurrent._lstselectedcodegroupashkhas.Clear();
RDebugUtils.currentLine=48431148;
 //BA.debugLineNum = 48431148;BA.debugLine="lstGroup2.Clear";
mostCurrent._lstgroup2.Clear();
RDebugUtils.currentLine=48431150;
 //BA.debugLineNum = 48431150;BA.debugLine="lstGroup2.Add(\"همه گروه ها\")";
mostCurrent._lstgroup2.Add((Object)("همه گروه ها"));
RDebugUtils.currentLine=48431151;
 //BA.debugLineNum = 48431151;BA.debugLine="For i=0 To Cu.RowCount-1";
{
final int step34 = 1;
final int limit34 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit34 ;_i = _i + step34 ) {
RDebugUtils.currentLine=48431152;
 //BA.debugLineNum = 48431152;BA.debugLine="Cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=48431153;
 //BA.debugLineNum = 48431153;BA.debugLine="Dim Item As AdapterGoroohAshkhas";
_item = new ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas();
RDebugUtils.currentLine=48431154;
 //BA.debugLineNum = 48431154;BA.debugLine="Item.FldC_Gorooh=Cu.GetString(\"FldC_Gorooh\")";
_item.FldC_Gorooh /*String*/  = _cu.GetString("FldC_Gorooh");
RDebugUtils.currentLine=48431155;
 //BA.debugLineNum = 48431155;BA.debugLine="Item.FldN_Gorooh=Cu.GetString(\"FldN_Gorooh\")";
_item.FldN_Gorooh /*String*/  = _cu.GetString("FldN_Gorooh");
RDebugUtils.currentLine=48431156;
 //BA.debugLineNum = 48431156;BA.debugLine="ListGoroohAshkhas.Add(Item)";
mostCurrent._listgoroohashkhas.Add((Object)(_item));
RDebugUtils.currentLine=48431158;
 //BA.debugLineNum = 48431158;BA.debugLine="lstGroup2.Add(Cu.GetString(\"FldN_Gorooh\"))";
mostCurrent._lstgroup2.Add((Object)(_cu.GetString("FldN_Gorooh")));
 }
};
RDebugUtils.currentLine=48431161;
 //BA.debugLineNum = 48431161;BA.debugLine="NiceSpinner1.attachDataSource(lstGroup2)";
mostCurrent._nicespinner1.attachDataSource((java.util.List)(mostCurrent._lstgroup2.getObject()));
RDebugUtils.currentLine=48431163;
 //BA.debugLineNum = 48431163;BA.debugLine="lstSelectedCodeGroupAshkhas.Add(GroupCodeSelec";
mostCurrent._lstselectedcodegroupashkhas.Add((Object)(mostCurrent._groupcodeselect1));
 }else {
RDebugUtils.currentLine=48431165;
 //BA.debugLineNum = 48431165;BA.debugLine="ListGoroohAshkhas.Clear";
mostCurrent._listgoroohashkhas.Clear();
RDebugUtils.currentLine=48431166;
 //BA.debugLineNum = 48431166;BA.debugLine="lstSelectedCodeGroupAshkhas.Clear";
mostCurrent._lstselectedcodegroupashkhas.Clear();
RDebugUtils.currentLine=48431168;
 //BA.debugLineNum = 48431168;BA.debugLine="lstGroup2.Clear";
mostCurrent._lstgroup2.Clear();
RDebugUtils.currentLine=48431170;
 //BA.debugLineNum = 48431170;BA.debugLine="lstGroup2.Add(\"همه گروه ها\")";
mostCurrent._lstgroup2.Add((Object)("همه گروه ها"));
RDebugUtils.currentLine=48431171;
 //BA.debugLineNum = 48431171;BA.debugLine="GroupCodeSelect2=\"0\"";
mostCurrent._groupcodeselect2 = "0";
RDebugUtils.currentLine=48431172;
 //BA.debugLineNum = 48431172;BA.debugLine="GroupNameSelect2=\"\"";
mostCurrent._groupnameselect2 = "";
 };
 };
RDebugUtils.currentLine=48431177;
 //BA.debugLineNum = 48431177;BA.debugLine="LoadAshkhas";
_loadashkhas();
RDebugUtils.currentLine=48431178;
 //BA.debugLineNum = 48431178;BA.debugLine="Log(\"CodeGroupSelect1: \"&GroupCodeSelect1)";
anywheresoftware.b4a.keywords.Common.LogImpl("548431178","CodeGroupSelect1: "+mostCurrent._groupcodeselect1,0);
RDebugUtils.currentLine=48431179;
 //BA.debugLineNum = 48431179;BA.debugLine="Log(\"postion1: \"&Position)";
anywheresoftware.b4a.keywords.Common.LogImpl("548431179","postion1: "+BA.NumberToString(_position),0);
 } 
       catch (Exception e57) {
			processBA.setLastException(e57);RDebugUtils.currentLine=48431181;
 //BA.debugLineNum = 48431181;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("548431181",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=48431182;
 //BA.debugLineNum = 48431182;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-NiceSpinner_ItemClick");
 };
RDebugUtils.currentLine=48431184;
 //BA.debugLineNum = 48431184;BA.debugLine="End Sub";
return "";
}
public static String  _nicespinner_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="act_moshtarian";
if (Debug.shouldDelegate(mostCurrent.activityBA, "nicespinner_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "nicespinner_itemclick", new Object[] {_position,_value}));}
anywheresoftware.b4a.objects.collections.List _lst = null;
int _index = 0;
ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas _item = null;
String _mc = "";
int _count = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
int _i = 0;
RDebugUtils.currentLine=48562176;
 //BA.debugLineNum = 48562176;BA.debugLine="Sub NiceSpinner_ItemClick (Position As Int, Value";
RDebugUtils.currentLine=48562178;
 //BA.debugLineNum = 48562178;BA.debugLine="Try";
try {RDebugUtils.currentLine=48562179;
 //BA.debugLineNum = 48562179;BA.debugLine="Key.HideKeyboard";
mostCurrent._key.HideKeyboard(mostCurrent.activityBA);
RDebugUtils.currentLine=48562181;
 //BA.debugLineNum = 48562181;BA.debugLine="If Position = 0 Then";
if (_position==0) { 
RDebugUtils.currentLine=48562182;
 //BA.debugLineNum = 48562182;BA.debugLine="ListGoroohAshkhas.Clear";
mostCurrent._listgoroohashkhas.Clear();
RDebugUtils.currentLine=48562183;
 //BA.debugLineNum = 48562183;BA.debugLine="lstSelectedCodeGroupAshkhas.Clear";
mostCurrent._lstselectedcodegroupashkhas.Clear();
RDebugUtils.currentLine=48562185;
 //BA.debugLineNum = 48562185;BA.debugLine="lstGroup2.Clear";
mostCurrent._lstgroup2.Clear();
RDebugUtils.currentLine=48562187;
 //BA.debugLineNum = 48562187;BA.debugLine="lstGroup2.Add(\"همه گروه ها\")";
mostCurrent._lstgroup2.Add((Object)("همه گروه ها"));
RDebugUtils.currentLine=48562189;
 //BA.debugLineNum = 48562189;BA.debugLine="GroupCodeSelect1=\"0\"";
mostCurrent._groupcodeselect1 = "0";
RDebugUtils.currentLine=48562190;
 //BA.debugLineNum = 48562190;BA.debugLine="GroupNameSelect1=\"\"";
mostCurrent._groupnameselect1 = "";
RDebugUtils.currentLine=48562191;
 //BA.debugLineNum = 48562191;BA.debugLine="GroupCodeSelect2=\"0\"";
mostCurrent._groupcodeselect2 = "0";
RDebugUtils.currentLine=48562192;
 //BA.debugLineNum = 48562192;BA.debugLine="GroupNameSelect2=\"\"";
mostCurrent._groupnameselect2 = "";
RDebugUtils.currentLine=48562193;
 //BA.debugLineNum = 48562193;BA.debugLine="NiceSpinner1.SelectedIndex=0";
mostCurrent._nicespinner1.setSelectedIndex((int) (0));
 }else {
RDebugUtils.currentLine=48562195;
 //BA.debugLineNum = 48562195;BA.debugLine="Dim lst As List=OriginalListGoroohAshkhas";
_lst = new anywheresoftware.b4a.objects.collections.List();
_lst = mostCurrent._originallistgoroohashkhas;
RDebugUtils.currentLine=48562196;
 //BA.debugLineNum = 48562196;BA.debugLine="Log(NiceSpinner.SelectedIndex-1)";
anywheresoftware.b4a.keywords.Common.LogImpl("548562196",BA.NumberToString(mostCurrent._nicespinner.getSelectedIndex()-1),0);
RDebugUtils.currentLine=48562197;
 //BA.debugLineNum = 48562197;BA.debugLine="Dim index As Int=Position-1";
_index = (int) (_position-1);
RDebugUtils.currentLine=48562198;
 //BA.debugLineNum = 48562198;BA.debugLine="Dim Item As AdapterGoroohAshkhas=lst.Get(index)";
_item = (ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas)(_lst.Get(_index));
RDebugUtils.currentLine=48562199;
 //BA.debugLineNum = 48562199;BA.debugLine="Log(Item.FldN_Gorooh)";
anywheresoftware.b4a.keywords.Common.LogImpl("548562199",_item.FldN_Gorooh /*String*/ ,0);
RDebugUtils.currentLine=48562200;
 //BA.debugLineNum = 48562200;BA.debugLine="Log(Item.FldC_Gorooh)";
anywheresoftware.b4a.keywords.Common.LogImpl("548562200",_item.FldC_Gorooh /*String*/ ,0);
RDebugUtils.currentLine=48562201;
 //BA.debugLineNum = 48562201;BA.debugLine="GroupCodeSelect1=Item.FldC_Gorooh";
mostCurrent._groupcodeselect1 = _item.FldC_Gorooh /*String*/ ;
RDebugUtils.currentLine=48562202;
 //BA.debugLineNum = 48562202;BA.debugLine="GroupNameSelect1=Item.FldN_Gorooh";
mostCurrent._groupnameselect1 = _item.FldN_Gorooh /*String*/ ;
RDebugUtils.currentLine=48562203;
 //BA.debugLineNum = 48562203;BA.debugLine="GroupCodeSelect2=\"0\"";
mostCurrent._groupcodeselect2 = "0";
RDebugUtils.currentLine=48562204;
 //BA.debugLineNum = 48562204;BA.debugLine="GroupNameSelect2=\"\"";
mostCurrent._groupnameselect2 = "";
RDebugUtils.currentLine=48562205;
 //BA.debugLineNum = 48562205;BA.debugLine="Dim mc As String=Item.FldC_Gorooh";
_mc = _item.FldC_Gorooh /*String*/ ;
RDebugUtils.currentLine=48562207;
 //BA.debugLineNum = 48562207;BA.debugLine="Dim Count As Int = Item.FldC_Gorooh.Length + 3";
_count = (int) (_item.FldC_Gorooh /*String*/ .length()+3);
RDebugUtils.currentLine=48562208;
 //BA.debugLineNum = 48562208;BA.debugLine="Dim Cu As Cursor=MCode.Result(\"Select FldC_Goro";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas where FldC_Gorooh Like '"+_mc+"%' And Length(FldC_Gorooh) = "+BA.NumberToString(_count)+" ORDER BY FldC_Gorooh");
RDebugUtils.currentLine=48562209;
 //BA.debugLineNum = 48562209;BA.debugLine="If Cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=48562210;
 //BA.debugLineNum = 48562210;BA.debugLine="lstSelectedCodeGroupAshkhas.Clear";
mostCurrent._lstselectedcodegroupashkhas.Clear();
RDebugUtils.currentLine=48562212;
 //BA.debugLineNum = 48562212;BA.debugLine="lstGroup2.Clear";
mostCurrent._lstgroup2.Clear();
RDebugUtils.currentLine=48562214;
 //BA.debugLineNum = 48562214;BA.debugLine="lstGroup2.Add(\"همه گروه ها\")";
mostCurrent._lstgroup2.Add((Object)("همه گروه ها"));
RDebugUtils.currentLine=48562215;
 //BA.debugLineNum = 48562215;BA.debugLine="For i=0 To Cu.RowCount-1";
{
final int step31 = 1;
final int limit31 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit31 ;_i = _i + step31 ) {
RDebugUtils.currentLine=48562216;
 //BA.debugLineNum = 48562216;BA.debugLine="Cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=48562217;
 //BA.debugLineNum = 48562217;BA.debugLine="Dim Item As AdapterGoroohAshkhas";
_item = new ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas();
RDebugUtils.currentLine=48562218;
 //BA.debugLineNum = 48562218;BA.debugLine="Item.FldC_Gorooh=Cu.GetString(\"FldC_Gorooh\")";
_item.FldC_Gorooh /*String*/  = _cu.GetString("FldC_Gorooh");
RDebugUtils.currentLine=48562219;
 //BA.debugLineNum = 48562219;BA.debugLine="Item.FldN_Gorooh=Cu.GetString(\"FldN_Gorooh\")";
_item.FldN_Gorooh /*String*/  = _cu.GetString("FldN_Gorooh");
RDebugUtils.currentLine=48562220;
 //BA.debugLineNum = 48562220;BA.debugLine="ListGoroohAshkhas.Add(Item)";
mostCurrent._listgoroohashkhas.Add((Object)(_item));
RDebugUtils.currentLine=48562222;
 //BA.debugLineNum = 48562222;BA.debugLine="lstGroup2.Add(Cu.GetString(\"FldN_Gorooh\"))";
mostCurrent._lstgroup2.Add((Object)(_cu.GetString("FldN_Gorooh")));
 }
};
RDebugUtils.currentLine=48562225;
 //BA.debugLineNum = 48562225;BA.debugLine="NiceSpinner1.attachDataSource(lstGroup2)";
mostCurrent._nicespinner1.attachDataSource((java.util.List)(mostCurrent._lstgroup2.getObject()));
RDebugUtils.currentLine=48562226;
 //BA.debugLineNum = 48562226;BA.debugLine="NiceSpinner1.SelectedIndex = 0";
mostCurrent._nicespinner1.setSelectedIndex((int) (0));
RDebugUtils.currentLine=48562227;
 //BA.debugLineNum = 48562227;BA.debugLine="lstSelectedCodeGroupAshkhas.Add(GroupCodeSelec";
mostCurrent._lstselectedcodegroupashkhas.Add((Object)(mostCurrent._groupcodeselect1));
 }else {
RDebugUtils.currentLine=48562229;
 //BA.debugLineNum = 48562229;BA.debugLine="ListGoroohAshkhas.Clear";
mostCurrent._listgoroohashkhas.Clear();
RDebugUtils.currentLine=48562230;
 //BA.debugLineNum = 48562230;BA.debugLine="lstSelectedCodeGroupAshkhas.Clear";
mostCurrent._lstselectedcodegroupashkhas.Clear();
RDebugUtils.currentLine=48562232;
 //BA.debugLineNum = 48562232;BA.debugLine="lstGroup2.Clear";
mostCurrent._lstgroup2.Clear();
RDebugUtils.currentLine=48562234;
 //BA.debugLineNum = 48562234;BA.debugLine="lstGroup2.Add(\"همه گروه ها\")";
mostCurrent._lstgroup2.Add((Object)("همه گروه ها"));
RDebugUtils.currentLine=48562235;
 //BA.debugLineNum = 48562235;BA.debugLine="GroupCodeSelect2=\"0\"";
mostCurrent._groupcodeselect2 = "0";
RDebugUtils.currentLine=48562236;
 //BA.debugLineNum = 48562236;BA.debugLine="GroupNameSelect2=\"\"";
mostCurrent._groupnameselect2 = "";
RDebugUtils.currentLine=48562237;
 //BA.debugLineNum = 48562237;BA.debugLine="NiceSpinner1.SelectedIndex=0";
mostCurrent._nicespinner1.setSelectedIndex((int) (0));
 };
 };
RDebugUtils.currentLine=48562241;
 //BA.debugLineNum = 48562241;BA.debugLine="LoadAshkhas";
_loadashkhas();
RDebugUtils.currentLine=48562242;
 //BA.debugLineNum = 48562242;BA.debugLine="Log(\"CodeGroupSelect1: \"&GroupCodeSelect1)";
anywheresoftware.b4a.keywords.Common.LogImpl("548562242","CodeGroupSelect1: "+mostCurrent._groupcodeselect1,0);
RDebugUtils.currentLine=48562243;
 //BA.debugLineNum = 48562243;BA.debugLine="Log(\"postion1: \"&Position)";
anywheresoftware.b4a.keywords.Common.LogImpl("548562243","postion1: "+BA.NumberToString(_position),0);
 } 
       catch (Exception e56) {
			processBA.setLastException(e56);RDebugUtils.currentLine=48562245;
 //BA.debugLineNum = 48562245;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("548562245",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=48562246;
 //BA.debugLineNum = 48562246;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-NiceSpinner_ItemClick");
 };
RDebugUtils.currentLine=48562248;
 //BA.debugLineNum = 48562248;BA.debugLine="End Sub";
return "";
}
public static String  _nicespinner1_item_clicked() throws Exception{
RDebugUtils.currentModule="act_moshtarian";
if (Debug.shouldDelegate(mostCurrent.activityBA, "nicespinner1_item_clicked", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "nicespinner1_item_clicked", null));}
int _position = 0;
Object _value = null;
anywheresoftware.b4a.objects.collections.List _lst = null;
ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas _item = null;
String _mc = "";
int _count = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
int _i = 0;
anywheresoftware.b4a.objects.drawable.ColorDrawable _op1 = null;
RDebugUtils.currentLine=48496640;
 //BA.debugLineNum = 48496640;BA.debugLine="Sub NiceSpinner1_item_clicked";
RDebugUtils.currentLine=48496641;
 //BA.debugLineNum = 48496641;BA.debugLine="Dim Position As Int=NiceSpinner1.SelectedIndex";
_position = mostCurrent._nicespinner1.getSelectedIndex();
RDebugUtils.currentLine=48496642;
 //BA.debugLineNum = 48496642;BA.debugLine="Dim Value As Object=NiceSpinner1.Text";
_value = (Object)(mostCurrent._nicespinner1.getText());
RDebugUtils.currentLine=48496643;
 //BA.debugLineNum = 48496643;BA.debugLine="Log(\"ns2 item \" & NiceSpinner1.SelectedIndex &\" s";
anywheresoftware.b4a.keywords.Common.LogImpl("548496643","ns2 item "+BA.NumberToString(mostCurrent._nicespinner1.getSelectedIndex())+" selected",0);
RDebugUtils.currentLine=48496644;
 //BA.debugLineNum = 48496644;BA.debugLine="Log(\"ns2 item \" & NiceSpinner1.Text &\" selected\")";
anywheresoftware.b4a.keywords.Common.LogImpl("548496644","ns2 item "+mostCurrent._nicespinner1.getText()+" selected",0);
RDebugUtils.currentLine=48496645;
 //BA.debugLineNum = 48496645;BA.debugLine="Try";
try {RDebugUtils.currentLine=48496646;
 //BA.debugLineNum = 48496646;BA.debugLine="If Position=0 Then";
if (_position==0) { 
RDebugUtils.currentLine=48496647;
 //BA.debugLineNum = 48496647;BA.debugLine="GroupCodeSelect2=lstSelectedCodeGroupAshkhas.Ge";
mostCurrent._groupcodeselect2 = BA.ObjectToString(mostCurrent._lstselectedcodegroupashkhas.Get((int) (mostCurrent._lstselectedcodegroupashkhas.getSize()-1)));
 }else {
RDebugUtils.currentLine=48496649;
 //BA.debugLineNum = 48496649;BA.debugLine="Dim lst As List=ListGoroohAshkhas";
_lst = new anywheresoftware.b4a.objects.collections.List();
_lst = mostCurrent._listgoroohashkhas;
RDebugUtils.currentLine=48496650;
 //BA.debugLineNum = 48496650;BA.debugLine="Dim Item As AdapterGoroohAshkhas=lst.Get(Positi";
_item = (ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas)(_lst.Get((int) (_position-1)));
RDebugUtils.currentLine=48496651;
 //BA.debugLineNum = 48496651;BA.debugLine="GroupCodeSelect2=Item.FldC_Gorooh";
mostCurrent._groupcodeselect2 = _item.FldC_Gorooh /*String*/ ;
RDebugUtils.currentLine=48496653;
 //BA.debugLineNum = 48496653;BA.debugLine="Dim mc As String=Item.FldC_Gorooh";
_mc = _item.FldC_Gorooh /*String*/ ;
RDebugUtils.currentLine=48496655;
 //BA.debugLineNum = 48496655;BA.debugLine="Dim Count As Int = mc.Length + 3";
_count = (int) (_mc.length()+3);
RDebugUtils.currentLine=48496656;
 //BA.debugLineNum = 48496656;BA.debugLine="Dim Cu As Cursor=MCode.Result(\"Select FldC_Goro";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas where FldC_Gorooh Like '"+_mc+"%' And Length(FldC_Gorooh) = "+BA.NumberToString(_count)+" ORDER BY FldC_Gorooh");
RDebugUtils.currentLine=48496657;
 //BA.debugLineNum = 48496657;BA.debugLine="If Cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=48496658;
 //BA.debugLineNum = 48496658;BA.debugLine="ListGoroohAshkhas.Clear";
mostCurrent._listgoroohashkhas.Clear();
RDebugUtils.currentLine=48496662;
 //BA.debugLineNum = 48496662;BA.debugLine="lstSelectedCodeGroupAshkhas.Add(Item.FldC_Goro";
mostCurrent._lstselectedcodegroupashkhas.Add((Object)(_item.FldC_Gorooh /*String*/ ));
RDebugUtils.currentLine=48496666;
 //BA.debugLineNum = 48496666;BA.debugLine="lstGroup2.Clear";
mostCurrent._lstgroup2.Clear();
RDebugUtils.currentLine=48496668;
 //BA.debugLineNum = 48496668;BA.debugLine="lstGroup2.Add(\"همه گروه ها\")";
mostCurrent._lstgroup2.Add((Object)("همه گروه ها"));
RDebugUtils.currentLine=48496670;
 //BA.debugLineNum = 48496670;BA.debugLine="For i=0 To Cu.RowCount-1";
{
final int step20 = 1;
final int limit20 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit20 ;_i = _i + step20 ) {
RDebugUtils.currentLine=48496671;
 //BA.debugLineNum = 48496671;BA.debugLine="Cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=48496672;
 //BA.debugLineNum = 48496672;BA.debugLine="Dim Item As AdapterGoroohAshkhas";
_item = new ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas();
RDebugUtils.currentLine=48496673;
 //BA.debugLineNum = 48496673;BA.debugLine="Item.FldC_Gorooh=Cu.GetString(\"FldC_Gorooh\")";
_item.FldC_Gorooh /*String*/  = _cu.GetString("FldC_Gorooh");
RDebugUtils.currentLine=48496674;
 //BA.debugLineNum = 48496674;BA.debugLine="Item.FldN_Gorooh=Cu.GetString(\"FldN_Gorooh\")";
_item.FldN_Gorooh /*String*/  = _cu.GetString("FldN_Gorooh");
RDebugUtils.currentLine=48496675;
 //BA.debugLineNum = 48496675;BA.debugLine="ListGoroohAshkhas.Add(Item)";
mostCurrent._listgoroohashkhas.Add((Object)(_item));
RDebugUtils.currentLine=48496677;
 //BA.debugLineNum = 48496677;BA.debugLine="lstGroup2.Add(Cu.GetString(\"FldN_Gorooh\"))";
mostCurrent._lstgroup2.Add((Object)(_cu.GetString("FldN_Gorooh")));
 }
};
RDebugUtils.currentLine=48496680;
 //BA.debugLineNum = 48496680;BA.debugLine="NiceSpinner1.RemoveView";
mostCurrent._nicespinner1.RemoveView();
RDebugUtils.currentLine=48496681;
 //BA.debugLineNum = 48496681;BA.debugLine="NiceSpinner1.Initialize(\"NiceSpinner1\")";
mostCurrent._nicespinner1.Initialize(processBA,"NiceSpinner1");
RDebugUtils.currentLine=48496682;
 //BA.debugLineNum = 48496682;BA.debugLine="PnlSpGroup.AddView(NiceSpinner1,B4XComboBox2.m";
mostCurrent._pnlspgroup.AddView((android.view.View)(mostCurrent._nicespinner1.getObject()),mostCurrent._b4xcombobox2._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft(),mostCurrent._b4xcombobox2._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop(),mostCurrent._b4xcombobox2._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),mostCurrent._b4xcombobox2._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=48496683;
 //BA.debugLineNum = 48496683;BA.debugLine="NiceSpinner1.TextColor = Colors.Black";
mostCurrent._nicespinner1.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=48496684;
 //BA.debugLineNum = 48496684;BA.debugLine="NiceSpinner1.Gravity = Gravity.CENTER_HORIZONT";
mostCurrent._nicespinner1.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL);
RDebugUtils.currentLine=48496685;
 //BA.debugLineNum = 48496685;BA.debugLine="NiceSpinner1.Typeface = Typeface.LoadFromAsset";
mostCurrent._nicespinner1.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("p_font.ttf"));
RDebugUtils.currentLine=48496686;
 //BA.debugLineNum = 48496686;BA.debugLine="Dim op1 As ColorDrawable";
_op1 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=48496687;
 //BA.debugLineNum = 48496687;BA.debugLine="op1.Initialize2(Colors.White,8dip,2dip,Colors.";
_op1.Initialize2(anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (8)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2)),anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=48496688;
 //BA.debugLineNum = 48496688;BA.debugLine="NiceSpinner1.Background=op1";
mostCurrent._nicespinner1.setBackground((android.graphics.drawable.Drawable)(_op1.getObject()));
RDebugUtils.currentLine=48496689;
 //BA.debugLineNum = 48496689;BA.debugLine="NiceSpinner1.attachDataSource(lstGroup2)";
mostCurrent._nicespinner1.attachDataSource((java.util.List)(mostCurrent._lstgroup2.getObject()));
 };
 };
RDebugUtils.currentLine=48496693;
 //BA.debugLineNum = 48496693;BA.debugLine="LoadAshkhas";
_loadashkhas();
RDebugUtils.currentLine=48496694;
 //BA.debugLineNum = 48496694;BA.debugLine="Log(\"CodeGroupSelect2: \"&GroupCodeSelect2)";
anywheresoftware.b4a.keywords.Common.LogImpl("548496694","CodeGroupSelect2: "+mostCurrent._groupcodeselect2,0);
RDebugUtils.currentLine=48496695;
 //BA.debugLineNum = 48496695;BA.debugLine="Log(\"position2: \"&Position)";
anywheresoftware.b4a.keywords.Common.LogImpl("548496695","position2: "+BA.NumberToString(_position),0);
 } 
       catch (Exception e44) {
			processBA.setLastException(e44);RDebugUtils.currentLine=48496697;
 //BA.debugLineNum = 48496697;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("548496697",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=48496698;
 //BA.debugLineNum = 48496698;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-NiceSpinner1_ItemClick");
 };
RDebugUtils.currentLine=48496700;
 //BA.debugLineNum = 48496700;BA.debugLine="End Sub";
return "";
}
public static String  _nicespinner1_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="act_moshtarian";
if (Debug.shouldDelegate(mostCurrent.activityBA, "nicespinner1_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "nicespinner1_itemclick", new Object[] {_position,_value}));}
anywheresoftware.b4a.objects.collections.List _lst = null;
ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas _item = null;
String _mc = "";
int _count = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
int _i = 0;
RDebugUtils.currentLine=48627712;
 //BA.debugLineNum = 48627712;BA.debugLine="Sub NiceSpinner1_ItemClick (Position As Int, Value";
RDebugUtils.currentLine=48627713;
 //BA.debugLineNum = 48627713;BA.debugLine="Try";
try {RDebugUtils.currentLine=48627714;
 //BA.debugLineNum = 48627714;BA.debugLine="If Position=0 Then";
if (_position==0) { 
RDebugUtils.currentLine=48627715;
 //BA.debugLineNum = 48627715;BA.debugLine="GroupCodeSelect2=lstSelectedCodeGroupAshkhas.Ge";
mostCurrent._groupcodeselect2 = BA.ObjectToString(mostCurrent._lstselectedcodegroupashkhas.Get((int) (mostCurrent._lstselectedcodegroupashkhas.getSize()-1)));
 }else {
RDebugUtils.currentLine=48627717;
 //BA.debugLineNum = 48627717;BA.debugLine="Dim lst As List=ListGoroohAshkhas";
_lst = new anywheresoftware.b4a.objects.collections.List();
_lst = mostCurrent._listgoroohashkhas;
RDebugUtils.currentLine=48627718;
 //BA.debugLineNum = 48627718;BA.debugLine="Dim Item As AdapterGoroohAshkhas=lst.Get(Positi";
_item = (ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas)(_lst.Get((int) (_position-1)));
RDebugUtils.currentLine=48627719;
 //BA.debugLineNum = 48627719;BA.debugLine="GroupCodeSelect2=Item.FldC_Gorooh";
mostCurrent._groupcodeselect2 = _item.FldC_Gorooh /*String*/ ;
RDebugUtils.currentLine=48627721;
 //BA.debugLineNum = 48627721;BA.debugLine="Dim mc As String=Item.FldC_Gorooh";
_mc = _item.FldC_Gorooh /*String*/ ;
RDebugUtils.currentLine=48627723;
 //BA.debugLineNum = 48627723;BA.debugLine="Dim Count As Int = mc.Length + 3";
_count = (int) (_mc.length()+3);
RDebugUtils.currentLine=48627724;
 //BA.debugLineNum = 48627724;BA.debugLine="Dim Cu As Cursor=MCode.Result(\"Select FldC_Goro";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas where FldC_Gorooh Like '"+_mc+"%' And Length(FldC_Gorooh) = "+BA.NumberToString(_count)+" ORDER BY FldC_Gorooh");
RDebugUtils.currentLine=48627725;
 //BA.debugLineNum = 48627725;BA.debugLine="If Cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=48627726;
 //BA.debugLineNum = 48627726;BA.debugLine="ListGoroohAshkhas.Clear";
mostCurrent._listgoroohashkhas.Clear();
RDebugUtils.currentLine=48627730;
 //BA.debugLineNum = 48627730;BA.debugLine="lstSelectedCodeGroupAshkhas.Add(Item.FldC_Goro";
mostCurrent._lstselectedcodegroupashkhas.Add((Object)(_item.FldC_Gorooh /*String*/ ));
RDebugUtils.currentLine=48627734;
 //BA.debugLineNum = 48627734;BA.debugLine="lstGroup2.Clear";
mostCurrent._lstgroup2.Clear();
RDebugUtils.currentLine=48627736;
 //BA.debugLineNum = 48627736;BA.debugLine="lstGroup2.Add(\"همه گروه ها\")";
mostCurrent._lstgroup2.Add((Object)("همه گروه ها"));
RDebugUtils.currentLine=48627738;
 //BA.debugLineNum = 48627738;BA.debugLine="For i=0 To Cu.RowCount-1";
{
final int step16 = 1;
final int limit16 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit16 ;_i = _i + step16 ) {
RDebugUtils.currentLine=48627739;
 //BA.debugLineNum = 48627739;BA.debugLine="Cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=48627740;
 //BA.debugLineNum = 48627740;BA.debugLine="Dim Item As AdapterGoroohAshkhas";
_item = new ir.parsikhesab.pakhsh.mcode._adaptergoroohashkhas();
RDebugUtils.currentLine=48627741;
 //BA.debugLineNum = 48627741;BA.debugLine="Item.FldC_Gorooh=Cu.GetString(\"FldC_Gorooh\")";
_item.FldC_Gorooh /*String*/  = _cu.GetString("FldC_Gorooh");
RDebugUtils.currentLine=48627742;
 //BA.debugLineNum = 48627742;BA.debugLine="Item.FldN_Gorooh=Cu.GetString(\"FldN_Gorooh\")";
_item.FldN_Gorooh /*String*/  = _cu.GetString("FldN_Gorooh");
RDebugUtils.currentLine=48627743;
 //BA.debugLineNum = 48627743;BA.debugLine="ListGoroohAshkhas.Add(Item)";
mostCurrent._listgoroohashkhas.Add((Object)(_item));
RDebugUtils.currentLine=48627745;
 //BA.debugLineNum = 48627745;BA.debugLine="lstGroup2.Add(Cu.GetString(\"FldN_Gorooh\"))";
mostCurrent._lstgroup2.Add((Object)(_cu.GetString("FldN_Gorooh")));
 }
};
RDebugUtils.currentLine=48627750;
 //BA.debugLineNum = 48627750;BA.debugLine="NiceSpinner1.attachDataSource(lstGroup2)";
mostCurrent._nicespinner1.attachDataSource((java.util.List)(mostCurrent._lstgroup2.getObject()));
RDebugUtils.currentLine=48627751;
 //BA.debugLineNum = 48627751;BA.debugLine="NiceSpinner1.SelectedIndex = 0";
mostCurrent._nicespinner1.setSelectedIndex((int) (0));
 };
 };
RDebugUtils.currentLine=48627754;
 //BA.debugLineNum = 48627754;BA.debugLine="LoadAshkhas";
_loadashkhas();
RDebugUtils.currentLine=48627755;
 //BA.debugLineNum = 48627755;BA.debugLine="Log(\"CodeGroupSelect2: \"&GroupCodeSelect2)";
anywheresoftware.b4a.keywords.Common.LogImpl("548627755","CodeGroupSelect2: "+mostCurrent._groupcodeselect2,0);
RDebugUtils.currentLine=48627756;
 //BA.debugLineNum = 48627756;BA.debugLine="Log(\"position2: \"&Position)";
anywheresoftware.b4a.keywords.Common.LogImpl("548627756","position2: "+BA.NumberToString(_position),0);
 } 
       catch (Exception e32) {
			processBA.setLastException(e32);RDebugUtils.currentLine=48627758;
 //BA.debugLineNum = 48627758;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("548627758",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=48627759;
 //BA.debugLineNum = 48627759;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-NiceSpinner1_ItemClick");
 };
RDebugUtils.currentLine=48627761;
 //BA.debugLineNum = 48627761;BA.debugLine="End Sub";
return "";
}
public static String  _swbed_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="act_moshtarian";
if (Debug.shouldDelegate(mostCurrent.activityBA, "swbed_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "swbed_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=49020928;
 //BA.debugLineNum = 49020928;BA.debugLine="Sub SwBed_CheckedChange(Checked As Boolean)";
RDebugUtils.currentLine=49020929;
 //BA.debugLineNum = 49020929;BA.debugLine="If Checked=True Then";
if (_checked==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=49020930;
 //BA.debugLineNum = 49020930;BA.debugLine="SwBes.Checked=False";
mostCurrent._swbes.setChecked(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=49020932;
 //BA.debugLineNum = 49020932;BA.debugLine="LoadAshkhas";
_loadashkhas();
RDebugUtils.currentLine=49020933;
 //BA.debugLineNum = 49020933;BA.debugLine="End Sub";
return "";
}
public static String  _swbes_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="act_moshtarian";
if (Debug.shouldDelegate(mostCurrent.activityBA, "swbes_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "swbes_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=49086464;
 //BA.debugLineNum = 49086464;BA.debugLine="Sub SwBes_CheckedChange(Checked As Boolean)";
RDebugUtils.currentLine=49086465;
 //BA.debugLineNum = 49086465;BA.debugLine="If Checked=True Then";
if (_checked==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=49086466;
 //BA.debugLineNum = 49086466;BA.debugLine="SwBed.Checked=False";
mostCurrent._swbed.setChecked(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=49086468;
 //BA.debugLineNum = 49086468;BA.debugLine="LoadAshkhas";
_loadashkhas();
RDebugUtils.currentLine=49086469;
 //BA.debugLineNum = 49086469;BA.debugLine="End Sub";
return "";
}
public static String  _swnew_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="act_moshtarian";
if (Debug.shouldDelegate(mostCurrent.activityBA, "swnew_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "swnew_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=48955392;
 //BA.debugLineNum = 48955392;BA.debugLine="Private Sub SwNew_CheckedChange(Checked As Boolean";
RDebugUtils.currentLine=48955393;
 //BA.debugLineNum = 48955393;BA.debugLine="LoadAshkhas";
_loadashkhas();
RDebugUtils.currentLine=48955394;
 //BA.debugLineNum = 48955394;BA.debugLine="End Sub";
return "";
}
public static String  _swtour_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="act_moshtarian";
if (Debug.shouldDelegate(mostCurrent.activityBA, "swtour_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "swtour_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=48889856;
 //BA.debugLineNum = 48889856;BA.debugLine="Sub SwTour_CheckedChange(Checked As Boolean)";
RDebugUtils.currentLine=48889857;
 //BA.debugLineNum = 48889857;BA.debugLine="LoadAshkhas";
_loadashkhas();
RDebugUtils.currentLine=48889858;
 //BA.debugLineNum = 48889858;BA.debugLine="End Sub";
return "";
}
public static String  _t_gps_tick() throws Exception{
RDebugUtils.currentModule="act_moshtarian";
if (Debug.shouldDelegate(mostCurrent.activityBA, "t_gps_tick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "t_gps_tick", null));}
RDebugUtils.currentLine=47841280;
 //BA.debugLineNum = 47841280;BA.debugLine="Sub t_gps_Tick";
RDebugUtils.currentLine=47841301;
 //BA.debugLineNum = 47841301;BA.debugLine="End Sub";
return "";
}
public static String  _txtsearch_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="act_moshtarian";
if (Debug.shouldDelegate(mostCurrent.activityBA, "txtsearch_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "txtsearch_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=48758784;
 //BA.debugLineNum = 48758784;BA.debugLine="Sub TxtSearch_TextChanged (Old As String, New As S";
RDebugUtils.currentLine=48758785;
 //BA.debugLineNum = 48758785;BA.debugLine="If TxtSearch.Text.StartsWith(\" \") Then";
if (mostCurrent._txtsearch.getText().startsWith(" ")) { 
RDebugUtils.currentLine=48758786;
 //BA.debugLineNum = 48758786;BA.debugLine="TxtSearch.Text=TxtSearch.Text.SubString(1)";
mostCurrent._txtsearch.setText(BA.ObjectToCharSequence(mostCurrent._txtsearch.getText().substring((int) (1))));
 };
RDebugUtils.currentLine=48758788;
 //BA.debugLineNum = 48758788;BA.debugLine="TxtSearch.SelectionStart=TxtSearch.Text.Length";
mostCurrent._txtsearch.setSelectionStart(mostCurrent._txtsearch.getText().length());
RDebugUtils.currentLine=48758789;
 //BA.debugLineNum = 48758789;BA.debugLine="LoadAshkhas";
_loadashkhas();
RDebugUtils.currentLine=48758790;
 //BA.debugLineNum = 48758790;BA.debugLine="End Sub";
return "";
}
public static String  _update_data() throws Exception{
RDebugUtils.currentModule="act_moshtarian";
if (Debug.shouldDelegate(mostCurrent.activityBA, "update_data", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "update_data", null));}
RDebugUtils.currentLine=47775744;
 //BA.debugLineNum = 47775744;BA.debugLine="Sub update_data";
RDebugUtils.currentLine=47775745;
 //BA.debugLineNum = 47775745;BA.debugLine="Try";
try {RDebugUtils.currentLine=47775746;
 //BA.debugLineNum = 47775746;BA.debugLine="If MCode.IsConnected Then";
if (mostCurrent._mcode._isconnected /*boolean*/ (mostCurrent.activityBA)) { 
RDebugUtils.currentLine=47775747;
 //BA.debugLineNum = 47775747;BA.debugLine="MCode.page=\"Act_Moshtarian\"";
mostCurrent._mcode._page /*String*/  = "Act_Moshtarian";
RDebugUtils.currentLine=47775748;
 //BA.debugLineNum = 47775748;BA.debugLine="FirebaseMessaging.mode=\"GetGoroohAshkhas\"";
mostCurrent._firebasemessaging._mode /*String*/  = "GetGoroohAshkhas";
RDebugUtils.currentLine=47775749;
 //BA.debugLineNum = 47775749;BA.debugLine="StartService(FirebaseMessaging)";
anywheresoftware.b4a.keywords.Common.StartService(processBA,(Object)(mostCurrent._firebasemessaging.getObject()));
 }else {
RDebugUtils.currentLine=47775751;
 //BA.debugLineNum = 47775751;BA.debugLine="LoadAshkhas";
_loadashkhas();
 };
 } 
       catch (Exception e10) {
			processBA.setLastException(e10);RDebugUtils.currentLine=47775754;
 //BA.debugLineNum = 47775754;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("547775754",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=47775755;
 //BA.debugLineNum = 47775755;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-update_data");
 };
RDebugUtils.currentLine=47775757;
 //BA.debugLineNum = 47775757;BA.debugLine="End Sub";
return "";
}
}