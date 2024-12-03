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

public class act_kaladefault extends Activity implements B4AActivity{
	public static act_kaladefault mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.act_kaladefault");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (act_kaladefault).");
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
		activityBA = new BA(this, layout, processBA, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.act_kaladefault");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "ir.parsikhesab.pakhsh.act_kaladefault", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (act_kaladefault) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (act_kaladefault) Resume **");
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
		return act_kaladefault.class;
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
            BA.LogInfo("** Activity (act_kaladefault) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (act_kaladefault) Pause event (activity is not paused). **");
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
            act_kaladefault mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (act_kaladefault) Resume **");
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
public static String _feetip = "";
public static anywheresoftware.b4a.agraham.threading.Threading _th = null;
public wir.hitex.recycler.Hitex_LayoutView _hlv = null;
public nicespinnerwrapper.niceSpinnerWrapper _nicespinner = null;
public nicespinnerwrapper.niceSpinnerWrapper _nicespinner1 = null;
public anywheresoftware.b4a.objects.IME _key = null;
public anywheresoftware.b4a.objects.collections.List _listkalatxt = null;
public anywheresoftware.b4a.objects.collections.List _listkalasp = null;
public anywheresoftware.b4a.objects.collections.List _orginallistkala = null;
public anywheresoftware.b4a.objects.collections.List _listgroohkala = null;
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
public anywheresoftware.b4a.objects.collections.List _listgoroohkala1 = null;
public anywheresoftware.b4a.objects.collections.List _originallistgoroohkala1 = null;
public anywheresoftware.b4a.objects.collections.List _listgoroohkala2 = null;
public anywheresoftware.b4a.objects.collections.List _originallistgoroohkala2 = null;
public static String _groupcodeselect1 = "";
public static String _groupnameselect1 = "";
public static String _groupcodeselect2 = "";
public static String _groupnameselect2 = "";
public anywheresoftware.b4a.objects.collections.List _lstselectedcodegroupkala = null;
public anywheresoftware.b4a.objects.collections.List _listtasvie = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bm = null;
public ir.parsikhesab.pakhsh.b4xcombobox _cmbbox1 = null;
public anywheresoftware.b4a.objects.MapFragmentWrapper _mapfragment1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlactivate = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtfee = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnsavefee = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltitle = null;
public static String _feetype = "";
public anywheresoftware.b4a.objects.PanelWrapper _pnlfee = null;
public ir.parsikhesab.pakhsh.mcode._adapterlistkala _itemselected = null;
public static boolean _txtchanged = false;
public anywheresoftware.b4a.objects.PanelWrapper _pnldarsadtakhfif = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtdarsadtakhfif = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _img_selectmoshtari = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblmojavezsefareshtext = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlspgroup = null;
public anywheresoftware.b4a.objects.collections.List _lstgroup1 = null;
public anywheresoftware.b4a.objects.collections.List _lstgroup2 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _img_rotatepic = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnmenugroup = null;
public anywheresoftware.b4a.objects.SlidingMenuWrapper _sidemenu = null;
public wir.hitex.recycler.Hitex_LayoutView _hlvgoroohkala = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlgroup = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblbackgroup = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltitile = null;
public static String _searchnumber = "";
public de.amberhome.objects.appcompat.ACSwitchCompatWrapper _swsearchnumber = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblgift = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblgiftcount = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblsumkhales = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblmandeetebar = null;
public anywheresoftware.b4a.objects.collections.List _lsteshantiongroup = null;
public anywheresoftware.b4a.objects.collections.List _lsteshantiongrouptable = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnleshantion = null;
public ir.parsikhesab.pakhsh.table _table1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnltableeshantion = null;
public wir.hitex.recycler.Hitex_Utils _utils = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblsumfactor = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblsumtakhfif = null;
public de.amberhome.objects.appcompat.ACSwitchCompatWrapper _swarzeshafzodeenable = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbldarsadarzeshafzode = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblarzeshafzode = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblsumkolbadaztakhfif = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel9 = null;
public anywheresoftware.b4a.objects.LabelWrapper _btnshowsumfilterpnl = null;
public anywheresoftware.b4a.objects.LabelWrapper _label8 = null;
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
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
anywheresoftware.b4a.objects.drawable.ColorDrawable _op = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _op1 = null;
RDebugUtils.currentLine=34406400;
 //BA.debugLineNum = 34406400;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=34406401;
 //BA.debugLineNum = 34406401;BA.debugLine="Activity.LoadLayout(\"L_KalaDefault_2\")";
mostCurrent._activity.LoadLayout("L_KalaDefault_2",mostCurrent.activityBA);
RDebugUtils.currentLine=34406402;
 //BA.debugLineNum = 34406402;BA.debugLine="Try";
try {RDebugUtils.currentLine=34406403;
 //BA.debugLineNum = 34406403;BA.debugLine="If FirstTime Then";
if (_firsttime) { 
RDebugUtils.currentLine=34406404;
 //BA.debugLineNum = 34406404;BA.debugLine="FeeTip=0";
_feetip = BA.NumberToString(0);
RDebugUtils.currentLine=34406405;
 //BA.debugLineNum = 34406405;BA.debugLine="MCode.feeTip=0";
mostCurrent._mcode._feetip /*String*/  = BA.NumberToString(0);
 };
RDebugUtils.currentLine=34406411;
 //BA.debugLineNum = 34406411;BA.debugLine="sidemenu.Initialize(\"sidmenu\")";
mostCurrent._sidemenu.Initialize(mostCurrent.activityBA,"sidmenu");
RDebugUtils.currentLine=34406412;
 //BA.debugLineNum = 34406412;BA.debugLine="sidemenu.Menu.LoadLayout(\"groupkalamenulyr\")";
mostCurrent._sidemenu.getMenu().LoadLayout("groupkalamenulyr",mostCurrent.activityBA);
RDebugUtils.currentLine=34406413;
 //BA.debugLineNum = 34406413;BA.debugLine="sidemenu.Mode=sidemenu.LEFT";
mostCurrent._sidemenu.setMode(mostCurrent._sidemenu.LEFT);
RDebugUtils.currentLine=34406414;
 //BA.debugLineNum = 34406414;BA.debugLine="sidemenu.BehindOffset=33%x";
mostCurrent._sidemenu.setBehindOffset(anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (33),mostCurrent.activityBA));
RDebugUtils.currentLine=34406415;
 //BA.debugLineNum = 34406415;BA.debugLine="HLVGoroohKala.Initializer(\"HLVGoroohKala\").ListV";
mostCurrent._hlvgoroohkala.Initializer(mostCurrent.activityBA,"HLVGoroohKala").ListView().Build();
RDebugUtils.currentLine=34406416;
 //BA.debugLineNum = 34406416;BA.debugLine="pnlGroup.AddView(HLVGoroohKala,1%x,1%y,65%x,87%y";
mostCurrent._pnlgroup.AddView((android.view.View)(mostCurrent._hlvgoroohkala.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (1),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (1),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (65),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (87),mostCurrent.activityBA));
RDebugUtils.currentLine=34406418;
 //BA.debugLineNum = 34406418;BA.debugLine="lstSelectedCodeGroupKala.Initialize";
mostCurrent._lstselectedcodegroupkala.Initialize();
RDebugUtils.currentLine=34406419;
 //BA.debugLineNum = 34406419;BA.debugLine="lstGroup1.Initialize";
mostCurrent._lstgroup1.Initialize();
RDebugUtils.currentLine=34406420;
 //BA.debugLineNum = 34406420;BA.debugLine="lstGroup2.Initialize";
mostCurrent._lstgroup2.Initialize();
RDebugUtils.currentLine=34406422;
 //BA.debugLineNum = 34406422;BA.debugLine="HLV.Initializer(\"HLV\").ListView.Build";
mostCurrent._hlv.Initializer(mostCurrent.activityBA,"HLV").ListView().Build();
RDebugUtils.currentLine=34406423;
 //BA.debugLineNum = 34406423;BA.debugLine="pnl_HLV.AddView(HLV,0,0,100%x,pnl_HLV.Height)";
mostCurrent._pnl_hlv.AddView((android.view.View)(mostCurrent._hlv.getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),mostCurrent._pnl_hlv.getHeight());
RDebugUtils.currentLine=34406424;
 //BA.debugLineNum = 34406424;BA.debugLine="Key.Initialize(\"Key\")";
mostCurrent._key.Initialize("Key");
RDebugUtils.currentLine=34406425;
 //BA.debugLineNum = 34406425;BA.debugLine="Key.SetCustomFilter(txtFee,txtFee.INPUT_TYPE_NUM";
mostCurrent._key.SetCustomFilter((android.widget.EditText)(mostCurrent._txtfee.getObject()),mostCurrent._txtfee.INPUT_TYPE_NUMBERS,"0123456789");
RDebugUtils.currentLine=34406426;
 //BA.debugLineNum = 34406426;BA.debugLine="Key.SetCustomFilter(txtDarsadTakhfif,txtDarsadTa";
mostCurrent._key.SetCustomFilter((android.widget.EditText)(mostCurrent._txtdarsadtakhfif.getObject()),mostCurrent._txtdarsadtakhfif.INPUT_TYPE_NUMBERS,"0123456789");
RDebugUtils.currentLine=34406427;
 //BA.debugLineNum = 34406427;BA.debugLine="If MCode.Action=\"SabtFaktor\" Then";
if ((mostCurrent._mcode._action /*String*/ ).equals("SabtFaktor")) { 
RDebugUtils.currentLine=34406428;
 //BA.debugLineNum = 34406428;BA.debugLine="MCode.page = \"KalaDefault\"";
mostCurrent._mcode._page /*String*/  = "KalaDefault";
RDebugUtils.currentLine=34406429;
 //BA.debugLineNum = 34406429;BA.debugLine="lblTitile.Text=\"انتخاب کالا\"";
mostCurrent._lbltitile.setText(BA.ObjectToCharSequence("انتخاب کالا"));
 };
RDebugUtils.currentLine=34406431;
 //BA.debugLineNum = 34406431;BA.debugLine="If MCode.Action=\"SabtMarjooii\" Then";
if ((mostCurrent._mcode._action /*String*/ ).equals("SabtMarjooii")) { 
RDebugUtils.currentLine=34406432;
 //BA.debugLineNum = 34406432;BA.debugLine="MCode.page = \"SabtMarjooii\"";
mostCurrent._mcode._page /*String*/  = "SabtMarjooii";
RDebugUtils.currentLine=34406433;
 //BA.debugLineNum = 34406433;BA.debugLine="lblTitile.Text=\"ثبت مرجوعی\"";
mostCurrent._lbltitile.setText(BA.ObjectToCharSequence("ثبت مرجوعی"));
 };
RDebugUtils.currentLine=34406436;
 //BA.debugLineNum = 34406436;BA.debugLine="If MCode.ArzeshAfzodeEnable=1 Then";
if ((mostCurrent._mcode._arzeshafzodeenable /*String*/ ).equals(BA.NumberToString(1))) { 
RDebugUtils.currentLine=34406437;
 //BA.debugLineNum = 34406437;BA.debugLine="SwArzeshAfzodeEnable.Checked=True";
mostCurrent._swarzeshafzodeenable.setChecked(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=34406438;
 //BA.debugLineNum = 34406438;BA.debugLine="lblDarsadArzeshAfzode.Text=$\" ارزش افزوده: ${MC";
mostCurrent._lbldarsadarzeshafzode.setText(BA.ObjectToCharSequence((" ارزش افزوده: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._mcode._arzeshafzode /*String*/ ))+" %")));
RDebugUtils.currentLine=34406439;
 //BA.debugLineNum = 34406439;BA.debugLine="lblArzeshAfzode.Text=\"مبلغ ارزش افزوده: 0\"";
mostCurrent._lblarzeshafzode.setText(BA.ObjectToCharSequence("مبلغ ارزش افزوده: 0"));
 }else {
RDebugUtils.currentLine=34406441;
 //BA.debugLineNum = 34406441;BA.debugLine="SwArzeshAfzodeEnable.Checked=False";
mostCurrent._swarzeshafzodeenable.setChecked(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=34406442;
 //BA.debugLineNum = 34406442;BA.debugLine="lblDarsadArzeshAfzode.Text=\"ارزش افزوده: 0 %\"";
mostCurrent._lbldarsadarzeshafzode.setText(BA.ObjectToCharSequence("ارزش افزوده: 0 %"));
RDebugUtils.currentLine=34406443;
 //BA.debugLineNum = 34406443;BA.debugLine="lblArzeshAfzode.Text=\"مبلغ ارزش افزوده: 0\"";
mostCurrent._lblarzeshafzode.setText(BA.ObjectToCharSequence("مبلغ ارزش افزوده: 0"));
 };
RDebugUtils.currentLine=34406447;
 //BA.debugLineNum = 34406447;BA.debugLine="Dialog.Initialize (Activity)";
mostCurrent._dialog._initialize /*String*/ (null,mostCurrent.activityBA,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(mostCurrent._activity.getObject())));
RDebugUtils.currentLine=34406448;
 //BA.debugLineNum = 34406448;BA.debugLine="ListGoroohKala1.Initialize";
mostCurrent._listgoroohkala1.Initialize();
RDebugUtils.currentLine=34406449;
 //BA.debugLineNum = 34406449;BA.debugLine="OriginalListGoroohKala1.Initialize";
mostCurrent._originallistgoroohkala1.Initialize();
RDebugUtils.currentLine=34406451;
 //BA.debugLineNum = 34406451;BA.debugLine="ListGoroohKala2.Initialize";
mostCurrent._listgoroohkala2.Initialize();
RDebugUtils.currentLine=34406452;
 //BA.debugLineNum = 34406452;BA.debugLine="OriginalListGoroohKala2.Initialize";
mostCurrent._originallistgoroohkala2.Initialize();
RDebugUtils.currentLine=34406454;
 //BA.debugLineNum = 34406454;BA.debugLine="ListGroohKala.Initialize";
mostCurrent._listgroohkala.Initialize();
RDebugUtils.currentLine=34406455;
 //BA.debugLineNum = 34406455;BA.debugLine="lstEshantionGroup.Initialize";
mostCurrent._lsteshantiongroup.Initialize();
RDebugUtils.currentLine=34406456;
 //BA.debugLineNum = 34406456;BA.debugLine="lstEshantionGroupTable.Initialize";
mostCurrent._lsteshantiongrouptable.Initialize();
RDebugUtils.currentLine=34406457;
 //BA.debugLineNum = 34406457;BA.debugLine="NiceSpinner.Initialize(\"NiceSpinner\")";
mostCurrent._nicespinner.Initialize(processBA,"NiceSpinner");
RDebugUtils.currentLine=34406458;
 //BA.debugLineNum = 34406458;BA.debugLine="NiceSpinner.TextColor = Colors.Black";
mostCurrent._nicespinner.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=34406459;
 //BA.debugLineNum = 34406459;BA.debugLine="NiceSpinner.Gravity = Gravity.CENTER_HORIZONTAL";
mostCurrent._nicespinner.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL);
RDebugUtils.currentLine=34406460;
 //BA.debugLineNum = 34406460;BA.debugLine="NiceSpinner.Typeface = Typeface.LoadFromAssets(\"";
mostCurrent._nicespinner.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("IRANSansMobile_Medium.ttf"));
RDebugUtils.currentLine=34406461;
 //BA.debugLineNum = 34406461;BA.debugLine="PnlSpGroup.AddView(NiceSpinner,B4XComboBox1.mBas";
mostCurrent._pnlspgroup.AddView((android.view.View)(mostCurrent._nicespinner.getObject()),mostCurrent._b4xcombobox1._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft(),mostCurrent._b4xcombobox1._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop(),mostCurrent._b4xcombobox1._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),mostCurrent._b4xcombobox1._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=34406462;
 //BA.debugLineNum = 34406462;BA.debugLine="B4XComboBox1.cmbBox.DropdownTextColor=Colors.Bla";
mostCurrent._b4xcombobox1._cmbbox /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setDropdownTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=34406463;
 //BA.debugLineNum = 34406463;BA.debugLine="Dim op As ColorDrawable";
_op = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=34406464;
 //BA.debugLineNum = 34406464;BA.debugLine="op.Initialize2(Colors.White,8dip,2dip,Colors.Bla";
_op.Initialize2(anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (8)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2)),anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=34406465;
 //BA.debugLineNum = 34406465;BA.debugLine="NiceSpinner.Background=op";
mostCurrent._nicespinner.setBackground((android.graphics.drawable.Drawable)(_op.getObject()));
RDebugUtils.currentLine=34406467;
 //BA.debugLineNum = 34406467;BA.debugLine="NiceSpinner1.Initialize(\"NiceSpinner1\")";
mostCurrent._nicespinner1.Initialize(processBA,"NiceSpinner1");
RDebugUtils.currentLine=34406468;
 //BA.debugLineNum = 34406468;BA.debugLine="NiceSpinner1.TextColor = Colors.Black";
mostCurrent._nicespinner1.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=34406469;
 //BA.debugLineNum = 34406469;BA.debugLine="NiceSpinner1.Gravity = Gravity.CENTER_HORIZONTAL";
mostCurrent._nicespinner1.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL);
RDebugUtils.currentLine=34406470;
 //BA.debugLineNum = 34406470;BA.debugLine="NiceSpinner1.Typeface = Typeface.LoadFromAssets(";
mostCurrent._nicespinner1.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("IRANSansMobile_Medium.ttf"));
RDebugUtils.currentLine=34406471;
 //BA.debugLineNum = 34406471;BA.debugLine="PnlSpGroup.AddView(NiceSpinner1,B4XComboBox2.mBa";
mostCurrent._pnlspgroup.AddView((android.view.View)(mostCurrent._nicespinner1.getObject()),mostCurrent._b4xcombobox2._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft(),mostCurrent._b4xcombobox2._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop(),mostCurrent._b4xcombobox2._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),mostCurrent._b4xcombobox2._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=34406473;
 //BA.debugLineNum = 34406473;BA.debugLine="Dim op1 As ColorDrawable";
_op1 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=34406474;
 //BA.debugLineNum = 34406474;BA.debugLine="op1.Initialize2(Colors.White,8dip,2dip,Colors.Bl";
_op1.Initialize2(anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (8)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2)),anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=34406475;
 //BA.debugLineNum = 34406475;BA.debugLine="NiceSpinner1.Background=op1";
mostCurrent._nicespinner1.setBackground((android.graphics.drawable.Drawable)(_op1.getObject()));
RDebugUtils.currentLine=34406476;
 //BA.debugLineNum = 34406476;BA.debugLine="lstGroup2.Add(\"همه گروه ها\")";
mostCurrent._lstgroup2.Add((Object)("همه گروه ها"));
RDebugUtils.currentLine=34406477;
 //BA.debugLineNum = 34406477;BA.debugLine="NiceSpinner1.attachDataSource(lstGroup2)";
mostCurrent._nicespinner1.attachDataSource((java.util.List)(mostCurrent._lstgroup2.getObject()));
RDebugUtils.currentLine=34406481;
 //BA.debugLineNum = 34406481;BA.debugLine="OrginalListKala.Initialize";
mostCurrent._orginallistkala.Initialize();
RDebugUtils.currentLine=34406482;
 //BA.debugLineNum = 34406482;BA.debugLine="ListKalaSp.Initialize";
mostCurrent._listkalasp.Initialize();
RDebugUtils.currentLine=34406483;
 //BA.debugLineNum = 34406483;BA.debugLine="ListKalaTxt.Initialize";
mostCurrent._listkalatxt.Initialize();
RDebugUtils.currentLine=34406485;
 //BA.debugLineNum = 34406485;BA.debugLine="LoadAcSpGroohKala";
_loadacspgroohkala();
RDebugUtils.currentLine=34406486;
 //BA.debugLineNum = 34406486;BA.debugLine="LoadListGoroohKala";
_loadlistgoroohkala();
RDebugUtils.currentLine=34406487;
 //BA.debugLineNum = 34406487;BA.debugLine="th.Initialise(\"th\")";
_th.Initialise(processBA,"th");
RDebugUtils.currentLine=34406488;
 //BA.debugLineNum = 34406488;BA.debugLine="HLVGoroohKala.CardView.BackgroundColor(0x8aacc8)";
mostCurrent._hlvgoroohkala.CardView().BackgroundColor(((int)0x8aacc8));
RDebugUtils.currentLine=34406489;
 //BA.debugLineNum = 34406489;BA.debugLine="HLVGoroohKala.Ripple.Color(0x8aacc8)";
mostCurrent._hlvgoroohkala.Ripple().Color(((int)0x8aacc8));
RDebugUtils.currentLine=34406490;
 //BA.debugLineNum = 34406490;BA.debugLine="HLVGoroohKala.CardView.CardElevation(0dip).Radiu";
mostCurrent._hlvgoroohkala.CardView().CardElevation((float) (anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)))).Radius((float) (anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (4))));
RDebugUtils.currentLine=34406493;
 //BA.debugLineNum = 34406493;BA.debugLine="HLVGoroohKala.Show";
mostCurrent._hlvgoroohkala.Show();
RDebugUtils.currentLine=34406497;
 //BA.debugLineNum = 34406497;BA.debugLine="HLV.Show";
mostCurrent._hlv.Show();
RDebugUtils.currentLine=34406510;
 //BA.debugLineNum = 34406510;BA.debugLine="ListTasvie.Initialize";
mostCurrent._listtasvie.Initialize();
RDebugUtils.currentLine=34406511;
 //BA.debugLineNum = 34406511;BA.debugLine="BtnShowSumFilterPnl_Click";
_btnshowsumfilterpnl_click();
RDebugUtils.currentLine=34406513;
 //BA.debugLineNum = 34406513;BA.debugLine="If MCode.EshantionGroup=1 Then";
if ((mostCurrent._mcode._eshantiongroup /*String*/ ).equals(BA.NumberToString(1))) { 
RDebugUtils.currentLine=34406514;
 //BA.debugLineNum = 34406514;BA.debugLine="MCode.SaveUpdate(\"Delete from tblEshantionGroup";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Delete from tblEshantionGroupTemp");
 };
RDebugUtils.currentLine=34406518;
 //BA.debugLineNum = 34406518;BA.debugLine="Log(MCode.page)";
anywheresoftware.b4a.keywords.Common.LogImpl("534406518",mostCurrent._mcode._page /*String*/ ,0);
RDebugUtils.currentLine=34406519;
 //BA.debugLineNum = 34406519;BA.debugLine="LoadKala";
_loadkala();
 } 
       catch (Exception e84) {
			processBA.setLastException(e84);RDebugUtils.currentLine=34406521;
 //BA.debugLineNum = 34406521;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("534406521",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=34406522;
 //BA.debugLineNum = 34406522;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-Activity_Create");
 };
RDebugUtils.currentLine=34406525;
 //BA.debugLineNum = 34406525;BA.debugLine="End Sub";
return "";
}
public static String  _loadacspgroohkala() throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "loadacspgroohkala", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "loadacspgroohkala", null));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _dt1 = null;
int _i = 0;
long _sizecode = 0L;
ir.parsikhesab.pakhsh.mcode._adaptergoroohkala _item = null;
String _code = "";
long _count = 0L;
String _mincode = "";
ir.parsikhesab.pakhsh.mcode._adaptergoroohkala _a = null;
String _namegroup = "";
String _codegroup = "";
RDebugUtils.currentLine=34930688;
 //BA.debugLineNum = 34930688;BA.debugLine="Sub LoadAcSpGroohKala";
RDebugUtils.currentLine=34930689;
 //BA.debugLineNum = 34930689;BA.debugLine="Try";
try {RDebugUtils.currentLine=34930690;
 //BA.debugLineNum = 34930690;BA.debugLine="lstGroup1.Add(\"همه گروه ها\")";
mostCurrent._lstgroup1.Add((Object)("همه گروه ها"));
RDebugUtils.currentLine=34930691;
 //BA.debugLineNum = 34930691;BA.debugLine="Dim Dt1 As Cursor = MCode.Result(\"Select FldC_Go";
_dt1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_dt1 = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select FldC_Gorooh,FldN_Gorooh From TblGoroohKala");
RDebugUtils.currentLine=34930692;
 //BA.debugLineNum = 34930692;BA.debugLine="For i=0 To Dt1.RowCount-1";
{
final int step4 = 1;
final int limit4 = (int) (_dt1.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=34930693;
 //BA.debugLineNum = 34930693;BA.debugLine="Dt1.Position=i";
_dt1.setPosition(_i);
RDebugUtils.currentLine=34930695;
 //BA.debugLineNum = 34930695;BA.debugLine="Dim sizeCode As Long=Dt1.GetString(\"FldC_Gorooh";
_sizecode = (long) (_dt1.GetString("FldC_Gorooh").length());
RDebugUtils.currentLine=34930696;
 //BA.debugLineNum = 34930696;BA.debugLine="If sizeCode=3 Then";
if (_sizecode==3) { 
RDebugUtils.currentLine=34930697;
 //BA.debugLineNum = 34930697;BA.debugLine="Dim Item As AdapterGoroohKala";
_item = new ir.parsikhesab.pakhsh.mcode._adaptergoroohkala();
RDebugUtils.currentLine=34930698;
 //BA.debugLineNum = 34930698;BA.debugLine="Item.FldC_Gorooh= Dt1.GetString(\"FldC_Gorooh\")";
_item.FldC_Gorooh /*String*/  = _dt1.GetString("FldC_Gorooh");
RDebugUtils.currentLine=34930699;
 //BA.debugLineNum = 34930699;BA.debugLine="Item.FldN_Gorooh= Dt1.GetString(\"FldN_Gorooh\")";
_item.FldN_Gorooh /*String*/  = _dt1.GetString("FldN_Gorooh");
RDebugUtils.currentLine=34930700;
 //BA.debugLineNum = 34930700;BA.debugLine="OriginalListGoroohKala1.Add(Item)";
mostCurrent._originallistgoroohkala1.Add((Object)(_item));
RDebugUtils.currentLine=34930701;
 //BA.debugLineNum = 34930701;BA.debugLine="lstGroup1.Add(Item.FldN_Gorooh)";
mostCurrent._lstgroup1.Add((Object)(_item.FldN_Gorooh /*String*/ ));
 }else {
RDebugUtils.currentLine=34930703;
 //BA.debugLineNum = 34930703;BA.debugLine="Dim code As String=Dt1.GetString(\"FldC_Gorooh\"";
_code = _dt1.GetString("FldC_Gorooh").substring((int) (0),(int) (3));
RDebugUtils.currentLine=34930704;
 //BA.debugLineNum = 34930704;BA.debugLine="Dim count As Long";
_count = 0L;
RDebugUtils.currentLine=34930705;
 //BA.debugLineNum = 34930705;BA.debugLine="Dim MinCode As String =MCode.SingleResult(\"Sel";
_mincode = BA.ObjectToString(mostCurrent._mcode._singleresult /*Object*/ (mostCurrent.activityBA,"Select min(FldC_Gorooh) From TblGoroohKala where FldC_Gorooh Like '"+_code+"%'"));
RDebugUtils.currentLine=34930706;
 //BA.debugLineNum = 34930706;BA.debugLine="For Each a As AdapterGoroohKala In OriginalLis";
{
final anywheresoftware.b4a.BA.IterableList group17 = mostCurrent._originallistgoroohkala1;
final int groupLen17 = group17.getSize()
;int index17 = 0;
;
for (; index17 < groupLen17;index17++){
_a = (ir.parsikhesab.pakhsh.mcode._adaptergoroohkala)(group17.Get(index17));
RDebugUtils.currentLine=34930707;
 //BA.debugLineNum = 34930707;BA.debugLine="If a.FldC_Gorooh.SubString2(0,3)=code Then";
if ((_a.FldC_Gorooh /*String*/ .substring((int) (0),(int) (3))).equals(_code)) { 
RDebugUtils.currentLine=34930708;
 //BA.debugLineNum = 34930708;BA.debugLine="count=1";
_count = (long) (1);
RDebugUtils.currentLine=34930709;
 //BA.debugLineNum = 34930709;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=34930712;
 //BA.debugLineNum = 34930712;BA.debugLine="If count =0 Then";
if (_count==0) { 
RDebugUtils.currentLine=34930713;
 //BA.debugLineNum = 34930713;BA.debugLine="Dim NameGroup,CodeGroup As String";
_namegroup = "";
_codegroup = "";
RDebugUtils.currentLine=34930714;
 //BA.debugLineNum = 34930714;BA.debugLine="CodeGroup=MinCode";
_codegroup = _mincode;
RDebugUtils.currentLine=34930715;
 //BA.debugLineNum = 34930715;BA.debugLine="NameGroup=MCode.SingleResult(\"Select FldN_Gor";
_namegroup = BA.ObjectToString(mostCurrent._mcode._singleresult /*Object*/ (mostCurrent.activityBA,"Select FldN_Gorooh From TblGoroohKala where FldC_Gorooh='"+_mincode+"'"));
RDebugUtils.currentLine=34930716;
 //BA.debugLineNum = 34930716;BA.debugLine="Dim Item As AdapterGoroohKala";
_item = new ir.parsikhesab.pakhsh.mcode._adaptergoroohkala();
RDebugUtils.currentLine=34930717;
 //BA.debugLineNum = 34930717;BA.debugLine="Item.FldC_Gorooh= CodeGroup";
_item.FldC_Gorooh /*String*/  = _codegroup;
RDebugUtils.currentLine=34930718;
 //BA.debugLineNum = 34930718;BA.debugLine="Item.FldN_Gorooh= NameGroup";
_item.FldN_Gorooh /*String*/  = _namegroup;
RDebugUtils.currentLine=34930719;
 //BA.debugLineNum = 34930719;BA.debugLine="OriginalListGoroohKala1.Add(Item)";
mostCurrent._originallistgoroohkala1.Add((Object)(_item));
RDebugUtils.currentLine=34930720;
 //BA.debugLineNum = 34930720;BA.debugLine="lstGroup1.Add(Item.FldN_Gorooh)";
mostCurrent._lstgroup1.Add((Object)(_item.FldN_Gorooh /*String*/ ));
 };
 };
 }
};
RDebugUtils.currentLine=34930726;
 //BA.debugLineNum = 34930726;BA.debugLine="NiceSpinner.attachDataSource(lstGroup1)";
mostCurrent._nicespinner.attachDataSource((java.util.List)(mostCurrent._lstgroup1.getObject()));
RDebugUtils.currentLine=34930727;
 //BA.debugLineNum = 34930727;BA.debugLine="NiceSpinner.SelectedTextColor = Colors.blue";
mostCurrent._nicespinner.setSelectedTextColor(anywheresoftware.b4a.keywords.Common.Colors.Blue);
 } 
       catch (Exception e38) {
			processBA.setLastException(e38);RDebugUtils.currentLine=34930730;
 //BA.debugLineNum = 34930730;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("534930730",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=34930731;
 //BA.debugLineNum = 34930731;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-LoadAcSpGroohKala");
 };
RDebugUtils.currentLine=34930733;
 //BA.debugLineNum = 34930733;BA.debugLine="End Sub";
return "";
}
public static String  _loadlistgoroohkala() throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "loadlistgoroohkala", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "loadlistgoroohkala", null));}
ir.parsikhesab.pakhsh.mcode._adaptergoroohkala _item1 = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _dt = null;
int _i = 0;
ir.parsikhesab.pakhsh.mcode._adaptergoroohkala _item = null;
RDebugUtils.currentLine=34865152;
 //BA.debugLineNum = 34865152;BA.debugLine="Sub LoadListGoroohKala";
RDebugUtils.currentLine=34865154;
 //BA.debugLineNum = 34865154;BA.debugLine="Dim Item1 As AdapterGoroohKala";
_item1 = new ir.parsikhesab.pakhsh.mcode._adaptergoroohkala();
RDebugUtils.currentLine=34865155;
 //BA.debugLineNum = 34865155;BA.debugLine="Item1.FldC_Gorooh= 0";
_item1.FldC_Gorooh /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=34865156;
 //BA.debugLineNum = 34865156;BA.debugLine="Item1.FldN_Gorooh= \"همه گروه ها\"";
_item1.FldN_Gorooh /*String*/  = "همه گروه ها";
RDebugUtils.currentLine=34865157;
 //BA.debugLineNum = 34865157;BA.debugLine="OriginalListGoroohKala2.Add(Item1)";
mostCurrent._originallistgoroohkala2.Add((Object)(_item1));
RDebugUtils.currentLine=34865158;
 //BA.debugLineNum = 34865158;BA.debugLine="Dim Dt As Cursor = MCode.Result(\"Select FldC_Goro";
_dt = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_dt = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select FldC_Gorooh,FldN_Gorooh From TblGoroohKala where Length(FldC_Gorooh) = 3 ORDER BY FldC_Gorooh");
RDebugUtils.currentLine=34865159;
 //BA.debugLineNum = 34865159;BA.debugLine="For i=0 To Dt.RowCount-1";
{
final int step6 = 1;
final int limit6 = (int) (_dt.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=34865160;
 //BA.debugLineNum = 34865160;BA.debugLine="Dt.Position=i";
_dt.setPosition(_i);
RDebugUtils.currentLine=34865161;
 //BA.debugLineNum = 34865161;BA.debugLine="Dim Item As AdapterGoroohKala";
_item = new ir.parsikhesab.pakhsh.mcode._adaptergoroohkala();
RDebugUtils.currentLine=34865162;
 //BA.debugLineNum = 34865162;BA.debugLine="Item.FldC_Gorooh= Dt.GetString(\"FldC_Gorooh\")";
_item.FldC_Gorooh /*String*/  = _dt.GetString("FldC_Gorooh");
RDebugUtils.currentLine=34865163;
 //BA.debugLineNum = 34865163;BA.debugLine="Item.FldN_Gorooh= Dt.GetString(\"FldN_Gorooh\")";
_item.FldN_Gorooh /*String*/  = _dt.GetString("FldN_Gorooh");
RDebugUtils.currentLine=34865164;
 //BA.debugLineNum = 34865164;BA.debugLine="OriginalListGoroohKala2.Add(Item)";
mostCurrent._originallistgoroohkala2.Add((Object)(_item));
 }
};
RDebugUtils.currentLine=34865168;
 //BA.debugLineNum = 34865168;BA.debugLine="ListGoroohKala2 = OriginalListGoroohKala2";
mostCurrent._listgoroohkala2 = mostCurrent._originallistgoroohkala2;
RDebugUtils.currentLine=34865170;
 //BA.debugLineNum = 34865170;BA.debugLine="End Sub";
return "";
}
public static void  _btnshowsumfilterpnl_click() throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnshowsumfilterpnl_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "btnshowsumfilterpnl_click", null); return;}
ResumableSub_BtnShowSumFilterPnl_Click rsub = new ResumableSub_BtnShowSumFilterPnl_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_BtnShowSumFilterPnl_Click extends BA.ResumableSub {
public ResumableSub_BtnShowSumFilterPnl_Click(ir.parsikhesab.pakhsh.act_kaladefault parent) {
this.parent = parent;
}
ir.parsikhesab.pakhsh.act_kaladefault parent;
int _t1 = 0;
int _h1 = 0;
int _t2 = 0;
int _h2 = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_kaladefault";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=36831233;
 //BA.debugLineNum = 36831233;BA.debugLine="Sleep(200)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_kaladefault", "btnshowsumfilterpnl_click"),(int) (200));
this.state = 7;
return;
case 7:
//C
this.state = 1;
;
RDebugUtils.currentLine=36831235;
 //BA.debugLineNum = 36831235;BA.debugLine="Log(\"top1: \"& Panel9.Top)";
anywheresoftware.b4a.keywords.Common.LogImpl("536831235","top1: "+BA.NumberToString(parent.mostCurrent._panel9.getTop()),0);
RDebugUtils.currentLine=36831236;
 //BA.debugLineNum = 36831236;BA.debugLine="Log(\"Height1: \"& Panel9.Height)";
anywheresoftware.b4a.keywords.Common.LogImpl("536831236","Height1: "+BA.NumberToString(parent.mostCurrent._panel9.getHeight()),0);
RDebugUtils.currentLine=36831239;
 //BA.debugLineNum = 36831239;BA.debugLine="Dim t1,h1 As Int";
_t1 = 0;
_h1 = 0;
RDebugUtils.currentLine=36831240;
 //BA.debugLineNum = 36831240;BA.debugLine="Dim t2,h2 As Int";
_t2 = 0;
_h2 = 0;
RDebugUtils.currentLine=36831243;
 //BA.debugLineNum = 36831243;BA.debugLine="If Panel9.Top=75%y Then";
if (true) break;

case 1:
//if
this.state = 6;
if (parent.mostCurrent._panel9.getTop()==anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (75),mostCurrent.activityBA)) { 
this.state = 3;
}else 
{RDebugUtils.currentLine=36831254;
 //BA.debugLineNum = 36831254;BA.debugLine="Else If Panel9.Top=88%y Then";
if (parent.mostCurrent._panel9.getTop()==anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (88),mostCurrent.activityBA)) { 
this.state = 5;
}}
if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=36831246;
 //BA.debugLineNum = 36831246;BA.debugLine="t1=75%y '2";
_t1 = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (75),mostCurrent.activityBA);
RDebugUtils.currentLine=36831247;
 //BA.debugLineNum = 36831247;BA.debugLine="h1=19%y '2";
_h1 = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (19),mostCurrent.activityBA);
RDebugUtils.currentLine=36831249;
 //BA.debugLineNum = 36831249;BA.debugLine="t2=88%y '1";
_t2 = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (88),mostCurrent.activityBA);
RDebugUtils.currentLine=36831250;
 //BA.debugLineNum = 36831250;BA.debugLine="h2=6%y '1";
_h2 = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (6),mostCurrent.activityBA);
RDebugUtils.currentLine=36831252;
 //BA.debugLineNum = 36831252;BA.debugLine="BtnShowSumFilterPnl.Text=Chr(0xF139)";
parent.mostCurrent._btnshowsumfilterpnl.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr(((int)0xf139))));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=36831256;
 //BA.debugLineNum = 36831256;BA.debugLine="t1=88%y '1";
_t1 = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (88),mostCurrent.activityBA);
RDebugUtils.currentLine=36831257;
 //BA.debugLineNum = 36831257;BA.debugLine="h1=6%y '1";
_h1 = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (6),mostCurrent.activityBA);
RDebugUtils.currentLine=36831259;
 //BA.debugLineNum = 36831259;BA.debugLine="t2=75%y '2";
_t2 = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (75),mostCurrent.activityBA);
RDebugUtils.currentLine=36831260;
 //BA.debugLineNum = 36831260;BA.debugLine="h2=19%y '2";
_h2 = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (19),mostCurrent.activityBA);
RDebugUtils.currentLine=36831262;
 //BA.debugLineNum = 36831262;BA.debugLine="BtnShowSumFilterPnl.Text=Chr(0xF13A)";
parent.mostCurrent._btnshowsumfilterpnl.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr(((int)0xf13a))));
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=36831265;
 //BA.debugLineNum = 36831265;BA.debugLine="Panel9.SetLayoutAnimated(500,Panel9.Left,t1,Panel";
parent.mostCurrent._panel9.SetLayoutAnimated((int) (500),parent.mostCurrent._panel9.getLeft(),_t1,parent.mostCurrent._panel9.getWidth(),_h1);
RDebugUtils.currentLine=36831266;
 //BA.debugLineNum = 36831266;BA.debugLine="Panel9.SetLayoutAnimated(500,Panel9.Left,t2,Panel";
parent.mostCurrent._panel9.SetLayoutAnimated((int) (500),parent.mostCurrent._panel9.getLeft(),_t2,parent.mostCurrent._panel9.getWidth(),_h2);
RDebugUtils.currentLine=36831267;
 //BA.debugLineNum = 36831267;BA.debugLine="pnl_HLV.SetLayoutAnimated(500,pnl_HLV.Left,pnl_HL";
parent.mostCurrent._pnl_hlv.SetLayoutAnimated((int) (500),parent.mostCurrent._pnl_hlv.getLeft(),parent.mostCurrent._pnl_hlv.getTop(),parent.mostCurrent._pnl_hlv.getWidth(),(int) (parent.mostCurrent._panel9.getTop()-anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (25),mostCurrent.activityBA)));
RDebugUtils.currentLine=36831268;
 //BA.debugLineNum = 36831268;BA.debugLine="HLV.SetLayoutAnimated(500,HLV.Left,HLV.Top,HLV.Wi";
parent.mostCurrent._hlv.SetLayoutAnimated((int) (500),parent.mostCurrent._hlv.getLeft(),parent.mostCurrent._hlv.getTop(),parent.mostCurrent._hlv.getWidth(),(int) (parent.mostCurrent._panel9.getTop()-anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (25),mostCurrent.activityBA)));
RDebugUtils.currentLine=36831269;
 //BA.debugLineNum = 36831269;BA.debugLine="Log(\"top2: \"& Panel9.Top)";
anywheresoftware.b4a.keywords.Common.LogImpl("536831269","top2: "+BA.NumberToString(parent.mostCurrent._panel9.getTop()),0);
RDebugUtils.currentLine=36831270;
 //BA.debugLineNum = 36831270;BA.debugLine="Log(\"Height2: \"& Panel9.Height)";
anywheresoftware.b4a.keywords.Common.LogImpl("536831270","Height2: "+BA.NumberToString(parent.mostCurrent._panel9.getHeight()),0);
RDebugUtils.currentLine=36831274;
 //BA.debugLineNum = 36831274;BA.debugLine="Sleep(200)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_kaladefault", "btnshowsumfilterpnl_click"),(int) (200));
this.state = 8;
return;
case 8:
//C
this.state = -1;
;
RDebugUtils.currentLine=36831275;
 //BA.debugLineNum = 36831275;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _loadkala() throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "loadkala", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "loadkala", null));}
String _str = "";
int _countfilter = 0;
boolean _filter = false;
RDebugUtils.currentLine=34668544;
 //BA.debugLineNum = 34668544;BA.debugLine="Sub LoadKala";
RDebugUtils.currentLine=34668545;
 //BA.debugLineNum = 34668545;BA.debugLine="Try";
try {RDebugUtils.currentLine=34668547;
 //BA.debugLineNum = 34668547;BA.debugLine="Dim str As String=\"\"";
_str = "";
RDebugUtils.currentLine=34668548;
 //BA.debugLineNum = 34668548;BA.debugLine="Dim countfilter As Int=0";
_countfilter = (int) (0);
RDebugUtils.currentLine=34668549;
 //BA.debugLineNum = 34668549;BA.debugLine="Dim filter As Boolean=False";
_filter = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=34668551;
 //BA.debugLineNum = 34668551;BA.debugLine="ListTasvie.Clear";
mostCurrent._listtasvie.Clear();
RDebugUtils.currentLine=34668552;
 //BA.debugLineNum = 34668552;BA.debugLine="ListTasvie=LoadAcSpNoeTasvie";
mostCurrent._listtasvie = _loadacspnoetasvie();
RDebugUtils.currentLine=34668553;
 //BA.debugLineNum = 34668553;BA.debugLine="LoadNoeTasvie";
_loadnoetasvie();
RDebugUtils.currentLine=34668555;
 //BA.debugLineNum = 34668555;BA.debugLine="Log(GroupCodeSelect1)";
anywheresoftware.b4a.keywords.Common.LogImpl("534668555",mostCurrent._groupcodeselect1,0);
RDebugUtils.currentLine=34668556;
 //BA.debugLineNum = 34668556;BA.debugLine="Log(GroupCodeSelect2)";
anywheresoftware.b4a.keywords.Common.LogImpl("534668556",mostCurrent._groupcodeselect2,0);
RDebugUtils.currentLine=34668557;
 //BA.debugLineNum = 34668557;BA.debugLine="If GroupCodeSelect1=0 And GroupCodeSelect2=0 Then";
if ((mostCurrent._groupcodeselect1).equals(BA.NumberToString(0)) && (mostCurrent._groupcodeselect2).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=34668558;
 //BA.debugLineNum = 34668558;BA.debugLine="If SwGift.Checked=True Then";
if (mostCurrent._swgift.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=34668559;
 //BA.debugLineNum = 34668559;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=34668562;
 //BA.debugLineNum = 34668562;BA.debugLine="If MCode.EshantionGroup=1 Then";
if ((mostCurrent._mcode._eshantiongroup /*String*/ ).equals(BA.NumberToString(1))) { 
RDebugUtils.currentLine=34668563;
 //BA.debugLineNum = 34668563;BA.debugLine="str= str & \" and TblKala.fldCodeGroup IN(SELE";
_str = _str+" and TblKala.fldCodeGroup IN(SELECT tblEshantionGroup.fldCodeGroupKala FROM tblEshantionGroup)";
 }else {
RDebugUtils.currentLine=34668565;
 //BA.debugLineNum = 34668565;BA.debugLine="str= str & \" and TblKala.fldCodeKala IN(SELEC";
_str = _str+" and TblKala.fldCodeKala IN(SELECT tblEshantionTabaghati.fldCodeKalaForoosh FROM tblEshantionTabaghati)";
 };
RDebugUtils.currentLine=34668568;
 //BA.debugLineNum = 34668568;BA.debugLine="filter=True";
_filter = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=34668569;
 //BA.debugLineNum = 34668569;BA.debugLine="If countfilter=1 Then";
if (_countfilter==1) { 
RDebugUtils.currentLine=34668570;
 //BA.debugLineNum = 34668570;BA.debugLine="str=str.Replace(\" and \",\"\")";
_str = _str.replace(" and ","");
 };
 };
RDebugUtils.currentLine=34668573;
 //BA.debugLineNum = 34668573;BA.debugLine="If SwTakhfif.Checked=True Then";
if (mostCurrent._swtakhfif.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=34668574;
 //BA.debugLineNum = 34668574;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=34668575;
 //BA.debugLineNum = 34668575;BA.debugLine="str= str & \" and fldFeeBadAzTakhfif <> '0.0000'";
_str = _str+" and fldFeeBadAzTakhfif <> '0.0000'";
RDebugUtils.currentLine=34668576;
 //BA.debugLineNum = 34668576;BA.debugLine="filter=True";
_filter = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=34668577;
 //BA.debugLineNum = 34668577;BA.debugLine="If countfilter=1 Then";
if (_countfilter==1) { 
RDebugUtils.currentLine=34668578;
 //BA.debugLineNum = 34668578;BA.debugLine="str=str.Replace(\" and \",\"\")";
_str = _str.replace(" and ","");
 };
 };
RDebugUtils.currentLine=34668581;
 //BA.debugLineNum = 34668581;BA.debugLine="If MCode.NamayeshKalaSefr=0 Then";
if ((mostCurrent._mcode._namayeshkalasefr /*String*/ ).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=34668582;
 //BA.debugLineNum = 34668582;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=34668583;
 //BA.debugLineNum = 34668583;BA.debugLine="str= str & \" and SumMande > '0'\"";
_str = _str+" and SumMande > '0'";
RDebugUtils.currentLine=34668584;
 //BA.debugLineNum = 34668584;BA.debugLine="filter=True";
_filter = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=34668585;
 //BA.debugLineNum = 34668585;BA.debugLine="If countfilter=1 Then";
if (_countfilter==1) { 
RDebugUtils.currentLine=34668586;
 //BA.debugLineNum = 34668586;BA.debugLine="str=str.Replace(\" and \",\"\")";
_str = _str.replace(" and ","");
 };
 };
RDebugUtils.currentLine=34668590;
 //BA.debugLineNum = 34668590;BA.debugLine="If SwMojoodi.Checked=True Then";
if (mostCurrent._swmojoodi.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=34668591;
 //BA.debugLineNum = 34668591;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=34668592;
 //BA.debugLineNum = 34668592;BA.debugLine="str= str & \" and SumMande > '0'\"";
_str = _str+" and SumMande > '0'";
RDebugUtils.currentLine=34668593;
 //BA.debugLineNum = 34668593;BA.debugLine="filter=True";
_filter = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=34668594;
 //BA.debugLineNum = 34668594;BA.debugLine="If countfilter=1 Then";
if (_countfilter==1) { 
RDebugUtils.currentLine=34668595;
 //BA.debugLineNum = 34668595;BA.debugLine="str=str.Replace(\" and \",\"\")";
_str = _str.replace(" and ","");
 };
 };
RDebugUtils.currentLine=34668598;
 //BA.debugLineNum = 34668598;BA.debugLine="If SwPic.Checked=True Then";
if (mostCurrent._swpic.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=34668599;
 //BA.debugLineNum = 34668599;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=34668600;
 //BA.debugLineNum = 34668600;BA.debugLine="str= str & \" and fldPathPic <> '0'\"";
_str = _str+" and fldPathPic <> '0'";
RDebugUtils.currentLine=34668601;
 //BA.debugLineNum = 34668601;BA.debugLine="filter=True";
_filter = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=34668602;
 //BA.debugLineNum = 34668602;BA.debugLine="If countfilter=1 Then";
if (_countfilter==1) { 
RDebugUtils.currentLine=34668603;
 //BA.debugLineNum = 34668603;BA.debugLine="str=str.Replace(\" and \",\"\")";
_str = _str.replace(" and ","");
 };
 };
RDebugUtils.currentLine=34668630;
 //BA.debugLineNum = 34668630;BA.debugLine="If filter=True And str<>\"\" Then";
if (_filter==anywheresoftware.b4a.keywords.Common.True && (_str).equals("") == false) { 
RDebugUtils.currentLine=34668633;
 //BA.debugLineNum = 34668633;BA.debugLine="str=\"select * from TblKala where \"&str&\" \"&Str_";
_str = "select * from TblKala where "+_str+" "+mostCurrent._str_sort;
 }else {
RDebugUtils.currentLine=34668635;
 //BA.debugLineNum = 34668635;BA.debugLine="str=\"select * from TblKala  \"&Str_sort";
_str = "select * from TblKala  "+mostCurrent._str_sort;
 };
RDebugUtils.currentLine=34668637;
 //BA.debugLineNum = 34668637;BA.debugLine="Log(str)";
anywheresoftware.b4a.keywords.Common.LogImpl("534668637",_str,0);
 };
RDebugUtils.currentLine=34668640;
 //BA.debugLineNum = 34668640;BA.debugLine="If GroupCodeSelect1<>0 And GroupCodeSelect2=0 The";
if ((mostCurrent._groupcodeselect1).equals(BA.NumberToString(0)) == false && (mostCurrent._groupcodeselect2).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=34668641;
 //BA.debugLineNum = 34668641;BA.debugLine="If SwGift.Checked=True Then";
if (mostCurrent._swgift.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=34668642;
 //BA.debugLineNum = 34668642;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=34668643;
 //BA.debugLineNum = 34668643;BA.debugLine="If MCode.EshantionGroup=1 Then";
if ((mostCurrent._mcode._eshantiongroup /*String*/ ).equals(BA.NumberToString(1))) { 
RDebugUtils.currentLine=34668644;
 //BA.debugLineNum = 34668644;BA.debugLine="str= str & \" and TblKala.fldCodeGroup IN(SELE";
_str = _str+" and TblKala.fldCodeGroup IN(SELECT tblEshantionGroup.fldCodeGroupKala FROM tblEshantionGroup)";
 }else {
RDebugUtils.currentLine=34668646;
 //BA.debugLineNum = 34668646;BA.debugLine="str= str & \" and TblKala.fldCodeKala IN(SELEC";
_str = _str+" and TblKala.fldCodeKala IN(SELECT tblEshantionTabaghati.fldCodeKalaForoosh FROM tblEshantionTabaghati)";
 };
 };
RDebugUtils.currentLine=34668649;
 //BA.debugLineNum = 34668649;BA.debugLine="If SwTakhfif.Checked=True Then";
if (mostCurrent._swtakhfif.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=34668650;
 //BA.debugLineNum = 34668650;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=34668651;
 //BA.debugLineNum = 34668651;BA.debugLine="str= str & \" and fldFeeBadAzTakhfif <> '0.0000'";
_str = _str+" and fldFeeBadAzTakhfif <> '0.0000'";
 };
RDebugUtils.currentLine=34668653;
 //BA.debugLineNum = 34668653;BA.debugLine="If SwMojoodi.Checked=True Then";
if (mostCurrent._swmojoodi.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=34668654;
 //BA.debugLineNum = 34668654;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=34668655;
 //BA.debugLineNum = 34668655;BA.debugLine="str= str & \" and SumMande > '0'\"";
_str = _str+" and SumMande > '0'";
 };
RDebugUtils.currentLine=34668657;
 //BA.debugLineNum = 34668657;BA.debugLine="If MCode.NamayeshKalaSefr=0 Then";
if ((mostCurrent._mcode._namayeshkalasefr /*String*/ ).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=34668658;
 //BA.debugLineNum = 34668658;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=34668659;
 //BA.debugLineNum = 34668659;BA.debugLine="str= str & \" and SumMande > '0'\"";
_str = _str+" and SumMande > '0'";
RDebugUtils.currentLine=34668660;
 //BA.debugLineNum = 34668660;BA.debugLine="filter=True";
_filter = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=34668661;
 //BA.debugLineNum = 34668661;BA.debugLine="If countfilter=1 Then";
if (_countfilter==1) { 
RDebugUtils.currentLine=34668662;
 //BA.debugLineNum = 34668662;BA.debugLine="str=str.Replace(\" and \",\"\")";
_str = _str.replace(" and ","");
 };
 };
RDebugUtils.currentLine=34668665;
 //BA.debugLineNum = 34668665;BA.debugLine="If SwPic.Checked=True Then";
if (mostCurrent._swpic.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=34668666;
 //BA.debugLineNum = 34668666;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=34668667;
 //BA.debugLineNum = 34668667;BA.debugLine="str= str & \" and fldPathPic <> '0'\"";
_str = _str+" and fldPathPic <> '0'";
 };
RDebugUtils.currentLine=34668691;
 //BA.debugLineNum = 34668691;BA.debugLine="If	filter=True And str<>\"\" Then";
if (_filter==anywheresoftware.b4a.keywords.Common.True && (_str).equals("") == false) { 
RDebugUtils.currentLine=34668692;
 //BA.debugLineNum = 34668692;BA.debugLine="str=\"select * from TblKala where fldCodeGroup";
_str = "select * from TblKala where fldCodeGroup like '"+mostCurrent._groupcodeselect1+"%' and "+_str+" "+mostCurrent._str_sort;
 }else {
RDebugUtils.currentLine=34668694;
 //BA.debugLineNum = 34668694;BA.debugLine="str=\"select * from TblKala where fldCodeGroup";
_str = "select * from TblKala where fldCodeGroup like '"+mostCurrent._groupcodeselect1+"%' "+mostCurrent._str_sort;
 };
RDebugUtils.currentLine=34668698;
 //BA.debugLineNum = 34668698;BA.debugLine="Log(str)";
anywheresoftware.b4a.keywords.Common.LogImpl("534668698",_str,0);
 };
RDebugUtils.currentLine=34668701;
 //BA.debugLineNum = 34668701;BA.debugLine="If GroupCodeSelect1<>0 And GroupCodeSelect2<>0 Th";
if ((mostCurrent._groupcodeselect1).equals(BA.NumberToString(0)) == false && (mostCurrent._groupcodeselect2).equals(BA.NumberToString(0)) == false) { 
RDebugUtils.currentLine=34668702;
 //BA.debugLineNum = 34668702;BA.debugLine="If SwGift.Checked=True Then";
if (mostCurrent._swgift.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=34668703;
 //BA.debugLineNum = 34668703;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=34668704;
 //BA.debugLineNum = 34668704;BA.debugLine="If MCode.EshantionGroup=1 Then";
if ((mostCurrent._mcode._eshantiongroup /*String*/ ).equals(BA.NumberToString(1))) { 
RDebugUtils.currentLine=34668705;
 //BA.debugLineNum = 34668705;BA.debugLine="str= str & \" and TblKala.fldCodeGroup IN(SELE";
_str = _str+" and TblKala.fldCodeGroup IN(SELECT tblEshantionGroup.fldCodeGroupKala FROM tblEshantionGroup)";
 }else {
RDebugUtils.currentLine=34668707;
 //BA.debugLineNum = 34668707;BA.debugLine="str= str & \" and TblKala.fldCodeKala IN(SELEC";
_str = _str+" and TblKala.fldCodeKala IN(SELECT tblEshantionTabaghati.fldCodeKalaForoosh FROM tblEshantionTabaghati)";
 };
 };
RDebugUtils.currentLine=34668711;
 //BA.debugLineNum = 34668711;BA.debugLine="If SwTakhfif.Checked=True Then";
if (mostCurrent._swtakhfif.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=34668712;
 //BA.debugLineNum = 34668712;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=34668713;
 //BA.debugLineNum = 34668713;BA.debugLine="str= str & \" and fldFeeBadAzTakhfif <> '0.0000'";
_str = _str+" and fldFeeBadAzTakhfif <> '0.0000'";
 };
RDebugUtils.currentLine=34668716;
 //BA.debugLineNum = 34668716;BA.debugLine="If SwMojoodi.Checked=True Then";
if (mostCurrent._swmojoodi.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=34668717;
 //BA.debugLineNum = 34668717;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=34668718;
 //BA.debugLineNum = 34668718;BA.debugLine="str= str & \" and SumMande > '0'\"";
_str = _str+" and SumMande > '0'";
 };
RDebugUtils.currentLine=34668721;
 //BA.debugLineNum = 34668721;BA.debugLine="If MCode.NamayeshKalaSefr=0 Then";
if ((mostCurrent._mcode._namayeshkalasefr /*String*/ ).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=34668722;
 //BA.debugLineNum = 34668722;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=34668723;
 //BA.debugLineNum = 34668723;BA.debugLine="str= str & \" and SumMande > '0'\"";
_str = _str+" and SumMande > '0'";
RDebugUtils.currentLine=34668724;
 //BA.debugLineNum = 34668724;BA.debugLine="filter=True";
_filter = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=34668725;
 //BA.debugLineNum = 34668725;BA.debugLine="If countfilter=1 Then";
if (_countfilter==1) { 
RDebugUtils.currentLine=34668726;
 //BA.debugLineNum = 34668726;BA.debugLine="str=str.Replace(\" and \",\"\")";
_str = _str.replace(" and ","");
 };
 };
RDebugUtils.currentLine=34668729;
 //BA.debugLineNum = 34668729;BA.debugLine="If SwPic.Checked=True Then";
if (mostCurrent._swpic.getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=34668730;
 //BA.debugLineNum = 34668730;BA.debugLine="countfilter=countfilter+1";
_countfilter = (int) (_countfilter+1);
RDebugUtils.currentLine=34668731;
 //BA.debugLineNum = 34668731;BA.debugLine="str= str & \" and fldPathPic <> '0'\"";
_str = _str+" and fldPathPic <> '0'";
 };
RDebugUtils.currentLine=34668757;
 //BA.debugLineNum = 34668757;BA.debugLine="If	filter=True And str<>\"\" Then";
if (_filter==anywheresoftware.b4a.keywords.Common.True && (_str).equals("") == false) { 
RDebugUtils.currentLine=34668758;
 //BA.debugLineNum = 34668758;BA.debugLine="str=\"select * from TblKala where fldCodeGroup";
_str = "select * from TblKala where fldCodeGroup like '"+mostCurrent._groupcodeselect2+"%' and "+_str+" "+mostCurrent._str_sort;
 }else {
RDebugUtils.currentLine=34668760;
 //BA.debugLineNum = 34668760;BA.debugLine="str=\"select * from TblKala where fldCodeGroup";
_str = "select * from TblKala where fldCodeGroup like '"+mostCurrent._groupcodeselect2+"%' "+mostCurrent._str_sort;
 };
RDebugUtils.currentLine=34668762;
 //BA.debugLineNum = 34668762;BA.debugLine="Log(str)";
anywheresoftware.b4a.keywords.Common.LogImpl("534668762",_str,0);
 };
RDebugUtils.currentLine=34668764;
 //BA.debugLineNum = 34668764;BA.debugLine="FirebaseMessaging.mode=\"stop\"";
mostCurrent._firebasemessaging._mode /*String*/  = "stop";
RDebugUtils.currentLine=34668766;
 //BA.debugLineNum = 34668766;BA.debugLine="th.RunOnGuiThread(\"LoadListKala\",Array As Object";
_th.RunOnGuiThread("LoadListKala",new Object[]{(Object)(_str)});
 } 
       catch (Exception e137) {
			processBA.setLastException(e137);RDebugUtils.currentLine=34668772;
 //BA.debugLineNum = 34668772;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("534668772",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=34668773;
 //BA.debugLineNum = 34668773;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-LoadKala");
 };
RDebugUtils.currentLine=34668775;
 //BA.debugLineNum = 34668775;BA.debugLine="End Sub";
return "";
}
public static boolean  _activity_keypress(int _keycode) throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_keypress", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "activity_keypress", new Object[] {_keycode}));}
RDebugUtils.currentLine=37027840;
 //BA.debugLineNum = 37027840;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
RDebugUtils.currentLine=37027841;
 //BA.debugLineNum = 37027841;BA.debugLine="If KeyCode=KeyCodes.KEYCODE_ENTER Then";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_ENTER) { 
RDebugUtils.currentLine=37027842;
 //BA.debugLineNum = 37027842;BA.debugLine="If TxtSearch.RequestFocus Then";
if (mostCurrent._txtsearch.RequestFocus()) { 
RDebugUtils.currentLine=37027843;
 //BA.debugLineNum = 37027843;BA.debugLine="BtnSearch_Click";
_btnsearch_click();
 };
RDebugUtils.currentLine=37027845;
 //BA.debugLineNum = 37027845;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 };
RDebugUtils.currentLine=37027847;
 //BA.debugLineNum = 37027847;BA.debugLine="If KeyCode=KeyCodes.KEYCODE_BACK Then";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK) { 
RDebugUtils.currentLine=37027848;
 //BA.debugLineNum = 37027848;BA.debugLine="If sidemenu.Visible Then";
if (mostCurrent._sidemenu.getVisible()) { 
RDebugUtils.currentLine=37027849;
 //BA.debugLineNum = 37027849;BA.debugLine="If MCode.C_LayeKala.Length > 3 Then";
if (mostCurrent._mcode._c_layekala /*String*/ .length()>3) { 
RDebugUtils.currentLine=37027850;
 //BA.debugLineNum = 37027850;BA.debugLine="LoadGoroohKalaBack(MCode.C_LayeKala)";
_loadgoroohkalaback(mostCurrent._mcode._c_layekala /*String*/ );
RDebugUtils.currentLine=37027851;
 //BA.debugLineNum = 37027851;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 }else {
RDebugUtils.currentLine=37027853;
 //BA.debugLineNum = 37027853;BA.debugLine="sidemenu.HideMenus";
mostCurrent._sidemenu.HideMenus();
RDebugUtils.currentLine=37027854;
 //BA.debugLineNum = 37027854;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 };
 };
RDebugUtils.currentLine=37027858;
 //BA.debugLineNum = 37027858;BA.debugLine="If PnlFee.Visible Then";
if (mostCurrent._pnlfee.getVisible()) { 
RDebugUtils.currentLine=37027859;
 //BA.debugLineNum = 37027859;BA.debugLine="btnClose_Click";
_btnclose_click();
RDebugUtils.currentLine=37027860;
 //BA.debugLineNum = 37027860;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 };
RDebugUtils.currentLine=37027862;
 //BA.debugLineNum = 37027862;BA.debugLine="btn_Back_Click";
_btn_back_click();
RDebugUtils.currentLine=37027863;
 //BA.debugLineNum = 37027863;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 };
RDebugUtils.currentLine=37027865;
 //BA.debugLineNum = 37027865;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=37027866;
 //BA.debugLineNum = 37027866;BA.debugLine="End Sub";
return false;
}
public static String  _btnsearch_click() throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnsearch_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnsearch_click", null));}
RDebugUtils.currentLine=37158912;
 //BA.debugLineNum = 37158912;BA.debugLine="Sub BtnSearch_Click";
RDebugUtils.currentLine=37158914;
 //BA.debugLineNum = 37158914;BA.debugLine="Try";
try {RDebugUtils.currentLine=37158924;
 //BA.debugLineNum = 37158924;BA.debugLine="LoadKala";
_loadkala();
 } 
       catch (Exception e4) {
			processBA.setLastException(e4);RDebugUtils.currentLine=37158926;
 //BA.debugLineNum = 37158926;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("537158926",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=37158927;
 //BA.debugLineNum = 37158927;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-BtnSearch_Click");
 };
RDebugUtils.currentLine=37158929;
 //BA.debugLineNum = 37158929;BA.debugLine="End Sub";
return "";
}
public static String  _loadgoroohkalaback(String _code) throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "loadgoroohkalaback", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "loadgoroohkalaback", new Object[] {_code}));}
String _c_gorooh = "";
int _count = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _dt = null;
ir.parsikhesab.pakhsh.mcode._adaptergoroohkala _item1 = null;
int _i = 0;
ir.parsikhesab.pakhsh.mcode._adaptergoroohkala _item = null;
RDebugUtils.currentLine=34996224;
 //BA.debugLineNum = 34996224;BA.debugLine="Sub LoadGoroohKalaBack(Code As String)";
RDebugUtils.currentLine=34996225;
 //BA.debugLineNum = 34996225;BA.debugLine="Dim C_Gorooh As String = MCode.Sf.Left(Code,Code.";
_c_gorooh = mostCurrent._mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vv0(_code,(long) (_code.length()-6));
RDebugUtils.currentLine=34996226;
 //BA.debugLineNum = 34996226;BA.debugLine="Dim Count As Int = C_Gorooh.Length + 3";
_count = (int) (_c_gorooh.length()+3);
RDebugUtils.currentLine=34996227;
 //BA.debugLineNum = 34996227;BA.debugLine="Dim Dt As Cursor=MCode.Result(\"Select FldC_Gorooh";
_dt = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_dt = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select FldC_Gorooh,FldN_Gorooh From TblGoroohKala where FldC_Gorooh Like '"+_c_gorooh+"%' And Length(FldC_Gorooh) = "+BA.NumberToString(_count)+" ORDER BY FldC_Gorooh");
RDebugUtils.currentLine=34996228;
 //BA.debugLineNum = 34996228;BA.debugLine="If Dt.RowCount>0 Then";
if (_dt.getRowCount()>0) { 
RDebugUtils.currentLine=34996229;
 //BA.debugLineNum = 34996229;BA.debugLine="OriginalListGoroohKala2.Clear";
mostCurrent._originallistgoroohkala2.Clear();
RDebugUtils.currentLine=34996230;
 //BA.debugLineNum = 34996230;BA.debugLine="Dim Item1 As AdapterGoroohKala";
_item1 = new ir.parsikhesab.pakhsh.mcode._adaptergoroohkala();
RDebugUtils.currentLine=34996231;
 //BA.debugLineNum = 34996231;BA.debugLine="Item1.FldC_Gorooh= 0";
_item1.FldC_Gorooh /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=34996232;
 //BA.debugLineNum = 34996232;BA.debugLine="Item1.FldN_Gorooh= \"همه گروه ها\"";
_item1.FldN_Gorooh /*String*/  = "همه گروه ها";
RDebugUtils.currentLine=34996233;
 //BA.debugLineNum = 34996233;BA.debugLine="OriginalListGoroohKala2.Add(Item1)";
mostCurrent._originallistgoroohkala2.Add((Object)(_item1));
RDebugUtils.currentLine=34996234;
 //BA.debugLineNum = 34996234;BA.debugLine="For i=0 To Dt.RowCount-1";
{
final int step10 = 1;
final int limit10 = (int) (_dt.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit10 ;_i = _i + step10 ) {
RDebugUtils.currentLine=34996235;
 //BA.debugLineNum = 34996235;BA.debugLine="Dt.Position=i";
_dt.setPosition(_i);
RDebugUtils.currentLine=34996236;
 //BA.debugLineNum = 34996236;BA.debugLine="Dim Item As AdapterGoroohKala";
_item = new ir.parsikhesab.pakhsh.mcode._adaptergoroohkala();
RDebugUtils.currentLine=34996237;
 //BA.debugLineNum = 34996237;BA.debugLine="Item.FldC_Gorooh= Dt.GetString(\"FldC_Gorooh\")";
_item.FldC_Gorooh /*String*/  = _dt.GetString("FldC_Gorooh");
RDebugUtils.currentLine=34996238;
 //BA.debugLineNum = 34996238;BA.debugLine="Item.FldN_Gorooh= Dt.GetString(\"FldN_Gorooh\")";
_item.FldN_Gorooh /*String*/  = _dt.GetString("FldN_Gorooh");
RDebugUtils.currentLine=34996239;
 //BA.debugLineNum = 34996239;BA.debugLine="OriginalListGoroohKala2.Add(Item)";
mostCurrent._originallistgoroohkala2.Add((Object)(_item));
RDebugUtils.currentLine=34996240;
 //BA.debugLineNum = 34996240;BA.debugLine="MCode.C_LayeKala=Item.FldC_Gorooh";
mostCurrent._mcode._c_layekala /*String*/  = _item.FldC_Gorooh /*String*/ ;
 }
};
RDebugUtils.currentLine=34996242;
 //BA.debugLineNum = 34996242;BA.debugLine="ListGoroohKala2 = OriginalListGoroohKala2";
mostCurrent._listgoroohkala2 = mostCurrent._originallistgoroohkala2;
RDebugUtils.currentLine=34996243;
 //BA.debugLineNum = 34996243;BA.debugLine="HLVGoroohKala.notifyDataSetChanged";
mostCurrent._hlvgoroohkala.notifyDataSetChanged();
 };
RDebugUtils.currentLine=34996245;
 //BA.debugLineNum = 34996245;BA.debugLine="LoadKala";
_loadkala();
RDebugUtils.currentLine=34996246;
 //BA.debugLineNum = 34996246;BA.debugLine="End Sub";
return "";
}
public static String  _btnclose_click() throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnclose_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnclose_click", null));}
RDebugUtils.currentLine=37748736;
 //BA.debugLineNum = 37748736;BA.debugLine="Private Sub btnClose_Click";
RDebugUtils.currentLine=37748737;
 //BA.debugLineNum = 37748737;BA.debugLine="PnlFee.Visible=False";
mostCurrent._pnlfee.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=37748738;
 //BA.debugLineNum = 37748738;BA.debugLine="MCode.AnimationClose(PnlFee)";
mostCurrent._mcode._animationclose /*String*/ (mostCurrent.activityBA,(Object)(mostCurrent._pnlfee.getObject()));
RDebugUtils.currentLine=37748740;
 //BA.debugLineNum = 37748740;BA.debugLine="txtFee.Text=\"0\"";
mostCurrent._txtfee.setText(BA.ObjectToCharSequence("0"));
RDebugUtils.currentLine=37748741;
 //BA.debugLineNum = 37748741;BA.debugLine="txtDarsadTakhfif.Text=\"0\"";
mostCurrent._txtdarsadtakhfif.setText(BA.ObjectToCharSequence("0"));
RDebugUtils.currentLine=37748742;
 //BA.debugLineNum = 37748742;BA.debugLine="End Sub";
return "";
}
public static String  _btn_back_click() throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_back_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_back_click", null));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu1 = null;
int _res = 0;
RDebugUtils.currentLine=36896768;
 //BA.debugLineNum = 36896768;BA.debugLine="Sub btn_Back_Click";
RDebugUtils.currentLine=36896770;
 //BA.debugLineNum = 36896770;BA.debugLine="Dim Cu1 As Cursor = MCode.Result(\"Select * From T";
_cu1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu1 = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblSabad");
RDebugUtils.currentLine=36896771;
 //BA.debugLineNum = 36896771;BA.debugLine="If Cu1.RowCount>0 Then";
if (_cu1.getRowCount()>0) { 
RDebugUtils.currentLine=36896772;
 //BA.debugLineNum = 36896772;BA.debugLine="Dim Res As Int = Msgbox2(\"با خارج شدن از این صفح";
_res = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("با خارج شدن از این صفحه، سبد خرید شما خالی میشود. آیا از این صفحه خارج می شوید؟"),BA.ObjectToCharSequence("توجه"),"بله","","خیر",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=36896773;
 //BA.debugLineNum = 36896773;BA.debugLine="If Res = DialogResponse.POSITIVE Then";
if (_res==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=36896774;
 //BA.debugLineNum = 36896774;BA.debugLine="MCode.SaveUpdate(\"delete from TblSabad\")";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"delete from TblSabad");
RDebugUtils.currentLine=36896775;
 //BA.debugLineNum = 36896775;BA.debugLine="If MCode.EshantionGroup=1 Then";
if ((mostCurrent._mcode._eshantiongroup /*String*/ ).equals(BA.NumberToString(1))) { 
RDebugUtils.currentLine=36896776;
 //BA.debugLineNum = 36896776;BA.debugLine="MCode.SaveUpdate(\"Delete from tblEshantionGrou";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Delete from tblEshantionGroupTemp");
 };
RDebugUtils.currentLine=36896778;
 //BA.debugLineNum = 36896778;BA.debugLine="close";
_close();
 };
 }else {
RDebugUtils.currentLine=36896781;
 //BA.debugLineNum = 36896781;BA.debugLine="close";
_close();
 };
RDebugUtils.currentLine=36896784;
 //BA.debugLineNum = 36896784;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="act_kaladefault";
RDebugUtils.currentLine=34799616;
 //BA.debugLineNum = 34799616;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=34799618;
 //BA.debugLineNum = 34799618;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=34734080;
 //BA.debugLineNum = 34734080;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=34734081;
 //BA.debugLineNum = 34734081;BA.debugLine="Try";
try {RDebugUtils.currentLine=34734082;
 //BA.debugLineNum = 34734082;BA.debugLine="If MCode.page=\"Show_Image2\" Then";
if ((mostCurrent._mcode._page /*String*/ ).equals("Show_Image2")) { 
RDebugUtils.currentLine=34734083;
 //BA.debugLineNum = 34734083;BA.debugLine="If MCode.Action=\"SabtFaktor\" Then";
if ((mostCurrent._mcode._action /*String*/ ).equals("SabtFaktor")) { 
RDebugUtils.currentLine=34734084;
 //BA.debugLineNum = 34734084;BA.debugLine="MCode.page = \"KalaDefault\"";
mostCurrent._mcode._page /*String*/  = "KalaDefault";
 };
RDebugUtils.currentLine=34734086;
 //BA.debugLineNum = 34734086;BA.debugLine="If MCode.Action=\"SabtMarjooii\" Then";
if ((mostCurrent._mcode._action /*String*/ ).equals("SabtMarjooii")) { 
RDebugUtils.currentLine=34734087;
 //BA.debugLineNum = 34734087;BA.debugLine="MCode.page = \"SabtMarjooii\"";
mostCurrent._mcode._page /*String*/  = "SabtMarjooii";
 };
RDebugUtils.currentLine=34734089;
 //BA.debugLineNum = 34734089;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=34734091;
 //BA.debugLineNum = 34734091;BA.debugLine="MCode.CreateReportSabad";
mostCurrent._mcode._createreportsabad /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=34734094;
 //BA.debugLineNum = 34734094;BA.debugLine="If MCode.ManedEtebarEnable Then";
if (mostCurrent._mcode._manedetebarenable /*boolean*/ ) { 
RDebugUtils.currentLine=34734095;
 //BA.debugLineNum = 34734095;BA.debugLine="LblMandeEtebar.Text=\"مانده اعتبار : \" & myCode.";
mostCurrent._lblmandeetebar.setText(BA.ObjectToCharSequence("مانده اعتبار : "+mostCurrent._mycode._adadtoprice /*String*/ (mostCurrent.activityBA,mostCurrent._mcode._mandeetebar /*String*/ )));
 }else {
RDebugUtils.currentLine=34734098;
 //BA.debugLineNum = 34734098;BA.debugLine="LblMandeEtebar.Text=\"مانده اعتبار : 0\"";
mostCurrent._lblmandeetebar.setText(BA.ObjectToCharSequence("مانده اعتبار : 0"));
 };
RDebugUtils.currentLine=34734101;
 //BA.debugLineNum = 34734101;BA.debugLine="If MCode.IsConnected=False And MCode.ConnectionS";
if (mostCurrent._mcode._isconnected /*boolean*/ (mostCurrent.activityBA)==anywheresoftware.b4a.keywords.Common.False && (mostCurrent._mcode._connectionstatus /*String*/ ).equals(BA.NumberToString(1))) { 
RDebugUtils.currentLine=34734102;
 //BA.debugLineNum = 34734102;BA.debugLine="ToastMessageShow(\"لطفا ارتباط اینترنت گوشی خود";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("لطفا ارتباط اینترنت گوشی خود را بررسی نمایید"),anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=34734111;
 //BA.debugLineNum = 34734111;BA.debugLine="StartService(FusedLocationService)";
anywheresoftware.b4a.keywords.Common.StartService(processBA,(Object)(mostCurrent._fusedlocationservice.getObject()));
RDebugUtils.currentLine=34734113;
 //BA.debugLineNum = 34734113;BA.debugLine="Log(\"Gps Start\")";
anywheresoftware.b4a.keywords.Common.LogImpl("534734113","Gps Start",0);
RDebugUtils.currentLine=34734114;
 //BA.debugLineNum = 34734114;BA.debugLine="LoadKala";
_loadkala();
RDebugUtils.currentLine=34734115;
 //BA.debugLineNum = 34734115;BA.debugLine="RefreshLblSabad";
_refreshlblsabad();
RDebugUtils.currentLine=34734116;
 //BA.debugLineNum = 34734116;BA.debugLine="MojavezSefaresh";
_mojavezsefaresh();
 } 
       catch (Exception e26) {
			processBA.setLastException(e26);RDebugUtils.currentLine=34734118;
 //BA.debugLineNum = 34734118;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("534734118",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=34734119;
 //BA.debugLineNum = 34734119;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-Activity_Resume");
 };
RDebugUtils.currentLine=34734121;
 //BA.debugLineNum = 34734121;BA.debugLine="End Sub";
return "";
}
public static String  _refreshlblsabad() throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "refreshlblsabad", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "refreshlblsabad", null));}
String _countsabad = "";
RDebugUtils.currentLine=35454976;
 //BA.debugLineNum = 35454976;BA.debugLine="Sub RefreshLblSabad";
RDebugUtils.currentLine=35454977;
 //BA.debugLineNum = 35454977;BA.debugLine="Try";
try {RDebugUtils.currentLine=35454978;
 //BA.debugLineNum = 35454978;BA.debugLine="Dim countSabad As String = MCode.SingleResult(\"S";
_countsabad = BA.ObjectToString(mostCurrent._mcode._singleresult /*Object*/ (mostCurrent.activityBA,"Select Count(FldId) From TblSabad"));
RDebugUtils.currentLine=35454980;
 //BA.debugLineNum = 35454980;BA.debugLine="If countSabad>0 Then";
if ((double)(Double.parseDouble(_countsabad))>0) { 
RDebugUtils.currentLine=35454981;
 //BA.debugLineNum = 35454981;BA.debugLine="LblBasketCount.Visible=True";
mostCurrent._lblbasketcount.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=35454982;
 //BA.debugLineNum = 35454982;BA.debugLine="LblBasketCount.Text=countSabad";
mostCurrent._lblbasketcount.setText(BA.ObjectToCharSequence(_countsabad));
RDebugUtils.currentLine=35454983;
 //BA.debugLineNum = 35454983;BA.debugLine="MCode.CreateReportSabad";
mostCurrent._mcode._createreportsabad /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=35454984;
 //BA.debugLineNum = 35454984;BA.debugLine="LblSumTakhfif.Text=\"مبلغ کل تخفیف : \"& myCode.A";
mostCurrent._lblsumtakhfif.setText(BA.ObjectToCharSequence("مبلغ کل تخفیف : "+mostCurrent._mycode._adadtoprice /*String*/ (mostCurrent.activityBA,mostCurrent._mcode._finalfaktor /*ir.parsikhesab.pakhsh.mcode._finalfaktor_*/ .TakhfifKol /*String*/ )));
RDebugUtils.currentLine=35454985;
 //BA.debugLineNum = 35454985;BA.debugLine="LblSumFactor.Text=\"مبلغ کل فاکتور : \"& myCode.A";
mostCurrent._lblsumfactor.setText(BA.ObjectToCharSequence("مبلغ کل فاکتور : "+mostCurrent._mycode._adadtoprice /*String*/ (mostCurrent.activityBA,mostCurrent._mcode._finalfaktor /*ir.parsikhesab.pakhsh.mcode._finalfaktor_*/ .KhamFaktor /*String*/ )));
RDebugUtils.currentLine=35454986;
 //BA.debugLineNum = 35454986;BA.debugLine="LblSumKolBadAzTakhfif.Text=\"مبلغ بعد از تخفیف :";
mostCurrent._lblsumkolbadaztakhfif.setText(BA.ObjectToCharSequence("مبلغ بعد از تخفیف : "+mostCurrent._mycode._adadtoprice /*String*/ (mostCurrent.activityBA,mostCurrent._mcode._finalfaktor /*ir.parsikhesab.pakhsh.mcode._finalfaktor_*/ .SumKolBadazTahkfif /*String*/ )));
RDebugUtils.currentLine=35454987;
 //BA.debugLineNum = 35454987;BA.debugLine="lblSumKhales.Text=\"مبلغ خالص : \"& myCode.AdadTo";
mostCurrent._lblsumkhales.setText(BA.ObjectToCharSequence("مبلغ خالص : "+mostCurrent._mycode._adadtoprice /*String*/ (mostCurrent.activityBA,mostCurrent._mcode._finalfaktor /*ir.parsikhesab.pakhsh.mcode._finalfaktor_*/ .GablePardakht /*String*/ )));
RDebugUtils.currentLine=35454988;
 //BA.debugLineNum = 35454988;BA.debugLine="If MCode.ArzeshAfzodeEnable=1 Then";
if ((mostCurrent._mcode._arzeshafzodeenable /*String*/ ).equals(BA.NumberToString(1))) { 
RDebugUtils.currentLine=35454989;
 //BA.debugLineNum = 35454989;BA.debugLine="lblArzeshAfzode.Text=\"مبلغ ارزش افزوده : \"& my";
mostCurrent._lblarzeshafzode.setText(BA.ObjectToCharSequence("مبلغ ارزش افزوده : "+mostCurrent._mycode._adadtoprice /*String*/ (mostCurrent.activityBA,mostCurrent._mcode._finalfaktor /*ir.parsikhesab.pakhsh.mcode._finalfaktor_*/ .fldArzeshAfzode /*String*/ )));
 }else {
RDebugUtils.currentLine=35454991;
 //BA.debugLineNum = 35454991;BA.debugLine="lblArzeshAfzode.Text=\"مبلغ ارزش افزوده: 0\"";
mostCurrent._lblarzeshafzode.setText(BA.ObjectToCharSequence("مبلغ ارزش افزوده: 0"));
 };
RDebugUtils.currentLine=35454993;
 //BA.debugLineNum = 35454993;BA.debugLine="If MCode.ManedEtebarEnable Then";
if (mostCurrent._mcode._manedetebarenable /*boolean*/ ) { 
RDebugUtils.currentLine=35454994;
 //BA.debugLineNum = 35454994;BA.debugLine="If MCode.FinalFaktor.GablePardakht> MCode.Mand";
if ((double)(Double.parseDouble(mostCurrent._mcode._finalfaktor /*ir.parsikhesab.pakhsh.mcode._finalfaktor_*/ .GablePardakht /*String*/ ))>(double)(Double.parseDouble(mostCurrent._mcode._mandeetebar /*String*/ ))) { 
RDebugUtils.currentLine=35454995;
 //BA.debugLineNum = 35454995;BA.debugLine="lblSumKhales.TextColor=Colors.Red";
mostCurrent._lblsumkhales.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Red);
RDebugUtils.currentLine=35454996;
 //BA.debugLineNum = 35454996;BA.debugLine="ToastMessageShow(\"جمع مبلغ سفارش از اعتبار مش";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("جمع مبلغ سفارش از اعتبار مشتری بیشتر میباشد."),anywheresoftware.b4a.keywords.Common.True);
 }else {
RDebugUtils.currentLine=35454998;
 //BA.debugLineNum = 35454998;BA.debugLine="lblSumKhales.TextColor=Colors.White";
mostCurrent._lblsumkhales.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
 };
 }else {
RDebugUtils.currentLine=35455001;
 //BA.debugLineNum = 35455001;BA.debugLine="lblSumKhales.TextColor=Colors.White";
mostCurrent._lblsumkhales.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
 };
 }else {
RDebugUtils.currentLine=35455005;
 //BA.debugLineNum = 35455005;BA.debugLine="LblBasketCount.Visible=False";
mostCurrent._lblbasketcount.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=35455006;
 //BA.debugLineNum = 35455006;BA.debugLine="lblArzeshAfzode.Text=\"مبلغ ارزش افزوده: 0\"";
mostCurrent._lblarzeshafzode.setText(BA.ObjectToCharSequence("مبلغ ارزش افزوده: 0"));
RDebugUtils.currentLine=35455007;
 //BA.debugLineNum = 35455007;BA.debugLine="LblSumTakhfif.Text=\"مبلغ کل تخفیف : 0\"";
mostCurrent._lblsumtakhfif.setText(BA.ObjectToCharSequence("مبلغ کل تخفیف : 0"));
RDebugUtils.currentLine=35455008;
 //BA.debugLineNum = 35455008;BA.debugLine="LblSumFactor.Text=\"مبلغ کل فاکتور : 0\"";
mostCurrent._lblsumfactor.setText(BA.ObjectToCharSequence("مبلغ کل فاکتور : 0"));
RDebugUtils.currentLine=35455009;
 //BA.debugLineNum = 35455009;BA.debugLine="lblSumKhales.Text=\"مبلغ خالص : 0\"";
mostCurrent._lblsumkhales.setText(BA.ObjectToCharSequence("مبلغ خالص : 0"));
RDebugUtils.currentLine=35455010;
 //BA.debugLineNum = 35455010;BA.debugLine="LblSumKolBadAzTakhfif.Text=\"مبلغ بعد از تخفیف :";
mostCurrent._lblsumkolbadaztakhfif.setText(BA.ObjectToCharSequence("مبلغ بعد از تخفیف : 0"));
RDebugUtils.currentLine=35455011;
 //BA.debugLineNum = 35455011;BA.debugLine="lblSumKhales.TextColor=Colors.White";
mostCurrent._lblsumkhales.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
 };
RDebugUtils.currentLine=35455013;
 //BA.debugLineNum = 35455013;BA.debugLine="HLV.notifyDataSetChanged";
mostCurrent._hlv.notifyDataSetChanged();
 } 
       catch (Exception e37) {
			processBA.setLastException(e37);RDebugUtils.currentLine=35455015;
 //BA.debugLineNum = 35455015;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("535455015",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=35455016;
 //BA.debugLineNum = 35455016;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-RefreshLblSabad");
 };
RDebugUtils.currentLine=35455018;
 //BA.debugLineNum = 35455018;BA.debugLine="End Sub";
return "";
}
public static String  _mojavezsefaresh() throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "mojavezsefaresh", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "mojavezsefaresh", null));}
RDebugUtils.currentLine=34537472;
 //BA.debugLineNum = 34537472;BA.debugLine="Private Sub MojavezSefaresh";
RDebugUtils.currentLine=34537473;
 //BA.debugLineNum = 34537473;BA.debugLine="Select MCode.MojavezSefaresh";
switch (BA.switchObjectToInt(mostCurrent._mcode._mojavezsefaresh /*String*/ ,BA.NumberToString(0),BA.NumberToString(1),BA.NumberToString(2))) {
case 0: {
RDebugUtils.currentLine=34537475;
 //BA.debugLineNum = 34537475;BA.debugLine="lblMojavezSefareshText.Text=\"\"";
mostCurrent._lblmojavezsefareshtext.setText(BA.ObjectToCharSequence(""));
 break; }
case 1: {
RDebugUtils.currentLine=34537477;
 //BA.debugLineNum = 34537477;BA.debugLine="lblMojavezSefareshText.Text=\"توجه : شما مجوز فر";
mostCurrent._lblmojavezsefareshtext.setText(BA.ObjectToCharSequence("توجه : شما مجوز فروش کل را ندارید"));
 break; }
case 2: {
RDebugUtils.currentLine=34537479;
 //BA.debugLineNum = 34537479;BA.debugLine="lblMojavezSefareshText.Text=\"توجه : شما مجوز فر";
mostCurrent._lblmojavezsefareshtext.setText(BA.ObjectToCharSequence("توجه : شما مجوز فروش جزء را ندارید"));
 break; }
}
;
RDebugUtils.currentLine=34537481;
 //BA.debugLineNum = 34537481;BA.debugLine="End Sub";
return "";
}
public static String  _addeshantion(anywheresoftware.b4a.sql.SQL.CursorWrapper _itemsabad) throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "addeshantion", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "addeshantion", new Object[] {_itemsabad}));}
String _codekala = "";
String _tedaddarkarton = "";
String _fldtedaddarsabadjoz = "";
String _fldtedaddarsabadkol = "";
String _eshantion = "";
String _tedadsabad = "";
int _tedadkol = 0;
anywheresoftware.b4a.objects.collections.List _listeshantion = null;
ir.parsikhesab.pakhsh.mcode._adapterlisteshantion _itemmax = null;
int _fldtedadforooshmax = 0;
int _fldtedadeshantionmax = 0;
String _tedadeshantion = "";
String _codekalaeshantation = "";
int _u = 0;
int _i = 0;
ir.parsikhesab.pakhsh.mcode._adapterlisteshantion _item = null;
int _fldtedadforoosh = 0;
int _fldtedadeshantion = 0;
ir.parsikhesab.pakhsh.mcode._adapterlistkala _item1 = null;
ir.parsikhesab.pakhsh.cls_recdefultkala _rec = null;
int _j = 0;
RDebugUtils.currentLine=38862848;
 //BA.debugLineNum = 38862848;BA.debugLine="Sub AddEshantion(ItemSabad As Cursor)";
RDebugUtils.currentLine=38862849;
 //BA.debugLineNum = 38862849;BA.debugLine="Try";
try {RDebugUtils.currentLine=38862850;
 //BA.debugLineNum = 38862850;BA.debugLine="Dim CodeKala As String =ItemSabad.GetString(\"FldC";
_codekala = _itemsabad.GetString("FldCodeKala");
RDebugUtils.currentLine=38862851;
 //BA.debugLineNum = 38862851;BA.debugLine="Dim TedadDarKarton As String =myCode.Is_Null_adad";
_tedaddarkarton = mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_itemsabad.GetString("FldTedadDarKarton"));
RDebugUtils.currentLine=38862852;
 //BA.debugLineNum = 38862852;BA.debugLine="Dim FldTedadDarSabadJoz As String =myCode.Is_Null";
_fldtedaddarsabadjoz = mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_itemsabad.GetString("FldTedadDarSabadJoz"));
RDebugUtils.currentLine=38862853;
 //BA.debugLineNum = 38862853;BA.debugLine="Dim FldTedadDarSabadKol As String =myCode.Is_Null";
_fldtedaddarsabadkol = mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_itemsabad.GetString("FldTedadDarSabadKol"));
RDebugUtils.currentLine=38862854;
 //BA.debugLineNum = 38862854;BA.debugLine="Dim Eshantion As String= ItemSabad.GetString(\"Fld";
_eshantion = _itemsabad.GetString("FldEshantion");
RDebugUtils.currentLine=38862855;
 //BA.debugLineNum = 38862855;BA.debugLine="Dim TedadSabad As String=0";
_tedadsabad = BA.NumberToString(0);
RDebugUtils.currentLine=38862856;
 //BA.debugLineNum = 38862856;BA.debugLine="If TedadDarKarton>0 Then";
if ((double)(Double.parseDouble(_tedaddarkarton))>0) { 
RDebugUtils.currentLine=38862857;
 //BA.debugLineNum = 38862857;BA.debugLine="Dim tedadKol As Int=(TedadDarKarton*FldTedadDarS";
_tedadkol = (int) (((double)(Double.parseDouble(_tedaddarkarton))*(double)(Double.parseDouble(_fldtedaddarsabadkol))));
RDebugUtils.currentLine=38862858;
 //BA.debugLineNum = 38862858;BA.debugLine="TedadSabad=tedadKol+FldTedadDarSabadJoz";
_tedadsabad = BA.NumberToString(_tedadkol+(double)(Double.parseDouble(_fldtedaddarsabadjoz)));
 }else {
RDebugUtils.currentLine=38862860;
 //BA.debugLineNum = 38862860;BA.debugLine="TedadSabad=FldTedadDarSabadJoz";
_tedadsabad = _fldtedaddarsabadjoz;
 };
RDebugUtils.currentLine=38862862;
 //BA.debugLineNum = 38862862;BA.debugLine="Dim ListEshantion As List";
_listeshantion = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=38862863;
 //BA.debugLineNum = 38862863;BA.debugLine="ListEshantion.Initialize";
_listeshantion.Initialize();
RDebugUtils.currentLine=38862864;
 //BA.debugLineNum = 38862864;BA.debugLine="ListEshantion=MCode.LoadEshantionTabaghati(CodeK";
_listeshantion = mostCurrent._mcode._loadeshantiontabaghati /*anywheresoftware.b4a.objects.collections.List*/ (mostCurrent.activityBA,_codekala);
RDebugUtils.currentLine=38862865;
 //BA.debugLineNum = 38862865;BA.debugLine="If ListEshantion.Size>0 Then";
if (_listeshantion.getSize()>0) { 
RDebugUtils.currentLine=38862866;
 //BA.debugLineNum = 38862866;BA.debugLine="Dim ItemMax = ListEshantion.Get(ListEshantion.Si";
_itemmax = (ir.parsikhesab.pakhsh.mcode._adapterlisteshantion)(_listeshantion.Get((int) (_listeshantion.getSize()-1)));
RDebugUtils.currentLine=38862867;
 //BA.debugLineNum = 38862867;BA.debugLine="Dim fldTedadForooshMax As Int=ItemMax.fldTedadFo";
_fldtedadforooshmax = (int)(Double.parseDouble(_itemmax.fldTedadForoosh /*String*/ ));
RDebugUtils.currentLine=38862868;
 //BA.debugLineNum = 38862868;BA.debugLine="Dim fldTedadEshantionMax As Int=ItemMax.fldTedad";
_fldtedadeshantionmax = (int)(Double.parseDouble(_itemmax.fldTedadEshantion /*String*/ ));
RDebugUtils.currentLine=38862869;
 //BA.debugLineNum = 38862869;BA.debugLine="Dim TedadEshantion As String";
_tedadeshantion = "";
RDebugUtils.currentLine=38862870;
 //BA.debugLineNum = 38862870;BA.debugLine="Dim CodeKalaEshantation As String=0";
_codekalaeshantation = BA.NumberToString(0);
RDebugUtils.currentLine=38862871;
 //BA.debugLineNum = 38862871;BA.debugLine="CodeKalaEshantation=ItemMax.fldCodeKalaEshantion";
_codekalaeshantation = _itemmax.fldCodeKalaEshantion /*String*/ ;
RDebugUtils.currentLine=38862872;
 //BA.debugLineNum = 38862872;BA.debugLine="If TedadSabad=fldTedadForooshMax Then";
if ((_tedadsabad).equals(BA.NumberToString(_fldtedadforooshmax))) { 
RDebugUtils.currentLine=38862873;
 //BA.debugLineNum = 38862873;BA.debugLine="TedadEshantion=fldTedadEshantionMax";
_tedadeshantion = BA.NumberToString(_fldtedadeshantionmax);
 }else 
{RDebugUtils.currentLine=38862874;
 //BA.debugLineNum = 38862874;BA.debugLine="else if TedadSabad > fldTedadForooshMax Then";
if ((double)(Double.parseDouble(_tedadsabad))>_fldtedadforooshmax) { 
RDebugUtils.currentLine=38862875;
 //BA.debugLineNum = 38862875;BA.debugLine="Dim u As Int=0";
_u = (int) (0);
RDebugUtils.currentLine=38862876;
 //BA.debugLineNum = 38862876;BA.debugLine="u=(TedadSabad/fldTedadForooshMax)";
_u = (int) (((double)(Double.parseDouble(_tedadsabad))/(double)_fldtedadforooshmax));
RDebugUtils.currentLine=38862877;
 //BA.debugLineNum = 38862877;BA.debugLine="TedadEshantion=u*fldTedadEshantionMax";
_tedadeshantion = BA.NumberToString(_u*_fldtedadeshantionmax);
 }else 
{RDebugUtils.currentLine=38862878;
 //BA.debugLineNum = 38862878;BA.debugLine="Else If TedadSabad < fldTedadForooshMax Then";
if ((double)(Double.parseDouble(_tedadsabad))<_fldtedadforooshmax) { 
RDebugUtils.currentLine=38862879;
 //BA.debugLineNum = 38862879;BA.debugLine="For i=0 To ListEshantion.Size-2";
{
final int step31 = 1;
final int limit31 = (int) (_listeshantion.getSize()-2);
_i = (int) (0) ;
for (;_i <= limit31 ;_i = _i + step31 ) {
RDebugUtils.currentLine=38862880;
 //BA.debugLineNum = 38862880;BA.debugLine="Dim Item = ListEshantion.Get(i) As AdapterList";
_item = (ir.parsikhesab.pakhsh.mcode._adapterlisteshantion)(_listeshantion.Get(_i));
RDebugUtils.currentLine=38862881;
 //BA.debugLineNum = 38862881;BA.debugLine="Log(Item.fldCodeKalaForoosh)";
anywheresoftware.b4a.keywords.Common.LogImpl("538862881",_item.fldCodeKalaForoosh /*String*/ ,0);
RDebugUtils.currentLine=38862882;
 //BA.debugLineNum = 38862882;BA.debugLine="Log(Item.fldCodeKalaEshantion)";
anywheresoftware.b4a.keywords.Common.LogImpl("538862882",_item.fldCodeKalaEshantion /*String*/ ,0);
RDebugUtils.currentLine=38862883;
 //BA.debugLineNum = 38862883;BA.debugLine="Dim fldTedadForoosh As Int=Item.fldTedadForoos";
_fldtedadforoosh = (int)(Double.parseDouble(_item.fldTedadForoosh /*String*/ ));
RDebugUtils.currentLine=38862884;
 //BA.debugLineNum = 38862884;BA.debugLine="Dim fldTedadEshantion As Int=Item.fldTedadEsha";
_fldtedadeshantion = (int)(Double.parseDouble(_item.fldTedadEshantion /*String*/ ));
RDebugUtils.currentLine=38862885;
 //BA.debugLineNum = 38862885;BA.debugLine="CodeKalaEshantation=Item.fldCodeKalaEshantion";
_codekalaeshantation = _item.fldCodeKalaEshantion /*String*/ ;
RDebugUtils.currentLine=38862886;
 //BA.debugLineNum = 38862886;BA.debugLine="Log(fldTedadForoosh)";
anywheresoftware.b4a.keywords.Common.LogImpl("538862886",BA.NumberToString(_fldtedadforoosh),0);
RDebugUtils.currentLine=38862887;
 //BA.debugLineNum = 38862887;BA.debugLine="Log(Item.fldTedadEshantion)";
anywheresoftware.b4a.keywords.Common.LogImpl("538862887",_item.fldTedadEshantion /*String*/ ,0);
RDebugUtils.currentLine=38862888;
 //BA.debugLineNum = 38862888;BA.debugLine="If TedadSabad= fldTedadForoosh Then";
if ((_tedadsabad).equals(BA.NumberToString(_fldtedadforoosh))) { 
RDebugUtils.currentLine=38862889;
 //BA.debugLineNum = 38862889;BA.debugLine="TedadEshantion=fldTedadEshantion";
_tedadeshantion = BA.NumberToString(_fldtedadeshantion);
 }else 
{RDebugUtils.currentLine=38862890;
 //BA.debugLineNum = 38862890;BA.debugLine="else if TedadSabad>fldTedadForoosh Then";
if ((double)(Double.parseDouble(_tedadsabad))>_fldtedadforoosh) { 
RDebugUtils.currentLine=38862891;
 //BA.debugLineNum = 38862891;BA.debugLine="Dim u As Int=0";
_u = (int) (0);
RDebugUtils.currentLine=38862892;
 //BA.debugLineNum = 38862892;BA.debugLine="u=(TedadSabad/fldTedadForoosh)";
_u = (int) (((double)(Double.parseDouble(_tedadsabad))/(double)_fldtedadforoosh));
RDebugUtils.currentLine=38862893;
 //BA.debugLineNum = 38862893;BA.debugLine="TedadEshantion=u*fldTedadEshantion";
_tedadeshantion = BA.NumberToString(_u*_fldtedadeshantion);
 }else 
{RDebugUtils.currentLine=38862894;
 //BA.debugLineNum = 38862894;BA.debugLine="else if TedadSabad<fldTedadForoosh Then";
if ((double)(Double.parseDouble(_tedadsabad))<_fldtedadforoosh) { 
RDebugUtils.currentLine=38862895;
 //BA.debugLineNum = 38862895;BA.debugLine="TedadEshantion=0";
_tedadeshantion = BA.NumberToString(0);
 }}}
;
 }
};
 }}}
;
RDebugUtils.currentLine=38862899;
 //BA.debugLineNum = 38862899;BA.debugLine="If TedadEshantion>0 Then";
if ((double)(Double.parseDouble(_tedadeshantion))>0) { 
RDebugUtils.currentLine=38862900;
 //BA.debugLineNum = 38862900;BA.debugLine="If SwSearchNumber.Checked Then";
if (mostCurrent._swsearchnumber.getChecked()) { 
RDebugUtils.currentLine=38862901;
 //BA.debugLineNum = 38862901;BA.debugLine="SwSearchNumber.Checked=False";
mostCurrent._swsearchnumber.setChecked(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=38862903;
 //BA.debugLineNum = 38862903;BA.debugLine="TxtSearch.Text=CodeKalaEshantation";
mostCurrent._txtsearch.setText(BA.ObjectToCharSequence(_codekalaeshantation));
RDebugUtils.currentLine=38862904;
 //BA.debugLineNum = 38862904;BA.debugLine="Dim Item1 = ListKalaTxt.Get(0) As AdapterListKa";
_item1 = (ir.parsikhesab.pakhsh.mcode._adapterlistkala)(mostCurrent._listkalatxt.Get((int) (0)));
RDebugUtils.currentLine=38862905;
 //BA.debugLineNum = 38862905;BA.debugLine="Dim rec As CLs_RecDefultKala";
_rec = new ir.parsikhesab.pakhsh.cls_recdefultkala();
RDebugUtils.currentLine=38862906;
 //BA.debugLineNum = 38862906;BA.debugLine="rec.Initialize(Me)";
_rec._initialize /*String*/ (null,mostCurrent.activityBA,act_kaladefault.getObject());
RDebugUtils.currentLine=38862907;
 //BA.debugLineNum = 38862907;BA.debugLine="rec.Show(Item1,0)";
_rec._show /*void*/ (null,_item1,(int) (0));
RDebugUtils.currentLine=38862908;
 //BA.debugLineNum = 38862908;BA.debugLine="Item1.TedadDarSabadJoz=0";
_item1.TedadDarSabadJoz /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=38862909;
 //BA.debugLineNum = 38862909;BA.debugLine="Item1.TedadDarSabadKol=0";
_item1.TedadDarSabadKol /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=38862910;
 //BA.debugLineNum = 38862910;BA.debugLine="Item1.fldCountEshantion=TedadEshantion";
_item1.fldCountEshantion /*String*/  = _tedadeshantion;
RDebugUtils.currentLine=38862912;
 //BA.debugLineNum = 38862912;BA.debugLine="For j=0 To TedadEshantion-1";
{
final int step63 = 1;
final int limit63 = (int) ((double)(Double.parseDouble(_tedadeshantion))-1);
_j = (int) (0) ;
for (;_j <= limit63 ;_j = _j + step63 ) {
RDebugUtils.currentLine=38862913;
 //BA.debugLineNum = 38862913;BA.debugLine="rec.BtnUpEshan_Click";
_rec._btnupeshan_click /*String*/ (null);
 }
};
RDebugUtils.currentLine=38862916;
 //BA.debugLineNum = 38862916;BA.debugLine="MCode.AddToSabad(Item1)";
mostCurrent._mcode._addtosabad /*String*/ (mostCurrent.activityBA,_item1);
RDebugUtils.currentLine=38862917;
 //BA.debugLineNum = 38862917;BA.debugLine="TxtSearch.Text=\"\"";
mostCurrent._txtsearch.setText(BA.ObjectToCharSequence(""));
 };
 };
 } 
       catch (Exception e71) {
			processBA.setLastException(e71);RDebugUtils.currentLine=38862922;
 //BA.debugLineNum = 38862922;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("538862922",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=38862923;
 //BA.debugLineNum = 38862923;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-AddEshantion");
 };
RDebugUtils.currentLine=38862952;
 //BA.debugLineNum = 38862952;BA.debugLine="End Sub";
return "";
}
public static String  _addeshantiongroup(String _codegroup) throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "addeshantiongroup", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "addeshantiongroup", new Object[] {_codegroup}));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
String _tedadsabad = "";
int _i = 0;
String _tedaddarkarton = "";
String _fldtedaddarsabadjoz = "";
String _fldtedaddarsabadkol = "";
String _eshantion = "";
int _tedadkol = 0;
anywheresoftware.b4a.objects.collections.List _listeshantion = null;
ir.parsikhesab.pakhsh.mcode._adapterlisteshantiongroup _itemmax = null;
int _fldtedadforooshmax = 0;
int _fldtedadeshantionmax = 0;
String _tedadeshantion = "";
String _codegroupkalaeshantion = "";
int _u = 0;
ir.parsikhesab.pakhsh.mcode._adapterlisteshantiongroup _item = null;
int _fldtedadforoosh = 0;
int _fldtedadeshantion = 0;
ir.parsikhesab.pakhsh.mcode._adapterlisteshantiongroup _eshant = null;
int _index = 0;
RDebugUtils.currentLine=38469632;
 //BA.debugLineNum = 38469632;BA.debugLine="Sub AddEshantionGroup(CodeGroup As String)";
RDebugUtils.currentLine=38469633;
 //BA.debugLineNum = 38469633;BA.debugLine="Try";
try {RDebugUtils.currentLine=38469636;
 //BA.debugLineNum = 38469636;BA.debugLine="If LblGiftCount.Text=0 Then";
if ((mostCurrent._lblgiftcount.getText()).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=38469637;
 //BA.debugLineNum = 38469637;BA.debugLine="LblGiftCount.Visible=False";
mostCurrent._lblgiftcount.setVisible(anywheresoftware.b4a.keywords.Common.False);
 }else {
RDebugUtils.currentLine=38469639;
 //BA.debugLineNum = 38469639;BA.debugLine="LblGiftCount.Visible=True";
mostCurrent._lblgiftcount.setVisible(anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=38469641;
 //BA.debugLineNum = 38469641;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From T";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblSabad where fldCodeGroup="+_codegroup+"  and fldCodeGroup IN(SELECT tblEshantionGroup.fldCodeGroupKala FROM tblEshantionGroup)");
RDebugUtils.currentLine=38469642;
 //BA.debugLineNum = 38469642;BA.debugLine="If Cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=38469643;
 //BA.debugLineNum = 38469643;BA.debugLine="Dim TedadSabad As String=0";
_tedadsabad = BA.NumberToString(0);
RDebugUtils.currentLine=38469644;
 //BA.debugLineNum = 38469644;BA.debugLine="For i=0 To Cu.RowCount -1";
{
final int step10 = 1;
final int limit10 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit10 ;_i = _i + step10 ) {
RDebugUtils.currentLine=38469645;
 //BA.debugLineNum = 38469645;BA.debugLine="Cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=38469646;
 //BA.debugLineNum = 38469646;BA.debugLine="Dim TedadDarKarton As String =myCode.Is_Null_a";
_tedaddarkarton = mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_cu.GetString("FldTedadDarKarton"));
RDebugUtils.currentLine=38469647;
 //BA.debugLineNum = 38469647;BA.debugLine="Dim FldTedadDarSabadJoz As String =myCode.Is_N";
_fldtedaddarsabadjoz = mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_cu.GetString("FldTedadDarSabadJoz"));
RDebugUtils.currentLine=38469648;
 //BA.debugLineNum = 38469648;BA.debugLine="Dim FldTedadDarSabadKol As String =myCode.Is_N";
_fldtedaddarsabadkol = mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_cu.GetString("FldTedadDarSabadKol"));
RDebugUtils.currentLine=38469649;
 //BA.debugLineNum = 38469649;BA.debugLine="Dim Eshantion As String= Cu.GetString(\"FldEsha";
_eshantion = _cu.GetString("FldEshantion");
RDebugUtils.currentLine=38469651;
 //BA.debugLineNum = 38469651;BA.debugLine="If TedadDarKarton>0 Then";
if ((double)(Double.parseDouble(_tedaddarkarton))>0) { 
RDebugUtils.currentLine=38469652;
 //BA.debugLineNum = 38469652;BA.debugLine="Dim tedadKol As Int=(TedadDarKarton*FldTedadD";
_tedadkol = (int) (((double)(Double.parseDouble(_tedaddarkarton))*(double)(Double.parseDouble(_fldtedaddarsabadkol))));
RDebugUtils.currentLine=38469653;
 //BA.debugLineNum = 38469653;BA.debugLine="TedadSabad =TedadSabad + tedadKol+FldTedadDar";
_tedadsabad = BA.NumberToString((double)(Double.parseDouble(_tedadsabad))+_tedadkol+(double)(Double.parseDouble(_fldtedaddarsabadjoz)));
 }else {
RDebugUtils.currentLine=38469655;
 //BA.debugLineNum = 38469655;BA.debugLine="TedadSabad=TedadSabad + FldTedadDarSabadJoz";
_tedadsabad = BA.NumberToString((double)(Double.parseDouble(_tedadsabad))+(double)(Double.parseDouble(_fldtedaddarsabadjoz)));
 };
 }
};
RDebugUtils.currentLine=38469659;
 //BA.debugLineNum = 38469659;BA.debugLine="Log(CodeGroup)";
anywheresoftware.b4a.keywords.Common.LogImpl("538469659",_codegroup,0);
RDebugUtils.currentLine=38469660;
 //BA.debugLineNum = 38469660;BA.debugLine="Log(TedadSabad)";
anywheresoftware.b4a.keywords.Common.LogImpl("538469660",_tedadsabad,0);
RDebugUtils.currentLine=38469661;
 //BA.debugLineNum = 38469661;BA.debugLine="Dim ListEshantion As List";
_listeshantion = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=38469662;
 //BA.debugLineNum = 38469662;BA.debugLine="ListEshantion.Initialize";
_listeshantion.Initialize();
RDebugUtils.currentLine=38469663;
 //BA.debugLineNum = 38469663;BA.debugLine="ListEshantion=MCode.LoadEshantionGroup(CodeGrou";
_listeshantion = mostCurrent._mcode._loadeshantiongroup /*anywheresoftware.b4a.objects.collections.List*/ (mostCurrent.activityBA,_codegroup);
RDebugUtils.currentLine=38469664;
 //BA.debugLineNum = 38469664;BA.debugLine="If ListEshantion.Size>0 Then";
if (_listeshantion.getSize()>0) { 
RDebugUtils.currentLine=38469665;
 //BA.debugLineNum = 38469665;BA.debugLine="Dim ItemMax = ListEshantion.Get(ListEshantion.";
_itemmax = (ir.parsikhesab.pakhsh.mcode._adapterlisteshantiongroup)(_listeshantion.Get((int) (_listeshantion.getSize()-1)));
RDebugUtils.currentLine=38469666;
 //BA.debugLineNum = 38469666;BA.debugLine="Dim fldTedadForooshMax As Int=ItemMax.fldTedad";
_fldtedadforooshmax = (int)(Double.parseDouble(_itemmax.fldTedadForoosh /*String*/ ));
RDebugUtils.currentLine=38469667;
 //BA.debugLineNum = 38469667;BA.debugLine="Dim fldTedadEshantionMax As Int=ItemMax.fldTed";
_fldtedadeshantionmax = (int)(Double.parseDouble(_itemmax.fldTedadEshantion /*String*/ ));
RDebugUtils.currentLine=38469668;
 //BA.debugLineNum = 38469668;BA.debugLine="Dim TedadEshantion As String=0";
_tedadeshantion = BA.NumberToString(0);
RDebugUtils.currentLine=38469669;
 //BA.debugLineNum = 38469669;BA.debugLine="Dim CodeGroupKalaEshantion As String=0";
_codegroupkalaeshantion = BA.NumberToString(0);
RDebugUtils.currentLine=38469670;
 //BA.debugLineNum = 38469670;BA.debugLine="CodeGroupKalaEshantion=ItemMax.fldCodeGroupKal";
_codegroupkalaeshantion = _itemmax.fldCodeGroupKalaEshantion /*String*/ ;
RDebugUtils.currentLine=38469671;
 //BA.debugLineNum = 38469671;BA.debugLine="If TedadSabad=fldTedadForooshMax Then";
if ((_tedadsabad).equals(BA.NumberToString(_fldtedadforooshmax))) { 
RDebugUtils.currentLine=38469672;
 //BA.debugLineNum = 38469672;BA.debugLine="TedadEshantion=fldTedadEshantionMax";
_tedadeshantion = BA.NumberToString(_fldtedadeshantionmax);
 }else 
{RDebugUtils.currentLine=38469673;
 //BA.debugLineNum = 38469673;BA.debugLine="else if TedadSabad > fldTedadForooshMax Then";
if ((double)(Double.parseDouble(_tedadsabad))>_fldtedadforooshmax) { 
RDebugUtils.currentLine=38469674;
 //BA.debugLineNum = 38469674;BA.debugLine="Dim u As Int=0";
_u = (int) (0);
RDebugUtils.currentLine=38469675;
 //BA.debugLineNum = 38469675;BA.debugLine="u=(TedadSabad/fldTedadForooshMax)";
_u = (int) (((double)(Double.parseDouble(_tedadsabad))/(double)_fldtedadforooshmax));
RDebugUtils.currentLine=38469676;
 //BA.debugLineNum = 38469676;BA.debugLine="TedadEshantion=u*fldTedadEshantionMax";
_tedadeshantion = BA.NumberToString(_u*_fldtedadeshantionmax);
 }else 
{RDebugUtils.currentLine=38469677;
 //BA.debugLineNum = 38469677;BA.debugLine="Else If TedadSabad < fldTedadForooshMax Then";
if ((double)(Double.parseDouble(_tedadsabad))<_fldtedadforooshmax) { 
RDebugUtils.currentLine=38469678;
 //BA.debugLineNum = 38469678;BA.debugLine="For i=0 To ListEshantion.Size-2";
{
final int step42 = 1;
final int limit42 = (int) (_listeshantion.getSize()-2);
_i = (int) (0) ;
for (;_i <= limit42 ;_i = _i + step42 ) {
RDebugUtils.currentLine=38469679;
 //BA.debugLineNum = 38469679;BA.debugLine="Dim Item = ListEshantion.Get(i) As AdapterLi";
_item = (ir.parsikhesab.pakhsh.mcode._adapterlisteshantiongroup)(_listeshantion.Get(_i));
RDebugUtils.currentLine=38469680;
 //BA.debugLineNum = 38469680;BA.debugLine="Log(Item.fldCodeGroupKala)";
anywheresoftware.b4a.keywords.Common.LogImpl("538469680",_item.fldCodeGroupKala /*String*/ ,0);
RDebugUtils.currentLine=38469681;
 //BA.debugLineNum = 38469681;BA.debugLine="Log(Item.fldCodeGroupKalaEshantion)";
anywheresoftware.b4a.keywords.Common.LogImpl("538469681",_item.fldCodeGroupKalaEshantion /*String*/ ,0);
RDebugUtils.currentLine=38469682;
 //BA.debugLineNum = 38469682;BA.debugLine="Dim fldTedadForoosh As Int=Item.fldTedadForo";
_fldtedadforoosh = (int)(Double.parseDouble(_item.fldTedadForoosh /*String*/ ));
RDebugUtils.currentLine=38469683;
 //BA.debugLineNum = 38469683;BA.debugLine="Dim fldTedadEshantion As Int=Item.fldTedadEs";
_fldtedadeshantion = (int)(Double.parseDouble(_item.fldTedadEshantion /*String*/ ));
RDebugUtils.currentLine=38469684;
 //BA.debugLineNum = 38469684;BA.debugLine="CodeGroupKalaEshantion=Item.fldCodeGroupKala";
_codegroupkalaeshantion = _item.fldCodeGroupKalaEshantion /*String*/ ;
RDebugUtils.currentLine=38469685;
 //BA.debugLineNum = 38469685;BA.debugLine="Log(fldTedadForoosh)";
anywheresoftware.b4a.keywords.Common.LogImpl("538469685",BA.NumberToString(_fldtedadforoosh),0);
RDebugUtils.currentLine=38469686;
 //BA.debugLineNum = 38469686;BA.debugLine="Log(Item.fldTedadEshantion)";
anywheresoftware.b4a.keywords.Common.LogImpl("538469686",_item.fldTedadEshantion /*String*/ ,0);
RDebugUtils.currentLine=38469687;
 //BA.debugLineNum = 38469687;BA.debugLine="If TedadSabad= fldTedadForoosh Then";
if ((_tedadsabad).equals(BA.NumberToString(_fldtedadforoosh))) { 
RDebugUtils.currentLine=38469688;
 //BA.debugLineNum = 38469688;BA.debugLine="TedadEshantion=fldTedadEshantion";
_tedadeshantion = BA.NumberToString(_fldtedadeshantion);
 }else 
{RDebugUtils.currentLine=38469689;
 //BA.debugLineNum = 38469689;BA.debugLine="else if TedadSabad>fldTedadForoosh Then";
if ((double)(Double.parseDouble(_tedadsabad))>_fldtedadforoosh) { 
RDebugUtils.currentLine=38469690;
 //BA.debugLineNum = 38469690;BA.debugLine="Dim u As Int=0";
_u = (int) (0);
RDebugUtils.currentLine=38469691;
 //BA.debugLineNum = 38469691;BA.debugLine="u=(TedadSabad/fldTedadForoosh)";
_u = (int) (((double)(Double.parseDouble(_tedadsabad))/(double)_fldtedadforoosh));
RDebugUtils.currentLine=38469692;
 //BA.debugLineNum = 38469692;BA.debugLine="TedadEshantion=u*fldTedadEshantion";
_tedadeshantion = BA.NumberToString(_u*_fldtedadeshantion);
 }else 
{RDebugUtils.currentLine=38469693;
 //BA.debugLineNum = 38469693;BA.debugLine="else if TedadSabad<fldTedadForoosh Then";
if ((double)(Double.parseDouble(_tedadsabad))<_fldtedadforoosh) { 
RDebugUtils.currentLine=38469694;
 //BA.debugLineNum = 38469694;BA.debugLine="TedadEshantion=0";
_tedadeshantion = BA.NumberToString(0);
 }}}
;
 }
};
 }}}
;
RDebugUtils.currentLine=38469698;
 //BA.debugLineNum = 38469698;BA.debugLine="If TedadEshantion>0 Then";
if ((double)(Double.parseDouble(_tedadeshantion))>0) { 
RDebugUtils.currentLine=38469699;
 //BA.debugLineNum = 38469699;BA.debugLine="Dim Eshant As AdapterListEshantionGroup";
_eshant = new ir.parsikhesab.pakhsh.mcode._adapterlisteshantiongroup();
RDebugUtils.currentLine=38469700;
 //BA.debugLineNum = 38469700;BA.debugLine="Eshant.fldCodeGroupKala=CodeGroup";
_eshant.fldCodeGroupKala /*String*/  = _codegroup;
RDebugUtils.currentLine=38469701;
 //BA.debugLineNum = 38469701;BA.debugLine="Eshant.fldCodeGroupKalaEshantion=CodeGroupKal";
_eshant.fldCodeGroupKalaEshantion /*String*/  = _codegroupkalaeshantion;
RDebugUtils.currentLine=38469702;
 //BA.debugLineNum = 38469702;BA.debugLine="Eshant.fldTedadForoosh=fldTedadForoosh";
_eshant.fldTedadForoosh /*String*/  = BA.NumberToString(_fldtedadforoosh);
RDebugUtils.currentLine=38469703;
 //BA.debugLineNum = 38469703;BA.debugLine="Eshant.fldTedadEshantion=TedadEshantion";
_eshant.fldTedadEshantion /*String*/  = _tedadeshantion;
RDebugUtils.currentLine=38469704;
 //BA.debugLineNum = 38469704;BA.debugLine="Log(CodeGroupKalaEshantion)";
anywheresoftware.b4a.keywords.Common.LogImpl("538469704",_codegroupkalaeshantion,0);
RDebugUtils.currentLine=38469705;
 //BA.debugLineNum = 38469705;BA.debugLine="Log(TedadEshantion)";
anywheresoftware.b4a.keywords.Common.LogImpl("538469705",_tedadeshantion,0);
RDebugUtils.currentLine=38469707;
 //BA.debugLineNum = 38469707;BA.debugLine="MCode.SaveUpdate(\"Delete from tblEshantionGro";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Delete from tblEshantionGroupTemp where fldCodeGroupKala='"+_codegroup+"'");
RDebugUtils.currentLine=38469708;
 //BA.debugLineNum = 38469708;BA.debugLine="MCode.SaveUpdate($\"Insert into tblEshantionGr";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,("Insert into tblEshantionGroupTemp(fldCodeGroupKala, fldCodeGroupKalaEshantion ,fldTedadEshantion) Values('"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_codegroup))+"','"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_codegroupkalaeshantion))+"','"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tedadeshantion))+"')"));
RDebugUtils.currentLine=38469709;
 //BA.debugLineNum = 38469709;BA.debugLine="Dim index As Int=CheckGroupForEshantation(Cod";
_index = _checkgroupforeshantation(_codegroup,_codegroupkalaeshantion);
RDebugUtils.currentLine=38469710;
 //BA.debugLineNum = 38469710;BA.debugLine="If index>-1 Then";
if (_index>-1) { 
RDebugUtils.currentLine=38469711;
 //BA.debugLineNum = 38469711;BA.debugLine="lstEshantionGroup.RemoveAt(index)";
mostCurrent._lsteshantiongroup.RemoveAt(_index);
 };
RDebugUtils.currentLine=38469714;
 //BA.debugLineNum = 38469714;BA.debugLine="lstEshantionGroup.Add(Eshant)";
mostCurrent._lsteshantiongroup.Add((Object)(_eshant));
 }else {
RDebugUtils.currentLine=38469716;
 //BA.debugLineNum = 38469716;BA.debugLine="MCode.SaveUpdate(\"Delete from tblEshantionGro";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Delete from tblEshantionGroupTemp where fldCodeGroupKala='"+_codegroup+"'");
 };
 };
 }else {
RDebugUtils.currentLine=38469722;
 //BA.debugLineNum = 38469722;BA.debugLine="MCode.SaveUpdate(\"Delete from tblEshantionGroup";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Delete from tblEshantionGroupTemp where fldCodeGroupKala='"+_codegroup+"'");
 };
RDebugUtils.currentLine=38469724;
 //BA.debugLineNum = 38469724;BA.debugLine="RefreshCountEshantionGroup";
_refreshcounteshantiongroup();
RDebugUtils.currentLine=38469725;
 //BA.debugLineNum = 38469725;BA.debugLine="If Table1.IsInitialized Then";
if (mostCurrent._table1.IsInitialized /*boolean*/ ()) { 
RDebugUtils.currentLine=38469726;
 //BA.debugLineNum = 38469726;BA.debugLine="Grid";
_grid();
 };
 } 
       catch (Exception e89) {
			processBA.setLastException(e89);RDebugUtils.currentLine=38469730;
 //BA.debugLineNum = 38469730;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("538469730",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 };
RDebugUtils.currentLine=38469732;
 //BA.debugLineNum = 38469732;BA.debugLine="End Sub";
return "";
}
public static int  _checkgroupforeshantation(String _codegroup,String _codegroupeshantion) throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "checkgroupforeshantation", false))
	 {return ((Integer) Debug.delegate(mostCurrent.activityBA, "checkgroupforeshantation", new Object[] {_codegroup,_codegroupeshantion}));}
int _i = 0;
ir.parsikhesab.pakhsh.mcode._adapterlisteshantiongroup _item = null;
RDebugUtils.currentLine=38600704;
 //BA.debugLineNum = 38600704;BA.debugLine="Public Sub CheckGroupForEshantation(CodeGroup As S";
RDebugUtils.currentLine=38600705;
 //BA.debugLineNum = 38600705;BA.debugLine="For i=0 To lstEshantionGroup.Size-1";
{
final int step1 = 1;
final int limit1 = (int) (mostCurrent._lsteshantiongroup.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=38600706;
 //BA.debugLineNum = 38600706;BA.debugLine="Dim Item = lstEshantionGroup.Get(i) As AdapterLi";
_item = (ir.parsikhesab.pakhsh.mcode._adapterlisteshantiongroup)(mostCurrent._lsteshantiongroup.Get(_i));
RDebugUtils.currentLine=38600707;
 //BA.debugLineNum = 38600707;BA.debugLine="If Item.fldCodeGroupKala=CodeGroup And Item.fldC";
if ((_item.fldCodeGroupKala /*String*/ ).equals(_codegroup) && (_item.fldCodeGroupKalaEshantion /*String*/ ).equals(_codegroupeshantion)) { 
RDebugUtils.currentLine=38600709;
 //BA.debugLineNum = 38600709;BA.debugLine="Return i";
if (true) return _i;
 };
 }
};
RDebugUtils.currentLine=38600712;
 //BA.debugLineNum = 38600712;BA.debugLine="Return -1";
if (true) return (int) (-1);
RDebugUtils.currentLine=38600713;
 //BA.debugLineNum = 38600713;BA.debugLine="End Sub";
return 0;
}
public static String  _refreshcounteshantiongroup() throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "refreshcounteshantiongroup", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "refreshcounteshantiongroup", null));}
int _count = 0;
RDebugUtils.currentLine=38666240;
 //BA.debugLineNum = 38666240;BA.debugLine="Public Sub RefreshCountEshantionGroup";
RDebugUtils.currentLine=38666241;
 //BA.debugLineNum = 38666241;BA.debugLine="Dim Count As Int=0";
_count = (int) (0);
RDebugUtils.currentLine=38666242;
 //BA.debugLineNum = 38666242;BA.debugLine="Count=myCode.Is_Null_adad(MCode.SingleResult(\"Sel";
_count = (int)(Double.parseDouble(mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,BA.ObjectToString(mostCurrent._mcode._singleresult /*Object*/ (mostCurrent.activityBA,"Select Sum(fldTedadEshantion) from tblEshantionGroupTemp")))));
RDebugUtils.currentLine=38666243;
 //BA.debugLineNum = 38666243;BA.debugLine="If Count>0 Then";
if (_count>0) { 
RDebugUtils.currentLine=38666244;
 //BA.debugLineNum = 38666244;BA.debugLine="LblGiftCount.Text=Count";
mostCurrent._lblgiftcount.setText(BA.ObjectToCharSequence(_count));
RDebugUtils.currentLine=38666245;
 //BA.debugLineNum = 38666245;BA.debugLine="LblGiftCount.Visible=True";
mostCurrent._lblgiftcount.setVisible(anywheresoftware.b4a.keywords.Common.True);
 }else {
RDebugUtils.currentLine=38666247;
 //BA.debugLineNum = 38666247;BA.debugLine="LblGiftCount.Text=0";
mostCurrent._lblgiftcount.setText(BA.ObjectToCharSequence(0));
RDebugUtils.currentLine=38666248;
 //BA.debugLineNum = 38666248;BA.debugLine="LblGiftCount.Visible=False";
mostCurrent._lblgiftcount.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=38666250;
 //BA.debugLineNum = 38666250;BA.debugLine="End Sub";
return "";
}
public static String  _grid() throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "grid", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "grid", null));}
anywheresoftware.b4a.objects.collections.List _lst_colnametitle = null;
RDebugUtils.currentLine=39714816;
 //BA.debugLineNum = 39714816;BA.debugLine="Sub Grid";
RDebugUtils.currentLine=39714817;
 //BA.debugLineNum = 39714817;BA.debugLine="Dim Lst_ColNameTitle As List";
_lst_colnametitle = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=39714818;
 //BA.debugLineNum = 39714818;BA.debugLine="Lst_ColNameTitle.Initialize";
_lst_colnametitle.Initialize();
RDebugUtils.currentLine=39714820;
 //BA.debugLineNum = 39714820;BA.debugLine="Lst_ColNameTitle.AddAll(Array As String(\"ردیف\",\"ک";
_lst_colnametitle.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"ردیف","کد گروه","نام گروه","کد گروه اشانتیون","نام گروه اشانتیون","تعداد اشانتیون"}));
RDebugUtils.currentLine=39714823;
 //BA.debugLineNum = 39714823;BA.debugLine="Table1.LoadEshantionGroupList(lstEshantionGroup,L";
mostCurrent._table1._loadeshantiongrouplist /*String*/ (null,mostCurrent._lsteshantiongroup,_lst_colnametitle,(int) (6));
RDebugUtils.currentLine=39714826;
 //BA.debugLineNum = 39714826;BA.debugLine="Table1.SetColumnsWidths(Array As Int(50dip,50dip,";
mostCurrent._table1._setcolumnswidths /*String*/ (null,new int[]{anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (66)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (66)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50))});
RDebugUtils.currentLine=39714829;
 //BA.debugLineNum = 39714829;BA.debugLine="End Sub";
return "";
}
public static String  _addtosabad(ir.parsikhesab.pakhsh.mcode._adapterlistkala _item) throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "addtosabad", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "addtosabad", new Object[] {_item}));}
String _tedadkol = "";
String _feekol = "";
ir.parsikhesab.pakhsh.cls_recdefultkala _rec = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
boolean _check = false;
int _i = 0;
boolean _ishas = false;
int _c = 0;
ir.parsikhesab.pakhsh.mcode._adapterchangefeekala _item2 = null;
RDebugUtils.currentLine=38338560;
 //BA.debugLineNum = 38338560;BA.debugLine="Sub AddToSabad(Item As AdapterListKala)";
RDebugUtils.currentLine=38338561;
 //BA.debugLineNum = 38338561;BA.debugLine="Try";
try {RDebugUtils.currentLine=38338562;
 //BA.debugLineNum = 38338562;BA.debugLine="If myCode.Is_Null_adad(Item.fldDarsadTakhfif)>0";
if ((double)(Double.parseDouble(mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_item.fldDarsadTakhfif /*String*/ )))>0) { 
RDebugUtils.currentLine=38338563;
 //BA.debugLineNum = 38338563;BA.debugLine="Dim tedadKol As String=myCode.Is_Null_adad(Item";
_tedadkol = BA.NumberToString((double)(Double.parseDouble(mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_item.TedadDarSabadJoz /*String*/ )))+((double)(Double.parseDouble(mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_item.TedadDarSabadKol /*String*/ )))*(double)(Double.parseDouble(mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_item.TedadDarKarton /*String*/ )))));
RDebugUtils.currentLine=38338564;
 //BA.debugLineNum = 38338564;BA.debugLine="Dim FeeKol As String=(Item.FeeForoosh*tedadKol)";
_feekol = BA.NumberToString((_item.FeeForoosh /*int*/ *(double)(Double.parseDouble(_tedadkol))));
RDebugUtils.currentLine=38338565;
 //BA.debugLineNum = 38338565;BA.debugLine="If tedadKol>0 Then";
if ((double)(Double.parseDouble(_tedadkol))>0) { 
RDebugUtils.currentLine=38338566;
 //BA.debugLineNum = 38338566;BA.debugLine="Item.MablaghTakhfif=(((Item.FeeForoosh*tedadKo";
_item.MablaghTakhfif /*int*/  = (int) ((((_item.FeeForoosh /*int*/ *(double)(Double.parseDouble(_tedadkol)))*(double)(Double.parseDouble(_item.fldDarsadTakhfif /*String*/ )))/(double)100));
RDebugUtils.currentLine=38338567;
 //BA.debugLineNum = 38338567;BA.debugLine="Item.fldFeeBadAzTakhfif=FeeKol-Item.MablaghTak";
_item.fldFeeBadAzTakhfif /*String*/  = BA.NumberToString((double)(Double.parseDouble(_feekol))-_item.MablaghTakhfif /*int*/ );
 }else {
RDebugUtils.currentLine=38338569;
 //BA.debugLineNum = 38338569;BA.debugLine="If myCode.Is_Null_adad(Item.fldDarsadTakhfif)>";
if ((double)(Double.parseDouble(mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_item.fldDarsadTakhfif /*String*/ )))>0) { 
RDebugUtils.currentLine=38338570;
 //BA.debugLineNum = 38338570;BA.debugLine="Item.MablaghTakhfif=(((Item.FeeForoosh)*Item.";
_item.MablaghTakhfif /*int*/  = (int) ((((_item.FeeForoosh /*int*/ )*(double)(Double.parseDouble(_item.fldDarsadTakhfif /*String*/ )))/(double)100));
RDebugUtils.currentLine=38338571;
 //BA.debugLineNum = 38338571;BA.debugLine="Item.fldFeeBadAzTakhfif=Item.FeeForoosh-Item.";
_item.fldFeeBadAzTakhfif /*String*/  = BA.NumberToString(_item.FeeForoosh /*int*/ -_item.MablaghTakhfif /*int*/ );
 };
 };
 };
RDebugUtils.currentLine=38338577;
 //BA.debugLineNum = 38338577;BA.debugLine="Dim rec As CLs_RecDefultKala";
_rec = new ir.parsikhesab.pakhsh.cls_recdefultkala();
RDebugUtils.currentLine=38338578;
 //BA.debugLineNum = 38338578;BA.debugLine="rec.Initialize(Me)";
_rec._initialize /*String*/ (null,mostCurrent.activityBA,act_kaladefault.getObject());
RDebugUtils.currentLine=38338579;
 //BA.debugLineNum = 38338579;BA.debugLine="rec.Show(Item,0)";
_rec._show /*void*/ (null,_item,(int) (0));
RDebugUtils.currentLine=38338580;
 //BA.debugLineNum = 38338580;BA.debugLine="FeeKol=rec.CheckArzeshAfzode";
_feekol = _rec._checkarzeshafzode /*String*/ (null);
RDebugUtils.currentLine=38338582;
 //BA.debugLineNum = 38338582;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From Tb";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblSabad");
RDebugUtils.currentLine=38338583;
 //BA.debugLineNum = 38338583;BA.debugLine="Dim Check As Boolean";
_check = false;
RDebugUtils.currentLine=38338584;
 //BA.debugLineNum = 38338584;BA.debugLine="For i=0 To Cu.RowCount -1";
{
final int step21 = 1;
final int limit21 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit21 ;_i = _i + step21 ) {
RDebugUtils.currentLine=38338585;
 //BA.debugLineNum = 38338585;BA.debugLine="Cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=38338586;
 //BA.debugLineNum = 38338586;BA.debugLine="If Cu.GetString(\"FldCodeKala\") = Item.CodeKala T";
if ((_cu.GetString("FldCodeKala")).equals(_item.CodeKala /*String*/ )) { 
RDebugUtils.currentLine=38338587;
 //BA.debugLineNum = 38338587;BA.debugLine="If Item.TedadDarSabadJoz = 0 And Item.TedadDarS";
if ((_item.TedadDarSabadJoz /*String*/ ).equals(BA.NumberToString(0)) && (_item.TedadDarSabadKol /*String*/ ).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=38338588;
 //BA.debugLineNum = 38338588;BA.debugLine="MCode.SaveUpdate(\"Delete From TblSabad Where";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Delete From TblSabad Where FldCodeKala = '"+_item.CodeKala /*String*/ +"'");
RDebugUtils.currentLine=38338589;
 //BA.debugLineNum = 38338589;BA.debugLine="Dim ishas As Boolean=False";
_ishas = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=38338590;
 //BA.debugLineNum = 38338590;BA.debugLine="Dim c As Int=0";
_c = (int) (0);
RDebugUtils.currentLine=38338591;
 //BA.debugLineNum = 38338591;BA.debugLine="For i=0 To MCode.lstChangeFeeKala.Size-1";
{
final int step28 = 1;
final int limit28 = (int) (mostCurrent._mcode._lstchangefeekala /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit28 ;_i = _i + step28 ) {
RDebugUtils.currentLine=38338592;
 //BA.debugLineNum = 38338592;BA.debugLine="Dim Item2 = MCode.lstChangeFeeKala.Get(i) As";
_item2 = (ir.parsikhesab.pakhsh.mcode._adapterchangefeekala)(mostCurrent._mcode._lstchangefeekala /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=38338593;
 //BA.debugLineNum = 38338593;BA.debugLine="If Item2.FldCodKala=Item.CodeKala Then";
if ((_item2.FldCodKala /*String*/ ).equals(_item.CodeKala /*String*/ )) { 
RDebugUtils.currentLine=38338594;
 //BA.debugLineNum = 38338594;BA.debugLine="ishas=True";
_ishas = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=38338595;
 //BA.debugLineNum = 38338595;BA.debugLine="c=i";
_c = _i;
RDebugUtils.currentLine=38338596;
 //BA.debugLineNum = 38338596;BA.debugLine="Exit";
if (true) break;
 }else {
RDebugUtils.currentLine=38338598;
 //BA.debugLineNum = 38338598;BA.debugLine="ishas=False";
_ishas = anywheresoftware.b4a.keywords.Common.False;
 };
 }
};
RDebugUtils.currentLine=38338602;
 //BA.debugLineNum = 38338602;BA.debugLine="If ishas Then";
if (_ishas) { 
RDebugUtils.currentLine=38338603;
 //BA.debugLineNum = 38338603;BA.debugLine="MCode.lstChangeFeeKala.RemoveAt(c)";
mostCurrent._mcode._lstchangefeekala /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(_c);
 };
 }else {
RDebugUtils.currentLine=38338609;
 //BA.debugLineNum = 38338609;BA.debugLine="MCode.SaveUpdate(\"Update TblSabad Set FldTeda";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Update TblSabad Set FldTedadDarSabadJoz = '"+_item.TedadDarSabadJoz /*String*/ +"',FldTedadDarSabadKol = '"+_item.TedadDarSabadKol /*String*/ +"',FldMablaghTakhfif = '"+BA.NumberToString(_item.MablaghTakhfif /*int*/ )+"',FldDarsadTakhfif = '"+mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_item.fldDarsadTakhfif /*String*/ )+"',fldFeeBadAzTakhfif = '"+mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_item.fldFeeBadAzTakhfif /*String*/ )+"',FldEshantion = '"+_item.FldEshantion /*String*/ +"',fldArzeshAfzode='"+_item.fldArzeshAfzodeKala /*String*/ +"',fldDarsadArzeshAfzode='"+_item.fldDarsadArzeshAfzodeKala /*String*/ +"' Where FldCodeKala = '"+_item.CodeKala /*String*/ +"'");
 };
RDebugUtils.currentLine=38338612;
 //BA.debugLineNum = 38338612;BA.debugLine="Check = True";
_check = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=38338613;
 //BA.debugLineNum = 38338613;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=38338616;
 //BA.debugLineNum = 38338616;BA.debugLine="If Check = False Then";
if (_check==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=38338617;
 //BA.debugLineNum = 38338617;BA.debugLine="MCode.AddToSabad(Item)";
mostCurrent._mcode._addtosabad /*String*/ (mostCurrent.activityBA,_item);
 };
RDebugUtils.currentLine=38338619;
 //BA.debugLineNum = 38338619;BA.debugLine="RefreshLblSabad";
_refreshlblsabad();
 } 
       catch (Exception e53) {
			processBA.setLastException(e53);RDebugUtils.currentLine=38338621;
 //BA.debugLineNum = 38338621;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("538338621",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=38338622;
 //BA.debugLineNum = 38338622;BA.debugLine="Log(LastException.Message)";
anywheresoftware.b4a.keywords.Common.LogImpl("538338622",anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getMessage(),0);
RDebugUtils.currentLine=38338626;
 //BA.debugLineNum = 38338626;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-AddToSabad");
 };
RDebugUtils.currentLine=38338629;
 //BA.debugLineNum = 38338629;BA.debugLine="End Sub";
return "";
}
public static boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "application_error", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "application_error", new Object[] {_error,_stacktrace}));}
RDebugUtils.currentLine=39190528;
 //BA.debugLineNum = 39190528;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
RDebugUtils.currentLine=39190529;
 //BA.debugLineNum = 39190529;BA.debugLine="Log(\"Error KalaDefault: \"&Error)";
anywheresoftware.b4a.keywords.Common.LogImpl("539190529","Error KalaDefault: "+BA.ObjectToString(_error),0);
RDebugUtils.currentLine=39190531;
 //BA.debugLineNum = 39190531;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=39190532;
 //BA.debugLineNum = 39190532;BA.debugLine="End Sub";
return false;
}
public static String  _close() throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "close", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "close", null));}
RDebugUtils.currentLine=36962304;
 //BA.debugLineNum = 36962304;BA.debugLine="Sub close";
RDebugUtils.currentLine=36962305;
 //BA.debugLineNum = 36962305;BA.debugLine="MCode.lstChangeFeeKala.Clear";
mostCurrent._mcode._lstchangefeekala /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=36962306;
 //BA.debugLineNum = 36962306;BA.debugLine="FeeTip=0";
_feetip = BA.NumberToString(0);
RDebugUtils.currentLine=36962307;
 //BA.debugLineNum = 36962307;BA.debugLine="MCode.isAmani=0";
mostCurrent._mcode._isamani /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=36962308;
 //BA.debugLineNum = 36962308;BA.debugLine="MCode.feeTip=0";
mostCurrent._mcode._feetip /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=36962309;
 //BA.debugLineNum = 36962309;BA.debugLine="MCode.C_Tafzili=0";
mostCurrent._mcode._c_tafzili /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=36962310;
 //BA.debugLineNum = 36962310;BA.debugLine="MCode.C_LayeKala=\"\"";
mostCurrent._mcode._c_layekala /*String*/  = "";
RDebugUtils.currentLine=36962311;
 //BA.debugLineNum = 36962311;BA.debugLine="MCode.MandeEtebar=0";
mostCurrent._mcode._mandeetebar /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=36962312;
 //BA.debugLineNum = 36962312;BA.debugLine="MCode.ManedEtebarEnable=False";
mostCurrent._mcode._manedetebarenable /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=36962313;
 //BA.debugLineNum = 36962313;BA.debugLine="CallSub(ImageDownloader, \"ActivityIsPaused\")";
anywheresoftware.b4a.keywords.Common.CallSubDebug(processBA,(Object)(mostCurrent._imagedownloader.getObject()),"ActivityIsPaused");
RDebugUtils.currentLine=36962314;
 //BA.debugLineNum = 36962314;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=36962315;
 //BA.debugLineNum = 36962315;BA.debugLine="End Sub";
return "";
}
public static String  _btn_discount_click(ir.parsikhesab.pakhsh.mcode._adapterlistkala _item) throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_discount_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_discount_click", new Object[] {_item}));}
RDebugUtils.currentLine=38141952;
 //BA.debugLineNum = 38141952;BA.debugLine="Sub btn_discount_Click(Item As AdapterListKala)";
RDebugUtils.currentLine=38141953;
 //BA.debugLineNum = 38141953;BA.debugLine="Try";
try {RDebugUtils.currentLine=38141954;
 //BA.debugLineNum = 38141954;BA.debugLine="PnlDarsadTakhfif.Visible=True";
mostCurrent._pnldarsadtakhfif.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=38141955;
 //BA.debugLineNum = 38141955;BA.debugLine="FeeType=\"btn_discount_Click\"";
mostCurrent._feetype = "btn_discount_Click";
RDebugUtils.currentLine=38141956;
 //BA.debugLineNum = 38141956;BA.debugLine="ItemSelected=Item";
mostCurrent._itemselected = _item;
RDebugUtils.currentLine=38141957;
 //BA.debugLineNum = 38141957;BA.debugLine="lblTitle.Text=\"مبلغ تخفیف را وارد کنید\"";
mostCurrent._lbltitle.setText(BA.ObjectToCharSequence("مبلغ تخفیف را وارد کنید"));
RDebugUtils.currentLine=38141958;
 //BA.debugLineNum = 38141958;BA.debugLine="txtFee.Hint=\"مبلغ را وارد نمایید\"";
mostCurrent._txtfee.setHint("مبلغ را وارد نمایید");
RDebugUtils.currentLine=38141959;
 //BA.debugLineNum = 38141959;BA.debugLine="PnlFee.Visible=True";
mostCurrent._pnlfee.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=38141960;
 //BA.debugLineNum = 38141960;BA.debugLine="MCode.AnimationOpen(PnlFee)";
mostCurrent._mcode._animationopen /*String*/ (mostCurrent.activityBA,(Object)(mostCurrent._pnlfee.getObject()));
 } 
       catch (Exception e10) {
			processBA.setLastException(e10);RDebugUtils.currentLine=38142004;
 //BA.debugLineNum = 38142004;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("538142004",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=38142005;
 //BA.debugLineNum = 38142005;BA.debugLine="myCode.SendError(LastException.Message,Activity.";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getMessage(),BA.ObjectToString(mostCurrent._activity.getTitle())+"-btn_discount_Click");
 };
RDebugUtils.currentLine=38142008;
 //BA.debugLineNum = 38142008;BA.debugLine="End Sub";
return "";
}
public static String  _btn_edit_price_click(ir.parsikhesab.pakhsh.mcode._adapterlistkala _item) throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_edit_price_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_edit_price_click", new Object[] {_item}));}
RDebugUtils.currentLine=37945344;
 //BA.debugLineNum = 37945344;BA.debugLine="Sub btn_edit_Price_Click(Item As AdapterListKala)";
RDebugUtils.currentLine=37945345;
 //BA.debugLineNum = 37945345;BA.debugLine="Try";
try {RDebugUtils.currentLine=37945346;
 //BA.debugLineNum = 37945346;BA.debugLine="PnlDarsadTakhfif.Visible=False";
mostCurrent._pnldarsadtakhfif.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=37945347;
 //BA.debugLineNum = 37945347;BA.debugLine="FeeType=\"btn_edit_Price_Click\"";
mostCurrent._feetype = "btn_edit_Price_Click";
RDebugUtils.currentLine=37945348;
 //BA.debugLineNum = 37945348;BA.debugLine="ItemSelected=Item";
mostCurrent._itemselected = _item;
RDebugUtils.currentLine=37945349;
 //BA.debugLineNum = 37945349;BA.debugLine="lblTitle.Text=\"قیمت جدید را وارد کنید\"";
mostCurrent._lbltitle.setText(BA.ObjectToCharSequence("قیمت جدید را وارد کنید"));
RDebugUtils.currentLine=37945350;
 //BA.debugLineNum = 37945350;BA.debugLine="txtFee.Hint=\"مبلغ را وارد نمایید\"";
mostCurrent._txtfee.setHint("مبلغ را وارد نمایید");
RDebugUtils.currentLine=37945351;
 //BA.debugLineNum = 37945351;BA.debugLine="PnlFee.Visible=True";
mostCurrent._pnlfee.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=37945352;
 //BA.debugLineNum = 37945352;BA.debugLine="MCode.AnimationOpen(PnlFee)";
mostCurrent._mcode._animationopen /*String*/ (mostCurrent.activityBA,(Object)(mostCurrent._pnlfee.getObject()));
 } 
       catch (Exception e10) {
			processBA.setLastException(e10);RDebugUtils.currentLine=37945389;
 //BA.debugLineNum = 37945389;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("537945389",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=37945390;
 //BA.debugLineNum = 37945390;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-btn_edit_Price_Click");
 };
RDebugUtils.currentLine=37945393;
 //BA.debugLineNum = 37945393;BA.debugLine="End Sub";
return "";
}
public static String  _btncloseeshantiongroup_click() throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btncloseeshantiongroup_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btncloseeshantiongroup_click", null));}
RDebugUtils.currentLine=39780352;
 //BA.debugLineNum = 39780352;BA.debugLine="Private Sub btnCloseEshantionGroup_Click";
RDebugUtils.currentLine=39780353;
 //BA.debugLineNum = 39780353;BA.debugLine="PnlEshantion.Visible=False";
mostCurrent._pnleshantion.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=39780354;
 //BA.debugLineNum = 39780354;BA.debugLine="End Sub";
return "";
}
public static String  _btncloserestorpnl_click() throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btncloserestorpnl_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btncloserestorpnl_click", null));}
RDebugUtils.currentLine=38928384;
 //BA.debugLineNum = 38928384;BA.debugLine="Sub btnCloseRestorpnl_Click";
RDebugUtils.currentLine=38928386;
 //BA.debugLineNum = 38928386;BA.debugLine="End Sub";
return "";
}
public static String  _btncommentexit_click() throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btncommentexit_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btncommentexit_click", null));}
RDebugUtils.currentLine=36700160;
 //BA.debugLineNum = 36700160;BA.debugLine="Sub BtnCommentExit_Click";
RDebugUtils.currentLine=36700161;
 //BA.debugLineNum = 36700161;BA.debugLine="pnlFilter.SetVisibleAnimated(300,False)";
mostCurrent._pnlfilter.SetVisibleAnimated((int) (300),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=36700162;
 //BA.debugLineNum = 36700162;BA.debugLine="End Sub";
return "";
}
public static String  _btnmenugroup_click() throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnmenugroup_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnmenugroup_click", null));}
RDebugUtils.currentLine=39452672;
 //BA.debugLineNum = 39452672;BA.debugLine="Private Sub btnMenuGroup_Click";
RDebugUtils.currentLine=39452673;
 //BA.debugLineNum = 39452673;BA.debugLine="sidemenu.ShowMenu";
mostCurrent._sidemenu.ShowMenu();
RDebugUtils.currentLine=39452674;
 //BA.debugLineNum = 39452674;BA.debugLine="End Sub";
return "";
}
public static String  _btnsavefee_click() throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnsavefee_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnsavefee_click", null));}
long _res = 0L;
String _tedadkol1 = "";
String _feekol = "";
int _tedadkol = 0;
int _feefeebadaztakhfifkala = 0;
int _feebadaztakhfif = 0;
RDebugUtils.currentLine=37879808;
 //BA.debugLineNum = 37879808;BA.debugLine="Private Sub btnSaveFee_Click";
RDebugUtils.currentLine=37879809;
 //BA.debugLineNum = 37879809;BA.debugLine="Select FeeType";
switch (BA.switchObjectToInt(mostCurrent._feetype,"btn_edit_Price_Click","btn_discount_Click")) {
case 0: {
RDebugUtils.currentLine=37879811;
 //BA.debugLineNum = 37879811;BA.debugLine="If txtFee.Text=\"\" Then txtFee.Text=0";
if ((mostCurrent._txtfee.getText()).equals("")) { 
mostCurrent._txtfee.setText(BA.ObjectToCharSequence(0));};
RDebugUtils.currentLine=37879812;
 //BA.debugLineNum = 37879812;BA.debugLine="Dim res As Long = MCode.RemoveqomaAshar(txtFee.";
_res = (long) (mostCurrent._mcode._removeqomaashar /*int*/ (mostCurrent.activityBA,mostCurrent._txtfee.getText()));
RDebugUtils.currentLine=37879813;
 //BA.debugLineNum = 37879813;BA.debugLine="ItemSelected.FeeForoosh=res";
mostCurrent._itemselected.FeeForoosh /*int*/  = (int) (_res);
RDebugUtils.currentLine=37879815;
 //BA.debugLineNum = 37879815;BA.debugLine="If myCode.Is_Null_adad(ItemSelected.fldDarsadTa";
if ((double)(Double.parseDouble(mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,mostCurrent._itemselected.fldDarsadTakhfif /*String*/ )))>0) { 
RDebugUtils.currentLine=37879816;
 //BA.debugLineNum = 37879816;BA.debugLine="Dim tedadKol1 As String=myCode.Is_Null_adad(It";
_tedadkol1 = BA.NumberToString((double)(Double.parseDouble(mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,mostCurrent._itemselected.TedadDarSabadJoz /*String*/ )))+((double)(Double.parseDouble(mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,mostCurrent._itemselected.TedadDarSabadKol /*String*/ )))*(double)(Double.parseDouble(mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,mostCurrent._itemselected.TedadDarKarton /*String*/ )))));
RDebugUtils.currentLine=37879817;
 //BA.debugLineNum = 37879817;BA.debugLine="Dim FeeKol As String=(ItemSelected.FeeForoosh*";
_feekol = BA.NumberToString((mostCurrent._itemselected.FeeForoosh /*int*/ *(double)(Double.parseDouble(_tedadkol1))));
RDebugUtils.currentLine=37879818;
 //BA.debugLineNum = 37879818;BA.debugLine="If tedadKol1>0 Then";
if ((double)(Double.parseDouble(_tedadkol1))>0) { 
RDebugUtils.currentLine=37879819;
 //BA.debugLineNum = 37879819;BA.debugLine="ItemSelected.MablaghTakhfif=(((ItemSelected.F";
mostCurrent._itemselected.MablaghTakhfif /*int*/  = (int) ((((mostCurrent._itemselected.FeeForoosh /*int*/ *(double)(Double.parseDouble(_tedadkol1)))*(double)(Double.parseDouble(mostCurrent._itemselected.fldDarsadTakhfif /*String*/ )))/(double)100));
RDebugUtils.currentLine=37879820;
 //BA.debugLineNum = 37879820;BA.debugLine="ItemSelected.fldFeeBadAzTakhfif=FeeKol-ItemSe";
mostCurrent._itemselected.fldFeeBadAzTakhfif /*String*/  = BA.NumberToString((double)(Double.parseDouble(_feekol))-mostCurrent._itemselected.MablaghTakhfif /*int*/ );
 }else {
RDebugUtils.currentLine=37879822;
 //BA.debugLineNum = 37879822;BA.debugLine="If myCode.Is_Null_adad(ItemSelected.fldDarsad";
if ((double)(Double.parseDouble(mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,mostCurrent._itemselected.fldDarsadTakhfif /*String*/ )))>0) { 
RDebugUtils.currentLine=37879823;
 //BA.debugLineNum = 37879823;BA.debugLine="ItemSelected.MablaghTakhfif=(((ItemSelected.";
mostCurrent._itemselected.MablaghTakhfif /*int*/  = (int) ((((mostCurrent._itemselected.FeeForoosh /*int*/ )*(double)(Double.parseDouble(mostCurrent._itemselected.fldDarsadTakhfif /*String*/ )))/(double)100));
RDebugUtils.currentLine=37879824;
 //BA.debugLineNum = 37879824;BA.debugLine="ItemSelected.fldFeeBadAzTakhfif=ItemSelected";
mostCurrent._itemselected.fldFeeBadAzTakhfif /*String*/  = BA.NumberToString(mostCurrent._itemselected.FeeForoosh /*int*/ -mostCurrent._itemselected.MablaghTakhfif /*int*/ );
 };
 };
 };
RDebugUtils.currentLine=37879833;
 //BA.debugLineNum = 37879833;BA.debugLine="MCode.UpdateFeeSabad2(ItemSelected)";
mostCurrent._mcode._updatefeesabad2 /*String*/ (mostCurrent.activityBA,mostCurrent._itemselected);
RDebugUtils.currentLine=37879834;
 //BA.debugLineNum = 37879834;BA.debugLine="RefreshLblSabad";
_refreshlblsabad();
RDebugUtils.currentLine=37879836;
 //BA.debugLineNum = 37879836;BA.debugLine="HLV.notifyDataSetChanged";
mostCurrent._hlv.notifyDataSetChanged();
 break; }
case 1: {
RDebugUtils.currentLine=37879838;
 //BA.debugLineNum = 37879838;BA.debugLine="If txtFee.Text=\"\" Then txtFee.Text=0";
if ((mostCurrent._txtfee.getText()).equals("")) { 
mostCurrent._txtfee.setText(BA.ObjectToCharSequence(0));};
RDebugUtils.currentLine=37879839;
 //BA.debugLineNum = 37879839;BA.debugLine="Dim res As Long =  MCode.RemoveqomaAshar(txtFee";
_res = (long) (mostCurrent._mcode._removeqomaashar /*int*/ (mostCurrent.activityBA,mostCurrent._txtfee.getText()));
RDebugUtils.currentLine=37879840;
 //BA.debugLineNum = 37879840;BA.debugLine="Dim tedadKol As Int =ItemSelected.TedadDarSabad";
_tedadkol = (int) ((double)(Double.parseDouble(mostCurrent._itemselected.TedadDarSabadJoz /*String*/ ))+((double)(Double.parseDouble(mostCurrent._itemselected.TedadDarSabadKol /*String*/ ))*(double)(Double.parseDouble(mostCurrent._itemselected.TedadDarKarton /*String*/ ))));
RDebugUtils.currentLine=37879841;
 //BA.debugLineNum = 37879841;BA.debugLine="If ItemSelected.FeeForoosh<res And tedadKol<2 T";
if (mostCurrent._itemselected.FeeForoosh /*int*/ <_res && _tedadkol<2) { 
RDebugUtils.currentLine=37879842;
 //BA.debugLineNum = 37879842;BA.debugLine="ToastMessageShow(\"مبلغ تخفیف نمیتواند بیشتر از";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("مبلغ تخفیف نمیتواند بیشتر از فی فروش باشد"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=37879843;
 //BA.debugLineNum = 37879843;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=37879852;
 //BA.debugLineNum = 37879852;BA.debugLine="Dim feefeebadaztakhfifKala As Int=MCode.SingleR";
_feefeebadaztakhfifkala = (int)(BA.ObjectToNumber(mostCurrent._mcode._singleresult /*Object*/ (mostCurrent.activityBA,("SELECT fldFeeBadAzTakhfif FROM TblKala WHERE fldCodeKala='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._itemselected.CodeKala /*String*/ ))+"'"))));
RDebugUtils.currentLine=37879853;
 //BA.debugLineNum = 37879853;BA.debugLine="Dim feebadaztakhfif As Int=ItemSelected.fldFeeB";
_feebadaztakhfif = (int)(Double.parseDouble(mostCurrent._itemselected.fldFeeBadAzTakhfif /*String*/ ));
RDebugUtils.currentLine=37879854;
 //BA.debugLineNum = 37879854;BA.debugLine="If txtDarsadTakhfif.Text=100 Then";
if ((mostCurrent._txtdarsadtakhfif.getText()).equals(BA.NumberToString(100))) { 
RDebugUtils.currentLine=37879855;
 //BA.debugLineNum = 37879855;BA.debugLine="ItemSelected.fldFeeBadAzTakhfif=0";
mostCurrent._itemselected.fldFeeBadAzTakhfif /*String*/  = BA.NumberToString(0);
 }else {
RDebugUtils.currentLine=37879857;
 //BA.debugLineNum = 37879857;BA.debugLine="If res>0 And feebadaztakhfif=0 Then";
if (_res>0 && _feebadaztakhfif==0) { 
RDebugUtils.currentLine=37879858;
 //BA.debugLineNum = 37879858;BA.debugLine="ItemSelected.fldFeeBadAzTakhfif=(ItemSelected.";
mostCurrent._itemselected.fldFeeBadAzTakhfif /*String*/  = BA.NumberToString((mostCurrent._itemselected.FeeForoosh /*int*/ *_tedadkol)-_res);
RDebugUtils.currentLine=37879859;
 //BA.debugLineNum = 37879859;BA.debugLine="ToastMessageShow(\"تخفیف با موفقیت اعمال شد ، ج";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("تخفیف با موفقیت اعمال شد ، جهت انصراف از تخفیف مبلغ تخفیف را صفر وارد نمایید."),anywheresoftware.b4a.keywords.Common.True);
 }else 
{RDebugUtils.currentLine=37879860;
 //BA.debugLineNum = 37879860;BA.debugLine="Else If res>0 And feebadaztakhfif>0 Then";
if (_res>0 && _feebadaztakhfif>0) { 
RDebugUtils.currentLine=37879861;
 //BA.debugLineNum = 37879861;BA.debugLine="ItemSelected.fldFeeBadAzTakhfif=feebadaztakhf";
mostCurrent._itemselected.fldFeeBadAzTakhfif /*String*/  = BA.NumberToString(_feebadaztakhfif-_res);
RDebugUtils.currentLine=37879862;
 //BA.debugLineNum = 37879862;BA.debugLine="ToastMessageShow(\"تخفیف با موفقیت اعمال شد ،";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("تخفیف با موفقیت اعمال شد ، جهت انصراف از تخفیف مبلغ تخفیف را صفر وارد نمایید."),anywheresoftware.b4a.keywords.Common.True);
 }else 
{RDebugUtils.currentLine=37879863;
 //BA.debugLineNum = 37879863;BA.debugLine="Else if res=0 And feebadaztakhfif=0 Then";
if (_res==0 && _feebadaztakhfif==0) { 
RDebugUtils.currentLine=37879864;
 //BA.debugLineNum = 37879864;BA.debugLine="ItemSelected.fldFeeBadAzTakhfif=res";
mostCurrent._itemselected.fldFeeBadAzTakhfif /*String*/  = BA.NumberToString(_res);
RDebugUtils.currentLine=37879865;
 //BA.debugLineNum = 37879865;BA.debugLine="ItemSelected.MablaghTakhfif=res";
mostCurrent._itemselected.MablaghTakhfif /*int*/  = (int) (_res);
 }else 
{RDebugUtils.currentLine=37879866;
 //BA.debugLineNum = 37879866;BA.debugLine="Else if res=0 And feefeebadaztakhfifKala=0 The";
if (_res==0 && _feefeebadaztakhfifkala==0) { 
RDebugUtils.currentLine=37879867;
 //BA.debugLineNum = 37879867;BA.debugLine="ItemSelected.fldFeeBadAzTakhfif=0";
mostCurrent._itemselected.fldFeeBadAzTakhfif /*String*/  = BA.NumberToString(0);
 }else 
{RDebugUtils.currentLine=37879868;
 //BA.debugLineNum = 37879868;BA.debugLine="Else if res=0 And feebadaztakhfif>0 Then";
if (_res==0 && _feebadaztakhfif>0) { 
RDebugUtils.currentLine=37879870;
 //BA.debugLineNum = 37879870;BA.debugLine="ItemSelected.fldFeeBadAzTakhfif=feebadaztakhf";
mostCurrent._itemselected.fldFeeBadAzTakhfif /*String*/  = BA.NumberToString(_feebadaztakhfif);
 }else 
{RDebugUtils.currentLine=37879871;
 //BA.debugLineNum = 37879871;BA.debugLine="Else if res=0 Then";
if (_res==0) { 
RDebugUtils.currentLine=37879872;
 //BA.debugLineNum = 37879872;BA.debugLine="ItemSelected.fldFeeBadAzTakhfif=0";
mostCurrent._itemselected.fldFeeBadAzTakhfif /*String*/  = BA.NumberToString(0);
 }}}}}}
;
 };
RDebugUtils.currentLine=37879875;
 //BA.debugLineNum = 37879875;BA.debugLine="ItemSelected.MablaghTakhfif=res";
mostCurrent._itemselected.MablaghTakhfif /*int*/  = (int) (_res);
RDebugUtils.currentLine=37879876;
 //BA.debugLineNum = 37879876;BA.debugLine="ItemSelected.fldDarsadTakhfif=myCode.Is_Null_ad";
mostCurrent._itemselected.fldDarsadTakhfif /*String*/  = mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,mostCurrent._txtdarsadtakhfif.getText());
RDebugUtils.currentLine=37879877;
 //BA.debugLineNum = 37879877;BA.debugLine="If FeeTip>0 Then";
if ((double)(Double.parseDouble(_feetip))>0) { 
RDebugUtils.currentLine=37879878;
 //BA.debugLineNum = 37879878;BA.debugLine="FeeTip=FeeTip-1";
_feetip = BA.NumberToString((double)(Double.parseDouble(_feetip))-1);
 };
RDebugUtils.currentLine=37879880;
 //BA.debugLineNum = 37879880;BA.debugLine="MCode.UpdateNoeTasvieDarSabad(FeeTip,ItemSelect";
mostCurrent._mcode._updatenoetasviedarsabad /*String*/ (mostCurrent.activityBA,(int)(Double.parseDouble(_feetip)),mostCurrent._itemselected);
RDebugUtils.currentLine=37879881;
 //BA.debugLineNum = 37879881;BA.debugLine="RefreshLblSabad";
_refreshlblsabad();
RDebugUtils.currentLine=37879882;
 //BA.debugLineNum = 37879882;BA.debugLine="HLV.notifyDataSetChanged";
mostCurrent._hlv.notifyDataSetChanged();
 break; }
}
;
RDebugUtils.currentLine=37879885;
 //BA.debugLineNum = 37879885;BA.debugLine="btnClose_Click";
_btnclose_click();
RDebugUtils.currentLine=37879886;
 //BA.debugLineNum = 37879886;BA.debugLine="End Sub";
return "";
}
public static void  _btnshowfilterpnl_click() throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnshowfilterpnl_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "btnshowfilterpnl_click", null); return;}
ResumableSub_BtnShowFilterPnl_Click rsub = new ResumableSub_BtnShowFilterPnl_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_BtnShowFilterPnl_Click extends BA.ResumableSub {
public ResumableSub_BtnShowFilterPnl_Click(ir.parsikhesab.pakhsh.act_kaladefault parent) {
this.parent = parent;
}
ir.parsikhesab.pakhsh.act_kaladefault parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_kaladefault";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=36765697;
 //BA.debugLineNum = 36765697;BA.debugLine="Sleep(200)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_kaladefault", "btnshowfilterpnl_click"),(int) (200));
this.state = 7;
return;
case 7:
//C
this.state = 1;
;
RDebugUtils.currentLine=36765698;
 //BA.debugLineNum = 36765698;BA.debugLine="If Panel2.Height = Label11.top Then";
if (true) break;

case 1:
//if
this.state = 6;
if (parent.mostCurrent._panel2.getHeight()==parent.mostCurrent._label11.getTop()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=36765699;
 //BA.debugLineNum = 36765699;BA.debugLine="Panel2.SetLayoutAnimated(500,Panel2.Left,Panel2.";
parent.mostCurrent._panel2.SetLayoutAnimated((int) (500),parent.mostCurrent._panel2.getLeft(),parent.mostCurrent._panel2.getTop(),parent.mostCurrent._panel2.getWidth(),(int) (parent.mostCurrent._lblpoint.getTop()+parent.mostCurrent._lblpoint.getHeight()));
RDebugUtils.currentLine=36765700;
 //BA.debugLineNum = 36765700;BA.debugLine="Pnl_Tools.SetLayoutAnimated(500,Pnl_Tools.Left,P";
parent.mostCurrent._pnl_tools.SetLayoutAnimated((int) (500),parent.mostCurrent._pnl_tools.getLeft(),(int) (parent.mostCurrent._panel2.getTop()+parent.mostCurrent._panel2.getHeight()+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (1),mostCurrent.activityBA)),parent.mostCurrent._pnl_tools.getWidth(),parent.mostCurrent._pnl_tools.getHeight());
RDebugUtils.currentLine=36765701;
 //BA.debugLineNum = 36765701;BA.debugLine="pnl_HLV.SetLayoutAnimated(500,pnl_HLV.Left,Pnl_T";
parent.mostCurrent._pnl_hlv.SetLayoutAnimated((int) (500),parent.mostCurrent._pnl_hlv.getLeft(),(int) (parent.mostCurrent._pnl_tools.getTop()+parent.mostCurrent._pnl_tools.getHeight()),parent.mostCurrent._pnl_hlv.getWidth(),(int) (parent.mostCurrent._pnl_down.getTop()-anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (13),mostCurrent.activityBA)-parent.mostCurrent._pnl_tools.getTop()+parent.mostCurrent._pnl_tools.getHeight()));
RDebugUtils.currentLine=36765702;
 //BA.debugLineNum = 36765702;BA.debugLine="HLV.Height=pnl_HLV.Height - 15%y";
parent.mostCurrent._hlv.setHeight((int) (parent.mostCurrent._pnl_hlv.getHeight()-anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (15),mostCurrent.activityBA)));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=36765704;
 //BA.debugLineNum = 36765704;BA.debugLine="Panel2.SetLayoutAnimated(500,Panel2.Left,Panel2.";
parent.mostCurrent._panel2.SetLayoutAnimated((int) (500),parent.mostCurrent._panel2.getLeft(),parent.mostCurrent._panel2.getTop(),parent.mostCurrent._panel2.getWidth(),parent.mostCurrent._label11.getTop());
RDebugUtils.currentLine=36765705;
 //BA.debugLineNum = 36765705;BA.debugLine="Pnl_Tools.SetLayoutAnimated(500,Pnl_Tools.Left,P";
parent.mostCurrent._pnl_tools.SetLayoutAnimated((int) (500),parent.mostCurrent._pnl_tools.getLeft(),(int) (parent.mostCurrent._pnl_top.getTop()+parent.mostCurrent._pnl_top.getHeight()),parent.mostCurrent._pnl_tools.getWidth(),parent.mostCurrent._pnl_tools.getHeight());
RDebugUtils.currentLine=36765706;
 //BA.debugLineNum = 36765706;BA.debugLine="pnl_HLV.SetLayoutAnimated(500,pnl_HLV.Left,Pnl_T";
parent.mostCurrent._pnl_hlv.SetLayoutAnimated((int) (500),parent.mostCurrent._pnl_hlv.getLeft(),(int) (parent.mostCurrent._pnl_tools.getTop()+parent.mostCurrent._pnl_tools.getHeight()),parent.mostCurrent._pnl_hlv.getWidth(),(int) (parent.mostCurrent._pnl_down.getTop()-parent.mostCurrent._pnl_tools.getTop()+parent.mostCurrent._pnl_tools.getHeight()));
RDebugUtils.currentLine=36765707;
 //BA.debugLineNum = 36765707;BA.debugLine="HLV.Height=pnl_HLV.Height - 28%y";
parent.mostCurrent._hlv.setHeight((int) (parent.mostCurrent._pnl_hlv.getHeight()-anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (28),mostCurrent.activityBA)));
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=36765709;
 //BA.debugLineNum = 36765709;BA.debugLine="Sleep(200)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_kaladefault", "btnshowfilterpnl_click"),(int) (200));
this.state = 8;
return;
case 8:
//C
this.state = -1;
;
RDebugUtils.currentLine=36765710;
 //BA.debugLineNum = 36765710;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _btnupdate_click() throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnupdate_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnupdate_click", null));}
RDebugUtils.currentLine=34603008;
 //BA.debugLineNum = 34603008;BA.debugLine="Sub btnUpdate_Click";
RDebugUtils.currentLine=34603009;
 //BA.debugLineNum = 34603009;BA.debugLine="If MCode.IsConnected Then";
if (mostCurrent._mcode._isconnected /*boolean*/ (mostCurrent.activityBA)) { 
RDebugUtils.currentLine=34603011;
 //BA.debugLineNum = 34603011;BA.debugLine="FirebaseMessaging.mode=\"GetGalleryKala\"";
mostCurrent._firebasemessaging._mode /*String*/  = "GetGalleryKala";
RDebugUtils.currentLine=34603014;
 //BA.debugLineNum = 34603014;BA.debugLine="StartService(FirebaseMessaging)";
anywheresoftware.b4a.keywords.Common.StartService(processBA,(Object)(mostCurrent._firebasemessaging.getObject()));
 }else {
RDebugUtils.currentLine=34603017;
 //BA.debugLineNum = 34603017;BA.debugLine="LoadKala";
_loadkala();
 };
RDebugUtils.currentLine=34603020;
 //BA.debugLineNum = 34603020;BA.debugLine="End Sub";
return "";
}
public static ir.parsikhesab.pakhsh.mcode._adapterlisteshantiongroup  _checkgroupeshantation(String _codegroup) throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "checkgroupeshantation", false))
	 {return ((ir.parsikhesab.pakhsh.mcode._adapterlisteshantiongroup) Debug.delegate(mostCurrent.activityBA, "checkgroupeshantation", new Object[] {_codegroup}));}
int _i = 0;
ir.parsikhesab.pakhsh.mcode._adapterlisteshantiongroup _item = null;
RDebugUtils.currentLine=38535168;
 //BA.debugLineNum = 38535168;BA.debugLine="Public Sub CheckGroupEshantation(CodeGroup As Stri";
RDebugUtils.currentLine=38535169;
 //BA.debugLineNum = 38535169;BA.debugLine="For i=0 To lstEshantionGroup.Size-1";
{
final int step1 = 1;
final int limit1 = (int) (mostCurrent._lsteshantiongroup.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=38535170;
 //BA.debugLineNum = 38535170;BA.debugLine="Dim Item = lstEshantionGroup.Get(i) As AdapterLi";
_item = (ir.parsikhesab.pakhsh.mcode._adapterlisteshantiongroup)(mostCurrent._lsteshantiongroup.Get(_i));
RDebugUtils.currentLine=38535171;
 //BA.debugLineNum = 38535171;BA.debugLine="If Item.fldCodeGroupKalaEshantion=CodeGroup Then";
if ((_item.fldCodeGroupKalaEshantion /*String*/ ).equals(_codegroup)) { 
RDebugUtils.currentLine=38535172;
 //BA.debugLineNum = 38535172;BA.debugLine="Return Item";
if (true) return _item;
 };
 }
};
RDebugUtils.currentLine=38535175;
 //BA.debugLineNum = 38535175;BA.debugLine="Return Null";
if (true) return (ir.parsikhesab.pakhsh.mcode._adapterlisteshantiongroup)(anywheresoftware.b4a.keywords.Common.Null);
RDebugUtils.currentLine=38535176;
 //BA.debugLineNum = 38535176;BA.debugLine="End Sub";
return null;
}
public static String  _cmbbox1_selectedindexchanged(int _index) throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "cmbbox1_selectedindexchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "cmbbox1_selectedindexchanged", new Object[] {_index}));}
ir.parsikhesab.pakhsh.mcode._adapterlistnoetasvie _itemtasvie = null;
RDebugUtils.currentLine=39059456;
 //BA.debugLineNum = 39059456;BA.debugLine="Sub CmbBox1_SelectedIndexChanged (Index As Int)";
RDebugUtils.currentLine=39059457;
 //BA.debugLineNum = 39059457;BA.debugLine="Try";
try {RDebugUtils.currentLine=39059458;
 //BA.debugLineNum = 39059458;BA.debugLine="FeeTip = 0";
_feetip = BA.NumberToString(0);
RDebugUtils.currentLine=39059459;
 //BA.debugLineNum = 39059459;BA.debugLine="MCode.feeTip=0";
mostCurrent._mcode._feetip /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=39059460;
 //BA.debugLineNum = 39059460;BA.debugLine="MCode.feeCode=0";
mostCurrent._mcode._feecode /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=39059461;
 //BA.debugLineNum = 39059461;BA.debugLine="If Index=0 Then";
if (_index==0) { 
RDebugUtils.currentLine=39059462;
 //BA.debugLineNum = 39059462;BA.debugLine="LoadKala";
_loadkala();
 }else {
RDebugUtils.currentLine=39059464;
 //BA.debugLineNum = 39059464;BA.debugLine="Dim ItemTasvie As AdapterListNoeTasvie";
_itemtasvie = new ir.parsikhesab.pakhsh.mcode._adapterlistnoetasvie();
RDebugUtils.currentLine=39059465;
 //BA.debugLineNum = 39059465;BA.debugLine="FeeTip = Index";
_feetip = BA.NumberToString(_index);
RDebugUtils.currentLine=39059466;
 //BA.debugLineNum = 39059466;BA.debugLine="MCode.feeTip=Index";
mostCurrent._mcode._feetip /*String*/  = BA.NumberToString(_index);
RDebugUtils.currentLine=39059467;
 //BA.debugLineNum = 39059467;BA.debugLine="ItemTasvie.Initialize";
_itemtasvie.Initialize();
RDebugUtils.currentLine=39059468;
 //BA.debugLineNum = 39059468;BA.debugLine="ItemTasvie=ListTasvie.Get(FeeTip-1)";
_itemtasvie = (ir.parsikhesab.pakhsh.mcode._adapterlistnoetasvie)(mostCurrent._listtasvie.Get((int) ((double)(Double.parseDouble(_feetip))-1)));
RDebugUtils.currentLine=39059470;
 //BA.debugLineNum = 39059470;BA.debugLine="MCode.feeCode=ItemTasvie.FldC_Tasvie";
mostCurrent._mcode._feecode /*String*/  = _itemtasvie.FldC_Tasvie /*String*/ ;
RDebugUtils.currentLine=39059471;
 //BA.debugLineNum = 39059471;BA.debugLine="Log(\"Fee: \"&Index)";
anywheresoftware.b4a.keywords.Common.LogImpl("539059471","Fee: "+BA.NumberToString(_index),0);
RDebugUtils.currentLine=39059474;
 //BA.debugLineNum = 39059474;BA.debugLine="UpdateFee";
_updatefee();
 };
 } 
       catch (Exception e18) {
			processBA.setLastException(e18);RDebugUtils.currentLine=39059477;
 //BA.debugLineNum = 39059477;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("539059477",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=39059478;
 //BA.debugLineNum = 39059478;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-CmbBox1_SelectedIndexChanged");
 };
RDebugUtils.currentLine=39059481;
 //BA.debugLineNum = 39059481;BA.debugLine="End Sub";
return "";
}
public static void  _updatefee() throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "updatefee", false))
	 {Debug.delegate(mostCurrent.activityBA, "updatefee", null); return;}
ResumableSub_UpdateFee rsub = new ResumableSub_UpdateFee(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_UpdateFee extends BA.ResumableSub {
public ResumableSub_UpdateFee(ir.parsikhesab.pakhsh.act_kaladefault parent) {
this.parent = parent;
}
ir.parsikhesab.pakhsh.act_kaladefault parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_kaladefault";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=37617673;
 //BA.debugLineNum = 37617673;BA.debugLine="Log(\"UpdateFee Offline\")";
anywheresoftware.b4a.keywords.Common.LogImpl("537617673","UpdateFee Offline",0);
RDebugUtils.currentLine=37617674;
 //BA.debugLineNum = 37617674;BA.debugLine="UpdateFeeOffline";
_updatefeeoffline();
RDebugUtils.currentLine=37617677;
 //BA.debugLineNum = 37617677;BA.debugLine="Sleep(200)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_kaladefault", "updatefee"),(int) (200));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=37617680;
 //BA.debugLineNum = 37617680;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _disablearzeshafzode(ir.parsikhesab.pakhsh.mcode._adapterlistkala _item,de.amberhome.objects.appcompat.ACSwitchCompatWrapper _swdisablearzeshafzode) throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "disablearzeshafzode", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "disablearzeshafzode", new Object[] {_item,_swdisablearzeshafzode}));}
String _tedadkol = "";
String _feekol = "";
RDebugUtils.currentLine=38076416;
 //BA.debugLineNum = 38076416;BA.debugLine="Sub DisableArzeshAfzode(Item As AdapterListKala,Sw";
RDebugUtils.currentLine=38076418;
 //BA.debugLineNum = 38076418;BA.debugLine="Try";
try {RDebugUtils.currentLine=38076419;
 //BA.debugLineNum = 38076419;BA.debugLine="If SwDisableArzeshAfzode.Checked=False Then";
if (_swdisablearzeshafzode.getChecked()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=38076420;
 //BA.debugLineNum = 38076420;BA.debugLine="If myCode.Is_Null_adad(Item.fldDarsadArzeshAfzo";
if ((mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_item.fldDarsadArzeshAfzodeKala /*String*/ )).equals(BA.NumberToString(0)) && (mostCurrent._mcode._arzeshafzodeenable /*String*/ ).equals(BA.NumberToString(1))) { 
RDebugUtils.currentLine=38076421;
 //BA.debugLineNum = 38076421;BA.debugLine="Item.fldDarsadArzeshAfzodeKala=myCode.Is_Null_";
_item.fldDarsadArzeshAfzodeKala /*String*/  = mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,mostCurrent._mcode._arzeshafzode /*String*/ );
 };
RDebugUtils.currentLine=38076423;
 //BA.debugLineNum = 38076423;BA.debugLine="SwDisableArzeshAfzode.Tag=Item.fldDarsadArzeshA";
_swdisablearzeshafzode.setTag((Object)(_item.fldDarsadArzeshAfzodeKala /*String*/ ));
RDebugUtils.currentLine=38076424;
 //BA.debugLineNum = 38076424;BA.debugLine="Item.fldDarsadArzeshAfzodeKala=0";
_item.fldDarsadArzeshAfzodeKala /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=38076425;
 //BA.debugLineNum = 38076425;BA.debugLine="Item.fldArzeshAfzodeKala=0";
_item.fldArzeshAfzodeKala /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=38076426;
 //BA.debugLineNum = 38076426;BA.debugLine="MCode.SaveUpdate($\"Update TblSabad Set fldArzes";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,("Update TblSabad Set fldArzeshAfzode='0',fldDarsadArzeshAfzode='0' where FldCodeKala='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_item.CodeKala /*String*/ ))+"'"));
 }else {
RDebugUtils.currentLine=38076428;
 //BA.debugLineNum = 38076428;BA.debugLine="Item.fldDarsadArzeshAfzodeKala=SwDisableArzeshA";
_item.fldDarsadArzeshAfzodeKala /*String*/  = BA.ObjectToString(_swdisablearzeshafzode.getTag());
RDebugUtils.currentLine=38076430;
 //BA.debugLineNum = 38076430;BA.debugLine="Dim tedadKol As String=myCode.Is_Null_adad(Item";
_tedadkol = BA.NumberToString((double)(Double.parseDouble(mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_item.TedadDarSabadJoz /*String*/ )))+((double)(Double.parseDouble(mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_item.TedadDarSabadKol /*String*/ )))*(double)(Double.parseDouble(mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_item.TedadDarKarton /*String*/ )))));
RDebugUtils.currentLine=38076431;
 //BA.debugLineNum = 38076431;BA.debugLine="Dim FeeKol As String=(Item.FeeForoosh*tedadKol)";
_feekol = BA.NumberToString((_item.FeeForoosh /*int*/ *(double)(Double.parseDouble(_tedadkol))));
RDebugUtils.currentLine=38076432;
 //BA.debugLineNum = 38076432;BA.debugLine="If myCode.Is_Null_adad(Item.fldDarsadArzeshAfzo";
if ((double)(Double.parseDouble(mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_item.fldDarsadArzeshAfzodeKala /*String*/ )))>0 && _swdisablearzeshafzode.getChecked()) { 
RDebugUtils.currentLine=38076433;
 //BA.debugLineNum = 38076433;BA.debugLine="Item.fldArzeshAfzodeKala=myCode.Is_Null_adad(M";
_item.fldArzeshAfzodeKala /*String*/  = mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._mcode._mohasbearzeshafzodekala /*long*/ (mostCurrent.activityBA,(long)(Double.parseDouble(_feekol)),_item.fldDarsadArzeshAfzodeKala /*String*/ )));
RDebugUtils.currentLine=38076434;
 //BA.debugLineNum = 38076434;BA.debugLine="If Item.fldArzeshAfzodeKala>0 Then";
if ((double)(Double.parseDouble(_item.fldArzeshAfzodeKala /*String*/ ))>0) { 
RDebugUtils.currentLine=38076436;
 //BA.debugLineNum = 38076436;BA.debugLine="FeeKol=FeeKol+Item.fldArzeshAfzodeKala";
_feekol = BA.NumberToString((double)(Double.parseDouble(_feekol))+(double)(Double.parseDouble(_item.fldArzeshAfzodeKala /*String*/ )));
 };
 }else {
 };
RDebugUtils.currentLine=38076441;
 //BA.debugLineNum = 38076441;BA.debugLine="MCode.SaveUpdate($\"Update TblSabad Set fldArzes";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,("Update TblSabad Set fldArzeshAfzode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_item.fldArzeshAfzodeKala /*String*/ ))+"',fldDarsadArzeshAfzode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_item.fldDarsadArzeshAfzodeKala /*String*/ ))+"' where FldCodeKala='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_item.CodeKala /*String*/ ))+"'"));
RDebugUtils.currentLine=38076442;
 //BA.debugLineNum = 38076442;BA.debugLine="SwDisableArzeshAfzode.Tag=0";
_swdisablearzeshafzode.setTag((Object)(0));
 };
RDebugUtils.currentLine=38076445;
 //BA.debugLineNum = 38076445;BA.debugLine="ItemSelected=Item";
mostCurrent._itemselected = _item;
RDebugUtils.currentLine=38076448;
 //BA.debugLineNum = 38076448;BA.debugLine="RefreshLblSabad";
_refreshlblsabad();
 } 
       catch (Exception e27) {
			processBA.setLastException(e27);RDebugUtils.currentLine=38076450;
 //BA.debugLineNum = 38076450;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("538076450",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=38076451;
 //BA.debugLineNum = 38076451;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-DisableArzeshAfzode");
 };
RDebugUtils.currentLine=38076454;
 //BA.debugLineNum = 38076454;BA.debugLine="End Sub";
return "";
}
public static String  _downeshantion(ir.parsikhesab.pakhsh.mcode._adapterlistkala _itemkala,int _count) throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "downeshantion", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "downeshantion", new Object[] {_itemkala,_count}));}
int _sum = 0;
ir.parsikhesab.pakhsh.mcode._adapterlisteshantiongroup _item = null;
RDebugUtils.currentLine=38797312;
 //BA.debugLineNum = 38797312;BA.debugLine="Public Sub DownEshantion(ItemKala As AdapterListKa";
RDebugUtils.currentLine=38797313;
 //BA.debugLineNum = 38797313;BA.debugLine="Dim sum As Int=MCode.GetCountEshantionGroup(ItemK";
_sum = mostCurrent._mcode._getcounteshantiongroup /*int*/ (mostCurrent.activityBA,_itemkala.CodeGroup /*String*/ );
RDebugUtils.currentLine=38797314;
 //BA.debugLineNum = 38797314;BA.debugLine="Dim item As AdapterListEshantionGroup=CheckGroupE";
_item = _checkgroupeshantation(_itemkala.CodeGroup /*String*/ );
RDebugUtils.currentLine=38797315;
 //BA.debugLineNum = 38797315;BA.debugLine="If item.fldTedadEshantion>sum Then";
if ((double)(Double.parseDouble(_item.fldTedadEshantion /*String*/ ))>_sum) { 
RDebugUtils.currentLine=38797316;
 //BA.debugLineNum = 38797316;BA.debugLine="sum=sum+1";
_sum = (int) (_sum+1);
RDebugUtils.currentLine=38797317;
 //BA.debugLineNum = 38797317;BA.debugLine="MCode.SaveUpdate(\"Update tblEshantionGroupTemp S";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Update tblEshantionGroupTemp Set fldTedadEshantion="+BA.NumberToString(_sum)+" where fldCodeGroupKalaEshantion="+_itemkala.CodeGroup /*String*/ );
RDebugUtils.currentLine=38797318;
 //BA.debugLineNum = 38797318;BA.debugLine="If sum=item.fldTedadEshantion Then";
if (_sum==(double)(Double.parseDouble(_item.fldTedadEshantion /*String*/ ))) { 
RDebugUtils.currentLine=38797319;
 //BA.debugLineNum = 38797319;BA.debugLine="MCode.SaveUpdate(\"Delete From TblSabad Where Fl";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Delete From TblSabad Where FldCodeKala = '"+_itemkala.CodeGroup /*String*/ +"'");
 };
RDebugUtils.currentLine=38797321;
 //BA.debugLineNum = 38797321;BA.debugLine="RefreshCountEshantionGroup";
_refreshcounteshantiongroup();
 };
RDebugUtils.currentLine=38797324;
 //BA.debugLineNum = 38797324;BA.debugLine="End Sub";
return "";
}
public static int  _hlv_getitemcount() throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "hlv_getitemcount", false))
	 {return ((Integer) Debug.delegate(mostCurrent.activityBA, "hlv_getitemcount", null));}
RDebugUtils.currentLine=35782656;
 //BA.debugLineNum = 35782656;BA.debugLine="Sub HLV_GetItemCount As Int 								        '💯 It";
RDebugUtils.currentLine=35782657;
 //BA.debugLineNum = 35782657;BA.debugLine="Return ListKalaTxt.Size";
if (true) return mostCurrent._listkalatxt.getSize();
RDebugUtils.currentLine=35782658;
 //BA.debugLineNum = 35782658;BA.debugLine="End Sub";
return 0;
}
public static String  _hlv_onbindviewholder(anywheresoftware.b4a.objects.PanelWrapper _parent,int _position) throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "hlv_onbindviewholder", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "hlv_onbindviewholder", new Object[] {_parent,_position}));}
ir.parsikhesab.pakhsh.mcode._adapterlistkala _item = null;
ir.parsikhesab.pakhsh.cls_recdefultkala _rec = null;
RDebugUtils.currentLine=35913728;
 //BA.debugLineNum = 35913728;BA.debugLine="Sub HLV_onBindViewHolder (Parent As Panel, Positio";
RDebugUtils.currentLine=35913729;
 //BA.debugLineNum = 35913729;BA.debugLine="Dim Item = ListKalaTxt.Get(Position) As AdapterLi";
_item = (ir.parsikhesab.pakhsh.mcode._adapterlistkala)(mostCurrent._listkalatxt.Get(_position));
RDebugUtils.currentLine=35913730;
 //BA.debugLineNum = 35913730;BA.debugLine="Dim rec As CLs_RecDefultKala=Parent.Tag";
_rec = (ir.parsikhesab.pakhsh.cls_recdefultkala)(_parent.getTag());
RDebugUtils.currentLine=35913731;
 //BA.debugLineNum = 35913731;BA.debugLine="rec.Show(Item,Position)";
_rec._show /*void*/ (null,_item,_position);
RDebugUtils.currentLine=35913732;
 //BA.debugLineNum = 35913732;BA.debugLine="Parent.Height=rec.Height";
_parent.setHeight(_rec._getheight /*int*/ (null));
RDebugUtils.currentLine=35913733;
 //BA.debugLineNum = 35913733;BA.debugLine="End Sub";
return "";
}
public static String  _hlv_oncreateviewholder(anywheresoftware.b4a.objects.PanelWrapper _parent,int _viewtype) throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "hlv_oncreateviewholder", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "hlv_oncreateviewholder", new Object[] {_parent,_viewtype}));}
ir.parsikhesab.pakhsh.cls_recdefultkala _rec = null;
RDebugUtils.currentLine=35848192;
 //BA.debugLineNum = 35848192;BA.debugLine="Sub HLV_onCreateViewHolder (Parent As Panel, ViewT";
RDebugUtils.currentLine=35848193;
 //BA.debugLineNum = 35848193;BA.debugLine="Dim rec As CLs_RecDefultKala";
_rec = new ir.parsikhesab.pakhsh.cls_recdefultkala();
RDebugUtils.currentLine=35848194;
 //BA.debugLineNum = 35848194;BA.debugLine="rec.Initialize(Me)";
_rec._initialize /*String*/ (null,mostCurrent.activityBA,act_kaladefault.getObject());
RDebugUtils.currentLine=35848195;
 //BA.debugLineNum = 35848195;BA.debugLine="Parent.AddView(rec.Panel,0,0,100%x,rec.Height)";
_parent.AddView((android.view.View)(_rec._getpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ (null).getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),_rec._getheight /*int*/ (null));
RDebugUtils.currentLine=35848196;
 //BA.debugLineNum = 35848196;BA.debugLine="Parent.Tag=rec";
_parent.setTag((Object)(_rec));
RDebugUtils.currentLine=35848197;
 //BA.debugLineNum = 35848197;BA.debugLine="End Sub";
return "";
}
public static int  _hlvgoroohkala_getitemcount() throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "hlvgoroohkala_getitemcount", false))
	 {return ((Integer) Debug.delegate(mostCurrent.activityBA, "hlvgoroohkala_getitemcount", null));}
RDebugUtils.currentLine=35192832;
 //BA.debugLineNum = 35192832;BA.debugLine="Sub HLVGoroohKala_GetItemCount As Int";
RDebugUtils.currentLine=35192833;
 //BA.debugLineNum = 35192833;BA.debugLine="Return ListGoroohKala2.Size";
if (true) return mostCurrent._listgoroohkala2.getSize();
RDebugUtils.currentLine=35192834;
 //BA.debugLineNum = 35192834;BA.debugLine="End Sub";
return 0;
}
public static String  _hlvgoroohkala_itemclick(anywheresoftware.b4a.objects.PanelWrapper _clickeditem,int _position) throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "hlvgoroohkala_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "hlvgoroohkala_itemclick", new Object[] {_clickeditem,_position}));}
RDebugUtils.currentLine=35127296;
 //BA.debugLineNum = 35127296;BA.debugLine="Sub HLVGoroohKala_ItemClick (ClickedItem As Panel,";
RDebugUtils.currentLine=35127297;
 //BA.debugLineNum = 35127297;BA.debugLine="LoadGoroohKalaGo(Position)";
_loadgoroohkalago(_position);
RDebugUtils.currentLine=35127298;
 //BA.debugLineNum = 35127298;BA.debugLine="sidemenu.HideMenus";
mostCurrent._sidemenu.HideMenus();
RDebugUtils.currentLine=35127299;
 //BA.debugLineNum = 35127299;BA.debugLine="End Sub";
return "";
}
public static void  _loadgoroohkalago(int _position) throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "loadgoroohkalago", false))
	 {Debug.delegate(mostCurrent.activityBA, "loadgoroohkalago", new Object[] {_position}); return;}
ResumableSub_LoadGoroohKalaGo rsub = new ResumableSub_LoadGoroohKalaGo(null,_position);
rsub.resume(processBA, null);
}
public static class ResumableSub_LoadGoroohKalaGo extends BA.ResumableSub {
public ResumableSub_LoadGoroohKalaGo(ir.parsikhesab.pakhsh.act_kaladefault parent,int _position) {
this.parent = parent;
this._position = _position;
}
ir.parsikhesab.pakhsh.act_kaladefault parent;
int _position;
ir.parsikhesab.pakhsh.mcode._adaptergoroohkala _item = null;
int _count = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _dt = null;
int _i = 0;
int step10;
int limit10;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_kaladefault";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=35323905;
 //BA.debugLineNum = 35323905;BA.debugLine="Sleep(100)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_kaladefault", "loadgoroohkalago"),(int) (100));
this.state = 9;
return;
case 9:
//C
this.state = 1;
;
RDebugUtils.currentLine=35323906;
 //BA.debugLineNum = 35323906;BA.debugLine="Dim Item = ListGoroohKala2.Get(Position) As Adapt";
_item = (ir.parsikhesab.pakhsh.mcode._adaptergoroohkala)(parent.mostCurrent._listgoroohkala2.Get(_position));
RDebugUtils.currentLine=35323907;
 //BA.debugLineNum = 35323907;BA.debugLine="GroupCodeSelect1=Item.FldC_Gorooh";
parent.mostCurrent._groupcodeselect1 = _item.FldC_Gorooh /*String*/ ;
RDebugUtils.currentLine=35323909;
 //BA.debugLineNum = 35323909;BA.debugLine="Dim Count As Int = Item.FldC_Gorooh.Length + 3";
_count = (int) (_item.FldC_Gorooh /*String*/ .length()+3);
RDebugUtils.currentLine=35323910;
 //BA.debugLineNum = 35323910;BA.debugLine="Dim Dt As Cursor=MCode.Result(\"Select FldC_Gorooh";
_dt = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_dt = parent.mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select FldC_Gorooh,FldN_Gorooh From TblGoroohKala where FldC_Gorooh Like '"+_item.FldC_Gorooh /*String*/ +"%' And Length(FldC_Gorooh) = "+BA.NumberToString(_count)+" ORDER BY FldC_Gorooh");
RDebugUtils.currentLine=35323911;
 //BA.debugLineNum = 35323911;BA.debugLine="If Dt.RowCount>0 Then";
if (true) break;

case 1:
//if
this.state = 8;
if (_dt.getRowCount()>0) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=35323912;
 //BA.debugLineNum = 35323912;BA.debugLine="lblBackGroup.Visible=True";
parent.mostCurrent._lblbackgroup.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=35323913;
 //BA.debugLineNum = 35323913;BA.debugLine="ListGoroohKala2.Clear";
parent.mostCurrent._listgoroohkala2.Clear();
RDebugUtils.currentLine=35323914;
 //BA.debugLineNum = 35323914;BA.debugLine="OriginalListGoroohKala2.Clear";
parent.mostCurrent._originallistgoroohkala2.Clear();
RDebugUtils.currentLine=35323916;
 //BA.debugLineNum = 35323916;BA.debugLine="For i=0 To Dt.RowCount-1";
if (true) break;

case 4:
//for
this.state = 7;
step10 = 1;
limit10 = (int) (_dt.getRowCount()-1);
_i = (int) (0) ;
this.state = 10;
if (true) break;

case 10:
//C
this.state = 7;
if ((step10 > 0 && _i <= limit10) || (step10 < 0 && _i >= limit10)) this.state = 6;
if (true) break;

case 11:
//C
this.state = 10;
_i = ((int)(0 + _i + step10)) ;
if (true) break;

case 6:
//C
this.state = 11;
RDebugUtils.currentLine=35323917;
 //BA.debugLineNum = 35323917;BA.debugLine="Dt.Position=i";
_dt.setPosition(_i);
RDebugUtils.currentLine=35323918;
 //BA.debugLineNum = 35323918;BA.debugLine="Dim Item As AdapterGoroohKala";
_item = new ir.parsikhesab.pakhsh.mcode._adaptergoroohkala();
RDebugUtils.currentLine=35323919;
 //BA.debugLineNum = 35323919;BA.debugLine="Item.FldC_Gorooh= Dt.GetString(\"FldC_Gorooh\")";
_item.FldC_Gorooh /*String*/  = _dt.GetString("FldC_Gorooh");
RDebugUtils.currentLine=35323920;
 //BA.debugLineNum = 35323920;BA.debugLine="Item.FldN_Gorooh= Dt.GetString(\"FldN_Gorooh\")";
_item.FldN_Gorooh /*String*/  = _dt.GetString("FldN_Gorooh");
RDebugUtils.currentLine=35323921;
 //BA.debugLineNum = 35323921;BA.debugLine="OriginalListGoroohKala2.Add(Item)";
parent.mostCurrent._originallistgoroohkala2.Add((Object)(_item));
RDebugUtils.currentLine=35323922;
 //BA.debugLineNum = 35323922;BA.debugLine="MCode.C_LayeKala=Item.FldC_Gorooh";
parent.mostCurrent._mcode._c_layekala /*String*/  = _item.FldC_Gorooh /*String*/ ;
 if (true) break;
if (true) break;

case 7:
//C
this.state = 8;
;
RDebugUtils.currentLine=35323924;
 //BA.debugLineNum = 35323924;BA.debugLine="ListGoroohKala2 = OriginalListGoroohKala2";
parent.mostCurrent._listgoroohkala2 = parent.mostCurrent._originallistgoroohkala2;
RDebugUtils.currentLine=35323925;
 //BA.debugLineNum = 35323925;BA.debugLine="HLVGoroohKala.notifyDataSetChanged";
parent.mostCurrent._hlvgoroohkala.notifyDataSetChanged();
 if (true) break;

case 8:
//C
this.state = -1;
;
RDebugUtils.currentLine=35323927;
 //BA.debugLineNum = 35323927;BA.debugLine="LoadKala";
_loadkala();
RDebugUtils.currentLine=35323928;
 //BA.debugLineNum = 35323928;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _hlvgoroohkala_onbindviewholder(anywheresoftware.b4a.objects.PanelWrapper _parent,int _position) throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "hlvgoroohkala_onbindviewholder", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "hlvgoroohkala_onbindviewholder", new Object[] {_parent,_position}));}
ir.parsikhesab.pakhsh.mcode._adaptergoroohkala _item = null;
anywheresoftware.b4a.objects.LabelWrapper _lblsharh = null;
RDebugUtils.currentLine=35258368;
 //BA.debugLineNum = 35258368;BA.debugLine="Sub HLVGoroohKala_onBindViewHolder (Parent As Pane";
RDebugUtils.currentLine=35258369;
 //BA.debugLineNum = 35258369;BA.debugLine="Dim Item = ListGoroohKala2.Get(Position) As Adapt";
_item = (ir.parsikhesab.pakhsh.mcode._adaptergoroohkala)(mostCurrent._listgoroohkala2.Get(_position));
RDebugUtils.currentLine=35258370;
 //BA.debugLineNum = 35258370;BA.debugLine="Dim LblSharh As Label  = Parent.getview(0)";
_lblsharh = new anywheresoftware.b4a.objects.LabelWrapper();
_lblsharh = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_parent.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=35258371;
 //BA.debugLineNum = 35258371;BA.debugLine="LblSharh.Text = Item.FldN_Gorooh";
_lblsharh.setText(BA.ObjectToCharSequence(_item.FldN_Gorooh /*String*/ ));
RDebugUtils.currentLine=35258372;
 //BA.debugLineNum = 35258372;BA.debugLine="Parent.Elevation=1dip";
_parent.setElevation((float) (anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (1))));
RDebugUtils.currentLine=35258373;
 //BA.debugLineNum = 35258373;BA.debugLine="Parent.Height = 9%y";
_parent.setHeight(anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (9),mostCurrent.activityBA));
RDebugUtils.currentLine=35258374;
 //BA.debugLineNum = 35258374;BA.debugLine="End Sub";
return "";
}
public static String  _hlvgoroohkala_oncreateviewholder(anywheresoftware.b4a.objects.PanelWrapper _parent,int _viewtype) throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "hlvgoroohkala_oncreateviewholder", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "hlvgoroohkala_oncreateviewholder", new Object[] {_parent,_viewtype}));}
anywheresoftware.b4a.objects.LabelWrapper _lblsharh = null;
anywheresoftware.b4a.objects.drawable.BitmapDrawable _bmp1 = null;
RDebugUtils.currentLine=35061760;
 //BA.debugLineNum = 35061760;BA.debugLine="Sub HLVGoroohKala_onCreateViewHolder (Parent As Pa";
RDebugUtils.currentLine=35061761;
 //BA.debugLineNum = 35061761;BA.debugLine="Dim LblSharh As Label";
_lblsharh = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=35061762;
 //BA.debugLineNum = 35061762;BA.debugLine="Dim bmp1 As BitmapDrawable";
_bmp1 = new anywheresoftware.b4a.objects.drawable.BitmapDrawable();
RDebugUtils.currentLine=35061763;
 //BA.debugLineNum = 35061763;BA.debugLine="LblSharh.Initialize(\"LblSharh\")";
_lblsharh.Initialize(mostCurrent.activityBA,"LblSharh");
RDebugUtils.currentLine=35061764;
 //BA.debugLineNum = 35061764;BA.debugLine="LblSharh.TextColor=Colors.black";
_lblsharh.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=35061765;
 //BA.debugLineNum = 35061765;BA.debugLine="LblSharh.TextSize=20";
_lblsharh.setTextSize((float) (20));
RDebugUtils.currentLine=35061766;
 //BA.debugLineNum = 35061766;BA.debugLine="LblSharh.Gravity=Gravity.CENTER";
_lblsharh.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER);
RDebugUtils.currentLine=35061767;
 //BA.debugLineNum = 35061767;BA.debugLine="LblSharh.SingleLine=False";
_lblsharh.setSingleLine(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=35061768;
 //BA.debugLineNum = 35061768;BA.debugLine="bmp1.Initialize(LoadBitmap(File.DirAssets,\"button";
_bmp1.Initialize((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"button5.png").getObject()));
RDebugUtils.currentLine=35061769;
 //BA.debugLineNum = 35061769;BA.debugLine="LblSharh.Background=bmp1";
_lblsharh.setBackground((android.graphics.drawable.Drawable)(_bmp1.getObject()));
RDebugUtils.currentLine=35061770;
 //BA.debugLineNum = 35061770;BA.debugLine="LblSharh.Typeface= MCode.Font2";
_lblsharh.setTypeface((android.graphics.Typeface)(mostCurrent._mcode._font2 /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()));
RDebugUtils.currentLine=35061771;
 //BA.debugLineNum = 35061771;BA.debugLine="Parent.AddView(LblSharh,2%x,1%y,61%x,7%y)";
_parent.AddView((android.view.View)(_lblsharh.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (1),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (61),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (7),mostCurrent.activityBA));
RDebugUtils.currentLine=35061772;
 //BA.debugLineNum = 35061772;BA.debugLine="End Sub";
return "";
}
public static void  _img_barcode_click() throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "img_barcode_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "img_barcode_click", null); return;}
ResumableSub_Img_barcode_Click rsub = new ResumableSub_Img_barcode_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Img_barcode_Click extends BA.ResumableSub {
public ResumableSub_Img_barcode_Click(ir.parsikhesab.pakhsh.act_kaladefault parent) {
this.parent = parent;
}
ir.parsikhesab.pakhsh.act_kaladefault parent;
boolean _result = false;
String _permission = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_kaladefault";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=35979265;
 //BA.debugLineNum = 35979265;BA.debugLine="Dim Result As Boolean = True";
_result = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=35979266;
 //BA.debugLineNum = 35979266;BA.debugLine="If Not(rp.Check(rp.PERMISSION_CAMERA)) Then";
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
RDebugUtils.currentLine=35979267;
 //BA.debugLineNum = 35979267;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_CAMERA)";
parent._rp.CheckAndRequest(processBA,parent._rp.PERMISSION_CAMERA);
RDebugUtils.currentLine=35979268;
 //BA.debugLineNum = 35979268;BA.debugLine="Wait For Activity_PermissionResult (Permission A";
anywheresoftware.b4a.keywords.Common.WaitFor("activity_permissionresult", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_kaladefault", "img_barcode_click"), null);
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
RDebugUtils.currentLine=35979270;
 //BA.debugLineNum = 35979270;BA.debugLine="If Result=False Then";

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
RDebugUtils.currentLine=35979271;
 //BA.debugLineNum = 35979271;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=35979274;
 //BA.debugLineNum = 35979274;BA.debugLine="Barcode.isportrait = True";
parent.mostCurrent._barcode.isportrait = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=35979275;
 //BA.debugLineNum = 35979275;BA.debugLine="Barcode.useFrontCam = False";
parent.mostCurrent._barcode.useFrontCam = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=35979278;
 //BA.debugLineNum = 35979278;BA.debugLine="Barcode.timeoutDuration = 30000";
parent.mostCurrent._barcode.timeoutDuration = (int) (30000);
RDebugUtils.currentLine=35979282;
 //BA.debugLineNum = 35979282;BA.debugLine="Barcode.theViewFinderXfactor = 0.7";
parent.mostCurrent._barcode.theViewFinderXfactor = 0.7;
RDebugUtils.currentLine=35979283;
 //BA.debugLineNum = 35979283;BA.debugLine="Barcode.theViewFinderYfactor = 0.5";
parent.mostCurrent._barcode.theViewFinderYfactor = 0.5;
RDebugUtils.currentLine=35979284;
 //BA.debugLineNum = 35979284;BA.debugLine="Barcode.theFrameColor = Colors.Blue";
parent.mostCurrent._barcode.theFrameColor = anywheresoftware.b4a.keywords.Common.Colors.Blue;
RDebugUtils.currentLine=35979285;
 //BA.debugLineNum = 35979285;BA.debugLine="Barcode.theLaserColor = Colors.Yellow";
parent.mostCurrent._barcode.theLaserColor = anywheresoftware.b4a.keywords.Common.Colors.Yellow;
RDebugUtils.currentLine=35979286;
 //BA.debugLineNum = 35979286;BA.debugLine="Barcode.theMaskColor = Colors.argb(95, 0, 0, 255";
parent.mostCurrent._barcode.theMaskColor = anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (95),(int) (0),(int) (0),(int) (255));
RDebugUtils.currentLine=35979287;
 //BA.debugLineNum = 35979287;BA.debugLine="Barcode.theResultColor = Colors.Green";
parent.mostCurrent._barcode.theResultColor = anywheresoftware.b4a.keywords.Common.Colors.Green;
RDebugUtils.currentLine=35979288;
 //BA.debugLineNum = 35979288;BA.debugLine="Barcode.theResultPointColor = Colors.Red";
parent.mostCurrent._barcode.theResultPointColor = anywheresoftware.b4a.keywords.Common.Colors.Red;
RDebugUtils.currentLine=35979291;
 //BA.debugLineNum = 35979291;BA.debugLine="Barcode.theTopPromptMessage = \"\"";
parent.mostCurrent._barcode.theTopPromptMessage = "";
RDebugUtils.currentLine=35979292;
 //BA.debugLineNum = 35979292;BA.debugLine="Barcode.theTopPromptTextSize = 5%y 'text size";
parent.mostCurrent._barcode.theTopPromptTextSize = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),mostCurrent.activityBA);
RDebugUtils.currentLine=35979293;
 //BA.debugLineNum = 35979293;BA.debugLine="Barcode.topPromptColor = Colors.Red";
parent.mostCurrent._barcode.topPromptColor = anywheresoftware.b4a.keywords.Common.Colors.Red;
RDebugUtils.currentLine=35979294;
 //BA.debugLineNum = 35979294;BA.debugLine="Barcode.topPromptDistanceFromTop = 1%y 'pixel di";
parent.mostCurrent._barcode.topPromptDistanceFromTop = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (1),mostCurrent.activityBA);
RDebugUtils.currentLine=35979296;
 //BA.debugLineNum = 35979296;BA.debugLine="Barcode.theBottomPromptMessage = \"\"";
parent.mostCurrent._barcode.theBottomPromptMessage = "";
RDebugUtils.currentLine=35979297;
 //BA.debugLineNum = 35979297;BA.debugLine="Barcode.theBottomPromptTextSize = 5%y  'text siz";
parent.mostCurrent._barcode.theBottomPromptTextSize = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),mostCurrent.activityBA);
RDebugUtils.currentLine=35979298;
 //BA.debugLineNum = 35979298;BA.debugLine="Barcode.bottomPromptColor = Colors.Blue";
parent.mostCurrent._barcode.bottomPromptColor = anywheresoftware.b4a.keywords.Common.Colors.Blue;
RDebugUtils.currentLine=35979299;
 //BA.debugLineNum = 35979299;BA.debugLine="Barcode.bottomPromptDistanceFromBottom = 5%y  'p";
parent.mostCurrent._barcode.bottomPromptDistanceFromBottom = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),mostCurrent.activityBA);
RDebugUtils.currentLine=35979303;
 //BA.debugLineNum = 35979303;BA.debugLine="Barcode.BeginScan(\"myzx\")";
parent.mostCurrent._barcode.BeginScan(mostCurrent.activityBA,"myzx");
 if (true) break;

case 9:
//C
this.state = -1;
;
RDebugUtils.currentLine=35979305;
 //BA.debugLineNum = 35979305;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _img_barcode_click1() throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "img_barcode_click1", false))
	 {Debug.delegate(mostCurrent.activityBA, "img_barcode_click1", null); return;}
ResumableSub_Img_barcode_Click1 rsub = new ResumableSub_Img_barcode_Click1(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Img_barcode_Click1 extends BA.ResumableSub {
public ResumableSub_Img_barcode_Click1(ir.parsikhesab.pakhsh.act_kaladefault parent) {
this.parent = parent;
}
ir.parsikhesab.pakhsh.act_kaladefault parent;
boolean _result = false;
String _permission = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_kaladefault";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=36241409;
 //BA.debugLineNum = 36241409;BA.debugLine="Dim Result As Boolean = True";
_result = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=36241410;
 //BA.debugLineNum = 36241410;BA.debugLine="If Not(rp.Check(rp.PERMISSION_CAMERA)) Then";
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
RDebugUtils.currentLine=36241411;
 //BA.debugLineNum = 36241411;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_CAMERA)";
parent._rp.CheckAndRequest(processBA,parent._rp.PERMISSION_CAMERA);
RDebugUtils.currentLine=36241412;
 //BA.debugLineNum = 36241412;BA.debugLine="Wait For Activity_PermissionResult (Permission A";
anywheresoftware.b4a.keywords.Common.WaitFor("activity_permissionresult", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_kaladefault", "img_barcode_click1"), null);
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
RDebugUtils.currentLine=36241414;
 //BA.debugLineNum = 36241414;BA.debugLine="If Result=False Then";

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
RDebugUtils.currentLine=36241415;
 //BA.debugLineNum = 36241415;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=36241418;
 //BA.debugLineNum = 36241418;BA.debugLine="Barcode.isportrait = True";
parent.mostCurrent._barcode.isportrait = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=36241419;
 //BA.debugLineNum = 36241419;BA.debugLine="Barcode.useFrontCam = False";
parent.mostCurrent._barcode.useFrontCam = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=36241427;
 //BA.debugLineNum = 36241427;BA.debugLine="Barcode.theViewFinderXfactor = 0.7";
parent.mostCurrent._barcode.theViewFinderXfactor = 0.7;
RDebugUtils.currentLine=36241428;
 //BA.debugLineNum = 36241428;BA.debugLine="Barcode.theViewFinderYfactor = 0.5";
parent.mostCurrent._barcode.theViewFinderYfactor = 0.5;
RDebugUtils.currentLine=36241429;
 //BA.debugLineNum = 36241429;BA.debugLine="Barcode.theFrameColor = Colors.Blue";
parent.mostCurrent._barcode.theFrameColor = anywheresoftware.b4a.keywords.Common.Colors.Blue;
RDebugUtils.currentLine=36241430;
 //BA.debugLineNum = 36241430;BA.debugLine="Barcode.theLaserColor = Colors.Yellow";
parent.mostCurrent._barcode.theLaserColor = anywheresoftware.b4a.keywords.Common.Colors.Yellow;
RDebugUtils.currentLine=36241431;
 //BA.debugLineNum = 36241431;BA.debugLine="Barcode.theMaskColor = Colors.argb(95, 0, 0, 255";
parent.mostCurrent._barcode.theMaskColor = anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (95),(int) (0),(int) (0),(int) (255));
RDebugUtils.currentLine=36241432;
 //BA.debugLineNum = 36241432;BA.debugLine="Barcode.theResultColor = Colors.Green";
parent.mostCurrent._barcode.theResultColor = anywheresoftware.b4a.keywords.Common.Colors.Green;
RDebugUtils.currentLine=36241433;
 //BA.debugLineNum = 36241433;BA.debugLine="Barcode.theResultPointColor = Colors.Red";
parent.mostCurrent._barcode.theResultPointColor = anywheresoftware.b4a.keywords.Common.Colors.Red;
RDebugUtils.currentLine=36241436;
 //BA.debugLineNum = 36241436;BA.debugLine="Barcode.theTopPromptMessage = \"\"";
parent.mostCurrent._barcode.theTopPromptMessage = "";
RDebugUtils.currentLine=36241437;
 //BA.debugLineNum = 36241437;BA.debugLine="Barcode.theTopPromptTextSize = 5%y 'text size";
parent.mostCurrent._barcode.theTopPromptTextSize = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),mostCurrent.activityBA);
RDebugUtils.currentLine=36241438;
 //BA.debugLineNum = 36241438;BA.debugLine="Barcode.topPromptColor = Colors.Red";
parent.mostCurrent._barcode.topPromptColor = anywheresoftware.b4a.keywords.Common.Colors.Red;
RDebugUtils.currentLine=36241439;
 //BA.debugLineNum = 36241439;BA.debugLine="Barcode.topPromptDistanceFromTop = 1%y 'pixel di";
parent.mostCurrent._barcode.topPromptDistanceFromTop = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (1),mostCurrent.activityBA);
RDebugUtils.currentLine=36241441;
 //BA.debugLineNum = 36241441;BA.debugLine="Barcode.theBottomPromptMessage = \"\"";
parent.mostCurrent._barcode.theBottomPromptMessage = "";
RDebugUtils.currentLine=36241442;
 //BA.debugLineNum = 36241442;BA.debugLine="Barcode.theBottomPromptTextSize = 5%y  'text siz";
parent.mostCurrent._barcode.theBottomPromptTextSize = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),mostCurrent.activityBA);
RDebugUtils.currentLine=36241443;
 //BA.debugLineNum = 36241443;BA.debugLine="Barcode.bottomPromptColor = Colors.Blue";
parent.mostCurrent._barcode.bottomPromptColor = anywheresoftware.b4a.keywords.Common.Colors.Blue;
RDebugUtils.currentLine=36241444;
 //BA.debugLineNum = 36241444;BA.debugLine="Barcode.bottomPromptDistanceFromBottom = 5%y  'p";
parent.mostCurrent._barcode.bottomPromptDistanceFromBottom = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),mostCurrent.activityBA);
RDebugUtils.currentLine=36241448;
 //BA.debugLineNum = 36241448;BA.debugLine="Barcode.BeginScan(\"myzx\")";
parent.mostCurrent._barcode.BeginScan(mostCurrent.activityBA,"myzx");
 if (true) break;

case 9:
//C
this.state = -1;
;
RDebugUtils.currentLine=36241450;
 //BA.debugLineNum = 36241450;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _img_paging_click() throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "img_paging_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "img_paging_click", null));}
RDebugUtils.currentLine=36634624;
 //BA.debugLineNum = 36634624;BA.debugLine="Private Sub Img_Paging_Click";
RDebugUtils.currentLine=36634625;
 //BA.debugLineNum = 36634625;BA.debugLine="Try";
try {RDebugUtils.currentLine=36634626;
 //BA.debugLineNum = 36634626;BA.debugLine="Act_KalaPaging.listKala=ListKalaTxt";
mostCurrent._act_kalapaging._listkala /*anywheresoftware.b4a.objects.collections.List*/  = mostCurrent._listkalatxt;
RDebugUtils.currentLine=36634627;
 //BA.debugLineNum = 36634627;BA.debugLine="StartActivity(Act_KalaPaging)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._act_kalapaging.getObject()));
 } 
       catch (Exception e5) {
			processBA.setLastException(e5);RDebugUtils.currentLine=36634629;
 //BA.debugLineNum = 36634629;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("536634629",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=36634630;
 //BA.debugLineNum = 36634630;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-Img_Paging_Click");
 };
RDebugUtils.currentLine=36634632;
 //BA.debugLineNum = 36634632;BA.debugLine="End Sub";
return "";
}
public static String  _img_rotatepic_click() throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "img_rotatepic_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "img_rotatepic_click", null));}
RDebugUtils.currentLine=39387136;
 //BA.debugLineNum = 39387136;BA.debugLine="Private Sub Img_RotatePic_Click";
RDebugUtils.currentLine=39387137;
 //BA.debugLineNum = 39387137;BA.debugLine="If MCode.RotatePic=False Then";
if (mostCurrent._mcode._rotatepic /*boolean*/ ==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=39387138;
 //BA.debugLineNum = 39387138;BA.debugLine="MCode.RotatePic=True";
mostCurrent._mcode._rotatepic /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 }else {
RDebugUtils.currentLine=39387140;
 //BA.debugLineNum = 39387140;BA.debugLine="MCode.RotatePic=False";
mostCurrent._mcode._rotatepic /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=39387142;
 //BA.debugLineNum = 39387142;BA.debugLine="LoadKala";
_loadkala();
RDebugUtils.currentLine=39387143;
 //BA.debugLineNum = 39387143;BA.debugLine="End Sub";
return "";
}
public static String  _img_selectmoshtari_click() throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "img_selectmoshtari_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "img_selectmoshtari_click", null));}
RDebugUtils.currentLine=39321600;
 //BA.debugLineNum = 39321600;BA.debugLine="Private Sub Img_SelectMoshtari_Click";
RDebugUtils.currentLine=39321601;
 //BA.debugLineNum = 39321601;BA.debugLine="MCode.page=\"Act_SelectMantage\"";
mostCurrent._mcode._page /*String*/  = "Act_SelectMantage";
RDebugUtils.currentLine=39321602;
 //BA.debugLineNum = 39321602;BA.debugLine="StartActivity(Act_SelectMantage)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._act_selectmantage.getObject()));
RDebugUtils.currentLine=39321603;
 //BA.debugLineNum = 39321603;BA.debugLine="End Sub";
return "";
}
public static String  _img_sort_click() throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "img_sort_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "img_sort_click", null));}
anywheresoftware.b4a.objects.collections.List _lst = null;
int _res = 0;
RDebugUtils.currentLine=37093376;
 //BA.debugLineNum = 37093376;BA.debugLine="Sub Img_sort_Click";
RDebugUtils.currentLine=37093384;
 //BA.debugLineNum = 37093384;BA.debugLine="Try";
try {RDebugUtils.currentLine=37093386;
 //BA.debugLineNum = 37093386;BA.debugLine="Dim Lst As List = Array As String(\"کد کالا\",\"کد گ";
_lst = new anywheresoftware.b4a.objects.collections.List();
_lst = anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"کد کالا","کد گروه","نام کالا نزولی","نام کالا صعودی","ارزان ترین قیمت","گرانترین قیمت","کمترین موجودی","بیشترین موجودی"});
RDebugUtils.currentLine=37093387;
 //BA.debugLineNum = 37093387;BA.debugLine="Dim res As Int = InputList(Lst,\"مرتب سازی براساس:";
_res = anywheresoftware.b4a.keywords.Common.InputList(_lst,BA.ObjectToCharSequence("مرتب سازی براساس:"),(int) (-1),mostCurrent.activityBA);
RDebugUtils.currentLine=37093388;
 //BA.debugLineNum = 37093388;BA.debugLine="Select Case res";
switch (_res) {
case 0: {
RDebugUtils.currentLine=37093390;
 //BA.debugLineNum = 37093390;BA.debugLine="Str_sort = \" Order by fldCodeKala Asc\"";
mostCurrent._str_sort = " Order by fldCodeKala Asc";
 break; }
case 1: {
RDebugUtils.currentLine=37093392;
 //BA.debugLineNum = 37093392;BA.debugLine="Str_sort = \" Order by fldCodeGroup Asc\"";
mostCurrent._str_sort = " Order by fldCodeGroup Asc";
 break; }
case 2: {
RDebugUtils.currentLine=37093394;
 //BA.debugLineNum = 37093394;BA.debugLine="Str_sort = \" Order by fldNameKala\"";
mostCurrent._str_sort = " Order by fldNameKala";
 break; }
case 3: {
RDebugUtils.currentLine=37093396;
 //BA.debugLineNum = 37093396;BA.debugLine="Str_sort = \" Order by fldNameKala Desc\"";
mostCurrent._str_sort = " Order by fldNameKala Desc";
 break; }
case 4: {
RDebugUtils.currentLine=37093398;
 //BA.debugLineNum = 37093398;BA.debugLine="Str_sort = \" Order by fldFeeForoosh\"";
mostCurrent._str_sort = " Order by fldFeeForoosh";
 break; }
case 5: {
RDebugUtils.currentLine=37093400;
 //BA.debugLineNum = 37093400;BA.debugLine="Str_sort = \" Order by fldFeeForoosh Desc\"";
mostCurrent._str_sort = " Order by fldFeeForoosh Desc";
 break; }
case 6: {
RDebugUtils.currentLine=37093402;
 //BA.debugLineNum = 37093402;BA.debugLine="Str_sort = \" Order by SumMande\"";
mostCurrent._str_sort = " Order by SumMande";
 break; }
case 7: {
RDebugUtils.currentLine=37093404;
 //BA.debugLineNum = 37093404;BA.debugLine="Str_sort = \" Order by SumMande Desc\"";
mostCurrent._str_sort = " Order by SumMande Desc";
 break; }
}
;
RDebugUtils.currentLine=37093406;
 //BA.debugLineNum = 37093406;BA.debugLine="Log(Str_sort)";
anywheresoftware.b4a.keywords.Common.LogImpl("537093406",mostCurrent._str_sort,0);
RDebugUtils.currentLine=37093408;
 //BA.debugLineNum = 37093408;BA.debugLine="LoadKala";
_loadkala();
 } 
       catch (Exception e25) {
			processBA.setLastException(e25);RDebugUtils.currentLine=37093410;
 //BA.debugLineNum = 37093410;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("537093410",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=37093411;
 //BA.debugLineNum = 37093411;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-Img_sort_Click");
 };
RDebugUtils.currentLine=37093414;
 //BA.debugLineNum = 37093414;BA.debugLine="End Sub";
return "";
}
public static void  _img_tipfee_click() throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "img_tipfee_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "img_tipfee_click", null); return;}
ResumableSub_Img_TipFee_Click rsub = new ResumableSub_Img_TipFee_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Img_TipFee_Click extends BA.ResumableSub {
public ResumableSub_Img_TipFee_Click(ir.parsikhesab.pakhsh.act_kaladefault parent) {
this.parent = parent;
}
ir.parsikhesab.pakhsh.act_kaladefault parent;
anywheresoftware.b4a.objects.collections.List _lst = null;
int _result = 0;
int _res = 0;
ir.parsikhesab.pakhsh.mcode._adapterlistnoetasvie _itemtasvie = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_kaladefault";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=37552129;
 //BA.debugLineNum = 37552129;BA.debugLine="Dim Lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=37552130;
 //BA.debugLineNum = 37552130;BA.debugLine="Lst.Initialize";
_lst.Initialize();
RDebugUtils.currentLine=37552139;
 //BA.debugLineNum = 37552139;BA.debugLine="Lst.Initialize2(MCode.ArrayTasvieForKala)";
_lst.Initialize2(anywheresoftware.b4a.keywords.Common.ArrayToList(parent.mostCurrent._mcode._arraytasvieforkala /*String[]*/ ));
RDebugUtils.currentLine=37552140;
 //BA.debugLineNum = 37552140;BA.debugLine="InputListAsync(Lst,\"تیپ قیمت را انتخاب کنید\",Fee";
anywheresoftware.b4a.keywords.Common.InputListAsync(_lst,BA.ObjectToCharSequence("تیپ قیمت را انتخاب کنید"),(int)(Double.parseDouble(parent._feetip)),processBA,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=37552141;
 //BA.debugLineNum = 37552141;BA.debugLine="Wait For InputList_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("inputlist_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_kaladefault", "img_tipfee_click"), null);
this.state = 15;
return;
case 15:
//C
this.state = 1;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=37552142;
 //BA.debugLineNum = 37552142;BA.debugLine="If Result <> -3 Then";
if (true) break;

case 1:
//if
this.state = 14;
if (_result!=-3) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=37552143;
 //BA.debugLineNum = 37552143;BA.debugLine="Dim Res As Int=Msgbox2(\"توجه داشته باشید که با";
_res = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("توجه داشته باشید که با تغییر تیپ قیمت سبد خرید شما حذف می گردد، آیا می خواهید تیپ قیمت تغییر کند؟"),BA.ObjectToCharSequence("توجه"),"بله","","خیر",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=37552144;
 //BA.debugLineNum = 37552144;BA.debugLine="If Res = DialogResponse.POSITIVE Then";
if (true) break;

case 4:
//if
this.state = 13;
if (_res==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=37552146;
 //BA.debugLineNum = 37552146;BA.debugLine="If Result=0 Then";
if (true) break;

case 7:
//if
this.state = 12;
if (_result==0) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
RDebugUtils.currentLine=37552147;
 //BA.debugLineNum = 37552147;BA.debugLine="FeeTip = 0";
parent._feetip = BA.NumberToString(0);
RDebugUtils.currentLine=37552148;
 //BA.debugLineNum = 37552148;BA.debugLine="MCode.feeTip=0";
parent.mostCurrent._mcode._feetip /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=37552149;
 //BA.debugLineNum = 37552149;BA.debugLine="MCode.feeCode=0";
parent.mostCurrent._mcode._feecode /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=37552150;
 //BA.debugLineNum = 37552150;BA.debugLine="LoadKala";
_loadkala();
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=37552152;
 //BA.debugLineNum = 37552152;BA.debugLine="Dim ItemTasvie As AdapterListNoeTasvie";
_itemtasvie = new ir.parsikhesab.pakhsh.mcode._adapterlistnoetasvie();
RDebugUtils.currentLine=37552153;
 //BA.debugLineNum = 37552153;BA.debugLine="ItemTasvie.Initialize";
_itemtasvie.Initialize();
RDebugUtils.currentLine=37552154;
 //BA.debugLineNum = 37552154;BA.debugLine="ItemTasvie=ListTasvie.Get(FeeTip)";
_itemtasvie = (ir.parsikhesab.pakhsh.mcode._adapterlistnoetasvie)(parent.mostCurrent._listtasvie.Get((int)(Double.parseDouble(parent._feetip))));
RDebugUtils.currentLine=37552155;
 //BA.debugLineNum = 37552155;BA.debugLine="FeeTip = Result";
parent._feetip = BA.NumberToString(_result);
RDebugUtils.currentLine=37552156;
 //BA.debugLineNum = 37552156;BA.debugLine="MCode.feeTip=Result";
parent.mostCurrent._mcode._feetip /*String*/  = BA.NumberToString(_result);
RDebugUtils.currentLine=37552157;
 //BA.debugLineNum = 37552157;BA.debugLine="MCode.feeCode=ItemTasvie.FldC_Tasvie";
parent.mostCurrent._mcode._feecode /*String*/  = _itemtasvie.FldC_Tasvie /*String*/ ;
RDebugUtils.currentLine=37552158;
 //BA.debugLineNum = 37552158;BA.debugLine="Log(\"Fee: \"&Result)";
anywheresoftware.b4a.keywords.Common.LogImpl("537552158","Fee: "+BA.NumberToString(_result),0);
RDebugUtils.currentLine=37552160;
 //BA.debugLineNum = 37552160;BA.debugLine="UpdateFee";
_updatefee();
 if (true) break;

case 12:
//C
this.state = 13;
;
 if (true) break;

case 13:
//C
this.state = 14;
;
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=37552169;
 //BA.debugLineNum = 37552169;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _input_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "input_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "input_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=38010880;
 //BA.debugLineNum = 38010880;BA.debugLine="Sub input_TextChanged (Old As String, New As Strin";
RDebugUtils.currentLine=38010881;
 //BA.debugLineNum = 38010881;BA.debugLine="Log(Old)";
anywheresoftware.b4a.keywords.Common.LogImpl("538010881",_old,0);
RDebugUtils.currentLine=38010882;
 //BA.debugLineNum = 38010882;BA.debugLine="End Sub";
return "";
}
public static String  _lblbackgroup_click() throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lblbackgroup_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lblbackgroup_click", null));}
RDebugUtils.currentLine=39518208;
 //BA.debugLineNum = 39518208;BA.debugLine="Private Sub lblBackGroup_Click";
RDebugUtils.currentLine=39518209;
 //BA.debugLineNum = 39518209;BA.debugLine="If MCode.C_LayeKala.Length > 3 Then";
if (mostCurrent._mcode._c_layekala /*String*/ .length()>3) { 
RDebugUtils.currentLine=39518211;
 //BA.debugLineNum = 39518211;BA.debugLine="If MCode.C_LayeKala.Length=6 Then";
if (mostCurrent._mcode._c_layekala /*String*/ .length()==6) { 
RDebugUtils.currentLine=39518212;
 //BA.debugLineNum = 39518212;BA.debugLine="lblBackGroup.Visible=False";
mostCurrent._lblbackgroup.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=39518214;
 //BA.debugLineNum = 39518214;BA.debugLine="LoadGoroohKalaBack(MCode.C_LayeKala)";
_loadgoroohkalaback(mostCurrent._mcode._c_layekala /*String*/ );
 }else {
RDebugUtils.currentLine=39518216;
 //BA.debugLineNum = 39518216;BA.debugLine="lblBackGroup.Visible=False";
mostCurrent._lblbackgroup.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=39518218;
 //BA.debugLineNum = 39518218;BA.debugLine="End Sub";
return "";
}
public static String  _lblgift_click() throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lblgift_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lblgift_click", null));}
RDebugUtils.currentLine=39649280;
 //BA.debugLineNum = 39649280;BA.debugLine="Private Sub LblGift_Click";
RDebugUtils.currentLine=39649281;
 //BA.debugLineNum = 39649281;BA.debugLine="If LblGiftCount.Text>0 Then";
if ((double)(Double.parseDouble(mostCurrent._lblgiftcount.getText()))>0) { 
RDebugUtils.currentLine=39649282;
 //BA.debugLineNum = 39649282;BA.debugLine="If Table1.IsInitialized Then";
if (mostCurrent._table1.IsInitialized /*boolean*/ ()) { 
RDebugUtils.currentLine=39649283;
 //BA.debugLineNum = 39649283;BA.debugLine="PnlTableEshantion.RemoveAllViews";
mostCurrent._pnltableeshantion.RemoveAllViews();
 };
RDebugUtils.currentLine=39649285;
 //BA.debugLineNum = 39649285;BA.debugLine="Table1.Initialize(Me, \"Table1\",6)";
mostCurrent._table1._initialize /*String*/ (null,mostCurrent.activityBA,act_kaladefault.getObject(),"Table1",(int) (6));
RDebugUtils.currentLine=39649286;
 //BA.debugLineNum = 39649286;BA.debugLine="Table1.AddToActivity(PnlTableEshantion, 1%x,1%y,";
mostCurrent._table1._addtoactivity /*String*/ (null,(anywheresoftware.b4a.objects.ActivityWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ActivityWrapper(), (anywheresoftware.b4a.BALayout)(mostCurrent._pnltableeshantion.getObject())),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (1),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (1),mostCurrent.activityBA),mostCurrent._pnltableeshantion.getWidth(),mostCurrent._pnltableeshantion.getHeight());
RDebugUtils.currentLine=39649287;
 //BA.debugLineNum = 39649287;BA.debugLine="Grid";
_grid();
RDebugUtils.currentLine=39649288;
 //BA.debugLineNum = 39649288;BA.debugLine="PnlEshantion.Visible=True";
mostCurrent._pnleshantion.setVisible(anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=39649291;
 //BA.debugLineNum = 39649291;BA.debugLine="End Sub";
return "";
}
public static void  _lbltedadjoz_click(ir.parsikhesab.pakhsh.mcode._adapterlistkala _item) throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lbltedadjoz_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "lbltedadjoz_click", new Object[] {_item}); return;}
ResumableSub_LblTedadJoz_Click rsub = new ResumableSub_LblTedadJoz_Click(null,_item);
rsub.resume(processBA, null);
}
public static class ResumableSub_LblTedadJoz_Click extends BA.ResumableSub {
public ResumableSub_LblTedadJoz_Click(ir.parsikhesab.pakhsh.act_kaladefault parent,ir.parsikhesab.pakhsh.mcode._adapterlistkala _item) {
this.parent = parent;
this._item = _item;
}
ir.parsikhesab.pakhsh.act_kaladefault parent;
ir.parsikhesab.pakhsh.mcode._adapterlistkala _item;
ir.parsikhesab.pakhsh.b4xinputtemplate _input = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rs = null;
int _result = 0;
float _res = 0f;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_kaladefault";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=38207489;
 //BA.debugLineNum = 38207489;BA.debugLine="Dialog.Title = \"  \"";
parent.mostCurrent._dialog._title /*Object*/  = (Object)("  ");
RDebugUtils.currentLine=38207490;
 //BA.debugLineNum = 38207490;BA.debugLine="Dim input As B4XInputTemplate";
_input = new ir.parsikhesab.pakhsh.b4xinputtemplate();
RDebugUtils.currentLine=38207491;
 //BA.debugLineNum = 38207491;BA.debugLine="input.Initialize";
_input._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=38207492;
 //BA.debugLineNum = 38207492;BA.debugLine="input.lblTitle.Text = \" تعداد \"&Item.NameVahed";
_input._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(" تعداد "+_item.NameVahed /*String*/ ));
RDebugUtils.currentLine=38207493;
 //BA.debugLineNum = 38207493;BA.debugLine="Log(MCode.isFloat)";
anywheresoftware.b4a.keywords.Common.LogImpl("538207493",BA.ObjectToString(parent.mostCurrent._mcode._isfloat /*boolean*/ ),0);
RDebugUtils.currentLine=38207494;
 //BA.debugLineNum = 38207494;BA.debugLine="MCode.isFloat = True";
parent.mostCurrent._mcode._isfloat /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=38207495;
 //BA.debugLineNum = 38207495;BA.debugLine="Select Case MCode.isFloat";
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
RDebugUtils.currentLine=38207497;
 //BA.debugLineNum = 38207497;BA.debugLine="input.ConfigureForNumbers(True, True)";
_input._configurefornumbers /*String*/ (null,anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=38207499;
 //BA.debugLineNum = 38207499;BA.debugLine="input.ConfigureForNumbers(False, True)";
_input._configurefornumbers /*String*/ (null,anywheresoftware.b4a.keywords.Common.False,anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=38207502;
 //BA.debugLineNum = 38207502;BA.debugLine="Dim rs As ResumableSub =Dialog.ShowTemplate(input";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = parent.mostCurrent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_input),(Object)("OK"),(Object)(""),(Object)("CANCEL"));
RDebugUtils.currentLine=38207503;
 //BA.debugLineNum = 38207503;BA.debugLine="Dialog.Base.Top = 50%y - Dialog.Base.Height / 2";
parent.mostCurrent._dialog._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTop((int) (anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (50),mostCurrent.activityBA)-parent.mostCurrent._dialog._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2));
RDebugUtils.currentLine=38207504;
 //BA.debugLineNum = 38207504;BA.debugLine="Wait For (rs) Complete (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_kaladefault", "lbltedadjoz_click"), _rs);
this.state = 27;
return;
case 27:
//C
this.state = 7;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=38207505;
 //BA.debugLineNum = 38207505;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=38207506;
 //BA.debugLineNum = 38207506;BA.debugLine="Dim res As Float = input.Text 'no need to check";
_res = (float)(Double.parseDouble(_input._text /*String*/ ));
RDebugUtils.currentLine=38207507;
 //BA.debugLineNum = 38207507;BA.debugLine="If res>=0 Then";
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
RDebugUtils.currentLine=38207508;
 //BA.debugLineNum = 38207508;BA.debugLine="If MCode.ForooshBishAzMojoodi = \"1\" Then";
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
RDebugUtils.currentLine=38207509;
 //BA.debugLineNum = 38207509;BA.debugLine="Item.SumMande = Item.SumMande - (res-Item.Teda";
_item.SumMande /*String*/  = BA.NumberToString((double)(Double.parseDouble(_item.SumMande /*String*/ ))-(_res-(double)(Double.parseDouble(_item.TedadDarSabadJoz /*String*/ ))));
RDebugUtils.currentLine=38207510;
 //BA.debugLineNum = 38207510;BA.debugLine="Item.TedadDarSabadJoz = res";
_item.TedadDarSabadJoz /*String*/  = BA.NumberToString(_res);
RDebugUtils.currentLine=38207511;
 //BA.debugLineNum = 38207511;BA.debugLine="AddToSabad(Item)";
_addtosabad(_item);
 if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=38207513;
 //BA.debugLineNum = 38207513;BA.debugLine="If (Item.SumMande + Item.TedadDarSabadJoz) >=";
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
RDebugUtils.currentLine=38207514;
 //BA.debugLineNum = 38207514;BA.debugLine="Item.SumMande = Item.SumMande - (res-Item.Ted";
_item.SumMande /*String*/  = BA.NumberToString((double)(Double.parseDouble(_item.SumMande /*String*/ ))-(_res-(double)(Double.parseDouble(_item.TedadDarSabadJoz /*String*/ ))));
RDebugUtils.currentLine=38207515;
 //BA.debugLineNum = 38207515;BA.debugLine="Item.TedadDarSabadJoz = res";
_item.TedadDarSabadJoz /*String*/  = BA.NumberToString(_res);
RDebugUtils.currentLine=38207516;
 //BA.debugLineNum = 38207516;BA.debugLine="AddToSabad(Item)";
_addtosabad(_item);
 if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=38207518;
 //BA.debugLineNum = 38207518;BA.debugLine="ToastMessageShow(\"سفارش شما بیشتر از موجودی م";
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
RDebugUtils.currentLine=38207524;
 //BA.debugLineNum = 38207524;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _lbltedadkol_click(ir.parsikhesab.pakhsh.mcode._adapterlistkala _item) throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lbltedadkol_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "lbltedadkol_click", new Object[] {_item}); return;}
ResumableSub_LblTedadkol_Click rsub = new ResumableSub_LblTedadkol_Click(null,_item);
rsub.resume(processBA, null);
}
public static class ResumableSub_LblTedadkol_Click extends BA.ResumableSub {
public ResumableSub_LblTedadkol_Click(ir.parsikhesab.pakhsh.act_kaladefault parent,ir.parsikhesab.pakhsh.mcode._adapterlistkala _item) {
this.parent = parent;
this._item = _item;
}
ir.parsikhesab.pakhsh.act_kaladefault parent;
ir.parsikhesab.pakhsh.mcode._adapterlistkala _item;
ir.parsikhesab.pakhsh.b4xinputtemplate _input = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rs = null;
int _result = 0;
float _res = 0f;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_kaladefault";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=38273025;
 //BA.debugLineNum = 38273025;BA.debugLine="Dialog.Title = \"  \"";
parent.mostCurrent._dialog._title /*Object*/  = (Object)("  ");
RDebugUtils.currentLine=38273026;
 //BA.debugLineNum = 38273026;BA.debugLine="Dim input As B4XInputTemplate";
_input = new ir.parsikhesab.pakhsh.b4xinputtemplate();
RDebugUtils.currentLine=38273027;
 //BA.debugLineNum = 38273027;BA.debugLine="input.Initialize";
_input._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=38273028;
 //BA.debugLineNum = 38273028;BA.debugLine="input.lblTitle.Text = \" تعداد \"&Item.NameVahed2";
_input._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(" تعداد "+_item.NameVahed2 /*String*/ ));
RDebugUtils.currentLine=38273029;
 //BA.debugLineNum = 38273029;BA.debugLine="input.ConfigureForNumbers(True, True)";
_input._configurefornumbers /*String*/ (null,anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=38273031;
 //BA.debugLineNum = 38273031;BA.debugLine="Dim rs As ResumableSub =Dialog.ShowTemplate(input";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = parent.mostCurrent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_input),(Object)("OK"),(Object)(""),(Object)("CANCEL"));
RDebugUtils.currentLine=38273032;
 //BA.debugLineNum = 38273032;BA.debugLine="Dialog.Base.Top = 50%y - Dialog.Base.Height / 2";
parent.mostCurrent._dialog._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTop((int) (anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (50),mostCurrent.activityBA)-parent.mostCurrent._dialog._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2));
RDebugUtils.currentLine=38273033;
 //BA.debugLineNum = 38273033;BA.debugLine="Wait For (rs) Complete (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_kaladefault", "lbltedadkol_click"), _rs);
this.state = 21;
return;
case 21:
//C
this.state = 1;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=38273034;
 //BA.debugLineNum = 38273034;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=38273035;
 //BA.debugLineNum = 38273035;BA.debugLine="Dim res As Float = input.Text 'no need to check";
_res = (float)(Double.parseDouble(_input._text /*String*/ ));
RDebugUtils.currentLine=38273036;
 //BA.debugLineNum = 38273036;BA.debugLine="If res>=0 Then";
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
RDebugUtils.currentLine=38273037;
 //BA.debugLineNum = 38273037;BA.debugLine="If MCode.ForooshBishAzMojoodi = \"1\" Then";
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
RDebugUtils.currentLine=38273038;
 //BA.debugLineNum = 38273038;BA.debugLine="Item.SumMande = Item.SumMande - ((res*Item.Ted";
_item.SumMande /*String*/  = BA.NumberToString((double)(Double.parseDouble(_item.SumMande /*String*/ ))-((_res*(double)(Double.parseDouble(_item.TedadDarKarton /*String*/ )))-((double)(Double.parseDouble(_item.TedadDarSabadKol /*String*/ ))*(double)(Double.parseDouble(_item.TedadDarKarton /*String*/ )))));
RDebugUtils.currentLine=38273039;
 //BA.debugLineNum = 38273039;BA.debugLine="Item.TedadDarSabadKol = res";
_item.TedadDarSabadKol /*String*/  = BA.NumberToString(_res);
RDebugUtils.currentLine=38273040;
 //BA.debugLineNum = 38273040;BA.debugLine="AddToSabad(Item)";
_addtosabad(_item);
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=38273042;
 //BA.debugLineNum = 38273042;BA.debugLine="If (Item.SumMande + (Item.TedadDarSabadKol*Ite";
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
RDebugUtils.currentLine=38273043;
 //BA.debugLineNum = 38273043;BA.debugLine="Item.SumMande = Item.SumMande - ((res*Item.Te";
_item.SumMande /*String*/  = BA.NumberToString((double)(Double.parseDouble(_item.SumMande /*String*/ ))-((_res*(double)(Double.parseDouble(_item.TedadDarKarton /*String*/ )))-((double)(Double.parseDouble(_item.TedadDarSabadKol /*String*/ ))*(double)(Double.parseDouble(_item.TedadDarKarton /*String*/ )))));
RDebugUtils.currentLine=38273044;
 //BA.debugLineNum = 38273044;BA.debugLine="Item.TedadDarSabadKol = res";
_item.TedadDarSabadKol /*String*/  = BA.NumberToString(_res);
RDebugUtils.currentLine=38273045;
 //BA.debugLineNum = 38273045;BA.debugLine="AddToSabad(Item)";
_addtosabad(_item);
 if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=38273047;
 //BA.debugLineNum = 38273047;BA.debugLine="ToastMessageShow(\"سفارش شما بیشتر از موجودی م";
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
RDebugUtils.currentLine=38273052;
 //BA.debugLineNum = 38273052;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.objects.collections.List  _loadacspnoetasvie() throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "loadacspnoetasvie", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(mostCurrent.activityBA, "loadacspnoetasvie", null));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
String[] _somearray = null;
int _i = 0;
ir.parsikhesab.pakhsh.mcode._adapterlistnoetasvie _item = null;
RDebugUtils.currentLine=37486592;
 //BA.debugLineNum = 37486592;BA.debugLine="Sub LoadAcSpNoeTasvie As List";
RDebugUtils.currentLine=37486593;
 //BA.debugLineNum = 37486593;BA.debugLine="Try";
try {RDebugUtils.currentLine=37486594;
 //BA.debugLineNum = 37486594;BA.debugLine="Dim ListTasvie As List";
mostCurrent._listtasvie = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=37486595;
 //BA.debugLineNum = 37486595;BA.debugLine="ListTasvie.Initialize";
mostCurrent._listtasvie.Initialize();
RDebugUtils.currentLine=37486596;
 //BA.debugLineNum = 37486596;BA.debugLine="Dim Cu As Cursor =MCode.Result(\"Select * From Tbl";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblTasvie");
RDebugUtils.currentLine=37486597;
 //BA.debugLineNum = 37486597;BA.debugLine="Dim SomeArray(Cu.RowCount+1) As String";
_somearray = new String[(int) (_cu.getRowCount()+1)];
java.util.Arrays.fill(_somearray,"");
RDebugUtils.currentLine=37486598;
 //BA.debugLineNum = 37486598;BA.debugLine="SomeArray(0)=\"انتخاب کنید\"";
_somearray[(int) (0)] = "انتخاب کنید";
RDebugUtils.currentLine=37486599;
 //BA.debugLineNum = 37486599;BA.debugLine="If Cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=37486600;
 //BA.debugLineNum = 37486600;BA.debugLine="For i = 0 To Cu.RowCount-1";
{
final int step8 = 1;
final int limit8 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
RDebugUtils.currentLine=37486601;
 //BA.debugLineNum = 37486601;BA.debugLine="Cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=37486602;
 //BA.debugLineNum = 37486602;BA.debugLine="Dim Item As AdapterListNoeTasvie";
_item = new ir.parsikhesab.pakhsh.mcode._adapterlistnoetasvie();
RDebugUtils.currentLine=37486603;
 //BA.debugLineNum = 37486603;BA.debugLine="Item.FldC_Tasvie=Cu.GetString(\"FldCode\")";
_item.FldC_Tasvie /*String*/  = _cu.GetString("FldCode");
RDebugUtils.currentLine=37486604;
 //BA.debugLineNum = 37486604;BA.debugLine="Item.FldN_Tasvie=Cu.GetString(\"FldName\")";
_item.FldN_Tasvie /*String*/  = _cu.GetString("FldName");
RDebugUtils.currentLine=37486605;
 //BA.debugLineNum = 37486605;BA.debugLine="ListTasvie.Add(Item)";
mostCurrent._listtasvie.Add((Object)(_item));
RDebugUtils.currentLine=37486607;
 //BA.debugLineNum = 37486607;BA.debugLine="SomeArray(i+1)=Cu.GetString(\"FldName\")";
_somearray[(int) (_i+1)] = _cu.GetString("FldName");
 }
};
RDebugUtils.currentLine=37486609;
 //BA.debugLineNum = 37486609;BA.debugLine="MCode.ArrayTasvieForKala=SomeArray";
mostCurrent._mcode._arraytasvieforkala /*String[]*/  = _somearray;
 };
RDebugUtils.currentLine=37486611;
 //BA.debugLineNum = 37486611;BA.debugLine="Return ListTasvie";
if (true) return mostCurrent._listtasvie;
 } 
       catch (Exception e20) {
			processBA.setLastException(e20);RDebugUtils.currentLine=37486614;
 //BA.debugLineNum = 37486614;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("537486614",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=37486615;
 //BA.debugLineNum = 37486615;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-Img_sort_Click");
RDebugUtils.currentLine=37486616;
 //BA.debugLineNum = 37486616;BA.debugLine="Return Null";
if (true) return (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null));
 };
RDebugUtils.currentLine=37486618;
 //BA.debugLineNum = 37486618;BA.debugLine="End Sub";
return null;
}
public static String  _loadnoetasvie() throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "loadnoetasvie", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "loadnoetasvie", null));}
ir.parsikhesab.pakhsh.mcode._adapterlistnoetasvie _itemtasvie = null;
int _count = 0;
int _i = 0;
RDebugUtils.currentLine=38993920;
 //BA.debugLineNum = 38993920;BA.debugLine="Sub LoadNoeTasvie";
RDebugUtils.currentLine=38993921;
 //BA.debugLineNum = 38993921;BA.debugLine="Dim ItemTasvie As AdapterListNoeTasvie";
_itemtasvie = new ir.parsikhesab.pakhsh.mcode._adapterlistnoetasvie();
RDebugUtils.currentLine=38993922;
 //BA.debugLineNum = 38993922;BA.debugLine="ItemTasvie.Initialize";
_itemtasvie.Initialize();
RDebugUtils.currentLine=38993923;
 //BA.debugLineNum = 38993923;BA.debugLine="CmbBox1.cmbBox.Clear";
mostCurrent._cmbbox1._cmbbox /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Clear();
RDebugUtils.currentLine=38993924;
 //BA.debugLineNum = 38993924;BA.debugLine="CmbBox1.cmbBox.Add(\"انتخاب کنید\")";
mostCurrent._cmbbox1._cmbbox /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add("انتخاب کنید");
RDebugUtils.currentLine=38993925;
 //BA.debugLineNum = 38993925;BA.debugLine="Dim count As Int =ListTasvie.Size";
_count = mostCurrent._listtasvie.getSize();
RDebugUtils.currentLine=38993926;
 //BA.debugLineNum = 38993926;BA.debugLine="If count> 0 Then";
if (_count>0) { 
RDebugUtils.currentLine=38993927;
 //BA.debugLineNum = 38993927;BA.debugLine="For i = 0 To count-1";
{
final int step7 = 1;
final int limit7 = (int) (_count-1);
_i = (int) (0) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
RDebugUtils.currentLine=38993928;
 //BA.debugLineNum = 38993928;BA.debugLine="ItemTasvie=ListTasvie.Get(i)";
_itemtasvie = (ir.parsikhesab.pakhsh.mcode._adapterlistnoetasvie)(mostCurrent._listtasvie.Get(_i));
RDebugUtils.currentLine=38993930;
 //BA.debugLineNum = 38993930;BA.debugLine="CmbBox1.cmbBox.Add(ItemTasvie.FldN_Tasvie)";
mostCurrent._cmbbox1._cmbbox /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add(_itemtasvie.FldN_Tasvie /*String*/ );
 }
};
RDebugUtils.currentLine=38993932;
 //BA.debugLineNum = 38993932;BA.debugLine="CmbBox1.SelectedIndex=MCode.feeTip";
mostCurrent._cmbbox1._setselectedindex /*int*/ (null,(int)(Double.parseDouble(mostCurrent._mcode._feetip /*String*/ )));
 };
RDebugUtils.currentLine=38993934;
 //BA.debugLineNum = 38993934;BA.debugLine="End Sub";
return "";
}
public static void  _loadlistkala(String _query) throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "loadlistkala", false))
	 {Debug.delegate(mostCurrent.activityBA, "loadlistkala", new Object[] {_query}); return;}
ResumableSub_LoadListKala rsub = new ResumableSub_LoadListKala(null,_query);
rsub.resume(processBA, null);
}
public static class ResumableSub_LoadListKala extends BA.ResumableSub {
public ResumableSub_LoadListKala(ir.parsikhesab.pakhsh.act_kaladefault parent,String _query) {
this.parent = parent;
this._query = _query;
}
ir.parsikhesab.pakhsh.act_kaladefault parent;
String _query;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
int _i = 0;
ir.parsikhesab.pakhsh.mcode._adapterlistkala _itemkala = null;
String _fee = "";
String _countsabad = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu1 = null;
int _fldfeeforoosh = 0;
int _fldtedaddarkarton = 0;
int _summande = 0;
long _sumkol = 0L;
int step6;
int limit6;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_kaladefault";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=35389441;
 //BA.debugLineNum = 35389441;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 114;
this.catchState = 113;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 113;
RDebugUtils.currentLine=35389447;
 //BA.debugLineNum = 35389447;BA.debugLine="OrginalListKala.Clear";
parent.mostCurrent._orginallistkala.Clear();
RDebugUtils.currentLine=35389448;
 //BA.debugLineNum = 35389448;BA.debugLine="Dim Cu As Cursor = MCode.Result(Query)";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = parent.mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,_query);
RDebugUtils.currentLine=35389449;
 //BA.debugLineNum = 35389449;BA.debugLine="If Cu.RowCount > 0 Then";
if (true) break;

case 4:
//if
this.state = 111;
if (_cu.getRowCount()>0) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=35389450;
 //BA.debugLineNum = 35389450;BA.debugLine="StopService(FusedLocationService)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(parent.mostCurrent._fusedlocationservice.getObject()));
RDebugUtils.currentLine=35389453;
 //BA.debugLineNum = 35389453;BA.debugLine="For i = 0 To Cu.RowCount - 1";
if (true) break;

case 7:
//for
this.state = 110;
step6 = 1;
limit6 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
this.state = 115;
if (true) break;

case 115:
//C
this.state = 110;
if ((step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6)) this.state = 9;
if (true) break;

case 116:
//C
this.state = 115;
_i = ((int)(0 + _i + step6)) ;
if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=35389454;
 //BA.debugLineNum = 35389454;BA.debugLine="Dim ItemKala As AdapterListKala";
_itemkala = new ir.parsikhesab.pakhsh.mcode._adapterlistkala();
RDebugUtils.currentLine=35389455;
 //BA.debugLineNum = 35389455;BA.debugLine="Cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=35389456;
 //BA.debugLineNum = 35389456;BA.debugLine="ItemKala.CodeGroup=Cu.Getstring(\"fldCodeGroup\"";
_itemkala.CodeGroup /*String*/  = _cu.GetString("fldCodeGroup");
RDebugUtils.currentLine=35389457;
 //BA.debugLineNum = 35389457;BA.debugLine="ItemKala.CodeKala=Cu.Getstring(\"fldCodeKala\")";
_itemkala.CodeKala /*String*/  = _cu.GetString("fldCodeKala");
RDebugUtils.currentLine=35389458;
 //BA.debugLineNum = 35389458;BA.debugLine="ItemKala.NameKala=Cu.Getstring(\"fldNameKala\")";
_itemkala.NameKala /*String*/  = _cu.GetString("fldNameKala");
RDebugUtils.currentLine=35389459;
 //BA.debugLineNum = 35389459;BA.debugLine="ItemKala.NameVahed=Cu.Getstring(\"fldNameVahed\"";
_itemkala.NameVahed /*String*/  = _cu.GetString("fldNameVahed");
RDebugUtils.currentLine=35389460;
 //BA.debugLineNum = 35389460;BA.debugLine="ItemKala.NameVahed2=Cu.Getstring(\"fldNameVahed";
_itemkala.NameVahed2 /*String*/  = _cu.GetString("fldNameVahed2");
RDebugUtils.currentLine=35389461;
 //BA.debugLineNum = 35389461;BA.debugLine="ItemKala.fldSharh=Cu.Getstring(\"fldSharh\")";
_itemkala.fldSharh /*String*/  = _cu.GetString("fldSharh");
RDebugUtils.currentLine=35389462;
 //BA.debugLineNum = 35389462;BA.debugLine="ItemKala.SumMande=Cu.Getstring(\"SumMande\")";
_itemkala.SumMande /*String*/  = _cu.GetString("SumMande");
RDebugUtils.currentLine=35389463;
 //BA.debugLineNum = 35389463;BA.debugLine="ItemKala.fldDarsadArzeshAfzodeKala=myCode.Is_N";
_itemkala.fldDarsadArzeshAfzodeKala /*String*/  = parent.mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_cu.GetString("fldArzeshAfzode"));
RDebugUtils.currentLine=35389464;
 //BA.debugLineNum = 35389464;BA.debugLine="ItemKala.TedadDarKarton =Cu.Getstring(\"fldTeda";
_itemkala.TedadDarKarton /*String*/  = _cu.GetString("fldTedadDarKarton");
RDebugUtils.currentLine=35389467;
 //BA.debugLineNum = 35389467;BA.debugLine="Dim fee As String";
_fee = "";
RDebugUtils.currentLine=35389468;
 //BA.debugLineNum = 35389468;BA.debugLine="If MCode.feeTip=0 Then";
if (true) break;

case 10:
//if
this.state = 29;
if ((parent.mostCurrent._mcode._feetip /*String*/ ).equals(BA.NumberToString(0))) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 29;
RDebugUtils.currentLine=35389469;
 //BA.debugLineNum = 35389469;BA.debugLine="fee=Cu.GetInt(\"fldFeeForoosh\")";
_fee = BA.NumberToString(_cu.GetInt("fldFeeForoosh"));
 if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=35389475;
 //BA.debugLineNum = 35389475;BA.debugLine="fee=myCode.Is_Null_adad(Cu.GetString(\"fldFeeT";
_fee = parent.mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_cu.GetString("fldFeeTasvie"));
RDebugUtils.currentLine=35389477;
 //BA.debugLineNum = 35389477;BA.debugLine="If 	IsNumber(fee) And fee>0 Then";
if (true) break;

case 15:
//if
this.state = 28;
if (anywheresoftware.b4a.keywords.Common.IsNumber(_fee) && (double)(Double.parseDouble(_fee))>0) { 
this.state = 17;
}else {
this.state = 27;
}if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=35389478;
 //BA.debugLineNum = 35389478;BA.debugLine="Log(Cu.GetString(\"fldFeeTasvie\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("535389478",_cu.GetString("fldFeeTasvie"),0);
RDebugUtils.currentLine=35389480;
 //BA.debugLineNum = 35389480;BA.debugLine="If  fee>Cu.GetString(\"fldFeeBadAzTakhfif\") T";
if (true) break;

case 18:
//if
this.state = 25;
if ((double)(Double.parseDouble(_fee))>(double)(Double.parseDouble(_cu.GetString("fldFeeBadAzTakhfif")))) { 
this.state = 20;
}else 
{RDebugUtils.currentLine=35389483;
 //BA.debugLineNum = 35389483;BA.debugLine="Else if fee<Cu.GetString(\"fldFeeBadAzTakhfif";
if ((double)(Double.parseDouble(_fee))<(double)(Double.parseDouble(_cu.GetString("fldFeeBadAzTakhfif")))) { 
this.state = 22;
}else {
this.state = 24;
}}
if (true) break;

case 20:
//C
this.state = 25;
RDebugUtils.currentLine=35389482;
 //BA.debugLineNum = 35389482;BA.debugLine="ItemKala.fldFeeBadAzTakhfif=\"0\"";
_itemkala.fldFeeBadAzTakhfif /*String*/  = "0";
 if (true) break;

case 22:
//C
this.state = 25;
RDebugUtils.currentLine=35389484;
 //BA.debugLineNum = 35389484;BA.debugLine="ItemKala.fldFeeBadAzTakhfif=fee";
_itemkala.fldFeeBadAzTakhfif /*String*/  = _fee;
RDebugUtils.currentLine=35389485;
 //BA.debugLineNum = 35389485;BA.debugLine="fee=Cu.GetInt(\"fldFeeForoosh\")";
_fee = BA.NumberToString(_cu.GetInt("fldFeeForoosh"));
 if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=35389489;
 //BA.debugLineNum = 35389489;BA.debugLine="ItemKala.fldFeeBadAzTakhfif=Cu.GetString(\"f";
_itemkala.fldFeeBadAzTakhfif /*String*/  = _cu.GetString("fldFeeBadAzTakhfif");
RDebugUtils.currentLine=35389490;
 //BA.debugLineNum = 35389490;BA.debugLine="fee=Cu.GetInt(\"fldFeeForoosh\")";
_fee = BA.NumberToString(_cu.GetInt("fldFeeForoosh"));
 if (true) break;

case 25:
//C
this.state = 28;
;
 if (true) break;

case 27:
//C
this.state = 28;
RDebugUtils.currentLine=35389494;
 //BA.debugLineNum = 35389494;BA.debugLine="fee=Cu.GetInt(\"fldFeeForoosh\")";
_fee = BA.NumberToString(_cu.GetInt("fldFeeForoosh"));
 if (true) break;

case 28:
//C
this.state = 29;
;
 if (true) break;

case 29:
//C
this.state = 30;
;
RDebugUtils.currentLine=35389508;
 //BA.debugLineNum = 35389508;BA.debugLine="Dim countSabad As String=MCode.SingleResult(\"s";
_countsabad = BA.ObjectToString(parent.mostCurrent._mcode._singleresult /*Object*/ (mostCurrent.activityBA,"select count(FldId) from TblSabad where FldCodeKala="+_itemkala.CodeKala /*String*/ ));
RDebugUtils.currentLine=35389509;
 //BA.debugLineNum = 35389509;BA.debugLine="If countSabad>0 Then";
if (true) break;

case 30:
//if
this.state = 109;
if ((double)(Double.parseDouble(_countsabad))>0) { 
this.state = 32;
}else {
this.state = 89;
}if (true) break;

case 32:
//C
this.state = 33;
RDebugUtils.currentLine=35389510;
 //BA.debugLineNum = 35389510;BA.debugLine="Dim cu1 As Cursor=MCode.Result(\"select * from";
_cu1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu1 = parent.mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"select * from TblSabad where FldCodeKala="+_itemkala.CodeKala /*String*/ );
RDebugUtils.currentLine=35389511;
 //BA.debugLineNum = 35389511;BA.debugLine="cu1.Position=0";
_cu1.setPosition((int) (0));
RDebugUtils.currentLine=35389512;
 //BA.debugLineNum = 35389512;BA.debugLine="FeeTip=MCode.feeTip";
parent._feetip = parent.mostCurrent._mcode._feetip /*String*/ ;
RDebugUtils.currentLine=35389513;
 //BA.debugLineNum = 35389513;BA.debugLine="ItemKala.TedadDarSabadJoz =cu1.Getstring(\"Fld";
_itemkala.TedadDarSabadJoz /*String*/  = _cu1.GetString("FldTedadDarSabadJoz");
RDebugUtils.currentLine=35389514;
 //BA.debugLineNum = 35389514;BA.debugLine="ItemKala.TedadDarSabadKol =cu1.Getstring(\"Fld";
_itemkala.TedadDarSabadKol /*String*/  = _cu1.GetString("FldTedadDarSabadKol");
RDebugUtils.currentLine=35389515;
 //BA.debugLineNum = 35389515;BA.debugLine="ItemKala.SumMande=Cu.Getstring(\"SumMande\")-cu";
_itemkala.SumMande /*String*/  = BA.NumberToString((double)(Double.parseDouble(_cu.GetString("SumMande")))-(double)(Double.parseDouble(_cu1.GetString("FldTedadDarSabadJoz"))));
RDebugUtils.currentLine=35389516;
 //BA.debugLineNum = 35389516;BA.debugLine="If Cu.Getstring(\"fldNameVahed2\") <> \"\" Then";
if (true) break;

case 33:
//if
this.state = 36;
if ((_cu.GetString("fldNameVahed2")).equals("") == false) { 
this.state = 35;
}if (true) break;

case 35:
//C
this.state = 36;
RDebugUtils.currentLine=35389517;
 //BA.debugLineNum = 35389517;BA.debugLine="Dim FldFeeForoosh As Int = MCode.Sf.Val(Cu.G";
_fldfeeforoosh = (int) (parent.mostCurrent._mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvvvv1(BA.NumberToString(_cu.GetInt("fldFeeForoosh"))));
RDebugUtils.currentLine=35389518;
 //BA.debugLineNum = 35389518;BA.debugLine="Dim FldTedadDarKarton As Int = MCode.Sf.Val(";
_fldtedaddarkarton = (int) (parent.mostCurrent._mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvvvv1(_cu1.GetString("FldTedadDarSabadKol")));
RDebugUtils.currentLine=35389519;
 //BA.debugLineNum = 35389519;BA.debugLine="Dim SumMande As Int = Cu.Getstring(\"SumMande";
_summande = (int)(Double.parseDouble(_cu.GetString("SumMande")));
RDebugUtils.currentLine=35389520;
 //BA.debugLineNum = 35389520;BA.debugLine="ItemKala.FeeForooshKarton=FldFeeForoosh * Fl";
_itemkala.FeeForooshKarton /*String*/  = BA.NumberToString(_fldfeeforoosh*_fldtedaddarkarton);
RDebugUtils.currentLine=35389521;
 //BA.debugLineNum = 35389521;BA.debugLine="ItemKala.SumMandeKarton=Round2( SumMande / F";
_itemkala.SumMandeKarton /*String*/  = BA.NumberToString(anywheresoftware.b4a.keywords.Common.Round2(_summande/(double)_fldtedaddarkarton,(int) (0))-(double)(Double.parseDouble(parent.mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_itemkala.TedadDarSabadKol /*String*/ ))));
 if (true) break;

case 36:
//C
this.state = 37;
;
RDebugUtils.currentLine=35389523;
 //BA.debugLineNum = 35389523;BA.debugLine="CmbBox1.SelectedIndex=MCode.feeTip";
parent.mostCurrent._cmbbox1._setselectedindex /*int*/ (null,(int)(Double.parseDouble(parent.mostCurrent._mcode._feetip /*String*/ )));
RDebugUtils.currentLine=35389524;
 //BA.debugLineNum = 35389524;BA.debugLine="If MCode.feeTip=0 Then";
if (true) break;

case 37:
//if
this.state = 42;
if ((parent.mostCurrent._mcode._feetip /*String*/ ).equals(BA.NumberToString(0))) { 
this.state = 39;
}else {
this.state = 41;
}if (true) break;

case 39:
//C
this.state = 42;
RDebugUtils.currentLine=35389525;
 //BA.debugLineNum = 35389525;BA.debugLine="fee=cu1.GetString(\"FldFeeForoosh\")";
_fee = _cu1.GetString("FldFeeForoosh");
 if (true) break;

case 41:
//C
this.state = 42;
RDebugUtils.currentLine=35389527;
 //BA.debugLineNum = 35389527;BA.debugLine="fee=MCode.GetUpdateFeeSabad(fee,ItemKala.Cod";
_fee = parent.mostCurrent._mcode._getupdatefeesabad /*String*/ (mostCurrent.activityBA,_fee,_itemkala.CodeKala /*String*/ );
 if (true) break;

case 42:
//C
this.state = 43;
;
RDebugUtils.currentLine=35389533;
 //BA.debugLineNum = 35389533;BA.debugLine="ItemKala.FldEshantion=cu1.Getstring(\"FldEshan";
_itemkala.FldEshantion /*String*/  = _cu1.GetString("FldEshantion");
RDebugUtils.currentLine=35389537;
 //BA.debugLineNum = 35389537;BA.debugLine="If myCode.Is_Null_adad(cu1.GetString(\"FldDars";
if (true) break;

case 43:
//if
this.state = 54;
if ((double)(Double.parseDouble(parent.mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_cu1.GetString("FldDarsadTakhfif"))))>0) { 
this.state = 45;
}else {
this.state = 47;
}if (true) break;

case 45:
//C
this.state = 54;
RDebugUtils.currentLine=35389541;
 //BA.debugLineNum = 35389541;BA.debugLine="ItemKala.fldDarsadTakhfif=cu1.GetString(\"Fld";
_itemkala.fldDarsadTakhfif /*String*/  = _cu1.GetString("FldDarsadTakhfif");
RDebugUtils.currentLine=35389542;
 //BA.debugLineNum = 35389542;BA.debugLine="ItemKala.MablaghTakhfif=((fee*cu1.GetString(";
_itemkala.MablaghTakhfif /*int*/  = (int) ((((double)(Double.parseDouble(_fee))*(double)(Double.parseDouble(_cu1.GetString("FldDarsadTakhfif"))))/(double)100));
RDebugUtils.currentLine=35389544;
 //BA.debugLineNum = 35389544;BA.debugLine="txtFee.Text=MCode.qomaAshar(ItemKala.Mablagh";
parent.mostCurrent._txtfee.setText(BA.ObjectToCharSequence(parent.mostCurrent._mcode._qomaashar /*String*/ (mostCurrent.activityBA,(Object)(_itemkala.MablaghTakhfif /*int*/ ))));
RDebugUtils.currentLine=35389545;
 //BA.debugLineNum = 35389545;BA.debugLine="txtDarsadTakhfif.Text=cu1.GetString(\"FldDars";
parent.mostCurrent._txtdarsadtakhfif.setText(BA.ObjectToCharSequence(_cu1.GetString("FldDarsadTakhfif")));
 if (true) break;

case 47:
//C
this.state = 48;
RDebugUtils.currentLine=35389549;
 //BA.debugLineNum = 35389549;BA.debugLine="If cu1.GetString(\"FldMablaghTakhfif\")>0 And";
if (true) break;

case 48:
//if
this.state = 53;
if ((double)(Double.parseDouble(_cu1.GetString("FldMablaghTakhfif")))>0 && _cu1.GetString("FldMablaghTakhfif")!= null) { 
this.state = 50;
}else {
this.state = 52;
}if (true) break;

case 50:
//C
this.state = 53;
RDebugUtils.currentLine=35389551;
 //BA.debugLineNum = 35389551;BA.debugLine="ItemKala.MablaghTakhfif=cu1.GetString(\"FldM";
_itemkala.MablaghTakhfif /*int*/  = (int)(Double.parseDouble(_cu1.GetString("FldMablaghTakhfif")));
RDebugUtils.currentLine=35389552;
 //BA.debugLineNum = 35389552;BA.debugLine="ItemKala.fldDarsadTakhfif=\"0\"";
_itemkala.fldDarsadTakhfif /*String*/  = "0";
 if (true) break;

case 52:
//C
this.state = 53;
RDebugUtils.currentLine=35389556;
 //BA.debugLineNum = 35389556;BA.debugLine="ItemKala.MablaghTakhfif=\"0\"";
_itemkala.MablaghTakhfif /*int*/  = (int)(Double.parseDouble("0"));
RDebugUtils.currentLine=35389557;
 //BA.debugLineNum = 35389557;BA.debugLine="ItemKala.fldDarsadTakhfif=\"0\"";
_itemkala.fldDarsadTakhfif /*String*/  = "0";
 if (true) break;

case 53:
//C
this.state = 54;
;
 if (true) break;
;
RDebugUtils.currentLine=35389567;
 //BA.debugLineNum = 35389567;BA.debugLine="If Cu.GetString(\"fldFeeBadAzTakhfif\")<>Null T";

case 54:
//if
this.state = 59;
if (_cu.GetString("fldFeeBadAzTakhfif")!= null) { 
this.state = 56;
}else {
this.state = 58;
}if (true) break;

case 56:
//C
this.state = 59;
RDebugUtils.currentLine=35389569;
 //BA.debugLineNum = 35389569;BA.debugLine="ItemKala.fldFeeBadAzTakhfif=Cu.GetString(\"fl";
_itemkala.fldFeeBadAzTakhfif /*String*/  = _cu.GetString("fldFeeBadAzTakhfif");
 if (true) break;

case 58:
//C
this.state = 59;
RDebugUtils.currentLine=35389573;
 //BA.debugLineNum = 35389573;BA.debugLine="ItemKala.fldFeeBadAzTakhfif=\"0\"";
_itemkala.fldFeeBadAzTakhfif /*String*/  = "0";
 if (true) break;
;
RDebugUtils.currentLine=35389576;
 //BA.debugLineNum = 35389576;BA.debugLine="If ItemKala.MablaghTakhfif>0 Then";

case 59:
//if
this.state = 62;
if (_itemkala.MablaghTakhfif /*int*/ >0) { 
this.state = 61;
}if (true) break;

case 61:
//C
this.state = 62;
RDebugUtils.currentLine=35389577;
 //BA.debugLineNum = 35389577;BA.debugLine="ItemKala.fldFeeBadAzTakhfif=fee-ItemKala.Mab";
_itemkala.fldFeeBadAzTakhfif /*String*/  = BA.NumberToString((double)(Double.parseDouble(_fee))-_itemkala.MablaghTakhfif /*int*/ );
 if (true) break;

case 62:
//C
this.state = 63;
;
RDebugUtils.currentLine=35389580;
 //BA.debugLineNum = 35389580;BA.debugLine="ItemKala.FeeForoosh=fee";
_itemkala.FeeForoosh /*int*/  = (int)(Double.parseDouble(_fee));
RDebugUtils.currentLine=35389583;
 //BA.debugLineNum = 35389583;BA.debugLine="ItemKala.FldMablaghMasrafKonande=Cu.GetString";
_itemkala.FldMablaghMasrafKonande /*String*/  = _cu.GetString("fldGhymatMasrafkonande");
RDebugUtils.currentLine=35389587;
 //BA.debugLineNum = 35389587;BA.debugLine="ItemKala.fldPathPic=Cu.GetString(\"fldPathPic\"";
_itemkala.fldPathPic /*String*/  = _cu.GetString("fldPathPic");
RDebugUtils.currentLine=35389594;
 //BA.debugLineNum = 35389594;BA.debugLine="If Cu.Getstring(\"fldNameVahed2\") <> \"\"  Then";
if (true) break;

case 63:
//if
this.state = 72;
if ((_cu.GetString("fldNameVahed2")).equals("") == false) { 
this.state = 65;
}if (true) break;

case 65:
//C
this.state = 66;
RDebugUtils.currentLine=35389595;
 //BA.debugLineNum = 35389595;BA.debugLine="Dim FldFeeForoosh As Int = MCode.Sf.Val(Cu.G";
_fldfeeforoosh = (int) (parent.mostCurrent._mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvvvv1(BA.NumberToString(_cu.GetInt("fldFeeForoosh"))));
RDebugUtils.currentLine=35389596;
 //BA.debugLineNum = 35389596;BA.debugLine="Dim FldTedadDarKarton As Int = MCode.Sf.Val(";
_fldtedaddarkarton = (int) (parent.mostCurrent._mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvvvv1(_cu.GetString("fldTedadDarKarton")));
RDebugUtils.currentLine=35389597;
 //BA.debugLineNum = 35389597;BA.debugLine="Dim SumMande As Int = Cu.Getstring(\"SumMande";
_summande = (int)(Double.parseDouble(_cu.GetString("SumMande")));
RDebugUtils.currentLine=35389598;
 //BA.debugLineNum = 35389598;BA.debugLine="If FldTedadDarKarton>0 Then";
if (true) break;

case 66:
//if
this.state = 71;
if (_fldtedaddarkarton>0) { 
this.state = 68;
}else {
this.state = 70;
}if (true) break;

case 68:
//C
this.state = 71;
RDebugUtils.currentLine=35389599;
 //BA.debugLineNum = 35389599;BA.debugLine="ItemKala.FeeForooshKarton=FldFeeForoosh * F";
_itemkala.FeeForooshKarton /*String*/  = BA.NumberToString(_fldfeeforoosh*_fldtedaddarkarton);
RDebugUtils.currentLine=35389601;
 //BA.debugLineNum = 35389601;BA.debugLine="Dim SumKol As Long=(SumMande / FldTedadDarK";
_sumkol = (long) ((_summande/(double)_fldtedaddarkarton)-(double)(Double.parseDouble(parent.mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_itemkala.TedadDarSabadKol /*String*/ ))));
RDebugUtils.currentLine=35389602;
 //BA.debugLineNum = 35389602;BA.debugLine="ItemKala.SumMandeKarton=SumKol";
_itemkala.SumMandeKarton /*String*/  = BA.NumberToString(_sumkol);
 if (true) break;

case 70:
//C
this.state = 71;
RDebugUtils.currentLine=35389604;
 //BA.debugLineNum = 35389604;BA.debugLine="ItemKala.SumMandeKarton=0";
_itemkala.SumMandeKarton /*String*/  = BA.NumberToString(0);
 if (true) break;

case 71:
//C
this.state = 72;
;
 if (true) break;
;
RDebugUtils.currentLine=35389610;
 //BA.debugLineNum = 35389610;BA.debugLine="If MCode.UpdateSefaresh Then";

case 72:
//if
this.state = 87;
if (parent.mostCurrent._mcode._updatesefaresh /*boolean*/ ) { 
this.state = 74;
}else {
this.state = 80;
}if (true) break;

case 74:
//C
this.state = 75;
RDebugUtils.currentLine=35389611;
 //BA.debugLineNum = 35389611;BA.debugLine="ItemKala.fldDarsadArzeshAfzode=myCode.Is_Nul";
_itemkala.fldDarsadArzeshAfzode /*String*/  = parent.mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_cu1.GetString("fldDarsadArzeshAfzode"));
RDebugUtils.currentLine=35389612;
 //BA.debugLineNum = 35389612;BA.debugLine="If ItemKala.fldDarsadArzeshAfzode>0 Then";
if (true) break;

case 75:
//if
this.state = 78;
if ((double)(Double.parseDouble(_itemkala.fldDarsadArzeshAfzode /*String*/ ))>0) { 
this.state = 77;
}if (true) break;

case 77:
//C
this.state = 78;
RDebugUtils.currentLine=35389613;
 //BA.debugLineNum = 35389613;BA.debugLine="ItemKala.fldArzeshAfzode=cu1.Getstring(\"fld";
_itemkala.fldArzeshAfzode /*String*/  = _cu1.GetString("fldArzeshAfzode");
RDebugUtils.currentLine=35389614;
 //BA.debugLineNum = 35389614;BA.debugLine="SwArzeshAfzodeEnable.Checked=True";
parent.mostCurrent._swarzeshafzodeenable.setChecked(anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 78:
//C
this.state = 87;
;
 if (true) break;

case 80:
//C
this.state = 81;
RDebugUtils.currentLine=35389617;
 //BA.debugLineNum = 35389617;BA.debugLine="If SwArzeshAfzodeEnable.Checked Then";
if (true) break;

case 81:
//if
this.state = 86;
if (parent.mostCurrent._swarzeshafzodeenable.getChecked()) { 
this.state = 83;
}else {
this.state = 85;
}if (true) break;

case 83:
//C
this.state = 86;
RDebugUtils.currentLine=35389618;
 //BA.debugLineNum = 35389618;BA.debugLine="ItemKala.fldDarsadArzeshAfzode=MCode.Arzesh";
_itemkala.fldDarsadArzeshAfzode /*String*/  = parent.mostCurrent._mcode._arzeshafzode /*String*/ ;
 if (true) break;

case 85:
//C
this.state = 86;
RDebugUtils.currentLine=35389620;
 //BA.debugLineNum = 35389620;BA.debugLine="ItemSelected.fldDarsadArzeshAfzode=0";
parent.mostCurrent._itemselected.fldDarsadArzeshAfzode /*String*/  = BA.NumberToString(0);
 if (true) break;

case 86:
//C
this.state = 87;
;
 if (true) break;

case 87:
//C
this.state = 109;
;
RDebugUtils.currentLine=35389624;
 //BA.debugLineNum = 35389624;BA.debugLine="cu1.Close";
_cu1.Close();
 if (true) break;

case 89:
//C
this.state = 90;
RDebugUtils.currentLine=35389627;
 //BA.debugLineNum = 35389627;BA.debugLine="If Cu.GetString(\"fldFeeBadAzTakhfif\")<>Null T";
if (true) break;

case 90:
//if
this.state = 95;
if (_cu.GetString("fldFeeBadAzTakhfif")!= null) { 
this.state = 92;
}else {
this.state = 94;
}if (true) break;

case 92:
//C
this.state = 95;
RDebugUtils.currentLine=35389629;
 //BA.debugLineNum = 35389629;BA.debugLine="ItemKala.fldFeeBadAzTakhfif=Cu.GetString(\"fl";
_itemkala.fldFeeBadAzTakhfif /*String*/  = _cu.GetString("fldFeeBadAzTakhfif");
 if (true) break;

case 94:
//C
this.state = 95;
RDebugUtils.currentLine=35389633;
 //BA.debugLineNum = 35389633;BA.debugLine="ItemKala.fldFeeBadAzTakhfif=\"0\"";
_itemkala.fldFeeBadAzTakhfif /*String*/  = "0";
 if (true) break;
;
RDebugUtils.currentLine=35389636;
 //BA.debugLineNum = 35389636;BA.debugLine="If ItemKala.MablaghTakhfif>0 Then";

case 95:
//if
this.state = 98;
if (_itemkala.MablaghTakhfif /*int*/ >0) { 
this.state = 97;
}if (true) break;

case 97:
//C
this.state = 98;
RDebugUtils.currentLine=35389637;
 //BA.debugLineNum = 35389637;BA.debugLine="ItemKala.fldFeeBadAzTakhfif=fee-ItemKala.Mab";
_itemkala.fldFeeBadAzTakhfif /*String*/  = BA.NumberToString((double)(Double.parseDouble(_fee))-_itemkala.MablaghTakhfif /*int*/ );
 if (true) break;

case 98:
//C
this.state = 99;
;
RDebugUtils.currentLine=35389640;
 //BA.debugLineNum = 35389640;BA.debugLine="ItemKala.FeeForoosh=fee";
_itemkala.FeeForoosh /*int*/  = (int)(Double.parseDouble(_fee));
RDebugUtils.currentLine=35389643;
 //BA.debugLineNum = 35389643;BA.debugLine="ItemKala.FldMablaghMasrafKonande=Cu.GetString";
_itemkala.FldMablaghMasrafKonande /*String*/  = _cu.GetString("fldGhymatMasrafkonande");
RDebugUtils.currentLine=35389647;
 //BA.debugLineNum = 35389647;BA.debugLine="ItemKala.fldPathPic=Cu.GetString(\"fldPathPic\"";
_itemkala.fldPathPic /*String*/  = _cu.GetString("fldPathPic");
RDebugUtils.currentLine=35389654;
 //BA.debugLineNum = 35389654;BA.debugLine="If Cu.Getstring(\"fldNameVahed2\") <> \"\"  Then";
if (true) break;

case 99:
//if
this.state = 108;
if ((_cu.GetString("fldNameVahed2")).equals("") == false) { 
this.state = 101;
}if (true) break;

case 101:
//C
this.state = 102;
RDebugUtils.currentLine=35389655;
 //BA.debugLineNum = 35389655;BA.debugLine="Dim FldFeeForoosh As Int = MCode.Sf.Val(Cu.G";
_fldfeeforoosh = (int) (parent.mostCurrent._mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvvvv1(BA.NumberToString(_cu.GetInt("fldFeeForoosh"))));
RDebugUtils.currentLine=35389656;
 //BA.debugLineNum = 35389656;BA.debugLine="Dim FldTedadDarKarton As Int = MCode.Sf.Val(";
_fldtedaddarkarton = (int) (parent.mostCurrent._mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvvvv1(_cu.GetString("fldTedadDarKarton")));
RDebugUtils.currentLine=35389657;
 //BA.debugLineNum = 35389657;BA.debugLine="Dim SumMande As Int = Cu.Getstring(\"SumMande";
_summande = (int)(Double.parseDouble(_cu.GetString("SumMande")));
RDebugUtils.currentLine=35389658;
 //BA.debugLineNum = 35389658;BA.debugLine="If FldTedadDarKarton>0 Then";
if (true) break;

case 102:
//if
this.state = 107;
if (_fldtedaddarkarton>0) { 
this.state = 104;
}else {
this.state = 106;
}if (true) break;

case 104:
//C
this.state = 107;
RDebugUtils.currentLine=35389659;
 //BA.debugLineNum = 35389659;BA.debugLine="ItemKala.FeeForooshKarton=FldFeeForoosh * F";
_itemkala.FeeForooshKarton /*String*/  = BA.NumberToString(_fldfeeforoosh*_fldtedaddarkarton);
RDebugUtils.currentLine=35389661;
 //BA.debugLineNum = 35389661;BA.debugLine="Dim SumKol As Long=(SumMande / FldTedadDarK";
_sumkol = (long) ((_summande/(double)_fldtedaddarkarton));
RDebugUtils.currentLine=35389662;
 //BA.debugLineNum = 35389662;BA.debugLine="ItemKala.SumMandeKarton=SumKol";
_itemkala.SumMandeKarton /*String*/  = BA.NumberToString(_sumkol);
 if (true) break;

case 106:
//C
this.state = 107;
RDebugUtils.currentLine=35389664;
 //BA.debugLineNum = 35389664;BA.debugLine="ItemKala.SumMandeKarton=0";
_itemkala.SumMandeKarton /*String*/  = BA.NumberToString(0);
 if (true) break;

case 107:
//C
this.state = 108;
;
 if (true) break;

case 108:
//C
this.state = 109;
;
 if (true) break;

case 109:
//C
this.state = 116;
;
RDebugUtils.currentLine=35389674;
 //BA.debugLineNum = 35389674;BA.debugLine="OrginalListKala.Add(ItemKala)";
parent.mostCurrent._orginallistkala.Add((Object)(_itemkala));
 if (true) break;
if (true) break;

case 110:
//C
this.state = 111;
;
RDebugUtils.currentLine=35389679;
 //BA.debugLineNum = 35389679;BA.debugLine="Cu.Close";
_cu.Close();
 if (true) break;

case 111:
//C
this.state = 114;
;
RDebugUtils.currentLine=35389692;
 //BA.debugLineNum = 35389692;BA.debugLine="ListKalaSp=OrginalListKala";
parent.mostCurrent._listkalasp = parent.mostCurrent._orginallistkala;
RDebugUtils.currentLine=35389693;
 //BA.debugLineNum = 35389693;BA.debugLine="ListKalaTxt=ListKalaSp";
parent.mostCurrent._listkalatxt = parent.mostCurrent._listkalasp;
RDebugUtils.currentLine=35389694;
 //BA.debugLineNum = 35389694;BA.debugLine="HLV.notifyDataSetChanged";
parent.mostCurrent._hlv.notifyDataSetChanged();
RDebugUtils.currentLine=35389695;
 //BA.debugLineNum = 35389695;BA.debugLine="Sleep(100)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_kaladefault", "loadlistkala"),(int) (100));
this.state = 117;
return;
case 117:
//C
this.state = 114;
;
 if (true) break;

case 113:
//C
this.state = 114;
this.catchState = 0;
RDebugUtils.currentLine=35389698;
 //BA.debugLineNum = 35389698;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("535389698",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=35389699;
 //BA.debugLineNum = 35389699;BA.debugLine="Log(LastException.Message)";
anywheresoftware.b4a.keywords.Common.LogImpl("535389699",anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getMessage(),0);
RDebugUtils.currentLine=35389700;
 //BA.debugLineNum = 35389700;BA.debugLine="myCode.SendError(LastException.Message,Activity.";
parent.mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getMessage(),BA.ObjectToString(parent.mostCurrent._activity.getTitle())+"-LoadListKala");
 if (true) break;
if (true) break;

case 114:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=35389715;
 //BA.debugLineNum = 35389715;BA.debugLine="End Sub";
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
public static String  _myzx_noscan1(String _atype,String _values) throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "myzx_noscan1", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "myzx_noscan1", new Object[] {_atype,_values}));}
RDebugUtils.currentLine=36372480;
 //BA.debugLineNum = 36372480;BA.debugLine="Sub myzx_noscan1(atype As String,Values As String)";
RDebugUtils.currentLine=36372481;
 //BA.debugLineNum = 36372481;BA.debugLine="Msgbox(Values,\"type:\" & atype)";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence(_values),BA.ObjectToCharSequence("type:"+_atype),mostCurrent.activityBA);
RDebugUtils.currentLine=36372482;
 //BA.debugLineNum = 36372482;BA.debugLine="End Sub";
return "";
}
public static String  _myzx_result(String _atype,String _value,anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _image) throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "myzx_result", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "myzx_result", new Object[] {_atype,_value,_image}));}
RDebugUtils.currentLine=36044800;
 //BA.debugLineNum = 36044800;BA.debugLine="Sub myzx_result(atype As String,Value As String, i";
RDebugUtils.currentLine=36044801;
 //BA.debugLineNum = 36044801;BA.debugLine="Try";
try {RDebugUtils.currentLine=36044802;
 //BA.debugLineNum = 36044802;BA.debugLine="LogColor(\"type:\"&atype&\"values:\"&Value,Colors.re";
anywheresoftware.b4a.keywords.Common.LogImpl("536044802","type:"+_atype+"values:"+_value,anywheresoftware.b4a.keywords.Common.Colors.Red);
RDebugUtils.currentLine=36044805;
 //BA.debugLineNum = 36044805;BA.debugLine="TxtSearch.Text=Value";
mostCurrent._txtsearch.setText(BA.ObjectToCharSequence(_value));
RDebugUtils.currentLine=36044806;
 //BA.debugLineNum = 36044806;BA.debugLine="BtnSearch.Tag=True";
mostCurrent._btnsearch.setTag((Object)(anywheresoftware.b4a.keywords.Common.True));
RDebugUtils.currentLine=36044807;
 //BA.debugLineNum = 36044807;BA.debugLine="BtnSearch_Click";
_btnsearch_click();
 } 
       catch (Exception e7) {
			processBA.setLastException(e7);RDebugUtils.currentLine=36044809;
 //BA.debugLineNum = 36044809;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("536044809",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=36044810;
 //BA.debugLineNum = 36044810;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-myzx_result");
 };
RDebugUtils.currentLine=36044812;
 //BA.debugLineNum = 36044812;BA.debugLine="End Sub";
return "";
}
public static String  _myzx_result1(String _atype,String _values) throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "myzx_result1", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "myzx_result1", new Object[] {_atype,_values}));}
RDebugUtils.currentLine=36306944;
 //BA.debugLineNum = 36306944;BA.debugLine="Sub myzx_result1(atype As String,Values As String)";
RDebugUtils.currentLine=36306946;
 //BA.debugLineNum = 36306946;BA.debugLine="End Sub";
return "";
}
public static String  _myzx_timedout(boolean _timedout) throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "myzx_timedout", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "myzx_timedout", new Object[] {_timedout}));}
RDebugUtils.currentLine=36110336;
 //BA.debugLineNum = 36110336;BA.debugLine="Sub myzx_timedout(timedOut As Boolean)";
RDebugUtils.currentLine=36110337;
 //BA.debugLineNum = 36110337;BA.debugLine="Log(\"timedOut \" & timedOut)";
anywheresoftware.b4a.keywords.Common.LogImpl("536110337","timedOut "+BA.ObjectToString(_timedout),0);
RDebugUtils.currentLine=36110339;
 //BA.debugLineNum = 36110339;BA.debugLine="End Sub";
return "";
}
public static String  _myzx_usercancelled(boolean _usercancelled) throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "myzx_usercancelled", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "myzx_usercancelled", new Object[] {_usercancelled}));}
RDebugUtils.currentLine=36175872;
 //BA.debugLineNum = 36175872;BA.debugLine="Sub myzx_usercancelled(userCancelled As Boolean)";
RDebugUtils.currentLine=36175873;
 //BA.debugLineNum = 36175873;BA.debugLine="Log(\"userCancelled \" & userCancelled)";
anywheresoftware.b4a.keywords.Common.LogImpl("536175873","userCancelled "+BA.ObjectToString(_usercancelled),0);
RDebugUtils.currentLine=36175874;
 //BA.debugLineNum = 36175874;BA.debugLine="End Sub";
return "";
}
public static String  _nicespinner_item_clicked() throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "nicespinner_item_clicked", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "nicespinner_item_clicked", null));}
int _position = 0;
anywheresoftware.b4a.objects.collections.List _lst = null;
int _index = 0;
ir.parsikhesab.pakhsh.mcode._adaptergoroohkala _item = null;
String _mc = "";
int _count = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
int _i = 0;
RDebugUtils.currentLine=35520512;
 //BA.debugLineNum = 35520512;BA.debugLine="Sub NiceSpinner_item_clicked";
RDebugUtils.currentLine=35520513;
 //BA.debugLineNum = 35520513;BA.debugLine="Dim Position As Int=NiceSpinner.SelectedIndex";
_position = mostCurrent._nicespinner.getSelectedIndex();
RDebugUtils.currentLine=35520514;
 //BA.debugLineNum = 35520514;BA.debugLine="Log(\"ns1 item \" & NiceSpinner.SelectedIndex &\" se";
anywheresoftware.b4a.keywords.Common.LogImpl("535520514","ns1 item "+BA.NumberToString(mostCurrent._nicespinner.getSelectedIndex())+" selected",0);
RDebugUtils.currentLine=35520515;
 //BA.debugLineNum = 35520515;BA.debugLine="Log(\"ns1 item \" & NiceSpinner.Text &\" selected\")";
anywheresoftware.b4a.keywords.Common.LogImpl("535520515","ns1 item "+mostCurrent._nicespinner.getText()+" selected",0);
RDebugUtils.currentLine=35520517;
 //BA.debugLineNum = 35520517;BA.debugLine="Try";
try {RDebugUtils.currentLine=35520518;
 //BA.debugLineNum = 35520518;BA.debugLine="Key.HideKeyboard";
mostCurrent._key.HideKeyboard(mostCurrent.activityBA);
RDebugUtils.currentLine=35520520;
 //BA.debugLineNum = 35520520;BA.debugLine="If Position = 0 Then";
if (_position==0) { 
RDebugUtils.currentLine=35520521;
 //BA.debugLineNum = 35520521;BA.debugLine="ListGoroohKala1.Clear";
mostCurrent._listgoroohkala1.Clear();
RDebugUtils.currentLine=35520522;
 //BA.debugLineNum = 35520522;BA.debugLine="lstSelectedCodeGroupKala.Clear";
mostCurrent._lstselectedcodegroupkala.Clear();
RDebugUtils.currentLine=35520524;
 //BA.debugLineNum = 35520524;BA.debugLine="lstGroup2.Clear";
mostCurrent._lstgroup2.Clear();
RDebugUtils.currentLine=35520526;
 //BA.debugLineNum = 35520526;BA.debugLine="lstGroup2.Add(\"همه گروه ها\")";
mostCurrent._lstgroup2.Add((Object)("همه گروه ها"));
RDebugUtils.currentLine=35520528;
 //BA.debugLineNum = 35520528;BA.debugLine="GroupCodeSelect1=\"0\"";
mostCurrent._groupcodeselect1 = "0";
RDebugUtils.currentLine=35520529;
 //BA.debugLineNum = 35520529;BA.debugLine="GroupNameSelect1=\"\"";
mostCurrent._groupnameselect1 = "";
RDebugUtils.currentLine=35520530;
 //BA.debugLineNum = 35520530;BA.debugLine="GroupCodeSelect2=\"0\"";
mostCurrent._groupcodeselect2 = "0";
RDebugUtils.currentLine=35520531;
 //BA.debugLineNum = 35520531;BA.debugLine="GroupNameSelect2=\"\"";
mostCurrent._groupnameselect2 = "";
 }else {
RDebugUtils.currentLine=35520534;
 //BA.debugLineNum = 35520534;BA.debugLine="Dim lst As List=OriginalListGoroohKala1";
_lst = new anywheresoftware.b4a.objects.collections.List();
_lst = mostCurrent._originallistgoroohkala1;
RDebugUtils.currentLine=35520535;
 //BA.debugLineNum = 35520535;BA.debugLine="Log(NiceSpinner.SelectedIndex-1)";
anywheresoftware.b4a.keywords.Common.LogImpl("535520535",BA.NumberToString(mostCurrent._nicespinner.getSelectedIndex()-1),0);
RDebugUtils.currentLine=35520536;
 //BA.debugLineNum = 35520536;BA.debugLine="Dim index As Int=Position-1";
_index = (int) (_position-1);
RDebugUtils.currentLine=35520537;
 //BA.debugLineNum = 35520537;BA.debugLine="Dim Item As AdapterGoroohKala=lst.Get(index)";
_item = (ir.parsikhesab.pakhsh.mcode._adaptergoroohkala)(_lst.Get(_index));
RDebugUtils.currentLine=35520538;
 //BA.debugLineNum = 35520538;BA.debugLine="Log(Item.FldN_Gorooh)";
anywheresoftware.b4a.keywords.Common.LogImpl("535520538",_item.FldN_Gorooh /*String*/ ,0);
RDebugUtils.currentLine=35520539;
 //BA.debugLineNum = 35520539;BA.debugLine="Log(Item.FldC_Gorooh)";
anywheresoftware.b4a.keywords.Common.LogImpl("535520539",_item.FldC_Gorooh /*String*/ ,0);
RDebugUtils.currentLine=35520540;
 //BA.debugLineNum = 35520540;BA.debugLine="GroupCodeSelect1=Item.FldC_Gorooh";
mostCurrent._groupcodeselect1 = _item.FldC_Gorooh /*String*/ ;
RDebugUtils.currentLine=35520541;
 //BA.debugLineNum = 35520541;BA.debugLine="GroupNameSelect1=Item.FldN_Gorooh";
mostCurrent._groupnameselect1 = _item.FldN_Gorooh /*String*/ ;
RDebugUtils.currentLine=35520542;
 //BA.debugLineNum = 35520542;BA.debugLine="GroupCodeSelect2=\"0\"";
mostCurrent._groupcodeselect2 = "0";
RDebugUtils.currentLine=35520543;
 //BA.debugLineNum = 35520543;BA.debugLine="GroupNameSelect2=\"\"";
mostCurrent._groupnameselect2 = "";
RDebugUtils.currentLine=35520544;
 //BA.debugLineNum = 35520544;BA.debugLine="Dim mc As String=Item.FldC_Gorooh";
_mc = _item.FldC_Gorooh /*String*/ ;
RDebugUtils.currentLine=35520546;
 //BA.debugLineNum = 35520546;BA.debugLine="Dim Count As Int = Item.FldC_Gorooh.Length + 3";
_count = (int) (_item.FldC_Gorooh /*String*/ .length()+3);
RDebugUtils.currentLine=35520547;
 //BA.debugLineNum = 35520547;BA.debugLine="Dim Cu As Cursor=MCode.Result(\"Select FldC_Goro";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select FldC_Gorooh,FldN_Gorooh From TblGoroohKala where FldC_Gorooh Like '"+_mc+"%' And Length(FldC_Gorooh) = "+BA.NumberToString(_count)+" ORDER BY FldC_Gorooh");
RDebugUtils.currentLine=35520548;
 //BA.debugLineNum = 35520548;BA.debugLine="If Cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=35520549;
 //BA.debugLineNum = 35520549;BA.debugLine="lstSelectedCodeGroupKala.Clear";
mostCurrent._lstselectedcodegroupkala.Clear();
RDebugUtils.currentLine=35520551;
 //BA.debugLineNum = 35520551;BA.debugLine="lstGroup2.Clear";
mostCurrent._lstgroup2.Clear();
RDebugUtils.currentLine=35520553;
 //BA.debugLineNum = 35520553;BA.debugLine="lstGroup2.Add(\"همه گروه ها\")";
mostCurrent._lstgroup2.Add((Object)("همه گروه ها"));
RDebugUtils.currentLine=35520554;
 //BA.debugLineNum = 35520554;BA.debugLine="For i=0 To Cu.RowCount-1";
{
final int step33 = 1;
final int limit33 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit33 ;_i = _i + step33 ) {
RDebugUtils.currentLine=35520555;
 //BA.debugLineNum = 35520555;BA.debugLine="Cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=35520556;
 //BA.debugLineNum = 35520556;BA.debugLine="Dim Item As AdapterGoroohKala";
_item = new ir.parsikhesab.pakhsh.mcode._adaptergoroohkala();
RDebugUtils.currentLine=35520557;
 //BA.debugLineNum = 35520557;BA.debugLine="Item.FldC_Gorooh=Cu.GetString(\"FldC_Gorooh\")";
_item.FldC_Gorooh /*String*/  = _cu.GetString("FldC_Gorooh");
RDebugUtils.currentLine=35520558;
 //BA.debugLineNum = 35520558;BA.debugLine="Item.FldN_Gorooh=Cu.GetString(\"FldN_Gorooh\")";
_item.FldN_Gorooh /*String*/  = _cu.GetString("FldN_Gorooh");
RDebugUtils.currentLine=35520559;
 //BA.debugLineNum = 35520559;BA.debugLine="ListGoroohKala1.Add(Item)";
mostCurrent._listgoroohkala1.Add((Object)(_item));
RDebugUtils.currentLine=35520561;
 //BA.debugLineNum = 35520561;BA.debugLine="lstGroup2.Add(Cu.GetString(\"FldN_Gorooh\"))";
mostCurrent._lstgroup2.Add((Object)(_cu.GetString("FldN_Gorooh")));
 }
};
RDebugUtils.currentLine=35520564;
 //BA.debugLineNum = 35520564;BA.debugLine="NiceSpinner1.attachDataSource(lstGroup2)";
mostCurrent._nicespinner1.attachDataSource((java.util.List)(mostCurrent._lstgroup2.getObject()));
RDebugUtils.currentLine=35520566;
 //BA.debugLineNum = 35520566;BA.debugLine="lstSelectedCodeGroupKala.Add(GroupCodeSelect1)";
mostCurrent._lstselectedcodegroupkala.Add((Object)(mostCurrent._groupcodeselect1));
 }else {
RDebugUtils.currentLine=35520568;
 //BA.debugLineNum = 35520568;BA.debugLine="ListGoroohKala1.Clear";
mostCurrent._listgoroohkala1.Clear();
RDebugUtils.currentLine=35520569;
 //BA.debugLineNum = 35520569;BA.debugLine="lstSelectedCodeGroupKala.Clear";
mostCurrent._lstselectedcodegroupkala.Clear();
RDebugUtils.currentLine=35520571;
 //BA.debugLineNum = 35520571;BA.debugLine="lstGroup2.Clear";
mostCurrent._lstgroup2.Clear();
RDebugUtils.currentLine=35520573;
 //BA.debugLineNum = 35520573;BA.debugLine="lstGroup2.Add(\"همه گروه ها\")";
mostCurrent._lstgroup2.Add((Object)("همه گروه ها"));
RDebugUtils.currentLine=35520574;
 //BA.debugLineNum = 35520574;BA.debugLine="GroupCodeSelect2=\"0\"";
mostCurrent._groupcodeselect2 = "0";
RDebugUtils.currentLine=35520575;
 //BA.debugLineNum = 35520575;BA.debugLine="GroupNameSelect2=\"\"";
mostCurrent._groupnameselect2 = "";
 };
 };
RDebugUtils.currentLine=35520580;
 //BA.debugLineNum = 35520580;BA.debugLine="LoadKala";
_loadkala();
RDebugUtils.currentLine=35520581;
 //BA.debugLineNum = 35520581;BA.debugLine="Log(\"CodeGroupSelect1: \"&GroupCodeSelect1)";
anywheresoftware.b4a.keywords.Common.LogImpl("535520581","CodeGroupSelect1: "+mostCurrent._groupcodeselect1,0);
RDebugUtils.currentLine=35520582;
 //BA.debugLineNum = 35520582;BA.debugLine="Log(\"postion1: \"&Position)";
anywheresoftware.b4a.keywords.Common.LogImpl("535520582","postion1: "+BA.NumberToString(_position),0);
 } 
       catch (Exception e56) {
			processBA.setLastException(e56);RDebugUtils.currentLine=35520584;
 //BA.debugLineNum = 35520584;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("535520584",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=35520585;
 //BA.debugLineNum = 35520585;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-NiceSpinner_ItemClick");
 };
RDebugUtils.currentLine=35520587;
 //BA.debugLineNum = 35520587;BA.debugLine="End Sub";
return "";
}
public static String  _nicespinner_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "nicespinner_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "nicespinner_itemclick", new Object[] {_position,_value}));}
anywheresoftware.b4a.objects.collections.List _lst = null;
int _index = 0;
ir.parsikhesab.pakhsh.mcode._adaptergoroohkala _item = null;
String _mc = "";
int _count = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
int _i = 0;
RDebugUtils.currentLine=35651584;
 //BA.debugLineNum = 35651584;BA.debugLine="Sub NiceSpinner_ItemClick (Position As Int, Value";
RDebugUtils.currentLine=35651586;
 //BA.debugLineNum = 35651586;BA.debugLine="Try";
try {RDebugUtils.currentLine=35651587;
 //BA.debugLineNum = 35651587;BA.debugLine="Key.HideKeyboard";
mostCurrent._key.HideKeyboard(mostCurrent.activityBA);
RDebugUtils.currentLine=35651589;
 //BA.debugLineNum = 35651589;BA.debugLine="If Position = 0 Then";
if (_position==0) { 
RDebugUtils.currentLine=35651590;
 //BA.debugLineNum = 35651590;BA.debugLine="ListGoroohKala1.Clear";
mostCurrent._listgoroohkala1.Clear();
RDebugUtils.currentLine=35651591;
 //BA.debugLineNum = 35651591;BA.debugLine="lstSelectedCodeGroupKala.Clear";
mostCurrent._lstselectedcodegroupkala.Clear();
RDebugUtils.currentLine=35651593;
 //BA.debugLineNum = 35651593;BA.debugLine="lstGroup2.Clear";
mostCurrent._lstgroup2.Clear();
RDebugUtils.currentLine=35651594;
 //BA.debugLineNum = 35651594;BA.debugLine="lstGroup2.Add(\"همه گروه ها\")";
mostCurrent._lstgroup2.Add((Object)("همه گروه ها"));
RDebugUtils.currentLine=35651596;
 //BA.debugLineNum = 35651596;BA.debugLine="GroupCodeSelect1=\"0\"";
mostCurrent._groupcodeselect1 = "0";
RDebugUtils.currentLine=35651597;
 //BA.debugLineNum = 35651597;BA.debugLine="GroupNameSelect1=\"\"";
mostCurrent._groupnameselect1 = "";
RDebugUtils.currentLine=35651598;
 //BA.debugLineNum = 35651598;BA.debugLine="GroupCodeSelect2=\"0\"";
mostCurrent._groupcodeselect2 = "0";
RDebugUtils.currentLine=35651599;
 //BA.debugLineNum = 35651599;BA.debugLine="GroupNameSelect2=\"\"";
mostCurrent._groupnameselect2 = "";
RDebugUtils.currentLine=35651600;
 //BA.debugLineNum = 35651600;BA.debugLine="NiceSpinner1.SelectedIndex=0";
mostCurrent._nicespinner1.setSelectedIndex((int) (0));
 }else {
RDebugUtils.currentLine=35651602;
 //BA.debugLineNum = 35651602;BA.debugLine="Dim lst As List=OriginalListGoroohKala1";
_lst = new anywheresoftware.b4a.objects.collections.List();
_lst = mostCurrent._originallistgoroohkala1;
RDebugUtils.currentLine=35651603;
 //BA.debugLineNum = 35651603;BA.debugLine="Log(NiceSpinner.SelectedIndex-1)";
anywheresoftware.b4a.keywords.Common.LogImpl("535651603",BA.NumberToString(mostCurrent._nicespinner.getSelectedIndex()-1),0);
RDebugUtils.currentLine=35651604;
 //BA.debugLineNum = 35651604;BA.debugLine="Dim index As Int=Position-1";
_index = (int) (_position-1);
RDebugUtils.currentLine=35651605;
 //BA.debugLineNum = 35651605;BA.debugLine="Dim Item As AdapterGoroohKala=lst.Get(index)";
_item = (ir.parsikhesab.pakhsh.mcode._adaptergoroohkala)(_lst.Get(_index));
RDebugUtils.currentLine=35651606;
 //BA.debugLineNum = 35651606;BA.debugLine="Log(Item.FldN_Gorooh)";
anywheresoftware.b4a.keywords.Common.LogImpl("535651606",_item.FldN_Gorooh /*String*/ ,0);
RDebugUtils.currentLine=35651607;
 //BA.debugLineNum = 35651607;BA.debugLine="Log(Item.FldC_Gorooh)";
anywheresoftware.b4a.keywords.Common.LogImpl("535651607",_item.FldC_Gorooh /*String*/ ,0);
RDebugUtils.currentLine=35651608;
 //BA.debugLineNum = 35651608;BA.debugLine="GroupCodeSelect1=Item.FldC_Gorooh";
mostCurrent._groupcodeselect1 = _item.FldC_Gorooh /*String*/ ;
RDebugUtils.currentLine=35651609;
 //BA.debugLineNum = 35651609;BA.debugLine="GroupNameSelect1=Item.FldN_Gorooh";
mostCurrent._groupnameselect1 = _item.FldN_Gorooh /*String*/ ;
RDebugUtils.currentLine=35651610;
 //BA.debugLineNum = 35651610;BA.debugLine="GroupCodeSelect2=\"0\"";
mostCurrent._groupcodeselect2 = "0";
RDebugUtils.currentLine=35651611;
 //BA.debugLineNum = 35651611;BA.debugLine="GroupNameSelect2=\"\"";
mostCurrent._groupnameselect2 = "";
RDebugUtils.currentLine=35651612;
 //BA.debugLineNum = 35651612;BA.debugLine="Dim mc As String=Item.FldC_Gorooh";
_mc = _item.FldC_Gorooh /*String*/ ;
RDebugUtils.currentLine=35651614;
 //BA.debugLineNum = 35651614;BA.debugLine="Dim Count As Int = Item.FldC_Gorooh.Length + 3";
_count = (int) (_item.FldC_Gorooh /*String*/ .length()+3);
RDebugUtils.currentLine=35651615;
 //BA.debugLineNum = 35651615;BA.debugLine="Dim Cu As Cursor=MCode.Result(\"Select FldC_Goro";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select FldC_Gorooh,FldN_Gorooh From TblGoroohKala where FldC_Gorooh Like '"+_mc+"%' And Length(FldC_Gorooh) = "+BA.NumberToString(_count)+" ORDER BY FldC_Gorooh");
RDebugUtils.currentLine=35651616;
 //BA.debugLineNum = 35651616;BA.debugLine="If Cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=35651617;
 //BA.debugLineNum = 35651617;BA.debugLine="lstSelectedCodeGroupKala.Clear";
mostCurrent._lstselectedcodegroupkala.Clear();
RDebugUtils.currentLine=35651619;
 //BA.debugLineNum = 35651619;BA.debugLine="lstGroup2.Clear";
mostCurrent._lstgroup2.Clear();
RDebugUtils.currentLine=35651621;
 //BA.debugLineNum = 35651621;BA.debugLine="lstGroup2.Add(\"همه گروه ها\")";
mostCurrent._lstgroup2.Add((Object)("همه گروه ها"));
RDebugUtils.currentLine=35651622;
 //BA.debugLineNum = 35651622;BA.debugLine="For i=0 To Cu.RowCount-1";
{
final int step31 = 1;
final int limit31 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit31 ;_i = _i + step31 ) {
RDebugUtils.currentLine=35651623;
 //BA.debugLineNum = 35651623;BA.debugLine="Cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=35651624;
 //BA.debugLineNum = 35651624;BA.debugLine="Dim Item As AdapterGoroohKala";
_item = new ir.parsikhesab.pakhsh.mcode._adaptergoroohkala();
RDebugUtils.currentLine=35651625;
 //BA.debugLineNum = 35651625;BA.debugLine="Item.FldC_Gorooh=Cu.GetString(\"FldC_Gorooh\")";
_item.FldC_Gorooh /*String*/  = _cu.GetString("FldC_Gorooh");
RDebugUtils.currentLine=35651626;
 //BA.debugLineNum = 35651626;BA.debugLine="Item.FldN_Gorooh=Cu.GetString(\"FldN_Gorooh\")";
_item.FldN_Gorooh /*String*/  = _cu.GetString("FldN_Gorooh");
RDebugUtils.currentLine=35651627;
 //BA.debugLineNum = 35651627;BA.debugLine="ListGoroohKala1.Add(Item)";
mostCurrent._listgoroohkala1.Add((Object)(_item));
RDebugUtils.currentLine=35651629;
 //BA.debugLineNum = 35651629;BA.debugLine="lstGroup2.Add(Cu.GetString(\"FldN_Gorooh\"))";
mostCurrent._lstgroup2.Add((Object)(_cu.GetString("FldN_Gorooh")));
 }
};
RDebugUtils.currentLine=35651632;
 //BA.debugLineNum = 35651632;BA.debugLine="NiceSpinner1.attachDataSource(lstGroup2)";
mostCurrent._nicespinner1.attachDataSource((java.util.List)(mostCurrent._lstgroup2.getObject()));
RDebugUtils.currentLine=35651633;
 //BA.debugLineNum = 35651633;BA.debugLine="NiceSpinner1.SelectedIndex = 0";
mostCurrent._nicespinner1.setSelectedIndex((int) (0));
RDebugUtils.currentLine=35651634;
 //BA.debugLineNum = 35651634;BA.debugLine="lstSelectedCodeGroupKala.Add(GroupCodeSelect1)";
mostCurrent._lstselectedcodegroupkala.Add((Object)(mostCurrent._groupcodeselect1));
 }else {
RDebugUtils.currentLine=35651636;
 //BA.debugLineNum = 35651636;BA.debugLine="ListGoroohKala1.Clear";
mostCurrent._listgoroohkala1.Clear();
RDebugUtils.currentLine=35651637;
 //BA.debugLineNum = 35651637;BA.debugLine="lstSelectedCodeGroupKala.Clear";
mostCurrent._lstselectedcodegroupkala.Clear();
RDebugUtils.currentLine=35651639;
 //BA.debugLineNum = 35651639;BA.debugLine="lstGroup2.Clear";
mostCurrent._lstgroup2.Clear();
RDebugUtils.currentLine=35651641;
 //BA.debugLineNum = 35651641;BA.debugLine="lstGroup2.Add(\"همه گروه ها\")";
mostCurrent._lstgroup2.Add((Object)("همه گروه ها"));
RDebugUtils.currentLine=35651642;
 //BA.debugLineNum = 35651642;BA.debugLine="GroupCodeSelect2=\"0\"";
mostCurrent._groupcodeselect2 = "0";
RDebugUtils.currentLine=35651643;
 //BA.debugLineNum = 35651643;BA.debugLine="GroupNameSelect2=\"\"";
mostCurrent._groupnameselect2 = "";
RDebugUtils.currentLine=35651644;
 //BA.debugLineNum = 35651644;BA.debugLine="NiceSpinner1.SelectedIndex=0";
mostCurrent._nicespinner1.setSelectedIndex((int) (0));
 };
 };
RDebugUtils.currentLine=35651648;
 //BA.debugLineNum = 35651648;BA.debugLine="LoadKala";
_loadkala();
RDebugUtils.currentLine=35651649;
 //BA.debugLineNum = 35651649;BA.debugLine="Log(\"CodeGroupSelect1: \"&GroupCodeSelect1)";
anywheresoftware.b4a.keywords.Common.LogImpl("535651649","CodeGroupSelect1: "+mostCurrent._groupcodeselect1,0);
RDebugUtils.currentLine=35651650;
 //BA.debugLineNum = 35651650;BA.debugLine="Log(\"postion1: \"&Position)";
anywheresoftware.b4a.keywords.Common.LogImpl("535651650","postion1: "+BA.NumberToString(_position),0);
 } 
       catch (Exception e56) {
			processBA.setLastException(e56);RDebugUtils.currentLine=35651652;
 //BA.debugLineNum = 35651652;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("535651652",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=35651653;
 //BA.debugLineNum = 35651653;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-NiceSpinner_ItemClick");
 };
RDebugUtils.currentLine=35651655;
 //BA.debugLineNum = 35651655;BA.debugLine="End Sub";
return "";
}
public static String  _nicespinner1_item_clicked() throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "nicespinner1_item_clicked", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "nicespinner1_item_clicked", null));}
int _position = 0;
Object _value = null;
anywheresoftware.b4a.objects.collections.List _lst = null;
ir.parsikhesab.pakhsh.mcode._adaptergoroohkala _item = null;
String _mc = "";
int _count = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
int _i = 0;
anywheresoftware.b4a.objects.drawable.ColorDrawable _op1 = null;
RDebugUtils.currentLine=35586048;
 //BA.debugLineNum = 35586048;BA.debugLine="Sub NiceSpinner1_item_clicked";
RDebugUtils.currentLine=35586049;
 //BA.debugLineNum = 35586049;BA.debugLine="Dim Position As Int=NiceSpinner1.SelectedIndex";
_position = mostCurrent._nicespinner1.getSelectedIndex();
RDebugUtils.currentLine=35586050;
 //BA.debugLineNum = 35586050;BA.debugLine="Dim Value As Object=NiceSpinner1.Text";
_value = (Object)(mostCurrent._nicespinner1.getText());
RDebugUtils.currentLine=35586051;
 //BA.debugLineNum = 35586051;BA.debugLine="Log(\"ns2 item \" & NiceSpinner1.SelectedIndex &\" s";
anywheresoftware.b4a.keywords.Common.LogImpl("535586051","ns2 item "+BA.NumberToString(mostCurrent._nicespinner1.getSelectedIndex())+" selected",0);
RDebugUtils.currentLine=35586052;
 //BA.debugLineNum = 35586052;BA.debugLine="Log(\"ns2 item \" & NiceSpinner1.Text &\" selected\")";
anywheresoftware.b4a.keywords.Common.LogImpl("535586052","ns2 item "+mostCurrent._nicespinner1.getText()+" selected",0);
RDebugUtils.currentLine=35586053;
 //BA.debugLineNum = 35586053;BA.debugLine="Try";
try {RDebugUtils.currentLine=35586054;
 //BA.debugLineNum = 35586054;BA.debugLine="If Position=0 Then";
if (_position==0) { 
RDebugUtils.currentLine=35586055;
 //BA.debugLineNum = 35586055;BA.debugLine="If lstSelectedCodeGroupKala.Size>0 Then";
if (mostCurrent._lstselectedcodegroupkala.getSize()>0) { 
RDebugUtils.currentLine=35586056;
 //BA.debugLineNum = 35586056;BA.debugLine="GroupCodeSelect2=lstSelectedCodeGroupKala.Get(";
mostCurrent._groupcodeselect2 = BA.ObjectToString(mostCurrent._lstselectedcodegroupkala.Get((int) (mostCurrent._lstselectedcodegroupkala.getSize()-1)));
 };
 }else {
RDebugUtils.currentLine=35586060;
 //BA.debugLineNum = 35586060;BA.debugLine="Dim lst As List=ListGoroohKala1";
_lst = new anywheresoftware.b4a.objects.collections.List();
_lst = mostCurrent._listgoroohkala1;
RDebugUtils.currentLine=35586061;
 //BA.debugLineNum = 35586061;BA.debugLine="Dim Item As AdapterGoroohKala=lst.Get(Position-";
_item = (ir.parsikhesab.pakhsh.mcode._adaptergoroohkala)(_lst.Get((int) (_position-1)));
RDebugUtils.currentLine=35586062;
 //BA.debugLineNum = 35586062;BA.debugLine="GroupCodeSelect2=Item.FldC_Gorooh";
mostCurrent._groupcodeselect2 = _item.FldC_Gorooh /*String*/ ;
RDebugUtils.currentLine=35586064;
 //BA.debugLineNum = 35586064;BA.debugLine="Dim mc As String=Item.FldC_Gorooh";
_mc = _item.FldC_Gorooh /*String*/ ;
RDebugUtils.currentLine=35586066;
 //BA.debugLineNum = 35586066;BA.debugLine="Dim Count As Int = mc.Length + 3";
_count = (int) (_mc.length()+3);
RDebugUtils.currentLine=35586067;
 //BA.debugLineNum = 35586067;BA.debugLine="Dim Cu As Cursor=MCode.Result(\"Select FldC_Goro";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select FldC_Gorooh,FldN_Gorooh From TblGoroohKala where FldC_Gorooh Like '"+_mc+"%' And Length(FldC_Gorooh) = "+BA.NumberToString(_count)+" ORDER BY FldC_Gorooh");
RDebugUtils.currentLine=35586068;
 //BA.debugLineNum = 35586068;BA.debugLine="If Cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=35586069;
 //BA.debugLineNum = 35586069;BA.debugLine="ListGoroohKala1.Clear";
mostCurrent._listgoroohkala1.Clear();
RDebugUtils.currentLine=35586073;
 //BA.debugLineNum = 35586073;BA.debugLine="lstSelectedCodeGroupKala.Add(Item.FldC_Gorooh)";
mostCurrent._lstselectedcodegroupkala.Add((Object)(_item.FldC_Gorooh /*String*/ ));
RDebugUtils.currentLine=35586077;
 //BA.debugLineNum = 35586077;BA.debugLine="lstGroup2.Clear";
mostCurrent._lstgroup2.Clear();
RDebugUtils.currentLine=35586079;
 //BA.debugLineNum = 35586079;BA.debugLine="lstGroup2.Add(\"همه گروه ها\")";
mostCurrent._lstgroup2.Add((Object)("همه گروه ها"));
RDebugUtils.currentLine=35586081;
 //BA.debugLineNum = 35586081;BA.debugLine="For i=0 To Cu.RowCount-1";
{
final int step22 = 1;
final int limit22 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit22 ;_i = _i + step22 ) {
RDebugUtils.currentLine=35586082;
 //BA.debugLineNum = 35586082;BA.debugLine="Cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=35586083;
 //BA.debugLineNum = 35586083;BA.debugLine="Dim Item As AdapterGoroohKala";
_item = new ir.parsikhesab.pakhsh.mcode._adaptergoroohkala();
RDebugUtils.currentLine=35586084;
 //BA.debugLineNum = 35586084;BA.debugLine="Item.FldC_Gorooh=Cu.GetString(\"FldC_Gorooh\")";
_item.FldC_Gorooh /*String*/  = _cu.GetString("FldC_Gorooh");
RDebugUtils.currentLine=35586085;
 //BA.debugLineNum = 35586085;BA.debugLine="Item.FldN_Gorooh=Cu.GetString(\"FldN_Gorooh\")";
_item.FldN_Gorooh /*String*/  = _cu.GetString("FldN_Gorooh");
RDebugUtils.currentLine=35586086;
 //BA.debugLineNum = 35586086;BA.debugLine="ListGoroohKala1.Add(Item)";
mostCurrent._listgoroohkala1.Add((Object)(_item));
RDebugUtils.currentLine=35586088;
 //BA.debugLineNum = 35586088;BA.debugLine="lstGroup2.Add(Cu.GetString(\"FldN_Gorooh\"))";
mostCurrent._lstgroup2.Add((Object)(_cu.GetString("FldN_Gorooh")));
 }
};
RDebugUtils.currentLine=35586091;
 //BA.debugLineNum = 35586091;BA.debugLine="NiceSpinner1.RemoveView";
mostCurrent._nicespinner1.RemoveView();
RDebugUtils.currentLine=35586092;
 //BA.debugLineNum = 35586092;BA.debugLine="NiceSpinner1.Initialize(\"NiceSpinner1\")";
mostCurrent._nicespinner1.Initialize(processBA,"NiceSpinner1");
RDebugUtils.currentLine=35586093;
 //BA.debugLineNum = 35586093;BA.debugLine="PnlSpGroup.AddView(NiceSpinner1,B4XComboBox2.m";
mostCurrent._pnlspgroup.AddView((android.view.View)(mostCurrent._nicespinner1.getObject()),mostCurrent._b4xcombobox2._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft(),mostCurrent._b4xcombobox2._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop(),mostCurrent._b4xcombobox2._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),mostCurrent._b4xcombobox2._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=35586094;
 //BA.debugLineNum = 35586094;BA.debugLine="NiceSpinner1.TextColor = Colors.Black";
mostCurrent._nicespinner1.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=35586095;
 //BA.debugLineNum = 35586095;BA.debugLine="NiceSpinner1.Gravity = Gravity.CENTER_HORIZONT";
mostCurrent._nicespinner1.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL);
RDebugUtils.currentLine=35586096;
 //BA.debugLineNum = 35586096;BA.debugLine="NiceSpinner1.Typeface = Typeface.LoadFromAsset";
mostCurrent._nicespinner1.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("p_font.ttf"));
RDebugUtils.currentLine=35586097;
 //BA.debugLineNum = 35586097;BA.debugLine="Dim op1 As ColorDrawable";
_op1 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=35586098;
 //BA.debugLineNum = 35586098;BA.debugLine="op1.Initialize2(Colors.White,8dip,2dip,Colors.";
_op1.Initialize2(anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (8)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2)),anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=35586099;
 //BA.debugLineNum = 35586099;BA.debugLine="NiceSpinner1.Background=op1";
mostCurrent._nicespinner1.setBackground((android.graphics.drawable.Drawable)(_op1.getObject()));
RDebugUtils.currentLine=35586100;
 //BA.debugLineNum = 35586100;BA.debugLine="NiceSpinner1.attachDataSource(lstGroup2)";
mostCurrent._nicespinner1.attachDataSource((java.util.List)(mostCurrent._lstgroup2.getObject()));
 };
 };
RDebugUtils.currentLine=35586104;
 //BA.debugLineNum = 35586104;BA.debugLine="LoadKala";
_loadkala();
RDebugUtils.currentLine=35586105;
 //BA.debugLineNum = 35586105;BA.debugLine="Log(\"CodeGroupSelect2: \"&GroupCodeSelect2)";
anywheresoftware.b4a.keywords.Common.LogImpl("535586105","CodeGroupSelect2: "+mostCurrent._groupcodeselect2,0);
RDebugUtils.currentLine=35586106;
 //BA.debugLineNum = 35586106;BA.debugLine="Log(\"position2: \"&Position)";
anywheresoftware.b4a.keywords.Common.LogImpl("535586106","position2: "+BA.NumberToString(_position),0);
 } 
       catch (Exception e46) {
			processBA.setLastException(e46);RDebugUtils.currentLine=35586108;
 //BA.debugLineNum = 35586108;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("535586108",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=35586109;
 //BA.debugLineNum = 35586109;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-NiceSpinner1_ItemClick");
 };
RDebugUtils.currentLine=35586111;
 //BA.debugLineNum = 35586111;BA.debugLine="End Sub";
return "";
}
public static String  _nicespinner1_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "nicespinner1_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "nicespinner1_itemclick", new Object[] {_position,_value}));}
anywheresoftware.b4a.objects.collections.List _lst = null;
ir.parsikhesab.pakhsh.mcode._adaptergoroohkala _item = null;
String _mc = "";
int _count = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
int _i = 0;
RDebugUtils.currentLine=35717120;
 //BA.debugLineNum = 35717120;BA.debugLine="Sub NiceSpinner1_ItemClick (Position As Int, Value";
RDebugUtils.currentLine=35717121;
 //BA.debugLineNum = 35717121;BA.debugLine="Try";
try {RDebugUtils.currentLine=35717122;
 //BA.debugLineNum = 35717122;BA.debugLine="If Position=0 Then";
if (_position==0) { 
RDebugUtils.currentLine=35717123;
 //BA.debugLineNum = 35717123;BA.debugLine="GroupCodeSelect2=lstSelectedCodeGroupKala.Get(l";
mostCurrent._groupcodeselect2 = BA.ObjectToString(mostCurrent._lstselectedcodegroupkala.Get((int) (mostCurrent._lstselectedcodegroupkala.getSize()-1)));
 }else {
RDebugUtils.currentLine=35717125;
 //BA.debugLineNum = 35717125;BA.debugLine="Dim lst As List=ListGoroohKala1";
_lst = new anywheresoftware.b4a.objects.collections.List();
_lst = mostCurrent._listgoroohkala1;
RDebugUtils.currentLine=35717126;
 //BA.debugLineNum = 35717126;BA.debugLine="Dim Item As AdapterGoroohKala=lst.Get(Position-";
_item = (ir.parsikhesab.pakhsh.mcode._adaptergoroohkala)(_lst.Get((int) (_position-1)));
RDebugUtils.currentLine=35717127;
 //BA.debugLineNum = 35717127;BA.debugLine="GroupCodeSelect2=Item.FldC_Gorooh";
mostCurrent._groupcodeselect2 = _item.FldC_Gorooh /*String*/ ;
RDebugUtils.currentLine=35717129;
 //BA.debugLineNum = 35717129;BA.debugLine="Dim mc As String=Item.FldC_Gorooh";
_mc = _item.FldC_Gorooh /*String*/ ;
RDebugUtils.currentLine=35717131;
 //BA.debugLineNum = 35717131;BA.debugLine="Dim Count As Int = mc.Length + 3";
_count = (int) (_mc.length()+3);
RDebugUtils.currentLine=35717132;
 //BA.debugLineNum = 35717132;BA.debugLine="Dim Cu As Cursor=MCode.Result(\"Select FldC_Goro";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select FldC_Gorooh,FldN_Gorooh From TblGoroohKala where FldC_Gorooh Like '"+_mc+"%' And Length(FldC_Gorooh) = "+BA.NumberToString(_count)+" ORDER BY FldC_Gorooh");
RDebugUtils.currentLine=35717133;
 //BA.debugLineNum = 35717133;BA.debugLine="If Cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=35717134;
 //BA.debugLineNum = 35717134;BA.debugLine="ListGoroohKala1.Clear";
mostCurrent._listgoroohkala1.Clear();
RDebugUtils.currentLine=35717138;
 //BA.debugLineNum = 35717138;BA.debugLine="lstSelectedCodeGroupKala.Add(Item.FldC_Gorooh)";
mostCurrent._lstselectedcodegroupkala.Add((Object)(_item.FldC_Gorooh /*String*/ ));
RDebugUtils.currentLine=35717142;
 //BA.debugLineNum = 35717142;BA.debugLine="lstGroup2.Clear";
mostCurrent._lstgroup2.Clear();
RDebugUtils.currentLine=35717144;
 //BA.debugLineNum = 35717144;BA.debugLine="lstGroup2.Add(\"همه گروه ها\")";
mostCurrent._lstgroup2.Add((Object)("همه گروه ها"));
RDebugUtils.currentLine=35717146;
 //BA.debugLineNum = 35717146;BA.debugLine="For i=0 To Cu.RowCount-1";
{
final int step16 = 1;
final int limit16 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit16 ;_i = _i + step16 ) {
RDebugUtils.currentLine=35717147;
 //BA.debugLineNum = 35717147;BA.debugLine="Cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=35717148;
 //BA.debugLineNum = 35717148;BA.debugLine="Dim Item As AdapterGoroohKala";
_item = new ir.parsikhesab.pakhsh.mcode._adaptergoroohkala();
RDebugUtils.currentLine=35717149;
 //BA.debugLineNum = 35717149;BA.debugLine="Item.FldC_Gorooh=Cu.GetString(\"FldC_Gorooh\")";
_item.FldC_Gorooh /*String*/  = _cu.GetString("FldC_Gorooh");
RDebugUtils.currentLine=35717150;
 //BA.debugLineNum = 35717150;BA.debugLine="Item.FldN_Gorooh=Cu.GetString(\"FldN_Gorooh\")";
_item.FldN_Gorooh /*String*/  = _cu.GetString("FldN_Gorooh");
RDebugUtils.currentLine=35717151;
 //BA.debugLineNum = 35717151;BA.debugLine="ListGoroohKala1.Add(Item)";
mostCurrent._listgoroohkala1.Add((Object)(_item));
RDebugUtils.currentLine=35717153;
 //BA.debugLineNum = 35717153;BA.debugLine="lstGroup2.Add(Cu.GetString(\"FldN_Gorooh\"))";
mostCurrent._lstgroup2.Add((Object)(_cu.GetString("FldN_Gorooh")));
 }
};
RDebugUtils.currentLine=35717158;
 //BA.debugLineNum = 35717158;BA.debugLine="NiceSpinner1.attachDataSource(lstGroup2)";
mostCurrent._nicespinner1.attachDataSource((java.util.List)(mostCurrent._lstgroup2.getObject()));
RDebugUtils.currentLine=35717159;
 //BA.debugLineNum = 35717159;BA.debugLine="NiceSpinner1.SelectedIndex = 0";
mostCurrent._nicespinner1.setSelectedIndex((int) (0));
 };
 };
RDebugUtils.currentLine=35717162;
 //BA.debugLineNum = 35717162;BA.debugLine="LoadKala";
_loadkala();
RDebugUtils.currentLine=35717163;
 //BA.debugLineNum = 35717163;BA.debugLine="Log(\"CodeGroupSelect2: \"&GroupCodeSelect2)";
anywheresoftware.b4a.keywords.Common.LogImpl("535717163","CodeGroupSelect2: "+mostCurrent._groupcodeselect2,0);
RDebugUtils.currentLine=35717164;
 //BA.debugLineNum = 35717164;BA.debugLine="Log(\"position2: \"&Position)";
anywheresoftware.b4a.keywords.Common.LogImpl("535717164","position2: "+BA.NumberToString(_position),0);
 } 
       catch (Exception e32) {
			processBA.setLastException(e32);RDebugUtils.currentLine=35717166;
 //BA.debugLineNum = 35717166;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("535717166",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=35717167;
 //BA.debugLineNum = 35717167;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-NiceSpinner1_ItemClick");
 };
RDebugUtils.currentLine=35717169;
 //BA.debugLineNum = 35717169;BA.debugLine="End Sub";
return "";
}
public static String  _numbersearch_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "numbersearch_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "numbersearch_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=36438016;
 //BA.debugLineNum = 36438016;BA.debugLine="Sub NumberSearch_TextChanged (Old As String, New A";
RDebugUtils.currentLine=36438017;
 //BA.debugLineNum = 36438017;BA.debugLine="If TxtSearch.Text.StartsWith(\" \") Then";
if (mostCurrent._txtsearch.getText().startsWith(" ")) { 
RDebugUtils.currentLine=36438018;
 //BA.debugLineNum = 36438018;BA.debugLine="TxtSearch.Text=TxtSearch.Text.SubString(1)";
mostCurrent._txtsearch.setText(BA.ObjectToCharSequence(mostCurrent._txtsearch.getText().substring((int) (1))));
 };
RDebugUtils.currentLine=36438020;
 //BA.debugLineNum = 36438020;BA.debugLine="TxtSearch.SelectionStart=TxtSearch.Text.Length";
mostCurrent._txtsearch.setSelectionStart(mostCurrent._txtsearch.getText().length());
RDebugUtils.currentLine=36438021;
 //BA.debugLineNum = 36438021;BA.debugLine="LoadKala";
_loadkala();
RDebugUtils.currentLine=36438022;
 //BA.debugLineNum = 36438022;BA.debugLine="End Sub";
return "";
}
public static String  _pnl_down_click() throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "pnl_down_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "pnl_down_click", null));}
int _count = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
int _i = 0;
RDebugUtils.currentLine=38404096;
 //BA.debugLineNum = 38404096;BA.debugLine="Sub Pnl_Down_Click";
RDebugUtils.currentLine=38404097;
 //BA.debugLineNum = 38404097;BA.debugLine="If MCode.feeTip=0 Then";
if ((mostCurrent._mcode._feetip /*String*/ ).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=38404098;
 //BA.debugLineNum = 38404098;BA.debugLine="ToastMessageShow(\"لطفا تیپ قیمت را مشخص کنید\",Fa";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("لطفا تیپ قیمت را مشخص کنید"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=38404099;
 //BA.debugLineNum = 38404099;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=38404101;
 //BA.debugLineNum = 38404101;BA.debugLine="If MCode.C_Tafzili=0 Or myCode.Check_Is_Null(MCod";
if ((mostCurrent._mcode._c_tafzili /*String*/ ).equals(BA.NumberToString(0)) || mostCurrent._mycode._check_is_null /*boolean*/ (mostCurrent.activityBA,mostCurrent._mcode._c_tafzili /*String*/ ) || (mostCurrent._mcode._c_tafzili /*String*/ ).equals("")) { 
RDebugUtils.currentLine=38404102;
 //BA.debugLineNum = 38404102;BA.debugLine="ToastMessageShow(\"لطفا مشتری را انتخاب کنید\",Fal";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("لطفا مشتری را انتخاب کنید"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=38404103;
 //BA.debugLineNum = 38404103;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=38404105;
 //BA.debugLineNum = 38404105;BA.debugLine="If MCode.CheckBlackList(MCode.C_Tafzili) Then";
if (mostCurrent._mcode._checkblacklist /*boolean*/ (mostCurrent.activityBA,mostCurrent._mcode._c_tafzili /*String*/ )) { 
RDebugUtils.currentLine=38404106;
 //BA.debugLineNum = 38404106;BA.debugLine="ToastMessageShow(\"این مشتری در لیست سیاه میباشد\"";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("این مشتری در لیست سیاه میباشد"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=38404107;
 //BA.debugLineNum = 38404107;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=38404110;
 //BA.debugLineNum = 38404110;BA.debugLine="If MCode.ManedEtebarEnable=True And MCode.MandeEt";
if (mostCurrent._mcode._manedetebarenable /*boolean*/ ==anywheresoftware.b4a.keywords.Common.True && (mostCurrent._mcode._mandeetebar /*String*/ ).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=38404111;
 //BA.debugLineNum = 38404111;BA.debugLine="ToastMessageShow(\"سقف اعتبار این مشتری به اتمام";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("سقف اعتبار این مشتری به اتمام رسیده است."),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=38404112;
 //BA.debugLineNum = 38404112;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=38404115;
 //BA.debugLineNum = 38404115;BA.debugLine="If MCode.ManedEtebarEnable And MCode.FinalFaktor.";
if (mostCurrent._mcode._manedetebarenable /*boolean*/  && (double)(Double.parseDouble(mostCurrent._mcode._finalfaktor /*ir.parsikhesab.pakhsh.mcode._finalfaktor_*/ .GablePardakht /*String*/ ))>(double)(Double.parseDouble(mostCurrent._mcode._mandeetebar /*String*/ ))) { 
RDebugUtils.currentLine=38404116;
 //BA.debugLineNum = 38404116;BA.debugLine="ToastMessageShow(\"جمع مبلغ سفارش از اعتبار مشتری";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("جمع مبلغ سفارش از اعتبار مشتری بیشتر میباشد."),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=38404117;
 //BA.debugLineNum = 38404117;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=38404124;
 //BA.debugLineNum = 38404124;BA.debugLine="If LblBasketCount.Visible Then";
if (mostCurrent._lblbasketcount.getVisible()) { 
RDebugUtils.currentLine=38404125;
 //BA.debugLineNum = 38404125;BA.debugLine="If MCode.EshantionTabaghati=1 Then";
if ((mostCurrent._mcode._eshantiontabaghati /*String*/ ).equals(BA.NumberToString(1))) { 
RDebugUtils.currentLine=38404126;
 //BA.debugLineNum = 38404126;BA.debugLine="MCode.SaveUpdate(\"Delete from TblSabad where Fl";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Delete from TblSabad where FldEshantion<>'0'");
RDebugUtils.currentLine=38404127;
 //BA.debugLineNum = 38404127;BA.debugLine="Dim count As Int=MCode.SingleResult(\"Select Cou";
_count = (int)(BA.ObjectToNumber(mostCurrent._mcode._singleresult /*Object*/ (mostCurrent.activityBA,"Select Count(FldCodeKala) From TblSabad ")));
RDebugUtils.currentLine=38404128;
 //BA.debugLineNum = 38404128;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblSabad where FldCodeKala IN(SELECT tblEshantionTabaghati.fldCodeKalaForoosh FROM tblEshantionTabaghati)");
RDebugUtils.currentLine=38404129;
 //BA.debugLineNum = 38404129;BA.debugLine="For i=0 To Cu.RowCount -1";
{
final int step26 = 1;
final int limit26 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit26 ;_i = _i + step26 ) {
RDebugUtils.currentLine=38404130;
 //BA.debugLineNum = 38404130;BA.debugLine="Cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=38404132;
 //BA.debugLineNum = 38404132;BA.debugLine="AddEshantion(Cu)";
_addeshantion(_cu);
 }
};
 };
RDebugUtils.currentLine=38404135;
 //BA.debugLineNum = 38404135;BA.debugLine="StartActivity(Act_Sabad)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._act_sabad.getObject()));
 }else {
RDebugUtils.currentLine=38404138;
 //BA.debugLineNum = 38404138;BA.debugLine="ToastMessageShow(\"سبد خرید خالی است\",False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("سبد خرید خالی است"),anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=38404140;
 //BA.debugLineNum = 38404140;BA.debugLine="End Sub";
return "";
}
public static String  _pnltedad_click() throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "pnltedad_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "pnltedad_click", null));}
RDebugUtils.currentLine=36503552;
 //BA.debugLineNum = 36503552;BA.debugLine="Sub PnlTedad_Click";
RDebugUtils.currentLine=36503554;
 //BA.debugLineNum = 36503554;BA.debugLine="End Sub";
return "";
}
public static String  _showlastexception() throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "showlastexception", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "showlastexception", null));}
String _ex = "";
String _stripex = "";
RDebugUtils.currentLine=39124992;
 //BA.debugLineNum = 39124992;BA.debugLine="Sub ShowLastException";
RDebugUtils.currentLine=39124993;
 //BA.debugLineNum = 39124993;BA.debugLine="Dim EX As String";
_ex = "";
RDebugUtils.currentLine=39124994;
 //BA.debugLineNum = 39124994;BA.debugLine="Dim stripEX As String";
_stripex = "";
RDebugUtils.currentLine=39124995;
 //BA.debugLineNum = 39124995;BA.debugLine="EX = LastException.Message ' this is line 3";
_ex = anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getMessage();
RDebugUtils.currentLine=39124996;
 //BA.debugLineNum = 39124996;BA.debugLine="stripEX = EX.SubString(28)";
_stripex = _ex.substring((int) (28));
RDebugUtils.currentLine=39124997;
 //BA.debugLineNum = 39124997;BA.debugLine="Msgbox(stripEX, \"Login error\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence(_stripex),BA.ObjectToCharSequence("Login error"),mostCurrent.activityBA);
RDebugUtils.currentLine=39124998;
 //BA.debugLineNum = 39124998;BA.debugLine="End Sub";
return "";
}
public static String  _swarzeshafzodeenable_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "swarzeshafzodeenable_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "swarzeshafzodeenable_checkedchange", new Object[] {_checked}));}
String _countsabad = "";
RDebugUtils.currentLine=39845888;
 //BA.debugLineNum = 39845888;BA.debugLine="Private Sub SwArzeshAfzodeEnable_CheckedChange(Che";
RDebugUtils.currentLine=39845890;
 //BA.debugLineNum = 39845890;BA.debugLine="If Checked Then";
if (_checked) { 
RDebugUtils.currentLine=39845891;
 //BA.debugLineNum = 39845891;BA.debugLine="ItemSelected.fldDarsadArzeshAfzode=MCode.ArzeshA";
mostCurrent._itemselected.fldDarsadArzeshAfzode /*String*/  = mostCurrent._mcode._arzeshafzode /*String*/ ;
RDebugUtils.currentLine=39845893;
 //BA.debugLineNum = 39845893;BA.debugLine="MCode.ArzeshAfzodeEnable=1";
mostCurrent._mcode._arzeshafzodeenable /*String*/  = BA.NumberToString(1);
RDebugUtils.currentLine=39845894;
 //BA.debugLineNum = 39845894;BA.debugLine="lblDarsadArzeshAfzode.Text=$\" ارزش افزوده: ${MCo";
mostCurrent._lbldarsadarzeshafzode.setText(BA.ObjectToCharSequence((" ارزش افزوده: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._mcode._arzeshafzode /*String*/ ))+" %")));
RDebugUtils.currentLine=39845895;
 //BA.debugLineNum = 39845895;BA.debugLine="lblArzeshAfzode.Text=\"مبلغ ارزش افزوده: 0\"";
mostCurrent._lblarzeshafzode.setText(BA.ObjectToCharSequence("مبلغ ارزش افزوده: 0"));
 }else {
RDebugUtils.currentLine=39845898;
 //BA.debugLineNum = 39845898;BA.debugLine="ItemSelected.fldDarsadArzeshAfzode=0";
mostCurrent._itemselected.fldDarsadArzeshAfzode /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=39845899;
 //BA.debugLineNum = 39845899;BA.debugLine="ItemSelected.fldDarsadArzeshAfzodeKala=0";
mostCurrent._itemselected.fldDarsadArzeshAfzodeKala /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=39845900;
 //BA.debugLineNum = 39845900;BA.debugLine="ItemSelected.fldArzeshAfzodeKala=0";
mostCurrent._itemselected.fldArzeshAfzodeKala /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=39845901;
 //BA.debugLineNum = 39845901;BA.debugLine="MCode.ArzeshAfzodeEnable=0";
mostCurrent._mcode._arzeshafzodeenable /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=39845902;
 //BA.debugLineNum = 39845902;BA.debugLine="lblDarsadArzeshAfzode.Text=\"ارزش افزوده: 0 %\"";
mostCurrent._lbldarsadarzeshafzode.setText(BA.ObjectToCharSequence("ارزش افزوده: 0 %"));
RDebugUtils.currentLine=39845903;
 //BA.debugLineNum = 39845903;BA.debugLine="lblArzeshAfzode.Text=\"مبلغ ارزش افزوده: 0\"";
mostCurrent._lblarzeshafzode.setText(BA.ObjectToCharSequence("مبلغ ارزش افزوده: 0"));
 };
RDebugUtils.currentLine=39845906;
 //BA.debugLineNum = 39845906;BA.debugLine="Dim countSabad As String = MCode.SingleResult(\"Se";
_countsabad = BA.ObjectToString(mostCurrent._mcode._singleresult /*Object*/ (mostCurrent.activityBA,"Select Count(FldId) From TblSabad"));
RDebugUtils.currentLine=39845907;
 //BA.debugLineNum = 39845907;BA.debugLine="If countSabad>0 Then";
if ((double)(Double.parseDouble(_countsabad))>0) { 
RDebugUtils.currentLine=39845908;
 //BA.debugLineNum = 39845908;BA.debugLine="MCode.SaveUpdate(\"Update TblSabad Set fldDarsadA";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Update TblSabad Set fldDarsadArzeshAfzode='"+mostCurrent._itemselected.fldDarsadArzeshAfzode /*String*/ +"'");
 };
RDebugUtils.currentLine=39845911;
 //BA.debugLineNum = 39845911;BA.debugLine="MCode.CreateReportSabad";
mostCurrent._mcode._createreportsabad /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=39845912;
 //BA.debugLineNum = 39845912;BA.debugLine="RefreshLblSabad";
_refreshlblsabad();
RDebugUtils.currentLine=39845913;
 //BA.debugLineNum = 39845913;BA.debugLine="End Sub";
return "";
}
public static String  _swgift_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "swgift_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "swgift_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=37224448;
 //BA.debugLineNum = 37224448;BA.debugLine="Sub SwGift_CheckedChange(Checked As Boolean)";
RDebugUtils.currentLine=37224449;
 //BA.debugLineNum = 37224449;BA.debugLine="LoadKala";
_loadkala();
RDebugUtils.currentLine=37224450;
 //BA.debugLineNum = 37224450;BA.debugLine="End Sub";
return "";
}
public static String  _swmojoodi_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "swmojoodi_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "swmojoodi_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=37355520;
 //BA.debugLineNum = 37355520;BA.debugLine="Sub SwMojoodi_CheckedChange(Checked As Boolean)";
RDebugUtils.currentLine=37355521;
 //BA.debugLineNum = 37355521;BA.debugLine="LoadKala";
_loadkala();
RDebugUtils.currentLine=37355522;
 //BA.debugLineNum = 37355522;BA.debugLine="End Sub";
return "";
}
public static String  _swpic_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "swpic_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "swpic_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=37421056;
 //BA.debugLineNum = 37421056;BA.debugLine="Sub SwPic_CheckedChange(Checked As Boolean)";
RDebugUtils.currentLine=37421057;
 //BA.debugLineNum = 37421057;BA.debugLine="LoadKala";
_loadkala();
RDebugUtils.currentLine=37421058;
 //BA.debugLineNum = 37421058;BA.debugLine="End Sub";
return "";
}
public static String  _swsearchnumber_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "swsearchnumber_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "swsearchnumber_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=39583744;
 //BA.debugLineNum = 39583744;BA.debugLine="Private Sub SwSearchNumber_CheckedChange(Checked A";
RDebugUtils.currentLine=39583745;
 //BA.debugLineNum = 39583745;BA.debugLine="If Checked Then";
if (_checked) { 
RDebugUtils.currentLine=39583746;
 //BA.debugLineNum = 39583746;BA.debugLine="SearchNumber=1";
mostCurrent._searchnumber = BA.NumberToString(1);
 }else {
RDebugUtils.currentLine=39583748;
 //BA.debugLineNum = 39583748;BA.debugLine="SearchNumber=0";
mostCurrent._searchnumber = BA.NumberToString(0);
 };
RDebugUtils.currentLine=39583750;
 //BA.debugLineNum = 39583750;BA.debugLine="End Sub";
return "";
}
public static String  _swtakhfif_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "swtakhfif_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "swtakhfif_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=37289984;
 //BA.debugLineNum = 37289984;BA.debugLine="Sub SwTakhfif_CheckedChange(Checked As Boolean)";
RDebugUtils.currentLine=37289985;
 //BA.debugLineNum = 37289985;BA.debugLine="LoadKala";
_loadkala();
RDebugUtils.currentLine=37289986;
 //BA.debugLineNum = 37289986;BA.debugLine="End Sub";
return "";
}
public static String  _th_ended(boolean _endedok,String _error) throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "th_ended", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "th_ended", new Object[] {_endedok,_error}));}
RDebugUtils.currentLine=34471936;
 //BA.debugLineNum = 34471936;BA.debugLine="Private Sub th_Ended(endedOK As Boolean, error As";
RDebugUtils.currentLine=34471937;
 //BA.debugLineNum = 34471937;BA.debugLine="Log(\"th \" & endedOK)";
anywheresoftware.b4a.keywords.Common.LogImpl("534471937","th "+BA.ObjectToString(_endedok),0);
RDebugUtils.currentLine=34471938;
 //BA.debugLineNum = 34471938;BA.debugLine="End Sub";
return "";
}
public static String  _txtdarsadtakhfif_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "txtdarsadtakhfif_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "txtdarsadtakhfif_textchanged", new Object[] {_old,_new}));}
long _no = 0L;
String _tedadkol = "";
RDebugUtils.currentLine=39256064;
 //BA.debugLineNum = 39256064;BA.debugLine="Private Sub txtDarsadTakhfif_TextChanged (Old As S";
RDebugUtils.currentLine=39256065;
 //BA.debugLineNum = 39256065;BA.debugLine="Try";
try {RDebugUtils.currentLine=39256066;
 //BA.debugLineNum = 39256066;BA.debugLine="Dim no As Long";
_no = 0L;
RDebugUtils.currentLine=39256067;
 //BA.debugLineNum = 39256067;BA.debugLine="If MCode.ConvertNumbersPersian2English(Old) <> MCo";
if ((mostCurrent._mcode._convertnumberspersian2english /*String*/ (mostCurrent.activityBA,_old)).equals(mostCurrent._mcode._convertnumberspersian2english /*String*/ (mostCurrent.activityBA,_new)) == false) { 
RDebugUtils.currentLine=39256068;
 //BA.debugLineNum = 39256068;BA.debugLine="Try";
try {RDebugUtils.currentLine=39256070;
 //BA.debugLineNum = 39256070;BA.debugLine="no = txtDarsadTakhfif.Text";
_no = (long)(Double.parseDouble(mostCurrent._txtdarsadtakhfif.getText()));
RDebugUtils.currentLine=39256071;
 //BA.debugLineNum = 39256071;BA.debugLine="If no>100 Then";
if (_no>100) { 
RDebugUtils.currentLine=39256072;
 //BA.debugLineNum = 39256072;BA.debugLine="no=Old";
_no = (long)(Double.parseDouble(_old));
 };
RDebugUtils.currentLine=39256075;
 //BA.debugLineNum = 39256075;BA.debugLine="txtchanged=True";
_txtchanged = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=39256077;
 //BA.debugLineNum = 39256077;BA.debugLine="Log(no)";
anywheresoftware.b4a.keywords.Common.LogImpl("539256077",BA.NumberToString(_no),0);
 } 
       catch (Exception e12) {
			processBA.setLastException(e12);RDebugUtils.currentLine=39256082;
 //BA.debugLineNum = 39256082;BA.debugLine="no=0";
_no = (long) (0);
RDebugUtils.currentLine=39256083;
 //BA.debugLineNum = 39256083;BA.debugLine="txtFee.Text=\"\"";
mostCurrent._txtfee.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=39256084;
 //BA.debugLineNum = 39256084;BA.debugLine="txtDarsadTakhfif.Text=\"\"";
mostCurrent._txtdarsadtakhfif.setText(BA.ObjectToCharSequence(""));
 };
 };
RDebugUtils.currentLine=39256087;
 //BA.debugLineNum = 39256087;BA.debugLine="If txtchanged Then";
if (_txtchanged) { 
RDebugUtils.currentLine=39256088;
 //BA.debugLineNum = 39256088;BA.debugLine="txtchanged=False";
_txtchanged = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=39256089;
 //BA.debugLineNum = 39256089;BA.debugLine="txtDarsadTakhfif.Tag=no";
mostCurrent._txtdarsadtakhfif.setTag((Object)(_no));
RDebugUtils.currentLine=39256090;
 //BA.debugLineNum = 39256090;BA.debugLine="txtDarsadTakhfif.Text=no";
mostCurrent._txtdarsadtakhfif.setText(BA.ObjectToCharSequence(_no));
RDebugUtils.currentLine=39256091;
 //BA.debugLineNum = 39256091;BA.debugLine="Dim TedadKol As String=ItemSelected.TedadDarSab";
_tedadkol = BA.NumberToString((double)(Double.parseDouble(mostCurrent._itemselected.TedadDarSabadJoz /*String*/ ))+((double)(Double.parseDouble(mostCurrent._itemselected.TedadDarSabadKol /*String*/ ))*(double)(Double.parseDouble(mostCurrent._itemselected.TedadDarKarton /*String*/ ))));
RDebugUtils.currentLine=39256092;
 //BA.debugLineNum = 39256092;BA.debugLine="If no>0 Then";
if (_no>0) { 
RDebugUtils.currentLine=39256093;
 //BA.debugLineNum = 39256093;BA.debugLine="If TedadKol> 0 Then";
if ((double)(Double.parseDouble(_tedadkol))>0) { 
RDebugUtils.currentLine=39256094;
 //BA.debugLineNum = 39256094;BA.debugLine="txtFee.Text=(((ItemSelected.FeeForoosh*TedadK";
mostCurrent._txtfee.setText(BA.ObjectToCharSequence((((mostCurrent._itemselected.FeeForoosh /*int*/ *(double)(Double.parseDouble(_tedadkol)))*_no)/(double)100)));
 }else {
RDebugUtils.currentLine=39256096;
 //BA.debugLineNum = 39256096;BA.debugLine="txtFee.Text=(((ItemSelected.FeeForoosh)*no)/1";
mostCurrent._txtfee.setText(BA.ObjectToCharSequence((((mostCurrent._itemselected.FeeForoosh /*int*/ )*_no)/(double)100)));
 };
 }else {
RDebugUtils.currentLine=39256100;
 //BA.debugLineNum = 39256100;BA.debugLine="txtFee.Text=no";
mostCurrent._txtfee.setText(BA.ObjectToCharSequence(_no));
 };
 };
RDebugUtils.currentLine=39256103;
 //BA.debugLineNum = 39256103;BA.debugLine="txtDarsadTakhfif.SelectionStart=txtDarsadTakhfif.T";
mostCurrent._txtdarsadtakhfif.setSelectionStart(mostCurrent._txtdarsadtakhfif.getText().length());
 } 
       catch (Exception e34) {
			processBA.setLastException(e34);RDebugUtils.currentLine=39256105;
 //BA.debugLineNum = 39256105;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("539256105",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=39256106;
 //BA.debugLineNum = 39256106;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-tx";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-txtDarsadTakhfif_TextChanged");
 };
RDebugUtils.currentLine=39256108;
 //BA.debugLineNum = 39256108;BA.debugLine="End Sub";
return "";
}
public static String  _txtfee_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "txtfee_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "txtfee_textchanged", new Object[] {_old,_new}));}
long _no = 0L;
RDebugUtils.currentLine=37814272;
 //BA.debugLineNum = 37814272;BA.debugLine="Private Sub txtFee_TextChanged (Old As String, New";
RDebugUtils.currentLine=37814273;
 //BA.debugLineNum = 37814273;BA.debugLine="Try";
try {RDebugUtils.currentLine=37814274;
 //BA.debugLineNum = 37814274;BA.debugLine="Dim no As Long";
_no = 0L;
RDebugUtils.currentLine=37814275;
 //BA.debugLineNum = 37814275;BA.debugLine="If MCode.ConvertNumbersPersian2English(Old) <> M";
if ((mostCurrent._mcode._convertnumberspersian2english /*String*/ (mostCurrent.activityBA,_old)).equals(mostCurrent._mcode._convertnumberspersian2english /*String*/ (mostCurrent.activityBA,_new)) == false) { 
RDebugUtils.currentLine=37814276;
 //BA.debugLineNum = 37814276;BA.debugLine="Try";
try {RDebugUtils.currentLine=37814277;
 //BA.debugLineNum = 37814277;BA.debugLine="no = txtFee.Text.Replace(\",\",\"\")";
_no = (long)(Double.parseDouble(mostCurrent._txtfee.getText().replace(",","")));
RDebugUtils.currentLine=37814278;
 //BA.debugLineNum = 37814278;BA.debugLine="txtchanged=True";
_txtchanged = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=37814279;
 //BA.debugLineNum = 37814279;BA.debugLine="Log(no)";
anywheresoftware.b4a.keywords.Common.LogImpl("537814279",BA.NumberToString(_no),0);
 } 
       catch (Exception e9) {
			processBA.setLastException(e9);RDebugUtils.currentLine=37814281;
 //BA.debugLineNum = 37814281;BA.debugLine="no=0";
_no = (long) (0);
RDebugUtils.currentLine=37814282;
 //BA.debugLineNum = 37814282;BA.debugLine="txtFee.Text=\"\"";
mostCurrent._txtfee.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=37814283;
 //BA.debugLineNum = 37814283;BA.debugLine="If FeeType=\"btn_discount_Click\" Then";
if ((mostCurrent._feetype).equals("btn_discount_Click")) { 
RDebugUtils.currentLine=37814284;
 //BA.debugLineNum = 37814284;BA.debugLine="txtDarsadTakhfif.Text=\"\"";
mostCurrent._txtdarsadtakhfif.setText(BA.ObjectToCharSequence(""));
 };
 };
 };
RDebugUtils.currentLine=37814288;
 //BA.debugLineNum = 37814288;BA.debugLine="If txtchanged Then";
if (_txtchanged) { 
RDebugUtils.currentLine=37814289;
 //BA.debugLineNum = 37814289;BA.debugLine="txtchanged=False";
_txtchanged = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=37814290;
 //BA.debugLineNum = 37814290;BA.debugLine="txtFee.Tag=no";
mostCurrent._txtfee.setTag((Object)(_no));
RDebugUtils.currentLine=37814291;
 //BA.debugLineNum = 37814291;BA.debugLine="txtFee.Text=NumberFormat2(no,0,0,0,True)";
mostCurrent._txtfee.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.NumberFormat2(_no,(int) (0),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.True)));
 };
RDebugUtils.currentLine=37814293;
 //BA.debugLineNum = 37814293;BA.debugLine="txtFee.SetSelection(txtFee.Text.Length,0)";
mostCurrent._txtfee.SetSelection(mostCurrent._txtfee.getText().length(),(int) (0));
 } 
       catch (Exception e23) {
			processBA.setLastException(e23);RDebugUtils.currentLine=37814295;
 //BA.debugLineNum = 37814295;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("537814295",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=37814296;
 //BA.debugLineNum = 37814296;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-txtFee_TextChanged");
 };
RDebugUtils.currentLine=37814298;
 //BA.debugLineNum = 37814298;BA.debugLine="End Sub";
return "";
}
public static String  _txtsearch_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "txtsearch_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "txtsearch_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=36569088;
 //BA.debugLineNum = 36569088;BA.debugLine="Sub TxtSearch_TextChanged (Old As String, New As S";
RDebugUtils.currentLine=36569090;
 //BA.debugLineNum = 36569090;BA.debugLine="If IsNumber(New) And SearchNumber=0 Then";
if (anywheresoftware.b4a.keywords.Common.IsNumber(_new) && (mostCurrent._searchnumber).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=36569091;
 //BA.debugLineNum = 36569091;BA.debugLine="New=MCode.ConvertNumbersPersian2English(New)";
_new = mostCurrent._mcode._convertnumberspersian2english /*String*/ (mostCurrent.activityBA,_new);
RDebugUtils.currentLine=36569092;
 //BA.debugLineNum = 36569092;BA.debugLine="ListKalaTxt = Utils.FilterSearchList(\"CodeKala\",";
mostCurrent._listkalatxt = mostCurrent._utils.FilterSearchList("CodeKala",mostCurrent._orginallistkala).Contains(_new);
 }else 
{RDebugUtils.currentLine=36569093;
 //BA.debugLineNum = 36569093;BA.debugLine="else If IsNumber(New) And SearchNumber=1 Then";
if (anywheresoftware.b4a.keywords.Common.IsNumber(_new) && (mostCurrent._searchnumber).equals(BA.NumberToString(1))) { 
RDebugUtils.currentLine=36569094;
 //BA.debugLineNum = 36569094;BA.debugLine="New=MCode.ConvertNumbersPersian2English(New)";
_new = mostCurrent._mcode._convertnumberspersian2english /*String*/ (mostCurrent.activityBA,_new);
RDebugUtils.currentLine=36569095;
 //BA.debugLineNum = 36569095;BA.debugLine="ListKalaTxt = Utils.FilterSearchList(\"NameKala\",";
mostCurrent._listkalatxt = mostCurrent._utils.FilterSearchList("NameKala",mostCurrent._orginallistkala).Contains(_new);
 }else {
RDebugUtils.currentLine=36569097;
 //BA.debugLineNum = 36569097;BA.debugLine="ListKalaTxt = Utils.FilterSearchList(\"NameKala\",";
mostCurrent._listkalatxt = mostCurrent._utils.FilterSearchList("NameKala",mostCurrent._orginallistkala).Contains(_new);
 }}
;
RDebugUtils.currentLine=36569099;
 //BA.debugLineNum = 36569099;BA.debugLine="HLV.ScrollToPosition(0)";
mostCurrent._hlv.ScrollToPosition((int) (0));
RDebugUtils.currentLine=36569100;
 //BA.debugLineNum = 36569100;BA.debugLine="HLV.notifyDataSetChanged";
mostCurrent._hlv.notifyDataSetChanged();
RDebugUtils.currentLine=36569120;
 //BA.debugLineNum = 36569120;BA.debugLine="End Sub";
return "";
}
public static String  _updatefeeoffline() throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "updatefeeoffline", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "updatefeeoffline", null));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
int _i = 0;
RDebugUtils.currentLine=37683200;
 //BA.debugLineNum = 37683200;BA.debugLine="Sub UpdateFeeOffline";
RDebugUtils.currentLine=37683201;
 //BA.debugLineNum = 37683201;BA.debugLine="If IsNumber(MCode.feeCode) And MCode.feeCode>0 Th";
if (anywheresoftware.b4a.keywords.Common.IsNumber(mostCurrent._mcode._feecode /*String*/ ) && (double)(Double.parseDouble(mostCurrent._mcode._feecode /*String*/ ))>0) { 
RDebugUtils.currentLine=37683202;
 //BA.debugLineNum = 37683202;BA.debugLine="Dim cu As Cursor";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=37683203;
 //BA.debugLineNum = 37683203;BA.debugLine="cu=MCode.Result(\"select * from TblFee where FldC";
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"select * from TblFee where FldCodeTasvie="+mostCurrent._mcode._feecode /*String*/ );
RDebugUtils.currentLine=37683204;
 //BA.debugLineNum = 37683204;BA.debugLine="If cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=37683205;
 //BA.debugLineNum = 37683205;BA.debugLine="For i=0 To cu.RowCount-1";
{
final int step5 = 1;
final int limit5 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=37683206;
 //BA.debugLineNum = 37683206;BA.debugLine="cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=37683207;
 //BA.debugLineNum = 37683207;BA.debugLine="Log(\"FldCodeKala:\"& cu.GetString(\"FldCodeKala\"";
anywheresoftware.b4a.keywords.Common.LogImpl("537683207","FldCodeKala:"+_cu.GetString("FldCodeKala"),0);
RDebugUtils.currentLine=37683208;
 //BA.debugLineNum = 37683208;BA.debugLine="Log(\"fldFeeTasvie:\"& cu.GetString(\"FldFee\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("537683208","fldFeeTasvie:"+_cu.GetString("FldFee"),0);
RDebugUtils.currentLine=37683209;
 //BA.debugLineNum = 37683209;BA.debugLine="MCode.SaveUpdate(\"Update TblKala Set fldFeeTas";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Update TblKala Set fldFeeTasvie='"+_cu.GetString("FldFee")+"'"+" where fldCodeKala="+_cu.GetString("FldCodeKala"));
 }
};
RDebugUtils.currentLine=37683212;
 //BA.debugLineNum = 37683212;BA.debugLine="LoadKala";
_loadkala();
 };
 };
RDebugUtils.currentLine=37683215;
 //BA.debugLineNum = 37683215;BA.debugLine="End Sub";
return "";
}
public static String  _upeshantion(String _codegroup,int _minas) throws Exception{
RDebugUtils.currentModule="act_kaladefault";
if (Debug.shouldDelegate(mostCurrent.activityBA, "upeshantion", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "upeshantion", new Object[] {_codegroup,_minas}));}
ir.parsikhesab.pakhsh.mcode._adapterlisteshantiongroup _item = null;
RDebugUtils.currentLine=38731776;
 //BA.debugLineNum = 38731776;BA.debugLine="Public Sub UpEshantion(CodeGroup As String,minas A";
RDebugUtils.currentLine=38731778;
 //BA.debugLineNum = 38731778;BA.debugLine="Dim Item As AdapterListEshantionGroup=CheckGroupE";
_item = _checkgroupeshantation(_codegroup);
RDebugUtils.currentLine=38731779;
 //BA.debugLineNum = 38731779;BA.debugLine="If Item.fldTedadEshantion>0 Or Item.fldTedadEshan";
if ((double)(Double.parseDouble(_item.fldTedadEshantion /*String*/ ))>0 || (_item.fldTedadEshantion /*String*/ ).equals(BA.NumberToString(_minas))) { 
RDebugUtils.currentLine=38731780;
 //BA.debugLineNum = 38731780;BA.debugLine="minas=minas-1";
_minas = (int) (_minas-1);
RDebugUtils.currentLine=38731781;
 //BA.debugLineNum = 38731781;BA.debugLine="MCode.SaveUpdate(\"Update tblEshantionGroupTemp S";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Update tblEshantionGroupTemp Set fldTedadEshantion="+BA.NumberToString(_minas)+" where fldCodeGroupKalaEshantion="+_codegroup);
RDebugUtils.currentLine=38731783;
 //BA.debugLineNum = 38731783;BA.debugLine="RefreshCountEshantionGroup";
_refreshcounteshantiongroup();
 };
RDebugUtils.currentLine=38731788;
 //BA.debugLineNum = 38731788;BA.debugLine="End Sub";
return "";
}
}