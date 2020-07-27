package eBay.commonUtils;

import io.appium.java_client.AppiumDriver;

import io.appium.java_client.android.AndroidDriver;


import java.util.ArrayList;

import java.util.List;



import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class UIActions {
	public final Logger logger = Logger.getLogger(this.getClass().getSimpleName());
	//AppiumDriver driver;
    public By element;
    public AndroidDriver androidDriver;
    private AppiumDriver driver;
	public UIActions(WebDriver driver) {
		this.driver = (AppiumDriver) driver;
	}

	public WebElement getElement(By by) throws NoSuchElementException {
		WebElement element = null;
		element = driver.findElement(by);
		return element;
	}

	public boolean elementIsVisible(By by) {
		try {
			WebElement webEleObj = driver.findElement(by);
			boolean isDisplayed = webEleObj.isDisplayed();
			return isDisplayed;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	public boolean elementIsEnabled(By by) {
		try {
			WebElement webEleObj = driver.findElement(by);
			boolean isEnabled = webEleObj.isEnabled();
			return isEnabled;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	
	

	public boolean sendText(By field, String value) throws NoSuchElementException {
		driver.findElement(field).clear();
		driver.findElement(field).sendKeys(value);
		return true;
	}
	

	
	public boolean clickElement(By field) throws NoSuchElementException {

		if (waitForElementToBeClickable(10, field)) {
			WebElement webElemObj = driver.findElement(field);
			webElemObj.click();
			return true;
		} else
			return false;
	}
	


	public String getElementText(By by) throws NoSuchElementException {
		WebElement element = getElement(by);
		String elementText = element.getText();
		return elementText;
	}




	public boolean waitForElement(long seconds, By by) {
		try {
			new WebDriverWait(driver, seconds).until(ExpectedConditions.visibilityOfElementLocated(by));
			return true;
		} catch (NoSuchElementException e) {
			System.out.println("Method waitForElement: NoSuchElementException " + e.getMessage());
			return false;
		} catch (Exception e) {
			System.out.println("Method waitForElement: Generic Exception " + e.getMessage());
			return false;
		}
	}




	public boolean waitForElementToBeClickable(long seconds, By by) {
		try {
			new WebDriverWait(driver, seconds).until(ExpectedConditions.elementToBeClickable(by));
			return true;
		} catch (NoSuchElementException e) {
			System.out.println("Method waitForElementToBeClickable: NoSuchElementException " + e.getMessage());
			return false;
		} catch (Exception e) {
			System.out.println("Method waitForElementToBeClickable: Generic Exception " + e.getMessage());
			return false;
		}
	}



	public List<WebElement> getListofElement(By by) throws NoSuchElementException {
		List<WebElement> elementList = null;
		elementList = driver.findElements(by);
		return elementList;
	}
	
	

	public List<String> getListofElementText(By by) throws NoSuchElementException {
		List<WebElement> elementList = null;
		List<String> listValue = new ArrayList<String>();
		elementList = getListofElement(by);
		for (WebElement e : elementList) {
			listValue.add(e.getText().toUpperCase());
		}
		return listValue;
	}




    
    public void back() {     
        logger.info("clicking device back");
        driver.navigate().back();
    }
    

    
    




}