package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilis.Constants;
import utilis.ElementUtilis;

public class CheckoutPage {
	
	WebDriver driver;
	Actions action;
	private ElementUtilis elementutilis;
	
	public CheckoutPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		elementutilis = new ElementUtilis(driver);
		}
	
	@FindBy(xpath="//a[text()='Checkout']")
	private WebElement checkoutverifytext;
	
	@FindBy(xpath="//input[@id='input-guest']")
	private WebElement guestcheckoutoption;
	
	@FindBy(id="input-firstname")
	private WebElement Firstname;
	
	@FindBy(id="input-lastname")
	private WebElement Lastname;
	
	@FindBy(id="input-email")
	private WebElement emailaddressinguest;
	
	@FindBy(id="input-shipping-address-1")
	private WebElement Address;
	
	@FindBy(id="input-shipping-city")
	private WebElement city;
	
	@FindBy(id="input-shipping-postcode")
	private WebElement postcode;
	
	@FindBy(xpath="//select[@id='input-shipping-country']")
	private WebElement country;
	
	@FindBy(xpath="//select[@name='shipping_zone_id']")
	private WebElement region;
	
	@FindBy(id="button-register")
	private WebElement continuebutton;
	
	@FindBy(xpath="//button[@id='button-shipping-methods']")
	private WebElement chooseshippingbutton;
	
	@FindBy(xpath="//input[@id='input-shipping-method-flat-flat']")
	private WebElement preferredshippingmethod;
	
	@FindBy(xpath="//button[@id='button-shipping-method']")
	private WebElement continuepreferredshippingmethod;
	
	@FindBy(xpath="//button[@id='button-payment-methods']")
	private WebElement choosepaymentbutton;
	
	@FindBy(xpath="//input[@id='input-payment-method-cod-cod']")
	private WebElement cashonDelivery;
	
	@FindBy(xpath="//button[@id='button-payment-method']")
	private WebElement continuecashonDelivery;
	
	@FindBy(xpath="//button[@id='button-confirm']")
	private WebElement confirmorder;
	
	
	
	public String checkoutverify() {
		return elementutilis.gettingthetext(checkoutverifytext,Constants.EXPLICIT_WAIT_TIME);
	}

	public void guestcheckout() {
		elementutilis.clickonElement(guestcheckoutoption, Constants.EXPLICIT_WAIT_TIME);
	}
	
	public WebElement Firstname() {
		return Firstname;
	}
	
	public WebElement Lastname() {
		return Lastname;
	}
	
	public WebElement emailaddressinguest() {
		return emailaddressinguest;
	}
	
	public WebElement Address() {
		return Address;
	}
	
	public WebElement city() {
		return city;
	}
	
	public WebElement postcode() {
		return postcode;
	}
	
	public WebElement country() {
		return country;
	}
	
	public WebElement region() {
		return region;
	}
	
	public void continuebutton() {
		
		/*action = new Actions(driver);
		action.moveToElement(continuebutton).click(continuebutton).build().perform();
		return continuebutton;
		*/
		elementutilis.mousehoverandclick(continuebutton, Constants.EXPLICIT_WAIT_TIME);
	}
	
	public void chooseshippingbutton() {
	/*	action.moveToElement(chooseshippingbutton).click(chooseshippingbutton).build().perform();
		return chooseshippingbutton;
		*/
		elementutilis.mousehoverandclick(chooseshippingbutton, Constants.EXPLICIT_WAIT_TIME);
	}
	
	public void preferredshippingmethod() {
		/*action.moveToElement(preferredshippingmethod).click(preferredshippingmethod).build().perform();
		return preferredshippingmethod;
		*/
		elementutilis.mousehoverandclick(preferredshippingmethod, Constants.EXPLICIT_WAIT_TIME);
	}
	
	public void continuepreferredshippingmethod() {
		/*action.moveToElement(continuepreferredshippingmethod).click(continuepreferredshippingmethod).build().perform();
		return  continuepreferredshippingmethod;
		*/
		elementutilis.mousehoverandclick(continuepreferredshippingmethod, Constants.EXPLICIT_WAIT_TIME);
	}
	
	public void choosepaymentbutton() {
		/*action.moveToElement(choosepaymentbutton).click(choosepaymentbutton).build().perform();
		return choosepaymentbutton;
		*/
		elementutilis.mousehoverandclick( choosepaymentbutton, Constants.EXPLICIT_WAIT_TIME);
	}
	
	public void cashonDelivery() {
		/*action.moveToElement(cashonDelivery).click(cashonDelivery).build().perform();
		return cashonDelivery;
		*/
		elementutilis.mousehoverandclick(cashonDelivery, Constants.EXPLICIT_WAIT_TIME);
	}
	
	public void continuecashonDelivery() {
		/*action.moveToElement(continuecashonDelivery).click(continuecashonDelivery).build().perform();
		return continuecashonDelivery;
		*/
		elementutilis.mousehoverandclick(continuecashonDelivery, Constants.EXPLICIT_WAIT_TIME);
	}
	
	public SuccessPage confirmorder() {
		/*action.moveToElement(confirmorder).click(confirmorder).build().perform();
		return new SuccessPage(driver);
		*/
		elementutilis.mousehoverandclick(confirmorder, Constants.EXPLICIT_WAIT_TIME);
		return new SuccessPage(driver);
	}
	
}
