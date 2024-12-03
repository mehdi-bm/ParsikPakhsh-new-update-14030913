B4A=true
Group=Report
ModulesStructureVersion=1
Type=Activity
Version=10
@EndOfDesignText@
#IgnoreWarnings:34
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
#End Region

Sub Process_Globals

	Dim Item1 As AdapteRepFactorVisitor
	
End Sub

Sub Globals
	Dim HLV As Hitex_LayoutView
	Private ListFaktor As List
	Private PnlTop As Panel
	Private pnl_HLV As Panel
	Private MPD As ManamPersianDate 

	Private lblCodeTafzili As Label
	Private lblCodeVisitor As Label
	Private LblDate As Label
	Private lblNameVisitor As Label
	Private lblSharh As Label
	Private lblSharhTafzili As Label
	Private LblShomareFaktor As Label
	Public lblSumForoosh As Label
	Private lblVaziatSefaresh As Label
	Private lblVaziatTasfie As Label
	Private BtnCheck As Button
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Activity.LoadLayout("l_repsefareshvisitor")
	HLV.Initializer("HLV").ListView.Build
	pnl_HLV.AddView(HLV,0,0,pnl_HLV.Width,pnl_HLV.Height)
	ListFaktor.Initialize
	
	HLV.Ripple.Color(0xFF909090)
'	HLV.CardView.CardElevation(8dip).Radius(8dip)
	HLV.Show

	'LoadListFaktor
	CreatePage
End Sub

Sub CreatePage
	lblCodeTafzili.Text=Item1.fldCodeTafsili
	lblCodeVisitor.Text=Item1.fldCodeVasete
	LblDate.Text=MCode.PersianDateDash(Item1.fldDate)
	lblNameVisitor.Text=Item1.FldN_Visitor
	lblSharh.Text=Item1.fldTozihat
	lblSharhTafzili.Text=Item1.fldSharheTafzili
	LblShomareFaktor.Text=Item1.fldShomareFactor
'	lblSumForoosh.Text=Item1.SumFee
	If Item1.fldShomareFactorReal =-1 Then
		lblVaziatSefaresh.TextColor=Colors.Red
		lblVaziatSefaresh.Text ="تایید نشده"
		BtnCheck.Visible=True
	Else If Item1.fldShomareFactorReal="" Then
		lblVaziatSefaresh.TextColor=Colors.Green
		lblVaziatSefaresh.Text ="تایید شده"
		BtnCheck.Visible=False
	Else
		lblVaziatSefaresh.TextColor=Colors.Black
		lblVaziatSefaresh.Text ="ثبت شده"
		BtnCheck.Visible=False
	End If
	lblVaziatTasfie.Text=Item1.fldNahveTasvie
	
	
	ProgressDialogShow2("لطفا صبر کنید . . .",False)
	MCode.C_Visitor=Item1.fldCodeVasete
	MCode.FaktorSelect=Item1.fldShomareFactor
	CallSubDelayed2(Service_Server,"GetReportRizFactorVisitor",Item1.fldDate)
End Sub


Sub LoadData(lst As List)
	

	If lst.Size>0 Then
		'lst.SortType("fldShomareFactor",True)
	Dim sumkol As Int
		Dim Row As Map
		For i=0 To lst.Size-1
			Row=lst.Get(i)
			Dim Item As AdapteRepRizFactorVisitor
			Dim	TedadJoz As String=0
			Dim	TedadCarton As String=0
			Dim	TedadDarKarton As Int=0
			
			Item.fldRadif=Row.Get("fldRadif")
			Item.fldTozihatRecord=Row.Get("fldTozihatRecord")
			Item.fldCodeKala=Row.Get("fldCodeKala")
			Item.fldSharhKala=Row.Get("fldSharhKala")
		
			If Row.Get("fldFeeJoz")>0 Then
				Item.fldFeeJoz =MCode.qomaAshar(Row.Get("fldFeeJoz"))
			Else
				Item.fldFeeJoz =0
			End If
		
			If	Row.Get("fldTedadJoz")<>Null Then
				TedadJoz=Row.Get("fldTedadJoz")
			
				
			End If
			Item.fldTedadJoz =TedadJoz
			If	Row.Get("fldTedadCarton")<>Null And Row.Get("fldTedadCarton") <>"" Then
				TedadCarton=Row.Get("fldTedadCarton")
				
		
			End If
			Item.fldTedadCarton =TedadCarton
			
			
			If	Row.Get("FldTedadDarKarton")<>Null Then
				TedadDarKarton=Row.Get("FldTedadDarKarton")
				Item.FldTedadDarKarton =TedadDarKarton
			End If
			
		
			Dim SumFee As Int=(TedadJoz*Row.Get("fldFeeJoz"))+((TedadCarton*TedadDarKarton)*Row.Get("fldFeeJoz"))
		
				Item.SumFee =SumFee
			
			
		
			sumkol=sumkol+SumFee
			ListFaktor.Add(Item)
		Next
		If sumkol>0 Then
			lblSumForoosh.Text=MCode.qomaAshar(sumkol) &" "&MCode.VahedPool
			Else
			lblSumForoosh.Text=0
		End If
		
		
		HLV.notifyDataSetChanged
	End If
End Sub

Sub HLV_GetItemCount As Int 								        '💯 ItemCount 💯'
	Return ListFaktor.Size
End Sub

Sub HLV_onCreateViewHolder (Parent As Panel, ViewType As Int)      '💎 onCreate 💎'
	Dim rec As Cls_Rec_RizFactorVisitor
	rec.Initialize(Me)
	Parent.AddView(rec.Panel,0,0,100%x,rec.Height)
	Parent.Tag=rec
End Sub

Sub HLV_onBindViewHolder (Parent As Panel, Position As Int)         '💠 onBind 💠'
	Dim Item = ListFaktor.Get(Position) As AdapteRepRizFactorVisitor
	Dim rec As Cls_Rec_RizFactorVisitor=Parent.Tag
	rec.Show(Item)
	Parent.Height=rec.Height
End Sub

Sub Activity_Resume	
	HLV.notifyDataSetChanged
End Sub


Sub BtnListProfile_Click
'	StartActivity(Act_Check)
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub LblBack_Click
	Activity.Finish
End Sub

Sub BtnCheck_Click
	Log(LblShomareFaktor.Text)
	Dim query As String
	query="Update tblPishPishFaktor set fldShomareFactorReal=NULL where fldShomareFactorReal=-1 and fldShomareFactor="&LblShomareFaktor.Text &" and fldCodeVasete="&lblCodeVisitor.Text
	MCode.page="Act_RepRizFactorVisitor"
	MCode.Tag=Item1
	CallSubDelayed2(Service_Server,"SendUpdateQuery",query)
End Sub
Sub Application_Error (Error As Exception, StackTrace As String) As Boolean
'	MCode.ScheduleRestartCrashedActivity(DateTime.Now + 300, Activity.Title, Error)
	Return True
End Sub