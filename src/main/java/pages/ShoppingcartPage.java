package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilis.Constants;
import utilis.ElementUtilis;

public class ShoppingcartPage {
	
	WebDriver driver;
	Actions action;
	private ElementUtilis elementutilis;
	
	public ShoppingcartPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		elementutilis = new ElementUtilis(driver);
		}
	
	@FindBy(xpath="//a[text()='Shopping Cart']")
	private WebElement Shoppingcarttext;
	
	@FindBy(xpath="//a[text()='Checkout']")
	private WebElement checkoutbutton;
	
	
	
	
	
	public String Shoppingcart(){
		//return  Shoppingcarttext.getText();
		return elementutilis.gettingthetext(Shoppingcarttext, Constants.EXPLICIT_WAIT_TIME);
	}

	public CheckoutPage checkoutbutton() {
		
		//action = new Actions(driver);
		//action.moveToElement(checkoutbutton).click(checkoutbutton).build().perform();
		elementutilis.mousehoverandclick(checkoutbutton, Constants.EXPLICIT_WAIT_TIME);
		 return new CheckoutPage(driver);
	}
}
