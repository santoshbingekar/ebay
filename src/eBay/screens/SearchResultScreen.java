package eBay.screens;

import org.openqa.selenium.WebDriver;

import eBay.commonUtils.ScreenActions;
import eBay.commonUtils.UIActions;

public class SearchResultScreen extends ScreenActions{
	
	public SearchResultScreen(WebDriver driver) {
		action = new UIActions(driver);
	}
}
