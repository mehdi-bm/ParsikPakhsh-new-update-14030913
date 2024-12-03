B4A=true
Group=Services
ModulesStructureVersion=1
Type=Service
Version=9.5
@EndOfDesignText@
#Region  Service Attributes 
	#StartAtBoot: false
'	#StartCommandReturnValue: android.app.Service.START_STICKY
#End Region

Sub Process_Globals

	Dim jobInternet As HttpJob
	Dim datenow As String
	Dim DateUpdate As String
	Dim TypeDelete As String
	Dim Title As String
	Public mode As String
	Dim i As Int=0
	Dim CodeTafzili1,CodeKala1 As String
	Dim StatusCodeTafzili1,StatusCodeKala1 As String="NotOK"
	
End Sub

Sub Service_Create
	
	jobInternet.Initialize("jobInternet",Me)
	'MCode.Initialize
	
End Sub

Public Sub SubscribeToTopics
	'fm.SubscribeToTopic("general") 'you can subscribe to more topics
End Sub

Sub Service_Start (StartingIntent As Intent)

	Try
'	If StartingIntent.IsInitialized Then fm.HandleIntent(StartingIntent)
		GetCurrentDate
		If MCode.C_Visitor="کد ویزیتور"  Then
			Return
		End If
		If MCode.C_Visitor.Length<5 Then
			ToastMessageShow("کد ویزیتور شما صحیح نیست",True)
			Return
		End If
		LoadData
	Catch
		Log(LastException)
		myCode.SendError(LastException,"FirebaseMessaging-Service_Start")
	End Try
	'Sleep(0)
	'Service.StopAutomaticForeground 'remove if not using B4A v8+.
End Sub






Sub Delete
	TypeDelete="kala"
	GetListDelete("kala")
End Sub
Sub GetDateUpdate	
	DateUpdate=MCode.SingleResult("select FldDateUpdate from TblSetting")
	Log("DateUpdate :"&DateUpdate)
End Sub

'Sub LoadVaziat
'	'Dim str As String
'	'str=MCode.PushBody
'	Try
'
''				GetVaziat
'	
'	
'	Catch
'		Log(LastException)
'		myCode.SendError(LastException,"FirebaseMessaging-LoadVaziat")
'	End Try
'		
'	
'	
'End Sub

Sub LoadData
	'Log(MCode.PushBody)
	
	GetDateUpdate
	Dim str As String
	str=mode
	Try
	'	StopService(Service_Gps)
			
		Log("Gps Stop")
		'Log("1398")
		Select str
			Case "GetSetting"
			
				Log(str)
				GetSetting
			Case "GetKala"
			
				Log(str)
				GetKala("GetKala")
			Case "GetKalaAll"
			
				Log(str)
				GetKala("GetKalaAll")
			
			Case "GetGoroohKala"
			
				Log(str)
				GetGoroohKala("GetGoroohKala")
				
			Case "GetGoroohKalaAll"
			
				Log(str)
				GetGoroohKala("GetGoroohKalaAll")
			
			
			Case "GetAshkhas"
				
				Log(str)
				GetAshkhas("GetAshkhas")
			
			Case "GetAshkhasAll"
				
				Log(str)
				GetAshkhas("GetAshkhasAll")
			
		
			Case "GetGoroohAshkhas"
			
				Log(str)
				GetGoroohAshkhas("GetGoroohAshkhas")
			Case "GetGoroohAshkhasAll"
			
				Log(str)
				'GetGoroohAshkhas("GetGoroohAshkhasAll")
			
			Case "GetGalleryKalaAll"
				
				GetGalleryKala("GetGalleryKalaAll")
				
			Case "GetUpdateFee"
				GetUpdateFee
			Case "GetGalleryKala"
				
				GetGalleryKala("GetGalleryKala")
				
			Case "GetHavale"
				GetHavale
				
			Case "GetHavaleByUser"
			GetHavaleByUser
			
			Case "GetEshantion"
				
				GetEshantion
				
			Case "GetVaziat"
				Log(str)
'				GetVaziat
			Case "GetFee"
				Log(str)
				GetFee
			Case "GetTasvie"
				Log(str)
				GetTasvie
			Case "GetReportRizePishFactor3"
				Log(str)
				GetReportRizePishFactor3
			Case "stop"
				Log("stop")
			Case "GetDelete"
				Delete
			Case Else
				'Dim n As Notification
			
				Dim GetDate As String
				Dim GetTime As String
		
				GetTime=DateTime.Time(DateTime.Now)
				GetDate=MCode.DatePersian
				Log("Time: "&GetTime&" Date: "&GetDate)
				'MCode.SaveUpdate("Insert into TblNotifi(FldTitle,FldBody,FldDate,FldTime,FldStatus) Values('"&Title&"','"&str&"','"&GetDate&"','"&GetTime&"','0')")
				'Log("Notifi is Inserted")
				
				
				
				'n.Initialize
'				n.Initialize2(n.IMPORTANCE_HIGH)
'				n.Icon = "icon"
'				n.SetInfo(Title, str, Act_NotifiMessege)
'				n.Notify(1)
'				Act_Main.t2.Enabled=True
'				mode="pushsms"
				'n.Sound=False
				
		End Select
	
	Catch
		Log(LastException)
		myCode.SendError(LastException,"FirebaseMessaging-LoadData")
	End Try

	
	
End Sub

Sub GetCurrentDate
	jobInternet.JobName ="GetCurrentDate"
	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetCurrentDate",Null)

End Sub
Sub GetListDelete(StrType As String)
	jobInternet.JobName ="GetListDeleted"
	TypeDelete=StrType
	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetListDeleted","&Imei=" &  MCode.DeviceId & " &StrType=" & StrType & " &DateUpdate=" & DateUpdate)
	
End Sub
Sub GetSetting
	jobInternet.JobName ="GetSetting"
	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetSetting","Imei=" & MCode.DeviceId)
End Sub

Sub LoadGetSetting(Str As String)
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
			Where.Put("FldId",1)

		DBUtils.UpdateRecord2(MCode.Sql1,"TblSetting",Fields,Where)
'		Log( "FldDastrasiKala= "&Row.Get("FldDastrasiKala")&"', FldDastrasiAshkhas = "& Row.Get("FldDastrasiAshkhas"))
'		Dim Query As String="Update TblSetting Set FldImei = '"& MCode.DeviceId &"',FldC_Visitor = '"& Row.Get("FldC_Visitor") &"',FldN_Visitor = '"& Row.Get("FldN_Visitor") &"',FldGps = '"& Row.Get("FldGps") &"',FldIntervalGps = '"& Row.Get("FldIntervalGps") &"',FldLanguage = '"& Row.Get("FldLanguage") &"',FldNoeDate = '"& Row.Get("FldNoeDate") &"',FldRound = '"& Row.Get("FldRound") &"',FldVahedPool = '"& Row.Get("FldVahedPool") &"',FldkalaManfi = '"& Row.Get("FldKalaManfi") &"',FldTaghirFeeKala = '"& Row.Get("FldTaghirFeeKala") &"',FldNamayeshKalaSefr = '"& Row.Get("fldNamayeshKalaSefr") &"',FldDastrasiKala = "& Row.Get("FldDastrasiKala")&",FldDastrasiAshkhas = "& Row.Get("FldDastrasiAshkhas") &",FldAdmin = "& Row.Get("FldAdmin")&",FldCheckAdmin = "& Row.Get("FldCheckAdmin") &",FldTakhfifKala = "& Row.Get("FldTakhfifKala")
'		MCode.SaveUpdate(Query)
	Next
	MCode.UpdateSetting
'	If MCode.page="Act_Main" Then
		'	CallSub(Act_Main,"LoadPage")
'	End If

		Log("تنظیمات با موفقیت دریافت گردید")
	Catch
		Log(LastException)
		myCode.SendError(LastException,"FirebaseMessaging-LoadGetSetting")
	End Try
End Sub
Sub LoadGetListDelete(Str As String)
	Try
	Dim RowsList As List
	Dim Row As Map
	Dim Cu As  Cursor
	Dim CountRow As Int
	MCode.Json.Initialize(Str.Trim )
	RowsList = MCode.Json.NextArray

	Select TypeDelete
		Case "kala"
			For i = 0 To RowsList.Size - 1
				Row=RowsList.Get(i)
				Log("deleted fldCodeKala:"& Row.Get("fldCode"))
				Cu=MCode.Result("select * from TblKala where fldCodeKala=" & Row.Get("fldCode"))
				CountRow=Cu.RowCount
				Log(CountRow)
				Dim Query As String="Delete From TblKala where fldCodeKala= "& Row.Get("fldCode")
				MCode.SaveUpdate(Query)
			Next
		Case "ashkhas"
			For i = 0 To RowsList.Size - 1
				Row=RowsList.Get(i)
				Log("deleted fldCodetafzili:"& Row.Get("fldCode"))
				Cu=MCode.Result("select * from TblAshkhas where fldCodetafzili=" & Row.Get("fldCode"))
				CountRow=Cu.RowCount
				Log(CountRow)
				Dim Query As String="Delete From TblAshkhas where fldCodetafzili= "& Row.Get("fldCode")
				MCode.SaveUpdate(Query)
			Next
		Case "GroupKala"
			For i = 0 To RowsList.Size - 1
				Row=RowsList.Get(i)
				Log("deleted fldGroupId:"& Row.Get("fldCode"))
				Cu=MCode.Result("select * from TblGoroohKala where fldGroupId=" & Row.Get("fldCode"))
				CountRow=Cu.RowCount
				Log(CountRow)
				Dim Query As String="Delete From TblGoroohKala where fldGroupId= "& Row.Get("fldCode")
				MCode.SaveUpdate(Query)
			Next
		Case "GalleryPic"
			For i = 0 To RowsList.Size - 1
				Row=RowsList.Get(i)
				Log("deleted tblGalleryPic:"& Row.Get("fldCodeKala"))
				Cu=MCode.Result("select * from tblGalleryPic where fldCodeKala='" & Row.Get("fldCodeKala") &"' and fldImageNumber='" & Row.Get("fldImageNumber") &"'")
				CountRow=Cu.RowCount
				Log(CountRow)
				Dim Query As String="Delete From tblGalleryPic where fldCodeKala= "& Row.Get("fldCodeKala")&"' and fldImageNumber='" & Row.Get("fldImageNumber") &"'"
				MCode.SaveUpdate(Query)
			Next
		Case "GroupAshkhas"
			For i = 0 To RowsList.Size - 1
				Row=RowsList.Get(i)
				Log("deleted FldC_Gorooh:"& Row.Get("fldCode"))
				Cu=MCode.Result("select * from TblGoroohAshkhas where FldC_Gorooh=" & Row.Get("fldCode"))
				CountRow=Cu.RowCount
				Log(CountRow)
				Dim Query As String="Delete From TblGoroohAshkhas where FldC_Gorooh= "& Row.Get("fldCode")
				MCode.SaveUpdate(Query)
			Next
		Case "deleteall"
			MCode.SaveUpdate("Delete From TblKala")
			MCode.SaveUpdate("Delete From TblAshkhas")
			MCode.SaveUpdate("Delete From TblGoroohKala")
			MCode.SaveUpdate("Delete From TblGoroohAshkhas")
			MCode.SaveUpdate("Delete From tblGalleryPic")
			DateUpdate=0
			
			GetCurrentDate
		End Select
	Catch
		Log(LastException)
		myCode.SendError(LastException,"FirebaseMessaging-LoadGetListDelete")
	End Try
End Sub

Public Sub GetForooshAndKharid(CodeTafzili As String,CodeKala As String)
	CodeTafzili1=CodeTafzili
	CodeKala1=CodeKala
	StatusCodeKala1="NotOK"
	If StatusCodeKala1="NotOK" Then
		GetKala("GetSingleKala")
	End If

	
End Sub

Sub GetKala(str As String)
	Select str
		Case "GetKala"
			jobInternet.JobName ="GetKala"
			Log ( MCode.DeviceId)
		
			jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetStoredFast","NameStored=ListKala" & "&Imei=" & MCode.DeviceId & "&fldFeeTasvie=" & MCode.feeCode  &" &DateUpdate=" & DateUpdate)
	
		Case "GetKalaAll"
			jobInternet.JobName ="GetKalaAll"
			Log ( MCode.DeviceId)
			jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetStoredNew","NameStored=ListKala" & "&fldFeeTasvie=" & MCode.feeCode & "&Imei=" & MCode.DeviceId)
		Case "GetSingleKala"
			jobInternet.JobName ="GetKala"
			Log ( MCode.DeviceId)
		
			jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetSingle","NameStored=ListKala" & "&fldCode=" & CodeKala1 & "&Imei=" & MCode.DeviceId)
	
	End Select
	'Wait For(jobInternet) JobDone http://
End Sub
Sub LoadGetKalaFast(Str As String)
	Try
	Dim RowsList As List
	Dim Row As Map
	Dim crow As  Cursor
	Dim CountRow As Int
	Row.Initialize
	MCode.Json.Initialize(Str.Trim)
	RowsList = MCode.Json.NextArray
	Log(Str)
	For i = 0 To RowsList.Size - 1
		
		Row=RowsList.Get(i)
		Log("fldCodeKala:"& Row.Get("fldCodeKala"))

		crow=MCode.Result("select * from TblKala where fldCodeKala=" & Row.Get("fldCodeKala"))
		CountRow=crow.RowCount
		If CountRow =0 Then
			DBUtils.InsertMaps(MCode.Sql1,"TblKala",RowsList)
'			MCode.SaveUpdate("Insert Into TblKala (fldCodeKala,fldNameKala,fldNameVahed,fldNameVahed2,SumMande,fldTedadDarKarton,fldFeeForoosh,fldCodeGroup,fldGhymatMasrafkonande,fldPathPic,fldFeeTasvie) Values ('"& _
'		 Row.Get("fldCodeKala") &"','"& Row.Get("fldNameKala") &"','"& Row.Get("fldNameVahed") &"','"& Row.Get("fldNameVahed2") &"','"& _
'		  Row.Get("SumMande") &"','"& Row.Get("fldTedadDarKarton") &"','"& Row.Get("fldFeeForoosh") &"','"& Row.Get("fldCodeGroup") &"','"&  Row.Get("fldGhymatMasrafkonande") &"','"&  Row.Get("fldPathPic") &"','"&  Row.Get("fldFeeTasvie") &"')")
'	
		Else if CountRow>0 Then
			
			'delete Row
			'MCode.SaveUpdate("Delete From TblKala where fldCodeKala="& Row.Get("fldCodeKala"))
			
			'insert
'			MCode.SaveUpdate("Insert Into TblKala (fldCodeKala,fldNameKala,fldNameVahed,fldNameVahed2,SumMande,fldTedadDarKarton,fldFeeForoosh,fldCodeGroup,fldGhymatMasrafkonande,fldPathPic Values ('"& _
'		 Row.Get("fldCodeKala") &"','"& Row.Get("fldNameKala") &"','"& Row.Get("fldNameVahed") &"','"& Row.Get("fldNameVahed2") &"','"& _
'		  Row.Get("SumMande") &"','"& Row.Get("fldTedadDarKarton") &"','"& Row.Get("fldFeeForoosh") &"','"& Row.Get("fldCodeGroup") &"','"&  Row.Get("fldGhymatMasrafkonande") &"','"&  Row.Get("fldPathPic") &"')")
'		
			'update row
			Dim Fields As Map
			Dim Where As Map
		
			Fields.Initialize
			Where.Initialize
			Fields.Put("fldNameKala",Row.Get("fldNameKala"))
			Fields.Put("fldNameVahed",Row.Get("fldNameVahed"))
			Fields.Put("fldNameVahed2",Row.Get("fldNameVahed2"))
			Fields.Put("SumMande",Row.Get("SumMande"))
			Fields.Put("fldTedadDarKarton",Row.Get("fldTedadDarKarton"))
			Fields.Put("fldFeeForoosh",Row.Get("fldFeeForoosh"))
			Fields.Put("fldCodeGroup",Row.Get("fldCodeGroup"))
			Fields.Put("fldGhymatMasrafkonande",Row.Get("fldGhymatMasrafkonande"))
			Fields.Put("fldPathPic",Row.Get("fldPathPic"))
			Fields.Put("fldFeeTasvie",Row.Get("fldFeeTasvie"))
			Fields.Put("fldSharh",Row.Get("fldSharh"))
			Where.Put("fldCodeKala",Row.Get("fldCodeKala"))

			

			DBUtils.UpdateRecord2(MCode.Sql1,"TblKala",Fields,Where)
			
'			MCode.SaveUpdate("Update TblKala Set fldNameKala='"&Row.Get("fldNameKala")&"',"& _
'			                                       "fldNameVahed='"&Row.Get("fldNameVahed")&"',"& _
'			                                       "fldNameVahed2='"&Row.Get("fldNameVahed2")&"',"& _
'			                                       "SumMande='"&Row.Get("SumMande")&"',"& _
'			                                       "fldTedadDarKarton='"&Row.Get("fldTedadDarKarton")&"',"& _
'			                                       "fldFeeForoosh='"&Row.Get("fldFeeForoosh")&"',"& _
'			                                       "fldCodeGroup='"&Row.Get("fldCodeGroup")&"',"& _
'			                                       "fldGhymatMasrafkonande='"&Row.Get("fldGhymatMasrafkonande")&"',"& _
'			                                       "fldPathPic='"&Row.Get("fldPathPic")&"',"& _
'			                                       "fldFeeTasvie='"&Row.Get("fldFeeTasvie")&"'"& _
'			" where fldCodeKala="& Row.Get("fldCodeKala"))
				If MCode.PicOnline=0 Then		
						Dim path As String=myCode.GetPathPicByCodeKala(Row.Get("fldCodeKala"))
						Log(path)	
						MCode.SaveUpdate("Update TblKala Set fldPathPic='"& path &"' where FldCodeKala=" & Row.Get("fldCodeKala"))				
'		Log("fldCodeKala:"& Row.Get("fldCodeKala"))
'		MCode.SaveUpdate("Insert Into TblKala (FldCodeKala,FldNameKala,FldNameVahed,FldNameVahed2,FldSumMande,FldTedadDarKarton,FldFeeForoosh,FldGoroohKala,FldMablaghMasrafKonande) Values ('"& _
'		 Row.Get("fldCodeKala") &"','"& Row.Get("fldNameKala") &"','"& Row.Get("fldNameVahed") &"','"& Row.Get("fldNameVahed2") &"','"& _
'		  Row.Get("SumMande") &"','"& Row.Get("fldTedadDarKarton") &"','"& Row.Get("fldFeeForoosh") &"','"& Row.Get("fldCodeGroup") &"','"&  Row.Get("FldMablaghMasrafKonande") &"')")
'	
				End If
		End If

	Next


		Log("لیست کالا بروزرسانی گردید:   " & RowsList.Size)
		
	Catch
		Log(LastException)
		myCode.SendError(LastException,"FirebaseMessaging-LoadGetKalaFast")
	End Try
	
	GetCurrentDate
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
			For i = 0 To RowsList.Size - 1
		
				Row=RowsList.Get(i)
				Dim path As String=myCode.GetPathPicByCodeKala(Row.Get("fldCodeKala"))
				Log(path)
				
				MCode.SaveUpdate("Update TblKala Set fldPathPic='"& path &"' where FldCodeKala=" & Row.Get("fldCodeKala"))
				
'		Log("fldCodeKala:"& Row.Get("fldCodeKala"))
'		MCode.SaveUpdate("Insert Into TblKala (FldCodeKala,FldNameKala,FldNameVahed,FldNameVahed2,FldSumMande,FldTedadDarKarton,FldFeeForoosh,FldGoroohKala,FldMablaghMasrafKonande) Values ('"& _
'		 Row.Get("fldCodeKala") &"','"& Row.Get("fldNameKala") &"','"& Row.Get("fldNameVahed") &"','"& Row.Get("fldNameVahed2") &"','"& _
'		  Row.Get("SumMande") &"','"& Row.Get("fldTedadDarKarton") &"','"& Row.Get("fldFeeForoosh") &"','"& Row.Get("fldCodeGroup") &"','"&  Row.Get("FldMablaghMasrafKonande") &"')")
'	
			Next
		End If
	Cu=MCode.Result("Select * From TblKala")
	Log("لیست کالا بروزرسانی گردید")
		ToastMessageShow("لیست کالا بروزرسانی گردید:   " & Cu.RowCount,True)
	Catch
		Log(LastException)
		myCode.SendError(LastException,"FirebaseMessaging-LoadGetKala")
	End Try
	GetCurrentDate
End Sub

Sub GetUpdateFee
	jobInternet.JobName ="GetUpdateFee"
	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetStoredNew","NameStored=UpdateFee" & "&fldFeeTasvie=" & MCode.feeCode & "&Imei=" & MCode.DeviceId)
End Sub

Sub LoadGetUpdateFee(Str As String)
	Try
	Dim RowsList As List
	Dim Row As Map
	Row.Initialize

	MCode.Json.Initialize(Str.Trim)
	RowsList = MCode.Json.NextArray
	
	For i = 0 To RowsList.Size - 1		
	Row=RowsList.Get(i)
	Log("fldCodeKala:"& Row.Get("fldCodeKala"))
		Log("fldFeeTasvie:"& Row.Get("fldFeeTasvie"))
		MCode.SaveUpdate("Update TblKala Set fldFeeTasvie='"&Row.Get("fldFeeTasvie")&"'"& _
			" where fldCodeKala="& Row.Get("fldCodeKala"))
		Next
	Catch
		Log(LastException)
		myCode.SendError(LastException,"FirebaseMessaging-LoadGetUpdateFee")
	End Try
End Sub

Sub GetGalleryKala(str As String)
	Select str
		Case "GetGalleryKala"
			jobInternet.JobName ="GetGalleryKala"

			Dim tblname As String
			tblname="tblGalleryPic"
			jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetAndroidFast","TblName="& tblname & "&Imei=" & MCode.DeviceId & " &DateUpdate=" & DateUpdate)
			'jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetAndroid","Query=select * from tblGalleryPic " & " &Imei=" & MCode.DeviceId)
			'jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetAndroid","Query=select * from tblGalleryPic " & "&Imei=" & MCode.DeviceId)
		Case "GetGalleryKalaAll"
			jobInternet.JobName ="GetGalleryKalaAll"
			jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetAndroid","Query=select * from tblGalleryPic where fldDateUpdate='"&DateUpdate&"'" & "&Imei=" & MCode.DeviceId)
	End Select

	
End Sub

Sub LoadGetGalleryKalaFast(Str As String)
	Try
	Dim RowsList As List
	Dim Row As Map
	Dim crow As  Cursor
	Dim CountRow As Int
	MCode.SaveUpdate("Delete From TblGalleryPic")
	MCode.Json.Initialize(Str.Trim )
	RowsList = MCode.Json.NextArray
	
	For i = 0 To RowsList.Size - 1
		Row=RowsList.Get(i)
		Log("fldCodeKala:"& Row.Get("fldCodeKala"))

		crow=MCode.Result("select * from TblGalleryPic where fldCodeKala='" & Row.Get("fldCodeKala") &"' and fldImageNumber='" & Row.Get("fldImageNumber") &"'")
		CountRow=crow.RowCount
		If CountRow =0 Then
			DBUtils.InsertMaps(MCode.Sql1,"TblGalleryPic",RowsList)
'			MCode.SaveUpdate("Insert Into TblGalleryPic (fldCodeKala,fldImageNumber,fldImage,fldShow) Values ('"& _
'		 Row.Get("fldCodeKala") &"','"& Row.Get("fldImageNumber") &"','"& Row.Get("fldImage") &"','"& Row.Get("fldShow") &"')")
'			
		Else if CountRow>0 Then
			
			'delete Row
'			MCode.SaveUpdate("Delete From TblGoroohKala where FldC_Gorooh="& Row.Get("fldGroupId"))
			
			'insert
'			MCode.SaveUpdate("Insert Into TblGoroohKala (FldC_Gorooh,FldN_Gorooh) Values ('"& _
'		 Row.Get("fldGroupId") &"','"& Row.Get("fldGroupName") &"')")
'			Log("fldGroupName:"&Row.Get("fldGroupName"))

			'update row
			Dim Fields As Map
			Dim Where As Map
		
			Fields.Initialize
			Where.Initialize
			Fields.Put("fldImage",Row.Get("fldImage"))
			Fields.Put("fldShow",Row.Get("fldShow"))	
			Where.Put("fldCodeKala",Row.Get("fldCodeKala"))
			Where.Put("fldImageNumber",Row.Get("fldImageNumber"))

			DBUtils.UpdateRecord2(MCode.Sql1,"TblGalleryPic",Fields,Where)
			
'			MCode.SaveUpdate("Update TblGalleryPic Set fldImage='"&Row.Get("fldImage")&"',fldShow='"&Row.Get("fldShow")&"'"& _
'			" where fldCodeKala='" & Row.Get("fldCodeKala") &"' and fldImageNumber='" & Row.Get("fldImageNumber") &"'")
'		
		End If
	Next
	Log("گالری تصاویر بروزرسانی گردید")
		ToastMessageShow("گالری تصاویر بروزرسانی گردید",True)
	Catch
		Log(LastException)
		myCode.SendError(LastException,"FirebaseMessaging-LoadGetGalleryKalaFast")
	End Try
End Sub

Public Sub GetEshantion
	jobInternet.JobName ="GetEshantion"
	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetEshantion","Imei=" & MCode.DeviceId &" &CodeVisitor="&MCode.C_Visitor & " &DateUpdate=" & DateUpdate)
End Sub

Sub LoadGetEshantionFast(Str As String)
	Try
	Dim RowsList As List
	Dim crow As  Cursor
	Dim CountRow As Int
	Dim Row As Map
	Row.Initialize
	MCode.Json.Initialize(Str.Trim )
	RowsList = MCode.Json.NextArray
	
	For i = 0 To RowsList.Size - 1
		Row=RowsList.Get(i)
		Log("fldCodeKala:"& Row.Get("fldCodeKala"))
		crow=MCode.Result("select * from tblEshantionVisitori where fldCodeKala=" & Row.Get("fldCodeKala"))
		CountRow=crow.RowCount
		If CountRow =0 Then
			DBUtils.InsertMaps(MCode.Sql1,"tblEshantionVisitori",RowsList)
			
		Else if CountRow>0 Then

			'update row
			Dim Fields As Map
			Dim Where As Map
		
			Fields.Initialize
			Where.Initialize
			Fields.Put("fldCodeKala",Row.Get("fldCodeKala"))
			Fields.Put("fldTedadEshantion",Row.Get("fldTedadEshantion"))
			Fields.Put("fldCountForoosh",Row.Get("fldCountForoosh"))
			Fields.Put("fldVaziat",Row.Get("fldVaziat"))
			
			Where.Put("fldCodeKala",Row.Get("fldCodeKala"))

			DBUtils.UpdateRecord2(MCode.Sql1,"tblEshantionVisitori",Fields,Where)
		End If

	Next
		Log("لیست اشانتیون بروزرسانی گردید:   " & RowsList.Size)
	Catch
		Log(LastException)
		myCode.SendError(LastException,"FirebaseMessaging-LoadGetEshantionFast")
	End Try
	GetCurrentDate
End Sub

Sub LoadGetEshantion(Str As String)
	Dim RowsList As List
	Dim Row As Map
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
'	ToastMessageShow("عملیات دریافت اطلاعات با موفقیت تکمیل شد",True)
'	ToastMessageShow("گالری تصاویر بروزرسانی گردید",True)
End Sub

Sub LoadGetGalleryKala(Str As String)
	Dim RowsList As List
	Dim Row As Map
	MCode.SaveUpdate("Delete From TblGalleryPic")
	MCode.Json.Initialize(Str.Trim )
	RowsList = MCode.Json.NextArray
	
	For i = 0 To RowsList.Size - 1
		Row=RowsList.Get(i)
		MCode.SaveUpdate("Insert Into TblGalleryPic (fldCodeKala,fldImageNumber,fldImage,fldShow) Values ('"& _
		 Row.Get("fldCodeKala") &"','"& Row.Get("fldImageNumber") &"','"& Row.Get("fldImage") &"','"& Row.Get("fldShow") &"')")
		
	Next
	Log("گالری تصاویر بروزرسانی گردید")
	ToastMessageShow("گالری تصاویر بروزرسانی گردید",True)
End Sub

Sub GetGoroohKala(str As String)
	Select str
		Case "GetGoroohKala"
			jobInternet.JobName ="GetGoroohKala"

			Dim tblname As String
			tblname="dbo.tblGroupKala"
			jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetAndroidFast","TblName="& tblname & "&Imei=" & MCode.DeviceId & " &DateUpdate=" & DateUpdate)

		Case "GetGoroohKalaAll"
			jobInternet.JobName ="GetGoroohKalaAll"
			jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetAndroid","Query=Select fldGroupId,fldGroupName From tblGroupKala ORDER BY CONVERT(varchar, fldGroupId)" & "&Imei=" & MCode.DeviceId)
	End Select

	
End Sub
Sub LoadGetGoroohKalaFast(Str As String)
	Try
	Dim RowsList As List
	Dim Row As Map
	Dim crow As  Cursor
	Dim CountRow As Int
	
	
	MCode.Json.Initialize(Str.Trim )
	RowsList = MCode.Json.NextArray
	
	For i = 0 To RowsList.Size - 1
		
		Row=RowsList.Get(i)
		Log("FldC_Gorooh:"& Row.Get("fldGroupId"))

		crow=MCode.Result("select * from TblGoroohKala where FldC_Gorooh=" & Row.Get("fldGroupId"))
		CountRow=crow.RowCount
		If CountRow =0 Then
			MCode.SaveUpdate("Insert Into TblGoroohKala (FldC_Gorooh,FldN_Gorooh) Values ('"& _
		 Row.Get("fldGroupId") &"','"& Row.Get("fldGroupName") &"')")
			Log("fldGroupName:"&Row.Get("fldGroupName"))
		Else if CountRow>0 Then
			
			'delete Row
'			MCode.SaveUpdate("Delete From TblGoroohKala where FldC_Gorooh="& Row.Get("fldGroupId"))
			
			'insert
'			MCode.SaveUpdate("Insert Into TblGoroohKala (FldC_Gorooh,FldN_Gorooh) Values ('"& _
'		 Row.Get("fldGroupId") &"','"& Row.Get("fldGroupName") &"')")
'			Log("fldGroupName:"&Row.Get("fldGroupName"))

			'update row
			MCode.SaveUpdate("Update TblGoroohKala Set FldN_Gorooh='"&Row.Get("fldGroupName")&"'"& _
			" where FldC_Gorooh="& Row.Get("fldGroupId"))
		
		End If

	Next
	'DBUtils.InsertMaps(MCode.Sql1,"TblGoroohKala",RowsList)

		Log("لیست گروه کالا بروزرسانی گردید:   " & RowsList.Size)
	Catch
		Log(LastException)
		myCode.SendError(LastException,"FirebaseMessaging-LoadGetGoroohKalaFast")
	End Try
	GetCurrentDate
End Sub
Sub LoadGetGoroohKala(Str As String)
	Try
	Dim RowsList As List
	Dim Row As Map
	MCode.SaveUpdate("Delete From TblGoroohKala")
	MCode.Json.Initialize(Str.Trim )
	RowsList = MCode.Json.NextArray
	
	For i = 0 To RowsList.Size - 1
		Row=RowsList.Get(i)
		MCode.SaveUpdate("Insert Into TblGoroohKala (FldC_Gorooh,FldN_Gorooh) Values ('"& _
		 Row.Get("fldGroupId") &"','"& Row.Get("fldGroupName") &"')")
		Log("fldGroupName:"&Row.Get("fldGroupName"))
	Next

	Log("گروه کالا بروزرسانی گردید")
		ToastMessageShow("گروه کالا بروزرسانی گردید",True)
	Catch
		Log(LastException)
		myCode.SendError(LastException,"FirebaseMessaging-LoadGetGoroohKala")
	End Try
	GetCurrentDate
End Sub

Sub GetAshkhas(str As String)
	Select str
		Case "GetAshkhas"
			jobInternet.JobName ="GetAshkhas"
			jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetStoredFast","NameStored=ListAshkhas"& "&fldFeeTasvie=" & MCode.feeCode  & "&Imei=" & MCode.DeviceId & " &DateUpdate=" & DateUpdate)
		Case "GetAshkhasAll"
			jobInternet.JobName ="GetAshkhasAll"
			jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetStoredNew","NameStored=ListAshkhas"& "&fldFeeTasvie=" & MCode.feeCode & "&Imei=" & MCode.DeviceId)
		Case "GetSingleAshkhas"
			
			jobInternet.JobName ="GetAshkhas"
			Log (MCode.DeviceId)		
			jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetSingle","NameStored=ListAshkhas" & "&fldCode=" & CodeTafzili1 & "&Imei=" & MCode.DeviceId)
	End Select

End Sub

Sub LoadGetAshkhasFast(Str As String)
	Try
	Dim RowsList As List
	Dim crow As  Cursor
	Dim CountRow As Int
	Dim Row As Map
	Row.Initialize
	MCode.Json.Initialize(Str.Trim )
	RowsList = MCode.Json.NextArray
	
	For i = 0 To RowsList.Size - 1
		Row=RowsList.Get(i)
		Log("fldCodetafzili:"& Row.Get("fldCodetafzili"))
		crow=MCode.Result("select * from TblAshkhas where fldCodetafzili=" & Row.Get("fldCodetafzili"))
		CountRow=crow.RowCount
		If CountRow =0 Then
				DBUtils.InsertMaps(MCode.Sql1,"TblAshkhas",RowsList)
				If myCode.Is_Null(Row.Get("fldCodeMovaghat"))<>"" Then
					MCode.SaveUpdate("Delete from TblAshkhas where fldCodetafzili= "&Row.Get("fldCodeMovaghat"))
					MCode.SaveUpdate("Update TblFaktor set FldC_Tafzili="&Row.Get("fldCodetafzili")& " where FldC_Tafzili="& Row.Get("fldCodeMovaghat"))
				End If
			Log("fldCodetafzili:"&Row.Get("fldCodetafzili"))
		Else if CountRow>0 Then

			'update row
			Dim Fields As Map
		 	Dim Where As Map
		
		 	Fields.Initialize
		 	Where.Initialize
			Fields.Put("fldSharheTafzili",Row.Get("fldSharheTafzili"))
			Fields.Put("fldMande",Row.Get("fldMande"))
			Fields.Put("fldVisitor",Row.Get("fldVisitor"))
			Fields.Put("fldTell",Row.Get("fldTell"))
			Fields.Put("fldAdress",Row.Get("fldAdress"))
			Fields.Put("fldNameGroup",Row.Get("fldNameGroup"))
			Fields.Put("fldCodeGroup",Row.Get("fldCodeGroup"))
			Fields.Put("fldLat",Row.Get("fldLat"))
			Fields.Put("fldLon",Row.Get("fldLon"))
				If myCode.Is_Null(Row.Get("fldCodeMovaghat"))<>"" Then
					Fields.Put("fldCodetafzili",Row.Get("fldCodetafzili"))
					Fields.Put("fldCodeMovaghat",Row.Get("fldCodeMovaghat"))
					Log("fldCodetafzili:"&Row.Get("fldCodetafzili"))
					Log("fldCodeMovaghat:"&Row.Get("fldCodeMovaghat"))
					Where.Put("fldCodetafzili",Row.Get("fldCodeMovaghat"))
					MCode.SaveUpdate("Update TblFaktor set FldC_Tafzili="&Row.Get("fldCodetafzili")& " where FldC_Tafzili="& Row.Get("fldCodeMovaghat"))
					Else
					Where.Put("fldCodetafzili",Row.Get("fldCodetafzili"))
				End If
			
			

			DBUtils.UpdateRecord2(MCode.Sql1,"TblAshkhas",Fields,Where)
		End If

	Next
		Log("لیست اشخاص بروزرسانی گردید:   " & RowsList.Size)
	Catch
		Log(LastException)
		myCode.SendError(LastException,"FirebaseMessaging-LoadGetGoroohKala")
	End Try
	GetCurrentDate
End Sub
Sub LoadGetAshkhas(Str As String)
	Try
	Dim RowsList As List
	Dim m,d As Int=0
	Dim Row As Map
	Row.Initialize
		Dim Cu As  Cursor
		Dim Cu As Cursor = MCode.Result("Select * From TblAshkhasNew")
		If Cu.RowCount>0 Then
			MCode.SaveUpdate("Delete From TblAshkhas where length(FldCodeTafzili)<6")
		Else
			MCode.SaveUpdate("Delete From TblAshkhas")
		End If
	MCode.Json.Initialize(Str.Trim )
	RowsList = MCode.Json.NextArray
	DBUtils.InsertMaps(MCode.Sql1,"TblAshkhas",RowsList)
	Cu=MCode.Result("Select * From TblAshkhas")
	Log("لیست اشخاص بروزرسانی گردید")
		ToastMessageShow("لیست اشخاص بروزرسانی گردید:   " & Cu.RowCount,True)
	Catch
		Log(LastException)
		myCode.SendError(LastException,"FirebaseMessaging-LoadGetAshkhas")
	End Try
End Sub
Sub GetGoroohAshkhas(str As String)
	Select str
		Case "GetGoroohAshkhas"
			jobInternet.JobName ="GetGoroohAshkhas"
			Dim tblname As String
			tblname="dbo.tblGroupAshkhas"
			jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetAndroidFast","TblName="& tblname & "&Imei=" & MCode.DeviceId & " &DateUpdate=" & DateUpdate)
		Case "GetGoroohAshkhasAll"
			jobInternet.JobName ="GetGoroohAshkhasAll"
			jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetAndroid","Query=Select fldGroupId,fldGroupName From tblGroupAshkhas ORDER BY CONVERT(varchar, fldGroupId)" & "&Imei=" & MCode.DeviceId)
	End Select
End Sub

Sub LoadGetGoroohAshkhasFast(Str As String)
	Try
	Dim RowsList As List
	Dim Row As Map
	Dim crow As  Cursor
	Dim CountRow As Int
	
	MCode.Json.Initialize(Str.Trim )
	RowsList = MCode.Json.NextArray
	
	For i = 0 To RowsList.Size - 1
		Row=RowsList.Get(i)
		crow=MCode.Result("select * from TblGoroohAshkhas where FldC_Gorooh=" & Row.Get("fldGroupId"))
		CountRow=crow.RowCount
		If CountRow =0 Then
			MCode.SaveUpdate("Insert Into TblGoroohAshkhas (FldC_Gorooh,FldN_Gorooh) Values ('"& _
		 Row.Get("fldGroupId") &"','"& Row.Get("fldGroupName") &"')")
			Log(Row.Get("fldGroupName"))
		Else If CountRow>0 Then
			'delete Row
			'MCode.SaveUpdate("Delete From TblGoroohAshkhas where FldC_Gorooh="& Row.Get("fldGroupId"))
			
			'insert
'			MCode.SaveUpdate("Insert Into TblGoroohAshkhas (FldC_Gorooh,FldN_Gorooh) Values ('"& _
'		 Row.Get("fldGroupId") &"','"& Row.Get("fldGroupName") &"')")
'			Log(Row.Get("fldGroupName"))

			MCode.SaveUpdate("Update TblGoroohAshkhas Set FldN_Gorooh='"&Row.Get("fldGroupName")&"'"& _
			" where FldC_Gorooh="& Row.Get("fldGroupId"))
		End If
			
	Next
	
	Log("لیست 'گروه اشخاص بروزرسانی گردید:   " & RowsList.Size)
		Log("گروه اشخاص بروزرسانی گردید")
	Catch
		Log(LastException)
		myCode.SendError(LastException,"FirebaseMessaging-LoadGetGoroohAshkhasFast")
	End Try
'	GetCurrentDate
End Sub
Sub LoadGetGoroohAshkhas(Str As String)
	Try
	Dim RowsList As List
	Dim Row As Map
	MCode.SaveUpdate("Delete From TblGoroohAshkhas")
	MCode.Json.Initialize(Str.Trim )
	RowsList = MCode.Json.NextArray
	
	For i = 0 To RowsList.Size - 1
		Row=RowsList.Get(i)
		MCode.SaveUpdate("Insert Into TblGoroohAshkhas (FldC_Gorooh,FldN_Gorooh) Values ('"& _
		 Row.Get("fldGroupId") &"','"& Row.Get("fldGroupName") &"')")
		Log(Row.Get("fldGroupName"))
	Next
	Log("گروه اشخاص بروزرسانی گردید")
		ToastMessageShow("گروه اشخاص بروزرسانی گردید",True)
	Catch
		Log(LastException)
		myCode.SendError(LastException,"FirebaseMessaging-LoadGetGoroohAshkhas")
	End Try
'	GetCurrentDate
End Sub



Sub Service_Destroy
	'StartServiceAt(Me, DateTime.Now, False)
End Sub
Sub SendToken(Str As String)
	jobInternet.JobName ="SaveToken"
	Log(Str)
	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/SaveToken","Token=" & Str & "&Imei=" & MCode.DeviceId)
End Sub

'Sub GetVaziat
'	jobInternet.JobName ="GetVaziat"
'	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetAndroid","Query=Select * from zomorodo_majidmarashi.tblSettingMovaghat where fldTokenId='" & MCode.DeviceId &"' &Imei="& MCode.DeviceId )
'End Sub
'
'Sub LoadGetVaziat(Str As String)
'	Try
'	Dim RowsList As List
'	Dim Row As Map
'	MCode.Json.Initialize(Str.Trim )
'	RowsList = MCode.Json.NextArray
'
'	For i = 0 To RowsList.Size - 1
'		Row=RowsList.Get(i)
'		Dim Query As String="Update TblSetting Set  FldVaziat = '"& Row.Get("fldVaziat") &"'"
'		MCode.SaveUpdate(Query)
'	Next
'
'	ToastMessageShow("وضعیت فعالسازی با موفقیت تغییر گردید",True)
'		MCode.IsActive=True
'	Catch
'		Log(LastException)
'		myCode.SendError(LastException,"FirebaseMessaging-LoadGetVaziat")
'	End Try
''	Act_Main.t2.Enabled=True
'	
''	GetCurrentDate
'End Sub

Sub GetFee
	jobInternet.JobName ="GetFee"
	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetListFee","&Imei=" &  MCode.DeviceId & " &DateUpdate=" & DateUpdate)
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
End Sub

Sub LoadGetFeeFast(Str As String)
	Try
	Dim RowsList As List
	Dim Row As Map
	Dim crow As  Cursor
	Dim CountRow As Int
	'MCode.SaveUpdate("Delete From TblFee")
	MCode.Json.Initialize(Str.Trim )
	RowsList = MCode.Json.NextArray
	
	For i = 0 To RowsList.Size - 1
		Row=RowsList.Get(i)
		Log("fldCodeKala:"& Row.Get("fldCodeKala"))

		crow=MCode.Result("select * from TblFee where FldCodeKala='" & Row.Get("fldCodeKala") &"' and FldCodeTasvie='" & Row.Get("fldCodeTasvie") &"'")
		CountRow=crow.RowCount
		If CountRow =0 Then
			MCode.SaveUpdate("Insert Into TblFee (FldCodeKala,FldCodeTasvie,FldFee) Values ('"& _
		 Row.Get("fldCodeKala") &"','"& Row.Get("fldCodeTasvie") &"','"& Row.Get("fldFee") &"')")
			
		Else if CountRow>0 Then
			
			'delete Row
'			MCode.SaveUpdate("Delete From TblGoroohKala where FldC_Gorooh="& Row.Get("fldGroupId"))
			
			'insert
'			MCode.SaveUpdate("Insert Into TblGoroohKala (FldC_Gorooh,FldN_Gorooh) Values ('"& _
'		 Row.Get("fldGroupId") &"','"& Row.Get("fldGroupName") &"')")
'			Log("fldGroupName:"&Row.Get("fldGroupName"))

			'update row
			MCode.SaveUpdate("Update TblFee Set FldFee='"&Row.Get("fldFee")&"'"& _
			" where FldCodeKala='" & Row.Get("fldCodeKala") &"' and FldCodeTasvie='" & Row.Get("fldCodeTasvie") &"'")
		
		End If
	Next
		Log("فی بروزرسانی گردید")
	Catch
		Log(LastException)
		myCode.SendError(LastException,"FirebaseMessaging-LoadGetFeeFast")
	End Try
	'ToastMessageShow("گالری تصاویر بروزرسانی گردید",True)
End Sub
Sub GetTasvie
	jobInternet.JobName ="GetTasvie"
	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetListTasvie","&Imei=" &  MCode.DeviceId & " &DateUpdate=" & DateUpdate)
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
End Sub

Sub LoadGetTasvieFast(Str As String)
	Try
	Dim RowsList As List
	Dim Row As Map
	Dim crow As  Cursor
	Dim CountRow As Int
'	MCode.SaveUpdate("Delete From TblTasvie")
	MCode.Json.Initialize(Str.Trim )
	RowsList = MCode.Json.NextArray
	
	For i = 0 To RowsList.Size - 1
		Row=RowsList.Get(i)
		Log("FldCode:"& Row.Get("fldCode"))

		crow=MCode.Result("select * from TblTasvie where FldCode='" & Row.Get("fldCode") &"'")
		CountRow=crow.RowCount
		If CountRow =0 Then
			MCode.SaveUpdate("Insert Into TblTasvie (FldCode,FldName) Values ('"& _
		 Row.Get("fldCode") &"','"& Row.Get("fldName") &"'")
			
		Else if CountRow>0 Then
			
			'delete Row
'			MCode.SaveUpdate("Delete From TblGoroohKala where FldC_Gorooh="& Row.Get("fldGroupId"))
			
			'insert
'			MCode.SaveUpdate("Insert Into TblGoroohKala (FldC_Gorooh,FldN_Gorooh) Values ('"& _
'		 Row.Get("fldGroupId") &"','"& Row.Get("fldGroupName") &"')")
'			Log("fldGroupName:"&Row.Get("fldGroupName"))

			'update row
			MCode.SaveUpdate("Update TblTasvie Set FldName='"&Row.Get("fldName")&"'"& _
			" where FldCode='" & Row.Get("fldCode") &"'")
		
		End If
	Next
	
		Log("تسویه بروزرسانی گردید")
		Select MCode.page
			Case "KalaDefault"
							
				CallSubDelayed(Act_KalaDefault,"LoadAcSpNoeTasvie")
			Case "Kala_listi"
				CallSubDelayed(Act_Kala_listi,"LoadAcSpNoeTasvie")
			Case "SabtMarjooii"
				CallSubDelayed(Act_KalaDefault,"LoadAcSpNoeTasvie")
			Case "Search"
				CallSubDelayed(Act_Search,"LoadAcSpNoeTasvie")
		End Select
	Catch
		Log(LastException)
		myCode.SendError(LastException,"FirebaseMessaging-LoadGetTasvieFast")
	End Try
	'ToastMessageShow("گالری تصاویر بروزرسانی گردید",True)
End Sub

Sub GetHavale
	jobInternet.JobName ="GetHavale"
	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetStoredTozie","NameStored=GetHavale"& " &Imei=" & MCode.DeviceId & " &flag=" & MCode.GetHavaleFlag & " &LastDateUpdate=" & DateUpdate)
End Sub
Sub GetHavaleByUser
	jobInternet.JobName ="GetHavaleByUser"
	Log(DateUpdate)
	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/ShowHavaleGoroohiByRanadeh","Imei=" & MCode.DeviceId & "&flag=" & MCode.GetHavaleFlag & "&DateUpdate=" & DateUpdate)
End Sub

Sub LoadGetGetHavale(Str As String)
	Try
		Dim RowsList As List
		Dim Row As Map
		MCode.SaveUpdate("Delete From TblHavale")
		MCode.Json.Initialize(Str.Trim )
		RowsList = MCode.Json.NextArray
		DBUtils.InsertMaps(MCode.Sql1,"TblHavale",RowsList)
		Log("لیست حواله بروزرسانی گردید")
		CallSubDelayed(Act_HavaleTozie,"LoadFilter")
	Catch
		Log(LastException)
		myCode.SendError(LastException,"Service_Server-LoadGetVisitor")
	End Try
	'ToastMessageShow("گروه اشخاص بروزرسانی گردید",True)
End Sub



Sub LoadGetGetHavaleFast(Str As String)
	Try
		Dim RowsList As List
		Dim Row As Map
		Dim crow As  Cursor
		Dim CountRow As Int
'	MCode.SaveUpdate("Delete From TblTasvie")
		MCode.Json.Initialize(Str.Trim )
		RowsList = MCode.Json.NextArray
	
		For i = 0 To RowsList.Size - 1
			Row=RowsList.Get(i)
			Log("fldShomareHavale:"& Row.Get("fldShomareHavale"))

			crow=MCode.Result("select * from TblHavale where fldShomareHavale='" & Row.Get("fldShomareHavale") &"'")
			CountRow=crow.RowCount
			If CountRow =0 Then
				DBUtils.InsertMaps(MCode.Sql1,"TblHavale",RowsList)
			
			Else if CountRow>0 Then
			
				'delete Row
'			MCode.SaveUpdate("Delete From TblGoroohKala where FldC_Gorooh="& Row.Get("fldGroupId"))
			
				'insert
'			MCode.SaveUpdate("Insert Into TblGoroohKala (FldC_Gorooh,FldN_Gorooh) Values ('"& _
'		 Row.Get("fldGroupId") &"','"& Row.Get("fldGroupName") &"')")
'			Log("fldGroupName:"&Row.Get("fldGroupName"))

				'update row
				MCode.SaveUpdate("Update TblHavale Set fldShomareHavale='"&Row.Get("fldShomareHavale")&"'"& _
				",fldDate='"&Row.Get("fldDate")&"'"& _
				",fldVaziat='"&Row.Get("fldVaziat")&"'"& _
				",fldMandeFactor='"&Row.Get("fldMandeFactor")&"'"& _
				",fldCountFactor='"&Row.Get("fldCountFactor")&"'"& _
			" where fldShomareHavale='" & Row.Get("fldShomareHavale") &"'")
		
			End If
		Next
	
		Log("حواله بروزرسانی گردید")
		
'		Select MCode.page
'			Case "KalaDefault"
'							
'				CallSubDelayed(Act_KalaDefault,"LoadAcSpNoeTasvie")
'			Case "Kala_listi"
'				CallSubDelayed(Act_Kala_listi,"LoadAcSpNoeTasvie")
'			
'		End Select
	Catch
		Log(LastException)
		myCode.SendError(LastException,"FirebaseMessaging-LoadGetTasvieFast")
	End Try
End Sub

Sub ShowRizeFactorForooshByHavale()
	jobInternet.JobName ="ShowRizFactorForooshByHavale"
	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/ShowRizFactorForooshByHavale","Imei=" & MCode.DeviceId)
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

Sub GetReportRizePishFactor3
	jobInternet.JobName ="GetReportRizePishFactor3"
	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetRizReportFactor3","Imei=" & MCode.DeviceId &" &CodeVisitor="&MCode.C_Visitor)
End Sub

Sub LoadGetReportRizePishFactor3(Str As String)
	Try
		Dim RowsList As List
		Dim Row As Map
		MCode.Json.Initialize(Str.Trim )
		RowsList = MCode.Json.NextArray
		
		MCode.SaveUpdate("Delete From TblFaktor where FldSync='True'")
		Dim lst As List
		lst.Initialize
		For i = 0 To RowsList.Size - 1
			Row=RowsList.Get(i)
'			MCode.SaveUpdate("Insert Into TblFaktor (FldRadif,FldShomareFaktor,FldVaziatPardakht,FldC_Tafzili,FldN_Tafzili,FldCodeKala,FldNamekala,FldFeeForoosh,FldTedadDarKarton,FldTedadDarSabadJoz,FldTedadDarSabadKol,FldTozihat) Values ('"& _
'		 Row.Get("Id") &"','"& Row.Get("fldTitle") &"','"& Row.Get("fldBody") &"','"& Row.Get("fldDate") &"','"& Row.Get("fldTime") &"')")
'		Log(Row.Get("fldTitle"))
			
			'		fldRadif,fldShomareFactor,fldCodeTafsili,fldSharheTafzili,fldCodeTafsili,fldTozihatRecord,fldDate,fldTime,fldNahveTasvie,
'		fldTedadJoz,fldFeeJoz,fldTedadCarton,fldCodeKala,fldSharhKala,FldTedadDarKarton,fldShomareFactorReal,
'		fldMablaghTakhfif,fldType,fldShomareBargasht,FldSignatureBitmapString,FldAmani
			
'		If Item.TedadDarSabadJoz>0 Or Item.TedadDarSabadKol>0 Then
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
				m.Put("fldFeeBadAzTakhfif",Row.Get("fldMablaghTakhfif"))
				m.Put("FldMablaghTakhfif",Row.Get("fldMablaghTakhfif"))
				m.Put("FldTedadDarSabadJoz",Row.Get("fldTedadJoz"))
				m.Put("FldTedadDarSabadKol",Row.Get("fldTedadCarton"))
				m.Put("FldTedadDarkarton",Row.Get("FldTedadDarKarton"))
				m.Put("FldTotalFaktor",Row.Get("FldTotalFaktor"))
				m.Put("FldTozihat",Row.Get("fldTozihatRecord"))
				m.Put("FldTozih",Row.Get("FldTozihat"))
				m.Put("FldVaziatPardakht",Row.Get("fldNahveTasvie"))
				m.Put("FldMablaghTakhfifKol",Row.Get("FldMablaghTakhfifKol"))
				m.Put("FldSumMablaghTakhfifVizhe",Row.Get("FldSumMablaghTakhfifVizhe"))
				m.Put("FldSumMablaghTakhfifKala",Row.Get("FldSumMablaghTakhfifKala"))
				m.Put("FldMablaghKol",Row.Get("FldTotalFaktor"))
				m.Put("FldDate",Row.Get("fldDate"))
				m.Put("FldTime",Row.Get("fldTime"))
				m.Put("FldSignatureBitmapString",Row.Get("FldSignatureBitmapString"))
				m.Put("FldSync","True")
				m.Put("WIsBacked","False")
				m.Put("FldType","Foroosh")
				m.Put("FldAmani",Row.Get("FldAmani"))
				m.Put("fldShomareForoosh",Row.Get("fldShomareForoosh"))
				m.Put("WSendFrom",3)
				lst.Add(m)
			#end region ---------------------

			End If
		Next
		DBUtils.InsertMaps(MCode.Sql1,"TblFaktor",lst)
'		
		Log("لیست سفارشات بروزرسانی گردید")
	Catch
		Log(LastException)
		myCode.SendError(LastException,"Service_Server-LoadGetReportRizePishFactor")
	End Try
End Sub

Sub LoadGetReportRizePishFactor3Fast(Str As String)
	Try
		Dim RowsList As List
		Dim Row As Map
		Dim crow As  Cursor
		Dim CountRow As Int
'	MCode.SaveUpdate("Delete From TblTasvie")
		MCode.Json.Initialize(Str.Trim )
		RowsList = MCode.Json.NextArray
		Dim lst As List
		lst.Initialize
		For i = 0 To RowsList.Size - 1
			Row=RowsList.Get(i)
			Log("FldShomareFaktor:"& Row.Get("fldShomareFactor"))

			crow=MCode.Result("select * from TblFaktor where FldShomareFaktor='" & Row.Get("fldShomareFactor") &"'")
			CountRow=crow.RowCount
			If CountRow =0 Then
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
					m.Put("fldFeeBadAzTakhfif",Row.Get("fldMablaghTakhfif"))
					m.Put("FldMablaghTakhfif",Row.Get("fldMablaghTakhfif"))
					m.Put("FldTedadDarSabadJoz",Row.Get("fldTedadJoz"))
					m.Put("FldTedadDarSabadKol",Row.Get("fldTedadCarton"))
					m.Put("FldTedadDarkarton",Row.Get("FldTedadDarKarton"))
					m.Put("FldTotalFaktor",Row.Get("FldTotalFaktor"))
					m.Put("FldTozihat",Row.Get("fldTozihatRecord"))
					m.Put("FldTozih",Row.Get("FldTozihat"))
					m.Put("FldVaziatPardakht",Row.Get("fldNahveTasvie"))
					m.Put("FldMablaghTakhfifKol",Row.Get("FldMablaghTakhfifKol"))
					m.Put("FldSumMablaghTakhfifVizhe",Row.Get("FldSumMablaghTakhfifVizhe"))
					m.Put("FldSumMablaghTakhfifKala",Row.Get("FldSumMablaghTakhfifKala"))
					m.Put("FldMablaghKol",Row.Get("FldTotalFaktor"))
					m.Put("FldDate",Row.Get("fldDate"))
					m.Put("FldTime",Row.Get("fldTime"))
					m.Put("FldSignatureBitmapString",Row.Get("FldSignatureBitmapString"))
					m.Put("FldSync","True")
					m.Put("WIsBacked","False")
					m.Put("FldType","Foroosh")
					m.Put("FldAmani",Row.Get("FldAmani"))
					m.Put("fldShomareForoosh",Row.Get("fldShomareForoosh"))
					m.Put("WSendFrom",3)
					lst.Add(m)
			#end region ---------------------

				End If
			
			Else if CountRow>0 Then
			
				'delete Row
				MCode.SaveUpdate("Delete From TblFaktor where FldShomareFaktor="& Row.Get("fldShomareFactor"))
			
				'insert
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
					m.Put("fldFeeBadAzTakhfif",Row.Get("fldMablaghTakhfif"))
					m.Put("FldMablaghTakhfif",Row.Get("fldMablaghTakhfif"))
					m.Put("FldTedadDarSabadJoz",Row.Get("fldTedadJoz"))
					m.Put("FldTedadDarSabadKol",Row.Get("fldTedadCarton"))
					m.Put("FldTedadDarkarton",Row.Get("FldTedadDarKarton"))
					m.Put("FldTotalFaktor",Row.Get("FldTotalFaktor"))
					m.Put("FldTozihat",Row.Get("fldTozihatRecord"))
					m.Put("FldTozih",Row.Get("FldTozihat"))
					m.Put("FldVaziatPardakht",Row.Get("fldNahveTasvie"))
					m.Put("FldMablaghTakhfifKol",Row.Get("FldMablaghTakhfifKol"))
					m.Put("FldSumMablaghTakhfifVizhe",Row.Get("FldSumMablaghTakhfifVizhe"))
					m.Put("FldSumMablaghTakhfifKala",Row.Get("FldSumMablaghTakhfifKala"))
					m.Put("FldMablaghKol",Row.Get("FldTotalFaktor"))
					m.Put("FldDate",Row.Get("fldDate"))
					m.Put("FldTime",Row.Get("fldTime"))
					m.Put("FldSignatureBitmapString",Row.Get("FldSignatureBitmapString"))
					m.Put("FldSync","True")
					m.Put("WIsBacked","False")
					m.Put("FldType","Foroosh")
					m.Put("FldAmani",Row.Get("FldAmani"))
					m.Put("fldShomareForoosh",Row.Get("fldShomareForoosh"))
					m.Put("WSendFrom",3)
					lst.Add(m)
			#end region ---------------------

				End If
		
			End If
		Next
	
		DBUtils.InsertMaps(MCode.Sql1,"TblFaktor",lst)		
		Log("لیست سفارشات بروزرسانی گردید")
	Catch
		Log(LastException)
		myCode.SendError(LastException,"FirebaseMessaging-LoadGetTasvieFast")
	End Try
End Sub

Sub JobDone (Job As HttpJob)
	Job.GetRequest.Timeout=50000
	If Job.Success Then
	
		Try
			Dim Str As String = Job.GetString
			Log("JobName: "&Job.JobName & " ,str="&Str)
			Select Case Job.JobName
				Case "GetSetting"
					If Str = "No Result" Then
						'ToastMessageShow("شما مجاز به استفاده از نرم افزار نمی باشد",True)
						ProgressDialogHide
					Else
						LoadGetSetting(Str)
						'GetGoroohAshkhas
						'SendToken(MCode.TokenPush)
					End If
					MCode.downloadingData=False
				Case "SaveToken"
					If Str = "No Result" Then
						Log("خطا در ارسال توکین")
					Else
						Log("توکین با موفقیت ارسال گردید")
					End If
	
				Case "GetCurrentDate"
					Dim StrCurrentDate As String = Job.GetString
					'StrError=StrCurrentDate
					If StrCurrentDate <> "No Result" Then
						datenow=StrCurrentDate
					
						If datenow.Length = 24 Then
							datenow=datenow.SubString2(0,23)
						End If
						
						Log("datenow: "&datenow)
						
						MCode.SaveUpdate("Update TblSetting Set FldDateUpdate='"&datenow&"'")
					End If
				Case "GetKala"
					If Str = "No Result" Then
					
						'ToastMessageShow("کالا موجود نمی باشد",True)
					Else
			
						LoadGetKalaFast(Str)
					End If
					Log("kala update")
					MCode.downloadingData=False
					If CodeTafzili1>0 And CodeKala1>0 Then
						StatusCodeKala1="OK"						
						GetAshkhas("GetSingleAshkhas")					
					End If
'					Select MCode.page
'						Case "KalaDefault"
'							
'							CallSubDelayed(Act_KalaDefault,"LoadKala")
'						Case "Kala_listi"
'							CallSubDelayed(Act_Kala_listi,"LoadKala")
'						Case "SabtMarjooii"
'							CallSubDelayed(Act_KalaDefault,"LoadKala")
'						Case "Search"
'							CallSubDelayed(Act_Search,"LoadKala")
'					End Select
					'GetFee
				'	mode="GetFee"
				'	LoadData
				Case "GetKalaAll"
					If Str = "No Result" Then
						'MCode.SaveUpdate("Delete From TblKala")
						'ToastMessageShow("کالا موجود نمی باشد",True)
						ProgressDialogHide
					Else
						LoadGetKala(Str)
					End If
					'GetFee
				Case "GetUpdateFee"
					If Str = "No Result" Then
						'MCode.SaveUpdate("Delete From TblKala")
						ProgressDialogHide
					Else
						LoadGetUpdateFee(Str)
					End If
					'GetFee
					Select MCode.page
						Case "KalaDefault"
							
							CallSubDelayed(Act_KalaDefault,"LoadKala")
						Case "Kala_listi"
							CallSubDelayed(Act_Kala_listi,"LoadKala")
						Case "SabtMarjooii"
							CallSubDelayed(Act_KalaDefault,"LoadKala")
						Case "Search"
							CallSubDelayed(Act_Search,"LoadKala")
					End Select
				Case "GetGoroohKala"
					If Str = "No Result" Then
					
						'ToastMessageShow("گروه کالا موجود نمی باشد",True)
					Else
			
						LoadGetGoroohKalaFast(Str)
					End If
					Log("GetGoroohKala update")
					MCode.downloadingData=False
					'GetKala("GetKala")
				Case "GetGoroohKalaAll"
					If Str = "No Result" Then
						'MCode.SaveUpdate("Delete From TblGoroohKala")
						'ToastMessageShow("گروه کالا موجود نمی باشد",True)
						ProgressDialogHide
					Else
						LoadGetGoroohKala(Str)
					End If
					'GetFee
					
				Case "GetAshkhas"
					If Str = "No Result" Then
						'ToastMessageShow("شخصی موجود نمی باشد",True)
					
					Else
						LoadGetAshkhasFast(Str)
										
					End If
					Log("GetAshkhas update")
					MCode.downloadingData=False
'					Select MCode.page
'						Case "Act_Moshtarian"
'							CallSubDelayed(Act_Moshtarian,"LoadAshkhas")
'						Case "Act_SelectMantage"
'							CallSubDelayed(Act_SelectMantage,"LoadAshkhas")
'					
'					End Select
'					GetSooratHesab("GetSooratHesab")
				Case "GetGalleryKala"
					If Str = "No Result" Then
						'MCode.SaveUpdate("Delete From tblGalleryPic")
						'ToastMessageShow("گالری تصاویر موجود نمی باشد",True)
						ProgressDialogHide
					Else
						LoadGetGalleryKalaFast(Str)
					End If
					'Log("GetTasvie update")
'					mode="GetGoroohKala"
					'GetGoroohKala("GetGoroohKala")
'					LoadData
					MCode.downloadingData=False
				Case "GetAshkhasAll"
					If Str = "No Result" Then
						'MCode.SaveUpdate("Delete From TblAshkhas")
						'ToastMessageShow("شخصی موجود نمی باشد",True)
						ProgressDialogHide
					Else
						LoadGetAshkhas(Str)
					End If
				
				Case "GetVaziat"
					If Str = "No Result" Then
						'ToastMessageShow("خطا در اتصال",True)
						ProgressDialogHide
					Else
'						LoadGetVaziat(Str)
					End If
					'GetFee
				Case "GetGoroohAshkhas"
					If Str = "No Result" Then
						'ToastMessageShow("گروه اشخاص موجود نمی باشد",True)
					
					Else
						LoadGetGoroohAshkhasFast(Str)
										
					End If
					Log("GetGoroohAshkhas update")
'					GetAshkhas("GetAshkhas")
					MCode.downloadingData=False
				Case "GetGoroohAshkhasAll"
					If Str = "No Result" Then
						'MCode.SaveUpdate("Delete From TblGoroohAshkhas")
						'ToastMessageShow("گروه اشخاص موجود نمی باشد",True)
						ProgressDialogHide
					Else
						LoadGetGoroohAshkhas(Str)
					End If
					'GetFee
					
				Case "GetEshantion"
					If Str = "No Result" Then
						'MCode.SaveUpdate("Delete From tblEshantionVisitori")
						'ToastMessageShow("اشانتیون موجود نمی باشد",True)
						ProgressDialogHide
					Else
						LoadGetEshantionFast(Str)
					End If					
					'GetTasvie
					MCode.downloadingData=False
				Case "GetFee"
					If Str = "No Result" Then
						'MCode.SaveUpdate("Delete From TblFee")
						'ToastMessageShow("لیست چند قیمت موجود نمی باشد",True)
						'ProgressDialogHide
					Else
						LoadGetFee(Str)
					End If
					MCode.downloadingData=False
					'Log("GetFee update")
					'mode="GetTasvie"
					'LoadData
					'GetEshantion
					'	GetGalleryKala("GetGalleryKala")
				Case "GetHavale"
					If Str = "No Result" Then
						'MCode.SaveUpdate("Delete From tblGalleryPic")
						'ToastMessageShow("گالری تصاویر موجود نمی باشد",True)
						ProgressDialogHide
					Else
						If MCode.GetHavaleFlag=0 Then
							LoadGetGetHavale(Str)
						Else
							LoadGetGetHavaleFast(Str)
						End If
					End If					
				Case "GetHavaleByUser"
					If Str = "No Result" Then
						'MCode.SaveUpdate("Delete From tblGalleryPic")
						'ToastMessageShow("گالری تصاویر موجود نمی باشد",True)
						ProgressDialogHide
					Else					
						LoadGetGetHavaleFast(Str)
					End If
					ShowRizeFactorForooshByHavale
				Case "ShowRizFactorForooshByHavale"
					If Str = "No Result" Then
						'MCode.SaveUpdate("Delete From TblSooratHesab")
						'ToastMessageShow("گزارش سفارش ویزیتور موجود نمی باشد",True)
					Else
						LoadShowRizeFactorForooshByHavale(Str)					
					End If
					If MCode.page="Act_RizeFactorHavale" Then
						CallSubDelayed(Act_RizeFactorHavale,"CreatePge")
					End If
					If MCode.page="Act_HavaleTozie" Then
						CallSubDelayed(Act_HavaleTozie,"LoadFilter")
					End If				
'					LoadData
				Case "GetTasvie"
					If Str = "No Result" Then
						'MCode.SaveUpdate("Delete From TblTasvie")
						'ToastMessageShow("لیست تسویه موجود نمی باشد",True)
						'ProgressDialogHide
'						MCode.SaveUpdate("Insert Into TblTasvie (FldCode,FldName) Values ('"& _
'		 				"1000" &"','"& "نقدی" &"')")
					Else
						LoadGetTasvieFast(Str)
					End If
					If MCode.downloadingData=False Then
						Select MCode.page
							Case "KalaDefault"
								StartActivity(Act_KalaDefault)
							Case "Kala_listi"
								StartActivity(Act_Kala_listi)
							Case "SabtMarjooii"
								StartActivity(Act_KalaDefault)
							Case "Search"
								StartActivity(Act_Search)
						End Select
					Else
						MCode.downloadingData=False
					End If
				
				
					MCode.page=""
					
					'StopService(Me)
				Case "GetReportRizePishFactor3"
					If Str = "No Result" Then
						'MCode.SaveUpdate("Delete From tblEshantionVisitori")
						ToastMessageShow("سفارش موجود نمی باشد",True)
						'ProgressDialogHide
						'ToastMessageShow("عملیات دریافت اطلاعات با موفقیت تکمیل شد",True)
					Else
						LoadGetReportRizePishFactor3Fast(Str)
					End If
					
				Case "GetListDeleted"
					Dim StrListDeleted As String = Job.GetString
					'StrError=StrListDeleted
					If StrListDeleted = "No Result" Then
						'MCode.SaveUpdate("Delete From TblGoroohAshkhas")
						Select TypeDelete
							Case "kala"
								Log("لیست حذف کالا خالی است")
							Case "ashkhas"
								Log("لیست حذف اشخاص خالی است")
							Case "GroupKala"
								Log("لیست حذف گروه کالا خالی است")
							Case "GalleryPic"
								Log("لیست حذف گالری تصاویر خالی است")
							Case "GroupAshkhas"
								Log("لیست حذف گروه اشخاص خالی است")
							Case "deleteall"
								Log("لیست حذف کلی خالی است")
						End Select
						
						'ProgressDialogHide
					Else
						LoadGetListDelete(StrListDeleted)
					End If
				
					Select TypeDelete
						Case "kala"
							TypeDelete="ashkhas"
							GetListDelete("ashkhas")
								
						Case "ashkhas"
							TypeDelete="GroupKala"
							GetListDelete("GroupKala")
						Case "GroupKala"
							TypeDelete="GroupAshkhas"
							GetListDelete("GroupAshkhas")
						
						Case "GetTokenData"
							If Str = "No Result" Then
								'ToastMessageShow("خطا در اتصال",True)
								ProgressDialogHide
							Else
'								LoadGetVaziat(Str)
							End If
							
					
					End Select
			
					
'					StartService(Service_Gps)
					StartService(FusedLocationService)
					Log("Gps Start")
					
			End Select
			
			
		
		Catch
'			StartService(Service_Gps)
			StartService(FusedLocationService)
			Log("Gps Start")
			Log("error: "&Job.JobName)
		Log(LastException)
			myCode.SendError(Job.ErrorMessage,"Service_Server-JobDone: "&Job.JobName)
		End Try
		Else
		myCode.SendError(Job.ErrorMessage,"Service_Server-JobDone: "&Job.JobName)
	End If
End Sub