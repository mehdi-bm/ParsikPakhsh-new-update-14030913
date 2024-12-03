B4A=true
Group=Class
ModulesStructureVersion=1
Type=StaticCode
Version=7.3
@EndOfDesignText@
  Sub Process_Globals
	Dim Sql1 As SQL
	Dim Sf As StringFunctions
	Dim IconView As Amir_IconView
	Dim PersianDate As PersianDate
	Dim MD As MSMaterialDrawer
	Dim Json As JSONParser
	Dim jsonG As JSONGenerator
	Dim P As PhoneId
	Dim PImei As Phone
	Dim Imei As PhoneId
	Dim strImei As String
	Type AdapterItemHome(img As String,title As String)
	Type AdapterChangeFeeKala(FldCodKala As String,FldFee As String)
	Type AdapterGoroohKala(FldC_Gorooh As String,FldN_Gorooh As String)
	Type AdapterAndroidLog(message As String,date As String,time As String,Action As String)
	Type AdapterListBackupFile(FileName As String,Date As String,Time As String)
	Type AdapterListKala(CodeGroup As String,CodeKala As String,NameKala As String,NameVahed As String,NameVahed2 As String,SumMande As String,TedadDarKarton As String,FeeForoosh As Int,MablaghTakhfif As Int,SumMandeKarton As String,FeeForooshKarton As String,TedadDarSabadJoz As String,TedadDarSabadKol As String,Tozihat As String,FldVaziatPardakht As String,FldMablaghMasrafKonande As String,fldPathPic As String,fldFeeBadAzTakhfif As String,FldEshantion As String,fldCountEshantion As String,fldTipFee As Int,fldFeeTasvie As String,fldSharh As String,TakhfifKala As String,FldAmani As String,fldShomareForoosh As String,fldDarsadTakhfif As String,fldArzeshAfzode As String,fldDarsadArzeshAfzode As String,fldArzeshAfzodeKala As String,fldDarsadArzeshAfzodeKala As String)
	Type AdapterGoroohAshkhas(FldC_Gorooh As String,FldN_Gorooh As String)
	
	Type AdapterSendFaktor(FldRadif As String,FldShomareFaktor As Int,FldVaziatPardakht As String,FldC_Tafzili As String,FldN_Tafzili As String,FldCodeKala As String,FldNamekala As String,FldFeeForoosh As String,FldTedadDarKarton As String,FldTedadDarSabadJoz As String,FldTedadDarSabadKol As String,FldTozihat As String,FldTarikh As String,fldTime As String,FldLat As String,FldLon As String,FldTozih As String,FldShomareBargasht As String,FldDarsadTakhfif As String,fldType As String,FldMablaghTakhfif As String,FldAmani As String,FldSumMablaghTakhfifVizhe As String,FldSumMablaghTakhfifKala As String,FldTotalFaktor As String,FldMablaghTakhfifKol As String,fldShomareForoosh As String,fldShomareFactorReal As String,fldSignatureBitmapString As String)
	
	Type AdapterFaktor(FldId As Int,FldRadif As String,FldShomareFaktor As Int,FldVaziatPardakht As String,FldC_Tafzili As String,FldN_Tafzili As String,FldCodeKala As String,FldNameKala As String,FldFeeForoosh As String,FldTedadDarKarton As String,FldTedadDarSabadJoz As String,FldTedadDarSabadKol As String,FldTarikh As String,FldLat As String,FldLon As String,FldSend As Int,FldVaziatPardakhti As String,FldTozihat As String,FldMablaghMasrafKonande As String,fldArzeshAfzode As String,fldDarsadArzeshAfzode As String)
	Type AdapterListAshkhas(CodeTafzili As String,SharhTafzili As String,Mande As String,Lat As String,Lon As String,Tell As String,Address As String,FldLastVisit As String,FldLastSefaresh As String,FldMobile As String,FldVaziat As String,FldEtebar As String,lastSeen As String,lastOrderDate As String,FldC_Gorooh As String,FldN_Gorooh As String,FldSync As String,FldC_Meli As String,FldC_Posti As String,FldShomarehesab As String,fldBlackList As String,fldSaghfeEtebar As String,fldRadif As Int,fldDateVisit As String,fldVaziatTour As String)
	Type AdapterListTicket(FldCode As String,FldOnvan As String,FldOlaviat As String,FldTozihat As String,FldDate As String,FldTime As String,FldVaziat As String,FldAnswer As String)
	Type AdapterListNoeTasvie(FldC_Tasvie As String,FldN_Tasvie As String)
	Type AdapterListFaktor(C_Name,fldShomareFaktor,fldTotalFaktor,fldMablaghKol,fldDate,fldTime,fldTozihFaktor,fldVaziat,fldC_Tasvie,fldC_Ashkhas,FldTakhfifKala,FldTakhfifVizhe,Signature,fldTedadJoz,fldTedadCarton,fldTedadJozMarjoee,fldTedadCartonMarjoee,fldTedadJozMande,fldTedadCartonMande,fldMablaghMande,FldName,FldShomareBargasht,FldDateBargasht,FldMablaghBargasht,FldType,fldShomareForoosh,FldAmani As String,wIsBacked,synced As Boolean,fldArzeshAfzode As String,fldDarsadArzeshAfzode As String,fldSumMandeAzGhabl As String,fldSumMablaghBadAzTakhfif As String)
	Type AdapterListRizeFaktor(FldRadif,C_Name,fldShomareFaktor,fldTotalFaktor,fldMablaghKol,fldDate,fldTime,fldTozihFaktor,fldVaziat,fldC_Tasvie,fldC_Ashkhas,FldTakhfifKala,FldTakhfifVizhe,Signature,fldTedadJoz,fldTedadCarton,fldTedadJozMarjoee,fldTedadCartonMarjoee,fldCodeKala,fldSharhKala,fldTedadJozMande,fldTedadCartonMande,fldMablaghMande,FldName,FldShomareBargasht,FldDateBargasht,FldMablaghBargasht,FldType,fldShomareForoosh,FldAmani As String,wIsBacked,synced As Boolean,fldArzeshAfzode As String,fldDarsadArzeshAfzode As String)
	Type FinalFaktor_(SoodVisitor,MandeHesab,date,shfaktor,Customername,Mantaghe,Address,Tel,TasvieType,KhamFaktor,TakhfifKala,TakhfifKol,TakhfifVizhe,GablePardakht,Eshantion,fldArzeshAfzode,SumKolBadazTahkfif As String)
	Type AdapterReportVisitor(fldSharhKala,fldTedadJoz,fldTedadCarton,fldTedadKol,fldCount,fldFeeJoz As String)
	Type AdapterReportMoshtari(fldFeeJoz,fldFeeBargasht,fldTedadEshantionJoz,fldTedadEshantionKol As String)
	Type AdapterReportSooratHesab(fldRadif,shomare,fldSanad,fldSharh,fldRiz,fldDate,fldBedehkar,fldBestankar,fldMande As String)
	Type AdapterListNotif(FldId As String,FldTitle As String,FldBody As String,FldDate As String,FldTime As String)
	
	Type AdapterListTour(CodeVisitor As String,indexTour As String,Tour As List,TedadTour As Int,DateTour As Long)
	Type AdapterListRizeTour(Id As Int,fldRadif As Int,fldCodeSuperVisor As String,fldCodeVisitor As String,fldCodeGroup As String,fldCodeTafzili As Int,fldSharheTafzili As String,FldLat As String,FldLon As String,fldDate As Int,fldDateVisit As Int,fldTimeVisit As Int,fldDateNextVisit As String,fldDateTozie As Int,fldShomareSefaresh As String,fldSharh As String,fldVaziat As Int,fldShomareFactor As String)
	
	'Type AdapterListEshantion(Id,fldCodeKala,fldVahed,fldTedadEshantion,fldCountForoosh,fldVaziat As String)
	Type AdapterListEshantion(ID,fldCodeKalaForoosh,fldShomareTabaghe,fldTedadForoosh,fldCodeKalaEshantion,fldTedadEshantion As String)
	Type AdapterListEshantionGroup(ID,fldCodeGroupKala,fldShomareTabaghe,fldTedadForoosh,fldCodeGroupKalaEshantion,fldTedadEshantion As String)
	Type AdapterListEshantionGroupContent(fldCodeGroupKala,fldCodeGroupKalaEshantion,fldTedadEshantion As String)
	Type AdapteRepFactorVisitor(fldShomareFactor,fldCodeVasete,FldN_Visitor,fldCodeTafsili,fldSharheTafzili,fldTozihat,fldTime,fldDate,fldNahveTasvie,fldShomareFactorReal As String)
	Type AdapteRepRizFactorVisitor(fldRadif,fldShomareFactor,fldCodeVasete,FldN_Visitor,fldCodeTafsili,fldSharheTafzili,fldCodeKala,fldSharhKala,fldTozihatRecord,fldDate,fldNahveTasvie,fldTedadJoz,fldFeeJoz,fldTedadCarton,FldTedadDarKarton,fldShomareFactorReal As String,SumFee As Int)
	Type AdapteRepHavale(fldShomareHavale,fldDate,fldVaziat,fldMandeFactor,fldCountFactor As String)
	Type AdapteRizHavale(fldShomareFactor,fldCodeTafzili,fldSharhTafzili,fldMablaghKhales,fldAddress,fldTell,fldDate,fldLat,fldLon,fldVaziat,Distance As String)
	Type AdapteRizFactorHavale(fldShomareFactor,fldShomareHavale,fldShomareSanad,fldCodeAnbar,fldRadif,fldCodeKala,fldSharhKala,fldCodeTafzili,fldSharhTafzili,fldTedadCarton,fldTedadJoz,fldFeeJoz,fldFeeYekCarton,fldFeeKol,fldDarsadTakhfif,fldMablaghTakhfif,fldArzeshAfzode,fldMablaghKhales,fldNameCompany,fldC_Ranandeh,fldN_Ranandeh,fldAddress,fldTell,fldCodeVasete,fldDateFactor,fldDate,fldTime,fldLat,fldLon,fldMandeTalab,fldMablagheKolDaryafti,fldMandeTasfieNashode,fldDateSarResid,fldVaziat,fldDateTahvil,fldTimeTahvil,fldSignature,fldSharhFactor,Distance As String)
	Type AdapterListSabt(FldShomareSabt As String,FldC_Ashkhas As String,FldType As String,FldNoe As String,FldMablagh As String,FldShomareCheck As String,FldDateCheck As String,FldBankName As String,FldDateSabt,TozihateFaktor As String)
	Type AdapterListVideo(Id As String,fldTitle As String,fldLink As String,fldDate As String,fldTime As String,fldVaziat As Int,fldDescription As String,fldImage As String)
	Type AdapterListCheckDaryafti(ID As String,fldShomareCheck As String,fldShomareHesab As String,fldDate As String,fldDateSarResid As String,fldCodeBank As String,fldNameBank As String,fldShobe As String,fldMablagh As Int,fldCodeSahebeCheck As String,fldNameSahebeCheck As String,fldShomareDaryaft As String,fldSharh As String,fldShomareFactor As String,count As String)
	Type AdapteEnterExitVisitor(fldType,fldDate,fldTime,fldLat,fldLon,fldCode As String)
	Type AdapteVersion(FldVersion,FldLink,FldDateUpdate,FldType,FldNumberVersion,id As String)
	Dim Font2 = Typeface.LoadFromAssets("IRANSansMobile(FaNum)_Bold.ttf") As Typeface
	'Dim Font1 = Typeface.LoadFromAssets("b koodak bold_yasdl.com.ttf") As Typeface
	Dim placeHolder As Bitmap
	Dim VahedPool As String 
	Dim RaghamAshar As String
	Dim C_Visitor,N_Visitor As String
	Dim Url As String
	Dim kalamanfi As String
	Dim TaghirFeeKala As String
	Dim TakhfifKala As String
	Dim BackPage As String
	Dim ShomareFaktor As String
	Dim NoeFaktorClick As String  
	Dim NoeFaktorChecked As String = "NewFaktor"  
	Dim ServiceGpsActive As Int
	Dim C_Tafzili,N_Tafzili,Address_Tafzili,Tell_Tafzili As String 
	Dim Version As String = Application.VersionName
	Dim NamayeshKalaSefr As String
	Dim NewVersion,LinkDownload As String
	Dim C_LayeKala As String     
	Dim C_LayeAshkhas As String
	Dim DateFaktor As String
	Dim VaziatPardakhtFaktor As String
	Dim PrintBuffer As String
	Dim BtAdmin As BluetoothAdmin
	Dim BTConnection As Serial
	Dim Printers As TextWriter
	Dim Sf As StringFunctions
	Dim TypeGetData As String
	Dim LoadEnable As Boolean
	Dim PauseState As Boolean
	Public DeviceId As String
	Dim IsActive As Boolean=False
	Public SaveFactorInLocation As Boolean
	Public Masafat As Long
	Dim TokenPush As String
	Dim PushBody As String
	Dim DastrasiGroupKala,DastrasiGroupAshkhas As Int
	Dim OriginalListFaktor As List
	Dim TextSizePdf As Int=4.5
	Dim bmtSignature As Bitmap
	Dim GpsIsEnable As Boolean=True
	Dim PrinterType As Int=0
	Dim Vaziat As Int
	Dim CodeMoshtari As String
	Dim ImageUrl As String
	Dim BackToActivity As String
	
	''''''''''''new'''''''''''''''
	Dim AppName As String=Application.LabelName
	Dim MenuTitle2 As String=""
	Dim AppVer As String="V: " & Application.VersionCode
	Dim Plan As String = 4
	Dim Code As String = 9000015
	Dim HaveShift As Boolean
	Dim EtelaResani As String=0
	Dim fldNewMoshtari As String = 0
	Dim ShowBedehkaran As String=0
	Dim NoeGet As String = ""
	Dim isFloat As Boolean
	Dim Rs As RichString
	Dim page As String = ""
	Dim Gps As String=0
	Dim SabtGpsShakhs As String=0
	Dim ShowGpsShakhs As String=0
	Dim Action As String=0
	Dim FaktorSelect As String=""
	Dim ForooshBishAzMojoodi As String = 0
	Dim Signature As String=1
	Dim VoroodTozihKala As String=0
	Dim DarsadSood As String=0
	Dim DarsadTakhfifVizhe As Int = 0
	Dim KharidBiashAz As String=0
	Dim DateTimeSend As String=0
	Dim DateTimeRecive As String=0
	Dim ShomareSabt As String=0
	Dim IconLink As String =""
	Dim FinalFaktor As FinalFaktor_
	Dim Su As StringUtils
	Dim ListNotif As List
	Dim CodeVisitorSelect As String=0
	Dim CodeMoshtariSelect As String=0
	Dim CountShowGpsMap As String=0
	Dim Tag As Object=0
	Dim Admin As String
	Dim Tozie As String=0
	Dim Visitor As String=0
	Dim SendMarjoie As String=0
	Dim CheckAdmin As String
	Dim HideMojodi As String
	Dim MablaghKol As String
	Dim Tozihat_faktor As String
	Dim NoeTasvieFaktor As String
	Dim DateVersion As String
	Dim IsOnlineDataFactor As String=0
	Dim feeTip As String=0
	Dim feeCode As String=0
	Dim PicOnline As String
	Dim ConnectionStatus As String=0
	Dim ArrayTasvieForKala() As String
	Dim TypeVersion As String="UpdateNew"
	Dim NumberVersion As String=Application.VersionCode
	Dim DateVersion As String="1403/08/15"
	Dim DarkMode As String="False"
	Dim colorPrimary As Int
	Dim colorPrimaryDark As Int
	Dim colorAccent As Int
	Dim Vpn As Boolean
	Dim IntervalGps As Int=1
	Dim Lat,Lon As String
	Dim GetHavaleFlag As Int=0
	Dim ShomareHavale As String=0
	Dim ShomareDaryaft As String=0 
	Dim VideoSelected As String=0
	Dim lstChangeFeeKala As List
	Dim downloadingData As Boolean
	Dim GpsDateTa As String,GpsTimeAz As String,GpsTimeTa As String
	Dim GetDataOnline As String=0
	Dim Daryaft As String=0
	Dim Amani As String=0
	Dim isAmani As String=0
	Dim SetVisit As String=0
	Dim MojavezSefaresh As String=0
	Dim DeleteAshkhasNew As Boolean=False
	Dim RotatePic As Boolean=False
	Dim UpdateShakhs As Boolean=False
	Dim FeeChange As String=0
	Dim EshantionTabaghati As String=0
	Dim EshantionGroup As String=0
	Dim EshantionRemove As String=0
	Dim CountEshantionGroup As String=0
	Dim MandeEtebar As String=0
	Dim MandeHesab As String=0
	Dim ManedEtebarEnable As Boolean=False
	Dim th As Thread
	Dim linkposparsian As String
	'Dim PackageNamePosParsian As String="com.pec.cpsdk"
	Dim PackageNamePosParsian As String="com.parsikhesab.parsianpos"
	Dim StatusPicKala As String
	Dim CodeKalaImage As String
	Dim CompanyName As String
	Dim CompanyTell As String
	Dim CompanyAddress As String
	Dim MobileIsImportent As String=0
	'ArzeshAfzode
	Dim ArzeshAfzode As String=0
	Dim ArzeshAfzodeEnable As String=0
	Dim UpdateSefaresh As Boolean=False
	Dim fusLat As String=""
	Dim fusLon As String=""
	Dim fusGetTime As String="00:00"
	Dim widgetEnable As Boolean=False
	Dim editFactor As Boolean
	Dim TourVisit As String=0
	Dim receiver2 As PNBroadcastReceiver
	Dim TourVisitSW As Boolean
	Dim GetDataStatus As Boolean=False
End Sub
	
Sub Initialize	
	If Not(File.Exists(File.DirDefaultExternal,"Parsik")) Then
	File.MakeDir(File.DirDefaultExternal,"Parsik")
	End If
	If Not(File.Exists(File.DirDefaultExternal,"Parsik")) Then
		File.MakeDir(File.DirDefaultExternal,"Parsik")
		File.Copy(File.DirAssets,"parsik_db.db",File.DirDefaultExternal &"/Parsik","parsik_db.db")
		File.MakeDir(File.DirDefaultExternal &"/Parsik","AksKala")
		File.MakeDir(File.DirDefaultExternal &"/Parsik","GalleryKala")
		File.MakeDir(File.DirDefaultExternal &"/Parsik","pdf")
		File.MakeDir(File.DirDefaultExternal &"/Parsik","Signature")
		File.MakeDir(File.DirDefaultExternal &"/Parsik","Backup")
		File.WriteString(File.DirDefaultExternal &"/Parsik/Backup","backlist.txt","")
		File.WriteString(File.DirDefaultExternal &"/Parsik/Backup","log.txt","")
		
	Else if File.Exists(File.DirDefaultExternal, "Parsik") = True Then
		If Not(File.Exists(File.DirDefaultExternal & "/Parsik", "parsik_db.db")) Then
			File.Copy(File.DirAssets,"parsik_db.db",File.DirDefaultExternal &"/Parsik","parsik_db.db")
		End If
		If Not(File.Exists(File.DirDefaultExternal &"/Parsik", "AksKala")) Then
			File.MakeDir(File.DirDefaultExternal &"/Parsik","AksKala")
		End If
		If Not(File.Exists(File.DirDefaultExternal &"/Parsik", "GalleryKala")) Then
			File.MakeDir(File.DirDefaultExternal &"/Parsik","GalleryKala")
		End If
		If Not(File.Exists(File.DirDefaultExternal &"/Parsik", "pdf")) Then
			File.MakeDir(File.DirDefaultExternal &"/Parsik","pdf")
		End If
		If Not(File.Exists(File.DirDefaultExternal &"/Parsik", "Signature")) Then
			File.MakeDir(File.DirDefaultExternal &"/Parsik","Signature")
		End If
		If Not(File.Exists(File.DirDefaultExternal &"/Parsik", "Backup")) Then
			File.MakeDir(File.DirDefaultExternal &"/Parsik","Backup")
			File.WriteString(File.DirDefaultExternal &"/Parsik/Backup","backlist.txt","")
			File.WriteString(File.DirDefaultExternal &"/Parsik/Backup","log.txt","")
		End If
	End If

	Dim ac As AppCompat
	colorPrimary=ac.GetThemeAttribute("colorPrimary")
	colorPrimaryDark=ac.GetThemeAttribute("colorPrimaryDark")
	colorAccent=ac.GetThemeAttribute("colorAccent")
	Log(colorPrimary)
	Log(colorPrimaryDark)
	Log(colorAccent)
		Sql1.Initialize(File.DirDefaultExternal &"/Parsik","parsik_db.db",False)
'	Sql1.ExecQuerySingleResult("PRAGMA journal_mode = delete")
'	Log("Current mode: " & Sql1.ExecQuerySingleResult("PRAGMA journal_mode"))
		'Sql2.Initialize(File.DirDefaultExternal &"/Parsik","parsik_db.db",False)
	Url="zomorodonline.ir"
	lstChangeFeeKala.Initialize
	receiver2.Initialize("receiver2")
	receiver2.AddAction(PackageNamePosParsian &".ACTION_RESULT")
'	receiver2.AddAction("com.pec.cpsdk.ACTION_RESULT")
	receiver2.SetPriority(1)
	receiver2.RegisterReceiver
End Sub

Sub UpdateSetting
	Dim Cu As Cursor = Result("Select * From TblSetting")
	Cu.Position=0
'	If Cu.GetString("FldVersion")<Version Then
'		'' update setting
'		SaveUpdate("update TblSetting Set FldVersion='"& Version &"'")
'	End If

	Gps= Cu.GetString("FldGps")
	ServiceGpsActive = Cu.GetString("FldGps")
	RaghamAshar = Cu.GetString("FldRound")
	VahedPool = Cu.GetString("FldVahedPool")
	'NoeDate = Cu.GetString("FldNoeDate")
	C_Visitor = Cu.GetString("FldC_Visitor")
	N_Visitor = Cu.GetString("FldN_Visitor")
	Url = Cu.GetString("FldUrl")
	kalamanfi = Cu.GetString("FldKalaManfi")
	ForooshBishAzMojoodi=kalamanfi
	KharidBiashAz=kalamanfi
	TaghirFeeKala = Cu.GetString("FldTaghirFeeKala")
	NamayeshKalaSefr = Cu.GetString("FldNamayeshKalaSefr")
	DastrasiGroupKala =myCode.Is_Null_adad(Cu.GetString("FldDastrasiKala"))
	ArzeshAfzodeEnable=Cu.GetString("fldArzeshAfzodeEnable")
	ArzeshAfzode =myCode.Is_Null_adad(Cu.GetString("fldArzeshAfzode"))
	Log("ارزش افزوده: "&ArzeshAfzode)

	Log("DastrasiGroupKala= "&DastrasiGroupKala)
	DastrasiGroupAshkhas =myCode.Is_Null_adad(Cu.GetString("FldDastrasiAshkhas"))
	Log("DastrsiGroupAshkhas= "&DastrasiGroupAshkhas)
	CodeMoshtari=Cu.GetString("FldCodeMoshtari")
	'ImageUrl="http://rayansanatsoft.ir/download/temp/"& CodeMoshtari &"/"
	
	Log(Cu.GetString("FldSaveFactorInLocation"))
	If Cu.GetString("FldSaveFactorInLocation")="0" Then
		SaveFactorInLocation=False
	Else
		SaveFactorInLocation=True
	End If
	Log(Cu.GetString("FldMasafat"))
	Masafat=Cu.GetString("FldMasafat")
	PrinterType=Cu.GetInt("FldPrinterType")
	Vaziat=myCode.Is_Null_adad(Cu.GetString("FldVaziat"))
	
	If Cu.GetString("FldDateTimeRecive")<>Null Then
		DateTimeRecive=Cu.GetString("FldDateTimeRecive")
	Else
		DateTimeRecive=0
	End If
	If Cu.GetString("FldDateTimeSend")<>Null Then
		DateTimeSend=Cu.GetString("FldDateTimeSend")
		Else
		DateTimeSend=0
	End If
	

	
	TakhfifKala = Cu.GetString("FldTakhfifKala")
	HideMojodi = Cu.GetString("FldHideMojodi")
	Admin = Cu.GetString("FldAdmin")
	CheckAdmin = Cu.GetString("FldCheckAdmin")
	Tozie = Cu.GetString("FldTozie")
	'Tozie = 0
	Visitor = Cu.GetString("FldVisitor")
	SendMarjoie = Cu.GetString("FldSendMarjoie")
	PicOnline = Cu.GetString("FldPicOnline")
	Daryaft =myCode.Is_Null_adad(Cu.GetString("FldDaryaft"))
	Amani =myCode.Is_Null_adad(Cu.GetString("FldAmani"))
	MojavezSefaresh =myCode.Is_Null_adad(Cu.GetString("FldMojavezSefaresh"))
	GetDataOnline=myCode.Is_Null_adad(Cu.GetString("FldGetDataOnline"))
	ConnectionStatus=myCode.Is_Null_adad(Cu.GetString("FldConnectionStatus"))
	GetDataOnline=0
	If	PicOnline=1 Then
		ImageUrl=Cu.GetString("FldLinkPicKala")
	End If
	'ConnectionStatus=1
	'C_Tafzili=0
	IntervalGps=Cu.GetString("FldIntervalGps") 	
	EshantionTabaghati=myCode.Is_Null_adad(Cu.GetString("FldEshantionTabaghati"))
	EshantionRemove=myCode.Is_Null_adad(Cu.GetString("FldEshantionRemove"))
	EshantionGroup=myCode.Is_Null_adad(Cu.GetString("FldEshantionGroup"))
	
	CompanyName=myCode.Is_Null(Cu.GetString("FldNameCompany"))
	CompanyTell=myCode.Is_Null(Cu.GetString("FldTellCompany"))
	CompanyAddress=myCode.Is_Null(Cu.GetString("FldAddressCompany"))
	MobileIsImportent=myCode.Is_Null_adad(Cu.GetString("FldMobileIsImportent"))
	TourVisit=1
'	CallSubDelayed(Act_Main,"CheckAdmin")
'	 
'	CallSubDelayed(Act_Main,"CheckTozie")
	
	'	StartService(Service_Gps)
'	StartService(FusedLocationService)
	Log("Gps Start")
End Sub
Sub Interval As String
	Dim Cu As Cursor = Sql1.ExecQuery("Select FldIntervalGps From TblSetting")
	Cu.Position=0
	Return Cu.GetString("FldIntervalGps") * 60 * 1000
End Sub
Sub CreateBK(namefile As String)
	Dim FileName As String
	Dim Date As String=PersianDateDash(DatePersian)
	Dim Time As String=DateTime.Time(DateTime.Now)
	If namefile<>"" Then
		FileName=namefile
		Else
		FileName="bk"&DateTime.Date(DateTime.Now)&DateTime.Time(DateTime.Now)
		FileName=FileName.Replace(":","")
		FileName=FileName.Replace("/","")
	End If
		Dim List1 As List
		Dim backitem As AdapterListBackupFile
		backitem.Initialize
		List1.Initialize
		
		
		If File.Exists(File.DirDefaultExternal,"Parsik/Backup") = False Then
		File.MakeDir(File.DirDefaultExternal,"Parsik/Backup")
		File.Copy(File.DirAssets,"backlist.txt",File.DirDefaultExternal &"/Parsik/Backup","backlist.txt")
			'File.Copy(File.DirAssets,"backlist.json",File.DirDefaultExternal &"/Parsik/Backup","backlist.json")
		End If
	If File.Exists(File.DirDefaultExternal,"Parsik/Backup/backlist.txt") = False Then
		File.Copy(File.DirAssets,"backlist.txt",File.DirDefaultExternal &"/Parsik/Backup","backlist.txt")
	Else
		List1 = File.ReadList(File.DirDefaultExternal &"/Parsik/Backup","backlist.txt")
	End If

	
	backitem.FileName=FileName
	backitem.Date=PersianDateDash(DatePersian)
	backitem.Time=DateTime.Time(DateTime.Now)
	
	Dim str As String=FileName&","& Date &","& Time
		
'	Dim components() As String
'	components = Regex.Split(",", str) 
	List1.Add(str)

	'Dim JSONGenerator As JSONGenerator
	'JSONGenerator.Initialize2(List1)
	'File.WriteString(File.DirDefaultExternal,"Parsik/Backup/backlist.json",JSONGenerator.ToPrettyString(0))
	File.WriteList(File.DirDefaultExternal &"/Parsik/Backup","backlist.txt",List1)
	
		
	File.Copy(File.DirDefaultExternal &"/Parsik","parsik_db.db",File.DirDefaultExternal &"/Parsik/Backup",FileName&".db")
	Sleep(200)
		

End Sub

Sub SaveLog(str As String)
	'File.WriteString(File.DirDefaultExternal &"/Parsik/Backup","log.txt","")
	File.WriteString(File.DirDefaultExternal &"/Parsik/Backup","log.txt",str)
End Sub

Sub GetLog() As String
	'File.WriteString(File.DirDefaultExternal &"/Parsik/Backup","log.txt","")
	Return File.ReadString(File.DirDefaultExternal &"/Parsik/Backup","log.txt")
End Sub

Sub Result(Query As String) As Cursor
	
	Dim Cu As Cursor
	Try
		If Sql1.IsInitialized=False Then
			Initialize
		End If
		Cu=Sql1.ExecQuery(Query)
	Catch
		Log(LastException)
		myCode.SendError(LastException,"MCode-Result")
	End Try
	'Cu.Close
	Return Cu
End Sub
Sub SingleResult(Query As String) As Object
	Dim ob As Object
'	Log(Query)
	Try
		If Sql1.IsInitialized=False Then
			Initialize
		End If
		ob=Sql1.ExecQuerySingleResult(Query)
	Catch
		Log(LastException)
		myCode.SendError(LastException,"MCode-SingleResult")
	End Try
	Return ob
End Sub
Sub SaveUpdate(query As String)
	Try
		If Sql1.IsInitialized=False Then
			Initialize
		End If
		Sql1.ExecNonQuery(query)
'		Log("Save")
	Catch
		Log(LastException)
		Log("not Save")
		myCode.SendError(LastException,"MCode-SaveUpdate")
	End Try
End Sub


	

Sub UpdateDataBase

	MDatabase.CreateDataBaseNewTable	
	MDatabase.UpdateDataBaseSetting	
	MDatabase.UpdateDataBaseKala	
	MDatabase.UpdateDataBaseAshkhas	
	MDatabase.UpdateDataBaseSabad	
	MDatabase.UpdateDataBaseFactor	
	MDatabase.UpdateDataBaseDaryaft	
	MDatabase.UpdateDataBaseEnterExitVisitor	
	MDatabase.UpdateDataBaseGpsVisitor		
	MDatabase.UpdateDataBaseHavale	
	MDatabase.UpdateDataBaseAshkhasNew
	
	Sql1.ExecNonQuery("Update TblSetting Set FldVersion = '"& Version &"'")
	SaveUpdate("Update TblSetting Set FldUrl = 'zomorodonline.ir'")
	Initialize
End Sub

Sub UpdateDataBaseOld
'	Dim Check As Int
'	Dim Cur As Cursor
'	Cur = Sql1.ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='TblAshkhasNew'")
'	If Cur.RowCount = 0 Then
'		Sql1.ExecNonQuery("Create Table TblAshkhasNew (FldId integer NOT NULL PRIMARY KEY,FldCodeTafzili Text,FldSharheTafzili Text,FldVisitor Text,FldTell Text,FldC_Meli Text,FldC_Posti Text,FldShomarehesab Text,FldAddress Text,FldCodeGroup Text)")
'		Sql1.Close
'		Initialize
'	End If
'	
'	Cur = Sql1.ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='TblGoroohKala'")
'	If Cur.RowCount = 0 Then
'		Sql1.ExecNonQuery("Create Table TblGoroohKala (FldC_Gorooh Text,FldN_Gorooh Text)")
'		Sql1.Close
'		Initialize
'	End If
'	
'	Cur = Sql1.ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='TblGoroohAshkhas'")
'	If Cur.RowCount = 0 Then
'		Sql1.ExecNonQuery("Create Table TblGoroohAshkhas (FldC_Gorooh Text,FldN_Gorooh Text)")
'		Sql1.Close
'		Initialize
'	End If
'	
'	Cur = Sql1.ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='TblSooratHesab'")
'	If Cur.RowCount = 0 Then
'		Sql1.ExecNonQuery("Create Table TblSooratHesab (FldId integer NOT NULL PRIMARY KEY,FldCodeTafzili Text,FldSharheTafzili Text,FldShomareFactor Text,FldMandeTalab Text,FldMablagheKolDaryafti Text,FldMandeTasfieNashode Text,FldDateSarResid Text)")
'		Sql1.Close
'		Initialize
'	End If
'	
'	Cur = Sql1.ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='TblNotifi'")
'	If Cur.RowCount = 0 Then
'		Sql1.ExecNonQuery("Create Table TblNotifi (FldId integer NOT NULL PRIMARY KEY,Id INTEGER,FldTitle Text,FldBody Text,FldDate Text,FldTime Text,FldStatus Text)")
'		Sql1.Close
'		Initialize
'	End If
'	
'	
'	'Cur = Sql1.ExecQuery("DROP TABLE TblTablighVisitor;")
'	Cur = Sql1.ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='TblTablighVisitor'")
'	If Cur.RowCount = 0 Then
'		Sql1.ExecNonQuery("Create Table TblTablighVisitor (Id integer NOT NULL PRIMARY KEY,FldTitle Text,FldMessage Text,FldDate Text,FldTime Text,FldVaziat Text,FldLink Text)")
'		Sql1.Close
'		Initialize
'	End If
'	
'	
'	Cur = Sql1.ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='TblLogVisitSefaresh'")
'	If Cur.RowCount = 0 Then
'		Sql1.ExecNonQuery("Create Table TblLogVisitSefaresh (FldId INTEGER NOT NULL PRIMARY KEY,FldC_Ashkhas Text,FldVisit Text,FldSefaresh Text,FldElatSefaresh Text,FldLat Text,FldLon Text)")
'		Sql1.Close
'		Initialize
'	End If
'	Cur = Sql1.ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='TblLastSeen'")
'	If Cur.RowCount = 0 Then
'		Sql1.ExecNonQuery("Create Table TblLastSeen (FldC_Ashkhas Text,LastSeen Text)")
'		Sql1.Close
'		Initialize
'	End If
'	
'	Cur = Sql1.ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='TblNextVisit'")
'	If Cur.RowCount = 0 Then
'		Sql1.ExecNonQuery("Create Table TblNextVisit (FldC_Ashkhas Text,NextVisitDate Text,NextVisitText Text)")
'		Sql1.Close
'		Initialize
'	End If
'	
'	Cur = Sql1.ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='TblVisitorTour'")
'	If Cur.RowCount = 0 Then
'		Sql1.ExecNonQuery("Create Table TblVisitorTour (FldId Text,FldC_Ashkhas Text,FldN_Ashkhas Text,FldAddress Text,FldTell Text,FldMob Text,FldC_City Text,FldN_City Text,FldC_Visitor Text,FldVaziat Text,FldEtebar Text,FldMandeHesab Text,FldLat Text,FldLon Text,FldTakhfifVizhe Text,FldTipFee Text,FldC_Visitor1 Text,FldC_Visitor2 Text,FldC_Visitor3 Text,FldC_Visitor4 Text,FldC_Visitor5 Text,FldC_Visitor6 Text,FldC_Visitor7 Text,FldC_Visitor8 Text,FldC_Visitor9 Text,FldLastVisit Text,FldLastSefaresh Text,lastSeen Text,lastOrderDate Text,nextVisitDate Text,nextVisitText Text,visitTourDate Text,visitTourText Text,fldC_Ashkhas_C Text)")
'		Sql1.Close
'		Initialize
'	End If
'	
'	Cur = Sql1.ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='TblGalleryPic'")
'	If Cur.RowCount = 0 Then
'		Sql1.ExecNonQuery("Create Table TblGalleryPic (Id integer NOT NULL PRIMARY KEY,fldCodeKala Text,fldImageNumber Text,fldImage Text,fldShow Text)")
'		Sql1.Close
'		Initialize
'	End If
'	
'	Cur = Sql1.ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='tblEshantionVisitori'")
'	If Cur.RowCount = 0 Then
'		Sql1.ExecNonQuery("Create Table tblEshantionVisitori(Id integer NOT NULL PRIMARY KEY,fldCodeKala Text,fldVahed Text,fldTedadEshantion Text,fldCountForoosh Text,fldVaziat Text)")
'		Sql1.Close
'		Initialize
'	End If
'	
'	Cur = Sql1.ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='tblEshantionTabaghati'")
'	If Cur.RowCount = 0 Then
'		Sql1.ExecNonQuery("Create Table tblEshantionTabaghati(ID integer NOT NULL PRIMARY KEY,fldCodeKalaForoosh Text,fldShomareTabaghe Text,fldTedadForoosh Text,fldCodeKalaEshantion Text,fldTedadEshantion Text)")
'		Sql1.Close
'		Initialize
'	End If
'	
'	Cur = Sql1.ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='tblEshantionGroup'")
'	If Cur.RowCount = 0 Then
'		Sql1.ExecNonQuery("Create Table tblEshantionGroup(ID integer NOT NULL PRIMARY KEY,fldCodeGroupKala Text,fldShomareTabaghe Text,fldTedadForoosh Text,fldCodeGroupKalaEshantion Text,fldTedadEshantion Text)")
'		Sql1.Close
'		Initialize
'	End If
'	
'	Cur = Sql1.ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='tblEshantionGroupTemp'")
'	If Cur.RowCount = 0 Then
'		Sql1.ExecNonQuery("Create Table tblEshantionGroupTemp(fldCodeGroupKala Text,fldCodeGroupKalaEshantion Text,fldTedadEshantion Text)")
'		Sql1.Close
'		Initialize
'	End If
'	
'	Cur = Sql1.ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='TblVisitor'")
'	If Cur.RowCount = 0 Then
'		Sql1.ExecNonQuery("Create Table TblVisitor (FldC_Visitor Text,FldN_Visitor Text)")
'		Sql1.Close
'		Initialize
'	End If
'	Cur = Sql1.ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='TblSabt'")
'	If Cur.RowCount = 0 Then
'		Sql1.ExecNonQuery("Create Table TblSabt (FldShomareSabt Text,FldC_Visitor Text,FldN_Visitor Text,FldC_Ashkhas Text,FldType Text,FldNoe Text,FldMablagh Text,FldShomareCheck Text,FldDateCheck Text,FldBankName Text,FldDateSabt Text)")
'		Sql1.Close
'		Initialize
'	End If
'	Cur = Sql1.ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='TblHavale'")
'	If Cur.RowCount = 0 Then
'		Sql1.ExecNonQuery("Create Table TblHavale (fldShomareHavale Text,fldDate Text,fldVaziat int,fldMandeFactor Text,fldCountFactor Text)")
'		Sql1.Close
'		Initialize
'	End If
'	Cur = Sql1.ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='TblRizFactorHavale'")
'	If Cur.RowCount = 0 Then
'		Sql1.ExecNonQuery("Create Table TblRizFactorHavale (fldShomareFactor text,fldShomareHavale text,fldShomareSanad text,fldCodeAnbar text,fldRadif text,fldCodeKala text,fldSharhKala text,fldCodeTafzili text,fldSharhTafzili text,fldTedadCarton text,fldTedadJoz text,fldFeeJoz text,fldFeeYekCarton text,fldFeeKol text,fldDarsadTakhfif,fldMablaghTakhfif text,fldArzeshAfzode text,fldMablaghKhales text,fldNameCompany text,fldC_Ranandeh text,fldN_Ranandeh text,fldAddress text,fldTell text,fldCodeVasete text,fldDateFactor text,fldDate text,fldTime text,fldLat text,fldLon text,fldMandeTalab text,fldMablagheKolDaryafti text,fldMandeTasfieNashode text,fldDateSarResid text,fldVaziat int,fldDateTahvil text,fldTimeTahvil text,fldSignature text,fldSharhFactor text)")
'		Sql1.Close
'		Initialize
'	End If
'	
'	Cur = Sql1.ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='TblBankMa'")
'	If Cur.RowCount = 0 Then
'		Sql1.ExecNonQuery("Create Table TblBankMa (fldCodeBank text,fldNameBank text)")
'		Sql1.Close
'		Initialize
'	End If
'	
'	Cur = Sql1.ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='TblBankMoshtari'")
'	If Cur.RowCount = 0 Then
'		Sql1.ExecNonQuery("Create Table TblBankMoshtari (fldCodeBank text,fldNameBank text)")
'		Sql1.Close
'		Initialize
'	End If
'	
'	Cur = Sql1.ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='TblSandoogh'")
'	If Cur.RowCount = 0 Then
'		Sql1.ExecNonQuery("Create Table TblSandoogh (fldCodeSandoogh text,fldNameSandoogh text)")
'		Sql1.Close
'		Initialize
'	End If
'	
'	
'	Cur = Sql1.ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='TblDaryaft'")
'	If Cur.RowCount = 0 Then
'		Sql1.ExecNonQuery("Create Table TblDaryaft (ID integer NOT NULL PRIMARY KEY,fldShomareDaryaft Text,fldMablaghDaryafti Text,fldShomareFactor Text,fldShomareSanad Text,fldCodeTafzili Text,fldSharh Text,fldCodeVaste Text,fldCodeSandoogh Text,fldCodeBank Text,fldType Text,FldRadif Text,FldDateDaryaft Text,FldShomareDaryaftReal Text,FldShomareCheck Text,FldDarsadTakhfif Text,FldMablaghTakhfif Text,fldSharhKol Text,fldSend Text)")
'		Sql1.Close
'		Initialize
'	End If
'	
'	Cur = Sql1.ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='TblCheckDaryafti'")
'	If Cur.RowCount = 0 Then
'		Sql1.ExecNonQuery("Create Table TblCheckDaryafti (ID integer NOT NULL PRIMARY KEY,fldShomareCheck Text,fldShomareHesab Text,fldDate Text,fldDateSarResid Text,fldCodeBank Text,fldShobe Text,fldMablagh Text,fldCodeSahebeCheck Text,fldShomareDaryaft Text,fldNameBank Text,fldNameSahebeCheck Text,fldShomareFactor Text,fldSharh Text,fldSend Text,fldCodeVaste Text)")
'		Sql1.Close
'		Initialize
'	End If
'	
'	Cur = Sql1.ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='TblEnterExitVisitor'")
'	If Cur.RowCount = 0 Then
'		Sql1.ExecNonQuery("Create Table TblEnterExitVisitor (ID integer NOT NULL PRIMARY KEY,fldType Text,fldDate Text,fldTime Text,fldLat Text,fldLon Text,fldSend Text)")
'		Sql1.Close
'		Initialize
'	End If
'	
'	Cur = Sql1.ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='TblSettingPos'")
'	If Cur.RowCount = 0 Then
'		Sql1.ExecNonQuery("Create Table TblSettingPos (ID integer NOT NULL PRIMARY KEY,fldPosName Text,fldCompanyName Text,fldAMOUNT Text,fldSignCode Text,fldAdditionalData Text)")
'		Sql1.Close
'		Initialize
'	End If
'	
'	
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblSetting")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldAshkhas" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblSetting ADD FldAshkhas Text")
'		Sql1.ExecNonQuery("Alter Table TblSetting ADD FldKala Text")
'		Sql1.ExecNonQuery("Alter Table TblSetting ADD FldFee Text")
'		Sql1.ExecNonQuery("Alter Table TblSetting ADD FldTasvie Text")
'		Sql1.ExecNonQuery("Alter Table TblSetting ADD FldIntervalDownload Text")
'		Sql1.Close
'		Initialize
'		Sql1.ExecNonQuery("Update TblSetting Set FldAshkhas = '0', FldKala = '0', FldFee = '0', FldTasvie = '0', FldIntervalDownload = '0',FldDateUpdate='0'")
'	End If
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblSetting")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldDateUpdate" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblSetting ADD FldDateUpdate Text")
'		Sql1.Close
'		Initialize
'	End If
'	
'	'fldCodeSandoogh
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblDaryaft")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="fldCodeSandoogh" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblDaryaft ADD fldCodeSandoogh Text")
'		Sql1.Close
'		Initialize
'	End If
'	
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblDaryaft")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="fldSharheTafzili" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblDaryaft ADD fldSharheTafzili Text")
'		Sql1.Close
'		Initialize
'	End If
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblDaryaft")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="fldShomareHavale" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblDaryaft ADD fldShomareHavale Text")
'		Sql1.Close
'		Initialize
'	End If
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblDaryaft")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="fldShomareTell" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblDaryaft ADD fldShomareTell Text")
'		Sql1.Close
'		Initialize
'	End If
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblSetting")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldToken" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblSetting ADD FldToken Text")
'		Sql1.Close
'		Initialize
'	End If
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblSetting")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldDateTimeSend" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblSetting ADD FldDateTimeSend Text")
'		Sql1.Close
'		Initialize
'	End If
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblSetting")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldSendFactor" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblSetting ADD FldSendFactor Text")
'		Sql1.Close
'		Initialize
'		Sql1.ExecNonQuery("Update TblSetting Set FldDateUpdate='0',FldSendFactor='1'")
'	End If
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblSetting")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldPrinterType" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblSetting ADD FldPrinterType Text")
'		Sql1.Close
'		Initialize
'		Sql1.ExecNonQuery("Update TblSetting Set FldPrinterType='0'")
'	End If
'	'ArzeshAfzodeEnable
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblSetting")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="fldArzeshAfzodeEnable" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblSetting ADD fldArzeshAfzodeEnable Text")
'		Sql1.Close
'		Initialize
'		Sql1.ExecNonQuery("Update TblSetting Set fldArzeshAfzodeEnable='0'")
'	End If
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblSetting")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="fldArzeshAfzode" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblSetting ADD fldArzeshAfzode Text")
'		Sql1.Close
'		Initialize
'		Sql1.ExecNonQuery("Update TblSetting Set fldArzeshAfzode='0'")
'	End If
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblSetting")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldDateTimeRecive" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblSetting ADD FldDateTimeRecive Text")
'		Sql1.Close
'		Initialize
'	End If
'	'FldTakhfifKala
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblSetting")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldTakhfifKala" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblSetting ADD FldTakhfifKala Text")
'		Sql1.Close
'		Initialize
'	End If
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblSetting")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldDateTimeSend" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblSetting ADD FldDateTimeSend Text")
'		Sql1.Close
'		Initialize
'	End If
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblAshkhas")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldSync" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblAshkhas ADD FldSync Text")
'		Sql1.Close
'		Initialize
'	End If
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblSetting")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldSaveFactorInLocation" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblSetting ADD FldSaveFactorInLocation Text")
'		Sql1.Close
'		Initialize
'		Sql1.ExecNonQuery("Update TblSetting Set FldSaveFactorInLocation='0'")
'	End If
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblSetting")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldMasafat" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblSetting ADD FldMasafat Text")
'		Sql1.Close
'		Initialize
'		Sql1.ExecNonQuery("Update TblSetting Set FldMasafat='50'")
'	End If
'	
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblSetting")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldTaghirFeeKala" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblSetting ADD FldKalaManfi Text")
'		Sql1.ExecNonQuery("Alter Table TblSetting ADD FldTaghirFeeKala Text")
'		Sql1.Close
'		Initialize
'		Sql1.ExecNonQuery("Update TblSetting Set FldKalaManfi = '0', FldTaghirFeeKala='0'")
'	End If
'	
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblSetting")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldTokenId" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblSetting ADD FldTokenId Text")
'		Sql1.Close
'		Initialize
'	End If
'	
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblSetting")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldCodeMoshtari" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblSetting ADD FldCodeMoshtari Text")
'		Sql1.Close
'		Initialize
'	End If
'	
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblSetting")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldNameVisitor" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblSetting ADD FldNameVisitor Text")
'		Sql1.Close
'		Initialize
'	End If
'	
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblSetting")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldVaziat" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblSetting ADD FldVaziat Integer")
'		Sql1.Close
'		Initialize
'		Sql1.ExecNonQuery("Update TblSetting Set FldVaziat='0'")
'	End If
'	
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblSetting")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldPicOnline" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblSetting ADD FldPicOnline Text")
'		Sql1.Close
'		Initialize
'		Sql1.ExecNonQuery("Update TblSetting Set FldPicOnline='0'")
'	End If
'	
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblSetting")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldDaryaft" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblSetting ADD FldDaryaft Text")
'		Sql1.Close
'		Initialize
'		Sql1.ExecNonQuery("Update TblSetting Set FldDaryaft='0'")
'	End If
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblSetting")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldMojavezSefaresh" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblSetting ADD FldMojavezSefaresh Text")
'		Sql1.Close
'		Initialize
'		Sql1.ExecNonQuery("Update TblSetting Set FldMojavezSefaresh='0'")
'	End If
'	
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblSetting")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldEshantionTabaghati" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblSetting ADD FldEshantionTabaghati Text")
'		Sql1.Close
'		Initialize
'		Sql1.ExecNonQuery("Update TblSetting Set FldEshantionTabaghati='0'")
'	End If
'	
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblSetting")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldEshantionRemove" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblSetting ADD FldEshantionRemove Text")
'		Sql1.Close
'		Initialize
'		Sql1.ExecNonQuery("Update TblSetting Set FldEshantionRemove='0'")
'	End If
'	'FldEshantionGroup
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblSetting")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldEshantionGroup" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblSetting ADD FldEshantionGroup Text")
'		Sql1.Close
'		Initialize
'		Sql1.ExecNonQuery("Update TblSetting Set FldEshantionGroup='0'")
'	End If
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblSetting")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldGetDataOnline" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblSetting ADD FldGetDataOnline Text")
'		Sql1.Close
'		Initialize
'		Sql1.ExecNonQuery("Update TblSetting Set FldGetDataOnline='0'")
'	End If
'	
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblFaktor")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldTozih" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblFaktor ADD FldTozih Text")
'		Sql1.Close
'		Initialize
'	End If
'	
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblFaktor")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldVaziatPardakhti" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblFaktor ADD FldVaziatPardakhti varchar")
'		Sql1.Close
'		Initialize
'	End If
'	
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblFaktor")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldTozihat" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblFaktor ADD FldTozihat varchar")
'		Sql1.Close
'		Initialize
'	End If
'	
'	Check=0
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldMablaghMasrafKonande" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblFaktor ADD FldMablaghMasrafKonande Text")
'		Sql1.Close
'		Initialize
'	End If
'	Check=0
'	
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldType" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblFaktor ADD FldType Text")
'		Sql1.Close
'		Initialize
'	End If
'	
'	Check=0
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldC_Visitor" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblFaktor ADD FldC_Visitor Text")
'		Sql1.Close
'		Initialize
'	End If
'	
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblSetting")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldVersion" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblSetting ADD FldVersion Text")
'		Sql1.Close
'		Initialize
'	End If
'	
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblEnterExitVisitor")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldCode" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblEnterExitVisitor ADD FldCode Text")
'		Sql1.Close
'		Initialize
'	End If
'
''	Dim ver As String
'	Dim Cu As Cursor = Result("Select * From TblSetting")
'	Cu.Position=0
'	If OriginalListFaktor.IsInitialized=False Then
'		OriginalListFaktor.Initialize
'		OriginalListFaktor.Clear
'	End If
''	ver=Cu.GetString("FldVersion")
''	If ver<> Null Then
''		
''	If ver<Version Then
'''			'StopService(Service_Gps)
'''			StopService(FusedLocationService)
'''			
'''			Log("Gps Stop")
'''	
'''		'' update setting
'''		'SaveUpdate("update TblSetting Set FldVersion='"& Version &"'")
''''		Dim cn As Cursor= Result("select * from TblFaktor")
''''		If cn.RowCount>0 Then
''''			''save factors to temp
''''				For i=0 To cn.RowCount-1
''''				cn.Position=i			
''''				Dim Item As AdapterFaktor
''''					Item.FldId=cn.GetInt("FldId")
''''					Item.FldRadif=cn.GetString("FldRadif")
''''					Item.FldShomareFaktor=cn.GetInt("FldShomareFaktor")
''''					Item.FldVaziatPardakht=cn.GetString("FldVaziatPardakht")
''''					Item.FldC_Tafzili=cn.GetString("FldC_Tafzili")
''''					Item.FldN_Tafzili=cn.GetString("FldN_Tafzili")
''''					Item.FldCodeKala=cn.GetString("FldCodeKala")
''''					Item.FldNameKala=cn.GetString("FldNamekala")
''''					Item.FldFeeForoosh=cn.GetString("FldFeeForoosh")
''''					Item.FldTedadDarKarton=cn.GetString("FldTedadDarKarton")
''''					Item.FldTedadDarSabadJoz=cn.GetString("FldTedadDarSabadJoz")
''''					Item.FldTedadDarSabadKol=cn.GetString("FldTedadDarSabadKol")
''''					Item.FldTarikh=cn.GetString("FldTarikh")
''''					Item.FldLat=cn.GetString("FldLat")
''''					Item.FldLon=cn.GetString("FldLon")
''''					Item.FldSend=cn.GetInt("FldSend")
''''					Item.FldVaziatPardakhti=cn.GetString("FldVaziatPardakhti")
''''					Item.FldTozihat=cn.GetString("FldTozihat")
''''					Item.FldMablaghMasrafKonande=cn.GetString("FldMablaghMasrafKonande")
''''					OriginalListFaktor.Add(Item)
''''				Next
''''		End If
''''		''delete database files
''''		File.Delete(File.DirDefaultExternal & "/Parsik", "parsik_db.db")
''''		Initialize
''''		UpdateDataBase
'''			Sql1.ExecNonQuery("Update TblSetting Set FldVersion = '"& Version &"'")
'''	End If
'''	Else
'''		If OriginalListFaktor.Size >0 Then
'''			For i=0 To OriginalListFaktor.Size-1
'''				Dim Item = OriginalListFaktor.Get(i) As AdapterFaktor
'''				SaveUpdate("Insert into TblFaktor(FldId,FldRadif,FldShomareFaktor,FldVaziatPardakht,FldC_Tafzili,FldN_Tafzili,FldCodeKala,FldNamekala,FldFeeForoosh,FldTedadDarKarton,"& _ 
'''				"FldTedadDarSabadJoz,FldTedadDarSabadKol,FldTarikh,FldLat,FldLon,FldSend,FldVaziatPardakhti,FldTozihat,FldMablaghMasrafKonande) Values("& _
'''				Item.FldId &",'"& Item.FldRadif &"',"& Item.FldShomareFaktor &",'"& Item.FldVaziatPardakht &"','"& Item.FldC_Tafzili &"','"& Item.FldN_Tafzili &"','"& Item.FldCodeKala &"','"& Item.FldNameKala &"','"& Item.FldFeeForoosh &"','"& Item.FldTedadDarKarton &"','"& _
'''			    Item.FldTedadDarSabadJoz &"','"& Item.FldTedadDarSabadKol &"','"& Item.FldTarikh &"','"& Item.FldLat &"','"& Item.FldLon &"',"& Item.FldSend &",'"& Item.FldVaziatPardakhti &"','"& Item.FldTozihat &"','"& Item.FldMablaghMasrafKonande &"')")
'''			Next
'''			
''			Sql1.ExecNonQuery("Update TblSetting Set FldVersion = '"& Version &"'")
''		End If
'''		
''	
''	End If
'	
'	
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblSetting")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldNamayeshKalaSefr" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblSetting ADD FldNamayeshKalaSefr Text")
'		Sql1.Close
'		Initialize
'		Sql1.ExecNonQuery("Update TblSetting Set FldNamayeshKalaSefr = '1'")
'	End If
'	
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblSetting")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldPrinterType" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblSetting ADD FldPrinterType Integer")
'		Sql1.Close
'		Initialize
'		Sql1.ExecNonQuery("Update TblSetting Set FldPrinterType = 0")
'	End If
'	
'	Check=0
'	
'	Cur=Sql1.ExecQuery("Select * From TblSetting")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldHideMojodi" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblSetting ADD FldHideMojodi Text")
'		Sql1.Close
'		Initialize
'		Sql1.ExecNonQuery("Update TblSetting Set FldHideMojodi = '0'")
'	End If
'	
'	Check=0
'	
'	Cur=Sql1.ExecQuery("Select * From TblSetting")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldConnectionStatus" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblSetting ADD FldConnectionStatus Text")
'		Sql1.Close
'		Initialize
'		Sql1.ExecNonQuery("Update TblSetting Set FldConnectionStatus = '0'")
'	End If
'	
'	Check=0
'	
'	Cur=Sql1.ExecQuery("Select * From TblSetting")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldAdmin" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblSetting ADD FldAdmin Text")
'		Sql1.Close
'		Initialize
'		Sql1.ExecNonQuery("Update TblSetting Set FldAdmin='0'")
'	End If
'	
'	Check=0
'	
'	Cur=Sql1.ExecQuery("Select * From TblSetting")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldTozie" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblSetting ADD FldTozie Text")
'		Sql1.Close
'		Initialize
'		Sql1.ExecNonQuery("Update TblSetting Set FldTozie='0'")
'	End If
'	
'	Check=0
'	
'	Cur=Sql1.ExecQuery("Select * From TblSetting")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldVisitor" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblSetting ADD FldVisitor Text")
'		Sql1.Close
'		Initialize
'		Sql1.ExecNonQuery("Update TblSetting Set FldVisitor='0'")
'	End If
'	
'	Check=0
'	
'	Cur=Sql1.ExecQuery("Select * From TblSetting")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldLinkPicKala" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblSetting ADD FldLinkPicKala Text")
'		Sql1.Close
'		Initialize
'	End If
'	Check=0
'	
'	Cur=Sql1.ExecQuery("Select * From TblSetting")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldSendMarjoie" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblSetting ADD FldSendMarjoie Text")
'		Sql1.Close
'		Initialize
'		Sql1.ExecNonQuery("Update TblSetting Set FldSendMarjoie='0'")
'	End If
'	
'	Check=0
'	
'	Cur=Sql1.ExecQuery("Select * From TblSetting")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldMobileIsImportent" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblSetting ADD FldMobileIsImportent Text")
'		Sql1.Close
'		Initialize
'		Sql1.ExecNonQuery("Update TblSetting Set FldMobileIsImportent='0'")
'	End If
'	
'	Check=0
'	
'	
'	Cur=Sql1.ExecQuery("Select * From TblSetting")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldNameCompany" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblSetting ADD FldNameCompany Text")
'		Sql1.Close
'		Initialize
'		Sql1.ExecNonQuery("Update TblSetting Set FldNameCompany=''")
'	End If
'	
'	Check=0
'	
'	Cur=Sql1.ExecQuery("Select * From TblSetting")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldTellCompany" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblSetting ADD FldTellCompany Text")
'		Sql1.Close
'		Initialize
'		Sql1.ExecNonQuery("Update TblSetting Set FldTellCompany=''")
'	End If
'	
'	
'	Check=0
'	
'	Cur=Sql1.ExecQuery("Select * From TblSetting")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldAddressCompany" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblSetting ADD FldAddressCompany Text")
'		Sql1.Close
'		Initialize
'		Sql1.ExecNonQuery("Update TblSetting Set FldAddressCompany=''")
'	End If
'	
'	Check=0
'	
'	Cur=Sql1.ExecQuery("Select * From TblSetting")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldAmani" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblSetting ADD FldAmani Text")
'		Sql1.Close
'		Initialize
'		Sql1.ExecNonQuery("Update TblSetting Set FldAmani='0'")
'	End If
'	
'	
'	
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblSetting")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="fldNumberVersion" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblSetting ADD fldNumberVersion Text")
'		Sql1.ExecNonQuery("Alter Table TblSetting ADD fldDateVersion Text")
'		Sql1.ExecNonQuery("Alter Table TblSetting ADD fldLastVersion Text")
'		Sql1.ExecNonQuery("Alter Table TblSetting ADD fldTypeVersion Text")
'		Sql1.ExecNonQuery("Alter Table TblSetting ADD fldDateSetup Text")
'		Sql1.Close
'		Initialize
''		Sql1.ExecNonQuery("Update TblSetting Set fldNumberVersion='"&NumberVersion&"'")
''		Sql1.ExecNonQuery("Update TblSetting Set fldDateVersion='"& DateVersion.Replace("/","") &"'")
'		Cur=Sql1.ExecQuery("Select * From TblSetting")
'		Cur.Position=0
'		Log(Cur.GetString("FldVersion"))
'		Sql1.ExecNonQuery("Update TblSetting Set fldLastVersion='"&Cur.GetString("FldVersion")&"'")
''		Sql1.ExecNonQuery("Update TblSetting Set fldTypeVersion='"&TypeVersion&"'")
''		Sql1.ExecNonQuery("Update TblSetting Set fldDateSetup='"& GetDateNow &"'")
''		'send update info in Server
''		CallSubDelayed(Service_Server,"SaveVersionAndroidInfo")
'	End If
'	Cur=Sql1.ExecQuery("Select * From TblSetting")
'	Cur.Position=0
'	If IsNumber(Cur.GetString("FldC_Visitor")) Then
'		
'		If myCode.Is_Null_adad(Cur.GetString("fldNumberVersion"))<> NumberVersion Then
'			Log(Cur.GetString("fldLastVersion"))
'			Sql1.ExecNonQuery("Update TblSetting Set fldNumberVersion='"&NumberVersion&"'")
'			Sql1.ExecNonQuery("Update TblSetting Set fldDateVersion='"& DateVersion.Replace("/","") &"'")
'			Sql1.ExecNonQuery("Update TblSetting Set fldLastVersion='"&Cur.GetString("fldLastVersion")&"'")
'			Sql1.ExecNonQuery("Update TblSetting Set fldTypeVersion='"&TypeVersion&"'")
'			Sql1.ExecNonQuery("Update TblSetting Set fldDateSetup='"& GetDateNow &"'")
'		
'			'send update info in Server
'			CallSubDelayed(Service_Server,"SaveVersionAndroidInfo")
'		End If
'	End If
'
'	Check=0
'	
'	
'	Cur=Sql1.ExecQuery("Select * From TblSetting")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldCheckAdmin" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblSetting ADD FldCheckAdmin Text")
'		Sql1.Close
'		Initialize
'		Sql1.ExecNonQuery("Update TblSetting Set FldCheckAdmin='0'")
'	End If
'	Check=0
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblSabad")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldTozihat" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblSabad ADD FldTozihat varchar")
'		Sql1.Close
'		Initialize
'	End If
'	
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblSabad")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldVaziatPardakht" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblSabad ADD FldVaziatPardakht varchar")
'		Sql1.Close
'		Initialize
'	End If
'	
'	Check=0
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldMablaghMasrafKonande" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblSabad ADD FldMablaghMasrafKonande Text")
'		Sql1.Close
'		Initialize
'	End If
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblGpsVisitor")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldVaziat" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblGpsVisitor ADD FldVaziat Text")
'		Sql1.Close
'		Initialize
'	End If
'	
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblHavale")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="fldMande" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblHavale ADD fldMande Text")
'		Sql1.Close
'		Initialize
'	End If
'	
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblAshkhas")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldMobile" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblAshkhas ADD FldMobile Text")
'		Sql1.ExecNonQuery("Alter Table TblAshkhas ADD FldC_Meli Text")
'		Sql1.ExecNonQuery("Alter Table TblAshkhas ADD FldC_Posti Text")
'		Sql1.ExecNonQuery("Alter Table TblAshkhas ADD FldShomarehesab Text")
'		Sql1.ExecNonQuery("Alter Table TblAshkhas ADD FldLastVisit Text")
'		Sql1.ExecNonQuery("Alter Table TblAshkhas ADD FldLastSefaresh Text")
'		Sql1.ExecNonQuery("Alter Table TblAshkhas ADD FldVaziat Text")
'		Sql1.ExecNonQuery("Alter Table TblAshkhas ADD FldEtebar Text")
'		Sql1.ExecNonQuery("Alter Table TblAshkhas ADD lastSeen Text")
'		Sql1.ExecNonQuery("Alter Table TblAshkhas ADD lastOrderDate Text")
'		Sql1.Close
'		Initialize
'	End If
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblAshkhas")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="fldBlackList" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblAshkhas ADD fldBlackList Text")
'		Sql1.Close
'		Initialize
'	End If
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblAshkhas")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="fldSaghfeEtebar" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblAshkhas ADD fldSaghfeEtebar Text")
'		Sql1.Close
'		Initialize
'	End If
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblAshkhas")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="fldCodeMovaghat" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblAshkhas ADD fldCodeMovaghat Text")
'		Sql1.Close
'		Initialize
'	End If
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblKala")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="fldCodeGroup" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblKala ADD fldCodeGroup Text")
'		Sql1.Close
'		Initialize
'	End If
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblKala")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="fldPathPic" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblKala ADD fldPathPic Text")
'		Sql1.Close
'		Initialize
'	End If
'	
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblKala")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="fldPathPicOffline" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblKala ADD fldPathPicOffline Text")
'		Sql1.Close
'		Initialize
'	End If
'	
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblKala")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="fldFeeBadAzTakhfif" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblKala ADD fldFeeBadAzTakhfif Text")
'		Sql1.Close
'		Initialize
'	End If
'	
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblKala")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="fldSerial" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblKala ADD fldSerial Text")
'		Sql1.Close
'		Initialize
'	End If
'	
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblKala")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="fldSharh" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblKala ADD fldSharh Text")
'		Sql1.Close
'		Initialize
'	End If
'	
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblKala")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldMablaghTakhfif" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblKala ADD FldMablaghTakhfif Text")
'		Sql1.Close
'		Initialize
'	End If
'	
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblKala")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="fldFeeTasvie" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblKala ADD fldFeeTasvie Text")
'		Sql1.Close
'		Initialize
'	End If
'	
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblSabad")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldMablaghTakhfif" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblSabad ADD FldMablaghTakhfif Text")
'		Sql1.Close
'		Initialize
'	End If
'	
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblSabad")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldDarsadTakhfif" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblSabad ADD FldDarsadTakhfif Text")
'		Sql1.Close
'		Initialize
'	End If
'	
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblSabad")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldupdateFee" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblSabad ADD FldupdateFee Text")
'		Sql1.Close
'		Initialize
'	End If
'	
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblFaktor")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldMablaghTakhfif" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblFaktor ADD FldMablaghTakhfif Text")
'		Sql1.Close
'		Initialize
'	End If
'	
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblFaktor")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldDarsadTakhfif" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblFaktor ADD FldDarsadTakhfif Text")
'		Sql1.Close
'		Initialize
'		Sql1.ExecNonQuery("Update TblFaktor Set FldDarsadTakhfif='0'")
'	End If
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblFaktor")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldSumMablaghTakhfifVizhe" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblFaktor ADD FldSumMablaghTakhfifVizhe Text")
'		Sql1.Close
'		Initialize
'	End If
'	
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblFaktor")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldSumMablaghTakhfifKala" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblFaktor ADD FldSumMablaghTakhfifKala Text")
'		Sql1.Close
'		Initialize
'	End If
'	
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblSabad")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="fldFeeBadAzTakhfif" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblSabad ADD fldFeeBadAzTakhfif Text")
'		Sql1.Close
'		Initialize
'	End If
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblSabad")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="fldPathPic" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblSabad ADD fldPathPic Text")
'		Sql1.Close
'		Initialize
'	End If
'	
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblSabad")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="fldPathPicOffline" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblSabad ADD fldPathPicOffline Text")
'		Sql1.Close
'		Initialize
'	End If
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblSabad")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="fldSharh" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblSabad ADD fldSharh Text")
'		Sql1.Close
'		Initialize
'	End If
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblSabad")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldSumMande" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblSabad ADD FldSumMande Text")
'		Sql1.Close
'		Initialize
'	End If
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblSabad")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldEshantion" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblSabad ADD FldEshantion Text")
'		Sql1.Close
'		Initialize
'	End If
'	
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblSabad")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="fldCodeGroup" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblSabad ADD fldCodeGroup Text")
'		Sql1.Close
'		Initialize
'	End If
'	
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblSabad")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldAmani" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblSabad ADD FldAmani Text")
'		Sql1.Close
'		Initialize
'	End If
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblSabad")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="fldShomareForoosh" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblSabad ADD fldShomareForoosh Text")
'		Sql1.Close
'		Initialize
'	End If
'	Check=0
'	
'	Cur=Sql1.ExecQuery("Select * From TblFaktor")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldDate" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblFaktor ADD FldDate Text")
'		Sql1.Close
'		Initialize
'	End If
'	
'	Check=0	
'	Cur=Sql1.ExecQuery("Select * From TblFaktor")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldTime" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblFaktor ADD FldTime Text")
'		Sql1.Close
'		Initialize
'	End If
'	
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblFaktor")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldTotalFaktor" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblFaktor ADD FldTotalFaktor Text")
'		Sql1.Close
'		Initialize
'	End If
'	
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblFaktor")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldSumMande" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblFaktor ADD FldSumMande Text")
'		Sql1.Close
'		Initialize
'	End If
'	
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblFaktor")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldSync" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblFaktor ADD FldSync Text")
'		Sql1.Close
'		Initialize
'	End If
'	
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblFaktor")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="fldPathPicOffline" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblFaktor ADD fldPathPicOffline Text")
'		Sql1.Close
'		Initialize
'	End If
'	
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblFaktor")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="fldPathPic" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblFaktor ADD fldPathPic Text")
'		Sql1.Close
'		Initialize
'	End If
'	
'	Check=0
'	
'	Cur=Sql1.ExecQuery("Select * From TblFaktor")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldMablaghTakhfifKol" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblFaktor ADD FldMablaghTakhfifKol Text")
'		Sql1.Close
'		Initialize
'	End If
'	
'	Check=0
'	
'	Cur=Sql1.ExecQuery("Select * From TblFaktor")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldMablaghKol" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblFaktor ADD FldMablaghKol Text")
'		Sql1.Close
'		Initialize
'	End If
'	
'	Check=0
'	
'	Cur=Sql1.ExecQuery("Select * From TblFaktor")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="WIsBacked" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblFaktor ADD WIsBacked Text")
'		Sql1.Close
'		Initialize
'	End If
'	
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblFaktor")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="WSendFrom" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblFaktor ADD WSendFrom Text")
'		Sql1.Close
'		Initialize
'	End If
'	
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblFaktor")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldAmani" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblFaktor ADD FldAmani Text")
'		Sql1.Close
'		Initialize
'		Sql1.ExecNonQuery("Update TblFaktor Set FldAmani='0'")
'	End If
'	
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblFaktor")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="fldShomareFactorReal" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblFaktor ADD fldShomareFactorReal Text")
'		Sql1.Close
'		Initialize
'		Sql1.ExecNonQuery("Update TblFaktor Set fldShomareFactorReal='0'")
'	End If
'	
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblFaktor")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldSignatureBitmapString" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblFaktor ADD FldSignatureBitmapString Text")
'		Sql1.Close
'		Initialize
'	End If
'	
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblFaktor")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="fldFeeBadAzTakhfif" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblFaktor ADD fldFeeBadAzTakhfif Text")
'		Sql1.Close
'		Initialize
'	End If
'	
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblFaktor")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldNameVahed" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblFaktor ADD FldNameVahed Text")
'		Sql1.Close
'		Initialize
'	End If
'	
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblFaktor")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldNameVahed2" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblFaktor ADD FldNameVahed2 Text")
'		Sql1.Close
'		Initialize
'	End If
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblFaktor")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="fldShomareForoosh" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblFaktor ADD fldShomareForoosh Text")
'		Sql1.Close
'		Initialize
'		Sql1.ExecNonQuery("Update TblFaktor Set fldShomareForoosh='0'")
'	End If
'	
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblFaktor")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldShomareBargasht" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblFaktor ADD FldShomareBargasht Text")
'		Sql1.Close
'		Initialize
'	End If
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblAshkhasNew")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldCodeGroup" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblAshkhasNew ADD FldCodeGroup Text")
'		Sql1.Close
'		Initialize
'	End If
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblAshkhasNew")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldC_Meli" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblAshkhasNew ADD FldC_Meli Text")
'		Sql1.Close
'		Initialize
'	End If
'	Check=0
'	
'	Cur=Sql1.ExecQuery("Select * From TblAshkhasNew")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldC_Posti" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblAshkhasNew ADD FldC_Posti Text")
'		Sql1.Close
'		Initialize
'	End If
'	Check=0
'	Cur=Sql1.ExecQuery("Select * From TblAshkhasNew")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldMobile" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblAshkhasNew ADD FldMobile Text")
'		Sql1.Close
'		Initialize
'	End If
'	Check=0
'	
'	Cur=Sql1.ExecQuery("Select * From TblAshkhasNew")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldLat" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblAshkhasNew ADD FldLat Text")
'		Sql1.Close
'		Initialize
'	End If
'	Check=0
'	
'	Cur=Sql1.ExecQuery("Select * From TblAshkhasNew")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldLon" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblAshkhasNew ADD FldLon Text")
'		Sql1.Close
'		Initialize
'	End If
'	Check=0
'	
'	Cur=Sql1.ExecQuery("Select * From TblAshkhasNew")
'	For i=0 To Cur.ColumnCount-1
'		If  Cur.GetColumnName(i)="FldShomarehesab" Then
'			Check=1
'			Exit
'		End If
'	Next
'	If Check=0 Then
'		Sql1.ExecNonQuery("Alter Table TblAshkhasNew ADD FldShomarehesab Text")
'		Sql1.Close
'		Initialize
'	End If
'	Sql1.ExecNonQuery("Update TblSetting Set FldVersion = '"& Version &"'")
'	SaveUpdate("Update TblSetting Set FldUrl = 'zomorodonline.ir'")
'	Initialize
End Sub

Sub DtToJson(Cu As Cursor) As String
	Dim Olgoo As String
	Dim RowOlgoo As String
	Dim Str As String
	For i=0 To Cu.ColumnCount-1
		Olgoo=Olgoo & Chr(34) & Cu.GetColumnName(i) & Chr(34) & ":" & Chr(34) & Cu.GetColumnName(i) & i & Chr(34) & ","
	Next
	Olgoo=Sf.Left(Olgoo,Olgoo.Length-1)
	Olgoo = "{" & Olgoo & "}" & ","
	For i=0 To Cu.RowCount -1
		Cu.Position=i
		RowOlgoo=Olgoo
		For j=0 To Cu.ColumnCount-1
			Log(Cu.GetColumnName(j)& j)
			
			If (Cu.GetString2(j)<>Null) Then
				RowOlgoo = RowOlgoo.Replace(Cu.GetColumnName(j) & j,Cu.GetString2(j))
			End If
		Next
		Str=Str & RowOlgoo
	Next
	Str=Sf.Left(Str,Str.Length-1)
	Str="[" & Str & "]"
	Return Str
End Sub




Sub SetAnimation(InAnimation As String,OutAnimation As String)
	Dim R As Reflector
	Dim Package As String
	Dim In , Out As Int
	Package=R.GetStaticFielD("anywheresoftware.b4a.BA","packageName")
	In=R.GetStaticField(Package & ".R$anim",InAnimation)
	Out=R.GetStaticField(Package & ".R$anim",OutAnimation)
	R.Target=R.GetActivity
	R.RunMethod4("overridePendingTransition",Array As Object(In,Out),Array As String("java.lang.int","java.lang.int"))
End Sub

Sub AnimationOpen(View As Object)
	Dim Ani As Animation
	Ani.InitializeScaleCenter("", 0,0,1,1, View)
	Ani.Duration = 300
	Ani.Start(View)
End Sub

Sub AnimationClose(View As Object)
	Dim Ani As Animation
	Ani.InitializeScaleCenter("", 1,1,0,0, View)
	Ani.Duration = 300
	Ani.Start(View)
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
Sub DatePersian2 As String
	Dim T() As String
	T = Regex.Split("/",PersianDate.getDate(0,0,0,"/"))
	If T(1).Length=1 Then
		T(1)="0"&T(1)
	End If
	If T(2).Length=1 Then
		T(2)="0"&T(2)
	End If
	Return T(1)&T(2)
End Sub
Sub PersianDateDash(str As String) As String
	Dim T1,T2,T3 As String
	Log(str.Length)
	T1=str.SubString2(0,4) '13981120
	T2=str.SubString2(4,6)'11
	T3=str.SubString2(6,8)'20
	If T2.Length=1 Then
		T2="0"&T2
	End If
	If T3.Length=1 Then
		T3="0"&T3
	End If
	Return T1&"/"&T2&"/"&T3
	
End Sub
Sub DateMiladi As String
	Dim T() As String
	T = Regex.Split("/",DateTime.Date(DateTime.Now))
	If T(0).Length=1 Then
		T(0)="0"&T(0)
	End If
	If T(1).Length=1 Then
		T(1)="0"&T(0)
	End If
	Return T(2)&T(1)&T(0)
End Sub

Sub  ConvertNumbersPersian2English(sNumber As String) As String  
	Dim PNumbers(10) As String
	Dim ENumbers(10) As String
	Dim res As String

	PNumbers(0) = "۰"
	PNumbers(1) = "۱"
	PNumbers(2) = "۲"
	PNumbers(3) = "۳"
	PNumbers(4) = "۴"
	PNumbers(5) = "۵"
	PNumbers(6) = "۶"
	PNumbers(7) = "۷"
	PNumbers(8) = "۸"
	PNumbers(9) = "۹"	

	ENumbers(0) = "0"
	ENumbers(1) = "1"
	ENumbers(2) = "2"
	ENumbers(3) = "3"
	ENumbers(4) = "4"
	ENumbers(5) = "5"
	ENumbers(6) = "6"
	ENumbers(7) = "7"
	ENumbers(8) = "8"
	ENumbers(9) = "9"
	
	For i = 0 To sNumber.Length - 1
		For j=0 To 9
			If sNumber.SubString2(i,i+1) = PNumbers(j) Then
				res = res & ENumbers(j)
			Else if sNumber.SubString2(i,i+1) = ENumbers(j) Then
				res = res & ENumbers(j)
			End If
		Next
	Next
	Return res
End Sub

Sub ConvertStrToInt(str As String) As Int
	Dim i As Int
	i=Sf.Val(str)
	Return i
End Sub

Sub qomaAshar(str As Object) As String
	Dim d As String
	Dim doub As Double
	If str <>"" Then
		doub=str
		d=NumberFormat(doub,0,0)
	End If
	
	Return d
End Sub

Sub RemoveqomaAshar(S As String) As Int
	Dim Num As Int
	S=s.Replace(",","")
	Num=S
	Return Num
End Sub

public Sub CountPushSmsNotOpen As Int
	Dim cu As Cursor
	cu=Result("select Id From TblNotifi where FldStatus='0'")
	Return	cu.RowCount
End Sub

Sub Printer	
	BtAdmin.Initialize("BlueTooth")
	BTConnection.Initialize("Printer")
	If BTConnection.IsEnabled=True Then
	Dim PairedDevices As Map
	PairedDevices = BTConnection.GetPairedDevices
	Dim l As List
	Dim DeviceName, MacAddress As String
	l.Initialize
	For i = 0 To PairedDevices.Size - 1 'Check all devices
		l.Add(PairedDevices.GetKeyAt(i))
		DeviceName=PairedDevices.Getkeyat(i)
		MacAddress=PairedDevices.GetValueAt(i)
		Log(DeviceName & " -> " & MacAddress)
			If DeviceName.Contains("Thermal") Then 'Insert the BT-Name of the printer or use the MAC address
				Exit
			End If
	Next
	BTConnection.Connect(MacAddress)
	Else
		ToastMessageShow("بلوتوث گوشی شما غیر فعال می باشد",False)
	
	End If
End Sub


Sub GetDeviceId As String
	
	Dim P1 As Phone
	Dim id As String
	Dim r As Reflector
	Dim Api As Int
	Dim pID As PhoneId

	'id = pID.GetDeviceId
	Api = r.GetStaticField("android.os.Build$VERSION", "SDK_INT")
	'id=""
	'Api=26
	Log("api: "& Api)
	If Api < 28 Then
		'Old devices
		id = pID.GetDeviceId
		
	Else
		'New devices
		id= r.GetStaticField("android.os.Build", "SERIAL")
		If id.ToLowerCase = "unknown" Then
			id= P1.GetSettings("android_id")
		End If
	   
		If id.ToLowerCase = "9774d56d682e549c" Or id = Null Then id = P1.GetSettings("android_id")
	End If

'	If id=Null Or id="" Then
'		id= P1.GetSettings("android_id")
'	End If
'	id="c29822dab80b5d20 "
	Return id
End Sub

Sub GetApiVersion As Int
	Dim r As Reflector
	Dim Api As Int
	Api = r.GetStaticField("android.os.Build$VERSION", "SDK_INT")
	Return Api
End Sub

Sub ConvertiPdfImg(dirFile As String,namefile As String) As Bitmap
	Dim Render As PDFRenderer
	Dim img As Bitmap
	'Render.Initialize("",Main.pthDOC,nomefile)
	Render.Initialize("",dirFile,namefile)
	For i = 0 To Render.PageCount-1
		img = Render.renderPageforDisplay(i)
		' now save img in a file
	Next
    
	Return img

End Sub
Sub MiladiToShamsiDate(str As String) As String
	Dim T1,T2,T3 As String
	Dim pcd As PersianDate
	Log(str.Length)
	T1=str.SubString2(0,4) '13981120
	T2=str.SubString2(4,6)'11
	T3=str.SubString2(6,8)'20
	If T2.Length=1 Then
		T2="0"&T2
	End If
	If T3.Length=1 Then
		T3="0"&T3
	End If
	Return pcd.getDate(T1,T2,T3,"/")
End Sub
Sub GetDateNow() As String
	Dim pcd As PersianDate
'	Dim now As Long
	Dim DateShamsi As String
	Dim YearM,MonthM,DayM As Int
	YearM = DateTime.GetYear(DateTime.Now)
	MonthM = DateTime.GetMonth(DateTime.Now)
	DayM = DateTime.GetDayOfMonth(DateTime.Now)
	DateShamsi=pcd.getDate(YearM,MonthM,DayM,"0")
	'0123456789
	'1399/11/11
	'1399/11/1
	'1399/8/8
'	Dim year,month,day As String
'	Dim count As Int = DateShamsi.Length
'	Dim s(count) As String
'	For i=0 To count-1
'		s(i)=DateShamsi.SubString2(i,1)
'	Next
'	
'	year=DateShamsi.SubString2(0,4)
'	If count=10 Then
'		month=DateShamsi.SubString2(5,2)
'		day=DateShamsi.SubString2(8,2)
'	End If
'	If count=9 Then
'		month=DateShamsi.SubString2(5,1)
'		day=DateShamsi.SubString2(5,1)
'	End If
'	If count=8 Then
'		month=DateShamsi.SubString2(5,1)
'		day=DateShamsi.SubString2(5,1)
'	End If

	
	Log(DateShamsi)
	Return DateShamsi
End Sub

Sub check_internet As Boolean
	Dim ph As Phone
	Dim connected As Boolean
	ph.GetDataState
	If ph.GetDataState="CONNECTED" Then
		connected=True
	Else If ph.GetSettings("wifi_on")=1 Then
		connected=False
	End If
	Return connected
End Sub

Sub AddToSabad( Item  As AdapterListKala)
	If Item.TedadDarSabadJoz > 0 Or Item.TedadDarSabadKol > 0 Or Item.FldEshantion>0 Then
		'Dim TakhfifVizhe As Long = Item.FeeForoosh*(Item.TedadDarSabadJoz + (Item.TedadDarSabadKol*Item.TedadDarKarton))
		SaveUpdate("Insert Into TblSabad (FldCodeKala,fldCodeGroup,FldNameKala,FldTedadDarkarton,FldFeeForoosh,fldFeeBadAzTakhfif,FldTedadDarSabadJoz,FldTedadDarSabadKol,FldNameVahed,FldNameVahed2,FldTozihat,FldMablaghMasrafKonande,fldPathPic,FldSumMande,FldEshantion,FldMablaghTakhfif,FldDarsadTakhfif,fldArzeshAfzode,fldDarsadArzeshAfzode) Values ('"& _
			 Item.CodeKala &"','"& Item.CodeGroup &"','"& Item.NameKala &"','"& Item.TedadDarKarton &"','"& Item.FeeForoosh &"','"& Item.FldFeeBadAzTakhfif &"','"& _
			   Item.TedadDarSabadJoz &"','"& Item.TedadDarSabadKol &"','"& Item.NameVahed &"','"& Item.NameVahed2 &"','"& Item.Tozihat &"','"& Item.FldMablaghMasrafKonande &"','"& Item.fldPathPic &"','"& Item.SumMande &"','"& Item.FldEshantion &"','"& Item.MablaghTakhfif &"','"& Item.fldDarsadTakhfif &"','"& Item.fldArzeshAfzodeKala &"','"& Item.fldDarsadArzeshAfzodeKala &"')") 
	End If
End Sub

Sub CreateReportFaktor(Faktor As AdapterListFaktor) As ResumableSub
	Dim Tfaktor As FinalFaktor_
	Tfaktor.date=Faktor.fldDate
'	Dim NameMoshtari As String = Faktor.C_Name

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

'	Tfaktor.TakhfifRiali = Faktor.FldTakhfifRiali
	Tfaktor.KhamFaktor   = Faktor.fldTotalFaktor + Faktor.FldTakhfifVizhe + Faktor.FldTakhfifKala
	
	Dim Takhfif As String
	Dim Cu2 As Cursor= Result("SELECT Sum((FldFeeForoosh - fldFeeBadAzTakhfif) * ((FldTedadDarSabadKol*FldTedadDarKarton) + FldTedadDarSabadJoz)) as SumTakhfif FROM TblSabad Where Cast(fldFeeBadAzTakhfif AS Int) > 0 ")
	Cu2.Position = 0
	If Cu2.GetString("SumTakhfif") <> Null Then
		Takhfif = Cu2.GetString("SumTakhfif")
	Else
		Takhfif = 0
	End If
	Tfaktor.TakhfifKala = Takhfif
	Log("تخفیف کالا : " & Takhfif)
	
	Dim TakhfifVizhe As String
	Dim Cu3 As Cursor= Result("SELECT Sum((FldMablaghTakhfif) * ((FldTedadDarSabadKol*FldTedadDarKarton) + FldTedadDarSabadJoz))  as SumTakhfifVizhe FROM TblSabad Where Cast(FldMablaghTakhfif AS Int) > 0 ")
	Cu3.Position = 0
	If Cu3.GetString("SumTakhfifVizhe") <> Null Then
		TakhfifVizhe = Cu3.GetString("SumTakhfifVizhe")
	Else
		TakhfifVizhe = 0
	End If
	Tfaktor.TakhfifVizhe = TakhfifVizhe
	Log("تخفیف ویژه : " & TakhfifVizhe)
	'Tfaktor.TakhfifVizhe   = Faktor.FldTakhfifVizhe
'	Tfaktor.TakhfifKala   = Faktor.FldTakhfifKala
'
'	
'	Log("تخفیف کالا : " & Tfaktor.TakhfifKala)
	Log("تخفیف ویژه : " & Tfaktor.TakhfifVizhe)


	Tfaktor.GablePardakht = Tfaktor.KhamFaktor - Tfaktor.TakhfifKala - Tfaktor.TakhfifVizhe
	
	Dim Sood As Long = (Tfaktor.GablePardakht)*(DarsadSood/100)
	Log("سود ویزیتور : " & Sood)
	Tfaktor.SoodVisitor = Sood
	Return Tfaktor
End Sub

Sub CreateReportSabad
	Dim Tfaktor As FinalFaktor_
	Dim Cu As Cursor = Result("Select * From TblSabad")
	Cu.Position=0
	If Cu.RowCount=0 Then Return

	Dim RowCount As Int=Cu.RowCount
	Dim Mablagh As Long
	Dim tedadKol As String
	Log(Cu.GetString("FldFeeForoosh"))
	Log(Cu.GetString("FldMablaghTakhfif"))
	Log(Cu.GetString("FldDarsadTakhfif"))
	Log(Cu.GetString("FldEshantion"))

	Dim MablaghKolFaktor As Long = 0

'	Dim takhfifRialiKol As Long = 0
	For i=0 To RowCount -1
		Cu.Position=i
		Mablagh = Cu.GetString("FldFeeForoosh") * (Cu.GetString("FldTedadDarSabadJoz")+(Cu.GetString("FldTedadDarSabadKol")*Cu.GetString("FldTedadDarKarton")))
		'takhfifRialiKol = takhfifRialiKol + Cu.GetString("FldTakhfifRiali")
		tedadKol=(Cu.GetString("FldTedadDarSabadJoz")+(Cu.GetString("FldTedadDarSabadKol")*Cu.GetString("FldTedadDarKarton")))
		MablaghKolFaktor = MablaghKolFaktor + Mablagh
		
	Next
	 'Tfaktor.TakhfifRiali = takhfifRialiKol
	Tfaktor.KhamFaktor   = MablaghKolFaktor
	Tfaktor.date=""
	
	Dim Takhfif As String
	Takhfif= SingleResult("SELECT Sum((FldFeeForoosh - fldFeeBadAzTakhfif) * ((FldTedadDarSabadKol*FldTedadDarKarton) + FldTedadDarSabadJoz)) as TakhfifKala FROM TblSabad Where Cast(FldMablaghTakhfif AS Int) = 0 and  Cast(fldFeeBadAzTakhfif AS Int) > 0 ")
	Takhfif= myCode.Is_Null_adad(Takhfif)
	Tfaktor.TakhfifKala = Takhfif
	Log("تخفیف کالا : " & Takhfif)
	
	Dim TakhfifVizhe As String
	
	TakhfifVizhe= SingleResult("SELECT Sum((FldMablaghTakhfif)) as SumTakhfifVizhe FROM TblSabad Where Cast(FldMablaghTakhfif AS Int) > 0   ")

	TakhfifVizhe= myCode.Is_Null_adad(TakhfifVizhe)

	Tfaktor.TakhfifVizhe = TakhfifVizhe
	Log("تخفیف ویژه : " & TakhfifVizhe)
	
	Tfaktor.TakhfifKol=Takhfif+TakhfifVizhe
	
	
	'محاسبه تخفیفات
	Tfaktor.GablePardakht = MablaghKolFaktor - Tfaktor.TakhfifKol '- Tfaktor.TakhfifRiali
	If Tfaktor.TakhfifKol>0 Then
		Tfaktor.SumKolBadazTahkfif=Tfaktor.GablePardakht
		Else
		Tfaktor.SumKolBadazTahkfif=0
	End If
	Dim MablaghArzeshAfzode As Long = 0
	If ArzeshAfzodeEnable=1 Then
		'ارزش افزوده
		 MablaghArzeshAfzode = SingleResult("SELECT Sum((fldArzeshAfzode)) FROM TblSabad ")
		Tfaktor.fldArzeshAfzode=MablaghArzeshAfzode
		Tfaktor.GablePardakht=Tfaktor.GablePardakht+MablaghArzeshAfzode
		
'		For i=0 To RowCount -1
'			Cu.Position=i
'			Mablagh = Cu.GetString("FldFeeForoosh") * (Cu.GetString("FldTedadDarSabadJoz")+(Cu.GetString("FldTedadDarSabadKol")*Cu.GetString("FldTedadDarKarton")))
'			'takhfifRialiKol = takhfifRialiKol + Cu.GetString("FldTakhfifRiali")
'			tedadKol=(Cu.GetString("FldTedadDarSabadJoz")+(Cu.GetString("FldTedadDarSabadKol")*Cu.GetString("FldTedadDarKarton")))
'			MablaghKolFaktor = MablaghKolFaktor + Mablagh
'		Next
		'SaveUpdate($"Update TblSabad Set fldArzeshAfzode='${MablaghArzeshAfzode}',fldDarsadArzeshAfzode='${ArzeshAfzode}'"$)
	Else
		Tfaktor.fldArzeshAfzode=0
		SaveUpdate($"Update TblSabad Set fldArzeshAfzode='0',fldDarsadArzeshAfzode='0'"$)
	End If
	

	
'	Dim Sood As Long = (Tfaktor.GablePardakht)*(DarsadSood/100)
'	Log("سود ویزیتور : " & Sood)
'	Tfaktor.SoodVisitor = Sood
	
	FinalFaktor=Tfaktor
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

'Public Sub LoadEshantion(CodeKala As String) As AdapterListEshantion
'	Dim item As AdapterListEshantion
'	Dim cu As Cursor=Result("select * from tblEshantionTabaghati where fldCodeKala="&CodeKala)
'	If	cu.RowCount>0 Then
'		For i=0 To cu.RowCount-1
'			cu.Position=i
'			item.ID=cu.GetString("ID")
'			item.fldCodeKalaForoosh=cu.GetString("fldCodeKalaForoosh")
'			item.fldTedadForoosh=cu.GetString("fldTedadForoosh")
'			item.fldTedadEshantion=cu.GetString("fldTedadEshantion")
'			item.fldCodeKalaEshantion=cu.GetString("fldCodeKalaEshantion")
'			item.fldShomareTabaghe=cu.GetString("fldShomareTabaghe")
'		Next
'		Return item
'	End If
'	Return Null
'End Sub

Public Sub LoadEshantionGroup(CodeGroup As String) As List
	Dim lst As List
	lst.Initialize
	Dim cu As Cursor=Result("select * from tblEshantionGroup where fldCodeGroupKala="&CodeGroup)
	If	cu.RowCount>0 Then
		For i=0 To cu.RowCount-1
			cu.Position=i
			Dim item As AdapterListEshantionGroup
			item.ID=cu.GetString("ID")
			item.fldCodeGroupKala=cu.GetString("fldCodeGroupKala")
			item.fldTedadForoosh=cu.GetString("fldTedadForoosh")
			item.fldTedadEshantion=cu.GetString("fldTedadEshantion")
			item.fldCodeGroupKalaEshantion=cu.GetString("fldCodeGroupKalaEshantion")
			item.fldShomareTabaghe=cu.GetString("fldShomareTabaghe")
			lst.Add(item)
		Next
		Return lst
	End If
	Return Null
End Sub

Public Sub LoadEshantionTabaghati(CodeKala As String) As List
	Dim lst As List
	lst.Initialize
	Dim cu As Cursor=Result("select * from tblEshantionTabaghati where fldCodeKalaForoosh="&CodeKala)
	If	cu.RowCount>0 Then
		For i=0 To cu.RowCount-1
			cu.Position=i
			Dim item As AdapterListEshantion
			item.ID=cu.GetString("ID")
			item.fldCodeKalaForoosh=cu.GetString("fldCodeKalaForoosh")
			item.fldTedadForoosh=cu.GetString("fldTedadForoosh")
			item.fldTedadEshantion=cu.GetString("fldTedadEshantion")
			item.fldCodeKalaEshantion=cu.GetString("fldCodeKalaEshantion")
			item.fldShomareTabaghe=cu.GetString("fldShomareTabaghe")
			lst.Add(item)
		Next
		Return lst
	End If
	Return Null
End Sub

Public Sub CheckEshantion(CodeKala As String) As Boolean
	If EshantionTabaghati=1 Then
	Dim cu As Cursor=Result("select * from tblEshantionTabaghati where fldCodeKalaForoosh="&CodeKala)
	If cu.RowCount>0 Then
		Return True
	End If
	End If

	Return False
End Sub

Public Sub CheckEshantionGroup(CodeGroupKala As String) As Boolean
	If EshantionGroup=1 Then
		Dim cu As Cursor=Result("select * from tblEshantionGroup where fldCodeGroupKala="&CodeGroupKala)
	If cu.RowCount>0 Then
		Return True
	End If
	End If

	Return False
End Sub

Public Sub GetNahvieTasfie(fldCode As String) As String
	Return SingleResult("select FldName from TblTasvie where FldCode="&fldCode)
End Sub

Public Sub SendError(Text As String)
	'Text.SubString2(0,Text.IndexOf("at"))
	
	Log(Text)
	'Msgbox(Text,"")
End Sub

Public Sub GetPicKala(CodeKala As String) As Bitmap
	If File.Exists(File.DirDefaultExternal &"/parsik/AksKala",CodeKala & ".jpg")=False Then
		'Item.fldPathPic = File.Combine(File.DirAssets,"ICON.png")
		Dim bmp As Bitmap
		bmp.InitializeSample(File.DirAssets,"icon.png",2800dip,2800dip)
		If RotatePic Then
			Return bmp.Rotate(180)
		Else
			Return bmp
		End If
		
	Else
		'Item.fldPathPic = File.Combine(File.DirDefaultExternal &"/parsik/AksKala",Item.CodeKala & ".jpg")
		Dim bmp As Bitmap
		bmp.InitializeSample(File.DirDefaultExternal &"/parsik/AksKala",CodeKala & ".jpg",2800dip,2800dip)
		If RotatePic Then
			Return bmp.Rotate(180)
		Else
			Return bmp
		End If
	End If
End Sub

Public Sub GetListGalleryKala(CodeKala As String) As List
	Dim lst As List
	lst.Initialize
	If File.Exists(File.DirDefaultExternal &"/parsik/GalleryKala",CodeKala)=True Then
		lst=File.ListFiles(File.Combine(File.DirDefaultExternal &"/parsik/GalleryKala",CodeKala))
		If lst.Size>0 Then
				Return lst
			Else
			Return lst
		End If
	Else	
		Return lst
	End If
End Sub



Public Sub UpdateListPicKala
	Dim lst As List
	lst.Initialize
	lst=File.ListFiles(File.Combine(File.DirDefaultExternal &"/parsik","AksKala"))
	
	For	i=0 To lst.Size-1
		Dim filename As String=lst.Get(i)
		Dim fldPathPic As String=SingleResult("select fldPathPic from TblKala where fldCodeKala="&filename.Replace(".jpg",""))
	
		If fldPathPic = "0" Or fldPathPic = Null  Then
			SaveUpdate("Update TblKala Set fldPathPicOffline='"& filename &"' where fldCodeKala="&filename.Replace(".jpg",""))
		End If
	
	Next
	
End Sub


Public Sub GetPicKalaPath(CodeKala As String) As String
	If File.Exists(File.DirDefaultExternal &"/parsik/AksKala",CodeKala & ".jpg")=False Then
		'Item.fldPathPic = File.Combine(File.DirAssets,"ICON.png")
		Return File.Combine(File.DirAssets,"icon.png")
	Else
		'Item.fldPathPic = File.Combine(File.DirDefaultExternal &"/parsik/AksKala",Item.CodeKala & ".jpg")
		Return File.Combine(File.DirDefaultExternal &"/parsik/AksKala",CodeKala & ".jpg")
	End If
End Sub

Public Sub SaveJsonFile(fileRoot As String,filename As String,data As List) As Boolean
	Dim b As Boolean=False
	Try
		If File.Exists(fileRoot,filename)=False Then
			File.MakeDir(fileRoot,filename)
		End If
		Dim JSONGenerator As JSONGenerator
		JSONGenerator.Initialize2(data)
		File.WriteString(fileRoot,filename,JSONGenerator.ToPrettyString(2))
		b=True
	Catch
		Log(LastException)
		b=False
	End Try
	Return b
End Sub
'Sub CheckConnection As Boolean
'	Dim p1 As Phone
'    
'	If (p1.GetDataState == "CONNECTED") Then
'		Return True
'	End If
'        
'	If (p1.GetSettings ("wifi_on") == 1) Then
'		Return True
'	End If
'	
'	If (p1.GetSettings ("MOBILE_on") == 1) Then
'		Return True
'	End If
'    
'	If (p1.GetDataState == "DISCONNECTED") Then
'		Return False
'	End If
'    
'	If (p1.GetDataState == "SUSPENDED") Then
'		Return False
'	End If
'End Sub

Sub IsConnected As Boolean
	Dim P1 As Phone
	Dim server As ServerSocket'Add a reference to the network library  'Check status: DISCONNECTED 0
	Try
'		server.Initialize(0, "")
'		Log("mobile data state: " & P1.GetDataState & " wifi_on: " & P1.GetSettings("wifi_on") & " server ip: " & server.GetMyIP & CRLF &  "wifi ip: " & server.GetMyWifiIP)
'		If server.GetMyIP = "127.0.0.1" Then Return False  'this is the local host address
'		If Not(P1.GetDataState.EqualsIgnoreCase("CONNECTED")) And server.GetMyWifiIP = "127.0.0.1" Then Return False
		Return True
	Catch
		Return False
	End Try
End Sub

Sub ConvertNumToTime(Time As String) As String
	'0123
	'1401
	Dim HH As String=Time.SubString2(0,2)
	Dim MM As String=Time.SubString2(2,4)
	Log(Time.SubString2(0,2))
	Log(Time.SubString2(2,4))
	
	Return HH & ":" & MM
End Sub
Sub ConvertNumToTime2(HH As String,MM As String) As String
	'0123
	'1401
'	Dim HH As String=Time.SubString2(0,2)
'	Dim MM As String=Time.SubString2(2,4)
'	Log(Time.SubString2(0,2))
'	Log(Time.SubString2(2,4))
	If HH.Length=1 Then
		HH="0"&HH
	End If
	If MM.Length=1 Then
		MM="0"&MM
	End If
	Return HH & ":" & MM
End Sub
Sub GetMablaghFee(fldCodeTasvie As String,fldCodeKala As String) As Int
	Dim fee As Int=0
	Dim cu As Cursor
	cu=Result("select FldFee from TblFee where FldCodeTasvie=" & fldCodeTasvie &" and FldCodeKala="&fldCodeKala)
	If cu.RowCount>0 Then
		fee=SingleResult("select FldFee from TblFee where FldCodeTasvie=" & fldCodeTasvie &" and FldCodeKala="&fldCodeKala)
	End If
	cu.Close
	Return fee
End Sub

Sub UpdateFeeOffline
	If feeCode>0 Then
		Dim cu As Cursor
		cu=Result("select * from TblFee where FldCodeTasvie=" & feeCode)
		If cu.RowCount>0 Then
			For i=0 To cu.RowCount-1
				cu.Position=i
				Log("FldCodeKala:"& cu.GetString("FldCodeKala"))
				Log("fldFeeTasvie:"& cu.GetString("FldFee"))
				SaveUpdate("Update TblKala Set fldFeeTasvie='"&cu.GetString("FldFee")&"'"& _
			" where fldCodeKala="& cu.GetString("FldCodeKala"))
			Next			
		End If
	End If
End Sub

Sub LoadAcSpNoeTasvie As List
	Try
	Dim ListTasvie As List
	ListTasvie.Initialize
	Dim Cu As Cursor = Result("Select * From TblTasvie")
	Dim SomeArray(Cu.RowCount+1) As String
	SomeArray(0)="انتخاب کنید"
	If Cu.RowCount>0 Then
		For i = 0 To Cu.RowCount-1
			Cu.Position=i
			Dim Item As AdapterListNoeTasvie
			Item.FldC_Tasvie=Cu.GetString("FldCode")
			Item.FldN_Tasvie=Cu.GetString("FldName")
			ListTasvie.Add(Item)
'			AcSpTasvie.Add(Item.FldN_Tasvie)
			SomeArray(i+1)=Cu.GetString("FldName")		
		Next
		ArrayTasvieForKala=SomeArray
	End If
	Return ListTasvie
'	NiceSpinner.Show(Colors.blue, 16)
	Catch
		Log(LastException)
	End Try
End Sub

Sub UpdateNoeTasvieDarSabad(Index As Int,Item As AdapterListKala)

	Dim fee As Int
	Dim FeeForoosh As Int
	Dim FeeBadAzTakhfif As Int
	Dim DarsadTakhfif As Int
	Dim Cu1 As Cursor
	If Item<>Null Then
		Cu1= Result("Select * From TblSabad where FldCodeKala="&Item.CodeKala)
		Else
		Cu1= Result("Select * From TblSabad")
	End If
	 
	LogColor(Cu1.RowCount,Colors.Red)
	If Cu1.RowCount>0 Then
		Dim ItemTasvie As AdapterListNoeTasvie
		Dim MablaghTakhfif As Int=0
		ItemTasvie.Initialize
		ItemTasvie=LoadAcSpNoeTasvie.Get(Index)
		For i=0 To Cu1.RowCount-1
			Cu1.Position=i
			Dim cu As Cursor=Result("Select * from TblKala where FldCodeKala="&Cu1.Getstring("FldCodeKala"))
			cu.Position=0
			If Item<>Null Then
				MablaghTakhfif=myCode.Is_Null_adad(Item.MablaghTakhfif)
				FeeForoosh=myCode.Is_Null_adad(Item.FeeForoosh)
				FeeBadAzTakhfif=myCode.Is_Null_adad(Item.fldFeeBadAzTakhfif)
				DarsadTakhfif=myCode.Is_Null_adad(Item.fldDarsadTakhfif)
				Else
				FeeForoosh=myCode.Is_Null_adad(Cu1.Getstring("FldFeeForoosh"))
				FeeBadAzTakhfif=myCode.Is_Null_adad(Cu1.Getstring("fldFeeBadAzTakhfif"))
			End If
			
			Log(MablaghTakhfif)
			fee=GetMablaghFee(ItemTasvie.FldC_Tasvie,Cu1.Getstring("FldCodeKala")) - MablaghTakhfif
		
			
			Log(Cu1.Getstring("FldCodeKala"))
		
			If fee>0 Then
				If fee>FeeBadAzTakhfif And FeeBadAzTakhfif>0 Then
					SaveUpdate("Update TblSabad Set fldFeeBadAzTakhfif=0 ,FldFeeForoosh="&FeeForoosh &" ,FldMablaghTakhfif="&MablaghTakhfif&" ,FldDarsadTakhfif="&DarsadTakhfif&" ,FldVaziatPardakht="&ItemTasvie.FldC_Tasvie&" where FldCodeKala="&Cu1.Getstring("FldCodeKala"))
				Else If fee>FeeBadAzTakhfif And FeeBadAzTakhfif=0 Then
					SaveUpdate("Update TblSabad Set FldFeeForoosh="&fee &" ,FldMablaghTakhfif="&MablaghTakhfif&",FldDarsadTakhfif="&DarsadTakhfif&" ,FldVaziatPardakht="&ItemTasvie.FldC_Tasvie&" where FldCodeKala="&Cu1.Getstring("FldCodeKala"))
				Else If fee<FeeBadAzTakhfif And FeeBadAzTakhfif>0 Then
					SaveUpdate("Update TblSabad Set fldFeeBadAzTakhfif="&fee &" ,FldFeeForoosh="&FeeForoosh &",FldMablaghTakhfif="&MablaghTakhfif&",FldDarsadTakhfif="&DarsadTakhfif&" ,FldVaziatPardakht="&ItemTasvie.FldC_Tasvie&"  where FldCodeKala="&Cu1.Getstring("FldCodeKala"))
				Else If fee<FeeBadAzTakhfif And FeeBadAzTakhfif=0 Then
					SaveUpdate("Update TblSabad Set FldFeeForoosh="&fee &",FldMablaghTakhfif="&MablaghTakhfif&",FldDarsadTakhfif="&DarsadTakhfif&" ,FldVaziatPardakht="&ItemTasvie.FldC_Tasvie&"  where FldCodeKala="&Cu1.Getstring("FldCodeKala"))
				Else
					SaveUpdate("Update TblSabad Set fldFeeBadAzTakhfif="&FeeBadAzTakhfif&" ,FldFeeForoosh="&FeeForoosh &",FldMablaghTakhfif="&MablaghTakhfif&",FldDarsadTakhfif="&DarsadTakhfif&" ,FldVaziatPardakht="&ItemTasvie.FldC_Tasvie&" where FldCodeKala="&Cu1.Getstring("FldCodeKala"))
				End If
				'SaveUpdate("Update TblSabad Set FldFeeForoosh="&fee &" where FldCodeKala="&Cu1.Getstring("FldCodeKala"))
			Else
				SaveUpdate("Update TblSabad Set fldFeeBadAzTakhfif="&FeeBadAzTakhfif &" ,FldFeeForoosh="&FeeForoosh &",FldMablaghTakhfif="&MablaghTakhfif&",FldDarsadTakhfif="&DarsadTakhfif&" ,FldVaziatPardakht="&ItemTasvie.FldC_Tasvie&" where FldCodeKala="&Cu1.Getstring("FldCodeKala"))
			End If
		
		Next
		Log(fee)
	End If
End Sub

Sub Encrypted(str As String) As String
	Dim Enc As AESEncryption
	Dim Result1 As String
	Enc.InitializationVector = "Q.6qYq0_C+mGmymX" 'Must be 16 characters in length
	Enc.SecretKey = "3hba8fOumOPrMG0.G?-mkF-scGOkPwyW" 'Must be 16 or 32 characters in length
	Result1=Enc.AESEncrypt(str)
	Log($"Encrypted = ${Result1}"$)
	Log($"EncryptedLength = ${Result1.Length}"$)
Return  Result1
End Sub

Sub Decrypted(str As String) As String
	Dim Enc As AESEncryption
	Dim Result1 As String
	Enc.InitializationVector = "Q.6qYq0_C+mGmymX" 'Must be 16 characters in length
	Enc.SecretKey = "3hba8fOumOPrMG0.G?-mkF-scGOkPwyW" 'Must be 16 or 32 characters in length
	Result1=Enc.AESDecrypt(str)
	Log($"Decrypted = ${Result1}"$)
	Log($"DecryptedLength = ${Result1.Length}"$)
	Return  Result1
End Sub

Sub SaveLocationToDb 
'	Dim b As Boolean=False
'	Try
'		
'		Dim Cu As Cursor = Sql1.ExecQuery("Select FldNoeDate From TblSetting")
'		Cu.Position=0
'		If Cu.GetString("FldNoeDate") = "S" Then
'			Dim Tarikh As String = DatePersian
'		else if Cu.GetString("FldNoeDate") = "M" Then
'			Dim Tarikh As String = DateMiladi
'		End If
'	
'		Dim Tm() As String
''		Dim Time As String = DateTime.Time(DateTime.Now)
''		Tm = Regex.Split(":",Time)
''		Time=ConvertNumbersPersian2English(Tm(0)) & ConvertNumbersPersian2English(Tm(1))
''		
'		Dim Time As String = ConvertNumbersPersian2English(DateTime.Time(DateTime.Now))
'		'Tm = Regex.Split(j(i)("FldTime"), ":")
'		'Time = ConvertNumbersPersian2English(Tm(0)) & ConvertNumbersPersian2English(Tm(1))
'		Log(Lat)
'		Log(Lon)
'		Log(Time)
'		Log(Tarikh)
'		If Lat <> "" And Lon <> "" And IsNumber(C_Visitor)=True And IsNumber(Tarikh)=True And IsNumber(Time)=True  Then
'			Sql1.ExecNonQuery("Insert Into TblGpsVisitor (FldVisitor,FldTarikh,FldTime,FldLat,FldLon) Values ('"& C_Visitor &"','"& Tarikh &"','"& Time &"','"& Lat &"','"& Lon &"')")
'			'GetTime=DateTime.Time(DateTime.Now)
'			b=True
'			Else
'			b=False
'		End If
'		Lat=""
'		Lon=""
'	Catch
'		Log(LastException)
'		myCode.SendError(LastException,"Service_Gps-SaveLocationToDb")
'	End Try
'	If b=True Then
'		
'		Dim Cu As Cursor = Sql1.ExecQuery("Select * From TblGpsVisitor")
'		If Cu.RowCount > 0 Then
'			'SendGps(DtToJson(Cu))
'			CallSubDelayed2(Service_Gps,"SendGps",DtToJson(Cu))
'		End If
'	End If
	
'	ToastMessageShow("Save end",True)
End Sub

Sub UpdateFeeSabad(str As String,codeKala As String)
	If str>0 Then
	Dim cu As Cursor=Result("select * from TblSabad where FldCodeKala="&codeKala)
	If cu.RowCount>0 Then
		SaveUpdate("Update TblSabad Set FldFeeForoosh="& str &", FldupdateFee="&str&" where FldCodeKala="&codeKala)
	
		End If
		If lstChangeFeeKala.Size>0 Then
		
			Dim ishas As Boolean=False
			Dim c As Int=0
			For i=0 To lstChangeFeeKala.Size-1
				Dim Item = lstChangeFeeKala.Get(i) As AdapterChangeFeeKala
				If Item.FldCodKala=codeKala Then
						ishas=True
						c=i
					Exit
					Else
						ishas=False
				End If
			Next
			
			If ishas Then
				lstChangeFeeKala.RemoveAt(c)	
			End If
			Dim Item As AdapterChangeFeeKala
			Item.Initialize
			Item.FldCodKala=codeKala
			Item.FldFee=str
			lstChangeFeeKala.Add(Item)
			
			Else
			Dim Item As AdapterChangeFeeKala
			Item.Initialize
			Item.FldCodKala=codeKala
			Item.FldFee=str
			lstChangeFeeKala.Add(Item)
		End If
	Else

		Dim ishas As Boolean=False
		Dim c As Int=0
		For i=0 To lstChangeFeeKala.Size-1
			Dim Item = lstChangeFeeKala.Get(i) As AdapterChangeFeeKala
			If Item.FldCodKala=codeKala Then
				ishas=True
				c=i
				Exit
			Else
				ishas=False
			End If
		Next
			
		If ishas Then
			lstChangeFeeKala.RemoveAt(c)
			SaveUpdate("Update TblSabad Set  FldupdateFee="&str&" where FldCodeKala="&codeKala)
	
		End If
	End If
End Sub

Sub UpdateFeeSabad2(Item1 As AdapterListKala)
	If Item1.FeeForoosh>0 Then
	Dim cu As Cursor=Result("select * from TblSabad where FldCodeKala="&Item1.CodeKala)
	If cu.RowCount>0 Then
			SaveUpdate("Update TblSabad Set FldFeeForoosh="& Item1.FeeForoosh &",FldMablaghTakhfif = '"& Item1.MablaghTakhfif &"',FldDarsadTakhfif = '"& myCode.Is_Null_adad(Item1.fldDarsadTakhfif) & "',fldFeeBadAzTakhfif = '"& myCode.Is_Null_adad(Item1.fldFeeBadAzTakhfif) & "', FldupdateFee="&Item1.FeeForoosh&" where FldCodeKala="&Item1.CodeKala)
	
		End If
		If lstChangeFeeKala.Size>0 Then
		
			Dim ishas As Boolean=False
			Dim c As Int=0
			For i=0 To lstChangeFeeKala.Size-1
				Dim Item = lstChangeFeeKala.Get(i) As AdapterChangeFeeKala
				If Item.FldCodKala=Item1.CodeKala Then
						ishas=True
						c=i
					Exit
					Else
						ishas=False
				End If
			Next
			
			If ishas Then
				lstChangeFeeKala.RemoveAt(c)	
			End If
			Dim Item As AdapterChangeFeeKala
			Item.Initialize
			Item.FldCodKala=Item1.CodeKala
			Item.FldFee=Item1.FeeForoosh
			lstChangeFeeKala.Add(Item)
			
			Else
			Dim Item As AdapterChangeFeeKala
			Item.Initialize
			Item.FldCodKala=Item1.CodeKala
			Item.FldFee=Item1.FeeForoosh
			lstChangeFeeKala.Add(Item)
		End If
	Else

		Dim ishas As Boolean=False
		Dim c As Int=0
		For i=0 To lstChangeFeeKala.Size-1
			Dim Item = lstChangeFeeKala.Get(i) As AdapterChangeFeeKala
			If Item.FldCodKala=Item1.CodeKala Then
				ishas=True
				c=i
				Exit
			Else
				ishas=False
			End If
		Next
			
		If ishas Then
			lstChangeFeeKala.RemoveAt(c)
			SaveUpdate("Update TblSabad Set  FldupdateFee="&Item1.FeeForoosh&" where FldCodeKala="&Item1.CodeKala)
	
		End If
	End If
End Sub

Sub GetUpdateFeeSabad(str As String,codeKala As String) As String

 If lstChangeFeeKala.Size>0 Then
	For i=0 To lstChangeFeeKala.Size-1
			Dim Item = lstChangeFeeKala.Get(i) As AdapterChangeFeeKala
			If Item.FldCodKala=codeKala Then
			str=Item.FldFee
			Exit
		End If
	Next
	Else
		Dim cu As Cursor=Result("select * from TblSabad where FldCodeKala="&codeKala)
		If cu.RowCount>0 Then
			SaveUpdate("Update TblSabad Set  FldFeeForoosh="&str&",FldupdateFee=NULL where FldCodeKala="&codeKala)
		End If
	End If
	Return str
End Sub

Sub RemoveSlashDate(date As String) As String
	Return date.Replace("/","")
End Sub


Public Sub EnterExitVisitor(item As AdapteEnterExitVisitor) As String
	Dim res As String=""
	Try
		Dim cu As Cursor=Result("Select * from TblEnterExitVisitor where fldCode='"&item.fldCode&"'")
		Select cu.RowCount
			Case 0
				'no Enter
				If item.fldType=1 Then
					'enter
'					Dim query As String="Insert into TblEnterExitVisitor(fldType,fldDate,fldTime,fldLat,fldLon,fldSend,fldCode) " & _
'					"Values('ورود','d','t','lat','lon','False','Code')"
					Dim query As String="Insert into TblEnterExitVisitor(fldType,fldDate,fldTime,fldLat,fldLon,fldSend,fldCode) " & _
					"Values('ورود','"&item.fldDate&"','"&item.fldTime&"','"&item.fldLat&"','"&item.fldLon&"','False','"&item.fldCode&"')"
					SaveUpdate(query)
					res="Success"
				Else
					'exit	
					res="NoEnter"
				End If
			Case 1
				'Enter
				If item.fldType=1 Then
					'enter
					res="DuplicateEnter"
				Else
					'exit
					Dim query As String="Insert into TblEnterExitVisitor(fldType,fldDate,fldTime,fldLat,fldLon,fldSend,fldCode) " & _
					"Values('خروج','"&item.fldDate&"','"&item.fldTime&"','"&item.fldLat&"','"&item.fldLon&"','False','"&item.fldCode&"')"
					SaveUpdate(query)
					res="Success"
				End If
			Case 2
				'Exit
				res="DuplicateExit"
			Case Else
					res=""
		End Select
	
	Catch
		Log(LastException)
		res=""
		myCode.SendError(LastException,"MCode-T_EnterExit_tick")
	End Try
	Return res
End Sub

Public Sub CheckBlackList(CodeTafzili As String) As Boolean
	Dim res As String=SingleResult("Select fldBlackList from TblAshkhas where fldCodetafzili="&CodeTafzili)
	If res="1" Then
		Return True
	Else
		Return False
	End If
End Sub

Sub LoadListKala(Query As String) As List
	Try
		Dim OrginalListKala As List
		OrginalListKala.Initialize
		'MCode.Sql1.Initialize(File.DirDefaultExternal &"/Parsik","parsik_db.db",True)
		'Dim sql As SQL
		'sql.Initialize(File.DirDefaultExternal &"/Parsik","parsik_db.db",False)
		'ModelKala.GetAllKala(Query)
		OrginalListKala.Clear
		Dim Cu As Cursor = Result(Query)
		If Cu.RowCount > 0 Then
			StopService(FusedLocationService)
			
			'ProgressDialogShow("در حال بارگذاری لیست کالا")
			For i = 0 To Cu.RowCount - 1
				Dim ItemKala As AdapterListKala
				Cu.Position=i
				ItemKala.CodeGroup=Cu.Getstring("fldCodeGroup")
				ItemKala.CodeKala=Cu.Getstring("fldCodeKala")
				ItemKala.NameKala=Cu.Getstring("fldNameKala")
				ItemKala.NameVahed=Cu.Getstring("fldNameVahed")
				ItemKala.NameVahed2=Cu.Getstring("fldNameVahed2")
				ItemKala.fldSharh=Cu.Getstring("fldSharh")
				ItemKala.SumMande=Cu.Getstring("SumMande")
			
'			If	MCode.TakhfifKala="1" Then
'				'FldMablaghTakhfif
'				If Cu.GetString("FldMablaghTakhfif")<>Null Then
'					'Log(Cu.GetString("FldMablaghTakhfif"))
'					ItemKala.MablaghTakhfif=Cu.GetString("FldMablaghTakhfif")
'				Else
'					'Log(Cu.GetString("FldMablaghTakhfif"))
'					'Log("0")
'					ItemKala.MablaghTakhfif="0"
'				End If
'			End If
				ItemKala.TedadDarKarton =Cu.Getstring("fldTedadDarKarton")
				
				
				Dim fee As String
				If feeTip=0 Then
					fee=Cu.GetInt("fldFeeForoosh")
			
				Else
					'Sleep (0)
			
					'fldFeeTasvie
					fee=myCode.Is_Null_adad(Cu.GetString("fldFeeTasvie"))
					'MCode.UpdateFeeSabad(fee,ItemKala.CodeKala)
					If 	IsNumber(fee) And fee>0 Then
						Log(Cu.GetString("fldFeeTasvie"))
						'ItemKala.fldFeeBadAzTakhfif="0"
						If  fee>Cu.GetString("fldFeeBadAzTakhfif") Then
							'Log(Cu.GetString("fldFeeBadAzTakhfif"))
							ItemKala.fldFeeBadAzTakhfif="0"
						Else if fee<Cu.GetString("fldFeeBadAzTakhfif") Then
							ItemKala.fldFeeBadAzTakhfif=fee
							fee=Cu.GetInt("fldFeeForoosh")
						Else
							'Log(Cu.GetString("fldFeeBadAzTakhfif"))
							'Log("0")
							ItemKala.fldFeeBadAzTakhfif=Cu.GetString("fldFeeBadAzTakhfif")
							fee=Cu.GetInt("fldFeeForoosh")
						End If
					
					Else
						fee=Cu.GetInt("fldFeeForoosh")
					End If
				
				End If
'				Dim cu1 As Cursor=MCode.Result("select * from TblSabad where FldCodeKala="&ItemKala.CodeKala)
'				If cu1.RowCount>0 Then
'				cu1.Position=0
'					If myCode.Is_Null(cu1.GetString("FldupdateFee"))<>"" Then
'						fee=cu1.GetString("FldupdateFee")
'					End If
'				End If
	
				'fee=0'MCode.GetUpdateFeeSabad(fee,ItemKala.CodeKala)

				Dim countSabad As String=SingleResult("select count(FldId) from TblSabad where FldCodeKala="&ItemKala.CodeKala)
				If countSabad>0 Then
					Dim cu1 As Cursor=Result("select * from TblSabad where FldCodeKala="&ItemKala.CodeKala)
					cu1.Position=0
					feeTip=feeTip
					ItemKala.TedadDarSabadJoz =cu1.Getstring("FldTedadDarSabadJoz")
					ItemKala.TedadDarSabadKol =cu1.Getstring("FldTedadDarSabadKol")
					ItemKala.SumMande=Cu.Getstring("SumMande")-cu1.Getstring("FldTedadDarSabadJoz")
					If Cu.Getstring("fldNameVahed2") <> "" Then
						Dim FldFeeForoosh As Int = Sf.Val(Cu.GetInt("fldFeeForoosh"))
						Dim FldTedadDarKarton As Int = Sf.Val(cu1.Getstring("FldTedadDarSabadKol"))
						Dim SumMande As Int = Cu.Getstring("SumMande")
						ItemKala.FeeForooshKarton=FldFeeForoosh * FldTedadDarKarton
						ItemKala.SumMandeKarton=Round2( SumMande / FldTedadDarKarton,0)
					End If
					'CmbBox1.SelectedIndex=MCode.feeTip
					If feeTip=0 Then
						fee=cu1.GetString("FldFeeForoosh")
					Else
						fee=GetUpdateFeeSabad(fee,ItemKala.CodeKala)
						'MCode.UpdateFeeSabad(fee,ItemKala.CodeKala)
					End If
					
					
					'Cu.GetString2("FldVaziatPardakht")
					ItemKala.FldEshantion=cu1.Getstring("FldEshantion")
				
'					If	MCode.TakhfifKala="1" Then
					'FldMablaghTakhfif
					If myCode.Is_Null_adad(cu1.GetString("FldDarsadTakhfif"))>0 Then
'						
						''						txtDarsadTakhfif.Tag=cu1.GetString("FldDarsadTakhfif")
						''						txtDarsadTakhfif.Text=cu1.GetString("FldDarsadTakhfif")
						ItemKala.fldDarsadTakhfif=cu1.GetString("FldDarsadTakhfif")
						ItemKala.MablaghTakhfif=((ItemKala.FeeForoosh*cu1.GetString("FldDarsadTakhfif"))/100)
'						txtFee.Text=MCode.qomaAshar(ItemKala.MablaghTakhfif)
'						txtDarsadTakhfif.Text=cu1.GetString("FldDarsadTakhfif")
'						FeeType="btn_discount_Click"
'						btnSaveFee_Click
					Else
						If cu1.GetString("FldMablaghTakhfif")>0 And cu1.GetString("FldMablaghTakhfif")<>Null Then
							'Log(Cu.GetString("FldMablaghTakhfif"))
							ItemKala.MablaghTakhfif=cu1.GetString("FldMablaghTakhfif")
							ItemKala.fldDarsadTakhfif="0"
						Else
							'Log(Cu.GetString("FldMablaghTakhfif"))
							'Log("0")
							ItemKala.MablaghTakhfif="0"
							ItemKala.fldDarsadTakhfif="0"
						End If
					End If
						
					
'					End If
			
					cu1.Close
				End If
				
				'Log("fee="&fee)
				If Cu.GetString("fldFeeBadAzTakhfif")<>Null Then
					'Log(Cu.GetString("fldFeeBadAzTakhfif"))
					ItemKala.fldFeeBadAzTakhfif=Cu.GetString("fldFeeBadAzTakhfif")
				Else
					'Log(Cu.GetString("fldFeeBadAzTakhfif"))
					'Log("0")
					ItemKala.fldFeeBadAzTakhfif="0"
				End If
			
				If ItemKala.MablaghTakhfif>0 Then
					ItemKala.fldFeeBadAzTakhfif=fee-ItemKala.MablaghTakhfif
				End If
			
				ItemKala.FeeForoosh=fee
				'ItemKala.fldTipFee=FeeTip
				'ItemKala.FeeForoosh=Cu.GetInt("fldFeeForoosh")
				ItemKala.FldMablaghMasrafKonande=Cu.GetString("fldGhymatMasrafkonande")
				
				'Log(Cu.GetString("fldPathPic"))
			
				ItemKala.fldPathPic=Cu.GetString("fldPathPic")
'				Dim c As Long=MCode.SingleResult("select count(FldCodeKala) as count from TblSabad where FldCodeKala="&ItemKala.CodeKala)
'				If c>0 Then
	
				
		
				'	End If
				If Cu.Getstring("fldNameVahed2") <> ""  Then
					Dim FldFeeForoosh As Int = Sf.Val(Cu.GetInt("fldFeeForoosh"))
					Dim FldTedadDarKarton As Int = Sf.Val(Cu.Getstring("fldTedadDarKarton"))
					Dim SumMande As Int = Cu.Getstring("SumMande")
					If FldTedadDarKarton>0 Then
						ItemKala.FeeForooshKarton=FldFeeForoosh * FldTedadDarKarton
'					ItemKala.SumMandeKarton= Round2( SumMande / FldTedadDarKarton,0)
						Dim SumKol As Long=(SumMande / FldTedadDarKarton)
						ItemKala.SumMandeKarton=SumKol
					Else
						ItemKala.SumMandeKarton=0
					End If
				
				End If
		
		
			
				OrginalListKala.Add(ItemKala)
		
		
			Next
			'ProgressDialogHide
			Cu.Close
			'sql.Close
'		MCode.Sql1.Close
'		MCode.Initialize
			'	cu1.Close
			
			
'			Sleep(100)
'	ToastMessageShow(Cu.RowCount,True)
			
		End If
		'ToastMessageShow("تعداد کالای زیر مجموعه " & "  " & Cu.RowCount,True)
		
	
		Return OrginalListKala
		'ProgressDialogHide
	Catch
		Log(LastException)
		Log(LastException.Message)
		myCode.SendError(LastException.Message,"LoadListKala")
	End Try
'	Try		
'		ClsKala.Initialize
'		OrginalListKala=ClsKala.SelectForDefaultKalaList(Query)
'		FeeTip=MCode.feeTip
'		CmbBox1.SelectedIndex=MCode.feeTip
'		ListKalaSp=OrginalListKala
'		ListKalaTxt=ListKalaSp
'		Sleep(100)
'		HLV.notifyDataSetChanged
'	Catch
'		Log(LastException)
'		myCode.SendError(LastException,Activity.Title&"-LoadListKala")
'	End Try
End Sub

Sub CheckCodeKalaEshantion(CodeKalaForoosh As String,CodeKalaEshantion As String) As Boolean
	Dim cu As Cursor=Result($"Select * from tblEshantionTabaghati where fldCodeKalaForoosh= ${CodeKalaForoosh} and fldCodeKalaEshantion= ${CodeKalaEshantion}"$)
	If cu.RowCount>0 Then
		Return True
	End If
	Return False
End Sub

Sub GetCountEshantionGroup(CodeGroup As String) As Int
	Dim Count As Int=0
	Count=myCode.Is_Null_adad(SingleResult("Select fldTedadEshantion from tblEshantionGroupTemp where fldCodeGroupKalaEshantion='"& CodeGroup & "'"))

	Return Count
End Sub

Sub GetNameGroupKala(CodeGroup As String) As String
	Dim str As String=""
	str=SingleResult("Select FldN_Gorooh From TblGoroohKala where FldC_Gorooh="&CodeGroup)
	Return str
End Sub

Sub OpenLinkInWebBrwoser(link As String)
	Dim p1 As PhoneIntents
	StartActivity(p1.OpenBrowser(link))
End Sub

Sub AddZero(str As String) As String
	If IsNumber(str) And str<10 And str>0 And str.Length=1 Then
		str="0"& str
	End If
	Return str
End Sub

Sub MohasbeArzeshAfzode(Sum As Long) As Long
	If ArzeshAfzodeEnable=1 Then
		Return Sum*(ArzeshAfzode/100)
	Else
		Return 0
	End If
End Sub

Sub MohasbeArzeshAfzodeKala(Sum As Long,ArzeshAfzodeKala As String) As Long
	If myCode.Is_Null_adad(ArzeshAfzodeKala)>0 Then
		Return Sum*(ArzeshAfzodeKala/100)
	Else If ArzeshAfzodeEnable=1 And  myCode.Is_Null_adad(ArzeshAfzodeKala)=0 Then
		Return Sum*(ArzeshAfzode/100)
	Else
		Return 0
	End If
End Sub

Sub CalculateDistance(lat1 As String,lon1 As String,lat2 As String,lon2 As String) As Long
	Dim p1,p2 As Location
	p1.Initialize2(lat1,lon1)
	p2.Initialize2(lat2,lon2)
	Dim dis As Long=p1.DistanceTo(p2)
	Return dis
End Sub

Sub ConvertToJSON(Map As Map) As String
	' ایجاد یک شیء JSONGenerator
	Dim JSONGen As JSONGenerator
	JSONGen.Initialize(Map)
    
	' تولید و بازگشت JSON
	Return JSONGen.ToString
End Sub