package starter.search;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

public class OrangeHRMHomePage extends PageObject{

	public void enterUsername()
	{
		$(By.id("txtUsername")).type("Admin");
	}
	public void enterPassword()
	{
		$(By.id("txtPassword")).type("admin123");
	}
	public void clickLogin()
	{
		$(By.id("btnLogin")).click();
	}
	
}
