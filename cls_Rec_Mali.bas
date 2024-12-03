B4A=true
Group=Class
ModulesStructureVersion=1
Type=Class
Version=8.8
@EndOfDesignText@
Sub Class_Globals
	Private p As Panel
	Private pnl_bk As Panel
	Private base As Object
	Private Key As IME

	Private LblDateCheck As Label
	Private LblDateSabt As Label
	Private LblMablagh As Label
	Private LblNameBank As Label
	Private LblShomareCheck As Label
	Private LblShomareSabt As Label
	Private LblTypeSabt As Label
	Private LblNoeSabt As Label
	Dim item As AdapterListSabt
End Sub

Public Sub Initialize(mdl As Object)
	Try
		base = mdl
		Key.Initialize("Key")
		p.Initialize("")
		p.SetLayout(0,0,100%x,100%y)
		p.LoadLayout("l_rec_mali")
	
	

	Catch
		MCode.SendError(LastException)
		Log(LastException)
	End Try
End Sub

Public Sub Show(Item1 As AdapterListSabt,position As Int)
	item=Item1
	If Item1.FldDateCheck <> 0 Then
		LblDateCheck.text = "تاریخ چک: " & MCode.Sf.Mid(Item1.FldDateCheck,1,4) & "/" & MCode.Sf.Mid(Item1.FldDateCheck,5,2) & "/" & MCode.Sf.Mid(Item1.FldDateCheck,7,2)
	Else
		LblDateCheck.text = "تاریخ چک: -"
	End If
	LblDateSabt.Text="تاریخ ثبت: " & MCode.Sf.Mid(Item1.FldDateSabt,1,4) & "/" & MCode.Sf.Mid(Item1.FldDateSabt,5,2) & "/" & MCode.Sf.Mid(Item1.FldDateSabt,7,2)
	LblMablagh.Text="مبلغ: " & NumberFormat(Item1.FldMablagh,1,3)
LblShomareSabt.Text="شماره ثبت: " & Item1.FldShomareSabt

	If Item1.FldBankName<>0 Then
		LblNameBank.text = "نام بانک: " & Item1.FldBankName
	Else
		LblNameBank.text = "نام بانک: -"
	End If
	
	LblNoeSabt.text = "نوع ثبت: " & Item1.FldNoe

	Select Case Item1.FldType
		Case 1
			LblTypeSabt.text = "نوع تراکنش: دریافت"
		Case 2
			LblTypeSabt.text = "نوع تراکنش: پرداخت"
End Select
	If Item1.FldShomareCheck <> 0 Then
		LblShomareCheck.text = "شماره چک: " & Item1.FldShomareCheck
	Else
		LblShomareCheck.text = "شماره چک: -"
	End If
End Sub

Public Sub getHeight As Int
	Return pnl_bk.Height
End Sub

Public Sub getPanel As Panel
	pnl_bk.RemoveView
	Return pnl_bk
End Sub



Sub btnPrint_Click
	MCode.ShomareSabt= item.FldShomareSabt
	' TblSabt (FldShomareSabt,FldC_Visitor,FldC_Ashkhas,FldType,FldNoe,FldMablagh,FldShomareCheck,FldDateCheck,FldBankName,FldDateSabt)
	Dim cu As Cursor=MCode.Result("select * from TblSabt where FldShomareSabt = '"& MCode.ShomareSabt &"'")
	Act_PrintMali.Pardakhti = item.FldMablagh
	Act_PrintMali.cu = cu
	StartActivity(Act_PrintMali)
	
End Sub

Sub btnDelete_Click
	
End Sub