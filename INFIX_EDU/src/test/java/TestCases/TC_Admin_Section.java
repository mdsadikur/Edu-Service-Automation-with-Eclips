package TestCases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import Base.DriverSetup;
import PageObject.POM_Admin_Section;

public class TC_Admin_Section extends DriverSetup{
	
	@Test(priority=13)
	
	public void TC_AdminSection() throws InterruptedException, AWTException {
		
		POM_Admin_Section cbox = new POM_Admin_Section(driver);
		
		//ClickadminSetpButton
		cbox.ClickadminSetpButton();
		Thread.sleep(1000);
		
		//ClickAdmissionQueryButton
		cbox.ClickAdmissionQueryButton();
		Thread.sleep(1000);
		
		//clickVisitorBookButton
		cbox.clickVisitorBookButton();
		Thread.sleep(1000);
		
		//clickcompaintButton
		cbox.clickcompaintButton();
		Thread.sleep(1000);
		
		//clickPostalReceiveButton
		cbox.clickPostalReceiveButton();
		Thread.sleep(1000);
		
		//clickPostalDispatchButton
		cbox.clickPostalDispatchButton();
		Thread.sleep(1000);
		
		//ClickPhoneCallLogButton
		cbox.ClickPhoneCallLogButton();
		Thread.sleep(1000);
		
		//clickStudentCertificateButton
		cbox.clickStudentCertificateButton();
		Thread.sleep(1000);
		
		
		//clickGenerateCertificate
		cbox.clickGenerateCertificate();
		Thread.sleep(1000);
		
		//clickIdCardButton
		cbox.clickIdCardButton();
		Thread.sleep(1000);
		
		//ClickGenerateIdButton
		cbox.ClickGenerateIdButton();
		Thread.sleep(1000);
	}

}
