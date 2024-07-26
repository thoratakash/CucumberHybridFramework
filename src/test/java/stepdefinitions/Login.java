package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;

public class Login  {
	
	public WebDriver driver;
	private LoginPage loginpage;
	private HomePage homepage;
	
	@Given("^User navigates to Login page$")
	public void user_navigates_to_login_page() {	
		driver=DriverFactory.getDriver();
		homepage=new HomePage(driver);
		loginpage=new LoginPage(driver);
		homepage.clickOnMyAccountBtn();
		homepage.clickOnLoginLink();
	}

	@When("^User enters valid email address (.+)$")
	public void user_enters_valid_email_address(String email) {
		loginpage.setEmailAddress(email);
	}

	@When("^Enters valid password (.+)$")
	public void enters_valid_password(String password) {
		loginpage.setPasswordField(password);
	}

	@When("^Clicks on Login button$")
	public void clicks_on_login_button() {
		loginpage.clickOnLoginBtn();
	}

	@Then("^User should login successfully$")
	public void user_should_login_successfully() {
		Assert.assertEquals("My Account", driver.getTitle());
	}

	@When("User enters invalid email address {string}")
	public void user_enters_invalid_email_address(String email) {
		loginpage.setEmailAddress(email);
	}

	@When("Enters invalid password {string}")
	public void enters_invalid_password(String password) {
		loginpage.setPasswordField(password);
	}

	@Then("User should get a proper warning message")
	public void user_should_get_a_proper_warning_message() {
		Assert.assertEquals(true, loginpage.displayStatusOfWarningMsgInvalidFields());
	}

	@When("User dont enters any credentials")
	public void user_dont_enters_any_credentials() {
		//Intentionally kept empty
	}

}//class
