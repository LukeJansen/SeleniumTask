package co.uk.lukejansen.SeleniumTask.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class APHome {
	
	private WebDriver driver;
	
	@FindBy(className="login")
	private WebElement loginButton;
	
	public APHome(WebDriver driver) {
		this.driver = driver;

		if (!driver.getTitle().equals("My Store")) {
			throw new IllegalStateException("Page did not load!");
		}
	}
	
	public APLogin clickLogin() {
		loginButton.click();
		
		return PageFactory.initElements(driver, APLogin.class);
	}

}
