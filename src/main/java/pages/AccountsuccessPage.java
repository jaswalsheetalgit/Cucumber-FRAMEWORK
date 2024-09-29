package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilis.Constants;
import utilis.ElementUtilis;

public class AccountsuccessPage {
	
 WebDriver driver;
 private ElementUtilis elementutilis;
	
	public AccountsuccessPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		elementutilis = new ElementUtilis(driver);
	}
	
	@FindBy(linkText="Your Account Has Been Created!")
	private WebElement successfullmessagetext;
	
	public String successfullmessage() {
		return elementutilis.gettingthetext(successfullmessagetext, Constants.EXPLICIT_WAIT_TIME);
	}
	

}
