package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import factory.DriverFactory;
import utils.ElementUtils;

public class HomePage {

	public WebDriver driver;
	private ElementUtils elementUtils;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		elementUtils = new ElementUtils(driver);
	}

	@FindBy(xpath = "//a[@title='My Account']")
	@CacheLookup
	private WebElement btnMyAccount;

	@FindBy(xpath = "//a[text()='Login']")
	@CacheLookup
	private WebElement linkLogin;

	@FindBy(xpath = "//a[text()='Register']")
	@CacheLookup
	private WebElement linkRegister;

	public void clickOnMyAccountBtn() {
		elementUtils.clickOnElement(btnMyAccount, DriverFactory.EXPLICIT_WAIT_BASIC_TIME);
		// btnMyAccount.click();
	}

	public void clickOnLoginLink() {
		elementUtils.clickOnElement(linkLogin, DriverFactory.EXPLICIT_WAIT_BASIC_TIME);
		// linkLogin.click();
	}

	public void clickOnRegisterLink() {
		elementUtils.clickOnElement(linkRegister, DriverFactory.EXPLICIT_WAIT_BASIC_TIME);
		// linkRegister.click();
	}

}// class
