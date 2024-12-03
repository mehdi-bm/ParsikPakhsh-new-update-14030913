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

public class act_sabtrizcheck extends Activity implements B4AActivity{
	public static act_sabtrizcheck mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.act_sabtrizcheck");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (act_sabtrizcheck).");
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
		activityBA = new BA(this, layout, processBA, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.act_sabtrizcheck");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "ir.parsikhesab.pakhsh.act_sabtrizcheck", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (act_sabtrizcheck) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (act_sabtrizcheck) Resume **");
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
		return act_sabtrizcheck.class;
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
            BA.LogInfo("** Activity (act_sabtrizcheck) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (act_sabtrizcheck) Pause event (activity is not paused). **");
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
            act_sabtrizcheck mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (act_sabtrizcheck) Resume **");
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
public static String _shomaredaryafti = "";
public static String _shomarefactor = "";
public static String _codemoshtari = "";
public static String _namemoshtari = "";
public static String _summablaghcheck = "";
public static boolean _issend = false;
public static anywheresoftware.b4a.objects.collections.List _lstcheck = null;
public hitex.nice.spinner.Hitex_NiceSpinner _nsn_bankd = null;
public wir.hitex.recycler.Hitex_LayoutView _hlv = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblshomaredaryaft = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnl_hlv = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtshomarecheck = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtshomarehesab = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtmablagh = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlnbank = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btndatesarresid = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtshobe = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtsharh = null;
public static String _datecheck = "";
public anywheresoftware.b4a.objects.ButtonWrapper _btnsave = null;
public anywheresoftware.b4a.objects.collections.List _lstcodebank1 = null;
public static String _codebank1 = "";
public static String _namebank1 = "";
public anywheresoftware.b4a.objects.IME _key = null;
public anywheresoftware.b4a.objects.collections.List _originallstcheck = null;
public static boolean _txtchanged = false;
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
RDebugUtils.currentModule="act_sabtrizcheck";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
anywheresoftware.b4a.objects.drawable.ColorDrawable _op = null;
RDebugUtils.currentLine=76087296;
 //BA.debugLineNum = 76087296;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=76087298;
 //BA.debugLineNum = 76087298;BA.debugLine="Try";
try {RDebugUtils.currentLine=76087299;
 //BA.debugLineNum = 76087299;BA.debugLine="Activity.LoadLayout(\"l_SabtRizCheck\")";
mostCurrent._activity.LoadLayout("l_SabtRizCheck",mostCurrent.activityBA);
RDebugUtils.currentLine=76087300;
 //BA.debugLineNum = 76087300;BA.debugLine="lblShomareDaryaft.Text=ShomareDaryafti";
mostCurrent._lblshomaredaryaft.setText(BA.ObjectToCharSequence(_shomaredaryafti));
RDebugUtils.currentLine=76087301;
 //BA.debugLineNum = 76087301;BA.debugLine="Key.Initialize(\"Key\")";
mostCurrent._key.Initialize("Key");
RDebugUtils.currentLine=76087302;
 //BA.debugLineNum = 76087302;BA.debugLine="Key.SetCustomFilter(txtShomareCheck,txtShomareChe";
mostCurrent._key.SetCustomFilter((android.widget.EditText)(mostCurrent._txtshomarecheck.getObject()),mostCurrent._txtshomarecheck.INPUT_TYPE_NUMBERS,"0123456789");
RDebugUtils.currentLine=76087303;
 //BA.debugLineNum = 76087303;BA.debugLine="Key.SetCustomFilter(txtShomareHesab,txtShomareHes";
mostCurrent._key.SetCustomFilter((android.widget.EditText)(mostCurrent._txtshomarehesab.getObject()),mostCurrent._txtshomarehesab.INPUT_TYPE_NUMBERS,"0123456789");
RDebugUtils.currentLine=76087304;
 //BA.debugLineNum = 76087304;BA.debugLine="Key.SetCustomFilter(txtMablagh,txtMablagh.INPUT_T";
mostCurrent._key.SetCustomFilter((android.widget.EditText)(mostCurrent._txtmablagh.getObject()),mostCurrent._txtmablagh.INPUT_TYPE_NUMBERS,"0123456789");
RDebugUtils.currentLine=76087305;
 //BA.debugLineNum = 76087305;BA.debugLine="NSN_BankD.Initialize(\"NSN_BankD\",True,False)";
mostCurrent._nsn_bankd.Initialize(mostCurrent.activityBA,"NSN_BankD",anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=76087306;
 //BA.debugLineNum = 76087306;BA.debugLine="PnlNBank.AddView(NSN_BankD,0,0,PnlNBank.Width,Pnl";
mostCurrent._pnlnbank.AddView((android.view.View)(mostCurrent._nsn_bankd.getObject()),(int) (0),(int) (0),mostCurrent._pnlnbank.getWidth(),mostCurrent._pnlnbank.getHeight());
RDebugUtils.currentLine=76087307;
 //BA.debugLineNum = 76087307;BA.debugLine="NSN_BankD.TextColor = Colors.RGB(192,53,38)";
mostCurrent._nsn_bankd.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (192),(int) (53),(int) (38)));
RDebugUtils.currentLine=76087308;
 //BA.debugLineNum = 76087308;BA.debugLine="NSN_BankD.Gravity = Gravity.CENTER";
mostCurrent._nsn_bankd.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER);
RDebugUtils.currentLine=76087309;
 //BA.debugLineNum = 76087309;BA.debugLine="NSN_BankD.Typeface = Typeface.LoadFromAssets(\"p_f";
mostCurrent._nsn_bankd.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("p_font.ttf"));
RDebugUtils.currentLine=76087310;
 //BA.debugLineNum = 76087310;BA.debugLine="Dim op As ColorDrawable";
_op = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=76087311;
 //BA.debugLineNum = 76087311;BA.debugLine="op.Initialize2(Colors.White,5dip,0dip,Colors.Blac";
_op.Initialize2(anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=76087312;
 //BA.debugLineNum = 76087312;BA.debugLine="NSN_BankD.Background=op";
mostCurrent._nsn_bankd.setBackground((android.graphics.drawable.Drawable)(_op.getObject()));
RDebugUtils.currentLine=76087313;
 //BA.debugLineNum = 76087313;BA.debugLine="lstCodeBank1.Initialize";
mostCurrent._lstcodebank1.Initialize();
RDebugUtils.currentLine=76087314;
 //BA.debugLineNum = 76087314;BA.debugLine="lstCheck.Initialize";
_lstcheck.Initialize();
RDebugUtils.currentLine=76087315;
 //BA.debugLineNum = 76087315;BA.debugLine="OriginallstCheck.Initialize";
mostCurrent._originallstcheck.Initialize();
RDebugUtils.currentLine=76087316;
 //BA.debugLineNum = 76087316;BA.debugLine="LoadBank";
_loadbank();
RDebugUtils.currentLine=76087318;
 //BA.debugLineNum = 76087318;BA.debugLine="NSN_BankD.Show(Colors.Black, 16)";
mostCurrent._nsn_bankd.Show(anywheresoftware.b4a.keywords.Common.Colors.Black,(float) (16));
RDebugUtils.currentLine=76087320;
 //BA.debugLineNum = 76087320;BA.debugLine="HLV.Initializer(\"HLV\").ListView.Build";
mostCurrent._hlv.Initializer(mostCurrent.activityBA,"HLV").ListView().Build();
RDebugUtils.currentLine=76087321;
 //BA.debugLineNum = 76087321;BA.debugLine="pnl_Hlv.AddView(HLV,0,0,pnl_Hlv.Width,pnl_Hlv.Hei";
mostCurrent._pnl_hlv.AddView((android.view.View)(mostCurrent._hlv.getObject()),(int) (0),(int) (0),mostCurrent._pnl_hlv.getWidth(),mostCurrent._pnl_hlv.getHeight());
RDebugUtils.currentLine=76087322;
 //BA.debugLineNum = 76087322;BA.debugLine="HLV.Show";
mostCurrent._hlv.Show();
RDebugUtils.currentLine=76087324;
 //BA.debugLineNum = 76087324;BA.debugLine="If issend Then";
if (_issend) { 
RDebugUtils.currentLine=76087325;
 //BA.debugLineNum = 76087325;BA.debugLine="BtnSave.Enabled=False";
mostCurrent._btnsave.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 }else {
RDebugUtils.currentLine=76087327;
 //BA.debugLineNum = 76087327;BA.debugLine="BtnSave.Enabled=True";
mostCurrent._btnsave.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 };
 } 
       catch (Exception e30) {
			processBA.setLastException(e30);RDebugUtils.currentLine=76087330;
 //BA.debugLineNum = 76087330;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("576087330",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=76087331;
 //BA.debugLineNum = 76087331;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-Activity_Create");
 };
RDebugUtils.currentLine=76087333;
 //BA.debugLineNum = 76087333;BA.debugLine="End Sub";
return "";
}
public static String  _loadbank() throws Exception{
RDebugUtils.currentModule="act_sabtrizcheck";
if (Debug.shouldDelegate(mostCurrent.activityBA, "loadbank", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "loadbank", null));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cr1 = null;
int _i = 0;
RDebugUtils.currentLine=76414976;
 //BA.debugLineNum = 76414976;BA.debugLine="Sub LoadBank";
RDebugUtils.currentLine=76414977;
 //BA.debugLineNum = 76414977;BA.debugLine="Try";
try {RDebugUtils.currentLine=76414978;
 //BA.debugLineNum = 76414978;BA.debugLine="Dim cr1 As Cursor=MCode.Result(\"Select * from Tbl";
_cr1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cr1 = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * from TblBankMoshtari");
RDebugUtils.currentLine=76414979;
 //BA.debugLineNum = 76414979;BA.debugLine="lstCodeBank1.Clear";
mostCurrent._lstcodebank1.Clear();
RDebugUtils.currentLine=76414980;
 //BA.debugLineNum = 76414980;BA.debugLine="For i=0 To cr1.RowCount-1";
{
final int step4 = 1;
final int limit4 = (int) (_cr1.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=76414981;
 //BA.debugLineNum = 76414981;BA.debugLine="cr1.Position=i";
_cr1.setPosition(_i);
RDebugUtils.currentLine=76414982;
 //BA.debugLineNum = 76414982;BA.debugLine="NSN_BankD.Add(cr1.GetString(\"fldNameBank\"))";
mostCurrent._nsn_bankd.Add(_cr1.GetString("fldNameBank"));
RDebugUtils.currentLine=76414983;
 //BA.debugLineNum = 76414983;BA.debugLine="lstCodeBank1.Add(cr1.GetString(\"fldCodeBank\"))";
mostCurrent._lstcodebank1.Add((Object)(_cr1.GetString("fldCodeBank")));
 }
};
RDebugUtils.currentLine=76414985;
 //BA.debugLineNum = 76414985;BA.debugLine="CodeBank1=lstCodeBank1.Get(0)";
mostCurrent._codebank1 = BA.ObjectToString(mostCurrent._lstcodebank1.Get((int) (0)));
RDebugUtils.currentLine=76414986;
 //BA.debugLineNum = 76414986;BA.debugLine="NameBank1=NSN_BankD.Text";
mostCurrent._namebank1 = mostCurrent._nsn_bankd.getText();
RDebugUtils.currentLine=76414987;
 //BA.debugLineNum = 76414987;BA.debugLine="Log(CodeBank1)";
anywheresoftware.b4a.keywords.Common.LogImpl("576414987",mostCurrent._codebank1,0);
RDebugUtils.currentLine=76414988;
 //BA.debugLineNum = 76414988;BA.debugLine="Log(NameBank1)";
anywheresoftware.b4a.keywords.Common.LogImpl("576414988",mostCurrent._namebank1,0);
 } 
       catch (Exception e14) {
			processBA.setLastException(e14);RDebugUtils.currentLine=76414990;
 //BA.debugLineNum = 76414990;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("576414990",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=76414991;
 //BA.debugLineNum = 76414991;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-LoadBank");
 };
RDebugUtils.currentLine=76414993;
 //BA.debugLineNum = 76414993;BA.debugLine="End Sub";
return "";
}
public static boolean  _activity_keypress(int _keycode) throws Exception{
RDebugUtils.currentModule="act_sabtrizcheck";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_keypress", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "activity_keypress", new Object[] {_keycode}));}
RDebugUtils.currentLine=77266944;
 //BA.debugLineNum = 77266944;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
RDebugUtils.currentLine=77266945;
 //BA.debugLineNum = 77266945;BA.debugLine="If KeyCode=KeyCodes.KEYCODE_BACK Then";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK) { 
RDebugUtils.currentLine=77266946;
 //BA.debugLineNum = 77266946;BA.debugLine="Key.HideKeyboard";
mostCurrent._key.HideKeyboard(mostCurrent.activityBA);
RDebugUtils.currentLine=77266947;
 //BA.debugLineNum = 77266947;BA.debugLine="btn_Back_Click";
_btn_back_click();
 };
RDebugUtils.currentLine=77266949;
 //BA.debugLineNum = 77266949;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=77266950;
 //BA.debugLineNum = 77266950;BA.debugLine="End Sub";
return false;
}
public static String  _btn_back_click() throws Exception{
RDebugUtils.currentModule="act_sabtrizcheck";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_back_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_back_click", null));}
RDebugUtils.currentLine=76546048;
 //BA.debugLineNum = 76546048;BA.debugLine="Sub btn_Back_Click";
RDebugUtils.currentLine=76546049;
 //BA.debugLineNum = 76546049;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=76546050;
 //BA.debugLineNum = 76546050;BA.debugLine="CallSubDelayed(Act_Mali,\"SaveCheck\")";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,(Object)(mostCurrent._act_mali.getObject()),"SaveCheck");
RDebugUtils.currentLine=76546051;
 //BA.debugLineNum = 76546051;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="act_sabtrizcheck";
RDebugUtils.currentLine=77004800;
 //BA.debugLineNum = 77004800;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=77004802;
 //BA.debugLineNum = 77004802;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="act_sabtrizcheck";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=76939264;
 //BA.debugLineNum = 76939264;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=76939265;
 //BA.debugLineNum = 76939265;BA.debugLine="LoadCheck";
_loadcheck();
RDebugUtils.currentLine=76939271;
 //BA.debugLineNum = 76939271;BA.debugLine="End Sub";
return "";
}
public static String  _loadcheck() throws Exception{
RDebugUtils.currentModule="act_sabtrizcheck";
if (Debug.shouldDelegate(mostCurrent.activityBA, "loadcheck", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "loadcheck", null));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
int _i = 0;
ir.parsikhesab.pakhsh.mcode._adapterlistcheckdaryafti _item = null;
RDebugUtils.currentLine=76152832;
 //BA.debugLineNum = 76152832;BA.debugLine="Private Sub LoadCheck";
RDebugUtils.currentLine=76152833;
 //BA.debugLineNum = 76152833;BA.debugLine="Try";
try {RDebugUtils.currentLine=76152834;
 //BA.debugLineNum = 76152834;BA.debugLine="OriginallstCheck.Clear";
mostCurrent._originallstcheck.Clear();
RDebugUtils.currentLine=76152835;
 //BA.debugLineNum = 76152835;BA.debugLine="SumMablaghCheck=0";
_summablaghcheck = BA.NumberToString(0);
RDebugUtils.currentLine=76152837;
 //BA.debugLineNum = 76152837;BA.debugLine="Dim cu As Cursor=MCode.Result(\"select * from TblC";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"select * from TblCheckDaryafti where fldShomareDaryaft="+_shomaredaryafti+" and fldShomareFactor="+_shomarefactor);
RDebugUtils.currentLine=76152838;
 //BA.debugLineNum = 76152838;BA.debugLine="Log(cu.RowCount)";
anywheresoftware.b4a.keywords.Common.LogImpl("576152838",BA.NumberToString(_cu.getRowCount()),0);
RDebugUtils.currentLine=76152839;
 //BA.debugLineNum = 76152839;BA.debugLine="If cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=76152841;
 //BA.debugLineNum = 76152841;BA.debugLine="For i=0 To cu.RowCount-1";
{
final int step7 = 1;
final int limit7 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
RDebugUtils.currentLine=76152842;
 //BA.debugLineNum = 76152842;BA.debugLine="cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=76152843;
 //BA.debugLineNum = 76152843;BA.debugLine="Dim item As AdapterListCheckDaryafti";
_item = new ir.parsikhesab.pakhsh.mcode._adapterlistcheckdaryafti();
RDebugUtils.currentLine=76152844;
 //BA.debugLineNum = 76152844;BA.debugLine="item.Initialize";
_item.Initialize();
RDebugUtils.currentLine=76152845;
 //BA.debugLineNum = 76152845;BA.debugLine="item.ID=cu.GetInt(\"ID\")";
_item.ID /*String*/  = BA.NumberToString(_cu.GetInt("ID"));
RDebugUtils.currentLine=76152846;
 //BA.debugLineNum = 76152846;BA.debugLine="item.fldShomareCheck=cu.GetString(\"fldShomareC";
_item.fldShomareCheck /*String*/  = _cu.GetString("fldShomareCheck");
RDebugUtils.currentLine=76152847;
 //BA.debugLineNum = 76152847;BA.debugLine="item.fldShomareHesab=cu.GetString(\"fldShomareH";
_item.fldShomareHesab /*String*/  = _cu.GetString("fldShomareHesab");
RDebugUtils.currentLine=76152848;
 //BA.debugLineNum = 76152848;BA.debugLine="item.fldShomareDaryaft=cu.GetString(\"fldShomar";
_item.fldShomareDaryaft /*String*/  = _cu.GetString("fldShomareDaryaft");
RDebugUtils.currentLine=76152849;
 //BA.debugLineNum = 76152849;BA.debugLine="item.fldMablagh=cu.GetString(\"fldMablagh\")";
_item.fldMablagh /*int*/  = (int)(Double.parseDouble(_cu.GetString("fldMablagh")));
RDebugUtils.currentLine=76152850;
 //BA.debugLineNum = 76152850;BA.debugLine="item.fldShobe=cu.GetString(\"fldShobe\")";
_item.fldShobe /*String*/  = _cu.GetString("fldShobe");
RDebugUtils.currentLine=76152851;
 //BA.debugLineNum = 76152851;BA.debugLine="item.fldSharh=cu.GetString(\"fldSharh\")";
_item.fldSharh /*String*/  = _cu.GetString("fldSharh");
RDebugUtils.currentLine=76152852;
 //BA.debugLineNum = 76152852;BA.debugLine="item.fldDate=cu.GetString(\"fldDate\")";
_item.fldDate /*String*/  = _cu.GetString("fldDate");
RDebugUtils.currentLine=76152853;
 //BA.debugLineNum = 76152853;BA.debugLine="item.fldDateSarResid=cu.GetString(\"fldDateSarR";
_item.fldDateSarResid /*String*/  = _cu.GetString("fldDateSarResid");
RDebugUtils.currentLine=76152854;
 //BA.debugLineNum = 76152854;BA.debugLine="item.fldCodeBank=cu.GetString(\"fldCodeBank\")";
_item.fldCodeBank /*String*/  = _cu.GetString("fldCodeBank");
RDebugUtils.currentLine=76152855;
 //BA.debugLineNum = 76152855;BA.debugLine="item.fldNameBank=cu.GetString(\"fldNameBank\")";
_item.fldNameBank /*String*/  = _cu.GetString("fldNameBank");
RDebugUtils.currentLine=76152856;
 //BA.debugLineNum = 76152856;BA.debugLine="item.fldCodeSahebeCheck=cu.GetString(\"fldCodeS";
_item.fldCodeSahebeCheck /*String*/  = _cu.GetString("fldCodeSahebeCheck");
RDebugUtils.currentLine=76152857;
 //BA.debugLineNum = 76152857;BA.debugLine="item.fldNameSahebeCheck=cu.GetString(\"fldNameS";
_item.fldNameSahebeCheck /*String*/  = _cu.GetString("fldNameSahebeCheck");
RDebugUtils.currentLine=76152858;
 //BA.debugLineNum = 76152858;BA.debugLine="item.count=cu.RowCount";
_item.count /*String*/  = BA.NumberToString(_cu.getRowCount());
RDebugUtils.currentLine=76152859;
 //BA.debugLineNum = 76152859;BA.debugLine="SumMablaghCheck=SumMablaghCheck+item.fldMablag";
_summablaghcheck = BA.NumberToString((double)(Double.parseDouble(_summablaghcheck))+_item.fldMablagh /*int*/ );
RDebugUtils.currentLine=76152860;
 //BA.debugLineNum = 76152860;BA.debugLine="OriginallstCheck.Add(item)";
mostCurrent._originallstcheck.Add((Object)(_item));
 }
};
RDebugUtils.currentLine=76152862;
 //BA.debugLineNum = 76152862;BA.debugLine="lstCheck=OriginallstCheck";
_lstcheck = mostCurrent._originallstcheck;
RDebugUtils.currentLine=76152863;
 //BA.debugLineNum = 76152863;BA.debugLine="HLV.notifyDataSetChanged";
mostCurrent._hlv.notifyDataSetChanged();
 };
 } 
       catch (Exception e32) {
			processBA.setLastException(e32);RDebugUtils.currentLine=76152866;
 //BA.debugLineNum = 76152866;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("576152866",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=76152867;
 //BA.debugLineNum = 76152867;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-LoadCheck");
 };
RDebugUtils.currentLine=76152870;
 //BA.debugLineNum = 76152870;BA.debugLine="End Sub";
return "";
}
public static boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
RDebugUtils.currentModule="act_sabtrizcheck";
if (Debug.shouldDelegate(mostCurrent.activityBA, "application_error", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "application_error", new Object[] {_error,_stacktrace}));}
RDebugUtils.currentLine=77332480;
 //BA.debugLineNum = 77332480;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
RDebugUtils.currentLine=77332482;
 //BA.debugLineNum = 77332482;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=77332483;
 //BA.debugLineNum = 77332483;BA.debugLine="End Sub";
return false;
}
public static String  _btndatesarresid_click() throws Exception{
RDebugUtils.currentModule="act_sabtrizcheck";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btndatesarresid_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btndatesarresid_click", null));}
com.porya.datetimepicker.PersianMaterialDatePickerWrapper _p = null;
RDebugUtils.currentLine=76611584;
 //BA.debugLineNum = 76611584;BA.debugLine="Private Sub BtnDateSarResid_Click";
RDebugUtils.currentLine=76611585;
 //BA.debugLineNum = 76611585;BA.debugLine="Dim p As PersianMaterialDatePicker";
_p = new com.porya.datetimepicker.PersianMaterialDatePickerWrapper();
RDebugUtils.currentLine=76611586;
 //BA.debugLineNum = 76611586;BA.debugLine="p.Initialize(\"p\",p.PersianYear,p.PersianMonth,p.P";
_p.Initialize(mostCurrent.activityBA,"p",_p.getPersianYear(),_p.getPersianMonth(),_p.getPersianDay());
RDebugUtils.currentLine=76611587;
 //BA.debugLineNum = 76611587;BA.debugLine="p.AccentColor = Colors.RGB(83,99,255)";
_p.setAccentColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (83),(int) (99),(int) (255)));
RDebugUtils.currentLine=76611588;
 //BA.debugLineNum = 76611588;BA.debugLine="p.OkText = \"تایید\"";
_p.setOkText("تایید");
RDebugUtils.currentLine=76611589;
 //BA.debugLineNum = 76611589;BA.debugLine="p.CancelText = \"لغو\"";
_p.setCancelText("لغو");
RDebugUtils.currentLine=76611590;
 //BA.debugLineNum = 76611590;BA.debugLine="p.Title = \"از تاریخ\"";
_p.setTitle("از تاریخ");
RDebugUtils.currentLine=76611591;
 //BA.debugLineNum = 76611591;BA.debugLine="p.Typeface = \"iransansmonospacednum.ttf\"";
_p.setTypeface("iransansmonospacednum.ttf");
RDebugUtils.currentLine=76611592;
 //BA.debugLineNum = 76611592;BA.debugLine="p.Show(\"p\")";
_p.Show("p");
RDebugUtils.currentLine=76611593;
 //BA.debugLineNum = 76611593;BA.debugLine="End Sub";
return "";
}
public static String  _btnsave_click() throws Exception{
RDebugUtils.currentModule="act_sabtrizcheck";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnsave_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnsave_click", null));}
String _date = "";
ir.parsikhesab.pakhsh.mcode._adapterlistcheckdaryafti _item = null;
RDebugUtils.currentLine=76480512;
 //BA.debugLineNum = 76480512;BA.debugLine="Private Sub BtnSave_Click";
RDebugUtils.currentLine=76480513;
 //BA.debugLineNum = 76480513;BA.debugLine="Try";
try {RDebugUtils.currentLine=76480514;
 //BA.debugLineNum = 76480514;BA.debugLine="If txtShomareCheck.Text=\"0\" Or txtShomareCheck.Te";
if ((mostCurrent._txtshomarecheck.getText()).equals("0") || (mostCurrent._txtshomarecheck.getText()).equals("")) { 
RDebugUtils.currentLine=76480515;
 //BA.debugLineNum = 76480515;BA.debugLine="ToastMessageShow(\"لطفا شماره چک را وارد نمایید\",";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("لطفا شماره چک را وارد نمایید"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=76480516;
 //BA.debugLineNum = 76480516;BA.debugLine="txtShomareCheck.SelectionStart=0";
mostCurrent._txtshomarecheck.setSelectionStart((int) (0));
RDebugUtils.currentLine=76480517;
 //BA.debugLineNum = 76480517;BA.debugLine="Return";
if (true) return "";
 }else {
RDebugUtils.currentLine=76480519;
 //BA.debugLineNum = 76480519;BA.debugLine="If txtShomareCheck.Text.Length<5 Or txtShomareC";
if (mostCurrent._txtshomarecheck.getText().length()<5 || mostCurrent._txtshomarecheck.getText().length()>20) { 
RDebugUtils.currentLine=76480520;
 //BA.debugLineNum = 76480520;BA.debugLine="ToastMessageShow(\"تعداد کاراکتر شماره چک نا مع";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("تعداد کاراکتر شماره چک نا معتبر می باشد"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=76480521;
 //BA.debugLineNum = 76480521;BA.debugLine="Return";
if (true) return "";
 };
 };
RDebugUtils.currentLine=76480525;
 //BA.debugLineNum = 76480525;BA.debugLine="If txtShomareHesab.Text=\"0\" Or txtShomareHesab.Te";
if ((mostCurrent._txtshomarehesab.getText()).equals("0") || (mostCurrent._txtshomarehesab.getText()).equals("")) { 
RDebugUtils.currentLine=76480526;
 //BA.debugLineNum = 76480526;BA.debugLine="ToastMessageShow(\"لطفا شماره حساب را وارد نمایید";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("لطفا شماره حساب را وارد نمایید"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=76480527;
 //BA.debugLineNum = 76480527;BA.debugLine="txtShomareHesab.SelectionStart=0";
mostCurrent._txtshomarehesab.setSelectionStart((int) (0));
RDebugUtils.currentLine=76480528;
 //BA.debugLineNum = 76480528;BA.debugLine="Return";
if (true) return "";
 }else {
RDebugUtils.currentLine=76480530;
 //BA.debugLineNum = 76480530;BA.debugLine="If txtShomareHesab.Text.Length<5 Or txtShomareH";
if (mostCurrent._txtshomarehesab.getText().length()<5 || mostCurrent._txtshomarehesab.getText().length()>20) { 
RDebugUtils.currentLine=76480531;
 //BA.debugLineNum = 76480531;BA.debugLine="ToastMessageShow(\"تعداد کاراکتر شماره حساب نا";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("تعداد کاراکتر شماره حساب نا معتبر می باشد"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=76480532;
 //BA.debugLineNum = 76480532;BA.debugLine="Return";
if (true) return "";
 };
 };
RDebugUtils.currentLine=76480535;
 //BA.debugLineNum = 76480535;BA.debugLine="If txtMablagh.Text=\"0\" Or txtMablagh.Text=\"\" Then";
if ((mostCurrent._txtmablagh.getText()).equals("0") || (mostCurrent._txtmablagh.getText()).equals("")) { 
RDebugUtils.currentLine=76480536;
 //BA.debugLineNum = 76480536;BA.debugLine="ToastMessageShow(\"لطفا مبلغ را وارد نمایید\",Fals";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("لطفا مبلغ را وارد نمایید"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=76480537;
 //BA.debugLineNum = 76480537;BA.debugLine="txtMablagh.SelectionStart=0";
mostCurrent._txtmablagh.setSelectionStart((int) (0));
RDebugUtils.currentLine=76480538;
 //BA.debugLineNum = 76480538;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=76480540;
 //BA.debugLineNum = 76480540;BA.debugLine="If BtnDateSarResid.Text=\"تعیین تاریخ\" Then";
if ((mostCurrent._btndatesarresid.getText()).equals("تعیین تاریخ")) { 
RDebugUtils.currentLine=76480541;
 //BA.debugLineNum = 76480541;BA.debugLine="ToastMessageShow(\"لطفا تاریخ سررسید را وارد نمای";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("لطفا تاریخ سررسید را وارد نمایید"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=76480542;
 //BA.debugLineNum = 76480542;BA.debugLine="BtnDateSarResid.RequestFocus";
mostCurrent._btndatesarresid.RequestFocus();
RDebugUtils.currentLine=76480543;
 //BA.debugLineNum = 76480543;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=76480551;
 //BA.debugLineNum = 76480551;BA.debugLine="NameBank1=NSN_BankD.Text";
mostCurrent._namebank1 = mostCurrent._nsn_bankd.getText();
RDebugUtils.currentLine=76480552;
 //BA.debugLineNum = 76480552;BA.debugLine="Log(CodeBank1)";
anywheresoftware.b4a.keywords.Common.LogImpl("576480552",mostCurrent._codebank1,0);
RDebugUtils.currentLine=76480553;
 //BA.debugLineNum = 76480553;BA.debugLine="Log(NameBank1)";
anywheresoftware.b4a.keywords.Common.LogImpl("576480553",mostCurrent._namebank1,0);
RDebugUtils.currentLine=76480555;
 //BA.debugLineNum = 76480555;BA.debugLine="Dim date As String=MCode.ConvertNumbersPersian2En";
_date = mostCurrent._mcode._convertnumberspersian2english /*String*/ (mostCurrent.activityBA,mostCurrent._mcode._datepersian /*String*/ (mostCurrent.activityBA));
RDebugUtils.currentLine=76480556;
 //BA.debugLineNum = 76480556;BA.debugLine="Dim item As AdapterListCheckDaryafti";
_item = new ir.parsikhesab.pakhsh.mcode._adapterlistcheckdaryafti();
RDebugUtils.currentLine=76480557;
 //BA.debugLineNum = 76480557;BA.debugLine="item.Initialize";
_item.Initialize();
RDebugUtils.currentLine=76480558;
 //BA.debugLineNum = 76480558;BA.debugLine="item.fldShomareCheck=txtShomareCheck.Text";
_item.fldShomareCheck /*String*/  = mostCurrent._txtshomarecheck.getText();
RDebugUtils.currentLine=76480560;
 //BA.debugLineNum = 76480560;BA.debugLine="item.fldShomareHesab=txtShomareHesab.Text";
_item.fldShomareHesab /*String*/  = mostCurrent._txtshomarehesab.getText();
RDebugUtils.currentLine=76480561;
 //BA.debugLineNum = 76480561;BA.debugLine="item.fldShomareDaryaft=ShomareDaryafti";
_item.fldShomareDaryaft /*String*/  = _shomaredaryafti;
RDebugUtils.currentLine=76480562;
 //BA.debugLineNum = 76480562;BA.debugLine="item.fldMablagh=txtMablagh.Text.Replace(\",\",\"\")";
_item.fldMablagh /*int*/  = (int)(Double.parseDouble(mostCurrent._txtmablagh.getText().replace(",","")));
RDebugUtils.currentLine=76480563;
 //BA.debugLineNum = 76480563;BA.debugLine="item.fldShobe=txtShobe.Text";
_item.fldShobe /*String*/  = mostCurrent._txtshobe.getText();
RDebugUtils.currentLine=76480564;
 //BA.debugLineNum = 76480564;BA.debugLine="item.fldSharh=TxtSharh.Text";
_item.fldSharh /*String*/  = mostCurrent._txtsharh.getText();
RDebugUtils.currentLine=76480565;
 //BA.debugLineNum = 76480565;BA.debugLine="item.fldDate=date";
_item.fldDate /*String*/  = _date;
RDebugUtils.currentLine=76480566;
 //BA.debugLineNum = 76480566;BA.debugLine="item.fldDateSarResid=DateCheck";
_item.fldDateSarResid /*String*/  = mostCurrent._datecheck;
RDebugUtils.currentLine=76480567;
 //BA.debugLineNum = 76480567;BA.debugLine="item.fldCodeBank=CodeBank1";
_item.fldCodeBank /*String*/  = mostCurrent._codebank1;
RDebugUtils.currentLine=76480568;
 //BA.debugLineNum = 76480568;BA.debugLine="item.fldNameBank=NameBank1";
_item.fldNameBank /*String*/  = mostCurrent._namebank1;
RDebugUtils.currentLine=76480569;
 //BA.debugLineNum = 76480569;BA.debugLine="item.fldCodeSahebeCheck=CodeMoshtari";
_item.fldCodeSahebeCheck /*String*/  = _codemoshtari;
RDebugUtils.currentLine=76480570;
 //BA.debugLineNum = 76480570;BA.debugLine="item.fldNameSahebeCheck=NameMoshtari";
_item.fldNameSahebeCheck /*String*/  = _namemoshtari;
RDebugUtils.currentLine=76480571;
 //BA.debugLineNum = 76480571;BA.debugLine="item.fldShomareFactor=ShomareFactor";
_item.fldShomareFactor /*String*/  = _shomarefactor;
RDebugUtils.currentLine=76480573;
 //BA.debugLineNum = 76480573;BA.debugLine="MCode.SaveUpdate(\"insert into TblCheckDaryafti(f";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"insert into TblCheckDaryafti(fldShomareCheck,fldShomareHesab,fldShomareDaryaft,fldMablagh,fldShobe,fldSharh,fldDate,fldDateSarResid,fldCodeBank,fldNameBank,fldCodeSahebeCheck,fldNameSahebeCheck,fldShomareFactor,fldCodeVaste) values('"+mostCurrent._txtshomarecheck.getText()+"','"+mostCurrent._txtshomarehesab.getText()+"'"+",'"+_shomaredaryafti+"'"+",'"+mostCurrent._txtmablagh.getText().replace(",","")+"'"+",'"+mostCurrent._txtshobe.getText()+"'"+",'"+mostCurrent._txtsharh.getText()+"'"+",'"+_date+"'"+",'"+mostCurrent._datecheck+""+"',"+mostCurrent._codebank1+""+",'"+mostCurrent._namebank1+"'"+",'"+_codemoshtari+"'"+",'"+_namemoshtari+"'"+",'"+_shomarefactor+"'"+",'"+mostCurrent._mcode._c_visitor /*String*/ +"'"+")");
RDebugUtils.currentLine=76480588;
 //BA.debugLineNum = 76480588;BA.debugLine="SumMablaghCheck=SumMablaghCheck+item.fldMablagh";
_summablaghcheck = BA.NumberToString((double)(Double.parseDouble(_summablaghcheck))+_item.fldMablagh /*int*/ );
RDebugUtils.currentLine=76480589;
 //BA.debugLineNum = 76480589;BA.debugLine="lstCheck.Add(item)";
_lstcheck.Add((Object)(_item));
RDebugUtils.currentLine=76480591;
 //BA.debugLineNum = 76480591;BA.debugLine="HLV.notifyDataSetChanged";
mostCurrent._hlv.notifyDataSetChanged();
RDebugUtils.currentLine=76480592;
 //BA.debugLineNum = 76480592;BA.debugLine="txtShomareCheck.Text=\"\"";
mostCurrent._txtshomarecheck.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=76480593;
 //BA.debugLineNum = 76480593;BA.debugLine="txtShomareHesab.Text=\"\"";
mostCurrent._txtshomarehesab.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=76480594;
 //BA.debugLineNum = 76480594;BA.debugLine="txtMablagh.Text=0";
mostCurrent._txtmablagh.setText(BA.ObjectToCharSequence(0));
RDebugUtils.currentLine=76480595;
 //BA.debugLineNum = 76480595;BA.debugLine="txtShobe.Text=\"\"";
mostCurrent._txtshobe.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=76480596;
 //BA.debugLineNum = 76480596;BA.debugLine="TxtSharh.Text=\"\"";
mostCurrent._txtsharh.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=76480597;
 //BA.debugLineNum = 76480597;BA.debugLine="BtnDateSarResid.Text=\"تعیین تاریخ\"";
mostCurrent._btndatesarresid.setText(BA.ObjectToCharSequence("تعیین تاریخ"));
 } 
       catch (Exception e62) {
			processBA.setLastException(e62);RDebugUtils.currentLine=76480599;
 //BA.debugLineNum = 76480599;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("576480599",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=76480600;
 //BA.debugLineNum = 76480600;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-BtnSave_Click");
 };
RDebugUtils.currentLine=76480602;
 //BA.debugLineNum = 76480602;BA.debugLine="End Sub";
return "";
}
public static int  _hlv_getitemcount() throws Exception{
RDebugUtils.currentModule="act_sabtrizcheck";
if (Debug.shouldDelegate(mostCurrent.activityBA, "hlv_getitemcount", false))
	 {return ((Integer) Debug.delegate(mostCurrent.activityBA, "hlv_getitemcount", null));}
RDebugUtils.currentLine=76349440;
 //BA.debugLineNum = 76349440;BA.debugLine="Sub HLV_GetItemCount As Int 								        '💯 It";
RDebugUtils.currentLine=76349441;
 //BA.debugLineNum = 76349441;BA.debugLine="Return lstCheck.Size '/ItemList.Size";
if (true) return _lstcheck.getSize();
RDebugUtils.currentLine=76349442;
 //BA.debugLineNum = 76349442;BA.debugLine="End Sub";
return 0;
}
public static String  _hlv_onbindviewholder(anywheresoftware.b4a.objects.PanelWrapper _parent,int _position) throws Exception{
RDebugUtils.currentModule="act_sabtrizcheck";
if (Debug.shouldDelegate(mostCurrent.activityBA, "hlv_onbindviewholder", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "hlv_onbindviewholder", new Object[] {_parent,_position}));}
ir.parsikhesab.pakhsh.mcode._adapterlistcheckdaryafti _item = null;
ir.parsikhesab.pakhsh.cls_rizcheck _rec = null;
RDebugUtils.currentLine=76283904;
 //BA.debugLineNum = 76283904;BA.debugLine="Sub HLV_onBindViewHolder (Parent As Panel, Positio";
RDebugUtils.currentLine=76283905;
 //BA.debugLineNum = 76283905;BA.debugLine="Dim item As AdapterListCheckDaryafti=lstCheck.Get";
_item = (ir.parsikhesab.pakhsh.mcode._adapterlistcheckdaryafti)(_lstcheck.Get(_position));
RDebugUtils.currentLine=76283906;
 //BA.debugLineNum = 76283906;BA.debugLine="Dim rec As cls_RizCheck=Parent.Tag";
_rec = (ir.parsikhesab.pakhsh.cls_rizcheck)(_parent.getTag());
RDebugUtils.currentLine=76283907;
 //BA.debugLineNum = 76283907;BA.debugLine="rec.show(item,issend)";
_rec._show /*String*/ (null,_item,_issend);
RDebugUtils.currentLine=76283908;
 //BA.debugLineNum = 76283908;BA.debugLine="Parent.Height=rec.Height";
_parent.setHeight(_rec._getheight /*int*/ (null));
RDebugUtils.currentLine=76283909;
 //BA.debugLineNum = 76283909;BA.debugLine="End Sub";
return "";
}
public static String  _hlv_oncreateviewholder(anywheresoftware.b4a.objects.PanelWrapper _parent,int _viewtype) throws Exception{
RDebugUtils.currentModule="act_sabtrizcheck";
if (Debug.shouldDelegate(mostCurrent.activityBA, "hlv_oncreateviewholder", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "hlv_oncreateviewholder", new Object[] {_parent,_viewtype}));}
ir.parsikhesab.pakhsh.cls_rizcheck _rec = null;
RDebugUtils.currentLine=76218368;
 //BA.debugLineNum = 76218368;BA.debugLine="Private Sub HLV_onCreateViewHolder (Parent As Pane";
RDebugUtils.currentLine=76218369;
 //BA.debugLineNum = 76218369;BA.debugLine="Dim rec As cls_RizCheck";
_rec = new ir.parsikhesab.pakhsh.cls_rizcheck();
RDebugUtils.currentLine=76218370;
 //BA.debugLineNum = 76218370;BA.debugLine="rec.Initialize(Me)";
_rec._initialize /*String*/ (null,mostCurrent.activityBA,act_sabtrizcheck.getObject());
RDebugUtils.currentLine=76218371;
 //BA.debugLineNum = 76218371;BA.debugLine="Parent.AddView(rec.Panel,0,0,100%x,rec.Height)";
_parent.AddView((android.view.View)(_rec._getpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ (null).getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),_rec._getheight /*int*/ (null));
RDebugUtils.currentLine=76218372;
 //BA.debugLineNum = 76218372;BA.debugLine="Parent.Tag=rec";
_parent.setTag((Object)(_rec));
RDebugUtils.currentLine=76218373;
 //BA.debugLineNum = 76218373;BA.debugLine="End Sub";
return "";
}
public static String  _nsn_bankd_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="act_sabtrizcheck";
if (Debug.shouldDelegate(mostCurrent.activityBA, "nsn_bankd_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "nsn_bankd_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=76873728;
 //BA.debugLineNum = 76873728;BA.debugLine="Sub NSN_BankD_ItemClick (Position As Int, Value As";
RDebugUtils.currentLine=76873729;
 //BA.debugLineNum = 76873729;BA.debugLine="Try";
try {RDebugUtils.currentLine=76873730;
 //BA.debugLineNum = 76873730;BA.debugLine="CodeBank1=lstCodeBank1.Get(Position)";
mostCurrent._codebank1 = BA.ObjectToString(mostCurrent._lstcodebank1.Get(_position));
RDebugUtils.currentLine=76873731;
 //BA.debugLineNum = 76873731;BA.debugLine="NameBank1=Value";
mostCurrent._namebank1 = BA.ObjectToString(_value);
RDebugUtils.currentLine=76873732;
 //BA.debugLineNum = 76873732;BA.debugLine="Log(CodeBank1)";
anywheresoftware.b4a.keywords.Common.LogImpl("576873732",mostCurrent._codebank1,0);
RDebugUtils.currentLine=76873733;
 //BA.debugLineNum = 76873733;BA.debugLine="Log(NameBank1)";
anywheresoftware.b4a.keywords.Common.LogImpl("576873733",mostCurrent._namebank1,0);
 } 
       catch (Exception e7) {
			processBA.setLastException(e7);RDebugUtils.currentLine=76873735;
 //BA.debugLineNum = 76873735;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("576873735",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=76873736;
 //BA.debugLineNum = 76873736;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-NSN_BankD_ItemClick");
 };
RDebugUtils.currentLine=76873739;
 //BA.debugLineNum = 76873739;BA.debugLine="End Sub";
return "";
}
public static String  _p_oncancel() throws Exception{
RDebugUtils.currentModule="act_sabtrizcheck";
if (Debug.shouldDelegate(mostCurrent.activityBA, "p_oncancel", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "p_oncancel", null));}
RDebugUtils.currentLine=76742656;
 //BA.debugLineNum = 76742656;BA.debugLine="Sub p_onCancel";
RDebugUtils.currentLine=76742657;
 //BA.debugLineNum = 76742657;BA.debugLine="Log(\"cancel\")";
anywheresoftware.b4a.keywords.Common.LogImpl("576742657","cancel",0);
RDebugUtils.currentLine=76742658;
 //BA.debugLineNum = 76742658;BA.debugLine="End Sub";
return "";
}
public static String  _p_ondateset(int _year,int _month,int _day) throws Exception{
RDebugUtils.currentModule="act_sabtrizcheck";
if (Debug.shouldDelegate(mostCurrent.activityBA, "p_ondateset", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "p_ondateset", new Object[] {_year,_month,_day}));}
RDebugUtils.currentLine=76677120;
 //BA.debugLineNum = 76677120;BA.debugLine="Sub p_onDateSet(year As Int,month As Int,day As In";
RDebugUtils.currentLine=76677121;
 //BA.debugLineNum = 76677121;BA.debugLine="Log(year&\"/\"&month&\"/\"&day)";
anywheresoftware.b4a.keywords.Common.LogImpl("576677121",BA.NumberToString(_year)+"/"+BA.NumberToString(_month)+"/"+BA.NumberToString(_day),0);
RDebugUtils.currentLine=76677122;
 //BA.debugLineNum = 76677122;BA.debugLine="BtnDateSarResid.Text=year&\"/\"&NumberFormat(month,";
mostCurrent._btndatesarresid.setText(BA.ObjectToCharSequence(BA.NumberToString(_year)+"/"+anywheresoftware.b4a.keywords.Common.NumberFormat(_month,(int) (2),(int) (0))+"/"+anywheresoftware.b4a.keywords.Common.NumberFormat(_day,(int) (2),(int) (0))));
RDebugUtils.currentLine=76677123;
 //BA.debugLineNum = 76677123;BA.debugLine="DateCheck=year&NumberFormat(month,2,0)&NumberForm";
mostCurrent._datecheck = BA.NumberToString(_year)+anywheresoftware.b4a.keywords.Common.NumberFormat(_month,(int) (2),(int) (0))+anywheresoftware.b4a.keywords.Common.NumberFormat(_day,(int) (2),(int) (0));
RDebugUtils.currentLine=76677124;
 //BA.debugLineNum = 76677124;BA.debugLine="End Sub";
return "";
}
public static String  _p_ondismiss() throws Exception{
RDebugUtils.currentModule="act_sabtrizcheck";
if (Debug.shouldDelegate(mostCurrent.activityBA, "p_ondismiss", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "p_ondismiss", null));}
RDebugUtils.currentLine=76808192;
 //BA.debugLineNum = 76808192;BA.debugLine="Sub p_onDismiss";
RDebugUtils.currentLine=76808193;
 //BA.debugLineNum = 76808193;BA.debugLine="Log(\"dismiss\")";
anywheresoftware.b4a.keywords.Common.LogImpl("576808193","dismiss",0);
RDebugUtils.currentLine=76808194;
 //BA.debugLineNum = 76808194;BA.debugLine="End Sub";
return "";
}
public static String  _txtmablagh_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="act_sabtrizcheck";
if (Debug.shouldDelegate(mostCurrent.activityBA, "txtmablagh_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "txtmablagh_textchanged", new Object[] {_old,_new}));}
long _no = 0L;
RDebugUtils.currentLine=77201408;
 //BA.debugLineNum = 77201408;BA.debugLine="Private Sub txtMablagh_TextChanged (Old As String,";
RDebugUtils.currentLine=77201409;
 //BA.debugLineNum = 77201409;BA.debugLine="Dim no As Long";
_no = 0L;
RDebugUtils.currentLine=77201410;
 //BA.debugLineNum = 77201410;BA.debugLine="If MCode.ConvertNumbersPersian2English(Old) <> MC";
if ((mostCurrent._mcode._convertnumberspersian2english /*String*/ (mostCurrent.activityBA,_old)).equals(mostCurrent._mcode._convertnumberspersian2english /*String*/ (mostCurrent.activityBA,_new)) == false) { 
RDebugUtils.currentLine=77201411;
 //BA.debugLineNum = 77201411;BA.debugLine="Try";
try {RDebugUtils.currentLine=77201412;
 //BA.debugLineNum = 77201412;BA.debugLine="no = txtMablagh.Text.Replace(\",\",\"\")";
_no = (long)(Double.parseDouble(mostCurrent._txtmablagh.getText().replace(",","")));
RDebugUtils.currentLine=77201413;
 //BA.debugLineNum = 77201413;BA.debugLine="txtchanged=True";
_txtchanged = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=77201414;
 //BA.debugLineNum = 77201414;BA.debugLine="Log(no)";
anywheresoftware.b4a.keywords.Common.LogImpl("577201414",BA.NumberToString(_no),0);
 } 
       catch (Exception e8) {
			processBA.setLastException(e8);RDebugUtils.currentLine=77201416;
 //BA.debugLineNum = 77201416;BA.debugLine="no=0";
_no = (long) (0);
 };
 };
RDebugUtils.currentLine=77201419;
 //BA.debugLineNum = 77201419;BA.debugLine="If txtchanged Then";
if (_txtchanged) { 
RDebugUtils.currentLine=77201420;
 //BA.debugLineNum = 77201420;BA.debugLine="txtchanged=False";
_txtchanged = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=77201421;
 //BA.debugLineNum = 77201421;BA.debugLine="txtMablagh.Tag=no";
mostCurrent._txtmablagh.setTag((Object)(_no));
RDebugUtils.currentLine=77201422;
 //BA.debugLineNum = 77201422;BA.debugLine="txtMablagh.Text=NumberFormat2(no,0,0,0,True)";
mostCurrent._txtmablagh.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.NumberFormat2(_no,(int) (0),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.True)));
 };
RDebugUtils.currentLine=77201424;
 //BA.debugLineNum = 77201424;BA.debugLine="txtMablagh.SetSelection(txtMablagh.Text.Length,0)";
mostCurrent._txtmablagh.SetSelection(mostCurrent._txtmablagh.getText().length(),(int) (0));
RDebugUtils.currentLine=77201425;
 //BA.debugLineNum = 77201425;BA.debugLine="End Sub";
return "";
}
public static String  _txtshomarecheck_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="act_sabtrizcheck";
if (Debug.shouldDelegate(mostCurrent.activityBA, "txtshomarecheck_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "txtshomarecheck_textchanged", new Object[] {_old,_new}));}
long _no = 0L;
RDebugUtils.currentLine=77070336;
 //BA.debugLineNum = 77070336;BA.debugLine="Private Sub txtShomareCheck_TextChanged (Old As St";
RDebugUtils.currentLine=77070337;
 //BA.debugLineNum = 77070337;BA.debugLine="Dim no As Long";
_no = 0L;
RDebugUtils.currentLine=77070338;
 //BA.debugLineNum = 77070338;BA.debugLine="If MCode.ConvertNumbersPersian2English(Old) <> MC";
if ((mostCurrent._mcode._convertnumberspersian2english /*String*/ (mostCurrent.activityBA,_old)).equals(mostCurrent._mcode._convertnumberspersian2english /*String*/ (mostCurrent.activityBA,_new)) == false) { 
RDebugUtils.currentLine=77070339;
 //BA.debugLineNum = 77070339;BA.debugLine="Try";
try {RDebugUtils.currentLine=77070340;
 //BA.debugLineNum = 77070340;BA.debugLine="no = txtShomareCheck.Text";
_no = (long)(Double.parseDouble(mostCurrent._txtshomarecheck.getText()));
RDebugUtils.currentLine=77070341;
 //BA.debugLineNum = 77070341;BA.debugLine="txtchanged=True";
_txtchanged = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=77070342;
 //BA.debugLineNum = 77070342;BA.debugLine="Log(no)";
anywheresoftware.b4a.keywords.Common.LogImpl("577070342",BA.NumberToString(_no),0);
 } 
       catch (Exception e8) {
			processBA.setLastException(e8);RDebugUtils.currentLine=77070344;
 //BA.debugLineNum = 77070344;BA.debugLine="no=0";
_no = (long) (0);
RDebugUtils.currentLine=77070345;
 //BA.debugLineNum = 77070345;BA.debugLine="txtShomareCheck.Text=\"0\"";
mostCurrent._txtshomarecheck.setText(BA.ObjectToCharSequence("0"));
 };
 };
RDebugUtils.currentLine=77070348;
 //BA.debugLineNum = 77070348;BA.debugLine="If txtchanged Then";
if (_txtchanged) { 
RDebugUtils.currentLine=77070349;
 //BA.debugLineNum = 77070349;BA.debugLine="txtchanged=False";
_txtchanged = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=77070350;
 //BA.debugLineNum = 77070350;BA.debugLine="txtShomareCheck.Tag=no";
mostCurrent._txtshomarecheck.setTag((Object)(_no));
RDebugUtils.currentLine=77070351;
 //BA.debugLineNum = 77070351;BA.debugLine="txtShomareCheck.Text=no";
mostCurrent._txtshomarecheck.setText(BA.ObjectToCharSequence(_no));
 };
RDebugUtils.currentLine=77070353;
 //BA.debugLineNum = 77070353;BA.debugLine="txtShomareCheck.SelectionStart=txtShomareCheck.Te";
mostCurrent._txtshomarecheck.setSelectionStart(mostCurrent._txtshomarecheck.getText().length());
RDebugUtils.currentLine=77070354;
 //BA.debugLineNum = 77070354;BA.debugLine="End Sub";
return "";
}
public static String  _txtshomarehesab_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="act_sabtrizcheck";
if (Debug.shouldDelegate(mostCurrent.activityBA, "txtshomarehesab_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "txtshomarehesab_textchanged", new Object[] {_old,_new}));}
long _no = 0L;
RDebugUtils.currentLine=77135872;
 //BA.debugLineNum = 77135872;BA.debugLine="Private Sub txtShomareHesab_TextChanged (Old As St";
RDebugUtils.currentLine=77135873;
 //BA.debugLineNum = 77135873;BA.debugLine="Dim no As Long";
_no = 0L;
RDebugUtils.currentLine=77135874;
 //BA.debugLineNum = 77135874;BA.debugLine="If MCode.ConvertNumbersPersian2English(Old) <> MC";
if ((mostCurrent._mcode._convertnumberspersian2english /*String*/ (mostCurrent.activityBA,_old)).equals(mostCurrent._mcode._convertnumberspersian2english /*String*/ (mostCurrent.activityBA,_new)) == false) { 
RDebugUtils.currentLine=77135875;
 //BA.debugLineNum = 77135875;BA.debugLine="Try";
try {RDebugUtils.currentLine=77135876;
 //BA.debugLineNum = 77135876;BA.debugLine="no = txtShomareHesab.Text";
_no = (long)(Double.parseDouble(mostCurrent._txtshomarehesab.getText()));
RDebugUtils.currentLine=77135877;
 //BA.debugLineNum = 77135877;BA.debugLine="txtchanged=True";
_txtchanged = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=77135878;
 //BA.debugLineNum = 77135878;BA.debugLine="Log(no)";
anywheresoftware.b4a.keywords.Common.LogImpl("577135878",BA.NumberToString(_no),0);
 } 
       catch (Exception e8) {
			processBA.setLastException(e8);RDebugUtils.currentLine=77135880;
 //BA.debugLineNum = 77135880;BA.debugLine="no=0";
_no = (long) (0);
RDebugUtils.currentLine=77135881;
 //BA.debugLineNum = 77135881;BA.debugLine="txtShomareHesab.Text=\"0\"";
mostCurrent._txtshomarehesab.setText(BA.ObjectToCharSequence("0"));
 };
 };
RDebugUtils.currentLine=77135884;
 //BA.debugLineNum = 77135884;BA.debugLine="If txtchanged Then";
if (_txtchanged) { 
RDebugUtils.currentLine=77135885;
 //BA.debugLineNum = 77135885;BA.debugLine="txtchanged=False";
_txtchanged = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=77135886;
 //BA.debugLineNum = 77135886;BA.debugLine="txtShomareHesab.Tag=no";
mostCurrent._txtshomarehesab.setTag((Object)(_no));
RDebugUtils.currentLine=77135887;
 //BA.debugLineNum = 77135887;BA.debugLine="txtShomareHesab.Text=no";
mostCurrent._txtshomarehesab.setText(BA.ObjectToCharSequence(_no));
 };
RDebugUtils.currentLine=77135889;
 //BA.debugLineNum = 77135889;BA.debugLine="txtShomareHesab.SelectionStart=txtShomareHesab.Te";
mostCurrent._txtshomarehesab.setSelectionStart(mostCurrent._txtshomarehesab.getText().length());
RDebugUtils.currentLine=77135890;
 //BA.debugLineNum = 77135890;BA.debugLine="End Sub";
return "";
}
}