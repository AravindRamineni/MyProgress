Progress Dialog is used to display loading / progress in android, by API level 26 the progress dialog was depricated and we need to use 
ProgressBar instead. To implement ProgressBar in android programatically follow the below instructions.


1. Add this in root level gradle.gradle file
    allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		  }
	  }
    
 2. Add this dependency to build.gradle file
     dependencies {
	        implementation 'com.github.AravindRamineni:MyProgress:0.1.0'
	   }

To import this as a module 
1. Open Android Studio --> File --> New --> Import Module.
2. Choose the module from the system.
3. In the build.gradle file add 
      
	  dependencies {
	        implementation project(':myprogress')
	   }
	   
	   
