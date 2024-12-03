B4A=true
Group=Activity
ModulesStructureVersion=1
Type=Activity
Version=10
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
#End Region

Sub Process_Globals
	Private gps	As GPS
	Dim t_gps As Timer
End Sub

Sub Globals
	Dim UtilS As Hitex_Utils
	Dim Key As IME
	Dim ListAshkhas,OrginalListAshkhas As List
	Dim CuAshkhas As Cursor
	Public NiceSpinner As NiceSpinner
	Public NiceSpinner1 As NiceSpinner
	Private B4XComboBox1 As B4XComboBox
	Private B4XComboBox2 As B4XComboBox
	Dim ListGoroohAshkhas,OriginalListGoroohAshkhas As List
	Private pnl_HLV As Panel
	Private HLV As Hitex_LayoutView
	Private ListMantaghe As List
	Private Date As String
	Private TxtSearch As EditText
	Private LblTedadVisit As Label
	Private LblTedadSefaresh As Label
	Private lblTedadKol As Label
	Private PnlSpGroup As Panel
	Private btn_sort As Label
	Private SwTour As ACSwitch
	Private SwBed As ACSwitch
	'Private PnlBed As Panel
	Private Str_sort As String = " Order by fldCodetafzili Asc"
	Dim GroupCodeSelect1 As String="0"
	Dim GroupNameSelect1 As String=""
	Dim GroupCodeSelect2 As String="0"
	Dim GroupNameSelect2 As String=""
	Dim countvisit As Int=0
	Dim countsefaresh As Int=0
	Dim lstSelectedCodeGroupAshkhas As List
	'Dim t1 As Timer
	Dim tcount As Int
	Private SwBes As ACSwitch
	Private MapFragment1 As MapFragment
	'Private gmap As GoogleMap
	'Private rp As RuntimePermissions
	'Dim Lat As String
	'Dim Lon As String
	Private SwNew As ACSwitch
	Dim lstGroup1 As List
	Dim lstGroup2 As List
	Private swSearchByAddress As ACSwitch
	Private btnNewAshkhas As Panel
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Activity.LoadLayout("L_SelectMantaghe_2")
	Try
	lstSelectedCodeGroupAshkhas.Initialize
	Key.Initialize("Key")
	ListAshkhas.Initialize
	OrginalListAshkhas.Initialize
	OriginalListGoroohAshkhas.Initialize
	ListGoroohAshkhas.Initialize
	gps.Initialize("gps")
	't1.Initialize("t1",1000)
	'tcount=3
	't1.Enabled=True
		lstGroup1.Initialize
		lstGroup2.Initialize
	
	HLV.Initializer("HLV").ListView.Build
	
		pnl_HLV.AddView(HLV,0,0,pnl_HLV.Width,pnl_HLV.Height)
	
		NiceSpinner.Initialize("NiceSpinner")
		PnlSpGroup.AddView(NiceSpinner,B4XComboBox1.mBase.Left,B4XComboBox1.mBase.top,B4XComboBox1.mBase.Width,B4XComboBox1.mBase.Height)
		NiceSpinner.TextColor = Colors.Black
		NiceSpinner.Gravity = Gravity.CENTER_HORIZONTAL
		NiceSpinner.Typeface = Typeface.LoadFromAssets("p_font.ttf")
		Dim op As ColorDrawable
		op.Initialize2(Colors.White,8dip,2dip,Colors.Black)
		NiceSpinner.Background=op
	
		NiceSpinner1.Initialize("NiceSpinner1")
		PnlSpGroup.AddView(NiceSpinner1,B4XComboBox2.mBase.Left,B4XComboBox2.mBase.top,B4XComboBox2.mBase.Width,B4XComboBox2.mBase.Height)
		NiceSpinner1.TextColor = Colors.Black
		NiceSpinner1.Gravity = Gravity.CENTER_HORIZONTAL
		NiceSpinner1.Typeface = Typeface.LoadFromAssets("p_font.ttf")
		Dim op1 As ColorDrawable
		op1.Initialize2(Colors.White,8dip,2dip,Colors.Black)
		NiceSpinner1.Background=op1
		lstGroup2.Add("همه گروه ها")
		NiceSpinner1.attachDataSource(lstGroup2)
	LoadAcSpGroohAshkas
	
	HLV.Show
		'MCode.page="Act_Moshtarian"
	Date = MCode.ConvertNumbersPersian2English(MCode.DatePersian)
'	myCode.TextBoxBackColorWhite(TxtSearch)
	Log("showbedehkaran: " & MCode.showbedehkaran)
	'Select Case MCode.showbedehkaran
	'	Case "0"
'			LblBed.Visible=False
'			SwBed.mBase.Visible=False
'			ChBed.Visible = False
	'PnlBed.Visible=False
	'Case "1"
'			LblBed.Visible=True
'			SwBed.mBase.Visible = True
'			ChBed.Visible = True
	'PnlBed.Visible = True
		'update_data
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-Activity_Create")
	End Try
	'End Select
	'LoadListAshkhas("Select * From TblAshkhas "& Str_sort,0)
End Sub
Sub update_data
	Try
		If MCode.IsConnected Then
	MCode.page="Act_Moshtarian"
	FirebaseMessaging.mode="GetGoroohAshkhas"
	StartService(FirebaseMessaging)
	Else
		LoadAshkhas
		End If
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-update_data")
	End Try
End Sub

'Sub MapFragment1_Ready
'	Sleep(100)
'	Try
'		If MCode.Gps="1" Then
'			If gps.GPSEnabled=True Then
'				gmap = MapFragment1.GetMap
'				rp.CheckAndRequest(rp.PERMISSION_ACCESS_FINE_LOCATION)
'				Wait For Activity_PermissionResult (Permission As String, Result As Boolean)
'				If Result Then
'					gmap.MyLocationEnabled = True
'					't_gps.Initialize("t_gps",IIf(MCode.Interval>0,MCode.Interval,1500))
'					t_gps.Enabled=True
'				Else
'					Log("No permission!")
'				End If
'			Else
'				gmap.MyLocationEnabled=False
'				ToastMessageShow("لطفا GPS گوشی خود را فعال کنید", True)
'				StartActivity(gps.LocationSettingsIntent)
'			End If
'		End If
'	Catch
'		Log(LastException)
'		myCode.SendError(LastException,Activity.Title&"-MapFragment1_Ready")
'	End Try
'
'End Sub

Sub t_gps_Tick
'	If gmap.IsInitialized Then
'		Try
'			Dim cl As CameraPosition
'			cl.Initialize(gmap.MyLocation.Latitude,gmap.MyLocation.Longitude,15)
'			gmap.AnimateCamera(cl)
'			Lat = gmap.MyLocation.Latitude
'			Lon = gmap.MyLocation.Longitude
'
'			If myCode.IsNullOrWhiteSpace(Lat)=False And myCode.IsNullOrWhiteSpace(Lon)=False Then
'				Log(Lat)
'				Log(Lon)
'				MCode.Lat=Lat
'				MCode.Lon=Lon
'				MCode.SaveLocationToDb
'			End If
'		Catch
'			Log(LastException)
'			myCode.SendError(LastException,Activity.Title&"-T_EnterExit_tick")
'		End Try
'	End If
End Sub

Sub LoadAshkhas
	Try
		MCode.page ="Act_Moshtarian"
		Dim str As String=""
		Dim countfilter As Int=0
		Dim filter As Boolean=False
		DateTime.DateFormat="yyyy-MM-dd"
		Dim DateMiladi As String = MCode.ConvertNumbersPersian2English(DateTime.Date(DateTime.Now))
		Dim Time As String = DateTime.Time(DateTime.Now)
		Dim Date As String =MCode.DatePersian '& "T" & Time
		LogColor("D: " & Date,Colors.Red)
		Dim CuTedad As Cursor
		Log(GroupCodeSelect1)
		Log(GroupCodeSelect2)
		If GroupCodeSelect1=0 And GroupCodeSelect2=0 Then
			If SwTour.Checked=True Then
				countfilter=countfilter+1
		
				str= str & " and FldLastVisit <> 0 "
				filter=True
				If countfilter=1 Then
					str=str.Replace(" and ","")
				End If
			End If
		
			If SwNew.Checked=True Then
				countfilter=countfilter+1
		
				str= str & " and length(fldCodetafzili)>5 "
				filter=True
				If countfilter=1 Then
					str=str.Replace(" and ","")
				End If
			End If
	
			If SwBed.Checked=True Then
				countfilter=countfilter+1
		
				str= str & " and fldMande > 0 "
				filter=True
				If countfilter=1 Then
					str=str.Replace(" and ","")
				End If
			End If
		
			If SwBes.Checked=True Then
				countfilter=countfilter+1
		
				str= str & " and fldMande < 0 "
				filter=True
				If countfilter=1 Then
					str=str.Replace(" and ","")
				End If
			End If

			If TxtSearch.Text.Length>0 And TxtSearch.Text<>" " And TxtSearch.Text<>"" Then
			
				Dim Search As String=MCode.ConvertNumbersPersian2English(TxtSearch.Text)
				If Search="" Then
					Search=TxtSearch.Text
				End If
				countfilter=countfilter+1
				If swSearchByAddress.Checked Then
					str = str & $" and (fldAdress like '%${Search}%') "$
				Else
					If IsNumber(Search) Then
						str = str & $" and (fldCodetafzili like '%${Search}%') "$
					Else
						str = str & $" and (fldSharheTafzili like '%${Search}%') "$
					End If
				End If
				filter=True
				If countfilter=1 Then
					str=str.Replace(" and ","")
				End If
			End If
			If filter=True And str<>"" Then
				CuTedad = MCode.Result("Select * From TblAshkhas Where "&str&" and FldLastVisit > '"& Date &"'")
				LblTedadVisit.Text =  CuTedad.RowCount
				CuTedad = MCode.Result("Select * From TblAshkhas Where "&str&" and FldLastSefaresh > '"& Date &"'")
				LblTedadSefaresh.Text =  CuTedad.RowCount
			
'			str=str.Replace(" and ","")
				str="Select * From TblAshkhas where "&str&" "&Str_sort
			Else
				CuTedad = MCode.Result("Select * From TblAshkhas Where FldLastVisit = '"& Date &"'")
				LblTedadVisit.Text =  CuTedad.RowCount
				CuTedad = MCode.Result("Select * From TblAshkhas Where FldLastSefaresh = '"& Date &"'")
				LblTedadSefaresh.Text =  CuTedad.RowCount
			
				str="Select * From TblAshkhas "&Str_sort
			End If
		
			Log(str)
		End If
	
		If GroupCodeSelect1<>0 And GroupCodeSelect2=0 Then
			'countfilter=countfilter+1
			If SwTour.Checked=True Then
				countfilter=countfilter+1
		
				str= str & " and FldLastVisit <> 0 "
				filter=True
				If countfilter=1 Then
					str=str.Replace(" and ","")
				End If
			End If
		
			If SwNew.Checked=True Then
				countfilter=countfilter+1
		
				str= str & " and length(fldCodetafzili)>5 "
				filter=True
				If countfilter=1 Then
					str=str.Replace(" and ","")
				End If
			End If
	
			If SwBed.Checked=True Then
				countfilter=countfilter+1
		
				str= str & " and fldMande > 0 "
				filter=True
				If countfilter=1 Then
					str=str.Replace(" and ","")
				End If
			End If
		
			If SwBes.Checked=True Then
				countfilter=countfilter+1
		
				str= str & " and fldMande < 0 "
				filter=True
				If countfilter=1 Then
					str=str.Replace(" and ","")
				End If
			End If

			If TxtSearch.Text.Length>0 And TxtSearch.Text<>" " And TxtSearch.Text<>"" Then
			
				Dim Search As String=MCode.ConvertNumbersPersian2English(TxtSearch.Text)
				If Search="" Then
					Search=TxtSearch.Text
				End If
				countfilter=countfilter+1
				If swSearchByAddress.Checked Then
					str = str & $" and (fldAdress like '%${Search}%') "$
				Else
					If IsNumber(Search) Then
						str = str & $" and (fldCodetafzili like '%${Search}%') "$
					Else
						str = str & $" and (fldSharheTafzili like '%${Search}%') "$
					End If
				End If
				filter=True
				If countfilter=1 Then
					str=str.Replace(" and ","")
				End If
			End If
			If filter=True And str<>"" Then
				CuTedad = MCode.Result("Select * From TblAshkhas Where fldCodeGroup like '"&GroupCodeSelect1&"%' and "&str&" and FldLastVisit = '"& Date &"'")
				LblTedadVisit.Text =  CuTedad.RowCount
				CuTedad = MCode.Result("Select * From TblAshkhas Where fldCodeGroup like '"&GroupCodeSelect1&"%' and "&str&" and FldLastSefaresh = '"& Date &"'")
				LblTedadSefaresh.Text =  CuTedad.RowCount
		
				str="Select * From TblAshkhas Where fldCodeGroup like '"&GroupCodeSelect1&"%' and "&str&" " &Str_sort
				Log(str)
			Else
				CuTedad = MCode.Result("Select * From TblAshkhas Where fldCodeGroup like '"&GroupCodeSelect1&"%' and FldLastVisit = '"& Date &"'")
				LblTedadVisit.Text =  CuTedad.RowCount
				CuTedad = MCode.Result("Select * From TblAshkhas Where fldCodeGroup like '"&GroupCodeSelect1&"%' and FldLastSefaresh = '"& Date &"'")
				LblTedadSefaresh.Text =  CuTedad.RowCount
		
				str="Select * From TblAshkhas Where fldCodeGroup like '"&GroupCodeSelect1&"%' "&Str_sort
				
			End If
	
		End If
	
		If GroupCodeSelect1<>0 And GroupCodeSelect2<>0 Then
			If SwTour.Checked=True Then
				countfilter=countfilter+1
		
				str= str & " and FldLastVisit <> 0 "
				filter=True
				If countfilter=1 Then
					str=str.Replace(" and ","")
				End If
			End If
		
			If SwNew.Checked=True Then
				countfilter=countfilter+1
		
				str= str & " and length(fldCodetafzili)>5 "
				filter=True
				If countfilter=1 Then
					str=str.Replace(" and ","")
				End If
			End If
	
			If SwBed.Checked=True Then
				countfilter=countfilter+1
		
				str= str & " and fldMande > 0 "
				filter=True
				If countfilter=1 Then
					str=str.Replace(" and ","")
				End If
			End If
		
			If SwBes.Checked=True Then
				countfilter=countfilter+1
		
				str= str & " and fldMande < 0 "
				filter=True
				If countfilter=1 Then
					str=str.Replace(" and ","")
				End If
			End If

			If TxtSearch.Text.Length>0 And TxtSearch.Text<>" " And TxtSearch.Text<>"" Then
			
				Dim Search As String=TxtSearch.Text
				If Search="" Then
					Search=TxtSearch.Text
				End If
				countfilter=countfilter+1
				If swSearchByAddress.Checked Then
					str = str & $" and (fldAdress like '%${Search}%') "$
				Else
					If IsNumber(Search) Then
						str = str & $" and (fldCodetafzili like '%${Search}%') "$
					Else
						str = str & $" and (fldSharheTafzili like '%${Search}%') "$
					End If
				End If
				
				filter=True
				If countfilter=1 Then
					str=str.Replace(" and ","")
				End If
			End If
		
			If filter=True And str<>"" Then
				CuTedad = MCode.Result("Select * From TblAshkhas Where fldCodeGroup like '"&GroupCodeSelect2&"%' and "&str&" and FldLastVisit = '"& Date &"'")
				LblTedadVisit.Text =  CuTedad.RowCount
				CuTedad = MCode.Result("Select * From TblAshkhas Where fldCodeGroup like '"&GroupCodeSelect2&"%' and "&str&" and FldLastSefaresh = '"& Date &"'")
				LblTedadSefaresh.Text =  CuTedad.RowCount
				
				
		
				str="Select * From TblAshkhas Where fldCodeGroup like '"&GroupCodeSelect2&"%' and "&str&" "&Str_sort
			Else
				CuTedad = MCode.Result("Select * From TblAshkhas Where fldCodeGroup like '"&GroupCodeSelect2&"%'"&" and FldLastVisit = '"& Date &"'")
				LblTedadVisit.Text =  CuTedad.RowCount
				CuTedad = MCode.Result("Select * From TblAshkhas Where fldCodeGroup like '"&GroupCodeSelect2&"%'"&" and FldLastSefaresh = '"& Date &"'")
				LblTedadSefaresh.Text =  CuTedad.RowCount
		
				str="Select * From TblAshkhas Where fldCodeGroup like '"&GroupCodeSelect2&"%' "&Str_sort
			End If
		
			Log(str)
		End If
		Sleep(200)
		LoadListAshkhas(str)
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-LoadAshkhas")
	End Try
End Sub
Sub LoadAcSpGroohAshkas
	Try
		lstGroup1.Add("همه گروه ها")
		Dim Dt1 As Cursor = MCode.Result("Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas")
		For i=0 To Dt1.RowCount-1
			Dt1.Position=i
			
			Dim sizeCode As Long=Dt1.GetString("FldC_Gorooh").Length
			If sizeCode=3 Then
				Dim Item As AdapterGoroohAshkhas
				Item.FldC_Gorooh= Dt1.GetString("FldC_Gorooh")
				Item.FldN_Gorooh= Dt1.GetString("FldN_Gorooh")
				OriginalListGoroohAshkhas.Add(Item)
				lstGroup1.Add(Item.FldN_Gorooh)
				Else
				Dim code As String=Dt1.GetString("FldC_Gorooh").SubString2(0,3)
				Dim count As Long
				Dim MinCode As String =MCode.SingleResult("Select min(FldC_Gorooh) From TblGoroohAshkhas where FldC_Gorooh Like '"& code &"%'")
				For Each a As AdapterGoroohAshkhas In OriginalListGoroohAshkhas
					If a.FldC_Gorooh.SubString2(0,3)=code Then
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
					OriginalListGoroohAshkhas.Add(Item)
					lstGroup1.Add(Item.FldN_Gorooh)
				End If
			End If
		Next
		
		
		
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

Sub Activity_Resume
	Try
		MCode.UpdateSetting
'		StartService(Service_Gps)
		StartService(FusedLocationService)
	Log("Gps Start")
		'update_data
		LoadAshkhas
	'Date = MCode.ConvertNumbersPersian2English(MCode.DatePersian)
	'CMBselectMantage_SelectedIndexChanged(CMBselectMantage.SelectedIndex)
'		HLV.notifyDataSetChanged
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-Activity_Resume")
	End Try
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub btn_Back_Click
	Activity.Finish
End Sub

Private Sub HLV_onCreateViewHolder (Parent As Panel, ViewType As Int)      '💎 onCreate 💎'
	Dim rec As cls_RecAshkhas
	rec.Initialize
	Parent.Tag=rec
End Sub
Sub HLV_onBindViewHolder (Parent As Panel, Position As Int)         '💠 onBind 💠'
	Dim item As AdapterListAshkhas=ListAshkhas.Get(Position)
	Dim rec As cls_RecAshkhas=Parent.Tag
	Parent.AddView(rec.Panel,0,0,100%x,rec.Height)
	rec.show(item,Date)
	Parent.Height=rec.Height
End Sub
Sub HLV_GetItemCount As Int 								        '💯 ItemCount 💯'
	Return ListAshkhas.Size '/ItemList.Size
End Sub

Sub NiceSpinner_item_clicked
	Dim Position As Int=NiceSpinner.SelectedIndex
	Dim Value As Object=NiceSpinner.Text
	Log("ns1 item " & NiceSpinner.SelectedIndex &" selected")
	Log("ns1 item " & NiceSpinner.Text &" selected")
	'TxtSearch.Text= ""
	Try
		Key.HideKeyboard
		'ListGoroohAshkhas.Clear
		If Position = 0 Then
			ListGoroohAshkhas.Clear
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
			Dim lst As List=OriginalListGoroohAshkhas
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
			'Dim Cu As Cursor = MCode.Result($"Select FldC_Gorooh,FldN_Gorooh From TblGoroohKala where FldC_Gorooh like '${mc}%' Order By FldC_Gorooh"$)
			
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
					ListGoroohAshkhas.Add(Item)
'				NiceSpinner1.Add(Cu.GetString("FldN_Gorooh"))
					lstGroup2.Add(Cu.GetString("FldN_Gorooh"))
				Next
'			NiceSpinner1.Show(Colors.blue, 14)
				NiceSpinner1.attachDataSource(lstGroup2)
				'NiceSpinner1.SelectedIndex = 0
				lstSelectedCodeGroupAshkhas.Add(GroupCodeSelect1)
			Else
				ListGoroohAshkhas.Clear
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

		LoadAshkhas
		Log("CodeGroupSelect1: "&GroupCodeSelect1)
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
			GroupCodeSelect2=lstSelectedCodeGroupAshkhas.Get(lstSelectedCodeGroupAshkhas.Size-1)
		Else
			Dim lst As List=ListGoroohAshkhas
			Dim Item As AdapterGoroohAshkhas=lst.Get(Position-1)
			GroupCodeSelect2=Item.FldC_Gorooh
		
			Dim mc As String=Item.FldC_Gorooh
			
			Dim Count As Int = mc.Length + 3
			Dim Cu As Cursor=MCode.Result("Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas where FldC_Gorooh Like '"& mc &"%' And Length(FldC_Gorooh) = "& Count &" ORDER BY FldC_Gorooh")
			If Cu.RowCount>0 Then
				ListGoroohAshkhas.Clear
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
					ListGoroohAshkhas.Add(Item)
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
		LoadAshkhas
		Log("CodeGroupSelect2: "&GroupCodeSelect2)
		Log("position2: "&Position)
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-NiceSpinner1_ItemClick")
	End Try
End Sub

Sub NiceSpinner_ItemClick (Position As Int, Value As Object)
	'TxtSearch.Text= ""
	Try
		Key.HideKeyboard
		'ListGoroohAshkhas.Clear
		If Position = 0 Then
			ListGoroohAshkhas.Clear
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
			NiceSpinner1.SelectedIndex=0
		Else
			Dim lst As List=OriginalListGoroohAshkhas
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
			'Dim Cu As Cursor = MCode.Result($"Select FldC_Gorooh,FldN_Gorooh From TblGoroohKala where FldC_Gorooh like '${mc}%' Order By FldC_Gorooh"$)
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
					ListGoroohAshkhas.Add(Item)
'				NiceSpinner1.Add(Cu.GetString("FldN_Gorooh"))
					lstGroup2.Add(Cu.GetString("FldN_Gorooh"))
				Next
'			NiceSpinner1.Show(Colors.blue, 14)
				NiceSpinner1.attachDataSource(lstGroup2)
				NiceSpinner1.SelectedIndex = 0
				lstSelectedCodeGroupAshkhas.Add(GroupCodeSelect1)
			Else
				ListGoroohAshkhas.Clear
				lstSelectedCodeGroupAshkhas.Clear
'			NiceSpinner1.Clear
				lstGroup2.Clear
'		NiceSpinner1.Add("همه گروه ها")
				lstGroup2.Add("همه گروه ها")
				GroupCodeSelect2="0"
				GroupNameSelect2=""
				NiceSpinner1.SelectedIndex=0
			End If
		End If

		LoadAshkhas
		Log("CodeGroupSelect1: "&GroupCodeSelect1)
		Log("postion1: "&Position)
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-NiceSpinner_ItemClick")
	End Try
End Sub

Sub NiceSpinner1_ItemClick (Position As Int, Value As Object)
	Try
		If Position=0 Then
			GroupCodeSelect2=lstSelectedCodeGroupAshkhas.Get(lstSelectedCodeGroupAshkhas.Size-1)
		Else
			Dim lst As List=ListGoroohAshkhas
			Dim Item As AdapterGoroohAshkhas=lst.Get(Position-1)
			GroupCodeSelect2=Item.FldC_Gorooh
		
			Dim mc As String=Item.FldC_Gorooh
			
			Dim Count As Int = mc.Length + 3
			Dim Cu As Cursor=MCode.Result("Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas where FldC_Gorooh Like '"& mc &"%' And Length(FldC_Gorooh) = "& Count &" ORDER BY FldC_Gorooh")
			If Cu.RowCount>0 Then
				ListGoroohAshkhas.Clear
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
					ListGoroohAshkhas.Add(Item)
'				NiceSpinner1.Add(Cu.GetString("FldN_Gorooh"))
					lstGroup2.Add(Cu.GetString("FldN_Gorooh"))

				Next
		
'			NiceSpinner1.Show(Colors.blue, 14)
				NiceSpinner1.attachDataSource(lstGroup2)
				NiceSpinner1.SelectedIndex = 0
			End If
		End If
		LoadAshkhas
		Log("CodeGroupSelect2: "&GroupCodeSelect2)
		Log("position2: "&Position)
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-NiceSpinner1_ItemClick")
	End Try
End Sub
'Sub NiceSpinner1_ItemClick (Position As Int, Value As Object)
'	TxtSearch.Text= ""
'	Key.HideKeyboard
'	
'	If Position = 0 Then
'		NiceSpinner1.Clear
'		NiceSpinner1.Add("همه گروه ها")
'		NiceSpinner1.SelectedIndex=0
'		LoadListAshkhas("Select * From TblAshkhas " & Str_sort)
'
'	Else
'		'NiceSpinner1.Clear
'		Dim lst As List=ListGoroohAshkhas
'		Dim Item As AdapterGoroohAshkhas=lst.Get(NiceSpinner1.SelectedIndex-1)
'		Log(Item.FldN_Gorooh)
'		Dim mc As String=Item.FldC_Gorooh
'		'Dim Cu As Cursor = MCode.Result($"Select FldC_Gorooh,FldN_Gorooh From TblGoroohKala where FldC_Gorooh like '${mc}%' Order By FldC_Gorooh"$)
'		Dim Count As Int = Item.FldC_Gorooh.Length + 3
'		Dim Cu As Cursor=MCode.Result("Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas where FldC_Gorooh Like '"& mc &"%' And Length(FldC_Gorooh) = "& Count &" ORDER BY FldC_Gorooh")
'		If Cu.RowCount>0 Then
'			ListGoroohAshkhas.Clear
'			NiceSpinner1.Clear
'			NiceSpinner1.Add("همه گروه ها")
'			For i=0 To Cu.RowCount-1
'				Cu.Position=i
'				Dim Item As AdapterGoroohAshkhas
'				Item.FldC_Gorooh=Cu.GetString("FldC_Gorooh")
'				Item.FldN_Gorooh=Cu.GetString("FldN_Gorooh")
'				ListGoroohAshkhas.Add(Item)
'				NiceSpinner1.Add(Cu.GetString("FldN_Gorooh"))
'			Next
'			NiceSpinner1.Show(Colors.blue, 14)
'			NiceSpinner1.SelectedIndex = 0
'		End If
'	End If
'	search(True)
'End Sub



Sub LoadListAshkhas(Query As String)	
	Try
	Dim Cu As Cursor = MCode.Result(Query)
	OrginalListAshkhas.Clear
	If Cu.RowCount > 0 Then
		For i = 0 To Cu.RowCount - 1
			Dim ItemAshkhas As AdapterListAshkhas
			Cu.Position=i
			ItemAshkhas.CodeTafzili=Cu.Getstring("fldCodetafzili")
			ItemAshkhas.SharhTafzili=Cu.Getstring("fldSharheTafzili")
				ItemAshkhas.Address=myCode.Is_Null(Cu.Getstring("fldAdress"))
			ItemAshkhas.Tell=Cu.Getstring("fldTell")
				ItemAshkhas.FldMobile=myCode.Is_Null(Cu.GetString("FldMobile"))
			ItemAshkhas.FldVaziat=myCode.Is_Null(Cu.GetString("FldVaziat"))
			ItemAshkhas.FldEtebar=myCode.Is_Null(Cu.GetString("FldEtebar"))
			ItemAshkhas.lastSeen=Cu.GetString("lastSeen")
			ItemAshkhas.lastOrderDate=myCode.Is_Null(Cu.GetString("lastOrderDate"))
			ItemAshkhas.Mande=Cu.Getstring("fldMande")
			ItemAshkhas.FldLastVisit=myCode.Is_Null(Cu.GetString("FldLastVisit"))
			ItemAshkhas.FldLastSefaresh=myCode.Is_Null(Cu.GetString("FldLastSefaresh"))
			ItemAshkhas.FldC_Gorooh=Cu.GetString("fldCodeGroup")
			ItemAshkhas.FldN_Gorooh=Cu.GetString("fldNameGroup")
			ItemAshkhas.FldC_Posti=myCode.Is_Null(Cu.GetString("FldC_Posti"))
			ItemAshkhas.FldC_Meli=myCode.Is_Null(Cu.GetString("FldC_Meli"))
			ItemAshkhas.FldShomarehesab=myCode.Is_Null(Cu.GetString("FldShomarehesab"))
			ItemAshkhas.FldSync=myCode.Is_Null(Cu.GetString("FldSync"))
'			If Position=1 Then
			
				lblTedadKol.Text =  Cu.RowCount
'			Else
'				CuAshkhas.Position=Position-2
'				CuTedad = MCode.Result("Select * From TblAshkhas Where FldC_City = '"& CuAshkhas.GetString("FldC_City") &"' And FldLastVisit = '"& Date &"'")
'				LblTedadVisit.Text =  CuTedad.RowCount
'				CuTedad = MCode.Result("Select * From TblAshkhas Where FldC_City = '"& CuAshkhas.GetString("FldC_City") &"' And FldLastSefaresh = '"& Date &"'")
'				LblTedadSefaresh.Text =  CuTedad.RowCount
'				lblTedadKol.Text =  Cu.RowCount
'			End If
			OrginalListAshkhas.Add(ItemAshkhas)
		Next
	End If
	'ToastMessageShow("تعداد کالای زیر مجموعه " & "  " & Cu.RowCount,True)
	
	ListAshkhas=OrginalListAshkhas
	
'	ToastMessageShow(Cu.RowCount,True)
		HLV.notifyDataSetChanged
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-LoadListAshkhas")
	End Try
End Sub

Sub TxtSearch_TextChanged (Old As String, New As String)
	If TxtSearch.Text.StartsWith(" ") Then
		TxtSearch.Text=TxtSearch.Text.SubString(1)
	End If
	TxtSearch.SelectionStart=TxtSearch.Text.Length
		LoadAshkhas
End Sub

Sub btn_sort_Click
	Try
		Dim Lst As List = Array As String("کد شخص","نام شخص نزولی","نام شخص صعودی")
		Dim res As Int = InputList(Lst,"مرتب سازی براساس:",-1)
		Select Case res
			Case 0
				Str_sort = " Order by fldCodetafzili Asc"
			Case 1
				Str_sort = " Order by fldSharheTafzili"
			Case 2
				Str_sort = " Order by fldSharheTafzili Desc"
		End Select
		Log(Str_sort)
		LoadAshkhas
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-btn_sort_Click")
	End Try
End Sub

Sub SwTour_CheckedChange(Checked As Boolean)
	LoadAshkhas
End Sub

Private Sub SwNew_CheckedChange(Checked As Boolean)
	LoadAshkhas
End Sub

Sub SwBed_CheckedChange(Checked As Boolean)
	If Checked=True Then
		SwBes.Checked=False
	End If
	LoadAshkhas
End Sub

Sub SwBes_CheckedChange(Checked As Boolean)
	If Checked=True Then
		SwBed.Checked=False
	End If
	LoadAshkhas
End Sub


Sub btnUpdate_Click
	tcount=3
	't1.Enabled=True
End Sub

Sub Application_Error (Error As Exception, StackTrace As String) As Boolean
	Log("Error Moshtarian: "&Error)
'	MCode.ScheduleRestartCrashedActivity(DateTime.Now + 300, Activity.Title, Error)
	Return True
End Sub

Private Sub btnNewAshkhas_Click
	MCode.UpdateShakhs=False
	StartActivity(Act_NewAshkhas)
End Sub