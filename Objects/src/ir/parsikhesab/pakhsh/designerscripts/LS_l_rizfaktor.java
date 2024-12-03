package ir.parsikhesab.pakhsh.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_l_rizfaktor{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("lblarzeshafzode").vw.setLeft((int)((1d / 100 * width)));
views.get("label24").vw.setLeft((int)((views.get("lblarzeshafzode").vw.getLeft() + views.get("lblarzeshafzode").vw.getWidth())+(1.5d / 100 * width)));
views.get("lbltotalfaktor2").vw.setLeft((int)((55.5d / 100 * width)));
views.get("label1").vw.setLeft((int)((views.get("lbltotalfaktor2").vw.getLeft() + views.get("lbltotalfaktor2").vw.getWidth())+(1.5d / 100 * width)));
views.get("lbltakhfifvizhe").vw.setLeft((int)((1d / 100 * width)));
views.get("label17").vw.setLeft((int)((views.get("lbltakhfifvizhe").vw.getLeft() + views.get("lbltakhfifvizhe").vw.getWidth())+(1.5d / 100 * width)));
views.get("lbltakhfifkala").vw.setLeft((int)((55.5d / 100 * width)));
views.get("label2").vw.setLeft((int)((views.get("lbltakhfifkala").vw.getLeft() + views.get("lbltakhfifkala").vw.getWidth())+(1.5d / 100 * width)));
views.get("lblmandeghabl").vw.setLeft((int)((1d / 100 * width)));
views.get("label20").vw.setLeft((int)((views.get("lblmandeghabl").vw.getLeft() + views.get("lblmandeghabl").vw.getWidth())+(1.5d / 100 * width)));
views.get("lblmablaghbadaztakhfif").vw.setLeft((int)((54.5d / 100 * width)));
views.get("label16").vw.setLeft((int)((views.get("lblmablaghbadaztakhfif").vw.getLeft() + views.get("lblmablaghbadaztakhfif").vw.getWidth())+(1d / 100 * width)));
views.get("lblghabelepardakht").vw.setLeft((int)((1d / 100 * width)));
views.get("label21").vw.setLeft((int)((views.get("lblghabelepardakht").vw.getLeft() + views.get("lblghabelepardakht").vw.getWidth())+(1.5d / 100 * width)));
views.get("lblmablaghkhales").vw.setLeft((int)((55.5d / 100 * width)));
views.get("label13").vw.setLeft((int)((views.get("lblmablaghkhales").vw.getLeft() + views.get("lblmablaghkhales").vw.getWidth())+(1.5d / 100 * width)));

}
}