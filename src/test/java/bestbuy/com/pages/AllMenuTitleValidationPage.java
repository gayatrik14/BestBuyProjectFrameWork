package bestbuy.com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import bestbuy.com.utils.BaseTest;

public class AllMenuTitleValidationPage extends BaseTest {	
	
	@FindBy(xpath="//a[text()='Top Deals']")
	WebElement topDeals;
	
	public void clickOnTopDeals(String expectedtitle) {
		try {
			waitForElement(topDeals);
			clickAction(topDeals);
			validate(expectedtitle);
			System.out.println("TopDeals Title Validation successful");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	@FindBy(xpath="//a[text()='Totaltech Membership']")
	WebElement ttMemb;
	public void clickOnTTMemb(String expectedtitle) {
		try {
			waitForElement(ttMemb);
			clickAction(ttMemb);
			validate(expectedtitle);
			System.out.println("Totaltech Membership Title Validation successful");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	@FindBy(xpath="//a[text()='Credit Cards']")
	WebElement creditCards;
	public void clickOnCC(String expectedtitle) {
		try {
			waitForElement(creditCards);
			clickAction(creditCards);
			validate(expectedtitle);
			System.out.println("Credit Cards Tittle Validation successful");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	@FindBy(xpath="//a[text()='Gift Cards']")
	WebElement gift;
	public void clickOnGiftCards(String expectedtitle) {
		waitForElement(gift);
		clickAction(gift);
		validate(expectedtitle);
		System.out.println("Gift Cards Title Validation successful");
	}
	
	
	
	@FindBy(xpath="//a[text()='Gift Ideas']")
	WebElement giftIdeas;
	public void clickOnGiftIdeas(String expectedtitle) {
		try {
			waitForElement(giftIdeas);
			clickAction(giftIdeas);
			validate(expectedtitle);
			System.out.println("Gift Ideas Title Validation successful");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@FindBy(xpath="//a[text()='Health & Wellness']")
	WebElement health;
	public void clickOnHealth(String expectedtitle) {
		try {
			waitForElement(health);
			clickAction(health);
			validate(expectedtitle);
			System.out.println("Health & Wellness Title Validation successful");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@FindBy(xpath="//span[text()='More']")
	WebElement more;
	public void clickOnMore() {
		try {
			clickAction(more);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	@FindBy(xpath="//a[text()='Deal of the Day']")
	WebElement dealoftheDay;
	public void clickOnDealsofDay(String expectedtitle) {
		try {
			waitForElement(dealoftheDay);
			clickAction(dealoftheDay);
			validate(expectedtitle);
			System.out.println("Deal of the Day Title Validation successful");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	//@FindBy(xpath="//a[text()='Best Buy Outlet']")
	@FindBy(linkText="Best Buy Outlet")
	WebElement bboutlet;
	
	public void clickonBBoutlet(String expectedtitle) {
		try {
			waitForElement(bboutlet);
			clickAction(bboutlet);
			validate(expectedtitle);
			System.out.println("Best Buy Outlet Title Validation successful");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@FindBy(linkText="Best Buy Business")
	WebElement bbB;
	
	public void clickonBBusiness(String expectedtitle) {
		try {
			waitForElement(bbB);
			clickAction(bbB);
			validate(expectedtitle);
			System.out.println("Best Buy Business Title Validation successful");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	}
	
