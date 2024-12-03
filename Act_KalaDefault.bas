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
'	Dim Page As String
	Dim FeeTip As String
	'Dim t_search As Timer
	'Private gps	As GPS
	Dim th As Thread
End Sub

Sub Globals
	Dim HLV As Hitex_LayoutView
	Public NiceSpinner As NiceSpinner
	Public NiceSpinner1 As NiceSpinner
	Dim Key As IME
	Dim ListKalaTxt,ListKalaSp,OrginalListKala As List
	Dim ListGroohKala As List
	
	Private Str_sort As String = " Order by fldCodeKala Asc"
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
	Private Label5 As Label
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
	Private Lbl_Bascket As Label
	Dim ListGoroohKala1,OriginalListGoroohKala1 As List
	Dim ListGoroohKala2,OriginalListGoroohKala2 As List
	Dim GroupCodeSelect1 As String="0"
	Dim GroupNameSelect1 As String=""
	Dim GroupCodeSelect2 As String="0"
	Dim GroupNameSelect2 As String=""
	Dim lstSelectedCodeGroupKala As List
	Dim ListTasvie As List
	Dim bm As Bitmap
	Private CmbBox1 As B4XComboBox
	Private MapFragment1 As MapFragment
	'Private gmap As GoogleMap
	Private rp As RuntimePermissions
	'Dim Lat As String
	'Dim Lon As String
	Private PnlActivate As Panel
	Private txtFee As EditText
	Private btnSaveFee As Button
	Private lblTitle As Label
	Dim FeeType As String
	Private PnlFee As Panel
	Dim ItemSelected As AdapterListKala
	Private txtchanged As Boolean=False
	Private PnlDarsadTakhfif As Panel
	Private txtDarsadTakhfif As EditText
	Private Img_SelectMoshtari As ImageView
	Private lblMojavezSefareshText As Label
	Private PnlSpGroup As Panel
	Dim lstGroup1 As List
	Dim lstGroup2 As List
	Private Img_RotatePic As ImageView
	Private btnMenuGroup As Button
	Private sidemenu As SlidingMenu
	Dim HLVGoroohKala As Hitex_LayoutView
	Private pnlGroup As Panel
	Private lblBackGroup As Label
	Private lblTitile As Label
	Dim SearchNumber As String=0
	Private SwSearchNumber As ACSwitch
	Private LblGift As Label
	Private LblGiftCount As Label
	Private lblSumKhales As Label
	Private LblMandeEtebar As Label
	Dim lstEshantionGroup As List
	Dim lstEshantionGroupTable As List
	Private PnlEshantion As Panel
	Dim Table1 As Table
	Private PnlTableEshantion As Panel
	Dim Utils As Hitex_Utils
	
	Private LblSumFactor As Label
	Private LblSumTakhfif As Label
	Private SwArzeshAfzodeEnable As ACSwitch
	Private lblDarsadArzeshAfzode As Label
	Private lblArzeshAfzode As Label
	
	Private LblSumKolBadAzTakhfif As Label
	Private Panel9 As Panel
	Private BtnShowSumFilterPnl As Label
	Private Label8 As Label
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Activity.LoadLayout("L_KalaDefault_2")
	Try
		If FirstTime Then
			FeeTip=0
			MCode.feeTip=0
		End If
'		If MCode.PicOnline=0 Then
'			SwPic.Visible=False
'		End If
'		 GetLinkFtp
		sidemenu.Initialize("sidmenu")
		sidemenu.Menu.LoadLayout("groupkalamenulyr")
		sidemenu.Mode=sidemenu.LEFT
		sidemenu.BehindOffset=33%x
		HLVGoroohKala.Initializer("HLVGoroohKala").ListView.Build
		pnlGroup.AddView(HLVGoroohKala,1%x,1%y,65%x,87%y)
		'LblMandeEtebar.Visible=False
		lstSelectedCodeGroupKala.Initialize
		lstGroup1.Initialize
		lstGroup2.Initialize
		't_search.Initialize("t_search",500)
		HLV.Initializer("HLV").ListView.Build
		pnl_HLV.AddView(HLV,0,0,100%x,pnl_HLV.Height)
		Key.Initialize("Key")
		Key.SetCustomFilter(txtFee,txtFee.INPUT_TYPE_NUMBERS,"0123456789")
		Key.SetCustomFilter(txtDarsadTakhfif,txtDarsadTakhfif.INPUT_TYPE_NUMBERS,"0123456789")
		If MCode.Action="SabtFaktor" Then
			MCode.page = "KalaDefault"
			lblTitile.Text="انتخاب کالا"
		End If
		If MCode.Action="SabtMarjooii" Then
			MCode.page = "SabtMarjooii"
			lblTitile.Text="ثبت مرجوعی"
		End If
		
		If MCode.ArzeshAfzodeEnable=1 Then
			SwArzeshAfzodeEnable.Checked=True
			lblDarsadArzeshAfzode.Text=$" ارزش افزوده: ${MCode.ArzeshAfzode} %"$
			lblArzeshAfzode.Text="مبلغ ارزش افزوده: 0"
		Else
			SwArzeshAfzodeEnable.Checked=False
			lblDarsadArzeshAfzode.Text="ارزش افزوده: 0 %"
			lblArzeshAfzode.Text="مبلغ ارزش افزوده: 0"
		End If
		
		'gps.Initialize("gps")
		Dialog.Initialize (Activity)
		ListGoroohKala1.Initialize
		OriginalListGoroohKala1.Initialize
		
		ListGoroohKala2.Initialize
		OriginalListGoroohKala2.Initialize
			
		ListGroohKala.Initialize
		lstEshantionGroup.Initialize 
		lstEshantionGroupTable.Initialize 
		NiceSpinner.Initialize("NiceSpinner")
		NiceSpinner.TextColor = Colors.Black
		NiceSpinner.Gravity = Gravity.CENTER_HORIZONTAL
		NiceSpinner.Typeface = Typeface.LoadFromAssets("IRANSansMobile_Medium.ttf")
		PnlSpGroup.AddView(NiceSpinner,B4XComboBox1.mBase.Left,B4XComboBox1.mBase.top,B4XComboBox1.mBase.Width,B4XComboBox1.mBase.Height)
		B4XComboBox1.cmbBox.DropdownTextColor=Colors.Black
		Dim op As ColorDrawable
		op.Initialize2(Colors.White,8dip,2dip,Colors.Black)
		NiceSpinner.Background=op
	
		NiceSpinner1.Initialize("NiceSpinner1")
		NiceSpinner1.TextColor = Colors.Black
		NiceSpinner1.Gravity = Gravity.CENTER_HORIZONTAL
		NiceSpinner1.Typeface = Typeface.LoadFromAssets("IRANSansMobile_Medium.ttf")
		PnlSpGroup.AddView(NiceSpinner1,B4XComboBox2.mBase.Left,B4XComboBox2.mBase.top,B4XComboBox2.mBase.Width,B4XComboBox2.mBase.Height)
		
		Dim op1 As ColorDrawable
		op1.Initialize2(Colors.White,8dip,2dip,Colors.Black)
		NiceSpinner1.Background=op1
		lstGroup2.Add("همه گروه ها")
		NiceSpinner1.attachDataSource(lstGroup2)
		
		
	
		OrginalListKala.Initialize
		ListKalaSp.Initialize
		ListKalaTxt.Initialize
	
		LoadAcSpGroohKala
		LoadListGoroohKala
		th.Initialise("th")
		HLVGoroohKala.CardView.BackgroundColor(0x8aacc8)
		HLVGoroohKala.Ripple.Color(0x8aacc8)
		HLVGoroohKala.CardView.CardElevation(0dip).Radius(4dip)
		
		
		HLVGoroohKala.Show
	
'	HLV.Ripple.Color(0xFF909090)
'	HLV.CardView.CardElevation(8dip).Radius(8dip)
		HLV.Show
'		BtnShowFilterPnl_Click
'	Dim Cu As Cursor = MCode.Result("Select FldTipFee From TblAshkhas Where FldC_Ashkhas = '"& MCode.CodeMoshtari &"'")
'	If Cu.RowCount>0 Then
'		Cu.Position=0
'		FeeTip = Cu.GetString("FldTipFee")
'	Else
'		FeeTip =0
'	End If
	
'	t1.Enabled=True
'	Img_Paging.Visible=True
'	myCode.TextBoxBackColorWhite(TxtSearch)
		ListTasvie.Initialize
		BtnShowSumFilterPnl_Click
		'LoadKala
		If MCode.EshantionGroup=1 Then
			MCode.SaveUpdate("Delete from tblEshantionGroupTemp")
		End If
'	LoadKala
		'btnUpdate_Click
		Log(MCode.page)
		LoadKala
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-Activity_Create")
	End Try
	
End Sub


Private Sub th_Ended(endedOK As Boolean, error As String) 'The thread has terminated. If endedOK is False error holds the reason for failure
	Log("th " & endedOK)
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

Sub btnUpdate_Click
	If MCode.IsConnected Then
		'MCode.page="KalaDefault"
		FirebaseMessaging.mode="GetGalleryKala"
		'StopService(Service_Gps)
'		StopService(FusedLocationService)
		StartService(FirebaseMessaging)
		'ConnectionState
	Else
		LoadKala
	End If
	
End Sub

Sub LoadKala
	Try
	
	Dim str As String=""
	Dim countfilter As Int=0
	Dim filter As Boolean=False
	
		ListTasvie.Clear
		ListTasvie=LoadAcSpNoeTasvie
		LoadNoeTasvie

	Log(GroupCodeSelect1)
	Log(GroupCodeSelect2)
	If GroupCodeSelect1=0 And GroupCodeSelect2=0 Then
		If SwGift.Checked=True Then
			countfilter=countfilter+1
			
					
				If MCode.EshantionGroup=1 Then
					str= str & " and TblKala.fldCodeGroup IN(SELECT tblEshantionGroup.fldCodeGroupKala FROM tblEshantionGroup)"
				Else
					str= str & " and TblKala.fldCodeKala IN(SELECT tblEshantionTabaghati.fldCodeKalaForoosh FROM tblEshantionTabaghati)"
			
				End If
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
			If MCode.NamayeshKalaSefr=0 Then
				countfilter=countfilter+1
				str= str & " and SumMande > '0'"
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
		
'	
'			If TxtSearch.Text.Length>0 And TxtSearch.Text<>" " And TxtSearch.Text<>"" Then
'			Dim Search As String=MCode.ConvertNumbersPersian2English(TxtSearch.Text)
'				If Search="" Then
'					Search=TxtSearch.Text
'				End If
'			countfilter=countfilter+1
'				If IsNumber(Search) And SearchNumber=0 Then
'					If Search.Length>5 Then
'						str = str & $" and (fldSerial = '${Search}') "$
'					Else
'						str = str & $" and (fldCodeKala like '%${Search}%') "$
'				End If
'			
'				Else
'					str = str & $" and (fldNameKala like '%${Search}%') "$
'				End If
'				filter=True
'				If countfilter=1 Then
'					str=str.Replace(" and ","")
'				End If
'			End If

		If filter=True And str<>"" Then
			
			'str=str.Replace(" and ","")
			str="select * from TblKala where "&str&" "&Str_sort
		Else
			str="select * from TblKala  "&Str_sort
		End If
		Log(str)
	End If
	
	If GroupCodeSelect1<>0 And GroupCodeSelect2=0 Then
		If SwGift.Checked=True Then
				countfilter=countfilter+1
				If MCode.EshantionGroup=1 Then
					str= str & " and TblKala.fldCodeGroup IN(SELECT tblEshantionGroup.fldCodeGroupKala FROM tblEshantionGroup)"
				Else
					str= str & " and TblKala.fldCodeKala IN(SELECT tblEshantionTabaghati.fldCodeKalaForoosh FROM tblEshantionTabaghati)"		
				End If
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
	
'			If TxtSearch.Text.Length>0 And TxtSearch.Text<>" " And TxtSearch.Text<>"" Then
'				Dim Search As String=MCode.ConvertNumbersPersian2English(TxtSearch.Text)
'				If Search="" Then
'					Search=TxtSearch.Text
'				End If
'				countfilter=countfilter+1
'				If IsNumber(Search) And SearchNumber=0 Then
'					If Search.Length>5 Then
'						str = str & $" and (fldSerial = '${Search}') "$
'					Else
'						str = str & $" and (fldCodeKala like '%${Search}%') "$
'					End If
'			
'				Else
'					str = str & $" and (fldNameKala like '%${Search}%') "$
'				End If
'				filter=True
'				If countfilter=1 Then
'					str=str.Replace(" and ","")
'				End If
'			End If
		If	filter=True And str<>"" Then
				str="select * from TblKala where fldCodeGroup like '"&GroupCodeSelect1&"%' and "&str&" " &Str_sort
		Else
				str="select * from TblKala where fldCodeGroup like '"&GroupCodeSelect1&"%' " &Str_sort
		
		End If
		
		Log(str)
	End If
	
	If GroupCodeSelect1<>0 And GroupCodeSelect2<>0 Then
		If SwGift.Checked=True Then
				countfilter=countfilter+1
				If MCode.EshantionGroup=1 Then
					str= str & " and TblKala.fldCodeGroup IN(SELECT tblEshantionGroup.fldCodeGroupKala FROM tblEshantionGroup)"
				Else
					str= str & " and TblKala.fldCodeKala IN(SELECT tblEshantionTabaghati.fldCodeKalaForoosh FROM tblEshantionTabaghati)"
			
				End If
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
	
'			If TxtSearch.Text.Length>0 And TxtSearch.Text<>" " And TxtSearch.Text<>"" Then
'				Dim Search As String=MCode.ConvertNumbersPersian2English(TxtSearch.Text)
'				If Search="" Then
'					Search=TxtSearch.Text
'				End If
'				countfilter=countfilter+1
'				If IsNumber(Search) And SearchNumber=0 Then
'					If Search.Length>5 Then
'						str = str & $" and (fldSerial = '${Search}') "$
'					Else
'						str = str & $" and (fldCodeKala like '%${Search}%') "$
'					End If
'			
'				Else
'					str = str & $" and (fldNameKala like '%${Search}%') "$
'				End If
'				filter=True
'				If countfilter=1 Then
'					str=str.Replace(" and ","")
'				End If
'			End If
			'str="select * from TblKala where fldCodeGroup like '"&GroupCodeSelect2&"%' "&str&" "&Str_sort
			If	filter=True And str<>"" Then
				str="select * from TblKala where fldCodeGroup like '"&GroupCodeSelect2&"%' and "&str&" " &Str_sort
			Else
				str="select * from TblKala where fldCodeGroup like '"&GroupCodeSelect2&"%' " &Str_sort	
			End If
		Log(str)
	End If
	FirebaseMessaging.mode="stop"
'	LoadListKala(str)
		th.RunOnGuiThread("LoadListKala",Array As Object(str))
		
		'RefreshLblSabad
			
	Catch
		'ShowLastException
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-LoadKala")
	End Try
End Sub

Sub Activity_Resume
	Try
		If MCode.page="Show_Image2" Then
			If MCode.Action="SabtFaktor" Then
				MCode.page = "KalaDefault"
			End If
			If MCode.Action="SabtMarjooii" Then
				MCode.page = "SabtMarjooii"
			End If
			Return
		End If
		MCode.CreateReportSabad
'		lblSumKhales.Text="مبلغ کل : "& myCode.AdadToPrice(MCode.FinalFaktor.GablePardakht)
		'LblMandeEtebar.Visible=True
		If MCode.ManedEtebarEnable Then
			LblMandeEtebar.Text="مانده اعتبار : " & myCode.AdadToPrice(MCode.MandeEtebar)
			'LblMandeEtebar.Visible=True
		Else
			LblMandeEtebar.Text="مانده اعتبار : 0"
			'LblMandeEtebar.Visible=False
		End If
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
		LoadKala		
		RefreshLblSabad
		MojavezSefaresh
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-Activity_Resume")
	End Try
End Sub

Sub Activity_Pause (UserClosed As Boolean)
	
End Sub

Sub LoadListGoroohKala
	'LSVGoroohKala.Clear
	Dim Item1 As AdapterGoroohKala
	Item1.FldC_Gorooh= 0
	Item1.FldN_Gorooh= "همه گروه ها"
	OriginalListGoroohKala2.Add(Item1)
	Dim Dt As Cursor = MCode.Result("Select FldC_Gorooh,FldN_Gorooh From TblGoroohKala where Length(FldC_Gorooh) = 3 ORDER BY FldC_Gorooh")
	For i=0 To Dt.RowCount-1
		Dt.Position=i
		Dim Item As AdapterGoroohKala
		Item.FldC_Gorooh= Dt.GetString("FldC_Gorooh")
		Item.FldN_Gorooh= Dt.GetString("FldN_Gorooh")
		OriginalListGoroohKala2.Add(Item)
'		LSVGoroohKala.AddSingleLine2(Item.FldN_Gorooh,i)
	Next
	
	ListGoroohKala2 = OriginalListGoroohKala2

End Sub

Sub LoadAcSpGroohKala
	Try
		lstGroup1.Add("همه گروه ها")
		Dim Dt1 As Cursor = MCode.Result("Select FldC_Gorooh,FldN_Gorooh From TblGoroohKala")
		For i=0 To Dt1.RowCount-1
			Dt1.Position=i
			
			Dim sizeCode As Long=Dt1.GetString("FldC_Gorooh").Length
			If sizeCode=3 Then
				Dim Item As AdapterGoroohKala
				Item.FldC_Gorooh= Dt1.GetString("FldC_Gorooh")
				Item.FldN_Gorooh= Dt1.GetString("FldN_Gorooh")
				OriginalListGoroohKala1.Add(Item)
				lstGroup1.Add(Item.FldN_Gorooh)
			Else
				Dim code As String=Dt1.GetString("FldC_Gorooh").SubString2(0,3)
				Dim count As Long
				Dim MinCode As String =MCode.SingleResult("Select min(FldC_Gorooh) From TblGoroohKala where FldC_Gorooh Like '"& code &"%'")
				For Each a As AdapterGoroohKala In OriginalListGoroohKala1
					If a.FldC_Gorooh.SubString2(0,3)=code Then
						count=1
						Exit
					End If
				Next
				If count =0 Then
					Dim NameGroup,CodeGroup As String
					CodeGroup=MinCode
					NameGroup=MCode.SingleResult("Select FldN_Gorooh From TblGoroohKala where FldC_Gorooh='"& MinCode &"'")
					Dim Item As AdapterGoroohKala
					Item.FldC_Gorooh= CodeGroup
					Item.FldN_Gorooh= NameGroup
					OriginalListGoroohKala1.Add(Item)
					lstGroup1.Add(Item.FldN_Gorooh)
				End If
			End If
		Next
		
		
		NiceSpinner.attachDataSource(lstGroup1)
		NiceSpinner.SelectedTextColor = Colors.blue
'		HLVGoroohKala.notifyDataSetChanged
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-LoadAcSpGroohKala")
	End Try
End Sub

Sub LoadGoroohKalaBack(Code As String)
	Dim C_Gorooh As String = MCode.Sf.Left(Code,Code.Length-6)
	Dim Count As Int = C_Gorooh.Length + 3
	Dim Dt As Cursor=MCode.Result("Select FldC_Gorooh,FldN_Gorooh From TblGoroohKala where FldC_Gorooh Like '"& C_Gorooh &"%' And Length(FldC_Gorooh) = "& Count &" ORDER BY FldC_Gorooh")
	If Dt.RowCount>0 Then
		OriginalListGoroohKala2.Clear
		Dim Item1 As AdapterGoroohKala
		Item1.FldC_Gorooh= 0
		Item1.FldN_Gorooh= "همه گروه ها"
		OriginalListGoroohKala2.Add(Item1)
		For i=0 To Dt.RowCount-1
			Dt.Position=i
			Dim Item As AdapterGoroohKala
			Item.FldC_Gorooh= Dt.GetString("FldC_Gorooh")
			Item.FldN_Gorooh= Dt.GetString("FldN_Gorooh")
			OriginalListGoroohKala2.Add(Item)
			MCode.C_LayeKala=Item.FldC_Gorooh
		Next
		ListGoroohKala2 = OriginalListGoroohKala2
		HLVGoroohKala.notifyDataSetChanged
	End If
	LoadKala
End Sub

Sub HLVGoroohKala_onCreateViewHolder (Parent As Panel, ViewType As Int)
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

Sub HLVGoroohKala_ItemClick (ClickedItem As Panel, Position As Int)
	LoadGoroohKalaGo(Position)
	sidemenu.HideMenus
End Sub

Sub HLVGoroohKala_GetItemCount As Int
	Return ListGoroohKala2.Size
End Sub



Sub HLVGoroohKala_onBindViewHolder (Parent As Panel, Position As Int)
	Dim Item = ListGoroohKala2.Get(Position) As AdapterGoroohKala
	Dim LblSharh As Label  = Parent.getview(0)
	LblSharh.Text = Item.FldN_Gorooh
	Parent.Elevation=1dip
	Parent.Height = 9%y
End Sub
'
Sub LoadGoroohKalaGo(Position As Int)
	Sleep(100)
	Dim Item = ListGoroohKala2.Get(Position) As AdapterGoroohKala
	GroupCodeSelect1=Item.FldC_Gorooh

	Dim Count As Int = Item.FldC_Gorooh.Length + 3
	Dim Dt As Cursor=MCode.Result("Select FldC_Gorooh,FldN_Gorooh From TblGoroohKala where FldC_Gorooh Like '"& Item.FldC_Gorooh &"%' And Length(FldC_Gorooh) = "& Count &" ORDER BY FldC_Gorooh")
	If Dt.RowCount>0 Then
		lblBackGroup.Visible=True
		ListGoroohKala2.Clear
		OriginalListGoroohKala2.Clear

		For i=0 To Dt.RowCount-1
			Dt.Position=i
			Dim Item As AdapterGoroohKala
			Item.FldC_Gorooh= Dt.GetString("FldC_Gorooh")
			Item.FldN_Gorooh= Dt.GetString("FldN_Gorooh")
			OriginalListGoroohKala2.Add(Item)
			MCode.C_LayeKala=Item.FldC_Gorooh
		Next
		ListGoroohKala2 = OriginalListGoroohKala2
		HLVGoroohKala.notifyDataSetChanged
	End If
	LoadKala
End Sub


Sub LoadListKala(Query As String)
	Try
		
		'MCode.Sql1.Initialize(File.DirDefaultExternal &"/Parsik","parsik_db.db",True)
		'Dim sql As SQL
		'sql.Initialize(File.DirDefaultExternal &"/Parsik","parsik_db.db",False)
		'ModelKala.GetAllKala(Query)
		OrginalListKala.Clear
		Dim Cu As Cursor = MCode.Result(Query)
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
				ItemKala.fldDarsadArzeshAfzodeKala=myCode.Is_Null_adad(Cu.Getstring("fldArzeshAfzode"))
				ItemKala.TedadDarKarton =Cu.Getstring("fldTedadDarKarton")
				
				
				Dim fee As String
				If MCode.feeTip=0 Then
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

				Dim countSabad As String=MCode.SingleResult("select count(FldId) from TblSabad where FldCodeKala="&ItemKala.CodeKala)
				If countSabad>0 Then
					Dim cu1 As Cursor=MCode.Result("select * from TblSabad where FldCodeKala="&ItemKala.CodeKala)
					cu1.Position=0
					FeeTip=MCode.feeTip
					ItemKala.TedadDarSabadJoz =cu1.Getstring("FldTedadDarSabadJoz")
					ItemKala.TedadDarSabadKol =cu1.Getstring("FldTedadDarSabadKol")
					ItemKala.SumMande=Cu.Getstring("SumMande")-cu1.Getstring("FldTedadDarSabadJoz")
					If Cu.Getstring("fldNameVahed2") <> "" Then
						Dim FldFeeForoosh As Int = MCode.Sf.Val(Cu.GetInt("fldFeeForoosh"))
						Dim FldTedadDarKarton As Int = MCode.Sf.Val(cu1.Getstring("FldTedadDarSabadKol"))
						Dim SumMande As Int = Cu.Getstring("SumMande")
						ItemKala.FeeForooshKarton=FldFeeForoosh * FldTedadDarKarton
						ItemKala.SumMandeKarton=Round2( SumMande / FldTedadDarKarton,0)-myCode.Is_Null_adad(ItemKala.TedadDarSabadKol)
					End If
					CmbBox1.SelectedIndex=MCode.feeTip
				If MCode.feeTip=0 Then
						fee=cu1.GetString("FldFeeForoosh")
					Else
						fee=MCode.GetUpdateFeeSabad(fee,ItemKala.CodeKala)
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
						ItemKala.MablaghTakhfif=((fee*cu1.GetString("FldDarsadTakhfif"))/100)
'						ItemKala.MablaghTakhfif=MCode.qomaAshar(ItemKala.MablaghTakhfif)
						txtFee.Text=MCode.qomaAshar(ItemKala.MablaghTakhfif)
						txtDarsadTakhfif.Text=cu1.GetString("FldDarsadTakhfif")
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
						Dim FldFeeForoosh As Int = MCode.Sf.Val(Cu.GetInt("fldFeeForoosh"))
						Dim FldTedadDarKarton As Int = MCode.Sf.Val(Cu.Getstring("fldTedadDarKarton"))
						Dim SumMande As Int = Cu.Getstring("SumMande")
						If FldTedadDarKarton>0 Then
							ItemKala.FeeForooshKarton=FldFeeForoosh * FldTedadDarKarton
'					ItemKala.SumMandeKarton= Round2( SumMande / FldTedadDarKarton,0)
							Dim SumKol As Long=(SumMande / FldTedadDarKarton)-myCode.Is_Null_adad(ItemKala.TedadDarSabadKol)
							ItemKala.SumMandeKarton=SumKol
						Else
							ItemKala.SumMandeKarton=0
						End If
				
					End If
					
					'		,fldDarsadArzeshAfzode,fldArzeshAfzode
					If MCode.UpdateSefaresh Then
						ItemKala.fldDarsadArzeshAfzode=myCode.Is_Null_adad(cu1.Getstring("fldDarsadArzeshAfzode"))
						If ItemKala.fldDarsadArzeshAfzode>0 Then
							ItemKala.fldArzeshAfzode=cu1.Getstring("fldArzeshAfzode")
							SwArzeshAfzodeEnable.Checked=True
						End If
					Else
						If SwArzeshAfzodeEnable.Checked Then
							ItemKala.fldDarsadArzeshAfzode=MCode.ArzeshAfzode
						Else
							ItemSelected.fldDarsadArzeshAfzode=0
						End If
					End If
					
					cu1.Close
				Else
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
						Dim FldFeeForoosh As Int = MCode.Sf.Val(Cu.GetInt("fldFeeForoosh"))
						Dim FldTedadDarKarton As Int = MCode.Sf.Val(Cu.Getstring("fldTedadDarKarton"))
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
		
		ListKalaSp=OrginalListKala
		ListKalaTxt=ListKalaSp
		HLV.notifyDataSetChanged
		Sleep(100)
		'ProgressDialogHide
	Catch
		Log(LastException)
		Log(LastException.Message)
		myCode.SendError(LastException.Message,Activity.Title&"-LoadListKala")
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



Sub RefreshLblSabad
	Try
		Dim countSabad As String = MCode.SingleResult("Select Count(FldId) From TblSabad")
	
		If countSabad>0 Then
			LblBasketCount.Visible=True
			LblBasketCount.Text=countSabad
			MCode.CreateReportSabad
			LblSumTakhfif.Text="مبلغ کل تخفیف : "& myCode.AdadToPrice(MCode.FinalFaktor.TakhfifKol)
			LblSumFactor.Text="مبلغ کل فاکتور : "& myCode.AdadToPrice(MCode.FinalFaktor.KhamFaktor)
			LblSumKolBadAzTakhfif.Text="مبلغ بعد از تخفیف : "& myCode.AdadToPrice(MCode.FinalFaktor.SumKolBadazTahkfif)
			lblSumKhales.Text="مبلغ خالص : "& myCode.AdadToPrice(MCode.FinalFaktor.GablePardakht)
			If MCode.ArzeshAfzodeEnable=1 Then
				lblArzeshAfzode.Text="مبلغ ارزش افزوده : "& myCode.AdadToPrice(MCode.FinalFaktor.fldArzeshAfzode)
			Else
				lblArzeshAfzode.Text="مبلغ ارزش افزوده: 0"
			End If
			If MCode.ManedEtebarEnable Then
				If MCode.FinalFaktor.GablePardakht> MCode.MandeEtebar Then
					lblSumKhales.TextColor=Colors.Red
					ToastMessageShow("جمع مبلغ سفارش از اعتبار مشتری بیشتر میباشد.",True)
				Else
					lblSumKhales.TextColor=Colors.White
				End If
				Else
				lblSumKhales.TextColor=Colors.White
			End If
			
		Else
			LblBasketCount.Visible=False
			lblArzeshAfzode.Text="مبلغ ارزش افزوده: 0"
			LblSumTakhfif.Text="مبلغ کل تخفیف : 0"
			LblSumFactor.Text="مبلغ کل فاکتور : 0"
			lblSumKhales.Text="مبلغ خالص : 0"
			LblSumKolBadAzTakhfif.Text="مبلغ بعد از تخفیف : 0"
			lblSumKhales.TextColor=Colors.White
		End If
		HLV.notifyDataSetChanged
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-RefreshLblSabad")
	End Try
End Sub

'Sub NiceSpinner_ItemClick (Position As Int, Value As Object)
'	'TxtSearch.Text= ""
'	Try
'	Key.HideKeyboard
'
'	
'	If Position = 0 Then
'		ListGroohKala.Clear
'		lstSelectedCodeGroupKala.Clear
'		NiceSpinner1.Clear
'		NiceSpinner1.Add("همه گروه ها")
'		'LoadListKala("Select * From TblKala " & Str_sort)
'		GroupCodeSelect1="0"
'		GroupNameSelect1=""
'		GroupCodeSelect2="0"
'		GroupNameSelect2=""
'		NiceSpinner1.SelectedIndex=0
'	Else
''		NiceSpinner1.Clear
'		Dim lst As List=OriginalListGoroohKala
'		Dim Item As AdapterGoroohKala=lst.Get(NiceSpinner.SelectedIndex-1)
'		Log(Item.FldN_Gorooh)
'		Log(Item.FldC_Gorooh)
'		GroupCodeSelect1=Item.FldC_Gorooh
'		GroupNameSelect1=Item.FldN_Gorooh
'		GroupCodeSelect2="0"
'		GroupNameSelect2=""
'		Dim mc As String=Item.FldC_Gorooh
'		'Dim Cu As Cursor = MCode.Result($"Select FldC_Gorooh,FldN_Gorooh From TblGoroohKala where FldC_Gorooh like '${mc}%' Order By FldC_Gorooh"$)
'		Dim Count As Int = Item.FldC_Gorooh.Length + 3
'		Dim Cu As Cursor=MCode.Result("Select FldC_Gorooh,FldN_Gorooh From TblGoroohKala where FldC_Gorooh Like '"& mc &"%' And Length(FldC_Gorooh) = "& Count &" ORDER BY FldC_Gorooh")
'		If Cu.RowCount>0 Then
'			lstSelectedCodeGroupKala.Clear
'			NiceSpinner1.Clear
'			NiceSpinner1.Add("همه گروه ها")
'			For i=0 To Cu.RowCount-1
'				Cu.Position=i
'				Dim Item As AdapterGoroohKala
'				Item.FldC_Gorooh=Cu.GetString("FldC_Gorooh")
'				Item.FldN_Gorooh=Cu.GetString("FldN_Gorooh")
'				ListGroohKala.Add(Item)
'				NiceSpinner1.Add(Cu.GetString("FldN_Gorooh"))
'			Next
'			NiceSpinner1.Show(Colors.blue, 14)
'			NiceSpinner1.SelectedIndex = 0
'			lstSelectedCodeGroupKala.Add(GroupCodeSelect1)
'		Else
'			ListGroohKala.Clear
'			lstSelectedCodeGroupKala.Clear
'			NiceSpinner1.Clear
'			NiceSpinner1.Add("همه گروه ها")
'			GroupCodeSelect2="0"
'			GroupNameSelect2=""
'			NiceSpinner1.SelectedIndex=0
'		End If
'	End If
''Cu.Close
'	LoadKala
'	Log("CodeGroupSelect1: "&GroupCodeSelect1)
'		Log("postion1: "&Position)
'	Catch
'		Log(LastException)
'		myCode.SendError(LastException,Activity.Title&"-NiceSpinner_ItemClick")
'	End Try
'	'search(True)
'End Sub
'
'Sub NiceSpinner1_ItemClick (Position As Int, Value As Object)
'	Try
'		
'
'	If Position=0 Then
'		
'		GroupCodeSelect2=lstSelectedCodeGroupKala.Get(lstSelectedCodeGroupKala.Size-1)
'	Else
'		Dim lst As List=ListGroohKala
'		Dim Item As AdapterGoroohKala=lst.Get(NiceSpinner1.SelectedIndex-1)
'		GroupCodeSelect2=Item.FldC_Gorooh
'		
'		Dim mc As String=Item.FldC_Gorooh
'			
'		Dim Count As Int = mc.Length + 3
'		Dim Cu As Cursor=MCode.Result("Select FldC_Gorooh,FldN_Gorooh From TblGoroohKala where FldC_Gorooh Like '"& mc &"%' And Length(FldC_Gorooh) = "& Count &" ORDER BY FldC_Gorooh")
'		If Cu.RowCount>0 Then
'			ListGroohKala.Clear
'			NiceSpinner1.Clear
'			'lstSelectedCodeGroupKala.Clear
'			
'			lstSelectedCodeGroupKala.Add(Item.FldC_Gorooh)
'	
'			'NiceSpinner1.Add("برگشت")
'			NiceSpinner1.Add("همه گروه ها")
'			
'			For i=0 To Cu.RowCount-1
'				Cu.Position=i
'				Dim Item As AdapterGoroohKala
'				Item.FldC_Gorooh=Cu.GetString("FldC_Gorooh")
'				Item.FldN_Gorooh=Cu.GetString("FldN_Gorooh")
'				ListGroohKala.Add(Item)
'				NiceSpinner1.Add(Cu.GetString("FldN_Gorooh"))
'			Next
'		
'			NiceSpinner1.Show(Colors.blue, 14)
'			NiceSpinner1.SelectedIndex = 0
'		End If
'			Cu.Close
'	End If
'	
'	LoadKala
'	Log("CodeGroupSelect2: "&GroupCodeSelect2)
'		Log("position2: "&Position)
'	Catch
'		Log(LastException)
'		myCode.SendError(LastException,Activity.Title&"-NiceSpinner1_ItemClick")
'	End Try
'	Sleep(100)
'End Sub

Sub NiceSpinner_item_clicked
	Dim Position As Int=NiceSpinner.SelectedIndex
	Log("ns1 item " & NiceSpinner.SelectedIndex &" selected")
	Log("ns1 item " & NiceSpinner.Text &" selected")
	'TxtSearch.Text= ""
	Try
		Key.HideKeyboard
		'ListGoroohAshkhas.Clear
		If Position = 0 Then
			ListGoroohKala1.Clear
			lstSelectedCodeGroupKala.Clear
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
			Dim lst As List=OriginalListGoroohKala1
			Log(NiceSpinner.SelectedIndex-1)
			Dim index As Int=Position-1
			Dim Item As AdapterGoroohKala=lst.Get(index)
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
'			NiceSpinner1.Clear
				lstGroup2.Clear
'		NiceSpinner1.Add("همه گروه ها")
				lstGroup2.Add("همه گروه ها")
				For i=0 To Cu.RowCount-1
					Cu.Position=i
					Dim Item As AdapterGoroohKala
					Item.FldC_Gorooh=Cu.GetString("FldC_Gorooh")
					Item.FldN_Gorooh=Cu.GetString("FldN_Gorooh")
					ListGoroohKala1.Add(Item)
'				NiceSpinner1.Add(Cu.GetString("FldN_Gorooh"))
					lstGroup2.Add(Cu.GetString("FldN_Gorooh"))
				Next
'			NiceSpinner1.Show(Colors.blue, 14)
				NiceSpinner1.attachDataSource(lstGroup2)
				'NiceSpinner1.SelectedIndex = 0
				lstSelectedCodeGroupKala.Add(GroupCodeSelect1)
			Else
				ListGoroohKala1.Clear
				lstSelectedCodeGroupKala.Clear
'			NiceSpinner1.Clear
				lstGroup2.Clear
'		NiceSpinner1.Add("همه گروه ها")
				lstGroup2.Add("همه گروه ها")
				GroupCodeSelect2="0"
				GroupNameSelect2=""
				'	NiceSpinner1.SelectedIndex=0
			End If
		End If

		LoadKala
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
			If lstSelectedCodeGroupKala.Size>0 Then
				GroupCodeSelect2=lstSelectedCodeGroupKala.Get(lstSelectedCodeGroupKala.Size-1)
			End If
			
		Else
			Dim lst As List=ListGoroohKala1
			Dim Item As AdapterGoroohKala=lst.Get(Position-1)
			GroupCodeSelect2=Item.FldC_Gorooh
		
			Dim mc As String=Item.FldC_Gorooh
			
			Dim Count As Int = mc.Length + 3
			Dim Cu As Cursor=MCode.Result("Select FldC_Gorooh,FldN_Gorooh From TblGoroohKala where FldC_Gorooh Like '"& mc &"%' And Length(FldC_Gorooh) = "& Count &" ORDER BY FldC_Gorooh")
			If Cu.RowCount>0 Then
				ListGoroohKala1.Clear
'			NiceSpinner1.Clear
				'lstSelectedCodeGroupKala.Clear
			
				lstSelectedCodeGroupKala.Add(Item.FldC_Gorooh)
	
				'NiceSpinner1.Add("برگشت")
'			NiceSpinner1.Add("همه گروه ها")
				lstGroup2.Clear
'		NiceSpinner1.Add("همه گروه ها")
				lstGroup2.Add("همه گروه ها")
				
				For i=0 To Cu.RowCount-1
					Cu.Position=i
					Dim Item As AdapterGoroohKala
					Item.FldC_Gorooh=Cu.GetString("FldC_Gorooh")
					Item.FldN_Gorooh=Cu.GetString("FldN_Gorooh")
					ListGoroohKala1.Add(Item)
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
		LoadKala
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
			ListGoroohKala1.Clear
			lstSelectedCodeGroupKala.Clear
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
			Dim lst As List=OriginalListGoroohKala1
			Log(NiceSpinner.SelectedIndex-1)
			Dim index As Int=Position-1
			Dim Item As AdapterGoroohKala=lst.Get(index)
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
'			NiceSpinner1.Clear
				lstGroup2.Clear
'		NiceSpinner1.Add("همه گروه ها")
				lstGroup2.Add("همه گروه ها")
				For i=0 To Cu.RowCount-1
					Cu.Position=i
					Dim Item As AdapterGoroohKala
					Item.FldC_Gorooh=Cu.GetString("FldC_Gorooh")
					Item.FldN_Gorooh=Cu.GetString("FldN_Gorooh")
					ListGoroohKala1.Add(Item)
'				NiceSpinner1.Add(Cu.GetString("FldN_Gorooh"))
					lstGroup2.Add(Cu.GetString("FldN_Gorooh"))
				Next
'			NiceSpinner1.Show(Colors.blue, 14)
				NiceSpinner1.attachDataSource(lstGroup2)
				NiceSpinner1.SelectedIndex = 0
				lstSelectedCodeGroupKala.Add(GroupCodeSelect1)
			Else
				ListGoroohKala1.Clear
				lstSelectedCodeGroupKala.Clear
'			NiceSpinner1.Clear
				lstGroup2.Clear
'		NiceSpinner1.Add("همه گروه ها")
				lstGroup2.Add("همه گروه ها")
				GroupCodeSelect2="0"
				GroupNameSelect2=""
				NiceSpinner1.SelectedIndex=0
			End If
		End If

		LoadKala
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
			GroupCodeSelect2=lstSelectedCodeGroupKala.Get(lstSelectedCodeGroupKala.Size-1)
		Else
			Dim lst As List=ListGoroohKala1
			Dim Item As AdapterGoroohKala=lst.Get(Position-1)
			GroupCodeSelect2=Item.FldC_Gorooh
		
			Dim mc As String=Item.FldC_Gorooh
			
			Dim Count As Int = mc.Length + 3
			Dim Cu As Cursor=MCode.Result("Select FldC_Gorooh,FldN_Gorooh From TblGoroohKala where FldC_Gorooh Like '"& mc &"%' And Length(FldC_Gorooh) = "& Count &" ORDER BY FldC_Gorooh")
			If Cu.RowCount>0 Then
				ListGoroohKala1.Clear
'			NiceSpinner1.Clear
				'lstSelectedCodeGroupKala.Clear
			
				lstSelectedCodeGroupKala.Add(Item.FldC_Gorooh)
	
				'NiceSpinner1.Add("برگشت")
'			NiceSpinner1.Add("همه گروه ها")
				lstGroup2.Clear
'		NiceSpinner1.Add("همه گروه ها")
				lstGroup2.Add("همه گروه ها")
				
				For i=0 To Cu.RowCount-1
					Cu.Position=i
					Dim Item As AdapterGoroohKala
					Item.FldC_Gorooh=Cu.GetString("FldC_Gorooh")
					Item.FldN_Gorooh=Cu.GetString("FldN_Gorooh")
					ListGoroohKala1.Add(Item)
'				NiceSpinner1.Add(Cu.GetString("FldN_Gorooh"))
					lstGroup2.Add(Cu.GetString("FldN_Gorooh"))

				Next
		
'			NiceSpinner1.Show(Colors.blue, 14)
				NiceSpinner1.attachDataSource(lstGroup2)
				NiceSpinner1.SelectedIndex = 0
			End If
		End If
		LoadKala
		Log("CodeGroupSelect2: "&GroupCodeSelect2)
		Log("position2: "&Position)
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-NiceSpinner1_ItemClick")
	End Try
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
		
		Barcode.isportrait = True
		Barcode.useFrontCam = False

		'set the timeoutDuration to a very high value (such as 2000000000) if you dont want it to time out 2000000000 = 63 years
		Barcode.timeoutDuration = 30000

		'change these factors between 0 and 1 to change the size of the viewfinder rectangle
		'the library will limit the minimum size to 240 x 240 pixels and the maximum to (screen width) x (screen height) pixels
		Barcode.theViewFinderXfactor = 0.7
		Barcode.theViewFinderYfactor = 0.5
		Barcode.theFrameColor = Colors.Blue
		Barcode.theLaserColor = Colors.Yellow
		Barcode.theMaskColor = Colors.argb(95, 0, 0, 255)
		Barcode.theResultColor = Colors.Green
		Barcode.theResultPointColor = Colors.Red

		'set the prompt messages
		Barcode.theTopPromptMessage = ""
		Barcode.theTopPromptTextSize = 5%y 'text size
		Barcode.topPromptColor = Colors.Red
		Barcode.topPromptDistanceFromTop = 1%y 'pixel distance from top
  
		Barcode.theBottomPromptMessage = ""
		Barcode.theBottomPromptTextSize = 5%y  'text size
		Barcode.bottomPromptColor = Colors.Blue
		Barcode.bottomPromptDistanceFromBottom = 5%y  'pixel distance from top
		'add a bitmap
		'Barcode.theBitMap = bm
		'Barcode.theBitmapPosition(40%x,10%y,20%x,20%x)
		Barcode.BeginScan("myzx")
	End If
End Sub

Sub myzx_result(atype As String,Value As String, image As Bitmap)
	Try
		LogColor("type:"&atype&"values:"&Value,Colors.red)
		'TxtSearch.Visible=False
		'NumberSearch.Visible=True
		TxtSearch.Text=Value
		BtnSearch.Tag=True
		BtnSearch_Click
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-myzx_result")
	End Try
End Sub
'Sub myzx_result(atype As String,Values As String)
'
'End Sub 
'
'Sub myzx_noscan(atype As String,Values As String)
'  Msgbox(Values,"type:" & atype)
'End Sub

Sub myzx_timedout(timedOut As Boolean)
	Log("timedOut " & timedOut)

End Sub

Sub myzx_usercancelled(userCancelled As Boolean)
	Log("userCancelled " & userCancelled)
End Sub
Sub Img_barcode_Click1
	Dim Result As Boolean = True
	If Not(rp.Check(rp.PERMISSION_CAMERA)) Then
		rp.CheckAndRequest(rp.PERMISSION_CAMERA)
		Wait For Activity_PermissionResult (Permission As String, Result As Boolean)		
	End If
	If Result=False Then
		Return
	Else
	
		Barcode.isportrait = True
		Barcode.useFrontCam = False

		'set the timeoutDuration to a very high value (such as 2000000000) if you dont want it to time out 2000000000 = 63 years
		'Barcode.timeoutDuration = 30000

		'change these factors between 0 and 1 to change the size of the viewfinder rectangle
		'the library will limit the minimum size to 240 x 240 pixels and the maximum to (screen width) x (screen height) pixels
		
		Barcode.theViewFinderXfactor = 0.7
		Barcode.theViewFinderYfactor = 0.5
		Barcode.theFrameColor = Colors.Blue
		Barcode.theLaserColor = Colors.Yellow
		Barcode.theMaskColor = Colors.argb(95, 0, 0, 255)
		Barcode.theResultColor = Colors.Green
		Barcode.theResultPointColor = Colors.Red

		'set the prompt messages
		Barcode.theTopPromptMessage = ""
		Barcode.theTopPromptTextSize = 5%y 'text size
		Barcode.topPromptColor = Colors.Red
		Barcode.topPromptDistanceFromTop = 1%y 'pixel distance from top
  
		Barcode.theBottomPromptMessage = ""
		Barcode.theBottomPromptTextSize = 5%y  'text size
		Barcode.bottomPromptColor = Colors.Blue
		Barcode.bottomPromptDistanceFromBottom = 5%y  'pixel distance from top
		'add a bitmap
		'Barcode.theBitMap = bm
		'Barcode.theBitmapPosition(40%x,10%y,20%x,20%x)
		Barcode.BeginScan("myzx")
	End If
End Sub

Sub myzx_result1(atype As String,Values As String)

End Sub
Sub myzx_noscan1(atype As String,Values As String)
	Msgbox(Values,"type:" & atype)
End Sub
'Sub Img_barcode_Click
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
'	NumberSearch.Visible=True
'	TxtSearch.Visible=False
'	BtnSearch.Tag=True
'End Sub

'Sub myzx_timedout(timedOut As Boolean)
'	Log("timedOut " & timedOut)
'
'End Sub
'
'Sub myzx_usercancelled(userCancelled As Boolean)
'	Log("userCancelled " & userCancelled)
'End Sub

Sub NumberSearch_TextChanged (Old As String, New As String)
	If TxtSearch.Text.StartsWith(" ") Then
		TxtSearch.Text=TxtSearch.Text.SubString(1)
	End If
	TxtSearch.SelectionStart=TxtSearch.Text.Length
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
	
	If IsNumber(New) And SearchNumber=0 Then
		New=MCode.ConvertNumbersPersian2English(New)
		ListKalaTxt = Utils.FilterSearchList("CodeKala",OrginalListKala).Contains(New)
	else If IsNumber(New) And SearchNumber=1 Then
		New=MCode.ConvertNumbersPersian2English(New)
		ListKalaTxt = Utils.FilterSearchList("NameKala",OrginalListKala).Contains(New)
	Else
		ListKalaTxt = Utils.FilterSearchList("NameKala",OrginalListKala).Contains(New)
	End If
	HLV.ScrollToPosition(0)
	HLV.notifyDataSetChanged
	
'	If ListKalaTxt.Size>3000 Then
		
'			Dim div3 As Int=New.Length Mod 3
'			If div3=0 Or New.Length=0 Then
'				LoadKala
'			End If
	
		
	
'			str = str & $" and (fldCodeKala like '%${Search}%') "$
		
'			LoadKala
	
'		Else
'		LoadKala

	
	't_search.Enabled=True
End Sub

'Private Sub t_search_Tick
'	t_search.Enabled=False
'	BtnSearch_Click
'End Sub
Private Sub Img_Paging_Click
	Try
	Act_KalaPaging.listKala=ListKalaTxt
		StartActivity(Act_KalaPaging)
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-Img_Paging_Click")
	End Try
End Sub

Sub BtnCommentExit_Click
	pnlFilter.SetVisibleAnimated(300,False)
End Sub

Sub BtnShowFilterPnl_Click
	Sleep(200)
	If Panel2.Height = Label11.top Then
		Panel2.SetLayoutAnimated(500,Panel2.Left,Panel2.Top,Panel2.Width,LblPoint.top + LblPoint.Height)
		Pnl_Tools.SetLayoutAnimated(500,Pnl_Tools.Left,Panel2.Top + Panel2.Height + 1%y,Pnl_Tools.Width,Pnl_Tools.Height)
		pnl_HLV.SetLayoutAnimated(500,pnl_HLV.Left,Pnl_Tools.Top + Pnl_Tools.Height,pnl_HLV.Width,Pnl_Down.top - 13%y - Pnl_Tools.top + Pnl_Tools.Height)
		HLV.Height=pnl_HLV.Height - 15%y
	Else
		Panel2.SetLayoutAnimated(500,Panel2.Left,Panel2.Top,Panel2.Width,Label11.top)
		Pnl_Tools.SetLayoutAnimated(500,Pnl_Tools.Left,Pnl_Top.Top + Pnl_Top.Height,Pnl_Tools.Width,Pnl_Tools.Height)
		pnl_HLV.SetLayoutAnimated(500,pnl_HLV.Left,Pnl_Tools.Top + Pnl_Tools.Height,pnl_HLV.Width,Pnl_Down.top - Pnl_Tools.top + Pnl_Tools.Height)
		HLV.Height=pnl_HLV.Height - 28%y
	End If
	Sleep(200)
End Sub

Private Sub BtnShowSumFilterPnl_Click
	Sleep(200)

	Log("top1: "& Panel9.Top)
	Log("Height1: "& Panel9.Height)


	Dim t1,h1 As Int
	Dim t2,h2 As Int
	
	
	If Panel9.Top=75%y Then
		'1
		
		t1=75%y '2
		h1=19%y '2
		
		t2=88%y '1
		h2=6%y '1
		
		BtnShowSumFilterPnl.Text=Chr(0xF139)
		
	Else If Panel9.Top=88%y Then
		'2
		t1=88%y '1
		h1=6%y '1
		
		t2=75%y '2
		h2=19%y '2
		
		BtnShowSumFilterPnl.Text=Chr(0xF13A)
	End If
	
	Panel9.SetLayoutAnimated(500,Panel9.Left,t1,Panel9.Width,h1)
	Panel9.SetLayoutAnimated(500,Panel9.Left,t2,Panel9.Width,h2)
	pnl_HLV.SetLayoutAnimated(500,pnl_HLV.Left,pnl_HLV.Top,pnl_HLV.Width, Panel9.top-25%y)
	HLV.SetLayoutAnimated(500,HLV.Left,HLV.Top,HLV.Width, Panel9.top-25%y)
	Log("top2: "& Panel9.Top)
	Log("Height2: "& Panel9.Height)



	Sleep(200)
End Sub

'Sub BtnCommentOK_Click
'	pnlFilter.SetVisibleAnimated(300,False)
'End Sub

Sub btn_Back_Click
'	StartActivity(Act_DontSefaresh)
	Dim Cu1 As Cursor = MCode.Result("Select * From TblSabad")
	If Cu1.RowCount>0 Then
		Dim Res As Int = Msgbox2("با خارج شدن از این صفحه، سبد خرید شما خالی میشود. آیا از این صفحه خارج می شوید؟","توجه","بله","","خیر",Null)
		If Res = DialogResponse.POSITIVE Then
			MCode.SaveUpdate("delete from TblSabad")
			If MCode.EshantionGroup=1 Then
				MCode.SaveUpdate("Delete from tblEshantionGroupTemp")
			End If
			close
		End If
	Else
		close
	End If

End Sub
Sub close
	MCode.lstChangeFeeKala.Clear
	FeeTip=0
	MCode.isAmani=0
	MCode.feeTip=0
	MCode.C_Tafzili=0
	MCode.C_LayeKala=""
	MCode.MandeEtebar=0
	MCode.ManedEtebarEnable=False
	CallSub(ImageDownloader, "ActivityIsPaused")
	Activity.Finish
End Sub
Sub Activity_KeyPress (KeyCode As Int) As Boolean 'Return True to consume the event
	If KeyCode=KeyCodes.KEYCODE_ENTER Then
		If TxtSearch.RequestFocus Then
			BtnSearch_Click
		End If
		Return True
	End If
	If KeyCode=KeyCodes.KEYCODE_BACK Then
		If sidemenu.Visible Then
			If MCode.C_LayeKala.Length > 3 Then
				LoadGoroohKalaBack(MCode.C_LayeKala)
				Return True
			Else
				sidemenu.HideMenus
				Return True
			End If
			
		End If
		If PnlFee.Visible Then
			btnClose_Click
			Return True
		End If
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
Try
	
	Dim Lst As List = Array As String("کد کالا","کد گروه","نام کالا نزولی","نام کالا صعودی","ارزان ترین قیمت","گرانترین قیمت","کمترین موجودی","بیشترین موجودی")
	Dim res As Int = InputList(Lst,"مرتب سازی براساس:",-1)
	Select Case res
		Case 0
			Str_sort = " Order by fldCodeKala Asc"
		Case 1
				Str_sort = " Order by fldCodeGroup Asc"
		Case 2
			Str_sort = " Order by fldNameKala"
		Case 3
			Str_sort = " Order by fldNameKala Desc"
		Case 4
			Str_sort = " Order by fldFeeForoosh"
		Case 5
			Str_sort = " Order by fldFeeForoosh Desc"
		Case 6
			Str_sort = " Order by SumMande"
		Case 7
			Str_sort = " Order by SumMande Desc"
	End Select
	Log(Str_sort)
'	search(AcSwGift.Value)
		LoadKala
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-Img_sort_Click")
	End Try
	'str= str & " and SumMande > '0'"
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
	LoadKala
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
		myCode.SendError(LastException,Activity.Title&"-Img_sort_Click")
		Return Null
	End Try
End Sub
Sub Img_TipFee_Click
	Dim Lst As List
	Lst.Initialize	
'	Dim Cu As Cursor = MCode.Result("Select * From TblTasvie")
'	If Cu.RowCount>0 Then
'		Dim SomeArray(Cu.RowCount+1) As String
'		SomeArray(0)="انتخاب کنید"
'		For i = 0 To Cu.RowCount-1
'			Cu.Position=i
'			SomeArray(i+1)=Cu.GetString("FldName")
'		Next
		Lst.Initialize2(MCode.ArrayTasvieForKala)
		InputListAsync(Lst,"تیپ قیمت را انتخاب کنید",FeeTip,True)
		Wait For InputList_Result (Result As Int)
		If Result <> -3 Then
			Dim Res As Int=Msgbox2("توجه داشته باشید که با تغییر تیپ قیمت سبد خرید شما حذف می گردد، آیا می خواهید تیپ قیمت تغییر کند؟","توجه","بله","","خیر",Null)
			If Res = DialogResponse.POSITIVE Then
				'RefreshLblSabad
				If Result=0 Then
					FeeTip = 0
					MCode.feeTip=0					
					MCode.feeCode=0
					LoadKala
				Else
					Dim ItemTasvie As AdapterListNoeTasvie
					ItemTasvie.Initialize
					ItemTasvie=ListTasvie.Get(FeeTip)
					FeeTip = Result
					MCode.feeTip=Result
					MCode.feeCode=ItemTasvie.FldC_Tasvie
					Log("Fee: "&Result)
					'btnUpdate_Click
					UpdateFee
				End If
				
				
				'LoadKala
			End If
		End If
'	End If

End Sub

'Sub UpdateFee2(CodeTasvie As String)
'	
'End Sub

Sub UpdateFee
'	If MCode.check_internet Then
'		Log("UpdateFee Online")
'		MCode.page="KalaDefault"
'		FirebaseMessaging.mode="GetUpdateFee"
'		'StopService(Service_Gps)
''		StopService(FusedLocationService)
'		StartService(FirebaseMessaging)
'	Else
		Log("UpdateFee Offline")
		UpdateFeeOffline
'	End If
'	Log("UpdateFee Offline")
	Sleep(200)
	
	
End Sub




Sub UpdateFeeOffline
	If IsNumber(MCode.feeCode) And MCode.feeCode>0 Then
		Dim cu As Cursor
		cu=MCode.Result("select * from TblFee where FldCodeTasvie=" & MCode.feeCode)
		If cu.RowCount>0 Then
			For i=0 To cu.RowCount-1
				cu.Position=i
				Log("FldCodeKala:"& cu.GetString("FldCodeKala"))
				Log("fldFeeTasvie:"& cu.GetString("FldFee"))
				MCode.SaveUpdate("Update TblKala Set fldFeeTasvie='"&cu.GetString("FldFee")&"'"& _
			" where fldCodeKala="& cu.GetString("FldCodeKala"))
			Next
			LoadKala
		End If
	End If
End Sub
'Sub btn_edit_Price_Click(Item As AdapterListKala)
'	Try
'	Dim input As B4XInputTemplate
'	input.Initialize
'	input.lblTitle.Text = "قیمت جدید:"
'	input.ConfigureForNumbers(True, True)
'	
'	Dim rs As ResumableSub = Dialog.ShowTemplate(input, "OK", "", "CANCEL")
'	
'	Dialog.Base.Top = 50%y - Dialog.Base.Height / 2
'	Wait For (rs) Complete (Result As Int)
'	If Result = XUI.DialogResponse_Positive Then
'		If input.Text="" Then input.Text=0
'		Dim res As Float = input.Text 'no need to check with IsNumber
''		If Item.FeeForoosh<res Then
''			ToastMessageShow("مبلغ تخفیف نمیتواند بیشتر از فی فروش باشد",True)
''			Return
''		End If
'		
'			Item.FeeForoosh=res
'				
'			If Item.MablaghTakhfif>0 Then
'				Item.fldFeeBadAzTakhfif=res-Item.MablaghTakhfif
'				Else
'				Item.fldFeeBadAzTakhfif=0
'			End If
'			'MCode.UpdateNoeTasvieDarSabad(FeeTip,Item)
''		MCode.SaveUpdate("Update TblKala Set FldFee='"&res&"' where FldC_Kala = '"& Item.FldC_Kala &"'")
'		'HLV.notifyDataSetChanged
'			MCode.UpdateFeeSabad(res,Item.CodeKala)
'			RefreshLblSabad
'			LoadKala
''		LblFee.Text = NumberFormat(Item.FldFee,1,3) & " " & MCode.VahedPool
'		End If
'	Catch
'		Log(LastException)
'		myCode.SendError(LastException,Activity.Title&"-btn_edit_Price_Click")
'		
'	End Try
'End Sub

Private Sub btnClose_Click
	PnlFee.Visible=False
	MCode.AnimationClose(PnlFee)
	'FeeType=""
	txtFee.Text="0"
	txtDarsadTakhfif.Text="0"
End Sub

Private Sub txtFee_TextChanged (Old As String, New As String)
	Try
		Dim no As Long
		If MCode.ConvertNumbersPersian2English(Old) <> MCode.ConvertNumbersPersian2English(New) Then
			Try
				no = txtFee.Text.Replace(",","")
				txtchanged=True
				Log(no)
			Catch
				no=0
				txtFee.Text=""
				If FeeType="btn_discount_Click" Then
					txtDarsadTakhfif.Text=""
				End If
			End Try
		End If
		If txtchanged Then
			txtchanged=False
			txtFee.Tag=no
			txtFee.Text=NumberFormat2(no,0,0,0,True)
		End If
		txtFee.SetSelection(txtFee.Text.Length,0)
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-txtFee_TextChanged")
	End Try
End Sub

Private Sub btnSaveFee_Click
	Select FeeType
		Case "btn_edit_Price_Click"
			If txtFee.Text="" Then txtFee.Text=0
			Dim res As Long = MCode.RemoveqomaAshar(txtFee.Text) 		
			ItemSelected.FeeForoosh=res
			
			If myCode.Is_Null_adad(ItemSelected.fldDarsadTakhfif)>0 Then
				Dim tedadKol1 As String=myCode.Is_Null_adad(ItemSelected.TedadDarSabadJoz)+(myCode.Is_Null_adad(ItemSelected.TedadDarSabadKol)*myCode.Is_Null_adad(ItemSelected.TedadDarKarton))
				Dim FeeKol As String=(ItemSelected.FeeForoosh*tedadKol1)
				If tedadKol1>0 Then
					ItemSelected.MablaghTakhfif=(((ItemSelected.FeeForoosh*tedadKol1)*ItemSelected.fldDarsadTakhfif)/100)
					ItemSelected.fldFeeBadAzTakhfif=FeeKol-ItemSelected.MablaghTakhfif
				Else
					If myCode.Is_Null_adad(ItemSelected.fldDarsadTakhfif)>0 Then
						ItemSelected.MablaghTakhfif=(((ItemSelected.FeeForoosh)*ItemSelected.fldDarsadTakhfif)/100)
						ItemSelected.fldFeeBadAzTakhfif=ItemSelected.FeeForoosh-ItemSelected.MablaghTakhfif
					End If
				End If
			End If
'			If ItemSelected.MablaghTakhfif>0 Then
'				ItemSelected.fldFeeBadAzTakhfif=res-ItemSelected.MablaghTakhfif
'			Else
'				ItemSelected.fldFeeBadAzTakhfif=0
'			End If
			MCode.UpdateFeeSabad2(ItemSelected)
			RefreshLblSabad
			'LoadKala
			HLV.notifyDataSetChanged
		Case "btn_discount_Click"
			If txtFee.Text="" Then txtFee.Text=0
			Dim res As Long =  MCode.RemoveqomaAshar(txtFee.Text)
			Dim tedadKol As Int =ItemSelected.TedadDarSabadJoz+(ItemSelected.TedadDarSabadKol*ItemSelected.TedadDarKarton) 
			If ItemSelected.FeeForoosh<res And tedadKol<2 Then
				ToastMessageShow("مبلغ تخفیف نمیتواند بیشتر از فی فروش باشد",True)
				Return
			End If
'			If ItemSelected.fldFeeBadAzTakhfif>0 And ItemSelected.fldFeeBadAzTakhfif<res Then
'				ToastMessageShow("مبلغ تخفیف نمیتواند بیشتر از فی بعد از تخفیف باشد",True)
'				Return
'			End If
			'If FeeTip>0 Then
		
			'End If
			Dim feefeebadaztakhfifKala As Int=MCode.SingleResult($"SELECT fldFeeBadAzTakhfif FROM TblKala WHERE fldCodeKala='${ItemSelected.CodeKala}'"$)
			Dim feebadaztakhfif As Int=ItemSelected.fldFeeBadAzTakhfif	
			If txtDarsadTakhfif.Text=100 Then
				ItemSelected.fldFeeBadAzTakhfif=0
			Else 
				If res>0 And feebadaztakhfif=0 Then
				ItemSelected.fldFeeBadAzTakhfif=(ItemSelected.FeeForoosh*tedadKol)-res
				ToastMessageShow("تخفیف با موفقیت اعمال شد ، جهت انصراف از تخفیف مبلغ تخفیف را صفر وارد نمایید.",True)
				Else If res>0 And feebadaztakhfif>0 Then
					ItemSelected.fldFeeBadAzTakhfif=feebadaztakhfif-res
					ToastMessageShow("تخفیف با موفقیت اعمال شد ، جهت انصراف از تخفیف مبلغ تخفیف را صفر وارد نمایید.",True)
				Else if res=0 And feebadaztakhfif=0 Then
					ItemSelected.fldFeeBadAzTakhfif=res
					ItemSelected.MablaghTakhfif=res
				Else if res=0 And feefeebadaztakhfifKala=0 Then
					ItemSelected.fldFeeBadAzTakhfif=0
				Else if res=0 And feebadaztakhfif>0 Then
				
					ItemSelected.fldFeeBadAzTakhfif=feebadaztakhfif
				Else if res=0 Then
					ItemSelected.fldFeeBadAzTakhfif=0
				End If
			End If
			ItemSelected.MablaghTakhfif=res
			ItemSelected.fldDarsadTakhfif=myCode.Is_Null_adad(txtDarsadTakhfif.Text)
			If FeeTip>0 Then
				FeeTip=FeeTip-1
			End If
			MCode.UpdateNoeTasvieDarSabad(FeeTip,ItemSelected)
			RefreshLblSabad
			HLV.notifyDataSetChanged
	End Select
	
	btnClose_Click
End Sub
Sub btn_edit_Price_Click(Item As AdapterListKala)
	Try
		PnlDarsadTakhfif.Visible=False
		FeeType="btn_edit_Price_Click"
		ItemSelected=Item
		lblTitle.Text="قیمت جدید را وارد کنید"
		txtFee.Hint="مبلغ را وارد نمایید"
		PnlFee.Visible=True
		MCode.AnimationOpen(PnlFee)
		
		
		
'		Dim input As B4XInputTemplate
'		input.Initialize	
'		input.lblTitle.Text = "قیمت جدید:"
'		input.ConfigureForNumbers(True, True)
'	
'		Dim rs As ResumableSub = Dialog.ShowTemplate(input, "OK", "", "CANCEL")
'	
'		Dialog.Base.Top = 50%y - Dialog.Base.Height / 2
'		Wait For (rs) Complete (Result As Int)
'		If Result = XUI.DialogResponse_Positive Then
'			If input.Text="" Then input.Text=0
'			Dim res As Float = input.Text 'no need to check with IsNumber
''		If Item.FeeForoosh<res Then
''			ToastMessageShow("مبلغ تخفیف نمیتواند بیشتر از فی فروش باشد",True)
''			Return
''		End If
'		
'			Item.FeeForoosh=res
'				
'			If Item.MablaghTakhfif>0 Then
'				Item.fldFeeBadAzTakhfif=res-Item.MablaghTakhfif
'			Else
'				Item.fldFeeBadAzTakhfif=0
'			End If
'			'MCode.UpdateNoeTasvieDarSabad(FeeTip,Item)
''		MCode.SaveUpdate("Update TblKala Set FldFee='"&res&"' where FldC_Kala = '"& Item.FldC_Kala &"'")
'			'HLV.notifyDataSetChanged
'			MCode.UpdateFeeSabad(res,Item.CodeKala)
'			RefreshLblSabad
'			LoadKala
''		LblFee.Text = NumberFormat(Item.FldFee,1,3) & " " & MCode.VahedPool
'		End If
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-btn_edit_Price_Click")
		
	End Try
End Sub
Sub input_TextChanged (Old As String, New As String)
	Log(Old)
End Sub

Sub DisableArzeshAfzode(Item As AdapterListKala,SwDisableArzeshAfzode As ACSwitch)
	'TxtSearch.Text=Item.CodeKala
	Try
		If SwDisableArzeshAfzode.Checked=False Then
			If myCode.Is_Null_adad(Item.fldDarsadArzeshAfzodeKala) =0 And MCode.ArzeshAfzodeEnable=1 Then
				Item.fldDarsadArzeshAfzodeKala=myCode.Is_Null_adad(MCode.ArzeshAfzode)
			End If
			SwDisableArzeshAfzode.Tag=Item.fldDarsadArzeshAfzodeKala
			Item.fldDarsadArzeshAfzodeKala=0
			Item.fldArzeshAfzodeKala=0
			MCode.SaveUpdate($"Update TblSabad Set fldArzeshAfzode='0',fldDarsadArzeshAfzode='0' where FldCodeKala='${Item.CodeKala}'"$)
		Else
			Item.fldDarsadArzeshAfzodeKala=SwDisableArzeshAfzode.Tag
		
			Dim tedadKol As String=myCode.Is_Null_adad(Item.TedadDarSabadJoz)+(myCode.Is_Null_adad(Item.TedadDarSabadKol)*myCode.Is_Null_adad(Item.TedadDarKarton))
			Dim FeeKol As String=(Item.FeeForoosh*tedadKol)
			If myCode.Is_Null_adad(Item.fldDarsadArzeshAfzodeKala)>0 And SwDisableArzeshAfzode.Checked Then
				Item.fldArzeshAfzodeKala=myCode.Is_Null_adad(MCode.MohasbeArzeshAfzodeKala(FeeKol,Item.fldDarsadArzeshAfzodeKala))
				If Item.fldArzeshAfzodeKala>0 Then
'				LblArzeshAfzodeKala.Text="مبلغ ارزش افزوده: "& myCode.AdadToPrice(Item.fldArzeshAfzodeKala)
					FeeKol=FeeKol+Item.fldArzeshAfzodeKala
				End If
			Else
'			LblArzeshAfzodeKala.Text="مبلغ ارزش افزوده: "& myCode.Is_Null_adad(Item.fldArzeshAfzodeKala)
			End If
			MCode.SaveUpdate($"Update TblSabad Set fldArzeshAfzode='${Item.fldArzeshAfzodeKala}',fldDarsadArzeshAfzode='${Item.fldDarsadArzeshAfzodeKala}' where FldCodeKala='${Item.CodeKala}'"$)
			SwDisableArzeshAfzode.Tag=0
		
		End If
		ItemSelected=Item
	
'	HLV.notifyDataSetChanged
		RefreshLblSabad
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-DisableArzeshAfzode")
	End Try

End Sub


Sub btn_discount_Click(Item As AdapterListKala)
	Try
		PnlDarsadTakhfif.Visible=True
		FeeType="btn_discount_Click"
		ItemSelected=Item
		lblTitle.Text="مبلغ تخفیف را وارد کنید"
		txtFee.Hint="مبلغ را وارد نمایید"
		PnlFee.Visible=True
		MCode.AnimationOpen(PnlFee)
		
		
		
'	Dim input As B4XInputTemplate
'	input.Initialize
'	input.lblTitle.Text = "تخفیف:"
'	input.ConfigureForNumbers(True, True)
'	Dim rs As ResumableSub = Dialog.ShowTemplate(input, "OK", "", "CANCEL")
'	Dialog.Base.Top = 50%y - Dialog.Base.Height / 2
'	Wait For (rs) Complete (Result As Int)
'	If Result = XUI.DialogResponse_Positive Then
'		If input.Text="" Then input.Text=0
'		Dim res As Float = input.Text 'no need to check with IsNumber
'		If Item.FeeForoosh<res Then
'			ToastMessageShow("مبلغ تخفیف نمیتواند بیشتر از فی فروش باشد",True)
'			Return
'		End If
'		If Item.fldFeeBadAzTakhfif>0 And Item.fldFeeBadAzTakhfif<res Then
'			ToastMessageShow("مبلغ تخفیف نمیتواند بیشتر از فی بعد از تخفیف باشد",True)
'			Return
'		End If
'		'If FeeTip>0 Then
'		
'		'End If		
'		Dim feebadaztakhfif As Int=Item.fldFeeBadAzTakhfif
'		If res>0 And feebadaztakhfif=0 Then	
'			Item.fldFeeBadAzTakhfif=Item.FeeForoosh-res	
'			ToastMessageShow("تخفیف با موفقیت اعمال شد ، جهت انصراف از تخفیف مبلغ تخفیف را صفر وارد نمایید.",True)
'		else If res>0 And feebadaztakhfif>0 Then
'			Item.fldFeeBadAzTakhfif=feebadaztakhfif-res
'			ToastMessageShow("تخفیف با موفقیت اعمال شد ، جهت انصراف از تخفیف مبلغ تخفیف را صفر وارد نمایید.",True)
'		Else if res=0 And feebadaztakhfif=0 Then
'			Item.fldFeeBadAzTakhfif=res
'			Item.MablaghTakhfif=res
'		Else if res=0 And feebadaztakhfif>0 Then
'			Item.fldFeeBadAzTakhfif=feebadaztakhfif
'		End If
'		Item.MablaghTakhfif=res
'		MCode.UpdateNoeTasvieDarSabad(FeeTip,Item)
'		
'		HLV.notifyDataSetChanged
'		End If
	Catch
		Log(LastException)
		myCode.SendError(LastException.Message,Activity.Title&"-btn_discount_Click")
		
	End Try
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

'Sub Btn_Bascket_Click
'	If LblBasketCount.Visible Then
'		StartActivity(Act_Sabad)
'		Activity.Finish
'	Else
'		ToastMessageShow("سبد خرید خالی است",False)
'	End If
'End Sub

Sub Pnl_Down_Click
	If MCode.feeTip=0 Then
		ToastMessageShow("لطفا تیپ قیمت را مشخص کنید",False)
		Return
	End If
	If MCode.C_Tafzili=0 Or myCode.Check_Is_Null(MCode.C_Tafzili) Or MCode.C_Tafzili="" Then
		ToastMessageShow("لطفا مشتری را انتخاب کنید",False)
		Return
	End If
	If MCode.CheckBlackList(MCode.C_Tafzili) Then
		ToastMessageShow("این مشتری در لیست سیاه میباشد",False)
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
	
	
	
	
	
	If LblBasketCount.Visible Then
		If MCode.EshantionTabaghati=1 Then
			MCode.SaveUpdate("Delete from TblSabad where FldEshantion<>'0'")
			Dim count As Int=MCode.SingleResult("Select Count(FldCodeKala) From TblSabad ")
			Dim Cu As Cursor = MCode.Result("Select * From TblSabad where FldCodeKala IN(SELECT tblEshantionTabaghati.fldCodeKalaForoosh FROM tblEshantionTabaghati)")
			For i=0 To Cu.RowCount -1
				Cu.Position=i
				
				AddEshantion(Cu)
			Next
		End If
		StartActivity(Act_Sabad)
		'Activity.Finish
	Else
		ToastMessageShow("سبد خرید خالی است",False)
	End If
End Sub


Sub AddEshantionGroup(CodeGroup As String)
	Try
	   
		
		If LblGiftCount.Text=0 Then
			LblGiftCount.Visible=False
		Else
			LblGiftCount.Visible=True
		End If
		Dim Cu As Cursor = MCode.Result("Select * From TblSabad where fldCodeGroup="& CodeGroup &"  and fldCodeGroup IN(SELECT tblEshantionGroup.fldCodeGroupKala FROM tblEshantionGroup)")
		If Cu.RowCount>0 Then
			Dim TedadSabad As String=0
			For i=0 To Cu.RowCount -1
				Cu.Position=i
				Dim TedadDarKarton As String =myCode.Is_Null_adad(Cu.GetString("FldTedadDarKarton"))
				Dim FldTedadDarSabadJoz As String =myCode.Is_Null_adad(Cu.GetString("FldTedadDarSabadJoz"))
				Dim FldTedadDarSabadKol As String =myCode.Is_Null_adad(Cu.GetString("FldTedadDarSabadKol"))
				Dim Eshantion As String= Cu.GetString("FldEshantion")
		
				If TedadDarKarton>0 Then
					Dim tedadKol As Int=(TedadDarKarton*FldTedadDarSabadKol)
					TedadSabad =TedadSabad + tedadKol+FldTedadDarSabadJoz
				Else
					TedadSabad=TedadSabad + FldTedadDarSabadJoz
				End If
			Next
		
			Log(CodeGroup)
			Log(TedadSabad)
			Dim ListEshantion As List
			ListEshantion.Initialize
			ListEshantion=MCode.LoadEshantionGroup(CodeGroup)
			If ListEshantion.Size>0 Then
				Dim ItemMax = ListEshantion.Get(ListEshantion.Size-1) As AdapterListEshantionGroup
				Dim fldTedadForooshMax As Int=ItemMax.fldTedadForoosh
				Dim fldTedadEshantionMax As Int=ItemMax.fldTedadEshantion
				Dim TedadEshantion As String=0
				Dim CodeGroupKalaEshantion As String=0
				CodeGroupKalaEshantion=ItemMax.fldCodeGroupKalaEshantion
				If TedadSabad=fldTedadForooshMax Then
					TedadEshantion=fldTedadEshantionMax
				else if TedadSabad > fldTedadForooshMax Then
					Dim u As Int=0
					u=(TedadSabad/fldTedadForooshMax)
					TedadEshantion=u*fldTedadEshantionMax
				Else If TedadSabad < fldTedadForooshMax Then
					For i=0 To ListEshantion.Size-2
						Dim Item = ListEshantion.Get(i) As AdapterListEshantionGroup
						Log(Item.fldCodeGroupKala)
						Log(Item.fldCodeGroupKalaEshantion)
						Dim fldTedadForoosh As Int=Item.fldTedadForoosh
						Dim fldTedadEshantion As Int=Item.fldTedadEshantion
						CodeGroupKalaEshantion=Item.fldCodeGroupKalaEshantion
						Log(fldTedadForoosh)
						Log(Item.fldTedadEshantion)
						If TedadSabad= fldTedadForoosh Then
							TedadEshantion=fldTedadEshantion
						else if TedadSabad>fldTedadForoosh Then
							Dim u As Int=0
							u=(TedadSabad/fldTedadForoosh)
							TedadEshantion=u*fldTedadEshantion
						else if TedadSabad<fldTedadForoosh Then
							TedadEshantion=0
						End If
					Next
				End If
				If TedadEshantion>0 Then
					Dim Eshant As AdapterListEshantionGroup
					Eshant.fldCodeGroupKala=CodeGroup
					Eshant.fldCodeGroupKalaEshantion=CodeGroupKalaEshantion
					Eshant.fldTedadForoosh=fldTedadForoosh
					Eshant.fldTedadEshantion=TedadEshantion
					Log(CodeGroupKalaEshantion)
					Log(TedadEshantion)
					
					MCode.SaveUpdate("Delete from tblEshantionGroupTemp where fldCodeGroupKala='"& CodeGroup &"'")				
					MCode.SaveUpdate($"Insert into tblEshantionGroupTemp(fldCodeGroupKala, fldCodeGroupKalaEshantion ,fldTedadEshantion) Values('${CodeGroup}','${CodeGroupKalaEshantion}','${TedadEshantion}')"$)
					Dim index As Int=CheckGroupForEshantation(CodeGroup,CodeGroupKalaEshantion)
					If index>-1 Then
						lstEshantionGroup.RemoveAt(index)
					End If
					
					lstEshantionGroup.Add(Eshant)
				Else
					MCode.SaveUpdate("Delete from tblEshantionGroupTemp where fldCodeGroupKala='"& CodeGroup &"'")

				End If
			
			End If
			Else
			MCode.SaveUpdate("Delete from tblEshantionGroupTemp where fldCodeGroupKala='"& CodeGroup &"'")
		End If
		RefreshCountEshantionGroup
		If Table1.IsInitialized Then
			Grid
		End If
		
	Catch
		Log(LastException)
	End Try
End Sub

Public Sub CheckGroupEshantation(CodeGroup As String) As AdapterListEshantionGroup
	For i=0 To lstEshantionGroup.Size-1
		Dim Item = lstEshantionGroup.Get(i) As AdapterListEshantionGroup
		If Item.fldCodeGroupKalaEshantion=CodeGroup Then
			Return Item
		End If
	Next
	Return Null
End Sub

Public Sub CheckGroupForEshantation(CodeGroup As String,CodeGroupEshantion As String) As Int
	For i=0 To lstEshantionGroup.Size-1
		Dim Item = lstEshantionGroup.Get(i) As AdapterListEshantionGroup
		If Item.fldCodeGroupKala=CodeGroup And Item.fldCodeGroupKalaEshantion=CodeGroupEshantion Then
			
			Return i
		End If
	Next
	Return -1
End Sub

Public Sub RefreshCountEshantionGroup
	Dim Count As Int=0
	Count=myCode.Is_Null_adad(MCode.SingleResult("Select Sum(fldTedadEshantion) from tblEshantionGroupTemp"))
	If Count>0 Then
		LblGiftCount.Text=Count
		LblGiftCount.Visible=True
	Else
		LblGiftCount.Text=0
		LblGiftCount.Visible=False
	End If
End Sub

Public Sub UpEshantion(CodeGroup As String,minas As Int)
	
	Dim Item As AdapterListEshantionGroup=CheckGroupEshantation(CodeGroup)
	If Item.fldTedadEshantion>0 Or Item.fldTedadEshantion=minas Then
		minas=minas-1
		MCode.SaveUpdate("Update tblEshantionGroupTemp Set fldTedadEshantion="& minas & " where fldCodeGroupKalaEshantion="&CodeGroup)
		
		RefreshCountEshantionGroup
	End If
	
	

End Sub

Public Sub DownEshantion(ItemKala As AdapterListKala,Count As Int)
	Dim sum As Int=MCode.GetCountEshantionGroup(ItemKala.CodeGroup)
	Dim item As AdapterListEshantionGroup=CheckGroupEshantation(ItemKala.CodeGroup)
	If item.fldTedadEshantion>sum Then
		sum=sum+1
		MCode.SaveUpdate("Update tblEshantionGroupTemp Set fldTedadEshantion="& sum & " where fldCodeGroupKalaEshantion="&ItemKala.CodeGroup)
		If sum=item.fldTedadEshantion Then
			MCode.SaveUpdate("Delete From TblSabad Where FldCodeKala = '"& ItemKala.CodeGroup &"'")
		End If
		RefreshCountEshantionGroup
	End If
	
End Sub

Sub AddEshantion(ItemSabad As Cursor)
	Try
	Dim CodeKala As String =ItemSabad.GetString("FldCodeKala")
	Dim TedadDarKarton As String =myCode.Is_Null_adad(ItemSabad.GetString("FldTedadDarKarton"))
	Dim FldTedadDarSabadJoz As String =myCode.Is_Null_adad(ItemSabad.GetString("FldTedadDarSabadJoz"))
	Dim FldTedadDarSabadKol As String =myCode.Is_Null_adad(ItemSabad.GetString("FldTedadDarSabadKol"))
	Dim Eshantion As String= ItemSabad.GetString("FldEshantion")
	Dim TedadSabad As String=0	
	If TedadDarKarton>0 Then
		Dim tedadKol As Int=(TedadDarKarton*FldTedadDarSabadKol)
		TedadSabad=tedadKol+FldTedadDarSabadJoz
	Else
		TedadSabad=FldTedadDarSabadJoz
	End If
		Dim ListEshantion As List
		ListEshantion.Initialize
		ListEshantion=MCode.LoadEshantionTabaghati(CodeKala)
If ListEshantion.Size>0 Then
		Dim ItemMax = ListEshantion.Get(ListEshantion.Size-1) As AdapterListEshantion
		Dim fldTedadForooshMax As Int=ItemMax.fldTedadForoosh
		Dim fldTedadEshantionMax As Int=ItemMax.fldTedadEshantion
		Dim TedadEshantion As String
		Dim CodeKalaEshantation As String=0
		CodeKalaEshantation=ItemMax.fldCodeKalaEshantion
		If TedadSabad=fldTedadForooshMax Then
			TedadEshantion=fldTedadEshantionMax			
		else if TedadSabad > fldTedadForooshMax Then
			Dim u As Int=0
			u=(TedadSabad/fldTedadForooshMax)
			TedadEshantion=u*fldTedadEshantionMax
		Else If TedadSabad < fldTedadForooshMax Then
			For i=0 To ListEshantion.Size-2		
				Dim Item = ListEshantion.Get(i) As AdapterListEshantion		
				Log(Item.fldCodeKalaForoosh)
				Log(Item.fldCodeKalaEshantion)		
				Dim fldTedadForoosh As Int=Item.fldTedadForoosh
				Dim fldTedadEshantion As Int=Item.fldTedadEshantion
				CodeKalaEshantation=Item.fldCodeKalaEshantion
				Log(fldTedadForoosh)
				Log(Item.fldTedadEshantion)		
				If TedadSabad= fldTedadForoosh Then
					TedadEshantion=fldTedadEshantion
				else if TedadSabad>fldTedadForoosh Then
					Dim u As Int=0
					u=(TedadSabad/fldTedadForoosh)
					TedadEshantion=u*fldTedadEshantion
				else if TedadSabad<fldTedadForoosh Then
					TedadEshantion=0
				End If				
			Next
		End If				
		If TedadEshantion>0 Then
			If SwSearchNumber.Checked Then
				SwSearchNumber.Checked=False	
			End If
			TxtSearch.Text=CodeKalaEshantation
			Dim Item1 = ListKalaTxt.Get(0) As AdapterListKala
			Dim rec As CLs_RecDefultKala
			rec.Initialize(Me)
			rec.Show(Item1,0)
			Item1.TedadDarSabadJoz=0
			Item1.TedadDarSabadKol=0
			Item1.fldCountEshantion=TedadEshantion
			
			For j=0 To TedadEshantion-1
				rec.BtnUpEshan_Click
			Next
			'MCode.SaveUpdate("Delete from TblSabad where FldEshantion<>'0'")
			MCode.AddToSabad(Item1)
			TxtSearch.Text=""
		End If
	End If
		
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-AddEshantion")
		
	End Try
	
'		If ItemEshantion<>Null Then
'			If ItemEshantion.fldVaziat=1 Then
'				m=ItemEshantion.fldCountForoosh
'				e=ItemEshantion.fldTedadEshantion
'				If t=m Then
'					Item.fldCountEshantion=e
'				End If
'				If t>m Then
'					u=(t/m)
'					Item.fldCountEshantion=u*e
'				End If
'				If t<m Then
'					Item.fldCountEshantion=0
'					Item.FldEshantion=0
'				End If
'			If Item.fldCountEshantion>0 Then
'				LblCountEshantion.Text=Item.fldCountEshantion
'			End If
'			
'			End If
'		Else
'			Item.fldCountEshantion=0
'			Item.FldEshantion=0
'		End If

End Sub


Sub btnCloseRestorpnl_Click
	
End Sub

Sub LoadNoeTasvie	
	Dim ItemTasvie As AdapterListNoeTasvie
	ItemTasvie.Initialize
	CmbBox1.cmbBox.Clear
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
End Sub

Sub CmbBox1_SelectedIndexChanged (Index As Int)
	Try
	FeeTip = 0
	MCode.feeTip=0
	MCode.feeCode=0
	If Index=0 Then
		LoadKala
	Else
		Dim ItemTasvie As AdapterListNoeTasvie
		FeeTip = Index
		MCode.feeTip=Index
		ItemTasvie.Initialize
		ItemTasvie=ListTasvie.Get(FeeTip-1)
		
		MCode.feeCode=ItemTasvie.FldC_Tasvie
		Log("Fee: "&Index)
		'btnUpdate_Click
'			UpdateFeeSabad(res,Item.CodeKala)
		UpdateFee
	End If
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-CmbBox1_SelectedIndexChanged")
		
	End Try
End Sub
Sub ShowLastException
	Dim EX As String
	Dim stripEX As String
	EX = LastException.Message ' this is line 3
	stripEX = EX.SubString(28)
	Msgbox(stripEX, "Login error")
End Sub
Sub Application_Error (Error As Exception, StackTrace As String) As Boolean
	Log("Error KalaDefault: "&Error)
'	MCode.ScheduleRestartCrashedActivity(DateTime.Now + 300, Activity.Title, Error)
	Return True
End Sub



Private Sub txtDarsadTakhfif_TextChanged (Old As String, New As String)
Try
Dim no As Long
If MCode.ConvertNumbersPersian2English(Old) <> MCode.ConvertNumbersPersian2English(New) Then
	Try
			
		no = txtDarsadTakhfif.Text
		If no>100 Then
					no=Old
					
		End If
		txtchanged=True
			
		Log(no)
'				If txtchanged=True Then
'					
'				End If
	Catch
		no=0
		txtFee.Text=""
		txtDarsadTakhfif.Text=""
	End Try
End If
If txtchanged Then
	txtchanged=False
	txtDarsadTakhfif.Tag=no
			txtDarsadTakhfif.Text=no
			Dim TedadKol As String=ItemSelected.TedadDarSabadJoz+(ItemSelected.TedadDarSabadKol*ItemSelected.TedadDarKarton)
			If no>0 Then
				If TedadKol> 0 Then
					txtFee.Text=(((ItemSelected.FeeForoosh*TedadKol)*no)/100)
					Else
					txtFee.Text=(((ItemSelected.FeeForoosh)*no)/100)
				End If
				
			Else
				txtFee.Text=no
			End If
End If
txtDarsadTakhfif.SelectionStart=txtDarsadTakhfif.Text.Length
Catch
Log(LastException)
myCode.SendError(LastException,Activity.Title&"-txtDarsadTakhfif_TextChanged")
End Try
End Sub

Private Sub Img_SelectMoshtari_Click
	MCode.page="Act_SelectMantage"
	StartActivity(Act_SelectMantage)
End Sub

Private Sub Img_RotatePic_Click
	If MCode.RotatePic=False Then
		MCode.RotatePic=True
		Else
		MCode.RotatePic=False
	End If
	LoadKala
End Sub

Private Sub btnMenuGroup_Click
	sidemenu.ShowMenu
End Sub

Private Sub lblBackGroup_Click
	If MCode.C_LayeKala.Length > 3 Then
		
	If MCode.C_LayeKala.Length=6 Then
		lblBackGroup.Visible=False
	End If
		LoadGoroohKalaBack(MCode.C_LayeKala)
	Else
		lblBackGroup.Visible=False		
	End If
End Sub

Private Sub SwSearchNumber_CheckedChange(Checked As Boolean)
	If Checked Then
		SearchNumber=1
		Else
		SearchNumber=0
	End If
End Sub

Private Sub LblGift_Click
	If LblGiftCount.Text>0 Then
		If Table1.IsInitialized Then
			PnlTableEshantion.RemoveAllViews
		End If
		Table1.Initialize(Me, "Table1",6)
		Table1.AddToActivity(PnlTableEshantion, 1%x,1%y,PnlTableEshantion.Width,PnlTableEshantion.Height)
		Grid
		PnlEshantion.Visible=True
		
	End If
End Sub

Sub Grid
	Dim Lst_ColNameTitle As List
	Lst_ColNameTitle.Initialize
'	Lst_ColNameTitle.AddAll(Array As String("ردیف","نام کالا","قیمت فی","فی تخفیف","تعداد جزء","واحد جزء","تعداد کل","واحد کل","کد کالا","قیمت مصرف کننده","توضیحات"))
	Lst_ColNameTitle.AddAll(Array As String("ردیف","کد گروه","نام گروه","کد گروه اشانتیون","نام گروه اشانتیون","تعداد اشانتیون"))
	'Dim Query As String = "Select FldNamekala,Cast(Round(FldFeeForoosh,'"& MCode.RaghamAshar &"') As Int) As FldFeeForoosh,Cast(Round(fldFeeBadAzTakhfif,'"& MCode.RaghamAshar &"') As Int) As fldFeeBadAzTakhfif,FldTedadDarSabadJoz,fldNamevahed,FldTedadDarSabadKol,fldNameVahed2,FldCodeKala,FldMablaghMasrafKonande,FldTozihat From TblFaktor Where FldShomareFaktor = '"& MCode.FaktorSelect &"'"
	'Table1.LoadSQLiteDB(File.DirDefaultExternal &"/"Parsik"",""Parsik"_db.db",MCode.Sql1, Query)
	Table1.LoadEshantionGroupList(lstEshantionGroup,Lst_ColNameTitle,6)
'	Table1.SetColumnsWidths(Array As Int(100dip, 80dip,50dip,90dip,150dip))
'	Table1.SetColumnsWidths(Array As Int(50dip,200dip,100dip, 100dip,50dip,80dip,50dip,80dip,80dip,80dip,100dip))
	Table1.SetColumnsWidths(Array As Int(50dip,50dip,66dip,50dip,66dip,50dip))
'	Table1.SetHeader(Array As String("قیمت","واحد","مقدار","فی","نام کالا"),Array As Int(100dip, 80dip,50dip,90dip,150dip))
	'Table1.SetHeader(Array As String("ردیف","نام کالا","قیمت فی","فی تخفیف","تعداد جزء","واحد جزء","تعداد کل","واحد کل","کد کالا","قیمت مصرف کننده","توضیحات"),Array As Int(50dip,200dip,100dip, 100dip,50dip,80dip,50dip,80dip,80dip,80dip,100dip))
End Sub




Private Sub btnCloseEshantionGroup_Click
	PnlEshantion.Visible=False
End Sub

Private Sub SwArzeshAfzodeEnable_CheckedChange(Checked As Boolean)
	
	If Checked Then
		ItemSelected.fldDarsadArzeshAfzode=MCode.ArzeshAfzode
'		ItemSelected.fldArzeshAfzode
		MCode.ArzeshAfzodeEnable=1
		lblDarsadArzeshAfzode.Text=$" ارزش افزوده: ${MCode.ArzeshAfzode} %"$
		lblArzeshAfzode.Text="مبلغ ارزش افزوده: 0"
		
	Else
		ItemSelected.fldDarsadArzeshAfzode=0
		ItemSelected.fldDarsadArzeshAfzodeKala=0
		ItemSelected.fldArzeshAfzodeKala=0
		MCode.ArzeshAfzodeEnable=0
		lblDarsadArzeshAfzode.Text="ارزش افزوده: 0 %"
		lblArzeshAfzode.Text="مبلغ ارزش افزوده: 0"
		
	End If
	Dim countSabad As String = MCode.SingleResult("Select Count(FldId) From TblSabad")
	If countSabad>0 Then
		MCode.SaveUpdate("Update TblSabad Set fldDarsadArzeshAfzode='"& ItemSelected.fldDarsadArzeshAfzode & "'")
	End If

	MCode.CreateReportSabad
	RefreshLblSabad
End Sub

