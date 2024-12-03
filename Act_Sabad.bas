B4A=true
Group=Activity
ModulesStructureVersion=1
Type=Activity
Version=9.8
@EndOfDesignText@
#IgnoreWarnings:34
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
#End Region

Sub Process_Globals
'	Private t1 As Timer
'	Dim GPS1 As GPS
	Private ion As Object
End Sub

Sub Globals
	Private rp As RuntimePermissions
	Dim HLV As Hitex_LayoutView
	Dim Key As IME
	Dim ListSabad,OriginalItemList As List
	Dim ListTasvie As List
	Private LblBasketCount As Label
	Private BtnSabtSefaresh As Button
	Private LblNameMoshtari As Label
	Private TxtSharhFaktor As EditText
	Private gmap As GoogleMap
'	Private MapFragment1 As MapFragment
	Private Dialog As B4XDialog
	Private XUI As XUI
	Private pnl_HLV As Panel
	Private pnlTop As Panel
	Private pnlNS As Panel
	Private FeeTip As String
	Private SumTakhfifRiali As Long=0
	Private CmbBox1 As B4XComboBox
	Private LblCodeMoshtari As Label
	Private txtMablaghTakhfifiKol As EditText
	Private lblMablaghTakhfifiKol As Label
	Private lblMojavezSefareshText As Label
	Private chAmani As ACCheckBox
	Dim num As Int=0
	Private Fused As FusedLocationProviderClient
	Dim ShomareSefaresh As String=0
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Activity.LoadLayout("L_Sabadkharid")
	Try
'	t1.Initialize("t1",5000)
		Fused.Initialize("FusedLocation")
	HLV.Initializer("HLV").ListView.Build
	pnl_HLV.AddView(HLV,0,0,pnl_HLV.Width,pnl_HLV.Height)
	Dialog.Initialize (Activity)
'	NiceSpinner.Initialize("NiceSpinner",True,False)
'	pnlNS.AddView(NiceSpinner,0,0,pnlNS.Width,pnlNS.Height)
'	NiceSpinner.TextColor = Colors.Black
'	NiceSpinner.Gravity = Gravity.CENTER
'	NiceSpinner.Typeface = Typeface.LoadFromAssets("p_font.ttf")
	Dim op As ColorDrawable
	op.Initialize2(Colors.White,8dip,2dip,Colors.Black)
'	NiceSpinner.Background=op
	
	'Sleep(100)
	
	
	
	Key.Initialize("Key")
	ListSabad.Initialize
	OriginalItemList.Initialize
	ListSabad.Clear
	OriginalItemList.Clear
	HLV.Show
	
'	Dim Cu As Cursor = MCode.Result("Select FldTipFee From TblAshkhas Where FldC_Ashkhas = '"& MCode.CodeMoshtari &"'")
'	If Cu.RowCount>0 Then
'		Cu.Position=0
'		FeeTip = Cu.GetString("FldTipFee")
'	Else
'		FeeTip =0
'	End If

'	LoadListSabad
		If  MCode.Action="SabtFaktor" Then
		ListTasvie.Initialize
		ListTasvie=LoadAcSpNoeTasvie
		LoadNoeTasvie
			pnlNS.Visible=True
		Else
			pnlNS.Visible=False
			
	End If
	RefreshLblSabad
	'CreatePage	
'	myCode.TextBoxBackColorWhite(TxtSharhFaktor)
'	GPS1.Initialize("GPS1")
'		GPS1.Stop
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-Activity_Create")
	End Try
End Sub

Private Sub MojavezSefaresh
	Select MCode.MojavezSefaresh
		Case 0
			lblMojavezSefareshText.Text=""
		Case 1
			lblMojavezSefareshText.Text="توجه : شما مجوز فروش کل را ندارید"
		Case 2
			lblMojavezSefareshText.Text="توجه : شما مجوز فروش جزء را ندارید"
	End Select
End Sub

Sub LoadAcSpNoeTasvie As List
	Try
	Dim ListTasvie As List
	ListTasvie.Initialize
	Dim Cu As Cursor =MCode.Result("Select * From TblTasvie")
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
		MCode.ArrayTasvieForKala=SomeArray
	End If
	Return ListTasvie
'	NiceSpinner.Show(Colors.blue, 16)
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-LoadAcSpNoeTasvie")
		Return Null
	End Try
End Sub
Sub CreatePage
Try	
If ListTasvie.IsInitialized=False Then
		ListTasvie.Initialize
		ListTasvie=LoadAcSpNoeTasvie
		LoadNoeTasvie
End If
	LblCodeMoshtari.Text=MCode.C_Tafzili
	LblNameMoshtari.Text=MCode.N_Tafzili
	
	If MCode.FaktorSelect<>"" Then
		Dim Cu As Cursor = MCode.Result("Select * From TblSabad")
		If Cu.RowCount>0 Then
			Cu.Position=0
'			TxtSharhFaktor.Text = Cu.GetString("FldTozihat")
			
			For i=0 To ListTasvie.Size-1
				Dim Item = ListTasvie.Get(i) As AdapterListNoeTasvie
				If Item.FldC_Tasvie=Cu.GetString("FldVaziatPardakht") Then
					CmbBox1.SelectedIndex=i+1
				End If
				Next
				If Cu.GetString("fldSharh") = ""  Or Cu.GetString("fldSharh") = "("&CmbBox1.cmbBox.SelectedItem&")" Then
					TxtSharhFaktor.Text = ""
				Else
					TxtSharhFaktor.Text = Cu.GetString("fldSharh").Replace("("&CmbBox1.cmbBox.SelectedItem&")","")
				End If
			End If
		Else
		
	End If
	If MCode.Amani=1 Then
		chAmani.Visible=True
		Else
		chAmani.Visible=False
	End If
	If MCode.Action="SabtMarjooii" Then
'		AcSpTasvie.Visible=False
		CmbBox1.cmbBox.Visible=False
		'LblDarsadSoodVisitor.Visible=False
		lblMablaghTakhfifiKol.Visible=False
		txtMablaghTakhfifiKol.Visible=False
		TxtSharhFaktor.Hint="علت مرجوعی کالا"
		Else
		
		End If
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-CreatePage")
	End Try
End Sub

Sub LoadListSabad
	Try
	ProgressDialogShow("")
	OriginalItemList.Clear
	Dim Cu1 As Cursor = MCode.Result("Select * From TblSabad")
	SumTakhfifRiali=0
	LogColor(Cu1.RowCount,Colors.Red)
	For i=0 To Cu1.RowCount-1
		Cu1.Position=i
		Dim ItemKala As AdapterListKala
		ItemKala.CodeKala=Cu1.Getstring("FldCodeKala")
		ItemKala.NameKala=Cu1.Getstring("FldNameKala")
		ItemKala.FeeForoosh=Cu1.Getstring("FldFeeForoosh")
		ItemKala.fldFeeBadAzTakhfif=Cu1.Getstring("fldFeeBadAzTakhfif")
		ItemKala.NameVahed=Cu1.Getstring("FldNamevahed")
		ItemKala.NameVahed2=Cu1.Getstring("FldNameVahed2")
		ItemKala.fldPathPic=Cu1.Getstring("fldPathPic")
		ItemKala.TedadDarSabadJoz=myCode.Is_Null_adad(Cu1.Getstring("FldTedadDarSabadJoz"))
		ItemKala.TedadDarSabadKol=myCode.Is_Null_adad(Cu1.Getstring("FldTedadDarSabadKol"))
		ItemKala.Tozihat=myCode.Is_Null(Cu1.Getstring("FldTozihat"))
		ItemKala.FldMablaghMasrafKonande=myCode.Is_Null(Cu1.Getstring("FldMablaghMasrafKonande"))
		ItemKala.MablaghTakhfif=myCode.Is_Null_adad(Cu1.Getstring("FldMablaghTakhfif"))		
		ItemKala.fldDarsadTakhfif=myCode.Is_Null_adad(Cu1.Getstring("FldDarsadTakhfif"))	
		ItemKala.fldArzeshAfzodeKala=myCode.Is_Null_adad(Cu1.Getstring("fldArzeshAfzode"))
		ItemKala.fldDarsadArzeshAfzodeKala=myCode.Is_Null_adad(Cu1.Getstring("fldDarsadArzeshAfzode"))
		ItemKala.TedadDarKarton=myCode.Is_Null_adad(Cu1.Getstring("FldTedadDarKarton"))
			If MCode.Action<>"SabtMarjooii" And MCode.Action<>"UpdateMarjooii" Then
			
				Dim SumMande As String=MCode.SingleResult("select SumMande from TblKala where FldCodeKala="& ItemKala.CodeKala)
				ItemKala.SumMande=SumMande-ItemKala.TedadDarSabadJoz
				If ItemKala.NameVahed2 <> "" Then
					Dim FldFeeForoosh As Int = MCode.Sf.Val(Cu1.GetInt("fldFeeForoosh"))
					Dim FldTedadDarKarton As Int = MCode.Sf.Val(Cu1.Getstring("FldTedadDarSabadKol"))

					ItemKala.FeeForooshKarton=FldFeeForoosh * FldTedadDarKarton
					ItemKala.SumMandeKarton=Round2( SumMande / FldTedadDarKarton,0)-myCode.Is_Null_adad(ItemKala.TedadDarSabadKol)
				End If
			
			
			
				
'				Dim FldSumMande As String=MCode.SingleResult("select SumMande from TblKala where FldCodeKala="& ItemKala.CodeKala)
'				Log(Cu1.Getstring("FldSumMande"))
'				Log(Cu1.Getstring("FldTedadDarKarton"))
'				ItemKala.SumMande=myCode.Is_Null_adad(FldSumMande)
'				ItemKala.SumMandeKarton=Round2( FldSumMande / Cu1.Getstring("FldTedadDarKarton"),0)	-	ItemKala.TedadDarSabadKol
				Log(ItemKala.SumMande)
				
'				If Cu1.Getstring("fldNameVahed2") <> "" Then
'					Dim FldFeeForoosh As Int = MCode.Sf.Val(Cu1.GetInt("fldFeeForoosh"))
'					Dim FldTedadDarKarton As Int = MCode.Sf.Val(Cu1.Getstring("FldTedadDarSabadKol"))
'					Dim SumMande As Int = Cu1.Getstring("SumMande")
'					ItemKala.FeeForooshKarton=FldFeeForoosh * FldTedadDarKarton
'					ItemKala.SumMandeKarton=Round2( SumMande / FldTedadDarKarton,0)-myCode.Is_Null_adad(ItemKala.TedadDarSabadKol)
'				End If
			Else
				Dim SumMande As String=MCode.SingleResult("select SumMande from TblKala where FldCodeKala="& ItemKala.CodeKala)
				ItemKala.SumMande=SumMande
				ItemKala.SumMandeKarton=Round2( SumMande / myCode.Is_Null_adad(Cu1.Getstring("FldTedadDarKarton")),0)	-	ItemKala.TedadDarSabadKol
			End If
	
		ItemKala.FldEshantion=myCode.Is_Null_adad(Cu1.Getstring("FldEshantion"))
		ItemKala.fldShomareForoosh=myCode.Is_Null_adad(Cu1.Getstring("fldShomareForoosh"))
		ItemKala.FldAmani=myCode.Is_Null_adad(Cu1.Getstring("FldAmani"))
			If MCode.IsAmani=1 Then
			chAmani.Checked=True
			Else
			chAmani.Checked=False
		End If
		OriginalItemList.Add(ItemKala)
	Next
	ListSabad=OriginalItemList
	HLV.notifyDataSetChanged
	'RefreshLblSabad
	'UpdateSumSabad
	ProgressDialogHide
		If ListSabad.Size=0 Then
		
		Activity.Finish
			CallSubDelayed(Act_KalaDefault,"btn_Back_Click")
		End If
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-LoadListSabad")
	End Try
End Sub

Sub LoadNoeTasvie
	Try
	Dim ItemTasvie As AdapterListNoeTasvie
	ItemTasvie.Initialize
	CmbBox1.cmbBox.Add("انتخاب کنید")
	Dim count As Int =ListTasvie.Size
	If count> 0 Then
		For i = 0 To count-1
				ItemTasvie=ListTasvie.Get(i)
				'ListTasvie.Add(ItemTasvie)
				CmbBox1.cmbBox.Add(ItemTasvie.FldN_Tasvie)
		Next
		CmbBox1.SelectedIndex=MCode.feeTip
		End If
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-LoadNoeTasvie")
	End Try
End Sub

Sub RefreshLblSabad
'	Try
'	Dim Cu As Cursor = MCode.Result("Select * From TblSabad")
'	If Cu.RowCount>0 Then
''		LblBasketCount.Visible=True
''		LblBasketCount.Text=Cu.RowCount
'	Else
'		LblBasketCount.Visible=False
'		End If
'	Catch
'		Log(LastException)
'		myCode.SendError(LastException,Activity.Title&"-RefreshLblSabad")
'	End Try
End Sub

Sub HLV_GetItemCount As Int 								        '💯 ItemCount 💯'
	Return ListSabad.Size
End Sub

Sub HLV_onCreateViewHolder (Parent As Panel, ViewType As Int)      '💎 onCreate 💎'
	Dim rec As cls_RecSabadKharidItem
	rec.Initialize(Me)
	Parent.AddView(rec.Panel,0,0,rec.Width,rec.Height)
	Parent.Tag=rec
End Sub

Sub HLV_onBindViewHolder (Parent As Panel, Position As Int)         '💠 onBind 💠'
	Dim rec As cls_RecSabadKharidItem=Parent.Tag
	rec.show_data(ListSabad.Get(Position))
	Parent.Height=rec.Height
End Sub

Sub LblExit_Click
	Try
	Dim Res As Int
	Dim LblExit As Label = Sender
'	Log(LblExit.Tag)
	Dim Item = ListSabad.Get(LblExit.Tag) As AdapterListKala
	Res=Msgbox2("آیا می خواهید این ردیف حذف گردد؟","توجه","بله","","خیر",Null)
	If Res=DialogResponse.POSITIVE Then
		MCode.SaveUpdate("Delete From TblSabad Where FldCodeKala = '"& Item.CodeKala &"'")
		ListSabad.RemoveAt(LblExit.Tag)
		HLV.notifyItemRemoved(LblExit.Tag)
		HLV.notifyDataSetChanged
'		DeleteItemFromListKala(Item.FldC_Kala)
		'RefreshLblSabad
		UpdateSumSabad
		End If
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-LblExit_Click")
	End Try
End Sub

Sub UpdateSumSabad
	Try
	Log("---->"&(CmbBox1.SelectedIndex+1))
	
	MCode.CreateReportSabad
	num=num+1
	Log(num)
	If MCode.FinalFaktor.KhamFaktor > 0 Then
		If MCode.FaktorSelect="" Then
			If MCode.Action="SabtMarjooii" Then
				BtnSabtSefaresh.Text = "ثبت فاکتور مرجوعی"
			Else If MCode.Action="SabtFaktor" Then
				BtnSabtSefaresh.Text = NumberFormat2(MCode.FinalFaktor.GablePardakht,0,0,0,True) & " " & MCode.VahedPool & "    " & "ثبت سفارش"
			End If
			
		Else
			BtnSabtSefaresh.Text = NumberFormat2(MCode.FinalFaktor.GablePardakht,0,0,0,True) & " " & MCode.VahedPool & "    " & "اصلاح سفارش"
			End If
		
			If MCode.ManedEtebarEnable And MCode.FinalFaktor.GablePardakht> MCode.MandeEtebar Then
					ToastMessageShow("جمع مبلغ سفارش از اعتبار مشتری بیشتر میباشد.",True)
			End If
	'	LblDarsadSoodVisitor.Text = NumberFormat2(MCode.FinalFaktor.SoodVisitor,0,0,0,True) & " " & MCode.VahedPool
	Else
		''Activity_KeyPress(KeyCodes.KEYCODE_BACK)
		End If
'		LoadListSabad
		'HLV.notifyDataSetChanged
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-UpdateSumSabad")
	End Try
End Sub

Sub SaveChange
	HLV.notifyDataSetChanged
	UpdateSumSabad
End Sub

Sub Activity_Resume

	Try
		If MCode.IsConnected=False And MCode.ConnectionStatus=1 Then
			ToastMessageShow("لطفا ارتباط اینترنت گوشی خود را بررسی نمایید",False)
'			Msgbox2Async("لطفا ارتباط اینترنت گوشی خود را بررسی نمایید", "قطعی اینترنت", "باز کردن تنظیمات گوشی", "", "", Null, False)
'			Wait For Msgbox_Result(res As Int)
'			If  res= DialogResponse.POSITIVE Then
'				Dim StartIntent As Intent
'				StartIntent.Initialize("android.settings.SETTINGS", "")
'				StartActivity(StartIntent)
'			End If
		End If
		LoadListSabad
		UpdateSumSabad
		CreatePage
		MojavezSefaresh
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-Activity_Resume")
	End Try
	'LoadAcSpNoeTasvie
End Sub

Sub Activity_Pause (UserClosed As Boolean)
'	GPS1.Stop
End Sub

Sub Activity_KeyPress (KeyCode As Int) As Boolean 'Return True to consume the event
	Try
	If KeyCode=KeyCodes.KEYCODE_BACK Then
		If MCode.page="KalaDefault" Then
			Log(MCode.feeTip)
			StartActivity(Act_KalaDefault)
		Else if MCode.page="Kala_listi" Then
			StartActivity(Act_Kala_listi)
		Else If MCode.page="SabtMarjooii" Then
			StartActivity(Act_KalaDefault)
		End If		
		Activity.Finish
		End If
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-Activity_Resume")
	End Try
	Return True
End Sub

Sub GetLocation
	If Fused.IsLocationEnabledInSettings Then
		Fused.GetLocationAvailability

		Wait For FusedLocation_LocationAvailabilityRequestCompleted (Available As Boolean)
		Log("LocationAvailable=" & Available)
		If Available Then
			Fused.GetLastLocation
			Wait For FusedLocation_LocationRequestCompleted (Result As LocationResult)
			If Result.Status=LocationResult.STATUS_SUCCESSFUL Then
				If Result.Location.IsInitialized Then
					Dim LastLocation As LocationF = Result.Location
					Log("LastLocation Latitude = " & LastLocation.Latitude)
					Log("LastLocation Longitude = " & LastLocation.Longitude)
					'Do whatever you want with other LocatioF properties and methods
					MCode.Lat = LastLocation.Latitude
					MCode.Lon = LastLocation.Longitude
					
				Else
					Log("Unknown last location")
				End If
			End If
		End If
	Else
		MsgboxAsync("Location is turned off in devices's settings. Turn it on.","Warning")
		StartActivity(Fused.LocationSettingsIntent)
	End If
End Sub

Sub BtnSabtSefaresh_Click
'	Dim i As String=Null
'	i=i*2
	LoadListSabad
'	If myCode.getSetting("setting.dat","addFactorComment",0) = 1 Then
'		If TxtSharhFaktor.Text = "" Then
'			ToastMessageShow("لطفا شرح فاکتور را وارد نمایید",True)
'			Return
'		End If
'	End If
	Try
'		If MCode.Signature=1 Then
'			If File.Exists(File.DirDefaultExternal & "/Parsik/Signature",MCode.C_Tafzili & ".png") =False Then
'				StartActivity(Act_Emza)
'				Return
'			End If
'		End If
	If MCode.Action="SabtFaktor" Then
			If CmbBox1.SelectedIndex=0 Then
				ToastMessageShow("لطفا نوع تسویه را مشخص کنید",False)
				Return
			End If
			If MCode.ManedEtebarEnable=True And MCode.MandeEtebar=0 Then
				ToastMessageShow("سقف اعتبار این مشتری به اتمام رسیده است.",False)
				Return
			End If
	
			If MCode.ManedEtebarEnable And MCode.FinalFaktor.GablePardakht> MCode.MandeEtebar Then
				ToastMessageShow("جمع مبلغ سفارش از اعتبار مشتری بیشتر میباشد.",True)
				Return
			End If
			
'			If MCode.SaveFactorInLocation Then
'				Wait For GetLocation
'				Dim cu As Cursor=MCode.Result("select * from TblAshkhas where fldCodetafzili="&	MCode.C_Tafzili)
'				cu.Position=0
'				Dim Lat,Lon As String
'				Lat=cu.GetString("FldLat")
'				Lon=cu.GetString("FldLon")
'				Dim distance As Long =MCode.CalculateDistance(MCode.Lat,MCode.Lon,Lat,Lon)
'				Log(distance)
'				If distance > MCode.Masafat Then
'					ToastMessageShow("ثبت سفارش خارج از موقعیت مکانی مشتری امکان پذیر نیست.",False)
'					Return
'				End If
'			End If

			
			
'			If MCode.Signature=1 Then
'				If File.Exists(File.DirDefaultExternal & "/Parsik/Signature",MCode.C_Tafzili & ".png") =False Then
'					StartActivity(Act_Emza)
'					Return
'				End If
'			End If
		
			SaveFaktor
'		Dim isPos As Int = myCode.getSetting("setting.dat","isPos",0)
'		If CmbBox1.SelectedIndex=3 And isPos=1 Then
'			PayMali
'		End If
		Else If MCode.Action="SabtMarjooii" Or MCode.Action="UpdateMarjooii" Then
			If MCode.Action="SabtMarjooii" Then
				MCode.FaktorSelect=""
			End If
	
		SaveMarjooii
		End If
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-BtnSabtSefaresh_Click")
	End Try
End Sub





Sub CheckSaveFaktor
	Try
	If MCode.VoroodTozihKala = 1 Then
		For i=0 To ListSabad.Size-1
			Dim Item = ListSabad.Get(i) As AdapterListKala
			If Item.Tozihat.Length = 0 Then
				Msgbox("توضیح کالا مربوط به " & "'" & Item.NameKala & "'" & " وارد نشده است." & CRLF & "تا زمانی که توضیحات برای تمامی کالاهای انتخابی شما وارد نشده باشد اجازه ثبت فاکتور را ندارید","توجه")
				Return
			End If
			If Item.Tozihat = "" Then
				Msgbox("توضیح کالا مربوط به " & "'" & Item.NameKala & "'" & " وارد نشده است." & CRLF & "تا زمانی که توضیحات برای تمامی کالاهای انتخابی شما وارد نشده باشد اجازه ثبت فاکتور را ندارید","توجه")
				Return
			End If
		Next
	End If
	

		
'		If MCode.FaktorSelect = "" Then
'			'=====================================Gps================================
'			If MCode.Gps = 1 Then
'				If GPS1.GPSEnabled = False Then
'					ToastMessageShow("موقعیت مکانی خود را روشن کنید", True)
'					t1.Enabled=False
'				Else
'					ProgressDialogShow2("در حال دریافت موقعیت و ذخیره فاکتور",False)
'					t1.Enabled=True
''					GPS1.Start(1,1)
'				End If
'			Else If MCode.Gps = 0 Then
'				SaveFaktor("","")
'			End If
'			'========================================================================
'		Else
'			Dim Cu As Cursor = MCode.Result("Select * From TblFaktor Where FldShomareFaktor = '"& MCode.FaktorSelect &"'")
'			If Cu.RowCount>0 Then
'				Cu.Position=0
'				SaveFaktor(Cu.GetString("FldLat"),Cu.GetString("FldLon"))
'			End If
'		End If

	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-CheckSaveFaktor")
	End Try
'	Else
'		ToastMessageShow("حداقل سقف خرید " & NumberFormat2(MCode.SaghfForoosh,0,0,0,True) & "می باشد",True)
'	End If
End Sub

'Sub GPS1_LocationChanged (Location1 As Location)
''	SaveFaktor(Location1.Latitude,Location1.Longitude)
''	GPS1.Stop
'End Sub



Sub SaveFaktor()
	Try
	
	
	
	Dim ShomareFaktor As Int
	Dim ImageSignature As String
	'Dim Date As String = MCode.GetDateNow
'	Dim Date As String = MCode.ConvertNumbersPersian2English(DateTime.Now)
	Dim pDate As String = MCode.ConvertNumbersPersian2English(MCode.DatePersian)
	Dim Time As String = MCode.ConvertNumToTime(MCode.ConvertNumbersPersian2English(DateTime.Time(DateTime.Now)))
	
	'Tm = Regex.Split(":",Time)
	'Time=MCode.ConvertNumbersPersian2English(Tm(0)) & MCode.ConvertNumbersPersian2English(Tm(1))
	Dim DT As String=TxtSharhFaktor.text &" ("&pDate &"-"& Time&") "
	Log("->>"&DT)
	If MCode.FaktorSelect = "" Then
		Dim Cu As Cursor = MCode.Result("Select Max(Cast(FldShomareFaktor As Int)) As MaxFldShomareFaktor From TblFaktor")
		Cu.Position=0
		If Cu.GetString("MaxFldShomareFaktor") = Null Then
			ShomareFaktor = 1
		Else
			ShomareFaktor = Cu.GetString("MaxFldShomareFaktor") + 1
		End If
		ShomareSefaresh=ShomareFaktor
	Else
		ShomareFaktor = MCode.FaktorSelect
	End If
	
	Dim ItemTasvie=ListTasvie.Get(CmbBox1.SelectedIndex-1) As AdapterListNoeTasvie
	If TxtSharhFaktor.Text.Trim = "" Then TxtSharhFaktor.Text =""
	
	If MCode.FaktorSelect <> "" Then
		MCode.SaveUpdate("Delete From TblFaktor Where FldShomareFaktor = '"& MCode.FaktorSelect &"'")
		End If
	
		'	If txtMablaghTakhfifiKol.Text<>"" Then
'		MablaghTakhfifKol=txtMablaghTakhfifiKol.Text
'		Else
'			MablaghTakhfifKol=0
'	End If
		
	Dim Sum As Long = MCode.FinalFaktor.KhamFaktor
	Dim SumMablaghTakhfifVizhe As Long=MCode.FinalFaktor.TakhfifVizhe
	Dim SumMablaghTakhfifKala As Long=MCode.FinalFaktor.TakhfifKala
	Dim MablaghTakhfifKol As Long=SumMablaghTakhfifKala+SumMablaghTakhfifVizhe

	Dim TotalFaktor As Long = MCode.FinalFaktor.GablePardakht
	Dim MablaghArzeshAfzode As Long=MCode.MohasbeArzeshAfzode(TotalFaktor)
	
	If MCode.Signature = 1 Then
		ImageSignature =MCode.Encrypted(MCode.ConvertBlobToString(File.DirDefaultExternal & "/Parsik/Signature", MCode.C_Tafzili & ".png"))
	Else
		ImageSignature = ""
	End If
	
	Dim lst As List
	lst.Initialize
	For i=0 To OriginalItemList.Size-1
		Dim Item = OriginalItemList.Get(i) As AdapterListKala
		Dim fee As Int
		Dim fldFeeBadAzTakhfif As Int=Item.fldFeeBadAzTakhfif		
		If Item.TedadDarSabadJoz>0 Or Item.TedadDarSabadKol>0 Then
			#region ----------------------			 
			fee= Item.FeeForoosh			
			Dim m As Map
			m.Initialize
			m.Put("FldRadif",i+1)
			m.Put("FldC_Visitor",MCode.C_Visitor)
			m.Put("FldC_Tafzili",MCode.C_Tafzili)
			m.Put("FldN_Tafzili",MCode.N_Tafzili)
			m.Put("FldShomareFaktor",ShomareFaktor)
			m.Put("FldShomareBargasht",0)
			m.Put("FldCodeKala",Item.CodeKala)
			m.Put("FldNameKala",Item.NameKala)
			m.Put("FldFeeForoosh",fee)
			m.Put("fldFeeBadAzTakhfif",Item.FldFeeBadAzTakhfif)
			m.Put("FldMablaghTakhfif",Item.MablaghTakhfif)
			m.Put("FldSumMablaghTakhfifVizhe",IIf(Item.MablaghTakhfif>0,SumMablaghTakhfifVizhe,0))
			m.Put("FldSumMablaghTakhfifKala",SumMablaghTakhfifKala)
			m.Put("FldNameVahed",Item.NameVahed)
			m.Put("FldNameVahed2",Item.NameVahed2)
			m.Put("FldSumMande",Item.SumMande)
			m.Put("fldPathPic",Item.fldPathPic)
			m.Put("FldTedadDarSabadJoz",Item.TedadDarSabadJoz)
			m.Put("FldTedadDarSabadKol",Item.TedadDarSabadKol)
			m.Put("FldTedadDarkarton",Item.TedadDarKarton)
			m.Put("FldTotalFaktor",IIf(Item.fldDarsadTakhfif=100,0,TotalFaktor))
			m.Put("FldTozihat",Item.Tozihat)
			m.Put("FldTozih",TxtSharhFaktor.Text & " (" & CmbBox1.cmbBox.SelectedItem&")")
			m.Put("FldVaziatPardakht",ItemTasvie.FldC_Tasvie)
			m.Put("FldMablaghKol",Sum)
			m.Put("FldMablaghTakhfifKol",MablaghTakhfifKol)
			m.Put("FldDarsadTakhfif",myCode.Is_Null_adad(Item.fldDarsadTakhfif))
			m.Put("fldArzeshAfzode",Item.fldArzeshAfzodeKala)
			m.Put("fldDarsadArzeshAfzode",Item.fldDarsadArzeshAfzodeKala) 
			'm.Put("FldLat",Lat)
			'm.Put("FldLon",Lon)
			m.Put("FldTarikh",pDate)
			m.Put("FldDate",pDate)
			m.Put("FldTime",Time)
			m.Put("FldSignatureBitmapString",ImageSignature)
			m.Put("fldShomareForoosh",myCode.Is_Null_adad(Item.fldShomareForoosh))
			m.Put("FldSync","False")
			m.Put("WIsBacked","False")
			m.Put("FldType","Foroosh")
				m.Put("FldAmani",MCode.isAmani)
			m.Put("WSendFrom",3)
			lst.Add(m)
			#end region ---------------------
			
'			KasreMojodi(Item.CodeKala,Item.TedadDarKarton+(Item.TedadDarSabadKol*Item.TedadDarKarton))
			If Item.TedadDarSabadJoz>0 And Item.TedadDarSabadKol>0 Then
					KasreMojodi(Item.CodeKala,Item.TedadDarSabadJoz)
					KasreMojodi(Item.CodeKala,(Item.TedadDarSabadKol*Item.TedadDarKarton))
'					KasreMojodi(Item.CodeKala,Item.TedadDarKarton+(Item.TedadDarSabadKol*Item.TedadDarKarton))
				
			Else
			If Item.TedadDarSabadJoz>0 Then
					KasreMojodi(Item.CodeKala,Item.TedadDarSabadJoz)
			End If
			
			If Item.TedadDarSabadKol>0 Then
						KasreMojodi(Item.CodeKala,(Item.TedadDarSabadKol*Item.TedadDarKarton))
'					KasreMojodi(Item.CodeKala,Item.TedadDarKarton+(Item.TedadDarSabadKol*Item.TedadDarKarton))
			End If

		End If
	End If
		If Item.FldEshantion>0 Then
			#region ----------------------
			Item.MablaghTakhfif=Item.FeeForoosh
			Item.fldDarsadTakhfif=100
			Dim m As Map
			m.Initialize
			m.Put("FldRadif",i+1)
			m.Put("FldC_Visitor",MCode.C_Visitor)
			m.Put("FldC_Tafzili",MCode.C_Tafzili)
			m.Put("FldN_Tafzili",MCode.N_Tafzili)
			m.Put("FldShomareFaktor",ShomareFaktor)
			m.Put("FldShomareBargasht",0)
			m.Put("FldCodeKala",Item.CodeKala)
			m.Put("FldNameKala",Item.NameKala)
			m.Put("FldFeeForoosh",0)
			m.Put("fldFeeBadAzTakhfif",0)
			m.Put("FldMablaghTakhfif",Item.MablaghTakhfif)
			m.Put("FldSumMablaghTakhfifVizhe",0)
			m.Put("FldSumMablaghTakhfifKala",0)
			m.Put("FldNameVahed",Item.NameVahed)
			m.Put("FldNameVahed2",Item.NameVahed2)
			m.Put("FldSumMande",Item.SumMande)
			m.Put("fldPathPic",Item.fldPathPic)
			m.Put("FldTedadDarSabadJoz",Item.FldEshantion) '-tedad eshantion
			m.Put("FldTedadDarSabadKol",Item.TedadDarSabadKol)
			m.Put("FldTedadDarkarton",Item.TedadDarKarton)
			m.Put("FldTotalFaktor",IIf(Item.fldDarsadTakhfif=100,0,TotalFaktor))
			m.Put("FldTozihat","اشانتیون")
'			m.Put("FldTozih",DT & " - " & ItemTasvie.FldN_Tasvie)
			m.Put("FldTozih",TxtSharhFaktor.Text & " (" & CmbBox1.cmbBox.SelectedItem&")")
			m.Put("FldVaziatPardakht",ItemTasvie.FldC_Tasvie)
			m.Put("FldMablaghKol",Sum)
			m.Put("FldMablaghTakhfifKol",Item.MablaghTakhfif)
			m.Put("FldDarsadTakhfif",100)
			m.Put("fldArzeshAfzode",Item.fldArzeshAfzodeKala)
			m.Put("fldDarsadArzeshAfzode",Item.fldDarsadArzeshAfzodeKala)
			'm.Put("FldLat",Lat)
			'm.Put("FldLon",Lon)
			m.Put("FldTarikh",pDate)
			m.Put("FldDate",pDate)
			m.Put("FldTime",Time)
			m.Put("FldSignatureBitmapString",ImageSignature)
			m.Put("fldShomareForoosh",myCode.Is_Null_adad(Item.fldShomareForoosh))
			m.Put("FldSync","False")
			m.Put("WIsBacked","False")
			m.Put("FldType","Eshantion")
				m.Put("FldAmani",MCode.isAmani)
			m.Put("WSendFrom",3)
			lst.Add(m)
			#end region ---------------------
			KasreMojodi(Item.CodeKala,Item.FldEshantion)
		End If
	Next
	DBUtils.InsertMaps(MCode.Sql1,"TblFaktor",lst)
	MCode.feeTip=0
	MCode.feeCode=0
	'MCode.C_Tafzili=0
		MCode.isAmani=0
	Sleep(300)
	MCode.SaveUpdate("Delete From TblSabad")
	Sleep(300)
	If MCode.FaktorSelect="" Then
		Dim Cu As Cursor = MCode.Result("Select * from TblLogVisitSefaresh Where FldC_Ashkhas = '"& MCode.C_Tafzili &"'")
		If Cu.RowCount>0 Then
			MCode.SaveUpdate("Update TblLogVisitSefaresh Set FldSefaresh = '"& pDate &"' ,FldElatSefaresh = '' Where FldC_Ashkhas = '"& MCode.C_Tafzili &"'")
		Else
			MCode.SaveUpdate("Insert Into TblLogVisitSefaresh (FldC_Ashkhas,FldVisit,FldSefaresh,FldElatSefaresh) Values ('"& MCode.C_Tafzili &"','','"& pDate &"','')")
		End If
		MCode.SaveUpdate("Update TblAshkhas Set FldLastSefaresh = '"& pDate &"' Where fldCodetafzili = '"& MCode.C_Tafzili &"'")
		SaveLastVisit
'		MCode.SaveUpdate("Update TblVisitorTour Set FldLastSefaresh = '"& pDate &"' Where FldC_Ashkhas = '"& MCode.CodeMoshtari &"'")
	End If
	
	ProgressDialogHide
	If MCode.FaktorSelect="" Then
		ToastMessageShow("فاکتور شما ثبت گردید",True)
	Else
		ToastMessageShow("فاکتور شما اصلاح گردید",True)
	End If
'		Send_Faktor
	MCode.FaktorSelect=""
	'Activity.Finish
	Log(MCode.C_Tafzili)
		StartActivity(Act_Profile)
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-SaveFaktor")
	End Try
End Sub

Sub SaveLastVisit
	Try
	'ثبت آخرین بازدید مشتری=====================================
	DateTime.DateFormat="yyyy-MM-dd"
'	Dim DateMiladi As String = MCode.ConvertNumbersPersian2English(DateTime.Date(DateTime.Now))
		Dim DateShamsi As String = MCode.DatePersian
		Dim Time As String = DateTime.Time(DateTime.Now)
	
		Dim D As String = DateShamsi & "T" & Time
	LogColor("D: " & D,Colors.Red)
			
		MCode.SaveUpdate("Update TblAshkhas Set lastOrderDate = '"& D &"'  Where fldCodetafzili = '"& MCode.C_Tafzili &"'")
		
		If MCode.TourVisitSW And MCode.TourVisit=1 Then
			MCode.SaveUpdate("Update tblTourVisitor Set fldTimeSefaresh = '"& Time &"',fldShomareSefaresh='"& ShomareSefaresh &"',fldVaziat='3',fldSend='False' Where fldCodeTafzili = '"& MCode.C_Tafzili &"' and fldDateVisit='"& MCode.DatePersian &"' and fldType='Tour'")
		Else
			Dim Count As Int = MCode.SingleResult($"Select Count(fldRadif) from tblTourVisitor where  fldDateVisit='${MCode.DatePersian}' and fldType='Free'"$)
			Dim MaxRadif As Int
			If Count=0 Then
				MaxRadif=1
			Else
				MaxRadif= MCode.SingleResult($"Select Max(fldRadif) from tblTourVisitor where  fldDateVisit='${MCode.DatePersian}' and fldType='Free'"$)
				
			End If
			
			MCode.SaveUpdate("Update tblTourVisitor Set fldTimeSefaresh = '"& Time &"',fldShomareSefaresh='"& ShomareSefaresh &"',fldVaziat='3',fldSend='False' Where fldCodeTafzili = '"& MCode.C_Tafzili &"' and fldDateVisit='"& MCode.DatePersian &"' and fldType='Free' and fldRadif="&MaxRadif)
		End If
		'=======================================================
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-SaveLastVisit")
	End Try
End Sub
Sub Btn_SendFactor_Click
	ProgressDialogShow2("در حال ارسال موارد انتخابی . . .",False)
	Dim shomarefactor As Int=0
	shomarefactor=MCode.FaktorSelect
	If shomarefactor>0 Then
		CallSubDelayed2(Service_Server,"LoadSend",shomarefactor)
	End If
	
	Sleep(1000)
	'Activity.Finish
End Sub
Private Sub Send_Faktor
	Try
	Dim XUI As XUI
'	Dim sf As Object = xui.Msgbox2Async("این فاکتور ارسال گردد؟ لطفا قبل از تایید اینترنت دستگاه را روشن کنید.", "ارسال", "بله", "", "خیر", Null)
'	Wait For (sf) Msgbox_Result (Result As Int)
'	If Result = xui.DialogResponse_Positive Then
''		Dim Cu As Cursor = MCode.Result("Select * From TblFaktor where FldSync = 'False' Group by FldShomareFaktor Order by FldShomareFaktor desc")
''		Cu.Position=0
''		Dim sel As Int=0
''		sel=Cu.GetString("FldShomareFaktor")
''		ProgressDialogShow2("در حال ارسال مورد انتخابی . . .",False)
''		
''		Log(sel)
''		If sel>0 Then
''			CallSubDelayed2(Service_Server,"LoadSend",sel)
''		End If
'			Btn_SendFactor_Click
'	End If
	MCode.FaktorSelect=""
	Activity.Finish
		StartActivity(Act_Profile)
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-Send_Faktor")
	End Try
End Sub
Sub SaveFaktor_Marjoee
	Try
	'LoadListSabad
	Dim ShomareFaktor As Int
	Dim ShomareBargasht As Int
	Dim ImageSignature As String
	'Dim Date As String = MCode.GetDateNow
'	Dim Date As String = MCode.ConvertNumbersPersian2English(DateTime.Now)
		Dim pDate As String =  MCode.ConvertNumbersPersian2English(MCode.DatePersian)
	Dim Time As String = MCode.ConvertNumbersPersian2English(DateTime.Time(DateTime.Now))
	
	'Tm = Regex.Split(":",Time)
	'Time=MCode.ConvertNumbersPersian2English(Tm(0)) & MCode.ConvertNumbersPersian2English(Tm(1))
	Dim DT As String=TxtSharhFaktor.text &" ("&pDate &"-"& Time&") "
	Log("->>"&DT)
	If MCode.FaktorSelect = "" Then
		Dim Cu As Cursor = MCode.Result("Select Max(Cast(FldShomareFaktor As Int)) As MaxFldShomareFaktor From TblFaktor")
		Cu.Position=0
		If Cu.GetString("MaxFldShomareFaktor") = Null Then
			ShomareFaktor = 1
		Else
			ShomareFaktor = Cu.GetString("MaxFldShomareFaktor") + 1
		End If
	Else
		ShomareFaktor = MCode.FaktorSelect
	End If
	Dim Cu As Cursor = MCode.Result("Select Max(Cast(FldShomareBargasht As Int)) As MaxFldShomareBargasht From TblFaktor")
	Cu.Position=0
	If Cu.GetString("MaxFldShomareBargasht") = Null Then
		ShomareBargasht = 1
	Else
		ShomareBargasht = Cu.GetString("MaxFldShomareBargasht") + 1
	End If
	'Dim ItemTasvie=ListTasvie.Get(CmbBox1.SelectedIndex) As AdapterListNoeTasvie
	If TxtSharhFaktor.Text.Trim = "" Then TxtSharhFaktor.Text =""
	
	If MCode.FaktorSelect <> "" Then
		MCode.SaveUpdate("Delete From TblFaktor Where FldShomareFaktor = '"& MCode.FaktorSelect &"'")
	End If
	
		Dim Sum As Long = MCode.FinalFaktor.KhamFaktor
		Dim TotalFaktor As Long = Sum
		Dim SumMablaghTakhfifVizhe As Long=MCode.FinalFaktor.TakhfifVizhe
		Dim SumMablaghTakhfifKala As Long=MCode.FinalFaktor.TakhfifKala
		Dim MablaghTakhfifKol As Long=SumMablaghTakhfifKala+SumMablaghTakhfifVizhe
		Dim MablaghArzeshAfzode As Long=MCode.MohasbeArzeshAfzode(TotalFaktor)
		
	If MCode.Signature = 1 Or ImageSignature<>"" Then
		ImageSignature = MCode.Encrypted(MCode.ConvertBlobToString(File.DirDefaultExternal & "/parsik/Signature", MCode.CodeMoshtari & ".png"))
	Else
		ImageSignature = ""
	End If
	
	Dim lst As List
	lst.Initialize
	For i=0 To OriginalItemList.Size-1
	Dim Item = OriginalItemList.Get(i) As AdapterListKala
	If Item.TedadDarSabadJoz>0 Or Item.TedadDarSabadKol>0 Then
			#region ----------------------
		Dim m As Map
		m.Initialize
		m.Put("FldRadif",i+1)
		m.Put("FldC_Visitor",MCode.C_Visitor)
		m.Put("FldC_Tafzili",MCode.C_Tafzili)
		m.Put("FldN_Tafzili",MCode.N_Tafzili)
		m.Put("FldShomareFaktor",ShomareFaktor)
		m.Put("FldShomareBargasht",ShomareBargasht)
		m.Put("FldCodeKala",Item.CodeKala)
		m.Put("FldNameKala",Item.NameKala)
		m.Put("FldFeeForoosh",Item.FeeForoosh)
		m.Put("fldFeeBadAzTakhfif",Item.FldFeeBadAzTakhfif)
		m.Put("FldMablaghTakhfif",Item.MablaghTakhfif)
		m.Put("FldSumMablaghTakhfifVizhe",SumMablaghTakhfifVizhe)
		m.Put("FldSumMablaghTakhfifKala",SumMablaghTakhfifKala)
		m.Put("FldNameVahed",Item.NameVahed)
		m.Put("FldNameVahed2",Item.NameVahed2)
		m.Put("FldSumMande",Item.SumMande)
		m.Put("fldPathPic",Item.fldPathPic)
		m.Put("FldTedadDarSabadJoz",Item.TedadDarSabadJoz)
		m.Put("FldTedadDarSabadKol",Item.TedadDarSabadKol)
		m.Put("FldTedadDarkarton",Item.TedadDarKarton)
		m.Put("FldTotalFaktor",TotalFaktor)
		m.Put("FldTozihat",Item.Tozihat)
		m.Put("FldTozih",TxtSharhFaktor.Text & " (مرجوعی)")
'		m.Put("FldTozih",TxtSharhFaktor.Text)
		m.Put("FldVaziatPardakht",0)
		m.Put("FldMablaghKol",Sum)
		m.Put("FldMablaghTakhfifKol",MablaghTakhfifKol)
		m.Put("FldDarsadTakhfif",myCode.Is_Null_adad(Item.fldDarsadTakhfif))
		m.Put("fldArzeshAfzode",Item.fldArzeshAfzodeKala)
		m.Put("fldDarsadArzeshAfzode",Item.fldDarsadArzeshAfzodeKala)
		m.Put("FldMablaghKol",Sum)
'		m.Put("FldLat",Lat)
'		m.Put("FldLon",Lon)
		m.Put("FldTarikh",pDate)
		m.Put("FldDate",pDate)
		m.Put("FldTime",Time)
		m.Put("FldSignatureBitmapString",ImageSignature)
		m.Put("fldShomareForoosh",myCode.Is_Null_adad(Item.fldShomareForoosh))
		m.Put("FldSync","False")
		m.Put("WIsBacked","True")
		m.Put("FldType","Marjoee")
		m.Put("FldAmani",MCode.isAmani)
		m.Put("WSendFrom",3)
		lst.Add(m)
			#end region ---------------------		
	End If
		If Item.FldEshantion>0 Then
			#region ----------------------
			Dim m As Map
			m.Initialize
			m.Put("FldRadif",i+2)
			m.Put("FldC_Visitor",MCode.C_Visitor)
			m.Put("FldC_Tafzili",MCode.C_Tafzili)
			m.Put("FldN_Tafzili",MCode.N_Tafzili)
			m.Put("FldShomareFaktor",ShomareFaktor)
			m.Put("FldShomareBargasht",ShomareBargasht)
			m.Put("FldCodeKala",Item.CodeKala)
			m.Put("FldNameKala",Item.NameKala)
			m.Put("FldFeeForoosh",0)
			m.Put("fldFeeBadAzTakhfif",0)
			m.Put("FldMablaghTakhfif",0)
			m.Put("FldDarsadTakhfif",myCode.Is_Null_adad(Item.fldDarsadTakhfif))
			m.Put("fldArzeshAfzode",Item.fldArzeshAfzodeKala)
			m.Put("fldDarsadArzeshAfzode",Item.fldDarsadArzeshAfzodeKala)
			m.Put("FldSumMablaghTakhfifVizhe",0)
			m.Put("FldSumMablaghTakhfifKala",0)
			m.Put("FldNameVahed",Item.NameVahed)
			m.Put("FldNameVahed2",Item.NameVahed2)
			m.Put("FldSumMande",Item.SumMande)
			m.Put("fldPathPic",Item.fldPathPic)
			m.Put("FldTedadDarSabadJoz",Item.FldEshantion) '-tedad eshantion
			m.Put("FldTedadDarSabadKol",Item.TedadDarSabadKol)
			m.Put("FldTedadDarkarton",Item.TedadDarKarton)
			m.Put("FldTotalFaktor",TotalFaktor)
			m.Put("FldMablaghKol",Sum)
			m.Put("FldTozihat","اشانتیون مرجوعی")
'			m.Put("FldTozih",DT & " - " & CmbBox1.cmbBox.SelectedItem)
			m.Put("FldTozih",TxtSharhFaktor.Text & " (" & CmbBox1.cmbBox.SelectedItem&")")
'			m.Put("FldTozih",TxtSharhFaktor.Text)
			m.Put("FldVaziatPardakht",0)
'			m.Put("FldLat",Lat)
'			m.Put("FldLon",Lon)
			m.Put("FldTarikh",pDate)
			m.Put("FldDate",pDate)
			m.Put("FldTime",Time)
			m.Put("FldSignatureBitmapString",ImageSignature)
			m.Put("fldShomareForoosh",myCode.Is_Null_adad(Item.fldShomareForoosh))
			m.Put("FldSync","False")
				m.Put("WIsBacked","True")
			m.Put("FldType","Eshantion")
				m.Put("FldAmani",MCode.isAmani)
			m.Put("WSendFrom",3)
			lst.Add(m)
			#end region ---------------------		
		End If
	Next
	DBUtils.InsertMaps(MCode.Sql1,"TblFaktor",lst)
		MCode.isAmani=0
		'MCode.C_Tafzili=0
	MCode.SaveUpdate("Delete From TblSabad")
	If MCode.FaktorSelect="" Then
		Dim Cu As Cursor = MCode.Result("Select * from TblLogVisitSefaresh Where FldC_Ashkhas = '"& MCode.C_Tafzili &"'")
		If Cu.RowCount>0 Then
			MCode.SaveUpdate("Update TblLogVisitSefaresh Set FldSefaresh = '"& DT &"' ,FldElatSefaresh = '' Where FldC_Ashkhas = '"& MCode.C_Tafzili &"'")
		Else
			MCode.SaveUpdate("Insert Into TblLogVisitSefaresh (FldC_Ashkhas,FldVisit,FldSefaresh,FldElatSefaresh) Values ('"& MCode.C_Tafzili &"','','"& pDate &"','')")
		End If
		SaveLastVisit
'		MCode.SaveUpdate("Update TblAshkhas Set FldLastSefaresh = '"& pDate &"' Where FldC_Ashkhas = '"& MCode.CodeMoshtari &"'")
'		MCode.SaveUpdate("Update TblVisitorTour Set FldLastSefaresh = '"& pDate &"' Where FldC_Ashkhas = '"& MCode.CodeMoshtari &"'")
	End If
	
	ProgressDialogHide
	If MCode.FaktorSelect="" Then
		ToastMessageShow("فاکتور مرجوعی ثبت گردید",True)
	Else
		ToastMessageShow("فاکتور مرجوعی اصلاح گردید",True)
	End If
	
		Send_Faktor
		MCode.FaktorSelect=""
		MCode.editFactor=False
		Log(MCode.C_Tafzili)
		StartActivity(Act_Profile)
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-SaveFaktor_Marjoee")
	End Try
End Sub

Sub SaveMarjooii
	Try
	MCode.SaveUpdate("Update TblSabad Set FldTozihat = '' Where FldTozihat is null Or FldTozihat = ''")
	MCode.SaveUpdate("Update TblSabad Set FldTedadDarSabadKol = 0 Where FldTedadDarSabadKol is null Or FldTedadDarSabadKol = ''")
	
'	LoadListSabad
'	Dim Date As String = MCode.ConvertNumbersPersian2English(MCode.DatePersian)
'	Dim Tm() As String
'	Dim Time As String = MCode.ConvertNumbersPersian2English(DateTime.Time(DateTime.Now))
'	Tm = Regex.Split(":",Time)
'	Time=MCode.ConvertNumbersPersian2English(Tm(0)) & MCode.ConvertNumbersPersian2English(Tm(1))
'
'	Dim Cu As Cursor = MCode.Result("Select Max(Cast(FldShomareFaktor As Int)) As MaxFldShomareFaktor From TblFaktor")
'	Cu.Position=0
'	Dim ShomareFaktor As String 
'	If Cu.GetString("MaxFldShomareFaktor") = Null Then
'		ShomareFaktor = 1
'	Else
'		ShomareFaktor = Cu.GetString("MaxFldShomareFaktor") + 1
'	End If
'	
'	For i=0 To OriginalItemList.Size-1
'		Dim Item = OriginalItemList.Get(i) As AdapterListKala
'		MCode.SaveUpdate("Insert Into TblFaktor (FldC_Visitor,FldC_Ashkhas,FldShomareFaktor,FldC_Kala,FldN_Kala,FldACode_C,FldN_Vahed,FldN_Vahed_Kol,FldTedadJoz,FldTedadKol,FldTedadKarton,FldTozihat,FldTozihFaktor,FldDate,FldTime) Values ('"& _
'			MCode.C_Visitor &"','"& MCode.CodeMoshtari &"','"& ShomareFaktor &"','"& Item.FldC_Kala &"','"& Item.FldN_Kala &"','"& _
'			 Item.FldACode_C &"','"& Item.FldN_Vahed &"','"& Item.FldN_Vahed_Kol &"','"& Item.FldTedadJoz &"','"& Item.FldTedadKol &"','"& _
'			  Item.FldTedadKarton &"','"& Item.TozihatKala &"','"& TxtSharhFaktor.text &"-مرجوعی','"& Date &"','"& Time &"')")
'	Next
'	
'	MCode.SaveUpdate("Delete From TblSabad")
'	Sleep(100)
		SaveFaktor_Marjoee
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-SaveMarjooii")
	End Try
'	Sleep(100)
'	ToastMessageShow("فاکتور مرجوعی شما ثبت گردید",True)
'	Send_Faktor

End Sub

'Sub CalcTakhfif(item As AdapterListKala) As Long
'	Dim checkTakhfif As Boolean = myCode.getSetting("data.dat","checkTakhfif",False)
'	If checkTakhfif=False Then
'		Return 0
'	End If
''	Dim Eshan1(2),Eshan2(2),Eshan3(2),Eshan4(2),Eshan5(2) As String
''	Dim SumTedad As String = item.FldTedadJoz+(item.FldTedadKarton*item.FldTedadkol)
''	Eshan1=Regex.Split(",",item.takhfif1)
''	Eshan2=Regex.Split(",",item.takhfif2)
''	Eshan3=Regex.Split(",",item.takhfif3)
''	Eshan4=Regex.Split(",",item.takhfif4)
''	Eshan5=Regex.Split(",",item.takhfif5)
''		
''	Dim DarsadTakhfifKharidNaghdi As Int=0
''
''	If Eshan1(0) > 0 Then
''		If SumTedad >= Eshan1(0) Then DarsadTakhfifKharidNaghdi=Eshan1(1)
''	End If
''	If Eshan2(0) > 0 Then
''		If SumTedad >= Eshan2(0) Then DarsadTakhfifKharidNaghdi=Eshan2(1)
''	End If
''	If Eshan3(0) > 0 Then
''		If SumTedad >= Eshan3(0) Then DarsadTakhfifKharidNaghdi=Eshan3(1)
''	End If
''	If Eshan4(0) > 0 Then
''		If SumTedad >= Eshan4(0) Then DarsadTakhfifKharidNaghdi=Eshan4(1)
''	End If
''	If Eshan5(0) > 0 Then
''		If SumTedad >= Eshan5(0) Then DarsadTakhfifKharidNaghdi=Eshan5(1)
''	End If
''		
''	Return (item.FldFee * SumTedad * DarsadTakhfifKharidNaghdi / 100)
'
'End Sub

Private Sub KasreMojodi(CKala As String,Tedad As Int)
	Try
	Dim WUseAnbarak As Int = myCode.getSetting("setting.dat","WUseAnbarak",0)

	
	Dim cu As Cursor=MCode.Result("Select * from TblKala Where FldCodeKala ='"&CKala&"'")
	Dim tedadMande As Int=0
	If cu.RowCount>0 Then
		cu.Position=0
		If WUseAnbarak=0 Then
			tedadMande=cu.GetString("SumMande")
		Else
			tedadMande=cu.GetString("SumMande")
		End If
		
		tedadMande=tedadMande-Tedad
		MCode.SaveUpdate("Update TblKala SET SumMande='"& tedadMande &"' Where FldCodeKala ='"&CKala&"'")
		End If
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-KasreMojodi")
	End Try
End Sub

'Sub MapFragment1_Ready
'	Sleep(100)
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
'
'End Sub

'Sub t1_tick
'	t1.Enabled=False
'	If gmap.IsInitialized Then
'		Try
'			Dim cl As CameraPosition
'			cl.Initialize(gmap.MyLocation.Latitude,gmap.MyLocation.Longitude,15)
'			gmap.AnimateCamera(cl)
'			'Dim Lat As String = gmap.MyLocation.Latitude
'			'Dim Lon As String = gmap.MyLocation.Longitude
'			GPS1.Stop
'			SaveFaktor
'			ProgressDialogHide
'		Catch
'			Log(LastException)
'			myCode.SendError(LastException,Activity.Title&"-t1_tick")
'		End Try
'	Else
'		GPS1.Stop
'		SaveFaktor
'	End If
'End Sub

Sub btn_Back_Click
	If MCode.page="KalaDefault" Then
		Log(MCode.feeTip)
		StartActivity(Act_KalaDefault)
	Else if MCode.page="Kala_listi" Then
		StartActivity(Act_Kala_listi)
	Else If MCode.page="SabtMarjooii" Then
		StartActivity(Act_KalaDefault)
	End If
	Activity.Finish
End Sub

Sub CmbBox1_SelectedIndexChanged (Index As Int)
	Try
	If Index=0 Then
		ToastMessageShow("لطفا نوع تسویه را مشخص کنید",False)
		Return
	End If
	MCode.feeTip=Index
	MCode.UpdateNoeTasvieDarSabad(Index,Null)
	'UpdateSumSabad
	'LoadListSabad
		Log("CmbBox1 Index: " & Index)
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-CmbBox1_SelectedIndexChanged")
	End Try
End Sub

Sub txtMablaghTakhfifiKol_TextChanged (Old As String, New As String)
	Try
	If IsNumber(New)=False Then
		 txtMablaghTakhfifiKol.Text=Old
		End If
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-txtMablaghTakhfifiKol_TextChanged")
	End Try
End Sub
Sub Application_Error (Error As Exception, StackTrace As String) As Boolean
'	MCode.ScheduleRestartCrashedActivity(DateTime.Now + 300, Activity.Title, Error)
	Return True
End Sub

Private Sub chAmani_CheckedChange(Checked As Boolean)
	If Checked Then
		MCode.isAmani=1
	Else
		MCode.isAmani=0
	End If
End Sub

Sub LblTedadJoz_Click(Item As AdapterListKala)
	Dialog.Title = "  "
	Dim input As B4XInputTemplate
	input.Initialize
	input.lblTitle.Text = " تعداد "&Item.NameVahed
	Log(MCode.isFloat)
	MCode.isFloat = True
	Select Case MCode.isFloat
		Case True
			input.ConfigureForNumbers(True, True)
		Case False
			input.ConfigureForNumbers(False, True)
	End Select
		
	Dim rs As ResumableSub =Dialog.ShowTemplate(input, "OK", "", "CANCEL")
	Dialog.Base.Top = 50%y - Dialog.Base.Height / 2
	Wait For (rs) Complete (Result As Int)
	If Result = XUI.DialogResponse_Positive Then
		Dim res As Float = input.Text 'no need to check with IsNumber
		If res>=0 Then
			If MCode.ForooshBishAzMojoodi = "1" Then
				Item.SumMande = Item.SumMande - (res-Item.TedadDarSabadJoz)
				Item.TedadDarSabadJoz = res
				AddToSabad(Item)
			Else
				If (Item.SumMande + Item.TedadDarSabadJoz) >= res Then
					Item.SumMande = Item.SumMande - (res-Item.TedadDarSabadJoz)
					Item.TedadDarSabadJoz = res
					AddToSabad(Item)
				Else
					ToastMessageShow("سفارش شما بیشتر از موجودی می باشد",True)
				End If
			End If
		End If
		HLV.notifyDataSetChanged
	End If

End Sub

Sub LblTedadkol_Click(Item As AdapterListKala)
	Dialog.Title = "  "
	Dim input As B4XInputTemplate
	input.Initialize
	input.lblTitle.Text = " تعداد "&Item.NameVahed2
	input.ConfigureForNumbers(True, True)
	
	Dim rs As ResumableSub =Dialog.ShowTemplate(input, "OK", "", "CANCEL")
	Dialog.Base.Top = 50%y - Dialog.Base.Height / 2
	Wait For (rs) Complete (Result As Int)
	If Result = XUI.DialogResponse_Positive Then
		Dim res As Float = input.Text 'no need to check with IsNumber
		If res>=0 Then
			If MCode.ForooshBishAzMojoodi = "1" Then
				Item.SumMande = Item.SumMande - ((res*Item.TedadDarKarton)-(Item.TedadDarSabadKol*Item.TedadDarKarton))
				Item.TedadDarSabadKol = res
				AddToSabad(Item)
			Else
				If (Item.SumMande + (Item.TedadDarSabadKol*Item.TedadDarKarton)) >= (res*Item.TedadDarKarton) Then
					Item.SumMande = Item.SumMande - ((res*Item.TedadDarKarton)-(Item.TedadDarSabadKol*Item.TedadDarKarton))
					Item.TedadDarSabadKol = res
					AddToSabad(Item)
				Else
					ToastMessageShow("سفارش شما بیشتر از موجودی می باشد",True)
				End If
			End If
		End If
		HLV.notifyDataSetChanged
	End If
End Sub

Sub AddToSabad(Item As AdapterListKala)
	Try
		If myCode.Is_Null_adad(Item.fldDarsadTakhfif)>0 Then
			Dim tedadKol As String=myCode.Is_Null_adad(Item.TedadDarSabadJoz)+(myCode.Is_Null_adad(Item.TedadDarSabadKol)*myCode.Is_Null_adad(Item.TedadDarKarton))
			Dim FeeKol As String=(Item.FeeForoosh*tedadKol)
			If tedadKol>0 Then
				Item.MablaghTakhfif=(((Item.FeeForoosh*tedadKol)*Item.fldDarsadTakhfif)/100)
				Item.fldFeeBadAzTakhfif=FeeKol-Item.MablaghTakhfif
			Else
				If myCode.Is_Null_adad(Item.fldDarsadTakhfif)>0 Then
					Item.MablaghTakhfif=(((Item.FeeForoosh)*Item.fldDarsadTakhfif)/100)
					Item.fldFeeBadAzTakhfif=Item.FeeForoosh-Item.MablaghTakhfif
				End If
			End If
		End If
		
'		Dim Item1 = ListKalaTxt.Get(Item) As AdapterListKala
		Dim rec As CLs_RecDefultKala
		rec.Initialize(Me)
		rec.Show(Item,0)
		FeeKol=rec.CheckArzeshAfzode
		
		Dim Cu As Cursor = MCode.Result("Select * From TblSabad")
		Dim Check As Boolean
		For i=0 To Cu.RowCount -1
			Cu.Position=i
			If Cu.GetString("FldCodeKala") = Item.CodeKala Then
				If Item.TedadDarSabadJoz = 0 And Item.TedadDarSabadKol = 0  Then
					MCode.SaveUpdate("Delete From TblSabad Where FldCodeKala = '"& Item.CodeKala &"'")
					Dim ishas As Boolean=False
					Dim c As Int=0
					For i=0 To MCode.lstChangeFeeKala.Size-1
						Dim Item2 = MCode.lstChangeFeeKala.Get(i) As AdapterChangeFeeKala
						If Item2.FldCodKala=Item.CodeKala Then
							ishas=True
							c=i
							Exit
						Else
							ishas=False
						End If
					Next
			
					If ishas Then
						MCode.lstChangeFeeKala.RemoveAt(c)
					End If
				Else
'				MCode.SaveUpdate("Update TblSabad Set FldTedadDarSabadJoz = '"& Item.TedadDarSabadJoz &"',FldTedadDarSabadKol = '"& Item.TedadDarSabadKol & _
'				"' Where FldCodeKala = '"& Item.CodeKala &"'")
			
					MCode.SaveUpdate("Update TblSabad Set FldTedadDarSabadJoz = '"& Item.TedadDarSabadJoz &"',FldTedadDarSabadKol = '"& Item.TedadDarSabadKol &"',FldMablaghTakhfif = '"& Item.MablaghTakhfif &"',FldDarsadTakhfif = '"& myCode.Is_Null_adad(Item.fldDarsadTakhfif) & "',fldFeeBadAzTakhfif = '"& myCode.Is_Null_adad(Item.fldFeeBadAzTakhfif) & "',FldEshantion = '"& Item.FldEshantion& _
				"',fldArzeshAfzode='"& Item.fldArzeshAfzodeKala &"',fldDarsadArzeshAfzode='"& Item.fldDarsadArzeshAfzodeKala & "' Where FldCodeKala = '"& Item.CodeKala &"'")
				End If
				Check = True
				Exit
			End If
		Next
		If Check = False Then
			MCode.AddToSabad(Item)
		End If
		RefreshLblSabad
	Catch
		Log(LastException)
		Log(LastException.Message)
	
		
		
		myCode.SendError(LastException,Activity.Title&"-AddToSabad")
		
	End Try
End Sub