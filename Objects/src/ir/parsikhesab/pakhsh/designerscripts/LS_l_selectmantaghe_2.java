package ir.parsikhesab.pakhsh.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_l_selectmantaghe_2{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
views.get("btnnewashkhas").vw.setTop((int)((views.get("pnl_hlv").vw.getHeight())-(13d / 100 * height)));
views.get("btnnewashkhas").vw.setLeft((int)((views.get("pnl_hlv").vw.getWidth())-(20d / 100 * width)));
views.get("panel3").vw.setLeft((int)((5d / 100 * width)));
views.get("panel3").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
views.get("txtsearch").vw.setWidth((int)((75d / 100 * width)));

}
}