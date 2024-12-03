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

public class act_search extends Activity implements B4AActivity{
	public static act_search mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.act_search");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (act_search).");
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
		activityBA = new BA(this, layout, processBA, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.act_search");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "ir.parsikhesab.pakhsh.act_search", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (act_search) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (act_search) Resume **");
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
		return act_search.class;
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
            BA.LogInfo("** Activity (act_search) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (act_search) Pause event (activity is not paused). **");
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
            act_search mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (act_search) Resume **");
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
public anywheresoftware.b4a.objects.ButtonWrapper _btncommentexit = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btncommentok = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlfilter = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnl_hlv = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnl_top = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview1 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_back = null;
public anywheresoftware.b4a.objects.LabelWrapper _label4 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel2 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel3 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label5 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label6 = null;
public anywheresoftware.b4a.objects.LabelWrapper _btnsearch = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public ir.parsikhesab.pakhsh.b4xdialog _dialog = null;
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
public hitex.nice.spinner.Hitex_NiceSpinner _nicespinner = null;
public hitex.nice.spinner.Hitex_NiceSpinner _nicespinner1 = null;
public ir.parsikhesab.pakhsh.b4xcombobox _b4xcombobox1 = null;
public ir.parsikhesab.pakhsh.b4xcombobox _b4xcombobox2 = null;
public static String _groupcodeselect1 = "";
public static String _groupnameselect1 = "";
public static String _groupcodeselect2 = "";
public static String _groupnameselect2 = "";
public anywheresoftware.b4a.objects.collections.List _lstselectedcodegroupkala = null;
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
public ir.parsikhesab.pakhsh.act_sabtrizcheck _act_sabtrizcheck = null;
public ir.parsikhesab.pakhsh.act_saveinfocompany _act_saveinfocompany = null;
public ir.parsikhesab.pakhsh.act_savelocation _act_savelocation = null;
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
RDebugUtils.currentModule="act_search";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
anywheresoftware.b4a.objects.drawable.ColorDrawable _op = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _op1 = null;
RDebugUtils.currentLine=78774272;
 //BA.debugLineNum = 78774272;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=78774276;
 //BA.debugLineNum = 78774276;BA.debugLine="Activity.LoadLayout(\"L_Search_3\")";
mostCurrent._activity.LoadLayout("L_Search_3",mostCurrent.activityBA);
RDebugUtils.currentLine=78774277;
 //BA.debugLineNum = 78774277;BA.debugLine="lstSelectedCodeGroupKala.Initialize";
mostCurrent._lstselectedcodegroupkala.Initialize();
RDebugUtils.currentLine=78774279;
 //BA.debugLineNum = 78774279;BA.debugLine="HLV.Initializer(\"HLV\").ListView.Build";
mostCurrent._hlv.Initializer(mostCurrent.activityBA,"HLV").ListView().Build();
RDebugUtils.currentLine=78774280;
 //BA.debugLineNum = 78774280;BA.debugLine="pnl_HLV.AddView(HLV,0,0,100%x,pnl_HLV.Height)";
mostCurrent._pnl_hlv.AddView((android.view.View)(mostCurrent._hlv.getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),mostCurrent._pnl_hlv.getHeight());
RDebugUtils.currentLine=78774281;
 //BA.debugLineNum = 78774281;BA.debugLine="Key.Initialize(\"Key\")";
mostCurrent._key.Initialize("Key");
RDebugUtils.currentLine=78774282;
 //BA.debugLineNum = 78774282;BA.debugLine="Dialog.Initialize(Activity)";
mostCurrent._dialog._initialize /*String*/ (null,mostCurrent.activityBA,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(mostCurrent._activity.getObject())));
RDebugUtils.currentLine=78774283;
 //BA.debugLineNum = 78774283;BA.debugLine="ListGoroohKala.Initialize";
mostCurrent._listgoroohkala.Initialize();
RDebugUtils.currentLine=78774284;
 //BA.debugLineNum = 78774284;BA.debugLine="OriginalListGoroohKala.Initialize";
mostCurrent._originallistgoroohkala.Initialize();
RDebugUtils.currentLine=78774285;
 //BA.debugLineNum = 78774285;BA.debugLine="NiceSpinner.Initialize(\"NiceSpinner\",True,True)";
mostCurrent._nicespinner.Initialize(mostCurrent.activityBA,"NiceSpinner",anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=78774287;
 //BA.debugLineNum = 78774287;BA.debugLine="Panel2.AddView(NiceSpinner,B4XComboBox1.mBase.Lef";
mostCurrent._panel2.AddView((android.view.View)(mostCurrent._nicespinner.getObject()),mostCurrent._b4xcombobox1._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft(),mostCurrent._b4xcombobox1._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop(),mostCurrent._b4xcombobox1._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),mostCurrent._b4xcombobox1._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=78774288;
 //BA.debugLineNum = 78774288;BA.debugLine="NiceSpinner.TextColor = Colors.Black";
mostCurrent._nicespinner.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=78774289;
 //BA.debugLineNum = 78774289;BA.debugLine="NiceSpinner.Gravity = Gravity.CENTER_HORIZONTAL";
mostCurrent._nicespinner.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL);
RDebugUtils.currentLine=78774290;
 //BA.debugLineNum = 78774290;BA.debugLine="NiceSpinner.Typeface = Typeface.LoadFromAssets(\"p";
mostCurrent._nicespinner.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("p_font.ttf"));
RDebugUtils.currentLine=78774291;
 //BA.debugLineNum = 78774291;BA.debugLine="Dim op As ColorDrawable";
_op = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=78774292;
 //BA.debugLineNum = 78774292;BA.debugLine="op.Initialize2(Colors.White,8dip,2dip,Colors.Blac";
_op.Initialize2(anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (8)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2)),anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=78774293;
 //BA.debugLineNum = 78774293;BA.debugLine="NiceSpinner.Background=op";
mostCurrent._nicespinner.setBackground((android.graphics.drawable.Drawable)(_op.getObject()));
RDebugUtils.currentLine=78774295;
 //BA.debugLineNum = 78774295;BA.debugLine="NiceSpinner1.Initialize(\"NiceSpinner1\",True,True)";
mostCurrent._nicespinner1.Initialize(mostCurrent.activityBA,"NiceSpinner1",anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=78774297;
 //BA.debugLineNum = 78774297;BA.debugLine="Panel2.AddView(NiceSpinner1,B4XComboBox2.mBase.Le";
mostCurrent._panel2.AddView((android.view.View)(mostCurrent._nicespinner1.getObject()),mostCurrent._b4xcombobox2._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft(),mostCurrent._b4xcombobox2._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop(),mostCurrent._b4xcombobox2._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),mostCurrent._b4xcombobox2._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=78774298;
 //BA.debugLineNum = 78774298;BA.debugLine="NiceSpinner1.TextColor = Colors.Black";
mostCurrent._nicespinner1.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=78774299;
 //BA.debugLineNum = 78774299;BA.debugLine="NiceSpinner1.Gravity = Gravity.CENTER_HORIZONTAL";
mostCurrent._nicespinner1.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL);
RDebugUtils.currentLine=78774300;
 //BA.debugLineNum = 78774300;BA.debugLine="NiceSpinner1.Typeface = Typeface.LoadFromAssets(\"";
mostCurrent._nicespinner1.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("p_font.ttf"));
RDebugUtils.currentLine=78774301;
 //BA.debugLineNum = 78774301;BA.debugLine="Dim op1 As ColorDrawable";
_op1 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=78774302;
 //BA.debugLineNum = 78774302;BA.debugLine="op1.Initialize2(Colors.White,8dip,2dip,Colors.Bla";
_op1.Initialize2(anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (8)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2)),anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=78774303;
 //BA.debugLineNum = 78774303;BA.debugLine="NiceSpinner1.Background=op1";
mostCurrent._nicespinner1.setBackground((android.graphics.drawable.Drawable)(_op1.getObject()));
RDebugUtils.currentLine=78774304;
 //BA.debugLineNum = 78774304;BA.debugLine="NiceSpinner1.Add(\"همه گروه ها\")";
mostCurrent._nicespinner1.Add("همه گروه ها");
RDebugUtils.currentLine=78774306;
 //BA.debugLineNum = 78774306;BA.debugLine="ListGroohKala.Initialize";
mostCurrent._listgroohkala.Initialize();
RDebugUtils.currentLine=78774307;
 //BA.debugLineNum = 78774307;BA.debugLine="OrginalListKala.Initialize";
mostCurrent._orginallistkala.Initialize();
RDebugUtils.currentLine=78774308;
 //BA.debugLineNum = 78774308;BA.debugLine="ListKalaSp.Initialize";
mostCurrent._listkalasp.Initialize();
RDebugUtils.currentLine=78774309;
 //BA.debugLineNum = 78774309;BA.debugLine="ListKalaTxt.Initialize";
mostCurrent._listkalatxt.Initialize();
RDebugUtils.currentLine=78774311;
 //BA.debugLineNum = 78774311;BA.debugLine="LoadAcSpGroohKala";
_loadacspgroohkala();
RDebugUtils.currentLine=78774314;
 //BA.debugLineNum = 78774314;BA.debugLine="HLV.Show";
mostCurrent._hlv.Show();
RDebugUtils.currentLine=78774315;
 //BA.debugLineNum = 78774315;BA.debugLine="MCode.CodeMoshtari = 0";
mostCurrent._mcode._codemoshtari /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=78774318;
 //BA.debugLineNum = 78774318;BA.debugLine="LoadKala";
_loadkala();
RDebugUtils.currentLine=78774319;
 //BA.debugLineNum = 78774319;BA.debugLine="Img_TipFee.Visible=False";
mostCurrent._img_tipfee.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=78774320;
 //BA.debugLineNum = 78774320;BA.debugLine="Label5.Visible=False";
mostCurrent._label5.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=78774334;
 //BA.debugLineNum = 78774334;BA.debugLine="End Sub";
return "";
}
public static String  _loadacspgroohkala() throws Exception{
RDebugUtils.currentModule="act_search";
if (Debug.shouldDelegate(mostCurrent.activityBA, "loadacspgroohkala", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "loadacspgroohkala", null));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _dt = null;
int _i = 0;
ir.parsikhesab.pakhsh.mcode._adaptergoroohkala _item = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
RDebugUtils.currentLine=79167488;
 //BA.debugLineNum = 79167488;BA.debugLine="Sub LoadAcSpGroohKala";
RDebugUtils.currentLine=79167490;
 //BA.debugLineNum = 79167490;BA.debugLine="Dim Dt As Cursor = MCode.Result(\"Select FldC_Goro";
_dt = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_dt = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select FldC_Gorooh,FldN_Gorooh From TblGoroohKala where Length(FldC_Gorooh) = 3 ORDER BY FldC_Gorooh");
RDebugUtils.currentLine=79167491;
 //BA.debugLineNum = 79167491;BA.debugLine="NiceSpinner.Add(\"همه گروه ها\")";
mostCurrent._nicespinner.Add("همه گروه ها");
RDebugUtils.currentLine=79167492;
 //BA.debugLineNum = 79167492;BA.debugLine="For i=0 To Dt.RowCount-1";
{
final int step3 = 1;
final int limit3 = (int) (_dt.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=79167493;
 //BA.debugLineNum = 79167493;BA.debugLine="Dt.Position=i";
_dt.setPosition(_i);
RDebugUtils.currentLine=79167494;
 //BA.debugLineNum = 79167494;BA.debugLine="Dim Item As AdapterGoroohKala";
_item = new ir.parsikhesab.pakhsh.mcode._adaptergoroohkala();
RDebugUtils.currentLine=79167495;
 //BA.debugLineNum = 79167495;BA.debugLine="Dim cu As Cursor";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=79167496;
 //BA.debugLineNum = 79167496;BA.debugLine="Log(Dt.GetString(\"FldC_Gorooh\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("579167496",_dt.GetString("FldC_Gorooh"),0);
RDebugUtils.currentLine=79167497;
 //BA.debugLineNum = 79167497;BA.debugLine="cu=MCode.Result(\"Select fldCodeKala From TblKala";
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select fldCodeKala From TblKala where fldCodeGroup like '"+_dt.GetString("FldC_Gorooh")+"%'");
RDebugUtils.currentLine=79167498;
 //BA.debugLineNum = 79167498;BA.debugLine="If cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=79167499;
 //BA.debugLineNum = 79167499;BA.debugLine="Item.FldC_Gorooh= Dt.GetString(\"FldC_Gorooh\")";
_item.FldC_Gorooh /*String*/  = _dt.GetString("FldC_Gorooh");
RDebugUtils.currentLine=79167500;
 //BA.debugLineNum = 79167500;BA.debugLine="Item.FldN_Gorooh= Dt.GetString(\"FldN_Gorooh\")";
_item.FldN_Gorooh /*String*/  = _dt.GetString("FldN_Gorooh");
RDebugUtils.currentLine=79167501;
 //BA.debugLineNum = 79167501;BA.debugLine="OriginalListGoroohKala.Add(Item)";
mostCurrent._originallistgoroohkala.Add((Object)(_item));
RDebugUtils.currentLine=79167502;
 //BA.debugLineNum = 79167502;BA.debugLine="NiceSpinner.Add(Item.FldN_Gorooh)";
mostCurrent._nicespinner.Add(_item.FldN_Gorooh /*String*/ );
 };
 }
};
RDebugUtils.currentLine=79167506;
 //BA.debugLineNum = 79167506;BA.debugLine="NiceSpinner.Show(Colors.blue, 14)";
mostCurrent._nicespinner.Show(anywheresoftware.b4a.keywords.Common.Colors.Blue,(float) (14));
RDebugUtils.currentLine=79167508;
 //BA.debugLineNum = 79167508;BA.debugLine="End Sub";
return "";
}
public static String  _loadkala() throws Exception{
RDebugUtils.currentModule="act_search";
if (Debug.shouldDelegate(mostCurrent.activityBA, "loadkala", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "loadkala", null));}
String _str = "";
int _countfilter = 0;
boolean _filter = false;
String _strsearch = "";
RDebugUtils.currentLine=78905344;
 //BA.debugLineNum = 78905344;BA.debugLine="Sub LoadKala";
RDebugUtils.currentLine=78905346;
 //BA.debugLineNum = 78905346;BA.debugLine="Try";
try {RDebugUtils.currentLine=78905349;
 //BA.debugLineNum = 78905349;BA.debugLine="Dim str As String=\"\"";
_str = "";
RDebugUtils.currentLine=78905350;
 //BA.debugLineNum = 78905350;BA.debugLine="Dim countfilter As Int=0";
_countfilter = (int) (0);
RDebugUtils.currentLine=78905351;
 //BA.debugLineNum = 78905351;BA.debugLine="Dim filter As Boolean=False";
_filter = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=78905358;
 //BA.debugLineNum = 78905358;BA.debugLine="Log(GroupCodeSelect1)";
anywheresoftware.b4a.keywords.Common.LogImpl("578905358",mostCurrent._groupcodeselect1,0);
RDebugUtils.currentLine=78905359;
 //BA.debugLineNum = 78905359;BA.debugLine="Log(GroupCodeSelect2)";
anywheresoftware.b4a.keywords.Common.LogImpl("578905359",mostCurrent._groupcodeselect2,0);
RDebugUtils.currentLine=78905360;
 //BA.debugLineNum = 78905360;BA.debugLine="If GroupCodeSelect1=0 And GroupCodeSelect2=0 The";
if ((mostCurrent._groupcodeselect1).equals(BA.NumberToString(0)) && (mostCurrent._groupcodeselect2).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=78905361;
 //BA.debugLineNum = 78905361;BA.debugLine="If SwGift.Checked=True Then";
if (mostCurrent._swgift.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=78905362;
 //BA.debugLineNum = 78905362;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=78905363;
 //BA.debugLineNum = 78905363;BA.debugLine="str= str & \" and TblKala.fldCodeKala IN(SELECT";
_str = _str+" and TblKala.fldCodeKala IN(SELECT tblEshantionVisitori.fldCodeKala FROM tblEshantionVisitori)";
RDebugUtils.currentLine=78905364;
 //BA.debugLineNum = 78905364;BA.debugLine="filter=True";
_filter = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=78905365;
 //BA.debugLineNum = 78905365;BA.debugLine="If countfilter=1 Then";
if (_countfilter==1) { 
RDebugUtils.currentLine=78905366;
 //BA.debugLineNum = 78905366;BA.debugLine="str=str.Replace(\" and \",\"\")";
_str = _str.replace(" and ","");
 };
 };
RDebugUtils.currentLine=78905369;
 //BA.debugLineNum = 78905369;BA.debugLine="If SwTakhfif.Checked=True Then";
if (mostCurrent._swtakhfif.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=78905370;
 //BA.debugLineNum = 78905370;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=78905371;
 //BA.debugLineNum = 78905371;BA.debugLine="str= str & \" and fldFeeBadAzTakhfif <> '0.0000";
_str = _str+" and fldFeeBadAzTakhfif <> '0.0000'";
RDebugUtils.currentLine=78905372;
 //BA.debugLineNum = 78905372;BA.debugLine="filter=True";
_filter = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=78905373;
 //BA.debugLineNum = 78905373;BA.debugLine="If countfilter=1 Then";
if (_countfilter==1) { 
RDebugUtils.currentLine=78905374;
 //BA.debugLineNum = 78905374;BA.debugLine="str=str.Replace(\" and \",\"\")";
_str = _str.replace(" and ","");
 };
 };
RDebugUtils.currentLine=78905377;
 //BA.debugLineNum = 78905377;BA.debugLine="If MCode.NamayeshKalaSefr=0 Then";
if ((mostCurrent._mcode._namayeshkalasefr /*String*/ ).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=78905378;
 //BA.debugLineNum = 78905378;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=78905379;
 //BA.debugLineNum = 78905379;BA.debugLine="str= str & \" and SumMande > '0'\"";
_str = _str+" and SumMande > '0'";
RDebugUtils.currentLine=78905380;
 //BA.debugLineNum = 78905380;BA.debugLine="filter=True";
_filter = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=78905381;
 //BA.debugLineNum = 78905381;BA.debugLine="If countfilter=1 Then";
if (_countfilter==1) { 
RDebugUtils.currentLine=78905382;
 //BA.debugLineNum = 78905382;BA.debugLine="str=str.Replace(\" and \",\"\")";
_str = _str.replace(" and ","");
 };
 };
RDebugUtils.currentLine=78905386;
 //BA.debugLineNum = 78905386;BA.debugLine="If SwMojoodi.Checked=True Then";
if (mostCurrent._swmojoodi.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=78905387;
 //BA.debugLineNum = 78905387;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=78905388;
 //BA.debugLineNum = 78905388;BA.debugLine="str= str & \" and SumMande > '0'\"";
_str = _str+" and SumMande > '0'";
RDebugUtils.currentLine=78905389;
 //BA.debugLineNum = 78905389;BA.debugLine="filter=True";
_filter = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=78905390;
 //BA.debugLineNum = 78905390;BA.debugLine="If countfilter=1 Then";
if (_countfilter==1) { 
RDebugUtils.currentLine=78905391;
 //BA.debugLineNum = 78905391;BA.debugLine="str=str.Replace(\" and \",\"\")";
_str = _str.replace(" and ","");
 };
 };
RDebugUtils.currentLine=78905394;
 //BA.debugLineNum = 78905394;BA.debugLine="If SwPic.Checked=True Then";
if (mostCurrent._swpic.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=78905395;
 //BA.debugLineNum = 78905395;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=78905396;
 //BA.debugLineNum = 78905396;BA.debugLine="str= str & \" and fldPathPic <> '0'\"";
_str = _str+" and fldPathPic <> '0'";
RDebugUtils.currentLine=78905397;
 //BA.debugLineNum = 78905397;BA.debugLine="filter=True";
_filter = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=78905398;
 //BA.debugLineNum = 78905398;BA.debugLine="If countfilter=1 Then";
if (_countfilter==1) { 
RDebugUtils.currentLine=78905399;
 //BA.debugLineNum = 78905399;BA.debugLine="str=str.Replace(\" and \",\"\")";
_str = _str.replace(" and ","");
 };
 };
RDebugUtils.currentLine=78905403;
 //BA.debugLineNum = 78905403;BA.debugLine="If TxtSearch.Text.Length>0 And TxtSearch.Text<>";
if (mostCurrent._txtsearch.getText().length()>0 && (mostCurrent._txtsearch.getText()).equals(" ") == false && (mostCurrent._txtsearch.getText()).equals("") == false) { 
RDebugUtils.currentLine=78905404;
 //BA.debugLineNum = 78905404;BA.debugLine="Dim StrSearch As String= MCode.ConvertNumbersP";
_strsearch = mostCurrent._mcode._convertnumberspersian2english /*String*/ (mostCurrent.activityBA,mostCurrent._txtsearch.getText());
RDebugUtils.currentLine=78905405;
 //BA.debugLineNum = 78905405;BA.debugLine="If StrSearch=\"\" Then";
if ((_strsearch).equals("")) { 
RDebugUtils.currentLine=78905406;
 //BA.debugLineNum = 78905406;BA.debugLine="StrSearch=TxtSearch.Text";
_strsearch = mostCurrent._txtsearch.getText();
 };
RDebugUtils.currentLine=78905408;
 //BA.debugLineNum = 78905408;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=78905409;
 //BA.debugLineNum = 78905409;BA.debugLine="If IsNumber(StrSearch) Then";
if (anywheresoftware.b4a.keywords.Common.IsNumber(_strsearch)) { 
RDebugUtils.currentLine=78905410;
 //BA.debugLineNum = 78905410;BA.debugLine="If StrSearch.Length>5 Then";
if (_strsearch.length()>5) { 
RDebugUtils.currentLine=78905411;
 //BA.debugLineNum = 78905411;BA.debugLine="str = str & $\" and (fldSerial = '${StrSearch";
_str = _str+(" and (fldSerial = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_strsearch))+"') ");
 }else {
RDebugUtils.currentLine=78905413;
 //BA.debugLineNum = 78905413;BA.debugLine="str = str & $\" and (fldCodeKala like '%${Str";
_str = _str+(" and (fldCodeKala like '%"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_strsearch))+"%') ");
 };
 }else {
RDebugUtils.currentLine=78905417;
 //BA.debugLineNum = 78905417;BA.debugLine="str = str & $\" and (fldNameKala like '%${StrS";
_str = _str+(" and (fldNameKala like '%"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_strsearch))+"%') ");
 };
RDebugUtils.currentLine=78905419;
 //BA.debugLineNum = 78905419;BA.debugLine="filter=True";
_filter = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=78905420;
 //BA.debugLineNum = 78905420;BA.debugLine="If countfilter=1 Then";
if (_countfilter==1) { 
RDebugUtils.currentLine=78905421;
 //BA.debugLineNum = 78905421;BA.debugLine="str=str.Replace(\" and \",\"\")";
_str = _str.replace(" and ","");
 };
 };
RDebugUtils.currentLine=78905424;
 //BA.debugLineNum = 78905424;BA.debugLine="If filter=True And str<>\"\" Then";
if (_filter==anywheresoftware.b4a.keywords.Common.True && (_str).equals("") == false) { 
RDebugUtils.currentLine=78905427;
 //BA.debugLineNum = 78905427;BA.debugLine="str=\"select * from TblKala where \"&str&\" \"&Str";
_str = "select * from TblKala where "+_str+" "+mostCurrent._str_sort;
 }else {
RDebugUtils.currentLine=78905429;
 //BA.debugLineNum = 78905429;BA.debugLine="str=\"select * from TblKala  \"&Str_sort";
_str = "select * from TblKala  "+mostCurrent._str_sort;
 };
RDebugUtils.currentLine=78905431;
 //BA.debugLineNum = 78905431;BA.debugLine="Log(str)";
anywheresoftware.b4a.keywords.Common.LogImpl("578905431",_str,0);
 };
RDebugUtils.currentLine=78905434;
 //BA.debugLineNum = 78905434;BA.debugLine="If GroupCodeSelect1<>0 And GroupCodeSelect2=0 Th";
if ((mostCurrent._groupcodeselect1).equals(BA.NumberToString(0)) == false && (mostCurrent._groupcodeselect2).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=78905435;
 //BA.debugLineNum = 78905435;BA.debugLine="If SwGift.Checked=True Then";
if (mostCurrent._swgift.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=78905436;
 //BA.debugLineNum = 78905436;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=78905437;
 //BA.debugLineNum = 78905437;BA.debugLine="str= str & \" and TblKala.fldCodeKala IN(SELECT";
_str = _str+" and TblKala.fldCodeKala IN(SELECT tblEshantionVisitori.fldCodeKala FROM tblEshantionVisitori)";
 };
RDebugUtils.currentLine=78905440;
 //BA.debugLineNum = 78905440;BA.debugLine="If SwTakhfif.Checked=True Then";
if (mostCurrent._swtakhfif.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=78905441;
 //BA.debugLineNum = 78905441;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=78905442;
 //BA.debugLineNum = 78905442;BA.debugLine="str= str & \" and fldFeeBadAzTakhfif <> '0.0000";
_str = _str+" and fldFeeBadAzTakhfif <> '0.0000'";
 };
RDebugUtils.currentLine=78905445;
 //BA.debugLineNum = 78905445;BA.debugLine="If SwMojoodi.Checked=True Then";
if (mostCurrent._swmojoodi.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=78905446;
 //BA.debugLineNum = 78905446;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=78905447;
 //BA.debugLineNum = 78905447;BA.debugLine="str= str & \" and SumMande > '0'\"";
_str = _str+" and SumMande > '0'";
 };
RDebugUtils.currentLine=78905450;
 //BA.debugLineNum = 78905450;BA.debugLine="If MCode.NamayeshKalaSefr=0 Then";
if ((mostCurrent._mcode._namayeshkalasefr /*String*/ ).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=78905451;
 //BA.debugLineNum = 78905451;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=78905452;
 //BA.debugLineNum = 78905452;BA.debugLine="str= str & \" and SumMande > '0'\"";
_str = _str+" and SumMande > '0'";
RDebugUtils.currentLine=78905453;
 //BA.debugLineNum = 78905453;BA.debugLine="filter=True";
_filter = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=78905454;
 //BA.debugLineNum = 78905454;BA.debugLine="If countfilter=1 Then";
if (_countfilter==1) { 
RDebugUtils.currentLine=78905455;
 //BA.debugLineNum = 78905455;BA.debugLine="str=str.Replace(\" and \",\"\")";
_str = _str.replace(" and ","");
 };
 };
RDebugUtils.currentLine=78905458;
 //BA.debugLineNum = 78905458;BA.debugLine="If SwPic.Checked=True Then";
if (mostCurrent._swpic.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=78905459;
 //BA.debugLineNum = 78905459;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=78905460;
 //BA.debugLineNum = 78905460;BA.debugLine="str= str & \" and fldPathPic <> '0'\"";
_str = _str+" and fldPathPic <> '0'";
 };
RDebugUtils.currentLine=78905464;
 //BA.debugLineNum = 78905464;BA.debugLine="If TxtSearch.Text.Length>0 And TxtSearch.Text<>";
if (mostCurrent._txtsearch.getText().length()>0 && (mostCurrent._txtsearch.getText()).equals(" ") == false && (mostCurrent._txtsearch.getText()).equals("") == false) { 
RDebugUtils.currentLine=78905465;
 //BA.debugLineNum = 78905465;BA.debugLine="Dim StrSearch As String=MCode.ConvertNumbersPe";
_strsearch = mostCurrent._mcode._convertnumberspersian2english /*String*/ (mostCurrent.activityBA,mostCurrent._txtsearch.getText());
RDebugUtils.currentLine=78905466;
 //BA.debugLineNum = 78905466;BA.debugLine="If StrSearch=\"\" Then";
if ((_strsearch).equals("")) { 
RDebugUtils.currentLine=78905467;
 //BA.debugLineNum = 78905467;BA.debugLine="StrSearch=TxtSearch.Text";
_strsearch = mostCurrent._txtsearch.getText();
 };
RDebugUtils.currentLine=78905469;
 //BA.debugLineNum = 78905469;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=78905470;
 //BA.debugLineNum = 78905470;BA.debugLine="If IsNumber(StrSearch) Then";
if (anywheresoftware.b4a.keywords.Common.IsNumber(_strsearch)) { 
RDebugUtils.currentLine=78905471;
 //BA.debugLineNum = 78905471;BA.debugLine="If StrSearch.Length>5 Then";
if (_strsearch.length()>5) { 
RDebugUtils.currentLine=78905472;
 //BA.debugLineNum = 78905472;BA.debugLine="str = str & $\" and (fldSerial = '${StrSearch";
_str = _str+(" and (fldSerial = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_strsearch))+"') ");
 }else {
RDebugUtils.currentLine=78905474;
 //BA.debugLineNum = 78905474;BA.debugLine="str = str & $\" and (fldCodeKala like '%${Str";
_str = _str+(" and (fldCodeKala like '%"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_strsearch))+"%') ");
 };
 }else {
RDebugUtils.currentLine=78905478;
 //BA.debugLineNum = 78905478;BA.debugLine="str = str & $\" and (fldNameKala like '%${StrS";
_str = _str+(" and (fldNameKala like '%"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_strsearch))+"%') ");
 };
RDebugUtils.currentLine=78905480;
 //BA.debugLineNum = 78905480;BA.debugLine="filter=True";
_filter = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=78905481;
 //BA.debugLineNum = 78905481;BA.debugLine="If countfilter=1 Then";
if (_countfilter==1) { 
RDebugUtils.currentLine=78905482;
 //BA.debugLineNum = 78905482;BA.debugLine="str=str.Replace(\" and \",\"\")";
_str = _str.replace(" and ","");
 };
 };
RDebugUtils.currentLine=78905485;
 //BA.debugLineNum = 78905485;BA.debugLine="If	filter=True And str<>\"\" Then";
if (_filter==anywheresoftware.b4a.keywords.Common.True && (_str).equals("") == false) { 
RDebugUtils.currentLine=78905486;
 //BA.debugLineNum = 78905486;BA.debugLine="str=\"select * from TblKala where fldCodeGroup";
_str = "select * from TblKala where fldCodeGroup like '"+mostCurrent._groupcodeselect1+"%' and "+_str+" "+mostCurrent._str_sort;
 }else {
RDebugUtils.currentLine=78905488;
 //BA.debugLineNum = 78905488;BA.debugLine="str=\"select * from TblKala where fldCodeGroup";
_str = "select * from TblKala where fldCodeGroup like '"+mostCurrent._groupcodeselect1+"%' "+mostCurrent._str_sort;
 };
RDebugUtils.currentLine=78905492;
 //BA.debugLineNum = 78905492;BA.debugLine="Log(str)";
anywheresoftware.b4a.keywords.Common.LogImpl("578905492",_str,0);
 };
RDebugUtils.currentLine=78905495;
 //BA.debugLineNum = 78905495;BA.debugLine="If GroupCodeSelect1<>0 And GroupCodeSelect2<>0 T";
if ((mostCurrent._groupcodeselect1).equals(BA.NumberToString(0)) == false && (mostCurrent._groupcodeselect2).equals(BA.NumberToString(0)) == false) { 
RDebugUtils.currentLine=78905496;
 //BA.debugLineNum = 78905496;BA.debugLine="If SwGift.Checked=True Then";
if (mostCurrent._swgift.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=78905497;
 //BA.debugLineNum = 78905497;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=78905498;
 //BA.debugLineNum = 78905498;BA.debugLine="str= str & \" and TblKala.fldCodeKala IN(SELECT";
_str = _str+" and TblKala.fldCodeKala IN(SELECT tblEshantionVisitori.fldCodeKala FROM tblEshantionVisitori)";
 };
RDebugUtils.currentLine=78905501;
 //BA.debugLineNum = 78905501;BA.debugLine="If SwTakhfif.Checked=True Then";
if (mostCurrent._swtakhfif.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=78905502;
 //BA.debugLineNum = 78905502;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=78905503;
 //BA.debugLineNum = 78905503;BA.debugLine="str= str & \" and fldFeeBadAzTakhfif <> '0.0000";
_str = _str+" and fldFeeBadAzTakhfif <> '0.0000'";
 };
RDebugUtils.currentLine=78905506;
 //BA.debugLineNum = 78905506;BA.debugLine="If SwMojoodi.Checked=True Then";
if (mostCurrent._swmojoodi.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=78905507;
 //BA.debugLineNum = 78905507;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=78905508;
 //BA.debugLineNum = 78905508;BA.debugLine="str= str & \" and SumMande > '0'\"";
_str = _str+" and SumMande > '0'";
 };
RDebugUtils.currentLine=78905511;
 //BA.debugLineNum = 78905511;BA.debugLine="If MCode.NamayeshKalaSefr=0 Then";
if ((mostCurrent._mcode._namayeshkalasefr /*String*/ ).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=78905512;
 //BA.debugLineNum = 78905512;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=78905513;
 //BA.debugLineNum = 78905513;BA.debugLine="str= str & \" and SumMande > '0'\"";
_str = _str+" and SumMande > '0'";
RDebugUtils.currentLine=78905514;
 //BA.debugLineNum = 78905514;BA.debugLine="filter=True";
_filter = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=78905515;
 //BA.debugLineNum = 78905515;BA.debugLine="If countfilter=1 Then";
if (_countfilter==1) { 
RDebugUtils.currentLine=78905516;
 //BA.debugLineNum = 78905516;BA.debugLine="str=str.Replace(\" and \",\"\")";
_str = _str.replace(" and ","");
 };
 };
RDebugUtils.currentLine=78905519;
 //BA.debugLineNum = 78905519;BA.debugLine="If SwPic.Checked=True Then";
if (mostCurrent._swpic.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=78905520;
 //BA.debugLineNum = 78905520;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=78905521;
 //BA.debugLineNum = 78905521;BA.debugLine="str= str & \" and fldPathPic <> '0'\"";
_str = _str+" and fldPathPic <> '0'";
 };
RDebugUtils.currentLine=78905525;
 //BA.debugLineNum = 78905525;BA.debugLine="If TxtSearch.Text.Length>0 And TxtSearch.Text<>";
if (mostCurrent._txtsearch.getText().length()>0 && (mostCurrent._txtsearch.getText()).equals(" ") == false && (mostCurrent._txtsearch.getText()).equals("") == false) { 
RDebugUtils.currentLine=78905526;
 //BA.debugLineNum = 78905526;BA.debugLine="Dim StrSearch As String=MCode.ConvertNumbersPe";
_strsearch = mostCurrent._mcode._convertnumberspersian2english /*String*/ (mostCurrent.activityBA,mostCurrent._txtsearch.getText());
RDebugUtils.currentLine=78905527;
 //BA.debugLineNum = 78905527;BA.debugLine="If StrSearch=\"\" Then";
if ((_strsearch).equals("")) { 
RDebugUtils.currentLine=78905528;
 //BA.debugLineNum = 78905528;BA.debugLine="StrSearch=TxtSearch.Text";
_strsearch = mostCurrent._txtsearch.getText();
 };
RDebugUtils.currentLine=78905530;
 //BA.debugLineNum = 78905530;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=78905531;
 //BA.debugLineNum = 78905531;BA.debugLine="If IsNumber(StrSearch) Then";
if (anywheresoftware.b4a.keywords.Common.IsNumber(_strsearch)) { 
RDebugUtils.currentLine=78905532;
 //BA.debugLineNum = 78905532;BA.debugLine="If StrSearch.Length>5 Then";
if (_strsearch.length()>5) { 
RDebugUtils.currentLine=78905533;
 //BA.debugLineNum = 78905533;BA.debugLine="str = str & $\" and (fldSerial = '${StrSearch";
_str = _str+(" and (fldSerial = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_strsearch))+"') ");
 }else {
RDebugUtils.currentLine=78905535;
 //BA.debugLineNum = 78905535;BA.debugLine="str = str & $\" and (fldCodeKala like '%${Str";
_str = _str+(" and (fldCodeKala like '%"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_strsearch))+"%') ");
 };
 }else {
RDebugUtils.currentLine=78905539;
 //BA.debugLineNum = 78905539;BA.debugLine="str = str & $\" and (fldNameKala like '%${StrS";
_str = _str+(" and (fldNameKala like '%"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_strsearch))+"%') ");
 };
RDebugUtils.currentLine=78905541;
 //BA.debugLineNum = 78905541;BA.debugLine="filter=True";
_filter = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=78905542;
 //BA.debugLineNum = 78905542;BA.debugLine="If countfilter=1 Then";
if (_countfilter==1) { 
RDebugUtils.currentLine=78905543;
 //BA.debugLineNum = 78905543;BA.debugLine="str=str.Replace(\" and \",\"\")";
_str = _str.replace(" and ","");
 };
 };
RDebugUtils.currentLine=78905547;
 //BA.debugLineNum = 78905547;BA.debugLine="If	filter=True And str<>\"\" Then";
if (_filter==anywheresoftware.b4a.keywords.Common.True && (_str).equals("") == false) { 
RDebugUtils.currentLine=78905548;
 //BA.debugLineNum = 78905548;BA.debugLine="str=\"select * from TblKala where fldCodeGroup";
_str = "select * from TblKala where fldCodeGroup like '"+mostCurrent._groupcodeselect2+"%' and "+_str+" "+mostCurrent._str_sort;
 }else {
RDebugUtils.currentLine=78905550;
 //BA.debugLineNum = 78905550;BA.debugLine="str=\"select * from TblKala where fldCodeGroup";
_str = "select * from TblKala where fldCodeGroup like '"+mostCurrent._groupcodeselect2+"%' "+mostCurrent._str_sort;
 };
RDebugUtils.currentLine=78905553;
 //BA.debugLineNum = 78905553;BA.debugLine="Log(str)";
anywheresoftware.b4a.keywords.Common.LogImpl("578905553",_str,0);
 };
RDebugUtils.currentLine=78905555;
 //BA.debugLineNum = 78905555;BA.debugLine="FirebaseMessaging.mode=\"stop\"";
mostCurrent._firebasemessaging._mode /*String*/  = "stop";
RDebugUtils.currentLine=78905556;
 //BA.debugLineNum = 78905556;BA.debugLine="LoadListKala(str)";
_loadlistkala(_str);
 } 
       catch (Exception e182) {
			processBA.setLastException(e182);RDebugUtils.currentLine=78905562;
 //BA.debugLineNum = 78905562;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("578905562",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=78905563;
 //BA.debugLineNum = 78905563;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-LoadKala");
 };
RDebugUtils.currentLine=78905566;
 //BA.debugLineNum = 78905566;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="act_search";
RDebugUtils.currentLine=79101952;
 //BA.debugLineNum = 79101952;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=79101954;
 //BA.debugLineNum = 79101954;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="act_search";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=78970880;
 //BA.debugLineNum = 78970880;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=78970884;
 //BA.debugLineNum = 78970884;BA.debugLine="End Sub";
return "";
}
public static boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
RDebugUtils.currentModule="act_search";
if (Debug.shouldDelegate(mostCurrent.activityBA, "application_error", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "application_error", new Object[] {_error,_stacktrace}));}
RDebugUtils.currentLine=80805888;
 //BA.debugLineNum = 80805888;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
RDebugUtils.currentLine=80805890;
 //BA.debugLineNum = 80805890;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=80805891;
 //BA.debugLineNum = 80805891;BA.debugLine="End Sub";
return false;
}
public static String  _btn_back_click() throws Exception{
RDebugUtils.currentModule="act_search";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_back_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_back_click", null));}
RDebugUtils.currentLine=80674816;
 //BA.debugLineNum = 80674816;BA.debugLine="Sub btn_Back_Click";
RDebugUtils.currentLine=80674817;
 //BA.debugLineNum = 80674817;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=80674818;
 //BA.debugLineNum = 80674818;BA.debugLine="End Sub";
return "";
}
public static String  _btncommentexit_click() throws Exception{
RDebugUtils.currentModule="act_search";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btncommentexit_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btncommentexit_click", null));}
RDebugUtils.currentLine=80019456;
 //BA.debugLineNum = 80019456;BA.debugLine="Sub BtnCommentExit_Click";
RDebugUtils.currentLine=80019457;
 //BA.debugLineNum = 80019457;BA.debugLine="pnlFilter.SetVisibleAnimated(300,False)";
mostCurrent._pnlfilter.SetVisibleAnimated((int) (300),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=80019458;
 //BA.debugLineNum = 80019458;BA.debugLine="End Sub";
return "";
}
public static String  _btnsearch_click() throws Exception{
RDebugUtils.currentModule="act_search";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnsearch_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnsearch_click", null));}
RDebugUtils.currentLine=80412672;
 //BA.debugLineNum = 80412672;BA.debugLine="Sub BtnSearch_Click";
RDebugUtils.currentLine=80412673;
 //BA.debugLineNum = 80412673;BA.debugLine="Log(\"BtnSearch_Click\")";
anywheresoftware.b4a.keywords.Common.LogImpl("580412673","BtnSearch_Click",0);
RDebugUtils.currentLine=80412683;
 //BA.debugLineNum = 80412683;BA.debugLine="End Sub";
return "";
}
public static String  _btnshowfilterpnl_click() throws Exception{
RDebugUtils.currentModule="act_search";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnshowfilterpnl_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnshowfilterpnl_click", null));}
RDebugUtils.currentLine=80084992;
 //BA.debugLineNum = 80084992;BA.debugLine="Sub BtnShowFilterPnl_Click";
RDebugUtils.currentLine=80084994;
 //BA.debugLineNum = 80084994;BA.debugLine="If Panel2.Height = Label11.top Then";
if (mostCurrent._panel2.getHeight()==mostCurrent._label11.getTop()) { 
RDebugUtils.currentLine=80084995;
 //BA.debugLineNum = 80084995;BA.debugLine="Panel2.SetLayoutAnimated(500,Panel2.Left,Panel2.";
mostCurrent._panel2.SetLayoutAnimated((int) (500),mostCurrent._panel2.getLeft(),mostCurrent._panel2.getTop(),mostCurrent._panel2.getWidth(),(int) (mostCurrent._lblpoint.getTop()+mostCurrent._lblpoint.getHeight()));
RDebugUtils.currentLine=80084996;
 //BA.debugLineNum = 80084996;BA.debugLine="Pnl_Tools.SetLayoutAnimated(500,Pnl_Tools.Left,P";
mostCurrent._pnl_tools.SetLayoutAnimated((int) (500),mostCurrent._pnl_tools.getLeft(),(int) (mostCurrent._panel2.getTop()+mostCurrent._panel2.getHeight()+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (1),mostCurrent.activityBA)),mostCurrent._pnl_tools.getWidth(),mostCurrent._pnl_tools.getHeight());
RDebugUtils.currentLine=80084997;
 //BA.debugLineNum = 80084997;BA.debugLine="pnl_HLV.SetLayoutAnimated(500,pnl_HLV.Left,Pnl_T";
mostCurrent._pnl_hlv.SetLayoutAnimated((int) (500),mostCurrent._pnl_hlv.getLeft(),(int) (mostCurrent._pnl_tools.getTop()+mostCurrent._pnl_tools.getHeight()),mostCurrent._pnl_hlv.getWidth(),mostCurrent._pnl_hlv.getHeight());
RDebugUtils.currentLine=80084999;
 //BA.debugLineNum = 80084999;BA.debugLine="HLV.Height=pnl_HLV.Height - 15%y";
mostCurrent._hlv.setHeight((int) (mostCurrent._pnl_hlv.getHeight()-anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (15),mostCurrent.activityBA)));
 }else {
RDebugUtils.currentLine=80085001;
 //BA.debugLineNum = 80085001;BA.debugLine="Panel2.SetLayoutAnimated(500,Panel2.Left,Panel2.";
mostCurrent._panel2.SetLayoutAnimated((int) (500),mostCurrent._panel2.getLeft(),mostCurrent._panel2.getTop(),mostCurrent._panel2.getWidth(),mostCurrent._label11.getTop());
RDebugUtils.currentLine=80085002;
 //BA.debugLineNum = 80085002;BA.debugLine="Pnl_Tools.SetLayoutAnimated(500,Pnl_Tools.Left,P";
mostCurrent._pnl_tools.SetLayoutAnimated((int) (500),mostCurrent._pnl_tools.getLeft(),(int) (mostCurrent._pnl_top.getTop()+mostCurrent._pnl_top.getHeight()),mostCurrent._pnl_tools.getWidth(),mostCurrent._pnl_tools.getHeight());
RDebugUtils.currentLine=80085003;
 //BA.debugLineNum = 80085003;BA.debugLine="pnl_HLV.SetLayoutAnimated(500,pnl_HLV.Left,Pnl_T";
mostCurrent._pnl_hlv.SetLayoutAnimated((int) (500),mostCurrent._pnl_hlv.getLeft(),(int) (mostCurrent._pnl_tools.getTop()+mostCurrent._pnl_tools.getHeight()),mostCurrent._pnl_hlv.getWidth(),mostCurrent._pnl_hlv.getHeight());
RDebugUtils.currentLine=80085006;
 //BA.debugLineNum = 80085006;BA.debugLine="HLV.Height=pnl_HLV.Height";
mostCurrent._hlv.setHeight(mostCurrent._pnl_hlv.getHeight());
 };
RDebugUtils.currentLine=80085009;
 //BA.debugLineNum = 80085009;BA.debugLine="End Sub";
return "";
}
public static String  _btnupdate_click() throws Exception{
RDebugUtils.currentModule="act_search";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnupdate_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnupdate_click", null));}
RDebugUtils.currentLine=78839808;
 //BA.debugLineNum = 78839808;BA.debugLine="Sub btnUpdate_Click";
RDebugUtils.currentLine=78839811;
 //BA.debugLineNum = 78839811;BA.debugLine="If MCode.IsConnected Then";
if (mostCurrent._mcode._isconnected /*boolean*/ (mostCurrent.activityBA)) { 
RDebugUtils.currentLine=78839812;
 //BA.debugLineNum = 78839812;BA.debugLine="StartService(FirebaseMessaging)";
anywheresoftware.b4a.keywords.Common.StartService(processBA,(Object)(mostCurrent._firebasemessaging.getObject()));
RDebugUtils.currentLine=78839813;
 //BA.debugLineNum = 78839813;BA.debugLine="MCode.page=\"Search\"";
mostCurrent._mcode._page /*String*/  = "Search";
RDebugUtils.currentLine=78839814;
 //BA.debugLineNum = 78839814;BA.debugLine="FirebaseMessaging.mode=\"GetGalleryKala\"";
mostCurrent._firebasemessaging._mode /*String*/  = "GetGalleryKala";
 }else {
RDebugUtils.currentLine=78839816;
 //BA.debugLineNum = 78839816;BA.debugLine="LoadKala";
_loadkala();
 };
RDebugUtils.currentLine=78839820;
 //BA.debugLineNum = 78839820;BA.debugLine="End Sub";
return "";
}
public static int  _hlv_getitemcount() throws Exception{
RDebugUtils.currentModule="act_search";
if (Debug.shouldDelegate(mostCurrent.activityBA, "hlv_getitemcount", false))
	 {return ((Integer) Debug.delegate(mostCurrent.activityBA, "hlv_getitemcount", null));}
RDebugUtils.currentLine=79560704;
 //BA.debugLineNum = 79560704;BA.debugLine="Sub HLV_GetItemCount As Int";
RDebugUtils.currentLine=79560705;
 //BA.debugLineNum = 79560705;BA.debugLine="Try								        '💯 ItemCount 💯'";
try {RDebugUtils.currentLine=79560706;
 //BA.debugLineNum = 79560706;BA.debugLine="Return ListKalaTxt.Size";
if (true) return mostCurrent._listkalatxt.getSize();
 } 
       catch (Exception e4) {
			processBA.setLastException(e4);RDebugUtils.currentLine=79560709;
 //BA.debugLineNum = 79560709;BA.debugLine="MCode.SendError(LastException)";
mostCurrent._mcode._senderror /*String*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
RDebugUtils.currentLine=79560710;
 //BA.debugLineNum = 79560710;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("579560710",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=79560711;
 //BA.debugLineNum = 79560711;BA.debugLine="Return 0";
if (true) return (int) (0);
 };
RDebugUtils.currentLine=79560713;
 //BA.debugLineNum = 79560713;BA.debugLine="End Sub";
return 0;
}
public static String  _hlv_onbindviewholder(anywheresoftware.b4a.objects.PanelWrapper _parent,int _position) throws Exception{
RDebugUtils.currentModule="act_search";
if (Debug.shouldDelegate(mostCurrent.activityBA, "hlv_onbindviewholder", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "hlv_onbindviewholder", new Object[] {_parent,_position}));}
ir.parsikhesab.pakhsh.mcode._adapterlistkala _item = null;
ir.parsikhesab.pakhsh.cls_search _rec = null;
RDebugUtils.currentLine=79691776;
 //BA.debugLineNum = 79691776;BA.debugLine="Sub HLV_onBindViewHolder (Parent As Panel, Positio";
RDebugUtils.currentLine=79691777;
 //BA.debugLineNum = 79691777;BA.debugLine="Try";
try {RDebugUtils.currentLine=79691778;
 //BA.debugLineNum = 79691778;BA.debugLine="Dim Item = ListKalaTxt.Get(Position) As AdapterLi";
_item = (ir.parsikhesab.pakhsh.mcode._adapterlistkala)(mostCurrent._listkalatxt.Get(_position));
RDebugUtils.currentLine=79691779;
 //BA.debugLineNum = 79691779;BA.debugLine="Dim rec As cls_Search=Parent.Tag";
_rec = (ir.parsikhesab.pakhsh.cls_search)(_parent.getTag());
RDebugUtils.currentLine=79691780;
 //BA.debugLineNum = 79691780;BA.debugLine="rec.Show(Item,Position)";
_rec._show /*String*/ (null,_item,_position);
RDebugUtils.currentLine=79691781;
 //BA.debugLineNum = 79691781;BA.debugLine="Parent.Height=rec.Height";
_parent.setHeight(_rec._getheight /*int*/ (null));
 } 
       catch (Exception e7) {
			processBA.setLastException(e7);RDebugUtils.currentLine=79691783;
 //BA.debugLineNum = 79691783;BA.debugLine="MCode.SendError(LastException)";
mostCurrent._mcode._senderror /*String*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
RDebugUtils.currentLine=79691784;
 //BA.debugLineNum = 79691784;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("579691784",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 };
RDebugUtils.currentLine=79691786;
 //BA.debugLineNum = 79691786;BA.debugLine="End Sub";
return "";
}
public static String  _hlv_oncreateviewholder(anywheresoftware.b4a.objects.PanelWrapper _parent,int _viewtype) throws Exception{
RDebugUtils.currentModule="act_search";
if (Debug.shouldDelegate(mostCurrent.activityBA, "hlv_oncreateviewholder", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "hlv_oncreateviewholder", new Object[] {_parent,_viewtype}));}
ir.parsikhesab.pakhsh.cls_search _rec = null;
RDebugUtils.currentLine=79626240;
 //BA.debugLineNum = 79626240;BA.debugLine="Sub HLV_onCreateViewHolder (Parent As Panel, ViewT";
RDebugUtils.currentLine=79626242;
 //BA.debugLineNum = 79626242;BA.debugLine="Dim rec As cls_Search";
_rec = new ir.parsikhesab.pakhsh.cls_search();
RDebugUtils.currentLine=79626243;
 //BA.debugLineNum = 79626243;BA.debugLine="rec.Initialize(Me)";
_rec._initialize /*String*/ (null,mostCurrent.activityBA,act_search.getObject());
RDebugUtils.currentLine=79626244;
 //BA.debugLineNum = 79626244;BA.debugLine="Parent.AddView(rec.Panel,0,0,100%x,rec.Height)";
_parent.AddView((android.view.View)(_rec._getpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ (null).getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),_rec._getheight /*int*/ (null));
RDebugUtils.currentLine=79626245;
 //BA.debugLineNum = 79626245;BA.debugLine="Parent.Tag=rec";
_parent.setTag((Object)(_rec));
RDebugUtils.currentLine=79626247;
 //BA.debugLineNum = 79626247;BA.debugLine="End Sub";
return "";
}
public static void  _img_barcode_click() throws Exception{
RDebugUtils.currentModule="act_search";
if (Debug.shouldDelegate(mostCurrent.activityBA, "img_barcode_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "img_barcode_click", null); return;}
ResumableSub_Img_barcode_Click rsub = new ResumableSub_Img_barcode_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Img_barcode_Click extends BA.ResumableSub {
public ResumableSub_Img_barcode_Click(ir.parsikhesab.pakhsh.act_search parent) {
this.parent = parent;
}
ir.parsikhesab.pakhsh.act_search parent;
boolean _result = false;
String _permission = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_search";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=79757314;
 //BA.debugLineNum = 79757314;BA.debugLine="Dim Result As Boolean = True";
_result = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=79757315;
 //BA.debugLineNum = 79757315;BA.debugLine="If Not(rp.Check(rp.PERMISSION_CAMERA)) Then";
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
RDebugUtils.currentLine=79757316;
 //BA.debugLineNum = 79757316;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_CAMERA)";
parent._rp.CheckAndRequest(processBA,parent._rp.PERMISSION_CAMERA);
RDebugUtils.currentLine=79757317;
 //BA.debugLineNum = 79757317;BA.debugLine="Wait For Activity_PermissionResult (Permission A";
anywheresoftware.b4a.keywords.Common.WaitFor("activity_permissionresult", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_search", "img_barcode_click"), null);
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
RDebugUtils.currentLine=79757319;
 //BA.debugLineNum = 79757319;BA.debugLine="If Result=False Then";

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
RDebugUtils.currentLine=79757320;
 //BA.debugLineNum = 79757320;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=79757322;
 //BA.debugLineNum = 79757322;BA.debugLine="Barcode.BeginScan(\"myzx\")";
parent.mostCurrent._barcode.BeginScan(mostCurrent.activityBA,"myzx");
 if (true) break;

case 9:
//C
this.state = -1;
;
RDebugUtils.currentLine=79757325;
 //BA.debugLineNum = 79757325;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _img_paging_click() throws Exception{
RDebugUtils.currentModule="act_search";
if (Debug.shouldDelegate(mostCurrent.activityBA, "img_paging_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "img_paging_click", null));}
RDebugUtils.currentLine=80543744;
 //BA.debugLineNum = 80543744;BA.debugLine="Sub Img_Paging_Click";
RDebugUtils.currentLine=80543746;
 //BA.debugLineNum = 80543746;BA.debugLine="Act_KalaPaging2.listKala=ListKalaTxt";
mostCurrent._act_kalapaging2._listkala /*anywheresoftware.b4a.objects.collections.List*/  = mostCurrent._listkalatxt;
RDebugUtils.currentLine=80543747;
 //BA.debugLineNum = 80543747;BA.debugLine="StartActivity(Act_KalaPaging2)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._act_kalapaging2.getObject()));
RDebugUtils.currentLine=80543749;
 //BA.debugLineNum = 80543749;BA.debugLine="End Sub";
return "";
}
public static String  _img_sort_click() throws Exception{
RDebugUtils.currentModule="act_search";
if (Debug.shouldDelegate(mostCurrent.activityBA, "img_sort_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "img_sort_click", null));}
anywheresoftware.b4a.objects.collections.List _lst = null;
int _res = 0;
RDebugUtils.currentLine=80478208;
 //BA.debugLineNum = 80478208;BA.debugLine="Sub Img_sort_Click";
RDebugUtils.currentLine=80478217;
 //BA.debugLineNum = 80478217;BA.debugLine="Dim Lst As List = Array As String(\"کد کالا\",\"نام";
_lst = new anywheresoftware.b4a.objects.collections.List();
_lst = anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"کد کالا","نام کالا نزولی","نام کالا صعودی","ارزان ترین قیمت","گرانترین قیمت","کمترین موجودی","بیشترین موجودی"});
RDebugUtils.currentLine=80478218;
 //BA.debugLineNum = 80478218;BA.debugLine="Dim res As Int = InputList(Lst,\"مرتب سازی براساس:";
_res = anywheresoftware.b4a.keywords.Common.InputList(_lst,BA.ObjectToCharSequence("مرتب سازی براساس:"),(int) (-1),mostCurrent.activityBA);
RDebugUtils.currentLine=80478219;
 //BA.debugLineNum = 80478219;BA.debugLine="Select Case res";
switch (_res) {
case 0: {
RDebugUtils.currentLine=80478221;
 //BA.debugLineNum = 80478221;BA.debugLine="Str_sort = \" Order by fldCodeKala Asc\"";
mostCurrent._str_sort = " Order by fldCodeKala Asc";
 break; }
case 1: {
RDebugUtils.currentLine=80478223;
 //BA.debugLineNum = 80478223;BA.debugLine="Str_sort = \" Order by fldNameKala\"";
mostCurrent._str_sort = " Order by fldNameKala";
 break; }
case 2: {
RDebugUtils.currentLine=80478225;
 //BA.debugLineNum = 80478225;BA.debugLine="Str_sort = \" Order by fldNameKala Desc\"";
mostCurrent._str_sort = " Order by fldNameKala Desc";
 break; }
case 3: {
RDebugUtils.currentLine=80478227;
 //BA.debugLineNum = 80478227;BA.debugLine="Str_sort = \" Order by fldFeeForoosh\"";
mostCurrent._str_sort = " Order by fldFeeForoosh";
 break; }
case 4: {
RDebugUtils.currentLine=80478229;
 //BA.debugLineNum = 80478229;BA.debugLine="Str_sort = \" Order by fldFeeForoosh Desc\"";
mostCurrent._str_sort = " Order by fldFeeForoosh Desc";
 break; }
case 5: {
RDebugUtils.currentLine=80478231;
 //BA.debugLineNum = 80478231;BA.debugLine="Str_sort = \" Order by SumMande\"";
mostCurrent._str_sort = " Order by SumMande";
 break; }
case 6: {
RDebugUtils.currentLine=80478233;
 //BA.debugLineNum = 80478233;BA.debugLine="Str_sort = \" Order by SumMande Desc\"";
mostCurrent._str_sort = " Order by SumMande Desc";
 break; }
}
;
RDebugUtils.currentLine=80478235;
 //BA.debugLineNum = 80478235;BA.debugLine="Log(Str_sort)";
anywheresoftware.b4a.keywords.Common.LogImpl("580478235",mostCurrent._str_sort,0);
RDebugUtils.currentLine=80478237;
 //BA.debugLineNum = 80478237;BA.debugLine="LoadKala";
_loadkala();
RDebugUtils.currentLine=80478239;
 //BA.debugLineNum = 80478239;BA.debugLine="End Sub";
return "";
}
public static void  _img_tipfee_click() throws Exception{
RDebugUtils.currentModule="act_search";
if (Debug.shouldDelegate(mostCurrent.activityBA, "img_tipfee_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "img_tipfee_click", null); return;}
ResumableSub_Img_TipFee_Click rsub = new ResumableSub_Img_TipFee_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Img_TipFee_Click extends BA.ResumableSub {
public ResumableSub_Img_TipFee_Click(ir.parsikhesab.pakhsh.act_search parent) {
this.parent = parent;
}
ir.parsikhesab.pakhsh.act_search parent;
int _btnshow = 0;
anywheresoftware.b4a.objects.collections.List _lst = null;
int _result = 0;
int _res = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_search";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=80609282;
 //BA.debugLineNum = 80609282;BA.debugLine="Dim btnshow As Int=myCode.getSetting(\"setting.dat";
_btnshow = (int)(Double.parseDouble(parent.mostCurrent._mycode._getsetting /*String*/ (mostCurrent.activityBA,"setting.dat","WSetTip",BA.NumberToString(0))));
RDebugUtils.currentLine=80609283;
 //BA.debugLineNum = 80609283;BA.debugLine="Log(btnshow)";
anywheresoftware.b4a.keywords.Common.LogImpl("580609283",BA.NumberToString(_btnshow),0);
RDebugUtils.currentLine=80609284;
 //BA.debugLineNum = 80609284;BA.debugLine="If btnshow=0 Then";
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
RDebugUtils.currentLine=80609285;
 //BA.debugLineNum = 80609285;BA.debugLine="ToastMessageShow(\"دسترسی شما به این گزینه محدود";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("دسترسی شما به این گزینه محدود است"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=80609286;
 //BA.debugLineNum = 80609286;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=80609290;
 //BA.debugLineNum = 80609290;BA.debugLine="Dim Lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=80609292;
 //BA.debugLineNum = 80609292;BA.debugLine="Lst.Initialize2(Array As String(\"تیپ1 (بدون احتسا";
_lst.Initialize2(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"تیپ1 (بدون احتساب تخفیف)","تیپ1 (با احتساب تخفیف)","تیپ قیمت 3","تیپ قیمت 4","تیپ قیمت 5","تیپ قیمت 6","تیپ قیمت 7","تیپ قیمت 8","تیپ قیمت 9","تیپ قیمت 10"}));
RDebugUtils.currentLine=80609293;
 //BA.debugLineNum = 80609293;BA.debugLine="If FeeTip = 0 Then FeeTip=1";
if (true) break;

case 5:
//if
this.state = 10;
if ((parent.mostCurrent._feetip).equals(BA.NumberToString(0))) { 
this.state = 7;
;}if (true) break;

case 7:
//C
this.state = 10;
parent.mostCurrent._feetip = BA.NumberToString(1);
if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=80609294;
 //BA.debugLineNum = 80609294;BA.debugLine="InputListAsync(Lst,\"تیپ قیمت را انتخاب کنید\",FeeT";
anywheresoftware.b4a.keywords.Common.InputListAsync(_lst,BA.ObjectToCharSequence("تیپ قیمت را انتخاب کنید"),(int) ((double)(Double.parseDouble(parent.mostCurrent._feetip))-1),processBA,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=80609295;
 //BA.debugLineNum = 80609295;BA.debugLine="Wait For InputList_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("inputlist_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_search", "img_tipfee_click"), null);
this.state = 19;
return;
case 19:
//C
this.state = 11;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=80609296;
 //BA.debugLineNum = 80609296;BA.debugLine="If Result <> -3 Then";
if (true) break;

case 11:
//if
this.state = 18;
if (_result!=-3) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=80609297;
 //BA.debugLineNum = 80609297;BA.debugLine="Dim Res As Int=Msgbox2(\"توجه داشته باشید که با ت";
_res = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("توجه داشته باشید که با تغییر تیپ قیمت سبد خرید شما حذف می گردد، آیا می خواهید تیپ قیمت تغییر کند؟"),BA.ObjectToCharSequence("توجه"),"بله","","خیر",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=80609298;
 //BA.debugLineNum = 80609298;BA.debugLine="If Res = DialogResponse.POSITIVE Then";
if (true) break;

case 14:
//if
this.state = 17;
if (_res==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=80609299;
 //BA.debugLineNum = 80609299;BA.debugLine="MCode.SaveUpdate(\"Delete From TblSabad\")";
parent.mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Delete From TblSabad");
RDebugUtils.currentLine=80609300;
 //BA.debugLineNum = 80609300;BA.debugLine="RefreshLblSabad";
_refreshlblsabad();
RDebugUtils.currentLine=80609301;
 //BA.debugLineNum = 80609301;BA.debugLine="FeeTip = Result+1";
parent.mostCurrent._feetip = BA.NumberToString(_result+1);
RDebugUtils.currentLine=80609302;
 //BA.debugLineNum = 80609302;BA.debugLine="search(True)";
_search(anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 17:
//C
this.state = 18;
;
 if (true) break;

case 18:
//C
this.state = -1;
;
RDebugUtils.currentLine=80609306;
 //BA.debugLineNum = 80609306;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _refreshlblsabad() throws Exception{
RDebugUtils.currentModule="act_search";
if (Debug.shouldDelegate(mostCurrent.activityBA, "refreshlblsabad", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "refreshlblsabad", null));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
RDebugUtils.currentLine=79036416;
 //BA.debugLineNum = 79036416;BA.debugLine="Sub RefreshLblSabad";
RDebugUtils.currentLine=79036418;
 //BA.debugLineNum = 79036418;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From Tb";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblSabad");
RDebugUtils.currentLine=79036419;
 //BA.debugLineNum = 79036419;BA.debugLine="If Cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=79036420;
 //BA.debugLineNum = 79036420;BA.debugLine="LblBasketCount.Visible=True";
mostCurrent._lblbasketcount.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=79036421;
 //BA.debugLineNum = 79036421;BA.debugLine="LblBasketCount.Text=Cu.RowCount";
mostCurrent._lblbasketcount.setText(BA.ObjectToCharSequence(_cu.getRowCount()));
 }else {
RDebugUtils.currentLine=79036423;
 //BA.debugLineNum = 79036423;BA.debugLine="LblBasketCount.Visible=False";
mostCurrent._lblbasketcount.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=79036425;
 //BA.debugLineNum = 79036425;BA.debugLine="HLV.notifyDataSetChanged";
mostCurrent._hlv.notifyDataSetChanged();
RDebugUtils.currentLine=79036427;
 //BA.debugLineNum = 79036427;BA.debugLine="End Sub";
return "";
}
public static String  _search(boolean _checked) throws Exception{
RDebugUtils.currentModule="act_search";
if (Debug.shouldDelegate(mostCurrent.activityBA, "search", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "search", new Object[] {_checked}));}
String _str = "";
String _codegroohkala = "";
ir.parsikhesab.pakhsh.mcode._adaptergoroohkala _item = null;
anywheresoftware.b4a.objects.collections.List _lst = null;
int _i = 0;
String[] _d = null;
String _txt = "";
RDebugUtils.currentLine=79495168;
 //BA.debugLineNum = 79495168;BA.debugLine="Private Sub search(Checked As Boolean)";
RDebugUtils.currentLine=79495170;
 //BA.debugLineNum = 79495170;BA.debugLine="Log(Checked)";
anywheresoftware.b4a.keywords.Common.LogImpl("579495170",BA.ObjectToString(_checked),0);
RDebugUtils.currentLine=79495171;
 //BA.debugLineNum = 79495171;BA.debugLine="Dim Str As String";
_str = "";
RDebugUtils.currentLine=79495172;
 //BA.debugLineNum = 79495172;BA.debugLine="Dim CodeGroohKala As String";
_codegroohkala = "";
RDebugUtils.currentLine=79495173;
 //BA.debugLineNum = 79495173;BA.debugLine="If NiceSpinner1.SelectedIndex > 0 Then";
if (mostCurrent._nicespinner1.getSelectedIndex()>0) { 
RDebugUtils.currentLine=79495174;
 //BA.debugLineNum = 79495174;BA.debugLine="Dim Item = ListGroohKala.Get(NiceSpinner1.Select";
_item = (ir.parsikhesab.pakhsh.mcode._adaptergoroohkala)(mostCurrent._listgroohkala.Get((int) (mostCurrent._nicespinner1.getSelectedIndex()-1)));
RDebugUtils.currentLine=79495175;
 //BA.debugLineNum = 79495175;BA.debugLine="CodeGroohKala = Item.FldC_Gorooh";
_codegroohkala = _item.FldC_Gorooh /*String*/ ;
 }else {
RDebugUtils.currentLine=79495177;
 //BA.debugLineNum = 79495177;BA.debugLine="Dim lst As List=OriginalListGoroohKala";
_lst = new anywheresoftware.b4a.objects.collections.List();
_lst = mostCurrent._originallistgoroohkala;
RDebugUtils.currentLine=79495178;
 //BA.debugLineNum = 79495178;BA.debugLine="Dim I As Int = NiceSpinner.SelectedIndex";
_i = mostCurrent._nicespinner.getSelectedIndex();
RDebugUtils.currentLine=79495179;
 //BA.debugLineNum = 79495179;BA.debugLine="If I = 0 Then I = 1";
if (_i==0) { 
_i = (int) (1);};
RDebugUtils.currentLine=79495180;
 //BA.debugLineNum = 79495180;BA.debugLine="Dim Item As AdapterGoroohKala=lst.Get(I-1)";
_item = (ir.parsikhesab.pakhsh.mcode._adaptergoroohkala)(_lst.Get((int) (_i-1)));
RDebugUtils.currentLine=79495181;
 //BA.debugLineNum = 79495181;BA.debugLine="CodeGroohKala = Item.FldC_Gorooh' & Item.FldC_S_";
_codegroohkala = _item.FldC_Gorooh /*String*/ ;
 };
RDebugUtils.currentLine=79495184;
 //BA.debugLineNum = 79495184;BA.debugLine="Str =  \"  fldCodeGroup Like '\"& CodeGroohKala &\"";
_str = "  fldCodeGroup Like '"+_codegroohkala+"%'";
RDebugUtils.currentLine=79495211;
 //BA.debugLineNum = 79495211;BA.debugLine="Log(Str)";
anywheresoftware.b4a.keywords.Common.LogImpl("579495211",_str,0);
RDebugUtils.currentLine=79495212;
 //BA.debugLineNum = 79495212;BA.debugLine="If SwGift.Checked=True Then";
if (mostCurrent._swgift.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
 };
RDebugUtils.currentLine=79495215;
 //BA.debugLineNum = 79495215;BA.debugLine="If SwTakhfif.Checked=True Then";
if (mostCurrent._swtakhfif.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=79495216;
 //BA.debugLineNum = 79495216;BA.debugLine="Str= Str & \" and fldFeeBadAzTakhfif <> '0.0000'\"";
_str = _str+" and fldFeeBadAzTakhfif <> '0.0000'";
 };
RDebugUtils.currentLine=79495218;
 //BA.debugLineNum = 79495218;BA.debugLine="If SwMojoodi.Checked=True Then";
if (mostCurrent._swmojoodi.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=79495219;
 //BA.debugLineNum = 79495219;BA.debugLine="Str= Str & \" and SumMande > '0'\"";
_str = _str+" and SumMande > '0'";
 };
RDebugUtils.currentLine=79495221;
 //BA.debugLineNum = 79495221;BA.debugLine="If SwPic.Checked=True Then";
if (mostCurrent._swpic.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=79495222;
 //BA.debugLineNum = 79495222;BA.debugLine="Str= Str & \" and fldPathPic <> '0'\"";
_str = _str+" and fldPathPic <> '0'";
 };
RDebugUtils.currentLine=79495224;
 //BA.debugLineNum = 79495224;BA.debugLine="If TxtSearch.Text.Length>0 Then";
if (mostCurrent._txtsearch.getText().length()>0) { 
RDebugUtils.currentLine=79495225;
 //BA.debugLineNum = 79495225;BA.debugLine="If IsNumber(TxtSearch.Text) Then";
if (anywheresoftware.b4a.keywords.Common.IsNumber(mostCurrent._txtsearch.getText())) { 
RDebugUtils.currentLine=79495227;
 //BA.debugLineNum = 79495227;BA.debugLine="Str = Str & $\" and (fldCodeKala like '%${TxtSea";
_str = _str+(" and (fldCodeKala like '%"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._txtsearch.getText()))+"%') ");
 }else {
RDebugUtils.currentLine=79495229;
 //BA.debugLineNum = 79495229;BA.debugLine="Dim d() As String=Regex.Split(\" \",TxtSearch.Tex";
_d = anywheresoftware.b4a.keywords.Common.Regex.Split(" ",mostCurrent._txtsearch.getText());
RDebugUtils.currentLine=79495230;
 //BA.debugLineNum = 79495230;BA.debugLine="Dim txt As String=\"\"";
_txt = "";
RDebugUtils.currentLine=79495231;
 //BA.debugLineNum = 79495231;BA.debugLine="For i=0 To d.Length-1";
{
final int step33 = 1;
final int limit33 = (int) (_d.length-1);
_i = (int) (0) ;
for (;_i <= limit33 ;_i = _i + step33 ) {
RDebugUtils.currentLine=79495232;
 //BA.debugLineNum = 79495232;BA.debugLine="txt = txt &  $\" and (fldNameKala Like '%${d(i)";
_txt = _txt+(" and (fldNameKala Like '%"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_d[_i]))+"%') ");
 }
};
RDebugUtils.currentLine=79495234;
 //BA.debugLineNum = 79495234;BA.debugLine="Log(txt)";
anywheresoftware.b4a.keywords.Common.LogImpl("579495234",_txt,0);
RDebugUtils.currentLine=79495235;
 //BA.debugLineNum = 79495235;BA.debugLine="Str= Str & txt";
_str = _str+_txt;
 };
 };
RDebugUtils.currentLine=79495241;
 //BA.debugLineNum = 79495241;BA.debugLine="If Str.Length>0 Then";
if (_str.length()>0) { 
RDebugUtils.currentLine=79495245;
 //BA.debugLineNum = 79495245;BA.debugLine="Log(Str)";
anywheresoftware.b4a.keywords.Common.LogImpl("579495245",_str,0);
RDebugUtils.currentLine=79495246;
 //BA.debugLineNum = 79495246;BA.debugLine="LoadListKala(\"Select * From TblKala Where \" & St";
_loadlistkala("Select * From TblKala Where "+_str+" "+mostCurrent._str_sort);
 }else {
RDebugUtils.currentLine=79495248;
 //BA.debugLineNum = 79495248;BA.debugLine="LoadListKala(\"Select * From TblKala \" & Str_sort";
_loadlistkala("Select * From TblKala "+mostCurrent._str_sort);
 };
RDebugUtils.currentLine=79495250;
 //BA.debugLineNum = 79495250;BA.debugLine="Str = \"\"";
_str = "";
RDebugUtils.currentLine=79495252;
 //BA.debugLineNum = 79495252;BA.debugLine="End Sub";
return "";
}
public static void  _loadlistkala(String _query) throws Exception{
RDebugUtils.currentModule="act_search";
if (Debug.shouldDelegate(mostCurrent.activityBA, "loadlistkala", false))
	 {Debug.delegate(mostCurrent.activityBA, "loadlistkala", new Object[] {_query}); return;}
ResumableSub_LoadListKala rsub = new ResumableSub_LoadListKala(null,_query);
rsub.resume(processBA, null);
}
public static class ResumableSub_LoadListKala extends BA.ResumableSub {
public ResumableSub_LoadListKala(ir.parsikhesab.pakhsh.act_search parent,String _query) {
this.parent = parent;
this._query = _query;
}
ir.parsikhesab.pakhsh.act_search parent;
String _query;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
int _i = 0;
ir.parsikhesab.pakhsh.mcode._adapterlistkala _itemkala = null;
int _fldfeeforoosh = 0;
int _fldtedaddarkarton = 0;
int _summande = 0;
int step4;
int limit4;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_search";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=79233026;
 //BA.debugLineNum = 79233026;BA.debugLine="OrginalListKala.Clear";
parent.mostCurrent._orginallistkala.Clear();
RDebugUtils.currentLine=79233027;
 //BA.debugLineNum = 79233027;BA.debugLine="Dim Cu As Cursor = MCode.Result(Query)";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = parent.mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,_query);
RDebugUtils.currentLine=79233029;
 //BA.debugLineNum = 79233029;BA.debugLine="If Cu.RowCount > 0 Then";
if (true) break;

case 1:
//if
this.state = 18;
if (_cu.getRowCount()>0) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=79233030;
 //BA.debugLineNum = 79233030;BA.debugLine="For i = 0 To Cu.RowCount - 1";
if (true) break;

case 4:
//for
this.state = 17;
step4 = 1;
limit4 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
this.state = 19;
if (true) break;

case 19:
//C
this.state = 17;
if ((step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4)) this.state = 6;
if (true) break;

case 20:
//C
this.state = 19;
_i = ((int)(0 + _i + step4)) ;
if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=79233031;
 //BA.debugLineNum = 79233031;BA.debugLine="Dim ItemKala As AdapterListKala";
_itemkala = new ir.parsikhesab.pakhsh.mcode._adapterlistkala();
RDebugUtils.currentLine=79233032;
 //BA.debugLineNum = 79233032;BA.debugLine="Cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=79233033;
 //BA.debugLineNum = 79233033;BA.debugLine="Log(Cu.Getstring(\"fldCodeGroup\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("579233033",_cu.GetString("fldCodeGroup"),0);
RDebugUtils.currentLine=79233034;
 //BA.debugLineNum = 79233034;BA.debugLine="ItemKala.CodeKala=Cu.Getstring(\"fldCodeKala\")";
_itemkala.CodeKala /*String*/  = _cu.GetString("fldCodeKala");
RDebugUtils.currentLine=79233035;
 //BA.debugLineNum = 79233035;BA.debugLine="ItemKala.NameKala=Cu.Getstring(\"fldNameKala\")";
_itemkala.NameKala /*String*/  = _cu.GetString("fldNameKala");
RDebugUtils.currentLine=79233036;
 //BA.debugLineNum = 79233036;BA.debugLine="ItemKala.NameVahed=Cu.Getstring(\"fldNameVahed\")";
_itemkala.NameVahed /*String*/  = _cu.GetString("fldNameVahed");
RDebugUtils.currentLine=79233037;
 //BA.debugLineNum = 79233037;BA.debugLine="ItemKala.NameVahed2=Cu.Getstring(\"fldNameVahed2";
_itemkala.NameVahed2 /*String*/  = _cu.GetString("fldNameVahed2");
RDebugUtils.currentLine=79233038;
 //BA.debugLineNum = 79233038;BA.debugLine="ItemKala.SumMande=Cu.Getstring(\"SumMande\")";
_itemkala.SumMande /*String*/  = _cu.GetString("SumMande");
RDebugUtils.currentLine=79233041;
 //BA.debugLineNum = 79233041;BA.debugLine="ItemKala.TedadDarKarton =Cu.Getstring(\"fldTedad";
_itemkala.TedadDarKarton /*String*/  = _cu.GetString("fldTedadDarKarton");
RDebugUtils.currentLine=79233042;
 //BA.debugLineNum = 79233042;BA.debugLine="ItemKala.FeeForoosh=Cu.GetInt(\"fldFeeForoosh\")";
_itemkala.FeeForoosh /*int*/  = _cu.GetInt("fldFeeForoosh");
RDebugUtils.currentLine=79233043;
 //BA.debugLineNum = 79233043;BA.debugLine="ItemKala.FldMablaghMasrafKonande=Cu.GetString(\"";
_itemkala.FldMablaghMasrafKonande /*String*/  = _cu.GetString("fldGhymatMasrafkonande");
RDebugUtils.currentLine=79233045;
 //BA.debugLineNum = 79233045;BA.debugLine="ItemKala.fldPathPic=Cu.GetString(\"fldPathPic\")";
_itemkala.fldPathPic /*String*/  = _cu.GetString("fldPathPic");
RDebugUtils.currentLine=79233046;
 //BA.debugLineNum = 79233046;BA.debugLine="If Cu.GetString(\"fldFeeBadAzTakhfif\")<>Null The";
if (true) break;

case 7:
//if
this.state = 12;
if (_cu.GetString("fldFeeBadAzTakhfif")!= null) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
RDebugUtils.currentLine=79233047;
 //BA.debugLineNum = 79233047;BA.debugLine="Log(Cu.GetString(\"fldFeeBadAzTakhfif\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("579233047",_cu.GetString("fldFeeBadAzTakhfif"),0);
RDebugUtils.currentLine=79233048;
 //BA.debugLineNum = 79233048;BA.debugLine="ItemKala.fldFeeBadAzTakhfif=Cu.GetString(\"fldF";
_itemkala.fldFeeBadAzTakhfif /*String*/  = _cu.GetString("fldFeeBadAzTakhfif");
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=79233050;
 //BA.debugLineNum = 79233050;BA.debugLine="Log(Cu.GetString(\"fldFeeBadAzTakhfif\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("579233050",_cu.GetString("fldFeeBadAzTakhfif"),0);
RDebugUtils.currentLine=79233051;
 //BA.debugLineNum = 79233051;BA.debugLine="Log(\"0\")";
anywheresoftware.b4a.keywords.Common.LogImpl("579233051","0",0);
RDebugUtils.currentLine=79233052;
 //BA.debugLineNum = 79233052;BA.debugLine="ItemKala.fldFeeBadAzTakhfif=\"0\"";
_itemkala.fldFeeBadAzTakhfif /*String*/  = "0";
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=79233054;
 //BA.debugLineNum = 79233054;BA.debugLine="ItemKala.fldPathPic=Cu.GetString(\"fldPathPic\")";
_itemkala.fldPathPic /*String*/  = _cu.GetString("fldPathPic");
RDebugUtils.currentLine=79233057;
 //BA.debugLineNum = 79233057;BA.debugLine="If Cu.Getstring(\"fldNameVahed2\") <> \"\" Then";
if (true) break;

case 13:
//if
this.state = 16;
if ((_cu.GetString("fldNameVahed2")).equals("") == false) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=79233058;
 //BA.debugLineNum = 79233058;BA.debugLine="Dim FldFeeForoosh As Int = MCode.Sf.Val(Cu.Get";
_fldfeeforoosh = (int) (parent.mostCurrent._mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvvvv1(BA.NumberToString(_cu.GetInt("fldFeeForoosh"))));
RDebugUtils.currentLine=79233059;
 //BA.debugLineNum = 79233059;BA.debugLine="Dim FldTedadDarKarton As Int = MCode.Sf.Val(Cu";
_fldtedaddarkarton = (int) (parent.mostCurrent._mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvvvv1(_cu.GetString("fldTedadDarKarton")));
RDebugUtils.currentLine=79233060;
 //BA.debugLineNum = 79233060;BA.debugLine="Dim SumMande As Int = Cu.Getstring(\"SumMande\")";
_summande = (int)(Double.parseDouble(_cu.GetString("SumMande")));
RDebugUtils.currentLine=79233061;
 //BA.debugLineNum = 79233061;BA.debugLine="ItemKala.FeeForooshKarton=FldFeeForoosh * FldT";
_itemkala.FeeForooshKarton /*String*/  = BA.NumberToString(_fldfeeforoosh*_fldtedaddarkarton);
RDebugUtils.currentLine=79233062;
 //BA.debugLineNum = 79233062;BA.debugLine="ItemKala.SumMandeKarton=Round2( SumMande / Fld";
_itemkala.SumMandeKarton /*String*/  = BA.NumberToString(anywheresoftware.b4a.keywords.Common.Round2(_summande/(double)_fldtedaddarkarton,(int) (0)));
 if (true) break;

case 16:
//C
this.state = 20;
;
RDebugUtils.currentLine=79233064;
 //BA.debugLineNum = 79233064;BA.debugLine="OrginalListKala.Add(ItemKala)";
parent.mostCurrent._orginallistkala.Add((Object)(_itemkala));
 if (true) break;
if (true) break;

case 17:
//C
this.state = 18;
;
 if (true) break;

case 18:
//C
this.state = -1;
;
RDebugUtils.currentLine=79233068;
 //BA.debugLineNum = 79233068;BA.debugLine="Log(OrginalListKala.Size)";
anywheresoftware.b4a.keywords.Common.LogImpl("579233068",BA.NumberToString(parent.mostCurrent._orginallistkala.getSize()),0);
RDebugUtils.currentLine=79233069;
 //BA.debugLineNum = 79233069;BA.debugLine="ListKalaSp=OrginalListKala";
parent.mostCurrent._listkalasp = parent.mostCurrent._orginallistkala;
RDebugUtils.currentLine=79233070;
 //BA.debugLineNum = 79233070;BA.debugLine="ListKalaTxt=ListKalaSp";
parent.mostCurrent._listkalatxt = parent.mostCurrent._listkalasp;
RDebugUtils.currentLine=79233071;
 //BA.debugLineNum = 79233071;BA.debugLine="Sleep(100)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_search", "loadlistkala"),(int) (100));
this.state = 21;
return;
case 21:
//C
this.state = -1;
;
RDebugUtils.currentLine=79233074;
 //BA.debugLineNum = 79233074;BA.debugLine="HLV.notifyDataSetChanged";
parent.mostCurrent._hlv.notifyDataSetChanged();
RDebugUtils.currentLine=79233076;
 //BA.debugLineNum = 79233076;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _myzx_result(String _atype,String _values) throws Exception{
RDebugUtils.currentModule="act_search";
if (Debug.shouldDelegate(mostCurrent.activityBA, "myzx_result", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "myzx_result", new Object[] {_atype,_values}));}
RDebugUtils.currentLine=79822848;
 //BA.debugLineNum = 79822848;BA.debugLine="Sub myzx_result(atype As String,Values As String)";
RDebugUtils.currentLine=79822850;
 //BA.debugLineNum = 79822850;BA.debugLine="LogColor(\"type:\"&atype&\"values:\"&Values,Colors.re";
anywheresoftware.b4a.keywords.Common.LogImpl("579822850","type:"+_atype+"values:"+_values,anywheresoftware.b4a.keywords.Common.Colors.Red);
RDebugUtils.currentLine=79822853;
 //BA.debugLineNum = 79822853;BA.debugLine="TxtSearch.Text=Values";
mostCurrent._txtsearch.setText(BA.ObjectToCharSequence(_values));
RDebugUtils.currentLine=79822854;
 //BA.debugLineNum = 79822854;BA.debugLine="BtnSearch.Tag=True";
mostCurrent._btnsearch.setTag((Object)(anywheresoftware.b4a.keywords.Common.True));
RDebugUtils.currentLine=79822856;
 //BA.debugLineNum = 79822856;BA.debugLine="End Sub";
return "";
}
public static String  _nicespinner_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="act_search";
if (Debug.shouldDelegate(mostCurrent.activityBA, "nicespinner_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "nicespinner_itemclick", new Object[] {_position,_value}));}
anywheresoftware.b4a.objects.collections.List _lst = null;
ir.parsikhesab.pakhsh.mcode._adaptergoroohkala _item = null;
String _mc = "";
int _count = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
int _i = 0;
RDebugUtils.currentLine=79364096;
 //BA.debugLineNum = 79364096;BA.debugLine="Sub NiceSpinner_ItemClick (Position As Int, Value";
RDebugUtils.currentLine=79364099;
 //BA.debugLineNum = 79364099;BA.debugLine="Key.HideKeyboard";
mostCurrent._key.HideKeyboard(mostCurrent.activityBA);
RDebugUtils.currentLine=79364102;
 //BA.debugLineNum = 79364102;BA.debugLine="If Position = 0 Then";
if (_position==0) { 
RDebugUtils.currentLine=79364103;
 //BA.debugLineNum = 79364103;BA.debugLine="ListGroohKala.Clear";
mostCurrent._listgroohkala.Clear();
RDebugUtils.currentLine=79364104;
 //BA.debugLineNum = 79364104;BA.debugLine="lstSelectedCodeGroupKala.Clear";
mostCurrent._lstselectedcodegroupkala.Clear();
RDebugUtils.currentLine=79364105;
 //BA.debugLineNum = 79364105;BA.debugLine="NiceSpinner1.Clear";
mostCurrent._nicespinner1.Clear();
RDebugUtils.currentLine=79364106;
 //BA.debugLineNum = 79364106;BA.debugLine="NiceSpinner1.Add(\"همه گروه ها\")";
mostCurrent._nicespinner1.Add("همه گروه ها");
RDebugUtils.currentLine=79364108;
 //BA.debugLineNum = 79364108;BA.debugLine="GroupCodeSelect1=\"0\"";
mostCurrent._groupcodeselect1 = "0";
RDebugUtils.currentLine=79364109;
 //BA.debugLineNum = 79364109;BA.debugLine="GroupNameSelect1=\"\"";
mostCurrent._groupnameselect1 = "";
RDebugUtils.currentLine=79364110;
 //BA.debugLineNum = 79364110;BA.debugLine="GroupCodeSelect2=\"0\"";
mostCurrent._groupcodeselect2 = "0";
RDebugUtils.currentLine=79364111;
 //BA.debugLineNum = 79364111;BA.debugLine="GroupNameSelect2=\"\"";
mostCurrent._groupnameselect2 = "";
RDebugUtils.currentLine=79364112;
 //BA.debugLineNum = 79364112;BA.debugLine="NiceSpinner1.SelectedIndex=0";
mostCurrent._nicespinner1.setSelectedIndex((int) (0));
 }else {
RDebugUtils.currentLine=79364115;
 //BA.debugLineNum = 79364115;BA.debugLine="Dim lst As List=OriginalListGoroohKala";
_lst = new anywheresoftware.b4a.objects.collections.List();
_lst = mostCurrent._originallistgoroohkala;
RDebugUtils.currentLine=79364116;
 //BA.debugLineNum = 79364116;BA.debugLine="Dim Item As AdapterGoroohKala=lst.Get(NiceSpinne";
_item = (ir.parsikhesab.pakhsh.mcode._adaptergoroohkala)(_lst.Get((int) (mostCurrent._nicespinner.getSelectedIndex()-1)));
RDebugUtils.currentLine=79364117;
 //BA.debugLineNum = 79364117;BA.debugLine="Log(Item.FldN_Gorooh)";
anywheresoftware.b4a.keywords.Common.LogImpl("579364117",_item.FldN_Gorooh /*String*/ ,0);
RDebugUtils.currentLine=79364118;
 //BA.debugLineNum = 79364118;BA.debugLine="Log(Item.FldC_Gorooh)";
anywheresoftware.b4a.keywords.Common.LogImpl("579364118",_item.FldC_Gorooh /*String*/ ,0);
RDebugUtils.currentLine=79364119;
 //BA.debugLineNum = 79364119;BA.debugLine="GroupCodeSelect1=Item.FldC_Gorooh";
mostCurrent._groupcodeselect1 = _item.FldC_Gorooh /*String*/ ;
RDebugUtils.currentLine=79364120;
 //BA.debugLineNum = 79364120;BA.debugLine="GroupNameSelect1=Item.FldN_Gorooh";
mostCurrent._groupnameselect1 = _item.FldN_Gorooh /*String*/ ;
RDebugUtils.currentLine=79364121;
 //BA.debugLineNum = 79364121;BA.debugLine="GroupCodeSelect2=\"0\"";
mostCurrent._groupcodeselect2 = "0";
RDebugUtils.currentLine=79364122;
 //BA.debugLineNum = 79364122;BA.debugLine="GroupNameSelect2=\"\"";
mostCurrent._groupnameselect2 = "";
RDebugUtils.currentLine=79364123;
 //BA.debugLineNum = 79364123;BA.debugLine="Dim mc As String=Item.FldC_Gorooh";
_mc = _item.FldC_Gorooh /*String*/ ;
RDebugUtils.currentLine=79364125;
 //BA.debugLineNum = 79364125;BA.debugLine="Dim Count As Int = Item.FldC_Gorooh.Length + 3";
_count = (int) (_item.FldC_Gorooh /*String*/ .length()+3);
RDebugUtils.currentLine=79364126;
 //BA.debugLineNum = 79364126;BA.debugLine="Dim Cu As Cursor=MCode.Result(\"Select FldC_Goroo";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select FldC_Gorooh,FldN_Gorooh From TblGoroohKala where FldC_Gorooh Like '"+_mc+"%' And Length(FldC_Gorooh) = "+BA.NumberToString(_count)+" ORDER BY FldC_Gorooh");
RDebugUtils.currentLine=79364127;
 //BA.debugLineNum = 79364127;BA.debugLine="If Cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=79364128;
 //BA.debugLineNum = 79364128;BA.debugLine="lstSelectedCodeGroupKala.Clear";
mostCurrent._lstselectedcodegroupkala.Clear();
RDebugUtils.currentLine=79364129;
 //BA.debugLineNum = 79364129;BA.debugLine="NiceSpinner1.Clear";
mostCurrent._nicespinner1.Clear();
RDebugUtils.currentLine=79364130;
 //BA.debugLineNum = 79364130;BA.debugLine="NiceSpinner1.Add(\"همه گروه ها\")";
mostCurrent._nicespinner1.Add("همه گروه ها");
RDebugUtils.currentLine=79364131;
 //BA.debugLineNum = 79364131;BA.debugLine="For i=0 To Cu.RowCount-1";
{
final int step28 = 1;
final int limit28 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit28 ;_i = _i + step28 ) {
RDebugUtils.currentLine=79364132;
 //BA.debugLineNum = 79364132;BA.debugLine="Cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=79364133;
 //BA.debugLineNum = 79364133;BA.debugLine="Dim Item As AdapterGoroohKala";
_item = new ir.parsikhesab.pakhsh.mcode._adaptergoroohkala();
RDebugUtils.currentLine=79364134;
 //BA.debugLineNum = 79364134;BA.debugLine="Item.FldC_Gorooh=Cu.GetString(\"FldC_Gorooh\")";
_item.FldC_Gorooh /*String*/  = _cu.GetString("FldC_Gorooh");
RDebugUtils.currentLine=79364135;
 //BA.debugLineNum = 79364135;BA.debugLine="Item.FldN_Gorooh=Cu.GetString(\"FldN_Gorooh\")";
_item.FldN_Gorooh /*String*/  = _cu.GetString("FldN_Gorooh");
RDebugUtils.currentLine=79364136;
 //BA.debugLineNum = 79364136;BA.debugLine="ListGroohKala.Add(Item)";
mostCurrent._listgroohkala.Add((Object)(_item));
RDebugUtils.currentLine=79364137;
 //BA.debugLineNum = 79364137;BA.debugLine="NiceSpinner1.Add(Cu.GetString(\"FldN_Gorooh\"))";
mostCurrent._nicespinner1.Add(_cu.GetString("FldN_Gorooh"));
 }
};
RDebugUtils.currentLine=79364139;
 //BA.debugLineNum = 79364139;BA.debugLine="NiceSpinner1.Show(Colors.blue, 14)";
mostCurrent._nicespinner1.Show(anywheresoftware.b4a.keywords.Common.Colors.Blue,(float) (14));
RDebugUtils.currentLine=79364140;
 //BA.debugLineNum = 79364140;BA.debugLine="NiceSpinner1.SelectedIndex = 0";
mostCurrent._nicespinner1.setSelectedIndex((int) (0));
RDebugUtils.currentLine=79364141;
 //BA.debugLineNum = 79364141;BA.debugLine="lstSelectedCodeGroupKala.Add(GroupCodeSelect1)";
mostCurrent._lstselectedcodegroupkala.Add((Object)(mostCurrent._groupcodeselect1));
 }else {
RDebugUtils.currentLine=79364143;
 //BA.debugLineNum = 79364143;BA.debugLine="ListGroohKala.Clear";
mostCurrent._listgroohkala.Clear();
RDebugUtils.currentLine=79364144;
 //BA.debugLineNum = 79364144;BA.debugLine="lstSelectedCodeGroupKala.Clear";
mostCurrent._lstselectedcodegroupkala.Clear();
RDebugUtils.currentLine=79364145;
 //BA.debugLineNum = 79364145;BA.debugLine="NiceSpinner1.Clear";
mostCurrent._nicespinner1.Clear();
RDebugUtils.currentLine=79364146;
 //BA.debugLineNum = 79364146;BA.debugLine="NiceSpinner1.Add(\"همه گروه ها\")";
mostCurrent._nicespinner1.Add("همه گروه ها");
RDebugUtils.currentLine=79364147;
 //BA.debugLineNum = 79364147;BA.debugLine="GroupCodeSelect2=\"0\"";
mostCurrent._groupcodeselect2 = "0";
RDebugUtils.currentLine=79364148;
 //BA.debugLineNum = 79364148;BA.debugLine="GroupNameSelect2=\"\"";
mostCurrent._groupnameselect2 = "";
RDebugUtils.currentLine=79364149;
 //BA.debugLineNum = 79364149;BA.debugLine="NiceSpinner1.SelectedIndex=0";
mostCurrent._nicespinner1.setSelectedIndex((int) (0));
 };
 };
RDebugUtils.currentLine=79364153;
 //BA.debugLineNum = 79364153;BA.debugLine="LoadKala";
_loadkala();
RDebugUtils.currentLine=79364154;
 //BA.debugLineNum = 79364154;BA.debugLine="Log(\"CodeGroupSelect1: \"&GroupCodeSelect1)";
anywheresoftware.b4a.keywords.Common.LogImpl("579364154","CodeGroupSelect1: "+mostCurrent._groupcodeselect1,0);
RDebugUtils.currentLine=79364155;
 //BA.debugLineNum = 79364155;BA.debugLine="Log(\"postion1: \"&Position)";
anywheresoftware.b4a.keywords.Common.LogImpl("579364155","postion1: "+BA.NumberToString(_position),0);
RDebugUtils.currentLine=79364158;
 //BA.debugLineNum = 79364158;BA.debugLine="End Sub";
return "";
}
public static String  _nicespinner1_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="act_search";
if (Debug.shouldDelegate(mostCurrent.activityBA, "nicespinner1_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "nicespinner1_itemclick", new Object[] {_position,_value}));}
anywheresoftware.b4a.objects.collections.List _lst = null;
ir.parsikhesab.pakhsh.mcode._adaptergoroohkala _item = null;
String _mc = "";
int _count = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
int _i = 0;
RDebugUtils.currentLine=79429632;
 //BA.debugLineNum = 79429632;BA.debugLine="Sub NiceSpinner1_ItemClick (Position As Int, Value";
RDebugUtils.currentLine=79429634;
 //BA.debugLineNum = 79429634;BA.debugLine="If Position=0 Then";
if (_position==0) { 
RDebugUtils.currentLine=79429636;
 //BA.debugLineNum = 79429636;BA.debugLine="GroupCodeSelect2=lstSelectedCodeGroupKala.Get(ls";
mostCurrent._groupcodeselect2 = BA.ObjectToString(mostCurrent._lstselectedcodegroupkala.Get((int) (mostCurrent._lstselectedcodegroupkala.getSize()-1)));
 }else {
RDebugUtils.currentLine=79429638;
 //BA.debugLineNum = 79429638;BA.debugLine="Dim lst As List=ListGroohKala";
_lst = new anywheresoftware.b4a.objects.collections.List();
_lst = mostCurrent._listgroohkala;
RDebugUtils.currentLine=79429639;
 //BA.debugLineNum = 79429639;BA.debugLine="Dim Item As AdapterGoroohKala=lst.Get(NiceSpinne";
_item = (ir.parsikhesab.pakhsh.mcode._adaptergoroohkala)(_lst.Get((int) (mostCurrent._nicespinner1.getSelectedIndex()-1)));
RDebugUtils.currentLine=79429640;
 //BA.debugLineNum = 79429640;BA.debugLine="GroupCodeSelect2=Item.FldC_Gorooh";
mostCurrent._groupcodeselect2 = _item.FldC_Gorooh /*String*/ ;
RDebugUtils.currentLine=79429642;
 //BA.debugLineNum = 79429642;BA.debugLine="Dim mc As String=Item.FldC_Gorooh";
_mc = _item.FldC_Gorooh /*String*/ ;
RDebugUtils.currentLine=79429644;
 //BA.debugLineNum = 79429644;BA.debugLine="Dim Count As Int = mc.Length + 3";
_count = (int) (_mc.length()+3);
RDebugUtils.currentLine=79429645;
 //BA.debugLineNum = 79429645;BA.debugLine="Dim Cu As Cursor=MCode.Result(\"Select FldC_Goroo";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select FldC_Gorooh,FldN_Gorooh From TblGoroohKala where FldC_Gorooh Like '"+_mc+"%' And Length(FldC_Gorooh) = "+BA.NumberToString(_count)+" ORDER BY FldC_Gorooh");
RDebugUtils.currentLine=79429646;
 //BA.debugLineNum = 79429646;BA.debugLine="If Cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=79429647;
 //BA.debugLineNum = 79429647;BA.debugLine="ListGroohKala.Clear";
mostCurrent._listgroohkala.Clear();
RDebugUtils.currentLine=79429648;
 //BA.debugLineNum = 79429648;BA.debugLine="NiceSpinner1.Clear";
mostCurrent._nicespinner1.Clear();
RDebugUtils.currentLine=79429651;
 //BA.debugLineNum = 79429651;BA.debugLine="lstSelectedCodeGroupKala.Add(Item.FldC_Gorooh)";
mostCurrent._lstselectedcodegroupkala.Add((Object)(_item.FldC_Gorooh /*String*/ ));
RDebugUtils.currentLine=79429654;
 //BA.debugLineNum = 79429654;BA.debugLine="NiceSpinner1.Add(\"همه گروه ها\")";
mostCurrent._nicespinner1.Add("همه گروه ها");
RDebugUtils.currentLine=79429656;
 //BA.debugLineNum = 79429656;BA.debugLine="For i=0 To Cu.RowCount-1";
{
final int step15 = 1;
final int limit15 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit15 ;_i = _i + step15 ) {
RDebugUtils.currentLine=79429657;
 //BA.debugLineNum = 79429657;BA.debugLine="Cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=79429658;
 //BA.debugLineNum = 79429658;BA.debugLine="Dim Item As AdapterGoroohKala";
_item = new ir.parsikhesab.pakhsh.mcode._adaptergoroohkala();
RDebugUtils.currentLine=79429659;
 //BA.debugLineNum = 79429659;BA.debugLine="Item.FldC_Gorooh=Cu.GetString(\"FldC_Gorooh\")";
_item.FldC_Gorooh /*String*/  = _cu.GetString("FldC_Gorooh");
RDebugUtils.currentLine=79429660;
 //BA.debugLineNum = 79429660;BA.debugLine="Item.FldN_Gorooh=Cu.GetString(\"FldN_Gorooh\")";
_item.FldN_Gorooh /*String*/  = _cu.GetString("FldN_Gorooh");
RDebugUtils.currentLine=79429661;
 //BA.debugLineNum = 79429661;BA.debugLine="ListGroohKala.Add(Item)";
mostCurrent._listgroohkala.Add((Object)(_item));
RDebugUtils.currentLine=79429662;
 //BA.debugLineNum = 79429662;BA.debugLine="NiceSpinner1.Add(Cu.GetString(\"FldN_Gorooh\"))";
mostCurrent._nicespinner1.Add(_cu.GetString("FldN_Gorooh"));
 }
};
RDebugUtils.currentLine=79429665;
 //BA.debugLineNum = 79429665;BA.debugLine="NiceSpinner1.Show(Colors.blue, 14)";
mostCurrent._nicespinner1.Show(anywheresoftware.b4a.keywords.Common.Colors.Blue,(float) (14));
RDebugUtils.currentLine=79429666;
 //BA.debugLineNum = 79429666;BA.debugLine="NiceSpinner1.SelectedIndex = 0";
mostCurrent._nicespinner1.setSelectedIndex((int) (0));
 };
 };
RDebugUtils.currentLine=79429669;
 //BA.debugLineNum = 79429669;BA.debugLine="LoadKala";
_loadkala();
RDebugUtils.currentLine=79429670;
 //BA.debugLineNum = 79429670;BA.debugLine="Log(\"CodeGroupSelect2: \"&GroupCodeSelect2)";
anywheresoftware.b4a.keywords.Common.LogImpl("579429670","CodeGroupSelect2: "+mostCurrent._groupcodeselect2,0);
RDebugUtils.currentLine=79429671;
 //BA.debugLineNum = 79429671;BA.debugLine="Log(\"position2: \"&Position)";
anywheresoftware.b4a.keywords.Common.LogImpl("579429671","position2: "+BA.NumberToString(_position),0);
RDebugUtils.currentLine=79429673;
 //BA.debugLineNum = 79429673;BA.debugLine="End Sub";
return "";
}
public static String  _numbersearch_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="act_search";
if (Debug.shouldDelegate(mostCurrent.activityBA, "numbersearch_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "numbersearch_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=79888384;
 //BA.debugLineNum = 79888384;BA.debugLine="Sub NumberSearch_TextChanged (Old As String, New A";
RDebugUtils.currentLine=79888386;
 //BA.debugLineNum = 79888386;BA.debugLine="LoadKala";
_loadkala();
RDebugUtils.currentLine=79888387;
 //BA.debugLineNum = 79888387;BA.debugLine="End Sub";
return "";
}
public static String  _pnl_down_click() throws Exception{
RDebugUtils.currentModule="act_search";
if (Debug.shouldDelegate(mostCurrent.activityBA, "pnl_down_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "pnl_down_click", null));}
RDebugUtils.currentLine=80740352;
 //BA.debugLineNum = 80740352;BA.debugLine="Sub Pnl_Down_Click";
RDebugUtils.currentLine=80740354;
 //BA.debugLineNum = 80740354;BA.debugLine="If LblBasketCount.Visible Then";
if (mostCurrent._lblbasketcount.getVisible()) { 
RDebugUtils.currentLine=80740355;
 //BA.debugLineNum = 80740355;BA.debugLine="StartActivity(Act_Sabad)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._act_sabad.getObject()));
RDebugUtils.currentLine=80740356;
 //BA.debugLineNum = 80740356;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 }else {
RDebugUtils.currentLine=80740358;
 //BA.debugLineNum = 80740358;BA.debugLine="ToastMessageShow(\"سبد خرید خالی است\",False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("سبد خرید خالی است"),anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=80740361;
 //BA.debugLineNum = 80740361;BA.debugLine="End Sub";
return "";
}
public static String  _refreshtedadkalaonlistkala() throws Exception{
RDebugUtils.currentModule="act_search";
if (Debug.shouldDelegate(mostCurrent.activityBA, "refreshtedadkalaonlistkala", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "refreshtedadkalaonlistkala", null));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
int _j = 0;
ir.parsikhesab.pakhsh.mcode._adapterlistkala _item = null;
int _i = 0;
RDebugUtils.currentLine=79298560;
 //BA.debugLineNum = 79298560;BA.debugLine="Sub RefreshTedadKalaOnListKala";
RDebugUtils.currentLine=79298562;
 //BA.debugLineNum = 79298562;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From Tb";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblSabad");
RDebugUtils.currentLine=79298563;
 //BA.debugLineNum = 79298563;BA.debugLine="If Cu.RowCount=0 Then Return";
if (_cu.getRowCount()==0) { 
if (true) return "";};
RDebugUtils.currentLine=79298564;
 //BA.debugLineNum = 79298564;BA.debugLine="For j=0 To ListKalaTxt.Size-1";
{
final int step3 = 1;
final int limit3 = (int) (mostCurrent._listkalatxt.getSize()-1);
_j = (int) (0) ;
for (;_j <= limit3 ;_j = _j + step3 ) {
RDebugUtils.currentLine=79298565;
 //BA.debugLineNum = 79298565;BA.debugLine="Dim Item=ListKalaTxt.Get(j) As AdapterListKala";
_item = (ir.parsikhesab.pakhsh.mcode._adapterlistkala)(mostCurrent._listkalatxt.Get(_j));
RDebugUtils.currentLine=79298566;
 //BA.debugLineNum = 79298566;BA.debugLine="For i=0 To Cu.RowCount - 1";
{
final int step5 = 1;
final int limit5 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=79298567;
 //BA.debugLineNum = 79298567;BA.debugLine="Cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=79298568;
 //BA.debugLineNum = 79298568;BA.debugLine="If Cu.GetString(\"FldCodeKala\") = Item.CodeKala";
if ((_cu.GetString("FldCodeKala")).equals(_item.CodeKala /*String*/ )) { 
RDebugUtils.currentLine=79298570;
 //BA.debugLineNum = 79298570;BA.debugLine="If Cu.GetString(\"FldTedadDarSabadJoz\") > 0 The";
if ((double)(Double.parseDouble(_cu.GetString("FldTedadDarSabadJoz")))>0) { 
RDebugUtils.currentLine=79298571;
 //BA.debugLineNum = 79298571;BA.debugLine="Item.TedadDarSabadJoz = Cu.GetString(\"FldTeda";
_item.TedadDarSabadJoz /*String*/  = _cu.GetString("FldTedadDarSabadJoz");
 }else {
RDebugUtils.currentLine=79298573;
 //BA.debugLineNum = 79298573;BA.debugLine="Item.TedadDarSabadJoz = 0";
_item.TedadDarSabadJoz /*String*/  = BA.NumberToString(0);
 };
RDebugUtils.currentLine=79298576;
 //BA.debugLineNum = 79298576;BA.debugLine="If Cu.GetString(\"FldTedadDarSabadKol\") > 0 The";
if ((double)(Double.parseDouble(_cu.GetString("FldTedadDarSabadKol")))>0) { 
RDebugUtils.currentLine=79298577;
 //BA.debugLineNum = 79298577;BA.debugLine="Item.TedadDarSabadKol = Cu.GetString(\"FldTeda";
_item.TedadDarSabadKol /*String*/  = _cu.GetString("FldTedadDarSabadKol");
 }else {
RDebugUtils.currentLine=79298579;
 //BA.debugLineNum = 79298579;BA.debugLine="Item.TedadDarSabadKol = 0";
_item.TedadDarSabadKol /*String*/  = BA.NumberToString(0);
 };
RDebugUtils.currentLine=79298582;
 //BA.debugLineNum = 79298582;BA.debugLine="Try";
try {RDebugUtils.currentLine=79298583;
 //BA.debugLineNum = 79298583;BA.debugLine="If Cu.GetString(\"FldEshantion\") > 0 Then";
if ((double)(Double.parseDouble(_cu.GetString("FldEshantion")))>0) { 
RDebugUtils.currentLine=79298584;
 //BA.debugLineNum = 79298584;BA.debugLine="Item.FldEshantion = Cu.GetString(\"FldEshanti";
_item.FldEshantion /*String*/  = _cu.GetString("FldEshantion");
 }else {
RDebugUtils.currentLine=79298586;
 //BA.debugLineNum = 79298586;BA.debugLine="Item.FldEshantion = 0";
_item.FldEshantion /*String*/  = BA.NumberToString(0);
 };
 } 
       catch (Exception e25) {
			processBA.setLastException(e25);RDebugUtils.currentLine=79298589;
 //BA.debugLineNum = 79298589;BA.debugLine="Item.FldEshantion = 0";
_item.FldEshantion /*String*/  = BA.NumberToString(0);
 };
 };
 }
};
 }
};
RDebugUtils.currentLine=79298595;
 //BA.debugLineNum = 79298595;BA.debugLine="End Sub";
return "";
}
public static String  _swgift_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="act_search";
if (Debug.shouldDelegate(mostCurrent.activityBA, "swgift_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "swgift_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=80150528;
 //BA.debugLineNum = 80150528;BA.debugLine="Sub SwGift_CheckedChange(Checked As Boolean)";
RDebugUtils.currentLine=80150530;
 //BA.debugLineNum = 80150530;BA.debugLine="LoadKala";
_loadkala();
RDebugUtils.currentLine=80150531;
 //BA.debugLineNum = 80150531;BA.debugLine="End Sub";
return "";
}
public static String  _swmojoodi_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="act_search";
if (Debug.shouldDelegate(mostCurrent.activityBA, "swmojoodi_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "swmojoodi_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=80281600;
 //BA.debugLineNum = 80281600;BA.debugLine="Sub SwMojoodi_CheckedChange(Checked As Boolean)";
RDebugUtils.currentLine=80281602;
 //BA.debugLineNum = 80281602;BA.debugLine="LoadKala";
_loadkala();
RDebugUtils.currentLine=80281603;
 //BA.debugLineNum = 80281603;BA.debugLine="End Sub";
return "";
}
public static String  _swpic_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="act_search";
if (Debug.shouldDelegate(mostCurrent.activityBA, "swpic_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "swpic_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=80347136;
 //BA.debugLineNum = 80347136;BA.debugLine="Sub SwPic_CheckedChange(Checked As Boolean)";
RDebugUtils.currentLine=80347138;
 //BA.debugLineNum = 80347138;BA.debugLine="LoadKala";
_loadkala();
RDebugUtils.currentLine=80347139;
 //BA.debugLineNum = 80347139;BA.debugLine="End Sub";
return "";
}
public static String  _swtakhfif_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="act_search";
if (Debug.shouldDelegate(mostCurrent.activityBA, "swtakhfif_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "swtakhfif_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=80216064;
 //BA.debugLineNum = 80216064;BA.debugLine="Sub SwTakhfif_CheckedChange(Checked As Boolean)";
RDebugUtils.currentLine=80216066;
 //BA.debugLineNum = 80216066;BA.debugLine="LoadKala";
_loadkala();
RDebugUtils.currentLine=80216067;
 //BA.debugLineNum = 80216067;BA.debugLine="End Sub";
return "";
}
public static String  _txtsearch_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="act_search";
if (Debug.shouldDelegate(mostCurrent.activityBA, "txtsearch_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "txtsearch_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=79953920;
 //BA.debugLineNum = 79953920;BA.debugLine="Sub TxtSearch_TextChanged (Old As String, New As S";
RDebugUtils.currentLine=79953922;
 //BA.debugLineNum = 79953922;BA.debugLine="LoadKala";
_loadkala();
RDebugUtils.currentLine=79953923;
 //BA.debugLineNum = 79953923;BA.debugLine="End Sub";
return "";
}
}