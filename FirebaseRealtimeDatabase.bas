B4A=true
Group=Class
ModulesStructureVersion=1
Type=Class
Version=8.3
@EndOfDesignText@
#Event: _DataBaseCommunicationComplete(ResponseData as Map, RequestTag as String)

Sub Class_Globals
	Private BaseURL As String
	Private TargetModule As Object
	Private TargetEventName As String
End Sub

'Initializes the object. 
'EventName: The event prefix
'Target: The target module. e.g. Me
'DataBaseURL: should be like "https://[PROJECT_ID].firebaseio.com/"
'READ THE DOCS AND LEARN ABOUT DATABASE RULES BEFORE USING THIS IN A PROJECT
'https://firebase.google.com/docs/reference/rest/database
Public Sub Initialize(EventName As String,Target As Object, DataBaseURL As String)
	BaseURL = DataBaseURL
	TargetModule = Target
	TargetEventName = EventName
End Sub

'Will send a GET Request to get Data. 
'Linksuffix: e.g. "users/posts"
'Token: If you have a TokenID from FirebaseAuth, you can pass it here to autheticate the request
'_DataBaseCommunicationComplete Event will be raised, ResponseData will be uninitialized if the request failed
Public Sub ReadData(LinkSuffix As String, Token As String,RequestTag As String)
	Dim hj As HttpJob
	hj.Initialize("readdata",Me)
	hj.Tag = RequestTag
	Dim RequestURL As String = BaseURL & LinkSuffix & ".json"
	If Not(Token = "") Then
		RequestURL = RequestURL & "?auth=" & Token
	End If
	hj.Download(RequestURL)
End Sub

'Extended ReadData
'AdditionalParameters: Additional Paramteres to specify e.g. Starting and Ending Points. Make sure to pass the Parameters HTTP compatible (divided by &) BUT DONT PREFIX IT WITH &
'Example for Parameters: startAt=10&endAt=20
'_DataBaseCommunicationComplete Event will be raised, ResponseData will be uninitialized if the request failed
Public Sub ReadData2(LinkSuffix As String, Token As String, AdditionalParameters As String, RequestTag As String)
	Dim hj As HttpJob
	hj.Initialize("readdata",Me)
	hj.Tag = RequestTag
	Dim RequestURL As String = BaseURL & LinkSuffix & ".json"
	If Not(Token = "") Then
		RequestURL = RequestURL & "?auth=" & Token
	End If
	If Not(AdditionalParameters = "") Then
		RequestURL = RequestURL & "&" & AdditionalParameters
	End If
	hj.Download(RequestURL)
End Sub

'Will send a PUT Request to write Data. 
'Linksuffix: e.g. "users/posts"
'Token: If you have a TokenID from FirebaseAuth, you can pass it here to autheticate the request
'JSONString: The Data you want to write
'_DataBaseCommunicationComplete Event will be raised, ResponseData will be uninitialized if the request failed
Public Sub WriteData(LinkSuffix As String, Token As String, JSONString As String, RequestTag As String)
	Dim hj As HttpJob
	hj.Initialize("writedata",Me)
	hj.Tag = RequestTag
	Dim RequestURL As String = BaseURL & LinkSuffix & ".json"
	If Not(Token = "") Then
		RequestURL = RequestURL & "?auth=" & Token
	End If
	hj.PutString(RequestURL,JSONString)
End Sub

'Will send a POST Request to push Data. 
'Linksuffix: e.g. "users/posts"
'Token: If you have a TokenID from FirebaseAuth, you can pass it here to autheticate the request
'JSONString: The Data you want to push
'_DataBaseCommunicationComplete Event will be raised, ResponseData will be uninitialized if the request failed
Public Sub PushData(LinkSuffix As String, Token As String, JSONString As String, RequestTag As String)
	Dim hj As HttpJob
	hj.Initialize("pushdata",Me)
	hj.Tag = RequestTag
	Dim RequestURL As String = BaseURL & LinkSuffix & ".json"
	If Not(Token = "") Then
		RequestURL = RequestURL & "?auth=" & Token
	End If
	hj.PostString(RequestURL,JSONString)
End Sub

'Will send a PATCH Request to update Data. 
'Linksuffix: e.g. "users/posts"
'Token: If you have a TokenID from FirebaseAuth, you can pass it here to autheticate the request
'JSONString: The Data you want to push
'_DataBaseCommunicationComplete Event will be raised, ResponseData will be uninitialized if the request failed
Public Sub UpdateData(LinkSuffix As String, Token As String, JSONString As String, RequestTag As String)
	Dim hj As HttpJob
	hj.Initialize("updatedata",Me)
	hj.Tag = RequestTag
	Dim RequestURL As String = BaseURL & LinkSuffix & ".json"
	If Not(Token = "") Then
		RequestURL = RequestURL & "?auth=" & Token
	End If
	hj.PatchString(RequestURL,JSONString)
End Sub

'Will send a DELETE Request to remove Data. 
'Linksuffix: e.g. "users/posts"
'Token: If you have a TokenID from FirebaseAuth, you can pass it here to autheticate the request
'_DataBaseCommunicationComplete Event will be raised, ResponseData will be uninitialized if the request failed
Public Sub DeleteData(LinkSuffix As String, Token As String,RequestTag As String)
	Dim hj As HttpJob
	hj.Initialize("deletedata",Me)
	hj.Tag = RequestTag
	Dim RequestURL As String = BaseURL & LinkSuffix & ".json"
	If Not(Token = "") Then
		RequestURL = RequestURL & "?auth=" & Token
	End If
	hj.Delete(RequestURL)
End Sub

Sub JobDone(hj As HttpJob)
	Dim ResultData As Map
	
	If hj.Success Then
		Try
			Dim json As JSONParser
			json.Initialize(hj.GetString)
			ResultData = json.NextObject
		Catch
			Log("Error Parsing Response JSON!")
		End Try
	End If
	
	CallSub3(TargetModule,TargetEventName & "_DataBaseCommunicationComplete",ResultData,hj.Tag)
	hj.Release
End Sub
