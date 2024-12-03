B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=8.8
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
#End Region

Sub Process_Globals
Dim filename As String
Dim address As String

End Sub

Sub Globals
	Private ListView1 As ListView
'	Private Preview As ScrollView
	Private xui As XUI
	Dim Printer As Printer
	Private pnlCenter As Panel
	Private Hpdfv As Hitex_PdfViewer


End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("lPrint")
	ListView1.SingleLineLayout.Label.TextSize=14
	ListView1.SingleLineLayout.ItemHeight=30dip
	
	'Printer.Initialize(Me,"Printer",Encoding.Windows1252)
	'Preview.Color=Colors.LightGray
	
	Log(filename)
	'Preview.Panel.Height=Printer.Preview.Height
	'Preview.Panel.SetBackgroundImage(Printer.Preview)

	'Printer.ClearBuffer
	'Printer.AddBuffer_Writeline("TEST - Mixed Text and Image")
	'Printer.AddBuffer_Writeline("012345678901234567890123456789-F")
	
	Hpdfv.Load(address,filename)
	
'	Printer.AddBuffer_Writeline("END PRINT")
End Sub


Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Sub ButtonAssociated_Click
	' connect to Associated Printer
	ListView1.Clear
	'Printer.SelectFromAssociatedPrinter
End Sub

Sub ButtonScanPrinter_Click
	' Scan for find Bluetooth Printer
	ListView1.Clear
	'Printer.SearchNewPrinter
End Sub

Sub Printer_ListPrinterAssociated (ListNameAndMac As Map)
	' Return a List of BT associated
	ListView1.Clear
	For I=0 To ListNameAndMac.Size-1
		ListView1.AddSingleLine2(ListNameAndMac.GetKeyAt(I),ListNameAndMac.GetValueAt(I))
	Next
End Sub

Sub Printer_DiscoveryNewPrinter (PrinterFound As Map, DeviceClass As Int)
	' Find new printer
	Log("DEVICE Class:" & DeviceClass)
	ListView1.AddSingleLine2(PrinterFound.GetKeyAt(0),PrinterFound.GetValueAt(0))
End Sub

Sub Printer_DiscoveryFinished
	Log("Search End")
End Sub

Sub Printer_DiscoveryNoDeviceFound
	ToastMessageShow("Device not found",True)
End Sub

Sub ListView1_ItemClick (Position As Int, Value As Object)
	' Connect Printer for Mac
	'Printer.SelectFromMac(Value)
End Sub

Sub Printer_ConnectedToPrint (Success As Boolean)
	' When is connect
	If Success Then
		ToastMessageShow("Connect to BT PRINTER",False)
	Else
		ToastMessageShow("Connection error on BT printer",False)
	End If
End Sub

Sub Printer_SendTerminated
	Log("Finish!!")
	'Printer.Close
End Sub

'Sub RadioButtonText_CheckedChange(Checked As Boolean)
'	Printer.ClearBuffer
'	Printer.AddBuffer_Writeline(ESC_POS.BoldOn & "Hallo dear" & ESC_POS.DoubleOff)
'	Printer.AddBuffer_Writeline("How are you?")
'	Printer.AddBuffer_Writeline("Fine thank's")
'	Printer.AddBuffer_Writeline("012345678901234567890123456789-F")
'	
'	Preview.Panel.Height=Printer.Preview.Height
'	Preview.Panel.SetBackgroundImage(Printer.Preview)
'End Sub
'
'Sub RadioButtonIMG_CheckedChange(Checked As Boolean)
'	Printer.ClearBuffer
'	Printer.AddBuffer_Bitmap(CreateImage(Chr(0xF209) & " " & Chr(0xF17B),xui.CreateFontAwesome(16)),0)
'	
'	Preview.Panel.Height=Printer.Preview.Height
'	Preview.Panel.SetBackgroundImage(Printer.Preview)
'End Sub
'
'Sub RadioButtonMIX_CheckedChange(Checked As Boolean)
'
'End Sub

Sub ButtonPrint_Click
	Dim b As Bitmap=MCode.ConvertiPdfImg(address,filename)

	Printer.Initialize("")
	Print

	'Printer.AddBuffer_BitmapAlternativeCoding(b)
End Sub

Sub Print
	Printer.PrintPdf("print",address,filename)
End Sub

Sub CreateImage(Text As String,Font As B4XFont) As Bitmap
	Dim Can As B4XCanvas
	Dim V As B4XView = xui.CreatePanel("")
	V.SetLayoutAnimated(0,0,0,140,90) 'ignore
	
	Can.Initialize(V)
	Can.DrawRect(Can.TargetRect,xui.Color_White,True,1)
	Can.DrawText(Text,Can.TargetRect.CenterX,Can.TargetRect.Bottom*0.70,Font,xui.Color_Black,"CENTER")
	Can.Invalidate
	Return Can.CreateBitmap
	
End Sub



