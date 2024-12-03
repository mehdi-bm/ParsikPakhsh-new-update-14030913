B4A=true
Group=Activity
ModulesStructureVersion=1
Type=Activity
Version=12.8
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: True
#End Region

Sub Process_Globals


End Sub

Sub Globals
	Private txtAddressCompany As EditText
	Private txtCompanyName As EditText
	Private txtTellCompany As EditText
	Dim Key As IME
End Sub

Sub Activity_Create(FirstTime As Boolean)	
	Activity.LoadLayout("l_SaveInfoCompany")
	Key.Initialize("Key")
	Key.SetCustomFilter(txtTellCompany,txtTellCompany.INPUT_TYPE_NUMBERS,"0123456789")
	Key.SetLengthFilter(txtCompanyName,50)
	Key.SetLengthFilter(txtTellCompany,11)
	Key.SetLengthFilter(txtAddressCompany,200)
End Sub

Sub Activity_Resume
	Try
		Dim cu As Cursor
		cu=MCode.Result("Select FldNameCompany,FldTellCompany,FldAddressCompany from TblSetting")
		cu.Position=0
		txtCompanyName.Text=myCode.Is_Null(cu.GetString("FldNameCompany"))
		txtTellCompany.Text=myCode.Is_Null(cu.GetString("FldTellCompany"))
		txtAddressCompany.Text=myCode.Is_Null(cu.GetString("FldAddressCompany"))
	Catch
		ToastMessageShow("خطا در بارگزاری اطلاعات",True)
		Log(LastException)
	End Try
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Private Sub btnSave_Click
	Try
		MCode.SaveUpdate($"Update TblSetting set FldNameCompany='${txtCompanyName.Text}',FldTellCompany='${txtTellCompany.Text}',FldAddressCompany='${txtAddressCompany.Text}'"$)
		ToastMessageShow("اطلاعات با موفقیت ثبت گردید",True)
		Activity.Finish
	Catch
		ToastMessageShow("خطا در ثبت اطلاعات",True)
		Log(LastException)
	End Try
End Sub

Private Sub btnCancel_Click
	Activity.Finish
End Sub

Private Sub btn_Back_Click
	Activity.Finish
End Sub