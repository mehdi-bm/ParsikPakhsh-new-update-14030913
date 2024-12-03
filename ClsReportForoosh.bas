B4A=true
Group=Class\Module
ModulesStructureVersion=1
Type=StaticCode
Version=12.5
@EndOfDesignText@
'Code module
'Subs in this code module will be accessible from all modules.
Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	Dim Query As String
End Sub

Public Sub GetReportMoshtari(DateAz As String,DateTa As String)
	Try
		If MCode.CodeMoshtariSelect=0 Then
			Query="Select * from TblFaktor where FldTarikh BETWEEN "&DateAz&" And "&DateTa
		Else
			Query="Select * from TblFaktor where FldTarikh BETWEEN "&DateAz&" And "&DateTa & " and FldC_Tafzili="& MCode.CodeMoshtariSelect
		End If
		If Query<>"" Then
			Dim cu As Cursor=MCode.Result(Query)
			If cu.RowCount>0 Then
				Dim fldFeeJoz As String
				Dim fldFeeBargasht As String
				Dim fldTedadEshantionJoz As String
				Dim fldTedadEshantionKol As String
				Dim fldTedadJozForoosh As String
				Dim fldTedadKolForoosh As String
				Dim fldTedadJozBargasht As String
				Dim fldTedadKolBargasht As String
				Dim fldSumKhales As String
		
				For Each coljRoot As Map In cu			
					fldFeeJoz = myCode.Is_Null_adad(coljRoot.Get("fldFeeJoz"))
					fldFeeBargasht = myCode.Is_Null_adad(coljRoot.Get("fldFeeBargasht"))
					fldTedadJozForoosh = myCode.Is_Null_adad(coljRoot.Get("fldTedadJozForoosh"))
					fldTedadKolForoosh = myCode.Is_Null_adad(coljRoot.Get("fldTedadKolForoosh"))
					fldTedadJozBargasht = myCode.Is_Null_adad(coljRoot.Get("fldTedadJozBargasht"))
					fldTedadKolBargasht = myCode.Is_Null_adad(coljRoot.Get("fldTedadKolBargasht"))
					fldTedadEshantionJoz = myCode.Is_Null_adad(coljRoot.Get("fldTedadEshantionJoz"))
					fldTedadEshantionKol = myCode.Is_Null_adad(coljRoot.Get("fldTedadEshantionKol"))
		
				Next
			End If
		End If
	Catch
		Log(LastException)
	End Try
	
	
End Sub