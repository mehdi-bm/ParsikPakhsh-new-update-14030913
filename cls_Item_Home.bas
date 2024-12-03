B4A=true
Group=Class
ModulesStructureVersion=1
Type=Class
Version=12.2
@EndOfDesignText@
Sub Class_Globals
	Private p As Panel
	Private pnl_BK As Panel
	Private imgV As ImageView
	Private lblTitle As Label
End Sub

Public Sub Initialize
	p.Initialize("")
	p.SetLayout(0,0,100%x,100%y)
	p.LoadLayout("l_item_home")
End Sub

Public Sub show(item As AdapterItemHome)
	imgV.Bitmap=LoadBitmap(File.DirAssets,item.img)
	lblTitle.Text=item.title
End Sub
Public Sub getPanel As Panel
	pnl_BK.RemoveView
	Return pnl_BK
End Sub
Public Sub getHeight As Int
	Return pnl_BK.Height+20dip
End Sub
Public Sub getWidth As Int
	Return pnl_BK.Width+5dip
End Sub

Private Sub pnl_bk_Click
	
End Sub