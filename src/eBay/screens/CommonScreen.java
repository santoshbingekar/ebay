package eBay.screens;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import eBay.commonUtils.ScreenActions;
import eBay.commonUtils.UIActions;
import eBay.locators.EbayLocator;
import io.appium.java_client.android.AndroidDriver;

public class CommonScreen extends ScreenActions {

	
	public CommonScreen(WebDriver driver) {
		action = new UIActions(driver);
	}
	
	public static String getDevicesCommand() {
        if (System.getProperty("os.name").contains("Windows")) {
            return "adb devices | findstr /E device";
        } else {
            return "adb devices | grep -w device";
        }
    }
	
	 public boolean navigateBack(int number) throws InterruptedException {
	        for (int i = 1; i <= number; i++) {
	            action.back();
	            Thread.sleep(2000);
	        }
	        return true;
	    }


}
