package co.uk.lukejansen.SeleniumTask.utils;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class WebDriverHooks {

	
	private WebDriver webDriver;
	private ScreenshotManager screenshotManager;
	
	@Before("@selenium")
	public void setup() throws Exception {
		if (webDriver == null) {
			this.webDriver = WebDriverFactory.getDriver("FIREFOX");
		}
		screenshotManager = new ScreenshotManager();
	}
	
	@After("@selenium")
	public void teardown() {
		webDriver.quit();
	}
	
	public WebDriver getWebDriver() {
		return this.webDriver;
	}
	
	public ScreenshotManager getScreenshotManager() {
		return this.screenshotManager;
	}
}
