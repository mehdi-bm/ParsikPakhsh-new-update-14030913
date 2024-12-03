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

public class act_sabtmarjooii extends Activity implements B4AActivity{
	public static act_sabtmarjooii mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.act_sabtmarjooii");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (act_sabtmarjooii).");
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
		activityBA = new BA(this, layout, processBA, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.act_sabtmarjooii");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "ir.parsikhesab.pakhsh.act_sabtmarjooii", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (act_sabtmarjooii) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (act_sabtmarjooii) Resume **");
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
		return act_sabtmarjooii.class;
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
            BA.LogInfo("** Activity (act_sabtmarjooii) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (act_sabtmarjooii) Pause event (activity is not paused). **");
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
            act_sabtmarjooii mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (act_sabtmarjooii) Resume **");
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
public static anywheresoftware.b4a.objects.Timer _t_search = null;
public wir.hitex.recycler.Hitex_LayoutView _hlv = null;
public hitex.nice.spinner.Hitex_NiceSpinner _nicespinner = null;
public hitex.nice.spinner.Hitex_NiceSpinner _nicespinner1 = null;
public anywheresoftware.b4a.objects.IME _key = null;
public anywheresoftware.b4a.objects.collections.List _listkalatxt = null;
public anywheresoftware.b4a.objects.collections.List _listkalasp = null;
public anywheresoftware.b4a.objects.collections.List _orginallistkala = null;
public anywheresoftware.b4a.objects.collections.List _listgroohkala = null;
public static String _feetip = "";
public static String _str_sort = "";
public ice.zxing.b4aZXingLib _barcode = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblbasketcount = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblbasket = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _btnshowfilterpnl = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtsearch = null;
public ir.parsikhesab.pakhsh.b4xcombobox _b4xcombobox1 = null;
public ir.parsikhesab.pakhsh.b4xcombobox _b4xcombobox2 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btncommentexit = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btncommentok = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlfilter = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnl_hlv = null;
public anywheresoftware.b4a.objects.EditTextWrapper _numbersearch = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnl_top = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview1 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_back = null;
public anywheresoftware.b4a.objects.LabelWrapper _label4 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel2 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel3 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label6 = null;
public anywheresoftware.b4a.objects.LabelWrapper _btnsearch = null;
public ir.parsikhesab.pakhsh.b4xdialog _dialog = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _img_barcode = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _img_paging = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _img_sort = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _img_tipfee = null;
public anywheresoftware.b4a.objects.LabelWrapper _label11 = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnl_tools = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblpoint = null;
public de.amberhome.objects.appcompat.ACSwitchCompatWrapper _swgift = null;
public de.amberhome.objects.appcompat.ACSwitchCompatWrapper _swmojoodi = null;
public de.amberhome.objects.appcompat.ACSwitchCompatWrapper _swpic = null;
public de.amberhome.objects.appcompat.ACSwitchCompatWrapper _swtakhfif = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnl_down = null;
public anywheresoftware.b4a.objects.collections.List _listgoroohkala = null;
public anywheresoftware.b4a.objects.collections.List _originallistgoroohkala = null;
public static String _groupcodeselect1 = "";
public static String _groupnameselect1 = "";
public static String _groupcodeselect2 = "";
public static String _groupnameselect2 = "";
public anywheresoftware.b4a.objects.collections.List _lstselectedcodegroupkala = null;
public ir.parsikhesab.pakhsh.b4xcombobox _cmbbox1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltitile = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnltipfee = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _img_selectmoshtari = null;
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
RDebugUtils.currentModule="act_sabtmarjooii";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
anywheresoftware.b4a.objects.drawable.ColorDrawable _op = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _op1 = null;
RDebugUtils.currentLine=73531392;
 //BA.debugLineNum = 73531392;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=73531393;
 //BA.debugLineNum = 73531393;BA.debugLine="Activity.LoadLayout(\"L_KalaDefault_2\")";
mostCurrent._activity.LoadLayout("L_KalaDefault_2",mostCurrent.activityBA);
RDebugUtils.currentLine=73531394;
 //BA.debugLineNum = 73531394;BA.debugLine="lstSelectedCodeGroupKala.Initialize";
mostCurrent._lstselectedcodegroupkala.Initialize();
RDebugUtils.currentLine=73531395;
 //BA.debugLineNum = 73531395;BA.debugLine="HLV.Initializer(\"HLV\").ListView.Build";
mostCurrent._hlv.Initializer(mostCurrent.activityBA,"HLV").ListView().Build();
RDebugUtils.currentLine=73531396;
 //BA.debugLineNum = 73531396;BA.debugLine="pnl_HLV.AddView(HLV,0,0,100%x,pnl_HLV.Height)";
mostCurrent._pnl_hlv.AddView((android.view.View)(mostCurrent._hlv.getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),mostCurrent._pnl_hlv.getHeight());
RDebugUtils.currentLine=73531397;
 //BA.debugLineNum = 73531397;BA.debugLine="Key.Initialize(\"Key\")";
mostCurrent._key.Initialize("Key");
RDebugUtils.currentLine=73531400;
 //BA.debugLineNum = 73531400;BA.debugLine="Dialog.Initialize (Activity)";
mostCurrent._dialog._initialize /*String*/ (null,mostCurrent.activityBA,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(mostCurrent._activity.getObject())));
RDebugUtils.currentLine=73531401;
 //BA.debugLineNum = 73531401;BA.debugLine="t_search.Initialize(\"t_search\",50)";
_t_search.Initialize(processBA,"t_search",(long) (50));
RDebugUtils.currentLine=73531402;
 //BA.debugLineNum = 73531402;BA.debugLine="ListGoroohKala.Initialize";
mostCurrent._listgoroohkala.Initialize();
RDebugUtils.currentLine=73531403;
 //BA.debugLineNum = 73531403;BA.debugLine="OriginalListGoroohKala.Initialize";
mostCurrent._originallistgoroohkala.Initialize();
RDebugUtils.currentLine=73531404;
 //BA.debugLineNum = 73531404;BA.debugLine="NiceSpinner.Initialize(\"NiceSpinner\",True,True)";
mostCurrent._nicespinner.Initialize(mostCurrent.activityBA,"NiceSpinner",anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=73531406;
 //BA.debugLineNum = 73531406;BA.debugLine="Panel2.AddView(NiceSpinner,B4XComboBox1.mBase.Lef";
mostCurrent._panel2.AddView((android.view.View)(mostCurrent._nicespinner.getObject()),mostCurrent._b4xcombobox1._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft(),mostCurrent._b4xcombobox1._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop(),mostCurrent._b4xcombobox1._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),mostCurrent._b4xcombobox1._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=73531407;
 //BA.debugLineNum = 73531407;BA.debugLine="NiceSpinner.TextColor = Colors.Black";
mostCurrent._nicespinner.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=73531408;
 //BA.debugLineNum = 73531408;BA.debugLine="NiceSpinner.Gravity = Gravity.CENTER_HORIZONTAL";
mostCurrent._nicespinner.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL);
RDebugUtils.currentLine=73531409;
 //BA.debugLineNum = 73531409;BA.debugLine="NiceSpinner.Typeface = Typeface.LoadFromAssets(\"p";
mostCurrent._nicespinner.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("p_font.ttf"));
RDebugUtils.currentLine=73531410;
 //BA.debugLineNum = 73531410;BA.debugLine="Dim op As ColorDrawable";
_op = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=73531411;
 //BA.debugLineNum = 73531411;BA.debugLine="op.Initialize2(Colors.White,8dip,2dip,Colors.Blac";
_op.Initialize2(anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (8)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2)),anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=73531412;
 //BA.debugLineNum = 73531412;BA.debugLine="NiceSpinner.Background=op";
mostCurrent._nicespinner.setBackground((android.graphics.drawable.Drawable)(_op.getObject()));
RDebugUtils.currentLine=73531414;
 //BA.debugLineNum = 73531414;BA.debugLine="NiceSpinner1.Initialize(\"NiceSpinner1\",True,True)";
mostCurrent._nicespinner1.Initialize(mostCurrent.activityBA,"NiceSpinner1",anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=73531416;
 //BA.debugLineNum = 73531416;BA.debugLine="Panel2.AddView(NiceSpinner1,B4XComboBox2.mBase.Le";
mostCurrent._panel2.AddView((android.view.View)(mostCurrent._nicespinner1.getObject()),mostCurrent._b4xcombobox2._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft(),mostCurrent._b4xcombobox2._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop(),mostCurrent._b4xcombobox2._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),mostCurrent._b4xcombobox2._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=73531417;
 //BA.debugLineNum = 73531417;BA.debugLine="NiceSpinner1.TextColor = Colors.Black";
mostCurrent._nicespinner1.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=73531418;
 //BA.debugLineNum = 73531418;BA.debugLine="NiceSpinner1.Gravity = Gravity.CENTER_HORIZONTAL";
mostCurrent._nicespinner1.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL);
RDebugUtils.currentLine=73531419;
 //BA.debugLineNum = 73531419;BA.debugLine="NiceSpinner1.Typeface = Typeface.LoadFromAssets(\"";
mostCurrent._nicespinner1.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("p_font.ttf"));
RDebugUtils.currentLine=73531420;
 //BA.debugLineNum = 73531420;BA.debugLine="Dim op1 As ColorDrawable";
_op1 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=73531421;
 //BA.debugLineNum = 73531421;BA.debugLine="op1.Initialize2(Colors.White,8dip,2dip,Colors.Bla";
_op1.Initialize2(anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (8)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2)),anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=73531422;
 //BA.debugLineNum = 73531422;BA.debugLine="NiceSpinner1.Background=op1";
mostCurrent._nicespinner1.setBackground((android.graphics.drawable.Drawable)(_op1.getObject()));
RDebugUtils.currentLine=73531423;
 //BA.debugLineNum = 73531423;BA.debugLine="NiceSpinner1.Add(\"همه گروه ها\")";
mostCurrent._nicespinner1.Add("همه گروه ها");
RDebugUtils.currentLine=73531425;
 //BA.debugLineNum = 73531425;BA.debugLine="ListGroohKala.Initialize";
mostCurrent._listgroohkala.Initialize();
RDebugUtils.currentLine=73531426;
 //BA.debugLineNum = 73531426;BA.debugLine="OrginalListKala.Initialize";
mostCurrent._orginallistkala.Initialize();
RDebugUtils.currentLine=73531427;
 //BA.debugLineNum = 73531427;BA.debugLine="ListKalaSp.Initialize";
mostCurrent._listkalasp.Initialize();
RDebugUtils.currentLine=73531428;
 //BA.debugLineNum = 73531428;BA.debugLine="ListKalaTxt.Initialize";
mostCurrent._listkalatxt.Initialize();
RDebugUtils.currentLine=73531430;
 //BA.debugLineNum = 73531430;BA.debugLine="LoadAcSpGroohKala";
_loadacspgroohkala();
RDebugUtils.currentLine=73531433;
 //BA.debugLineNum = 73531433;BA.debugLine="HLV.Show";
mostCurrent._hlv.Show();
RDebugUtils.currentLine=73531444;
 //BA.debugLineNum = 73531444;BA.debugLine="LoadKala";
_loadkala();
RDebugUtils.currentLine=73531447;
 //BA.debugLineNum = 73531447;BA.debugLine="lblTitile.Text=\"ثبت مرجوعی\"";
mostCurrent._lbltitile.setText(BA.ObjectToCharSequence("ثبت مرجوعی"));
RDebugUtils.currentLine=73531448;
 //BA.debugLineNum = 73531448;BA.debugLine="MCode.page=\"SabtMarjooii\"";
mostCurrent._mcode._page /*String*/  = "SabtMarjooii";
RDebugUtils.currentLine=73531450;
 //BA.debugLineNum = 73531450;BA.debugLine="pnlTipFee.Visible=False";
mostCurrent._pnltipfee.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=73531451;
 //BA.debugLineNum = 73531451;BA.debugLine="End Sub";
return "";
}
public static String  _loadacspgroohkala() throws Exception{
RDebugUtils.currentModule="act_sabtmarjooii";
if (Debug.shouldDelegate(mostCurrent.activityBA, "loadacspgroohkala", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "loadacspgroohkala", null));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _dt = null;
int _i = 0;
ir.parsikhesab.pakhsh.mcode._adaptergoroohkala _item = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
RDebugUtils.currentLine=73859072;
 //BA.debugLineNum = 73859072;BA.debugLine="Sub LoadAcSpGroohKala";
RDebugUtils.currentLine=73859073;
 //BA.debugLineNum = 73859073;BA.debugLine="Dim Dt As Cursor = MCode.Result(\"Select FldC_Goro";
_dt = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_dt = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select FldC_Gorooh,FldN_Gorooh From TblGoroohKala where Length(FldC_Gorooh) = 3 ORDER BY FldC_Gorooh");
RDebugUtils.currentLine=73859074;
 //BA.debugLineNum = 73859074;BA.debugLine="NiceSpinner.Add(\"همه گروه ها\")";
mostCurrent._nicespinner.Add("همه گروه ها");
RDebugUtils.currentLine=73859075;
 //BA.debugLineNum = 73859075;BA.debugLine="For i=0 To Dt.RowCount-1";
{
final int step3 = 1;
final int limit3 = (int) (_dt.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=73859076;
 //BA.debugLineNum = 73859076;BA.debugLine="Dt.Position=i";
_dt.setPosition(_i);
RDebugUtils.currentLine=73859077;
 //BA.debugLineNum = 73859077;BA.debugLine="Dim Item As AdapterGoroohKala";
_item = new ir.parsikhesab.pakhsh.mcode._adaptergoroohkala();
RDebugUtils.currentLine=73859078;
 //BA.debugLineNum = 73859078;BA.debugLine="Dim cu As Cursor";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=73859080;
 //BA.debugLineNum = 73859080;BA.debugLine="cu=MCode.Result(\"Select fldCodeKala From TblKala";
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select fldCodeKala From TblKala where fldCodeGroup like '"+_dt.GetString("FldC_Gorooh")+"%'");
RDebugUtils.currentLine=73859081;
 //BA.debugLineNum = 73859081;BA.debugLine="If cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=73859082;
 //BA.debugLineNum = 73859082;BA.debugLine="Item.FldC_Gorooh= Dt.GetString(\"FldC_Gorooh\")";
_item.FldC_Gorooh /*String*/  = _dt.GetString("FldC_Gorooh");
RDebugUtils.currentLine=73859083;
 //BA.debugLineNum = 73859083;BA.debugLine="Item.FldN_Gorooh= Dt.GetString(\"FldN_Gorooh\")";
_item.FldN_Gorooh /*String*/  = _dt.GetString("FldN_Gorooh");
RDebugUtils.currentLine=73859084;
 //BA.debugLineNum = 73859084;BA.debugLine="OriginalListGoroohKala.Add(Item)";
mostCurrent._originallistgoroohkala.Add((Object)(_item));
RDebugUtils.currentLine=73859085;
 //BA.debugLineNum = 73859085;BA.debugLine="NiceSpinner.Add(Item.FldN_Gorooh)";
mostCurrent._nicespinner.Add(_item.FldN_Gorooh /*String*/ );
 };
 }
};
RDebugUtils.currentLine=73859089;
 //BA.debugLineNum = 73859089;BA.debugLine="NiceSpinner.Show(Colors.blue, 14)";
mostCurrent._nicespinner.Show(anywheresoftware.b4a.keywords.Common.Colors.Blue,(float) (14));
RDebugUtils.currentLine=73859094;
 //BA.debugLineNum = 73859094;BA.debugLine="End Sub";
return "";
}
public static String  _loadkala() throws Exception{
RDebugUtils.currentModule="act_sabtmarjooii";
if (Debug.shouldDelegate(mostCurrent.activityBA, "loadkala", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "loadkala", null));}
String _str = "";
int _countfilter = 0;
boolean _filter = false;
String _search = "";
RDebugUtils.currentLine=73662464;
 //BA.debugLineNum = 73662464;BA.debugLine="Sub LoadKala";
RDebugUtils.currentLine=73662466;
 //BA.debugLineNum = 73662466;BA.debugLine="Dim str As String=\"\"";
_str = "";
RDebugUtils.currentLine=73662467;
 //BA.debugLineNum = 73662467;BA.debugLine="Dim countfilter As Int=0";
_countfilter = (int) (0);
RDebugUtils.currentLine=73662468;
 //BA.debugLineNum = 73662468;BA.debugLine="Dim filter As Boolean=False";
_filter = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=73662469;
 //BA.debugLineNum = 73662469;BA.debugLine="Log(GroupCodeSelect1)";
anywheresoftware.b4a.keywords.Common.LogImpl("573662469",mostCurrent._groupcodeselect1,0);
RDebugUtils.currentLine=73662470;
 //BA.debugLineNum = 73662470;BA.debugLine="Log(GroupCodeSelect2)";
anywheresoftware.b4a.keywords.Common.LogImpl("573662470",mostCurrent._groupcodeselect2,0);
RDebugUtils.currentLine=73662471;
 //BA.debugLineNum = 73662471;BA.debugLine="If GroupCodeSelect1=0 And GroupCodeSelect2=0 Then";
if ((mostCurrent._groupcodeselect1).equals(BA.NumberToString(0)) && (mostCurrent._groupcodeselect2).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=73662472;
 //BA.debugLineNum = 73662472;BA.debugLine="If TxtSearch.Text.Length>0 And TxtSearch.Text<>\"";
if (mostCurrent._txtsearch.getText().length()>0 && (mostCurrent._txtsearch.getText()).equals(" ") == false && (mostCurrent._txtsearch.getText()).equals("") == false) { 
RDebugUtils.currentLine=73662473;
 //BA.debugLineNum = 73662473;BA.debugLine="Dim Search As String=MCode.ConvertNumbersPersia";
_search = mostCurrent._mcode._convertnumberspersian2english /*String*/ (mostCurrent.activityBA,mostCurrent._txtsearch.getText());
RDebugUtils.currentLine=73662474;
 //BA.debugLineNum = 73662474;BA.debugLine="If Search=\"\" Then";
if ((_search).equals("")) { 
RDebugUtils.currentLine=73662475;
 //BA.debugLineNum = 73662475;BA.debugLine="Search=TxtSearch.Text";
_search = mostCurrent._txtsearch.getText();
 };
RDebugUtils.currentLine=73662477;
 //BA.debugLineNum = 73662477;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=73662478;
 //BA.debugLineNum = 73662478;BA.debugLine="If IsNumber(Search) Then";
if (anywheresoftware.b4a.keywords.Common.IsNumber(_search)) { 
RDebugUtils.currentLine=73662479;
 //BA.debugLineNum = 73662479;BA.debugLine="If Search.Length>5 Then";
if (_search.length()>5) { 
RDebugUtils.currentLine=73662480;
 //BA.debugLineNum = 73662480;BA.debugLine="str = str & $\" and (fldSerial = '${Search}')";
_str = _str+(" and (fldSerial = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_search))+"') ");
 }else {
RDebugUtils.currentLine=73662482;
 //BA.debugLineNum = 73662482;BA.debugLine="str = str & $\" and (fldCodeKala like '%${Sear";
_str = _str+(" and (fldCodeKala like '%"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_search))+"%') ");
 };
 }else {
RDebugUtils.currentLine=73662486;
 //BA.debugLineNum = 73662486;BA.debugLine="str = str & $\" and (fldNameKala like '%${Searc";
_str = _str+(" and (fldNameKala like '%"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_search))+"%') ");
 };
RDebugUtils.currentLine=73662488;
 //BA.debugLineNum = 73662488;BA.debugLine="filter=True";
_filter = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=73662489;
 //BA.debugLineNum = 73662489;BA.debugLine="If countfilter=1 Then";
if (_countfilter==1) { 
RDebugUtils.currentLine=73662490;
 //BA.debugLineNum = 73662490;BA.debugLine="str=str.Replace(\" and \",\"\")";
_str = _str.replace(" and ","");
 };
 };
RDebugUtils.currentLine=73662494;
 //BA.debugLineNum = 73662494;BA.debugLine="If SwGift.Checked=True Then";
if (mostCurrent._swgift.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=73662495;
 //BA.debugLineNum = 73662495;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=73662496;
 //BA.debugLineNum = 73662496;BA.debugLine="str= str & \" and TblKala.fldCodeKala IN(SELECT";
_str = _str+" and TblKala.fldCodeKala IN(SELECT tblEshantionVisitori.fldCodeKala FROM tblEshantionVisitori)";
RDebugUtils.currentLine=73662497;
 //BA.debugLineNum = 73662497;BA.debugLine="filter=True";
_filter = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=73662498;
 //BA.debugLineNum = 73662498;BA.debugLine="If countfilter=1 Then";
if (_countfilter==1) { 
RDebugUtils.currentLine=73662499;
 //BA.debugLineNum = 73662499;BA.debugLine="str=str.Replace(\" and \",\"\")";
_str = _str.replace(" and ","");
 };
 };
RDebugUtils.currentLine=73662502;
 //BA.debugLineNum = 73662502;BA.debugLine="If SwTakhfif.Checked=True Then";
if (mostCurrent._swtakhfif.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=73662503;
 //BA.debugLineNum = 73662503;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=73662504;
 //BA.debugLineNum = 73662504;BA.debugLine="str= str & \" and fldFeeBadAzTakhfif <> '0.0000'";
_str = _str+" and fldFeeBadAzTakhfif <> '0.0000'";
RDebugUtils.currentLine=73662505;
 //BA.debugLineNum = 73662505;BA.debugLine="filter=True";
_filter = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=73662506;
 //BA.debugLineNum = 73662506;BA.debugLine="If countfilter=1 Then";
if (_countfilter==1) { 
RDebugUtils.currentLine=73662507;
 //BA.debugLineNum = 73662507;BA.debugLine="str=str.Replace(\" and \",\"\")";
_str = _str.replace(" and ","");
 };
 };
RDebugUtils.currentLine=73662510;
 //BA.debugLineNum = 73662510;BA.debugLine="If SwMojoodi.Checked=True Then";
if (mostCurrent._swmojoodi.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=73662511;
 //BA.debugLineNum = 73662511;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=73662512;
 //BA.debugLineNum = 73662512;BA.debugLine="str= str & \" and SumMande > '0'\"";
_str = _str+" and SumMande > '0'";
RDebugUtils.currentLine=73662513;
 //BA.debugLineNum = 73662513;BA.debugLine="filter=True";
_filter = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=73662514;
 //BA.debugLineNum = 73662514;BA.debugLine="If countfilter=1 Then";
if (_countfilter==1) { 
RDebugUtils.currentLine=73662515;
 //BA.debugLineNum = 73662515;BA.debugLine="str=str.Replace(\" and \",\"\")";
_str = _str.replace(" and ","");
 };
 };
RDebugUtils.currentLine=73662518;
 //BA.debugLineNum = 73662518;BA.debugLine="If SwPic.Checked=True Then";
if (mostCurrent._swpic.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=73662519;
 //BA.debugLineNum = 73662519;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=73662520;
 //BA.debugLineNum = 73662520;BA.debugLine="str= str & \" and fldPathPic <> '0'\"";
_str = _str+" and fldPathPic <> '0'";
RDebugUtils.currentLine=73662521;
 //BA.debugLineNum = 73662521;BA.debugLine="filter=True";
_filter = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=73662522;
 //BA.debugLineNum = 73662522;BA.debugLine="If countfilter=1 Then";
if (_countfilter==1) { 
RDebugUtils.currentLine=73662523;
 //BA.debugLineNum = 73662523;BA.debugLine="str=str.Replace(\" and \",\"\")";
_str = _str.replace(" and ","");
 };
 };
RDebugUtils.currentLine=73662526;
 //BA.debugLineNum = 73662526;BA.debugLine="If filter=True Then";
if (_filter==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=73662529;
 //BA.debugLineNum = 73662529;BA.debugLine="str=\"select * from TblKala where \"&str&\" \"&Str_";
_str = "select * from TblKala where "+_str+" "+mostCurrent._str_sort;
 }else {
RDebugUtils.currentLine=73662531;
 //BA.debugLineNum = 73662531;BA.debugLine="str=\"select * from TblKala  \"&Str_sort";
_str = "select * from TblKala  "+mostCurrent._str_sort;
 };
RDebugUtils.currentLine=73662533;
 //BA.debugLineNum = 73662533;BA.debugLine="Log(str)";
anywheresoftware.b4a.keywords.Common.LogImpl("573662533",_str,0);
 };
RDebugUtils.currentLine=73662536;
 //BA.debugLineNum = 73662536;BA.debugLine="If GroupCodeSelect1<>0 And GroupCodeSelect2=0 The";
if ((mostCurrent._groupcodeselect1).equals(BA.NumberToString(0)) == false && (mostCurrent._groupcodeselect2).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=73662537;
 //BA.debugLineNum = 73662537;BA.debugLine="If TxtSearch.Text.Length>0 And TxtSearch.Text<>\"";
if (mostCurrent._txtsearch.getText().length()>0 && (mostCurrent._txtsearch.getText()).equals(" ") == false && (mostCurrent._txtsearch.getText()).equals("") == false) { 
RDebugUtils.currentLine=73662538;
 //BA.debugLineNum = 73662538;BA.debugLine="Dim Search As String=MCode.ConvertNumbersPersia";
_search = mostCurrent._mcode._convertnumberspersian2english /*String*/ (mostCurrent.activityBA,mostCurrent._txtsearch.getText());
RDebugUtils.currentLine=73662539;
 //BA.debugLineNum = 73662539;BA.debugLine="If Search=\"\" Then";
if ((_search).equals("")) { 
RDebugUtils.currentLine=73662540;
 //BA.debugLineNum = 73662540;BA.debugLine="Search=TxtSearch.Text";
_search = mostCurrent._txtsearch.getText();
 };
RDebugUtils.currentLine=73662542;
 //BA.debugLineNum = 73662542;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=73662543;
 //BA.debugLineNum = 73662543;BA.debugLine="If IsNumber(Search) Then";
if (anywheresoftware.b4a.keywords.Common.IsNumber(_search)) { 
RDebugUtils.currentLine=73662544;
 //BA.debugLineNum = 73662544;BA.debugLine="If Search.Length>5 Then";
if (_search.length()>5) { 
RDebugUtils.currentLine=73662545;
 //BA.debugLineNum = 73662545;BA.debugLine="str = str & $\" and (fldSerial = '${Search}')";
_str = _str+(" and (fldSerial = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_search))+"') ");
 }else {
RDebugUtils.currentLine=73662547;
 //BA.debugLineNum = 73662547;BA.debugLine="str = str & $\" and (fldCodeKala like '%${Sear";
_str = _str+(" and (fldCodeKala like '%"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_search))+"%') ");
 };
 }else {
RDebugUtils.currentLine=73662551;
 //BA.debugLineNum = 73662551;BA.debugLine="str = str & $\" and (fldNameKala like '%${Searc";
_str = _str+(" and (fldNameKala like '%"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_search))+"%') ");
 };
RDebugUtils.currentLine=73662553;
 //BA.debugLineNum = 73662553;BA.debugLine="filter=True";
_filter = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=73662554;
 //BA.debugLineNum = 73662554;BA.debugLine="If countfilter=1 Then";
if (_countfilter==1) { 
RDebugUtils.currentLine=73662555;
 //BA.debugLineNum = 73662555;BA.debugLine="str=str.Replace(\" and \",\"\")";
_str = _str.replace(" and ","");
 };
 };
RDebugUtils.currentLine=73662559;
 //BA.debugLineNum = 73662559;BA.debugLine="If SwGift.Checked=True Then";
if (mostCurrent._swgift.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=73662560;
 //BA.debugLineNum = 73662560;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=73662561;
 //BA.debugLineNum = 73662561;BA.debugLine="str= str & \" and TblKala.fldCodeKala IN(SELECT";
_str = _str+" and TblKala.fldCodeKala IN(SELECT tblEshantionVisitori.fldCodeKala FROM tblEshantionVisitori)";
 };
RDebugUtils.currentLine=73662564;
 //BA.debugLineNum = 73662564;BA.debugLine="If SwTakhfif.Checked=True Then";
if (mostCurrent._swtakhfif.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=73662565;
 //BA.debugLineNum = 73662565;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=73662566;
 //BA.debugLineNum = 73662566;BA.debugLine="str= str & \" and fldFeeBadAzTakhfif <> '0.0000'";
_str = _str+" and fldFeeBadAzTakhfif <> '0.0000'";
 };
RDebugUtils.currentLine=73662570;
 //BA.debugLineNum = 73662570;BA.debugLine="If SwMojoodi.Checked=True Then";
if (mostCurrent._swmojoodi.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=73662571;
 //BA.debugLineNum = 73662571;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=73662572;
 //BA.debugLineNum = 73662572;BA.debugLine="str= str & \" and SumMande > '0'\"";
_str = _str+" and SumMande > '0'";
 };
RDebugUtils.currentLine=73662575;
 //BA.debugLineNum = 73662575;BA.debugLine="If SwPic.Checked=True Then";
if (mostCurrent._swpic.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=73662576;
 //BA.debugLineNum = 73662576;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=73662577;
 //BA.debugLineNum = 73662577;BA.debugLine="str= str & \" and fldPathPic <> '0'\"";
_str = _str+" and fldPathPic <> '0'";
 };
RDebugUtils.currentLine=73662581;
 //BA.debugLineNum = 73662581;BA.debugLine="str=\"select * from TblKala where fldCodeGroup li";
_str = "select * from TblKala where fldCodeGroup like '"+mostCurrent._groupcodeselect1+"%' "+_str+" "+mostCurrent._str_sort;
RDebugUtils.currentLine=73662582;
 //BA.debugLineNum = 73662582;BA.debugLine="Log(str)";
anywheresoftware.b4a.keywords.Common.LogImpl("573662582",_str,0);
 };
RDebugUtils.currentLine=73662585;
 //BA.debugLineNum = 73662585;BA.debugLine="If GroupCodeSelect1<>0 And GroupCodeSelect2<>0 Th";
if ((mostCurrent._groupcodeselect1).equals(BA.NumberToString(0)) == false && (mostCurrent._groupcodeselect2).equals(BA.NumberToString(0)) == false) { 
RDebugUtils.currentLine=73662586;
 //BA.debugLineNum = 73662586;BA.debugLine="If TxtSearch.Text.Length>0 And TxtSearch.Text<>\"";
if (mostCurrent._txtsearch.getText().length()>0 && (mostCurrent._txtsearch.getText()).equals(" ") == false && (mostCurrent._txtsearch.getText()).equals("") == false) { 
RDebugUtils.currentLine=73662587;
 //BA.debugLineNum = 73662587;BA.debugLine="Dim Search As String=MCode.ConvertNumbersPersia";
_search = mostCurrent._mcode._convertnumberspersian2english /*String*/ (mostCurrent.activityBA,mostCurrent._txtsearch.getText());
RDebugUtils.currentLine=73662588;
 //BA.debugLineNum = 73662588;BA.debugLine="If Search=\"\" Then";
if ((_search).equals("")) { 
RDebugUtils.currentLine=73662589;
 //BA.debugLineNum = 73662589;BA.debugLine="Search=TxtSearch.Text";
_search = mostCurrent._txtsearch.getText();
 };
RDebugUtils.currentLine=73662591;
 //BA.debugLineNum = 73662591;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=73662592;
 //BA.debugLineNum = 73662592;BA.debugLine="If IsNumber(Search) Then";
if (anywheresoftware.b4a.keywords.Common.IsNumber(_search)) { 
RDebugUtils.currentLine=73662593;
 //BA.debugLineNum = 73662593;BA.debugLine="If Search.Length>5 Then";
if (_search.length()>5) { 
RDebugUtils.currentLine=73662594;
 //BA.debugLineNum = 73662594;BA.debugLine="str = str & $\" and (fldSerial = '${Search}')";
_str = _str+(" and (fldSerial = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_search))+"') ");
 }else {
RDebugUtils.currentLine=73662596;
 //BA.debugLineNum = 73662596;BA.debugLine="str = str & $\" and (fldCodeKala like '%${Sear";
_str = _str+(" and (fldCodeKala like '%"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_search))+"%') ");
 };
 }else {
RDebugUtils.currentLine=73662600;
 //BA.debugLineNum = 73662600;BA.debugLine="str = str & $\" and (fldNameKala like '%${Searc";
_str = _str+(" and (fldNameKala like '%"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_search))+"%') ");
 };
RDebugUtils.currentLine=73662602;
 //BA.debugLineNum = 73662602;BA.debugLine="filter=True";
_filter = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=73662603;
 //BA.debugLineNum = 73662603;BA.debugLine="If countfilter=1 Then";
if (_countfilter==1) { 
RDebugUtils.currentLine=73662604;
 //BA.debugLineNum = 73662604;BA.debugLine="str=str.Replace(\" and \",\"\")";
_str = _str.replace(" and ","");
 };
 };
RDebugUtils.currentLine=73662608;
 //BA.debugLineNum = 73662608;BA.debugLine="If SwGift.Checked=True Then";
if (mostCurrent._swgift.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=73662609;
 //BA.debugLineNum = 73662609;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=73662610;
 //BA.debugLineNum = 73662610;BA.debugLine="str= str & \" and TblKala.fldCodeKala IN(SELECT";
_str = _str+" and TblKala.fldCodeKala IN(SELECT tblEshantionVisitori.fldCodeKala FROM tblEshantionVisitori)";
 };
RDebugUtils.currentLine=73662613;
 //BA.debugLineNum = 73662613;BA.debugLine="If SwTakhfif.Checked=True Then";
if (mostCurrent._swtakhfif.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=73662614;
 //BA.debugLineNum = 73662614;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=73662615;
 //BA.debugLineNum = 73662615;BA.debugLine="str= str & \" and fldFeeBadAzTakhfif <> '0.0000'";
_str = _str+" and fldFeeBadAzTakhfif <> '0.0000'";
 };
RDebugUtils.currentLine=73662619;
 //BA.debugLineNum = 73662619;BA.debugLine="If SwMojoodi.Checked=True Then";
if (mostCurrent._swmojoodi.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=73662620;
 //BA.debugLineNum = 73662620;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=73662621;
 //BA.debugLineNum = 73662621;BA.debugLine="str= str & \" and SumMande > '0'\"";
_str = _str+" and SumMande > '0'";
 };
RDebugUtils.currentLine=73662624;
 //BA.debugLineNum = 73662624;BA.debugLine="If MCode.NamayeshKalaSefr=0 Then";
if ((mostCurrent._mcode._namayeshkalasefr /*String*/ ).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=73662625;
 //BA.debugLineNum = 73662625;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=73662626;
 //BA.debugLineNum = 73662626;BA.debugLine="str= str & \" and SumMande > '0'\"";
_str = _str+" and SumMande > '0'";
RDebugUtils.currentLine=73662627;
 //BA.debugLineNum = 73662627;BA.debugLine="filter=True";
_filter = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=73662628;
 //BA.debugLineNum = 73662628;BA.debugLine="If countfilter=1 Then";
if (_countfilter==1) { 
RDebugUtils.currentLine=73662629;
 //BA.debugLineNum = 73662629;BA.debugLine="str=str.Replace(\" and \",\"\")";
_str = _str.replace(" and ","");
 };
 };
RDebugUtils.currentLine=73662632;
 //BA.debugLineNum = 73662632;BA.debugLine="If SwPic.Checked=True Then";
if (mostCurrent._swpic.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=73662633;
 //BA.debugLineNum = 73662633;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=73662634;
 //BA.debugLineNum = 73662634;BA.debugLine="str= str & \" and fldPathPic <> '0'\"";
_str = _str+" and fldPathPic <> '0'";
 };
RDebugUtils.currentLine=73662638;
 //BA.debugLineNum = 73662638;BA.debugLine="str=\"select * from TblKala where fldCodeGroup li";
_str = "select * from TblKala where fldCodeGroup like '"+mostCurrent._groupcodeselect2+"%' "+_str+" "+mostCurrent._str_sort;
RDebugUtils.currentLine=73662639;
 //BA.debugLineNum = 73662639;BA.debugLine="Log(str)";
anywheresoftware.b4a.keywords.Common.LogImpl("573662639",_str,0);
 };
RDebugUtils.currentLine=73662642;
 //BA.debugLineNum = 73662642;BA.debugLine="LoadListKala(str)";
_loadlistkala(_str);
RDebugUtils.currentLine=73662644;
 //BA.debugLineNum = 73662644;BA.debugLine="RefreshLblSabad";
_refreshlblsabad();
RDebugUtils.currentLine=73662645;
 //BA.debugLineNum = 73662645;BA.debugLine="End Sub";
return "";
}
public static boolean  _activity_keypress(int _keycode) throws Exception{
RDebugUtils.currentModule="act_sabtmarjooii";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_keypress", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "activity_keypress", new Object[] {_keycode}));}
RDebugUtils.currentLine=74973184;
 //BA.debugLineNum = 74973184;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
RDebugUtils.currentLine=74973186;
 //BA.debugLineNum = 74973186;BA.debugLine="If KeyCode=KeyCodes.KEYCODE_BACK Then";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK) { 
RDebugUtils.currentLine=74973187;
 //BA.debugLineNum = 74973187;BA.debugLine="btn_Back_Click";
_btn_back_click();
RDebugUtils.currentLine=74973188;
 //BA.debugLineNum = 74973188;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 };
RDebugUtils.currentLine=74973190;
 //BA.debugLineNum = 74973190;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=74973191;
 //BA.debugLineNum = 74973191;BA.debugLine="End Sub";
return false;
}
public static String  _btn_back_click() throws Exception{
RDebugUtils.currentModule="act_sabtmarjooii";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_back_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_back_click", null));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu1 = null;
int _res = 0;
RDebugUtils.currentLine=74907648;
 //BA.debugLineNum = 74907648;BA.debugLine="Sub btn_Back_Click";
RDebugUtils.currentLine=74907650;
 //BA.debugLineNum = 74907650;BA.debugLine="Dim Cu1 As Cursor = MCode.Result(\"Select * From T";
_cu1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu1 = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblSabad");
RDebugUtils.currentLine=74907651;
 //BA.debugLineNum = 74907651;BA.debugLine="If Cu1.RowCount>0 Then";
if (_cu1.getRowCount()>0) { 
RDebugUtils.currentLine=74907652;
 //BA.debugLineNum = 74907652;BA.debugLine="Dim Res As Int = Msgbox2(\"با خارج شدن از این صفح";
_res = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("با خارج شدن از این صفحه، سبد خرید شما خالی میشود."+anywheresoftware.b4a.keywords.Common.CRLF+"آیا از این صفحه خارج می شوید؟"),BA.ObjectToCharSequence("توجه"),"بله","","خیر",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=74907653;
 //BA.debugLineNum = 74907653;BA.debugLine="If Res = DialogResponse.POSITIVE Then";
if (_res==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=74907654;
 //BA.debugLineNum = 74907654;BA.debugLine="MCode.SaveUpdate(\"delete from TblSabad\")";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"delete from TblSabad");
 };
 };
RDebugUtils.currentLine=74907657;
 //BA.debugLineNum = 74907657;BA.debugLine="FeeTip=0";
mostCurrent._feetip = BA.NumberToString(0);
RDebugUtils.currentLine=74907658;
 //BA.debugLineNum = 74907658;BA.debugLine="MCode.feeTip=0";
mostCurrent._mcode._feetip /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=74907659;
 //BA.debugLineNum = 74907659;BA.debugLine="MCode.isAmani=0";
mostCurrent._mcode._isamani /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=74907660;
 //BA.debugLineNum = 74907660;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=74907661;
 //BA.debugLineNum = 74907661;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="act_sabtmarjooii";
RDebugUtils.currentLine=73793536;
 //BA.debugLineNum = 73793536;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=73793538;
 //BA.debugLineNum = 73793538;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="act_sabtmarjooii";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=73728000;
 //BA.debugLineNum = 73728000;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=73728002;
 //BA.debugLineNum = 73728002;BA.debugLine="RefreshLblSabad";
_refreshlblsabad();
RDebugUtils.currentLine=73728003;
 //BA.debugLineNum = 73728003;BA.debugLine="End Sub";
return "";
}
public static String  _refreshlblsabad() throws Exception{
RDebugUtils.currentModule="act_sabtmarjooii";
if (Debug.shouldDelegate(mostCurrent.activityBA, "refreshlblsabad", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "refreshlblsabad", null));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
RDebugUtils.currentLine=73990144;
 //BA.debugLineNum = 73990144;BA.debugLine="Sub RefreshLblSabad";
RDebugUtils.currentLine=73990145;
 //BA.debugLineNum = 73990145;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From Tb";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblSabad");
RDebugUtils.currentLine=73990146;
 //BA.debugLineNum = 73990146;BA.debugLine="If Cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=73990147;
 //BA.debugLineNum = 73990147;BA.debugLine="LblBasketCount.Visible=True";
mostCurrent._lblbasketcount.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=73990148;
 //BA.debugLineNum = 73990148;BA.debugLine="LblBasketCount.Text=Cu.RowCount";
mostCurrent._lblbasketcount.setText(BA.ObjectToCharSequence(_cu.getRowCount()));
 }else {
RDebugUtils.currentLine=73990150;
 //BA.debugLineNum = 73990150;BA.debugLine="LblBasketCount.Visible=False";
mostCurrent._lblbasketcount.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=73990152;
 //BA.debugLineNum = 73990152;BA.debugLine="HLV.notifyDataSetChanged";
mostCurrent._hlv.notifyDataSetChanged();
RDebugUtils.currentLine=73990153;
 //BA.debugLineNum = 73990153;BA.debugLine="End Sub";
return "";
}
public static String  _addtosabad(ir.parsikhesab.pakhsh.mcode._adapterlistkala _item) throws Exception{
RDebugUtils.currentModule="act_sabtmarjooii";
if (Debug.shouldDelegate(mostCurrent.activityBA, "addtosabad", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "addtosabad", new Object[] {_item}));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
boolean _check = false;
int _i = 0;
RDebugUtils.currentLine=75694080;
 //BA.debugLineNum = 75694080;BA.debugLine="Sub AddToSabad(Item As AdapterListKala)";
RDebugUtils.currentLine=75694082;
 //BA.debugLineNum = 75694082;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From Tb";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblSabad");
RDebugUtils.currentLine=75694083;
 //BA.debugLineNum = 75694083;BA.debugLine="Dim Check As Boolean";
_check = false;
RDebugUtils.currentLine=75694084;
 //BA.debugLineNum = 75694084;BA.debugLine="For i=0 To Cu.RowCount -1";
{
final int step3 = 1;
final int limit3 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=75694085;
 //BA.debugLineNum = 75694085;BA.debugLine="Cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=75694086;
 //BA.debugLineNum = 75694086;BA.debugLine="If Cu.GetString(\"FldCodeKala\") = Item.CodeKala T";
if ((_cu.GetString("FldCodeKala")).equals(_item.CodeKala /*String*/ )) { 
RDebugUtils.currentLine=75694087;
 //BA.debugLineNum = 75694087;BA.debugLine="If Item.TedadDarSabadJoz = 0 And Item.TedadDarS";
if ((_item.TedadDarSabadJoz /*String*/ ).equals(BA.NumberToString(0)) && (_item.TedadDarSabadKol /*String*/ ).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=75694088;
 //BA.debugLineNum = 75694088;BA.debugLine="MCode.SaveUpdate(\"Delete From TblSabad Where F";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Delete From TblSabad Where FldCodeKala = '"+_item.CodeKala /*String*/ +"'");
 }else {
RDebugUtils.currentLine=75694090;
 //BA.debugLineNum = 75694090;BA.debugLine="MCode.SaveUpdate(\"Update TblSabad Set FldTedad";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Update TblSabad Set FldTedadDarSabadJoz = '"+_item.TedadDarSabadJoz /*String*/ +"',FldTedadDarSabadKol = '"+_item.TedadDarSabadKol /*String*/ +"' Where FldCodeKala = '"+_item.CodeKala /*String*/ +"'");
 };
RDebugUtils.currentLine=75694093;
 //BA.debugLineNum = 75694093;BA.debugLine="Check = True";
_check = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=75694094;
 //BA.debugLineNum = 75694094;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=75694097;
 //BA.debugLineNum = 75694097;BA.debugLine="If Check = False Then";
if (_check==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=75694098;
 //BA.debugLineNum = 75694098;BA.debugLine="MCode.AddToSabad(Item)";
mostCurrent._mcode._addtosabad /*String*/ (mostCurrent.activityBA,_item);
 };
RDebugUtils.currentLine=75694100;
 //BA.debugLineNum = 75694100;BA.debugLine="RefreshLblSabad";
_refreshlblsabad();
RDebugUtils.currentLine=75694101;
 //BA.debugLineNum = 75694101;BA.debugLine="End Sub";
return "";
}
public static boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
RDebugUtils.currentModule="act_sabtmarjooii";
if (Debug.shouldDelegate(mostCurrent.activityBA, "application_error", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "application_error", new Object[] {_error,_stacktrace}));}
RDebugUtils.currentLine=75825152;
 //BA.debugLineNum = 75825152;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
RDebugUtils.currentLine=75825154;
 //BA.debugLineNum = 75825154;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=75825155;
 //BA.debugLineNum = 75825155;BA.debugLine="End Sub";
return false;
}
public static void  _btn_edit_price_click(ir.parsikhesab.pakhsh.mcode._adapterlistkala _item) throws Exception{
RDebugUtils.currentModule="act_sabtmarjooii";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_edit_price_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "btn_edit_price_click", new Object[] {_item}); return;}
ResumableSub_btn_edit_Price_Click rsub = new ResumableSub_btn_edit_Price_Click(null,_item);
rsub.resume(processBA, null);
}
public static class ResumableSub_btn_edit_Price_Click extends BA.ResumableSub {
public ResumableSub_btn_edit_Price_Click(ir.parsikhesab.pakhsh.act_sabtmarjooii parent,ir.parsikhesab.pakhsh.mcode._adapterlistkala _item) {
this.parent = parent;
this._item = _item;
}
ir.parsikhesab.pakhsh.act_sabtmarjooii parent;
ir.parsikhesab.pakhsh.mcode._adapterlistkala _item;
ir.parsikhesab.pakhsh.b4xinputtemplate _input = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rs = null;
int _result = 0;
float _res = 0f;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_sabtmarjooii";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=75497473;
 //BA.debugLineNum = 75497473;BA.debugLine="Dim input As B4XInputTemplate";
_input = new ir.parsikhesab.pakhsh.b4xinputtemplate();
RDebugUtils.currentLine=75497474;
 //BA.debugLineNum = 75497474;BA.debugLine="input.Initialize";
_input._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=75497475;
 //BA.debugLineNum = 75497475;BA.debugLine="input.lblTitle.Text = \"قیمت جدید:\"";
_input._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("قیمت جدید:"));
RDebugUtils.currentLine=75497476;
 //BA.debugLineNum = 75497476;BA.debugLine="input.ConfigureForNumbers(True, True)";
_input._configurefornumbers /*String*/ (null,anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=75497477;
 //BA.debugLineNum = 75497477;BA.debugLine="Dim rs As ResumableSub = Dialog.ShowTemplate(inpu";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = parent.mostCurrent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_input),(Object)("OK"),(Object)(""),(Object)("CANCEL"));
RDebugUtils.currentLine=75497478;
 //BA.debugLineNum = 75497478;BA.debugLine="Dialog.Base.Top = 50%y - Dialog.Base.Height / 2";
parent.mostCurrent._dialog._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTop((int) (anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (50),mostCurrent.activityBA)-parent.mostCurrent._dialog._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2));
RDebugUtils.currentLine=75497479;
 //BA.debugLineNum = 75497479;BA.debugLine="Wait For (rs) Complete (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_sabtmarjooii", "btn_edit_price_click"), _rs);
this.state = 11;
return;
case 11:
//C
this.state = 1;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=75497480;
 //BA.debugLineNum = 75497480;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 10;
if (_result==parent.mostCurrent._xui.DialogResponse_Positive) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=75497481;
 //BA.debugLineNum = 75497481;BA.debugLine="If input.Text=\"\" Then input.Text=0";
if (true) break;

case 4:
//if
this.state = 9;
if ((_input._text /*String*/ ).equals("")) { 
this.state = 6;
;}if (true) break;

case 6:
//C
this.state = 9;
_input._text /*String*/  = BA.NumberToString(0);
if (true) break;

case 9:
//C
this.state = 10;
;
RDebugUtils.currentLine=75497482;
 //BA.debugLineNum = 75497482;BA.debugLine="Dim Res As Float = input.Text 'no need to check";
_res = (float)(Double.parseDouble(_input._text /*String*/ ));
RDebugUtils.currentLine=75497483;
 //BA.debugLineNum = 75497483;BA.debugLine="Item.FeeForoosh=Res";
_item.FeeForoosh /*int*/  = (int) (_res);
RDebugUtils.currentLine=75497485;
 //BA.debugLineNum = 75497485;BA.debugLine="HLV.notifyDataSetChanged";
parent.mostCurrent._hlv.notifyDataSetChanged();
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=75497488;
 //BA.debugLineNum = 75497488;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _btnsearch_click() throws Exception{
RDebugUtils.currentModule="act_sabtmarjooii";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnsearch_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnsearch_click", null));}
RDebugUtils.currentLine=75104256;
 //BA.debugLineNum = 75104256;BA.debugLine="Sub BtnSearch_Click";
RDebugUtils.currentLine=75104258;
 //BA.debugLineNum = 75104258;BA.debugLine="Try";
try {RDebugUtils.currentLine=75104268;
 //BA.debugLineNum = 75104268;BA.debugLine="LoadKala";
_loadkala();
 } 
       catch (Exception e4) {
			processBA.setLastException(e4);RDebugUtils.currentLine=75104270;
 //BA.debugLineNum = 75104270;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("575104270",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=75104271;
 //BA.debugLineNum = 75104271;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-BtnSearch_Click");
 };
RDebugUtils.currentLine=75104273;
 //BA.debugLineNum = 75104273;BA.debugLine="End Sub";
return "";
}
public static String  _btnshowfilterpnl_click() throws Exception{
RDebugUtils.currentModule="act_sabtmarjooii";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnshowfilterpnl_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnshowfilterpnl_click", null));}
RDebugUtils.currentLine=74842112;
 //BA.debugLineNum = 74842112;BA.debugLine="Sub BtnShowFilterPnl_Click";
RDebugUtils.currentLine=74842113;
 //BA.debugLineNum = 74842113;BA.debugLine="If Panel2.Height = Label11.top Then";
if (mostCurrent._panel2.getHeight()==mostCurrent._label11.getTop()) { 
RDebugUtils.currentLine=74842114;
 //BA.debugLineNum = 74842114;BA.debugLine="Panel2.SetLayoutAnimated(500,Panel2.Left,Panel2.";
mostCurrent._panel2.SetLayoutAnimated((int) (500),mostCurrent._panel2.getLeft(),mostCurrent._panel2.getTop(),mostCurrent._panel2.getWidth(),(int) (mostCurrent._lblpoint.getTop()+mostCurrent._lblpoint.getHeight()));
RDebugUtils.currentLine=74842115;
 //BA.debugLineNum = 74842115;BA.debugLine="Pnl_Tools.SetLayoutAnimated(500,Pnl_Tools.Left,P";
mostCurrent._pnl_tools.SetLayoutAnimated((int) (500),mostCurrent._pnl_tools.getLeft(),(int) (mostCurrent._panel2.getTop()+mostCurrent._panel2.getHeight()+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (1),mostCurrent.activityBA)),mostCurrent._pnl_tools.getWidth(),mostCurrent._pnl_tools.getHeight());
RDebugUtils.currentLine=74842116;
 //BA.debugLineNum = 74842116;BA.debugLine="pnl_HLV.SetLayoutAnimated(500,pnl_HLV.Left,Pnl_T";
mostCurrent._pnl_hlv.SetLayoutAnimated((int) (500),mostCurrent._pnl_hlv.getLeft(),(int) (mostCurrent._pnl_tools.getTop()+mostCurrent._pnl_tools.getHeight()),mostCurrent._pnl_hlv.getWidth(),(int) (mostCurrent._pnl_down.getTop()-anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (13),mostCurrent.activityBA)-mostCurrent._pnl_tools.getTop()+mostCurrent._pnl_tools.getHeight()));
RDebugUtils.currentLine=74842117;
 //BA.debugLineNum = 74842117;BA.debugLine="HLV.Height=pnl_HLV.Height";
mostCurrent._hlv.setHeight(mostCurrent._pnl_hlv.getHeight());
 }else {
RDebugUtils.currentLine=74842119;
 //BA.debugLineNum = 74842119;BA.debugLine="Panel2.SetLayoutAnimated(500,Panel2.Left,Panel2.";
mostCurrent._panel2.SetLayoutAnimated((int) (500),mostCurrent._panel2.getLeft(),mostCurrent._panel2.getTop(),mostCurrent._panel2.getWidth(),mostCurrent._label11.getTop());
RDebugUtils.currentLine=74842120;
 //BA.debugLineNum = 74842120;BA.debugLine="Pnl_Tools.SetLayoutAnimated(500,Pnl_Tools.Left,P";
mostCurrent._pnl_tools.SetLayoutAnimated((int) (500),mostCurrent._pnl_tools.getLeft(),(int) (mostCurrent._pnl_top.getTop()+mostCurrent._pnl_top.getHeight()),mostCurrent._pnl_tools.getWidth(),mostCurrent._pnl_tools.getHeight());
RDebugUtils.currentLine=74842121;
 //BA.debugLineNum = 74842121;BA.debugLine="pnl_HLV.SetLayoutAnimated(500,pnl_HLV.Left,Pnl_T";
mostCurrent._pnl_hlv.SetLayoutAnimated((int) (500),mostCurrent._pnl_hlv.getLeft(),(int) (mostCurrent._pnl_tools.getTop()+mostCurrent._pnl_tools.getHeight()),mostCurrent._pnl_hlv.getWidth(),(int) (mostCurrent._pnl_down.getTop()-mostCurrent._pnl_tools.getTop()+mostCurrent._pnl_tools.getHeight()));
RDebugUtils.currentLine=74842122;
 //BA.debugLineNum = 74842122;BA.debugLine="HLV.Height=pnl_HLV.Height - 13%y";
mostCurrent._hlv.setHeight((int) (mostCurrent._pnl_hlv.getHeight()-anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (13),mostCurrent.activityBA)));
 };
RDebugUtils.currentLine=74842124;
 //BA.debugLineNum = 74842124;BA.debugLine="End Sub";
return "";
}
public static String  _btnupdate_click() throws Exception{
RDebugUtils.currentModule="act_sabtmarjooii";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnupdate_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnupdate_click", null));}
RDebugUtils.currentLine=73596928;
 //BA.debugLineNum = 73596928;BA.debugLine="Sub btnUpdate_Click";
RDebugUtils.currentLine=73596930;
 //BA.debugLineNum = 73596930;BA.debugLine="If MCode.IsConnected Then";
if (mostCurrent._mcode._isconnected /*boolean*/ (mostCurrent.activityBA)) { 
RDebugUtils.currentLine=73596931;
 //BA.debugLineNum = 73596931;BA.debugLine="StartService(FirebaseMessaging)";
anywheresoftware.b4a.keywords.Common.StartService(processBA,(Object)(mostCurrent._firebasemessaging.getObject()));
RDebugUtils.currentLine=73596932;
 //BA.debugLineNum = 73596932;BA.debugLine="MCode.page=\"SabtMarjooii\"";
mostCurrent._mcode._page /*String*/  = "SabtMarjooii";
RDebugUtils.currentLine=73596933;
 //BA.debugLineNum = 73596933;BA.debugLine="FirebaseMessaging.mode=\"GetGalleryKala\"";
mostCurrent._firebasemessaging._mode /*String*/  = "GetGalleryKala";
 }else {
RDebugUtils.currentLine=73596935;
 //BA.debugLineNum = 73596935;BA.debugLine="LoadKala";
_loadkala();
 };
RDebugUtils.currentLine=73596937;
 //BA.debugLineNum = 73596937;BA.debugLine="End Sub";
return "";
}
public static int  _hlv_getitemcount() throws Exception{
RDebugUtils.currentModule="act_sabtmarjooii";
if (Debug.shouldDelegate(mostCurrent.activityBA, "hlv_getitemcount", false))
	 {return ((Integer) Debug.delegate(mostCurrent.activityBA, "hlv_getitemcount", null));}
RDebugUtils.currentLine=74186752;
 //BA.debugLineNum = 74186752;BA.debugLine="Sub HLV_GetItemCount As Int 								        '💯 It";
RDebugUtils.currentLine=74186753;
 //BA.debugLineNum = 74186753;BA.debugLine="Return ListKalaTxt.Size";
if (true) return mostCurrent._listkalatxt.getSize();
RDebugUtils.currentLine=74186754;
 //BA.debugLineNum = 74186754;BA.debugLine="End Sub";
return 0;
}
public static String  _hlv_onbindviewholder(anywheresoftware.b4a.objects.PanelWrapper _parent,int _position) throws Exception{
RDebugUtils.currentModule="act_sabtmarjooii";
if (Debug.shouldDelegate(mostCurrent.activityBA, "hlv_onbindviewholder", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "hlv_onbindviewholder", new Object[] {_parent,_position}));}
ir.parsikhesab.pakhsh.mcode._adapterlistkala _item = null;
ir.parsikhesab.pakhsh.cls_recdefultkala _rec = null;
RDebugUtils.currentLine=74317824;
 //BA.debugLineNum = 74317824;BA.debugLine="Sub HLV_onBindViewHolder (Parent As Panel, Positio";
RDebugUtils.currentLine=74317825;
 //BA.debugLineNum = 74317825;BA.debugLine="Dim Item = ListKalaTxt.Get(Position) As AdapterLi";
_item = (ir.parsikhesab.pakhsh.mcode._adapterlistkala)(mostCurrent._listkalatxt.Get(_position));
RDebugUtils.currentLine=74317826;
 //BA.debugLineNum = 74317826;BA.debugLine="Dim rec As CLs_RecDefultKala=Parent.Tag";
_rec = (ir.parsikhesab.pakhsh.cls_recdefultkala)(_parent.getTag());
RDebugUtils.currentLine=74317827;
 //BA.debugLineNum = 74317827;BA.debugLine="rec.Show(Item,Position)";
_rec._show /*void*/ (null,_item,_position);
RDebugUtils.currentLine=74317828;
 //BA.debugLineNum = 74317828;BA.debugLine="Parent.Height=rec.Height";
_parent.setHeight(_rec._getheight /*int*/ (null));
RDebugUtils.currentLine=74317829;
 //BA.debugLineNum = 74317829;BA.debugLine="End Sub";
return "";
}
public static String  _hlv_oncreateviewholder(anywheresoftware.b4a.objects.PanelWrapper _parent,int _viewtype) throws Exception{
RDebugUtils.currentModule="act_sabtmarjooii";
if (Debug.shouldDelegate(mostCurrent.activityBA, "hlv_oncreateviewholder", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "hlv_oncreateviewholder", new Object[] {_parent,_viewtype}));}
ir.parsikhesab.pakhsh.cls_recdefultkala _rec = null;
RDebugUtils.currentLine=74252288;
 //BA.debugLineNum = 74252288;BA.debugLine="Sub HLV_onCreateViewHolder (Parent As Panel, ViewT";
RDebugUtils.currentLine=74252289;
 //BA.debugLineNum = 74252289;BA.debugLine="Dim rec As CLs_RecDefultKala";
_rec = new ir.parsikhesab.pakhsh.cls_recdefultkala();
RDebugUtils.currentLine=74252290;
 //BA.debugLineNum = 74252290;BA.debugLine="rec.Initialize(Me)";
_rec._initialize /*String*/ (null,mostCurrent.activityBA,act_sabtmarjooii.getObject());
RDebugUtils.currentLine=74252291;
 //BA.debugLineNum = 74252291;BA.debugLine="Parent.AddView(rec.Panel,0,0,100%x,rec.Height)";
_parent.AddView((android.view.View)(_rec._getpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ (null).getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),_rec._getheight /*int*/ (null));
RDebugUtils.currentLine=74252292;
 //BA.debugLineNum = 74252292;BA.debugLine="Parent.Tag=rec";
_parent.setTag((Object)(_rec));
RDebugUtils.currentLine=74252293;
 //BA.debugLineNum = 74252293;BA.debugLine="End Sub";
return "";
}
public static void  _img_barcode_click() throws Exception{
RDebugUtils.currentModule="act_sabtmarjooii";
if (Debug.shouldDelegate(mostCurrent.activityBA, "img_barcode_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "img_barcode_click", null); return;}
ResumableSub_Img_barcode_Click rsub = new ResumableSub_Img_barcode_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Img_barcode_Click extends BA.ResumableSub {
public ResumableSub_Img_barcode_Click(ir.parsikhesab.pakhsh.act_sabtmarjooii parent) {
this.parent = parent;
}
ir.parsikhesab.pakhsh.act_sabtmarjooii parent;
boolean _result = false;
String _permission = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_sabtmarjooii";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=74383361;
 //BA.debugLineNum = 74383361;BA.debugLine="Dim Result As Boolean = True";
_result = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=74383362;
 //BA.debugLineNum = 74383362;BA.debugLine="If Not(rp.Check(rp.PERMISSION_CAMERA)) Then";
if (true) break;

case 1:
//if
this.state = 4;
if (anywheresoftware.b4a.keywords.Common.Not(parent._rp.Check(parent._rp.PERMISSION_CAMERA))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=74383363;
 //BA.debugLineNum = 74383363;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_CAMERA)";
parent._rp.CheckAndRequest(processBA,parent._rp.PERMISSION_CAMERA);
RDebugUtils.currentLine=74383364;
 //BA.debugLineNum = 74383364;BA.debugLine="Wait For Activity_PermissionResult (Permission A";
anywheresoftware.b4a.keywords.Common.WaitFor("activity_permissionresult", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_sabtmarjooii", "img_barcode_click"), null);
this.state = 10;
return;
case 10:
//C
this.state = 4;
_permission = (String) result[0];
_result = (Boolean) result[1];
;
 if (true) break;
;
RDebugUtils.currentLine=74383366;
 //BA.debugLineNum = 74383366;BA.debugLine="If Result=False Then";

case 4:
//if
this.state = 9;
if (_result==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=74383367;
 //BA.debugLineNum = 74383367;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=74383369;
 //BA.debugLineNum = 74383369;BA.debugLine="Barcode.BeginScan(\"myzx\")";
parent.mostCurrent._barcode.BeginScan(mostCurrent.activityBA,"myzx");
 if (true) break;

case 9:
//C
this.state = -1;
;
RDebugUtils.currentLine=74383371;
 //BA.debugLineNum = 74383371;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _img_paging_click() throws Exception{
RDebugUtils.currentModule="act_sabtmarjooii";
if (Debug.shouldDelegate(mostCurrent.activityBA, "img_paging_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "img_paging_click", null));}
RDebugUtils.currentLine=74776576;
 //BA.debugLineNum = 74776576;BA.debugLine="Private Sub Img_Paging_Click";
RDebugUtils.currentLine=74776577;
 //BA.debugLineNum = 74776577;BA.debugLine="Act_KalaPaging.listKala=ListKalaTxt";
mostCurrent._act_kalapaging._listkala /*anywheresoftware.b4a.objects.collections.List*/  = mostCurrent._listkalatxt;
RDebugUtils.currentLine=74776578;
 //BA.debugLineNum = 74776578;BA.debugLine="StartActivity(Act_KalaPaging)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._act_kalapaging.getObject()));
RDebugUtils.currentLine=74776579;
 //BA.debugLineNum = 74776579;BA.debugLine="End Sub";
return "";
}
public static String  _img_selectmoshtari_click() throws Exception{
RDebugUtils.currentModule="act_sabtmarjooii";
if (Debug.shouldDelegate(mostCurrent.activityBA, "img_selectmoshtari_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "img_selectmoshtari_click", null));}
RDebugUtils.currentLine=75890688;
 //BA.debugLineNum = 75890688;BA.debugLine="Private Sub Img_SelectMoshtari_Click";
RDebugUtils.currentLine=75890689;
 //BA.debugLineNum = 75890689;BA.debugLine="StartActivity(Act_SelectMantage)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._act_selectmantage.getObject()));
RDebugUtils.currentLine=75890690;
 //BA.debugLineNum = 75890690;BA.debugLine="End Sub";
return "";
}
public static String  _img_sort_click() throws Exception{
RDebugUtils.currentModule="act_sabtmarjooii";
if (Debug.shouldDelegate(mostCurrent.activityBA, "img_sort_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "img_sort_click", null));}
anywheresoftware.b4a.objects.collections.List _lst = null;
int _res = 0;
RDebugUtils.currentLine=75038720;
 //BA.debugLineNum = 75038720;BA.debugLine="Sub Img_sort_Click";
RDebugUtils.currentLine=75038728;
 //BA.debugLineNum = 75038728;BA.debugLine="Dim Lst As List = Array As String(\"کد کالا\",\"نام";
_lst = new anywheresoftware.b4a.objects.collections.List();
_lst = anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"کد کالا","نام کالا نزولی","نام کالا صعودی","ارزان ترین قیمت","گرانترین قیمت","کمترین موجودی","بیشترین موجودی"});
RDebugUtils.currentLine=75038729;
 //BA.debugLineNum = 75038729;BA.debugLine="Dim res As Int = InputList(Lst,\"مرتب سازی براساس:";
_res = anywheresoftware.b4a.keywords.Common.InputList(_lst,BA.ObjectToCharSequence("مرتب سازی براساس:"),(int) (-1),mostCurrent.activityBA);
RDebugUtils.currentLine=75038730;
 //BA.debugLineNum = 75038730;BA.debugLine="Select Case res";
switch (_res) {
case 0: {
RDebugUtils.currentLine=75038732;
 //BA.debugLineNum = 75038732;BA.debugLine="Str_sort = \" Order by fldCodeKala Asc\"";
mostCurrent._str_sort = " Order by fldCodeKala Asc";
 break; }
case 1: {
RDebugUtils.currentLine=75038734;
 //BA.debugLineNum = 75038734;BA.debugLine="Str_sort = \" Order by fldNameKala\"";
mostCurrent._str_sort = " Order by fldNameKala";
 break; }
case 2: {
RDebugUtils.currentLine=75038736;
 //BA.debugLineNum = 75038736;BA.debugLine="Str_sort = \" Order by fldNameKala Desc\"";
mostCurrent._str_sort = " Order by fldNameKala Desc";
 break; }
case 3: {
RDebugUtils.currentLine=75038738;
 //BA.debugLineNum = 75038738;BA.debugLine="Str_sort = \" Order by fldFeeForoosh\"";
mostCurrent._str_sort = " Order by fldFeeForoosh";
 break; }
case 4: {
RDebugUtils.currentLine=75038740;
 //BA.debugLineNum = 75038740;BA.debugLine="Str_sort = \" Order by fldFeeForoosh Desc\"";
mostCurrent._str_sort = " Order by fldFeeForoosh Desc";
 break; }
case 5: {
RDebugUtils.currentLine=75038742;
 //BA.debugLineNum = 75038742;BA.debugLine="Str_sort = \" Order by SumMande\"";
mostCurrent._str_sort = " Order by SumMande";
 break; }
case 6: {
RDebugUtils.currentLine=75038744;
 //BA.debugLineNum = 75038744;BA.debugLine="Str_sort = \" Order by SumMande Desc\"";
mostCurrent._str_sort = " Order by SumMande Desc";
 break; }
}
;
RDebugUtils.currentLine=75038746;
 //BA.debugLineNum = 75038746;BA.debugLine="Log(Str_sort)";
anywheresoftware.b4a.keywords.Common.LogImpl("575038746",mostCurrent._str_sort,0);
RDebugUtils.currentLine=75038748;
 //BA.debugLineNum = 75038748;BA.debugLine="LoadKala";
_loadkala();
RDebugUtils.currentLine=75038749;
 //BA.debugLineNum = 75038749;BA.debugLine="End Sub";
return "";
}
public static void  _img_tipfee_click() throws Exception{
RDebugUtils.currentModule="act_sabtmarjooii";
if (Debug.shouldDelegate(mostCurrent.activityBA, "img_tipfee_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "img_tipfee_click", null); return;}
ResumableSub_Img_TipFee_Click rsub = new ResumableSub_Img_TipFee_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Img_TipFee_Click extends BA.ResumableSub {
public ResumableSub_Img_TipFee_Click(ir.parsikhesab.pakhsh.act_sabtmarjooii parent) {
this.parent = parent;
}
ir.parsikhesab.pakhsh.act_sabtmarjooii parent;
int _btnshow = 0;
anywheresoftware.b4a.objects.collections.List _lst = null;
int _result = 0;
int _res = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_sabtmarjooii";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=75431937;
 //BA.debugLineNum = 75431937;BA.debugLine="Dim btnshow As Int=myCode.getSetting(\"setting.dat";
_btnshow = (int)(Double.parseDouble(parent.mostCurrent._mycode._getsetting /*String*/ (mostCurrent.activityBA,"setting.dat","WSetTip",BA.NumberToString(0))));
RDebugUtils.currentLine=75431938;
 //BA.debugLineNum = 75431938;BA.debugLine="Log(btnshow)";
anywheresoftware.b4a.keywords.Common.LogImpl("575431938",BA.NumberToString(_btnshow),0);
RDebugUtils.currentLine=75431939;
 //BA.debugLineNum = 75431939;BA.debugLine="If btnshow=0 Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_btnshow==0) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=75431940;
 //BA.debugLineNum = 75431940;BA.debugLine="ToastMessageShow(\"دسترسی شما به این گزینه محدود";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("دسترسی شما به این گزینه محدود است"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=75431941;
 //BA.debugLineNum = 75431941;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=75431945;
 //BA.debugLineNum = 75431945;BA.debugLine="Dim Lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=75431946;
 //BA.debugLineNum = 75431946;BA.debugLine="Lst.Initialize2(Array As String(\"تیپ1 (بدون احتسا";
_lst.Initialize2(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"تیپ1 (بدون احتساب تخفیف)","تیپ1 (با احتساب تخفیف)","تیپ قیمت 3","تیپ قیمت 4","تیپ قیمت 5","تیپ قیمت 6","تیپ قیمت 7","تیپ قیمت 8","تیپ قیمت 9","تیپ قیمت 10"}));
RDebugUtils.currentLine=75431947;
 //BA.debugLineNum = 75431947;BA.debugLine="InputListAsync(Lst,\"تیپ قیمت را انتخاب کنید\",FeeT";
anywheresoftware.b4a.keywords.Common.InputListAsync(_lst,BA.ObjectToCharSequence("تیپ قیمت را انتخاب کنید"),(int) ((double)(Double.parseDouble(parent.mostCurrent._feetip))-1),processBA,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=75431948;
 //BA.debugLineNum = 75431948;BA.debugLine="Wait For InputList_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("inputlist_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_sabtmarjooii", "img_tipfee_click"), null);
this.state = 13;
return;
case 13:
//C
this.state = 5;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=75431949;
 //BA.debugLineNum = 75431949;BA.debugLine="If Result <> -3 Then";
if (true) break;

case 5:
//if
this.state = 12;
if (_result!=-3) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=75431950;
 //BA.debugLineNum = 75431950;BA.debugLine="Dim Res As Int=Msgbox2(\"توجه داشته باشید که با ت";
_res = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("توجه داشته باشید که با تغییر تیپ قیمت سبد خرید شما حذف می گردد، آیا می خواهید تیپ قیمت تغییر کند؟"),BA.ObjectToCharSequence("توجه"),"بله","","خیر",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=75431951;
 //BA.debugLineNum = 75431951;BA.debugLine="If Res = DialogResponse.POSITIVE Then";
if (true) break;

case 8:
//if
this.state = 11;
if (_res==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=75431952;
 //BA.debugLineNum = 75431952;BA.debugLine="MCode.SaveUpdate(\"Delete From TblSabad\")";
parent.mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Delete From TblSabad");
RDebugUtils.currentLine=75431953;
 //BA.debugLineNum = 75431953;BA.debugLine="RefreshLblSabad";
_refreshlblsabad();
RDebugUtils.currentLine=75431954;
 //BA.debugLineNum = 75431954;BA.debugLine="FeeTip = Result+1";
parent.mostCurrent._feetip = BA.NumberToString(_result+1);
 if (true) break;

case 11:
//C
this.state = 12;
;
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=75431958;
 //BA.debugLineNum = 75431958;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _lbltedadjoz_click(ir.parsikhesab.pakhsh.mcode._adapterlistkala _item) throws Exception{
RDebugUtils.currentModule="act_sabtmarjooii";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lbltedadjoz_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "lbltedadjoz_click", new Object[] {_item}); return;}
ResumableSub_LblTedadJoz_Click rsub = new ResumableSub_LblTedadJoz_Click(null,_item);
rsub.resume(processBA, null);
}
public static class ResumableSub_LblTedadJoz_Click extends BA.ResumableSub {
public ResumableSub_LblTedadJoz_Click(ir.parsikhesab.pakhsh.act_sabtmarjooii parent,ir.parsikhesab.pakhsh.mcode._adapterlistkala _item) {
this.parent = parent;
this._item = _item;
}
ir.parsikhesab.pakhsh.act_sabtmarjooii parent;
ir.parsikhesab.pakhsh.mcode._adapterlistkala _item;
ir.parsikhesab.pakhsh.b4xinputtemplate _input = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rs = null;
int _result = 0;
float _res = 0f;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_sabtmarjooii";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=75563009;
 //BA.debugLineNum = 75563009;BA.debugLine="Dialog.Title = \"  \"";
parent.mostCurrent._dialog._title /*Object*/  = (Object)("  ");
RDebugUtils.currentLine=75563010;
 //BA.debugLineNum = 75563010;BA.debugLine="Dim input As B4XInputTemplate";
_input = new ir.parsikhesab.pakhsh.b4xinputtemplate();
RDebugUtils.currentLine=75563011;
 //BA.debugLineNum = 75563011;BA.debugLine="input.Initialize";
_input._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=75563012;
 //BA.debugLineNum = 75563012;BA.debugLine="input.lblTitle.Text = \" تعداد \"&Item.NameVahed";
_input._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(" تعداد "+_item.NameVahed /*String*/ ));
RDebugUtils.currentLine=75563013;
 //BA.debugLineNum = 75563013;BA.debugLine="Log(MCode.isFloat)";
anywheresoftware.b4a.keywords.Common.LogImpl("575563013",BA.ObjectToString(parent.mostCurrent._mcode._isfloat /*boolean*/ ),0);
RDebugUtils.currentLine=75563015;
 //BA.debugLineNum = 75563015;BA.debugLine="Select Case MCode.isFloat";
if (true) break;

case 1:
//select
this.state = 6;
switch (BA.switchObjectToInt(parent.mostCurrent._mcode._isfloat /*boolean*/ ,anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.False)) {
case 0: {
this.state = 3;
if (true) break;
}
case 1: {
this.state = 5;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=75563017;
 //BA.debugLineNum = 75563017;BA.debugLine="input.ConfigureForNumbers(True, True)";
_input._configurefornumbers /*String*/ (null,anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=75563019;
 //BA.debugLineNum = 75563019;BA.debugLine="input.ConfigureForNumbers(False, True)";
_input._configurefornumbers /*String*/ (null,anywheresoftware.b4a.keywords.Common.False,anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=75563022;
 //BA.debugLineNum = 75563022;BA.debugLine="Dim rs As ResumableSub =Dialog.ShowTemplate(input";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = parent.mostCurrent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_input),(Object)("OK"),(Object)(""),(Object)("CANCEL"));
RDebugUtils.currentLine=75563023;
 //BA.debugLineNum = 75563023;BA.debugLine="Dialog.Base.Top = 50%y - Dialog.Base.Height / 2";
parent.mostCurrent._dialog._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTop((int) (anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (50),mostCurrent.activityBA)-parent.mostCurrent._dialog._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2));
RDebugUtils.currentLine=75563024;
 //BA.debugLineNum = 75563024;BA.debugLine="Wait For (rs) Complete (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_sabtmarjooii", "lbltedadjoz_click"), _rs);
this.state = 27;
return;
case 27:
//C
this.state = 7;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=75563025;
 //BA.debugLineNum = 75563025;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
if (true) break;

case 7:
//if
this.state = 26;
if (_result==parent.mostCurrent._xui.DialogResponse_Positive) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=75563026;
 //BA.debugLineNum = 75563026;BA.debugLine="Dim res As Float = input.Text 'no need to check";
_res = (float)(Double.parseDouble(_input._text /*String*/ ));
RDebugUtils.currentLine=75563027;
 //BA.debugLineNum = 75563027;BA.debugLine="If res>=0 Then";
if (true) break;

case 10:
//if
this.state = 25;
if (_res>=0) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=75563028;
 //BA.debugLineNum = 75563028;BA.debugLine="If MCode.ForooshBishAzMojoodi = \"1\" Then";
if (true) break;

case 13:
//if
this.state = 24;
if ((parent.mostCurrent._mcode._forooshbishazmojoodi /*String*/ ).equals("1")) { 
this.state = 15;
}else {
this.state = 17;
}if (true) break;

case 15:
//C
this.state = 24;
RDebugUtils.currentLine=75563029;
 //BA.debugLineNum = 75563029;BA.debugLine="Item.SumMande = Item.SumMande - (res-Item.Teda";
_item.SumMande /*String*/  = BA.NumberToString((double)(Double.parseDouble(_item.SumMande /*String*/ ))-(_res-(double)(Double.parseDouble(_item.TedadDarSabadJoz /*String*/ ))));
RDebugUtils.currentLine=75563030;
 //BA.debugLineNum = 75563030;BA.debugLine="Item.TedadDarSabadJoz = res";
_item.TedadDarSabadJoz /*String*/  = BA.NumberToString(_res);
RDebugUtils.currentLine=75563031;
 //BA.debugLineNum = 75563031;BA.debugLine="AddToSabad(Item)";
_addtosabad(_item);
 if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=75563033;
 //BA.debugLineNum = 75563033;BA.debugLine="If (Item.SumMande + Item.TedadDarSabadJoz) >=";
if (true) break;

case 18:
//if
this.state = 23;
if (((double)(Double.parseDouble(_item.SumMande /*String*/ ))+(double)(Double.parseDouble(_item.TedadDarSabadJoz /*String*/ )))>=_res) { 
this.state = 20;
}else {
this.state = 22;
}if (true) break;

case 20:
//C
this.state = 23;
RDebugUtils.currentLine=75563034;
 //BA.debugLineNum = 75563034;BA.debugLine="Item.SumMande = Item.SumMande - (res-Item.Ted";
_item.SumMande /*String*/  = BA.NumberToString((double)(Double.parseDouble(_item.SumMande /*String*/ ))-(_res-(double)(Double.parseDouble(_item.TedadDarSabadJoz /*String*/ ))));
RDebugUtils.currentLine=75563035;
 //BA.debugLineNum = 75563035;BA.debugLine="Item.TedadDarSabadJoz = res";
_item.TedadDarSabadJoz /*String*/  = BA.NumberToString(_res);
RDebugUtils.currentLine=75563036;
 //BA.debugLineNum = 75563036;BA.debugLine="AddToSabad(Item)";
_addtosabad(_item);
 if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=75563038;
 //BA.debugLineNum = 75563038;BA.debugLine="ToastMessageShow(\"سفارش شما بیشتر از موجودی م";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("سفارش شما بیشتر از موجودی می باشد"),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 23:
//C
this.state = 24;
;
 if (true) break;

case 24:
//C
this.state = 25;
;
 if (true) break;

case 25:
//C
this.state = 26;
;
 if (true) break;

case 26:
//C
this.state = -1;
;
RDebugUtils.currentLine=75563044;
 //BA.debugLineNum = 75563044;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _lbltedadkol_click(ir.parsikhesab.pakhsh.mcode._adapterlistkala _item) throws Exception{
RDebugUtils.currentModule="act_sabtmarjooii";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lbltedadkol_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "lbltedadkol_click", new Object[] {_item}); return;}
ResumableSub_LblTedadkol_Click rsub = new ResumableSub_LblTedadkol_Click(null,_item);
rsub.resume(processBA, null);
}
public static class ResumableSub_LblTedadkol_Click extends BA.ResumableSub {
public ResumableSub_LblTedadkol_Click(ir.parsikhesab.pakhsh.act_sabtmarjooii parent,ir.parsikhesab.pakhsh.mcode._adapterlistkala _item) {
this.parent = parent;
this._item = _item;
}
ir.parsikhesab.pakhsh.act_sabtmarjooii parent;
ir.parsikhesab.pakhsh.mcode._adapterlistkala _item;
ir.parsikhesab.pakhsh.b4xinputtemplate _input = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rs = null;
int _result = 0;
float _res = 0f;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_sabtmarjooii";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=75628545;
 //BA.debugLineNum = 75628545;BA.debugLine="Dialog.Title = \"  \"";
parent.mostCurrent._dialog._title /*Object*/  = (Object)("  ");
RDebugUtils.currentLine=75628546;
 //BA.debugLineNum = 75628546;BA.debugLine="Dim input As B4XInputTemplate";
_input = new ir.parsikhesab.pakhsh.b4xinputtemplate();
RDebugUtils.currentLine=75628547;
 //BA.debugLineNum = 75628547;BA.debugLine="input.Initialize";
_input._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=75628548;
 //BA.debugLineNum = 75628548;BA.debugLine="input.lblTitle.Text = \" تعداد \"&Item.NameVahed2";
_input._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(" تعداد "+_item.NameVahed2 /*String*/ ));
RDebugUtils.currentLine=75628549;
 //BA.debugLineNum = 75628549;BA.debugLine="input.ConfigureForNumbers(True, True)";
_input._configurefornumbers /*String*/ (null,anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=75628551;
 //BA.debugLineNum = 75628551;BA.debugLine="Dim rs As ResumableSub =Dialog.ShowTemplate(input";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = parent.mostCurrent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_input),(Object)("OK"),(Object)(""),(Object)("CANCEL"));
RDebugUtils.currentLine=75628552;
 //BA.debugLineNum = 75628552;BA.debugLine="Dialog.Base.Top = 50%y - Dialog.Base.Height / 2";
parent.mostCurrent._dialog._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTop((int) (anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (50),mostCurrent.activityBA)-parent.mostCurrent._dialog._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2));
RDebugUtils.currentLine=75628553;
 //BA.debugLineNum = 75628553;BA.debugLine="Wait For (rs) Complete (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_sabtmarjooii", "lbltedadkol_click"), _rs);
this.state = 21;
return;
case 21:
//C
this.state = 1;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=75628554;
 //BA.debugLineNum = 75628554;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 20;
if (_result==parent.mostCurrent._xui.DialogResponse_Positive) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=75628555;
 //BA.debugLineNum = 75628555;BA.debugLine="Dim res As Float = input.Text 'no need to check";
_res = (float)(Double.parseDouble(_input._text /*String*/ ));
RDebugUtils.currentLine=75628556;
 //BA.debugLineNum = 75628556;BA.debugLine="If res>=0 Then";
if (true) break;

case 4:
//if
this.state = 19;
if (_res>=0) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=75628557;
 //BA.debugLineNum = 75628557;BA.debugLine="If MCode.ForooshBishAzMojoodi = \"1\" Then";
if (true) break;

case 7:
//if
this.state = 18;
if ((parent.mostCurrent._mcode._forooshbishazmojoodi /*String*/ ).equals("1")) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 18;
RDebugUtils.currentLine=75628558;
 //BA.debugLineNum = 75628558;BA.debugLine="Item.SumMande = Item.SumMande - ((res*Item.Ted";
_item.SumMande /*String*/  = BA.NumberToString((double)(Double.parseDouble(_item.SumMande /*String*/ ))-((_res*(double)(Double.parseDouble(_item.TedadDarKarton /*String*/ )))-((double)(Double.parseDouble(_item.TedadDarSabadKol /*String*/ ))*(double)(Double.parseDouble(_item.TedadDarKarton /*String*/ )))));
RDebugUtils.currentLine=75628559;
 //BA.debugLineNum = 75628559;BA.debugLine="Item.TedadDarSabadKol = res";
_item.TedadDarSabadKol /*String*/  = BA.NumberToString(_res);
RDebugUtils.currentLine=75628560;
 //BA.debugLineNum = 75628560;BA.debugLine="AddToSabad(Item)";
_addtosabad(_item);
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=75628562;
 //BA.debugLineNum = 75628562;BA.debugLine="If (Item.SumMande + (Item.TedadDarSabadKol*Ite";
if (true) break;

case 12:
//if
this.state = 17;
if (((double)(Double.parseDouble(_item.SumMande /*String*/ ))+((double)(Double.parseDouble(_item.TedadDarSabadKol /*String*/ ))*(double)(Double.parseDouble(_item.TedadDarKarton /*String*/ ))))>=(_res*(double)(Double.parseDouble(_item.TedadDarKarton /*String*/ )))) { 
this.state = 14;
}else {
this.state = 16;
}if (true) break;

case 14:
//C
this.state = 17;
RDebugUtils.currentLine=75628563;
 //BA.debugLineNum = 75628563;BA.debugLine="Item.SumMande = Item.SumMande - ((res*Item.Te";
_item.SumMande /*String*/  = BA.NumberToString((double)(Double.parseDouble(_item.SumMande /*String*/ ))-((_res*(double)(Double.parseDouble(_item.TedadDarKarton /*String*/ )))-((double)(Double.parseDouble(_item.TedadDarSabadKol /*String*/ ))*(double)(Double.parseDouble(_item.TedadDarKarton /*String*/ )))));
RDebugUtils.currentLine=75628564;
 //BA.debugLineNum = 75628564;BA.debugLine="Item.TedadDarSabadKol = res";
_item.TedadDarSabadKol /*String*/  = BA.NumberToString(_res);
RDebugUtils.currentLine=75628565;
 //BA.debugLineNum = 75628565;BA.debugLine="AddToSabad(Item)";
_addtosabad(_item);
 if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=75628567;
 //BA.debugLineNum = 75628567;BA.debugLine="ToastMessageShow(\"سفارش شما بیشتر از موجودی م";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("سفارش شما بیشتر از موجودی می باشد"),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 17:
//C
this.state = 18;
;
 if (true) break;

case 18:
//C
this.state = 19;
;
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
RDebugUtils.currentLine=75628572;
 //BA.debugLineNum = 75628572;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _loadlistkala(String _query) throws Exception{
RDebugUtils.currentModule="act_sabtmarjooii";
if (Debug.shouldDelegate(mostCurrent.activityBA, "loadlistkala", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "loadlistkala", new Object[] {_query}));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
int _i = 0;
ir.parsikhesab.pakhsh.mcode._adapterlistkala _itemkala = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu1 = null;
int _fldfeeforoosh = 0;
int _fldtedaddarkarton = 0;
int _summande = 0;
RDebugUtils.currentLine=73924608;
 //BA.debugLineNum = 73924608;BA.debugLine="Sub LoadListKala(Query As String)";
RDebugUtils.currentLine=73924609;
 //BA.debugLineNum = 73924609;BA.debugLine="OrginalListKala.Clear";
mostCurrent._orginallistkala.Clear();
RDebugUtils.currentLine=73924610;
 //BA.debugLineNum = 73924610;BA.debugLine="Dim Cu As Cursor = MCode.Result(Query)";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,_query);
RDebugUtils.currentLine=73924611;
 //BA.debugLineNum = 73924611;BA.debugLine="If Cu.RowCount > 0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=73924612;
 //BA.debugLineNum = 73924612;BA.debugLine="ProgressDialogShow(\"لطفا منتظر بمانید\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("لطفا منتظر بمانید"));
RDebugUtils.currentLine=73924613;
 //BA.debugLineNum = 73924613;BA.debugLine="For i = 0 To Cu.RowCount - 1";
{
final int step5 = 1;
final int limit5 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=73924614;
 //BA.debugLineNum = 73924614;BA.debugLine="Dim ItemKala As AdapterListKala";
_itemkala = new ir.parsikhesab.pakhsh.mcode._adapterlistkala();
RDebugUtils.currentLine=73924615;
 //BA.debugLineNum = 73924615;BA.debugLine="Cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=73924616;
 //BA.debugLineNum = 73924616;BA.debugLine="ItemKala.CodeKala=Cu.Getstring(\"fldCodeKala\")";
_itemkala.CodeKala /*String*/  = _cu.GetString("fldCodeKala");
RDebugUtils.currentLine=73924617;
 //BA.debugLineNum = 73924617;BA.debugLine="ItemKala.NameKala=Cu.Getstring(\"fldNameKala\")";
_itemkala.NameKala /*String*/  = _cu.GetString("fldNameKala");
RDebugUtils.currentLine=73924618;
 //BA.debugLineNum = 73924618;BA.debugLine="ItemKala.NameVahed=Cu.Getstring(\"fldNameVahed\")";
_itemkala.NameVahed /*String*/  = _cu.GetString("fldNameVahed");
RDebugUtils.currentLine=73924619;
 //BA.debugLineNum = 73924619;BA.debugLine="ItemKala.NameVahed2=Cu.Getstring(\"fldNameVahed2";
_itemkala.NameVahed2 /*String*/  = _cu.GetString("fldNameVahed2");
RDebugUtils.currentLine=73924620;
 //BA.debugLineNum = 73924620;BA.debugLine="ItemKala.SumMande=Cu.Getstring(\"SumMande\")";
_itemkala.SumMande /*String*/  = _cu.GetString("SumMande");
RDebugUtils.currentLine=73924621;
 //BA.debugLineNum = 73924621;BA.debugLine="Dim cu1 As Cursor=MCode.Result(\"select * from T";
_cu1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu1 = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"select * from TblSabad where FldCodeKala="+_itemkala.CodeKala /*String*/ );
RDebugUtils.currentLine=73924623;
 //BA.debugLineNum = 73924623;BA.debugLine="If cu1.RowCount>0 Then";
if (_cu1.getRowCount()>0) { 
RDebugUtils.currentLine=73924624;
 //BA.debugLineNum = 73924624;BA.debugLine="cu1.Position=0";
_cu1.setPosition((int) (0));
RDebugUtils.currentLine=73924625;
 //BA.debugLineNum = 73924625;BA.debugLine="ItemKala.TedadDarSabadJoz =cu1.Getstring(\"FldT";
_itemkala.TedadDarSabadJoz /*String*/  = _cu1.GetString("FldTedadDarSabadJoz");
RDebugUtils.currentLine=73924626;
 //BA.debugLineNum = 73924626;BA.debugLine="ItemKala.TedadDarSabadKol =cu1.Getstring(\"FldT";
_itemkala.TedadDarSabadKol /*String*/  = _cu1.GetString("FldTedadDarSabadKol");
RDebugUtils.currentLine=73924627;
 //BA.debugLineNum = 73924627;BA.debugLine="ItemKala.FldEshantion=cu1.Getstring(\"FldEshant";
_itemkala.FldEshantion /*String*/  = _cu1.GetString("FldEshantion");
 };
RDebugUtils.currentLine=73924630;
 //BA.debugLineNum = 73924630;BA.debugLine="ItemKala.TedadDarKarton =Cu.Getstring(\"fldTedad";
_itemkala.TedadDarKarton /*String*/  = _cu.GetString("fldTedadDarKarton");
RDebugUtils.currentLine=73924631;
 //BA.debugLineNum = 73924631;BA.debugLine="ItemKala.FeeForoosh=Cu.GetInt(\"fldFeeForoosh\")";
_itemkala.FeeForoosh /*int*/  = _cu.GetInt("fldFeeForoosh");
RDebugUtils.currentLine=73924632;
 //BA.debugLineNum = 73924632;BA.debugLine="ItemKala.FldMablaghMasrafKonande=Cu.GetString(\"";
_itemkala.FldMablaghMasrafKonande /*String*/  = _cu.GetString("fldGhymatMasrafkonande");
RDebugUtils.currentLine=73924635;
 //BA.debugLineNum = 73924635;BA.debugLine="If Cu.GetString(\"fldFeeBadAzTakhfif\")<>Null The";
if (_cu.GetString("fldFeeBadAzTakhfif")!= null) { 
RDebugUtils.currentLine=73924636;
 //BA.debugLineNum = 73924636;BA.debugLine="Log(Cu.GetString(\"fldFeeBadAzTakhfif\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("573924636",_cu.GetString("fldFeeBadAzTakhfif"),0);
RDebugUtils.currentLine=73924637;
 //BA.debugLineNum = 73924637;BA.debugLine="ItemKala.fldFeeBadAzTakhfif=Cu.GetString(\"fldF";
_itemkala.fldFeeBadAzTakhfif /*String*/  = _cu.GetString("fldFeeBadAzTakhfif");
 }else {
RDebugUtils.currentLine=73924639;
 //BA.debugLineNum = 73924639;BA.debugLine="Log(Cu.GetString(\"fldFeeBadAzTakhfif\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("573924639",_cu.GetString("fldFeeBadAzTakhfif"),0);
RDebugUtils.currentLine=73924640;
 //BA.debugLineNum = 73924640;BA.debugLine="Log(\"0\")";
anywheresoftware.b4a.keywords.Common.LogImpl("573924640","0",0);
RDebugUtils.currentLine=73924641;
 //BA.debugLineNum = 73924641;BA.debugLine="ItemKala.fldFeeBadAzTakhfif=\"0\"";
_itemkala.fldFeeBadAzTakhfif /*String*/  = "0";
 };
RDebugUtils.currentLine=73924643;
 //BA.debugLineNum = 73924643;BA.debugLine="ItemKala.fldPathPic=Cu.GetString(\"fldPathPic\")";
_itemkala.fldPathPic /*String*/  = _cu.GetString("fldPathPic");
RDebugUtils.currentLine=73924644;
 //BA.debugLineNum = 73924644;BA.debugLine="ItemKala.FldEshantion=0";
_itemkala.FldEshantion /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=73924646;
 //BA.debugLineNum = 73924646;BA.debugLine="If Cu.Getstring(\"fldNameVahed2\") <> \"\" Then";
if ((_cu.GetString("fldNameVahed2")).equals("") == false) { 
RDebugUtils.currentLine=73924647;
 //BA.debugLineNum = 73924647;BA.debugLine="Dim FldFeeForoosh As Int = MCode.Sf.Val(Cu.Get";
_fldfeeforoosh = (int) (mostCurrent._mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvvvv1(BA.NumberToString(_cu.GetInt("fldFeeForoosh"))));
RDebugUtils.currentLine=73924648;
 //BA.debugLineNum = 73924648;BA.debugLine="Dim FldTedadDarKarton As Int = MCode.Sf.Val(Cu";
_fldtedaddarkarton = (int) (mostCurrent._mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvvvv1(_cu.GetString("fldTedadDarKarton")));
RDebugUtils.currentLine=73924649;
 //BA.debugLineNum = 73924649;BA.debugLine="Dim SumMande As Int = Cu.Getstring(\"SumMande\")";
_summande = (int)(Double.parseDouble(_cu.GetString("SumMande")));
RDebugUtils.currentLine=73924650;
 //BA.debugLineNum = 73924650;BA.debugLine="ItemKala.FeeForooshKarton=FldFeeForoosh * FldT";
_itemkala.FeeForooshKarton /*String*/  = BA.NumberToString(_fldfeeforoosh*_fldtedaddarkarton);
RDebugUtils.currentLine=73924651;
 //BA.debugLineNum = 73924651;BA.debugLine="ItemKala.SumMandeKarton=Round2( SumMande / Fld";
_itemkala.SumMandeKarton /*String*/  = BA.NumberToString(anywheresoftware.b4a.keywords.Common.Round2(_summande/(double)_fldtedaddarkarton,(int) (0)));
 };
RDebugUtils.currentLine=73924653;
 //BA.debugLineNum = 73924653;BA.debugLine="OrginalListKala.Add(ItemKala)";
mostCurrent._orginallistkala.Add((Object)(_itemkala));
RDebugUtils.currentLine=73924654;
 //BA.debugLineNum = 73924654;BA.debugLine="cu1.Close";
_cu1.Close();
 }
};
RDebugUtils.currentLine=73924656;
 //BA.debugLineNum = 73924656;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 };
RDebugUtils.currentLine=73924660;
 //BA.debugLineNum = 73924660;BA.debugLine="ListKalaSp=OrginalListKala";
mostCurrent._listkalasp = mostCurrent._orginallistkala;
RDebugUtils.currentLine=73924661;
 //BA.debugLineNum = 73924661;BA.debugLine="ListKalaTxt=ListKalaSp";
mostCurrent._listkalatxt = mostCurrent._listkalasp;
RDebugUtils.currentLine=73924664;
 //BA.debugLineNum = 73924664;BA.debugLine="HLV.notifyDataSetChanged";
mostCurrent._hlv.notifyDataSetChanged();
RDebugUtils.currentLine=73924665;
 //BA.debugLineNum = 73924665;BA.debugLine="End Sub";
return "";
}
public static String  _myzx_result(String _atype,String _values) throws Exception{
RDebugUtils.currentModule="act_sabtmarjooii";
if (Debug.shouldDelegate(mostCurrent.activityBA, "myzx_result", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "myzx_result", new Object[] {_atype,_values}));}
RDebugUtils.currentLine=74448896;
 //BA.debugLineNum = 74448896;BA.debugLine="Sub myzx_result(atype As String,Values As String)";
RDebugUtils.currentLine=74448897;
 //BA.debugLineNum = 74448897;BA.debugLine="LogColor(\"type:\"&atype&\"values:\"&Values,Colors.re";
anywheresoftware.b4a.keywords.Common.LogImpl("574448897","type:"+_atype+"values:"+_values,anywheresoftware.b4a.keywords.Common.Colors.Red);
RDebugUtils.currentLine=74448900;
 //BA.debugLineNum = 74448900;BA.debugLine="TxtSearch.Text=Values";
mostCurrent._txtsearch.setText(BA.ObjectToCharSequence(_values));
RDebugUtils.currentLine=74448901;
 //BA.debugLineNum = 74448901;BA.debugLine="BtnSearch.Tag=True";
mostCurrent._btnsearch.setTag((Object)(anywheresoftware.b4a.keywords.Common.True));
RDebugUtils.currentLine=74448902;
 //BA.debugLineNum = 74448902;BA.debugLine="End Sub";
return "";
}
public static String  _nicespinner_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="act_sabtmarjooii";
if (Debug.shouldDelegate(mostCurrent.activityBA, "nicespinner_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "nicespinner_itemclick", new Object[] {_position,_value}));}
anywheresoftware.b4a.objects.collections.List _lst = null;
ir.parsikhesab.pakhsh.mcode._adaptergoroohkala _item = null;
String _mc = "";
int _count = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
int _i = 0;
RDebugUtils.currentLine=74055680;
 //BA.debugLineNum = 74055680;BA.debugLine="Sub NiceSpinner_ItemClick (Position As Int, Value";
RDebugUtils.currentLine=74055682;
 //BA.debugLineNum = 74055682;BA.debugLine="Key.HideKeyboard";
mostCurrent._key.HideKeyboard(mostCurrent.activityBA);
RDebugUtils.currentLine=74055685;
 //BA.debugLineNum = 74055685;BA.debugLine="If Position = 0 Then";
if (_position==0) { 
RDebugUtils.currentLine=74055686;
 //BA.debugLineNum = 74055686;BA.debugLine="ListGroohKala.Clear";
mostCurrent._listgroohkala.Clear();
RDebugUtils.currentLine=74055687;
 //BA.debugLineNum = 74055687;BA.debugLine="lstSelectedCodeGroupKala.Clear";
mostCurrent._lstselectedcodegroupkala.Clear();
RDebugUtils.currentLine=74055688;
 //BA.debugLineNum = 74055688;BA.debugLine="NiceSpinner1.Clear";
mostCurrent._nicespinner1.Clear();
RDebugUtils.currentLine=74055689;
 //BA.debugLineNum = 74055689;BA.debugLine="NiceSpinner1.Add(\"همه گروه ها\")";
mostCurrent._nicespinner1.Add("همه گروه ها");
RDebugUtils.currentLine=74055691;
 //BA.debugLineNum = 74055691;BA.debugLine="GroupCodeSelect1=\"0\"";
mostCurrent._groupcodeselect1 = "0";
RDebugUtils.currentLine=74055692;
 //BA.debugLineNum = 74055692;BA.debugLine="GroupNameSelect1=\"\"";
mostCurrent._groupnameselect1 = "";
RDebugUtils.currentLine=74055693;
 //BA.debugLineNum = 74055693;BA.debugLine="GroupCodeSelect2=\"0\"";
mostCurrent._groupcodeselect2 = "0";
RDebugUtils.currentLine=74055694;
 //BA.debugLineNum = 74055694;BA.debugLine="GroupNameSelect2=\"\"";
mostCurrent._groupnameselect2 = "";
RDebugUtils.currentLine=74055695;
 //BA.debugLineNum = 74055695;BA.debugLine="NiceSpinner1.SelectedIndex=0";
mostCurrent._nicespinner1.setSelectedIndex((int) (0));
 }else {
RDebugUtils.currentLine=74055698;
 //BA.debugLineNum = 74055698;BA.debugLine="Dim lst As List=OriginalListGoroohKala";
_lst = new anywheresoftware.b4a.objects.collections.List();
_lst = mostCurrent._originallistgoroohkala;
RDebugUtils.currentLine=74055699;
 //BA.debugLineNum = 74055699;BA.debugLine="Dim Item As AdapterGoroohKala=lst.Get(NiceSpinne";
_item = (ir.parsikhesab.pakhsh.mcode._adaptergoroohkala)(_lst.Get((int) (mostCurrent._nicespinner.getSelectedIndex()-1)));
RDebugUtils.currentLine=74055700;
 //BA.debugLineNum = 74055700;BA.debugLine="Log(Item.FldN_Gorooh)";
anywheresoftware.b4a.keywords.Common.LogImpl("574055700",_item.FldN_Gorooh /*String*/ ,0);
RDebugUtils.currentLine=74055701;
 //BA.debugLineNum = 74055701;BA.debugLine="Log(Item.FldC_Gorooh)";
anywheresoftware.b4a.keywords.Common.LogImpl("574055701",_item.FldC_Gorooh /*String*/ ,0);
RDebugUtils.currentLine=74055702;
 //BA.debugLineNum = 74055702;BA.debugLine="GroupCodeSelect1=Item.FldC_Gorooh";
mostCurrent._groupcodeselect1 = _item.FldC_Gorooh /*String*/ ;
RDebugUtils.currentLine=74055703;
 //BA.debugLineNum = 74055703;BA.debugLine="GroupNameSelect1=Item.FldN_Gorooh";
mostCurrent._groupnameselect1 = _item.FldN_Gorooh /*String*/ ;
RDebugUtils.currentLine=74055704;
 //BA.debugLineNum = 74055704;BA.debugLine="GroupCodeSelect2=\"0\"";
mostCurrent._groupcodeselect2 = "0";
RDebugUtils.currentLine=74055705;
 //BA.debugLineNum = 74055705;BA.debugLine="GroupNameSelect2=\"\"";
mostCurrent._groupnameselect2 = "";
RDebugUtils.currentLine=74055706;
 //BA.debugLineNum = 74055706;BA.debugLine="Dim mc As String=Item.FldC_Gorooh";
_mc = _item.FldC_Gorooh /*String*/ ;
RDebugUtils.currentLine=74055708;
 //BA.debugLineNum = 74055708;BA.debugLine="Dim Count As Int = Item.FldC_Gorooh.Length + 3";
_count = (int) (_item.FldC_Gorooh /*String*/ .length()+3);
RDebugUtils.currentLine=74055709;
 //BA.debugLineNum = 74055709;BA.debugLine="Dim Cu As Cursor=MCode.Result(\"Select FldC_Goroo";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select FldC_Gorooh,FldN_Gorooh From TblGoroohKala where FldC_Gorooh Like '"+_mc+"%' And Length(FldC_Gorooh) = "+BA.NumberToString(_count)+" ORDER BY FldC_Gorooh");
RDebugUtils.currentLine=74055710;
 //BA.debugLineNum = 74055710;BA.debugLine="If Cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=74055711;
 //BA.debugLineNum = 74055711;BA.debugLine="lstSelectedCodeGroupKala.Clear";
mostCurrent._lstselectedcodegroupkala.Clear();
RDebugUtils.currentLine=74055712;
 //BA.debugLineNum = 74055712;BA.debugLine="NiceSpinner1.Clear";
mostCurrent._nicespinner1.Clear();
RDebugUtils.currentLine=74055713;
 //BA.debugLineNum = 74055713;BA.debugLine="NiceSpinner1.Add(\"همه گروه ها\")";
mostCurrent._nicespinner1.Add("همه گروه ها");
RDebugUtils.currentLine=74055714;
 //BA.debugLineNum = 74055714;BA.debugLine="For i=0 To Cu.RowCount-1";
{
final int step28 = 1;
final int limit28 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit28 ;_i = _i + step28 ) {
RDebugUtils.currentLine=74055715;
 //BA.debugLineNum = 74055715;BA.debugLine="Cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=74055716;
 //BA.debugLineNum = 74055716;BA.debugLine="Dim Item As AdapterGoroohKala";
_item = new ir.parsikhesab.pakhsh.mcode._adaptergoroohkala();
RDebugUtils.currentLine=74055717;
 //BA.debugLineNum = 74055717;BA.debugLine="Item.FldC_Gorooh=Cu.GetString(\"FldC_Gorooh\")";
_item.FldC_Gorooh /*String*/  = _cu.GetString("FldC_Gorooh");
RDebugUtils.currentLine=74055718;
 //BA.debugLineNum = 74055718;BA.debugLine="Item.FldN_Gorooh=Cu.GetString(\"FldN_Gorooh\")";
_item.FldN_Gorooh /*String*/  = _cu.GetString("FldN_Gorooh");
RDebugUtils.currentLine=74055719;
 //BA.debugLineNum = 74055719;BA.debugLine="ListGroohKala.Add(Item)";
mostCurrent._listgroohkala.Add((Object)(_item));
RDebugUtils.currentLine=74055720;
 //BA.debugLineNum = 74055720;BA.debugLine="NiceSpinner1.Add(Cu.GetString(\"FldN_Gorooh\"))";
mostCurrent._nicespinner1.Add(_cu.GetString("FldN_Gorooh"));
 }
};
RDebugUtils.currentLine=74055722;
 //BA.debugLineNum = 74055722;BA.debugLine="NiceSpinner1.Show(Colors.blue, 14)";
mostCurrent._nicespinner1.Show(anywheresoftware.b4a.keywords.Common.Colors.Blue,(float) (14));
RDebugUtils.currentLine=74055723;
 //BA.debugLineNum = 74055723;BA.debugLine="NiceSpinner1.SelectedIndex = 0";
mostCurrent._nicespinner1.setSelectedIndex((int) (0));
RDebugUtils.currentLine=74055724;
 //BA.debugLineNum = 74055724;BA.debugLine="lstSelectedCodeGroupKala.Add(GroupCodeSelect1)";
mostCurrent._lstselectedcodegroupkala.Add((Object)(mostCurrent._groupcodeselect1));
 }else {
RDebugUtils.currentLine=74055726;
 //BA.debugLineNum = 74055726;BA.debugLine="ListGroohKala.Clear";
mostCurrent._listgroohkala.Clear();
RDebugUtils.currentLine=74055727;
 //BA.debugLineNum = 74055727;BA.debugLine="lstSelectedCodeGroupKala.Clear";
mostCurrent._lstselectedcodegroupkala.Clear();
RDebugUtils.currentLine=74055728;
 //BA.debugLineNum = 74055728;BA.debugLine="NiceSpinner1.Clear";
mostCurrent._nicespinner1.Clear();
RDebugUtils.currentLine=74055729;
 //BA.debugLineNum = 74055729;BA.debugLine="NiceSpinner1.Add(\"همه گروه ها\")";
mostCurrent._nicespinner1.Add("همه گروه ها");
RDebugUtils.currentLine=74055730;
 //BA.debugLineNum = 74055730;BA.debugLine="GroupCodeSelect2=\"0\"";
mostCurrent._groupcodeselect2 = "0";
RDebugUtils.currentLine=74055731;
 //BA.debugLineNum = 74055731;BA.debugLine="GroupNameSelect2=\"\"";
mostCurrent._groupnameselect2 = "";
RDebugUtils.currentLine=74055732;
 //BA.debugLineNum = 74055732;BA.debugLine="NiceSpinner1.SelectedIndex=0";
mostCurrent._nicespinner1.setSelectedIndex((int) (0));
 };
 };
RDebugUtils.currentLine=74055736;
 //BA.debugLineNum = 74055736;BA.debugLine="LoadKala";
_loadkala();
RDebugUtils.currentLine=74055737;
 //BA.debugLineNum = 74055737;BA.debugLine="Log(\"CodeGroupSelect1: \"&GroupCodeSelect1)";
anywheresoftware.b4a.keywords.Common.LogImpl("574055737","CodeGroupSelect1: "+mostCurrent._groupcodeselect1,0);
RDebugUtils.currentLine=74055738;
 //BA.debugLineNum = 74055738;BA.debugLine="Log(\"postion1: \"&Position)";
anywheresoftware.b4a.keywords.Common.LogImpl("574055738","postion1: "+BA.NumberToString(_position),0);
RDebugUtils.currentLine=74055740;
 //BA.debugLineNum = 74055740;BA.debugLine="End Sub";
return "";
}
public static String  _nicespinner1_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="act_sabtmarjooii";
if (Debug.shouldDelegate(mostCurrent.activityBA, "nicespinner1_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "nicespinner1_itemclick", new Object[] {_position,_value}));}
anywheresoftware.b4a.objects.collections.List _lst = null;
ir.parsikhesab.pakhsh.mcode._adaptergoroohkala _item = null;
String _mc = "";
int _count = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
int _i = 0;
RDebugUtils.currentLine=74121216;
 //BA.debugLineNum = 74121216;BA.debugLine="Sub NiceSpinner1_ItemClick (Position As Int, Value";
RDebugUtils.currentLine=74121217;
 //BA.debugLineNum = 74121217;BA.debugLine="If Position=0 Then";
if (_position==0) { 
RDebugUtils.currentLine=74121219;
 //BA.debugLineNum = 74121219;BA.debugLine="GroupCodeSelect2=lstSelectedCodeGroupKala.Get(ls";
mostCurrent._groupcodeselect2 = BA.ObjectToString(mostCurrent._lstselectedcodegroupkala.Get((int) (mostCurrent._lstselectedcodegroupkala.getSize()-1)));
 }else {
RDebugUtils.currentLine=74121221;
 //BA.debugLineNum = 74121221;BA.debugLine="Dim lst As List=ListGroohKala";
_lst = new anywheresoftware.b4a.objects.collections.List();
_lst = mostCurrent._listgroohkala;
RDebugUtils.currentLine=74121222;
 //BA.debugLineNum = 74121222;BA.debugLine="Dim Item As AdapterGoroohKala=lst.Get(NiceSpinne";
_item = (ir.parsikhesab.pakhsh.mcode._adaptergoroohkala)(_lst.Get((int) (mostCurrent._nicespinner1.getSelectedIndex()-1)));
RDebugUtils.currentLine=74121223;
 //BA.debugLineNum = 74121223;BA.debugLine="GroupCodeSelect2=Item.FldC_Gorooh";
mostCurrent._groupcodeselect2 = _item.FldC_Gorooh /*String*/ ;
RDebugUtils.currentLine=74121225;
 //BA.debugLineNum = 74121225;BA.debugLine="Dim mc As String=Item.FldC_Gorooh";
_mc = _item.FldC_Gorooh /*String*/ ;
RDebugUtils.currentLine=74121227;
 //BA.debugLineNum = 74121227;BA.debugLine="Dim Count As Int = mc.Length + 3";
_count = (int) (_mc.length()+3);
RDebugUtils.currentLine=74121228;
 //BA.debugLineNum = 74121228;BA.debugLine="Dim Cu As Cursor=MCode.Result(\"Select FldC_Goroo";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select FldC_Gorooh,FldN_Gorooh From TblGoroohKala where FldC_Gorooh Like '"+_mc+"%' And Length(FldC_Gorooh) = "+BA.NumberToString(_count)+" ORDER BY FldC_Gorooh");
RDebugUtils.currentLine=74121229;
 //BA.debugLineNum = 74121229;BA.debugLine="If Cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=74121230;
 //BA.debugLineNum = 74121230;BA.debugLine="ListGroohKala.Clear";
mostCurrent._listgroohkala.Clear();
RDebugUtils.currentLine=74121231;
 //BA.debugLineNum = 74121231;BA.debugLine="NiceSpinner1.Clear";
mostCurrent._nicespinner1.Clear();
RDebugUtils.currentLine=74121234;
 //BA.debugLineNum = 74121234;BA.debugLine="lstSelectedCodeGroupKala.Add(Item.FldC_Gorooh)";
mostCurrent._lstselectedcodegroupkala.Add((Object)(_item.FldC_Gorooh /*String*/ ));
RDebugUtils.currentLine=74121237;
 //BA.debugLineNum = 74121237;BA.debugLine="NiceSpinner1.Add(\"همه گروه ها\")";
mostCurrent._nicespinner1.Add("همه گروه ها");
RDebugUtils.currentLine=74121239;
 //BA.debugLineNum = 74121239;BA.debugLine="For i=0 To Cu.RowCount-1";
{
final int step15 = 1;
final int limit15 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit15 ;_i = _i + step15 ) {
RDebugUtils.currentLine=74121240;
 //BA.debugLineNum = 74121240;BA.debugLine="Cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=74121241;
 //BA.debugLineNum = 74121241;BA.debugLine="Dim Item As AdapterGoroohKala";
_item = new ir.parsikhesab.pakhsh.mcode._adaptergoroohkala();
RDebugUtils.currentLine=74121242;
 //BA.debugLineNum = 74121242;BA.debugLine="Item.FldC_Gorooh=Cu.GetString(\"FldC_Gorooh\")";
_item.FldC_Gorooh /*String*/  = _cu.GetString("FldC_Gorooh");
RDebugUtils.currentLine=74121243;
 //BA.debugLineNum = 74121243;BA.debugLine="Item.FldN_Gorooh=Cu.GetString(\"FldN_Gorooh\")";
_item.FldN_Gorooh /*String*/  = _cu.GetString("FldN_Gorooh");
RDebugUtils.currentLine=74121244;
 //BA.debugLineNum = 74121244;BA.debugLine="ListGroohKala.Add(Item)";
mostCurrent._listgroohkala.Add((Object)(_item));
RDebugUtils.currentLine=74121245;
 //BA.debugLineNum = 74121245;BA.debugLine="NiceSpinner1.Add(Cu.GetString(\"FldN_Gorooh\"))";
mostCurrent._nicespinner1.Add(_cu.GetString("FldN_Gorooh"));
 }
};
RDebugUtils.currentLine=74121248;
 //BA.debugLineNum = 74121248;BA.debugLine="NiceSpinner1.Show(Colors.blue, 14)";
mostCurrent._nicespinner1.Show(anywheresoftware.b4a.keywords.Common.Colors.Blue,(float) (14));
RDebugUtils.currentLine=74121249;
 //BA.debugLineNum = 74121249;BA.debugLine="NiceSpinner1.SelectedIndex = 0";
mostCurrent._nicespinner1.setSelectedIndex((int) (0));
 };
 };
RDebugUtils.currentLine=74121252;
 //BA.debugLineNum = 74121252;BA.debugLine="LoadKala";
_loadkala();
RDebugUtils.currentLine=74121253;
 //BA.debugLineNum = 74121253;BA.debugLine="Log(\"CodeGroupSelect2: \"&GroupCodeSelect2)";
anywheresoftware.b4a.keywords.Common.LogImpl("574121253","CodeGroupSelect2: "+mostCurrent._groupcodeselect2,0);
RDebugUtils.currentLine=74121254;
 //BA.debugLineNum = 74121254;BA.debugLine="Log(\"position2: \"&Position)";
anywheresoftware.b4a.keywords.Common.LogImpl("574121254","position2: "+BA.NumberToString(_position),0);
RDebugUtils.currentLine=74121255;
 //BA.debugLineNum = 74121255;BA.debugLine="End Sub";
return "";
}
public static String  _numbersearch_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="act_sabtmarjooii";
if (Debug.shouldDelegate(mostCurrent.activityBA, "numbersearch_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "numbersearch_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=74514432;
 //BA.debugLineNum = 74514432;BA.debugLine="Sub NumberSearch_TextChanged (Old As String, New A";
RDebugUtils.currentLine=74514433;
 //BA.debugLineNum = 74514433;BA.debugLine="LoadKala";
_loadkala();
RDebugUtils.currentLine=74514434;
 //BA.debugLineNum = 74514434;BA.debugLine="End Sub";
return "";
}
public static String  _pnl_down_click() throws Exception{
RDebugUtils.currentModule="act_sabtmarjooii";
if (Debug.shouldDelegate(mostCurrent.activityBA, "pnl_down_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "pnl_down_click", null));}
RDebugUtils.currentLine=75759616;
 //BA.debugLineNum = 75759616;BA.debugLine="Sub Pnl_Down_Click";
RDebugUtils.currentLine=75759617;
 //BA.debugLineNum = 75759617;BA.debugLine="If LblBasketCount.Visible Then";
if (mostCurrent._lblbasketcount.getVisible()) { 
RDebugUtils.currentLine=75759618;
 //BA.debugLineNum = 75759618;BA.debugLine="StartActivity(Act_Sabad)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._act_sabad.getObject()));
RDebugUtils.currentLine=75759619;
 //BA.debugLineNum = 75759619;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 }else {
RDebugUtils.currentLine=75759621;
 //BA.debugLineNum = 75759621;BA.debugLine="ToastMessageShow(\"سبد خرید خالی است\",False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("سبد خرید خالی است"),anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=75759623;
 //BA.debugLineNum = 75759623;BA.debugLine="End Sub";
return "";
}
public static String  _pnltedad_click() throws Exception{
RDebugUtils.currentModule="act_sabtmarjooii";
if (Debug.shouldDelegate(mostCurrent.activityBA, "pnltedad_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "pnltedad_click", null));}
RDebugUtils.currentLine=74579968;
 //BA.debugLineNum = 74579968;BA.debugLine="Sub PnlTedad_Click";
RDebugUtils.currentLine=74579970;
 //BA.debugLineNum = 74579970;BA.debugLine="End Sub";
return "";
}
public static String  _swgift_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="act_sabtmarjooii";
if (Debug.shouldDelegate(mostCurrent.activityBA, "swgift_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "swgift_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=75169792;
 //BA.debugLineNum = 75169792;BA.debugLine="Sub SwGift_CheckedChange(Checked As Boolean)";
RDebugUtils.currentLine=75169793;
 //BA.debugLineNum = 75169793;BA.debugLine="LoadKala";
_loadkala();
RDebugUtils.currentLine=75169794;
 //BA.debugLineNum = 75169794;BA.debugLine="End Sub";
return "";
}
public static String  _swmojoodi_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="act_sabtmarjooii";
if (Debug.shouldDelegate(mostCurrent.activityBA, "swmojoodi_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "swmojoodi_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=75300864;
 //BA.debugLineNum = 75300864;BA.debugLine="Sub SwMojoodi_CheckedChange(Checked As Boolean)";
RDebugUtils.currentLine=75300865;
 //BA.debugLineNum = 75300865;BA.debugLine="LoadKala";
_loadkala();
RDebugUtils.currentLine=75300866;
 //BA.debugLineNum = 75300866;BA.debugLine="End Sub";
return "";
}
public static String  _swpic_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="act_sabtmarjooii";
if (Debug.shouldDelegate(mostCurrent.activityBA, "swpic_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "swpic_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=75366400;
 //BA.debugLineNum = 75366400;BA.debugLine="Sub SwPic_CheckedChange(Checked As Boolean)";
RDebugUtils.currentLine=75366402;
 //BA.debugLineNum = 75366402;BA.debugLine="LoadKala";
_loadkala();
RDebugUtils.currentLine=75366403;
 //BA.debugLineNum = 75366403;BA.debugLine="End Sub";
return "";
}
public static String  _swtakhfif_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="act_sabtmarjooii";
if (Debug.shouldDelegate(mostCurrent.activityBA, "swtakhfif_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "swtakhfif_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=75235328;
 //BA.debugLineNum = 75235328;BA.debugLine="Sub SwTakhfif_CheckedChange(Checked As Boolean)";
RDebugUtils.currentLine=75235329;
 //BA.debugLineNum = 75235329;BA.debugLine="LoadKala";
_loadkala();
RDebugUtils.currentLine=75235330;
 //BA.debugLineNum = 75235330;BA.debugLine="End Sub";
return "";
}
public static String  _t_search_tick() throws Exception{
RDebugUtils.currentModule="act_sabtmarjooii";
if (Debug.shouldDelegate(mostCurrent.activityBA, "t_search_tick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "t_search_tick", null));}
RDebugUtils.currentLine=74711040;
 //BA.debugLineNum = 74711040;BA.debugLine="Private Sub t_search_Tick";
RDebugUtils.currentLine=74711041;
 //BA.debugLineNum = 74711041;BA.debugLine="t_search.Enabled=False";
_t_search.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=74711042;
 //BA.debugLineNum = 74711042;BA.debugLine="BtnSearch_Click";
_btnsearch_click();
RDebugUtils.currentLine=74711043;
 //BA.debugLineNum = 74711043;BA.debugLine="End Sub";
return "";
}
public static String  _txtsearch_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="act_sabtmarjooii";
if (Debug.shouldDelegate(mostCurrent.activityBA, "txtsearch_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "txtsearch_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=74645504;
 //BA.debugLineNum = 74645504;BA.debugLine="Sub TxtSearch_TextChanged (Old As String, New As S";
RDebugUtils.currentLine=74645506;
 //BA.debugLineNum = 74645506;BA.debugLine="t_search.Enabled=True";
_t_search.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=74645507;
 //BA.debugLineNum = 74645507;BA.debugLine="End Sub";
return "";
}
}