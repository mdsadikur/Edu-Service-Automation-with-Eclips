package TestCases;

import org.testng.annotations.Test;

import Base.DriverSetup;
import PageObject.Pom_Dormitory;


public class TC_Dormitory extends DriverSetup {
	@Test(priority=10)
	
	public void  TC_dormitory() throws InterruptedException {
		
		Pom_Dormitory cbox = new Pom_Dormitory(driver);
		
		cbox.dormitory();
		Thread.sleep(2000);
		
		cbox.dormitoryRoom();
		Thread.sleep(2000);
		
		cbox.RoomType();
		Thread.sleep(2000);
		
		cbox.studentdormitoryreport();
		Thread.sleep(2000);
		
			
	}

}
