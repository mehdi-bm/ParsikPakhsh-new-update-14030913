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
	Dim OrginalListKala As List
	
End Sub

Sub Initialize
	OrginalListKala.Initialize
End Sub

Sub SelectForDefaultKalaList(query As String) As List
	
	Dim Cu As Cursor = MCode.Result(query)
	If Cu.RowCount > 0 Then
	'ProgressDialogShow("در حال بارگذاری لیست کالا")
	For i = 0 To Cu.RowCount - 1
		Dim ItemKala As AdapterListKala
		Cu.Position=i
		ItemKala.CodeKala=Cu.Getstring("fldCodeKala")
		ItemKala.NameKala=Cu.Getstring("fldNameKala")
		ItemKala.NameVahed=Cu.Getstring("fldNameVahed")
		ItemKala.NameVahed2=Cu.Getstring("fldNameVahed2")
		ItemKala.fldSharh=Cu.Getstring("fldSharh")
		ItemKala.SumMande=Cu.Getstring("SumMande")			
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
	
		fee=MCode.GetUpdateFeeSabad(fee,ItemKala.CodeKala)

				
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
		Dim c As Long=MCode.SingleResult("select count(FldCodeKala) as count from TblSabad where FldCodeKala="&ItemKala.CodeKala)
		If c>0 Then
			Dim cu1 As Cursor=MCode.Result("select * from TblSabad where FldCodeKala="&ItemKala.CodeKala)
			If cu1.RowCount>0 Then
				cu1.Position=0
'				FeeTip=MCode.feeTip
				ItemKala.TedadDarSabadJoz =cu1.Getstring("FldTedadDarSabadJoz")
				ItemKala.TedadDarSabadKol =cu1.Getstring("FldTedadDarSabadKol")
				ItemKala.SumMande=Cu.Getstring("SumMande")-cu1.Getstring("FldTedadDarSabadJoz")
				If Cu.Getstring("fldNameVahed2") <> "" Then
					Dim FldFeeForoosh As Int = MCode.Sf.Val(Cu.GetInt("fldFeeForoosh"))
					Dim FldTedadDarKarton As Int = MCode.Sf.Val(cu1.Getstring("FldTedadDarSabadKol"))
					Dim SumMande As Int = Cu.Getstring("SumMande")
					ItemKala.FeeForooshKarton=FldFeeForoosh * FldTedadDarKarton
					ItemKala.SumMandeKarton=Round2( SumMande / FldTedadDarKarton,0)
				End If
'				CmbBox1.SelectedIndex=MCode.feeTip
				'Cu.GetString2("FldVaziatPardakht")
				ItemKala.FldEshantion=cu1.Getstring("FldEshantion")
				
				If	MCode.TakhfifKala="1" Then
					'FldMablaghTakhfif
						
					If cu1.GetString("FldMablaghTakhfif")>0 And cu1.GetString("FldMablaghTakhfif")<>Null Then
						'Log(Cu.GetString("FldMablaghTakhfif"))
						ItemKala.fldDarsadTakhfif=cu1.GetString("FldDarsadTakhfif")
						ItemKala.MablaghTakhfif=cu1.GetString("FldMablaghTakhfif")
					Else
						'Log(Cu.GetString("FldMablaghTakhfif"))
						'Log("0")
						ItemKala.MablaghTakhfif="0"
					End If
				End If
			
				
			End If
			cu1.Close
		End If
		
		If Cu.Getstring("fldNameVahed2") <> ""  Then
			Dim FldFeeForoosh As Int = MCode.Sf.Val(Cu.GetInt("fldFeeForoosh"))
			Dim FldTedadDarKarton As Int = MCode.Sf.Val(Cu.Getstring("fldTedadDarKarton"))
			Dim SumMande As Int = Cu.Getstring("SumMande")
			ItemKala.FeeForooshKarton=FldFeeForoosh * FldTedadDarKarton
			ItemKala.SumMandeKarton=Round2( SumMande / FldTedadDarKarton,0)
		End If
		
		
			
		OrginalListKala.Add(ItemKala)
		
		
	Next
	'ProgressDialogHide
	End If
	Cu.Close
	Return OrginalListKala
End Sub