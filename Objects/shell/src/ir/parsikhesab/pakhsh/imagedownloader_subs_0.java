package ir.parsikhesab.pakhsh;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class imagedownloader_subs_0 {


public static RemoteObject  _activityispaused() throws Exception{
try {
		Debug.PushSubsStack("ActivityIsPaused (imagedownloader) ","imagedownloader",96,imagedownloader.processBA,imagedownloader.mostCurrent,79);
if (RapidSub.canDelegate("activityispaused")) { return ir.parsikhesab.pakhsh.imagedownloader.remoteMe.runUserSub(false, "imagedownloader","activityispaused");}
 BA.debugLineNum = 79;BA.debugLine="Sub ActivityIsPaused";
Debug.ShouldStop(16384);
 BA.debugLineNum = 80;BA.debugLine="tasks.Clear";
Debug.ShouldStop(32768);
imagedownloader._tasks.runVoidMethod ("Clear");
 BA.debugLineNum = 81;BA.debugLine="cache.Clear";
Debug.ShouldStop(65536);
imagedownloader._cache.runVoidMethod ("Clear");
 BA.debugLineNum = 82;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _download(RemoteObject _imageviewsmap) throws Exception{
try {
		Debug.PushSubsStack("Download (imagedownloader) ","imagedownloader",96,imagedownloader.processBA,imagedownloader.mostCurrent,25);
if (RapidSub.canDelegate("download")) { return ir.parsikhesab.pakhsh.imagedownloader.remoteMe.runUserSub(false, "imagedownloader","download", _imageviewsmap);}
int _i = 0;
RemoteObject _link = RemoteObject.createImmutable("");
RemoteObject _iv = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
RemoteObject _j = RemoteObject.declareNull("ir.parsikhesab.pakhsh.httpjob");
Debug.locals.put("ImageViewsMap", _imageviewsmap);
 BA.debugLineNum = 25;BA.debugLine="Sub Download (ImageViewsMap As Map)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 26;BA.debugLine="For i = 0 To ImageViewsMap.Size - 1";
Debug.ShouldStop(33554432);
{
final int step1 = 1;
final int limit1 = RemoteObject.solve(new RemoteObject[] {_imageviewsmap.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 27;BA.debugLine="tasks.Put(ImageViewsMap.GetKeyAt(i), ImageViewsM";
Debug.ShouldStop(67108864);
imagedownloader._tasks.runVoidMethod ("Put",(Object)(_imageviewsmap.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i)))),(Object)(_imageviewsmap.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, _i)))));
 BA.debugLineNum = 28;BA.debugLine="Dim link As String = ImageViewsMap.GetValueAt(i)";
Debug.ShouldStop(134217728);
_link = BA.ObjectToString(_imageviewsmap.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("link", _link);Debug.locals.put("link", _link);
 BA.debugLineNum = 29;BA.debugLine="If cache.ContainsKey(link) Then";
Debug.ShouldStop(268435456);
if (imagedownloader._cache.runMethod(true,"ContainsKey",(Object)((_link))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 30;BA.debugLine="Dim iv As ImageView = ImageViewsMap.GetKeyAt(i)";
Debug.ShouldStop(536870912);
_iv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
_iv = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ImageViewWrapper"), _imageviewsmap.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("iv", _iv);Debug.locals.put("iv", _iv);
 BA.debugLineNum = 31;BA.debugLine="iv.SetBackgroundImage(cache.Get(link))";
Debug.ShouldStop(1073741824);
_iv.runVoidMethod ("SetBackgroundImageNew",(Object)((imagedownloader._cache.runMethod(false,"Get",(Object)((_link))))));
 }else 
{ BA.debugLineNum = 32;BA.debugLine="Else If ongoingTasks.ContainsKey(link) = False T";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",imagedownloader._ongoingtasks.runMethod(true,"ContainsKey",(Object)((_link))),imagedownloader.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 33;BA.debugLine="ongoingTasks.Put(link, \"\")";
Debug.ShouldStop(1);
imagedownloader._ongoingtasks.runVoidMethod ("Put",(Object)((_link)),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 34;BA.debugLine="Dim j As HttpJob";
Debug.ShouldStop(2);
_j = RemoteObject.createNew ("ir.parsikhesab.pakhsh.httpjob");Debug.locals.put("j", _j);
 BA.debugLineNum = 35;BA.debugLine="j.Initialize(link, Me)";
Debug.ShouldStop(4);
_j.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_initialize" /*RemoteObject*/ ,imagedownloader.processBA,(Object)(_link),(Object)(imagedownloader.getObject()));
 BA.debugLineNum = 36;BA.debugLine="j.Download(link)";
Debug.ShouldStop(8);
_j.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(_link));
 }}
;
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 39;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (imagedownloader) ","imagedownloader",96,imagedownloader.processBA,imagedownloader.mostCurrent,41);
if (RapidSub.canDelegate("jobdone")) { ir.parsikhesab.pakhsh.imagedownloader.remoteMe.runUserSub(false, "imagedownloader","jobdone", _job); return;}
ResumableSub_JobDone rsub = new ResumableSub_JobDone(null,_job);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_JobDone extends BA.ResumableSub {
public ResumableSub_JobDone(ir.parsikhesab.pakhsh.imagedownloader parent,RemoteObject _job) {
this.parent = parent;
this._job = _job;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.parsikhesab.pakhsh.imagedownloader parent;
RemoteObject _job;
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
RemoteObject _filename = RemoteObject.createImmutable("");
RemoteObject _out = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
int _i = 0;
RemoteObject _link = RemoteObject.createImmutable("");
RemoteObject _iv = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
int step19;
int limit19;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("JobDone (imagedownloader) ","imagedownloader",96,imagedownloader.processBA,imagedownloader.mostCurrent,41);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("Job", _job);
 BA.debugLineNum = 42;BA.debugLine="ongoingTasks.Remove(Job.JobName)";
Debug.ShouldStop(512);
parent._ongoingtasks.runVoidMethod ("Remove",(Object)((_job.getField(true,"_jobname" /*RemoteObject*/ ))));
 BA.debugLineNum = 44;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(2048);
if (true) break;

case 1:
//if
this.state = 22;
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 21;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 45;BA.debugLine="tasks.Clear";
Debug.ShouldStop(4096);
parent._tasks.runVoidMethod ("Clear");
 BA.debugLineNum = 46;BA.debugLine="cache.Clear";
Debug.ShouldStop(8192);
parent._cache.runVoidMethod ("Clear");
 BA.debugLineNum = 47;BA.debugLine="Dim bmp As Bitmap = Job.GetBitmap";
Debug.ShouldStop(16384);
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
_bmp = _job.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_getbitmap" /*RemoteObject*/ );Debug.locals.put("bmp", _bmp);Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 48;BA.debugLine="Dim filename As String=MCode.CodeKalaImage & \".j";
Debug.ShouldStop(32768);
_filename = RemoteObject.concat(parent.mostCurrent._mcode._codekalaimage /*RemoteObject*/ ,RemoteObject.createImmutable(".jpg"));Debug.locals.put("filename", _filename);Debug.locals.put("filename", _filename);
 BA.debugLineNum = 50;BA.debugLine="If File.Exists(File.DirDefaultExternal&\"/Parsik/";
Debug.ShouldStop(131072);
if (true) break;

case 4:
//if
this.state = 7;
if (parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(RemoteObject.concat(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal"),RemoteObject.createImmutable("/Parsik/AksKala"))),(Object)(_filename)).<Boolean>get().booleanValue()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 51;BA.debugLine="File.Delete(File.DirDefaultExternal&\"/Parsik/Ak";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(RemoteObject.concat(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal"),RemoteObject.createImmutable("/Parsik/AksKala"))),(Object)(_filename));
 if (true) break;

case 7:
//C
this.state = 8;
;
 BA.debugLineNum = 53;BA.debugLine="Dim out As OutputStream";
Debug.ShouldStop(1048576);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");Debug.locals.put("out", _out);
 BA.debugLineNum = 54;BA.debugLine="out = File.OpenOutput(File.DirInternalCache, fil";
Debug.ShouldStop(2097152);
_out = parent.mostCurrent.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternalCache")),(Object)(_filename),(Object)(parent.mostCurrent.__c.getField(true,"False")));Debug.locals.put("out", _out);
 BA.debugLineNum = 55;BA.debugLine="bmp.WriteToStream(out, 100, \"JPEG\")";
Debug.ShouldStop(4194304);
_bmp.runVoidMethod ("WriteToStream",(Object)((_out.getObject())),(Object)(BA.numberCast(int.class, 100)),(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.Bitmap.CompressFormat"),RemoteObject.createImmutable("JPEG"))));
 BA.debugLineNum = 56;BA.debugLine="out.Close";
Debug.ShouldStop(8388608);
_out.runVoidMethod ("Close");
 BA.debugLineNum = 57;BA.debugLine="Sleep(200)";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("Sleep",imagedownloader.processBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "imagedownloader", "jobdone"),BA.numberCast(int.class, 200));
this.state = 23;
return;
case 23:
//C
this.state = 8;
;
 BA.debugLineNum = 58;BA.debugLine="File.Copy(File.DirInternalCache, filename,File.D";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternalCache")),(Object)(_filename),(Object)(RemoteObject.concat(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal"),RemoteObject.createImmutable("/Parsik/AksKala"))),(Object)(_filename));
 BA.debugLineNum = 59;BA.debugLine="Sleep(200)";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("Sleep",imagedownloader.processBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "imagedownloader", "jobdone"),BA.numberCast(int.class, 200));
this.state = 24;
return;
case 24:
//C
this.state = 8;
;
 BA.debugLineNum = 61;BA.debugLine="cache.Put(Job.JobName, bmp)";
Debug.ShouldStop(268435456);
parent._cache.runVoidMethod ("Put",(Object)((_job.getField(true,"_jobname" /*RemoteObject*/ ))),(Object)((_bmp.getObject())));
 BA.debugLineNum = 62;BA.debugLine="If tasks.IsInitialized Then";
Debug.ShouldStop(536870912);
if (true) break;

case 8:
//if
this.state = 19;
if (parent._tasks.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 63;BA.debugLine="For i = 0 To tasks.Size - 1";
Debug.ShouldStop(1073741824);
if (true) break;

case 11:
//for
this.state = 18;
step19 = 1;
limit19 = RemoteObject.solve(new RemoteObject[] {parent._tasks.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
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
Debug.locals.put("i", _i);
if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 64;BA.debugLine="Dim link As String = tasks.GetValueAt(i)";
Debug.ShouldStop(-2147483648);
_link = BA.ObjectToString(parent._tasks.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("link", _link);Debug.locals.put("link", _link);
 BA.debugLineNum = 65;BA.debugLine="If link = Job.JobName Then";
Debug.ShouldStop(1);
if (true) break;

case 14:
//if
this.state = 17;
if (RemoteObject.solveBoolean("=",_link,_job.getField(true,"_jobname" /*RemoteObject*/ ))) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 66;BA.debugLine="Dim iv As ImageView = tasks.GetKeyAt(i)";
Debug.ShouldStop(2);
_iv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
_iv = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ImageViewWrapper"), parent._tasks.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("iv", _iv);Debug.locals.put("iv", _iv);
 BA.debugLineNum = 67;BA.debugLine="iv.SetBackgroundImage(bmp)";
Debug.ShouldStop(4);
_iv.runVoidMethod ("SetBackgroundImageNew",(Object)((_bmp.getObject())));
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
Debug.locals.put("i", _i);
;
 if (true) break;

case 19:
//C
this.state = 22;
;
 BA.debugLineNum = 72;BA.debugLine="MCode.StatusPicKala=\"OK\"";
Debug.ShouldStop(128);
parent.mostCurrent._mcode._statuspickala /*RemoteObject*/  = BA.ObjectToString("OK");
 if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 74;BA.debugLine="Log(\"Error downloading image: \" & Job.JobName &";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","5118423585",RemoteObject.concat(RemoteObject.createImmutable("Error downloading image: "),_job.getField(true,"_jobname" /*RemoteObject*/ ),parent.mostCurrent.__c.getField(true,"CRLF"),_job.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 BA.debugLineNum = 75;BA.debugLine="MCode.StatusPicKala=\"Error\"";
Debug.ShouldStop(1024);
parent.mostCurrent._mcode._statuspickala /*RemoteObject*/  = BA.ObjectToString("Error");
 if (true) break;

case 22:
//C
this.state = -1;
;
 BA.debugLineNum = 77;BA.debugLine="Job.Release";
Debug.ShouldStop(4096);
_job.runClassMethod (ir.parsikhesab.pakhsh.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 78;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 5;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Private cache As Map";
imagedownloader._cache = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 7;BA.debugLine="Private tasks As Map";
imagedownloader._tasks = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 8;BA.debugLine="Private ongoingTasks As Map";
imagedownloader._ongoingtasks = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _service_create() throws Exception{
try {
		Debug.PushSubsStack("Service_Create (imagedownloader) ","imagedownloader",96,imagedownloader.processBA,imagedownloader.mostCurrent,11);
if (RapidSub.canDelegate("service_create")) { return ir.parsikhesab.pakhsh.imagedownloader.remoteMe.runUserSub(false, "imagedownloader","service_create");}
 BA.debugLineNum = 11;BA.debugLine="Sub Service_Create";
Debug.ShouldStop(1024);
 BA.debugLineNum = 12;BA.debugLine="tasks.Initialize";
Debug.ShouldStop(2048);
imagedownloader._tasks.runVoidMethod ("Initialize");
 BA.debugLineNum = 13;BA.debugLine="cache.Initialize";
Debug.ShouldStop(4096);
imagedownloader._cache.runVoidMethod ("Initialize");
 BA.debugLineNum = 14;BA.debugLine="ongoingTasks.Initialize";
Debug.ShouldStop(8192);
imagedownloader._ongoingtasks.runVoidMethod ("Initialize");
 BA.debugLineNum = 15;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _service_destroy() throws Exception{
try {
		Debug.PushSubsStack("Service_Destroy (imagedownloader) ","imagedownloader",96,imagedownloader.processBA,imagedownloader.mostCurrent,21);
if (RapidSub.canDelegate("service_destroy")) { return ir.parsikhesab.pakhsh.imagedownloader.remoteMe.runUserSub(false, "imagedownloader","service_destroy");}
 BA.debugLineNum = 21;BA.debugLine="Sub Service_Destroy";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 23;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _service_start(RemoteObject _startingintent) throws Exception{
try {
		Debug.PushSubsStack("Service_Start (imagedownloader) ","imagedownloader",96,imagedownloader.processBA,imagedownloader.mostCurrent,17);
if (RapidSub.canDelegate("service_start")) { return ir.parsikhesab.pakhsh.imagedownloader.remoteMe.runUserSub(false, "imagedownloader","service_start", _startingintent);}
Debug.locals.put("StartingIntent", _startingintent);
 BA.debugLineNum = 17;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 19;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}