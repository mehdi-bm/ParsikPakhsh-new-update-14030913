B4A=true
Group=Class
ModulesStructureVersion=1
Type=Class
Version=8.8
@EndOfDesignText@
Sub Class_Globals
	Private p As Panel
	Private pnl_bk As Panel
	Private base As Object
	Private Key As IME
	Private lblNameFile As Label
	Private lblDate As Label
	Private lblTime As Label
	Dim item As AdapterListBackupFile
'	Public Provider As FileProvider
End Sub

Public Sub Initialize(mdl As Object)
	Try
		base = mdl
		Key.Initialize("Key")
		p.Initialize("")
		p.SetLayout(0,0,100%x,100%y)
		p.LoadLayout("l_ClsRecBackupitem")
'		Provider.Initialize
	

	Catch
		MCode.SendError(LastException)
		Log(LastException)
	End Try
End Sub

Public Sub Show(Item1 As AdapterListBackupFile,position As Int)
	item=Item1
	lblNameFile.Text="نام فایل: "&Item1.FileName
	lblDate.Text="تاریخ: "& Item1.Date
	lblTime.Text="ساعت: "&Item1.Time
End Sub

Public Sub getHeight As Int
	Return pnl_bk.Height
End Sub

Public Sub getPanel As Panel
	pnl_bk.RemoveView
	Return pnl_bk
End Sub

Sub btnRestore_Click
	Log(item.FileName)
	Msgbox2Async("" & CRLF & "آیا از اطلاعات فعلی فایل نسخه پیشتیبانی گرفته شود؟","توجه","بله","انصراف","خیر",Null,False)
	Wait For Msgbox_Result(Result As Int)
	Dim RestoreFile As String=item.FileName&".db"
	If Result=DialogResponse.POSITIVE Then	
		MCode.CreateBK("")
		File.Delete(File.DirDefaultExternal &"/Parsik","parsik_db.db")
		'File.Delete(File.DirDefaultExternal &"/Parsik","Parsik_db.db-journal")
		File.Copy(File.DirDefaultExternal &"/Parsik/Backup",RestoreFile,File.DirDefaultExternal &"/Parsik","parsik_db.db")
		ToastMessageShow("فایل پشتیبانی با موفقیت بازیابی شد",False)
		'Sleep(100)
		MCode.Sql1.Close
		StartActivity(Main)
	Else If Result=DialogResponse.NEGATIVE Then
												
		File.Delete(File.DirDefaultExternal &"/Parsik","parsik_db.db")
		'File.Delete(File.DirDefaultExternal &"/Parsik","Parsik_db.db-journal")
		File.Copy(File.DirDefaultExternal &"/Parsik/Backup",RestoreFile,File.DirDefaultExternal &"/Parsik","parsik_db.db")
		ToastMessageShow("فایل پشتیبانی با موفقیت بازیابی شد",False)
		'Sleep(100)
		MCode.Sql1.Close
		CallSubDelayed(Act_Restore,"btn_Back_Click")
		StartActivity(Main)
		
	End If
End Sub

Private Sub btnShare_Click
	Try
'		Dim pn As PNMultipleSharing
'		pn.
'		pn.ShareFileWithCaption(File.DirDefaultExternal &"/Parsik/Backup",item.FileName&".db","image/*","فایل پشتیبانی ","اشتراک گذاری")
'		Dim FileToSend As String = "Message.txt"
	'	File.WriteString(Provider.SharedFolder, FileToSend, "jaklsdjalksdjalskdjasld")
'		Dim filezipnew As String=item.FileName&"-"&DateTime.Now&".zip"
''		Dim zip As SD_ZipLibrary
''		zip.Initialize(Me,"zip")
''		
''		Wait For UZ_finish(Success As Boolean)
''		Dim root As String=File.Combine(File.DirDefaultExternal &"/Parsik/Backup",item.FileName&".db")
''		Dim ListFiles As List
''		ListFiles.Initialize
''		ListFiles.Add(root)
''		zip.Zip(ListFiles,filezipnew)
'		Wait For zip_finish(Success As Boolean)
'		Log("result:" &Success)
'		Dim in As Intent
'		in.Initialize(in.ACTION_SEND, "")
'		in.SetType("zip file/*")
'		in.PutExtra("android.intent.extra.STREAM", Provider.GetFileUri(root))
'		in.Flags = 1 'FLAG_GRANT_READ_URI_PERMISSION
'		StartActivity(in)
	Catch
		Log(LastException)
		ToastMessageShow("برنامه ای جهت اشتراک گذاری یافت نشد",True)
	End Try
End Sub

Private Sub zip_finish (Success As Boolean)
	Log(Success)
End Sub
