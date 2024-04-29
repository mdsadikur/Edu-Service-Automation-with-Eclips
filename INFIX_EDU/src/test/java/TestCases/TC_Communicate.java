package TestCases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import Base.DriverSetup;
import PageObject.POM_Communicate;

public class TC_Communicate extends DriverSetup{
	
	@Test(priority=19)
	
	public void TC_communicate() throws InterruptedException, AWTException {
		
		POM_Communicate cbox = new POM_Communicate(driver);
		
		//clickNoticeboardButton
		cbox.clickNoticeBoardButton();
		Thread.sleep(1000);
		
		/*
		 * 
		 * Click Email/SMS
		 * 
		 */
		
//		//click email/ sms
//		cbox.clickEmail_SMSButton();
//		Thread.sleep(1000);
		
		/*
		 * 
		 * 
		 * clickEmail_SMS_logButton
		 * 
		 * 
		 */
						
		//clickEmail_SMS_logButton
		cbox.clickEmail_SMS_logButton();
		Thread.sleep(1000);
		
		//clickEvent Button
		cbox.clickEventButton();
		Thread.sleep(1000);
	}

}
