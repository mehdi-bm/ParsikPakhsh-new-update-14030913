package ir.parsikhesab.pakhsh.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_l_kalalisti{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
String _x="";
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
_x = BA.NumberToString(((views.get("panel2").vw.getWidth())-((views.get("swtakhfif").vw.getWidth())*2d))/3d);
views.get("swtakhfif").vw.setLeft((int)(Double.parseDouble(_x)));
views.get("swpic").vw.setLeft((int)(Double.parseDouble(_x)));
views.get("swgift").vw.setLeft((int)((views.get("panel2").vw.getWidth())-Double.parseDouble(_x) - (views.get("swgift").vw.getWidth())));
views.get("swmojoodi").vw.setLeft((int)((views.get("panel2").vw.getWidth())-Double.parseDouble(_x) - (views.get("swmojoodi").vw.getWidth())));
views.get("panel2").vw.setHeight((int)((views.get("label11").vw.getTop())));
views.get("pnl_tools").vw.setHeight((int)((views.get("label1").vw.getTop())+(views.get("label1").vw.getHeight())+(1d / 100 * height)));
views.get("img_barcode").vw.setLeft((int)((5d / 100 * width)));
views.get("label1").vw.setLeft((int)((5d / 100 * width)));
views.get("img_paging").vw.setLeft((int)((views.get("img_barcode").vw.getLeft() + views.get("img_barcode").vw.getWidth())+(5d / 100 * width)));
views.get("label2").vw.setLeft((int)((views.get("img_barcode").vw.getLeft() + views.get("img_barcode").vw.getWidth())+(5d / 100 * width)));
views.get("img_sort").vw.setLeft((int)((views.get("img_paging").vw.getLeft() + views.get("img_paging").vw.getWidth())+(5d / 100 * width)));
views.get("label3").vw.setLeft((int)((views.get("img_paging").vw.getLeft() + views.get("img_paging").vw.getWidth())+(5d / 100 * width)));
views.get("pnltipfee").vw.setLeft((int)((views.get("img_sort").vw.getLeft() + views.get("img_sort").vw.getWidth())+(5d / 100 * width)));

}
}