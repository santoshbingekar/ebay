package eBay.screens;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import eBay.screens.AddToCartScreen;
import eBay.screens.AddressScreen;

import eBay.screens.ProductDetailsScreen;
import eBay.screens.Screens;
import eBay.screens.SearchResultScreen;
import eBay.screens.SignInScreen;

public class Screens {
	
	static WebDriver driver;

	
	CommonScreen commonScreen = PageFactory.initElements(driver, CommonScreen.class);
	HomeScreen homeScreen = PageFactory.initElements(driver, HomeScreen.class);
	MoreScreen moreScreen = PageFactory.initElements(driver, MoreScreen.class);

	SignInScreen signInScreen = PageFactory.initElements(driver, SignInScreen.class);
	SearchResultScreen searchResultScren = PageFactory.initElements(driver, SearchResultScreen.class);
	AddressScreen addressScreen = PageFactory.initElements(driver, AddressScreen.class);
	ProductDetailsScreen productDetailsScreen = PageFactory.initElements(driver, ProductDetailsScreen.class);
	AddToCartScreen addToCartScreen = PageFactory.initElements(driver, AddToCartScreen.class);
	CheckOutScreen checkOutScreen = PageFactory.initElements(driver, CheckOutScreen.class);
	

	public Screens(WebDriver driver) {
		Screens.driver = driver;
	}


	
	public CommonScreen commonScreen() {
		commonScreen = new CommonScreen(Screens.driver);
		return commonScreen;
	}
	

	
	public HomeScreen homeScreen() {
		homeScreen = new HomeScreen(Screens.driver);
		return homeScreen;
	}
	

	
	public MoreScreen moreScreen() {
		moreScreen = new MoreScreen(Screens.driver);
		return moreScreen;
	}
	
	public SignInScreen signInScreen() {
		signInScreen = new SignInScreen(Screens.driver);
		return signInScreen;
	}
	
	public SearchResultScreen searchResultScren() {
		searchResultScren = new SearchResultScreen(Screens.driver);
		return searchResultScren;
	}

	public AddressScreen addressScreen() {
		addressScreen = new AddressScreen(Screens.driver);
		return addressScreen;
	}
	
	public ProductDetailsScreen productDetailsScreen() {
		productDetailsScreen = new ProductDetailsScreen(Screens.driver);
		return productDetailsScreen;
	}

	public AddToCartScreen addToCartScreen() {
		addToCartScreen = new AddToCartScreen(Screens.driver);
		return addToCartScreen;
	}
	
	public CheckOutScreen checkOutScreen() {
		checkOutScreen = new CheckOutScreen(Screens.driver);
		return checkOutScreen;
	}
	


}
