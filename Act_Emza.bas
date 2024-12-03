B4A=true
Group=Activity
ModulesStructureVersion=1
Type=Activity
Version=10
@EndOfDesignText@
#IgnoreWarnings:34
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
#End Region

Sub Process_Globals
End Sub

Sub Globals
	Dim CanvasSignature As Canvas
	Dim SD As SignatureData
	Private PnlSignature As Panel
	Private BtnSaveSignature As Button
	Private BtnClearSignature As Button
	Private BtnCancelSignature As Button
	Private PnlSignatureBitmap As Panel

End Sub

Sub Activity_Create(FirstTime As Boolean)
	Activity.LoadLayout("L_Emza_2")

	CanvasSignature.Initialize(PnlSignatureBitmap)
	SD.Initialize
	SD.Canvas = CanvasSignature
	SD.Panel = PnlSignatureBitmap
	SD.SignatureColor = Colors.Black
	SD.SignatureWidth = 5dip 'Stroke width
	
End Sub

Sub PnlSignatureBitmap_Touch (Action As Int, X As Float, Y As Float)
	SignatureCapture.Panel_Touch(SD, x, y, Action)
End Sub

Sub BtnCancelSignature_Click
'	PnlSignature.Visible=True
'	MCode.AnimationClose(PnlSignature)
'	SignatureCapture.Clear(SD)
	Activity.Finish
End Sub

Sub BtnClearSignature_Click
	SignatureCapture.Clear(SD)
End Sub

Sub BtnSaveSignature_Click
	SignatureCapture.Save(SD, File.DirDefaultExternal & "/Parsik/Signature",MCode.C_Tafzili & ".png")
	SignatureCapture.Clear(SD)
	
	If MCode.page="Act_RizeFactorHavale" Then
		CallSubDelayed(Act_RizeFactorHavale,"LoadCheck")
	End If

	Activity.Finish
End Sub

Sub btn_Back_Click
	Activity.Finish
End Sub
Sub Application_Error (Error As Exception, StackTrace As String) As Boolean
'	MCode.ScheduleRestartCrashedActivity(DateTime.Now + 300, Activity.Title, Error)
	Return True
End Sub