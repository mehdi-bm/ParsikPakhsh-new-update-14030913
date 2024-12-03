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

public class act_video extends Activity implements B4AActivity{
	public static act_video mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.act_video");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (act_video).");
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
		activityBA = new BA(this, layout, processBA, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.act_video");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "ir.parsikhesab.pakhsh.act_video", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (act_video) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (act_video) Resume **");
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
		return act_video.class;
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
            BA.LogInfo("** Activity (act_video) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (act_video) Pause event (activity is not paused). **");
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
            act_video mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (act_video) Resume **");
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
public static anywheresoftware.b4a.objects.collections.List _videolist = null;
public wir.hitex.recycler.Hitex_LayoutView _hlv = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnl_hlv = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnl_playvideo = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblclosev = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltitle = null;
public anywheresoftware.b4a.objects.SimpleExoPlayerViewWrapper _simpleexoplayerview1 = null;
public anywheresoftware.b4a.objects.SimpleExoPlayerWrapper _player1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnl_video = null;
public ir.parsikhesab.pakhsh.mcode._adapterlistvideo _items = null;
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
public ir.parsikhesab.pakhsh.act_senddata _act_senddata = null;
public ir.parsikhesab.pakhsh.act_setting _act_setting = null;
public ir.parsikhesab.pakhsh.act_settingpos _act_settingpos = null;
public ir.parsikhesab.pakhsh.act_showlocation _act_showlocation = null;
public ir.parsikhesab.pakhsh.act_support _act_support = null;
public ir.parsikhesab.pakhsh.act_ticket _act_ticket = null;
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
public static void  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="act_video";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}); return;}
ResumableSub_Activity_Create rsub = new ResumableSub_Activity_Create(null,_firsttime);
rsub.resume(processBA, null);
}
public static class ResumableSub_Activity_Create extends BA.ResumableSub {
public ResumableSub_Activity_Create(ir.parsikhesab.pakhsh.act_video parent,boolean _firsttime) {
this.parent = parent;
this._firsttime = _firsttime;
}
ir.parsikhesab.pakhsh.act_video parent;
boolean _firsttime;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="act_video";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=85393409;
 //BA.debugLineNum = 85393409;BA.debugLine="Activity.LoadLayout(\"l_Video\")";
parent.mostCurrent._activity.LoadLayout("l_Video",mostCurrent.activityBA);
RDebugUtils.currentLine=85393410;
 //BA.debugLineNum = 85393410;BA.debugLine="HLV.Initializer(\"HLV\").GridView(2).Build";
parent.mostCurrent._hlv.Initializer(mostCurrent.activityBA,"HLV").GridView((int) (2)).Build();
RDebugUtils.currentLine=85393411;
 //BA.debugLineNum = 85393411;BA.debugLine="Pnl_HLV.AddView(HLV,0,0,Pnl_HLV.Width,Pnl_HLV.Hei";
parent.mostCurrent._pnl_hlv.AddView((android.view.View)(parent.mostCurrent._hlv.getObject()),(int) (0),(int) (0),parent.mostCurrent._pnl_hlv.getWidth(),parent.mostCurrent._pnl_hlv.getHeight());
RDebugUtils.currentLine=85393412;
 //BA.debugLineNum = 85393412;BA.debugLine="Videolist.Initialize";
parent._videolist.Initialize();
RDebugUtils.currentLine=85393413;
 //BA.debugLineNum = 85393413;BA.debugLine="player1.Initialize(\"player\")";
parent.mostCurrent._player1.Initialize(processBA,"player");
RDebugUtils.currentLine=85393414;
 //BA.debugLineNum = 85393414;BA.debugLine="Pnl_PlayVideo.Visible=False";
parent.mostCurrent._pnl_playvideo.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=85393415;
 //BA.debugLineNum = 85393415;BA.debugLine="ProgressDialogShow2(\"لطفا صبر کنید . . .\",False)";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(mostCurrent.activityBA,BA.ObjectToCharSequence("لطفا صبر کنید . . ."),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=85393416;
 //BA.debugLineNum = 85393416;BA.debugLine="Sleep(150)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "act_video", "activity_create"),(int) (150));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=85393417;
 //BA.debugLineNum = 85393417;BA.debugLine="CallSubDelayed(Service_Server,\"GetVideoAmoozesh\")";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,(Object)(parent.mostCurrent._service_server.getObject()),"GetVideoAmoozesh");
RDebugUtils.currentLine=85393418;
 //BA.debugLineNum = 85393418;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static boolean  _activity_keypress(int _keycode) throws Exception{
RDebugUtils.currentModule="act_video";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_keypress", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "activity_keypress", new Object[] {_keycode}));}
RDebugUtils.currentLine=85917696;
 //BA.debugLineNum = 85917696;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
RDebugUtils.currentLine=85917697;
 //BA.debugLineNum = 85917697;BA.debugLine="Try";
try {RDebugUtils.currentLine=85917698;
 //BA.debugLineNum = 85917698;BA.debugLine="If KeyCode=KeyCodes.KEYCODE_BACK Then";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK) { 
RDebugUtils.currentLine=85917699;
 //BA.debugLineNum = 85917699;BA.debugLine="If Pnl_PlayVideo.Visible Then";
if (mostCurrent._pnl_playvideo.getVisible()) { 
RDebugUtils.currentLine=85917700;
 //BA.debugLineNum = 85917700;BA.debugLine="lblCloseV_Click";
_lblclosev_click();
 }else {
RDebugUtils.currentLine=85917702;
 //BA.debugLineNum = 85917702;BA.debugLine="If player1.IsPlaying Then";
if (mostCurrent._player1.getIsPlaying()) { 
RDebugUtils.currentLine=85917703;
 //BA.debugLineNum = 85917703;BA.debugLine="player1.Pause";
mostCurrent._player1.Pause();
 };
RDebugUtils.currentLine=85917705;
 //BA.debugLineNum = 85917705;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 };
RDebugUtils.currentLine=85917708;
 //BA.debugLineNum = 85917708;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 };
 } 
       catch (Exception e14) {
			processBA.setLastException(e14);RDebugUtils.currentLine=85917712;
 //BA.debugLineNum = 85917712;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("585917712",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=85917713;
 //BA.debugLineNum = 85917713;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-Activity_KeyPress");
 };
RDebugUtils.currentLine=85917715;
 //BA.debugLineNum = 85917715;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=85917716;
 //BA.debugLineNum = 85917716;BA.debugLine="End Sub";
return false;
}
public static String  _lblclosev_click() throws Exception{
RDebugUtils.currentModule="act_video";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lblclosev_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lblclosev_click", null));}
RDebugUtils.currentLine=85852160;
 //BA.debugLineNum = 85852160;BA.debugLine="Private Sub lblCloseV_Click";
RDebugUtils.currentLine=85852161;
 //BA.debugLineNum = 85852161;BA.debugLine="MCode.AnimationClose(Pnl_PlayVideo)";
mostCurrent._mcode._animationclose /*String*/ (mostCurrent.activityBA,(Object)(mostCurrent._pnl_playvideo.getObject()));
RDebugUtils.currentLine=85852162;
 //BA.debugLineNum = 85852162;BA.debugLine="Pnl_PlayVideo.Visible=False";
mostCurrent._pnl_playvideo.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=85852163;
 //BA.debugLineNum = 85852163;BA.debugLine="player1.Pause";
mostCurrent._player1.Pause();
RDebugUtils.currentLine=85852164;
 //BA.debugLineNum = 85852164;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="act_video";
RDebugUtils.currentLine=86310912;
 //BA.debugLineNum = 86310912;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=86310913;
 //BA.debugLineNum = 86310913;BA.debugLine="player1.Pause";
mostCurrent._player1.Pause();
RDebugUtils.currentLine=86310914;
 //BA.debugLineNum = 86310914;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="act_video";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=86245376;
 //BA.debugLineNum = 86245376;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=86245378;
 //BA.debugLineNum = 86245378;BA.debugLine="End Sub";
return "";
}
public static boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
RDebugUtils.currentModule="act_video";
if (Debug.shouldDelegate(mostCurrent.activityBA, "application_error", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "application_error", new Object[] {_error,_stacktrace}));}
RDebugUtils.currentLine=86376448;
 //BA.debugLineNum = 86376448;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
RDebugUtils.currentLine=86376450;
 //BA.debugLineNum = 86376450;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=86376451;
 //BA.debugLineNum = 86376451;BA.debugLine="End Sub";
return false;
}
public static String  _btn_back_click() throws Exception{
RDebugUtils.currentModule="act_video";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_back_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_back_click", null));}
RDebugUtils.currentLine=85786624;
 //BA.debugLineNum = 85786624;BA.debugLine="Private Sub btn_Back_Click";
RDebugUtils.currentLine=85786625;
 //BA.debugLineNum = 85786625;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=85786626;
 //BA.debugLineNum = 85786626;BA.debugLine="End Sub";
return "";
}
public static int  _hlv_getitemcount() throws Exception{
RDebugUtils.currentModule="act_video";
if (Debug.shouldDelegate(mostCurrent.activityBA, "hlv_getitemcount", false))
	 {return ((Integer) Debug.delegate(mostCurrent.activityBA, "hlv_getitemcount", null));}
RDebugUtils.currentLine=85524480;
 //BA.debugLineNum = 85524480;BA.debugLine="Sub HLV_GetItemCount As Int 								        '💯 It";
RDebugUtils.currentLine=85524481;
 //BA.debugLineNum = 85524481;BA.debugLine="Return Videolist.Size";
if (true) return _videolist.getSize();
RDebugUtils.currentLine=85524482;
 //BA.debugLineNum = 85524482;BA.debugLine="End Sub";
return 0;
}
public static String  _hlv_itemclick(anywheresoftware.b4a.objects.PanelWrapper _clickeditem,int _position) throws Exception{
RDebugUtils.currentModule="act_video";
if (Debug.shouldDelegate(mostCurrent.activityBA, "hlv_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "hlv_itemclick", new Object[] {_clickeditem,_position}));}
RDebugUtils.currentLine=85721088;
 //BA.debugLineNum = 85721088;BA.debugLine="Private Sub HLV_ItemClick (ClickedItem As Panel, P";
RDebugUtils.currentLine=85721089;
 //BA.debugLineNum = 85721089;BA.debugLine="MCode.VideoSelected=Position";
mostCurrent._mcode._videoselected /*String*/  = BA.NumberToString(_position);
RDebugUtils.currentLine=85721090;
 //BA.debugLineNum = 85721090;BA.debugLine="End Sub";
return "";
}
public static String  _hlv_onbindviewholder(anywheresoftware.b4a.objects.PanelWrapper _parent,int _position) throws Exception{
RDebugUtils.currentModule="act_video";
if (Debug.shouldDelegate(mostCurrent.activityBA, "hlv_onbindviewholder", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "hlv_onbindviewholder", new Object[] {_parent,_position}));}
ir.parsikhesab.pakhsh.mcode._adapterlistvideo _item = null;
ir.parsikhesab.pakhsh.cls_rec_video _rec = null;
RDebugUtils.currentLine=85655552;
 //BA.debugLineNum = 85655552;BA.debugLine="Sub HLV_onBindViewHolder (Parent As Panel, Positio";
RDebugUtils.currentLine=85655553;
 //BA.debugLineNum = 85655553;BA.debugLine="Dim Item = Videolist.Get(Position) As AdapterList";
_item = (ir.parsikhesab.pakhsh.mcode._adapterlistvideo)(_videolist.Get(_position));
RDebugUtils.currentLine=85655554;
 //BA.debugLineNum = 85655554;BA.debugLine="Dim rec As Cls_Rec_Video=Parent.Tag";
_rec = (ir.parsikhesab.pakhsh.cls_rec_video)(_parent.getTag());
RDebugUtils.currentLine=85655555;
 //BA.debugLineNum = 85655555;BA.debugLine="rec.Show(Item,Position)";
_rec._show /*String*/ (null,_item,_position);
RDebugUtils.currentLine=85655556;
 //BA.debugLineNum = 85655556;BA.debugLine="Parent.Height=rec.Height";
_parent.setHeight(_rec._getheight /*int*/ (null));
RDebugUtils.currentLine=85655557;
 //BA.debugLineNum = 85655557;BA.debugLine="End Sub";
return "";
}
public static String  _hlv_oncreateviewholder(anywheresoftware.b4a.objects.PanelWrapper _parent,int _viewtype) throws Exception{
RDebugUtils.currentModule="act_video";
if (Debug.shouldDelegate(mostCurrent.activityBA, "hlv_oncreateviewholder", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "hlv_oncreateviewholder", new Object[] {_parent,_viewtype}));}
ir.parsikhesab.pakhsh.cls_rec_video _rec = null;
RDebugUtils.currentLine=85590016;
 //BA.debugLineNum = 85590016;BA.debugLine="Sub HLV_onCreateViewHolder (Parent As Panel, ViewT";
RDebugUtils.currentLine=85590017;
 //BA.debugLineNum = 85590017;BA.debugLine="Dim rec As Cls_Rec_Video";
_rec = new ir.parsikhesab.pakhsh.cls_rec_video();
RDebugUtils.currentLine=85590018;
 //BA.debugLineNum = 85590018;BA.debugLine="rec.Initialize(Me)";
_rec._initialize /*String*/ (null,mostCurrent.activityBA,act_video.getObject());
RDebugUtils.currentLine=85590019;
 //BA.debugLineNum = 85590019;BA.debugLine="Parent.AddView(rec.Panel,0,0,100%x,rec.Height)";
_parent.AddView((android.view.View)(_rec._getpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ (null).getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),_rec._getheight /*int*/ (null));
RDebugUtils.currentLine=85590020;
 //BA.debugLineNum = 85590020;BA.debugLine="Parent.Tag=rec";
_parent.setTag((Object)(_rec));
RDebugUtils.currentLine=85590021;
 //BA.debugLineNum = 85590021;BA.debugLine="End Sub";
return "";
}
public static String  _lbldownload_click() throws Exception{
RDebugUtils.currentModule="act_video";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lbldownload_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lbldownload_click", null));}
anywheresoftware.b4a.phone.Phone.PhoneIntents _p1 = null;
RDebugUtils.currentLine=86441984;
 //BA.debugLineNum = 86441984;BA.debugLine="Private Sub lblDownload_Click";
RDebugUtils.currentLine=86441985;
 //BA.debugLineNum = 86441985;BA.debugLine="Try";
try {RDebugUtils.currentLine=86441986;
 //BA.debugLineNum = 86441986;BA.debugLine="Dim p1 As PhoneIntents";
_p1 = new anywheresoftware.b4a.phone.Phone.PhoneIntents();
RDebugUtils.currentLine=86441987;
 //BA.debugLineNum = 86441987;BA.debugLine="StartActivity(p1.OpenBrowser(items.fldLink))";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(_p1.OpenBrowser(mostCurrent._items.fldLink /*String*/ )));
 } 
       catch (Exception e5) {
			processBA.setLastException(e5);RDebugUtils.currentLine=86441989;
 //BA.debugLineNum = 86441989;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("586441989",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 };
RDebugUtils.currentLine=86441991;
 //BA.debugLineNum = 86441991;BA.debugLine="End Sub";
return "";
}
public static String  _loaddata(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
RDebugUtils.currentModule="act_video";
if (Debug.shouldDelegate(mostCurrent.activityBA, "loaddata", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "loaddata", new Object[] {_lst}));}
anywheresoftware.b4a.objects.collections.Map _row = null;
int _i = 0;
ir.parsikhesab.pakhsh.mcode._adapterlistvideo _item = null;
RDebugUtils.currentLine=85458944;
 //BA.debugLineNum = 85458944;BA.debugLine="Sub LoadData(lst As List)";
RDebugUtils.currentLine=85458945;
 //BA.debugLineNum = 85458945;BA.debugLine="Videolist.Clear";
_videolist.Clear();
RDebugUtils.currentLine=85458946;
 //BA.debugLineNum = 85458946;BA.debugLine="Dim Row As Map";
_row = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=85458947;
 //BA.debugLineNum = 85458947;BA.debugLine="For i = 0 To lst.Size-1";
{
final int step3 = 1;
final int limit3 = (int) (_lst.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=85458948;
 //BA.debugLineNum = 85458948;BA.debugLine="Dim item As AdapterListVideo";
_item = new ir.parsikhesab.pakhsh.mcode._adapterlistvideo();
RDebugUtils.currentLine=85458949;
 //BA.debugLineNum = 85458949;BA.debugLine="Row=lst.Get(i)";
_row = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lst.Get(_i)));
RDebugUtils.currentLine=85458950;
 //BA.debugLineNum = 85458950;BA.debugLine="item.Id=Row.Get(\"Id\")";
_item.Id /*String*/  = BA.ObjectToString(_row.Get((Object)("Id")));
RDebugUtils.currentLine=85458951;
 //BA.debugLineNum = 85458951;BA.debugLine="item.fldTitle=Row.Get(\"fldTitle\")";
_item.fldTitle /*String*/  = BA.ObjectToString(_row.Get((Object)("fldTitle")));
RDebugUtils.currentLine=85458952;
 //BA.debugLineNum = 85458952;BA.debugLine="item.fldLink=Row.Get(\"fldLink\")";
_item.fldLink /*String*/  = BA.ObjectToString(_row.Get((Object)("fldLink")));
RDebugUtils.currentLine=85458953;
 //BA.debugLineNum = 85458953;BA.debugLine="item.fldDate=Row.Get(\"fldDate\")";
_item.fldDate /*String*/  = BA.ObjectToString(_row.Get((Object)("fldDate")));
RDebugUtils.currentLine=85458954;
 //BA.debugLineNum = 85458954;BA.debugLine="item.fldTime=Row.Get(\"fldTime\")";
_item.fldTime /*String*/  = BA.ObjectToString(_row.Get((Object)("fldTime")));
RDebugUtils.currentLine=85458955;
 //BA.debugLineNum = 85458955;BA.debugLine="item.fldVaziat=Row.Get(\"fldVaziat\")";
_item.fldVaziat /*int*/  = (int)(BA.ObjectToNumber(_row.Get((Object)("fldVaziat"))));
RDebugUtils.currentLine=85458956;
 //BA.debugLineNum = 85458956;BA.debugLine="item.fldDescription=Row.Get(\"fldDescription\")";
_item.fldDescription /*String*/  = BA.ObjectToString(_row.Get((Object)("fldDescription")));
RDebugUtils.currentLine=85458957;
 //BA.debugLineNum = 85458957;BA.debugLine="item.fldImage=Row.Get(\"fldImage\")";
_item.fldImage /*String*/  = BA.ObjectToString(_row.Get((Object)("fldImage")));
RDebugUtils.currentLine=85458958;
 //BA.debugLineNum = 85458958;BA.debugLine="Videolist.Add(item)";
_videolist.Add((Object)(_item));
 }
};
RDebugUtils.currentLine=85458960;
 //BA.debugLineNum = 85458960;BA.debugLine="HLV.Show";
mostCurrent._hlv.Show();
RDebugUtils.currentLine=85458961;
 //BA.debugLineNum = 85458961;BA.debugLine="HLV.notifyDataSetChanged";
mostCurrent._hlv.notifyDataSetChanged();
RDebugUtils.currentLine=85458962;
 //BA.debugLineNum = 85458962;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=85458963;
 //BA.debugLineNum = 85458963;BA.debugLine="End Sub";
return "";
}
public static String  _loadvideo(ir.parsikhesab.pakhsh.mcode._adapterlistvideo _item) throws Exception{
RDebugUtils.currentModule="act_video";
if (Debug.shouldDelegate(mostCurrent.activityBA, "loadvideo", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "loadvideo", new Object[] {_item}));}
RDebugUtils.currentLine=85983232;
 //BA.debugLineNum = 85983232;BA.debugLine="Public Sub LoadVideo(item As AdapterListVideo)";
RDebugUtils.currentLine=85983233;
 //BA.debugLineNum = 85983233;BA.debugLine="Try";
try {RDebugUtils.currentLine=85983234;
 //BA.debugLineNum = 85983234;BA.debugLine="items=item";
mostCurrent._items = _item;
RDebugUtils.currentLine=85983235;
 //BA.debugLineNum = 85983235;BA.debugLine="Pnl_PlayVideo.Visible=True";
mostCurrent._pnl_playvideo.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=85983236;
 //BA.debugLineNum = 85983236;BA.debugLine="MCode.AnimationOpen(Pnl_PlayVideo)";
mostCurrent._mcode._animationopen /*String*/ (mostCurrent.activityBA,(Object)(mostCurrent._pnl_playvideo.getObject()));
RDebugUtils.currentLine=85983237;
 //BA.debugLineNum = 85983237;BA.debugLine="lblTitle.Text=item.fldTitle.Replace(\"-\",\" \")";
mostCurrent._lbltitle.setText(BA.ObjectToCharSequence(_item.fldTitle /*String*/ .replace("-"," ")));
RDebugUtils.currentLine=85983238;
 //BA.debugLineNum = 85983238;BA.debugLine="SimpleExoPlayerView1.Player = player1 'Connect th";
mostCurrent._simpleexoplayerview1.setPlayer(mostCurrent._player1);
RDebugUtils.currentLine=85983239;
 //BA.debugLineNum = 85983239;BA.debugLine="player1.Prepare(player1.CreateUriSource(item.fld";
mostCurrent._player1.Prepare(mostCurrent._player1.CreateUriSource(_item.fldLink /*String*/ ));
 } 
       catch (Exception e9) {
			processBA.setLastException(e9);RDebugUtils.currentLine=85983242;
 //BA.debugLineNum = 85983242;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("585983242",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=85983243;
 //BA.debugLineNum = 85983243;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-LoadVideo");
 };
RDebugUtils.currentLine=85983245;
 //BA.debugLineNum = 85983245;BA.debugLine="End Sub";
return "";
}
public static String  _player_complete() throws Exception{
RDebugUtils.currentModule="act_video";
if (Debug.shouldDelegate(mostCurrent.activityBA, "player_complete", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "player_complete", null));}
RDebugUtils.currentLine=86179840;
 //BA.debugLineNum = 86179840;BA.debugLine="Sub Player_Complete";
RDebugUtils.currentLine=86179841;
 //BA.debugLineNum = 86179841;BA.debugLine="Log(\"complete\")";
anywheresoftware.b4a.keywords.Common.LogImpl("586179841","complete",0);
RDebugUtils.currentLine=86179842;
 //BA.debugLineNum = 86179842;BA.debugLine="End Sub";
return "";
}
public static String  _player_error(String _message) throws Exception{
RDebugUtils.currentModule="act_video";
if (Debug.shouldDelegate(mostCurrent.activityBA, "player_error", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "player_error", new Object[] {_message}));}
RDebugUtils.currentLine=86114304;
 //BA.debugLineNum = 86114304;BA.debugLine="Sub Player_Error (Message As String)";
RDebugUtils.currentLine=86114305;
 //BA.debugLineNum = 86114305;BA.debugLine="Log(\"Error: \" & Message)";
anywheresoftware.b4a.keywords.Common.LogImpl("586114305","Error: "+_message,0);
RDebugUtils.currentLine=86114306;
 //BA.debugLineNum = 86114306;BA.debugLine="End Sub";
return "";
}
public static String  _player_ready() throws Exception{
RDebugUtils.currentModule="act_video";
if (Debug.shouldDelegate(mostCurrent.activityBA, "player_ready", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "player_ready", null));}
RDebugUtils.currentLine=86048768;
 //BA.debugLineNum = 86048768;BA.debugLine="Sub Player_Ready";
RDebugUtils.currentLine=86048769;
 //BA.debugLineNum = 86048769;BA.debugLine="Log(\"Ready\")";
anywheresoftware.b4a.keywords.Common.LogImpl("586048769","Ready",0);
RDebugUtils.currentLine=86048770;
 //BA.debugLineNum = 86048770;BA.debugLine="player1.Play";
mostCurrent._player1.Play();
RDebugUtils.currentLine=86048771;
 //BA.debugLineNum = 86048771;BA.debugLine="End Sub";
return "";
}
}