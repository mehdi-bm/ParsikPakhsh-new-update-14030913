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

public class act_reportsoorathesab extends Activity implements B4AActivity{
	public static act_reportsoorathesab mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.act_reportsoorathesab");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (act_reportsoorathesab).");
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
		activityBA = new BA(this, layout, processBA, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.act_reportsoorathesab");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "ir.parsikhesab.pakhsh.act_reportsoorathesab", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (act_reportsoorathesab) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (act_reportsoorathesab) Resume **");
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
		return act_reportsoorathesab.class;
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
            BA.LogInfo("** Activity (act_reportsoorathesab) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (act_reportsoorathesab) Pause event (activity is not paused). **");
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
            act_reportsoorathesab mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (act_reportsoorathesab) Resume **");
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
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public ir.parsikhesab.pakhsh.b4xdialog _dialog = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _base = null;
public ir.parsikhesab.pakhsh.b4xsearchtemplate _searchtemplate = null;
public ir.parsikhesab.pakhsh.table _table1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlgrid = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel1 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnaz = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnta = null;
public static String _dateaz = "";
public static String _dateta = "";
public anywheresoftware.b4a.objects.collections.List _lstreport = null;
public static long[] _titlereport = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblsumbedehkar = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblsumbestankar = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblsummande = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_selashkhas = null;
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
RDebugUtils.currentModule="act_reportsoorathesab";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
anywheresoftware.b4a.objects.collections.List _items = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
int _i = 0;
String _name = "";
RDebugUtils.currentLine=62259200;
 //BA.debugLineNum = 62259200;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=62259201;
 //BA.debugLineNum = 62259201;BA.debugLine="Activity.LoadLayout(\"l_reportsoorathesab\")";
mostCurrent._activity.LoadLayout("l_reportsoorathesab",mostCurrent.activityBA);
RDebugUtils.currentLine=62259202;
 //BA.debugLineNum = 62259202;BA.debugLine="LstReport.Initialize";
mostCurrent._lstreport.Initialize();
RDebugUtils.currentLine=62259204;
 //BA.debugLineNum = 62259204;BA.debugLine="Base = Activity";
mostCurrent._base = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(mostCurrent._activity.getObject()));
RDebugUtils.currentLine=62259205;
 //BA.debugLineNum = 62259205;BA.debugLine="Dialog.Initialize (Panel1)";
mostCurrent._dialog._initialize /*String*/ (null,mostCurrent.activityBA,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(mostCurrent._panel1.getObject())));
RDebugUtils.currentLine=62259206;
 //BA.debugLineNum = 62259206;BA.debugLine="Dialog.Title = \"جستجو\"";
mostCurrent._dialog._title /*Object*/  = (Object)("جستجو");
RDebugUtils.currentLine=62259207;
 //BA.debugLineNum = 62259207;BA.debugLine="SearchTemplate.Initialize";
mostCurrent._searchtemplate._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=62259208;
 //BA.debugLineNum = 62259208;BA.debugLine="Dim Items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=62259209;
 //BA.debugLineNum = 62259209;BA.debugLine="Items.Initialize";
_items.Initialize();
RDebugUtils.currentLine=62259210;
 //BA.debugLineNum = 62259210;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From Tb";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblAshkhas ");
RDebugUtils.currentLine=62259211;
 //BA.debugLineNum = 62259211;BA.debugLine="For i=0 To Cu.RowCount-1";
{
final int step10 = 1;
final int limit10 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit10 ;_i = _i + step10 ) {
RDebugUtils.currentLine=62259212;
 //BA.debugLineNum = 62259212;BA.debugLine="Cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=62259213;
 //BA.debugLineNum = 62259213;BA.debugLine="Dim Name As String =  Cu.GetString(\"fldSharheTaf";
_name = _cu.GetString("fldSharheTafzili");
RDebugUtils.currentLine=62259214;
 //BA.debugLineNum = 62259214;BA.debugLine="Items.Add(Name)";
_items.Add((Object)(_name));
 }
};
RDebugUtils.currentLine=62259216;
 //BA.debugLineNum = 62259216;BA.debugLine="SearchTemplate.SetItems(Items)";
mostCurrent._searchtemplate._setitems /*Object*/ (null,_items);
RDebugUtils.currentLine=62259217;
 //BA.debugLineNum = 62259217;BA.debugLine="SearchTemplate.GetPanel(Dialog).BringToFront";
mostCurrent._searchtemplate._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,mostCurrent._dialog).BringToFront();
RDebugUtils.currentLine=62259219;
 //BA.debugLineNum = 62259219;BA.debugLine="MCode.C_Tafzili=0";
mostCurrent._mcode._c_tafzili /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=62259220;
 //BA.debugLineNum = 62259220;BA.debugLine="End Sub";
return "";
}
public static boolean  _activity_keypress(int _keycode) throws Exception{
RDebugUtils.currentModule="act_reportsoorathesab";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_keypress", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "activity_keypress", new Object[] {_keycode}));}
RDebugUtils.currentLine=62521344;
 //BA.debugLineNum = 62521344;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
RDebugUtils.currentLine=62521345;
 //BA.debugLineNum = 62521345;BA.debugLine="If KeyCode=KeyCodes.KEYCODE_BACK Then";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK) { 
RDebugUtils.currentLine=62521346;
 //BA.debugLineNum = 62521346;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 }else {
RDebugUtils.currentLine=62521348;
 //BA.debugLineNum = 62521348;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 };
RDebugUtils.currentLine=62521350;
 //BA.debugLineNum = 62521350;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=62521351;
 //BA.debugLineNum = 62521351;BA.debugLine="End Sub";
return false;
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="act_reportsoorathesab";
RDebugUtils.currentLine=62455808;
 //BA.debugLineNum = 62455808;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=62455810;
 //BA.debugLineNum = 62455810;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="act_reportsoorathesab";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=62390272;
 //BA.debugLineNum = 62390272;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=62390274;
 //BA.debugLineNum = 62390274;BA.debugLine="End Sub";
return "";
}
public static String  _animatedialog(ir.parsikhesab.pakhsh.b4xdialog _dlg,String _fromedge) throws Exception{
RDebugUtils.currentModule="act_reportsoorathesab";
if (Debug.shouldDelegate(mostCurrent.activityBA, "animatedialog", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "animatedialog", new Object[] {_dlg,_fromedge}));}
int _top = 0;
int _left = 0;
RDebugUtils.currentLine=63307776;
 //BA.debugLineNum = 63307776;BA.debugLine="Sub AnimateDialog (dlg As B4XDialog, FromEdge As S";
RDebugUtils.currentLine=63307777;
 //BA.debugLineNum = 63307777;BA.debugLine="Dim Base As B4XView = dlg.Base";
mostCurrent._base = new anywheresoftware.b4a.objects.B4XViewWrapper();
mostCurrent._base = _dlg._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=63307778;
 //BA.debugLineNum = 63307778;BA.debugLine="Dim top As Int = Base.Top";
_top = mostCurrent._base.getTop();
RDebugUtils.currentLine=63307779;
 //BA.debugLineNum = 63307779;BA.debugLine="Dim left As Int = Base.Left";
_left = mostCurrent._base.getLeft();
RDebugUtils.currentLine=63307780;
 //BA.debugLineNum = 63307780;BA.debugLine="Select FromEdge.ToLowerCase";
switch (BA.switchObjectToInt(_fromedge.toLowerCase(),"bottom","top","left","right")) {
case 0: {
RDebugUtils.currentLine=63307782;
 //BA.debugLineNum = 63307782;BA.debugLine="Base.Top = Base.Parent.Height";
mostCurrent._base.setTop(mostCurrent._base.getParent().getHeight());
 break; }
case 1: {
RDebugUtils.currentLine=63307784;
 //BA.debugLineNum = 63307784;BA.debugLine="Base.Top = -Base.Height";
mostCurrent._base.setTop((int) (-mostCurrent._base.getHeight()));
 break; }
case 2: {
RDebugUtils.currentLine=63307786;
 //BA.debugLineNum = 63307786;BA.debugLine="Base.Left = -Base.Width";
mostCurrent._base.setLeft((int) (-mostCurrent._base.getWidth()));
 break; }
case 3: {
RDebugUtils.currentLine=63307788;
 //BA.debugLineNum = 63307788;BA.debugLine="Base.Left = Base.Parent.Width";
mostCurrent._base.setLeft(mostCurrent._base.getParent().getWidth());
 break; }
}
;
RDebugUtils.currentLine=63307790;
 //BA.debugLineNum = 63307790;BA.debugLine="Base.SetLayoutAnimated(300, left, top, Base.Width";
mostCurrent._base.SetLayoutAnimated((int) (300),_left,_top,mostCurrent._base.getWidth(),mostCurrent._base.getHeight());
RDebugUtils.currentLine=63307791;
 //BA.debugLineNum = 63307791;BA.debugLine="End Sub";
return "";
}
public static boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
RDebugUtils.currentModule="act_reportsoorathesab";
if (Debug.shouldDelegate(mostCurrent.activityBA, "application_error", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "application_error", new Object[] {_error,_stacktrace}));}
RDebugUtils.currentLine=63438848;
 //BA.debugLineNum = 63438848;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
RDebugUtils.currentLine=63438850;
 //BA.debugLineNum = 63438850;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=63438851;
 //BA.debugLineNum = 63438851;BA.debugLine="End Sub";
return false;
}
public static void  _btn_selashkhas_click() throws Exception{
RDebugUtils.currentModule="act_reportsoorathesab";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_selashkhas_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "btn_selashkhas_click", null); return;}
ResumableSub_Btn_SelAshkhas_Click rsub = new ResumableSub_Btn_SelAshkhas_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Btn_SelAshkhas_Click extends BA.ResumableSub {
public ResumableSub_Btn_SelAshkhas_Click(ir.parsikhesab.pakhsh.act_reportsoorathesab parent) {
this.parent = parent;
}
ir.parsikhesab.pakhsh.act_reportsoorathesab parent;
Object _rs = null;
int _result = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_reportsoorathesab";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=63242243;
 //BA.debugLineNum = 63242243;BA.debugLine="Panel1.BringToFront";
parent.mostCurrent._panel1.BringToFront();
RDebugUtils.currentLine=63242244;
 //BA.debugLineNum = 63242244;BA.debugLine="Panel1.Visible=True";
parent.mostCurrent._panel1.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=63242245;
 //BA.debugLineNum = 63242245;BA.debugLine="SearchTemplate.SearchField.HintText=\"نام مشتری\"";
parent.mostCurrent._searchtemplate._searchfield /*ir.parsikhesab.pakhsh.b4xfloattextfield*/ ._hinttext /*String*/  = "نام مشتری";
RDebugUtils.currentLine=63242246;
 //BA.debugLineNum = 63242246;BA.debugLine="SearchTemplate.SearchField.lblClear.Text=\"\"";
parent.mostCurrent._searchtemplate._searchfield /*ir.parsikhesab.pakhsh.b4xfloattextfield*/ ._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=63242247;
 //BA.debugLineNum = 63242247;BA.debugLine="SearchTemplate.SearchField.lblV.Text=\"\"";
parent.mostCurrent._searchtemplate._searchfield /*ir.parsikhesab.pakhsh.b4xfloattextfield*/ ._lblv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=63242248;
 //BA.debugLineNum = 63242248;BA.debugLine="SearchTemplate.SearchField.Update";
parent.mostCurrent._searchtemplate._searchfield /*ir.parsikhesab.pakhsh.b4xfloattextfield*/ ._update /*String*/ (null);
RDebugUtils.currentLine=63242249;
 //BA.debugLineNum = 63242249;BA.debugLine="Dim rs As Object = Dialog.ShowTemplate(SearchTemp";
_rs = parent.mostCurrent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(parent.mostCurrent._searchtemplate),(Object)(""),(Object)(""),(Object)("انصراف"));
RDebugUtils.currentLine=63242250;
 //BA.debugLineNum = 63242250;BA.debugLine="AnimateDialog(Dialog, \"right\")";
_animatedialog(parent.mostCurrent._dialog,"right");
RDebugUtils.currentLine=63242251;
 //BA.debugLineNum = 63242251;BA.debugLine="Wait For (rs) Complete (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_reportsoorathesab", "btn_selashkhas_click"), _rs);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=63242252;
 //BA.debugLineNum = 63242252;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_result==parent.mostCurrent._xui.DialogResponse_Positive) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=63242253;
 //BA.debugLineNum = 63242253;BA.debugLine="Btn_SelAshkhas.Text = SearchTemplate.SelectedIte";
parent.mostCurrent._btn_selashkhas.setText(BA.ObjectToCharSequence(parent.mostCurrent._searchtemplate._selecteditem /*String*/ ));
RDebugUtils.currentLine=63242254;
 //BA.debugLineNum = 63242254;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From T";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = parent.mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblAshkhas where fldSharheTafzili='"+parent.mostCurrent._btn_selashkhas.getText()+"'");
RDebugUtils.currentLine=63242255;
 //BA.debugLineNum = 63242255;BA.debugLine="Cu.Position=0";
_cu.setPosition((int) (0));
RDebugUtils.currentLine=63242256;
 //BA.debugLineNum = 63242256;BA.debugLine="MCode.C_Tafzili =  Cu.GetString(\"fldCodetafzili\"";
parent.mostCurrent._mcode._c_tafzili /*String*/  = _cu.GetString("fldCodetafzili");
RDebugUtils.currentLine=63242257;
 //BA.debugLineNum = 63242257;BA.debugLine="Log(\"کد مشتری : \"&Cu.GetString(\"fldCodetafzili\")";
anywheresoftware.b4a.keywords.Common.LogImpl("563242257","کد مشتری : "+_cu.GetString("fldCodetafzili"),0);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=63242259;
 //BA.debugLineNum = 63242259;BA.debugLine="Btn_SelAshkhas.Text = \"انتخاب مشتری\"";
parent.mostCurrent._btn_selashkhas.setText(BA.ObjectToCharSequence("انتخاب مشتری"));
RDebugUtils.currentLine=63242260;
 //BA.debugLineNum = 63242260;BA.debugLine="MCode.C_Tafzili=0";
parent.mostCurrent._mcode._c_tafzili /*String*/  = BA.NumberToString(0);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=63242262;
 //BA.debugLineNum = 63242262;BA.debugLine="Panel1.Visible=False";
parent.mostCurrent._panel1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=63242263;
 //BA.debugLineNum = 63242263;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _btnaz_click() throws Exception{
RDebugUtils.currentModule="act_reportsoorathesab";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnaz_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnaz_click", null));}
com.porya.datetimepicker.PersianMaterialDatePickerWrapper _p = null;
RDebugUtils.currentLine=62717952;
 //BA.debugLineNum = 62717952;BA.debugLine="Sub BtnAz_Click";
RDebugUtils.currentLine=62717953;
 //BA.debugLineNum = 62717953;BA.debugLine="Dim p As PersianMaterialDatePicker";
_p = new com.porya.datetimepicker.PersianMaterialDatePickerWrapper();
RDebugUtils.currentLine=62717954;
 //BA.debugLineNum = 62717954;BA.debugLine="p.Initialize(\"p\",p.PersianYear,p.PersianMonth,p.P";
_p.Initialize(mostCurrent.activityBA,"p",_p.getPersianYear(),_p.getPersianMonth(),_p.getPersianDay());
RDebugUtils.currentLine=62717955;
 //BA.debugLineNum = 62717955;BA.debugLine="p.AccentColor = Colors.RGB(83,99,255)";
_p.setAccentColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (83),(int) (99),(int) (255)));
RDebugUtils.currentLine=62717956;
 //BA.debugLineNum = 62717956;BA.debugLine="p.OkText = \"تایید\"";
_p.setOkText("تایید");
RDebugUtils.currentLine=62717957;
 //BA.debugLineNum = 62717957;BA.debugLine="p.CancelText = \"لغو\"";
_p.setCancelText("لغو");
RDebugUtils.currentLine=62717958;
 //BA.debugLineNum = 62717958;BA.debugLine="p.Title = \"از تاریخ\"";
_p.setTitle("از تاریخ");
RDebugUtils.currentLine=62717959;
 //BA.debugLineNum = 62717959;BA.debugLine="p.Typeface = \"iransansmonospacednum.ttf\"";
_p.setTypeface("iransansmonospacednum.ttf");
RDebugUtils.currentLine=62717960;
 //BA.debugLineNum = 62717960;BA.debugLine="p.Show(\"p\")";
_p.Show("p");
RDebugUtils.currentLine=62717961;
 //BA.debugLineNum = 62717961;BA.debugLine="End Sub";
return "";
}
public static String  _btnreport_click() throws Exception{
RDebugUtils.currentModule="act_reportsoorathesab";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnreport_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnreport_click", null));}
RDebugUtils.currentLine=62586880;
 //BA.debugLineNum = 62586880;BA.debugLine="Sub BtnReport_Click";
RDebugUtils.currentLine=62586881;
 //BA.debugLineNum = 62586881;BA.debugLine="If MCode.Sf.Len(BtnAz.Tag) = 8 And MCode.Sf.Len(B";
if (mostCurrent._mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvv1(BA.ObjectToString(mostCurrent._btnaz.getTag()))==8 && mostCurrent._mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvv1(BA.ObjectToString(mostCurrent._btnta.getTag()))==8) { 
RDebugUtils.currentLine=62586882;
 //BA.debugLineNum = 62586882;BA.debugLine="ProgressDialogShow2(\"در حال دریافت اطلاعات . . .";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(mostCurrent.activityBA,BA.ObjectToCharSequence("در حال دریافت اطلاعات . . ."),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=62586884;
 //BA.debugLineNum = 62586884;BA.debugLine="CallSubDelayed3(Service_Server,\"GetSooratHesab\",";
anywheresoftware.b4a.keywords.Common.CallSubDelayed3(processBA,(Object)(mostCurrent._service_server.getObject()),"GetSooratHesab",(Object)(mostCurrent._mcode._convertnumberspersian2english /*String*/ (mostCurrent.activityBA,mostCurrent._dateaz)),(Object)(mostCurrent._mcode._convertnumberspersian2english /*String*/ (mostCurrent.activityBA,mostCurrent._dateta)));
 }else {
RDebugUtils.currentLine=62586886;
 //BA.debugLineNum = 62586886;BA.debugLine="ToastMessageShow(\"تاریخ را به طور صحیح وارد نمای";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("تاریخ را به طور صحیح وارد نمایید"),anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=62586888;
 //BA.debugLineNum = 62586888;BA.debugLine="End Sub";
return "";
}
public static String  _btnta_click() throws Exception{
RDebugUtils.currentModule="act_reportsoorathesab";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnta_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnta_click", null));}
com.porya.datetimepicker.PersianMaterialDatePickerWrapper _p1 = null;
RDebugUtils.currentLine=62849024;
 //BA.debugLineNum = 62849024;BA.debugLine="Sub BtnTa_Click";
RDebugUtils.currentLine=62849025;
 //BA.debugLineNum = 62849025;BA.debugLine="Dim p1 As PersianMaterialDatePicker";
_p1 = new com.porya.datetimepicker.PersianMaterialDatePickerWrapper();
RDebugUtils.currentLine=62849026;
 //BA.debugLineNum = 62849026;BA.debugLine="p1.Initialize(\"p1\",p1.PersianYear,p1.PersianMonth";
_p1.Initialize(mostCurrent.activityBA,"p1",_p1.getPersianYear(),_p1.getPersianMonth(),_p1.getPersianDay());
RDebugUtils.currentLine=62849027;
 //BA.debugLineNum = 62849027;BA.debugLine="p1.AccentColor = Colors.RGB(83,99,255)";
_p1.setAccentColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (83),(int) (99),(int) (255)));
RDebugUtils.currentLine=62849028;
 //BA.debugLineNum = 62849028;BA.debugLine="p1.OkText = \"تایید\"";
_p1.setOkText("تایید");
RDebugUtils.currentLine=62849029;
 //BA.debugLineNum = 62849029;BA.debugLine="p1.CancelText = \"لغو\"";
_p1.setCancelText("لغو");
RDebugUtils.currentLine=62849030;
 //BA.debugLineNum = 62849030;BA.debugLine="p1.Title = \"تا تاریخ\"";
_p1.setTitle("تا تاریخ");
RDebugUtils.currentLine=62849031;
 //BA.debugLineNum = 62849031;BA.debugLine="p1.Typeface = \"iransansmonospacednum.ttf\"";
_p1.setTypeface("iransansmonospacednum.ttf");
RDebugUtils.currentLine=62849032;
 //BA.debugLineNum = 62849032;BA.debugLine="p1.Show(\"p1\")";
_p1.Show("p1");
RDebugUtils.currentLine=62849033;
 //BA.debugLineNum = 62849033;BA.debugLine="End Sub";
return "";
}
public static String  _creategrid() throws Exception{
RDebugUtils.currentModule="act_reportsoorathesab";
if (Debug.shouldDelegate(mostCurrent.activityBA, "creategrid", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "creategrid", null));}
anywheresoftware.b4a.objects.collections.List _lst_colnametitle = null;
RDebugUtils.currentLine=62324736;
 //BA.debugLineNum = 62324736;BA.debugLine="Sub CreateGrid";
RDebugUtils.currentLine=62324737;
 //BA.debugLineNum = 62324737;BA.debugLine="PnlGrid.RemoveAllViews";
mostCurrent._pnlgrid.RemoveAllViews();
RDebugUtils.currentLine=62324738;
 //BA.debugLineNum = 62324738;BA.debugLine="Table1.Initialize(Me,\"Table1\",9)";
mostCurrent._table1._initialize /*String*/ (null,mostCurrent.activityBA,act_reportsoorathesab.getObject(),"Table1",(int) (9));
RDebugUtils.currentLine=62324739;
 //BA.debugLineNum = 62324739;BA.debugLine="Table1.AddToActivity(PnlGrid, 0,0,100%x,PnlGrid.H";
mostCurrent._table1._addtoactivity /*String*/ (null,(anywheresoftware.b4a.objects.ActivityWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ActivityWrapper(), (anywheresoftware.b4a.BALayout)(mostCurrent._pnlgrid.getObject())),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),mostCurrent._pnlgrid.getHeight());
RDebugUtils.currentLine=62324741;
 //BA.debugLineNum = 62324741;BA.debugLine="Dim Lst_ColNameTitle As List";
_lst_colnametitle = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=62324742;
 //BA.debugLineNum = 62324742;BA.debugLine="Lst_ColNameTitle.Initialize";
_lst_colnametitle.Initialize();
RDebugUtils.currentLine=62324743;
 //BA.debugLineNum = 62324743;BA.debugLine="Lst_ColNameTitle.AddAll(Array As String(\"مانده\",\"";
_lst_colnametitle.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"مانده","مبلغ بستانکاری","مبلغ بدهکاری","تاریخ","ریز.سند","شرح","ش.سند","ش","ردیف"}));
RDebugUtils.currentLine=62324746;
 //BA.debugLineNum = 62324746;BA.debugLine="Table1.LoadSListSoorathesab(LstReport,Lst_ColName";
mostCurrent._table1._loadslistsoorathesab /*String*/ (null,mostCurrent._lstreport,_lst_colnametitle,(int) (9));
RDebugUtils.currentLine=62324747;
 //BA.debugLineNum = 62324747;BA.debugLine="Table1.SetColumnsWidths(Array As Int(22%x, 22%x,2";
mostCurrent._table1._setcolumnswidths /*String*/ (null,new int[]{anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (22),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (22),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (22),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (22),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (22),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (33),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (14),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (14),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (14),mostCurrent.activityBA)});
RDebugUtils.currentLine=62324748;
 //BA.debugLineNum = 62324748;BA.debugLine="Table1.SetHeader(Array As String(\"مانده\",\"مبلغ بس";
mostCurrent._table1._setheader /*String*/ (null,new String[]{"مانده","مبلغ بستانکاری","مبلغ بدهکاری","تاریخ","ریز.سند","شرح","ش.سند","ش","ردیف"},new int[]{anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (22),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (22),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (22),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (22),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (22),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (33),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (14),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (14),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (14),mostCurrent.activityBA)});
RDebugUtils.currentLine=62324750;
 //BA.debugLineNum = 62324750;BA.debugLine="LblSumBedehkar.Text = NumberFormat(TitleReport(0)";
mostCurrent._lblsumbedehkar.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.NumberFormat(_titlereport[(int) (0)],(int) (1),(int) (3))+" ریال "));
RDebugUtils.currentLine=62324751;
 //BA.debugLineNum = 62324751;BA.debugLine="LblSumBestankar.Text = NumberFormat(TitleReport(1";
mostCurrent._lblsumbestankar.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.NumberFormat(_titlereport[(int) (1)],(int) (1),(int) (3))+" ریال "));
RDebugUtils.currentLine=62324752;
 //BA.debugLineNum = 62324752;BA.debugLine="LblSumMande.Text = NumberFormat(TitleReport(2),1,";
mostCurrent._lblsummande.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.NumberFormat(_titlereport[(int) (2)],(int) (1),(int) (3))+" ریال "));
RDebugUtils.currentLine=62324755;
 //BA.debugLineNum = 62324755;BA.debugLine="End Sub";
return "";
}
public static String  _createlist(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
RDebugUtils.currentModule="act_reportsoorathesab";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createlist", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "createlist", new Object[] {_lst}));}
long _mande = 0L;
anywheresoftware.b4a.objects.collections.Map _coljroot = null;
ir.parsikhesab.pakhsh.mcode._adapterreportsoorathesab _item = null;
RDebugUtils.currentLine=62652416;
 //BA.debugLineNum = 62652416;BA.debugLine="Sub CreateList(Lst As List)";
RDebugUtils.currentLine=62652417;
 //BA.debugLineNum = 62652417;BA.debugLine="LstReport.Clear";
mostCurrent._lstreport.Clear();
RDebugUtils.currentLine=62652418;
 //BA.debugLineNum = 62652418;BA.debugLine="TitleReport(0) = 0";
_titlereport[(int) (0)] = (long) (0);
RDebugUtils.currentLine=62652419;
 //BA.debugLineNum = 62652419;BA.debugLine="TitleReport(1) = 0";
_titlereport[(int) (1)] = (long) (0);
RDebugUtils.currentLine=62652420;
 //BA.debugLineNum = 62652420;BA.debugLine="TitleReport(2) = 0";
_titlereport[(int) (2)] = (long) (0);
RDebugUtils.currentLine=62652421;
 //BA.debugLineNum = 62652421;BA.debugLine="Dim mande As Long=0";
_mande = (long) (0);
RDebugUtils.currentLine=62652422;
 //BA.debugLineNum = 62652422;BA.debugLine="For Each coljRoot As Map In Lst";
_coljroot = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group6 = _lst;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_coljroot = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group6.Get(index6)));
RDebugUtils.currentLine=62652423;
 //BA.debugLineNum = 62652423;BA.debugLine="Dim Item As AdapterReportSooratHesab";
_item = new ir.parsikhesab.pakhsh.mcode._adapterreportsoorathesab();
RDebugUtils.currentLine=62652424;
 //BA.debugLineNum = 62652424;BA.debugLine="Item.fldRadif =  coljRoot.Get(\"fldRadif\")";
_item.fldRadif /*String*/  = BA.ObjectToString(_coljroot.Get((Object)("fldRadif")));
RDebugUtils.currentLine=62652425;
 //BA.debugLineNum = 62652425;BA.debugLine="Item.shomare = myCode.Is_Null(coljRoot.Get(\"shom";
_item.shomare /*String*/  = mostCurrent._mycode._is_null /*String*/ (mostCurrent.activityBA,BA.ObjectToString(_coljroot.Get((Object)("shomare"))));
RDebugUtils.currentLine=62652426;
 //BA.debugLineNum = 62652426;BA.debugLine="Item.fldSanad =myCode.Is_Null(coljRoot.Get(\"fldS";
_item.fldSanad /*String*/  = mostCurrent._mycode._is_null /*String*/ (mostCurrent.activityBA,BA.ObjectToString(_coljroot.Get((Object)("fldSanad"))));
RDebugUtils.currentLine=62652427;
 //BA.debugLineNum = 62652427;BA.debugLine="Item.fldSharh =myCode.Is_Null(coljRoot.Get(\"fldS";
_item.fldSharh /*String*/  = mostCurrent._mycode._is_null /*String*/ (mostCurrent.activityBA,BA.ObjectToString(_coljroot.Get((Object)("fldSharh"))));
RDebugUtils.currentLine=62652428;
 //BA.debugLineNum = 62652428;BA.debugLine="Item.fldRiz =myCode.Is_Null(coljRoot.Get(\"fldRiz";
_item.fldRiz /*String*/  = mostCurrent._mycode._is_null /*String*/ (mostCurrent.activityBA,BA.ObjectToString(_coljroot.Get((Object)("fldRiz"))));
RDebugUtils.currentLine=62652429;
 //BA.debugLineNum = 62652429;BA.debugLine="Item.fldDate =myCode.Is_Null(coljRoot.Get(\"fldDa";
_item.fldDate /*String*/  = mostCurrent._mycode._is_null /*String*/ (mostCurrent.activityBA,BA.ObjectToString(_coljroot.Get((Object)("fldDate"))));
RDebugUtils.currentLine=62652430;
 //BA.debugLineNum = 62652430;BA.debugLine="Item.fldBedehkar =0";
_item.fldBedehkar /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=62652431;
 //BA.debugLineNum = 62652431;BA.debugLine="Item.fldBestankar =0";
_item.fldBestankar /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=62652434;
 //BA.debugLineNum = 62652434;BA.debugLine="LstReport.Add(Item)";
mostCurrent._lstreport.Add((Object)(_item));
RDebugUtils.currentLine=62652437;
 //BA.debugLineNum = 62652437;BA.debugLine="If myCode.Is_Null(coljRoot.Get(\"fldBedehkar\"))<>";
if ((mostCurrent._mycode._is_null /*String*/ (mostCurrent.activityBA,BA.ObjectToString(_coljroot.Get((Object)("fldBedehkar"))))).equals("") == false) { 
RDebugUtils.currentLine=62652438;
 //BA.debugLineNum = 62652438;BA.debugLine="Item.fldBedehkar =myCode.Is_Null(coljRoot.Get(\"";
_item.fldBedehkar /*String*/  = mostCurrent._mycode._is_null /*String*/ (mostCurrent.activityBA,BA.ObjectToString(_coljroot.Get((Object)("fldBedehkar"))));
RDebugUtils.currentLine=62652439;
 //BA.debugLineNum = 62652439;BA.debugLine="Log(coljRoot.Get(\"fldBedehkar\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("562652439",BA.ObjectToString(_coljroot.Get((Object)("fldBedehkar"))),0);
RDebugUtils.currentLine=62652440;
 //BA.debugLineNum = 62652440;BA.debugLine="TitleReport(0) = TitleReport(0) + coljRoot.Get(";
_titlereport[(int) (0)] = (long) (_titlereport[(int) (0)]+(double)(BA.ObjectToNumber(_coljroot.Get((Object)("fldBedehkar")))));
 };
RDebugUtils.currentLine=62652442;
 //BA.debugLineNum = 62652442;BA.debugLine="If myCode.Is_Null(coljRoot.Get(\"fldBestankar\"))<";
if ((mostCurrent._mycode._is_null /*String*/ (mostCurrent.activityBA,BA.ObjectToString(_coljroot.Get((Object)("fldBestankar"))))).equals("") == false) { 
RDebugUtils.currentLine=62652443;
 //BA.debugLineNum = 62652443;BA.debugLine="Item.fldBestankar =myCode.Is_Null(coljRoot.Get(";
_item.fldBestankar /*String*/  = mostCurrent._mycode._is_null /*String*/ (mostCurrent.activityBA,BA.ObjectToString(_coljroot.Get((Object)("fldBestankar"))));
RDebugUtils.currentLine=62652444;
 //BA.debugLineNum = 62652444;BA.debugLine="Log(coljRoot.Get(\"fldBestankar\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("562652444",BA.ObjectToString(_coljroot.Get((Object)("fldBestankar"))),0);
RDebugUtils.currentLine=62652445;
 //BA.debugLineNum = 62652445;BA.debugLine="TitleReport(1) = TitleReport(1) + coljRoot.Get(";
_titlereport[(int) (1)] = (long) (_titlereport[(int) (1)]+(double)(BA.ObjectToNumber(_coljroot.Get((Object)("fldBestankar")))));
 };
RDebugUtils.currentLine=62652447;
 //BA.debugLineNum = 62652447;BA.debugLine="If myCode.Check_Null_or_NotNumber(Item.fldBestan";
if (mostCurrent._mycode._check_null_or_notnumber /*boolean*/ (mostCurrent.activityBA,_item.fldBestankar /*String*/ )) { 
RDebugUtils.currentLine=62652448;
 //BA.debugLineNum = 62652448;BA.debugLine="mande=mande-Item.fldBestankar";
_mande = (long) (_mande-(double)(Double.parseDouble(_item.fldBestankar /*String*/ )));
 };
RDebugUtils.currentLine=62652450;
 //BA.debugLineNum = 62652450;BA.debugLine="If myCode.Check_Null_or_NotNumber(Item.fldBedehk";
if (mostCurrent._mycode._check_null_or_notnumber /*boolean*/ (mostCurrent.activityBA,_item.fldBedehkar /*String*/ )) { 
RDebugUtils.currentLine=62652451;
 //BA.debugLineNum = 62652451;BA.debugLine="mande=mande+Item.fldBedehkar";
_mande = (long) (_mande+(double)(Double.parseDouble(_item.fldBedehkar /*String*/ )));
 };
RDebugUtils.currentLine=62652454;
 //BA.debugLineNum = 62652454;BA.debugLine="If mande>0 Then";
if (_mande>0) { 
RDebugUtils.currentLine=62652455;
 //BA.debugLineNum = 62652455;BA.debugLine="Item.fldMande =mande";
_item.fldMande /*String*/  = BA.NumberToString(_mande);
RDebugUtils.currentLine=62652456;
 //BA.debugLineNum = 62652456;BA.debugLine="Log(Item.fldMande)";
anywheresoftware.b4a.keywords.Common.LogImpl("562652456",_item.fldMande /*String*/ ,0);
RDebugUtils.currentLine=62652457;
 //BA.debugLineNum = 62652457;BA.debugLine="TitleReport(2) = TitleReport(0) - TitleReport(1";
_titlereport[(int) (2)] = (long) (_titlereport[(int) (0)]-_titlereport[(int) (1)]);
 };
 }
};
RDebugUtils.currentLine=62652467;
 //BA.debugLineNum = 62652467;BA.debugLine="CreateGrid";
_creategrid();
RDebugUtils.currentLine=62652468;
 //BA.debugLineNum = 62652468;BA.debugLine="End Sub";
return "";
}
public static String  _img_chart_click() throws Exception{
RDebugUtils.currentModule="act_reportsoorathesab";
if (Debug.shouldDelegate(mostCurrent.activityBA, "img_chart_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "img_chart_click", null));}
RDebugUtils.currentLine=63373312;
 //BA.debugLineNum = 63373312;BA.debugLine="Sub Img_Chart_Click";
RDebugUtils.currentLine=63373315;
 //BA.debugLineNum = 63373315;BA.debugLine="End Sub";
return "";
}
public static String  _img_sort_click() throws Exception{
RDebugUtils.currentModule="act_reportsoorathesab";
if (Debug.shouldDelegate(mostCurrent.activityBA, "img_sort_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "img_sort_click", null));}
anywheresoftware.b4a.objects.collections.List _lst = null;
int _res = 0;
RDebugUtils.currentLine=63176704;
 //BA.debugLineNum = 63176704;BA.debugLine="Sub Img_Sort_Click";
RDebugUtils.currentLine=63176705;
 //BA.debugLineNum = 63176705;BA.debugLine="Dim Lst As List = Array As String(\"مبلغ کم به زیا";
_lst = new anywheresoftware.b4a.objects.collections.List();
_lst = anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"مبلغ کم به زیاد","مبلغ زیاد به کم"});
RDebugUtils.currentLine=63176706;
 //BA.debugLineNum = 63176706;BA.debugLine="Dim res As Int = InputList(Lst,\"مرتب سازی براساس:";
_res = anywheresoftware.b4a.keywords.Common.InputList(_lst,BA.ObjectToCharSequence("مرتب سازی براساس:"),(int) (-1),mostCurrent.activityBA);
RDebugUtils.currentLine=63176707;
 //BA.debugLineNum = 63176707;BA.debugLine="Select Case res";
switch (_res) {
case 0: {
RDebugUtils.currentLine=63176709;
 //BA.debugLineNum = 63176709;BA.debugLine="LstReport.SortType(\"fldFeeJoz\",False)";
mostCurrent._lstreport.SortType("fldFeeJoz",anywheresoftware.b4a.keywords.Common.False);
 break; }
case 1: {
RDebugUtils.currentLine=63176711;
 //BA.debugLineNum = 63176711;BA.debugLine="LstReport.SortType(\"fldFeeJoz\",True)";
mostCurrent._lstreport.SortType("fldFeeJoz",anywheresoftware.b4a.keywords.Common.True);
 break; }
}
;
RDebugUtils.currentLine=63176713;
 //BA.debugLineNum = 63176713;BA.debugLine="ProgressDialogShow(\"لطفا چند لحظه صبر کنید\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("لطفا چند لحظه صبر کنید"));
RDebugUtils.currentLine=63176714;
 //BA.debugLineNum = 63176714;BA.debugLine="CreateGrid";
_creategrid();
RDebugUtils.currentLine=63176715;
 //BA.debugLineNum = 63176715;BA.debugLine="End Sub";
return "";
}
public static String  _lblback_click() throws Exception{
RDebugUtils.currentModule="act_reportsoorathesab";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lblback_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lblback_click", null));}
RDebugUtils.currentLine=63111168;
 //BA.debugLineNum = 63111168;BA.debugLine="Sub LblBack_Click";
RDebugUtils.currentLine=63111169;
 //BA.debugLineNum = 63111169;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=63111170;
 //BA.debugLineNum = 63111170;BA.debugLine="End Sub";
return "";
}
public static String  _p_ondateset(int _year,int _month,int _day) throws Exception{
RDebugUtils.currentModule="act_reportsoorathesab";
if (Debug.shouldDelegate(mostCurrent.activityBA, "p_ondateset", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "p_ondateset", new Object[] {_year,_month,_day}));}
RDebugUtils.currentLine=62783488;
 //BA.debugLineNum = 62783488;BA.debugLine="Sub p_onDateSet(year As Int,month As Int,day As In";
RDebugUtils.currentLine=62783489;
 //BA.debugLineNum = 62783489;BA.debugLine="Log(year&\"/\"&month&\"/\"&day)";
anywheresoftware.b4a.keywords.Common.LogImpl("562783489",BA.NumberToString(_year)+"/"+BA.NumberToString(_month)+"/"+BA.NumberToString(_day),0);
RDebugUtils.currentLine=62783490;
 //BA.debugLineNum = 62783490;BA.debugLine="BtnAz.Text=year&\"/\"&NumberFormat(month,2,0)&\"/\"&N";
mostCurrent._btnaz.setText(BA.ObjectToCharSequence(BA.NumberToString(_year)+"/"+anywheresoftware.b4a.keywords.Common.NumberFormat(_month,(int) (2),(int) (0))+"/"+anywheresoftware.b4a.keywords.Common.NumberFormat(_day,(int) (2),(int) (0))));
RDebugUtils.currentLine=62783491;
 //BA.debugLineNum = 62783491;BA.debugLine="BtnAz.Tag =year&NumberFormat(day,2,0)&NumberForma";
mostCurrent._btnaz.setTag((Object)(BA.NumberToString(_year)+anywheresoftware.b4a.keywords.Common.NumberFormat(_day,(int) (2),(int) (0))+anywheresoftware.b4a.keywords.Common.NumberFormat(_month,(int) (2),(int) (0))));
RDebugUtils.currentLine=62783495;
 //BA.debugLineNum = 62783495;BA.debugLine="DateAz=year&NumberFormat(month,2,0)&NumberFormat(";
mostCurrent._dateaz = BA.NumberToString(_year)+anywheresoftware.b4a.keywords.Common.NumberFormat(_month,(int) (2),(int) (0))+anywheresoftware.b4a.keywords.Common.NumberFormat(_day,(int) (2),(int) (0));
RDebugUtils.currentLine=62783496;
 //BA.debugLineNum = 62783496;BA.debugLine="LogColor(DateAz,Colors.Magenta)";
anywheresoftware.b4a.keywords.Common.LogImpl("562783496",mostCurrent._dateaz,anywheresoftware.b4a.keywords.Common.Colors.Magenta);
RDebugUtils.currentLine=62783497;
 //BA.debugLineNum = 62783497;BA.debugLine="End Sub";
return "";
}
public static String  _p1_oncancel() throws Exception{
RDebugUtils.currentModule="act_reportsoorathesab";
if (Debug.shouldDelegate(mostCurrent.activityBA, "p1_oncancel", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "p1_oncancel", null));}
RDebugUtils.currentLine=62980096;
 //BA.debugLineNum = 62980096;BA.debugLine="Sub p1_onCancel";
RDebugUtils.currentLine=62980097;
 //BA.debugLineNum = 62980097;BA.debugLine="Log(\"cancel\")";
anywheresoftware.b4a.keywords.Common.LogImpl("562980097","cancel",0);
RDebugUtils.currentLine=62980098;
 //BA.debugLineNum = 62980098;BA.debugLine="End Sub";
return "";
}
public static String  _p1_ondateset(int _year,int _month,int _day) throws Exception{
RDebugUtils.currentModule="act_reportsoorathesab";
if (Debug.shouldDelegate(mostCurrent.activityBA, "p1_ondateset", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "p1_ondateset", new Object[] {_year,_month,_day}));}
RDebugUtils.currentLine=62914560;
 //BA.debugLineNum = 62914560;BA.debugLine="Sub p1_onDateSet(year As Int,month As Int,day As I";
RDebugUtils.currentLine=62914561;
 //BA.debugLineNum = 62914561;BA.debugLine="Log(year&\"/\"&month&\"/\"&day)";
anywheresoftware.b4a.keywords.Common.LogImpl("562914561",BA.NumberToString(_year)+"/"+BA.NumberToString(_month)+"/"+BA.NumberToString(_day),0);
RDebugUtils.currentLine=62914562;
 //BA.debugLineNum = 62914562;BA.debugLine="BtnTa.Text=year&\"/\"&NumberFormat(month,2,0)&\"/\"&N";
mostCurrent._btnta.setText(BA.ObjectToCharSequence(BA.NumberToString(_year)+"/"+anywheresoftware.b4a.keywords.Common.NumberFormat(_month,(int) (2),(int) (0))+"/"+anywheresoftware.b4a.keywords.Common.NumberFormat(_day,(int) (2),(int) (0))));
RDebugUtils.currentLine=62914563;
 //BA.debugLineNum = 62914563;BA.debugLine="BtnTa.Tag=year&NumberFormat(month,2,0)&NumberForm";
mostCurrent._btnta.setTag((Object)(BA.NumberToString(_year)+anywheresoftware.b4a.keywords.Common.NumberFormat(_month,(int) (2),(int) (0))+anywheresoftware.b4a.keywords.Common.NumberFormat(_day,(int) (2),(int) (0))));
RDebugUtils.currentLine=62914567;
 //BA.debugLineNum = 62914567;BA.debugLine="DateTa=year&NumberFormat(month,2,0)&NumberFormat(";
mostCurrent._dateta = BA.NumberToString(_year)+anywheresoftware.b4a.keywords.Common.NumberFormat(_month,(int) (2),(int) (0))+anywheresoftware.b4a.keywords.Common.NumberFormat(_day,(int) (2),(int) (0));
RDebugUtils.currentLine=62914568;
 //BA.debugLineNum = 62914568;BA.debugLine="LogColor(DateTa,Colors.Magenta)";
anywheresoftware.b4a.keywords.Common.LogImpl("562914568",mostCurrent._dateta,anywheresoftware.b4a.keywords.Common.Colors.Magenta);
RDebugUtils.currentLine=62914569;
 //BA.debugLineNum = 62914569;BA.debugLine="End Sub";
return "";
}
public static String  _p1_ondismiss() throws Exception{
RDebugUtils.currentModule="act_reportsoorathesab";
if (Debug.shouldDelegate(mostCurrent.activityBA, "p1_ondismiss", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "p1_ondismiss", null));}
RDebugUtils.currentLine=63045632;
 //BA.debugLineNum = 63045632;BA.debugLine="Sub p1_onDismiss";
RDebugUtils.currentLine=63045633;
 //BA.debugLineNum = 63045633;BA.debugLine="Log(\"dismiss\")";
anywheresoftware.b4a.keywords.Common.LogImpl("563045633","dismiss",0);
RDebugUtils.currentLine=63045634;
 //BA.debugLineNum = 63045634;BA.debugLine="End Sub";
return "";
}
}