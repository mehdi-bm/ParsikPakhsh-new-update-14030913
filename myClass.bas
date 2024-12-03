B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.8
@EndOfDesignText@
'Custom View class 
#Event: ExampleEvent (Value As Int)
#DesignerProperty: Key: BooleanExample, DisplayName: Boolean Example, FieldType: Boolean, DefaultValue: True, Description: Example of a boolean property.
#DesignerProperty: Key: IntExample, DisplayName: Int Example, FieldType: Int, DefaultValue: 10, MinRange: 0, MaxRange: 100, Description: Note that MinRange and MaxRange are optional.
#DesignerProperty: Key: StringWithListExample, DisplayName: String With List, FieldType: String, DefaultValue: Sunday, List: Sunday|Monday|Tuesday|Wednesday|Thursday|Friday|Saturday
#DesignerProperty: Key: StringExample, DisplayName: String Example, FieldType: String, DefaultValue: Text
#DesignerProperty: Key: ColorExample, DisplayName: Color Example, FieldType: Color, DefaultValue: 0xFFCFDCDC, Description: You can use the built-in color picker to find the color values.
#DesignerProperty: Key: DefaultColorExample, DisplayName: Default Color Example, FieldType: Color, DefaultValue: Null, Description: Setting the default value to Null means that a nullable field will be displayed.
Sub Class_Globals
	Private mEventName As String 'ignore
	Private mCallBack As Object 'ignore
	Private mBase As Panel
	Private Const DefaultColorConstant As Int = -984833 'ignore
End Sub

Public Sub Initialize (Callback As Object, EventName As String)
	mEventName = EventName
	mCallBack = Callback
End Sub

Public Sub DesignerCreateView (Base As Panel, Lbl As Label, Props As Map)
	mBase = Base
    
End Sub

Public Sub GetBase As Panel
	Return mBase
End Sub

Public Sub GetAdvertisingId As ResumableSub
	Dim jo As JavaObject = Me
	jo.RunMethod("GetAdvertisingId", Null)
	Wait For AdvertisingId_Ready (Success As Boolean, Id As String)
	Return Id
End Sub

Public Sub AdvertisingId_Ready (Success As Boolean, Id As String)

End Sub
#if Java
import java.util.concurrent.Callable;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;

public static void GetAdvertisingId() {
   BA.runAsync(processBA, mostCurrent, "advertisingid_ready", new Object[] {false, ""}
       , new Callable<Object[]>() {
                   @Override
                   public Object[] call() throws Exception {
                       String id = AdvertisingIdClient.getAdvertisingIdInfo(mostCurrent).getId();
                       return new Object[] {true, id};
                   }
               }); }
#End If