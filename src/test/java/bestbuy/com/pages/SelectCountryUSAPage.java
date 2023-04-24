package bestbuy.com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import bestbuy.com.utils.BaseTest;

public class SelectCountryUSAPage extends BaseTest {
	

	@FindBy(linkText ="United States")
	WebElement country;
	
	
	
	
	public void selectCountryUsa() {
		//country.click();
		clickAction(country);
	}
	

}
