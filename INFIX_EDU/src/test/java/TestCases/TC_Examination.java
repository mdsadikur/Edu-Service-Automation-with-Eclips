package TestCases;

import org.testng.annotations.Test;

import PageObject.POM_Examination;



public class TC_Examination extends Base.DriverSetup{
	
	
	@Test(priority=6)
	public void  examination() throws InterruptedException {
		
		POM_Examination exam = new POM_Examination(driver); 
		
		exam.examType();
		Thread.sleep(1000);
		

		
		exam.examSetup();
		Thread.sleep(1000);
	
		exam.examSchedule();
		Thread.sleep(1000);
		
		
		exam.examAttendance();
		Thread.sleep(1000);
		
		exam.markRegister();
		Thread.sleep(1000);
		
		exam.marksGrade();
		Thread.sleep(1000);
//		
		exam.sendMark();
		Thread.sleep(1000);
		
		exam.examSetUpRule();
		Thread.sleep(1000);
		
		exam.formatSettings();
		Thread.sleep(1000); 
	}

}
