B4A=true
Group=Activity
ModulesStructureVersion=1
Type=Activity
Version=9.9
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
#End Region

Sub Process_Globals

End Sub

Sub Globals

	Private RB_Manuel As RadioButton
	Private RB_auto As RadioButton
	Private RB_SendMoshtarian As RadioButton
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Activity.LoadLayout("L_SendData")

End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Sub Btn_ok_Click
	If MCode.IsConnected=False And MCode.ConnectionStatus=1 Then
		ToastMessageShow("لطفا ارتباط اینترنت گوشی خود را بررسی نمایید",False)
		Return
	End If
	Dim Date As String = MCode.ConvertNumbersPersian2English(MCode.DatePersian)
	Dim Time As String =DateTime.Time(DateTime.Now)
	Date = MCode.Sf.Mid(Date,1,4) & "/" & MCode.Sf.Mid(Date,5,2) & "/" & MCode.Sf.Mid(Date,7,2)
	Dim Dt As String = Date & "   " & Time
	MCode.SaveUpdate("Update TblSetting Set FldDateTimeSend = '"& Dt &"'")
	Dim Cu As Cursor = MCode.Result("Select * From TblFaktor Where FldSync = 'False' GROUP BY FldShomareFaktor,FldC_Tafzili")
	Dim Cu2 As Cursor = MCode.Result("Select * From TblAshkhasNew")
	If RB_auto.Checked Then
	
		If Cu.RowCount>0 Or Cu2.RowCount>0 Then
			'				Sleep(200)
'				StopService(Service_Notification)
'				ProgressDialogShow2("در حال ارسال اطلاعات . . .",False)
'				CallSubDelayed2(Service_Server,"LoadSend",0)
'				Sleep(200)
'				Dim lst As List
'				lst.Initialize
			For i=0 To Cu.RowCount-1
				Cu.Position=i
				Dim Item As AdapterSendFaktor
				Item.FldShomareFaktor=Cu.Getstring("FldShomareFaktor")
				Item.FldC_Tafzili=Cu.Getstring("FldC_Tafzili")
				Service_Server.shomareFactorSelect=Item.FldShomareFaktor
				ProgressDialogShow2("در حال ارسال اطلاعات . . .",False)
				Sleep(1000)
				CallSubDelayed2(Service_Server,"LoadSend2",Item.FldC_Tafzili)
				Sleep(1000)
			Next

			Activity.Finish
	Else
			ToastMessageShow("اطلاعات ارسال نشده موجود نمی باشد",True)
	End If
		
	else If RB_Manuel.Checked Then
		If Cu.RowCount>0 Then
		StartActivity(Act_SelFaktor)
		Activity.Finish
		Else
			ToastMessageShow("فاکتور ارسال نشده موجود نمی باشد",True)
		End If
	Else If RB_SendMoshtarian.Checked Then
		Dim Cu As Cursor = MCode.Result("Select * From TblAshkhas where FldSync='False'")
		If Cu.RowCount>0 Then
			'Sleep(200)
			StopService(Service_Notification)
			ProgressDialogShow2("در حال ارسال مشتریان جدید . . .",False)
			CallSubDelayed(Service_Server,"LoadSendAshkhasNew")
			Activity.Finish
		Else
			ToastMessageShow("مشتری جدید ارسال نشده موجود نمی باشد",True)
		End If
	Else
		ToastMessageShow("لطفا یکی از گزینه ها را انتخاب کنید.",True)
	End If
End Sub

Sub Btn_cancel_Click
	Activity.Finish
End Sub

Sub LblBack_Click
	Activity.Finish
	
End Sub

Sub btn_Back_Click
	Activity.Finish
End Sub

Sub Application_Error (Error As Exception, StackTrace As String) As Boolean
'	MCode.ScheduleRestartCrashedActivity(DateTime.Now + 300, Activity.Title, Error)
	Return True
End Sub