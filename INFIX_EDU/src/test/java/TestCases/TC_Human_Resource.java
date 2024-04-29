package TestCases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import Base.DriverSetup;
import PageObject.POM_Human_Resource;

public class TC_Human_Resource extends DriverSetup{
	
	@Test(priority=1)
	public void TC_human_Resource() throws InterruptedException, AWTException {
		
		POM_Human_Resource cbox = new POM_Human_Resource(driver);
		
		//clickhumanresourceButton
		cbox.clickhumanresourceButton();
		Thread.sleep(1000);
		
		//clickdepartmentButton
		cbox.clickdepartmentButton();
		Thread.sleep(1000);
		
		//clickaddstaffButton
		cbox.clickaddstaffButton();
		Thread.sleep(1000);
		
		//clickstaff_DirectoryButton
		cbox.clickstaff_DirectoryButton();
		Thread.sleep(1000);
		
		//clickstaff_AttendanceButton
		cbox.clickstaff_AttendanceButton();
		Thread.sleep(1000);
		
		//clickstaff_attendence_reportButton
		cbox.clickstaff_attendence_reportButton();
		Thread.sleep(1000);
		
		//clickstaffpayrollbutton
		cbox.clickstaffpayrollbutton();
		Thread.sleep(1000);
		
		//clickpayroll_reportButton
		cbox.clickpayroll_reportButton();
		Thread.sleep(1000);
	}

}
