package TestCases;

import org.testng.annotations.Test;

import Base.DriverSetup;
import PageObject.Pom_Transport;

public class TC_Transport extends DriverSetup {
	@Test(priority=12)
	
	public void transport() throws InterruptedException {
		Pom_Transport cbox = new Pom_Transport(driver);
		
		cbox.Route();
		Thread.sleep(2000);
		
		cbox.Vehicle();
		Thread.sleep(2000);
		
		
		cbox.AssignVehicle();
		Thread.sleep(2000);
		
		cbox.StudentTransportReport();
		Thread.sleep(2000);
	}

}
