B4A=true
Group=Services
ModulesStructureVersion=1
Type=Receiver
Version=13
@EndOfDesignText@
Sub Process_Globals
	Private rv As RemoteViews
	Dim jobInternet As HttpJob
	Dim t1 As Timer
End Sub

'Called when an intent is received. 
'Do not assume that anything else, including the starter service, has run before this method.
Private Sub Receiver_Receive (FirstTime As Boolean, StartingIntent As Intent)
	If FirstTime Then
		rv = ConfigureHomeWidget("L2", "rv", 30, "ParsikGps Widget",True)
		
	End If
	MCode.widgetEnable=rv.HandleWidgetEvents(StartingIntent)
	Log("recever")
	jobInternet.Initialize("jobInternet",Me)
	jobInternet.GetRequest.Timeout=50000
	t1.Initialize("t1", 10000)
	t1.Enabled = True
	StartServiceAt(FusedLocationService,DateTime.Now+1000,True)
End Sub
Sub t1_Tick
	rv.SetText("Label2", Application.LabelName)
	
	
	
'	Dim Cu As Cursor = MCode.Result("Select * From TblGpsVisitor")
'	If Cu.RowCount > 0 Then
'		'SendGps(MCode.DtToJson(Cu))
'		Cu.Position=0
'	FldTime,FldLat,FldLon
	rv.SetText("Label3","طول جغرافیایی : "& MCode.fusLat)
	rv.SetText("Label7","عرض جغرافیایی : "& MCode.fusLon)
	
	rv.SetText("Label6","آخرین ساعت ارسال موقعیت : " & MCode.fusGetTime)
		
	Log("SendGps")
'	End If
	StartServiceAt(FusedLocationService,DateTime.Now+1000,True)
	rv.UpdateWidget
	
	Log("UpdateWidget1")
End Sub

Sub SendGps(Str As String)
'	ToastMessageShow("Sending",True)
'	Dim Cu As Cursor = MCode.Result("Select FldUrl From TblSetting")
'	Cu.Position=0
'	Dim Url As String = Cu.GetString("FldUrl")
	jobInternet.JobName ="SendGps"
	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/SaveGps","JsonDt=" & Str & "&Imei=" & MCode.DeviceId)
End Sub

Private Sub rv_RequestUpdate
	t1.Initialize("t1", 10000)
	t1.Enabled = True
	Log("UpdateWidget2")
	StartServiceAt(FusedLocationService,DateTime.Now+1000,True)
End Sub

Sub JobDone (Job As HttpJob)
	Job.GetRequest.Timeout=50000
'	ToastMessageShow("JobDone",True)
	If Job.Success Then
		Dim Str As String = Job.GetString
		Select Case Job.JobName
			Case "SendGps"
				If Str = "No Result" Then
'					ToastMessageShow("خطا در ارسال",True)
				Else
					MCode.SaveUpdate("Delete From TblGpsVisitor")
					Log("GPS OK")
'					ToastMessageShow("Send End",True)
				End If
		End Select
	Else
'		ToastMessageShow("خطا در اتصال",True)
	End If
	jobInternet.Release
End Sub

Private Sub ImageView1_Click
	StartActivity(Act_Main)
End Sub

Private Sub Label5_Click
	If MCode.Vaziat=0 Then
		ToastMessageShow("نرم افزار شما غیر فعال میباشد",True)
		Return
	End If
	If	MCode.Visitor="0" Then
		ToastMessageShow("این بخش مربوط به نسخه ویزیتور می باشد ، در صورت نیاز به فعالسازی و استفاده از این بخش با واحد مشاوره و فروش مربوطه تماس حاصل فرمایید",True)
		Return
	End If
	Dim Cu As Cursor
	Cu=MCode.Result("Select * From TblSetting")
	Cu.Position=0
	Log(Cu.GetString("FldC_Visitor"))
	If Cu.GetString("FldC_Visitor") = "کد ویزیتور" Then
		ToastMessageShow("ابتدا دریافت اطلاعات بزنید بعد به این بخش مراجعه نمائید",True)
		Return
	End If
	If MCode.C_Visitor="کد ویزیتور"  Then
		ToastMessageShow("ابتدا دریافت اطلاعات را انجام دهید",True)
		Return
	End If
	If MCode.C_Visitor.Length<5 Then
		ToastMessageShow("کد ویزیتور شما صحیح نیست",True)
		Return
	End If
'		Cu=MCode.Result("Select * From TblAshkhas")
'		If Cu.RowCount=0 Then
'			ToastMessageShow("مسیری برای شما تعریف نشده است",True)
'			Return
'		End If
	Cu=MCode.Result("Select * From TblKala")
	If Cu.RowCount=0 Then
		ToastMessageShow("لیست کالا به درستی دریافت نشده است",True)
		Return
	End If
	Cu=MCode.Result("Select * From TblGoroohKala")
	If Cu.RowCount=0 Then
		ToastMessageShow("جدول گروه کالا به درستی دریافت نشده است",True)
		Return
	End If
	Cu=MCode.Result("Select * From TblTasvie")
	If Cu.RowCount=0 Then
		ToastMessageShow("جدول تسویه حساب به درستی دریافت نشده است",True)
		Return
	End If
	'MCode.page = "Act_SelectMantage"
	MCode.Action="SabtFaktor"
	StartActivity(Act_KalaDefault)
End Sub

Private Sub Label1_Click
	If MCode.Vaziat=0 Then
		ToastMessageShow("نرم افزار شما غیر فعال میباشد",True)
		Return
	End If
	If MCode.C_Visitor="کد ویزیتور"  Then
		ToastMessageShow("ابتدا دریافت اطلاعات را انجام دهید",True)
		Return
	End If
	If MCode.C_Visitor.Length<5 Then
		ToastMessageShow("کد ویزیتور شما صحیح نیست",True)
		Return
	End If
	MCode.page = "Act_Moshtarian"
	Dim Cu As Cursor
	Cu=MCode.Result("Select * From TblSetting")
	Cu.Position=0
	Log(Cu.GetString("FldC_Visitor"))
	If Cu.GetString("FldC_Visitor") = "کد ویزیتور" Then
		ToastMessageShow("ابتدا دریافت اطلاعات بزنید بعد به این بخش مراجعه نمائید",True)
		Return
	End If
	StartActivity(Act_SelectMantage)
End Sub

Private Sub Label4_Click
	


	If MCode.Vaziat=0 Then
		ToastMessageShow("نرم افزار شما غیر فعال میباشد",True)
		Return
	End If
	Dim Cu As Cursor
	Cu=MCode.Result("Select * From TblSetting")
	Cu.Position=0
	Log(Cu.GetString("FldC_Visitor"))
	If Cu.GetString("FldC_Visitor") = "کد ویزیتور" Then
		ToastMessageShow("ابتدا دریافت اطلاعات بزنید بعد به این بخش مراجعه نمائید",True)
		Return
	End If
	If MCode.C_Visitor.Length<5 Then
		ToastMessageShow("کد ویزیتور شما صحیح نیست",True)
		Return
	End If
	MCode.UpdateShakhs=False
	StartActivity(Act_NewAshkhas)
	
	
End Sub
