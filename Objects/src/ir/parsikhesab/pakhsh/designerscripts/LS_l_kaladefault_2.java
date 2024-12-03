package ir.parsikhesab.pakhsh.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_l_kaladefault_2{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
String _x="";
String _x6="";
String _x7="";
String _x5="";
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
_x = BA.NumberToString(((views.get("panel2").vw.getWidth())-((views.get("swtakhfif").vw.getWidth())*2d))/3d);
views.get("swtakhfif").vw.setLeft((int)(Double.parseDouble(_x)));
views.get("swpic").vw.setLeft((int)(Double.parseDouble(_x)));
views.get("swarzeshafzodeenable").vw.setLeft((int)(Double.parseDouble(_x)));
views.get("swgift").vw.setLeft((int)((views.get("panel2").vw.getWidth())-Double.parseDouble(_x) - (views.get("swgift").vw.getWidth())));
views.get("swmojoodi").vw.setLeft((int)((views.get("panel2").vw.getWidth())-Double.parseDouble(_x) - (views.get("swmojoodi").vw.getWidth())));
views.get("swsearchnumber").vw.setLeft((int)((views.get("panel2").vw.getWidth())-Double.parseDouble(_x) - (views.get("swsearchnumber").vw.getWidth())));
views.get("panel2").vw.setHeight((int)((views.get("label11").vw.getTop())));
views.get("pnl_tools").vw.setHeight((int)((views.get("label1").vw.getTop())+(views.get("label1").vw.getHeight())+(1d / 100 * height)));
views.get("img_rotatepic").vw.setLeft((int)((2d / 100 * width)));
views.get("label7").vw.setLeft((int)((2d / 100 * width)));
views.get("img_barcode").vw.setLeft((int)((views.get("img_rotatepic").vw.getLeft() + views.get("img_rotatepic").vw.getWidth())+(2d / 100 * width)));
views.get("label1").vw.setLeft((int)((views.get("img_rotatepic").vw.getLeft() + views.get("img_rotatepic").vw.getWidth())+(2d / 100 * width)));
views.get("img_paging").vw.setLeft((int)((views.get("img_barcode").vw.getLeft() + views.get("img_barcode").vw.getWidth())+(2d / 100 * width)));
views.get("label2").vw.setLeft((int)((views.get("img_barcode").vw.getLeft() + views.get("img_barcode").vw.getWidth())+(2d / 100 * width)));
views.get("img_sort").vw.setLeft((int)((views.get("img_paging").vw.getLeft() + views.get("img_paging").vw.getWidth())+(2d / 100 * width)));
views.get("label3").vw.setLeft((int)((views.get("img_paging").vw.getLeft() + views.get("img_paging").vw.getWidth())+(2d / 100 * width)));
views.get("img_selectmoshtari").vw.setLeft((int)((views.get("img_sort").vw.getLeft() + views.get("img_sort").vw.getWidth())+(2d / 100 * width)));
views.get("label4").vw.setLeft((int)((views.get("img_sort").vw.getLeft() + views.get("img_sort").vw.getWidth())+(1.5d / 100 * width)));
//BA.debugLineNum = 30;BA.debugLine="pnlTipFee.Left = Img_SelectMoshtari.Right + 2%x"[l_kaladefault_2/General script]
views.get("pnltipfee").vw.setLeft((int)((views.get("img_selectmoshtari").vw.getLeft() + views.get("img_selectmoshtari").vw.getWidth())+(2d / 100 * width)));
//BA.debugLineNum = 32;BA.debugLine="Panel6.SetLeftAndRight(0,100%x)"[l_kaladefault_2/General script]
views.get("panel6").vw.setLeft((int)(0d));
views.get("panel6").vw.setWidth((int)((100d / 100 * width) - (0d)));
//BA.debugLineNum = 33;BA.debugLine="x6=Panel6.Width"[l_kaladefault_2/General script]
_x6 = (BA.NumberToString(views.get("panel6").vw.getWidth()));
//BA.debugLineNum = 35;BA.debugLine="lblArzeshAfzode.Left=0"[l_kaladefault_2/General script]
views.get("lblarzeshafzode").vw.setLeft((int)(0d));
//BA.debugLineNum = 36;BA.debugLine="lblArzeshAfzode.Width=38.5%x"[l_kaladefault_2/General script]
views.get("lblarzeshafzode").vw.setWidth((int)((38.5d / 100 * width)));
//BA.debugLineNum = 38;BA.debugLine="lblDarsadArzeshAfzode.Left=38.4%x"[l_kaladefault_2/General script]
views.get("lbldarsadarzeshafzode").vw.setLeft((int)((38.4d / 100 * width)));
//BA.debugLineNum = 39;BA.debugLine="lblDarsadArzeshAfzode.Width=28%x"[l_kaladefault_2/General script]
views.get("lbldarsadarzeshafzode").vw.setWidth((int)((28d / 100 * width)));
//BA.debugLineNum = 41;BA.debugLine="LblMandeEtebar.Left=66.2%x"[l_kaladefault_2/General script]
views.get("lblmandeetebar").vw.setLeft((int)((66.2d / 100 * width)));
//BA.debugLineNum = 42;BA.debugLine="LblMandeEtebar.Width=x6/3+2"[l_kaladefault_2/General script]
views.get("lblmandeetebar").vw.setWidth((int)(Double.parseDouble(_x6)/3d+2d));
//BA.debugLineNum = 46;BA.debugLine="Panel7.SetLeftAndRight(0,100%x)"[l_kaladefault_2/General script]
views.get("panel7").vw.setLeft((int)(0d));
views.get("panel7").vw.setWidth((int)((100d / 100 * width) - (0d)));
//BA.debugLineNum = 47;BA.debugLine="x7=Panel7.Width"[l_kaladefault_2/General script]
_x7 = (BA.NumberToString(views.get("panel7").vw.getWidth()));
//BA.debugLineNum = 49;BA.debugLine="LblSumKolBadAzTakhfif.Left=0"[l_kaladefault_2/General script]
views.get("lblsumkolbadaztakhfif").vw.setLeft((int)(0d));
//BA.debugLineNum = 50;BA.debugLine="LblSumKolBadAzTakhfif.Width=x7/2"[l_kaladefault_2/General script]
views.get("lblsumkolbadaztakhfif").vw.setWidth((int)(Double.parseDouble(_x7)/2d));
//BA.debugLineNum = 52;BA.debugLine="LblSumTakhfif.Left=50%x"[l_kaladefault_2/General script]
views.get("lblsumtakhfif").vw.setLeft((int)((50d / 100 * width)));
//BA.debugLineNum = 53;BA.debugLine="LblSumTakhfif.Width=x7/2"[l_kaladefault_2/General script]
views.get("lblsumtakhfif").vw.setWidth((int)(Double.parseDouble(_x7)/2d));
//BA.debugLineNum = 59;BA.debugLine="Panel5.SetLeftAndRight(0,100%x)"[l_kaladefault_2/General script]
views.get("panel5").vw.setLeft((int)(0d));
views.get("panel5").vw.setWidth((int)((100d / 100 * width) - (0d)));
//BA.debugLineNum = 60;BA.debugLine="x5=Panel5.Width"[l_kaladefault_2/General script]
_x5 = (BA.NumberToString(views.get("panel5").vw.getWidth()));
//BA.debugLineNum = 62;BA.debugLine="lblSumKhales.Left=12%x"[l_kaladefault_2/General script]
views.get("lblsumkhales").vw.setLeft((int)((12d / 100 * width)));
//BA.debugLineNum = 63;BA.debugLine="lblSumKhales.Width=x5/2"[l_kaladefault_2/General script]
views.get("lblsumkhales").vw.setWidth((int)(Double.parseDouble(_x5)/2d));
//BA.debugLineNum = 65;BA.debugLine="LblSumFactor.Left=50%x"[l_kaladefault_2/General script]
views.get("lblsumfactor").vw.setLeft((int)((50d / 100 * width)));
//BA.debugLineNum = 66;BA.debugLine="LblSumFactor.Width=x5/2"[l_kaladefault_2/General script]
views.get("lblsumfactor").vw.setWidth((int)(Double.parseDouble(_x5)/2d));
//BA.debugLineNum = 68;BA.debugLine="Panel9.Top=88%y '1"[l_kaladefault_2/General script]
views.get("panel9").vw.setTop((int)((88d / 100 * height)));
//BA.debugLineNum = 69;BA.debugLine="Panel9.Height=6%y '1"[l_kaladefault_2/General script]
views.get("panel9").vw.setHeight((int)((6d / 100 * height)));
//BA.debugLineNum = 71;BA.debugLine="Panel9.Top=75%y '2"[l_kaladefault_2/General script]
views.get("panel9").vw.setTop((int)((75d / 100 * height)));
//BA.debugLineNum = 72;BA.debugLine="Panel9.Height=19%y '2"[l_kaladefault_2/General script]
views.get("panel9").vw.setHeight((int)((19d / 100 * height)));

}
}