B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=7.3
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: True
#End Region

Sub Process_Globals

End Sub

Sub Globals
	Dim jobInternet As HttpJob
	Private Picker As Hitex_PersianDatePicker
	Private LblMablaghKarkard As Label
	Private LblVahed As Label
	Private TxtAz As EditText
	Private TxtTa As EditText
	Dim Obj As Object
	Dim DateAz,DateTa As String
	Dim Key As IME
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Activity.LoadLayout("L_Gardesh_Visitor")
	jobInternet.Initialize("jobInternet",Me)
	LblVahed.Text = MCode.VahedPool
	Key.Initialize("Key")
End Sub

Sub DatePicker
	Picker.Initialize("Picker") _
	.setTypeFace(Typeface.LoadFromAssets("iransans_light.ttf")) _
	.TodayButton("امروز") _
	.TodayButtonVisible(True) _
	.MinYear(1400) _
	.MaxYear(1500) _
	.setActionTextColor(0xFF1F2DC9) _
	.Show
End Sub

Sub Picker_onDateSelected (Calendar As Hitex_PersianCalendar)
	Dim Month,Day As String
	
	If MCode.sf.len(Calendar.PersianMonth) = 2 Then
		Month = Calendar.PersianMonth
	Else
		Month = "0" & Calendar.PersianMonth
	End If
	
	If MCode.sf.len(Calendar.PersianDay) = 2 Then
		Day = Calendar.PersianDay
	Else
		Day = "0" & Calendar.PersianDay
	End If

	Dim Txt As EditText = Obj
	If Obj=TxtAz Then
		DateAz=Calendar.Persianyear & Month & Day
		Log(DateAz)
	Else If Obj=TxtTa Then
		DateTa=Calendar.Persianyear &  Month & Day
		Log(DateTa)
	End If
'	Txt.Text=Calendar.PersianLongDate	
	Txt.Text = Calendar.Persianyear & "/" & Month & "/" & Day
End Sub

Sub GetKarkard
	jobInternet.JobName ="GetKarkard"
	'jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetAndroid","Query=SELECT SUM(CAST(dbo.tblPishPishFaktor.fldTedadJoz AS Int) * CAST(dbo.tblPishPishFaktor.fldFeeJoz AS Int) + CAST(dbo.tblPishPishFaktor.fldTedadCarton AS Int) * CAST(dbo.tblKala.fldTedadJoz AS Int)) AS FldSumKarkard FROM  dbo.tblPishPishFaktor INNER JOIN  dbo.tblKala ON dbo.tblPishPishFaktor.fldCodeKala = dbo.tblKala.fldCodeKala WHERE (dbo.tblPishPishFaktor.fldCodeVasete = 10825)" & "&Imei=" & MCode.DeviceId)
	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetKarkard","C_Visitor=" & MCode.C_Visitor & "&Imei=" & MCode.DeviceId & "&DateAz=" & DateAz  & "&DateTa=" & DateTa)

End Sub

Sub LoadGetKarkard(Str As String)
	Dim RowsList As List
	Dim Row As Map
	MCode.Json.Initialize(Str.Trim )
	RowsList = MCode.Json.NextArray
	
	For i = 0 To RowsList.Size - 1
		Row=RowsList.Get(i)
		LblMablaghKarkard.Text = NumberFormat(Row.Get("FldSumKarkard"),0,3)
	Next
End Sub

Sub JobDone (Job As HttpJob)
	Log(Job.ErrorMessage)
	If Job.Success Then
		Dim Str As String = Job.GetString
		Select Case Job.JobName
			Case "GetKarkard"
				If Str = "No Result" Then
					ProgressDialogHide
					ToastMessageShow("شما مجاز به استفاده از نرم افزار نمی باشد",True)
				Else If Str = "0" Then
					ProgressDialogHide
					LblMablaghKarkard.Text = 0
				Else						
					LoadGetKarkard(Str)
				End If
		End Select
	Else
		ProgressDialogHide
		Msgbox ("خطا در اتصال","خطا")
	End If
	jobInternet.Release
End Sub

Sub Picker_onDisimised
	Log("Disimised")
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub Activity_KeyPress (KeyCode As Int) As Boolean 'Return True to consume the event
	If KeyCode=KeyCodes.KEYCODE_BACK Then
		Activity.Finish
		MCode.SetAnimation("zoom_enter2", "zoom_exit2")
	End If
	Return True
End Sub


Sub TxtTa_Click
	Obj=TxtTa
	DatePicker
End Sub

Sub TxtAz_Click
	Obj=TxtAz
	DatePicker
End Sub

Sub BtnGet_Click
	If MCode.Sf.Val(DateTa) < MCode.Sf.Val(DateAz) Then
		ToastMessageShow("تاریخ را صحیح وارد نمایید",True)
		Return
	End If
	If MCode.Sf.Val(DateTa) = 0 Or MCode.Sf.Val(DateAz) = 0 Then
		ToastMessageShow("تاریخ را صحیح وارد نمایید",True)
		Return
	End If
	GetKarkard
	Key.HideKeyboard
End Sub