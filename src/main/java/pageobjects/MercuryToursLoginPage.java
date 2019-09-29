package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MercuryToursLoginPage extends BasePage{

	public MercuryToursLoginPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="userName")
	private WebElement userNameElement;
	
	@FindBy(name="password")
	private WebElement passwordElement;
	
	@FindBy(xpath="//input[@name='login']")
	private WebElement submitButton;
	
	
	
	public void navigateToMercuryToursLoginPage()
	{
		driver.get("http://newtours.demoaut.com/mercurysignon.php");
	}
	
	public void enterUserName(String username)
	{
		userNameElement.sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		passwordElement.sendKeys(password);
	}
	
	public void clickSubmitButton()
	{
		submitButton.click();
	}

}
