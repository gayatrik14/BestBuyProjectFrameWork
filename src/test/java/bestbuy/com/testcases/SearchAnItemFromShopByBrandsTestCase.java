package bestbuy.com.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import bestbuy.com.pages.PaymentPage;
import bestbuy.com.pages.SelectAnItemFromShopByBrands;
import bestbuy.com.pages.SelectCountryUSAPage;
import bestbuy.com.utils.BaseTest;

public class SearchAnItemFromShopByBrandsTestCase extends BaseTest {
	
	@Test
	public void brands() {
	
	launchBrowser("https://www.bestbuy.com/");

	SelectCountryUSAPage uSAPage = PageFactory.initElements(driver, SelectCountryUSAPage.class);
	uSAPage.selectCountryUsa();
	
	SelectAnItemFromShopByBrands bp = PageFactory.initElements(driver, SelectAnItemFromShopByBrands.class);
	bp.clickOnMenu();
	bp.clickOnBrands();
	bp.clickOnApple();
	bp.clickOnAirPods();
	bp.clickOnAirpodsPro();
	bp.addToCart();
	bp.shopping();
	
	closebrowser();

	

}
}
