B4A=true
Group=Class
ModulesStructureVersion=1
Type=Class
Version=12.2
@EndOfDesignText@
Sub Class_Globals
	Private p As Panel
	Private pnl_bk As Panel
	Private base As B4XView
	Private ImageRow As ImageView
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(mdl As Object)
	base = mdl
	p.Initialize("")
	p.SetLayout(0,0,100%x,100%y)
	p.LoadLayout("L_ImageSlide")
	
End Sub

Public Sub Show(Link As List,Position As Int,item As AdapterListKala)
	'myCode.DownloadImage2(Link.Get(Position),ImageRow)
	MCode.placeHolder=MCode.GetPicKala(item.CodeKala)
	ImageRow.Bitmap=MCode.placeHolder
End Sub

Public Sub getPanel As Panel
	pnl_bk.RemoveView
	Return pnl_bk
End Sub

Public Sub getHeight As Int
	Return pnl_bk.Height
End Sub

Public Sub getWidth As Int
	Return pnl_bk.Width
End Sub
