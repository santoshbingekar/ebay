package eBay.commonUtils;



import java.util.Random;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;


import eBay.main.AutomationBase;
import eBay.screens.Screens;


public class CommonMethods extends AutomationBase{
	
	
	
	static Screens screens = PageFactory.initElements(driver, Screens.class);

	public static boolean navigateBack(int number) throws InterruptedException {
        for (int i = 1; i <= number; i++) {
            screens.commonScreen().back();
            Thread.sleep(2000);
        }
        return true;
    }

	
	public static void scrollTo(String text) {
    	androidDriver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+text+"\").instance(0))");
    }
	
	public static void performEnterKeyAction() {
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).perform();
    	
    }

	public static int generateRandomIntIntRange(int min, int max) {
		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}
	

	  
	

}
