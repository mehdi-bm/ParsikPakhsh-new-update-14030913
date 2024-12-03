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

public class act_repfactors extends Activity implements B4AActivity{
	public static act_repfactors mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.act_repfactors");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (act_repfactors).");
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
		activityBA = new BA(this, layout, processBA, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.act_repfactors");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "ir.parsikhesab.pakhsh.act_repfactors", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (act_repfactors) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (act_repfactors) Resume **");
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
		return act_repfactors.class;
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
            BA.LogInfo("** Activity (act_repfactors) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (act_repfactors) Pause event (activity is not paused). **");
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
            act_repfactors mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (act_repfactors) Resume **");
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
public static String _dateaz = "";
public static String _dateta = "";
public static String _codemoshtari = "";
public static String _totalfactor = "";
public wir.hitex.recycler.Hitex_LayoutView _hlv = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblname = null;
public anywheresoftware.b4a.objects.collections.List _listfaktor = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnltop = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnl_hlv = null;
public anywheresoftware.b4a.objects.LabelWrapper _label1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label4 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _lblback = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblnames = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblvaziats = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblsumforoosh = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblsumsefaresh = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblsumbargasht = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblsumkhales = null;
public ir.parsikhesab.pakhsh.b4xcombobox _cmbvaziat = null;
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
RDebugUtils.currentModule="act_repfactors";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=59113472;
 //BA.debugLineNum = 59113472;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=59113473;
 //BA.debugLineNum = 59113473;BA.debugLine="Activity.LoadLayout(\"L_RepProfile\")";
mostCurrent._activity.LoadLayout("L_RepProfile",mostCurrent.activityBA);
RDebugUtils.currentLine=59113474;
 //BA.debugLineNum = 59113474;BA.debugLine="HLV.Initializer(\"HLV\").ListView.Build";
mostCurrent._hlv.Initializer(mostCurrent.activityBA,"HLV").ListView().Build();
RDebugUtils.currentLine=59113475;
 //BA.debugLineNum = 59113475;BA.debugLine="pnl_HLV.AddView(HLV,0,0,pnl_HLV.Width,pnl_HLV.Hei";
mostCurrent._pnl_hlv.AddView((android.view.View)(mostCurrent._hlv.getObject()),(int) (0),(int) (0),mostCurrent._pnl_hlv.getWidth(),mostCurrent._pnl_hlv.getHeight());
RDebugUtils.currentLine=59113476;
 //BA.debugLineNum = 59113476;BA.debugLine="ListFaktor.Initialize";
mostCurrent._listfaktor.Initialize();
RDebugUtils.currentLine=59113477;
 //BA.debugLineNum = 59113477;BA.debugLine="Gps.Initialize(\"Gps\")";
_gps.Initialize("Gps");
RDebugUtils.currentLine=59113478;
 //BA.debugLineNum = 59113478;BA.debugLine="HLV.Ripple.Color(0xFF909090)";
mostCurrent._hlv.Ripple().Color(((int)0xff909090));
RDebugUtils.currentLine=59113480;
 //BA.debugLineNum = 59113480;BA.debugLine="HLV.Show";
mostCurrent._hlv.Show();
RDebugUtils.currentLine=59113481;
 //BA.debugLineNum = 59113481;BA.debugLine="CmbVaziat.cmbBox.Add(\"همه سفارشات\")";
mostCurrent._cmbvaziat._cmbbox /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add("همه سفارشات");
RDebugUtils.currentLine=59113482;
 //BA.debugLineNum = 59113482;BA.debugLine="CmbVaziat.cmbBox.Add(\"سفارشات ارسال نشده\")";
mostCurrent._cmbvaziat._cmbbox /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add("سفارشات ارسال نشده");
RDebugUtils.currentLine=59113483;
 //BA.debugLineNum = 59113483;BA.debugLine="CmbVaziat.cmbBox.Add(\"سفارشات ارسال شده\")";
mostCurrent._cmbvaziat._cmbbox /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add("سفارشات ارسال شده");
RDebugUtils.currentLine=59113484;
 //BA.debugLineNum = 59113484;BA.debugLine="CmbVaziat.cmbBox.Add(\"فاکتورهای فروش رفته\")";
mostCurrent._cmbvaziat._cmbbox /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add("فاکتورهای فروش رفته");
RDebugUtils.currentLine=59113485;
 //BA.debugLineNum = 59113485;BA.debugLine="CmbVaziat.cmbBox.Add(\"فاکتورهای فروش نرفته\")";
mostCurrent._cmbvaziat._cmbbox /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add("فاکتورهای فروش نرفته");
RDebugUtils.currentLine=59113486;
 //BA.debugLineNum = 59113486;BA.debugLine="CmbVaziat.cmbBox.Add(\"فاکتورهای مرجوع شده\")";
mostCurrent._cmbvaziat._cmbbox /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add("فاکتورهای مرجوع شده");
RDebugUtils.currentLine=59113487;
 //BA.debugLineNum = 59113487;BA.debugLine="CmbVaziat.cmbBox.Add(\"فاکتورهای امانی شده\")";
mostCurrent._cmbvaziat._cmbbox /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add("فاکتورهای امانی شده");
RDebugUtils.currentLine=59113489;
 //BA.debugLineNum = 59113489;BA.debugLine="CmbVaziat.SelectedIndex=0";
mostCurrent._cmbvaziat._setselectedindex /*int*/ (null,(int) (0));
RDebugUtils.currentLine=59113490;
 //BA.debugLineNum = 59113490;BA.debugLine="LoadData";
_loaddata();
RDebugUtils.currentLine=59113492;
 //BA.debugLineNum = 59113492;BA.debugLine="End Sub";
return "";
}
public static String  _loaddata() throws Exception{
RDebugUtils.currentModule="act_repfactors";
if (Debug.shouldDelegate(mostCurrent.activityBA, "loaddata", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "loaddata", null));}
String _filtervaziat = "";
String _sumforoosh = "";
String _sumsefaresh = "";
String _sumbargasht = "";
String _sumkhales = "";
long _tfsum = 0L;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu1 = null;
int _i = 0;
int _c = 0;
String _fldtedadjozforoosh = "";
String _fldtedadkolforoosh = "";
ir.parsikhesab.pakhsh.mcode._adapterlistfaktor _item = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu2 = null;
int _j = 0;
String _fldtedadjozsefaresh = "";
String _fldtedadkolsefaresh = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu3 = null;
ir.parsikhesab.pakhsh.mcode._adapterlistfaktor _item2 = null;
RDebugUtils.currentLine=59179008;
 //BA.debugLineNum = 59179008;BA.debugLine="Sub LoadData";
RDebugUtils.currentLine=59179009;
 //BA.debugLineNum = 59179009;BA.debugLine="Dim FilterVaziat As String=\"\"";
_filtervaziat = "";
RDebugUtils.currentLine=59179010;
 //BA.debugLineNum = 59179010;BA.debugLine="Dim SumForoosh As String=0";
_sumforoosh = BA.NumberToString(0);
RDebugUtils.currentLine=59179011;
 //BA.debugLineNum = 59179011;BA.debugLine="Dim SumSefaresh As String=0";
_sumsefaresh = BA.NumberToString(0);
RDebugUtils.currentLine=59179012;
 //BA.debugLineNum = 59179012;BA.debugLine="Dim SumBargasht As String=0";
_sumbargasht = BA.NumberToString(0);
RDebugUtils.currentLine=59179013;
 //BA.debugLineNum = 59179013;BA.debugLine="Dim SumKhales As String=0";
_sumkhales = BA.NumberToString(0);
RDebugUtils.currentLine=59179015;
 //BA.debugLineNum = 59179015;BA.debugLine="Select CmbVaziat.SelectedIndex";
switch (BA.switchObjectToInt(mostCurrent._cmbvaziat._getselectedindex /*int*/ (null),(int) (0),(int) (1),(int) (2),(int) (3),(int) (4),(int) (5),(int) (6))) {
case 0: {
RDebugUtils.currentLine=59179017;
 //BA.debugLineNum = 59179017;BA.debugLine="FilterVaziat=\"\"";
_filtervaziat = "";
 break; }
case 1: {
RDebugUtils.currentLine=59179019;
 //BA.debugLineNum = 59179019;BA.debugLine="FilterVaziat=\" And FldSync='False'\"";
_filtervaziat = " And FldSync='False'";
 break; }
case 2: {
RDebugUtils.currentLine=59179021;
 //BA.debugLineNum = 59179021;BA.debugLine="FilterVaziat=\" And FldSync='True'\"";
_filtervaziat = " And FldSync='True'";
 break; }
case 3: {
RDebugUtils.currentLine=59179023;
 //BA.debugLineNum = 59179023;BA.debugLine="FilterVaziat=\" And fldShomareForoosh>0 and FldT";
_filtervaziat = " And fldShomareForoosh>0 and FldType='Foroosh'";
 break; }
case 4: {
RDebugUtils.currentLine=59179025;
 //BA.debugLineNum = 59179025;BA.debugLine="FilterVaziat=\" And fldShomareForoosh=0 and FldT";
_filtervaziat = " And fldShomareForoosh=0 and FldType='Foroosh'";
 break; }
case 5: {
RDebugUtils.currentLine=59179027;
 //BA.debugLineNum = 59179027;BA.debugLine="FilterVaziat=\" And FldType='Marjoee'\"";
_filtervaziat = " And FldType='Marjoee'";
 break; }
case 6: {
RDebugUtils.currentLine=59179029;
 //BA.debugLineNum = 59179029;BA.debugLine="FilterVaziat=\" And FldAmani='1'\"";
_filtervaziat = " And FldAmani='1'";
 break; }
}
;
RDebugUtils.currentLine=59179032;
 //BA.debugLineNum = 59179032;BA.debugLine="ListFaktor.Clear";
mostCurrent._listfaktor.Clear();
RDebugUtils.currentLine=59179033;
 //BA.debugLineNum = 59179033;BA.debugLine="Dim TFsum As Long=0";
_tfsum = (long) (0);
RDebugUtils.currentLine=59179034;
 //BA.debugLineNum = 59179034;BA.debugLine="If CodeMoshtari=0 Then";
if ((_codemoshtari).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=59179035;
 //BA.debugLineNum = 59179035;BA.debugLine="Dim cu1 As Cursor=MCode.Result(\"select distinct";
_cu1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu1 = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"select distinct fldShomareForoosh from  TblFaktor where fldShomareForoosh>0   and FldDate between "+_dateaz+" and "+_dateta+" "+_filtervaziat);
 }else {
RDebugUtils.currentLine=59179037;
 //BA.debugLineNum = 59179037;BA.debugLine="Dim cu1 As Cursor=MCode.Result(\"select distinct";
_cu1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu1 = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"select distinct fldShomareForoosh from  TblFaktor where fldShomareForoosh>0 and FldC_Tafzili="+_codemoshtari+"   and FldDate between "+_dateaz+" and "+_dateta+" "+_filtervaziat);
 };
RDebugUtils.currentLine=59179039;
 //BA.debugLineNum = 59179039;BA.debugLine="If cu1.RowCount>0 Then";
if (_cu1.getRowCount()>0) { 
RDebugUtils.currentLine=59179040;
 //BA.debugLineNum = 59179040;BA.debugLine="For i=0 To cu1.RowCount-1";
{
final int step30 = 1;
final int limit30 = (int) (_cu1.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit30 ;_i = _i + step30 ) {
RDebugUtils.currentLine=59179041;
 //BA.debugLineNum = 59179041;BA.debugLine="Dim c As Int=0";
_c = (int) (0);
RDebugUtils.currentLine=59179042;
 //BA.debugLineNum = 59179042;BA.debugLine="cu1.Position=i";
_cu1.setPosition(_i);
RDebugUtils.currentLine=59179043;
 //BA.debugLineNum = 59179043;BA.debugLine="Dim fldTedadJozForoosh As String=0";
_fldtedadjozforoosh = BA.NumberToString(0);
RDebugUtils.currentLine=59179044;
 //BA.debugLineNum = 59179044;BA.debugLine="Dim fldTedadKolForoosh As String=0";
_fldtedadkolforoosh = BA.NumberToString(0);
RDebugUtils.currentLine=59179045;
 //BA.debugLineNum = 59179045;BA.debugLine="Dim Item As AdapterListFaktor";
_item = new ir.parsikhesab.pakhsh.mcode._adapterlistfaktor();
RDebugUtils.currentLine=59179046;
 //BA.debugLineNum = 59179046;BA.debugLine="Log(cu1.GetString(\"fldShomareForoosh\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("559179046",_cu1.GetString("fldShomareForoosh"),0);
RDebugUtils.currentLine=59179047;
 //BA.debugLineNum = 59179047;BA.debugLine="Dim cu2 As Cursor = MCode.Result(\"select * from";
_cu2 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu2 = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"select * from  TblFaktor where fldShomareForoosh="+_cu1.GetString("fldShomareForoosh")+"  And FldDate between "+_dateaz+" And "+_dateta+" "+_filtervaziat);
RDebugUtils.currentLine=59179048;
 //BA.debugLineNum = 59179048;BA.debugLine="If cu2.RowCount>0 Then";
if (_cu2.getRowCount()>0) { 
RDebugUtils.currentLine=59179049;
 //BA.debugLineNum = 59179049;BA.debugLine="For j=0 To cu2.RowCount-1";
{
final int step39 = 1;
final int limit39 = (int) (_cu2.getRowCount()-1);
_j = (int) (0) ;
for (;_j <= limit39 ;_j = _j + step39 ) {
RDebugUtils.currentLine=59179050;
 //BA.debugLineNum = 59179050;BA.debugLine="cu2.Position=j";
_cu2.setPosition(_j);
RDebugUtils.currentLine=59179053;
 //BA.debugLineNum = 59179053;BA.debugLine="Item.fldC_Ashkhas=cu2.GetString(\"FldC_Tafzili";
_item.fldC_Ashkhas /*String*/  = _cu2.GetString("FldC_Tafzili");
RDebugUtils.currentLine=59179054;
 //BA.debugLineNum = 59179054;BA.debugLine="Item.FldAmani=myCode.Is_Null_adad(cu2.GetStri";
_item.FldAmani /*String*/  = mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_cu2.GetString("FldAmani"));
RDebugUtils.currentLine=59179055;
 //BA.debugLineNum = 59179055;BA.debugLine="Item.fldDate=MCode.PersianDateDash(cu2.GetStr";
_item.fldDate /*String*/  = mostCurrent._mcode._persiandatedash /*String*/ (mostCurrent.activityBA,_cu2.GetString("FldDate"));
RDebugUtils.currentLine=59179056;
 //BA.debugLineNum = 59179056;BA.debugLine="Item.FldType=cu2.GetString(\"FldType\")";
_item.FldType /*String*/  = _cu2.GetString("FldType");
RDebugUtils.currentLine=59179057;
 //BA.debugLineNum = 59179057;BA.debugLine="Item.fldShomareForoosh=cu2.GetString(\"fldShom";
_item.fldShomareForoosh /*String*/  = _cu2.GetString("fldShomareForoosh");
RDebugUtils.currentLine=59179058;
 //BA.debugLineNum = 59179058;BA.debugLine="Item.fldTotalFaktor=cu2.GetString(\"FldTotalFa";
_item.fldTotalFaktor /*String*/  = _cu2.GetString("FldTotalFaktor");
RDebugUtils.currentLine=59179059;
 //BA.debugLineNum = 59179059;BA.debugLine="If cu2.Getstring(\"FldSync\")=\"True\" Then";
if ((_cu2.GetString("FldSync")).equals("True")) { 
RDebugUtils.currentLine=59179060;
 //BA.debugLineNum = 59179060;BA.debugLine="Item.synced=True";
_item.synced /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 }else {
RDebugUtils.currentLine=59179062;
 //BA.debugLineNum = 59179062;BA.debugLine="Item.synced=False";
_item.synced /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=59179064;
 //BA.debugLineNum = 59179064;BA.debugLine="Select cu2.GetString(\"FldType\")";
switch (BA.switchObjectToInt(_cu2.GetString("FldType"),"Foroosh","Marjoee")) {
case 0: {
RDebugUtils.currentLine=59179066;
 //BA.debugLineNum = 59179066;BA.debugLine="Item.fldShomareFaktor=cu2.GetString(\"FldSho";
_item.fldShomareFaktor /*String*/  = _cu2.GetString("FldShomareFaktor");
RDebugUtils.currentLine=59179068;
 //BA.debugLineNum = 59179068;BA.debugLine="fldTedadJozForoosh=fldTedadJozForoosh+cu2.G";
_fldtedadjozforoosh = BA.NumberToString((double)(Double.parseDouble(_fldtedadjozforoosh))+(double)(Double.parseDouble(_cu2.GetString("FldTedadDarSabadJoz"))));
RDebugUtils.currentLine=59179069;
 //BA.debugLineNum = 59179069;BA.debugLine="fldTedadKolForoosh=fldTedadKolForoosh+cu2.G";
_fldtedadkolforoosh = BA.NumberToString((double)(Double.parseDouble(_fldtedadkolforoosh))+(double)(Double.parseDouble(_cu2.GetString("FldTedadDarSabadKol"))));
 break; }
case 1: {
RDebugUtils.currentLine=59179075;
 //BA.debugLineNum = 59179075;BA.debugLine="Item.FldShomareBargasht=cu2.GetString(\"FldS";
_item.FldShomareBargasht /*String*/  = _cu2.GetString("FldShomareBargasht");
RDebugUtils.currentLine=59179076;
 //BA.debugLineNum = 59179076;BA.debugLine="Item.fldShomareFaktor=cu2.GetString(\"FldSho";
_item.fldShomareFaktor /*String*/  = _cu2.GetString("FldShomareFaktor");
RDebugUtils.currentLine=59179077;
 //BA.debugLineNum = 59179077;BA.debugLine="Item.FldDateBargasht=MCode.PersianDateDash(";
_item.FldDateBargasht /*String*/  = mostCurrent._mcode._persiandatedash /*String*/ (mostCurrent.activityBA,_cu2.GetString("FldDate"));
RDebugUtils.currentLine=59179078;
 //BA.debugLineNum = 59179078;BA.debugLine="Item.FldMablaghBargasht=MCode.SingleResult(";
_item.FldMablaghBargasht /*String*/  = BA.ObjectToString(mostCurrent._mcode._singleresult /*Object*/ (mostCurrent.activityBA,"Select distinct FldTotalFaktor from TblFaktor where FldType='"+_cu2.GetString("FldType")+"' and FldDate between "+_dateaz+" and "+_dateta+" and fldShomareForoosh="+_cu2.GetString("fldShomareForoosh")+" "+_filtervaziat));
RDebugUtils.currentLine=59179079;
 //BA.debugLineNum = 59179079;BA.debugLine="Item.fldTedadJozMarjoee=MCode.SingleResult(";
_item.fldTedadJozMarjoee /*String*/  = BA.ObjectToString(mostCurrent._mcode._singleresult /*Object*/ (mostCurrent.activityBA,"Select sum(FldTedadDarSabadJoz) from TblFaktor where FldType='"+_cu2.GetString("FldType")+"' and FldDate between "+_dateaz+" and "+_dateta+"  and fldShomareForoosh="+_cu2.GetString("fldShomareForoosh")+" "+_filtervaziat));
RDebugUtils.currentLine=59179080;
 //BA.debugLineNum = 59179080;BA.debugLine="Item.fldTedadCartonMarjoee=MCode.SingleResu";
_item.fldTedadCartonMarjoee /*String*/  = BA.ObjectToString(mostCurrent._mcode._singleresult /*Object*/ (mostCurrent.activityBA,"Select sum(FldTedadDarSabadKol) from TblFaktor where FldType='"+_cu2.GetString("FldType")+"' and FldDate between "+_dateaz+" and "+_dateta+"  and fldShomareForoosh="+_cu2.GetString("fldShomareForoosh")+" "+_filtervaziat));
RDebugUtils.currentLine=59179082;
 //BA.debugLineNum = 59179082;BA.debugLine="Item.fldTedadJozMande=fldTedadJozForoosh-It";
_item.fldTedadJozMande /*String*/  = BA.NumberToString((double)(Double.parseDouble(_fldtedadjozforoosh))-(double)(Double.parseDouble(_item.fldTedadJozMarjoee /*String*/ )));
RDebugUtils.currentLine=59179083;
 //BA.debugLineNum = 59179083;BA.debugLine="Item.fldTedadCartonMande=fldTedadKolForoosh";
_item.fldTedadCartonMande /*String*/  = BA.NumberToString((double)(Double.parseDouble(_fldtedadkolforoosh))-(double)(Double.parseDouble(_item.fldTedadCartonMarjoee /*String*/ )));
RDebugUtils.currentLine=59179084;
 //BA.debugLineNum = 59179084;BA.debugLine="Item.fldMablaghMande=myCode.Is_Null_adad(It";
_item.fldMablaghMande /*String*/  = BA.NumberToString((double)(Double.parseDouble(mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_item.fldTotalFaktor /*String*/ )))-(double)(Double.parseDouble(_item.FldMablaghBargasht /*String*/ )));
 break; }
}
;
 }
};
RDebugUtils.currentLine=59179089;
 //BA.debugLineNum = 59179089;BA.debugLine="If Item.FldType=\"Foroosh\" Then";
if ((_item.FldType /*String*/ ).equals("Foroosh")) { 
RDebugUtils.currentLine=59179091;
 //BA.debugLineNum = 59179091;BA.debugLine="SumForoosh=SumForoosh + myCode.Is_Null_adad(I";
_sumforoosh = BA.NumberToString((double)(Double.parseDouble(_sumforoosh))+(double)(Double.parseDouble(mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_item.fldTotalFaktor /*String*/ ))));
 }else 
{RDebugUtils.currentLine=59179092;
 //BA.debugLineNum = 59179092;BA.debugLine="else If Item.FldType=\"Marjoee\" Then";
if ((_item.FldType /*String*/ ).equals("Marjoee")) { 
RDebugUtils.currentLine=59179093;
 //BA.debugLineNum = 59179093;BA.debugLine="SumBargasht=SumBargasht +myCode.Is_Null_adad(";
_sumbargasht = BA.NumberToString((double)(Double.parseDouble(_sumbargasht))+(double)(Double.parseDouble(mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_item.fldTotalFaktor /*String*/ ))));
 }}
;
RDebugUtils.currentLine=59179095;
 //BA.debugLineNum = 59179095;BA.debugLine="SumKhales =SumKhales + (SumForoosh-SumBargasht";
_sumkhales = BA.NumberToString((double)(Double.parseDouble(_sumkhales))+((double)(Double.parseDouble(_sumforoosh))-(double)(Double.parseDouble(_sumbargasht))));
RDebugUtils.currentLine=59179096;
 //BA.debugLineNum = 59179096;BA.debugLine="Item.fldTedadJoz=fldTedadJozForoosh";
_item.fldTedadJoz /*String*/  = _fldtedadjozforoosh;
RDebugUtils.currentLine=59179097;
 //BA.debugLineNum = 59179097;BA.debugLine="Item.fldTedadCarton=fldTedadKolForoosh";
_item.fldTedadCarton /*String*/  = _fldtedadkolforoosh;
RDebugUtils.currentLine=59179098;
 //BA.debugLineNum = 59179098;BA.debugLine="ListFaktor.Add(Item)";
mostCurrent._listfaktor.Add((Object)(_item));
 };
 }
};
 };
RDebugUtils.currentLine=59179105;
 //BA.debugLineNum = 59179105;BA.debugLine="If CodeMoshtari=0 Then";
if ((_codemoshtari).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=59179106;
 //BA.debugLineNum = 59179106;BA.debugLine="Dim cu1 As Cursor=MCode.Result(\"select distinct";
_cu1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu1 = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"select distinct FldShomareFaktor from  TblFaktor where fldShomareForoosh=0 and FldType='Foroosh'  and FldDate between "+_dateaz+" and "+_dateta+" "+_filtervaziat);
 }else {
RDebugUtils.currentLine=59179108;
 //BA.debugLineNum = 59179108;BA.debugLine="Dim cu1 As Cursor=MCode.Result(\"select distinct";
_cu1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu1 = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"select distinct FldShomareFaktor from  TblFaktor where fldShomareForoosh=0 and FldC_Tafzili="+_codemoshtari+" and FldType='Foroosh'  and FldDate between "+_dateaz+" and "+_dateta+" "+_filtervaziat);
 };
RDebugUtils.currentLine=59179110;
 //BA.debugLineNum = 59179110;BA.debugLine="If cu1.RowCount>0 Then";
if (_cu1.getRowCount()>0) { 
RDebugUtils.currentLine=59179113;
 //BA.debugLineNum = 59179113;BA.debugLine="For i=0 To cu1.RowCount-1";
{
final int step87 = 1;
final int limit87 = (int) (_cu1.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit87 ;_i = _i + step87 ) {
RDebugUtils.currentLine=59179114;
 //BA.debugLineNum = 59179114;BA.debugLine="cu1.Position=i";
_cu1.setPosition(_i);
RDebugUtils.currentLine=59179115;
 //BA.debugLineNum = 59179115;BA.debugLine="Dim fldTedadJozSefaresh  As String=0";
_fldtedadjozsefaresh = BA.NumberToString(0);
RDebugUtils.currentLine=59179116;
 //BA.debugLineNum = 59179116;BA.debugLine="Dim fldTedadKolSefaresh As String=0";
_fldtedadkolsefaresh = BA.NumberToString(0);
RDebugUtils.currentLine=59179117;
 //BA.debugLineNum = 59179117;BA.debugLine="Log(cu1.GetString(\"FldShomareFaktor\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("559179117",_cu1.GetString("FldShomareFaktor"),0);
RDebugUtils.currentLine=59179118;
 //BA.debugLineNum = 59179118;BA.debugLine="Dim cu3 As Cursor = MCode.Result(\"select * from";
_cu3 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu3 = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"select * from  TblFaktor where fldShomareForoosh=0 and FldShomareFaktor="+_cu1.GetString("FldShomareFaktor")+"  And FldDate between "+_dateaz+" And "+_dateta+" "+_filtervaziat);
RDebugUtils.currentLine=59179119;
 //BA.debugLineNum = 59179119;BA.debugLine="If cu3.RowCount>0 Then";
if (_cu3.getRowCount()>0) { 
RDebugUtils.currentLine=59179120;
 //BA.debugLineNum = 59179120;BA.debugLine="For j=0 To cu3.RowCount-1";
{
final int step94 = 1;
final int limit94 = (int) (_cu3.getRowCount()-1);
_j = (int) (0) ;
for (;_j <= limit94 ;_j = _j + step94 ) {
RDebugUtils.currentLine=59179121;
 //BA.debugLineNum = 59179121;BA.debugLine="cu3.Position=j";
_cu3.setPosition(_j);
RDebugUtils.currentLine=59179122;
 //BA.debugLineNum = 59179122;BA.debugLine="Dim Item2 As AdapterListFaktor";
_item2 = new ir.parsikhesab.pakhsh.mcode._adapterlistfaktor();
RDebugUtils.currentLine=59179123;
 //BA.debugLineNum = 59179123;BA.debugLine="Item2.fldShomareForoosh=cu3.GetString(\"fldSho";
_item2.fldShomareForoosh /*String*/  = _cu3.GetString("fldShomareForoosh");
RDebugUtils.currentLine=59179124;
 //BA.debugLineNum = 59179124;BA.debugLine="Item2.fldC_Ashkhas=cu3.GetString(\"FldC_Tafzil";
_item2.fldC_Ashkhas /*String*/  = _cu3.GetString("FldC_Tafzili");
RDebugUtils.currentLine=59179125;
 //BA.debugLineNum = 59179125;BA.debugLine="Item2.FldAmani=myCode.Is_Null_adad(cu3.GetStr";
_item2.FldAmani /*String*/  = mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_cu3.GetString("FldAmani"));
RDebugUtils.currentLine=59179126;
 //BA.debugLineNum = 59179126;BA.debugLine="Item2.fldShomareFaktor=cu3.GetString(\"FldShom";
_item2.fldShomareFaktor /*String*/  = _cu3.GetString("FldShomareFaktor");
RDebugUtils.currentLine=59179127;
 //BA.debugLineNum = 59179127;BA.debugLine="Item2.fldDate=MCode.PersianDateDash(cu3.GetSt";
_item2.fldDate /*String*/  = mostCurrent._mcode._persiandatedash /*String*/ (mostCurrent.activityBA,_cu3.GetString("FldDate"));
RDebugUtils.currentLine=59179128;
 //BA.debugLineNum = 59179128;BA.debugLine="Item2.fldTotalFaktor=cu3.GetString(\"FldTotalF";
_item2.fldTotalFaktor /*String*/  = _cu3.GetString("FldTotalFaktor");
RDebugUtils.currentLine=59179129;
 //BA.debugLineNum = 59179129;BA.debugLine="If cu3.Getstring(\"FldSync\")=\"True\" Then";
if ((_cu3.GetString("FldSync")).equals("True")) { 
RDebugUtils.currentLine=59179130;
 //BA.debugLineNum = 59179130;BA.debugLine="Item2.synced=True";
_item2.synced /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 }else {
RDebugUtils.currentLine=59179132;
 //BA.debugLineNum = 59179132;BA.debugLine="Item2.synced=False";
_item2.synced /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=59179135;
 //BA.debugLineNum = 59179135;BA.debugLine="fldTedadJozSefaresh=fldTedadJozSefaresh+cu3.G";
_fldtedadjozsefaresh = BA.NumberToString((double)(Double.parseDouble(_fldtedadjozsefaresh))+(double)(Double.parseDouble(_cu3.GetString("FldTedadDarSabadJoz"))));
RDebugUtils.currentLine=59179136;
 //BA.debugLineNum = 59179136;BA.debugLine="fldTedadKolSefaresh=fldTedadKolSefaresh+cu3.G";
_fldtedadkolsefaresh = BA.NumberToString((double)(Double.parseDouble(_fldtedadkolsefaresh))+(double)(Double.parseDouble(_cu3.GetString("FldTedadDarSabadKol"))));
 }
};
RDebugUtils.currentLine=59179141;
 //BA.debugLineNum = 59179141;BA.debugLine="SumSefaresh=SumSefaresh + myCode.Is_Null_adad(";
_sumsefaresh = BA.NumberToString((double)(Double.parseDouble(_sumsefaresh))+(double)(Double.parseDouble(mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_item2.fldTotalFaktor /*String*/ ))));
RDebugUtils.currentLine=59179142;
 //BA.debugLineNum = 59179142;BA.debugLine="Item2.fldTedadJoz=fldTedadJozSefaresh";
_item2.fldTedadJoz /*String*/  = _fldtedadjozsefaresh;
RDebugUtils.currentLine=59179143;
 //BA.debugLineNum = 59179143;BA.debugLine="Item2.fldTedadCarton=fldTedadKolSefaresh";
_item2.fldTedadCarton /*String*/  = _fldtedadkolsefaresh;
RDebugUtils.currentLine=59179144;
 //BA.debugLineNum = 59179144;BA.debugLine="ListFaktor.Add(Item2)";
mostCurrent._listfaktor.Add((Object)(_item2));
 };
 }
};
 };
RDebugUtils.currentLine=59179153;
 //BA.debugLineNum = 59179153;BA.debugLine="LblSumForoosh.Text=myCode.AdadToPrice(SumForoosh)";
mostCurrent._lblsumforoosh.setText(BA.ObjectToCharSequence(mostCurrent._mycode._adadtoprice /*String*/ (mostCurrent.activityBA,_sumforoosh)));
RDebugUtils.currentLine=59179154;
 //BA.debugLineNum = 59179154;BA.debugLine="LblSumSefaresh.Text=myCode.AdadToPrice(SumSefares";
mostCurrent._lblsumsefaresh.setText(BA.ObjectToCharSequence(mostCurrent._mycode._adadtoprice /*String*/ (mostCurrent.activityBA,_sumsefaresh)));
RDebugUtils.currentLine=59179155;
 //BA.debugLineNum = 59179155;BA.debugLine="LblSumBargasht.Text=myCode.AdadToPrice(SumBargash";
mostCurrent._lblsumbargasht.setText(BA.ObjectToCharSequence(mostCurrent._mycode._adadtoprice /*String*/ (mostCurrent.activityBA,_sumbargasht)));
RDebugUtils.currentLine=59179156;
 //BA.debugLineNum = 59179156;BA.debugLine="LblSumKhales.Text=myCode.AdadToPrice(SumKhales)";
mostCurrent._lblsumkhales.setText(BA.ObjectToCharSequence(mostCurrent._mycode._adadtoprice /*String*/ (mostCurrent.activityBA,_sumkhales)));
RDebugUtils.currentLine=59179157;
 //BA.debugLineNum = 59179157;BA.debugLine="LblName.Text = ListFaktor.Size & \" عدد\"";
mostCurrent._lblname.setText(BA.ObjectToCharSequence(BA.NumberToString(mostCurrent._listfaktor.getSize())+" عدد"));
RDebugUtils.currentLine=59179158;
 //BA.debugLineNum = 59179158;BA.debugLine="HLV.notifyDataSetChanged";
mostCurrent._hlv.notifyDataSetChanged();
RDebugUtils.currentLine=59179160;
 //BA.debugLineNum = 59179160;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="act_repfactors";
RDebugUtils.currentLine=59572224;
 //BA.debugLineNum = 59572224;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=59572226;
 //BA.debugLineNum = 59572226;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="act_repfactors";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=59441152;
 //BA.debugLineNum = 59441152;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=59441153;
 //BA.debugLineNum = 59441153;BA.debugLine="HLV.notifyDataSetChanged";
mostCurrent._hlv.notifyDataSetChanged();
RDebugUtils.currentLine=59441154;
 //BA.debugLineNum = 59441154;BA.debugLine="End Sub";
return "";
}
public static boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
RDebugUtils.currentModule="act_repfactors";
if (Debug.shouldDelegate(mostCurrent.activityBA, "application_error", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "application_error", new Object[] {_error,_stacktrace}));}
RDebugUtils.currentLine=59703296;
 //BA.debugLineNum = 59703296;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
RDebugUtils.currentLine=59703298;
 //BA.debugLineNum = 59703298;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=59703299;
 //BA.debugLineNum = 59703299;BA.debugLine="End Sub";
return false;
}
public static String  _btnlistprofile_click() throws Exception{
RDebugUtils.currentModule="act_repfactors";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnlistprofile_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnlistprofile_click", null));}
RDebugUtils.currentLine=59506688;
 //BA.debugLineNum = 59506688;BA.debugLine="Sub BtnListProfile_Click";
RDebugUtils.currentLine=59506690;
 //BA.debugLineNum = 59506690;BA.debugLine="End Sub";
return "";
}
public static String  _cmbvaziat_selectedindexchanged(int _index) throws Exception{
RDebugUtils.currentModule="act_repfactors";
if (Debug.shouldDelegate(mostCurrent.activityBA, "cmbvaziat_selectedindexchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "cmbvaziat_selectedindexchanged", new Object[] {_index}));}
RDebugUtils.currentLine=59768832;
 //BA.debugLineNum = 59768832;BA.debugLine="Private Sub CmbVaziat_SelectedIndexChanged (Index";
RDebugUtils.currentLine=59768833;
 //BA.debugLineNum = 59768833;BA.debugLine="Log(Index)";
anywheresoftware.b4a.keywords.Common.LogImpl("559768833",BA.NumberToString(_index),0);
RDebugUtils.currentLine=59768834;
 //BA.debugLineNum = 59768834;BA.debugLine="LoadData";
_loaddata();
RDebugUtils.currentLine=59768835;
 //BA.debugLineNum = 59768835;BA.debugLine="End Sub";
return "";
}
public static int  _hlv_getitemcount() throws Exception{
RDebugUtils.currentModule="act_repfactors";
if (Debug.shouldDelegate(mostCurrent.activityBA, "hlv_getitemcount", false))
	 {return ((Integer) Debug.delegate(mostCurrent.activityBA, "hlv_getitemcount", null));}
RDebugUtils.currentLine=59244544;
 //BA.debugLineNum = 59244544;BA.debugLine="Sub HLV_GetItemCount As Int 								        '💯 It";
RDebugUtils.currentLine=59244545;
 //BA.debugLineNum = 59244545;BA.debugLine="Return ListFaktor.Size";
if (true) return mostCurrent._listfaktor.getSize();
RDebugUtils.currentLine=59244546;
 //BA.debugLineNum = 59244546;BA.debugLine="End Sub";
return 0;
}
public static String  _hlv_onbindviewholder(anywheresoftware.b4a.objects.PanelWrapper _parent,int _position) throws Exception{
RDebugUtils.currentModule="act_repfactors";
if (Debug.shouldDelegate(mostCurrent.activityBA, "hlv_onbindviewholder", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "hlv_onbindviewholder", new Object[] {_parent,_position}));}
ir.parsikhesab.pakhsh.mcode._adapterlistfaktor _item = null;
ir.parsikhesab.pakhsh.cls_rec_factor _rec = null;
RDebugUtils.currentLine=59375616;
 //BA.debugLineNum = 59375616;BA.debugLine="Sub HLV_onBindViewHolder (Parent As Panel, Positio";
RDebugUtils.currentLine=59375617;
 //BA.debugLineNum = 59375617;BA.debugLine="Dim Item = ListFaktor.Get(Position) As AdapterLis";
_item = (ir.parsikhesab.pakhsh.mcode._adapterlistfaktor)(mostCurrent._listfaktor.Get(_position));
RDebugUtils.currentLine=59375618;
 //BA.debugLineNum = 59375618;BA.debugLine="Dim rec As Cls_Rec_Factor=Parent.Tag";
_rec = (ir.parsikhesab.pakhsh.cls_rec_factor)(_parent.getTag());
RDebugUtils.currentLine=59375619;
 //BA.debugLineNum = 59375619;BA.debugLine="rec.Show(Item,DateAz,DateTa)";
_rec._show /*String*/ (null,_item,_dateaz,_dateta);
RDebugUtils.currentLine=59375620;
 //BA.debugLineNum = 59375620;BA.debugLine="Parent.Height=rec.Height";
_parent.setHeight(_rec._getheight /*int*/ (null));
RDebugUtils.currentLine=59375621;
 //BA.debugLineNum = 59375621;BA.debugLine="End Sub";
return "";
}
public static String  _hlv_oncreateviewholder(anywheresoftware.b4a.objects.PanelWrapper _parent,int _viewtype) throws Exception{
RDebugUtils.currentModule="act_repfactors";
if (Debug.shouldDelegate(mostCurrent.activityBA, "hlv_oncreateviewholder", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "hlv_oncreateviewholder", new Object[] {_parent,_viewtype}));}
ir.parsikhesab.pakhsh.cls_rec_factor _rec = null;
RDebugUtils.currentLine=59310080;
 //BA.debugLineNum = 59310080;BA.debugLine="Sub HLV_onCreateViewHolder (Parent As Panel, ViewT";
RDebugUtils.currentLine=59310081;
 //BA.debugLineNum = 59310081;BA.debugLine="Dim rec As Cls_Rec_Factor";
_rec = new ir.parsikhesab.pakhsh.cls_rec_factor();
RDebugUtils.currentLine=59310082;
 //BA.debugLineNum = 59310082;BA.debugLine="rec.Initialize(Me)";
_rec._initialize /*String*/ (null,mostCurrent.activityBA,act_repfactors.getObject());
RDebugUtils.currentLine=59310083;
 //BA.debugLineNum = 59310083;BA.debugLine="Parent.AddView(rec.Panel,0,0,100%x,rec.Height)";
_parent.AddView((android.view.View)(_rec._getpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ (null).getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),_rec._getheight /*int*/ (null));
RDebugUtils.currentLine=59310084;
 //BA.debugLineNum = 59310084;BA.debugLine="Parent.Tag=rec";
_parent.setTag((Object)(_rec));
RDebugUtils.currentLine=59310085;
 //BA.debugLineNum = 59310085;BA.debugLine="End Sub";
return "";
}
public static String  _lblback_click() throws Exception{
RDebugUtils.currentModule="act_repfactors";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lblback_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lblback_click", null));}
RDebugUtils.currentLine=59637760;
 //BA.debugLineNum = 59637760;BA.debugLine="Sub LblBack_Click";
RDebugUtils.currentLine=59637761;
 //BA.debugLineNum = 59637761;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=59637762;
 //BA.debugLineNum = 59637762;BA.debugLine="End Sub";
return "";
}
}