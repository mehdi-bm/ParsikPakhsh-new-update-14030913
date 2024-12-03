B4A=true
Group=Class\Report\PrintFactorType2
ModulesStructureVersion=1
Type=Class
Version=12.8
@EndOfDesignText@
#IgnoreWarnings : 5
Sub Class_Globals
	Private p As Panel
	Private pnl_bk As Panel


	Private imgSign As ImageView
	Private lblSumFaktor As Label
	Private lblSumPardakht As Label
	Private lblTozihat As Label
	Private lblSignS As Label
	Private lblSumKolTakhfif As Label
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(sumFaktor,sumPardakht,VaziatPardakht,SumKhales,SumTakhfifKala,SumTahkfifVizhe,SumKolTakhfif,Tozihat,SignatureBitmapString As String)
	p.Initialize("")
	p.SetLayout(0,0,100%x,100%y)
	p.LoadLayout("l_faktor3_type2")
	lblSumFaktor.Text=sumFaktor
	lblSumPardakht.Text=sumPardakht
	lblSumKolTakhfif.Text=SumKolTakhfif
	lblTozihat.Text=Tozihat
	'imgSign=Sign
'	If File.Exists(File.DirDefaultExternal & "/Parsik/Signature",MCode.C_Tafzili & ".png") Then
'		imgSign.Bitmap=LoadBitmap(File.DirDefaultExternal & "/Parsik/Signature",MCode.C_Tafzili & ".png")
'	End If
	
	Try
	
		Log("FldSignatureBitmapString: " & SignatureBitmapString)
		Log(SignatureBitmapString)
		Log(SignatureBitmapString.Length)
		
		Dim str2 As String=MCode.Decrypted(SignatureBitmapString)
		If SignatureBitmapString<>"" Then
				
			imgSign.Bitmap=ReadBlob(str2.Trim)
		End If
	Catch
		lblSignS.Text=""
		imgSign.Visible=True
		Log("error emza....")
	End Try
End Sub

Public Sub getPanel As Panel
	pnl_bk.RemoveView
	Return pnl_bk
End Sub

Public Sub getWidth As Int
	Return pnl_bk.Width
End Sub
Public Sub getHeight As Int
	Return pnl_bk.Height
End Sub
Public Sub getTop As Int
	Return pnl_bk.Top
End Sub
Public Sub getLeft As Int
	Return pnl_bk.Left
End Sub

Sub ReadBlob(emza As String) As Bitmap
	
	Dim Buffer() As Byte 'declare an empty byte array
	Buffer=MCode.Su.DecodeBase64(emza)
	
	Dim InputStream1 As InputStream
	InputStream1.InitializeFromBytesArray(Buffer, 0, Buffer.Length)
	
	Dim Bitmap1 As Bitmap
	Bitmap1.Initialize2(InputStream1)

	InputStream1.Close

	Return Bitmap1
End Sub