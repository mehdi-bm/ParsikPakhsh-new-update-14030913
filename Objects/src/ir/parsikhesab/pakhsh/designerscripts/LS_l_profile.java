package ir.parsikhesab.pakhsh.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_l_profile{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
String _x="";
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
_x = BA.NumberToString((100d / 100 * width)/3d);
views.get("label2").vw.setWidth((int)(Double.parseDouble(_x)));
views.get("label3").vw.setWidth((int)(Double.parseDouble(_x)));
views.get("label16").vw.setWidth((int)(Double.parseDouble(_x)));
views.get("label2").vw.setLeft((int)(0d));
views.get("label3").vw.setLeft((int)((views.get("label2").vw.getLeft() + views.get("label2").vw.getWidth())));
views.get("label16").vw.setLeft((int)((views.get("label3").vw.getLeft() + views.get("label3").vw.getWidth())));
views.get("button2").vw.setWidth((int)(Double.parseDouble(_x)));
views.get("button3").vw.setWidth((int)(Double.parseDouble(_x)));
views.get("button4").vw.setWidth((int)(Double.parseDouble(_x)));
views.get("button2").vw.setLeft((int)(0d));
views.get("button3").vw.setLeft((int)((views.get("button2").vw.getLeft() + views.get("button2").vw.getWidth())));
views.get("button4").vw.setLeft((int)((views.get("button3").vw.getLeft() + views.get("button3").vw.getWidth())));
views.get("bline2").vw.setLeft((int)((views.get("button3").vw.getLeft())));
views.get("bline3").vw.setLeft((int)((views.get("button4").vw.getLeft())));
views.get("pnl_menu").vw.setLeft((int)((views.get("bline3").vw.getLeft() + views.get("bline3").vw.getWidth()) - (views.get("pnl_menu").vw.getWidth())));

}
}