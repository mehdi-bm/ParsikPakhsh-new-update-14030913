Type=StaticCode
Version=7.3
ModulesStructureVersion=1
B4A=true
@EndOfDesignText@
'Code module
'Subs in this code module will be accessible from all modules.
Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
End Sub

Sub SetAnimation(InAnimation As String,OutAnimation As String)
	Dim R As Reflector
	Dim Package As String
	Dim In , Out As Int
	Package=R.GetStaticFielD("anywheresoftware.b4a.BA","packageName")
	In=R.GetStaticField(Package & ".R$anim",InAnimation)
	Out=R.GetStaticField(Package & ".R$anim",OutAnimation)
	R.Target=R.GetActivity
	R.RunMethod4("overridePendingTransition",Array As Object(In,Out),Array As String("java.lang.int","java.lang.int"))
End Sub