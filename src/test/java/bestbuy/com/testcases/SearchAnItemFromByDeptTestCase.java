package bestbuy.com.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import bestbuy.com.pages.PaymentPage;
import bestbuy.com.pages.SelectAnItemFromShopByDept;
import bestbuy.com.pages.SelectCountryUSAPage;
import bestbuy.com.utils.BaseTest;

public class SearchAnItemFromByDeptTestCase extends BaseTest {
	
	@Test
	public void dept() {
		launchBrowser("https://www.bestbuy.com/");

		SelectCountryUSAPage uSAPage = PageFactory.initElements(driver, SelectCountryUSAPage.class);
		uSAPage.selectCountryUsa();
		SelectAnItemFromShopByDept deptPage = PageFactory.initElements(driver, SelectAnItemFromShopByDept.class);
		deptPage.clickOnMenu();
		deptPage.clickOnFurniture();
		deptPage.clickOnKitchen();
		deptPage.clickOnBaking();
		deptPage.clickOnselecteKinfeSet();
		deptPage.addToCart();
		deptPage.shopping();
		
		closebrowser();

		
	}

}
