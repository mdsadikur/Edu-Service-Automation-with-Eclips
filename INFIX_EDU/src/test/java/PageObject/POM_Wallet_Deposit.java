package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POM_Wallet_Deposit {
	
	WebDriver driver = null;
	
	public POM_Wallet_Deposit(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	//wallet deposit
	By wallet_deposit = By.xpath("//div[contains(text(),'Wallet Deposit')]");
	
	//pending deposit
	By pending_deposit = By.xpath("//a[contains(text(),'Pending Deposit')]");
	
	//approve deposit
	By approve_deposit = By.xpath("//a[contains(text(),'Approve Deposit')]");
	
	//reject deposit
	By reject_deposit = By.xpath("(//a[contains(text(),'Reject Deposit')])[1]");
	
	//wallet transaction
	By wallet_transaction = By.xpath("(//a[contains(text(),' Wallet Transaction')])[1]");
	
	//refund request
	By refund_request = By.xpath("//a[contains(text(),'Refund Request')]");
	
	//wallet report
	By wallet_report = By.xpath("//a[contains(text(),'Wallet Report')]");
	
	//date range
	By wallet_deposit_date_range = By.name("date_range");
	
	//wallet_deposit_date_range_apply
	By wallet_deposit_date_range_apply = By.xpath("(//button[contains(text(),'Apply')])");
	
	
	
	//select type
	By wallet_deposit_type = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div[2]/div/div/form/div/div[2]/div");
	
	//wallet deposit
	By wallet_dp_deposit = By.xpath("//li[contains(text(),'Deposit')]");
	
	//wallet deposit refund
	By wallet_deposit_refund = By.xpath("(//li[contains(text(),'Refund')])");
	
	//wallet deposit select status
	By wallet_deposit_Status = By.xpath("//span[contains(text(),'Select Status')]");
	
	//wallet deposit pending
	By wallet_deposit_pending = By.xpath("(//li[contains(text(),'Pending')])");
	
	//wallet deposit approve
	By wallet_deposit_approve = By.xpath("(//li[contains(text(),'Approve')])");
	
	//wallet deposit reject
	By wallet_deposit_reject = By.xpath("(//li[contains(text(),'Reject')])");
	
	//wallet deposit search
	By wallet_deposit_search = By.xpath("//button[@class='primary-btn small fix-gr-bg']");
	
	
	
	/*
	 * 
	 * 
	 * 
	 * 
	 */
	
	public void walletdepositdaterange() throws InterruptedException {
		
		//wallet_deposit_date_range
		driver.findElement(wallet_deposit_date_range).click();
		Thread.sleep(1000);
		
		//wallet_deposit_date_range_apply
		driver.findElement(wallet_deposit_date_range_apply).click();
		Thread.sleep(1000);
	}
	
	/*
	 * 
	 */
	
	public void wallet_deposit_Type_deposit() throws InterruptedException {
		
		//wallet_deposit_type
		driver.findElement(wallet_deposit_type).click();
		Thread.sleep(1000);
		
		//wallet_dp_deposit
		driver.findElement(wallet_dp_deposit).click();
		Thread.sleep(1000);
	}
	
	public void wallet_deposit_Type_refund() throws InterruptedException {
		
		//wallet_deposit_type
		driver.findElement(wallet_deposit_type).click();
		Thread.sleep(1000);
		
		//wallet_dp_deposit
		driver.findElement(wallet_deposit_refund).click();
		Thread.sleep(1000);
	}
	
	/*
	 * 
	 */
	
	public void wallet_deposit_Status_pending() throws InterruptedException {
		
		//wallet_deposit_Status
		driver.findElement(wallet_deposit_Status).click();
		Thread.sleep(1000);
		
		//wallet_deposit_pending
		driver.findElement(wallet_deposit_pending).click();
		Thread.sleep(1000);
	}
	
	public void wallet_deposit_Status_approve() throws InterruptedException {
		
		//wallet_deposit_Status
		driver.findElement(wallet_deposit_Status).click();
		Thread.sleep(1000);
		
		//wallet_deposit_pending
		driver.findElement(wallet_deposit_approve).click();
		Thread.sleep(1000);
	}
	
	public void wallet_deposit_Status_reject() throws InterruptedException {
		
		//wallet_deposit_Status
		driver.findElement(wallet_deposit_Status).click();
		Thread.sleep(1000);
		
		//wallet_deposit_pending
		driver.findElement(wallet_deposit_reject).click();
		Thread.sleep(1000);
	}
	
	public void clickWalletButton() throws InterruptedException {
		
		//wallet_deposit
		driver.findElement(wallet_deposit).click();
		Thread.sleep(1000);
		System.out.println("Successfully Showing wallet deposit");
		
		//pending_deposit
		driver.findElement(pending_deposit).click();
		Thread.sleep(1000);
		System.out.println("Successfully Showing pending deposit");
		
		//approve_deposit
		driver.findElement(approve_deposit).click();
		Thread.sleep(1000);
		System.out.println("Successfully Showing approve deposit");
		
		//reject_deposit
		driver.findElement(reject_deposit).click();
		Thread.sleep(1000);
		System.out.println("Successfully Showing reject deposit");
		
		//wallet_transaction
		driver.findElement(wallet_transaction).click();
		Thread.sleep(1000);
		System.out.println("Successfully Showing wallet transaction");
		
		//refund_request
		driver.findElement(refund_request).click();
		Thread.sleep(1000);
		System.out.println("Successfully Showing refund request");
		
		//wallet_report
		driver.findElement(wallet_report).click();
		Thread.sleep(1000);
		
		/*
		 * deposit pending
		 */
		
		//call walletdepositdaterange
		walletdepositdaterange();
		Thread.sleep(1000);
		
		//call wallet_deposit_Type_deposit
		wallet_deposit_Type_deposit();
		Thread.sleep(1000);
		
		//call wallet_deposit_Status_pending
		wallet_deposit_Status_pending();
		Thread.sleep(1000);
		
		//wallet_deposit_search
		driver.findElement(wallet_deposit_search).click();
		Thread.sleep(1000);
		System.out.println("Successfully Showing deposit pending");
		
		/*
		 * deposit approve
		 */
		
		//call walletdepositdaterange
		walletdepositdaterange();
		Thread.sleep(1000);
		
		//call wallet_deposit_Type_deposit
		wallet_deposit_Type_deposit();
		Thread.sleep(1000);
		
		//call wallet_deposit_Status_approve
		wallet_deposit_Status_approve();
		Thread.sleep(1000);
		
		//wallet_deposit_search
		driver.findElement(wallet_deposit_search).click();
		Thread.sleep(1000);
		System.out.println("Successfully Showing deposit approve");
		
		/*
		 * deposit reject
		 */
		
		//call walletdepositdaterange
		walletdepositdaterange();
		Thread.sleep(1000);
		
		//call wallet_deposit_Type_deposit
		wallet_deposit_Type_deposit();
		Thread.sleep(1000);
		
		//call wallet_deposit_Status_reject
		wallet_deposit_Status_reject();
		Thread.sleep(1000);
		
		//wallet_deposit_search
		driver.findElement(wallet_deposit_search).click();
		Thread.sleep(1000);
		System.out.println("Successfully Showing deposit reject");
	
	/*
	 * 
	 * deposit refund
	 * 
	 */
	
	/*
	 * refund pending
	 */
	
	//call walletdepositdaterange
	walletdepositdaterange();
	Thread.sleep(1000);
	
	//call wallet_deposit_Type_deposit
	wallet_deposit_Type_refund();
	Thread.sleep(1000);
	
	//call wallet_deposit_Status_pending
	wallet_deposit_Status_pending();
	Thread.sleep(1000);
	
	//wallet_deposit_search
	driver.findElement(wallet_deposit_search).click();
	Thread.sleep(1000);
	System.out.println("Successfully Showing refund pending");
	
	/*
	 * refund approve
	 */
	
	//call walletdepositdaterange
	walletdepositdaterange();
	Thread.sleep(1000);
	
	//call wallet_deposit_Type_deposit
	wallet_deposit_Type_refund();
	Thread.sleep(1000);
	
	//call wallet_deposit_Status_approve
	wallet_deposit_Status_approve();
	Thread.sleep(1000);
	
	//wallet_deposit_search
	driver.findElement(wallet_deposit_search).click();
	Thread.sleep(1000);
	System.out.println("Successfully Showing refund approve");
	
	/*
	 * refund reject
	 */
	
	//call walletdepositdaterange
	walletdepositdaterange();
	Thread.sleep(1000);
	
	//call wallet_deposit_Type_deposit
	wallet_deposit_Type_refund();
	Thread.sleep(1000);
	
	//call wallet_deposit_Status_reject
	wallet_deposit_Status_reject();
	Thread.sleep(1000);
	
	//wallet_deposit_search
	driver.findElement(wallet_deposit_search).click();
	Thread.sleep(1000);
	System.out.println("Successfully Showing refund reject");
	System.out.println("Checkout from Wallet deposit");
}
	

}
