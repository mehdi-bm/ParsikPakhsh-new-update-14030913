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

public class act_sabad extends Activity implements B4AActivity{
	public static act_sabad mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.act_sabad");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (act_sabad).");
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
		activityBA = new BA(this, layout, processBA, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.act_sabad");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "ir.parsikhesab.pakhsh.act_sabad", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (act_sabad) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (act_sabad) Resume **");
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
		return act_sabad.class;
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
            BA.LogInfo("** Activity (act_sabad) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (act_sabad) Pause event (activity is not paused). **");
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
            act_sabad mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (act_sabad) Resume **");
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
public static Object _ion = null;
public anywheresoftware.b4a.objects.RuntimePermissions _rp = null;
public wir.hitex.recycler.Hitex_LayoutView _hlv = null;
public anywheresoftware.b4a.objects.IME _key = null;
public anywheresoftware.b4a.objects.collections.List _listsabad = null;
public anywheresoftware.b4a.objects.collections.List _originalitemlist = null;
public anywheresoftware.b4a.objects.collections.List _listtasvie = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblbasketcount = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnsabtsefaresh = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblnamemoshtari = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtsharhfaktor = null;
public anywheresoftware.b4a.objects.MapFragmentWrapper.GoogleMapWrapper _gmap = null;
public ir.parsikhesab.pakhsh.b4xdialog _dialog = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnl_hlv = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnltop = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlns = null;
public static String _feetip = "";
public static long _sumtakhfifriali = 0L;
public ir.parsikhesab.pakhsh.b4xcombobox _cmbbox1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblcodemoshtari = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtmablaghtakhfifikol = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblmablaghtakhfifikol = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblmojavezsefareshtext = null;
public de.amberhome.objects.appcompat.ACCheckBoxWrapper _chamani = null;
public static int _num = 0;
public igolub.fused.b4a.location.FusedLocationProviderClientWrapper _fused = null;
public static String _shomaresefaresh = "";
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
RDebugUtils.currentModule="act_sabad";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
anywheresoftware.b4a.objects.drawable.ColorDrawable _op = null;
RDebugUtils.currentLine=71172096;
 //BA.debugLineNum = 71172096;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=71172097;
 //BA.debugLineNum = 71172097;BA.debugLine="Activity.LoadLayout(\"L_Sabadkharid\")";
mostCurrent._activity.LoadLayout("L_Sabadkharid",mostCurrent.activityBA);
RDebugUtils.currentLine=71172098;
 //BA.debugLineNum = 71172098;BA.debugLine="Try";
try {RDebugUtils.currentLine=71172100;
 //BA.debugLineNum = 71172100;BA.debugLine="Fused.Initialize(\"FusedLocation\")";
mostCurrent._fused.Initialize(processBA,"FusedLocation");
RDebugUtils.currentLine=71172101;
 //BA.debugLineNum = 71172101;BA.debugLine="HLV.Initializer(\"HLV\").ListView.Build";
mostCurrent._hlv.Initializer(mostCurrent.activityBA,"HLV").ListView().Build();
RDebugUtils.currentLine=71172102;
 //BA.debugLineNum = 71172102;BA.debugLine="pnl_HLV.AddView(HLV,0,0,pnl_HLV.Width,pnl_HLV.Hei";
mostCurrent._pnl_hlv.AddView((android.view.View)(mostCurrent._hlv.getObject()),(int) (0),(int) (0),mostCurrent._pnl_hlv.getWidth(),mostCurrent._pnl_hlv.getHeight());
RDebugUtils.currentLine=71172103;
 //BA.debugLineNum = 71172103;BA.debugLine="Dialog.Initialize (Activity)";
mostCurrent._dialog._initialize /*String*/ (null,mostCurrent.activityBA,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(mostCurrent._activity.getObject())));
RDebugUtils.currentLine=71172109;
 //BA.debugLineNum = 71172109;BA.debugLine="Dim op As ColorDrawable";
_op = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=71172110;
 //BA.debugLineNum = 71172110;BA.debugLine="op.Initialize2(Colors.White,8dip,2dip,Colors.Blac";
_op.Initialize2(anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (8)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2)),anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=71172117;
 //BA.debugLineNum = 71172117;BA.debugLine="Key.Initialize(\"Key\")";
mostCurrent._key.Initialize("Key");
RDebugUtils.currentLine=71172118;
 //BA.debugLineNum = 71172118;BA.debugLine="ListSabad.Initialize";
mostCurrent._listsabad.Initialize();
RDebugUtils.currentLine=71172119;
 //BA.debugLineNum = 71172119;BA.debugLine="OriginalItemList.Initialize";
mostCurrent._originalitemlist.Initialize();
RDebugUtils.currentLine=71172120;
 //BA.debugLineNum = 71172120;BA.debugLine="ListSabad.Clear";
mostCurrent._listsabad.Clear();
RDebugUtils.currentLine=71172121;
 //BA.debugLineNum = 71172121;BA.debugLine="OriginalItemList.Clear";
mostCurrent._originalitemlist.Clear();
RDebugUtils.currentLine=71172122;
 //BA.debugLineNum = 71172122;BA.debugLine="HLV.Show";
mostCurrent._hlv.Show();
RDebugUtils.currentLine=71172133;
 //BA.debugLineNum = 71172133;BA.debugLine="If  MCode.Action=\"SabtFaktor\" Then";
if ((mostCurrent._mcode._action /*String*/ ).equals("SabtFaktor")) { 
RDebugUtils.currentLine=71172134;
 //BA.debugLineNum = 71172134;BA.debugLine="ListTasvie.Initialize";
mostCurrent._listtasvie.Initialize();
RDebugUtils.currentLine=71172135;
 //BA.debugLineNum = 71172135;BA.debugLine="ListTasvie=LoadAcSpNoeTasvie";
mostCurrent._listtasvie = _loadacspnoetasvie();
RDebugUtils.currentLine=71172136;
 //BA.debugLineNum = 71172136;BA.debugLine="LoadNoeTasvie";
_loadnoetasvie();
RDebugUtils.currentLine=71172137;
 //BA.debugLineNum = 71172137;BA.debugLine="pnlNS.Visible=True";
mostCurrent._pnlns.setVisible(anywheresoftware.b4a.keywords.Common.True);
 }else {
RDebugUtils.currentLine=71172139;
 //BA.debugLineNum = 71172139;BA.debugLine="pnlNS.Visible=False";
mostCurrent._pnlns.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=71172142;
 //BA.debugLineNum = 71172142;BA.debugLine="RefreshLblSabad";
_refreshlblsabad();
 } 
       catch (Exception e25) {
			processBA.setLastException(e25);RDebugUtils.currentLine=71172148;
 //BA.debugLineNum = 71172148;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("571172148",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=71172149;
 //BA.debugLineNum = 71172149;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-Activity_Create");
 };
RDebugUtils.currentLine=71172151;
 //BA.debugLineNum = 71172151;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.List  _loadacspnoetasvie() throws Exception{
RDebugUtils.currentModule="act_sabad";
if (Debug.shouldDelegate(mostCurrent.activityBA, "loadacspnoetasvie", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(mostCurrent.activityBA, "loadacspnoetasvie", null));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
String[] _somearray = null;
int _i = 0;
ir.parsikhesab.pakhsh.mcode._adapterlistnoetasvie _item = null;
RDebugUtils.currentLine=71303168;
 //BA.debugLineNum = 71303168;BA.debugLine="Sub LoadAcSpNoeTasvie As List";
RDebugUtils.currentLine=71303169;
 //BA.debugLineNum = 71303169;BA.debugLine="Try";
try {RDebugUtils.currentLine=71303170;
 //BA.debugLineNum = 71303170;BA.debugLine="Dim ListTasvie As List";
mostCurrent._listtasvie = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=71303171;
 //BA.debugLineNum = 71303171;BA.debugLine="ListTasvie.Initialize";
mostCurrent._listtasvie.Initialize();
RDebugUtils.currentLine=71303172;
 //BA.debugLineNum = 71303172;BA.debugLine="Dim Cu As Cursor =MCode.Result(\"Select * From Tbl";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblTasvie");
RDebugUtils.currentLine=71303173;
 //BA.debugLineNum = 71303173;BA.debugLine="Dim SomeArray(Cu.RowCount+1) As String";
_somearray = new String[(int) (_cu.getRowCount()+1)];
java.util.Arrays.fill(_somearray,"");
RDebugUtils.currentLine=71303174;
 //BA.debugLineNum = 71303174;BA.debugLine="SomeArray(0)=\"انتخاب کنید\"";
_somearray[(int) (0)] = "انتخاب کنید";
RDebugUtils.currentLine=71303175;
 //BA.debugLineNum = 71303175;BA.debugLine="If Cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=71303176;
 //BA.debugLineNum = 71303176;BA.debugLine="For i = 0 To Cu.RowCount-1";
{
final int step8 = 1;
final int limit8 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
RDebugUtils.currentLine=71303177;
 //BA.debugLineNum = 71303177;BA.debugLine="Cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=71303178;
 //BA.debugLineNum = 71303178;BA.debugLine="Dim Item As AdapterListNoeTasvie";
_item = new ir.parsikhesab.pakhsh.mcode._adapterlistnoetasvie();
RDebugUtils.currentLine=71303179;
 //BA.debugLineNum = 71303179;BA.debugLine="Item.FldC_Tasvie=Cu.GetString(\"FldCode\")";
_item.FldC_Tasvie /*String*/  = _cu.GetString("FldCode");
RDebugUtils.currentLine=71303180;
 //BA.debugLineNum = 71303180;BA.debugLine="Item.FldN_Tasvie=Cu.GetString(\"FldName\")";
_item.FldN_Tasvie /*String*/  = _cu.GetString("FldName");
RDebugUtils.currentLine=71303181;
 //BA.debugLineNum = 71303181;BA.debugLine="ListTasvie.Add(Item)";
mostCurrent._listtasvie.Add((Object)(_item));
RDebugUtils.currentLine=71303183;
 //BA.debugLineNum = 71303183;BA.debugLine="SomeArray(i+1)=Cu.GetString(\"FldName\")";
_somearray[(int) (_i+1)] = _cu.GetString("FldName");
 }
};
RDebugUtils.currentLine=71303186;
 //BA.debugLineNum = 71303186;BA.debugLine="MCode.ArrayTasvieForKala=SomeArray";
mostCurrent._mcode._arraytasvieforkala /*String[]*/  = _somearray;
 };
RDebugUtils.currentLine=71303188;
 //BA.debugLineNum = 71303188;BA.debugLine="Return ListTasvie";
if (true) return mostCurrent._listtasvie;
 } 
       catch (Exception e20) {
			processBA.setLastException(e20);RDebugUtils.currentLine=71303191;
 //BA.debugLineNum = 71303191;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("571303191",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=71303192;
 //BA.debugLineNum = 71303192;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-LoadAcSpNoeTasvie");
RDebugUtils.currentLine=71303193;
 //BA.debugLineNum = 71303193;BA.debugLine="Return Null";
if (true) return (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null));
 };
RDebugUtils.currentLine=71303195;
 //BA.debugLineNum = 71303195;BA.debugLine="End Sub";
return null;
}
public static String  _loadnoetasvie() throws Exception{
RDebugUtils.currentModule="act_sabad";
if (Debug.shouldDelegate(mostCurrent.activityBA, "loadnoetasvie", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "loadnoetasvie", null));}
ir.parsikhesab.pakhsh.mcode._adapterlistnoetasvie _itemtasvie = null;
int _count = 0;
int _i = 0;
RDebugUtils.currentLine=71499776;
 //BA.debugLineNum = 71499776;BA.debugLine="Sub LoadNoeTasvie";
RDebugUtils.currentLine=71499777;
 //BA.debugLineNum = 71499777;BA.debugLine="Try";
try {RDebugUtils.currentLine=71499778;
 //BA.debugLineNum = 71499778;BA.debugLine="Dim ItemTasvie As AdapterListNoeTasvie";
_itemtasvie = new ir.parsikhesab.pakhsh.mcode._adapterlistnoetasvie();
RDebugUtils.currentLine=71499779;
 //BA.debugLineNum = 71499779;BA.debugLine="ItemTasvie.Initialize";
_itemtasvie.Initialize();
RDebugUtils.currentLine=71499780;
 //BA.debugLineNum = 71499780;BA.debugLine="CmbBox1.cmbBox.Add(\"انتخاب کنید\")";
mostCurrent._cmbbox1._cmbbox /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add("انتخاب کنید");
RDebugUtils.currentLine=71499781;
 //BA.debugLineNum = 71499781;BA.debugLine="Dim count As Int =ListTasvie.Size";
_count = mostCurrent._listtasvie.getSize();
RDebugUtils.currentLine=71499782;
 //BA.debugLineNum = 71499782;BA.debugLine="If count> 0 Then";
if (_count>0) { 
RDebugUtils.currentLine=71499783;
 //BA.debugLineNum = 71499783;BA.debugLine="For i = 0 To count-1";
{
final int step7 = 1;
final int limit7 = (int) (_count-1);
_i = (int) (0) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
RDebugUtils.currentLine=71499784;
 //BA.debugLineNum = 71499784;BA.debugLine="ItemTasvie=ListTasvie.Get(i)";
_itemtasvie = (ir.parsikhesab.pakhsh.mcode._adapterlistnoetasvie)(mostCurrent._listtasvie.Get(_i));
RDebugUtils.currentLine=71499786;
 //BA.debugLineNum = 71499786;BA.debugLine="CmbBox1.cmbBox.Add(ItemTasvie.FldN_Tasvie)";
mostCurrent._cmbbox1._cmbbox /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add(_itemtasvie.FldN_Tasvie /*String*/ );
 }
};
RDebugUtils.currentLine=71499788;
 //BA.debugLineNum = 71499788;BA.debugLine="CmbBox1.SelectedIndex=MCode.feeTip";
mostCurrent._cmbbox1._setselectedindex /*int*/ (null,(int)(Double.parseDouble(mostCurrent._mcode._feetip /*String*/ )));
 };
 } 
       catch (Exception e14) {
			processBA.setLastException(e14);RDebugUtils.currentLine=71499791;
 //BA.debugLineNum = 71499791;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("571499791",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=71499792;
 //BA.debugLineNum = 71499792;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-LoadNoeTasvie");
 };
RDebugUtils.currentLine=71499794;
 //BA.debugLineNum = 71499794;BA.debugLine="End Sub";
return "";
}
public static String  _refreshlblsabad() throws Exception{
RDebugUtils.currentModule="act_sabad";
if (Debug.shouldDelegate(mostCurrent.activityBA, "refreshlblsabad", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "refreshlblsabad", null));}
RDebugUtils.currentLine=71565312;
 //BA.debugLineNum = 71565312;BA.debugLine="Sub RefreshLblSabad";
RDebugUtils.currentLine=71565325;
 //BA.debugLineNum = 71565325;BA.debugLine="End Sub";
return "";
}
public static boolean  _activity_keypress(int _keycode) throws Exception{
RDebugUtils.currentModule="act_sabad";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_keypress", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "activity_keypress", new Object[] {_keycode}));}
RDebugUtils.currentLine=72155136;
 //BA.debugLineNum = 72155136;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
RDebugUtils.currentLine=72155137;
 //BA.debugLineNum = 72155137;BA.debugLine="Try";
try {RDebugUtils.currentLine=72155138;
 //BA.debugLineNum = 72155138;BA.debugLine="If KeyCode=KeyCodes.KEYCODE_BACK Then";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK) { 
RDebugUtils.currentLine=72155139;
 //BA.debugLineNum = 72155139;BA.debugLine="If MCode.page=\"KalaDefault\" Then";
if ((mostCurrent._mcode._page /*String*/ ).equals("KalaDefault")) { 
RDebugUtils.currentLine=72155140;
 //BA.debugLineNum = 72155140;BA.debugLine="Log(MCode.feeTip)";
anywheresoftware.b4a.keywords.Common.LogImpl("572155140",mostCurrent._mcode._feetip /*String*/ ,0);
RDebugUtils.currentLine=72155141;
 //BA.debugLineNum = 72155141;BA.debugLine="StartActivity(Act_KalaDefault)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._act_kaladefault.getObject()));
 }else 
{RDebugUtils.currentLine=72155142;
 //BA.debugLineNum = 72155142;BA.debugLine="Else if MCode.page=\"Kala_listi\" Then";
if ((mostCurrent._mcode._page /*String*/ ).equals("Kala_listi")) { 
RDebugUtils.currentLine=72155143;
 //BA.debugLineNum = 72155143;BA.debugLine="StartActivity(Act_Kala_listi)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._act_kala_listi.getObject()));
 }else 
{RDebugUtils.currentLine=72155144;
 //BA.debugLineNum = 72155144;BA.debugLine="Else If MCode.page=\"SabtMarjooii\" Then";
if ((mostCurrent._mcode._page /*String*/ ).equals("SabtMarjooii")) { 
RDebugUtils.currentLine=72155145;
 //BA.debugLineNum = 72155145;BA.debugLine="StartActivity(Act_KalaDefault)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._act_kaladefault.getObject()));
 }}}
;
RDebugUtils.currentLine=72155147;
 //BA.debugLineNum = 72155147;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 };
 } 
       catch (Exception e14) {
			processBA.setLastException(e14);RDebugUtils.currentLine=72155150;
 //BA.debugLineNum = 72155150;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("572155150",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=72155151;
 //BA.debugLineNum = 72155151;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-Activity_Resume");
 };
RDebugUtils.currentLine=72155153;
 //BA.debugLineNum = 72155153;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=72155154;
 //BA.debugLineNum = 72155154;BA.debugLine="End Sub";
return false;
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="act_sabad";
RDebugUtils.currentLine=72089600;
 //BA.debugLineNum = 72089600;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=72089602;
 //BA.debugLineNum = 72089602;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="act_sabad";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=72024064;
 //BA.debugLineNum = 72024064;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=72024066;
 //BA.debugLineNum = 72024066;BA.debugLine="Try";
try {RDebugUtils.currentLine=72024067;
 //BA.debugLineNum = 72024067;BA.debugLine="If MCode.IsConnected=False And MCode.ConnectionS";
if (mostCurrent._mcode._isconnected /*boolean*/ (mostCurrent.activityBA)==anywheresoftware.b4a.keywords.Common.False && (mostCurrent._mcode._connectionstatus /*String*/ ).equals(BA.NumberToString(1))) { 
RDebugUtils.currentLine=72024068;
 //BA.debugLineNum = 72024068;BA.debugLine="ToastMessageShow(\"لطفا ارتباط اینترنت گوشی خود";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("لطفا ارتباط اینترنت گوشی خود را بررسی نمایید"),anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=72024077;
 //BA.debugLineNum = 72024077;BA.debugLine="LoadListSabad";
_loadlistsabad();
RDebugUtils.currentLine=72024078;
 //BA.debugLineNum = 72024078;BA.debugLine="UpdateSumSabad";
_updatesumsabad();
RDebugUtils.currentLine=72024079;
 //BA.debugLineNum = 72024079;BA.debugLine="CreatePage";
_createpage();
RDebugUtils.currentLine=72024080;
 //BA.debugLineNum = 72024080;BA.debugLine="MojavezSefaresh";
_mojavezsefaresh();
 } 
       catch (Exception e10) {
			processBA.setLastException(e10);RDebugUtils.currentLine=72024082;
 //BA.debugLineNum = 72024082;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("572024082",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=72024083;
 //BA.debugLineNum = 72024083;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-Activity_Resume");
 };
RDebugUtils.currentLine=72024086;
 //BA.debugLineNum = 72024086;BA.debugLine="End Sub";
return "";
}
public static String  _loadlistsabad() throws Exception{
RDebugUtils.currentModule="act_sabad";
if (Debug.shouldDelegate(mostCurrent.activityBA, "loadlistsabad", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "loadlistsabad", null));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu1 = null;
int _i = 0;
ir.parsikhesab.pakhsh.mcode._adapterlistkala _itemkala = null;
String _summande = "";
int _fldfeeforoosh = 0;
int _fldtedaddarkarton = 0;
RDebugUtils.currentLine=71434240;
 //BA.debugLineNum = 71434240;BA.debugLine="Sub LoadListSabad";
RDebugUtils.currentLine=71434241;
 //BA.debugLineNum = 71434241;BA.debugLine="Try";
try {RDebugUtils.currentLine=71434242;
 //BA.debugLineNum = 71434242;BA.debugLine="ProgressDialogShow(\"\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=71434243;
 //BA.debugLineNum = 71434243;BA.debugLine="OriginalItemList.Clear";
mostCurrent._originalitemlist.Clear();
RDebugUtils.currentLine=71434244;
 //BA.debugLineNum = 71434244;BA.debugLine="Dim Cu1 As Cursor = MCode.Result(\"Select * From T";
_cu1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu1 = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblSabad");
RDebugUtils.currentLine=71434245;
 //BA.debugLineNum = 71434245;BA.debugLine="SumTakhfifRiali=0";
_sumtakhfifriali = (long) (0);
RDebugUtils.currentLine=71434246;
 //BA.debugLineNum = 71434246;BA.debugLine="LogColor(Cu1.RowCount,Colors.Red)";
anywheresoftware.b4a.keywords.Common.LogImpl("571434246",BA.NumberToString(_cu1.getRowCount()),anywheresoftware.b4a.keywords.Common.Colors.Red);
RDebugUtils.currentLine=71434247;
 //BA.debugLineNum = 71434247;BA.debugLine="For i=0 To Cu1.RowCount-1";
{
final int step7 = 1;
final int limit7 = (int) (_cu1.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
RDebugUtils.currentLine=71434248;
 //BA.debugLineNum = 71434248;BA.debugLine="Cu1.Position=i";
_cu1.setPosition(_i);
RDebugUtils.currentLine=71434249;
 //BA.debugLineNum = 71434249;BA.debugLine="Dim ItemKala As AdapterListKala";
_itemkala = new ir.parsikhesab.pakhsh.mcode._adapterlistkala();
RDebugUtils.currentLine=71434250;
 //BA.debugLineNum = 71434250;BA.debugLine="ItemKala.CodeKala=Cu1.Getstring(\"FldCodeKala\")";
_itemkala.CodeKala /*String*/  = _cu1.GetString("FldCodeKala");
RDebugUtils.currentLine=71434251;
 //BA.debugLineNum = 71434251;BA.debugLine="ItemKala.NameKala=Cu1.Getstring(\"FldNameKala\")";
_itemkala.NameKala /*String*/  = _cu1.GetString("FldNameKala");
RDebugUtils.currentLine=71434252;
 //BA.debugLineNum = 71434252;BA.debugLine="ItemKala.FeeForoosh=Cu1.Getstring(\"FldFeeForoosh";
_itemkala.FeeForoosh /*int*/  = (int)(Double.parseDouble(_cu1.GetString("FldFeeForoosh")));
RDebugUtils.currentLine=71434253;
 //BA.debugLineNum = 71434253;BA.debugLine="ItemKala.fldFeeBadAzTakhfif=Cu1.Getstring(\"fldFe";
_itemkala.fldFeeBadAzTakhfif /*String*/  = _cu1.GetString("fldFeeBadAzTakhfif");
RDebugUtils.currentLine=71434254;
 //BA.debugLineNum = 71434254;BA.debugLine="ItemKala.NameVahed=Cu1.Getstring(\"FldNamevahed\")";
_itemkala.NameVahed /*String*/  = _cu1.GetString("FldNamevahed");
RDebugUtils.currentLine=71434255;
 //BA.debugLineNum = 71434255;BA.debugLine="ItemKala.NameVahed2=Cu1.Getstring(\"FldNameVahed2";
_itemkala.NameVahed2 /*String*/  = _cu1.GetString("FldNameVahed2");
RDebugUtils.currentLine=71434256;
 //BA.debugLineNum = 71434256;BA.debugLine="ItemKala.fldPathPic=Cu1.Getstring(\"fldPathPic\")";
_itemkala.fldPathPic /*String*/  = _cu1.GetString("fldPathPic");
RDebugUtils.currentLine=71434257;
 //BA.debugLineNum = 71434257;BA.debugLine="ItemKala.TedadDarSabadJoz=myCode.Is_Null_adad(Cu";
_itemkala.TedadDarSabadJoz /*String*/  = mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_cu1.GetString("FldTedadDarSabadJoz"));
RDebugUtils.currentLine=71434258;
 //BA.debugLineNum = 71434258;BA.debugLine="ItemKala.TedadDarSabadKol=myCode.Is_Null_adad(Cu";
_itemkala.TedadDarSabadKol /*String*/  = mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_cu1.GetString("FldTedadDarSabadKol"));
RDebugUtils.currentLine=71434259;
 //BA.debugLineNum = 71434259;BA.debugLine="ItemKala.Tozihat=myCode.Is_Null(Cu1.Getstring(\"F";
_itemkala.Tozihat /*String*/  = mostCurrent._mycode._is_null /*String*/ (mostCurrent.activityBA,_cu1.GetString("FldTozihat"));
RDebugUtils.currentLine=71434260;
 //BA.debugLineNum = 71434260;BA.debugLine="ItemKala.FldMablaghMasrafKonande=myCode.Is_Null(";
_itemkala.FldMablaghMasrafKonande /*String*/  = mostCurrent._mycode._is_null /*String*/ (mostCurrent.activityBA,_cu1.GetString("FldMablaghMasrafKonande"));
RDebugUtils.currentLine=71434261;
 //BA.debugLineNum = 71434261;BA.debugLine="ItemKala.MablaghTakhfif=myCode.Is_Null_adad(Cu1.";
_itemkala.MablaghTakhfif /*int*/  = (int)(Double.parseDouble(mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_cu1.GetString("FldMablaghTakhfif"))));
RDebugUtils.currentLine=71434262;
 //BA.debugLineNum = 71434262;BA.debugLine="ItemKala.fldDarsadTakhfif=myCode.Is_Null_adad(Cu";
_itemkala.fldDarsadTakhfif /*String*/  = mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_cu1.GetString("FldDarsadTakhfif"));
RDebugUtils.currentLine=71434263;
 //BA.debugLineNum = 71434263;BA.debugLine="ItemKala.fldArzeshAfzodeKala=myCode.Is_Null_adad";
_itemkala.fldArzeshAfzodeKala /*String*/  = mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_cu1.GetString("fldArzeshAfzode"));
RDebugUtils.currentLine=71434264;
 //BA.debugLineNum = 71434264;BA.debugLine="ItemKala.fldDarsadArzeshAfzodeKala=myCode.Is_Nul";
_itemkala.fldDarsadArzeshAfzodeKala /*String*/  = mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_cu1.GetString("fldDarsadArzeshAfzode"));
RDebugUtils.currentLine=71434265;
 //BA.debugLineNum = 71434265;BA.debugLine="ItemKala.TedadDarKarton=myCode.Is_Null_adad(Cu1.";
_itemkala.TedadDarKarton /*String*/  = mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_cu1.GetString("FldTedadDarKarton"));
RDebugUtils.currentLine=71434266;
 //BA.debugLineNum = 71434266;BA.debugLine="If MCode.Action<>\"SabtMarjooii\" And MCode.Actio";
if ((mostCurrent._mcode._action /*String*/ ).equals("SabtMarjooii") == false && (mostCurrent._mcode._action /*String*/ ).equals("UpdateMarjooii") == false) { 
RDebugUtils.currentLine=71434268;
 //BA.debugLineNum = 71434268;BA.debugLine="Dim SumMande As String=MCode.SingleResult(\"sel";
_summande = BA.ObjectToString(mostCurrent._mcode._singleresult /*Object*/ (mostCurrent.activityBA,"select SumMande from TblKala where FldCodeKala="+_itemkala.CodeKala /*String*/ ));
RDebugUtils.currentLine=71434269;
 //BA.debugLineNum = 71434269;BA.debugLine="ItemKala.SumMande=SumMande-ItemKala.TedadDarSa";
_itemkala.SumMande /*String*/  = BA.NumberToString((double)(Double.parseDouble(_summande))-(double)(Double.parseDouble(_itemkala.TedadDarSabadJoz /*String*/ )));
RDebugUtils.currentLine=71434270;
 //BA.debugLineNum = 71434270;BA.debugLine="If ItemKala.NameVahed2 <> \"\" Then";
if ((_itemkala.NameVahed2 /*String*/ ).equals("") == false) { 
RDebugUtils.currentLine=71434271;
 //BA.debugLineNum = 71434271;BA.debugLine="Dim FldFeeForoosh As Int = MCode.Sf.Val(Cu1.G";
_fldfeeforoosh = (int) (mostCurrent._mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvvvv1(BA.NumberToString(_cu1.GetInt("fldFeeForoosh"))));
RDebugUtils.currentLine=71434272;
 //BA.debugLineNum = 71434272;BA.debugLine="Dim FldTedadDarKarton As Int = MCode.Sf.Val(C";
_fldtedaddarkarton = (int) (mostCurrent._mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvvvv1(_cu1.GetString("FldTedadDarSabadKol")));
RDebugUtils.currentLine=71434274;
 //BA.debugLineNum = 71434274;BA.debugLine="ItemKala.FeeForooshKarton=FldFeeForoosh * Fld";
_itemkala.FeeForooshKarton /*String*/  = BA.NumberToString(_fldfeeforoosh*_fldtedaddarkarton);
RDebugUtils.currentLine=71434275;
 //BA.debugLineNum = 71434275;BA.debugLine="ItemKala.SumMandeKarton=Round2( SumMande / Fl";
_itemkala.SumMandeKarton /*String*/  = BA.NumberToString(anywheresoftware.b4a.keywords.Common.Round2((double)(Double.parseDouble(_summande))/(double)_fldtedaddarkarton,(int) (0))-(double)(Double.parseDouble(mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_itemkala.TedadDarSabadKol /*String*/ ))));
 };
RDebugUtils.currentLine=71434286;
 //BA.debugLineNum = 71434286;BA.debugLine="Log(ItemKala.SumMande)";
anywheresoftware.b4a.keywords.Common.LogImpl("571434286",_itemkala.SumMande /*String*/ ,0);
 }else {
RDebugUtils.currentLine=71434296;
 //BA.debugLineNum = 71434296;BA.debugLine="Dim SumMande As String=MCode.SingleResult(\"sel";
_summande = BA.ObjectToString(mostCurrent._mcode._singleresult /*Object*/ (mostCurrent.activityBA,"select SumMande from TblKala where FldCodeKala="+_itemkala.CodeKala /*String*/ ));
RDebugUtils.currentLine=71434297;
 //BA.debugLineNum = 71434297;BA.debugLine="ItemKala.SumMande=SumMande";
_itemkala.SumMande /*String*/  = _summande;
RDebugUtils.currentLine=71434298;
 //BA.debugLineNum = 71434298;BA.debugLine="ItemKala.SumMandeKarton=Round2( SumMande / myC";
_itemkala.SumMandeKarton /*String*/  = BA.NumberToString(anywheresoftware.b4a.keywords.Common.Round2((double)(Double.parseDouble(_summande))/(double)(double)(Double.parseDouble(mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_cu1.GetString("FldTedadDarKarton")))),(int) (0))-(double)(Double.parseDouble(_itemkala.TedadDarSabadKol /*String*/ )));
 };
RDebugUtils.currentLine=71434301;
 //BA.debugLineNum = 71434301;BA.debugLine="ItemKala.FldEshantion=myCode.Is_Null_adad(Cu1.Ge";
_itemkala.FldEshantion /*String*/  = mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_cu1.GetString("FldEshantion"));
RDebugUtils.currentLine=71434302;
 //BA.debugLineNum = 71434302;BA.debugLine="ItemKala.fldShomareForoosh=myCode.Is_Null_adad(C";
_itemkala.fldShomareForoosh /*String*/  = mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_cu1.GetString("fldShomareForoosh"));
RDebugUtils.currentLine=71434303;
 //BA.debugLineNum = 71434303;BA.debugLine="ItemKala.FldAmani=myCode.Is_Null_adad(Cu1.Getstr";
_itemkala.FldAmani /*String*/  = mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_cu1.GetString("FldAmani"));
RDebugUtils.currentLine=71434304;
 //BA.debugLineNum = 71434304;BA.debugLine="If MCode.IsAmani=1 Then";
if ((mostCurrent._mcode._isamani /*String*/ ).equals(BA.NumberToString(1))) { 
RDebugUtils.currentLine=71434305;
 //BA.debugLineNum = 71434305;BA.debugLine="chAmani.Checked=True";
mostCurrent._chamani.setChecked(anywheresoftware.b4a.keywords.Common.True);
 }else {
RDebugUtils.currentLine=71434307;
 //BA.debugLineNum = 71434307;BA.debugLine="chAmani.Checked=False";
mostCurrent._chamani.setChecked(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=71434309;
 //BA.debugLineNum = 71434309;BA.debugLine="OriginalItemList.Add(ItemKala)";
mostCurrent._originalitemlist.Add((Object)(_itemkala));
 }
};
RDebugUtils.currentLine=71434311;
 //BA.debugLineNum = 71434311;BA.debugLine="ListSabad=OriginalItemList";
mostCurrent._listsabad = mostCurrent._originalitemlist;
RDebugUtils.currentLine=71434312;
 //BA.debugLineNum = 71434312;BA.debugLine="HLV.notifyDataSetChanged";
mostCurrent._hlv.notifyDataSetChanged();
RDebugUtils.currentLine=71434315;
 //BA.debugLineNum = 71434315;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=71434316;
 //BA.debugLineNum = 71434316;BA.debugLine="If ListSabad.Size=0 Then";
if (mostCurrent._listsabad.getSize()==0) { 
RDebugUtils.currentLine=71434318;
 //BA.debugLineNum = 71434318;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=71434319;
 //BA.debugLineNum = 71434319;BA.debugLine="CallSubDelayed(Act_KalaDefault,\"btn_Back_Click\"";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,(Object)(mostCurrent._act_kaladefault.getObject()),"btn_Back_Click");
 };
 } 
       catch (Exception e59) {
			processBA.setLastException(e59);RDebugUtils.currentLine=71434322;
 //BA.debugLineNum = 71434322;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("571434322",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=71434323;
 //BA.debugLineNum = 71434323;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-LoadListSabad");
 };
RDebugUtils.currentLine=71434325;
 //BA.debugLineNum = 71434325;BA.debugLine="End Sub";
return "";
}
public static String  _updatesumsabad() throws Exception{
RDebugUtils.currentModule="act_sabad";
if (Debug.shouldDelegate(mostCurrent.activityBA, "updatesumsabad", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "updatesumsabad", null));}
RDebugUtils.currentLine=71892992;
 //BA.debugLineNum = 71892992;BA.debugLine="Sub UpdateSumSabad";
RDebugUtils.currentLine=71892993;
 //BA.debugLineNum = 71892993;BA.debugLine="Try";
try {RDebugUtils.currentLine=71892994;
 //BA.debugLineNum = 71892994;BA.debugLine="Log(\"---->\"&(CmbBox1.SelectedIndex+1))";
anywheresoftware.b4a.keywords.Common.LogImpl("571892994","---->"+BA.NumberToString((mostCurrent._cmbbox1._getselectedindex /*int*/ (null)+1)),0);
RDebugUtils.currentLine=71892996;
 //BA.debugLineNum = 71892996;BA.debugLine="MCode.CreateReportSabad";
mostCurrent._mcode._createreportsabad /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=71892997;
 //BA.debugLineNum = 71892997;BA.debugLine="num=num+1";
_num = (int) (_num+1);
RDebugUtils.currentLine=71892998;
 //BA.debugLineNum = 71892998;BA.debugLine="Log(num)";
anywheresoftware.b4a.keywords.Common.LogImpl("571892998",BA.NumberToString(_num),0);
RDebugUtils.currentLine=71892999;
 //BA.debugLineNum = 71892999;BA.debugLine="If MCode.FinalFaktor.KhamFaktor > 0 Then";
if ((double)(Double.parseDouble(mostCurrent._mcode._finalfaktor /*ir.parsikhesab.pakhsh.mcode._finalfaktor_*/ .KhamFaktor /*String*/ ))>0) { 
RDebugUtils.currentLine=71893000;
 //BA.debugLineNum = 71893000;BA.debugLine="If MCode.FaktorSelect=\"\" Then";
if ((mostCurrent._mcode._faktorselect /*String*/ ).equals("")) { 
RDebugUtils.currentLine=71893001;
 //BA.debugLineNum = 71893001;BA.debugLine="If MCode.Action=\"SabtMarjooii\" Then";
if ((mostCurrent._mcode._action /*String*/ ).equals("SabtMarjooii")) { 
RDebugUtils.currentLine=71893002;
 //BA.debugLineNum = 71893002;BA.debugLine="BtnSabtSefaresh.Text = \"ثبت فاکتور مرجوعی\"";
mostCurrent._btnsabtsefaresh.setText(BA.ObjectToCharSequence("ثبت فاکتور مرجوعی"));
 }else 
{RDebugUtils.currentLine=71893003;
 //BA.debugLineNum = 71893003;BA.debugLine="Else If MCode.Action=\"SabtFaktor\" Then";
if ((mostCurrent._mcode._action /*String*/ ).equals("SabtFaktor")) { 
RDebugUtils.currentLine=71893004;
 //BA.debugLineNum = 71893004;BA.debugLine="BtnSabtSefaresh.Text = NumberFormat2(MCode.Fin";
mostCurrent._btnsabtsefaresh.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.NumberFormat2((double)(Double.parseDouble(mostCurrent._mcode._finalfaktor /*ir.parsikhesab.pakhsh.mcode._finalfaktor_*/ .GablePardakht /*String*/ )),(int) (0),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.True)+" "+mostCurrent._mcode._vahedpool /*String*/ +"    "+"ثبت سفارش"));
 }}
;
 }else {
RDebugUtils.currentLine=71893008;
 //BA.debugLineNum = 71893008;BA.debugLine="BtnSabtSefaresh.Text = NumberFormat2(MCode.Fina";
mostCurrent._btnsabtsefaresh.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.NumberFormat2((double)(Double.parseDouble(mostCurrent._mcode._finalfaktor /*ir.parsikhesab.pakhsh.mcode._finalfaktor_*/ .GablePardakht /*String*/ )),(int) (0),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.True)+" "+mostCurrent._mcode._vahedpool /*String*/ +"    "+"اصلاح سفارش"));
 };
RDebugUtils.currentLine=71893011;
 //BA.debugLineNum = 71893011;BA.debugLine="If MCode.ManedEtebarEnable And MCode.FinalFakto";
if (mostCurrent._mcode._manedetebarenable /*boolean*/  && (double)(Double.parseDouble(mostCurrent._mcode._finalfaktor /*ir.parsikhesab.pakhsh.mcode._finalfaktor_*/ .GablePardakht /*String*/ ))>(double)(Double.parseDouble(mostCurrent._mcode._mandeetebar /*String*/ ))) { 
RDebugUtils.currentLine=71893012;
 //BA.debugLineNum = 71893012;BA.debugLine="ToastMessageShow(\"جمع مبلغ سفارش از اعتبار مش";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("جمع مبلغ سفارش از اعتبار مشتری بیشتر میباشد."),anywheresoftware.b4a.keywords.Common.True);
 };
 }else {
 };
 } 
       catch (Exception e22) {
			processBA.setLastException(e22);RDebugUtils.currentLine=71893021;
 //BA.debugLineNum = 71893021;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("571893021",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=71893022;
 //BA.debugLineNum = 71893022;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-UpdateSumSabad");
 };
RDebugUtils.currentLine=71893024;
 //BA.debugLineNum = 71893024;BA.debugLine="End Sub";
return "";
}
public static String  _createpage() throws Exception{
RDebugUtils.currentModule="act_sabad";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createpage", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "createpage", null));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
int _i = 0;
ir.parsikhesab.pakhsh.mcode._adapterlistnoetasvie _item = null;
RDebugUtils.currentLine=71368704;
 //BA.debugLineNum = 71368704;BA.debugLine="Sub CreatePage";
RDebugUtils.currentLine=71368705;
 //BA.debugLineNum = 71368705;BA.debugLine="Try";
try {RDebugUtils.currentLine=71368706;
 //BA.debugLineNum = 71368706;BA.debugLine="If ListTasvie.IsInitialized=False Then";
if (mostCurrent._listtasvie.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=71368707;
 //BA.debugLineNum = 71368707;BA.debugLine="ListTasvie.Initialize";
mostCurrent._listtasvie.Initialize();
RDebugUtils.currentLine=71368708;
 //BA.debugLineNum = 71368708;BA.debugLine="ListTasvie=LoadAcSpNoeTasvie";
mostCurrent._listtasvie = _loadacspnoetasvie();
RDebugUtils.currentLine=71368709;
 //BA.debugLineNum = 71368709;BA.debugLine="LoadNoeTasvie";
_loadnoetasvie();
 };
RDebugUtils.currentLine=71368711;
 //BA.debugLineNum = 71368711;BA.debugLine="LblCodeMoshtari.Text=MCode.C_Tafzili";
mostCurrent._lblcodemoshtari.setText(BA.ObjectToCharSequence(mostCurrent._mcode._c_tafzili /*String*/ ));
RDebugUtils.currentLine=71368712;
 //BA.debugLineNum = 71368712;BA.debugLine="LblNameMoshtari.Text=MCode.N_Tafzili";
mostCurrent._lblnamemoshtari.setText(BA.ObjectToCharSequence(mostCurrent._mcode._n_tafzili /*String*/ ));
RDebugUtils.currentLine=71368714;
 //BA.debugLineNum = 71368714;BA.debugLine="If MCode.FaktorSelect<>\"\" Then";
if ((mostCurrent._mcode._faktorselect /*String*/ ).equals("") == false) { 
RDebugUtils.currentLine=71368715;
 //BA.debugLineNum = 71368715;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From T";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblSabad");
RDebugUtils.currentLine=71368716;
 //BA.debugLineNum = 71368716;BA.debugLine="If Cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=71368717;
 //BA.debugLineNum = 71368717;BA.debugLine="Cu.Position=0";
_cu.setPosition((int) (0));
RDebugUtils.currentLine=71368720;
 //BA.debugLineNum = 71368720;BA.debugLine="For i=0 To ListTasvie.Size-1";
{
final int step13 = 1;
final int limit13 = (int) (mostCurrent._listtasvie.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit13 ;_i = _i + step13 ) {
RDebugUtils.currentLine=71368721;
 //BA.debugLineNum = 71368721;BA.debugLine="Dim Item = ListTasvie.Get(i) As AdapterListNoe";
_item = (ir.parsikhesab.pakhsh.mcode._adapterlistnoetasvie)(mostCurrent._listtasvie.Get(_i));
RDebugUtils.currentLine=71368722;
 //BA.debugLineNum = 71368722;BA.debugLine="If Item.FldC_Tasvie=Cu.GetString(\"FldVaziatPar";
if ((_item.FldC_Tasvie /*String*/ ).equals(_cu.GetString("FldVaziatPardakht"))) { 
RDebugUtils.currentLine=71368723;
 //BA.debugLineNum = 71368723;BA.debugLine="CmbBox1.SelectedIndex=i+1";
mostCurrent._cmbbox1._setselectedindex /*int*/ (null,(int) (_i+1));
 };
 }
};
RDebugUtils.currentLine=71368726;
 //BA.debugLineNum = 71368726;BA.debugLine="If Cu.GetString(\"fldSharh\") = \"\"  Or Cu.GetStr";
if ((_cu.GetString("fldSharh")).equals("") || (_cu.GetString("fldSharh")).equals("("+mostCurrent._cmbbox1._cmbbox /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedItem()+")")) { 
RDebugUtils.currentLine=71368727;
 //BA.debugLineNum = 71368727;BA.debugLine="TxtSharhFaktor.Text = \"\"";
mostCurrent._txtsharhfaktor.setText(BA.ObjectToCharSequence(""));
 }else {
RDebugUtils.currentLine=71368729;
 //BA.debugLineNum = 71368729;BA.debugLine="TxtSharhFaktor.Text = Cu.GetString(\"fldSharh\"";
mostCurrent._txtsharhfaktor.setText(BA.ObjectToCharSequence(_cu.GetString("fldSharh").replace("("+mostCurrent._cmbbox1._cmbbox /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedItem()+")","")));
 };
 };
 }else {
 };
RDebugUtils.currentLine=71368735;
 //BA.debugLineNum = 71368735;BA.debugLine="If MCode.Amani=1 Then";
if ((mostCurrent._mcode._amani /*String*/ ).equals(BA.NumberToString(1))) { 
RDebugUtils.currentLine=71368736;
 //BA.debugLineNum = 71368736;BA.debugLine="chAmani.Visible=True";
mostCurrent._chamani.setVisible(anywheresoftware.b4a.keywords.Common.True);
 }else {
RDebugUtils.currentLine=71368738;
 //BA.debugLineNum = 71368738;BA.debugLine="chAmani.Visible=False";
mostCurrent._chamani.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=71368740;
 //BA.debugLineNum = 71368740;BA.debugLine="If MCode.Action=\"SabtMarjooii\" Then";
if ((mostCurrent._mcode._action /*String*/ ).equals("SabtMarjooii")) { 
RDebugUtils.currentLine=71368742;
 //BA.debugLineNum = 71368742;BA.debugLine="CmbBox1.cmbBox.Visible=False";
mostCurrent._cmbbox1._cmbbox /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=71368744;
 //BA.debugLineNum = 71368744;BA.debugLine="lblMablaghTakhfifiKol.Visible=False";
mostCurrent._lblmablaghtakhfifikol.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=71368745;
 //BA.debugLineNum = 71368745;BA.debugLine="txtMablaghTakhfifiKol.Visible=False";
mostCurrent._txtmablaghtakhfifikol.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=71368746;
 //BA.debugLineNum = 71368746;BA.debugLine="TxtSharhFaktor.Hint=\"علت مرجوعی کالا\"";
mostCurrent._txtsharhfaktor.setHint("علت مرجوعی کالا");
 }else {
 };
 } 
       catch (Exception e40) {
			processBA.setLastException(e40);RDebugUtils.currentLine=71368751;
 //BA.debugLineNum = 71368751;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("571368751",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=71368752;
 //BA.debugLineNum = 71368752;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-CreatePage");
 };
RDebugUtils.currentLine=71368754;
 //BA.debugLineNum = 71368754;BA.debugLine="End Sub";
return "";
}
public static String  _mojavezsefaresh() throws Exception{
RDebugUtils.currentModule="act_sabad";
if (Debug.shouldDelegate(mostCurrent.activityBA, "mojavezsefaresh", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "mojavezsefaresh", null));}
RDebugUtils.currentLine=71237632;
 //BA.debugLineNum = 71237632;BA.debugLine="Private Sub MojavezSefaresh";
RDebugUtils.currentLine=71237633;
 //BA.debugLineNum = 71237633;BA.debugLine="Select MCode.MojavezSefaresh";
switch (BA.switchObjectToInt(mostCurrent._mcode._mojavezsefaresh /*String*/ ,BA.NumberToString(0),BA.NumberToString(1),BA.NumberToString(2))) {
case 0: {
RDebugUtils.currentLine=71237635;
 //BA.debugLineNum = 71237635;BA.debugLine="lblMojavezSefareshText.Text=\"\"";
mostCurrent._lblmojavezsefareshtext.setText(BA.ObjectToCharSequence(""));
 break; }
case 1: {
RDebugUtils.currentLine=71237637;
 //BA.debugLineNum = 71237637;BA.debugLine="lblMojavezSefareshText.Text=\"توجه : شما مجوز فر";
mostCurrent._lblmojavezsefareshtext.setText(BA.ObjectToCharSequence("توجه : شما مجوز فروش کل را ندارید"));
 break; }
case 2: {
RDebugUtils.currentLine=71237639;
 //BA.debugLineNum = 71237639;BA.debugLine="lblMojavezSefareshText.Text=\"توجه : شما مجوز فر";
mostCurrent._lblmojavezsefareshtext.setText(BA.ObjectToCharSequence("توجه : شما مجوز فروش جزء را ندارید"));
 break; }
}
;
RDebugUtils.currentLine=71237641;
 //BA.debugLineNum = 71237641;BA.debugLine="End Sub";
return "";
}
public static String  _addtosabad(ir.parsikhesab.pakhsh.mcode._adapterlistkala _item) throws Exception{
RDebugUtils.currentModule="act_sabad";
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
RDebugUtils.currentLine=73334784;
 //BA.debugLineNum = 73334784;BA.debugLine="Sub AddToSabad(Item As AdapterListKala)";
RDebugUtils.currentLine=73334785;
 //BA.debugLineNum = 73334785;BA.debugLine="Try";
try {RDebugUtils.currentLine=73334786;
 //BA.debugLineNum = 73334786;BA.debugLine="If myCode.Is_Null_adad(Item.fldDarsadTakhfif)>0";
if ((double)(Double.parseDouble(mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_item.fldDarsadTakhfif /*String*/ )))>0) { 
RDebugUtils.currentLine=73334787;
 //BA.debugLineNum = 73334787;BA.debugLine="Dim tedadKol As String=myCode.Is_Null_adad(Item";
_tedadkol = BA.NumberToString((double)(Double.parseDouble(mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_item.TedadDarSabadJoz /*String*/ )))+((double)(Double.parseDouble(mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_item.TedadDarSabadKol /*String*/ )))*(double)(Double.parseDouble(mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_item.TedadDarKarton /*String*/ )))));
RDebugUtils.currentLine=73334788;
 //BA.debugLineNum = 73334788;BA.debugLine="Dim FeeKol As String=(Item.FeeForoosh*tedadKol)";
_feekol = BA.NumberToString((_item.FeeForoosh /*int*/ *(double)(Double.parseDouble(_tedadkol))));
RDebugUtils.currentLine=73334789;
 //BA.debugLineNum = 73334789;BA.debugLine="If tedadKol>0 Then";
if ((double)(Double.parseDouble(_tedadkol))>0) { 
RDebugUtils.currentLine=73334790;
 //BA.debugLineNum = 73334790;BA.debugLine="Item.MablaghTakhfif=(((Item.FeeForoosh*tedadKo";
_item.MablaghTakhfif /*int*/  = (int) ((((_item.FeeForoosh /*int*/ *(double)(Double.parseDouble(_tedadkol)))*(double)(Double.parseDouble(_item.fldDarsadTakhfif /*String*/ )))/(double)100));
RDebugUtils.currentLine=73334791;
 //BA.debugLineNum = 73334791;BA.debugLine="Item.fldFeeBadAzTakhfif=FeeKol-Item.MablaghTak";
_item.fldFeeBadAzTakhfif /*String*/  = BA.NumberToString((double)(Double.parseDouble(_feekol))-_item.MablaghTakhfif /*int*/ );
 }else {
RDebugUtils.currentLine=73334793;
 //BA.debugLineNum = 73334793;BA.debugLine="If myCode.Is_Null_adad(Item.fldDarsadTakhfif)>";
if ((double)(Double.parseDouble(mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_item.fldDarsadTakhfif /*String*/ )))>0) { 
RDebugUtils.currentLine=73334794;
 //BA.debugLineNum = 73334794;BA.debugLine="Item.MablaghTakhfif=(((Item.FeeForoosh)*Item.";
_item.MablaghTakhfif /*int*/  = (int) ((((_item.FeeForoosh /*int*/ )*(double)(Double.parseDouble(_item.fldDarsadTakhfif /*String*/ )))/(double)100));
RDebugUtils.currentLine=73334795;
 //BA.debugLineNum = 73334795;BA.debugLine="Item.fldFeeBadAzTakhfif=Item.FeeForoosh-Item.";
_item.fldFeeBadAzTakhfif /*String*/  = BA.NumberToString(_item.FeeForoosh /*int*/ -_item.MablaghTakhfif /*int*/ );
 };
 };
 };
RDebugUtils.currentLine=73334801;
 //BA.debugLineNum = 73334801;BA.debugLine="Dim rec As CLs_RecDefultKala";
_rec = new ir.parsikhesab.pakhsh.cls_recdefultkala();
RDebugUtils.currentLine=73334802;
 //BA.debugLineNum = 73334802;BA.debugLine="rec.Initialize(Me)";
_rec._initialize /*String*/ (null,mostCurrent.activityBA,act_sabad.getObject());
RDebugUtils.currentLine=73334803;
 //BA.debugLineNum = 73334803;BA.debugLine="rec.Show(Item,0)";
_rec._show /*void*/ (null,_item,(int) (0));
RDebugUtils.currentLine=73334804;
 //BA.debugLineNum = 73334804;BA.debugLine="FeeKol=rec.CheckArzeshAfzode";
_feekol = _rec._checkarzeshafzode /*String*/ (null);
RDebugUtils.currentLine=73334806;
 //BA.debugLineNum = 73334806;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From T";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblSabad");
RDebugUtils.currentLine=73334807;
 //BA.debugLineNum = 73334807;BA.debugLine="Dim Check As Boolean";
_check = false;
RDebugUtils.currentLine=73334808;
 //BA.debugLineNum = 73334808;BA.debugLine="For i=0 To Cu.RowCount -1";
{
final int step21 = 1;
final int limit21 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit21 ;_i = _i + step21 ) {
RDebugUtils.currentLine=73334809;
 //BA.debugLineNum = 73334809;BA.debugLine="Cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=73334810;
 //BA.debugLineNum = 73334810;BA.debugLine="If Cu.GetString(\"FldCodeKala\") = Item.CodeKala";
if ((_cu.GetString("FldCodeKala")).equals(_item.CodeKala /*String*/ )) { 
RDebugUtils.currentLine=73334811;
 //BA.debugLineNum = 73334811;BA.debugLine="If Item.TedadDarSabadJoz = 0 And Item.TedadDar";
if ((_item.TedadDarSabadJoz /*String*/ ).equals(BA.NumberToString(0)) && (_item.TedadDarSabadKol /*String*/ ).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=73334812;
 //BA.debugLineNum = 73334812;BA.debugLine="MCode.SaveUpdate(\"Delete From TblSabad Where";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Delete From TblSabad Where FldCodeKala = '"+_item.CodeKala /*String*/ +"'");
RDebugUtils.currentLine=73334813;
 //BA.debugLineNum = 73334813;BA.debugLine="Dim ishas As Boolean=False";
_ishas = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=73334814;
 //BA.debugLineNum = 73334814;BA.debugLine="Dim c As Int=0";
_c = (int) (0);
RDebugUtils.currentLine=73334815;
 //BA.debugLineNum = 73334815;BA.debugLine="For i=0 To MCode.lstChangeFeeKala.Size-1";
{
final int step28 = 1;
final int limit28 = (int) (mostCurrent._mcode._lstchangefeekala /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit28 ;_i = _i + step28 ) {
RDebugUtils.currentLine=73334816;
 //BA.debugLineNum = 73334816;BA.debugLine="Dim Item2 = MCode.lstChangeFeeKala.Get(i) As";
_item2 = (ir.parsikhesab.pakhsh.mcode._adapterchangefeekala)(mostCurrent._mcode._lstchangefeekala /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=73334817;
 //BA.debugLineNum = 73334817;BA.debugLine="If Item2.FldCodKala=Item.CodeKala Then";
if ((_item2.FldCodKala /*String*/ ).equals(_item.CodeKala /*String*/ )) { 
RDebugUtils.currentLine=73334818;
 //BA.debugLineNum = 73334818;BA.debugLine="ishas=True";
_ishas = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=73334819;
 //BA.debugLineNum = 73334819;BA.debugLine="c=i";
_c = _i;
RDebugUtils.currentLine=73334820;
 //BA.debugLineNum = 73334820;BA.debugLine="Exit";
if (true) break;
 }else {
RDebugUtils.currentLine=73334822;
 //BA.debugLineNum = 73334822;BA.debugLine="ishas=False";
_ishas = anywheresoftware.b4a.keywords.Common.False;
 };
 }
};
RDebugUtils.currentLine=73334826;
 //BA.debugLineNum = 73334826;BA.debugLine="If ishas Then";
if (_ishas) { 
RDebugUtils.currentLine=73334827;
 //BA.debugLineNum = 73334827;BA.debugLine="MCode.lstChangeFeeKala.RemoveAt(c)";
mostCurrent._mcode._lstchangefeekala /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(_c);
 };
 }else {
RDebugUtils.currentLine=73334833;
 //BA.debugLineNum = 73334833;BA.debugLine="MCode.SaveUpdate(\"Update TblSabad Set FldTeda";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Update TblSabad Set FldTedadDarSabadJoz = '"+_item.TedadDarSabadJoz /*String*/ +"',FldTedadDarSabadKol = '"+_item.TedadDarSabadKol /*String*/ +"',FldMablaghTakhfif = '"+BA.NumberToString(_item.MablaghTakhfif /*int*/ )+"',FldDarsadTakhfif = '"+mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_item.fldDarsadTakhfif /*String*/ )+"',fldFeeBadAzTakhfif = '"+mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_item.fldFeeBadAzTakhfif /*String*/ )+"',FldEshantion = '"+_item.FldEshantion /*String*/ +"',fldArzeshAfzode='"+_item.fldArzeshAfzodeKala /*String*/ +"',fldDarsadArzeshAfzode='"+_item.fldDarsadArzeshAfzodeKala /*String*/ +"' Where FldCodeKala = '"+_item.CodeKala /*String*/ +"'");
 };
RDebugUtils.currentLine=73334836;
 //BA.debugLineNum = 73334836;BA.debugLine="Check = True";
_check = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=73334837;
 //BA.debugLineNum = 73334837;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=73334840;
 //BA.debugLineNum = 73334840;BA.debugLine="If Check = False Then";
if (_check==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=73334841;
 //BA.debugLineNum = 73334841;BA.debugLine="MCode.AddToSabad(Item)";
mostCurrent._mcode._addtosabad /*String*/ (mostCurrent.activityBA,_item);
 };
RDebugUtils.currentLine=73334843;
 //BA.debugLineNum = 73334843;BA.debugLine="RefreshLblSabad";
_refreshlblsabad();
 } 
       catch (Exception e53) {
			processBA.setLastException(e53);RDebugUtils.currentLine=73334845;
 //BA.debugLineNum = 73334845;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("573334845",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=73334846;
 //BA.debugLineNum = 73334846;BA.debugLine="Log(LastException.Message)";
anywheresoftware.b4a.keywords.Common.LogImpl("573334846",anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getMessage(),0);
RDebugUtils.currentLine=73334850;
 //BA.debugLineNum = 73334850;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-AddToSabad");
 };
RDebugUtils.currentLine=73334853;
 //BA.debugLineNum = 73334853;BA.debugLine="End Sub";
return "";
}
public static boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
RDebugUtils.currentModule="act_sabad";
if (Debug.shouldDelegate(mostCurrent.activityBA, "application_error", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "application_error", new Object[] {_error,_stacktrace}));}
RDebugUtils.currentLine=73072640;
 //BA.debugLineNum = 73072640;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
RDebugUtils.currentLine=73072642;
 //BA.debugLineNum = 73072642;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=73072643;
 //BA.debugLineNum = 73072643;BA.debugLine="End Sub";
return false;
}
public static String  _btn_back_click() throws Exception{
RDebugUtils.currentModule="act_sabad";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_back_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_back_click", null));}
RDebugUtils.currentLine=72876032;
 //BA.debugLineNum = 72876032;BA.debugLine="Sub btn_Back_Click";
RDebugUtils.currentLine=72876033;
 //BA.debugLineNum = 72876033;BA.debugLine="If MCode.page=\"KalaDefault\" Then";
if ((mostCurrent._mcode._page /*String*/ ).equals("KalaDefault")) { 
RDebugUtils.currentLine=72876034;
 //BA.debugLineNum = 72876034;BA.debugLine="Log(MCode.feeTip)";
anywheresoftware.b4a.keywords.Common.LogImpl("572876034",mostCurrent._mcode._feetip /*String*/ ,0);
RDebugUtils.currentLine=72876035;
 //BA.debugLineNum = 72876035;BA.debugLine="StartActivity(Act_KalaDefault)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._act_kaladefault.getObject()));
 }else 
{RDebugUtils.currentLine=72876036;
 //BA.debugLineNum = 72876036;BA.debugLine="Else if MCode.page=\"Kala_listi\" Then";
if ((mostCurrent._mcode._page /*String*/ ).equals("Kala_listi")) { 
RDebugUtils.currentLine=72876037;
 //BA.debugLineNum = 72876037;BA.debugLine="StartActivity(Act_Kala_listi)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._act_kala_listi.getObject()));
 }else 
{RDebugUtils.currentLine=72876038;
 //BA.debugLineNum = 72876038;BA.debugLine="Else If MCode.page=\"SabtMarjooii\" Then";
if ((mostCurrent._mcode._page /*String*/ ).equals("SabtMarjooii")) { 
RDebugUtils.currentLine=72876039;
 //BA.debugLineNum = 72876039;BA.debugLine="StartActivity(Act_KalaDefault)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._act_kaladefault.getObject()));
 }}}
;
RDebugUtils.currentLine=72876041;
 //BA.debugLineNum = 72876041;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=72876042;
 //BA.debugLineNum = 72876042;BA.debugLine="End Sub";
return "";
}
public static void  _btn_sendfactor_click() throws Exception{
RDebugUtils.currentModule="act_sabad";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_sendfactor_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "btn_sendfactor_click", null); return;}
ResumableSub_Btn_SendFactor_Click rsub = new ResumableSub_Btn_SendFactor_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Btn_SendFactor_Click extends BA.ResumableSub {
public ResumableSub_Btn_SendFactor_Click(ir.parsikhesab.pakhsh.act_sabad parent) {
this.parent = parent;
}
ir.parsikhesab.pakhsh.act_sabad parent;
int _shomarefactor = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_sabad";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=72548353;
 //BA.debugLineNum = 72548353;BA.debugLine="ProgressDialogShow2(\"در حال ارسال موارد انتخابی .";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(mostCurrent.activityBA,BA.ObjectToCharSequence("در حال ارسال موارد انتخابی . . ."),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=72548354;
 //BA.debugLineNum = 72548354;BA.debugLine="Dim shomarefactor As Int=0";
_shomarefactor = (int) (0);
RDebugUtils.currentLine=72548355;
 //BA.debugLineNum = 72548355;BA.debugLine="shomarefactor=MCode.FaktorSelect";
_shomarefactor = (int)(Double.parseDouble(parent.mostCurrent._mcode._faktorselect /*String*/ ));
RDebugUtils.currentLine=72548356;
 //BA.debugLineNum = 72548356;BA.debugLine="If shomarefactor>0 Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_shomarefactor>0) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=72548357;
 //BA.debugLineNum = 72548357;BA.debugLine="CallSubDelayed2(Service_Server,\"LoadSend\",shomar";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(parent.mostCurrent._service_server.getObject()),"LoadSend",(Object)(_shomarefactor));
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=72548360;
 //BA.debugLineNum = 72548360;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_sabad", "btn_sendfactor_click"),(int) (1000));
this.state = 5;
return;
case 5:
//C
this.state = -1;
;
RDebugUtils.currentLine=72548362;
 //BA.debugLineNum = 72548362;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _btnsabtsefaresh_click() throws Exception{
RDebugUtils.currentModule="act_sabad";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnsabtsefaresh_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnsabtsefaresh_click", null));}
RDebugUtils.currentLine=72286208;
 //BA.debugLineNum = 72286208;BA.debugLine="Sub BtnSabtSefaresh_Click";
RDebugUtils.currentLine=72286211;
 //BA.debugLineNum = 72286211;BA.debugLine="LoadListSabad";
_loadlistsabad();
RDebugUtils.currentLine=72286218;
 //BA.debugLineNum = 72286218;BA.debugLine="Try";
try {RDebugUtils.currentLine=72286225;
 //BA.debugLineNum = 72286225;BA.debugLine="If MCode.Action=\"SabtFaktor\" Then";
if ((mostCurrent._mcode._action /*String*/ ).equals("SabtFaktor")) { 
RDebugUtils.currentLine=72286226;
 //BA.debugLineNum = 72286226;BA.debugLine="If CmbBox1.SelectedIndex=0 Then";
if (mostCurrent._cmbbox1._getselectedindex /*int*/ (null)==0) { 
RDebugUtils.currentLine=72286227;
 //BA.debugLineNum = 72286227;BA.debugLine="ToastMessageShow(\"لطفا نوع تسویه را مشخص کنید\"";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("لطفا نوع تسویه را مشخص کنید"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=72286228;
 //BA.debugLineNum = 72286228;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=72286230;
 //BA.debugLineNum = 72286230;BA.debugLine="If MCode.ManedEtebarEnable=True And MCode.Mande";
if (mostCurrent._mcode._manedetebarenable /*boolean*/ ==anywheresoftware.b4a.keywords.Common.True && (mostCurrent._mcode._mandeetebar /*String*/ ).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=72286231;
 //BA.debugLineNum = 72286231;BA.debugLine="ToastMessageShow(\"سقف اعتبار این مشتری به اتما";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("سقف اعتبار این مشتری به اتمام رسیده است."),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=72286232;
 //BA.debugLineNum = 72286232;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=72286235;
 //BA.debugLineNum = 72286235;BA.debugLine="If MCode.ManedEtebarEnable And MCode.FinalFakto";
if (mostCurrent._mcode._manedetebarenable /*boolean*/  && (double)(Double.parseDouble(mostCurrent._mcode._finalfaktor /*ir.parsikhesab.pakhsh.mcode._finalfaktor_*/ .GablePardakht /*String*/ ))>(double)(Double.parseDouble(mostCurrent._mcode._mandeetebar /*String*/ ))) { 
RDebugUtils.currentLine=72286236;
 //BA.debugLineNum = 72286236;BA.debugLine="ToastMessageShow(\"جمع مبلغ سفارش از اعتبار مشت";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("جمع مبلغ سفارش از اعتبار مشتری بیشتر میباشد."),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=72286237;
 //BA.debugLineNum = 72286237;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=72286264;
 //BA.debugLineNum = 72286264;BA.debugLine="SaveFaktor";
_savefaktor();
 }else 
{RDebugUtils.currentLine=72286269;
 //BA.debugLineNum = 72286269;BA.debugLine="Else If MCode.Action=\"SabtMarjooii\" Or MCode.Act";
if ((mostCurrent._mcode._action /*String*/ ).equals("SabtMarjooii") || (mostCurrent._mcode._action /*String*/ ).equals("UpdateMarjooii")) { 
RDebugUtils.currentLine=72286270;
 //BA.debugLineNum = 72286270;BA.debugLine="If MCode.Action=\"SabtMarjooii\" Then";
if ((mostCurrent._mcode._action /*String*/ ).equals("SabtMarjooii")) { 
RDebugUtils.currentLine=72286271;
 //BA.debugLineNum = 72286271;BA.debugLine="MCode.FaktorSelect=\"\"";
mostCurrent._mcode._faktorselect /*String*/  = "";
 };
RDebugUtils.currentLine=72286274;
 //BA.debugLineNum = 72286274;BA.debugLine="SaveMarjooii";
_savemarjooii();
 }}
;
 } 
       catch (Exception e24) {
			processBA.setLastException(e24);RDebugUtils.currentLine=72286277;
 //BA.debugLineNum = 72286277;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("572286277",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=72286278;
 //BA.debugLineNum = 72286278;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-BtnSabtSefaresh_Click");
 };
RDebugUtils.currentLine=72286280;
 //BA.debugLineNum = 72286280;BA.debugLine="End Sub";
return "";
}
public static void  _savefaktor() throws Exception{
RDebugUtils.currentModule="act_sabad";
if (Debug.shouldDelegate(mostCurrent.activityBA, "savefaktor", false))
	 {Debug.delegate(mostCurrent.activityBA, "savefaktor", null); return;}
ResumableSub_SaveFaktor rsub = new ResumableSub_SaveFaktor(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_SaveFaktor extends BA.ResumableSub {
public ResumableSub_SaveFaktor(ir.parsikhesab.pakhsh.act_sabad parent) {
this.parent = parent;
}
ir.parsikhesab.pakhsh.act_sabad parent;
int _shomarefaktor = 0;
String _imagesignature = "";
String _pdate = "";
String _time = "";
String _dt = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
ir.parsikhesab.pakhsh.mcode._adapterlistnoetasvie _itemtasvie = null;
long _sum = 0L;
long _summablaghtakhfifvizhe = 0L;
long _summablaghtakhfifkala = 0L;
long _mablaghtakhfifkol = 0L;
long _totalfaktor = 0L;
long _mablagharzeshafzode = 0L;
anywheresoftware.b4a.objects.collections.List _lst = null;
int _i = 0;
ir.parsikhesab.pakhsh.mcode._adapterlistkala _item = null;
int _fee = 0;
int _fldfeebadaztakhfif = 0;
anywheresoftware.b4a.objects.collections.Map _m = null;
int step38;
int limit38;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_sabad";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=72417281;
 //BA.debugLineNum = 72417281;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 74;
this.catchState = 73;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 73;
RDebugUtils.currentLine=72417285;
 //BA.debugLineNum = 72417285;BA.debugLine="Dim ShomareFaktor As Int";
_shomarefaktor = 0;
RDebugUtils.currentLine=72417286;
 //BA.debugLineNum = 72417286;BA.debugLine="Dim ImageSignature As String";
_imagesignature = "";
RDebugUtils.currentLine=72417289;
 //BA.debugLineNum = 72417289;BA.debugLine="Dim pDate As String = MCode.ConvertNumbersPersian";
_pdate = parent.mostCurrent._mcode._convertnumberspersian2english /*String*/ (mostCurrent.activityBA,parent.mostCurrent._mcode._datepersian /*String*/ (mostCurrent.activityBA));
RDebugUtils.currentLine=72417290;
 //BA.debugLineNum = 72417290;BA.debugLine="Dim Time As String = MCode.ConvertNumToTime(MCode";
_time = parent.mostCurrent._mcode._convertnumtotime /*String*/ (mostCurrent.activityBA,parent.mostCurrent._mcode._convertnumberspersian2english /*String*/ (mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.DateTime.Time(anywheresoftware.b4a.keywords.Common.DateTime.getNow())));
RDebugUtils.currentLine=72417294;
 //BA.debugLineNum = 72417294;BA.debugLine="Dim DT As String=TxtSharhFaktor.text &\" (\"&pDate";
_dt = parent.mostCurrent._txtsharhfaktor.getText()+" ("+_pdate+"-"+_time+") ";
RDebugUtils.currentLine=72417295;
 //BA.debugLineNum = 72417295;BA.debugLine="Log(\"->>\"&DT)";
anywheresoftware.b4a.keywords.Common.LogImpl("572417295","->>"+_dt,0);
RDebugUtils.currentLine=72417296;
 //BA.debugLineNum = 72417296;BA.debugLine="If MCode.FaktorSelect = \"\" Then";
if (true) break;

case 4:
//if
this.state = 15;
if ((parent.mostCurrent._mcode._faktorselect /*String*/ ).equals("")) { 
this.state = 6;
}else {
this.state = 14;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=72417297;
 //BA.debugLineNum = 72417297;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select Max(Cast";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = parent.mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select Max(Cast(FldShomareFaktor As Int)) As MaxFldShomareFaktor From TblFaktor");
RDebugUtils.currentLine=72417298;
 //BA.debugLineNum = 72417298;BA.debugLine="Cu.Position=0";
_cu.setPosition((int) (0));
RDebugUtils.currentLine=72417299;
 //BA.debugLineNum = 72417299;BA.debugLine="If Cu.GetString(\"MaxFldShomareFaktor\") = Null Th";
if (true) break;

case 7:
//if
this.state = 12;
if (_cu.GetString("MaxFldShomareFaktor")== null) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
RDebugUtils.currentLine=72417300;
 //BA.debugLineNum = 72417300;BA.debugLine="ShomareFaktor = 1";
_shomarefaktor = (int) (1);
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=72417302;
 //BA.debugLineNum = 72417302;BA.debugLine="ShomareFaktor = Cu.GetString(\"MaxFldShomareFakt";
_shomarefaktor = (int) ((double)(Double.parseDouble(_cu.GetString("MaxFldShomareFaktor")))+1);
 if (true) break;

case 12:
//C
this.state = 15;
;
RDebugUtils.currentLine=72417304;
 //BA.debugLineNum = 72417304;BA.debugLine="ShomareSefaresh=ShomareFaktor";
parent.mostCurrent._shomaresefaresh = BA.NumberToString(_shomarefaktor);
 if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=72417306;
 //BA.debugLineNum = 72417306;BA.debugLine="ShomareFaktor = MCode.FaktorSelect";
_shomarefaktor = (int)(Double.parseDouble(parent.mostCurrent._mcode._faktorselect /*String*/ ));
 if (true) break;

case 15:
//C
this.state = 16;
;
RDebugUtils.currentLine=72417309;
 //BA.debugLineNum = 72417309;BA.debugLine="Dim ItemTasvie=ListTasvie.Get(CmbBox1.SelectedInd";
_itemtasvie = (ir.parsikhesab.pakhsh.mcode._adapterlistnoetasvie)(parent.mostCurrent._listtasvie.Get((int) (parent.mostCurrent._cmbbox1._getselectedindex /*int*/ (null)-1)));
RDebugUtils.currentLine=72417310;
 //BA.debugLineNum = 72417310;BA.debugLine="If TxtSharhFaktor.Text.Trim = \"\" Then TxtSharhFak";
if (true) break;

case 16:
//if
this.state = 21;
if ((parent.mostCurrent._txtsharhfaktor.getText().trim()).equals("")) { 
this.state = 18;
;}if (true) break;

case 18:
//C
this.state = 21;
parent.mostCurrent._txtsharhfaktor.setText(BA.ObjectToCharSequence(""));
if (true) break;

case 21:
//C
this.state = 22;
;
RDebugUtils.currentLine=72417312;
 //BA.debugLineNum = 72417312;BA.debugLine="If MCode.FaktorSelect <> \"\" Then";
if (true) break;

case 22:
//if
this.state = 25;
if ((parent.mostCurrent._mcode._faktorselect /*String*/ ).equals("") == false) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=72417313;
 //BA.debugLineNum = 72417313;BA.debugLine="MCode.SaveUpdate(\"Delete From TblFaktor Where Fl";
parent.mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Delete From TblFaktor Where FldShomareFaktor = '"+parent.mostCurrent._mcode._faktorselect /*String*/ +"'");
 if (true) break;

case 25:
//C
this.state = 26;
;
RDebugUtils.currentLine=72417322;
 //BA.debugLineNum = 72417322;BA.debugLine="Dim Sum As Long = MCode.FinalFaktor.KhamFaktor";
_sum = (long)(Double.parseDouble(parent.mostCurrent._mcode._finalfaktor /*ir.parsikhesab.pakhsh.mcode._finalfaktor_*/ .KhamFaktor /*String*/ ));
RDebugUtils.currentLine=72417323;
 //BA.debugLineNum = 72417323;BA.debugLine="Dim SumMablaghTakhfifVizhe As Long=MCode.FinalFak";
_summablaghtakhfifvizhe = (long)(Double.parseDouble(parent.mostCurrent._mcode._finalfaktor /*ir.parsikhesab.pakhsh.mcode._finalfaktor_*/ .TakhfifVizhe /*String*/ ));
RDebugUtils.currentLine=72417324;
 //BA.debugLineNum = 72417324;BA.debugLine="Dim SumMablaghTakhfifKala As Long=MCode.FinalFakt";
_summablaghtakhfifkala = (long)(Double.parseDouble(parent.mostCurrent._mcode._finalfaktor /*ir.parsikhesab.pakhsh.mcode._finalfaktor_*/ .TakhfifKala /*String*/ ));
RDebugUtils.currentLine=72417325;
 //BA.debugLineNum = 72417325;BA.debugLine="Dim MablaghTakhfifKol As Long=SumMablaghTakhfifKa";
_mablaghtakhfifkol = (long) (_summablaghtakhfifkala+_summablaghtakhfifvizhe);
RDebugUtils.currentLine=72417327;
 //BA.debugLineNum = 72417327;BA.debugLine="Dim TotalFaktor As Long = MCode.FinalFaktor.Gable";
_totalfaktor = (long)(Double.parseDouble(parent.mostCurrent._mcode._finalfaktor /*ir.parsikhesab.pakhsh.mcode._finalfaktor_*/ .GablePardakht /*String*/ ));
RDebugUtils.currentLine=72417328;
 //BA.debugLineNum = 72417328;BA.debugLine="Dim MablaghArzeshAfzode As Long=MCode.MohasbeArze";
_mablagharzeshafzode = parent.mostCurrent._mcode._mohasbearzeshafzode /*long*/ (mostCurrent.activityBA,_totalfaktor);
RDebugUtils.currentLine=72417330;
 //BA.debugLineNum = 72417330;BA.debugLine="If MCode.Signature = 1 Then";
if (true) break;

case 26:
//if
this.state = 31;
if ((parent.mostCurrent._mcode._signature /*String*/ ).equals(BA.NumberToString(1))) { 
this.state = 28;
}else {
this.state = 30;
}if (true) break;

case 28:
//C
this.state = 31;
RDebugUtils.currentLine=72417331;
 //BA.debugLineNum = 72417331;BA.debugLine="ImageSignature =MCode.Encrypted(MCode.ConvertBlo";
_imagesignature = parent.mostCurrent._mcode._encrypted /*String*/ (mostCurrent.activityBA,parent.mostCurrent._mcode._convertblobtostring /*String*/ (mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal()+"/Parsik/Signature",parent.mostCurrent._mcode._c_tafzili /*String*/ +".png"));
 if (true) break;

case 30:
//C
this.state = 31;
RDebugUtils.currentLine=72417333;
 //BA.debugLineNum = 72417333;BA.debugLine="ImageSignature = \"\"";
_imagesignature = "";
 if (true) break;

case 31:
//C
this.state = 32;
;
RDebugUtils.currentLine=72417336;
 //BA.debugLineNum = 72417336;BA.debugLine="Dim lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=72417337;
 //BA.debugLineNum = 72417337;BA.debugLine="lst.Initialize";
_lst.Initialize();
RDebugUtils.currentLine=72417338;
 //BA.debugLineNum = 72417338;BA.debugLine="For i=0 To OriginalItemList.Size-1";
if (true) break;

case 32:
//for
this.state = 55;
step38 = 1;
limit38 = (int) (parent.mostCurrent._originalitemlist.getSize()-1);
_i = (int) (0) ;
this.state = 75;
if (true) break;

case 75:
//C
this.state = 55;
if ((step38 > 0 && _i <= limit38) || (step38 < 0 && _i >= limit38)) this.state = 34;
if (true) break;

case 76:
//C
this.state = 75;
_i = ((int)(0 + _i + step38)) ;
if (true) break;

case 34:
//C
this.state = 35;
RDebugUtils.currentLine=72417339;
 //BA.debugLineNum = 72417339;BA.debugLine="Dim Item = OriginalItemList.Get(i) As AdapterLis";
_item = (ir.parsikhesab.pakhsh.mcode._adapterlistkala)(parent.mostCurrent._originalitemlist.Get(_i));
RDebugUtils.currentLine=72417340;
 //BA.debugLineNum = 72417340;BA.debugLine="Dim fee As Int";
_fee = 0;
RDebugUtils.currentLine=72417341;
 //BA.debugLineNum = 72417341;BA.debugLine="Dim fldFeeBadAzTakhfif As Int=Item.fldFeeBadAzTa";
_fldfeebadaztakhfif = (int)(Double.parseDouble(_item.fldFeeBadAzTakhfif /*String*/ ));
RDebugUtils.currentLine=72417342;
 //BA.debugLineNum = 72417342;BA.debugLine="If Item.TedadDarSabadJoz>0 Or Item.TedadDarSabad";
if (true) break;

case 35:
//if
this.state = 51;
if ((double)(Double.parseDouble(_item.TedadDarSabadJoz /*String*/ ))>0 || (double)(Double.parseDouble(_item.TedadDarSabadKol /*String*/ ))>0) { 
this.state = 37;
}if (true) break;

case 37:
//C
this.state = 38;
RDebugUtils.currentLine=72417344;
 //BA.debugLineNum = 72417344;BA.debugLine="fee= Item.FeeForoosh";
_fee = _item.FeeForoosh /*int*/ ;
RDebugUtils.currentLine=72417345;
 //BA.debugLineNum = 72417345;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=72417346;
 //BA.debugLineNum = 72417346;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=72417347;
 //BA.debugLineNum = 72417347;BA.debugLine="m.Put(\"FldRadif\",i+1)";
_m.Put((Object)("FldRadif"),(Object)(_i+1));
RDebugUtils.currentLine=72417348;
 //BA.debugLineNum = 72417348;BA.debugLine="m.Put(\"FldC_Visitor\",MCode.C_Visitor)";
_m.Put((Object)("FldC_Visitor"),(Object)(parent.mostCurrent._mcode._c_visitor /*String*/ ));
RDebugUtils.currentLine=72417349;
 //BA.debugLineNum = 72417349;BA.debugLine="m.Put(\"FldC_Tafzili\",MCode.C_Tafzili)";
_m.Put((Object)("FldC_Tafzili"),(Object)(parent.mostCurrent._mcode._c_tafzili /*String*/ ));
RDebugUtils.currentLine=72417350;
 //BA.debugLineNum = 72417350;BA.debugLine="m.Put(\"FldN_Tafzili\",MCode.N_Tafzili)";
_m.Put((Object)("FldN_Tafzili"),(Object)(parent.mostCurrent._mcode._n_tafzili /*String*/ ));
RDebugUtils.currentLine=72417351;
 //BA.debugLineNum = 72417351;BA.debugLine="m.Put(\"FldShomareFaktor\",ShomareFaktor)";
_m.Put((Object)("FldShomareFaktor"),(Object)(_shomarefaktor));
RDebugUtils.currentLine=72417352;
 //BA.debugLineNum = 72417352;BA.debugLine="m.Put(\"FldShomareBargasht\",0)";
_m.Put((Object)("FldShomareBargasht"),(Object)(0));
RDebugUtils.currentLine=72417353;
 //BA.debugLineNum = 72417353;BA.debugLine="m.Put(\"FldCodeKala\",Item.CodeKala)";
_m.Put((Object)("FldCodeKala"),(Object)(_item.CodeKala /*String*/ ));
RDebugUtils.currentLine=72417354;
 //BA.debugLineNum = 72417354;BA.debugLine="m.Put(\"FldNameKala\",Item.NameKala)";
_m.Put((Object)("FldNameKala"),(Object)(_item.NameKala /*String*/ ));
RDebugUtils.currentLine=72417355;
 //BA.debugLineNum = 72417355;BA.debugLine="m.Put(\"FldFeeForoosh\",fee)";
_m.Put((Object)("FldFeeForoosh"),(Object)(_fee));
RDebugUtils.currentLine=72417356;
 //BA.debugLineNum = 72417356;BA.debugLine="m.Put(\"fldFeeBadAzTakhfif\",Item.FldFeeBadAzTakh";
_m.Put((Object)("fldFeeBadAzTakhfif"),(Object)(_item.fldFeeBadAzTakhfif /*String*/ ));
RDebugUtils.currentLine=72417357;
 //BA.debugLineNum = 72417357;BA.debugLine="m.Put(\"FldMablaghTakhfif\",Item.MablaghTakhfif)";
_m.Put((Object)("FldMablaghTakhfif"),(Object)(_item.MablaghTakhfif /*int*/ ));
RDebugUtils.currentLine=72417358;
 //BA.debugLineNum = 72417358;BA.debugLine="m.Put(\"FldSumMablaghTakhfifVizhe\",IIf(Item.Mabl";
_m.Put((Object)("FldSumMablaghTakhfifVizhe"),((_item.MablaghTakhfif /*int*/ >0) ? ((Object)(_summablaghtakhfifvizhe)) : ((Object)(0))));
RDebugUtils.currentLine=72417359;
 //BA.debugLineNum = 72417359;BA.debugLine="m.Put(\"FldSumMablaghTakhfifKala\",SumMablaghTakh";
_m.Put((Object)("FldSumMablaghTakhfifKala"),(Object)(_summablaghtakhfifkala));
RDebugUtils.currentLine=72417360;
 //BA.debugLineNum = 72417360;BA.debugLine="m.Put(\"FldNameVahed\",Item.NameVahed)";
_m.Put((Object)("FldNameVahed"),(Object)(_item.NameVahed /*String*/ ));
RDebugUtils.currentLine=72417361;
 //BA.debugLineNum = 72417361;BA.debugLine="m.Put(\"FldNameVahed2\",Item.NameVahed2)";
_m.Put((Object)("FldNameVahed2"),(Object)(_item.NameVahed2 /*String*/ ));
RDebugUtils.currentLine=72417362;
 //BA.debugLineNum = 72417362;BA.debugLine="m.Put(\"FldSumMande\",Item.SumMande)";
_m.Put((Object)("FldSumMande"),(Object)(_item.SumMande /*String*/ ));
RDebugUtils.currentLine=72417363;
 //BA.debugLineNum = 72417363;BA.debugLine="m.Put(\"fldPathPic\",Item.fldPathPic)";
_m.Put((Object)("fldPathPic"),(Object)(_item.fldPathPic /*String*/ ));
RDebugUtils.currentLine=72417364;
 //BA.debugLineNum = 72417364;BA.debugLine="m.Put(\"FldTedadDarSabadJoz\",Item.TedadDarSabadJ";
_m.Put((Object)("FldTedadDarSabadJoz"),(Object)(_item.TedadDarSabadJoz /*String*/ ));
RDebugUtils.currentLine=72417365;
 //BA.debugLineNum = 72417365;BA.debugLine="m.Put(\"FldTedadDarSabadKol\",Item.TedadDarSabadK";
_m.Put((Object)("FldTedadDarSabadKol"),(Object)(_item.TedadDarSabadKol /*String*/ ));
RDebugUtils.currentLine=72417366;
 //BA.debugLineNum = 72417366;BA.debugLine="m.Put(\"FldTedadDarkarton\",Item.TedadDarKarton)";
_m.Put((Object)("FldTedadDarkarton"),(Object)(_item.TedadDarKarton /*String*/ ));
RDebugUtils.currentLine=72417367;
 //BA.debugLineNum = 72417367;BA.debugLine="m.Put(\"FldTotalFaktor\",IIf(Item.fldDarsadTakhfi";
_m.Put((Object)("FldTotalFaktor"),(((_item.fldDarsadTakhfif /*String*/ ).equals(BA.NumberToString(100))) ? ((Object)(0)) : ((Object)(_totalfaktor))));
RDebugUtils.currentLine=72417368;
 //BA.debugLineNum = 72417368;BA.debugLine="m.Put(\"FldTozihat\",Item.Tozihat)";
_m.Put((Object)("FldTozihat"),(Object)(_item.Tozihat /*String*/ ));
RDebugUtils.currentLine=72417369;
 //BA.debugLineNum = 72417369;BA.debugLine="m.Put(\"FldTozih\",TxtSharhFaktor.Text & \" (\" & C";
_m.Put((Object)("FldTozih"),(Object)(parent.mostCurrent._txtsharhfaktor.getText()+" ("+parent.mostCurrent._cmbbox1._cmbbox /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedItem()+")"));
RDebugUtils.currentLine=72417370;
 //BA.debugLineNum = 72417370;BA.debugLine="m.Put(\"FldVaziatPardakht\",ItemTasvie.FldC_Tasvi";
_m.Put((Object)("FldVaziatPardakht"),(Object)(_itemtasvie.FldC_Tasvie /*String*/ ));
RDebugUtils.currentLine=72417371;
 //BA.debugLineNum = 72417371;BA.debugLine="m.Put(\"FldMablaghKol\",Sum)";
_m.Put((Object)("FldMablaghKol"),(Object)(_sum));
RDebugUtils.currentLine=72417372;
 //BA.debugLineNum = 72417372;BA.debugLine="m.Put(\"FldMablaghTakhfifKol\",MablaghTakhfifKol)";
_m.Put((Object)("FldMablaghTakhfifKol"),(Object)(_mablaghtakhfifkol));
RDebugUtils.currentLine=72417373;
 //BA.debugLineNum = 72417373;BA.debugLine="m.Put(\"FldDarsadTakhfif\",myCode.Is_Null_adad(It";
_m.Put((Object)("FldDarsadTakhfif"),(Object)(parent.mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_item.fldDarsadTakhfif /*String*/ )));
RDebugUtils.currentLine=72417374;
 //BA.debugLineNum = 72417374;BA.debugLine="m.Put(\"fldArzeshAfzode\",Item.fldArzeshAfzodeKal";
_m.Put((Object)("fldArzeshAfzode"),(Object)(_item.fldArzeshAfzodeKala /*String*/ ));
RDebugUtils.currentLine=72417375;
 //BA.debugLineNum = 72417375;BA.debugLine="m.Put(\"fldDarsadArzeshAfzode\",Item.fldDarsadArz";
_m.Put((Object)("fldDarsadArzeshAfzode"),(Object)(_item.fldDarsadArzeshAfzodeKala /*String*/ ));
RDebugUtils.currentLine=72417378;
 //BA.debugLineNum = 72417378;BA.debugLine="m.Put(\"FldTarikh\",pDate)";
_m.Put((Object)("FldTarikh"),(Object)(_pdate));
RDebugUtils.currentLine=72417379;
 //BA.debugLineNum = 72417379;BA.debugLine="m.Put(\"FldDate\",pDate)";
_m.Put((Object)("FldDate"),(Object)(_pdate));
RDebugUtils.currentLine=72417380;
 //BA.debugLineNum = 72417380;BA.debugLine="m.Put(\"FldTime\",Time)";
_m.Put((Object)("FldTime"),(Object)(_time));
RDebugUtils.currentLine=72417381;
 //BA.debugLineNum = 72417381;BA.debugLine="m.Put(\"FldSignatureBitmapString\",ImageSignature";
_m.Put((Object)("FldSignatureBitmapString"),(Object)(_imagesignature));
RDebugUtils.currentLine=72417382;
 //BA.debugLineNum = 72417382;BA.debugLine="m.Put(\"fldShomareForoosh\",myCode.Is_Null_adad(I";
_m.Put((Object)("fldShomareForoosh"),(Object)(parent.mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_item.fldShomareForoosh /*String*/ )));
RDebugUtils.currentLine=72417383;
 //BA.debugLineNum = 72417383;BA.debugLine="m.Put(\"FldSync\",\"False\")";
_m.Put((Object)("FldSync"),(Object)("False"));
RDebugUtils.currentLine=72417384;
 //BA.debugLineNum = 72417384;BA.debugLine="m.Put(\"WIsBacked\",\"False\")";
_m.Put((Object)("WIsBacked"),(Object)("False"));
RDebugUtils.currentLine=72417385;
 //BA.debugLineNum = 72417385;BA.debugLine="m.Put(\"FldType\",\"Foroosh\")";
_m.Put((Object)("FldType"),(Object)("Foroosh"));
RDebugUtils.currentLine=72417386;
 //BA.debugLineNum = 72417386;BA.debugLine="m.Put(\"FldAmani\",MCode.isAmani)";
_m.Put((Object)("FldAmani"),(Object)(parent.mostCurrent._mcode._isamani /*String*/ ));
RDebugUtils.currentLine=72417387;
 //BA.debugLineNum = 72417387;BA.debugLine="m.Put(\"WSendFrom\",3)";
_m.Put((Object)("WSendFrom"),(Object)(3));
RDebugUtils.currentLine=72417388;
 //BA.debugLineNum = 72417388;BA.debugLine="lst.Add(m)";
_lst.Add((Object)(_m.getObject()));
RDebugUtils.currentLine=72417392;
 //BA.debugLineNum = 72417392;BA.debugLine="If Item.TedadDarSabadJoz>0 And Item.TedadDarSab";
if (true) break;

case 38:
//if
this.state = 50;
if ((double)(Double.parseDouble(_item.TedadDarSabadJoz /*String*/ ))>0 && (double)(Double.parseDouble(_item.TedadDarSabadKol /*String*/ ))>0) { 
this.state = 40;
}else {
this.state = 42;
}if (true) break;

case 40:
//C
this.state = 50;
RDebugUtils.currentLine=72417393;
 //BA.debugLineNum = 72417393;BA.debugLine="KasreMojodi(Item.CodeKala,Item.TedadDarSabadJ";
_kasremojodi(_item.CodeKala /*String*/ ,(int)(Double.parseDouble(_item.TedadDarSabadJoz /*String*/ )));
RDebugUtils.currentLine=72417394;
 //BA.debugLineNum = 72417394;BA.debugLine="KasreMojodi(Item.CodeKala,(Item.TedadDarSabad";
_kasremojodi(_item.CodeKala /*String*/ ,(int) (((double)(Double.parseDouble(_item.TedadDarSabadKol /*String*/ ))*(double)(Double.parseDouble(_item.TedadDarKarton /*String*/ )))));
 if (true) break;

case 42:
//C
this.state = 43;
RDebugUtils.currentLine=72417398;
 //BA.debugLineNum = 72417398;BA.debugLine="If Item.TedadDarSabadJoz>0 Then";
if (true) break;

case 43:
//if
this.state = 46;
if ((double)(Double.parseDouble(_item.TedadDarSabadJoz /*String*/ ))>0) { 
this.state = 45;
}if (true) break;

case 45:
//C
this.state = 46;
RDebugUtils.currentLine=72417399;
 //BA.debugLineNum = 72417399;BA.debugLine="KasreMojodi(Item.CodeKala,Item.TedadDarSabadJ";
_kasremojodi(_item.CodeKala /*String*/ ,(int)(Double.parseDouble(_item.TedadDarSabadJoz /*String*/ )));
 if (true) break;
;
RDebugUtils.currentLine=72417402;
 //BA.debugLineNum = 72417402;BA.debugLine="If Item.TedadDarSabadKol>0 Then";

case 46:
//if
this.state = 49;
if ((double)(Double.parseDouble(_item.TedadDarSabadKol /*String*/ ))>0) { 
this.state = 48;
}if (true) break;

case 48:
//C
this.state = 49;
RDebugUtils.currentLine=72417403;
 //BA.debugLineNum = 72417403;BA.debugLine="KasreMojodi(Item.CodeKala,(Item.TedadDarSaba";
_kasremojodi(_item.CodeKala /*String*/ ,(int) (((double)(Double.parseDouble(_item.TedadDarSabadKol /*String*/ ))*(double)(Double.parseDouble(_item.TedadDarKarton /*String*/ )))));
 if (true) break;

case 49:
//C
this.state = 50;
;
 if (true) break;

case 50:
//C
this.state = 51;
;
 if (true) break;
;
RDebugUtils.currentLine=72417409;
 //BA.debugLineNum = 72417409;BA.debugLine="If Item.FldEshantion>0 Then";

case 51:
//if
this.state = 54;
if ((double)(Double.parseDouble(_item.FldEshantion /*String*/ ))>0) { 
this.state = 53;
}if (true) break;

case 53:
//C
this.state = 54;
RDebugUtils.currentLine=72417411;
 //BA.debugLineNum = 72417411;BA.debugLine="Item.MablaghTakhfif=Item.FeeForoosh";
_item.MablaghTakhfif /*int*/  = _item.FeeForoosh /*int*/ ;
RDebugUtils.currentLine=72417412;
 //BA.debugLineNum = 72417412;BA.debugLine="Item.fldDarsadTakhfif=100";
_item.fldDarsadTakhfif /*String*/  = BA.NumberToString(100);
RDebugUtils.currentLine=72417413;
 //BA.debugLineNum = 72417413;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=72417414;
 //BA.debugLineNum = 72417414;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=72417415;
 //BA.debugLineNum = 72417415;BA.debugLine="m.Put(\"FldRadif\",i+1)";
_m.Put((Object)("FldRadif"),(Object)(_i+1));
RDebugUtils.currentLine=72417416;
 //BA.debugLineNum = 72417416;BA.debugLine="m.Put(\"FldC_Visitor\",MCode.C_Visitor)";
_m.Put((Object)("FldC_Visitor"),(Object)(parent.mostCurrent._mcode._c_visitor /*String*/ ));
RDebugUtils.currentLine=72417417;
 //BA.debugLineNum = 72417417;BA.debugLine="m.Put(\"FldC_Tafzili\",MCode.C_Tafzili)";
_m.Put((Object)("FldC_Tafzili"),(Object)(parent.mostCurrent._mcode._c_tafzili /*String*/ ));
RDebugUtils.currentLine=72417418;
 //BA.debugLineNum = 72417418;BA.debugLine="m.Put(\"FldN_Tafzili\",MCode.N_Tafzili)";
_m.Put((Object)("FldN_Tafzili"),(Object)(parent.mostCurrent._mcode._n_tafzili /*String*/ ));
RDebugUtils.currentLine=72417419;
 //BA.debugLineNum = 72417419;BA.debugLine="m.Put(\"FldShomareFaktor\",ShomareFaktor)";
_m.Put((Object)("FldShomareFaktor"),(Object)(_shomarefaktor));
RDebugUtils.currentLine=72417420;
 //BA.debugLineNum = 72417420;BA.debugLine="m.Put(\"FldShomareBargasht\",0)";
_m.Put((Object)("FldShomareBargasht"),(Object)(0));
RDebugUtils.currentLine=72417421;
 //BA.debugLineNum = 72417421;BA.debugLine="m.Put(\"FldCodeKala\",Item.CodeKala)";
_m.Put((Object)("FldCodeKala"),(Object)(_item.CodeKala /*String*/ ));
RDebugUtils.currentLine=72417422;
 //BA.debugLineNum = 72417422;BA.debugLine="m.Put(\"FldNameKala\",Item.NameKala)";
_m.Put((Object)("FldNameKala"),(Object)(_item.NameKala /*String*/ ));
RDebugUtils.currentLine=72417423;
 //BA.debugLineNum = 72417423;BA.debugLine="m.Put(\"FldFeeForoosh\",0)";
_m.Put((Object)("FldFeeForoosh"),(Object)(0));
RDebugUtils.currentLine=72417424;
 //BA.debugLineNum = 72417424;BA.debugLine="m.Put(\"fldFeeBadAzTakhfif\",0)";
_m.Put((Object)("fldFeeBadAzTakhfif"),(Object)(0));
RDebugUtils.currentLine=72417425;
 //BA.debugLineNum = 72417425;BA.debugLine="m.Put(\"FldMablaghTakhfif\",Item.MablaghTakhfif)";
_m.Put((Object)("FldMablaghTakhfif"),(Object)(_item.MablaghTakhfif /*int*/ ));
RDebugUtils.currentLine=72417426;
 //BA.debugLineNum = 72417426;BA.debugLine="m.Put(\"FldSumMablaghTakhfifVizhe\",0)";
_m.Put((Object)("FldSumMablaghTakhfifVizhe"),(Object)(0));
RDebugUtils.currentLine=72417427;
 //BA.debugLineNum = 72417427;BA.debugLine="m.Put(\"FldSumMablaghTakhfifKala\",0)";
_m.Put((Object)("FldSumMablaghTakhfifKala"),(Object)(0));
RDebugUtils.currentLine=72417428;
 //BA.debugLineNum = 72417428;BA.debugLine="m.Put(\"FldNameVahed\",Item.NameVahed)";
_m.Put((Object)("FldNameVahed"),(Object)(_item.NameVahed /*String*/ ));
RDebugUtils.currentLine=72417429;
 //BA.debugLineNum = 72417429;BA.debugLine="m.Put(\"FldNameVahed2\",Item.NameVahed2)";
_m.Put((Object)("FldNameVahed2"),(Object)(_item.NameVahed2 /*String*/ ));
RDebugUtils.currentLine=72417430;
 //BA.debugLineNum = 72417430;BA.debugLine="m.Put(\"FldSumMande\",Item.SumMande)";
_m.Put((Object)("FldSumMande"),(Object)(_item.SumMande /*String*/ ));
RDebugUtils.currentLine=72417431;
 //BA.debugLineNum = 72417431;BA.debugLine="m.Put(\"fldPathPic\",Item.fldPathPic)";
_m.Put((Object)("fldPathPic"),(Object)(_item.fldPathPic /*String*/ ));
RDebugUtils.currentLine=72417432;
 //BA.debugLineNum = 72417432;BA.debugLine="m.Put(\"FldTedadDarSabadJoz\",Item.FldEshantion)";
_m.Put((Object)("FldTedadDarSabadJoz"),(Object)(_item.FldEshantion /*String*/ ));
RDebugUtils.currentLine=72417433;
 //BA.debugLineNum = 72417433;BA.debugLine="m.Put(\"FldTedadDarSabadKol\",Item.TedadDarSabadK";
_m.Put((Object)("FldTedadDarSabadKol"),(Object)(_item.TedadDarSabadKol /*String*/ ));
RDebugUtils.currentLine=72417434;
 //BA.debugLineNum = 72417434;BA.debugLine="m.Put(\"FldTedadDarkarton\",Item.TedadDarKarton)";
_m.Put((Object)("FldTedadDarkarton"),(Object)(_item.TedadDarKarton /*String*/ ));
RDebugUtils.currentLine=72417435;
 //BA.debugLineNum = 72417435;BA.debugLine="m.Put(\"FldTotalFaktor\",IIf(Item.fldDarsadTakhfi";
_m.Put((Object)("FldTotalFaktor"),(((_item.fldDarsadTakhfif /*String*/ ).equals(BA.NumberToString(100))) ? ((Object)(0)) : ((Object)(_totalfaktor))));
RDebugUtils.currentLine=72417436;
 //BA.debugLineNum = 72417436;BA.debugLine="m.Put(\"FldTozihat\",\"اشانتیون\")";
_m.Put((Object)("FldTozihat"),(Object)("اشانتیون"));
RDebugUtils.currentLine=72417438;
 //BA.debugLineNum = 72417438;BA.debugLine="m.Put(\"FldTozih\",TxtSharhFaktor.Text & \" (\" & C";
_m.Put((Object)("FldTozih"),(Object)(parent.mostCurrent._txtsharhfaktor.getText()+" ("+parent.mostCurrent._cmbbox1._cmbbox /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedItem()+")"));
RDebugUtils.currentLine=72417439;
 //BA.debugLineNum = 72417439;BA.debugLine="m.Put(\"FldVaziatPardakht\",ItemTasvie.FldC_Tasvi";
_m.Put((Object)("FldVaziatPardakht"),(Object)(_itemtasvie.FldC_Tasvie /*String*/ ));
RDebugUtils.currentLine=72417440;
 //BA.debugLineNum = 72417440;BA.debugLine="m.Put(\"FldMablaghKol\",Sum)";
_m.Put((Object)("FldMablaghKol"),(Object)(_sum));
RDebugUtils.currentLine=72417441;
 //BA.debugLineNum = 72417441;BA.debugLine="m.Put(\"FldMablaghTakhfifKol\",Item.MablaghTakhfi";
_m.Put((Object)("FldMablaghTakhfifKol"),(Object)(_item.MablaghTakhfif /*int*/ ));
RDebugUtils.currentLine=72417442;
 //BA.debugLineNum = 72417442;BA.debugLine="m.Put(\"FldDarsadTakhfif\",100)";
_m.Put((Object)("FldDarsadTakhfif"),(Object)(100));
RDebugUtils.currentLine=72417443;
 //BA.debugLineNum = 72417443;BA.debugLine="m.Put(\"fldArzeshAfzode\",Item.fldArzeshAfzodeKal";
_m.Put((Object)("fldArzeshAfzode"),(Object)(_item.fldArzeshAfzodeKala /*String*/ ));
RDebugUtils.currentLine=72417444;
 //BA.debugLineNum = 72417444;BA.debugLine="m.Put(\"fldDarsadArzeshAfzode\",Item.fldDarsadArz";
_m.Put((Object)("fldDarsadArzeshAfzode"),(Object)(_item.fldDarsadArzeshAfzodeKala /*String*/ ));
RDebugUtils.currentLine=72417447;
 //BA.debugLineNum = 72417447;BA.debugLine="m.Put(\"FldTarikh\",pDate)";
_m.Put((Object)("FldTarikh"),(Object)(_pdate));
RDebugUtils.currentLine=72417448;
 //BA.debugLineNum = 72417448;BA.debugLine="m.Put(\"FldDate\",pDate)";
_m.Put((Object)("FldDate"),(Object)(_pdate));
RDebugUtils.currentLine=72417449;
 //BA.debugLineNum = 72417449;BA.debugLine="m.Put(\"FldTime\",Time)";
_m.Put((Object)("FldTime"),(Object)(_time));
RDebugUtils.currentLine=72417450;
 //BA.debugLineNum = 72417450;BA.debugLine="m.Put(\"FldSignatureBitmapString\",ImageSignature";
_m.Put((Object)("FldSignatureBitmapString"),(Object)(_imagesignature));
RDebugUtils.currentLine=72417451;
 //BA.debugLineNum = 72417451;BA.debugLine="m.Put(\"fldShomareForoosh\",myCode.Is_Null_adad(I";
_m.Put((Object)("fldShomareForoosh"),(Object)(parent.mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_item.fldShomareForoosh /*String*/ )));
RDebugUtils.currentLine=72417452;
 //BA.debugLineNum = 72417452;BA.debugLine="m.Put(\"FldSync\",\"False\")";
_m.Put((Object)("FldSync"),(Object)("False"));
RDebugUtils.currentLine=72417453;
 //BA.debugLineNum = 72417453;BA.debugLine="m.Put(\"WIsBacked\",\"False\")";
_m.Put((Object)("WIsBacked"),(Object)("False"));
RDebugUtils.currentLine=72417454;
 //BA.debugLineNum = 72417454;BA.debugLine="m.Put(\"FldType\",\"Eshantion\")";
_m.Put((Object)("FldType"),(Object)("Eshantion"));
RDebugUtils.currentLine=72417455;
 //BA.debugLineNum = 72417455;BA.debugLine="m.Put(\"FldAmani\",MCode.isAmani)";
_m.Put((Object)("FldAmani"),(Object)(parent.mostCurrent._mcode._isamani /*String*/ ));
RDebugUtils.currentLine=72417456;
 //BA.debugLineNum = 72417456;BA.debugLine="m.Put(\"WSendFrom\",3)";
_m.Put((Object)("WSendFrom"),(Object)(3));
RDebugUtils.currentLine=72417457;
 //BA.debugLineNum = 72417457;BA.debugLine="lst.Add(m)";
_lst.Add((Object)(_m.getObject()));
RDebugUtils.currentLine=72417459;
 //BA.debugLineNum = 72417459;BA.debugLine="KasreMojodi(Item.CodeKala,Item.FldEshantion)";
_kasremojodi(_item.CodeKala /*String*/ ,(int)(Double.parseDouble(_item.FldEshantion /*String*/ )));
 if (true) break;

case 54:
//C
this.state = 76;
;
 if (true) break;
if (true) break;

case 55:
//C
this.state = 56;
;
RDebugUtils.currentLine=72417462;
 //BA.debugLineNum = 72417462;BA.debugLine="DBUtils.InsertMaps(MCode.Sql1,\"TblFaktor\",lst)";
parent.mostCurrent._dbutils._insertmaps /*String*/ (mostCurrent.activityBA,parent.mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ ,"TblFaktor",_lst);
RDebugUtils.currentLine=72417463;
 //BA.debugLineNum = 72417463;BA.debugLine="MCode.feeTip=0";
parent.mostCurrent._mcode._feetip /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=72417464;
 //BA.debugLineNum = 72417464;BA.debugLine="MCode.feeCode=0";
parent.mostCurrent._mcode._feecode /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=72417466;
 //BA.debugLineNum = 72417466;BA.debugLine="MCode.isAmani=0";
parent.mostCurrent._mcode._isamani /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=72417467;
 //BA.debugLineNum = 72417467;BA.debugLine="Sleep(300)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_sabad", "savefaktor"),(int) (300));
this.state = 77;
return;
case 77:
//C
this.state = 56;
;
RDebugUtils.currentLine=72417468;
 //BA.debugLineNum = 72417468;BA.debugLine="MCode.SaveUpdate(\"Delete From TblSabad\")";
parent.mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Delete From TblSabad");
RDebugUtils.currentLine=72417469;
 //BA.debugLineNum = 72417469;BA.debugLine="Sleep(300)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_sabad", "savefaktor"),(int) (300));
this.state = 78;
return;
case 78:
//C
this.state = 56;
;
RDebugUtils.currentLine=72417470;
 //BA.debugLineNum = 72417470;BA.debugLine="If MCode.FaktorSelect=\"\" Then";
if (true) break;

case 56:
//if
this.state = 65;
if ((parent.mostCurrent._mcode._faktorselect /*String*/ ).equals("")) { 
this.state = 58;
}if (true) break;

case 58:
//C
this.state = 59;
RDebugUtils.currentLine=72417471;
 //BA.debugLineNum = 72417471;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * from T";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = parent.mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * from TblLogVisitSefaresh Where FldC_Ashkhas = '"+parent.mostCurrent._mcode._c_tafzili /*String*/ +"'");
RDebugUtils.currentLine=72417472;
 //BA.debugLineNum = 72417472;BA.debugLine="If Cu.RowCount>0 Then";
if (true) break;

case 59:
//if
this.state = 64;
if (_cu.getRowCount()>0) { 
this.state = 61;
}else {
this.state = 63;
}if (true) break;

case 61:
//C
this.state = 64;
RDebugUtils.currentLine=72417473;
 //BA.debugLineNum = 72417473;BA.debugLine="MCode.SaveUpdate(\"Update TblLogVisitSefaresh Se";
parent.mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Update TblLogVisitSefaresh Set FldSefaresh = '"+_pdate+"' ,FldElatSefaresh = '' Where FldC_Ashkhas = '"+parent.mostCurrent._mcode._c_tafzili /*String*/ +"'");
 if (true) break;

case 63:
//C
this.state = 64;
RDebugUtils.currentLine=72417475;
 //BA.debugLineNum = 72417475;BA.debugLine="MCode.SaveUpdate(\"Insert Into TblLogVisitSefare";
parent.mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Insert Into TblLogVisitSefaresh (FldC_Ashkhas,FldVisit,FldSefaresh,FldElatSefaresh) Values ('"+parent.mostCurrent._mcode._c_tafzili /*String*/ +"','','"+_pdate+"','')");
 if (true) break;

case 64:
//C
this.state = 65;
;
RDebugUtils.currentLine=72417477;
 //BA.debugLineNum = 72417477;BA.debugLine="MCode.SaveUpdate(\"Update TblAshkhas Set FldLastS";
parent.mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Update TblAshkhas Set FldLastSefaresh = '"+_pdate+"' Where fldCodetafzili = '"+parent.mostCurrent._mcode._c_tafzili /*String*/ +"'");
RDebugUtils.currentLine=72417478;
 //BA.debugLineNum = 72417478;BA.debugLine="SaveLastVisit";
_savelastvisit();
 if (true) break;

case 65:
//C
this.state = 66;
;
RDebugUtils.currentLine=72417482;
 //BA.debugLineNum = 72417482;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=72417483;
 //BA.debugLineNum = 72417483;BA.debugLine="If MCode.FaktorSelect=\"\" Then";
if (true) break;

case 66:
//if
this.state = 71;
if ((parent.mostCurrent._mcode._faktorselect /*String*/ ).equals("")) { 
this.state = 68;
}else {
this.state = 70;
}if (true) break;

case 68:
//C
this.state = 71;
RDebugUtils.currentLine=72417484;
 //BA.debugLineNum = 72417484;BA.debugLine="ToastMessageShow(\"فاکتور شما ثبت گردید\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("فاکتور شما ثبت گردید"),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 70:
//C
this.state = 71;
RDebugUtils.currentLine=72417486;
 //BA.debugLineNum = 72417486;BA.debugLine="ToastMessageShow(\"فاکتور شما اصلاح گردید\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("فاکتور شما اصلاح گردید"),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 71:
//C
this.state = 74;
;
RDebugUtils.currentLine=72417489;
 //BA.debugLineNum = 72417489;BA.debugLine="MCode.FaktorSelect=\"\"";
parent.mostCurrent._mcode._faktorselect /*String*/  = "";
RDebugUtils.currentLine=72417491;
 //BA.debugLineNum = 72417491;BA.debugLine="Log(MCode.C_Tafzili)";
anywheresoftware.b4a.keywords.Common.LogImpl("572417491",parent.mostCurrent._mcode._c_tafzili /*String*/ ,0);
RDebugUtils.currentLine=72417492;
 //BA.debugLineNum = 72417492;BA.debugLine="StartActivity(Act_Profile)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._act_profile.getObject()));
 if (true) break;

case 73:
//C
this.state = 74;
this.catchState = 0;
RDebugUtils.currentLine=72417494;
 //BA.debugLineNum = 72417494;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("572417494",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=72417495;
 //BA.debugLineNum = 72417495;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
parent.mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(parent.mostCurrent._activity.getTitle())+"-SaveFaktor");
 if (true) break;
if (true) break;

case 74:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=72417497;
 //BA.debugLineNum = 72417497;BA.debugLine="End Sub";
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
public static String  _savemarjooii() throws Exception{
RDebugUtils.currentModule="act_sabad";
if (Debug.shouldDelegate(mostCurrent.activityBA, "savemarjooii", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "savemarjooii", null));}
RDebugUtils.currentLine=72744960;
 //BA.debugLineNum = 72744960;BA.debugLine="Sub SaveMarjooii";
RDebugUtils.currentLine=72744961;
 //BA.debugLineNum = 72744961;BA.debugLine="Try";
try {RDebugUtils.currentLine=72744962;
 //BA.debugLineNum = 72744962;BA.debugLine="MCode.SaveUpdate(\"Update TblSabad Set FldTozihat";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Update TblSabad Set FldTozihat = '' Where FldTozihat is null Or FldTozihat = ''");
RDebugUtils.currentLine=72744963;
 //BA.debugLineNum = 72744963;BA.debugLine="MCode.SaveUpdate(\"Update TblSabad Set FldTedadDar";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Update TblSabad Set FldTedadDarSabadKol = 0 Where FldTedadDarSabadKol is null Or FldTedadDarSabadKol = ''");
RDebugUtils.currentLine=72744991;
 //BA.debugLineNum = 72744991;BA.debugLine="SaveFaktor_Marjoee";
_savefaktor_marjoee();
 } 
       catch (Exception e6) {
			processBA.setLastException(e6);RDebugUtils.currentLine=72744993;
 //BA.debugLineNum = 72744993;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("572744993",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=72744994;
 //BA.debugLineNum = 72744994;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-SaveMarjooii");
 };
RDebugUtils.currentLine=72745000;
 //BA.debugLineNum = 72745000;BA.debugLine="End Sub";
return "";
}
public static String  _chamani_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="act_sabad";
if (Debug.shouldDelegate(mostCurrent.activityBA, "chamani_checkedchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "chamani_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=73138176;
 //BA.debugLineNum = 73138176;BA.debugLine="Private Sub chAmani_CheckedChange(Checked As Boole";
RDebugUtils.currentLine=73138177;
 //BA.debugLineNum = 73138177;BA.debugLine="If Checked Then";
if (_checked) { 
RDebugUtils.currentLine=73138178;
 //BA.debugLineNum = 73138178;BA.debugLine="MCode.isAmani=1";
mostCurrent._mcode._isamani /*String*/  = BA.NumberToString(1);
 }else {
RDebugUtils.currentLine=73138180;
 //BA.debugLineNum = 73138180;BA.debugLine="MCode.isAmani=0";
mostCurrent._mcode._isamani /*String*/  = BA.NumberToString(0);
 };
RDebugUtils.currentLine=73138182;
 //BA.debugLineNum = 73138182;BA.debugLine="End Sub";
return "";
}
public static String  _checksavefaktor() throws Exception{
RDebugUtils.currentModule="act_sabad";
if (Debug.shouldDelegate(mostCurrent.activityBA, "checksavefaktor", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "checksavefaktor", null));}
int _i = 0;
ir.parsikhesab.pakhsh.mcode._adapterlistkala _item = null;
RDebugUtils.currentLine=72351744;
 //BA.debugLineNum = 72351744;BA.debugLine="Sub CheckSaveFaktor";
RDebugUtils.currentLine=72351745;
 //BA.debugLineNum = 72351745;BA.debugLine="Try";
try {RDebugUtils.currentLine=72351746;
 //BA.debugLineNum = 72351746;BA.debugLine="If MCode.VoroodTozihKala = 1 Then";
if ((mostCurrent._mcode._voroodtozihkala /*String*/ ).equals(BA.NumberToString(1))) { 
RDebugUtils.currentLine=72351747;
 //BA.debugLineNum = 72351747;BA.debugLine="For i=0 To ListSabad.Size-1";
{
final int step3 = 1;
final int limit3 = (int) (mostCurrent._listsabad.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=72351748;
 //BA.debugLineNum = 72351748;BA.debugLine="Dim Item = ListSabad.Get(i) As AdapterListKala";
_item = (ir.parsikhesab.pakhsh.mcode._adapterlistkala)(mostCurrent._listsabad.Get(_i));
RDebugUtils.currentLine=72351749;
 //BA.debugLineNum = 72351749;BA.debugLine="If Item.Tozihat.Length = 0 Then";
if (_item.Tozihat /*String*/ .length()==0) { 
RDebugUtils.currentLine=72351750;
 //BA.debugLineNum = 72351750;BA.debugLine="Msgbox(\"توضیح کالا مربوط به \" & \"'\" & Item.Nam";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("توضیح کالا مربوط به "+"'"+_item.NameKala /*String*/ +"'"+" وارد نشده است."+anywheresoftware.b4a.keywords.Common.CRLF+"تا زمانی که توضیحات برای تمامی کالاهای انتخابی شما وارد نشده باشد اجازه ثبت فاکتور را ندارید"),BA.ObjectToCharSequence("توجه"),mostCurrent.activityBA);
RDebugUtils.currentLine=72351751;
 //BA.debugLineNum = 72351751;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=72351753;
 //BA.debugLineNum = 72351753;BA.debugLine="If Item.Tozihat = \"\" Then";
if ((_item.Tozihat /*String*/ ).equals("")) { 
RDebugUtils.currentLine=72351754;
 //BA.debugLineNum = 72351754;BA.debugLine="Msgbox(\"توضیح کالا مربوط به \" & \"'\" & Item.Nam";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("توضیح کالا مربوط به "+"'"+_item.NameKala /*String*/ +"'"+" وارد نشده است."+anywheresoftware.b4a.keywords.Common.CRLF+"تا زمانی که توضیحات برای تمامی کالاهای انتخابی شما وارد نشده باشد اجازه ثبت فاکتور را ندارید"),BA.ObjectToCharSequence("توجه"),mostCurrent.activityBA);
RDebugUtils.currentLine=72351755;
 //BA.debugLineNum = 72351755;BA.debugLine="Return";
if (true) return "";
 };
 }
};
 };
 } 
       catch (Exception e16) {
			processBA.setLastException(e16);RDebugUtils.currentLine=72351786;
 //BA.debugLineNum = 72351786;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("572351786",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=72351787;
 //BA.debugLineNum = 72351787;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-CheckSaveFaktor");
 };
RDebugUtils.currentLine=72351792;
 //BA.debugLineNum = 72351792;BA.debugLine="End Sub";
return "";
}
public static String  _cmbbox1_selectedindexchanged(int _index) throws Exception{
RDebugUtils.currentModule="act_sabad";
if (Debug.shouldDelegate(mostCurrent.activityBA, "cmbbox1_selectedindexchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "cmbbox1_selectedindexchanged", new Object[] {_index}));}
RDebugUtils.currentLine=72941568;
 //BA.debugLineNum = 72941568;BA.debugLine="Sub CmbBox1_SelectedIndexChanged (Index As Int)";
RDebugUtils.currentLine=72941569;
 //BA.debugLineNum = 72941569;BA.debugLine="Try";
try {RDebugUtils.currentLine=72941570;
 //BA.debugLineNum = 72941570;BA.debugLine="If Index=0 Then";
if (_index==0) { 
RDebugUtils.currentLine=72941571;
 //BA.debugLineNum = 72941571;BA.debugLine="ToastMessageShow(\"لطفا نوع تسویه را مشخص کنید\",F";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("لطفا نوع تسویه را مشخص کنید"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=72941572;
 //BA.debugLineNum = 72941572;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=72941574;
 //BA.debugLineNum = 72941574;BA.debugLine="MCode.feeTip=Index";
mostCurrent._mcode._feetip /*String*/  = BA.NumberToString(_index);
RDebugUtils.currentLine=72941575;
 //BA.debugLineNum = 72941575;BA.debugLine="MCode.UpdateNoeTasvieDarSabad(Index,Null)";
mostCurrent._mcode._updatenoetasviedarsabad /*String*/ (mostCurrent.activityBA,_index,(ir.parsikhesab.pakhsh.mcode._adapterlistkala)(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=72941578;
 //BA.debugLineNum = 72941578;BA.debugLine="Log(\"CmbBox1 Index: \" & Index)";
anywheresoftware.b4a.keywords.Common.LogImpl("572941578","CmbBox1 Index: "+BA.NumberToString(_index),0);
 } 
       catch (Exception e10) {
			processBA.setLastException(e10);RDebugUtils.currentLine=72941580;
 //BA.debugLineNum = 72941580;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("572941580",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=72941581;
 //BA.debugLineNum = 72941581;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-CmbBox1_SelectedIndexChanged");
 };
RDebugUtils.currentLine=72941583;
 //BA.debugLineNum = 72941583;BA.debugLine="End Sub";
return "";
}
public static void  _getlocation() throws Exception{
RDebugUtils.currentModule="act_sabad";
if (Debug.shouldDelegate(mostCurrent.activityBA, "getlocation", false))
	 {Debug.delegate(mostCurrent.activityBA, "getlocation", null); return;}
ResumableSub_GetLocation rsub = new ResumableSub_GetLocation(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_GetLocation extends BA.ResumableSub {
public ResumableSub_GetLocation(ir.parsikhesab.pakhsh.act_sabad parent) {
this.parent = parent;
}
ir.parsikhesab.pakhsh.act_sabad parent;
boolean _available = false;
igolub.fused.b4a.location.LocationResultWrapper _result = null;
igolub.fused.b4a.location.android.location.LocationFWrapper _lastlocation = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_sabad";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=72220673;
 //BA.debugLineNum = 72220673;BA.debugLine="If Fused.IsLocationEnabledInSettings Then";
if (true) break;

case 1:
//if
this.state = 20;
if (parent.mostCurrent._fused.getIsLocationEnabledInSettings()) { 
this.state = 3;
}else {
this.state = 19;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=72220674;
 //BA.debugLineNum = 72220674;BA.debugLine="Fused.GetLocationAvailability";
parent.mostCurrent._fused.GetLocationAvailability();
RDebugUtils.currentLine=72220676;
 //BA.debugLineNum = 72220676;BA.debugLine="Wait For FusedLocation_LocationAvailabilityReque";
anywheresoftware.b4a.keywords.Common.WaitFor("fusedlocation_locationavailabilityrequestcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_sabad", "getlocation"), null);
this.state = 21;
return;
case 21:
//C
this.state = 4;
_available = (Boolean) result[0];
;
RDebugUtils.currentLine=72220677;
 //BA.debugLineNum = 72220677;BA.debugLine="Log(\"LocationAvailable=\" & Available)";
anywheresoftware.b4a.keywords.Common.LogImpl("572220677","LocationAvailable="+BA.ObjectToString(_available),0);
RDebugUtils.currentLine=72220678;
 //BA.debugLineNum = 72220678;BA.debugLine="If Available Then";
if (true) break;

case 4:
//if
this.state = 17;
if (_available) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=72220679;
 //BA.debugLineNum = 72220679;BA.debugLine="Fused.GetLastLocation";
parent.mostCurrent._fused.GetLastLocation();
RDebugUtils.currentLine=72220680;
 //BA.debugLineNum = 72220680;BA.debugLine="Wait For FusedLocation_LocationRequestCompleted";
anywheresoftware.b4a.keywords.Common.WaitFor("fusedlocation_locationrequestcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_sabad", "getlocation"), null);
this.state = 22;
return;
case 22:
//C
this.state = 7;
_result = (igolub.fused.b4a.location.LocationResultWrapper) result[0];
;
RDebugUtils.currentLine=72220681;
 //BA.debugLineNum = 72220681;BA.debugLine="If Result.Status=LocationResult.STATUS_SUCCESSF";
if (true) break;

case 7:
//if
this.state = 16;
if (_result.getStatus()==parent.mostCurrent._locationresult.STATUS_SUCCESSFUL) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=72220682;
 //BA.debugLineNum = 72220682;BA.debugLine="If Result.Location.IsInitialized Then";
if (true) break;

case 10:
//if
this.state = 15;
if (_result.getLocation().IsInitialized()) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 15;
RDebugUtils.currentLine=72220683;
 //BA.debugLineNum = 72220683;BA.debugLine="Dim LastLocation As LocationF = Result.Locati";
_lastlocation = new igolub.fused.b4a.location.android.location.LocationFWrapper();
_lastlocation = _result.getLocation();
RDebugUtils.currentLine=72220684;
 //BA.debugLineNum = 72220684;BA.debugLine="Log(\"LastLocation Latitude = \" & LastLocation";
anywheresoftware.b4a.keywords.Common.LogImpl("572220684","LastLocation Latitude = "+BA.NumberToString(_lastlocation.getLatitude()),0);
RDebugUtils.currentLine=72220685;
 //BA.debugLineNum = 72220685;BA.debugLine="Log(\"LastLocation Longitude = \" & LastLocatio";
anywheresoftware.b4a.keywords.Common.LogImpl("572220685","LastLocation Longitude = "+BA.NumberToString(_lastlocation.getLongitude()),0);
RDebugUtils.currentLine=72220687;
 //BA.debugLineNum = 72220687;BA.debugLine="MCode.Lat = LastLocation.Latitude";
parent.mostCurrent._mcode._lat /*String*/  = BA.NumberToString(_lastlocation.getLatitude());
RDebugUtils.currentLine=72220688;
 //BA.debugLineNum = 72220688;BA.debugLine="MCode.Lon = LastLocation.Longitude";
parent.mostCurrent._mcode._lon /*String*/  = BA.NumberToString(_lastlocation.getLongitude());
 if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=72220691;
 //BA.debugLineNum = 72220691;BA.debugLine="Log(\"Unknown last location\")";
anywheresoftware.b4a.keywords.Common.LogImpl("572220691","Unknown last location",0);
 if (true) break;

case 15:
//C
this.state = 16;
;
 if (true) break;

case 16:
//C
this.state = 17;
;
 if (true) break;

case 17:
//C
this.state = 20;
;
 if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=72220696;
 //BA.debugLineNum = 72220696;BA.debugLine="MsgboxAsync(\"Location is turned off in devices's";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Location is turned off in devices's settings. Turn it on."),BA.ObjectToCharSequence("Warning"),processBA);
RDebugUtils.currentLine=72220697;
 //BA.debugLineNum = 72220697;BA.debugLine="StartActivity(Fused.LocationSettingsIntent)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._fused.getLocationSettingsIntent().getObject()));
 if (true) break;

case 20:
//C
this.state = -1;
;
RDebugUtils.currentLine=72220699;
 //BA.debugLineNum = 72220699;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static int  _hlv_getitemcount() throws Exception{
RDebugUtils.currentModule="act_sabad";
if (Debug.shouldDelegate(mostCurrent.activityBA, "hlv_getitemcount", false))
	 {return ((Integer) Debug.delegate(mostCurrent.activityBA, "hlv_getitemcount", null));}
RDebugUtils.currentLine=71630848;
 //BA.debugLineNum = 71630848;BA.debugLine="Sub HLV_GetItemCount As Int 								        '💯 It";
RDebugUtils.currentLine=71630849;
 //BA.debugLineNum = 71630849;BA.debugLine="Return ListSabad.Size";
if (true) return mostCurrent._listsabad.getSize();
RDebugUtils.currentLine=71630850;
 //BA.debugLineNum = 71630850;BA.debugLine="End Sub";
return 0;
}
public static String  _hlv_onbindviewholder(anywheresoftware.b4a.objects.PanelWrapper _parent,int _position) throws Exception{
RDebugUtils.currentModule="act_sabad";
if (Debug.shouldDelegate(mostCurrent.activityBA, "hlv_onbindviewholder", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "hlv_onbindviewholder", new Object[] {_parent,_position}));}
ir.parsikhesab.pakhsh.cls_recsabadkhariditem _rec = null;
RDebugUtils.currentLine=71761920;
 //BA.debugLineNum = 71761920;BA.debugLine="Sub HLV_onBindViewHolder (Parent As Panel, Positio";
RDebugUtils.currentLine=71761921;
 //BA.debugLineNum = 71761921;BA.debugLine="Dim rec As cls_RecSabadKharidItem=Parent.Tag";
_rec = (ir.parsikhesab.pakhsh.cls_recsabadkhariditem)(_parent.getTag());
RDebugUtils.currentLine=71761922;
 //BA.debugLineNum = 71761922;BA.debugLine="rec.show_data(ListSabad.Get(Position))";
_rec._show_data /*String*/ (null,(ir.parsikhesab.pakhsh.mcode._adapterlistkala)(mostCurrent._listsabad.Get(_position)));
RDebugUtils.currentLine=71761923;
 //BA.debugLineNum = 71761923;BA.debugLine="Parent.Height=rec.Height";
_parent.setHeight(_rec._getheight /*int*/ (null));
RDebugUtils.currentLine=71761924;
 //BA.debugLineNum = 71761924;BA.debugLine="End Sub";
return "";
}
public static String  _hlv_oncreateviewholder(anywheresoftware.b4a.objects.PanelWrapper _parent,int _viewtype) throws Exception{
RDebugUtils.currentModule="act_sabad";
if (Debug.shouldDelegate(mostCurrent.activityBA, "hlv_oncreateviewholder", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "hlv_oncreateviewholder", new Object[] {_parent,_viewtype}));}
ir.parsikhesab.pakhsh.cls_recsabadkhariditem _rec = null;
RDebugUtils.currentLine=71696384;
 //BA.debugLineNum = 71696384;BA.debugLine="Sub HLV_onCreateViewHolder (Parent As Panel, ViewT";
RDebugUtils.currentLine=71696385;
 //BA.debugLineNum = 71696385;BA.debugLine="Dim rec As cls_RecSabadKharidItem";
_rec = new ir.parsikhesab.pakhsh.cls_recsabadkhariditem();
RDebugUtils.currentLine=71696386;
 //BA.debugLineNum = 71696386;BA.debugLine="rec.Initialize(Me)";
_rec._initialize /*String*/ (null,mostCurrent.activityBA,act_sabad.getObject());
RDebugUtils.currentLine=71696387;
 //BA.debugLineNum = 71696387;BA.debugLine="Parent.AddView(rec.Panel,0,0,rec.Width,rec.Height";
_parent.AddView((android.view.View)(_rec._getpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ (null).getObject()),(int) (0),(int) (0),_rec._getwidth /*int*/ (null),_rec._getheight /*int*/ (null));
RDebugUtils.currentLine=71696388;
 //BA.debugLineNum = 71696388;BA.debugLine="Parent.Tag=rec";
_parent.setTag((Object)(_rec));
RDebugUtils.currentLine=71696389;
 //BA.debugLineNum = 71696389;BA.debugLine="End Sub";
return "";
}
public static String  _kasremojodi(String _ckala,int _tedad) throws Exception{
RDebugUtils.currentModule="act_sabad";
if (Debug.shouldDelegate(mostCurrent.activityBA, "kasremojodi", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "kasremojodi", new Object[] {_ckala,_tedad}));}
int _wuseanbarak = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
int _tedadmande = 0;
RDebugUtils.currentLine=72810496;
 //BA.debugLineNum = 72810496;BA.debugLine="Private Sub KasreMojodi(CKala As String,Tedad As I";
RDebugUtils.currentLine=72810497;
 //BA.debugLineNum = 72810497;BA.debugLine="Try";
try {RDebugUtils.currentLine=72810498;
 //BA.debugLineNum = 72810498;BA.debugLine="Dim WUseAnbarak As Int = myCode.getSetting(\"setti";
_wuseanbarak = (int)(Double.parseDouble(mostCurrent._mycode._getsetting /*String*/ (mostCurrent.activityBA,"setting.dat","WUseAnbarak",BA.NumberToString(0))));
RDebugUtils.currentLine=72810501;
 //BA.debugLineNum = 72810501;BA.debugLine="Dim cu As Cursor=MCode.Result(\"Select * from TblK";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * from TblKala Where FldCodeKala ='"+_ckala+"'");
RDebugUtils.currentLine=72810502;
 //BA.debugLineNum = 72810502;BA.debugLine="Dim tedadMande As Int=0";
_tedadmande = (int) (0);
RDebugUtils.currentLine=72810503;
 //BA.debugLineNum = 72810503;BA.debugLine="If cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=72810504;
 //BA.debugLineNum = 72810504;BA.debugLine="cu.Position=0";
_cu.setPosition((int) (0));
RDebugUtils.currentLine=72810505;
 //BA.debugLineNum = 72810505;BA.debugLine="If WUseAnbarak=0 Then";
if (_wuseanbarak==0) { 
RDebugUtils.currentLine=72810506;
 //BA.debugLineNum = 72810506;BA.debugLine="tedadMande=cu.GetString(\"SumMande\")";
_tedadmande = (int)(Double.parseDouble(_cu.GetString("SumMande")));
 }else {
RDebugUtils.currentLine=72810508;
 //BA.debugLineNum = 72810508;BA.debugLine="tedadMande=cu.GetString(\"SumMande\")";
_tedadmande = (int)(Double.parseDouble(_cu.GetString("SumMande")));
 };
RDebugUtils.currentLine=72810511;
 //BA.debugLineNum = 72810511;BA.debugLine="tedadMande=tedadMande-Tedad";
_tedadmande = (int) (_tedadmande-_tedad);
RDebugUtils.currentLine=72810512;
 //BA.debugLineNum = 72810512;BA.debugLine="MCode.SaveUpdate(\"Update TblKala SET SumMande='\"";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Update TblKala SET SumMande='"+BA.NumberToString(_tedadmande)+"' Where FldCodeKala ='"+_ckala+"'");
 };
 } 
       catch (Exception e16) {
			processBA.setLastException(e16);RDebugUtils.currentLine=72810515;
 //BA.debugLineNum = 72810515;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("572810515",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=72810516;
 //BA.debugLineNum = 72810516;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-KasreMojodi");
 };
RDebugUtils.currentLine=72810518;
 //BA.debugLineNum = 72810518;BA.debugLine="End Sub";
return "";
}
public static String  _lblexit_click() throws Exception{
RDebugUtils.currentModule="act_sabad";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lblexit_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lblexit_click", null));}
int _res = 0;
anywheresoftware.b4a.objects.LabelWrapper _lblexit = null;
ir.parsikhesab.pakhsh.mcode._adapterlistkala _item = null;
RDebugUtils.currentLine=71827456;
 //BA.debugLineNum = 71827456;BA.debugLine="Sub LblExit_Click";
RDebugUtils.currentLine=71827457;
 //BA.debugLineNum = 71827457;BA.debugLine="Try";
try {RDebugUtils.currentLine=71827458;
 //BA.debugLineNum = 71827458;BA.debugLine="Dim Res As Int";
_res = 0;
RDebugUtils.currentLine=71827459;
 //BA.debugLineNum = 71827459;BA.debugLine="Dim LblExit As Label = Sender";
_lblexit = new anywheresoftware.b4a.objects.LabelWrapper();
_lblexit = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA)));
RDebugUtils.currentLine=71827461;
 //BA.debugLineNum = 71827461;BA.debugLine="Dim Item = ListSabad.Get(LblExit.Tag) As AdapterL";
_item = (ir.parsikhesab.pakhsh.mcode._adapterlistkala)(mostCurrent._listsabad.Get((int)(BA.ObjectToNumber(_lblexit.getTag()))));
RDebugUtils.currentLine=71827462;
 //BA.debugLineNum = 71827462;BA.debugLine="Res=Msgbox2(\"آیا می خواهید این ردیف حذف گردد؟\",\"ت";
_res = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("آیا می خواهید این ردیف حذف گردد؟"),BA.ObjectToCharSequence("توجه"),"بله","","خیر",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=71827463;
 //BA.debugLineNum = 71827463;BA.debugLine="If Res=DialogResponse.POSITIVE Then";
if (_res==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=71827464;
 //BA.debugLineNum = 71827464;BA.debugLine="MCode.SaveUpdate(\"Delete From TblSabad Where Fld";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Delete From TblSabad Where FldCodeKala = '"+_item.CodeKala /*String*/ +"'");
RDebugUtils.currentLine=71827465;
 //BA.debugLineNum = 71827465;BA.debugLine="ListSabad.RemoveAt(LblExit.Tag)";
mostCurrent._listsabad.RemoveAt((int)(BA.ObjectToNumber(_lblexit.getTag())));
RDebugUtils.currentLine=71827466;
 //BA.debugLineNum = 71827466;BA.debugLine="HLV.notifyItemRemoved(LblExit.Tag)";
mostCurrent._hlv.notifyItemRemoved((int)(BA.ObjectToNumber(_lblexit.getTag())));
RDebugUtils.currentLine=71827467;
 //BA.debugLineNum = 71827467;BA.debugLine="HLV.notifyDataSetChanged";
mostCurrent._hlv.notifyDataSetChanged();
RDebugUtils.currentLine=71827470;
 //BA.debugLineNum = 71827470;BA.debugLine="UpdateSumSabad";
_updatesumsabad();
 };
 } 
       catch (Exception e14) {
			processBA.setLastException(e14);RDebugUtils.currentLine=71827473;
 //BA.debugLineNum = 71827473;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("571827473",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=71827474;
 //BA.debugLineNum = 71827474;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-LblExit_Click");
 };
RDebugUtils.currentLine=71827476;
 //BA.debugLineNum = 71827476;BA.debugLine="End Sub";
return "";
}
public static void  _lbltedadjoz_click(ir.parsikhesab.pakhsh.mcode._adapterlistkala _item) throws Exception{
RDebugUtils.currentModule="act_sabad";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lbltedadjoz_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "lbltedadjoz_click", new Object[] {_item}); return;}
ResumableSub_LblTedadJoz_Click rsub = new ResumableSub_LblTedadJoz_Click(null,_item);
rsub.resume(processBA, null);
}
public static class ResumableSub_LblTedadJoz_Click extends BA.ResumableSub {
public ResumableSub_LblTedadJoz_Click(ir.parsikhesab.pakhsh.act_sabad parent,ir.parsikhesab.pakhsh.mcode._adapterlistkala _item) {
this.parent = parent;
this._item = _item;
}
ir.parsikhesab.pakhsh.act_sabad parent;
ir.parsikhesab.pakhsh.mcode._adapterlistkala _item;
ir.parsikhesab.pakhsh.b4xinputtemplate _input = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rs = null;
int _result = 0;
float _res = 0f;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_sabad";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=73203713;
 //BA.debugLineNum = 73203713;BA.debugLine="Dialog.Title = \"  \"";
parent.mostCurrent._dialog._title /*Object*/  = (Object)("  ");
RDebugUtils.currentLine=73203714;
 //BA.debugLineNum = 73203714;BA.debugLine="Dim input As B4XInputTemplate";
_input = new ir.parsikhesab.pakhsh.b4xinputtemplate();
RDebugUtils.currentLine=73203715;
 //BA.debugLineNum = 73203715;BA.debugLine="input.Initialize";
_input._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=73203716;
 //BA.debugLineNum = 73203716;BA.debugLine="input.lblTitle.Text = \" تعداد \"&Item.NameVahed";
_input._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(" تعداد "+_item.NameVahed /*String*/ ));
RDebugUtils.currentLine=73203717;
 //BA.debugLineNum = 73203717;BA.debugLine="Log(MCode.isFloat)";
anywheresoftware.b4a.keywords.Common.LogImpl("573203717",BA.ObjectToString(parent.mostCurrent._mcode._isfloat /*boolean*/ ),0);
RDebugUtils.currentLine=73203718;
 //BA.debugLineNum = 73203718;BA.debugLine="MCode.isFloat = True";
parent.mostCurrent._mcode._isfloat /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=73203719;
 //BA.debugLineNum = 73203719;BA.debugLine="Select Case MCode.isFloat";
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
RDebugUtils.currentLine=73203721;
 //BA.debugLineNum = 73203721;BA.debugLine="input.ConfigureForNumbers(True, True)";
_input._configurefornumbers /*String*/ (null,anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=73203723;
 //BA.debugLineNum = 73203723;BA.debugLine="input.ConfigureForNumbers(False, True)";
_input._configurefornumbers /*String*/ (null,anywheresoftware.b4a.keywords.Common.False,anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=73203726;
 //BA.debugLineNum = 73203726;BA.debugLine="Dim rs As ResumableSub =Dialog.ShowTemplate(input";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = parent.mostCurrent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_input),(Object)("OK"),(Object)(""),(Object)("CANCEL"));
RDebugUtils.currentLine=73203727;
 //BA.debugLineNum = 73203727;BA.debugLine="Dialog.Base.Top = 50%y - Dialog.Base.Height / 2";
parent.mostCurrent._dialog._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTop((int) (anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (50),mostCurrent.activityBA)-parent.mostCurrent._dialog._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2));
RDebugUtils.currentLine=73203728;
 //BA.debugLineNum = 73203728;BA.debugLine="Wait For (rs) Complete (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_sabad", "lbltedadjoz_click"), _rs);
this.state = 27;
return;
case 27:
//C
this.state = 7;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=73203729;
 //BA.debugLineNum = 73203729;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=73203730;
 //BA.debugLineNum = 73203730;BA.debugLine="Dim res As Float = input.Text 'no need to check";
_res = (float)(Double.parseDouble(_input._text /*String*/ ));
RDebugUtils.currentLine=73203731;
 //BA.debugLineNum = 73203731;BA.debugLine="If res>=0 Then";
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
RDebugUtils.currentLine=73203732;
 //BA.debugLineNum = 73203732;BA.debugLine="If MCode.ForooshBishAzMojoodi = \"1\" Then";
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
RDebugUtils.currentLine=73203733;
 //BA.debugLineNum = 73203733;BA.debugLine="Item.SumMande = Item.SumMande - (res-Item.Teda";
_item.SumMande /*String*/  = BA.NumberToString((double)(Double.parseDouble(_item.SumMande /*String*/ ))-(_res-(double)(Double.parseDouble(_item.TedadDarSabadJoz /*String*/ ))));
RDebugUtils.currentLine=73203734;
 //BA.debugLineNum = 73203734;BA.debugLine="Item.TedadDarSabadJoz = res";
_item.TedadDarSabadJoz /*String*/  = BA.NumberToString(_res);
RDebugUtils.currentLine=73203735;
 //BA.debugLineNum = 73203735;BA.debugLine="AddToSabad(Item)";
_addtosabad(_item);
 if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=73203737;
 //BA.debugLineNum = 73203737;BA.debugLine="If (Item.SumMande + Item.TedadDarSabadJoz) >=";
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
RDebugUtils.currentLine=73203738;
 //BA.debugLineNum = 73203738;BA.debugLine="Item.SumMande = Item.SumMande - (res-Item.Ted";
_item.SumMande /*String*/  = BA.NumberToString((double)(Double.parseDouble(_item.SumMande /*String*/ ))-(_res-(double)(Double.parseDouble(_item.TedadDarSabadJoz /*String*/ ))));
RDebugUtils.currentLine=73203739;
 //BA.debugLineNum = 73203739;BA.debugLine="Item.TedadDarSabadJoz = res";
_item.TedadDarSabadJoz /*String*/  = BA.NumberToString(_res);
RDebugUtils.currentLine=73203740;
 //BA.debugLineNum = 73203740;BA.debugLine="AddToSabad(Item)";
_addtosabad(_item);
 if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=73203742;
 //BA.debugLineNum = 73203742;BA.debugLine="ToastMessageShow(\"سفارش شما بیشتر از موجودی م";
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
RDebugUtils.currentLine=73203746;
 //BA.debugLineNum = 73203746;BA.debugLine="HLV.notifyDataSetChanged";
parent.mostCurrent._hlv.notifyDataSetChanged();
 if (true) break;

case 26:
//C
this.state = -1;
;
RDebugUtils.currentLine=73203749;
 //BA.debugLineNum = 73203749;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _lbltedadkol_click(ir.parsikhesab.pakhsh.mcode._adapterlistkala _item) throws Exception{
RDebugUtils.currentModule="act_sabad";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lbltedadkol_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "lbltedadkol_click", new Object[] {_item}); return;}
ResumableSub_LblTedadkol_Click rsub = new ResumableSub_LblTedadkol_Click(null,_item);
rsub.resume(processBA, null);
}
public static class ResumableSub_LblTedadkol_Click extends BA.ResumableSub {
public ResumableSub_LblTedadkol_Click(ir.parsikhesab.pakhsh.act_sabad parent,ir.parsikhesab.pakhsh.mcode._adapterlistkala _item) {
this.parent = parent;
this._item = _item;
}
ir.parsikhesab.pakhsh.act_sabad parent;
ir.parsikhesab.pakhsh.mcode._adapterlistkala _item;
ir.parsikhesab.pakhsh.b4xinputtemplate _input = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rs = null;
int _result = 0;
float _res = 0f;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_sabad";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=73269249;
 //BA.debugLineNum = 73269249;BA.debugLine="Dialog.Title = \"  \"";
parent.mostCurrent._dialog._title /*Object*/  = (Object)("  ");
RDebugUtils.currentLine=73269250;
 //BA.debugLineNum = 73269250;BA.debugLine="Dim input As B4XInputTemplate";
_input = new ir.parsikhesab.pakhsh.b4xinputtemplate();
RDebugUtils.currentLine=73269251;
 //BA.debugLineNum = 73269251;BA.debugLine="input.Initialize";
_input._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=73269252;
 //BA.debugLineNum = 73269252;BA.debugLine="input.lblTitle.Text = \" تعداد \"&Item.NameVahed2";
_input._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(" تعداد "+_item.NameVahed2 /*String*/ ));
RDebugUtils.currentLine=73269253;
 //BA.debugLineNum = 73269253;BA.debugLine="input.ConfigureForNumbers(True, True)";
_input._configurefornumbers /*String*/ (null,anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=73269255;
 //BA.debugLineNum = 73269255;BA.debugLine="Dim rs As ResumableSub =Dialog.ShowTemplate(input";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = parent.mostCurrent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_input),(Object)("OK"),(Object)(""),(Object)("CANCEL"));
RDebugUtils.currentLine=73269256;
 //BA.debugLineNum = 73269256;BA.debugLine="Dialog.Base.Top = 50%y - Dialog.Base.Height / 2";
parent.mostCurrent._dialog._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTop((int) (anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (50),mostCurrent.activityBA)-parent.mostCurrent._dialog._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2));
RDebugUtils.currentLine=73269257;
 //BA.debugLineNum = 73269257;BA.debugLine="Wait For (rs) Complete (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_sabad", "lbltedadkol_click"), _rs);
this.state = 21;
return;
case 21:
//C
this.state = 1;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=73269258;
 //BA.debugLineNum = 73269258;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=73269259;
 //BA.debugLineNum = 73269259;BA.debugLine="Dim res As Float = input.Text 'no need to check";
_res = (float)(Double.parseDouble(_input._text /*String*/ ));
RDebugUtils.currentLine=73269260;
 //BA.debugLineNum = 73269260;BA.debugLine="If res>=0 Then";
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
RDebugUtils.currentLine=73269261;
 //BA.debugLineNum = 73269261;BA.debugLine="If MCode.ForooshBishAzMojoodi = \"1\" Then";
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
RDebugUtils.currentLine=73269262;
 //BA.debugLineNum = 73269262;BA.debugLine="Item.SumMande = Item.SumMande - ((res*Item.Ted";
_item.SumMande /*String*/  = BA.NumberToString((double)(Double.parseDouble(_item.SumMande /*String*/ ))-((_res*(double)(Double.parseDouble(_item.TedadDarKarton /*String*/ )))-((double)(Double.parseDouble(_item.TedadDarSabadKol /*String*/ ))*(double)(Double.parseDouble(_item.TedadDarKarton /*String*/ )))));
RDebugUtils.currentLine=73269263;
 //BA.debugLineNum = 73269263;BA.debugLine="Item.TedadDarSabadKol = res";
_item.TedadDarSabadKol /*String*/  = BA.NumberToString(_res);
RDebugUtils.currentLine=73269264;
 //BA.debugLineNum = 73269264;BA.debugLine="AddToSabad(Item)";
_addtosabad(_item);
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=73269266;
 //BA.debugLineNum = 73269266;BA.debugLine="If (Item.SumMande + (Item.TedadDarSabadKol*Ite";
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
RDebugUtils.currentLine=73269267;
 //BA.debugLineNum = 73269267;BA.debugLine="Item.SumMande = Item.SumMande - ((res*Item.Te";
_item.SumMande /*String*/  = BA.NumberToString((double)(Double.parseDouble(_item.SumMande /*String*/ ))-((_res*(double)(Double.parseDouble(_item.TedadDarKarton /*String*/ )))-((double)(Double.parseDouble(_item.TedadDarSabadKol /*String*/ ))*(double)(Double.parseDouble(_item.TedadDarKarton /*String*/ )))));
RDebugUtils.currentLine=73269268;
 //BA.debugLineNum = 73269268;BA.debugLine="Item.TedadDarSabadKol = res";
_item.TedadDarSabadKol /*String*/  = BA.NumberToString(_res);
RDebugUtils.currentLine=73269269;
 //BA.debugLineNum = 73269269;BA.debugLine="AddToSabad(Item)";
_addtosabad(_item);
 if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=73269271;
 //BA.debugLineNum = 73269271;BA.debugLine="ToastMessageShow(\"سفارش شما بیشتر از موجودی م";
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
RDebugUtils.currentLine=73269275;
 //BA.debugLineNum = 73269275;BA.debugLine="HLV.notifyDataSetChanged";
parent.mostCurrent._hlv.notifyDataSetChanged();
 if (true) break;

case 20:
//C
this.state = -1;
;
RDebugUtils.currentLine=73269277;
 //BA.debugLineNum = 73269277;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _savechange() throws Exception{
RDebugUtils.currentModule="act_sabad";
if (Debug.shouldDelegate(mostCurrent.activityBA, "savechange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "savechange", null));}
RDebugUtils.currentLine=71958528;
 //BA.debugLineNum = 71958528;BA.debugLine="Sub SaveChange";
RDebugUtils.currentLine=71958529;
 //BA.debugLineNum = 71958529;BA.debugLine="HLV.notifyDataSetChanged";
mostCurrent._hlv.notifyDataSetChanged();
RDebugUtils.currentLine=71958530;
 //BA.debugLineNum = 71958530;BA.debugLine="UpdateSumSabad";
_updatesumsabad();
RDebugUtils.currentLine=71958531;
 //BA.debugLineNum = 71958531;BA.debugLine="End Sub";
return "";
}
public static String  _savelastvisit() throws Exception{
RDebugUtils.currentModule="act_sabad";
if (Debug.shouldDelegate(mostCurrent.activityBA, "savelastvisit", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "savelastvisit", null));}
String _dateshamsi = "";
String _time = "";
String _d = "";
int _count = 0;
int _maxradif = 0;
RDebugUtils.currentLine=72482816;
 //BA.debugLineNum = 72482816;BA.debugLine="Sub SaveLastVisit";
RDebugUtils.currentLine=72482817;
 //BA.debugLineNum = 72482817;BA.debugLine="Try";
try {RDebugUtils.currentLine=72482819;
 //BA.debugLineNum = 72482819;BA.debugLine="DateTime.DateFormat=\"yyyy-MM-dd\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=72482821;
 //BA.debugLineNum = 72482821;BA.debugLine="Dim DateShamsi As String = MCode.DatePersian";
_dateshamsi = mostCurrent._mcode._datepersian /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=72482822;
 //BA.debugLineNum = 72482822;BA.debugLine="Dim Time As String = DateTime.Time(DateTime.Now)";
_time = anywheresoftware.b4a.keywords.Common.DateTime.Time(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
RDebugUtils.currentLine=72482824;
 //BA.debugLineNum = 72482824;BA.debugLine="Dim D As String = DateShamsi & \"T\" & Time";
_d = _dateshamsi+"T"+_time;
RDebugUtils.currentLine=72482825;
 //BA.debugLineNum = 72482825;BA.debugLine="LogColor(\"D: \" & D,Colors.Red)";
anywheresoftware.b4a.keywords.Common.LogImpl("572482825","D: "+_d,anywheresoftware.b4a.keywords.Common.Colors.Red);
RDebugUtils.currentLine=72482827;
 //BA.debugLineNum = 72482827;BA.debugLine="MCode.SaveUpdate(\"Update TblAshkhas Set lastOrde";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Update TblAshkhas Set lastOrderDate = '"+_d+"'  Where fldCodetafzili = '"+mostCurrent._mcode._c_tafzili /*String*/ +"'");
RDebugUtils.currentLine=72482829;
 //BA.debugLineNum = 72482829;BA.debugLine="If MCode.TourVisitSW And MCode.TourVisit=1 Then";
if (mostCurrent._mcode._tourvisitsw /*boolean*/  && (mostCurrent._mcode._tourvisit /*String*/ ).equals(BA.NumberToString(1))) { 
RDebugUtils.currentLine=72482830;
 //BA.debugLineNum = 72482830;BA.debugLine="MCode.SaveUpdate(\"Update tblTourVisitor Set fld";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Update tblTourVisitor Set fldTimeSefaresh = '"+_time+"',fldShomareSefaresh='"+mostCurrent._shomaresefaresh+"',fldVaziat='3',fldSend='False' Where fldCodeTafzili = '"+mostCurrent._mcode._c_tafzili /*String*/ +"' and fldDateVisit='"+mostCurrent._mcode._datepersian /*String*/ (mostCurrent.activityBA)+"' and fldType='Tour'");
 }else {
RDebugUtils.currentLine=72482832;
 //BA.debugLineNum = 72482832;BA.debugLine="Dim Count As Int = MCode.SingleResult($\"Select";
_count = (int)(BA.ObjectToNumber(mostCurrent._mcode._singleresult /*Object*/ (mostCurrent.activityBA,("Select Count(fldRadif) from tblTourVisitor where  fldDateVisit='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._mcode._datepersian /*String*/ (mostCurrent.activityBA)))+"' and fldType='Free'"))));
RDebugUtils.currentLine=72482833;
 //BA.debugLineNum = 72482833;BA.debugLine="Dim MaxRadif As Int";
_maxradif = 0;
RDebugUtils.currentLine=72482834;
 //BA.debugLineNum = 72482834;BA.debugLine="If Count=0 Then";
if (_count==0) { 
RDebugUtils.currentLine=72482835;
 //BA.debugLineNum = 72482835;BA.debugLine="MaxRadif=1";
_maxradif = (int) (1);
 }else {
RDebugUtils.currentLine=72482837;
 //BA.debugLineNum = 72482837;BA.debugLine="MaxRadif= MCode.SingleResult($\"Select Max(fldR";
_maxradif = (int)(BA.ObjectToNumber(mostCurrent._mcode._singleresult /*Object*/ (mostCurrent.activityBA,("Select Max(fldRadif) from tblTourVisitor where  fldDateVisit='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._mcode._datepersian /*String*/ (mostCurrent.activityBA)))+"' and fldType='Free'"))));
 };
RDebugUtils.currentLine=72482841;
 //BA.debugLineNum = 72482841;BA.debugLine="MCode.SaveUpdate(\"Update tblTourVisitor Set fld";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Update tblTourVisitor Set fldTimeSefaresh = '"+_time+"',fldShomareSefaresh='"+mostCurrent._shomaresefaresh+"',fldVaziat='3',fldSend='False' Where fldCodeTafzili = '"+mostCurrent._mcode._c_tafzili /*String*/ +"' and fldDateVisit='"+mostCurrent._mcode._datepersian /*String*/ (mostCurrent.activityBA)+"' and fldType='Free' and fldRadif="+BA.NumberToString(_maxradif));
 };
 } 
       catch (Exception e21) {
			processBA.setLastException(e21);RDebugUtils.currentLine=72482845;
 //BA.debugLineNum = 72482845;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("572482845",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=72482846;
 //BA.debugLineNum = 72482846;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-SaveLastVisit");
 };
RDebugUtils.currentLine=72482848;
 //BA.debugLineNum = 72482848;BA.debugLine="End Sub";
return "";
}
public static String  _savefaktor_marjoee() throws Exception{
RDebugUtils.currentModule="act_sabad";
if (Debug.shouldDelegate(mostCurrent.activityBA, "savefaktor_marjoee", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "savefaktor_marjoee", null));}
int _shomarefaktor = 0;
int _shomarebargasht = 0;
String _imagesignature = "";
String _pdate = "";
String _time = "";
String _dt = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
long _sum = 0L;
long _totalfaktor = 0L;
long _summablaghtakhfifvizhe = 0L;
long _summablaghtakhfifkala = 0L;
long _mablaghtakhfifkol = 0L;
long _mablagharzeshafzode = 0L;
anywheresoftware.b4a.objects.collections.List _lst = null;
int _i = 0;
ir.parsikhesab.pakhsh.mcode._adapterlistkala _item = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=72679424;
 //BA.debugLineNum = 72679424;BA.debugLine="Sub SaveFaktor_Marjoee";
RDebugUtils.currentLine=72679425;
 //BA.debugLineNum = 72679425;BA.debugLine="Try";
try {RDebugUtils.currentLine=72679427;
 //BA.debugLineNum = 72679427;BA.debugLine="Dim ShomareFaktor As Int";
_shomarefaktor = 0;
RDebugUtils.currentLine=72679428;
 //BA.debugLineNum = 72679428;BA.debugLine="Dim ShomareBargasht As Int";
_shomarebargasht = 0;
RDebugUtils.currentLine=72679429;
 //BA.debugLineNum = 72679429;BA.debugLine="Dim ImageSignature As String";
_imagesignature = "";
RDebugUtils.currentLine=72679432;
 //BA.debugLineNum = 72679432;BA.debugLine="Dim pDate As String =  MCode.ConvertNumbersPersi";
_pdate = mostCurrent._mcode._convertnumberspersian2english /*String*/ (mostCurrent.activityBA,mostCurrent._mcode._datepersian /*String*/ (mostCurrent.activityBA));
RDebugUtils.currentLine=72679433;
 //BA.debugLineNum = 72679433;BA.debugLine="Dim Time As String = MCode.ConvertNumbersPersian2";
_time = mostCurrent._mcode._convertnumberspersian2english /*String*/ (mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.DateTime.Time(anywheresoftware.b4a.keywords.Common.DateTime.getNow()));
RDebugUtils.currentLine=72679437;
 //BA.debugLineNum = 72679437;BA.debugLine="Dim DT As String=TxtSharhFaktor.text &\" (\"&pDate";
_dt = mostCurrent._txtsharhfaktor.getText()+" ("+_pdate+"-"+_time+") ";
RDebugUtils.currentLine=72679438;
 //BA.debugLineNum = 72679438;BA.debugLine="Log(\"->>\"&DT)";
anywheresoftware.b4a.keywords.Common.LogImpl("572679438","->>"+_dt,0);
RDebugUtils.currentLine=72679439;
 //BA.debugLineNum = 72679439;BA.debugLine="If MCode.FaktorSelect = \"\" Then";
if ((mostCurrent._mcode._faktorselect /*String*/ ).equals("")) { 
RDebugUtils.currentLine=72679440;
 //BA.debugLineNum = 72679440;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select Max(Cast";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select Max(Cast(FldShomareFaktor As Int)) As MaxFldShomareFaktor From TblFaktor");
RDebugUtils.currentLine=72679441;
 //BA.debugLineNum = 72679441;BA.debugLine="Cu.Position=0";
_cu.setPosition((int) (0));
RDebugUtils.currentLine=72679442;
 //BA.debugLineNum = 72679442;BA.debugLine="If Cu.GetString(\"MaxFldShomareFaktor\") = Null Th";
if (_cu.GetString("MaxFldShomareFaktor")== null) { 
RDebugUtils.currentLine=72679443;
 //BA.debugLineNum = 72679443;BA.debugLine="ShomareFaktor = 1";
_shomarefaktor = (int) (1);
 }else {
RDebugUtils.currentLine=72679445;
 //BA.debugLineNum = 72679445;BA.debugLine="ShomareFaktor = Cu.GetString(\"MaxFldShomareFakt";
_shomarefaktor = (int) ((double)(Double.parseDouble(_cu.GetString("MaxFldShomareFaktor")))+1);
 };
 }else {
RDebugUtils.currentLine=72679448;
 //BA.debugLineNum = 72679448;BA.debugLine="ShomareFaktor = MCode.FaktorSelect";
_shomarefaktor = (int)(Double.parseDouble(mostCurrent._mcode._faktorselect /*String*/ ));
 };
RDebugUtils.currentLine=72679450;
 //BA.debugLineNum = 72679450;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select Max(Cast(";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select Max(Cast(FldShomareBargasht As Int)) As MaxFldShomareBargasht From TblFaktor");
RDebugUtils.currentLine=72679451;
 //BA.debugLineNum = 72679451;BA.debugLine="Cu.Position=0";
_cu.setPosition((int) (0));
RDebugUtils.currentLine=72679452;
 //BA.debugLineNum = 72679452;BA.debugLine="If Cu.GetString(\"MaxFldShomareBargasht\") = Null T";
if (_cu.GetString("MaxFldShomareBargasht")== null) { 
RDebugUtils.currentLine=72679453;
 //BA.debugLineNum = 72679453;BA.debugLine="ShomareBargasht = 1";
_shomarebargasht = (int) (1);
 }else {
RDebugUtils.currentLine=72679455;
 //BA.debugLineNum = 72679455;BA.debugLine="ShomareBargasht = Cu.GetString(\"MaxFldShomareBar";
_shomarebargasht = (int) ((double)(Double.parseDouble(_cu.GetString("MaxFldShomareBargasht")))+1);
 };
RDebugUtils.currentLine=72679458;
 //BA.debugLineNum = 72679458;BA.debugLine="If TxtSharhFaktor.Text.Trim = \"\" Then TxtSharhFak";
if ((mostCurrent._txtsharhfaktor.getText().trim()).equals("")) { 
mostCurrent._txtsharhfaktor.setText(BA.ObjectToCharSequence(""));};
RDebugUtils.currentLine=72679460;
 //BA.debugLineNum = 72679460;BA.debugLine="If MCode.FaktorSelect <> \"\" Then";
if ((mostCurrent._mcode._faktorselect /*String*/ ).equals("") == false) { 
RDebugUtils.currentLine=72679461;
 //BA.debugLineNum = 72679461;BA.debugLine="MCode.SaveUpdate(\"Delete From TblFaktor Where Fl";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Delete From TblFaktor Where FldShomareFaktor = '"+mostCurrent._mcode._faktorselect /*String*/ +"'");
 };
RDebugUtils.currentLine=72679464;
 //BA.debugLineNum = 72679464;BA.debugLine="Dim Sum As Long = MCode.FinalFaktor.KhamFaktor";
_sum = (long)(Double.parseDouble(mostCurrent._mcode._finalfaktor /*ir.parsikhesab.pakhsh.mcode._finalfaktor_*/ .KhamFaktor /*String*/ ));
RDebugUtils.currentLine=72679465;
 //BA.debugLineNum = 72679465;BA.debugLine="Dim TotalFaktor As Long = Sum";
_totalfaktor = _sum;
RDebugUtils.currentLine=72679466;
 //BA.debugLineNum = 72679466;BA.debugLine="Dim SumMablaghTakhfifVizhe As Long=MCode.FinalFa";
_summablaghtakhfifvizhe = (long)(Double.parseDouble(mostCurrent._mcode._finalfaktor /*ir.parsikhesab.pakhsh.mcode._finalfaktor_*/ .TakhfifVizhe /*String*/ ));
RDebugUtils.currentLine=72679467;
 //BA.debugLineNum = 72679467;BA.debugLine="Dim SumMablaghTakhfifKala As Long=MCode.FinalFak";
_summablaghtakhfifkala = (long)(Double.parseDouble(mostCurrent._mcode._finalfaktor /*ir.parsikhesab.pakhsh.mcode._finalfaktor_*/ .TakhfifKala /*String*/ ));
RDebugUtils.currentLine=72679468;
 //BA.debugLineNum = 72679468;BA.debugLine="Dim MablaghTakhfifKol As Long=SumMablaghTakhfifK";
_mablaghtakhfifkol = (long) (_summablaghtakhfifkala+_summablaghtakhfifvizhe);
RDebugUtils.currentLine=72679469;
 //BA.debugLineNum = 72679469;BA.debugLine="Dim MablaghArzeshAfzode As Long=MCode.MohasbeArz";
_mablagharzeshafzode = mostCurrent._mcode._mohasbearzeshafzode /*long*/ (mostCurrent.activityBA,_totalfaktor);
RDebugUtils.currentLine=72679471;
 //BA.debugLineNum = 72679471;BA.debugLine="If MCode.Signature = 1 Or ImageSignature<>\"\" Then";
if ((mostCurrent._mcode._signature /*String*/ ).equals(BA.NumberToString(1)) || (_imagesignature).equals("") == false) { 
RDebugUtils.currentLine=72679472;
 //BA.debugLineNum = 72679472;BA.debugLine="ImageSignature = MCode.Encrypted(MCode.ConvertBl";
_imagesignature = mostCurrent._mcode._encrypted /*String*/ (mostCurrent.activityBA,mostCurrent._mcode._convertblobtostring /*String*/ (mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal()+"/parsik/Signature",mostCurrent._mcode._codemoshtari /*String*/ +".png"));
 }else {
RDebugUtils.currentLine=72679474;
 //BA.debugLineNum = 72679474;BA.debugLine="ImageSignature = \"\"";
_imagesignature = "";
 };
RDebugUtils.currentLine=72679477;
 //BA.debugLineNum = 72679477;BA.debugLine="Dim lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=72679478;
 //BA.debugLineNum = 72679478;BA.debugLine="lst.Initialize";
_lst.Initialize();
RDebugUtils.currentLine=72679479;
 //BA.debugLineNum = 72679479;BA.debugLine="For i=0 To OriginalItemList.Size-1";
{
final int step44 = 1;
final int limit44 = (int) (mostCurrent._originalitemlist.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit44 ;_i = _i + step44 ) {
RDebugUtils.currentLine=72679480;
 //BA.debugLineNum = 72679480;BA.debugLine="Dim Item = OriginalItemList.Get(i) As AdapterList";
_item = (ir.parsikhesab.pakhsh.mcode._adapterlistkala)(mostCurrent._originalitemlist.Get(_i));
RDebugUtils.currentLine=72679481;
 //BA.debugLineNum = 72679481;BA.debugLine="If Item.TedadDarSabadJoz>0 Or Item.TedadDarSabadK";
if ((double)(Double.parseDouble(_item.TedadDarSabadJoz /*String*/ ))>0 || (double)(Double.parseDouble(_item.TedadDarSabadKol /*String*/ ))>0) { 
RDebugUtils.currentLine=72679483;
 //BA.debugLineNum = 72679483;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=72679484;
 //BA.debugLineNum = 72679484;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=72679485;
 //BA.debugLineNum = 72679485;BA.debugLine="m.Put(\"FldRadif\",i+1)";
_m.Put((Object)("FldRadif"),(Object)(_i+1));
RDebugUtils.currentLine=72679486;
 //BA.debugLineNum = 72679486;BA.debugLine="m.Put(\"FldC_Visitor\",MCode.C_Visitor)";
_m.Put((Object)("FldC_Visitor"),(Object)(mostCurrent._mcode._c_visitor /*String*/ ));
RDebugUtils.currentLine=72679487;
 //BA.debugLineNum = 72679487;BA.debugLine="m.Put(\"FldC_Tafzili\",MCode.C_Tafzili)";
_m.Put((Object)("FldC_Tafzili"),(Object)(mostCurrent._mcode._c_tafzili /*String*/ ));
RDebugUtils.currentLine=72679488;
 //BA.debugLineNum = 72679488;BA.debugLine="m.Put(\"FldN_Tafzili\",MCode.N_Tafzili)";
_m.Put((Object)("FldN_Tafzili"),(Object)(mostCurrent._mcode._n_tafzili /*String*/ ));
RDebugUtils.currentLine=72679489;
 //BA.debugLineNum = 72679489;BA.debugLine="m.Put(\"FldShomareFaktor\",ShomareFaktor)";
_m.Put((Object)("FldShomareFaktor"),(Object)(_shomarefaktor));
RDebugUtils.currentLine=72679490;
 //BA.debugLineNum = 72679490;BA.debugLine="m.Put(\"FldShomareBargasht\",ShomareBargasht)";
_m.Put((Object)("FldShomareBargasht"),(Object)(_shomarebargasht));
RDebugUtils.currentLine=72679491;
 //BA.debugLineNum = 72679491;BA.debugLine="m.Put(\"FldCodeKala\",Item.CodeKala)";
_m.Put((Object)("FldCodeKala"),(Object)(_item.CodeKala /*String*/ ));
RDebugUtils.currentLine=72679492;
 //BA.debugLineNum = 72679492;BA.debugLine="m.Put(\"FldNameKala\",Item.NameKala)";
_m.Put((Object)("FldNameKala"),(Object)(_item.NameKala /*String*/ ));
RDebugUtils.currentLine=72679493;
 //BA.debugLineNum = 72679493;BA.debugLine="m.Put(\"FldFeeForoosh\",Item.FeeForoosh)";
_m.Put((Object)("FldFeeForoosh"),(Object)(_item.FeeForoosh /*int*/ ));
RDebugUtils.currentLine=72679494;
 //BA.debugLineNum = 72679494;BA.debugLine="m.Put(\"fldFeeBadAzTakhfif\",Item.FldFeeBadAzTakhf";
_m.Put((Object)("fldFeeBadAzTakhfif"),(Object)(_item.fldFeeBadAzTakhfif /*String*/ ));
RDebugUtils.currentLine=72679495;
 //BA.debugLineNum = 72679495;BA.debugLine="m.Put(\"FldMablaghTakhfif\",Item.MablaghTakhfif)";
_m.Put((Object)("FldMablaghTakhfif"),(Object)(_item.MablaghTakhfif /*int*/ ));
RDebugUtils.currentLine=72679496;
 //BA.debugLineNum = 72679496;BA.debugLine="m.Put(\"FldSumMablaghTakhfifVizhe\",SumMablaghTakh";
_m.Put((Object)("FldSumMablaghTakhfifVizhe"),(Object)(_summablaghtakhfifvizhe));
RDebugUtils.currentLine=72679497;
 //BA.debugLineNum = 72679497;BA.debugLine="m.Put(\"FldSumMablaghTakhfifKala\",SumMablaghTakhf";
_m.Put((Object)("FldSumMablaghTakhfifKala"),(Object)(_summablaghtakhfifkala));
RDebugUtils.currentLine=72679498;
 //BA.debugLineNum = 72679498;BA.debugLine="m.Put(\"FldNameVahed\",Item.NameVahed)";
_m.Put((Object)("FldNameVahed"),(Object)(_item.NameVahed /*String*/ ));
RDebugUtils.currentLine=72679499;
 //BA.debugLineNum = 72679499;BA.debugLine="m.Put(\"FldNameVahed2\",Item.NameVahed2)";
_m.Put((Object)("FldNameVahed2"),(Object)(_item.NameVahed2 /*String*/ ));
RDebugUtils.currentLine=72679500;
 //BA.debugLineNum = 72679500;BA.debugLine="m.Put(\"FldSumMande\",Item.SumMande)";
_m.Put((Object)("FldSumMande"),(Object)(_item.SumMande /*String*/ ));
RDebugUtils.currentLine=72679501;
 //BA.debugLineNum = 72679501;BA.debugLine="m.Put(\"fldPathPic\",Item.fldPathPic)";
_m.Put((Object)("fldPathPic"),(Object)(_item.fldPathPic /*String*/ ));
RDebugUtils.currentLine=72679502;
 //BA.debugLineNum = 72679502;BA.debugLine="m.Put(\"FldTedadDarSabadJoz\",Item.TedadDarSabadJo";
_m.Put((Object)("FldTedadDarSabadJoz"),(Object)(_item.TedadDarSabadJoz /*String*/ ));
RDebugUtils.currentLine=72679503;
 //BA.debugLineNum = 72679503;BA.debugLine="m.Put(\"FldTedadDarSabadKol\",Item.TedadDarSabadKo";
_m.Put((Object)("FldTedadDarSabadKol"),(Object)(_item.TedadDarSabadKol /*String*/ ));
RDebugUtils.currentLine=72679504;
 //BA.debugLineNum = 72679504;BA.debugLine="m.Put(\"FldTedadDarkarton\",Item.TedadDarKarton)";
_m.Put((Object)("FldTedadDarkarton"),(Object)(_item.TedadDarKarton /*String*/ ));
RDebugUtils.currentLine=72679505;
 //BA.debugLineNum = 72679505;BA.debugLine="m.Put(\"FldTotalFaktor\",TotalFaktor)";
_m.Put((Object)("FldTotalFaktor"),(Object)(_totalfaktor));
RDebugUtils.currentLine=72679506;
 //BA.debugLineNum = 72679506;BA.debugLine="m.Put(\"FldTozihat\",Item.Tozihat)";
_m.Put((Object)("FldTozihat"),(Object)(_item.Tozihat /*String*/ ));
RDebugUtils.currentLine=72679507;
 //BA.debugLineNum = 72679507;BA.debugLine="m.Put(\"FldTozih\",TxtSharhFaktor.Text & \" (مرجوعی";
_m.Put((Object)("FldTozih"),(Object)(mostCurrent._txtsharhfaktor.getText()+" (مرجوعی)"));
RDebugUtils.currentLine=72679509;
 //BA.debugLineNum = 72679509;BA.debugLine="m.Put(\"FldVaziatPardakht\",0)";
_m.Put((Object)("FldVaziatPardakht"),(Object)(0));
RDebugUtils.currentLine=72679510;
 //BA.debugLineNum = 72679510;BA.debugLine="m.Put(\"FldMablaghKol\",Sum)";
_m.Put((Object)("FldMablaghKol"),(Object)(_sum));
RDebugUtils.currentLine=72679511;
 //BA.debugLineNum = 72679511;BA.debugLine="m.Put(\"FldMablaghTakhfifKol\",MablaghTakhfifKol)";
_m.Put((Object)("FldMablaghTakhfifKol"),(Object)(_mablaghtakhfifkol));
RDebugUtils.currentLine=72679512;
 //BA.debugLineNum = 72679512;BA.debugLine="m.Put(\"FldDarsadTakhfif\",myCode.Is_Null_adad(Ite";
_m.Put((Object)("FldDarsadTakhfif"),(Object)(mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_item.fldDarsadTakhfif /*String*/ )));
RDebugUtils.currentLine=72679513;
 //BA.debugLineNum = 72679513;BA.debugLine="m.Put(\"fldArzeshAfzode\",Item.fldArzeshAfzodeKala";
_m.Put((Object)("fldArzeshAfzode"),(Object)(_item.fldArzeshAfzodeKala /*String*/ ));
RDebugUtils.currentLine=72679514;
 //BA.debugLineNum = 72679514;BA.debugLine="m.Put(\"fldDarsadArzeshAfzode\",Item.fldDarsadArze";
_m.Put((Object)("fldDarsadArzeshAfzode"),(Object)(_item.fldDarsadArzeshAfzodeKala /*String*/ ));
RDebugUtils.currentLine=72679515;
 //BA.debugLineNum = 72679515;BA.debugLine="m.Put(\"FldMablaghKol\",Sum)";
_m.Put((Object)("FldMablaghKol"),(Object)(_sum));
RDebugUtils.currentLine=72679518;
 //BA.debugLineNum = 72679518;BA.debugLine="m.Put(\"FldTarikh\",pDate)";
_m.Put((Object)("FldTarikh"),(Object)(_pdate));
RDebugUtils.currentLine=72679519;
 //BA.debugLineNum = 72679519;BA.debugLine="m.Put(\"FldDate\",pDate)";
_m.Put((Object)("FldDate"),(Object)(_pdate));
RDebugUtils.currentLine=72679520;
 //BA.debugLineNum = 72679520;BA.debugLine="m.Put(\"FldTime\",Time)";
_m.Put((Object)("FldTime"),(Object)(_time));
RDebugUtils.currentLine=72679521;
 //BA.debugLineNum = 72679521;BA.debugLine="m.Put(\"FldSignatureBitmapString\",ImageSignature)";
_m.Put((Object)("FldSignatureBitmapString"),(Object)(_imagesignature));
RDebugUtils.currentLine=72679522;
 //BA.debugLineNum = 72679522;BA.debugLine="m.Put(\"fldShomareForoosh\",myCode.Is_Null_adad(It";
_m.Put((Object)("fldShomareForoosh"),(Object)(mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_item.fldShomareForoosh /*String*/ )));
RDebugUtils.currentLine=72679523;
 //BA.debugLineNum = 72679523;BA.debugLine="m.Put(\"FldSync\",\"False\")";
_m.Put((Object)("FldSync"),(Object)("False"));
RDebugUtils.currentLine=72679524;
 //BA.debugLineNum = 72679524;BA.debugLine="m.Put(\"WIsBacked\",\"True\")";
_m.Put((Object)("WIsBacked"),(Object)("True"));
RDebugUtils.currentLine=72679525;
 //BA.debugLineNum = 72679525;BA.debugLine="m.Put(\"FldType\",\"Marjoee\")";
_m.Put((Object)("FldType"),(Object)("Marjoee"));
RDebugUtils.currentLine=72679526;
 //BA.debugLineNum = 72679526;BA.debugLine="m.Put(\"FldAmani\",MCode.isAmani)";
_m.Put((Object)("FldAmani"),(Object)(mostCurrent._mcode._isamani /*String*/ ));
RDebugUtils.currentLine=72679527;
 //BA.debugLineNum = 72679527;BA.debugLine="m.Put(\"WSendFrom\",3)";
_m.Put((Object)("WSendFrom"),(Object)(3));
RDebugUtils.currentLine=72679528;
 //BA.debugLineNum = 72679528;BA.debugLine="lst.Add(m)";
_lst.Add((Object)(_m.getObject()));
 };
RDebugUtils.currentLine=72679531;
 //BA.debugLineNum = 72679531;BA.debugLine="If Item.FldEshantion>0 Then";
if ((double)(Double.parseDouble(_item.FldEshantion /*String*/ ))>0) { 
RDebugUtils.currentLine=72679533;
 //BA.debugLineNum = 72679533;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=72679534;
 //BA.debugLineNum = 72679534;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=72679535;
 //BA.debugLineNum = 72679535;BA.debugLine="m.Put(\"FldRadif\",i+2)";
_m.Put((Object)("FldRadif"),(Object)(_i+2));
RDebugUtils.currentLine=72679536;
 //BA.debugLineNum = 72679536;BA.debugLine="m.Put(\"FldC_Visitor\",MCode.C_Visitor)";
_m.Put((Object)("FldC_Visitor"),(Object)(mostCurrent._mcode._c_visitor /*String*/ ));
RDebugUtils.currentLine=72679537;
 //BA.debugLineNum = 72679537;BA.debugLine="m.Put(\"FldC_Tafzili\",MCode.C_Tafzili)";
_m.Put((Object)("FldC_Tafzili"),(Object)(mostCurrent._mcode._c_tafzili /*String*/ ));
RDebugUtils.currentLine=72679538;
 //BA.debugLineNum = 72679538;BA.debugLine="m.Put(\"FldN_Tafzili\",MCode.N_Tafzili)";
_m.Put((Object)("FldN_Tafzili"),(Object)(mostCurrent._mcode._n_tafzili /*String*/ ));
RDebugUtils.currentLine=72679539;
 //BA.debugLineNum = 72679539;BA.debugLine="m.Put(\"FldShomareFaktor\",ShomareFaktor)";
_m.Put((Object)("FldShomareFaktor"),(Object)(_shomarefaktor));
RDebugUtils.currentLine=72679540;
 //BA.debugLineNum = 72679540;BA.debugLine="m.Put(\"FldShomareBargasht\",ShomareBargasht)";
_m.Put((Object)("FldShomareBargasht"),(Object)(_shomarebargasht));
RDebugUtils.currentLine=72679541;
 //BA.debugLineNum = 72679541;BA.debugLine="m.Put(\"FldCodeKala\",Item.CodeKala)";
_m.Put((Object)("FldCodeKala"),(Object)(_item.CodeKala /*String*/ ));
RDebugUtils.currentLine=72679542;
 //BA.debugLineNum = 72679542;BA.debugLine="m.Put(\"FldNameKala\",Item.NameKala)";
_m.Put((Object)("FldNameKala"),(Object)(_item.NameKala /*String*/ ));
RDebugUtils.currentLine=72679543;
 //BA.debugLineNum = 72679543;BA.debugLine="m.Put(\"FldFeeForoosh\",0)";
_m.Put((Object)("FldFeeForoosh"),(Object)(0));
RDebugUtils.currentLine=72679544;
 //BA.debugLineNum = 72679544;BA.debugLine="m.Put(\"fldFeeBadAzTakhfif\",0)";
_m.Put((Object)("fldFeeBadAzTakhfif"),(Object)(0));
RDebugUtils.currentLine=72679545;
 //BA.debugLineNum = 72679545;BA.debugLine="m.Put(\"FldMablaghTakhfif\",0)";
_m.Put((Object)("FldMablaghTakhfif"),(Object)(0));
RDebugUtils.currentLine=72679546;
 //BA.debugLineNum = 72679546;BA.debugLine="m.Put(\"FldDarsadTakhfif\",myCode.Is_Null_adad(It";
_m.Put((Object)("FldDarsadTakhfif"),(Object)(mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_item.fldDarsadTakhfif /*String*/ )));
RDebugUtils.currentLine=72679547;
 //BA.debugLineNum = 72679547;BA.debugLine="m.Put(\"fldArzeshAfzode\",Item.fldArzeshAfzodeKal";
_m.Put((Object)("fldArzeshAfzode"),(Object)(_item.fldArzeshAfzodeKala /*String*/ ));
RDebugUtils.currentLine=72679548;
 //BA.debugLineNum = 72679548;BA.debugLine="m.Put(\"fldDarsadArzeshAfzode\",Item.fldDarsadArz";
_m.Put((Object)("fldDarsadArzeshAfzode"),(Object)(_item.fldDarsadArzeshAfzodeKala /*String*/ ));
RDebugUtils.currentLine=72679549;
 //BA.debugLineNum = 72679549;BA.debugLine="m.Put(\"FldSumMablaghTakhfifVizhe\",0)";
_m.Put((Object)("FldSumMablaghTakhfifVizhe"),(Object)(0));
RDebugUtils.currentLine=72679550;
 //BA.debugLineNum = 72679550;BA.debugLine="m.Put(\"FldSumMablaghTakhfifKala\",0)";
_m.Put((Object)("FldSumMablaghTakhfifKala"),(Object)(0));
RDebugUtils.currentLine=72679551;
 //BA.debugLineNum = 72679551;BA.debugLine="m.Put(\"FldNameVahed\",Item.NameVahed)";
_m.Put((Object)("FldNameVahed"),(Object)(_item.NameVahed /*String*/ ));
RDebugUtils.currentLine=72679552;
 //BA.debugLineNum = 72679552;BA.debugLine="m.Put(\"FldNameVahed2\",Item.NameVahed2)";
_m.Put((Object)("FldNameVahed2"),(Object)(_item.NameVahed2 /*String*/ ));
RDebugUtils.currentLine=72679553;
 //BA.debugLineNum = 72679553;BA.debugLine="m.Put(\"FldSumMande\",Item.SumMande)";
_m.Put((Object)("FldSumMande"),(Object)(_item.SumMande /*String*/ ));
RDebugUtils.currentLine=72679554;
 //BA.debugLineNum = 72679554;BA.debugLine="m.Put(\"fldPathPic\",Item.fldPathPic)";
_m.Put((Object)("fldPathPic"),(Object)(_item.fldPathPic /*String*/ ));
RDebugUtils.currentLine=72679555;
 //BA.debugLineNum = 72679555;BA.debugLine="m.Put(\"FldTedadDarSabadJoz\",Item.FldEshantion)";
_m.Put((Object)("FldTedadDarSabadJoz"),(Object)(_item.FldEshantion /*String*/ ));
RDebugUtils.currentLine=72679556;
 //BA.debugLineNum = 72679556;BA.debugLine="m.Put(\"FldTedadDarSabadKol\",Item.TedadDarSabadK";
_m.Put((Object)("FldTedadDarSabadKol"),(Object)(_item.TedadDarSabadKol /*String*/ ));
RDebugUtils.currentLine=72679557;
 //BA.debugLineNum = 72679557;BA.debugLine="m.Put(\"FldTedadDarkarton\",Item.TedadDarKarton)";
_m.Put((Object)("FldTedadDarkarton"),(Object)(_item.TedadDarKarton /*String*/ ));
RDebugUtils.currentLine=72679558;
 //BA.debugLineNum = 72679558;BA.debugLine="m.Put(\"FldTotalFaktor\",TotalFaktor)";
_m.Put((Object)("FldTotalFaktor"),(Object)(_totalfaktor));
RDebugUtils.currentLine=72679559;
 //BA.debugLineNum = 72679559;BA.debugLine="m.Put(\"FldMablaghKol\",Sum)";
_m.Put((Object)("FldMablaghKol"),(Object)(_sum));
RDebugUtils.currentLine=72679560;
 //BA.debugLineNum = 72679560;BA.debugLine="m.Put(\"FldTozihat\",\"اشانتیون مرجوعی\")";
_m.Put((Object)("FldTozihat"),(Object)("اشانتیون مرجوعی"));
RDebugUtils.currentLine=72679562;
 //BA.debugLineNum = 72679562;BA.debugLine="m.Put(\"FldTozih\",TxtSharhFaktor.Text & \" (\" & C";
_m.Put((Object)("FldTozih"),(Object)(mostCurrent._txtsharhfaktor.getText()+" ("+mostCurrent._cmbbox1._cmbbox /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedItem()+")"));
RDebugUtils.currentLine=72679564;
 //BA.debugLineNum = 72679564;BA.debugLine="m.Put(\"FldVaziatPardakht\",0)";
_m.Put((Object)("FldVaziatPardakht"),(Object)(0));
RDebugUtils.currentLine=72679567;
 //BA.debugLineNum = 72679567;BA.debugLine="m.Put(\"FldTarikh\",pDate)";
_m.Put((Object)("FldTarikh"),(Object)(_pdate));
RDebugUtils.currentLine=72679568;
 //BA.debugLineNum = 72679568;BA.debugLine="m.Put(\"FldDate\",pDate)";
_m.Put((Object)("FldDate"),(Object)(_pdate));
RDebugUtils.currentLine=72679569;
 //BA.debugLineNum = 72679569;BA.debugLine="m.Put(\"FldTime\",Time)";
_m.Put((Object)("FldTime"),(Object)(_time));
RDebugUtils.currentLine=72679570;
 //BA.debugLineNum = 72679570;BA.debugLine="m.Put(\"FldSignatureBitmapString\",ImageSignature";
_m.Put((Object)("FldSignatureBitmapString"),(Object)(_imagesignature));
RDebugUtils.currentLine=72679571;
 //BA.debugLineNum = 72679571;BA.debugLine="m.Put(\"fldShomareForoosh\",myCode.Is_Null_adad(I";
_m.Put((Object)("fldShomareForoosh"),(Object)(mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_item.fldShomareForoosh /*String*/ )));
RDebugUtils.currentLine=72679572;
 //BA.debugLineNum = 72679572;BA.debugLine="m.Put(\"FldSync\",\"False\")";
_m.Put((Object)("FldSync"),(Object)("False"));
RDebugUtils.currentLine=72679573;
 //BA.debugLineNum = 72679573;BA.debugLine="m.Put(\"WIsBacked\",\"True\")";
_m.Put((Object)("WIsBacked"),(Object)("True"));
RDebugUtils.currentLine=72679574;
 //BA.debugLineNum = 72679574;BA.debugLine="m.Put(\"FldType\",\"Eshantion\")";
_m.Put((Object)("FldType"),(Object)("Eshantion"));
RDebugUtils.currentLine=72679575;
 //BA.debugLineNum = 72679575;BA.debugLine="m.Put(\"FldAmani\",MCode.isAmani)";
_m.Put((Object)("FldAmani"),(Object)(mostCurrent._mcode._isamani /*String*/ ));
RDebugUtils.currentLine=72679576;
 //BA.debugLineNum = 72679576;BA.debugLine="m.Put(\"WSendFrom\",3)";
_m.Put((Object)("WSendFrom"),(Object)(3));
RDebugUtils.currentLine=72679577;
 //BA.debugLineNum = 72679577;BA.debugLine="lst.Add(m)";
_lst.Add((Object)(_m.getObject()));
 };
 }
};
RDebugUtils.currentLine=72679581;
 //BA.debugLineNum = 72679581;BA.debugLine="DBUtils.InsertMaps(MCode.Sql1,\"TblFaktor\",lst)";
mostCurrent._dbutils._insertmaps /*String*/ (mostCurrent.activityBA,mostCurrent._mcode._sql1 /*anywheresoftware.b4a.sql.SQL*/ ,"TblFaktor",_lst);
RDebugUtils.currentLine=72679582;
 //BA.debugLineNum = 72679582;BA.debugLine="MCode.isAmani=0";
mostCurrent._mcode._isamani /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=72679584;
 //BA.debugLineNum = 72679584;BA.debugLine="MCode.SaveUpdate(\"Delete From TblSabad\")";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Delete From TblSabad");
RDebugUtils.currentLine=72679585;
 //BA.debugLineNum = 72679585;BA.debugLine="If MCode.FaktorSelect=\"\" Then";
if ((mostCurrent._mcode._faktorselect /*String*/ ).equals("")) { 
RDebugUtils.currentLine=72679586;
 //BA.debugLineNum = 72679586;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * from T";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * from TblLogVisitSefaresh Where FldC_Ashkhas = '"+mostCurrent._mcode._c_tafzili /*String*/ +"'");
RDebugUtils.currentLine=72679587;
 //BA.debugLineNum = 72679587;BA.debugLine="If Cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=72679588;
 //BA.debugLineNum = 72679588;BA.debugLine="MCode.SaveUpdate(\"Update TblLogVisitSefaresh Se";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Update TblLogVisitSefaresh Set FldSefaresh = '"+_dt+"' ,FldElatSefaresh = '' Where FldC_Ashkhas = '"+mostCurrent._mcode._c_tafzili /*String*/ +"'");
 }else {
RDebugUtils.currentLine=72679590;
 //BA.debugLineNum = 72679590;BA.debugLine="MCode.SaveUpdate(\"Insert Into TblLogVisitSefare";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Insert Into TblLogVisitSefaresh (FldC_Ashkhas,FldVisit,FldSefaresh,FldElatSefaresh) Values ('"+mostCurrent._mcode._c_tafzili /*String*/ +"','','"+_pdate+"','')");
 };
RDebugUtils.currentLine=72679592;
 //BA.debugLineNum = 72679592;BA.debugLine="SaveLastVisit";
_savelastvisit();
 };
RDebugUtils.currentLine=72679597;
 //BA.debugLineNum = 72679597;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=72679598;
 //BA.debugLineNum = 72679598;BA.debugLine="If MCode.FaktorSelect=\"\" Then";
if ((mostCurrent._mcode._faktorselect /*String*/ ).equals("")) { 
RDebugUtils.currentLine=72679599;
 //BA.debugLineNum = 72679599;BA.debugLine="ToastMessageShow(\"فاکتور مرجوعی ثبت گردید\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("فاکتور مرجوعی ثبت گردید"),anywheresoftware.b4a.keywords.Common.True);
 }else {
RDebugUtils.currentLine=72679601;
 //BA.debugLineNum = 72679601;BA.debugLine="ToastMessageShow(\"فاکتور مرجوعی اصلاح گردید\",Tru";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("فاکتور مرجوعی اصلاح گردید"),anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=72679604;
 //BA.debugLineNum = 72679604;BA.debugLine="Send_Faktor";
_send_faktor();
RDebugUtils.currentLine=72679605;
 //BA.debugLineNum = 72679605;BA.debugLine="MCode.FaktorSelect=\"\"";
mostCurrent._mcode._faktorselect /*String*/  = "";
RDebugUtils.currentLine=72679606;
 //BA.debugLineNum = 72679606;BA.debugLine="MCode.editFactor=False";
mostCurrent._mcode._editfactor /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=72679607;
 //BA.debugLineNum = 72679607;BA.debugLine="Log(MCode.C_Tafzili)";
anywheresoftware.b4a.keywords.Common.LogImpl("572679607",mostCurrent._mcode._c_tafzili /*String*/ ,0);
RDebugUtils.currentLine=72679608;
 //BA.debugLineNum = 72679608;BA.debugLine="StartActivity(Act_Profile)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._act_profile.getObject()));
 } 
       catch (Exception e159) {
			processBA.setLastException(e159);RDebugUtils.currentLine=72679610;
 //BA.debugLineNum = 72679610;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("572679610",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=72679611;
 //BA.debugLineNum = 72679611;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-SaveFaktor_Marjoee");
 };
RDebugUtils.currentLine=72679613;
 //BA.debugLineNum = 72679613;BA.debugLine="End Sub";
return "";
}
public static String  _send_faktor() throws Exception{
RDebugUtils.currentModule="act_sabad";
if (Debug.shouldDelegate(mostCurrent.activityBA, "send_faktor", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "send_faktor", null));}
RDebugUtils.currentLine=72613888;
 //BA.debugLineNum = 72613888;BA.debugLine="Private Sub Send_Faktor";
RDebugUtils.currentLine=72613889;
 //BA.debugLineNum = 72613889;BA.debugLine="Try";
try {RDebugUtils.currentLine=72613890;
 //BA.debugLineNum = 72613890;BA.debugLine="Dim XUI As XUI";
mostCurrent._xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=72613906;
 //BA.debugLineNum = 72613906;BA.debugLine="MCode.FaktorSelect=\"\"";
mostCurrent._mcode._faktorselect /*String*/  = "";
RDebugUtils.currentLine=72613907;
 //BA.debugLineNum = 72613907;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=72613908;
 //BA.debugLineNum = 72613908;BA.debugLine="StartActivity(Act_Profile)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._act_profile.getObject()));
 } 
       catch (Exception e7) {
			processBA.setLastException(e7);RDebugUtils.currentLine=72613910;
 //BA.debugLineNum = 72613910;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("572613910",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=72613911;
 //BA.debugLineNum = 72613911;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-Send_Faktor");
 };
RDebugUtils.currentLine=72613913;
 //BA.debugLineNum = 72613913;BA.debugLine="End Sub";
return "";
}
public static String  _txtmablaghtakhfifikol_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="act_sabad";
if (Debug.shouldDelegate(mostCurrent.activityBA, "txtmablaghtakhfifikol_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "txtmablaghtakhfifikol_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=73007104;
 //BA.debugLineNum = 73007104;BA.debugLine="Sub txtMablaghTakhfifiKol_TextChanged (Old As Stri";
RDebugUtils.currentLine=73007105;
 //BA.debugLineNum = 73007105;BA.debugLine="Try";
try {RDebugUtils.currentLine=73007106;
 //BA.debugLineNum = 73007106;BA.debugLine="If IsNumber(New)=False Then";
if (anywheresoftware.b4a.keywords.Common.IsNumber(_new)==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=73007107;
 //BA.debugLineNum = 73007107;BA.debugLine="txtMablaghTakhfifiKol.Text=Old";
mostCurrent._txtmablaghtakhfifikol.setText(BA.ObjectToCharSequence(_old));
 };
 } 
       catch (Exception e6) {
			processBA.setLastException(e6);RDebugUtils.currentLine=73007110;
 //BA.debugLineNum = 73007110;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("573007110",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=73007111;
 //BA.debugLineNum = 73007111;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-txtMablaghTakhfifiKol_TextChanged");
 };
RDebugUtils.currentLine=73007113;
 //BA.debugLineNum = 73007113;BA.debugLine="End Sub";
return "";
}
}