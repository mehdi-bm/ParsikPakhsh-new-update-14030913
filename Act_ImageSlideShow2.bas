B4A=true
Group=Activity
ModulesStructureVersion=1
Type=Activity
Version=12.2
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
#End Region

Sub Process_Globals
	Dim Item As AdapterListKala
End Sub

Sub Globals
	Private cv1 As CarouselView
	
	Dim bm As Bitmap
	Dim blist As List                               'images to be passed to the library via this list
	Dim imgv As ImageView
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("L_ImageSlide")
	Dim Glide As Hitex_Glide
	
	'Dim pc As Picasso
	'pc.Initialize
	
	imgv.Initialize("")
	blist.Initialize                                     'initialize an empty list
	 
	bm.Initialize(File.DirAssets, "image_1.jpg")
	blist.Add(bm)                                        'add the image to the list
	bm.Initialize(File.DirAssets, "image_2.jpg")
	blist.Add(bm)
	bm.Initialize(File.DirAssets, "image_3.jpg")
	blist.Add(bm)
	bm.Initialize(File.DirAssets, "image_4.jpg")
	blist.Add(bm)
	bm.Initialize(File.DirAssets, "image_5.jpg")
	blist.Add(bm)
	'imgv= pc.LoadUrl("https://rayansanatsoft.ir/download/temp/1.png").Get()
	'Glide.Load2("https://rayansanatsoft.ir/download/temp/1.png").Into(imgv)
	Glide.GetBitmap("Glide","https://rayansanatsoft.ir/download/temp/1.png")
	'kickstart the carousel into action
	 
	' there is also cv1.pauseCarousel that can be used to pause the carousel

End Sub

Private Sub Glide_onGetBitmap (Tag As Object, getBitmap As Bitmap)
'	imgv.Bitmap=getBitmap
	blist.Add(getBitmap)
	cv1.ImageBitmaps = blist                              'pass the list with images to the library
	 
	cv1.Radius = 10                                       'the radius of the indicator circles
	cv1.StrokeColor = Colors.Magenta                      'the outline color of the circles
	cv1.StrokeWidth = 5                                   'the width of the outline circles
	cv1.FillColor = Colors.White                          'the color to fill the circles with - active page/image
	cv1.AutoPlay = True                                   'play automatically?
	cv1.CurrentItem = 0                                   'set the indeks of where to initially start from: 0 to (number of image - 1)
	cv1.DisableAutoPlayOnUserInteraction = True	       'stop auto play if image is touched during autoplay
	cv1.Orientation = cv1.ORIENTATION_HORIZONTAL          'can also be ORIENTATION_VERTICAL in which case it will be position to the left of the CarouselView
	cv1.PageCount = blist.Size                            'the number of pages/images to display
	cv1.PageColor = Colors.Transparent	                   'the color in the centre of the indicator circles for "not active" pages
	cv1.SlideInterval = 0                              'the slide interval in milli seconds
	  
	cv1.playCarousel
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub
