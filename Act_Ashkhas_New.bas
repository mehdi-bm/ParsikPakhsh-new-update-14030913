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
	Dim Key As IME
	Private MTxtName As AutoCompleteEditText
	Private MTxtTell As AutoCompleteEditText
	Private MTxtAddress As AutoCompleteEditText
End Sub

Sub Activity_Create(FirstTime As Boolean)
	 Activity.LoadLayout("l_ashkhas_new")
	 Key.Initialize("Key")
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub AcBtnSave_Click
	Dim Tm() As String
	Dim Time As String = DateTime.Time(DateTime.Now)
	'Tm = Regex.Split(":",Time)
	Time = MCode.ConvertNumbersPersian2English(Tm(0)) & MCode.ConvertNumbersPersian2English(Tm(1)) & MCode.ConvertNumbersPersian2English(Tm(2))
	Dim CodeTAfzili  As String = MCode.C_Visitor & MCode.DatePersian & Time
	If MTxtAddress.Text = "" Or MTxtName.Text = "" Or MTxtTell.Text = "" Then
		ToastMessageShow("اطلاعات را بطور کامل وارد نمایید",True)
	Else	
		MCode.SaveUpdate("Insert Into TblAshkhasNew (FldCodeTafzili,FldSharheTafzili,FldVisitor,FldTell,FldAddress) Values ('"& CodeTAfzili &"', '"& MTxtName.Text &"', '"& MCode.C_Visitor &"', '"& MTxtTell.Text &"','"& MTxtAddress.Text &"')")
		Dim Cu As Cursor = MCode.Result("select * From TblGoroohAshkhas Where FldC_Gorooh = '999'")
		If Cu.RowCount=0 Then
			MCode.SaveUpdate("Insert Into TblGoroohAshkhas (FldC_Gorooh,FldN_Gorooh) Values ('999', 'اشخاص جدید')")
		End If
		MCode.SaveUpdate("Insert Into TblAshkhas (fldCodetafzili,fldSharheTafzili,fldVisitor,fldTell,fldAdress,fldMande,fldCodeGroup,fldNameGroup) Values ('"& CodeTAfzili &"', '"& MTxtName.Text &"', '"& MCode.C_Visitor &"', '"& MTxtTell.Text &"','"& MTxtAddress.Text &"','0','999','اشخاص جدید')")
		Key.HideKeyboard
		ToastMessageShow("اطلاعات با موفقیت ثبت گردید",True)
		Activity.Finish
		MCode.SetAnimation("zoom_enter2", "zoom_exit2")
		MCode.UpdateBadge
	End If
End Sub

Sub Activity_KeyPress (KeyCode As Int) As Boolean 'Return True to consume the event
	If KeyCode=KeyCodes.KEYCODE_BACK Then
		Activity.Finish
		MCode.SetAnimation("zoom_enter2", "zoom_exit2")
	End If
	Return True
End Sub