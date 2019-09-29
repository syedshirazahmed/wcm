package hooks;


import org.openqa.selenium.OutputType; 
import org.openqa.selenium.TakesScreenshot; 
import org.openqa.selenium.WebDriver;

import cucumber.api.Scenario; 
import cucumber.api.java.After; 
import cucumber.api.java.Before; 
import driverfactory.DriverFactory; 
import stepdefinitions.BaseStepDefinition;

public class CucumberHooks {

	public WebDriver driver;

	@Before 
	public void setBrowserDriver() 
	{ 
		driver = new DriverFactory().getNewChromeDriver(); 
		BaseStepDefinition.driver = driver;
	}

	@After 
	public void takeScreenshotAndCloseDriver(Scenario scenario) 
	{
		TakesScreenshot ss = (TakesScreenshot) driver;
		scenario.embed(ss.getScreenshotAs(OutputType.BYTES),"image/png");
		BaseStepDefinition.driver.quit(); 
	} 
}
