B4A=true
Group=Activity
ModulesStructureVersion=1
Type=Activity
Version=10
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
#End Region

Sub Process_Globals
	Dim listKala As List
End Sub

Sub Globals
	'Private LblBasketCount As Label
	Private Hlv As Hitex_LayoutView
	Private pnl_hlv As Panel
	Private pos As Int=0
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Try
	Activity.LoadLayout("L_KalaPaging_2")
	Hlv.Initializer("hlv").ListView.Horizontal.Build
'	Activity.AddView(Hlv,0,pnl_hlv.Top,100%x,pnl_hlv.Height)
	pnl_hlv.AddView(Hlv,0,0,96%x ,pnl_hlv.Height)
	'LblBasketCount.Initialize("LblBasketCount")
		Hlv.Show
	Catch
		Log(LastException)
		myCode.SendError(LastException,Activity.Title&"-Activity_Create")
	End Try
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub RefreshLblSabad
'	Try
'		Dim Cu As Cursor = MCode.Result("Select * From TblSabad")
'		If Cu.RowCount>0 Then
'			LblBasketCount.Visible=True
'			LblBasketCount.Text=Cu.RowCount
'		Else
'			LblBasketCount.Visible=False
'		End If
'	Catch
'		Log(LastException)
'	End Try

End Sub
Sub LblBasket_Click
'	If LblBasketCount.Visible Then
'		StartActivity(Act_Sabad)
'		Activity.Finish
'	Else
'		ToastMessageShow("سبد خرید خالی است",False)
'	End If
End Sub
Sub LblBasketCount_Click
	LblBasket_Click
End Sub

Private Sub hlv_onCreateViewHolder (Parent As Panel, ViewType As Int)      '💎 onCreate 💎'
	Dim rec As cls_kalaPaging2
	rec.Initialize(Me)
	Parent.AddView(rec.Panel,0,0,100%x,100%y)
	Parent.Tag=rec
End Sub
Sub hlv_onBindViewHolder (Parent As Panel, Position As Int)         '💠 onBind 💠'
	Dim rec As cls_kalaPaging2 = Parent.Tag
	rec.show(listKala.Get(Position))
	Parent.Width=rec.Width
	Parent.Height=rec.Height
End Sub
Sub hlv_GetItemCount As Int 								        '💯 ItemCount 💯'
	Return listKala.Size '/ItemList.Size
	
End Sub

Private Sub btn_back_Click
	Activity.Finish
End Sub

Private Sub btnPrev_Click
	If pos>0 Then pos=pos-1
	Hlv.SmoothScrollToPosition(pos)
End Sub

Private Sub btnNext_Click
	If pos<listKala.Size Then pos=pos+1
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

Sub Application_Error (Error As Exception, StackTrace As String) As Boolean
'	MCode.ScheduleRestartCrashedActivity(DateTime.Now + 300, Activity.Title, Error)
	Return True
End Sub