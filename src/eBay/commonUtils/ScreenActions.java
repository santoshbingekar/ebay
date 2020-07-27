package eBay.commonUtils;

import io.appium.java_client.AppiumDriver;

import io.appium.java_client.android.AndroidDriver;
import java.util.List;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;




public abstract class ScreenActions {

	protected UIActions action;
	public final Logger logger = Logger.getLogger(this.getClass().getSimpleName());
	public static PropertyFileRead propRead = new PropertyFileRead();
	static AppiumDriver driver;
	static AndroidDriver androidDriver;
	private WebDriverWait wait;
	static String ANDROID_HOME=System.getenv("ANDROID_HOME");
	static String PLATFORM_TOOLS = "/platform-tools/";
	static String ADBHOME = ANDROID_HOME + PLATFORM_TOOLS;
	public static Integer implicitTimeOut = 15;


	public boolean clickElement(By element) {
		try {
			action.clickElement(element);
			return true;
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean sendText(By field,String text) {
		try {
			action.sendText(field, text);
			return true;
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	


	
	public boolean elementVisible(By element) {
		try {
			action.elementIsVisible(element);
			return true;
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean elementEnabled(By element) {
		try {
			action.elementIsEnabled(element);
			return true;
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public String getText(By element) {
		String text = "";
		try {
			text = action.getElementText(element);
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
		return text;
	}
	
	public List<WebElement> getListOfElements(By element) {
		List<WebElement> text = null;
		try {
			text = action.getListofElement(element);
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
		return text;
	}

	public boolean waitForElementPresent(long second, By element) {
		return action.waitForElement(second, element);
	}
	

	
	public boolean back() {
		try {
			action.back();
			return true;
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	} 
	
	
  
}
