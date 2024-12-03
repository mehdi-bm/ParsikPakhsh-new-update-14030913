B4A=true
Group=Class
ModulesStructureVersion=1
Type=Class
Version=10
@EndOfDesignText@
Sub Class_Globals
	Private p As Panel
	Private pnl_bk As Panel
	Private LblVisit As Label
	Private LblKharid As Label
	Private LblLastSefaresh As Label
	Private LblLastVisit As Label
	Private LblAddress As Label
	Private LblN_Ashkhas As Label
	Private LblC_Ashkhas As Label
	Private OpCol1 As ColorDrawable
	Private OpCol2 As ColorDrawable
	Private shakhs As AdapterListAshkhas
	Private Panel1 As Panel
'	Private LblC_Ashkhas_C As Label
	Private LblMande As Label
	Private LblMovaghat As Label
	Private LblEdit As Label
	Private LblDelete As Label
	Private LblSend As Label
	Private LblBlackList As Label
	Private LblMandeEtebar As Label

End Sub

Public Sub Initialize
	p.Initialize("")
	p.SetLayout(0,0,100%x,100%y)
	p.LoadLayout("L_RecAshkhas")
	Dim op As ColorDrawable
	op.Initialize2(Colors.White,8dip,2dip,Colors.Black)
	OpCol1.Initialize2(Colors.RGB(255,106,106),5dip,1dip,Colors.Black)
	OpCol2.Initialize2(Colors.RGB(213,213,0),5dip,1dip,Colors.Black)
End Sub

Public Sub show(item As AdapterListAshkhas,date As String)
	shakhs=item
	LblN_Ashkhas.Text ="نام:"& item.SharhTafzili
'	LblC_Ashkhas.Text ="کد:"& item.FldC_Ashkhas
	
	If item.CodeTafzili <> Null  Then
		LblC_Ashkhas.Text ="کد:"& item.CodeTafzili
	Else
		LblC_Ashkhas.Text ="کد:"
	End If
	
	If item.fldBlackList=1 Then
		LblBlackList.Visible=True
	Else
		LblBlackList.Visible=False
	End If
'	Select Case MCode.showbedehkaran
'		Case "0"
'			LblMande.Text =""
'		Case "1"
			If myCode.Is_Null(item.Mande)="" Or item.Mande=""  Then item.Mande = 0
			  If item.Mande=0 Then
		LblMande.TextColor=Colors.Black
		LblMande.Text ="مانده حساب: "&item.Mande
		LblMandeEtebar.Text="مانده اعتبار: "&myCode.AdadToPrice(item.fldSaghfeEtebar)
			else If item.Mande>0 Then
		LblMande.TextColor=Colors.red
				LblMande.Text ="مانده حساب: "& NumberFormat( Abs(item.Mande),1,3) & " بد"
		Dim mande As String=myCode.Is_Null_adad(item.Mande)
		LblMandeEtebar.Text="مانده اعتبار: "&myCode.AdadToPrice(item.fldSaghfeEtebar - mande)
			Else if item.Mande<0 Then
		LblMande.TextColor= Colors.RGB(10,176,0)
				LblMande.Text ="مانده حساب: "& NumberFormat( Abs(item.Mande),1,3) & " بس"
		
		LblMandeEtebar.Text="مانده اعتبار: "&myCode.AdadToPrice(item.fldSaghfeEtebar)
			End If
'	End Selectb

	
	
	LblAddress.text ="آدرس: "& item.Address
	LblAddress.Typeface=MCode.Font2
'	If  item.FldLastVisit.Length=0 Then item.FldLastVisit = ""
'	LblLastVisit.text ="آخرین ویزیت : "& MCode.Sf.Mid(item.FldLastVisit,1,4) & "/" & MCode.Sf.Mid(item.FldLastVisit,5,2) & "/" & MCode.Sf.Mid(item.FldLastVisit,7,2)
	Dim lastVisit As String = myCode.Is_Null(item.lastSeen)
	If lastVisit.Length = 0 Then
		LblLastVisit.Text="//"
	Else
		Dim Str As List
		Str.Initialize
		Str = MCode.Sf.Split(lastVisit.Replace("-","/"),"T")

		Dim DT As List = MCode.Sf.Split(Str.get(0),"/")
		'LogColor(lastVisit & "==>" & DT.Get(0) & "--" & DT.Get(1) & "--" & DT.Get(2),Colors.Green)
		Log(DT.Get(0))

'		Dim lastVisitDate As String = MCode.PersianDate.getDate(DT.Get(0),DT.Get(1),DT.Get(2),"/")
		Dim lastVisitDate As String =MCode.PersianDateDash(DT.Get(0))
		Dim lastVisitTime As String = Str.get(1)
		LblLastVisit.Text=lastVisitDate & CRLF & lastVisitTime
	End If
	
	If item.CodeTafzili.Length>5 Then
			LblMovaghat.Visible=True
		Dim DateTimeLastSefaresh As String = myCode.Is_Null(item.lastOrderDate)
		Dim countSefaresh As Long=myCode.Is_Null_adad(MCode.SingleResult("Select Count(FldId) From TblFaktor where FldC_Tafzili='"&item.CodeTafzili &"'"))
		If countSefaresh>0 And item.FldSync<>"True" Then
			LblDelete.Visible=False
			Else
			LblDelete.Visible=True
		End If
		
			If item.FldSync="True" Then
				LblSend.Visible=True
				LblEdit.Visible=False				
			Else
				LblSend.Visible=False
			
				LblEdit.Visible=True			
			End If
		Else
			LblMovaghat.Visible=False
			LblEdit.Visible=False
			LblDelete.Visible=False
		LblSend.Visible=False
	End If
	
'	If  item.FldLastSefaresh = "" Then item.FldLastSefaresh = ""
'	LblLastSefaresh.text ="آخرین خرید : "& MCode.Sf.Mid(item.FldLastSefaresh,1,4) & "/" & MCode.Sf.Mid(item.FldLastSefaresh,5,2) & "/" & MCode.Sf.Mid(item.FldLastSefaresh,7,2)
	Dim DateTimeLastSefaresh As String = myCode.Is_Null(item.lastOrderDate)
	If DateTimeLastSefaresh.Length = 0 Then
		LblLastSefaresh.Text="//"
	Else
		Dim Str As List
		Str.Initialize
		Str = MCode.Sf.Split(DateTimeLastSefaresh.Replace("-","/"),"T")
			
		Dim DT As List = MCode.Sf.Split(Str.get(0),"/")
		Dim LastSefareshDate As String = MCode.PersianDateDash(DT.Get(0))
		Dim LastSefareshTime As String = Str.get(1)
		LblLastSefaresh.Text=LastSefareshDate & CRLF & LastSefareshTime
	End If
	
	
'	If item.FldLastSefaresh=date Then
'		LblKharid.Text= "سفارش داده"
'		LblKharid.Background=OpCol2
'	Else
'		LblKharid.Text= "سفارش نداده"
'		LblKharid.Background=OpCol1
'	End If
'	If item.FldLastVisit=date Then
'		LblVisit.Text= "ویزیت شده"
'		LblVisit.Background=OpCol2
'	Else
'		LblVisit.Text= "ویزیت نشده"
'		LblVisit.Background=OpCol1
'	End If

	DateTime.DateFormat="yyyy-MM-dd"
	'Dim DateShamsi As String = MCode.ConvertNumbersPersian2English(DateTime.Date(DateTime.Now))
	Dim DateShamsi As String = MCode.DatePersian
	Dim LstDate As List
	LstDate.Initialize
	
	If myCode.Is_Null(item.lastOrderDate).Length>2 Then
		LstDate = MCode.Sf.Split(item.lastOrderDate,"T")
		If LstDate.get(0)=DateShamsi Then
			LblKharid.Text= "سفارش داده"
			LblKharid.Background=OpCol2
		Else
			LblKharid.Text= "سفارش نداده"
			LblKharid.Background=OpCol1
		End If
	Else
		LblKharid.Text= "سفارش نداده"
		LblKharid.Background=OpCol1
	End If
	
	LstDate.Initialize
	If myCode.Is_Null(item.lastSeen).Length>2 Then
		Dim LstDate As List = MCode.Sf.Split(item.lastSeen,"T")
		If LstDate.get(0)=DateShamsi Then
			LblVisit.Text= "ویزیت شده"
			LblVisit.Background=OpCol2
		Else
			LblVisit.Text= "ویزیت نشده"
			LblVisit.Background=OpCol1
		End If
	Else
		LblVisit.Text= "ویزیت نشده"
		LblVisit.Background=OpCol1
	End If	
End Sub

Public Sub getPanel As Panel
	pnl_bk.RemoveView
	Return pnl_bk
End Sub
Public Sub getHeight As Int
	Return pnl_bk.Height
End Sub
Sub KalaDefault
'	If MCode.check_internet Then
'		MCode.page="KalaDefault"
'		FirebaseMessaging.mode="GetGalleryKala"
'		StopService(Service_Gps)
'		StartService(FirebaseMessaging)
'	
'	Else
		StartActivity(Act_KalaDefault)
		CallSubDelayed(Act_SelectMantage,"btn_Back_Click")
	'End If
	
End Sub
Sub Panel1_Click
	'MCode.SaveUpdate("Delete From TblSabad")
	MCode.C_Tafzili=shakhs.CodeTafzili
	MCode.N_Tafzili=shakhs.SharhTafzili
	Dim mande As String=myCode.Is_Null_adad(shakhs.Mande)	
	Dim SaghfeEtebar As String=myCode.Is_Null_adad(shakhs.fldSaghfeEtebar)	
	MCode.MandeHesab=mande
	If SaghfeEtebar>0 Then
		If mande>0 Then
			MCode.MandeEtebar=SaghfeEtebar - mande
			Else
			MCode.MandeEtebar=SaghfeEtebar 
		End If
		
		MCode.ManedEtebarEnable=True
		Else
		MCode.ManedEtebarEnable=False
		MCode.MandeEtebar=0
	End If
	
	Log("مانده: "& mande)
	Log("سقف اعتبار: "&SaghfeEtebar)
	Log("مانده اعتبار: "&MCode.MandeEtebar)
	Log("وضعیت مانده اعتبار: "&MCode.ManedEtebarEnable)

	Select Case MCode.page
		Case "Act_Moshtarian"
			
			StartActivity(Act_Profile)
		Case Else
			visit
			'	If MCode.Gps = 1 Then
			'	CallSubDelayed(Act_SelectMantage,"SaveGps")
			'Else
			StartActivity(Act_KalaDefault)
	End Select
	
End Sub

Sub visit
	Dim Date As String = MCode.ConvertNumbersPersian2English(MCode.DatePersian)
	If MCode.editFactor=False Then
		MCode.FaktorSelect=""
	End If
	MCode.Action="SabtFaktor"
	Dim Cu As Cursor = MCode.Result("Select * from TblLogVisitSefaresh Where FldC_Ashkhas = '"& MCode.C_Tafzili &"'")
	If Cu.RowCount>0 Then
		MCode.SaveUpdate("Update TblLogVisitSefaresh Set FldVisit = '"& Date &"' Where FldC_Ashkhas = '"& MCode.C_Tafzili &"'")
	Else
		MCode.SaveUpdate("Insert Into TblLogVisitSefaresh (FldC_Ashkhas,FldVisit,FldSefaresh,FldElatSefaresh,FldLat,FldLon) Values ('"& MCode.C_Tafzili &"','"& Date &"','','','','')")
	End If
	MCode.SaveUpdate("Update TblAshkhas Set FldLastVisit = '"& Date &"' Where fldCodetafzili = '"& MCode.C_Tafzili &"'")
	MCode.SaveUpdate("Update TblVisitorTour Set FldLastVisit = '"& Date &"' Where FldC_Ashkhas = '"& MCode.C_Tafzili &"'")
	SaveLastSeen
End Sub

Sub SaveLastSeen
	'ثبت آخرین بازدید مشتری=====================================
	DateTime.DateFormat="yyyy-MM-dd"
'	Dim DateMiladi As String = MCode.ConvertNumbersPersian2English(DateTime.Date(DateTime.Now))
	Dim DateShamsi As String = MCode.DatePersian
	Dim Time As String = DateTime.Time(DateTime.Now)
	Dim D As String = DateShamsi & "T" & Time
	LogColor("D: " & D,Colors.Red)
			
	Dim Cu As Cursor = MCode.Result("Select * From TblLastSeen Where FldC_Ashkhas = '"& MCode.C_Tafzili &"'")
	If Cu.RowCount>0 Then
		MCode.SaveUpdate("Update TblLastSeen Set LastSeen = '"& D &"' Where FldC_Ashkhas = '"& MCode.C_Tafzili &"'")
	Else
		MCode.SaveUpdate("Insert Into TblLastSeen (FldC_Ashkhas,LastSeen) Values ('"& MCode.C_Tafzili &"','"& D &"')")
	End If
	MCode.SaveUpdate("Update TblAshkhas Set lastSeen = '"& D &"' Where fldCodetafzili = '"& MCode.C_Tafzili &"'")
	
	If MCode.TourVisitSW And MCode.TourVisit=1 Then
		MCode.SaveUpdate("Update tblTourVisitor Set fldVaziat='2',fldTimeVisit='"& Time &"',fldSend='False' Where fldCodeTafzili = '"& MCode.C_Tafzili &"' and fldDateVisit='"& MCode.DatePersian &"' and fldType='Tour'")
	Else
		Dim Count As Int = MCode.SingleResult($"Select Count(fldRadif) from tblTourVisitor where  fldDateVisit='${MCode.DatePersian}' and fldType='Free'"$)
		Dim MaxRadif As Int
		If Count=0 Then
			MaxRadif=1
		Else
			MaxRadif= MCode.SingleResult($"Select Max(fldRadif) from tblTourVisitor where  fldDateVisit='${MCode.DatePersian}' and fldType='Free'"$)
			MaxRadif=MaxRadif+1
		End If
		Cu = MCode.Result($"SELECT * FROM TblAshkhas WHERE TblAshkhas.fldCodetafzili =${MCode.C_Tafzili}"$)
				
		Cu.Position=0
		MCode.SaveUpdate("Insert into tblTourVisitor(fldRadif,fldCodeSuperVisor,fldCodeGroup,fldCodeVisitor,fldCodeTafzili,fldSharheTafzili,fldDate,fldDateVisit,fldTimeVisit,fldDateNextVisit,fldDateTozie,fldShomareSefaresh,fldTimeSefaresh,fldSharh,fldVaziat,fldShomareFactor,fldSend,fldType) Values("& MaxRadif &",0,'"& Cu.GetString("fldCodeGroup") &"','"& MCode.C_Visitor &"','"& MCode.C_Tafzili &"','"& MCode.N_Tafzili &"','"& MCode.DatePersian &"','"& MCode.DatePersian &"','"& Time &"','0','0','0','','0','2','0','False','Free')")
	End If
	'=======================================================
End Sub

Private Sub LblEdit_Click
	Dim result As Int
	result = Msgbox2("آیا مشتری جدید ویرایش شود؟", "ویرایش مشتری جدید", "بله", "", "خیر", LoadBitmap(File.DirAssets,"icon.png"))
	If result = DialogResponse.Positive Then
		MCode.UpdateShakhs=True
		Act_NewAshkhas.shakhs=shakhs
		StartActivity(Act_NewAshkhas)
	Else
		'MCode.DeleteAshkhasNew=False
	End If
End Sub

Private Sub LblDelete_Click
	Try
		Dim result As Int
		result = Msgbox2("آیا مشتری جدید حذف شود؟", "حذف مشتری جدید", "بله", "", "خیر", LoadBitmap(File.DirAssets,"icon.png"))
		If result = DialogResponse.Positive Then
			MCode.SaveUpdate("Delete From TblAshkhas where fldCodetafzili='"&shakhs.CodeTafzili &"'")
			MCode.SaveUpdate("Delete From TblAshkhasNew where FldCodeTafzili='"&shakhs.CodeTafzili &"'")
'			If MCode.page="Act_SelectMantage" Then
				CallSub(Act_SelectMantage,"LoadAshkhas")
'			Else
'				CallSub(Act_Moshtarian,"LoadAshkhas")
'			End If
		ToastMessageShow("شخص جدید با موفقیت حذف شد",False)
		End If
	Catch
		Log(LastException)
		ToastMessageShow("خطا در حذف شخص جدید",False)
	End Try

End Sub