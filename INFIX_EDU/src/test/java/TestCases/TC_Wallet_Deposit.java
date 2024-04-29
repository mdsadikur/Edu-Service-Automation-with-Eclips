package TestCases;

import org.testng.annotations.Test;

import Base.DriverSetup;
import PageObject.POM_Wallet_Deposit;

public class TC_Wallet_Deposit extends DriverSetup{
	
	@Test(priority=22)
	public void TC_wallet_Deposit() throws InterruptedException {
		
		POM_Wallet_Deposit cbox = new POM_Wallet_Deposit(driver);
		
		//clickWalletButton
		cbox.clickWalletButton();
		Thread.sleep(1000);
		
	}

}
