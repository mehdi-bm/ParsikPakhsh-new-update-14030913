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
	Private ion As Object
	Public ShomareFactor As String
	Public CodeMoshtari As String
	Public NameMoshtari As String
	Public ShomareTell As String
	Public MabalghGhablepardakht As String
	Public MabalghKolFactor As String
	Public ShomareHavale As String
End Sub

Sub Globals
	Public IsSend As Boolean=False
'	Public NSNoeD As Hitex_NiceSpinner
	Public NSN_BankD As Hitex_NiceSpinner
	Public NSN_SandooghD As Hitex_NiceSpinner

	Dim HLV As Hitex_LayoutView
	Dim Key As IME
	Dim err As Int=0
	Dim DateCheck As String
	Private TxtShomareCheckD As EditText
	Private BtnDateCheckD As Button
	Private BtnSaveD As Button
	Private txtchanged As Boolean=False
	Dim ListTarakonesh As List
	Private LblShomareCheckD As Label
	Private LblDateCheckD As Label
	Private LblN_BankD As Label
	Private pnlNDaryaft As Panel

	Private pnl_Hlv As Panel
	Private lastMablag As String
	Private lblDaryaft As Label
'	Private Pnl_Bk As Panel
	Private pnlNSandoogh As Panel
	Private TxtMablaghNaghdi As EditText
	Private lblShomareDaryaft As Label
	Private lblShomareFactor As Label
	Private LblGHabelePardakht As Label
	Private PnlNaghdi As Panel
	Private PnlBanki As Panel
	Private PnlChecki As Panel
	Private TxtSharhNaghdi As EditText
	Private LblSharhNaghdi As Label
	Private LblNSandoogh As Label
	Private LblMablaghNaghdi As Label

	Private LblNBank As Label
	Private TxtSharhBanki As EditText
	Private LblSharhBanki As Label
	Private TxtMablaghChecki As EditText
	Private TxtSharhChecki As EditText
	Private TxtDarsadTakhfif As EditText
	Private TxtMablaghTakhfif As EditText
	Private TxtSharhTakhfif As EditText
	Private LblSharhTakhfif As Label
	Private LblMablaghTakhfif As Label
	Private LblDarsadTakhfif As Label
	Private LblMablaghChecki As Label
	Private btnRizChecki As Panel
	Private LblSharhChecki As Label
	Private TxtMablaghBanki As EditText
	Private PnlNBank As Panel
	Dim c1,c2,c3,c4 As Int
	Dim MablaghDaryafti As Long
	Dim MablaghTakhfif As Long
	Dim Query,DaryaftMode As String
	Dim ShomarhDaryafti,Radif As Int
	Dim CountDaryaft,CountRadif As Int
	Dim lstCodeSandogh As List
	Dim CodeSandogh,NameSandogh As String
	
	Dim lstCodeBank1 As List
	Dim CodeBank1,NameBank1 As String
	Private Tab1 As TabHost
	Private PnlTakhfif As Panel
	Private lblMablaghKolDaryafti As Label
	Private lblMablaghMande As Label
	'Dim action1,action2,action3,action4 As String=0
	'Dim Radif1,Radif2,Radif3,Radif4 As String=0
	Dim id1,id2,id3,id4 As String=0
	Private lblCodeMoshtari As Label
	Private lblNameMoshtari As Label
	Dim lstCheck As List
	Private LblMablaghKolFactor As Label
	Private LblMablaghKolTakhfif As Label
	Private Btn_Delete As Button
	Private Btn_SendInfo As Button
	Private Btn_print As Button
	Private TxtSharhKol As EditText
	Private btnNew As Button
	Private btnBackTrack As Button
	Private btnNextTrack As Button
	Dim ListDaryaft As List
	Dim Current As Int=0
	Dim isnew As Boolean

	'Dim ischange As Boolean
	
	Private btnPaymentCard As Panel
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Activity.LoadLayout("L_Mali")
	Try

		Tab1.AddTab("نقدی","l_Daryaftnaghdi")
		Tab1.AddTab("بانکی","l_Daryaftbanki")
		Tab1.AddTab("چکی","l_Daryaftchecki")
		Tab1.AddTab("تخفیف","l_DaryaftTakhfif")
	
		Btn_SendInfo.Enabled=False
		NSN_BankD.Initialize("NSN_BankD",True,False)
		PnlNBank.AddView(NSN_BankD,0,0,PnlNBank.Width,PnlNBank.Height)
		NSN_BankD.TextColor = Colors.RGB(192,53,38)
		NSN_BankD.Gravity = Gravity.CENTER
		NSN_BankD.Typeface = Typeface.LoadFromAssets("p_font.ttf")
		Dim op As ColorDrawable
		op.Initialize2(Colors.White,5dip,0dip,Colors.Black)
		NSN_BankD.Background=op
	
		NSN_SandooghD.Initialize("NSN_SandooghD",True,False)
		pnlNSandoogh.AddView(NSN_SandooghD,0,0,pnlNSandoogh.Width,pnlNSandoogh.Height)
		NSN_SandooghD.TextColor = Colors.RGB(192,53,38)
		NSN_SandooghD.Gravity = Gravity.CENTER
		NSN_SandooghD.Typeface = Typeface.LoadFromAssets("p_font.ttf")
		Dim op As ColorDrawable
		op.Initialize2(Colors.White,5dip,0dip,Colors.Black)
		NSN_SandooghD.Background=op
	
		Key.Initialize("Key")
		Key.SetCustomFilter(TxtMablaghNaghdi,TxtMablaghNaghdi.INPUT_TYPE_NUMBERS,"0123456789")
		Key.SetCustomFilter(TxtMablaghBanki,TxtMablaghBanki.INPUT_TYPE_NUMBERS,"0123456789")
		Key.SetCustomFilter(TxtMablaghChecki,TxtMablaghChecki.INPUT_TYPE_NUMBERS,"0123456789")
		Key.SetCustomFilter(TxtMablaghTakhfif,TxtMablaghTakhfif.INPUT_TYPE_NUMBERS,"0123456789")
		Key.SetCustomFilter(TxtDarsadTakhfif,TxtDarsadTakhfif.INPUT_TYPE_NUMBERS,"0123456789")
	
	
	
	
		ListDaryaft.Initialize
		lstCodeSandogh.Initialize
		lstCodeBank1.Initialize
		lstCheck.Initialize

'	Pnl_Bk.Height=BtnSaveD.Top + BtnSaveD.Height+10dip	
'	pnl_Hlv.Top = Pnl_Bk.Top + Pnl_Bk.Height
		lblShomareFactor.Text=ShomareFactor
		lblCodeMoshtari.Text=MCode.C_Tafzili
		lblNameMoshtari.Text=MCode.N_Tafzili
		MabalghKolFactor=MabalghGhablepardakht
		LblMablaghKolFactor.Text=myCode.AdadToPrice(MabalghKolFactor)
		LoadSp
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-Activity_Create")
	End Try
End Sub



Sub LoadSp
	Try
		Dim cr As Cursor=MCode.Result("Select * from TblSandoogh")
		lstCodeSandogh.Clear
		For i=0 To cr.RowCount-1
			cr.Position=i
			NSN_SandooghD.Add(cr.GetString("fldNameSandoogh"))
			lstCodeSandogh.Add(cr.GetString("fldCodeSandoogh"))
		Next
	
		Dim cr1 As Cursor=MCode.Result("Select * from TblBankMa")
		lstCodeBank1.Clear
		For i=0 To cr1.RowCount-1
			cr1.Position=i
			NSN_BankD.Add(cr1.GetString("fldNameBank"))
			lstCodeBank1.Add(cr1.GetString("fldCodeBank"))
		Next
		If MCode.PrinterType=1 Then
			btnPaymentCard.Visible=True
		End If
	
'	NSNoeD.Show(Colors.Black, 16)
		NSN_SandooghD.Show(Colors.Black, 16)
		NSN_BankD.Show(Colors.Black, 16)
	
		CodeSandogh=lstCodeSandogh.Get(0)
		NameSandogh=NSN_SandooghD.Text
		Log(CodeSandogh)
		Log(NameSandogh)

		CodeBank1=lstCodeBank1.Get(0)
		NameBank1=NSN_BankD.Text
		Log(CodeBank1)
		Log(NameBank1)
		'NSN_SandooghD.Visible=False
	
		'SaveCheck
		btnNew_Click
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-LoadSp")
	End Try
End Sub

Sub NSN_SandooghD_ItemClick (Position As Int, Value As Object)
	Try
		CodeSandogh=lstCodeSandogh.Get(Position)
		NameSandogh=Value
		Log(CodeSandogh)
		Log(NameSandogh)
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-NSN_SandooghD_ItemClick")
	End Try
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


Sub LoadDaryaft(strShomareDaryaft As String)
	Try
		lblCodeMoshtari.Text=MCode.C_Tafzili
		lblNameMoshtari.Text=MCode.N_Tafzili
		clearAllText
		'check is first
		Dim cuKol As Cursor=MCode.Result("Select * from TblDaryaft")
		If cuKol.RowCount=0 Then
			lblShomareDaryaft.Text=1
			Btn_Delete.Enabled=False
			Btn_SendInfo.Enabled=False
			btnBackTrack.Enabled=False
			btnNextTrack.Enabled=False
			IsSend=False
			GetSum
		Else
			'if is secend
			If strShomareDaryaft=0 Then
				Dim MaxShomareDaryaft As Int=cuKol.RowCount'MCode.SingleResult("select max(fldShomareDaryaft) as Max from TblDaryaft ")
				lblShomareDaryaft.Text=MaxShomareDaryaft+1
				Query="SELECT distinct  fldShomareDaryaft  from TblDaryaft where fldShomareFactor="&ShomareFactor
				If ShomareFactor=0 Then
					Query="SELECT distinct  fldShomareDaryaft  from TblDaryaft where fldShomareFactor=0 and fldCodeTafzili="&lblCodeMoshtari.Text
				End If
				
				Dim cu As Cursor=MCode.Result(Query)
				Current=cu.RowCount
				ListDaryaft.Clear
				For i=0 To cu.RowCount-1
					cu.Position=i
					ListDaryaft.Add(cu.GetString("fldShomareDaryaft"))
				Next
				
				
				Btn_Delete.Enabled=False
				Btn_SendInfo.Enabled=False
				IsSend=False
'				Dim cu As Cursor=MCode.Result("select distinct  fldShomareDaryaft  from TblDaryaft where fldShomareFactor="&ShomareFactor)
'				If cu.RowCount>strShomareDaryaft Then
'					btnNextTrack.Enabled=True
'				Else
'					btnNextTrack.Enabled=False
'				End If
'				
'				If cu.RowCount>1 Then									
'					btnBackTrack.Enabled=True
'					If strShomareDaryaft>cu.RowCount Then
'						btnNextTrack.Enabled=False
'						Else
'						btnNextTrack.Enabled=True
'					End If
'					
'					Else
'					btnBackTrack.Enabled=False
				If Current=0 Then
					btnBackTrack.Enabled=False
				
				Else
					btnBackTrack.Enabled=True
					
				End If
				If ListDaryaft.Size=Current Or ListDaryaft.Size=1 Then
					btnNextTrack.Enabled=False
				Else
					btnNextTrack.Enabled=True
				End If
'				End If
				clearAllText
				GetSum
			Else
				clearAllText
'				Query="SELECT * from TblDaryaft where fldShomareFactor="&ShomareFactor
'				Dim cu As Cursor=MCode.Result(Query)
'				'Current=cu.RowCount
'				ListDaryaft.Clear
'				For i=0 To cu.RowCount-1
'					cu.Position=i
'					ListDaryaft.Add(cu.GetString("fldShomareDaryaft"))
'				Next
				If Current=0 Then
					btnBackTrack.Enabled=False
				
				Else
					btnBackTrack.Enabled=True
					
				End If
				If ListDaryaft.Size=Current Or ListDaryaft.Size=1 Then
					btnNextTrack.Enabled=False
				Else
					btnNextTrack.Enabled=True
				End If
				'get data by shomareDaryaft
				Query="SELECT * from TblDaryaft where fldShomareDaryaft="&strShomareDaryaft & " and fldShomareFactor="&ShomareFactor
				If ShomareFactor=0 Then
					Query="SELECT * from TblDaryaft where fldShomareDaryaft="&strShomareDaryaft & " and fldShomareFactor=0 and fldCodeTafzili="&lblCodeMoshtari.Text
				
				End If
				Dim cu As Cursor=MCode.Result(Query)
				If cu.RowCount>0 Then
				
					Dim sum As String=0
					For i=0 To cu.RowCount-1
						cu.Position=i
						If cu.GetString("fldSend")="1" Then
							BtnSaveD.Enabled=False
							Btn_SendInfo.Enabled=False
							Btn_Delete.Enabled=False
							IsSend=True
						Else
							BtnSaveD.Enabled=True
							Btn_SendInfo.Enabled=True
							Btn_Delete.Enabled=True
							IsSend=False
						End If
'			ShomarhDaryafti=cu.GetString("fldShomareDaryaft")
					
						lblShomareDaryaft.Text=strShomareDaryaft
						TxtSharhKol.Text=cu.GetString("fldSharhKol")
						If cu.GetString("fldType")=0 Then
							'sum=sum+cu.GetString("fldMablaghDaryafti")
							TxtMablaghNaghdi.Text=NumberFormat2(cu.GetString("fldMablaghDaryafti"),0,0,0,True)
							TxtSharhNaghdi.Text=cu.GetString("fldSharh")
							id1=cu.GetInt("ID")
'					Radif1=cu.GetInt("FldRadif")
							CodeSandogh=cu.GetString("fldCodeSandoogh")
							Log(lstCodeSandogh.IndexOf(CodeSandogh))
							NSN_SandooghD.SelectedIndex=lstCodeSandogh.IndexOf(CodeSandogh)
'					action1=1
'				Log(cu.GetString("fldCodeSandoogh"))
						Else if cu.GetString("fldType")=1 Then
							'sum=sum+cu.GetString("fldMablaghDaryafti")
							TxtMablaghBanki.Text=NumberFormat2(cu.GetString("fldMablaghDaryafti"),0,0,0,True)
							TxtSharhBanki.Text=cu.GetString("fldSharh")
							id2=cu.GetInt("ID")
'					Radif2=cu.GetInt("FldRadif")
							CodeBank1= cu.GetString("fldCodeBank")
							Log(lstCodeBank1.IndexOf(CodeBank1))
							NSN_BankD.SelectedIndex=lstCodeBank1.IndexOf(CodeBank1)
'					action2=1
						Else if cu.GetString("fldType")=2 Then
							'sum=sum+cu.GetString("fldMablaghDaryafti")
							TxtMablaghChecki.Text=NumberFormat2(cu.GetString("fldMablaghDaryafti"),0,0,0,True)
							TxtSharhChecki.Text=cu.GetString("fldSharh")
							id3=cu.GetInt("ID")
'					Radif3=cu.GetInt("FldRadif")
'					action3=1
						Else if cu.GetString("fldType")=3 Then
							MablaghTakhfif= cu.GetString("FldMablaghTakhfif")
							TxtMablaghTakhfif.Text=NumberFormat2(MablaghTakhfif,0,0,0,True)
							'LblMablaghKolTakhfif.Text=myCode.AdadToPrice(MablaghTakhfif)
							TxtDarsadTakhfif.Text=myCode.Is_int(cu.GetString("FldDarsadTakhfif"))
							TxtSharhTakhfif.Text=cu.GetString("fldSharh")
							'MabalghGhablepardakht=MabalghKolFactor-MablaghTakhfif
							id4=cu.GetInt("ID")
'					Radif4=cu.GetInt("FldRadif")
'					action4=1
						End If
			
	
					Next
					GetSum

				End If
			End If
		End If
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-LoadDaryaft")
	End Try
End Sub


Sub clearAllText
	TxtMablaghNaghdi.Text=0
	TxtSharhNaghdi.Text=""
	NSN_SandooghD.SelectedIndex=0
	
	TxtMablaghBanki.Text=0
	TxtSharhBanki.Text=""
	NSN_BankD.SelectedIndex=0
	
	TxtMablaghChecki.Text=0
	TxtSharhChecki.Text=""
	
	TxtDarsadTakhfif.Text=0
	TxtMablaghTakhfif.Text=0
	TxtSharhTakhfif.Text=""
	
	TxtSharhKol.Text=""
End Sub

Sub GetSum
	Try
		Query="SELECT * from TblDaryaft where  fldShomareFactor="&ShomareFactor
		If ShomareFactor=0 Then
		
			Query="SELECT * from TblDaryaft where  fldShomareFactor=0 and fldCodeTafzili='"&lblCodeMoshtari.Text&"'"
		End If
		Dim cu As Cursor=MCode.Result(Query)
	
		If cu.RowCount>0 Then
			'Btn_SendInfo.Enabled=True
			Dim sum As String=0
			Dim sumTakhfif As String=0
			For i=0 To cu.RowCount-1
				cu.Position=i
				If cu.GetString("fldType")=0 Then
					sum=sum+cu.GetString("fldMablaghDaryafti")
				Else if cu.GetString("fldType")=1 Then
					sum=sum+cu.GetString("fldMablaghDaryafti")
				Else if cu.GetString("fldType")=2 Then
					sum=sum+cu.GetString("fldMablaghDaryafti")
				Else if cu.GetString("fldType")=3 Then
					MablaghTakhfif= cu.GetString("FldMablaghTakhfif")
					sumTakhfif=sumTakhfif+MablaghTakhfif
				
				End If
			Next
			LblMablaghKolTakhfif.Text=myCode.AdadToPrice(sumTakhfif)
			MabalghGhablepardakht=MabalghKolFactor-sumTakhfif
			LblGHabelePardakht.Text=myCode.AdadToPrice(MabalghGhablepardakht)
			lblMablaghKolDaryafti.Text=myCode.AdadToPrice(sum)
			If lblShomareFactor.Text=0 Then
				lblMablaghMande.Text=myCode.AdadToPrice(MabalghGhablepardakht)
			Else
				Dim mande As String=MabalghGhablepardakht-sum
				lblMablaghMande.Text=myCode.AdadToPrice(mande)
			End If
		Else
			LblGHabelePardakht.Text=0 &" "& MCode.VahedPool
			lblMablaghKolDaryafti.Text=0 &" "& MCode.VahedPool
			LblMablaghKolTakhfif.Text=0 &" "& MCode.VahedPool
			lblMablaghMande.Text=myCode.AdadToPrice(MabalghGhablepardakht)
		End If
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-GetSum")
	End Try
End Sub


Sub BtnSaveD_Click
	Try
	
		Dim status As String="Not Ok"
		Dim sharh As String
		MCode.ShomareDaryaft=lblShomareDaryaft.Text
		MCode.SQL1.BeginTransaction
	
		If TxtSharhKol.Text="" Then
			TxtSharhKol.Text= "  "&lblCodeMoshtari.Text &" _ "&lblNameMoshtari.Text
		Else if TxtSharhKol.Text.Contains("  "&lblCodeMoshtari.Text &" _ "&lblNameMoshtari.Text)=False Then
			TxtSharhKol.Text= TxtSharhKol.Text &"  "&lblCodeMoshtari.Text &" _ "&lblNameMoshtari.Text
		End If
	
		If ShomareHavale="" Then
			ShomareHavale="0"
		End If
		
		Try
			If TxtMablaghNaghdi.Text<>"0" Then
				Log("نقدی")
				lblCodeMoshtari.Text=MCode.C_Tafzili
				lblNameMoshtari.Text=MCode.N_Tafzili
				'block of statements like:
				MablaghDaryafti=TxtMablaghNaghdi.Text.Replace(",","")
				sharh=TxtSharhNaghdi.Text
				If myCode.Is_Null_adad(CodeSandogh)=0 Then
					ToastMessageShow("لیست کد صندوق به خوبی دریافت نشده لطفا دریافت اطلاعات را بزنید",False)
					Return
				End If
					
				Query="SELECT * from TblDaryaft where fldShomareDaryaft="&lblShomareDaryaft.Text & " and fldShomareFactor="&ShomareFactor & " and fldType=0"
				Dim cu As Cursor=MCode.Result(Query)
				If cu.RowCount=0 Then
					Query="INSERT into TblDaryaft(FldRadif,fldShomareDaryaft,fldShomareFactor,fldShomareHavale,fldMablaghDaryafti,FldMablaghTakhfif,fldCodeTafzili,fldSharh,fldCodeVaste,fldCodeSandoogh,FldDateDaryaft,fldCodeBank,fldType,FldSharhKol,FldDarsadTakhfif,fldSharheTafzili,fldShomareTell,fldSend) VALUES("&Radif&","&lblShomareDaryaft.Text&","&ShomareFactor&","&ShomareHavale&","&MablaghDaryafti&",0,'"&lblCodeMoshtari.Text&"','"&sharh&"',"&MCode.C_Visitor&","&CodeSandogh&",'"&MCode.DatePersian&"',0,'0','"&TxtSharhKol.Text &"',0,'"&lblNameMoshtari.Text&"','"&ShomareTell&"',0) "
					MCode.SQL1.ExecNonQuery(Query)
					Log("Sucessful")
					status="OK"
				Else
					If MablaghDaryafti>0 Then
						Dim Fields As Map
						Dim Where As Map
						
						Fields.Initialize
						Where.Initialize

						Fields.Put("fldShomareDaryaft",lblShomareDaryaft.Text)
						Fields.Put("fldShomareHavale",ShomareHavale)
						Fields.Put("fldShomareFactor",ShomareFactor)
						Fields.Put("fldMablaghDaryafti",MablaghDaryafti)
						Fields.Put("fldCodeTafzili",lblCodeMoshtari.Text)
						Fields.Put("fldSharheTafzili",lblNameMoshtari.Text)
						Fields.Put("fldShomareTell",ShomareTell)
						Fields.Put("fldSharh",sharh)
						Fields.Put("fldCodeVaste",MCode.C_Visitor)
						Fields.Put("fldCodeSandoogh",CodeSandogh)
						Fields.Put("FldDateDaryaft",MCode.DatePersian)
						Fields.Put("FldSharhKol",TxtSharhKol.Text)
						Where.Put("fldShomareDaryaft",lblShomareDaryaft.Text)
						Where.Put("fldShomareFactor",lblShomareFactor.Text)
						Where.Put("fldType","0")
						
						DBUtils.UpdateRecord2(MCode.Sql1,"TblDaryaft",Fields,Where)
						Log("Sucessful")
						ToastMessageShow("دریافت نقدی موفقیت بروزرسانی شد",False)
						status="OK"
					End If
				End If
			
	
			Else
				Query="SELECT * from TblDaryaft where fldShomareDaryaft="&lblShomareDaryaft.Text & " and fldShomareFactor="&ShomareFactor & " and fldType=0"
				Dim cu As Cursor=MCode.Result(Query)
				If cu.RowCount>0 Then
					Query="Delete From TblDaryaft where fldShomareDaryaft="& lblShomareDaryaft.Text &" and fldShomareFactor="& ShomareFactor &" and fldType=0 "
					MCode.SQL1.ExecNonQuery(Query)
				End If
			End If
		Catch
			Log(LastException)
			err=1
		End Try
		Try
			If TxtMablaghBanki.Text<>"0" Then
				Log("بانکی")
				lblCodeMoshtari.Text=MCode.C_Tafzili
				lblNameMoshtari.Text=MCode.N_Tafzili
				'block of statements like:
				MablaghDaryafti=TxtMablaghBanki.Text.Replace(",","")
				sharh=TxtSharhBanki.Text
				Query="SELECT * from TblDaryaft where fldShomareDaryaft="&lblShomareDaryaft.Text & " and fldShomareFactor="&ShomareFactor & " and fldType=1"
				Dim cu As Cursor=MCode.Result(Query)
				If cu.RowCount=0 Then
					Query="INSERT into TblDaryaft(FldRadif,fldShomareDaryaft,fldShomareFactor,fldShomareHavale,fldMablaghDaryafti,FldMablaghTakhfif,fldCodeTafzili,fldSharh,fldCodeVaste,fldCodeSandoogh,FldDateDaryaft,fldCodeBank,fldType,FldSharhKol,FldDarsadTakhfif,fldSharheTafzili,fldShomareTell,fldSend) VALUES("&Radif&","&lblShomareDaryaft.Text&","&ShomareFactor&","&ShomareHavale&","&MablaghDaryafti&",0,'"&lblCodeMoshtari.Text&"','"&sharh&"',"&MCode.C_Visitor&","&CodeSandogh&",'"&MCode.DatePersian&"',"&CodeBank1&",'1','"&TxtSharhKol.Text&"',0,'"&lblNameMoshtari.Text&"','"&ShomareTell&"',0) "
					MCode.SQL1.ExecNonQuery(Query)
					Log("Sucessful")
					ToastMessageShow("دریافت بانکی با موفقیت ثبت گردید",False)
					status="OK"
				Else
		
					Dim Fields As Map
					Dim Where As Map
		
					Fields.Initialize
					Where.Initialize
					'Fields.Put("FldRadif",Radif2)
					Fields.Put("fldShomareDaryaft",lblShomareDaryaft.Text)
					Fields.Put("fldShomareFactor",ShomareFactor)
					Fields.Put("fldShomareHavale",ShomareHavale)
					Fields.Put("fldMablaghDaryafti",MablaghDaryafti)
					Fields.Put("fldCodeTafzili",lblCodeMoshtari.Text)
					Fields.Put("fldSharheTafzili",lblNameMoshtari.Text)
					Fields.Put("fldShomareTell",ShomareTell)
					Fields.Put("fldSharh",sharh)
					Fields.Put("fldCodeBank",CodeBank1)
					Fields.Put("FldDateDaryaft",MCode.DatePersian)
					Fields.Put("FldSharhKol",TxtSharhKol.Text)
					Where.Put("fldShomareDaryaft",lblShomareDaryaft.Text)
					Where.Put("fldShomareFactor",lblShomareFactor.Text)
					Where.Put("fldType","1")
						
					DBUtils.UpdateRecord2(MCode.Sql1,"TblDaryaft",Fields,Where)
					Log("Sucessful")
					ToastMessageShow("دریافت بانکی با موفقیت بروزرسانی شد",False)
					status="OK"
				End If
		
			Else
				Query="SELECT * from TblDaryaft where fldShomareDaryaft="&lblShomareDaryaft.Text & " and fldShomareFactor="&ShomareFactor & " and fldType=1"
				Dim cu As Cursor=MCode.Result(Query)
				If cu.RowCount>0 Then
					Query="Delete From TblDaryaft where fldShomareDaryaft="& lblShomareDaryaft.Text &" and fldShomareFactor="& ShomareFactor &" and fldType=1 "
					MCode.SQL1.ExecNonQuery(Query)
				End If
			End If
		Catch
			Log(LastException.Message)
			err=2
				
		End Try
		Try
			If	TxtMablaghChecki.Text<>"0" Then
				Log("چکی")
				lblCodeMoshtari.Text=MCode.C_Tafzili
				lblNameMoshtari.Text=MCode.N_Tafzili
				MablaghDaryafti=TxtMablaghChecki.Text.Replace(",","")
				sharh=TxtSharhChecki.Text
				Query="SELECT * from TblDaryaft where fldShomareDaryaft="&lblShomareDaryaft.Text & " and fldShomareFactor="&ShomareFactor & " and fldType=2"
				Dim cu As Cursor=MCode.Result(Query)
			

				If cu.RowCount=0 Then
					Query="INSERT into TblDaryaft(FldRadif,fldShomareDaryaft,fldShomareFactor,fldShomareHavale,fldMablaghDaryafti,FldMablaghTakhfif,fldCodeTafzili,fldSharh,fldCodeVaste,fldCodeSandoogh,FldDateDaryaft,fldCodeBank,fldType,FldSharhKol,FldDarsadTakhfif,fldSharheTafzili,fldShomareTell,fldSend) VALUES("&Radif&","&lblShomareDaryaft.Text&","&ShomareFactor&","&ShomareHavale&","&MablaghDaryafti&",0,'"&lblCodeMoshtari.Text&"','"&sharh&"',"&MCode.C_Visitor&",0,'"&MCode.DatePersian&"',0,'2','"&TxtSharhKol.Text&"',0,'"&lblNameMoshtari.Text&"','"&ShomareTell&"',0) "
					MCode.SQL1.ExecNonQuery(Query)
					Log("Sucessful")
					ToastMessageShow("دریافت چکی با موفقیت ثبت گردید",False)
					status="OK"
				Else
				
					Dim Fields As Map
					Dim Where As Map
		
					Fields.Initialize
					Where.Initialize
					'Fields.Put("FldRadif",Radif3)
					Fields.Put("fldShomareDaryaft",lblShomareDaryaft.Text)
					Fields.Put("fldShomareFactor",ShomareFactor)
					Fields.Put("fldShomareHavale",ShomareHavale)
					Fields.Put("fldMablaghDaryafti",MablaghDaryafti)
					Fields.Put("fldCodeTafzili",lblCodeMoshtari.Text)
					Fields.Put("fldSharheTafzili",lblNameMoshtari.Text)
					Fields.Put("fldShomareTell",ShomareTell)
					Fields.Put("fldSharh",sharh)
					Fields.Put("FldDateDaryaft",MCode.DatePersian)
					Fields.Put("FldSharhKol",TxtSharhKol.Text)
					Where.Put("fldShomareDaryaft",lblShomareDaryaft.Text)
					Where.Put("fldShomareFactor",lblShomareFactor.Text)
					Where.Put("fldType","2")
						
					DBUtils.UpdateRecord2(MCode.Sql1,"TblDaryaft",Fields,Where)
					Log("Sucessful")
					ToastMessageShow("دریافت چکی با موفقیت بروزرسانی شد",False)
					status="OK"
				End If
		

		
			Else
				Query="SELECT * from TblDaryaft where fldShomareDaryaft="&lblShomareDaryaft.Text & " and fldShomareFactor="&ShomareFactor & " and fldType=2"
				Dim cu As Cursor=MCode.Result(Query)
				If cu.RowCount>0 Then
					Query="Delete From TblDaryaft where fldShomareDaryaft="& lblShomareDaryaft.Text &" and fldShomareFactor="& ShomareFactor &" and fldType=2 "
					MCode.SQL1.ExecNonQuery(Query)
				End If
	
			End If
		Catch
			Log(LastException.Message)
			err=3
				
		End Try
		Try
			If	TxtMablaghTakhfif.Text<>"0" Or TxtDarsadTakhfif.Text<>"0" Then
				Log("تخفیف")
		
				lblCodeMoshtari.Text=MCode.C_Tafzili
				lblNameMoshtari.Text=MCode.N_Tafzili
				'block of statements like:
				If TxtMablaghTakhfif.Text="0" Or TxtMablaghTakhfif.Text="" Then
					Dim darsad As String=TxtDarsadTakhfif.Text
					MablaghTakhfif=(MabalghKolFactor*darsad)/100
				Else
					MablaghTakhfif=TxtMablaghTakhfif.Text.Replace(",","")
				End If
				sharh=TxtSharhTakhfif.Text
				Query="SELECT * from TblDaryaft where fldShomareDaryaft="&lblShomareDaryaft.Text & " and fldShomareFactor="&ShomareFactor & " and fldType=3"
				Dim cu As Cursor=MCode.Result(Query)
				If cu.RowCount=0 Then
					Query="INSERT into TblDaryaft(FldRadif,fldShomareDaryaft,fldShomareFactor,fldShomareHavale,fldMablaghDaryafti,FldMablaghTakhfif,fldCodeTafzili,fldSharh,fldCodeVaste,fldCodeSandoogh,FldDateDaryaft,fldCodeBank,fldType,FldSharhKol,FldDarsadTakhfif,fldSharheTafzili,fldShomareTell,fldSend) VALUES("&Radif&","&lblShomareDaryaft.Text&","&ShomareFactor&","&ShomareHavale&",0,"&MablaghTakhfif&",'"&lblCodeMoshtari.Text&"','"&sharh&"',"&MCode.C_Visitor&",0,'"&MCode.DatePersian&"',0,'3','"&TxtSharhKol.Text&"','"&darsad&"','"&lblNameMoshtari.Text&"','"&ShomareTell&"',0) "
					MCode.SQL1.ExecNonQuery(Query)
					Log("Sucessful")
					ToastMessageShow("دریافت تخفیف با موفقیت ثبت گردید",False)
					status="OK"
				Else
		
					Dim Fields As Map
					Dim Where As Map
		
					Fields.Initialize
					Where.Initialize
					'Fields.Put("FldRadif",Radif4)
					Fields.Put("fldShomareDaryaft",lblShomareDaryaft.Text)
					Fields.Put("fldShomareFactor",ShomareFactor)
					Fields.Put("fldShomareHavale",ShomareHavale)
					Fields.Put("FldMablaghTakhfif",MablaghTakhfif)
					Fields.Put("fldCodeTafzili",lblCodeMoshtari.Text)
					Fields.Put("fldSharheTafzili",lblNameMoshtari.Text)
					Fields.Put("fldShomareTell",ShomareTell)
					Fields.Put("fldSharh",sharh)
					Fields.Put("FldDarsadTakhfif",darsad)
					Fields.Put("FldDateDaryaft",MCode.DatePersian)
					Fields.Put("FldSharhKol",TxtSharhKol.Text)
					Where.Put("fldShomareDaryaft",lblShomareDaryaft.Text)
					Where.Put("fldShomareFactor",lblShomareFactor.Text)
					Where.Put("fldType","3")
						
					DBUtils.UpdateRecord2(MCode.Sql1,"TblDaryaft",Fields,Where)
					Log("Sucessful")
					ToastMessageShow("دریافت تخفیف با موفقیت بروزرسانی شد",False)
					status="OK"
				End If
					
		
		
			Else
				Query="SELECT * from TblDaryaft where fldShomareDaryaft="&lblShomareDaryaft.Text & " and fldShomareFactor="&ShomareFactor & " and fldType=3"
				Dim cu As Cursor=MCode.Result(Query)
				If cu.RowCount>0 Then
					Query="Delete From TblDaryaft where fldShomareDaryaft="& lblShomareDaryaft.Text &" and fldShomareFactor="& ShomareFactor &" and fldType=3 "
					MCode.SQL1.ExecNonQuery(Query)
				End If
			End If
		Catch
			Log(LastException.Message)
			err=4
				
		End Try
		Try
			If status="OK" Then
				MCode.SQL1.TransactionSuccessful
				Btn_SendInfo_Click
				'btnNew_Click
			End If
		Catch
			Log(LastException.Message)
			If err=1 Then
				ToastMessageShow("دریافت نقدی ناموفق بود",False)
			else if err=2 Then
				ToastMessageShow("دریافت بانکی ناموفق بود",False)
			else if err=3 Then
				ToastMessageShow("دریافت چکی ناموفق بود",False)
			else if err=4 Then
				ToastMessageShow("ثبت تخفیف ناموفق بود",False)
			End If
		
		End Try
	
		MCode.SQL1.EndTransaction
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-BtnSaveD_Click")
	End Try
End Sub




Sub Activity_KeyPress (KeyCode As Int) As Boolean 'Return True to consume the event
	If KeyCode=KeyCodes.KEYCODE_BACK Then
		Key.HideKeyboard
		Activity.Finish
	End If
	Return True
End Sub

Sub Activity_Resume
	lblCodeMoshtari.Text=MCode.C_Tafzili
	lblNameMoshtari.Text=MCode.N_Tafzili
End Sub

Sub Activity_Pause (UserClosed As Boolean)
	lblCodeMoshtari.Text=MCode.C_Tafzili
	lblNameMoshtari.Text=MCode.N_Tafzili
End Sub

Public Sub SaveCheck
	Try
		lblCodeMoshtari.Text=MCode.C_Tafzili
		lblNameMoshtari.Text=MCode.N_Tafzili
		Dim mablagh As String=MCode.SingleResult("select sum(fldMablagh) as fldMablagh from TblCheckDaryafti where fldShomareDaryaft="&lblShomareDaryaft.Text &" and fldShomareFactor="&ShomareFactor)
		If IsNumber(mablagh) Then
			TxtMablaghChecki.Text= NumberFormat2(mablagh,0,0,0,True)
		Else
			TxtMablaghChecki.Text=0
		End If
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-SaveCheck")
	End Try
End Sub



Sub TxtMablaghNaghdi_TextChanged (Old As String, New As String)
	Try
		Dim no As Long
		If MCode.ConvertNumbersPersian2English(Old) <> MCode.ConvertNumbersPersian2English(New) Then
			Try
				no = TxtMablaghNaghdi.Text.Replace(",","")
				txtchanged=True
				Log(no)
			Catch
				no=0
				TxtMablaghNaghdi.Text="0"
			End Try
		End If
		If txtchanged Then
			txtchanged=False
			TxtMablaghNaghdi.Tag=no
			TxtMablaghNaghdi.Text=NumberFormat2(no,0,0,0,True)
		End If
		TxtMablaghNaghdi.SetSelection(TxtMablaghNaghdi.Text.Length,0)
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-TxtMablaghNaghdi_TextChanged")
	End Try
End Sub


Sub btn_Back_Click
	Activity.Finish
End Sub


Private Sub TxtMablaghBanki_TextChanged (Old As String, New As String)
	Try
		Dim no As Long
		If MCode.ConvertNumbersPersian2English(Old) <> MCode.ConvertNumbersPersian2English(New) Then
			Try
				no = TxtMablaghBanki.Text.Replace(",","")
				txtchanged=True
				Log(no)
			Catch
				no=0
				TxtMablaghBanki.Text="0"
			End Try
		End If
		If txtchanged Then
			txtchanged=False
			TxtMablaghBanki.Tag=no
			TxtMablaghBanki.Text=NumberFormat2(no,0,0,0,True)
		End If
		TxtMablaghBanki.SetSelection(TxtMablaghBanki.Text.Length,0)
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-TxtMablaghBanki_TextChanged")
	End Try
End Sub

Private Sub TxtMablaghChecki_TextChanged (Old As String, New As String)
	Try
		Dim no As Long
		If MCode.ConvertNumbersPersian2English(Old) <> MCode.ConvertNumbersPersian2English(New) Then
			Try
				no = TxtMablaghChecki.Text.Replace(",","")
				txtchanged=True
				Log(no)
			Catch
				no=0
				TxtMablaghChecki.Text="0"
			End Try
		End If
		If txtchanged Then
			txtchanged=False
			TxtMablaghChecki.Tag=no
			TxtMablaghChecki.Text=NumberFormat2(no,0,0,0,True)
		End If
		TxtMablaghChecki.SetSelection(TxtMablaghChecki.Text.Length,0)
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-TxtMablaghChecki_TextChanged")
	End Try
End Sub

Private Sub TxtDarsadTakhfif_TextChanged (Old As String, New As String)
	Try
		Dim no As Long
		If MCode.ConvertNumbersPersian2English(Old) <> MCode.ConvertNumbersPersian2English(New) Then
			Try
			
				no = TxtDarsadTakhfif.Text
				If no>100 Then
					no=Old
				End If
				txtchanged=True
			
				Log(no)
			Catch
				no=0
				TxtDarsadTakhfif.Text="0"
			End Try
		End If
		If txtchanged Then
			txtchanged=False
			TxtDarsadTakhfif.Tag=no
			TxtDarsadTakhfif.Text=no
		End If
		TxtDarsadTakhfif.SelectionStart=TxtDarsadTakhfif.Text.Length
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-TxtDarsadTakhfif_TextChanged")
	End Try
End Sub

Private Sub TxtMablaghTakhfif_TextChanged (Old As String, New As String)
	Dim no As Long
	If MCode.ConvertNumbersPersian2English(Old) <> MCode.ConvertNumbersPersian2English(New) Then
		Try
			no = TxtMablaghTakhfif.Text.Replace(",","")
			txtchanged=True
			Log(no)
		Catch
			no=0
			TxtMablaghTakhfif.Text="0"
		End Try
	End If
	If txtchanged Then
		txtchanged=False
		TxtMablaghTakhfif.Tag=no
		TxtMablaghTakhfif.Text=NumberFormat2(no,0,0,0,True)
	End If
	TxtMablaghTakhfif.SetSelection(TxtMablaghTakhfif.Text.Length,0)
End Sub

Private Sub btnRizChecki_Click
	Try
		Act_SabtRizCheck.ShomareDaryafti=lblShomareDaryaft.Text
		Act_SabtRizCheck.ShomareFactor=ShomareFactor
		Act_SabtRizCheck.CodeMoshtari=CodeMoshtari
		Act_SabtRizCheck.NameMoshtari=NameMoshtari
		Act_SabtRizCheck.issend=IsSend
	
		StartActivity(Act_SabtRizCheck)
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-btnRizChecki_Click")
	End Try
End Sub


Private Sub Btn_Delete_Click
	Try
		Query="SELECT * from TblDaryaft where fldShomareDaryaft="&lblShomareDaryaft.Text
		Dim cu As Cursor=MCode.Result(Query)
		If cu.RowCount>0 Then
			Dim result As Int
			result = Msgbox2("آیا از حذف اطلاعات دریافتی اطمینان دارید؟", "حذف دریافتی", "بله", "", "خیر", LoadBitmap(File.DirAssets,"icon.png"))
			If result = DialogResponse.Positive Then
				Query="SELECT * from TblCheckDaryafti where fldShomareDaryaft="&lblShomareDaryaft.Text
				Dim cu2 As Cursor=MCode.Result(Query)
				If cu2.RowCount>0 Then
					Query="Delete From TblCheckDaryafti where fldShomareDaryaft="&lblShomareDaryaft.Text
					MCode.SaveUpdate(Query)
				End If
				Query="Delete From TblDaryaft where fldShomareDaryaft="&lblShomareDaryaft.Text
				MCode.SaveUpdate(Query)
				btnNew_Click
				GetSum
'			Activity.Finish
			End If
		Else
			ToastMessageShow("اطلاعاتی جهت حذف وجود ندارد",False)
		End If
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-Btn_Delete_Click")
	End Try
End Sub

Private Sub Btn_SendInfo_Click
	Try
		If MCode.IsConnected=False And MCode.ConnectionStatus=1 Then
			ToastMessageShow("لطفا ارتباط اینترنت گوشی خود را بررسی نمایید",False)
			Return
		End If
		Query="SELECT fldShomareDaryaft,fldShomareHavale,fldMablaghDaryafti,FldDarsadTakhfif as fldDarsadTakhfif"& _
	",FldMablaghTakhfif as fldMablaghTakhfif,fldSharhKol,fldCodeTafzili,fldSharheTafzili,fldShomareTell,fldSharh,fldCodeVaste,fldCodeSandoogh"& _
	",fldCodeBank,FldDateDaryaft as fldDateDaryaft,fldType,fldShomareFactor from TblDaryaft where fldShomareDaryaft="&lblShomareDaryaft.Text
		Dim cu As Cursor=MCode.Result(Query)
		If cu.RowCount>0 Then
			Dim dtDaryaft,dtCheckDaryaft As String
			Dim result As Int
			dtDaryaft=MCode.DtToJson(cu)
			Query="SELECT fldShomareCheck,fldShomareHesab,fldDate,fldDateSarResid,fldCodeBank,fldShobe,fldMablagh as fldMablaghDaryafti,fldCodeSahebeCheck as fldCodeTafzili,fldShomareDaryaft,fldSharh,fldCodeVaste from TblCheckDaryafti where fldShomareDaryaft="&lblShomareDaryaft.Text
			Dim cu2 As Cursor=MCode.Result(Query)
			If cu2.RowCount>0 Then
				dtCheckDaryaft=MCode.DtToJson(cu2)
			End If
			result = Msgbox2("آیا از ارسال اطلاعات دریافتی اطمینان دارید؟", "ارسال دریافتی", "بله", "", "خیر", LoadBitmap(File.DirAssets,"icon.png"))
			If result = DialogResponse.Positive Then
				Service_Server.shomareFactorSelect=lblShomareFactor.Text
				CallSubDelayed3(Service_Server,"LoadSendDaryaft",dtDaryaft,dtCheckDaryaft)
			End If
			Btn_SendInfo.Enabled=False
			Btn_Delete.Enabled=False
			IsSend=True
			btnNew_Click
		Else
			ToastMessageShow("اطلاعاتی جهت ارسال وجود ندارد",False)
		End If
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-Btn_SendInfo_Click")
	End Try
End Sub


Private Sub btnNew_Click
	BtnSaveD.Enabled=True
	LoadDaryaft(0)
End Sub

Private Sub btnBackTrack_Click
	Try
		If btnBackTrack.Enabled=True And Current>0 Then
			Dim shomare As Int=0
			Current=Current-1
			shomare=ListDaryaft.Get(Current)
'			shomare=lblShomareDaryaft.Text-1
			LoadDaryaft(shomare)
		End If
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-btnBackTrack_Click")
	End Try
End Sub

Private Sub btnNextTrack_Click
	Try
		If btnNextTrack.Enabled=True Then
			Dim shomare As Int=0
			Current=Current+1
			If Current = ListDaryaft.Size Then
				btnNew_Click
				Return
			End If
			shomare=ListDaryaft.Get(Current)
'			shomare=lblShomareDaryaft.Text+1
			LoadDaryaft(shomare)
		End If
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-btnNextTrack_Click")
	End Try
End Sub

Sub Application_Error (Error As Exception, StackTrace As String) As Boolean
'	MCode.ScheduleRestartCrashedActivity(DateTime.Now + 300, Activity.Title, Error)
	Return True
End Sub

Private Sub btnPaymentCard_Click
	If TxtMablaghBanki.Text="" Or TxtMablaghBanki.Text="0" Then
		ToastMessageShow("لطفا مبلغ بانکی را وارد نمایید",False)
		Return
	End If
	
	Try
		Dim intent2 As Intent
		intent2.Initialize("com.parsikhesab.parsianpos.Sale", "")
		intent2.SetComponent(MCode.PackageNamePosParsian & "/.MainActivity") ' نام پکیج و کلاس سرویس جاوا
		intent2.PutExtra("CompanyName", MCode.CompanyName) ' ارسال داده به سرویس جاوا
		intent2.PutExtra("AMOUNT", TxtMablaghBanki.Text.Replace(",","")) ' ارسال داده به سرویس جاوا
		intent2.PutExtra("SignCode", "100015") ' ارسال داده به سرویس جاوا
		intent2.PutExtra("additionalData",TxtSharhKol.Text)
		StartActivity(intent2)
	Catch
		Log(LastException)
	End Try
End Sub