B4A=true
Group=Class
ModulesStructureVersion=1
Type=StaticCode
Version=12.8
@EndOfDesignText@
'Code module
'Subs in this code module will be accessible from all modules.
Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

End Sub

Sub CreateDataBaseNewTable
	Dim Check As Int
	Dim Cur As Cursor
	
	Cur = MCode.Sql1.ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='TblAshkhasNew'")
	If Cur.RowCount = 0 Then
		MCode.Sql1.ExecNonQuery("Create Table TblAshkhasNew (FldId integer NOT NULL PRIMARY KEY,FldCodeTafzili Text,FldSharheTafzili Text,FldVisitor Text,FldTell Text,FldC_Meli Text,FldC_Posti Text,FldShomarehesab Text,FldAddress Text,FldCodeGroup Text)")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	
	Cur = MCode.Sql1.ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='TblGoroohKala'")
	If Cur.RowCount = 0 Then
		MCode.Sql1.ExecNonQuery("Create Table TblGoroohKala (FldC_Gorooh Text,FldN_Gorooh Text)")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	
	Cur = MCode.Sql1.ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='TblGoroohAshkhas'")
	If Cur.RowCount = 0 Then
		MCode.Sql1.ExecNonQuery("Create Table TblGoroohAshkhas (FldC_Gorooh Text,FldN_Gorooh Text)")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	
	Cur = MCode.Sql1.ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='TblSooratHesab'")
	If Cur.RowCount = 0 Then
		MCode.Sql1.ExecNonQuery("Create Table TblSooratHesab (FldId integer NOT NULL PRIMARY KEY,FldCodeTafzili Text,FldSharheTafzili Text,FldShomareFactor Text,FldMandeTalab Text,FldMablagheKolDaryafti Text,FldMandeTasfieNashode Text,FldDateSarResid Text)")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	
	Cur = MCode.Sql1.ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='TblNotifi'")
	If Cur.RowCount = 0 Then
		MCode.Sql1.ExecNonQuery("Create Table TblNotifi (FldId integer NOT NULL PRIMARY KEY,Id INTEGER,FldTitle Text,FldBody Text,FldDate Text,FldTime Text,FldStatus Text)")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	
	
	'Cur = MCode.Sql1.ExecQuery("DROP TABLE TblTablighVisitor;")
	Cur = MCode.Sql1.ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='TblTablighVisitor'")
	If Cur.RowCount = 0 Then
		MCode.Sql1.ExecNonQuery("Create Table TblTablighVisitor (Id integer NOT NULL PRIMARY KEY,FldTitle Text,FldMessage Text,FldDate Text,FldTime Text,FldVaziat Text,FldLink Text)")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	
	
	Cur = MCode.Sql1.ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='TblLogVisitSefaresh'")
	If Cur.RowCount = 0 Then
		MCode.Sql1.ExecNonQuery("Create Table TblLogVisitSefaresh (FldId INTEGER NOT NULL PRIMARY KEY,FldC_Ashkhas Text,FldVisit Text,FldSefaresh Text,FldElatSefaresh Text,FldLat Text,FldLon Text)")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	Cur = MCode.Sql1.ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='TblLastSeen'")
	If Cur.RowCount = 0 Then
		MCode.Sql1.ExecNonQuery("Create Table TblLastSeen (FldC_Ashkhas Text,LastSeen Text)")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	
	Cur = MCode.Sql1.ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='TblNextVisit'")
	If Cur.RowCount = 0 Then
		MCode.Sql1.ExecNonQuery("Create Table TblNextVisit (FldC_Ashkhas Text,NextVisitDate Text,NextVisitText Text)")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	
	Cur = MCode.Sql1.ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='TblVisitorTour'")
	If Cur.RowCount = 0 Then
		MCode.Sql1.ExecNonQuery("Create Table TblVisitorTour (FldId Text,FldC_Ashkhas Text,FldN_Ashkhas Text,FldAddress Text,FldTell Text,FldMob Text,FldC_City Text,FldN_City Text,FldC_Visitor Text,FldVaziat Text,FldEtebar Text,FldMandeHesab Text,FldLat Text,FldLon Text,FldTakhfifVizhe Text,FldTipFee Text,FldC_Visitor1 Text,FldC_Visitor2 Text,FldC_Visitor3 Text,FldC_Visitor4 Text,FldC_Visitor5 Text,FldC_Visitor6 Text,FldC_Visitor7 Text,FldC_Visitor8 Text,FldC_Visitor9 Text,FldLastVisit Text,FldLastSefaresh Text,lastSeen Text,lastOrderDate Text,nextVisitDate Text,nextVisitText Text,visitTourDate Text,visitTourText Text,fldC_Ashkhas_C Text)")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	
	Cur = MCode.Sql1.ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='TblGalleryPic'")
	If Cur.RowCount = 0 Then
		MCode.Sql1.ExecNonQuery("Create Table TblGalleryPic (Id integer NOT NULL PRIMARY KEY,fldCodeKala Text,fldImageNumber Text,fldImage Text,fldShow Text)")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	
	Cur = MCode.Sql1.ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='tblEshantionVisitori'")
	If Cur.RowCount = 0 Then
		MCode.Sql1.ExecNonQuery("Create Table tblEshantionVisitori(Id integer NOT NULL PRIMARY KEY,fldCodeKala Text,fldVahed Text,fldTedadEshantion Text,fldCountForoosh Text,fldVaziat Text)")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	
	Cur = MCode.Sql1.ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='tblEshantionTabaghati'")
	If Cur.RowCount = 0 Then
		MCode.Sql1.ExecNonQuery("Create Table tblEshantionTabaghati(ID integer NOT NULL PRIMARY KEY,fldCodeKalaForoosh Text,fldShomareTabaghe Text,fldTedadForoosh Text,fldCodeKalaEshantion Text,fldTedadEshantion Text)")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	
	Cur = MCode.Sql1.ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='tblEshantionGroup'")
	If Cur.RowCount = 0 Then
		MCode.Sql1.ExecNonQuery("Create Table tblEshantionGroup(ID integer NOT NULL PRIMARY KEY,fldCodeGroupKala Text,fldShomareTabaghe Text,fldTedadForoosh Text,fldCodeGroupKalaEshantion Text,fldTedadEshantion Text)")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	
	Cur = MCode.Sql1.ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='tblEshantionGroupTemp'")
	If Cur.RowCount = 0 Then
		MCode.Sql1.ExecNonQuery("Create Table tblEshantionGroupTemp(fldCodeGroupKala Text,fldCodeGroupKalaEshantion Text,fldTedadEshantion Text)")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	
	Cur = MCode.Sql1.ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='TblVisitor'")
	If Cur.RowCount = 0 Then
		MCode.Sql1.ExecNonQuery("Create Table TblVisitor (FldC_Visitor Text,FldN_Visitor Text)")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	Cur = MCode.Sql1.ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='TblSabt'")
	If Cur.RowCount = 0 Then
		MCode.Sql1.ExecNonQuery("Create Table TblSabt (FldShomareSabt Text,FldC_Visitor Text,FldN_Visitor Text,FldC_Ashkhas Text,FldType Text,FldNoe Text,FldMablagh Text,FldShomareCheck Text,FldDateCheck Text,FldBankName Text,FldDateSabt Text)")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	Cur = MCode.Sql1.ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='TblHavale'")
	If Cur.RowCount = 0 Then
		MCode.Sql1.ExecNonQuery("Create Table TblHavale (fldShomareHavale Text,fldDate Text,fldVaziat int,fldMandeFactor Text,fldCountFactor Text)")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	Cur = MCode.Sql1.ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='TblRizFactorHavale'")
	If Cur.RowCount = 0 Then
		MCode.Sql1.ExecNonQuery("Create Table TblRizFactorHavale (fldShomareFactor text,fldShomareHavale text,fldShomareSanad text,fldCodeAnbar text,fldRadif text,fldCodeKala text,fldSharhKala text,fldCodeTafzili text,fldSharhTafzili text,fldTedadCarton text,fldTedadJoz text,fldFeeJoz text,fldFeeYekCarton text,fldFeeKol text,fldDarsadTakhfif,fldMablaghTakhfif text,fldArzeshAfzode text,fldMablaghKhales text,fldNameCompany text,fldC_Ranandeh text,fldN_Ranandeh text,fldAddress text,fldTell text,fldCodeVasete text,fldDateFactor text,fldDate text,fldTime text,fldLat text,fldLon text,fldMandeTalab text,fldMablagheKolDaryafti text,fldMandeTasfieNashode text,fldDateSarResid text,fldVaziat int,fldDateTahvil text,fldTimeTahvil text,fldSignature text,fldSharhFactor text)")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	
	Cur = MCode.Sql1.ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='TblBankMa'")
	If Cur.RowCount = 0 Then
		MCode.Sql1.ExecNonQuery("Create Table TblBankMa (fldCodeBank text,fldNameBank text)")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	
	Cur = MCode.Sql1.ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='TblBankMoshtari'")
	If Cur.RowCount = 0 Then
		MCode.Sql1.ExecNonQuery("Create Table TblBankMoshtari (fldCodeBank text,fldNameBank text)")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	
	Cur = MCode.Sql1.ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='TblSandoogh'")
	If Cur.RowCount = 0 Then
		MCode.Sql1.ExecNonQuery("Create Table TblSandoogh (fldCodeSandoogh text,fldNameSandoogh text)")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	
	
	Cur = MCode.Sql1.ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='TblDaryaft'")
	If Cur.RowCount = 0 Then
		MCode.Sql1.ExecNonQuery("Create Table TblDaryaft (ID integer NOT NULL PRIMARY KEY,fldShomareDaryaft Text,fldMablaghDaryafti Text,fldShomareFactor Text,fldShomareSanad Text,fldCodeTafzili Text,fldSharh Text,fldCodeVaste Text,fldCodeSandoogh Text,fldCodeBank Text,fldType Text,FldRadif Text,FldDateDaryaft Text,FldShomareDaryaftReal Text,FldShomareCheck Text,FldDarsadTakhfif Text,FldMablaghTakhfif Text,fldSharhKol Text,fldSend Text)")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	
	Cur = MCode.Sql1.ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='TblCheckDaryafti'")
	If Cur.RowCount = 0 Then
		MCode.Sql1.ExecNonQuery("Create Table TblCheckDaryafti (ID integer NOT NULL PRIMARY KEY,fldShomareCheck Text,fldShomareHesab Text,fldDate Text,fldDateSarResid Text,fldCodeBank Text,fldShobe Text,fldMablagh Text,fldCodeSahebeCheck Text,fldShomareDaryaft Text,fldNameBank Text,fldNameSahebeCheck Text,fldShomareFactor Text,fldSharh Text,fldSend Text,fldCodeVaste Text)")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	
	Cur = MCode.Sql1.ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='TblEnterExitVisitor'")
	If Cur.RowCount = 0 Then
		MCode.Sql1.ExecNonQuery("Create Table TblEnterExitVisitor (ID integer NOT NULL PRIMARY KEY,fldType Text,fldDate Text,fldTime Text,fldLat Text,fldLon Text,fldSend Text)")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	
	Cur = MCode.Sql1.ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='TblSettingPos'")
	If Cur.RowCount = 0 Then
		MCode.Sql1.ExecNonQuery("Create Table TblSettingPos (ID integer NOT NULL PRIMARY KEY,fldPosName Text,fldCompanyName Text,fldAMOUNT Text,fldSignCode Text,fldAdditionalData Text)")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	
	Cur = MCode.Sql1.ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='tblDaftarcheTell'")
	If Cur.RowCount = 0 Then
		MCode.Sql1.ExecNonQuery("Create Table tblDaftarcheTell (fldIdDaftarche integer NOT NULL PRIMARY KEY,fldCodeTafzili Text,fldName Text,fldShomare Text)")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	
	Cur = MCode.Sql1.ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='tblGroupDastrasi'")
	If Cur.RowCount = 0 Then
		MCode.Sql1.ExecNonQuery("Create Table tblGroupDastrasi (ID integer NOT NULL PRIMARY KEY,fldCodeGroup Text)")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	
	Cur = MCode.Sql1.ExecQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='tblTourVisitor'")
	If Cur.RowCount = 0 Then
		MCode.Sql1.ExecNonQuery("Create Table tblTourVisitor (ID integer NOT NULL PRIMARY KEY,fldRadif int,fldCodeSuperVisor Text,fldCodeVisitor Text,fldCodeGroup Text,fldCodeTafzili Text,fldSharheTafzili Text,fldDate Text,fldDateVisit Text,fldTimeVisit Text,fldDateNextVisit Text,fldDateTozie Text,fldShomareSefaresh Text,fldTimeSefaresh Text,fldSharh Text,fldVaziat Text,fldShomareFactor Text,fldType Text,fldSend Text)")
		MCode.Sql1.Close
		MCode.Initialize
	End If
End Sub

Sub UpdateDataBaseSetting
	Dim Check As Int
	Dim Cur As Cursor
	
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblSetting")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldAshkhas" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblSetting ADD FldAshkhas Text")
		MCode.Sql1.ExecNonQuery("Alter Table TblSetting ADD FldKala Text")
		MCode.Sql1.ExecNonQuery("Alter Table TblSetting ADD FldFee Text")
		MCode.Sql1.ExecNonQuery("Alter Table TblSetting ADD FldTasvie Text")
		MCode.Sql1.ExecNonQuery("Alter Table TblSetting ADD FldIntervalDownload Text")
		MCode.Sql1.Close
		MCode.Initialize
		MCode.Sql1.ExecNonQuery("Update TblSetting Set FldAshkhas = '0', FldKala = '0', FldFee = '0', FldTasvie = '0', FldIntervalDownload = '0',FldDateUpdate='0'")
	End If
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblSetting")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldDateUpdate" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblSetting ADD FldDateUpdate Text")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblSetting")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldToken" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblSetting ADD FldToken Text")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblSetting")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldDateTimeSend" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblSetting ADD FldDateTimeSend Text")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblSetting")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldSendFactor" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblSetting ADD FldSendFactor Text")
		MCode.Sql1.Close
		MCode.Initialize
		MCode.Sql1.ExecNonQuery("Update TblSetting Set FldDateUpdate='0',FldSendFactor='1'")
	End If
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblSetting")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldPrinterType" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblSetting ADD FldPrinterType Text")
		MCode.Sql1.Close
		MCode.Initialize
		MCode.Sql1.ExecNonQuery("Update TblSetting Set FldPrinterType='0'")
	End If
	'ArzeshAfzodeEnable
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblSetting")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="fldArzeshAfzodeEnable" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblSetting ADD fldArzeshAfzodeEnable Text")
		MCode.Sql1.Close
		MCode.Initialize
		MCode.Sql1.ExecNonQuery("Update TblSetting Set fldArzeshAfzodeEnable='0'")
	End If
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblSetting")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="fldArzeshAfzode" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblSetting ADD fldArzeshAfzode Text")
		MCode.Sql1.Close
		MCode.Initialize
		MCode.Sql1.ExecNonQuery("Update TblSetting Set fldArzeshAfzode='0'")
	End If
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblSetting")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldDateTimeRecive" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblSetting ADD FldDateTimeRecive Text")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	'FldTakhfifKala
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblSetting")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldTakhfifKala" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblSetting ADD FldTakhfifKala Text")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblSetting")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldDateTimeSend" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblSetting ADD FldDateTimeSend Text")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblSetting")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldSaveFactorInLocation" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblSetting ADD FldSaveFactorInLocation Text")
		MCode.Sql1.Close
		MCode.Initialize
		MCode.Sql1.ExecNonQuery("Update TblSetting Set FldSaveFactorInLocation='0'")
	End If
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblSetting")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldMasafat" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblSetting ADD FldMasafat Text")
		MCode.Sql1.Close
		MCode.Initialize
		MCode.Sql1.ExecNonQuery("Update TblSetting Set FldMasafat='50'")
	End If
	
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblSetting")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldTaghirFeeKala" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblSetting ADD FldKalaManfi Text")
		MCode.Sql1.ExecNonQuery("Alter Table TblSetting ADD FldTaghirFeeKala Text")
		MCode.Sql1.Close
		MCode.Initialize
		MCode.Sql1.ExecNonQuery("Update TblSetting Set FldKalaManfi = '0', FldTaghirFeeKala='0'")
	End If
	
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblSetting")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldTokenId" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblSetting ADD FldTokenId Text")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblSetting")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldCodeMoshtari" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblSetting ADD FldCodeMoshtari Text")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblSetting")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldNameVisitor" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblSetting ADD FldNameVisitor Text")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblSetting")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldVaziat" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblSetting ADD FldVaziat Integer")
		MCode.Sql1.Close
		MCode.Initialize
		MCode.Sql1.ExecNonQuery("Update TblSetting Set FldVaziat='0'")
	End If
	
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblSetting")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldPicOnline" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblSetting ADD FldPicOnline Text")
		MCode.Sql1.Close
		MCode.Initialize
		MCode.Sql1.ExecNonQuery("Update TblSetting Set FldPicOnline='0'")
	End If
	
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblSetting")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldDaryaft" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblSetting ADD FldDaryaft Text")
		MCode.Sql1.Close
		MCode.Initialize
		MCode.Sql1.ExecNonQuery("Update TblSetting Set FldDaryaft='0'")
	End If
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblSetting")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldMojavezSefaresh" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblSetting ADD FldMojavezSefaresh Text")
		MCode.Sql1.Close
		MCode.Initialize
		MCode.Sql1.ExecNonQuery("Update TblSetting Set FldMojavezSefaresh='0'")
	End If
	
	Check=0
		
	Cur=MCode.Sql1.ExecQuery("Select * From TblSetting")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldEshantionTabaghati" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblSetting ADD FldEshantionTabaghati Text")
		MCode.Sql1.Close
		MCode.Initialize
		MCode.Sql1.ExecNonQuery("Update TblSetting Set FldEshantionTabaghati='0'")
	End If
	
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblSetting")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldEshantionRemove" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblSetting ADD FldEshantionRemove Text")
		MCode.Sql1.Close
		MCode.Initialize
		MCode.Sql1.ExecNonQuery("Update TblSetting Set FldEshantionRemove='0'")
	End If
	'FldEshantionGroup
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblSetting")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldEshantionGroup" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblSetting ADD FldEshantionGroup Text")
		MCode.Sql1.Close
		MCode.Initialize
		MCode.Sql1.ExecNonQuery("Update TblSetting Set FldEshantionGroup='0'")
	End If
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblSetting")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldGetDataOnline" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblSetting ADD FldGetDataOnline Text")
		MCode.Sql1.Close
		MCode.Initialize
		MCode.Sql1.ExecNonQuery("Update TblSetting Set FldGetDataOnline='0'")
	End If
	
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblSetting")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldVersion" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblSetting ADD FldVersion Text")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	
	Check=0
	Dim Cu As Cursor = MCode.Result("Select * From TblSetting")
	Cu.Position=0
	If MCode.OriginalListFaktor.IsInitialized=False Then
		MCode.OriginalListFaktor.Initialize
		MCode.OriginalListFaktor.Clear
	End If
	
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblSetting")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldNamayeshKalaSefr" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblSetting ADD FldNamayeshKalaSefr Text")
		MCode.Sql1.Close
		MCode.Initialize
		MCode.Sql1.ExecNonQuery("Update TblSetting Set FldNamayeshKalaSefr = '1'")
	End If
	
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblSetting")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldPrinterType" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblSetting ADD FldPrinterType Integer")
		MCode.Sql1.Close
		MCode.Initialize
		MCode.Sql1.ExecNonQuery("Update TblSetting Set FldPrinterType = 0")
	End If
	
	Check=0
	
	Cur=MCode.Sql1.ExecQuery("Select * From TblSetting")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldHideMojodi" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblSetting ADD FldHideMojodi Text")
		MCode.Sql1.Close
		MCode.Initialize
		MCode.Sql1.ExecNonQuery("Update TblSetting Set FldHideMojodi = '0'")
	End If
	
	Check=0
	
	Cur=MCode.Sql1.ExecQuery("Select * From TblSetting")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldConnectionStatus" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblSetting ADD FldConnectionStatus Text")
		MCode.Sql1.Close
		MCode.Initialize
		MCode.Sql1.ExecNonQuery("Update TblSetting Set FldConnectionStatus = '0'")
	End If
	
	Check=0
	
	Cur=MCode.Sql1.ExecQuery("Select * From TblSetting")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldAdmin" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblSetting ADD FldAdmin Text")
		MCode.Sql1.Close
		MCode.Initialize
		MCode.Sql1.ExecNonQuery("Update TblSetting Set FldAdmin='0'")
	End If
	
	Check=0
	
	Cur=MCode.Sql1.ExecQuery("Select * From TblSetting")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldTozie" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblSetting ADD FldTozie Text")
		MCode.Sql1.Close
		MCode.Initialize
		MCode.Sql1.ExecNonQuery("Update TblSetting Set FldTozie='0'")
	End If
	
	Check=0
	
	Cur=MCode.Sql1.ExecQuery("Select * From TblSetting")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldVisitor" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblSetting ADD FldVisitor Text")
		MCode.Sql1.Close
		MCode.Initialize
		MCode.Sql1.ExecNonQuery("Update TblSetting Set FldVisitor='0'")
	End If
	
	Check=0
	
	Cur=MCode.Sql1.ExecQuery("Select * From TblSetting")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldLinkPicKala" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblSetting ADD FldLinkPicKala Text")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	Check=0
	
	Cur=MCode.Sql1.ExecQuery("Select * From TblSetting")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldSendMarjoie" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblSetting ADD FldSendMarjoie Text")
		MCode.Sql1.Close
		MCode.Initialize
		MCode.Sql1.ExecNonQuery("Update TblSetting Set FldSendMarjoie='0'")
	End If
	
	Check=0
	
	Cur=MCode.Sql1.ExecQuery("Select * From TblSetting")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldAmani" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblSetting ADD FldAmani Text")
		MCode.Sql1.Close
		MCode.Initialize
		MCode.Sql1.ExecNonQuery("Update TblSetting Set FldAmani='0'")
	End If
	
	
	
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblSetting")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="fldNumberVersion" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblSetting ADD fldNumberVersion Text")
		MCode.Sql1.ExecNonQuery("Alter Table TblSetting ADD fldDateVersion Text")
		MCode.Sql1.ExecNonQuery("Alter Table TblSetting ADD fldLastVersion Text")
		MCode.Sql1.ExecNonQuery("Alter Table TblSetting ADD fldTypeVersion Text")
		MCode.Sql1.ExecNonQuery("Alter Table TblSetting ADD fldDateSetup Text")
		MCode.Sql1.Close
		MCode.Initialize
'		MCode.Sql1.ExecNonQuery("Update TblSetting Set fldNumberVersion='"&NumberVersion&"'")
'		MCode.Sql1.ExecNonQuery("Update TblSetting Set fldDateVersion='"& DateVersion.Replace("/","") &"'")
		Cur=MCode.Sql1.ExecQuery("Select * From TblSetting")
		Cur.Position=0
		Log(Cur.GetString("FldVersion"))
		MCode.Sql1.ExecNonQuery("Update TblSetting Set fldLastVersion='"&Cur.GetString("FldVersion")&"'")
'		MCode.Sql1.ExecNonQuery("Update TblSetting Set fldTypeVersion='"&TypeVersion&"'")
'		MCode.Sql1.ExecNonQuery("Update TblSetting Set fldDateSetup='"& GetDateNow &"'")
'		'send update info in Server
'		CallSubDelayed(Service_Server,"SaveVersionAndroidInfo")
	End If
	Cur=MCode.Sql1.ExecQuery("Select * From TblSetting")
	Cur.Position=0
	If IsNumber(Cur.GetString("FldC_Visitor")) Then
		
		If myCode.Is_Null_adad(Cur.GetString("fldNumberVersion"))<> MCode.NumberVersion Then
			Log(Cur.GetString("fldLastVersion"))
			MCode.Sql1.ExecNonQuery("Update TblSetting Set fldNumberVersion='"&MCode.NumberVersion&"'")
			MCode.Sql1.ExecNonQuery("Update TblSetting Set fldDateVersion='"& MCode.DateVersion.Replace("/","") &"'")
			MCode.Sql1.ExecNonQuery("Update TblSetting Set fldLastVersion='"&Cur.GetString("fldLastVersion")&"'")
			MCode.Sql1.ExecNonQuery("Update TblSetting Set fldTypeVersion='"&MCode.TypeVersion&"'")
			MCode.Sql1.ExecNonQuery("Update TblSetting Set fldDateSetup='"& MCode.GetDateNow &"'")
		
			'send update info in Server
			CallSubDelayed(Service_Server,"SaveVersionAndroidInfo")
		End If
	End If

	Check=0
	
	
	Cur=MCode.Sql1.ExecQuery("Select * From TblSetting")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldCheckAdmin" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblSetting ADD FldCheckAdmin Text")
		MCode.Sql1.Close
		MCode.Initialize
		MCode.Sql1.ExecNonQuery("Update TblSetting Set FldCheckAdmin='0'")
	End If
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblSetting")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="fldDateUpdateKala" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblSetting ADD fldDateUpdateKala Text")
		MCode.Sql1.Close
		MCode.Initialize
		MCode.Sql1.ExecNonQuery("Update TblSetting Set fldDateUpdateKala='0'")
	End If
	
	Check=0
	
	Cur=MCode.Sql1.ExecQuery("Select * From TblSetting")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldNameCompany" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblSetting ADD FldNameCompany Text")
		MCode.Sql1.Close
		MCode.Initialize
		MCode.Sql1.ExecNonQuery("Update TblSetting Set FldNameCompany=''")
	End If
	
	Check=0
	
	Cur=MCode.Sql1.ExecQuery("Select * From TblSetting")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldTellCompany" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblSetting ADD FldTellCompany Text")
		MCode.Sql1.Close
		MCode.Initialize
		MCode.Sql1.ExecNonQuery("Update TblSetting Set FldTellCompany=''")
	End If
	
	
	Check=0
	
	Cur=MCode.Sql1.ExecQuery("Select * From TblSetting")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldAddressCompany" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblSetting ADD FldAddressCompany Text")
		MCode.Sql1.Close
		MCode.Initialize
		MCode.Sql1.ExecNonQuery("Update TblSetting Set FldAddressCompany=''")
	End If
	
	Check=0
	
	Cur=MCode.Sql1.ExecQuery("Select * From TblSetting")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldMobileIsImportent" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblSetting ADD FldMobileIsImportent Text")
		MCode.Sql1.Close
		MCode.Initialize
		MCode.Sql1.ExecNonQuery("Update TblSetting Set FldMobileIsImportent='0'")
	End If
	
End Sub

Sub UpdateDataBaseKala
	Dim Check As Int
	Dim Cur As Cursor
	
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblKala")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldDateUpdate" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblKala ADD FldDateUpdate Text")
		MCode.Sql1.Close
		MCode.Initialize
		MCode.Sql1.ExecNonQuery("Update TblKala Set FldDateUpdate='0'")
	End If
	
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblKala")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="fldCodeGroup" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblKala ADD fldCodeGroup Text")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblKala")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="fldPathPic" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblKala ADD fldPathPic Text")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblKala")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="fldPathPicOffline" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblKala ADD fldPathPicOffline Text")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblKala")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="fldFeeBadAzTakhfif" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblKala ADD fldFeeBadAzTakhfif Text")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblKala")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="fldSerial" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblKala ADD fldSerial Text")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblKala")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="fldSharh" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblKala ADD fldSharh Text")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblKala")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldMablaghTakhfif" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblKala ADD FldMablaghTakhfif Text")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblKala")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="fldFeeTasvie" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblKala ADD fldFeeTasvie Text")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	Check=0
	'fldArzeshAfzode

	Cur=MCode.Sql1.ExecQuery("Select * From TblKala")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="fldArzeshAfzode" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblKala ADD fldArzeshAfzode Text")
		MCode.Sql1.Close
		MCode.Initialize
	End If

End Sub

Sub UpdateDataBaseAshkhas
	Dim Check As Int
	Dim Cur As Cursor
	
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblAshkhas")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldSync" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblAshkhas ADD FldSync Text")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblAshkhas")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldMobile" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblAshkhas ADD FldMobile Text")
		MCode.Sql1.ExecNonQuery("Alter Table TblAshkhas ADD FldC_Meli Text")
		MCode.Sql1.ExecNonQuery("Alter Table TblAshkhas ADD FldC_Posti Text")
		MCode.Sql1.ExecNonQuery("Alter Table TblAshkhas ADD FldShomarehesab Text")
		MCode.Sql1.ExecNonQuery("Alter Table TblAshkhas ADD FldLastVisit Text")
		MCode.Sql1.ExecNonQuery("Alter Table TblAshkhas ADD FldLastSefaresh Text")
		MCode.Sql1.ExecNonQuery("Alter Table TblAshkhas ADD FldVaziat Text")
		MCode.Sql1.ExecNonQuery("Alter Table TblAshkhas ADD FldEtebar Text")
		MCode.Sql1.ExecNonQuery("Alter Table TblAshkhas ADD lastSeen Text")
		MCode.Sql1.ExecNonQuery("Alter Table TblAshkhas ADD lastOrderDate Text")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblAshkhas")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="fldBlackList" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblAshkhas ADD fldBlackList Text")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblAshkhas")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="fldSaghfeEtebar" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblAshkhas ADD fldSaghfeEtebar Text")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblAshkhas")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="fldCodeMovaghat" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblAshkhas ADD fldCodeMovaghat Text")
		MCode.Sql1.Close
		MCode.Initialize
	End If
End Sub

Sub UpdateDataBaseSabad
	Dim Check As Int
	Dim Cur As Cursor
	
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblSabad")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldTozihat" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblSabad ADD FldTozihat varchar")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblSabad")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldVaziatPardakht" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblSabad ADD FldVaziatPardakht varchar")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	
	Check=0
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldMablaghMasrafKonande" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblSabad ADD FldMablaghMasrafKonande Text")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblSabad")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldMablaghTakhfif" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblSabad ADD FldMablaghTakhfif Text")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblSabad")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldDarsadTakhfif" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblSabad ADD FldDarsadTakhfif Text")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblSabad")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldupdateFee" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblSabad ADD FldupdateFee Text")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblSabad")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="fldFeeBadAzTakhfif" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblSabad ADD fldFeeBadAzTakhfif Text")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblSabad")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="fldPathPic" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblSabad ADD fldPathPic Text")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblSabad")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="fldPathPicOffline" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblSabad ADD fldPathPicOffline Text")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblSabad")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="fldSharh" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblSabad ADD fldSharh Text")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblSabad")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldSumMande" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblSabad ADD FldSumMande Text")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblSabad")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldEshantion" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblSabad ADD FldEshantion Text")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblSabad")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="fldCodeGroup" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblSabad ADD fldCodeGroup Text")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblSabad")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldAmani" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblSabad ADD FldAmani Text")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblSabad")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="fldShomareForoosh" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblSabad ADD fldShomareForoosh Text")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	
	Check=0
	'fldDarsadArzeshAfzode
	
	Cur=MCode.Sql1.ExecQuery("Select * From TblSabad")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="fldDarsadArzeshAfzode" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblSabad ADD fldDarsadArzeshAfzode Text")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	Check=0
	'fldArzeshAfzode

	Cur=MCode.Sql1.ExecQuery("Select * From TblSabad")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="fldArzeshAfzode" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblSabad ADD fldArzeshAfzode Text")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	Check=0
End Sub

Sub UpdateDataBaseFactor
	Dim Check As Int
	Dim Cur As Cursor
	
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblFaktor")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldTozih" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblFaktor ADD FldTozih Text")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblFaktor")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldDateTahvilKala" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblFaktor ADD FldDateTahvilKala Text")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblFaktor")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldVaziatPardakhti" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblFaktor ADD FldVaziatPardakhti varchar")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	Check=0
	'fldDarsadArzeshAfzode
	
	Cur=MCode.Sql1.ExecQuery("Select * From TblFaktor")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="fldDarsadArzeshAfzode" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblFaktor ADD fldDarsadArzeshAfzode Text")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	Check=0
	'fldArzeshAfzode

	Cur=MCode.Sql1.ExecQuery("Select * From TblFaktor")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="fldArzeshAfzode" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblFaktor ADD fldArzeshAfzode Text")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblFaktor")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldTozihat" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblFaktor ADD FldTozihat varchar")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	
	Check=0
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldMablaghMasrafKonande" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblFaktor ADD FldMablaghMasrafKonande Text")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	Check=0
	
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldType" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblFaktor ADD FldType Text")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	
	Check=0
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldC_Visitor" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblFaktor ADD FldC_Visitor Text")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblFaktor")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldMablaghTakhfif" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblFaktor ADD FldMablaghTakhfif Text")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblFaktor")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldDarsadTakhfif" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblFaktor ADD FldDarsadTakhfif Text")
		MCode.Sql1.Close
		MCode.Initialize
		MCode.Sql1.ExecNonQuery("Update TblFaktor Set FldDarsadTakhfif='0'")
	End If
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblFaktor")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldSumMablaghTakhfifVizhe" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblFaktor ADD FldSumMablaghTakhfifVizhe Text")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblFaktor")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldSumMablaghTakhfifKala" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblFaktor ADD FldSumMablaghTakhfifKala Text")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblFaktor")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldDate" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblFaktor ADD FldDate Text")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblFaktor")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldTime" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblFaktor ADD FldTime Text")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblFaktor")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldTotalFaktor" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblFaktor ADD FldTotalFaktor Text")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblFaktor")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldSumMande" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblFaktor ADD FldSumMande Text")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblFaktor")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldSync" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblFaktor ADD FldSync Text")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblFaktor")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="fldPathPicOffline" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
	MCode.Sql1.ExecNonQuery("Alter Table TblFaktor ADD fldPathPicOffline Text")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblFaktor")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="fldPathPic" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblFaktor ADD fldPathPic Text")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	
	Check=0
	
	Cur=MCode.Sql1.ExecQuery("Select * From TblFaktor")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldMablaghTakhfifKol" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblFaktor ADD FldMablaghTakhfifKol Text")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	
	Check=0
	
	Cur=MCode.Sql1.ExecQuery("Select * From TblFaktor")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldMablaghKol" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblFaktor ADD FldMablaghKol Text")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	
	Check=0
	
	Cur=MCode.Sql1.ExecQuery("Select * From TblFaktor")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="WIsBacked" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblFaktor ADD WIsBacked Text")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblFaktor")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="WSendFrom" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblFaktor ADD WSendFrom Text")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblFaktor")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldAmani" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblFaktor ADD FldAmani Text")
		MCode.Sql1.Close
		MCode.Initialize
		MCode.Sql1.ExecNonQuery("Update TblFaktor Set FldAmani='0'")
	End If
	
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblFaktor")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="fldShomareFactorReal" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblFaktor ADD fldShomareFactorReal Text")
		MCode.Sql1.Close
		MCode.Initialize
		MCode.Sql1.ExecNonQuery("Update TblFaktor Set fldShomareFactorReal='0'")
	End If
	
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblFaktor")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldSignatureBitmapString" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblFaktor ADD FldSignatureBitmapString Text")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblFaktor")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="fldFeeBadAzTakhfif" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblFaktor ADD fldFeeBadAzTakhfif Text")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblFaktor")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldNameVahed" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblFaktor ADD FldNameVahed Text")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblFaktor")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldNameVahed2" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblFaktor ADD FldNameVahed2 Text")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblFaktor")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="fldShomareForoosh" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblFaktor ADD fldShomareForoosh Text")
		MCode.Sql1.Close
		MCode.Initialize
		MCode.Sql1.ExecNonQuery("Update TblFaktor Set fldShomareForoosh='0'")
	End If
	
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblFaktor")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldShomareBargasht" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblFaktor ADD FldShomareBargasht Text")
		MCode.Sql1.Close
		MCode.Initialize
	End If
End Sub

Sub UpdateDataBaseDaryaft
	Dim Check As Int
	Dim Cur As Cursor
	
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblDaryaft")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="fldSharheTafzili" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblDaryaft ADD fldSharheTafzili Text")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblDaryaft")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="fldShomareHavale" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblDaryaft ADD fldShomareHavale Text")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblDaryaft")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="fldShomareTell" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblDaryaft ADD fldShomareTell Text")
		MCode.Sql1.Close
		MCode.Initialize
	End If
End Sub

Sub UpdateDataBaseEnterExitVisitor
	Dim Check As Int
	Dim Cur As Cursor
	
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblEnterExitVisitor")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldCode" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblEnterExitVisitor ADD FldCode Text")
		MCode.Sql1.Close
		MCode.Initialize
	End If
End Sub

Sub UpdateDataBaseGpsVisitor
	Dim Check As Int
	Dim Cur As Cursor
	
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblGpsVisitor")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldVaziat" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblGpsVisitor ADD FldVaziat Text")
		MCode.Sql1.Close
		MCode.Initialize
	End If
End Sub

Sub UpdateDataBaseHavale
	Dim Check As Int
	Dim Cur As Cursor
	
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblHavale")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="fldMande" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblHavale ADD fldMande Text")
		MCode.Sql1.Close
		MCode.Initialize
	End If
End Sub

Sub UpdateDataBaseAshkhasNew
	Dim Check As Int
	Dim Cur As Cursor
	
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblAshkhasNew")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldCodeGroup" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblAshkhasNew ADD FldCodeGroup Text")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblAshkhasNew")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldC_Meli" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblAshkhasNew ADD FldC_Meli Text")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	Check=0
	
	Cur=MCode.Sql1.ExecQuery("Select * From TblAshkhasNew")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldC_Posti" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblAshkhasNew ADD FldC_Posti Text")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	Check=0
	Cur=MCode.Sql1.ExecQuery("Select * From TblAshkhasNew")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldMobile" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblAshkhasNew ADD FldMobile Text")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	Check=0
	
	Cur=MCode.Sql1.ExecQuery("Select * From TblAshkhasNew")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldLat" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblAshkhasNew ADD FldLat Text")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	Check=0
	
	Cur=MCode.Sql1.ExecQuery("Select * From TblAshkhasNew")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldLon" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblAshkhasNew ADD FldLon Text")
		MCode.Sql1.Close
		MCode.Initialize
	End If
	Check=0
	
	Cur=MCode.Sql1.ExecQuery("Select * From TblAshkhasNew")
	For i=0 To Cur.ColumnCount-1
		If  Cur.GetColumnName(i)="FldShomarehesab" Then
			Check=1
			Exit
		End If
	Next
	If Check=0 Then
		MCode.Sql1.ExecNonQuery("Alter Table TblAshkhasNew ADD FldShomarehesab Text")
		MCode.Sql1.Close
		MCode.Initialize
	End If
End Sub

