package bestbuy.com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import bestbuy.com.utils.BaseTest;

public class DummyPaymentPage extends BaseTest {
	
	@FindBy(xpath="//input[@id='number']")
	WebElement creditNo;
	
	public void creditno() {
		try {
			waitForElement(creditNo);
			jsClick(creditNo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@FindBy(xpath="//input[@id='first-name']")
	WebElement fname;
	
	public void fname() {
		try {
			waitForElement(fname);
			jsClick(fname);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@FindBy(xpath="//input[@id='last-name']")
	WebElement lname;
	
	public void lname() {
		try {
			waitForElement(fname);
			jsClick(fname);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@FindBy(xpath="//input[@id='address-input']")
	WebElement address;
	
	public void address(String add ) {
		try {
			waitForElement(address);
			address.clear();
			typeText(address, add);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@FindBy(xpath="//input[@id='city']")
	WebElement city;
	
	public void city(String cName) {
		try {
			waitForElement(city);
			  city.clear();
			  typeText(city, cName);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	@FindBy(xpath="//button[text()='Checkout']")
	WebElement checkout;
	
	@FindBy(xpath="//span[text()='Return to Cart']")
	WebElement returnToCart;
	
	public void clickCheckout() {
		
		try {
			waitForElement(checkout);
			clickAction(checkout);
		}catch(Exception e) {
			System.out.println("Problem occured in clickCheckout ");
			e.printStackTrace();
		}
	}
	
	@FindBy(xpath="//button[text()='Continue as Guest']")
    WebElement guest;
    
    public void signInAsGuest() {
    	
        try {
			waitForElement(guest);
			clickAction(guest);
		}catch(Exception e) {
			System.out.println("Problem occured in signInAsGuest ");
			e.printStackTrace();
		}
		
    }
    
    @FindBy(id="user.emailAddress")
     WebElement emailadd;
     
     public void enterEmailid(String email) {
    	 
     try {
		  waitForElement(emailadd);
		  emailadd.clear();
		  typeText(emailadd, email);
	  }catch(Exception e) {
		  System.out.println("Problem occured in enterEmailid");
		  e.printStackTrace();
	  }
 }

     
     @FindBy(id="user.phone")
     WebElement phoneadd;
     
     public void enterphoneno(String no) {
    	 
     try {
		  waitForElement(phoneadd);
		  phoneadd.clear();
		  typeText(phoneadd, no);
	  }catch(Exception e) {
		  System.out.println("Problem occured in enterphoneno");
		  e.printStackTrace();
	  }
 }

   @FindBy(xpath="//span[text()='Continue to Payment Information']")
   WebElement continuePayment;
   
   public void enterContinuePayment() {
	   
	   try {
		   waitForElement(continuePayment);
		   jsScrollUpToElement(continuePayment);
		   clickAction(continuePayment);
		   waitForElement(returnToCart);
		   jsScrollUpToElement(returnToCart);
		   
		   }catch(Exception e) {
			   System.out.println("Problem occured in enterContinuePayment");
			   e.printStackTrace();
		   }
   }
   
   
   @FindBy(id="expMonth")
   WebElement expMonth;
   
   public void selectExpiryMonth(String month) {
	   
	   try {
		   waitForElement(expMonth);
		   selectDDByValue(expMonth, month);
	   }catch(Exception e) {
		   System.out.println("Problem occured in selectExpiryMonth");
		   e.printStackTrace();
	   }
   }
   
   @FindBy(id="expYear")
   WebElement expYear;
   
   public void selectExpiryYear(String year) {
	   
	   try {
		   waitForElement(expYear);
		   selectDDByValue(expYear, year);
	   }catch(Exception e) {
		   System.out.println("Problem occured in selectExpiryYear");
		   e.printStackTrace();
	   }
   }
   
   @FindBy(id="cvv")
   WebElement cvv;
   
   public void enterCVV(String cvvNo) {
	   
	   try {
		   waitForElement(cvv);
		   cvv.clear();
		   typeText(cvv,cvvNo);
	   }catch(Exception e) {
		   System.out.println("Problem occured in enterCVV");
		   e.printStackTrace();
	   }
   }
   
   @FindBy(xpath="//button[text()='Place your Order - Contact Card']")
   WebElement placeOrder;
   public void placeOrder() {
	   waitForElement(placeOrder);
	   clickAction(placeOrder);
	   
   }
 
 @FindBy(id="state")
 WebElement state;
 
 public void selectState(String stateName) {
	  
	  try {
		  waitForElement(state);
		  selectDDByValue(state, stateName);
		 
	  }catch(Exception e) {
		  System.out.println("Problem occured in selectState");
		  e.printStackTrace();
	  }
 }
    
 @FindBy(id="zipcode")
 WebElement zipcode;
 
public void enterZipcode(String zipcodeUS) {
	  
	  try {
		  waitForElement(zipcode);
		  zipcode.clear();
		  typeText(zipcode, zipcodeUS);
	  }catch(Exception e) {
		  System.out.println("Problem occured in enterZipcode");
		  e.printStackTrace();
	  }
  }


}
