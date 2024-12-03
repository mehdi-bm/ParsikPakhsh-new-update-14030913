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

public class act_notif extends Activity implements B4AActivity{
	public static act_notif mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.act_notif");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (act_notif).");
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
		activityBA = new BA(this, layout, processBA, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.act_notif");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "ir.parsikhesab.pakhsh.act_notif", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (act_notif) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (act_notif) Resume **");
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
		return act_notif.class;
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
            BA.LogInfo("** Activity (act_notif) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (act_notif) Pause event (activity is not paused). **");
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
            act_notif mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (act_notif) Resume **");
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
public wir.hitex.recycler.Hitex_LayoutView _hlv = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnl_hlv = null;
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
RDebugUtils.currentModule="act_notif";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=51773440;
 //BA.debugLineNum = 51773440;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=51773441;
 //BA.debugLineNum = 51773441;BA.debugLine="MCode.ListNotif.Initialize";
mostCurrent._mcode._listnotif /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=51773442;
 //BA.debugLineNum = 51773442;BA.debugLine="MCode.ListNotif.Clear";
mostCurrent._mcode._listnotif /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=51773443;
 //BA.debugLineNum = 51773443;BA.debugLine="Activity.LoadLayout(\"L_Notif\")";
mostCurrent._activity.LoadLayout("L_Notif",mostCurrent.activityBA);
RDebugUtils.currentLine=51773444;
 //BA.debugLineNum = 51773444;BA.debugLine="HLV.Initializer(\"HLV\").ListView.Build";
mostCurrent._hlv.Initializer(mostCurrent.activityBA,"HLV").ListView().Build();
RDebugUtils.currentLine=51773446;
 //BA.debugLineNum = 51773446;BA.debugLine="Pnl_HLV.AddView(HLV,0,5%y,Pnl_HLV.Width,Pnl_HLV.H";
mostCurrent._pnl_hlv.AddView((android.view.View)(mostCurrent._hlv.getObject()),(int) (0),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),mostCurrent.activityBA),mostCurrent._pnl_hlv.getWidth(),mostCurrent._pnl_hlv.getHeight());
RDebugUtils.currentLine=51773453;
 //BA.debugLineNum = 51773453;BA.debugLine="LoadData";
_loaddata();
RDebugUtils.currentLine=51773455;
 //BA.debugLineNum = 51773455;BA.debugLine="End Sub";
return "";
}
public static String  _loaddata() throws Exception{
RDebugUtils.currentModule="act_notif";
if (Debug.shouldDelegate(mostCurrent.activityBA, "loaddata", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "loaddata", null));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
int _i = 0;
ir.parsikhesab.pakhsh.mcode._adapterlistnotif _item = null;
RDebugUtils.currentLine=51838976;
 //BA.debugLineNum = 51838976;BA.debugLine="Sub LoadData";
RDebugUtils.currentLine=51838977;
 //BA.debugLineNum = 51838977;BA.debugLine="Dim cu As Cursor";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=51838979;
 //BA.debugLineNum = 51838979;BA.debugLine="MCode.ListNotif.Clear";
mostCurrent._mcode._listnotif /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=51838981;
 //BA.debugLineNum = 51838981;BA.debugLine="cu=MCode.Result(\"Select * from TblNotifi order by";
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * from TblNotifi order by Id desc");
RDebugUtils.currentLine=51838982;
 //BA.debugLineNum = 51838982;BA.debugLine="For i = 0 To cu.RowCount - 1";
{
final int step4 = 1;
final int limit4 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=51838983;
 //BA.debugLineNum = 51838983;BA.debugLine="Dim Item As AdapterListNotif";
_item = new ir.parsikhesab.pakhsh.mcode._adapterlistnotif();
RDebugUtils.currentLine=51838984;
 //BA.debugLineNum = 51838984;BA.debugLine="cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=51838985;
 //BA.debugLineNum = 51838985;BA.debugLine="Item.FldId=cu.GetInt(\"Id\")";
_item.FldId /*String*/  = BA.NumberToString(_cu.GetInt("Id"));
RDebugUtils.currentLine=51838986;
 //BA.debugLineNum = 51838986;BA.debugLine="Item.FldTitle=cu.GetString(\"FldTitle\")";
_item.FldTitle /*String*/  = _cu.GetString("FldTitle");
RDebugUtils.currentLine=51838987;
 //BA.debugLineNum = 51838987;BA.debugLine="Item.FldBody=cu.GetString(\"FldBody\")";
_item.FldBody /*String*/  = _cu.GetString("FldBody");
RDebugUtils.currentLine=51838988;
 //BA.debugLineNum = 51838988;BA.debugLine="Item.FldDate=cu.GetString(\"FldDate\")";
_item.FldDate /*String*/  = _cu.GetString("FldDate");
RDebugUtils.currentLine=51838989;
 //BA.debugLineNum = 51838989;BA.debugLine="Item.FldTime=cu.GetString(\"FldTime\")";
_item.FldTime /*String*/  = _cu.GetString("FldTime");
RDebugUtils.currentLine=51838990;
 //BA.debugLineNum = 51838990;BA.debugLine="MCode.ListNotif.Add(Item)";
mostCurrent._mcode._listnotif /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_item));
 }
};
RDebugUtils.currentLine=51838992;
 //BA.debugLineNum = 51838992;BA.debugLine="CreateListView";
_createlistview();
RDebugUtils.currentLine=51838993;
 //BA.debugLineNum = 51838993;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="act_notif";
RDebugUtils.currentLine=51970048;
 //BA.debugLineNum = 51970048;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=51970050;
 //BA.debugLineNum = 51970050;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="act_notif";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=51904512;
 //BA.debugLineNum = 51904512;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=51904514;
 //BA.debugLineNum = 51904514;BA.debugLine="End Sub";
return "";
}
public static String  _btn_back_click() throws Exception{
RDebugUtils.currentModule="act_notif";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_back_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_back_click", null));}
RDebugUtils.currentLine=52297728;
 //BA.debugLineNum = 52297728;BA.debugLine="Sub btn_Back_Click";
RDebugUtils.currentLine=52297729;
 //BA.debugLineNum = 52297729;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=52297730;
 //BA.debugLineNum = 52297730;BA.debugLine="End Sub";
return "";
}
public static String  _createlistview() throws Exception{
RDebugUtils.currentModule="act_notif";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createlistview", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "createlistview", null));}
RDebugUtils.currentLine=52035584;
 //BA.debugLineNum = 52035584;BA.debugLine="Sub CreateListView";
RDebugUtils.currentLine=52035585;
 //BA.debugLineNum = 52035585;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=52035586;
 //BA.debugLineNum = 52035586;BA.debugLine="If MCode.ListNotif.Size>0 Then";
if (mostCurrent._mcode._listnotif /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=52035587;
 //BA.debugLineNum = 52035587;BA.debugLine="HLV.Show";
mostCurrent._hlv.Show();
 }else {
RDebugUtils.currentLine=52035589;
 //BA.debugLineNum = 52035589;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=52035590;
 //BA.debugLineNum = 52035590;BA.debugLine="ToastMessageShow(\"اعلانی وجود ندارد\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("اعلانی وجود ندارد"),anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=52035592;
 //BA.debugLineNum = 52035592;BA.debugLine="End Sub";
return "";
}
public static int  _hlv_getitemcount() throws Exception{
RDebugUtils.currentModule="act_notif";
if (Debug.shouldDelegate(mostCurrent.activityBA, "hlv_getitemcount", false))
	 {return ((Integer) Debug.delegate(mostCurrent.activityBA, "hlv_getitemcount", null));}
RDebugUtils.currentLine=52101120;
 //BA.debugLineNum = 52101120;BA.debugLine="Sub HLV_GetItemCount As Int 								        '💯 It";
RDebugUtils.currentLine=52101121;
 //BA.debugLineNum = 52101121;BA.debugLine="Return MCode.ListNotif.Size";
if (true) return mostCurrent._mcode._listnotif /*anywheresoftware.b4a.objects.collections.List*/ .getSize();
RDebugUtils.currentLine=52101122;
 //BA.debugLineNum = 52101122;BA.debugLine="End Sub";
return 0;
}
public static String  _hlv_onbindviewholder(anywheresoftware.b4a.objects.PanelWrapper _parent,int _position) throws Exception{
RDebugUtils.currentModule="act_notif";
if (Debug.shouldDelegate(mostCurrent.activityBA, "hlv_onbindviewholder", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "hlv_onbindviewholder", new Object[] {_parent,_position}));}
ir.parsikhesab.pakhsh.mcode._adapterlistnotif _item = null;
ir.parsikhesab.pakhsh.cls_recnotif _rec = null;
RDebugUtils.currentLine=52232192;
 //BA.debugLineNum = 52232192;BA.debugLine="Sub HLV_onBindViewHolder (Parent As Panel, Positio";
RDebugUtils.currentLine=52232193;
 //BA.debugLineNum = 52232193;BA.debugLine="Dim Item = MCode.ListNotif.Get(Position) As Adapt";
_item = (ir.parsikhesab.pakhsh.mcode._adapterlistnotif)(mostCurrent._mcode._listnotif /*anywheresoftware.b4a.objects.collections.List*/ .Get(_position));
RDebugUtils.currentLine=52232194;
 //BA.debugLineNum = 52232194;BA.debugLine="Dim rec As cls_RecNotif=Parent.Tag";
_rec = (ir.parsikhesab.pakhsh.cls_recnotif)(_parent.getTag());
RDebugUtils.currentLine=52232195;
 //BA.debugLineNum = 52232195;BA.debugLine="rec.show_data(Item)";
_rec._show_data /*String*/ (null,_item);
RDebugUtils.currentLine=52232196;
 //BA.debugLineNum = 52232196;BA.debugLine="Parent.Height=rec.Height";
_parent.setHeight(_rec._getheight /*int*/ (null));
RDebugUtils.currentLine=52232197;
 //BA.debugLineNum = 52232197;BA.debugLine="End Sub";
return "";
}
public static String  _hlv_oncreateviewholder(anywheresoftware.b4a.objects.PanelWrapper _parent,int _viewtype) throws Exception{
RDebugUtils.currentModule="act_notif";
if (Debug.shouldDelegate(mostCurrent.activityBA, "hlv_oncreateviewholder", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "hlv_oncreateviewholder", new Object[] {_parent,_viewtype}));}
ir.parsikhesab.pakhsh.cls_recnotif _rec = null;
RDebugUtils.currentLine=52166656;
 //BA.debugLineNum = 52166656;BA.debugLine="Sub HLV_onCreateViewHolder (Parent As Panel, ViewT";
RDebugUtils.currentLine=52166657;
 //BA.debugLineNum = 52166657;BA.debugLine="Dim rec As cls_RecNotif";
_rec = new ir.parsikhesab.pakhsh.cls_recnotif();
RDebugUtils.currentLine=52166658;
 //BA.debugLineNum = 52166658;BA.debugLine="rec.Initialize";
_rec._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=52166659;
 //BA.debugLineNum = 52166659;BA.debugLine="Parent.AddView(rec.Panel,0,0,100%x,rec.Height)";
_parent.AddView((android.view.View)(_rec._getpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ (null).getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),_rec._getheight /*int*/ (null));
RDebugUtils.currentLine=52166660;
 //BA.debugLineNum = 52166660;BA.debugLine="Parent.Tag=rec";
_parent.setTag((Object)(_rec));
RDebugUtils.currentLine=52166661;
 //BA.debugLineNum = 52166661;BA.debugLine="End Sub";
return "";
}
}