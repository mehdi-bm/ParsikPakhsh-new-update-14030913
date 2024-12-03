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
	Public ShomareDaryafti As String
	Public ShomareFactor As String
	Public CodeMoshtari As String
	Public NameMoshtari As String
	Public SumMablaghCheck As String=0
	Public issend As Boolean
	Public lstCheck As List
End Sub

Sub Globals
	Public NSN_BankD As Hitex_NiceSpinner
	Dim HLV As Hitex_LayoutView
	Private lblShomareDaryaft As Label
	Private pnl_Hlv As Panel
	Private txtShomareCheck As EditText
	Private txtShomareHesab As EditText
	Private txtMablagh As EditText
	Private PnlNBank As Panel
	Private BtnDateSarResid As Button
	Private txtShobe As EditText
	Private TxtSharh As EditText
	Dim DateCheck As String
	Dim BtnSave As Button
	Dim lstCodeBank1 As List
	Dim CodeBank1,NameBank1 As String
	Dim Key As IME
	Dim OriginallstCheck As List
	Private txtchanged As Boolean=False
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Try
	Activity.LoadLayout("l_SabtRizCheck")
	lblShomareDaryaft.Text=ShomareDaryafti
	Key.Initialize("Key")
	Key.SetCustomFilter(txtShomareCheck,txtShomareCheck.INPUT_TYPE_NUMBERS,"0123456789")
	Key.SetCustomFilter(txtShomareHesab,txtShomareHesab.INPUT_TYPE_NUMBERS,"0123456789")
	Key.SetCustomFilter(txtMablagh,txtMablagh.INPUT_TYPE_NUMBERS,"0123456789")
	NSN_BankD.Initialize("NSN_BankD",True,False)
	PnlNBank.AddView(NSN_BankD,0,0,PnlNBank.Width,PnlNBank.Height)
	NSN_BankD.TextColor = Colors.RGB(192,53,38)
	NSN_BankD.Gravity = Gravity.CENTER
	NSN_BankD.Typeface = Typeface.LoadFromAssets("p_font.ttf")
	Dim op As ColorDrawable
	op.Initialize2(Colors.White,5dip,0dip,Colors.Black)
	NSN_BankD.Background=op
	lstCodeBank1.Initialize
	lstCheck.Initialize
	OriginallstCheck.Initialize
	LoadBank
	
	NSN_BankD.Show(Colors.Black, 16)
	
	HLV.Initializer("HLV").ListView.Build
	pnl_Hlv.AddView(HLV,0,0,pnl_Hlv.Width,pnl_Hlv.Height)
	HLV.Show
	
	If issend Then
	BtnSave.Enabled=False
	Else
		BtnSave.Enabled=True
		End If
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-Activity_Create")
	End Try
End Sub



Private Sub LoadCheck
	Try
	OriginallstCheck.Clear
	SumMablaghCheck=0
	
	Dim cu As Cursor=MCode.Result("select * from TblCheckDaryafti where fldShomareDaryaft="&ShomareDaryafti &" and fldShomareFactor="&ShomareFactor )
	Log(cu.RowCount)
		If cu.RowCount>0 Then
			
			For i=0 To cu.RowCount-1
				cu.Position=i
				Dim item As AdapterListCheckDaryafti
				item.Initialize
				item.ID=cu.GetInt("ID")
				item.fldShomareCheck=cu.GetString("fldShomareCheck")
				item.fldShomareHesab=cu.GetString("fldShomareHesab")
				item.fldShomareDaryaft=cu.GetString("fldShomareDaryaft")
				item.fldMablagh=cu.GetString("fldMablagh")
				item.fldShobe=cu.GetString("fldShobe")
				item.fldSharh=cu.GetString("fldSharh")
				item.fldDate=cu.GetString("fldDate")
				item.fldDateSarResid=cu.GetString("fldDateSarResid")
				item.fldCodeBank=cu.GetString("fldCodeBank")
				item.fldNameBank=cu.GetString("fldNameBank")
				item.fldCodeSahebeCheck=cu.GetString("fldCodeSahebeCheck")
				item.fldNameSahebeCheck=cu.GetString("fldNameSahebeCheck")
				item.count=cu.RowCount
				SumMablaghCheck=SumMablaghCheck+item.fldMablagh
				OriginallstCheck.Add(item)
			Next
			lstCheck=OriginallstCheck
		HLV.notifyDataSetChanged
		End If
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-LoadCheck")
	End Try
	
End Sub

Private Sub HLV_onCreateViewHolder (Parent As Panel, ViewType As Int)      '💎 onCreate 💎'
	Dim rec As cls_RizCheck
	rec.Initialize(Me)
	Parent.AddView(rec.Panel,0,0,100%x,rec.Height)
	Parent.Tag=rec
End Sub
Sub HLV_onBindViewHolder (Parent As Panel, Position As Int)         '💠 onBind 💠'
	Dim item As AdapterListCheckDaryafti=lstCheck.Get(Position)
	Dim rec As cls_RizCheck=Parent.Tag
	rec.show(item,issend)
	Parent.Height=rec.Height
End Sub
Sub HLV_GetItemCount As Int 								        '💯 ItemCount 💯'
	Return lstCheck.Size '/ItemList.Size
End Sub

Sub LoadBank
	Try
	Dim cr1 As Cursor=MCode.Result("Select * from TblBankMoshtari")
	lstCodeBank1.Clear
	For i=0 To cr1.RowCount-1
		cr1.Position=i
		NSN_BankD.Add(cr1.GetString("fldNameBank"))
		lstCodeBank1.Add(cr1.GetString("fldCodeBank"))
	Next
	CodeBank1=lstCodeBank1.Get(0)
	NameBank1=NSN_BankD.Text
	Log(CodeBank1)
		Log(NameBank1)
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-LoadBank")
	End Try
End Sub



Private Sub BtnSave_Click
	Try
	If txtShomareCheck.Text="0" Or txtShomareCheck.Text="" Then
		ToastMessageShow("لطفا شماره چک را وارد نمایید",False)
		txtShomareCheck.SelectionStart=0
		Return
		Else
			If txtShomareCheck.Text.Length<5 Or txtShomareCheck.Text.Length>20 Then
				ToastMessageShow("تعداد کاراکتر شماره چک نا معتبر می باشد",False)
				Return
			End If
	End If
	
	If txtShomareHesab.Text="0" Or txtShomareHesab.Text="" Then
		ToastMessageShow("لطفا شماره حساب را وارد نمایید",False)
		txtShomareHesab.SelectionStart=0
		Return
		Else
			If txtShomareHesab.Text.Length<5 Or txtShomareHesab.Text.Length>20 Then
				ToastMessageShow("تعداد کاراکتر شماره حساب نا معتبر می باشد",False)
				Return
			End If
	End If
	If txtMablagh.Text="0" Or txtMablagh.Text="" Then
		ToastMessageShow("لطفا مبلغ را وارد نمایید",False)
		txtMablagh.SelectionStart=0
		Return
	End If
	If BtnDateSarResid.Text="تعیین تاریخ" Then
		ToastMessageShow("لطفا تاریخ سررسید را وارد نمایید",False)
		BtnDateSarResid.RequestFocus
		Return
	End If
'	If txtShobe.Text="" Then
'		ToastMessageShow("لطفا شعبه را وارد نمایید",False)
'			txtShobe.SelectionStart=0
'		Return
'	End If
	
		NameBank1=NSN_BankD.Text
		Log(CodeBank1)
		Log(NameBank1)
	
	Dim date As String=MCode.ConvertNumbersPersian2English(MCode.DatePersian)
	Dim item As AdapterListCheckDaryafti
	item.Initialize
	item.fldShomareCheck=txtShomareCheck.Text
	'Dim n As Long=txtShomareCheck.Text
	item.fldShomareHesab=txtShomareHesab.Text
	item.fldShomareDaryaft=ShomareDaryafti
	item.fldMablagh=txtMablagh.Text.Replace(",","")
	item.fldShobe=txtShobe.Text
	item.fldSharh=TxtSharh.Text
	item.fldDate=date
	item.fldDateSarResid=DateCheck
	item.fldCodeBank=CodeBank1
	item.fldNameBank=NameBank1
	item.fldCodeSahebeCheck=CodeMoshtari
	item.fldNameSahebeCheck=NameMoshtari
	item.fldShomareFactor=ShomareFactor
	
		MCode.SaveUpdate("insert into TblCheckDaryafti(fldShomareCheck,fldShomareHesab,fldShomareDaryaft,fldMablagh,fldShobe,fldSharh,fldDate,fldDateSarResid,fldCodeBank,fldNameBank,fldCodeSahebeCheck,fldNameSahebeCheck,fldShomareFactor,fldCodeVaste) values('"&txtShomareCheck.Text & _
		"','"& txtShomareHesab.Text &"'"& _
		",'"& ShomareDaryafti &"'"& _
		",'"& txtMablagh.Text.Replace(",","") &"'"& _
		",'"& txtShobe.Text &"'"& _
		",'"& TxtSharh.Text &"'"& _
		",'"& date &"'"& _
		",'"& DateCheck &""& _
		"',"& CodeBank1 &""& _
		",'"& NameBank1 &"'"& _
		",'"& CodeMoshtari &"'"& _
		",'"& NameMoshtari &"'"& _
		",'"& ShomareFactor &"'"& _
		",'"& MCode.C_Visitor &"'"& _
		")")
	SumMablaghCheck=SumMablaghCheck+item.fldMablagh
		lstCheck.Add(item)
		
		HLV.notifyDataSetChanged
		txtShomareCheck.Text=""
		txtShomareHesab.Text=""
		txtMablagh.Text=0
		txtShobe.Text=""
		TxtSharh.Text=""
		BtnDateSarResid.Text="تعیین تاریخ"
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-BtnSave_Click")
	End Try
End Sub

Sub btn_Back_Click
	Activity.Finish
	CallSubDelayed(Act_Mali,"SaveCheck")
End Sub

Private Sub BtnDateSarResid_Click
	Dim p As PersianMaterialDatePicker
	p.Initialize("p",p.PersianYear,p.PersianMonth,p.PersianDay)
	p.AccentColor = Colors.RGB(83,99,255)
	p.OkText = "تایید"
	p.CancelText = "لغو"
	p.Title = "از تاریخ"
	p.Typeface = "iransansmonospacednum.ttf"
	p.Show("p")
End Sub


Sub p_onDateSet(year As Int,month As Int,day As Int)
	Log(year&"/"&month&"/"&day)
	BtnDateSarResid.Text=year&"/"&NumberFormat(month,2,0)&"/"&NumberFormat(day,2,0)
	DateCheck=year&NumberFormat(month,2,0)&NumberFormat(day,2,0)
End Sub

Sub p_onCancel
	Log("cancel")
End Sub

Sub p_onDismiss
	Log("dismiss")
End Sub

Sub NSN_BankD_ItemClick (Position As Int, Value As Object)
	Try
	CodeBank1=lstCodeBank1.Get(Position)
	NameBank1=Value
	Log(CodeBank1)
		Log(NameBank1)
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-NSN_BankD_ItemClick")
	End Try
	
End Sub

Sub Activity_Resume
	LoadCheck

	
	
	

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Private Sub txtShomareCheck_TextChanged (Old As String, New As String)
	Dim no As Long
	If MCode.ConvertNumbersPersian2English(Old) <> MCode.ConvertNumbersPersian2English(New) Then
		Try
			no = txtShomareCheck.Text
			txtchanged=True
			Log(no)
		Catch
			no=0
			txtShomareCheck.Text="0"
		End Try
	End If
	If txtchanged Then
		txtchanged=False
		txtShomareCheck.Tag=no
		txtShomareCheck.Text=no
	End If
	txtShomareCheck.SelectionStart=txtShomareCheck.Text.Length
End Sub

Private Sub txtShomareHesab_TextChanged (Old As String, New As String)
	Dim no As Long
	If MCode.ConvertNumbersPersian2English(Old) <> MCode.ConvertNumbersPersian2English(New) Then
		Try
			no = txtShomareHesab.Text
			txtchanged=True
			Log(no)
		Catch
			no=0
			txtShomareHesab.Text="0"
		End Try
	End If
	If txtchanged Then
		txtchanged=False
		txtShomareHesab.Tag=no
		txtShomareHesab.Text=no
	End If
	txtShomareHesab.SelectionStart=txtShomareHesab.Text.Length
End Sub


'Private Sub txtShomareHesab_TextChanged (Old As String, New As String)
'	If txtShomareHesab.Text.Length<12 Then
'		txtShomareHesab.Text=Old
'		txtShomareHesab.SelectionStart=txtShomareHesab.Text.Length
'	End If
'End Sub

Private Sub txtMablagh_TextChanged (Old As String, New As String)
	Dim no As Long
	If MCode.ConvertNumbersPersian2English(Old) <> MCode.ConvertNumbersPersian2English(New) Then
		Try
			no = txtMablagh.Text.Replace(",","")
			txtchanged=True
			Log(no)
		Catch
			no=0
		End Try
	End If
	If txtchanged Then
		txtchanged=False
		txtMablagh.Tag=no
		txtMablagh.Text=NumberFormat2(no,0,0,0,True)
	End If
	txtMablagh.SetSelection(txtMablagh.Text.Length,0)
End Sub

Sub Activity_KeyPress (KeyCode As Int) As Boolean 'Return True to consume the event
	If KeyCode=KeyCodes.KEYCODE_BACK Then
		Key.HideKeyboard
		btn_Back_Click
	End If
	Return True
End Sub

Sub Application_Error (Error As Exception, StackTrace As String) As Boolean
'	MCode.ScheduleRestartCrashedActivity(DateTime.Now + 300, Activity.Title, Error)
	Return True
End Sub