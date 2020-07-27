package eBay.screens;

import org.openqa.selenium.WebDriver;

import eBay.commonUtils.ScreenActions;
import eBay.commonUtils.UIActions;

public class AddressScreen extends ScreenActions {
	public AddressScreen(WebDriver driver) {
		action = new UIActions(driver);
	}

}
