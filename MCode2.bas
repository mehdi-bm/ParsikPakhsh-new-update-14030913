B4A=true
Group=Class
ModulesStructureVersion=1
Type=StaticCode
Version=9.8
@EndOfDesignText@

Sub Process_Globals
	Dim Access As Boolean=False
	Dim UserName As String =""
	Dim fldMobile As String =""
	Dim PassWord As String =""
	Dim AppName As String =""
	Dim IconLink As String =""
	Dim UpdateLink As String =""
	Dim UpdateMSG As String =""
	Dim expireDate As String =""
	Dim Version As String ="7.0.6"
	Dim Code As String = 9000015
	Dim Plan As String = 4
	Dim ApiKey As String="912cd657*8095*4fab*bc8a*737fca"
'	Dim ApiKey As String="14a55a5a*c620*4c58*adb9*b46189"
'	Dim ApiKey As String="11eabb3d*4da5*44e1*8faa*f7a972"
'	Dim ApiKey As String="348eb5a6*056f*43a1*abd8*1c132c"
	Dim Url1 As String="192.168.2.25:1237"  'ds.webcom-order.ir
	Dim Url2 As String="192.168.2.25:1237"
	Dim MenuTitle1 As String="پخش وکیلی"
	Dim MenuTitle2 As String=""
	Dim MenuTitle3 As String="V: " & Application.VersionCode
	Dim isFloat As Boolean
	Dim HaveShift As Boolean
	Dim P As PhoneId
	Dim PImei As Phone
'	Dim fm As FirebaseMessaging
	Dim Sql1 As SQL
	Dim Json As JSONParser

	Dim Rs As RichString
	Dim PersianDate As PersianDate
	Dim Sf As StringFunctions
	Dim Su As StringUtils
	Dim pw As PhoneWakeState
'	Dim Barcode As String
	'------------------------------------------
	Dim Url As String
	Dim Font1 = Typeface.LoadFromAssets("p_font.ttf") As Typeface
	Dim Font3 = Typeface.LoadFromAssets("iransansmonospacednum_light.ttf") As Typeface
'	Dim Divider = LoadBitmap(File.DirAssets,"divider.png") As Bitmap
	Dim ImgNothing = LoadBitmap(File.DirAssets,"nothing2.png") As Bitmap
	Dim ImgNothingLink = "http://webcomco-customer.ir/IMGApp/pic03.png" As String
'	Dim ImgLogo = LoadBitmap(File.DirAssets,"webcom logo1.png") As Bitmap
	Dim FtpURL As String		="ftptest.mywebcom3.ir"
	Dim FtpUserName	As String	="testp3"
	Dim FtpPW As String			="!M6hy31v"
	
	Dim C_Visitor,N_Visitor As String
	'Type AdapterListAshkhas (FldC_Ashkhas As String,FldN_Ashkhas As String,verifyCode As String,FldAddress As String,FldTell As String,FldMob As String,FldC_City As String,FldN_City As String,FldLastVisit As String,FldLastSefaresh As String,FldVaziat As String,FldEtebar As String,FldMandeHesab As String,FldTakhfifVizhe As String,fldC_Ashkhas_C As String,lastSeen As String,lastOrderDate As String)
	'Type AdapterListKala(FldC_Kala,FldC_S_GroohKala,Esh_N_Kala,Esh_C_Kala,endBuyPrice As String,FldN_Kala As String,FldACode_C As String,FldN_Vahed_Kol As String,FldN_Vahed As String,FldFee As String,FldFeeBadAzTakhfif As String,FldTipFee3 As String,FldTipFee4 As String,FldTipFee5 As String,FldTipFee6 As String,FldTipFee7 As String,FldTipFee8 As String,FldTipFee9 As String,FldTipFee10 As String,FldTozihat As String,FldLink As String,FldTedadJoz As Float,FldTedadkol As Int,FldMande As Float,FldTedadKarton As String,TozihatKala As String,eshan As String,takhfif1 As String,takhfif2 As String,takhfif3 As String,takhfif4 As String,takhfif5 As String,FldEshantion As String , _
	TakhfifRiali As Int)
	
'	Type AdapterList_Faktors(FldShomareFaktor,FldTakhfifKala,FldTakhfifRiali,FldTakhfifVizhe,FldTotalFaktor, _
'		FldTozihFaktor,FldC_Tasvie,FldLat,FldLon,FldDate,FldTime,FldSignatureBitmapString,FldC_Kala As String, _
'		FldN_Kala As String,FldACode_C As String,FldN_Vahed_Kol As String,FldN_Vahed As String,FldFee As String, _
'		FldFeeBadAzTakhfif As String,FldTipFee3 As String,FldTipFee4 As String,FldTipFee5 As String,FldTipFee6 As String, _
'		FldTipFee7 As String,FldTipFee8 As String,FldTipFee9 As String,FldTipFee10 As String,FldTozihat As String, _
'		FldLink As String,FldTedadJoz As Int,FldTedadkol As Int,FldMande As Int,FldTedadKarton As Int,TozihatKala As String, _
'		Eshan1 As String,Eshan2 As String,Eshan3 As String,Eshan4 As String,Eshan5 As String,Esh_C_Kala As String, _
'		FldEshantion,FldC_Visitor,FldC_Ashkhas As String)
	
	Type AdapterListGroohKala(FldId,FldC_M_GroohKala,FldC_S_GroohKala,FldN_S_GroohKala,link As String,fldRate As Int)
	Type AdapterListMoeen(id,FldC_Ashkhas,Bed,Bes,Comment,Date As String,IsIn As Long)
	Type AdapterListFaktor(C_Name,fldShomareFaktor,fldTotalFaktor,fldDate,fldTime,fldTozihFaktor,fldVaziat,fldC_Tasvie,fldC_Ashkhas,FldTakhfifKala,FldTakhfifRiali,FldTakhfifVizhe,Signature,FldName As String,wIsBacked,synced As Boolean)
	Type AdapterListNoeTasvie(FldC_Tasvie As String,FldN_Tasvie As String)
	Type AdapterListTicket(FldCode As String,FldOnvan As String,FldOlaviat As String,FldTozihat As String,FldDate As String,FldTime As String,FldVaziat As String,FldAnswer As String)
	Type AdapterListNotif(FldId As String,FldTitle As String,FldBody As String,FldDate As String,FldTime As String)
	Type AdapterListSabt(FldShomareSabt As String,FldC_Ashkhas As String,FldType As String,FldNoe As String,FldMablagh As String,FldShomareCheck As String,FldDateCheck As String,FldBankName As String,FldDateSabt,TozihateFaktor As String)
	Type AdapterListCity(cityCode As String,name As String,parent As String)
	Type FinalFaktor_(SoodVisitor,MandeHesab,date,shfaktor,Customername,Mantaghe,Address,Tel,TasvieType,KhamFaktor,TakhfifKala,TakhfifRiali,TakhfifVizhe,GablePardakht As String)
	Type AdapterReportVisitor(articleName,tedadTaki,tedadKarton,tedadKol,visitorPorsant,total,orderId,totalOrderCount,fldC_Kala As String,amount As Long)
	Dim FinalFaktor As FinalFaktor_
	Dim ListTicket As List ' برای لود کردن تیکت ها
	Dim ListNotif As List
	Dim CodeMoshtari=0,NameMoshtari,verifyCode As String
	Dim VahedPool As String="ریال"
	Dim ForooshBishAzMojoodi As String = 0
	Dim fldNewMoshtari As String = 0
	Dim SaghfForoosh As String =0
	Dim DarsadSood As String=0
	Dim DarsadTakhfifRiali As String=0
	Dim KharidBiashAz As String=0
	Dim ShowMande As String=0
	Dim EtelaResani As String=0
	Dim Signature As String=0
	Dim ZamanTahvil As String=0
	Dim ShowBedehkaran As String=0
	Dim Marjooii As String=0
	Dim VoroodTozihKala As String=0
	Dim DoVahedi As String=0
	Dim SabtGpsShakhs As String=0
	Dim ShowGpsShakhs As String=0
	Dim AutoRecive As String=0
	Dim TimeRecive As String=0
'	Dim AutoSend As String
'	Dim TimeSend As String
	Dim DateTimeSend As String=0
	Dim DateTimeRecive As String=0
	Dim Action As String=0
	Dim FaktorSelect As String=0
	Dim ShomareSabt As String=0
	Dim Gps As String=0
	Dim NoeErsal As String=0
	Dim TellForooshgah,AddressForooshgah As String
	Dim DarsadTakhfifVizhe As Int = 0
	Dim Imei As String=0
	Dim page As String = ""
End Sub

Sub Initilize
	Sf.Initialize
	If Not(File.Exists(File.DirInternal,"Zomorod")) Then
		File.MakeDir(File.DirInternal,"Zomorod")
		File.Copy(File.DirAssets,"zomorod_db.db",File.DirInternal &"/Zomorod","zomorod_db.db")
	Else if File.Exists(File.DirInternal, "Zomorod") = True Then
		If Not(File.Exists(File.DirInternal & "/Zomorod", "zomorod_db.db")) Then
			File.Copy(File.DirAssets,"zomorod_db.db",File.DirInternal &"/Zomorod","zomorod_db.db")
		End If
	End If
		
	If Not(File.Exists(File.DirInternal &"/Zomorod", "AksKala")) Then
		File.MakeDir(File.DirInternal &"/Zomorod","AksKala")
	End If
	If Not(File.Exists(File.DirInternal &"/Zomorod", "pdf")) Then
		File.MakeDir(File.DirInternal &"/Zomorod","pdf")
	End If

	If Not(File.Exists(File.DirInternal & "/Zomorod","Report")) Then
		File.MakeDir(File.DirInternal & "/Zomorod","Report")
	End If
	If Not(File.Exists(File.DirInternal & "/Zomorod","Receipt")) Then
		File.MakeDir(File.DirInternal & "/Zomorod","Receipt")
	End If
	If Not(File.Exists(File.DirInternal & "/Zomorod","Profile")) Then
		File.MakeDir(File.DirInternal & "/Zomorod","Profile")
	End If
	If Not(File.Exists(File.DirInternal & "/Zomorod","Signature")) Then
		File.MakeDir(File.DirInternal & "/Zomorod","Signature")
	End If
	If Not(File.Exists(File.DirInternal & "/Zomorod","Atach")) Then
		File.MakeDir(File.DirInternal & "/Zomorod","Atach")
	End If
	Sql1.Initialize(File.DirInternal &"/Zomorod","zomorod_db.db",False)
	UpdateDataBase
'	fm.Initialize("fm")
	
	ListTicket.Initialize
	ListNotif.Initialize
	
	Dim Cu As Cursor = Result("Select * From TblSetting")
	Cu.Position=0
	If Cu.GetString("FldVersion")<Version Then
		'' update setting
		SaveUpdate("update TblSetting Set FldVersion='"& Version &"'")
	End If
	
	ServiceGpsActive = Cu.GetString("FldGps")
	RaghamAshar = Cu.GetString("FldRound")
	VahedPool = Cu.GetString("FldVahedPool")
	NoeDate = Cu.GetString("FldNoeDate")
	C_Visitor = Cu.GetString("FldC_Visitor")
	N_Visitor = Cu.GetString("FldN_Visitor")
	Url = Cu.GetString("FldUrl")
	kalamanfi = Cu.GetString("FldKalaManfi")
	TaghirFeeKala = Cu.GetString("FldTaghirFeeKala")
	NamayeshKalaSefr = Cu.GetString("FldNamayeshKalaSefr")
	
	CodeMoshtari=Cu.GetString("FldCodeMoshtari")
	ImageUrl="http://rayansanatsoft.ir/download/temp/"& CodeMoshtari &"/"
	
	Log(Cu.GetString("FldSaveFactorInLocation"))
	If Cu.GetString("FldSaveFactorInLocation")="0" Then
		SaveFactorInLocation=False
	Else
		SaveFactorInLocation=True
	End If
	Log(Cu.GetString("FldMasafat"))
		'Masafat=Cu.GetString("FldMasafat")
	PrinterType=Cu.GetString("FldPrinterType")
	Vaziat=Cu.GetString("FldVaziat")
	
End Sub

Sub UpdateDataBase
	Dim Check As Int
	Dim Cur As Cursor
	Cur = Sql1.ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='TblAshkhasNew'")
	If Cur.RowCount = 0 Then
		Sql1.ExecNonQuery("Create Table TblAshkhasNew (FldId integer NOT NULL PRIMARY KEY,FldCodeTafzili Text,FldSharheTafzili Text,FldVisitor Text,FldTell Text,FldAddress Text)")
		Sql1.Close
		Initialize
	End If
	
	Cur = Sql1.ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='TblGoroohKala'")
	If Cur.RowCount = 0 Then
		Sql1.ExecNonQuery("Create Table TblGoroohKala (FldC_Gorooh Text,FldN_Gorooh Text)")
		Sql1.Close
		Initialize
	End If
	
	Cur = Sql1.ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='TblGoroohAshkhas'")
	If Cur.RowCount = 0 Then
		Sql1.ExecNonQuery("Create Table TblGoroohAshkhas (FldC_Gorooh Text,FldN_Gorooh Text)")
		Sql1.Close
		Initialize
	End If
	
	Cur = Sql1.ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='TblSooratHesab'")
	If Cur.RowCount = 0 Then
		Sql1.ExecNonQuery("Create Table TblSooratHesab (FldId integer NOT NULL PRIMARY KEY,FldCodeTafzili Text,FldSharheTafzili Text,FldShomareFactor Text,FldMandeTalab Text,FldMablagheKolDaryafti Text,FldMandeTasfieNashode Text,FldDateSarResid Text)")
		Sql1.Close
		Initialize
	End If
	
	Cur = Sql1.ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='TblNotifi'")
	If Cur.RowCount = 0 Then
		Sql1.ExecNonQuery("Create Table TblNotifi (FldId integer NOT NULL PRIMARY KEY,Id INTEGER,FldTitle Text,FldBody Text,FldDate Text,FldTime Text,FldStatus Text)")
		Sql1.Close
		Initialize
	End If
	
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblKala")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="fldMablaghMasrafKonande" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblKala ADD fldMablaghMasrafKonande Text")
'		Sql1.Close
'		Initialize
'	End If
	
	Check=0
	Cur=Sql1.ExecQuery("Select * From TblSetting")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldAshkhas" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		Sql1.ExecNonQuery("Alter Table TblSetting ADD FldAshkhas Text")
		Sql1.ExecNonQuery("Alter Table TblSetting ADD FldKala Text")
		Sql1.ExecNonQuery("Alter Table TblSetting ADD FldFee Text")
		Sql1.ExecNonQuery("Alter Table TblSetting ADD FldTasvie Text")
		Sql1.ExecNonQuery("Alter Table TblSetting ADD FldIntervalDownload Text")
		Sql1.Close
		Initialize
		Sql1.ExecNonQuery("Update TblSetting Set FldAshkhas = '0', FldKala = '0', FldFee = '0', FldTasvie = '0', FldIntervalDownload = '0',FldDateUpdate='0'")
	End If
	Check=0
	Cur=Sql1.ExecQuery("Select * From TblSetting")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldDateUpdate" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		Sql1.ExecNonQuery("Alter Table TblSetting ADD FldDateUpdate Text")
		Sql1.Close
		Initialize
	End If
	Check=0
	Cur=Sql1.ExecQuery("Select * From TblSetting")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldToken" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		Sql1.ExecNonQuery("Alter Table TblSetting ADD FldToken Text")
		Sql1.Close
		Initialize
	End If
	Check=0
	Cur=Sql1.ExecQuery("Select * From TblSetting")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldSendFactor" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		Sql1.ExecNonQuery("Alter Table TblSetting ADD FldSendFactor Text")
		Sql1.Close
		Initialize
		Sql1.ExecNonQuery("Update TblSetting Set FldDateUpdate='0',FldSendFactor='1'")
	End If
	Check=0
	Cur=Sql1.ExecQuery("Select * From TblSetting")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldSaveFactorInLocation" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		Sql1.ExecNonQuery("Alter Table TblSetting ADD FldSaveFactorInLocation Text")
		Sql1.Close
		Initialize
		Sql1.ExecNonQuery("Update TblSetting Set FldSaveFactorInLocation='0'")
	End If
	Check=0
	Cur=Sql1.ExecQuery("Select * From TblSetting")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldMasafat" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		Sql1.ExecNonQuery("Alter Table TblSetting ADD FldMasafat Text")
		Sql1.Close
		Initialize
		Sql1.ExecNonQuery("Update TblSetting Set FldMasafat='50'")
	End If
	
	Check=0
	Cur=Sql1.ExecQuery("Select * From TblSetting")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldTaghirFeeKala" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		Sql1.ExecNonQuery("Alter Table TblSetting ADD FldKalaManfi Text")
		Sql1.ExecNonQuery("Alter Table TblSetting ADD FldTaghirFeeKala Text")
		Sql1.Close
		Initialize
		Sql1.ExecNonQuery("Update TblSetting Set FldKalaManfi = '0', FldTaghirFeeKala='0'")
	End If
	
	Check=0
	Cur=Sql1.ExecQuery("Select * From TblSetting")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldTokenId" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		Sql1.ExecNonQuery("Alter Table TblSetting ADD FldTokenId Text")
		Sql1.Close
		Initialize
	End If
	
	Check=0
	Cur=Sql1.ExecQuery("Select * From TblSetting")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldCodeMoshtari" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		Sql1.ExecNonQuery("Alter Table TblSetting ADD FldCodeMoshtari Text")
		Sql1.Close
		Initialize
	End If
	
	Check=0
	Cur=Sql1.ExecQuery("Select * From TblSetting")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldNameVisitor" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		Sql1.ExecNonQuery("Alter Table TblSetting ADD FldNameVisitor Text")
		Sql1.Close
		Initialize
	End If
	
	Check=0
	Cur=Sql1.ExecQuery("Select * From TblSetting")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldVaziat" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		Sql1.ExecNonQuery("Alter Table TblSetting ADD FldVaziat Integer")
		Sql1.Close
		Initialize
		Sql1.ExecNonQuery("Update TblSetting Set FldVaziat='0'")
	End If
	Check=0
	Cur=Sql1.ExecQuery("Select * From TblFaktor")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldTozih" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		Sql1.ExecNonQuery("Alter Table TblFaktor ADD FldTozih Text")
		Sql1.Close
		Initialize
	End If
	
	Check=0
	Cur=Sql1.ExecQuery("Select * From TblFaktor")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldVaziatPardakhti" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		Sql1.ExecNonQuery("Alter Table TblFaktor ADD FldVaziatPardakhti varchar")
		Sql1.Close
		Initialize
	End If
	
	Check=0
	Cur=Sql1.ExecQuery("Select * From TblFaktor")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldTozihat" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		Sql1.ExecNonQuery("Alter Table TblFaktor ADD FldTozihat varchar")
		Sql1.Close
		Initialize
	End If
	
	Check=0
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldMablaghMasrafKonande" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		Sql1.ExecNonQuery("Alter Table TblFaktor ADD FldMablaghMasrafKonande Text")
		Sql1.Close
		Initialize
	End If
	
	
	Check=0
	Cur=Sql1.ExecQuery("Select * From TblSetting")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldVersion" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		Sql1.ExecNonQuery("Alter Table TblSetting ADD FldVersion Text")
		Sql1.Close
		Initialize
	End If

	Dim ver As String
	Dim Cu As Cursor = Result("Select * From TblSetting")
	Cu.Position=0
	If OriginalListFaktor.IsInitialized=False Then
		OriginalListFaktor.Initialize
		OriginalListFaktor.Clear
	End If
	ver=Cu.GetString("FldVersion")
	If ver<> Null Then
	If ver<Version Then
			StopService(Service_Gps)
			
			Log("Gps Stop")
	
		'' update setting
		'SaveUpdate("update TblSetting Set FldVersion='"& Version &"'")
		Dim cn As Cursor= Result("select * from TblFaktor")
		If cn.RowCount>0 Then
			''save factors to temp
				For i=0 To cn.RowCount-1
				cn.Position=i			
				Dim Item As AdapterFaktor
					Item.FldId=cn.GetInt("FldId")
					Item.FldRadif=cn.GetString("FldRadif")
					Item.FldShomareFaktor=cn.GetInt("FldShomareFaktor")
					Item.FldVaziatPardakht=cn.GetString("FldVaziatPardakht")
					Item.FldC_Tafzili=cn.GetString("FldC_Tafzili")
					Item.FldN_Tafzili=cn.GetString("FldN_Tafzili")
					Item.FldCodeKala=cn.GetString("FldCodeKala")
					Item.FldNameKala=cn.GetString("FldNamekala")
					Item.FldFeeForoosh=cn.GetString("FldFeeForoosh")
					Item.FldTedadDarKarton=cn.GetString("FldTedadDarKarton")
					Item.FldTedadDarSabadJoz=cn.GetString("FldTedadDarSabadJoz")
					Item.FldTedadDarSabadKol=cn.GetString("FldTedadDarSabadKol")
					Item.FldTarikh=cn.GetString("FldTarikh")
					Item.FldLat=cn.GetString("FldLat")
					Item.FldLon=cn.GetString("FldLon")
					Item.FldSend=cn.GetInt("FldSend")
					Item.FldVaziatPardakhti=cn.GetString("FldVaziatPardakhti")
					Item.FldTozihat=cn.GetString("FldTozihat")
					Item.FldMablaghMasrafKonande=cn.GetString("FldMablaghMasrafKonande")
					OriginalListFaktor.Add(Item)
				Next
		End If
		''delete database files
		File.Delete(File.DirRootExternal & "/Zomorod", "zomorod_db.db")
		Initialize
		UpdateDataBase
	End If
	Else
		If OriginalListFaktor.Size >0 Then
			For i=0 To OriginalListFaktor.Size-1
				Dim Item = OriginalListFaktor.Get(i) As AdapterFaktor
				SaveUpdate("Insert into TblFaktor(FldId,FldRadif,FldShomareFaktor,FldVaziatPardakht,FldC_Tafzili,FldN_Tafzili,FldCodeKala,FldNamekala,FldFeeForoosh,FldTedadDarKarton,"& _ 
				"FldTedadDarSabadJoz,FldTedadDarSabadKol,FldTarikh,FldLat,FldLon,FldSend,FldVaziatPardakhti,FldTozihat,FldMablaghMasrafKonande) Values("& _
				Item.FldId &",'"& Item.FldRadif &"',"& Item.FldShomareFaktor &",'"& Item.FldVaziatPardakht &"','"& Item.FldC_Tafzili &"','"& Item.FldN_Tafzili &"','"& Item.FldCodeKala &"','"& Item.FldNameKala &"','"& Item.FldFeeForoosh &"','"& Item.FldTedadDarKarton &"','"& _
			    Item.FldTedadDarSabadJoz &"','"& Item.FldTedadDarSabadKol &"','"& Item.FldTarikh &"','"& Item.FldLat &"','"& Item.FldLon &"',"& Item.FldSend &",'"& Item.FldVaziatPardakhti &"','"& Item.FldTozihat &"','"& Item.FldMablaghMasrafKonande &"')")
			Next
			
		End If
		Sql1.ExecNonQuery("Update TblSetting Set FldVersion = '"& Version &"'")
	End If
	StartService(Service_Gps)
	Log("Gps Start")
	
	Check=0
	Cur=Sql1.ExecQuery("Select * From TblSetting")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldNamayeshKalaSefr" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		Sql1.ExecNonQuery("Alter Table TblSetting ADD FldNamayeshKalaSefr Text")
		Sql1.Close
		Initialize
		Sql1.ExecNonQuery("Update TblSetting Set FldNamayeshKalaSefr = '1'")
	End If
	
	Check=0
	Cur=Sql1.ExecQuery("Select * From TblSetting")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldPrinterType" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		Sql1.ExecNonQuery("Alter Table TblSetting ADD FldPrinterType Integer")
		Sql1.Close
		Initialize
		Sql1.ExecNonQuery("Update TblSetting Set FldPrinterType = 0")
	End If
	
	
	Check=0
	Cur=Sql1.ExecQuery("Select * From TblSabad")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldTozihat" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		Sql1.ExecNonQuery("Alter Table TblSabad ADD FldTozihat varchar")
		Sql1.Close
		Initialize
	End If
	
	Check=0
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldMablaghMasrafKonande" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		Sql1.ExecNonQuery("Alter Table TblSabad ADD FldMablaghMasrafKonande Text")
		Sql1.Close
		Initialize
	End If
	Check=0
	Cur=Sql1.ExecQuery("Select * From TblGpsVisitor")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldVaziat" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		Sql1.ExecNonQuery("Alter Table TblGpsVisitor ADD FldVaziat Text")
		Sql1.Close
		Initialize
	End If
	
	Check=0
	Cur=Sql1.ExecQuery("Select * From TblKala")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="fldCodeGroup" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		Sql1.ExecNonQuery("Alter Table TblKala ADD fldCodeGroup Text")
		Sql1.Close
		Initialize
	End If
	Check=0
	Cur=Sql1.ExecQuery("Select * From TblKala")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="fldPathPic" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		Sql1.ExecNonQuery("Alter Table TblKala ADD fldPathPic Text")
		Sql1.Close
		Initialize
	End If

	

	
	SaveUpdate("Update TblSetting Set FldUrl = 'zomorodonline.ir'")
	Initialize
End Sub

'Sub DateNew As String
'	'ثبت آخرین بازدید مشتری=====================================
'	DateTime.DateFormat="yyyy-MM-dd"
'	Dim DateMiladi As String = ConvertNumbersPersian2English(DateTime.Date(DateTime.Now))
'	Dim Time As String = ConvertNumbersPersian2English(DateTime.Time(DateTime.Now))
'	Dim D As String = DateMiladi' & " " & Time
'	Return D
'End Sub

Sub Result(Query As String) As Cursor
	Log(Query)
	Dim Cu As Cursor
	Cu=Sql1.ExecQuery(Query)
	Return Cu
End Sub

Sub SaveUpdate(query As String)
	Try
		Sql1.ExecNonQuery(query)
		Sleep(50)
	Catch
		Log(LastException)
	End Try
	
End Sub

Sub DatePersian As String
	Dim T() As String
	T = Regex.Split("/",PersianDate.getDate(0,0,0,"/"))
	If T(1).Length=1 Then
		T(1)="0"&T(1)
	End If
	If T(2).Length=1 Then
		T(2)="0"&T(2)
	End If
	Return T(0)&T(1)&T(2)
End Sub

Sub AnimationClose(View As Object)
	Dim Ani As Animation
	Ani.InitializeScaleCenter("", 1,1,0,0, View)
	Ani.Duration = 300
	Ani.Start(View)
End Sub

Sub ConvertBlobToString(Dir As String,FileName As String) As String
	If File.Exists(Dir,FileName) = True Then
		Dim InputStream1 As InputStream
		InputStream1 = File.OpenInput(Dir,FileName)
		Dim OutputStream1 As OutputStream
		OutputStream1.InitializeToBytesArray(1000)
		File.Copy2(InputStream1, OutputStream1)
		Dim Buffer() As Byte
		Buffer = OutputStream1.ToBytesArray
		Dim StrBlob As String = Su.EncodeBase64(Buffer)
		File.Delete(Dir,FileName)
	Else
		StrBlob = ""
	End If
	
	Return StrBlob
	
	'write the image to the database
'	MCode.SQL1.ExecNonQuery2("Update TblFaktor Set FldSignatureBitmap = ? Where FldShomareFaktor = '"& ShomareFaktor &"'", Array As Object(Buffer))
	'MCode.SaveUpdate("Update TblFaktor Set FldSignatureBitmapString = '"& StrBlob &"' Where FldShomareFaktor = '"& ShomareFaktor &"'")
	
End Sub

Sub  ConvertNumbersPersian2English(sNumber As String) As String    'تبدیل اعداد فارسی به انگلیسی

	sNumber=sNumber.Replace("۰","0")
	sNumber=sNumber.Replace("۱","1")
	sNumber=sNumber.Replace("۲","2")
	sNumber=sNumber.Replace("۳","3")
	sNumber=sNumber.Replace("۴","4")
	sNumber=sNumber.Replace("۵","5")
	sNumber=sNumber.Replace("۶","6")
	sNumber=sNumber.Replace("۷","7")
	sNumber=sNumber.Replace("۸","8")
	sNumber=sNumber.Replace("۹","9")
	
	Return sNumber
End Sub

Sub CreateBK
	If File.Exists(File.DirRootExternal,"webcom") = False Then
		File.MakeDir(File.DirRootExternal,"webcom")
	End If
	Dim s As String="bk"&DateTime.Date(DateTime.Now)&DateTime.Time(DateTime.Now)
	s=s.Replace(":","")
	s=s.Replace("/","")
	File.Copy(File.DirInternal &"/Webcom","webcom_visitori_db.db",File.DirRootExternal &"/Webcom",s&".db")
	Sleep(200)
End Sub

Public Sub NetworkType
	Dim nt As networkstatus
	ToastMessageShow(nt.haveNetworkType,True)
End Sub

Sub CreateReportFaktor(Faktor As AdapterListFaktor) As ResumableSub
	Dim Tfaktor As FinalFaktor_
	Tfaktor.date=Faktor.fldDate
	Dim NameMoshtari As String = Faktor.C_Name

	Dim Cu1 As Cursor = Result("Select * From TblAshkhas Where FldC_Ashkhas = '"& Faktor.fldC_Ashkhas &"'")
	If Cu1.RowCount>0 Then
		Cu1.Position=0
		Tfaktor.Customername=Cu1.GetString("FldN_Ashkhas")
		Tfaktor.Mantaghe = Cu1.GetString("FldN_City")
		Tfaktor.Address = Cu1.GetString("FldAddress")
		Tfaktor.Tel = Cu1.GetString("FldTell") & " | " & Cu1.GetString("FldMob")
		If IsNumber(Cu1.GetString("FldMandeHesab")) Then
			Tfaktor.MandeHesab = myCode.Is_int( Cu1.GetString("FldMandeHesab"))
		Else
			Tfaktor.MandeHesab = 0
		End If
	Else
		Tfaktor.Customername="مشتری جدید"
		Tfaktor.Mantaghe = ""
		Tfaktor.Address = ""
		Tfaktor.Tel = ""
		Tfaktor.MandeHesab = 0
	End If

	'Top Sheet=========================================================
'	Dim Mablagh As Long
	Dim CuTasview As Cursor = Result("Select * From TblNoeTasvie Where FldC_Tasvie = '"& Faktor.fldC_Tasvie &"'")
	Sleep(0)
	CuTasview.Position=0
	Tfaktor.TasvieType = CuTasview.GetString("FldN_Tasvie")

		Tfaktor.TakhfifRiali = Faktor.FldTakhfifRiali
		Tfaktor.KhamFaktor   = Faktor.fldTotalFaktor + Faktor.FldTakhfifRiali + Faktor.FldTakhfifVizhe + Faktor.FldTakhfifKala
		Tfaktor.TakhfifVizhe   = Faktor.FldTakhfifVizhe
		Tfaktor.TakhfifKala   = Faktor.FldTakhfifKala

	
	Log("تخفیف کالا : " & Tfaktor.TakhfifKala)
	Log("تخفیف ویژه : " & Tfaktor.TakhfifVizhe)


	Tfaktor.GablePardakht = Tfaktor.KhamFaktor - Tfaktor.TakhfifKala - Tfaktor.TakhfifVizhe - Tfaktor.TakhfifRiali
	
	Dim Sood As Long = (Tfaktor.GablePardakht)*(DarsadSood/100)
	Log("سود ویزیتور : " & Sood)
	Tfaktor.SoodVisitor = Sood
	 Return Tfaktor
End Sub

Sub AddToSabad( Item  As AdapterListKala)
	If Item.FldTedadJoz > 0 Or Item.FldTedadKol > 0  Or Item.FldEshantion > 0 Then
		Dim TakhfifVizhe As Long = Item.FldFee*(Item.FldTedadjoz + (Item.FldTedadKol*Item.FldTedadKarton))
		SaveUpdate("Insert Into TblSabad (FldC_kala,FldN_Kala,FldACode_C,FldFee,FldFeeBadAzTakhfif,FldN_Vahed,FldN_Vahed_Kol,FldMande,FldLink,FldTedadJoz,FldTedadKol,FldTedadKarton,FldEshantion,FldTakhfifRiali,FldTakhfifVizhe) Values ('"& _
			 Item.FldC_Kala &"','"& Item.FldN_Kala &"','"& Item.FldACode_C &"','"& Item.FldFee &"','"& Item.FldFeeBadAzTakhfif &"','"& _
			   Item.FldN_Vahed &"','"& Item.FldN_Vahed_Kol &"','"& Item.FldMande &"','"& Item.FldLink &"','"& Item.FldTedadJoz &"','"& Item.FldTedadKol &"','"& _
			    Item.FldTedadKarton &"','"& Item.FldEshantion &"','"& Item.TakhfifRiali &"','"& TakhfifVizhe &"')")
	End If
End Sub

Sub CreateReportSabad(N_tasvie As String)
	Dim Tfaktor As FinalFaktor_
	Dim Cu As Cursor = Result("Select * From TblSabad")
	Cu.Position=0
	If Cu.RowCount=0 Then Return

	Dim RowCount As Int=Cu.RowCount
	Dim Mablagh As Long


	Dim takhfifRialiKol,MablaghKolFaktor As Long = 0
	For i=0 To RowCount -1
		Cu.Position=i
		Mablagh = Cu.GetString("FldFee") * (Cu.GetString("FldTedadJoz")+(Cu.GetString("FldTedadKol")*Cu.GetString("FldTedadKarton")))
		takhfifRialiKol = takhfifRialiKol + Cu.GetString("FldTakhfifRiali")
		MablaghKolFaktor = MablaghKolFaktor + Mablagh
	Next
	Tfaktor.TakhfifRiali = takhfifRialiKol
	Tfaktor.KhamFaktor   = MablaghKolFaktor
	Tfaktor.date=""
	
	Dim Takhfif As String
	Dim Cu2 As Cursor= Result("SELECT Sum((FldFee - FldFeeBadAzTakhfif) * ((FldTedadKol*FldTedadKarton) + FldTedadJoz)) as SumTakhfif FROM TblSabad Where Cast(FldFeeBadAzTakhfif AS Int) > 0 ")
	Cu2.Position = 0
	If Cu2.GetString("SumTakhfif") <> Null Then
		Takhfif = Cu2.GetString("SumTakhfif")
	Else
		Takhfif = 0
	End If
	Tfaktor.TakhfifKala = Takhfif
	Log("تخفیف کالا : " & Takhfif)
	
	Tfaktor.TakhfifVizhe = ((DarsadTakhfifVizhe/100) * (Tfaktor.KhamFaktor - Tfaktor.TakhfifKala ))
	Log("تخفیف ویژه : " & Tfaktor.TakhfifVizhe )
	Log("تخفیف ریالی : " & Tfaktor.TakhfifRiali)
	If N_tasvie="نقد" Then
		Dim cashPayDisscount As Int =myCode.getSetting("data.dat","cashPayDisscount",0)
		Dim naghdi As Long=(cashPayDisscount/100) * (Tfaktor.KhamFaktor - Tfaktor.TakhfifKala )
		Tfaktor.TakhfifRiali = Tfaktor.TakhfifRiali + naghdi
		Log("تخفیف نقدی : " & naghdi & "=>>" & Tfaktor.TakhfifRiali)
	End If
	
	Tfaktor.GablePardakht = MablaghKolFaktor - Tfaktor.TakhfifKala - Tfaktor.TakhfifVizhe - Tfaktor.TakhfifRiali
	
	Dim Sood As Long = (Tfaktor.GablePardakht)*(DarsadSood/100)
	Log("سود ویزیتور : " & Sood)
	Tfaktor.SoodVisitor = Sood
	FinalFaktor=Tfaktor
End Sub


Sub check_internet As Boolean
	Dim ph As Phone
	Dim connected As Boolean
	If ph.GetDataState="CONNECTED" Then
		connected=True
	Else If ph.GetSettings("wifi_on")=1 Then
		connected=True
	End If
	Return connected
End Sub