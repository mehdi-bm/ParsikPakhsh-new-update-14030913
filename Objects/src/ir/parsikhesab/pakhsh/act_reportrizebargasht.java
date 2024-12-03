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

public class act_reportrizebargasht extends Activity implements B4AActivity{
	public static act_reportrizebargasht mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.act_reportrizebargasht");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (act_reportrizebargasht).");
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
		activityBA = new BA(this, layout, processBA, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.act_reportrizebargasht");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "ir.parsikhesab.pakhsh.act_reportrizebargasht", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (act_reportrizebargasht) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (act_reportrizebargasht) Resume **");
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
		return act_reportrizebargasht.class;
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
            BA.LogInfo("** Activity (act_reportrizebargasht) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (act_reportrizebargasht) Pause event (activity is not paused). **");
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
            act_reportrizebargasht mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (act_reportrizebargasht) Resume **");
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
public static String _shomareforoosh = "";
public static String _shomarefaktor = "";
public static String _dateaz = "";
public static String _dateta = "";
public ir.parsikhesab.pakhsh.table _table1 = null;
public ir.parsikhesab.pakhsh.table _table2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbldate = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbldatebargashti = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblmablaghmande = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbln_ashkhas = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblshomarebargashti = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblshomarefaktor = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblshomareforoosh = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltedadbargashti = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltedadmande = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltedadsefaresh = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltotalbargashti = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltotalfaktor = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblc_ashkhas = null;
public anywheresoftware.b4a.objects.collections.List _listfaktor1 = null;
public anywheresoftware.b4a.objects.collections.List _listfaktor2 = null;
public anywheresoftware.b4a.objects.collections.List _listfaktor3 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _lblback = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnl_table1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnl_table2 = null;
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
RDebugUtils.currentModule="act_reportrizebargasht";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=61603840;
 //BA.debugLineNum = 61603840;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=61603841;
 //BA.debugLineNum = 61603841;BA.debugLine="Activity.LoadLayout(\"L_RepRizeBargasht\")";
mostCurrent._activity.LoadLayout("L_RepRizeBargasht",mostCurrent.activityBA);
RDebugUtils.currentLine=61603844;
 //BA.debugLineNum = 61603844;BA.debugLine="ListFaktor1.Initialize";
mostCurrent._listfaktor1.Initialize();
RDebugUtils.currentLine=61603845;
 //BA.debugLineNum = 61603845;BA.debugLine="ListFaktor2.Initialize";
mostCurrent._listfaktor2.Initialize();
RDebugUtils.currentLine=61603846;
 //BA.debugLineNum = 61603846;BA.debugLine="ListFaktor3.Initialize";
mostCurrent._listfaktor3.Initialize();
RDebugUtils.currentLine=61603847;
 //BA.debugLineNum = 61603847;BA.debugLine="Table1.Initialize(Me, \"Table1\",6)";
mostCurrent._table1._initialize /*String*/ (null,mostCurrent.activityBA,act_reportrizebargasht.getObject(),"Table1",(int) (6));
RDebugUtils.currentLine=61603848;
 //BA.debugLineNum = 61603848;BA.debugLine="Table1.AddToActivity(pnl_Table1, 0,0,100%x,pnl_Ta";
mostCurrent._table1._addtoactivity /*String*/ (null,(anywheresoftware.b4a.objects.ActivityWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ActivityWrapper(), (anywheresoftware.b4a.BALayout)(mostCurrent._pnl_table1.getObject())),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),mostCurrent._pnl_table1.getHeight());
RDebugUtils.currentLine=61603850;
 //BA.debugLineNum = 61603850;BA.debugLine="Table2.Initialize(Me, \"Table2\",6)";
mostCurrent._table2._initialize /*String*/ (null,mostCurrent.activityBA,act_reportrizebargasht.getObject(),"Table2",(int) (6));
RDebugUtils.currentLine=61603851;
 //BA.debugLineNum = 61603851;BA.debugLine="Table2.AddToActivity(pnl_Table2, 0,0,100%x,pnl_Ta";
mostCurrent._table2._addtoactivity /*String*/ (null,(anywheresoftware.b4a.objects.ActivityWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ActivityWrapper(), (anywheresoftware.b4a.BALayout)(mostCurrent._pnl_table2.getObject())),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),mostCurrent._pnl_table2.getHeight());
RDebugUtils.currentLine=61603854;
 //BA.debugLineNum = 61603854;BA.debugLine="CreatePage";
_createpage();
RDebugUtils.currentLine=61603855;
 //BA.debugLineNum = 61603855;BA.debugLine="End Sub";
return "";
}
public static String  _createpage() throws Exception{
RDebugUtils.currentModule="act_reportrizebargasht";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createpage", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "createpage", null));}
String _fldtedadjozforoosh = "";
String _fldtedadkolforoosh = "";
ir.parsikhesab.pakhsh.mcode._adapterlistfaktor _item = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu2 = null;
int _j = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
ir.parsikhesab.pakhsh.mcode._adapterlistfaktor _item2 = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu3 = null;
RDebugUtils.currentLine=61800448;
 //BA.debugLineNum = 61800448;BA.debugLine="Sub CreatePage";
RDebugUtils.currentLine=61800449;
 //BA.debugLineNum = 61800449;BA.debugLine="Try";
try {RDebugUtils.currentLine=61800450;
 //BA.debugLineNum = 61800450;BA.debugLine="If shomareForoosh>0 Then";
if ((double)(Double.parseDouble(_shomareforoosh))>0) { 
RDebugUtils.currentLine=61800451;
 //BA.debugLineNum = 61800451;BA.debugLine="Dim fldTedadJozForoosh As String=0";
_fldtedadjozforoosh = BA.NumberToString(0);
RDebugUtils.currentLine=61800452;
 //BA.debugLineNum = 61800452;BA.debugLine="Dim fldTedadKolForoosh As String=0";
_fldtedadkolforoosh = BA.NumberToString(0);
RDebugUtils.currentLine=61800453;
 //BA.debugLineNum = 61800453;BA.debugLine="Dim Item As AdapterListFaktor";
_item = new ir.parsikhesab.pakhsh.mcode._adapterlistfaktor();
RDebugUtils.currentLine=61800454;
 //BA.debugLineNum = 61800454;BA.debugLine="Dim cu2 As Cursor = MCode.Result(\"select * from";
_cu2 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu2 = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"select * from  TblFaktor where fldShomareForoosh="+_shomareforoosh+" and FldDate between "+_dateaz+" and "+_dateta);
RDebugUtils.currentLine=61800455;
 //BA.debugLineNum = 61800455;BA.debugLine="For j=0 To cu2.RowCount-1";
{
final int step7 = 1;
final int limit7 = (int) (_cu2.getRowCount()-1);
_j = (int) (0) ;
for (;_j <= limit7 ;_j = _j + step7 ) {
RDebugUtils.currentLine=61800456;
 //BA.debugLineNum = 61800456;BA.debugLine="cu2.Position=j";
_cu2.setPosition(_j);
RDebugUtils.currentLine=61800457;
 //BA.debugLineNum = 61800457;BA.debugLine="Item.fldShomareForoosh=cu2.GetString(\"fldShomar";
_item.fldShomareForoosh /*String*/  = _cu2.GetString("fldShomareForoosh");
RDebugUtils.currentLine=61800458;
 //BA.debugLineNum = 61800458;BA.debugLine="Item.fldC_Ashkhas=cu2.GetString(\"FldC_Tafzili\")";
_item.fldC_Ashkhas /*String*/  = _cu2.GetString("FldC_Tafzili");
RDebugUtils.currentLine=61800459;
 //BA.debugLineNum = 61800459;BA.debugLine="Item.FldAmani=cu2.GetString(\"FldAmani\")";
_item.FldAmani /*String*/  = _cu2.GetString("FldAmani");
RDebugUtils.currentLine=61800460;
 //BA.debugLineNum = 61800460;BA.debugLine="Select cu2.GetString(\"FldType\")";
switch (BA.switchObjectToInt(_cu2.GetString("FldType"),"Foroosh","Marjoee")) {
case 0: {
RDebugUtils.currentLine=61800462;
 //BA.debugLineNum = 61800462;BA.debugLine="Item.fldShomareFaktor=cu2.GetString(\"FldShoma";
_item.fldShomareFaktor /*String*/  = _cu2.GetString("FldShomareFaktor");
RDebugUtils.currentLine=61800463;
 //BA.debugLineNum = 61800463;BA.debugLine="Item.fldDate=MCode.PersianDateDash(cu2.GetStr";
_item.fldDate /*String*/  = mostCurrent._mcode._persiandatedash /*String*/ (mostCurrent.activityBA,_cu2.GetString("FldDate"));
RDebugUtils.currentLine=61800464;
 //BA.debugLineNum = 61800464;BA.debugLine="Item.fldTotalFaktor=cu2.GetString(\"FldTotalFa";
_item.fldTotalFaktor /*String*/  = _cu2.GetString("FldTotalFaktor");
RDebugUtils.currentLine=61800465;
 //BA.debugLineNum = 61800465;BA.debugLine="fldTedadJozForoosh=fldTedadJozForoosh+cu2.Get";
_fldtedadjozforoosh = BA.NumberToString((double)(Double.parseDouble(_fldtedadjozforoosh))+(double)(Double.parseDouble(_cu2.GetString("FldTedadDarSabadJoz"))));
RDebugUtils.currentLine=61800466;
 //BA.debugLineNum = 61800466;BA.debugLine="fldTedadKolForoosh=fldTedadKolForoosh+cu2.Get";
_fldtedadkolforoosh = BA.NumberToString((double)(Double.parseDouble(_fldtedadkolforoosh))+(double)(Double.parseDouble(_cu2.GetString("FldTedadDarSabadKol"))));
 break; }
case 1: {
RDebugUtils.currentLine=61800469;
 //BA.debugLineNum = 61800469;BA.debugLine="Item.FldShomareBargasht=cu2.GetString(\"FldSho";
_item.FldShomareBargasht /*String*/  = _cu2.GetString("FldShomareFaktor");
RDebugUtils.currentLine=61800470;
 //BA.debugLineNum = 61800470;BA.debugLine="Item.FldDateBargasht=MCode.PersianDateDash(cu";
_item.FldDateBargasht /*String*/  = mostCurrent._mcode._persiandatedash /*String*/ (mostCurrent.activityBA,_cu2.GetString("FldDate"));
RDebugUtils.currentLine=61800471;
 //BA.debugLineNum = 61800471;BA.debugLine="Item.FldMablaghBargasht=MCode.SingleResult(\"S";
_item.FldMablaghBargasht /*String*/  = BA.ObjectToString(mostCurrent._mcode._singleresult /*Object*/ (mostCurrent.activityBA,"Select distinct FldTotalFaktor from TblFaktor where FldType='"+_cu2.GetString("FldType")+"' and FldDate between "+_dateaz+" and "+_dateta+" and fldShomareForoosh="+_shomareforoosh));
RDebugUtils.currentLine=61800472;
 //BA.debugLineNum = 61800472;BA.debugLine="Item.fldTedadJozMarjoee=MCode.SingleResult(\"S";
_item.fldTedadJozMarjoee /*String*/  = BA.ObjectToString(mostCurrent._mcode._singleresult /*Object*/ (mostCurrent.activityBA,"Select sum(FldTedadDarSabadJoz) from TblFaktor where FldType='"+_cu2.GetString("FldType")+"' and FldDate between "+_dateaz+" and "+_dateta+"  and fldShomareForoosh="+_shomareforoosh));
RDebugUtils.currentLine=61800473;
 //BA.debugLineNum = 61800473;BA.debugLine="Item.fldTedadCartonMarjoee=MCode.SingleResult";
_item.fldTedadCartonMarjoee /*String*/  = BA.ObjectToString(mostCurrent._mcode._singleresult /*Object*/ (mostCurrent.activityBA,"Select sum(FldTedadDarSabadKol) from TblFaktor where FldType='"+_cu2.GetString("FldType")+"' and FldDate between "+_dateaz+" and "+_dateta+"  and fldShomareForoosh="+_shomareforoosh));
RDebugUtils.currentLine=61800474;
 //BA.debugLineNum = 61800474;BA.debugLine="Item.fldTedadJozMande=fldTedadJozForoosh-Item";
_item.fldTedadJozMande /*String*/  = BA.NumberToString((double)(Double.parseDouble(_fldtedadjozforoosh))-(double)(Double.parseDouble(_item.fldTedadJozMarjoee /*String*/ )));
RDebugUtils.currentLine=61800475;
 //BA.debugLineNum = 61800475;BA.debugLine="Item.fldTedadCartonMande=fldTedadKolForoosh-I";
_item.fldTedadCartonMande /*String*/  = BA.NumberToString((double)(Double.parseDouble(_fldtedadkolforoosh))-(double)(Double.parseDouble(_item.fldTedadCartonMarjoee /*String*/ )));
RDebugUtils.currentLine=61800476;
 //BA.debugLineNum = 61800476;BA.debugLine="Item.fldMablaghMande=Item.fldTotalFaktor-Item";
_item.fldMablaghMande /*String*/  = BA.NumberToString((double)(Double.parseDouble(_item.fldTotalFaktor /*String*/ ))-(double)(Double.parseDouble(_item.FldMablaghBargasht /*String*/ )));
 break; }
}
;
 }
};
RDebugUtils.currentLine=61800479;
 //BA.debugLineNum = 61800479;BA.debugLine="Item.fldTedadJoz=fldTedadJozForoosh";
_item.fldTedadJoz /*String*/  = _fldtedadjozforoosh;
RDebugUtils.currentLine=61800480;
 //BA.debugLineNum = 61800480;BA.debugLine="Item.fldTedadCarton=fldTedadKolForoosh";
_item.fldTedadCarton /*String*/  = _fldtedadkolforoosh;
RDebugUtils.currentLine=61800481;
 //BA.debugLineNum = 61800481;BA.debugLine="LblShomareFaktor.Text = Item.fldShomareFaktor";
mostCurrent._lblshomarefaktor.setText(BA.ObjectToCharSequence(_item.fldShomareFaktor /*String*/ ));
RDebugUtils.currentLine=61800482;
 //BA.debugLineNum = 61800482;BA.debugLine="LblTotalFaktor.Text = NumberFormat(Item.fldTotal";
mostCurrent._lbltotalfaktor.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.NumberFormat((double)(Double.parseDouble(_item.fldTotalFaktor /*String*/ )),(int) (1),(int) (3))));
RDebugUtils.currentLine=61800483;
 //BA.debugLineNum = 61800483;BA.debugLine="LblDate.Text = Item.fldDate";
mostCurrent._lbldate.setText(BA.ObjectToCharSequence(_item.fldDate /*String*/ ));
RDebugUtils.currentLine=61800484;
 //BA.debugLineNum = 61800484;BA.debugLine="LblC_Ashkhas.Text = Item.fldC_Ashkhas";
mostCurrent._lblc_ashkhas.setText(BA.ObjectToCharSequence(_item.fldC_Ashkhas /*String*/ ));
RDebugUtils.currentLine=61800485;
 //BA.debugLineNum = 61800485;BA.debugLine="lblShomareForoosh.Text=Item.fldShomareForoosh";
mostCurrent._lblshomareforoosh.setText(BA.ObjectToCharSequence(_item.fldShomareForoosh /*String*/ ));
RDebugUtils.currentLine=61800486;
 //BA.debugLineNum = 61800486;BA.debugLine="lblShomareBargashti.Text=IIf(myCode.Check_Is_Nul";
mostCurrent._lblshomarebargashti.setText(BA.ObjectToCharSequence(((mostCurrent._mycode._check_is_null /*boolean*/ (mostCurrent.activityBA,_item.FldShomareBargasht /*String*/ )) ? ((Object)("-")) : ((Object)(_item.FldShomareBargasht /*String*/ )))));
RDebugUtils.currentLine=61800487;
 //BA.debugLineNum = 61800487;BA.debugLine="lblDateBargashti.Text=IIf(myCode.Check_Is_Null(I";
mostCurrent._lbldatebargashti.setText(BA.ObjectToCharSequence(((mostCurrent._mycode._check_is_null /*boolean*/ (mostCurrent.activityBA,_item.FldDateBargasht /*String*/ )) ? ((Object)("-")) : ((Object)(_item.FldDateBargasht /*String*/ )))));
RDebugUtils.currentLine=61800488;
 //BA.debugLineNum = 61800488;BA.debugLine="lblTedadSefaresh.Text=myCode.ToInt(myCode.Is_Nul";
mostCurrent._lbltedadsefaresh.setText(BA.ObjectToCharSequence(BA.NumberToString(mostCurrent._mycode._toint /*int*/ (mostCurrent.activityBA,(Object)(mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_item.fldTedadJoz /*String*/ ))))+"-"+BA.NumberToString(mostCurrent._mycode._toint /*int*/ (mostCurrent.activityBA,(Object)(mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_item.fldTedadCarton /*String*/ ))))));
RDebugUtils.currentLine=61800489;
 //BA.debugLineNum = 61800489;BA.debugLine="lblTedadBargashti.Text=myCode.ToInt(myCode.Is_Nu";
mostCurrent._lbltedadbargashti.setText(BA.ObjectToCharSequence(BA.NumberToString(mostCurrent._mycode._toint /*int*/ (mostCurrent.activityBA,(Object)(mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_item.fldTedadJozMarjoee /*String*/ ))))+"-"+BA.NumberToString(mostCurrent._mycode._toint /*int*/ (mostCurrent.activityBA,(Object)(mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_item.fldTedadCartonMarjoee /*String*/ ))))));
RDebugUtils.currentLine=61800490;
 //BA.debugLineNum = 61800490;BA.debugLine="lblTedadMande.Text=myCode.ToInt(myCode.Is_Null_a";
mostCurrent._lbltedadmande.setText(BA.ObjectToCharSequence(BA.NumberToString(mostCurrent._mycode._toint /*int*/ (mostCurrent.activityBA,(Object)(mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_item.fldTedadJozMande /*String*/ ))))+"-"+BA.NumberToString(mostCurrent._mycode._toint /*int*/ (mostCurrent.activityBA,(Object)(mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_item.fldTedadCartonMande /*String*/ ))))));
RDebugUtils.currentLine=61800491;
 //BA.debugLineNum = 61800491;BA.debugLine="lblMablaghMande.Text=IIf(myCode.Check_Is_Null(It";
mostCurrent._lblmablaghmande.setText(BA.ObjectToCharSequence(((mostCurrent._mycode._check_is_null /*boolean*/ (mostCurrent.activityBA,_item.fldMablaghMande /*String*/ )) ? ((Object)(0)) : ((Object)(mostCurrent._mycode._adadtoprice /*String*/ (mostCurrent.activityBA,_item.fldMablaghMande /*String*/ ))))));
RDebugUtils.currentLine=61800492;
 //BA.debugLineNum = 61800492;BA.debugLine="lblTotalBargashti.Text=IIf(myCode.Check_Is_Null(";
mostCurrent._lbltotalbargashti.setText(BA.ObjectToCharSequence(((mostCurrent._mycode._check_is_null /*boolean*/ (mostCurrent.activityBA,_item.FldMablaghBargasht /*String*/ )) ? ((Object)(0)) : ((Object)(mostCurrent._mycode._adadtoprice /*String*/ (mostCurrent.activityBA,_item.FldMablaghBargasht /*String*/ ))))));
RDebugUtils.currentLine=61800493;
 //BA.debugLineNum = 61800493;BA.debugLine="Dim Cu As Cursor= MCode.Result(\"Select fldSharhe";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select fldSharheTafzili From TblAshkhas where FldCodeTafzili = '"+_item.fldC_Ashkhas /*String*/ +"'");
RDebugUtils.currentLine=61800494;
 //BA.debugLineNum = 61800494;BA.debugLine="If Cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=61800495;
 //BA.debugLineNum = 61800495;BA.debugLine="Cu.Position=0";
_cu.setPosition((int) (0));
RDebugUtils.currentLine=61800496;
 //BA.debugLineNum = 61800496;BA.debugLine="LblN_Ashkhas.Text = Cu.GetString(\"fldSharheTafz";
mostCurrent._lbln_ashkhas.setText(BA.ObjectToCharSequence(_cu.GetString("fldSharheTafzili")));
 }else {
RDebugUtils.currentLine=61800498;
 //BA.debugLineNum = 61800498;BA.debugLine="LblN_Ashkhas.Text = \"-\"";
mostCurrent._lbln_ashkhas.setText(BA.ObjectToCharSequence("-"));
 };
 }else {
RDebugUtils.currentLine=61800502;
 //BA.debugLineNum = 61800502;BA.debugLine="Dim Item2 As AdapterListFaktor";
_item2 = new ir.parsikhesab.pakhsh.mcode._adapterlistfaktor();
RDebugUtils.currentLine=61800503;
 //BA.debugLineNum = 61800503;BA.debugLine="Dim cu3 As Cursor = MCode.Result(\"select * from";
_cu3 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu3 = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"select * from  TblFaktor where FldShomareFaktor="+_shomarefaktor+"  And FldDate between "+_dateaz+" And "+_dateta);
RDebugUtils.currentLine=61800504;
 //BA.debugLineNum = 61800504;BA.debugLine="If cu3.RowCount>0 Then";
if (_cu3.getRowCount()>0) { 
RDebugUtils.currentLine=61800505;
 //BA.debugLineNum = 61800505;BA.debugLine="For j=0 To cu3.RowCount-1";
{
final int step55 = 1;
final int limit55 = (int) (_cu3.getRowCount()-1);
_j = (int) (0) ;
for (;_j <= limit55 ;_j = _j + step55 ) {
RDebugUtils.currentLine=61800506;
 //BA.debugLineNum = 61800506;BA.debugLine="cu3.Position=j";
_cu3.setPosition(_j);
RDebugUtils.currentLine=61800507;
 //BA.debugLineNum = 61800507;BA.debugLine="Item2.fldShomareForoosh=cu3.GetString(\"fldSho";
_item2.fldShomareForoosh /*String*/  = _cu3.GetString("fldShomareForoosh");
RDebugUtils.currentLine=61800508;
 //BA.debugLineNum = 61800508;BA.debugLine="Item2.fldC_Ashkhas=cu3.GetString(\"FldC_Tafzil";
_item2.fldC_Ashkhas /*String*/  = _cu3.GetString("FldC_Tafzili");
RDebugUtils.currentLine=61800509;
 //BA.debugLineNum = 61800509;BA.debugLine="Item2.FldAmani=cu3.GetString(\"FldAmani\")";
_item2.FldAmani /*String*/  = _cu3.GetString("FldAmani");
RDebugUtils.currentLine=61800510;
 //BA.debugLineNum = 61800510;BA.debugLine="Select cu3.GetString(\"FldType\")";
switch (BA.switchObjectToInt(_cu3.GetString("FldType"),"Foroosh")) {
case 0: {
RDebugUtils.currentLine=61800512;
 //BA.debugLineNum = 61800512;BA.debugLine="Item2.fldShomareFaktor=cu3.GetString(\"FldSh";
_item2.fldShomareFaktor /*String*/  = _cu3.GetString("FldShomareFaktor");
RDebugUtils.currentLine=61800513;
 //BA.debugLineNum = 61800513;BA.debugLine="Item2.fldDate=MCode.PersianDateDash(cu3.Get";
_item2.fldDate /*String*/  = mostCurrent._mcode._persiandatedash /*String*/ (mostCurrent.activityBA,_cu3.GetString("FldDate"));
RDebugUtils.currentLine=61800514;
 //BA.debugLineNum = 61800514;BA.debugLine="Item2.fldTotalFaktor=cu3.GetString(\"FldTota";
_item2.fldTotalFaktor /*String*/  = _cu3.GetString("FldTotalFaktor");
RDebugUtils.currentLine=61800515;
 //BA.debugLineNum = 61800515;BA.debugLine="Item2.fldTedadJoz=cu3.GetString(\"FldTedadDa";
_item2.fldTedadJoz /*String*/  = _cu3.GetString("FldTedadDarSabadJoz");
RDebugUtils.currentLine=61800516;
 //BA.debugLineNum = 61800516;BA.debugLine="Item2.fldTedadCarton=cu3.GetString(\"FldTeda";
_item2.fldTedadCarton /*String*/  = _cu3.GetString("FldTedadDarSabadKol");
 break; }
}
;
 }
};
RDebugUtils.currentLine=61800521;
 //BA.debugLineNum = 61800521;BA.debugLine="LblShomareFaktor.Text = Item2.fldShomareFaktor";
mostCurrent._lblshomarefaktor.setText(BA.ObjectToCharSequence(_item2.fldShomareFaktor /*String*/ ));
RDebugUtils.currentLine=61800522;
 //BA.debugLineNum = 61800522;BA.debugLine="LblTotalFaktor.Text = NumberFormat(Item2.fldTo";
mostCurrent._lbltotalfaktor.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.NumberFormat((double)(Double.parseDouble(_item2.fldTotalFaktor /*String*/ )),(int) (1),(int) (3))));
RDebugUtils.currentLine=61800523;
 //BA.debugLineNum = 61800523;BA.debugLine="LblDate.Text = Item2.fldDate";
mostCurrent._lbldate.setText(BA.ObjectToCharSequence(_item2.fldDate /*String*/ ));
RDebugUtils.currentLine=61800524;
 //BA.debugLineNum = 61800524;BA.debugLine="LblC_Ashkhas.Text = Item2.fldC_Ashkhas";
mostCurrent._lblc_ashkhas.setText(BA.ObjectToCharSequence(_item2.fldC_Ashkhas /*String*/ ));
RDebugUtils.currentLine=61800525;
 //BA.debugLineNum = 61800525;BA.debugLine="lblShomareForoosh.Text=Item2.fldShomareForoosh";
mostCurrent._lblshomareforoosh.setText(BA.ObjectToCharSequence(_item2.fldShomareForoosh /*String*/ ));
RDebugUtils.currentLine=61800526;
 //BA.debugLineNum = 61800526;BA.debugLine="lblShomareBargashti.Text=0'IIf(myCode.Check_Is";
mostCurrent._lblshomarebargashti.setText(BA.ObjectToCharSequence(0));
RDebugUtils.currentLine=61800527;
 //BA.debugLineNum = 61800527;BA.debugLine="lblDateBargashti.Text=0'IIf(myCode.Check_Is_Nu";
mostCurrent._lbldatebargashti.setText(BA.ObjectToCharSequence(0));
RDebugUtils.currentLine=61800528;
 //BA.debugLineNum = 61800528;BA.debugLine="lblTedadSefaresh.Text=myCode.ToInt(myCode.Is_N";
mostCurrent._lbltedadsefaresh.setText(BA.ObjectToCharSequence(BA.NumberToString(mostCurrent._mycode._toint /*int*/ (mostCurrent.activityBA,(Object)(mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_item2.fldTedadJoz /*String*/ ))))+"-"+BA.NumberToString(mostCurrent._mycode._toint /*int*/ (mostCurrent.activityBA,(Object)(mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_item2.fldTedadCarton /*String*/ ))))));
RDebugUtils.currentLine=61800529;
 //BA.debugLineNum = 61800529;BA.debugLine="lblTedadBargashti.Text=0'myCode.ToInt(myCode.I";
mostCurrent._lbltedadbargashti.setText(BA.ObjectToCharSequence(0));
RDebugUtils.currentLine=61800530;
 //BA.debugLineNum = 61800530;BA.debugLine="lblTedadMande.Text=0'myCode.ToInt(myCode.Is_Nu";
mostCurrent._lbltedadmande.setText(BA.ObjectToCharSequence(0));
RDebugUtils.currentLine=61800531;
 //BA.debugLineNum = 61800531;BA.debugLine="lblMablaghMande.Text=0'IIf(myCode.Check_Is_Nul";
mostCurrent._lblmablaghmande.setText(BA.ObjectToCharSequence(0));
RDebugUtils.currentLine=61800532;
 //BA.debugLineNum = 61800532;BA.debugLine="lblTotalBargashti.Text=0'IIf(myCode.Check_Is_N";
mostCurrent._lbltotalbargashti.setText(BA.ObjectToCharSequence(0));
 };
 };
RDebugUtils.currentLine=61800536;
 //BA.debugLineNum = 61800536;BA.debugLine="LoadData";
_loaddata();
 } 
       catch (Exception e85) {
			processBA.setLastException(e85);RDebugUtils.currentLine=61800538;
 //BA.debugLineNum = 61800538;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("561800538",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 };
RDebugUtils.currentLine=61800540;
 //BA.debugLineNum = 61800540;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="act_reportrizebargasht";
RDebugUtils.currentLine=62062592;
 //BA.debugLineNum = 62062592;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=62062594;
 //BA.debugLineNum = 62062594;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="act_reportrizebargasht";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=61931520;
 //BA.debugLineNum = 61931520;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=61931522;
 //BA.debugLineNum = 61931522;BA.debugLine="End Sub";
return "";
}
public static String  _loaddata() throws Exception{
RDebugUtils.currentModule="act_reportrizebargasht";
if (Debug.shouldDelegate(mostCurrent.activityBA, "loaddata", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "loaddata", null));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu2 = null;
int _j = 0;
ir.parsikhesab.pakhsh.mcode._adapterlistrizefaktor _item = null;
int _c = 0;
int _i = 0;
ir.parsikhesab.pakhsh.mcode._adapterlistrizefaktor _item2 = null;
ir.parsikhesab.pakhsh.mcode._adapterlistrizefaktor _itemforoosh = null;
String _tedadjoz = "";
String _tedadcarton = "";
String _totalfaktor = "";
ir.parsikhesab.pakhsh.mcode._adapterlistrizefaktor _itembargasht = null;
RDebugUtils.currentLine=61865984;
 //BA.debugLineNum = 61865984;BA.debugLine="Public Sub LoadData";
RDebugUtils.currentLine=61865985;
 //BA.debugLineNum = 61865985;BA.debugLine="Try";
try {RDebugUtils.currentLine=61866013;
 //BA.debugLineNum = 61866013;BA.debugLine="ListFaktor1.Clear";
mostCurrent._listfaktor1.Clear();
RDebugUtils.currentLine=61866014;
 //BA.debugLineNum = 61866014;BA.debugLine="ListFaktor2.Clear";
mostCurrent._listfaktor2.Clear();
RDebugUtils.currentLine=61866016;
 //BA.debugLineNum = 61866016;BA.debugLine="Dim cu2 As Cursor = MCode.Result(\"select * from";
_cu2 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu2 = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"select * from  TblFaktor where  fldShomareForoosh="+_shomareforoosh+" and FldDate between "+_dateaz+" and "+_dateta);
RDebugUtils.currentLine=61866017;
 //BA.debugLineNum = 61866017;BA.debugLine="For j=0 To cu2.RowCount-1";
{
final int step5 = 1;
final int limit5 = (int) (_cu2.getRowCount()-1);
_j = (int) (0) ;
for (;_j <= limit5 ;_j = _j + step5 ) {
RDebugUtils.currentLine=61866018;
 //BA.debugLineNum = 61866018;BA.debugLine="cu2.Position=j";
_cu2.setPosition(_j);
RDebugUtils.currentLine=61866019;
 //BA.debugLineNum = 61866019;BA.debugLine="Dim Item As AdapterListRizeFaktor";
_item = new ir.parsikhesab.pakhsh.mcode._adapterlistrizefaktor();
RDebugUtils.currentLine=61866020;
 //BA.debugLineNum = 61866020;BA.debugLine="Item.FldRadif=j+1";
_item.FldRadif /*String*/  = BA.NumberToString(_j+1);
RDebugUtils.currentLine=61866021;
 //BA.debugLineNum = 61866021;BA.debugLine="Item.fldShomareFaktor=cu2.GetString(\"FldShomar";
_item.fldShomareFaktor /*String*/  = _cu2.GetString("FldShomareFaktor");
RDebugUtils.currentLine=61866022;
 //BA.debugLineNum = 61866022;BA.debugLine="Item.fldCodeKala=cu2.GetString(\"FldCodeKala\")";
_item.fldCodeKala /*String*/  = _cu2.GetString("FldCodeKala");
RDebugUtils.currentLine=61866023;
 //BA.debugLineNum = 61866023;BA.debugLine="Item.fldSharhKala=cu2.GetString(\"FldNamekala\")";
_item.fldSharhKala /*String*/  = _cu2.GetString("FldNamekala");
RDebugUtils.currentLine=61866024;
 //BA.debugLineNum = 61866024;BA.debugLine="Item.fldTotalFaktor=cu2.GetString(\"FldTotalFak";
_item.fldTotalFaktor /*String*/  = _cu2.GetString("FldTotalFaktor");
RDebugUtils.currentLine=61866025;
 //BA.debugLineNum = 61866025;BA.debugLine="Item.fldTedadJoz=cu2.GetString(\"FldTedadDarSab";
_item.fldTedadJoz /*String*/  = _cu2.GetString("FldTedadDarSabadJoz");
RDebugUtils.currentLine=61866026;
 //BA.debugLineNum = 61866026;BA.debugLine="Item.fldTedadCarton=cu2.GetString(\"FldTedadDar";
_item.fldTedadCarton /*String*/  = _cu2.GetString("FldTedadDarSabadKol");
RDebugUtils.currentLine=61866027;
 //BA.debugLineNum = 61866027;BA.debugLine="Select cu2.GetString(\"FldType\")";
switch (BA.switchObjectToInt(_cu2.GetString("FldType"),"Foroosh","Marjoee")) {
case 0: {
RDebugUtils.currentLine=61866029;
 //BA.debugLineNum = 61866029;BA.debugLine="Item.FldType=\"فروش\"";
_item.FldType /*String*/  = "فروش";
RDebugUtils.currentLine=61866030;
 //BA.debugLineNum = 61866030;BA.debugLine="ListFaktor1.Add(Item)";
mostCurrent._listfaktor1.Add((Object)(_item));
 break; }
case 1: {
RDebugUtils.currentLine=61866032;
 //BA.debugLineNum = 61866032;BA.debugLine="Item.FldType=\"مرجوعی\"";
_item.FldType /*String*/  = "مرجوعی";
RDebugUtils.currentLine=61866033;
 //BA.debugLineNum = 61866033;BA.debugLine="ListFaktor2.Add(Item)";
mostCurrent._listfaktor2.Add((Object)(_item));
 break; }
}
;
 }
};
RDebugUtils.currentLine=61866037;
 //BA.debugLineNum = 61866037;BA.debugLine="ListFaktor3.Clear";
mostCurrent._listfaktor3.Clear();
RDebugUtils.currentLine=61866038;
 //BA.debugLineNum = 61866038;BA.debugLine="Dim c As Int=0";
_c = (int) (0);
RDebugUtils.currentLine=61866039;
 //BA.debugLineNum = 61866039;BA.debugLine="For i=0 To ListFaktor1.Size-1";
{
final int step26 = 1;
final int limit26 = (int) (mostCurrent._listfaktor1.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit26 ;_i = _i + step26 ) {
RDebugUtils.currentLine=61866040;
 //BA.debugLineNum = 61866040;BA.debugLine="Dim Item2 As AdapterListRizeFaktor";
_item2 = new ir.parsikhesab.pakhsh.mcode._adapterlistrizefaktor();
RDebugUtils.currentLine=61866041;
 //BA.debugLineNum = 61866041;BA.debugLine="Dim ItemForoosh  = ListFaktor1.Get(i) As Adapt";
_itemforoosh = (ir.parsikhesab.pakhsh.mcode._adapterlistrizefaktor)(mostCurrent._listfaktor1.Get(_i));
RDebugUtils.currentLine=61866042;
 //BA.debugLineNum = 61866042;BA.debugLine="Dim TedadJoz As String=0";
_tedadjoz = BA.NumberToString(0);
RDebugUtils.currentLine=61866043;
 //BA.debugLineNum = 61866043;BA.debugLine="Dim TedadCarton As String=0";
_tedadcarton = BA.NumberToString(0);
RDebugUtils.currentLine=61866044;
 //BA.debugLineNum = 61866044;BA.debugLine="Dim TotalFaktor As String=0";
_totalfaktor = BA.NumberToString(0);
RDebugUtils.currentLine=61866045;
 //BA.debugLineNum = 61866045;BA.debugLine="For j=0 To ListFaktor2.Size-1";
{
final int step32 = 1;
final int limit32 = (int) (mostCurrent._listfaktor2.getSize()-1);
_j = (int) (0) ;
for (;_j <= limit32 ;_j = _j + step32 ) {
RDebugUtils.currentLine=61866046;
 //BA.debugLineNum = 61866046;BA.debugLine="Dim  ItemBargasht = ListFaktor2.Get(j) As Adap";
_itembargasht = (ir.parsikhesab.pakhsh.mcode._adapterlistrizefaktor)(mostCurrent._listfaktor2.Get(_j));
RDebugUtils.currentLine=61866047;
 //BA.debugLineNum = 61866047;BA.debugLine="If ItemForoosh.fldCodeKala=ItemBargasht.fldCo";
if ((_itemforoosh.fldCodeKala /*String*/ ).equals(_itembargasht.fldCodeKala /*String*/ )) { 
RDebugUtils.currentLine=61866048;
 //BA.debugLineNum = 61866048;BA.debugLine="TedadJoz=TedadJoz+ItemBargasht.fldTedadJoz";
_tedadjoz = BA.NumberToString((double)(Double.parseDouble(_tedadjoz))+(double)(Double.parseDouble(_itembargasht.fldTedadJoz /*String*/ )));
RDebugUtils.currentLine=61866049;
 //BA.debugLineNum = 61866049;BA.debugLine="TedadCarton=TedadCarton+ItemBargasht.fldTedad";
_tedadcarton = BA.NumberToString((double)(Double.parseDouble(_tedadcarton))+(double)(Double.parseDouble(_itembargasht.fldTedadCarton /*String*/ )));
RDebugUtils.currentLine=61866050;
 //BA.debugLineNum = 61866050;BA.debugLine="TotalFaktor=TotalFaktor+ItemBargasht.fldTotal";
_totalfaktor = BA.NumberToString((double)(Double.parseDouble(_totalfaktor))+(double)(Double.parseDouble(_itembargasht.fldTotalFaktor /*String*/ )));
 };
 }
};
RDebugUtils.currentLine=61866053;
 //BA.debugLineNum = 61866053;BA.debugLine="c=c+1";
_c = (int) (_c+1);
RDebugUtils.currentLine=61866054;
 //BA.debugLineNum = 61866054;BA.debugLine="Item2.FldRadif=c";
_item2.FldRadif /*String*/  = BA.NumberToString(_c);
RDebugUtils.currentLine=61866055;
 //BA.debugLineNum = 61866055;BA.debugLine="Item2.fldCodeKala=ItemForoosh.fldCodeKala";
_item2.fldCodeKala /*String*/  = _itemforoosh.fldCodeKala /*String*/ ;
RDebugUtils.currentLine=61866056;
 //BA.debugLineNum = 61866056;BA.debugLine="Item2.fldSharhKala=ItemForoosh.fldSharhKala";
_item2.fldSharhKala /*String*/  = _itemforoosh.fldSharhKala /*String*/ ;
RDebugUtils.currentLine=61866057;
 //BA.debugLineNum = 61866057;BA.debugLine="Item2.fldTedadJoz=ItemForoosh.fldTedadJoz-Tedad";
_item2.fldTedadJoz /*String*/  = BA.NumberToString((double)(Double.parseDouble(_itemforoosh.fldTedadJoz /*String*/ ))-(double)(Double.parseDouble(_tedadjoz)));
RDebugUtils.currentLine=61866058;
 //BA.debugLineNum = 61866058;BA.debugLine="Item2.fldTedadCarton=ItemForoosh.fldTedadCarton";
_item2.fldTedadCarton /*String*/  = BA.NumberToString((double)(Double.parseDouble(_itemforoosh.fldTedadCarton /*String*/ ))-(double)(Double.parseDouble(_tedadcarton)));
RDebugUtils.currentLine=61866059;
 //BA.debugLineNum = 61866059;BA.debugLine="Item2.fldTotalFaktor=ItemForoosh.fldTotalFaktor";
_item2.fldTotalFaktor /*String*/  = BA.NumberToString((double)(Double.parseDouble(_itemforoosh.fldTotalFaktor /*String*/ ))-(double)(Double.parseDouble(_totalfaktor)));
RDebugUtils.currentLine=61866060;
 //BA.debugLineNum = 61866060;BA.debugLine="ListFaktor3.Add(Item2)";
mostCurrent._listfaktor3.Add((Object)(_item2));
 }
};
RDebugUtils.currentLine=61866064;
 //BA.debugLineNum = 61866064;BA.debugLine="ListFaktor1.Clear";
mostCurrent._listfaktor1.Clear();
RDebugUtils.currentLine=61866065;
 //BA.debugLineNum = 61866065;BA.debugLine="ListFaktor2.Clear";
mostCurrent._listfaktor2.Clear();
RDebugUtils.currentLine=61866066;
 //BA.debugLineNum = 61866066;BA.debugLine="Dim cu2 As Cursor = MCode.Result(\"select * from";
_cu2 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu2 = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"select * from  TblFaktor where  fldShomareForoosh="+_shomareforoosh+" and FldDate between "+_dateaz+" and "+_dateta);
RDebugUtils.currentLine=61866067;
 //BA.debugLineNum = 61866067;BA.debugLine="For j=0 To cu2.RowCount-1";
{
final int step52 = 1;
final int limit52 = (int) (_cu2.getRowCount()-1);
_j = (int) (0) ;
for (;_j <= limit52 ;_j = _j + step52 ) {
RDebugUtils.currentLine=61866068;
 //BA.debugLineNum = 61866068;BA.debugLine="cu2.Position=j";
_cu2.setPosition(_j);
RDebugUtils.currentLine=61866069;
 //BA.debugLineNum = 61866069;BA.debugLine="Dim Item As AdapterListRizeFaktor";
_item = new ir.parsikhesab.pakhsh.mcode._adapterlistrizefaktor();
RDebugUtils.currentLine=61866070;
 //BA.debugLineNum = 61866070;BA.debugLine="Item.FldRadif=j+1";
_item.FldRadif /*String*/  = BA.NumberToString(_j+1);
RDebugUtils.currentLine=61866071;
 //BA.debugLineNum = 61866071;BA.debugLine="Item.fldShomareFaktor=cu2.GetString(\"FldShomar";
_item.fldShomareFaktor /*String*/  = _cu2.GetString("FldShomareFaktor");
RDebugUtils.currentLine=61866072;
 //BA.debugLineNum = 61866072;BA.debugLine="Item.fldCodeKala=cu2.GetString(\"FldCodeKala\")";
_item.fldCodeKala /*String*/  = _cu2.GetString("FldCodeKala");
RDebugUtils.currentLine=61866073;
 //BA.debugLineNum = 61866073;BA.debugLine="Item.fldSharhKala=cu2.GetString(\"FldNamekala\")";
_item.fldSharhKala /*String*/  = _cu2.GetString("FldNamekala");
RDebugUtils.currentLine=61866074;
 //BA.debugLineNum = 61866074;BA.debugLine="Item.fldTotalFaktor=cu2.GetString(\"FldTotalFak";
_item.fldTotalFaktor /*String*/  = _cu2.GetString("FldTotalFaktor");
RDebugUtils.currentLine=61866075;
 //BA.debugLineNum = 61866075;BA.debugLine="Item.fldTedadJoz=cu2.GetString(\"FldTedadDarSab";
_item.fldTedadJoz /*String*/  = _cu2.GetString("FldTedadDarSabadJoz");
RDebugUtils.currentLine=61866076;
 //BA.debugLineNum = 61866076;BA.debugLine="Item.fldTedadCarton=cu2.GetString(\"FldTedadDar";
_item.fldTedadCarton /*String*/  = _cu2.GetString("FldTedadDarSabadKol");
RDebugUtils.currentLine=61866077;
 //BA.debugLineNum = 61866077;BA.debugLine="Select cu2.GetString(\"FldType\")";
switch (BA.switchObjectToInt(_cu2.GetString("FldType"),"Foroosh","Marjoee")) {
case 0: {
RDebugUtils.currentLine=61866079;
 //BA.debugLineNum = 61866079;BA.debugLine="Item.FldType=\"فروش\"";
_item.FldType /*String*/  = "فروش";
 break; }
case 1: {
RDebugUtils.currentLine=61866082;
 //BA.debugLineNum = 61866082;BA.debugLine="Item.FldType=\"مرجوعی\"";
_item.FldType /*String*/  = "مرجوعی";
 break; }
}
;
RDebugUtils.currentLine=61866085;
 //BA.debugLineNum = 61866085;BA.debugLine="ListFaktor1.Add(Item)";
mostCurrent._listfaktor1.Add((Object)(_item));
 }
};
RDebugUtils.currentLine=61866088;
 //BA.debugLineNum = 61866088;BA.debugLine="Grid1";
_grid1();
RDebugUtils.currentLine=61866089;
 //BA.debugLineNum = 61866089;BA.debugLine="Grid2";
_grid2();
 } 
       catch (Exception e73) {
			processBA.setLastException(e73);RDebugUtils.currentLine=61866092;
 //BA.debugLineNum = 61866092;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("561866092",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 };
RDebugUtils.currentLine=61866094;
 //BA.debugLineNum = 61866094;BA.debugLine="End Sub";
return "";
}
public static String  _grid1() throws Exception{
RDebugUtils.currentModule="act_reportrizebargasht";
if (Debug.shouldDelegate(mostCurrent.activityBA, "grid1", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "grid1", null));}
anywheresoftware.b4a.objects.collections.List _lst_colnametitle = null;
RDebugUtils.currentLine=61669376;
 //BA.debugLineNum = 61669376;BA.debugLine="Sub Grid1";
RDebugUtils.currentLine=61669377;
 //BA.debugLineNum = 61669377;BA.debugLine="Dim Lst_ColNameTitle As List";
_lst_colnametitle = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=61669378;
 //BA.debugLineNum = 61669378;BA.debugLine="Lst_ColNameTitle.Initialize";
_lst_colnametitle.Initialize();
RDebugUtils.currentLine=61669379;
 //BA.debugLineNum = 61669379;BA.debugLine="Lst_ColNameTitle.AddAll(Array As String(\"ردیف\",\"ک";
_lst_colnametitle.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"ردیف","کد کالا","نام کالا","تعداد جزء","تعداد کل","نوع فاکتور"}));
RDebugUtils.currentLine=61669380;
 //BA.debugLineNum = 61669380;BA.debugLine="Table1.LoadSListReportRizeBargasht(ListFaktor1,Ls";
mostCurrent._table1._loadslistreportrizebargasht /*String*/ (null,mostCurrent._listfaktor1,_lst_colnametitle,(int) (6));
RDebugUtils.currentLine=61669381;
 //BA.debugLineNum = 61669381;BA.debugLine="Table1.SetColumnsWidths(Array As Int(70dip,70dip,";
mostCurrent._table1._setcolumnswidths /*String*/ (null,new int[]{anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (70)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (70)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (70)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (70)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (70)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (70))});
RDebugUtils.currentLine=61669382;
 //BA.debugLineNum = 61669382;BA.debugLine="End Sub";
return "";
}
public static String  _grid2() throws Exception{
RDebugUtils.currentModule="act_reportrizebargasht";
if (Debug.shouldDelegate(mostCurrent.activityBA, "grid2", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "grid2", null));}
anywheresoftware.b4a.objects.collections.List _lst_colnametitle = null;
RDebugUtils.currentLine=61734912;
 //BA.debugLineNum = 61734912;BA.debugLine="Sub Grid2";
RDebugUtils.currentLine=61734913;
 //BA.debugLineNum = 61734913;BA.debugLine="Dim Lst_ColNameTitle As List";
_lst_colnametitle = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=61734914;
 //BA.debugLineNum = 61734914;BA.debugLine="Lst_ColNameTitle.Initialize";
_lst_colnametitle.Initialize();
RDebugUtils.currentLine=61734915;
 //BA.debugLineNum = 61734915;BA.debugLine="Lst_ColNameTitle.AddAll(Array As String(\"ردیف\",\"ک";
_lst_colnametitle.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"ردیف","کد کالا","نام کالا","تعداد جزء","تعداد کل","نوع"}));
RDebugUtils.currentLine=61734916;
 //BA.debugLineNum = 61734916;BA.debugLine="Table2.LoadSListReportRizeBargashtResult(ListFakt";
mostCurrent._table2._loadslistreportrizebargashtresult /*String*/ (null,mostCurrent._listfaktor3,_lst_colnametitle,(int) (6));
RDebugUtils.currentLine=61734917;
 //BA.debugLineNum = 61734917;BA.debugLine="Table2.SetColumnsWidths(Array As Int(70dip,70dip,";
mostCurrent._table2._setcolumnswidths /*String*/ (null,new int[]{anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (70)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (70)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (140)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (70)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (70)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (70))});
RDebugUtils.currentLine=61734918;
 //BA.debugLineNum = 61734918;BA.debugLine="End Sub";
return "";
}
public static String  _lblback_click() throws Exception{
RDebugUtils.currentModule="act_reportrizebargasht";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lblback_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lblback_click", null));}
RDebugUtils.currentLine=61997056;
 //BA.debugLineNum = 61997056;BA.debugLine="Sub LblBack_Click";
RDebugUtils.currentLine=61997057;
 //BA.debugLineNum = 61997057;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=61997058;
 //BA.debugLineNum = 61997058;BA.debugLine="End Sub";
return "";
}
}