package bestbuy.com.testcases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import bestbuy.com.pages.DummyPaymentPage;
import bestbuy.com.pages.SelectCountryUSAPage;
import bestbuy.com.utils.BaseTest;

public class DummyPaymentTestCase extends BaseTest {
	@Test
	public void dummy() {
	launchBrowser("https://www.bestbuy.com/");

	SelectCountryUSAPage uSAPage = PageFactory.initElements(driver, SelectCountryUSAPage.class);
	uSAPage.selectCountryUsa();
	
	DummyPaymentPage pp = PageFactory.initElements(driver, DummyPaymentPage.class);
	pp.creditno();
	pp.fname();
	pp.lname();
	pp.address("United States");
	pp.city("chicago");
	pp.selectState("CT");
	pp.enterZipcode("265378");
	pp.enterEmailid("gayatrikyadav.14@gmail.com");
	pp.enterphoneno("9284124315");
	pp.placeOrder();
	
	closebrowser();
	
	}
}
