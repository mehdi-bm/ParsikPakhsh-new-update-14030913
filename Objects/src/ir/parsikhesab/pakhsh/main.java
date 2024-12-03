package ir.parsikhesab.pakhsh;

import java.util.concurrent.Callable;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import android.app.Activity;

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

public class main extends androidx.appcompat.app.AppCompatActivity implements B4AActivity{
	public static main mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = false;
	public static final boolean includeTitle = true;
    public static WeakReference<Activity> previousOne;
    public static boolean dontPause;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        mostCurrent = this;
		if (processBA == null) {
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.main");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (main).");
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
		activityBA = new BA(this, layout, processBA, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.main");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "ir.parsikhesab.pakhsh.main", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (main) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (main) Resume **");
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
		return main.class;
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
            BA.LogInfo("** Activity (main) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (main) Pause event (activity is not paused). **");
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
            main mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (main) Resume **");
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
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        b4a.example.dateutils._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}
public static boolean isAnyActivityVisible() {
    boolean vis = false;
vis = vis | (main.mostCurrent != null);
vis = vis | (act_main.mostCurrent != null);
vis = vis | (act_selectmantage.mostCurrent != null);
vis = vis | (act_reprizfactorvisitor.mostCurrent != null);
vis = vis | (act_choose_report.mostCurrent != null);
vis = vis | (act_emza.mostCurrent != null);
vis = vis | (act_havaletozie.mostCurrent != null);
vis = vis | (act_imageslideshow.mostCurrent != null);
vis = vis | (act_kala_listi.mostCurrent != null);
vis = vis | (act_kaladefault.mostCurrent != null);
vis = vis | (act_kalapaging.mostCurrent != null);
vis = vis | (act_kalapaging2.mostCurrent != null);
vis = vis | (act_locationmoshtarian.mostCurrent != null);
vis = vis | (act_locationvisitor.mostCurrent != null);
vis = vis | (act_mali.mostCurrent != null);
vis = vis | (act_moshtarian.mostCurrent != null);
vis = vis | (act_newashkhas.mostCurrent != null);
vis = vis | (act_notif.mostCurrent != null);
vis = vis | (act_printmali.mostCurrent != null);
vis = vis | (act_printpic.mostCurrent != null);
vis = vis | (act_printpic2.mostCurrent != null);
vis = vis | (act_profile.mostCurrent != null);
vis = vis | (act_repfactors.mostCurrent != null);
vis = vis | (act_repfactorvisitor.mostCurrent != null);
vis = vis | (act_reportrizebargasht.mostCurrent != null);
vis = vis | (act_reportsoorathesab.mostCurrent != null);
vis = vis | (act_reportvisitor.mostCurrent != null);
vis = vis | (act_reportvisitor2.mostCurrent != null);
vis = vis | (act_restore.mostCurrent != null);
vis = vis | (act_rizefactorhavale.mostCurrent != null);
vis = vis | (act_rizfaktor.mostCurrent != null);
vis = vis | (act_rizhavale.mostCurrent != null);
vis = vis | (act_sabad.mostCurrent != null);
vis = vis | (act_sabtmarjooii.mostCurrent != null);
vis = vis | (act_sabtrizcheck.mostCurrent != null);
vis = vis | (act_saveinfocompany.mostCurrent != null);
vis = vis | (act_savelocation.mostCurrent != null);
vis = vis | (act_search.mostCurrent != null);
vis = vis | (act_selfaktor.mostCurrent != null);
vis = vis | (act_senddata.mostCurrent != null);
vis = vis | (act_setting.mostCurrent != null);
vis = vis | (act_settingpos.mostCurrent != null);
vis = vis | (act_showlocation.mostCurrent != null);
vis = vis | (act_support.mostCurrent != null);
vis = vis | (act_ticket.mostCurrent != null);
vis = vis | (act_video.mostCurrent != null);
return vis;}

private static BA killProgramHelper(BA ba) {
    if (ba == null)
        return null;
    anywheresoftware.b4a.BA.SharedProcessBA sharedProcessBA = ba.sharedProcessBA;
    if (sharedProcessBA == null || sharedProcessBA.activityBA == null)
        return null;
    return sharedProcessBA.activityBA.get();
}
public static void killProgram() {
     {
            Activity __a = null;
            if (main.previousOne != null) {
				__a = main.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(main.mostCurrent == null ? null : main.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (act_main.previousOne != null) {
				__a = act_main.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(act_main.mostCurrent == null ? null : act_main.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

BA.applicationContext.stopService(new android.content.Intent(BA.applicationContext, service_server.class));
BA.applicationContext.stopService(new android.content.Intent(BA.applicationContext, fusedlocationservice.class));
BA.applicationContext.stopService(new android.content.Intent(BA.applicationContext, service_helper.class));
 {
            Activity __a = null;
            if (act_selectmantage.previousOne != null) {
				__a = act_selectmantage.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(act_selectmantage.mostCurrent == null ? null : act_selectmantage.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (act_reprizfactorvisitor.previousOne != null) {
				__a = act_reprizfactorvisitor.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(act_reprizfactorvisitor.mostCurrent == null ? null : act_reprizfactorvisitor.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (act_choose_report.previousOne != null) {
				__a = act_choose_report.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(act_choose_report.mostCurrent == null ? null : act_choose_report.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (act_emza.previousOne != null) {
				__a = act_emza.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(act_emza.mostCurrent == null ? null : act_emza.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (act_havaletozie.previousOne != null) {
				__a = act_havaletozie.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(act_havaletozie.mostCurrent == null ? null : act_havaletozie.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (act_imageslideshow.previousOne != null) {
				__a = act_imageslideshow.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(act_imageslideshow.mostCurrent == null ? null : act_imageslideshow.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (act_kala_listi.previousOne != null) {
				__a = act_kala_listi.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(act_kala_listi.mostCurrent == null ? null : act_kala_listi.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (act_kaladefault.previousOne != null) {
				__a = act_kaladefault.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(act_kaladefault.mostCurrent == null ? null : act_kaladefault.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (act_kalapaging.previousOne != null) {
				__a = act_kalapaging.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(act_kalapaging.mostCurrent == null ? null : act_kalapaging.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (act_kalapaging2.previousOne != null) {
				__a = act_kalapaging2.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(act_kalapaging2.mostCurrent == null ? null : act_kalapaging2.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (act_locationmoshtarian.previousOne != null) {
				__a = act_locationmoshtarian.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(act_locationmoshtarian.mostCurrent == null ? null : act_locationmoshtarian.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (act_locationvisitor.previousOne != null) {
				__a = act_locationvisitor.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(act_locationvisitor.mostCurrent == null ? null : act_locationvisitor.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (act_mali.previousOne != null) {
				__a = act_mali.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(act_mali.mostCurrent == null ? null : act_mali.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (act_moshtarian.previousOne != null) {
				__a = act_moshtarian.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(act_moshtarian.mostCurrent == null ? null : act_moshtarian.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (act_newashkhas.previousOne != null) {
				__a = act_newashkhas.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(act_newashkhas.mostCurrent == null ? null : act_newashkhas.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (act_notif.previousOne != null) {
				__a = act_notif.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(act_notif.mostCurrent == null ? null : act_notif.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (act_printmali.previousOne != null) {
				__a = act_printmali.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(act_printmali.mostCurrent == null ? null : act_printmali.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (act_printpic.previousOne != null) {
				__a = act_printpic.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(act_printpic.mostCurrent == null ? null : act_printpic.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (act_printpic2.previousOne != null) {
				__a = act_printpic2.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(act_printpic2.mostCurrent == null ? null : act_printpic2.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (act_profile.previousOne != null) {
				__a = act_profile.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(act_profile.mostCurrent == null ? null : act_profile.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (act_repfactors.previousOne != null) {
				__a = act_repfactors.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(act_repfactors.mostCurrent == null ? null : act_repfactors.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (act_repfactorvisitor.previousOne != null) {
				__a = act_repfactorvisitor.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(act_repfactorvisitor.mostCurrent == null ? null : act_repfactorvisitor.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (act_reportrizebargasht.previousOne != null) {
				__a = act_reportrizebargasht.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(act_reportrizebargasht.mostCurrent == null ? null : act_reportrizebargasht.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (act_reportsoorathesab.previousOne != null) {
				__a = act_reportsoorathesab.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(act_reportsoorathesab.mostCurrent == null ? null : act_reportsoorathesab.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (act_reportvisitor.previousOne != null) {
				__a = act_reportvisitor.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(act_reportvisitor.mostCurrent == null ? null : act_reportvisitor.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (act_reportvisitor2.previousOne != null) {
				__a = act_reportvisitor2.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(act_reportvisitor2.mostCurrent == null ? null : act_reportvisitor2.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (act_restore.previousOne != null) {
				__a = act_restore.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(act_restore.mostCurrent == null ? null : act_restore.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (act_rizefactorhavale.previousOne != null) {
				__a = act_rizefactorhavale.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(act_rizefactorhavale.mostCurrent == null ? null : act_rizefactorhavale.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (act_rizfaktor.previousOne != null) {
				__a = act_rizfaktor.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(act_rizfaktor.mostCurrent == null ? null : act_rizfaktor.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (act_rizhavale.previousOne != null) {
				__a = act_rizhavale.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(act_rizhavale.mostCurrent == null ? null : act_rizhavale.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (act_sabad.previousOne != null) {
				__a = act_sabad.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(act_sabad.mostCurrent == null ? null : act_sabad.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (act_sabtmarjooii.previousOne != null) {
				__a = act_sabtmarjooii.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(act_sabtmarjooii.mostCurrent == null ? null : act_sabtmarjooii.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (act_sabtrizcheck.previousOne != null) {
				__a = act_sabtrizcheck.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(act_sabtrizcheck.mostCurrent == null ? null : act_sabtrizcheck.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (act_saveinfocompany.previousOne != null) {
				__a = act_saveinfocompany.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(act_saveinfocompany.mostCurrent == null ? null : act_saveinfocompany.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (act_savelocation.previousOne != null) {
				__a = act_savelocation.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(act_savelocation.mostCurrent == null ? null : act_savelocation.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (act_search.previousOne != null) {
				__a = act_search.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(act_search.mostCurrent == null ? null : act_search.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (act_selfaktor.previousOne != null) {
				__a = act_selfaktor.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(act_selfaktor.mostCurrent == null ? null : act_selfaktor.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (act_senddata.previousOne != null) {
				__a = act_senddata.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(act_senddata.mostCurrent == null ? null : act_senddata.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (act_setting.previousOne != null) {
				__a = act_setting.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(act_setting.mostCurrent == null ? null : act_setting.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (act_settingpos.previousOne != null) {
				__a = act_settingpos.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(act_settingpos.mostCurrent == null ? null : act_settingpos.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (act_showlocation.previousOne != null) {
				__a = act_showlocation.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(act_showlocation.mostCurrent == null ? null : act_showlocation.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (act_support.previousOne != null) {
				__a = act_support.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(act_support.mostCurrent == null ? null : act_support.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (act_ticket.previousOne != null) {
				__a = act_ticket.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(act_ticket.mostCurrent == null ? null : act_ticket.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (act_video.previousOne != null) {
				__a = act_video.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(act_video.mostCurrent == null ? null : act_video.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

BA.applicationContext.stopService(new android.content.Intent(BA.applicationContext, firebasemessaging.class));
BA.applicationContext.stopService(new android.content.Intent(BA.applicationContext, geoservice.class));
BA.applicationContext.stopService(new android.content.Intent(BA.applicationContext, imagedownloader.class));
BA.applicationContext.stopService(new android.content.Intent(BA.applicationContext, service_gps.class));
BA.applicationContext.stopService(new android.content.Intent(BA.applicationContext, service_notification.class));
BA.applicationContext.stopService(new android.content.Intent(BA.applicationContext, starter.class));
BA.applicationContext.stopService(new android.content.Intent(BA.applicationContext, tracker.class));
BA.applicationContext.stopService(new android.content.Intent(BA.applicationContext, newinst2.class));
}
public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.objects.Timer _t_gif = null;
public static anywheresoftware.b4a.objects.RuntimePermissions _rp = null;
public static igolub.permissionmanager.b4a.PermissionsManager _pm = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imggif = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltitle = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblver = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnllogo = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnltitle = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlver = null;
public anywheresoftware.b4j.object.JavaObject _nativeme = null;
public igolub.fused.b4a.location.android.location.LocationFWrapper.LocationFStatic _locationf = null;
public igolub.fused.b4a.location.LocationResultWrapper.LocationResultConstants _locationresult = null;
public igolub.fused.b4a.location.LocationRequestWrapper.LocationRequestConstants _locationrequest = null;
public igolub.fused.b4a.location.staticmodules.PriorityWrapper _priority = null;
public igolub.fused.b4a.location.staticmodules.GranularityWrapper _granularity = null;
public igolub.permissionmanager.b4a.PermissionsManagerFileProvider _fileprovider = null;
public igolub.permissionmanager.b4a.PermissionsManagerConstants _permissionsmanager = null;
public b4a.example.dateutils _dateutils = null;
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
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
anywheresoftware.b4a.objects.IntentWrapper _i = null;
RDebugUtils.currentLine=131072;
 //BA.debugLineNum = 131072;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=131074;
 //BA.debugLineNum = 131074;BA.debugLine="Activity.LoadLayout(\"l_Splash\")";
mostCurrent._activity.LoadLayout("l_Splash",mostCurrent.activityBA);
RDebugUtils.currentLine=131075;
 //BA.debugLineNum = 131075;BA.debugLine="lblTitle.Text=Application.LabelName";
mostCurrent._lbltitle.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Application.getLabelName()));
RDebugUtils.currentLine=131076;
 //BA.debugLineNum = 131076;BA.debugLine="lblVer.Text=\"نسخه \"&Application.VersionName";
mostCurrent._lblver.setText(BA.ObjectToCharSequence("نسخه "+anywheresoftware.b4a.keywords.Common.Application.getVersionName()));
RDebugUtils.currentLine=131077;
 //BA.debugLineNum = 131077;BA.debugLine="nativeMe.InitializeContext";
mostCurrent._nativeme.InitializeContext(processBA);
RDebugUtils.currentLine=131078;
 //BA.debugLineNum = 131078;BA.debugLine="nativeMe.RunMethod(\"setDefaultUncaughtExceptionHa";
mostCurrent._nativeme.RunMethod("setDefaultUncaughtExceptionHandler",(Object[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=131079;
 //BA.debugLineNum = 131079;BA.debugLine="Dim i As Intent";
_i = new anywheresoftware.b4a.objects.IntentWrapper();
RDebugUtils.currentLine=131080;
 //BA.debugLineNum = 131080;BA.debugLine="i = Activity.GetStartingIntent";
_i = mostCurrent._activity.GetStartingIntent();
RDebugUtils.currentLine=131081;
 //BA.debugLineNum = 131081;BA.debugLine="If i.HasExtra(\"Crash\") Then";
if (_i.HasExtra("Crash")) { 
RDebugUtils.currentLine=131082;
 //BA.debugLineNum = 131082;BA.debugLine="Log(\"After crash: \" & i.GetExtra(\"Crash\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("5131082","After crash: "+BA.ObjectToString(_i.GetExtra("Crash")),0);
 };
RDebugUtils.currentLine=131084;
 //BA.debugLineNum = 131084;BA.debugLine="If FirstTime Then";
if (_firsttime) { 
RDebugUtils.currentLine=131085;
 //BA.debugLineNum = 131085;BA.debugLine="Log(\"Hello\")";
anywheresoftware.b4a.keywords.Common.LogImpl("5131085","Hello",0);
 };
RDebugUtils.currentLine=131087;
 //BA.debugLineNum = 131087;BA.debugLine="End Sub";
return "";
}
public static boolean  _activity_keypress(int _keycode) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_keypress", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "activity_keypress", new Object[] {_keycode}));}
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="End Sub";
return false;
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="main";
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="End Sub";
return "";
}
public static String  _activity_permissionresult(String _permission,boolean _result) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_permissionresult", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_permissionresult", new Object[] {_permission,_result}));}
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
int _api = 0;
RDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Sub Activity_PermissionResult (Permission As Strin";
RDebugUtils.currentLine=524289;
 //BA.debugLineNum = 524289;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=524290;
 //BA.debugLineNum = 524290;BA.debugLine="Dim Api As Int";
_api = 0;
RDebugUtils.currentLine=524291;
 //BA.debugLineNum = 524291;BA.debugLine="Api = r.GetStaticField(\"android.os.Build$VERSION\"";
_api = (int)(BA.ObjectToNumber(_r.GetStaticField("android.os.Build$VERSION","SDK_INT")));
RDebugUtils.currentLine=524292;
 //BA.debugLineNum = 524292;BA.debugLine="rp.GetSafeDirDefaultExternal(\"Parsik\")";
_rp.GetSafeDirDefaultExternal("Parsik");
RDebugUtils.currentLine=524293;
 //BA.debugLineNum = 524293;BA.debugLine="If Api >= 30 Then";
if (_api>=30) { 
RDebugUtils.currentLine=524294;
 //BA.debugLineNum = 524294;BA.debugLine="If Permission = PermissionsManager.SPECIAL_MANAG";
if ((_permission).equals(mostCurrent._permissionsmanager.SPECIAL_MANAGE_EXTERNAL_STORAGE)) { 
RDebugUtils.currentLine=524295;
 //BA.debugLineNum = 524295;BA.debugLine="Log(Result)";
anywheresoftware.b4a.keywords.Common.LogImpl("5524295",BA.ObjectToString(_result),0);
RDebugUtils.currentLine=524296;
 //BA.debugLineNum = 524296;BA.debugLine="PermissionActive2";
_permissionactive2();
 };
 }else {
RDebugUtils.currentLine=524299;
 //BA.debugLineNum = 524299;BA.debugLine="If Permission = rp.PERMISSION_WRITE_EXTERNAL_STO";
if ((_permission).equals(_rp.PERMISSION_WRITE_EXTERNAL_STORAGE)) { 
RDebugUtils.currentLine=524300;
 //BA.debugLineNum = 524300;BA.debugLine="Log(Result)";
anywheresoftware.b4a.keywords.Common.LogImpl("5524300",BA.ObjectToString(_result),0);
RDebugUtils.currentLine=524301;
 //BA.debugLineNum = 524301;BA.debugLine="PermissionActive2";
_permissionactive2();
 };
 };
RDebugUtils.currentLine=524305;
 //BA.debugLineNum = 524305;BA.debugLine="If Permission = rp.PERMISSION_READ_PHONE_STATE Th";
if ((_permission).equals(_rp.PERMISSION_READ_PHONE_STATE)) { 
RDebugUtils.currentLine=524306;
 //BA.debugLineNum = 524306;BA.debugLine="Log(Result)";
anywheresoftware.b4a.keywords.Common.LogImpl("5524306",BA.ObjectToString(_result),0);
RDebugUtils.currentLine=524307;
 //BA.debugLineNum = 524307;BA.debugLine="PermissionActive3";
_permissionactive3();
 };
RDebugUtils.currentLine=524309;
 //BA.debugLineNum = 524309;BA.debugLine="If Permission= rp.PERMISSION_ACCESS_FINE_LOCATION";
if ((_permission).equals(_rp.PERMISSION_ACCESS_FINE_LOCATION)) { 
RDebugUtils.currentLine=524310;
 //BA.debugLineNum = 524310;BA.debugLine="Log(Result)";
anywheresoftware.b4a.keywords.Common.LogImpl("5524310",BA.ObjectToString(_result),0);
RDebugUtils.currentLine=524313;
 //BA.debugLineNum = 524313;BA.debugLine="PermissionActive4";
_permissionactive4();
 };
RDebugUtils.currentLine=524315;
 //BA.debugLineNum = 524315;BA.debugLine="If Permission= rp.PERMISSION_CALL_PHONE Then";
if ((_permission).equals(_rp.PERMISSION_CALL_PHONE)) { 
RDebugUtils.currentLine=524316;
 //BA.debugLineNum = 524316;BA.debugLine="Log(Result)";
anywheresoftware.b4a.keywords.Common.LogImpl("5524316",BA.ObjectToString(_result),0);
RDebugUtils.currentLine=524317;
 //BA.debugLineNum = 524317;BA.debugLine="PermissionActive5";
_permissionactive5();
 };
RDebugUtils.currentLine=524319;
 //BA.debugLineNum = 524319;BA.debugLine="If Permission = rp.PERMISSION_ACCESS_COARSE_LOCAT";
if ((_permission).equals(_rp.PERMISSION_ACCESS_COARSE_LOCATION)) { 
RDebugUtils.currentLine=524320;
 //BA.debugLineNum = 524320;BA.debugLine="Log(Result)";
anywheresoftware.b4a.keywords.Common.LogImpl("5524320",BA.ObjectToString(_result),0);
RDebugUtils.currentLine=524321;
 //BA.debugLineNum = 524321;BA.debugLine="Try";
try {RDebugUtils.currentLine=524323;
 //BA.debugLineNum = 524323;BA.debugLine="T_Gif.Initialize(\"T_Gif\",3000)";
_t_gif.Initialize(processBA,"T_Gif",(long) (3000));
RDebugUtils.currentLine=524324;
 //BA.debugLineNum = 524324;BA.debugLine="ShowSplash";
_showsplash();
 } 
       catch (Exception e34) {
			processBA.setLastException(e34);RDebugUtils.currentLine=524326;
 //BA.debugLineNum = 524326;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("5524326",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=524327;
 //BA.debugLineNum = 524327;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-Activity_PermissionResult");
 };
 };
RDebugUtils.currentLine=524330;
 //BA.debugLineNum = 524330;BA.debugLine="End Sub";
return "";
}
public static void  _permissionactive2() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "permissionactive2", false))
	 {Debug.delegate(mostCurrent.activityBA, "permissionactive2", null); return;}
ResumableSub_PermissionActive2 rsub = new ResumableSub_PermissionActive2(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_PermissionActive2 extends BA.ResumableSub {
public ResumableSub_PermissionActive2(ir.parsikhesab.pakhsh.main parent) {
this.parent = parent;
}
ir.parsikhesab.pakhsh.main parent;
String _permission = "";
boolean _result = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=262145;
 //BA.debugLineNum = 262145;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_READ_PHONE_STATE";
parent._rp.CheckAndRequest(processBA,parent._rp.PERMISSION_READ_PHONE_STATE);
RDebugUtils.currentLine=262146;
 //BA.debugLineNum = 262146;BA.debugLine="Wait For Activity_PermissonResult (Permission As";
anywheresoftware.b4a.keywords.Common.WaitFor("activity_permissonresult", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "permissionactive2"), null);
this.state = 1;
return;
case 1:
//C
this.state = -1;
_permission = (String) result[0];
_result = (Boolean) result[1];
;
RDebugUtils.currentLine=262147;
 //BA.debugLineNum = 262147;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _permissionactive3() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "permissionactive3", false))
	 {Debug.delegate(mostCurrent.activityBA, "permissionactive3", null); return;}
ResumableSub_PermissionActive3 rsub = new ResumableSub_PermissionActive3(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_PermissionActive3 extends BA.ResumableSub {
public ResumableSub_PermissionActive3(ir.parsikhesab.pakhsh.main parent) {
this.parent = parent;
}
ir.parsikhesab.pakhsh.main parent;
String _permission = "";
boolean _result = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=327681;
 //BA.debugLineNum = 327681;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_ACCESS_FINE_LOCA";
parent._rp.CheckAndRequest(processBA,parent._rp.PERMISSION_ACCESS_FINE_LOCATION);
RDebugUtils.currentLine=327682;
 //BA.debugLineNum = 327682;BA.debugLine="Wait For Activity_PermissonResult (Permission As";
anywheresoftware.b4a.keywords.Common.WaitFor("activity_permissonresult", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "permissionactive3"), null);
this.state = 1;
return;
case 1:
//C
this.state = -1;
_permission = (String) result[0];
_result = (Boolean) result[1];
;
RDebugUtils.currentLine=327683;
 //BA.debugLineNum = 327683;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _permissionactive4() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "permissionactive4", false))
	 {Debug.delegate(mostCurrent.activityBA, "permissionactive4", null); return;}
ResumableSub_PermissionActive4 rsub = new ResumableSub_PermissionActive4(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_PermissionActive4 extends BA.ResumableSub {
public ResumableSub_PermissionActive4(ir.parsikhesab.pakhsh.main parent) {
this.parent = parent;
}
ir.parsikhesab.pakhsh.main parent;
String _permission = "";
boolean _result = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=393217;
 //BA.debugLineNum = 393217;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_CALL_PHONE)";
parent._rp.CheckAndRequest(processBA,parent._rp.PERMISSION_CALL_PHONE);
RDebugUtils.currentLine=393218;
 //BA.debugLineNum = 393218;BA.debugLine="Wait For Activity_PermissonResult (Permission As";
anywheresoftware.b4a.keywords.Common.WaitFor("activity_permissonresult", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "permissionactive4"), null);
this.state = 1;
return;
case 1:
//C
this.state = -1;
_permission = (String) result[0];
_result = (Boolean) result[1];
;
RDebugUtils.currentLine=393219;
 //BA.debugLineNum = 393219;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _permissionactive5() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "permissionactive5", false))
	 {Debug.delegate(mostCurrent.activityBA, "permissionactive5", null); return;}
ResumableSub_PermissionActive5 rsub = new ResumableSub_PermissionActive5(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_PermissionActive5 extends BA.ResumableSub {
public ResumableSub_PermissionActive5(ir.parsikhesab.pakhsh.main parent) {
this.parent = parent;
}
ir.parsikhesab.pakhsh.main parent;
String _permission = "";
boolean _result = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=458753;
 //BA.debugLineNum = 458753;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_ACCESS_COARSE_LO";
parent._rp.CheckAndRequest(processBA,parent._rp.PERMISSION_ACCESS_COARSE_LOCATION);
RDebugUtils.currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="Wait For Activity_PermissonResult (Permission As";
anywheresoftware.b4a.keywords.Common.WaitFor("activity_permissonresult", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "permissionactive5"), null);
this.state = 1;
return;
case 1:
//C
this.state = -1;
_permission = (String) result[0];
_result = (Boolean) result[1];
;
RDebugUtils.currentLine=458755;
 //BA.debugLineNum = 458755;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _showsplash() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "showsplash", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "showsplash", null));}
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Sub ShowSplash";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="Try";
try {RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="MCode.Initialize";
mostCurrent._mcode._initialize /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=589827;
 //BA.debugLineNum = 589827;BA.debugLine="MCode.UpdateDataBase";
mostCurrent._mcode._updatedatabase /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=589832;
 //BA.debugLineNum = 589832;BA.debugLine="T_Gif.Enabled=True";
_t_gif.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 } 
       catch (Exception e6) {
			processBA.setLastException(e6);RDebugUtils.currentLine=589840;
 //BA.debugLineNum = 589840;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("5589840",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=589841;
 //BA.debugLineNum = 589841;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(mostCurrent._activity.getTitle())+"-ShowSplash");
 };
RDebugUtils.currentLine=589843;
 //BA.debugLineNum = 589843;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=720903;
 //BA.debugLineNum = 720903;BA.debugLine="PermissionActive1";
_permissionactive1();
RDebugUtils.currentLine=720904;
 //BA.debugLineNum = 720904;BA.debugLine="End Sub";
return "";
}
public static void  _permissionactive1() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "permissionactive1", false))
	 {Debug.delegate(mostCurrent.activityBA, "permissionactive1", null); return;}
ResumableSub_PermissionActive1 rsub = new ResumableSub_PermissionActive1(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_PermissionActive1 extends BA.ResumableSub {
public ResumableSub_PermissionActive1(ir.parsikhesab.pakhsh.main parent) {
this.parent = parent;
}
ir.parsikhesab.pakhsh.main parent;
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
int _api = 0;
String _permission = "";
boolean _result = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=196609;
 //BA.debugLineNum = 196609;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="Dim Api As Int";
_api = 0;
RDebugUtils.currentLine=196611;
 //BA.debugLineNum = 196611;BA.debugLine="Api = r.GetStaticField(\"android.os.Build$VERSION\"";
_api = (int)(BA.ObjectToNumber(_r.GetStaticField("android.os.Build$VERSION","SDK_INT")));
RDebugUtils.currentLine=196612;
 //BA.debugLineNum = 196612;BA.debugLine="If Api >= 30 Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_api>=30) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=196613;
 //BA.debugLineNum = 196613;BA.debugLine="PM.CheckAndRequestPermission(PermissionsManager.";
parent._pm.CheckAndRequestPermission(processBA,parent.mostCurrent._permissionsmanager.SPECIAL_MANAGE_EXTERNAL_STORAGE);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=196615;
 //BA.debugLineNum = 196615;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_WRITE_EXTERNAL_";
parent._rp.CheckAndRequest(processBA,parent._rp.PERMISSION_WRITE_EXTERNAL_STORAGE);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=196618;
 //BA.debugLineNum = 196618;BA.debugLine="Wait For Activity_PermissonResult (Permission As";
anywheresoftware.b4a.keywords.Common.WaitFor("activity_permissonresult", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "permissionactive1"), null);
this.state = 7;
return;
case 7:
//C
this.state = -1;
_permission = (String) result[0];
_result = (Boolean) result[1];
;
RDebugUtils.currentLine=196619;
 //BA.debugLineNum = 196619;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _checkvaziat() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "checkvaziat", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "checkvaziat", null));}
String _query = "";
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Sub CheckVaziat";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="If MCode.IsConnected Then";
if (mostCurrent._mcode._isconnected /*boolean*/ (mostCurrent.activityBA)) { 
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="If MCode.CodeMoshtari=0 Then";
if ((mostCurrent._mcode._codemoshtari /*String*/ ).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="Dim Query As String=\"Update TblSetting Set FldV";
_query = "Update TblSetting Set FldVaziat = '0'";
RDebugUtils.currentLine=983044;
 //BA.debugLineNum = 983044;BA.debugLine="MCode.SaveUpdate(Query)";
mostCurrent._mcode._saveupdate /*String*/ (mostCurrent.activityBA,_query);
RDebugUtils.currentLine=983046;
 //BA.debugLineNum = 983046;BA.debugLine="MCode.Vaziat=0";
mostCurrent._mcode._vaziat /*int*/  = (int) (0);
 };
RDebugUtils.currentLine=983049;
 //BA.debugLineNum = 983049;BA.debugLine="MCode.NoeGet=\"GetVaziat\"";
mostCurrent._mcode._noeget /*String*/  = "GetVaziat";
RDebugUtils.currentLine=983050;
 //BA.debugLineNum = 983050;BA.debugLine="StartService(Service_Server)";
anywheresoftware.b4a.keywords.Common.StartService(processBA,(Object)(mostCurrent._service_server.getObject()));
 }else {
 };
RDebugUtils.currentLine=983056;
 //BA.debugLineNum = 983056;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _getadvertisingid() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "getadvertisingid", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "getadvertisingid", null));}
ResumableSub_GetAdvertisingId rsub = new ResumableSub_GetAdvertisingId(null);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_GetAdvertisingId extends BA.ResumableSub {
public ResumableSub_GetAdvertisingId(ir.parsikhesab.pakhsh.main parent) {
this.parent = parent;
}
ir.parsikhesab.pakhsh.main parent;
anywheresoftware.b4j.object.JavaObject _jo = null;
boolean _success = false;
String _id = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="Dim jo As JavaObject = Me";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(main.getObject()));
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="jo.RunMethod(\"GetAdvertisingId\", Null)";
_jo.RunMethod("GetAdvertisingId",(Object[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="Wait For AdvertisingId_Ready (Success As Boolean,";
anywheresoftware.b4a.keywords.Common.WaitFor("advertisingid_ready", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "getadvertisingid"), null);
this.state = 1;
return;
case 1:
//C
this.state = -1;
_success = (Boolean) result[0];
_id = (String) result[1];
;
RDebugUtils.currentLine=1048580;
 //BA.debugLineNum = 1048580;BA.debugLine="Return Id";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_id));return;};
RDebugUtils.currentLine=1048581;
 //BA.debugLineNum = 1048581;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _loadpage() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "loadpage", false))
	 {Debug.delegate(mostCurrent.activityBA, "loadpage", null); return;}
ResumableSub_LoadPage rsub = new ResumableSub_LoadPage(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_LoadPage extends BA.ResumableSub {
public ResumableSub_LoadPage(ir.parsikhesab.pakhsh.main parent) {
this.parent = parent;
}
ir.parsikhesab.pakhsh.main parent;
String _id = "";
String _permission = "";
boolean _result = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 21;
this.catchState = 20;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 20;
RDebugUtils.currentLine=917507;
 //BA.debugLineNum = 917507;BA.debugLine="Dim Id As String";
_id = "";
RDebugUtils.currentLine=917508;
 //BA.debugLineNum = 917508;BA.debugLine="Id=MCode.GetDeviceId";
_id = parent.mostCurrent._mcode._getdeviceid /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=917509;
 //BA.debugLineNum = 917509;BA.debugLine="If Id = \"\" Then";
if (true) break;

case 4:
//if
this.state = 9;
if ((_id).equals("")) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=917510;
 //BA.debugLineNum = 917510;BA.debugLine="Wait For (GetAdvertisingId) Complete (Id As Str";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "loadpage"), _getadvertisingid());
this.state = 22;
return;
case 22:
//C
this.state = 9;
_id = (String) result[0];
;
RDebugUtils.currentLine=917512;
 //BA.debugLineNum = 917512;BA.debugLine="Log(MCode.GetApiVersion)";
anywheresoftware.b4a.keywords.Common.LogImpl("5917512",BA.NumberToString(parent.mostCurrent._mcode._getapiversion /*int*/ (mostCurrent.activityBA)),0);
RDebugUtils.currentLine=917513;
 //BA.debugLineNum = 917513;BA.debugLine="MCode.DeviceId=Id";
parent.mostCurrent._mcode._deviceid /*String*/  = _id;
RDebugUtils.currentLine=917514;
 //BA.debugLineNum = 917514;BA.debugLine="Log(Id)";
anywheresoftware.b4a.keywords.Common.LogImpl("5917514",_id,0);
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=917516;
 //BA.debugLineNum = 917516;BA.debugLine="Log(Id)";
anywheresoftware.b4a.keywords.Common.LogImpl("5917516",_id,0);
RDebugUtils.currentLine=917517;
 //BA.debugLineNum = 917517;BA.debugLine="MCode.DeviceId=Id";
parent.mostCurrent._mcode._deviceid /*String*/  = _id;
 if (true) break;
;
RDebugUtils.currentLine=917519;
 //BA.debugLineNum = 917519;BA.debugLine="If MCode.Gps=1 Then";

case 9:
//if
this.state = 18;
if ((parent.mostCurrent._mcode._gps /*String*/ ).equals(BA.NumberToString(1))) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=917526;
 //BA.debugLineNum = 917526;BA.debugLine="Starter.rp.CheckAndRequest(Starter.rp.PERMISSIO";
parent.mostCurrent._starter._rp /*anywheresoftware.b4a.objects.RuntimePermissions*/ .CheckAndRequest(processBA,parent.mostCurrent._starter._rp /*anywheresoftware.b4a.objects.RuntimePermissions*/ .PERMISSION_ACCESS_FINE_LOCATION);
RDebugUtils.currentLine=917527;
 //BA.debugLineNum = 917527;BA.debugLine="Wait For Activity_PermissionResult (Permission";
anywheresoftware.b4a.keywords.Common.WaitFor("activity_permissionresult", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "loadpage"), null);
this.state = 23;
return;
case 23:
//C
this.state = 12;
_permission = (String) result[0];
_result = (Boolean) result[1];
;
RDebugUtils.currentLine=917528;
 //BA.debugLineNum = 917528;BA.debugLine="If Result Then";
if (true) break;

case 12:
//if
this.state = 17;
if (_result) { 
this.state = 14;
}else {
this.state = 16;
}if (true) break;

case 14:
//C
this.state = 17;
 if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=917531;
 //BA.debugLineNum = 917531;BA.debugLine="ToastMessageShow(\"No permission...\", True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("No permission..."),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 17:
//C
this.state = 18;
;
 if (true) break;

case 18:
//C
this.state = 21;
;
RDebugUtils.currentLine=917534;
 //BA.debugLineNum = 917534;BA.debugLine="StartActivity(Act_Main)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._act_main.getObject()));
RDebugUtils.currentLine=917535;
 //BA.debugLineNum = 917535;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
 if (true) break;

case 20:
//C
this.state = 21;
this.catchState = 0;
RDebugUtils.currentLine=917537;
 //BA.debugLineNum = 917537;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("5917537",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=917538;
 //BA.debugLineNum = 917538;BA.debugLine="myCode.SendError(LastException,Activity.Title&\"-";
parent.mostCurrent._mycode._senderror /*void*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),BA.ObjectToString(parent.mostCurrent._activity.getTitle())+"-LoadPage");
 if (true) break;
if (true) break;

case 21:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=917540;
 //BA.debugLineNum = 917540;BA.debugLine="End Sub";
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
public static String  _t_gif_tick() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "t_gif_tick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "t_gif_tick", null));}
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Sub T_Gif_Tick";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="T_Gif.Enabled=False";
_t_gif.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=655363;
 //BA.debugLineNum = 655363;BA.debugLine="StartActivity(Act_Main)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._act_main.getObject()));
RDebugUtils.currentLine=655364;
 //BA.debugLineNum = 655364;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=655365;
 //BA.debugLineNum = 655365;BA.debugLine="End Sub";
return "";
}

public static void GetAdvertisingId() {
   BA.runAsync(processBA, mostCurrent, "advertisingid_ready", new Object[] {false, ""}
       , new Callable<Object[]>() {
                   @Override
                   public Object[] call() throws Exception {
                       String id = AdvertisingIdClient.getAdvertisingIdInfo(mostCurrent).getId();
                       return new Object[] {true, id};
                   }
               }); }
//Sources:
//http://medium.com/@ssaurel/how-to-auto-restart-an-android-application-after-a-crash-or-a-force-close-error-1a361677c0ce
//http://stackoverflow.com/a/2903866
//http://mobikul.com/auto-restart-application-crashforce-close-android/

public void setDefaultUncaughtExceptionHandler() {
   
   Thread.setDefaultUncaughtExceptionHandler(new MyExceptionHandler(this));
}


public class MyExceptionHandler implements Thread.UncaughtExceptionHandler {

  private Activity activity;

  public MyExceptionHandler(Activity a) {
    activity = a;
  }

  @Override
  public void uncaughtException(Thread thread, Throwable ex) {
    activity.finish();
    System.exit(2);
  }
}
}