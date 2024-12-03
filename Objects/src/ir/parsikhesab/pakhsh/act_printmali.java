package ir.parsikhesab.pakhsh;

import android.os.StrictMode;

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

public class act_printmali extends Activity implements B4AActivity{
	public static act_printmali mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.act_printmali");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (act_printmali).");
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
		activityBA = new BA(this, layout, processBA, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.act_printmali");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "ir.parsikhesab.pakhsh.act_printmali", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (act_printmali) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (act_printmali) Resume **");
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
		return act_printmali.class;
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
            BA.LogInfo("** Activity (act_printmali) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (act_printmali) Pause event (activity is not paused). **");
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
            act_printmali mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (act_printmali) Resume **");
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
public static String _pardakhti = "";
public static anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
public Object _ion = null;
public b4a.example3.customlistview _clv1 = null;
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
RDebugUtils.currentModule="act_printmali";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=52494336;
 //BA.debugLineNum = 52494336;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=52494337;
 //BA.debugLineNum = 52494337;BA.debugLine="Activity.LoadLayout(\"L_PrintPic\")";
mostCurrent._activity.LoadLayout("L_PrintPic",mostCurrent.activityBA);
RDebugUtils.currentLine=52494339;
 //BA.debugLineNum = 52494339;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="act_printmali";
RDebugUtils.currentLine=52625408;
 //BA.debugLineNum = 52625408;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=52625410;
 //BA.debugLineNum = 52625410;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="act_printmali";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=52559872;
 //BA.debugLineNum = 52559872;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=52559873;
 //BA.debugLineNum = 52559873;BA.debugLine="clv1.Clear";
mostCurrent._clv1._clear();
RDebugUtils.currentLine=52559874;
 //BA.debugLineNum = 52559874;BA.debugLine="CreateReport";
_createreport();
RDebugUtils.currentLine=52559875;
 //BA.debugLineNum = 52559875;BA.debugLine="End Sub";
return "";
}
public static String  _createreport() throws Exception{
RDebugUtils.currentModule="act_printmali";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createreport", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "createreport", null));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu1 = null;
anywheresoftware.b4a.student.PersianDate _pd = null;
String _date = "";
String _namemoshtari = "";
String _address = "";
String _tell = "";
ir.parsikhesab.pakhsh.cls_printmali _rec1 = null;
String _filename = "";
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp = null;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _b = null;
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
RDebugUtils.currentLine=53084160;
 //BA.debugLineNum = 53084160;BA.debugLine="Sub CreateReport";
RDebugUtils.currentLine=53084161;
 //BA.debugLineNum = 53084161;BA.debugLine="Dim Cu1 As Cursor = MCode.Result(\"Select * From T";
_cu1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu1 = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblAshkhas Where fldCodetafzili = '"+mostCurrent._mcode._c_tafzili /*String*/ +"'");
RDebugUtils.currentLine=53084162;
 //BA.debugLineNum = 53084162;BA.debugLine="Cu1.Position=0";
_cu1.setPosition((int) (0));
RDebugUtils.currentLine=53084163;
 //BA.debugLineNum = 53084163;BA.debugLine="Dim pd As PersianDate";
_pd = new anywheresoftware.b4a.student.PersianDate();
RDebugUtils.currentLine=53084164;
 //BA.debugLineNum = 53084164;BA.debugLine="Dim Date As String= pd.getDate(0,0,0,\"/\")";
_date = _pd.getDate((int) (0),(int) (0),(int) (0),"/");
RDebugUtils.currentLine=53084165;
 //BA.debugLineNum = 53084165;BA.debugLine="Dim nameMoshtari As String = Cu1.GetString(\"fldSh";
_namemoshtari = _cu1.GetString("fldSharheTafzili");
RDebugUtils.currentLine=53084166;
 //BA.debugLineNum = 53084166;BA.debugLine="Dim Address As String = Cu1.GetString(\"fldAdress\"";
_address = _cu1.GetString("fldAdress");
RDebugUtils.currentLine=53084167;
 //BA.debugLineNum = 53084167;BA.debugLine="Dim Tell As String = myCode.Is_Null(Cu1.GetString";
_tell = mostCurrent._mycode._is_null /*String*/ (mostCurrent.activityBA,_cu1.GetString("fldTell"))+" | "+mostCurrent._mycode._is_null /*String*/ (mostCurrent.activityBA,_cu1.GetString("FldMobile"));
RDebugUtils.currentLine=53084171;
 //BA.debugLineNum = 53084171;BA.debugLine="Dim rec1 As cls_PrintMali";
_rec1 = new ir.parsikhesab.pakhsh.cls_printmali();
RDebugUtils.currentLine=53084172;
 //BA.debugLineNum = 53084172;BA.debugLine="rec1.Initialize(Date,nameMoshtari,Address,Tell,P";
_rec1._initialize /*String*/ (null,mostCurrent.activityBA,_date,_namemoshtari,_address,_tell,_pardakhti,_cu);
RDebugUtils.currentLine=53084173;
 //BA.debugLineNum = 53084173;BA.debugLine="clv1.Add(rec1.Panel,0)";
mostCurrent._clv1._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_rec1._getpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ (null).getObject())),(Object)(0));
RDebugUtils.currentLine=53084177;
 //BA.debugLineNum = 53084177;BA.debugLine="Dim filename As String=MCode.ShomareSabt & \".jpg\"";
_filename = mostCurrent._mcode._shomaresabt /*String*/ +".jpg";
RDebugUtils.currentLine=53084178;
 //BA.debugLineNum = 53084178;BA.debugLine="Dim bmp As Bitmap = clv1.sv.ScrollViewInnerPanel.";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_bmp = (anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(mostCurrent._clv1._sv.getScrollViewInnerPanel().Snapshot().getObject()));
RDebugUtils.currentLine=53084179;
 //BA.debugLineNum = 53084179;BA.debugLine="Dim B As B4XBitmap = bmp.Resize(bmp.Width/2,bmp.H";
_b = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_b = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(_bmp.Resize((float) (_bmp.getWidth()/(double)2),(float) (_bmp.getHeight()/(double)2),anywheresoftware.b4a.keywords.Common.True).getObject()));
RDebugUtils.currentLine=53084181;
 //BA.debugLineNum = 53084181;BA.debugLine="Dim out As OutputStream";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=53084182;
 //BA.debugLineNum = 53084182;BA.debugLine="out = File.OpenOutput(File.DirDefaultExternal, fi";
_out = anywheresoftware.b4a.keywords.Common.File.OpenOutput(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),_filename,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=53084183;
 //BA.debugLineNum = 53084183;BA.debugLine="b.WriteToStream(out, 90, \"JPEG\")";
_b.WriteToStream((java.io.OutputStream)(_out.getObject()),(int) (90),BA.getEnumFromString(android.graphics.Bitmap.CompressFormat.class,"JPEG"));
RDebugUtils.currentLine=53084184;
 //BA.debugLineNum = 53084184;BA.debugLine="out.Close";
_out.Close();
RDebugUtils.currentLine=53084186;
 //BA.debugLineNum = 53084186;BA.debugLine="End Sub";
return "";
}
public static String  _btn_back_click() throws Exception{
RDebugUtils.currentModule="act_printmali";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_back_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_back_click", null));}
RDebugUtils.currentLine=53149696;
 //BA.debugLineNum = 53149696;BA.debugLine="Sub btn_Back_Click";
RDebugUtils.currentLine=53149697;
 //BA.debugLineNum = 53149697;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=53149698;
 //BA.debugLineNum = 53149698;BA.debugLine="End Sub";
return "";
}
public static Object  _getba() throws Exception{
RDebugUtils.currentModule="act_printmali";
if (Debug.shouldDelegate(mostCurrent.activityBA, "getba", false))
	 {return ((Object) Debug.delegate(mostCurrent.activityBA, "getba", null));}
anywheresoftware.b4j.object.JavaObject _jo = null;
String _cls = "";
RDebugUtils.currentLine=53018624;
 //BA.debugLineNum = 53018624;BA.debugLine="Sub GetBA As Object";
RDebugUtils.currentLine=53018625;
 //BA.debugLineNum = 53018625;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=53018626;
 //BA.debugLineNum = 53018626;BA.debugLine="Dim cls As String = Me";
_cls = BA.ObjectToString(act_printmali.getObject());
RDebugUtils.currentLine=53018627;
 //BA.debugLineNum = 53018627;BA.debugLine="cls = cls.SubString(\"class \".Length)";
_cls = _cls.substring("class ".length());
RDebugUtils.currentLine=53018628;
 //BA.debugLineNum = 53018628;BA.debugLine="jo.InitializeStatic(cls)";
_jo.InitializeStatic(_cls);
RDebugUtils.currentLine=53018629;
 //BA.debugLineNum = 53018629;BA.debugLine="Return jo.GetField(\"processBA\")";
if (true) return _jo.GetField("processBA");
RDebugUtils.currentLine=53018630;
 //BA.debugLineNum = 53018630;BA.debugLine="End Sub";
return null;
}
public static String  _lblprint_click() throws Exception{
RDebugUtils.currentModule="act_printmali";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lblprint_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lblprint_click", null));}
String _filename = "";
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp = null;
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
int _ispos = 0;
RDebugUtils.currentLine=52756480;
 //BA.debugLineNum = 52756480;BA.debugLine="Sub LblPrint_Click";
RDebugUtils.currentLine=52756481;
 //BA.debugLineNum = 52756481;BA.debugLine="Dim filename As String=MCode.ShomareSabt & \".jpg\"";
_filename = mostCurrent._mcode._shomaresabt /*String*/ +".jpg";
RDebugUtils.currentLine=52756483;
 //BA.debugLineNum = 52756483;BA.debugLine="Dim bmp As Bitmap = clv1.sv.ScrollViewInnerPanel.";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_bmp = (anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(mostCurrent._clv1._sv.getScrollViewInnerPanel().Snapshot().getObject()));
RDebugUtils.currentLine=52756485;
 //BA.debugLineNum = 52756485;BA.debugLine="Dim out As OutputStream";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=52756486;
 //BA.debugLineNum = 52756486;BA.debugLine="out = File.OpenOutput(File.DirDefaultExternal, fi";
_out = anywheresoftware.b4a.keywords.Common.File.OpenOutput(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),_filename,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=52756487;
 //BA.debugLineNum = 52756487;BA.debugLine="bmp.WriteToStream(out, 90, \"JPEG\")";
_bmp.WriteToStream((java.io.OutputStream)(_out.getObject()),(int) (90),BA.getEnumFromString(android.graphics.Bitmap.CompressFormat.class,"JPEG"));
RDebugUtils.currentLine=52756488;
 //BA.debugLineNum = 52756488;BA.debugLine="out.Close";
_out.Close();
RDebugUtils.currentLine=52756490;
 //BA.debugLineNum = 52756490;BA.debugLine="If File.Exists(File.DirDefaultExternal,\"print_sep";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"print_sepehr")==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=52756491;
 //BA.debugLineNum = 52756491;BA.debugLine="File.MakeDir(File.DirDefaultExternal,\"print_sepe";
anywheresoftware.b4a.keywords.Common.File.MakeDir(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"print_sepehr");
 };
RDebugUtils.currentLine=52756493;
 //BA.debugLineNum = 52756493;BA.debugLine="Dim filename As String=MCode.ShomareSabt & \".jpg\"";
_filename = mostCurrent._mcode._shomaresabt /*String*/ +".jpg";
RDebugUtils.currentLine=52756494;
 //BA.debugLineNum = 52756494;BA.debugLine="File.Copy(File.DirDefaultExternal,filename,File.D";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),_filename,anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"print_sepehr/factor.jpg");
RDebugUtils.currentLine=52756496;
 //BA.debugLineNum = 52756496;BA.debugLine="Dim isPos As Int = myCode.getSetting(\"setting.dat";
_ispos = (int)(Double.parseDouble(mostCurrent._mycode._getsetting /*String*/ (mostCurrent.activityBA,"setting.dat","isPos",BA.NumberToString(0))));
RDebugUtils.currentLine=52756497;
 //BA.debugLineNum = 52756497;BA.debugLine="Select Case isPos";
switch (_ispos) {
case 1: {
RDebugUtils.currentLine=52756499;
 //BA.debugLineNum = 52756499;BA.debugLine="PrintPos";
_printpos();
 break; }
case 0: {
RDebugUtils.currentLine=52756501;
 //BA.debugLineNum = 52756501;BA.debugLine="PrintBlutooth";
_printblutooth();
 break; }
}
;
RDebugUtils.currentLine=52756503;
 //BA.debugLineNum = 52756503;BA.debugLine="End Sub";
return "";
}
public static String  _printpos() throws Exception{
RDebugUtils.currentModule="act_printmali";
if (Debug.shouldDelegate(mostCurrent.activityBA, "printpos", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "printpos", null));}
anywheresoftware.b4a.objects.IntentWrapper _i = null;
RDebugUtils.currentLine=52822016;
 //BA.debugLineNum = 52822016;BA.debugLine="Sub PrintPos";
RDebugUtils.currentLine=52822017;
 //BA.debugLineNum = 52822017;BA.debugLine="Dim i As Intent";
_i = new anywheresoftware.b4a.objects.IntentWrapper();
RDebugUtils.currentLine=52822018;
 //BA.debugLineNum = 52822018;BA.debugLine="i.Initialize(\"com.dml.sima7.sepehr.activity.Inten";
_i.Initialize("com.dml.sima7.sepehr.activity.Intent_PrintFactorActivity","");
RDebugUtils.currentLine=52822019;
 //BA.debugLineNum = 52822019;BA.debugLine="StartActivityForResult(i)";
_startactivityforresult(_i);
RDebugUtils.currentLine=52822020;
 //BA.debugLineNum = 52822020;BA.debugLine="End Sub";
return "";
}
public static String  _printblutooth() throws Exception{
RDebugUtils.currentModule="act_printmali";
if (Debug.shouldDelegate(mostCurrent.activityBA, "printblutooth", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "printblutooth", null));}
RDebugUtils.currentLine=52887552;
 //BA.debugLineNum = 52887552;BA.debugLine="Sub PrintBlutooth";
RDebugUtils.currentLine=52887578;
 //BA.debugLineNum = 52887578;BA.debugLine="End Sub";
return "";
}
public static void  _lblshare_click() throws Exception{
RDebugUtils.currentModule="act_printmali";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lblshare_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "lblshare_click", null); return;}
ResumableSub_LblShare_Click rsub = new ResumableSub_LblShare_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_LblShare_Click extends BA.ResumableSub {
public ResumableSub_LblShare_Click(ir.parsikhesab.pakhsh.act_printmali parent) {
this.parent = parent;
}
ir.parsikhesab.pakhsh.act_printmali parent;
String _filename = "";
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp = null;
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
ir.cafetoseeh.PNMultipleSharing _pn = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_printmali";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=52690945;
 //BA.debugLineNum = 52690945;BA.debugLine="Dim filename As String=MCode.ShomareSabt & \".jpg\"";
_filename = parent.mostCurrent._mcode._shomaresabt /*String*/ +".jpg";
RDebugUtils.currentLine=52690948;
 //BA.debugLineNum = 52690948;BA.debugLine="Dim bmp As Bitmap = clv1.sv.ScrollViewInnerPanel.";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_bmp = (anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(parent.mostCurrent._clv1._sv.getScrollViewInnerPanel().Snapshot().getObject()));
RDebugUtils.currentLine=52690949;
 //BA.debugLineNum = 52690949;BA.debugLine="Dim out As OutputStream";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=52690950;
 //BA.debugLineNum = 52690950;BA.debugLine="out = File.OpenOutput(File.DirInternalCache, file";
_out = anywheresoftware.b4a.keywords.Common.File.OpenOutput(anywheresoftware.b4a.keywords.Common.File.getDirInternalCache(),_filename,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=52690951;
 //BA.debugLineNum = 52690951;BA.debugLine="bmp.WriteToStream(out, 100, \"JPEG\")";
_bmp.WriteToStream((java.io.OutputStream)(_out.getObject()),(int) (100),BA.getEnumFromString(android.graphics.Bitmap.CompressFormat.class,"JPEG"));
RDebugUtils.currentLine=52690952;
 //BA.debugLineNum = 52690952;BA.debugLine="out.Close";
_out.Close();
RDebugUtils.currentLine=52690953;
 //BA.debugLineNum = 52690953;BA.debugLine="Sleep(200)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_printmali", "lblshare_click"),(int) (200));
this.state = 7;
return;
case 7:
//C
this.state = 1;
;
RDebugUtils.currentLine=52690954;
 //BA.debugLineNum = 52690954;BA.debugLine="File.Copy(File.DirInternalCache, filename,File.Di";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirInternalCache(),_filename,anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),_filename);
RDebugUtils.currentLine=52690955;
 //BA.debugLineNum = 52690955;BA.debugLine="Sleep(200)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_printmali", "lblshare_click"),(int) (200));
this.state = 8;
return;
case 8:
//C
this.state = 1;
;
RDebugUtils.currentLine=52690956;
 //BA.debugLineNum = 52690956;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 6;
this.catchState = 5;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 6;
this.catchState = 5;
RDebugUtils.currentLine=52690957;
 //BA.debugLineNum = 52690957;BA.debugLine="Dim pn As PNMultipleSharing";
_pn = new ir.cafetoseeh.PNMultipleSharing();
RDebugUtils.currentLine=52690958;
 //BA.debugLineNum = 52690958;BA.debugLine="pn.ShareFileWithCaption(File.DirDefaultExternal,";
_pn.ShareFileWithCaption(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),_filename,"image/*","فاکتور ","اشتراک گذاری");
 if (true) break;

case 5:
//C
this.state = 6;
this.catchState = 0;
RDebugUtils.currentLine=52690961;
 //BA.debugLineNum = 52690961;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("552690961",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=52690962;
 //BA.debugLineNum = 52690962;BA.debugLine="ToastMessageShow(\"برنامه ای جهت اشتراک گذاری یاف";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("برنامه ای جهت اشتراک گذاری یافت نشد"),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;
if (true) break;

case 6:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=52690965;
 //BA.debugLineNum = 52690965;BA.debugLine="End Sub";
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
public static String  _startactivityforresult(anywheresoftware.b4a.objects.IntentWrapper _i) throws Exception{
RDebugUtils.currentModule="act_printmali";
if (Debug.shouldDelegate(mostCurrent.activityBA, "startactivityforresult", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "startactivityforresult", new Object[] {_i}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=52953088;
 //BA.debugLineNum = 52953088;BA.debugLine="Sub StartActivityForResult(i As Intent)";
RDebugUtils.currentLine=52953089;
 //BA.debugLineNum = 52953089;BA.debugLine="Dim jo As JavaObject = GetBA";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_getba()));
RDebugUtils.currentLine=52953090;
 //BA.debugLineNum = 52953090;BA.debugLine="ion = jo.CreateEvent(\"anywheresoftware.b4a.IOnAct";
mostCurrent._ion = _jo.CreateEvent(processBA,"anywheresoftware.b4a.IOnActivityResult","ion",anywheresoftware.b4a.keywords.Common.Null);
RDebugUtils.currentLine=52953091;
 //BA.debugLineNum = 52953091;BA.debugLine="jo.RunMethod(\"startActivityForResult\", Array As O";
_jo.RunMethod("startActivityForResult",new Object[]{mostCurrent._ion,(Object)(_i.getObject())});
RDebugUtils.currentLine=52953092;
 //BA.debugLineNum = 52953092;BA.debugLine="End Sub";
return "";
}
public void _onCreate() { //@cafetoseeh
if (android.os.Build.VERSION.SDK_INT >= 18) {
StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder();
StrictMode.setVmPolicy(builder.build());
//cafetoseeh.ir
builder.detectFileUriExposure();
}}
}