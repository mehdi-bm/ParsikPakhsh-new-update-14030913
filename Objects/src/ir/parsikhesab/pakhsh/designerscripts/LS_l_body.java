package ir.parsikhesab.pakhsh.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_l_body{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
String _x="";
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
_x = BA.NumberToString((100d / 100 * width)/4d);
views.get("label1").vw.setWidth((int)(Double.parseDouble(_x)));
views.get("label2").vw.setWidth((int)(Double.parseDouble(_x)));
views.get("label3").vw.setWidth((int)(Double.parseDouble(_x)));
views.get("label6").vw.setWidth((int)(Double.parseDouble(_x)));
//BA.debugLineNum = 8;BA.debugLine="Label1.Left=0"[l_body/General script]
views.get("label1").vw.setLeft((int)(0d));
//BA.debugLineNum = 9;BA.debugLine="Label2.Left=Label1.Right"[l_body/General script]
views.get("label2").vw.setLeft((int)((views.get("label1").vw.getLeft() + views.get("label1").vw.getWidth())));
//BA.debugLineNum = 10;BA.debugLine="Label3.Left=Label2.Right"[l_body/General script]
views.get("label3").vw.setLeft((int)((views.get("label2").vw.getLeft() + views.get("label2").vw.getWidth())));
//BA.debugLineNum = 11;BA.debugLine="Label6.Left=Label3.Right"[l_body/General script]
views.get("label6").vw.setLeft((int)((views.get("label3").vw.getLeft() + views.get("label3").vw.getWidth())));
//BA.debugLineNum = 12;BA.debugLine="Button1.Width=x"[l_body/General script]
views.get("button1").vw.setWidth((int)(Double.parseDouble(_x)));
//BA.debugLineNum = 13;BA.debugLine="Button2.Width=x"[l_body/General script]
views.get("button2").vw.setWidth((int)(Double.parseDouble(_x)));
//BA.debugLineNum = 14;BA.debugLine="Button3.Width=x"[l_body/General script]
views.get("button3").vw.setWidth((int)(Double.parseDouble(_x)));
//BA.debugLineNum = 15;BA.debugLine="Button4.Width=x"[l_body/General script]
views.get("button4").vw.setWidth((int)(Double.parseDouble(_x)));
//BA.debugLineNum = 16;BA.debugLine="Button1.Left=0"[l_body/General script]
views.get("button1").vw.setLeft((int)(0d));
//BA.debugLineNum = 17;BA.debugLine="Button2.Left=Button1.Right"[l_body/General script]
views.get("button2").vw.setLeft((int)((views.get("button1").vw.getLeft() + views.get("button1").vw.getWidth())));
//BA.debugLineNum = 18;BA.debugLine="Button3.Left=Button2.Right"[l_body/General script]
views.get("button3").vw.setLeft((int)((views.get("button2").vw.getLeft() + views.get("button2").vw.getWidth())));
//BA.debugLineNum = 19;BA.debugLine="Button4.Left=Button3.Right"[l_body/General script]
views.get("button4").vw.setLeft((int)((views.get("button3").vw.getLeft() + views.get("button3").vw.getWidth())));
//BA.debugLineNum = 20;BA.debugLine="line1.Left=Button2.Left"[l_body/General script]
views.get("line1").vw.setLeft((int)((views.get("button2").vw.getLeft())));
//BA.debugLineNum = 21;BA.debugLine="line2.Left=Button3.Left"[l_body/General script]
views.get("line2").vw.setLeft((int)((views.get("button3").vw.getLeft())));
//BA.debugLineNum = 22;BA.debugLine="Line3.Left=Button4.Left"[l_body/General script]
views.get("line3").vw.setLeft((int)((views.get("button4").vw.getLeft())));

}
}