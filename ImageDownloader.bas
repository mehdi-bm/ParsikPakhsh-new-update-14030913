Group=Services
ModulesStructureVersion=1
Type=Service
Version=2.71
@EndOfDesignText@
#Region  Service Attributes 
	#StartAtBoot: False
#End Region

Sub Process_Globals
	Private cache As Map
	Private tasks As Map
	Private ongoingTasks As Map
End Sub

Sub Service_Create
	tasks.Initialize
	cache.Initialize
	ongoingTasks.Initialize
End Sub

Sub Service_Start (StartingIntent As Intent)

End Sub

Sub Service_Destroy

End Sub

Sub Download (ImageViewsMap As Map)
	For i = 0 To ImageViewsMap.Size - 1
		tasks.Put(ImageViewsMap.GetKeyAt(i), ImageViewsMap.GetValueAt(i))
		Dim link As String = ImageViewsMap.GetValueAt(i)
		If cache.ContainsKey(link) Then
			Dim iv As ImageView = ImageViewsMap.GetKeyAt(i)
			iv.SetBackgroundImage(cache.Get(link))
		Else If ongoingTasks.ContainsKey(link) = False Then
			ongoingTasks.Put(link, "")
			Dim j As HttpJob
			j.Initialize(link, Me)
			j.Download(link)
		End If
	Next
End Sub

Sub JobDone(Job As HttpJob)
	ongoingTasks.Remove(Job.JobName)
	
	If Job.Success Then
		tasks.Clear
		cache.Clear
		Dim bmp As Bitmap = Job.GetBitmap
		Dim filename As String=MCode.CodeKalaImage & ".jpg"
		
		If File.Exists(File.DirDefaultExternal&"/Parsik/AksKala",filename) Then
			File.Delete(File.DirDefaultExternal&"/Parsik/AksKala",filename)
		End If
		Dim out As OutputStream
		out = File.OpenOutput(File.DirInternalCache, filename , False)
		bmp.WriteToStream(out, 100, "JPEG")
		out.Close
		Sleep(200)
		File.Copy(File.DirInternalCache, filename,File.DirDefaultExternal&"/Parsik/AksKala",filename)
		Sleep(200)
		
		cache.Put(Job.JobName, bmp)
		If tasks.IsInitialized Then
			For i = 0 To tasks.Size - 1
				Dim link As String = tasks.GetValueAt(i)
				If link = Job.JobName Then
					Dim iv As ImageView = tasks.GetKeyAt(i)
					iv.SetBackgroundImage(bmp)
				End If
			Next
		End If
		
		MCode.StatusPicKala="OK"
	Else
		Log("Error downloading image: " & Job.JobName & CRLF & Job.ErrorMessage)
	MCode.StatusPicKala="Error"
	End If
	Job.Release
End Sub
Sub ActivityIsPaused
	tasks.Clear
	cache.Clear
End Sub
