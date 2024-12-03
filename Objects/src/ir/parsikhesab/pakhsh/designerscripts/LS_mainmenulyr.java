package ir.parsikhesab.pakhsh.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_mainmenulyr{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
String _x="";
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
_x = BA.NumberToString((67d / 100 * width));
views.get("pnlmenu").vw.setWidth((int)(Double.parseDouble(_x)));
views.get("pnlimei").vw.setWidth((int)(Double.parseDouble(_x)));
views.get("pnldateversion").vw.setWidth((int)(Double.parseDouble(_x)));
views.get("lbl_menuimei").vw.setWidth((int)(Double.parseDouble(_x)));
views.get("lbl_dateversion").vw.setWidth((int)(Double.parseDouble(_x)));
views.get("lbltypeversion").vw.setWidth((int)(Double.parseDouble(_x)));
views.get("clv1").vw.setWidth((int)(Double.parseDouble(_x)));
views.get("lblappname").vw.setLeft((int)((views.get("imageprofilemenu").vw.getLeft() + views.get("imageprofilemenu").vw.getWidth())));
views.get("label2").vw.setLeft((int)((views.get("imageprofilemenu").vw.getLeft() + views.get("imageprofilemenu").vw.getWidth())));
views.get("lblver").vw.setLeft((int)((views.get("imageprofilemenu").vw.getLeft() + views.get("imageprofilemenu").vw.getWidth())));

}
}