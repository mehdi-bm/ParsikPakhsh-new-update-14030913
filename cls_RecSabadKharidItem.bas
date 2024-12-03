B4A=true
Group=Class
ModulesStructureVersion=1
Type=Class
Version=10
@EndOfDesignText@
Sub Class_Globals
	Private p As Panel
	Private item As AdapterListKala
	Private pnl_BK As Panel
	Private lbl_Price As Label
	Private lbl_title As Label
	Private Img_Kala As ImageView
	Private lblTedadjoz As Label
	Private lblTedadKol As Label
	Private lblRemove As Label
	Private LblTedadEshan As Label
	Private BtnUpJoz As Label
	Private BtnDownJoz As Label
	Private lblTedadjoz As Label
	Private Panel2 As Panel
	Private BtnUpKol As Label
	Private BtnDownKol As Label
	Private lblTedadKol As Label
	Private Panel3 As Panel
	Private BtnDownEshan As Label
	Private BtnUpEshan As Label
	Private txtComment As EditText
	Private LblFeeBadAzTakhfid As Label
	Private lblVahedJoz As Label
	Private lblVahedKol As Label
	Private LblMojoodiJoz As Label
	Private LblMojoodiKol As Label
	Private LblTozihat As Label
	Private LblGift As Label
	Private ImageOff As ImageView
	Private LblC_Kala As Label
	Private LblTedadKarton As Label
	Private LblBuyPrice As Label
	Dim maxkolRond As String
	Private lblSumMablaghKala As Label
	Private LblMablaghTakhfif As Label
	Private lblDarsadTakhfif As Label
	Private pnlJoz As Panel
	Private pnlKol As Panel
	Private pnlEshan As Panel
	Private LblFeeYekKarton As Label
	Private base As Object
End Sub

Public Sub Initialize(mdl As Object)
	base = mdl
	p.Initialize("")
	p.SetLayout(0,0,100%x,100%y)
	p.LoadLayout("L_RecSabadKharidItem_2")
	'myCode.TextBoxBackColorWhite(txtComment)
	MojavezSefaresh
End Sub

Private Sub MojavezSefaresh
	Select MCode.MojavezSefaresh
		Case 0
			BtnUpJoz.Enabled=True
			BtnDownJoz.Enabled=True
			pnlJoz.Enabled=True
			lblTedadjoz.Enabled=True
			
			BtnUpKol.Enabled=True
			BtnDownKol.Enabled=True
			pnlKol.Enabled=True
			lblTedadKol.Enabled=True
		Case 1
			BtnUpJoz.Enabled=True
			BtnDownJoz.Enabled=True
			pnlJoz.Enabled=True
			lblTedadjoz.Enabled=True
			
			BtnUpKol.Enabled=False
			BtnDownKol.Enabled=False
			pnlKol.Enabled=False
			lblTedadKol.Enabled=False
		Case 2
			BtnUpJoz.Enabled=False
			BtnDownJoz.Enabled=False
			pnlJoz.Enabled=False
			lblTedadjoz.Enabled=False
			
			BtnUpKol.Enabled=True
			BtnDownKol.Enabled=True
			pnlKol.Enabled=True
			lblTedadKol.Enabled=True
	End Select
End Sub

Public Sub show_data(kala As AdapterListKala)
	Try
		item=kala
		LblC_Kala.Text = "کد کالا: " & item.CodeKala
		lbl_title.Text=item.NameKala
	
'		If item.MablaghTakhfif>0 Then
'			item.fldFeeBadAzTakhfif=item.FeeForoosh-item.MablaghTakhfif
'		End If
'		If item.FldFeeBadAzTakhfif > 0 Then
'			Price = item.FldFeeBadAzTakhfif * ((item.TedadDarSabadKol * item.TedadDarKarton) + item.TedadDarSabadJoz)
'			ImageOff.Visible=True
'		Else
'			Price = item.FeeForoosh * ((item.TedadDarSabadKol * item.TedadDarKarton) + item.TedadDarSabadJoz)
'			ImageOff.Visible=False
'		End If
'		lbl_Price.Text=NumberFormat2(Price,0,0,0,True)
'		If Price>0 Then
'			lblSumMablaghKala.Text="جمع مبلغ: "& NumberFormat(Price,1,3) & " " & MCode.VahedPool
'		Else
'			lblSumMablaghKala.Text="جمع مبلغ: 0"
'		End If
		Dim fee As Int
		'If Item.fldTipFee=0 Then
		fee=item.FeeForoosh
		
		If item.MablaghTakhfif>0 Then
			Dim tedadKol As String=item.TedadDarSabadJoz+(item.TedadDarSabadKol*item.TedadDarKarton)
			Dim FeeKol As String=(item.FeeForoosh*tedadKol)
			If tedadKol>0 Then
				item.MablaghTakhfif=(((item.FeeForoosh*tedadKol)*item.fldDarsadTakhfif)/100)
			Else
				item.MablaghTakhfif=(((item.FeeForoosh)*item.fldDarsadTakhfif)/100)
			End If
			item.fldFeeBadAzTakhfif=FeeKol-item.MablaghTakhfif
			LblMablaghTakhfif.Text="فی تخفیف: "& myCode.AdadToPrice(myCode.Is_Null_adad(item.MablaghTakhfif))
			LblMablaghTakhfif.TextColor=Colors.Red
			lblDarsadTakhfif.TextColor=Colors.Red
			LblMablaghTakhfif.Visible=True
			lblDarsadTakhfif.Visible=True
			lblDarsadTakhfif.Text="درصد تخفیف: %"& myCode.Is_Null_adad(item.fldDarsadTakhfif)
		Else
			lblDarsadTakhfif.Text=0
			LblMablaghTakhfif.Text=0
			LblMablaghTakhfif.Visible=False
			lblDarsadTakhfif.Visible=False
		End If
		
		
		If IsNumber(item.FldFeeBadAzTakhfif) = True Then
		
'		If Item.fldFeeBadAzTakhfif>=fee Then
'			LblFee.Text ="فی فروش: "& NumberFormat(myCode.Is_Null_adad(fee),1,3) & " " & MCode.VahedPool
'			LblFeeBadAzTakhfid.Text = ""
'			Item.FldFeeBadAzTakhfif=0
'			ImageOff.Visible=False				
			If item.FldFeeBadAzTakhfif > 0 Then
				MCode.Rs.Initialize("فی فروش: "& NumberFormat(myCode.Is_Null_adad(fee),1,3) & " " & MCode.VahedPool)
				MCode.Rs.Strikethrough (0, MCode.Rs.Length)
				MCode.Rs.Color(Colors.Red,0, MCode.Rs.Length)
				lbl_Price.Text = MCode.Rs
				LblFeeBadAzTakhfid.Text ="فی بعد از تخفیف: "& NumberFormat(myCode.Is_Null_adad(item.FldFeeBadAzTakhfif),1,3) & " " & MCode.VahedPool
				ImageOff.Visible=True
			Else If item.FldFeeBadAzTakhfif = 0 And item.fldDarsadTakhfif=100 Then
				MCode.Rs.Initialize("فی فروش: "& NumberFormat(myCode.Is_Null_adad(fee),1,3) & " " & MCode.VahedPool)
				MCode.Rs.Strikethrough (0, MCode.Rs.Length)
				MCode.Rs.Color(Colors.Red,0, MCode.Rs.Length)
				item.MablaghTakhfif=(item.FeeForoosh*item.TedadDarSabadJoz+(item.TedadDarSabadKol*item.TedadDarKarton))
				item.FldFeeBadAzTakhfif=0
				lbl_Price.Text = 0
				LblFeeBadAzTakhfid.Text ="فی بعد از تخفیف: "& NumberFormat(myCode.Is_Null_adad(item.FldFeeBadAzTakhfif),1,3) & " " & MCode.VahedPool
				ImageOff.Visible=True
			Else If item.FldFeeBadAzTakhfif = 0 Then
				MCode.Rs.Initialize("فی فروش: "& NumberFormat(myCode.Is_Null_adad(fee),1,3) & " " & MCode.VahedPool)
				MCode.Rs.Strikethrough (0, MCode.Rs.Length)
				MCode.Rs.Color(Colors.Red,0, MCode.Rs.Length)
				lbl_Price.Text = MCode.Rs
				LblFeeBadAzTakhfid.Text ="فی بعد از تخفیف: "& NumberFormat(myCode.Is_Null_adad(item.FldFeeBadAzTakhfif),1,3) & " " & MCode.VahedPool
				ImageOff.Visible=True
			Else
				lbl_Price.Text ="فی فروش: "& NumberFormat(myCode.Is_Null_adad(fee),1,3) & " " & MCode.VahedPool
				LblFeeBadAzTakhfid.Text = ""
				ImageOff.Visible=False
			End If
		Else
			lbl_Price.Text ="فی فروش: "& NumberFormat(myCode.Is_Null_adad(fee),1,3) & " " & MCode.VahedPool
			LblFeeBadAzTakhfid.Text = ""
		End If

'		If IsNumber(item.FldFeeBadAzTakhfif) = True Then
'			If item.FldFeeBadAzTakhfif > 0 Then
'				MCode.Rs.Initialize(NumberFormat(item.FeeForoosh,1,3) & " " & MCode.VahedPool)
'				MCode.Rs.Strikethrough (0, MCode.Rs.Length)
'				MCode.Rs.Color(Colors.Red,0, MCode.Rs.Length)
'				lbl_Price.Text = MCode.Rs
'				LblFeeBadAzTakhfid.Text ="فی بعد از تخفیف: "& NumberFormat(item.FldFeeBadAzTakhfif,1,3) & " " & MCode.VahedPool
		''				ImageOff.Visible=True
'			Else If item.FldFeeBadAzTakhfif = 0 And item.fldDarsadTakhfif=100 Then
'				MCode.Rs.Initialize("فی فروش: "& NumberFormat(myCode.Is_Null_adad(item.FldFeeBadAzTakhfif),1,3) & " " & MCode.VahedPool)
'				MCode.Rs.Strikethrough (0, MCode.Rs.Length)
'				MCode.Rs.Color(Colors.Red,0, MCode.Rs.Length)
'				lbl_Price.Text = 0
'				LblFeeBadAzTakhfid.Text ="فی بعد از تخفیف: "& NumberFormat(myCode.Is_Null_adad(item.FldFeeBadAzTakhfif),1,3) & " " & MCode.VahedPool
'				ImageOff.Visible=True
'			
'			Else If item.FldFeeBadAzTakhfif = 0 Then
'				MCode.Rs.Initialize("فی فروش: "& NumberFormat(myCode.Is_Null_adad(item.FldFeeBadAzTakhfif),1,3) & " " & MCode.VahedPool)
'				MCode.Rs.Strikethrough (0, MCode.Rs.Length)
'				MCode.Rs.Color(Colors.Red,0, MCode.Rs.Length)
'				lbl_Price.Text = MCode.Rs
'				LblFeeBadAzTakhfid.Text ="فی بعد از تخفیف: "& NumberFormat(myCode.Is_Null_adad(item.FldFeeBadAzTakhfif),1,3) & " " & MCode.VahedPool
		''				ImageOff.Visible=True
'			Else
'				lbl_Price.Text ="فی فروش: "& NumberFormat(item.FeeForoosh,1,3) & " " & MCode.VahedPool
'				LblFeeBadAzTakhfid.Text = ""
		''				ImageOff.Visible=False
'			End If
'		Else
'			lbl_Price.Text ="فی فروش: "& NumberFormat(item.FeeForoosh,1,3) & " " & MCode.VahedPool
'			LblFeeBadAzTakhfid.Text = ""
'		End If
		
'		If MCode.TakhfifKala="1" Then
	


'			If item.MablaghTakhfif>0 Then
'				LblMablaghTakhfif.Text="فی تخفیف: "& myCode.AdadToPrice(myCode.Is_Null_adad(item.MablaghTakhfif))
'				LblMablaghTakhfif.TextColor=Colors.Red
'				lblDarsadTakhfif.TextColor=Colors.Red
'				LblMablaghTakhfif.Visible=True
'				lblDarsadTakhfif.Visible=True
'				lblDarsadTakhfif.Text="درصد تخفیف: %"& myCode.Is_Null_adad(item.fldDarsadTakhfif)
'			Else If item.MablaghTakhfif=0 And item.fldDarsadTakhfif=100 Then
'			lblDarsadTakhfif.Text="درصد تخفیف: %"& myCode.Is_Null_adad(item.fldDarsadTakhfif)
'			LblMablaghTakhfif.Text="فی تخفیف: "& myCode.AdadToPrice(myCode.Is_Null_adad(item.MablaghTakhfif))
'			LblMablaghTakhfif.TextColor=Colors.Red
'			lblDarsadTakhfif.TextColor=Colors.Red
'			LblMablaghTakhfif.Visible=True
'			lblDarsadTakhfif.Visible=True
'			Else
'				lblDarsadTakhfif.Text=0
'				LblMablaghTakhfif.Text=0
'				LblMablaghTakhfif.Visible=False
'				lblDarsadTakhfif.Visible=False
'			End If
'		End If
		item.FldEshantion=myCode.Is_Null_adad(item.FldEshantion)
		
		
		Dim Price As Long=0
'		If myCode.Is_Null_adad(item.FldFeeBadAzTakhfif) > 0 Then
'			Price = item.FldFeeBadAzTakhfif * ((item.TedadDarSabadKol * item.TedadDarKarton) + item.TedadDarSabadJoz)
'			ImageOff.Visible=True
'		Else If myCode.Is_Null_adad(item.FldFeeBadAzTakhfif)=0 And item.fldDarsadTakhfif=100 Then
'			Price=0
'		Else
		Price = item.FeeForoosh * ((item.TedadDarSabadKol * item.TedadDarKarton) + item.TedadDarSabadJoz)
'			ImageOff.Visible=False
'		End If
	
		If Price>0 Then
			lblSumMablaghKala.Text="جمع مبلغ: "& NumberFormat(myCode.Is_Null_adad(Price),1,3) & " " & MCode.VahedPool
		Else
			lblSumMablaghKala.Text="جمع مبلغ: 0"
		End If
		
		lblTedadjoz.Text = item.TedadDarSabadJoz
		lblVahedJoz.Text = "تعداد به "& item.NameVahed
		lblTedadKol.Text = item.TedadDarSabadKol
		lblVahedKol.Text = "تعداد به "& item.NameVahed2
		LblTedadEshan.Text = myCode.Is_Null_adad(item.FldEshantion)
		txtComment.Text=item.Tozihat
		
		If item.Tozihat <> ""   Then
			LblTozihat.Visible=True
		Else
			LblTozihat.Visible=False
		End If
		myCode.DownloadImage5(item.CodeKala,item.fldPathPic,Img_Kala)
'		Dim Link As String
'		If MCode.PicOnline=1 Then
'			If item.fldPathPic="0" Then
'				MCode.placeHolder=MCode.GetPicKala(item.CodeKala)
'				Img_Kala.Bitmap=MCode.placeHolder
'			Else
'				Log("Link= " & item.fldPathPic)
'				Link=MCode.ImageUrl &item.fldPathPic
'				myCode.DownloadImage2(Link,Img_Kala)
'			End If
'		Else
'			MCode.placeHolder=MCode.GetPicKala(item.CodeKala)
'			Img_Kala.Bitmap=MCode.placeHolder
'				
'		End If
		If item.TedadDarKarton<>0 And IsNumber(item.TedadDarKarton)=True Then
			maxkolRond=(item.SumMandeKarton)
'			LblTedadKarton.Text="تعداد در کارتن: "& item.TedadDarKarton
			If item.NameVahed2="" Then
				LblTedadKarton.Text="تعداد در کارتن: "& item.TedadDarKarton
			Else
				LblTedadKarton.Text="تعداد در "&item.NameVahed2&": "& item.TedadDarKarton
			End If
			LblFeeYekKarton.Text="فی یک کارتن: "&myCode.AdadToPrice(item.FeeForoosh*item.TedadDarKarton)
			Log(maxkolRond)
		Else
			maxkolRond=0
'			LblTedadKarton.Text="تعداد در کارتن:"&maxkolRond
			If item.NameVahed2="" Then
				LblTedadKarton.Text="تعداد در کارتن: "& maxkolRond
			Else
				LblTedadKarton.Text="تعداد در "&item.NameVahed2&": "& maxkolRond
			End If
			LblFeeYekKarton.Text="فی یک کارتن: "&0
			LblMojoodiKol.Text ="موجودی کل: -"
		End If
		Log(maxkolRond)
		LblMojoodiJoz.Text ="موجودی جزء: "& item.SumMande & " " & item.NameVahed
	
		If  item.SumMandeKarton <> Null Then
			LblMojoodiKol.Text ="موجودی کل: "& maxkolRond & " " & item.NameVahed2
		Else
			LblMojoodiKol.Text ="موجودی کل: -"
			'ItemEntekhab.SumMandeKarton = 0
		End If
		'LblTedadEshan.Text="اشانتیون "&item.FldEshantion
		AddEshantion(item.TedadDarSabadJoz)
		LblBuyPrice.Text="قیمت مصرف کننده "& myCode.AdadToPrice(item.FldMablaghMasrafKonande)
		LblTedadKarton.Text="تعداد در کارتن "&item.TedadDarKarton
'		If item.FldLink.Length<15 Then
'			Img_Kala.Bitmap=LoadBitmap(File.DirAssets,"nothing2.png")
'		Else
'			Dim s() As String=Regex.Split(",",item.FldLink)
'			If s.Length>0 Then
'				myCode.DownloadImage(s(0),Img_Kala)
'				Img_Kala.Enabled=True
'			End If
'		End If
'		Try
'			Log("Link= " & item.fldPathPic)
'			Img_Kala.Bitmap=Null
'			Dim Link() As String
'			If item.fldPathPic ="0" Then item.fldPathPic = File.Combine(File.DirAssets,"ICON.png")
'			Link = Regex.Split(",",MCode.ImageUrl &item.fldPathPic)
'			myCode.DownloadImage(Link(0),Img_Kala)
'		Catch
'			Img_Kala.Bitmap=LoadBitmap(File.DirAssets,"ICON.png")
'			Log(LastException)
'		End Try
		If MCode.HideMojodi=1 Then
			LblMojoodiJoz.Visible=False
			LblMojoodiKol.Visible=False
		Else
			LblMojoodiJoz.Visible=True
			LblMojoodiKol.Visible=True
		End If
'		Try
'			Dim Link As String
'			If MCode.PicOnline=1 Then
'				If item.fldPathPic="0" Then
'					MCode.placeHolder=MCode.GetPicKala(item.CodeKala)
'					Img_Kala.Bitmap=MCode.placeHolder
'				Else
'					Log("Link= " & item.fldPathPic)
'					Link=MCode.ImageUrl &item.fldPathPic
'					myCode.DownloadImage(Link,Img_Kala)
'				End If
'			
'			Else
'				MCode.placeHolder=MCode.GetPicKala(item.CodeKala)
'				Img_Kala.Bitmap=MCode.placeHolder
'				
'			End If
'		
'		Catch
'		
'			Log(LastException)
'		End Try
		
'		If item.FeeForoosh = 0 Then
'			Status(False)
'		Else
'			Status(True)
'			If MCode.DoVahedi = 0 Then
		''				LblTedadKarton.Text = "تعداد در " & item.FldN_Vahed_Kol & ": " & " - "
'				BtnUpKol.Enabled=False
'				BtnDownKol.Enabled=False
'				lblTedadKol.Enabled=False
'				lblTedadKol.Text = "-"
'			Else
'				If item.FldTedadKarton = "0" Then
		''					LblTedadKarton.Text = "تعداد در " & item.FldN_Vahed_Kol & ": " & " - "
'					BtnUpKol.Enabled=False
'					BtnDownKol.Enabled=False
'					lblTedadKol.Enabled=False
'					lblTedadKol.Text = "-"
'				Else
		''					LblTedadKarton.Text = "تعداد در " & item.FldN_Vahed_Kol & ": " & item.FldTedadKarton & " " & item.FldN_Vahed
'					BtnUpKol.Enabled=True
'					BtnDownKol.Enabled=True
'					lblTedadKol.Enabled=True
'				End If
'			End If
'		End If
		
'		If MCode.ShowMande=1 Then
'			If item.FldTedadKarton = 0 Then
'				LblMojoodi.Text = "موجودی: " & item.FldMande
'			Else
'				Dim a,b As Int
'				a=item.FldMande
'				b=item.FldTedadKarton
'				LblMojoodi.Text = "موجودی: " & NumberFormat((a/b),0,0) & item.FldN_Vahed_Kol & " و " & (a Mod b) & item.FldN_Vahed
'			
'			End If
'		Else
'			LblMojoodi.Text = ""
'		End If
	
'		If item.FldMande<=0 Then
'			LblMojoodi.TextColor=Colors.Red
'		Else
'			LblMojoodi.TextColor=Colors.RGB(52,130,0)
'		End If

'		Dim eshan As Int=myCode.getSetting("setting.dat","WSetEshan",0)
'		LogColor("Eshan= " & eshan,Colors.Cyan)
'		If MCode.Action<>"SabtMarjooii" Then
'		
		'
'		End If
		'MojavezSefaresh
	Catch
		Log(kala.NameKala)
		Img_Kala.Enabled=False
		Log(LastException)
	End Try
'	If MCode.Action="SabtMarjooii" Then
'		BtnUpEshan.Enabled=False
'		BtnDownEshan.Enabled=False
'		LblTedadEshan.Color=Colors.LightGray
'	End If
'	AddToSabad
End Sub
Sub AddEshantion(t As Int)
'	If MCode.LoadEshantion(item.CodeKala)<>Null Then
'		Dim ItemEshantion As AdapterListEshantion=MCode.LoadEshantion(item.CodeKala)
'		Dim m,e,u As Int=0
'		If ItemEshantion<>Null Then
'			If ItemEshantion.fldVaziat=1 Then
'				m=ItemEshantion.fldCountForoosh
'				e=ItemEshantion.fldTedadEshantion
'				If t=m Then
'					item.fldCountEshantion=e
'				End If
'				If t>m Then
'					u=(t/m)
'					item.fldCountEshantion=u*e
'				End If
'				If t<m Then
'					item.fldCountEshantion=0
'					item.FldEshantion=0
'				End If
'		
'			End If
'		Else
'			item.fldCountEshantion=0
'			item.FldEshantion=0
'		End If
'	Else
'		item.fldCountEshantion=0
'		item.FldEshantion=0
'	End If
End Sub
Sub SetEshantion
	MCode.SaveUpdate("Delete from TblSabad where FldEshantion<>'0'")
	'Dim count1 As Int=MCode.SingleResult("Select Count(FldCodeKala) From TblSabad ")
	Dim Cu As Cursor = MCode.Result("Select * From TblSabad where FldCodeKala IN(SELECT tblEshantionTabaghati.fldCodeKalaForoosh FROM tblEshantionTabaghati)")
	For i=0 To Cu.RowCount -1
		Cu.Position=i
		'CallSubDelayed2(Act_KalaDefault,"AddEshantion",Cu)
		AddEshantion2(Cu)
	Next
End Sub
Sub AddEshantion2(ItemSabad As Cursor)
	Try
		Dim CodeKala As String =ItemSabad.GetString("FldCodeKala")
		Dim TedadDarKarton As String =myCode.Is_Null_adad(ItemSabad.GetString("FldTedadDarKarton"))
		Dim FldTedadDarSabadJoz As String =myCode.Is_Null_adad(ItemSabad.GetString("FldTedadDarSabadJoz"))
		Dim FldTedadDarSabadKol As String =myCode.Is_Null_adad(ItemSabad.GetString("FldTedadDarSabadKol"))
		Dim Eshantion As String= ItemSabad.GetString("FldEshantion")
		Dim TedadSabad As String=0
		If TedadDarKarton>0 Then
			Dim tedadKol As Int=(TedadDarKarton*FldTedadDarSabadKol)
			TedadSabad=tedadKol+FldTedadDarSabadJoz
		Else
			TedadSabad=FldTedadDarSabadJoz
		End If
		Dim ListEshantion As List
		ListEshantion.Initialize
		ListEshantion=MCode.LoadEshantionTabaghati(CodeKala)
		If ListEshantion.Size>0 Then
			Dim ItemMax = ListEshantion.Get(ListEshantion.Size-1) As AdapterListEshantion
			Dim fldTedadForooshMax As Int=ItemMax.fldTedadForoosh
			Dim fldTedadEshantionMax As Int=ItemMax.fldTedadEshantion
			Dim TedadEshantion As String
			Dim CodeKalaEshantation As String=0
			CodeKalaEshantation=ItemMax.fldCodeKalaEshantion
			If TedadSabad=fldTedadForooshMax Then
				TedadEshantion=fldTedadEshantionMax
			else if TedadSabad > fldTedadForooshMax Then
				Dim u As Int=0
				u=(TedadSabad/fldTedadForooshMax)
				TedadEshantion=u*fldTedadEshantionMax
			Else If TedadSabad < fldTedadForooshMax Then
				For i=0 To ListEshantion.Size-2
					Dim item1 = ListEshantion.Get(i) As AdapterListEshantion
					Log(item1.fldCodeKalaForoosh)
					Log(item1.fldCodeKalaEshantion)
					Dim fldTedadForoosh As Int=item1.fldTedadForoosh
					Dim fldTedadEshantion As Int=item1.fldTedadEshantion
					CodeKalaEshantation=item1.fldCodeKalaEshantion
					Log(fldTedadForoosh)
					Log(item1.fldTedadEshantion)
					If TedadSabad= fldTedadForoosh Then
						TedadEshantion=fldTedadEshantion
					else if TedadSabad>fldTedadForoosh Then
						Dim u As Int=0
						u=(TedadSabad/fldTedadForoosh)
						TedadEshantion=u*fldTedadEshantion
					else if TedadSabad<fldTedadForoosh Then
						TedadEshantion=0
					End If
				Next
			End If
			If TedadEshantion>0 Then
'				TxtSearch.Text=CodeKalaEshantation
				Dim Query As String="select * from TblKala where fldCodeKala="&CodeKalaEshantation
				Dim lst As List
				lst.Initialize
				lst=MCode.LoadListKala(Query)
				Dim item2 = lst.Get(0) As AdapterListKala
				Dim rec As CLs_RecDefultKala
				rec.Initialize(Me)
				rec.Show(item2,0)
				item2.TedadDarSabadJoz=0
				item2.TedadDarSabadKol=0
				item2.fldCountEshantion=TedadEshantion
			
				For j=0 To TedadEshantion-1
					rec.BtnUpEshan_Click
				Next
				'MCode.SaveUpdate("Delete from TblSabad where FldEshantion<>'0'")
				MCode.AddToSabad(item2)
				
'				TxtSearch.Text=""
			End If
			CallSubDelayed(Act_Sabad,"LoadListSabad")
		End If
		
	Catch
		Log(LastException)
		myCode.SendError(LastException,"AddEshantion2")
		
	End Try
	
'		If ItemEshantion<>Null Then
'			If ItemEshantion.fldVaziat=1 Then
'				m=ItemEshantion.fldCountForoosh
'				e=ItemEshantion.fldTedadEshantion
'				If t=m Then
'					Item.fldCountEshantion=e
'				End If
'				If t>m Then
'					u=(t/m)
'					Item.fldCountEshantion=u*e
'				End If
'				If t<m Then
'					Item.fldCountEshantion=0
'					Item.FldEshantion=0
'				End If
'			If Item.fldCountEshantion>0 Then
'				LblCountEshantion.Text=Item.fldCountEshantion
'			End If
'			
'			End If
'		Else
'			Item.fldCountEshantion=0
'			Item.FldEshantion=0
'		End If

End Sub

Sub Status(Enable As Boolean)
'	LogColor("status: "&Enable,Colors.Red)
'	BtnDownEshan.Enabled=Enable
'	BtnUpEshan.Enabled=Enable
'	LblTedadEshan.Enabled=Enable
'	
'	BtnDownJoz.Enabled=Enable
'	BtnUpJoz.Enabled=Enable
'	lblTedadjoz.Enabled=Enable
'	
'	BtnDownKol.Enabled=Enable
'	BtnUpKol.Enabled=Enable
'	lblTedadKol.Enabled=Enable
End Sub

Public Sub getPanel As Panel
	pnl_BK.RemoveView
	Return pnl_BK
End Sub
Public Sub getHeight As Int
	Return pnl_BK.Height+10dip
End Sub
Public Sub getWidth As Int
	Return pnl_BK.Width+5dip
End Sub
Private Sub pnl_bk_Click
'	act_showKala.Item=item
'	StartActivity(act_showKala)
End Sub

Sub lblRemove_Click
	If item.FldEshantion>0 Then
		If MCode.EshantionRemove=0 Then
			ToastMessageShow("شما مجوز حذف قلم اشانتیون را ندارید",False)
			Return
		End If
	Else
		If MCode.EshantionTabaghati=1 Then
			Dim cu As Cursor=MCode.Result("Select * from TblSabad where FldEshantion>0 ")
			For i=0 To cu.RowCount-1
				cu.Position=i
				If MCode.CheckCodeKalaEshantion(item.CodeKala,cu.GetString("FldCodeKala")) Then
					MCode.SaveUpdate("delete From TblSabad where FldCodeKala='"&cu.GetString("FldCodeKala")&"'")
					Exit
				End If
			Next
		End If
	End If

	
	Dim xui As XUI
	Dim sf As Object = xui.Msgbox2Async("آیا مایل به حذف این محصول از سبد خرید هستید؟", "", "بله", "", "خیر", Null)
	Wait For (sf) Msgbox_Result (Result As Int)
	If Result = xui.DialogResponse_Positive Then
		Log("Deleted!!!")
		MCode.SaveUpdate("delete From TblSabad where FldCodeKala='"&item.CodeKala&"'")
		CallSubDelayed(Act_Sabad,"LoadListSabad")
	End If
End Sub

Sub LblTozihat_Click
	If item.Tozihat <> "" Then
		Msgbox(item.Tozihat,"توضیحات کالا")
	End If
End Sub

Sub BtnUpJoz_Click
	Dim A As Float = 0
	Dim Val As Float = 0
'	Select Case MCode.isFloat
'		Case True
'			Val = 0.25
'		Case False
	Val = 1
'	End Select
	
	A = item.TedadDarSabadJoz
	If MCode.ForooshBishAzMojoodi = "1" Then
		A = A + Val
		item.SumMande = item.SumMande - Val

	Else if MCode.ForooshBishAzMojoodi = "0" Then
		If MCode.Action="SabtMarjooii" Then
			A = A + Val
			item.SumMande = item.SumMande - Val
		Else
			If item.SumMande > 0 Then
				A = A + Val
				item.SumMande = item.SumMande - Val
			Else
				ToastMessageShow("سفارش شما بیشتر از موجودی می باشد",True)
			End If
		End If
		
	End If
	item.TedadDarSabadJoz = A
	AddEshantion(A)
	AddToSabad
	
	
	If MCode.EshantionTabaghati=1 Then
		SetEshantion
	End If
End Sub

Sub BtnDownJoz_Click
	Dim A As Float = 0
	Dim Val As Float = 0
'	Select Case MCode.isFloat
'		Case True
'			Val = 0.25
'		Case False
	Val = 1
'	End Select
	
	A = item.TedadDarSabadJoz
	If A > 0 Then
		A = A - Val
		item.SumMande = item.SumMande + Val
		item.TedadDarSabadJoz = A
	Else
		lblRemove_Click
	End If
	AddEshantion(A)
	AddToSabad
	If MCode.EshantionTabaghati=1 Then
		SetEshantion
	End If
End Sub

Sub BtnUpKol_Click
	
	If item.TedadDarKarton=0 Then
		Return
	End If
	Dim A As Float = 0
	Dim Val As Float = 1


	A = item.TedadDarSabadKol
	If MCode.Action="SabtMarjooii" Then
		A = A + 1
		item.SumMandeKarton = item.SumMandeKarton - Val
	Else
		If MCode.ForooshBishAzMojoodi = "1" Then
			A = A + 1
			item.SumMandeKarton = item.SumMandeKarton - Val
		Else if MCode.ForooshBishAzMojoodi = "0" Then
			If item.SumMandeKarton > 0 Then
				A = A + Val
				item.SumMandeKarton = item.SumMandeKarton - Val
			Else
				ToastMessageShow("سفارش شما بیشتر از موجودی می باشد",True)
			End If
		End If
	End If
'	If MCode.ForooshBishAzMojoodi = "1" Then
'		A = A + 1
'		Item.SumMandeKarton = Item.SumMandeKarton - A
'	Else if MCode.ForooshBishAzMojoodi = "0" Then
'	
'		
'	End If
	item.TedadDarSabadKol = A
	'Dim kol As Int=Item.TedadDarKarton*A
	'AddEshantion(kol)
	AddToSabad
		
	If MCode.EshantionTabaghati=1 Then
		SetEshantion
	End If
End Sub

Sub BtnDownKol_Click
	
'	Dim A As Int = 0
'	A = Item.TedadDarSabadKol
'	If A > 0 Then
'		A = A - 1
'		Item.SumMandeKarton = Item.SumMandeKarton + Item.TedadDarSabadKol
'		Item.TedadDarSabadKol = A
'	'	Dim kol As Int=Item.TedadDarKarton*A
'	'	AddEshantion(kol)
'	End If


	If item.TedadDarKarton=0 Then
		Return
	End If
	Dim A As Float = 0
	Dim Val As Float = 1


	A = item.TedadDarSabadKol
	A = A - 1
	item.SumMandeKarton = item.SumMandeKarton + Val
	item.TedadDarSabadKol = A

	AddToSabad
	If MCode.EshantionTabaghati=1 Then
		SetEshantion
	End If
End Sub

'Sub BtnUpKol_Click
'	If item.TedadDarKarton=0 Then
'		Return
'	End If
'	Dim A As Int = 0
'	
'	A = item.TedadDarSabadKol
'	If MCode.ForooshBishAzMojoodi = "1" Then
'		A = A + 1
'		item.SumMande = item.SumMande - item.TedadDarKarton
'
'	Else if MCode.ForooshBishAzMojoodi = "0" Then
'		If MCode.Action="SabtMarjooii" Then
'			A = A + 1
'			item.SumMande = item.SumMande - item.TedadDarKarton
'		Else
'			If item.SumMande >= item.TedadDarKarton  Then
''			If Item.FldMax > 0 Then
''				If  A < Item.FldMax Then
''					A = A + 1
''				Else
''					ToastMessageShow("مقدار انتخابی شما بیشتر از حد مجاز است.",True)
''				End If
''			Else
'				A = A + 1
'				item.SumMande = item.SumMande - item.TedadDarKarton
''			End If
'			Else
'				ToastMessageShow("سفارش شما بیشتر از موجودی می باشد",True)
'			End If
'		End If
'	
'	End If
'	item.TedadDarSabadKol = A
'	AddToSabad
'	If MCode.EshantionTabaghati=1 Then
'		SetEshantion
'	End If
'End Sub
'
'Sub BtnDownKol_Click
'	Dim A As Int = 0
'	A = item.TedadDarSabadKol
'	If A > 0 Then
'		A = A - 1
'		item.SumMande = item.SumMande + item.TedadDarKarton
'		item.TedadDarSabadKol = A
'	End If
'	AddToSabad
'	If MCode.EshantionTabaghati=1 Then
'		SetEshantion
'	End If
'End Sub

Sub BtnUpEshan_Click
	Dim A As Int = 0
	Dim B As Int = 0
	A = item.FldEshantion
	If MCode.ForooshBishAzMojoodi = "1" Then
		If item.FldEshantion<item.fldCountEshantion Then
			A = A + 1
			item.SumMande = item.SumMande - 1
		End If
		
	Else if MCode.ForooshBishAzMojoodi = "0" Then
		B = item.SumMande - ((item.TedadDarSabadKol * item.TedadDarKarton) + item.TedadDarSabadJoz + item.FldEshantion)
		If B > 0 Then
			If item.FldEshantion<item.fldCountEshantion Then
				A = A + 1
				item.SumMande = item.SumMande - 1
			End If
			
		Else
			ToastMessageShow("سفارش شما بیشتر از موجودی می باشد",True)
		End If
	End If
	item.FldEshantion = A
	AddToSabad
End Sub

Sub BtnDownEshan_Click
	If item.FldEshantion>0 Then
		If MCode.EshantionRemove=0 Then
			ToastMessageShow("شما مجوز حذف قلم اشانتیون را ندارید",False)
			Return
		End If
	End If
	Dim A As Int = 0
	A = item.FldEshantion
	If A > 0 Then
		A = A - 1
		item.SumMande = item.SumMande + 1
		item.FldEshantion  = A
	End If
	AddToSabad
End Sub

Sub AddToSabad

'	item.MablaghTakhfif=0
'	If item.fldFeeBadAzTakhfif>0 Then
'		Dim tedadJoz As String=myCode.Is_Null_adad(item.TedadDarSabadJoz)
'		Dim tedadKol As String=myCode.Is_Null_adad(item.TedadDarSabadKol)
'		
'		If tedadJoz>0 And tedadKol>0 Then
'			item.MablaghTakhfif=((item.FeeForoosh-item.fldFeeBadAzTakhfif)*tedadJoz)+((item.FeeForoosh-item.fldFeeBadAzTakhfif)*(item.TedadDarKarton*tedadKol))
'		Else
'			If tedadJoz>0 Then
'				item.MablaghTakhfif=((item.FeeForoosh-item.fldFeeBadAzTakhfif)*tedadJoz)
'			End If
'			If tedadKol>0 Then
'				item.MablaghTakhfif=((item.FeeForoosh-item.fldFeeBadAzTakhfif)*(item.TedadDarKarton*tedadKol))
'			End If
'		
'		End If
'	End If
'	If item.MablaghTakhfif>0 Then
'		LblMablaghTakhfif.Text="فی تخفیف: "& myCode.AdadToPrice(myCode.Is_Null_adad(item.MablaghTakhfif))
'		LblMablaghTakhfif.TextColor=Colors.Red
'		lblDarsadTakhfif.TextColor=Colors.Red
'		LblMablaghTakhfif.Visible=True
'		lblDarsadTakhfif.Visible=True
'		lblDarsadTakhfif.Text="درصد تخفیف: %"& myCode.Is_Null_adad(item.fldDarsadTakhfif)
'	Else
'		lblDarsadTakhfif.Text=0
'		LblMablaghTakhfif.Text=0
'		LblMablaghTakhfif.Visible=False
'		lblDarsadTakhfif.Visible=False
'	End If
'	Dim Price As Long=0
'	If item.FldFeeBadAzTakhfif > 0 Then
'		Price = item.FldFeeBadAzTakhfif * ((item.TedadDarSabadKol * item.TedadDarKarton) + item.TedadDarSabadJoz)
	''		ImageOff.Visible=True
'	Else
'		Price = item.FeeForoosh * ((item.TedadDarSabadKol * item.TedadDarKarton) + item.TedadDarSabadJoz)
	''		ImageOff.Visible=False
'	End If
	''	lbl_Price.Text=NumberFormat2(Price,0,0,0,True)
'	If Price>0 Then
'		lblSumMablaghKala.Text="جمع مبلغ: "& NumberFormat(Price,1,3) & " " & MCode.VahedPool
'	Else
'		lblSumMablaghKala.Text="جمع مبلغ: 0"
'	End If
	lblTedadjoz.Text = item.TedadDarSabadJoz
	lblTedadKol.Text = item.TedadDarSabadKol
	LblTedadEshan.Text = item.FldEshantion
	
	Dim Cu As Cursor = MCode.Result("Select * From TblSabad")
	Dim Check As Boolean
	For i=0 To Cu.RowCount -1
		Cu.Position=i
		If Cu.GetString("FldCodeKala") = item.CodeKala Then
			If item.TedadDarSabadJoz = 0 And item.TedadDarSabadKol = 0 And item.FldEshantion = 0 Then
				MCode.SaveUpdate("Delete From TblSabad Where FldCodeKala = '"& item.CodeKala &"'")
			Else
				MCode.SaveUpdate("Update TblSabad Set FldTedadDarSabadJoz = '"& item.TedadDarSabadJoz &"',FldTedadDarSabadKol = '"& item.TedadDarSabadKol &"',FldMablaghTakhfif = '"& item.MablaghTakhfif & "',FldEshantion = '"& item.FldEshantion& _
				"' Where FldCodeKala = '"& item.CodeKala &"'")
			End If
			Check = True
			Exit
		End If
	Next
	If Check = False Then
		MCode.AddToSabad(item)
	End If
'	CallSubDelayed(Act_Sabad,"UpdateSumSabad")
	CallSubDelayed(Act_Sabad,"SaveChange")
End Sub

Sub txtComment_TextChanged (Old As String, New As String)
	item.Tozihat=MCode.ConvertNumbersPersian2English(New)
	MCode.SaveUpdate($"Update TblSabad Set FldTozihat = '${New}' Where FldCodeKala = '${item.CodeKala}'"$)
End Sub

Sub LblTedadJoz_Click

	CallSubDelayed2(base,"LblTedadJoz_Click",item)
		

End Sub

Sub LblTedadKol_Click
	If myCode.Is_Null_adad(item.TedadDarKarton)=0 Then
		Return
	End If
	
	CallSubDelayed2(base,"LblTedadKol_Click",item)
		

End Sub