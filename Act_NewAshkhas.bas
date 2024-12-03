B4A=true
Group=Activity
ModulesStructureVersion=1
Type=Activity
Version=9.8
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
#End Region

Sub Process_Globals
	Dim GPS1 As GPS
	Private t1 As Timer
	Public shakhs As AdapterListAshkhas
End Sub

Sub Globals
	Private rp As RuntimePermissions
	Private TxtName As EditText
	Private TxtTell As EditText
	Private TxtMob As EditText
	Private TxtAddress As EditText
	Private BtnSaveNewMoshtari As Button
	Dim Lat As String
	Dim Lon As String
	Private ChGps As CheckBox
	Dim Key As IME
	Private TxtShomarehesab As EditText
	Private TxtLat As EditText
	Private TxtLon As EditText
	Private TxtC_Meli As EditText
	Private BtnNewNumber As Label
	Private PnlSpCity As Panel
	Public NiceSpinner As NiceSpinner
	Public NiceSpinner1 As NiceSpinner
	Private B4XComboBox1 As B4XComboBox
	Private B4XComboBox2 As B4XComboBox
	Dim ListGoroohAshkhas1,OriginalListGoroohAshkhas1 As List
	Dim ListGoroohAshkhas2,OriginalListGoroohAshkhas2 As List
	Dim GroupCodeSelect As Long
	Dim GroupNameSelect As String
	Private gmap As GoogleMap
	Private MapFragment1 As MapFragment
	Private TxtC_Posti As EditText
	Dim loc As LatLng
	Private PnlSpGroup As Panel
	Dim lstGroup1 As List
	Dim lstGroup2 As List
	Dim lstSearchGroup1 As List
	Dim lstSearchGroup2 As List
	Dim lstSelectedCodeGroupAshkhas As List
	Dim GroupCodeSelect1 As String="0"
	Dim GroupNameSelect1 As String=""
	Dim GroupCodeSelect2 As String="0"
	Dim GroupNameSelect2 As String=""
	Dim IndexGroup1 As Int=0
	Dim IndexGroup2 As Int=0

	Private lblTitle As Label
	Dim TypeSelectGroup As String=""
	Private TxtCodeMostari As EditText

'	Private Btn_SelectGroup As Button
	Private SearchTemplate1 As B4XSearchTemplate
	Private SearchTemplate2 As B4XSearchTemplate
	Private XUI As XUI
	Private Dialog As B4XDialog
	Private Base As B4XView
	Private Panel1 As Panel
	Private Fused As FusedLocationProviderClient
	Private btnSearchGroup1 As Label
	Private btnSearchGroup2 As Label
	Dim querySearch1 As String
	Dim querySearch2 As String
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Try
		Activity.LoadLayout("L_NewAshkhas")
		Base = Activity
		Dialog.Initialize (Panel1)
		Dialog.Title = "جستجوی گروه اشخاص"
		SearchTemplate1.Initialize
		SearchTemplate2.Initialize
		'	LoadAcSpGroohAshkas
		OriginalListGoroohAshkhas1.Initialize
		OriginalListGoroohAshkhas2.Initialize
		ListGoroohAshkhas1.Initialize
		ListGoroohAshkhas2.Initialize
		lstSelectedCodeGroupAshkhas.Initialize
		lstGroup1.Initialize
		lstGroup2.Initialize
		lstSearchGroup1.Initialize
		lstSearchGroup2.Initialize
		Fused.Initialize("FusedLocation")
		GPS1.Initialize("GPS1")
		Key.Initialize("Key")
		t1.Initialize("t1",5000)
		CreatePage
		If GPS1.GPSEnabled = False Then
			ToastMessageShow("موقعیت مکانی خود را روشن کنید", True)
			StartActivity(GPS1.LocationSettingsIntent) 'Will open the relevant settings screen.
		Else
			t1.Enabled=True
		End If
		
		Log(Activity.Title)
	Catch
		Log(LastException)
		myCode.SendError(LastException, Activity.Title&"-Activity_Create")
	End Try
End Sub

Sub GPS1_UserEnabled (Enabled As Boolean)
	If Enabled=True Then
		t1.Enabled=True
	End If
End Sub

Sub CreatePage
	
	Try
		Key.SetCustomFilter(TxtTell,TxtTell.INPUT_TYPE_NUMBERS,"0123456789")
		Key.SetCustomFilter(TxtMob,TxtMob.INPUT_TYPE_NUMBERS,"0123456789")
		Key.SetCustomFilter(TxtLat,TxtLat.INPUT_TYPE_NUMBERS,"0123456789.")
		Key.SetCustomFilter(TxtLon,TxtLon.INPUT_TYPE_NUMBERS,"0123456789.")
		Key.SetCustomFilter(TxtShomarehesab,TxtShomarehesab.INPUT_TYPE_NUMBERS,"0123456789")
		Key.SetCustomFilter(TxtC_Posti,TxtC_Posti.INPUT_TYPE_NUMBERS,"0123456789")
		Key.SetLengthFilter(TxtMob,11)
		Key.SetLengthFilter(TxtC_Posti,10)
		Key.SetLengthFilter(TxtC_Meli,10)
		Key.SetLengthFilter(TxtShomarehesab,29)
		Key.SetLengthFilter(TxtName,50)
		Key.SetLengthFilter(TxtAddress,200)
		Key.SetLengthFilter(TxtTell,11)
		If MCode.Gps=1 Then
			ChGps.Enabled=False
		Else
			ChGps.Enabled=True
		End If
		NiceSpinner.Initialize("NiceSpinner")
		NiceSpinner.TextColor = Colors.Black
		NiceSpinner.Gravity = Gravity.CENTER_HORIZONTAL
		NiceSpinner.Typeface = Typeface.LoadFromAssets("p_font.ttf")
		PnlSpGroup.AddView(NiceSpinner,B4XComboBox1.mBase.Left,B4XComboBox1.mBase.top,B4XComboBox1.mBase.Width,B4XComboBox1.mBase.Height)
	
		Dim op As ColorDrawable
		op.Initialize2(Colors.White,8dip,2dip,Colors.Black)
		NiceSpinner.Background=op
	
		NiceSpinner1.Initialize("NiceSpinner1")
		NiceSpinner1.TextColor = Colors.Black
		NiceSpinner1.Gravity = Gravity.CENTER_HORIZONTAL
		NiceSpinner1.Typeface = Typeface.LoadFromAssets("p_font.ttf")
		PnlSpGroup.AddView(NiceSpinner1,B4XComboBox2.mBase.Left,B4XComboBox2.mBase.top,B4XComboBox2.mBase.Width,B4XComboBox2.mBase.Height)
		
		Dim op1 As ColorDrawable
		op1.Initialize2(Colors.White,8dip,2dip,Colors.Black)
		NiceSpinner1.Background=op1
		lstGroup2.Add("همه گروه ها")
		NiceSpinner1.attachDataSource(lstGroup2)
	
		LoadAcSpGroohAshkas
		Dim Time As String = DateTime.Time(DateTime.Now)
		Dim NewCode As String = MCode.ConvertNumbersPersian2English(MCode.C_Visitor & MCode.DatePersian & Time.Replace(":",""))
		TxtCodeMostari.Text=NewCode
		If MCode.UpdateShakhs=True Then
			LoadUpdateShakhs
		End If
	Catch
		Log(LastException)
		myCode.SendError(LastException, Activity.Title&"-CreatePage")
	End Try
End Sub

Sub LoadUpdateShakhs
	TxtName.Text=shakhs.SharhTafzili
	TxtTell.Text=shakhs.Tell
	TxtAddress.Text=shakhs.Address
	TxtC_Meli.Text=myCode.Is_Null(shakhs.FldC_Meli)
	TxtC_Posti.Text=myCode.Is_Null(shakhs.FldC_Posti)
	TxtShomarehesab.Text=myCode.Is_Null(shakhs.FldShomarehesab)
	TxtMob.Text=shakhs.FldMobile
	TxtCodeMostari.Text= shakhs.CodeTafzili

	lblTitle.Text="ویرایش مشتری جدید"
'	Dim codegroup As String=shakhs.FldC_Gorooh
'	Dim Namegroup As String=shakhs.FldN_Gorooh
	TypeSelectGroup="Update"
	
'	If codegroup.Length=3 Then
	''		'گروه
'		Dim index As Int=	lstGroup1.IndexOf(Namegroup)
'		IndexGroup1=index
'		NiceSpinner_item_clicked
'	Else
'		'زیر گروه
'		Dim namegroup1 As String=MCode.SingleResult("select FldN_Gorooh from TblGoroohAshkhas where FldC_Gorooh='"&codegroup.SubString2(0,3) &"'")
'		Dim namegroup2 As String=MCode.SingleResult("select FldN_Gorooh from TblGoroohAshkhas where FldC_Gorooh='"&codegroup &"'")
'		Dim index As Int=	lstGroup1.IndexOf(namegroup1)		
'		IndexGroup1=index
'		NiceSpinner_item_clicked
'		Dim index2 As Int=	lstGroup2.IndexOf(namegroup2)
'		IndexGroup2=index2
'		NiceSpinner1_item_clicked
'		
'	End If
'	TypeSelectGroup=""
End Sub

'Sub LoadAcSpGroohAshkas
'	Dim Dt As Cursor = MCode.Result("Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas where Length(FldC_Gorooh) = 3")
'	'NiceSpinner.Add("همه گروه ها")
'	For i=0 To Dt.RowCount-1
'		Dt.Position=i
'		Dim Item As AdapterGoroohAshkhas
''		Dim cu As Cursor
'		
''		cu= MCode.Result("Select fldCodetafzili From TblAshkhas where fldCodeGroup like '"& Dt.GetString("FldC_Gorooh") &"%'")
''		If cu.RowCount>0 Then
'			Item.FldC_Gorooh= Dt.GetString("FldC_Gorooh")
'			Item.FldN_Gorooh= Dt.GetString("FldN_Gorooh")
'			OriginalListGoroohAshkhas.Add(Item)
'			NiceSpinner.Add(Item.FldN_Gorooh)
''		End If
'
'	Next
'	NiceSpinner.Show(Colors.blue, 14)
'	
'
'	
'
'End Sub

'Sub LoadAcSpGroohAshkas
'	Try
'		Dim lstTemp As List
'		lstTemp.Initialize
'		
'		lstGroup1.Add("همه گروه ها")
'		Dim Dt1 As Cursor = MCode.Result("Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas")
'		For i=0 To Dt1.RowCount-1
'			Dt1.Position=i
'			Dim code As String=Dt1.GetString("FldC_Gorooh").SubString2(0,3)
'			Dim indexTemp As String=lstTemp.IndexOf(code)
'			If indexTemp=-1 Then
'				Dim dt2 As Cursor =MCode.Result("Select * From TblGoroohAshkhas where FldC_Gorooh Like '"& code &"%'")
'				If dt2.RowCount>0 Then
'					For j=0 To dt2.RowCount-1
'						dt2.Position=j
'						Dim code2 As String=dt2.GetString("FldC_Gorooh").SubString2(0,3)
'			
'						Dim count As Long
'						Dim MinCode As String =MCode.SingleResult("Select min(FldC_Gorooh) From TblGoroohAshkhas where FldC_Gorooh Like '"& code2 &"%'")
'						Dim sizeCode As Long=dt2.GetString("FldC_Gorooh").Length
'						If MinCode.Length=sizeCode Then
'							Dim Item As AdapterGoroohAshkhas
'							Item.FldC_Gorooh= dt2.GetString("FldC_Gorooh")
'							Item.FldN_Gorooh= dt2.GetString("FldN_Gorooh")
'							OriginalListGoroohAshkhas.Add(Item)
'							lstGroup1.Add(Item.FldN_Gorooh)
'						Else
'				
'							If MinCode.Length=sizeCode Then
'								For Each a As AdapterGoroohAshkhas In OriginalListGoroohAshkhas
'									If a.FldC_Gorooh.SubString2(0,3)=code2 Then
'										count=1
'										Exit
'									End If
'								Next
'								If count =0 Then
'									Dim NameGroup,CodeGroup As String
'									CodeGroup=MinCode
'									NameGroup=MCode.SingleResult("Select FldN_Gorooh From TblGoroohAshkhas where FldC_Gorooh='"& MinCode &"'")
'									Dim Item As AdapterGoroohAshkhas
'									Item.FldC_Gorooh= CodeGroup
'									Item.FldN_Gorooh= NameGroup
'									OriginalListGoroohAshkhas.Add(Item)
'									lstGroup1.Add(Item.FldN_Gorooh)
'								End If
'							Else
'								Dim sizelevel As String=MinCode.Length+3
'								Dim cu As Cursor=MCode.Result("Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas where FldC_Gorooh Like '"& MinCode &"%' And Length(FldC_Gorooh) = "& sizelevel )
'								For i=0 To cu.RowCount-1
'									cu.Position=i
'									Dim Item As AdapterGoroohAshkhas
'									Item.FldC_Gorooh= cu.GetString("FldC_Gorooh")
'									Item.FldN_Gorooh= cu.GetString("FldN_Gorooh")
'									OriginalListGoroohAshkhas.Add(Item)
'									lstGroup2.Add(Item.FldN_Gorooh)
'								Next
'							End If
'				
'						End If
'					Next
'				End If
'				lstTemp.Add(code)
'			End If
'			
'			
'			
'		Next
'		
'		
'		
''	'Dim Dt As Cursor = MCode.Result("Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas where Length(FldC_Gorooh) = 3")
''		Dim Dt As Cursor = MCode.Result("Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas order By FldC_Gorooh desc")
''	
''		lstGroup1.Add("همه گروه ها")
'		''	NiceSpinner.Add("همه گروه ها")
''	For i=0 To Dt.RowCount-1
''		Dt.Position=i
''		Dim Item As AdapterGoroohAshkhas
''		'Dim cu As Cursor
''		
''		'cu= MCode.Result("Select * From TblGoroohAshkhas where fldCodeGroup like '"& Dt.GetString("FldC_Gorooh") &"%'")
''		'If cu.Rowcount>0 Then
''		Item.FldC_Gorooh= Dt.GetString("FldC_Gorooh")
''		Log(Item.FldC_Gorooh) 
''		Item.FldN_Gorooh= Dt.GetString("FldN_Gorooh")
''		OriginalListGoroohAshkhas.Add(Item)
'		''		NiceSpinner.Add(Item.FldN_Gorooh)
''			lstGroup1.Add(Item.FldN_Gorooh)
''		'End If
'
''	Next
''		NiceSpinner.Show(Colors.blue, 14)
'		NiceSpinner.attachDataSource(lstGroup1)
'	Catch
'		Log(LastException)
'		myCode.SendError(LastException,Activity.Title&"-LoadAcSpGroohAshkas")
'	End Try
'End Sub
Sub LoadAcSpGroohAshkas
	Try
		Dim lstTemp As List
		lstTemp.Initialize
		
		lstGroup1.Add("همه گروه ها")
		querySearch1="Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas "
		Dim Dt1 As Cursor = MCode.Result(querySearch1)
		For i=0 To Dt1.RowCount-1
			Dt1.Position=i
			Dim code As String=Dt1.GetString("FldC_Gorooh").SubString2(0,3)
			Dim indexTemp As String=lstTemp.IndexOf(code)
			If indexTemp=-1 Then
				Dim dt2 As Cursor =MCode.Result("Select * From TblGoroohAshkhas where FldC_Gorooh Like '"& code &"%'")
				If dt2.RowCount>0 Then
					For j=0 To dt2.RowCount-1
						dt2.Position=j
						Dim code2 As String=dt2.GetString("FldC_Gorooh").SubString2(0,3)
			
						Dim count As Long
						Dim MinCode As String =MCode.SingleResult("Select min(FldC_Gorooh) From TblGoroohAshkhas where FldC_Gorooh Like '"& code2 &"%'")
						Dim sizeCode As Long=dt2.GetString("FldC_Gorooh").Length
						If MinCode.Length=sizeCode Then
							Dim Item As AdapterGoroohAshkhas
							Item.FldC_Gorooh= dt2.GetString("FldC_Gorooh")
							Item.FldN_Gorooh= dt2.GetString("FldN_Gorooh")
							OriginalListGoroohAshkhas1.Add(Item)
							lstGroup1.Add(Item.FldN_Gorooh)
							lstSearchGroup1.Add(Item.FldN_Gorooh)
						Else
				
							If MinCode.Length=sizeCode Then
								For Each a As AdapterGoroohAshkhas In OriginalListGoroohAshkhas1
									If a.FldC_Gorooh.SubString2(0,3)=code2 Then
										count=1
										Exit
									End If
								Next
								If count =0 Then
									Dim NameGroup,CodeGroup As String
									CodeGroup=MinCode
									NameGroup=MCode.SingleResult("Select FldN_Gorooh From TblGoroohAshkhas where FldC_Gorooh='"& MinCode &"'")
									Dim Item As AdapterGoroohAshkhas
									Item.FldC_Gorooh= CodeGroup
									Item.FldN_Gorooh= NameGroup
									OriginalListGoroohAshkhas1.Add(Item)
									lstGroup1.Add(Item.FldN_Gorooh)
									lstSearchGroup1.Add(Item.FldN_Gorooh)
								End If
							Else
'								Dim sizelevel As String=MinCode.Length+3
'								Dim cu As Cursor=MCode.Result("Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas where FldC_Gorooh Like '"& MinCode &"%' And Length(FldC_Gorooh) = "& sizelevel )
'								For i=0 To cu.RowCount-1
'									cu.Position=i
'									Dim Item As AdapterGoroohAshkhas
'									Item.FldC_Gorooh= cu.GetString("FldC_Gorooh")
'									Item.FldN_Gorooh= cu.GetString("FldN_Gorooh")
'									OriginalListGoroohAshkhas1.Add(Item)
'									lstGroup2.Add(Item.FldN_Gorooh)
'								Next
							End If
				
						End If
					Next
				End If
				lstTemp.Add(code)
			End If
			
			
			
		Next
'		lstSearchGroup1=lstGroup1
'		lstSearchGroup1.RemoveAt(0)
		Log("lstSearchGroup1: "& lstSearchGroup1.Size)
		SearchTemplate1.SetItems(lstSearchGroup1)
		
		SearchTemplate1.GetPanel(Dialog).BringToFront
		
'	'Dim Dt As Cursor = MCode.Result("Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas where Length(FldC_Gorooh) = 3")
'		Dim Dt As Cursor = MCode.Result("Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas order By FldC_Gorooh desc")
'	
'		lstGroup1.Add("همه گروه ها")
		''	NiceSpinner.Add("همه گروه ها")
'	For i=0 To Dt.RowCount-1
'		Dt.Position=i
'		Dim Item As AdapterGoroohAshkhas
'		'Dim cu As Cursor
'		
'		'cu= MCode.Result("Select * From TblGoroohAshkhas where fldCodeGroup like '"& Dt.GetString("FldC_Gorooh") &"%'")
'		'If cu.Rowcount>0 Then
'		Item.FldC_Gorooh= Dt.GetString("FldC_Gorooh")
'		Log(Item.FldC_Gorooh) 
'		Item.FldN_Gorooh= Dt.GetString("FldN_Gorooh")
'		OriginalListGoroohAshkhas.Add(Item)
		''		NiceSpinner.Add(Item.FldN_Gorooh)
'			lstGroup1.Add(Item.FldN_Gorooh)
'		'End If

'	Next
'		NiceSpinner.Show(Colors.blue, 14)
		NiceSpinner.attachDataSource(lstGroup1)
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-LoadAcSpGroohAshkas")
	End Try
End Sub

Sub LoadAcSpGroohAshkas2
	Try
		Dim lstTemp As List
		lstTemp.Initialize
		Dim Cu As Cursor = MCode.Result("Select * From TblGoroohAshkhas ")
		For i=0 To Cu.RowCount-1
			Cu.Position=i
			Dim Name As String =  Cu.GetString("FldN_Gorooh")
			lstTemp.Add(Name)
		Next
		SearchTemplate1.SetItems(lstTemp)
		SearchTemplate1.GetPanel(Dialog).BringToFront
'		lstGroup1.Add("همه گروه ها")
'		Dim Dt1 As Cursor = MCode.Result("Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas")
'		For i=0 To Dt1.RowCount-1
'			Dt1.Position=i
'			Dim code As String=Dt1.GetString("FldC_Gorooh").SubString2(0,3)
'			Dim indexTemp As String=lstTemp.IndexOf(code)
'			If indexTemp=-1 Then
'				Dim dt2 As Cursor =MCode.Result("Select * From TblGoroohAshkhas where FldC_Gorooh Like '"& code &"%'")
'				If dt2.RowCount>0 Then
'					For j=0 To dt2.RowCount-1
'						dt2.Position=j
'						Dim code2 As String=dt2.GetString("FldC_Gorooh").SubString2(0,3)
'			
'						Dim count As Long
'						Dim MinCode As String =MCode.SingleResult("Select min(FldC_Gorooh) From TblGoroohAshkhas where FldC_Gorooh Like '"& code2 &"%'")
'						Dim sizeCode As Long=dt2.GetString("FldC_Gorooh").Length
'						If MinCode.Length=sizeCode Then
'							Dim Item As AdapterGoroohAshkhas
'							Item.FldC_Gorooh= dt2.GetString("FldC_Gorooh")
'							Item.FldN_Gorooh= dt2.GetString("FldN_Gorooh")
'							OriginalListGoroohAshkhas1.Add(Item)
'							lstGroup1.Add(Item.FldN_Gorooh)
'						Else
'				
'							If MinCode.Length=sizeCode Then
'								For Each a As AdapterGoroohAshkhas In OriginalListGoroohAshkhas1
'									If a.FldC_Gorooh.SubString2(0,3)=code2 Then
'										count=1
'										Exit
'									End If
'								Next
'								If count =0 Then
'									Dim NameGroup,CodeGroup As String
'									CodeGroup=MinCode
'									NameGroup=MCode.SingleResult("Select FldN_Gorooh From TblGoroohAshkhas where FldC_Gorooh='"& MinCode &"'")
'									Dim Item As AdapterGoroohAshkhas
'									Item.FldC_Gorooh= CodeGroup
'									Item.FldN_Gorooh= NameGroup
'									OriginalListGoroohAshkhas1.Add(Item)
'									lstGroup1.Add(Item.FldN_Gorooh)
'								End If
'							Else
		''								Dim sizelevel As String=MinCode.Length+3
		''								Dim cu As Cursor=MCode.Result("Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas where FldC_Gorooh Like '"& MinCode &"%' And Length(FldC_Gorooh) = "& sizelevel )
		''								For i=0 To cu.RowCount-1
		''									cu.Position=i
		''									Dim Item As AdapterGoroohAshkhas
		''									Item.FldC_Gorooh= cu.GetString("FldC_Gorooh")
		''									Item.FldN_Gorooh= cu.GetString("FldN_Gorooh")
		''									OriginalListGoroohAshkhas1.Add(Item)
		''									lstGroup2.Add(Item.FldN_Gorooh)
		''								Next
'							End If
'				
'						End If
'					Next
'				End If
'				lstTemp.Add(code)
'			End If
'			
'			
'			
'		Next
		
		
		
'	'Dim Dt As Cursor = MCode.Result("Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas where Length(FldC_Gorooh) = 3")
'		Dim Dt As Cursor = MCode.Result("Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas order By FldC_Gorooh desc")
'	
'		lstGroup1.Add("همه گروه ها")
		''	NiceSpinner.Add("همه گروه ها")
'	For i=0 To Dt.RowCount-1
'		Dt.Position=i
'		Dim Item As AdapterGoroohAshkhas
'		'Dim cu As Cursor
'		
'		'cu= MCode.Result("Select * From TblGoroohAshkhas where fldCodeGroup like '"& Dt.GetString("FldC_Gorooh") &"%'")
'		'If cu.Rowcount>0 Then
'		Item.FldC_Gorooh= Dt.GetString("FldC_Gorooh")
'		Log(Item.FldC_Gorooh) 
'		Item.FldN_Gorooh= Dt.GetString("FldN_Gorooh")
'		OriginalListGoroohAshkhas.Add(Item)
		''		NiceSpinner.Add(Item.FldN_Gorooh)
'			lstGroup1.Add(Item.FldN_Gorooh)
'		'End If

'	Next
'		NiceSpinner.Show(Colors.blue, 14)
'		NiceSpinner.attachDataSource(lstGroup1)
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-LoadAcSpGroohAshkas")
	End Try
End Sub




Sub NiceSpinner_item_clicked1
'	Dim Position As Int=IndexGroup1
'	If IndexGroup1<>0 Then
'		Position=IndexGroup1
'	End If
	
'	Log("ns1 item " & Position &" selected")
	Log("ns1 item " & NiceSpinner.Text &" selected")
	'TxtSearch.Text= ""
	Try
		Key.HideKeyboard
		'ListGoroohAshkhas.Clear


		lstSearchGroup2.Clear
		GroupCodeSelect2="0"
		GroupNameSelect2=""
		Dim mc As String=GroupCodeSelect1
		'Dim Cu As Cursor = MCode.Result($"Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas where FldC_Gorooh like '${mc}%' Order By FldC_Gorooh"$)
		Dim Count As Int = 3
		querySearch2="Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas where FldC_Gorooh Like '"& mc &"%' And Length(FldC_Gorooh) > "& Count &" ORDER BY FldC_Gorooh"
		Dim Cu As Cursor=MCode.Result(querySearch2)
		If Cu.RowCount>0 Then
				

			For i=0 To Cu.RowCount-1
				Cu.Position=i

				lstSearchGroup2.Add(Cu.GetString("FldN_Gorooh"))
			Next
				
		End If
	

		Log("CodeGroupSelect1: "&GroupCodeSelect1)
		GroupCodeSelect=GroupCodeSelect1
'		Log("postion1: "&Position)
'		lstSearchGroup2=lstGroup2
'		lstSearchGroup2.RemoveAt(0)
		SearchTemplate2.SetItems(lstSearchGroup2)
		SearchTemplate2.GetPanel(Dialog).BringToFront
	
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-NiceSpinner_ItemClick")
	End Try
End Sub

Sub NiceSpinner1_item_clicked1
'	Dim Position As Int=IndexGroup2
'	If IndexGroup2<>0 Then
'		Position=IndexGroup2
'	End If

'	Log("ns2 item " & Position &" selected")
	Log("ns2 item " & NiceSpinner1.Text &" selected")
	Try

		
		Dim mc As String=GroupCodeSelect2
			
		Dim Count As Int =3
		querySearch2="Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas where FldC_Gorooh Like '"& mc &"%' And Length(FldC_Gorooh) > "& Count &" ORDER BY FldC_Gorooh"
		Dim Cu As Cursor=MCode.Result(querySearch2)
		If Cu.RowCount>0 Then

			lstSearchGroup2.Clear
				
			For i=0 To Cu.RowCount-1
				Cu.Position=i
				lstSearchGroup2.Add(Cu.GetString("FldN_Gorooh"))
			Next
		End If
	
		GroupCodeSelect=GroupCodeSelect2
		Log("CodeGroupSelect2: "&GroupCodeSelect2)
'		Log("position2: "&Position)
		Log("lstSearchGroup2: "& lstSearchGroup2.Size)
		SearchTemplate2.SetItems(lstSearchGroup2)
		SearchTemplate2.GetPanel(Dialog).BringToFront
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-NiceSpinner1_ItemClick")
	End Try
End Sub

Sub NiceSpinner_item_clicked
	Dim Position As Int=NiceSpinner.SelectedIndex
	Log("ns1 item " & NiceSpinner.SelectedIndex &" selected")
	Log("ns1 item " & NiceSpinner.Text &" selected")
	'TxtSearch.Text= ""
	Try
		Key.HideKeyboard
		'ListGoroohAshkhas.Clear
		If Position = 0 Then
			ListGoroohAshkhas1.Clear
			lstSelectedCodeGroupAshkhas.Clear
'		NiceSpinner1.Clear
			lstGroup2.Clear
'		NiceSpinner1.Add("همه گروه ها")
			lstGroup2.Add("همه گروه ها")
			'LoadListKala("Select * From TblKala " & Str_sort)
			GroupCodeSelect1="0"
			GroupNameSelect1=""
			GroupCodeSelect2="0"
			GroupNameSelect2=""
			'NiceSpinner1.SelectedIndex=0
		Else
			Dim lst As List=OriginalListGoroohAshkhas1
			Log(NiceSpinner.SelectedIndex-1)
			Dim index As Int=Position-1
			Dim Item As AdapterGoroohAshkhas=lst.Get(index)
			Log(Item.FldN_Gorooh)
			Log(Item.FldC_Gorooh)
			GroupCodeSelect1=Item.FldC_Gorooh
			GroupNameSelect1=Item.FldN_Gorooh
			GroupCodeSelect2="0"
			GroupNameSelect2=""
			Dim mc As String=Item.FldC_Gorooh
			'Dim Cu As Cursor = MCode.Result($"Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas where FldC_Gorooh like '${mc}%' Order By FldC_Gorooh"$)
			Dim Count As Int = Item.FldC_Gorooh.Length + 3
			Dim Cu As Cursor=MCode.Result("Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas where FldC_Gorooh Like '"& mc &"%' And Length(FldC_Gorooh) = "& Count &" ORDER BY FldC_Gorooh")
			If Cu.RowCount>0 Then
				lstSelectedCodeGroupAshkhas.Clear
'			NiceSpinner1.Clear
				lstGroup2.Clear
'		NiceSpinner1.Add("همه گروه ها")
				lstGroup2.Add("همه گروه ها")
				For i=0 To Cu.RowCount-1
					Cu.Position=i
					Dim Item As AdapterGoroohAshkhas
					Item.FldC_Gorooh=Cu.GetString("FldC_Gorooh")
					Item.FldN_Gorooh=Cu.GetString("FldN_Gorooh")
					ListGoroohAshkhas1.Add(Item)
'				NiceSpinner1.Add(Cu.GetString("FldN_Gorooh"))
					lstGroup2.Add(Cu.GetString("FldN_Gorooh"))
				Next
'			NiceSpinner1.Show(Colors.blue, 14)
				NiceSpinner1.attachDataSource(lstGroup2)
				'NiceSpinner1.SelectedIndex = 0
				lstSelectedCodeGroupAshkhas.Add(GroupCodeSelect1)
			Else
				ListGoroohAshkhas1.Clear
				lstSelectedCodeGroupAshkhas.Clear
'			NiceSpinner1.Clear
				lstGroup2.Clear
'		NiceSpinner1.Add("همه گروه ها")
				lstGroup2.Add("همه گروه ها")
				GroupCodeSelect2="0"
				GroupNameSelect2=""
				'	NiceSpinner1.SelectedIndex=0
			End If
		End If

'		LoadAshkhas
		Log("CodeGroupSelect1: "&GroupCodeSelect1)
		GroupCodeSelect=GroupCodeSelect1
		Log("postion1: "&Position)
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-NiceSpinner_ItemClick")
	End Try
End Sub

Sub NiceSpinner1_item_clicked
	Dim Position As Int=NiceSpinner1.SelectedIndex
	Dim Value As Object=NiceSpinner1.Text
	Log("ns2 item " & NiceSpinner1.SelectedIndex &" selected")
	Log("ns2 item " & NiceSpinner1.Text &" selected")
	Try
		If Position=0 Then
			If lstSelectedCodeGroupAshkhas.Size>0 Then
				GroupCodeSelect2=lstSelectedCodeGroupAshkhas.Get(lstSelectedCodeGroupAshkhas.Size-1)
			End If
			
		Else
			Dim lst As List=ListGoroohAshkhas1
			Dim Item As AdapterGoroohAshkhas=lst.Get(Position-1)
			GroupCodeSelect2=Item.FldC_Gorooh
		
			Dim mc As String=Item.FldC_Gorooh
			
			Dim Count As Int = mc.Length + 3
			Dim Cu As Cursor=MCode.Result("Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas where FldC_Gorooh Like '"& mc &"%' And Length(FldC_Gorooh) = "& Count &" ORDER BY FldC_Gorooh")
			If Cu.RowCount>0 Then
				ListGoroohAshkhas1.Clear
'			NiceSpinner1.Clear
				'lstSelectedCodeGroupKala.Clear
			
				lstSelectedCodeGroupAshkhas.Add(Item.FldC_Gorooh)
	
				'NiceSpinner1.Add("برگشت")
'			NiceSpinner1.Add("همه گروه ها")
				lstGroup2.Clear
'		NiceSpinner1.Add("همه گروه ها")
				lstGroup2.Add("همه گروه ها")
				
				For i=0 To Cu.RowCount-1
					Cu.Position=i
					Dim Item As AdapterGoroohAshkhas
					Item.FldC_Gorooh=Cu.GetString("FldC_Gorooh")
					Item.FldN_Gorooh=Cu.GetString("FldN_Gorooh")
					ListGoroohAshkhas1.Add(Item)
'				NiceSpinner1.Add(Cu.GetString("FldN_Gorooh"))
					lstGroup2.Add(Cu.GetString("FldN_Gorooh"))

				Next
				NiceSpinner1.RemoveView
				NiceSpinner1.Initialize("NiceSpinner1")
				PnlSpGroup.AddView(NiceSpinner1,B4XComboBox2.mBase.Left,B4XComboBox2.mBase.top,B4XComboBox2.mBase.Width,B4XComboBox2.mBase.Height)
				NiceSpinner1.TextColor = Colors.Black
				NiceSpinner1.Gravity = Gravity.CENTER_HORIZONTAL
				NiceSpinner1.Typeface = Typeface.LoadFromAssets("p_font.ttf")
				Dim op1 As ColorDrawable
				op1.Initialize2(Colors.White,8dip,2dip,Colors.Black)
				NiceSpinner1.Background=op1
				NiceSpinner1.attachDataSource(lstGroup2)
				'NiceSpinner1.SelectedIndex = 0
			End If
		End If
		GroupCodeSelect=GroupCodeSelect2
		Log("CodeGroupSelect2: "&GroupCodeSelect2)
		Log("position2: "&Position)
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-NiceSpinner1_ItemClick")
	End Try
End Sub


Public Sub CheckSubGroup(CodeGroup As String) As Boolean
	Dim mc As String=CodeGroup
	Dim Count As Int = mc.Length + 3
	Dim Cu As Cursor=MCode.Result("Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas where FldC_Gorooh Like '"& mc &"%' And Length(FldC_Gorooh) = "& Count &" ORDER BY FldC_Gorooh")
	If Cu.RowCount>0 Then
		Return False
	End If
	Return True
End Sub

Sub GPS1_LocationChanged (Location1 As Location)
'	Lat  = Location1.Latitude
'	Lon  = Location1.Longitude
'	TxtLat.Text=Lat
'	TxtLon.Text=Lon
	GPS1.Stop
End Sub

Sub Activity_KeyPress (KeyCode As Int) As Boolean 'Return True to consume the event
	If KeyCode=KeyCodes.KEYCODE_BACK Then
		Activity.Finish
		Return True
	Else
		Return True
	End If
End Sub

Sub Activity_Resume
	If MCode.IsConnected=False And MCode.ConnectionStatus=1 Then
		ToastMessageShow("لطفا ارتباط اینترنت گوشی خود را بررسی نمایید",False)
'		Msgbox2Async("لطفا ارتباط اینترنت گوشی خود را بررسی نمایید", "قطعی اینترنت", "باز کردن تنظیمات گوشی", "", "", Null, False)
'		Wait For Msgbox_Result(res As Int)
'		If  res= DialogResponse.POSITIVE Then
'			Dim StartIntent As Intent
'			StartIntent.Initialize("android.settings.SETTINGS", "")
'			StartActivity(StartIntent)
'		End If
	End If
	If GPS1.GPSEnabled=True Then
		t1.Enabled=True
		'GPS1.Start(0,0)
	End If
End Sub

Sub Activity_Pause (UserClosed As Boolean)
	GPS1.Stop
End Sub

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
					TxtLat.text = LastLocation.Latitude
					TxtLon.text = LastLocation.Longitude
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

Sub t1_tick
	t1.Enabled=False
	Try
		GetLocation

	Catch
		Log(LastException)
		myCode.SendError(LastException, Activity.Title&"-t1_tick")
	End Try
'	If gmap.IsInitialized Then
'		Try
	''			Dim cl As CameraPosition
	''			cl.Initialize(gmap.MyLocation.Latitude,gmap.MyLocation.Longitude,15)
	''			gmap.AnimateCamera(cl)
	''			TxtLat.text = gmap.MyLocation.Latitude
	''			TxtLon.text = gmap.MyLocation.Longitude
'			Log("GetLocation ok")
'			loc.Initialize(gmap.MyLocation.Latitude,gmap.MyLocation.Longitude)
'			If loc.IsInitialized Then
'				TxtLat.text = loc.Latitude
'				TxtLon.text = loc.Longitude
'				Log(loc.Latitude)
'				Log(loc.Longitude)
'				
'				GPS1.Stop
'			End If
'		Catch
'			Log(LastException)
'			myCode.SendError(LastException, Activity.Title&"-t1_tick")
'		End Try
'	Else
'		t1.Enabled=True
'	End If
End Sub

Sub BtnSaveNewMoshtari_Click
	Try
		
		If TxtName.Text = "" Then
			ToastMessageShow("نام مشتری را وارد نمایید",True)
			Return
		End If
	
		If MCode.MobileIsImportent="1" Then
			If TxtMob.Text = "" And MCode.MobileIsImportent="1" Then
				ToastMessageShow("شماره همراه مشتری را وارد نمایید",True)
				Return
			End If
	
			If (MCode.Sf.Len(TxtMob.Text.Trim) <> 11 And MCode.Sf.Left(TxtMob.Text.Trim,2) <> "09") Then
				ToastMessageShow("شماره همراه را به طور کامل و صحیح وارد نمایید",True)
				Return
			End If
		End If
			
		If TxtTell.Text<>""  Then
			If MCode.Sf.Len(TxtTell.Text.Trim) <> 11 Then
				ToastMessageShow("تلفن ثابت را به طور کامل و صحیح وارد نمایید",True)
				Return
			End If
		
		End If

		If TxtAddress.Text = "" Then
			ToastMessageShow("آدرس مشتری را وارد نمایید",True)
			Return
		End If
		If CheckSubGroup(GroupCodeSelect)=False Then
			ToastMessageShow("امکان ثبت شخص جدید در گروهی که زیر گروه دارد وجود ندارد , لطفا در زیر گروه این گروه مد نظر شما ثبت نمایید",True)
			Return
		End If

		SaveNewMoshtari
	Catch
		Log(LastException)
		myCode.SendError(LastException, Activity.Title&"-BtnSaveNewMoshtari_Click")
	End Try
	
End Sub
	
Sub CheckTekrariMoshtari2(strNumber As String) As Boolean
	Dim b As Boolean=False
	Dim count As String=0
	If MCode.UpdateShakhs=True Then
		'check tell
		count=MCode.SingleResult("select count(fldCodeTafzili) from tblDaftarcheTell where fldShomare='"&strNumber&"' and fldCodeTafzili<>'"& MCode.C_Tafzili & "'")
	
		count=myCode.Is_Null_adad(count)
		If count>0 Then
			b=True
		End If
	Else
		'check tell
		count=MCode.SingleResult("select count(fldCodeTafzili) from tblDaftarcheTell where fldShomare='"&strNumber&"'")
	
		count=myCode.Is_Null_adad(count)
		If count>0 Then
			b=True
		End If
	End If


	Return b
End Sub

Sub CheckTekrariMoshtari(strNumber As String) As Boolean
	Dim b As Boolean=False
	Dim count As String=0
	'fldTell,FldMobile
	If MCode.UpdateShakhs=True Then
		'check tell
		count=MCode.SingleResult("select count(fldCodetafzili) as fldCodetafzili from TblAshkhas where fldTell='"&strNumber&"' and fldCodetafzili='"& MCode.C_Tafzili & "'")
	
		count=myCode.Is_Null_adad(count)
		If count>0 Then
			b=True
		End If
		'check mobile
		count=MCode.SingleResult("select count(fldCodetafzili) as fldCodetafzili from TblAshkhas where FldMobile='"&strNumber&"' and fldCodetafzili='"& MCode.C_Tafzili & "'")
		count=myCode.Is_Null_adad(count)
		If count>0 Then
			b=True
		End If
		
	Else
		'check tell
		count=MCode.SingleResult("select count(fldCodetafzili) as fldCodetafzili from TblAshkhas where fldTell='"&strNumber&"'")
		count=myCode.Is_Null_adad(count)
		If count>0 Then
			b=True
		End If
		'check mobile
		count=MCode.SingleResult("select count(fldCodetafzili) as fldCodetafzili from TblAshkhas where FldMobile='"&strNumber&"'")
		count=myCode.Is_Null_adad(count)
		If count>0 Then
			b=True
		End If
	
	End If
	

	Return b
End Sub

Sub SaveNewMoshtari
	'Dim Date As String = MCode.ConvertNumbersPersian2English(MCode.DatePersian)
	Try
		Dim Time As String = DateTime.Time(DateTime.Now)
	
	
	
	
		Dim Chek As Boolean
		If ChGps.Checked=True Then
			Chek=True
		Else
			If Lat.Length>0 And Lon.Length>0 Then
				Chek=True
			Else
				ToastMessageShow("تا دریافت موقعیت مکانی کمی صبر کنید",True)
			End If
		End If
		If	GroupCodeSelect=0  Then
			ToastMessageShow("لطفا گروه مورد نظر را انتخاب کنید",True)
			Return
		End If
		If myCode.Check_Is_Null(MCode.C_Visitor) Or MCode.C_Visitor="" Then
			Dim Cu As Cursor =MCode.Result("Select * From TblSetting")
			Cu.Position=0
			MCode.C_Visitor = Cu.GetString("FldC_Visitor")
			MCode.N_Visitor = Cu.GetString("FldN_Visitor")
			myCode.SendError("SaveNewMoshtari NoSetCodeVisitor",Activity.Title&"-SaveNewMoshtari")
		End If
		If Chek=True Then
			If Lat = "" Or Lon = "" Then
				Lat = ""
				Lon = ""
			End If
		
	
		
			If TxtC_Meli.Text = "" Then TxtC_Meli.Text = ""
			If TxtTell.Text<>""  Then
				If CheckTekrariMoshtari2(TxtTell.text)  Then
					ToastMessageShow("شماره تلفن وارد شده تکراری می باشد",True)
					Return
				End If
			End If
			If TxtMob.Text<>"" Then
				If CheckTekrariMoshtari2(TxtMob.text) Then
					ToastMessageShow("شماره موبایل وارد شده تکراری می باشد",True)
					Return
				End If
			End If
		
			If MCode.UpdateShakhs=False Then
				
				'Add New
				
			
				MCode.SaveUpdate("Insert Into TblAshkhasNew (FldCodeTafzili,FldSharheTafzili,FldVisitor,FldTell,FldMobile,FldAddress,FldCodeGroup,FldC_Meli,FldC_Posti,FldShomarehesab,FldLat,FldLon) Values ('"& TxtCodeMostari.Text &"', '"& TxtName.Text &"', '"& MCode.C_Visitor &"', '"& TxtTell.Text &"','"& TxtMob.text &"','"& TxtAddress.Text &"','"&GroupCodeSelect&"','"& TxtC_Meli.text &"','"& TxtC_Posti.text &"','"& TxtShomarehesab.text &"','"& TxtLat.text &"','"& TxtLon.text &"')")
				'MCode.SaveUpdate("Insert Into TblNewMoshtari (FldC_Visitor,FldC_Ashkhas,FldN_Ashkhas,FldC_Posti,FldShomarehesab,FldAddress,FldTell,FldMobile,FldC_Meli,FldLat,FldLon,fldCodeGroup,fldNameGroup) Values ('"& _
				'MCode.C_Visitor &"','"& NewCode &"','"& TxtName.text &"','"& TxtC_Posti.text &"','"& TxtShomarehesab.text &"','"& TxtAddress.Text &"','"& TxtTell.text &"','"& _
				'TxtMob.Text &"','"& TxtC_Meli.Text &"','"& Lat &"','"& Lon &"','"& GroupCodeSelect &"','"& GroupNameSelect &"')")
			
				MCode.SaveUpdate("Insert Into TblAshkhas (fldCodetafzili,fldSharheTafzili,fldVisitor,fldTell,FldMobile,FldC_Meli,FldC_Posti,FldShomarehesab,fldAdress,fldMande,fldCodeGroup,fldNameGroup,FldLat,FldLon,FldSync) Values ('"& _
		 TxtCodeMostari.Text &"', '"& TxtName.Text &"', '"& MCode.C_Visitor &"', '"& TxtTell.Text &"','"& TxtMob.text &"','"& TxtC_Meli.text &"','"& TxtC_Posti.text &"','"& TxtShomarehesab.text &"','"& TxtAddress.Text &"','0','"&GroupCodeSelect&"','"&GroupNameSelect&"','"& TxtLat.text &"','"& TxtLon.text &"','False')")
			
'		MCode.SaveUpdate("Insert Into TblAshkhas (FldC_Ashkhas,FldN_Ashkhas,FldAddress,FldTell,FldMob,FldC_City,FldN_City,FldVaziat,FldEtebar,FldMandeHesab,FldLastVisit,FldLastSefaresh,FldLat,FldLon,FldTipFee) Values ('"& _
'			 NewCode &"','"& TxtName.text &"','"& TxtAddress.Text &"','"& TxtTell.text &"','"& TxtMob.Text &"','202020','مشتریان جدید','نامشخص','','','','','"& Lat &"','"& Lon &"','0')")	
'		
				MCode.C_Tafzili=TxtCodeMostari.Text
				CallSub3(Service_Server,"SaveLocationMoshtari",TxtLat.text,TxtLon.Text)
				ToastMessageShow("اطلاعات با موفقیت ثبت گردید",True)
				GPS1.stop
				Activity_KeyPress(KeyCodes.KEYCODE_BACK)
			Else
				'update
			
				UpdateAshkhasNew
				
				UpdateAshkhas
			
'				If MCode.page="Act_SelectMantage" Then
				'CallSub(Act_SelectMantage,"LoadAshkhas")
'				Else
'					CallSubDelayed(Act_Moshtarian,"LoadAshkhas")
'				End If

			End If
			
			ToastMessageShow("اطلاعات با موفقیت ثبت گردید",True)
			GPS1.stop
			Activity_KeyPress(KeyCodes.KEYCODE_BACK)
		End If
	Catch
		Log(LastException)
		myCode.SendError(LastException, Activity.Title&"-SaveNewMoshtari")
	End Try
End Sub

Sub UpdateAshkhasNew
	Dim Fields As Map
	Dim Where As Map
		
	Fields.Initialize
	Where.Initialize
	
	Fields.Put("FldSharheTafzili",TxtName.Text)
	Fields.Put("FldTell",TxtTell.Text)
	Fields.Put("FldMobile",TxtMob.Text)
	Fields.Put("FldAddress",TxtAddress.Text)
	Fields.Put("fldCodeGroup",GroupCodeSelect)
	Fields.Put("FldC_Meli",TxtC_Meli.Text)
	Fields.Put("FldC_Posti",TxtC_Posti.Text)
	Fields.Put("FldShomarehesab",TxtShomarehesab.Text)
	Fields.Put("FldLat",TxtLat.Text)
	Fields.Put("FldLon",TxtLon.Text)
	
	Where.Put("FldCodeTafzili",shakhs.CodeTafzili)
	

	DBUtils.UpdateRecord2(MCode.Sql1,"TblAshkhasNew",Fields,Where)
End Sub

Sub UpdateAshkhas
	Dim Fields As Map
	Dim Where As Map
		
	Fields.Initialize
	Where.Initialize
	
	Fields.Put("fldSharheTafzili",TxtName.Text)
	Fields.Put("fldTell",TxtTell.Text)
	Fields.Put("FldMobile",TxtMob.Text)
	Fields.Put("fldAdress",TxtAddress.Text)
	Fields.Put("fldCodeGroup",GroupCodeSelect)
	Fields.Put("fldNameGroup",GroupNameSelect)
	Fields.Put("FldC_Meli",TxtC_Meli.Text)
	Fields.Put("FldC_Posti",TxtC_Posti.Text)
	Fields.Put("FldShomarehesab",TxtShomarehesab.Text)
	Fields.Put("FldLat",TxtLat.Text)
	Fields.Put("FldLon",TxtLon.Text)
	
	Where.Put("fldCodetafzili",shakhs.CodeTafzili)
	

	DBUtils.UpdateRecord2(MCode.Sql1,"TblAshkhas",Fields,Where)
End Sub

Sub ChGps_CheckedChange(Checked As Boolean)
	If Checked=True Then
		TxtLat.Enabled=True
		TxtLon.Enabled=True
	Else
		TxtLat.Enabled=False
		TxtLon.Enabled=False
	End If
End Sub

Sub TxtLon_TextChanged (Old As String, New As String)
	Lon=MCode.ConvertNumbersPersian2English(TxtLon.text)
End Sub

Sub TxtLat_TextChanged (Old As String, New As String)
	Lat=MCode.ConvertNumbersPersian2English(TxtLat.text)
End Sub

Sub BtnNewNumber_Click
	Dim str As String=DateTime.Now
	TxtMob.Text="09"&str.SubString(str.Length-9)
End Sub

Sub btn_Back_Click
	Activity.Finish
End Sub

Sub Application_Error (Error As Exception, StackTrace As String) As Boolean
'	MCode.ScheduleRestartCrashedActivity(DateTime.Now + 300, Activity.Title, Error)
	Return True
End Sub



'Private Sub Btn_SelectGroup_Click
'	Panel1.BringToFront
'	Panel1.Visible=True
'	SearchTemplate.SearchField.HintText="نام گروه مورد نظر را جستجو نمایید"
'	SearchTemplate.SearchField.lblClear.Text=""
'	SearchTemplate.SearchField.lblV.Text=""
'	SearchTemplate.SearchField.Update
'	Dim rs As Object = Dialog.ShowTemplate(SearchTemplate, "", "", "انصراف")
'	AnimateDialog(Dialog, "right")
'	Wait For (rs) Complete (Result As Int)
'	If Result = XUI.DialogResponse_Positive Then
'		Btn_SelectGroup.Text = SearchTemplate.SelectedItem
'		'FldC_Gorooh,FldN_Gorooh
'		Dim Cu As Cursor = MCode.Result("Select * From TblGoroohAshkhas where FldN_Gorooh='"&Btn_SelectGroup.Text&"'")
'		Cu.Position=0
'		GroupCodeSelect1 =  Cu.GetString("FldC_Gorooh")
'		GroupNameSelect1 =  Cu.GetString("FldN_Gorooh")
'		Log("کد گروه اشخاص : "&Cu.GetString("FldC_Gorooh"))
'		Log("کد گروه اشخاص : "&Cu.GetString("FldN_Gorooh"))
'	Else
'		Btn_SelectGroup.Text = "انتخاب منطقه"
'		GroupCodeSelect1=0
'	End If
'	Panel1.Visible=False
'End Sub

Sub AnimateDialog (dlg As B4XDialog, FromEdge As String)
	Dim Base As B4XView = dlg.Base
	Dim top As Int = Base.Top
	Dim left As Int = Base.Left
	Select FromEdge.ToLowerCase
		Case "bottom"
			Base.Top = Base.Parent.Height
		Case "top"
			Base.Top = -Base.Height
		Case "left"
			Base.Left = -Base.Width
		Case "right"
			Base.Left = Base.Parent.Width
	End Select
	Base.SetLayoutAnimated(300, left, top, Base.Width, Base.Height)
End Sub

Private Sub btnSearchGroup1_Click
	
	Panel1.BringToFront
	Panel1.Visible=True
	SearchTemplate1.SearchField.HintText="نام گروه مورد نظر را جستجو نمایید"
	SearchTemplate1.SearchField.lblClear.Text=""
	SearchTemplate1.SearchField.lblV.Text=""
	SearchTemplate1.SearchField.Update
	Dim rs As Object = Dialog.ShowTemplate(SearchTemplate1, "", "", "انصراف")
	AnimateDialog(Dialog, "right")
	Wait For (rs) Complete (Result As Int)
	If Result = XUI.DialogResponse_Positive Then
		'Btn_SelectGroup.Text = SearchTemplate.SelectedItem
		'FldC_Gorooh,FldN_Gorooh
		'Dim index As Int=	lstSearchGroup1.IndexOf(SearchTemplate1.SelectedItem)
		Dim Cu As Cursor = MCode.Result("Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas where FldN_Gorooh='"& SearchTemplate1.SelectedItem &"'")
		Cu.Position=0
		GroupCodeSelect1 =  Cu.GetString("FldC_Gorooh")
		GroupNameSelect1 =  Cu.GetString("FldN_Gorooh")
		Log("کد گروه اشخاص : "&Cu.GetString("FldC_Gorooh"))
		Log("نام گروه اشخاص : "&Cu.GetString("FldN_Gorooh"))
'		B4XComboBox1.SelectedIndex=index
'		NiceSpinner.SelectedIndex=index
		

		NiceSpinner.Text=GroupNameSelect1
		NiceSpinner_item_clicked1
	
		
	Else
'		Btn_SelectGroup.Text = "انتخاب منطقه"
		GroupCodeSelect1=0
	End If
	Panel1.Visible=False
End Sub

Private Sub btnSearchGroup2_Click
	If lstSearchGroup2.Size=0 Then
		Return
	End If
	Panel1.BringToFront
	Panel1.Visible=True
	SearchTemplate2.SearchField.HintText="نام گروه مورد نظر را جستجو نمایید"
	SearchTemplate2.SearchField.lblClear.Text=""
	SearchTemplate2.SearchField.lblV.Text=""
	SearchTemplate2.SearchField.Update
	Dim rs As Object = Dialog.ShowTemplate(SearchTemplate2, "", "", "انصراف")
	AnimateDialog(Dialog, "right")
	Wait For (rs) Complete (Result As Int)
	If Result = XUI.DialogResponse_Positive Then
	
		'Btn_SelectGroup.Text = SearchTemplate.SelectedItem
		'FldC_Gorooh,FldN_Gorooh
'		If SearchTemplate2.SelectedItem = "همه گروه ها" Then
'			GroupCodeSelect2=0
'			IndexGroup2=0
'			NiceSpinner1.Text=SearchTemplate2.SelectedItem
		''			NiceSpinner1_item_clicked1
'			Return
'		End If
		Dim Cu As Cursor = MCode.Result("Select * From TblGoroohAshkhas where FldN_Gorooh='"&SearchTemplate2.SelectedItem&"'")
'		Dim mc As String=GroupCodeSelect1
'		If GroupCodeSelect2>0 Then
'		mc=GroupCodeSelect2
'		End If
'		Dim Count As Int = mc.Length + 3
'		Dim Cu As Cursor = MCode.Result(querySearch2)
		Cu.Position=0
		GroupCodeSelect2 =  Cu.GetString("FldC_Gorooh")
		GroupNameSelect2 =  Cu.GetString("FldN_Gorooh")
		Log("کد گروه اشخاص : "&Cu.GetString("FldC_Gorooh"))
		Log("نام گروه اشخاص : "&Cu.GetString("FldN_Gorooh"))
'		Dim index2 As Int=	lstSearchGroup2.IndexOf(SearchTemplate2.SelectedItem)
'		NiceSpinner1.SelectedIndex=index2
'		If index2=0 Then
'			GroupCodeSelect2=0
'			Return
'		End If
'		IndexGroup2=index2
		NiceSpinner1.Text=GroupNameSelect2
		NiceSpinner1_item_clicked1
	Else
'		Btn_SelectGroup.Text = "انتخاب منطقه"
		GroupCodeSelect2=0
	End If
	Panel1.Visible=False
End Sub