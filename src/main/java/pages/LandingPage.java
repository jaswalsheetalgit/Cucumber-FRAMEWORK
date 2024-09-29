package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilis.Constants;
import utilis.ElementUtilis;

public class LandingPage {
	
	
		
		//Implementing Page Factory
		
		WebDriver driver;
		Actions action;
		private ElementUtilis elementutilis;
		
		public LandingPage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver,this);
			elementutilis = new ElementUtilis(driver);
			}
		
		@FindBy(xpath="//span[text()='My Account']")
		private WebElement MyAccount;
		
		@FindBy(linkText="Register")
		private WebElement Register;
		
		@FindBy(linkText="Login")
		private WebElement Login;
		
		@FindBy(xpath="//input[@name='search']")
		private WebElement searchfieldtext;
		
		@FindBy(xpath="//button[@class='btn btn-light btn-lg']")
		private WebElement searchiconoption;
		
		@FindBy(linkText="Shopping Cart")
		private WebElement Shoppingcart;
		
		
		
		public void MyAccount() {
			elementutilis.clickonElement(MyAccount,Constants.EXPLICIT_WAIT_TIME);
			
		}
		
		public RegisterPage Register() {
			elementutilis.clickonElement(Register,Constants.EXPLICIT_WAIT_TIME);
			return new RegisterPage(driver);
		}
		
		public LoginPage Login() {
			elementutilis.clickonElement(Login,Constants.EXPLICIT_WAIT_TIME);
			return new LoginPage(driver);
		}
		
		public void searchfield(String productname) {
			elementutilis.typetextIntoElement(searchfieldtext, productname, Constants.EXPLICIT_WAIT_TIME);
			//searchfieldtext.sendKeys(productname);
		}
		
		public SearchPage searchicon() {
			elementutilis.clickonElement(searchiconoption,Constants.EXPLICIT_WAIT_TIME);
			//searchiconoption.click();
			return new SearchPage(driver);
		}
		
		public WebElement Shoppingcart() {
			
			/*action = new Actions(driver);
			action.moveToElement(Shoppingcart).click(Shoppingcart).build().perform();
			*/
			elementutilis.mousehoverandclick(Shoppingcart, Constants.EXPLICIT_WAIT_TIME);
			return Shoppingcart;
		}
		
		

	}


