package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SearchPage;

public class Search {
	
	public WebDriver driver;
	private SearchPage searchpage;
	
	@Given("User open the application")
	public void user_open_the_application() {
	   driver=DriverFactory.getDriver();
	   searchpage=new SearchPage(driver);
	}

	@When("User enter valid product {string} into search field")
	public void user_enter_valid_product_into_search_field(String validProduct) {
		searchpage.setSearchField(validProduct);
	}

	@When("User click on Search button")
	public void user_click_on_search_button() {
		searchpage.clickOnSearchBtn();
	}

	@Then("Valid Product should get displayed in search results")
	public void valid_product_should_get_displayed_in_search_results() {
		Assert.assertTrue(searchpage.displayStatusOfSearchResult());
	}

	
	
	@When("User enter non-existing product {string}  into search field")
	public void user_enter_non_existing_product_into_search_field(String nonExist) {
		searchpage.setSearchField(nonExist);
		//driver.findElement(By.name("search")).sendKeys(nonExist);
	}

	@Then("Proper text informing the User about no product matching should be displayed")
	public void proper_text_informing_the_user_about_no_product_matching_should_be_displayed() {   
		Assert.assertEquals("There is no product that matches the search criteria.",searchpage.displayStatusOfWithoutEnteringValue());
	}

	@When("User dont enter any product into search field")
	public void user_dont_enter_any_product_into_search_field() {
		//Intentionally kept empty
	}

}//class
