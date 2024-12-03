B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=7.3
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: True
#End Region
#Extends: android.support.v7.app.AppCompatActivity
Sub Process_Globals
	Dim GPS1 As GPS
End Sub

Sub Globals
	Dim HLVAshkhas As Hitex_LayoutView
	Dim HLVGroohAshkhas As Hitex_LayoutView
	Dim Utils As Hitex_Utils
	Dim Anim As Animation
	Dim jobInternet As HttpJob
	Dim Key As IME
	Dim Pic = LoadBitmap(File.DirAssets,"man-icon.png") As Bitmap
	Dim ListAshkhas,OriginalListAshkhas As List
	Dim ListGoroohAshkhas,OriginalListGoroohAshkhas As List

	Private AcTxtSearch As ACEditText
	Private LblBackSearch As Label
	Private LblTitle As Label
	Private LblNameMoshtari As Label
	Private LblMandeHesab As Label
	Private LblTell As Label
	Private lblAddress As Label
	Private PnlJoziat As Panel
	Private PnlTop As Panel
	Dim C_Tafzili As String
	Dim bmp1 As BitmapDrawable
	Dim noeLoadListAshakhas As String
	Dim CodeGroupAshkhas As Long
	Private LblCodeMoshtari As Label
	Dim mFragment As MapFragment
	Dim gmap As GoogleMap
	Private pnlMap As Panel
	Dim nameMoshtari As String=""
	Dim Lat,Lon As Double
	Dim t1 As Timer
	Dim tcount As Int
	Private btnUpdate As Button
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Activity.LoadLayout("L_Main_Ashkhas")
	jobInternet.Initialize("jobInternet",Me)
	HLVGroohAshkhas.Initializer("HLVGroohAshkhas").ListView.Build
	HLVAshkhas.Initializer("HLVAshkhas").ListView.Build
	GPS1.Initialize("GPS1")
	Key.Initialize("Key")
	Activity.AddView(HLVGroohAshkhas,60%x,10%y,40%x,90%y)
	Activity.AddView(HLVAshkhas,0,10%y,60%x,90%y)
	

	
	HLVGroohAshkhas.CardView.BackgroundColor(Colors.Transparent)
	HLVGroohAshkhas.Ripple.Color(0xFF909090)
	HLVGroohAshkhas.CardView.CardElevation(4dip).Radius(5dip)
	HLVAshkhas.CardView.BackgroundColor(Colors.Transparent)
	HLVAshkhas.Ripple.Color(0xFF909090)
	HLVAshkhas.CardView.CardElevation(4dip).Radius(2dip)
	t1.Initialize("t1",1000)
	tcount=3
	t1.Enabled=True

End Sub
Sub LoadData
	update_data
	ListAshkhas.Initialize
	ListGoroohAshkhas.Initialize
	OriginalListGoroohAshkhas.Initialize
	ListAshkhas.Initialize
	OriginalListAshkhas.Initialize
	LoadListGoroohAshkhas
	HLVGroohAshkhas.Show

	HLVAshkhas.Show
	MCode.IconView.SearchView.Create(Colors.black,5,Colors.Gray)
	PnlTop.AddView(MCode.IconView.SearchView.View,90%x,2%y,8%x,8%x)
	MCode.IconView.OnClickListener(MCode.IconView.SearchView.View,"Search_Click")
	LoadListAshkhasForSearch
	LoadMap
End Sub
Sub update_data
	StartService(FirebaseMessaging)
	FirebaseMessaging.mode="GetGoroohAshkhas"
End Sub
Sub t1_Tick
	If tcount > 0 Then
		tcount=tcount-1
		LoadData
	Else
		t1.Enabled=False
	End If
	
End Sub
Sub LoadMap
	Wait For MFragment_Ready
	gmap = mFragment.GetMap
	gmap.MyLocationEnabled = True
	gmap.Clear()
End Sub
Sub LoadListGoroohAshkhas
	Dim Dt As Cursor = MCode.Result("Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas where Length(FldC_Gorooh) = 3")' and FldC_Gorooh in (SELECT FldCodeGroup From TblAshkhas GROUP BY FldCodeGroup) ORDER BY FldC_Gorooh")
	For i=0 To Dt.RowCount-1
		Dt.Position=i
		Dim Item As AdapterGoroohAshkhas
		Dim Cu As Cursor
		Cu= MCode.Result("Select fldCodetafzili From TblAshkhas where fldCodeGroup like '"& Dt.GetString("FldC_Gorooh") &"%'")
		If Cu.RowCount>0 Then
			Item.FldC_Gorooh= Dt.GetString("FldC_Gorooh")
			Item.FldN_Gorooh= Dt.GetString("FldN_Gorooh")
			OriginalListGoroohAshkhas.Add(Item)
		End If
	Next
	ListGoroohAshkhas = OriginalListGoroohAshkhas
End Sub

Sub HLVGroohAshkhas_GetItemCount As Int
	Return ListGoroohAshkhas.Size
End Sub

Sub HLVGroohAshkhas_onCreateViewHolder (Parent As Panel, ViewType As Int)
	Dim LblSharh As Label
	LblSharh.Initialize("LblSharh")
	LblSharh.TextColor=Colors.black
	LblSharh.TextSize=14
	LblSharh.Gravity=Gravity.CENTER
	LblSharh.SingleLine=False
	bmp1.Initialize(LoadBitmap(File.DirAssets,"button4.png"))
	LblSharh.Background=bmp1
	LblSharh.Typeface=MCode.Font
	Parent.AddView(LblSharh,1%x,1%y,35%x,8%y)
	
	
End Sub

Sub HLVGroohAshkhas_onBindViewHolder (Parent As Panel, Position As Int)
	Dim Item = ListGoroohAshkhas.Get(Position) As AdapterGoroohAshkhas
	Dim LblSharh As Label  = Parent.getview(0)
	LblSharh.Text = Item.FldN_Gorooh
	bmp1.Initialize(LoadBitmap(File.DirAssets,"button4.png"))

	Parent.Height = 10%y

End Sub

Sub HLVGroohAshkhas_ItemClick (ClickedItem As Panel, Position As Int)
	LoadGoroohAshkhasGo(Position)
	'Dim Item = ListGoroohAshkhas.Get(Position) As AdapterGoroohAshkhas
	
End Sub

Sub LoadGoroohAshkhasGo(Position As Int)
	Dim Item = ListGoroohAshkhas.Get(Position) As AdapterGoroohAshkhas
	noeLoadListAshakhas="LoadListAshkhas"
	LoadListAshkhas(Item.FldC_Gorooh)
	CodeGroupAshkhas=Item.FldC_Gorooh
	Log(CodeGroupAshkhas)
	Dim Count As Int = Item.FldC_Gorooh.Length + 3
	Dim Dt As Cursor=MCode.Result("Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas where FldC_Gorooh Like '"& Item.FldC_Gorooh &"%' And Length(FldC_Gorooh) = "& Count &" ")'and FldC_Gorooh in (SELECT FldCodeGroup From TblAshkhas GROUP BY FldCodeGroup) ORDER BY FldC_Gorooh")
	If Dt.RowCount>0 Then
		OriginalListGoroohAshkhas.Clear
		For i=0 To Dt.RowCount-1
			Dt.Position=i
			Dim Item As AdapterGoroohAshkhas
			Dim Cu As Cursor
			Cu= MCode.Result("Select fldCodetafzili From TblAshkhas where fldCodeGroup like '"& Dt.GetString("FldC_Gorooh") &"%'")
			If Cu.RowCount>0 Then
				Item.FldC_Gorooh= Dt.GetString("FldC_Gorooh")
				Item.FldN_Gorooh= Dt.GetString("FldN_Gorooh")
				OriginalListGoroohAshkhas.Add(Item)
				MCode.C_LayeAshkhas=Item.FldC_Gorooh
			End If
		
		Next
		ListGoroohAshkhas = OriginalListGoroohAshkhas
		HLVGroohAshkhas.notifyDataSetChanged
	End If
End Sub

Sub LoadListAshkhas(C_Gorooh As String)
	If noeLoadListAshakhas <> "Search" Then
		Dim Dt As Cursor = MCode.Result("Select * From TblAshkhas Where fldCodeGroup like '"& C_Gorooh &"%' order by FldCodeGroup")
	Else
		Dim Dt As Cursor = MCode.Result("Select * From TblAshkhas order by fldCodeGroup")
	
	End If
	OriginalListAshkhas.Clear
	If Dt.RowCount > 0 Then
		For i = 0 To Dt.RowCount - 1
			Dim Item As AdapterListAshkhas
			Dt.Position=i
			
			Item.CodeTafzili=Dt.Getstring("fldCodetafzili")
			Item.SharhTafzili=Dt.Getstring("fldSharheTafzili")
			Item.Mande=Dt.Getstring("fldMande")
			Item.Tell=Dt.Getstring("fldTell")
			Item.Address=Dt.Getstring("fldAdress")
			OriginalListAshkhas.Add(Item)
		
		Next
	End If
	If noeLoadListAshakhas<>"Search" Then
		'ToastMessageShow("تعداد اشخاص زیر مجموعه " & "  " & Dt.RowCount,False)
	End If
	ListAshkhas= OriginalListAshkhas
	HLVAshkhas.notifyDataSetChanged
End Sub

Sub LoadGoroohAshkhasBack(Code As String)
	Dim C_Gorooh As String = MCode.Sf.Left(Code,Code.Length-6)
	Dim Count As Int = C_Gorooh.Length + 3
	Dim Dt As Cursor=MCode.Result("Select FldC_Gorooh,FldN_Gorooh From TblGoroohAshkhas where FldC_Gorooh Like '"& C_Gorooh &"%' And Length(FldC_Gorooh) = "& Count &"")' and FldC_Gorooh in (SELECT FldCodeGroup From TblAshkhas GROUP BY FldCodeGroup) ORDER BY FldC_Gorooh")
	If Dt.RowCount>0 Then
		OriginalListGoroohAshkhas.Clear
		For i=0 To Dt.RowCount-1
			Dt.Position=i
			Dim Item As AdapterGoroohAshkhas
			Dim Cu As Cursor
			Cu= MCode.Result("Select fldCodetafzili From TblAshkhas where FldCodeGroup like '"& Dt.GetString("FldC_Gorooh") &"%'")
			If Cu.RowCount>0 Then
				Item.FldC_Gorooh= Dt.GetString("FldC_Gorooh")
				Item.FldN_Gorooh= Dt.GetString("FldN_Gorooh")
				OriginalListGoroohAshkhas.Add(Item)
				MCode.C_LayeAshkhas=Item.FldC_Gorooh
			End If
		Next
		ListGoroohAshkhas = OriginalListGoroohAshkhas
		HLVGroohAshkhas.notifyDataSetChanged
	End If
	
	ListAshkhas.Clear
	HLVAshkhas.notifyDataSetChanged
If C_Gorooh.Length=0 Then
		LoadListAshkhasForSearch
End If
End Sub

Sub HLVAshkhas_GetItemCount As Int
	Return ListAshkhas.Size
End Sub

Sub HLVAshkhas_onCreateViewHolder (Parent As Panel, ViewType As Int)
	Dim ImageRow As ImageView
	ImageRow.Initialize("ImageRow")
	ImageRow.Gravity=Gravity.FILL
	ImageRow.Bitmap=Pic
	Parent.AddView(ImageRow,23%x,1%y,15%x,7%y)

	Dim LblSharh As Label
	LblSharh.Initialize("LblSharh")
	LblSharh.TextColor=Colors.RGB(11,32,14)
	LblSharh.TextSize=17
	LblSharh.Gravity=Gravity.CENTER
	LblSharh.SingleLine=False
	LblSharh.Typeface=MCode.Font
	Parent.AddView(LblSharh,3%x,7%y,53%x,6%y)
	
	Dim ImgDivider As ImageView
	ImgDivider.Initialize("ImgDivider")
	ImgDivider.Gravity=Gravity.FILL
	ImgDivider.Bitmap=MCode.Divider
	Parent.AddView(ImgDivider,3%x,13%y,53%x,1dip)
	
	Dim LblMablaghFi As Label
	LblMablaghFi.Initialize("LblMablaghFi")
	LblMablaghFi.TextColor=Colors.RGB(236,47,65)
	LblMablaghFi.TextSize=17
	LblMablaghFi.Gravity=Gravity.CENTER
	LblMablaghFi.Typeface=MCode.Font
	Parent.AddView(LblMablaghFi,3%x,13%y+1dip,53%x,6%y)

End Sub

Sub HLVAshkhas_onBindViewHolder (Parent As Panel, Position As Int)
	Dim Item = ListAshkhas.Get(Position) As AdapterListAshkhas
	Parent.Tag=Item.CodeTafzili
	Dim imageRow  As ImageView = Parent.GetView(0)
	Dim LblSharh As Label  = Parent.getview(1)
	LblSharh.Text = Item.SharhTafzili
	Dim ImgDivider  As ImageView = Parent.GetView(2)
	Dim LblMablaghFi As Label = Parent.GetView(3)
	LblMablaghFi.Text = "مانده حساب :  " & NumberFormat(Item.Mande,0,3) & "  " & MCode.VahedPool
	Parent.Height = 20%y
End Sub

Sub HLVAshkhas_ItemClick (ClickedItem As Panel, Position As Int)
	Dim Item = ListAshkhas.Get(Position) As AdapterListAshkhas
	btnUpdate.Visible=False
	tcount=3
	t1.Enabled=True
	Dim Result As String
	Dim List As List
	Dim Cu As Cursor
	List.Initialize
	If MCode.BackPage = "Act_Sabad" Then
		'CallSubDelayed3(Act_Sabad,"LoadShakhsVaziatPardakht",Item.CodeTafzili,Item.SharhTafzili)
		Activity.Finish
		
	Else If MCode.BackPage = "Act_FaktorTasfieNashode" Then
		CallSubDelayed3(Act_FaktorTasfieNashode,"LoadShakhs",Item.CodeTafzili,Item.SharhTafzili)
		Activity.Finish
		
	Else
		List.AddAll(Array As String("ثبت موقعیت","نمایش موقعیت","صورت حساب","جزئیات"))
		Result=InputList(List,"انتخاب کنید",-1)
		Select Case Result
			Case 0
				If GPS1.GPSEnabled = False Then
					StartActivity(GPS1.LocationSettingsIntent)
				Else
					StopService(Service_Gps)
					'MCode.AnimationOpen(pnlMap)
					pnlMap.Visible=True
					
					pnlMap.BringToFront
					C_Tafzili=Item.CodeTafzili
					nameMoshtari=Item.SharhTafzili
					'Wait For MFragment_Ready
					gmap.Clear()
					gmap = mFragment.GetMap
					gmap.MyLocationEnabled = True
					'gmap.Clear()
					'ProgressDialogShow2("تا دریافت موقعیت مکانی چند لحظه ای صبر کنید",False)
				End If
			Case 1
				ProgressDialogShow2("چند لحظه منتظر بمانید",False)
				GetLocation(Item.CodeTafzili)
			Case 2
				Cu=MCode.Result("Select * From TblSooratHesab Where FldCodeTafzili = '"& Item.CodeTafzili &"'")
				If Cu.RowCount>0 Then
					MCode.C_Tafzili=Item.CodeTafzili
					MCode.N_Tafzili=Item.SharhTafzili
					MCode.Address_Tafzili=Item.Address
					MCode.Tell_Tafzili=Item.Tell
					StartActivity(Act_SooratHesab)
				Else
					ToastMessageShow("صورت حساب این شخص موجود نمی باشد",True)
				End If
			Case 3
				PnlJoziat.Visible=True
				MCode.AnimationOpen(PnlJoziat)
				LblCodeMoshtari.Text=Item.CodeTafzili
				LblNameMoshtari.Text= Item.SharhTafzili
				If Item.Mande < 0 Then
					LblMandeHesab.Text= "("& NumberFormat(Abs(Item.Mande),0,3) & ")" & "  " & MCode.VahedPool
					LblMandeHesab.TextColor=Colors.Red
				Else if Item.Mande > 0 Then
					LblMandeHesab.Text= NumberFormat(Item.Mande,0,3) & "  " & MCode.VahedPool
					LblMandeHesab.TextColor=Colors.RGB(70,250,114)
				Else if Item.Mande = 0 Then
					LblMandeHesab.Text= NumberFormat(Item.Mande,0,3) & "  " & MCode.VahedPool
					LblMandeHesab.TextColor=Colors.Black
				End If
				LblTell.Text= Item.Tell
				lblAddress.Text= Item.Address
				PnlJoziat.BringToFront
		End Select
	End If
End Sub

Sub HLVAshkhas_onScrollStateChanged (State As Int)
	Key.HideKeyboard
	PnlJoziat.Visible=False
End Sub

Sub GPS1_LocationChanged (Location1 As Location)
	Dim Lat,Lon As Double
	Lat=Location1.Latitude
	Lon=Location1.Longitude
	GPS1.Stop
	ProgressDialogShow2("در حال ثبت موقعیت . . .",False)
	SendLocation(Lat,Lon)
End Sub

Sub SendLocation(Lat1 As String,Lon1 As String)
	jobInternet.JobName ="SendLocation"
	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/SaveLocationToziKonande","C_Tafzili=" & C_Tafzili & "&Lat=" & Lat1 & "&Lon=" & Lon1 & "&Imei=" & MCode.DeviceId)
End Sub

Sub GetLocation(CodeTafzili As String)
	jobInternet.JobName ="GetLocation"
	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/GetAndroid","Query=Select FldC_Tafzili,FldLat,FldLon From TblLocation Where FldC_Tafzili = '"& CodeTafzili &"'" & "&Imei=" & MCode.DeviceId)
End Sub

Sub LoadGetLocation(Str As String)
	Dim RowsList As List
	Dim Row As Map
	MCode.Json.Initialize(Str.Trim )
	RowsList = MCode.Json.NextArray
	For i = 0 To RowsList.Size - 1
		Row=RowsList.Get(i)
		ProgressDialogHide
		ShowMap(Row.Get("FldLat"), Row.Get("FldLon"))
	Next
End Sub

Sub ShowMap(Lat1 As String,Lon1 As String)
	Dim Intent1 As Intent
	Dim Uri As String
	ProgressDialogHide
	Uri="geo:0,0?q=" & Lat1 & "," & Lon1 & "," & "15z"
	Intent1.Initialize(Intent1.ACTION_VIEW, Uri)
	StartActivity(Intent1)
End Sub

Sub JobDone (Job As HttpJob)
	If Job.Success Then
		Dim Str As String = Job.GetString
		If Str <> "" Then
			Select Case Job.JobName
				Case "SendLocation"
					If Str = "No Result" Then
						ToastMessageShow("خطا در اتصال",True)
					Else
						ToastMessageShow("موقعیت ثبت گردید",True)
					End If
					ProgressDialogHide
				Case "GetLocation"
					If Str = "No Result" Then
						ProgressDialogHide
						ToastMessageShow("برای این شخص موقعیت ثبت نشده است",True)
					Else
						LoadGetLocation(Str)
					End If
			End Select
		Else
			ProgressDialogHide
			Msgbox ("خطا در اتصال","خطا")
		End If
	Else
		ProgressDialogHide
		Msgbox ("خطا در اتصال","خطا")
	End If
	jobInternet.Release
End Sub

Sub Activity_KeyPress (KeyCode As Int) As Boolean 'Return True to consume the event
	If KeyCode=KeyCodes.KEYCODE_BACK Then
		If pnlMap.Visible=True Then
			pnlMap.Visible=False
			MCode.Animationclose(pnlMap)
			Return True
		End If
		If AcTxtSearch.Visible=True Then
			If AcTxtSearch.Text<>"" Then
				AcTxtSearch.Text = ""
				Return True
			Else
				LblBackSearch.Visible=False
				LblTitle.Visible=True
				AcTxtSearch.Visible=False
				Return True
			End If
		Else if PnlJoziat.Visible=True Then
			btnUpdate.Visible=True
			PnlJoziat.Visible=False
			MCode.Animationclose(PnlJoziat)
			Return True
		Else If MCode.C_LayeAshkhas.Length > 3 Then
			LoadGoroohAshkhasBack(MCode.C_LayeAshkhas)
			Return True
		Else
			MCode.C_LayeAshkhas=""
			Activity.Finish
			MCode.SetAnimation("zoom_enter2", "zoom_exit2")
		End If
	End If
	Return True
End Sub
Sub Activity_Resume
	
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub
Sub AcTxtSearch_TextChanged (Old As String, New As String)
	noeLoadListAshakhas="Search"
	LoadListAshkhas(0)
	ListAshkhas = Utils.FilterSearchList("SharhTafzili",OriginalListAshkhas).Contains(New)
	HLVAshkhas.ScrollToPosition(0)
	HLVAshkhas.notifyDataSetChanged
	
End Sub
Sub LoadListAshkhasForSearch
	Dim Cu As Cursor = MCode.Result("Select * From TblAshkhas order by fldCodeGroup")
	OriginalListAshkhas.Clear
	If Cu.RowCount > 0 Then
		For i = 0 To Cu.RowCount - 1
			Dim Item As AdapterListAshkhas
			Cu.Position=i
			Item.CodeTafzili=Cu.Getstring("fldCodetafzili")
			Item.SharhTafzili=Cu.Getstring("fldSharheTafzili")
			Item.Mande=Cu.Getstring("fldMande")
			Item.Tell=Cu.Getstring("fldTell")
			Item.Address=Cu.Getstring("fldAdress")
			OriginalListAshkhas.Add(Item)
		Next
	End If
	'ToastMessageShow("تعداد اشخاص زیر مجموعه " & "  " & Cu.RowCount,True)
	ListAshkhas= OriginalListAshkhas
	HLVAshkhas.notifyDataSetChanged
End Sub
Sub Search_Click
	MCode.IconView.SearchView.Start
	AcTxtSearch.Visible=True
	Key.ShowKeyboard(AcTxtSearch)
	LblBackSearch.Visible=True
	LblTitle.Visible=False
End Sub

Sub LblBackSearch_Click
	LblBackSearch.Visible=False
	Anim.InitializeRotateCenter("",0,180,LblBackSearch)
	Anim.Duration=400
	Anim.Start(LblBackSearch)
	Sleep(400)
	LblTitle.Visible=True
	AcTxtSearch.Text=""
	AcTxtSearch.Visible=False
	Key.HideKeyboard
End Sub

Sub PnlJoziat_Click
	
End Sub

Sub btnNewAshkhas_Click
	StartActivity(Act_Ashkhas_New)
End Sub

Sub MFragment_LongClick (Point As LatLng)
	gmap.Clear()
	gmap.AddMarker(Point.Latitude, Point.Longitude, nameMoshtari)
	Lat=Point.Latitude
	Lon=Point.Longitude
	Log("Lat= "&Lat &" Lon= "&Lon)
	'pnlMap.Visible=False
End Sub



Sub btnSaveLocation_Click
	If Lat<>0 And Lon <>0 Then
		SendLocation(Lat,Lon)
		pnlMap.Visible=False
		Else
			ToastMessageShow("لطفا نقطه مورد نظر را انتخاب کنید",False)
	End If
	
	
End Sub

Sub btnUpdate_Click
	tcount=3
	t1.Enabled=True
End Sub