package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import factory.DriverFactory;
import utils.ElementUtils;

public class RegisterPage {
	
	public WebDriver driver;
	private ElementUtils elementUtils;

	public RegisterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		elementUtils=new ElementUtils(driver);
	}
	
	@FindBy(id = "input-firstname")
	@CacheLookup
	private WebElement txtFirstName;
	
	@FindBy(id = "input-lastname")
	@CacheLookup
	private WebElement txtLastName;
	
	@FindBy(id = "input-email")
	@CacheLookup
	private WebElement txtEmail;
	
	@FindBy(id = "input-telephone")
	@CacheLookup
	private WebElement txtTelephone;
	
	@FindBy(id = "input-password")
	@CacheLookup
	private WebElement txtPassword;
	
	@FindBy(id = "input-confirm")
	@CacheLookup
	private WebElement txtConfirmPassword;
	
	@FindBy(xpath = "//input[@type='checkbox']")
	@CacheLookup
	private WebElement CheckBoxPrivacyPolicyField;
	
	@FindBy(xpath = "//input[@type='submit']")
	@CacheLookup
	private WebElement btnContinue;
	
	@FindBy(name = "newsletter")
	@CacheLookup
	private WebElement radBtnNewsletter;
	
	@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
	@CacheLookup
	private WebElement textWarningRegister;
	
	@FindBy(xpath = "//div[contains(text(),'First Name must be between 1 and 32 characters!')]")
	@CacheLookup
	private WebElement WarningMsgFirstName;
	
	
	@FindBy(xpath = "//div[contains(text(),'Last Name must be between 1 and 32 characters!')]")
	@CacheLookup
	private WebElement WarningMsgLastName;
	
	@FindBy(xpath = "//div[contains(text(),'E-Mail Address does not appear to be valid!')]")
	@CacheLookup
	private WebElement WarningMsgEmail;
	
	@FindBy(xpath = "//div[contains(text(),'Telephone must be between 3 and 32 characters!')]")
	@CacheLookup
	private WebElement WarningMsgTelephone;
	
	@FindBy(xpath = "//div[contains(text(),'Password must be between 4 and 20 characters!')]")
	@CacheLookup
	private WebElement WarningMsgPassword;
	
	public void setFirstName(String firstName) {
		elementUtils.typeTextIntoElement(txtFirstName, firstName, DriverFactory.EXPLICIT_WAIT_BASIC_TIME);
		//txtFirstName.sendKeys(firstName);
	}
	
	public void setLastName(String lastName) {
		elementUtils.typeTextIntoElement(txtLastName, lastName, DriverFactory.EXPLICIT_WAIT_BASIC_TIME);
		//txtLastName.sendKeys(lastName);
	}
	
	public void setEmail(String email) {
		elementUtils.typeTextIntoElement(txtEmail, email, DriverFactory.EXPLICIT_WAIT_BASIC_TIME);
		//txtEmail.clear();
		//txtEmail.sendKeys(email);
	}
	
	public void setTelephone(String telephone) {
		elementUtils.typeTextIntoElement(txtTelephone, telephone, DriverFactory.EXPLICIT_WAIT_BASIC_TIME);
		//txtTelephone.sendKeys(telephone);
	}
	
	public void setPassword(String password) {
		elementUtils.typeTextIntoElement(txtPassword, password, DriverFactory.EXPLICIT_WAIT_BASIC_TIME);
		//txtPassword.sendKeys(password);
	}
	
	public void setConfirmPassword(String password) {
		elementUtils.typeTextIntoElement(txtConfirmPassword, password, DriverFactory.EXPLICIT_WAIT_BASIC_TIME);
		//txtConfirmPassword.sendKeys(password);
	}
	
	public void selectPrivacyPolicyField() {
		elementUtils.clickOnElement(CheckBoxPrivacyPolicyField, DriverFactory.EXPLICIT_WAIT_BASIC_TIME);
		//CheckBoxPrivacyPolicyField.click();
	}
	
	public void clickOnContinueBtn() {
		elementUtils.clickOnElement(btnContinue, DriverFactory.EXPLICIT_WAIT_BASIC_TIME);
		//btnContinue.click();
	}
	
	public void clickOnNewsletterRadioBtn() {
		elementUtils.clickOnElement(radBtnNewsletter, DriverFactory.EXPLICIT_WAIT_BASIC_TIME);
		//radBtnNewsletter.click();
	}

	public boolean displayStatusOfDupEmailWarningMsg() {
		return elementUtils.isDisplayOfElement(textWarningRegister, DriverFactory.EXPLICIT_WAIT_BASIC_TIME);
		//return textWarningRegister.isDisplayed();
	}
	
	public String displayWarningMsgFirstName() {
		return elementUtils.getTextFromElement(WarningMsgFirstName, DriverFactory.EXPLICIT_WAIT_BASIC_TIME);
		//return WarningMsgFirstName.getText();
	}
	
	public String displayWarningMsgLastName() {
		return elementUtils.getTextFromElement(WarningMsgLastName, DriverFactory.EXPLICIT_WAIT_BASIC_TIME);
		//return WarningMsgLastName.getText();
	}
	
	public String displayWarningMsgEmail() {
		return elementUtils.getTextFromElement(WarningMsgEmail, DriverFactory.EXPLICIT_WAIT_BASIC_TIME);
		//return WarningMsgEmail.getText();
	}
	
	public String displayWarningMsgTelephone() {
		return elementUtils.getTextFromElement(WarningMsgTelephone, DriverFactory.EXPLICIT_WAIT_BASIC_TIME);
		//return WarningMsgTelephone.getText();
	}
	
	public String displayWarningMsgPassword() {
		return elementUtils.getTextFromElement(WarningMsgPassword, DriverFactory.EXPLICIT_WAIT_BASIC_TIME);
		//return WarningMsgPassword.getText();
	}

}//class
