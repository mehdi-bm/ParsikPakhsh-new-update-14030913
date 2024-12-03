package ir.parsikhesab.pakhsh.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_l_splash{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("pnllogo").vw.setLeft((int)((50d / 100 * width) - (views.get("pnllogo").vw.getWidth() / 2)));
views.get("pnltitle").vw.setLeft((int)((50d / 100 * width) - (views.get("pnltitle").vw.getWidth() / 2)));
views.get("pnlver").vw.setLeft((int)((50d / 100 * width) - (views.get("pnlver").vw.getWidth() / 2)));
views.get("progressbar1").vw.setLeft((int)((50d / 100 * width) - (views.get("progressbar1").vw.getWidth() / 2)));

}
}