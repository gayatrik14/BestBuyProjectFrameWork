package bestbuy.com.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import bestbuy.com.pages.BottomLinkValidatePage;
import bestbuy.com.pages.SelectCountryUSAPage;
import bestbuy.com.utils.BaseTest;

public class BottomLinkValidateTestCase extends BaseTest {
	@Test 
	
	public void validateBottomLink() throws InterruptedException {
		launchBrowser("https://www.bestbuy.com/");
		SelectCountryUSAPage uSAPage = PageFactory.initElements(driver, SelectCountryUSAPage.class);
		uSAPage.selectCountryUsa();
		
		BottomLinkValidatePage bp = PageFactory.initElements(driver, BottomLinkValidatePage.class);
		bp.bottom();
		Thread.sleep(5000);
		bp.top();

		closebrowser();
	}

}
