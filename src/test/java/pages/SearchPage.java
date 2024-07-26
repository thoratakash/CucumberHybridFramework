package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import factory.DriverFactory;
import utils.ElementUtils;

public class SearchPage {

	public WebDriver driver;
	private ElementUtils elementUtils;

	public SearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		elementUtils = new ElementUtils(driver);
	}

	@FindBy(name = "search")
	@CacheLookup
	private WebElement txtSearchField;

	@FindBy(xpath = "//button[@class=\"btn btn-default btn-lg\"]")
	@CacheLookup
	private WebElement btnSearch;

	@FindBy(linkText = "HP LP3065")
	@CacheLookup
	private WebElement searchResult;

	@FindBy(xpath = "//input[@type=\"button\"]/following-sibling::p")
	@CacheLookup
	private WebElement WarningMsgWithoutEnteringValue;

	public void setSearchField(String validProduct) {
		elementUtils.typeTextIntoElement(txtSearchField, validProduct, DriverFactory.EXPLICIT_WAIT_BASIC_TIME);
		// txtSearchField.sendKeys(validProduct);
	}

	public void clickOnSearchBtn() {
		elementUtils.clickOnElement(btnSearch, DriverFactory.EXPLICIT_WAIT_BASIC_TIME);
		// btnSearch.click();
	}

	public boolean displayStatusOfSearchResult() {
		return elementUtils.isDisplayOfElement(searchResult, DriverFactory.EXPLICIT_WAIT_BASIC_TIME);
		// return searchResult.isDisplayed();
	}

	public String displayStatusOfWithoutEnteringValue() {
		return elementUtils.getTextFromElement(WarningMsgWithoutEnteringValue, DriverFactory.EXPLICIT_WAIT_BASIC_TIME);
		// return WarningMsgWithoutEnteringValue.getText();
	}

}// class
