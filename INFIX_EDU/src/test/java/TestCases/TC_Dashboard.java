package TestCases;

import org.testng.annotations.Test;

import PageObject.POM_Dashboard;



public class TC_Dashboard extends Base.DriverSetup{
	
	
	
	@Test(priority=25)
	public void dashboard() throws InterruptedException {
		
		POM_Dashboard dashboard= new POM_Dashboard(driver);
		
		dashboard.dashboard();
		Thread.sleep(1000);
		
		
		dashboard.viewProfile();
		Thread.sleep(1000);
	}

}
