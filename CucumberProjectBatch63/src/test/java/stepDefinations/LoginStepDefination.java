package stepDefinations;

import org.junit.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;

public class LoginStepDefination {

	LoginPage lp = new LoginPage();
	
	String emailErr = "Please enter a username or card number without special characters.";
	
	@Given("^user is already on Login Page$")
	public void user_is_already_on_Login_Page() throws Throwable {
		System.out.println("Navigate to Login Page");
		lp.openBrowser();
		lp.openLoginPage();
	}

	@When("^title of login page is \"([^\"]*)\"$")
	public void title_of_login_page_is(String title) throws Throwable {
		System.out.println("Verify Title");	
		String expectedErr = title;
		Assert.assertEquals(lp.title(),expectedErr);
	}

	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String a, String b) throws Throwable {
		System.out.println("Enter Email and Password");
		lp.login(a, b);
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
		System.out.println("Click to Login Button");
		lp.click();
	}

	@Then("^user get error for email$")
	public void user_get_error_for_email() throws Throwable {
		System.out.println("Verify Error");
		String expectedErr = emailErr;
		Assert.assertEquals(lp.readEmailErr(),expectedErr);
	}

	@Then("^user quit$")
	public void user_quit() throws Throwable {
		System.err.println("Close Browser");
		lp.closeBrowser();
	}	

}
