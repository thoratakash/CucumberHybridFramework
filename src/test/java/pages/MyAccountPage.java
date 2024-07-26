package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import factory.DriverFactory;
import utils.ElementUtils;

public class MyAccountPage {

	public WebDriver driver;
	private ElementUtils elementUtils;

	public MyAccountPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		elementUtils = new ElementUtils(driver);
	}

	@FindBy(xpath = "//div[@id='content']/h1")
	@CacheLookup
	private WebElement textTitleAccountPage;

	public boolean displayStatusOfAccountCreated() {
		return elementUtils.isDisplayOfElement(textTitleAccountPage, DriverFactory.EXPLICIT_WAIT_BASIC_TIME);
		// return textTitleAccountPage.isDisplayed();
	}

}// class
