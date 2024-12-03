B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=8.8
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: True
#End Region

Sub Process_Globals
	
End Sub

Sub Globals
	
	Private pnl As Panel
	Dim c1 As Canvas
	Dim x1,y1 As Int
	Dim SD As SignatureData 'This object holds the data required for SignatureCapture
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Activity.LoadLayout("l_Signature")
	c1.Initialize(pnl)
	SD.Initialize
	SD.Canvas = c1
	SD.Panel = pnl
	SD.SignatureColor = Colors.Black
	SD.SignatureWidth = 5dip 'Stroke width
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Sub pnl_Touch (Action As Int, X As Float, Y As Float)
	SignatureCapture.Panel_Touch(SD, x, y, Action)
End Sub

Sub btnSave_Click
	SignatureCapture.Save(SD, File.DirInternal, "sign.png")
	ToastMessageShow("امضای مشتری ثبت شد",True)
	'The next line will load the image and set it as the activity background.
	Activity.SetBackgroundImage(LoadBitmap(File.DirInternal, "sign.png"))
	
	SignatureCapture.Clear(SD)
	Activity.Finish
End Sub

Sub btnClose_Click
	SignatureCapture.Clear(SD)
	Activity.Finish
End Sub



Sub btnClear_Click
	SignatureCapture.Clear(SD)
End Sub