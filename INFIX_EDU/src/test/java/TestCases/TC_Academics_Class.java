package TestCases;

import org.testng.annotations.Test;

import Base.DriverSetup;
import PageObject.POM_Academics;


public class TC_Academics_Class extends DriverSetup {
	@Test(priority=2)
	
	public void Academics() throws InterruptedException {
		
		POM_Academics cbox = new POM_Academics(driver);
		
		cbox.Class();
		Thread.sleep(2000);
		
		
		cbox.section();
		Thread.sleep(2000);
		
		cbox.classroom();
		Thread.sleep(2000);
		
		cbox.subject();
		Thread.sleep(2000);
		
		cbox.classteacher();
		Thread.sleep(2000);
		
		cbox.assignsubject();
		Thread.sleep(1000);
		
		cbox.optionalsubject();
		Thread.sleep(2000);
		
		cbox.classroutine();
		Thread.sleep(2000);
		
		cbox.teacherclassroutine();
		Thread.sleep(2000);

		
		
	}

}
