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

public class act_senddata extends Activity implements B4AActivity{
	public static act_senddata mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.act_senddata");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (act_senddata).");
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
		activityBA = new BA(this, layout, processBA, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.act_senddata");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "ir.parsikhesab.pakhsh.act_senddata", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (act_senddata) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (act_senddata) Resume **");
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
		return act_senddata.class;
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
            BA.LogInfo("** Activity (act_senddata) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (act_senddata) Pause event (activity is not paused). **");
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
            act_senddata mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (act_senddata) Resume **");
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
public anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper _rb_manuel = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper _rb_auto = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper _rb_sendmoshtarian = null;
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
public ir.parsikhesab.pakhsh.act_search _act_search = null;
public ir.parsikhesab.pakhsh.act_selfaktor _act_selfaktor = null;
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
RDebugUtils.currentModule="act_senddata";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=81657856;
 //BA.debugLineNum = 81657856;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=81657857;
 //BA.debugLineNum = 81657857;BA.debugLine="Activity.LoadLayout(\"L_SendData\")";
mostCurrent._activity.LoadLayout("L_SendData",mostCurrent.activityBA);
RDebugUtils.currentLine=81657859;
 //BA.debugLineNum = 81657859;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="act_senddata";
RDebugUtils.currentLine=81788928;
 //BA.debugLineNum = 81788928;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=81788930;
 //BA.debugLineNum = 81788930;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="act_senddata";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=81723392;
 //BA.debugLineNum = 81723392;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=81723394;
 //BA.debugLineNum = 81723394;BA.debugLine="End Sub";
return "";
}
public static boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
RDebugUtils.currentModule="act_senddata";
if (Debug.shouldDelegate(mostCurrent.activityBA, "application_error", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "application_error", new Object[] {_error,_stacktrace}));}
RDebugUtils.currentLine=82116608;
 //BA.debugLineNum = 82116608;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
RDebugUtils.currentLine=82116610;
 //BA.debugLineNum = 82116610;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=82116611;
 //BA.debugLineNum = 82116611;BA.debugLine="End Sub";
return false;
}
public static String  _btn_back_click() throws Exception{
RDebugUtils.currentModule="act_senddata";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_back_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_back_click", null));}
RDebugUtils.currentLine=82051072;
 //BA.debugLineNum = 82051072;BA.debugLine="Sub btn_Back_Click";
RDebugUtils.currentLine=82051073;
 //BA.debugLineNum = 82051073;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=82051074;
 //BA.debugLineNum = 82051074;BA.debugLine="End Sub";
return "";
}
public static String  _btn_cancel_click() throws Exception{
RDebugUtils.currentModule="act_senddata";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_cancel_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_cancel_click", null));}
RDebugUtils.currentLine=81920000;
 //BA.debugLineNum = 81920000;BA.debugLine="Sub Btn_cancel_Click";
RDebugUtils.currentLine=81920001;
 //BA.debugLineNum = 81920001;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=81920002;
 //BA.debugLineNum = 81920002;BA.debugLine="End Sub";
return "";
}
public static void  _btn_ok_click() throws Exception{
RDebugUtils.currentModule="act_senddata";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_ok_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "btn_ok_click", null); return;}
ResumableSub_Btn_ok_Click rsub = new ResumableSub_Btn_ok_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Btn_ok_Click extends BA.ResumableSub {
public ResumableSub_Btn_ok_Click(ir.parsikhesab.pakhsh.act_senddata parent) {
this.parent = parent;
}
ir.parsikhesab.pakhsh.act_senddata parent;
String _date = "";
String _time = "";
String _dt = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu2 = null;
int _i = 0;
ir.parsikhesab.pakhsh.mcode._adaptersendfaktor _item = null;
int step14;
int limit14;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_senddata";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=81854465;
 //BA.debugLineNum = 81854465;BA.debugLine="If MCode.IsConnected=False And MCode.ConnectionSt";
if (true) break;

case 1:
//if
this.state = 4;
if (parent.mostCurrent._mcode._isconnected /*boolean*/ (mostCurrent.activityBA)==anywheresoftware.b4a.keywords.Common.False && (parent.mostCurrent._mcode._connectionstatus /*String*/ ).equals(BA.NumberToString(1))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=81854466;
 //BA.debugLineNum = 81854466;BA.debugLine="ToastMessageShow(\"لطفا ارتباط اینترنت گوشی خود ر";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("لطفا ارتباط اینترنت گوشی خود را بررسی نمایید"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=81854467;
 //BA.debugLineNum = 81854467;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=81854469;
 //BA.debugLineNum = 81854469;BA.debugLine="Dim Date As String = MCode.ConvertNumbersPersian2";
_date = parent.mostCurrent._mcode._convertnumberspersian2english /*String*/ (mostCurrent.activityBA,parent.mostCurrent._mcode._datepersian /*String*/ (mostCurrent.activityBA));
RDebugUtils.currentLine=81854470;
 //BA.debugLineNum = 81854470;BA.debugLine="Dim Time As String =DateTime.Time(DateTime.Now)";
_time = anywheresoftware.b4a.keywords.Common.DateTime.Time(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
RDebugUtils.currentLine=81854471;
 //BA.debugLineNum = 81854471;BA.debugLine="Date = MCode.Sf.Mid(Date,1,4) & \"/\" & MCode.Sf.Mi";
_date = parent.mostCurrent._mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvv5(_date,(int) (1),(int) (4))+"/"+parent.mostCurrent._mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvv5(_date,(int) (5),(int) (2))+"/"+parent.mostCurrent._mcode._sf /*ADR.stringdemo.stringfunctions*/ ._vvv5(_date,(int) (7),(int) (2));
RDebugUtils.currentLine=81854472;
 //BA.debugLineNum = 81854472;BA.debugLine="Dim Dt As String = Date & \"   \" & Time";
_dt = _date+"   "+_time;
RDebugUtils.currentLine=81854473;
 //BA.debugLineNum = 81854473;BA.debugLine="MCode.SaveUpdate(\"Update TblSetting Set FldDateTi";
parent.mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,"Update TblSetting Set FldDateTimeSend = '"+_dt+"'");
RDebugUtils.currentLine=81854474;
 //BA.debugLineNum = 81854474;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From Tb";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = parent.mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblFaktor Where FldSync = 'False' GROUP BY FldShomareFaktor,FldC_Tafzili");
RDebugUtils.currentLine=81854475;
 //BA.debugLineNum = 81854475;BA.debugLine="Dim Cu2 As Cursor = MCode.Result(\"Select * From T";
_cu2 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu2 = parent.mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblAshkhasNew");
RDebugUtils.currentLine=81854476;
 //BA.debugLineNum = 81854476;BA.debugLine="If RB_auto.Checked Then";
if (true) break;

case 5:
//if
this.state = 36;
if (parent.mostCurrent._rb_auto.getChecked()) { 
this.state = 7;
}else 
{RDebugUtils.currentLine=81854503;
 //BA.debugLineNum = 81854503;BA.debugLine="else If RB_Manuel.Checked Then";
if (parent.mostCurrent._rb_manuel.getChecked()) { 
this.state = 19;
}else 
{RDebugUtils.currentLine=81854510;
 //BA.debugLineNum = 81854510;BA.debugLine="Else If RB_SendMoshtarian.Checked Then";
if (parent.mostCurrent._rb_sendmoshtarian.getChecked()) { 
this.state = 27;
}else {
this.state = 35;
}}}
if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=81854478;
 //BA.debugLineNum = 81854478;BA.debugLine="If Cu.RowCount>0 Or Cu2.RowCount>0 Then";
if (true) break;

case 8:
//if
this.state = 17;
if (_cu.getRowCount()>0 || _cu2.getRowCount()>0) { 
this.state = 10;
}else {
this.state = 16;
}if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=81854486;
 //BA.debugLineNum = 81854486;BA.debugLine="For i=0 To Cu.RowCount-1";
if (true) break;

case 11:
//for
this.state = 14;
step14 = 1;
limit14 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
this.state = 37;
if (true) break;

case 37:
//C
this.state = 14;
if ((step14 > 0 && _i <= limit14) || (step14 < 0 && _i >= limit14)) this.state = 13;
if (true) break;

case 38:
//C
this.state = 37;
_i = ((int)(0 + _i + step14)) ;
if (true) break;

case 13:
//C
this.state = 38;
RDebugUtils.currentLine=81854487;
 //BA.debugLineNum = 81854487;BA.debugLine="Cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=81854488;
 //BA.debugLineNum = 81854488;BA.debugLine="Dim Item As AdapterSendFaktor";
_item = new ir.parsikhesab.pakhsh.mcode._adaptersendfaktor();
RDebugUtils.currentLine=81854489;
 //BA.debugLineNum = 81854489;BA.debugLine="Item.FldShomareFaktor=Cu.Getstring(\"FldShomare";
_item.FldShomareFaktor /*int*/  = (int)(Double.parseDouble(_cu.GetString("FldShomareFaktor")));
RDebugUtils.currentLine=81854490;
 //BA.debugLineNum = 81854490;BA.debugLine="Item.FldC_Tafzili=Cu.Getstring(\"FldC_Tafzili\")";
_item.FldC_Tafzili /*String*/  = _cu.GetString("FldC_Tafzili");
RDebugUtils.currentLine=81854491;
 //BA.debugLineNum = 81854491;BA.debugLine="Service_Server.shomareFactorSelect=Item.FldSho";
parent.mostCurrent._service_server._shomarefactorselect /*int*/  = _item.FldShomareFaktor /*int*/ ;
RDebugUtils.currentLine=81854492;
 //BA.debugLineNum = 81854492;BA.debugLine="ProgressDialogShow2(\"در حال ارسال اطلاعات . .";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(mostCurrent.activityBA,BA.ObjectToCharSequence("در حال ارسال اطلاعات . . ."),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=81854493;
 //BA.debugLineNum = 81854493;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_senddata", "btn_ok_click"),(int) (1000));
this.state = 39;
return;
case 39:
//C
this.state = 38;
;
RDebugUtils.currentLine=81854494;
 //BA.debugLineNum = 81854494;BA.debugLine="CallSubDelayed2(Service_Server,\"LoadSend2\",Ite";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(parent.mostCurrent._service_server.getObject()),"LoadSend2",(Object)(_item.FldC_Tafzili /*String*/ ));
RDebugUtils.currentLine=81854495;
 //BA.debugLineNum = 81854495;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_senddata", "btn_ok_click"),(int) (1000));
this.state = 40;
return;
case 40:
//C
this.state = 38;
;
 if (true) break;
if (true) break;

case 14:
//C
this.state = 17;
;
RDebugUtils.currentLine=81854498;
 //BA.debugLineNum = 81854498;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
 if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=81854500;
 //BA.debugLineNum = 81854500;BA.debugLine="ToastMessageShow(\"اطلاعات ارسال نشده موجود نمی";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("اطلاعات ارسال نشده موجود نمی باشد"),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 17:
//C
this.state = 36;
;
 if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=81854504;
 //BA.debugLineNum = 81854504;BA.debugLine="If Cu.RowCount>0 Then";
if (true) break;

case 20:
//if
this.state = 25;
if (_cu.getRowCount()>0) { 
this.state = 22;
}else {
this.state = 24;
}if (true) break;

case 22:
//C
this.state = 25;
RDebugUtils.currentLine=81854505;
 //BA.debugLineNum = 81854505;BA.debugLine="StartActivity(Act_SelFaktor)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._act_selfaktor.getObject()));
RDebugUtils.currentLine=81854506;
 //BA.debugLineNum = 81854506;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
 if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=81854508;
 //BA.debugLineNum = 81854508;BA.debugLine="ToastMessageShow(\"فاکتور ارسال نشده موجود نمی ب";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("فاکتور ارسال نشده موجود نمی باشد"),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 25:
//C
this.state = 36;
;
 if (true) break;

case 27:
//C
this.state = 28;
RDebugUtils.currentLine=81854511;
 //BA.debugLineNum = 81854511;BA.debugLine="Dim Cu As Cursor = MCode.Result(\"Select * From T";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = parent.mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"Select * From TblAshkhas where FldSync='False'");
RDebugUtils.currentLine=81854512;
 //BA.debugLineNum = 81854512;BA.debugLine="If Cu.RowCount>0 Then";
if (true) break;

case 28:
//if
this.state = 33;
if (_cu.getRowCount()>0) { 
this.state = 30;
}else {
this.state = 32;
}if (true) break;

case 30:
//C
this.state = 33;
RDebugUtils.currentLine=81854514;
 //BA.debugLineNum = 81854514;BA.debugLine="StopService(Service_Notification)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(parent.mostCurrent._service_notification.getObject()));
RDebugUtils.currentLine=81854515;
 //BA.debugLineNum = 81854515;BA.debugLine="ProgressDialogShow2(\"در حال ارسال مشتریان جدید";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(mostCurrent.activityBA,BA.ObjectToCharSequence("در حال ارسال مشتریان جدید . . ."),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=81854516;
 //BA.debugLineNum = 81854516;BA.debugLine="CallSubDelayed(Service_Server,\"LoadSendAshkhasN";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,(Object)(parent.mostCurrent._service_server.getObject()),"LoadSendAshkhasNew");
RDebugUtils.currentLine=81854517;
 //BA.debugLineNum = 81854517;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
 if (true) break;

case 32:
//C
this.state = 33;
RDebugUtils.currentLine=81854519;
 //BA.debugLineNum = 81854519;BA.debugLine="ToastMessageShow(\"مشتری جدید ارسال نشده موجود ن";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("مشتری جدید ارسال نشده موجود نمی باشد"),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 33:
//C
this.state = 36;
;
 if (true) break;

case 35:
//C
this.state = 36;
RDebugUtils.currentLine=81854522;
 //BA.debugLineNum = 81854522;BA.debugLine="ToastMessageShow(\"لطفا یکی از گزینه ها را انتخاب";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("لطفا یکی از گزینه ها را انتخاب کنید."),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 36:
//C
this.state = -1;
;
RDebugUtils.currentLine=81854524;
 //BA.debugLineNum = 81854524;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _lblback_click() throws Exception{
RDebugUtils.currentModule="act_senddata";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lblback_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lblback_click", null));}
RDebugUtils.currentLine=81985536;
 //BA.debugLineNum = 81985536;BA.debugLine="Sub LblBack_Click";
RDebugUtils.currentLine=81985537;
 //BA.debugLineNum = 81985537;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=81985539;
 //BA.debugLineNum = 81985539;BA.debugLine="End Sub";
return "";
}
}