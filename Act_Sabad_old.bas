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

Sub Process_Globals
	Dim SQL1 As SQL
	Dim GPS1 As GPS
End Sub

Sub Globals
	Dim jobInternet As HttpJob
	Dim Table1 As Table
	Private LblMablaghKol As Label
	Private LblNameKharidar As Label
	Private AcSpLblVaziatPardakht As ACSpinner
	Dim CheckGps As Boolean
	'Dim ListEslahFaktor As AdapterListFaktor
	Private AcSwNoeFaktor As ACSwitch
	Private MTxtTozih As MaskedEditText
	Dim VaziatPardakhti As String
	Dim feetemp As String
	Dim CodeTafzili As String
	Dim Lat,Lon As String
	Dim lat2,lon2 As String
	Dim MasafatFeali As Long
	Dim loc As LocationManager
	Dim tr As Thread
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Activity.LoadLayout("L_Main_Sabad")
	jobInternet.Initialize("jobInternet",Me)
	GPS1.Initialize("GPS1")
	tr.Initialise("tr")
	If Not(SQL1.IsInitialized) Then SQL1.Initialize(File.DirRootExternal &"/Zomorod","zomorod_db.db",False)
	Table1.Initialize(Me, "Table1",8)
	Table1.AddToActivity(Activity, 0,31%y,100%x,59%y)
	Table1.HeaderColor=Colors.RGB(0,137,123)
	Table1.TableColor=Colors.RGB(0,137,123)
	Grid
	LoadSpVaziatPardakht
End Sub

Sub tr_Ended(endedOK As Boolean, error As String) 'The thread has terminated. If endedOK is False error holds the reason for failure
	If endedOK Then
		Log($"lat1:${Lat} , lon1:${Lon}"$)
	End If
End Sub
Sub Grid
	Dim Query As String
	Query = "SELECT   FldNameKala,FldFeeForoosh ,FldTedadDarSabadJoz,FldNamevahed,FldTedadDarSabadKol,FldNameVahed2,(FldFeeForoosh*FldTedadDarSabadJoz) As FldSumFeeJoze,((FldFeeForoosh*FldTedadDarKarton)*FldTedadDarSabadKol) As FldSunFeeKol,FldMablaghMasrafKonande,FldTozihat FROM TblSabad"
	Table1.LoadSQLiteDB(File.DirRootExternal &"/Zomorod","zomorod_db.db",SQL1, Query)
	Table1.SetColumnsWidths(Array As Int( 200dip, 100dip, 100dip, 100dip,50dip,80dip,50dip,80dip,80dip,100dip))
	Table1.SetHeader(Array As String("نام کالا","قیمت فی","تعداد جزء","واحد جزء","تعداد کل","واحد کل","جمع قیمت جزء","جمع قیمت کل","قیمت مصرف کننده","توضیحات"),Array As Int( 200dip, 100dip, 100dip, 100dip,50dip,80dip,50dip,80dip,80dip,100dip))
	
	MohasebeMablaghFaktor
End Sub

Sub MohasebeMablaghFaktor
	Dim Dttb As Cursor = MCode.Result("Select * From TblSabad")
	Dim Sum,A As Double
	Dim FeeForoosh As Double
	Dim TedadDarSabadJoz,TedadDarSabadKol,TedadDarKarton As Double
	For i=0 To Dttb.RowCount - 1
		Dttb.Position=i
		If Dttb.GetString("FldTedadDarSabadJoz") = "" Then
			TedadDarSabadJoz = 0
		Else
			TedadDarSabadJoz = Dttb.GetString("FldTedadDarSabadJoz")
		End If
		If Dttb.GetString("FldTedadDarSabadKol") = "" Then
			TedadDarSabadKol = 0
		Else
			TedadDarSabadKol = Dttb.GetString("FldTedadDarSabadKol")
		End If
		If Dttb.GetString("FldTedadDarKarton") = "" Then
			TedadDarKarton = 0
		Else
			TedadDarKarton = Dttb.GetString("FldTedadDarKarton")
		End If
		Log(Dttb.GetInt("FldFeeForoosh"))
		If Dttb.GetInt("FldFeeForoosh") = 0 Then
			FeeForoosh = 0
		Else
			
			feetemp=Dttb.GetInt("FldFeeForoosh")
			
			If IsNumber(feetemp.Trim) Then
			
				FeeForoosh=feetemp
			Else
				Log(Dttb.GetInt("FldFeeForoosh"))
				FeeForoosh =MCode.RemoveqomaAshar(Dttb.GetInt("FldFeeForoosh"))
				Log(FeeForoosh)
			End If
			
		End If
		
		A = (TedadDarSabadJoz + (TedadDarSabadKol * TedadDarKarton)) * FeeForoosh
		Sum = Sum + A
	Next
	'LblMablaghKol.Text = NumberFormat(Sum,0,3) & " " & MCode.VahedPool
	LblMablaghKol.Text =MCode.qomaAshar(Sum) & " " & MCode.VahedPool
End Sub

Sub UpdateFee(Code As String)
	Dim Dt As Cursor = MCode.Result("Select FldCode,FldName From TblTasvie")
	Dim DtFee As Cursor
	Dim DtKala As Cursor
	Dt.Position = Code
	VaziatPardakhti= Dt.GetString("FldName")
	Dim CodeTasvie  As String = Dt.GetString("FldCode")
	AcSpLblVaziatPardakht.Tag=CodeTasvie
	Dt = MCode.Result("Select * From TblSabad")
	For i=0 To Dt.RowCount -1
		Dt.Position=i
		DtFee=MCode.Result("Select FldCodeKala,FldCodeTasvie,Round(FldFee,'"& MCode.RaghamAshar &"') As FldFee From TblFee Where FldCodeTasvie = '"& CodeTasvie &"' And FldCodeKala = '"& Dt.GetString("FldCodeKala") &"'")
		DtFee.Position=0
		If DtFee.RowCount>0 Then
			MCode.SaveUpdate("Update TblSabad Set FldFeeForoosh = '"& DtFee.GetString("FldFee") &"' Where FldCodeKala = '"& Dt.GetString("FldCodeKala") &"'")
		Else
			DtKala = MCode.Result("Select Round(FldFeeForoosh,'"& MCode.RaghamAshar &"') As FldFeeForoosh From TblKala Where FldCodekala = '"& Dt.GetString("FldCodeKala") &"'")
			DtKala.Position=0
			MCode.SaveUpdate("Update TblSabad Set FldFeeForoosh = "& DtKala.GetInt("FldFeeForoosh") &" Where FldCodeKala = '"& Dt.GetString("FldCodeKala") &"'")
		End If
	Next
	Grid
End Sub

Sub AcSpLblVaziatPardakht_ItemClick (Position As Int, Value As Object)
	If Value <> "" Then
		Dim Result As Int
		Result = Msgbox2("آیا قیمت ها متناسب با وضعیت پرداخت اعمال گردد ؟","","بله","","خیر",Null)
		If Result=DialogResponse.POSITIVE Then
			VaziatPardakhti=Value
			UpdateFee(Position)
		End If
	End If
End Sub

Sub LoadSpVaziatPardakht
	Dim Dt As Cursor = MCode.Result("Select FldCode,FldName From TblTasvie")
	AcSpLblVaziatPardakht.Clear
	For i=0 To Dt.RowCount-1
		Dt.Position=i
		AcSpLblVaziatPardakht.Add(Dt.GetString("FldName"))
	Next
	AcSpLblVaziatPardakht.Add("")
	AcSpLblVaziatPardakht.SelectedIndex = AcSpLblVaziatPardakht.Size -1
End Sub

Sub AcBtnNameKharidar_Click
	If MCode.NoeFaktorChecked="NewFaktor" Then
		MCode.BackPage="Act_Sabad"
		StartActivity(Act_Main_Ashkhas)
	Else If MCode.NoeFaktorChecked="EslahFaktor" Then
		MCode.BackPage="Act_Sabad"
		StartActivity(Act_Main_Faktor_NotSend)
	End If
End Sub

Sub LoadShakhsVaziatPardakht(Val1 As String,Val2 As String)
	Dim Index As Int
	Dim Cu As Cursor
	If MCode.NoeFaktorChecked="NewFaktor" Then
		LblNameKharidar.Text = "آقای/خانم  " & Val2
		LblNameKharidar.Tag = Val1
		MCode.BackPage=""
		CodeTafzili=Val1
	Else If MCode.NoeFaktorChecked="EslahFaktor" Then
		Dim str() As String
		MCode.BackPage = ""
		str=Regex.Split(",",Val1)
	
'		ListEslahFaktor.FldC_Tafzili=str(0)
'		ListEslahFaktor.FldN_Tafzili=str(1)
'		ListEslahFaktor.FldShomareFaktor=str(2)
'		ListEslahFaktor.FldTarikh=str(3)
'		ListEslahFaktor.FldTozih = str(4)
'		ListEslahFaktor.FldVaziatPardakht = Val2
'		LblNameKharidar.Text = "آقای/خانم  " & ListEslahFaktor.FldN_Tafzili
'		LblNameKharidar.Tag = ListEslahFaktor.FldC_Tafzili
'		MTxtTozih.Text=ListEslahFaktor.FldTozih
'		AcSpLblVaziatPardakht.Tag = Val2
'		Cu= MCode.Result("Select FldCode,FldName From TblTasvie")
'		AcSpLblVaziatPardakht.Clear
		For i=0 To Cu.RowCount-1
			Cu.Position=i
			AcSpLblVaziatPardakht.Add(Cu.GetString("FldName"))
			If Cu.GetString("FldCode") = Val2 Then
				Index=i
				UpdateFee(i)
			End If
		Next
		AcSpLblVaziatPardakht.Add("")
		AcSpLblVaziatPardakht.SelectedIndex = Index
		AcSpLblVaziatPardakht.Enabled=False
	End If
End Sub

Sub Activity_Resume
'	If GPS1.GPSEnabled = True Then
'		'If CheckGps=True Then
'			'GPS1.Start(0,0)
'			
'			'ProgressDialogShow2("لطفا تا دریافت موقعیت مکانی اندکی صبر کنید",False)
'		'End If
'	End If
	'tr.Initialise("tr")
	GetGps

End Sub
Sub GetGps
	
	If GPS1.GPSEnabled = True Then
		CheckGps=True
		GPS1.Start(0,0)
	Else
		ToastMessageShow("لطفا GPS را فعال نمایید", True)
		StartActivity(GPS1.LocationSettingsIntent)
		CheckGps=False
	End If
End Sub

Sub Activity_Pause (UserClosed As Boolean)
	CheckGps=False
End Sub

Sub GPS1_LocationChanged (Location1 As Location)
	If CheckGps=True Then
		Lat=Location1.Latitude
		Lon=Location1.Longitude
		GPS1.Stop
		Log($"lat1:${Lat} , lon1:${Lon}"$)
	End If
	CheckGps=False
End Sub
Sub Ready
	If 	(IsNumber(Lat)) And (IsNumber(Lon)) Then
		If MCode.SaveFactorInLocation=False Then
			SaveFaktor(Lat,Lon)
		Else
			Distance
		
		End If
	Else
		GetGps
	End If
End Sub
Sub Distance
	lat2=MCode.SingleResult("select FldLat from TblAshkhas where fldCodetafzili='"&CodeTafzili&"'")
	lon2=MCode.SingleResult("select FldLon from TblAshkhas where fldCodetafzili='"&CodeTafzili&"'")
	
	
	If (lat2<>0 And lon2<>0) And (lat2 <>"" And lon2<>"") Then
		Log($"lat1:${Lat} , lon1:${Lon}"$)
		Log($"lat2:${lat2} , lon2:${lon2}"$)
		
		MasafatFeali=MCode.CalculateDistance(Lat,Lon,lat2,lon2)
		Log(MasafatFeali)
		If MasafatFeali< MCode.Masafat Or MasafatFeali=MCode.Masafat Then
			SaveFaktor(Lat,Lon)
			ToastMessageShow("فاکتور ثبت شد",True)
		Else
			ToastMessageShow("ثبت فاکتور در این محدوده ی مکانی مجاز نیست",True)
	
'		Return
		End If
	Else
		Try
			'MCode.SaveUpdate($"Update TblAshkhas Set FldLat=${Lat},FldLon=${Lon} where FldCodeTafzili=${CodeTafzili}"$)
			SendLocation(Lat,Lon)
			
		
		Catch
			Log(LastException)
		End Try
		'	SaveFaktor(Lat,Lon)
		Return
	End If

End Sub

Sub Location_LocationChanged (Longitude As Double, Latitude As Double, Altitude As Double, Accuracy As Float, Bearing As Float, Provider As String, Speed As Float, Time As Long)
'	If rep Then
	ProgressDialogHide
	'ToastMessageShow("موقعیت مکانی جدید: "&Latitude&"  ,  "&Longitude,False)
	'Log("موقعیت مکانی جدید: "&Latitude&"  ,  "&Longitude)
	'	rep=False
	If MCode.SaveFactorInLocation=False Then
		Log(Latitude) 'عرض جغرافیایی
		Log(Longitude)'طول جغرافیایی
		Dim Lat,Lon As String
		Dim lat2,lon2 As String
		Dim MasafatFeali As Long
		Lat=Latitude
		Lon=Longitude
		'GPS1.Stop
		lat2=MCode.SingleResult("select FldLat from TblAshkhas where fldCodetafzili='"&CodeTafzili&"'")
		lon2=MCode.SingleResult("select FldLon from TblAshkhas where fldCodetafzili='"&CodeTafzili&"'")
		If lat2<>0 And lon2<>0 Then
			Log($"lat1:${Lat} , lon1:${Lon}"$)
			Log($"lat2:${lat2} , lon2:${lon2}"$)
			MasafatFeali=MCode.CalculateDistance(Lat,Lon,lat2,lon2)
			Log(MasafatFeali)
			'ToastMessageShow("فاصله شما تا محل مشتری "&MasafatFeali&" متر می باشد",False)
			If MasafatFeali< MCode.Masafat Or MasafatFeali=MCode.Masafat Then
				SaveFaktor(Lat,Lon)
				ToastMessageShow("فاکتور ثبت شد",False)
			
			Else
				ToastMessageShow("ثبت فاکتور در این محدوده ی مکانی مجاز نیست",False)
				ProgressDialogHide
				loc.stopGPSListening
				Return
			End If
		Else
			SaveFaktor(Lat,Lon)
			Return
		End If
	
		ProgressDialogHide
	
	
		loc.stopGPSListening
'		Dim Intent1 As Intent
'		Dim a As String= "geo:0,0?q="&Latitude&","&Longitude
'		Intent1.Initialize(Intent1.ACTION_VIEW,a )
'		StartActivity(Intent1)
		'با فعال کردن این کد، موقعیت شما در نقشه گوگل نشان داده خواهد شد
	Else
		If 	Not(IsNumber(Lat)) And Not(IsNumber(Lon)) Then
			Lat=Latitude
			Lon=Longitude
		
			Log($"lat1:${Lat} , lon1:${Lon}"$)
		Else
			Return
		End If
		loc.stopGPSListening
	End If
End Sub
Sub AcBtnSave_Click
	If MCode.NoeFaktorChecked=  "NewFaktor" Then
		If AcSpLblVaziatPardakht.SelectedIndex = AcSpLblVaziatPardakht.Size -1 Then
			ToastMessageShow("وضعیت پرداخت را مشخص نمایید",True)
			Return
		End If
		If LblNameKharidar.Text="" Or MCode.Sf.Len(LblNameKharidar.tag) < 3 Then
			ToastMessageShow("نام خریدار را وارد نمایید",True)
			Return
		End If
		If GPS1.GPSEnabled = False Then
			ToastMessageShow("لطفا GPS را فعال نمایید", True)
			StartActivity(GPS1.LocationSettingsIntent)
			CheckGps=False
		Else
			Ready
			'loc.Initialize("Location")
			'loc.requestGPSLocation
		End If
	Else if MCode.NoeFaktorChecked=  "EslahFaktor" Then
		If LblNameKharidar.text = "" Or MCode.Sf.Len(LblNameKharidar.tag) < 3 Then
			ToastMessageShow("لطفا فاکتور مورد نظر را انتخاب نمایید",True)
			Return
		End If
	
		UpdateFaktor
	End If
End Sub

Sub UpdateFaktor
'	If ListEslahFaktor.FldN_Tafzili="" Or MCode.Sf.Len(ListEslahFaktor.FldC_Tafzili) < 3 Then
'		Msgbox ("خطا در نام خریدار آپدیت","توجه")
'	Else
'		Dim Check As Boolean
'		Dim CuFaktor As Cursor = MCode.Result("Select * From TblFaktor Where FldShomareFaktor = '"& ListEslahFaktor.FldShomareFaktor &"'")
'		Dim CuSabad As Cursor = MCode.Result("Select * From TblSabad")
'		For i=0 To CuSabad.RowCount-1
'			Check=False
'			CuSabad.Position=i
'			For j=0 To CuFaktor.RowCount-1
'				CuFaktor.Position=j
'				If CuFaktor.GetString("FldCodeKala") = CuSabad.GetString("FldCodeKala") Then
'					Dim SumJoz,SumKol As Int
'					Dim Codekala As String = CuSabad.GetString("FldCodeKala")
'					SumJoz=CuSabad.GetString("FldTedadDarSabadJoz") + CuFaktor.GetString("FldTedadDarSabadJoz")
'					SumKol=CuSabad.GetString("FldTedadDarSabadKol") + CuFaktor.GetString("FldTedadDarSabadKol")
'					Dim Tozihat As String = CuSabad.GetString("FldTozihat")
'					MCode.SaveUpdate("Update TblFaktor Set FldTedadDarSabadJoz = '"& SumJoz &"' , FldTedadDarSabadKol = '"& SumKol &"',FldTozihat = '"& Tozihat&"',FldVaziatPardakht='"&ListEslahFaktor.FldVaziatPardakht &"'  Where FldShomareFaktor = '"& ListEslahFaktor.FldShomareFaktor &"' And FldCodeKala = '"& Codekala &"'")
'					Check=True
'					Exit
'				End If
'			Next
'			If Check=False Then
'				Dim Radif As Int = CuFaktor.RowCount + 1
'				Dim Lat,Lon As String
'				CuFaktor.Position=0
'				Lat = CuFaktor.GetString("FldLat")
'				Lon = CuFaktor.GetString("FldLon")
'				MCode.SaveUpdate("Insert Into TblFaktor (FldRadif,FldShomareFaktor,FldVaziatPardakht,FldC_Tafzili,FldN_Tafzili,FldCodeKala,FldNamekala,FldFeeForoosh,FldTedadDarKarton,FldTedadDarSabadJoz,FldTedadDarSabadKol,FldTozihat,FldTarikh,FldLat,FldLon,FldSend) Values ('"& Radif &"','"& ListEslahFaktor.FldShomareFaktor &"','"& ListEslahFaktor.FldVaziatPardakht &"','"& ListEslahFaktor.FldC_Tafzili &"','"& ListEslahFaktor.FldN_Tafzili &"','"& CuSabad.GetString("FldCodeKala") &"','"& CuSabad.GetString("FldNameKala") &"',"& CuSabad.GetInt("FldFeeForoosh") &",'"& CuSabad.GetString("FldTedadDarKarton") &"','"& CuSabad.GetString("FldTedadDarSabadJoz") &"','"& CuSabad.GetString("FldTedadDarSabadKol") &"','"& CuSabad.GetString("FldTozihat")&"','"& ListEslahFaktor.FldTarikh &"','"& Lat &"','"& Lon &"',0)")
'			End If
'		Next
'		MCode.SaveUpdate("Update TblFaktor Set FldTozih = '"& MTxtTozih.Text &"' Where FldShomareFaktor = '"& ListEslahFaktor.FldShomareFaktor &"'")
'		UpdateRadif
'		MCode.SaveUpdate("Delete From TblSabad")
'		MCode.CheckChangeSabad=True
'		ToastMessageShow("فاکتور با موفقیت اصلاح گردید",True)
'		
'		MCode.NoeFaktorChecked = "NewFaktor"
'		CheckGps=False
'		Activity.Finish
'	End If
End Sub

Sub UpdateRadif
'	Dim Radif As Int
'	Dim Cu As Cursor = MCode.Result("Select FldCodeKala From TblFaktor Where FldShomareFaktor = '"& ListEslahFaktor.FldShomareFaktor &"'")
'	For i=0 To Cu.RowCount-1
'		Cu.Position=i
'		Radif = i + 1
'		MCode.SaveUpdate("Update TblFaktor Set FldRadif = '"& Radif &"' Where FldCodeKala = '"& Cu.GetString("FldCodeKala") &"'")
'	Next
End Sub
Sub SaveFaktor(Lat1 As String,Lon1 As String)
	If LblNameKharidar.Text = "" Or MCode.Sf.Len(LblNameKharidar.Tag) < 3 Then
		Msgbox("خطا در نام خریدار ذخیره","توجه")
	Else
		Dim ShomareFaktor As String
		Dim Radif As Int
		Dim NameKharidar As String
		NameKharidar = LblNameKharidar.Text
		NameKharidar=NameKharidar.Replace("آقای/خانم  ","").Trim
		Dim Cu As Cursor = MCode.Result("Select * From TblSabad")
		If Cu.RowCount>0 Then
			If MCode.NoeDate = "S" Then
				Dim Tarikh As String =  MCode.DatePersian
			Else If MCode.NoeDate = "M" Then
				Dim Tarikh As String =  MCode.DateMiladi
			End If
			Dim CuFaktor As Cursor = MCode.Result("Select Max(Cast(FldShomareFaktor As Int)) As ShomareFaktor From TblFaktor")
			CuFaktor.Position=0
			If CuFaktor.GetString("ShomareFaktor") = Null  Then
				ShomareFaktor=1
			Else
				ShomareFaktor=CuFaktor.GetString("ShomareFaktor") + 1
			End If
			For i=0 To Cu.RowCount -1
				Cu.Position=i
				Radif= Radif + 1
				MCode.SaveUpdate("Insert Into TblFaktor (FldRadif,FldShomareFaktor,FldVaziatPardakht,FldC_Tafzili,FldN_Tafzili,FldCodeKala,FldNamekala,FldFeeForoosh,FldTedadDarKarton,FldTedadDarSabadJoz,FldTedadDarSabadKol,FldMablaghMasrafKonande,FldTozihat,FldTarikh,FldLat,FldLon,FldSend,FLdTozih) Values ('"& Radif &"','"& ShomareFaktor &"','"& AcSpLblVaziatPardakht.Tag &"','"& LblNameKharidar.Tag &"','"& NameKharidar &"','"& Cu.GetString("FldCodeKala") &"','"& Cu.GetString("FldNameKala") _
			 	&"',"& Cu.GetInt("FldFeeForoosh") &",'"& Cu.GetString("FldTedadDarKarton") &"','"& Cu.GetString("FldTedadDarSabadJoz") &"','"& Cu.GetString("FldTedadDarSabadKol") _
			 &"','"& Cu.GetString("FldMablaghMasrafKonande") &"','"& Cu.GetString("FldTozihat") &"','"& MCode.ConvertNumbersPersian2English(Tarikh) &"','"& Lat1 &"','"& Lon1 &"',0,'"& MTxtTozih.Text &"')")
			Next
			MCode.SaveUpdate("Delete From TblSabad")
			ProgressDialogHide
			MCode.CheckChangeSabad=True
			ToastMessageShow("فاکتور با موفقیت ذخیره گردید",True)
			Cu=MCode.Result("Select * From TblSetting")
			Cu.Position=0
	
		
			MCode.NoeFaktorChecked = "NewFaktor"
			CheckGps=False
			If Cu.GetString("FldSendFactor") = "0"  Then
	
				Activity.Finish
				MCode.SetAnimation("zoom_enter1", "zoom_exit1")
			Else if Cu.GetString("FldSendFactor") = "1" Then
				Dim Cu2 As Cursor = MCode.Result("Select FldCodeTafzili,FldSharheTafzili,FldVisitor,FldTell,FldAddress From TblAshkhasNew")
				If Cu2.RowCount>0 Then
					LoadSendAshkhasNew
				Else
					LoadSendFaktor
				End If
				'Activity.Finish
				'MCode.SetAnimation("zoom_enter1", "zoom_exit1")
			End If
		
		End If
	End If

End Sub

'Sub SaveFaktor(Lat As String,Lon As String)
'	If LblNameKharidar.Text = "" Or MCode.Sf.Len(LblNameKharidar.Tag) < 3 Then
'		Msgbox("خطا در نام خریدار ذخیره","توجه")
'	Else
'		Dim ShomareFaktor As String
'		Dim Radif As Int
'		Dim NameKharidar As String
'		NameKharidar = LblNameKharidar.Text
'		NameKharidar=NameKharidar.Replace("آقای/خانم  ","").Trim
'		Dim Cu As Cursor = MCode.Result("Select * From TblSabad")
'		If Cu.RowCount>0 Then
'			If MCode.NoeDate = "S" Then
'				Dim Tarikh As String =  MCode.DatePersian
'			Else If MCode.NoeDate = "M" Then
'				Dim Tarikh As String =  MCode.DateMiladi
'			End If			
'			Dim CuFaktor As Cursor = MCode.Result("Select Max(Cast(FldShomareFaktor As Int)) As ShomareFaktor From TblFaktor")
'			CuFaktor.Position=0
'			If CuFaktor.GetString("ShomareFaktor") = Null  Then
'				ShomareFaktor=1
'			Else
'				ShomareFaktor=CuFaktor.GetString("ShomareFaktor") + 1
'			End If	
'		For i=0 To Cu.RowCount -1
'				Cu.Position=i
'				Radif= Radif + 1
'				MCode.SaveUpdate("Insert Into TblFaktor (FldRadif,FldShomareFaktor,FldVaziatPardakht,FldC_Tafzili,FldN_Tafzili,FldCodeKala,FldNamekala,FldFeeForoosh,FldTedadDarKarton,FldTedadDarSabadJoz,FldTedadDarSabadKol,FldMablaghMasrafKonande,FldTozihat,FldTarikh,FldLat,FldLon,FldSend,FLdTozih) Values ('"& Radif &"','"& ShomareFaktor &"','"& AcSpLblVaziatPardakht.Tag &"','"& LblNameKharidar.Tag &"','"& NameKharidar &"','"& Cu.GetString("FldCodeKala") &"','"& Cu.GetString("FldNameKala") _
'			 	&"',"& Cu.GetInt("FldFeeForoosh") &",'"& Cu.GetString("FldTedadDarKarton") &"','"& Cu.GetString("FldTedadDarSabadJoz") &"','"& Cu.GetString("FldTedadDarSabadKol") _
'			 &"','"& Cu.GetString("FldMablaghMasrafKonande") &"','"& Cu.GetString("FldTozihat") &"','"& MCode.ConvertNumbersPersian2English(Tarikh) &"','"& Lat &"','"& Lon &"',0,'"& MTxtTozih.Text &"')")
'			Next
'			MCode.SaveUpdate("Delete From TblSabad")
'			ProgressDialogHide
'			MCode.CheckChangeSabad=True
'			ToastMessageShow("فاکتور با موفقیت ذخیره گردید",True)
'			Cu=MCode.Result("Select * From TblSetting")
'			Cu.Position=0
'	
'		
'			MCode.NoeFaktorChecked = "NewFaktor"
'			CheckGps=False
'			If Cu.GetString("FldSendFactor") = "0"  Then
'	
'				Activity.Finish
'				MCode.SetAnimation("zoom_enter1", "zoom_exit1")
'			Else if Cu.GetString("FldSendFactor") = "1" Then
'				Dim Cu2 As Cursor = MCode.Result("Select FldCodeTafzili,FldSharheTafzili,FldVisitor,FldTell,FldAddress From TblAshkhasNew")
'				If Cu2.RowCount>0 Then
'					LoadSendAshkhasNew
'				
'				Else
'					LoadSendFaktor
'		
'				End If
'				
'			End If
'			Activity.Finish
'			MCode.SetAnimation("zoom_enter1", "zoom_exit1")
'		End If
'	End If
'End Sub

Sub SendFaktor(Str As String)
	jobInternet.JobName ="SendFaktor2"
	Log(Str)
	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/SaveFaktor2","JsonDt=" & Str & "&Visitor=" & MCode.C_Visitor & "&Imei=" & MCode.DeviceId)
End Sub

Sub LoadSendFaktor
	Dim ListJson As List
	ListJson.Initialize
	'"Select FldId,FldRadif,FldShomareFaktor,FldVaziatPardakht,FldC_Tafzili,FldN_Tafzili,FldCodeKala,FldNameKala,FldFeeForoosh,FldTedadDarKarton,FldTedadDarSabadJoz,FldTedadDarSabadKol,FldTarikh,FldLat,FldLon,FldSend,FldTozihat,FldTozih From TblFaktor Where FldSend = 0"
	'Dim Cu As Cursor = MCode.Result("Select FldId,FldRadif,FldShomareFaktor,FldVaziatPardakht,FldC_Tafzili,FldN_Tafzili,FldCodeKala,FldNameKala,Cast(Round(FldFeeForoosh,'"& MCode.RaghamAshar &"') As Int) As FldFeeForoosh,FldTedadDarKarton,FldTedadDarSabadJoz,FldTedadDarSabadKol,FldTarikh,FldLat,FldLon,FldSend,FldTozihat,FldTozih From TblFaktor Where FldSend = 0")
	'Dim Cu As Cursor = MCode.Result("Select FldId,FldRadif,FldShomareFaktor,FldVaziatPardakht,FldC_Tafzili,FldN_Tafzili,FldCodeKala,FldNamekala,Cast(Round(FldFeeForoosh,'"& MCode.RaghamAshar &"') As Int) As FldFeeForoosh,FldTedadDarKarton,FldTedadDarSabadJoz,FldTedadDarSabadKol,FldTozihat,FldTarikh,FldLat,FldLon,FldSend,FldTozih From TblFaktor Where FldSend = 0")
	Dim Cu As Cursor = MCode.Result("Select FldId,FldRadif,FldShomareFaktor,FldVaziatPardakht,FldC_Tafzili,FldN_Tafzili,FldCodeKala,FldNamekala,Cast(Round(FldFeeForoosh,'"& MCode.RaghamAshar &"') As Int) As FldFeeForoosh,FldTedadDarKarton,FldTedadDarSabadJoz,FldTedadDarSabadKol,FldTozihat,FldTarikh,FldLat,FldLon,FldSend,FldTozih From TblFaktor Where FldSend = 0")
	If Cu.RowCount>0 Then
		ProgressDialogShow2("در حال ارسال فاکتور ها",False)
		SendFaktor(MCode.DtToJson(Cu))
	Else
		ToastMessageShow("فاکتور جهت ارسال موجود نمی باشد",True)
		ProgressDialogHide
		
	End If
	ProgressDialogHide
End Sub

Sub SendAshkhasNew(Str As String)
	jobInternet.JobName ="SendAshkhasNew"
	Log(Str)
	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/SaveAshkhasNew","JsonDt=" & Str & "&Imei=" & MCode.DeviceId)
End Sub

Sub LoadSendAshkhasNew
	Dim ListJson As List
	ListJson.Initialize
	Dim Cu As Cursor = MCode.Result("Select FldCodeTafzili,FldSharheTafzili,FldVisitor,FldTell,FldAddress From TblAshkhasNew")
	If Cu.RowCount>0 Then
		ProgressDialogShow2("در حال ارسال اشخاص جدید",False)
		SendAshkhasNew(MCode.DtToJson(Cu))
		
	Else
		ToastMessageShow("شخص جدید جهت ارسال موجود نمی باشد",True)
		
	End If
	
End Sub
Sub SendLocation(Lat1 As String,Lon1 As String)
	jobInternet.JobName ="SendLocation"
	jobInternet.PostString("http://" & MCode.Url & "/marashiservice.asmx/SaveLocationToziKonande","C_Tafzili=" & CodeTafzili & "&Lat=" & Lat1 & "&Lon=" & Lon1 & "&Imei=" & MCode.DeviceId)
End Sub

Sub JobDone (Job As HttpJob)
	If Job.Success Then
		Dim Str As String = Job.GetString
		Select Case Job.JobName
			Case "SendFaktor2"
				If Str = "Ok" Then
					ToastMessageShow("فاکتور ها با موفقیت ارسال گردید",True)
					MCode.SaveUpdate("Update TblFaktor Set FldSend = 1")
					MCode.UpdateBadge
					Activity.Finish
					MCode.SetAnimation("zoom_enter1", "zoom_exit1")
				Else
					ToastMessageShow("خطا در ارسال فاکتور ها",True)
				End If
				ProgressDialogHide
				'LoadSendAshkhasNew
			Case "SendAshkhasNew"
				If Str = "Ok" Then
					ToastMessageShow("اشخاص جدید با موفقیت ارسال گردید",True)
					MCode.SaveUpdate("Delete From TblAshkhasNew")
					MCode.UpdateBadge
					LoadSendFaktor
				Else
					ToastMessageShow("خطا در ارسال اشخاص جدید",True)
				End If
				ProgressDialogHide
			Case "SendLocation"
				If Str = "No Result" Then
					ToastMessageShow("خطا در اتصال",True)
				Else
					MCode.SaveUpdate($"Update TblAshkhas Set FldLat=${Lat},FldLon=${Lon} where fldCodetafzili=${CodeTafzili}"$)
					Log("موقعیت مشتری ثبت گردید")
					ToastMessageShow("موقعیت ثبت گردید",True)
					Distance
				End If
				ProgressDialogHide
		End Select
	Else
		ProgressDialogHide
		Msgbox ("خطا در اتصال","خطا")
	End If
	jobInternet.Release
End Sub

Sub AcSwNoeFaktor_CheckedChange(Checked As Boolean)
	If Checked=True Then
		MCode.NoeFaktorChecked="EslahFaktor"
		AcSpLblVaziatPardakht.Clear
		MTxtTozih.Text=""
	Else
		MCode.NoeFaktorChecked="NewFaktor"
		AcSpLblVaziatPardakht.Enabled=True
		LoadSpVaziatPardakht
	End If
	LblNameKharidar.Text = ""
	LblNameKharidar.Tag = 0
End Sub

Sub Activity_KeyPress (KeyCode As Int) As Boolean 'Return True to consume the event
	If KeyCode=KeyCodes.KEYCODE_BACK Then
		MCode.NoeFaktorChecked =  "NewFaktor"
		CheckGps=False
		Activity.Finish
		MCode.SetAnimation("zoom_enter2", "zoom_exit2")
	End If
	Return True
End Sub

Sub AcBtnClearSabad_Click
	Dim Result As Int
	Result=Msgbox2("آیا می خواهید سبد خرید پاک شود ؟","توجه","بله","","خیر",Null)
	If Result=DialogResponse.POSITIVE Then
		MCode.SaveUpdate("Delete From TblSabad")
		Activity.Finish
		MCode.SetAnimation("zoom_enter2", "zoom_exit2")
		ToastMessageShow("سبد خرید حذف گردید",True)
	End If
End Sub

