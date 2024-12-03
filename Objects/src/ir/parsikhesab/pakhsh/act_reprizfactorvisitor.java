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

public class act_reprizfactorvisitor extends Activity implements B4AActivity{
	public static act_reprizfactorvisitor mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.act_reprizfactorvisitor");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (act_reprizfactorvisitor).");
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
		activityBA = new BA(this, layout, processBA, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.act_reprizfactorvisitor");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "ir.parsikhesab.pakhsh.act_reprizfactorvisitor", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (act_reprizfactorvisitor) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (act_reprizfactorvisitor) Resume **");
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
		return act_reprizfactorvisitor.class;
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
            BA.LogInfo("** Activity (act_reprizfactorvisitor) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (act_reprizfactorvisitor) Pause event (activity is not paused). **");
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
            act_reprizfactorvisitor mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (act_reprizfactorvisitor) Resume **");
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
public static ir.parsikhesab.pakhsh.mcode._adapterepfactorvisitor _item1 = null;
public wir.hitex.recycler.Hitex_LayoutView _hlv = null;
public anywheresoftware.b4a.objects.collections.List _listfaktor = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnltop = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnl_hlv = null;
public com.b4a.manamsoftware.PersianDate.ManamPersianDate _mpd = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblcodetafzili = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblcodevisitor = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbldate = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblnamevisitor = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblsharh = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblsharhtafzili = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblshomarefaktor = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblsumforoosh = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblvaziatsefaresh = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblvaziattasfie = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btncheck = null;
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
RDebugUtils.currentModule="act_reprizfactorvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=26476544;
 //BA.debugLineNum = 26476544;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=26476545;
 //BA.debugLineNum = 26476545;BA.debugLine="Activity.LoadLayout(\"l_repsefareshvisitor\")";
mostCurrent._activity.LoadLayout("l_repsefareshvisitor",mostCurrent.activityBA);
RDebugUtils.currentLine=26476546;
 //BA.debugLineNum = 26476546;BA.debugLine="HLV.Initializer(\"HLV\").ListView.Build";
mostCurrent._hlv.Initializer(mostCurrent.activityBA,"HLV").ListView().Build();
RDebugUtils.currentLine=26476547;
 //BA.debugLineNum = 26476547;BA.debugLine="pnl_HLV.AddView(HLV,0,0,pnl_HLV.Width,pnl_HLV.Hei";
mostCurrent._pnl_hlv.AddView((android.view.View)(mostCurrent._hlv.getObject()),(int) (0),(int) (0),mostCurrent._pnl_hlv.getWidth(),mostCurrent._pnl_hlv.getHeight());
RDebugUtils.currentLine=26476548;
 //BA.debugLineNum = 26476548;BA.debugLine="ListFaktor.Initialize";
mostCurrent._listfaktor.Initialize();
RDebugUtils.currentLine=26476550;
 //BA.debugLineNum = 26476550;BA.debugLine="HLV.Ripple.Color(0xFF909090)";
mostCurrent._hlv.Ripple().Color(((int)0xff909090));
RDebugUtils.currentLine=26476552;
 //BA.debugLineNum = 26476552;BA.debugLine="HLV.Show";
mostCurrent._hlv.Show();
RDebugUtils.currentLine=26476555;
 //BA.debugLineNum = 26476555;BA.debugLine="CreatePage";
_createpage();
RDebugUtils.currentLine=26476556;
 //BA.debugLineNum = 26476556;BA.debugLine="End Sub";
return "";
}
public static String  _createpage() throws Exception{
RDebugUtils.currentModule="act_reprizfactorvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createpage", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "createpage", null));}
RDebugUtils.currentLine=26542080;
 //BA.debugLineNum = 26542080;BA.debugLine="Sub CreatePage";
RDebugUtils.currentLine=26542081;
 //BA.debugLineNum = 26542081;BA.debugLine="lblCodeTafzili.Text=Item1.fldCodeTafsili";
mostCurrent._lblcodetafzili.setText(BA.ObjectToCharSequence(_item1.fldCodeTafsili /*String*/ ));
RDebugUtils.currentLine=26542082;
 //BA.debugLineNum = 26542082;BA.debugLine="lblCodeVisitor.Text=Item1.fldCodeVasete";
mostCurrent._lblcodevisitor.setText(BA.ObjectToCharSequence(_item1.fldCodeVasete /*String*/ ));
RDebugUtils.currentLine=26542083;
 //BA.debugLineNum = 26542083;BA.debugLine="LblDate.Text=MCode.PersianDateDash(Item1.fldDate)";
mostCurrent._lbldate.setText(BA.ObjectToCharSequence(mostCurrent._mcode._persiandatedash /*String*/ (mostCurrent.activityBA,_item1.fldDate /*String*/ )));
RDebugUtils.currentLine=26542084;
 //BA.debugLineNum = 26542084;BA.debugLine="lblNameVisitor.Text=Item1.FldN_Visitor";
mostCurrent._lblnamevisitor.setText(BA.ObjectToCharSequence(_item1.FldN_Visitor /*String*/ ));
RDebugUtils.currentLine=26542085;
 //BA.debugLineNum = 26542085;BA.debugLine="lblSharh.Text=Item1.fldTozihat";
mostCurrent._lblsharh.setText(BA.ObjectToCharSequence(_item1.fldTozihat /*String*/ ));
RDebugUtils.currentLine=26542086;
 //BA.debugLineNum = 26542086;BA.debugLine="lblSharhTafzili.Text=Item1.fldSharheTafzili";
mostCurrent._lblsharhtafzili.setText(BA.ObjectToCharSequence(_item1.fldSharheTafzili /*String*/ ));
RDebugUtils.currentLine=26542087;
 //BA.debugLineNum = 26542087;BA.debugLine="LblShomareFaktor.Text=Item1.fldShomareFactor";
mostCurrent._lblshomarefaktor.setText(BA.ObjectToCharSequence(_item1.fldShomareFactor /*String*/ ));
RDebugUtils.currentLine=26542089;
 //BA.debugLineNum = 26542089;BA.debugLine="If Item1.fldShomareFactorReal =-1 Then";
if ((_item1.fldShomareFactorReal /*String*/ ).equals(BA.NumberToString(-1))) { 
RDebugUtils.currentLine=26542090;
 //BA.debugLineNum = 26542090;BA.debugLine="lblVaziatSefaresh.TextColor=Colors.Red";
mostCurrent._lblvaziatsefaresh.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Red);
RDebugUtils.currentLine=26542091;
 //BA.debugLineNum = 26542091;BA.debugLine="lblVaziatSefaresh.Text =\"تایید نشده\"";
mostCurrent._lblvaziatsefaresh.setText(BA.ObjectToCharSequence("تایید نشده"));
RDebugUtils.currentLine=26542092;
 //BA.debugLineNum = 26542092;BA.debugLine="BtnCheck.Visible=True";
mostCurrent._btncheck.setVisible(anywheresoftware.b4a.keywords.Common.True);
 }else 
{RDebugUtils.currentLine=26542093;
 //BA.debugLineNum = 26542093;BA.debugLine="Else If Item1.fldShomareFactorReal=\"\" Then";
if ((_item1.fldShomareFactorReal /*String*/ ).equals("")) { 
RDebugUtils.currentLine=26542094;
 //BA.debugLineNum = 26542094;BA.debugLine="lblVaziatSefaresh.TextColor=Colors.Green";
mostCurrent._lblvaziatsefaresh.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Green);
RDebugUtils.currentLine=26542095;
 //BA.debugLineNum = 26542095;BA.debugLine="lblVaziatSefaresh.Text =\"تایید شده\"";
mostCurrent._lblvaziatsefaresh.setText(BA.ObjectToCharSequence("تایید شده"));
RDebugUtils.currentLine=26542096;
 //BA.debugLineNum = 26542096;BA.debugLine="BtnCheck.Visible=False";
mostCurrent._btncheck.setVisible(anywheresoftware.b4a.keywords.Common.False);
 }else {
RDebugUtils.currentLine=26542098;
 //BA.debugLineNum = 26542098;BA.debugLine="lblVaziatSefaresh.TextColor=Colors.Black";
mostCurrent._lblvaziatsefaresh.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=26542099;
 //BA.debugLineNum = 26542099;BA.debugLine="lblVaziatSefaresh.Text =\"ثبت شده\"";
mostCurrent._lblvaziatsefaresh.setText(BA.ObjectToCharSequence("ثبت شده"));
RDebugUtils.currentLine=26542100;
 //BA.debugLineNum = 26542100;BA.debugLine="BtnCheck.Visible=False";
mostCurrent._btncheck.setVisible(anywheresoftware.b4a.keywords.Common.False);
 }}
;
RDebugUtils.currentLine=26542102;
 //BA.debugLineNum = 26542102;BA.debugLine="lblVaziatTasfie.Text=Item1.fldNahveTasvie";
mostCurrent._lblvaziattasfie.setText(BA.ObjectToCharSequence(_item1.fldNahveTasvie /*String*/ ));
RDebugUtils.currentLine=26542105;
 //BA.debugLineNum = 26542105;BA.debugLine="ProgressDialogShow2(\"لطفا صبر کنید . . .\",False)";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(mostCurrent.activityBA,BA.ObjectToCharSequence("لطفا صبر کنید . . ."),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=26542106;
 //BA.debugLineNum = 26542106;BA.debugLine="MCode.C_Visitor=Item1.fldCodeVasete";
mostCurrent._mcode._c_visitor /*String*/  = _item1.fldCodeVasete /*String*/ ;
RDebugUtils.currentLine=26542107;
 //BA.debugLineNum = 26542107;BA.debugLine="MCode.FaktorSelect=Item1.fldShomareFactor";
mostCurrent._mcode._faktorselect /*String*/  = _item1.fldShomareFactor /*String*/ ;
RDebugUtils.currentLine=26542108;
 //BA.debugLineNum = 26542108;BA.debugLine="CallSubDelayed2(Service_Server,\"GetReportRizFacto";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(mostCurrent._service_server.getObject()),"GetReportRizFactorVisitor",(Object)(_item1.fldDate /*String*/ ));
RDebugUtils.currentLine=26542109;
 //BA.debugLineNum = 26542109;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="act_reprizfactorvisitor";
RDebugUtils.currentLine=27000832;
 //BA.debugLineNum = 27000832;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=27000834;
 //BA.debugLineNum = 27000834;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="act_reprizfactorvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=26869760;
 //BA.debugLineNum = 26869760;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=26869761;
 //BA.debugLineNum = 26869761;BA.debugLine="HLV.notifyDataSetChanged";
mostCurrent._hlv.notifyDataSetChanged();
RDebugUtils.currentLine=26869762;
 //BA.debugLineNum = 26869762;BA.debugLine="End Sub";
return "";
}
public static boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
RDebugUtils.currentModule="act_reprizfactorvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "application_error", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "application_error", new Object[] {_error,_stacktrace}));}
RDebugUtils.currentLine=27197440;
 //BA.debugLineNum = 27197440;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
RDebugUtils.currentLine=27197442;
 //BA.debugLineNum = 27197442;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=27197443;
 //BA.debugLineNum = 27197443;BA.debugLine="End Sub";
return false;
}
public static String  _btncheck_click() throws Exception{
RDebugUtils.currentModule="act_reprizfactorvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btncheck_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btncheck_click", null));}
String _query = "";
RDebugUtils.currentLine=27131904;
 //BA.debugLineNum = 27131904;BA.debugLine="Sub BtnCheck_Click";
RDebugUtils.currentLine=27131905;
 //BA.debugLineNum = 27131905;BA.debugLine="Log(LblShomareFaktor.Text)";
anywheresoftware.b4a.keywords.Common.LogImpl("527131905",mostCurrent._lblshomarefaktor.getText(),0);
RDebugUtils.currentLine=27131906;
 //BA.debugLineNum = 27131906;BA.debugLine="Dim query As String";
_query = "";
RDebugUtils.currentLine=27131907;
 //BA.debugLineNum = 27131907;BA.debugLine="query=\"Update tblPishPishFaktor set fldShomareFac";
_query = "Update tblPishPishFaktor set fldShomareFactorReal=NULL where fldShomareFactorReal=-1 and fldShomareFactor="+mostCurrent._lblshomarefaktor.getText()+" and fldCodeVasete="+mostCurrent._lblcodevisitor.getText();
RDebugUtils.currentLine=27131908;
 //BA.debugLineNum = 27131908;BA.debugLine="MCode.page=\"Act_RepRizFactorVisitor\"";
mostCurrent._mcode._page /*String*/  = "Act_RepRizFactorVisitor";
RDebugUtils.currentLine=27131909;
 //BA.debugLineNum = 27131909;BA.debugLine="MCode.Tag=Item1";
mostCurrent._mcode._tag /*Object*/  = (Object)(_item1);
RDebugUtils.currentLine=27131910;
 //BA.debugLineNum = 27131910;BA.debugLine="CallSubDelayed2(Service_Server,\"SendUpdateQuery\",";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(mostCurrent._service_server.getObject()),"SendUpdateQuery",(Object)(_query));
RDebugUtils.currentLine=27131911;
 //BA.debugLineNum = 27131911;BA.debugLine="End Sub";
return "";
}
public static String  _btnlistprofile_click() throws Exception{
RDebugUtils.currentModule="act_reprizfactorvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnlistprofile_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnlistprofile_click", null));}
RDebugUtils.currentLine=26935296;
 //BA.debugLineNum = 26935296;BA.debugLine="Sub BtnListProfile_Click";
RDebugUtils.currentLine=26935298;
 //BA.debugLineNum = 26935298;BA.debugLine="End Sub";
return "";
}
public static int  _hlv_getitemcount() throws Exception{
RDebugUtils.currentModule="act_reprizfactorvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "hlv_getitemcount", false))
	 {return ((Integer) Debug.delegate(mostCurrent.activityBA, "hlv_getitemcount", null));}
RDebugUtils.currentLine=26673152;
 //BA.debugLineNum = 26673152;BA.debugLine="Sub HLV_GetItemCount As Int 								        '💯 It";
RDebugUtils.currentLine=26673153;
 //BA.debugLineNum = 26673153;BA.debugLine="Return ListFaktor.Size";
if (true) return mostCurrent._listfaktor.getSize();
RDebugUtils.currentLine=26673154;
 //BA.debugLineNum = 26673154;BA.debugLine="End Sub";
return 0;
}
public static String  _hlv_onbindviewholder(anywheresoftware.b4a.objects.PanelWrapper _parent,int _position) throws Exception{
RDebugUtils.currentModule="act_reprizfactorvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "hlv_onbindviewholder", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "hlv_onbindviewholder", new Object[] {_parent,_position}));}
ir.parsikhesab.pakhsh.mcode._adaptereprizfactorvisitor _item = null;
ir.parsikhesab.pakhsh.cls_rec_rizfactorvisitor _rec = null;
RDebugUtils.currentLine=26804224;
 //BA.debugLineNum = 26804224;BA.debugLine="Sub HLV_onBindViewHolder (Parent As Panel, Positio";
RDebugUtils.currentLine=26804225;
 //BA.debugLineNum = 26804225;BA.debugLine="Dim Item = ListFaktor.Get(Position) As AdapteRepR";
_item = (ir.parsikhesab.pakhsh.mcode._adaptereprizfactorvisitor)(mostCurrent._listfaktor.Get(_position));
RDebugUtils.currentLine=26804226;
 //BA.debugLineNum = 26804226;BA.debugLine="Dim rec As Cls_Rec_RizFactorVisitor=Parent.Tag";
_rec = (ir.parsikhesab.pakhsh.cls_rec_rizfactorvisitor)(_parent.getTag());
RDebugUtils.currentLine=26804227;
 //BA.debugLineNum = 26804227;BA.debugLine="rec.Show(Item)";
_rec._show /*String*/ (null,_item);
RDebugUtils.currentLine=26804228;
 //BA.debugLineNum = 26804228;BA.debugLine="Parent.Height=rec.Height";
_parent.setHeight(_rec._getheight /*int*/ (null));
RDebugUtils.currentLine=26804229;
 //BA.debugLineNum = 26804229;BA.debugLine="End Sub";
return "";
}
public static String  _hlv_oncreateviewholder(anywheresoftware.b4a.objects.PanelWrapper _parent,int _viewtype) throws Exception{
RDebugUtils.currentModule="act_reprizfactorvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "hlv_oncreateviewholder", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "hlv_oncreateviewholder", new Object[] {_parent,_viewtype}));}
ir.parsikhesab.pakhsh.cls_rec_rizfactorvisitor _rec = null;
RDebugUtils.currentLine=26738688;
 //BA.debugLineNum = 26738688;BA.debugLine="Sub HLV_onCreateViewHolder (Parent As Panel, ViewT";
RDebugUtils.currentLine=26738689;
 //BA.debugLineNum = 26738689;BA.debugLine="Dim rec As Cls_Rec_RizFactorVisitor";
_rec = new ir.parsikhesab.pakhsh.cls_rec_rizfactorvisitor();
RDebugUtils.currentLine=26738690;
 //BA.debugLineNum = 26738690;BA.debugLine="rec.Initialize(Me)";
_rec._initialize /*String*/ (null,mostCurrent.activityBA,act_reprizfactorvisitor.getObject());
RDebugUtils.currentLine=26738691;
 //BA.debugLineNum = 26738691;BA.debugLine="Parent.AddView(rec.Panel,0,0,100%x,rec.Height)";
_parent.AddView((android.view.View)(_rec._getpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ (null).getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),_rec._getheight /*int*/ (null));
RDebugUtils.currentLine=26738692;
 //BA.debugLineNum = 26738692;BA.debugLine="Parent.Tag=rec";
_parent.setTag((Object)(_rec));
RDebugUtils.currentLine=26738693;
 //BA.debugLineNum = 26738693;BA.debugLine="End Sub";
return "";
}
public static String  _lblback_click() throws Exception{
RDebugUtils.currentModule="act_reprizfactorvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lblback_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lblback_click", null));}
RDebugUtils.currentLine=27066368;
 //BA.debugLineNum = 27066368;BA.debugLine="Sub LblBack_Click";
RDebugUtils.currentLine=27066369;
 //BA.debugLineNum = 27066369;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=27066370;
 //BA.debugLineNum = 27066370;BA.debugLine="End Sub";
return "";
}
public static String  _loaddata(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
RDebugUtils.currentModule="act_reprizfactorvisitor";
if (Debug.shouldDelegate(mostCurrent.activityBA, "loaddata", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "loaddata", new Object[] {_lst}));}
int _sumkol = 0;
anywheresoftware.b4a.objects.collections.Map _row = null;
int _i = 0;
ir.parsikhesab.pakhsh.mcode._adaptereprizfactorvisitor _item = null;
String _tedadjoz = "";
String _tedadcarton = "";
int _tedaddarkarton = 0;
int _sumfee = 0;
RDebugUtils.currentLine=26607616;
 //BA.debugLineNum = 26607616;BA.debugLine="Sub LoadData(lst As List)";
RDebugUtils.currentLine=26607619;
 //BA.debugLineNum = 26607619;BA.debugLine="If lst.Size>0 Then";
if (_lst.getSize()>0) { 
RDebugUtils.currentLine=26607621;
 //BA.debugLineNum = 26607621;BA.debugLine="Dim sumkol As Int";
_sumkol = 0;
RDebugUtils.currentLine=26607622;
 //BA.debugLineNum = 26607622;BA.debugLine="Dim Row As Map";
_row = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=26607623;
 //BA.debugLineNum = 26607623;BA.debugLine="For i=0 To lst.Size-1";
{
final int step4 = 1;
final int limit4 = (int) (_lst.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=26607624;
 //BA.debugLineNum = 26607624;BA.debugLine="Row=lst.Get(i)";
_row = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lst.Get(_i)));
RDebugUtils.currentLine=26607625;
 //BA.debugLineNum = 26607625;BA.debugLine="Dim Item As AdapteRepRizFactorVisitor";
_item = new ir.parsikhesab.pakhsh.mcode._adaptereprizfactorvisitor();
RDebugUtils.currentLine=26607626;
 //BA.debugLineNum = 26607626;BA.debugLine="Dim	TedadJoz As String=0";
_tedadjoz = BA.NumberToString(0);
RDebugUtils.currentLine=26607627;
 //BA.debugLineNum = 26607627;BA.debugLine="Dim	TedadCarton As String=0";
_tedadcarton = BA.NumberToString(0);
RDebugUtils.currentLine=26607628;
 //BA.debugLineNum = 26607628;BA.debugLine="Dim	TedadDarKarton As Int=0";
_tedaddarkarton = (int) (0);
RDebugUtils.currentLine=26607630;
 //BA.debugLineNum = 26607630;BA.debugLine="Item.fldRadif=Row.Get(\"fldRadif\")";
_item.fldRadif /*String*/  = BA.ObjectToString(_row.Get((Object)("fldRadif")));
RDebugUtils.currentLine=26607631;
 //BA.debugLineNum = 26607631;BA.debugLine="Item.fldTozihatRecord=Row.Get(\"fldTozihatRecord";
_item.fldTozihatRecord /*String*/  = BA.ObjectToString(_row.Get((Object)("fldTozihatRecord")));
RDebugUtils.currentLine=26607632;
 //BA.debugLineNum = 26607632;BA.debugLine="Item.fldCodeKala=Row.Get(\"fldCodeKala\")";
_item.fldCodeKala /*String*/  = BA.ObjectToString(_row.Get((Object)("fldCodeKala")));
RDebugUtils.currentLine=26607633;
 //BA.debugLineNum = 26607633;BA.debugLine="Item.fldSharhKala=Row.Get(\"fldSharhKala\")";
_item.fldSharhKala /*String*/  = BA.ObjectToString(_row.Get((Object)("fldSharhKala")));
RDebugUtils.currentLine=26607635;
 //BA.debugLineNum = 26607635;BA.debugLine="If Row.Get(\"fldFeeJoz\")>0 Then";
if ((double)(BA.ObjectToNumber(_row.Get((Object)("fldFeeJoz"))))>0) { 
RDebugUtils.currentLine=26607636;
 //BA.debugLineNum = 26607636;BA.debugLine="Item.fldFeeJoz =MCode.qomaAshar(Row.Get(\"fldFe";
_item.fldFeeJoz /*String*/  = mostCurrent._mcode._qomaashar /*String*/ (mostCurrent.activityBA,_row.Get((Object)("fldFeeJoz")));
 }else {
RDebugUtils.currentLine=26607638;
 //BA.debugLineNum = 26607638;BA.debugLine="Item.fldFeeJoz =0";
_item.fldFeeJoz /*String*/  = BA.NumberToString(0);
 };
RDebugUtils.currentLine=26607641;
 //BA.debugLineNum = 26607641;BA.debugLine="If	Row.Get(\"fldTedadJoz\")<>Null Then";
if (_row.Get((Object)("fldTedadJoz"))!= null) { 
RDebugUtils.currentLine=26607642;
 //BA.debugLineNum = 26607642;BA.debugLine="TedadJoz=Row.Get(\"fldTedadJoz\")";
_tedadjoz = BA.ObjectToString(_row.Get((Object)("fldTedadJoz")));
 };
RDebugUtils.currentLine=26607646;
 //BA.debugLineNum = 26607646;BA.debugLine="Item.fldTedadJoz =TedadJoz";
_item.fldTedadJoz /*String*/  = _tedadjoz;
RDebugUtils.currentLine=26607647;
 //BA.debugLineNum = 26607647;BA.debugLine="If	Row.Get(\"fldTedadCarton\")<>Null And Row.Get(";
if (_row.Get((Object)("fldTedadCarton"))!= null && (_row.Get((Object)("fldTedadCarton"))).equals((Object)("")) == false) { 
RDebugUtils.currentLine=26607648;
 //BA.debugLineNum = 26607648;BA.debugLine="TedadCarton=Row.Get(\"fldTedadCarton\")";
_tedadcarton = BA.ObjectToString(_row.Get((Object)("fldTedadCarton")));
 };
RDebugUtils.currentLine=26607652;
 //BA.debugLineNum = 26607652;BA.debugLine="Item.fldTedadCarton =TedadCarton";
_item.fldTedadCarton /*String*/  = _tedadcarton;
RDebugUtils.currentLine=26607655;
 //BA.debugLineNum = 26607655;BA.debugLine="If	Row.Get(\"FldTedadDarKarton\")<>Null Then";
if (_row.Get((Object)("FldTedadDarKarton"))!= null) { 
RDebugUtils.currentLine=26607656;
 //BA.debugLineNum = 26607656;BA.debugLine="TedadDarKarton=Row.Get(\"FldTedadDarKarton\")";
_tedaddarkarton = (int)(BA.ObjectToNumber(_row.Get((Object)("FldTedadDarKarton"))));
RDebugUtils.currentLine=26607657;
 //BA.debugLineNum = 26607657;BA.debugLine="Item.FldTedadDarKarton =TedadDarKarton";
_item.FldTedadDarKarton /*String*/  = BA.NumberToString(_tedaddarkarton);
 };
RDebugUtils.currentLine=26607661;
 //BA.debugLineNum = 26607661;BA.debugLine="Dim SumFee As Int=(TedadJoz*Row.Get(\"fldFeeJoz\"";
_sumfee = (int) (((double)(Double.parseDouble(_tedadjoz))*(double)(BA.ObjectToNumber(_row.Get((Object)("fldFeeJoz")))))+(((double)(Double.parseDouble(_tedadcarton))*_tedaddarkarton)*(double)(BA.ObjectToNumber(_row.Get((Object)("fldFeeJoz"))))));
RDebugUtils.currentLine=26607663;
 //BA.debugLineNum = 26607663;BA.debugLine="Item.SumFee =SumFee";
_item.SumFee /*int*/  = _sumfee;
RDebugUtils.currentLine=26607667;
 //BA.debugLineNum = 26607667;BA.debugLine="sumkol=sumkol+SumFee";
_sumkol = (int) (_sumkol+_sumfee);
RDebugUtils.currentLine=26607668;
 //BA.debugLineNum = 26607668;BA.debugLine="ListFaktor.Add(Item)";
mostCurrent._listfaktor.Add((Object)(_item));
 }
};
RDebugUtils.currentLine=26607670;
 //BA.debugLineNum = 26607670;BA.debugLine="If sumkol>0 Then";
if (_sumkol>0) { 
RDebugUtils.currentLine=26607671;
 //BA.debugLineNum = 26607671;BA.debugLine="lblSumForoosh.Text=MCode.qomaAshar(sumkol) &\" \"";
mostCurrent._lblsumforoosh.setText(BA.ObjectToCharSequence(mostCurrent._mcode._qomaashar /*String*/ (mostCurrent.activityBA,(Object)(_sumkol))+" "+mostCurrent._mcode._vahedpool /*String*/ ));
 }else {
RDebugUtils.currentLine=26607673;
 //BA.debugLineNum = 26607673;BA.debugLine="lblSumForoosh.Text=0";
mostCurrent._lblsumforoosh.setText(BA.ObjectToCharSequence(0));
 };
RDebugUtils.currentLine=26607677;
 //BA.debugLineNum = 26607677;BA.debugLine="HLV.notifyDataSetChanged";
mostCurrent._hlv.notifyDataSetChanged();
 };
RDebugUtils.currentLine=26607679;
 //BA.debugLineNum = 26607679;BA.debugLine="End Sub";
return "";
}
}