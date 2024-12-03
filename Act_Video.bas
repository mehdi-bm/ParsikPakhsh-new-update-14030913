B4A=true
Group=Activity
ModulesStructureVersion=1
Type=Activity
Version=12.2
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
#End Region

Sub Process_Globals
	Dim Videolist As List
End Sub

Sub Globals
	Private HLV As Hitex_LayoutView
	Private Pnl_HLV As Panel	
	Private Pnl_PlayVideo As Panel
	Private lblCloseV As Label
	Private lblTitle As Label
	Private SimpleExoPlayerView1 As SimpleExoPlayerView
	Private player1 As SimpleExoPlayer
	Private pnl_Video As Panel
	Private items As AdapterListVideo
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Activity.LoadLayout("l_Video")
	HLV.Initializer("HLV").GridView(2).Build
	Pnl_HLV.AddView(HLV,0,0,Pnl_HLV.Width,Pnl_HLV.Height)
	Videolist.Initialize
	player1.Initialize("player")
	Pnl_PlayVideo.Visible=False
	ProgressDialogShow2("لطفا صبر کنید . . .",False)
	Sleep(150)
	CallSubDelayed(Service_Server,"GetVideoAmoozesh")
End Sub

Sub LoadData(lst As List)	
	Videolist.Clear
	Dim Row As Map
	For i = 0 To lst.Size-1
		Dim item As AdapterListVideo
		Row=lst.Get(i)
		item.Id=Row.Get("Id")
		item.fldTitle=Row.Get("fldTitle")
		item.fldLink=Row.Get("fldLink")
		item.fldDate=Row.Get("fldDate")
		item.fldTime=Row.Get("fldTime")
		item.fldVaziat=Row.Get("fldVaziat")
		item.fldDescription=Row.Get("fldDescription")
		item.fldImage=Row.Get("fldImage")
		Videolist.Add(item)
	Next
	HLV.Show
	HLV.notifyDataSetChanged
	ProgressDialogHide
End Sub

Sub HLV_GetItemCount As Int 								        '💯 ItemCount 💯'
	Return Videolist.Size
End Sub

Sub HLV_onCreateViewHolder (Parent As Panel, ViewType As Int)      '💎 onCreate 💎'
	Dim rec As Cls_Rec_Video
	rec.Initialize(Me)
	Parent.AddView(rec.Panel,0,0,100%x,rec.Height)
	Parent.Tag=rec
End Sub

Sub HLV_onBindViewHolder (Parent As Panel, Position As Int)         '💠 onBind 💠'
	Dim Item = Videolist.Get(Position) As AdapterListVideo
	Dim rec As Cls_Rec_Video=Parent.Tag
	rec.Show(Item,Position)
	Parent.Height=rec.Height
End Sub

Private Sub HLV_ItemClick (ClickedItem As Panel, Position As Int)		'👆 ItemClick 👆'
	MCode.VideoSelected=Position
End Sub

Private Sub btn_Back_Click
	Activity.Finish
End Sub

Private Sub lblCloseV_Click
	MCode.AnimationClose(Pnl_PlayVideo)
	Pnl_PlayVideo.Visible=False
	player1.Pause
End Sub



Sub Activity_KeyPress (KeyCode As Int) As Boolean 'Return True to consume the event
	Try
		If KeyCode=KeyCodes.KEYCODE_BACK Then
			If Pnl_PlayVideo.Visible Then
				lblCloseV_Click
			Else		
				If player1.IsPlaying Then
					player1.Pause
				End If
					Activity.Finish
			
			End If
			Return True
		End If
		
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-Activity_KeyPress")
	End Try
	Return True
End Sub

Public Sub LoadVideo(item As AdapterListVideo)
	Try
	items=item
	Pnl_PlayVideo.Visible=True
	MCode.AnimationOpen(Pnl_PlayVideo)
	lblTitle.Text=item.fldTitle.Replace("-"," ")
	SimpleExoPlayerView1.Player = player1 'Connect the interface to the engine
		player1.Prepare(player1.CreateUriSource(item.fldLink))
		
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-LoadVideo")
	End Try
End Sub

Sub Player_Ready
	Log("Ready")
	player1.Play
End Sub

Sub Player_Error (Message As String)
	Log("Error: " & Message)
End Sub

Sub Player_Complete
	Log("complete")
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)
	player1.Pause
End Sub
Sub Application_Error (Error As Exception, StackTrace As String) As Boolean
'	MCode.ScheduleRestartCrashedActivity(DateTime.Now + 300, Activity.Title, Error)
	Return True
End Sub

Private Sub lblDownload_Click
	Try
		Dim p1 As PhoneIntents
		StartActivity(p1.OpenBrowser(items.fldLink))
	Catch
		Log(LastException)
	End Try
End Sub