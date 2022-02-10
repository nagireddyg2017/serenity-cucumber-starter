package starter.search;

import net.thucydides.core.annotations.Step;

public class DashboardPage {
	
	OrangeHRMDashboard dash;
	@Step
	public void verifyAdminLogin()
	{
		dash.verfiedLogin();
	}

}
