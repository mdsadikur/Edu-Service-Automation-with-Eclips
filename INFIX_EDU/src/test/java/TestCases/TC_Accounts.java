package TestCases;

import java.awt.AWTException;


import org.testng.annotations.Test;

import Base.DriverSetup;
import PageObject.POM_Accounts;

public class TC_Accounts extends DriverSetup{
	
	@Test(priority=20)
	public void TC_ACcounts() throws InterruptedException, AWTException {
		
		POM_Accounts cbox = new POM_Accounts(driver);
		
		//clickcharto_faccount
		cbox.clickchartofaccount();
		Thread.sleep(1000);
		
		//clickBankaccountButton
		cbox.clickBankaccountButton();
		Thread.sleep(1000);
		
		//clickIncomeButton
		cbox.clickIncomeButton();
		Thread.sleep(1000);
		
		//clickincomeandprofitButton
		cbox.clickincomeandprofitButton();
		Thread.sleep(1000);
		
		//ClickExpenseButton
		cbox.ClickExpenseButton();
		Thread.sleep(1000);
		
		//clickFundTransferButton
		cbox.clickFundTransferButton();
		Thread.sleep(1000);
		
		//clickFineReportButton
		cbox.clickFineReportButton();
		Thread.sleep(1000);
		
		//clickpayrollreportButton
		cbox.clickpayrollreportButton();
		Thread.sleep(1000);
		
		//clickTransactionButton
		cbox.clickTransactionButton();
		Thread.sleep(1000);
		
	}

}
