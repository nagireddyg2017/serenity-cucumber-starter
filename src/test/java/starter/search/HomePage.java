package starter.search;

import net.thucydides.core.annotations.Step;

public class HomePage {
	
	OrangeHRMHomePage home;
	
	
	@Step
	public void openApplication()
	{
		home.open();
	}
	@Step
	public void enterUsername()
	{
		home.enterUsername();
	}
	@Step
	public void enterPassword()
	{
		home.enterPassword();
	}
	@Step
	public void clickOnLoginButtion()
	{
		home.clickLogin();
	}

}
