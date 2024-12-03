B4A=true
Group=Activity
ModulesStructureVersion=1
Type=Activity
Version=9.801
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
#End Region

Sub Process_Globals
	Dim Item As AdapterListKala
	Dim lstLink As List 
End Sub

Sub Globals
	'Private pnlSlider As Panel
	Dim lstGalleryOffline As List
	Private Hlv As Hitex_LayoutView
	Private pnl_hlv As Panel
	Private pos As Int=0
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Try
		
	Activity.LoadLayout("L_Show_Image2")
		Hlv.Initializer("Hlv").ListView.Horizontal.Build
	lstLink.Initialize
	lstGalleryOffline.Initialize
	pnl_hlv.AddView(Hlv,0,0,96%x ,pnl_hlv.Height)
		MCode.page="Show_Image2"
	Hlv.Show
		LoadData
	
	Catch
	Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-Activity_Create")
	End Try
End Sub

Sub LoadData
	
	
	'	Link = Regex.Split(",",MCode.ImageUrl &Item.fldPathPic)
	Dim DefaultPath As String=""
	Try
		Dim Link As String
		If MCode.PicOnline=1 Then
			If Item.fldPathPic="0" Then
				'gallery Online list
				
				DefaultPath=MCode.GetPicKalaPath(Item.CodeKala)
				lstLink.Add(DefaultPath)
			Else
				DefaultPath=MCode.ImageUrl &Item.fldPathPic
				lstLink.Add(DefaultPath)
			End If
			
		Else
'			MCode.placeHolder=MCode.GetPicKala(Item.CodeKala)
'			ImageRow.Bitmap=MCode.placeHolder
			DefaultPath=MCode.GetPicKalaPath(Item.CodeKala)
			lstLink.Add(DefaultPath)
		End If
		
	Catch
		Log(LastException)
	End Try
	

'	If Item.fldPathPic<>"0" Then
'		'gallery Online list
'		DefaultPath=MCode.ImageUrl &Item.fldPathPic
'		lstLink.Add(DefaultPath)
'	Else
'		'gallery Offline list
'		DefaultPath=MCode.GetPicKalaPath(Item.CodeKala)
'		lstLink.Add(DefaultPath)
'	End If
	Dim cu As Cursor=MCode.Result("select * from TblGalleryPic where fldShow='1' and fldCodeKala='"&Item.CodeKala &"'")
	If cu.RowCount>0 Then
		'gallery Online list
		For i=0 To cu.RowCount-1
			cu.Position=i
			lstLink.Add(MCode.ImageUrl &cu.GetString("fldImage"))
		Next
	Else
		lstGalleryOffline=MCode.GetListGalleryKala(Item.CodeKala)
		
		If lstGalleryOffline.Size>0 Then
			'gallery Offline list
			For i=0 To lstGalleryOffline.Size-1
				cu.Position=i
				Dim filename As String=lstGalleryOffline.Get(i)
				DefaultPath=File.Combine(File.DirDefaultExternal &"/parsik/GalleryKala/"&Item.CodeKala,filename)
				lstLink.Add(DefaultPath)
			Next
		End If
	End If
	Hlv.notifyDataSetChanged
End Sub

Sub Hlv_onCreateViewHolder (Parent As Panel, ViewType As Int)      '# onCreate #'
	Dim rec As cls_ImageSlideShow
	rec.Initialize(Me)
	Parent.AddView(rec.Panel,0,0,100%x,100%y)
	Parent.Tag=rec
End Sub

Sub Hlv_onBindViewHolder (Parent As Panel, Position As Int)         '* onBind *'
	Dim rec As cls_ImageSlideShow = Parent.Tag
	rec.show(lstLink,Position,Item)
	Parent.Width=rec.Width
	Parent.Height=rec.Height
End Sub

Sub Hlv_GetItemCount As Int 								        '$ ItemCount $'
	Return lstLink.Size '/ItemList.Size
End Sub



Private Sub btnPrev_Click
	If pos>0 Then pos=pos-1
	Hlv.SmoothScrollToPosition(pos)
End Sub

Private Sub btnNext_Click
	If pos<lstLink.Size Then pos=pos+1
	Hlv.SmoothScrollToPosition(pos)
End Sub

Private Sub EventName_onScrollStateChanged (State As Int)
	Select (State)
		Case Hlv.SCROLL_STATE_DRAGGING
			Log("DRAGGING")
		Case Hlv.SCROLL_STATE_IDLE
			Log("IDLE")
		Case Hlv.SCROLL_STATE_SETTLING
			Log("SETTLING")
	End Select

End Sub
Private Sub Hlv_onScrollListener (dx As Int,dy As Int)
	pos = Hlv.GetVisibleItemPosition(True,False)
End Sub


Private Sub btn_back_Click
	Activity.Finish
End Sub

'Sub Activity_Create(FirstTime As Boolean)
'	Activity.LoadLayout("L_Show_Image")
'	Try
'		Dim pa As PagerBulletAdapter
'		pa.Initialize
'		Dim Link As List
'		Link.Initialize
'		lstGalleryOffline.Initialize
''	Link = Regex.Split(",",MCode.ImageUrl &Item.fldPathPic)
'		Dim DefaultPath As String=""
'	
'		If Item.fldPathPic<>"0" Then
'			'gallery Online list
'			DefaultPath=MCode.ImageUrl &Item.fldPathPic
'			Link.InsertAt(0,DefaultPath)
'		Else
'			'gallery Offline list
'			DefaultPath=MCode.GetPicKalaPath(Item.CodeKala)
'			Link.InsertAt(0,DefaultPath)
'		End If
'		Dim cu As Cursor=MCode.Result("select * from TblGalleryPic where fldShow='1' and fldCodeKala='"&Item.CodeKala &"'")
'		If cu.RowCount>0 Then
'			'gallery Online list
'			For i=0 To cu.RowCount-1
'				cu.Position=i
'				Link.InsertAt(i+1,MCode.ImageUrl &cu.GetString("fldImage"))
'			Next
'		Else
'			lstGalleryOffline=MCode.GetListGalleryKala(Item.CodeKala)
'		
'			If lstGalleryOffline.Size>0 Then
'				'gallery Offline list
'				For i=0 To lstGalleryOffline.Size-1
'					cu.Position=i
'					Dim filename As String=lstGalleryOffline.Get(i)
'					DefaultPath=File.Combine(File.DirDefaultExternal &"/parsik/GalleryKala/"&Item.CodeKala,filename)
'					Link.InsertAt(i+1,DefaultPath)
'				Next
'			End If
'		End If
'		For i = 0 To Link.Size-1
'			Dim p As Panel
'			p.Initialize("")
'			p.SetLayout(0,0,100%x,100%y)
'			pa.AddPage(P)
'			Dim Ph As Hitex_PhotoView
'			Ph.Initialize("imgv")
''		Ph.MinScale=.7
'			Ph.Zoomable=True
'			p.AddView(Ph,0,0,p.Width,p.Height)
'			Try
'				myCode.DownloadImage(Link.Get(i),Ph)
'				Log(Link.Get(i))
'			Catch
''			Ph=MCode.ImgNothing
'				Log(LastException)
'			End Try
'		Next
'		Dim pb As PagerBullet
'		pb.Initialize(pa,"pb")
'		pnlSlider.AddView(pb,2,2,pnlSlider.Width-4,pnlSlider.Height-4)
'	Catch
'		Log(LastException)
'		myCode.SendError(LastException.Message,"Act_ImageSlideShow-Activity_Create")
'
'	End Try
'End Sub

Sub Activity_KeyPress (KeyCode As Int) As Boolean 'Return True to consume the event
	If KeyCode=KeyCodes.KEYCODE_BACK Then
		Activity.Finish
	End If
	Return True
End Sub

Sub Activity_Resume
	'Hlv.notifyDataSetChanged
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub
Sub Application_Error (Error As Exception, StackTrace As String) As Boolean
'	MCode.ScheduleRestartCrashedActivity(DateTime.Now + 300, Activity.Title, Error)
	Return True
End Sub