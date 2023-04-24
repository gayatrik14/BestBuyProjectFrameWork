package bestbuy.com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import bestbuy.com.utils.BaseTest;

public class PaymentPage extends BaseTest {
	
	@FindBy(xpath="//button[text()='Checkout']")
	WebElement checkout;
	
	public void checkout() {
		waitForElement(checkout);
		jsClick(checkout);
	}
	
	

	@FindBy(xpath="//button[text()='Continue as Guest']")
	WebElement guest;
	
	public void clickOnGuest() {
		clickAction(guest);
		
	}
	
	@FindBy(xpath="//input[@id='user.emailAddress']")
	WebElement email;
	
	
	
public void setEmail(String text) {
		
		waitForElement(email);
		typeText(email,text);
	}
	
	@FindBy(xpath="//input[@id='user.phone']")
	WebElement phno;
	
public void setPhone(String text) {
		
		waitForElement(phno);
		typeText(phno,text);
		//password.sendKeys(pwd);
	}
	
	
	@FindBy(xpath="//a[text()='Go to Cart']")
	WebElement goTOCart;
	
	public void goToCart() {
		waitForElement(goTOCart);
		jsClick(goTOCart);
	}
	

	@FindBy(xpath="//span[text()='Continue to Payment Information']")
	WebElement contiue;
	public void contiue() {
		clickAction(contiue);
	}
}
