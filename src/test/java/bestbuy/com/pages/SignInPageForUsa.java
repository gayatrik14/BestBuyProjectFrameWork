package bestbuy.com.pages;

import bestbuy.com.utils.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPageForUsa extends BaseTest {
	
	@FindBy(xpath="//span[text()='Account']")
	WebElement account;
	
	@FindBy(xpath="//a[text()='Sign In']")
	WebElement signIn;
	
	@FindBy(xpath="//input[@id='fld-e']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='fld-p1']")
	WebElement password;
	
	@FindBy(xpath="//button[text()='Sign In']")
	WebElement signInButton;
	
	@FindBy(linkText ="United States")
	WebElement country;
	
	
	public void selectCountryUsa() {
			try {
				clickAction(country);
			} catch (Exception e) {
				System.out.println("problem occured while choosing country :");
				e.printStackTrace();
			}
	}

	public void setPassword(String text) {
		
		waitForElement(password);
		typeText(password,text);
		//password.sendKeys(pwd);
	}
	
	public void setEmail(String text) {
		
		waitForElement(email);
		typeText(email,text);
	}
	public void clickOnAccount() {
		clickAction(account);
		
	}
	public void clickOnSignInButton() {
		clickAction(signInButton);
		
	}


	public void clickOnSignIn() {
		clickAction(signIn);
	}
}
