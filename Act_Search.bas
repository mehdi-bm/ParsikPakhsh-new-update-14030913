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

End Sub

Sub Globals
	Dim HLV As Hitex_LayoutView

	Dim Key As IME
	Dim ListKalaTxt,ListKalaSp,OrginalListKala As List
	Dim ListGroohKala As List
	Dim FeeTip As String
	Private Str_sort As String = " Order by fldCodeKala Asc"
'	Dim zx As JhsIceZxing1
	Dim Barcode As JhsIceZxing1
'	Private btn_sort As Label
'	Private Btn_barcode As Label
	Private LblBasketCount As Label
	Private LblBasket As Label
	Private BtnShowFilterPnl As ImageView
	Private TxtSearch As EditText
	Private BtnCommentExit As Button
	Private BtnCommentOK As Button
	Private pnlFilter As Panel
	Private pnl_HLV As Panel
	'Private NumberSearch As EditText
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

	'Private Dialog As B4XDialog
	Private XUI As XUI
	Private Dialog As B4XDialog
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
	'Private NiceSpinner As ACSpinner
	Public NiceSpinner As Hitex_NiceSpinner
	Public NiceSpinner1 As Hitex_NiceSpinner
	Private B4XComboBox1 As B4XComboBox
	Private B4XComboBox2 As B4XComboBox
	Dim GroupCodeSelect1 As String="0"
	Dim GroupNameSelect1 As String=""
	Dim GroupCodeSelect2 As String="0"
	Dim GroupNameSelect2 As String=""
	
	Dim lstSelectedCodeGroupKala As List
	
End Sub

Sub Activity_Create(FirstTime As Boolean)
'	Activity.LoadLayout("L_Search")
'	Activity.LoadLayout("L_Search_2")

	Activity.LoadLayout("L_Search_3")
	lstSelectedCodeGroupKala.Initialize
	
	HLV.Initializer("HLV").ListView.Build
	pnl_HLV.AddView(HLV,0,0,100%x,pnl_HLV.Height)
	Key.Initialize("Key")
	Dialog.Initialize(Activity)
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

'	t1.Enabled=True
	HLV.Show
	MCode.CodeMoshtari = 0
	'btnUpdate_Click

	LoadKala
	Img_TipFee.Visible=False
	Label5.Visible=False
	
'	Dim Cu As Cursor = MCode.Result("Select FldTipFee From TblAshkhas Where FldC_Ashkhas = '"& MCode.CodeMoshtari &"'")
'	If Cu.RowCount>0 Then
'		Cu.Position=0
'		FeeTip = Cu.GetString("FldTipFee")
'	Else
'		FeeTip =0
'	End If
	'LoadListKala("Select * From TblKala " & Str_sort)
	'search(True)
	'myCode.TextBoxBackColorWhite(TxtSearch)
		'myCode.TextBoxBackColorWhite(NumberSearch)

End Sub




Sub btnUpdate_Click
	
'	StopService(Service_Notification)
	If MCode.IsConnected Then
		StartService(FirebaseMessaging)
		MCode.page="Search"
		FirebaseMessaging.mode="GetGalleryKala"
	Else
		LoadKala
	End If
		
	
End Sub



Sub LoadKala
	
	Try
		'ProgressDialogShow("در حال بارگذاری لیست کالا")
		
		Dim str As String=""
		Dim countfilter As Int=0
		Dim filter As Boolean=False
	
		
'	If MCode.ConnectionState Then
'		MCode.NoeGet="GetEshantion"
'		StartService(Service_Server)
'	End If
		Log(GroupCodeSelect1)
		Log(GroupCodeSelect2)
		If GroupCodeSelect1=0 And GroupCodeSelect2=0 Then
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
	
			If TxtSearch.Text.Length>0 And TxtSearch.Text<>" " And TxtSearch.Text<>"" Then
				Dim StrSearch As String= MCode.ConvertNumbersPersian2English(TxtSearch.Text) 'MCode.ConvertNumbersPersian2English(TxtSearch.Text)
				If StrSearch="" Then
					StrSearch=TxtSearch.Text
				End If
				countfilter=countfilter+1
				If IsNumber(StrSearch) Then
					If StrSearch.Length>5 Then
						str = str & $" and (fldSerial = '${StrSearch}') "$
					Else
						str = str & $" and (fldCodeKala like '%${StrSearch}%') "$
					End If
			
				Else
					str = str & $" and (fldNameKala like '%${StrSearch}%') "$
				End If
				filter=True
				If countfilter=1 Then
					str=str.Replace(" and ","")
				End If
			End If
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
	
			If TxtSearch.Text.Length>0 And TxtSearch.Text<>" " And TxtSearch.Text<>"" Then
				Dim StrSearch As String=MCode.ConvertNumbersPersian2English(TxtSearch.Text)
				If StrSearch="" Then
					StrSearch=TxtSearch.Text
				End If
				countfilter=countfilter+1
				If IsNumber(StrSearch) Then
					If StrSearch.Length>5 Then
						str = str & $" and (fldSerial = '${StrSearch}') "$
					Else
						str = str & $" and (fldCodeKala like '%${StrSearch}%') "$
					End If
			
				Else
					str = str & $" and (fldNameKala like '%${StrSearch}%') "$
				End If
				filter=True
				If countfilter=1 Then
					str=str.Replace(" and ","")
				End If
			End If
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
	
			If TxtSearch.Text.Length>0 And TxtSearch.Text<>" " And TxtSearch.Text<>"" Then
				Dim StrSearch As String=MCode.ConvertNumbersPersian2English(TxtSearch.Text)
				If StrSearch="" Then
					StrSearch=TxtSearch.Text
				End If
				countfilter=countfilter+1
				If IsNumber(StrSearch) Then
					If StrSearch.Length>5 Then
						str = str & $" and (fldSerial = '${StrSearch}') "$
					Else
						str = str & $" and (fldCodeKala like '%${StrSearch}%') "$
					End If
			
				Else
					str = str & $" and (fldNameKala like '%${StrSearch}%') "$
				End If
				filter=True
				If countfilter=1 Then
					str=str.Replace(" and ","")
				End If
			End If
			'str="select * from TblKala where fldCodeGroup like '"&GroupCodeSelect2&"%' "&str&" "&Str_sort
			If	filter=True And str<>"" Then
				str="select * from TblKala where fldCodeGroup like '"&GroupCodeSelect2&"%' and "&str&" " &Str_sort
			Else
				str="select * from TblKala where fldCodeGroup like '"&GroupCodeSelect2&"%' " &Str_sort
		
			End If
			Log(str)
		End If
		FirebaseMessaging.mode="stop"
		LoadListKala(str)
	
		'RefreshLblSabad
			
	Catch
		'ShowLastException
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-LoadKala")
	End Try

End Sub






Sub Activity_Resume
	'search(True)
	'RefreshTedadKalaOnListKala
	'RefreshLblSabad
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

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub LoadAcSpGroohKala
	
	Dim Dt As Cursor = MCode.Result("Select FldC_Gorooh,FldN_Gorooh From TblGoroohKala where Length(FldC_Gorooh) = 3 ORDER BY FldC_Gorooh")
	NiceSpinner.Add("همه گروه ها")
	For i=0 To Dt.RowCount-1
		Dt.Position=i
		Dim Item As AdapterGoroohKala
		Dim cu As Cursor
		Log(Dt.GetString("FldC_Gorooh"))
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
		For i = 0 To Cu.RowCount - 1
			Dim ItemKala As AdapterListKala
			Cu.Position=i
			Log(Cu.Getstring("fldCodeGroup"))
			ItemKala.CodeKala=Cu.Getstring("fldCodeKala")
			ItemKala.NameKala=Cu.Getstring("fldNameKala")
			ItemKala.NameVahed=Cu.Getstring("fldNameVahed")
			ItemKala.NameVahed2=Cu.Getstring("fldNameVahed2")
			ItemKala.SumMande=Cu.Getstring("SumMande")
'			ItemKala.TedadDarSabadJoz =Cu.Getstring("fldTedadDarSabadJoz")
'			ItemKala.TedadDarSabadKol =Cu.Getstring("fldTedadDarSabadKol")
			ItemKala.TedadDarKarton =Cu.Getstring("fldTedadDarKarton")
			ItemKala.FeeForoosh=Cu.GetInt("fldFeeForoosh")
			ItemKala.FldMablaghMasrafKonande=Cu.GetString("fldGhymatMasrafkonande")
			'Log(Cu.GetString("fldPathPic"))
			ItemKala.fldPathPic=Cu.GetString("fldPathPic")
			If Cu.GetString("fldFeeBadAzTakhfif")<>Null Then
				Log(Cu.GetString("fldFeeBadAzTakhfif"))
				ItemKala.fldFeeBadAzTakhfif=Cu.GetString("fldFeeBadAzTakhfif")
			Else
				Log(Cu.GetString("fldFeeBadAzTakhfif"))
				Log("0")
				ItemKala.fldFeeBadAzTakhfif="0"
			End If
				ItemKala.fldPathPic=Cu.GetString("fldPathPic")
		
		
			If Cu.Getstring("fldNameVahed2") <> "" Then
				Dim FldFeeForoosh As Int = MCode.Sf.Val(Cu.GetInt("fldFeeForoosh"))
				Dim FldTedadDarKarton As Int = MCode.Sf.Val(Cu.Getstring("fldTedadDarKarton"))
				Dim SumMande As Int = Cu.Getstring("SumMande")
				ItemKala.FeeForooshKarton=FldFeeForoosh * FldTedadDarKarton
				ItemKala.SumMandeKarton=Round2( SumMande / FldTedadDarKarton,0)
			End If
			OrginalListKala.Add(ItemKala)
		Next
	End If
	'ToastMessageShow("تعداد کالای زیر مجموعه " & "  " & Cu.RowCount,True)
	Log(OrginalListKala.Size)
	ListKalaSp=OrginalListKala
	ListKalaTxt=ListKalaSp
		Sleep(100)
	'RefreshTedadKalaOnListKala
'	ToastMessageShow(Cu.RowCount,True)
		HLV.notifyDataSetChanged

End Sub

Sub RefreshTedadKalaOnListKala
	
	Dim Cu As Cursor = MCode.Result("Select * From TblSabad")
	If Cu.RowCount=0 Then Return
	For j=0 To ListKalaTxt.Size-1
		Dim Item=ListKalaTxt.Get(j) As AdapterListKala
		For i=0 To Cu.RowCount - 1
			Cu.Position=i
			If Cu.GetString("FldCodeKala") = Item.CodeKala Then
				
				If Cu.GetString("FldTedadDarSabadJoz") > 0 Then
					Item.TedadDarSabadJoz = Cu.GetString("FldTedadDarSabadJoz")
				Else
					Item.TedadDarSabadJoz = 0
				End If
				
				If Cu.GetString("FldTedadDarSabadKol") > 0 Then
					Item.TedadDarSabadKol = Cu.GetString("FldTedadDarSabadKol")
				Else
					Item.TedadDarSabadKol = 0
				End If
				
				Try
					If Cu.GetString("FldEshantion") > 0 Then
						Item.FldEshantion = Cu.GetString("FldEshantion")
					Else
						Item.FldEshantion = 0
					End If
				Catch
					Item.FldEshantion = 0
				End Try
			End If
		Next
		Next

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

'Sub NiceSpinner1_ItemClick (Position As Int, Value As Object)
'	TxtSearch.Text= ""
'	Key.HideKeyboard
'	
'	Dim lst As List=ListGroohKala
'	Dim Item As AdapterGoroohKala=lst.Get(NiceSpinner1.SelectedIndex-1)
'	
'	
'	If Position = 0 Then
'	
'		NiceSpinner1.Add("همه گروه ها")
'		If lstSelectedCodeGroupKala.Size>0 Then
'			GroupCodeSelect2=lstSelectedCodeGroupKala.Get(lstSelectedCodeGroupKala.Size-1)
'			Else
'			GroupCodeSelect2=0
'			GroupNameSelect2=""
'		End If
'		
'
'		
'	Else
'		NiceSpinner1.Clear
'	
'		If Value="برگشت" Then
'		
'			lstSelectedCodeGroupKala.RemoveAt(lstSelectedCodeGroupKala.Size-1)
'			GroupCodeSelect2=lstSelectedCodeGroupKala.Get(lstSelectedCodeGroupKala.Size-1)
'			
'			Dim mc As String=GroupCodeSelect2
'			
'			Dim Count As Int = mc.Length + 3
'			Dim Cu As Cursor=MCode.Result("Select FldC_Gorooh,FldN_Gorooh From TblGoroohKala where FldC_Gorooh Like '"& mc &"%' And Length(FldC_Gorooh) = "& Count &" ORDER BY FldC_Gorooh")
'			If Cu.RowCount>0 Then
'				ListGroohKala.Clear
'				NiceSpinner1.Clear
'				lstSelectedCodeGroupKala.Clear
'			
'				lstSelectedCodeGroupKala.Add(GroupCodeSelect2)
'				If GroupCodeSelect2.Length>3 Then
'					NiceSpinner1.Add("برگشت")
'				End If
'				
'				NiceSpinner1.Add("همه گروه ها")
'			
'				For i=0 To Cu.RowCount-1
'					Cu.Position=i
'					Dim Item As AdapterGoroohKala
'					Item.FldC_Gorooh=Cu.GetString("FldC_Gorooh")
'					Item.FldN_Gorooh=Cu.GetString("FldN_Gorooh")
'					ListGroohKala.Add(Item)
'					NiceSpinner1.Add(Cu.GetString("FldN_Gorooh"))
'				Next
'				lstSelectedCodeGroupKala.Add(Item.FldC_Gorooh)
'				NiceSpinner1.Show(Colors.blue, 14)
'				NiceSpinner1.SelectedIndex = 0
'			End If
'			Else
'			Dim lst As List=ListGroohKala
'			GroupCodeSelect2=lstSelectedCodeGroupKala.Get(lstSelectedCodeGroupKala.Size-1)
'			If GroupCodeSelect2.Length>3 Then
'				Dim Item As AdapterGoroohKala=lst.Get(NiceSpinner1.SelectedIndex-2)
'				Else
'				Dim Item As AdapterGoroohKala=lst.Get(NiceSpinner1.SelectedIndex-1)
'			End If
'			
'			Log(Item.FldC_Gorooh)
'			Log(Item.FldN_Gorooh)
'			GroupCodeSelect2=Item.FldC_Gorooh
'			GroupNameSelect2=Item.FldN_Gorooh
'			Dim mc As String=Item.FldC_Gorooh
'			
'			Dim Count As Int = mc.Length + 3
'			Dim Cu As Cursor=MCode.Result("Select FldC_Gorooh,FldN_Gorooh From TblGoroohKala where FldC_Gorooh Like '"& mc &"%' And Length(FldC_Gorooh) = "& Count &" ORDER BY FldC_Gorooh")
'			If Cu.RowCount>0 Then
'				ListGroohKala.Clear
'				NiceSpinner1.Clear
'				lstSelectedCodeGroupKala.Clear
'			
'				lstSelectedCodeGroupKala.Add(Item.FldC_Gorooh)
'				NiceSpinner1.Add("برگشت")
'				NiceSpinner1.Add("همه گروه ها")
'			
'				For i=0 To Cu.RowCount-1
'					Cu.Position=i
'					Dim Item As AdapterGoroohKala
'					Item.FldC_Gorooh=Cu.GetString("FldC_Gorooh")
'					Item.FldN_Gorooh=Cu.GetString("FldN_Gorooh")
'					ListGroohKala.Add(Item)
'					NiceSpinner1.Add(Cu.GetString("FldN_Gorooh"))
'				Next
'				lstSelectedCodeGroupKala.Add(Item.FldC_Gorooh)
'				NiceSpinner1.Show(Colors.blue, 14)
'				NiceSpinner1.SelectedIndex = 0
'			End If
'		End If
'		
'	
'		
'		Dim Cu As Cursor = MCode.Result($"Select FldC_Gorooh,FldN_Gorooh From TblGoroohKala where FldC_Gorooh like '${mc}%' Order By FldC_Gorooh"$)
'
'	End If
'	LoadKala
'	search(True)
'	Log("position:"&Position)
'End Sub


'Sub NiceSpinner1_ItemClick (Position As Int, Value As Object)
'	TxtSearch.Text= ""
'	Key.HideKeyboard
'	
'	If Position = 0 Then
'		NiceSpinner1.Clear
'		NiceSpinner1.Add("همه گروه ها")
'		If lstSelectedCodeGroupKala.Size>0 Then
'			NiceSpinner1.Add("برگشت")
'		End If
'		NiceSpinner1.SelectedIndex=0
''
''	
''		NiceSpinner.SelectedIndex=NiceSpinner.SelectedIndex
'		'LoadListKala("Select * From TblKala " & Str_sort)
'		GroupCodeSelect2=0
'		GroupNameSelect2=""
'	Else If Position=1 And Value="برگشت" Then
'		GroupCodeSelect2=lstSelectedCodeGroupKala.Get(lstSelectedCodeGroupKala.Size-1)
'		lstSelectedCodeGroupKala.RemoveAt(lstSelectedCodeGroupKala.Size-1)
'		
'	Else
'		'NiceSpinner1.Clear
'		Dim lst As List=ListGroohKala
'		Dim Item As AdapterGoroohKala=lst.Get(NiceSpinner1.SelectedIndex-1)
'		Log(Item.FldC_Gorooh)
'		Log(Item.FldN_Gorooh)
'		GroupCodeSelect2=Item.FldC_Gorooh
'		GroupNameSelect2=Item.FldN_Gorooh
'		Dim mc As String=Item.FldC_Gorooh
'		'Dim Cu As Cursor = MCode.Result($"Select FldC_Gorooh,FldN_Gorooh From TblGoroohKala where FldC_Gorooh like '${mc}%' Order By FldC_Gorooh"$)
'		Dim Count As Int = Item.FldC_Gorooh.Length + 3
'		Dim Cu As Cursor=MCode.Result("Select FldC_Gorooh,FldN_Gorooh From TblGoroohKala where FldC_Gorooh Like '"& mc &"%' And Length(FldC_Gorooh) = "& Count &" ORDER BY FldC_Gorooh")
'		If Cu.RowCount>0 Then
'			ListGroohKala.Clear
'			NiceSpinner1.Clear
'			
'			If lstSelectedCodeGroupKala.Size>0 Then
'				NiceSpinner1.Add("برگشت")
'			End If
'			NiceSpinner1.Add("همه گروه ها")
'			For i=0 To Cu.RowCount-1
'				Cu.Position=i
'				Dim Item As AdapterGoroohKala
'				Item.FldC_Gorooh=Cu.GetString("FldC_Gorooh")
'				Item.FldN_Gorooh=Cu.GetString("FldN_Gorooh")
'				ListGroohKala.Add(Item)
'				NiceSpinner1.Add(Cu.GetString("FldN_Gorooh"))
'			Next
'			'lstSelectedCodeGroupKala.Add(Item.FldC_Gorooh)
'			NiceSpinner1.Show(Colors.blue, 14)
'			'NiceSpinner1.SelectedIndex = 0
'		End If
'	End If
'	LoadKala
'	'search(True)
'End Sub

Private Sub search(Checked As Boolean)
	
	Log(Checked)
	Dim Str As String
	Dim CodeGroohKala As String
	If NiceSpinner1.SelectedIndex > 0 Then
		Dim Item = ListGroohKala.Get(NiceSpinner1.SelectedIndex-1) As AdapterGoroohKala
		CodeGroohKala = Item.FldC_Gorooh
	Else
		Dim lst As List=OriginalListGoroohKala
		Dim I As Int = NiceSpinner.SelectedIndex
		If I = 0 Then I = 1
		Dim Item As AdapterGoroohKala=lst.Get(I-1)
		CodeGroohKala = Item.FldC_Gorooh' & Item.FldC_S_GroohKala
	End If
	
		Str =  "  fldCodeGroup Like '"& CodeGroohKala &"%'"

	
	
	
	
	
		
'		Dim WTypeApk As Int = myCode.getSetting("data.dat","wtypeApk",1)
''	پیدا کردن کالاهای یک گروه با توجه به نوع اپلیکیشن
'		Select WTypeApk
'			Case 1

				
'			Case 2
'			Str =  " and FldC_Gorooh = '"& Item.FldC_Gorooh &"'"
'				
		
				
'		End Select
		
'	If NiceSpinner.SelectedIndex = 0 Then
'		
'	End If
'	Else
'		Str =""
'	End If
	Log(Str)
	If SwGift.Checked=True Then
		'Str= Str & " and eshan <> '0,0'"
	End If
	If SwTakhfif.Checked=True Then
		Str= Str & " and fldFeeBadAzTakhfif <> '0.0000'"
	End If
	If SwMojoodi.Checked=True Then
		Str= Str & " and SumMande > '0'"
	End If
	If SwPic.Checked=True Then
		Str= Str & " and fldPathPic <> '0'"
	End If
	If TxtSearch.Text.Length>0 Then
		If IsNumber(TxtSearch.Text) Then
		
			Str = Str & $" and (fldCodeKala like '%${TxtSearch.Text}%') "$
		Else
			Dim d() As String=Regex.Split(" ",TxtSearch.Text)
			Dim txt As String=""
			For i=0 To d.Length-1
				txt = txt &  $" and (fldNameKala Like '%${d(i)}%') "$
			Next
			Log(txt)
			Str= Str & txt
		End If
	End If
	


	If Str.Length>0 Then
		'Str=MCode.ConvertNumbersPersian2English(Str)
		'Log(Str)
		'Str=Str.SubString(5) & Str_sort
		Log(Str)
		LoadListKala("Select * From TblKala Where " & Str&" "& Str_sort)
	Else
		LoadListKala("Select * From TblKala " & Str_sort)
	End If
		Str = ""
	
End Sub
Sub HLV_GetItemCount As Int 
	Try								        '💯 ItemCount 💯'
		Return ListKalaTxt.Size
	Catch
		
		MCode.SendError(LastException)
		Log(LastException)
		Return 0
	End Try
End Sub
Sub HLV_onCreateViewHolder (Parent As Panel, ViewType As Int)      '💎 onCreate 💎'
	
	Dim rec As cls_Search
	rec.Initialize(Me)
	Parent.AddView(rec.Panel,0,0,100%x,rec.Height)
		Parent.Tag=rec

End Sub
Sub HLV_onBindViewHolder (Parent As Panel, Position As Int)         '💠 onBind 💠'
	Try
	Dim Item = ListKalaTxt.Get(Position) As AdapterListKala
	Dim rec As cls_Search=Parent.Tag
	rec.Show(Item,Position)
		Parent.Height=rec.Height
	Catch
		MCode.SendError(LastException)
		Log(LastException)
	End Try
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
'	NumberSearch.Text=Value
'	NumberSearch.Visible=True
'	TxtSearch.Visible=False
'	BtnSearch.Tag=True
'End Sub
'Sub myzx_timedout(timedOut As Boolean)
'	Log("timedOut " & timedOut)
'
'End Sub
'Sub myzx_usercancelled(userCancelled As Boolean)
'	Log("userCancelled " & userCancelled)
'End Sub
Sub NumberSearch_TextChanged (Old As String, New As String)
	'search(True)
	LoadKala
End Sub

Sub TxtSearch_TextChanged (Old As String, New As String)
	'search(True)
	LoadKala
End Sub

Sub BtnCommentExit_Click
	pnlFilter.SetVisibleAnimated(300,False)
End Sub

Sub BtnShowFilterPnl_Click

	If Panel2.Height = Label11.top Then
		Panel2.SetLayoutAnimated(500,Panel2.Left,Panel2.Top,Panel2.Width,LblPoint.top + LblPoint.Height)
		Pnl_Tools.SetLayoutAnimated(500,Pnl_Tools.Left,Panel2.Top + Panel2.Height + 1%y,Pnl_Tools.Width,Pnl_Tools.Height)
		pnl_HLV.SetLayoutAnimated(500,pnl_HLV.Left,Pnl_Tools.Top + Pnl_Tools.Height,pnl_HLV.Width,pnl_HLV.Height)
'		pnl_HLV.Top = Pnl_Tools.Top + Pnl_Tools.Height
		HLV.Height=pnl_HLV.Height - 15%y
	Else
		Panel2.SetLayoutAnimated(500,Panel2.Left,Panel2.Top,Panel2.Width,Label11.top)
		Pnl_Tools.SetLayoutAnimated(500,Pnl_Tools.Left,Pnl_Top.Top + Pnl_Top.Height,Pnl_Tools.Width,Pnl_Tools.Height)
		pnl_HLV.SetLayoutAnimated(500,pnl_HLV.Left,Pnl_Tools.Top + Pnl_Tools.Height,pnl_HLV.Width,pnl_HLV.Height)
'		HLV.Height=pnl_HLV.Height - 13%y
'		pnl_HLV.Top = Pnl_Tools.Top + Pnl_Tools.Height
		HLV.Height=pnl_HLV.Height
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

Sub SwGift_CheckedChange(Checked As Boolean)
	'search(True)
	LoadKala
End Sub

Sub SwTakhfif_CheckedChange(Checked As Boolean)
	'search(True)
	LoadKala
End Sub

Sub SwMojoodi_CheckedChange(Checked As Boolean)
	'search(True)
	LoadKala
End Sub

Sub SwPic_CheckedChange(Checked As Boolean)
	'search(True)
	LoadKala
End Sub

'Sub BtnCommentOK_Click
'	pnlFilter.SetVisibleAnimated(300,False)
'End Sub

Sub BtnSearch_Click
	Log("BtnSearch_Click")
'	If BtnSearch.Tag=True Then
'		TxtSearch.Visible=True
'		NumberSearch.Visible=False
'		BtnSearch.Tag=False
'	Else
'		NumberSearch.Visible=True
'		TxtSearch.Visible=False
'		BtnSearch.Tag=True
'	End If
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

Sub Img_Paging_Click

	Act_KalaPaging2.listKala=ListKalaTxt
		StartActivity(Act_KalaPaging2)

End Sub

Sub Img_TipFee_Click
	
	Dim btnshow As Int=myCode.getSetting("setting.dat","WSetTip",0)
	Log(btnshow)
	If btnshow=0 Then
		ToastMessageShow("دسترسی شما به این گزینه محدود است",True)
		Return
	End If
	
	
	Dim Lst As List
'	Lst.Initialize2(Array As String("تیپ قیمت 0","تیپ قیمت 1","تیپ قیمت 2","تیپ قیمت 3","تیپ قیمت 4","تیپ قیمت 5","تیپ قیمت 6","تیپ قیمت 7","تیپ قیمت 8","تیپ قیمت 9","تیپ قیمت 10"))
	Lst.Initialize2(Array As String("تیپ1 (بدون احتساب تخفیف)","تیپ1 (با احتساب تخفیف)","تیپ قیمت 3","تیپ قیمت 4","تیپ قیمت 5","تیپ قیمت 6","تیپ قیمت 7","تیپ قیمت 8","تیپ قیمت 9","تیپ قیمت 10"))
	If FeeTip = 0 Then FeeTip=1
	InputListAsync(Lst,"تیپ قیمت را انتخاب کنید",FeeTip-1,True)
	Wait For InputList_Result (Result As Int)
	If Result <> -3 Then
		Dim Res As Int=Msgbox2("توجه داشته باشید که با تغییر تیپ قیمت سبد خرید شما حذف می گردد، آیا می خواهید تیپ قیمت تغییر کند؟","توجه","بله","","خیر",Null)
		If Res = DialogResponse.POSITIVE Then
			MCode.SaveUpdate("Delete From TblSabad")
			RefreshLblSabad
			FeeTip = Result+1
			search(True)
		End If
		End If
	
End Sub

Sub btn_Back_Click
	Activity.Finish
End Sub

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


