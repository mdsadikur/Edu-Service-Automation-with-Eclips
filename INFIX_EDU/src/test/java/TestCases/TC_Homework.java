package TestCases;


import org.testng.annotations.Test;

import PageObject.POM_Homework;


public class TC_Homework extends Base.DriverSetup{
	
	
	
	
	@Test(priority=8)
	public void homework() throws InterruptedException {
		
		
		POM_Homework homework= new POM_Homework(driver);
		
		
		homework.addHomework();
		Thread.sleep(1000);
		
		homework.homeworkList();
		Thread.sleep(1000);
		
		homework.evaluationList();
		Thread.sleep(1000);
		
		
		
	
	}
	
	
	

}
