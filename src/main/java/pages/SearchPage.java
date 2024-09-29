package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilis.Constants;
import utilis.ElementUtilis;

public class SearchPage {
	
	
	
	WebDriver driver;
	Actions action;
	private ElementUtilis elementutilis;
	
	public SearchPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		elementutilis = new ElementUtilis(driver);
		}
	
	@FindBy(linkText="Search")
	private WebElement searchconfirmtext;
	
	@FindBy(xpath="//div[@class='button-group']/button")
	private WebElement Addtocarticon;
	
	@FindBy(xpath="//*[@class='alert alert-success alert-dismissible']")
	private WebElement successcarttext;
	
	@FindBy(xpath="//*[text()='shopping cart']")
	private WebElement shoppingcartsuccesslinkoption;
	
	
	
	
	
	
	public String searchconfirm() {
	//	return searchconfirmtext.getText();
		return elementutilis.gettingthetext(searchconfirmtext, Constants.EXPLICIT_WAIT_TIME);
	}
	
	public void Addtocarticon() {
		
		/*action = new Actions(driver);
		action.moveToElement(Addtocarticon).click(Addtocarticon).build().perform();
		return Addtocarticon;
		*/
		elementutilis.mousehoverandclick(Addtocarticon, Constants.EXPLICIT_WAIT_TIME);
	}
	
	public String successcart() {
		//return successcarttext.getText();
		return elementutilis.gettingthetext(successcarttext, Constants.EXPLICIT_WAIT_TIME);
	}
	
	public ShoppingcartPage shoppingcartsuccesslink() {
		//shoppingcartsuccesslinkoption.click();
		elementutilis.clickonElement(shoppingcartsuccesslinkoption,Constants.EXPLICIT_WAIT_TIME);
		return new ShoppingcartPage(driver);
	}
	

}
