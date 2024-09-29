package utilis;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtilis {

	WebDriver driver;
	public ElementUtilis(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickonElement(WebElement element, long durationInSeconds) {
		
		WebElement webelement = waitforelement(element,durationInSeconds);
		webelement.click();
	}
	
	public void typetextIntoElement(WebElement element, String texttobetyped, long durationInSeconds) {
		
		
		WebElement webelement=waitforelement(element, durationInSeconds);
		webelement.click(); //clcking on element
		webelement.clear();// clearing any text in element
		webelement.sendKeys(texttobetyped); //and then typing any text in element
	}
	
	
	public WebElement waitforelement(WebElement element, long durationInSeconds) {
		WebElement webelement = null;
		try {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(durationInSeconds));
		webelement = wait.until(ExpectedConditions.elementToBeClickable(element));
		
	}catch(Exception e) {
		e.printStackTrace();
		
	}
		return webelement;
}
	
	public void selectoptionindropdown(WebElement element, String dropdownoption, long durationInSeconds,int dropdownoptionIndex) {
		
		WebElement webelement=waitforelement(element, durationInSeconds);
		Select select = new Select(webelement);
		select.selectByVisibleText(dropdownoption);
		select.selectByIndex(dropdownoptionIndex);
	}
	
	public void  mousehoverandclick(WebElement element, long durationInSeconds) {
		
		
		WebElement webelement=waitforvisibilityofelement(element,durationInSeconds);
		
		Actions action = new Actions(driver);
		action.moveToElement(webelement).click().build().perform();
		
		
	}
	
	public WebElement waitforvisibilityofelement(WebElement element, long durationInSeconds) {
		WebElement webelement = null;
		try {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(durationInSeconds));
		webelement = wait.until(ExpectedConditions.visibilityOf(element));
		
	}catch(Exception e) {
		e.printStackTrace();
		
	}
		return webelement;
}
	
	public boolean elementisdisplayed(WebElement element, long durationInSeconds) {
		
		WebElement webelement=waitforvisibilityofelement(element,durationInSeconds);
		try {
		return webelement.isDisplayed();
	}catch(Exception e) {
		return false;
	}
	
}
	
	public String gettingthetext(WebElement element, long durationInSeconds) {
		
		WebElement webelement=waitforvisibilityofelement(element,durationInSeconds);
		String text = null;
		try {
			text =webelement.getText();
		}catch(Exception e) {
			e.printStackTrace();
		}
	
		return text;
	}
}
