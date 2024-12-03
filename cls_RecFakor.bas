B4A=true
Group=Class
ModulesStructureVersion=1
Type=Class
Version=9.9
@EndOfDesignText@
Sub Class_Globals
	Private p As Panel
	Private faktor As AdapterListFaktor
	Private Item As AdapterListAshkhas
	
	Private pnl_bk As Panel
	Private TxtSharhFaktor As EditText
	Private LblTotalFaktor As Label
	Private LblNameMoshtari As Label
	Private LblshFaktor As Label
	Private lbl_city As Label
	Private ChK_send As CheckBox
End Sub

Public Sub Initialize(shomareFaktor As String)
	faktor.FldShomareFaktor=shomareFaktor
	p.Initialize("")
	p.SetLayout(0,0,100%x,100%y)
	p.LoadLayout("l_recfaktor_2")
	
	LblshFaktor.Text=faktor.FldShomareFaktor
	Dim Cu1 As Cursor = MCode.Result("Select * From TblFaktor Where FldShomareFaktor = '"& faktor.FldShomareFaktor &"'")
	If Cu1.RowCount>0 Then
		Cu1.Position=0
		TxtSharhFaktor.Text = Cu1.GetString("FldTozih")
'		Dim CuTasview As Cursor = MCode.Result("Select * From TblNoeTasvie Where FldC_Tasvie = '"& Cu1.GetString("FldC_Tasvie") &"'")
'		CuTasview.Position=0
		Dim ca As String=Cu1.GetString("FldC_Tafzili")
		LblTotalFaktor.Text = "مبلغ فاکتور: " & NumberFormat(Cu1.GetString("FldTotalFaktor"),1,3) & " " & MCode.VahedPool
		If Cu1.GetString("FldTozih") = "" Then TxtSharhFaktor.Text = ""
	End If
	

	Dim Cu As Cursor = MCode.Result("Select * From TblAshkhas Where fldCodetafzili = '"& ca &"'")
	If Cu.RowCount>0 Then
		Cu.Position=0
		Item.CodeTafzili=Cu.GetString("fldCodetafzili")
		Item.SharhTafzili=Cu.GetString("fldSharheTafzili")
		Item.Address=Cu.GetString("fldAdress")
		Item.Tell=Cu.GetString("fldTell")
		Item.FldMobile=Cu.GetString("FldMobile")
		Item.FldC_Gorooh=Cu.GetString("fldCodeGroup")
		Item.FldN_Gorooh=Cu.GetString("fldNameGroup")
		Item.FldVaziat=Cu.GetString("FldVaziat")
		Item.FldEtebar=Cu.GetString("FldEtebar")
		Item.FldLastVisit=myCode.Is_Null(Cu.GetString("FldLastVisit"))
		Item.FldLastSefaresh=myCode.Is_Null(Cu.GetString("FldLastSefaresh"))
		LblNameMoshtari.Text = Item.SharhTafzili
		lbl_city.Text=Item.FldN_Gorooh
	End If
	


End Sub

Public Sub getPanel As Panel
	pnl_bk.RemoveView
	Return pnl_bk
End Sub
Public Sub getHeight As Int
	Return pnl_bk.Height'+10dip
End Sub
Public Sub getWidth As Int
	Return pnl_bk.Width+5dip
End Sub

Private Sub pnl_bk_Click
	MCode.FaktorSelect=faktor.FldShomareFaktor
	faktor.fldC_Ashkhas=Item.CodeTafzili
	Act_RizFaktor.Faktor = faktor
	StartActivity(Act_RizFaktor)
End Sub

Public Sub getIsChecked As Boolean
	Return ChK_send.Checked
End Sub

Public Sub getFaktor_number As String
	Return faktor.FldShomareFaktor
End Sub

Public Sub getCode_Tafzili As String
	Return Item.CodeTafzili
End Sub
