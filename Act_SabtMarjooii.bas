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
	Dim rp As RuntimePermissions
	Dim t_search As Timer
End Sub

Sub Globals
	Dim HLV As Hitex_LayoutView
	Public NiceSpinner As Hitex_NiceSpinner
	Public NiceSpinner1 As Hitex_NiceSpinner
	Dim Key As IME
	Dim ListKalaTxt,ListKalaSp,OrginalListKala As List
	Dim ListGroohKala As List
	Dim FeeTip As String
	Private Str_sort As String = " Order by fldNameKala Asc"
'	Dim zx As JhsIceZxing1
	Dim Barcode As JhsIceZxing1
'	Private btn_sort As Label
'	Private lblPaging As Label
'	Private Btn_barcode As Label
	Private LblBasketCount As Label
	Private LblBasket As Label
	Private BtnShowFilterPnl As ImageView
	Private TxtSearch As EditText
	Private B4XComboBox1 As B4XComboBox
	Private B4XComboBox2 As B4XComboBox
	Private BtnCommentExit As Button
	Private BtnCommentOK As Button
	Private pnlFilter As Panel
	Private pnl_HLV As Panel
	Private NumberSearch As EditText
	Private Pnl_Top As Panel
	Private ImageView1 As ImageView
	Private btn_Back As Button
	Private Label4 As Label
	Private Panel2 As Panel
	Private Panel3 As Panel
	Private Label6 As Label
'	Private AcSwTakhfif As B4XSwitch
'	Private AcSwGift As B4XSwitch
'	Private AcSwMojoodi As B4XSwitch
'	Private AcSwAdvanceSearch As B4XSwitch
	Private BtnSearch As Label

'	Private ChSwGift As CheckBox
'	Private ChSwTakhfif As CheckBox
'	Private ChSwMojoodi As CheckBox
'	Private ChSwAdvanceSearch As CheckBox
	
	Private Dialog As B4XDialog
	Private XUI As XUI
	
	Private Img_barcode As ImageView
	Private Img_Paging As ImageView
	Private Img_sort As ImageView
	Private Img_TipFee As ImageView
	Private Label11 As Label
	Private Pnl_Tools As Panel
	Private LblPoint As Label
'	Private Btn_Bascket As Button
	Private SwGift As ACSwitch
	Private SwMojoodi As ACSwitch
	Private SwPic As ACSwitch
	Private SwTakhfif As ACSwitch
	Private Pnl_Down As Panel
	Dim ListGoroohKala,OriginalListGoroohKala As List
	Dim GroupCodeSelect1 As String="0"
	Dim GroupNameSelect1 As String=""
	Dim GroupCodeSelect2 As String="0"
	Dim GroupNameSelect2 As String=""
	
	Dim lstSelectedCodeGroupKala As List
	Private CmbBox1 As B4XComboBox
	Private lblTitile As Label
	Private pnlTipFee As Panel
	Private Img_SelectMoshtari As ImageView
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Activity.LoadLayout("L_KalaDefault_2")
	lstSelectedCodeGroupKala.Initialize
	HLV.Initializer("HLV").ListView.Build
	pnl_HLV.AddView(HLV,0,0,100%x,pnl_HLV.Height)
	Key.Initialize("Key")
	
	
	Dialog.Initialize (Activity)
	t_search.Initialize("t_search",50)
	ListGoroohKala.Initialize
	OriginalListGoroohKala.Initialize
	NiceSpinner.Initialize("NiceSpinner",True,True)
'	pnlFilter.AddView(NiceSpinner,B4XComboBox1.mBase.Left,B4XComboBox1.mBase.top,B4XComboBox1.mBase.Width,B4XComboBox1.mBase.Height)
	Panel2.AddView(NiceSpinner,B4XComboBox1.mBase.Left,B4XComboBox1.mBase.top,B4XComboBox1.mBase.Width,B4XComboBox1.mBase.Height)
	NiceSpinner.TextColor = Colors.Black
	NiceSpinner.Gravity = Gravity.CENTER_HORIZONTAL
	NiceSpinner.Typeface = Typeface.LoadFromAssets("p_font.ttf")
	Dim op As ColorDrawable
	op.Initialize2(Colors.White,8dip,2dip,Colors.Black)
	NiceSpinner.Background=op
	
	NiceSpinner1.Initialize("NiceSpinner1",True,True)
'	pnlFilter.AddView(NiceSpinner1,B4XComboBox2.mBase.Left,B4XComboBox2.mBase.top,B4XComboBox2.mBase.Width,B4XComboBox2.mBase.Height)
	Panel2.AddView(NiceSpinner1,B4XComboBox2.mBase.Left,B4XComboBox2.mBase.top,B4XComboBox2.mBase.Width,B4XComboBox2.mBase.Height)
	NiceSpinner1.TextColor = Colors.Black
	NiceSpinner1.Gravity = Gravity.CENTER_HORIZONTAL
	NiceSpinner1.Typeface = Typeface.LoadFromAssets("p_font.ttf")
	Dim op1 As ColorDrawable
	op1.Initialize2(Colors.White,8dip,2dip,Colors.Black)
	NiceSpinner1.Background=op1
	NiceSpinner1.Add("همه گروه ها")
	
	ListGroohKala.Initialize
	OrginalListKala.Initialize
	ListKalaSp.Initialize
	ListKalaTxt.Initialize
	
	LoadAcSpGroohKala
'	HLV.Ripple.Color(0xFF909090)
'	HLV.CardView.CardElevation(8dip).Radius(8dip)
	HLV.Show
	
'	Dim Cu As Cursor = MCode.Result("Select FldTipFee From TblAshkhas Where FldC_Ashkhas = '"& MCode.CodeMoshtari &"'")
'	If Cu.RowCount>0 Then
'		Cu.Position=0
'		FeeTip = Cu.GetString("FldTipFee")
'	Else
'		FeeTip =0
'	End If
	
	'btnUpdate_Click
	LoadKala
'	Img_Paging.Visible=True
'	myCode.TextBoxBackColorWhite(TxtSearch)
	lblTitile.Text="ثبت مرجوعی"
	MCode.page="SabtMarjooii"
	'MCode.Action="SabtMarjooii"
	pnlTipFee.Visible=False
End Sub



Sub btnUpdate_Click

	If MCode.IsConnected Then
		StartService(FirebaseMessaging)
		MCode.page="SabtMarjooii"
		FirebaseMessaging.mode="GetGalleryKala"
	Else
		LoadKala
	End If
End Sub

Sub LoadKala
	
	Dim str As String=""
	Dim countfilter As Int=0
	Dim filter As Boolean=False
	Log(GroupCodeSelect1)
	Log(GroupCodeSelect2)
	If GroupCodeSelect1=0 And GroupCodeSelect2=0 Then
		If TxtSearch.Text.Length>0 And TxtSearch.Text<>" " And TxtSearch.Text<>"" Then
			Dim Search As String=MCode.ConvertNumbersPersian2English(TxtSearch.Text)
			If Search="" Then
				Search=TxtSearch.Text
			End If
			countfilter=countfilter+1
			If IsNumber(Search) Then
				If Search.Length>5 Then
					str = str & $" and (fldSerial = '${Search}') "$
				Else
					str = str & $" and (fldCodeKala like '%${Search}%') "$
				End If
			
			Else
				str = str & $" and (fldNameKala like '%${Search}%') "$
			End If
			filter=True
			If countfilter=1 Then
				str=str.Replace(" and ","")
			End If
		End If

		If SwGift.Checked=True Then
			countfilter=countfilter+1
			str= str & " and TblKala.fldCodeKala IN(SELECT tblEshantionVisitori.fldCodeKala FROM tblEshantionVisitori)"
			filter=True
			If countfilter=1 Then
				str=str.Replace(" and ","")
			End If
		End If
		If SwTakhfif.Checked=True Then
			countfilter=countfilter+1
			str= str & " and fldFeeBadAzTakhfif <> '0.0000'"
			filter=True
			If countfilter=1 Then
				str=str.Replace(" and ","")
			End If
		End If
		If SwMojoodi.Checked=True Then
			countfilter=countfilter+1
			str= str & " and SumMande > '0'"
			filter=True
			If countfilter=1 Then
				str=str.Replace(" and ","")
			End If
		End If
		If SwPic.Checked=True Then
			countfilter=countfilter+1
			str= str & " and fldPathPic <> '0'"
			filter=True
			If countfilter=1 Then
				str=str.Replace(" and ","")
			End If
		End If
		If filter=True Then
			
			'str=str.Replace(" and ","")
			str="select * from TblKala where "&str&" "&Str_sort
		Else
			str="select * from TblKala  "&Str_sort
		End If
		Log(str)
	End If
	
	If GroupCodeSelect1<>0 And GroupCodeSelect2=0 Then
		If TxtSearch.Text.Length>0 And TxtSearch.Text<>" " And TxtSearch.Text<>"" Then
			Dim Search As String=MCode.ConvertNumbersPersian2English(TxtSearch.Text)
			If Search="" Then
				Search=TxtSearch.Text
			End If
			countfilter=countfilter+1
			If IsNumber(Search) Then
				If Search.Length>5 Then
					str = str & $" and (fldSerial = '${Search}') "$
				Else
					str = str & $" and (fldCodeKala like '%${Search}%') "$
				End If
			
			Else
				str = str & $" and (fldNameKala like '%${Search}%') "$
			End If
			filter=True
			If countfilter=1 Then
				str=str.Replace(" and ","")
			End If
		End If

		If SwGift.Checked=True Then
			countfilter=countfilter+1
			str= str & " and TblKala.fldCodeKala IN(SELECT tblEshantionVisitori.fldCodeKala FROM tblEshantionVisitori)"
		
		End If
		If SwTakhfif.Checked=True Then
			countfilter=countfilter+1
			str= str & " and fldFeeBadAzTakhfif <> '0.0000'"
			
		
		End If
		If SwMojoodi.Checked=True Then
			countfilter=countfilter+1
			str= str & " and SumMande > '0'"
	
		End If
		If SwPic.Checked=True Then
			countfilter=countfilter+1
			str= str & " and fldPathPic <> '0'"
		
		End If
		
		str="select * from TblKala where fldCodeGroup like '"&GroupCodeSelect1&"%' "&str&" " &Str_sort
		Log(str)
	End If
	
	If GroupCodeSelect1<>0 And GroupCodeSelect2<>0 Then
		If TxtSearch.Text.Length>0 And TxtSearch.Text<>" " And TxtSearch.Text<>"" Then
			Dim Search As String=MCode.ConvertNumbersPersian2English(TxtSearch.Text)
			If Search="" Then
				Search=TxtSearch.Text
			End If
			countfilter=countfilter+1
			If IsNumber(Search) Then
				If Search.Length>5 Then
					str = str & $" and (fldSerial = '${Search}') "$
				Else
					str = str & $" and (fldCodeKala like '%${Search}%') "$
				End If
			
			Else
				str = str & $" and (fldNameKala like '%${Search}%') "$
			End If
			filter=True
			If countfilter=1 Then
				str=str.Replace(" and ","")
			End If
		End If

		If SwGift.Checked=True Then
			countfilter=countfilter+1
			str= str & " and TblKala.fldCodeKala IN(SELECT tblEshantionVisitori.fldCodeKala FROM tblEshantionVisitori)"
		
		End If
		If SwTakhfif.Checked=True Then
			countfilter=countfilter+1
			str= str & " and fldFeeBadAzTakhfif <> '0.0000'"
			
		
		End If
		If SwMojoodi.Checked=True Then
			countfilter=countfilter+1
			str= str & " and SumMande > '0'"
	
		End If
		If MCode.NamayeshKalaSefr=0 Then
			countfilter=countfilter+1
			str= str & " and SumMande > '0'"
			filter=True
			If countfilter=1 Then
				str=str.Replace(" and ","")
			End If
		End If
		If SwPic.Checked=True Then
			countfilter=countfilter+1
			str= str & " and fldPathPic <> '0'"
		
		End If
		
		str="select * from TblKala where fldCodeGroup like '"&GroupCodeSelect2&"%' "&str&" "&Str_sort
		Log(str)
	End If
		
	LoadListKala(str)
	
	RefreshLblSabad
End Sub

Sub Activity_Resume
	
	RefreshLblSabad
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub LoadAcSpGroohKala
	Dim Dt As Cursor = MCode.Result("Select FldC_Gorooh,FldN_Gorooh From TblGoroohKala where Length(FldC_Gorooh) = 3 ORDER BY FldC_Gorooh")
	NiceSpinner.Add("همه گروه ها")
	For i=0 To Dt.RowCount-1
		Dt.Position=i
		Dim Item As AdapterGoroohKala
		Dim cu As Cursor
		
		cu=MCode.Result("Select fldCodeKala From TblKala where fldCodeGroup like '"& Dt.GetString("FldC_Gorooh") & "%'")
		If cu.RowCount>0 Then
			Item.FldC_Gorooh= Dt.GetString("FldC_Gorooh")
			Item.FldN_Gorooh= Dt.GetString("FldN_Gorooh")
			OriginalListGoroohKala.Add(Item)
			NiceSpinner.Add(Item.FldN_Gorooh)
		End If

	Next
	NiceSpinner.Show(Colors.blue, 14)
	

	

End Sub

Sub LoadListKala(Query As String)
	OrginalListKala.Clear
	Dim Cu As Cursor = MCode.Result(Query)
	If Cu.RowCount > 0 Then
		ProgressDialogShow("لطفا منتظر بمانید")
		For i = 0 To Cu.RowCount - 1
			Dim ItemKala As AdapterListKala
			Cu.Position=i
			ItemKala.CodeKala=Cu.Getstring("fldCodeKala")
			ItemKala.NameKala=Cu.Getstring("fldNameKala")
			ItemKala.NameVahed=Cu.Getstring("fldNameVahed")
			ItemKala.NameVahed2=Cu.Getstring("fldNameVahed2")
			ItemKala.SumMande=Cu.Getstring("SumMande")
			Dim cu1 As Cursor=MCode.Result("select * from TblSabad where FldCodeKala="&ItemKala.CodeKala)
			
			If cu1.RowCount>0 Then
				cu1.Position=0
				ItemKala.TedadDarSabadJoz =cu1.Getstring("FldTedadDarSabadJoz")
				ItemKala.TedadDarSabadKol =cu1.Getstring("FldTedadDarSabadKol")
				ItemKala.FldEshantion=cu1.Getstring("FldEshantion")
			End If
			
			ItemKala.TedadDarKarton =Cu.Getstring("fldTedadDarKarton")
			ItemKala.FeeForoosh=Cu.GetInt("fldFeeForoosh")
			ItemKala.FldMablaghMasrafKonande=Cu.GetString("fldGhymatMasrafkonande")
			'Log(Cu.GetString("fldPathPic"))
			
			If Cu.GetString("fldFeeBadAzTakhfif")<>Null Then
				Log(Cu.GetString("fldFeeBadAzTakhfif"))
				ItemKala.fldFeeBadAzTakhfif=Cu.GetString("fldFeeBadAzTakhfif")
			Else
				Log(Cu.GetString("fldFeeBadAzTakhfif"))
				Log("0")
				ItemKala.fldFeeBadAzTakhfif="0"
			End If
			ItemKala.fldPathPic=Cu.GetString("fldPathPic")
			ItemKala.FldEshantion=0
		
			If Cu.Getstring("fldNameVahed2") <> "" Then
				Dim FldFeeForoosh As Int = MCode.Sf.Val(Cu.GetInt("fldFeeForoosh"))
				Dim FldTedadDarKarton As Int = MCode.Sf.Val(Cu.Getstring("fldTedadDarKarton"))
				Dim SumMande As Int = Cu.Getstring("SumMande")
				ItemKala.FeeForooshKarton=FldFeeForoosh * FldTedadDarKarton
				ItemKala.SumMandeKarton=Round2( SumMande / FldTedadDarKarton,0)
			End If
			OrginalListKala.Add(ItemKala)
			cu1.Close
		Next
		ProgressDialogHide
	End If
	'ToastMessageShow("تعداد کالای زیر مجموعه " & "  " & Cu.RowCount,True)
	
	ListKalaSp=OrginalListKala
	ListKalaTxt=ListKalaSp
	
'	ToastMessageShow(Cu.RowCount,True)
	HLV.notifyDataSetChanged
End Sub


Sub RefreshLblSabad
	Dim Cu As Cursor = MCode.Result("Select * From TblSabad")
	If Cu.RowCount>0 Then
		LblBasketCount.Visible=True
		LblBasketCount.Text=Cu.RowCount
	Else
		LblBasketCount.Visible=False
	End If
	HLV.notifyDataSetChanged
End Sub

Sub NiceSpinner_ItemClick (Position As Int, Value As Object)
	'TxtSearch.Text= ""
	Key.HideKeyboard

	
	If Position = 0 Then
		ListGroohKala.Clear
		lstSelectedCodeGroupKala.Clear
		NiceSpinner1.Clear
		NiceSpinner1.Add("همه گروه ها")
		'LoadListKala("Select * From TblKala " & Str_sort)
		GroupCodeSelect1="0"
		GroupNameSelect1=""
		GroupCodeSelect2="0"
		GroupNameSelect2=""
		NiceSpinner1.SelectedIndex=0
	Else
'		NiceSpinner1.Clear
		Dim lst As List=OriginalListGoroohKala
		Dim Item As AdapterGoroohKala=lst.Get(NiceSpinner.SelectedIndex-1)
		Log(Item.FldN_Gorooh)
		Log(Item.FldC_Gorooh)
		GroupCodeSelect1=Item.FldC_Gorooh
		GroupNameSelect1=Item.FldN_Gorooh
		GroupCodeSelect2="0"
		GroupNameSelect2=""
		Dim mc As String=Item.FldC_Gorooh
		'Dim Cu As Cursor = MCode.Result($"Select FldC_Gorooh,FldN_Gorooh From TblGoroohKala where FldC_Gorooh like '${mc}%' Order By FldC_Gorooh"$)
		Dim Count As Int = Item.FldC_Gorooh.Length + 3
		Dim Cu As Cursor=MCode.Result("Select FldC_Gorooh,FldN_Gorooh From TblGoroohKala where FldC_Gorooh Like '"& mc &"%' And Length(FldC_Gorooh) = "& Count &" ORDER BY FldC_Gorooh")
		If Cu.RowCount>0 Then
			lstSelectedCodeGroupKala.Clear
			NiceSpinner1.Clear
			NiceSpinner1.Add("همه گروه ها")
			For i=0 To Cu.RowCount-1
				Cu.Position=i
				Dim Item As AdapterGoroohKala
				Item.FldC_Gorooh=Cu.GetString("FldC_Gorooh")
				Item.FldN_Gorooh=Cu.GetString("FldN_Gorooh")
				ListGroohKala.Add(Item)
				NiceSpinner1.Add(Cu.GetString("FldN_Gorooh"))
			Next
			NiceSpinner1.Show(Colors.blue, 14)
			NiceSpinner1.SelectedIndex = 0
			lstSelectedCodeGroupKala.Add(GroupCodeSelect1)
		Else
			ListGroohKala.Clear
			lstSelectedCodeGroupKala.Clear
			NiceSpinner1.Clear
			NiceSpinner1.Add("همه گروه ها")
			GroupCodeSelect2="0"
			GroupNameSelect2=""
			NiceSpinner1.SelectedIndex=0
		End If
	End If

	LoadKala
	Log("CodeGroupSelect1: "&GroupCodeSelect1)
	Log("postion1: "&Position)
	'search(True)
End Sub

Sub NiceSpinner1_ItemClick (Position As Int, Value As Object)
	If Position=0 Then
		
		GroupCodeSelect2=lstSelectedCodeGroupKala.Get(lstSelectedCodeGroupKala.Size-1)
	Else
		Dim lst As List=ListGroohKala
		Dim Item As AdapterGoroohKala=lst.Get(NiceSpinner1.SelectedIndex-1)
		GroupCodeSelect2=Item.FldC_Gorooh
		
		Dim mc As String=Item.FldC_Gorooh
			
		Dim Count As Int = mc.Length + 3
		Dim Cu As Cursor=MCode.Result("Select FldC_Gorooh,FldN_Gorooh From TblGoroohKala where FldC_Gorooh Like '"& mc &"%' And Length(FldC_Gorooh) = "& Count &" ORDER BY FldC_Gorooh")
		If Cu.RowCount>0 Then
			ListGroohKala.Clear
			NiceSpinner1.Clear
			'lstSelectedCodeGroupKala.Clear
			
			lstSelectedCodeGroupKala.Add(Item.FldC_Gorooh)
	
			'NiceSpinner1.Add("برگشت")
			NiceSpinner1.Add("همه گروه ها")
			
			For i=0 To Cu.RowCount-1
				Cu.Position=i
				Dim Item As AdapterGoroohKala
				Item.FldC_Gorooh=Cu.GetString("FldC_Gorooh")
				Item.FldN_Gorooh=Cu.GetString("FldN_Gorooh")
				ListGroohKala.Add(Item)
				NiceSpinner1.Add(Cu.GetString("FldN_Gorooh"))
			Next
		
			NiceSpinner1.Show(Colors.blue, 14)
			NiceSpinner1.SelectedIndex = 0
		End If
	End If
	LoadKala
	Log("CodeGroupSelect2: "&GroupCodeSelect2)
	Log("position2: "&Position)
End Sub

Sub HLV_GetItemCount As Int 								        '💯 ItemCount 💯'
	Return ListKalaTxt.Size
End Sub
Sub HLV_onCreateViewHolder (Parent As Panel, ViewType As Int)      '💎 onCreate 💎'
	Dim rec As CLs_RecDefultKala
	rec.Initialize(Me)
	Parent.AddView(rec.Panel,0,0,100%x,rec.Height)
	Parent.Tag=rec
End Sub
Sub HLV_onBindViewHolder (Parent As Panel, Position As Int)         '💠 onBind 💠'
	Dim Item = ListKalaTxt.Get(Position) As AdapterListKala
	Dim rec As CLs_RecDefultKala=Parent.Tag
	rec.Show(Item,Position)
	Parent.Height=rec.Height
End Sub


Sub Img_barcode_Click
	Dim Result As Boolean = True
	If Not(rp.Check(rp.PERMISSION_CAMERA)) Then
		rp.CheckAndRequest(rp.PERMISSION_CAMERA)
		Wait For Activity_PermissionResult (Permission As String, Result As Boolean)
	End If
	If Result=False Then
		Return
	Else
		Barcode.BeginScan("myzx")
	End If
End Sub

Sub myzx_result(atype As String,Values As String)
	LogColor("type:"&atype&"values:"&Values,Colors.red)
	'TxtSearch.Visible=False
	'NumberSearch.Visible=True
	TxtSearch.Text=Values
	BtnSearch.Tag=True
End Sub

'Sub Btn_barcode_Click
'	Dim Result As Boolean = True
'	If Not(rp.Check(rp.PERMISSION_CAMERA)) Then
'		rp.CheckAndRequest(rp.PERMISSION_CAMERA)
'		Wait For Activity_PermissionResult (Permission As String, Result As Boolean)
'	End If
'	If Result=False Then
'		Return
'	End If
'	zx.isportrait = True
'	zx.displayOrientation = 90     '90 is the default value that was set in the library. It works for most devices
'	'although for eg the Nexus 5 will show an upside down preview with this setting.
'	'I guess zx.displayOrientation = 270 will fix it for the Nexus 5 when used in portrait mode.
'	zx.useFrontCam = False
'	'set the timeoutDuration to a very high value (such as 2000000000) if you dont want it to time out
'	'2000000000 = 63 years
'	zx.timeoutDuration = 3000
'	
'	zx.islasteruptodown=True
'	
'	'change these factors between 0 and 1 to change the size of the viewfinder rectangle
'	'the library will limit the minimum size to 240 x 240 pixels and the maximum to (screen width) x (screen height) pixels
'
'	zx.theViewFinderXfactor = .9      'portrait
'	zx.theViewFinderYfactor = .6     'portrait
'	
''	zx.theViewFinderXfactor = 0.5      'landscape
''	zx.theViewFinderYfactor = 0.5      'landscape
'	
'	zx.theFrameColor = Colors.Blue
'	zx.theLaserColor = Colors.Yellow
'	zx.theMaskColor = Colors.argb(255, 0, 0, 255)
'	zx.theResultColor = Colors.Green
'	zx.theResultPointColor = Colors.Red
'	
'	'set the prompt messages
'	zx.theTopPromptMessage = ""
'	zx.theTopPromptTextSize = 5%y                            'text size in pixels
'	zx.topPromptColor = Colors.Green
'	zx.topPromptDistanceFromTop = 1%y                        'pixel distance from top
'	zx.textSkewnessTop = 0.0
'	
'	
'	zx.theBottomPromptMessage = ""
'	zx.theBottomPromptTextSize = 5%y                         'text size in pixels
'	zx.bottomPromptColor = Colors.Green
'	zx.bottomPromptDistanceFromBottom = 5%y                  'pixel distance from top
'	zx.textSkewnessBottom = 0.0
'	
'	zx.mustBeep = True
'	zx.mustVibrate = True
'	zx.BeginScan("myzx")
'End Sub
'Sub myzx_result(atype As String, Value As String, image As Bitmap)
'	Log("type:"&atype&"values:"&Value)
'	TxtSearch.Text=Value
'	
'End Sub
'Sub myzx_timedout(timedOut As Boolean)
'	Log("timedOut " & timedOut)
'
'End Sub
'Sub myzx_usercancelled(userCancelled As Boolean)
'	Log("userCancelled " & userCancelled)
'End Sub
Sub NumberSearch_TextChanged (Old As String, New As String)
	LoadKala
End Sub

'Sub LblBasket_Click
'	If LblBasketCount.Visible Then
'		StartActivity(Act_Sabad)
'		Activity.Finish
'	Else
'		ToastMessageShow("سبد خرید خالی است",False)
'	End If
'End Sub
Sub PnlTedad_Click
	
End Sub

Sub TxtSearch_TextChanged (Old As String, New As String)
	'LoadKala
	t_search.Enabled=True
End Sub

Private Sub t_search_Tick
	t_search.Enabled=False
	BtnSearch_Click
End Sub

Private Sub Img_Paging_Click
	Act_KalaPaging.listKala=ListKalaTxt
	StartActivity(Act_KalaPaging)
End Sub

'Sub BtnCommentExit_Click
'	pnlFilter.SetVisibleAnimated(300,False)
'End Sub

Sub BtnShowFilterPnl_Click
	If Panel2.Height = Label11.top Then
		Panel2.SetLayoutAnimated(500,Panel2.Left,Panel2.Top,Panel2.Width,LblPoint.top + LblPoint.Height)
		Pnl_Tools.SetLayoutAnimated(500,Pnl_Tools.Left,Panel2.Top + Panel2.Height + 1%y,Pnl_Tools.Width,Pnl_Tools.Height)
		pnl_HLV.SetLayoutAnimated(500,pnl_HLV.Left,Pnl_Tools.Top + Pnl_Tools.Height,pnl_HLV.Width,Pnl_Down.top - 13%y - Pnl_Tools.top + Pnl_Tools.Height)
		HLV.Height=pnl_HLV.Height
	Else
		Panel2.SetLayoutAnimated(500,Panel2.Left,Panel2.Top,Panel2.Width,Label11.top)
		Pnl_Tools.SetLayoutAnimated(500,Pnl_Tools.Left,Pnl_Top.Top + Pnl_Top.Height,Pnl_Tools.Width,Pnl_Tools.Height)
		pnl_HLV.SetLayoutAnimated(500,pnl_HLV.Left,Pnl_Tools.Top + Pnl_Tools.Height,pnl_HLV.Width,Pnl_Down.top - Pnl_Tools.top + Pnl_Tools.Height)
		HLV.Height=pnl_HLV.Height - 13%y
	End If
End Sub

'Sub AcSwMojoodi_ValueChanged (Value As Boolean)
'	search(True)
'End Sub
'
'Sub AcSwTakhfif_ValueChanged (Value As Boolean)
'	search(True)
'End Sub
'
'Sub AcSwGift_ValueChanged (Value As Boolean)
'	search(True)
'End Sub
'Sub BtnCommentOK_Click
'	pnlFilter.SetVisibleAnimated(300,False)
'End Sub

Sub btn_Back_Click
'	StartActivity(Act_DontSefaresh)
	Dim Cu1 As Cursor = MCode.Result("Select * From TblSabad")
	If Cu1.RowCount>0 Then
		Dim Res As Int = Msgbox2("با خارج شدن از این صفحه، سبد خرید شما خالی میشود." & CRLF & "آیا از این صفحه خارج می شوید؟","توجه","بله","","خیر",Null)
		If Res = DialogResponse.POSITIVE Then
			MCode.SaveUpdate("delete from TblSabad")		
		End If
	End If
	FeeTip=0
	MCode.feeTip=0
	MCode.isAmani=0
	Activity.Finish
End Sub
Sub Activity_KeyPress (KeyCode As Int) As Boolean 'Return True to consume the event
	
	If KeyCode=KeyCodes.KEYCODE_BACK Then
		btn_Back_Click
		Return True
	End If
	Return True
End Sub

Sub Img_sort_Click
'	If btn_sort.Tag=True Then
'		Str_sort = " Order by FldN_Kala Asc"
'		btn_sort.Tag=False
'	Else
'		Str_sort = " Order by FldDate Desc"
'		btn_sort.Tag=True
'	End If
	Dim Lst As List = Array As String("کد کالا","نام کالا نزولی","نام کالا صعودی","ارزان ترین قیمت","گرانترین قیمت","کمترین موجودی","بیشترین موجودی")
	Dim res As Int = InputList(Lst,"مرتب سازی براساس:",-1)
	Select Case res
		Case 0
			Str_sort = " Order by fldCodeKala Asc"
		Case 1
			Str_sort = " Order by fldNameKala"
		Case 2
			Str_sort = " Order by fldNameKala Desc"
		Case 3
			Str_sort = " Order by fldFeeForoosh"
		Case 4
			Str_sort = " Order by fldFeeForoosh Desc"
		Case 5
			Str_sort = " Order by SumMande"
		Case 6
			Str_sort = " Order by SumMande Desc"
	End Select
	Log(Str_sort)
'	search(AcSwGift.Value)
	LoadKala
End Sub

Sub BtnSearch_Click
'	Log("BtnSearch_Click")
	Try
'	If BtnSearch.Tag=True Then
'		TxtSearch.Visible=True
'		
'		BtnSearch.Tag=False
'	Else
'	
'		TxtSearch.Visible=False
'		BtnSearch.Tag=True
'		End If
		LoadKala
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-BtnSearch_Click")
	End Try
End Sub

Sub SwGift_CheckedChange(Checked As Boolean)
	LoadKala
End Sub

Sub SwTakhfif_CheckedChange(Checked As Boolean)
	LoadKala
End Sub

Sub SwMojoodi_CheckedChange(Checked As Boolean)
	LoadKala
End Sub

Sub SwPic_CheckedChange(Checked As Boolean)
	'search(True)
	LoadKala
End Sub

Sub Img_TipFee_Click
	Dim btnshow As Int=myCode.getSetting("setting.dat","WSetTip",0)
	Log(btnshow)
	If btnshow=0 Then
		ToastMessageShow("دسترسی شما به این گزینه محدود است",True)
		Return
	End If
	
	
	Dim Lst As List
	Lst.Initialize2(Array As String("تیپ1 (بدون احتساب تخفیف)","تیپ1 (با احتساب تخفیف)","تیپ قیمت 3","تیپ قیمت 4","تیپ قیمت 5","تیپ قیمت 6","تیپ قیمت 7","تیپ قیمت 8","تیپ قیمت 9","تیپ قیمت 10"))
	InputListAsync(Lst,"تیپ قیمت را انتخاب کنید",FeeTip-1,True)
	Wait For InputList_Result (Result As Int)
	If Result <> -3 Then
		Dim Res As Int=Msgbox2("توجه داشته باشید که با تغییر تیپ قیمت سبد خرید شما حذف می گردد، آیا می خواهید تیپ قیمت تغییر کند؟","توجه","بله","","خیر",Null)
		If Res = DialogResponse.POSITIVE Then
			MCode.SaveUpdate("Delete From TblSabad")
			RefreshLblSabad
			FeeTip = Result+1
			'search(True)
		End If
	End If
End Sub

Sub btn_edit_Price_Click(Item As AdapterListKala)
	Dim input As B4XInputTemplate
	input.Initialize
	input.lblTitle.Text = "قیمت جدید:"
	input.ConfigureForNumbers(True, True)
	Dim rs As ResumableSub = Dialog.ShowTemplate(input, "OK", "", "CANCEL")
	Dialog.Base.Top = 50%y - Dialog.Base.Height / 2
	Wait For (rs) Complete (Result As Int)
	If Result = XUI.DialogResponse_Positive Then
		If input.Text="" Then input.Text=0
		Dim Res As Float = input.Text 'no need to check with IsNumber
		Item.FeeForoosh=Res
'		MCode.SaveUpdate("Update TblKala Set FldFee='"&res&"' where FldC_Kala = '"& Item.FldC_Kala &"'")
		HLV.notifyDataSetChanged
'		LblFee.Text = NumberFormat(Item.FldFee,1,3) & " " & MCode.VahedPool
	End If
End Sub

Sub LblTedadJoz_Click(Item As AdapterListKala)
	Dialog.Title = "  "
	Dim input As B4XInputTemplate
	input.Initialize
	input.lblTitle.Text = " تعداد "&Item.NameVahed
	Log(MCode.isFloat)
'	MCode.isFloat = True
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
	End If
End Sub

Sub AddToSabad(Item As AdapterListKala)

	Dim Cu As Cursor = MCode.Result("Select * From TblSabad")
	Dim Check As Boolean
	For i=0 To Cu.RowCount -1
		Cu.Position=i
		If Cu.GetString("FldCodeKala") = Item.CodeKala Then
			If Item.TedadDarSabadJoz = 0 And Item.TedadDarSabadKol = 0  Then
				MCode.SaveUpdate("Delete From TblSabad Where FldCodeKala = '"& Item.CodeKala &"'")
			Else
				MCode.SaveUpdate("Update TblSabad Set FldTedadDarSabadJoz = '"& Item.TedadDarSabadJoz &"',FldTedadDarSabadKol = '"& Item.TedadDarSabadKol & _
				"' Where FldCodeKala = '"& Item.CodeKala &"'")
			End If
			Check = True
			Exit
		End If
	Next
	If Check = False Then
		MCode.AddToSabad(Item)
	End If
	RefreshLblSabad
End Sub

'Sub Btn_Bascket_Click
'	If LblBasketCount.Visible Then
'		StartActivity(Act_Sabad)
'		Activity.Finish
'	Else
'		ToastMessageShow("سبد خرید خالی است",False)
'	End If
'End Sub

Sub Pnl_Down_Click
	If LblBasketCount.Visible Then
		StartActivity(Act_Sabad)
		Activity.Finish
	Else
		ToastMessageShow("سبد خرید خالی است",False)
	End If
End Sub
Sub Application_Error (Error As Exception, StackTrace As String) As Boolean
'	MCode.ScheduleRestartCrashedActivity(DateTime.Now + 300, Activity.Title, Error)
	Return True
End Sub

Private Sub Img_SelectMoshtari_Click
	StartActivity(Act_SelectMantage)
End Sub