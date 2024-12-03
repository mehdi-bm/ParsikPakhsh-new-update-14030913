B4A=true
Group=Class
ModulesStructureVersion=1
Type=Class
Version=12.2
@EndOfDesignText@
Sub Class_Globals
	Private p As Panel
	Private pnl_bk As Panel
	Private base As Object
	Private Key As IME

	Dim item As AdapterListVideo
	Private lblTitle As Label
	Private imgV As ImageView
	Private lblPlay As Label
End Sub

Public Sub Initialize(mdl As Object)
	Try
		base = mdl
		Key.Initialize("Key")
		p.Initialize("")
		p.SetLayout(0,0,100%x,100%y)
		p.LoadLayout("l_rec_video")
	
	

	Catch
		MCode.SendError(LastException)
		Log(LastException)
	End Try
End Sub

Public Sub Show(Item1 As AdapterListVideo,position As Int)
	item=Item1
	lblTitle.Text=Item1.fldTitle
	Dim Link As String=item.fldImage


	Dim Glide As Hitex_Glide
'	Glide.Get.ClearDiskCache
'	Glide.Get.ClearMemory
	Dim RequestOptions As Hitex_RequestOptions
	RequestOptions.Initialize.FitCenter

	Glide.GetBitmap2("Glide", item.fldTitle, Link, RequestOptions)
	
'	Glide.
'	Glide.Load2(Link).Into(imgV)
'	Glide.Load2(Link).Apply(Glide.RequestOptions).Apply(Glide.RO.FitCenter).Into(imgV)
End Sub

Sub Glide_onGetBitmap (Tag As Object, getBitmap As Bitmap)
	Log(Tag)
	Log(getBitmap)
	imgV.Bitmap = getBitmap
End Sub

Public Sub getHeight As Int
	Return pnl_bk.Height
End Sub

Public Sub getPanel As Panel
	pnl_bk.RemoveView
	Return pnl_bk
End Sub

Private Sub lblPlay_Click
	
	CallSubDelayed2(Act_Video,"LoadVideo",item)
End Sub