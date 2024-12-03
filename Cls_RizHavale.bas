B4A=true
Group=Class
ModulesStructureVersion=1
Type=Class
Version=12.2
@EndOfDesignText@
Sub Class_Globals
	Private p As Panel

	Dim Item As AdapteRizHavale
	Private pnl_bk As Panel
	Private base As Object
	Private LblDate As Label

	Private LblShomareFaktor As Label
	Private LblTotalFaktor As Label
	Private LblC_Ashkhas As Label
	Private LblN_Ashkhas As Label
	Private Lbl_Tell As Label
	Private lblAddress As Label
	Private BtnShowMap As Label
	Private lblUnCheck As Label
	Private lblCheck As Label
	Public shomareHavale As String
End Sub

Public Sub Initialize(mdl As Object)
	base = mdl
	p.Initialize("")
	p.SetLayout(0,0,100%x,100%y)
	p.LoadLayout("l_RecRizFactorHavale")
	
End Sub

Public Sub getPanel As Panel
	pnl_bk.RemoveView
	Return pnl_bk
End Sub

Public Sub getHeight As Int
	Return pnl_bk.Height
End Sub

Public Sub Show(Item1 As AdapteRizHavale,position As Int)
	Item=Item1
	BtnShowMap.Tag=position
	LblShomareFaktor.Text=Item1.fldShomareFactor
	LblDate.Text=MCode.PersianDateDash(Item1.fldDate)
	
	If Item1.fldMablaghKhales>0 Then
		LblTotalFaktor.Text=MCode.qomaAshar(Item1.fldMablaghKhales) &" "&MCode.VahedPool
	Else
		LblTotalFaktor.Text=0
	End If

	LblC_Ashkhas.Text=Item1.fldCodeTafzili
	LblN_Ashkhas.Text=Item1.fldSharhTafzili
	Lbl_Tell.Text=Item1.fldTell
	lblAddress.Text=Item1.fldAddress
	Log(Item1.fldCodeTafzili)
	Log(Item1.Distance)
	Log(Item1.fldLat)
	Log(Item1.fldLon)
	If myCode.Is_Null_adad(Item1.fldVaziat)=0 Then
		lblUnCheck.Visible=True
		lblCheck.Visible=False
		Else
		lblUnCheck.Visible=False
		lblCheck.Visible=True
	End If
	If Item.fldLat<>"" And Item.fldLon<>"" Then
		'BtnShowMap.Visible=True
		Else
		BtnShowMap.Visible=False
	End If
End Sub

Public Sub lblShowHavale_Click
	Act_RizeFactorHavale.ShomareFaktor=Item.fldShomareFactor
	Act_RizeFactorHavale.ShomareHavale=shomareHavale
	Act_RizeFactorHavale.CodeMoshtari=LblC_Ashkhas.Text
	Act_RizeFactorHavale.NameMoshtari=LblN_Ashkhas.Text
	Act_RizeFactorHavale.date=LblDate.Text
	Act_RizeFactorHavale.fldLat=Item.fldLat
	Act_RizeFactorHavale.fldLon=Item.fldLon
	
	StartActivity(Act_RizeFactorHavale)
End Sub
Private Sub BtnShowMap_Click
	Dim destLat As Double = Item.fldLat ' عرض جغرافیایی مقصد
	Dim destLng As Double = Item.fldLon ' طول جغرافیایی مقصد
	Dim label As String = Item.fldSharhTafzili ' برچسب مقصد

	Dim Uri As String
	Uri = "google.navigation:q=" & destLat & "," & destLng & "&label=" & label

	Dim intent As Intent
	intent.Initialize(intent.ACTION_VIEW, Uri)
	intent.SetComponent("com.google.android.apps.maps")

	If intent.IsInitialized Then
		StartActivity(intent)
	Else
		ToastMessageShow("لطفا GoogleMap را نصب نمایید.",True)
	End If
'	Dim Intent1 , in2 As Intent
'	Dim Uri As String
'	Dim pm As PackageManager
'	in2 = pm.GetApplicationIntent("com.google.android.apps.maps")
'	If in2.IsInitialized Then
'		'Uri="geo:0,0?q=" & Lat1 & "," & Lon1 & "," & "15z"
'		Uri="google.navigation:q=" & Item.fldLat & "," & Item.fldLon & "
'		Intent1.Initialize(Intent1.ACTION_VIEW, Uri)
'		StartActivity(Intent1)
'	Else
'		ToastMessageShow("لطفا GoogleMap را نصب نمایید.",True)
'	End If	
End Sub