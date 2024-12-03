B4A=true
Group=Class\Report\PrintHavale
ModulesStructureVersion=1
Type=Class
Version=10
@EndOfDesignText@
#IgnoreWarnings : 5
Sub Class_Globals
	Private p As Panel
	Private pnl_bk As Panel

	Private imgSign As ImageView
	Private lblTozihat As Label
	Private lblSignS As Label

	Private LblGHabelePardakht As Label
	Private LblMablaghKhales As Label

	Private lblMandeTasfieNashode As Label
	Private LblTakhfifKala As Label
	Private LblTotalFaktor As Label
	
	Private lblMablagheKolDaryafti As Label
	Private LblMablaghTakhfifDaryafti As Label
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(GHabelePardakht,MablaghKhales,MablaghTakhfifDaryafti,MandeTasfieNashode,TakhfifKala,MablagheKolDaryafti,TotalFaktor,Tozihat,SignatureBitmapString As String)
	p.Initialize("")
	p.SetLayout(0,0,100%x,100%y)
	p.LoadLayout("l_faktor3_havale")
	LblGHabelePardakht.Text=GHabelePardakht
	LblMablaghKhales.Text=MablaghKhales
	LblMablaghTakhfifDaryafti.Text=MablaghTakhfifDaryafti
	lblMandeTasfieNashode.Text=MandeTasfieNashode
	LblTakhfifKala.Text=TakhfifKala
	LblTotalFaktor.Text=TotalFaktor
	lblMablagheKolDaryafti.Text=MablagheKolDaryafti
	lblTozihat.Text=Tozihat
	'imgSign=Sign
'	If File.Exists(File.DirRootExternal & "/Parsik/Signature",MCode.C_Tafzili & ".png") Then
'		imgSign.Bitmap=LoadBitmap(File.DirRootExternal & "/Parsik/Signature",MCode.C_Tafzili & ".png")
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