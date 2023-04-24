package bestbuy.com.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import bestbuy.com.pages.SelectCountryUSAPage;
import bestbuy.com.pages.SignInPageForUsa;
import bestbuy.com.utils.BaseTest;

public class SignInTestCase extends BaseTest {
	@Test
	public void signPage() throws InterruptedException {
		
		launchBrowser("https://www.bestbuy.com/");
		
		SelectCountryUSAPage uSAPage = PageFactory.initElements(driver,SelectCountryUSAPage.class);
		uSAPage.selectCountryUsa();
		
		SignInPageForUsa signIn = PageFactory.initElements(driver,SignInPageForUsa.class);
		
		signIn.clickOnAccount();
	
	// TO login using crenditals	
		signIn.clickOnSignIn();
		signIn.setEmail("gayatrikyadav.14@gmail.com");
		signIn.setPassword("four+four=8");
		
		signIn.clickOnSignInButton();
		Thread.sleep(5000);
		screenShot("SIgn-in error");
		
		closebrowser();
		
	}

}
