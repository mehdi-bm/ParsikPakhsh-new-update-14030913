package ir.parsikhesab.pakhsh.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_l_havaletozie{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
String _x2="";
_x2 = BA.NumberToString((views.get("panel2").vw.getWidth())-90d);
views.get("lblta").vw.setLeft((int)(0d));
views.get("lblta").vw.setWidth((int)(Double.parseDouble(_x2)/2d));
views.get("lblaz").vw.setLeft((int)((50d / 100 * width)));
views.get("lblaz").vw.setWidth((int)(Double.parseDouble(_x2)/2d));
views.get("btnta").vw.setLeft((int)((5d / 100 * width)));
views.get("btnta").vw.setWidth((int)(Double.parseDouble(_x2)/2d));
views.get("btnaz").vw.setLeft((int)((50d / 100 * width)));
views.get("btnaz").vw.setWidth((int)(Double.parseDouble(_x2)/2d));

}
}