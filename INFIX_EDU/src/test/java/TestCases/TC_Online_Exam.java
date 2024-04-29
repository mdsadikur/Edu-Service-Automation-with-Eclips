package TestCases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import Base.DriverSetup;
import PageObject.POM_Online_Exam;

public class TC_Online_Exam extends DriverSetup{
	
	@Test(priority=7)
	public void Online_Exam() throws InterruptedException, AWTException {
		
		POM_Online_Exam cbox = new POM_Online_Exam(driver);
		
		//onlineexam
		cbox.clickonlineexambutton();
		Thread.sleep(1000);
		
		//QuestionBank
		cbox.ClickQuestionBank();
		Thread.sleep(1000);
		
		//clickSelectButton
		cbox.clickSelectButton();
		Thread.sleep(1000);
		
		//clickonline exam
		cbox.OnlineClass();
		Thread.sleep(1000);
	}

}
