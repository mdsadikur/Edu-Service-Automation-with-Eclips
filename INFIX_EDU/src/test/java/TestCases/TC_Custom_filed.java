package TestCases;

import org.testng.annotations.Test;

import Base.DriverSetup;
import PageObject.POM_Custom_Field;

public class TC_Custom_filed extends DriverSetup{
	
	@Test(priority=15)
	public void TV_custom_fileds() throws InterruptedException {
		
		POM_Custom_Field cbox = new POM_Custom_Field(driver);
		
		
		//clickcustomfieldbutton
		cbox.clickcustomfieldbutton();
		Thread.sleep(1000);
		
		//clickstaffbutton
		cbox.clickstaffbutton();
		Thread.sleep(1000);
		
		
		
		
		
	}
	
	

}
