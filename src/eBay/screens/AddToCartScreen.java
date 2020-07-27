package eBay.screens;

import org.openqa.selenium.WebDriver;

import eBay.commonUtils.ScreenActions;
import eBay.commonUtils.UIActions;

public class AddToCartScreen extends ScreenActions {
	public AddToCartScreen(WebDriver driver) {
		action = new UIActions(driver);
	}

}
