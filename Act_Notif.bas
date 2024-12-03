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

End Sub

Sub Globals
	
	Private HLV As Hitex_LayoutView
	Private Pnl_HLV As Panel
End Sub

Sub Activity_Create(FirstTime As Boolean)
	MCode.ListNotif.Initialize
	MCode.ListNotif.Clear
	Activity.LoadLayout("L_Notif")
	HLV.Initializer("HLV").ListView.Build
'	HLV.Divider.Add2(Colors.White,5dip,0dip,0dip)
	Pnl_HLV.AddView(HLV,0,5%y,Pnl_HLV.Width,Pnl_HLV.Height)
	
'	ProgressDialogShow2("لطفا صبر کنید . . .",False)
'	Dim j As HttpJob
'	j.Initialize("",Me)
'	j.PostMultipart("http://" & MCode.url & "/api/Visitor/GetNotifications",Null,Null )
	
LoadData
		
End Sub

Sub LoadData
	Dim cu As Cursor

		MCode.ListNotif.Clear

	cu=MCode.Result("Select * from TblNotifi order by Id desc")
	For i = 0 To cu.RowCount - 1
		Dim Item As AdapterListNotif
		cu.Position=i
		Item.FldId=cu.GetInt("Id")
		Item.FldTitle=cu.GetString("FldTitle")
		Item.FldBody=cu.GetString("FldBody")
		Item.FldDate=cu.GetString("FldDate")
		Item.FldTime=cu.GetString("FldTime")
		MCode.ListNotif.Add(Item)
	Next
	CreateListView
End Sub

Sub Activity_Resume
	
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub
Sub CreateListView
	ProgressDialogHide
	If MCode.ListNotif.Size>0 Then
		HLV.Show
	Else
		Activity.Finish
		ToastMessageShow("اعلانی وجود ندارد",True)
	End If
End Sub

Sub HLV_GetItemCount As Int 								        '💯 ItemCount 💯'
	Return MCode.ListNotif.Size
End Sub

Sub HLV_onCreateViewHolder (Parent As Panel, ViewType As Int)      '💎 onCreate 💎'
	Dim rec As cls_RecNotif
	rec.Initialize
	Parent.AddView(rec.Panel,0,0,100%x,rec.Height)
	Parent.Tag=rec
End Sub

Sub HLV_onBindViewHolder (Parent As Panel, Position As Int)         '💠 onBind 💠'
	Dim Item = MCode.ListNotif.Get(Position) As AdapterListNotif
	Dim rec As cls_RecNotif=Parent.Tag
	rec.show_data(Item)
	Parent.Height=rec.Height
End Sub

Sub btn_Back_Click
	Activity.Finish
End Sub