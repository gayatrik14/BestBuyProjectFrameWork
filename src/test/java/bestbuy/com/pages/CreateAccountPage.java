package bestbuy.com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import bestbuy.com.utils.BaseTest;

public class CreateAccountPage extends BaseTest {

	@FindBy(xpath = "//span[text()='Account']")
	WebElement account;

	@FindBy(xpath = "//a[text()='Create Account']")
	WebElement createAccount;

	@FindBy(xpath = "//input[@id='firstName']")
	WebElement firstName;

	@FindBy(xpath = "//input[@id='lastName']")
	WebElement lastName;

	@FindBy(xpath = "//input[@id='email']")
	WebElement email;

	@FindBy(xpath = "//input[@id='fld-p1']")
	WebElement password;

	@FindBy(xpath = "//input[@id='reenterPassword']")
	WebElement confirmPassword;

	@FindBy(xpath = "//input[@id='phone']")
	WebElement phNo;

	@FindBy(xpath = "//button[text()='Create an Account']")
	WebElement submitCreateAcc;

	@FindBy(linkText = "United States")
	WebElement country;

	public void selectCountryUsa() {
		// country.click();
		clickAction(country);
	}

	public void setPassword(String text) {

		waitForElement(password);
		typeText(password, text);
		// password.sendKeys(pwd);
	}

	public void setRePassword(String text) {

		waitForElement(confirmPassword);
		typeText(confirmPassword, text);
		// password.sendKeys(pwd);
	}

	public void setEmail(String text) {

		waitForElement(email);
		typeText(email, text);
	}

	public void setfirstName(String text) {

		waitForElement(firstName);
		typeText(firstName, text);
	}

	public void setlastName(String text) {

		waitForElement(lastName);
		typeText(lastName, text);
	}

	public void setphNo(String text) {

		waitForElement(phNo);
		typeText(phNo, text);
	}

	public void clickOnAccount() {
		clickAction(account);
	}

	public void clickOnSubmitCreAccount() {
		clickAction(submitCreateAcc);
	}

	public void clickOnCreateAccount() {
		clickAction(createAccount);
	}
}
