package bestbuy.com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import bestbuy.com.utils.BaseTest;

public class SelectAnItemFromShopByBrands extends BaseTest {
	
	@FindBy(xpath="//button[text()='Menu']")
	WebElement menu;
	
	public void clickOnMenu() {
		clickAction(menu);
	}
	
	@FindBy(xpath="//button[text()='Brands']")
	WebElement brands;
	public void clickOnBrands() {
		clickAction(brands);
	}
	
	@FindBy(xpath="//a[text()='Apple']")
	WebElement apple;
	
	public void clickOnApple() {
		clickAction(apple);
	}
	
	@FindBy(linkText = "AirPods")
	WebElement airpods;
	
	
	public void clickOnAirPods() {
		try {
			waitForElement(airpods);
			clickAction(airpods);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("error finding");
			e.printStackTrace();
		}
	}
	
	@FindBy(xpath="//a[text()='AirPods Pro (2nd generation)']")
	WebElement airpodsPro;
	
	public void clickOnAirpodsPro() {
		try {
			waitForElement(airpodsPro);
			clickAction(airpodsPro);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("error finding");
			e.printStackTrace();
			
		}
	}
	
	@FindBy(xpath="//button[text()='Add to Cart']")
	WebElement addToCart;
	
	
	public void addToCart() {
		try {
			waitForElement(addToCart);
		//	jsScrollUpToElement(addToCart);
			jsClick(addToCart);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("error in adding to cart");
			e.printStackTrace();
		}
	}
	@FindBy(xpath="//button[text()='Continue shopping']")
	WebElement continueShopping;
	
	public void shopping() {
		waitForElement(continueShopping);
		jsClick(continueShopping);
	}
}
