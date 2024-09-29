package stepdefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LandingPage;
import pages.SearchPage;

public class searchsteps extends DriverFactory {

	LandingPage LanPage;
	SearchPage SPage;
	Logger logs;

	@When("^User enters valid product name as (.+)$")
	public void User_enters_valid_product_name_as(String productname) {

		logs = LogManager.getLogger(searchsteps.class.getName());

		LanPage = new LandingPage(driver);
		LanPage.searchfield(productname);
		logs.debug("entered productname");

	}

	@And("User clicks on search icon")
	public void User_clicks_on_search_icon() {
		SPage = LanPage.searchicon();
		logs.debug("clicked search icon");
	}

	@Then("User should navigates to search page")
	public void User_should_navigates_to_search_page() {

		Assert.assertEquals(SPage.searchconfirm(), "Search");
		logs.info("Navigated to search page");

	}

	@And("User clicks on Add to cart icon")
	public void User_clicks_on_Add_to_cart_icon() {
		SPage.Addtocarticon();
		logs.debug("clicked on add to cart icon");
	}

	@Then("^User should see Product (.+) added successfully to cart$")
	public void User_should_see_Product_added_successfully_to_cart(String productname) {

		Assert.assertEquals(SPage.successcart(), "Success: You have added " + productname + " to your shopping cart!");
		logs.info("product added successfully");

	}

}
