package eBay.screens;

import org.openqa.selenium.WebDriver;

import eBay.commonUtils.ScreenActions;
import eBay.commonUtils.UIActions;

public class CheckOutScreen extends ScreenActions{
	
	public CheckOutScreen(WebDriver driver) {
		action = new UIActions(driver);
	}

}
