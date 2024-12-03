B4A=true
Group=Services
ModulesStructureVersion=1
Type=Service
Version=7.3
@EndOfDesignText@
#Region  Service Attributes 
	#StartAtBoot: False
	
#End Region

Sub Process_Globals
	Dim jobInternet As HttpJob
	Dim tgps As Boolean
	Dim shomareFactorSelect As Int
	Dim Sendtype As String
	Dim dt1 As String
	Dim dt2 As String
	Dim datenow As String
	Dim th As Thread
End Sub

Sub Service_Create
	Try
	
	Catch
		Log(LastException)
	End Try
	
End Sub

Private Sub th_Ended(endedOK As Boolean, error As String) 'The thread has terminated. If endedOK is False error holds the reason for failure
	Log("th " & endedOK)
End Sub


Public Sub Run(i As Int)

End Sub



Sub Service_Start (StartingIntent As Intent)
	'Service_Gps.T_StartStopGps.Enabled=False
	'Log("Gps Stop")
'	MCode.th.Initialise("th")
'	Dim MyMap As Map
'	MyMap.Initialize
'	MCode.th.Start(Me, "AsyncSetMap", Array As Object(MyMap))
	'th.Start(Me,"Run",Array As Object(1))
	
	Try
		jobInternet.Initialize("jobInternet",Me)
		jobInternet.GetRequest.Timeout=50000
		th.Initialise("th")
'		Log("i= "&i)
		Select MCode.NoeGet
			Case "DaryaftEtlaat"
				MCode.GetDataStatus=True
				StopService(Service_Helper)
				GetCurrentDate
			Case "GetCodeMoshtari"
				GetCodeMoshtari
			Case "GetVaziat"
				'GetCodeMoshtari
				GetVaziat
			Case "SendTokenId"
				SendTokenId
			Case "GetEshantion2"
				GetEshantion2
			Case "GetVisitor"
				GetVisitor
			Case "SaveTourVisit"
				LoadSendTourVisitor
		End Select
	Catch
		Log(LastException)
		myCode.SendError(LastException,"Service_Server-Service_Start")
	End Try
End Sub



Sub Service_Destroy

End Sub

Sub GetSetting
	jobInternet.JobName ="GetSetting"
	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetSetting","Imei=" & MCode.DeviceId)
	Request(jobInternet)
End Sub

Sub GetCurrentDate
	jobInternet.JobName ="GetCurrentDate"
	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetCurrentDate",Null)
	Request(jobInternet)
End Sub

Sub LoadGetSetting(Str As String)
	Try
	Dim RowsList As List
	Dim Row As Map
	MCode.Json.Initialize(Str.Trim )
	RowsList = MCode.Json.NextArray
	For i = 0 To RowsList.Size - 1
		Row=RowsList.Get(i)
			If MCode.Sf.Len(Row.Get("FldC_Visitor"))<5 Then
				ToastMessageShow("کد ویزیتور شما صحیح نیست",True)
				
				Return
			End If
		Dim Fields As Map
		Dim Where As Map
		
		Fields.Initialize
		Where.Initialize
		Fields.Put("FldImei",MCode.DeviceId)
		Fields.Put("FldC_Visitor",Row.Get("FldC_Visitor"))
		Fields.Put("FldN_Visitor",Row.Get("FldN_Visitor"))
		Fields.Put("FldGps",Row.Get("FldGps"))
		Fields.Put("FldIntervalGps",Row.Get("FldIntervalGps"))
		Fields.Put("FldNoeDate",Row.Get("FldNoeDate"))
		Fields.Put("FldRound",Row.Get("FldRound"))
		Fields.Put("FldKalaManfi",Row.Get("FldKalaManfi"))
		Fields.Put("FldTaghirFeeKala",Row.Get("FldTaghirFeeKala"))
		Fields.Put("fldNamayeshKalaSefr",Row.Get("fldNamayeshKalaSefr"))
		Fields.Put("FldDastrasiKala",Row.Get("FldDastrasiKala"))
		Fields.Put("FldDastrasiAshkhas",Row.Get("FldDastrasiAshkhas"))
		Fields.Put("FldAdmin",Row.Get("FldAdmin"))
		Fields.Put("FldCheckAdmin",Row.Get("FldCheckAdmin"))
		Fields.Put("FldTakhfifKala",Row.Get("FldTakhfifKala"))
		Fields.Put("FldTozie",Row.Get("FldTozie"))
		Fields.Put("FldVisitor",Row.Get("FldVisitor"))
		Fields.Put("FldVahedPool",Row.Get("FldVahedPool"))
		Fields.Put("FldHideMojodi",Row.Get("FldHideMojodi"))
		Fields.Put("FldSendMarjoie",Row.Get("FldSendMarjoie"))
		Fields.Put("FldPicOnline",Row.Get("FldPicOnline"))
		Fields.Put("FldDaryaft",Row.Get("FldDaryaft"))
		Fields.Put("FldGetDataOnline",Row.Get("FldGetDataOnline"))
		Fields.Put("FldAmani",Row.Get("FldAmani"))
		Fields.Put("FldMojavezSefaresh",Row.Get("FldMojavezSefaresh"))
		Fields.Put("FldConnectionStatus",Row.Get("FldConnectionStatus"))
		Fields.Put("FldEshantionTabaghati",Row.Get("FldEshantionTabaghati"))
		Fields.Put("FldEshantionRemove",Row.Get("FldEshantionRemove"))
		Fields.Put("FldEshantionGroup",Row.Get("FldEshantionGroup"))
		Fields.Put("FldMobileIsImportent",Row.Get("FldMobileIsImportent"))
		Fields.Put("FldSaveFactorInLocation",Row.Get("FldSaveFactorInLocation"))
		Fields.Put("FldMasafat",Row.Get("FldMasafat"))
		
		Where.Put("FldId",1)
	

		DBUtils.UpdateRecord2(MCode.Sql1,"TblSetting",Fields,Where)
	Next
	
		MCode.UpdateDataBase
'		MCode.UpdateSetting
		If MCode.NoeGet="DaryaftEtlaat" Then
			GetGoroohKala
		End If
		
'		CallSub(Act_Main,"LoadPage")
		
'			StartService(Service_Gps)
		StartService(FusedLocationService)
'		ToastMessageShow("تنظیمات با موفقیت دریافت گردید",True)
		 

	Catch
		Log(LastException)
		myCode.SendError(LastException,"Service_Server-LoadGetSetting")
	End Try
End Sub
Sub SendTokenId
	jobInternet.JobName ="SendTokenId"
	Dim str As String=MCode.TokenPush
	Log(str)
	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/TokenSave2", "fldTokenId=" & MCode.DeviceId &" &fldNameVisitor="& MCode.N_Visitor &" &fldCodeMoshtari="& MCode.CodeMoshtari & " &fldVersion="& MCode.Version & " &fldVersionNumber="& MCode.NumberVersion & " &fldDate="& MCode.RemoveSlashDate(MCode.DateVersion))
	'jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/TokenSave", "fldTokenId=" & MCode.DeviceId &" &fldNameVisitor="& MCode.N_Visitor &" &fldCodeMoshtari="& MCode.CodeMoshtari & " &Token="& "")
	Request(jobInternet)
End Sub
Sub GetCodeMoshtari
	jobInternet.JobName ="GetCodeMoshtari"
	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetCodeMoshtari","imei=" & MCode.DeviceId )
	Request(jobInternet)
End Sub

Sub GetVaziat
	jobInternet.JobName ="GetVaziat"
	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetVaziat","fldTokenId=" & MCode.DeviceId )
	Request(jobInternet)
End Sub

Sub GetLinkFtp
	If	MCode.PicOnline=1 Then
		GetPicFTPForAndroid
	Else
		GetGalleryKala
	End If
End Sub

Sub LoadGetVaziat(Str As String)
	Try
	Dim RowsList As List
	Dim Row As Map
	MCode.Json.Initialize(Str.Trim )
	RowsList = MCode.Json.NextArray
	For i = 0 To RowsList.Size - 1
		Row=RowsList.Get(i)
		Dim Query As String="Update TblSetting Set FldTokenId = '"& MCode.DeviceId &"',FldCodeMoshtari = '"& MCode.CodeMoshtari &"',FldNameVisitor = '"& Row.Get("fldNameVisitor") &"',FldVaziat = '"& Row.Get("fldVaziat") &"'"
		MCode.SaveUpdate(Query)
	Next
		MCode.Vaziat=MCode.SingleResult("select FldVaziat from TblSetting")
	Catch
		Log(LastException)
		myCode.SendError(LastException,"Service_Server-LoadGetVaziat")
	End Try
'	btnCloseActive_Click
	'Tabl.SelectTab(0)
'	CallSubDelayed(Act_Main,"LoadPage")
	'StartActivity(Act_Main)
End Sub

Sub GetKala
	jobInternet.JobName ="GetKala"
	Log (MCode.DeviceId)
	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetListKala","&fldFeeTasvie=" & MCode.feeCode  & "&Imei=" & MCode.DeviceId & "&Version=2")
	Request(jobInternet)
End Sub

Sub LoadGetKala(Str As String)
	Try
	Dim RowsList As List
	Dim Row As Map
	Dim Cu As  Cursor
	Row.Initialize
	
	MCode.SaveUpdate("Delete From TblKala")
	MCode.Json.Initialize(Str.Trim)
	RowsList = MCode.Json.NextArray
		DBUtils.InsertMaps(MCode.Sql1,"TblKala",RowsList)
		If MCode.PicOnline=0 Then
'			For i = 0 To RowsList.Size - 1
'		
'				Row=RowsList.Get(i)
'				Dim path As String=myCode.GetPathPicByCodeKala(Row.Get("fldCodeKala"))
'				Log(path)
'				
'				MCode.SaveUpdate("Update TblKala Set fldPathPic='"& path &"' where FldCodeKala=" & Row.Get("fldCodeKala"))
'				
''		Log("fldCodeKala:"& Row.Get("fldCodeKala"))
''		MCode.SaveUpdate("Insert Into TblKala (FldCodeKala,FldNameKala,FldNameVahed,FldNameVahed2,FldSumMande,FldTedadDarKarton,FldFeeForoosh,FldGoroohKala,FldMablaghMasrafKonande) Values ('"& _
''		 Row.Get("fldCodeKala") &"','"& Row.Get("fldNameKala") &"','"& Row.Get("fldNameVahed") &"','"& Row.Get("fldNameVahed2") &"','"& _
''		  Row.Get("SumMande") &"','"& Row.Get("fldTedadDarKarton") &"','"& Row.Get("fldFeeForoosh") &"','"& Row.Get("fldCodeGroup") &"','"&  Row.Get("FldMablaghMasrafKonande") &"')")
''	
'			Next
		End If

	Cu=MCode.Result("Select * From TblKala")
	Log("لیست کالا بروزرسانی گردید")
		ToastMessageShow("لیست کالا بروزرسانی گردید: " & Cu.RowCount,True)
	Catch
		Log(LastException)
		myCode.SendError(LastException,"Service_Server-LoadGetKala")
	End Try
End Sub

Sub GetAshkhas
	jobInternet.JobName ="GetAshkhas"
	'jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetStored","NameStored=ListAshkhas" & "&Imei=" & MCode.DeviceId)
	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetListAshkhas","&Imei=" & MCode.DeviceId & "&Version=1")
	Request(jobInternet)
End Sub

Sub LoadGetAshkhas(Str As String)
	Try
	Dim RowsList As List
'	Dim d As Int=0
'	Dim m As Int=0
	Dim Row As Map
	Row.Initialize
	Dim Cu As  Cursor
	
	MCode.Json.Initialize(Str.Trim )
	RowsList = MCode.Json.NextArray

'	If MCode.DeleteAshkhasNew=False Then
'		MCode.SaveUpdate("Delete From TblAshkhas where length(FldCodeTafzili)<6")
'		MCode.SaveUpdate("Delete From TblAshkhasNew")
'	Else
'		MCode.SaveUpdate("Delete From TblAshkhas")
'		MCode.SaveUpdate("Delete From TblAshkhasNew")
'	End If
		MCode.SaveUpdate("Delete From TblAshkhas where length(fldCodetafzili)<6")
	DBUtils.InsertMaps(MCode.Sql1,"TblAshkhas",RowsList)
	Cu=MCode.Result("Select * From TblAshkhas")
	Log("لیست اشخاص بروزرسانی گردید")
	
	'check ashkhas new
		Cu=MCode.Result("Select * From TblAshkhas where length(fldCodetafzili)>5")
		For i=0 To Cu.RowCount-1
			Cu.Position=i
			Log(Cu.GetString("fldCodetafzili"))
			Log(Cu.GetString("fldCodeMovaghat"))
			Dim count As Int=MCode.SingleResult("Select count(fldCodetafzili) From TblAshkhas where fldCodeMovaghat='"&Cu.GetString("fldCodetafzili") & "'")
			If count > 0 Then
				MCode.SaveUpdate("Delete From TblAshkhas where fldCodetafzili='"&Cu.GetString("fldCodetafzili") & "'")
			End If
		Next
	
	
	
		'ToastMessageShow("لیست اشخاص بروزرسانی گردید:   " & Cu.RowCount,True)
	Catch
		Log(LastException)
		myCode.SendError(LastException,"Service_Server-LoadGetAshkhas")
	End Try
End Sub

Sub GetTanzimatAndroid
	jobInternet.JobName ="GetTanzimatAndroid"
	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetAndroid","Query=Select * From tblTanzimatAndroid" & "&Imei=" & MCode.DeviceId)
	Request(jobInternet)
End Sub

Sub LoadGetTanzimatAndroid(Str As String)
	Try
		Dim RowsList As List
		Dim Row As Map
		MCode.Json.Initialize(Str.Trim )
		RowsList = MCode.Json.NextArray
		For i = 0 To RowsList.Size - 1
			Row=RowsList.Get(i)
		
			Dim Fields As Map
			Dim Where As Map
		
			Fields.Initialize
			Where.Initialize
			Fields.Put("fldArzeshAfzode",Row.Get("fldArzeshAfzode"))
			Where.Put("FldId",1)
	

			DBUtils.UpdateRecord2(MCode.Sql1,"TblSetting",Fields,Where)
		Next
		MCode.UpdateDataBase


		
	Catch
		Log(LastException)
		myCode.SendError(LastException,"Service_Server-LoadGetTanzimatAndroid")
	End Try
End Sub

Sub GetFee
	jobInternet.JobName ="GetFee"
	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetAndroid","Query=Select fldCodeKala,fldCodeTasvie,fldFee From tblFee" & "&Imei=" & MCode.DeviceId)
	Request(jobInternet)
End Sub

Sub LoadGetFee(Str As String)
	Try
	Dim RowsList As List
'	Dim Row As Map
	MCode.SaveUpdate("Delete From TblFee")
	MCode.Json.Initialize(Str.Trim )
	RowsList = MCode.Json.NextArray
		DBUtils.InsertMaps(MCode.Sql1,"TblFee",RowsList)
	Catch
		Log(LastException)
		myCode.SendError(LastException,"Service_Server-LoadGetFee")
	End Try
'	For i = 0 To RowsList.Size - 1
'		Row=RowsList.Get(i)
'		MCode.SaveUpdate("Insert Into TblFee (FldCodeKala,FldCodeTasvie,FldFee) Values ('"& _
'		 Row.Get("fldCodeKala") &"','"& Row.Get("fldCodeTasvie") &"','"& Row.Get("fldFee") &"')")
'	Next
End Sub

Sub GetGoroohKala
	jobInternet.JobName ="GetGoroohKala"
	
	If MCode.DastrasiGroupKala=1 Then
		jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetAndroid","Query=Select fldGroupId,fldGroupName From tblGroupKala ORDER BY CONVERT(varchar, fldGroupId)" & "&Imei=" & MCode.DeviceId)
	Else
		'jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetAndroid","Query=Select fldGroupId,fldGroupName From tblGroupKala ORDER BY CONVERT(varchar, fldGroupId)" & "&Imei=" & MCode.DeviceId)
		jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetAndroid","Query=Select fldGroupId,fldGroupName From tblGroupKala WHERE  fldGroupId in(SELECT  fldCodeGroup FROM   tblGroupDastrasiKala WHERE        (fldVizitor = " & MCode.C_Visitor & ")) ORDER BY CONVERT(varchar, fldGroupId)" & "&Imei=" & MCode.DeviceId)
		'jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetAndroid","Query=SELECT fldGroupId, fldGroupName FROM  dbo.tblGroupKala WHERE (fldGroupId IN (SELECT fldCodeGroup FROM  dbo.tblGroupDastrasiKala WHERE (fldVizitor = " &MCode.C_Visitor& "))) ORDER BY CONVERT(varchar, fldGroupId)" & "&Imei=" & MCode.DeviceId)
	End If
	Request(jobInternet)
End Sub

Sub LoadGetGoroohKala(Str As String)
	Try
	Dim RowsList As List
	Dim Row As Map
	MCode.SaveUpdate("Delete From TblGoroohKala")
	MCode.Json.Initialize(Str.Trim )
	RowsList = MCode.Json.NextArray
	'DBUtils.InsertMaps(MCode.Sql1,"TblGoroohKala",RowsList)
	For i = 0 To RowsList.Size - 1
		Row=RowsList.Get(i)
		MCode.SaveUpdate("Insert Into TblGoroohKala (FldC_Gorooh,FldN_Gorooh) Values ('"& _
		 Row.Get("fldGroupId") &"','"& Row.Get("fldGroupName") &"')")
		Log("fldGroupName:"&Row.Get("fldGroupName"))
	Next
	Log("گروه کالا بروزرسانی گردید")
		'ToastMessageShow("گروه کالا بروزرسانی گردید",True)
	Catch
		Log(LastException)
		myCode.SendError(LastException,"Service_Server-LoadGetGoroohKala")
	End Try
End Sub




Sub GetTasvie
	jobInternet.JobName ="GetTasvie"
	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetAndroid","Query=Select fldCode,fldName From tblTasvie" & "&Imei=" & MCode.DeviceId)
	Request(jobInternet)
End Sub

Sub LoadGetTasvie(Str As String)
	Try
	Dim RowsList As List
	Dim Row As Map
	MCode.SaveUpdate("Delete From TblTasvie")
	MCode.Json.Initialize(Str.Trim)
	RowsList = MCode.Json.NextArray
	'DBUtils.InsertMaps(MCode.Sql1,"TblTasvie",RowsList)
	For i = 0 To RowsList.Size - 1
		Row=RowsList.Get(i)
		MCode.SaveUpdate("Insert Into TblTasvie (FldCode,FldName) Values ('"& _
		 Row.Get("fldCode") &"','"& Row.Get("fldName") &"')")
		Next
	Catch
		Log(LastException)
		myCode.SendError(LastException,"Service_Server-LoadGetTasvie")
	End Try
End Sub

Sub GetGoroohAshkhas
	jobInternet.JobName ="GetGoroohAshkhas"
	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetListGroupAshkhas2","Imei=" & MCode.DeviceId &" &CodeVisitor="&MCode.C_Visitor)
	'jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetAndroid","Query=Select fldGroupId,fldGroupName From tblGroupAshkhas ORDER BY CONVERT(varchar, fldGroupId)" & "&Imei=" & MCode.DeviceId)
	'jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetAndroid","Query=Select fldGroupId,fldGroupName From tblGroupAshkhas WHERE  fldGroupId in(SELECT  fldCodeGroup FROM   tblGroupDastrasi WHERE        (fldVizitor = "& MCode.C_Visitor &")) ORDER BY CONVERT(varchar, fldGroupId)" & "&Imei=" & MCode.DeviceId)
	Request(jobInternet)
End Sub

Sub LoadGetGoroohAshkhas(Str As String)
	Try
	Dim RowsList As List
	Dim Row As Map
	MCode.SaveUpdate("Delete From TblGoroohAshkhas")
	MCode.Json.Initialize(Str.Trim)
	RowsList = MCode.Json.NextArray
'	DBUtils.InsertMaps(MCode.Sql1,"TblGoroohAshkhas",RowsList)
	For i = 0 To RowsList.Size - 1
		Row=RowsList.Get(i)
		MCode.SaveUpdate("Insert Into TblGoroohAshkhas (FldC_Gorooh,FldN_Gorooh) Values ('"& _
		 Row.Get("fldGroupId") &"','"& Row.Get("fldGroupName") &"')")
		Log(Row.Get("fldGroupName"))
	Next
		Log("گروه اشخاص بروزرسانی گردید")
	Catch
		Log(LastException)
		myCode.SendError(LastException,"Service_Server-LoadGetGoroohAshkhas")
	End Try
	'ToastMessageShow("گروه اشخاص بروزرسانی گردید",True)
End Sub

Sub GetGalleryKala
	jobInternet.JobName ="GetGalleryKala"
	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetAndroid","Query=select * from tblGalleryPic " & "&Imei=" & MCode.DeviceId)
'	If MCode.DastrasiGroupKala=1 Then
'		jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetAndroid","Query=Select fldGroupId,fldGroupName From tblGroupKala ORDER BY CONVERT(varchar, fldGroupId)" & "&Imei=" & MCode.DeviceId)
'	Else
'		jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetAndroid","Query=SELECT fldGroupId, fldGroupName FROM  dbo.tblGroupKala WHERE (fldGroupId IN (SELECT fldCodeGroup FROM  dbo.tblGroupDastrasiKala WHERE (fldVizitor = " &MCode.C_Visitor& "))) ORDER BY CONVERT(varchar, fldGroupId)" & "&Imei=" & MCode.DeviceId)
'	End If
	Request(jobInternet)
End Sub

Sub LoadGetGalleryKala(Str As String)
	Try
	Dim RowsList As List
	Dim Row As Map
	MCode.SaveUpdate("Delete From TblGalleryPic")
	MCode.Json.Initialize(Str.Trim )
	RowsList = MCode.Json.NextArray
	'DBUtils.InsertMaps(MCode.Sql1,"TblGalleryPic",RowsList)
	For i = 0 To RowsList.Size - 1
		Row=RowsList.Get(i)
		MCode.SaveUpdate("Insert Into TblGalleryPic (fldCodeKala,fldImageNumber,fldImage,fldShow) Values ('"& _
		 Row.Get("fldCodeKala") &"','"& Row.Get("fldImageNumber") &"','"& Row.Get("fldImage") &"','"& Row.Get("fldShow") &"')")
		
	Next
		Log("گالری تصاویر بروزرسانی گردید")
	Catch
		Log(LastException)
		myCode.SendError(LastException,"Service_Server-LoadGetGalleryKala")
	End Try
	'ToastMessageShow("گالری تصاویر بروزرسانی گردید",True)
End Sub

Public Sub GetEshantion
	jobInternet.JobName ="GetEshantion"
	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetAndroid","Query=select fldCodeKala,fldTedadEshantion,fldCountForoosh,fldVaziat from tblEshantionVisitori where fldCodeVisitor="&MCode.C_Visitor & " &Imei=" & MCode.DeviceId)
'	If MCode.DastrasiGroupKala=1 Then
'		jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetAndroid","Query=Select fldGroupId,fldGroupName From tblGroupKala ORDER BY CONVERT(varchar, fldGroupId)" & "&Imei=" & MCode.DeviceId)
'	Else
'		jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetAndroid","Query=SELECT fldGroupId, fldGroupName FROM  dbo.tblGroupKala WHERE (fldGroupId IN (SELECT fldCodeGroup FROM  dbo.tblGroupDastrasiKala WHERE (fldVizitor = " &MCode.C_Visitor& "))) ORDER BY CONVERT(varchar, fldGroupId)" & "&Imei=" & MCode.DeviceId)
'	End If
	Request(jobInternet)
End Sub

Sub LoadGetEshantion(Str As String)
	Try
	Dim RowsList As List
'	Dim Row As Map
	MCode.SaveUpdate("Delete From tblEshantionVisitori")
	MCode.Json.Initialize(Str.Trim )
	RowsList = MCode.Json.NextArray
	DBUtils.InsertMaps(MCode.Sql1,"tblEshantionVisitori",RowsList)
'	For i = 0 To RowsList.Size - 1
'		Row=RowsList.Get(i)
'		MCode.SaveUpdate("Insert Into tblEshantionVisitori (fldCodeKala,fldVahed,fldTedadEshantion,fldCountForoosh,fldVaziat) Values ('"& _
'		 Row.Get("fldCodeKala") &"','"& Row.Get("fldVahed") &"','"& Row.Get("fldTedadEshantion") &"','"& Row.Get("fldCountForoosh") &"','"& Row.Get("fldVaziat") &"')")
'		
'	Next
		Log("اشانتیون بروزرسانی گردید")
	Catch
		Log(LastException)
		myCode.SendError(LastException,"Service_Server-LoadGetEshantion")
	End Try
'	ToastMessageShow("عملیات دریافت اطلاعات با موفقیت تکمیل شد",True)
'	ToastMessageShow("گالری تصاویر بروزرسانی گردید",True)
End Sub

Public Sub GetEshantion2
	jobInternet.JobName ="GetEshantion2"
	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetEshantion2","Imei=" & MCode.DeviceId)
	Request(jobInternet)
End Sub

Sub LoadGetEshantion2(Str As String)
	Try
	Dim RowsList As List
'	Dim Row As Map
		MCode.SaveUpdate("Delete From tblEshantionTabaghati")
	MCode.Json.Initialize(Str.Trim )
	RowsList = MCode.Json.NextArray
		DBUtils.InsertMaps(MCode.Sql1,"tblEshantionTabaghati",RowsList)
		Log("اشانتیون بروزرسانی گردید")
	Catch
		Log(LastException)
		myCode.SendError(LastException,"Service_Server-LoadGetEshantion2")
	End Try
End Sub

Public Sub GetEshantionGroup
	jobInternet.JobName ="GetEshantionGroup"
	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetEshantionGroup","Imei=" & MCode.DeviceId)
	Request(jobInternet)
End Sub

Sub LoadGetEshantionGroup(Str As String)
	Try
	Dim RowsList As List
'	Dim Row As Map
		MCode.SaveUpdate("Delete From tblEshantionGroup")
	MCode.Json.Initialize(Str.Trim )
	RowsList = MCode.Json.NextArray
		DBUtils.InsertMaps(MCode.Sql1,"tblEshantionGroup",RowsList)
		Log("اشانتیون گروهی بروزرسانی گردید")
	Catch
		Log(LastException)
		myCode.SendError(LastException,"Service_Server-LoadGetEshantionGroup")
	End Try
End Sub

Public Sub GetDaryaft
	jobInternet.JobName ="GetDaryaft"
	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetDaryaft","Imei="&MCode.DeviceId & " &type=Daryaft")
	Request(jobInternet)
End Sub

Sub LoadGetDaryaft(Str As String)
	Try
	Dim RowsList As List
	Dim Row As Map
		MCode.SaveUpdate("Delete From TblDaryaft")
	MCode.Json.Initialize(Str.Trim )
	RowsList = MCode.Json.NextArray
		DBUtils.InsertMaps(MCode.Sql1,"TblDaryaft",RowsList)
'		For i = 0 To RowsList.Size - 1
'			Row=RowsList.Get(i)
'			MCode.SaveUpdate("Insert Into TblDaryaft (fldShomareDaryaft,fldShomareFactor,fldShomareHavale,fldMablaghDaryafti,FldMablaghTakhfif,fldCodeTafzili,fldSharheTafzili,fldShomareTell,fldSharh,fldCodeVaste,fldCodeSandoogh,FldDateDaryaft,fldCodeBank,fldType,FldSharhKol,FldDarsadTakhfif,fldSend) VALUES("& _
'			Row.Get("fldShomareDaryaft")&","&Row.Get("fldShomareFactor")&","&Row.Get("fldShomareHavale")&","&Row.Get("fldMablaghDaryafti")&","&Row.Get("fldMablaghTakhfif")&","&Row.Get("fldCodeTafzili")&",'"&Row.Get("fldSharheTafzili")&"','"&Row.Get("fldShomareTell")&"','"&Row.Get("fldSharh")&"',"&Row.Get("fldCodeVaste")&","&Row.Get("fldCodeSandoogh")&",'"&Row.Get("fldDateDaryaft")&"',"&Row.Get("fldCodeBank")&",'"&Row.Get("fldType")&"','"&Row.Get("fldSharhKol")&"','"&Row.Get("fldDarsadTakhfif")&"',1)")
'			'MCode.SaveUpdate("Update TblDaryaft Set fldSend=1")
'			Log("fldShomareHavale" & Row.Get("fldShomareHavale"))
'			Log("fldShomareDaryaft" &Row.Get("fldShomareDaryaft"))
'			Log("fldShomareFactor" &Row.Get("fldShomareFactor"))
'		Next
		
		Log("دریافت بروزرسانی گردید")
	Catch
		Log(LastException)
		myCode.SendError(LastException,"Service_Server-LoadGetGetDaryaft")
	End Try
'	ToastMessageShow("عملیات دریافت اطلاعات با موفقیت تکمیل شد",True)
'	ToastMessageShow("گالری تصاویر بروزرسانی گردید",True)
'	ToastMessageShow("لیست دریافت بروزرسانی گردید",True)
End Sub

Public Sub GetCheckDaryaft
	jobInternet.JobName ="GetCheckDaryaft"
	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetDaryaft","Imei="&MCode.DeviceId & " &type=CheckDaryaft")
	Request(jobInternet)
End Sub

Sub LoadGetCheckDaryaft(Str As String)
	Try
	Dim RowsList As List
	Dim Row As Map
		MCode.SaveUpdate("Delete From TblCheckDaryafti")
	MCode.Json.Initialize(Str.Trim )
	RowsList = MCode.Json.NextArray
'		DBUtils.InsertMaps(MCode.Sql1,"TblCheckDaryafti",RowsList)
		For i = 0 To RowsList.Size - 1
			Row=RowsList.Get(i)
			MCode.SaveUpdate("insert into TblCheckDaryafti(fldShomareCheck,fldShomareHesab,fldShomareDaryaft,fldMablagh,fldShobe,fldSharh,fldDate,fldDateSarResid,fldCodeBank,fldCodeSahebeCheck,fldShomareFactor,fldCodeVaste,fldSend) values('"&Row.Get("fldShomareCheck") & _
		"','"&Row.Get("fldShomareHesab") &"'"& _
		",'"& Row.Get("fldShomareDaryaft") &"'"& _
		",'"& Row.Get("fldMablagh") &"'"& _
		",'"& Row.Get("fldShobe") &"'"& _
		",'"& Row.Get("fldSharh") &"'"& _
		",'"& Row.Get("fldDate") &"'"& _
		",'"& Row.Get("fldDateSarResid") &""& _
		"',"& Row.Get("fldCodeBank") &""& _
		",'"& Row.Get("fldCodeSahebeCheck") &"'"& _
		",'"& Row.Get("fldShomareFactor") &"'"& _
		",'"& Row.Get("fldCodeVaste") &"'"& _
		",1"& _
		")")
		Next
		Log("دریافت بروزرسانی گردید")
	Catch
		Log(LastException)
		myCode.SendError(LastException,"Service_Server-LoadGetGetDaryaft")
	End Try
'	ToastMessageShow("عملیات دریافت اطلاعات با موفقیت تکمیل شد",True)
'	ToastMessageShow("گالری تصاویر بروزرسانی گردید",True)
'	ToastMessageShow("لیست چک دریافت بروزرسانی گردید",True)
End Sub



Sub GetAllNotification
	jobInternet.JobName ="GetAllNotification"
	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetAllNotification","Imei=" & MCode.DeviceId & "&CodeVisitor="&MCode.C_Visitor)
End Sub

Sub LoadGetAllNotification(Str As String)
	Try
	Dim RowsList As List
	Dim Row As Map
	MCode.SaveUpdate("Delete From TblNotifi")
	MCode.Json.Initialize(Str.Trim )
	RowsList = MCode.Json.NextArray	
'	DBUtils.InsertMaps(MCode.Sql1,"TblNotifi",RowsList)
	For i = 0 To RowsList.Size - 1
		Row=RowsList.Get(i)
		MCode.SaveUpdate("Insert Into TblNotifi (Id,FldTitle,FldBody,FldDate,FldTime) Values ('"& _
		 Row.Get("Id") &"','"& Row.Get("fldTitle") &"','"& Row.Get("fldBody") &"','"& Row.Get("fldDate") &"','"& Row.Get("fldTime") &"')")
		Log(Row.Get("fldTitle"))
	Next
		Log("نوتیفیکیشن بروزرسانی گردید")
	Catch
		Log(LastException)
		myCode.SendError(LastException,"Service_Server-LoadGetAllNotification")
	End Try
End Sub


Sub SendFaktor(Str As String)
	jobInternet.JobName ="SendFaktor"
	Log(Str)
	'MCode.SaveLog(Str)
	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/SaveFaktor5","JsonDt=" & Str & "&Visitor=" & MCode.C_Visitor & "&Imei=" & MCode.DeviceId & "&Version=3")
	'jobInternet.PostString("http://localhost:1372/marashiservice.asmx/SaveFaktor4","JsonDt=" & Str & "&Visitor=" & MCode.C_Visitor & "&Imei=" & MCode.DeviceId)
	Request(jobInternet)
End Sub

Sub LoadSendFaktorAll
	Try
	Dim ListJson As List
	ListJson.Initialize
	'"Select FldId,FldRadif,FldShomareFaktor,FldVaziatPardakht,FldC_Tafzili,FldN_Tafzili,FldCodeKala,FldNameKala,FldFeeForoosh,FldTedadDarKarton,FldTedadDarSabadJoz,FldTedadDarSabadKol,FldTarikh,FldLat,FldLon,FldSend,FldTozihat,FldTozih From TblFaktor Where FldSend = 0"
	'Dim Cu As Cursor = MCode.Result("Select FldId,FldRadif,FldShomareFaktor,FldVaziatPardakht,FldC_Tafzili,FldN_Tafzili,FldCodeKala,FldNameKala,Cast(Round(FldFeeForoosh,'"& MCode.RaghamAshar &"') As Int) As FldFeeForoosh,FldTedadDarKarton,FldTedadDarSabadJoz,FldTedadDarSabadKol,FldTarikh,FldLat,FldLon,FldSend,FldTozihat,FldTozih From TblFaktor Where FldSend = 0")
	'Dim Cu As Cursor = MCode.Result("Select FldId,FldRadif,FldShomareFaktor,FldVaziatPardakht,FldC_Tafzili,FldN_Tafzili,FldCodeKala,FldNamekala,Cast(Round(FldFeeForoosh,'"& MCode.RaghamAshar &"') As Int) As FldFeeForoosh,FldTedadDarKarton,FldTedadDarSabadJoz,FldTedadDarSabadKol,FldTozihat,FldTarikh,FldLat,FldLon,FldSend,FldTozih From TblFaktor Where FldSend = 0")
		If MCode.CheckAdmin=1 Then
			Dim Cu As Cursor = MCode.Result("Select FldRadif,FldShomareFaktor,FldVaziatPardakht,FldC_Tafzili,FldN_Tafzili,FldCodeKala,FldNamekala,Cast(Round(FldFeeForoosh,'"& MCode.RaghamAshar &"') As Int) As FldFeeForoosh,FldTedadDarKarton,FldTedadDarSabadJoz,FldTedadDarSabadKol,FldTozihat,FldDate as FldTarikh,FldTime as fldTime,FldLat,FldLon,FldTozih,FldShomareBargasht,FldMablaghTakhfif,FldDarsadTakhfif,FldType as fldType,FldAmani,FldSumMablaghTakhfifVizhe ,FldSumMablaghTakhfifKala ,FldTotalFaktor ,FldMablaghTakhfifKol,fldShomareForoosh,0 as fldSignatureBitmapString,-1 as fldShomareFactorReal,fldArzeshAfzode,fldDarsadArzeshAfzode From TblFaktor Where FldSync = 'False'")
			Else
			Dim Cu As Cursor = MCode.Result("Select FldRadif,FldShomareFaktor,FldVaziatPardakht,FldC_Tafzili,FldN_Tafzili,FldCodeKala,FldNamekala,Cast(Round(FldFeeForoosh,'"& MCode.RaghamAshar &"') As Int) As FldFeeForoosh,FldTedadDarKarton,FldTedadDarSabadJoz,FldTedadDarSabadKol,FldTozihat,FldDate as FldTarikh,FldTime as fldTime,FldLat,FldLon,FldTozih,FldShomareBargasht,FldMablaghTakhfif,FldDarsadTakhfif,FldType as fldType,FldAmani,FldSumMablaghTakhfifVizhe ,FldSumMablaghTakhfifKala ,FldTotalFaktor ,FldMablaghTakhfifKol,fldShomareForoosh,0 as fldSignatureBitmapString,fldArzeshAfzode,fldDarsadArzeshAfzode From TblFaktor Where FldSync = 'False'")
		End If
		
	If Cu.RowCount>0 Then
		'ProgressDialogShow2("در حال ارسال فاکتور ها",False)
		SendFaktor(MCode.DtToJson(Cu))
	Else
		ToastMessageShow("فاکتور جهت ارسال موجود نمی باشد",True)
		ProgressDialogHide	
	End If
		
	Catch
		Log(LastException)
		myCode.SendError(LastException,"Service_Server-LoadSendFaktorAll")
	End Try
	ProgressDialogHide
End Sub

Sub LoadSendFaktorAll2(CodeTafzili As String)
	Try
		Dim ListJson As List
		ListJson.Initialize
		'"Select FldId,FldRadif,FldShomareFaktor,FldVaziatPardakht,FldC_Tafzili,FldN_Tafzili,FldCodeKala,FldNameKala,FldFeeForoosh,FldTedadDarKarton,FldTedadDarSabadJoz,FldTedadDarSabadKol,FldTarikh,FldLat,FldLon,FldSend,FldTozihat,FldTozih From TblFaktor Where FldSend = 0"
		'Dim Cu As Cursor = MCode.Result("Select FldId,FldRadif,FldShomareFaktor,FldVaziatPardakht,FldC_Tafzili,FldN_Tafzili,FldCodeKala,FldNameKala,Cast(Round(FldFeeForoosh,'"& MCode.RaghamAshar &"') As Int) As FldFeeForoosh,FldTedadDarKarton,FldTedadDarSabadJoz,FldTedadDarSabadKol,FldTarikh,FldLat,FldLon,FldSend,FldTozihat,FldTozih From TblFaktor Where FldSend = 0")
		'Dim Cu As Cursor = MCode.Result("Select FldId,FldRadif,FldShomareFaktor,FldVaziatPardakht,FldC_Tafzili,FldN_Tafzili,FldCodeKala,FldNamekala,Cast(Round(FldFeeForoosh,'"& MCode.RaghamAshar &"') As Int) As FldFeeForoosh,FldTedadDarKarton,FldTedadDarSabadJoz,FldTedadDarSabadKol,FldTozihat,FldTarikh,FldLat,FldLon,FldSend,FldTozih From TblFaktor Where FldSend = 0")
	
		
		If MCode.CheckAdmin=1 Then
			Dim Cu As Cursor = MCode.Result("Select FldRadif,FldShomareFaktor,FldVaziatPardakht,FldC_Tafzili,FldN_Tafzili,FldCodeKala,FldNamekala,Cast(Round(FldFeeForoosh,'"& MCode.RaghamAshar &"') As Int) As FldFeeForoosh,FldTedadDarKarton,FldTedadDarSabadJoz,FldTedadDarSabadKol,FldTozihat,FldDate as FldTarikh,FldTime as fldTime,FldLat,FldLon,FldTozih,FldShomareBargasht,FldMablaghTakhfif,FldDarsadTakhfif,FldType as fldType,FldAmani,FldSumMablaghTakhfifVizhe ,FldSumMablaghTakhfifKala ,FldTotalFaktor ,FldMablaghTakhfifKol,fldShomareForoosh,0 as fldSignatureBitmapString,-1 as fldShomareFactorReal,fldArzeshAfzode,fldDarsadArzeshAfzode From TblFaktor Where FldSync = 'False' and FldShomareFaktor='"& shomareFactorSelect & "' and FldC_Tafzili='"& CodeTafzili & "'")
		Else
			Dim Cu As Cursor = MCode.Result("Select FldRadif,FldShomareFaktor,FldVaziatPardakht,FldC_Tafzili,FldN_Tafzili,FldCodeKala,FldNamekala,Cast(Round(FldFeeForoosh,'"& MCode.RaghamAshar &"') As Int) As FldFeeForoosh,FldTedadDarKarton,FldTedadDarSabadJoz,FldTedadDarSabadKol,FldTozihat,FldDate as FldTarikh,FldTime as fldTime,FldLat,FldLon,FldTozih,FldShomareBargasht,FldMablaghTakhfif,FldDarsadTakhfif,FldType as fldType,FldAmani,FldSumMablaghTakhfifVizhe ,FldSumMablaghTakhfifKala ,FldTotalFaktor ,FldMablaghTakhfifKol,fldShomareForoosh,0 as fldSignatureBitmapString,fldArzeshAfzode,fldDarsadArzeshAfzode From TblFaktor Where FldSync = 'False' and FldShomareFaktor='"& shomareFactorSelect & "' and FldC_Tafzili='"& CodeTafzili & "'")
		End If
		
		If Cu.RowCount>0 Then
			'ProgressDialogShow2("در حال ارسال فاکتور ها",False)
			SendFaktor(MCode.DtToJson(Cu))
		Else
			ToastMessageShow("فاکتور جهت ارسال موجود نمی باشد",True)
			ProgressDialogHide
		End If
		
	Catch
		Log(LastException)
		myCode.SendError(LastException,"Service_Server-LoadSendFaktorAll2")
	End Try
	ProgressDialogHide
End Sub

Sub LoadSendAshkhasNew()
	Try
		Sendtype="SendAshkhasNew"
		If MCode.C_Tafzili=0 Then
			Dim Cu As Cursor = MCode.Result("SELECT fldCodetafzili as FldCodeTafzili,fldSharheTafzili as FldSharheTafzili,fldVisitor as FldVisitor,fldTell as FldTell,FldMobile,FldC_Meli,FldC_Posti,FldShomarehesab,FldLat,FldLon,fldAdress as FldAddress,fldCodeGroup as FldCodeGroup FROM TblAshkhas where FldSync='False'")			
			'fldCodetafzili,fldSharheTafzili,fldVisitor,fldTell,FldMobile,FldC_Meli,FldC_Posti,FldShomarehesab,fldAdress,fldMande,fldCodeGroup,fldNameGroup,FldLat,FldLon,FldSync
			Cu.Position=0
			If Cu.RowCount>0 Then
				'ProgressDialogShow2("در حال ارسال اشخاص جدید",False)
				SendAshkhasNew(MCode.DtToJson(Cu))
			End If
		Else if MCode.C_Tafzili.Length>0 Then
			If MCode.C_Tafzili.Length>5 Then
				Dim Cu As Cursor = MCode.Result("SELECT fldCodetafzili as FldCodeTafzili,fldSharheTafzili as FldSharheTafzili,fldVisitor as FldVisitor,fldTell as FldTell,FldMobile,FldC_Meli,FldC_Posti,FldShomarehesab,FldLat,FldLon,fldAdress as FldAddress,fldCodeGroup as FldCodeGroup FROM TblAshkhas where fldCodetafzili='"& MCode.C_Tafzili & "' and FldSync='False'")
				Cu.Position=0
				If Cu.RowCount>0 Then
					'ProgressDialogShow2("در حال ارسال اشخاص جدید",False)
					SendAshkhasNew(MCode.DtToJson(Cu))				
				End If
				
			End If
		End If
	Catch
		Log(LastException)
	End Try
End Sub

Sub LoadSend(ShomareFacktor As Int)
	Try
		StopService(FusedLocationService)
	Sendtype="Faktor"
	shomareFactorSelect=ShomareFacktor
	If shomareFactorSelect=0 Then
			Dim Cu As Cursor = MCode.Result("SELECT fldCodetafzili as FldCodeTafzili,fldSharheTafzili as FldSharheTafzili,fldVisitor as FldVisitor,fldTell as FldTell,FldMobile,FldC_Meli,FldC_Posti,FldShomarehesab,FldLat,FldLon,fldAdress as FldAddress,fldCodeGroup as FldCodeGroup FROM TblAshkhas where FldSync='False'")
			
			'fldCodetafzili,fldSharheTafzili,fldVisitor,fldTell,FldMobile,FldC_Meli,FldC_Posti,FldShomarehesab,fldAdress,fldMande,fldCodeGroup,fldNameGroup,FldLat,FldLon,FldSync
			Cu.Position=0
		If Cu.RowCount>0 Then
			'ProgressDialogShow2("در حال ارسال اشخاص جدید",False)
			SendAshkhasNew(MCode.DtToJson(Cu))		
		Else
			'MCode.C_Tafzili=0
			LoadSendFaktorAll
		End If
	Else if shomareFactorSelect>0 Then	
			If MCode.C_Tafzili.Length>5 Then
				Dim Cu As Cursor = MCode.Result("SELECT fldCodetafzili as FldCodeTafzili,fldSharheTafzili as FldSharheTafzili,fldVisitor as FldVisitor,fldTell as FldTell,FldMobile,FldC_Meli,FldC_Posti,FldShomarehesab,FldLat,FldLon,fldAdress as FldAddress,fldCodeGroup as FldCodeGroup FROM TblAshkhas where fldCodetafzili='"& MCode.C_Tafzili & "'")
				Cu.Position=0
				If Cu.RowCount>0 Then
					'ProgressDialogShow2("در حال ارسال اشخاص جدید",False)
					SendAshkhasNew(MCode.DtToJson(Cu))
				Else
					LoadSendFaktor(ShomareFacktor)
				End If
				Else
				LoadSendFaktor(ShomareFacktor)
			End If			
		
		End If
	Catch
		Log(LastException)
		myCode.SendError(LastException,"Service_Server-LoadSend")
	End Try
End Sub
Sub LoadSend2(CodeTafzili As String)
	Try
		StopService(FusedLocationService)
		Sendtype="Faktor"
	
		Dim Cu As Cursor = MCode.Result("SELECT fldCodetafzili as FldCodeTafzili,fldSharheTafzili as FldSharheTafzili,fldVisitor as FldVisitor,fldTell as FldTell,FldMobile,FldC_Meli,FldC_Posti,FldShomarehesab,FldLat,FldLon,fldAdress as FldAddress,fldCodeGroup as FldCodeGroup FROM TblAshkhas where FldSync='False' and fldCodetafzili="& CodeTafzili)
		MCode.C_Tafzili=CodeTafzili
		'fldCodetafzili,fldSharheTafzili,fldVisitor,fldTell,FldMobile,FldC_Meli,FldC_Posti,FldShomarehesab,fldAdress,fldMande,fldCodeGroup,fldNameGroup,FldLat,FldLon,FldSync
		Cu.Position=0
		If Cu.RowCount>0 Then
			'ProgressDialogShow2("در حال ارسال اشخاص جدید",False)
			SendAshkhasNew(MCode.DtToJson(Cu))
		Else
			'MCode.C_Tafzili=0
			LoadSendFaktorAll2(CodeTafzili)
		End If

	Catch
		Log(LastException)
		myCode.SendError(LastException,"Service_Server-LoadSend2") 
	End Try
End Sub


Sub LoadSendFaktor(ShomareFacktor As String)
	Try
	Dim ListJson As List
	ListJson.Initialize
		Dim Cu As Cursor
		MCode.SaveUpdate("Update TblFaktor Set FldSend='0',FldSync='False' where FldShomareFaktor = '"& ShomareFacktor &"'")
	'"Select FldId,FldRadif,FldShomareFaktor,FldVaziatPardakht,FldC_Tafzili,FldN_Tafzili,FldCodeKala,FldNameKala,FldFeeForoosh,FldTedadDarKarton,FldTedadDarSabadJoz,FldTedadDarSabadKol,FldTarikh,FldLat,FldLon,FldSend,FldTozihat,FldTozih From TblFaktor Where FldSend = 0"
	'Dim Cu As Cursor = MCode.Result("Select FldId,FldRadif,FldShomareFaktor,FldVaziatPardakht,FldC_Tafzili,FldN_Tafzili,FldCodeKala,FldNameKala,Cast(Round(FldFeeForoosh,'"& MCode.RaghamAshar &"') As Int) As FldFeeForoosh,FldTedadDarKarton,FldTedadDarSabadJoz,FldTedadDarSabadKol,FldTarikh,FldLat,FldLon,FldSend,FldTozihat,FldTozih From TblFaktor Where FldSend = 0")
		'Dim Cu As Cursor = MCode.Result("Select FldId,FldRadif,FldShomareFaktor,FldVaziatPardakht,FldC_Tafzili,FldN_Tafzili,FldCodeKala,FldNamekala,Cast(Round(FldFeeForoosh,'"& MCode.RaghamAshar &"') As Int) As FldFeeForoosh,FldTedadDarKarton,FldTedadDarSabadJoz,FldTedadDarSabadKol,FldTozihat,FldTarikh,FldLat,FldLon,FldSend,FldTozih From TblFaktor Where FldSend = 0")
		If MCode.CheckAdmin=1 Then
			Cu = MCode.Result("Select FldRadif,FldShomareFaktor,FldVaziatPardakht,FldC_Tafzili,'' as FldN_Tafzili,FldCodeKala,FldNamekala,Cast(Round(FldFeeForoosh,'"& MCode.RaghamAshar &"') As Int) As FldFeeForoosh,FldTedadDarKarton,FldTedadDarSabadJoz,FldTedadDarSabadKol,FldTozihat,FldDate as FldTarikh,FldTime as fldTime,'0' as FldLat,'0' as FldLon,FldTozih,FldShomareBargasht,FldDarsadTakhfif,FldType as fldType,FldMablaghTakhfif,FldAmani,FldSumMablaghTakhfifVizhe ,FldSumMablaghTakhfifKala ,FldTotalFaktor ,FldMablaghTakhfifKol,fldShomareForoosh,0 as fldSignatureBitmapString,-1 as fldShomareFactorReal,fldArzeshAfzode,fldDarsadArzeshAfzode  From TblFaktor Where FldShomareFaktor ="&ShomareFacktor)
		Else
			Cu = MCode.Result("Select FldRadif,FldShomareFaktor,FldVaziatPardakht,FldC_Tafzili,'' as FldN_Tafzili,FldCodeKala,FldNamekala,Cast(Round(FldFeeForoosh,'"& MCode.RaghamAshar &"') As Int) As FldFeeForoosh,FldTedadDarKarton,FldTedadDarSabadJoz,FldTedadDarSabadKol,FldTozihat,FldDate as FldTarikh,FldTime as fldTime,'0' as FldLat,'0' as FldLon,FldTozih,FldShomareBargasht,FldDarsadTakhfif,FldType as fldType,FldMablaghTakhfif,FldAmani,FldSumMablaghTakhfifVizhe ,FldSumMablaghTakhfifKala ,FldTotalFaktor ,FldMablaghTakhfifKol,fldShomareForoosh,0 as fldSignatureBitmapString,fldArzeshAfzode,fldDarsadArzeshAfzode  From TblFaktor Where FldShomareFaktor ="&ShomareFacktor)
		End If
		
		
		
'	Dim Cu As Cursor = MCode.Result("Select FldRadif,FldShomareFaktor,FldVaziatPardakht,FldC_Tafzili,FldN_Tafzili,FldCodeKala,FldNamekala,Cast(Round(FldFeeForoosh,'"& MCode.RaghamAshar &"') As Int) As FldFeeForoosh,FldTedadDarKarton,FldMablaghTakhfifKol,FldTedadDarSabadJoz,FldTedadDarSabadKol,FldTozihat,FldTarikh,FldTime as fldTime,FldLat,FldLon,FldTozih,FldShomareBargasht,FldType as fldType From TblFaktor Where FldShomareFaktor ="&ShomareFacktor)
	If Cu.RowCount>0 Then
	'	ProgressDialogShow2("در حال ارسال فاکتور ها",False)
		SendFaktor(MCode.DtToJson(Cu))
	Else
		ToastMessageShow("فاکتور جهت ارسال موجود نمی باشد",True)
		ProgressDialogHide		
		End If
	Catch
		Log(LastException)
		myCode.SendError(LastException,"Service_Server-LoadSendFaktor")
	End Try
	ProgressDialogHide
End Sub

Sub SendAshkhasNew(Str As String)
	jobInternet.JobName ="SendAshkhasNew"
	Log(Str)
	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/SaveAshkhasNew4","JsonDt=" & Str & "&Imei=" & MCode.DeviceId)
	Request(jobInternet)
End Sub

Sub GetReportVisitor(DateAz As String,DateTa As String)
	jobInternet.JobName ="GetReportVisitor"
	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetReportVisitor1","Imei=" & MCode.DeviceId &" &CodeVisitor="&MCode.C_Visitor & " &DateAz="&DateAz &" &DateTa=" &DateTa)
	Request(jobInternet)
End Sub

Sub LoadGetReportVisitor(Str As String)
	Try
	Dim RowsList As List
	MCode.Json.Initialize(Str.Trim )
	RowsList = MCode.Json.NextArray

	'MCode.UpdateSetting
	CallSubDelayed2(Act_ReportVisitor2,"CreateList",RowsList)
		ToastMessageShow("گزارش ویزیتور با موفقیت دریافت گردید",True)
	Catch
		Log(LastException)
		myCode.SendError(LastException,"Service_Server-LoadGetReportVisitor")
	End Try
End Sub

Sub GetReportMoshtari(DateAz As String,DateTa As String)
	jobInternet.JobName ="GetReportMoshtari"
	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetReportMoshtari2","Imei=" & MCode.DeviceId &" &CodeVisitor="&MCode.C_Visitor &" &CodeTafsili="&MCode.CodeMoshtariSelect & " &DateAz="&DateAz &" &DateTa=" &DateTa)
End Sub

Sub LoadGetReportMoshtari(Str As String)
	Try
	Dim RowsList As List
	MCode.Json.Initialize(Str.Trim )
	RowsList = MCode.Json.NextArray

	'MCode.UpdateSetting
	'CallSubDelayed2(Act_ReportVisitor,"LoadData",RowsList)
		ToastMessageShow("گزارش مشتری با موفقیت دریافت گردید",True)
	Catch
		Log(LastException)
		myCode.SendError(LastException,"Service_Server-LoadGetReportMoshtari")
	End Try
End Sub
	
Sub GetReportFactor(DateAz As String,DateTa As String)
	jobInternet.JobName ="GetReportFactor"
	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetReportFactor","Imei=" & MCode.DeviceId &" &CodeVisitor="&MCode.C_Visitor &" &CodeTafsili="&MCode.CodeMoshtariSelect & " &DateAz="&DateAz &" &DateTa=" &DateTa)
	Request(jobInternet)
End Sub

Sub LoadGetReportFactor(Str As String)
	Try
	Dim RowsList As List
	MCode.Json.Initialize(Str.Trim )
	RowsList = MCode.Json.NextArray

	'MCode.UpdateSetting
	If MCode.page="Act_ReportVisitor" Then
		CallSubDelayed2(Act_ReportVisitor,"LoadFactor",RowsList)
	Else If MCode.page="Act_RepFactors" Then
		CallSubDelayed2(Act_RepFactors,"LoadData",RowsList)
	End If

		ToastMessageShow("گزارش مشتری با موفقیت دریافت گردید",True)
	Catch
		Log(LastException)
		myCode.SendError(LastException,"Service_Server-LoadGetReportFactor")
	End Try
	ProgressDialogHide
End Sub

Sub GetReportRizePishFactor(ShomareFactor As String)
	jobInternet.JobName ="GetReportRizePishFactor"
	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetReportRizePishFactor","Imei=" & MCode.DeviceId &" &CodeVisitor="&MCode.C_Visitor &" &CodeTafsili="&MCode.C_Tafzili & " &fldShomarehFactor="&ShomareFactor )
	Request(jobInternet)
End Sub

Sub LoadGetReportRizePishFactor(Str As String)
	Try
	Dim RowsList As List
	MCode.Json.Initialize(Str.Trim )
	RowsList = MCode.Json.NextArray

	'MCode.UpdateSetting
	CallSubDelayed2(Act_RizFaktor,"LoadData",RowsList)
		ToastMessageShow("گزارش فاکتور مشتری با موفقیت دریافت گردید",True)
	Catch
		Log(LastException)
		myCode.SendError(LastException,"Service_Server-LoadGetReportRizePishFactor")
	End Try
	'ProgressDialogHide
End Sub

Sub GetReportRizePishFactor3
	jobInternet.JobName ="GetReportRizePishFactor3"
	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetRizReportFactor6","Imei=" & MCode.DeviceId &" &CodeVisitor="&MCode.C_Visitor)
	Request(jobInternet)
End Sub

Sub LoadGetReportRizePishFactor3(Str As String)
	Try
		Dim RowsList As List
		Dim Row As Map
	MCode.Json.Initialize(Str.Trim )
	RowsList = MCode.Json.NextArray
	Dim lst As List
	lst.Initialize
		MCode.SaveUpdate("Delete From TblFaktor where FldSync='True'")
		For i = 0 To RowsList.Size - 1
			Row=RowsList.Get(i)
	
			
		If Row.Get("fldTedadJoz")>0 Or Row.Get("fldTedadCarton")>0 Then
			#region ----------------------
			
			Dim m As Map
			m.Initialize
			m.Put("FldRadif",Row.Get("fldRadif"))
			m.Put("FldC_Visitor",Row.Get("fldCodeVasete"))
			m.Put("FldC_Tafzili",Row.Get("fldCodeTafsili"))
			m.Put("FldN_Tafzili",Row.Get("fldSharheTafzili"))
			m.Put("FldShomareFaktor",Row.Get("fldShomareFactor"))
			m.Put("FldShomareBargasht",Row.Get("fldShomareBargasht"))
			m.Put("FldCodeKala",Row.Get("fldCodeKala"))
			m.Put("FldNameKala",Row.Get("fldSharhKala"))
			m.Put("FldFeeForoosh",Row.Get("fldFeeJoz"))
			m.Put("fldFeeBadAzTakhfif",Row.Get("fldFeeBadAzTakhfif"))
			m.Put("FldMablaghTakhfif",Row.Get("fldMablaghTakhfif"))	
			m.Put("FldTedadDarSabadJoz",Row.Get("fldTedadJoz"))
			m.Put("FldTedadDarSabadKol",Row.Get("fldTedadCarton"))
			m.Put("FldTedadDarkarton",Row.Get("FldTedadDarKarton"))
			m.Put("FldTotalFaktor",Row.Get("FldTotalFaktor"))
			m.Put("FldTozihat",Row.Get("fldTozihatRecord"))
			m.Put("FldTozih",Row.Get("FldTozihat"))
			m.Put("FldNameVahed",Row.Get("fldNameVahed1"))
			m.Put("FldNameVahed2",Row.Get("fldNameVahed2"))
			m.Put("FldVaziatPardakht",Row.Get("fldNahveTasvie"))
			m.Put("FldMablaghTakhfifKol",Row.Get("FldMablaghTakhfifKol"))
			m.Put("FldSumMablaghTakhfifVizhe",Row.Get("FldSumMablaghTakhfifVizhe"))
			m.Put("FldSumMablaghTakhfifKala",Row.Get("FldSumMablaghTakhfifKala"))
			m.Put("FldMablaghKol",Row.Get("FldTotalFaktor"))
			m.Put("FldDate",Row.Get("fldDate"))
			m.Put("FldTime",Row.Get("fldTime"))
			m.Put("FldSignatureBitmapString",Row.Get("FldSignatureBitmapString"))
			m.Put("fldArzeshAfzode",Row.Get("fldArzeshAfzode"))
			m.Put("fldDarsadArzeshAfzode",Row.Get("fldDarsadArzeshAfzode"))
			m.Put("FldSync","True")
		
			If myCode.Is_Null_adad(Row.Get("fldShomareBargasht"))>0 Then
				m.Put("WIsBacked","True")
			Else
				m.Put("WIsBacked","False")
			End If
		
			m.Put("FldType",Row.Get("fldType"))
			m.Put("FldAmani",Row.Get("FldAmani"))
			m.Put("fldShomareForoosh",Row.Get("fldShomareForoosh"))
			m.Put("WSendFrom",3)
				Log("fldShomareFactor: "&Row.Get("fldShomareFactor"))
			lst.Add(m)
			#end region ---------------------
		End If
	Next
	DBUtils.InsertMaps(MCode.Sql1,"TblFaktor",lst)
		
		Log("لیست سفارشات بروزرسانی گردید")
	Catch
		Log(LastException)
		myCode.SendError(LastException,"Service_Server-LoadGetReportRizePishFactor")
	End Try
End Sub

Sub GetSooratHesab(DateAz As String,DateTa As String)
'	jobInternet.JobName ="GetSooratHesab"
'	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetAndroid","Query=Select fldCodeTafzili,fldSharheTafzili,fldShomareFactor,fldMandeTalab,fldMablagheKolDaryafti,fldMandeTasfieNashode,fldDateSarResid From tblFactorTafsfieNashode" & "&Imei=" & MCode.DeviceId)

	jobInternet.JobName ="GetSooratHesab"
	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/ShowSooratHesabNew","Imei=" & MCode.DeviceId &" &CodeTafzili="&MCode.C_Tafzili& " &DateAz="&DateAz &" &DateTa=" &DateTa)
	Request(jobInternet)
End Sub

Sub LoadGetSooratHesab(Str As String)
	Try
	Dim RowsList As List
	MCode.Json.Initialize(Str.Trim )
	RowsList = MCode.Json.NextArray
	
	CallSubDelayed2(Act_ReportSoorathesab,"CreateList",RowsList)
		ToastMessageShow("گزارش صورتحساب مشتری با موفقیت دریافت گردید",True)
	Catch
		Log(LastException)
		myCode.SendError(LastException,"Service_Server-LoadGetSooratHesab")
	End Try
End Sub

Sub GetTourVisitor
	jobInternet.JobName ="GetTourVisitor"
	Dim date As String=MCode.DatePersian
	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetTourVisitor","Imei=" & MCode.DeviceId & "&CodeVisitor=" & MCode.C_Visitor & "&DateVisit=" & date)
	Request(jobInternet)
End Sub

Sub LoadGetTourVisitor(Str As String)
	Try
		Dim RowsList As List
		Dim Row As Map
		MCode.SaveUpdate("Delete From tblTourVisitor")
		MCode.Json.Initialize(Str.Trim )
		RowsList = MCode.Json.NextArray
		MCode.SaveUpdate("Delete From tblTourVisitor")
		DBUtils.InsertMaps(MCode.Sql1,"tblTourVisitor",RowsList)
		Log("لیست تور ویزیت دریافت گردید")
		ToastMessageShow("لیست تور ویزیت دریافت گردید",True)


'		Dim count As Int=MCode.SingleResult($"Select Count(Id) from tblTourVisitor where fldDateVisit=${MCode.DatePersian}"$)
'		If count=0 Then	
'			'insert	
'			DBUtils.InsertMaps(MCode.Sql1,"tblTourVisitor",RowsList)
'		Else if count=RowsList.Size Then
'			'update
'			Dim lst As List
'			lst.Initialize
'			For i = 0 To RowsList.Size - 1
'				Row=RowsList.Get(i)
'					Dim m As Map
'					Dim Where As Map
'					Where.Initialize
'					m.Initialize
'					m.Put("fldRadif", Row.Get("fldRadif"))
'					m.Put("fldCodeSuperVisor", Row.Get("fldCodeSuperVisor"))
'					m.Put("fldCodeVisitor", Row.Get("fldCodeVisitor"))
'					m.Put("fldCodeGroup", Row.Get("fldCodeGroup"))
'					m.Put("fldCodeTafzili", Row.Get("fldCodeTafzili"))
'					m.Put("fldDate", Row.Get("fldDate"))
'					m.Put("fldDateVisit", Row.Get("fldDateVisit"))
'					m.Put("fldTimeVisit", Row.Get("fldTimeVisit"))
'					m.Put("fldDateNextVisit", Row.Get("fldDateNextVisit"))
'					m.Put("fldDateTozie", Row.Get("fldDateTozie"))
'					m.Put("fldShomareSefaresh", Row.Get("fldShomareSefaresh"))
'					m.Put("fldTimeSefaresh", Row.Get("fldTimeSefaresh"))
'					m.Put("fldSharh", Row.Get("fldSharh"))
'					m.Put("fldVaziat", Row.Get("fldVaziat"))
'					m.Put("fldShomareFactor", Row.Get("fldShomareFactor"))
'					m.Put("fldType", Row.Get("fldType"))
'				Where.Put("fldType",Row.Get("fldType"))
'				Where.Put("fldRadif",Row.Get("fldRadif"))
'				Where.Put("fldDateVisit",MCode.DatePersian)
'				DBUtils.UpdateRecord2(MCode.Sql1,"tblTourVisitor",m,Where)
'			Next
'		
'			Log("لیست تور ویزیت بروزرسانی گردید")
'		Else If count<RowsList.Size Then
'			'add new tour
'			MCode.SaveUpdate("Delete From tblTourVisitor")
'			DBUtils.InsertMaps(MCode.Sql1,"tblTourVisitor",RowsList)
'		Else If count>RowsList.Size Then
'			'delete some rows
'			
'		End If

		
	Catch
		Log(LastException)
		myCode.SendError(LastException,"Service_Server-LoadGetBankMa")
	End Try
End Sub

Sub GetVisitor
	jobInternet.JobName ="GetVisitor"
	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetAndroid","Query=select FldC_Visitor,FldN_Visitor from TblSetting where len(FldImei)>5 " & "&Imei=" & MCode.DeviceId)
	Request(jobInternet)
End Sub

Sub LoadGetVisitor(Str As String)
	Try
	Dim RowsList As List
'	Dim Row As Map
	MCode.SaveUpdate("Delete From TblVisitor")
	MCode.Json.Initialize(Str.Trim )
	RowsList = MCode.Json.NextArray
	DBUtils.InsertMaps(MCode.Sql1,"TblVisitor",RowsList)
'	For i = 0 To RowsList.Size - 1
'		Row=RowsList.Get(i)
'		MCode.SaveUpdate("Insert Into TblVisitor (FldC_Visitor,FldN_Visitor) Values ('"& _
'		 Row.Get("FldC_Visitor") &"','"& Row.Get("FldN_Visitor") &"')")
'		Log(Row.Get("FldN_Visitor"))
'	Next
		Log("لیست ویزیتورها بروزرسانی گردید")
	Catch
		Log(LastException)
		myCode.SendError(LastException,"Service_Server-LoadGetVisitor")
	End Try
	'ToastMessageShow("گروه اشخاص بروزرسانی گردید",True)
End Sub

Sub ShowFactorForooshByHavale()
	jobInternet.JobName ="ShowFactorForooshByHavale"
	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/ShowFactorForooshByHavale","Imei=" & MCode.DeviceId & "&flag=" & MCode.GetHavaleFlag &"&ShomareHavale=" & MCode.ShomareHavale)
	Request(jobInternet)
End Sub

Sub LoadShowFactorForooshByHavale(Str As String)
	Try
		Dim RowsList As List
		MCode.Json.Initialize(Str.Trim )
		RowsList = MCode.Json.NextArray
	
		CallSubDelayed2(Act_RizHavale,"LoadData",RowsList)
		'ToastMessageShow("گزارش سفارش ویزیتور با موفقیت دریافت گردید",True)
	Catch
		Log(LastException)
		myCode.SendError(LastException,"Service_Server-LoadShowFactorForooshByHavale")
	End Try
	ToastMessageShow("ریز حواله ی توزیع دریافت گردید",True)
End Sub


Sub GetHavaleByUser
	jobInternet.JobName ="GetHavaleByUser"
	Dim DateUpdate As String=""
	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/ShowHavaleGoroohiByRanadeh","&Imei=" & MCode.DeviceId & "&flag=" & MCode.GetHavaleFlag & "&DateUpdate=" & DateUpdate)
	Request(jobInternet)
End Sub

Sub LoadGetGetHavale(Str As String)
	Try
		Dim RowsList As List
'		Dim Row As Map
		MCode.SaveUpdate("Delete From TblHavale")
		MCode.Json.Initialize(Str.Trim )
		RowsList = MCode.Json.NextArray
		DBUtils.InsertMaps(MCode.Sql1,"TblHavale",RowsList)
'		For i = 0 To RowsList.Size - 1
'			Row=RowsList.Get(i)
'			
'			MCode.SaveUpdate("Insert Into TblHavale (fldShomareHavale,fldDate,fldVaziat,fldMandeFactor,fldCountFactor) Values ('"& _
'		 Row.Get("fldShomareHavale") &"','"& Row.Get("fldDate") &"','"& Row.Get("fldVaziat") &"','"& Row.Get("fldMandeFactor") &"','"& Row.Get("fldCountFactor") &"')")
'			Log(Row.Get("fldShomareHavale"))
'		Next
		Log("لیست حواله بروزرسانی گردید")
		'CallSubDelayed(Act_HavaleTozie,"LoadFilter")
	Catch
		Log(LastException)
		myCode.SendError(LastException,"Service_Server-LoadGetVisitor")
	End Try
'	ToastMessageShow("لیست حواله بروزرسانی گردید",True)
End Sub

Sub GetBankMa
	jobInternet.JobName ="GetBankMa"
	Dim DateUpdate As String=""
	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetStoredTozieFast","NameStored=ShowBankeMa"&"&Imei=" & MCode.DeviceId & "&flag=" & MCode.GetHavaleFlag & "&LastDateUpdate=" & DateUpdate)
	Request(jobInternet)
End Sub

Sub LoadGetBankMa(Str As String)
	Try
		Dim RowsList As List
'		Dim Row As Map
		MCode.SaveUpdate("Delete From TblBankMa")
		MCode.Json.Initialize(Str.Trim )
		RowsList = MCode.Json.NextArray
		DBUtils.InsertMaps(MCode.Sql1,"TblBankMa",RowsList)
		Log("لیست بانک ما دریافت گردید")
'		ToastMessageShow("لیست بانک ما دریافت گردید",True)
	Catch
		Log(LastException)
		myCode.SendError(LastException,"Service_Server-LoadGetBankMa")
	End Try
End Sub

Sub GetBankMoshtari
	jobInternet.JobName ="GetBankMoshtari"
	Dim DateUpdate As String=""
	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetStoredTozieFast","NameStored=ShowBankeMoshtari"&"&Imei=" & MCode.DeviceId & "&flag=" & MCode.GetHavaleFlag & "&LastDateUpdate=" & DateUpdate)
	Request(jobInternet)
End Sub

Sub LoadGetBankMoshtari(Str As String)
	Try
		Dim RowsList As List
'		Dim Row As Map
		MCode.SaveUpdate("Delete From TblBankMoshtari")
		MCode.Json.Initialize(Str.Trim )
		RowsList = MCode.Json.NextArray
		DBUtils.InsertMaps(MCode.Sql1,"TblBankMoshtari",RowsList)
		Log("لیست بانک مشتری دریافت گردید")
		ToastMessageShow("لیست بانک مشتری دریافت گردید",True)
	Catch
		Log(LastException)
		myCode.SendError(LastException,"Service_Server-LoadGetBankMoshtari")
	End Try
End Sub

Sub GetSandoogh
	jobInternet.JobName ="GetSandoogh"
	Dim DateUpdate As String=""
	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetStoredTozieFast","NameStored=ShowListSandoogh"&"&Imei=" & MCode.DeviceId & "&flag=" & MCode.GetHavaleFlag & "&LastDateUpdate=" & DateUpdate)
	Request(jobInternet)
End Sub

Sub LoadGetSandoogh(Str As String)
	Try
		Dim RowsList As List
'		Dim Row As Map
		MCode.SaveUpdate("Delete From TblSandoogh")
		MCode.Json.Initialize(Str.Trim )
		RowsList = MCode.Json.NextArray
		DBUtils.InsertMaps(MCode.Sql1,"TblSandoogh",RowsList)
		Log("لیست صندوق دریافت گردید")
'		ToastMessageShow("لیست صندوق دریافت گردید",True)
	Catch
		Log(LastException)
		myCode.SendError(LastException,"Service_Server-LoadGetSandoogh")
	End Try
End Sub

Sub ShowRizeFactorForooshByHavale()
	jobInternet.JobName ="ShowRizFactorForooshByHavale"
	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/ShowRizFactorForooshByHavale","Imei=" & MCode.DeviceId)
	Request(jobInternet)
End Sub

Sub LoadShowRizeFactorForooshByHavale(Str As String)
	Try
		Dim RowsList As List
		MCode.SaveUpdate("Delete From TblRizFactorHavale")
		MCode.Json.Initialize(Str.Trim )
		RowsList = MCode.Json.NextArray
		DBUtils.InsertMaps(MCode.Sql1,"TblRizFactorHavale",RowsList)
		Log("ریز فاکتور های حواله دریافت گردید")
		'CallSubDelayed2(Act_RizeFactorHavale,"LoadData",RowsList)
		'ToastMessageShow("گزارش سفارش ویزیتور با موفقیت دریافت گردید",True)
	Catch
		Log(LastException)
		myCode.SendError(LastException,"Service_Server-LoadShowFactorForooshByHavale")
	End Try
	'ToastMessageShow("گروه اشخاص بروزرسانی گردید",True)
End Sub

Sub GetReportFactorVisitor(DateAz As String,DateTa As String)
'	jobInternet.JobName ="GetSooratHesab"
'	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetAndroid","Query=Select fldCodeTafzili,fldSharheTafzili,fldShomareFactor,fldMandeTalab,fldMablagheKolDaryafti,fldMandeTasfieNashode,fldDateSarResid From tblFactorTafsfieNashode" & "&Imei=" & MCode.DeviceId)

	jobInternet.JobName ="GetReportFactorVisitor"
	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetReportFactor2","Imei=" & MCode.DeviceId &" &CodeVisitor="&MCode.CodeVisitorSelect& " &DateAz="&DateAz &" &DateTa=" &DateTa)
	Request(jobInternet)
End Sub

Sub LoadGetReportFactorVisitor(Str As String)
	Try
	Dim RowsList As List
	MCode.Json.Initialize(Str.Trim )
	RowsList = MCode.Json.NextArray
	
	CallSubDelayed2(Act_RepFactorVisitor,"CreateList",RowsList)
		ToastMessageShow("گزارش سفارش ویزیتور با موفقیت دریافت گردید",True)
	Catch
		Log(LastException)
		myCode.SendError(LastException,"Service_Server-LoadGetReportFactorVisitor")
	End Try
End Sub

Sub GetReportRizFactorVisitor(date As String)
'	jobInternet.JobName ="GetSooratHesab"
'	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetAndroid","Query=Select fldCodeTafzili,fldSharheTafzili,fldShomareFactor,fldMandeTalab,fldMablagheKolDaryafti,fldMandeTasfieNashode,fldDateSarResid From tblFactorTafsfieNashode" & "&Imei=" & MCode.DeviceId)

	jobInternet.JobName ="GetReportRizFactorVisitor"
	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetRizReportFactor4","Imei=" & MCode.DeviceId &" &CodeVisitor="&MCode.C_Visitor& " &ShomareFactor="&MCode.FaktorSelect& " &fldDate="&date)
	Request(jobInternet)
End Sub

Sub LoadGetReportRizFactorVisitor(Str As String)
	Try
	Dim RowsList As List
	MCode.Json.Initialize(Str.Trim )
	RowsList = MCode.Json.NextArray
	
	CallSubDelayed2(Act_RepRizFactorVisitor,"LoadData",RowsList)
		ToastMessageShow("گزارش سفارش ویزیتور با موفقیت دریافت گردید",True)
	Catch
		Log(LastException)
		myCode.SendError(LastException,"Service_Server-LoadGetReportRizFactorVisitor")
	End Try
End Sub

Sub GetListGpsVisitor
	jobInternet.JobName ="GetListGpsVisitor"
	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetListGpsVisitor","Imei=" & MCode.DeviceId &" &CodeVisitor="&MCode.CodeVisitorSelect &" &DateTa="&MCode.GpsDateTa &" &TimeAz="&MCode.GpsTimeAz &" &TimeTa="&MCode.GpsTimeTa &" &Count="&MCode.CountShowGpsMap)
	Request(jobInternet)
End Sub

Sub LoadGetListGpsVisitor(Str As String)
	Try
	Dim RowsList As List
	MCode.Json.Initialize(Str.Trim )
	RowsList = MCode.Json.NextArray
	
	CallSubDelayed2(Act_LocationVisitor,"LoadData",RowsList)
		ToastMessageShow("مسیر حرکت ویزیتور با موفقیت دریافت گردید",True)
	Catch
		Log(LastException)
		myCode.SendError(LastException,"Service_Server-LoadGetReportRizFactorVisitor")
	End Try
End Sub

Sub GetVideoAmoozesh
	jobInternet.JobName ="GetVideoAmoozesh"
	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetVideoAmoozesh","Imei=" & MCode.DeviceId)
	Request(jobInternet)
End Sub

Sub LoadGetVideoAmoozesh(Str As String)
	Try
	Dim RowsList As List
	MCode.Json.Initialize(Str.Trim )
	RowsList = MCode.Json.NextArray
	
	CallSubDelayed2(Act_Video,"LoadData",RowsList)
		ToastMessageShow("لیست ویدیوهای آموزشی با موفقیت دریافت گردید",True)
	Catch
		Log(LastException)
		myCode.SendError(LastException,"Service_Server-LoadGetReportRizFactorVisitor")
	End Try
End Sub

Sub GetPicFTPForAndroid
	jobInternet.JobName ="GetPicFTPForAndroid"
	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetPicFTPForAndroid","CodeMoshtari=" & MCode.CodeMoshtari & "&Type=kala")
	Request(jobInternet)
End Sub

Sub LoadGetPicFTPForAndroid(Str As String)
	Try
	Dim RowsList As List
	Dim Row As Map
	MCode.Json.Initialize(Str.Trim )
	RowsList = MCode.Json.NextArray
'		FldLinkPicKala
		Row=RowsList.Get(0)
		MCode.SaveUpdate("Update TblSetting Set FldLinkPicKala='"&Row.Get("fldLink") & "' where FldId=1")
		MCode.ImageUrl=Row.Get("fldLink")
		Log(MCode.ImageUrl)
	Catch
		Log(LastException)
		myCode.SendError(LastException,"Service_Server-LoadGetPicFTPForAndroid")
	End Try
End Sub

Sub SendUpdateQuery(query As String)
	jobInternet.JobName ="SendUpdateQuery"
	Log(query)
	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/UpdateQuery","Query="&query &" &Imei=" & MCode.DeviceId )
	Request(jobInternet)
End Sub

Sub SaveAndroidLog(item As AdapterAndroidLog)
	jobInternet.JobName ="SaveAndroidLog"
	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/SaveAndroidLog","Imei=" & MCode.DeviceId &" &CodeVisitor=" & MCode.C_Visitor&" &NameVisitor=" & MCode.N_Visitor&" &ShomareMoshtari=" & MCode.CodeMoshtari&" &Date1=" & item.date&" &Time1=" & item.time&" &Message=" & item.message&" &action=" & item.action &" &Version=" & MCode.Version &" &VersionNumber=" & MCode.NumberVersion)
	Request(jobInternet)
End Sub

Sub SaveVersionAndroidInfo
	jobInternet.JobName ="SaveVersionAndroidInfo"
	Dim Cur As Cursor
	
	Cur=MCode.Result("Select * From TblSetting")
	Cur.Position=0
	Log(Cur.GetString("FldImei"))
	Log(Cur.GetString("FldC_Visitor"))
	Log(Cur.GetString("FldN_Visitor"))
	Log(Cur.GetString("FldCodeMoshtari"))
	Log(Cur.GetString("fldLastVersion"))
	Log(Cur.GetString("fldDateSetup"))
	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/SaveVersionAndroidInfo","Imei=" & Cur.GetString("FldImei") &" &CodeVisitor=" & Cur.GetString("FldC_Visitor")&" &NameVisitor=" & Cur.GetString("FldN_Visitor")&" &ShomareMoshtari=" & Cur.GetString("FldCodeMoshtari")&" &DateVersion=" & MCode.DateVersion.Replace("/","") &" &DateSetup=" & Cur.GetString("fldDateSetup") &" &Version=" & MCode.Version &" &VersionNumber=" & MCode.NumberVersion &" &LastVersion=" & Cur.GetString("fldLastVersion") &" &TypeVersion=" & MCode.TypeVersion)
End Sub

Sub SaveLocationMoshtari(Lat As String,Lon As String)
	Sleep(100)
	jobInternet.JobName ="SaveLocationMoshtari"
	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/SaveLocationMoshtari","C_Tafzili="& MCode.C_Tafzili & " &Lat=" & Lat & " &Lon=" & Lon & " &Imei=" & MCode.DeviceId)
	Request(jobInternet)
End Sub

Sub LoadSendDaryaft(StrDtDaryaft As String,StrDtCheckDaryaft As String)
	Try
		Sendtype="Daryaft"
		dt1=StrDtDaryaft
		dt2=StrDtCheckDaryaft
		If shomareFactorSelect=0 Then
			Dim Cu As Cursor = MCode.Result("SELECT fldCodetafzili as FldCodeTafzili,fldSharheTafzili as FldSharheTafzili,fldVisitor as FldVisitor,fldTell as FldTell,FldMobile,FldC_Meli,FldC_Posti,FldShomarehesab,FldLat,FldLon,fldAdress as FldAddress,fldCodeGroup as FldCodeGroup FROM TblAshkhas where fldCodetafzili="&MCode.C_Tafzili &" and FldSync='False'")
			'fldCodetafzili,fldSharheTafzili,fldVisitor,fldTell,FldMobile,FldC_Meli,FldC_Posti,FldShomarehesab,fldAdress,fldMande,fldCodeGroup,fldNameGroup,FldLat,FldLon,FldSync
			Cu.Position=0
			If Cu.RowCount>0 Then
				'ProgressDialogShow2("در حال ارسال اشخاص جدید",False)
				SendAshkhasNew(MCode.DtToJson(Cu))
			Else
				'MCode.C_Tafzili=0
				SendDaryaft(StrDtDaryaft,StrDtCheckDaryaft)
			End If
		Else if shomareFactorSelect>0 Then
			SendDaryaft(StrDtDaryaft,StrDtCheckDaryaft)
		End If
	Catch
		Log(LastException)
		myCode.SendError(LastException,"Service_Server-LoadSend")
	End Try
End Sub

Sub SendDaryaft(StrDtDaryaft As String,StrDtCheckDaryaft As String)
	jobInternet.JobName ="SendDaryaft"
	Log(StrDtDaryaft)
	Log(StrDtCheckDaryaft)
	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/SaveDaryaft2","JsonDaryaftDt=" & StrDtDaryaft & "&JsonCheckDaryaftDt=" & StrDtCheckDaryaft & "&Imei=" & MCode.DeviceId)
	Request(jobInternet)
End Sub

Sub LoadSendTourVisitor
	Try
		Dim Cu As Cursor = MCode.Result($"SELECT tblTourVisitor.fldRadif,tblTourVisitor.fldCodeSuperVisor,tblTourVisitor.fldCodeVisitor,tblTourVisitor.fldCodeGroup,tblTourVisitor.fldCodeTafzili,TblAshkhas.fldSharheTafzili,tblTourVisitor.fldDate,tblTourVisitor.fldDateVisit,tblTourVisitor.fldTimeVisit,tblTourVisitor.fldDateNextVisit,tblTourVisitor.fldDateTozie,tblTourVisitor.fldShomareSefaresh,tblTourVisitor.fldTimeSefaresh,tblTourVisitor.fldSharh,tblTourVisitor.fldVaziat,tblTourVisitor.fldShomareFactor,tblTourVisitor.fldType,TblAshkhas.FldLat,TblAshkhas.FldLon FROM TblAshkhas,tblTourVisitor WHERE TblAshkhas.fldCodetafzili = tblTourVisitor.fldCodeTafzili AND fldDateVisit = ${MCode.DatePersian} and tblTourVisitor.fldSend='False' ORDER BY tblTourVisitor.fldRadif ASC"$)
	If Cu.RowCount>0 Then
	SendTourVisitor(MCode.DtToJson(Cu))
	End If
	Catch
		Log(LastException)
		myCode.SendError(LastException,"Service_Server-LoadSend")
	End Try
End Sub



Sub SendTourVisitor(StrDtTourVisitor As String)
	jobInternet.JobName ="SendTourVisitor"
	Log(StrDtTourVisitor)
	
	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/SaveTourFromAndroid","JsonDt=" & StrDtTourVisitor & "&Imei=" & MCode.DeviceId)
	Request(jobInternet)
End Sub




Public Sub GetVersion(strType As String)
	jobInternet.JobName ="GetVersion"
	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/Version","Imei=" & MCode.DeviceId &" &Type="&strType)
	Request(jobInternet)
End Sub

Public Sub GetDaftarchTell
	jobInternet.JobName ="GetDaftarchTell"
	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetDaftarchTell","Imei=" & MCode.DeviceId)
	Request(jobInternet)
End Sub

Sub LoadGetDaftarchTell(Str As String)
	Try
		Dim RowsList As List
'	Dim Row As Map
		MCode.SaveUpdate("Delete From tblDaftarcheTell")
		MCode.Json.Initialize(Str.Trim )
		RowsList = MCode.Json.NextArray
		DBUtils.InsertMaps(MCode.Sql1,"tblDaftarcheTell",RowsList)
		Log("دفترچه تلفن بروزرسانی گردید")
	Catch
		Log(LastException)
		myCode.SendError(LastException,"Service_Server-LoadGetDaftarchTell")
	End Try
End Sub

Public Sub GetGroupDastrasiAshkhas
	jobInternet.JobName ="GetGroupDastrasiAshkhas"
	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetGroupDastrasiAshkhas","Imei=" & MCode.DeviceId &" &CodeVisitor=" & MCode.C_Visitor)
	Request(jobInternet)
End Sub

Sub LoadGetGroupDastrasiAshkhas(Str As String)
	Try
		Dim RowsList As List
'	Dim Row As Map
		MCode.SaveUpdate("Delete From tblGroupDastrasi")
		MCode.Json.Initialize(Str.Trim )
		RowsList = MCode.Json.NextArray
		DBUtils.InsertMaps(MCode.Sql1,"tblGroupDastrasi",RowsList)
		Log("دسترسی گروه اشخاص بروزرسانی گردید")
	Catch
		Log(LastException)
		myCode.SendError(LastException,"Service_Server-LoadGetGroupDastrasiAshkhas")
	End Try
End Sub

Sub Request(j As HttpJob)
	Try
	Wait For (j) JobDone(j As HttpJob)
	If j.Success Then
		Try
		Dim Str As String = j.GetString
		Log(j.JobName)
		Select Case j.JobName
				
			Case "GetVersion"
				If Str <> "No Result" Then
					Log(Str)
					If MCode.page="act_setting" Then
						Dim RowsList As List
						MCode.Json.Initialize(Str.Trim )
						Dim item As AdapteVersion
						item.Initialize
						RowsList = MCode.Json.NextArray
						Dim Row As Map
						Row=RowsList.Get(0)
								
						MCode.linkposparsian=Row.Get("FldLink")
								
						CallSubDelayed(Act_Setting,"DownloadAppPos")
					End If
				End If
			
			Case "GetSetting"
				If Str = "No Result" Then
					ToastMessageShow("شما مجاز به استفاده از نرم افزار نمی باشید",True)
'						ProgressDialogHide
				Else
					'LoadGetSetting(Str)
					th.RunOnGuiThread("LoadGetSetting",Array As Object(Str))

						
				End If
						
			Case "GetTanzimatAndroid"
				If Str = "No Result" Then
'							ToastMessageShow("شما مجاز به استفاده از نرم افزار نمی باشید",True)
'						ProgressDialogHide
				Else
'							LoadGetTanzimatAndroid(Str)
					th.RunOnGuiThread("LoadGetTanzimatAndroid",Array As Object(Str))

				End If
				GetLinkFtp
			Case "SaveVersionAndroidInfo"
				If Str = "No Result" Then
					Log("اطلاعات نرم افزار ارسال نشد")
				Else
					Log("اطلاعات نرم افزار ارسال شد")
				End If
			Case "SaveAndroidLog"
				If Str = "No Result" Then
					Log("خطا ارسال نشد")
				Else
					Log("خطا ارسال شد")
				End If
			Case "SaveLocationMoshtari"
				If Str = "No Result" Then
					Log("خطا در ارسال موقعیت مشتری")
				Else If Str="Insert" Then
					Log("موقعیت مشتری با موفقیت ثبت شد")
				Else If Str="Update" Then
					Log("موقعیت مشتری بروزرسانی شد")
				End If
			Case "GetCurrentDate"
				Dim StrCurrentDate As String = j.GetString
				'StrError=StrCurrentDate
				If StrCurrentDate <> "No Result" Then
					datenow=StrCurrentDate
					
					If datenow.Length = 24 Then
						datenow=datenow.SubString2(0,23)
					End If
					Log("datenow: "&datenow)
						
				End If
				If	Act_Main.NoeGet="MojoodiAnbar" Then
					GetKala
				Else If Act_Main.NoeGet="UpdateFee" Then
					GetFee
				Else
					GetSetting
				End If
				
			Case "GetGoroohKala"
				If Str = "No Result" Then
					MCode.SaveUpdate("Delete From TblGoroohKala")
					ToastMessageShow("گروه کالا موجود نمی باشد",True)
					'ProgressDialogHide
				Else
					th.RunOnGuiThread("LoadGetGoroohKala",Array As Object(Str))
'						LoadGetGoroohKala(Str)
				End If
				GetKala
			Case "GetKala"
				If Str = "No Result" Then
					MCode.SaveUpdate("Delete From TblKala")
					ToastMessageShow("کالا موجود نمی باشد",True)
					'ProgressDialogHide
				Else
					th.RunOnGuiThread("LoadGetKala",Array As Object(Str))
'						LoadGetKala(Str)
				End If
				'If Act_Main.NoeGet="DaryaftEtlaat" Then
				GetGoroohAshkhas
				'End If
				
				
			Case "GetGoroohAshkhas"
				If Str = "No Result" Then
					MCode.SaveUpdate("Delete From TblGoroohAshkhas")
					ToastMessageShow("گروه اشخاص موجود نمی باشد",True)
					'ProgressDialogHide
				Else
					th.RunOnGuiThread("LoadGetGoroohAshkhas",Array As Object(Str))
'						LoadGetGoroohAshkhas(Str)
				End If
			
				GetAshkhas
			Case "GetAllNotification"
				If Str = "No Result" Then
					MCode.SaveUpdate("Delete From TblNotifi")
					'ToastMessageShow("گروه اشخاص موجود نمی باشد",True)
					'ProgressDialogHide
				Else
					th.RunOnGuiThread("LoadGetAllNotification",Array As Object(Str))
'						LoadGetAllNotification(Str)
				End If
				GetGalleryKala
			Case "GetGalleryKala"
				If Str = "No Result" Then
					MCode.SaveUpdate("Delete From tblGalleryPic")
					ToastMessageShow("گالری تصاویر موجود نمی باشد",True)
					'ProgressDialogHide
				Else
					th.RunOnGuiThread("LoadGetGalleryKala",Array As Object(Str))
'						LoadGetGalleryKala(Str)
				End If
			
				GetEshantion2
			Case "GetEshantion2"
				If Str = "No Result" Then
					MCode.SaveUpdate("Delete From tblEshantionTabaghati")
					ToastMessageShow("اشانتیون موجود نمی باشد",True)
					'ProgressDialogHide
					'ToastMessageShow("عملیات دریافت اطلاعات با موفقیت تکمیل شد",True)
				Else
'						LoadGetEshantion2(Str)
					th.RunOnGuiThread("LoadGetEshantion2",Array As Object(Str))
				End If
				GetDaftarchTell
			Case "GetDaftarchTell"
				If Str = "No Result" Then
					MCode.SaveUpdate("Delete From tblDaftarcheTell")
					ToastMessageShow("دفترچه تلفن موجود نمی باشد",True)
					'ProgressDialogHide
					'ToastMessageShow("عملیات دریافت اطلاعات با موفقیت تکمیل شد",True)
				Else
'						LoadGetDaftarchTell(Str)

					th.RunOnGuiThread("LoadGetDaftarchTell",Array As Object(Str))
				End If
				GetGroupDastrasiAshkhas
						
			Case "GetGroupDastrasiAshkhas"
				If Str = "No Result" Then
					MCode.SaveUpdate("Delete From tblGroupDastrasi")
'							    ToastMessageShow("دسترسی اشخاص موجود نمی باشد",True)
					'ProgressDialogHide
					'ToastMessageShow("عملیات دریافت اطلاعات با موفقیت تکمیل شد",True)
				Else
'						LoadGetGroupDastrasiAshkhas(Str)
						
					th.RunOnGuiThread("LoadGetGroupDastrasiAshkhas",Array As Object(Str))
				End If
				GetEshantionGroup
			Case "GetEshantionGroup"
				If Str = "No Result" Then
					MCode.SaveUpdate("Delete From tblEshantionGroup")
					ToastMessageShow("اشانتیون گروهی موجود نمی باشد",True)
					'ProgressDialogHide
					'ToastMessageShow("عملیات دریافت اطلاعات با موفقیت تکمیل شد",True)
				Else
					th.RunOnGuiThread("LoadGetEshantionGroup",Array As Object(Str))
'							LoadGetEshantionGroup(Str)
				End If
					
				If MCode.Visitor=1 Then
					GetReportRizePishFactor3
				Else
					If MCode.Tozie=1 Then
						GetHavaleByUser
					Else
						If MCode.Daryaft=1 Then
							GetDaryaft
						Else
							MCode.GetDataStatus=False
									StartService(Service_Helper)
							ProgressDialogHide
						End If
							
					End If
				End If
						
				
					
			Case "GetReportRizePishFactor3"
				If Str = "No Result" Then
					'MCode.SaveUpdate("Delete From tblEshantionVisitori")
					ToastMessageShow("سفارش موجود نمی باشد",True)
					'ProgressDialogHide
					'ToastMessageShow("عملیات دریافت اطلاعات با موفقیت تکمیل شد",True)
				Else
					th.RunOnGuiThread("LoadGetReportRizePishFactor3",Array As Object(Str))
'							LoadGetReportRizePishFactor3(Str)
				End If
					
					
						
				If MCode.Tozie=1 Then
					GetHavaleByUser
				Else
					If MCode.Daryaft=1 Then
						GetBankMa
					Else
						MCode.GetDataStatus=False
								StartService(Service_Helper)
						ProgressDialogHide
					End If
							
				End If
						
			Case "GetHavaleByUser"
				If Str = "No Result" Then
					'MCode.SaveUpdate("Delete From tblGalleryPic")
					'ToastMessageShow("گالری تصاویر موجود نمی باشد",True)
'							ProgressDialogHide
				Else
					
'							LoadGetGetHavale(Str)
					th.RunOnGuiThread("LoadGetGetHavale",Array As Object(Str))
						
						
				End If
				ShowRizeFactorForooshByHavale
			Case "GetAshkhas"
				If Str = "No Result" Then
						
					Dim Cu As Cursor = MCode.Result("Select * From TblAshkhasNew")
					If Cu.RowCount>0 Then
						MCode.SaveUpdate("Delete From TblAshkhas where length(FldCodeTafzili)<6")
					Else
						MCode.SaveUpdate("Delete From TblAshkhas")
					End If
					ToastMessageShow("شخصی موجود نمی باشد",True)
					'ProgressDialogHide
				Else
					th.RunOnGuiThread("LoadGetAshkhas",Array As Object(Str))
'						LoadGetAshkhas(Str)
				End If
				GetFee
			
			Case "GetFee"
				If Str = "No Result" Then
					MCode.SaveUpdate("Delete From TblFee")
					ToastMessageShow("لیست چند قیمت موجود نمی باشد",True)
					'ProgressDialogHide
				Else
					th.RunOnGuiThread("LoadGetFee",Array As Object(Str))
'						LoadGetFee(Str)
				End If
				GetTasvie
			Case "GetTasvie"
				If Str = "No Result" Then
					MCode.SaveUpdate("Delete From TblTasvie")
					Dim code As String="1000"
					Dim name As String="نقدی"
						
					MCode.SaveUpdate("Insert Into TblTasvie (FldCode,FldName) Values ('"& _
		 				code &"','"& name &"')")
					'ToastMessageShow("لیست تسویه موجود نمی باشد",True)
					'ProgressDialogHide
				Else
					th.RunOnGuiThread("LoadGetTasvie",Array As Object(Str))
'						LoadGetTasvie(Str)
				End If
				MCode.SaveUpdate("Update TblSetting Set FldDateUpdate='"&datenow&"'")
			
'					GetAllNotification
				GetTourVisitor
			Case "GetTourVisitor"
				If Str = "No Result" Then
						
					ToastMessageShow("تور ویزیت موجود نمی باشد",True)
				Else
						
					LoadGetTourVisitor(Str)
					
				End If
				If MCode.NoeGet="GetTourVisitor" Then
					ProgressDialogHide
				Else
					GetTanzimatAndroid
						
				End If
						
			Case "GetCodeMoshtari"
				If Str = "No Result" Then
					'GetVaziat
					SendTokenId
				Else
					MCode.CodeMoshtari=Str
							
				End If
				'GetVaziat
				SendTokenId
			Case "GetVaziat"
				If Str = "No Result" Then
					'ToastMessageShow("خطا در اتصال",True)
					MCode.Vaziat=0
					'CallSubDelayed(Act_Main,"LoadPage")
				Else If Str="No Active" Then
					Dim Query As String="Update TblSetting Set FldVaziat = '0'"
					MCode.SaveUpdate(Query)
					'ToastMessageShow("نرم افزار شما غیر فعال میباشد",True)
						
					MCode.Vaziat=0
					'CallSubDelayed(Act_Main,"LoadPage")
				Else
					th.RunOnGuiThread("LoadGetVaziat",Array As Object(Str))
'							LoadGetVaziat(Str)
				End If
				ProgressDialogHide
				GetSetting
		
				'StartService(Service_Gps)
'					CallSubDelayed(Act_Main,"LoadPage")
				'Log("Gps Start")
			Case "SendTokenId"
				If Str = "No Result" Then
					ToastMessageShow("اطلاعات ارسال شده صحیح نیست ",True)
					ProgressDialogHide
				Else If Str ="Is Exist" Or Str="OK" Then
					GetVaziat
				Else
					MCode.SaveUpdate("update TblSetting Set FldTokenId='"& MCode.DeviceId &"' and FldCodeMoshtari='"& MCode.CodeMoshtari &"' and FldNameVisitor='"& MCode.N_Visitor &"' ")
	
					ToastMessageShow("درخواست فعالسازی با موفقیت ارسال گردید",True)
				End If
			Case "SendFaktor"
				If Str = "Ok" Then
					If shomareFactorSelect>0 Then
						MCode.SaveUpdate("Update TblFaktor Set FldSend='1',FldSync='True' where FldShomareFaktor="& shomareFactorSelect)
					Else
						MCode.SaveUpdate("Update TblFaktor Set FldSend='1',FldSync='True'")
					End If
						
					ToastMessageShow("فاکتور با موفقیت ارسال گردید",True)
				Else
					ToastMessageShow("خطا در ارسال فاکتور",True)
				End If
				ProgressDialogHide
					
					
			Case "SendTourVisitor"
				If Str = "ok" Then
					'tblTourVisitor where fldDateVisit='"& MCode.DatePersian &"' and fldSend='False'
					MCode.SaveUpdate("Update tblTourVisitor Set fldSend='True' where fldDateVisit='"& MCode.DatePersian &"' and fldSend='False'")
						
						
					Log("تور ویزیت با موفقیت ارسال گردید")
				Else
					ToastMessageShow("خطا در ارسال تور ویزیت",True)
				End If
					
					
					
			Case "SendAshkhasNew"
				If Str = "Ok" Then
					ToastMessageShow("اشخاص جدید با موفقیت ارسال گردید",True)
					
						
					'MCode.UpdateBadge
					If Sendtype="Daryaft" Then
						MCode.SaveUpdate("Update TblAshkhas Set FldSync='True' where fldCodetafzili="&MCode.C_Tafzili &" and FldSync='False'")
						SendDaryaft(dt1,dt2)
								
					Else if Sendtype="Faktor" Then
						If shomareFactorSelect>0 Then
							MCode.SaveUpdate("Update TblAshkhas Set FldSync='True' where fldCodetafzili="&MCode.C_Tafzili &" and FldSync='False'")
							LoadSendFaktor(shomareFactorSelect)
						Else
							MCode.SaveUpdate("Update TblAshkhas Set  FldSync='True' where  FldSync='False'")
							LoadSendFaktorAll
						End If
					Else If Sendtype="SendAshkhasNew" Then
						If MCode.C_Tafzili=0 Then
									
							MCode.SaveUpdate("Update TblAshkhas Set  FldSync='True' where  FldSync='False'")
						Else
									
							MCode.SaveUpdate("Update TblAshkhas Set FldSync='True' where fldCodetafzili="&MCode.C_Tafzili &" and FldSync='False'")
						End If
					End If
				Else
					ToastMessageShow("خطا در ارسال اشخاص جدید",True)
				End If
'					ProgressDialogHide
			Case "GetReportVisitor"
				If Str = "No Result" Then
					
					ToastMessageShow("گزارشی موجود نمی باشد",True)
				Else
					LoadGetReportVisitor(Str)
				End If
					
					
				ProgressDialogHide
					
			Case "GetListGpsVisitor"
				If Str = "No Result" Then
					
					ToastMessageShow("اطلاعات مسیریابی موجود نمی باشد",True)
				Else
					LoadGetListGpsVisitor(Str)
					
				End If
					
					
				ProgressDialogHide
			Case "GetReportMoshtari"
				If Str = "No Result" Then
					
					ToastMessageShow("گزارشی موجود نمی باشد",True)
				Else
					LoadGetReportMoshtari(Str)
					
				End If
					
					
				ProgressDialogHide
					
			Case "GetReportFactor"
				If Str = "No Result" Then
					
					ToastMessageShow("گزارشی موجود نمی باشد",True)
				Else
					LoadGetReportFactor(Str)
					
				End If
					
					
				ProgressDialogHide
			Case "GetReportRizePishFactor"
				If Str = "No Result" Then
					
					ToastMessageShow("گزارشی موجود نمی باشد",True)
				Else
					LoadGetReportRizePishFactor(Str)
					
				End If
				ProgressDialogHide
			Case "GetSooratHesab"
				If Str = "No Result" Then
					MCode.SaveUpdate("Delete From TblSooratHesab")
					ToastMessageShow("صورت حساب موجود نمی باشد",True)
				Else
					LoadGetSooratHesab(Str)
					
				End If
			
'					ProgressDialogHide
			Case "GetVisitor"
				If Str = "No Result" Then
					MCode.SaveUpdate("Delete From TblVisitor")
					ToastMessageShow("لیست ویزیتور موجود نمی باشد",True)
					ProgressDialogHide
				Else
					LoadGetVisitor(Str)
				End If
				Select MCode.page
					Case "Act_RepFactorVisitor"
						CallSubDelayed(Act_RepFactorVisitor,"LoadData")
					Case "Act_LocationVisitor"
						CallSubDelayed(Act_LocationVisitor,"LoadVisitor")
				End Select
			Case "GetReportFactorVisitor"
				If Str = "No Result" Then
					'MCode.SaveUpdate("Delete From TblSooratHesab")
					ToastMessageShow("گزارش سفارش ویزیتور موجود نمی باشد",True)
				Else
					LoadGetReportFactorVisitor(Str)
					
				End If
				ProgressDialogHide
					
			Case "GetReportRizFactorVisitor"
				If Str = "No Result" Then
					'MCode.SaveUpdate("Delete From TblSooratHesab")
					ToastMessageShow("گزارش سفارش ویزیتور موجود نمی باشد",True)
				Else
					LoadGetReportRizFactorVisitor(Str)
					
				End If
				ProgressDialogHide
			Case "ShowFactorForooshByHavale"
				If Str = "No Result" Then
					'MCode.SaveUpdate("Delete From TblSooratHesab")
					'ToastMessageShow("گزارش سفارش ویزیتور موجود نمی باشد",True)
				Else
					LoadShowFactorForooshByHavale(Str)
					
				End If
			Case "ShowRizFactorForooshByHavale"
				If Str = "No Result" Then
					'MCode.SaveUpdate("Delete From TblSooratHesab")
					'ToastMessageShow("گزارش سفارش ویزیتور موجود نمی باشد",True)
				Else
					LoadShowRizeFactorForooshByHavale(Str)
					
				End If
						
				GetBankMa
			Case "GetBankMa"
				If Str = "No Result" Then
					'MCode.SaveUpdate("Delete From TblSooratHesab")
					'ToastMessageShow("گزارش سفارش ویزیتور موجود نمی باشد",True)
				Else
					LoadGetBankMa(Str)
					
				End If
				GetBankMoshtari
			Case "GetBankMoshtari"
				If Str = "No Result" Then
					'MCode.SaveUpdate("Delete From TblSooratHesab")
					'ToastMessageShow("گزارش سفارش ویزیتور موجود نمی باشد",True)
				Else
					LoadGetBankMoshtari(Str)
					
				End If
				GetSandoogh
			Case "GetSandoogh"
				If Str = "No Result" Then
					'MCode.SaveUpdate("Delete From TblSooratHesab")
					'ToastMessageShow("گزارش سفارش ویزیتور موجود نمی باشد",True)
				Else
					LoadGetSandoogh(Str)
					
				End If
				GetDaryaft
			Case "GetDaryaft"
				If Str = "No Result" Then
					'MCode.SaveUpdate("Delete From TblSooratHesab")
					'ToastMessageShow("گزارش سفارش ویزیتور موجود نمی باشد",True)
				Else
					LoadGetDaryaft(Str)
					
				End If
				GetCheckDaryaft
			Case "GetCheckDaryaft"
				If Str = "No Result" Then
					'MCode.SaveUpdate("Delete From TblSooratHesab")
					'ToastMessageShow("گزارش سفارش ویزیتور موجود نمی باشد",True)
				Else
					LoadGetCheckDaryaft(Str)
					
				End If
						
				If MCode.page="Act_HavaleTozie" Then
					CallSubDelayed(Act_HavaleTozie,"LoadFilter")
				End If
				MCode.GetDataStatus=False
						StartService(Service_Helper)
				ProgressDialogHide
			Case "GetVideoAmoozesh"
				If Str = "No Result" Then
					ToastMessageShow("لیست ویدیو موجود نمی باشد",True)
'							ProgressDialogHide
				Else
					LoadGetVideoAmoozesh(Str)
				End If
			Case "GetPicFTPForAndroid"
				If Str = "No Result" Then
					'ToastMessageShow("لیست ویدیو موجود نمی باشد",True)
'							ProgressDialogHide
				Else
					LoadGetPicFTPForAndroid(Str)
				End If
				GetGalleryKala
			Case "SendDaryaft"
				If Str = "Ok" Then
					ToastMessageShow("دریافت با موفقیت ارسال گردید",True)
					
					MCode.SaveUpdate("Update TblDaryaft Set fldSend=1 where fldShomareDaryaft="&MCode.ShomareDaryaft)
							
					MCode.SaveUpdate("Update TblCheckDaryafti Set fldSend=1 where fldShomareDaryaft="&MCode.ShomareDaryaft)
					CallSubDelayed(Act_Mali,"btnNew_Click")
				Else
					ToastMessageShow("خطا در ارسال دریافت",True)
				End If
				ProgressDialogHide
			Case "SendUpdateQuery"
				If Str = "No Result" Then
					'MCode.SaveUpdate("Delete From TblSooratHesab")
					ToastMessageShow("خطا در بروزرسانی",True)
				Else
					If MCode.page="Act_RizeFactorHavale" Then
						CallSubDelayed(Act_RizeFactorHavale,"btnUpdate_Click")
					End If
					If MCode.page="Act_RepFactorVisitor" Then
						CallSubDelayed(Act_RepFactorVisitor,"BtnReport_Click")
					End If
						
					If MCode.page="Act_RepRizFactorVisitor" Then
						CallSubDelayed(Act_RepRizFactorVisitor,"LblBack_Click")
					End If
					
				End If
				ProgressDialogHide
						MCode.GetDataStatus=False
						StartService(Service_Helper)
	End Select
	Catch
		Log(LastException)
	End Try
	ProgressDialogHide

Else
	StartActivity(Act_Main)
	If	MCode.IsConnected=False Then
		ToastMessageShow("خطا در دسترسی اینترنت",True)
		myCode.SendError(j.ErrorMessage,"Service_Server-JobDone-"& Str &"-"&MCode.page)
	End If
			
	ProgressDialogHide
'				StartService(Service_Gps)
			MCode.GetDataStatus=False
	StartService(FusedLocationService)
	StartService(Service_Helper)
	Log("Gps Start")
	If MCode.IsOnlineDataFactor=1 Then
		'StartService(Service_Notification)
		Log("Notifi Start")
	End If
		
		
End If
jobInternet.Release
Sleep(1000)
Catch
ProgressDialogHide
		MCode.GetDataStatus=False
		StartService(Service_Helper)
Log(LastException)
	
End Try
End Sub

'Sub JobDone (Job As HttpJob)
'	Try
'		Job.GetRequest.Timeout=50000
'	If Job.Success Then
'		
'		Try
'			Dim Str As String = Job.GetString
'				Log(Job.JobName)
'			Select Case Job.JobName
'				
'				Case "GetVersion"
'						If Str <> "No Result" Then
'							Log(Str)
'							If MCode.page="act_setting" Then
'								Dim RowsList As List
'								MCode.Json.Initialize(Str.Trim )
'								Dim item As AdapteVersion
'								item.Initialize
'								RowsList = MCode.Json.NextArray
'								Dim Row As Map
'								Row=RowsList.Get(0)
'								
'								MCode.linkposparsian=Row.Get("FldLink")
'								
'								CallSubDelayed(Act_Setting,"DownloadAppPos")
'							End If
'						End If
'			
'				Case "GetSetting"
'					If Str = "No Result" Then
'						ToastMessageShow("شما مجاز به استفاده از نرم افزار نمی باشید",True)
''						ProgressDialogHide
'					Else
'						'LoadGetSetting(Str)
'							th.RunOnGuiThread("LoadGetSetting",Array As Object(Str))
'
'						
'						End If
'						
'					Case "GetTanzimatAndroid"
'						If Str = "No Result" Then
''							ToastMessageShow("شما مجاز به استفاده از نرم افزار نمی باشید",True)
''						ProgressDialogHide
'						Else
''							LoadGetTanzimatAndroid(Str)
'							th.RunOnGuiThread("LoadGetTanzimatAndroid",Array As Object(Str))
'
'						End If
'						GetLinkFtp
'					Case "SaveVersionAndroidInfo"
'						If Str = "No Result" Then
'							Log("اطلاعات نرم افزار ارسال نشد")
'						Else
'							Log("اطلاعات نرم افزار ارسال شد")
'						End If
'				Case "SaveAndroidLog"
'					If Str = "No Result" Then
'						Log("خطا ارسال نشد")
'					Else
'						Log("خطا ارسال شد")
'					End If
'				Case "SaveLocationMoshtari"
'					If Str = "No Result" Then
'						Log("خطا در ارسال موقعیت مشتری")
'					Else If Str="Insert" Then
'						Log("موقعیت مشتری با موفقیت ثبت شد")
'					Else If Str="Update" Then						
'						Log("موقعیت مشتری بروزرسانی شد")
'					End If
'				Case "GetCurrentDate"
'					Dim StrCurrentDate As String = Job.GetString
'					'StrError=StrCurrentDate
'					If StrCurrentDate <> "No Result" Then
'						datenow=StrCurrentDate
'					
'						If datenow.Length = 24 Then
'							datenow=datenow.SubString2(0,23)
'						End If
'						Log("datenow: "&datenow)
'						
'					End If
'					If	Act_Main.NoeGet="MojoodiAnbar" Then
'						GetKala
'					Else If Act_Main.NoeGet="UpdateFee" Then
'						GetFee
'					Else
'						GetSetting
'					End If
'				
'				Case "GetGoroohKala"
'					If Str = "No Result" Then
'						MCode.SaveUpdate("Delete From TblGoroohKala")
'						ToastMessageShow("گروه کالا موجود نمی باشد",True)
'						'ProgressDialogHide
'					Else
'							th.RunOnGuiThread("LoadGetGoroohKala",Array As Object(Str))
''						LoadGetGoroohKala(Str)
'					End If
'					GetKala
'				Case "GetKala"
'					If Str = "No Result" Then
'						MCode.SaveUpdate("Delete From TblKala")
'						ToastMessageShow("کالا موجود نمی باشد",True)
'						'ProgressDialogHide
'					Else
'							th.RunOnGuiThread("LoadGetKala",Array As Object(Str))
''						LoadGetKala(Str)
'					End If
'					'If Act_Main.NoeGet="DaryaftEtlaat" Then
'						GetGoroohAshkhas
'					'End If
'				
'				
'				Case "GetGoroohAshkhas"
'					If Str = "No Result" Then
'						MCode.SaveUpdate("Delete From TblGoroohAshkhas")
'						ToastMessageShow("گروه اشخاص موجود نمی باشد",True)
'						'ProgressDialogHide
'					Else
'							th.RunOnGuiThread("LoadGetGoroohAshkhas",Array As Object(Str))
''						LoadGetGoroohAshkhas(Str)
'					End If
'			
'					GetAshkhas
'				Case "GetAllNotification"
'					If Str = "No Result" Then
'						MCode.SaveUpdate("Delete From TblNotifi")
'						'ToastMessageShow("گروه اشخاص موجود نمی باشد",True)
'						'ProgressDialogHide
'					Else
'							th.RunOnGuiThread("LoadGetAllNotification",Array As Object(Str))
''						LoadGetAllNotification(Str)
'					End If
'					GetGalleryKala
'				Case "GetGalleryKala"
'					If Str = "No Result" Then
'						MCode.SaveUpdate("Delete From tblGalleryPic")
'						ToastMessageShow("گالری تصاویر موجود نمی باشد",True)
'						'ProgressDialogHide
'					Else
'							th.RunOnGuiThread("LoadGetGalleryKala",Array As Object(Str))
''						LoadGetGalleryKala(Str)
'						End If
'			
'						GetEshantion2
'					Case "GetEshantion2"
'						If Str = "No Result" Then
'							MCode.SaveUpdate("Delete From tblEshantionTabaghati")
'							ToastMessageShow("اشانتیون موجود نمی باشد",True)
'							'ProgressDialogHide
'							'ToastMessageShow("عملیات دریافت اطلاعات با موفقیت تکمیل شد",True)
'						Else
''						LoadGetEshantion2(Str)
'							th.RunOnGuiThread("LoadGetEshantion2",Array As Object(Str))
'						End If
'						GetDaftarchTell
'					Case "GetDaftarchTell"
'						If Str = "No Result" Then
'							MCode.SaveUpdate("Delete From tblDaftarcheTell")
'							ToastMessageShow("دفترچه تلفن موجود نمی باشد",True)
'							'ProgressDialogHide
'							'ToastMessageShow("عملیات دریافت اطلاعات با موفقیت تکمیل شد",True)
'						Else
''						LoadGetDaftarchTell(Str)
'
'							th.RunOnGuiThread("LoadGetDaftarchTell",Array As Object(Str))
'						End If
'						GetGroupDastrasiAshkhas
'						
'					Case "GetGroupDastrasiAshkhas"
'						If Str = "No Result" Then
'							MCode.SaveUpdate("Delete From tblGroupDastrasi")
''							    ToastMessageShow("دسترسی اشخاص موجود نمی باشد",True)
'							'ProgressDialogHide
'							'ToastMessageShow("عملیات دریافت اطلاعات با موفقیت تکمیل شد",True)
'						Else
''						LoadGetGroupDastrasiAshkhas(Str)
'						
'							th.RunOnGuiThread("LoadGetGroupDastrasiAshkhas",Array As Object(Str))
'						End If
'						GetEshantionGroup
'					Case "GetEshantionGroup"
'						If Str = "No Result" Then
'							MCode.SaveUpdate("Delete From tblEshantionGroup")
'							ToastMessageShow("اشانتیون گروهی موجود نمی باشد",True)
'							'ProgressDialogHide
'							'ToastMessageShow("عملیات دریافت اطلاعات با موفقیت تکمیل شد",True)
'						Else
'							th.RunOnGuiThread("LoadGetEshantionGroup",Array As Object(Str))
''							LoadGetEshantionGroup(Str)
'						End If
'					
'					If MCode.Visitor=1 Then
'							GetReportRizePishFactor3
'						Else
'							If MCode.Tozie=1 Then
'								GetHavaleByUser
'							Else
'								If MCode.Daryaft=1 Then
'									GetDaryaft
'								Else
'									ProgressDialogHide
'								End If
'							
'							End If
'						End If
'						
'				
'					
'					Case "GetReportRizePishFactor3"
'						If Str = "No Result" Then
'							'MCode.SaveUpdate("Delete From tblEshantionVisitori")
'							ToastMessageShow("سفارش موجود نمی باشد",True)
'							'ProgressDialogHide
'							'ToastMessageShow("عملیات دریافت اطلاعات با موفقیت تکمیل شد",True)
'						Else
'							th.RunOnGuiThread("LoadGetReportRizePishFactor3",Array As Object(Str))
''							LoadGetReportRizePishFactor3(Str)
'						End If
'					
'					
'						
'						If MCode.Tozie=1 Then
'							GetHavaleByUser
'						Else
'							If MCode.Daryaft=1 Then
'								GetBankMa
'							Else
'								ProgressDialogHide
'							End If
'							
'						End If
'						
'					Case "GetHavaleByUser"
'						If Str = "No Result" Then
'							'MCode.SaveUpdate("Delete From tblGalleryPic")
'							'ToastMessageShow("گالری تصاویر موجود نمی باشد",True)
''							ProgressDialogHide
'						Else
'					
''							LoadGetGetHavale(Str)
'							th.RunOnGuiThread("LoadGetGetHavale",Array As Object(Str))
'						
'						
'						End If
'						ShowRizeFactorForooshByHavale
'				Case "GetAshkhas"
'					If Str = "No Result" Then
'						
'							Dim Cu As Cursor = MCode.Result("Select * From TblAshkhasNew")
'							If Cu.RowCount>0 Then
'								MCode.SaveUpdate("Delete From TblAshkhas where length(FldCodeTafzili)<6")
'							Else
'								MCode.SaveUpdate("Delete From TblAshkhas")
'							End If
'						ToastMessageShow("شخصی موجود نمی باشد",True)
'						'ProgressDialogHide
'					Else
'							th.RunOnGuiThread("LoadGetAshkhas",Array As Object(Str))
''						LoadGetAshkhas(Str)
'					End If
'					GetFee
'			
'				Case "GetFee"
'					If Str = "No Result" Then
'						MCode.SaveUpdate("Delete From TblFee")
'						ToastMessageShow("لیست چند قیمت موجود نمی باشد",True)
'						'ProgressDialogHide
'					Else
'							th.RunOnGuiThread("LoadGetFee",Array As Object(Str))
''						LoadGetFee(Str)
'					End If
'					GetTasvie
'				Case "GetTasvie"
'					If Str = "No Result" Then
'						MCode.SaveUpdate("Delete From TblTasvie")
'						Dim code As String="1000"
'						Dim name As String="نقدی"
'						
'						MCode.SaveUpdate("Insert Into TblTasvie (FldCode,FldName) Values ('"& _
'		 				code &"','"& name &"')")
'						'ToastMessageShow("لیست تسویه موجود نمی باشد",True)
'						'ProgressDialogHide
'					Else
'							th.RunOnGuiThread("LoadGetTasvie",Array As Object(Str))
''						LoadGetTasvie(Str)
'					End If
'					MCode.SaveUpdate("Update TblSetting Set FldDateUpdate='"&datenow&"'")
'			
''					GetAllNotification
'						GetTourVisitor
'					Case "GetTourVisitor"
'						If Str = "No Result" Then
'						
'							ToastMessageShow("تور ویزیت موجود نمی باشد",True)
'						Else
'						
'							LoadGetTourVisitor(Str)
'					
'						End If
'						If MCode.NoeGet="GetTourVisitor" Then
'							ProgressDialogHide
'						Else
'						GetTanzimatAndroid
'						
'						End If
'						
'					Case "GetCodeMoshtari"
'						If Str = "No Result" Then
'							'GetVaziat
'							SendTokenId
'						Else
'							MCode.CodeMoshtari=Str
'							
'						End If
'						'GetVaziat
'						SendTokenId
'					Case "GetVaziat"
'						If Str = "No Result" Then
'							'ToastMessageShow("خطا در اتصال",True)
'							MCode.Vaziat=0
'							'CallSubDelayed(Act_Main,"LoadPage")
'						Else If Str="No Active" Then
'							Dim Query As String="Update TblSetting Set FldVaziat = '0'"
'							MCode.SaveUpdate(Query)
'							'ToastMessageShow("نرم افزار شما غیر فعال میباشد",True)
'						
'							MCode.Vaziat=0
'							'CallSubDelayed(Act_Main,"LoadPage")
'						Else
'							th.RunOnGuiThread("LoadGetVaziat",Array As Object(Str))
''							LoadGetVaziat(Str)
'						End If
'						ProgressDialogHide
'						GetSetting
'		
'						'StartService(Service_Gps)
''					CallSubDelayed(Act_Main,"LoadPage")
'						'Log("Gps Start")
'				Case "SendTokenId"
'					If Str = "No Result" Then
'						ToastMessageShow("اطلاعات ارسال شده صحیح نیست ",True)
'						ProgressDialogHide
'					Else If Str ="Is Exist" Or Str="OK" Then
'							GetVaziat
'					Else
'					MCode.SaveUpdate("update TblSetting Set FldTokenId='"& MCode.DeviceId &"' and FldCodeMoshtari='"& MCode.CodeMoshtari &"' and FldNameVisitor='"& MCode.N_Visitor &"' ")
'	
'					ToastMessageShow("درخواست فعالسازی با موفقیت ارسال گردید",True)						
'					End If
'				Case "SendFaktor"
'					If Str = "Ok" Then
'						If shomareFactorSelect>0 Then
'							MCode.SaveUpdate("Update TblFaktor Set FldSend='1',FldSync='True' where FldShomareFaktor="& shomareFactorSelect)
'						Else
'							MCode.SaveUpdate("Update TblFaktor Set FldSend='1',FldSync='True'")
'						End If
'						
'						ToastMessageShow("فاکتور با موفقیت ارسال گردید",True)
'					Else
'						ToastMessageShow("خطا در ارسال فاکتور",True)
'					End If
'					ProgressDialogHide
'					
'					
'					Case "SendTourVisitor"
'						If Str = "ok" Then
'							'tblTourVisitor where fldDateVisit='"& MCode.DatePersian &"' and fldSend='False'
'							MCode.SaveUpdate("Update tblTourVisitor Set fldSend='True' where fldDateVisit='"& MCode.DatePersian &"' and fldSend='False'")
'						
'						
'							Log("تور ویزیت با موفقیت ارسال گردید")
'						Else
'							ToastMessageShow("خطا در ارسال تور ویزیت",True)
'						End If
'					
'					
'					
'				Case "SendAshkhasNew"
'					If Str = "Ok" Then
'						ToastMessageShow("اشخاص جدید با موفقیت ارسال گردید",True)
'					
'						
'							'MCode.UpdateBadge
'							If Sendtype="Daryaft" Then
'								MCode.SaveUpdate("Update TblAshkhas Set FldSync='True' where fldCodetafzili="&MCode.C_Tafzili &" and FldSync='False'")
'								SendDaryaft(dt1,dt2)
'								
'							Else if Sendtype="Faktor" Then
'								If shomareFactorSelect>0 Then
'									MCode.SaveUpdate("Update TblAshkhas Set FldSync='True' where fldCodetafzili="&MCode.C_Tafzili &" and FldSync='False'")
'									LoadSendFaktor(shomareFactorSelect)
'								Else
'									MCode.SaveUpdate("Update TblAshkhas Set  FldSync='True' where  FldSync='False'")
'									LoadSendFaktorAll
'								End If
'							Else If Sendtype="SendAshkhasNew" Then
'								If MCode.C_Tafzili=0 Then
'									
'									MCode.SaveUpdate("Update TblAshkhas Set  FldSync='True' where  FldSync='False'")
'								Else
'									
'									MCode.SaveUpdate("Update TblAshkhas Set FldSync='True' where fldCodetafzili="&MCode.C_Tafzili &" and FldSync='False'")
'								End If
'							End If
'					Else
'						ToastMessageShow("خطا در ارسال اشخاص جدید",True)
'					End If
''					ProgressDialogHide
'				Case "GetReportVisitor"
'					If Str = "No Result" Then
'					
'						ToastMessageShow("گزارشی موجود نمی باشد",True)
'					Else
'						LoadGetReportVisitor(Str)				
'					End If
'					
'					
'					ProgressDialogHide
'					
'				Case "GetListGpsVisitor"
'					If Str = "No Result" Then
'					
'						ToastMessageShow("اطلاعات مسیریابی موجود نمی باشد",True)
'					Else
'						LoadGetListGpsVisitor(Str)
'					
'					End If
'					
'					
'					ProgressDialogHide
'				Case "GetReportMoshtari"
'					If Str = "No Result" Then
'					
'						ToastMessageShow("گزارشی موجود نمی باشد",True)
'					Else
'						LoadGetReportMoshtari(Str)
'					
'					End If
'					
'					
'					ProgressDialogHide
'					
'				Case "GetReportFactor"
'					If Str = "No Result" Then
'					
'						ToastMessageShow("گزارشی موجود نمی باشد",True)
'					Else
'						LoadGetReportFactor(Str)
'					
'					End If
'					
'					
'					ProgressDialogHide
'				Case "GetReportRizePishFactor"
'					If Str = "No Result" Then
'					
'						ToastMessageShow("گزارشی موجود نمی باشد",True)
'					Else
'						LoadGetReportRizePishFactor(Str)
'					
'					End If
'						ProgressDialogHide
'				Case "GetSooratHesab"
'					If Str = "No Result" Then
'						MCode.SaveUpdate("Delete From TblSooratHesab")
'						ToastMessageShow("صورت حساب موجود نمی باشد",True)
'					Else
'						LoadGetSooratHesab(Str)
'					
'					End If
'			
''					ProgressDialogHide
'				Case "GetVisitor"
'					If Str = "No Result" Then
'						MCode.SaveUpdate("Delete From TblVisitor")
'						ToastMessageShow("لیست ویزیتور موجود نمی باشد",True)
'						ProgressDialogHide
'					Else
'						LoadGetVisitor(Str)
'					End If
'					Select MCode.page
'						Case "Act_RepFactorVisitor"
'							CallSubDelayed(Act_RepFactorVisitor,"LoadData")
'						Case "Act_LocationVisitor"
'							CallSubDelayed(Act_LocationVisitor,"LoadVisitor")
'					End Select				
'				Case "GetReportFactorVisitor"
'					If Str = "No Result" Then
'						'MCode.SaveUpdate("Delete From TblSooratHesab")
'						ToastMessageShow("گزارش سفارش ویزیتور موجود نمی باشد",True)
'					Else
'						LoadGetReportFactorVisitor(Str)
'					
'					End If
'					ProgressDialogHide
'					
'				Case "GetReportRizFactorVisitor"
'					If Str = "No Result" Then
'						'MCode.SaveUpdate("Delete From TblSooratHesab")
'						ToastMessageShow("گزارش سفارش ویزیتور موجود نمی باشد",True)
'					Else
'						LoadGetReportRizFactorVisitor(Str)
'					
'					End If
'						ProgressDialogHide
'					Case "ShowFactorForooshByHavale"
'						If Str = "No Result" Then
'							'MCode.SaveUpdate("Delete From TblSooratHesab")
'							'ToastMessageShow("گزارش سفارش ویزیتور موجود نمی باشد",True)
'						Else
'							LoadShowFactorForooshByHavale(Str)
'					
'						End If
'					Case "ShowRizFactorForooshByHavale"
'						If Str = "No Result" Then
'							'MCode.SaveUpdate("Delete From TblSooratHesab")
'							'ToastMessageShow("گزارش سفارش ویزیتور موجود نمی باشد",True)
'						Else
'							LoadShowRizeFactorForooshByHavale(Str)
'					
'						End If
'						
'						GetBankMa
'					Case "GetBankMa"
'						If Str = "No Result" Then
'							'MCode.SaveUpdate("Delete From TblSooratHesab")
'							'ToastMessageShow("گزارش سفارش ویزیتور موجود نمی باشد",True)
'						Else
'							LoadGetBankMa(Str)
'					
'						End If
'						GetBankMoshtari
'					Case "GetBankMoshtari"
'						If Str = "No Result" Then
'							'MCode.SaveUpdate("Delete From TblSooratHesab")
'							'ToastMessageShow("گزارش سفارش ویزیتور موجود نمی باشد",True)
'						Else
'							LoadGetBankMoshtari(Str)
'					
'						End If
'						GetSandoogh
'					Case "GetSandoogh"
'						If Str = "No Result" Then
'							'MCode.SaveUpdate("Delete From TblSooratHesab")
'							'ToastMessageShow("گزارش سفارش ویزیتور موجود نمی باشد",True)
'						Else
'							LoadGetSandoogh(Str)
'					
'						End If
'						GetDaryaft
'					Case "GetDaryaft"
'						If Str = "No Result" Then
'							'MCode.SaveUpdate("Delete From TblSooratHesab")
'							'ToastMessageShow("گزارش سفارش ویزیتور موجود نمی باشد",True)
'						Else
'							LoadGetDaryaft(Str)
'					
'						End If
'						GetCheckDaryaft
'					Case "GetCheckDaryaft"
'						If Str = "No Result" Then
'							'MCode.SaveUpdate("Delete From TblSooratHesab")
'							'ToastMessageShow("گزارش سفارش ویزیتور موجود نمی باشد",True)
'						Else
'							LoadGetCheckDaryaft(Str)
'					
'						End If
'						
'						If MCode.page="Act_HavaleTozie" Then
'							CallSubDelayed(Act_HavaleTozie,"LoadFilter")
'						End If
'						ProgressDialogHide
'					Case "GetVideoAmoozesh"
'						If Str = "No Result" Then
'							ToastMessageShow("لیست ویدیو موجود نمی باشد",True)
''							ProgressDialogHide
'						Else
'							LoadGetVideoAmoozesh(Str)
'						End If
'					Case "GetPicFTPForAndroid"
'						If Str = "No Result" Then
'							'ToastMessageShow("لیست ویدیو موجود نمی باشد",True)
''							ProgressDialogHide
'						Else
'							LoadGetPicFTPForAndroid(Str)
'						End If
'						GetGalleryKala
'					Case "SendDaryaft"
'						If Str = "Ok" Then
'							ToastMessageShow("دریافت با موفقیت ارسال گردید",True)
'					
'							MCode.SaveUpdate("Update TblDaryaft Set fldSend=1 where fldShomareDaryaft="&MCode.ShomareDaryaft)
'							
'							MCode.SaveUpdate("Update TblCheckDaryafti Set fldSend=1 where fldShomareDaryaft="&MCode.ShomareDaryaft)
'							CallSubDelayed(Act_Mali,"btnNew_Click")
'						Else
'							ToastMessageShow("خطا در ارسال دریافت",True)
'						End If
'						ProgressDialogHide
'				Case "SendUpdateQuery"
'					If Str = "No Result" Then
'						'MCode.SaveUpdate("Delete From TblSooratHesab")
'						ToastMessageShow("خطا در بروزرسانی",True)
'					Else
'							If MCode.page="Act_RizeFactorHavale" Then
'								CallSubDelayed(Act_RizeFactorHavale,"btnUpdate_Click")
'							End If
'							If MCode.page="Act_RepFactorVisitor" Then
'								CallSubDelayed(Act_RepFactorVisitor,"BtnReport_Click")
'							End If
'						
'							If MCode.page="Act_RepRizFactorVisitor" Then
'								CallSubDelayed(Act_RepRizFactorVisitor,"LblBack_Click")
'							End If
'					
'					End If
'					ProgressDialogHide
'			End Select
'			
'		Catch
'			Log(LastException)
'		End Try
'			ProgressDialogHide
'	Else
'			StartActivity(Act_Main)
'			If	MCode.IsConnected=False Then
'				ToastMessageShow("خطا در دسترسی اینترنت",True)
'				myCode.SendError(Job.ErrorMessage,"Service_Server-JobDone-"& Str &"-"&MCode.page)
'		End If
'			
'		ProgressDialogHide
''				StartService(Service_Gps)
'			StartService(FusedLocationService)
'			Log("Gps Start")
'		If MCode.IsOnlineDataFactor=1 Then
'			'StartService(Service_Notification)
'				Log("Notifi Start")
'		End If
'		
'		
'	End If
'		jobInternet.Release
'		Sleep(1000)
'	Catch
'		ProgressDialogHide
'		Log(LastException)
'	
'	End Try
'End Sub


