package bestbuy.com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import bestbuy.com.utils.BaseTest;

public class SelectAnItemFromShopByDept extends BaseTest {
	@FindBy(xpath="//button[text()='Menu']")
	WebElement menu;
	
	public void clickOnMenu() {
		clickAction(menu);
	}
		
		@FindBy(xpath="//button[text()='Home, Furniture & Office']")
		WebElement furniture;
		
		public void clickOnFurniture() {
			clickAction(furniture);
		}
		
		@FindBy(xpath="//button[text()='Kitchen & Dining']")
		WebElement kitchen;
		
		public void clickOnKitchen() {
			clickAction(kitchen);
		}
		
		
		@FindBy(xpath="//a[text()='Cookware, Bakeware & Cutlery']")
		WebElement baking;
		
		public void clickOnBaking() {
			clickAction(baking);
		}
		
		@FindBy(xpath="//a[text()='Cuisinart - 12 PC Knife Set - Multi']")
		WebElement knifeSet;
		
		public void clickOnselecteKinfeSet() {
			clickAction(knifeSet);
		}
		
		@FindBy(xpath="//button[text()='Add to Cart']")
		WebElement addToCart;
		
		
		public void addToCart() {
			try {
				waitForElement(addToCart);
				jsScrollUpToElement(addToCart);
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
		
		
}
