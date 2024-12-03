B4A=true
Group=Class
ModulesStructureVersion=1
Type=Class
Version=7.3
@EndOfDesignText@
'Version 1.12
' with ScrollView2 instead of ScrollView
Sub Class_Globals
'	Private Btn1 As Button
	Private StringUtils1 As StringUtils
	Private SV As ScrollView2D
	Private Header As Panel
	Private Callback As Object
	Private Event As String
	Private SelectedRow As Int
	Private Data As List
	Private LabelsCache As List
	Private minVisibleRow, maxVisibleRow As Int
	Private visible As Boolean
	Private visibleRows As Map
	Private NumberOfColumns, ColumnWidth As Int
	Public RowHeight, HeaderColor, TableColor, FontColor, HeaderFontColor As Int
	Public FontSize As Float
	Type RowCol (Row As Int, Col As Int)
	Public Alignment As Int
	Public SelectedDrawable(), Drawable1(), Drawable2() As Object
	'Table settings
	HeaderColor = Colors.RGB(83,99,255)
	RowHeight = 60dip
	TableColor = Colors.RGB(94,108,249)
	FontColor = Colors.Black
	HeaderFontColor = Colors.White
	FontSize = 12
	Alignment = Gravity.CENTER 'change to Gravity.LEFT or Gravity.RIGHT for other alignments.
End Sub

Public Sub Initialize (CallbackModule As Object, EventName As String, vNumberOfColumns As Int)
	SV.Initialize(0, 0, "SV")
	SV.Panel.Color = TableColor
	Callback = CallbackModule
	Event = EventName
	innerClearAll(vNumberOfColumns)
End Sub

'Clears the table
Public Sub ClearAll
	innerClearAll(NumberOfColumns)
End Sub

'Sets the columns widths.
'Example: <code>Table1.SetColumnsWidths(Array As Int(100dip, 30dip, 30dip, 100%x - 160dip))</code>
Public Sub SetColumnsWidths(Widths() As Int)
	Dim v As View
	For i = 0 To Widths.Length - 1
		v = Header.GetView(i)
		v.Width = Widths(i) - 1dip
		If i > 0 Then
			v.Left = Header.GetView(i-1).Left + Widths(i-1) '+ 1dip
		End If
	Next
	Header.Width = Header.GetView(Widths.Length - 1).Left + Widths(Widths.Length - 1)
	SV.Panel.Width = Header.Width
	Dim lbls() As Label
	For i = 0 To visibleRows.Size - 1
		lbls = visibleRows.GetValueAt(i)
		For lbl = 0 To lbls.Length - 1
			lbls(lbl).SetLayout(Header.GetView(lbl).Left, lbls(lbl).Top, _
				Header.GetView(lbl).Width, RowHeight)
		Next
	Next
End Sub

Private Sub innerClearAll(vNumberOfColumns As Int)
	For i = SV.Panel.NumberOfViews -1 To 0 Step -1
		SV.Panel.RemoveViewAt(i)
	Next
	NumberOfColumns = vNumberOfColumns
	Dim Drawable1(NumberOfColumns) As Object
	Dim Drawable2(NumberOfColumns) As Object
	Dim SelectedDrawable(NumberOfColumns) As Object
	For i = 0 To NumberOfColumns - 1
		Dim cd1, cd2, cd3 As ColorDrawable
		cd1.Initialize(Colors.White, 0)
'		cd2.Initialize(0xFF98F5FF, 0)
		cd2.Initialize(0xFFE3E3E3, 0)
		cd3.Initialize(0xFF007FFF, 0)
		Drawable1(i) = cd1
		Drawable2(i) = cd2
		SelectedDrawable(i) = cd3
	Next
	SV.Panel.Height = 0
	SelectedRow = -1
	minVisibleRow = -1
	maxVisibleRow = 0
	Data.Initialize
	LabelsCache.Initialize
	visibleRows.Initialize
	SV.VerticalScrollPosition = 0
	DoEvents
	SV.VerticalScrollPosition = 0
	For i = 1 To 80 'fill the cache to avoid delay on the first touch
		LabelsCache.Add(CreateNewLabels)
	Next
	If visible Then
		SV_ScrollChanged(0, 0)
	End If
End Sub

Private Sub SV_ScrollChanged(PosX As Int, PosY As Int)
	Dim currentMin, currentMax As Int
	currentMin = Max(0, PosY / RowHeight - 30)
	currentMax = Min(Data.Size - 1, (PosY + SV.Height) / RowHeight + 30)
	If minVisibleRow > -1 Then
		If minVisibleRow < currentMin Then
			'need to hide the upper rows
			For I = minVisibleRow To Min(currentMin - 1, maxVisibleRow)
				HideRow(I)
			Next
		Else If minVisibleRow > currentMin Then
			'need to show the upper rows
			For I = currentMin To Min(minVisibleRow - 1, currentMax)
				ShowRow(I)
			Next
		End If
		If maxVisibleRow > currentMax Then
			'need to hide the lower rows
			For I = maxVisibleRow To Max(currentMax + 1, minVisibleRow) Step -1
				HideRow(I)
			Next
		Else If maxVisibleRow < currentMax Then
			'need to show the lower rows
			For I = currentMax To Max(maxVisibleRow + 1, currentMin) Step -1
				ShowRow(I)
			Next
		End If
	End If
	minVisibleRow = currentMin
	maxVisibleRow = currentMax
	Header.Left = -PosX
End Sub

'Adds the tablet to the activity.
Public Sub AddToActivity(Act As Activity, Left As Int, Top As Int, Width As Int, Height As Int)
	visible = True
	Header.Initialize("")
'	Btn1.Initialize("Btn1")
'	Btn1.Text="برگشت"
	Header.Color = TableColor
	Act.AddView(Header, Left, Top , Width, RowHeight)
	Act.AddView(SV, Left, Top + RowHeight, Width, Height - RowHeight)
	ColumnWidth = SV.Width / NumberOfColumns
	'Act.AddView(Btn1,0 ,80%y,130dip,100dip)
	SV_ScrollChanged(0, 0)

End Sub
'private Sub Btn1_Click	
'	SV.Visible=False
'	Header.Visible=False
'	If SubExists(Callback, Event & "_BtnBackClick") Then
'		CallSub(Callback, Event & "_BtnBackClick")
'	End If
'End Sub

'Adds a row to the table
'Example:<code>Table1.AddRow(Array As String("aaa", "ccc", "ddd", "eee"))</code>
Public Sub AddRow(Values() As String)
	If Values.Length <> NumberOfColumns Then
		Log("Wrong number of values.")
		Return
	End If
	Data.Add(Values)
	Dim lastRow As Int
	lastRow = Data.Size - 1
	If lastRow < (SV.VerticalScrollPosition + SV.Height) / RowHeight + 1 Then
		ShowRow(lastRow)
	End If
	SV.Panel.Height = Data.Size * RowHeight
End Sub

Private Sub ShowRow(row As Int)
	If visibleRows.ContainsKey(row) Then Return
	'Log("ShowRow: " & row)
	Dim lbls() As Label
	Dim values() As String
	lbls = GetLabels(row)
	values = Data.Get(row)
	visibleRows.Put(row, lbls)
	Dim rowColor() As Object
	If row = SelectedRow Then
		rowColor = SelectedDrawable
	Else If row Mod 2 = 0 Then
		rowColor = Drawable1
	Else
		rowColor = Drawable2
	End If
	For I = 0 To lbls.Length - 1
		SV.Panel.AddView(lbls(I), Header.GetView(I).Left, row * RowHeight, Header.GetView(I).Width, _
			RowHeight - 1dip)
		lbls(I).Text = values(I)
		lbls(I).Background = rowColor(I)
	Next
End Sub

Private Sub IsRowVisible(Row As Int) As Boolean
	Return Row < (SV.VerticalScrollPosition + SV.Height) / (RowHeight + 1) And _
		Row > SV.VerticalScrollPosition / RowHeight
End Sub

Private Sub HideRow (Row As Int)
	'Log("HideRow: " & row)
	Dim lbls() As Label
	lbls = visibleRows.Get(Row)
	If lbls = Null Then
		Log("HideRow: (null) " & Row)
		Return
	End If
	For I = 0 To lbls.Length - 1
		lbls(I).RemoveView
	Next
	visibleRows.Remove(Row)
	LabelsCache.Add(lbls)
End Sub

Private Sub GetLabels(Row As Int) As Label()
	Dim lbls() As Label
	If LabelsCache.Size > 0 Then
		'Log("from cache")
		lbls = LabelsCache.Get(LabelsCache.Size - 1)
		LabelsCache.RemoveAt(LabelsCache.Size - 1)
	Else
		lbls = CreateNewLabels
	End If
	For I = 0 To lbls.Length - 1
		Dim rc As RowCol
		rc = lbls(I).Tag
		rc.Row = Row
	Next
	Return lbls
End Sub

Private Sub CreateNewLabels As Label()
	Dim lbls(NumberOfColumns) As Label
	For I = 0 To NumberOfColumns - 1
		Dim rc As RowCol
		rc.Col = I
		Dim l As Label
		l.Initialize("cell")
		l.Gravity = Alignment
		l.TextSize = FontSize
		l.TextColor = FontColor
		l.Typeface=Typeface.LoadFromAssets("iransansmonospacednum_bold.ttf")
		l.Tag = rc
		lbls(I) = l
	Next
	Return lbls
End Sub

'Set the headers values
'Example:<code>Table1.SetHeader(Array As String("Col1", "Col2", "Col3"))</code>
Public Sub SetHeader(Values() As String,Width() As Int)
	For I = Header.NumberOfViews - 1 To 0 Step -1
		Header.RemoveViewAt(I)
	Next
	Dim LngWidth As Int
	For I = 0 To NumberOfColumns - 1
		Dim l As Label
		l.Initialize("header")
		l.Gravity = Gravity.CENTER
		l.TextSize = FontSize
		l.Color = HeaderColor
		l.TextColor = HeaderFontColor
		l.Typeface=Typeface.LoadFromAssets("iransansmonospacednum_bold.ttf")
		l.Text = Values(I)
		l.Tag = I
		'Header.AddView(l, ColumnWidth * I, 0, ColumnWidth - 1dip, RowHeight)
		Header.AddView(l, LngWidth, 0, Width(I) - 1dip , RowHeight)
		LngWidth=LngWidth+Width(I)
	Next
End Sub

private  Sub Cell_Click
	Dim rc As RowCol
	Dim l As Label
	l = Sender
	rc = l.Tag
	SelectRow(rc.Row)
	If SubExists(Callback, "Grid" & "_CellClick") Then
		CallSub3(Callback, "Grid" & "_CellClick", rc.Col, rc.Row)
	End If
End Sub

Private Sub Cell_LongClick
	Dim rc As RowCol
	Dim l As Label
	l = Sender
	rc = l.Tag
	SelectRow(rc.Row)
	If SubExists(Callback, "Grid" & "_CellLongClick") Then
		CallSub3(Callback, "Grid" & "_CellLongClick", rc.Col, rc.Row)
	End If
End Sub

Private Sub Header_Click
	Dim l As Label
	Dim col As Int
	l = Sender
	col = l.Tag
	If SubExists(Callback, Event & "_HeaderClick") Then
		CallSub2(Callback, Event & "_HeaderClick", col)
	End If
End Sub

'Gets the value of the given cell.
Public Sub GetValue(Col As Int, Row As Int)
	Dim values() As String
	values = Data.Get(Row)
	Return values(Col)
End Sub

'Sets the value of the given cell.
Public Sub SetValue(Col As Int, Row As Int, Value As String)
	Dim values() As String
	values = Data.Get(Row)
	values(Col) = Value
	If visibleRows.ContainsKey(Row) Then
		Dim lbls() As Label
		lbls = visibleRows.Get(Row)
		lbls(Col).Text = Value
	End If
End Sub

Private Sub SelectRow(Row As Int)
	Dim prev As Int
	prev = SelectedRow
	SelectedRow = Row
	'remove the color of previously selected row
	If prev > -1 Then
		If visibleRows.ContainsKey(prev) Then
			HideRow(prev)
			ShowRow(prev)
		End If
	End If
	SelectedRow = Row
	For col = 0 To NumberOfColumns - 1
		If visibleRows.ContainsKey(SelectedRow) Then
			HideRow(SelectedRow)
			ShowRow(SelectedRow)
		End If
	Next
End Sub

'Makes the given row visible.
Public Sub JumpToRow(Row As Int)
	SV.VerticalScrollPosition = Row * RowHeight
End Sub

Public Sub LoadSQLiteDB(Dir As String, Filename As String, SQLite As SQL, Query As String)
	If File.Exists(Dir, Filename) = False Then
		ToastMessageShow("This file : " & Filename & " doesn't exist", False)
		Return
	End If
	
	Dim Curs As Cursor
	Curs = SQLite.ExecQuery(Query)
	
	NumberOfColumns = Curs.ColumnCount
	innerClearAll(NumberOfColumns)
	
	Dim headers(NumberOfColumns) As String
	Dim Widths(NumberOfColumns) As Int
	Dim col, row As Int
	For col = 0 To NumberOfColumns - 1
		headers(col) = Curs.GetColumnName(col)
		Widths(col) = 162dip
	Next
	SetHeader(headers,Widths)
	SetColumnsWidths(Widths)
	
	For row = 0 To Curs.RowCount - 1
		Dim r(NumberOfColumns) As String
		For col = 0 To NumberOfColumns - 1
			Curs.Position = row
			r(col) = Curs.GetString2(col)
		Next
		AddRow(r)
	Next
	
	Curs.Close
End Sub

Public Sub LoadSList(Lst As List,Lst_ColNameTitle As List, N_Col As Int)
	NumberOfColumns = N_Col
	innerClearAll(NumberOfColumns)
	
	Dim headers(NumberOfColumns) As String
	Dim Widths(NumberOfColumns) As Int
	Dim col, row As Int
	For col = 0 To NumberOfColumns - 1
		headers(col) = Lst_ColNameTitle.get(col)
		Widths(col) = 162dip
	Next
	SetHeader(headers,Widths)
	SetColumnsWidths(Widths)
	
	
	For row = 0 To Lst.Size - 1
		Dim Item = Lst.Get(row) As AdapterListKala
		Dim r(NumberOfColumns) As String
'		For col = 0 To NumberOfColumns - 1
		r(0) = row+1		
		
		r(1) = Item.NameKala
		r(2) = Item.CodeKala
		
		r(3) = NumberFormat(Item.FeeForoosh	,1,3)
		r(4) = NumberFormat(Item.fldFeeBadAzTakhfif,1,3)
		
		r(5) = NumberFormat(Item.MablaghTakhfif,1,3)
		r(6) = NumberFormat(Item.fldDarsadTakhfif,1,3)
		If Item.MablaghTakhfif>0 Then
			r(7) =0
			Else
			If Item.fldFeeBadAzTakhfif>0 Then
				r(7) = NumberFormat(Item.FeeForoosh-Item.fldFeeBadAzTakhfif,1,3)
				Else
				r(7) =0
			End If
			
		End If
		
		
		r(8) = myCode.Is_Null_adad(Item.fldDarsadArzeshAfzode)
		r(9) = myCode.Is_Null_Price(Item.fldArzeshAfzode)
	
		r(10) = Item.TedadDarSabadJoz
		r(11) = Item.NameVahed
		
		r(12) = Item.TedadDarSabadKol
		r(13) = Item.NameVahed2
			
		r(14) = Item.Tozihat
		AddRow(r)
	Next
End Sub

Public Sub LoadEshantionGroupList(Lst As List,Lst_ColNameTitle As List, N_Col As Int)
	NumberOfColumns = N_Col
	innerClearAll(NumberOfColumns)
	
	Dim headers(NumberOfColumns) As String
	Dim Widths(NumberOfColumns) As Int
	Dim col, row As Int
	For col = 0 To NumberOfColumns - 1
		headers(col) = Lst_ColNameTitle.get(col)
		Widths(col) = 162dip
	Next
	SetHeader(headers,Widths)
	SetColumnsWidths(Widths)
	
	
	For row = 0 To Lst.Size - 1
		Dim Item = Lst.Get(row) As AdapterListEshantionGroup
		Dim r(NumberOfColumns) As String
		
		r(0) = row+1				
		r(1) = Item.fldCodeGroupKala
		r(2) = MCode.GetNameGroupKala(Item.fldCodeGroupKala)				
		r(3) = Item.fldCodeGroupKalaEshantion
		r(4) = MCode.GetNameGroupKala(Item.fldCodeGroupKalaEshantion)
		r(5) = Item.fldTedadEshantion
		
		AddRow(r)
	Next
End Sub

Public Sub LoadSListReportRizeBargasht(Lst As List,Lst_ColNameTitle As List, N_Col As Int)
	NumberOfColumns = N_Col
	innerClearAll(NumberOfColumns)
	
	Dim headers(NumberOfColumns) As String
	Dim Widths(NumberOfColumns) As Int
	Dim col, row As Int
	For col = 0 To NumberOfColumns - 1
		headers(col) = Lst_ColNameTitle.get(col)
		Widths(col) = 162dip
	Next
	SetHeader(headers,Widths)
	SetColumnsWidths(Widths)
	
	
	For row = 0 To Lst.Size - 1
		Dim Item = Lst.Get(row) As AdapterListRizeFaktor
		Dim r(NumberOfColumns) As String
'		For col = 0 To NumberOfColumns - 1
		r(0) = row+1
'		r(1) = Item.fldShomareFaktor
		r(1) = Item.fldCodeKala
		r(2) = Item.fldSharhKala
		'r(4) = myCode.AdadToPrice(Item.fldTotalFaktor)
		r(3) = myCode.Is_Null_adad(Item.fldTedadJoz)
		r(4) = myCode.Is_Null_adad(Item.fldTedadCarton)
		r(5)=Item.FldType
		AddRow(r)
	Next
End Sub

Public Sub LoadSListReportRizeBargashtResult(Lst As List,Lst_ColNameTitle As List, N_Col As Int)
	NumberOfColumns = N_Col
	innerClearAll(NumberOfColumns)
	
	Dim headers(NumberOfColumns) As String
	Dim Widths(NumberOfColumns) As Int
	Dim col, row As Int
	For col = 0 To NumberOfColumns - 1
		headers(col) = Lst_ColNameTitle.get(col)
		Widths(col) = 162dip
	Next
	SetHeader(headers,Widths)
	SetColumnsWidths(Widths)
	
	
	For row = 0 To Lst.Size - 1
		Dim Item = Lst.Get(row) As AdapterListRizeFaktor
		Dim r(NumberOfColumns) As String
'		For col = 0 To NumberOfColumns - 1
		r(0) = row+1				
		r(1) = Item.fldCodeKala
		r(2) = Item.fldSharhKala		
		'r(3) = myCode.AdadToPrice(Item.fldTotalFaktor)
		r(3) = myCode.Is_Null_adad(Item.fldTedadJoz)	
		r(4) = myCode.Is_Null_adad(Item.fldTedadCarton)
		r(5) = "مانده"
		AddRow(r)
	Next
End Sub

Public Sub LoadSListRizFactorHavale(Lst As List,Lst_ColNameTitle As List, N_Col As Int)
	NumberOfColumns = N_Col
	innerClearAll(NumberOfColumns)
	
	Dim headers(NumberOfColumns) As String
	Dim Widths(NumberOfColumns) As Int
	Dim col, row As Int
	For col = 0 To NumberOfColumns - 1
		headers(col) = Lst_ColNameTitle.get(col)
		Widths(col) = 162dip
	Next
	SetHeader(headers,Widths)
	SetColumnsWidths(Widths)
	
	
	For row = 0 To Lst.Size - 1
		Dim Item = Lst.Get(row) As AdapteRizFactorHavale
		Dim r(NumberOfColumns) As String
'		For col = 0 To NumberOfColumns - 1
		r(0) = row+1		
		
		r(1) = Item.fldSharhKala
		r(2) = Item.fldCodeKala
		
		r(3) = NumberFormat(Item.fldFeeJoz	,1,3)
		r(4) = NumberFormat(Item.fldFeeYekCarton,1,3)
		
		
		If Item.fldMablaghTakhfif>0 Then
			r(5) = NumberFormat(Item.fldMablaghTakhfif,1,3)
			r(6) =Item.fldDarsadTakhfif
			Else
			r(5) =0
			r(6) =0
		End If
		
		r(7) = Item.fldTedadJoz
		r(8) = Item.fldTedadCarton
		
		r(9) = Item.fldCodeAnbar
		r(10) = Item.fldCodeVasete		
		r(11) = Item.fldC_Ranandeh
		r(12) = Item.fldN_Ranandeh
		
		AddRow(r)
	Next
End Sub

Sub LoadSListVisitor(Lst As List,Lst_ColNameTitle As List, N_Col As Int)' As Long()
	NumberOfColumns = N_Col
	innerClearAll(NumberOfColumns)
	
	Dim headers(NumberOfColumns) As String
	Dim Widths(NumberOfColumns) As Int
	Dim col, row As Int
	For col = 0 To NumberOfColumns - 1
		headers(col) = Lst_ColNameTitle.get(col)
		Widths(col) = 162dip
	Next
	SetHeader(headers,Widths)
	SetColumnsWidths(Widths)
	
'	Dim Lng(3) As Long
'	
'	For Each coljRoot As Map In Lst
'		Dim r(NumberOfColumns) As String
'		r(4) = coljRoot.Get("articleName")
'		r(3) = coljRoot.Get("tedadTaki")
'		r(2) = coljRoot.Get("tedadKarton")
'		r(1) = coljRoot.Get("tedadKol")
'		r(0) = NumberFormat(coljRoot.Get("amount"),1,3)' & "ریال "
	For i=0 To Lst.Size-1
		Dim Item = Lst.Get(i) As AdapterReportVisitor
		AddRow(Array As String (NumberFormat(Item.fldFeeJoz,1,3),Item.fldCount,Item.fldTedadKol,Item.fldTedadCarton,Item.fldTedadJoz,Item.fldSharhKala))
	Next
	
'		Lng(0) = coljRoot.Get("totalOrderCount")
'		Lng(1) = Lng(1) + coljRoot.Get("amount")
'		Lng(2) = coljRoot.Get("visitorPorsant")
'	Next
	ProgressDialogHide
'	Return Lng
End Sub

Sub LoadSListSoorathesab(Lst As List,Lst_ColNameTitle As List, N_Col As Int)' As Long()
	NumberOfColumns = N_Col
	innerClearAll(NumberOfColumns)
	
	Dim headers(NumberOfColumns) As String
	Dim Widths(NumberOfColumns) As Int
	Dim col, row As Int
	For col = 0 To NumberOfColumns - 1
		headers(col) = Lst_ColNameTitle.get(col)
		Widths(col) = 162dip
	Next
	SetHeader(headers,Widths)
	SetColumnsWidths(Widths)
	
'	Dim Lng(3) As Long
'	
'	For Each coljRoot As Map In Lst
'		Dim r(NumberOfColumns) As String
'		r(4) = coljRoot.Get("articleName")
'		r(3) = coljRoot.Get("tedadTaki")
'		r(2) = coljRoot.Get("tedadKarton")
'		r(1) = coljRoot.Get("tedadKol")
'		r(0) = NumberFormat(coljRoot.Get("amount"),1,3)' & "ریال "
	For i=0 To Lst.Size-1
		Dim Item = Lst.Get(i) As AdapterReportSooratHesab
		Dim fldMande As String
		Dim fldBestankar As String
		Dim fldBedehkar As String
		
		If Item.fldMande<>Null Then
			fldMande=NumberFormat(Item.fldMande,1,3)
			Else
			fldMande=0
		End If
		
		If Item.fldBestankar<>Null Then
			fldBestankar=NumberFormat(Item.fldBestankar,1,3)
		Else
			fldBestankar=0
		End If
		
		If Item.fldBedehkar<>Null Then
			fldBedehkar=NumberFormat(Item.fldBedehkar,1,3)
		Else
			fldBedehkar=0
		End If
		
		
		AddRow(Array As String (fldMande,fldBestankar,fldBedehkar,Item.fldDate,Item.fldRiz,Item.fldSharh,Item.fldSanad,Item.shomare,Item.fldRadif))
	Next
	
'		Lng(0) = coljRoot.Get("totalOrderCount")
'		Lng(1) = Lng(1) + coljRoot.Get("amount")
'		Lng(2) = coljRoot.Get("visitorPorsant")
'	Next
	ProgressDialogHide
'	Return Lng
End Sub
'Sub LoadSListVisitor(Lst As List,Lst_ColNameTitle As List, N_Col As Int)' As Long()
'	NumberOfColumns = N_Col
'	innerClearAll(NumberOfColumns)
'	
'	Dim headers(NumberOfColumns) As String
'	Dim Widths(NumberOfColumns) As Int
'	Dim col, row As Int
'	For col = 0 To NumberOfColumns - 1
'		headers(col) = Lst_ColNameTitle.get(col)
'		Widths(col) = 162dip
'	Next
'	SetHeader(headers,Widths)
'	SetColumnsWidths(Widths)
'	
''	Dim Lng(3) As Long
''	
''	For Each coljRoot As Map In Lst
''		Dim r(NumberOfColumns) As String
''		r(4) = coljRoot.Get("articleName")
''		r(3) = coljRoot.Get("tedadTaki")
''		r(2) = coljRoot.Get("tedadKarton")
''		r(1) = coljRoot.Get("tedadKol")
''		r(0) = NumberFormat(coljRoot.Get("amount"),1,3)' & "ریال "
'	For i=0 To Lst.Size-1
'		Dim Item = Lst.Get(i) As AdapterReportVisitor
'		AddRow(Array As String (NumberFormat(Item.amount,1,3),Item.tedadKol,Item.tedadKarton,Item.tedadTaki,Item.articleName))
'	Next
'	
''		Lng(0) = coljRoot.Get("totalOrderCount")
''		Lng(1) = Lng(1) + coljRoot.Get("amount")
''		Lng(2) = coljRoot.Get("visitorPorsant")
''	Next
'	ProgressDialogHide
''	Return Lng
'End Sub
'Clears the previous table and loads the CSV file to the table.
'You should first add the Table to the activity before calling this method.
'Public Sub LoadTableFromCSV(Dir As String, Filename As String, HeadersExist As Boolean)
'	
'	Dim List1 As List
'	Dim h() As String
'	If HeadersExist Then
'		Dim headers As List
'		List1 = StringUtils1.LoadCSV2(Dir, Filename, ",", headers)
'		Dim h(headers.Size) As String
'		For i = 0 To headers.Size - 1
'			h(i) = headers.Get(i)
'		Next
'	Else
'		List1 = StringUtils1.LoadCSV(Dir, Filename, ",")
'		Dim firstRow() As String
'		firstRow = List1.Get(0)
'		Dim h(firstRow.Length)
'		For i = 0 To firstRow.Length - 1
'			h(i) = "Col" & (i + 1)
'		Next
'	End If
'	innerClearAll(h.Length)
'	ColumnWidth = SV.Width / NumberOfColumns
'	SetHeader(h)
'	For i = 0 To List1.Size - 1
'		Dim row() As String
'		row = List1.Get(i)
'		AddRow(row)
'	Next
'End Sub

'Saves the table to a CSV file.
Public Sub SaveTableToCSV(Dir As String, Filename As String)
	Dim headers(NumberOfColumns) As String
	For i = 0 To headers.Length - 1
		Dim l As Label
		l = Header.GetView(i)
		headers(i) = l.Text
	Next
	StringUtils1.SaveCSV2(Dir, Filename, ",", Data, headers)
End Sub


