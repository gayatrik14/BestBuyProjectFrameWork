package bestbuy.com.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import bestbuy.com.pages.DummyPaymentPage;
import bestbuy.com.pages.PaymentPage;
import bestbuy.com.pages.SearchAnItemPage;
import bestbuy.com.pages.SelectAnItemFromShopByBrands;
import bestbuy.com.pages.SelectAnItemFromShopByDept;
import bestbuy.com.pages.SelectCountryUSAPage;
import bestbuy.com.utils.BaseTest;

public class CheckoutPageTest extends BaseTest {
	
	@Test
	public void searchAndAdd() {
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
	//	deptPage.shopping();
		
		PaymentPage pp = PageFactory.initElements(driver, PaymentPage.class);
		pp.goToCart();
		pp.checkout();
		pp.clickOnGuest();
		pp.setEmail("gayatrikyadav.14@gmail.com");
		pp.setPhone("9284124315");
		pp.contiue();
		
		
	/*	DummyPaymentPage pp1 = PageFactory.initElements(driver, DummyPaymentPage.class);
		pp1.creditno();
		pp1.fname();
		pp1.lname();
		pp1.address("United States");
		pp1.city("chicago");
		pp1.selectState("CT");
		pp1.enterZipcode("265378");
		pp1.enterEmailid("gayatrikyadav.14@gmail.com");
		pp1.enterphoneno("9284124315");
		pp1.placeOrder(); */
		
		driver.close();
	}
}
