package bestbuy.com.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


import bestbuy.com.pages.SearchAnItemPage;

import bestbuy.com.pages.SelectCountryUSAPage;
import bestbuy.com.utils.BaseTest;

public class SearchAnItemTestCase extends BaseTest {
	@Test
	public void searchAndAdd() throws Exception { //working

		launchBrowser("https://www.bestbuy.com/");

		SelectCountryUSAPage uSAPage = PageFactory.initElements(driver, SelectCountryUSAPage.class);
		uSAPage.selectCountryUsa();

		SearchAnItemPage sAIP = PageFactory.initElements(driver, SearchAnItemPage.class);
		sAIP.typeOnSearchBox("Apple - AirPods Pro (2nd generation) - White");
		sAIP.searchHeader();
		sAIP.selectItem();
		sAIP.addToCart();
		sAIP.shopping();
		
		closebrowser();
	}
}
