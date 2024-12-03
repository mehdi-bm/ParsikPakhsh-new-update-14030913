package ir.parsikhesab.pakhsh.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_l_homebody{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
String _x="";
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
_x = BA.NumberToString(((views.get("pnl_bk_body").vw.getWidth())-(views.get("pnlgetdata").vw.getWidth())*2d)/3d);
views.get("pnlgetdata").vw.setLeft((int)(Double.parseDouble(_x)));
views.get("pnlsabtesefaresh").vw.setLeft((int)(Double.parseDouble(_x)));
views.get("pnlnewmoshtari").vw.setLeft((int)(Double.parseDouble(_x)));
views.get("pnl_map").vw.setLeft((int)(Double.parseDouble(_x)));
views.get("pnl_havale").vw.setLeft((int)(Double.parseDouble(_x)));
views.get("pnlsenddata").vw.setLeft((int)((views.get("pnlgetdata").vw.getLeft() + views.get("pnlgetdata").vw.getWidth())+Double.parseDouble(_x)));
views.get("pnlmoshtarian").vw.setLeft((int)((views.get("pnlgetdata").vw.getLeft() + views.get("pnlgetdata").vw.getWidth())+Double.parseDouble(_x)));
views.get("pnlreport").vw.setLeft((int)((views.get("pnlgetdata").vw.getLeft() + views.get("pnlgetdata").vw.getWidth())+Double.parseDouble(_x)));
views.get("pnl_smartphone").vw.setLeft((int)((views.get("pnlgetdata").vw.getLeft() + views.get("pnlgetdata").vw.getWidth())+Double.parseDouble(_x)));
views.get("pnlnewmoshtari").vw.setTop((int)((views.get("pnlgetdata").vw.getTop() + views.get("pnlgetdata").vw.getHeight())+Double.parseDouble(_x)));
views.get("pnlsabtesefaresh").vw.setTop((int)((views.get("pnlgetdata").vw.getTop() + views.get("pnlgetdata").vw.getHeight())+Double.parseDouble(_x)));
views.get("pnlmoshtarian").vw.setTop((int)((views.get("pnlgetdata").vw.getTop() + views.get("pnlgetdata").vw.getHeight())+Double.parseDouble(_x)));
views.get("pnlnewmoshtari").vw.setTop((int)((views.get("pnlsabtesefaresh").vw.getTop() + views.get("pnlsabtesefaresh").vw.getHeight())+Double.parseDouble(_x)));
views.get("pnlreport").vw.setTop((int)((views.get("pnlsabtesefaresh").vw.getTop() + views.get("pnlsabtesefaresh").vw.getHeight())+Double.parseDouble(_x)));
views.get("pnl_smartphone").vw.setTop((int)((views.get("pnlnewmoshtari").vw.getTop() + views.get("pnlnewmoshtari").vw.getHeight())+Double.parseDouble(_x)));
views.get("pnl_map").vw.setTop((int)((views.get("pnl_havale").vw.getTop() + views.get("pnl_havale").vw.getHeight())+Double.parseDouble(_x)+80d));
views.get("pnl_havale").vw.setTop((int)((views.get("pnlreport").vw.getTop() + views.get("pnlreport").vw.getHeight())+Double.parseDouble(_x)));
views.get("pnl_bk_body").vw.setHeight((int)((150d / 100 * height)));

}
}