package stepdefinitions;

import cucumber.api.java.en.Then;
import pageobjects.MercuryToursLoginPage;
import utils.ExcelUtils;

public class StepDefinitionsWithExcel extends BaseStepDefinition{
	
	MercuryToursLoginPage mercuryToursLoginPage;
	
	public StepDefinitionsWithExcel()
	{
		mercuryToursLoginPage = new MercuryToursLoginPage(driver);
	}

	@Then("^I fill In Username from Excel Sheet$")
	public void i_fill_In_Username_from_Excel_Sheet() throws Throwable {
	   String username = ExcelUtils.getFieldFromSheet("Login", "username");
	   mercuryToursLoginPage.enterUserName(username);
	   System.out.println("Entered the UserName Fetched from Excel Sheet as "+username);
	}

	@Then("^I fill In Password from Excel Sheet$")
	public void i_fill_In_Password_from_Excel_Sheet() throws Throwable {
		String password = ExcelUtils.getFieldFromSheet("Login", "password");
		mercuryToursLoginPage.enterPassword(password);
		System.out.println("Entered the Password Fetched from Excel Sheet as "+password);
	}

}
