package TestCases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import Base.DriverSetup;
import PageObject.Pom_SystemSettings;



public class TC_SystemSetting extends DriverSetup {
	@Test(priority=24)
	
	public void systemsettings() throws InterruptedException, AWTException {
		
		Pom_SystemSettings cbox = new Pom_SystemSettings(driver);
		
//		cbox.academicyear();
//		Thread.sleep(2000);
		
		cbox.generalsetting();
		Thread.sleep(2000);

		cbox.optionalsubject();
		Thread.sleep(2000);
		
		
		cbox.holiday();
		Thread.sleep(2000);
		
		
		cbox.manage_currency();
		Thread.sleep(2000);
		
		cbox.weekend();
		Thread.sleep(2000);
		
		cbox.languagesettings();
		Thread.sleep(2000);
		
		cbox.dashboard();
		Thread.sleep(2000);
		
		cbox.paymentsetting();
		Thread.sleep(2000);
		
		
		cbox.emailsettings();
		Thread.sleep(2000);
		
		cbox.smssettings();
		Thread.sleep(2000);
		
		cbox.preloadersettings();
		Thread.sleep(2000);
		
//		cbox.language();
//		Thread.sleep(2000);
		
		cbox.utilities();
		Thread.sleep(2000);
		
	}
	
	

}
