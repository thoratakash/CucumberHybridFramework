package stepdefinitions;

import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import factory.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.MyAccountPage;
import pages.RegisterPage;

public class Register {
	
	public WebDriver driver;
	private HomePage homepage;
	private RegisterPage registerpage;
	private MyAccountPage myaccountpage;

	@Given("User navigates to Register Account page")
	public void user_navigates_to_register_account_page() {
		driver=DriverFactory.getDriver();
		registerpage=new RegisterPage(driver);
		homepage=new HomePage(driver);
		homepage.clickOnMyAccountBtn();
		homepage.clickOnRegisterLink(); 
	}

	@When("User enters details into below fields")
	public void user_enters_details_into_below_fields(DataTable dataTable) throws InterruptedException {
		Map<String, String> dataMap=dataTable.asMap(String.class,String.class);
		registerpage.setFirstName(dataMap.get("firstName"));
		registerpage.setLastName(dataMap.get("lastName"));
		String email = DriverFactory.randomString() + "@gmail.com";
		registerpage.setEmail(email);
		Thread.sleep(3000);
		registerpage.setTelephone(dataMap.get("telephone"));
		registerpage.setPassword(dataMap.get("password"));
		registerpage.setConfirmPassword(dataMap.get("password"));
	}
	
	@When("User enters email address {string} into the Email field field")
	public void user_enters_email_address_into_the_email_field_field(String email) {
		registerpage.setEmail(email);
	}
	

	@When("User selects Privacy Policy field")
	public void user_selects_privacy_policy_field() {
		registerpage.selectPrivacyPolicyField();
	}

	@When("User clicks on Continue button")
	public void user_clicks_on_continue_button() throws InterruptedException {
		Thread.sleep(3000);
		registerpage.clickOnContinueBtn();
	}

	@Then("User account should get created successfully")
	public void user_account_should_get_created_successfully() {
		myaccountpage=new MyAccountPage(driver); 
		Assert.assertEquals(true, myaccountpage.displayStatusOfAccountCreated());
	}

	@When("User selects Yes for Newsletter")
	public void user_selects_yes_for_newsletter() {
		registerpage.clickOnNewsletterRadioBtn();
	}

	@Then("Warning message informing the User about duplicate email should be displayed")
	public void warning_message_informing_the_user_about_duplicate_email_should_be_displayed() {
		Assert.assertEquals(true, registerpage.displayStatusOfDupEmailWarningMsg());
	}

	@When("User dont enter details into any fields")
	public void user_dont_enter_details_into_any_fields() throws InterruptedException {
		//Intentionally kept empty
	}

	@Then("Warning messages should be displayed for the mandatory fields")
	public void warning_messages_should_be_displayed_for_the_mandatory_fields() throws InterruptedException {
		   Thread.sleep(5000);
		   Assert.assertEquals("First Name must be between 1 and 32 characters!",registerpage.displayWarningMsgFirstName());		  
		   Thread.sleep(2000);
		   Assert.assertEquals("Last Name must be between 1 and 32 characters!", registerpage.displayWarningMsgLastName());
		   Thread.sleep(2000);
		   Assert.assertEquals("E-Mail Address does not appear to be valid!", registerpage.displayWarningMsgEmail());
		   Thread.sleep(2000);
		   Assert.assertEquals("Telephone must be between 3 and 32 characters!", registerpage.displayWarningMsgTelephone());
		   Thread.sleep(2000);
		   Assert.assertEquals("Password must be between 4 and 20 characters!", registerpage.displayWarningMsgPassword());
	   
	}


}//class
