package eBay.screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import eBay.commonUtils.ScreenActions;
import eBay.commonUtils.UIActions;
import io.appium.java_client.AppiumDriver;

public class HomeScreen extends ScreenActions{
	
	public HomeScreen(WebDriver driver) {
		action = new UIActions(driver);
	}

	public void scrollToAnElementByText(AppiumDriver driver, By governmentScheemsTxtTitle) {
		// TODO Auto-generated method stub
		
	}

}
