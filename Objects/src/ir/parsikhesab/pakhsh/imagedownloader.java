package ir.parsikhesab.pakhsh;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.objects.ServiceHelper;
import anywheresoftware.b4a.debug.*;

public class imagedownloader extends android.app.Service{
	public static class imagedownloader_BR extends android.content.BroadcastReceiver {

		@Override
		public void onReceive(android.content.Context context, android.content.Intent intent) {
            BA.LogInfo("** Receiver (imagedownloader) OnReceive **");
			android.content.Intent in = new android.content.Intent(context, imagedownloader.class);
			if (intent != null)
				in.putExtra("b4a_internal_intent", intent);
            ServiceHelper.StarterHelper.startServiceFromReceiver (context, in, false, anywheresoftware.b4a.ShellBA.class);
		}

	}
    static imagedownloader mostCurrent;
	public static BA processBA;
    private ServiceHelper _service;
    public static Class<?> getObject() {
		return imagedownloader.class;
	}
	@Override
	public void onCreate() {
        super.onCreate();
        mostCurrent = this;
        if (processBA == null) {
		    processBA = new anywheresoftware.b4a.ShellBA(this, null, null, "ir.parsikhesab.pakhsh", "ir.parsikhesab.pakhsh.imagedownloader");
            if (BA.isShellModeRuntimeCheck(processBA)) {
                processBA.raiseEvent2(null, true, "SHELL", false);
		    }
            try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            processBA.loadHtSubs(this.getClass());
            ServiceHelper.init();
        }
        _service = new ServiceHelper(this);
        processBA.service = this;
        
        if (BA.isShellModeRuntimeCheck(processBA)) {
			processBA.raiseEvent2(null, true, "CREATE", true, "ir.parsikhesab.pakhsh.imagedownloader", processBA, _service, anywheresoftware.b4a.keywords.Common.Density);
		}
        if (!false && ServiceHelper.StarterHelper.startFromServiceCreate(processBA, false) == false) {
				
		}
		else {
            processBA.setActivityPaused(false);
            BA.LogInfo("*** Service (imagedownloader) Create ***");
            processBA.raiseEvent(null, "service_create");
        }
        processBA.runHook("oncreate", this, null);
        if (false) {
			if (ServiceHelper.StarterHelper.runWaitForLayouts() == false) {
                BA.LogInfo("stopping spontaneous created service");
                stopSelf();
            }
		}
    }
		@Override
	public void onStart(android.content.Intent intent, int startId) {
		onStartCommand(intent, 0, 0);
    }
    @Override
    public int onStartCommand(final android.content.Intent intent, int flags, int startId) {
    	if (ServiceHelper.StarterHelper.onStartCommand(processBA, new Runnable() {
            public void run() {
                handleStart(intent);
            }}))
			;
		else {
			ServiceHelper.StarterHelper.addWaitForLayout (new Runnable() {
				public void run() {
                    processBA.setActivityPaused(false);
                    BA.LogInfo("** Service (imagedownloader) Create **");
                    processBA.raiseEvent(null, "service_create");
					handleStart(intent);
                    ServiceHelper.StarterHelper.removeWaitForLayout();
				}
			});
		}
        processBA.runHook("onstartcommand", this, new Object[] {intent, flags, startId});
		return android.app.Service.START_NOT_STICKY;
    }
    public void onTaskRemoved(android.content.Intent rootIntent) {
        super.onTaskRemoved(rootIntent);
        if (false)
            processBA.raiseEvent(null, "service_taskremoved");
            
    }
    private void handleStart(android.content.Intent intent) {
    	BA.LogInfo("** Service (imagedownloader) Start **");
    	java.lang.reflect.Method startEvent = processBA.htSubs.get("service_start");
    	if (startEvent != null) {
    		if (startEvent.getParameterTypes().length > 0) {
    			anywheresoftware.b4a.objects.IntentWrapper iw = ServiceHelper.StarterHelper.handleStartIntent(intent, _service, processBA);
    			processBA.raiseEvent(null, "service_start", iw);
    		}
    		else {
    			processBA.raiseEvent(null, "service_start");
    		}
    	}
    }

	public void onTimeout(int startId) {
        BA.LogInfo("** Service (imagedownloader) Timeout **");
        anywheresoftware.b4a.objects.collections.Map params = new anywheresoftware.b4a.objects.collections.Map();
        params.Initialize();
        params.Put("StartId", startId);
        processBA.raiseEvent(null, "service_timeout", params);
            
    }
	@Override
	public void onDestroy() {
        super.onDestroy();
        if (false) {
            BA.LogInfo("** Service (imagedownloader) Destroy (ignored)**");
        }
        else {
            BA.LogInfo("** Service (imagedownloader) Destroy **");
		    processBA.raiseEvent(null, "service_destroy");
            processBA.service = null;
		    mostCurrent = null;
		    processBA.setActivityPaused(true);
            processBA.runHook("ondestroy", this, null);
        }
	}

@Override
	public android.os.IBinder onBind(android.content.Intent intent) {
		return null;
	}
public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.objects.collections.Map _cache = null;
public static anywheresoftware.b4a.objects.collections.Map _tasks = null;
public static anywheresoftware.b4a.objects.collections.Map _ongoingtasks = null;
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
public ir.parsikhesab.pakhsh.act_video _act_video = null;
public ir.parsikhesab.pakhsh.clskala _clskala = null;
public ir.parsikhesab.pakhsh.dbutils _dbutils = null;
public ir.parsikhesab.pakhsh.firebasemessaging _firebasemessaging = null;
public ir.parsikhesab.pakhsh.geoservice _geoservice = null;
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
public static String  _activityispaused() throws Exception{
RDebugUtils.currentModule="imagedownloader";
if (Debug.shouldDelegate(processBA, "activityispaused", false))
	 {return ((String) Debug.delegate(processBA, "activityispaused", null));}
RDebugUtils.currentLine=118489088;
 //BA.debugLineNum = 118489088;BA.debugLine="Sub ActivityIsPaused";
RDebugUtils.currentLine=118489089;
 //BA.debugLineNum = 118489089;BA.debugLine="tasks.Clear";
_tasks.Clear();
RDebugUtils.currentLine=118489090;
 //BA.debugLineNum = 118489090;BA.debugLine="cache.Clear";
_cache.Clear();
RDebugUtils.currentLine=118489091;
 //BA.debugLineNum = 118489091;BA.debugLine="End Sub";
return "";
}
public static String  _download(anywheresoftware.b4a.objects.collections.Map _imageviewsmap) throws Exception{
RDebugUtils.currentModule="imagedownloader";
if (Debug.shouldDelegate(processBA, "download", false))
	 {return ((String) Debug.delegate(processBA, "download", new Object[] {_imageviewsmap}));}
int _i = 0;
String _link = "";
anywheresoftware.b4a.objects.ImageViewWrapper _iv = null;
ir.parsikhesab.pakhsh.httpjob _j = null;
RDebugUtils.currentLine=118358016;
 //BA.debugLineNum = 118358016;BA.debugLine="Sub Download (ImageViewsMap As Map)";
RDebugUtils.currentLine=118358017;
 //BA.debugLineNum = 118358017;BA.debugLine="For i = 0 To ImageViewsMap.Size - 1";
{
final int step1 = 1;
final int limit1 = (int) (_imageviewsmap.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=118358018;
 //BA.debugLineNum = 118358018;BA.debugLine="tasks.Put(ImageViewsMap.GetKeyAt(i), ImageViewsM";
_tasks.Put(_imageviewsmap.GetKeyAt(_i),_imageviewsmap.GetValueAt(_i));
RDebugUtils.currentLine=118358019;
 //BA.debugLineNum = 118358019;BA.debugLine="Dim link As String = ImageViewsMap.GetValueAt(i)";
_link = BA.ObjectToString(_imageviewsmap.GetValueAt(_i));
RDebugUtils.currentLine=118358020;
 //BA.debugLineNum = 118358020;BA.debugLine="If cache.ContainsKey(link) Then";
if (_cache.ContainsKey((Object)(_link))) { 
RDebugUtils.currentLine=118358021;
 //BA.debugLineNum = 118358021;BA.debugLine="Dim iv As ImageView = ImageViewsMap.GetKeyAt(i)";
_iv = new anywheresoftware.b4a.objects.ImageViewWrapper();
_iv = (anywheresoftware.b4a.objects.ImageViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ImageViewWrapper(), (android.widget.ImageView)(_imageviewsmap.GetKeyAt(_i)));
RDebugUtils.currentLine=118358022;
 //BA.debugLineNum = 118358022;BA.debugLine="iv.SetBackgroundImage(cache.Get(link))";
_iv.SetBackgroundImageNew((android.graphics.Bitmap)(_cache.Get((Object)(_link))));
 }else 
{RDebugUtils.currentLine=118358023;
 //BA.debugLineNum = 118358023;BA.debugLine="Else If ongoingTasks.ContainsKey(link) = False T";
if (_ongoingtasks.ContainsKey((Object)(_link))==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=118358024;
 //BA.debugLineNum = 118358024;BA.debugLine="ongoingTasks.Put(link, \"\")";
_ongoingtasks.Put((Object)(_link),(Object)(""));
RDebugUtils.currentLine=118358025;
 //BA.debugLineNum = 118358025;BA.debugLine="Dim j As HttpJob";
_j = new ir.parsikhesab.pakhsh.httpjob();
RDebugUtils.currentLine=118358026;
 //BA.debugLineNum = 118358026;BA.debugLine="j.Initialize(link, Me)";
_j._initialize /*String*/ (null,processBA,_link,imagedownloader.getObject());
RDebugUtils.currentLine=118358027;
 //BA.debugLineNum = 118358027;BA.debugLine="j.Download(link)";
_j._download /*String*/ (null,_link);
 }}
;
 }
};
RDebugUtils.currentLine=118358030;
 //BA.debugLineNum = 118358030;BA.debugLine="End Sub";
return "";
}
public static void  _jobdone(ir.parsikhesab.pakhsh.httpjob _job) throws Exception{
RDebugUtils.currentModule="imagedownloader";
if (Debug.shouldDelegate(processBA, "jobdone", false))
	 {Debug.delegate(processBA, "jobdone", new Object[] {_job}); return;}
ResumableSub_JobDone rsub = new ResumableSub_JobDone(null,_job);
rsub.resume(processBA, null);
}
public static class ResumableSub_JobDone extends BA.ResumableSub {
public ResumableSub_JobDone(ir.parsikhesab.pakhsh.imagedownloader parent,ir.parsikhesab.pakhsh.httpjob _job) {
this.parent = parent;
this._job = _job;
}
ir.parsikhesab.pakhsh.imagedownloader parent;
ir.parsikhesab.pakhsh.httpjob _job;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp = null;
String _filename = "";
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
int _i = 0;
String _link = "";
anywheresoftware.b4a.objects.ImageViewWrapper _iv = null;
int step19;
int limit19;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="imagedownloader";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=118423553;
 //BA.debugLineNum = 118423553;BA.debugLine="ongoingTasks.Remove(Job.JobName)";
parent._ongoingtasks.Remove((Object)(_job._jobname /*String*/ ));
RDebugUtils.currentLine=118423555;
 //BA.debugLineNum = 118423555;BA.debugLine="If Job.Success Then";
if (true) break;

case 1:
//if
this.state = 22;
if (_job._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 21;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=118423556;
 //BA.debugLineNum = 118423556;BA.debugLine="tasks.Clear";
parent._tasks.Clear();
RDebugUtils.currentLine=118423557;
 //BA.debugLineNum = 118423557;BA.debugLine="cache.Clear";
parent._cache.Clear();
RDebugUtils.currentLine=118423558;
 //BA.debugLineNum = 118423558;BA.debugLine="Dim bmp As Bitmap = Job.GetBitmap";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_bmp = _job._getbitmap /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ (null);
RDebugUtils.currentLine=118423559;
 //BA.debugLineNum = 118423559;BA.debugLine="Dim filename As String=MCode.CodeKalaImage & \".j";
_filename = parent.mostCurrent._mcode._codekalaimage /*String*/ +".jpg";
RDebugUtils.currentLine=118423561;
 //BA.debugLineNum = 118423561;BA.debugLine="If File.Exists(File.DirDefaultExternal&\"/Parsik/";
if (true) break;

case 4:
//if
this.state = 7;
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal()+"/Parsik/AksKala",_filename)) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=118423562;
 //BA.debugLineNum = 118423562;BA.debugLine="File.Delete(File.DirDefaultExternal&\"/Parsik/Ak";
anywheresoftware.b4a.keywords.Common.File.Delete(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal()+"/Parsik/AksKala",_filename);
 if (true) break;

case 7:
//C
this.state = 8;
;
RDebugUtils.currentLine=118423564;
 //BA.debugLineNum = 118423564;BA.debugLine="Dim out As OutputStream";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=118423565;
 //BA.debugLineNum = 118423565;BA.debugLine="out = File.OpenOutput(File.DirInternalCache, fil";
_out = anywheresoftware.b4a.keywords.Common.File.OpenOutput(anywheresoftware.b4a.keywords.Common.File.getDirInternalCache(),_filename,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=118423566;
 //BA.debugLineNum = 118423566;BA.debugLine="bmp.WriteToStream(out, 100, \"JPEG\")";
_bmp.WriteToStream((java.io.OutputStream)(_out.getObject()),(int) (100),BA.getEnumFromString(android.graphics.Bitmap.CompressFormat.class,"JPEG"));
RDebugUtils.currentLine=118423567;
 //BA.debugLineNum = 118423567;BA.debugLine="out.Close";
_out.Close();
RDebugUtils.currentLine=118423568;
 //BA.debugLineNum = 118423568;BA.debugLine="Sleep(200)";
anywheresoftware.b4a.keywords.Common.Sleep(processBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "imagedownloader", "jobdone"),(int) (200));
this.state = 23;
return;
case 23:
//C
this.state = 8;
;
RDebugUtils.currentLine=118423569;
 //BA.debugLineNum = 118423569;BA.debugLine="File.Copy(File.DirInternalCache, filename,File.D";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirInternalCache(),_filename,anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal()+"/Parsik/AksKala",_filename);
RDebugUtils.currentLine=118423570;
 //BA.debugLineNum = 118423570;BA.debugLine="Sleep(200)";
anywheresoftware.b4a.keywords.Common.Sleep(processBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "imagedownloader", "jobdone"),(int) (200));
this.state = 24;
return;
case 24:
//C
this.state = 8;
;
RDebugUtils.currentLine=118423572;
 //BA.debugLineNum = 118423572;BA.debugLine="cache.Put(Job.JobName, bmp)";
parent._cache.Put((Object)(_job._jobname /*String*/ ),(Object)(_bmp.getObject()));
RDebugUtils.currentLine=118423573;
 //BA.debugLineNum = 118423573;BA.debugLine="If tasks.IsInitialized Then";
if (true) break;

case 8:
//if
this.state = 19;
if (parent._tasks.IsInitialized()) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=118423574;
 //BA.debugLineNum = 118423574;BA.debugLine="For i = 0 To tasks.Size - 1";
if (true) break;

case 11:
//for
this.state = 18;
step19 = 1;
limit19 = (int) (parent._tasks.getSize()-1);
_i = (int) (0) ;
this.state = 25;
if (true) break;

case 25:
//C
this.state = 18;
if ((step19 > 0 && _i <= limit19) || (step19 < 0 && _i >= limit19)) this.state = 13;
if (true) break;

case 26:
//C
this.state = 25;
_i = ((int)(0 + _i + step19)) ;
if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=118423575;
 //BA.debugLineNum = 118423575;BA.debugLine="Dim link As String = tasks.GetValueAt(i)";
_link = BA.ObjectToString(parent._tasks.GetValueAt(_i));
RDebugUtils.currentLine=118423576;
 //BA.debugLineNum = 118423576;BA.debugLine="If link = Job.JobName Then";
if (true) break;

case 14:
//if
this.state = 17;
if ((_link).equals(_job._jobname /*String*/ )) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=118423577;
 //BA.debugLineNum = 118423577;BA.debugLine="Dim iv As ImageView = tasks.GetKeyAt(i)";
_iv = new anywheresoftware.b4a.objects.ImageViewWrapper();
_iv = (anywheresoftware.b4a.objects.ImageViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ImageViewWrapper(), (android.widget.ImageView)(parent._tasks.GetKeyAt(_i)));
RDebugUtils.currentLine=118423578;
 //BA.debugLineNum = 118423578;BA.debugLine="iv.SetBackgroundImage(bmp)";
_iv.SetBackgroundImageNew((android.graphics.Bitmap)(_bmp.getObject()));
 if (true) break;

case 17:
//C
this.state = 26;
;
 if (true) break;
if (true) break;

case 18:
//C
this.state = 19;
;
 if (true) break;

case 19:
//C
this.state = 22;
;
RDebugUtils.currentLine=118423583;
 //BA.debugLineNum = 118423583;BA.debugLine="MCode.StatusPicKala=\"OK\"";
parent.mostCurrent._mcode._statuspickala /*String*/  = "OK";
 if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=118423585;
 //BA.debugLineNum = 118423585;BA.debugLine="Log(\"Error downloading image: \" & Job.JobName &";
anywheresoftware.b4a.keywords.Common.LogImpl("5118423585","Error downloading image: "+_job._jobname /*String*/ +anywheresoftware.b4a.keywords.Common.CRLF+_job._errormessage /*String*/ ,0);
RDebugUtils.currentLine=118423586;
 //BA.debugLineNum = 118423586;BA.debugLine="MCode.StatusPicKala=\"Error\"";
parent.mostCurrent._mcode._statuspickala /*String*/  = "Error";
 if (true) break;

case 22:
//C
this.state = -1;
;
RDebugUtils.currentLine=118423588;
 //BA.debugLineNum = 118423588;BA.debugLine="Job.Release";
_job._release /*String*/ (null);
RDebugUtils.currentLine=118423589;
 //BA.debugLineNum = 118423589;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _service_create() throws Exception{
RDebugUtils.currentModule="imagedownloader";
if (Debug.shouldDelegate(processBA, "service_create", false))
	 {return ((String) Debug.delegate(processBA, "service_create", null));}
RDebugUtils.currentLine=118161408;
 //BA.debugLineNum = 118161408;BA.debugLine="Sub Service_Create";
RDebugUtils.currentLine=118161409;
 //BA.debugLineNum = 118161409;BA.debugLine="tasks.Initialize";
_tasks.Initialize();
RDebugUtils.currentLine=118161410;
 //BA.debugLineNum = 118161410;BA.debugLine="cache.Initialize";
_cache.Initialize();
RDebugUtils.currentLine=118161411;
 //BA.debugLineNum = 118161411;BA.debugLine="ongoingTasks.Initialize";
_ongoingtasks.Initialize();
RDebugUtils.currentLine=118161412;
 //BA.debugLineNum = 118161412;BA.debugLine="End Sub";
return "";
}
public static String  _service_destroy() throws Exception{
RDebugUtils.currentModule="imagedownloader";
if (Debug.shouldDelegate(processBA, "service_destroy", false))
	 {return ((String) Debug.delegate(processBA, "service_destroy", null));}
RDebugUtils.currentLine=118292480;
 //BA.debugLineNum = 118292480;BA.debugLine="Sub Service_Destroy";
RDebugUtils.currentLine=118292482;
 //BA.debugLineNum = 118292482;BA.debugLine="End Sub";
return "";
}
public static String  _service_start(anywheresoftware.b4a.objects.IntentWrapper _startingintent) throws Exception{
RDebugUtils.currentModule="imagedownloader";
if (Debug.shouldDelegate(processBA, "service_start", false))
	 {return ((String) Debug.delegate(processBA, "service_start", new Object[] {_startingintent}));}
RDebugUtils.currentLine=118226944;
 //BA.debugLineNum = 118226944;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
RDebugUtils.currentLine=118226946;
 //BA.debugLineNum = 118226946;BA.debugLine="End Sub";
return "";
}
}