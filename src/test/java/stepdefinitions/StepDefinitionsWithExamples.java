package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageobjects.MercuryToursLoginPage;

public class StepDefinitionsWithExamples extends BaseStepDefinition{
	
	MercuryToursLoginPage mercuryToursLoginPage;
	
	public StepDefinitionsWithExamples() {
		mercuryToursLoginPage = new MercuryToursLoginPage(driver);
	}
	
	@Given("^I load Mercury Tours Login Page$")
	public void i_load_Mercury_Tours_Login_Page() throws Throwable {
	    mercuryToursLoginPage.navigateToMercuryToursLoginPage();
	    System.out.println("Loaded Mercury Tours Login Page");
	}
	
	@Then("^I fill In Username with \"([^\"]*)\"$")
	public void i_fill_In_Username_with(String username) throws Throwable {
	    mercuryToursLoginPage.enterUserName(username);
	    System.out.println("Entered the UserName as "+username);
	}
	
	@And("^I fill In Password with \"([^\"]*)\"$")
	public void i_fill_In_Password_with(String password) throws Throwable {
	    mercuryToursLoginPage.enterPassword(password);
	    System.out.println("Entered the Password as "+password);
	}
	
	@Then("^I click the Submit Button$")
	public void i_click_the_Submit_Button() throws Throwable {
	    mercuryToursLoginPage.clickSubmitButton();
	    System.out.println("Clicked the Submit Button");
	}
	

}
