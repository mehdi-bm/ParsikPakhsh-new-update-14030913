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
	Dim Faktor As AdapterListFaktor
	Dim th As Thread
End Sub

Sub Globals
'	Dim HLV As Hitex_LayoutView
	Dim Table1 As Table
	Dim Key As IME
	Dim Listkala As List
	Private LblNoeTasvie As Label
	Private LblNameMoshtari As Label
	Private TxtSharhFaktor As Label
	Private LblTotalFaktor As Label
	Private Btn_print As Button
	Private Btn_SendFactor As Button
	Private Btn_del As Button
	Private Btn_Edit As Button
'	Private pnl_HLV As Panel
	Private PnlTable As Panel
	
	Private LblGHabelePardakht As Label
	Private LblMandeGhabl As Label
	Private LblTakhfifVizhe As Label
	Private LblTakhfifRiali As Label
	Private LblTakhfifKala As Label
	Private LblTotalFaktor2 As Label
	Dim Item1 As AdapterListKala
	Private LblMablaghKhales As Label
	Private lblShomareFactor As Label
	Dim mablaghFinal As String
	Private lblShomareForoosh As Label
	Private btnMarjooii As Button
	Dim isMarjoei As String="False"
	Private lblCheckAmani As Label
	Private lblType As Label
	Private lblVaziat As Label
	Private lblDarsadArzeshAfzode As Label
	Private lblArzeshAfzode As Label
	Private lblMablaghBadAzTakhfif As Label
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Activity.LoadLayout("L_RizFaktor")
'	HLV.Initializer("HLV").ListView.Build
'	pnl_HLV.AddView(HLV,0,0,pnl_HLV.Width,pnl_HLV.Height)
	Key.Initialize("Key")
	Listkala.Initialize
	
	'Dim isPos As Int = myCode.getSetting("setting.dat","isPos",0)
'	Select Case isPos
'		Case 1
'			Btn_print.Enabled=True
'		Case 0
'			Btn_print.Enabled=False
'	End Select
	
	Table1.Initialize(Me, "Table1",9)
	Table1.AddToActivity(PnlTable, 0,0,100%x,PnlTable.Height)
	
	'LoadListKalaFaktor
'	HLV.Show
	th.Initialise("th")
'	LoadListKalaFaktor

'	Table1.Initialize(Me, "Table1",5)
'	Table1.AddToActivity(PnlTable, 0,0,100%x,PnlTable.Height)
'	Grid
End Sub

Sub Grid
	Sleep(200)
	Dim Lst_ColNameTitle As List
	Lst_ColNameTitle.Initialize
'	Lst_ColNameTitle.AddAll(Array As String("ردیف","نام کالا","قیمت فی","فی تخفیف","تعداد جزء","واحد جزء","تعداد کل","واحد کل","کد کالا","قیمت مصرف کننده","توضیحات"))
	Lst_ColNameTitle.AddAll(Array As String("ردیف","نام کالا","کد کالا","فروش فی","بعد از تخفیف فی","تخفیف ویژه","درصد تخفیف","تخفیف کالا","درصد ارزش افزوده","مبلغ ارزش افزوده","تعداد جزء","واحد جزء","تعداد کل","واحد کل","توضیحات"))
	'Dim Query As String = "Select FldNamekala,Cast(Round(FldFeeForoosh,'"& MCode.RaghamAshar &"') As Int) As FldFeeForoosh,Cast(Round(fldFeeBadAzTakhfif,'"& MCode.RaghamAshar &"') As Int) As fldFeeBadAzTakhfif,FldTedadDarSabadJoz,fldNamevahed,FldTedadDarSabadKol,fldNameVahed2,FldCodeKala,FldMablaghMasrafKonande,FldTozihat From TblFaktor Where FldShomareFaktor = '"& MCode.FaktorSelect &"'"
	'Table1.LoadSQLiteDB(File.DirDefaultExternal &"/"Parsik"",""Parsik"_db.db",MCode.Sql1, Query)
	Table1.LoadSList(Listkala,Lst_ColNameTitle,15)
'	Table1.SetColumnsWidths(Array As Int(100dip, 80dip,50dip,90dip,150dip))
'	Table1.SetColumnsWidths(Array As Int(50dip,200dip,100dip, 100dip,50dip,80dip,50dip,80dip,80dip,80dip,100dip))
	Table1.SetColumnsWidths(Array As Int(50dip,100dip,70dip,70dip,70dip,70dip,50dip,50dip,50dip,100dip,80dip,50dip,90dip,80dip,150dip))
'	Table1.SetHeader(Array As String("قیمت","واحد","مقدار","فی","نام کالا"),Array As Int(100dip, 80dip,50dip,90dip,150dip))
	'Table1.SetHeader(Array As String("ردیف","نام کالا","قیمت فی","فی تخفیف","تعداد جزء","واحد جزء","تعداد کل","واحد کل","کد کالا","قیمت مصرف کننده","توضیحات"),Array As Int(50dip,200dip,100dip, 100dip,50dip,80dip,50dip,80dip,80dip,80dip,100dip))
End Sub

Sub CreatePge
	Sleep(200)
'	Try
	TxtSharhFaktor.Text = Faktor.fldTozihFaktor
	MCode.Tozihat_faktor=Faktor.fldTozihFaktor
	Dim CuTasview As Cursor = MCode.Result("Select * From TblTasvie Where FldCode = '"& Faktor.fldC_Tasvie &"'")
	If CuTasview.RowCount>0 Then
		CuTasview.Position=0
		LblNoeTasvie.Text = CuTasview.GetString("FldName")
		MCode.NoeTasvieFaktor=CuTasview.GetString("FldName")
	End If
	'MCode.MablaghKol=Faktor.fldTotalFaktor+(Faktor.FldTakhfifKala+Faktor.FldTakhfifVizhe)
	LblTotalFaktor.Text = NumberFormat(myCode.Is_Null_adad(Faktor.fldMablaghKol),1,3) & " " & MCode.VahedPool
	

	LblTotalFaktor2.text = NumberFormat(myCode.Is_Null_adad(Faktor.fldMablaghKol),1,3) & " " & MCode.VahedPool
	Try
		If Faktor.fldTozihFaktor = "" Then
			TxtSharhFaktor.Text = ""
		End If
	Catch
		TxtSharhFaktor.Text = ""
	End Try
		
'	Sleep(100)
	Dim Cu1 As Cursor = MCode.Result("Select * From TblAshkhas where fldCodetafzili='"& Faktor.fldC_Ashkhas &"'")
	If Cu1.RowCount>0 Then
		Cu1.Position=0
		LblNameMoshtari.Text=Cu1.GetString("fldSharheTafzili")
		Faktor.C_Name=Cu1.GetString("fldSharheTafzili")
		
		If IsNumber(Cu1.GetString("fldMande")) = True Then
			LblMandeGhabl.text = NumberFormat(Cu1.GetString("fldMande"),1,3) & " " & MCode.VahedPool
			Faktor.fldSumMandeAzGhabl=Cu1.GetString("fldMande")
		Else
			LblMandeGhabl.text = "-"
			Faktor.fldSumMandeAzGhabl=0
		End If
	Else
		ToastMessageShow("اطلاعات مشتری یافت نشد احتمالا از لیست مشتریان شما حذف شده است",True)
		LblNameMoshtari.Text="نام مشتری یافت نشد"
	End If
	
	
	LblTakhfifKala.text = NumberFormat(myCode.Is_Null_adad(Faktor.FldTakhfifKala),1,3) & " " & MCode.VahedPool
	LblTakhfifVizhe.text = NumberFormat(myCode.Is_Null_adad(Faktor.FldTakhfifVizhe),1,3) & " " & MCode.VahedPool
	lblMablaghBadAzTakhfif.Text=myCode.AdadToPrice(Faktor.fldSumMablaghBadAzTakhfif)
	LblMablaghKhales.text = NumberFormat(myCode.Is_Null_adad(Faktor.fldTotalFaktor),1,3) & " " & MCode.VahedPool
	LblGHabelePardakht.text = NumberFormat(myCode.Is_Null_adad(Faktor.fldTotalFaktor),1,3) & " " & MCode.VahedPool
	
	If MCode.Amani=1 Then
		lblCheckAmani.Visible=True
	Else
		lblCheckAmani.Visible=False
	End If
	
'		LblNameMoshtari.Text = Faktor.C_Name
'	Catch
'		Log(LastException)
'	End Try
'	Dim isPos As Int = myCode.getSetting("setting.dat","isPos",0)
'	Select Case isPos
'		Case 1
'			Btn_print.Enabled=True
'		Case 0
'			Btn_print.Enabled=False
'	End Select
	Grid
	
End Sub

Sub LoadListKalaFaktor
	Sleep(200)
	Listkala.Clear
'	Dim Cu As Cursor = MCode.Result("Select * From TblFaktor Where FldShomareFaktor = '"& Faktor.fldShomareFaktor &"'")
	If MCode.IsOnlineDataFactor=0 Then
		lblShomareFactor.Text=MCode.FaktorSelect
		Dim Cu As Cursor = MCode.Result("Select * From TblFaktor Where FldShomareFaktor = '"& MCode.FaktorSelect &"' and FldC_Tafzili="& Faktor.fldC_Ashkhas)
		If Cu.RowCount>0 Then
			
			Faktor.fldDarsadArzeshAfzode=0
			Faktor.fldArzeshAfzode=0
			Faktor.FldTakhfifKala=0
			Faktor.FldTakhfifVizhe=0
			Faktor.fldSumMablaghBadAzTakhfif=0
			
			For i=0 To Cu.RowCount-1
				Try
					Cu.Position=i
					Dim Item As AdapterListKala
					Item.CodeKala=Cu.Getstring("FldCodeKala")
					Item.NameKala=Cu.Getstring("FldNamekala")
					MCode.C_Tafzili=Cu.Getstring("FldC_Tafzili")
					Item.FeeForoosh=Cu.Getstring("FldFeeForoosh")
					Item.FldFeeBadAzTakhfif=Cu.Getstring("fldFeeBadAzTakhfif")
					Item.NameVahed=Cu.Getstring("FldNameVahed")
					Item.NameVahed2=Cu.Getstring("FldNameVahed2")
					Item.fldPathPic=Cu.Getstring("fldPathPic")
					Item.TedadDarSabadJoz=Cu.Getstring("FldTedadDarSabadJoz")
					Item.TedadDarSabadKol=Cu.Getstring("FldTedadDarSabadKol")
					Item.TedadDarKarton=Cu.Getstring("FldTedadDarKarton")
					Item.FldMablaghMasrafKonande=Cu.Getstring("FldMablaghMasrafKonande")
					Item.MablaghTakhfif=myCode.Is_Null_adad(Cu.Getstring("FldMablaghTakhfif"))
					Item.fldDarsadTakhfif=myCode.Is_Null_adad(Cu.Getstring("FldDarsadTakhfif"))
					Item.fldArzeshAfzode=myCode.Is_Null_adad(Cu.Getstring("fldArzeshAfzode"))
					Dim fldDarsadArzeshAfzode  As Int=myCode.Is_Null_adad(Cu.Getstring("fldDarsadArzeshAfzode"))
					Item.fldDarsadArzeshAfzode=fldDarsadArzeshAfzode
					Item.fldShomareForoosh=myCode.Is_Null_adad(Cu.Getstring("fldShomareForoosh"))
					Item.Tozihat=myCode.Is_Null(Cu.Getstring("FldTozihat"))
					Log(myCode.Is_Null(Cu.Getstring("FldTozih")))
					Item.SumMande=myCode.Is_int(Cu.Getstring("FldSumMande"))
					Faktor.fldDarsadArzeshAfzode=fldDarsadArzeshAfzode
					Faktor.fldArzeshAfzode=myCode.Is_Null_adad(Faktor.fldArzeshAfzode)+myCode.Is_Null_adad(Cu.Getstring("fldArzeshAfzode"))
					
					Faktor.fldSumMablaghBadAzTakhfif=Faktor.fldSumMablaghBadAzTakhfif+Item.FldFeeBadAzTakhfif
					
					lblArzeshAfzode.Text=myCode.AdadToPrice(Faktor.fldArzeshAfzode)
					
					Faktor.Signature=myCode.Is_Null(Cu.Getstring("FldSignatureBitmapString"))
					Faktor.fldTozihFaktor=myCode.Is_Null(Cu.Getstring("FldTozih"))
					Faktor.fldC_Tasvie = Cu.Getstring("FldVaziatPardakht")
					Faktor.fldTotalFaktor = myCode.Is_Null_adad(Cu.Getstring("FldTotalFaktor"))
					Faktor.FldTakhfifKala =Faktor.FldTakhfifKala+ myCode.Is_Null_adad(Cu.Getstring("FldSumMablaghTakhfifKala"))
					Faktor.FldTakhfifVizhe =Faktor.FldTakhfifVizhe+ myCode.Is_Null_adad(Cu.Getstring("FldSumMablaghTakhfifVizhe"))
					Faktor.fldMablaghKol = myCode.Is_Null_adad(Cu.Getstring("FldMablaghKol"))
					Faktor.fldC_Ashkhas = Cu.Getstring("FldC_Tafzili")
					lblShomareForoosh.Text=Item.fldShomareForoosh
					isMarjoei = Cu.Getstring("WIsBacked")
					If isMarjoei="True" Then
						lblType.Text="فاکتور مرجوعی"
						
					Else
						lblType.Text="فاکتور فروش"
					End If
					If Cu.Getstring("FldSync")="True" Then
						Faktor.synced=True
						lblVaziat.Text="سفارش ارسال شده"
						If lblShomareForoosh.Text>0   Then
							lblVaziat.Text="سفارش تکمیل شده"
							Dim cu1 As Cursor=MCode.Result("Select * from TblFaktor where fldShomareForoosh="&Item.fldShomareForoosh & " and WIsBacked='True'")
							If cu1.RowCount>0 And Cu.Getstring("FldType")<>"Marjoee" Then
								lblVaziat.Text="سفارش مرجوع شده"
							End If
						End If
					Else
						Faktor.synced=False
						lblVaziat.Text="سفارش ارسال نشده"
					End If
					
					
					If myCode.Is_Null_adad(Cu.Getstring("FldAmani"))=0 Then
						lblCheckAmani.Text=Chr(0xE835)
						'lblCheckAmani.TextColor=Colors.Red
					Else
						lblCheckAmani.Text=Chr(0xE834)
						'lblCheckAmani.TextColor=Colors.Green
					End If
					
					If Cu.Getstring("FldAmani") =Null Then
						MCode.SaveUpdate("Update TblFaktor Set FldAmani='0' Where FldShomareFaktor = '"& MCode.FaktorSelect &"'")
					End If
					If Cu.Getstring("fldShomareForoosh") =Null Then
						MCode.SaveUpdate("Update TblFaktor Set fldShomareForoosh='0' Where FldShomareFaktor = '"& MCode.FaktorSelect &"'")
					End If
					If Cu.Getstring("FldDarsadTakhfif") =Null Then
						MCode.SaveUpdate("Update TblFaktor Set FldDarsadTakhfif='0' Where FldShomareFaktor = '"& MCode.FaktorSelect &"'")
					End If
'					Log("fldShomareFactorReal" &Cu.Getstring("fldShomareFactorReal"))
'					If Cu.Getstring("fldShomareFactorReal") =Null Then
'						MCode.SaveUpdate("Update TblFaktor Set fldShomareFactorReal='0' Where FldShomareFaktor = '"& MCode.FaktorSelect &"'")
'					End If
					
					Listkala.Add(Item)
					If MCode.SendMarjoie=1 And Item.fldShomareForoosh>0 And Cu.Getstring("FldType")<>"Marjoee" Then					
						btnMarjooii.Enabled=True					
						Else
						btnMarjooii.Enabled=False
					End If
					
				Catch
					Log(LastException)
				End Try
			Next 
		End If
	Else
		Listkala.Clear
		Log("load faktor online")
		ProgressDialogShow2("در حال دریافت اطلاعات . . .",False)
		MCode.C_Tafzili=Faktor.fldC_Ashkhas
		CallSubDelayed2(Service_Server,"GetReportRizePishFactor",Faktor.fldShomareFaktor)
		lblShomareFactor.Text=Faktor.fldShomareFaktor
		ProgressDialogShow2("لطفا صبر کنید . . .",False)		
	End If
	
	
	If Faktor.synced = False Then
		Btn_SendFactor.Enabled=True
		Btn_del.Enabled=True
		Btn_Edit.Enabled=True
	Else
		'Btn_SendFactor.Enabled=False
		Btn_del.Enabled=False
		Btn_Edit.Enabled=False
	End If

	CreatePge
End Sub

'Sub HLV_GetItemCount As Int 								        '💯 ItemCount 💯'
'	Return Listkala.Size
'End Sub
'
'Sub HLV_onCreateViewHolder (Parent As Panel, ViewType As Int)      '💎 onCreate 💎'
'	Dim rec As cls_RecRizFaktor
'	rec.Initialize
'	Parent.AddView(rec.Panel,0,0,100%x,rec.Height)
'	Parent.Tag=rec
'End Sub
'
'Sub HLV_onBindViewHolder (Parent As Panel, Position As Int)         '💠 onBind 💠'
'	Dim Item = Listkala.Get(Position) As AdapterListKala
'	Dim rec As cls_RecRizFaktor=Parent.Tag
'	rec.show_data(Item)
'	Parent.Height=rec.Height
'End Sub

Sub LblBack_Click
	Activity_KeyPress(KeyCodes.KEYCODE_BACK)
End Sub

Sub PnlTozihat_Click
	
End Sub

Sub Activity_KeyPress (KeyCode As Int) As Boolean 'Return True to consume the event
	If KeyCode=KeyCodes.KEYCODE_BACK Then

		Activity.Finish
	End If
	Return True
End Sub

Sub Activity_Resume
'	If MCode.IsConnected=False And MCode.ConnectionStatus=1 Then
'		ToastMessageShow("لطفا ارتباط اینترنت گوشی خود را بررسی نمایید",False)
''		Msgbox2Async("لطفا ارتباط اینترنت گوشی خود را بررسی نمایید", "قطعی اینترنت", "باز کردن تنظیمات گوشی", "", "", Null, False)
''		Wait For Msgbox_Result(res As Int)
''		If  res= DialogResponse.POSITIVE Then
''			Dim StartIntent As Intent
''			StartIntent.Initialize("android.settings.SETTINGS", "")
''			StartActivity(StartIntent)
''		End If
'	End If
	th.RunOnGuiThread("LoadListKalaFaktor",Null)
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub FaktorToSabad(marjoee As String)
	Try
		MCode.editFactor=True
		MCode.FaktorSelect=Faktor.FldShomareFaktor
		Dim Cu As Cursor = MCode.Result("Select * From TblFaktor Where FldShomareFaktor = '"& MCode.FaktorSelect &"' ")
		If Cu.RowCount>0 Then
			For i=0 To Cu.RowCount-1
				Cu.Position=i
				Log(Cu.GetString("FldNamekala"))
				Log(Cu.GetString("FldFeeForoosh"))
				MCode.SaveUpdate("Insert Into TblSabad (FldCodeKala,FldNameKala,FldFeeForoosh,fldFeeBadAzTakhfif,FldNamevahed,FldNameVahed2,fldPathPic,FldTedadDarSabadJoz,FldTedadDarSabadKol,FldTozihat,FldMablaghMasrafKonande,FldSumMande,fldDarsadArzeshAfzode,fldArzeshAfzode,FldTedadDarKarton,FldMablaghTakhfif,FldDarsadTakhfif,FldVaziatPardakht,FldAmani,fldShomareForoosh,fldSharh) Values ('"& _
						Cu.GetString("FldCodeKala") &"','"& Cu.GetString("FldNamekala") &"','"& Cu.GetString("FldFeeForoosh") &"','"& _
						 Cu.GetString("fldFeeBadAzTakhfif") &"','"& Cu.GetString("FldNameVahed") &"','"& _
						  Cu.GetString("FldNameVahed2") &"','"& Cu.GetString("fldPathPic") &"','"& Cu.GetString("FldTedadDarSabadJoz") &"','"& _
						   Cu.GetString("FldTedadDarSabadKol") &"','"& Cu.GetString("FldTozihat") &"','"& _
						    Cu.GetString("FldMablaghMasrafKonande") &"','"& Cu.GetString("FldSumMande") &"','"& _
							 Cu.GetString("fldDarsadArzeshAfzode") &"','"& Cu.GetString("fldArzeshAfzode") &"','"& _
						    Cu.GetString("FldTedadDarKarton")&"','"& Cu.GetString("FldMablaghTakhfif")&"','"& Cu.GetString("FldDarsadTakhfif")&"',"& Cu.GetString("FldVaziatPardakht")&",'"&Cu.GetString("FldAmani")&"','"&Cu.GetString("fldShomareForoosh")&"','"& Cu.GetString("FldTozih")&"')")
				If marjoee="False" Then
				marjoee=Cu.GetString("WIsBacked")
				End If
				MCode.isAmani=Cu.GetString("FldAmani")
			Next
			MCode.SaveUpdate("Update TblSabad Set fldSharh = '' Where fldSharh = ''")
	
		End If
	
'		Dim Cu As Cursor = MCode.Result("Select * From TblFaktor Where FldShomareFaktor = '"& MCode.FaktorSelect &"' And FldFeeForoosh = '0'")
'		If Cu.RowCount>0 Then
'			For i=0 To Cu.RowCount-1
'				Cu.Position=i
'				Dim Cu1 As Cursor = MCode.Result("Select * From TblSabad Where FldCodeKala = '"& Cu.GetString("FldCodeKala") &"'")
'				If Cu1.RowCount>0 Then
'					MCode.SaveUpdate("Update TblSabad Set FldEshantion='"& Cu.GetString("FldTedadDarSabadJoz") & "' Where FldCodeKala = '"& Cu.GetString("FldCodeKala") &"','"& Cu.GetString("FldTozih")&"'")
'				Else
'				
'					MCode.SaveUpdate("Insert Into TblSabad (FldCodeKala,FldNameKala,FldFeeForoosh,fldFeeBadAzTakhfif,FldNamevahed,FldNameVahed2,fldPathPic,FldTedadDarSabadJoz,FldTedadDarSabadKol,FldTozihat,FldMablaghMasrafKonande,FldSumMande,fldDarsadArzeshAfzode,fldArzeshAfzode,FldTedadDarKarton,FldMablaghTakhfif,FldDarsadTakhfif,FldVaziatPardakht,FldAmani,fldShomareForoosh,fldSharh) Values ('"& _
'						Cu.GetString("FldCodeKala") &"','"& Cu.GetString("FldNamekala") &"','"& Cu.GetString("FldFeeForoosh") &"','"& _
'						Cu.GetString("fldFeeBadAzTakhfif") &"','"& Cu.GetString("FldNameVahed") &"','"& _
'						Cu.GetString("FldNameVahed2") &"','"& Cu.GetString("fldPathPic") &"','"& Cu.GetString("FldTedadDarSabadJoz") &"','"& _
'						Cu.GetString("FldTedadDarSabadKol") &"','"& Cu.GetString("FldTozihat") &"','"& _
'						Cu.GetString("FldMablaghMasrafKonande") &"','"& Cu.GetString("FldSumMande") &"','"& _
'						Cu.GetString("fldDarsadArzeshAfzode") &"','"& Cu.GetString("fldArzeshAfzode") &"','"& _
'						Cu.GetString("FldTedadDarKarton")&"','"& Cu.GetString("FldMablaghTakhfif")&"','"& Cu.GetString("FldDarsadTakhfif")&"',"& Cu.GetString("FldVaziatPardakht")&",'"&Cu.GetString("FldAmani")&"','"&Cu.GetString("fldShomareForoosh")&"')")
'					If marjoee="False" Then
'						marjoee=Cu.GetString("WIsBacked")
'					End If
'				End If
'				
'				MCode.isAmani=Cu.GetString("FldAmani")
'			Next
'		End If
		MCode.SaveUpdate("Update TblSabad Set fldSharh = '' Where fldSharh = ''")
		If MCode.Action="UpdateMarjooii" Or MCode.Action="SabtMarjooii" Then
			
			StartActivity(Act_KalaDefault)
		Else
			MCode.Action="SabtFaktor"
			StartActivity(Act_KalaDefault)
		End If
	
		Activity.Finish
	Catch
		Log(LastException.Message)
		myCode.SendError(LastException,Activity.Title&"-FaktorToSabad")
	End Try


End Sub

Sub Btn_SendFactor_Click
	If MCode.IsConnected=False And MCode.ConnectionStatus=1 Then
		ToastMessageShow("لطفا ارتباط اینترنت گوشی خود را بررسی نمایید",False)
		Return
	End If
	ProgressDialogShow2("در حال ارسال موارد انتخابی . . .",False)
	Btn_SendFactor.Enabled=False
	Dim shomarefactor As Int=0
	shomarefactor=MCode.FaktorSelect
	If shomarefactor>0 Then
'		If MCode.C_Tafzili.Length>5 Then
'			MCode.SaveUpdate("Update TblAshkhas Set FldSync='False' where fldCodetafzili="&MCode.C_Tafzili &" and FldSync='True'")
'		End If
		If Faktor.synced=True Then
			Dim Res As Int = Msgbox2("این سفارش قبلا ارسال شده است آیا مجددا ارسال شود؟","توجه","بله","","خیر",Null)
			If Res = DialogResponse.POSITIVE Then
				CallSubDelayed2(Service_Server,"LoadSend",shomarefactor)
				Sleep(1000)
				Activity.Finish
			Else
				Btn_SendFactor.Enabled=True
				ProgressDialogHide
			End If
			
		Else
			CallSubDelayed2(Service_Server,"LoadSend",shomarefactor)
			Sleep(1000)
			Activity.Finish
		End If

	
	End If
	

End Sub

Sub Btn_print_Click
	Act_PrintPic.Faktor	  = Faktor
	Act_PrintPic.listKala = Listkala
	Dim Lst As List = Array As String("چاپ 1","چاپ مولایی")
	Dim res As Int = InputList(Lst,"نوع چاپ را انتخاب نمایید:",-1)
	Select Case res
		Case 0
			Act_PrintPic.TypePrint=res
			StartActivity(Act_PrintPic)
		Case 1
			Act_PrintPic.TypePrint=res
			StartActivity(Act_PrintPic)
	End Select

	
	
	
End Sub

Sub Btn_del_Click
	Dim res As Int = Msgbox2("آیا از حذف این فاکتور مطمئن هستید؟","توجه","بله","","خیر",LoadBitmap(File.DirAssets,"icon.png"))
	If res = DialogResponse.POSITIVE Then
		MCode.CreateBK("")
		MCode.SaveUpdate("Delete From TblFaktor Where FldShomareFaktor = '"& MCode.FaktorSelect &"'")
'		MCode.SaveUpdate("Update TblAshkhas Set FldLastSefaresh = '' Where FldC_Ashkhas = '"& MCode.CodeMoshtari &"'")
'		MCode.SaveUpdate("Update TblVisitorTour Set FldLastSefaresh = '' Where FldC_Ashkhas = '"& MCode.CodeMoshtari &"'")
		SaveLastVisit
		ToastMessageShow("فاکتور مورد نظر حذف گردید",True)
		MCode.FaktorSelect=""
		Activity.Finish
	End If
End Sub

Sub SaveLastVisit
	'ثبت آخرین بازدید مشتری=====================================
	DateTime.DateFormat="yyyy-MM-dd"
	Dim DateMiladi As String = MCode.ConvertNumbersPersian2English(DateTime.Date(DateTime.Now))
	Dim Time As String = MCode.ConvertNumbersPersian2English(DateTime.Time(DateTime.Now))
	Dim D As String = DateMiladi & "T" & Time
	LogColor("D: " & D,Colors.Red)
			
	MCode.SaveUpdate("Update TblAshkhas Set lastOrderDate = '"& D &"' Where fldCodetafzili = '"& MCode.CodeMoshtari &"'")
	'=======================================================
End Sub

Sub Btn_Edit_Click
	
	Dim Cu As Cursor = MCode.Result("Select * From TblSabad")
	If Cu.RowCount>0 Then
		Dim res As Int = Msgbox2("در صورتی که بخواهید این فاکتور را ویرایش کنید ، سبد خرید شما حذف می شود، آیا می خواهید ادامه دهید؟","توجه","بله","","خیر",LoadBitmap(File.DirAssets,"logo.png"))
		If res=DialogResponse.POSITIVE Then
			MCode.SaveUpdate("Delete From TblSabad")
			FaktorToSabad("False")
		End If
	Else
		FaktorToSabad("False")
	End If
	If isMarjoei="True" Then
		MCode.Action="UpdateMarjooii"
		StartActivity(Act_KalaDefault)
	Else
		MCode.Action="SabtFaktor"
		StartActivity(Act_KalaDefault)
	End If
	MCode.Action="SabtFaktor"
End Sub

Sub ReadBlob(Cu As Cursor) As Bitmap
	Cu.Position = 0
	Dim Buffer() As Byte 'declare an empty byte array
'	Buffer = Cu.GetBlob("FldSignatureBitmap")
	Buffer=MCode.Su.DecodeBase64(Cu.Getstring("FldSignatureBitmapString"))
	
	Dim InputStream1 As InputStream
	InputStream1.InitializeFromBytesArray(Buffer, 0, Buffer.Length)
	
'	Dim su As StringUtils
'	Dim StrBlob As StringUtils
'	StrBlob = su.EncodeBase64(Buffer)
'	Log(StrBlob)
	
	Try
		Dim Bitmap1 As Bitmap
		Bitmap1.Initialize2(InputStream1)
		InputStream1.Close
		Return Bitmap1
	Catch
		Log(LastException)
		Return Null
	End Try

End Sub

Sub TakhfifRiali(MablaghKhamFaktor As Long) As Long
	Dim Takhfif As Long
	If MCode.KharidBiashAz > 0 Then
		If MablaghKhamFaktor >= MCode.KharidBiashAz Then
			'Takhfif = (MCode.DarsadTakhfifRiali/100) * (MablaghKhamFaktor - TakhfifKala)
			Log("تخفیف ریالی : " & Takhfif)
			Return Takhfif
		Else
			Return 0
		End If
	Else
		Return 0
	End If
End Sub

Sub TakhfifVizhe(MablaghKhamFaktor As Long) As Long
	Dim Takhfif As Long = (MCode.DarsadTakhfifVizhe/100) * (MablaghKhamFaktor - TakhfifKala - TakhfifRiali(MablaghKhamFaktor))
	Log("تخفیف ویژه : " & Takhfif)
	Return Takhfif
End Sub

Sub TakhfifKala As Long
	Dim Takhfif As String
	Dim Cu2 As Cursor= MCode.Result("SELECT Sum((FldFee - FldFeeBadAzTakhfif) * ((FldTedadKol*FldTedadKarton) + FldTedadJoz)) as SumTakhfif FROM TblFaktor Where FldShomareFaktor = '"& MCode.FaktorSelect &"' And Cast(FldFeeBadAzTakhfif AS Int) > 0 ")
	Cu2.Position = 0
	If Cu2.GetString("SumTakhfif") <> Null Then
		Takhfif = Cu2.GetString("SumTakhfif")
	Else
		Takhfif = 0
	End If
	Log("تخفیف کالا : " & Takhfif)
	Return Takhfif
End Sub

Sub btn_Back_Click
	Activity.Finish
End Sub



Sub LoadData(lst As List)
	
	If lst.Size>0 Then
		Dim FldTakhfifVizhe,FldTakhfifKala As Int=0
	Dim Row As Map
		For i=0 To lst.Size-1
			Row=lst.Get(i)
			Dim Item As AdapterListKala

'			Item.TozihatKala=myCode.Is_Null(Row.Get("fldTozihat"))

		Item.CodeKala=Row.Get("fldCodeKala")
		
		Item.NameKala=Row.Get("fldSharhKala")
			Item.FeeForoosh=Row.Get("fldFeeForoosh")
			Item.FldFeeBadAzTakhfif=myCode.Is_Null_adad(Row.Get("fldFeeBadAzTakhfif"))
			Item.MablaghTakhfif=myCode.Is_Null_adad(Row.Get("MablaghTakhfif"))
			Item.NameVahed=MCode.SingleResult("select FldNameVahed from TblKala where fldCodeKala="&Row.Get("fldCodeKala"))
			Item.NameVahed2=MCode.SingleResult("select FldNameVahed2 from TblKala where fldCodeKala="&Row.Get("fldCodeKala"))
			Item.fldPathPic=Row.Get("fldPathPic")
			Item.TedadDarSabadJoz=Row.Get("fldTedadJoz")
			Item.TedadDarSabadKol=Row.Get("fldTedadCarton")
			Item.TedadDarKarton=Row.Get("fldTedadDarKarton")
			Item.MablaghTakhfif=myCode.Is_Null_adad(Row.Get("fldMablaghTakhfif"))
			If Item.fldFeeBadAzTakhfif>0 Then
				Item.TakhfifKala=Item.FeeForoosh-Item.FldFeeBadAzTakhfif
				FldTakhfifKala=FldTakhfifKala+Item.TakhfifKala
			End If
			If Item.MablaghTakhfif>0 Then
				FldTakhfifVizhe=FldTakhfifVizhe+Item.MablaghTakhfif
			End If
			Item.FldMablaghMasrafKonande=Row.Get("fldGhymatMasrafkonande")
			
			
			Faktor.Signature=Row.Get("FldSignatureBitmapString")
			Item.Tozihat=myCode.Is_Null(Row.Get("fldTozihatRecord"))
			Faktor.fldTozihFaktor = myCode.Is_Null(Row.Get("fldTozihat"))
			
			Listkala.Add(Item)
		Next
		Faktor.FldTakhfifKala=FldTakhfifKala
		Faktor.FldTakhfifVizhe=FldTakhfifVizhe
		'HLV.notifyDataSetChanged
		MCode.IsOnlineDataFactor=0
		CreatePge
	Else
		ProgressDialogHide
		ToastMessageShow("خطا در دریافت اطلاعات",True)
	End If
End Sub
Sub Application_Error (Error As Exception, StackTrace As String) As Boolean
	'MCode.ScheduleRestartCrashedActivity(DateTime.Now + 300, Activity.Title, Error)
	Return True
End Sub

Private Sub btnMarjooii_Click
	'MCode.FaktorSelect = ""
	MCode.Action="SabtMarjooii"
	Dim Cu As Cursor = MCode.Result("Select * From TblSabad")
	If Cu.RowCount>0 Then
		Dim res As Int = Msgbox2("در صورتی که بخواهید این فاکتور را ویرایش کنید ، سبد خرید شما حذف می شود، آیا می خواهید ادامه دهید؟","توجه","بله","","خیر",LoadBitmap(File.DirAssets,"logo.png"))
		If res=DialogResponse.POSITIVE Then
			MCode.SaveUpdate("Delete From TblSabad")
			FaktorToSabad("True")
		End If
	Else
		FaktorToSabad("True")
	End If
End Sub