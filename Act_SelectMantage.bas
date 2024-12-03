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
	Dim Gps As GPS
	Private t1 As Timer
	'Dim t_gps As Timer
End Sub

Sub Globals
	Private rp As RuntimePermissions
	Dim UtilS As Hitex_Utils
	Dim Key As IME
	Dim ListAshkhas,OrginalListAshkhas As List
	Dim CuAshkhas As Cursor
	Public NiceSpinner As NiceSpinner
	Public NiceSpinner1 As NiceSpinner
	Private B4XComboBox1 As B4XComboBox
	Private B4XComboBox2 As B4XComboBox
	Dim ListGoroohAshkhas1,OriginalListGoroohAshkhas1 As List
	Dim ListGoroohAshkhas2,OriginalListGoroohAshkhas2 As List
	Private pnl_HLV As Panel
	Private HLV As Hitex_LayoutView
	Private ListMantaghe As List
	Private Date As String
	Private TxtSearch As EditText
	Private LblTedadVisit As Label
	Private LblTedadSefaresh As Label
	Private lblTedadKol As Label
	
'	Private gmap As GoogleMap
	'Private MapFragment1 As MapFragment
	Private PnlSpGroup As Panel
	Private btn_sort As Label
	Private Str_sort As String = " Order by fldCodetafzili Asc"
	Private Date As String
	Dim GroupCodeSelect1 As String="0"
	Dim GroupNameSelect1 As String=""
	Dim GroupCodeSelect2 As String="0"
	Dim GroupNameSelect2 As String=""
	Dim countvisit As Int=0
	Dim countsefaresh As Int=0
	Private SwVisit As ACSwitch
	Dim lstSelectedCodeGroupAshkhas As List
	Private PnlBed As Panel
	Private SwBed As ACSwitch
	'Dim t2 As Timer
	Dim tcount As Int
	Private SwBes As ACSwitch
	Private SwNew As ACSwitch
	Dim lstGroup1 As List
	Dim lstGroup2 As List
	
	'Dim Lat As String
	'Dim Lon As String
	Private swSearchByAddress As ACSwitch
	Private btnNewAshkhas As Panel
	Private btnMenuGroup As Button
	Private sidemenu As SlidingMenu
	Dim HLVGoroohAshkhas As Hitex_LayoutView
	Private pnlGroup As Panel
	Private lblBackGroup As Label
	
	Private SwBlackList As ACSwitch
	Private SwTourToday As ACSwitch
	Private btnLocationMoshtarian As Label
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Activity.LoadLayout("L_SelectMantaghe_2")
	Try
	lstSelectedCodeGroupAshkhas.Initialize
	Key.Initialize("Key")
	ListAshkhas.Initialize
	OrginalListAshkhas.Initialize
	OriginalListGoroohAshkhas1.Initialize
	ListGoroohAshkhas1.Initialize
	OriginalListGoroohAshkhas2.Initialize
	ListGoroohAshkhas2.Initialize
	lstGroup1.Initialize
	lstGroup2.Initialize
	sidemenu.Initialize("sidmenu")
	sidemenu.Menu.LoadLayout("groupashkhasmenulyr")
	sidemenu.Mode=sidemenu.LEFT
	sidemenu.BehindOffset=33%x
	HLVGoroohAshkhas.Initializer("HLVGoroohAshkhas").ListView.Build
	pnlGroup.AddView(HLVGoroohAshkhas,1%x,1%y,65%x,87%y)
	't2.Initialize("t2",1000)
	tcount=3
	't2.Enabled=True
		Gps.Initialize("gps")
	t1.Initialize("t1",5000)
	
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
	LoadAcSpGroohAshkas2
	'LoadListGoroohAshkhas
		
	HLVGoroohAshkhas.CardView.BackgroundColor(0x8aacc8)
	HLVGoroohAshkhas.Ripple.Color(0x8aacc8)
	HLVGoroohAshkhas.CardView.CardElevation(0dip).Radius(4dip)
		
		
	HLVGoroohAshkhas.Show
	HLV.Show

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
	'End Select
	'LoadListAshkhas("Select * From TblAshkhas "& Str_sort,0)
		'update_data
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-Activity_Create")
	End Try
End Sub

Sub Activity_KeyPress (KeyCode As Int) As Boolean 'Return True to consume the event

	If KeyCode=KeyCodes.KEYCODE_BACK Then
		If sidemenu.Visible Then
			If MCode.C_LayeAshkhas.Length > 3 Then
				LoadGoroohAshkasBack(MCode.C_LayeAshkhas)
				Return True
			Else
				sidemenu.HideMenus
				Return True
			End If
			
		End If
		btn_Back_Click
		Return True
	End If
	Return True
End Sub

Sub update_data
	Try
		If MCode.IsConnected Then
'	MCode.page="Act_SelectMantage"
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
'			If Gps.GPSEnabled=True Then
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
'				StartActivity(Gps.LocationSettingsIntent)
'			End If
'		End If
'	Catch
'		Log(LastException)
'		myCode.SendError(LastException,Activity.Title&"-MapFragment1_Ready")
'	End Try
'
'End Sub

'Sub t_gps_Tick
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
'End Sub

Sub UpdateVaziatAshkhas
	Try
		Dim str As String =$"SELECT DISTINCT fldCodeTafzili from tblTourVisitor WHERE fldDateVisit = ${MCode.DatePersian} AND fldTimeVisit<>''"$
		
		Dim cu As Cursor=MCode.Result(str)	
		If cu.RowCount>0 Then
			For i=0 To cu.RowCount-1
				cu.Position=i
					
				'visit			
				Dim Count As Int = MCode.SingleResult($"Select Count(fldRadif) from tblTourVisitor where  fldDateVisit='${MCode.DatePersian}' and fldCodeTafzili=${cu.GetString("fldCodeTafzili")} and tblTourVisitor.fldTimeVisit<>''"$)
				Dim MaxRadif As Int
				If Count>0 Then
					MaxRadif= MCode.SingleResult($"Select Max(fldRadif) from tblTourVisitor where  fldDateVisit='${MCode.DatePersian}' and fldCodeTafzili=${cu.GetString("fldCodeTafzili")} and tblTourVisitor.fldTimeVisit<>''"$)				
				
					Dim str2 As String =$"SELECT TblAshkhas.*, tblTourVisitor.fldRadif, tblTourVisitor.fldDateVisit,tblTourVisitor.fldTimeVisit, tblTourVisitor.fldVaziat as fldVaziatTour,tblTourVisitor.fldTimeSefaresh FROM TblAshkhas,tblTourVisitor WHERE TblAshkhas.fldCodetafzili = tblTourVisitor.fldCodeTafzili AND tblTourVisitor.fldDateVisit = ${MCode.DatePersian} AND tblTourVisitor.fldTimeVisit<>'' and tblTourVisitor.fldCodeTafzili=${cu.GetString("fldCodeTafzili")} And fldRadif=${MaxRadif} ORDER BY fldRadif ASC"$
					Dim cu2 As Cursor=MCode.Result(str2)
					cu2.Position=0
				
					If cu2.GetString("fldTimeVisit")<>"" And cu2.GetString("fldTimeVisit")<>Null  Then
						Dim D As String = cu2.GetString("fldDateVisit") & "T" & cu2.GetString("fldTimeVisit")
						Dim DateV As String=cu2.GetString("fldDateVisit")
				
						MCode.SaveUpdate("Update TblAshkhas Set lastSeen = '"& D &"',FldLastVisit='"& DateV &"' Where fldCodetafzili = '"& cu.GetString("fldCodeTafzili") &"'")
					End If
				End If

				
				'sefaresh
				Dim Count As Int = MCode.SingleResult($"Select Count(fldRadif) from tblTourVisitor where  fldDateVisit='${MCode.DatePersian}' and fldCodeTafzili=${cu.GetString("fldCodeTafzili")} and tblTourVisitor.fldTimeSefaresh<>''"$)
				Dim MaxRadif As Int
				If Count>0 Then
					MaxRadif= MCode.SingleResult($"Select Max(fldRadif) from tblTourVisitor where  fldDateVisit='${MCode.DatePersian}' and fldCodeTafzili=${cu.GetString("fldCodeTafzili")} and tblTourVisitor.fldTimeSefaresh<>''"$)				
				
					Dim str2 As String =$"SELECT TblAshkhas.*, tblTourVisitor.fldRadif, tblTourVisitor.fldDateVisit,tblTourVisitor.fldTimeVisit, tblTourVisitor.fldVaziat as fldVaziatTour,tblTourVisitor.fldTimeSefaresh FROM TblAshkhas,tblTourVisitor WHERE TblAshkhas.fldCodetafzili = tblTourVisitor.fldCodeTafzili AND tblTourVisitor.fldDateVisit = ${MCode.DatePersian} AND tblTourVisitor.fldTimeSefaresh<>'' and tblTourVisitor.fldCodeTafzili=${cu.GetString("fldCodeTafzili")} And fldRadif=${MaxRadif} ORDER BY fldRadif ASC"$
					Dim cu2 As Cursor=MCode.Result(str2)
					cu2.Position=0
					If cu2.GetString("fldTimeSefaresh")<>"" And cu2.GetString("fldTimeSefaresh")<>Null  Then
						Dim s As String = cu2.GetString("fldDateVisit") & "T" & cu2.GetString("fldTimeSefaresh")
						Dim DateS As String=cu2.GetString("fldDateVisit")
					
						MCode.SaveUpdate("Update TblAshkhas Set lastOrderDate = '"& s &"' ,FldLastSefaresh='"& DateS &"' Where fldCodetafzili = '"& cu.GetString("fldCodeTafzili") &"'")
					End If
				End If					
				
			Next
		End If
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-UpdateVaziatAshkhas")
	End Try
End Sub

Sub LoadAshkhas
	Try
'		MCode.page ="Act_SelectMantage"
		UpdateVaziatAshkhas
		Sleep(1000)
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
			If SwVisit.Checked=True Then
				countfilter=countfilter+1
		
				str= str & " and FldLastVisit <> 0 "
				filter=True
				If countfilter=1 Then
					str=str.Replace(" and ","")
				End If
			End If
			
			If SwBlackList.Checked=True Then
				countfilter=countfilter+1
		
				str= str & " and fldBlackList = 1 "
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
			
			If SwTourToday.Checked=True Then
				CuTedad = MCode.Result("Select * From TblAshkhas Where FldLastVisit = '"& Date &"'")
				LblTedadVisit.Text =  CuTedad.RowCount
				CuTedad = MCode.Result("Select * From TblAshkhas Where FldLastSefaresh = '"& Date &"'")
		
				str=$"SELECT TblAshkhas.*, tblTourVisitor.fldRadif, tblTourVisitor.fldDateVisit, tblTourVisitor.fldVaziat as fldVaziatTour,tblTourVisitor.fldType FROM TblAshkhas,tblTourVisitor WHERE TblAshkhas.fldCodetafzili = tblTourVisitor.fldCodeTafzili AND tblTourVisitor.fldType='Tour' AND fldDateVisit = ${MCode.DatePersian} ORDER BY fldRadif ASC"$
				
				
			Else
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
			End If

	
		If GroupCodeSelect1<>0 And GroupCodeSelect2=0 Then
			'countfilter=countfilter+1
			If SwVisit.Checked=True Then
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
			If SwTourToday.Checked=True Then
				CuTedad = MCode.Result("Select * From TblAshkhas Where FldLastVisit = '"& Date &"'")
				LblTedadVisit.Text =  CuTedad.RowCount
				CuTedad = MCode.Result("Select * From TblAshkhas Where FldLastSefaresh = '"& Date &"'")
		
				str=$"SELECT TblAshkhas.*, tblTourVisitor.fldRadif, tblTourVisitor.fldDateVisit, tblTourVisitor.fldVaziat as fldVaziatTour,tblTourVisitor.fldType FROM TblAshkhas,tblTourVisitor WHERE TblAshkhas.fldCodetafzili = tblTourVisitor.fldCodeTafzili AND tblTourVisitor.fldType='Tour' AND fldDateVisit = ${MCode.DatePersian} ORDER BY fldRadif ASC"$
				
				
			Else
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
					Log(str)
				End If
			End If
	
	
		End If
	
		If GroupCodeSelect1<>0 And GroupCodeSelect2<>0 Then
			If SwVisit.Checked=True Then
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
			If SwTourToday.Checked=True Then
				CuTedad = MCode.Result("Select * From TblAshkhas Where FldLastVisit = '"& Date &"'")
				LblTedadVisit.Text =  CuTedad.RowCount
				CuTedad = MCode.Result("Select * From TblAshkhas Where FldLastSefaresh = '"& Date &"'")
		
				str=$"SELECT TblAshkhas.*, tblTourVisitor.fldRadif, tblTourVisitor.fldDateVisit, tblTourVisitor.fldVaziat as fldVaziatTour,tblTourVisitor.fldType FROM TblAshkhas,tblTourVisitor WHERE TblAshkhas.fldCodetafzili = tblTourVisitor.fldCodeTafzili AND tblTourVisitor.fldType='Tour' AND fldDateVisit = ${MCode.DatePersian} ORDER BY fldRadif ASC"$
				
				
			Else
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

Sub LoadListGoroohAshkhas
	'LSVGoroohKala.Clear
	Dim Item1 As AdapterGoroohAshkhas
	Item1.FldC_Gorooh= 0
	Item1.FldN_Gorooh= "همه گروه ها"
	OriginalListGoroohAshkhas2.Add(Item1)
	Dim Dt As Cursor = MCode.Result("Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas where Length(FldC_Gorooh) = 3 ORDER BY FldC_Gorooh")
	For i=0 To Dt.RowCount-1
		Dt.Position=i
		Dim Item As AdapterGoroohAshkhas
		Item.FldC_Gorooh= Dt.GetString("FldC_Gorooh")
		Item.FldN_Gorooh= Dt.GetString("FldN_Gorooh")
		OriginalListGoroohAshkhas2.Add(Item)
'		LSVGoroohKala.AddSingleLine2(Item.FldN_Gorooh,i)
	Next
	
	ListGoroohAshkhas2 = OriginalListGoroohAshkhas2

End Sub

Sub LoadAcSpGroohAshkas2
	Try
		Dim lstTemp As List
		lstTemp.Initialize
		
		Dim Item1 As AdapterGoroohAshkhas
		Item1.FldC_Gorooh= 0
		Item1.FldN_Gorooh= "همه گروه ها"
		OriginalListGoroohAshkhas2.Add(Item1)
		Dim Dt1 As Cursor = MCode.Result("Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas")
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
							OriginalListGoroohAshkhas2.Add(Item)
							
						Else
				
							If MinCode.Length=sizeCode Then
								For Each a As AdapterGoroohAshkhas In OriginalListGoroohAshkhas2
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
									OriginalListGoroohAshkhas2.Add(Item)
									
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
		
		
		
'		Dim lstTemp As List
'		lstTemp.Initialize
'		
'		Dim Item1 As AdapterGoroohAshkhas
'		Item1.FldC_Gorooh= 0
'		Item1.FldN_Gorooh= "همه گروه ها"
'		OriginalListGoroohAshkhas2.Add(Item1)
'		Dim Dt1 As Cursor = MCode.Result("Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas")
'		For i=0 To Dt1.RowCount-1
'			Dt1.Position=i
'			Dim SizeCode As String=Dt1.GetString("FldC_Gorooh").Length			
'			If SizeCode=3 Then
'				Dim code As String=Dt1.GetString("FldC_Gorooh").SubString2(0,3)
'				Dim indexTemp As String=lstTemp.IndexOf(code)
'				If indexTemp=-1 Then
'					Dim MinCode As String =MCode.SingleResult("Select min(FldC_Gorooh) From TblGoroohAshkhas where FldC_Gorooh Like '"& code &"%'")
'					Dim dt2 As Cursor =MCode.Result("Select * From TblGoroohAshkhas where FldC_Gorooh = '"& code &"'")
'					If dt2.RowCount>0 Then
'						For j=0 To dt2.RowCount-1
'							dt2.Position=j
'							Dim Item As AdapterGoroohAshkhas
'							Item.FldC_Gorooh= dt2.GetString("FldC_Gorooh")
'							Item.FldN_Gorooh= dt2.GetString("FldN_Gorooh")
'							OriginalListGoroohAshkhas2.Add(Item)
'						Next
'					End If
'					lstTemp.Add(code)
'				End If
'			Else
'				If SizeCode>6 Then
'					Dim code As String=Dt1.GetString("FldC_Gorooh").SubString2(0,SizeCode-3)
'					Else
'					Dim code As String=Dt1.GetString("FldC_Gorooh")
'				End If		
'				Dim indexTemp As String=lstTemp.IndexOf(code)
'				If indexTemp=-1 Then
'					Dim MinCode As String =MCode.SingleResult("Select min(FldC_Gorooh) From TblGoroohAshkhas where FldC_Gorooh Like '"& code &"%'")
'					Dim dt2 As Cursor =MCode.Result("Select * From TblGoroohAshkhas where FldC_Gorooh Like '"& MinCode &"%' And Length(FldC_Gorooh) = "& SizeCode)
'					If dt2.RowCount>0 Then
'						For j=0 To dt2.RowCount-1
'							dt2.Position=j
'							Dim Item As AdapterGoroohAshkhas
'							Item.FldC_Gorooh= dt2.GetString("FldC_Gorooh")
'							Item.FldN_Gorooh= dt2.GetString("FldN_Gorooh")
'							OriginalListGoroohAshkhas2.Add(Item)
'						Next
'					End If
'					lstTemp.Add(code)
'				End If
'			End If
'			
'		Next
		
		
'		Dim lstTemp As List
'		lstTemp.Initialize
'		
'		Dim Item1 As AdapterGoroohAshkhas
'		Item1.FldC_Gorooh= 0
'		Item1.FldN_Gorooh= "همه گروه ها"
'		OriginalListGoroohAshkhas2.Add(Item1)
'		Dim Dt1 As Cursor = MCode.Result("Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas")
'		For i=0 To Dt1.RowCount-1
'			Dt1.Position=i
'			Dim code As String=Dt1.GetString("FldC_Gorooh").SubString2(0,3)
'			Dim indexTemp As String=lstTemp.IndexOf(code)
'			If indexTemp=-1 Then
'				Dim MinCode As String =MCode.SingleResult("Select min(FldC_Gorooh) From TblGoroohAshkhas where FldC_Gorooh Like '"& code &"%'")
'				Dim dt2 As Cursor =MCode.Result("Select * From TblGoroohAshkhas where FldC_Gorooh = '"& MinCode &"'")
'				If dt2.RowCount>0 Then
'					For j=0 To dt2.RowCount-1
'						dt2.Position=j							
'							Dim Item As AdapterGoroohAshkhas
'							Item.FldC_Gorooh= dt2.GetString("FldC_Gorooh")
'							Item.FldN_Gorooh= dt2.GetString("FldN_Gorooh")
'							OriginalListGoroohAshkhas2.Add(Item)						
'					Next
'				End If
'				lstTemp.Add(code)
'			End If	
'		Next
		
		ListGoroohAshkhas2 = OriginalListGoroohAshkhas2
'		HLVGoroohAshkhas.notifyDataSetChanged
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-LoadAcSpGroohAshkas")
	End Try
End Sub

Sub LoadAcSpGroohAshkas
	Try
		Dim lstTemp As List
		lstTemp.Initialize
		
		lstGroup1.Add("همه گروه ها")
		Dim Dt1 As Cursor = MCode.Result("Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas")
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

'Sub LoadAcSpGroohAshkas
'	Try
'		lstGroup1.Add("همه گروه ها")
'		Dim Dt1 As Cursor = MCode.Result("Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas")
'		For i=0 To Dt1.RowCount-1
'			Dt1.Position=i
'			
'			Dim sizeCode As Long=Dt1.GetString("FldC_Gorooh").Length
'			If sizeCode=3 Then
'				Dim Item As AdapterGoroohAshkhas
'				Item.FldC_Gorooh= Dt1.GetString("FldC_Gorooh")
'				Item.FldN_Gorooh= Dt1.GetString("FldN_Gorooh")
'				OriginalListGoroohAshkhas1.Add(Item)
'				lstGroup1.Add(Item.FldN_Gorooh)
'			Else
'				Dim code As String=Dt1.GetString("FldC_Gorooh").SubString2(0,3)
'				Dim count As Long
'				Dim MinCode As String =MCode.SingleResult("Select min(FldC_Gorooh) From TblGoroohAshkhas where FldC_Gorooh Like '"& code &"%'")
'				For Each a As AdapterGoroohAshkhas In OriginalListGoroohAshkhas1
'					If a.FldC_Gorooh.SubString2(0,3)=code Then
'						count=1
'						Exit
'					End If
'				Next
'				If count =0 Then
'					Dim NameGroup,CodeGroup As String
'					CodeGroup=MinCode
'					NameGroup=MCode.SingleResult("Select FldN_Gorooh From TblGoroohAshkhas where FldC_Gorooh='"& MinCode &"'")
'					Dim Item As AdapterGoroohAshkhas
'					Item.FldC_Gorooh= CodeGroup
'					Item.FldN_Gorooh= NameGroup
'					OriginalListGoroohAshkhas1.Add(Item)
'					lstGroup1.Add(Item.FldN_Gorooh)
'				End If
'			End If
'		Next
'		
''	Dim Dt As Cursor = MCode.Result("Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas where Length(FldC_Gorooh) = 3")
''		lstGroup1.Add("همه گروه ها")
'''	NiceSpinner.Add("همه گروه ها")
''	For i=0 To Dt.RowCount-1
''		Dt.Position=i
''		Dim Item As AdapterGoroohAshkhas
''		'Dim cu As Cursor
''		
''		'cu= MCode.Result("Select * From TblGoroohAshkhas where fldCodeGroup like '"& Dt.GetString("FldC_Gorooh") &"%'")
''		'If cu.RowCount>0 Then
''		Item.FldC_Gorooh= Dt.GetString("FldC_Gorooh")
''		Item.FldN_Gorooh= Dt.GetString("FldN_Gorooh")
''		OriginalListGoroohAshkhas.Add(Item)
'''		NiceSpinner.Add(Item.FldN_Gorooh)
''			lstGroup1.Add(Item.FldN_Gorooh)
''		'End If
''
''	Next
'''		NiceSpinner.Show(Colors.blue, 14)
'		
'	NiceSpinner.attachDataSource(lstGroup1)
'		NiceSpinner.SelectedTextColor = Colors.blue
'		'HLVGoroohAshkhas.notifyDataSetChanged
'	Catch
'		Log(LastException)
'		myCode.SendError(LastException,Activity.Title&"-LoadAcSpGroohAshkas")
'	End Try
'End Sub

Sub LoadGoroohAshkasBack1(Code As String)
	Dim C_Gorooh As String = MCode.Sf.Left(Code,Code.Length-6)
	Dim Count As Int = C_Gorooh.Length + 3
	Dim Dt As Cursor=MCode.Result("Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas where FldC_Gorooh Like '"& C_Gorooh &"%' And Length(FldC_Gorooh) = "& Count &" ORDER BY FldC_Gorooh")
	If Dt.RowCount>0 Then
		OriginalListGoroohAshkhas2.Clear
		Dim Item1 As AdapterGoroohAshkhas
		Item1.FldC_Gorooh= 0
		Item1.FldN_Gorooh= "همه گروه ها"
		OriginalListGoroohAshkhas2.Add(Item1)
		For i=0 To Dt.RowCount-1
			Dt.Position=i
			Dim Item As AdapterGoroohAshkhas
			Item.FldC_Gorooh= Dt.GetString("FldC_Gorooh")
			Item.FldN_Gorooh= Dt.GetString("FldN_Gorooh")
			OriginalListGoroohAshkhas2.Add(Item)
			MCode.C_LayeAshkhas=Item.FldC_Gorooh
		Next
		ListGoroohAshkhas2 = OriginalListGoroohAshkhas2
		HLVGoroohAshkhas.notifyDataSetChanged
	End If
	LoadAshkhas
End Sub

Sub LoadGoroohAshkasBack(Code As String)
	Try
		Dim C_Gorooh As String = MCode.Sf.Left(Code,Code.Length-6)
		If C_Gorooh.Length=0 Then
			OriginalListGoroohAshkhas2.Clear
			LoadAcSpGroohAshkas2
			HLVGoroohAshkhas.notifyDataSetChanged
			LoadAshkhas			
			Return
		End If
		Dim Count As Int = C_Gorooh.Length + 3
		Dim Dt As Cursor=MCode.Result("Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas where FldC_Gorooh Like '"& C_Gorooh &"%' And Length(FldC_Gorooh) = "& Count &" ORDER BY FldC_Gorooh")	
		If Dt.RowCount>0 Then
			OriginalListGoroohAshkhas2.Clear
			Dim Item1 As AdapterGoroohAshkhas
			Item1.FldC_Gorooh= 0
			Item1.FldN_Gorooh= "همه گروه ها"
			OriginalListGoroohAshkhas2.Add(Item1)
			For i=0 To Dt.RowCount-1
				Dt.Position=i
				Dim Item As AdapterGoroohAshkhas
				Item.FldC_Gorooh= Dt.GetString("FldC_Gorooh")
				Item.FldN_Gorooh= Dt.GetString("FldN_Gorooh")
				OriginalListGoroohAshkhas2.Add(Item)
				MCode.C_LayeAshkhas=Item.FldC_Gorooh
			Next
			ListGoroohAshkhas2 = OriginalListGoroohAshkhas2
			HLVGoroohAshkhas.notifyDataSetChanged
		End If
		LoadAshkhas
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-LoadGoroohAshkasBack")
	End Try
End Sub

Sub HLVGoroohAshkhas_onCreateViewHolder (Parent As Panel, ViewType As Int)
	Dim LblSharh As Label
	Dim bmp1 As BitmapDrawable
	LblSharh.Initialize("LblSharh")
	LblSharh.TextColor=Colors.black
	LblSharh.TextSize=20
	LblSharh.Gravity=Gravity.CENTER
	LblSharh.SingleLine=False
	bmp1.Initialize(LoadBitmap(File.DirAssets,"button5.png"))
	LblSharh.Background=bmp1
	LblSharh.Typeface= MCode.Font2
	Parent.AddView(LblSharh,2%x,1%y,61%x,7%y)
End Sub

Sub HLVGoroohAshkhas_ItemClick (ClickedItem As Panel, Position As Int)
	LoadGoroohAshkhasGo(Position)
	sidemenu.HideMenus
End Sub

Sub HLVGoroohAshkhas_GetItemCount As Int
	Return ListGoroohAshkhas2.Size
End Sub



Sub HLVGoroohAshkhas_onBindViewHolder (Parent As Panel, Position As Int)
	Dim Item = ListGoroohAshkhas2.Get(Position) As AdapterGoroohAshkhas
	Dim LblSharh As Label  = Parent.getview(0)
	LblSharh.Text = Item.FldN_Gorooh
	Parent.Elevation=1dip
	Parent.Height = 9%y
End Sub
'
Sub LoadGoroohAshkhasGo(Position As Int)
	Sleep(100)
	Dim Item = ListGoroohAshkhas2.Get(Position) As AdapterGoroohAshkhas
	GroupCodeSelect1=Item.FldC_Gorooh

	Dim Count As Int = Item.FldC_Gorooh.Length + 3
	Dim Dt As Cursor=MCode.Result("Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas where FldC_Gorooh Like '"& Item.FldC_Gorooh &"%' And Length(FldC_Gorooh) = "& Count &" ORDER BY FldC_Gorooh")
	If Dt.RowCount>0 Then
		lblBackGroup.Visible=True
		ListGoroohAshkhas2.Clear
		OriginalListGoroohAshkhas2.Clear

		For i=0 To Dt.RowCount-1
			Dt.Position=i
			Dim Item As AdapterGoroohAshkhas
			Item.FldC_Gorooh= Dt.GetString("FldC_Gorooh")
			Item.FldN_Gorooh= Dt.GetString("FldN_Gorooh")
			OriginalListGoroohAshkhas2.Add(Item)
			MCode.C_LayeAshkhas=Item.FldC_Gorooh
		Next
		ListGoroohAshkhas2 = OriginalListGoroohAshkhas2
		HLVGoroohAshkhas.notifyDataSetChanged
	End If
	LoadAshkhas
End Sub

Sub Activity_Resume
	Try
		'	StartService(Service_Gps)
		
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
		StartService(FusedLocationService)
'		StartService(Service_Gps)
	Log("Gps Start")
	LoadAshkhas
'		update_data
	'Date = MCode.ConvertNumbersPersian2English(MCode.DatePersian)
	'CMBselectMantage_SelectedIndexChanged(CMBselectMantage.SelectedIndex)
		'HLV.notifyDataSetChanged
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
		ListGoroohAshkhas1.Clear
		lstSelectedCodeGroupAshkhas.Clear
'		NiceSpinner1.Clear
		lstGroup2.Clear
		lstGroup2.Add("همه گروه ها")
		'LoadListKala("Select * From TblKala " & Str_sort)
		GroupCodeSelect1="0"
		GroupNameSelect1=""
		GroupCodeSelect2="0"
		GroupNameSelect2=""
		NiceSpinner1.SelectedIndex=0
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
			NiceSpinner1.SelectedIndex = 0
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
			ItemAshkhas.Address=Cu.Getstring("fldAdress")
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
			ItemAshkhas.fldBlackList=myCode.Is_Null_adad(Cu.GetString("fldBlackList"))
			ItemAshkhas.fldSaghfeEtebar=myCode.Is_Null_adad(Cu.GetString("fldSaghfeEtebar"))
			ItemAshkhas.Lat=myCode.Is_Null_adad(Cu.GetString("FldLat"))
			ItemAshkhas.Lon=myCode.Is_Null_adad(Cu.GetString("FldLon"))
			ItemAshkhas.FldSync=myCode.Is_Null(Cu.GetString("FldSync"))
			If SwTourToday.Checked Then
				ItemAshkhas.fldRadif=myCode.Is_Null(Cu.GetString("fldRadif"))
				ItemAshkhas.fldDateVisit=myCode.Is_Null(Cu.GetString("fldDateVisit"))
				ItemAshkhas.fldVaziatTour=myCode.Is_Null(Cu.GetString("fldVaziatTour"))
			End If
				
		
		
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

Sub SwVisit_CheckedChange(Checked As Boolean)
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
Private Sub swSearchByAddress_CheckedChange(Checked As Boolean)
	LoadAshkhas
End Sub
Sub SaveGps
	'Gps.Initialize("Gps")
	If Gps.GPSEnabled=False Then
		ToastMessageShow("موقعیت مکانی خود را روشن کنید", True)
		t1.Enabled=False
		'StartActivity(Gps.LocationSettingsIntent)
	Else
		ProgressDialogShow2("لطفا تا دریافت موقعیت مکانی صبر کنید",False)
		t1.Enabled=True
	End If
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
'	End Try
'
'End Sub

Sub t1_tick
'	t1.Enabled=False
'	If gmap.IsInitialized Then
'		Try
'			Dim cl As CameraPosition
'			cl.Initialize(gmap.MyLocation.Latitude,gmap.MyLocation.Longitude,15)
'			gmap.AnimateCamera(cl)
'			Dim Lat As String = gmap.MyLocation.Latitude
'			Dim Lon As String = gmap.MyLocation.Longitude
'			Gps.Stop
'			
'			Dim Time As String = MCode.ConvertNumbersPersian2English(DateTime.Time(DateTime.Now))
'			Dim Date As String = MCode.ConvertNumbersPersian2English(DateTime.Date(DateTime.Now))
'			Date=Date.Replace("/","-") & " " & Time & ".000"
'			LogColor(Date,Colors.Magenta)
'			MCode.SaveUpdate("Insert Into TblGpsVisitor (FldVisitor,FldTarikh,FldTime,FldLat,FldLon) Values ('"& MCode.C_Visitor &"','"& Date &"','"& Time &"','"& Lat &"','"& Lon &"')")
''			MCode.SaveUpdate("Insert Into TblGps (FldC_Visitor,FldLat,FldLon,FldDate,FldTime,FldC_Customer,FldVaziat) Values ('"& MCode.C_Visitor &"','"& _
''	 			Lat &"','"& Lon &"','"& Date &"','"& Time &"','"& MCode.CodeMoshtari &"','False')")
'			LogColor("Save Locate: " & Lat & "--" & Lon,Colors.Blue)
'			ProgressDialogHide
'			StartActivity(Act_KalaDefault)
'		Catch
'			Log(LastException)
'		End Try
'	Else
'		ProgressDialogHide
'		StartActivity(Act_KalaDefault)
'	End If
End Sub

Sub btnUpdate_Click
	'tcount=3
	't2.Enabled=True
End Sub

Sub Gps_LocationChanged (Location1 As Location)

End Sub

Sub Application_Error (Error As Exception, StackTrace As String) As Boolean
'	MCode.ScheduleRestartCrashedActivity(DateTime.Now + 300, Activity.Title, Error)
	Return True
End Sub



Private Sub btnNewAshkhas_Click
	MCode.UpdateShakhs=False
	StartActivity(Act_NewAshkhas)
	
End Sub

Private Sub btnMenuGroup_Click
	sidemenu.ShowMenu
End Sub

Private Sub lblBackGroup_Click
	If MCode.C_LayeAshkhas.Length > 3 Then
		
		If MCode.C_LayeAshkhas.Length=6 Then
			lblBackGroup.Visible=False
		End If
		LoadGoroohAshkasBack(MCode.C_LayeAshkhas)
	Else
		lblBackGroup.Visible=False
	End If
End Sub

Private Sub SwBlackList_CheckedChange(Checked As Boolean)
	LoadAshkhas
End Sub

Private Sub SwTourToday_CheckedChange(Checked As Boolean)
	MCode.TourVisitSW=Checked
	LoadAshkhas
End Sub

Private Sub btnLocationMoshtarian_Click
	StartActivity(Act_LocationMoshtarian)
	Act_LocationMoshtarian.LstLocation=ListAshkhas
	
'	CallSubDelayed2(Act_LocationMoshtarian,"LoadData",ListAshkhas)
End Sub
Public Sub GetListTours
	CallSubDelayed2(Act_LocationMoshtarian,"LoadData",ListAshkhas)
End Sub