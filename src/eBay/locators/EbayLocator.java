package eBay.locators;

import org.openqa.selenium.By;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileBy.ByAccessibilityId;
import io.appium.java_client.MobileBy.ByAndroidUIAutomator;

public class EbayLocator {
	
	public static final class Menu {
		public static final By TXT_MENU = By.id("com.amazon.mShop.android.shopping:id/sign_in_button");
		public static final By LNK_SIGNIN = By.id("com.ebay.mobile:id/logo");
		public static final By LNK_REGISTER = By.id("com.ebay.mobile:id/button_register");
		public static final By ICON_CART = By.id("com.ebay.mobile:id/action_view_icon");
		
	}
	
	public static final class Register {
		public static final By TXT_FIRSTNAME = By.id("firstname");
		public static final By TXT_LASTNAME = By.id("lastname");
		public static final By TXT_EMAIL = By.id("email");
		public static final By TXT_PASSWORD = By.id("PASSWORD");
		public static final By BTN_REGISTER = By.id("ppaFormSbtBtn");
	}
	
	public static final class SignIn {
		public static final By TXT_EMAIL = By.id("com.ebay.mobile:id/edit_text_username");
		public static final By TXT_PASSWORD = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[5]/android.view.View[2]/android.widget.EditText");
		public static final By BTN_LOGIN = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[5]/android.view.View[6]/android.widget.Button");
		public static final By BTN_EXIST_CUST = By.id("com.amazon.mShop.android.shopping:id/sign_in_button");
		public static final By TXT_PHONE = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.view.View[3]/android.widget.EditText");
		public static final By BTN_COUNTINUE = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.view.View[4]/android.widget.Button");
		
		public static final By TXT_PHONE1 = ByAndroidUIAutomator.id("ap_email_login");
	}
	

	public static final class Home {
		public static final By TXT_SEARCH = By.id("com.amazon.mShop.android.shopping:id/rs_search_src_text");
		public static final By TXT_SEARCH_INNER = By.xpath("//android.widget.ImageView[@content-desc='Append search suggestion to your search query']");
		public static final By TXT_SEARCH_POPULATED = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ViewAnimator/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout");
		public static final By TXT_SEARCH_DESCRIPTION = By.id("com.ebay.mobile:id/description_snippet_textview");
			
		
	}
	
	public static final class SearchResult {

		public static final By TXT_RESULTS_POPULATED = By.id("com.ebay.mobile:id/cell_collection_item");
		public static final By POPUP_SAVE = By.id("com.ebay.mobile:id/text_slot_1");
		public static final By TXT_PRODUCT_TITLE = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ViewAnimator/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View");
		public static final By TXT_PRODUCT_PRICE = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ViewAnimator/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[4]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View");
		public static final By BTN_ADD_TO_CART = By.id("add-to-cart-button");
		public static final By TXT_SEARCH_DESCRIPTION = By.id("com.ebay.mobile:id/description_snippet_textview");
		
		public static final String PRE_XPATH_EXPN = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ViewAnimator/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[";
		public static final String POST_XPATH_EXPN = "]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout";
	}
	
	public static final class ShoppingCart {
		
		public static final By ICON_CART = By.id("com.amazon.mShop.android.shopping:id/action_bar_cart_image");
		public static final By BTN_CHECKOUT = By.id("com.ebay.mobile:id/shopping_cart_checkout");
		public static final By TXT_PRODUCT_TITLE = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View");
		public static final By TXT_PRODUCT_PRICE = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.widget.ListView/android.view.View[1]");
		
		
	}
	
	public static final class CheckOut {

		public static final By TXT_ITEM_TITLE = By.id("com.ebay.mobile:id/item_title");
		public static final By TXT_ITEM_PRICE = By.id("com.ebay.mobile:id/item_price");
		
		
	}
	
	
	
	
		
		
	
	

}
