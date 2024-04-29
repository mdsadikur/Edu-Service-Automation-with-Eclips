package TestCases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import Base.DriverSetup;
import PageObject.POM_Student_Info;



public class TC_Student_Info extends DriverSetup{
	
	
	@Test(priority=3)
	public void studentInfo() throws InterruptedException, AWTException {
		
		POM_Student_Info studentInfo= new POM_Student_Info(driver);
		
		
		
		studentInfo.studentCategory();
		Thread.sleep(1000);
		
		studentInfo.studentGroup();
		Thread.sleep(1000); 
		
		studentInfo.addStudent();
		Thread.sleep(1000);
		
		studentInfo.studentList();
		Thread.sleep(1000); 
		
		studentInfo.studentAttendance();
		Thread.sleep(1000); 
		
		studentInfo.studentAttendanceReport();
		Thread.sleep(1000); 
		
		studentInfo.subjectWiseAttendance();
		Thread.sleep(1000); 
		
		studentInfo.subjectAttendanceReport();
		Thread.sleep(1000); 
		
		studentInfo.studentPromote();
		Thread.sleep(1000); 
		
		studentInfo.disabledStudent();
		Thread.sleep(1000); 
		
		studentInfo.studentExport();
		Thread.sleep(1000); 
		
		studentInfo.smsSendingTime();
		Thread.sleep(1000); 
		
		studentInfo.studentSettings();
		Thread.sleep(1000);

	}

}

