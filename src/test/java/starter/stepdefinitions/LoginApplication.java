package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.search.DashboardPage;
import starter.search.HomePage;

public class LoginApplication {
	
	@Steps
	HomePage homepage;
	@Steps
	DashboardPage dash;
	
	@Given("user is on home page")
	public void user_is_on_home_page() {
		homepage.openApplication();
	}

	@When("user enter admin as username")
	public void user_enter_admin_as_username() {
		homepage.enterUsername();
	}

	@When("user enter admin123 as password")
	public void user_enter_admin123_as_password() {
		homepage.enterPassword();
		homepage.clickOnLoginButtion();
	}

	@Then("user should be able to login")
	public void user_should_be_able_to_login() {
		dash.verifyAdminLogin();
	}
}