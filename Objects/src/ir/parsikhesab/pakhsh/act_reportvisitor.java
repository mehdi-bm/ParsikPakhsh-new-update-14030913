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

public class act_reportvisitor extends Activity implements B4AActivity{
	public static act_reportvisitor mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.act_reportvisitor");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (act_reportvisitor).");
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
		activityBA = new BA(this, layout, processBA, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.act_reportvisitor");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "ir.parsikhesab.pakhsh.act_reportvisitor", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (act_reportvisitor) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (act_reportvisitor) Resume **");
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
		return act_reportvisitor.class;
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
            BA.LogInfo("** Activity (act_reportvisitor) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (act_reportvisitor) Pause event (activity is not paused). **");
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
            act_reportvisitor mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (act_reportvisitor) Resume **");
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
public ir.parsikhesab.pakhsh.b4xdialog _dialog = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _base = null;
public ir.parsikhesab.pakhsh.b4xsearchtemplate _searchtemplate = null;
public com.b4a.manamsoftware.PersianDate.ManamPersianDate _mpd = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnreport = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnta = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnaz = null;
public static String _dateaz = "";
public static String _dateta = "";
public anywheresoftware.b4a.objects.ButtonWrapper _btn_selashkhas = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel1 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_show = null;
public anywheresoftware.b4a.objects.collections.List _lstreport = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblsumforoosh = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltedadeshantion = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblsumbargasht = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblsumkhales = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltedadforoosh = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltedadbargasht = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltedadsefaresh = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblsumsefaresh = null;
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
RDebugUtils.currentModule="act_reportvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
anywheresoftware.b4a.objects.collections.List _items = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
int _i = 0;
String _name = "";
RDebugUtils.currentLine=63635456;
 //BA.debugLineNum = 63635456;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=63635457;
 //BA.debugLineNum = 63635457;BA.debugLine="Activity.LoadLayout(\"L_ReportVisitor\")";
mostCurrent._activity.LoadLayout("L_ReportVisitor",mostCurrent.activityBA);
RDebugUtils.currentLine=63635458;
 //BA.debugLineNum = 63635458;BA.debugLine="LstReport.Initialize";
mostCurrent._lstreport.Initialize();
RDebugUtils.currentLine=63635470;
 //BA.debugLineNum = 63635470;BA.debugLine="Base = Activity";
mostCurrent._base = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(mostCurrent._activity.getObject()));
RDebugUtils.currentLine=63635471;
 //BA.debugLineNum = 63635471;BA.debugLine="Dialog.Initialize (Panel1)";
mostCurrent._dialog._initialize /*String*/ (null,mostCurrent.activityBA,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(mostCurrent._panel1.getObject())));
RDebugUtils.currentLine=63635472;
 //BA.debugLineNum = 63635472;BA.debugLine="Dialog.Title = \"جستجو\"";
mostCurrent._dialog._title /*Object*/  = (Object)("جستجو");
RDebugUtils.currentLine=63635473;
 //BA.debugLineNum = 63635473;BA.debugLine="SearchTemplate.Initialize";
mostCurrent._searchtemplate._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=63635474;
 //BA.debugLineNum = 63635474;BA.debugLine="Dim Items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=63635475;
 //BA.debugLineNum = 63635475;BA.debugLine="Items.Initialize";
_items.Initialize();
RDebugUtils.currentLine=63635476;
 //BA.debugLineNum = 63635476;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From Tb";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblAshkhas ");
RDebugUtils.currentLine=63635477;
 //BA.debugLineNum = 63635477;BA.debugLine="For i=0 To Cu.RowCount-1";
{
final int step10 = 1;
final int limit10 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit10 ;_i = _i + step10 ) {
RDebugUtils.currentLine=63635478;
 //BA.debugLineNum = 63635478;BA.debugLine="Cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=63635479;
 //BA.debugLineNum = 63635479;BA.debugLine="Dim Name As String =  Cu.GetString(\"fldSharheTaf";
_name = _cu.GetString("fldSharheTafzili");
RDebugUtils.currentLine=63635480;
 //BA.debugLineNum = 63635480;BA.debugLine="Items.Add(Name)";
_items.Add((Object)(_name));
 }
};
RDebugUtils.currentLine=63635482;
 //BA.debugLineNum = 63635482;BA.debugLine="SearchTemplate.SetItems(Items)";
mostCurrent._searchtemplate._setitems /*Object*/ (null,_items);
RDebugUtils.currentLine=63635483;
 //BA.debugLineNum = 63635483;BA.debugLine="SearchTemplate.GetPanel(Dialog).BringToFront";
mostCurrent._searchtemplate._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,mostCurrent._dialog).BringToFront();
RDebugUtils.currentLine=63635484;
 //BA.debugLineNum = 63635484;BA.debugLine="Btn_show.Visible=False";
mostCurrent._btn_show.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=63635485;
 //BA.debugLineNum = 63635485;BA.debugLine="MCode.CodeMoshtariSelect=0";
mostCurrent._mcode._codemoshtariselect /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=63635486;
 //BA.debugLineNum = 63635486;BA.debugLine="End Sub";
return "";
}
public static boolean  _activity_keypress(int _keycode) throws Exception{
RDebugUtils.currentModule="act_reportvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_keypress", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "activity_keypress", new Object[] {_keycode}));}
RDebugUtils.currentLine=63700992;
 //BA.debugLineNum = 63700992;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
RDebugUtils.currentLine=63700993;
 //BA.debugLineNum = 63700993;BA.debugLine="If KeyCode=KeyCodes.KEYCODE_BACK Then";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK) { 
RDebugUtils.currentLine=63700994;
 //BA.debugLineNum = 63700994;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 }else {
RDebugUtils.currentLine=63700996;
 //BA.debugLineNum = 63700996;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 };
RDebugUtils.currentLine=63700998;
 //BA.debugLineNum = 63700998;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=63700999;
 //BA.debugLineNum = 63700999;BA.debugLine="End Sub";
return false;
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="act_reportvisitor";
RDebugUtils.currentLine=63832064;
 //BA.debugLineNum = 63832064;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=63832066;
 //BA.debugLineNum = 63832066;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="act_reportvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=63766528;
 //BA.debugLineNum = 63766528;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=63766530;
 //BA.debugLineNum = 63766530;BA.debugLine="End Sub";
return "";
}
public static String  _animatedialog(ir.parsikhesab.pakhsh.b4xdialog _dlg,String _fromedge) throws Exception{
RDebugUtils.currentModule="act_reportvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "animatedialog", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "animatedialog", new Object[] {_dlg,_fromedge}));}
int _top = 0;
int _left = 0;
RDebugUtils.currentLine=64618496;
 //BA.debugLineNum = 64618496;BA.debugLine="Sub AnimateDialog (dlg As B4XDialog, FromEdge As S";
RDebugUtils.currentLine=64618497;
 //BA.debugLineNum = 64618497;BA.debugLine="Dim Base As B4XView = dlg.Base";
mostCurrent._base = new anywheresoftware.b4a.objects.B4XViewWrapper();
mostCurrent._base = _dlg._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=64618498;
 //BA.debugLineNum = 64618498;BA.debugLine="Dim top As Int = Base.Top";
_top = mostCurrent._base.getTop();
RDebugUtils.currentLine=64618499;
 //BA.debugLineNum = 64618499;BA.debugLine="Dim left As Int = Base.Left";
_left = mostCurrent._base.getLeft();
RDebugUtils.currentLine=64618500;
 //BA.debugLineNum = 64618500;BA.debugLine="Select FromEdge.ToLowerCase";
switch (BA.switchObjectToInt(_fromedge.toLowerCase(),"bottom","top","left","right")) {
case 0: {
RDebugUtils.currentLine=64618502;
 //BA.debugLineNum = 64618502;BA.debugLine="Base.Top = Base.Parent.Height";
mostCurrent._base.setTop(mostCurrent._base.getParent().getHeight());
 break; }
case 1: {
RDebugUtils.currentLine=64618504;
 //BA.debugLineNum = 64618504;BA.debugLine="Base.Top = -Base.Height";
mostCurrent._base.setTop((int) (-mostCurrent._base.getHeight()));
 break; }
case 2: {
RDebugUtils.currentLine=64618506;
 //BA.debugLineNum = 64618506;BA.debugLine="Base.Left = -Base.Width";
mostCurrent._base.setLeft((int) (-mostCurrent._base.getWidth()));
 break; }
case 3: {
RDebugUtils.currentLine=64618508;
 //BA.debugLineNum = 64618508;BA.debugLine="Base.Left = Base.Parent.Width";
mostCurrent._base.setLeft(mostCurrent._base.getParent().getWidth());
 break; }
}
;
RDebugUtils.currentLine=64618510;
 //BA.debugLineNum = 64618510;BA.debugLine="Base.SetLayoutAnimated(300, left, top, Base.Width";
mostCurrent._base.SetLayoutAnimated((int) (300),_left,_top,mostCurrent._base.getWidth(),mostCurrent._base.getHeight());
RDebugUtils.currentLine=64618511;
 //BA.debugLineNum = 64618511;BA.debugLine="End Sub";
return "";
}
public static void  _btn_selashkhas_click() throws Exception{
RDebugUtils.currentModule="act_reportvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_selashkhas_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "btn_selashkhas_click", null); return;}
ResumableSub_Btn_SelAshkhas_Click rsub = new ResumableSub_Btn_SelAshkhas_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Btn_SelAshkhas_Click extends BA.ResumableSub {
public ResumableSub_Btn_SelAshkhas_Click(ir.parsikhesab.pakhsh.act_reportvisitor parent) {
this.parent = parent;
}
ir.parsikhesab.pakhsh.act_reportvisitor parent;
Object _rs = null;
int _result = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_reportvisitor";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=64552961;
 //BA.debugLineNum = 64552961;BA.debugLine="Btn_show.Visible=False";
parent.mostCurrent._btn_show.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=64552962;
 //BA.debugLineNum = 64552962;BA.debugLine="Panel1.BringToFront";
parent.mostCurrent._panel1.BringToFront();
RDebugUtils.currentLine=64552963;
 //BA.debugLineNum = 64552963;BA.debugLine="Panel1.Visible=True";
parent.mostCurrent._panel1.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=64552964;
 //BA.debugLineNum = 64552964;BA.debugLine="SearchTemplate.SearchField.HintText=\"نام مشتری\"";
parent.mostCurrent._searchtemplate._searchfield /*ir.parsikhesab.pakhsh.b4xfloattextfield*/ ._hinttext /*String*/  = "نام مشتری";
RDebugUtils.currentLine=64552965;
 //BA.debugLineNum = 64552965;BA.debugLine="SearchTemplate.SearchField.lblClear.Text=\"\"";
parent.mostCurrent._searchtemplate._searchfield /*ir.parsikhesab.pakhsh.b4xfloattextfield*/ ._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=64552966;
 //BA.debugLineNum = 64552966;BA.debugLine="SearchTemplate.SearchField.lblV.Text=\"\"";
parent.mostCurrent._searchtemplate._searchfield /*ir.parsikhesab.pakhsh.b4xfloattextfield*/ ._lblv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=64552967;
 //BA.debugLineNum = 64552967;BA.debugLine="SearchTemplate.SearchField.Update";
parent.mostCurrent._searchtemplate._searchfield /*ir.parsikhesab.pakhsh.b4xfloattextfield*/ ._update /*String*/ (null);
RDebugUtils.currentLine=64552968;
 //BA.debugLineNum = 64552968;BA.debugLine="Dim rs As Object = Dialog.ShowTemplate(SearchTemp";
_rs = parent.mostCurrent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(parent.mostCurrent._searchtemplate),(Object)(""),(Object)(""),(Object)("انصراف"));
RDebugUtils.currentLine=64552969;
 //BA.debugLineNum = 64552969;BA.debugLine="AnimateDialog(Dialog, \"right\")";
_animatedialog(parent.mostCurrent._dialog,"right");
RDebugUtils.currentLine=64552970;
 //BA.debugLineNum = 64552970;BA.debugLine="Wait For (rs) Complete (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_reportvisitor", "btn_selashkhas_click"), _rs);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=64552971;
 //BA.debugLineNum = 64552971;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=64552972;
 //BA.debugLineNum = 64552972;BA.debugLine="Btn_SelAshkhas.Text = SearchTemplate.SelectedIte";
parent.mostCurrent._btn_selashkhas.setText(BA.ObjectToCharSequence(parent.mostCurrent._searchtemplate._selecteditem /*String*/ ));
RDebugUtils.currentLine=64552973;
 //BA.debugLineNum = 64552973;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From T";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = parent.mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblAshkhas where fldSharheTafzili='"+parent.mostCurrent._btn_selashkhas.getText()+"'");
RDebugUtils.currentLine=64552974;
 //BA.debugLineNum = 64552974;BA.debugLine="Cu.Position=0";
_cu.setPosition((int) (0));
RDebugUtils.currentLine=64552975;
 //BA.debugLineNum = 64552975;BA.debugLine="MCode.CodeMoshtariSelect =  Cu.GetString(\"fldCod";
parent.mostCurrent._mcode._codemoshtariselect /*String*/  = _cu.GetString("fldCodetafzili");
RDebugUtils.currentLine=64552976;
 //BA.debugLineNum = 64552976;BA.debugLine="Log(\"کد مشتری : \"&Cu.GetString(\"fldCodetafzili\")";
anywheresoftware.b4a.keywords.Common.LogImpl("564552976","کد مشتری : "+_cu.GetString("fldCodetafzili"),0);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=64552978;
 //BA.debugLineNum = 64552978;BA.debugLine="Btn_SelAshkhas.Text = \"انتخاب مشتری\"";
parent.mostCurrent._btn_selashkhas.setText(BA.ObjectToCharSequence("انتخاب مشتری"));
RDebugUtils.currentLine=64552979;
 //BA.debugLineNum = 64552979;BA.debugLine="MCode.CodeMoshtariSelect=0";
parent.mostCurrent._mcode._codemoshtariselect /*String*/  = BA.NumberToString(0);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=64552981;
 //BA.debugLineNum = 64552981;BA.debugLine="Panel1.Visible=False";
parent.mostCurrent._panel1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=64552982;
 //BA.debugLineNum = 64552982;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _btn_show_click() throws Exception{
RDebugUtils.currentModule="act_reportvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_show_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_show_click", null));}
RDebugUtils.currentLine=64684032;
 //BA.debugLineNum = 64684032;BA.debugLine="Sub Btn_show_Click";
RDebugUtils.currentLine=64684033;
 //BA.debugLineNum = 64684033;BA.debugLine="Act_RepFactors.CodeMoshtari=MCode.CodeMoshtariSel";
mostCurrent._act_repfactors._codemoshtari /*String*/  = mostCurrent._mcode._codemoshtariselect /*String*/ ;
RDebugUtils.currentLine=64684034;
 //BA.debugLineNum = 64684034;BA.debugLine="Act_RepFactors.DateAz=DateAz";
mostCurrent._act_repfactors._dateaz /*String*/  = mostCurrent._dateaz;
RDebugUtils.currentLine=64684035;
 //BA.debugLineNum = 64684035;BA.debugLine="Act_RepFactors.DateTa=DateTa";
mostCurrent._act_repfactors._dateta /*String*/  = mostCurrent._dateta;
RDebugUtils.currentLine=64684036;
 //BA.debugLineNum = 64684036;BA.debugLine="Act_RepFactors.TotalFactor=LblSumKhales.Text";
mostCurrent._act_repfactors._totalfactor /*String*/  = mostCurrent._lblsumkhales.getText();
RDebugUtils.currentLine=64684037;
 //BA.debugLineNum = 64684037;BA.debugLine="StartActivity(Act_RepFactors)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._act_repfactors.getObject()));
RDebugUtils.currentLine=64684039;
 //BA.debugLineNum = 64684039;BA.debugLine="End Sub";
return "";
}
public static String  _btnaz_click() throws Exception{
RDebugUtils.currentModule="act_reportvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnaz_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnaz_click", null));}
com.porya.datetimepicker.PersianMaterialDatePickerWrapper _p = null;
RDebugUtils.currentLine=63897600;
 //BA.debugLineNum = 63897600;BA.debugLine="Sub BtnAz_Click";
RDebugUtils.currentLine=63897601;
 //BA.debugLineNum = 63897601;BA.debugLine="Dim p As PersianMaterialDatePicker";
_p = new com.porya.datetimepicker.PersianMaterialDatePickerWrapper();
RDebugUtils.currentLine=63897602;
 //BA.debugLineNum = 63897602;BA.debugLine="p.Initialize(\"p\",p.PersianYear,p.PersianMonth,p.P";
_p.Initialize(mostCurrent.activityBA,"p",_p.getPersianYear(),_p.getPersianMonth(),_p.getPersianDay());
RDebugUtils.currentLine=63897603;
 //BA.debugLineNum = 63897603;BA.debugLine="p.AccentColor = Colors.RGB(83,99,255)";
_p.setAccentColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (83),(int) (99),(int) (255)));
RDebugUtils.currentLine=63897604;
 //BA.debugLineNum = 63897604;BA.debugLine="p.OkText = \"تایید\"";
_p.setOkText("تایید");
RDebugUtils.currentLine=63897605;
 //BA.debugLineNum = 63897605;BA.debugLine="p.CancelText = \"لغو\"";
_p.setCancelText("لغو");
RDebugUtils.currentLine=63897606;
 //BA.debugLineNum = 63897606;BA.debugLine="p.Title = \"از تاریخ\"";
_p.setTitle("از تاریخ");
RDebugUtils.currentLine=63897607;
 //BA.debugLineNum = 63897607;BA.debugLine="p.Typeface = \"iransansmonospacednum.ttf\"";
_p.setTypeface("iransansmonospacednum.ttf");
RDebugUtils.currentLine=63897608;
 //BA.debugLineNum = 63897608;BA.debugLine="p.Show(\"p\")";
_p.Show("p");
RDebugUtils.currentLine=63897609;
 //BA.debugLineNum = 63897609;BA.debugLine="End Sub";
return "";
}
public static String  _btnreport_click() throws Exception{
RDebugUtils.currentModule="act_reportvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnreport_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnreport_click", null));}
RDebugUtils.currentLine=64421888;
 //BA.debugLineNum = 64421888;BA.debugLine="Sub BtnReport_Click";
RDebugUtils.currentLine=64421889;
 //BA.debugLineNum = 64421889;BA.debugLine="LblSumForoosh.Text = \"0\"";
mostCurrent._lblsumforoosh.setText(BA.ObjectToCharSequence("0"));
RDebugUtils.currentLine=64421890;
 //BA.debugLineNum = 64421890;BA.debugLine="LblSumBargasht.Text = \"0\"";
mostCurrent._lblsumbargasht.setText(BA.ObjectToCharSequence("0"));
RDebugUtils.currentLine=64421891;
 //BA.debugLineNum = 64421891;BA.debugLine="LblTedadEshantion.Text = \"0\"";
mostCurrent._lbltedadeshantion.setText(BA.ObjectToCharSequence("0"));
RDebugUtils.currentLine=64421892;
 //BA.debugLineNum = 64421892;BA.debugLine="LblSumKhales.Text = \"0\"";
mostCurrent._lblsumkhales.setText(BA.ObjectToCharSequence("0"));
RDebugUtils.currentLine=64421893;
 //BA.debugLineNum = 64421893;BA.debugLine="If MCode.Sf.Len(BtnAz.Tag) = 8 And MCode.Sf.Len(B";
if (mostCurrent._mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvv1(BA.ObjectToString(mostCurrent._btnaz.getTag()))==8 && mostCurrent._mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvv1(BA.ObjectToString(mostCurrent._btnta.getTag()))==8) { 
RDebugUtils.currentLine=64421895;
 //BA.debugLineNum = 64421895;BA.debugLine="ProgressDialogShow2(\"لطفا صبر کنید . . .\",False)";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(mostCurrent.activityBA,BA.ObjectToCharSequence("لطفا صبر کنید . . ."),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=64421897;
 //BA.debugLineNum = 64421897;BA.debugLine="LoadData";
_loaddata();
 }else {
RDebugUtils.currentLine=64421899;
 //BA.debugLineNum = 64421899;BA.debugLine="ToastMessageShow(\"تاریخ را به طور صحیح وارد نمای";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("تاریخ را به طور صحیح وارد نمایید"),anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=64421902;
 //BA.debugLineNum = 64421902;BA.debugLine="End Sub";
return "";
}
public static String  _loaddata() throws Exception{
RDebugUtils.currentModule="act_reportvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "loaddata", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "loaddata", null));}
String _hasreport = "";
String _fldfeejoz = "";
String _fldfeebargasht = "";
String _fldtedadeshantionjoz = "";
String _fldtedadeshantionkol = "";
String _fldtedadjozforoosh = "";
String _fldtedadkolforoosh = "";
String _fldtedadjozbargasht = "";
String _fldtedadkolbargasht = "";
String _fldsumkhales = "";
String _fldfeejozsefaresh = "";
String _fldtedadjozsefaresh = "";
String _fldtedadkolsefaresh = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
int _i = 0;
RDebugUtils.currentLine=64487424;
 //BA.debugLineNum = 64487424;BA.debugLine="Sub LoadData";
RDebugUtils.currentLine=64487425;
 //BA.debugLineNum = 64487425;BA.debugLine="Try";
try {RDebugUtils.currentLine=64487426;
 //BA.debugLineNum = 64487426;BA.debugLine="LstReport.Clear";
mostCurrent._lstreport.Clear();
RDebugUtils.currentLine=64487427;
 //BA.debugLineNum = 64487427;BA.debugLine="Dim hasreport As String=0";
_hasreport = BA.NumberToString(0);
RDebugUtils.currentLine=64487429;
 //BA.debugLineNum = 64487429;BA.debugLine="Dim fldFeeJoz As String=0";
_fldfeejoz = BA.NumberToString(0);
RDebugUtils.currentLine=64487430;
 //BA.debugLineNum = 64487430;BA.debugLine="Dim fldFeeBargasht As String=0";
_fldfeebargasht = BA.NumberToString(0);
RDebugUtils.currentLine=64487431;
 //BA.debugLineNum = 64487431;BA.debugLine="Dim fldTedadEshantionJoz As String=0";
_fldtedadeshantionjoz = BA.NumberToString(0);
RDebugUtils.currentLine=64487432;
 //BA.debugLineNum = 64487432;BA.debugLine="Dim fldTedadEshantionKol As String=0";
_fldtedadeshantionkol = BA.NumberToString(0);
RDebugUtils.currentLine=64487433;
 //BA.debugLineNum = 64487433;BA.debugLine="Dim fldTedadJozForoosh As String=0";
_fldtedadjozforoosh = BA.NumberToString(0);
RDebugUtils.currentLine=64487434;
 //BA.debugLineNum = 64487434;BA.debugLine="Dim fldTedadKolForoosh As String=0";
_fldtedadkolforoosh = BA.NumberToString(0);
RDebugUtils.currentLine=64487435;
 //BA.debugLineNum = 64487435;BA.debugLine="Dim fldTedadJozBargasht As String=0";
_fldtedadjozbargasht = BA.NumberToString(0);
RDebugUtils.currentLine=64487436;
 //BA.debugLineNum = 64487436;BA.debugLine="Dim fldTedadKolBargasht As String=0";
_fldtedadkolbargasht = BA.NumberToString(0);
RDebugUtils.currentLine=64487437;
 //BA.debugLineNum = 64487437;BA.debugLine="Dim fldSumKhales As String=0";
_fldsumkhales = BA.NumberToString(0);
RDebugUtils.currentLine=64487438;
 //BA.debugLineNum = 64487438;BA.debugLine="Dim fldFeeJozSefaresh As String=0";
_fldfeejozsefaresh = BA.NumberToString(0);
RDebugUtils.currentLine=64487439;
 //BA.debugLineNum = 64487439;BA.debugLine="Dim fldTedadJozSefaresh  As String=0";
_fldtedadjozsefaresh = BA.NumberToString(0);
RDebugUtils.currentLine=64487440;
 //BA.debugLineNum = 64487440;BA.debugLine="Dim fldTedadKolSefaresh As String=0";
_fldtedadkolsefaresh = BA.NumberToString(0);
RDebugUtils.currentLine=64487441;
 //BA.debugLineNum = 64487441;BA.debugLine="If MCode.CodeMoshtariSelect=0 Then";
if ((mostCurrent._mcode._codemoshtariselect /*String*/ ).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=64487442;
 //BA.debugLineNum = 64487442;BA.debugLine="fldTedadJozSefaresh=myCode.Is_Null_adad(MCode.S";
_fldtedadjozsefaresh = mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,BA.ObjectToString(mostCurrent._mcode._singleresult /*Object*/ (mostCurrent.activityBA,"select Sum(FldTedadDarSabadJoz) as FldTedadDarSabadJoz from TblFaktor where fldShomareForoosh=0 and FldType='Foroosh' and FldDate between "+mostCurrent._dateaz+" and "+mostCurrent._dateta)));
RDebugUtils.currentLine=64487443;
 //BA.debugLineNum = 64487443;BA.debugLine="fldTedadKolSefaresh=myCode.Is_Null_adad(MCode.S";
_fldtedadkolsefaresh = mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,BA.ObjectToString(mostCurrent._mcode._singleresult /*Object*/ (mostCurrent.activityBA,"select Sum(FldTedadDarSabadKol) as FldTedadDarSabadKol from TblFaktor where fldShomareForoosh=0 and FldType='Foroosh' and FldDate between "+mostCurrent._dateaz+" and "+mostCurrent._dateta)));
RDebugUtils.currentLine=64487444;
 //BA.debugLineNum = 64487444;BA.debugLine="Dim cu As Cursor=MCode.Result(\"select distinct";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"select distinct FldTotalFaktor from TblFaktor where fldShomareForoosh=0 and FldType='Foroosh' and FldDate between "+mostCurrent._dateaz+" and "+mostCurrent._dateta);
RDebugUtils.currentLine=64487445;
 //BA.debugLineNum = 64487445;BA.debugLine="If cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=64487446;
 //BA.debugLineNum = 64487446;BA.debugLine="For  i=0 To cu.RowCount-1";
{
final int step21 = 1;
final int limit21 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit21 ;_i = _i + step21 ) {
RDebugUtils.currentLine=64487447;
 //BA.debugLineNum = 64487447;BA.debugLine="cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=64487448;
 //BA.debugLineNum = 64487448;BA.debugLine="fldFeeJozSefaresh =fldFeeJozSefaresh+ myCode.";
_fldfeejozsefaresh = BA.NumberToString((double)(Double.parseDouble(_fldfeejozsefaresh))+(double)(Double.parseDouble(mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_cu.GetString("FldTotalFaktor")))));
 }
};
RDebugUtils.currentLine=64487450;
 //BA.debugLineNum = 64487450;BA.debugLine="hasreport=1";
_hasreport = BA.NumberToString(1);
 };
RDebugUtils.currentLine=64487453;
 //BA.debugLineNum = 64487453;BA.debugLine="fldTedadJozForoosh=myCode.Is_Null_adad(MCode.Si";
_fldtedadjozforoosh = mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,BA.ObjectToString(mostCurrent._mcode._singleresult /*Object*/ (mostCurrent.activityBA,"select Sum(FldTedadDarSabadJoz) as FldTedadDarSabadJoz from TblFaktor where fldShomareForoosh>0 and FldType='Foroosh' and FldDate between "+mostCurrent._dateaz+" and "+mostCurrent._dateta)));
RDebugUtils.currentLine=64487454;
 //BA.debugLineNum = 64487454;BA.debugLine="fldTedadKolForoosh=myCode.Is_Null_adad(MCode.Si";
_fldtedadkolforoosh = mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,BA.ObjectToString(mostCurrent._mcode._singleresult /*Object*/ (mostCurrent.activityBA,"select Sum(FldTedadDarSabadKol) as FldTedadDarSabadKol from TblFaktor where fldShomareForoosh>0 and FldType='Foroosh' and FldDate between "+mostCurrent._dateaz+" and "+mostCurrent._dateta)));
RDebugUtils.currentLine=64487455;
 //BA.debugLineNum = 64487455;BA.debugLine="Dim cu As Cursor=MCode.Result(\"select distinct";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"select distinct FldTotalFaktor from TblFaktor where fldShomareForoosh>0 and FldType='Foroosh' and FldDate between "+mostCurrent._dateaz+" and "+mostCurrent._dateta);
RDebugUtils.currentLine=64487456;
 //BA.debugLineNum = 64487456;BA.debugLine="If cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=64487457;
 //BA.debugLineNum = 64487457;BA.debugLine="For  i=0 To cu.RowCount-1";
{
final int step31 = 1;
final int limit31 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit31 ;_i = _i + step31 ) {
RDebugUtils.currentLine=64487458;
 //BA.debugLineNum = 64487458;BA.debugLine="cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=64487459;
 //BA.debugLineNum = 64487459;BA.debugLine="fldFeeJoz =fldFeeJoz+ myCode.Is_Null_adad(cu.";
_fldfeejoz = BA.NumberToString((double)(Double.parseDouble(_fldfeejoz))+(double)(Double.parseDouble(mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_cu.GetString("FldTotalFaktor")))));
 }
};
RDebugUtils.currentLine=64487461;
 //BA.debugLineNum = 64487461;BA.debugLine="hasreport=1";
_hasreport = BA.NumberToString(1);
 };
RDebugUtils.currentLine=64487464;
 //BA.debugLineNum = 64487464;BA.debugLine="fldTedadJozBargasht=myCode.Is_Null_adad(MCode.S";
_fldtedadjozbargasht = mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,BA.ObjectToString(mostCurrent._mcode._singleresult /*Object*/ (mostCurrent.activityBA,"select Sum(FldTedadDarSabadJoz) as FldTedadDarSabadJoz from TblFaktor where fldShomareForoosh>0 and FldType='Marjoee' and FldDate between "+mostCurrent._dateaz+" and "+mostCurrent._dateta)));
RDebugUtils.currentLine=64487465;
 //BA.debugLineNum = 64487465;BA.debugLine="fldTedadKolBargasht=myCode.Is_Null_adad(MCode.S";
_fldtedadkolbargasht = mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,BA.ObjectToString(mostCurrent._mcode._singleresult /*Object*/ (mostCurrent.activityBA,"select Sum(FldTedadDarSabadKol) as FldTedadDarSabadKol from TblFaktor where fldShomareForoosh>0 and FldType='Marjoee' and FldDate between "+mostCurrent._dateaz+" and "+mostCurrent._dateta)));
RDebugUtils.currentLine=64487466;
 //BA.debugLineNum = 64487466;BA.debugLine="Dim cu As Cursor=MCode.Result(\"select distinct";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"select distinct FldTotalFaktor from TblFaktor where fldShomareForoosh>0 and FldType='Marjoee' and FldDate between "+mostCurrent._dateaz+" and "+mostCurrent._dateta);
RDebugUtils.currentLine=64487467;
 //BA.debugLineNum = 64487467;BA.debugLine="If cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=64487468;
 //BA.debugLineNum = 64487468;BA.debugLine="For  i=0 To cu.RowCount-1";
{
final int step41 = 1;
final int limit41 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit41 ;_i = _i + step41 ) {
RDebugUtils.currentLine=64487469;
 //BA.debugLineNum = 64487469;BA.debugLine="cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=64487470;
 //BA.debugLineNum = 64487470;BA.debugLine="fldFeeBargasht =fldFeeBargasht+ myCode.Is_Nul";
_fldfeebargasht = BA.NumberToString((double)(Double.parseDouble(_fldfeebargasht))+(double)(Double.parseDouble(mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_cu.GetString("FldTotalFaktor")))));
 }
};
RDebugUtils.currentLine=64487472;
 //BA.debugLineNum = 64487472;BA.debugLine="hasreport=1";
_hasreport = BA.NumberToString(1);
 };
 }else {
RDebugUtils.currentLine=64487476;
 //BA.debugLineNum = 64487476;BA.debugLine="fldTedadJozSefaresh=myCode.Is_Null_adad(MCode.S";
_fldtedadjozsefaresh = mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,BA.ObjectToString(mostCurrent._mcode._singleresult /*Object*/ (mostCurrent.activityBA,("select Sum(FldTedadDarSabadJoz) as FldTedadDarSabadJoz from TblFaktor where fldShomareForoosh=0 and FldType='Foroosh' and FldC_Tafzili="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._mcode._codemoshtariselect /*String*/ ))+" and FldDate between "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._dateaz))+"  and  "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._dateta))+""))));
RDebugUtils.currentLine=64487477;
 //BA.debugLineNum = 64487477;BA.debugLine="fldTedadKolSefaresh=myCode.Is_Null_adad(MCode.S";
_fldtedadkolsefaresh = mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,BA.ObjectToString(mostCurrent._mcode._singleresult /*Object*/ (mostCurrent.activityBA,("select Sum(FldTedadDarSabadKol) as FldTedadDarSabadKol from TblFaktor where fldShomareForoosh=0 and FldType='Foroosh' and FldC_Tafzili="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._mcode._codemoshtariselect /*String*/ ))+" and FldDate between "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._dateaz))+"  and  "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._dateta))+""))));
RDebugUtils.currentLine=64487478;
 //BA.debugLineNum = 64487478;BA.debugLine="Dim cu As Cursor=MCode.Result($\"select distinct";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,("select distinct FldTotalFaktor from TblFaktor where fldShomareForoosh=0 and FldType='Foroosh' and FldC_Tafzili="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._mcode._codemoshtariselect /*String*/ ))+" and FldDate between "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._dateaz))+"   and  "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._dateta))+""));
RDebugUtils.currentLine=64487479;
 //BA.debugLineNum = 64487479;BA.debugLine="If cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=64487480;
 //BA.debugLineNum = 64487480;BA.debugLine="For  i=0 To cu.RowCount-1";
{
final int step52 = 1;
final int limit52 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit52 ;_i = _i + step52 ) {
RDebugUtils.currentLine=64487481;
 //BA.debugLineNum = 64487481;BA.debugLine="cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=64487482;
 //BA.debugLineNum = 64487482;BA.debugLine="fldFeeJozSefaresh =fldFeeJozSefaresh+ myCode.";
_fldfeejozsefaresh = BA.NumberToString((double)(Double.parseDouble(_fldfeejozsefaresh))+(double)(Double.parseDouble(mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_cu.GetString("FldTotalFaktor")))));
 }
};
RDebugUtils.currentLine=64487484;
 //BA.debugLineNum = 64487484;BA.debugLine="hasreport=1";
_hasreport = BA.NumberToString(1);
 };
RDebugUtils.currentLine=64487487;
 //BA.debugLineNum = 64487487;BA.debugLine="fldTedadJozForoosh=myCode.Is_Null_adad(MCode.Si";
_fldtedadjozforoosh = mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,BA.ObjectToString(mostCurrent._mcode._singleresult /*Object*/ (mostCurrent.activityBA,("select Sum(FldTedadDarSabadJoz) as FldTedadDarSabadJoz from TblFaktor where fldShomareForoosh>0 and FldType='Foroosh' and FldC_Tafzili="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._mcode._codemoshtariselect /*String*/ ))+" and FldDate between "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._dateaz))+"  and  "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._dateta))+""))));
RDebugUtils.currentLine=64487488;
 //BA.debugLineNum = 64487488;BA.debugLine="fldTedadKolForoosh=myCode.Is_Null_adad(MCode.Si";
_fldtedadkolforoosh = mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,BA.ObjectToString(mostCurrent._mcode._singleresult /*Object*/ (mostCurrent.activityBA,("select Sum(FldTedadDarSabadKol) as FldTedadDarSabadKol from TblFaktor where fldShomareForoosh>0 and FldType='Foroosh' and FldC_Tafzili="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._mcode._codemoshtariselect /*String*/ ))+" and FldDate between "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._dateaz))+"  and  "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._dateta))+""))));
RDebugUtils.currentLine=64487489;
 //BA.debugLineNum = 64487489;BA.debugLine="Dim cu As Cursor=MCode.Result($\"select distinct";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,("select distinct FldTotalFaktor from TblFaktor where fldShomareForoosh>0 and FldType='Foroosh' and FldC_Tafzili="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._mcode._codemoshtariselect /*String*/ ))+" and FldDate between "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._dateaz))+"   and  "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._dateta))+""));
RDebugUtils.currentLine=64487490;
 //BA.debugLineNum = 64487490;BA.debugLine="If cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=64487491;
 //BA.debugLineNum = 64487491;BA.debugLine="For  i=0 To cu.RowCount-1";
{
final int step62 = 1;
final int limit62 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit62 ;_i = _i + step62 ) {
RDebugUtils.currentLine=64487492;
 //BA.debugLineNum = 64487492;BA.debugLine="cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=64487493;
 //BA.debugLineNum = 64487493;BA.debugLine="fldFeeJoz =fldFeeJoz+ myCode.Is_Null_adad(cu.";
_fldfeejoz = BA.NumberToString((double)(Double.parseDouble(_fldfeejoz))+(double)(Double.parseDouble(mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_cu.GetString("FldTotalFaktor")))));
 }
};
RDebugUtils.currentLine=64487495;
 //BA.debugLineNum = 64487495;BA.debugLine="hasreport=1";
_hasreport = BA.NumberToString(1);
 };
RDebugUtils.currentLine=64487498;
 //BA.debugLineNum = 64487498;BA.debugLine="fldTedadJozBargasht=myCode.Is_Null_adad(MCode.S";
_fldtedadjozbargasht = mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,BA.ObjectToString(mostCurrent._mcode._singleresult /*Object*/ (mostCurrent.activityBA,("select Sum(FldTedadDarSabadJoz) as FldTedadDarSabadJoz from TblFaktor where fldShomareForoosh>0 and FldType='Marjoee' and FldC_Tafzili="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._mcode._codemoshtariselect /*String*/ ))+" and FldDate between "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._dateaz))+"  and  "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._dateta))+""))));
RDebugUtils.currentLine=64487499;
 //BA.debugLineNum = 64487499;BA.debugLine="fldTedadKolBargasht=myCode.Is_Null_adad(MCode.S";
_fldtedadkolbargasht = mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,BA.ObjectToString(mostCurrent._mcode._singleresult /*Object*/ (mostCurrent.activityBA,("select Sum(FldTedadDarSabadKol) as FldTedadDarSabadKol from TblFaktor where fldShomareForoosh>0 and FldType='Marjoee' and FldC_Tafzili="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._mcode._codemoshtariselect /*String*/ ))+" and FldDate between "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._dateaz))+"  and  "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._dateta))+""))));
RDebugUtils.currentLine=64487500;
 //BA.debugLineNum = 64487500;BA.debugLine="Dim cu As Cursor=MCode.Result($\"select distinct";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,("select distinct FldTotalFaktor from TblFaktor where fldShomareForoosh>0 and FldType='Marjoee' and FldC_Tafzili="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._mcode._codemoshtariselect /*String*/ ))+" and FldDate between "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._dateaz))+"   and  "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._dateta))+""));
RDebugUtils.currentLine=64487501;
 //BA.debugLineNum = 64487501;BA.debugLine="If cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=64487502;
 //BA.debugLineNum = 64487502;BA.debugLine="For  i=0 To cu.RowCount-1";
{
final int step72 = 1;
final int limit72 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit72 ;_i = _i + step72 ) {
RDebugUtils.currentLine=64487503;
 //BA.debugLineNum = 64487503;BA.debugLine="cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=64487504;
 //BA.debugLineNum = 64487504;BA.debugLine="fldFeeBargasht =fldFeeBargasht+ myCode.Is_Nul";
_fldfeebargasht = BA.NumberToString((double)(Double.parseDouble(_fldfeebargasht))+(double)(Double.parseDouble(mostCurrent._mycode._is_null_adad /*String*/ (mostCurrent.activityBA,_cu.GetString("FldTotalFaktor")))));
 }
};
RDebugUtils.currentLine=64487506;
 //BA.debugLineNum = 64487506;BA.debugLine="hasreport=1";
_hasreport = BA.NumberToString(1);
 };
 };
RDebugUtils.currentLine=64487511;
 //BA.debugLineNum = 64487511;BA.debugLine="LblTedadForoosh.Text= fldTedadJozForoosh &\" عدد";
mostCurrent._lbltedadforoosh.setText(BA.ObjectToCharSequence(_fldtedadjozforoosh+" عدد و "+_fldtedadkolforoosh+" کارتن "));
RDebugUtils.currentLine=64487512;
 //BA.debugLineNum = 64487512;BA.debugLine="LblTedadSefaresh.Text= fldTedadJozSefaresh &\" عد";
mostCurrent._lbltedadsefaresh.setText(BA.ObjectToCharSequence(_fldtedadjozsefaresh+" عدد و "+_fldtedadkolsefaresh+" کارتن "));
RDebugUtils.currentLine=64487513;
 //BA.debugLineNum = 64487513;BA.debugLine="LblTedadBargasht.Text= fldTedadJozBargasht &\" عد";
mostCurrent._lbltedadbargasht.setText(BA.ObjectToCharSequence(_fldtedadjozbargasht+" عدد و "+_fldtedadkolbargasht+" کارتن "));
RDebugUtils.currentLine=64487514;
 //BA.debugLineNum = 64487514;BA.debugLine="LblTedadEshantion.Text= fldTedadEshantionJoz &\"";
mostCurrent._lbltedadeshantion.setText(BA.ObjectToCharSequence(_fldtedadeshantionjoz+" عدد و "+_fldtedadeshantionkol+" کارتن "));
RDebugUtils.currentLine=64487516;
 //BA.debugLineNum = 64487516;BA.debugLine="LblSumForoosh.Text =myCode.AdadToPrice(fldFeeJoz";
mostCurrent._lblsumforoosh.setText(BA.ObjectToCharSequence(mostCurrent._mycode._adadtoprice /*String*/ (mostCurrent.activityBA,_fldfeejoz)));
RDebugUtils.currentLine=64487517;
 //BA.debugLineNum = 64487517;BA.debugLine="LblSumSefaresh.Text =myCode.AdadToPrice(fldFeeJo";
mostCurrent._lblsumsefaresh.setText(BA.ObjectToCharSequence(mostCurrent._mycode._adadtoprice /*String*/ (mostCurrent.activityBA,_fldfeejozsefaresh)));
RDebugUtils.currentLine=64487518;
 //BA.debugLineNum = 64487518;BA.debugLine="LblSumBargasht.Text =myCode.AdadToPrice(fldFeeBa";
mostCurrent._lblsumbargasht.setText(BA.ObjectToCharSequence(mostCurrent._mycode._adadtoprice /*String*/ (mostCurrent.activityBA,_fldfeebargasht)));
RDebugUtils.currentLine=64487520;
 //BA.debugLineNum = 64487520;BA.debugLine="If	fldFeeJoz>0 Then";
if ((double)(Double.parseDouble(_fldfeejoz))>0) { 
RDebugUtils.currentLine=64487521;
 //BA.debugLineNum = 64487521;BA.debugLine="fldSumKhales=fldFeeJoz-fldFeeBargasht";
_fldsumkhales = BA.NumberToString((double)(Double.parseDouble(_fldfeejoz))-(double)(Double.parseDouble(_fldfeebargasht)));
 }else {
RDebugUtils.currentLine=64487524;
 //BA.debugLineNum = 64487524;BA.debugLine="fldSumKhales=0";
_fldsumkhales = BA.NumberToString(0);
 };
RDebugUtils.currentLine=64487527;
 //BA.debugLineNum = 64487527;BA.debugLine="LblSumKhales.Text =myCode.AdadToPrice(fldSumKhal";
mostCurrent._lblsumkhales.setText(BA.ObjectToCharSequence(mostCurrent._mycode._adadtoprice /*String*/ (mostCurrent.activityBA,_fldsumkhales)));
RDebugUtils.currentLine=64487529;
 //BA.debugLineNum = 64487529;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=64487530;
 //BA.debugLineNum = 64487530;BA.debugLine="If hasreport=1 Then";
if ((_hasreport).equals(BA.NumberToString(1))) { 
RDebugUtils.currentLine=64487531;
 //BA.debugLineNum = 64487531;BA.debugLine="Btn_show.Visible=True";
mostCurrent._btn_show.setVisible(anywheresoftware.b4a.keywords.Common.True);
 }else {
RDebugUtils.currentLine=64487533;
 //BA.debugLineNum = 64487533;BA.debugLine="Btn_show.Visible=False";
mostCurrent._btn_show.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
 } 
       catch (Exception e99) {
			processBA.setLastException(e99);RDebugUtils.currentLine=64487536;
 //BA.debugLineNum = 64487536;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("564487536",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=64487537;
 //BA.debugLineNum = 64487537;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-LoadData");
 };
RDebugUtils.currentLine=64487539;
 //BA.debugLineNum = 64487539;BA.debugLine="End Sub";
return "";
}
public static String  _btnta_click() throws Exception{
RDebugUtils.currentModule="act_reportvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnta_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnta_click", null));}
com.porya.datetimepicker.PersianMaterialDatePickerWrapper _p1 = null;
RDebugUtils.currentLine=64159744;
 //BA.debugLineNum = 64159744;BA.debugLine="Sub BtnTa_Click";
RDebugUtils.currentLine=64159745;
 //BA.debugLineNum = 64159745;BA.debugLine="Dim p1 As PersianMaterialDatePicker";
_p1 = new com.porya.datetimepicker.PersianMaterialDatePickerWrapper();
RDebugUtils.currentLine=64159746;
 //BA.debugLineNum = 64159746;BA.debugLine="p1.Initialize(\"p1\",p1.PersianYear,p1.PersianMonth";
_p1.Initialize(mostCurrent.activityBA,"p1",_p1.getPersianYear(),_p1.getPersianMonth(),_p1.getPersianDay());
RDebugUtils.currentLine=64159747;
 //BA.debugLineNum = 64159747;BA.debugLine="p1.AccentColor = Colors.RGB(83,99,255)";
_p1.setAccentColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (83),(int) (99),(int) (255)));
RDebugUtils.currentLine=64159748;
 //BA.debugLineNum = 64159748;BA.debugLine="p1.OkText = \"تایید\"";
_p1.setOkText("تایید");
RDebugUtils.currentLine=64159749;
 //BA.debugLineNum = 64159749;BA.debugLine="p1.CancelText = \"لغو\"";
_p1.setCancelText("لغو");
RDebugUtils.currentLine=64159750;
 //BA.debugLineNum = 64159750;BA.debugLine="p1.Title = \"تا تاریخ\"";
_p1.setTitle("تا تاریخ");
RDebugUtils.currentLine=64159751;
 //BA.debugLineNum = 64159751;BA.debugLine="p1.Typeface = \"iransansmonospacednum.ttf\"";
_p1.setTypeface("iransansmonospacednum.ttf");
RDebugUtils.currentLine=64159752;
 //BA.debugLineNum = 64159752;BA.debugLine="p1.Show(\"p1\")";
_p1.Show("p1");
RDebugUtils.currentLine=64159753;
 //BA.debugLineNum = 64159753;BA.debugLine="End Sub";
return "";
}
public static String  _lblback_click() throws Exception{
RDebugUtils.currentModule="act_reportvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lblback_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lblback_click", null));}
RDebugUtils.currentLine=64880640;
 //BA.debugLineNum = 64880640;BA.debugLine="Sub LblBack_Click";
RDebugUtils.currentLine=64880641;
 //BA.debugLineNum = 64880641;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=64880642;
 //BA.debugLineNum = 64880642;BA.debugLine="End Sub";
return "";
}
public static String  _loadfactor(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
RDebugUtils.currentModule="act_reportvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "loadfactor", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "loadfactor", new Object[] {_lst}));}
RDebugUtils.currentLine=64815104;
 //BA.debugLineNum = 64815104;BA.debugLine="Sub LoadFactor(lst As List)";
RDebugUtils.currentLine=64815105;
 //BA.debugLineNum = 64815105;BA.debugLine="If	lst.Size>0 Then";
if (_lst.getSize()>0) { 
RDebugUtils.currentLine=64815106;
 //BA.debugLineNum = 64815106;BA.debugLine="Act_RepFactors.DateAz=DateAz";
mostCurrent._act_repfactors._dateaz /*String*/  = mostCurrent._dateaz;
RDebugUtils.currentLine=64815107;
 //BA.debugLineNum = 64815107;BA.debugLine="Act_RepFactors.Dateta=DateTa";
mostCurrent._act_repfactors._dateta /*String*/  = mostCurrent._dateta;
RDebugUtils.currentLine=64815108;
 //BA.debugLineNum = 64815108;BA.debugLine="Act_RepFactors.CodeMoshtari=MCode.CodeMoshtariSe";
mostCurrent._act_repfactors._codemoshtari /*String*/  = mostCurrent._mcode._codemoshtariselect /*String*/ ;
RDebugUtils.currentLine=64815109;
 //BA.debugLineNum = 64815109;BA.debugLine="Act_RepFactors.TotalFactor=LblSumKhales.Text";
mostCurrent._act_repfactors._totalfactor /*String*/  = mostCurrent._lblsumkhales.getText();
RDebugUtils.currentLine=64815110;
 //BA.debugLineNum = 64815110;BA.debugLine="StartActivity(Act_RepFactors)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._act_repfactors.getObject()));
 }else {
RDebugUtils.currentLine=64815112;
 //BA.debugLineNum = 64815112;BA.debugLine="ToastMessageShow(\"اطلاعات ارسالی وجود ندارد\",Tru";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("اطلاعات ارسالی وجود ندارد"),anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=64815114;
 //BA.debugLineNum = 64815114;BA.debugLine="End Sub";
return "";
}
public static String  _loadlistfaktor() throws Exception{
RDebugUtils.currentModule="act_reportvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "loadlistfaktor", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "loadlistfaktor", null));}
long _tfsum = 0L;
RDebugUtils.currentLine=64749568;
 //BA.debugLineNum = 64749568;BA.debugLine="Sub LoadListFaktor";
RDebugUtils.currentLine=64749569;
 //BA.debugLineNum = 64749569;BA.debugLine="Dim TFsum As Long=0";
_tfsum = (long) (0);
RDebugUtils.currentLine=64749571;
 //BA.debugLineNum = 64749571;BA.debugLine="If MCode.Sf.Len(DateAz) = 8 And MCode.Sf.Len(Date";
if (mostCurrent._mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvv1(mostCurrent._dateaz)==8 && mostCurrent._mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvv1(mostCurrent._dateta)==8) { 
RDebugUtils.currentLine=64749572;
 //BA.debugLineNum = 64749572;BA.debugLine="MCode.page=\"Act_ReportVisitor\"";
mostCurrent._mcode._page /*String*/  = "Act_ReportVisitor";
RDebugUtils.currentLine=64749573;
 //BA.debugLineNum = 64749573;BA.debugLine="ProgressDialogShow2(\"لطفا چند لحظه صبر کنید . .";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(mostCurrent.activityBA,BA.ObjectToCharSequence("لطفا چند لحظه صبر کنید . . ."),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=64749575;
 //BA.debugLineNum = 64749575;BA.debugLine="CallSubDelayed3(Service_Server,\"GetReportFactor\"";
anywheresoftware.b4a.keywords.Common.CallSubDelayed3(processBA,(Object)(mostCurrent._service_server.getObject()),"GetReportFactor",(Object)(mostCurrent._dateaz),(Object)(mostCurrent._dateta));
 }else {
RDebugUtils.currentLine=64749619;
 //BA.debugLineNum = 64749619;BA.debugLine="ToastMessageShow(\"تاریخ را به طور صحیح وارد نمای";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("تاریخ را به طور صحیح وارد نمایید"),anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=64749623;
 //BA.debugLineNum = 64749623;BA.debugLine="End Sub";
return "";
}
public static String  _p_oncancel() throws Exception{
RDebugUtils.currentModule="act_reportvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "p_oncancel", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "p_oncancel", null));}
RDebugUtils.currentLine=64028672;
 //BA.debugLineNum = 64028672;BA.debugLine="Sub p_onCancel";
RDebugUtils.currentLine=64028673;
 //BA.debugLineNum = 64028673;BA.debugLine="Log(\"cancel\")";
anywheresoftware.b4a.keywords.Common.LogImpl("564028673","cancel",0);
RDebugUtils.currentLine=64028674;
 //BA.debugLineNum = 64028674;BA.debugLine="End Sub";
return "";
}
public static String  _p_ondateset(int _year,int _month,int _day) throws Exception{
RDebugUtils.currentModule="act_reportvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "p_ondateset", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "p_ondateset", new Object[] {_year,_month,_day}));}
RDebugUtils.currentLine=63963136;
 //BA.debugLineNum = 63963136;BA.debugLine="Sub p_onDateSet(year As Int,month As Int,day As In";
RDebugUtils.currentLine=63963137;
 //BA.debugLineNum = 63963137;BA.debugLine="Log(year&\"/\"&month&\"/\"&day)";
anywheresoftware.b4a.keywords.Common.LogImpl("563963137",BA.NumberToString(_year)+"/"+BA.NumberToString(_month)+"/"+BA.NumberToString(_day),0);
RDebugUtils.currentLine=63963138;
 //BA.debugLineNum = 63963138;BA.debugLine="BtnAz.Text=year&\"/\"&NumberFormat(month,2,0)&\"/\"&N";
mostCurrent._btnaz.setText(BA.ObjectToCharSequence(BA.NumberToString(_year)+"/"+anywheresoftware.b4a.keywords.Common.NumberFormat(_month,(int) (2),(int) (0))+"/"+anywheresoftware.b4a.keywords.Common.NumberFormat(_day,(int) (2),(int) (0))));
RDebugUtils.currentLine=63963139;
 //BA.debugLineNum = 63963139;BA.debugLine="BtnAz.Tag=year&NumberFormat(month,2,0)&NumberForm";
mostCurrent._btnaz.setTag((Object)(BA.NumberToString(_year)+anywheresoftware.b4a.keywords.Common.NumberFormat(_month,(int) (2),(int) (0))+anywheresoftware.b4a.keywords.Common.NumberFormat(_day,(int) (2),(int) (0))));
RDebugUtils.currentLine=63963140;
 //BA.debugLineNum = 63963140;BA.debugLine="DateAz=MPD.PersianToGregorian(year,month,day)";
mostCurrent._dateaz = mostCurrent._mpd.PersianToGregorian(_year,_month,_day);
RDebugUtils.currentLine=63963143;
 //BA.debugLineNum = 63963143;BA.debugLine="DateAz=year&NumberFormat(month,2,0)&NumberFormat(";
mostCurrent._dateaz = BA.NumberToString(_year)+anywheresoftware.b4a.keywords.Common.NumberFormat(_month,(int) (2),(int) (0))+anywheresoftware.b4a.keywords.Common.NumberFormat(_day,(int) (2),(int) (0));
RDebugUtils.currentLine=63963144;
 //BA.debugLineNum = 63963144;BA.debugLine="LogColor(DateAz,Colors.Magenta)";
anywheresoftware.b4a.keywords.Common.LogImpl("563963144",mostCurrent._dateaz,anywheresoftware.b4a.keywords.Common.Colors.Magenta);
RDebugUtils.currentLine=63963145;
 //BA.debugLineNum = 63963145;BA.debugLine="End Sub";
return "";
}
public static String  _p_ondismiss() throws Exception{
RDebugUtils.currentModule="act_reportvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "p_ondismiss", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "p_ondismiss", null));}
RDebugUtils.currentLine=64094208;
 //BA.debugLineNum = 64094208;BA.debugLine="Sub p_onDismiss";
RDebugUtils.currentLine=64094209;
 //BA.debugLineNum = 64094209;BA.debugLine="Log(\"dismiss\")";
anywheresoftware.b4a.keywords.Common.LogImpl("564094209","dismiss",0);
RDebugUtils.currentLine=64094210;
 //BA.debugLineNum = 64094210;BA.debugLine="End Sub";
return "";
}
public static String  _p1_oncancel() throws Exception{
RDebugUtils.currentModule="act_reportvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "p1_oncancel", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "p1_oncancel", null));}
RDebugUtils.currentLine=64290816;
 //BA.debugLineNum = 64290816;BA.debugLine="Sub p1_onCancel";
RDebugUtils.currentLine=64290817;
 //BA.debugLineNum = 64290817;BA.debugLine="Log(\"cancel\")";
anywheresoftware.b4a.keywords.Common.LogImpl("564290817","cancel",0);
RDebugUtils.currentLine=64290818;
 //BA.debugLineNum = 64290818;BA.debugLine="End Sub";
return "";
}
public static String  _p1_ondateset(int _year,int _month,int _day) throws Exception{
RDebugUtils.currentModule="act_reportvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "p1_ondateset", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "p1_ondateset", new Object[] {_year,_month,_day}));}
RDebugUtils.currentLine=64225280;
 //BA.debugLineNum = 64225280;BA.debugLine="Sub p1_onDateSet(year As Int,month As Int,day As I";
RDebugUtils.currentLine=64225281;
 //BA.debugLineNum = 64225281;BA.debugLine="Log(year&\"/\"&month&\"/\"&day)";
anywheresoftware.b4a.keywords.Common.LogImpl("564225281",BA.NumberToString(_year)+"/"+BA.NumberToString(_month)+"/"+BA.NumberToString(_day),0);
RDebugUtils.currentLine=64225282;
 //BA.debugLineNum = 64225282;BA.debugLine="BtnTa.Text=year&\"/\"&NumberFormat(month,2,0)&\"/\"&N";
mostCurrent._btnta.setText(BA.ObjectToCharSequence(BA.NumberToString(_year)+"/"+anywheresoftware.b4a.keywords.Common.NumberFormat(_month,(int) (2),(int) (0))+"/"+anywheresoftware.b4a.keywords.Common.NumberFormat(_day,(int) (2),(int) (0))));
RDebugUtils.currentLine=64225283;
 //BA.debugLineNum = 64225283;BA.debugLine="BtnTa.Tag=year&NumberFormat(month,2,0)&NumberForm";
mostCurrent._btnta.setTag((Object)(BA.NumberToString(_year)+anywheresoftware.b4a.keywords.Common.NumberFormat(_month,(int) (2),(int) (0))+anywheresoftware.b4a.keywords.Common.NumberFormat(_day,(int) (2),(int) (0))));
RDebugUtils.currentLine=64225284;
 //BA.debugLineNum = 64225284;BA.debugLine="DateTa= MPD.PersianToGregorian(year,month,day)";
mostCurrent._dateta = mostCurrent._mpd.PersianToGregorian(_year,_month,_day);
RDebugUtils.currentLine=64225287;
 //BA.debugLineNum = 64225287;BA.debugLine="DateTa=year&NumberFormat(month,2,0)&NumberFormat(";
mostCurrent._dateta = BA.NumberToString(_year)+anywheresoftware.b4a.keywords.Common.NumberFormat(_month,(int) (2),(int) (0))+anywheresoftware.b4a.keywords.Common.NumberFormat(_day,(int) (2),(int) (0));
RDebugUtils.currentLine=64225288;
 //BA.debugLineNum = 64225288;BA.debugLine="LogColor(DateTa,Colors.Magenta)";
anywheresoftware.b4a.keywords.Common.LogImpl("564225288",mostCurrent._dateta,anywheresoftware.b4a.keywords.Common.Colors.Magenta);
RDebugUtils.currentLine=64225289;
 //BA.debugLineNum = 64225289;BA.debugLine="End Sub";
return "";
}
public static String  _p1_ondismiss() throws Exception{
RDebugUtils.currentModule="act_reportvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "p1_ondismiss", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "p1_ondismiss", null));}
RDebugUtils.currentLine=64356352;
 //BA.debugLineNum = 64356352;BA.debugLine="Sub p1_onDismiss";
RDebugUtils.currentLine=64356353;
 //BA.debugLineNum = 64356353;BA.debugLine="Log(\"dismiss\")";
anywheresoftware.b4a.keywords.Common.LogImpl("564356353","dismiss",0);
RDebugUtils.currentLine=64356354;
 //BA.debugLineNum = 64356354;BA.debugLine="End Sub";
return "";
}
}