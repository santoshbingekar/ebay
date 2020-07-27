package eBay.main;

import java.io.File;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


import org.apache.log4j.Logger;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import com.gargoylesoftware.htmlunit.javascript.host.dom.Node;

import eBay.commonUtils.PropertyFileRead;
import eBay.constants.Constants;
import eBay.enums.MobCapabilityType;
import eBay.listners.ExtentReporterNG;
import eBay.screens.Screens;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;



public class AutomationBase extends ExtentReporterNG {
	
	public static PropertyFileRead propRead = new PropertyFileRead();


	public final Logger logger = Logger.getLogger(this.getClass().getSimpleName());

	protected static AppiumDriver driver;
	protected static AndroidDriver androidDriver;
	Screens screens = PageFactory.initElements(driver, Screens.class);
	
	public static String deviceVersion = propRead.readPropertyFile("project.properties", "deviceVersion");
	public static String port = propRead.readPropertyFile("project.properties", "port");
	public static String deviceName = propRead.readPropertyFile("project.properties", "deviceName");
	public static String platform = propRead.readPropertyFile("project.properties", "platform");
	public static String automationName = propRead.readPropertyFile("project.properties", "automationName");
	public static String packageName = propRead.readPropertyFile("project.properties", "packageName");
	public static String activityName = propRead.readPropertyFile("project.properties", "activityName");
	//public static String apkpath=Constants.STAGING_APK;
	public static String apkpath=Constants.STAGING_APK;
	Boolean autoGrant = true;
	File app=new File(apkpath);
	String commandTimeOut = "60";
	public static Integer implicitTimeOut = 15;
	public static String testCaseID = "";
	//public static boolean status = true;
	public static long currentTime;
	
	static AppiumDriverLocalService appium;
	
	
	
	public void setAndroidDriver(String deviceVersion, String deviceName, String port, boolean isResetRequired ) throws MalformedURLException, InterruptedException {
		
			//Set up desired capabilities and pass the Android app-activity and app-package to Appium
			Thread.sleep(9000l);			
			DesiredCapabilities capabilities = new DesiredCapabilities();	
			capabilities.setCapability(MobCapabilityType.APP.getValue(), app.getAbsolutePath());
			capabilities.setCapability(MobCapabilityType.PLATFORM_NAME.getValue(), Constants.ANDROID);
			capabilities.setCapability(MobCapabilityType.PLATFORM_VERSION.getValue(), deviceVersion);
			capabilities.setCapability(MobCapabilityType.DEVICE_NAME.getValue(), deviceName);
			capabilities.setCapability(MobCapabilityType.APP_WAIT_ACTIVITY.getValue(), "*");
			capabilities.setCapability(MobCapabilityType.APP_ACTIVITY.getValue(), activityName);
			capabilities.setCapability(MobCapabilityType.APP_PACKAGE.getValue(), packageName);
			capabilities.setCapability(MobCapabilityType.AUTOMATION_NAME.getValue(), automationName);
			capabilities.setCapability(MobCapabilityType.AUTOGRANT_PERMISSSION.getValue(), autoGrant);
			capabilities.setCapability(MobCapabilityType.FULL_RESET_APP.getValue(),isResetRequired);
			capabilities.setCapability(MobCapabilityType.NEW_COMMAND_TIMEOUT.getValue(), commandTimeOut);
			driver = new AndroidDriver(new URL("http://127.0.0.1:" + port + "/wd/hub"), capabilities);
	        androidDriver = (AndroidDriver) driver;
			driver.manage().timeouts().implicitlyWait(implicitTimeOut, TimeUnit.SECONDS);
		    System.out.println("Capability set for Android  " + deviceName);
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  
		    logger.info("Adroid Capabilities set");
	   }
	
	
	public void setAndroid(String deviceVersion, String deviceName, String port, boolean isResetRequired ) throws MalformedURLException, InterruptedException {
		
		//Set up desired capabilities and pass the Android app-activity and app-package to Appium
		Thread.sleep(9000l);			
		
		
   }
	

	public static AppiumDriver getDriver() {
	        return driver;
	    }
	
    public static AndroidDriver getAndroidDriver() {
        return androidDriver;
    }
    
    public static boolean isAndroid() throws Exception {
        return platform != null;
    }
  
	
	public void startServerService(){
		AppiumDriverLocalService service = AppiumDriverLocalService.buildDefaultService();
		service.start();
	}
	
	public void startServerServiceOnMac() {
		AppiumDriverLocalService service = AppiumDriverLocalService.buildService(new AppiumServiceBuilder().usingDriverExecutable(new File("/usr/local/Cellar/node/11.9.0/bin/node")).withAppiumJS(new File("/usr/local/lib/node_modules/appium/build/lib/main.js")).withIPAddress("127.0.0.1").usingPort(4723));

		service.start();
			
	}
	public void stopServerService(){
		AppiumDriverLocalService service = AppiumDriverLocalService.buildDefaultService();
		service.stop();
		
	}


	
   

	public void teardown() {
		// TODO Auto-generated method stub
		
	}
	
	


}