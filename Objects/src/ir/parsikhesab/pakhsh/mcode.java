package ir.parsikhesab.pakhsh;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class mcode {
private static mcode mostCurrent = new mcode();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 
public static class _adapteritemhome{
public boolean IsInitialized;
public String img;
public String title;
public void Initialize() {
IsInitialized = true;
img = "";
title = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _adapterchangefeekala{
public boolean IsInitialized;
public String FldCodKala;
public String FldFee;
public void Initialize() {
IsInitialized = true;
FldCodKala = "";
FldFee = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _adaptergoroohkala{
public boolean IsInitialized;
public String FldC_Gorooh;
public String FldN_Gorooh;
public void Initialize() {
IsInitialized = true;
FldC_Gorooh = "";
FldN_Gorooh = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _adapterandroidlog{
public boolean IsInitialized;
public String message;
public String date;
public String time;
public String Action;
public void Initialize() {
IsInitialized = true;
message = "";
date = "";
time = "";
Action = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _adapterlistbackupfile{
public boolean IsInitialized;
public String FileName;
public String Date;
public String Time;
public void Initialize() {
IsInitialized = true;
FileName = "";
Date = "";
Time = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _adapterlistkala{
public boolean IsInitialized;
public String CodeGroup;
public String CodeKala;
public String NameKala;
public String NameVahed;
public String NameVahed2;
public String SumMande;
public String TedadDarKarton;
public int FeeForoosh;
public int MablaghTakhfif;
public String SumMandeKarton;
public String FeeForooshKarton;
public String TedadDarSabadJoz;
public String TedadDarSabadKol;
public String Tozihat;
public String FldVaziatPardakht;
public String FldMablaghMasrafKonande;
public String fldPathPic;
public String fldFeeBadAzTakhfif;
public String FldEshantion;
public String fldCountEshantion;
public int fldTipFee;
public String fldFeeTasvie;
public String fldSharh;
public String TakhfifKala;
public String FldAmani;
public String fldShomareForoosh;
public String fldDarsadTakhfif;
public String fldArzeshAfzode;
public String fldDarsadArzeshAfzode;
public String fldArzeshAfzodeKala;
public String fldDarsadArzeshAfzodeKala;
public void Initialize() {
IsInitialized = true;
CodeGroup = "";
CodeKala = "";
NameKala = "";
NameVahed = "";
NameVahed2 = "";
SumMande = "";
TedadDarKarton = "";
FeeForoosh = 0;
MablaghTakhfif = 0;
SumMandeKarton = "";
FeeForooshKarton = "";
TedadDarSabadJoz = "";
TedadDarSabadKol = "";
Tozihat = "";
FldVaziatPardakht = "";
FldMablaghMasrafKonande = "";
fldPathPic = "";
fldFeeBadAzTakhfif = "";
FldEshantion = "";
fldCountEshantion = "";
fldTipFee = 0;
fldFeeTasvie = "";
fldSharh = "";
TakhfifKala = "";
FldAmani = "";
fldShomareForoosh = "";
fldDarsadTakhfif = "";
fldArzeshAfzode = "";
fldDarsadArzeshAfzode = "";
fldArzeshAfzodeKala = "";
fldDarsadArzeshAfzodeKala = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _adaptergoroohashkhas{
public boolean IsInitialized;
public String FldC_Gorooh;
public String FldN_Gorooh;
public void Initialize() {
IsInitialized = true;
FldC_Gorooh = "";
FldN_Gorooh = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _adaptersendfaktor{
public boolean IsInitialized;
public String FldRadif;
public int FldShomareFaktor;
public String FldVaziatPardakht;
public String FldC_Tafzili;
public String FldN_Tafzili;
public String FldCodeKala;
public String FldNamekala;
public String FldFeeForoosh;
public String FldTedadDarKarton;
public String FldTedadDarSabadJoz;
public String FldTedadDarSabadKol;
public String FldTozihat;
public String FldTarikh;
public String fldTime;
public String FldLat;
public String FldLon;
public String FldTozih;
public String FldShomareBargasht;
public String FldDarsadTakhfif;
public String fldType;
public String FldMablaghTakhfif;
public String FldAmani;
public String FldSumMablaghTakhfifVizhe;
public String FldSumMablaghTakhfifKala;
public String FldTotalFaktor;
public String FldMablaghTakhfifKol;
public String fldShomareForoosh;
public String fldShomareFactorReal;
public String fldSignatureBitmapString;
public void Initialize() {
IsInitialized = true;
FldRadif = "";
FldShomareFaktor = 0;
FldVaziatPardakht = "";
FldC_Tafzili = "";
FldN_Tafzili = "";
FldCodeKala = "";
FldNamekala = "";
FldFeeForoosh = "";
FldTedadDarKarton = "";
FldTedadDarSabadJoz = "";
FldTedadDarSabadKol = "";
FldTozihat = "";
FldTarikh = "";
fldTime = "";
FldLat = "";
FldLon = "";
FldTozih = "";
FldShomareBargasht = "";
FldDarsadTakhfif = "";
fldType = "";
FldMablaghTakhfif = "";
FldAmani = "";
FldSumMablaghTakhfifVizhe = "";
FldSumMablaghTakhfifKala = "";
FldTotalFaktor = "";
FldMablaghTakhfifKol = "";
fldShomareForoosh = "";
fldShomareFactorReal = "";
fldSignatureBitmapString = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _adapterfaktor{
public boolean IsInitialized;
public int FldId;
public String FldRadif;
public int FldShomareFaktor;
public String FldVaziatPardakht;
public String FldC_Tafzili;
public String FldN_Tafzili;
public String FldCodeKala;
public String FldNameKala;
public String FldFeeForoosh;
public String FldTedadDarKarton;
public String FldTedadDarSabadJoz;
public String FldTedadDarSabadKol;
public String FldTarikh;
public String FldLat;
public String FldLon;
public int FldSend;
public String FldVaziatPardakhti;
public String FldTozihat;
public String FldMablaghMasrafKonande;
public String fldArzeshAfzode;
public String fldDarsadArzeshAfzode;
public void Initialize() {
IsInitialized = true;
FldId = 0;
FldRadif = "";
FldShomareFaktor = 0;
FldVaziatPardakht = "";
FldC_Tafzili = "";
FldN_Tafzili = "";
FldCodeKala = "";
FldNameKala = "";
FldFeeForoosh = "";
FldTedadDarKarton = "";
FldTedadDarSabadJoz = "";
FldTedadDarSabadKol = "";
FldTarikh = "";
FldLat = "";
FldLon = "";
FldSend = 0;
FldVaziatPardakhti = "";
FldTozihat = "";
FldMablaghMasrafKonande = "";
fldArzeshAfzode = "";
fldDarsadArzeshAfzode = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _adapterlistashkhas{
public boolean IsInitialized;
public String CodeTafzili;
public String SharhTafzili;
public String Mande;
public String Lat;
public String Lon;
public String Tell;
public String Address;
public String FldLastVisit;
public String FldLastSefaresh;
public String FldMobile;
public String FldVaziat;
public String FldEtebar;
public String lastSeen;
public String lastOrderDate;
public String FldC_Gorooh;
public String FldN_Gorooh;
public String FldSync;
public String FldC_Meli;
public String FldC_Posti;
public String FldShomarehesab;
public String fldBlackList;
public String fldSaghfeEtebar;
public int fldRadif;
public String fldDateVisit;
public String fldVaziatTour;
public void Initialize() {
IsInitialized = true;
CodeTafzili = "";
SharhTafzili = "";
Mande = "";
Lat = "";
Lon = "";
Tell = "";
Address = "";
FldLastVisit = "";
FldLastSefaresh = "";
FldMobile = "";
FldVaziat = "";
FldEtebar = "";
lastSeen = "";
lastOrderDate = "";
FldC_Gorooh = "";
FldN_Gorooh = "";
FldSync = "";
FldC_Meli = "";
FldC_Posti = "";
FldShomarehesab = "";
fldBlackList = "";
fldSaghfeEtebar = "";
fldRadif = 0;
fldDateVisit = "";
fldVaziatTour = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _adapterlistticket{
public boolean IsInitialized;
public String FldCode;
public String FldOnvan;
public String FldOlaviat;
public String FldTozihat;
public String FldDate;
public String FldTime;
public String FldVaziat;
public String FldAnswer;
public void Initialize() {
IsInitialized = true;
FldCode = "";
FldOnvan = "";
FldOlaviat = "";
FldTozihat = "";
FldDate = "";
FldTime = "";
FldVaziat = "";
FldAnswer = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _adapterlistnoetasvie{
public boolean IsInitialized;
public String FldC_Tasvie;
public String FldN_Tasvie;
public void Initialize() {
IsInitialized = true;
FldC_Tasvie = "";
FldN_Tasvie = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _adapterlistfaktor{
public boolean IsInitialized;
public String C_Name;
public String fldShomareFaktor;
public String fldTotalFaktor;
public String fldMablaghKol;
public String fldDate;
public String fldTime;
public String fldTozihFaktor;
public String fldVaziat;
public String fldC_Tasvie;
public String fldC_Ashkhas;
public String FldTakhfifKala;
public String FldTakhfifVizhe;
public String Signature;
public String fldTedadJoz;
public String fldTedadCarton;
public String fldTedadJozMarjoee;
public String fldTedadCartonMarjoee;
public String fldTedadJozMande;
public String fldTedadCartonMande;
public String fldMablaghMande;
public String FldName;
public String FldShomareBargasht;
public String FldDateBargasht;
public String FldMablaghBargasht;
public String FldType;
public String fldShomareForoosh;
public String FldAmani;
public boolean wIsBacked;
public boolean synced;
public String fldArzeshAfzode;
public String fldDarsadArzeshAfzode;
public String fldSumMandeAzGhabl;
public String fldSumMablaghBadAzTakhfif;
public void Initialize() {
IsInitialized = true;
C_Name = "";
fldShomareFaktor = "";
fldTotalFaktor = "";
fldMablaghKol = "";
fldDate = "";
fldTime = "";
fldTozihFaktor = "";
fldVaziat = "";
fldC_Tasvie = "";
fldC_Ashkhas = "";
FldTakhfifKala = "";
FldTakhfifVizhe = "";
Signature = "";
fldTedadJoz = "";
fldTedadCarton = "";
fldTedadJozMarjoee = "";
fldTedadCartonMarjoee = "";
fldTedadJozMande = "";
fldTedadCartonMande = "";
fldMablaghMande = "";
FldName = "";
FldShomareBargasht = "";
FldDateBargasht = "";
FldMablaghBargasht = "";
FldType = "";
fldShomareForoosh = "";
FldAmani = "";
wIsBacked = false;
synced = false;
fldArzeshAfzode = "";
fldDarsadArzeshAfzode = "";
fldSumMandeAzGhabl = "";
fldSumMablaghBadAzTakhfif = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _adapterlistrizefaktor{
public boolean IsInitialized;
public String FldRadif;
public String C_Name;
public String fldShomareFaktor;
public String fldTotalFaktor;
public String fldMablaghKol;
public String fldDate;
public String fldTime;
public String fldTozihFaktor;
public String fldVaziat;
public String fldC_Tasvie;
public String fldC_Ashkhas;
public String FldTakhfifKala;
public String FldTakhfifVizhe;
public String Signature;
public String fldTedadJoz;
public String fldTedadCarton;
public String fldTedadJozMarjoee;
public String fldTedadCartonMarjoee;
public String fldCodeKala;
public String fldSharhKala;
public String fldTedadJozMande;
public String fldTedadCartonMande;
public String fldMablaghMande;
public String FldName;
public String FldShomareBargasht;
public String FldDateBargasht;
public String FldMablaghBargasht;
public String FldType;
public String fldShomareForoosh;
public String FldAmani;
public boolean wIsBacked;
public boolean synced;
public String fldArzeshAfzode;
public String fldDarsadArzeshAfzode;
public void Initialize() {
IsInitialized = true;
FldRadif = "";
C_Name = "";
fldShomareFaktor = "";
fldTotalFaktor = "";
fldMablaghKol = "";
fldDate = "";
fldTime = "";
fldTozihFaktor = "";
fldVaziat = "";
fldC_Tasvie = "";
fldC_Ashkhas = "";
FldTakhfifKala = "";
FldTakhfifVizhe = "";
Signature = "";
fldTedadJoz = "";
fldTedadCarton = "";
fldTedadJozMarjoee = "";
fldTedadCartonMarjoee = "";
fldCodeKala = "";
fldSharhKala = "";
fldTedadJozMande = "";
fldTedadCartonMande = "";
fldMablaghMande = "";
FldName = "";
FldShomareBargasht = "";
FldDateBargasht = "";
FldMablaghBargasht = "";
FldType = "";
fldShomareForoosh = "";
FldAmani = "";
wIsBacked = false;
synced = false;
fldArzeshAfzode = "";
fldDarsadArzeshAfzode = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _finalfaktor_{
public boolean IsInitialized;
public String SoodVisitor;
public String MandeHesab;
public String date;
public String shfaktor;
public String Customername;
public String Mantaghe;
public String Address;
public String Tel;
public String TasvieType;
public String KhamFaktor;
public String TakhfifKala;
public String TakhfifKol;
public String TakhfifVizhe;
public String GablePardakht;
public String Eshantion;
public String fldArzeshAfzode;
public String SumKolBadazTahkfif;
public void Initialize() {
IsInitialized = true;
SoodVisitor = "";
MandeHesab = "";
date = "";
shfaktor = "";
Customername = "";
Mantaghe = "";
Address = "";
Tel = "";
TasvieType = "";
KhamFaktor = "";
TakhfifKala = "";
TakhfifKol = "";
TakhfifVizhe = "";
GablePardakht = "";
Eshantion = "";
fldArzeshAfzode = "";
SumKolBadazTahkfif = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _adapterreportvisitor{
public boolean IsInitialized;
public String fldSharhKala;
public String fldTedadJoz;
public String fldTedadCarton;
public String fldTedadKol;
public String fldCount;
public String fldFeeJoz;
public void Initialize() {
IsInitialized = true;
fldSharhKala = "";
fldTedadJoz = "";
fldTedadCarton = "";
fldTedadKol = "";
fldCount = "";
fldFeeJoz = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _adapterreportmoshtari{
public boolean IsInitialized;
public String fldFeeJoz;
public String fldFeeBargasht;
public String fldTedadEshantionJoz;
public String fldTedadEshantionKol;
public void Initialize() {
IsInitialized = true;
fldFeeJoz = "";
fldFeeBargasht = "";
fldTedadEshantionJoz = "";
fldTedadEshantionKol = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _adapterreportsoorathesab{
public boolean IsInitialized;
public String fldRadif;
public String shomare;
public String fldSanad;
public String fldSharh;
public String fldRiz;
public String fldDate;
public String fldBedehkar;
public String fldBestankar;
public String fldMande;
public void Initialize() {
IsInitialized = true;
fldRadif = "";
shomare = "";
fldSanad = "";
fldSharh = "";
fldRiz = "";
fldDate = "";
fldBedehkar = "";
fldBestankar = "";
fldMande = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _adapterlistnotif{
public boolean IsInitialized;
public String FldId;
public String FldTitle;
public String FldBody;
public String FldDate;
public String FldTime;
public void Initialize() {
IsInitialized = true;
FldId = "";
FldTitle = "";
FldBody = "";
FldDate = "";
FldTime = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _adapterlisttour{
public boolean IsInitialized;
public String CodeVisitor;
public String indexTour;
public anywheresoftware.b4a.objects.collections.List Tour;
public int TedadTour;
public long DateTour;
public void Initialize() {
IsInitialized = true;
CodeVisitor = "";
indexTour = "";
Tour = new anywheresoftware.b4a.objects.collections.List();
TedadTour = 0;
DateTour = 0L;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _adapterlistrizetour{
public boolean IsInitialized;
public int Id;
public int fldRadif;
public String fldCodeSuperVisor;
public String fldCodeVisitor;
public String fldCodeGroup;
public int fldCodeTafzili;
public String fldSharheTafzili;
public String FldLat;
public String FldLon;
public int fldDate;
public int fldDateVisit;
public int fldTimeVisit;
public String fldDateNextVisit;
public int fldDateTozie;
public String fldShomareSefaresh;
public String fldSharh;
public int fldVaziat;
public String fldShomareFactor;
public void Initialize() {
IsInitialized = true;
Id = 0;
fldRadif = 0;
fldCodeSuperVisor = "";
fldCodeVisitor = "";
fldCodeGroup = "";
fldCodeTafzili = 0;
fldSharheTafzili = "";
FldLat = "";
FldLon = "";
fldDate = 0;
fldDateVisit = 0;
fldTimeVisit = 0;
fldDateNextVisit = "";
fldDateTozie = 0;
fldShomareSefaresh = "";
fldSharh = "";
fldVaziat = 0;
fldShomareFactor = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _adapterlisteshantion{
public boolean IsInitialized;
public String ID;
public String fldCodeKalaForoosh;
public String fldShomareTabaghe;
public String fldTedadForoosh;
public String fldCodeKalaEshantion;
public String fldTedadEshantion;
public void Initialize() {
IsInitialized = true;
ID = "";
fldCodeKalaForoosh = "";
fldShomareTabaghe = "";
fldTedadForoosh = "";
fldCodeKalaEshantion = "";
fldTedadEshantion = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _adapterlisteshantiongroup{
public boolean IsInitialized;
public String ID;
public String fldCodeGroupKala;
public String fldShomareTabaghe;
public String fldTedadForoosh;
public String fldCodeGroupKalaEshantion;
public String fldTedadEshantion;
public void Initialize() {
IsInitialized = true;
ID = "";
fldCodeGroupKala = "";
fldShomareTabaghe = "";
fldTedadForoosh = "";
fldCodeGroupKalaEshantion = "";
fldTedadEshantion = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _adapterlisteshantiongroupcontent{
public boolean IsInitialized;
public String fldCodeGroupKala;
public String fldCodeGroupKalaEshantion;
public String fldTedadEshantion;
public void Initialize() {
IsInitialized = true;
fldCodeGroupKala = "";
fldCodeGroupKalaEshantion = "";
fldTedadEshantion = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _adapterepfactorvisitor{
public boolean IsInitialized;
public String fldShomareFactor;
public String fldCodeVasete;
public String FldN_Visitor;
public String fldCodeTafsili;
public String fldSharheTafzili;
public String fldTozihat;
public String fldTime;
public String fldDate;
public String fldNahveTasvie;
public String fldShomareFactorReal;
public void Initialize() {
IsInitialized = true;
fldShomareFactor = "";
fldCodeVasete = "";
FldN_Visitor = "";
fldCodeTafsili = "";
fldSharheTafzili = "";
fldTozihat = "";
fldTime = "";
fldDate = "";
fldNahveTasvie = "";
fldShomareFactorReal = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _adaptereprizfactorvisitor{
public boolean IsInitialized;
public String fldRadif;
public String fldShomareFactor;
public String fldCodeVasete;
public String FldN_Visitor;
public String fldCodeTafsili;
public String fldSharheTafzili;
public String fldCodeKala;
public String fldSharhKala;
public String fldTozihatRecord;
public String fldDate;
public String fldNahveTasvie;
public String fldTedadJoz;
public String fldFeeJoz;
public String fldTedadCarton;
public String FldTedadDarKarton;
public String fldShomareFactorReal;
public int SumFee;
public void Initialize() {
IsInitialized = true;
fldRadif = "";
fldShomareFactor = "";
fldCodeVasete = "";
FldN_Visitor = "";
fldCodeTafsili = "";
fldSharheTafzili = "";
fldCodeKala = "";
fldSharhKala = "";
fldTozihatRecord = "";
fldDate = "";
fldNahveTasvie = "";
fldTedadJoz = "";
fldFeeJoz = "";
fldTedadCarton = "";
FldTedadDarKarton = "";
fldShomareFactorReal = "";
SumFee = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _adapterephavale{
public boolean IsInitialized;
public String fldShomareHavale;
public String fldDate;
public String fldVaziat;
public String fldMandeFactor;
public String fldCountFactor;
public void Initialize() {
IsInitialized = true;
fldShomareHavale = "";
fldDate = "";
fldVaziat = "";
fldMandeFactor = "";
fldCountFactor = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _adapterizhavale{
public boolean IsInitialized;
public String fldShomareFactor;
public String fldCodeTafzili;
public String fldSharhTafzili;
public String fldMablaghKhales;
public String fldAddress;
public String fldTell;
public String fldDate;
public String fldLat;
public String fldLon;
public String fldVaziat;
public String Distance;
public void Initialize() {
IsInitialized = true;
fldShomareFactor = "";
fldCodeTafzili = "";
fldSharhTafzili = "";
fldMablaghKhales = "";
fldAddress = "";
fldTell = "";
fldDate = "";
fldLat = "";
fldLon = "";
fldVaziat = "";
Distance = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _adapterizfactorhavale{
public boolean IsInitialized;
public String fldShomareFactor;
public String fldShomareHavale;
public String fldShomareSanad;
public String fldCodeAnbar;
public String fldRadif;
public String fldCodeKala;
public String fldSharhKala;
public String fldCodeTafzili;
public String fldSharhTafzili;
public String fldTedadCarton;
public String fldTedadJoz;
public String fldFeeJoz;
public String fldFeeYekCarton;
public String fldFeeKol;
public String fldDarsadTakhfif;
public String fldMablaghTakhfif;
public String fldArzeshAfzode;
public String fldMablaghKhales;
public String fldNameCompany;
public String fldC_Ranandeh;
public String fldN_Ranandeh;
public String fldAddress;
public String fldTell;
public String fldCodeVasete;
public String fldDateFactor;
public String fldDate;
public String fldTime;
public String fldLat;
public String fldLon;
public String fldMandeTalab;
public String fldMablagheKolDaryafti;
public String fldMandeTasfieNashode;
public String fldDateSarResid;
public String fldVaziat;
public String fldDateTahvil;
public String fldTimeTahvil;
public String fldSignature;
public String fldSharhFactor;
public String Distance;
public void Initialize() {
IsInitialized = true;
fldShomareFactor = "";
fldShomareHavale = "";
fldShomareSanad = "";
fldCodeAnbar = "";
fldRadif = "";
fldCodeKala = "";
fldSharhKala = "";
fldCodeTafzili = "";
fldSharhTafzili = "";
fldTedadCarton = "";
fldTedadJoz = "";
fldFeeJoz = "";
fldFeeYekCarton = "";
fldFeeKol = "";
fldDarsadTakhfif = "";
fldMablaghTakhfif = "";
fldArzeshAfzode = "";
fldMablaghKhales = "";
fldNameCompany = "";
fldC_Ranandeh = "";
fldN_Ranandeh = "";
fldAddress = "";
fldTell = "";
fldCodeVasete = "";
fldDateFactor = "";
fldDate = "";
fldTime = "";
fldLat = "";
fldLon = "";
fldMandeTalab = "";
fldMablagheKolDaryafti = "";
fldMandeTasfieNashode = "";
fldDateSarResid = "";
fldVaziat = "";
fldDateTahvil = "";
fldTimeTahvil = "";
fldSignature = "";
fldSharhFactor = "";
Distance = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _adapterlistsabt{
public boolean IsInitialized;
public String FldShomareSabt;
public String FldC_Ashkhas;
public String FldType;
public String FldNoe;
public String FldMablagh;
public String FldShomareCheck;
public String FldDateCheck;
public String FldBankName;
public String FldDateSabt;
public String TozihateFaktor;
public void Initialize() {
IsInitialized = true;
FldShomareSabt = "";
FldC_Ashkhas = "";
FldType = "";
FldNoe = "";
FldMablagh = "";
FldShomareCheck = "";
FldDateCheck = "";
FldBankName = "";
FldDateSabt = "";
TozihateFaktor = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _adapterlistvideo{
public boolean IsInitialized;
public String Id;
public String fldTitle;
public String fldLink;
public String fldDate;
public String fldTime;
public int fldVaziat;
public String fldDescription;
public String fldImage;
public void Initialize() {
IsInitialized = true;
Id = "";
fldTitle = "";
fldLink = "";
fldDate = "";
fldTime = "";
fldVaziat = 0;
fldDescription = "";
fldImage = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _adapterlistcheckdaryafti{
public boolean IsInitialized;
public String ID;
public String fldShomareCheck;
public String fldShomareHesab;
public String fldDate;
public String fldDateSarResid;
public String fldCodeBank;
public String fldNameBank;
public String fldShobe;
public int fldMablagh;
public String fldCodeSahebeCheck;
public String fldNameSahebeCheck;
public String fldShomareDaryaft;
public String fldSharh;
public String fldShomareFactor;
public String count;
public void Initialize() {
IsInitialized = true;
ID = "";
fldShomareCheck = "";
fldShomareHesab = "";
fldDate = "";
fldDateSarResid = "";
fldCodeBank = "";
fldNameBank = "";
fldShobe = "";
fldMablagh = 0;
fldCodeSahebeCheck = "";
fldNameSahebeCheck = "";
fldShomareDaryaft = "";
fldSharh = "";
fldShomareFactor = "";
count = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _adapteenterexitvisitor{
public boolean IsInitialized;
public String fldType;
public String fldDate;
public String fldTime;
public String fldLat;
public String fldLon;
public String fldCode;
public void Initialize() {
IsInitialized = true;
fldType = "";
fldDate = "";
fldTime = "";
fldLat = "";
fldLon = "";
fldCode = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _adapteversion{
public boolean IsInitialized;
public String FldVersion;
public String FldLink;
public String FldDateUpdate;
public String FldType;
public String FldNumberVersion;
public String id;
public void Initialize() {
IsInitialized = true;
FldVersion = "";
FldLink = "";
FldDateUpdate = "";
FldType = "";
FldNumberVersion = "";
id = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.sql.SQL _sql1 = null;
public static ADR.stringdemo.stringfunctions _sf = null;
public static ir.aghajari.iconanim.Amir_IconView _iconview = null;
public static anywheresoftware.b4a.student.PersianDate _persiandate = null;
public static com.maximussoft.msmaterialdrawer.MSMaterialDrawer _md = null;
public static anywheresoftware.b4a.objects.collections.JSONParser _json = null;
public static anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _jsong = null;
public static anywheresoftware.b4a.phone.Phone.PhoneId _p = null;
public static anywheresoftware.b4a.phone.Phone _pimei = null;
public static anywheresoftware.b4a.phone.Phone.PhoneId _imei = null;
public static String _strimei = "";
public static anywheresoftware.b4a.keywords.constants.TypefaceWrapper _font2 = null;
public static anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _placeholder = null;
public static String _vahedpool = "";
public static String _raghamashar = "";
public static String _c_visitor = "";
public static String _n_visitor = "";
public static String _url = "";
public static String _kalamanfi = "";
public static String _taghirfeekala = "";
public static String _takhfifkala = "";
public static String _backpage = "";
public static String _shomarefaktor = "";
public static String _noefaktorclick = "";
public static String _noefaktorchecked = "";
public static int _servicegpsactive = 0;
public static String _c_tafzili = "";
public static String _n_tafzili = "";
public static String _address_tafzili = "";
public static String _tell_tafzili = "";
public static String _version = "";
public static String _namayeshkalasefr = "";
public static String _newversion = "";
public static String _linkdownload = "";
public static String _c_layekala = "";
public static String _c_layeashkhas = "";
public static String _datefaktor = "";
public static String _vaziatpardakhtfaktor = "";
public static String _printbuffer = "";
public static anywheresoftware.b4a.objects.Serial.BluetoothAdmin _btadmin = null;
public static anywheresoftware.b4a.objects.Serial _btconnection = null;
public static anywheresoftware.b4a.objects.streams.File.TextWriterWrapper _printers = null;
public static String _typegetdata = "";
public static boolean _loadenable = false;
public static boolean _pausestate = false;
public static String _deviceid = "";
public static boolean _isactive = false;
public static boolean _savefactorinlocation = false;
public static long _masafat = 0L;
public static String _tokenpush = "";
public static String _pushbody = "";
public static int _dastrasigroupkala = 0;
public static int _dastrasigroupashkhas = 0;
public static anywheresoftware.b4a.objects.collections.List _originallistfaktor = null;
public static int _textsizepdf = 0;
public static anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmtsignature = null;
public static boolean _gpsisenable = false;
public static int _printertype = 0;
public static int _vaziat = 0;
public static String _codemoshtari = "";
public static String _imageurl = "";
public static String _backtoactivity = "";
public static String _appname = "";
public static String _menutitle2 = "";
public static String _appver = "";
public static String _plan = "";
public static String _code = "";
public static boolean _haveshift = false;
public static String _etelaresani = "";
public static String _fldnewmoshtari = "";
public static String _showbedehkaran = "";
public static String _noeget = "";
public static boolean _isfloat = false;
public static anywheresoftware.b4a.agraham.richstring.RichStringBuilder.RichString _rs = null;
public static String _page = "";
public static String _gps = "";
public static String _sabtgpsshakhs = "";
public static String _showgpsshakhs = "";
public static String _action = "";
public static String _faktorselect = "";
public static String _forooshbishazmojoodi = "";
public static String _signature = "";
public static String _voroodtozihkala = "";
public static String _darsadsood = "";
public static int _darsadtakhfifvizhe = 0;
public static String _kharidbiashaz = "";
public static String _datetimesend = "";
public static String _datetimerecive = "";
public static String _shomaresabt = "";
public static String _iconlink = "";
public static ir.parsikhesab.pakhsh.mcode._finalfaktor_ _finalfaktor = null;
public static anywheresoftware.b4a.objects.StringUtils _su = null;
public static anywheresoftware.b4a.objects.collections.List _listnotif = null;
public static String _codevisitorselect = "";
public static String _codemoshtariselect = "";
public static String _countshowgpsmap = "";
public static Object _tag = null;
public static String _admin = "";
public static String _tozie = "";
public static String _visitor = "";
public static String _sendmarjoie = "";
public static String _checkadmin = "";
public static String _hidemojodi = "";
public static String _mablaghkol = "";
public static String _tozihat_faktor = "";
public static String _noetasviefaktor = "";
public static String _dateversion = "";
public static String _isonlinedatafactor = "";
public static String _feetip = "";
public static String _feecode = "";
public static String _piconline = "";
public static String _connectionstatus = "";
public static String[] _arraytasvieforkala = null;
public static String _typeversion = "";
public static String _numberversion = "";
public static String _darkmode = "";
public static int _colorprimary = 0;
public static int _colorprimarydark = 0;
public static int _coloraccent = 0;
public static boolean _vpn = false;
public static int _intervalgps = 0;
public static String _lat = "";
public static String _lon = "";
public static int _gethavaleflag = 0;
public static String _shomarehavale = "";
public static String _shomaredaryaft = "";
public static String _videoselected = "";
public static anywheresoftware.b4a.objects.collections.List _lstchangefeekala = null;
public static boolean _downloadingdata = false;
public static String _gpsdateta = "";
public static String _gpstimeaz = "";
public static String _gpstimeta = "";
public static String _getdataonline = "";
public static String _daryaft = "";
public static String _amani = "";
public static String _isamani = "";
public static String _setvisit = "";
public static String _mojavezsefaresh = "";
public static boolean _deleteashkhasnew = false;
public static boolean _rotatepic = false;
public static boolean _updateshakhs = false;
public static String _feechange = "";
public static String _eshantiontabaghati = "";
public static String _eshantiongroup = "";
public static String _eshantionremove = "";
public static String _counteshantiongroup = "";
public static String _mandeetebar = "";
public static String _mandehesab = "";
public static boolean _manedetebarenable = false;
public static anywheresoftware.b4a.agraham.threading.Threading _th = null;
public static String _linkposparsian = "";
public static String _packagenameposparsian = "";
public static String _statuspickala = "";
public static String _codekalaimage = "";
public static String _companyname = "";
public static String _companytell = "";
public static String _companyaddress = "";
public static String _mobileisimportent = "";
public static String _arzeshafzode = "";
public static String _arzeshafzodeenable = "";
public static boolean _updatesefaresh = false;
public static String _fuslat = "";
public static String _fuslon = "";
public static String _fusgettime = "";
public static boolean _widgetenable = false;
public static boolean _editfactor = false;
public static String _tourvisit = "";
public static PNBroadcastReceiver.PNBrodcastReceiver _receiver2 = null;
public static boolean _tourvisitsw = false;
public static boolean _getdatastatus = false;
public igolub.fused.b4a.location.android.location.LocationFWrapper.LocationFStatic _locationf = null;
public igolub.fused.b4a.location.LocationResultWrapper.LocationResultConstants _locationresult = null;
public igolub.fused.b4a.location.LocationRequestWrapper.LocationRequestConstants _locationrequest = null;
public igolub.fused.b4a.location.staticmodules.PriorityWrapper _priority = null;
public igolub.fused.b4a.location.staticmodules.GranularityWrapper _granularity = null;
public igolub.permissionmanager.b4a.PermissionsManagerFileProvider _fileprovider = null;
public igolub.permissionmanager.b4a.PermissionsManagerConstants _permissionsmanager = null;
public b4a.example.dateutils _dateutils = null;
public ir.parsikhesab.pakhsh.main _main = null;
public ir.parsikhesab.pakhsh.act_main _act_main = null;
public ir.parsikhesab.pakhsh.service_server _service_server = null;
public ir.parsikhesab.pakhsh.mycode _mycode = null;
public ir.parsikhesab.pakhsh.mdatabase _mdatabase = null;
public ir.parsikhesab.pakhsh.gpswiget _gpswiget = null;
public ir.parsikhesab.pakhsh.fusedlocationservice _fusedlocationservice = null;
public ir.parsikhesab.pakhsh.service_helper _service_helper = null;
public ir.parsikhesab.pakhsh.act_selectmantage _act_selectmantage = null;
public ir.parsikhesab.pakhsh.act_reprizfactorvisitor _act_reprizfactorvisitor = null;
public ir.parsikhesab.pakhsh.act_choose_report _act_choose_report = null;
public ir.parsikhesab.pakhsh.act_emza _act_emza = null;
public ir.parsikhesab.pakhsh.act_havaletozie _act_havaletozie = null;
public ir.parsikhesab.pakhsh.act_imageslideshow _act_imageslideshow = null;
public ir.parsikhesab.pakhsh.act_kala_listi _act_kala_listi = null;
public ir.parsikhesab.pakhsh.act_kaladefault _act_kaladefault = null;
public ir.parsikhesab.pakhsh.act_kalapaging _act_kalapaging = null;
public ir.parsikhesab.pakhsh.act_kalapaging2 _act_kalapaging2 = null;
public ir.parsikhesab.pakhsh.act_locationmoshtarian _act_locationmoshtarian = null;
public ir.parsikhesab.pakhsh.act_locationvisitor _act_locationvisitor = null;
public ir.parsikhesab.pakhsh.act_mali _act_mali = null;
public ir.parsikhesab.pakhsh.act_moshtarian _act_moshtarian = null;
public ir.parsikhesab.pakhsh.act_newashkhas _act_newashkhas = null;
public ir.parsikhesab.pakhsh.act_notif _act_notif = null;
public ir.parsikhesab.pakhsh.act_printmali _act_printmali = null;
public ir.parsikhesab.pakhsh.act_printpic _act_printpic = null;
public ir.parsikhesab.pakhsh.act_printpic2 _act_printpic2 = null;
public ir.parsikhesab.pakhsh.act_profile _act_profile = null;
public ir.parsikhesab.pakhsh.act_repfactors _act_repfactors = null;
public ir.parsikhesab.pakhsh.act_repfactorvisitor _act_repfactorvisitor = null;
public ir.parsikhesab.pakhsh.act_reportrizebargasht _act_reportrizebargasht = null;
public ir.parsikhesab.pakhsh.act_reportsoorathesab _act_reportsoorathesab = null;
public ir.parsikhesab.pakhsh.act_reportvisitor _act_reportvisitor = null;
public ir.parsikhesab.pakhsh.act_reportvisitor2 _act_reportvisitor2 = null;
public ir.parsikhesab.pakhsh.act_restore _act_restore = null;
public ir.parsikhesab.pakhsh.act_rizefactorhavale _act_rizefactorhavale = null;
public ir.parsikhesab.pakhsh.act_rizfaktor _act_rizfaktor = null;
public ir.parsikhesab.pakhsh.act_rizhavale _act_rizhavale = null;
public ir.parsikhesab.pakhsh.act_sabad _act_sabad = null;
public ir.parsikhesab.pakhsh.act_sabtmarjooii _act_sabtmarjooii = null;
public ir.parsikhesab.pakhsh.act_sabtrizcheck _act_sabtrizcheck = null;
public ir.parsikhesab.pakhsh.act_saveinfocompany _act_saveinfocompany = null;
public ir.parsikhesab.pakhsh.act_savelocation _act_savelocation = null;
public ir.parsikhesab.pakhsh.act_search _act_search = null;
public ir.parsikhesab.pakhsh.act_selfaktor _act_selfaktor = null;
public ir.parsikhesab.pakhsh.act_senddata _act_senddata = null;
public ir.parsikhesab.pakhsh.act_setting _act_setting = null;
public ir.parsikhesab.pakhsh.act_settingpos _act_settingpos = null;
public ir.parsikhesab.pakhsh.act_showlocation _act_showlocation = null;
public ir.parsikhesab.pakhsh.act_support _act_support = null;
public ir.parsikhesab.pakhsh.act_ticket _act_ticket = null;
public ir.parsikhesab.pakhsh.act_video _act_video = null;
public ir.parsikhesab.pakhsh.clskala _clskala = null;
public ir.parsikhesab.pakhsh.dbutils _dbutils = null;
public ir.parsikhesab.pakhsh.firebasemessaging _firebasemessaging = null;
public ir.parsikhesab.pakhsh.geoservice _geoservice = null;
public ir.parsikhesab.pakhsh.imagedownloader _imagedownloader = null;
public ir.parsikhesab.pakhsh.myreceiver _myreceiver = null;
public ir.parsikhesab.pakhsh.service_gps _service_gps = null;
public ir.parsikhesab.pakhsh.service_notification _service_notification = null;
public ir.parsikhesab.pakhsh.signaturecapture _signaturecapture = null;
public ir.parsikhesab.pakhsh.starter _starter = null;
public ir.parsikhesab.pakhsh.tracker _tracker = null;
public ir.parsikhesab.pakhsh.wiget_service _wiget_service = null;
public ir.parsikhesab.pakhsh.xmlviewex _xmlviewex = null;
public ir.parsikhesab.pakhsh.newinst2 _newinst2 = null;
public ir.parsikhesab.pakhsh.base64encodedecodeimage _base64encodedecodeimage = null;
public ir.parsikhesab.pakhsh.httputils2service _httputils2service = null;
public ir.parsikhesab.pakhsh.xuiviewsutils _xuiviewsutils = null;
public static boolean  _isconnected(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="mcode";
if (Debug.shouldDelegate(null, "isconnected", false))
	 {return ((Boolean) Debug.delegate(null, "isconnected", new Object[] {_ba}));}
anywheresoftware.b4a.phone.Phone _p1 = null;
anywheresoftware.b4a.objects.SocketWrapper.ServerSocketWrapper _server = null;
RDebugUtils.currentLine=15990784;
 //BA.debugLineNum = 15990784;BA.debugLine="Sub IsConnected As Boolean";
RDebugUtils.currentLine=15990785;
 //BA.debugLineNum = 15990785;BA.debugLine="Dim P1 As Phone";
_p1 = new anywheresoftware.b4a.phone.Phone();
RDebugUtils.currentLine=15990786;
 //BA.debugLineNum = 15990786;BA.debugLine="Dim server As ServerSocket'Add a reference to the";
_server = new anywheresoftware.b4a.objects.SocketWrapper.ServerSocketWrapper();
RDebugUtils.currentLine=15990787;
 //BA.debugLineNum = 15990787;BA.debugLine="Try";
try {RDebugUtils.currentLine=15990792;
 //BA.debugLineNum = 15990792;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 } 
       catch (Exception e6) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e6);RDebugUtils.currentLine=15990794;
 //BA.debugLineNum = 15990794;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=15990796;
 //BA.debugLineNum = 15990796;BA.debugLine="End Sub";
return false;
}
public static String  _saveupdate(anywheresoftware.b4a.BA _ba,String _query) throws Exception{
RDebugUtils.currentModule="mcode";
if (Debug.shouldDelegate(null, "saveupdate", false))
	 {return ((String) Debug.delegate(null, "saveupdate", new Object[] {_ba,_query}));}
RDebugUtils.currentLine=13500416;
 //BA.debugLineNum = 13500416;BA.debugLine="Sub SaveUpdate(query As String)";
RDebugUtils.currentLine=13500417;
 //BA.debugLineNum = 13500417;BA.debugLine="Try";
try {RDebugUtils.currentLine=13500418;
 //BA.debugLineNum = 13500418;BA.debugLine="If Sql1.IsInitialized=False Then";
if (_sql1.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=13500419;
 //BA.debugLineNum = 13500419;BA.debugLine="Initialize";
_initialize(_ba);
 };
RDebugUtils.currentLine=13500421;
 //BA.debugLineNum = 13500421;BA.debugLine="Sql1.ExecNonQuery(query)";
_sql1.ExecNonQuery(_query);
 } 
       catch (Exception e7) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e7);RDebugUtils.currentLine=13500424;
 //BA.debugLineNum = 13500424;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("513500424",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)),0);
RDebugUtils.currentLine=13500425;
 //BA.debugLineNum = 13500425;BA.debugLine="Log(\"not Save\")";
anywheresoftware.b4a.keywords.Common.LogImpl("513500425","not Save",0);
RDebugUtils.currentLine=13500426;
 //BA.debugLineNum = 13500426;BA.debugLine="myCode.SendError(LastException,\"MCode-SaveUpdate";
mostCurrent._mycode._senderror /*void*/ (_ba,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)),"MCode-SaveUpdate");
 };
RDebugUtils.currentLine=13500428;
 //BA.debugLineNum = 13500428;BA.debugLine="End Sub";
return "";
}
public static String  _getdeviceid(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="mcode";
if (Debug.shouldDelegate(null, "getdeviceid", false))
	 {return ((String) Debug.delegate(null, "getdeviceid", new Object[] {_ba}));}
anywheresoftware.b4a.phone.Phone _p1 = null;
String _id = "";
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
int _api = 0;
anywheresoftware.b4a.phone.Phone.PhoneId _pid = null;
RDebugUtils.currentLine=14614528;
 //BA.debugLineNum = 14614528;BA.debugLine="Sub GetDeviceId As String";
RDebugUtils.currentLine=14614530;
 //BA.debugLineNum = 14614530;BA.debugLine="Dim P1 As Phone";
_p1 = new anywheresoftware.b4a.phone.Phone();
RDebugUtils.currentLine=14614531;
 //BA.debugLineNum = 14614531;BA.debugLine="Dim id As String";
_id = "";
RDebugUtils.currentLine=14614532;
 //BA.debugLineNum = 14614532;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=14614533;
 //BA.debugLineNum = 14614533;BA.debugLine="Dim Api As Int";
_api = 0;
RDebugUtils.currentLine=14614534;
 //BA.debugLineNum = 14614534;BA.debugLine="Dim pID As PhoneId";
_pid = new anywheresoftware.b4a.phone.Phone.PhoneId();
RDebugUtils.currentLine=14614537;
 //BA.debugLineNum = 14614537;BA.debugLine="Api = r.GetStaticField(\"android.os.Build$VERSION\"";
_api = (int)(BA.ObjectToNumber(_r.GetStaticField("android.os.Build$VERSION","SDK_INT")));
RDebugUtils.currentLine=14614540;
 //BA.debugLineNum = 14614540;BA.debugLine="Log(\"api: \"& Api)";
anywheresoftware.b4a.keywords.Common.LogImpl("514614540","api: "+BA.NumberToString(_api),0);
RDebugUtils.currentLine=14614541;
 //BA.debugLineNum = 14614541;BA.debugLine="If Api < 28 Then";
if (_api<28) { 
RDebugUtils.currentLine=14614543;
 //BA.debugLineNum = 14614543;BA.debugLine="id = pID.GetDeviceId";
_id = _pid.GetDeviceId();
 }else {
RDebugUtils.currentLine=14614547;
 //BA.debugLineNum = 14614547;BA.debugLine="id= r.GetStaticField(\"android.os.Build\", \"SERIAL";
_id = BA.ObjectToString(_r.GetStaticField("android.os.Build","SERIAL"));
RDebugUtils.currentLine=14614548;
 //BA.debugLineNum = 14614548;BA.debugLine="If id.ToLowerCase = \"unknown\" Then";
if ((_id.toLowerCase()).equals("unknown")) { 
RDebugUtils.currentLine=14614549;
 //BA.debugLineNum = 14614549;BA.debugLine="id= P1.GetSettings(\"android_id\")";
_id = _p1.GetSettings("android_id");
 };
RDebugUtils.currentLine=14614552;
 //BA.debugLineNum = 14614552;BA.debugLine="If id.ToLowerCase = \"9774d56d682e549c\" Or id = N";
if ((_id.toLowerCase()).equals("9774d56d682e549c") || _id== null) { 
_id = _p1.GetSettings("android_id");};
 };
RDebugUtils.currentLine=14614559;
 //BA.debugLineNum = 14614559;BA.debugLine="Return id";
if (true) return _id;
RDebugUtils.currentLine=14614560;
 //BA.debugLineNum = 14614560;BA.debugLine="End Sub";
return "";
}
public static int  _getapiversion(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="mcode";
if (Debug.shouldDelegate(null, "getapiversion", false))
	 {return ((Integer) Debug.delegate(null, "getapiversion", new Object[] {_ba}));}
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
int _api = 0;
RDebugUtils.currentLine=14680064;
 //BA.debugLineNum = 14680064;BA.debugLine="Sub GetApiVersion As Int";
RDebugUtils.currentLine=14680065;
 //BA.debugLineNum = 14680065;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=14680066;
 //BA.debugLineNum = 14680066;BA.debugLine="Dim Api As Int";
_api = 0;
RDebugUtils.currentLine=14680067;
 //BA.debugLineNum = 14680067;BA.debugLine="Api = r.GetStaticField(\"android.os.Build$VERSION\"";
_api = (int)(BA.ObjectToNumber(_r.GetStaticField("android.os.Build$VERSION","SDK_INT")));
RDebugUtils.currentLine=14680068;
 //BA.debugLineNum = 14680068;BA.debugLine="Return Api";
if (true) return _api;
RDebugUtils.currentLine=14680069;
 //BA.debugLineNum = 14680069;BA.debugLine="End Sub";
return 0;
}
public static String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="mcode";
if (Debug.shouldDelegate(null, "initialize", false))
	 {return ((String) Debug.delegate(null, "initialize", new Object[] {_ba}));}
de.amberhome.objects.appcompat.AppCompatBase _ac = null;
RDebugUtils.currentLine=12976128;
 //BA.debugLineNum = 12976128;BA.debugLine="Sub Initialize";
RDebugUtils.currentLine=12976129;
 //BA.debugLineNum = 12976129;BA.debugLine="If Not(File.Exists(File.DirDefaultExternal,\"Parsi";
if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"Parsik"))) { 
RDebugUtils.currentLine=12976130;
 //BA.debugLineNum = 12976130;BA.debugLine="File.MakeDir(File.DirDefaultExternal,\"Parsik\")";
anywheresoftware.b4a.keywords.Common.File.MakeDir(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"Parsik");
 };
RDebugUtils.currentLine=12976132;
 //BA.debugLineNum = 12976132;BA.debugLine="If Not(File.Exists(File.DirDefaultExternal,\"Parsi";
if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"Parsik"))) { 
RDebugUtils.currentLine=12976133;
 //BA.debugLineNum = 12976133;BA.debugLine="File.MakeDir(File.DirDefaultExternal,\"Parsik\")";
anywheresoftware.b4a.keywords.Common.File.MakeDir(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"Parsik");
RDebugUtils.currentLine=12976134;
 //BA.debugLineNum = 12976134;BA.debugLine="File.Copy(File.DirAssets,\"parsik_db.db\",File.Dir";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"parsik_db.db",anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal()+"/Parsik","parsik_db.db");
RDebugUtils.currentLine=12976135;
 //BA.debugLineNum = 12976135;BA.debugLine="File.MakeDir(File.DirDefaultExternal &\"/Parsik\",";
anywheresoftware.b4a.keywords.Common.File.MakeDir(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal()+"/Parsik","AksKala");
RDebugUtils.currentLine=12976136;
 //BA.debugLineNum = 12976136;BA.debugLine="File.MakeDir(File.DirDefaultExternal &\"/Parsik\",";
anywheresoftware.b4a.keywords.Common.File.MakeDir(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal()+"/Parsik","GalleryKala");
RDebugUtils.currentLine=12976137;
 //BA.debugLineNum = 12976137;BA.debugLine="File.MakeDir(File.DirDefaultExternal &\"/Parsik\",";
anywheresoftware.b4a.keywords.Common.File.MakeDir(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal()+"/Parsik","pdf");
RDebugUtils.currentLine=12976138;
 //BA.debugLineNum = 12976138;BA.debugLine="File.MakeDir(File.DirDefaultExternal &\"/Parsik\",";
anywheresoftware.b4a.keywords.Common.File.MakeDir(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal()+"/Parsik","Signature");
RDebugUtils.currentLine=12976139;
 //BA.debugLineNum = 12976139;BA.debugLine="File.MakeDir(File.DirDefaultExternal &\"/Parsik\",";
anywheresoftware.b4a.keywords.Common.File.MakeDir(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal()+"/Parsik","Backup");
RDebugUtils.currentLine=12976140;
 //BA.debugLineNum = 12976140;BA.debugLine="File.WriteString(File.DirDefaultExternal &\"/Pars";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal()+"/Parsik/Backup","backlist.txt","");
RDebugUtils.currentLine=12976141;
 //BA.debugLineNum = 12976141;BA.debugLine="File.WriteString(File.DirDefaultExternal &\"/Pars";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal()+"/Parsik/Backup","log.txt","");
 }else 
{RDebugUtils.currentLine=12976143;
 //BA.debugLineNum = 12976143;BA.debugLine="Else if File.Exists(File.DirDefaultExternal, \"Par";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"Parsik")==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=12976144;
 //BA.debugLineNum = 12976144;BA.debugLine="If Not(File.Exists(File.DirDefaultExternal & \"/P";
if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal()+"/Parsik","parsik_db.db"))) { 
RDebugUtils.currentLine=12976145;
 //BA.debugLineNum = 12976145;BA.debugLine="File.Copy(File.DirAssets,\"parsik_db.db\",File.Di";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"parsik_db.db",anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal()+"/Parsik","parsik_db.db");
 };
RDebugUtils.currentLine=12976147;
 //BA.debugLineNum = 12976147;BA.debugLine="If Not(File.Exists(File.DirDefaultExternal &\"/Pa";
if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal()+"/Parsik","AksKala"))) { 
RDebugUtils.currentLine=12976148;
 //BA.debugLineNum = 12976148;BA.debugLine="File.MakeDir(File.DirDefaultExternal &\"/Parsik\"";
anywheresoftware.b4a.keywords.Common.File.MakeDir(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal()+"/Parsik","AksKala");
 };
RDebugUtils.currentLine=12976150;
 //BA.debugLineNum = 12976150;BA.debugLine="If Not(File.Exists(File.DirDefaultExternal &\"/Pa";
if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal()+"/Parsik","GalleryKala"))) { 
RDebugUtils.currentLine=12976151;
 //BA.debugLineNum = 12976151;BA.debugLine="File.MakeDir(File.DirDefaultExternal &\"/Parsik\"";
anywheresoftware.b4a.keywords.Common.File.MakeDir(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal()+"/Parsik","GalleryKala");
 };
RDebugUtils.currentLine=12976153;
 //BA.debugLineNum = 12976153;BA.debugLine="If Not(File.Exists(File.DirDefaultExternal &\"/Pa";
if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal()+"/Parsik","pdf"))) { 
RDebugUtils.currentLine=12976154;
 //BA.debugLineNum = 12976154;BA.debugLine="File.MakeDir(File.DirDefaultExternal &\"/Parsik\"";
anywheresoftware.b4a.keywords.Common.File.MakeDir(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal()+"/Parsik","pdf");
 };
RDebugUtils.currentLine=12976156;
 //BA.debugLineNum = 12976156;BA.debugLine="If Not(File.Exists(File.DirDefaultExternal &\"/Pa";
if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal()+"/Parsik","Signature"))) { 
RDebugUtils.currentLine=12976157;
 //BA.debugLineNum = 12976157;BA.debugLine="File.MakeDir(File.DirDefaultExternal &\"/Parsik\"";
anywheresoftware.b4a.keywords.Common.File.MakeDir(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal()+"/Parsik","Signature");
 };
RDebugUtils.currentLine=12976159;
 //BA.debugLineNum = 12976159;BA.debugLine="If Not(File.Exists(File.DirDefaultExternal &\"/Pa";
if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal()+"/Parsik","Backup"))) { 
RDebugUtils.currentLine=12976160;
 //BA.debugLineNum = 12976160;BA.debugLine="File.MakeDir(File.DirDefaultExternal &\"/Parsik\"";
anywheresoftware.b4a.keywords.Common.File.MakeDir(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal()+"/Parsik","Backup");
RDebugUtils.currentLine=12976161;
 //BA.debugLineNum = 12976161;BA.debugLine="File.WriteString(File.DirDefaultExternal &\"/Par";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal()+"/Parsik/Backup","backlist.txt","");
RDebugUtils.currentLine=12976162;
 //BA.debugLineNum = 12976162;BA.debugLine="File.WriteString(File.DirDefaultExternal &\"/Par";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal()+"/Parsik/Backup","log.txt","");
 };
 }}
;
RDebugUtils.currentLine=12976166;
 //BA.debugLineNum = 12976166;BA.debugLine="Dim ac As AppCompat";
_ac = new de.amberhome.objects.appcompat.AppCompatBase();
RDebugUtils.currentLine=12976167;
 //BA.debugLineNum = 12976167;BA.debugLine="colorPrimary=ac.GetThemeAttribute(\"colorPrimary\")";
_colorprimary = _ac.GetThemeAttribute(_ba,"colorPrimary");
RDebugUtils.currentLine=12976168;
 //BA.debugLineNum = 12976168;BA.debugLine="colorPrimaryDark=ac.GetThemeAttribute(\"colorPrima";
_colorprimarydark = _ac.GetThemeAttribute(_ba,"colorPrimaryDark");
RDebugUtils.currentLine=12976169;
 //BA.debugLineNum = 12976169;BA.debugLine="colorAccent=ac.GetThemeAttribute(\"colorAccent\")";
_coloraccent = _ac.GetThemeAttribute(_ba,"colorAccent");
RDebugUtils.currentLine=12976170;
 //BA.debugLineNum = 12976170;BA.debugLine="Log(colorPrimary)";
anywheresoftware.b4a.keywords.Common.LogImpl("512976170",BA.NumberToString(_colorprimary),0);
RDebugUtils.currentLine=12976171;
 //BA.debugLineNum = 12976171;BA.debugLine="Log(colorPrimaryDark)";
anywheresoftware.b4a.keywords.Common.LogImpl("512976171",BA.NumberToString(_colorprimarydark),0);
RDebugUtils.currentLine=12976172;
 //BA.debugLineNum = 12976172;BA.debugLine="Log(colorAccent)";
anywheresoftware.b4a.keywords.Common.LogImpl("512976172",BA.NumberToString(_coloraccent),0);
RDebugUtils.currentLine=12976173;
 //BA.debugLineNum = 12976173;BA.debugLine="Sql1.Initialize(File.DirDefaultExternal &\"/Parsi";
_sql1.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal()+"/Parsik","parsik_db.db",anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=12976177;
 //BA.debugLineNum = 12976177;BA.debugLine="Url=\"zomorodonline.ir\"";
_url = "zomorodonline.ir";
RDebugUtils.currentLine=12976178;
 //BA.debugLineNum = 12976178;BA.debugLine="lstChangeFeeKala.Initialize";
_lstchangefeekala.Initialize();
RDebugUtils.currentLine=12976179;
 //BA.debugLineNum = 12976179;BA.debugLine="receiver2.Initialize(\"receiver2\")";
_receiver2.Initialize((_ba.processBA == null ? _ba : _ba.processBA),"receiver2");
RDebugUtils.currentLine=12976180;
 //BA.debugLineNum = 12976180;BA.debugLine="receiver2.AddAction(PackageNamePosParsian &\".ACTI";
_receiver2.AddAction(_packagenameposparsian+".ACTION_RESULT");
RDebugUtils.currentLine=12976182;
 //BA.debugLineNum = 12976182;BA.debugLine="receiver2.SetPriority(1)";
_receiver2.SetPriority((int) (1));
RDebugUtils.currentLine=12976183;
 //BA.debugLineNum = 12976183;BA.debugLine="receiver2.RegisterReceiver";
_receiver2.RegisterReceiver();
RDebugUtils.currentLine=12976184;
 //BA.debugLineNum = 12976184;BA.debugLine="End Sub";
return "";
}
public static String  _updatedatabase(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="mcode";
if (Debug.shouldDelegate(null, "updatedatabase", false))
	 {return ((String) Debug.delegate(null, "updatedatabase", new Object[] {_ba}));}
RDebugUtils.currentLine=13565952;
 //BA.debugLineNum = 13565952;BA.debugLine="Sub UpdateDataBase";
RDebugUtils.currentLine=13565954;
 //BA.debugLineNum = 13565954;BA.debugLine="MDatabase.CreateDataBaseNewTable";
mostCurrent._mdatabase._createdatabasenewtable /*String*/ (_ba);
RDebugUtils.currentLine=13565955;
 //BA.debugLineNum = 13565955;BA.debugLine="MDatabase.UpdateDataBaseSetting";
mostCurrent._mdatabase._updatedatabasesetting /*String*/ (_ba);
RDebugUtils.currentLine=13565956;
 //BA.debugLineNum = 13565956;BA.debugLine="MDatabase.UpdateDataBaseKala";
mostCurrent._mdatabase._updatedatabasekala /*String*/ (_ba);
RDebugUtils.currentLine=13565957;
 //BA.debugLineNum = 13565957;BA.debugLine="MDatabase.UpdateDataBaseAshkhas";
mostCurrent._mdatabase._updatedatabaseashkhas /*String*/ (_ba);
RDebugUtils.currentLine=13565958;
 //BA.debugLineNum = 13565958;BA.debugLine="MDatabase.UpdateDataBaseSabad";
mostCurrent._mdatabase._updatedatabasesabad /*String*/ (_ba);
RDebugUtils.currentLine=13565959;
 //BA.debugLineNum = 13565959;BA.debugLine="MDatabase.UpdateDataBaseFactor";
mostCurrent._mdatabase._updatedatabasefactor /*String*/ (_ba);
RDebugUtils.currentLine=13565960;
 //BA.debugLineNum = 13565960;BA.debugLine="MDatabase.UpdateDataBaseDaryaft";
mostCurrent._mdatabase._updatedatabasedaryaft /*String*/ (_ba);
RDebugUtils.currentLine=13565961;
 //BA.debugLineNum = 13565961;BA.debugLine="MDatabase.UpdateDataBaseEnterExitVisitor";
mostCurrent._mdatabase._updatedatabaseenterexitvisitor /*String*/ (_ba);
RDebugUtils.currentLine=13565962;
 //BA.debugLineNum = 13565962;BA.debugLine="MDatabase.UpdateDataBaseGpsVisitor";
mostCurrent._mdatabase._updatedatabasegpsvisitor /*String*/ (_ba);
RDebugUtils.currentLine=13565963;
 //BA.debugLineNum = 13565963;BA.debugLine="MDatabase.UpdateDataBaseHavale";
mostCurrent._mdatabase._updatedatabasehavale /*String*/ (_ba);
RDebugUtils.currentLine=13565964;
 //BA.debugLineNum = 13565964;BA.debugLine="MDatabase.UpdateDataBaseAshkhasNew";
mostCurrent._mdatabase._updatedatabaseashkhasnew /*String*/ (_ba);
RDebugUtils.currentLine=13565966;
 //BA.debugLineNum = 13565966;BA.debugLine="Sql1.ExecNonQuery(\"Update TblSetting Set FldVersi";
_sql1.ExecNonQuery("Update TblSetting Set FldVersion = '"+_version+"'");
RDebugUtils.currentLine=13565967;
 //BA.debugLineNum = 13565967;BA.debugLine="SaveUpdate(\"Update TblSetting Set FldUrl = 'zomor";
_saveupdate(_ba,"Update TblSetting Set FldUrl = 'zomorodonline.ir'");
RDebugUtils.currentLine=13565968;
 //BA.debugLineNum = 13565968;BA.debugLine="Initialize";
_initialize(_ba);
RDebugUtils.currentLine=13565969;
 //BA.debugLineNum = 13565969;BA.debugLine="End Sub";
return "";
}
public static String  _updatesetting(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="mcode";
if (Debug.shouldDelegate(null, "updatesetting", false))
	 {return ((String) Debug.delegate(null, "updatesetting", new Object[] {_ba}));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
RDebugUtils.currentLine=13041664;
 //BA.debugLineNum = 13041664;BA.debugLine="Sub UpdateSetting";
RDebugUtils.currentLine=13041665;
 //BA.debugLineNum = 13041665;BA.debugLine="Dim Cu As Cursor = Result(\"Select * From TblSetti";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = _result(_ba,"Select * From TblSetting");
RDebugUtils.currentLine=13041666;
 //BA.debugLineNum = 13041666;BA.debugLine="Cu.Position=0";
_cu.setPosition((int) (0));
RDebugUtils.currentLine=13041672;
 //BA.debugLineNum = 13041672;BA.debugLine="Gps= Cu.GetString(\"FldGps\")";
_gps = _cu.GetString("FldGps");
RDebugUtils.currentLine=13041673;
 //BA.debugLineNum = 13041673;BA.debugLine="ServiceGpsActive = Cu.GetString(\"FldGps\")";
_servicegpsactive = (int)(Double.parseDouble(_cu.GetString("FldGps")));
RDebugUtils.currentLine=13041674;
 //BA.debugLineNum = 13041674;BA.debugLine="RaghamAshar = Cu.GetString(\"FldRound\")";
_raghamashar = _cu.GetString("FldRound");
RDebugUtils.currentLine=13041675;
 //BA.debugLineNum = 13041675;BA.debugLine="VahedPool = Cu.GetString(\"FldVahedPool\")";
_vahedpool = _cu.GetString("FldVahedPool");
RDebugUtils.currentLine=13041677;
 //BA.debugLineNum = 13041677;BA.debugLine="C_Visitor = Cu.GetString(\"FldC_Visitor\")";
_c_visitor = _cu.GetString("FldC_Visitor");
RDebugUtils.currentLine=13041678;
 //BA.debugLineNum = 13041678;BA.debugLine="N_Visitor = Cu.GetString(\"FldN_Visitor\")";
_n_visitor = _cu.GetString("FldN_Visitor");
RDebugUtils.currentLine=13041679;
 //BA.debugLineNum = 13041679;BA.debugLine="Url = Cu.GetString(\"FldUrl\")";
_url = _cu.GetString("FldUrl");
RDebugUtils.currentLine=13041680;
 //BA.debugLineNum = 13041680;BA.debugLine="kalamanfi = Cu.GetString(\"FldKalaManfi\")";
_kalamanfi = _cu.GetString("FldKalaManfi");
RDebugUtils.currentLine=13041681;
 //BA.debugLineNum = 13041681;BA.debugLine="ForooshBishAzMojoodi=kalamanfi";
_forooshbishazmojoodi = _kalamanfi;
RDebugUtils.currentLine=13041682;
 //BA.debugLineNum = 13041682;BA.debugLine="KharidBiashAz=kalamanfi";
_kharidbiashaz = _kalamanfi;
RDebugUtils.currentLine=13041683;
 //BA.debugLineNum = 13041683;BA.debugLine="TaghirFeeKala = Cu.GetString(\"FldTaghirFeeKala\")";
_taghirfeekala = _cu.GetString("FldTaghirFeeKala");
RDebugUtils.currentLine=13041684;
 //BA.debugLineNum = 13041684;BA.debugLine="NamayeshKalaSefr = Cu.GetString(\"FldNamayeshKalaS";
_namayeshkalasefr = _cu.GetString("FldNamayeshKalaSefr");
RDebugUtils.currentLine=13041685;
 //BA.debugLineNum = 13041685;BA.debugLine="DastrasiGroupKala =myCode.Is_Null_adad(Cu.GetStri";
_dastrasigroupkala = (int)(Double.parseDouble(mostCurrent._mycode._is_null_adad /*String*/ (_ba,_cu.GetString("FldDastrasiKala"))));
RDebugUtils.currentLine=13041686;
 //BA.debugLineNum = 13041686;BA.debugLine="ArzeshAfzodeEnable=Cu.GetString(\"fldArzeshAfzodeE";
_arzeshafzodeenable = _cu.GetString("fldArzeshAfzodeEnable");
RDebugUtils.currentLine=13041687;
 //BA.debugLineNum = 13041687;BA.debugLine="ArzeshAfzode =myCode.Is_Null_adad(Cu.GetString(\"f";
_arzeshafzode = mostCurrent._mycode._is_null_adad /*String*/ (_ba,_cu.GetString("fldArzeshAfzode"));
RDebugUtils.currentLine=13041688;
 //BA.debugLineNum = 13041688;BA.debugLine="Log(\"ارزش افزوده: \"&ArzeshAfzode)";
anywheresoftware.b4a.keywords.Common.LogImpl("513041688","ارزش افزوده: "+_arzeshafzode,0);
RDebugUtils.currentLine=13041690;
 //BA.debugLineNum = 13041690;BA.debugLine="Log(\"DastrasiGroupKala= \"&DastrasiGroupKala)";
anywheresoftware.b4a.keywords.Common.LogImpl("513041690","DastrasiGroupKala= "+BA.NumberToString(_dastrasigroupkala),0);
RDebugUtils.currentLine=13041691;
 //BA.debugLineNum = 13041691;BA.debugLine="DastrasiGroupAshkhas =myCode.Is_Null_adad(Cu.GetS";
_dastrasigroupashkhas = (int)(Double.parseDouble(mostCurrent._mycode._is_null_adad /*String*/ (_ba,_cu.GetString("FldDastrasiAshkhas"))));
RDebugUtils.currentLine=13041692;
 //BA.debugLineNum = 13041692;BA.debugLine="Log(\"DastrsiGroupAshkhas= \"&DastrasiGroupAshkhas)";
anywheresoftware.b4a.keywords.Common.LogImpl("513041692","DastrsiGroupAshkhas= "+BA.NumberToString(_dastrasigroupashkhas),0);
RDebugUtils.currentLine=13041693;
 //BA.debugLineNum = 13041693;BA.debugLine="CodeMoshtari=Cu.GetString(\"FldCodeMoshtari\")";
_codemoshtari = _cu.GetString("FldCodeMoshtari");
RDebugUtils.currentLine=13041696;
 //BA.debugLineNum = 13041696;BA.debugLine="Log(Cu.GetString(\"FldSaveFactorInLocation\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("513041696",_cu.GetString("FldSaveFactorInLocation"),0);
RDebugUtils.currentLine=13041697;
 //BA.debugLineNum = 13041697;BA.debugLine="If Cu.GetString(\"FldSaveFactorInLocation\")=\"0\" Th";
if ((_cu.GetString("FldSaveFactorInLocation")).equals("0")) { 
RDebugUtils.currentLine=13041698;
 //BA.debugLineNum = 13041698;BA.debugLine="SaveFactorInLocation=False";
_savefactorinlocation = anywheresoftware.b4a.keywords.Common.False;
 }else {
RDebugUtils.currentLine=13041700;
 //BA.debugLineNum = 13041700;BA.debugLine="SaveFactorInLocation=True";
_savefactorinlocation = anywheresoftware.b4a.keywords.Common.True;
 };
RDebugUtils.currentLine=13041702;
 //BA.debugLineNum = 13041702;BA.debugLine="Log(Cu.GetString(\"FldMasafat\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("513041702",_cu.GetString("FldMasafat"),0);
RDebugUtils.currentLine=13041703;
 //BA.debugLineNum = 13041703;BA.debugLine="Masafat=Cu.GetString(\"FldMasafat\")";
_masafat = (long)(Double.parseDouble(_cu.GetString("FldMasafat")));
RDebugUtils.currentLine=13041704;
 //BA.debugLineNum = 13041704;BA.debugLine="PrinterType=Cu.GetInt(\"FldPrinterType\")";
_printertype = _cu.GetInt("FldPrinterType");
RDebugUtils.currentLine=13041705;
 //BA.debugLineNum = 13041705;BA.debugLine="Vaziat=myCode.Is_Null_adad(Cu.GetString(\"FldVazia";
_vaziat = (int)(Double.parseDouble(mostCurrent._mycode._is_null_adad /*String*/ (_ba,_cu.GetString("FldVaziat"))));
RDebugUtils.currentLine=13041707;
 //BA.debugLineNum = 13041707;BA.debugLine="If Cu.GetString(\"FldDateTimeRecive\")<>Null Then";
if (_cu.GetString("FldDateTimeRecive")!= null) { 
RDebugUtils.currentLine=13041708;
 //BA.debugLineNum = 13041708;BA.debugLine="DateTimeRecive=Cu.GetString(\"FldDateTimeRecive\")";
_datetimerecive = _cu.GetString("FldDateTimeRecive");
 }else {
RDebugUtils.currentLine=13041710;
 //BA.debugLineNum = 13041710;BA.debugLine="DateTimeRecive=0";
_datetimerecive = BA.NumberToString(0);
 };
RDebugUtils.currentLine=13041712;
 //BA.debugLineNum = 13041712;BA.debugLine="If Cu.GetString(\"FldDateTimeSend\")<>Null Then";
if (_cu.GetString("FldDateTimeSend")!= null) { 
RDebugUtils.currentLine=13041713;
 //BA.debugLineNum = 13041713;BA.debugLine="DateTimeSend=Cu.GetString(\"FldDateTimeSend\")";
_datetimesend = _cu.GetString("FldDateTimeSend");
 }else {
RDebugUtils.currentLine=13041715;
 //BA.debugLineNum = 13041715;BA.debugLine="DateTimeSend=0";
_datetimesend = BA.NumberToString(0);
 };
RDebugUtils.currentLine=13041720;
 //BA.debugLineNum = 13041720;BA.debugLine="TakhfifKala = Cu.GetString(\"FldTakhfifKala\")";
_takhfifkala = _cu.GetString("FldTakhfifKala");
RDebugUtils.currentLine=13041721;
 //BA.debugLineNum = 13041721;BA.debugLine="HideMojodi = Cu.GetString(\"FldHideMojodi\")";
_hidemojodi = _cu.GetString("FldHideMojodi");
RDebugUtils.currentLine=13041722;
 //BA.debugLineNum = 13041722;BA.debugLine="Admin = Cu.GetString(\"FldAdmin\")";
_admin = _cu.GetString("FldAdmin");
RDebugUtils.currentLine=13041723;
 //BA.debugLineNum = 13041723;BA.debugLine="CheckAdmin = Cu.GetString(\"FldCheckAdmin\")";
_checkadmin = _cu.GetString("FldCheckAdmin");
RDebugUtils.currentLine=13041724;
 //BA.debugLineNum = 13041724;BA.debugLine="Tozie = Cu.GetString(\"FldTozie\")";
_tozie = _cu.GetString("FldTozie");
RDebugUtils.currentLine=13041726;
 //BA.debugLineNum = 13041726;BA.debugLine="Visitor = Cu.GetString(\"FldVisitor\")";
_visitor = _cu.GetString("FldVisitor");
RDebugUtils.currentLine=13041727;
 //BA.debugLineNum = 13041727;BA.debugLine="SendMarjoie = Cu.GetString(\"FldSendMarjoie\")";
_sendmarjoie = _cu.GetString("FldSendMarjoie");
RDebugUtils.currentLine=13041728;
 //BA.debugLineNum = 13041728;BA.debugLine="PicOnline = Cu.GetString(\"FldPicOnline\")";
_piconline = _cu.GetString("FldPicOnline");
RDebugUtils.currentLine=13041729;
 //BA.debugLineNum = 13041729;BA.debugLine="Daryaft =myCode.Is_Null_adad(Cu.GetString(\"FldDar";
_daryaft = mostCurrent._mycode._is_null_adad /*String*/ (_ba,_cu.GetString("FldDaryaft"));
RDebugUtils.currentLine=13041730;
 //BA.debugLineNum = 13041730;BA.debugLine="Amani =myCode.Is_Null_adad(Cu.GetString(\"FldAmani";
_amani = mostCurrent._mycode._is_null_adad /*String*/ (_ba,_cu.GetString("FldAmani"));
RDebugUtils.currentLine=13041731;
 //BA.debugLineNum = 13041731;BA.debugLine="MojavezSefaresh =myCode.Is_Null_adad(Cu.GetString";
_mojavezsefaresh = mostCurrent._mycode._is_null_adad /*String*/ (_ba,_cu.GetString("FldMojavezSefaresh"));
RDebugUtils.currentLine=13041732;
 //BA.debugLineNum = 13041732;BA.debugLine="GetDataOnline=myCode.Is_Null_adad(Cu.GetString(\"F";
_getdataonline = mostCurrent._mycode._is_null_adad /*String*/ (_ba,_cu.GetString("FldGetDataOnline"));
RDebugUtils.currentLine=13041733;
 //BA.debugLineNum = 13041733;BA.debugLine="ConnectionStatus=myCode.Is_Null_adad(Cu.GetString";
_connectionstatus = mostCurrent._mycode._is_null_adad /*String*/ (_ba,_cu.GetString("FldConnectionStatus"));
RDebugUtils.currentLine=13041734;
 //BA.debugLineNum = 13041734;BA.debugLine="GetDataOnline=0";
_getdataonline = BA.NumberToString(0);
RDebugUtils.currentLine=13041735;
 //BA.debugLineNum = 13041735;BA.debugLine="If	PicOnline=1 Then";
if ((_piconline).equals(BA.NumberToString(1))) { 
RDebugUtils.currentLine=13041736;
 //BA.debugLineNum = 13041736;BA.debugLine="ImageUrl=Cu.GetString(\"FldLinkPicKala\")";
_imageurl = _cu.GetString("FldLinkPicKala");
 };
RDebugUtils.currentLine=13041740;
 //BA.debugLineNum = 13041740;BA.debugLine="IntervalGps=Cu.GetString(\"FldIntervalGps\")";
_intervalgps = (int)(Double.parseDouble(_cu.GetString("FldIntervalGps")));
RDebugUtils.currentLine=13041741;
 //BA.debugLineNum = 13041741;BA.debugLine="EshantionTabaghati=myCode.Is_Null_adad(Cu.GetStri";
_eshantiontabaghati = mostCurrent._mycode._is_null_adad /*String*/ (_ba,_cu.GetString("FldEshantionTabaghati"));
RDebugUtils.currentLine=13041742;
 //BA.debugLineNum = 13041742;BA.debugLine="EshantionRemove=myCode.Is_Null_adad(Cu.GetString(";
_eshantionremove = mostCurrent._mycode._is_null_adad /*String*/ (_ba,_cu.GetString("FldEshantionRemove"));
RDebugUtils.currentLine=13041743;
 //BA.debugLineNum = 13041743;BA.debugLine="EshantionGroup=myCode.Is_Null_adad(Cu.GetString(\"";
_eshantiongroup = mostCurrent._mycode._is_null_adad /*String*/ (_ba,_cu.GetString("FldEshantionGroup"));
RDebugUtils.currentLine=13041745;
 //BA.debugLineNum = 13041745;BA.debugLine="CompanyName=myCode.Is_Null(Cu.GetString(\"FldNameC";
_companyname = mostCurrent._mycode._is_null /*String*/ (_ba,_cu.GetString("FldNameCompany"));
RDebugUtils.currentLine=13041746;
 //BA.debugLineNum = 13041746;BA.debugLine="CompanyTell=myCode.Is_Null(Cu.GetString(\"FldTellC";
_companytell = mostCurrent._mycode._is_null /*String*/ (_ba,_cu.GetString("FldTellCompany"));
RDebugUtils.currentLine=13041747;
 //BA.debugLineNum = 13041747;BA.debugLine="CompanyAddress=myCode.Is_Null(Cu.GetString(\"FldAd";
_companyaddress = mostCurrent._mycode._is_null /*String*/ (_ba,_cu.GetString("FldAddressCompany"));
RDebugUtils.currentLine=13041748;
 //BA.debugLineNum = 13041748;BA.debugLine="MobileIsImportent=myCode.Is_Null_adad(Cu.GetStrin";
_mobileisimportent = mostCurrent._mycode._is_null_adad /*String*/ (_ba,_cu.GetString("FldMobileIsImportent"));
RDebugUtils.currentLine=13041749;
 //BA.debugLineNum = 13041749;BA.debugLine="TourVisit=1";
_tourvisit = BA.NumberToString(1);
RDebugUtils.currentLine=13041756;
 //BA.debugLineNum = 13041756;BA.debugLine="Log(\"Gps Start\")";
anywheresoftware.b4a.keywords.Common.LogImpl("513041756","Gps Start",0);
RDebugUtils.currentLine=13041757;
 //BA.debugLineNum = 13041757;BA.debugLine="End Sub";
return "";
}
public static String  _animationclose(anywheresoftware.b4a.BA _ba,Object _view) throws Exception{
RDebugUtils.currentModule="mcode";
if (Debug.shouldDelegate(null, "animationclose", false))
	 {return ((String) Debug.delegate(null, "animationclose", new Object[] {_ba,_view}));}
anywheresoftware.b4a.objects.AnimationWrapper _ani = null;
RDebugUtils.currentLine=13893632;
 //BA.debugLineNum = 13893632;BA.debugLine="Sub AnimationClose(View As Object)";
RDebugUtils.currentLine=13893633;
 //BA.debugLineNum = 13893633;BA.debugLine="Dim Ani As Animation";
_ani = new anywheresoftware.b4a.objects.AnimationWrapper();
RDebugUtils.currentLine=13893634;
 //BA.debugLineNum = 13893634;BA.debugLine="Ani.InitializeScaleCenter(\"\", 1,1,0,0, View)";
_ani.InitializeScaleCenter(_ba,"",(float) (1),(float) (1),(float) (0),(float) (0),(android.view.View)(_view));
RDebugUtils.currentLine=13893635;
 //BA.debugLineNum = 13893635;BA.debugLine="Ani.Duration = 300";
_ani.setDuration((long) (300));
RDebugUtils.currentLine=13893636;
 //BA.debugLineNum = 13893636;BA.debugLine="Ani.Start(View)";
_ani.Start((android.view.View)(_view));
RDebugUtils.currentLine=13893637;
 //BA.debugLineNum = 13893637;BA.debugLine="End Sub";
return "";
}
public static String  _animationopen(anywheresoftware.b4a.BA _ba,Object _view) throws Exception{
RDebugUtils.currentModule="mcode";
if (Debug.shouldDelegate(null, "animationopen", false))
	 {return ((String) Debug.delegate(null, "animationopen", new Object[] {_ba,_view}));}
anywheresoftware.b4a.objects.AnimationWrapper _ani = null;
RDebugUtils.currentLine=13828096;
 //BA.debugLineNum = 13828096;BA.debugLine="Sub AnimationOpen(View As Object)";
RDebugUtils.currentLine=13828097;
 //BA.debugLineNum = 13828097;BA.debugLine="Dim Ani As Animation";
_ani = new anywheresoftware.b4a.objects.AnimationWrapper();
RDebugUtils.currentLine=13828098;
 //BA.debugLineNum = 13828098;BA.debugLine="Ani.InitializeScaleCenter(\"\", 0,0,1,1, View)";
_ani.InitializeScaleCenter(_ba,"",(float) (0),(float) (0),(float) (1),(float) (1),(android.view.View)(_view));
RDebugUtils.currentLine=13828099;
 //BA.debugLineNum = 13828099;BA.debugLine="Ani.Duration = 300";
_ani.setDuration((long) (300));
RDebugUtils.currentLine=13828100;
 //BA.debugLineNum = 13828100;BA.debugLine="Ani.Start(View)";
_ani.Start((android.view.View)(_view));
RDebugUtils.currentLine=13828101;
 //BA.debugLineNum = 13828101;BA.debugLine="End Sub";
return "";
}
public static void  _createbk(anywheresoftware.b4a.BA _ba,String _namefile) throws Exception{
RDebugUtils.currentModule="mcode";
if (Debug.shouldDelegate(null, "createbk", false))
	 {Debug.delegate(null, "createbk", new Object[] {_ba,_namefile}); return;}
ResumableSub_CreateBK rsub = new ResumableSub_CreateBK(null,_ba,_namefile);
rsub.resume((_ba.processBA == null ? _ba : _ba.processBA), null);
}
public static class ResumableSub_CreateBK extends BA.ResumableSub {
public ResumableSub_CreateBK(ir.parsikhesab.pakhsh.mcode parent,anywheresoftware.b4a.BA _ba,String _namefile) {
this.parent = parent;
this._ba = _ba;
this._namefile = _namefile;
}
ir.parsikhesab.pakhsh.mcode parent;
anywheresoftware.b4a.BA _ba;
String _namefile;
String _filename = "";
String _date = "";
String _time = "";
anywheresoftware.b4a.objects.collections.List _list1 = null;
ir.parsikhesab.pakhsh.mcode._adapterlistbackupfile _backitem = null;
String _str = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="mcode";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=13172737;
 //BA.debugLineNum = 13172737;BA.debugLine="Dim FileName As String";
_filename = "";
RDebugUtils.currentLine=13172738;
 //BA.debugLineNum = 13172738;BA.debugLine="Dim Date As String=PersianDateDash(DatePersian)";
_date = _persiandatedash(_ba,_datepersian(_ba));
RDebugUtils.currentLine=13172739;
 //BA.debugLineNum = 13172739;BA.debugLine="Dim Time As String=DateTime.Time(DateTime.Now)";
_time = anywheresoftware.b4a.keywords.Common.DateTime.Time(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
RDebugUtils.currentLine=13172740;
 //BA.debugLineNum = 13172740;BA.debugLine="If namefile<>\"\" Then";
if (true) break;

case 1:
//if
this.state = 6;
if ((_namefile).equals("") == false) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=13172741;
 //BA.debugLineNum = 13172741;BA.debugLine="FileName=namefile";
_filename = _namefile;
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=13172743;
 //BA.debugLineNum = 13172743;BA.debugLine="FileName=\"bk\"&DateTime.Date(DateTime.Now)&DateTi";
_filename = "bk"+anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.getNow())+anywheresoftware.b4a.keywords.Common.DateTime.Time(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
RDebugUtils.currentLine=13172744;
 //BA.debugLineNum = 13172744;BA.debugLine="FileName=FileName.Replace(\":\",\"\")";
_filename = _filename.replace(":","");
RDebugUtils.currentLine=13172745;
 //BA.debugLineNum = 13172745;BA.debugLine="FileName=FileName.Replace(\"/\",\"\")";
_filename = _filename.replace("/","");
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=13172747;
 //BA.debugLineNum = 13172747;BA.debugLine="Dim List1 As List";
_list1 = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=13172748;
 //BA.debugLineNum = 13172748;BA.debugLine="Dim backitem As AdapterListBackupFile";
_backitem = new ir.parsikhesab.pakhsh.mcode._adapterlistbackupfile();
RDebugUtils.currentLine=13172749;
 //BA.debugLineNum = 13172749;BA.debugLine="backitem.Initialize";
_backitem.Initialize();
RDebugUtils.currentLine=13172750;
 //BA.debugLineNum = 13172750;BA.debugLine="List1.Initialize";
_list1.Initialize();
RDebugUtils.currentLine=13172753;
 //BA.debugLineNum = 13172753;BA.debugLine="If File.Exists(File.DirDefaultExternal,\"Parsik/B";
if (true) break;

case 7:
//if
this.state = 10;
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"Parsik/Backup")==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=13172754;
 //BA.debugLineNum = 13172754;BA.debugLine="File.MakeDir(File.DirDefaultExternal,\"Parsik/Bac";
anywheresoftware.b4a.keywords.Common.File.MakeDir(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"Parsik/Backup");
RDebugUtils.currentLine=13172755;
 //BA.debugLineNum = 13172755;BA.debugLine="File.Copy(File.DirAssets,\"backlist.txt\",File.Dir";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"backlist.txt",anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal()+"/Parsik/Backup","backlist.txt");
 if (true) break;
;
RDebugUtils.currentLine=13172758;
 //BA.debugLineNum = 13172758;BA.debugLine="If File.Exists(File.DirDefaultExternal,\"Parsik/Ba";

case 10:
//if
this.state = 15;
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"Parsik/Backup/backlist.txt")==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 15;
RDebugUtils.currentLine=13172759;
 //BA.debugLineNum = 13172759;BA.debugLine="File.Copy(File.DirAssets,\"backlist.txt\",File.Dir";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"backlist.txt",anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal()+"/Parsik/Backup","backlist.txt");
 if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=13172761;
 //BA.debugLineNum = 13172761;BA.debugLine="List1 = File.ReadList(File.DirDefaultExternal &\"";
_list1 = anywheresoftware.b4a.keywords.Common.File.ReadList(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal()+"/Parsik/Backup","backlist.txt");
 if (true) break;

case 15:
//C
this.state = -1;
;
RDebugUtils.currentLine=13172765;
 //BA.debugLineNum = 13172765;BA.debugLine="backitem.FileName=FileName";
_backitem.FileName /*String*/  = _filename;
RDebugUtils.currentLine=13172766;
 //BA.debugLineNum = 13172766;BA.debugLine="backitem.Date=PersianDateDash(DatePersian)";
_backitem.Date /*String*/  = _persiandatedash(_ba,_datepersian(_ba));
RDebugUtils.currentLine=13172767;
 //BA.debugLineNum = 13172767;BA.debugLine="backitem.Time=DateTime.Time(DateTime.Now)";
_backitem.Time /*String*/  = anywheresoftware.b4a.keywords.Common.DateTime.Time(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
RDebugUtils.currentLine=13172769;
 //BA.debugLineNum = 13172769;BA.debugLine="Dim str As String=FileName&\",\"& Date &\",\"& Time";
_str = _filename+","+_date+","+_time;
RDebugUtils.currentLine=13172773;
 //BA.debugLineNum = 13172773;BA.debugLine="List1.Add(str)";
_list1.Add((Object)(_str));
RDebugUtils.currentLine=13172778;
 //BA.debugLineNum = 13172778;BA.debugLine="File.WriteList(File.DirDefaultExternal &\"/Parsik/";
anywheresoftware.b4a.keywords.Common.File.WriteList(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal()+"/Parsik/Backup","backlist.txt",_list1);
RDebugUtils.currentLine=13172781;
 //BA.debugLineNum = 13172781;BA.debugLine="File.Copy(File.DirDefaultExternal &\"/Parsik\",\"par";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal()+"/Parsik","parsik_db.db",anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal()+"/Parsik/Backup",_filename+".db");
RDebugUtils.currentLine=13172782;
 //BA.debugLineNum = 13172782;BA.debugLine="Sleep(200)";
anywheresoftware.b4a.keywords.Common.Sleep(_ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mcode", "createbk"),(int) (200));
this.state = 16;
return;
case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=13172785;
 //BA.debugLineNum = 13172785;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _convertnumberspersian2english(anywheresoftware.b4a.BA _ba,String _snumber) throws Exception{
RDebugUtils.currentModule="mcode";
if (Debug.shouldDelegate(null, "convertnumberspersian2english", false))
	 {return ((String) Debug.delegate(null, "convertnumberspersian2english", new Object[] {_ba,_snumber}));}
String[] _pnumbers = null;
String[] _enumbers = null;
String _res = "";
int _i = 0;
int _j = 0;
RDebugUtils.currentLine=14221312;
 //BA.debugLineNum = 14221312;BA.debugLine="Sub  ConvertNumbersPersian2English(sNumber As Stri";
RDebugUtils.currentLine=14221313;
 //BA.debugLineNum = 14221313;BA.debugLine="Dim PNumbers(10) As String";
_pnumbers = new String[(int) (10)];
java.util.Arrays.fill(_pnumbers,"");
RDebugUtils.currentLine=14221314;
 //BA.debugLineNum = 14221314;BA.debugLine="Dim ENumbers(10) As String";
_enumbers = new String[(int) (10)];
java.util.Arrays.fill(_enumbers,"");
RDebugUtils.currentLine=14221315;
 //BA.debugLineNum = 14221315;BA.debugLine="Dim res As String";
_res = "";
RDebugUtils.currentLine=14221317;
 //BA.debugLineNum = 14221317;BA.debugLine="PNumbers(0) = \"۰\"";
_pnumbers[(int) (0)] = "۰";
RDebugUtils.currentLine=14221318;
 //BA.debugLineNum = 14221318;BA.debugLine="PNumbers(1) = \"۱\"";
_pnumbers[(int) (1)] = "۱";
RDebugUtils.currentLine=14221319;
 //BA.debugLineNum = 14221319;BA.debugLine="PNumbers(2) = \"۲\"";
_pnumbers[(int) (2)] = "۲";
RDebugUtils.currentLine=14221320;
 //BA.debugLineNum = 14221320;BA.debugLine="PNumbers(3) = \"۳\"";
_pnumbers[(int) (3)] = "۳";
RDebugUtils.currentLine=14221321;
 //BA.debugLineNum = 14221321;BA.debugLine="PNumbers(4) = \"۴\"";
_pnumbers[(int) (4)] = "۴";
RDebugUtils.currentLine=14221322;
 //BA.debugLineNum = 14221322;BA.debugLine="PNumbers(5) = \"۵\"";
_pnumbers[(int) (5)] = "۵";
RDebugUtils.currentLine=14221323;
 //BA.debugLineNum = 14221323;BA.debugLine="PNumbers(6) = \"۶\"";
_pnumbers[(int) (6)] = "۶";
RDebugUtils.currentLine=14221324;
 //BA.debugLineNum = 14221324;BA.debugLine="PNumbers(7) = \"۷\"";
_pnumbers[(int) (7)] = "۷";
RDebugUtils.currentLine=14221325;
 //BA.debugLineNum = 14221325;BA.debugLine="PNumbers(8) = \"۸\"";
_pnumbers[(int) (8)] = "۸";
RDebugUtils.currentLine=14221326;
 //BA.debugLineNum = 14221326;BA.debugLine="PNumbers(9) = \"۹\"";
_pnumbers[(int) (9)] = "۹";
RDebugUtils.currentLine=14221328;
 //BA.debugLineNum = 14221328;BA.debugLine="ENumbers(0) = \"0\"";
_enumbers[(int) (0)] = "0";
RDebugUtils.currentLine=14221329;
 //BA.debugLineNum = 14221329;BA.debugLine="ENumbers(1) = \"1\"";
_enumbers[(int) (1)] = "1";
RDebugUtils.currentLine=14221330;
 //BA.debugLineNum = 14221330;BA.debugLine="ENumbers(2) = \"2\"";
_enumbers[(int) (2)] = "2";
RDebugUtils.currentLine=14221331;
 //BA.debugLineNum = 14221331;BA.debugLine="ENumbers(3) = \"3\"";
_enumbers[(int) (3)] = "3";
RDebugUtils.currentLine=14221332;
 //BA.debugLineNum = 14221332;BA.debugLine="ENumbers(4) = \"4\"";
_enumbers[(int) (4)] = "4";
RDebugUtils.currentLine=14221333;
 //BA.debugLineNum = 14221333;BA.debugLine="ENumbers(5) = \"5\"";
_enumbers[(int) (5)] = "5";
RDebugUtils.currentLine=14221334;
 //BA.debugLineNum = 14221334;BA.debugLine="ENumbers(6) = \"6\"";
_enumbers[(int) (6)] = "6";
RDebugUtils.currentLine=14221335;
 //BA.debugLineNum = 14221335;BA.debugLine="ENumbers(7) = \"7\"";
_enumbers[(int) (7)] = "7";
RDebugUtils.currentLine=14221336;
 //BA.debugLineNum = 14221336;BA.debugLine="ENumbers(8) = \"8\"";
_enumbers[(int) (8)] = "8";
RDebugUtils.currentLine=14221337;
 //BA.debugLineNum = 14221337;BA.debugLine="ENumbers(9) = \"9\"";
_enumbers[(int) (9)] = "9";
RDebugUtils.currentLine=14221339;
 //BA.debugLineNum = 14221339;BA.debugLine="For i = 0 To sNumber.Length - 1";
{
final int step24 = 1;
final int limit24 = (int) (_snumber.length()-1);
_i = (int) (0) ;
for (;_i <= limit24 ;_i = _i + step24 ) {
RDebugUtils.currentLine=14221340;
 //BA.debugLineNum = 14221340;BA.debugLine="For j=0 To 9";
{
final int step25 = 1;
final int limit25 = (int) (9);
_j = (int) (0) ;
for (;_j <= limit25 ;_j = _j + step25 ) {
RDebugUtils.currentLine=14221341;
 //BA.debugLineNum = 14221341;BA.debugLine="If sNumber.SubString2(i,i+1) = PNumbers(j) Then";
if ((_snumber.substring(_i,(int) (_i+1))).equals(_pnumbers[_j])) { 
RDebugUtils.currentLine=14221342;
 //BA.debugLineNum = 14221342;BA.debugLine="res = res & ENumbers(j)";
_res = _res+_enumbers[_j];
 }else 
{RDebugUtils.currentLine=14221343;
 //BA.debugLineNum = 14221343;BA.debugLine="Else if sNumber.SubString2(i,i+1) = ENumbers(j)";
if ((_snumber.substring(_i,(int) (_i+1))).equals(_enumbers[_j])) { 
RDebugUtils.currentLine=14221344;
 //BA.debugLineNum = 14221344;BA.debugLine="res = res & ENumbers(j)";
_res = _res+_enumbers[_j];
 }}
;
 }
};
 }
};
RDebugUtils.currentLine=14221348;
 //BA.debugLineNum = 14221348;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=14221349;
 //BA.debugLineNum = 14221349;BA.debugLine="End Sub";
return "";
}
public static String  _datepersian(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="mcode";
if (Debug.shouldDelegate(null, "datepersian", false))
	 {return ((String) Debug.delegate(null, "datepersian", new Object[] {_ba}));}
String[] _t = null;
RDebugUtils.currentLine=13959168;
 //BA.debugLineNum = 13959168;BA.debugLine="Sub DatePersian As String";
RDebugUtils.currentLine=13959169;
 //BA.debugLineNum = 13959169;BA.debugLine="Dim T() As String";
_t = new String[(int) (0)];
java.util.Arrays.fill(_t,"");
RDebugUtils.currentLine=13959170;
 //BA.debugLineNum = 13959170;BA.debugLine="T = Regex.Split(\"/\",PersianDate.getDate(0,0,0,\"/\"";
_t = anywheresoftware.b4a.keywords.Common.Regex.Split("/",_persiandate.getDate((int) (0),(int) (0),(int) (0),"/"));
RDebugUtils.currentLine=13959171;
 //BA.debugLineNum = 13959171;BA.debugLine="If T(1).Length=1 Then";
if (_t[(int) (1)].length()==1) { 
RDebugUtils.currentLine=13959172;
 //BA.debugLineNum = 13959172;BA.debugLine="T(1)=\"0\"&T(1)";
_t[(int) (1)] = "0"+_t[(int) (1)];
 };
RDebugUtils.currentLine=13959174;
 //BA.debugLineNum = 13959174;BA.debugLine="If T(2).Length=1 Then";
if (_t[(int) (2)].length()==1) { 
RDebugUtils.currentLine=13959175;
 //BA.debugLineNum = 13959175;BA.debugLine="T(2)=\"0\"&T(2)";
_t[(int) (2)] = "0"+_t[(int) (2)];
 };
RDebugUtils.currentLine=13959177;
 //BA.debugLineNum = 13959177;BA.debugLine="Return T(0)&T(1)&T(2)";
if (true) return _t[(int) (0)]+_t[(int) (1)]+_t[(int) (2)];
RDebugUtils.currentLine=13959178;
 //BA.debugLineNum = 13959178;BA.debugLine="End Sub";
return "";
}
public static String  _setanimation(anywheresoftware.b4a.BA _ba,String _inanimation,String _outanimation) throws Exception{
RDebugUtils.currentModule="mcode";
if (Debug.shouldDelegate(null, "setanimation", false))
	 {return ((String) Debug.delegate(null, "setanimation", new Object[] {_ba,_inanimation,_outanimation}));}
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
String _package = "";
int _in = 0;
int _out = 0;
RDebugUtils.currentLine=13762560;
 //BA.debugLineNum = 13762560;BA.debugLine="Sub SetAnimation(InAnimation As String,OutAnimatio";
RDebugUtils.currentLine=13762561;
 //BA.debugLineNum = 13762561;BA.debugLine="Dim R As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=13762562;
 //BA.debugLineNum = 13762562;BA.debugLine="Dim Package As String";
_package = "";
RDebugUtils.currentLine=13762563;
 //BA.debugLineNum = 13762563;BA.debugLine="Dim In , Out As Int";
_in = 0;
_out = 0;
RDebugUtils.currentLine=13762564;
 //BA.debugLineNum = 13762564;BA.debugLine="Package=R.GetStaticFielD(\"anywheresoftware.b4a.BA";
_package = BA.ObjectToString(_r.GetStaticField("anywheresoftware.b4a.BA","packageName"));
RDebugUtils.currentLine=13762565;
 //BA.debugLineNum = 13762565;BA.debugLine="In=R.GetStaticField(Package & \".R$anim\",InAnimati";
_in = (int)(BA.ObjectToNumber(_r.GetStaticField(_package+".R$anim",_inanimation)));
RDebugUtils.currentLine=13762566;
 //BA.debugLineNum = 13762566;BA.debugLine="Out=R.GetStaticField(Package & \".R$anim\",OutAnima";
_out = (int)(BA.ObjectToNumber(_r.GetStaticField(_package+".R$anim",_outanimation)));
RDebugUtils.currentLine=13762567;
 //BA.debugLineNum = 13762567;BA.debugLine="R.Target=R.GetActivity";
_r.Target = (Object)(_r.GetActivity((_ba.processBA == null ? _ba : _ba.processBA)));
RDebugUtils.currentLine=13762568;
 //BA.debugLineNum = 13762568;BA.debugLine="R.RunMethod4(\"overridePendingTransition\",Array As";
_r.RunMethod4("overridePendingTransition",new Object[]{(Object)(_in),(Object)(_out)},new String[]{"java.lang.int","java.lang.int"});
RDebugUtils.currentLine=13762569;
 //BA.debugLineNum = 13762569;BA.debugLine="End Sub";
return "";
}
public static Object  _singleresult(anywheresoftware.b4a.BA _ba,String _query) throws Exception{
RDebugUtils.currentModule="mcode";
if (Debug.shouldDelegate(null, "singleresult", false))
	 {return ((Object) Debug.delegate(null, "singleresult", new Object[] {_ba,_query}));}
Object _ob = null;
RDebugUtils.currentLine=13434880;
 //BA.debugLineNum = 13434880;BA.debugLine="Sub SingleResult(Query As String) As Object";
RDebugUtils.currentLine=13434881;
 //BA.debugLineNum = 13434881;BA.debugLine="Dim ob As Object";
_ob = new Object();
RDebugUtils.currentLine=13434883;
 //BA.debugLineNum = 13434883;BA.debugLine="Try";
try {RDebugUtils.currentLine=13434884;
 //BA.debugLineNum = 13434884;BA.debugLine="If Sql1.IsInitialized=False Then";
if (_sql1.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=13434885;
 //BA.debugLineNum = 13434885;BA.debugLine="Initialize";
_initialize(_ba);
 };
RDebugUtils.currentLine=13434887;
 //BA.debugLineNum = 13434887;BA.debugLine="ob=Sql1.ExecQuerySingleResult(Query)";
_ob = (Object)(_sql1.ExecQuerySingleResult(_query));
 } 
       catch (Exception e8) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e8);RDebugUtils.currentLine=13434889;
 //BA.debugLineNum = 13434889;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("513434889",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)),0);
RDebugUtils.currentLine=13434890;
 //BA.debugLineNum = 13434890;BA.debugLine="myCode.SendError(LastException,\"MCode-SingleResu";
mostCurrent._mycode._senderror /*void*/ (_ba,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)),"MCode-SingleResult");
 };
RDebugUtils.currentLine=13434892;
 //BA.debugLineNum = 13434892;BA.debugLine="Return ob";
if (true) return _ob;
RDebugUtils.currentLine=13434893;
 //BA.debugLineNum = 13434893;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.sql.SQL.CursorWrapper  _result(anywheresoftware.b4a.BA _ba,String _query) throws Exception{
RDebugUtils.currentModule="mcode";
if (Debug.shouldDelegate(null, "result", false))
	 {return ((anywheresoftware.b4a.sql.SQL.CursorWrapper) Debug.delegate(null, "result", new Object[] {_ba,_query}));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
RDebugUtils.currentLine=13369344;
 //BA.debugLineNum = 13369344;BA.debugLine="Sub Result(Query As String) As Cursor";
RDebugUtils.currentLine=13369346;
 //BA.debugLineNum = 13369346;BA.debugLine="Dim Cu As Cursor";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=13369347;
 //BA.debugLineNum = 13369347;BA.debugLine="Try";
try {RDebugUtils.currentLine=13369348;
 //BA.debugLineNum = 13369348;BA.debugLine="If Sql1.IsInitialized=False Then";
if (_sql1.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=13369349;
 //BA.debugLineNum = 13369349;BA.debugLine="Initialize";
_initialize(_ba);
 };
RDebugUtils.currentLine=13369351;
 //BA.debugLineNum = 13369351;BA.debugLine="Cu=Sql1.ExecQuery(Query)";
_cu = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_sql1.ExecQuery(_query)));
 } 
       catch (Exception e8) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e8);RDebugUtils.currentLine=13369353;
 //BA.debugLineNum = 13369353;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("513369353",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)),0);
RDebugUtils.currentLine=13369354;
 //BA.debugLineNum = 13369354;BA.debugLine="myCode.SendError(LastException,\"MCode-Result\")";
mostCurrent._mycode._senderror /*void*/ (_ba,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)),"MCode-Result");
 };
RDebugUtils.currentLine=13369357;
 //BA.debugLineNum = 13369357;BA.debugLine="Return Cu";
if (true) return _cu;
RDebugUtils.currentLine=13369358;
 //BA.debugLineNum = 13369358;BA.debugLine="End Sub";
return null;
}
public static String  _openlinkinwebbrwoser(anywheresoftware.b4a.BA _ba,String _link) throws Exception{
RDebugUtils.currentModule="mcode";
if (Debug.shouldDelegate(null, "openlinkinwebbrwoser", false))
	 {return ((String) Debug.delegate(null, "openlinkinwebbrwoser", new Object[] {_ba,_link}));}
anywheresoftware.b4a.phone.Phone.PhoneIntents _p1 = null;
RDebugUtils.currentLine=17301504;
 //BA.debugLineNum = 17301504;BA.debugLine="Sub OpenLinkInWebBrwoser(link As String)";
RDebugUtils.currentLine=17301505;
 //BA.debugLineNum = 17301505;BA.debugLine="Dim p1 As PhoneIntents";
_p1 = new anywheresoftware.b4a.phone.Phone.PhoneIntents();
RDebugUtils.currentLine=17301506;
 //BA.debugLineNum = 17301506;BA.debugLine="StartActivity(p1.OpenBrowser(link))";
anywheresoftware.b4a.keywords.Common.StartActivity((_ba.processBA == null ? _ba : _ba.processBA),(Object)(_p1.OpenBrowser(_link)));
RDebugUtils.currentLine=17301507;
 //BA.debugLineNum = 17301507;BA.debugLine="End Sub";
return "";
}
public static String  _enterexitvisitor(anywheresoftware.b4a.BA _ba,ir.parsikhesab.pakhsh.mcode._adapteenterexitvisitor _item) throws Exception{
RDebugUtils.currentModule="mcode";
if (Debug.shouldDelegate(null, "enterexitvisitor", false))
	 {return ((String) Debug.delegate(null, "enterexitvisitor", new Object[] {_ba,_item}));}
String _res = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
String _query = "";
RDebugUtils.currentLine=16908288;
 //BA.debugLineNum = 16908288;BA.debugLine="Public Sub EnterExitVisitor(item As AdapteEnterExi";
RDebugUtils.currentLine=16908289;
 //BA.debugLineNum = 16908289;BA.debugLine="Dim res As String=\"\"";
_res = "";
RDebugUtils.currentLine=16908290;
 //BA.debugLineNum = 16908290;BA.debugLine="Try";
try {RDebugUtils.currentLine=16908291;
 //BA.debugLineNum = 16908291;BA.debugLine="Dim cu As Cursor=Result(\"Select * from TblEnterE";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = _result(_ba,"Select * from TblEnterExitVisitor where fldCode='"+_item.fldCode /*String*/ +"'");
RDebugUtils.currentLine=16908292;
 //BA.debugLineNum = 16908292;BA.debugLine="Select cu.RowCount";
switch (BA.switchObjectToInt(_cu.getRowCount(),(int) (0),(int) (1),(int) (2))) {
case 0: {
RDebugUtils.currentLine=16908295;
 //BA.debugLineNum = 16908295;BA.debugLine="If item.fldType=1 Then";
if ((_item.fldType /*String*/ ).equals(BA.NumberToString(1))) { 
RDebugUtils.currentLine=16908299;
 //BA.debugLineNum = 16908299;BA.debugLine="Dim query As String=\"Insert into TblEnterExit";
_query = "Insert into TblEnterExitVisitor(fldType,fldDate,fldTime,fldLat,fldLon,fldSend,fldCode) "+"Values('ورود','"+_item.fldDate /*String*/ +"','"+_item.fldTime /*String*/ +"','"+_item.fldLat /*String*/ +"','"+_item.fldLon /*String*/ +"','False','"+_item.fldCode /*String*/ +"')";
RDebugUtils.currentLine=16908301;
 //BA.debugLineNum = 16908301;BA.debugLine="SaveUpdate(query)";
_saveupdate(_ba,_query);
RDebugUtils.currentLine=16908302;
 //BA.debugLineNum = 16908302;BA.debugLine="res=\"Success\"";
_res = "Success";
 }else {
RDebugUtils.currentLine=16908305;
 //BA.debugLineNum = 16908305;BA.debugLine="res=\"NoEnter\"";
_res = "NoEnter";
 };
 break; }
case 1: {
RDebugUtils.currentLine=16908309;
 //BA.debugLineNum = 16908309;BA.debugLine="If item.fldType=1 Then";
if ((_item.fldType /*String*/ ).equals(BA.NumberToString(1))) { 
RDebugUtils.currentLine=16908311;
 //BA.debugLineNum = 16908311;BA.debugLine="res=\"DuplicateEnter\"";
_res = "DuplicateEnter";
 }else {
RDebugUtils.currentLine=16908314;
 //BA.debugLineNum = 16908314;BA.debugLine="Dim query As String=\"Insert into TblEnterExit";
_query = "Insert into TblEnterExitVisitor(fldType,fldDate,fldTime,fldLat,fldLon,fldSend,fldCode) "+"Values('خروج','"+_item.fldDate /*String*/ +"','"+_item.fldTime /*String*/ +"','"+_item.fldLat /*String*/ +"','"+_item.fldLon /*String*/ +"','False','"+_item.fldCode /*String*/ +"')";
RDebugUtils.currentLine=16908316;
 //BA.debugLineNum = 16908316;BA.debugLine="SaveUpdate(query)";
_saveupdate(_ba,_query);
RDebugUtils.currentLine=16908317;
 //BA.debugLineNum = 16908317;BA.debugLine="res=\"Success\"";
_res = "Success";
 };
 break; }
case 2: {
RDebugUtils.currentLine=16908321;
 //BA.debugLineNum = 16908321;BA.debugLine="res=\"DuplicateExit\"";
_res = "DuplicateExit";
 break; }
default: {
RDebugUtils.currentLine=16908323;
 //BA.debugLineNum = 16908323;BA.debugLine="res=\"\"";
_res = "";
 break; }
}
;
 } 
       catch (Exception e27) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e27);RDebugUtils.currentLine=16908327;
 //BA.debugLineNum = 16908327;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("516908327",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)),0);
RDebugUtils.currentLine=16908328;
 //BA.debugLineNum = 16908328;BA.debugLine="res=\"\"";
_res = "";
RDebugUtils.currentLine=16908329;
 //BA.debugLineNum = 16908329;BA.debugLine="myCode.SendError(LastException,\"MCode-T_EnterExi";
mostCurrent._mycode._senderror /*void*/ (_ba,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)),"MCode-T_EnterExit_tick");
 };
RDebugUtils.currentLine=16908331;
 //BA.debugLineNum = 16908331;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=16908332;
 //BA.debugLineNum = 16908332;BA.debugLine="End Sub";
return "";
}
public static String  _dttojson(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL.CursorWrapper _cu) throws Exception{
RDebugUtils.currentModule="mcode";
if (Debug.shouldDelegate(null, "dttojson", false))
	 {return ((String) Debug.delegate(null, "dttojson", new Object[] {_ba,_cu}));}
String _olgoo = "";
String _rowolgoo = "";
String _str = "";
int _i = 0;
int _j = 0;
RDebugUtils.currentLine=13697024;
 //BA.debugLineNum = 13697024;BA.debugLine="Sub DtToJson(Cu As Cursor) As String";
RDebugUtils.currentLine=13697025;
 //BA.debugLineNum = 13697025;BA.debugLine="Dim Olgoo As String";
_olgoo = "";
RDebugUtils.currentLine=13697026;
 //BA.debugLineNum = 13697026;BA.debugLine="Dim RowOlgoo As String";
_rowolgoo = "";
RDebugUtils.currentLine=13697027;
 //BA.debugLineNum = 13697027;BA.debugLine="Dim Str As String";
_str = "";
RDebugUtils.currentLine=13697028;
 //BA.debugLineNum = 13697028;BA.debugLine="For i=0 To Cu.ColumnCount-1";
{
final int step4 = 1;
final int limit4 = (int) (_cu.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=13697029;
 //BA.debugLineNum = 13697029;BA.debugLine="Olgoo=Olgoo & Chr(34) & Cu.GetColumnName(i) & Ch";
_olgoo = _olgoo+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr((int) (34)))+_cu.GetColumnName(_i)+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr((int) (34)))+":"+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr((int) (34)))+_cu.GetColumnName(_i)+BA.NumberToString(_i)+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr((int) (34)))+",";
 }
};
RDebugUtils.currentLine=13697031;
 //BA.debugLineNum = 13697031;BA.debugLine="Olgoo=Sf.Left(Olgoo,Olgoo.Length-1)";
_olgoo = _sf._vv0(_olgoo,(long) (_olgoo.length()-1));
RDebugUtils.currentLine=13697032;
 //BA.debugLineNum = 13697032;BA.debugLine="Olgoo = \"{\" & Olgoo & \"}\" & \",\"";
_olgoo = "{"+_olgoo+"}"+",";
RDebugUtils.currentLine=13697033;
 //BA.debugLineNum = 13697033;BA.debugLine="For i=0 To Cu.RowCount -1";
{
final int step9 = 1;
final int limit9 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=13697034;
 //BA.debugLineNum = 13697034;BA.debugLine="Cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=13697035;
 //BA.debugLineNum = 13697035;BA.debugLine="RowOlgoo=Olgoo";
_rowolgoo = _olgoo;
RDebugUtils.currentLine=13697036;
 //BA.debugLineNum = 13697036;BA.debugLine="For j=0 To Cu.ColumnCount-1";
{
final int step12 = 1;
final int limit12 = (int) (_cu.getColumnCount()-1);
_j = (int) (0) ;
for (;_j <= limit12 ;_j = _j + step12 ) {
RDebugUtils.currentLine=13697037;
 //BA.debugLineNum = 13697037;BA.debugLine="Log(Cu.GetColumnName(j)& j)";
anywheresoftware.b4a.keywords.Common.LogImpl("513697037",_cu.GetColumnName(_j)+BA.NumberToString(_j),0);
RDebugUtils.currentLine=13697039;
 //BA.debugLineNum = 13697039;BA.debugLine="If (Cu.GetString2(j)<>Null) Then";
if ((_cu.GetString2(_j)!= null)) { 
RDebugUtils.currentLine=13697040;
 //BA.debugLineNum = 13697040;BA.debugLine="RowOlgoo = RowOlgoo.Replace(Cu.GetColumnName(j";
_rowolgoo = _rowolgoo.replace(_cu.GetColumnName(_j)+BA.NumberToString(_j),_cu.GetString2(_j));
 };
 }
};
RDebugUtils.currentLine=13697043;
 //BA.debugLineNum = 13697043;BA.debugLine="Str=Str & RowOlgoo";
_str = _str+_rowolgoo;
 }
};
RDebugUtils.currentLine=13697045;
 //BA.debugLineNum = 13697045;BA.debugLine="Str=Sf.Left(Str,Str.Length-1)";
_str = _sf._vv0(_str,(long) (_str.length()-1));
RDebugUtils.currentLine=13697046;
 //BA.debugLineNum = 13697046;BA.debugLine="Str=\"[\" & Str & \"]\"";
_str = "["+_str+"]";
RDebugUtils.currentLine=13697047;
 //BA.debugLineNum = 13697047;BA.debugLine="Return Str";
if (true) return _str;
RDebugUtils.currentLine=13697048;
 //BA.debugLineNum = 13697048;BA.debugLine="End Sub";
return "";
}
public static String  _removeslashdate(anywheresoftware.b4a.BA _ba,String _date) throws Exception{
RDebugUtils.currentModule="mcode";
if (Debug.shouldDelegate(null, "removeslashdate", false))
	 {return ((String) Debug.delegate(null, "removeslashdate", new Object[] {_ba,_date}));}
RDebugUtils.currentLine=16842752;
 //BA.debugLineNum = 16842752;BA.debugLine="Sub RemoveSlashDate(date As String) As String";
RDebugUtils.currentLine=16842753;
 //BA.debugLineNum = 16842753;BA.debugLine="Return date.Replace(\"/\",\"\")";
if (true) return _date.replace("/","");
RDebugUtils.currentLine=16842754;
 //BA.debugLineNum = 16842754;BA.debugLine="End Sub";
return "";
}
public static String  _addtosabad(anywheresoftware.b4a.BA _ba,ir.parsikhesab.pakhsh.mcode._adapterlistkala _item) throws Exception{
RDebugUtils.currentModule="mcode";
if (Debug.shouldDelegate(null, "addtosabad", false))
	 {return ((String) Debug.delegate(null, "addtosabad", new Object[] {_ba,_item}));}
RDebugUtils.currentLine=15007744;
 //BA.debugLineNum = 15007744;BA.debugLine="Sub AddToSabad( Item  As AdapterListKala)";
RDebugUtils.currentLine=15007745;
 //BA.debugLineNum = 15007745;BA.debugLine="If Item.TedadDarSabadJoz > 0 Or Item.TedadDarSaba";
if ((double)(Double.parseDouble(_item.TedadDarSabadJoz /*String*/ ))>0 || (double)(Double.parseDouble(_item.TedadDarSabadKol /*String*/ ))>0 || (double)(Double.parseDouble(_item.FldEshantion /*String*/ ))>0) { 
RDebugUtils.currentLine=15007747;
 //BA.debugLineNum = 15007747;BA.debugLine="SaveUpdate(\"Insert Into TblSabad (FldCodeKala,fl";
_saveupdate(_ba,"Insert Into TblSabad (FldCodeKala,fldCodeGroup,FldNameKala,FldTedadDarkarton,FldFeeForoosh,fldFeeBadAzTakhfif,FldTedadDarSabadJoz,FldTedadDarSabadKol,FldNameVahed,FldNameVahed2,FldTozihat,FldMablaghMasrafKonande,fldPathPic,FldSumMande,FldEshantion,FldMablaghTakhfif,FldDarsadTakhfif,fldArzeshAfzode,fldDarsadArzeshAfzode) Values ('"+_item.CodeKala /*String*/ +"','"+_item.CodeGroup /*String*/ +"','"+_item.NameKala /*String*/ +"','"+_item.TedadDarKarton /*String*/ +"','"+BA.NumberToString(_item.FeeForoosh /*int*/ )+"','"+_item.fldFeeBadAzTakhfif /*String*/ +"','"+_item.TedadDarSabadJoz /*String*/ +"','"+_item.TedadDarSabadKol /*String*/ +"','"+_item.NameVahed /*String*/ +"','"+_item.NameVahed2 /*String*/ +"','"+_item.Tozihat /*String*/ +"','"+_item.FldMablaghMasrafKonande /*String*/ +"','"+_item.fldPathPic /*String*/ +"','"+_item.SumMande /*String*/ +"','"+_item.FldEshantion /*String*/ +"','"+BA.NumberToString(_item.MablaghTakhfif /*int*/ )+"','"+_item.fldDarsadTakhfif /*String*/ +"','"+_item.fldArzeshAfzodeKala /*String*/ +"','"+_item.fldDarsadArzeshAfzodeKala /*String*/ +"')");
 };
RDebugUtils.currentLine=15007751;
 //BA.debugLineNum = 15007751;BA.debugLine="End Sub";
return "";
}
public static String  _addzero(anywheresoftware.b4a.BA _ba,String _str) throws Exception{
RDebugUtils.currentModule="mcode";
if (Debug.shouldDelegate(null, "addzero", false))
	 {return ((String) Debug.delegate(null, "addzero", new Object[] {_ba,_str}));}
RDebugUtils.currentLine=17367040;
 //BA.debugLineNum = 17367040;BA.debugLine="Sub AddZero(str As String) As String";
RDebugUtils.currentLine=17367041;
 //BA.debugLineNum = 17367041;BA.debugLine="If IsNumber(str) And str<10 And str>0 And str.Len";
if (anywheresoftware.b4a.keywords.Common.IsNumber(_str) && (double)(Double.parseDouble(_str))<10 && (double)(Double.parseDouble(_str))>0 && _str.length()==1) { 
RDebugUtils.currentLine=17367042;
 //BA.debugLineNum = 17367042;BA.debugLine="str=\"0\"& str";
_str = "0"+_str;
 };
RDebugUtils.currentLine=17367044;
 //BA.debugLineNum = 17367044;BA.debugLine="Return str";
if (true) return _str;
RDebugUtils.currentLine=17367045;
 //BA.debugLineNum = 17367045;BA.debugLine="End Sub";
return "";
}
public static long  _calculatedistance(anywheresoftware.b4a.BA _ba,String _lat1,String _lon1,String _lat2,String _lon2) throws Exception{
RDebugUtils.currentModule="mcode";
if (Debug.shouldDelegate(null, "calculatedistance", false))
	 {return ((Long) Debug.delegate(null, "calculatedistance", new Object[] {_ba,_lat1,_lon1,_lat2,_lon2}));}
anywheresoftware.b4a.gps.LocationWrapper _p1 = null;
anywheresoftware.b4a.gps.LocationWrapper _p2 = null;
long _dis = 0L;
RDebugUtils.currentLine=17563648;
 //BA.debugLineNum = 17563648;BA.debugLine="Sub CalculateDistance(lat1 As String,lon1 As Strin";
RDebugUtils.currentLine=17563649;
 //BA.debugLineNum = 17563649;BA.debugLine="Dim p1,p2 As Location";
_p1 = new anywheresoftware.b4a.gps.LocationWrapper();
_p2 = new anywheresoftware.b4a.gps.LocationWrapper();
RDebugUtils.currentLine=17563650;
 //BA.debugLineNum = 17563650;BA.debugLine="p1.Initialize2(lat1,lon1)";
_p1.Initialize2(_lat1,_lon1);
RDebugUtils.currentLine=17563651;
 //BA.debugLineNum = 17563651;BA.debugLine="p2.Initialize2(lat2,lon2)";
_p2.Initialize2(_lat2,_lon2);
RDebugUtils.currentLine=17563652;
 //BA.debugLineNum = 17563652;BA.debugLine="Dim dis As Long=p1.DistanceTo(p2)";
_dis = (long) (_p1.DistanceTo((android.location.Location)(_p2.getObject())));
RDebugUtils.currentLine=17563653;
 //BA.debugLineNum = 17563653;BA.debugLine="Return dis";
if (true) return _dis;
RDebugUtils.currentLine=17563654;
 //BA.debugLineNum = 17563654;BA.debugLine="End Sub";
return 0L;
}
public static boolean  _check_internet(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="mcode";
if (Debug.shouldDelegate(null, "check_internet", false))
	 {return ((Boolean) Debug.delegate(null, "check_internet", new Object[] {_ba}));}
anywheresoftware.b4a.phone.Phone _ph = null;
boolean _connected = false;
RDebugUtils.currentLine=14942208;
 //BA.debugLineNum = 14942208;BA.debugLine="Sub check_internet As Boolean";
RDebugUtils.currentLine=14942209;
 //BA.debugLineNum = 14942209;BA.debugLine="Dim ph As Phone";
_ph = new anywheresoftware.b4a.phone.Phone();
RDebugUtils.currentLine=14942210;
 //BA.debugLineNum = 14942210;BA.debugLine="Dim connected As Boolean";
_connected = false;
RDebugUtils.currentLine=14942211;
 //BA.debugLineNum = 14942211;BA.debugLine="ph.GetDataState";
_ph.GetDataState();
RDebugUtils.currentLine=14942212;
 //BA.debugLineNum = 14942212;BA.debugLine="If ph.GetDataState=\"CONNECTED\" Then";
if ((_ph.GetDataState()).equals("CONNECTED")) { 
RDebugUtils.currentLine=14942213;
 //BA.debugLineNum = 14942213;BA.debugLine="connected=True";
_connected = anywheresoftware.b4a.keywords.Common.True;
 }else 
{RDebugUtils.currentLine=14942214;
 //BA.debugLineNum = 14942214;BA.debugLine="Else If ph.GetSettings(\"wifi_on\")=1 Then";
if ((_ph.GetSettings("wifi_on")).equals(BA.NumberToString(1))) { 
RDebugUtils.currentLine=14942215;
 //BA.debugLineNum = 14942215;BA.debugLine="connected=False";
_connected = anywheresoftware.b4a.keywords.Common.False;
 }}
;
RDebugUtils.currentLine=14942217;
 //BA.debugLineNum = 14942217;BA.debugLine="Return connected";
if (true) return _connected;
RDebugUtils.currentLine=14942218;
 //BA.debugLineNum = 14942218;BA.debugLine="End Sub";
return false;
}
public static boolean  _checkblacklist(anywheresoftware.b4a.BA _ba,String _codetafzili) throws Exception{
RDebugUtils.currentModule="mcode";
if (Debug.shouldDelegate(null, "checkblacklist", false))
	 {return ((Boolean) Debug.delegate(null, "checkblacklist", new Object[] {_ba,_codetafzili}));}
String _res = "";
RDebugUtils.currentLine=16973824;
 //BA.debugLineNum = 16973824;BA.debugLine="Public Sub CheckBlackList(CodeTafzili As String) A";
RDebugUtils.currentLine=16973825;
 //BA.debugLineNum = 16973825;BA.debugLine="Dim res As String=SingleResult(\"Select fldBlackLi";
_res = BA.ObjectToString(_singleresult(_ba,"Select fldBlackList from TblAshkhas where fldCodetafzili="+_codetafzili));
RDebugUtils.currentLine=16973826;
 //BA.debugLineNum = 16973826;BA.debugLine="If res=\"1\" Then";
if ((_res).equals("1")) { 
RDebugUtils.currentLine=16973827;
 //BA.debugLineNum = 16973827;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 }else {
RDebugUtils.currentLine=16973829;
 //BA.debugLineNum = 16973829;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=16973831;
 //BA.debugLineNum = 16973831;BA.debugLine="End Sub";
return false;
}
public static boolean  _checkcodekalaeshantion(anywheresoftware.b4a.BA _ba,String _codekalaforoosh,String _codekalaeshantion) throws Exception{
RDebugUtils.currentModule="mcode";
if (Debug.shouldDelegate(null, "checkcodekalaeshantion", false))
	 {return ((Boolean) Debug.delegate(null, "checkcodekalaeshantion", new Object[] {_ba,_codekalaforoosh,_codekalaeshantion}));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
RDebugUtils.currentLine=17104896;
 //BA.debugLineNum = 17104896;BA.debugLine="Sub CheckCodeKalaEshantion(CodeKalaForoosh As Stri";
RDebugUtils.currentLine=17104897;
 //BA.debugLineNum = 17104897;BA.debugLine="Dim cu As Cursor=Result($\"Select * from tblEshant";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = _result(_ba,("Select * from tblEshantionTabaghati where fldCodeKalaForoosh= "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_codekalaforoosh))+" and fldCodeKalaEshantion= "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_codekalaeshantion))+""));
RDebugUtils.currentLine=17104898;
 //BA.debugLineNum = 17104898;BA.debugLine="If cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=17104899;
 //BA.debugLineNum = 17104899;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 };
RDebugUtils.currentLine=17104901;
 //BA.debugLineNum = 17104901;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=17104902;
 //BA.debugLineNum = 17104902;BA.debugLine="End Sub";
return false;
}
public static boolean  _checkeshantion(anywheresoftware.b4a.BA _ba,String _codekala) throws Exception{
RDebugUtils.currentModule="mcode";
if (Debug.shouldDelegate(null, "checkeshantion", false))
	 {return ((Boolean) Debug.delegate(null, "checkeshantion", new Object[] {_ba,_codekala}));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
RDebugUtils.currentLine=15400960;
 //BA.debugLineNum = 15400960;BA.debugLine="Public Sub CheckEshantion(CodeKala As String) As B";
RDebugUtils.currentLine=15400961;
 //BA.debugLineNum = 15400961;BA.debugLine="If EshantionTabaghati=1 Then";
if ((_eshantiontabaghati).equals(BA.NumberToString(1))) { 
RDebugUtils.currentLine=15400962;
 //BA.debugLineNum = 15400962;BA.debugLine="Dim cu As Cursor=Result(\"select * from tblEshanti";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = _result(_ba,"select * from tblEshantionTabaghati where fldCodeKalaForoosh="+_codekala);
RDebugUtils.currentLine=15400963;
 //BA.debugLineNum = 15400963;BA.debugLine="If cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=15400964;
 //BA.debugLineNum = 15400964;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 };
 };
RDebugUtils.currentLine=15400968;
 //BA.debugLineNum = 15400968;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=15400969;
 //BA.debugLineNum = 15400969;BA.debugLine="End Sub";
return false;
}
public static boolean  _checkeshantiongroup(anywheresoftware.b4a.BA _ba,String _codegroupkala) throws Exception{
RDebugUtils.currentModule="mcode";
if (Debug.shouldDelegate(null, "checkeshantiongroup", false))
	 {return ((Boolean) Debug.delegate(null, "checkeshantiongroup", new Object[] {_ba,_codegroupkala}));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
RDebugUtils.currentLine=15466496;
 //BA.debugLineNum = 15466496;BA.debugLine="Public Sub CheckEshantionGroup(CodeGroupKala As St";
RDebugUtils.currentLine=15466497;
 //BA.debugLineNum = 15466497;BA.debugLine="If EshantionGroup=1 Then";
if ((_eshantiongroup).equals(BA.NumberToString(1))) { 
RDebugUtils.currentLine=15466498;
 //BA.debugLineNum = 15466498;BA.debugLine="Dim cu As Cursor=Result(\"select * from tblEshant";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = _result(_ba,"select * from tblEshantionGroup where fldCodeGroupKala="+_codegroupkala);
RDebugUtils.currentLine=15466499;
 //BA.debugLineNum = 15466499;BA.debugLine="If cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=15466500;
 //BA.debugLineNum = 15466500;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 };
 };
RDebugUtils.currentLine=15466504;
 //BA.debugLineNum = 15466504;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=15466505;
 //BA.debugLineNum = 15466505;BA.debugLine="End Sub";
return false;
}
public static String  _convertblobtostring(anywheresoftware.b4a.BA _ba,String _dir,String _filename) throws Exception{
RDebugUtils.currentModule="mcode";
if (Debug.shouldDelegate(null, "convertblobtostring", false))
	 {return ((String) Debug.delegate(null, "convertblobtostring", new Object[] {_ba,_dir,_filename}));}
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _inputstream1 = null;
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _outputstream1 = null;
byte[] _buffer = null;
String _strblob = "";
RDebugUtils.currentLine=15204352;
 //BA.debugLineNum = 15204352;BA.debugLine="Sub ConvertBlobToString(Dir As String,FileName As";
RDebugUtils.currentLine=15204353;
 //BA.debugLineNum = 15204353;BA.debugLine="If File.Exists(Dir,FileName) = True Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_dir,_filename)==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=15204354;
 //BA.debugLineNum = 15204354;BA.debugLine="Dim InputStream1 As InputStream";
_inputstream1 = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
RDebugUtils.currentLine=15204355;
 //BA.debugLineNum = 15204355;BA.debugLine="InputStream1 = File.OpenInput(Dir,FileName)";
_inputstream1 = anywheresoftware.b4a.keywords.Common.File.OpenInput(_dir,_filename);
RDebugUtils.currentLine=15204356;
 //BA.debugLineNum = 15204356;BA.debugLine="Dim OutputStream1 As OutputStream";
_outputstream1 = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=15204357;
 //BA.debugLineNum = 15204357;BA.debugLine="OutputStream1.InitializeToBytesArray(1000)";
_outputstream1.InitializeToBytesArray((int) (1000));
RDebugUtils.currentLine=15204358;
 //BA.debugLineNum = 15204358;BA.debugLine="File.Copy2(InputStream1, OutputStream1)";
anywheresoftware.b4a.keywords.Common.File.Copy2((java.io.InputStream)(_inputstream1.getObject()),(java.io.OutputStream)(_outputstream1.getObject()));
RDebugUtils.currentLine=15204359;
 //BA.debugLineNum = 15204359;BA.debugLine="Dim Buffer() As Byte";
_buffer = new byte[(int) (0)];
;
RDebugUtils.currentLine=15204360;
 //BA.debugLineNum = 15204360;BA.debugLine="Buffer = OutputStream1.ToBytesArray";
_buffer = _outputstream1.ToBytesArray();
RDebugUtils.currentLine=15204361;
 //BA.debugLineNum = 15204361;BA.debugLine="Dim StrBlob As String = Su.EncodeBase64(Buffer)";
_strblob = _su.EncodeBase64(_buffer);
RDebugUtils.currentLine=15204362;
 //BA.debugLineNum = 15204362;BA.debugLine="File.Delete(Dir,FileName)";
anywheresoftware.b4a.keywords.Common.File.Delete(_dir,_filename);
 }else {
RDebugUtils.currentLine=15204364;
 //BA.debugLineNum = 15204364;BA.debugLine="StrBlob = \"\"";
_strblob = "";
 };
RDebugUtils.currentLine=15204367;
 //BA.debugLineNum = 15204367;BA.debugLine="Return StrBlob";
if (true) return _strblob;
RDebugUtils.currentLine=15204373;
 //BA.debugLineNum = 15204373;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper  _convertipdfimg(anywheresoftware.b4a.BA _ba,String _dirfile,String _namefile) throws Exception{
RDebugUtils.currentModule="mcode";
if (Debug.shouldDelegate(null, "convertipdfimg", false))
	 {return ((anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) Debug.delegate(null, "convertipdfimg", new Object[] {_ba,_dirfile,_namefile}));}
de.donmanfred.PDFRendererwrapper _render = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _img = null;
int _i = 0;
RDebugUtils.currentLine=14745600;
 //BA.debugLineNum = 14745600;BA.debugLine="Sub ConvertiPdfImg(dirFile As String,namefile As S";
RDebugUtils.currentLine=14745601;
 //BA.debugLineNum = 14745601;BA.debugLine="Dim Render As PDFRenderer";
_render = new de.donmanfred.PDFRendererwrapper();
RDebugUtils.currentLine=14745602;
 //BA.debugLineNum = 14745602;BA.debugLine="Dim img As Bitmap";
_img = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=14745604;
 //BA.debugLineNum = 14745604;BA.debugLine="Render.Initialize(\"\",dirFile,namefile)";
_render.Initialize((_ba.processBA == null ? _ba : _ba.processBA),"",_dirfile,_namefile);
RDebugUtils.currentLine=14745605;
 //BA.debugLineNum = 14745605;BA.debugLine="For i = 0 To Render.PageCount-1";
{
final int step4 = 1;
final int limit4 = (int) (_render.getPageCount()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=14745606;
 //BA.debugLineNum = 14745606;BA.debugLine="img = Render.renderPageforDisplay(i)";
_img = (anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(_render.renderPageforDisplay(_i)));
 }
};
RDebugUtils.currentLine=14745610;
 //BA.debugLineNum = 14745610;BA.debugLine="Return img";
if (true) return _img;
RDebugUtils.currentLine=14745612;
 //BA.debugLineNum = 14745612;BA.debugLine="End Sub";
return null;
}
public static String  _convertnumtotime(anywheresoftware.b4a.BA _ba,String _time) throws Exception{
RDebugUtils.currentModule="mcode";
if (Debug.shouldDelegate(null, "convertnumtotime", false))
	 {return ((String) Debug.delegate(null, "convertnumtotime", new Object[] {_ba,_time}));}
String _hh = "";
String _mm = "";
RDebugUtils.currentLine=16056320;
 //BA.debugLineNum = 16056320;BA.debugLine="Sub ConvertNumToTime(Time As String) As String";
RDebugUtils.currentLine=16056323;
 //BA.debugLineNum = 16056323;BA.debugLine="Dim HH As String=Time.SubString2(0,2)";
_hh = _time.substring((int) (0),(int) (2));
RDebugUtils.currentLine=16056324;
 //BA.debugLineNum = 16056324;BA.debugLine="Dim MM As String=Time.SubString2(2,4)";
_mm = _time.substring((int) (2),(int) (4));
RDebugUtils.currentLine=16056325;
 //BA.debugLineNum = 16056325;BA.debugLine="Log(Time.SubString2(0,2))";
anywheresoftware.b4a.keywords.Common.LogImpl("516056325",_time.substring((int) (0),(int) (2)),0);
RDebugUtils.currentLine=16056326;
 //BA.debugLineNum = 16056326;BA.debugLine="Log(Time.SubString2(2,4))";
anywheresoftware.b4a.keywords.Common.LogImpl("516056326",_time.substring((int) (2),(int) (4)),0);
RDebugUtils.currentLine=16056328;
 //BA.debugLineNum = 16056328;BA.debugLine="Return HH & \":\" & MM";
if (true) return _hh+":"+_mm;
RDebugUtils.currentLine=16056329;
 //BA.debugLineNum = 16056329;BA.debugLine="End Sub";
return "";
}
public static String  _convertnumtotime2(anywheresoftware.b4a.BA _ba,String _hh,String _mm) throws Exception{
RDebugUtils.currentModule="mcode";
if (Debug.shouldDelegate(null, "convertnumtotime2", false))
	 {return ((String) Debug.delegate(null, "convertnumtotime2", new Object[] {_ba,_hh,_mm}));}
RDebugUtils.currentLine=16121856;
 //BA.debugLineNum = 16121856;BA.debugLine="Sub ConvertNumToTime2(HH As String,MM As String) A";
RDebugUtils.currentLine=16121863;
 //BA.debugLineNum = 16121863;BA.debugLine="If HH.Length=1 Then";
if (_hh.length()==1) { 
RDebugUtils.currentLine=16121864;
 //BA.debugLineNum = 16121864;BA.debugLine="HH=\"0\"&HH";
_hh = "0"+_hh;
 };
RDebugUtils.currentLine=16121866;
 //BA.debugLineNum = 16121866;BA.debugLine="If MM.Length=1 Then";
if (_mm.length()==1) { 
RDebugUtils.currentLine=16121867;
 //BA.debugLineNum = 16121867;BA.debugLine="MM=\"0\"&MM";
_mm = "0"+_mm;
 };
RDebugUtils.currentLine=16121869;
 //BA.debugLineNum = 16121869;BA.debugLine="Return HH & \":\" & MM";
if (true) return _hh+":"+_mm;
RDebugUtils.currentLine=16121870;
 //BA.debugLineNum = 16121870;BA.debugLine="End Sub";
return "";
}
public static int  _convertstrtoint(anywheresoftware.b4a.BA _ba,String _str) throws Exception{
RDebugUtils.currentModule="mcode";
if (Debug.shouldDelegate(null, "convertstrtoint", false))
	 {return ((Integer) Debug.delegate(null, "convertstrtoint", new Object[] {_ba,_str}));}
int _i = 0;
RDebugUtils.currentLine=14286848;
 //BA.debugLineNum = 14286848;BA.debugLine="Sub ConvertStrToInt(str As String) As Int";
RDebugUtils.currentLine=14286849;
 //BA.debugLineNum = 14286849;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=14286850;
 //BA.debugLineNum = 14286850;BA.debugLine="i=Sf.Val(str)";
_i = (int) (_sf._vvvvv1(_str));
RDebugUtils.currentLine=14286851;
 //BA.debugLineNum = 14286851;BA.debugLine="Return i";
if (true) return _i;
RDebugUtils.currentLine=14286852;
 //BA.debugLineNum = 14286852;BA.debugLine="End Sub";
return 0;
}
public static String  _converttojson(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.collections.Map _map) throws Exception{
RDebugUtils.currentModule="mcode";
if (Debug.shouldDelegate(null, "converttojson", false))
	 {return ((String) Debug.delegate(null, "converttojson", new Object[] {_ba,_map}));}
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _jsongen = null;
RDebugUtils.currentLine=17629184;
 //BA.debugLineNum = 17629184;BA.debugLine="Sub ConvertToJSON(Map As Map) As String";
RDebugUtils.currentLine=17629186;
 //BA.debugLineNum = 17629186;BA.debugLine="Dim JSONGen As JSONGenerator";
_jsongen = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=17629187;
 //BA.debugLineNum = 17629187;BA.debugLine="JSONGen.Initialize(Map)";
_jsongen.Initialize(_map);
RDebugUtils.currentLine=17629190;
 //BA.debugLineNum = 17629190;BA.debugLine="Return JSONGen.ToString";
if (true) return _jsongen.ToString();
RDebugUtils.currentLine=17629191;
 //BA.debugLineNum = 17629191;BA.debugLine="End Sub";
return "";
}
public static int  _countpushsmsnotopen(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="mcode";
if (Debug.shouldDelegate(null, "countpushsmsnotopen", false))
	 {return ((Integer) Debug.delegate(null, "countpushsmsnotopen", new Object[] {_ba}));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
RDebugUtils.currentLine=14483456;
 //BA.debugLineNum = 14483456;BA.debugLine="public Sub CountPushSmsNotOpen As Int";
RDebugUtils.currentLine=14483457;
 //BA.debugLineNum = 14483457;BA.debugLine="Dim cu As Cursor";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=14483458;
 //BA.debugLineNum = 14483458;BA.debugLine="cu=Result(\"select Id From TblNotifi where FldStat";
_cu = _result(_ba,"select Id From TblNotifi where FldStatus='0'");
RDebugUtils.currentLine=14483459;
 //BA.debugLineNum = 14483459;BA.debugLine="Return	cu.RowCount";
if (true) return _cu.getRowCount();
RDebugUtils.currentLine=14483460;
 //BA.debugLineNum = 14483460;BA.debugLine="End Sub";
return 0;
}
public static String  _persiandatedash(anywheresoftware.b4a.BA _ba,String _str) throws Exception{
RDebugUtils.currentModule="mcode";
if (Debug.shouldDelegate(null, "persiandatedash", false))
	 {return ((String) Debug.delegate(null, "persiandatedash", new Object[] {_ba,_str}));}
String _t1 = "";
String _t2 = "";
String _t3 = "";
RDebugUtils.currentLine=14090240;
 //BA.debugLineNum = 14090240;BA.debugLine="Sub PersianDateDash(str As String) As String";
RDebugUtils.currentLine=14090241;
 //BA.debugLineNum = 14090241;BA.debugLine="Dim T1,T2,T3 As String";
_t1 = "";
_t2 = "";
_t3 = "";
RDebugUtils.currentLine=14090242;
 //BA.debugLineNum = 14090242;BA.debugLine="Log(str.Length)";
anywheresoftware.b4a.keywords.Common.LogImpl("514090242",BA.NumberToString(_str.length()),0);
RDebugUtils.currentLine=14090243;
 //BA.debugLineNum = 14090243;BA.debugLine="T1=str.SubString2(0,4) '13981120";
_t1 = _str.substring((int) (0),(int) (4));
RDebugUtils.currentLine=14090244;
 //BA.debugLineNum = 14090244;BA.debugLine="T2=str.SubString2(4,6)'11";
_t2 = _str.substring((int) (4),(int) (6));
RDebugUtils.currentLine=14090245;
 //BA.debugLineNum = 14090245;BA.debugLine="T3=str.SubString2(6,8)'20";
_t3 = _str.substring((int) (6),(int) (8));
RDebugUtils.currentLine=14090246;
 //BA.debugLineNum = 14090246;BA.debugLine="If T2.Length=1 Then";
if (_t2.length()==1) { 
RDebugUtils.currentLine=14090247;
 //BA.debugLineNum = 14090247;BA.debugLine="T2=\"0\"&T2";
_t2 = "0"+_t2;
 };
RDebugUtils.currentLine=14090249;
 //BA.debugLineNum = 14090249;BA.debugLine="If T3.Length=1 Then";
if (_t3.length()==1) { 
RDebugUtils.currentLine=14090250;
 //BA.debugLineNum = 14090250;BA.debugLine="T3=\"0\"&T3";
_t3 = "0"+_t3;
 };
RDebugUtils.currentLine=14090252;
 //BA.debugLineNum = 14090252;BA.debugLine="Return T1&\"/\"&T2&\"/\"&T3";
if (true) return _t1+"/"+_t2+"/"+_t3;
RDebugUtils.currentLine=14090254;
 //BA.debugLineNum = 14090254;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _createreportfaktor(anywheresoftware.b4a.BA _ba,ir.parsikhesab.pakhsh.mcode._adapterlistfaktor _faktor) throws Exception{
RDebugUtils.currentModule="mcode";
if (Debug.shouldDelegate(null, "createreportfaktor", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(null, "createreportfaktor", new Object[] {_ba,_faktor}));}
ResumableSub_CreateReportFaktor rsub = new ResumableSub_CreateReportFaktor(null,_ba,_faktor);
rsub.resume((_ba.processBA == null ? _ba : _ba.processBA), null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CreateReportFaktor extends BA.ResumableSub {
public ResumableSub_CreateReportFaktor(ir.parsikhesab.pakhsh.mcode parent,anywheresoftware.b4a.BA _ba,ir.parsikhesab.pakhsh.mcode._adapterlistfaktor _faktor) {
this.parent = parent;
this._ba = _ba;
this._faktor = _faktor;
}
ir.parsikhesab.pakhsh.mcode parent;
anywheresoftware.b4a.BA _ba;
ir.parsikhesab.pakhsh.mcode._adapterlistfaktor _faktor;
ir.parsikhesab.pakhsh.mcode._finalfaktor_ _tfaktor = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu1 = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cutasview = null;
String _takhfif = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu2 = null;
String _takhfifvizhe = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu3 = null;
long _sood = 0L;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="mcode";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=15073281;
 //BA.debugLineNum = 15073281;BA.debugLine="Dim Tfaktor As FinalFaktor_";
_tfaktor = new ir.parsikhesab.pakhsh.mcode._finalfaktor_();
RDebugUtils.currentLine=15073282;
 //BA.debugLineNum = 15073282;BA.debugLine="Tfaktor.date=Faktor.fldDate";
_tfaktor.date /*String*/  = _faktor.fldDate /*String*/ ;
RDebugUtils.currentLine=15073285;
 //BA.debugLineNum = 15073285;BA.debugLine="Dim Cu1 As Cursor = Result(\"Select * From TblAshk";
_cu1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu1 = _result(_ba,"Select * From TblAshkhas Where FldC_Ashkhas = '"+_faktor.fldC_Ashkhas /*String*/ +"'");
RDebugUtils.currentLine=15073286;
 //BA.debugLineNum = 15073286;BA.debugLine="If Cu1.RowCount>0 Then";
if (true) break;

case 1:
//if
this.state = 12;
if (_cu1.getRowCount()>0) { 
this.state = 3;
}else {
this.state = 11;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=15073287;
 //BA.debugLineNum = 15073287;BA.debugLine="Cu1.Position=0";
_cu1.setPosition((int) (0));
RDebugUtils.currentLine=15073288;
 //BA.debugLineNum = 15073288;BA.debugLine="Tfaktor.Customername=Cu1.GetString(\"FldN_Ashkhas";
_tfaktor.Customername /*String*/  = _cu1.GetString("FldN_Ashkhas");
RDebugUtils.currentLine=15073289;
 //BA.debugLineNum = 15073289;BA.debugLine="Tfaktor.Mantaghe = Cu1.GetString(\"FldN_City\")";
_tfaktor.Mantaghe /*String*/  = _cu1.GetString("FldN_City");
RDebugUtils.currentLine=15073290;
 //BA.debugLineNum = 15073290;BA.debugLine="Tfaktor.Address = Cu1.GetString(\"FldAddress\")";
_tfaktor.Address /*String*/  = _cu1.GetString("FldAddress");
RDebugUtils.currentLine=15073291;
 //BA.debugLineNum = 15073291;BA.debugLine="Tfaktor.Tel = Cu1.GetString(\"FldTell\") & \" | \" &";
_tfaktor.Tel /*String*/  = _cu1.GetString("FldTell")+" | "+_cu1.GetString("FldMob");
RDebugUtils.currentLine=15073292;
 //BA.debugLineNum = 15073292;BA.debugLine="If IsNumber(Cu1.GetString(\"FldMandeHesab\")) Then";
if (true) break;

case 4:
//if
this.state = 9;
if (anywheresoftware.b4a.keywords.Common.IsNumber(_cu1.GetString("FldMandeHesab"))) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=15073293;
 //BA.debugLineNum = 15073293;BA.debugLine="Tfaktor.MandeHesab = myCode.Is_int( Cu1.GetStri";
_tfaktor.MandeHesab /*String*/  = BA.NumberToString(parent.mostCurrent._mycode._is_int /*int*/ (_ba,_cu1.GetString("FldMandeHesab")));
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=15073295;
 //BA.debugLineNum = 15073295;BA.debugLine="Tfaktor.MandeHesab = 0";
_tfaktor.MandeHesab /*String*/  = BA.NumberToString(0);
 if (true) break;

case 9:
//C
this.state = 12;
;
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=15073298;
 //BA.debugLineNum = 15073298;BA.debugLine="Tfaktor.Customername=\"مشتری جدید\"";
_tfaktor.Customername /*String*/  = "مشتری جدید";
RDebugUtils.currentLine=15073299;
 //BA.debugLineNum = 15073299;BA.debugLine="Tfaktor.Mantaghe = \"\"";
_tfaktor.Mantaghe /*String*/  = "";
RDebugUtils.currentLine=15073300;
 //BA.debugLineNum = 15073300;BA.debugLine="Tfaktor.Address = \"\"";
_tfaktor.Address /*String*/  = "";
RDebugUtils.currentLine=15073301;
 //BA.debugLineNum = 15073301;BA.debugLine="Tfaktor.Tel = \"\"";
_tfaktor.Tel /*String*/  = "";
RDebugUtils.currentLine=15073302;
 //BA.debugLineNum = 15073302;BA.debugLine="Tfaktor.MandeHesab = 0";
_tfaktor.MandeHesab /*String*/  = BA.NumberToString(0);
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=15073307;
 //BA.debugLineNum = 15073307;BA.debugLine="Dim CuTasview As Cursor = Result(\"Select * From T";
_cutasview = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cutasview = _result(_ba,"Select * From TblNoeTasvie Where FldC_Tasvie = '"+_faktor.fldC_Tasvie /*String*/ +"'");
RDebugUtils.currentLine=15073308;
 //BA.debugLineNum = 15073308;BA.debugLine="Sleep(0)";
anywheresoftware.b4a.keywords.Common.Sleep(_ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mcode", "createreportfaktor"),(int) (0));
this.state = 25;
return;
case 25:
//C
this.state = 13;
;
RDebugUtils.currentLine=15073309;
 //BA.debugLineNum = 15073309;BA.debugLine="CuTasview.Position=0";
_cutasview.setPosition((int) (0));
RDebugUtils.currentLine=15073310;
 //BA.debugLineNum = 15073310;BA.debugLine="Tfaktor.TasvieType = CuTasview.GetString(\"FldN_Ta";
_tfaktor.TasvieType /*String*/  = _cutasview.GetString("FldN_Tasvie");
RDebugUtils.currentLine=15073313;
 //BA.debugLineNum = 15073313;BA.debugLine="Tfaktor.KhamFaktor   = Faktor.fldTotalFaktor + Fa";
_tfaktor.KhamFaktor /*String*/  = BA.NumberToString((double)(Double.parseDouble(_faktor.fldTotalFaktor /*String*/ ))+(double)(Double.parseDouble(_faktor.FldTakhfifVizhe /*String*/ ))+(double)(Double.parseDouble(_faktor.FldTakhfifKala /*String*/ )));
RDebugUtils.currentLine=15073315;
 //BA.debugLineNum = 15073315;BA.debugLine="Dim Takhfif As String";
_takhfif = "";
RDebugUtils.currentLine=15073316;
 //BA.debugLineNum = 15073316;BA.debugLine="Dim Cu2 As Cursor= Result(\"SELECT Sum((FldFeeForo";
_cu2 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu2 = _result(_ba,"SELECT Sum((FldFeeForoosh - fldFeeBadAzTakhfif) * ((FldTedadDarSabadKol*FldTedadDarKarton) + FldTedadDarSabadJoz)) as SumTakhfif FROM TblSabad Where Cast(fldFeeBadAzTakhfif AS Int) > 0 ");
RDebugUtils.currentLine=15073317;
 //BA.debugLineNum = 15073317;BA.debugLine="Cu2.Position = 0";
_cu2.setPosition((int) (0));
RDebugUtils.currentLine=15073318;
 //BA.debugLineNum = 15073318;BA.debugLine="If Cu2.GetString(\"SumTakhfif\") <> Null Then";
if (true) break;

case 13:
//if
this.state = 18;
if (_cu2.GetString("SumTakhfif")!= null) { 
this.state = 15;
}else {
this.state = 17;
}if (true) break;

case 15:
//C
this.state = 18;
RDebugUtils.currentLine=15073319;
 //BA.debugLineNum = 15073319;BA.debugLine="Takhfif = Cu2.GetString(\"SumTakhfif\")";
_takhfif = _cu2.GetString("SumTakhfif");
 if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=15073321;
 //BA.debugLineNum = 15073321;BA.debugLine="Takhfif = 0";
_takhfif = BA.NumberToString(0);
 if (true) break;

case 18:
//C
this.state = 19;
;
RDebugUtils.currentLine=15073323;
 //BA.debugLineNum = 15073323;BA.debugLine="Tfaktor.TakhfifKala = Takhfif";
_tfaktor.TakhfifKala /*String*/  = _takhfif;
RDebugUtils.currentLine=15073324;
 //BA.debugLineNum = 15073324;BA.debugLine="Log(\"تخفیف کالا : \" & Takhfif)";
anywheresoftware.b4a.keywords.Common.LogImpl("515073324","تخفیف کالا : "+_takhfif,0);
RDebugUtils.currentLine=15073326;
 //BA.debugLineNum = 15073326;BA.debugLine="Dim TakhfifVizhe As String";
_takhfifvizhe = "";
RDebugUtils.currentLine=15073327;
 //BA.debugLineNum = 15073327;BA.debugLine="Dim Cu3 As Cursor= Result(\"SELECT Sum((FldMablagh";
_cu3 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu3 = _result(_ba,"SELECT Sum((FldMablaghTakhfif) * ((FldTedadDarSabadKol*FldTedadDarKarton) + FldTedadDarSabadJoz))  as SumTakhfifVizhe FROM TblSabad Where Cast(FldMablaghTakhfif AS Int) > 0 ");
RDebugUtils.currentLine=15073328;
 //BA.debugLineNum = 15073328;BA.debugLine="Cu3.Position = 0";
_cu3.setPosition((int) (0));
RDebugUtils.currentLine=15073329;
 //BA.debugLineNum = 15073329;BA.debugLine="If Cu3.GetString(\"SumTakhfifVizhe\") <> Null Then";
if (true) break;

case 19:
//if
this.state = 24;
if (_cu3.GetString("SumTakhfifVizhe")!= null) { 
this.state = 21;
}else {
this.state = 23;
}if (true) break;

case 21:
//C
this.state = 24;
RDebugUtils.currentLine=15073330;
 //BA.debugLineNum = 15073330;BA.debugLine="TakhfifVizhe = Cu3.GetString(\"SumTakhfifVizhe\")";
_takhfifvizhe = _cu3.GetString("SumTakhfifVizhe");
 if (true) break;

case 23:
//C
this.state = 24;
RDebugUtils.currentLine=15073332;
 //BA.debugLineNum = 15073332;BA.debugLine="TakhfifVizhe = 0";
_takhfifvizhe = BA.NumberToString(0);
 if (true) break;

case 24:
//C
this.state = -1;
;
RDebugUtils.currentLine=15073334;
 //BA.debugLineNum = 15073334;BA.debugLine="Tfaktor.TakhfifVizhe = TakhfifVizhe";
_tfaktor.TakhfifVizhe /*String*/  = _takhfifvizhe;
RDebugUtils.currentLine=15073335;
 //BA.debugLineNum = 15073335;BA.debugLine="Log(\"تخفیف ویژه : \" & TakhfifVizhe)";
anywheresoftware.b4a.keywords.Common.LogImpl("515073335","تخفیف ویژه : "+_takhfifvizhe,0);
RDebugUtils.currentLine=15073341;
 //BA.debugLineNum = 15073341;BA.debugLine="Log(\"تخفیف ویژه : \" & Tfaktor.TakhfifVizhe)";
anywheresoftware.b4a.keywords.Common.LogImpl("515073341","تخفیف ویژه : "+_tfaktor.TakhfifVizhe /*String*/ ,0);
RDebugUtils.currentLine=15073344;
 //BA.debugLineNum = 15073344;BA.debugLine="Tfaktor.GablePardakht = Tfaktor.KhamFaktor - Tfak";
_tfaktor.GablePardakht /*String*/  = BA.NumberToString((double)(Double.parseDouble(_tfaktor.KhamFaktor /*String*/ ))-(double)(Double.parseDouble(_tfaktor.TakhfifKala /*String*/ ))-(double)(Double.parseDouble(_tfaktor.TakhfifVizhe /*String*/ )));
RDebugUtils.currentLine=15073346;
 //BA.debugLineNum = 15073346;BA.debugLine="Dim Sood As Long = (Tfaktor.GablePardakht)*(Darsa";
_sood = (long) ((double)(Double.parseDouble((_tfaktor.GablePardakht /*String*/ )))*((double)(Double.parseDouble(parent._darsadsood))/(double)100));
RDebugUtils.currentLine=15073347;
 //BA.debugLineNum = 15073347;BA.debugLine="Log(\"سود ویزیتور : \" & Sood)";
anywheresoftware.b4a.keywords.Common.LogImpl("515073347","سود ویزیتور : "+BA.NumberToString(_sood),0);
RDebugUtils.currentLine=15073348;
 //BA.debugLineNum = 15073348;BA.debugLine="Tfaktor.SoodVisitor = Sood";
_tfaktor.SoodVisitor /*String*/  = BA.NumberToString(_sood);
RDebugUtils.currentLine=15073349;
 //BA.debugLineNum = 15073349;BA.debugLine="Return Tfaktor";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_tfaktor));return;};
RDebugUtils.currentLine=15073350;
 //BA.debugLineNum = 15073350;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _createreportsabad(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="mcode";
if (Debug.shouldDelegate(null, "createreportsabad", false))
	 {return ((String) Debug.delegate(null, "createreportsabad", new Object[] {_ba}));}
ir.parsikhesab.pakhsh.mcode._finalfaktor_ _tfaktor = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
int _rowcount = 0;
long _mablagh = 0L;
String _tedadkol = "";
long _mablaghkolfaktor = 0L;
int _i = 0;
String _takhfif = "";
String _takhfifvizhe = "";
long _mablagharzeshafzode = 0L;
RDebugUtils.currentLine=15138816;
 //BA.debugLineNum = 15138816;BA.debugLine="Sub CreateReportSabad";
RDebugUtils.currentLine=15138817;
 //BA.debugLineNum = 15138817;BA.debugLine="Dim Tfaktor As FinalFaktor_";
_tfaktor = new ir.parsikhesab.pakhsh.mcode._finalfaktor_();
RDebugUtils.currentLine=15138818;
 //BA.debugLineNum = 15138818;BA.debugLine="Dim Cu As Cursor = Result(\"Select * From TblSabad";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = _result(_ba,"Select * From TblSabad");
RDebugUtils.currentLine=15138819;
 //BA.debugLineNum = 15138819;BA.debugLine="Cu.Position=0";
_cu.setPosition((int) (0));
RDebugUtils.currentLine=15138820;
 //BA.debugLineNum = 15138820;BA.debugLine="If Cu.RowCount=0 Then Return";
if (_cu.getRowCount()==0) { 
if (true) return "";};
RDebugUtils.currentLine=15138822;
 //BA.debugLineNum = 15138822;BA.debugLine="Dim RowCount As Int=Cu.RowCount";
_rowcount = _cu.getRowCount();
RDebugUtils.currentLine=15138823;
 //BA.debugLineNum = 15138823;BA.debugLine="Dim Mablagh As Long";
_mablagh = 0L;
RDebugUtils.currentLine=15138824;
 //BA.debugLineNum = 15138824;BA.debugLine="Dim tedadKol As String";
_tedadkol = "";
RDebugUtils.currentLine=15138825;
 //BA.debugLineNum = 15138825;BA.debugLine="Log(Cu.GetString(\"FldFeeForoosh\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("515138825",_cu.GetString("FldFeeForoosh"),0);
RDebugUtils.currentLine=15138826;
 //BA.debugLineNum = 15138826;BA.debugLine="Log(Cu.GetString(\"FldMablaghTakhfif\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("515138826",_cu.GetString("FldMablaghTakhfif"),0);
RDebugUtils.currentLine=15138827;
 //BA.debugLineNum = 15138827;BA.debugLine="Log(Cu.GetString(\"FldDarsadTakhfif\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("515138827",_cu.GetString("FldDarsadTakhfif"),0);
RDebugUtils.currentLine=15138828;
 //BA.debugLineNum = 15138828;BA.debugLine="Log(Cu.GetString(\"FldEshantion\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("515138828",_cu.GetString("FldEshantion"),0);
RDebugUtils.currentLine=15138830;
 //BA.debugLineNum = 15138830;BA.debugLine="Dim MablaghKolFaktor As Long = 0";
_mablaghkolfaktor = (long) (0);
RDebugUtils.currentLine=15138833;
 //BA.debugLineNum = 15138833;BA.debugLine="For i=0 To RowCount -1";
{
final int step13 = 1;
final int limit13 = (int) (_rowcount-1);
_i = (int) (0) ;
for (;_i <= limit13 ;_i = _i + step13 ) {
RDebugUtils.currentLine=15138834;
 //BA.debugLineNum = 15138834;BA.debugLine="Cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=15138835;
 //BA.debugLineNum = 15138835;BA.debugLine="Mablagh = Cu.GetString(\"FldFeeForoosh\") * (Cu.Ge";
_mablagh = (long) ((double)(Double.parseDouble(_cu.GetString("FldFeeForoosh")))*((double)(Double.parseDouble(_cu.GetString("FldTedadDarSabadJoz")))+((double)(Double.parseDouble(_cu.GetString("FldTedadDarSabadKol")))*(double)(Double.parseDouble(_cu.GetString("FldTedadDarKarton"))))));
RDebugUtils.currentLine=15138837;
 //BA.debugLineNum = 15138837;BA.debugLine="tedadKol=(Cu.GetString(\"FldTedadDarSabadJoz\")+(C";
_tedadkol = BA.NumberToString(((double)(Double.parseDouble(_cu.GetString("FldTedadDarSabadJoz")))+((double)(Double.parseDouble(_cu.GetString("FldTedadDarSabadKol")))*(double)(Double.parseDouble(_cu.GetString("FldTedadDarKarton"))))));
RDebugUtils.currentLine=15138838;
 //BA.debugLineNum = 15138838;BA.debugLine="MablaghKolFaktor = MablaghKolFaktor + Mablagh";
_mablaghkolfaktor = (long) (_mablaghkolfaktor+_mablagh);
 }
};
RDebugUtils.currentLine=15138842;
 //BA.debugLineNum = 15138842;BA.debugLine="Tfaktor.KhamFaktor   = MablaghKolFaktor";
_tfaktor.KhamFaktor /*String*/  = BA.NumberToString(_mablaghkolfaktor);
RDebugUtils.currentLine=15138843;
 //BA.debugLineNum = 15138843;BA.debugLine="Tfaktor.date=\"\"";
_tfaktor.date /*String*/  = "";
RDebugUtils.currentLine=15138845;
 //BA.debugLineNum = 15138845;BA.debugLine="Dim Takhfif As String";
_takhfif = "";
RDebugUtils.currentLine=15138846;
 //BA.debugLineNum = 15138846;BA.debugLine="Takhfif= SingleResult(\"SELECT Sum((FldFeeForoosh";
_takhfif = BA.ObjectToString(_singleresult(_ba,"SELECT Sum((FldFeeForoosh - fldFeeBadAzTakhfif) * ((FldTedadDarSabadKol*FldTedadDarKarton) + FldTedadDarSabadJoz)) as TakhfifKala FROM TblSabad Where Cast(FldMablaghTakhfif AS Int) = 0 and  Cast(fldFeeBadAzTakhfif AS Int) > 0 "));
RDebugUtils.currentLine=15138847;
 //BA.debugLineNum = 15138847;BA.debugLine="Takhfif= myCode.Is_Null_adad(Takhfif)";
_takhfif = mostCurrent._mycode._is_null_adad /*String*/ (_ba,_takhfif);
RDebugUtils.currentLine=15138848;
 //BA.debugLineNum = 15138848;BA.debugLine="Tfaktor.TakhfifKala = Takhfif";
_tfaktor.TakhfifKala /*String*/  = _takhfif;
RDebugUtils.currentLine=15138849;
 //BA.debugLineNum = 15138849;BA.debugLine="Log(\"تخفیف کالا : \" & Takhfif)";
anywheresoftware.b4a.keywords.Common.LogImpl("515138849","تخفیف کالا : "+_takhfif,0);
RDebugUtils.currentLine=15138851;
 //BA.debugLineNum = 15138851;BA.debugLine="Dim TakhfifVizhe As String";
_takhfifvizhe = "";
RDebugUtils.currentLine=15138853;
 //BA.debugLineNum = 15138853;BA.debugLine="TakhfifVizhe= SingleResult(\"SELECT Sum((FldMablag";
_takhfifvizhe = BA.ObjectToString(_singleresult(_ba,"SELECT Sum((FldMablaghTakhfif)) as SumTakhfifVizhe FROM TblSabad Where Cast(FldMablaghTakhfif AS Int) > 0   "));
RDebugUtils.currentLine=15138855;
 //BA.debugLineNum = 15138855;BA.debugLine="TakhfifVizhe= myCode.Is_Null_adad(TakhfifVizhe)";
_takhfifvizhe = mostCurrent._mycode._is_null_adad /*String*/ (_ba,_takhfifvizhe);
RDebugUtils.currentLine=15138857;
 //BA.debugLineNum = 15138857;BA.debugLine="Tfaktor.TakhfifVizhe = TakhfifVizhe";
_tfaktor.TakhfifVizhe /*String*/  = _takhfifvizhe;
RDebugUtils.currentLine=15138858;
 //BA.debugLineNum = 15138858;BA.debugLine="Log(\"تخفیف ویژه : \" & TakhfifVizhe)";
anywheresoftware.b4a.keywords.Common.LogImpl("515138858","تخفیف ویژه : "+_takhfifvizhe,0);
RDebugUtils.currentLine=15138860;
 //BA.debugLineNum = 15138860;BA.debugLine="Tfaktor.TakhfifKol=Takhfif+TakhfifVizhe";
_tfaktor.TakhfifKol /*String*/  = BA.NumberToString((double)(Double.parseDouble(_takhfif))+(double)(Double.parseDouble(_takhfifvizhe)));
RDebugUtils.currentLine=15138864;
 //BA.debugLineNum = 15138864;BA.debugLine="Tfaktor.GablePardakht = MablaghKolFaktor - Tfakto";
_tfaktor.GablePardakht /*String*/  = BA.NumberToString(_mablaghkolfaktor-(double)(Double.parseDouble(_tfaktor.TakhfifKol /*String*/ )));
RDebugUtils.currentLine=15138865;
 //BA.debugLineNum = 15138865;BA.debugLine="If Tfaktor.TakhfifKol>0 Then";
if ((double)(Double.parseDouble(_tfaktor.TakhfifKol /*String*/ ))>0) { 
RDebugUtils.currentLine=15138866;
 //BA.debugLineNum = 15138866;BA.debugLine="Tfaktor.SumKolBadazTahkfif=Tfaktor.GablePardakht";
_tfaktor.SumKolBadazTahkfif /*String*/  = _tfaktor.GablePardakht /*String*/ ;
 }else {
RDebugUtils.currentLine=15138868;
 //BA.debugLineNum = 15138868;BA.debugLine="Tfaktor.SumKolBadazTahkfif=0";
_tfaktor.SumKolBadazTahkfif /*String*/  = BA.NumberToString(0);
 };
RDebugUtils.currentLine=15138870;
 //BA.debugLineNum = 15138870;BA.debugLine="Dim MablaghArzeshAfzode As Long = 0";
_mablagharzeshafzode = (long) (0);
RDebugUtils.currentLine=15138871;
 //BA.debugLineNum = 15138871;BA.debugLine="If ArzeshAfzodeEnable=1 Then";
if ((_arzeshafzodeenable).equals(BA.NumberToString(1))) { 
RDebugUtils.currentLine=15138873;
 //BA.debugLineNum = 15138873;BA.debugLine="MablaghArzeshAfzode = SingleResult(\"SELECT Sum(";
_mablagharzeshafzode = BA.ObjectToLongNumber(_singleresult(_ba,"SELECT Sum((fldArzeshAfzode)) FROM TblSabad "));
RDebugUtils.currentLine=15138874;
 //BA.debugLineNum = 15138874;BA.debugLine="Tfaktor.fldArzeshAfzode=MablaghArzeshAfzode";
_tfaktor.fldArzeshAfzode /*String*/  = BA.NumberToString(_mablagharzeshafzode);
RDebugUtils.currentLine=15138875;
 //BA.debugLineNum = 15138875;BA.debugLine="Tfaktor.GablePardakht=Tfaktor.GablePardakht+Mabl";
_tfaktor.GablePardakht /*String*/  = BA.NumberToString((double)(Double.parseDouble(_tfaktor.GablePardakht /*String*/ ))+_mablagharzeshafzode);
 }else {
RDebugUtils.currentLine=15138886;
 //BA.debugLineNum = 15138886;BA.debugLine="Tfaktor.fldArzeshAfzode=0";
_tfaktor.fldArzeshAfzode /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=15138887;
 //BA.debugLineNum = 15138887;BA.debugLine="SaveUpdate($\"Update TblSabad Set fldArzeshAfzode";
_saveupdate(_ba,("Update TblSabad Set fldArzeshAfzode='0',fldDarsadArzeshAfzode='0'"));
 };
RDebugUtils.currentLine=15138896;
 //BA.debugLineNum = 15138896;BA.debugLine="FinalFaktor=Tfaktor";
_finalfaktor = _tfaktor;
RDebugUtils.currentLine=15138897;
 //BA.debugLineNum = 15138897;BA.debugLine="End Sub";
return "";
}
public static String  _datemiladi(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="mcode";
if (Debug.shouldDelegate(null, "datemiladi", false))
	 {return ((String) Debug.delegate(null, "datemiladi", new Object[] {_ba}));}
String[] _t = null;
RDebugUtils.currentLine=14155776;
 //BA.debugLineNum = 14155776;BA.debugLine="Sub DateMiladi As String";
RDebugUtils.currentLine=14155777;
 //BA.debugLineNum = 14155777;BA.debugLine="Dim T() As String";
_t = new String[(int) (0)];
java.util.Arrays.fill(_t,"");
RDebugUtils.currentLine=14155778;
 //BA.debugLineNum = 14155778;BA.debugLine="T = Regex.Split(\"/\",DateTime.Date(DateTime.Now))";
_t = anywheresoftware.b4a.keywords.Common.Regex.Split("/",anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.getNow()));
RDebugUtils.currentLine=14155779;
 //BA.debugLineNum = 14155779;BA.debugLine="If T(0).Length=1 Then";
if (_t[(int) (0)].length()==1) { 
RDebugUtils.currentLine=14155780;
 //BA.debugLineNum = 14155780;BA.debugLine="T(0)=\"0\"&T(0)";
_t[(int) (0)] = "0"+_t[(int) (0)];
 };
RDebugUtils.currentLine=14155782;
 //BA.debugLineNum = 14155782;BA.debugLine="If T(1).Length=1 Then";
if (_t[(int) (1)].length()==1) { 
RDebugUtils.currentLine=14155783;
 //BA.debugLineNum = 14155783;BA.debugLine="T(1)=\"0\"&T(0)";
_t[(int) (1)] = "0"+_t[(int) (0)];
 };
RDebugUtils.currentLine=14155785;
 //BA.debugLineNum = 14155785;BA.debugLine="Return T(2)&T(1)&T(0)";
if (true) return _t[(int) (2)]+_t[(int) (1)]+_t[(int) (0)];
RDebugUtils.currentLine=14155786;
 //BA.debugLineNum = 14155786;BA.debugLine="End Sub";
return "";
}
public static String  _datepersian2(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="mcode";
if (Debug.shouldDelegate(null, "datepersian2", false))
	 {return ((String) Debug.delegate(null, "datepersian2", new Object[] {_ba}));}
String[] _t = null;
RDebugUtils.currentLine=14024704;
 //BA.debugLineNum = 14024704;BA.debugLine="Sub DatePersian2 As String";
RDebugUtils.currentLine=14024705;
 //BA.debugLineNum = 14024705;BA.debugLine="Dim T() As String";
_t = new String[(int) (0)];
java.util.Arrays.fill(_t,"");
RDebugUtils.currentLine=14024706;
 //BA.debugLineNum = 14024706;BA.debugLine="T = Regex.Split(\"/\",PersianDate.getDate(0,0,0,\"/\"";
_t = anywheresoftware.b4a.keywords.Common.Regex.Split("/",_persiandate.getDate((int) (0),(int) (0),(int) (0),"/"));
RDebugUtils.currentLine=14024707;
 //BA.debugLineNum = 14024707;BA.debugLine="If T(1).Length=1 Then";
if (_t[(int) (1)].length()==1) { 
RDebugUtils.currentLine=14024708;
 //BA.debugLineNum = 14024708;BA.debugLine="T(1)=\"0\"&T(1)";
_t[(int) (1)] = "0"+_t[(int) (1)];
 };
RDebugUtils.currentLine=14024710;
 //BA.debugLineNum = 14024710;BA.debugLine="If T(2).Length=1 Then";
if (_t[(int) (2)].length()==1) { 
RDebugUtils.currentLine=14024711;
 //BA.debugLineNum = 14024711;BA.debugLine="T(2)=\"0\"&T(2)";
_t[(int) (2)] = "0"+_t[(int) (2)];
 };
RDebugUtils.currentLine=14024713;
 //BA.debugLineNum = 14024713;BA.debugLine="Return T(1)&T(2)";
if (true) return _t[(int) (1)]+_t[(int) (2)];
RDebugUtils.currentLine=14024714;
 //BA.debugLineNum = 14024714;BA.debugLine="End Sub";
return "";
}
public static String  _decrypted(anywheresoftware.b4a.BA _ba,String _str) throws Exception{
RDebugUtils.currentModule="mcode";
if (Debug.shouldDelegate(null, "decrypted", false))
	 {return ((String) Debug.delegate(null, "decrypted", new Object[] {_ba,_str}));}
b4a.example.aesencryption _enc = null;
String _result1 = "";
RDebugUtils.currentLine=16515072;
 //BA.debugLineNum = 16515072;BA.debugLine="Sub Decrypted(str As String) As String";
RDebugUtils.currentLine=16515073;
 //BA.debugLineNum = 16515073;BA.debugLine="Dim Enc As AESEncryption";
_enc = new b4a.example.aesencryption();
RDebugUtils.currentLine=16515074;
 //BA.debugLineNum = 16515074;BA.debugLine="Dim Result1 As String";
_result1 = "";
RDebugUtils.currentLine=16515075;
 //BA.debugLineNum = 16515075;BA.debugLine="Enc.InitializationVector = \"Q.6qYq0_C+mGmymX\" 'Mu";
_enc._v7 = "Q.6qYq0_C+mGmymX";
RDebugUtils.currentLine=16515076;
 //BA.debugLineNum = 16515076;BA.debugLine="Enc.SecretKey = \"3hba8fOumOPrMG0.G?-mkF-scGOkPwyW";
_enc._v0 = "3hba8fOumOPrMG0.G?-mkF-scGOkPwyW";
RDebugUtils.currentLine=16515077;
 //BA.debugLineNum = 16515077;BA.debugLine="Result1=Enc.AESDecrypt(str)";
_result1 = _enc._v5(_str);
RDebugUtils.currentLine=16515078;
 //BA.debugLineNum = 16515078;BA.debugLine="Log($\"Decrypted = ${Result1}\"$)";
anywheresoftware.b4a.keywords.Common.LogImpl("516515078",("Decrypted = "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_result1))+""),0);
RDebugUtils.currentLine=16515079;
 //BA.debugLineNum = 16515079;BA.debugLine="Log($\"DecryptedLength = ${Result1.Length}\"$)";
anywheresoftware.b4a.keywords.Common.LogImpl("516515079",("DecryptedLength = "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_result1.length()))+""),0);
RDebugUtils.currentLine=16515080;
 //BA.debugLineNum = 16515080;BA.debugLine="Return  Result1";
if (true) return _result1;
RDebugUtils.currentLine=16515081;
 //BA.debugLineNum = 16515081;BA.debugLine="End Sub";
return "";
}
public static String  _encrypted(anywheresoftware.b4a.BA _ba,String _str) throws Exception{
RDebugUtils.currentModule="mcode";
if (Debug.shouldDelegate(null, "encrypted", false))
	 {return ((String) Debug.delegate(null, "encrypted", new Object[] {_ba,_str}));}
b4a.example.aesencryption _enc = null;
String _result1 = "";
RDebugUtils.currentLine=16449536;
 //BA.debugLineNum = 16449536;BA.debugLine="Sub Encrypted(str As String) As String";
RDebugUtils.currentLine=16449537;
 //BA.debugLineNum = 16449537;BA.debugLine="Dim Enc As AESEncryption";
_enc = new b4a.example.aesencryption();
RDebugUtils.currentLine=16449538;
 //BA.debugLineNum = 16449538;BA.debugLine="Dim Result1 As String";
_result1 = "";
RDebugUtils.currentLine=16449539;
 //BA.debugLineNum = 16449539;BA.debugLine="Enc.InitializationVector = \"Q.6qYq0_C+mGmymX\" 'Mu";
_enc._v7 = "Q.6qYq0_C+mGmymX";
RDebugUtils.currentLine=16449540;
 //BA.debugLineNum = 16449540;BA.debugLine="Enc.SecretKey = \"3hba8fOumOPrMG0.G?-mkF-scGOkPwyW";
_enc._v0 = "3hba8fOumOPrMG0.G?-mkF-scGOkPwyW";
RDebugUtils.currentLine=16449541;
 //BA.debugLineNum = 16449541;BA.debugLine="Result1=Enc.AESEncrypt(str)";
_result1 = _enc._v6(_str);
RDebugUtils.currentLine=16449542;
 //BA.debugLineNum = 16449542;BA.debugLine="Log($\"Encrypted = ${Result1}\"$)";
anywheresoftware.b4a.keywords.Common.LogImpl("516449542",("Encrypted = "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_result1))+""),0);
RDebugUtils.currentLine=16449543;
 //BA.debugLineNum = 16449543;BA.debugLine="Log($\"EncryptedLength = ${Result1.Length}\"$)";
anywheresoftware.b4a.keywords.Common.LogImpl("516449543",("EncryptedLength = "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_result1.length()))+""),0);
RDebugUtils.currentLine=16449544;
 //BA.debugLineNum = 16449544;BA.debugLine="Return  Result1";
if (true) return _result1;
RDebugUtils.currentLine=16449545;
 //BA.debugLineNum = 16449545;BA.debugLine="End Sub";
return "";
}
public static int  _getcounteshantiongroup(anywheresoftware.b4a.BA _ba,String _codegroup) throws Exception{
RDebugUtils.currentModule="mcode";
if (Debug.shouldDelegate(null, "getcounteshantiongroup", false))
	 {return ((Integer) Debug.delegate(null, "getcounteshantiongroup", new Object[] {_ba,_codegroup}));}
int _count = 0;
RDebugUtils.currentLine=17170432;
 //BA.debugLineNum = 17170432;BA.debugLine="Sub GetCountEshantionGroup(CodeGroup As String) As";
RDebugUtils.currentLine=17170433;
 //BA.debugLineNum = 17170433;BA.debugLine="Dim Count As Int=0";
_count = (int) (0);
RDebugUtils.currentLine=17170434;
 //BA.debugLineNum = 17170434;BA.debugLine="Count=myCode.Is_Null_adad(SingleResult(\"Select fl";
_count = (int)(Double.parseDouble(mostCurrent._mycode._is_null_adad /*String*/ (_ba,BA.ObjectToString(_singleresult(_ba,"Select fldTedadEshantion from tblEshantionGroupTemp where fldCodeGroupKalaEshantion='"+_codegroup+"'")))));
RDebugUtils.currentLine=17170436;
 //BA.debugLineNum = 17170436;BA.debugLine="Return Count";
if (true) return _count;
RDebugUtils.currentLine=17170437;
 //BA.debugLineNum = 17170437;BA.debugLine="End Sub";
return 0;
}
public static String  _getdatenow(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="mcode";
if (Debug.shouldDelegate(null, "getdatenow", false))
	 {return ((String) Debug.delegate(null, "getdatenow", new Object[] {_ba}));}
anywheresoftware.b4a.student.PersianDate _pcd = null;
String _dateshamsi = "";
int _yearm = 0;
int _monthm = 0;
int _daym = 0;
RDebugUtils.currentLine=14876672;
 //BA.debugLineNum = 14876672;BA.debugLine="Sub GetDateNow() As String";
RDebugUtils.currentLine=14876673;
 //BA.debugLineNum = 14876673;BA.debugLine="Dim pcd As PersianDate";
_pcd = new anywheresoftware.b4a.student.PersianDate();
RDebugUtils.currentLine=14876675;
 //BA.debugLineNum = 14876675;BA.debugLine="Dim DateShamsi As String";
_dateshamsi = "";
RDebugUtils.currentLine=14876676;
 //BA.debugLineNum = 14876676;BA.debugLine="Dim YearM,MonthM,DayM As Int";
_yearm = 0;
_monthm = 0;
_daym = 0;
RDebugUtils.currentLine=14876677;
 //BA.debugLineNum = 14876677;BA.debugLine="YearM = DateTime.GetYear(DateTime.Now)";
_yearm = anywheresoftware.b4a.keywords.Common.DateTime.GetYear(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
RDebugUtils.currentLine=14876678;
 //BA.debugLineNum = 14876678;BA.debugLine="MonthM = DateTime.GetMonth(DateTime.Now)";
_monthm = anywheresoftware.b4a.keywords.Common.DateTime.GetMonth(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
RDebugUtils.currentLine=14876679;
 //BA.debugLineNum = 14876679;BA.debugLine="DayM = DateTime.GetDayOfMonth(DateTime.Now)";
_daym = anywheresoftware.b4a.keywords.Common.DateTime.GetDayOfMonth(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
RDebugUtils.currentLine=14876680;
 //BA.debugLineNum = 14876680;BA.debugLine="DateShamsi=pcd.getDate(YearM,MonthM,DayM,\"0\")";
_dateshamsi = _pcd.getDate(_yearm,_monthm,_daym,"0");
RDebugUtils.currentLine=14876707;
 //BA.debugLineNum = 14876707;BA.debugLine="Log(DateShamsi)";
anywheresoftware.b4a.keywords.Common.LogImpl("514876707",_dateshamsi,0);
RDebugUtils.currentLine=14876708;
 //BA.debugLineNum = 14876708;BA.debugLine="Return DateShamsi";
if (true) return _dateshamsi;
RDebugUtils.currentLine=14876709;
 //BA.debugLineNum = 14876709;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.List  _getlistgallerykala(anywheresoftware.b4a.BA _ba,String _codekala) throws Exception{
RDebugUtils.currentModule="mcode";
if (Debug.shouldDelegate(null, "getlistgallerykala", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(null, "getlistgallerykala", new Object[] {_ba,_codekala}));}
anywheresoftware.b4a.objects.collections.List _lst = null;
RDebugUtils.currentLine=15728640;
 //BA.debugLineNum = 15728640;BA.debugLine="Public Sub GetListGalleryKala(CodeKala As String)";
RDebugUtils.currentLine=15728641;
 //BA.debugLineNum = 15728641;BA.debugLine="Dim lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=15728642;
 //BA.debugLineNum = 15728642;BA.debugLine="lst.Initialize";
_lst.Initialize();
RDebugUtils.currentLine=15728643;
 //BA.debugLineNum = 15728643;BA.debugLine="If File.Exists(File.DirDefaultExternal &\"/parsik/";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal()+"/parsik/GalleryKala",_codekala)==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=15728644;
 //BA.debugLineNum = 15728644;BA.debugLine="lst=File.ListFiles(File.Combine(File.DirDefaultE";
_lst = anywheresoftware.b4a.keywords.Common.File.ListFiles(anywheresoftware.b4a.keywords.Common.File.Combine(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal()+"/parsik/GalleryKala",_codekala));
RDebugUtils.currentLine=15728645;
 //BA.debugLineNum = 15728645;BA.debugLine="If lst.Size>0 Then";
if (_lst.getSize()>0) { 
RDebugUtils.currentLine=15728646;
 //BA.debugLineNum = 15728646;BA.debugLine="Return lst";
if (true) return _lst;
 }else {
RDebugUtils.currentLine=15728648;
 //BA.debugLineNum = 15728648;BA.debugLine="Return lst";
if (true) return _lst;
 };
 }else {
RDebugUtils.currentLine=15728651;
 //BA.debugLineNum = 15728651;BA.debugLine="Return lst";
if (true) return _lst;
 };
RDebugUtils.currentLine=15728653;
 //BA.debugLineNum = 15728653;BA.debugLine="End Sub";
return null;
}
public static String  _getlog(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="mcode";
if (Debug.shouldDelegate(null, "getlog", false))
	 {return ((String) Debug.delegate(null, "getlog", new Object[] {_ba}));}
RDebugUtils.currentLine=13303808;
 //BA.debugLineNum = 13303808;BA.debugLine="Sub GetLog() As String";
RDebugUtils.currentLine=13303810;
 //BA.debugLineNum = 13303810;BA.debugLine="Return File.ReadString(File.DirDefaultExternal &\"";
if (true) return anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal()+"/Parsik/Backup","log.txt");
RDebugUtils.currentLine=13303811;
 //BA.debugLineNum = 13303811;BA.debugLine="End Sub";
return "";
}
public static int  _getmablaghfee(anywheresoftware.b4a.BA _ba,String _fldcodetasvie,String _fldcodekala) throws Exception{
RDebugUtils.currentModule="mcode";
if (Debug.shouldDelegate(null, "getmablaghfee", false))
	 {return ((Integer) Debug.delegate(null, "getmablaghfee", new Object[] {_ba,_fldcodetasvie,_fldcodekala}));}
int _fee = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
RDebugUtils.currentLine=16187392;
 //BA.debugLineNum = 16187392;BA.debugLine="Sub GetMablaghFee(fldCodeTasvie As String,fldCodeK";
RDebugUtils.currentLine=16187393;
 //BA.debugLineNum = 16187393;BA.debugLine="Dim fee As Int=0";
_fee = (int) (0);
RDebugUtils.currentLine=16187394;
 //BA.debugLineNum = 16187394;BA.debugLine="Dim cu As Cursor";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=16187395;
 //BA.debugLineNum = 16187395;BA.debugLine="cu=Result(\"select FldFee from TblFee where FldCod";
_cu = _result(_ba,"select FldFee from TblFee where FldCodeTasvie="+_fldcodetasvie+" and FldCodeKala="+_fldcodekala);
RDebugUtils.currentLine=16187396;
 //BA.debugLineNum = 16187396;BA.debugLine="If cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=16187397;
 //BA.debugLineNum = 16187397;BA.debugLine="fee=SingleResult(\"select FldFee from TblFee wher";
_fee = (int)(BA.ObjectToNumber(_singleresult(_ba,"select FldFee from TblFee where FldCodeTasvie="+_fldcodetasvie+" and FldCodeKala="+_fldcodekala)));
 };
RDebugUtils.currentLine=16187399;
 //BA.debugLineNum = 16187399;BA.debugLine="cu.Close";
_cu.Close();
RDebugUtils.currentLine=16187400;
 //BA.debugLineNum = 16187400;BA.debugLine="Return fee";
if (true) return _fee;
RDebugUtils.currentLine=16187401;
 //BA.debugLineNum = 16187401;BA.debugLine="End Sub";
return 0;
}
public static String  _getnahvietasfie(anywheresoftware.b4a.BA _ba,String _fldcode) throws Exception{
RDebugUtils.currentModule="mcode";
if (Debug.shouldDelegate(null, "getnahvietasfie", false))
	 {return ((String) Debug.delegate(null, "getnahvietasfie", new Object[] {_ba,_fldcode}));}
RDebugUtils.currentLine=15532032;
 //BA.debugLineNum = 15532032;BA.debugLine="Public Sub GetNahvieTasfie(fldCode As String) As S";
RDebugUtils.currentLine=15532033;
 //BA.debugLineNum = 15532033;BA.debugLine="Return SingleResult(\"select FldName from TblTasvi";
if (true) return BA.ObjectToString(_singleresult(_ba,"select FldName from TblTasvie where FldCode="+_fldcode));
RDebugUtils.currentLine=15532034;
 //BA.debugLineNum = 15532034;BA.debugLine="End Sub";
return "";
}
public static String  _getnamegroupkala(anywheresoftware.b4a.BA _ba,String _codegroup) throws Exception{
RDebugUtils.currentModule="mcode";
if (Debug.shouldDelegate(null, "getnamegroupkala", false))
	 {return ((String) Debug.delegate(null, "getnamegroupkala", new Object[] {_ba,_codegroup}));}
String _str = "";
RDebugUtils.currentLine=17235968;
 //BA.debugLineNum = 17235968;BA.debugLine="Sub GetNameGroupKala(CodeGroup As String) As Strin";
RDebugUtils.currentLine=17235969;
 //BA.debugLineNum = 17235969;BA.debugLine="Dim str As String=\"\"";
_str = "";
RDebugUtils.currentLine=17235970;
 //BA.debugLineNum = 17235970;BA.debugLine="str=SingleResult(\"Select FldN_Gorooh From TblGoro";
_str = BA.ObjectToString(_singleresult(_ba,"Select FldN_Gorooh From TblGoroohKala where FldC_Gorooh="+_codegroup));
RDebugUtils.currentLine=17235971;
 //BA.debugLineNum = 17235971;BA.debugLine="Return str";
if (true) return _str;
RDebugUtils.currentLine=17235972;
 //BA.debugLineNum = 17235972;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper  _getpickala(anywheresoftware.b4a.BA _ba,String _codekala) throws Exception{
RDebugUtils.currentModule="mcode";
if (Debug.shouldDelegate(null, "getpickala", false))
	 {return ((anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) Debug.delegate(null, "getpickala", new Object[] {_ba,_codekala}));}
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp = null;
RDebugUtils.currentLine=15663104;
 //BA.debugLineNum = 15663104;BA.debugLine="Public Sub GetPicKala(CodeKala As String) As Bitma";
RDebugUtils.currentLine=15663105;
 //BA.debugLineNum = 15663105;BA.debugLine="If File.Exists(File.DirDefaultExternal &\"/parsik/";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal()+"/parsik/AksKala",_codekala+".jpg")==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=15663107;
 //BA.debugLineNum = 15663107;BA.debugLine="Dim bmp As Bitmap";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=15663108;
 //BA.debugLineNum = 15663108;BA.debugLine="bmp.InitializeSample(File.DirAssets,\"icon.png\",2";
_bmp.InitializeSample(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"icon.png",anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2800)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2800)));
RDebugUtils.currentLine=15663109;
 //BA.debugLineNum = 15663109;BA.debugLine="If RotatePic Then";
if (_rotatepic) { 
RDebugUtils.currentLine=15663110;
 //BA.debugLineNum = 15663110;BA.debugLine="Return bmp.Rotate(180)";
if (true) return _bmp.Rotate((float) (180));
 }else {
RDebugUtils.currentLine=15663112;
 //BA.debugLineNum = 15663112;BA.debugLine="Return bmp";
if (true) return _bmp;
 };
 }else {
RDebugUtils.currentLine=15663117;
 //BA.debugLineNum = 15663117;BA.debugLine="Dim bmp As Bitmap";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=15663118;
 //BA.debugLineNum = 15663118;BA.debugLine="bmp.InitializeSample(File.DirDefaultExternal &\"/";
_bmp.InitializeSample(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal()+"/parsik/AksKala",_codekala+".jpg",anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2800)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2800)));
RDebugUtils.currentLine=15663119;
 //BA.debugLineNum = 15663119;BA.debugLine="If RotatePic Then";
if (_rotatepic) { 
RDebugUtils.currentLine=15663120;
 //BA.debugLineNum = 15663120;BA.debugLine="Return bmp.Rotate(180)";
if (true) return _bmp.Rotate((float) (180));
 }else {
RDebugUtils.currentLine=15663122;
 //BA.debugLineNum = 15663122;BA.debugLine="Return bmp";
if (true) return _bmp;
 };
 };
RDebugUtils.currentLine=15663125;
 //BA.debugLineNum = 15663125;BA.debugLine="End Sub";
return null;
}
public static String  _getpickalapath(anywheresoftware.b4a.BA _ba,String _codekala) throws Exception{
RDebugUtils.currentModule="mcode";
if (Debug.shouldDelegate(null, "getpickalapath", false))
	 {return ((String) Debug.delegate(null, "getpickalapath", new Object[] {_ba,_codekala}));}
RDebugUtils.currentLine=15859712;
 //BA.debugLineNum = 15859712;BA.debugLine="Public Sub GetPicKalaPath(CodeKala As String) As S";
RDebugUtils.currentLine=15859713;
 //BA.debugLineNum = 15859713;BA.debugLine="If File.Exists(File.DirDefaultExternal &\"/parsik/";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal()+"/parsik/AksKala",_codekala+".jpg")==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=15859715;
 //BA.debugLineNum = 15859715;BA.debugLine="Return File.Combine(File.DirAssets,\"icon.png\")";
if (true) return anywheresoftware.b4a.keywords.Common.File.Combine(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"icon.png");
 }else {
RDebugUtils.currentLine=15859718;
 //BA.debugLineNum = 15859718;BA.debugLine="Return File.Combine(File.DirDefaultExternal &\"/p";
if (true) return anywheresoftware.b4a.keywords.Common.File.Combine(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal()+"/parsik/AksKala",_codekala+".jpg");
 };
RDebugUtils.currentLine=15859720;
 //BA.debugLineNum = 15859720;BA.debugLine="End Sub";
return "";
}
public static String  _getupdatefeesabad(anywheresoftware.b4a.BA _ba,String _str,String _codekala) throws Exception{
RDebugUtils.currentModule="mcode";
if (Debug.shouldDelegate(null, "getupdatefeesabad", false))
	 {return ((String) Debug.delegate(null, "getupdatefeesabad", new Object[] {_ba,_str,_codekala}));}
int _i = 0;
ir.parsikhesab.pakhsh.mcode._adapterchangefeekala _item = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
RDebugUtils.currentLine=16777216;
 //BA.debugLineNum = 16777216;BA.debugLine="Sub GetUpdateFeeSabad(str As String,codeKala As St";
RDebugUtils.currentLine=16777218;
 //BA.debugLineNum = 16777218;BA.debugLine="If lstChangeFeeKala.Size>0 Then";
if (_lstchangefeekala.getSize()>0) { 
RDebugUtils.currentLine=16777219;
 //BA.debugLineNum = 16777219;BA.debugLine="For i=0 To lstChangeFeeKala.Size-1";
{
final int step2 = 1;
final int limit2 = (int) (_lstchangefeekala.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=16777220;
 //BA.debugLineNum = 16777220;BA.debugLine="Dim Item = lstChangeFeeKala.Get(i) As AdapterCh";
_item = (ir.parsikhesab.pakhsh.mcode._adapterchangefeekala)(_lstchangefeekala.Get(_i));
RDebugUtils.currentLine=16777221;
 //BA.debugLineNum = 16777221;BA.debugLine="If Item.FldCodKala=codeKala Then";
if ((_item.FldCodKala /*String*/ ).equals(_codekala)) { 
RDebugUtils.currentLine=16777222;
 //BA.debugLineNum = 16777222;BA.debugLine="str=Item.FldFee";
_str = _item.FldFee /*String*/ ;
RDebugUtils.currentLine=16777223;
 //BA.debugLineNum = 16777223;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 }else {
RDebugUtils.currentLine=16777227;
 //BA.debugLineNum = 16777227;BA.debugLine="Dim cu As Cursor=Result(\"select * from TblSabad";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = _result(_ba,"select * from TblSabad where FldCodeKala="+_codekala);
RDebugUtils.currentLine=16777228;
 //BA.debugLineNum = 16777228;BA.debugLine="If cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=16777229;
 //BA.debugLineNum = 16777229;BA.debugLine="SaveUpdate(\"Update TblSabad Set  FldFeeForoosh=";
_saveupdate(_ba,"Update TblSabad Set  FldFeeForoosh="+_str+",FldupdateFee=NULL where FldCodeKala="+_codekala);
 };
 };
RDebugUtils.currentLine=16777232;
 //BA.debugLineNum = 16777232;BA.debugLine="Return str";
if (true) return _str;
RDebugUtils.currentLine=16777233;
 //BA.debugLineNum = 16777233;BA.debugLine="End Sub";
return "";
}
public static String  _interval(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="mcode";
if (Debug.shouldDelegate(null, "interval", false))
	 {return ((String) Debug.delegate(null, "interval", new Object[] {_ba}));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
RDebugUtils.currentLine=13107200;
 //BA.debugLineNum = 13107200;BA.debugLine="Sub Interval As String";
RDebugUtils.currentLine=13107201;
 //BA.debugLineNum = 13107201;BA.debugLine="Dim Cu As Cursor = Sql1.ExecQuery(\"Select FldInte";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_sql1.ExecQuery("Select FldIntervalGps From TblSetting")));
RDebugUtils.currentLine=13107202;
 //BA.debugLineNum = 13107202;BA.debugLine="Cu.Position=0";
_cu.setPosition((int) (0));
RDebugUtils.currentLine=13107203;
 //BA.debugLineNum = 13107203;BA.debugLine="Return Cu.GetString(\"FldIntervalGps\") * 60 * 1000";
if (true) return BA.NumberToString((double)(Double.parseDouble(_cu.GetString("FldIntervalGps")))*60*1000);
RDebugUtils.currentLine=13107204;
 //BA.debugLineNum = 13107204;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.List  _loadacspnoetasvie(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="mcode";
if (Debug.shouldDelegate(null, "loadacspnoetasvie", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(null, "loadacspnoetasvie", new Object[] {_ba}));}
anywheresoftware.b4a.objects.collections.List _listtasvie = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
String[] _somearray = null;
int _i = 0;
ir.parsikhesab.pakhsh.mcode._adapterlistnoetasvie _item = null;
RDebugUtils.currentLine=16318464;
 //BA.debugLineNum = 16318464;BA.debugLine="Sub LoadAcSpNoeTasvie As List";
RDebugUtils.currentLine=16318465;
 //BA.debugLineNum = 16318465;BA.debugLine="Try";
try {RDebugUtils.currentLine=16318466;
 //BA.debugLineNum = 16318466;BA.debugLine="Dim ListTasvie As List";
_listtasvie = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=16318467;
 //BA.debugLineNum = 16318467;BA.debugLine="ListTasvie.Initialize";
_listtasvie.Initialize();
RDebugUtils.currentLine=16318468;
 //BA.debugLineNum = 16318468;BA.debugLine="Dim Cu As Cursor = Result(\"Select * From TblTasvi";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = _result(_ba,"Select * From TblTasvie");
RDebugUtils.currentLine=16318469;
 //BA.debugLineNum = 16318469;BA.debugLine="Dim SomeArray(Cu.RowCount+1) As String";
_somearray = new String[(int) (_cu.getRowCount()+1)];
java.util.Arrays.fill(_somearray,"");
RDebugUtils.currentLine=16318470;
 //BA.debugLineNum = 16318470;BA.debugLine="SomeArray(0)=\"انتخاب کنید\"";
_somearray[(int) (0)] = "انتخاب کنید";
RDebugUtils.currentLine=16318471;
 //BA.debugLineNum = 16318471;BA.debugLine="If Cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=16318472;
 //BA.debugLineNum = 16318472;BA.debugLine="For i = 0 To Cu.RowCount-1";
{
final int step8 = 1;
final int limit8 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
RDebugUtils.currentLine=16318473;
 //BA.debugLineNum = 16318473;BA.debugLine="Cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=16318474;
 //BA.debugLineNum = 16318474;BA.debugLine="Dim Item As AdapterListNoeTasvie";
_item = new ir.parsikhesab.pakhsh.mcode._adapterlistnoetasvie();
RDebugUtils.currentLine=16318475;
 //BA.debugLineNum = 16318475;BA.debugLine="Item.FldC_Tasvie=Cu.GetString(\"FldCode\")";
_item.FldC_Tasvie /*String*/  = _cu.GetString("FldCode");
RDebugUtils.currentLine=16318476;
 //BA.debugLineNum = 16318476;BA.debugLine="Item.FldN_Tasvie=Cu.GetString(\"FldName\")";
_item.FldN_Tasvie /*String*/  = _cu.GetString("FldName");
RDebugUtils.currentLine=16318477;
 //BA.debugLineNum = 16318477;BA.debugLine="ListTasvie.Add(Item)";
_listtasvie.Add((Object)(_item));
RDebugUtils.currentLine=16318479;
 //BA.debugLineNum = 16318479;BA.debugLine="SomeArray(i+1)=Cu.GetString(\"FldName\")";
_somearray[(int) (_i+1)] = _cu.GetString("FldName");
 }
};
RDebugUtils.currentLine=16318481;
 //BA.debugLineNum = 16318481;BA.debugLine="ArrayTasvieForKala=SomeArray";
_arraytasvieforkala = _somearray;
 };
RDebugUtils.currentLine=16318483;
 //BA.debugLineNum = 16318483;BA.debugLine="Return ListTasvie";
if (true) return _listtasvie;
 } 
       catch (Exception e20) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e20);RDebugUtils.currentLine=16318486;
 //BA.debugLineNum = 16318486;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("516318486",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)),0);
 };
RDebugUtils.currentLine=16318488;
 //BA.debugLineNum = 16318488;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _loadeshantiongroup(anywheresoftware.b4a.BA _ba,String _codegroup) throws Exception{
RDebugUtils.currentModule="mcode";
if (Debug.shouldDelegate(null, "loadeshantiongroup", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(null, "loadeshantiongroup", new Object[] {_ba,_codegroup}));}
anywheresoftware.b4a.objects.collections.List _lst = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
int _i = 0;
ir.parsikhesab.pakhsh.mcode._adapterlisteshantiongroup _item = null;
RDebugUtils.currentLine=15269888;
 //BA.debugLineNum = 15269888;BA.debugLine="Public Sub LoadEshantionGroup(CodeGroup As String)";
RDebugUtils.currentLine=15269889;
 //BA.debugLineNum = 15269889;BA.debugLine="Dim lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=15269890;
 //BA.debugLineNum = 15269890;BA.debugLine="lst.Initialize";
_lst.Initialize();
RDebugUtils.currentLine=15269891;
 //BA.debugLineNum = 15269891;BA.debugLine="Dim cu As Cursor=Result(\"select * from tblEshanti";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = _result(_ba,"select * from tblEshantionGroup where fldCodeGroupKala="+_codegroup);
RDebugUtils.currentLine=15269892;
 //BA.debugLineNum = 15269892;BA.debugLine="If	cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=15269893;
 //BA.debugLineNum = 15269893;BA.debugLine="For i=0 To cu.RowCount-1";
{
final int step5 = 1;
final int limit5 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=15269894;
 //BA.debugLineNum = 15269894;BA.debugLine="cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=15269895;
 //BA.debugLineNum = 15269895;BA.debugLine="Dim item As AdapterListEshantionGroup";
_item = new ir.parsikhesab.pakhsh.mcode._adapterlisteshantiongroup();
RDebugUtils.currentLine=15269896;
 //BA.debugLineNum = 15269896;BA.debugLine="item.ID=cu.GetString(\"ID\")";
_item.ID /*String*/  = _cu.GetString("ID");
RDebugUtils.currentLine=15269897;
 //BA.debugLineNum = 15269897;BA.debugLine="item.fldCodeGroupKala=cu.GetString(\"fldCodeGrou";
_item.fldCodeGroupKala /*String*/  = _cu.GetString("fldCodeGroupKala");
RDebugUtils.currentLine=15269898;
 //BA.debugLineNum = 15269898;BA.debugLine="item.fldTedadForoosh=cu.GetString(\"fldTedadForo";
_item.fldTedadForoosh /*String*/  = _cu.GetString("fldTedadForoosh");
RDebugUtils.currentLine=15269899;
 //BA.debugLineNum = 15269899;BA.debugLine="item.fldTedadEshantion=cu.GetString(\"fldTedadEs";
_item.fldTedadEshantion /*String*/  = _cu.GetString("fldTedadEshantion");
RDebugUtils.currentLine=15269900;
 //BA.debugLineNum = 15269900;BA.debugLine="item.fldCodeGroupKalaEshantion=cu.GetString(\"fl";
_item.fldCodeGroupKalaEshantion /*String*/  = _cu.GetString("fldCodeGroupKalaEshantion");
RDebugUtils.currentLine=15269901;
 //BA.debugLineNum = 15269901;BA.debugLine="item.fldShomareTabaghe=cu.GetString(\"fldShomare";
_item.fldShomareTabaghe /*String*/  = _cu.GetString("fldShomareTabaghe");
RDebugUtils.currentLine=15269902;
 //BA.debugLineNum = 15269902;BA.debugLine="lst.Add(item)";
_lst.Add((Object)(_item));
 }
};
RDebugUtils.currentLine=15269904;
 //BA.debugLineNum = 15269904;BA.debugLine="Return lst";
if (true) return _lst;
 };
RDebugUtils.currentLine=15269906;
 //BA.debugLineNum = 15269906;BA.debugLine="Return Null";
if (true) return (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=15269907;
 //BA.debugLineNum = 15269907;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _loadeshantiontabaghati(anywheresoftware.b4a.BA _ba,String _codekala) throws Exception{
RDebugUtils.currentModule="mcode";
if (Debug.shouldDelegate(null, "loadeshantiontabaghati", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(null, "loadeshantiontabaghati", new Object[] {_ba,_codekala}));}
anywheresoftware.b4a.objects.collections.List _lst = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
int _i = 0;
ir.parsikhesab.pakhsh.mcode._adapterlisteshantion _item = null;
RDebugUtils.currentLine=15335424;
 //BA.debugLineNum = 15335424;BA.debugLine="Public Sub LoadEshantionTabaghati(CodeKala As Stri";
RDebugUtils.currentLine=15335425;
 //BA.debugLineNum = 15335425;BA.debugLine="Dim lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=15335426;
 //BA.debugLineNum = 15335426;BA.debugLine="lst.Initialize";
_lst.Initialize();
RDebugUtils.currentLine=15335427;
 //BA.debugLineNum = 15335427;BA.debugLine="Dim cu As Cursor=Result(\"select * from tblEshanti";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = _result(_ba,"select * from tblEshantionTabaghati where fldCodeKalaForoosh="+_codekala);
RDebugUtils.currentLine=15335428;
 //BA.debugLineNum = 15335428;BA.debugLine="If	cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=15335429;
 //BA.debugLineNum = 15335429;BA.debugLine="For i=0 To cu.RowCount-1";
{
final int step5 = 1;
final int limit5 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=15335430;
 //BA.debugLineNum = 15335430;BA.debugLine="cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=15335431;
 //BA.debugLineNum = 15335431;BA.debugLine="Dim item As AdapterListEshantion";
_item = new ir.parsikhesab.pakhsh.mcode._adapterlisteshantion();
RDebugUtils.currentLine=15335432;
 //BA.debugLineNum = 15335432;BA.debugLine="item.ID=cu.GetString(\"ID\")";
_item.ID /*String*/  = _cu.GetString("ID");
RDebugUtils.currentLine=15335433;
 //BA.debugLineNum = 15335433;BA.debugLine="item.fldCodeKalaForoosh=cu.GetString(\"fldCodeKa";
_item.fldCodeKalaForoosh /*String*/  = _cu.GetString("fldCodeKalaForoosh");
RDebugUtils.currentLine=15335434;
 //BA.debugLineNum = 15335434;BA.debugLine="item.fldTedadForoosh=cu.GetString(\"fldTedadForo";
_item.fldTedadForoosh /*String*/  = _cu.GetString("fldTedadForoosh");
RDebugUtils.currentLine=15335435;
 //BA.debugLineNum = 15335435;BA.debugLine="item.fldTedadEshantion=cu.GetString(\"fldTedadEs";
_item.fldTedadEshantion /*String*/  = _cu.GetString("fldTedadEshantion");
RDebugUtils.currentLine=15335436;
 //BA.debugLineNum = 15335436;BA.debugLine="item.fldCodeKalaEshantion=cu.GetString(\"fldCode";
_item.fldCodeKalaEshantion /*String*/  = _cu.GetString("fldCodeKalaEshantion");
RDebugUtils.currentLine=15335437;
 //BA.debugLineNum = 15335437;BA.debugLine="item.fldShomareTabaghe=cu.GetString(\"fldShomare";
_item.fldShomareTabaghe /*String*/  = _cu.GetString("fldShomareTabaghe");
RDebugUtils.currentLine=15335438;
 //BA.debugLineNum = 15335438;BA.debugLine="lst.Add(item)";
_lst.Add((Object)(_item));
 }
};
RDebugUtils.currentLine=15335440;
 //BA.debugLineNum = 15335440;BA.debugLine="Return lst";
if (true) return _lst;
 };
RDebugUtils.currentLine=15335442;
 //BA.debugLineNum = 15335442;BA.debugLine="Return Null";
if (true) return (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=15335443;
 //BA.debugLineNum = 15335443;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _loadlistkala(anywheresoftware.b4a.BA _ba,String _query) throws Exception{
RDebugUtils.currentModule="mcode";
if (Debug.shouldDelegate(null, "loadlistkala", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(null, "loadlistkala", new Object[] {_ba,_query}));}
anywheresoftware.b4a.objects.collections.List _orginallistkala = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
int _i = 0;
ir.parsikhesab.pakhsh.mcode._adapterlistkala _itemkala = null;
String _fee = "";
String _countsabad = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu1 = null;
int _fldfeeforoosh = 0;
int _fldtedaddarkarton = 0;
int _summande = 0;
long _sumkol = 0L;
RDebugUtils.currentLine=17039360;
 //BA.debugLineNum = 17039360;BA.debugLine="Sub LoadListKala(Query As String) As List";
RDebugUtils.currentLine=17039361;
 //BA.debugLineNum = 17039361;BA.debugLine="Try";
try {RDebugUtils.currentLine=17039362;
 //BA.debugLineNum = 17039362;BA.debugLine="Dim OrginalListKala As List";
_orginallistkala = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=17039363;
 //BA.debugLineNum = 17039363;BA.debugLine="OrginalListKala.Initialize";
_orginallistkala.Initialize();
RDebugUtils.currentLine=17039368;
 //BA.debugLineNum = 17039368;BA.debugLine="OrginalListKala.Clear";
_orginallistkala.Clear();
RDebugUtils.currentLine=17039369;
 //BA.debugLineNum = 17039369;BA.debugLine="Dim Cu As Cursor = Result(Query)";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = _result(_ba,_query);
RDebugUtils.currentLine=17039370;
 //BA.debugLineNum = 17039370;BA.debugLine="If Cu.RowCount > 0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=17039371;
 //BA.debugLineNum = 17039371;BA.debugLine="StopService(FusedLocationService)";
anywheresoftware.b4a.keywords.Common.StopService((_ba.processBA == null ? _ba : _ba.processBA),(Object)(mostCurrent._fusedlocationservice.getObject()));
RDebugUtils.currentLine=17039374;
 //BA.debugLineNum = 17039374;BA.debugLine="For i = 0 To Cu.RowCount - 1";
{
final int step8 = 1;
final int limit8 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
RDebugUtils.currentLine=17039375;
 //BA.debugLineNum = 17039375;BA.debugLine="Dim ItemKala As AdapterListKala";
_itemkala = new ir.parsikhesab.pakhsh.mcode._adapterlistkala();
RDebugUtils.currentLine=17039376;
 //BA.debugLineNum = 17039376;BA.debugLine="Cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=17039377;
 //BA.debugLineNum = 17039377;BA.debugLine="ItemKala.CodeGroup=Cu.Getstring(\"fldCodeGroup\"";
_itemkala.CodeGroup /*String*/  = _cu.GetString("fldCodeGroup");
RDebugUtils.currentLine=17039378;
 //BA.debugLineNum = 17039378;BA.debugLine="ItemKala.CodeKala=Cu.Getstring(\"fldCodeKala\")";
_itemkala.CodeKala /*String*/  = _cu.GetString("fldCodeKala");
RDebugUtils.currentLine=17039379;
 //BA.debugLineNum = 17039379;BA.debugLine="ItemKala.NameKala=Cu.Getstring(\"fldNameKala\")";
_itemkala.NameKala /*String*/  = _cu.GetString("fldNameKala");
RDebugUtils.currentLine=17039380;
 //BA.debugLineNum = 17039380;BA.debugLine="ItemKala.NameVahed=Cu.Getstring(\"fldNameVahed\"";
_itemkala.NameVahed /*String*/  = _cu.GetString("fldNameVahed");
RDebugUtils.currentLine=17039381;
 //BA.debugLineNum = 17039381;BA.debugLine="ItemKala.NameVahed2=Cu.Getstring(\"fldNameVahed";
_itemkala.NameVahed2 /*String*/  = _cu.GetString("fldNameVahed2");
RDebugUtils.currentLine=17039382;
 //BA.debugLineNum = 17039382;BA.debugLine="ItemKala.fldSharh=Cu.Getstring(\"fldSharh\")";
_itemkala.fldSharh /*String*/  = _cu.GetString("fldSharh");
RDebugUtils.currentLine=17039383;
 //BA.debugLineNum = 17039383;BA.debugLine="ItemKala.SumMande=Cu.Getstring(\"SumMande\")";
_itemkala.SumMande /*String*/  = _cu.GetString("SumMande");
RDebugUtils.currentLine=17039396;
 //BA.debugLineNum = 17039396;BA.debugLine="ItemKala.TedadDarKarton =Cu.Getstring(\"fldTeda";
_itemkala.TedadDarKarton /*String*/  = _cu.GetString("fldTedadDarKarton");
RDebugUtils.currentLine=17039399;
 //BA.debugLineNum = 17039399;BA.debugLine="Dim fee As String";
_fee = "";
RDebugUtils.currentLine=17039400;
 //BA.debugLineNum = 17039400;BA.debugLine="If feeTip=0 Then";
if ((_feetip).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=17039401;
 //BA.debugLineNum = 17039401;BA.debugLine="fee=Cu.GetInt(\"fldFeeForoosh\")";
_fee = BA.NumberToString(_cu.GetInt("fldFeeForoosh"));
 }else {
RDebugUtils.currentLine=17039407;
 //BA.debugLineNum = 17039407;BA.debugLine="fee=myCode.Is_Null_adad(Cu.GetString(\"fldFeeT";
_fee = mostCurrent._mycode._is_null_adad /*String*/ (_ba,_cu.GetString("fldFeeTasvie"));
RDebugUtils.currentLine=17039409;
 //BA.debugLineNum = 17039409;BA.debugLine="If 	IsNumber(fee) And fee>0 Then";
if (anywheresoftware.b4a.keywords.Common.IsNumber(_fee) && (double)(Double.parseDouble(_fee))>0) { 
RDebugUtils.currentLine=17039410;
 //BA.debugLineNum = 17039410;BA.debugLine="Log(Cu.GetString(\"fldFeeTasvie\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("517039410",_cu.GetString("fldFeeTasvie"),0);
RDebugUtils.currentLine=17039412;
 //BA.debugLineNum = 17039412;BA.debugLine="If  fee>Cu.GetString(\"fldFeeBadAzTakhfif\") T";
if ((double)(Double.parseDouble(_fee))>(double)(Double.parseDouble(_cu.GetString("fldFeeBadAzTakhfif")))) { 
RDebugUtils.currentLine=17039414;
 //BA.debugLineNum = 17039414;BA.debugLine="ItemKala.fldFeeBadAzTakhfif=\"0\"";
_itemkala.fldFeeBadAzTakhfif /*String*/  = "0";
 }else 
{RDebugUtils.currentLine=17039415;
 //BA.debugLineNum = 17039415;BA.debugLine="Else if fee<Cu.GetString(\"fldFeeBadAzTakhfif";
if ((double)(Double.parseDouble(_fee))<(double)(Double.parseDouble(_cu.GetString("fldFeeBadAzTakhfif")))) { 
RDebugUtils.currentLine=17039416;
 //BA.debugLineNum = 17039416;BA.debugLine="ItemKala.fldFeeBadAzTakhfif=fee";
_itemkala.fldFeeBadAzTakhfif /*String*/  = _fee;
RDebugUtils.currentLine=17039417;
 //BA.debugLineNum = 17039417;BA.debugLine="fee=Cu.GetInt(\"fldFeeForoosh\")";
_fee = BA.NumberToString(_cu.GetInt("fldFeeForoosh"));
 }else {
RDebugUtils.currentLine=17039421;
 //BA.debugLineNum = 17039421;BA.debugLine="ItemKala.fldFeeBadAzTakhfif=Cu.GetString(\"f";
_itemkala.fldFeeBadAzTakhfif /*String*/  = _cu.GetString("fldFeeBadAzTakhfif");
RDebugUtils.currentLine=17039422;
 //BA.debugLineNum = 17039422;BA.debugLine="fee=Cu.GetInt(\"fldFeeForoosh\")";
_fee = BA.NumberToString(_cu.GetInt("fldFeeForoosh"));
 }}
;
 }else {
RDebugUtils.currentLine=17039426;
 //BA.debugLineNum = 17039426;BA.debugLine="fee=Cu.GetInt(\"fldFeeForoosh\")";
_fee = BA.NumberToString(_cu.GetInt("fldFeeForoosh"));
 };
 };
RDebugUtils.currentLine=17039440;
 //BA.debugLineNum = 17039440;BA.debugLine="Dim countSabad As String=SingleResult(\"select";
_countsabad = BA.ObjectToString(_singleresult(_ba,"select count(FldId) from TblSabad where FldCodeKala="+_itemkala.CodeKala /*String*/ ));
RDebugUtils.currentLine=17039441;
 //BA.debugLineNum = 17039441;BA.debugLine="If countSabad>0 Then";
if ((double)(Double.parseDouble(_countsabad))>0) { 
RDebugUtils.currentLine=17039442;
 //BA.debugLineNum = 17039442;BA.debugLine="Dim cu1 As Cursor=Result(\"select * from TblSa";
_cu1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu1 = _result(_ba,"select * from TblSabad where FldCodeKala="+_itemkala.CodeKala /*String*/ );
RDebugUtils.currentLine=17039443;
 //BA.debugLineNum = 17039443;BA.debugLine="cu1.Position=0";
_cu1.setPosition((int) (0));
RDebugUtils.currentLine=17039444;
 //BA.debugLineNum = 17039444;BA.debugLine="feeTip=feeTip";
_feetip = _feetip;
RDebugUtils.currentLine=17039445;
 //BA.debugLineNum = 17039445;BA.debugLine="ItemKala.TedadDarSabadJoz =cu1.Getstring(\"Fld";
_itemkala.TedadDarSabadJoz /*String*/  = _cu1.GetString("FldTedadDarSabadJoz");
RDebugUtils.currentLine=17039446;
 //BA.debugLineNum = 17039446;BA.debugLine="ItemKala.TedadDarSabadKol =cu1.Getstring(\"Fld";
_itemkala.TedadDarSabadKol /*String*/  = _cu1.GetString("FldTedadDarSabadKol");
RDebugUtils.currentLine=17039447;
 //BA.debugLineNum = 17039447;BA.debugLine="ItemKala.SumMande=Cu.Getstring(\"SumMande\")-cu";
_itemkala.SumMande /*String*/  = BA.NumberToString((double)(Double.parseDouble(_cu.GetString("SumMande")))-(double)(Double.parseDouble(_cu1.GetString("FldTedadDarSabadJoz"))));
RDebugUtils.currentLine=17039448;
 //BA.debugLineNum = 17039448;BA.debugLine="If Cu.Getstring(\"fldNameVahed2\") <> \"\" Then";
if ((_cu.GetString("fldNameVahed2")).equals("") == false) { 
RDebugUtils.currentLine=17039449;
 //BA.debugLineNum = 17039449;BA.debugLine="Dim FldFeeForoosh As Int = Sf.Val(Cu.GetInt(";
_fldfeeforoosh = (int) (_sf._vvvvv1(BA.NumberToString(_cu.GetInt("fldFeeForoosh"))));
RDebugUtils.currentLine=17039450;
 //BA.debugLineNum = 17039450;BA.debugLine="Dim FldTedadDarKarton As Int = Sf.Val(cu1.Ge";
_fldtedaddarkarton = (int) (_sf._vvvvv1(_cu1.GetString("FldTedadDarSabadKol")));
RDebugUtils.currentLine=17039451;
 //BA.debugLineNum = 17039451;BA.debugLine="Dim SumMande As Int = Cu.Getstring(\"SumMande";
_summande = (int)(Double.parseDouble(_cu.GetString("SumMande")));
RDebugUtils.currentLine=17039452;
 //BA.debugLineNum = 17039452;BA.debugLine="ItemKala.FeeForooshKarton=FldFeeForoosh * Fl";
_itemkala.FeeForooshKarton /*String*/  = BA.NumberToString(_fldfeeforoosh*_fldtedaddarkarton);
RDebugUtils.currentLine=17039453;
 //BA.debugLineNum = 17039453;BA.debugLine="ItemKala.SumMandeKarton=Round2( SumMande / F";
_itemkala.SumMandeKarton /*String*/  = BA.NumberToString(anywheresoftware.b4a.keywords.Common.Round2(_summande/(double)_fldtedaddarkarton,(int) (0)));
 };
RDebugUtils.currentLine=17039456;
 //BA.debugLineNum = 17039456;BA.debugLine="If feeTip=0 Then";
if ((_feetip).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=17039457;
 //BA.debugLineNum = 17039457;BA.debugLine="fee=cu1.GetString(\"FldFeeForoosh\")";
_fee = _cu1.GetString("FldFeeForoosh");
 }else {
RDebugUtils.currentLine=17039459;
 //BA.debugLineNum = 17039459;BA.debugLine="fee=GetUpdateFeeSabad(fee,ItemKala.CodeKala)";
_fee = _getupdatefeesabad(_ba,_fee,_itemkala.CodeKala /*String*/ );
 };
RDebugUtils.currentLine=17039465;
 //BA.debugLineNum = 17039465;BA.debugLine="ItemKala.FldEshantion=cu1.Getstring(\"FldEshan";
_itemkala.FldEshantion /*String*/  = _cu1.GetString("FldEshantion");
RDebugUtils.currentLine=17039469;
 //BA.debugLineNum = 17039469;BA.debugLine="If myCode.Is_Null_adad(cu1.GetString(\"FldDars";
if ((double)(Double.parseDouble(mostCurrent._mycode._is_null_adad /*String*/ (_ba,_cu1.GetString("FldDarsadTakhfif"))))>0) { 
RDebugUtils.currentLine=17039473;
 //BA.debugLineNum = 17039473;BA.debugLine="ItemKala.fldDarsadTakhfif=cu1.GetString(\"Fld";
_itemkala.fldDarsadTakhfif /*String*/  = _cu1.GetString("FldDarsadTakhfif");
RDebugUtils.currentLine=17039474;
 //BA.debugLineNum = 17039474;BA.debugLine="ItemKala.MablaghTakhfif=((ItemKala.FeeForoos";
_itemkala.MablaghTakhfif /*int*/  = (int) (((_itemkala.FeeForoosh /*int*/ *(double)(Double.parseDouble(_cu1.GetString("FldDarsadTakhfif"))))/(double)100));
 }else {
RDebugUtils.currentLine=17039480;
 //BA.debugLineNum = 17039480;BA.debugLine="If cu1.GetString(\"FldMablaghTakhfif\")>0 And";
if ((double)(Double.parseDouble(_cu1.GetString("FldMablaghTakhfif")))>0 && _cu1.GetString("FldMablaghTakhfif")!= null) { 
RDebugUtils.currentLine=17039482;
 //BA.debugLineNum = 17039482;BA.debugLine="ItemKala.MablaghTakhfif=cu1.GetString(\"FldM";
_itemkala.MablaghTakhfif /*int*/  = (int)(Double.parseDouble(_cu1.GetString("FldMablaghTakhfif")));
RDebugUtils.currentLine=17039483;
 //BA.debugLineNum = 17039483;BA.debugLine="ItemKala.fldDarsadTakhfif=\"0\"";
_itemkala.fldDarsadTakhfif /*String*/  = "0";
 }else {
RDebugUtils.currentLine=17039487;
 //BA.debugLineNum = 17039487;BA.debugLine="ItemKala.MablaghTakhfif=\"0\"";
_itemkala.MablaghTakhfif /*int*/  = (int)(Double.parseDouble("0"));
RDebugUtils.currentLine=17039488;
 //BA.debugLineNum = 17039488;BA.debugLine="ItemKala.fldDarsadTakhfif=\"0\"";
_itemkala.fldDarsadTakhfif /*String*/  = "0";
 };
 };
RDebugUtils.currentLine=17039495;
 //BA.debugLineNum = 17039495;BA.debugLine="cu1.Close";
_cu1.Close();
 };
RDebugUtils.currentLine=17039499;
 //BA.debugLineNum = 17039499;BA.debugLine="If Cu.GetString(\"fldFeeBadAzTakhfif\")<>Null Th";
if (_cu.GetString("fldFeeBadAzTakhfif")!= null) { 
RDebugUtils.currentLine=17039501;
 //BA.debugLineNum = 17039501;BA.debugLine="ItemKala.fldFeeBadAzTakhfif=Cu.GetString(\"fld";
_itemkala.fldFeeBadAzTakhfif /*String*/  = _cu.GetString("fldFeeBadAzTakhfif");
 }else {
RDebugUtils.currentLine=17039505;
 //BA.debugLineNum = 17039505;BA.debugLine="ItemKala.fldFeeBadAzTakhfif=\"0\"";
_itemkala.fldFeeBadAzTakhfif /*String*/  = "0";
 };
RDebugUtils.currentLine=17039508;
 //BA.debugLineNum = 17039508;BA.debugLine="If ItemKala.MablaghTakhfif>0 Then";
if (_itemkala.MablaghTakhfif /*int*/ >0) { 
RDebugUtils.currentLine=17039509;
 //BA.debugLineNum = 17039509;BA.debugLine="ItemKala.fldFeeBadAzTakhfif=fee-ItemKala.Mabl";
_itemkala.fldFeeBadAzTakhfif /*String*/  = BA.NumberToString((double)(Double.parseDouble(_fee))-_itemkala.MablaghTakhfif /*int*/ );
 };
RDebugUtils.currentLine=17039512;
 //BA.debugLineNum = 17039512;BA.debugLine="ItemKala.FeeForoosh=fee";
_itemkala.FeeForoosh /*int*/  = (int)(Double.parseDouble(_fee));
RDebugUtils.currentLine=17039515;
 //BA.debugLineNum = 17039515;BA.debugLine="ItemKala.FldMablaghMasrafKonande=Cu.GetString(";
_itemkala.FldMablaghMasrafKonande /*String*/  = _cu.GetString("fldGhymatMasrafkonande");
RDebugUtils.currentLine=17039519;
 //BA.debugLineNum = 17039519;BA.debugLine="ItemKala.fldPathPic=Cu.GetString(\"fldPathPic\")";
_itemkala.fldPathPic /*String*/  = _cu.GetString("fldPathPic");
RDebugUtils.currentLine=17039526;
 //BA.debugLineNum = 17039526;BA.debugLine="If Cu.Getstring(\"fldNameVahed2\") <> \"\"  Then";
if ((_cu.GetString("fldNameVahed2")).equals("") == false) { 
RDebugUtils.currentLine=17039527;
 //BA.debugLineNum = 17039527;BA.debugLine="Dim FldFeeForoosh As Int = Sf.Val(Cu.GetInt(\"";
_fldfeeforoosh = (int) (_sf._vvvvv1(BA.NumberToString(_cu.GetInt("fldFeeForoosh"))));
RDebugUtils.currentLine=17039528;
 //BA.debugLineNum = 17039528;BA.debugLine="Dim FldTedadDarKarton As Int = Sf.Val(Cu.Gets";
_fldtedaddarkarton = (int) (_sf._vvvvv1(_cu.GetString("fldTedadDarKarton")));
RDebugUtils.currentLine=17039529;
 //BA.debugLineNum = 17039529;BA.debugLine="Dim SumMande As Int = Cu.Getstring(\"SumMande\"";
_summande = (int)(Double.parseDouble(_cu.GetString("SumMande")));
RDebugUtils.currentLine=17039530;
 //BA.debugLineNum = 17039530;BA.debugLine="If FldTedadDarKarton>0 Then";
if (_fldtedaddarkarton>0) { 
RDebugUtils.currentLine=17039531;
 //BA.debugLineNum = 17039531;BA.debugLine="ItemKala.FeeForooshKarton=FldFeeForoosh * Fl";
_itemkala.FeeForooshKarton /*String*/  = BA.NumberToString(_fldfeeforoosh*_fldtedaddarkarton);
RDebugUtils.currentLine=17039533;
 //BA.debugLineNum = 17039533;BA.debugLine="Dim SumKol As Long=(SumMande / FldTedadDarKa";
_sumkol = (long) ((_summande/(double)_fldtedaddarkarton));
RDebugUtils.currentLine=17039534;
 //BA.debugLineNum = 17039534;BA.debugLine="ItemKala.SumMandeKarton=SumKol";
_itemkala.SumMandeKarton /*String*/  = BA.NumberToString(_sumkol);
 }else {
RDebugUtils.currentLine=17039536;
 //BA.debugLineNum = 17039536;BA.debugLine="ItemKala.SumMandeKarton=0";
_itemkala.SumMandeKarton /*String*/  = BA.NumberToString(0);
 };
 };
RDebugUtils.currentLine=17039543;
 //BA.debugLineNum = 17039543;BA.debugLine="OrginalListKala.Add(ItemKala)";
_orginallistkala.Add((Object)(_itemkala));
 }
};
RDebugUtils.currentLine=17039548;
 //BA.debugLineNum = 17039548;BA.debugLine="Cu.Close";
_cu.Close();
 };
RDebugUtils.currentLine=17039562;
 //BA.debugLineNum = 17039562;BA.debugLine="Return OrginalListKala";
if (true) return _orginallistkala;
 } 
       catch (Exception e103) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e103);RDebugUtils.currentLine=17039565;
 //BA.debugLineNum = 17039565;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("517039565",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)),0);
RDebugUtils.currentLine=17039566;
 //BA.debugLineNum = 17039566;BA.debugLine="Log(LastException.Message)";
anywheresoftware.b4a.keywords.Common.LogImpl("517039566",anywheresoftware.b4a.keywords.Common.LastException(_ba).getMessage(),0);
RDebugUtils.currentLine=17039567;
 //BA.debugLineNum = 17039567;BA.debugLine="myCode.SendError(LastException.Message,\"LoadList";
mostCurrent._mycode._senderror /*void*/ (_ba,anywheresoftware.b4a.keywords.Common.LastException(_ba).getMessage(),"LoadListKala");
 };
RDebugUtils.currentLine=17039582;
 //BA.debugLineNum = 17039582;BA.debugLine="End Sub";
return null;
}
public static String  _miladitoshamsidate(anywheresoftware.b4a.BA _ba,String _str) throws Exception{
RDebugUtils.currentModule="mcode";
if (Debug.shouldDelegate(null, "miladitoshamsidate", false))
	 {return ((String) Debug.delegate(null, "miladitoshamsidate", new Object[] {_ba,_str}));}
String _t1 = "";
String _t2 = "";
String _t3 = "";
anywheresoftware.b4a.student.PersianDate _pcd = null;
RDebugUtils.currentLine=14811136;
 //BA.debugLineNum = 14811136;BA.debugLine="Sub MiladiToShamsiDate(str As String) As String";
RDebugUtils.currentLine=14811137;
 //BA.debugLineNum = 14811137;BA.debugLine="Dim T1,T2,T3 As String";
_t1 = "";
_t2 = "";
_t3 = "";
RDebugUtils.currentLine=14811138;
 //BA.debugLineNum = 14811138;BA.debugLine="Dim pcd As PersianDate";
_pcd = new anywheresoftware.b4a.student.PersianDate();
RDebugUtils.currentLine=14811139;
 //BA.debugLineNum = 14811139;BA.debugLine="Log(str.Length)";
anywheresoftware.b4a.keywords.Common.LogImpl("514811139",BA.NumberToString(_str.length()),0);
RDebugUtils.currentLine=14811140;
 //BA.debugLineNum = 14811140;BA.debugLine="T1=str.SubString2(0,4) '13981120";
_t1 = _str.substring((int) (0),(int) (4));
RDebugUtils.currentLine=14811141;
 //BA.debugLineNum = 14811141;BA.debugLine="T2=str.SubString2(4,6)'11";
_t2 = _str.substring((int) (4),(int) (6));
RDebugUtils.currentLine=14811142;
 //BA.debugLineNum = 14811142;BA.debugLine="T3=str.SubString2(6,8)'20";
_t3 = _str.substring((int) (6),(int) (8));
RDebugUtils.currentLine=14811143;
 //BA.debugLineNum = 14811143;BA.debugLine="If T2.Length=1 Then";
if (_t2.length()==1) { 
RDebugUtils.currentLine=14811144;
 //BA.debugLineNum = 14811144;BA.debugLine="T2=\"0\"&T2";
_t2 = "0"+_t2;
 };
RDebugUtils.currentLine=14811146;
 //BA.debugLineNum = 14811146;BA.debugLine="If T3.Length=1 Then";
if (_t3.length()==1) { 
RDebugUtils.currentLine=14811147;
 //BA.debugLineNum = 14811147;BA.debugLine="T3=\"0\"&T3";
_t3 = "0"+_t3;
 };
RDebugUtils.currentLine=14811149;
 //BA.debugLineNum = 14811149;BA.debugLine="Return pcd.getDate(T1,T2,T3,\"/\")";
if (true) return _pcd.getDate((int)(Double.parseDouble(_t1)),(int)(Double.parseDouble(_t2)),(int)(Double.parseDouble(_t3)),"/");
RDebugUtils.currentLine=14811150;
 //BA.debugLineNum = 14811150;BA.debugLine="End Sub";
return "";
}
public static long  _mohasbearzeshafzode(anywheresoftware.b4a.BA _ba,long _sum) throws Exception{
RDebugUtils.currentModule="mcode";
if (Debug.shouldDelegate(null, "mohasbearzeshafzode", false))
	 {return ((Long) Debug.delegate(null, "mohasbearzeshafzode", new Object[] {_ba,_sum}));}
RDebugUtils.currentLine=17432576;
 //BA.debugLineNum = 17432576;BA.debugLine="Sub MohasbeArzeshAfzode(Sum As Long) As Long";
RDebugUtils.currentLine=17432577;
 //BA.debugLineNum = 17432577;BA.debugLine="If ArzeshAfzodeEnable=1 Then";
if ((_arzeshafzodeenable).equals(BA.NumberToString(1))) { 
RDebugUtils.currentLine=17432578;
 //BA.debugLineNum = 17432578;BA.debugLine="Return Sum*(ArzeshAfzode/100)";
if (true) return (long) (_sum*((double)(Double.parseDouble(_arzeshafzode))/(double)100));
 }else {
RDebugUtils.currentLine=17432580;
 //BA.debugLineNum = 17432580;BA.debugLine="Return 0";
if (true) return (long) (0);
 };
RDebugUtils.currentLine=17432582;
 //BA.debugLineNum = 17432582;BA.debugLine="End Sub";
return 0L;
}
public static long  _mohasbearzeshafzodekala(anywheresoftware.b4a.BA _ba,long _sum,String _arzeshafzodekala) throws Exception{
RDebugUtils.currentModule="mcode";
if (Debug.shouldDelegate(null, "mohasbearzeshafzodekala", false))
	 {return ((Long) Debug.delegate(null, "mohasbearzeshafzodekala", new Object[] {_ba,_sum,_arzeshafzodekala}));}
RDebugUtils.currentLine=17498112;
 //BA.debugLineNum = 17498112;BA.debugLine="Sub MohasbeArzeshAfzodeKala(Sum As Long,ArzeshAfzo";
RDebugUtils.currentLine=17498113;
 //BA.debugLineNum = 17498113;BA.debugLine="If myCode.Is_Null_adad(ArzeshAfzodeKala)>0 Then";
if ((double)(Double.parseDouble(mostCurrent._mycode._is_null_adad /*String*/ (_ba,_arzeshafzodekala)))>0) { 
RDebugUtils.currentLine=17498114;
 //BA.debugLineNum = 17498114;BA.debugLine="Return Sum*(ArzeshAfzodeKala/100)";
if (true) return (long) (_sum*((double)(Double.parseDouble(_arzeshafzodekala))/(double)100));
 }else 
{RDebugUtils.currentLine=17498115;
 //BA.debugLineNum = 17498115;BA.debugLine="Else If ArzeshAfzodeEnable=1 And  myCode.Is_Null_";
if ((_arzeshafzodeenable).equals(BA.NumberToString(1)) && (mostCurrent._mycode._is_null_adad /*String*/ (_ba,_arzeshafzodekala)).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=17498116;
 //BA.debugLineNum = 17498116;BA.debugLine="Return Sum*(ArzeshAfzode/100)";
if (true) return (long) (_sum*((double)(Double.parseDouble(_arzeshafzode))/(double)100));
 }else {
RDebugUtils.currentLine=17498118;
 //BA.debugLineNum = 17498118;BA.debugLine="Return 0";
if (true) return (long) (0);
 }}
;
RDebugUtils.currentLine=17498120;
 //BA.debugLineNum = 17498120;BA.debugLine="End Sub";
return 0L;
}
public static String  _printer(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="mcode";
if (Debug.shouldDelegate(null, "printer", false))
	 {return ((String) Debug.delegate(null, "printer", new Object[] {_ba}));}
anywheresoftware.b4a.objects.collections.Map _paireddevices = null;
anywheresoftware.b4a.objects.collections.List _l = null;
String _devicename = "";
String _macaddress = "";
int _i = 0;
RDebugUtils.currentLine=14548992;
 //BA.debugLineNum = 14548992;BA.debugLine="Sub Printer";
RDebugUtils.currentLine=14548993;
 //BA.debugLineNum = 14548993;BA.debugLine="BtAdmin.Initialize(\"BlueTooth\")";
_btadmin.Initialize((_ba.processBA == null ? _ba : _ba.processBA),"BlueTooth");
RDebugUtils.currentLine=14548994;
 //BA.debugLineNum = 14548994;BA.debugLine="BTConnection.Initialize(\"Printer\")";
_btconnection.Initialize("Printer");
RDebugUtils.currentLine=14548995;
 //BA.debugLineNum = 14548995;BA.debugLine="If BTConnection.IsEnabled=True Then";
if (_btconnection.IsEnabled()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=14548996;
 //BA.debugLineNum = 14548996;BA.debugLine="Dim PairedDevices As Map";
_paireddevices = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14548997;
 //BA.debugLineNum = 14548997;BA.debugLine="PairedDevices = BTConnection.GetPairedDevices";
_paireddevices = _btconnection.GetPairedDevices();
RDebugUtils.currentLine=14548998;
 //BA.debugLineNum = 14548998;BA.debugLine="Dim l As List";
_l = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=14548999;
 //BA.debugLineNum = 14548999;BA.debugLine="Dim DeviceName, MacAddress As String";
_devicename = "";
_macaddress = "";
RDebugUtils.currentLine=14549000;
 //BA.debugLineNum = 14549000;BA.debugLine="l.Initialize";
_l.Initialize();
RDebugUtils.currentLine=14549001;
 //BA.debugLineNum = 14549001;BA.debugLine="For i = 0 To PairedDevices.Size - 1 'Check all de";
{
final int step9 = 1;
final int limit9 = (int) (_paireddevices.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=14549002;
 //BA.debugLineNum = 14549002;BA.debugLine="l.Add(PairedDevices.GetKeyAt(i))";
_l.Add(_paireddevices.GetKeyAt(_i));
RDebugUtils.currentLine=14549003;
 //BA.debugLineNum = 14549003;BA.debugLine="DeviceName=PairedDevices.Getkeyat(i)";
_devicename = BA.ObjectToString(_paireddevices.GetKeyAt(_i));
RDebugUtils.currentLine=14549004;
 //BA.debugLineNum = 14549004;BA.debugLine="MacAddress=PairedDevices.GetValueAt(i)";
_macaddress = BA.ObjectToString(_paireddevices.GetValueAt(_i));
RDebugUtils.currentLine=14549005;
 //BA.debugLineNum = 14549005;BA.debugLine="Log(DeviceName & \" -> \" & MacAddress)";
anywheresoftware.b4a.keywords.Common.LogImpl("514549005",_devicename+" -> "+_macaddress,0);
RDebugUtils.currentLine=14549006;
 //BA.debugLineNum = 14549006;BA.debugLine="If DeviceName.Contains(\"Thermal\") Then 'Insert";
if (_devicename.contains("Thermal")) { 
RDebugUtils.currentLine=14549007;
 //BA.debugLineNum = 14549007;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=14549010;
 //BA.debugLineNum = 14549010;BA.debugLine="BTConnection.Connect(MacAddress)";
_btconnection.Connect((_ba.processBA == null ? _ba : _ba.processBA),_macaddress);
 }else {
RDebugUtils.currentLine=14549012;
 //BA.debugLineNum = 14549012;BA.debugLine="ToastMessageShow(\"بلوتوث گوشی شما غیر فعال می با";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("بلوتوث گوشی شما غیر فعال می باشد"),anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=14549015;
 //BA.debugLineNum = 14549015;BA.debugLine="End Sub";
return "";
}
public static String  _qomaashar(anywheresoftware.b4a.BA _ba,Object _str) throws Exception{
RDebugUtils.currentModule="mcode";
if (Debug.shouldDelegate(null, "qomaashar", false))
	 {return ((String) Debug.delegate(null, "qomaashar", new Object[] {_ba,_str}));}
String _d = "";
double _doub = 0;
RDebugUtils.currentLine=14352384;
 //BA.debugLineNum = 14352384;BA.debugLine="Sub qomaAshar(str As Object) As String";
RDebugUtils.currentLine=14352385;
 //BA.debugLineNum = 14352385;BA.debugLine="Dim d As String";
_d = "";
RDebugUtils.currentLine=14352386;
 //BA.debugLineNum = 14352386;BA.debugLine="Dim doub As Double";
_doub = 0;
RDebugUtils.currentLine=14352387;
 //BA.debugLineNum = 14352387;BA.debugLine="If str <>\"\" Then";
if ((_str).equals((Object)("")) == false) { 
RDebugUtils.currentLine=14352388;
 //BA.debugLineNum = 14352388;BA.debugLine="doub=str";
_doub = (double)(BA.ObjectToNumber(_str));
RDebugUtils.currentLine=14352389;
 //BA.debugLineNum = 14352389;BA.debugLine="d=NumberFormat(doub,0,0)";
_d = anywheresoftware.b4a.keywords.Common.NumberFormat(_doub,(int) (0),(int) (0));
 };
RDebugUtils.currentLine=14352392;
 //BA.debugLineNum = 14352392;BA.debugLine="Return d";
if (true) return _d;
RDebugUtils.currentLine=14352393;
 //BA.debugLineNum = 14352393;BA.debugLine="End Sub";
return "";
}
public static int  _removeqomaashar(anywheresoftware.b4a.BA _ba,String _s) throws Exception{
RDebugUtils.currentModule="mcode";
if (Debug.shouldDelegate(null, "removeqomaashar", false))
	 {return ((Integer) Debug.delegate(null, "removeqomaashar", new Object[] {_ba,_s}));}
int _num = 0;
RDebugUtils.currentLine=14417920;
 //BA.debugLineNum = 14417920;BA.debugLine="Sub RemoveqomaAshar(S As String) As Int";
RDebugUtils.currentLine=14417921;
 //BA.debugLineNum = 14417921;BA.debugLine="Dim Num As Int";
_num = 0;
RDebugUtils.currentLine=14417922;
 //BA.debugLineNum = 14417922;BA.debugLine="S=s.Replace(\",\",\"\")";
_s = _s.replace(",","");
RDebugUtils.currentLine=14417923;
 //BA.debugLineNum = 14417923;BA.debugLine="Num=S";
_num = (int)(Double.parseDouble(_s));
RDebugUtils.currentLine=14417924;
 //BA.debugLineNum = 14417924;BA.debugLine="Return Num";
if (true) return _num;
RDebugUtils.currentLine=14417925;
 //BA.debugLineNum = 14417925;BA.debugLine="End Sub";
return 0;
}
public static boolean  _savejsonfile(anywheresoftware.b4a.BA _ba,String _fileroot,String _filename,anywheresoftware.b4a.objects.collections.List _data) throws Exception{
RDebugUtils.currentModule="mcode";
if (Debug.shouldDelegate(null, "savejsonfile", false))
	 {return ((Boolean) Debug.delegate(null, "savejsonfile", new Object[] {_ba,_fileroot,_filename,_data}));}
boolean _b = false;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _jsongenerator = null;
RDebugUtils.currentLine=15925248;
 //BA.debugLineNum = 15925248;BA.debugLine="Public Sub SaveJsonFile(fileRoot As String,filenam";
RDebugUtils.currentLine=15925249;
 //BA.debugLineNum = 15925249;BA.debugLine="Dim b As Boolean=False";
_b = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=15925250;
 //BA.debugLineNum = 15925250;BA.debugLine="Try";
try {RDebugUtils.currentLine=15925251;
 //BA.debugLineNum = 15925251;BA.debugLine="If File.Exists(fileRoot,filename)=False Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_fileroot,_filename)==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=15925252;
 //BA.debugLineNum = 15925252;BA.debugLine="File.MakeDir(fileRoot,filename)";
anywheresoftware.b4a.keywords.Common.File.MakeDir(_fileroot,_filename);
 };
RDebugUtils.currentLine=15925254;
 //BA.debugLineNum = 15925254;BA.debugLine="Dim JSONGenerator As JSONGenerator";
_jsongenerator = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=15925255;
 //BA.debugLineNum = 15925255;BA.debugLine="JSONGenerator.Initialize2(data)";
_jsongenerator.Initialize2(_data);
RDebugUtils.currentLine=15925256;
 //BA.debugLineNum = 15925256;BA.debugLine="File.WriteString(fileRoot,filename,JSONGenerator";
anywheresoftware.b4a.keywords.Common.File.WriteString(_fileroot,_filename,_jsongenerator.ToPrettyString((int) (2)));
RDebugUtils.currentLine=15925257;
 //BA.debugLineNum = 15925257;BA.debugLine="b=True";
_b = anywheresoftware.b4a.keywords.Common.True;
 } 
       catch (Exception e11) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e11);RDebugUtils.currentLine=15925259;
 //BA.debugLineNum = 15925259;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("515925259",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)),0);
RDebugUtils.currentLine=15925260;
 //BA.debugLineNum = 15925260;BA.debugLine="b=False";
_b = anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=15925262;
 //BA.debugLineNum = 15925262;BA.debugLine="Return b";
if (true) return _b;
RDebugUtils.currentLine=15925263;
 //BA.debugLineNum = 15925263;BA.debugLine="End Sub";
return false;
}
public static String  _savelocationtodb(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="mcode";
if (Debug.shouldDelegate(null, "savelocationtodb", false))
	 {return ((String) Debug.delegate(null, "savelocationtodb", new Object[] {_ba}));}
RDebugUtils.currentLine=16580608;
 //BA.debugLineNum = 16580608;BA.debugLine="Sub SaveLocationToDb";
RDebugUtils.currentLine=16580655;
 //BA.debugLineNum = 16580655;BA.debugLine="End Sub";
return "";
}
public static String  _savelog(anywheresoftware.b4a.BA _ba,String _str) throws Exception{
RDebugUtils.currentModule="mcode";
if (Debug.shouldDelegate(null, "savelog", false))
	 {return ((String) Debug.delegate(null, "savelog", new Object[] {_ba,_str}));}
RDebugUtils.currentLine=13238272;
 //BA.debugLineNum = 13238272;BA.debugLine="Sub SaveLog(str As String)";
RDebugUtils.currentLine=13238274;
 //BA.debugLineNum = 13238274;BA.debugLine="File.WriteString(File.DirDefaultExternal &\"/Parsi";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal()+"/Parsik/Backup","log.txt",_str);
RDebugUtils.currentLine=13238275;
 //BA.debugLineNum = 13238275;BA.debugLine="End Sub";
return "";
}
public static String  _senderror(anywheresoftware.b4a.BA _ba,String _text) throws Exception{
RDebugUtils.currentModule="mcode";
if (Debug.shouldDelegate(null, "senderror", false))
	 {return ((String) Debug.delegate(null, "senderror", new Object[] {_ba,_text}));}
RDebugUtils.currentLine=15597568;
 //BA.debugLineNum = 15597568;BA.debugLine="Public Sub SendError(Text As String)";
RDebugUtils.currentLine=15597571;
 //BA.debugLineNum = 15597571;BA.debugLine="Log(Text)";
anywheresoftware.b4a.keywords.Common.LogImpl("515597571",_text,0);
RDebugUtils.currentLine=15597573;
 //BA.debugLineNum = 15597573;BA.debugLine="End Sub";
return "";
}
public static String  _updatedatabaseold(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="mcode";
if (Debug.shouldDelegate(null, "updatedatabaseold", false))
	 {return ((String) Debug.delegate(null, "updatedatabaseold", new Object[] {_ba}));}
RDebugUtils.currentLine=13631488;
 //BA.debugLineNum = 13631488;BA.debugLine="Sub UpdateDataBaseOld";
RDebugUtils.currentLine=13633391;
 //BA.debugLineNum = 13633391;BA.debugLine="End Sub";
return "";
}
public static String  _updatefeeoffline(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="mcode";
if (Debug.shouldDelegate(null, "updatefeeoffline", false))
	 {return ((String) Debug.delegate(null, "updatefeeoffline", new Object[] {_ba}));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
int _i = 0;
RDebugUtils.currentLine=16252928;
 //BA.debugLineNum = 16252928;BA.debugLine="Sub UpdateFeeOffline";
RDebugUtils.currentLine=16252929;
 //BA.debugLineNum = 16252929;BA.debugLine="If feeCode>0 Then";
if ((double)(Double.parseDouble(_feecode))>0) { 
RDebugUtils.currentLine=16252930;
 //BA.debugLineNum = 16252930;BA.debugLine="Dim cu As Cursor";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=16252931;
 //BA.debugLineNum = 16252931;BA.debugLine="cu=Result(\"select * from TblFee where FldCodeTas";
_cu = _result(_ba,"select * from TblFee where FldCodeTasvie="+_feecode);
RDebugUtils.currentLine=16252932;
 //BA.debugLineNum = 16252932;BA.debugLine="If cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=16252933;
 //BA.debugLineNum = 16252933;BA.debugLine="For i=0 To cu.RowCount-1";
{
final int step5 = 1;
final int limit5 = (int) (_cu.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=16252934;
 //BA.debugLineNum = 16252934;BA.debugLine="cu.Position=i";
_cu.setPosition(_i);
RDebugUtils.currentLine=16252935;
 //BA.debugLineNum = 16252935;BA.debugLine="Log(\"FldCodeKala:\"& cu.GetString(\"FldCodeKala\"";
anywheresoftware.b4a.keywords.Common.LogImpl("516252935","FldCodeKala:"+_cu.GetString("FldCodeKala"),0);
RDebugUtils.currentLine=16252936;
 //BA.debugLineNum = 16252936;BA.debugLine="Log(\"fldFeeTasvie:\"& cu.GetString(\"FldFee\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("516252936","fldFeeTasvie:"+_cu.GetString("FldFee"),0);
RDebugUtils.currentLine=16252937;
 //BA.debugLineNum = 16252937;BA.debugLine="SaveUpdate(\"Update TblKala Set fldFeeTasvie='\"";
_saveupdate(_ba,"Update TblKala Set fldFeeTasvie='"+_cu.GetString("FldFee")+"'"+" where fldCodeKala="+_cu.GetString("FldCodeKala"));
 }
};
 };
 };
RDebugUtils.currentLine=16252942;
 //BA.debugLineNum = 16252942;BA.debugLine="End Sub";
return "";
}
public static String  _updatefeesabad(anywheresoftware.b4a.BA _ba,String _str,String _codekala) throws Exception{
RDebugUtils.currentModule="mcode";
if (Debug.shouldDelegate(null, "updatefeesabad", false))
	 {return ((String) Debug.delegate(null, "updatefeesabad", new Object[] {_ba,_str,_codekala}));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
boolean _ishas = false;
int _c = 0;
int _i = 0;
ir.parsikhesab.pakhsh.mcode._adapterchangefeekala _item = null;
RDebugUtils.currentLine=16646144;
 //BA.debugLineNum = 16646144;BA.debugLine="Sub UpdateFeeSabad(str As String,codeKala As Strin";
RDebugUtils.currentLine=16646145;
 //BA.debugLineNum = 16646145;BA.debugLine="If str>0 Then";
if ((double)(Double.parseDouble(_str))>0) { 
RDebugUtils.currentLine=16646146;
 //BA.debugLineNum = 16646146;BA.debugLine="Dim cu As Cursor=Result(\"select * from TblSabad w";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = _result(_ba,"select * from TblSabad where FldCodeKala="+_codekala);
RDebugUtils.currentLine=16646147;
 //BA.debugLineNum = 16646147;BA.debugLine="If cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=16646148;
 //BA.debugLineNum = 16646148;BA.debugLine="SaveUpdate(\"Update TblSabad Set FldFeeForoosh=\"&";
_saveupdate(_ba,"Update TblSabad Set FldFeeForoosh="+_str+", FldupdateFee="+_str+" where FldCodeKala="+_codekala);
 };
RDebugUtils.currentLine=16646151;
 //BA.debugLineNum = 16646151;BA.debugLine="If lstChangeFeeKala.Size>0 Then";
if (_lstchangefeekala.getSize()>0) { 
RDebugUtils.currentLine=16646153;
 //BA.debugLineNum = 16646153;BA.debugLine="Dim ishas As Boolean=False";
_ishas = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=16646154;
 //BA.debugLineNum = 16646154;BA.debugLine="Dim c As Int=0";
_c = (int) (0);
RDebugUtils.currentLine=16646155;
 //BA.debugLineNum = 16646155;BA.debugLine="For i=0 To lstChangeFeeKala.Size-1";
{
final int step9 = 1;
final int limit9 = (int) (_lstchangefeekala.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=16646156;
 //BA.debugLineNum = 16646156;BA.debugLine="Dim Item = lstChangeFeeKala.Get(i) As AdapterC";
_item = (ir.parsikhesab.pakhsh.mcode._adapterchangefeekala)(_lstchangefeekala.Get(_i));
RDebugUtils.currentLine=16646157;
 //BA.debugLineNum = 16646157;BA.debugLine="If Item.FldCodKala=codeKala Then";
if ((_item.FldCodKala /*String*/ ).equals(_codekala)) { 
RDebugUtils.currentLine=16646158;
 //BA.debugLineNum = 16646158;BA.debugLine="ishas=True";
_ishas = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=16646159;
 //BA.debugLineNum = 16646159;BA.debugLine="c=i";
_c = _i;
RDebugUtils.currentLine=16646160;
 //BA.debugLineNum = 16646160;BA.debugLine="Exit";
if (true) break;
 }else {
RDebugUtils.currentLine=16646162;
 //BA.debugLineNum = 16646162;BA.debugLine="ishas=False";
_ishas = anywheresoftware.b4a.keywords.Common.False;
 };
 }
};
RDebugUtils.currentLine=16646166;
 //BA.debugLineNum = 16646166;BA.debugLine="If ishas Then";
if (_ishas) { 
RDebugUtils.currentLine=16646167;
 //BA.debugLineNum = 16646167;BA.debugLine="lstChangeFeeKala.RemoveAt(c)";
_lstchangefeekala.RemoveAt(_c);
 };
RDebugUtils.currentLine=16646169;
 //BA.debugLineNum = 16646169;BA.debugLine="Dim Item As AdapterChangeFeeKala";
_item = new ir.parsikhesab.pakhsh.mcode._adapterchangefeekala();
RDebugUtils.currentLine=16646170;
 //BA.debugLineNum = 16646170;BA.debugLine="Item.Initialize";
_item.Initialize();
RDebugUtils.currentLine=16646171;
 //BA.debugLineNum = 16646171;BA.debugLine="Item.FldCodKala=codeKala";
_item.FldCodKala /*String*/  = _codekala;
RDebugUtils.currentLine=16646172;
 //BA.debugLineNum = 16646172;BA.debugLine="Item.FldFee=str";
_item.FldFee /*String*/  = _str;
RDebugUtils.currentLine=16646173;
 //BA.debugLineNum = 16646173;BA.debugLine="lstChangeFeeKala.Add(Item)";
_lstchangefeekala.Add((Object)(_item));
 }else {
RDebugUtils.currentLine=16646176;
 //BA.debugLineNum = 16646176;BA.debugLine="Dim Item As AdapterChangeFeeKala";
_item = new ir.parsikhesab.pakhsh.mcode._adapterchangefeekala();
RDebugUtils.currentLine=16646177;
 //BA.debugLineNum = 16646177;BA.debugLine="Item.Initialize";
_item.Initialize();
RDebugUtils.currentLine=16646178;
 //BA.debugLineNum = 16646178;BA.debugLine="Item.FldCodKala=codeKala";
_item.FldCodKala /*String*/  = _codekala;
RDebugUtils.currentLine=16646179;
 //BA.debugLineNum = 16646179;BA.debugLine="Item.FldFee=str";
_item.FldFee /*String*/  = _str;
RDebugUtils.currentLine=16646180;
 //BA.debugLineNum = 16646180;BA.debugLine="lstChangeFeeKala.Add(Item)";
_lstchangefeekala.Add((Object)(_item));
 };
 }else {
RDebugUtils.currentLine=16646184;
 //BA.debugLineNum = 16646184;BA.debugLine="Dim ishas As Boolean=False";
_ishas = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=16646185;
 //BA.debugLineNum = 16646185;BA.debugLine="Dim c As Int=0";
_c = (int) (0);
RDebugUtils.currentLine=16646186;
 //BA.debugLineNum = 16646186;BA.debugLine="For i=0 To lstChangeFeeKala.Size-1";
{
final int step37 = 1;
final int limit37 = (int) (_lstchangefeekala.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit37 ;_i = _i + step37 ) {
RDebugUtils.currentLine=16646187;
 //BA.debugLineNum = 16646187;BA.debugLine="Dim Item = lstChangeFeeKala.Get(i) As AdapterCh";
_item = (ir.parsikhesab.pakhsh.mcode._adapterchangefeekala)(_lstchangefeekala.Get(_i));
RDebugUtils.currentLine=16646188;
 //BA.debugLineNum = 16646188;BA.debugLine="If Item.FldCodKala=codeKala Then";
if ((_item.FldCodKala /*String*/ ).equals(_codekala)) { 
RDebugUtils.currentLine=16646189;
 //BA.debugLineNum = 16646189;BA.debugLine="ishas=True";
_ishas = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=16646190;
 //BA.debugLineNum = 16646190;BA.debugLine="c=i";
_c = _i;
RDebugUtils.currentLine=16646191;
 //BA.debugLineNum = 16646191;BA.debugLine="Exit";
if (true) break;
 }else {
RDebugUtils.currentLine=16646193;
 //BA.debugLineNum = 16646193;BA.debugLine="ishas=False";
_ishas = anywheresoftware.b4a.keywords.Common.False;
 };
 }
};
RDebugUtils.currentLine=16646197;
 //BA.debugLineNum = 16646197;BA.debugLine="If ishas Then";
if (_ishas) { 
RDebugUtils.currentLine=16646198;
 //BA.debugLineNum = 16646198;BA.debugLine="lstChangeFeeKala.RemoveAt(c)";
_lstchangefeekala.RemoveAt(_c);
RDebugUtils.currentLine=16646199;
 //BA.debugLineNum = 16646199;BA.debugLine="SaveUpdate(\"Update TblSabad Set  FldupdateFee=\"";
_saveupdate(_ba,"Update TblSabad Set  FldupdateFee="+_str+" where FldCodeKala="+_codekala);
 };
 };
RDebugUtils.currentLine=16646203;
 //BA.debugLineNum = 16646203;BA.debugLine="End Sub";
return "";
}
public static String  _updatefeesabad2(anywheresoftware.b4a.BA _ba,ir.parsikhesab.pakhsh.mcode._adapterlistkala _item1) throws Exception{
RDebugUtils.currentModule="mcode";
if (Debug.shouldDelegate(null, "updatefeesabad2", false))
	 {return ((String) Debug.delegate(null, "updatefeesabad2", new Object[] {_ba,_item1}));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
boolean _ishas = false;
int _c = 0;
int _i = 0;
ir.parsikhesab.pakhsh.mcode._adapterchangefeekala _item = null;
RDebugUtils.currentLine=16711680;
 //BA.debugLineNum = 16711680;BA.debugLine="Sub UpdateFeeSabad2(Item1 As AdapterListKala)";
RDebugUtils.currentLine=16711681;
 //BA.debugLineNum = 16711681;BA.debugLine="If Item1.FeeForoosh>0 Then";
if (_item1.FeeForoosh /*int*/ >0) { 
RDebugUtils.currentLine=16711682;
 //BA.debugLineNum = 16711682;BA.debugLine="Dim cu As Cursor=Result(\"select * from TblSabad w";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = _result(_ba,"select * from TblSabad where FldCodeKala="+_item1.CodeKala /*String*/ );
RDebugUtils.currentLine=16711683;
 //BA.debugLineNum = 16711683;BA.debugLine="If cu.RowCount>0 Then";
if (_cu.getRowCount()>0) { 
RDebugUtils.currentLine=16711684;
 //BA.debugLineNum = 16711684;BA.debugLine="SaveUpdate(\"Update TblSabad Set FldFeeForoosh=\"";
_saveupdate(_ba,"Update TblSabad Set FldFeeForoosh="+BA.NumberToString(_item1.FeeForoosh /*int*/ )+",FldMablaghTakhfif = '"+BA.NumberToString(_item1.MablaghTakhfif /*int*/ )+"',FldDarsadTakhfif = '"+mostCurrent._mycode._is_null_adad /*String*/ (_ba,_item1.fldDarsadTakhfif /*String*/ )+"',fldFeeBadAzTakhfif = '"+mostCurrent._mycode._is_null_adad /*String*/ (_ba,_item1.fldFeeBadAzTakhfif /*String*/ )+"', FldupdateFee="+BA.NumberToString(_item1.FeeForoosh /*int*/ )+" where FldCodeKala="+_item1.CodeKala /*String*/ );
 };
RDebugUtils.currentLine=16711687;
 //BA.debugLineNum = 16711687;BA.debugLine="If lstChangeFeeKala.Size>0 Then";
if (_lstchangefeekala.getSize()>0) { 
RDebugUtils.currentLine=16711689;
 //BA.debugLineNum = 16711689;BA.debugLine="Dim ishas As Boolean=False";
_ishas = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=16711690;
 //BA.debugLineNum = 16711690;BA.debugLine="Dim c As Int=0";
_c = (int) (0);
RDebugUtils.currentLine=16711691;
 //BA.debugLineNum = 16711691;BA.debugLine="For i=0 To lstChangeFeeKala.Size-1";
{
final int step9 = 1;
final int limit9 = (int) (_lstchangefeekala.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=16711692;
 //BA.debugLineNum = 16711692;BA.debugLine="Dim Item = lstChangeFeeKala.Get(i) As AdapterC";
_item = (ir.parsikhesab.pakhsh.mcode._adapterchangefeekala)(_lstchangefeekala.Get(_i));
RDebugUtils.currentLine=16711693;
 //BA.debugLineNum = 16711693;BA.debugLine="If Item.FldCodKala=Item1.CodeKala Then";
if ((_item.FldCodKala /*String*/ ).equals(_item1.CodeKala /*String*/ )) { 
RDebugUtils.currentLine=16711694;
 //BA.debugLineNum = 16711694;BA.debugLine="ishas=True";
_ishas = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=16711695;
 //BA.debugLineNum = 16711695;BA.debugLine="c=i";
_c = _i;
RDebugUtils.currentLine=16711696;
 //BA.debugLineNum = 16711696;BA.debugLine="Exit";
if (true) break;
 }else {
RDebugUtils.currentLine=16711698;
 //BA.debugLineNum = 16711698;BA.debugLine="ishas=False";
_ishas = anywheresoftware.b4a.keywords.Common.False;
 };
 }
};
RDebugUtils.currentLine=16711702;
 //BA.debugLineNum = 16711702;BA.debugLine="If ishas Then";
if (_ishas) { 
RDebugUtils.currentLine=16711703;
 //BA.debugLineNum = 16711703;BA.debugLine="lstChangeFeeKala.RemoveAt(c)";
_lstchangefeekala.RemoveAt(_c);
 };
RDebugUtils.currentLine=16711705;
 //BA.debugLineNum = 16711705;BA.debugLine="Dim Item As AdapterChangeFeeKala";
_item = new ir.parsikhesab.pakhsh.mcode._adapterchangefeekala();
RDebugUtils.currentLine=16711706;
 //BA.debugLineNum = 16711706;BA.debugLine="Item.Initialize";
_item.Initialize();
RDebugUtils.currentLine=16711707;
 //BA.debugLineNum = 16711707;BA.debugLine="Item.FldCodKala=Item1.CodeKala";
_item.FldCodKala /*String*/  = _item1.CodeKala /*String*/ ;
RDebugUtils.currentLine=16711708;
 //BA.debugLineNum = 16711708;BA.debugLine="Item.FldFee=Item1.FeeForoosh";
_item.FldFee /*String*/  = BA.NumberToString(_item1.FeeForoosh /*int*/ );
RDebugUtils.currentLine=16711709;
 //BA.debugLineNum = 16711709;BA.debugLine="lstChangeFeeKala.Add(Item)";
_lstchangefeekala.Add((Object)(_item));
 }else {
RDebugUtils.currentLine=16711712;
 //BA.debugLineNum = 16711712;BA.debugLine="Dim Item As AdapterChangeFeeKala";
_item = new ir.parsikhesab.pakhsh.mcode._adapterchangefeekala();
RDebugUtils.currentLine=16711713;
 //BA.debugLineNum = 16711713;BA.debugLine="Item.Initialize";
_item.Initialize();
RDebugUtils.currentLine=16711714;
 //BA.debugLineNum = 16711714;BA.debugLine="Item.FldCodKala=Item1.CodeKala";
_item.FldCodKala /*String*/  = _item1.CodeKala /*String*/ ;
RDebugUtils.currentLine=16711715;
 //BA.debugLineNum = 16711715;BA.debugLine="Item.FldFee=Item1.FeeForoosh";
_item.FldFee /*String*/  = BA.NumberToString(_item1.FeeForoosh /*int*/ );
RDebugUtils.currentLine=16711716;
 //BA.debugLineNum = 16711716;BA.debugLine="lstChangeFeeKala.Add(Item)";
_lstchangefeekala.Add((Object)(_item));
 };
 }else {
RDebugUtils.currentLine=16711720;
 //BA.debugLineNum = 16711720;BA.debugLine="Dim ishas As Boolean=False";
_ishas = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=16711721;
 //BA.debugLineNum = 16711721;BA.debugLine="Dim c As Int=0";
_c = (int) (0);
RDebugUtils.currentLine=16711722;
 //BA.debugLineNum = 16711722;BA.debugLine="For i=0 To lstChangeFeeKala.Size-1";
{
final int step37 = 1;
final int limit37 = (int) (_lstchangefeekala.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit37 ;_i = _i + step37 ) {
RDebugUtils.currentLine=16711723;
 //BA.debugLineNum = 16711723;BA.debugLine="Dim Item = lstChangeFeeKala.Get(i) As AdapterCh";
_item = (ir.parsikhesab.pakhsh.mcode._adapterchangefeekala)(_lstchangefeekala.Get(_i));
RDebugUtils.currentLine=16711724;
 //BA.debugLineNum = 16711724;BA.debugLine="If Item.FldCodKala=Item1.CodeKala Then";
if ((_item.FldCodKala /*String*/ ).equals(_item1.CodeKala /*String*/ )) { 
RDebugUtils.currentLine=16711725;
 //BA.debugLineNum = 16711725;BA.debugLine="ishas=True";
_ishas = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=16711726;
 //BA.debugLineNum = 16711726;BA.debugLine="c=i";
_c = _i;
RDebugUtils.currentLine=16711727;
 //BA.debugLineNum = 16711727;BA.debugLine="Exit";
if (true) break;
 }else {
RDebugUtils.currentLine=16711729;
 //BA.debugLineNum = 16711729;BA.debugLine="ishas=False";
_ishas = anywheresoftware.b4a.keywords.Common.False;
 };
 }
};
RDebugUtils.currentLine=16711733;
 //BA.debugLineNum = 16711733;BA.debugLine="If ishas Then";
if (_ishas) { 
RDebugUtils.currentLine=16711734;
 //BA.debugLineNum = 16711734;BA.debugLine="lstChangeFeeKala.RemoveAt(c)";
_lstchangefeekala.RemoveAt(_c);
RDebugUtils.currentLine=16711735;
 //BA.debugLineNum = 16711735;BA.debugLine="SaveUpdate(\"Update TblSabad Set  FldupdateFee=\"";
_saveupdate(_ba,"Update TblSabad Set  FldupdateFee="+BA.NumberToString(_item1.FeeForoosh /*int*/ )+" where FldCodeKala="+_item1.CodeKala /*String*/ );
 };
 };
RDebugUtils.currentLine=16711739;
 //BA.debugLineNum = 16711739;BA.debugLine="End Sub";
return "";
}
public static String  _updatelistpickala(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="mcode";
if (Debug.shouldDelegate(null, "updatelistpickala", false))
	 {return ((String) Debug.delegate(null, "updatelistpickala", new Object[] {_ba}));}
anywheresoftware.b4a.objects.collections.List _lst = null;
int _i = 0;
String _filename = "";
String _fldpathpic = "";
RDebugUtils.currentLine=15794176;
 //BA.debugLineNum = 15794176;BA.debugLine="Public Sub UpdateListPicKala";
RDebugUtils.currentLine=15794177;
 //BA.debugLineNum = 15794177;BA.debugLine="Dim lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=15794178;
 //BA.debugLineNum = 15794178;BA.debugLine="lst.Initialize";
_lst.Initialize();
RDebugUtils.currentLine=15794179;
 //BA.debugLineNum = 15794179;BA.debugLine="lst=File.ListFiles(File.Combine(File.DirDefaultEx";
_lst = anywheresoftware.b4a.keywords.Common.File.ListFiles(anywheresoftware.b4a.keywords.Common.File.Combine(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal()+"/parsik","AksKala"));
RDebugUtils.currentLine=15794181;
 //BA.debugLineNum = 15794181;BA.debugLine="For	i=0 To lst.Size-1";
{
final int step4 = 1;
final int limit4 = (int) (_lst.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=15794182;
 //BA.debugLineNum = 15794182;BA.debugLine="Dim filename As String=lst.Get(i)";
_filename = BA.ObjectToString(_lst.Get(_i));
RDebugUtils.currentLine=15794183;
 //BA.debugLineNum = 15794183;BA.debugLine="Dim fldPathPic As String=SingleResult(\"select fl";
_fldpathpic = BA.ObjectToString(_singleresult(_ba,"select fldPathPic from TblKala where fldCodeKala="+_filename.replace(".jpg","")));
RDebugUtils.currentLine=15794185;
 //BA.debugLineNum = 15794185;BA.debugLine="If fldPathPic = \"0\" Or fldPathPic = Null  Then";
if ((_fldpathpic).equals("0") || _fldpathpic== null) { 
RDebugUtils.currentLine=15794186;
 //BA.debugLineNum = 15794186;BA.debugLine="SaveUpdate(\"Update TblKala Set fldPathPicOfflin";
_saveupdate(_ba,"Update TblKala Set fldPathPicOffline='"+_filename+"' where fldCodeKala="+_filename.replace(".jpg",""));
 };
 }
};
RDebugUtils.currentLine=15794191;
 //BA.debugLineNum = 15794191;BA.debugLine="End Sub";
return "";
}
public static String  _updatenoetasviedarsabad(anywheresoftware.b4a.BA _ba,int _index,ir.parsikhesab.pakhsh.mcode._adapterlistkala _item) throws Exception{
RDebugUtils.currentModule="mcode";
if (Debug.shouldDelegate(null, "updatenoetasviedarsabad", false))
	 {return ((String) Debug.delegate(null, "updatenoetasviedarsabad", new Object[] {_ba,_index,_item}));}
int _fee = 0;
int _feeforoosh = 0;
int _feebadaztakhfif = 0;
int _darsadtakhfif = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu1 = null;
ir.parsikhesab.pakhsh.mcode._adapterlistnoetasvie _itemtasvie = null;
int _mablaghtakhfif = 0;
int _i = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cu = null;
RDebugUtils.currentLine=16384000;
 //BA.debugLineNum = 16384000;BA.debugLine="Sub UpdateNoeTasvieDarSabad(Index As Int,Item As A";
RDebugUtils.currentLine=16384002;
 //BA.debugLineNum = 16384002;BA.debugLine="Dim fee As Int";
_fee = 0;
RDebugUtils.currentLine=16384003;
 //BA.debugLineNum = 16384003;BA.debugLine="Dim FeeForoosh As Int";
_feeforoosh = 0;
RDebugUtils.currentLine=16384004;
 //BA.debugLineNum = 16384004;BA.debugLine="Dim FeeBadAzTakhfif As Int";
_feebadaztakhfif = 0;
RDebugUtils.currentLine=16384005;
 //BA.debugLineNum = 16384005;BA.debugLine="Dim DarsadTakhfif As Int";
_darsadtakhfif = 0;
RDebugUtils.currentLine=16384006;
 //BA.debugLineNum = 16384006;BA.debugLine="Dim Cu1 As Cursor";
_cu1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=16384007;
 //BA.debugLineNum = 16384007;BA.debugLine="If Item<>Null Then";
if (_item!= null) { 
RDebugUtils.currentLine=16384008;
 //BA.debugLineNum = 16384008;BA.debugLine="Cu1= Result(\"Select * From TblSabad where FldCod";
_cu1 = _result(_ba,"Select * From TblSabad where FldCodeKala="+_item.CodeKala /*String*/ );
 }else {
RDebugUtils.currentLine=16384010;
 //BA.debugLineNum = 16384010;BA.debugLine="Cu1= Result(\"Select * From TblSabad\")";
_cu1 = _result(_ba,"Select * From TblSabad");
 };
RDebugUtils.currentLine=16384013;
 //BA.debugLineNum = 16384013;BA.debugLine="LogColor(Cu1.RowCount,Colors.Red)";
anywheresoftware.b4a.keywords.Common.LogImpl("516384013",BA.NumberToString(_cu1.getRowCount()),anywheresoftware.b4a.keywords.Common.Colors.Red);
RDebugUtils.currentLine=16384014;
 //BA.debugLineNum = 16384014;BA.debugLine="If Cu1.RowCount>0 Then";
if (_cu1.getRowCount()>0) { 
RDebugUtils.currentLine=16384015;
 //BA.debugLineNum = 16384015;BA.debugLine="Dim ItemTasvie As AdapterListNoeTasvie";
_itemtasvie = new ir.parsikhesab.pakhsh.mcode._adapterlistnoetasvie();
RDebugUtils.currentLine=16384016;
 //BA.debugLineNum = 16384016;BA.debugLine="Dim MablaghTakhfif As Int=0";
_mablaghtakhfif = (int) (0);
RDebugUtils.currentLine=16384017;
 //BA.debugLineNum = 16384017;BA.debugLine="ItemTasvie.Initialize";
_itemtasvie.Initialize();
RDebugUtils.currentLine=16384018;
 //BA.debugLineNum = 16384018;BA.debugLine="ItemTasvie=LoadAcSpNoeTasvie.Get(Index)";
_itemtasvie = (ir.parsikhesab.pakhsh.mcode._adapterlistnoetasvie)(_loadacspnoetasvie(_ba).Get(_index));
RDebugUtils.currentLine=16384019;
 //BA.debugLineNum = 16384019;BA.debugLine="For i=0 To Cu1.RowCount-1";
{
final int step17 = 1;
final int limit17 = (int) (_cu1.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit17 ;_i = _i + step17 ) {
RDebugUtils.currentLine=16384020;
 //BA.debugLineNum = 16384020;BA.debugLine="Cu1.Position=i";
_cu1.setPosition(_i);
RDebugUtils.currentLine=16384021;
 //BA.debugLineNum = 16384021;BA.debugLine="Dim cu As Cursor=Result(\"Select * from TblKala";
_cu = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cu = _result(_ba,"Select * from TblKala where FldCodeKala="+_cu1.GetString("FldCodeKala"));
RDebugUtils.currentLine=16384022;
 //BA.debugLineNum = 16384022;BA.debugLine="cu.Position=0";
_cu.setPosition((int) (0));
RDebugUtils.currentLine=16384023;
 //BA.debugLineNum = 16384023;BA.debugLine="If Item<>Null Then";
if (_item!= null) { 
RDebugUtils.currentLine=16384024;
 //BA.debugLineNum = 16384024;BA.debugLine="MablaghTakhfif=myCode.Is_Null_adad(Item.Mablag";
_mablaghtakhfif = (int)(Double.parseDouble(mostCurrent._mycode._is_null_adad /*String*/ (_ba,BA.NumberToString(_item.MablaghTakhfif /*int*/ ))));
RDebugUtils.currentLine=16384025;
 //BA.debugLineNum = 16384025;BA.debugLine="FeeForoosh=myCode.Is_Null_adad(Item.FeeForoosh";
_feeforoosh = (int)(Double.parseDouble(mostCurrent._mycode._is_null_adad /*String*/ (_ba,BA.NumberToString(_item.FeeForoosh /*int*/ ))));
RDebugUtils.currentLine=16384026;
 //BA.debugLineNum = 16384026;BA.debugLine="FeeBadAzTakhfif=myCode.Is_Null_adad(Item.fldFe";
_feebadaztakhfif = (int)(Double.parseDouble(mostCurrent._mycode._is_null_adad /*String*/ (_ba,_item.fldFeeBadAzTakhfif /*String*/ )));
RDebugUtils.currentLine=16384027;
 //BA.debugLineNum = 16384027;BA.debugLine="DarsadTakhfif=myCode.Is_Null_adad(Item.fldDars";
_darsadtakhfif = (int)(Double.parseDouble(mostCurrent._mycode._is_null_adad /*String*/ (_ba,_item.fldDarsadTakhfif /*String*/ )));
 }else {
RDebugUtils.currentLine=16384029;
 //BA.debugLineNum = 16384029;BA.debugLine="FeeForoosh=myCode.Is_Null_adad(Cu1.Getstring(\"";
_feeforoosh = (int)(Double.parseDouble(mostCurrent._mycode._is_null_adad /*String*/ (_ba,_cu1.GetString("FldFeeForoosh"))));
RDebugUtils.currentLine=16384030;
 //BA.debugLineNum = 16384030;BA.debugLine="FeeBadAzTakhfif=myCode.Is_Null_adad(Cu1.Getstr";
_feebadaztakhfif = (int)(Double.parseDouble(mostCurrent._mycode._is_null_adad /*String*/ (_ba,_cu1.GetString("fldFeeBadAzTakhfif"))));
 };
RDebugUtils.currentLine=16384033;
 //BA.debugLineNum = 16384033;BA.debugLine="Log(MablaghTakhfif)";
anywheresoftware.b4a.keywords.Common.LogImpl("516384033",BA.NumberToString(_mablaghtakhfif),0);
RDebugUtils.currentLine=16384034;
 //BA.debugLineNum = 16384034;BA.debugLine="fee=GetMablaghFee(ItemTasvie.FldC_Tasvie,Cu1.Ge";
_fee = (int) (_getmablaghfee(_ba,_itemtasvie.FldC_Tasvie /*String*/ ,_cu1.GetString("FldCodeKala"))-_mablaghtakhfif);
RDebugUtils.currentLine=16384037;
 //BA.debugLineNum = 16384037;BA.debugLine="Log(Cu1.Getstring(\"FldCodeKala\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("516384037",_cu1.GetString("FldCodeKala"),0);
RDebugUtils.currentLine=16384039;
 //BA.debugLineNum = 16384039;BA.debugLine="If fee>0 Then";
if (_fee>0) { 
RDebugUtils.currentLine=16384040;
 //BA.debugLineNum = 16384040;BA.debugLine="If fee>FeeBadAzTakhfif And FeeBadAzTakhfif>0 T";
if (_fee>_feebadaztakhfif && _feebadaztakhfif>0) { 
RDebugUtils.currentLine=16384041;
 //BA.debugLineNum = 16384041;BA.debugLine="SaveUpdate(\"Update TblSabad Set fldFeeBadAzTa";
_saveupdate(_ba,"Update TblSabad Set fldFeeBadAzTakhfif=0 ,FldFeeForoosh="+BA.NumberToString(_feeforoosh)+" ,FldMablaghTakhfif="+BA.NumberToString(_mablaghtakhfif)+" ,FldDarsadTakhfif="+BA.NumberToString(_darsadtakhfif)+" ,FldVaziatPardakht="+_itemtasvie.FldC_Tasvie /*String*/ +" where FldCodeKala="+_cu1.GetString("FldCodeKala"));
 }else 
{RDebugUtils.currentLine=16384042;
 //BA.debugLineNum = 16384042;BA.debugLine="Else If fee>FeeBadAzTakhfif And FeeBadAzTakhfi";
if (_fee>_feebadaztakhfif && _feebadaztakhfif==0) { 
RDebugUtils.currentLine=16384043;
 //BA.debugLineNum = 16384043;BA.debugLine="SaveUpdate(\"Update TblSabad Set FldFeeForoosh";
_saveupdate(_ba,"Update TblSabad Set FldFeeForoosh="+BA.NumberToString(_fee)+" ,FldMablaghTakhfif="+BA.NumberToString(_mablaghtakhfif)+",FldDarsadTakhfif="+BA.NumberToString(_darsadtakhfif)+" ,FldVaziatPardakht="+_itemtasvie.FldC_Tasvie /*String*/ +" where FldCodeKala="+_cu1.GetString("FldCodeKala"));
 }else 
{RDebugUtils.currentLine=16384044;
 //BA.debugLineNum = 16384044;BA.debugLine="Else If fee<FeeBadAzTakhfif And FeeBadAzTakhfi";
if (_fee<_feebadaztakhfif && _feebadaztakhfif>0) { 
RDebugUtils.currentLine=16384045;
 //BA.debugLineNum = 16384045;BA.debugLine="SaveUpdate(\"Update TblSabad Set fldFeeBadAzTa";
_saveupdate(_ba,"Update TblSabad Set fldFeeBadAzTakhfif="+BA.NumberToString(_fee)+" ,FldFeeForoosh="+BA.NumberToString(_feeforoosh)+",FldMablaghTakhfif="+BA.NumberToString(_mablaghtakhfif)+",FldDarsadTakhfif="+BA.NumberToString(_darsadtakhfif)+" ,FldVaziatPardakht="+_itemtasvie.FldC_Tasvie /*String*/ +"  where FldCodeKala="+_cu1.GetString("FldCodeKala"));
 }else 
{RDebugUtils.currentLine=16384046;
 //BA.debugLineNum = 16384046;BA.debugLine="Else If fee<FeeBadAzTakhfif And FeeBadAzTakhfi";
if (_fee<_feebadaztakhfif && _feebadaztakhfif==0) { 
RDebugUtils.currentLine=16384047;
 //BA.debugLineNum = 16384047;BA.debugLine="SaveUpdate(\"Update TblSabad Set FldFeeForoosh";
_saveupdate(_ba,"Update TblSabad Set FldFeeForoosh="+BA.NumberToString(_fee)+",FldMablaghTakhfif="+BA.NumberToString(_mablaghtakhfif)+",FldDarsadTakhfif="+BA.NumberToString(_darsadtakhfif)+" ,FldVaziatPardakht="+_itemtasvie.FldC_Tasvie /*String*/ +"  where FldCodeKala="+_cu1.GetString("FldCodeKala"));
 }else {
RDebugUtils.currentLine=16384049;
 //BA.debugLineNum = 16384049;BA.debugLine="SaveUpdate(\"Update TblSabad Set fldFeeBadAzTa";
_saveupdate(_ba,"Update TblSabad Set fldFeeBadAzTakhfif="+BA.NumberToString(_feebadaztakhfif)+" ,FldFeeForoosh="+BA.NumberToString(_feeforoosh)+",FldMablaghTakhfif="+BA.NumberToString(_mablaghtakhfif)+",FldDarsadTakhfif="+BA.NumberToString(_darsadtakhfif)+" ,FldVaziatPardakht="+_itemtasvie.FldC_Tasvie /*String*/ +" where FldCodeKala="+_cu1.GetString("FldCodeKala"));
 }}}}
;
 }else {
RDebugUtils.currentLine=16384053;
 //BA.debugLineNum = 16384053;BA.debugLine="SaveUpdate(\"Update TblSabad Set fldFeeBadAzTak";
_saveupdate(_ba,"Update TblSabad Set fldFeeBadAzTakhfif="+BA.NumberToString(_feebadaztakhfif)+" ,FldFeeForoosh="+BA.NumberToString(_feeforoosh)+",FldMablaghTakhfif="+BA.NumberToString(_mablaghtakhfif)+",FldDarsadTakhfif="+BA.NumberToString(_darsadtakhfif)+" ,FldVaziatPardakht="+_itemtasvie.FldC_Tasvie /*String*/ +" where FldCodeKala="+_cu1.GetString("FldCodeKala"));
 };
 }
};
RDebugUtils.currentLine=16384057;
 //BA.debugLineNum = 16384057;BA.debugLine="Log(fee)";
anywheresoftware.b4a.keywords.Common.LogImpl("516384057",BA.NumberToString(_fee),0);
 };
RDebugUtils.currentLine=16384059;
 //BA.debugLineNum = 16384059;BA.debugLine="End Sub";
return "";
}
}