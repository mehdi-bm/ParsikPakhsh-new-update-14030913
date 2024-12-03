package ir.parsikhesab.pakhsh.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_l_kalapaging_2{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("btnprev").vw.setTop((int)((50d / 100 * height) - (views.get("btnprev").vw.getHeight() / 2)));
views.get("btnnext").vw.setTop((int)((50d / 100 * height) - (views.get("btnnext").vw.getHeight() / 2)));
views.get("pnl_hlv").vw.setLeft((int)((3d / 100 * width)));
views.get("pnl_hlv").vw.setWidth((int)((97d / 100 * width) - ((3d / 100 * width))));

}
}