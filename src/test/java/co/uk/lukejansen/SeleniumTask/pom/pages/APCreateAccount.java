package co.uk.lukejansen.SeleniumTask.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class APCreateAccount {
	
	private WebDriver driver;
	
	@FindBy(name="customer_firstname")
	private WebElement firstNameInput;
	
	@FindBy(name="customer_lastname")
	private WebElement lastNameInput;
	
	@FindBy(name="passwd")
	private WebElement passwordInput;
	
	@FindBy(name="firstname")
	private WebElement addFirstNameInput;
	
	@FindBy(name="lastname")
	private WebElement addLastNameInput;
	
	@FindBy(name="address1")
	private WebElement addressInput;
	
	@FindBy(name="city")
	private WebElement cityInput;
	
	@FindBy(name="id_state")
	private Select stateInput;
	
	@FindBy(name="postcode")
	private WebElement postcodeInput;
	
	@FindBy(name="id_country")
	private Select countryInput;
	
	@FindBy(name="phone_mobile")
	private WebElement mobilePhoneInput;
	
	public APCreateAccount(WebDriver driver) {
		this.driver = driver;

		if (!driver.getTitle().equals("Login - My Store")) {
			throw new IllegalStateException("Page did not load!");
		}
	}

	// This method enters stub data. At later date enable user to specify data to be entered.
	public void enterStubData() throws InterruptedException {
		Actions dataEnterActions = new Actions(driver);
		dataEnterActions.sendKeys(firstNameInput, "John")
						.sendKeys(lastNameInput, "Smith")
						.sendKeys(passwordInput, "testing")
						.sendKeys(addFirstNameInput, "John")
						.sendKeys(addLastNameInput, "Smith")
						.sendKeys(addressInput, "123 Testing Road")
						.sendKeys(cityInput, "Testville")
						.sendKeys(postcodeInput, "12345")
						.sendKeys(mobilePhoneInput, "01234567890")
						.perform();
		
		stateInput.selectByValue("Idaho");
		countryInput.selectByValue("United States");
		
		Thread.sleep(5000);
	}
}
