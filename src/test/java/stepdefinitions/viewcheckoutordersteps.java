package stepdefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CheckoutPage;
import pages.LandingPage;
import pages.SearchPage;
import pages.ShoppingcartPage;
import pages.SuccessPage;

public class viewcheckoutordersteps extends DriverFactory {
	
	public LandingPage LanPage;
	public ShoppingcartPage Shopcart;
	public CheckoutPage CheckPage;
	public SuccessPage Spage;
	public SearchPage SPage;
	Logger logs;
	
	@When("User search product name as {string}")
	public void User_search_product_name(String productname)
	{
		logs = LogManager.getLogger(viewcheckoutordersteps.class.getName());
		LanPage = new LandingPage(driver);
		LanPage.searchfield(productname);
		
	}
	
	@And("User clicks on search link")
	public void User_clicks_on_search_link() {
		SPage =LanPage.searchicon();
	}
	
	@And("User clicks on Add to cart link")
    public void User_clicks_on_Add_to_cart_link() {
    	SPage.Addtocarticon();
    }
	
	
	@When("User clicks on shopping cart link")
	public void User_clicks_on_shopping_cart_link() {
		
		Shopcart =SPage.shoppingcartsuccesslink();
		
	}
	
	@Then("User navigates to shopping cart page")
	public void User_navigates_to_shopping_cart_page() {
		
		Assert.assertEquals("Shopping Cart", Shopcart.Shoppingcart());
		logs.info("user navigated to shopping cart page");
	}

	@And("User clicks on checkout button")
	public void User_clicks_on_checkout_button() {
		
		CheckPage =Shopcart.checkoutbutton();
		logs.debug("clicked on checkoutbutton");
		
	}
	
	@Then("User navigates to checkout page")
	public void User_navigates_to_checkout_page() {
		
		Assert.assertEquals("Checkout",CheckPage.checkoutverify());
		logs.info("Navigated to checkout page");
	}
	
	@And("User provides the valid shipping information")
	public void User_provides_the_valid_shipping_information() {
		
		CheckPage.guestcheckout();
		CheckPage.Firstname().sendKeys("John");
		CheckPage.Lastname().sendKeys("T");
		CheckPage.emailaddressinguest().sendKeys("JohnT@John.com");
		CheckPage.Address().sendKeys("TamilNadu");
		CheckPage.city().sendKeys("Bangalore");
		CheckPage.postcode().sendKeys("34577");
		
		
		Select country = new Select(CheckPage.country());
		
		country.selectByVisibleText("India");

		Select region = new Select(CheckPage.region());
		region.selectByIndex(2);
		CheckPage.continuebutton();
		logs.debug("entered valid shipping information");
	}
	
	@And("User selects on Shipping Method")
	public void User_selects_on_Shipping_Method() {
		
		CheckPage.chooseshippingbutton();
		CheckPage.preferredshippingmethod();
		CheckPage.continuepreferredshippingmethod();
		logs.debug("choosed shipping method");
	}
	
	@And("User selects on Payment Method")
	public void User_selects_on_Payment_Method() {
		
		CheckPage.choosepaymentbutton();
		CheckPage.cashonDelivery();
		CheckPage.continuecashonDelivery();
		logs.debug("choosed payment method");
	}
	
	@Then("User clicks on confirm order")
	public void User_clicks_on_confirm_order() {
		Spage = CheckPage.confirmorder();
		logs.debug("clicked confirm order");
	
	}
	
	@And("User should successfully placed the order")
	public void User_should_successfully_placed_the_order() {
		
		Assert.assertEquals("Your order has been placed!",Spage.ordersuccess());
		logs.info("order placed successfully");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
