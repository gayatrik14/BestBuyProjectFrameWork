package bestbuy.com.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import bestbuy.com.pages.CreateAccountPage;
import bestbuy.com.pages.SelectCountryUSAPage;

public class CreateAccountTestCase extends CreateAccountPage {
	@Test 

	public void createAccount() {
		
		launchBrowser("https://www.bestbuy.com/");
		
		SelectCountryUSAPage usPage = PageFactory.initElements(driver, SelectCountryUSAPage.class);
		usPage.selectCountryUsa();
		
		CreateAccountPage acPage = PageFactory.initElements(driver, CreateAccountPage.class);
		acPage.clickOnAccount();
		acPage.clickOnCreateAccount();
		acPage.setfirstName("Gayatri");
		acPage.setlastName("K");
		acPage.setEmail("gayatrikyadav.14@gmail.com");
		acPage.setPassword("four+four=8");
		acPage.setRePassword("four+four=8");
		acPage.setphNo("9284124315");
		acPage.clickOnSubmitCreAccount();
		
		closebrowser();
	}
}
