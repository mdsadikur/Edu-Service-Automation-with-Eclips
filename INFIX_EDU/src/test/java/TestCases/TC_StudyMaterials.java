package TestCases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import Base.DriverSetup;
import PageObject.Pom_StudyMaterials;


public class TC_StudyMaterials extends DriverSetup {
	@Test(priority=4)
	
	public void studymaterials() throws InterruptedException, AWTException {
		Pom_StudyMaterials cbox = new Pom_StudyMaterials(driver); 
		
		cbox.uploadcontent();
		Thread.sleep(2000);
		
		cbox.assignment();
		Thread.sleep(2000);
		
		cbox.syllabus();
		Thread.sleep(2000);
		
		cbox.otherdownloads();
		Thread.sleep(2000);
		
	
	}
	
	
	
	

}
