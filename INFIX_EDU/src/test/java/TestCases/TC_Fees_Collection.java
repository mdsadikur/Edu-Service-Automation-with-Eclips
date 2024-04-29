package TestCases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import Base.DriverSetup;
import PageObject.POM_Fees_Collection;

public class TC_Fees_Collection extends DriverSetup{
	
	@Test
	public void TC_Fees_collection() throws InterruptedException, AWTException {
		
		POM_Fees_Collection cbox = new POM_Fees_Collection(driver);
		
		//clickFeesGroupButton
		cbox.clickFeesGroupButton();
		Thread.sleep(1000);
		
		//clickfees_typeButton
		cbox.clickfees_typeButton();
		Thread.sleep(1000);
		
		//clickfees_masterButton
		cbox.clickfees_masterButton();
		Thread.sleep(1000);
		
		//clickfees_discountButton
		cbox.clickfees_discountButton();
		Thread.sleep(1000);
		
		//clickcollection_feesButton
		cbox.clickcollection_feesButton();
		Thread.sleep(1000);
		
		//clicksearch_fees_paymentButton
		cbox.clicksearch_fees_paymentButton();
		Thread.sleep(1000);
		
		//clicksearch_fees_dueButton
		cbox.clicksearch_fees_dueButton();
		Thread.sleep(1000);
		
		//clickfees_collection_bank_paymentButton
		cbox.clickfees_collection_bank_paymentButton();
		Thread.sleep(1000);
		
		//clickfees_carryforwardButton
		cbox.clickfees_carryforwardButton();
		Thread.sleep(1000);
		
		//clickcollection_reportButton
		cbox.clickcollection_reportButton();
		Thread.sleep(1000);
		
	}

}
