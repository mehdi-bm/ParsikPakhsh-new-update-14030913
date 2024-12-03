B4A=true
Group=Class
ModulesStructureVersion=1
Type=Class
Version=12.2
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

	Dim item As AdapterListCheckDaryafti
	Private LblShomareHesab As Label
	Private LblShomareDaryaft As Label
	Private LblNameSahebcheck As Label
	Private LblShobe As Label
	Private LblSharh As Label
	Dim send As Boolean
	Private btnDelete As Label
End Sub

Public Sub Initialize(mdl As Object)
	Try
		base = mdl
		Key.Initialize("Key")
		p.Initialize("")
		p.SetLayout(0,0,100%x,100%y)
		p.LoadLayout("l_rec_rizcheck")
	
	

	Catch
		MCode.SendError(LastException)
		Log(LastException)
	End Try
End Sub

Public Sub Show(Item1 As AdapterListCheckDaryafti,issend As Boolean)
	item=Item1
	If Item1.fldDateSarResid <> 0 Then
		LblDateCheck.text = "تاریخ چک: " & MCode.Sf.Mid(Item1.fldDateSarResid,1,4) & "/" & MCode.Sf.Mid(Item1.fldDateSarResid,5,2) & "/" & MCode.Sf.Mid(Item1.fldDateSarResid,7,2)
	Else
		LblDateCheck.text = "تاریخ چک: -"
	End If
	LblDateSabt.Text="تاریخ ثبت: " & MCode.Sf.Mid(Item1.fldDate,1,4) & "/" & MCode.Sf.Mid(Item1.fldDate,5,2) & "/" & MCode.Sf.Mid(Item1.fldDate,7,2)
	LblMablagh.Text="مبلغ: " & myCode.AdadToPrice(Item1.FldMablagh)
	LblShomareHesab.Text="شماره حساب: " & Item1.fldShomareHesab
	LblShomareDaryaft.Text="شماره دریافت: " & Item1.fldShomareDaryaft

	If Item1.fldNameBank<>0 Then
		LblNameBank.text = "نام بانک: " & Item1.fldNameBank
	Else
		LblNameBank.text = "نام بانک: -"
	End If

	If Item1.FldShomareCheck <> 0 Then
		LblShomareCheck.text = "شماره چک: " & Item1.FldShomareCheck
	Else
		LblShomareCheck.text = "شماره چک: -"
	End If
	LblShobe.Text="شعبه: "& Item1.fldShobe
	
	LblNameSahebcheck.Text="نام صاحب چک: "&Item1.fldNameSahebeCheck
	LblSharh.Text="شرح: "&Item1.fldSharh
	
	If issend Then
	btnDelete.Enabled=False
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
'	MCode.ShomareSabt= item.FldShomareSabt
	' TblSabt (FldShomareSabt,FldC_Visitor,FldC_Ashkhas,FldType,FldNoe,FldMablagh,FldShomareCheck,FldDateCheck,FldBankName,FldDateSabt)
'	Dim cu As Cursor=MCode.Result("select * from TblSabt where FldShomareSabt = '"& MCode.ShomareSabt &"'")
'	Act_PrintMali.Pardakhti = item.FldMablagh
'	Act_PrintMali.cu = cu
'	StartActivity(Act_PrintMali)
	
End Sub

Sub btnDelete_Click
	Log(item.ID)
	Try
		Dim result As Int
		result = Msgbox2("آیا از حذف چک مورد نظر اطمینان دارید؟", "حذف چک", "بله", "", "خیر", LoadBitmap(File.DirAssets,"icon.png"))
		If result = DialogResponse.Positive Then
			MCode.SaveUpdate("delete From TblCheckDaryafti where ID="& item.ID)
			If item.count>1 Then
				MCode.SaveUpdate("Update TblDaryaft set fldMablaghDaryafti=fldMablaghDaryafti-"&item.fldMablagh &" where fldShomareDaryaft=" &item.fldShomareDaryaft &" and fldType=2" )
				CallSubDelayed(Act_SabtRizCheck,"LoadCheck")
			Else
'				MCode.SaveUpdate("Update TblDaryaft set fldMablaghDaryafti=0 where fldShomareDaryaft=" &item.fldShomareDaryaft &" and fldType=2" )
'				CallSubDelayed(Act_SabtRizCheck,"btn_Back_Click")
				MCode.SaveUpdate("delete From TblDaryaft  where fldShomareDaryaft=" &item.fldShomareDaryaft &" and fldType=2" )
				CallSubDelayed(Act_SabtRizCheck,"btn_Back_Click")
			End If
			
		End If
	Catch
		Log(LastException)
	End Try
End Sub