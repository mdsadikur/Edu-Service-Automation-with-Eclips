package TestCases;

import org.testng.annotations.Test;

import Base.DriverSetup;
import PageObject.POM_Bulk_Print;

public class TC_Bulk_Print extends DriverSetup{
	
	@Test(priority=17)
	public void TC_BulkPrint() throws InterruptedException {
		
		POM_Bulk_Print cbox = new POM_Bulk_Print(driver);
		
		//ClickGenerateIdButton
		cbox.ClickGenerateIdButton();
		Thread.sleep(1000);
		
		//clickGenerateCertificate
		cbox.clickGenerateCertificate();
		Thread.sleep(1000);
		
		//clickpayroll_bulk_printButton
		cbox.clickpayroll_bulk_printButton();
		Thread.sleep(1000);
		
		//clickfees_invoice_bulk_printButton
		cbox.clickfees_invoice_bulk_printButton();
		Thread.sleep(1000);
	}

}
