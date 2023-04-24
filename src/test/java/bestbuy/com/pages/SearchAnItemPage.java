package bestbuy.com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import bestbuy.com.utils.BaseTest;

public class SearchAnItemPage extends BaseTest{
	
	@FindBy(id="gh-search-input")
	WebElement searchbox;
	
	@FindBy(xpath="//a[text()='Apple - AirPods Pro (2nd generation) - White']")
	WebElement selectItem;
	
	@FindBy(xpath="//span[@class='header-search-icon']")
	WebElement headerSearch;
	
	@FindBy(xpath="//button[text()='Add to Cart']")
	WebElement addToCart;
	
	
	public void addToCart() {
		try {
			waitForElement(addToCart);
			//jsScrollUpToElement(addToCart);
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
			public void typeOnSearchBox(String text) {
				typeText(searchbox,text);
			}
			
			public void selectItem() {
				clickAction(selectItem);
				
		}

			public void searchHeader() {
				try {
					clickAction(headerSearch);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			
				
		}
