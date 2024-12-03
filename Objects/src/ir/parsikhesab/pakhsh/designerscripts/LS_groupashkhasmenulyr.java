package ir.parsikhesab.pakhsh.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_groupashkhasmenulyr{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
String _x="";
//BA.debugLineNum = 2;BA.debugLine="AutoScaleAll"[groupashkhasmenulyr/General script]
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
//BA.debugLineNum = 3;BA.debugLine="x=67%x"[groupashkhasmenulyr/General script]
_x = BA.NumberToString((67d / 100 * width));
//BA.debugLineNum = 4;BA.debugLine="pnlMenu.Width=x"[groupashkhasmenulyr/General script]
views.get("pnlmenu").vw.setWidth((int)(Double.parseDouble(_x)));
//BA.debugLineNum = 5;BA.debugLine="pnlGroup.Width=x"[groupashkhasmenulyr/General script]
views.get("pnlgroup").vw.setWidth((int)(Double.parseDouble(_x)));
//BA.debugLineNum = 8;BA.debugLine="lblAppName.Left=ImageProfileMenu.Right"[groupashkhasmenulyr/General script]
views.get("lblappname").vw.setLeft((int)((views.get("imageprofilemenu").vw.getLeft() + views.get("imageprofilemenu").vw.getWidth())));
//BA.debugLineNum = 9;BA.debugLine="lblAppName.VerticalCenter=6%y"[groupashkhasmenulyr/General script]
views.get("lblappname").vw.setTop((int)((6d / 100 * height) - (views.get("lblappname").vw.getHeight() / 2)));
//BA.debugLineNum = 10;BA.debugLine="lblBackGroup.Left=55%x"[groupashkhasmenulyr/General script]
views.get("lblbackgroup").vw.setLeft((int)((55d / 100 * width)));

}
}