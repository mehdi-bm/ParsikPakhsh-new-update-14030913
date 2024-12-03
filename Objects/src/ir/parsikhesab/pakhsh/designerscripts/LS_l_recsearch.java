package ir.parsikhesab.pakhsh.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_l_recsearch{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
String _x="";
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("imagecall").vw.setLeft((int)((50d / 100 * width) - (views.get("imagecall").vw.getWidth() / 2)));
_x = BA.NumberToString((views.get("panel4").vw.getWidth())/3d);
views.get("panel6").vw.setLeft((int)((50d / 100 * width) - (views.get("panel6").vw.getWidth() / 2)));

}
}