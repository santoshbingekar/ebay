package eBay.screens;

import org.openqa.selenium.WebDriver;

import eBay.commonUtils.ScreenActions;
import eBay.commonUtils.UIActions;

public class ProductDetailsScreen extends ScreenActions {
	public ProductDetailsScreen(WebDriver driver) {
		action = new UIActions(driver);
	}

}
