package ir.parsikhesab.pakhsh.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_l_reportvisitor2{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
String _x="";
String _y="";
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
_x = BA.NumberToString(((views.get("pnltop").vw.getWidth())-(views.get("btnta").vw.getWidth())*2d)/3d);
views.get("btnta").vw.setLeft((int)(Double.parseDouble(_x)));
views.get("btnaz").vw.setLeft((int)((views.get("btnta").vw.getLeft() + views.get("btnta").vw.getWidth())+Double.parseDouble(_x)));
_y = BA.NumberToString(((views.get("btnta").vw.getWidth())-(views.get("lblta").vw.getWidth()))/2d);
views.get("lblta").vw.setLeft((int)((views.get("btnta").vw.getLeft())+Double.parseDouble(_y)));
views.get("lblaz").vw.setLeft((int)((views.get("btnaz").vw.getLeft())+Double.parseDouble(_y)));
views.get("lblaz").vw.setLeft((int)((views.get("btnaz").vw.getLeft())+Double.parseDouble(_y)));

}
}