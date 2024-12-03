B4A=true
Group=Class
ModulesStructureVersion=1
Type=Class
Version=10
@EndOfDesignText@
Sub Class_Globals
	Private p As Panel
	Private faktor As AdapterListFaktor
	Private LblShomareFaktor As Label
	Private LblDate As Label
	Private LblTotalFaktor As Label
	Private pnl_bk As Panel
	Private LblSync As Label
	Private LblBargasht As Label
End Sub

Public Sub Initialize
	p.Initialize("")
	p.SetLayout(0,0,100%x,100%y)
	p.LoadLayout("L_RecFaktor")
	
End Sub
Public Sub show(item As AdapterListFaktor)
	Try
		faktor=item
		LblShomareFaktor.Text ="شماره سفارش "& item.FldShomareFaktor
		LblTotalFaktor.Text = myCode.AdadToPrice(item.FldTotalFaktor)
		LblDate.text = MCode.PersianDateDash(item.FldDate)
		LblDate.text = LblDate.text & " | " & MCode.Sf.Mid(item.FldTime,1,2)  & MCode.Sf.Mid(item.FldTime,3,2)
		LblSync.Visible = item.synced
		LblBargasht.Visible=item.wIsBacked
	Catch
		Log(LastException)
	End Try
End Sub

Public Sub getPanel As Panel
	pnl_bk.RemoveView
	Return pnl_bk
End Sub
Public Sub getHeight As Int
	Return pnl_bk.Height
End Sub

Sub Panel1_Click
	MCode.FaktorSelect=faktor.FldShomareFaktor
	faktor.fldC_Ashkhas=MCode.C_Tafzili
	Act_RizFaktor.Faktor = faktor
	StartActivity(Act_RizFaktor)
End Sub

Sub pnl_bk_Click
	
End Sub