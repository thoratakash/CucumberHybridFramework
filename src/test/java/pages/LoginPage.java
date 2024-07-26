package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import factory.DriverFactory;
import utils.ElementUtils;

public class LoginPage {

	public WebDriver driver;
	private ElementUtils elementUtils;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		elementUtils = new ElementUtils(driver);
	}

	@FindBy(name = "email")
	@CacheLookup
	private WebElement txtEmailAddress;

	@FindBy(name = "password")
	@CacheLookup
	private WebElement txtPassword;

	@FindBy(xpath = "//input[@type='submit']")
	@CacheLookup
	private WebElement btnLogin;

	@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
	@CacheLookup
	private WebElement WarningMsgInvalidFields;

	public void setEmailAddress(String email) {
		elementUtils.typeTextIntoElement(txtEmailAddress, email, DriverFactory.EXPLICIT_WAIT_BASIC_TIME);
		// txtEmailAddress.sendKeys(email);
	}

	public void setPasswordField(String password) {
		elementUtils.typeTextIntoElement(txtPassword, password, DriverFactory.EXPLICIT_WAIT_BASIC_TIME);
		// txtPassword.sendKeys(password);
	}

	public void clickOnLoginBtn() {
		elementUtils.clickOnElement(btnLogin, DriverFactory.EXPLICIT_WAIT_BASIC_TIME);
		// btnLogin.click();
	}

	public boolean displayStatusOfWarningMsgInvalidFields() {
		return elementUtils.isDisplayOfElement(WarningMsgInvalidFields, 20);
		// return WarningMsgInvalidFields.isDisplayed();
	}

}// class
