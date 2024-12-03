B4A=true
Group=Activity
ModulesStructureVersion=1
Type=Activity
Version=8.8
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
#End Region

Sub Process_Globals

End Sub

Sub Globals
	
	Private HLV As Hitex_LayoutView
	Private Pnl_HLV As Panel
	Dim backuplist As List
	
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Activity.LoadLayout("l_Restore")
	HLV.Initializer("HLV").ListView.Build
'	HLV.Divider.Add2(Colors.White,5dip,0dip,0dip)
	Pnl_HLV.AddView(HLV,0,0,Pnl_HLV.Width,Pnl_HLV.Height)
	
'	ProgressDialogShow2("لطفا صبر کنید . . .",False)
'	Dim j As HttpJob
'	j.Initialize("",Me)
'	j.PostMultipart("http://" & MCode.url & "/api/Visitor/GetNotifications",Null,Null )
	
	LoadData
		
End Sub

Sub LoadData

	Dim RowsList As List
	RowsList=(File.ReadList(File.DirDefaultExternal,"Parsik/Backup/backlist.txt"))
	
	backuplist.Initialize
	For i = RowsList.Size - 1 To 0 Step -1
		Dim str As String=RowsList.Get(i)
		Dim components() As String
		Dim item As AdapterListBackupFile
		components = Regex.Split(",", str)
		item.FileName=components(0)
		item.Date=components(1)
		item.Time=components(2)
		backuplist.Add(item)
	Next
	HLV.Show
End Sub

Sub Activity_Resume
	LoadData
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Sub HLV_GetItemCount As Int 								        '💯 ItemCount 💯'
	Return backuplist.Size
End Sub
Sub HLV_onCreateViewHolder (Parent As Panel, ViewType As Int)      '💎 onCreate 💎'
	Dim rec As Cls_Rec_RestorFileItem
	rec.Initialize(Me)
	Parent.AddView(rec.Panel,0,0,100%x,rec.Height)
	Parent.Tag=rec
End Sub
Sub HLV_onBindViewHolder (Parent As Panel, Position As Int)         '💠 onBind 💠'
	Dim Item = backuplist.Get(Position) As AdapterListBackupFile
	Dim rec As Cls_Rec_RestorFileItem=Parent.Tag
	rec.Show(Item,Position)
	Parent.Height=rec.Height
End Sub

Sub btn_Back_Click
	Activity.Finish
End Sub

