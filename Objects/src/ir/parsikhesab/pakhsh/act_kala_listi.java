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

public class act_kala_listi extends Activity implements B4AActivity{
	public static act_kala_listi mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.act_kala_listi");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (act_kala_listi).");
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
		activityBA = new BA(this, layout, processBA, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.act_kala_listi");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "ir.parsikhesab.pakhsh.act_kala_listi", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (act_kala_listi) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (act_kala_listi) Resume **");
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
		return act_kala_listi.class;
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
            BA.LogInfo("** Activity (act_kala_listi) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (act_kala_listi) Pause event (activity is not paused). **");
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
            act_kala_listi mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (act_kala_listi) Resume **");
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
public anywheresoftware.b4a.objects.LabelWrapper _label5 = null;
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
public anywheresoftware.b4a.objects.LabelWrapper _lbl_bascket = null;
public anywheresoftware.b4a.objects.collections.List _listgoroohkala = null;
public anywheresoftware.b4a.objects.collections.List _originallistgoroohkala = null;
public static String _groupcodeselect1 = "";
public static String _groupnameselect1 = "";
public static String _groupcodeselect2 = "";
public static String _groupnameselect2 = "";
public anywheresoftware.b4a.objects.collections.List _lstselectedcodegroupkala = null;
public anywheresoftware.b4a.objects.collections.List _listtasvie = null;
public ir.parsikhesab.pakhsh.b4xcombobox _cmbbox1 = null;
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
RDebugUtils.currentModule="act_kala_listi";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
anywheresoftware.b4a.objects.drawable.ColorDrawable _op = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _op1 = null;
RDebugUtils.currentLine=31588352;
 //BA.debugLineNum = 31588352;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=31588353;
 //BA.debugLineNum = 31588353;BA.debugLine="Activity.LoadLayout(\"l_kalalisti\")";
mostCurrent._activity.LoadLayout("l_kalalisti",mostCurrent.activityBA);
RDebugUtils.currentLine=31588354;
 //BA.debugLineNum = 31588354;BA.debugLine="Try";
try {RDebugUtils.currentLine=31588355;
 //BA.debugLineNum = 31588355;BA.debugLine="lstSelectedCodeGroupKala.Initialize";
mostCurrent._lstselectedcodegroupkala.Initialize();
RDebugUtils.currentLine=31588357;
 //BA.debugLineNum = 31588357;BA.debugLine="HLV.Initializer(\"HLV\").ListView.Build";
mostCurrent._hlv.Initializer(mostCurrent.activityBA,"HLV").ListView().Build();
RDebugUtils.currentLine=31588358;
 //BA.debugLineNum = 31588358;BA.debugLine="pnl_HLV.AddView(HLV,0,0,100%x,pnl_HLV.Height)";
mostCurrent._pnl_hlv.AddView((android.view.View)(mostCurrent._hlv.getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),mostCurrent._pnl_hlv.getHeight());
RDebugUtils.currentLine=31588359;
 //BA.debugLineNum = 31588359;BA.debugLine="Key.Initialize(\"Key\")";
mostCurrent._key.Initialize("Key");
RDebugUtils.currentLine=31588360;
 //BA.debugLineNum = 31588360;BA.debugLine="MCode.page = \"Kala_listi\"";
mostCurrent._mcode._page /*String*/  = "Kala_listi";
RDebugUtils.currentLine=31588362;
 //BA.debugLineNum = 31588362;BA.debugLine="Dialog.Initialize (Activity)";
mostCurrent._dialog._initialize /*String*/ (null,mostCurrent.activityBA,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(mostCurrent._activity.getObject())));
RDebugUtils.currentLine=31588363;
 //BA.debugLineNum = 31588363;BA.debugLine="ListGoroohKala.Initialize";
mostCurrent._listgoroohkala.Initialize();
RDebugUtils.currentLine=31588364;
 //BA.debugLineNum = 31588364;BA.debugLine="OriginalListGoroohKala.Initialize";
mostCurrent._originallistgoroohkala.Initialize();
RDebugUtils.currentLine=31588365;
 //BA.debugLineNum = 31588365;BA.debugLine="NiceSpinner.Initialize(\"NiceSpinner\",True,True)";
mostCurrent._nicespinner.Initialize(mostCurrent.activityBA,"NiceSpinner",anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=31588367;
 //BA.debugLineNum = 31588367;BA.debugLine="Panel2.AddView(NiceSpinner,B4XComboBox1.mBase.Lef";
mostCurrent._panel2.AddView((android.view.View)(mostCurrent._nicespinner.getObject()),mostCurrent._b4xcombobox1._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft(),mostCurrent._b4xcombobox1._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop(),mostCurrent._b4xcombobox1._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),mostCurrent._b4xcombobox1._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=31588368;
 //BA.debugLineNum = 31588368;BA.debugLine="NiceSpinner.TextColor = Colors.Black";
mostCurrent._nicespinner.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=31588369;
 //BA.debugLineNum = 31588369;BA.debugLine="NiceSpinner.Gravity = Gravity.CENTER_HORIZONTAL";
mostCurrent._nicespinner.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL);
RDebugUtils.currentLine=31588370;
 //BA.debugLineNum = 31588370;BA.debugLine="NiceSpinner.Typeface = Typeface.LoadFromAssets(\"p";
mostCurrent._nicespinner.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("p_font.ttf"));
RDebugUtils.currentLine=31588371;
 //BA.debugLineNum = 31588371;BA.debugLine="Dim op As ColorDrawable";
_op = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=31588372;
 //BA.debugLineNum = 31588372;BA.debugLine="op.Initialize2(Colors.White,8dip,2dip,Colors.Blac";
_op.Initialize2(anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (8)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2)),anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=31588373;
 //BA.debugLineNum = 31588373;BA.debugLine="NiceSpinner.Background=op";
mostCurrent._nicespinner.setBackground((android.graphics.drawable.Drawable)(_op.getObject()));
RDebugUtils.currentLine=31588375;
 //BA.debugLineNum = 31588375;BA.debugLine="NiceSpinner1.Initialize(\"NiceSpinner1\",True,True)";
mostCurrent._nicespinner1.Initialize(mostCurrent.activityBA,"NiceSpinner1",anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=31588377;
 //BA.debugLineNum = 31588377;BA.debugLine="Panel2.AddView(NiceSpinner1,B4XComboBox2.mBase.Le";
mostCurrent._panel2.AddView((android.view.View)(mostCurrent._nicespinner1.getObject()),mostCurrent._b4xcombobox2._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft(),mostCurrent._b4xcombobox2._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop(),mostCurrent._b4xcombobox2._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),mostCurrent._b4xcombobox2._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=31588378;
 //BA.debugLineNum = 31588378;BA.debugLine="NiceSpinner1.TextColor = Colors.Black";
mostCurrent._nicespinner1.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=31588379;
 //BA.debugLineNum = 31588379;BA.debugLine="NiceSpinner1.Gravity = Gravity.CENTER_HORIZONTAL";
mostCurrent._nicespinner1.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL);
RDebugUtils.currentLine=31588380;
 //BA.debugLineNum = 31588380;BA.debugLine="NiceSpinner1.Typeface = Typeface.LoadFromAssets(\"";
mostCurrent._nicespinner1.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("p_font.ttf"));
RDebugUtils.currentLine=31588381;
 //BA.debugLineNum = 31588381;BA.debugLine="Dim op1 As ColorDrawable";
_op1 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=31588382;
 //BA.debugLineNum = 31588382;BA.debugLine="op1.Initialize2(Colors.White,8dip,2dip,Colors.Bla";
_op1.Initialize2(anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (8)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2)),anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=31588383;
 //BA.debugLineNum = 31588383;BA.debugLine="NiceSpinner1.Background=op1";
mostCurrent._nicespinner1.setBackground((android.graphics.drawable.Drawable)(_op1.getObject()));
RDebugUtils.currentLine=31588384;
 //BA.debugLineNum = 31588384;BA.debugLine="NiceSpinner1.Add(\"همه گروه ها\")";
mostCurrent._nicespinner1.Add("همه گروه ها");
RDebugUtils.currentLine=31588386;
 //BA.debugLineNum = 31588386;BA.debugLine="ListGroohKala.Initialize";
mostCurrent._listgroohkala.Initialize();
RDebugUtils.currentLine=31588387;
 //BA.debugLineNum = 31588387;BA.debugLine="OrginalListKala.Initialize";
mostCurrent._orginallistkala.Initialize();
RDebugUtils.currentLine=31588388;
 //BA.debugLineNum = 31588388;BA.debugLine="ListKalaSp.Initialize";
mostCurrent._listkalasp.Initialize();
RDebugUtils.currentLine=31588389;
 //BA.debugLineNum = 31588389;BA.debugLine="ListKalaTxt.Initialize";
mostCurrent._listkalatxt.Initialize();
RDebugUtils.currentLine=31588391;
 //BA.debugLineNum = 31588391;BA.debugLine="LoadAcSpGroohKala";
_loadacspgroohkala();
RDebugUtils.currentLine=31588395;
 //BA.debugLineNum = 31588395;BA.debugLine="HLV.Show";
mostCurrent._hlv.Show();
RDebugUtils.currentLine=31588408;
 //BA.debugLineNum = 31588408;BA.debugLine="ListTasvie.Initialize";
mostCurrent._listtasvie.Initialize();
RDebugUtils.currentLine=31588409;
 //BA.debugLineNum = 31588409;BA.debugLine="ListTasvie=MCode.LoadAcSpNoeTasvie";
mostCurrent._listtasvie = mostCurrent._mcode._loadacspnoetasvie /*anywheresoftware.b4a.objects.collections.List*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=31588410;
 //BA.debugLineNum = 31588410;BA.debugLine="LoadNoeTasvie";
_loadnoetasvie();
 } 
       catch (Exception e38) {
			processBA.setLastException(e38);RDebugUtils.currentLine=31588414;
 //BA.debugLineNum = 31588414;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("531588414",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=31588415;
 //BA.debugLineNum = 31588415;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-Activity_Create");
 };
RDebugUtils.currentLine=31588419;
 //BA.debugLineNum = 31588419;BA.debugLine="End Sub";
return "";
}
public static String  _loadacspgroohkala() throws Exception{
RDebugUtils.currentModule="act_kala_listi";
if (Debug.shouldDelegate(mostCurrent.activityBA, "loadacspgroohkala", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "loadacspgroohkala", null));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _dt = null;
int _i = 0;
ir.parsikhesab.pakhsh.mcode._adaptergoroohkala _item = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
RDebugUtils.currentLine=31916032;
 //BA.debugLineNum = 31916032;BA.debugLine="Sub LoadAcSpGroohKala";
RDebugUtils.currentLine=31916033;
 //BA.debugLineNum = 31916033;BA.debugLine="Dim Dt As Cursor = MCode.Result(\"Select FldC_Goro";
_dt = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_dt = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select FldC_Gorooh,FldN_Gorooh From TblGoroohKala where Length(FldC_Gorooh) = 3 ORDER BY FldC_Gorooh");
RDebugUtils.currentLine=31916034;
 //BA.debugLineNum = 31916034;BA.debugLine="NiceSpinner.Add(\"همه گروه ها\")";
mostCurrent._nicespinner.Add("همه گروه ها");
RDebugUtils.currentLine=31916035;
 //BA.debugLineNum = 31916035;BA.debugLine="For i=0 To Dt.RowCount-1";
{
final int step3 = 1;
final int limit3 = (int) (_dt.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=31916036;
 //BA.debugLineNum = 31916036;BA.debugLine="Dt.Position=i";
_dt.setPosition(_i);
RDebugUtils.currentLine=31916037;
 //BA.debugLineNum = 31916037;BA.debugLine="Dim Item As AdapterGoroohKala";
_item = new ir.parsikhesab.pakhsh.mcode._adaptergoroohkala();
RDebugUtils.currentLine=31916038;
 //BA.debugLineNum = 31916038;BA.debugLine="Dim cu As Cursor";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=31916040;
 //BA.debugLineNum = 31916040;BA.debugLine="cu=MCode.Result(\"Select fldCodeKala From TblKala";
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select fldCodeKala From TblKala where fldCodeGroup like '"+_dt.GetString("FldC_Gorooh")+"%'");
RDebugUtils.currentLine=31916041;
 //BA.debugLineNum = 31916041;BA.debugLine="If cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=31916042;
 //BA.debugLineNum = 31916042;BA.debugLine="Item.FldC_Gorooh= Dt.GetString(\"FldC_Gorooh\")";
_item.FldC_Gorooh /*String*/  = _dt.GetString("FldC_Gorooh");
RDebugUtils.currentLine=31916043;
 //BA.debugLineNum = 31916043;BA.debugLine="Item.FldN_Gorooh= Dt.GetString(\"FldN_Gorooh\")";
_item.FldN_Gorooh /*String*/  = _dt.GetString("FldN_Gorooh");
RDebugUtils.currentLine=31916044;
 //BA.debugLineNum = 31916044;BA.debugLine="OriginalListGoroohKala.Add(Item)";
mostCurrent._originallistgoroohkala.Add((Object)(_item));
RDebugUtils.currentLine=31916045;
 //BA.debugLineNum = 31916045;BA.debugLine="NiceSpinner.Add(Item.FldN_Gorooh)";
mostCurrent._nicespinner.Add(_item.FldN_Gorooh /*String*/ );
 };
 }
};
RDebugUtils.currentLine=31916049;
 //BA.debugLineNum = 31916049;BA.debugLine="NiceSpinner.Show(Colors.blue, 14)";
mostCurrent._nicespinner.Show(anywheresoftware.b4a.keywords.Common.Colors.Blue,(float) (14));
RDebugUtils.currentLine=31916050;
 //BA.debugLineNum = 31916050;BA.debugLine="End Sub";
return "";
}
public static String  _loadnoetasvie() throws Exception{
RDebugUtils.currentModule="act_kala_listi";
if (Debug.shouldDelegate(mostCurrent.activityBA, "loadnoetasvie", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "loadnoetasvie", null));}
ir.parsikhesab.pakhsh.mcode._adapterlistnoetasvie _itemtasvie = null;
int _count = 0;
int _i = 0;
RDebugUtils.currentLine=34144256;
 //BA.debugLineNum = 34144256;BA.debugLine="Sub LoadNoeTasvie";
RDebugUtils.currentLine=34144258;
 //BA.debugLineNum = 34144258;BA.debugLine="Dim ItemTasvie As AdapterListNoeTasvie";
_itemtasvie = new ir.parsikhesab.pakhsh.mcode._adapterlistnoetasvie();
RDebugUtils.currentLine=34144259;
 //BA.debugLineNum = 34144259;BA.debugLine="ItemTasvie.Initialize";
_itemtasvie.Initialize();
RDebugUtils.currentLine=34144260;
 //BA.debugLineNum = 34144260;BA.debugLine="CmbBox1.cmbBox.Add(\"انتخاب کنید\")";
mostCurrent._cmbbox1._cmbbox /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add("انتخاب کنید");
RDebugUtils.currentLine=34144261;
 //BA.debugLineNum = 34144261;BA.debugLine="Dim count As Int =ListTasvie.Size-1";
_count = (int) (mostCurrent._listtasvie.getSize()-1);
RDebugUtils.currentLine=34144262;
 //BA.debugLineNum = 34144262;BA.debugLine="If count> 0 Then";
if (_count>0) { 
RDebugUtils.currentLine=34144263;
 //BA.debugLineNum = 34144263;BA.debugLine="For i = 0 To count";
{
final int step6 = 1;
final int limit6 = _count;
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=34144264;
 //BA.debugLineNum = 34144264;BA.debugLine="ItemTasvie=ListTasvie.Get(i)";
_itemtasvie = (ir.parsikhesab.pakhsh.mcode._adapterlistnoetasvie)(mostCurrent._listtasvie.Get(_i));
RDebugUtils.currentLine=34144266;
 //BA.debugLineNum = 34144266;BA.debugLine="CmbBox1.cmbBox.Add(ItemTasvie.FldN_Tasvie)";
mostCurrent._cmbbox1._cmbbox /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add(_itemtasvie.FldN_Tasvie /*String*/ );
 }
};
RDebugUtils.currentLine=34144268;
 //BA.debugLineNum = 34144268;BA.debugLine="CmbBox1.SelectedIndex=MCode.feeTip";
mostCurrent._cmbbox1._setselectedindex /*int*/ (null,(int)(Double.parseDouble(mostCurrent._mcode._feetip /*String*/ )));
 };
RDebugUtils.currentLine=34144270;
 //BA.debugLineNum = 34144270;BA.debugLine="End Sub";
return "";
}
public static boolean  _activity_keypress(int _keycode) throws Exception{
RDebugUtils.currentModule="act_kala_listi";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_keypress", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "activity_keypress", new Object[] {_keycode}));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu1 = null;
int _res = 0;
RDebugUtils.currentLine=33030144;
 //BA.debugLineNum = 33030144;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
RDebugUtils.currentLine=33030145;
 //BA.debugLineNum = 33030145;BA.debugLine="If KeyCode=KeyCodes.KEYCODE_BACK Then";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK) { 
RDebugUtils.currentLine=33030146;
 //BA.debugLineNum = 33030146;BA.debugLine="Dim Cu1 As Cursor = MCode.Result(\"Select * From";
_cu1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu1 = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblSabad");
RDebugUtils.currentLine=33030147;
 //BA.debugLineNum = 33030147;BA.debugLine="If Cu1.RowCount>0 Then";
if (_cu1.getRowCount()>0) { 
RDebugUtils.currentLine=33030148;
 //BA.debugLineNum = 33030148;BA.debugLine="Dim Res As Int = Msgbox2(\"با خارج شدن از این صف";
_res = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("با خارج شدن از این صفحه، سبد خرید شما خالی میشود."+anywheresoftware.b4a.keywords.Common.CRLF+"آیا از این صفحه خارج می شوید؟"),BA.ObjectToCharSequence("توجه"),"بله","","خیر",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=33030149;
 //BA.debugLineNum = 33030149;BA.debugLine="If Res = DialogResponse.POSITIVE Then";
if (_res==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=33030150;
 //BA.debugLineNum = 33030150;BA.debugLine="btn_Back_Click";
_btn_back_click();
 };
 }else {
RDebugUtils.currentLine=33030153;
 //BA.debugLineNum = 33030153;BA.debugLine="btn_Back_Click";
_btn_back_click();
 };
RDebugUtils.currentLine=33030155;
 //BA.debugLineNum = 33030155;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 };
RDebugUtils.currentLine=33030157;
 //BA.debugLineNum = 33030157;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=33030158;
 //BA.debugLineNum = 33030158;BA.debugLine="End Sub";
return false;
}
public static String  _btn_back_click() throws Exception{
RDebugUtils.currentModule="act_kala_listi";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_back_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_back_click", null));}
RDebugUtils.currentLine=32964608;
 //BA.debugLineNum = 32964608;BA.debugLine="Sub btn_Back_Click";
RDebugUtils.currentLine=32964610;
 //BA.debugLineNum = 32964610;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=32964611;
 //BA.debugLineNum = 32964611;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="act_kala_listi";
RDebugUtils.currentLine=31850496;
 //BA.debugLineNum = 31850496;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=31850498;
 //BA.debugLineNum = 31850498;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="act_kala_listi";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=31784960;
 //BA.debugLineNum = 31784960;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=31784961;
 //BA.debugLineNum = 31784961;BA.debugLine="Try";
try {RDebugUtils.currentLine=31784964;
 //BA.debugLineNum = 31784964;BA.debugLine="StartService(FusedLocationService)";
anywheresoftware.b4a.keywords.Common.StartService(processBA,(Object)(mostCurrent._fusedlocationservice.getObject()));
RDebugUtils.currentLine=31784965;
 //BA.debugLineNum = 31784965;BA.debugLine="Log(\"Gps Start\")";
anywheresoftware.b4a.keywords.Common.LogImpl("531784965","Gps Start",0);
RDebugUtils.currentLine=31784966;
 //BA.debugLineNum = 31784966;BA.debugLine="LoadKala";
_loadkala();
RDebugUtils.currentLine=31784968;
 //BA.debugLineNum = 31784968;BA.debugLine="RefreshLblSabad";
_refreshlblsabad();
 } 
       catch (Exception e7) {
			processBA.setLastException(e7);RDebugUtils.currentLine=31784971;
 //BA.debugLineNum = 31784971;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("531784971",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=31784972;
 //BA.debugLineNum = 31784972;BA.debugLine="myCode.SendError(LastException,\"Act_KalaDefault-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),"Act_KalaDefault-Activity_Resume");
 };
RDebugUtils.currentLine=31784974;
 //BA.debugLineNum = 31784974;BA.debugLine="End Sub";
return "";
}
public static String  _loadkala() throws Exception{
RDebugUtils.currentModule="act_kala_listi";
if (Debug.shouldDelegate(mostCurrent.activityBA, "loadkala", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "loadkala", null));}
String _str = "";
int _countfilter = 0;
boolean _filter = false;
String _search = "";
RDebugUtils.currentLine=31719424;
 //BA.debugLineNum = 31719424;BA.debugLine="Sub LoadKala";
RDebugUtils.currentLine=31719425;
 //BA.debugLineNum = 31719425;BA.debugLine="Try";
try {RDebugUtils.currentLine=31719426;
 //BA.debugLineNum = 31719426;BA.debugLine="Dim str As String=\"\"";
_str = "";
RDebugUtils.currentLine=31719427;
 //BA.debugLineNum = 31719427;BA.debugLine="Dim countfilter As Int=0";
_countfilter = (int) (0);
RDebugUtils.currentLine=31719428;
 //BA.debugLineNum = 31719428;BA.debugLine="Dim filter As Boolean=False";
_filter = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=31719435;
 //BA.debugLineNum = 31719435;BA.debugLine="Log(GroupCodeSelect1)";
anywheresoftware.b4a.keywords.Common.LogImpl("531719435",mostCurrent._groupcodeselect1,0);
RDebugUtils.currentLine=31719436;
 //BA.debugLineNum = 31719436;BA.debugLine="Log(GroupCodeSelect2)";
anywheresoftware.b4a.keywords.Common.LogImpl("531719436",mostCurrent._groupcodeselect2,0);
RDebugUtils.currentLine=31719437;
 //BA.debugLineNum = 31719437;BA.debugLine="If GroupCodeSelect1=0 And GroupCodeSelect2=0 The";
if ((mostCurrent._groupcodeselect1).equals(BA.NumberToString(0)) && (mostCurrent._groupcodeselect2).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=31719438;
 //BA.debugLineNum = 31719438;BA.debugLine="If SwGift.Checked=True Then";
if (mostCurrent._swgift.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=31719439;
 //BA.debugLineNum = 31719439;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=31719440;
 //BA.debugLineNum = 31719440;BA.debugLine="str= str & \" and TblKala.fldCodeKala IN(SELECT";
_str = _str+" and TblKala.fldCodeKala IN(SELECT tblEshantionVisitori.fldCodeKala FROM tblEshantionVisitori)";
RDebugUtils.currentLine=31719441;
 //BA.debugLineNum = 31719441;BA.debugLine="filter=True";
_filter = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=31719442;
 //BA.debugLineNum = 31719442;BA.debugLine="If countfilter=1 Then";
if (_countfilter==1) { 
RDebugUtils.currentLine=31719443;
 //BA.debugLineNum = 31719443;BA.debugLine="str=str.Replace(\" and \",\"\")";
_str = _str.replace(" and ","");
 };
 };
RDebugUtils.currentLine=31719446;
 //BA.debugLineNum = 31719446;BA.debugLine="If SwTakhfif.Checked=True Then";
if (mostCurrent._swtakhfif.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=31719447;
 //BA.debugLineNum = 31719447;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=31719448;
 //BA.debugLineNum = 31719448;BA.debugLine="str= str & \" and fldFeeBadAzTakhfif <> '0.0000";
_str = _str+" and fldFeeBadAzTakhfif <> '0.0000'";
RDebugUtils.currentLine=31719449;
 //BA.debugLineNum = 31719449;BA.debugLine="filter=True";
_filter = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=31719450;
 //BA.debugLineNum = 31719450;BA.debugLine="If countfilter=1 Then";
if (_countfilter==1) { 
RDebugUtils.currentLine=31719451;
 //BA.debugLineNum = 31719451;BA.debugLine="str=str.Replace(\" and \",\"\")";
_str = _str.replace(" and ","");
 };
 };
RDebugUtils.currentLine=31719454;
 //BA.debugLineNum = 31719454;BA.debugLine="If SwMojoodi.Checked=True Then";
if (mostCurrent._swmojoodi.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=31719455;
 //BA.debugLineNum = 31719455;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=31719456;
 //BA.debugLineNum = 31719456;BA.debugLine="str= str & \" and SumMande > '0'\"";
_str = _str+" and SumMande > '0'";
RDebugUtils.currentLine=31719457;
 //BA.debugLineNum = 31719457;BA.debugLine="filter=True";
_filter = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=31719458;
 //BA.debugLineNum = 31719458;BA.debugLine="If countfilter=1 Then";
if (_countfilter==1) { 
RDebugUtils.currentLine=31719459;
 //BA.debugLineNum = 31719459;BA.debugLine="str=str.Replace(\" and \",\"\")";
_str = _str.replace(" and ","");
 };
 };
RDebugUtils.currentLine=31719462;
 //BA.debugLineNum = 31719462;BA.debugLine="If SwPic.Checked=True Then";
if (mostCurrent._swpic.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=31719463;
 //BA.debugLineNum = 31719463;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=31719464;
 //BA.debugLineNum = 31719464;BA.debugLine="str= str & \" and fldPathPic <> '0'\"";
_str = _str+" and fldPathPic <> '0'";
RDebugUtils.currentLine=31719465;
 //BA.debugLineNum = 31719465;BA.debugLine="filter=True";
_filter = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=31719466;
 //BA.debugLineNum = 31719466;BA.debugLine="If countfilter=1 Then";
if (_countfilter==1) { 
RDebugUtils.currentLine=31719467;
 //BA.debugLineNum = 31719467;BA.debugLine="str=str.Replace(\" and \",\"\")";
_str = _str.replace(" and ","");
 };
 };
RDebugUtils.currentLine=31719471;
 //BA.debugLineNum = 31719471;BA.debugLine="If TxtSearch.Text.Length>0 And TxtSearch.Text<>";
if (mostCurrent._txtsearch.getText().length()>0 && (mostCurrent._txtsearch.getText()).equals(" ") == false && (mostCurrent._txtsearch.getText()).equals("") == false) { 
RDebugUtils.currentLine=31719472;
 //BA.debugLineNum = 31719472;BA.debugLine="Dim Search As String=MCode.ConvertNumbersPersi";
_search = mostCurrent._mcode._convertnumberspersian2english /*String*/ (mostCurrent.activityBA,mostCurrent._txtsearch.getText());
RDebugUtils.currentLine=31719473;
 //BA.debugLineNum = 31719473;BA.debugLine="If Search=\"\" Then";
if ((_search).equals("")) { 
RDebugUtils.currentLine=31719474;
 //BA.debugLineNum = 31719474;BA.debugLine="Search=TxtSearch.Text";
_search = mostCurrent._txtsearch.getText();
 };
RDebugUtils.currentLine=31719476;
 //BA.debugLineNum = 31719476;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=31719477;
 //BA.debugLineNum = 31719477;BA.debugLine="If IsNumber(Search) Then";
if (anywheresoftware.b4a.keywords.Common.IsNumber(_search)) { 
RDebugUtils.currentLine=31719478;
 //BA.debugLineNum = 31719478;BA.debugLine="If Search.Length>5 Then";
if (_search.length()>5) { 
RDebugUtils.currentLine=31719479;
 //BA.debugLineNum = 31719479;BA.debugLine="str = str & $\" and (fldSerial = '${Search}')";
_str = _str+(" and (fldSerial = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_search))+"') ");
 }else {
RDebugUtils.currentLine=31719481;
 //BA.debugLineNum = 31719481;BA.debugLine="str = str & $\" and (fldCodeKala like '%${Sea";
_str = _str+(" and (fldCodeKala like '%"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_search))+"%') ");
 };
 }else {
RDebugUtils.currentLine=31719485;
 //BA.debugLineNum = 31719485;BA.debugLine="str = str & $\" and (fldNameKala like '%${Sear";
_str = _str+(" and (fldNameKala like '%"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_search))+"%') ");
 };
RDebugUtils.currentLine=31719487;
 //BA.debugLineNum = 31719487;BA.debugLine="filter=True";
_filter = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=31719488;
 //BA.debugLineNum = 31719488;BA.debugLine="If countfilter=1 Then";
if (_countfilter==1) { 
RDebugUtils.currentLine=31719489;
 //BA.debugLineNum = 31719489;BA.debugLine="str=str.Replace(\" and \",\"\")";
_str = _str.replace(" and ","");
 };
 };
RDebugUtils.currentLine=31719492;
 //BA.debugLineNum = 31719492;BA.debugLine="If filter=True And str<>\"\" Then";
if (_filter==anywheresoftware.b4a.keywords.Common.True && (_str).equals("") == false) { 
RDebugUtils.currentLine=31719495;
 //BA.debugLineNum = 31719495;BA.debugLine="str=\"select * from TblKala where \"&str&\" \"&Str";
_str = "select * from TblKala where "+_str+" "+mostCurrent._str_sort;
 }else {
RDebugUtils.currentLine=31719497;
 //BA.debugLineNum = 31719497;BA.debugLine="str=\"select * from TblKala  \"&Str_sort";
_str = "select * from TblKala  "+mostCurrent._str_sort;
 };
RDebugUtils.currentLine=31719499;
 //BA.debugLineNum = 31719499;BA.debugLine="Log(str)";
anywheresoftware.b4a.keywords.Common.LogImpl("531719499",_str,0);
 };
RDebugUtils.currentLine=31719502;
 //BA.debugLineNum = 31719502;BA.debugLine="If GroupCodeSelect1<>0 And GroupCodeSelect2=0 Th";
if ((mostCurrent._groupcodeselect1).equals(BA.NumberToString(0)) == false && (mostCurrent._groupcodeselect2).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=31719503;
 //BA.debugLineNum = 31719503;BA.debugLine="If SwGift.Checked=True Then";
if (mostCurrent._swgift.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=31719504;
 //BA.debugLineNum = 31719504;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=31719505;
 //BA.debugLineNum = 31719505;BA.debugLine="str= str & \" and TblKala.fldCodeKala IN(SELECT";
_str = _str+" and TblKala.fldCodeKala IN(SELECT tblEshantionVisitori.fldCodeKala FROM tblEshantionVisitori)";
 };
RDebugUtils.currentLine=31719508;
 //BA.debugLineNum = 31719508;BA.debugLine="If SwTakhfif.Checked=True Then";
if (mostCurrent._swtakhfif.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=31719509;
 //BA.debugLineNum = 31719509;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=31719510;
 //BA.debugLineNum = 31719510;BA.debugLine="str= str & \" and fldFeeBadAzTakhfif <> '0.0000";
_str = _str+" and fldFeeBadAzTakhfif <> '0.0000'";
 };
RDebugUtils.currentLine=31719513;
 //BA.debugLineNum = 31719513;BA.debugLine="If SwMojoodi.Checked=True Then";
if (mostCurrent._swmojoodi.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=31719514;
 //BA.debugLineNum = 31719514;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=31719515;
 //BA.debugLineNum = 31719515;BA.debugLine="str= str & \" and SumMande > '0'\"";
_str = _str+" and SumMande > '0'";
 };
RDebugUtils.currentLine=31719518;
 //BA.debugLineNum = 31719518;BA.debugLine="If SwPic.Checked=True Then";
if (mostCurrent._swpic.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=31719519;
 //BA.debugLineNum = 31719519;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=31719520;
 //BA.debugLineNum = 31719520;BA.debugLine="str= str & \" and fldPathPic <> '0'\"";
_str = _str+" and fldPathPic <> '0'";
 };
RDebugUtils.currentLine=31719524;
 //BA.debugLineNum = 31719524;BA.debugLine="If TxtSearch.Text.Length>0 And TxtSearch.Text<>";
if (mostCurrent._txtsearch.getText().length()>0 && (mostCurrent._txtsearch.getText()).equals(" ") == false && (mostCurrent._txtsearch.getText()).equals("") == false) { 
RDebugUtils.currentLine=31719525;
 //BA.debugLineNum = 31719525;BA.debugLine="Dim Search As String=MCode.ConvertNumbersPersi";
_search = mostCurrent._mcode._convertnumberspersian2english /*String*/ (mostCurrent.activityBA,mostCurrent._txtsearch.getText());
RDebugUtils.currentLine=31719526;
 //BA.debugLineNum = 31719526;BA.debugLine="If Search=\"\" Then";
if ((_search).equals("")) { 
RDebugUtils.currentLine=31719527;
 //BA.debugLineNum = 31719527;BA.debugLine="Search=TxtSearch.Text";
_search = mostCurrent._txtsearch.getText();
 };
RDebugUtils.currentLine=31719529;
 //BA.debugLineNum = 31719529;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=31719530;
 //BA.debugLineNum = 31719530;BA.debugLine="If IsNumber(Search) Then";
if (anywheresoftware.b4a.keywords.Common.IsNumber(_search)) { 
RDebugUtils.currentLine=31719531;
 //BA.debugLineNum = 31719531;BA.debugLine="If Search.Length>5 Then";
if (_search.length()>5) { 
RDebugUtils.currentLine=31719532;
 //BA.debugLineNum = 31719532;BA.debugLine="str = str & $\" and (fldSerial = '${Search}')";
_str = _str+(" and (fldSerial = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_search))+"') ");
 }else {
RDebugUtils.currentLine=31719534;
 //BA.debugLineNum = 31719534;BA.debugLine="str = str & $\" and (fldCodeKala like '%${Sea";
_str = _str+(" and (fldCodeKala like '%"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_search))+"%') ");
 };
 }else {
RDebugUtils.currentLine=31719538;
 //BA.debugLineNum = 31719538;BA.debugLine="str = str & $\" and (fldNameKala like '%${Sear";
_str = _str+(" and (fldNameKala like '%"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_search))+"%') ");
 };
RDebugUtils.currentLine=31719540;
 //BA.debugLineNum = 31719540;BA.debugLine="filter=True";
_filter = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=31719541;
 //BA.debugLineNum = 31719541;BA.debugLine="If countfilter=1 Then";
if (_countfilter==1) { 
RDebugUtils.currentLine=31719542;
 //BA.debugLineNum = 31719542;BA.debugLine="str=str.Replace(\" and \",\"\")";
_str = _str.replace(" and ","");
 };
 };
RDebugUtils.currentLine=31719545;
 //BA.debugLineNum = 31719545;BA.debugLine="If	filter=True And str<>\"\" Then";
if (_filter==anywheresoftware.b4a.keywords.Common.True && (_str).equals("") == false) { 
RDebugUtils.currentLine=31719546;
 //BA.debugLineNum = 31719546;BA.debugLine="str=\"select * from TblKala where fldCodeGroup";
_str = "select * from TblKala where fldCodeGroup like '"+mostCurrent._groupcodeselect1+"%' "+_str+" "+mostCurrent._str_sort;
 }else {
RDebugUtils.currentLine=31719548;
 //BA.debugLineNum = 31719548;BA.debugLine="str=\"select * from TblKala where fldCodeGroup";
_str = "select * from TblKala where fldCodeGroup like '"+mostCurrent._groupcodeselect1+"%' "+mostCurrent._str_sort;
 };
RDebugUtils.currentLine=31719552;
 //BA.debugLineNum = 31719552;BA.debugLine="Log(str)";
anywheresoftware.b4a.keywords.Common.LogImpl("531719552",_str,0);
 };
RDebugUtils.currentLine=31719555;
 //BA.debugLineNum = 31719555;BA.debugLine="If GroupCodeSelect1<>0 And GroupCodeSelect2<>0 T";
if ((mostCurrent._groupcodeselect1).equals(BA.NumberToString(0)) == false && (mostCurrent._groupcodeselect2).equals(BA.NumberToString(0)) == false) { 
RDebugUtils.currentLine=31719556;
 //BA.debugLineNum = 31719556;BA.debugLine="If SwGift.Checked=True Then";
if (mostCurrent._swgift.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=31719557;
 //BA.debugLineNum = 31719557;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=31719558;
 //BA.debugLineNum = 31719558;BA.debugLine="str= str & \" and TblKala.fldCodeKala IN(SELECT";
_str = _str+" and TblKala.fldCodeKala IN(SELECT tblEshantionVisitori.fldCodeKala FROM tblEshantionVisitori)";
 };
RDebugUtils.currentLine=31719561;
 //BA.debugLineNum = 31719561;BA.debugLine="If SwTakhfif.Checked=True Then";
if (mostCurrent._swtakhfif.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=31719562;
 //BA.debugLineNum = 31719562;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=31719563;
 //BA.debugLineNum = 31719563;BA.debugLine="str= str & \" and fldFeeBadAzTakhfif <> '0.0000";
_str = _str+" and fldFeeBadAzTakhfif <> '0.0000'";
 };
RDebugUtils.currentLine=31719566;
 //BA.debugLineNum = 31719566;BA.debugLine="If SwMojoodi.Checked=True Then";
if (mostCurrent._swmojoodi.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=31719567;
 //BA.debugLineNum = 31719567;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=31719568;
 //BA.debugLineNum = 31719568;BA.debugLine="str= str & \" and SumMande > '0'\"";
_str = _str+" and SumMande > '0'";
 };
RDebugUtils.currentLine=31719571;
 //BA.debugLineNum = 31719571;BA.debugLine="If MCode.NamayeshKalaSefr=0 Then";
if ((mostCurrent._mcode._namayeshkalasefr /*String*/ ).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=31719572;
 //BA.debugLineNum = 31719572;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=31719573;
 //BA.debugLineNum = 31719573;BA.debugLine="str= str & \" and SumMande > '0'\"";
_str = _str+" and SumMande > '0'";
RDebugUtils.currentLine=31719574;
 //BA.debugLineNum = 31719574;BA.debugLine="filter=True";
_filter = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=31719575;
 //BA.debugLineNum = 31719575;BA.debugLine="If countfilter=1 Then";
if (_countfilter==1) { 
RDebugUtils.currentLine=31719576;
 //BA.debugLineNum = 31719576;BA.debugLine="str=str.Replace(\" and \",\"\")";
_str = _str.replace(" and ","");
 };
 };
RDebugUtils.currentLine=31719579;
 //BA.debugLineNum = 31719579;BA.debugLine="If SwPic.Checked=True Then";
if (mostCurrent._swpic.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=31719580;
 //BA.debugLineNum = 31719580;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=31719581;
 //BA.debugLineNum = 31719581;BA.debugLine="str= str & \" and fldPathPic <> '0'\"";
_str = _str+" and fldPathPic <> '0'";
 };
RDebugUtils.currentLine=31719585;
 //BA.debugLineNum = 31719585;BA.debugLine="If TxtSearch.Text.Length>0 And TxtSearch.Text<>";
if (mostCurrent._txtsearch.getText().length()>0 && (mostCurrent._txtsearch.getText()).equals(" ") == false && (mostCurrent._txtsearch.getText()).equals("") == false) { 
RDebugUtils.currentLine=31719586;
 //BA.debugLineNum = 31719586;BA.debugLine="Dim Search As String=MCode.ConvertNumbersPersi";
_search = mostCurrent._mcode._convertnumberspersian2english /*String*/ (mostCurrent.activityBA,mostCurrent._txtsearch.getText());
RDebugUtils.currentLine=31719587;
 //BA.debugLineNum = 31719587;BA.debugLine="If Search=\"\" Then";
if ((_search).equals("")) { 
RDebugUtils.currentLine=31719588;
 //BA.debugLineNum = 31719588;BA.debugLine="Search=TxtSearch.Text";
_search = mostCurrent._txtsearch.getText();
 };
RDebugUtils.currentLine=31719590;
 //BA.debugLineNum = 31719590;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=31719591;
 //BA.debugLineNum = 31719591;BA.debugLine="If IsNumber(Search) Then";
if (anywheresoftware.b4a.keywords.Common.IsNumber(_search)) { 
RDebugUtils.currentLine=31719592;
 //BA.debugLineNum = 31719592;BA.debugLine="If Search.Length>5 Then";
if (_search.length()>5) { 
RDebugUtils.currentLine=31719593;
 //BA.debugLineNum = 31719593;BA.debugLine="str = str & $\" and (fldSerial = '${Search}')";
_str = _str+(" and (fldSerial = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_search))+"') ");
 }else {
RDebugUtils.currentLine=31719595;
 //BA.debugLineNum = 31719595;BA.debugLine="str = str & $\" and (fldCodeKala like '%${Sea";
_str = _str+(" and (fldCodeKala like '%"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_search))+"%') ");
 };
 }else {
RDebugUtils.currentLine=31719599;
 //BA.debugLineNum = 31719599;BA.debugLine="str = str & $\" and (fldNameKala like '%${Sear";
_str = _str+(" and (fldNameKala like '%"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_search))+"%') ");
 };
RDebugUtils.currentLine=31719601;
 //BA.debugLineNum = 31719601;BA.debugLine="filter=True";
_filter = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=31719602;
 //BA.debugLineNum = 31719602;BA.debugLine="If countfilter=1 Then";
if (_countfilter==1) { 
RDebugUtils.currentLine=31719603;
 //BA.debugLineNum = 31719603;BA.debugLine="str=str.Replace(\" and \",\"\")";
_str = _str.replace(" and ","");
 };
 };
RDebugUtils.currentLine=31719607;
 //BA.debugLineNum = 31719607;BA.debugLine="If	filter=True And str<>\"\" Then";
if (_filter==anywheresoftware.b4a.keywords.Common.True && (_str).equals("") == false) { 
RDebugUtils.currentLine=31719608;
 //BA.debugLineNum = 31719608;BA.debugLine="str=\"select * from TblKala where fldCodeGroup";
_str = "select * from TblKala where fldCodeGroup like '"+mostCurrent._groupcodeselect2+"%' "+_str+" "+mostCurrent._str_sort;
 }else {
RDebugUtils.currentLine=31719610;
 //BA.debugLineNum = 31719610;BA.debugLine="str=\"select * from TblKala where fldCodeGroup";
_str = "select * from TblKala where fldCodeGroup like '"+mostCurrent._groupcodeselect2+"%' "+mostCurrent._str_sort;
 };
RDebugUtils.currentLine=31719613;
 //BA.debugLineNum = 31719613;BA.debugLine="Log(str)";
anywheresoftware.b4a.keywords.Common.LogImpl("531719613",_str,0);
 };
RDebugUtils.currentLine=31719615;
 //BA.debugLineNum = 31719615;BA.debugLine="FirebaseMessaging.mode=\"stop\"";
mostCurrent._firebasemessaging._mode /*String*/  = "stop";
RDebugUtils.currentLine=31719616;
 //BA.debugLineNum = 31719616;BA.debugLine="LoadListKala(str)";
_loadlistkala(_str);
RDebugUtils.currentLine=31719618;
 //BA.debugLineNum = 31719618;BA.debugLine="RefreshLblSabad";
_refreshlblsabad();
 } 
       catch (Exception e167) {
			processBA.setLastException(e167);RDebugUtils.currentLine=31719620;
 //BA.debugLineNum = 31719620;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("531719620",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=31719621;
 //BA.debugLineNum = 31719621;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-LoadKala");
 };
RDebugUtils.currentLine=31719624;
 //BA.debugLineNum = 31719624;BA.debugLine="End Sub";
return "";
}
public static String  _refreshlblsabad() throws Exception{
RDebugUtils.currentModule="act_kala_listi";
if (Debug.shouldDelegate(mostCurrent.activityBA, "refreshlblsabad", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "refreshlblsabad", null));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
RDebugUtils.currentLine=32047104;
 //BA.debugLineNum = 32047104;BA.debugLine="Sub RefreshLblSabad";
RDebugUtils.currentLine=32047105;
 //BA.debugLineNum = 32047105;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From Tb";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblSabad");
RDebugUtils.currentLine=32047106;
 //BA.debugLineNum = 32047106;BA.debugLine="If Cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=32047107;
 //BA.debugLineNum = 32047107;BA.debugLine="LblBasketCount.Visible=True";
mostCurrent._lblbasketcount.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=32047108;
 //BA.debugLineNum = 32047108;BA.debugLine="LblBasketCount.Text=Cu.RowCount";
mostCurrent._lblbasketcount.setText(BA.ObjectToCharSequence(_cu.getRowCount()));
 }else {
RDebugUtils.currentLine=32047110;
 //BA.debugLineNum = 32047110;BA.debugLine="LblBasketCount.Visible=False";
mostCurrent._lblbasketcount.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=32047112;
 //BA.debugLineNum = 32047112;BA.debugLine="HLV.notifyDataSetChanged";
mostCurrent._hlv.notifyDataSetChanged();
RDebugUtils.currentLine=32047113;
 //BA.debugLineNum = 32047113;BA.debugLine="End Sub";
return "";
}
public static String  _addtosabad(ir.parsikhesab.pakhsh.mcode._adapterlistkala _item) throws Exception{
RDebugUtils.currentModule="act_kala_listi";
if (Debug.shouldDelegate(mostCurrent.activityBA, "addtosabad", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "addtosabad", new Object[] {_item}));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
boolean _check = false;
int _i = 0;
boolean _ishas = false;
int _c = 0;
ir.parsikhesab.pakhsh.mcode._adapterchangefeekala _item2 = null;
RDebugUtils.currentLine=33947648;
 //BA.debugLineNum = 33947648;BA.debugLine="Sub AddToSabad(Item As AdapterListKala)";
RDebugUtils.currentLine=33947650;
 //BA.debugLineNum = 33947650;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From Tb";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblSabad");
RDebugUtils.currentLine=33947651;
 //BA.debugLineNum = 33947651;BA.debugLine="Dim Check As Boolean";
_check = false;
RDebugUtils.currentLine=33947652;
 //BA.debugLineNum = 33947652;BA.debugLine="For i=0 To Cu.RowCount -1";
{
final int step3 = 1;
final int limit3 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=33947653;
 //BA.debugLineNum = 33947653;BA.debugLine="Cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=33947654;
 //BA.debugLineNum = 33947654;BA.debugLine="If Cu.GetString(\"FldCodeKala\") = Item.CodeKala T";
if ((_cu.GetString("FldCodeKala")).equals(_item.CodeKala /*String*/ )) { 
RDebugUtils.currentLine=33947655;
 //BA.debugLineNum = 33947655;BA.debugLine="If Item.TedadDarSabadJoz = 0 And Item.TedadDarS";
if ((_item.TedadDarSabadJoz /*String*/ ).equals(BA.NumberToString(0)) && (_item.TedadDarSabadKol /*String*/ ).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=33947656;
 //BA.debugLineNum = 33947656;BA.debugLine="MCode.SaveUpdate(\"Delete From TblSabad Where F";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Delete From TblSabad Where FldCodeKala = '"+_item.CodeKala /*String*/ +"'");
RDebugUtils.currentLine=33947657;
 //BA.debugLineNum = 33947657;BA.debugLine="Dim ishas As Boolean=False";
_ishas = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=33947658;
 //BA.debugLineNum = 33947658;BA.debugLine="Dim c As Int=0";
_c = (int) (0);
RDebugUtils.currentLine=33947659;
 //BA.debugLineNum = 33947659;BA.debugLine="For i=0 To MCode.lstChangeFeeKala.Size-1";
{
final int step10 = 1;
final int limit10 = (int) (mostCurrent._mcode._lstchangefeekala /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit10 ;_i = _i + step10 ) {
RDebugUtils.currentLine=33947660;
 //BA.debugLineNum = 33947660;BA.debugLine="Dim Item2 = MCode.lstChangeFeeKala.Get(i) As";
_item2 = (ir.parsikhesab.pakhsh.mcode._adapterchangefeekala)(mostCurrent._mcode._lstchangefeekala /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=33947661;
 //BA.debugLineNum = 33947661;BA.debugLine="If Item2.FldCodKala=Item.CodeKala Then";
if ((_item2.FldCodKala /*String*/ ).equals(_item.CodeKala /*String*/ )) { 
RDebugUtils.currentLine=33947662;
 //BA.debugLineNum = 33947662;BA.debugLine="ishas=True";
_ishas = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=33947663;
 //BA.debugLineNum = 33947663;BA.debugLine="c=i";
_c = _i;
RDebugUtils.currentLine=33947664;
 //BA.debugLineNum = 33947664;BA.debugLine="Exit";
if (true) break;
 }else {
RDebugUtils.currentLine=33947666;
 //BA.debugLineNum = 33947666;BA.debugLine="ishas=False";
_ishas = anywheresoftware.b4a.keywords.Common.False;
 };
 }
};
RDebugUtils.currentLine=33947670;
 //BA.debugLineNum = 33947670;BA.debugLine="If ishas Then";
if (_ishas) { 
RDebugUtils.currentLine=33947671;
 //BA.debugLineNum = 33947671;BA.debugLine="MCode.lstChangeFeeKala.RemoveAt(c)";
mostCurrent._mcode._lstchangefeekala /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(_c);
 };
 }else {
RDebugUtils.currentLine=33947674;
 //BA.debugLineNum = 33947674;BA.debugLine="MCode.SaveUpdate(\"Update TblSabad Set FldTedad";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Update TblSabad Set FldTedadDarSabadJoz = '"+_item.TedadDarSabadJoz /*String*/ +"',FldTedadDarSabadKol = '"+_item.TedadDarSabadKol /*String*/ +"' Where FldCodeKala = '"+_item.CodeKala /*String*/ +"'");
 };
RDebugUtils.currentLine=33947677;
 //BA.debugLineNum = 33947677;BA.debugLine="Check = True";
_check = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=33947678;
 //BA.debugLineNum = 33947678;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=33947681;
 //BA.debugLineNum = 33947681;BA.debugLine="If Check = False Then";
if (_check==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=33947682;
 //BA.debugLineNum = 33947682;BA.debugLine="MCode.AddToSabad(Item)";
mostCurrent._mcode._addtosabad /*String*/ (mostCurrent.activityBA,_item);
 };
RDebugUtils.currentLine=33947684;
 //BA.debugLineNum = 33947684;BA.debugLine="RefreshLblSabad";
_refreshlblsabad();
RDebugUtils.currentLine=33947685;
 //BA.debugLineNum = 33947685;BA.debugLine="End Sub";
return "";
}
public static void  _btn_discount_click(ir.parsikhesab.pakhsh.mcode._adapterlistkala _item) throws Exception{
RDebugUtils.currentModule="act_kala_listi";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_discount_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "btn_discount_click", new Object[] {_item}); return;}
ResumableSub_btn_discount_Click rsub = new ResumableSub_btn_discount_Click(null,_item);
rsub.resume(processBA, null);
}
public static class ResumableSub_btn_discount_Click extends BA.ResumableSub {
public ResumableSub_btn_discount_Click(ir.parsikhesab.pakhsh.act_kala_listi parent,ir.parsikhesab.pakhsh.mcode._adapterlistkala _item) {
this.parent = parent;
this._item = _item;
}
ir.parsikhesab.pakhsh.act_kala_listi parent;
ir.parsikhesab.pakhsh.mcode._adapterlistkala _item;
ir.parsikhesab.pakhsh.b4xinputtemplate _input = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rs = null;
int _result = 0;
float _res = 0f;
int _feebadaztakhfif = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_kala_listi";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=33751041;
 //BA.debugLineNum = 33751041;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 33;
this.catchState = 32;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 32;
RDebugUtils.currentLine=33751042;
 //BA.debugLineNum = 33751042;BA.debugLine="Dim input As B4XInputTemplate";
_input = new ir.parsikhesab.pakhsh.b4xinputtemplate();
RDebugUtils.currentLine=33751043;
 //BA.debugLineNum = 33751043;BA.debugLine="input.Initialize";
_input._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=33751044;
 //BA.debugLineNum = 33751044;BA.debugLine="input.lblTitle.Text = \"تخفیف:\"";
_input._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("تخفیف:"));
RDebugUtils.currentLine=33751045;
 //BA.debugLineNum = 33751045;BA.debugLine="input.ConfigureForNumbers(True, True)";
_input._configurefornumbers /*String*/ (null,anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=33751046;
 //BA.debugLineNum = 33751046;BA.debugLine="Dim rs As ResumableSub = Dialog.ShowTemplate(inp";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = parent.mostCurrent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_input),(Object)("OK"),(Object)(""),(Object)("CANCEL"));
RDebugUtils.currentLine=33751047;
 //BA.debugLineNum = 33751047;BA.debugLine="Dialog.Base.Top = 50%y - Dialog.Base.Height / 2";
parent.mostCurrent._dialog._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTop((int) (anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (50),mostCurrent.activityBA)-parent.mostCurrent._dialog._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2));
RDebugUtils.currentLine=33751048;
 //BA.debugLineNum = 33751048;BA.debugLine="Wait For (rs) Complete (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_kala_listi", "btn_discount_click"), _rs);
this.state = 34;
return;
case 34:
//C
this.state = 4;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=33751049;
 //BA.debugLineNum = 33751049;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
if (true) break;

case 4:
//if
this.state = 30;
if (_result==parent.mostCurrent._xui.DialogResponse_Positive) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=33751050;
 //BA.debugLineNum = 33751050;BA.debugLine="If input.Text=\"\" Then input.Text=0";
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
RDebugUtils.currentLine=33751051;
 //BA.debugLineNum = 33751051;BA.debugLine="Dim res As Float = input.Text 'no need to check";
_res = (float)(Double.parseDouble(_input._text /*String*/ ));
RDebugUtils.currentLine=33751052;
 //BA.debugLineNum = 33751052;BA.debugLine="If Item.FeeForoosh<res Then";
if (true) break;

case 13:
//if
this.state = 16;
if (_item.FeeForoosh /*int*/ <_res) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=33751053;
 //BA.debugLineNum = 33751053;BA.debugLine="ToastMessageShow(\"مبلغ تخفیف نمیتواند بیشتر از";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("مبلغ تخفیف نمیتواند بیشتر از فی فروش باشد"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=33751054;
 //BA.debugLineNum = 33751054;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=33751056;
 //BA.debugLineNum = 33751056;BA.debugLine="If Item.fldFeeBadAzTakhfif>0 And Item.fldFeeBad";

case 16:
//if
this.state = 19;
if ((double)(Double.parseDouble(_item.fldFeeBadAzTakhfif /*String*/ ))>0 && (double)(Double.parseDouble(_item.fldFeeBadAzTakhfif /*String*/ ))<_res) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=33751057;
 //BA.debugLineNum = 33751057;BA.debugLine="ToastMessageShow(\"مبلغ تخفیف نمیتواند بیشتر از";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("مبلغ تخفیف نمیتواند بیشتر از فی بعد از تخفیف باشد"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=33751058;
 //BA.debugLineNum = 33751058;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 19:
//C
this.state = 20;
;
RDebugUtils.currentLine=33751063;
 //BA.debugLineNum = 33751063;BA.debugLine="Dim feebadaztakhfif As Int=Item.fldFeeBadAzTakh";
_feebadaztakhfif = (int)(Double.parseDouble(_item.fldFeeBadAzTakhfif /*String*/ ));
RDebugUtils.currentLine=33751064;
 //BA.debugLineNum = 33751064;BA.debugLine="If res>0 And feebadaztakhfif=0 Then";
if (true) break;

case 20:
//if
this.state = 29;
if (_res>0 && _feebadaztakhfif==0) { 
this.state = 22;
}else 
{RDebugUtils.currentLine=33751067;
 //BA.debugLineNum = 33751067;BA.debugLine="else If res>0 And feebadaztakhfif>0 Then";
if (_res>0 && _feebadaztakhfif>0) { 
this.state = 24;
}else 
{RDebugUtils.currentLine=33751070;
 //BA.debugLineNum = 33751070;BA.debugLine="Else if res=0 And feebadaztakhfif=0 Then";
if (_res==0 && _feebadaztakhfif==0) { 
this.state = 26;
}else 
{RDebugUtils.currentLine=33751073;
 //BA.debugLineNum = 33751073;BA.debugLine="Else if res=0 And feebadaztakhfif>0 Then";
if (_res==0 && _feebadaztakhfif>0) { 
this.state = 28;
}}}}
if (true) break;

case 22:
//C
this.state = 29;
RDebugUtils.currentLine=33751065;
 //BA.debugLineNum = 33751065;BA.debugLine="Item.fldFeeBadAzTakhfif=Item.FeeForoosh-res";
_item.fldFeeBadAzTakhfif /*String*/  = BA.NumberToString(_item.FeeForoosh /*int*/ -_res);
RDebugUtils.currentLine=33751066;
 //BA.debugLineNum = 33751066;BA.debugLine="ToastMessageShow(\"تخفیف با موفقیت اعمال شد ، ج";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("تخفیف با موفقیت اعمال شد ، جهت انصراف از تخفیف مبلغ تخفیف را صفر وارد نمایید."),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 24:
//C
this.state = 29;
RDebugUtils.currentLine=33751068;
 //BA.debugLineNum = 33751068;BA.debugLine="Item.fldFeeBadAzTakhfif=feebadaztakhfif-res";
_item.fldFeeBadAzTakhfif /*String*/  = BA.NumberToString(_feebadaztakhfif-_res);
RDebugUtils.currentLine=33751069;
 //BA.debugLineNum = 33751069;BA.debugLine="ToastMessageShow(\"تخفیف با موفقیت اعمال شد ، ج";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("تخفیف با موفقیت اعمال شد ، جهت انصراف از تخفیف مبلغ تخفیف را صفر وارد نمایید."),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 26:
//C
this.state = 29;
RDebugUtils.currentLine=33751071;
 //BA.debugLineNum = 33751071;BA.debugLine="Item.fldFeeBadAzTakhfif=res";
_item.fldFeeBadAzTakhfif /*String*/  = BA.NumberToString(_res);
RDebugUtils.currentLine=33751072;
 //BA.debugLineNum = 33751072;BA.debugLine="Item.MablaghTakhfif=res";
_item.MablaghTakhfif /*int*/  = (int) (_res);
 if (true) break;

case 28:
//C
this.state = 29;
RDebugUtils.currentLine=33751074;
 //BA.debugLineNum = 33751074;BA.debugLine="Item.fldFeeBadAzTakhfif=feebadaztakhfif";
_item.fldFeeBadAzTakhfif /*String*/  = BA.NumberToString(_feebadaztakhfif);
 if (true) break;

case 29:
//C
this.state = 30;
;
RDebugUtils.currentLine=33751076;
 //BA.debugLineNum = 33751076;BA.debugLine="Item.MablaghTakhfif=res";
_item.MablaghTakhfif /*int*/  = (int) (_res);
RDebugUtils.currentLine=33751077;
 //BA.debugLineNum = 33751077;BA.debugLine="MCode.UpdateNoeTasvieDarSabad(FeeTip,Item)";
parent.mostCurrent._mcode._updatenoetasviedarsabad /*String*/ (mostCurrent.activityBA,(int)(Double.parseDouble(parent.mostCurrent._feetip)),_item);
RDebugUtils.currentLine=33751079;
 //BA.debugLineNum = 33751079;BA.debugLine="HLV.notifyDataSetChanged";
parent.mostCurrent._hlv.notifyDataSetChanged();
 if (true) break;

case 30:
//C
this.state = 33;
;
 if (true) break;

case 32:
//C
this.state = 33;
this.catchState = 0;
RDebugUtils.currentLine=33751082;
 //BA.debugLineNum = 33751082;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("533751082",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=33751083;
 //BA.debugLineNum = 33751083;BA.debugLine="myCode.SendError(LastException,\"Kala_listi-btn_d";
parent.mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),"Kala_listi-btn_discount_Click");
 if (true) break;
if (true) break;

case 33:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=33751086;
 //BA.debugLineNum = 33751086;BA.debugLine="End Sub";
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
public static void  _btn_edit_price_click(ir.parsikhesab.pakhsh.mcode._adapterlistkala _item) throws Exception{
RDebugUtils.currentModule="act_kala_listi";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_edit_price_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "btn_edit_price_click", new Object[] {_item}); return;}
ResumableSub_btn_edit_Price_Click rsub = new ResumableSub_btn_edit_Price_Click(null,_item);
rsub.resume(processBA, null);
}
public static class ResumableSub_btn_edit_Price_Click extends BA.ResumableSub {
public ResumableSub_btn_edit_Price_Click(ir.parsikhesab.pakhsh.act_kala_listi parent,ir.parsikhesab.pakhsh.mcode._adapterlistkala _item) {
this.parent = parent;
this._item = _item;
}
ir.parsikhesab.pakhsh.act_kala_listi parent;
ir.parsikhesab.pakhsh.mcode._adapterlistkala _item;
ir.parsikhesab.pakhsh.b4xinputtemplate _input = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rs = null;
int _result = 0;
float _res = 0f;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_kala_listi";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=33685505;
 //BA.debugLineNum = 33685505;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 22;
this.catchState = 21;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 21;
RDebugUtils.currentLine=33685506;
 //BA.debugLineNum = 33685506;BA.debugLine="Dim input As B4XInputTemplate";
_input = new ir.parsikhesab.pakhsh.b4xinputtemplate();
RDebugUtils.currentLine=33685507;
 //BA.debugLineNum = 33685507;BA.debugLine="input.Initialize";
_input._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=33685508;
 //BA.debugLineNum = 33685508;BA.debugLine="input.lblTitle.Text = \"قیمت جدید:\"";
_input._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("قیمت جدید:"));
RDebugUtils.currentLine=33685509;
 //BA.debugLineNum = 33685509;BA.debugLine="input.ConfigureForNumbers(True, True)";
_input._configurefornumbers /*String*/ (null,anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=33685510;
 //BA.debugLineNum = 33685510;BA.debugLine="Dim rs As ResumableSub = Dialog.ShowTemplate(inp";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = parent.mostCurrent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_input),(Object)("OK"),(Object)(""),(Object)("CANCEL"));
RDebugUtils.currentLine=33685511;
 //BA.debugLineNum = 33685511;BA.debugLine="Dialog.Base.Top = 50%y - Dialog.Base.Height / 2";
parent.mostCurrent._dialog._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTop((int) (anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (50),mostCurrent.activityBA)-parent.mostCurrent._dialog._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2));
RDebugUtils.currentLine=33685512;
 //BA.debugLineNum = 33685512;BA.debugLine="Wait For (rs) Complete (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_kala_listi", "btn_edit_price_click"), _rs);
this.state = 23;
return;
case 23:
//C
this.state = 4;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=33685513;
 //BA.debugLineNum = 33685513;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
if (true) break;

case 4:
//if
this.state = 19;
if (_result==parent.mostCurrent._xui.DialogResponse_Positive) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=33685514;
 //BA.debugLineNum = 33685514;BA.debugLine="If input.Text=\"\" Then input.Text=0";
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
RDebugUtils.currentLine=33685515;
 //BA.debugLineNum = 33685515;BA.debugLine="Dim res As Float = input.Text 'no need to check";
_res = (float)(Double.parseDouble(_input._text /*String*/ ));
RDebugUtils.currentLine=33685521;
 //BA.debugLineNum = 33685521;BA.debugLine="Item.FeeForoosh=res";
_item.FeeForoosh /*int*/  = (int) (_res);
RDebugUtils.currentLine=33685523;
 //BA.debugLineNum = 33685523;BA.debugLine="If Item.MablaghTakhfif>0 Then";
if (true) break;

case 13:
//if
this.state = 18;
if (_item.MablaghTakhfif /*int*/ >0) { 
this.state = 15;
}else {
this.state = 17;
}if (true) break;

case 15:
//C
this.state = 18;
RDebugUtils.currentLine=33685524;
 //BA.debugLineNum = 33685524;BA.debugLine="Item.fldFeeBadAzTakhfif=res-Item.MablaghTakhfi";
_item.fldFeeBadAzTakhfif /*String*/  = BA.NumberToString(_res-_item.MablaghTakhfif /*int*/ );
 if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=33685526;
 //BA.debugLineNum = 33685526;BA.debugLine="Item.fldFeeBadAzTakhfif=0";
_item.fldFeeBadAzTakhfif /*String*/  = BA.NumberToString(0);
 if (true) break;

case 18:
//C
this.state = 19;
;
RDebugUtils.currentLine=33685531;
 //BA.debugLineNum = 33685531;BA.debugLine="MCode.UpdateFeeSabad(res,Item.CodeKala)";
parent.mostCurrent._mcode._updatefeesabad /*String*/ (mostCurrent.activityBA,BA.NumberToString(_res),_item.CodeKala /*String*/ );
RDebugUtils.currentLine=33685532;
 //BA.debugLineNum = 33685532;BA.debugLine="RefreshLblSabad";
_refreshlblsabad();
 if (true) break;

case 19:
//C
this.state = 22;
;
 if (true) break;

case 21:
//C
this.state = 22;
this.catchState = 0;
RDebugUtils.currentLine=33685536;
 //BA.debugLineNum = 33685536;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("533685536",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=33685537;
 //BA.debugLineNum = 33685537;BA.debugLine="myCode.SendError(LastException,\"Kala_listi-btn_e";
parent.mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),"Kala_listi-btn_edit_Price_Click");
 if (true) break;
if (true) break;

case 22:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=33685540;
 //BA.debugLineNum = 33685540;BA.debugLine="End Sub";
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
public static String  _btncloserestorpnl_click() throws Exception{
RDebugUtils.currentModule="act_kala_listi";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btncloserestorpnl_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btncloserestorpnl_click", null));}
RDebugUtils.currentLine=34078720;
 //BA.debugLineNum = 34078720;BA.debugLine="Sub btnCloseRestorpnl_Click";
RDebugUtils.currentLine=34078722;
 //BA.debugLineNum = 34078722;BA.debugLine="End Sub";
return "";
}
public static String  _btncommentexit_click() throws Exception{
RDebugUtils.currentModule="act_kala_listi";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btncommentexit_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btncommentexit_click", null));}
RDebugUtils.currentLine=32833536;
 //BA.debugLineNum = 32833536;BA.debugLine="Sub BtnCommentExit_Click";
RDebugUtils.currentLine=32833537;
 //BA.debugLineNum = 32833537;BA.debugLine="pnlFilter.SetVisibleAnimated(300,False)";
mostCurrent._pnlfilter.SetVisibleAnimated((int) (300),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=32833538;
 //BA.debugLineNum = 32833538;BA.debugLine="End Sub";
return "";
}
public static String  _btnsearch_click() throws Exception{
RDebugUtils.currentModule="act_kala_listi";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnsearch_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnsearch_click", null));}
RDebugUtils.currentLine=33161216;
 //BA.debugLineNum = 33161216;BA.debugLine="Sub BtnSearch_Click";
RDebugUtils.currentLine=33161217;
 //BA.debugLineNum = 33161217;BA.debugLine="Log(\"BtnSearch_Click\")";
anywheresoftware.b4a.keywords.Common.LogImpl("533161217","BtnSearch_Click",0);
RDebugUtils.currentLine=33161218;
 //BA.debugLineNum = 33161218;BA.debugLine="If BtnSearch.Tag=True Then";
if ((mostCurrent._btnsearch.getTag()).equals((Object)(anywheresoftware.b4a.keywords.Common.True))) { 
RDebugUtils.currentLine=33161219;
 //BA.debugLineNum = 33161219;BA.debugLine="TxtSearch.Visible=True";
mostCurrent._txtsearch.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=33161221;
 //BA.debugLineNum = 33161221;BA.debugLine="BtnSearch.Tag=False";
mostCurrent._btnsearch.setTag((Object)(anywheresoftware.b4a.keywords.Common.False));
 }else {
RDebugUtils.currentLine=33161224;
 //BA.debugLineNum = 33161224;BA.debugLine="TxtSearch.Visible=False";
mostCurrent._txtsearch.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=33161225;
 //BA.debugLineNum = 33161225;BA.debugLine="BtnSearch.Tag=True";
mostCurrent._btnsearch.setTag((Object)(anywheresoftware.b4a.keywords.Common.True));
 };
RDebugUtils.currentLine=33161227;
 //BA.debugLineNum = 33161227;BA.debugLine="End Sub";
return "";
}
public static String  _btnshowfilterpnl_click() throws Exception{
RDebugUtils.currentModule="act_kala_listi";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnshowfilterpnl_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnshowfilterpnl_click", null));}
RDebugUtils.currentLine=32899072;
 //BA.debugLineNum = 32899072;BA.debugLine="Sub BtnShowFilterPnl_Click";
RDebugUtils.currentLine=32899073;
 //BA.debugLineNum = 32899073;BA.debugLine="If Panel2.Height = Label11.top Then";
if (mostCurrent._panel2.getHeight()==mostCurrent._label11.getTop()) { 
RDebugUtils.currentLine=32899074;
 //BA.debugLineNum = 32899074;BA.debugLine="Panel2.SetLayoutAnimated(500,Panel2.Left,Panel2.";
mostCurrent._panel2.SetLayoutAnimated((int) (500),mostCurrent._panel2.getLeft(),mostCurrent._panel2.getTop(),mostCurrent._panel2.getWidth(),(int) (mostCurrent._lblpoint.getTop()+mostCurrent._lblpoint.getHeight()));
RDebugUtils.currentLine=32899075;
 //BA.debugLineNum = 32899075;BA.debugLine="Pnl_Tools.SetLayoutAnimated(500,Pnl_Tools.Left,P";
mostCurrent._pnl_tools.SetLayoutAnimated((int) (500),mostCurrent._pnl_tools.getLeft(),(int) (mostCurrent._panel2.getTop()+mostCurrent._panel2.getHeight()+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (1),mostCurrent.activityBA)),mostCurrent._pnl_tools.getWidth(),mostCurrent._pnl_tools.getHeight());
RDebugUtils.currentLine=32899076;
 //BA.debugLineNum = 32899076;BA.debugLine="pnl_HLV.SetLayoutAnimated(500,pnl_HLV.Left,Pnl_T";
mostCurrent._pnl_hlv.SetLayoutAnimated((int) (500),mostCurrent._pnl_hlv.getLeft(),(int) (mostCurrent._pnl_tools.getTop()+mostCurrent._pnl_tools.getHeight()),mostCurrent._pnl_hlv.getWidth(),(int) (mostCurrent._pnl_down.getTop()-anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (13),mostCurrent.activityBA)-mostCurrent._pnl_tools.getTop()+mostCurrent._pnl_tools.getHeight()));
RDebugUtils.currentLine=32899077;
 //BA.debugLineNum = 32899077;BA.debugLine="HLV.Height=pnl_HLV.Height";
mostCurrent._hlv.setHeight(mostCurrent._pnl_hlv.getHeight());
 }else {
RDebugUtils.currentLine=32899079;
 //BA.debugLineNum = 32899079;BA.debugLine="Panel2.SetLayoutAnimated(500,Panel2.Left,Panel2.";
mostCurrent._panel2.SetLayoutAnimated((int) (500),mostCurrent._panel2.getLeft(),mostCurrent._panel2.getTop(),mostCurrent._panel2.getWidth(),mostCurrent._label11.getTop());
RDebugUtils.currentLine=32899080;
 //BA.debugLineNum = 32899080;BA.debugLine="Pnl_Tools.SetLayoutAnimated(500,Pnl_Tools.Left,P";
mostCurrent._pnl_tools.SetLayoutAnimated((int) (500),mostCurrent._pnl_tools.getLeft(),(int) (mostCurrent._pnl_top.getTop()+mostCurrent._pnl_top.getHeight()),mostCurrent._pnl_tools.getWidth(),mostCurrent._pnl_tools.getHeight());
RDebugUtils.currentLine=32899081;
 //BA.debugLineNum = 32899081;BA.debugLine="pnl_HLV.SetLayoutAnimated(500,pnl_HLV.Left,Pnl_T";
mostCurrent._pnl_hlv.SetLayoutAnimated((int) (500),mostCurrent._pnl_hlv.getLeft(),(int) (mostCurrent._pnl_tools.getTop()+mostCurrent._pnl_tools.getHeight()),mostCurrent._pnl_hlv.getWidth(),(int) (mostCurrent._pnl_down.getTop()-mostCurrent._pnl_tools.getTop()+mostCurrent._pnl_tools.getHeight()));
RDebugUtils.currentLine=32899082;
 //BA.debugLineNum = 32899082;BA.debugLine="HLV.Height=pnl_HLV.Height - 13%y";
mostCurrent._hlv.setHeight((int) (mostCurrent._pnl_hlv.getHeight()-anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (13),mostCurrent.activityBA)));
 };
RDebugUtils.currentLine=32899084;
 //BA.debugLineNum = 32899084;BA.debugLine="End Sub";
return "";
}
public static String  _btnupdate_click() throws Exception{
RDebugUtils.currentModule="act_kala_listi";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnupdate_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnupdate_click", null));}
RDebugUtils.currentLine=31653888;
 //BA.debugLineNum = 31653888;BA.debugLine="Sub btnUpdate_Click";
RDebugUtils.currentLine=31653889;
 //BA.debugLineNum = 31653889;BA.debugLine="If MCode.IsConnected Then";
if (mostCurrent._mcode._isconnected /*boolean*/ (mostCurrent.activityBA)) { 
RDebugUtils.currentLine=31653890;
 //BA.debugLineNum = 31653890;BA.debugLine="MCode.page=\"Kala_listi\"";
mostCurrent._mcode._page /*String*/  = "Kala_listi";
RDebugUtils.currentLine=31653891;
 //BA.debugLineNum = 31653891;BA.debugLine="FirebaseMessaging.mode=\"GetGalleryKala\"";
mostCurrent._firebasemessaging._mode /*String*/  = "GetGalleryKala";
RDebugUtils.currentLine=31653893;
 //BA.debugLineNum = 31653893;BA.debugLine="StopService(FusedLocationService)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(mostCurrent._fusedlocationservice.getObject()));
RDebugUtils.currentLine=31653894;
 //BA.debugLineNum = 31653894;BA.debugLine="StartService(FirebaseMessaging)";
anywheresoftware.b4a.keywords.Common.StartService(processBA,(Object)(mostCurrent._firebasemessaging.getObject()));
 }else {
RDebugUtils.currentLine=31653897;
 //BA.debugLineNum = 31653897;BA.debugLine="LoadKala";
_loadkala();
 };
RDebugUtils.currentLine=31653900;
 //BA.debugLineNum = 31653900;BA.debugLine="End Sub";
return "";
}
public static String  _cmbbox1_selectedindexchanged(int _index) throws Exception{
RDebugUtils.currentModule="act_kala_listi";
if (Debug.shouldDelegate(mostCurrent.activityBA, "cmbbox1_selectedindexchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "cmbbox1_selectedindexchanged", new Object[] {_index}));}
ir.parsikhesab.pakhsh.mcode._adapterlistnoetasvie _itemtasvie = null;
RDebugUtils.currentLine=34209792;
 //BA.debugLineNum = 34209792;BA.debugLine="Sub CmbBox1_SelectedIndexChanged (Index As Int)";
RDebugUtils.currentLine=34209793;
 //BA.debugLineNum = 34209793;BA.debugLine="Try";
try {RDebugUtils.currentLine=34209794;
 //BA.debugLineNum = 34209794;BA.debugLine="FeeTip = 0";
mostCurrent._feetip = BA.NumberToString(0);
RDebugUtils.currentLine=34209795;
 //BA.debugLineNum = 34209795;BA.debugLine="MCode.feeTip=0";
mostCurrent._mcode._feetip /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=34209796;
 //BA.debugLineNum = 34209796;BA.debugLine="MCode.feeCode=0";
mostCurrent._mcode._feecode /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=34209797;
 //BA.debugLineNum = 34209797;BA.debugLine="If Index=0 Then";
if (_index==0) { 
RDebugUtils.currentLine=34209798;
 //BA.debugLineNum = 34209798;BA.debugLine="LoadKala";
_loadkala();
 }else {
RDebugUtils.currentLine=34209800;
 //BA.debugLineNum = 34209800;BA.debugLine="Dim ItemTasvie As AdapterListNoeTasvie";
_itemtasvie = new ir.parsikhesab.pakhsh.mcode._adapterlistnoetasvie();
RDebugUtils.currentLine=34209801;
 //BA.debugLineNum = 34209801;BA.debugLine="FeeTip = Index";
mostCurrent._feetip = BA.NumberToString(_index);
RDebugUtils.currentLine=34209802;
 //BA.debugLineNum = 34209802;BA.debugLine="MCode.feeTip=Index";
mostCurrent._mcode._feetip /*String*/  = BA.NumberToString(_index);
RDebugUtils.currentLine=34209803;
 //BA.debugLineNum = 34209803;BA.debugLine="ItemTasvie.Initialize";
_itemtasvie.Initialize();
RDebugUtils.currentLine=34209804;
 //BA.debugLineNum = 34209804;BA.debugLine="ItemTasvie=ListTasvie.Get(FeeTip-1)";
_itemtasvie = (ir.parsikhesab.pakhsh.mcode._adapterlistnoetasvie)(mostCurrent._listtasvie.Get((int) ((double)(Double.parseDouble(mostCurrent._feetip))-1)));
RDebugUtils.currentLine=34209806;
 //BA.debugLineNum = 34209806;BA.debugLine="MCode.feeCode=ItemTasvie.FldC_Tasvie";
mostCurrent._mcode._feecode /*String*/  = _itemtasvie.FldC_Tasvie /*String*/ ;
RDebugUtils.currentLine=34209807;
 //BA.debugLineNum = 34209807;BA.debugLine="Log(\"Fee: \"&Index)";
anywheresoftware.b4a.keywords.Common.LogImpl("534209807","Fee: "+BA.NumberToString(_index),0);
RDebugUtils.currentLine=34209809;
 //BA.debugLineNum = 34209809;BA.debugLine="UpdateFee";
_updatefee();
 };
 } 
       catch (Exception e18) {
			processBA.setLastException(e18);RDebugUtils.currentLine=34209812;
 //BA.debugLineNum = 34209812;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("534209812",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=34209813;
 //BA.debugLineNum = 34209813;BA.debugLine="myCode.SendError(LastException,\"Kala_listi-CmbBo";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),"Kala_listi-CmbBox1_SelectedIndexChanged");
 };
RDebugUtils.currentLine=34209816;
 //BA.debugLineNum = 34209816;BA.debugLine="End Sub";
return "";
}
public static void  _updatefee() throws Exception{
RDebugUtils.currentModule="act_kala_listi";
if (Debug.shouldDelegate(mostCurrent.activityBA, "updatefee", false))
	 {Debug.delegate(mostCurrent.activityBA, "updatefee", null); return;}
ResumableSub_UpdateFee rsub = new ResumableSub_UpdateFee(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_UpdateFee extends BA.ResumableSub {
public ResumableSub_UpdateFee(ir.parsikhesab.pakhsh.act_kala_listi parent) {
this.parent = parent;
}
ir.parsikhesab.pakhsh.act_kala_listi parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_kala_listi";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=33554433;
 //BA.debugLineNum = 33554433;BA.debugLine="If MCode.IsConnected Then";
if (true) break;

case 1:
//if
this.state = 6;
if (parent.mostCurrent._mcode._isconnected /*boolean*/ (mostCurrent.activityBA)) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=33554434;
 //BA.debugLineNum = 33554434;BA.debugLine="Log(\"UpdateFee Online\")";
anywheresoftware.b4a.keywords.Common.LogImpl("533554434","UpdateFee Online",0);
RDebugUtils.currentLine=33554435;
 //BA.debugLineNum = 33554435;BA.debugLine="MCode.page=\"Kala_listi\"";
parent.mostCurrent._mcode._page /*String*/  = "Kala_listi";
RDebugUtils.currentLine=33554436;
 //BA.debugLineNum = 33554436;BA.debugLine="FirebaseMessaging.mode=\"GetUpdateFee\"";
parent.mostCurrent._firebasemessaging._mode /*String*/  = "GetUpdateFee";
RDebugUtils.currentLine=33554438;
 //BA.debugLineNum = 33554438;BA.debugLine="StopService(FusedLocationService)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(parent.mostCurrent._fusedlocationservice.getObject()));
RDebugUtils.currentLine=33554439;
 //BA.debugLineNum = 33554439;BA.debugLine="StartService(FirebaseMessaging)";
anywheresoftware.b4a.keywords.Common.StartService(processBA,(Object)(parent.mostCurrent._firebasemessaging.getObject()));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=33554441;
 //BA.debugLineNum = 33554441;BA.debugLine="Log(\"UpdateFee Offline\")";
anywheresoftware.b4a.keywords.Common.LogImpl("533554441","UpdateFee Offline",0);
RDebugUtils.currentLine=33554442;
 //BA.debugLineNum = 33554442;BA.debugLine="UpdateFeeOffline";
_updatefeeoffline();
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=33554445;
 //BA.debugLineNum = 33554445;BA.debugLine="Sleep(200)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_kala_listi", "updatefee"),(int) (200));
this.state = 7;
return;
case 7:
//C
this.state = -1;
;
RDebugUtils.currentLine=33554448;
 //BA.debugLineNum = 33554448;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static int  _hlv_getitemcount() throws Exception{
RDebugUtils.currentModule="act_kala_listi";
if (Debug.shouldDelegate(mostCurrent.activityBA, "hlv_getitemcount", false))
	 {return ((Integer) Debug.delegate(mostCurrent.activityBA, "hlv_getitemcount", null));}
RDebugUtils.currentLine=32243712;
 //BA.debugLineNum = 32243712;BA.debugLine="Sub HLV_GetItemCount As Int 								        '💯 It";
RDebugUtils.currentLine=32243713;
 //BA.debugLineNum = 32243713;BA.debugLine="Return ListKalaTxt.Size";
if (true) return mostCurrent._listkalatxt.getSize();
RDebugUtils.currentLine=32243714;
 //BA.debugLineNum = 32243714;BA.debugLine="End Sub";
return 0;
}
public static String  _hlv_onbindviewholder(anywheresoftware.b4a.objects.PanelWrapper _parent,int _position) throws Exception{
RDebugUtils.currentModule="act_kala_listi";
if (Debug.shouldDelegate(mostCurrent.activityBA, "hlv_onbindviewholder", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "hlv_onbindviewholder", new Object[] {_parent,_position}));}
ir.parsikhesab.pakhsh.mcode._adapterlistkala _item = null;
ir.parsikhesab.pakhsh.cls_reckalalisti _rec = null;
RDebugUtils.currentLine=32374784;
 //BA.debugLineNum = 32374784;BA.debugLine="Sub HLV_onBindViewHolder (Parent As Panel, Positio";
RDebugUtils.currentLine=32374785;
 //BA.debugLineNum = 32374785;BA.debugLine="Dim Item = ListKalaTxt.Get(Position) As AdapterLi";
_item = (ir.parsikhesab.pakhsh.mcode._adapterlistkala)(mostCurrent._listkalatxt.Get(_position));
RDebugUtils.currentLine=32374786;
 //BA.debugLineNum = 32374786;BA.debugLine="Dim rec As Cls_RecKalaListi=Parent.Tag";
_rec = (ir.parsikhesab.pakhsh.cls_reckalalisti)(_parent.getTag());
RDebugUtils.currentLine=32374787;
 //BA.debugLineNum = 32374787;BA.debugLine="rec.Show(Item,Position)";
_rec._show /*String*/ (null,_item,_position);
RDebugUtils.currentLine=32374788;
 //BA.debugLineNum = 32374788;BA.debugLine="Parent.Height=rec.Height";
_parent.setHeight(_rec._getheight /*int*/ (null));
RDebugUtils.currentLine=32374789;
 //BA.debugLineNum = 32374789;BA.debugLine="End Sub";
return "";
}
public static String  _hlv_oncreateviewholder(anywheresoftware.b4a.objects.PanelWrapper _parent,int _viewtype) throws Exception{
RDebugUtils.currentModule="act_kala_listi";
if (Debug.shouldDelegate(mostCurrent.activityBA, "hlv_oncreateviewholder", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "hlv_oncreateviewholder", new Object[] {_parent,_viewtype}));}
ir.parsikhesab.pakhsh.cls_reckalalisti _rec = null;
RDebugUtils.currentLine=32309248;
 //BA.debugLineNum = 32309248;BA.debugLine="Sub HLV_onCreateViewHolder (Parent As Panel, ViewT";
RDebugUtils.currentLine=32309249;
 //BA.debugLineNum = 32309249;BA.debugLine="Dim rec As Cls_RecKalaListi";
_rec = new ir.parsikhesab.pakhsh.cls_reckalalisti();
RDebugUtils.currentLine=32309250;
 //BA.debugLineNum = 32309250;BA.debugLine="rec.Initialize(Me)";
_rec._initialize /*String*/ (null,mostCurrent.activityBA,act_kala_listi.getObject());
RDebugUtils.currentLine=32309251;
 //BA.debugLineNum = 32309251;BA.debugLine="Parent.AddView(rec.Panel,0,0,100%x,rec.Height)";
_parent.AddView((android.view.View)(_rec._getpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ (null).getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),_rec._getheight /*int*/ (null));
RDebugUtils.currentLine=32309252;
 //BA.debugLineNum = 32309252;BA.debugLine="Parent.Tag=rec";
_parent.setTag((Object)(_rec));
RDebugUtils.currentLine=32309253;
 //BA.debugLineNum = 32309253;BA.debugLine="End Sub";
return "";
}
public static void  _img_barcode_click() throws Exception{
RDebugUtils.currentModule="act_kala_listi";
if (Debug.shouldDelegate(mostCurrent.activityBA, "img_barcode_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "img_barcode_click", null); return;}
ResumableSub_Img_barcode_Click rsub = new ResumableSub_Img_barcode_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Img_barcode_Click extends BA.ResumableSub {
public ResumableSub_Img_barcode_Click(ir.parsikhesab.pakhsh.act_kala_listi parent) {
this.parent = parent;
}
ir.parsikhesab.pakhsh.act_kala_listi parent;
boolean _result = false;
String _permission = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_kala_listi";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=32440321;
 //BA.debugLineNum = 32440321;BA.debugLine="Dim Result As Boolean = True";
_result = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=32440322;
 //BA.debugLineNum = 32440322;BA.debugLine="If Not(rp.Check(rp.PERMISSION_CAMERA)) Then";
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
RDebugUtils.currentLine=32440323;
 //BA.debugLineNum = 32440323;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_CAMERA)";
parent._rp.CheckAndRequest(processBA,parent._rp.PERMISSION_CAMERA);
RDebugUtils.currentLine=32440324;
 //BA.debugLineNum = 32440324;BA.debugLine="Wait For Activity_PermissionResult (Permission A";
anywheresoftware.b4a.keywords.Common.WaitFor("activity_permissionresult", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_kala_listi", "img_barcode_click"), null);
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
RDebugUtils.currentLine=32440326;
 //BA.debugLineNum = 32440326;BA.debugLine="If Result=False Then";

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
RDebugUtils.currentLine=32440327;
 //BA.debugLineNum = 32440327;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=32440330;
 //BA.debugLineNum = 32440330;BA.debugLine="Barcode.BeginScan(\"myzx\")";
parent.mostCurrent._barcode.BeginScan(mostCurrent.activityBA,"myzx");
 if (true) break;

case 9:
//C
this.state = -1;
;
RDebugUtils.currentLine=32440332;
 //BA.debugLineNum = 32440332;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _img_paging_click() throws Exception{
RDebugUtils.currentModule="act_kala_listi";
if (Debug.shouldDelegate(mostCurrent.activityBA, "img_paging_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "img_paging_click", null));}
RDebugUtils.currentLine=32768000;
 //BA.debugLineNum = 32768000;BA.debugLine="Private Sub Img_Paging_Click";
RDebugUtils.currentLine=32768001;
 //BA.debugLineNum = 32768001;BA.debugLine="Act_KalaPaging.listKala=ListKalaTxt";
mostCurrent._act_kalapaging._listkala /*anywheresoftware.b4a.objects.collections.List*/  = mostCurrent._listkalatxt;
RDebugUtils.currentLine=32768002;
 //BA.debugLineNum = 32768002;BA.debugLine="StartActivity(Act_KalaPaging)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._act_kalapaging.getObject()));
RDebugUtils.currentLine=32768003;
 //BA.debugLineNum = 32768003;BA.debugLine="End Sub";
return "";
}
public static String  _img_sort_click() throws Exception{
RDebugUtils.currentModule="act_kala_listi";
if (Debug.shouldDelegate(mostCurrent.activityBA, "img_sort_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "img_sort_click", null));}
anywheresoftware.b4a.objects.collections.List _lst = null;
int _res = 0;
RDebugUtils.currentLine=33095680;
 //BA.debugLineNum = 33095680;BA.debugLine="Sub Img_sort_Click";
RDebugUtils.currentLine=33095689;
 //BA.debugLineNum = 33095689;BA.debugLine="Dim Lst As List = Array As String(\"کد کالا\",\"نام";
_lst = new anywheresoftware.b4a.objects.collections.List();
_lst = anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"کد کالا","نام کالا نزولی","نام کالا صعودی","ارزان ترین قیمت","گرانترین قیمت","کمترین موجودی","بیشترین موجودی"});
RDebugUtils.currentLine=33095690;
 //BA.debugLineNum = 33095690;BA.debugLine="Dim res As Int = InputList(Lst,\"مرتب سازی براساس:";
_res = anywheresoftware.b4a.keywords.Common.InputList(_lst,BA.ObjectToCharSequence("مرتب سازی براساس:"),(int) (-1),mostCurrent.activityBA);
RDebugUtils.currentLine=33095691;
 //BA.debugLineNum = 33095691;BA.debugLine="Select Case res";
switch (_res) {
case 0: {
RDebugUtils.currentLine=33095693;
 //BA.debugLineNum = 33095693;BA.debugLine="Str_sort = \" Order by fldCodeKala Asc\"";
mostCurrent._str_sort = " Order by fldCodeKala Asc";
 break; }
case 1: {
RDebugUtils.currentLine=33095695;
 //BA.debugLineNum = 33095695;BA.debugLine="Str_sort = \" Order by fldNameKala\"";
mostCurrent._str_sort = " Order by fldNameKala";
 break; }
case 2: {
RDebugUtils.currentLine=33095697;
 //BA.debugLineNum = 33095697;BA.debugLine="Str_sort = \" Order by fldNameKala Desc\"";
mostCurrent._str_sort = " Order by fldNameKala Desc";
 break; }
case 3: {
RDebugUtils.currentLine=33095699;
 //BA.debugLineNum = 33095699;BA.debugLine="Str_sort = \" Order by fldFeeForoosh\"";
mostCurrent._str_sort = " Order by fldFeeForoosh";
 break; }
case 4: {
RDebugUtils.currentLine=33095701;
 //BA.debugLineNum = 33095701;BA.debugLine="Str_sort = \" Order by fldFeeForoosh Desc\"";
mostCurrent._str_sort = " Order by fldFeeForoosh Desc";
 break; }
case 5: {
RDebugUtils.currentLine=33095703;
 //BA.debugLineNum = 33095703;BA.debugLine="Str_sort = \" Order by SumMande\"";
mostCurrent._str_sort = " Order by SumMande";
 break; }
case 6: {
RDebugUtils.currentLine=33095705;
 //BA.debugLineNum = 33095705;BA.debugLine="Str_sort = \" Order by SumMande Desc\"";
mostCurrent._str_sort = " Order by SumMande Desc";
 break; }
}
;
RDebugUtils.currentLine=33095707;
 //BA.debugLineNum = 33095707;BA.debugLine="Log(Str_sort)";
anywheresoftware.b4a.keywords.Common.LogImpl("533095707",mostCurrent._str_sort,0);
RDebugUtils.currentLine=33095709;
 //BA.debugLineNum = 33095709;BA.debugLine="LoadKala";
_loadkala();
RDebugUtils.currentLine=33095711;
 //BA.debugLineNum = 33095711;BA.debugLine="End Sub";
return "";
}
public static void  _img_tipfee_click() throws Exception{
RDebugUtils.currentModule="act_kala_listi";
if (Debug.shouldDelegate(mostCurrent.activityBA, "img_tipfee_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "img_tipfee_click", null); return;}
ResumableSub_Img_TipFee_Click rsub = new ResumableSub_Img_TipFee_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Img_TipFee_Click extends BA.ResumableSub {
public ResumableSub_Img_TipFee_Click(ir.parsikhesab.pakhsh.act_kala_listi parent) {
this.parent = parent;
}
ir.parsikhesab.pakhsh.act_kala_listi parent;
anywheresoftware.b4a.objects.collections.List _lst = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
String[] _somearray = null;
int _i = 0;
int _result = 0;
int _res = 0;
ir.parsikhesab.pakhsh.mcode._adapterlistnoetasvie _itemtasvie = null;
int step7;
int limit7;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_kala_listi";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=33488897;
 //BA.debugLineNum = 33488897;BA.debugLine="Dim Lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=33488898;
 //BA.debugLineNum = 33488898;BA.debugLine="Lst.Initialize";
_lst.Initialize();
RDebugUtils.currentLine=33488899;
 //BA.debugLineNum = 33488899;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From Tb";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = parent.mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblTasvie");
RDebugUtils.currentLine=33488900;
 //BA.debugLineNum = 33488900;BA.debugLine="If Cu.RowCount>0 Then";
if (true) break;

case 1:
//if
this.state = 22;
if (_cu.getRowCount()>0) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=33488901;
 //BA.debugLineNum = 33488901;BA.debugLine="Dim SomeArray(Cu.RowCount+1) As String";
_somearray = new String[(int) (_cu.getRowCount()+1)];
java.util.Arrays.fill(_somearray,"");
RDebugUtils.currentLine=33488902;
 //BA.debugLineNum = 33488902;BA.debugLine="SomeArray(0)=\"انتخاب کنید\"";
_somearray[(int) (0)] = "انتخاب کنید";
RDebugUtils.currentLine=33488903;
 //BA.debugLineNum = 33488903;BA.debugLine="For i = 0 To Cu.RowCount-1";
if (true) break;

case 4:
//for
this.state = 7;
step7 = 1;
limit7 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
this.state = 23;
if (true) break;

case 23:
//C
this.state = 7;
if ((step7 > 0 && _i <= limit7) || (step7 < 0 && _i >= limit7)) this.state = 6;
if (true) break;

case 24:
//C
this.state = 23;
_i = ((int)(0 + _i + step7)) ;
if (true) break;

case 6:
//C
this.state = 24;
RDebugUtils.currentLine=33488904;
 //BA.debugLineNum = 33488904;BA.debugLine="Cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=33488905;
 //BA.debugLineNum = 33488905;BA.debugLine="SomeArray(i+1)=Cu.GetString(\"FldName\")";
_somearray[(int) (_i+1)] = _cu.GetString("FldName");
 if (true) break;
if (true) break;

case 7:
//C
this.state = 8;
;
RDebugUtils.currentLine=33488907;
 //BA.debugLineNum = 33488907;BA.debugLine="Lst.Initialize2(SomeArray)";
_lst.Initialize2(anywheresoftware.b4a.keywords.Common.ArrayToList(_somearray));
RDebugUtils.currentLine=33488908;
 //BA.debugLineNum = 33488908;BA.debugLine="InputListAsync(Lst,\"تیپ قیمت را انتخاب کنید\",Fee";
anywheresoftware.b4a.keywords.Common.InputListAsync(_lst,BA.ObjectToCharSequence("تیپ قیمت را انتخاب کنید"),(int)(Double.parseDouble(parent.mostCurrent._feetip)),processBA,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=33488909;
 //BA.debugLineNum = 33488909;BA.debugLine="Wait For InputList_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("inputlist_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_kala_listi", "img_tipfee_click"), null);
this.state = 25;
return;
case 25:
//C
this.state = 8;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=33488910;
 //BA.debugLineNum = 33488910;BA.debugLine="If Result <> -3 Then";
if (true) break;

case 8:
//if
this.state = 21;
if (_result!=-3) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=33488911;
 //BA.debugLineNum = 33488911;BA.debugLine="Dim Res As Int=Msgbox2(\"توجه داشته باشید که با";
_res = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("توجه داشته باشید که با تغییر تیپ قیمت سبد خرید شما حذف می گردد، آیا می خواهید تیپ قیمت تغییر کند؟"),BA.ObjectToCharSequence("توجه"),"بله","","خیر",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=33488912;
 //BA.debugLineNum = 33488912;BA.debugLine="If Res = DialogResponse.POSITIVE Then";
if (true) break;

case 11:
//if
this.state = 20;
if (_res==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=33488914;
 //BA.debugLineNum = 33488914;BA.debugLine="If Result=0 Then";
if (true) break;

case 14:
//if
this.state = 19;
if (_result==0) { 
this.state = 16;
}else {
this.state = 18;
}if (true) break;

case 16:
//C
this.state = 19;
RDebugUtils.currentLine=33488915;
 //BA.debugLineNum = 33488915;BA.debugLine="FeeTip = 0";
parent.mostCurrent._feetip = BA.NumberToString(0);
RDebugUtils.currentLine=33488916;
 //BA.debugLineNum = 33488916;BA.debugLine="MCode.feeTip=0";
parent.mostCurrent._mcode._feetip /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=33488917;
 //BA.debugLineNum = 33488917;BA.debugLine="MCode.feeCode=0";
parent.mostCurrent._mcode._feecode /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=33488918;
 //BA.debugLineNum = 33488918;BA.debugLine="LoadKala";
_loadkala();
 if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=33488920;
 //BA.debugLineNum = 33488920;BA.debugLine="Dim ItemTasvie As AdapterListNoeTasvie";
_itemtasvie = new ir.parsikhesab.pakhsh.mcode._adapterlistnoetasvie();
RDebugUtils.currentLine=33488921;
 //BA.debugLineNum = 33488921;BA.debugLine="ItemTasvie.Initialize";
_itemtasvie.Initialize();
RDebugUtils.currentLine=33488922;
 //BA.debugLineNum = 33488922;BA.debugLine="ItemTasvie=ListTasvie.Get(FeeTip)";
_itemtasvie = (ir.parsikhesab.pakhsh.mcode._adapterlistnoetasvie)(parent.mostCurrent._listtasvie.Get((int)(Double.parseDouble(parent.mostCurrent._feetip))));
RDebugUtils.currentLine=33488923;
 //BA.debugLineNum = 33488923;BA.debugLine="FeeTip = Result";
parent.mostCurrent._feetip = BA.NumberToString(_result);
RDebugUtils.currentLine=33488924;
 //BA.debugLineNum = 33488924;BA.debugLine="MCode.feeTip=Result";
parent.mostCurrent._mcode._feetip /*String*/  = BA.NumberToString(_result);
RDebugUtils.currentLine=33488925;
 //BA.debugLineNum = 33488925;BA.debugLine="MCode.feeCode=ItemTasvie.FldC_Tasvie";
parent.mostCurrent._mcode._feecode /*String*/  = _itemtasvie.FldC_Tasvie /*String*/ ;
RDebugUtils.currentLine=33488926;
 //BA.debugLineNum = 33488926;BA.debugLine="Log(\"Fee: \"&Result)";
anywheresoftware.b4a.keywords.Common.LogImpl("533488926","Fee: "+BA.NumberToString(_result),0);
RDebugUtils.currentLine=33488928;
 //BA.debugLineNum = 33488928;BA.debugLine="UpdateFee";
_updatefee();
 if (true) break;

case 19:
//C
this.state = 20;
;
 if (true) break;

case 20:
//C
this.state = 21;
;
 if (true) break;

case 21:
//C
this.state = 22;
;
 if (true) break;

case 22:
//C
this.state = -1;
;
RDebugUtils.currentLine=33488937;
 //BA.debugLineNum = 33488937;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _lbltedadjoz_click(ir.parsikhesab.pakhsh.mcode._adapterlistkala _item) throws Exception{
RDebugUtils.currentModule="act_kala_listi";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lbltedadjoz_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "lbltedadjoz_click", new Object[] {_item}); return;}
ResumableSub_LblTedadJoz_Click rsub = new ResumableSub_LblTedadJoz_Click(null,_item);
rsub.resume(processBA, null);
}
public static class ResumableSub_LblTedadJoz_Click extends BA.ResumableSub {
public ResumableSub_LblTedadJoz_Click(ir.parsikhesab.pakhsh.act_kala_listi parent,ir.parsikhesab.pakhsh.mcode._adapterlistkala _item) {
this.parent = parent;
this._item = _item;
}
ir.parsikhesab.pakhsh.act_kala_listi parent;
ir.parsikhesab.pakhsh.mcode._adapterlistkala _item;
ir.parsikhesab.pakhsh.b4xinputtemplate _input = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rs = null;
int _result = 0;
float _res = 0f;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_kala_listi";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=33816577;
 //BA.debugLineNum = 33816577;BA.debugLine="Dialog.Title = \"  \"";
parent.mostCurrent._dialog._title /*Object*/  = (Object)("  ");
RDebugUtils.currentLine=33816578;
 //BA.debugLineNum = 33816578;BA.debugLine="Dim input As B4XInputTemplate";
_input = new ir.parsikhesab.pakhsh.b4xinputtemplate();
RDebugUtils.currentLine=33816579;
 //BA.debugLineNum = 33816579;BA.debugLine="input.Initialize";
_input._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=33816580;
 //BA.debugLineNum = 33816580;BA.debugLine="input.lblTitle.Text = \" تعداد \"&Item.NameVahed";
_input._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(" تعداد "+_item.NameVahed /*String*/ ));
RDebugUtils.currentLine=33816581;
 //BA.debugLineNum = 33816581;BA.debugLine="Log(MCode.isFloat)";
anywheresoftware.b4a.keywords.Common.LogImpl("533816581",BA.ObjectToString(parent.mostCurrent._mcode._isfloat /*boolean*/ ),0);
RDebugUtils.currentLine=33816583;
 //BA.debugLineNum = 33816583;BA.debugLine="Select Case MCode.isFloat";
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
RDebugUtils.currentLine=33816585;
 //BA.debugLineNum = 33816585;BA.debugLine="input.ConfigureForNumbers(True, True)";
_input._configurefornumbers /*String*/ (null,anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=33816587;
 //BA.debugLineNum = 33816587;BA.debugLine="input.ConfigureForNumbers(False, True)";
_input._configurefornumbers /*String*/ (null,anywheresoftware.b4a.keywords.Common.False,anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=33816590;
 //BA.debugLineNum = 33816590;BA.debugLine="Dim rs As ResumableSub =Dialog.ShowTemplate(input";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = parent.mostCurrent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_input),(Object)("OK"),(Object)(""),(Object)("CANCEL"));
RDebugUtils.currentLine=33816591;
 //BA.debugLineNum = 33816591;BA.debugLine="Dialog.Base.Top = 50%y - Dialog.Base.Height / 2";
parent.mostCurrent._dialog._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTop((int) (anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (50),mostCurrent.activityBA)-parent.mostCurrent._dialog._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2));
RDebugUtils.currentLine=33816592;
 //BA.debugLineNum = 33816592;BA.debugLine="Wait For (rs) Complete (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_kala_listi", "lbltedadjoz_click"), _rs);
this.state = 27;
return;
case 27:
//C
this.state = 7;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=33816593;
 //BA.debugLineNum = 33816593;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=33816594;
 //BA.debugLineNum = 33816594;BA.debugLine="Dim res As Float = input.Text 'no need to check";
_res = (float)(Double.parseDouble(_input._text /*String*/ ));
RDebugUtils.currentLine=33816595;
 //BA.debugLineNum = 33816595;BA.debugLine="If res>=0 Then";
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
RDebugUtils.currentLine=33816596;
 //BA.debugLineNum = 33816596;BA.debugLine="If MCode.ForooshBishAzMojoodi = \"1\" Then";
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
RDebugUtils.currentLine=33816597;
 //BA.debugLineNum = 33816597;BA.debugLine="Item.SumMande = Item.SumMande - (res-Item.Teda";
_item.SumMande /*String*/  = BA.NumberToString((double)(Double.parseDouble(_item.SumMande /*String*/ ))-(_res-(double)(Double.parseDouble(_item.TedadDarSabadJoz /*String*/ ))));
RDebugUtils.currentLine=33816598;
 //BA.debugLineNum = 33816598;BA.debugLine="Item.TedadDarSabadJoz = res";
_item.TedadDarSabadJoz /*String*/  = BA.NumberToString(_res);
RDebugUtils.currentLine=33816599;
 //BA.debugLineNum = 33816599;BA.debugLine="AddToSabad(Item)";
_addtosabad(_item);
 if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=33816601;
 //BA.debugLineNum = 33816601;BA.debugLine="If (Item.SumMande + Item.TedadDarSabadJoz) >=";
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
RDebugUtils.currentLine=33816602;
 //BA.debugLineNum = 33816602;BA.debugLine="Item.SumMande = Item.SumMande - (res-Item.Ted";
_item.SumMande /*String*/  = BA.NumberToString((double)(Double.parseDouble(_item.SumMande /*String*/ ))-(_res-(double)(Double.parseDouble(_item.TedadDarSabadJoz /*String*/ ))));
RDebugUtils.currentLine=33816603;
 //BA.debugLineNum = 33816603;BA.debugLine="Item.TedadDarSabadJoz = res";
_item.TedadDarSabadJoz /*String*/  = BA.NumberToString(_res);
RDebugUtils.currentLine=33816604;
 //BA.debugLineNum = 33816604;BA.debugLine="AddToSabad(Item)";
_addtosabad(_item);
 if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=33816606;
 //BA.debugLineNum = 33816606;BA.debugLine="ToastMessageShow(\"سفارش شما بیشتر از موجودی م";
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
RDebugUtils.currentLine=33816612;
 //BA.debugLineNum = 33816612;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _lbltedadkol_click(ir.parsikhesab.pakhsh.mcode._adapterlistkala _item) throws Exception{
RDebugUtils.currentModule="act_kala_listi";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lbltedadkol_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "lbltedadkol_click", new Object[] {_item}); return;}
ResumableSub_LblTedadkol_Click rsub = new ResumableSub_LblTedadkol_Click(null,_item);
rsub.resume(processBA, null);
}
public static class ResumableSub_LblTedadkol_Click extends BA.ResumableSub {
public ResumableSub_LblTedadkol_Click(ir.parsikhesab.pakhsh.act_kala_listi parent,ir.parsikhesab.pakhsh.mcode._adapterlistkala _item) {
this.parent = parent;
this._item = _item;
}
ir.parsikhesab.pakhsh.act_kala_listi parent;
ir.parsikhesab.pakhsh.mcode._adapterlistkala _item;
ir.parsikhesab.pakhsh.b4xinputtemplate _input = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rs = null;
int _result = 0;
float _res = 0f;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_kala_listi";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=33882113;
 //BA.debugLineNum = 33882113;BA.debugLine="Dialog.Title = \"  \"";
parent.mostCurrent._dialog._title /*Object*/  = (Object)("  ");
RDebugUtils.currentLine=33882114;
 //BA.debugLineNum = 33882114;BA.debugLine="Dim input As B4XInputTemplate";
_input = new ir.parsikhesab.pakhsh.b4xinputtemplate();
RDebugUtils.currentLine=33882115;
 //BA.debugLineNum = 33882115;BA.debugLine="input.Initialize";
_input._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=33882116;
 //BA.debugLineNum = 33882116;BA.debugLine="input.lblTitle.Text = \" تعداد \"&Item.NameVahed2";
_input._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(" تعداد "+_item.NameVahed2 /*String*/ ));
RDebugUtils.currentLine=33882117;
 //BA.debugLineNum = 33882117;BA.debugLine="input.ConfigureForNumbers(True, True)";
_input._configurefornumbers /*String*/ (null,anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=33882119;
 //BA.debugLineNum = 33882119;BA.debugLine="Dim rs As ResumableSub =Dialog.ShowTemplate(input";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = parent.mostCurrent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_input),(Object)("OK"),(Object)(""),(Object)("CANCEL"));
RDebugUtils.currentLine=33882120;
 //BA.debugLineNum = 33882120;BA.debugLine="Dialog.Base.Top = 50%y - Dialog.Base.Height / 2";
parent.mostCurrent._dialog._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTop((int) (anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (50),mostCurrent.activityBA)-parent.mostCurrent._dialog._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2));
RDebugUtils.currentLine=33882121;
 //BA.debugLineNum = 33882121;BA.debugLine="Wait For (rs) Complete (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_kala_listi", "lbltedadkol_click"), _rs);
this.state = 21;
return;
case 21:
//C
this.state = 1;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=33882122;
 //BA.debugLineNum = 33882122;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=33882123;
 //BA.debugLineNum = 33882123;BA.debugLine="Dim res As Float = input.Text 'no need to check";
_res = (float)(Double.parseDouble(_input._text /*String*/ ));
RDebugUtils.currentLine=33882124;
 //BA.debugLineNum = 33882124;BA.debugLine="If res>=0 Then";
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
RDebugUtils.currentLine=33882125;
 //BA.debugLineNum = 33882125;BA.debugLine="If MCode.ForooshBishAzMojoodi = \"1\" Then";
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
RDebugUtils.currentLine=33882126;
 //BA.debugLineNum = 33882126;BA.debugLine="Item.SumMande = Item.SumMande - ((res*Item.Ted";
_item.SumMande /*String*/  = BA.NumberToString((double)(Double.parseDouble(_item.SumMande /*String*/ ))-((_res*(double)(Double.parseDouble(_item.TedadDarKarton /*String*/ )))-((double)(Double.parseDouble(_item.TedadDarSabadKol /*String*/ ))*(double)(Double.parseDouble(_item.TedadDarKarton /*String*/ )))));
RDebugUtils.currentLine=33882127;
 //BA.debugLineNum = 33882127;BA.debugLine="Item.TedadDarSabadKol = res";
_item.TedadDarSabadKol /*String*/  = BA.NumberToString(_res);
RDebugUtils.currentLine=33882128;
 //BA.debugLineNum = 33882128;BA.debugLine="AddToSabad(Item)";
_addtosabad(_item);
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=33882130;
 //BA.debugLineNum = 33882130;BA.debugLine="If (Item.SumMande + (Item.TedadDarSabadKol*Ite";
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
RDebugUtils.currentLine=33882131;
 //BA.debugLineNum = 33882131;BA.debugLine="Item.SumMande = Item.SumMande - ((res*Item.Te";
_item.SumMande /*String*/  = BA.NumberToString((double)(Double.parseDouble(_item.SumMande /*String*/ ))-((_res*(double)(Double.parseDouble(_item.TedadDarKarton /*String*/ )))-((double)(Double.parseDouble(_item.TedadDarSabadKol /*String*/ ))*(double)(Double.parseDouble(_item.TedadDarKarton /*String*/ )))));
RDebugUtils.currentLine=33882132;
 //BA.debugLineNum = 33882132;BA.debugLine="Item.TedadDarSabadKol = res";
_item.TedadDarSabadKol /*String*/  = BA.NumberToString(_res);
RDebugUtils.currentLine=33882133;
 //BA.debugLineNum = 33882133;BA.debugLine="AddToSabad(Item)";
_addtosabad(_item);
 if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=33882135;
 //BA.debugLineNum = 33882135;BA.debugLine="ToastMessageShow(\"سفارش شما بیشتر از موجودی م";
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
RDebugUtils.currentLine=33882140;
 //BA.debugLineNum = 33882140;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _loadlistkala(String _query) throws Exception{
RDebugUtils.currentModule="act_kala_listi";
if (Debug.shouldDelegate(mostCurrent.activityBA, "loadlistkala", false))
	 {Debug.delegate(mostCurrent.activityBA, "loadlistkala", new Object[] {_query}); return;}
ResumableSub_LoadListKala rsub = new ResumableSub_LoadListKala(null,_query);
rsub.resume(processBA, null);
}
public static class ResumableSub_LoadListKala extends BA.ResumableSub {
public ResumableSub_LoadListKala(ir.parsikhesab.pakhsh.act_kala_listi parent,String _query) {
this.parent = parent;
this._query = _query;
}
ir.parsikhesab.pakhsh.act_kala_listi parent;
String _query;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
int _i = 0;
ir.parsikhesab.pakhsh.mcode._adapterlistkala _itemkala = null;
String _fee = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu1 = null;
int _fldfeeforoosh = 0;
int _fldtedaddarkarton = 0;
int _summande = 0;
int step6;
int limit6;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_kala_listi";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=31981571;
 //BA.debugLineNum = 31981571;BA.debugLine="StopService(FusedLocationService)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(parent.mostCurrent._fusedlocationservice.getObject()));
RDebugUtils.currentLine=31981572;
 //BA.debugLineNum = 31981572;BA.debugLine="OrginalListKala.Clear";
parent.mostCurrent._orginallistkala.Clear();
RDebugUtils.currentLine=31981573;
 //BA.debugLineNum = 31981573;BA.debugLine="MCode.Sql1.Initialize(File.DirDefaultExternal &\"/";
parent.mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Initialize(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal()+"/Parsik","parsik_db.db",anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=31981576;
 //BA.debugLineNum = 31981576;BA.debugLine="Dim Cu As Cursor = MCode.Result(Query)";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = parent.mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,_query);
RDebugUtils.currentLine=31981577;
 //BA.debugLineNum = 31981577;BA.debugLine="If Cu.RowCount > 0 Then";
if (true) break;

case 1:
//if
this.state = 61;
if (_cu.getRowCount()>0) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=31981579;
 //BA.debugLineNum = 31981579;BA.debugLine="For i = 0 To Cu.RowCount - 1";
if (true) break;

case 4:
//for
this.state = 60;
step6 = 1;
limit6 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
this.state = 62;
if (true) break;

case 62:
//C
this.state = 60;
if ((step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6)) this.state = 6;
if (true) break;

case 63:
//C
this.state = 62;
_i = ((int)(0 + _i + step6)) ;
if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=31981580;
 //BA.debugLineNum = 31981580;BA.debugLine="Dim ItemKala As AdapterListKala";
_itemkala = new ir.parsikhesab.pakhsh.mcode._adapterlistkala();
RDebugUtils.currentLine=31981581;
 //BA.debugLineNum = 31981581;BA.debugLine="Cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=31981582;
 //BA.debugLineNum = 31981582;BA.debugLine="ItemKala.CodeKala=Cu.Getstring(\"fldCodeKala\")";
_itemkala.CodeKala /*String*/  = _cu.GetString("fldCodeKala");
RDebugUtils.currentLine=31981583;
 //BA.debugLineNum = 31981583;BA.debugLine="ItemKala.NameKala=Cu.Getstring(\"fldNameKala\")";
_itemkala.NameKala /*String*/  = _cu.GetString("fldNameKala");
RDebugUtils.currentLine=31981584;
 //BA.debugLineNum = 31981584;BA.debugLine="ItemKala.NameVahed=Cu.Getstring(\"fldNameVahed\")";
_itemkala.NameVahed /*String*/  = _cu.GetString("fldNameVahed");
RDebugUtils.currentLine=31981585;
 //BA.debugLineNum = 31981585;BA.debugLine="ItemKala.NameVahed2=Cu.Getstring(\"fldNameVahed2";
_itemkala.NameVahed2 /*String*/  = _cu.GetString("fldNameVahed2");
RDebugUtils.currentLine=31981586;
 //BA.debugLineNum = 31981586;BA.debugLine="ItemKala.SumMande=Cu.Getstring(\"SumMande\")";
_itemkala.SumMande /*String*/  = _cu.GetString("SumMande");
RDebugUtils.currentLine=31981599;
 //BA.debugLineNum = 31981599;BA.debugLine="ItemKala.TedadDarKarton =Cu.Getstring(\"fldTedad";
_itemkala.TedadDarKarton /*String*/  = _cu.GetString("fldTedadDarKarton");
RDebugUtils.currentLine=31981600;
 //BA.debugLineNum = 31981600;BA.debugLine="Dim fee As String";
_fee = "";
RDebugUtils.currentLine=31981601;
 //BA.debugLineNum = 31981601;BA.debugLine="If MCode.feeTip=0 Then";
if (true) break;

case 7:
//if
this.state = 26;
if ((parent.mostCurrent._mcode._feetip /*String*/ ).equals(BA.NumberToString(0))) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 26;
RDebugUtils.currentLine=31981602;
 //BA.debugLineNum = 31981602;BA.debugLine="fee=Cu.GetInt(\"fldFeeForoosh\")";
_fee = BA.NumberToString(_cu.GetInt("fldFeeForoosh"));
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=31981608;
 //BA.debugLineNum = 31981608;BA.debugLine="fee=myCode.Is_Null_adad(Cu.GetString(\"fldFeeTa";
_fee = parent.mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_cu.GetString("fldFeeTasvie"));
RDebugUtils.currentLine=31981609;
 //BA.debugLineNum = 31981609;BA.debugLine="MCode.UpdateFeeSabad(fee,ItemKala.CodeKala)";
parent.mostCurrent._mcode._updatefeesabad /*String*/ (mostCurrent.activityBA,_fee,_itemkala.CodeKala /*String*/ );
RDebugUtils.currentLine=31981610;
 //BA.debugLineNum = 31981610;BA.debugLine="If 	IsNumber(fee) And fee>0 Then";
if (true) break;

case 12:
//if
this.state = 25;
if (anywheresoftware.b4a.keywords.Common.IsNumber(_fee) && (double)(Double.parseDouble(_fee))>0) { 
this.state = 14;
}else {
this.state = 24;
}if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=31981611;
 //BA.debugLineNum = 31981611;BA.debugLine="Log(Cu.GetString(\"fldFeeTasvie\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("531981611",_cu.GetString("fldFeeTasvie"),0);
RDebugUtils.currentLine=31981613;
 //BA.debugLineNum = 31981613;BA.debugLine="If  fee>Cu.GetString(\"fldFeeBadAzTakhfif\") Th";
if (true) break;

case 15:
//if
this.state = 22;
if ((double)(Double.parseDouble(_fee))>(double)(Double.parseDouble(_cu.GetString("fldFeeBadAzTakhfif")))) { 
this.state = 17;
}else 
{RDebugUtils.currentLine=31981616;
 //BA.debugLineNum = 31981616;BA.debugLine="Else if fee<Cu.GetString(\"fldFeeBadAzTakhfif\"";
if ((double)(Double.parseDouble(_fee))<(double)(Double.parseDouble(_cu.GetString("fldFeeBadAzTakhfif")))) { 
this.state = 19;
}else {
this.state = 21;
}}
if (true) break;

case 17:
//C
this.state = 22;
RDebugUtils.currentLine=31981615;
 //BA.debugLineNum = 31981615;BA.debugLine="ItemKala.fldFeeBadAzTakhfif=\"0\"";
_itemkala.fldFeeBadAzTakhfif /*String*/  = "0";
 if (true) break;

case 19:
//C
this.state = 22;
RDebugUtils.currentLine=31981617;
 //BA.debugLineNum = 31981617;BA.debugLine="ItemKala.fldFeeBadAzTakhfif=fee";
_itemkala.fldFeeBadAzTakhfif /*String*/  = _fee;
RDebugUtils.currentLine=31981618;
 //BA.debugLineNum = 31981618;BA.debugLine="fee=Cu.GetInt(\"fldFeeForoosh\")";
_fee = BA.NumberToString(_cu.GetInt("fldFeeForoosh"));
 if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=31981622;
 //BA.debugLineNum = 31981622;BA.debugLine="ItemKala.fldFeeBadAzTakhfif=Cu.GetString(\"fl";
_itemkala.fldFeeBadAzTakhfif /*String*/  = _cu.GetString("fldFeeBadAzTakhfif");
RDebugUtils.currentLine=31981623;
 //BA.debugLineNum = 31981623;BA.debugLine="fee=Cu.GetInt(\"fldFeeForoosh\")";
_fee = BA.NumberToString(_cu.GetInt("fldFeeForoosh"));
 if (true) break;

case 22:
//C
this.state = 25;
;
 if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=31981627;
 //BA.debugLineNum = 31981627;BA.debugLine="fee=Cu.GetInt(\"fldFeeForoosh\")";
_fee = BA.NumberToString(_cu.GetInt("fldFeeForoosh"));
 if (true) break;

case 25:
//C
this.state = 26;
;
 if (true) break;

case 26:
//C
this.state = 27;
;
RDebugUtils.currentLine=31981631;
 //BA.debugLineNum = 31981631;BA.debugLine="fee=MCode.GetUpdateFeeSabad(fee,ItemKala.CodeKa";
_fee = parent.mostCurrent._mcode._getupdatefeesabad /*String*/ (mostCurrent.activityBA,_fee,_itemkala.CodeKala /*String*/ );
RDebugUtils.currentLine=31981632;
 //BA.debugLineNum = 31981632;BA.debugLine="If Cu.GetString(\"fldFeeBadAzTakhfif\")<>Null The";
if (true) break;

case 27:
//if
this.state = 32;
if (_cu.GetString("fldFeeBadAzTakhfif")!= null) { 
this.state = 29;
}else {
this.state = 31;
}if (true) break;

case 29:
//C
this.state = 32;
RDebugUtils.currentLine=31981634;
 //BA.debugLineNum = 31981634;BA.debugLine="ItemKala.fldFeeBadAzTakhfif=Cu.GetString(\"fldF";
_itemkala.fldFeeBadAzTakhfif /*String*/  = _cu.GetString("fldFeeBadAzTakhfif");
 if (true) break;

case 31:
//C
this.state = 32;
RDebugUtils.currentLine=31981638;
 //BA.debugLineNum = 31981638;BA.debugLine="ItemKala.fldFeeBadAzTakhfif=\"0\"";
_itemkala.fldFeeBadAzTakhfif /*String*/  = "0";
 if (true) break;
;
RDebugUtils.currentLine=31981640;
 //BA.debugLineNum = 31981640;BA.debugLine="If ItemKala.MablaghTakhfif>0 Then";

case 32:
//if
this.state = 35;
if (_itemkala.MablaghTakhfif /*int*/ >0) { 
this.state = 34;
}if (true) break;

case 34:
//C
this.state = 35;
RDebugUtils.currentLine=31981641;
 //BA.debugLineNum = 31981641;BA.debugLine="ItemKala.fldFeeBadAzTakhfif=fee-ItemKala.Mabla";
_itemkala.fldFeeBadAzTakhfif /*String*/  = BA.NumberToString((double)(Double.parseDouble(_fee))-_itemkala.MablaghTakhfif /*int*/ );
 if (true) break;

case 35:
//C
this.state = 36;
;
RDebugUtils.currentLine=31981643;
 //BA.debugLineNum = 31981643;BA.debugLine="ItemKala.FeeForoosh=fee";
_itemkala.FeeForoosh /*int*/  = (int)(Double.parseDouble(_fee));
RDebugUtils.currentLine=31981646;
 //BA.debugLineNum = 31981646;BA.debugLine="ItemKala.FldMablaghMasrafKonande=Cu.GetString(\"";
_itemkala.FldMablaghMasrafKonande /*String*/  = _cu.GetString("fldGhymatMasrafkonande");
RDebugUtils.currentLine=31981649;
 //BA.debugLineNum = 31981649;BA.debugLine="ItemKala.fldPathPic=Cu.GetString(\"fldPathPic\")";
_itemkala.fldPathPic /*String*/  = _cu.GetString("fldPathPic");
RDebugUtils.currentLine=31981650;
 //BA.debugLineNum = 31981650;BA.debugLine="Dim cu1 As Cursor=MCode.Result(\"select * from T";
_cu1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu1 = parent.mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"select * from TblSabad where FldCodeKala="+_itemkala.CodeKala /*String*/ );
RDebugUtils.currentLine=31981651;
 //BA.debugLineNum = 31981651;BA.debugLine="If cu1.RowCount>0 Then";
if (true) break;

case 36:
//if
this.state = 59;
if (_cu1.getRowCount()>0) { 
this.state = 38;
}else {
this.state = 54;
}if (true) break;

case 38:
//C
this.state = 39;
RDebugUtils.currentLine=31981652;
 //BA.debugLineNum = 31981652;BA.debugLine="cu1.Position=0";
_cu1.setPosition((int) (0));
RDebugUtils.currentLine=31981653;
 //BA.debugLineNum = 31981653;BA.debugLine="FeeTip=MCode.feeTip";
parent.mostCurrent._feetip = parent.mostCurrent._mcode._feetip /*String*/ ;
RDebugUtils.currentLine=31981654;
 //BA.debugLineNum = 31981654;BA.debugLine="ItemKala.TedadDarSabadJoz =cu1.Getstring(\"FldT";
_itemkala.TedadDarSabadJoz /*String*/  = _cu1.GetString("FldTedadDarSabadJoz");
RDebugUtils.currentLine=31981655;
 //BA.debugLineNum = 31981655;BA.debugLine="ItemKala.TedadDarSabadKol =cu1.Getstring(\"FldT";
_itemkala.TedadDarSabadKol /*String*/  = _cu1.GetString("FldTedadDarSabadKol");
RDebugUtils.currentLine=31981656;
 //BA.debugLineNum = 31981656;BA.debugLine="ItemKala.SumMande=Cu.Getstring(\"SumMande\")-cu1";
_itemkala.SumMande /*String*/  = BA.NumberToString((double)(Double.parseDouble(_cu.GetString("SumMande")))-(double)(Double.parseDouble(_cu1.GetString("FldTedadDarSabadJoz"))));
RDebugUtils.currentLine=31981657;
 //BA.debugLineNum = 31981657;BA.debugLine="If Cu.Getstring(\"fldNameVahed2\") <> \"\" Then";
if (true) break;

case 39:
//if
this.state = 42;
if ((_cu.GetString("fldNameVahed2")).equals("") == false) { 
this.state = 41;
}if (true) break;

case 41:
//C
this.state = 42;
RDebugUtils.currentLine=31981658;
 //BA.debugLineNum = 31981658;BA.debugLine="Dim FldFeeForoosh As Int = MCode.Sf.Val(Cu.Ge";
_fldfeeforoosh = (int) (parent.mostCurrent._mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvvvv1(BA.NumberToString(_cu.GetInt("fldFeeForoosh"))));
RDebugUtils.currentLine=31981659;
 //BA.debugLineNum = 31981659;BA.debugLine="Dim FldTedadDarKarton As Int = MCode.Sf.Val(c";
_fldtedaddarkarton = (int) (parent.mostCurrent._mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvvvv1(_cu1.GetString("FldTedadDarSabadKol")));
RDebugUtils.currentLine=31981660;
 //BA.debugLineNum = 31981660;BA.debugLine="Dim SumMande As Int = Cu.Getstring(\"SumMande\"";
_summande = (int)(Double.parseDouble(_cu.GetString("SumMande")));
RDebugUtils.currentLine=31981661;
 //BA.debugLineNum = 31981661;BA.debugLine="ItemKala.FeeForooshKarton=FldFeeForoosh * Fld";
_itemkala.FeeForooshKarton /*String*/  = BA.NumberToString(_fldfeeforoosh*_fldtedaddarkarton);
RDebugUtils.currentLine=31981662;
 //BA.debugLineNum = 31981662;BA.debugLine="ItemKala.SumMandeKarton=Round2( SumMande / Fl";
_itemkala.SumMandeKarton /*String*/  = BA.NumberToString(anywheresoftware.b4a.keywords.Common.Round2(_summande/(double)_fldtedaddarkarton,(int) (0)));
 if (true) break;

case 42:
//C
this.state = 43;
;
RDebugUtils.currentLine=31981665;
 //BA.debugLineNum = 31981665;BA.debugLine="ItemKala.FldEshantion=cu1.Getstring(\"FldEshant";
_itemkala.FldEshantion /*String*/  = _cu1.GetString("FldEshantion");
RDebugUtils.currentLine=31981667;
 //BA.debugLineNum = 31981667;BA.debugLine="If	MCode.TakhfifKala=\"1\" Then";
if (true) break;

case 43:
//if
this.state = 52;
if ((parent.mostCurrent._mcode._takhfifkala /*String*/ ).equals("1")) { 
this.state = 45;
}if (true) break;

case 45:
//C
this.state = 46;
RDebugUtils.currentLine=31981669;
 //BA.debugLineNum = 31981669;BA.debugLine="If cu1.GetString(\"FldMablaghTakhfif\")<>Null T";
if (true) break;

case 46:
//if
this.state = 51;
if (_cu1.GetString("FldMablaghTakhfif")!= null) { 
this.state = 48;
}else {
this.state = 50;
}if (true) break;

case 48:
//C
this.state = 51;
RDebugUtils.currentLine=31981671;
 //BA.debugLineNum = 31981671;BA.debugLine="ItemKala.MablaghTakhfif=cu1.GetString(\"FldMa";
_itemkala.MablaghTakhfif /*int*/  = (int)(Double.parseDouble(_cu1.GetString("FldMablaghTakhfif")));
 if (true) break;

case 50:
//C
this.state = 51;
RDebugUtils.currentLine=31981675;
 //BA.debugLineNum = 31981675;BA.debugLine="ItemKala.MablaghTakhfif=\"0\"";
_itemkala.MablaghTakhfif /*int*/  = (int)(Double.parseDouble("0"));
 if (true) break;

case 51:
//C
this.state = 52;
;
 if (true) break;

case 52:
//C
this.state = 59;
;
 if (true) break;

case 54:
//C
this.state = 55;
RDebugUtils.currentLine=31981679;
 //BA.debugLineNum = 31981679;BA.debugLine="If Cu.Getstring(\"fldNameVahed2\") <> \"\"  Then";
if (true) break;

case 55:
//if
this.state = 58;
if ((_cu.GetString("fldNameVahed2")).equals("") == false) { 
this.state = 57;
}if (true) break;

case 57:
//C
this.state = 58;
RDebugUtils.currentLine=31981680;
 //BA.debugLineNum = 31981680;BA.debugLine="Dim FldFeeForoosh As Int = MCode.Sf.Val(Cu.Ge";
_fldfeeforoosh = (int) (parent.mostCurrent._mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvvvv1(BA.NumberToString(_cu.GetInt("fldFeeForoosh"))));
RDebugUtils.currentLine=31981681;
 //BA.debugLineNum = 31981681;BA.debugLine="Dim FldTedadDarKarton As Int = MCode.Sf.Val(C";
_fldtedaddarkarton = (int) (parent.mostCurrent._mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvvvv1(_cu.GetString("fldTedadDarKarton")));
RDebugUtils.currentLine=31981682;
 //BA.debugLineNum = 31981682;BA.debugLine="Dim SumMande As Int = Cu.Getstring(\"SumMande\"";
_summande = (int)(Double.parseDouble(_cu.GetString("SumMande")));
RDebugUtils.currentLine=31981683;
 //BA.debugLineNum = 31981683;BA.debugLine="ItemKala.FeeForooshKarton=FldFeeForoosh * Fld";
_itemkala.FeeForooshKarton /*String*/  = BA.NumberToString(_fldfeeforoosh*_fldtedaddarkarton);
RDebugUtils.currentLine=31981684;
 //BA.debugLineNum = 31981684;BA.debugLine="ItemKala.SumMandeKarton=Round2( SumMande / Fl";
_itemkala.SumMandeKarton /*String*/  = BA.NumberToString(anywheresoftware.b4a.keywords.Common.Round2(_summande/(double)_fldtedaddarkarton,(int) (0)));
 if (true) break;

case 58:
//C
this.state = 59;
;
 if (true) break;

case 59:
//C
this.state = 63;
;
RDebugUtils.currentLine=31981687;
 //BA.debugLineNum = 31981687;BA.debugLine="cu1.Close";
_cu1.Close();
RDebugUtils.currentLine=31981690;
 //BA.debugLineNum = 31981690;BA.debugLine="OrginalListKala.Add(ItemKala)";
parent.mostCurrent._orginallistkala.Add((Object)(_itemkala));
 if (true) break;
if (true) break;

case 60:
//C
this.state = 61;
;
RDebugUtils.currentLine=31981695;
 //BA.debugLineNum = 31981695;BA.debugLine="Cu.Close";
_cu.Close();
 if (true) break;

case 61:
//C
this.state = -1;
;
RDebugUtils.currentLine=31981703;
 //BA.debugLineNum = 31981703;BA.debugLine="ListKalaSp=OrginalListKala";
parent.mostCurrent._listkalasp = parent.mostCurrent._orginallistkala;
RDebugUtils.currentLine=31981704;
 //BA.debugLineNum = 31981704;BA.debugLine="ListKalaTxt=ListKalaSp";
parent.mostCurrent._listkalatxt = parent.mostCurrent._listkalasp;
RDebugUtils.currentLine=31981705;
 //BA.debugLineNum = 31981705;BA.debugLine="Sleep(100)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_kala_listi", "loadlistkala"),(int) (100));
this.state = 64;
return;
case 64:
//C
this.state = -1;
;
RDebugUtils.currentLine=31981707;
 //BA.debugLineNum = 31981707;BA.debugLine="HLV.notifyDataSetChanged";
parent.mostCurrent._hlv.notifyDataSetChanged();
RDebugUtils.currentLine=31981711;
 //BA.debugLineNum = 31981711;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _myzx_result(String _atype,String _values) throws Exception{
RDebugUtils.currentModule="act_kala_listi";
if (Debug.shouldDelegate(mostCurrent.activityBA, "myzx_result", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "myzx_result", new Object[] {_atype,_values}));}
RDebugUtils.currentLine=32505856;
 //BA.debugLineNum = 32505856;BA.debugLine="Sub myzx_result(atype As String,Values As String)";
RDebugUtils.currentLine=32505857;
 //BA.debugLineNum = 32505857;BA.debugLine="LogColor(\"type:\"&atype&\"values:\"&Values,Colors.re";
anywheresoftware.b4a.keywords.Common.LogImpl("532505857","type:"+_atype+"values:"+_values,anywheresoftware.b4a.keywords.Common.Colors.Red);
RDebugUtils.currentLine=32505860;
 //BA.debugLineNum = 32505860;BA.debugLine="TxtSearch.Text=Values";
mostCurrent._txtsearch.setText(BA.ObjectToCharSequence(_values));
RDebugUtils.currentLine=32505861;
 //BA.debugLineNum = 32505861;BA.debugLine="BtnSearch.Tag=True";
mostCurrent._btnsearch.setTag((Object)(anywheresoftware.b4a.keywords.Common.True));
RDebugUtils.currentLine=32505862;
 //BA.debugLineNum = 32505862;BA.debugLine="End Sub";
return "";
}
public static String  _nicespinner_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="act_kala_listi";
if (Debug.shouldDelegate(mostCurrent.activityBA, "nicespinner_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "nicespinner_itemclick", new Object[] {_position,_value}));}
anywheresoftware.b4a.objects.collections.List _lst = null;
ir.parsikhesab.pakhsh.mcode._adaptergoroohkala _item = null;
String _mc = "";
int _count = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
int _i = 0;
RDebugUtils.currentLine=32112640;
 //BA.debugLineNum = 32112640;BA.debugLine="Sub NiceSpinner_ItemClick (Position As Int, Value";
RDebugUtils.currentLine=32112642;
 //BA.debugLineNum = 32112642;BA.debugLine="Key.HideKeyboard";
mostCurrent._key.HideKeyboard(mostCurrent.activityBA);
RDebugUtils.currentLine=32112645;
 //BA.debugLineNum = 32112645;BA.debugLine="If Position = 0 Then";
if (_position==0) { 
RDebugUtils.currentLine=32112646;
 //BA.debugLineNum = 32112646;BA.debugLine="ListGroohKala.Clear";
mostCurrent._listgroohkala.Clear();
RDebugUtils.currentLine=32112647;
 //BA.debugLineNum = 32112647;BA.debugLine="lstSelectedCodeGroupKala.Clear";
mostCurrent._lstselectedcodegroupkala.Clear();
RDebugUtils.currentLine=32112648;
 //BA.debugLineNum = 32112648;BA.debugLine="NiceSpinner1.Clear";
mostCurrent._nicespinner1.Clear();
RDebugUtils.currentLine=32112649;
 //BA.debugLineNum = 32112649;BA.debugLine="NiceSpinner1.Add(\"همه گروه ها\")";
mostCurrent._nicespinner1.Add("همه گروه ها");
RDebugUtils.currentLine=32112651;
 //BA.debugLineNum = 32112651;BA.debugLine="GroupCodeSelect1=\"0\"";
mostCurrent._groupcodeselect1 = "0";
RDebugUtils.currentLine=32112652;
 //BA.debugLineNum = 32112652;BA.debugLine="GroupNameSelect1=\"\"";
mostCurrent._groupnameselect1 = "";
RDebugUtils.currentLine=32112653;
 //BA.debugLineNum = 32112653;BA.debugLine="GroupCodeSelect2=\"0\"";
mostCurrent._groupcodeselect2 = "0";
RDebugUtils.currentLine=32112654;
 //BA.debugLineNum = 32112654;BA.debugLine="GroupNameSelect2=\"\"";
mostCurrent._groupnameselect2 = "";
RDebugUtils.currentLine=32112655;
 //BA.debugLineNum = 32112655;BA.debugLine="NiceSpinner1.SelectedIndex=0";
mostCurrent._nicespinner1.setSelectedIndex((int) (0));
 }else {
RDebugUtils.currentLine=32112658;
 //BA.debugLineNum = 32112658;BA.debugLine="Dim lst As List=OriginalListGoroohKala";
_lst = new anywheresoftware.b4a.objects.collections.List();
_lst = mostCurrent._originallistgoroohkala;
RDebugUtils.currentLine=32112659;
 //BA.debugLineNum = 32112659;BA.debugLine="Dim Item As AdapterGoroohKala=lst.Get(NiceSpinne";
_item = (ir.parsikhesab.pakhsh.mcode._adaptergoroohkala)(_lst.Get((int) (mostCurrent._nicespinner.getSelectedIndex()-1)));
RDebugUtils.currentLine=32112660;
 //BA.debugLineNum = 32112660;BA.debugLine="Log(Item.FldN_Gorooh)";
anywheresoftware.b4a.keywords.Common.LogImpl("532112660",_item.FldN_Gorooh /*String*/ ,0);
RDebugUtils.currentLine=32112661;
 //BA.debugLineNum = 32112661;BA.debugLine="Log(Item.FldC_Gorooh)";
anywheresoftware.b4a.keywords.Common.LogImpl("532112661",_item.FldC_Gorooh /*String*/ ,0);
RDebugUtils.currentLine=32112662;
 //BA.debugLineNum = 32112662;BA.debugLine="GroupCodeSelect1=Item.FldC_Gorooh";
mostCurrent._groupcodeselect1 = _item.FldC_Gorooh /*String*/ ;
RDebugUtils.currentLine=32112663;
 //BA.debugLineNum = 32112663;BA.debugLine="GroupNameSelect1=Item.FldN_Gorooh";
mostCurrent._groupnameselect1 = _item.FldN_Gorooh /*String*/ ;
RDebugUtils.currentLine=32112664;
 //BA.debugLineNum = 32112664;BA.debugLine="GroupCodeSelect2=\"0\"";
mostCurrent._groupcodeselect2 = "0";
RDebugUtils.currentLine=32112665;
 //BA.debugLineNum = 32112665;BA.debugLine="GroupNameSelect2=\"\"";
mostCurrent._groupnameselect2 = "";
RDebugUtils.currentLine=32112666;
 //BA.debugLineNum = 32112666;BA.debugLine="Dim mc As String=Item.FldC_Gorooh";
_mc = _item.FldC_Gorooh /*String*/ ;
RDebugUtils.currentLine=32112668;
 //BA.debugLineNum = 32112668;BA.debugLine="Dim Count As Int = Item.FldC_Gorooh.Length + 3";
_count = (int) (_item.FldC_Gorooh /*String*/ .length()+3);
RDebugUtils.currentLine=32112669;
 //BA.debugLineNum = 32112669;BA.debugLine="Dim Cu As Cursor=MCode.Result(\"Select FldC_Goroo";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select FldC_Gorooh,FldN_Gorooh From TblGoroohKala where FldC_Gorooh Like '"+_mc+"%' And Length(FldC_Gorooh) = "+BA.NumberToString(_count)+" ORDER BY FldC_Gorooh");
RDebugUtils.currentLine=32112670;
 //BA.debugLineNum = 32112670;BA.debugLine="If Cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=32112671;
 //BA.debugLineNum = 32112671;BA.debugLine="lstSelectedCodeGroupKala.Clear";
mostCurrent._lstselectedcodegroupkala.Clear();
RDebugUtils.currentLine=32112672;
 //BA.debugLineNum = 32112672;BA.debugLine="NiceSpinner1.Clear";
mostCurrent._nicespinner1.Clear();
RDebugUtils.currentLine=32112673;
 //BA.debugLineNum = 32112673;BA.debugLine="NiceSpinner1.Add(\"همه گروه ها\")";
mostCurrent._nicespinner1.Add("همه گروه ها");
RDebugUtils.currentLine=32112674;
 //BA.debugLineNum = 32112674;BA.debugLine="For i=0 To Cu.RowCount-1";
{
final int step28 = 1;
final int limit28 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit28 ;_i = _i + step28 ) {
RDebugUtils.currentLine=32112675;
 //BA.debugLineNum = 32112675;BA.debugLine="Cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=32112676;
 //BA.debugLineNum = 32112676;BA.debugLine="Dim Item As AdapterGoroohKala";
_item = new ir.parsikhesab.pakhsh.mcode._adaptergoroohkala();
RDebugUtils.currentLine=32112677;
 //BA.debugLineNum = 32112677;BA.debugLine="Item.FldC_Gorooh=Cu.GetString(\"FldC_Gorooh\")";
_item.FldC_Gorooh /*String*/  = _cu.GetString("FldC_Gorooh");
RDebugUtils.currentLine=32112678;
 //BA.debugLineNum = 32112678;BA.debugLine="Item.FldN_Gorooh=Cu.GetString(\"FldN_Gorooh\")";
_item.FldN_Gorooh /*String*/  = _cu.GetString("FldN_Gorooh");
RDebugUtils.currentLine=32112679;
 //BA.debugLineNum = 32112679;BA.debugLine="ListGroohKala.Add(Item)";
mostCurrent._listgroohkala.Add((Object)(_item));
RDebugUtils.currentLine=32112680;
 //BA.debugLineNum = 32112680;BA.debugLine="NiceSpinner1.Add(Cu.GetString(\"FldN_Gorooh\"))";
mostCurrent._nicespinner1.Add(_cu.GetString("FldN_Gorooh"));
 }
};
RDebugUtils.currentLine=32112682;
 //BA.debugLineNum = 32112682;BA.debugLine="NiceSpinner1.Show(Colors.blue, 14)";
mostCurrent._nicespinner1.Show(anywheresoftware.b4a.keywords.Common.Colors.Blue,(float) (14));
RDebugUtils.currentLine=32112683;
 //BA.debugLineNum = 32112683;BA.debugLine="NiceSpinner1.SelectedIndex = 0";
mostCurrent._nicespinner1.setSelectedIndex((int) (0));
RDebugUtils.currentLine=32112684;
 //BA.debugLineNum = 32112684;BA.debugLine="lstSelectedCodeGroupKala.Add(GroupCodeSelect1)";
mostCurrent._lstselectedcodegroupkala.Add((Object)(mostCurrent._groupcodeselect1));
 }else {
RDebugUtils.currentLine=32112686;
 //BA.debugLineNum = 32112686;BA.debugLine="ListGroohKala.Clear";
mostCurrent._listgroohkala.Clear();
RDebugUtils.currentLine=32112687;
 //BA.debugLineNum = 32112687;BA.debugLine="lstSelectedCodeGroupKala.Clear";
mostCurrent._lstselectedcodegroupkala.Clear();
RDebugUtils.currentLine=32112688;
 //BA.debugLineNum = 32112688;BA.debugLine="NiceSpinner1.Clear";
mostCurrent._nicespinner1.Clear();
RDebugUtils.currentLine=32112689;
 //BA.debugLineNum = 32112689;BA.debugLine="NiceSpinner1.Add(\"همه گروه ها\")";
mostCurrent._nicespinner1.Add("همه گروه ها");
RDebugUtils.currentLine=32112690;
 //BA.debugLineNum = 32112690;BA.debugLine="GroupCodeSelect2=\"0\"";
mostCurrent._groupcodeselect2 = "0";
RDebugUtils.currentLine=32112691;
 //BA.debugLineNum = 32112691;BA.debugLine="GroupNameSelect2=\"\"";
mostCurrent._groupnameselect2 = "";
RDebugUtils.currentLine=32112692;
 //BA.debugLineNum = 32112692;BA.debugLine="NiceSpinner1.SelectedIndex=0";
mostCurrent._nicespinner1.setSelectedIndex((int) (0));
 };
 };
RDebugUtils.currentLine=32112696;
 //BA.debugLineNum = 32112696;BA.debugLine="LoadKala";
_loadkala();
RDebugUtils.currentLine=32112697;
 //BA.debugLineNum = 32112697;BA.debugLine="Log(\"CodeGroupSelect1: \"&GroupCodeSelect1)";
anywheresoftware.b4a.keywords.Common.LogImpl("532112697","CodeGroupSelect1: "+mostCurrent._groupcodeselect1,0);
RDebugUtils.currentLine=32112698;
 //BA.debugLineNum = 32112698;BA.debugLine="Log(\"postion1: \"&Position)";
anywheresoftware.b4a.keywords.Common.LogImpl("532112698","postion1: "+BA.NumberToString(_position),0);
RDebugUtils.currentLine=32112700;
 //BA.debugLineNum = 32112700;BA.debugLine="End Sub";
return "";
}
public static String  _nicespinner1_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="act_kala_listi";
if (Debug.shouldDelegate(mostCurrent.activityBA, "nicespinner1_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "nicespinner1_itemclick", new Object[] {_position,_value}));}
anywheresoftware.b4a.objects.collections.List _lst = null;
ir.parsikhesab.pakhsh.mcode._adaptergoroohkala _item = null;
String _mc = "";
int _count = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
int _i = 0;
RDebugUtils.currentLine=32178176;
 //BA.debugLineNum = 32178176;BA.debugLine="Sub NiceSpinner1_ItemClick (Position As Int, Value";
RDebugUtils.currentLine=32178177;
 //BA.debugLineNum = 32178177;BA.debugLine="If Position=0 Then";
if (_position==0) { 
RDebugUtils.currentLine=32178179;
 //BA.debugLineNum = 32178179;BA.debugLine="GroupCodeSelect2=lstSelectedCodeGroupKala.Get(ls";
mostCurrent._groupcodeselect2 = BA.ObjectToString(mostCurrent._lstselectedcodegroupkala.Get((int) (mostCurrent._lstselectedcodegroupkala.getSize()-1)));
 }else {
RDebugUtils.currentLine=32178181;
 //BA.debugLineNum = 32178181;BA.debugLine="Dim lst As List=ListGroohKala";
_lst = new anywheresoftware.b4a.objects.collections.List();
_lst = mostCurrent._listgroohkala;
RDebugUtils.currentLine=32178182;
 //BA.debugLineNum = 32178182;BA.debugLine="Dim Item As AdapterGoroohKala=lst.Get(NiceSpinne";
_item = (ir.parsikhesab.pakhsh.mcode._adaptergoroohkala)(_lst.Get((int) (mostCurrent._nicespinner1.getSelectedIndex()-1)));
RDebugUtils.currentLine=32178183;
 //BA.debugLineNum = 32178183;BA.debugLine="GroupCodeSelect2=Item.FldC_Gorooh";
mostCurrent._groupcodeselect2 = _item.FldC_Gorooh /*String*/ ;
RDebugUtils.currentLine=32178185;
 //BA.debugLineNum = 32178185;BA.debugLine="Dim mc As String=Item.FldC_Gorooh";
_mc = _item.FldC_Gorooh /*String*/ ;
RDebugUtils.currentLine=32178187;
 //BA.debugLineNum = 32178187;BA.debugLine="Dim Count As Int = mc.Length + 3";
_count = (int) (_mc.length()+3);
RDebugUtils.currentLine=32178188;
 //BA.debugLineNum = 32178188;BA.debugLine="Dim Cu As Cursor=MCode.Result(\"Select FldC_Goroo";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select FldC_Gorooh,FldN_Gorooh From TblGoroohKala where FldC_Gorooh Like '"+_mc+"%' And Length(FldC_Gorooh) = "+BA.NumberToString(_count)+" ORDER BY FldC_Gorooh");
RDebugUtils.currentLine=32178189;
 //BA.debugLineNum = 32178189;BA.debugLine="If Cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=32178190;
 //BA.debugLineNum = 32178190;BA.debugLine="ListGroohKala.Clear";
mostCurrent._listgroohkala.Clear();
RDebugUtils.currentLine=32178191;
 //BA.debugLineNum = 32178191;BA.debugLine="NiceSpinner1.Clear";
mostCurrent._nicespinner1.Clear();
RDebugUtils.currentLine=32178194;
 //BA.debugLineNum = 32178194;BA.debugLine="lstSelectedCodeGroupKala.Add(Item.FldC_Gorooh)";
mostCurrent._lstselectedcodegroupkala.Add((Object)(_item.FldC_Gorooh /*String*/ ));
RDebugUtils.currentLine=32178197;
 //BA.debugLineNum = 32178197;BA.debugLine="NiceSpinner1.Add(\"همه گروه ها\")";
mostCurrent._nicespinner1.Add("همه گروه ها");
RDebugUtils.currentLine=32178199;
 //BA.debugLineNum = 32178199;BA.debugLine="For i=0 To Cu.RowCount-1";
{
final int step15 = 1;
final int limit15 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit15 ;_i = _i + step15 ) {
RDebugUtils.currentLine=32178200;
 //BA.debugLineNum = 32178200;BA.debugLine="Cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=32178201;
 //BA.debugLineNum = 32178201;BA.debugLine="Dim Item As AdapterGoroohKala";
_item = new ir.parsikhesab.pakhsh.mcode._adaptergoroohkala();
RDebugUtils.currentLine=32178202;
 //BA.debugLineNum = 32178202;BA.debugLine="Item.FldC_Gorooh=Cu.GetString(\"FldC_Gorooh\")";
_item.FldC_Gorooh /*String*/  = _cu.GetString("FldC_Gorooh");
RDebugUtils.currentLine=32178203;
 //BA.debugLineNum = 32178203;BA.debugLine="Item.FldN_Gorooh=Cu.GetString(\"FldN_Gorooh\")";
_item.FldN_Gorooh /*String*/  = _cu.GetString("FldN_Gorooh");
RDebugUtils.currentLine=32178204;
 //BA.debugLineNum = 32178204;BA.debugLine="ListGroohKala.Add(Item)";
mostCurrent._listgroohkala.Add((Object)(_item));
RDebugUtils.currentLine=32178205;
 //BA.debugLineNum = 32178205;BA.debugLine="NiceSpinner1.Add(Cu.GetString(\"FldN_Gorooh\"))";
mostCurrent._nicespinner1.Add(_cu.GetString("FldN_Gorooh"));
 }
};
RDebugUtils.currentLine=32178208;
 //BA.debugLineNum = 32178208;BA.debugLine="NiceSpinner1.Show(Colors.blue, 14)";
mostCurrent._nicespinner1.Show(anywheresoftware.b4a.keywords.Common.Colors.Blue,(float) (14));
RDebugUtils.currentLine=32178209;
 //BA.debugLineNum = 32178209;BA.debugLine="NiceSpinner1.SelectedIndex = 0";
mostCurrent._nicespinner1.setSelectedIndex((int) (0));
 };
 };
RDebugUtils.currentLine=32178212;
 //BA.debugLineNum = 32178212;BA.debugLine="LoadKala";
_loadkala();
RDebugUtils.currentLine=32178213;
 //BA.debugLineNum = 32178213;BA.debugLine="Log(\"CodeGroupSelect2: \"&GroupCodeSelect2)";
anywheresoftware.b4a.keywords.Common.LogImpl("532178213","CodeGroupSelect2: "+mostCurrent._groupcodeselect2,0);
RDebugUtils.currentLine=32178214;
 //BA.debugLineNum = 32178214;BA.debugLine="Log(\"position2: \"&Position)";
anywheresoftware.b4a.keywords.Common.LogImpl("532178214","position2: "+BA.NumberToString(_position),0);
RDebugUtils.currentLine=32178215;
 //BA.debugLineNum = 32178215;BA.debugLine="End Sub";
return "";
}
public static String  _numbersearch_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="act_kala_listi";
if (Debug.shouldDelegate(mostCurrent.activityBA, "numbersearch_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "numbersearch_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=32571392;
 //BA.debugLineNum = 32571392;BA.debugLine="Sub NumberSearch_TextChanged (Old As String, New A";
RDebugUtils.currentLine=32571393;
 //BA.debugLineNum = 32571393;BA.debugLine="If TxtSearch.Text.StartsWith(\" \") Then";
if (mostCurrent._txtsearch.getText().startsWith(" ")) { 
RDebugUtils.currentLine=32571394;
 //BA.debugLineNum = 32571394;BA.debugLine="TxtSearch.Text=TxtSearch.Text.SubString(1)";
mostCurrent._txtsearch.setText(BA.ObjectToCharSequence(mostCurrent._txtsearch.getText().substring((int) (1))));
 };
RDebugUtils.currentLine=32571396;
 //BA.debugLineNum = 32571396;BA.debugLine="TxtSearch.SelectionStart=TxtSearch.Text.Length";
mostCurrent._txtsearch.setSelectionStart(mostCurrent._txtsearch.getText().length());
RDebugUtils.currentLine=32571397;
 //BA.debugLineNum = 32571397;BA.debugLine="LoadKala";
_loadkala();
RDebugUtils.currentLine=32571398;
 //BA.debugLineNum = 32571398;BA.debugLine="End Sub";
return "";
}
public static String  _pnl_down_click() throws Exception{
RDebugUtils.currentModule="act_kala_listi";
if (Debug.shouldDelegate(mostCurrent.activityBA, "pnl_down_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "pnl_down_click", null));}
RDebugUtils.currentLine=34013184;
 //BA.debugLineNum = 34013184;BA.debugLine="Sub Pnl_Down_Click";
RDebugUtils.currentLine=34013185;
 //BA.debugLineNum = 34013185;BA.debugLine="If LblBasketCount.Visible Then";
if (mostCurrent._lblbasketcount.getVisible()) { 
RDebugUtils.currentLine=34013186;
 //BA.debugLineNum = 34013186;BA.debugLine="StartActivity(Act_Sabad)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._act_sabad.getObject()));
RDebugUtils.currentLine=34013187;
 //BA.debugLineNum = 34013187;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 }else {
RDebugUtils.currentLine=34013189;
 //BA.debugLineNum = 34013189;BA.debugLine="ToastMessageShow(\"سبد خرید خالی است\",False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("سبد خرید خالی است"),anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=34013191;
 //BA.debugLineNum = 34013191;BA.debugLine="End Sub";
return "";
}
public static String  _pnltedad_click() throws Exception{
RDebugUtils.currentModule="act_kala_listi";
if (Debug.shouldDelegate(mostCurrent.activityBA, "pnltedad_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "pnltedad_click", null));}
RDebugUtils.currentLine=32636928;
 //BA.debugLineNum = 32636928;BA.debugLine="Sub PnlTedad_Click";
RDebugUtils.currentLine=32636930;
 //BA.debugLineNum = 32636930;BA.debugLine="End Sub";
return "";
}
public static String  _swgift_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="act_kala_listi";
if (Debug.shouldDelegate(mostCurrent.activityBA, "swgift_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "swgift_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=33226752;
 //BA.debugLineNum = 33226752;BA.debugLine="Sub SwGift_CheckedChange(Checked As Boolean)";
RDebugUtils.currentLine=33226753;
 //BA.debugLineNum = 33226753;BA.debugLine="LoadKala";
_loadkala();
RDebugUtils.currentLine=33226754;
 //BA.debugLineNum = 33226754;BA.debugLine="End Sub";
return "";
}
public static String  _swmojoodi_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="act_kala_listi";
if (Debug.shouldDelegate(mostCurrent.activityBA, "swmojoodi_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "swmojoodi_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=33357824;
 //BA.debugLineNum = 33357824;BA.debugLine="Sub SwMojoodi_CheckedChange(Checked As Boolean)";
RDebugUtils.currentLine=33357825;
 //BA.debugLineNum = 33357825;BA.debugLine="LoadKala";
_loadkala();
RDebugUtils.currentLine=33357826;
 //BA.debugLineNum = 33357826;BA.debugLine="End Sub";
return "";
}
public static String  _swpic_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="act_kala_listi";
if (Debug.shouldDelegate(mostCurrent.activityBA, "swpic_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "swpic_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=33423360;
 //BA.debugLineNum = 33423360;BA.debugLine="Sub SwPic_CheckedChange(Checked As Boolean)";
RDebugUtils.currentLine=33423362;
 //BA.debugLineNum = 33423362;BA.debugLine="LoadKala";
_loadkala();
RDebugUtils.currentLine=33423363;
 //BA.debugLineNum = 33423363;BA.debugLine="End Sub";
return "";
}
public static String  _swtakhfif_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="act_kala_listi";
if (Debug.shouldDelegate(mostCurrent.activityBA, "swtakhfif_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "swtakhfif_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=33292288;
 //BA.debugLineNum = 33292288;BA.debugLine="Sub SwTakhfif_CheckedChange(Checked As Boolean)";
RDebugUtils.currentLine=33292289;
 //BA.debugLineNum = 33292289;BA.debugLine="LoadKala";
_loadkala();
RDebugUtils.currentLine=33292290;
 //BA.debugLineNum = 33292290;BA.debugLine="End Sub";
return "";
}
public static String  _txtsearch_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="act_kala_listi";
if (Debug.shouldDelegate(mostCurrent.activityBA, "txtsearch_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "txtsearch_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=32702464;
 //BA.debugLineNum = 32702464;BA.debugLine="Sub TxtSearch_TextChanged (Old As String, New As S";
RDebugUtils.currentLine=32702465;
 //BA.debugLineNum = 32702465;BA.debugLine="LoadKala";
_loadkala();
RDebugUtils.currentLine=32702467;
 //BA.debugLineNum = 32702467;BA.debugLine="End Sub";
return "";
}
public static String  _updatefeeoffline() throws Exception{
RDebugUtils.currentModule="act_kala_listi";
if (Debug.shouldDelegate(mostCurrent.activityBA, "updatefeeoffline", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "updatefeeoffline", null));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
int _i = 0;
RDebugUtils.currentLine=33619968;
 //BA.debugLineNum = 33619968;BA.debugLine="Sub UpdateFeeOffline";
RDebugUtils.currentLine=33619969;
 //BA.debugLineNum = 33619969;BA.debugLine="If IsNumber(MCode.feeCode) And MCode.feeCode>0 Th";
if (anywheresoftware.b4a.keywords.Common.IsNumber(mostCurrent._mcode._feecode /*String*/ ) && (double)(Double.parseDouble(mostCurrent._mcode._feecode /*String*/ ))>0) { 
RDebugUtils.currentLine=33619970;
 //BA.debugLineNum = 33619970;BA.debugLine="Dim cu As Cursor";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=33619971;
 //BA.debugLineNum = 33619971;BA.debugLine="cu=MCode.Result(\"select * from TblFee where FldC";
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"select * from TblFee where FldCodeTasvie="+mostCurrent._mcode._feecode /*String*/ );
RDebugUtils.currentLine=33619972;
 //BA.debugLineNum = 33619972;BA.debugLine="If cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=33619973;
 //BA.debugLineNum = 33619973;BA.debugLine="For i=0 To cu.RowCount-1";
{
final int step5 = 1;
final int limit5 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=33619974;
 //BA.debugLineNum = 33619974;BA.debugLine="cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=33619975;
 //BA.debugLineNum = 33619975;BA.debugLine="Log(\"FldCodeKala:\"& cu.GetString(\"FldCodeKala\"";
anywheresoftware.b4a.keywords.Common.LogImpl("533619975","FldCodeKala:"+_cu.GetString("FldCodeKala"),0);
RDebugUtils.currentLine=33619976;
 //BA.debugLineNum = 33619976;BA.debugLine="Log(\"fldFeeTasvie:\"& cu.GetString(\"FldFee\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("533619976","fldFeeTasvie:"+_cu.GetString("FldFee"),0);
RDebugUtils.currentLine=33619977;
 //BA.debugLineNum = 33619977;BA.debugLine="MCode.SaveUpdate(\"Update TblKala Set fldFeeTas";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Update TblKala Set fldFeeTasvie='"+_cu.GetString("FldFee")+"'"+" where fldCodeKala="+_cu.GetString("FldCodeKala"));
 }
};
RDebugUtils.currentLine=33619980;
 //BA.debugLineNum = 33619980;BA.debugLine="LoadKala";
_loadkala();
 };
 };
RDebugUtils.currentLine=33619983;
 //BA.debugLineNum = 33619983;BA.debugLine="End Sub";
return "";
}
}