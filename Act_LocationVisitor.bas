B4A=true
Group=Report
ModulesStructureVersion=1
Type=Activity
Version=8.8
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
#End Region

Sub Process_Globals
	Private rp As RuntimePermissions
	Dim Location As Location
	Dim Name As String
	
End Sub

Sub Globals
	Private gmap As GoogleMap
	Private MapFragment1 As MapFragment
	Private XUI As XUI
	Private Dialog As B4XDialog
	Private Dialog1 As B4XDialog
	Private Base As B4XView
	Private SearchTemplate As B4XSearchTemplate
	Private Panel1 As Panel

	Private BtnTa As Button
	Private Btn_SelVisitor As Button
	Dim DateTa As String
	Private pnlMap As Panel
	Private BtnCount As Button
	Dim LstLocation As List
	Private PnlTop As Panel
	Private BtnClearMap As Button
	Private btnGetLocation As Button
	Dim points As List
	Public Deghat As Double
	Private SB1 As SeekBar
	Private BtnTimeAz As Button
	Private BtnTimeTa As Button
	Dim mdtime As PersianMaterialTimePicker
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Activity.LoadLayout("l_visitorlocation")
	Base = Activity	
	LstLocation.Initialize
	SearchTemplate.Initialize
	Dialog1.Initialize (Activity)
	MCode.page="Act_LocationVisitor"
	MCode.NoeGet="GetVisitor"
	StartService(Service_Server)
	MCode.CodeVisitorSelect=0
	Location.Initialize
	points.Initialize
	SB1.Value=0
	mdtime.Initialize("mdtime",0,0,True)
End Sub


Sub LoadVisitor
	Dim Items As List
	Items.Initialize
	Dim Cu As Cursor = MCode.Result("Select * From TblVisitor ")
	For i=0 To Cu.RowCount-1
		Cu.Position=i
		Dim Name As String =  Cu.GetString("FldN_Visitor")
		Items.Add(Name)
	Next
	SearchTemplate.SetItems(Items)
	SearchTemplate.GetPanel(Dialog).BringToFront
End Sub

Sub LoadData(lst As List)
	If lst.Size>0 Then
		LstLocation=lst
		LoadMap
	End If
End Sub

Sub LoadMap
	If MCode.IsConnected=False And MCode.ConnectionStatus=1 Then
		ToastMessageShow("لطفا ارتباط اینترنت گوشی خود را بررسی نمایید",False)
		Return
	End If
	If MapFragment1.IsGooglePlayServicesAvailable = False Then
		ToastMessageShow("Please install Google Play Services.", True)
		Return
	End If
	Sleep(100)
	gmap = MapFragment1.GetMap
	rp.CheckAndRequest(rp.PERMISSION_ACCESS_FINE_LOCATION)
	Wait For Activity_PermissionResult (Permission As String, Result As Boolean)
	If Result Then
		If LstLocation.Size>0 Then
			gmap.MyLocationEnabled = True
			GetLocation
		End If
		If pnlMap.Visible=False Then
			pnlMap.Visible=True
		End If
	Else
		Log("No permission!")
	End If
	
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub Activity_KeyPress (KeyCode As Int) As Boolean 'Return True to consume the event
	If KeyCode=KeyCodes.KEYCODE_BACK Then
		Activity.Finish
	Else
		Return True
	End If
	Return True
End Sub

Private Sub mdtime_onTimeSet(hourOfday As Int,minute As Int)
	
End Sub
'Sub MapFragment1_Ready
'	Sleep(100)
'	gmap = MapFragment1.GetMap
'	rp.CheckAndRequest(rp.PERMISSION_ACCESS_FINE_LOCATION)
'	Wait For Activity_PermissionResult (Permission As String, Result As Boolean)
'	If Result Then
'		If LstLocation.Size>0 Then
'			gmap.MyLocationEnabled = True
'			GetLocation
'		End If
'		
'	Else
'		Log("No permission!")
'	End If
'End Sub



Private Sub GetLocation
	If gmap.IsInitialized Then
		Try
'			Lat = gmap.MyLocation.Latitude
'			Lon = gmap.MyLocation.Longitude
'			lbl_Location.Text = Lat & "," & Lon
			Dim Row As Map
			Dim Lat, Lon, LatMin, LatMax, LatLast As Double
			Dim strTimeAz, strTimeTa As String
		
			If Location.IsInitialized Then
				gmap.Clear
				points.Clear
				LatMin=100
				LatMax=0
				For i=0 To LstLocation.Size-1
					Row=LstLocation.Get(i)
					
					Lat = Row.Get("FldLat")
					Lon = Row.Get("FldLon")
					If Lat > LatMin And Lat < LatMax Then

					Else
						Dim Time As String= MCode.ConvertNumToTime(Row.Get("FldTime"))
						Dim Date As String= MCode.PersianDateDash(Row.Get("FldTarikh"))
						Dim llPoint As LatLng
					
						llPoint.Initialize(Lat,Lon)
						points.Add(llPoint)
						gmap.AddMarker(Lat,Lon,Time &" " & Date)
					
					
						'If i=LstLocation.Size-1 Then
						Dim cl As CameraPosition
						cl.Initialize(Lat,Lon,50)
						gmap.AnimateCamera(cl)
						'End If
					End If
					LatLast = Lat
					LatMin = LatLast - Deghat
					LatMax = LatLast + Deghat
				Next
				Dim pl As Polyline = gmap.AddPolyline
				pl.points = points
				pl.Color = Colors.Blue
				SB1.Value = BtnCount.Text
				Deghat = BtnCount.Text / 100000
				'gmap.AddPolyline
'				gmap.AddMarker(Location.Latitude,Location.Longitude,Name)
'			
'				Dim cl As CameraPosition
'				cl.Initialize(Location.Latitude,Location.Longitude,15)
'				gmap.AnimateCamera(cl)
			End If
			ProgressDialogHide
		Catch
			Log(LastException)
		End Try

	End If
End Sub


Sub BtnReport_Click	
	Try
	If	MCode.CodeVisitorSelect=0 Then
		ToastMessageShow("لطفا ویزیتور را انتخاب نمایید.",True)
		Return
	End If
	
	If  MCode.Sf.Len(BtnTa.Tag) <> 8 Then
		ToastMessageShow("تاریخ را به طور صحیح وارد نمایید",True)
		Return
	End If
	
	'HH:MM
	If MCode.Sf.Len(BtnTimeAz.Text)<>5 And MCode.Sf.Len(BtnTimeTa.Text)<>5 Then
		ToastMessageShow("ساعت را به طور صحیح وارد نمایید",True)
		Return
	End If
	
	ProgressDialogShow2("در حال دریافت اطلاعات . . .",False)
	MCode.CountShowGpsMap=BtnCount.Text
		MCode.GpsDateTa=MCode.ConvertNumbersPersian2English(DateTa)
		MCode.GpsTimeAz=BtnTimeAz.Text.Replace(":","")
		MCode.GpsTimeTa=BtnTimeTa.Text.Replace(":","")
		CallSubDelayed(Service_Server,"GetListGpsVisitor")
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-BtnReport_Click")
	End Try
End Sub



Sub BtnTa_Click
	Dim p1 As PersianMaterialDatePicker
	p1.Initialize("p1",p1.PersianYear,p1.PersianMonth,p1.PersianDay)
	p1.AccentColor = Colors.RGB(83,99,255)
	p1.OkText = "تایید"
	p1.CancelText = "لغو"
	p1.Title = "تا تاریخ"
	p1.Typeface = "iransansmobile(fanum)_bold.ttf"
	p1.Show("p1")
End Sub

Sub p1_onDateSet(year As Int,month As Int,day As Int)
	Log(year&"/"&month&"/"&day)
	BtnTa.Text=year&"/"&NumberFormat(month,2,0)&"/"&NumberFormat(day,2,0)
	BtnTa.Tag=year&NumberFormat(month,2,0)&NumberFormat(day,2,0)
'	DateTa= MPD.PersianToGregorian(year,month,day)
'	DateTa=DateTa.Replace("/","-") & " " & DateTime.Time(DateTime.Now) & ".000"
'	DateTa=NumberFormat(day,2,0)&"/"&NumberFormat(month,2,0)&"/"&year
	DateTa=year&NumberFormat(month,2,0)&NumberFormat(day,2,0)
	LogColor(DateTa,Colors.Magenta)
End Sub
Sub p1_onCancel
	Log("cancel")
End Sub
Sub p1_onDismiss
	Log("dismiss")
End Sub

Sub LblBack_Click
	Activity.Finish
End Sub

Sub Btn_SelVisitor_Click
	Dialog.Initialize (Panel1)
	Dialog.Title = "جستجو"
	Panel1.BringToFront
	Panel1.Visible=True
	SearchTemplate.SearchField.HintText="نام ویزیتور"
	SearchTemplate.SearchField.lblClear.Text=""
	SearchTemplate.SearchField.lblV.Text=""
	SearchTemplate.SearchField.Update
	Dim rs As Object = Dialog.ShowTemplate(SearchTemplate, "", "", "انصراف")
	AnimateDialog(Dialog, "right")
	Wait For (rs) Complete (Result As Int)
	If Result = XUI.DialogResponse_Positive Then
		Btn_SelVisitor.Text = SearchTemplate.SelectedItem
		Dim Cu As Cursor = MCode.Result("Select * From TblVisitor where FldN_Visitor='"&Btn_SelVisitor.Text&"'")
		Cu.Position=0
		MCode.CodeVisitorSelect =  Cu.GetString("FldC_Visitor")
		Log("کد ویزیتور : "&Cu.GetString("FldC_Visitor"))
	Else
		Btn_SelVisitor.Text = "انتخاب ویزیتور"
		MCode.CodeVisitorSelect=0
	End If
	Panel1.Visible=False
End Sub
Sub AnimateDialog (dlg As B4XDialog, FromEdge As String)
	Dim Base As B4XView = dlg.Base
	Dim top As Int = Base.Top
	Dim left As Int = Base.Left
	Select FromEdge.ToLowerCase
		Case "bottom"
			Base.Top = Base.Parent.Height
		Case "top"
			Base.Top = -Base.Height
		Case "left"
			Base.Left = -Base.Width
		Case "right"
			Base.Left = Base.Parent.Width
	End Select
	Base.SetLayoutAnimated(300, left, top, Base.Width, Base.Height)
End Sub

Sub btn_Back_Click
	Activity.Finish
End Sub

Sub BtnCount_Click
	Try		
		Dim input As B4XInputTemplate
		input.Initialize
		input.lblTitle.Text = "تعداد نقطه ها:"
		input.ConfigureForNumbers(True, True)
		Dim rs As ResumableSub = Dialog1.ShowTemplate(input, "OK", "", "CANCEL")
		Dialog1.Base.Top = 50%y - Dialog1.Base.Height / 2
		Wait For (rs) Complete (Result As Int)
		If Result = XUI.DialogResponse_Positive Then
			If input.Text="" Then input.Text=0
			Dim res As Int = input.Text 'no need to check with IsNumber
			BtnCount.Text=res
		End If
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-BtnCount_Click")		
	End Try
End Sub

Private Sub btnGetLocation_Click
	Try
		If	MCode.CodeVisitorSelect=0 Then
			ToastMessageShow("لطفا ویزیتور را انتخاب نمایید.",True)
			Return
		End If
		ProgressDialogShow2("در حال دریافت اطلاعات . . .",False)
		MCode.CountShowGpsMap=0
		MCode.GpsDateTa=0
		MCode.GpsTimeAz=0
		MCode.GpsTimeTa=0
		CallSubDelayed(Service_Server,"GetListGpsVisitor")
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-btnGetLocation_Click")
	End Try
	
End Sub

Private Sub BtnClearMap_Click
	If gmap.IsInitialized And Location.IsInitialized Then
	gmap.Clear
	points.Clear
	End If
End Sub

Private Sub SB1_ValueChanged (Value As Int, UserChanged As Boolean)
	If UserChanged Then
		BtnCount.Text=SB1.Value
		Deghat=SB1.Value/100000
	End If
	
	SB1.Max = 200
	If BtnCount.Text = "" Then
		BtnCount.Text = 1
	End If
	If BtnCount.Text <= 200 And BtnCount.Text >= 1 Then
		SB1.Value = BtnCount.Text
		Deghat = SB1.Value / 100000
	Else
		ToastMessageShow("لطفا مقداری بین 1 تا 200 را وارد نمایید",False)
		BtnCount.Text = 200
	End If
End Sub



Private Sub BtnTimeAz_Click
	Dim t1 As PersianMaterialTimePicker
	t1.Initialize("t1",t1.Hour,t1.Minute,True)
	t1.AccentColor = Colors.RGB(83,99,255)
	t1.OkText = "تایید"
	t1.CancelText = "لغو"
	t1.Title = "از ساعت"
	t1.Typeface = "iransansmobile(fanum)_bold.ttf"
	t1.Show("t1")
End Sub
Private Sub t1_onCancel
	Log("cancel")
End Sub
Private Sub t1_onDismiss
	Log("dismiss")
End Sub
Private Sub t1_onTimeSet(hourOfday As Int,minute As Int)
	Log("time1 : "&hourOfday&":"&minute)
'	BtnTimeAz.Text=hourOfday&":"&minute
'	Dim time As String=hourOfday&":"&minute
	BtnTimeAz.Text=MCode.ConvertNumToTime2(hourOfday,minute)
End Sub

Private Sub BtnTimeTa_Click
	Dim t2 As PersianMaterialTimePicker
	t2.Initialize("t2",t2.Hour,t2.Minute,True)
	t2.AccentColor = Colors.RGB(83,99,255)
	t2.OkText = "تایید"
	t2.CancelText = "لغو"
	t2.Title = "تا ساعت"
	t2.Typeface = "iransansmobile(fanum)_bold.ttf"
	t2.Show("t2")
End Sub
Private Sub t2_onCancel
	Log("cancel")
End Sub
Private Sub t2_onDismiss
	Log("dismiss")
End Sub
Private Sub t2_onTimeSet(hourOfday As Int,minute As Int)
	Log("time2 : "&hourOfday&":"&minute)
'	BtnTimeTa.Text=hourOfday&":"&minute
'	Dim time As String=hourOfday&""&minute
	BtnTimeTa.Text=MCode.ConvertNumToTime2(hourOfday,minute)
End Sub
Sub Application_Error (Error As Exception, StackTrace As String) As Boolean
'	MCode.ScheduleRestartCrashedActivity(DateTime.Now + 300, Activity.Title, Error)
	Return True
End Sub
