B4A=true
Group=Activity
ModulesStructureVersion=1
Type=Activity
Version=12.2
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
#End Region

Sub Process_Globals
	Dim ShomareFaktor As String
	Dim ShomareHavale As String
	Dim CodeMoshtari As String
	Dim NameMoshtari As String
	Dim date As String
	Dim fldLat,fldLon As String
	Dim Gps As GPS
	Dim t1 As Timer
	
End Sub

Sub Globals
'	Dim HLV As Hitex_LayoutView
	
	Dim Table1 As Table
	Dim Key As IME
	Dim Listkala As List
	Private LblNameMoshtari As Label
	Private TxtSharhFaktor As Label
	Private Btn_print As Button
	Private PnlTable As Panel
	Private rp As RuntimePermissions
	Private LblGHabelePardakht As Label
	Private LblMandeGhabl As Label
	Private LblTakhfifKala As Label
	Private LblTotalFaktor2 As Label
	Private LblMablaghKhales As Label
	Private lblShomareFactor As Label
	Private Btn_Tasvie As Button
	Private BtnShowMap As Button
	Private BtnCheck As Button
	Private LblCodeMoshtari As Label
	Private lblShomareHavale As Label
	Private lblDate As Label
	Private lblMablagheKolDaryafti As Label
	Private LblVaziat As Label
	Dim Vaziat As String=0
	Private MapFragment1 As MapFragment
	Private gmap As GoogleMap
	Dim mablaghFinal As String
	Private LblMabalghTahkfifDaryafti As Label
	Dim loc As LatLng
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Activity.LoadLayout("L_RizeFactorHavale")
'	HLV.Initializer("HLV").ListView.Build
'	pnl_HLV.AddView(HLV,0,0,pnl_HLV.Width,pnl_HLV.Height)
	Key.Initialize("Key")
	Listkala.Initialize
	Gps.Initialize("Gps")
	t1.Initialize("t1",3000)
	
	'Dim isPos As Int = myCode.getSetting("setting.dat","isPos",0)
'	Select Case isPos
'		Case 1
'			Btn_print.Enabled=True
'		Case 0
'			Btn_print.Enabled=False
'	End Select
	
	Table1.Initialize(Me, "Table1",9)
	Table1.AddToActivity(PnlTable, 0,0,100%x,PnlTable.Height)
	
	'CreatePge
	'LoadListKalaFaktor
'	HLV.Show
	'LoadListKalaFaktor

'	Table1.Initialize(Me, "Table1",5)
'	Table1.AddToActivity(PnlTable, 0,0,100%x,PnlTable.Height)
'	Grid
End Sub

Sub Grid
	Dim Lst_ColNameTitle As List
	Lst_ColNameTitle.Initialize
'	Lst_ColNameTitle.AddAll(Array As String("ردیف","نام کالا","قیمت فی","فی تخفیف","تعداد جزء","واحد جزء","تعداد کل","واحد کل","کد کالا","قیمت مصرف کننده","توضیحات"))
	Lst_ColNameTitle.AddAll(Array As String("ردیف","نام کالا","کد کالا","فروش فی","فی کارتن","مبلغ تخفیف","درصد تخفیف","تعداد جزء","تعداد کل","کد انبار","کد واسطه","کد راننده","نام راننده"))
	'Dim Query As String = "Select FldNamekala,Cast(Round(FldFeeForoosh,'"& MCode.RaghamAshar &"') As Int) As FldFeeForoosh,Cast(Round(fldFeeBadAzTakhfif,'"& MCode.RaghamAshar &"') As Int) As fldFeeBadAzTakhfif,FldTedadDarSabadJoz,fldNamevahed,FldTedadDarSabadKol,fldNameVahed2,FldCodeKala,FldMablaghMasrafKonande,FldTozihat From TblFaktor Where FldShomareFaktor = '"& MCode.FaktorSelect &"'"
	'Table1.LoadSQLiteDB(File.DirDefaultExternal &"/"Parsik"",""Parsik"_db.db",MCode.Sql1, Query)
	Table1.LoadSListRizFactorHavale(Listkala,Lst_ColNameTitle,13)
'	Table1.SetColumnsWidths(Array As Int(100dip, 80dip,50dip,90dip,150dip))
'	Table1.SetColumnsWidths(Array As Int(50dip,200dip,100dip, 100dip,50dip,80dip,50dip,80dip,80dip,80dip,100dip))
	Table1.SetColumnsWidths(Array As Int(50dip,100dip, 70dip,70dip,70dip,70dip,50dip,80dip,50dip,90dip,80dip,80dip,150dip))
'	Table1.SetHeader(Array As String("قیمت","واحد","مقدار","فی","نام کالا"),Array As Int(100dip, 80dip,50dip,90dip,150dip))
	'Table1.SetHeader(Array As String("ردیف","نام کالا","قیمت فی","فی تخفیف","تعداد جزء","واحد جزء","تعداد کل","واحد کل","کد کالا","قیمت مصرف کننده","توضیحات"),Array As Int(50dip,200dip,100dip, 100dip,50dip,80dip,50dip,80dip,80dip,80dip,100dip))
ProgressDialogHide
End Sub

Sub CreatePge
	ProgressDialogShow("در حال بارگذاری اطلاعات . . .")
	Try
		MCode.page="Act_RizeFactorHavale"
		lblShomareFactor.Text=ShomareFaktor
		lblShomareHavale.Text=ShomareHavale
		MCode.ShomareFaktor=ShomareFaktor
		LblCodeMoshtari.Text=CodeMoshtari
		LblNameMoshtari.Text=NameMoshtari
		lblDate.Text=date
		t1.Enabled=True
		LoadData
'		CallSubDelayed(Service_Server,"ShowRizeFactorForooshByHavale")
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-CreatePge")
	End Try
End Sub

Sub LoadData
	Try
	Dim cr As Cursor=MCode.Result("select * from TblRizFactorHavale where fldShomareFactor='"&lblShomareFactor.Text&"' and fldShomareHavale='"&lblShomareHavale.Text&"'" )
	Listkala.Clear
	If cr.RowCount>0 Then
		Dim MablaghKhales As Long=0
			Dim MablaghTakhfif As Long=0
			Dim MablaghTakhfifDaryafti As Long=0
			Dim MandeTalab As Long=0
			Dim MandeTasfieNashode As Long=0
			Dim MablagheKolDaryafti As Long=0
			Dim TotalFaktor2 As Long=0
		For i=0 To cr.RowCount-1
			cr.Position=i
			Dim Item As AdapteRizFactorHavale
			Item.fldShomareFactor=cr.GetString("fldShomareFactor")
			Item.fldShomareHavale=cr.GetString("fldShomareHavale")
			lblShomareHavale.Text=Item.fldShomareHavale
			Item.fldShomareSanad=cr.GetString("fldShomareSanad")
			Item.fldC_Ranandeh=cr.GetString("fldC_Ranandeh")
			Item.fldN_Ranandeh=cr.GetString("fldN_Ranandeh")
			Item.fldCodeVasete=cr.GetString("fldCodeVasete")
			Item.fldCodeAnbar=cr.GetString("fldCodeAnbar")
			Item.fldRadif=cr.GetString("fldRadif")
			Item.fldCodeKala=cr.GetString("fldCodeKala")
			Item.fldSharhKala=cr.GetString("fldSharhKala")
			Item.fldDarsadTakhfif=myCode.Is_Null_adad(Item.fldDarsadTakhfif)
			Item.fldMablaghTakhfif=myCode.Is_Null_adad(cr.GetString("fldMablaghTakhfif"))
			Item.fldMandeTalab=myCode.Is_Null_adad(cr.GetString("fldMandeTalab"))
			Item.fldMandeTasfieNashode=myCode.Is_Null_adad(cr.GetString("fldMandeTasfieNashode"))
			Item.fldMablaghKhales=myCode.Is_Null_adad(cr.GetString("fldMablaghKhales"))
			Item.fldMablagheKolDaryafti=myCode.Is_Null_adad(cr.GetString("fldMablagheKolDaryafti"))
			Item.fldTedadCarton=cr.GetString("fldTedadCarton")
			Item.fldTedadJoz=cr.GetString("fldTedadJoz")
			Item.fldFeeJoz=cr.GetString("fldFeeJoz")
			Item.fldFeeKol=cr.GetString("fldFeeKol")
			Item.fldDateSarResid=cr.GetString("fldDateSarResid")
			Item.fldDateFactor=cr.GetString("fldDateFactor")
			Item.fldDate=cr.GetString("fldDate")
			Item.fldTime=cr.GetString("fldTime")
			Item.fldCodeTafzili=cr.GetString("fldCodeTafzili")
			Item.fldSharhTafzili=cr.GetString("fldSharhTafzili")
			Item.fldLat=cr.GetString("fldLat")
			Item.fldLon=cr.GetString("fldLon")
			Item.fldFeeYekCarton=cr.GetString("fldFeeYekCarton")
			Item.fldArzeshAfzode=cr.GetString("fldArzeshAfzode")
			Item.fldTell=cr.GetString("fldTell")
			Item.fldAddress=cr.GetString("fldAddress")
			Item.fldVaziat=cr.GetString("fldVaziat")
			Item.fldDateTahvil=cr.GetString("fldDateTahvil")
			Item.fldTimeTahvil=cr.GetString("fldTimeTahvil")
			Item.fldSignature=cr.GetString("fldSignature")
			Item.fldSharhFactor=cr.GetString("fldSharhFactor")
			Listkala.Add(Item)
			
			MablaghKhales=MablaghKhales+Item.fldMablaghKhales
			MablaghTakhfif=MablaghTakhfif+Item.fldMablaghTakhfif
			MandeTalab=Item.fldMandeTalab
			MandeTasfieNashode=Item.fldMandeTasfieNashode
			MablagheKolDaryafti=Item.fldMablagheKolDaryafti
			
			Vaziat=Item.fldVaziat
			MCode.C_Tafzili=Item.fldCodeTafzili
			MCode.N_Tafzili=Item.fldSharhTafzili
			MCode.N_Tafzili=Item.fldSharhTafzili
			MCode.Tell_Tafzili=Item.fldTell
			MCode.Address_Tafzili=Item.fldAddress
			TxtSharhFaktor.Text=Item.fldSharhFactor
		Next
			
		TotalFaktor2=MablaghKhales+MablaghTakhfif
		
		LblMablaghKhales.text = NumberFormat(myCode.Is_Null_adad(MablaghKhales),1,3) & " " & MCode.VahedPool
		mablaghFinal=MablaghKhales
		Dim dr As Cursor=MCode.Result("select * from TblDaryaft where fldShomareFactor="& ShomareFaktor)
		If dr.RowCount>0 Then
			MablagheKolDaryafti=MCode.SingleResult("select sum(fldMablaghDaryafti) as fldMablaghDaryafti from TblDaryaft where fldType<>3 and fldShomareFactor="& ShomareFaktor)
			MablaghTakhfifDaryafti=myCode.Is_Null_adad(MCode.SingleResult("select sum(FldMablaghTakhfif) as fldMablaghTakhfifDaryafti from TblDaryaft where fldType=3 and fldShomareFactor="& ShomareFaktor))	
			MandeTalab=MablaghKhales-MablagheKolDaryafti-myCode.Is_Null_adad(MablaghTakhfifDaryafti)
			MandeTasfieNashode=MablaghKhales-MablagheKolDaryafti
			LblMabalghTahkfifDaryafti.Text=NumberFormat(myCode.Is_Null_adad(MablaghTakhfifDaryafti),1,3) & " " & MCode.VahedPool
			LblGHabelePardakht.text = NumberFormat(myCode.Is_Null_adad(MandeTalab),1,3) & " " & MCode.VahedPool
		Else
			LblGHabelePardakht.text = NumberFormat(myCode.Is_Null_adad(MablaghKhales),1,3) & " " & MCode.VahedPool
		End If
		LblTakhfifKala.text = NumberFormat(myCode.Is_Null_adad(MablaghTakhfif),1,3) & " " & MCode.VahedPool
		LblMandeGhabl.text = NumberFormat(myCode.Is_Null_adad(MandeTalab),1,3) & " " & MCode.VahedPool
'		lblMandeTasfieNashode.text = NumberFormat(myCode.Is_Null_adad(MandeTasfieNashode),1,3) & " " & MCode.VahedPool
		lblMablagheKolDaryafti.text = NumberFormat(myCode.Is_Null_adad(MablagheKolDaryafti),1,3) & " " & MCode.VahedPool
		LblTotalFaktor2.text = NumberFormat(myCode.Is_Null_adad(TotalFaktor2),1,3) & " " & MCode.VahedPool
	
		If myCode.Is_Null_adad(Vaziat)=0 Then
			LblVaziat.TextColor=Colors.Red
			LblVaziat.Text="تحویل داده نشده"
		Else
			LblVaziat.TextColor=Colors.Green
			LblVaziat.Text="تحویل داده شده"
			BtnCheck.Enabled=False
		End If
		Grid
		End If
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-LoadData")
	End Try
End Sub

Sub Activity_KeyPress (KeyCode As Int) As Boolean 'Return True to consume the event
	If KeyCode=KeyCodes.KEYCODE_BACK Then

		Activity.Finish
	End If
	Return True
End Sub

Sub Activity_Resume
	CreatePge
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Sub Btn_print_Click
	Act_PrintPic2.DateFactor= lblDate.Text
	Act_PrintPic2.listKala = Listkala
	Dim Lst As List = Array As String("چاپ 1","چاپ 2")
	Dim res As Int = InputList(Lst,"نوع چاپ را انتخاب نمایید:",-1)
	Select Case res
		Case 0
			Act_PrintPic2.TypePrint=res
			StartActivity(Act_PrintPic2)
		Case 1
			Act_PrintPic2.TypePrint=res
			StartActivity(Act_PrintPic2)
	End Select
End Sub


Sub btn_Back_Click
	Activity.Finish
End Sub





Private Sub Btn_Tasvie_Click
	Act_Mali.ShomareFactor=lblShomareFactor.Text
	Act_Mali.MabalghGhablepardakht=mablaghFinal
	Act_Mali.CodeMoshtari=CodeMoshtari
	Act_Mali.NameMoshtari=LblNameMoshtari.Text
	Act_Mali.ShomareHavale=ShomareHavale
	StartActivity(Act_Mali)
End Sub



Private Sub BtnShowMap_Click
	If fldLat ="" And fldLon="" Then
		ToastMessageShow("برای این شخص موقعیت ثبت نشده است",True)
		Return
	End If
	
	Dim destLat As Double = fldLat ' عرض جغرافیایی مقصد
	Dim destLng As Double = fldLon ' طول جغرافیایی مقصد
	
	Dim label As String = "Destination" ' برچسب مقصد

	Dim uri As String
	uri = "google.navigation:q=" & destLat & "," & destLng & "&label=" & label

	Dim intent As Intent
	intent.Initialize(intent.ACTION_VIEW, uri)
	intent.SetComponent("com.google.android.apps.maps")

	If intent.IsInitialized Then
		StartActivity(intent)
	Else
		ToastMessageShow("Google Maps app not found", True)
	End If
	
'	Dim Intent1 , in2 As Intent
'	Dim Uri As String
'	Dim pm As PackageManager
''	in2 = pm.GetApplicationIntent("com.google.android.apps.maps")
''	If in2.IsInitialized Then
'	Uri="geo:0,0?q=" & fldLat & "," & fldLon
'		'Uri="google.navigation:q=" & fldLat & "," & fldLon & "
'		Intent1.Initialize(Intent1.ACTION_VIEW, Uri)
'		StartActivity(Intent1)
'	Else
'		ToastMessageShow("لطفا GoogleMap را نصب نمایید.",True)
'	End If
End Sub

Private Sub BtnCheck_Click
	MCode.C_Tafzili=LblCodeMoshtari.Text
	StartActivity(Act_Emza)
End Sub

Sub LoadCheck
		If File.Exists(File.DirDefaultExternal & "/Parsik/Signature",MCode.C_Tafzili & ".png") Then
		Log("Check")
		Dim ImageSignature As String
		Dim DateS As String =MCode.DatePersian
		Dim Time As String =DateTime.Time(DateTime.Now)
		ImageSignature =MCode.Encrypted(MCode.ConvertBlobToString(File.DirDefaultExternal & "/Parsik/Signature", MCode.C_Tafzili & ".png"))
		
		
		Try
			Dim QueryAndroid As String="Update TblRizFactorHavale " & _
			"set fldVaziat='1',fldDateTahvil='"&DateS&"',fldTimeTahvil='"&Time&"',fldLat='"&MCode.Lat&"',fldLon='"&MCode.Lon&"',fldSignature='"&ImageSignature&"'" & _
			"where fldShomareFactor='"&lblShomareFactor.Text&"' and fldShomareHavale='"&lblShomareHavale.Text&"'"
			
			MCode.SaveUpdate(QueryAndroid)
			
			Dim queryServer As String="Update zomorodo_majidmarashi.tblHavaleGroohi Set fldVaziat=1,fldDateTahvil="& DateS & ",fldTimeTahvil='"&Time&"',fldLat='"&MCode.Lat&"',fldLon='"&MCode.Lon&"',fldSignature='"&ImageSignature&"' where fldShomareFactor="&lblShomareFactor.Text
			SendVaziat(queryServer)
		Catch
			Log(LastException)
		End Try
		
		
		End If
End Sub

Private Sub SendVaziat(Query As String)
	CallSubDelayed2(Service_Server,"SendUpdateQuery",Query)
	File.Delete(File.DirDefaultExternal & "/Parsik/Signature",MCode.C_Tafzili & ".png")
End Sub

'Private Sub MapFragment1_Ready
'	'Sleep(100)
'	Try
'		gmap = MapFragment1.GetMap
'		rp.CheckAndRequest(rp.PERMISSION_ACCESS_FINE_LOCATION)
'		Wait For Activity_PermissionResult (Permission As String, Result As Boolean)
'		If Result Then
'			gmap.MyLocationEnabled = True
'		Else
'			Log("No permission!")
'		End If
'	Catch
'		Log(LastException)
'		myCode.SendError(LastException,Activity.Title&"-MapFragment1_Ready")
'	End Try
'End Sub
Sub MapFragment1_Ready
'	Sleep(100)

	Try
		gmap = MapFragment1.GetMap
		rp.CheckAndRequest(rp.PERMISSION_ACCESS_FINE_LOCATION)
		Wait For Activity_PermissionResult (Permission As String, Result As Boolean)
		If Result Then
			gmap.MyLocationEnabled = True
			
'			Sleep(100)
	
			Sleep(200)
'			If gmap.IsInitialized Then
'				Log("GetLocation ok")
'				loc.Initialize(gmap.MyLocation.Latitude,gmap.MyLocation.Longitude)
'				TxtLat.text = loc.Latitude
'				TxtLon.text = loc.Longitude
'			End If
		
		Else
			Log("No permission!")
		End If
	Catch
		Log(LastException)
		myCode.SendError(LastException, Activity.Title&"-MapFragment1_Ready")
	End Try
End Sub

'Sub t1_tick
'	t1.Enabled=False
'	If gmap.IsInitialized Then
'		Try
'		
'			Dim cl As CameraPosition
'			cl.Initialize(gmap.MyLocation.Latitude,gmap.MyLocation.Longitude,15)
'			gmap.AnimateCamera(cl)
'			Dim lat As String = gmap.MyLocation.Latitude
'			Dim lon As String = gmap.MyLocation.Longitude
'			Gps.Stop
'			Log(lat)
'			Log(lon)
'			MCode.Lat=lat
'			MCode.Lon=lon
'			ProgressDialogHide
'			'Create
''			LoadData
'		Catch
'			ProgressDialogHide
'			Log(LastException)
'			myCode.SendError(LastException,Activity.Title&"-t1_tick")
'		End Try
'	End If
'End Sub

Sub t1_tick
	t1.Enabled=False
	If gmap.IsInitialized Then
		Try
'			Dim cl As CameraPosition
'			cl.Initialize(gmap.MyLocation.Latitude,gmap.MyLocation.Longitude,15)
'			gmap.AnimateCamera(cl)
'			TxtLat.text = gmap.MyLocation.Latitude
'			TxtLon.text = gmap.MyLocation.Longitude
			Log("GetLocation ok")
'			Dim cl As CameraPosition
'			cl.Initialize(gmap.MyLocation.Latitude,gmap.MyLocation.Longitude,15)
'			gmap.AnimateCamera(cl)
'			Dim Lat As String = gmap.MyLocation.Latitude
'			Dim Lon As String = gmap.MyLocation.Longitude
'			MCode.Lat = Lat
'			MCode.Lon = Lon
'			Gps.Stop
'			Log(Lat)
'			Log(Lon)
			
			
			loc.Initialize(gmap.MyLocation.Latitude,gmap.MyLocation.Longitude)
			If loc.IsInitialized Then
				MCode.Lat = loc.Latitude
				MCode.Lon = loc.Longitude
				Log(MCode.Lat)
				Log(MCode.Lon)
				Gps.Stop
			End If
			
		Catch
			Log(LastException)
			myCode.SendError(LastException, Activity.Title&"-t1_tick")
		End Try
	Else
		t1.Enabled=True
	End If
End Sub

Private Sub btnUpdate_Click	
	Activity.Finish
	StartActivity(Act_HavaleTozie)
End Sub

