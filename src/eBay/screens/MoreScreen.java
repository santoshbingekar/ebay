package eBay.screens;

import org.openqa.selenium.WebDriver;

import eBay.commonUtils.ScreenActions;
import eBay.commonUtils.UIActions;

public class MoreScreen extends ScreenActions{
	
	public MoreScreen(WebDriver driver) {
		action = new UIActions(driver);
	}


}
