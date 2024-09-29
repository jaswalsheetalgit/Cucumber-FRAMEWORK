package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilis.Constants;
import utilis.ElementUtilis;

public class RegisterPage {

	WebDriver driver;
	Actions action;
	private ElementUtilis elementutilis;
	
	public RegisterPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		elementutilis = new ElementUtilis(driver);
	}
	
	@FindBy(id="input-firstname")
	private WebElement Firstnametext;
	
	@FindBy(id="input-lastname")
	private WebElement Lastnametext;
	
	@FindBy(xpath="//input[@type='email']")
	private WebElement emailtext;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement passwordtext;
	
	@FindBy(id="input-newsletter")
	private WebElement subscribe;
	
	@FindBy(xpath="//input[@name='agree']")
	private WebElement privacypolicy;
	
	@FindBy(xpath="//button[text()='Continue']")
	private WebElement continuebutton;
	
	
	public void Firstname(String Firstname) {
		//Firstnametext.sendKeys(Firstname);
		elementutilis.typetextIntoElement(Firstnametext, Firstname, Constants.EXPLICIT_WAIT_TIME);
		
	}
	
	public void Lastname(String Lastname) {
		//Lastnametext.sendKeys(Lastname);
		elementutilis.typetextIntoElement(Lastnametext, Lastname, Constants.EXPLICIT_WAIT_TIME);
	}
	
	public void email(String email) {
		//emailtext.sendKeys(email);
		elementutilis.typetextIntoElement(emailtext, email, Constants.EXPLICIT_WAIT_TIME);
	}
	
	public void password(String password) {
		//passwordtext.sendKeys(password);
		elementutilis.typetextIntoElement(passwordtext, password, Constants.EXPLICIT_WAIT_TIME);
	}
	
	public void subscribe() {
		
	/*	action = new Actions(driver);
		action.moveToElement(subscribe).click(subscribe).build().perform();
		
		//return subscribe;
		 * */
		 elementutilis.mousehoverandclick(subscribe, Constants.EXPLICIT_WAIT_TIME);
	}
	
	public void privacypolicy() {
		
	/*	//action = new Actions(driver);
		action.moveToElement(privacypolicy).click(privacypolicy).build().perform();
		//return privacypolicy;
		 * */
		 elementutilis.mousehoverandclick(privacypolicy, Constants.EXPLICIT_WAIT_TIME); 
	}
	
	public AccountsuccessPage continuebutton() {
		
		//action.moveToElement(continuebutton).click(continuebutton).build().perform();
		//return continuebutton; 
		elementutilis.mousehoverandclick(continuebutton, Constants.EXPLICIT_WAIT_TIME);
		return new AccountsuccessPage(driver);
	}
	

	
	

}
