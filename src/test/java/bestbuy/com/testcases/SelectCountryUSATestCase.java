package bestbuy.com.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import bestbuy.com.pages.SelectCountryUSAPage;
import bestbuy.com.pages.SignInPageForUsa;

public class SelectCountryUSATestCase extends SelectCountryUSAPage {
	@Test 

	public void bestbuycountry() {
		try {
			launchBrowser("https://www.bestbuy.com/");
			SelectCountryUSAPage uSAPage = PageFactory.initElements(driver, SelectCountryUSAPage.class);
			uSAPage.selectCountryUsa();

// to validate if the given URL Link is broken.
			uSAPage.brokenLink("https://www.bestbuy.com/");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		closebrowser();

	}
	

}
