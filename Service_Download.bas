B4A=true
Group=Services
ModulesStructureVersion=1
Type=Service
Version=7.3
@EndOfDesignText@
#Region  Service Attributes 
	#StartAtBoot: True
	#StartCommandReturnValue: android.app.Service.START_STICKY
#End Region

Sub Process_Globals
	Dim Timer_Download As Timer
	Dim Sql1 As SQL
	Dim jobInternet As HttpJob
	Dim Imei As PhoneId
	Dim Cur As Cursor
End Sub

Sub Service_Create
	If Not(File.Exists(File.DirRootExternal,"Zomorod")) Then
		File.MakeDir(File.DirRootExternal,"Zomorod")
		File.Copy(File.DirAssets,"zomorod_db.db",File.DirRootExternal &"/Zomorod","zomorod_db.db")
		File.MakeDir(File.DirRootExternal &"/Zomorod","AksKala")
	Else if File.Exists(File.DirRootExternal, "Zomorod") = True Then
		If Not(File.Exists(File.DirRootExternal & "/Zomorod", "zomorod_db.db")) Then
			File.Copy(File.DirAssets,"zomorod_db.db",File.DirRootExternal &"/Zomorod","zomorod_db.db")
		End If
		If Not(File.Exists(File.DirRootExternal &"/Zomorod", "AksKala")) Then
			File.MakeDir(File.DirRootExternal &"/Zomorod","AksKala")
		End If
	End If
	
	If Not(Sql1.IsInitialized) Then Sql1.Initialize(File.DirRootExternal &"/Zomorod","zomorod_db.db",False)
	jobInternet.Initialize("jobInternet",Me)
	
'	Timer_Check.Initialize("Timer_Check",10000)
'	Timer_Check.Enabled=True

	
End Sub

'Sub Timer_Check_Tick
'	If Interval = 0 Then
'		Timer_Download.Enabled=False		
'	End If
'End Sub

Sub Interval As String
	Cur = Sql1.ExecQuery("Select * From TblSetting")
	Cur.Position=0
	Log(Cur.GetString("FldIntervalDownload") * 60 * 1000)
	Return Cur.GetString("FldIntervalDownload") * 60 * 1000
End Sub

Sub Service_Start (StartingIntent As Intent)
	If Interval > 0 Then
		Timer_Download.Initialize("Timer_Download",Interval)
		Timer_Download.Enabled=True
	Else 
		Timer_Download.Enabled=False
	End If
End Sub

Sub Service_Destroy
	StartServiceAt(Me, DateTime.Now + 3 * 1000, False)
End Sub

Sub Timer_Download_Tick
	GetKala
End Sub


Sub JobDone (Job As HttpJob)
	If Job.Success Then
		Dim Str As String = Job.GetString
		Select Case Job.JobName
			Case "GetKala"
				If Str = "No Result" Then
'					ToastMessageShow("کالا موجود نمی باشد",True)
				Else
					LoadGetKala(Str)
				End If
				'If Cur.GetString("FldAshkhas") = "1" Then
					GetAshkhas
'				Else
'					GetFee
'				End If
			Case "GetAshkhas"
				If Str = "No Result" Then
'					ToastMessageShow("شخصی موجود نمی باشد",True)
				Else
					LoadGetAshkhas(Str)
				End If
'				If Cur.GetString("FldFee") = "1" Then
					GetFee
'				Else
'					GetTasvie
'				End If
			Case "GetFee"
				If Str = "No Result" Then
'					ToastMessageShow("لیست چند قیمت موجود نمی باشد",True)
				Else
					LoadGetFee(Str)
				End If
'				If Cur.GetString("FldTasvie") = "1" Then
					GetTasvie
'				End If
			Case "GetTasvie"
				If Str = "No Result" Then
'					ToastMessageShow("لیست تسویه موجود نمی باشد",True)
				Else
					LoadGetTasvie(Str)
				End If
		End Select
	Else
		'ToastMessageShow("خطا در آپدیت اطلاعات",True)
	End If
	jobInternet.Release
End Sub

Sub GetAshkhas
	jobInternet.JobName ="GetAshkhas"
	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetStored","NameStored=listeAshkhasBaMande")
End Sub

Sub LoadGetAshkhas(Str As String)
	Dim RowsList As List
	Dim Row As Map
'	Dim Cu As  Cursor
	MCode.SaveUpdate("Delete From TblAshkhas")
	MCode.Json.Initialize(Str.Trim )
	RowsList = MCode.Json.NextArray
	
	For i = 0 To RowsList.Size - 1
		Row=RowsList.Get(i)
		MCode.SaveUpdate("Insert Into TblAshkhas (FldCodeTafzili,FldSharheTafzili,FldMande,FldVisitor,FldTell,FldAddress,FldNameGroup,FldCodeGroup) Values ('"& _
		 Row.Get("fldCodetafzili") &"','"& Row.Get("fldSharheTafzili") &"','"& Row.Get("fldMande") &"','"& Row.Get("fldVisitor") &"','"& Row.Get("fldTell") &"','"& _
		  Row.Get("fldAdress") &"','"& Row.Get("fldNameGroup") &"','"& Row.Get("fldCodeGroup") &"')")
	Next
'	Cu=MCode.Result("Select * From TblAshkhas")
'	ToastMessageShow("لیست اشخاص بروزرسانی گردید:   " & Cu.RowCount,True)
End Sub

Sub GetKala
	jobInternet.JobName ="GetKala"
	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetStored","NameStored=ShowListMojoodieAnbarForForooshMohammadreza" & "&Imei=" & Imei.GetDeviceId)
End Sub

Sub LoadGetKala(Str As String)
	Dim RowsList As List
	Dim Row As Map
'	Dim Cu As  Cursor
	MCode.SaveUpdate("Delete From TblKala")
	MCode.Json.Initialize(Str.Trim )
	RowsList = MCode.Json.NextArray
	
	For i = 0 To RowsList.Size - 1
		Row=RowsList.Get(i)
		MCode.SaveUpdate("Insert Into TblKala (FldCodeKala,FldNameKala,FldNameVahed,FldNameVahed2,FldSumMande,FldTedadDarKarton,FldFeeForoosh) Values ('"& _
		 Row.Get("fldCodeKala") &"','"& Row.Get("fldNameKala") &"','"& Row.Get("fldNameVahed") &"','"& Row.Get("fldNameVahed2") &"','"& _
		  Row.Get("SumMande") &"','"& Row.Get("fldTedadDarKarton") &"',"& Row.Get("fldFeeForoosh") &")")
	Next
'	Cu=MCode.Result("Select * From TblKala")
'	ToastMessageShow("لیست کالا بروزرسانی گردید:   " & Cu.RowCount,True)
End Sub

Sub GetFee
	jobInternet.JobName ="GetFee"
	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetAndroid","Query=Select fldCodeKala,fldCodeTasvie,fldFee From tblFee" & "&Imei=" & Imei.GetDeviceId)
End Sub

Sub LoadGetFee(Str As String)
	Dim RowsList As List
	Dim Row As Map
	MCode.SaveUpdate("Delete From TblFee")
	MCode.Json.Initialize(Str.Trim )
	RowsList = MCode.Json.NextArray
	
	For i = 0 To RowsList.Size - 1
		Row=RowsList.Get(i)
		MCode.SaveUpdate("Insert Into TblFee (FldCodeKala,FldCodeTasvie,FldFee) Values ('"& _
		 Row.Get("fldCodeKala") &"','"& Row.Get("fldCodeTasvie") &"','"& Row.Get("fldFee") &"')")
	Next
'	ToastMessageShow("قیمت فی بروزرسانی گردید",True)
End Sub

Sub GetTasvie
	jobInternet.JobName ="GetTasvie"
	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetAndroid","Query=Select fldCode,fldName From tblTasvie" & "&Imei=" & Imei.GetDeviceId)
End Sub

Sub LoadGetTasvie(Str As String)
	Dim RowsList As List
	Dim Row As Map
	MCode.SaveUpdate("Delete From TblTasvie")
	MCode.Json.Initialize(Str.Trim )
	RowsList = MCode.Json.NextArray
	
	For i = 0 To RowsList.Size - 1
		Row=RowsList.Get(i)
		MCode.SaveUpdate("Insert Into TblTasvie (FldCode,FldName) Values ('"& _
		 Row.Get("fldCode") &"','"& Row.Get("fldName") &"')")
	Next
'	ToastMessageShow("نحوه تسویه بروزرسانی گردید",True)
End Sub
