package TestCases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import Base.DriverSetup;
import PageObject.POM_Fees;

public class TC_Fees extends DriverSetup{
	
	@Test(priority=21)
	public void TC_FEES() throws InterruptedException, AWTException {
		
		POM_Fees cbox = new POM_Fees(driver);
		
		//clickFeesGroupButton
		cbox.clickFeesGroupButton();
		Thread.sleep(1000);
		
		//clickfees_typeButton
		cbox.clickfees_typeButton();
		Thread.sleep(1000);
		
		//ClickfeesInvoice_addFeesButton
		cbox.ClickfeesInvoice_addFeesButton();
		Thread.sleep(1000);
		
		//clickFeesinvoiceButton
		cbox.clickFeesinvoiceButton();
		Thread.sleep(1000);
		
		//clickBank_paymentButton
		cbox.clickBank_paymentButton();
		Thread.sleep(1000);
		
		//clickfees_invoice_settingButton
		cbox.clickfees_invoice_settingButton();
		Thread.sleep(1000);
		
		//clickreportButton
		cbox.clickreportButton();
		Thread.sleep(1000);
	}

}
