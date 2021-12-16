package co.uk.lukejansen.SeleniumTask.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class APLogin {

private WebDriver driver;
	
	@FindBy(name="email_create")
	private WebElement createEmailInput;
	
	@FindBy(name="email")
	private WebElement loginEmailInput;
	
	@FindBy(name="passwd")
	private WebElement loginPasswordInput;
	
	@FindBy(name="SubmitCreate")
	private WebElement createButton;
	
	@FindBy(name="SubmitLogin")
	private WebElement loginButton;
	
	public APLogin(WebDriver driver) {
		this.driver = driver;

		if (!driver.getTitle().equals("Login - My Store")) {
			throw new IllegalStateException("Page did not load!");
		}
	}

	public void enterCreateEmail(String string) {
		createEmailInput.sendKeys(string);
	}
	
	public APCreateAccount createAccount() {
		createButton.click();
		
		return PageFactory.initElements(driver, APCreateAccount.class);
	}
}
