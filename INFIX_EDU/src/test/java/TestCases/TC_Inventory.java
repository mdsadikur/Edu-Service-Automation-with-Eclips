package TestCases;

import org.testng.annotations.Test;

import PageObject.POM_Inventory;



public class TC_Inventory extends Base.DriverSetup{
	
	
	@Test(priority=11)
	public void inventory() throws InterruptedException {
		
		POM_Inventory item = new POM_Inventory(driver);
		
		
		
		item.itemCategory();
		Thread.sleep(1000);
		
		item.itemList();
		Thread.sleep(1000);
		
		
		item.itemStore();
		Thread.sleep(1000);
		
		item.supplier();
		Thread.sleep(1000); 
		
		item.itemReceive();
		Thread.sleep(1000);
		
		item.itemReceiveList();
		Thread.sleep(1000); 
		
		item.itemSell();
		Thread.sleep(1000);
	
		item.itemIssue();
		Thread.sleep(1000);
	}

}
