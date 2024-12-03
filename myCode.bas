B4A=true
Group=Class
ModulesStructureVersion=1
Type=StaticCode
Version=7.3
@EndOfDesignText@
'ماژول توابع اختصاصی
#IgnoreWarnings:12

Sub Process_Globals
	Dim b64 As StringUtils
	
End Sub

#Region Persian Date


Sub gregorian_to_jalali(dt As String) As String
  Dim g_y,g_m,g_d As String
  Dim gy,gm,gd,g_day_no As Int
  Dim k() As String 
  k = Regex.Split("/",dt)
  g_y = k(0)
  g_m = k(1)
  g_d = k(2)
  Dim g_days_in_month(12) As Int 
  Dim j_days_in_month(12) As Int
  g_days_in_month(0) = 31
  g_days_in_month(1) = 28
  g_days_in_month(2) = 31
  g_days_in_month(3) = 30
  g_days_in_month(4) = 31
  g_days_in_month(5) = 30
  g_days_in_month(6) = 31
  g_days_in_month(7) = 31
  g_days_in_month(8) = 30
  g_days_in_month(9) = 31
  g_days_in_month(10)= 30
  g_days_in_month(11)= 31
  
  j_days_in_month(0) = 31
  j_days_in_month(1) = 31
  j_days_in_month(2) = 31
  j_days_in_month(3) = 31
  j_days_in_month(4) = 31
  j_days_in_month(5) = 31
  j_days_in_month(6) = 30
  j_days_in_month(7) = 30
  j_days_in_month(8) = 30
  j_days_in_month(9) = 30
  j_days_in_month(10)= 30
  j_days_in_month(11)= 29
  
  gy = g_y - 1600
  gm = g_m - 1
  gd = g_d - 1
  
  g_day_no = 365 * gy + ((gy + 3) / 4) - ((gy + 99) / 100) + ((gy + 399) / 400)
  
  For i = 0 To gm - 1
    g_day_no = g_day_no + g_days_in_month(i)
  Next

  
  
  If gm > 1 And ((gy Mod 4 = 0 And gy Mod 100 <> 0) Or (gy Mod 400 = 0)) Then
    g_day_no = g_day_no + 1
  End If

 
  g_day_no = g_day_no + gd

  Dim j_day_no,j_np,jy As Int 
  
  j_day_no = g_day_no - 79
  
  j_np = (j_day_no / 12053)
  j_day_no = j_day_no Mod 12053
    
  jy = 979 + 33 * j_np + 4 * (j_day_no / 1461)
  
  j_day_no = j_day_no Mod 1461
  
  
  
  If (j_day_no >= 366) Then
    jy = jy + ((j_day_no - 1) / 365)
    j_day_no = (j_day_no - 1) Mod 365
  End If
  
 i = 0
 Do While (i < 11 And j_day_no >= j_days_in_month(i))
    j_day_no = j_day_no - j_days_in_month(i)
    i = i + 1
 Loop
  
  Dim jm,jd As Int 
  jm = i + 1
  jd = j_day_no + 1
  Dim res As String 
	res = jy & "/" & jm & "/" & jd
	Return res
End Sub

Sub between(t1 As Long,t2 As Long) As String
	Dim t As Long=Abs(t1-t2)
	Dim days, hours, minutes As Int
	days = Floor(t / DateTime.TicksPerDay)
	hours = Floor((t Mod DateTime.TicksPerDay) / DateTime.TicksPerHour)
	minutes = Floor((t Mod DateTime.TicksPerHour) / DateTime.TicksPerMinute)

	Return days&"روز و "&hours&"ساعت و "&minutes&"دقیقه "
End Sub
#End Region

#Region Setting

Sub setSetting(sFilename As String,sKey As String,sValue As String)
	Dim m1 As Map
	m1.Initialize
	If File.Exists(File.DirInternalCache,sFilename) = True Then
	 m1 = File.ReadMap(File.DirInternalCache,sFilename)
	End If
	m1.Put(sKey,b64.EncodeBase64(sValue.GetBytes("UTF8")))
	File.WriteMap(File.DirInternalCache,sFilename,m1)
End Sub

Sub getSetting(sFilename As String,sKey As String,sDefault As String) As String
	Dim m1 As Map
	m1.Initialize
	If File.Exists(File.DirInternalCache,sFilename) = True Then
	  m1 = File.ReadMap(File.DirInternalCache,sFilename)
	Else
	  Return sDefault
	End If
	If m1.ContainsKey(sKey) = True Then
		Return BytesToString( b64.DecodeBase64(m1.get(sKey)),0,b64.DecodeBase64(m1.get(sKey)).length,"UTF-8")
	Else
	 Return sDefault
	End If
End Sub

Sub removeSetting(sFilename As String,sKey As String) As String
	Dim m1 As Map
	m1.Initialize
	If File.Exists(File.DirInternalCache,sFilename) = True Then
		m1 = File.ReadMap(File.DirInternalCache,sFilename)
	Else
		Return ""
	End If
	If m1.ContainsKey(sKey) = True Then
		m1.Remove(sKey)
		File.WriteMap(File.DirInternalCache,sFilename,m1)
	Else
		Return ""
	End If
	Return ""
End Sub

#End Region

Sub GetByteFromBitmap(img As Bitmap, Quality As Int) As Byte()
	Dim out As OutputStream
	Dim data() As Byte
	out.InitializeToBytesArray(1)
	img.WriteToStream(out,Quality,"JPEG")
	data = out.ToBytesArray
	out.Close
	Return data
End Sub

Sub SetAnimation(InAnimation As String, OutAnimation As String)
	Dim r As Reflector
	Dim package As String
	Dim in, out As Int
	package = r.GetStaticField("anywheresoftware.b4a.BA", "packageName")
	in = r.GetStaticField(package & ".R$anim", InAnimation)
	out = r.GetStaticField(package & ".R$anim", OutAnimation)
	r.Target = r.GetActivity
	r.RunMethod4("overridePendingTransition", Array As Object(in, out), Array As String("java.lang.int", "java.lang.int"))
End Sub

Sub DeleteCash
'	For i=0 To 19
'		If File.Exists( Starter.SharedFolder,"event"&i&".jpg") Then
'			File.Delete( Starter.SharedFolder,"event"&i&".jpg")
'		End If
'	Next
End Sub

Sub SetStatusBarColor(clr As Int)
	Dim p As Phone
	If p.SdkVersion >= 21 Then
		Dim jo As JavaObject
		jo.InitializeContext
		Dim window As JavaObject = jo.RunMethodJO("getWindow", Null)
		window.RunMethod("addFlags", Array (0x80000000))
		window.RunMethod("clearFlags", Array (0x04000000))
		window.RunMethod("setStatusBarColor", Array(clr))
	End If
End Sub

Public Sub Is_int(data As String) As Int
	Try
		If IsNumber(data) And data<>Null Then
			Dim n As Int=data
			Return n
		Else
			Return 0
		End If
	Catch
		Return 0
		Log(LastException)
	End Try

End Sub
Public Sub Check_Is_Null(data As String) As Boolean
		If (data=Null Or data="null") Then
			Return True
		Else
			Return False
		End If
End Sub
Public Sub Is_Null(data As String) As String
	Try
		If (data=Null Or data="null") Then
			Return ""
		Else
			Return data
		End If
	Catch
		Return ""
	End Try
End Sub

Public Sub Is_Null_adad(data As String) As String
	Try
		If (data=Null Or data="null" Or data="" Or IsNumber(data)=False) Then
			Return 0
		Else
			Return data
		End If
	Catch
		Return 0
	End Try
End Sub

Public Sub Is_Null_Price(data As String) As String
	Try
		If (data=Null Or data="null" Or data="" Or IsNumber(data)=False) Then
			Return 0
		Else
			Return NumberFormat(data,1,3) 
		End If
	Catch
		Return 0
	End Try
End Sub

Public Sub Check_Null_or_NotNumber(data As String) As Boolean
		If (data=Null Or IsNumber(data)=False) Then
			Return False
		Else
			Return True
		End If
End Sub
'Public Sub TextBoxBackColorWhite(txt As EditText)
'	Dim M2 As Amir_ViewManager
'	M2.Initialize(txt)
'	M2.Radius=10
'	M2.BackgroundColor=Colors.White
'	M2.BackgroundPressedColor=Colors.White
'	M2.TextColor=Colors.Black
'	M2.TextEnabledColor=Colors.Black
'	M2.TextPressedColor=Colors.Black
'	M2.Start
'End Sub
'Public Sub TextBoxBackColorWhite1(txt As EditText)
'	Dim M2 As Amir_ViewManager
'	M2.Initialize(txt)
'	M2.Radius=10
'	M2.StrokeColor=Colors.DarkGray
'	M2.StrokeWidth=2
'	
'	M2.BackgroundColor=Colors.White
'	M2.BackgroundPressedColor=Colors.White
'	M2.TextColor=Colors.Black
'	M2.TextEnabledColor=Colors.Black
'	M2.TextPressedColor=Colors.Black
'	M2.Start
'End Sub
Public Sub SaveObject(datesList As List,ListName As String)
	If datesList.IsInitialized=False Then
		datesList.Initialize
		datesList.Clear
	End If
	Dim DatesFile As RandomAccessFile
	DatesFile.Initialize(File.DirDefaultExternal, ListName & ".dat",False)
	DatesFile.WriteObject(datesList,True,0)
	DatesFile.Close
	Log(ListName &"==="& datesList.Size)
End Sub
Public Sub ReadObject(ListName As String) As List
	Dim datesList As List
	datesList.Initialize
	Try
		Dim DatesFile As RandomAccessFile
		DatesFile.Initialize(File.DirDefaultExternal, ListName & ".dat",False)
		datesList = DatesFile.ReadObject(0)
		DatesFile.Close
		Log(ListName &"===>>"& datesList.Size)
		Return datesList
	Catch
		datesList.Clear
		Return datesList
	End Try
	
End Sub
Public Sub DownloadImage(Link As String,ph As ImageView)
	Dim Glide As Hitex_Glide
	
	Glide.Get.ClearDiskCache
	Glide.Get.ClearMemory
	Dim LowerCaseLink As String = Link.ToLowerCase
	If LowerCaseLink.Contains("jpg") Or LowerCaseLink.Contains("jpeg") Or LowerCaseLink.Contains("png") Then
	Else
		
		'Link = File.Combine(File.DirAssets,"ICON.png")
		
	End If
	ph.Tag=Null
	Log("show= " & Link)
	
'		Glide.Load2(Link).Apply(Glide.RO.FitCenter).Into(ph)
'		Glide.Load2(Link).Apply(Glide.RequestOptions.Placeholder(MCode.ImgNothing).SkipMemoryCache(True)).Into(ph)
	Glide.Load2(Link).Apply(Glide.RequestOptions.Placeholder(MCode.placeHolder)).Apply(Glide.RO.FitCenter).Into(ph)

End Sub
Public Sub DownloadImage5(CodeKala As String,fldPathPic As String,ph As ImageView)
	Dim Link As String
	Log("CodeKala "& CodeKala)
	If MCode.PicOnline=1 Then
'			ImageRow.Bitmap=Null
		Dim filename As String=CodeKala & ".jpg"
		If fldPathPic="0" Then
				
		
			If File.Exists(File.DirDefaultExternal&"/Parsik/AksKala",filename) Then
				File.Delete(File.DirDefaultExternal&"/Parsik/AksKala",filename)
			End If
			MCode.placeHolder=MCode.GetPicKala(CodeKala)
			ph.Bitmap=MCode.placeHolder
		Else
			If MCode.IsConnected Then
				If File.Exists(File.DirDefaultExternal&"/Parsik/AksKala",filename)=True Then
					MCode.placeHolder=MCode.GetPicKala(CodeKala)
					ph.Bitmap=MCode.placeHolder
					Return
				End If
				'ImageRow.Bitmap=Null
'					MCode.placeHolder=MCode.GetPicKala(Item.CodeKala)
'					ImageRow.Bitmap=MCode.placeHolder
				Link=MCode.ImageUrl &fldPathPic
				Log("Link= " & MCode.ImageUrl & fldPathPic)
				
				Dim links As Map
				links.Initialize
				links.Put(ph, Link)
				MCode.CodeKalaImage=CodeKala
				CallSubDelayed2(ImageDownloader, "Download", links)
				MCode.placeHolder=MCode.GetPicKala(CodeKala)
				ph.Bitmap=MCode.placeHolder
			Else
				MCode.placeHolder=MCode.GetPicKala(CodeKala)
				ph.Bitmap=MCode.placeHolder
			End If
		
		End If
	Else
		MCode.placeHolder=MCode.GetPicKala(CodeKala)
		ph.Bitmap=MCode.placeHolder
	End If
End Sub
Public Sub DownloadImage2(Link As String,ph As ImageView)
'	Dim Glide As Hitex_Glide
	Dim pic As Picasso
'	Glide.Get.ClearDiskCache
'	Glide.Get.ClearMemory

	ph.Tag=Null
	Log("show= " & Link)
	
	pic.Initialize
	pic.LoadUrl(Link).IntoImageView(ph)
	
	
'		Glide.Load2(Link).Apply(Glide.RO.FitCenter).Into(ph)
'		Glide.Load2(Link).Apply(Glide.RequestOptions.Placeholder(MCode.ImgNothing).SkipMemoryCache(True)).Into(ph)
'	Glide.Load2(Link).Apply(Glide.RequestOptions.Placeholder(MCode.placeHolder)).Apply(Glide.RO.FitCenter).Into(ph)

	
End Sub

Public Sub DownloadImage3(Link As String) As ImageView
	Dim Glide As Hitex_Glide
	Dim ph As ImageView
	ph.Initialize("ph")
'	Glide.Get.ClearDiskCache
'	Glide.Get.ClearMemory
	Dim LowerCaseLink As String = Link.ToLowerCase
	If LowerCaseLink.Contains("jpg") Or LowerCaseLink.Contains("jpeg") Or LowerCaseLink.Contains("png") Then	
		ph.Tag=Null
		Log("show= " & Link)
		Glide.Load2(Link).Apply(Glide.RequestOptions).Apply(Glide.RO.FitCenter).Into(ph)
	End If
	Return ph
End Sub

Public Sub GetNameTafsiliByCode(code As String)As String
	Dim name As String
	name=MCode.SingleResult("select fldSharheTafzili from TblAshkhas where fldCodetafzili="&code)
	Return name
End Sub

Public Sub GetPathPicByCodeKala(CodeKala As String) As String
	Try
		If File.Exists(File.DirDefaultExternal &"/Parsik/AksKala",CodeKala &".jpg") Then
			Dim path As String=File.Combine(File.DirDefaultExternal &"/Parsik/AksKala",CodeKala &".jpg")
			Return path
			Else
			Return "0"
		End If
	
	Catch
		Log(LastException)
		Return "0"
	End Try
End Sub

Public Sub ToInt(obj As Object) As Int
	Dim num As Int
	num=obj
	Return num
End Sub

Public Sub SendError(message As String,action As String)
	If MCode.IsConnected Then
	Dim DateMiladi As String = MCode.ConvertNumbersPersian2English(DateTime.Date(DateTime.Now))
	Dim Time As String = DateTime.Time(DateTime.Now)
	Dim item As AdapterAndroidLog
'	Dim stackTrace As String
''		stackTrace = GetJavaStackTrace(LastException)
'	Dim jo As JavaObject
'	jo.InitializeContext
'	stackTrace=jo.RunMethod("GetJavaStackTrace",Array As Object(LastException))
'	Log(stackTrace)
		item.Initialize
		item.date=MCode.ConvertNumbersPersian2English(MCode.DatePersian)
		item.time=MCode.ConvertNumbersPersian2English(Time)
		item.message=message
		item.Action=action
	CallSubDelayed2(Service_Server,"SaveAndroidLog",item)
	Sleep(200)
		'CloseActivities
	Else
'		ToastMessageShow("خطایی رخداد لطفا با پشتیبانی تماس بگیرید",False)
	End If
End Sub

Sub CloseActivities
	Dim jo As JavaObject
	jo.InitializeContext
	jo.RunMethod("finishAffinity", Null)
End Sub

Public Sub IsNullOrWhiteSpace(Str As String) As Boolean
	Dim b As Boolean=False
	b=IIf(Str=Null,True,False)
	b=IIf(Str="",True,False)
	b=IIf(Str=" ",True,False)
	Return b
End Sub

Public Sub AdadToPrice(str As String) As String
	Dim result As String
	If IsNumber(str) And str>0 Then
		result=NumberFormat2(str,0,0,0,True)&" "&MCode.VahedPool
		Else
		result=0
	End If
	Return result
End Sub

