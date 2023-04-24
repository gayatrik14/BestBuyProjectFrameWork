package bestbuy.com.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import bestbuy.com.pages.AllMenuTitleValidationPage;
import bestbuy.com.pages.SelectCountryUSAPage;
import bestbuy.com.utils.BaseTest;

public class AllMenuTitleValidationTestCase extends BaseTest {
	@Test
	public void validate() {
		launchBrowser("https://www.bestbuy.com/");
		SelectCountryUSAPage uSAPage = PageFactory.initElements(driver, SelectCountryUSAPage.class);
		uSAPage.selectCountryUsa();
		
		AllMenuTitleValidationPage vp = PageFactory.initElements(driver, AllMenuTitleValidationPage.class);
		vp.clickOnTopDeals("Top Deals and Featured Offers on Electronics - Best Buy");
		vp.clickOnDealsofDay("Deal of the Day: Electronics Deals - Best Buy");
		vp.clickOnTTMemb("Best Buy Totaltech™ – Best Buy");
		vp.clickOnCC("Best Buy Credit Card: Rewards & Financing");
		vp.clickOnGiftCards("Gifts Cards and E-Gift Cards - Best Buy");
		vp.clickOnGiftIdeas("Gift Ideas 2023: Best Gifts to Give This Year - Best Buy");
		vp.clickOnHealth("Health & Wellness Solutions & Technology - Best Buy"); 
		vp.clickOnMore();
		vp.clickonBBoutlet("Best Buy Outlet: Clearance Electronics Outlet Store – Best Buy");
		vp.clickonBBusiness("Best Buy for Business - Best Buy");
		
		vp.closebrowser();
		
	}

}
