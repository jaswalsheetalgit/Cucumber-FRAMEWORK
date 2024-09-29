package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilis.Constants;
import utilis.ElementUtilis;

public class AccountPage {

	WebDriver driver;
	private ElementUtilis elementutilis;

	public AccountPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		elementutilis = new ElementUtilis(driver);

	}

	@FindBy(xpath = "//h2[text()='My Account']")
	private WebElement confirmlogintext;

	public String confirmlogin() {
		return elementutilis.gettingthetext(confirmlogintext, Constants.EXPLICIT_WAIT_TIME);
		
	}
}
