package pageobjects;

import org.openqa.selenium.WebDriver;

public class BasePage {
	
	WebDriver driver;
	
	public BasePage(WebDriver webDriver)
	{
		driver = webDriver;
	}
}
