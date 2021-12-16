package co.uk.lukejansen.SeleniumTask.stepdefs;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import co.uk.lukejansen.SeleniumTask.pom.PageRepository;
import co.uk.lukejansen.SeleniumTask.pom.pages.APHome;
import co.uk.lukejansen.SeleniumTask.utils.WebDriverHooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AutomationPracticeStepDefinitions {
	
	private WebDriver driver;
	
	private PageRepository pages;
	
	public AutomationPracticeStepDefinitions(WebDriverHooks hooks) {
		this.driver = hooks.getWebDriver();
		this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		this.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		this.pages = new PageRepository();
	}

	@Given("the user navigates to home page")
	public void theUserNavigatesToHomePage() {
	    driver.get("http://automationpractice.com");
	    this.pages.homePage = PageFactory.initElements(driver, APHome.class);
	}
	@When("the user proceeds to Login page")
	public void theUserProceedsToLoginPage() {
	    this.pages.loginPage = this.pages.homePage.clickLogin();
	}
	@When("the user enters {string} in the create account input")
	public void theUserEntersInTheCreateAccountInput(String string) {
	    this.pages.loginPage.enterCreateEmail(string);
	}
	@When("the user clicks create account")
	public void theUserClicksCreateAccount() {
	    this.pages.createAccountPage = this.pages.loginPage.createAccount();
	}
	@When("the user enters details on create account page")
	public void theUserEntersDetailsOnCreateAccountPage() throws InterruptedException {
	    this.pages.createAccountPage.enterStubData();
	}
	@When("the user clicks register button")
	public void theUserClicksRegisterButton() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("the user sees My Account page")
	public void theUserSeesMyAccountPage() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("the user clicks sign out button")
	public void theUserClicksSignOutButton() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("the user enters email {string}")
	public void theUserEntersEmail(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("the user enters password {string}")
	public void theUserEntersPassword(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("the user clicks Sign In button")
	public void theUserClicksSignInButton() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("the user hovers over {string} button")
	public void theUserHoversOverButton(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("the user clicks the {string} button")
	public void theUserClicksTheButton(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("the user sees {string} catalog page")
	public void theUserSeesCatalogPage(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("the user hovers over first product")
	public void theUserHoversOverFirstProduct() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("the user clicks add to cart")
	public void theUserClicksAddToCart() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("the user sees verification message {string}")
	public void theUserSeesVerificationMessage(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Given("the user navigates to {string}")
	public void theUserNavigatesTo(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("the user sees Shopping cart summary page")
	public void theUserSeesShoppingCartSummaryPage() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("the user clicks {string} button")
	public void theUserClicksButton(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("the user sees Addresses page")
	public void theUserSeesAddressesPage() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("the user sees Shipping page")
	public void theUserSeesShippingPage() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("the user agrees to the terms of service")
	public void theUserAgreesToTheTermsOfService() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("the user sees Payment page")
	public void theUserSeesPaymentPage() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("the user sees Order Summary page")
	public void theUserSeesOrderSummaryPage() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("the user sees Order Confirmation page")
	public void theUserSeesOrderConfirmationPage() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
