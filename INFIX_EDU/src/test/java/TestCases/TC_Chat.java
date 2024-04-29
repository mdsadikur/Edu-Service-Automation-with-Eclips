package TestCases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import Base.DriverSetup;
import PageObject.Pom_Chat;


public class TC_Chat extends DriverSetup {
	@Test(priority=18)
	
	public void TC_chat() throws AWTException, InterruptedException {
		Pom_Chat cbox = new Pom_Chat(driver);
		
		cbox.chatbox();
		Thread.sleep(2000);
		
		cbox.invitiation();
		Thread.sleep(2000);
		
		cbox.blockeduser();
		Thread.sleep(2000);
	}

}
