package eBay.sanity.tests;



import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



import eBay.commonUtils.CommonMethods;
import eBay.constants.Constants;
import eBay.constants.EbayConstants;
import eBay.locators.EbayLocator;
import eBay.logging.Verify;
import eBay.main.AutomationBase;
import eBay.screens.*;


public class VerifyProductTest extends AutomationBase {

	
	public final Logger logger = Logger.getLogger(this.getClass().getSimpleName());
	static Screens screens = PageFactory.initElements(driver, Screens.class);
	boolean isResetRequired = false;
	public String phoneNo = propRead.readPropertyFile("userDetails.properties", "phoneNo");
	public String password = propRead.readPropertyFile("userDetails.properties", "password");
	String text = "Add to Cart";
	

	@BeforeTest
	public void setUp() {
		try {
			PropertyConfigurator.configure(Constants.LOG4J_CONFIG_PATH);
			startServerService();	
			super.setAndroidDriver(deviceVersion, deviceName, port, isResetRequired);			
			logger.info(EbayConstants.BeforeAndAfterSetup.LOG_BEFORE_SETUP_DONE);
			logger.info("Device version: "+deviceVersion);
			logger.info(EbayConstants.BeforeAndAfterSetup.LOG_BEFORE_REST_APK+isResetRequired);
			PageFactory.initElements(driver, VerifyProductTest.class);
			
		} catch (Exception e) {
			e.printStackTrace();
			logger.info(EbayConstants.BeforeAndAfterSetup.LOG_BEFORE_SETUP_FAIL);
		}
	}	
	
	@Test
	public void invokeTest() throws Exception {	

		Thread.sleep(1000);
		userSignIn(phoneNo, password);
		searchProduct("65-inch Tv");
		String productName = screens.productDetailsScreen().getText(EbayLocator.SearchResult.TXT_PRODUCT_TITLE);
		String productPrice = screens.productDetailsScreen().getText(EbayLocator.SearchResult.TXT_PRODUCT_PRICE);
		System.out.println(productName);
		System.out.println(productPrice);
		
		
		CommonMethods.scrollTo(text);
		screens.productDetailsScreen().clickElement(EbayLocator.SearchResult.BTN_ADD_TO_CART);
		screens.productDetailsScreen().clickElement(EbayLocator.ShoppingCart.ICON_CART);
		
		String productNameInCart = screens.checkOutScreen().getText(EbayLocator.ShoppingCart.TXT_PRODUCT_TITLE);
		String productPriceInCart = screens.checkOutScreen().getText(EbayLocator.ShoppingCart.TXT_PRODUCT_PRICE);
		System.out.println(productNameInCart);
		System.out.println(productPriceInCart);
		
		
		if(productName.startsWith(productNameInCart)) {
			System.out.println("Product Pass");
			Verify.verifyTrue(true, EbayConstants.SearchScreen.TXT_TITLE_PASS);
			} else {
			System.out.println("Product Fail");
			Verify.verifyTrue(false, EbayConstants.SearchScreen.TXT_DESCRIPTION_FAIL);
		}
		
		if(productPrice.startsWith(productPriceInCart)) {
			System.out.println("Price Pass");
			Verify.verifyTrue(true, EbayConstants.SearchScreen.TXT_PRICE_PASS);
			} else {
			System.out.println("Price Fail");
			Verify.verifyTrue(false, EbayConstants.SearchScreen.TXT_PRICE_FAIL);
		}
		
		

	}
	
	
	/*
	 * Method for User signIn
	 * 
	 */
	public static void userSignIn(String mobNumber, String password) throws Exception {
		screens.signInScreen().waitForElementPresent(5, EbayLocator.SignIn.BTN_EXIST_CUST);
		screens.signInScreen().clickElement(EbayLocator.SignIn.BTN_EXIST_CUST);
		Thread.sleep(5000);
		screens.signInScreen().clickElement(EbayLocator.SignIn.TXT_PHONE);
		screens.signInScreen().sendText(EbayLocator.SignIn.TXT_PHONE, mobNumber);
		screens.signInScreen().clickElement(EbayLocator.SignIn.BTN_COUNTINUE);
		screens.signInScreen().sendText(EbayLocator.SignIn.TXT_PASSWORD, password);
		screens.signInScreen().clickElement(EbayLocator.SignIn.BTN_LOGIN);
		Thread.sleep(5000);
       
    }
	
	/*
	 * Method for Searching a product
	 * 
	 */
	public static void searchProduct(String productName) throws Exception {
		screens.searchResultScren().waitForElementPresent(5, EbayLocator.Home.TXT_SEARCH);
		Thread.sleep(10000);
		screens.searchResultScren().clickElement(EbayLocator.Home.TXT_SEARCH);
		screens.searchResultScren().sendText(EbayLocator.Home.TXT_SEARCH, productName);
		CommonMethods.performEnterKeyAction();
		Thread.sleep(5000);
		int count = CommonMethods.generateRandomIntIntRange(1, 6);
		System.out.println(count);
		screens.searchResultScren().clickElement(By.xpath(EbayLocator.SearchResult.PRE_XPATH_EXPN + count + EbayLocator.SearchResult.POST_XPATH_EXPN));
		Thread.sleep(5000);
    }
	
	/*
	 * Method for Scrolling to product
	 * 
	 */
	public static void scrollToProductName(String productName)  {
		CommonMethods.scrollTo(productName);
	}
	

	

	
	@AfterTest
	public void teardown() {
			logger.info("Running AfterTest");		
			stopServerService();
			super.teardown();
		 
	}

	
	
	
	
	
}