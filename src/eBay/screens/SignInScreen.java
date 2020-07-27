package eBay.screens;

import org.openqa.selenium.WebDriver;

import eBay.commonUtils.ScreenActions;
import eBay.commonUtils.UIActions;

public class SignInScreen extends ScreenActions {
	public SignInScreen(WebDriver driver) {
		action = new UIActions(driver);
	}
}
