package bestbuy.com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import bestbuy.com.utils.BaseTest;

public class BottomLinkValidatePage extends BaseTest  {
	
	@FindBy(xpath="//a[text()='Accessibility']")
	WebElement accessibility;
	
	public void bottom() 
	{
		try {
			waitForElement(accessibility);
			jsScrollUpToElement(accessibility);
		} catch (Exception e) {
			System.out.println("problem in scrolling down");
			e.printStackTrace();
		}
	}
	
	@FindBy(xpath="//a[text()='Top Deals']")
	WebElement topDeals;
	
	public void top()
	{
		try {
			waitForElement(topDeals);
			jsScrollUpToElement(topDeals);
		} catch (Exception e) {
			System.out.println("problem in scrolling up");
			e.printStackTrace();
		}	
	}
	
	
}
