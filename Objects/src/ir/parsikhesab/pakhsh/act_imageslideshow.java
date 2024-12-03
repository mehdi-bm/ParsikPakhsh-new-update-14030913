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

public class act_imageslideshow extends Activity implements B4AActivity{
	public static act_imageslideshow mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.act_imageslideshow");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (act_imageslideshow).");
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
		activityBA = new BA(this, layout, processBA, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.act_imageslideshow");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "ir.parsikhesab.pakhsh.act_imageslideshow", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (act_imageslideshow) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (act_imageslideshow) Resume **");
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
		return act_imageslideshow.class;
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
            BA.LogInfo("** Activity (act_imageslideshow) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (act_imageslideshow) Pause event (activity is not paused). **");
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
            act_imageslideshow mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (act_imageslideshow) Resume **");
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
public static ir.parsikhesab.pakhsh.mcode._adapterlistkala _item = null;
public static anywheresoftware.b4a.objects.collections.List _lstlink = null;
public anywheresoftware.b4a.objects.collections.List _lstgalleryoffline = null;
public wir.hitex.recycler.Hitex_LayoutView _hlv = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnl_hlv = null;
public static int _pos = 0;
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
RDebugUtils.currentModule="act_imageslideshow";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=30539776;
 //BA.debugLineNum = 30539776;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=30539777;
 //BA.debugLineNum = 30539777;BA.debugLine="Try";
try {RDebugUtils.currentLine=30539779;
 //BA.debugLineNum = 30539779;BA.debugLine="Activity.LoadLayout(\"L_Show_Image2\")";
mostCurrent._activity.LoadLayout("L_Show_Image2",mostCurrent.activityBA);
RDebugUtils.currentLine=30539780;
 //BA.debugLineNum = 30539780;BA.debugLine="Hlv.Initializer(\"Hlv\").ListView.Horizontal.Build";
mostCurrent._hlv.Initializer(mostCurrent.activityBA,"Hlv").ListView().Horizontal().Build();
RDebugUtils.currentLine=30539781;
 //BA.debugLineNum = 30539781;BA.debugLine="lstLink.Initialize";
_lstlink.Initialize();
RDebugUtils.currentLine=30539782;
 //BA.debugLineNum = 30539782;BA.debugLine="lstGalleryOffline.Initialize";
mostCurrent._lstgalleryoffline.Initialize();
RDebugUtils.currentLine=30539783;
 //BA.debugLineNum = 30539783;BA.debugLine="pnl_hlv.AddView(Hlv,0,0,96%x ,pnl_hlv.Height)";
mostCurrent._pnl_hlv.AddView((android.view.View)(mostCurrent._hlv.getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (96),mostCurrent.activityBA),mostCurrent._pnl_hlv.getHeight());
RDebugUtils.currentLine=30539784;
 //BA.debugLineNum = 30539784;BA.debugLine="MCode.page=\"Show_Image2\"";
mostCurrent._mcode._page /*String*/  = "Show_Image2";
RDebugUtils.currentLine=30539785;
 //BA.debugLineNum = 30539785;BA.debugLine="Hlv.Show";
mostCurrent._hlv.Show();
RDebugUtils.currentLine=30539786;
 //BA.debugLineNum = 30539786;BA.debugLine="LoadData";
_loaddata();
 } 
       catch (Exception e11) {
			processBA.setLastException(e11);RDebugUtils.currentLine=30539789;
 //BA.debugLineNum = 30539789;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("530539789",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=30539790;
 //BA.debugLineNum = 30539790;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-Activity_Create");
 };
RDebugUtils.currentLine=30539792;
 //BA.debugLineNum = 30539792;BA.debugLine="End Sub";
return "";
}
public static String  _loaddata() throws Exception{
RDebugUtils.currentModule="act_imageslideshow";
if (Debug.shouldDelegate(mostCurrent.activityBA, "loaddata", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "loaddata", null));}
String _defaultpath = "";
String _link = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
int _i = 0;
String _filename = "";
RDebugUtils.currentLine=30605312;
 //BA.debugLineNum = 30605312;BA.debugLine="Sub LoadData";
RDebugUtils.currentLine=30605316;
 //BA.debugLineNum = 30605316;BA.debugLine="Dim DefaultPath As String=\"\"";
_defaultpath = "";
RDebugUtils.currentLine=30605317;
 //BA.debugLineNum = 30605317;BA.debugLine="Try";
try {RDebugUtils.currentLine=30605318;
 //BA.debugLineNum = 30605318;BA.debugLine="Dim Link As String";
_link = "";
RDebugUtils.currentLine=30605319;
 //BA.debugLineNum = 30605319;BA.debugLine="If MCode.PicOnline=1 Then";
if ((mostCurrent._mcode._piconline /*String*/ ).equals(BA.NumberToString(1))) { 
RDebugUtils.currentLine=30605320;
 //BA.debugLineNum = 30605320;BA.debugLine="If Item.fldPathPic=\"0\" Then";
if ((_item.fldPathPic /*String*/ ).equals("0")) { 
RDebugUtils.currentLine=30605323;
 //BA.debugLineNum = 30605323;BA.debugLine="DefaultPath=MCode.GetPicKalaPath(Item.CodeKala";
_defaultpath = mostCurrent._mcode._getpickalapath /*String*/ (mostCurrent.activityBA,_item.CodeKala /*String*/ );
RDebugUtils.currentLine=30605324;
 //BA.debugLineNum = 30605324;BA.debugLine="lstLink.Add(DefaultPath)";
_lstlink.Add((Object)(_defaultpath));
 }else {
RDebugUtils.currentLine=30605326;
 //BA.debugLineNum = 30605326;BA.debugLine="DefaultPath=MCode.ImageUrl &Item.fldPathPic";
_defaultpath = mostCurrent._mcode._imageurl /*String*/ +_item.fldPathPic /*String*/ ;
RDebugUtils.currentLine=30605327;
 //BA.debugLineNum = 30605327;BA.debugLine="lstLink.Add(DefaultPath)";
_lstlink.Add((Object)(_defaultpath));
 };
 }else {
RDebugUtils.currentLine=30605333;
 //BA.debugLineNum = 30605333;BA.debugLine="DefaultPath=MCode.GetPicKalaPath(Item.CodeKala)";
_defaultpath = mostCurrent._mcode._getpickalapath /*String*/ (mostCurrent.activityBA,_item.CodeKala /*String*/ );
RDebugUtils.currentLine=30605334;
 //BA.debugLineNum = 30605334;BA.debugLine="lstLink.Add(DefaultPath)";
_lstlink.Add((Object)(_defaultpath));
 };
 } 
       catch (Exception e17) {
			processBA.setLastException(e17);RDebugUtils.currentLine=30605338;
 //BA.debugLineNum = 30605338;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("530605338",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 };
RDebugUtils.currentLine=30605351;
 //BA.debugLineNum = 30605351;BA.debugLine="Dim cu As Cursor=MCode.Result(\"select * from TblG";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = mostCurrent._mcode._result /*anywheresoftware.b4a.sql.SQL.CursorWrapper*/ (mostCurrent.activityBA,"select * from TblGalleryPic where fldShow='1' and fldCodeKala='"+_item.CodeKala /*String*/ +"'");
RDebugUtils.currentLine=30605352;
 //BA.debugLineNum = 30605352;BA.debugLine="If cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=30605354;
 //BA.debugLineNum = 30605354;BA.debugLine="For i=0 To cu.RowCount-1";
{
final int step21 = 1;
final int limit21 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit21 ;_i = _i + step21 ) {
RDebugUtils.currentLine=30605355;
 //BA.debugLineNum = 30605355;BA.debugLine="cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=30605356;
 //BA.debugLineNum = 30605356;BA.debugLine="lstLink.Add(MCode.ImageUrl &cu.GetString(\"fldIm";
_lstlink.Add((Object)(mostCurrent._mcode._imageurl /*String*/ +_cu.GetString("fldImage")));
 }
};
 }else {
RDebugUtils.currentLine=30605359;
 //BA.debugLineNum = 30605359;BA.debugLine="lstGalleryOffline=MCode.GetListGalleryKala(Item.";
mostCurrent._lstgalleryoffline = mostCurrent._mcode._getlistgallerykala /*anywheresoftware.b4a.objects.collections.List*/ (mostCurrent.activityBA,_item.CodeKala /*String*/ );
RDebugUtils.currentLine=30605361;
 //BA.debugLineNum = 30605361;BA.debugLine="If lstGalleryOffline.Size>0 Then";
if (mostCurrent._lstgalleryoffline.getSize()>0) { 
RDebugUtils.currentLine=30605363;
 //BA.debugLineNum = 30605363;BA.debugLine="For i=0 To lstGalleryOffline.Size-1";
{
final int step28 = 1;
final int limit28 = (int) (mostCurrent._lstgalleryoffline.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit28 ;_i = _i + step28 ) {
RDebugUtils.currentLine=30605364;
 //BA.debugLineNum = 30605364;BA.debugLine="cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=30605365;
 //BA.debugLineNum = 30605365;BA.debugLine="Dim filename As String=lstGalleryOffline.Get(i";
_filename = BA.ObjectToString(mostCurrent._lstgalleryoffline.Get(_i));
RDebugUtils.currentLine=30605366;
 //BA.debugLineNum = 30605366;BA.debugLine="DefaultPath=File.Combine(File.DirDefaultExtern";
_defaultpath = anywheresoftware.b4a.keywords.Common.File.Combine(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal()+"/parsik/GalleryKala/"+_item.CodeKala /*String*/ ,_filename);
RDebugUtils.currentLine=30605367;
 //BA.debugLineNum = 30605367;BA.debugLine="lstLink.Add(DefaultPath)";
_lstlink.Add((Object)(_defaultpath));
 }
};
 };
 };
RDebugUtils.currentLine=30605371;
 //BA.debugLineNum = 30605371;BA.debugLine="Hlv.notifyDataSetChanged";
mostCurrent._hlv.notifyDataSetChanged();
RDebugUtils.currentLine=30605372;
 //BA.debugLineNum = 30605372;BA.debugLine="End Sub";
return "";
}
public static boolean  _activity_keypress(int _keycode) throws Exception{
RDebugUtils.currentModule="act_imageslideshow";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_keypress", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "activity_keypress", new Object[] {_keycode}));}
RDebugUtils.currentLine=31195136;
 //BA.debugLineNum = 31195136;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
RDebugUtils.currentLine=31195137;
 //BA.debugLineNum = 31195137;BA.debugLine="If KeyCode=KeyCodes.KEYCODE_BACK Then";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK) { 
RDebugUtils.currentLine=31195138;
 //BA.debugLineNum = 31195138;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 };
RDebugUtils.currentLine=31195140;
 //BA.debugLineNum = 31195140;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=31195141;
 //BA.debugLineNum = 31195141;BA.debugLine="End Sub";
return false;
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="act_imageslideshow";
RDebugUtils.currentLine=31326208;
 //BA.debugLineNum = 31326208;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=31326210;
 //BA.debugLineNum = 31326210;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="act_imageslideshow";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=31260672;
 //BA.debugLineNum = 31260672;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=31260674;
 //BA.debugLineNum = 31260674;BA.debugLine="End Sub";
return "";
}
public static boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
RDebugUtils.currentModule="act_imageslideshow";
if (Debug.shouldDelegate(mostCurrent.activityBA, "application_error", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "application_error", new Object[] {_error,_stacktrace}));}
RDebugUtils.currentLine=31391744;
 //BA.debugLineNum = 31391744;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
RDebugUtils.currentLine=31391746;
 //BA.debugLineNum = 31391746;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=31391747;
 //BA.debugLineNum = 31391747;BA.debugLine="End Sub";
return false;
}
public static String  _btn_back_click() throws Exception{
RDebugUtils.currentModule="act_imageslideshow";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_back_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_back_click", null));}
RDebugUtils.currentLine=31129600;
 //BA.debugLineNum = 31129600;BA.debugLine="Private Sub btn_back_Click";
RDebugUtils.currentLine=31129601;
 //BA.debugLineNum = 31129601;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=31129602;
 //BA.debugLineNum = 31129602;BA.debugLine="End Sub";
return "";
}
public static String  _btnnext_click() throws Exception{
RDebugUtils.currentModule="act_imageslideshow";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnnext_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnnext_click", null));}
RDebugUtils.currentLine=30932992;
 //BA.debugLineNum = 30932992;BA.debugLine="Private Sub btnNext_Click";
RDebugUtils.currentLine=30932993;
 //BA.debugLineNum = 30932993;BA.debugLine="If pos<lstLink.Size Then pos=pos+1";
if (_pos<_lstlink.getSize()) { 
_pos = (int) (_pos+1);};
RDebugUtils.currentLine=30932994;
 //BA.debugLineNum = 30932994;BA.debugLine="Hlv.SmoothScrollToPosition(pos)";
mostCurrent._hlv.SmoothScrollToPosition(_pos);
RDebugUtils.currentLine=30932995;
 //BA.debugLineNum = 30932995;BA.debugLine="End Sub";
return "";
}
public static String  _btnprev_click() throws Exception{
RDebugUtils.currentModule="act_imageslideshow";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnprev_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnprev_click", null));}
RDebugUtils.currentLine=30867456;
 //BA.debugLineNum = 30867456;BA.debugLine="Private Sub btnPrev_Click";
RDebugUtils.currentLine=30867457;
 //BA.debugLineNum = 30867457;BA.debugLine="If pos>0 Then pos=pos-1";
if (_pos>0) { 
_pos = (int) (_pos-1);};
RDebugUtils.currentLine=30867458;
 //BA.debugLineNum = 30867458;BA.debugLine="Hlv.SmoothScrollToPosition(pos)";
mostCurrent._hlv.SmoothScrollToPosition(_pos);
RDebugUtils.currentLine=30867459;
 //BA.debugLineNum = 30867459;BA.debugLine="End Sub";
return "";
}
public static String  _eventname_onscrollstatechanged(int _state) throws Exception{
RDebugUtils.currentModule="act_imageslideshow";
if (Debug.shouldDelegate(mostCurrent.activityBA, "eventname_onscrollstatechanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "eventname_onscrollstatechanged", new Object[] {_state}));}
RDebugUtils.currentLine=30998528;
 //BA.debugLineNum = 30998528;BA.debugLine="Private Sub EventName_onScrollStateChanged (State";
RDebugUtils.currentLine=30998529;
 //BA.debugLineNum = 30998529;BA.debugLine="Select (State)";
switch (BA.switchObjectToInt((_state),mostCurrent._hlv.SCROLL_STATE_DRAGGING,mostCurrent._hlv.SCROLL_STATE_IDLE,mostCurrent._hlv.SCROLL_STATE_SETTLING)) {
case 0: {
RDebugUtils.currentLine=30998531;
 //BA.debugLineNum = 30998531;BA.debugLine="Log(\"DRAGGING\")";
anywheresoftware.b4a.keywords.Common.LogImpl("530998531","DRAGGING",0);
 break; }
case 1: {
RDebugUtils.currentLine=30998533;
 //BA.debugLineNum = 30998533;BA.debugLine="Log(\"IDLE\")";
anywheresoftware.b4a.keywords.Common.LogImpl("530998533","IDLE",0);
 break; }
case 2: {
RDebugUtils.currentLine=30998535;
 //BA.debugLineNum = 30998535;BA.debugLine="Log(\"SETTLING\")";
anywheresoftware.b4a.keywords.Common.LogImpl("530998535","SETTLING",0);
 break; }
}
;
RDebugUtils.currentLine=30998538;
 //BA.debugLineNum = 30998538;BA.debugLine="End Sub";
return "";
}
public static int  _hlv_getitemcount() throws Exception{
RDebugUtils.currentModule="act_imageslideshow";
if (Debug.shouldDelegate(mostCurrent.activityBA, "hlv_getitemcount", false))
	 {return ((Integer) Debug.delegate(mostCurrent.activityBA, "hlv_getitemcount", null));}
RDebugUtils.currentLine=30801920;
 //BA.debugLineNum = 30801920;BA.debugLine="Sub Hlv_GetItemCount As Int 								        '$ Ite";
RDebugUtils.currentLine=30801921;
 //BA.debugLineNum = 30801921;BA.debugLine="Return lstLink.Size '/ItemList.Size";
if (true) return _lstlink.getSize();
RDebugUtils.currentLine=30801922;
 //BA.debugLineNum = 30801922;BA.debugLine="End Sub";
return 0;
}
public static String  _hlv_onbindviewholder(anywheresoftware.b4a.objects.PanelWrapper _parent,int _position) throws Exception{
RDebugUtils.currentModule="act_imageslideshow";
if (Debug.shouldDelegate(mostCurrent.activityBA, "hlv_onbindviewholder", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "hlv_onbindviewholder", new Object[] {_parent,_position}));}
ir.parsikhesab.pakhsh.cls_imageslideshow _rec = null;
RDebugUtils.currentLine=30736384;
 //BA.debugLineNum = 30736384;BA.debugLine="Sub Hlv_onBindViewHolder (Parent As Panel, Positio";
RDebugUtils.currentLine=30736385;
 //BA.debugLineNum = 30736385;BA.debugLine="Dim rec As cls_ImageSlideShow = Parent.Tag";
_rec = (ir.parsikhesab.pakhsh.cls_imageslideshow)(_parent.getTag());
RDebugUtils.currentLine=30736386;
 //BA.debugLineNum = 30736386;BA.debugLine="rec.show(lstLink,Position,Item)";
_rec._show /*String*/ (null,_lstlink,_position,_item);
RDebugUtils.currentLine=30736387;
 //BA.debugLineNum = 30736387;BA.debugLine="Parent.Width=rec.Width";
_parent.setWidth(_rec._getwidth /*int*/ (null));
RDebugUtils.currentLine=30736388;
 //BA.debugLineNum = 30736388;BA.debugLine="Parent.Height=rec.Height";
_parent.setHeight(_rec._getheight /*int*/ (null));
RDebugUtils.currentLine=30736389;
 //BA.debugLineNum = 30736389;BA.debugLine="End Sub";
return "";
}
public static String  _hlv_oncreateviewholder(anywheresoftware.b4a.objects.PanelWrapper _parent,int _viewtype) throws Exception{
RDebugUtils.currentModule="act_imageslideshow";
if (Debug.shouldDelegate(mostCurrent.activityBA, "hlv_oncreateviewholder", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "hlv_oncreateviewholder", new Object[] {_parent,_viewtype}));}
ir.parsikhesab.pakhsh.cls_imageslideshow _rec = null;
RDebugUtils.currentLine=30670848;
 //BA.debugLineNum = 30670848;BA.debugLine="Sub Hlv_onCreateViewHolder (Parent As Panel, ViewT";
RDebugUtils.currentLine=30670849;
 //BA.debugLineNum = 30670849;BA.debugLine="Dim rec As cls_ImageSlideShow";
_rec = new ir.parsikhesab.pakhsh.cls_imageslideshow();
RDebugUtils.currentLine=30670850;
 //BA.debugLineNum = 30670850;BA.debugLine="rec.Initialize(Me)";
_rec._initialize /*String*/ (null,mostCurrent.activityBA,act_imageslideshow.getObject());
RDebugUtils.currentLine=30670851;
 //BA.debugLineNum = 30670851;BA.debugLine="Parent.AddView(rec.Panel,0,0,100%x,100%y)";
_parent.AddView((android.view.View)(_rec._getpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ (null).getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=30670852;
 //BA.debugLineNum = 30670852;BA.debugLine="Parent.Tag=rec";
_parent.setTag((Object)(_rec));
RDebugUtils.currentLine=30670853;
 //BA.debugLineNum = 30670853;BA.debugLine="End Sub";
return "";
}
public static String  _hlv_onscrolllistener(int _dx,int _dy) throws Exception{
RDebugUtils.currentModule="act_imageslideshow";
if (Debug.shouldDelegate(mostCurrent.activityBA, "hlv_onscrolllistener", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "hlv_onscrolllistener", new Object[] {_dx,_dy}));}
RDebugUtils.currentLine=31064064;
 //BA.debugLineNum = 31064064;BA.debugLine="Private Sub Hlv_onScrollListener (dx As Int,dy As";
RDebugUtils.currentLine=31064065;
 //BA.debugLineNum = 31064065;BA.debugLine="pos = Hlv.GetVisibleItemPosition(True,False)";
_pos = mostCurrent._hlv.GetVisibleItemPosition(anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=31064066;
 //BA.debugLineNum = 31064066;BA.debugLine="End Sub";
return "";
}
}