package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Common_Method.CommonMethod;


public class POM_Inventory {
	
	WebDriver d;
	
	CommonMethod cm = new CommonMethod();
	
	@FindBy(xpath="//div[contains(text(),'Inventory')]")
	WebElement inventory;
	
	//item Category
	@FindBy(xpath="//*[@id=\"subMenuInventory\"]/li[1]/a")
	WebElement itemCategory;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[1]/div/div/input")
	WebElement addCategory;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[2]/div/button")
	WebElement saveCategory;
	
	
	@FindBy(xpath="//*[@id=\"table_id\"]/tbody/tr[3]/td[3]/div/button")
	WebElement selectCategory;
	
	@FindBy(xpath="//*[@id=\"table_id\"]/tbody/tr[3]/td[3]/div/div/a[1]")
	WebElement editCategory;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div[2]/div[1]/div/div/form/div/div/div[2]/div/button")
	WebElement updateCategory;
	
	@FindBy(xpath="//*[@id=\"table_id\"]/tbody/tr[3]/td[3]/div/div/a[2]")
	WebElement deleteCategory;
	
	@FindBy(xpath="//*[@id=\"showDetaildModalBody\"]/div[2]/a/button")
	WebElement confirmDelete;
	
	
	//item List
	
	@FindBy(xpath="//*[@id=\"subMenuInventory\"]/li[2]/a")
	WebElement itemList;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[1]/div[1]/div/input")
	WebElement itemName;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[1]/div[2]/div/div/span")
	WebElement selectItemCategory;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[1]/div[2]/div/div/ul/li[3]")
	WebElement itemCategorySelection;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[2]/div/button/span")
	WebElement saveItemList;
	
	@FindBy(xpath="//*[@id=\"table_id\"]/tbody/tr[5]/td[5]/div/button")
	WebElement selectItem;
	
	@FindBy(xpath="//*[@id=\"table_id\"]/tbody/tr[5]/td[5]/div/div/a[1]")
	WebElement editItem;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div[2]/div[1]/div/div/form/div/div/div[2]/div/button")
	WebElement updateItem;
	
	@FindBy(xpath="//*[@id=\"table_id\"]/tbody/tr[5]/td[5]/div/div/a[2]")
	WebElement deleteItem;
	
	@FindBy(xpath="//*[@id=\"showDetaildModalBody\"]/div[2]/a/button")
	WebElement confirmDeleteItem;
	
	//item Store
	
	@FindBy(xpath="//*[@id=\"subMenuInventory\"]/li[3]/a")
	WebElement itemStore;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[1]/div[1]/div/input")
	WebElement storeName;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[1]/div[2]/div/input")
	WebElement storeNumber;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[2]/div/button")
	WebElement saveStore;
	
	@FindBy(xpath="//*[@id=\"table_id\"]/tbody/tr[5]/td[4]/div/button")
	WebElement selectStore;
	
	@FindBy(xpath="//*[@id=\"table_id\"]/tbody/tr[5]/td[4]/div/div/a[1]")
	WebElement editStore;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div[2]/div[1]/div/div/form/div/div/div[2]/div/button")
	WebElement updateStore;
	
	@FindBy(xpath="//*[@id=\"table_id\"]/tbody/tr[5]/td[4]/div/div/a[2]")
	WebElement deleteStore;
	
	@FindBy(xpath="//*[@id=\"showDetaildModalBody\"]/div[2]/a/button")
	WebElement confirmDeleteStore;
	
	//supplier
	
	@FindBy(xpath="//*[@id=\"subMenuInventory\"]/li[4]/a")
	WebElement supplier;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[1]/div[1]/div/input")
	WebElement companyName;
	
	@FindBy(xpath="//*[@id=\"company_address\"]")
	WebElement companyAddress;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[1]/div[3]/div/input")
	WebElement contactPersonName;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[2]/div/button/span")
	WebElement saveSupplier;
	
	@FindBy(xpath="//*[@id=\"table_id\"]/tbody/tr[2]/td[6]/div/button")
	WebElement selectSupplier;
	
	@FindBy(xpath="//*[@id=\"table_id\"]/tbody/tr[2]/td[6]/div/div/a[1]")
	WebElement editSupplier;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div[2]/div[1]/div/div/form/div/div/div[2]/div/button")
	WebElement updateSupplier;
	
	@FindBy(xpath="//*[@id=\"table_id\"]/tbody/tr[2]/td[6]/div/div/a[2]")
	WebElement deleteSupplier;
	
	@FindBy(xpath="//*[@id=\"showDetaildModalBody\"]/div[2]/a/button")
	WebElement confirmDeleteSupplier;
	
	//item receive
	@FindBy(xpath="//*[@id=\"subMenuInventory\"]/li[5]/a")
	WebElement itemReceive;
	
	@FindBy(xpath="//*[@id=\"item-receive-form\"]/div/div[1]/div/div/div[2]/div/div/div[1]/div/div[1]")
	WebElement expenseHead;
	
	@FindBy(xpath="//*[@id=\"item-receive-form\"]/div/div[1]/div/div/div[2]/div/div/div[1]/div/div[1]/ul/li[2]")
	WebElement selectexpenseHead;
	
	@FindBy(xpath="//*[@id=\"item-receive-form\"]/div/div[1]/div/div/div[2]/div/div/div[2]/div/div[1]")
	WebElement paymentMethod;
	
	@FindBy(xpath="//*[@id=\"item-receive-form\"]/div/div[1]/div/div/div[2]/div/div/div[2]/div/div[1]/ul/li[2]")
	WebElement selectPaymentMethod;
	
	@FindBy(xpath="//*[@id=\"item-receive-form\"]/div/div[1]/div/div/div[2]/div/div/div[4]/div/div[1]/span")
	WebElement selectSupplierList;
	
	@FindBy(xpath="//*[@id=\"item-receive-form\"]/div/div[1]/div/div/div[2]/div/div/div[4]/div/div[1]/ul/li[2]")
	WebElement supplierSelection;
	
	@FindBy(xpath="//*[@id=\"item-receive-form\"]/div/div[1]/div/div/div[2]/div/div/div[5]/div/div[1]")
	WebElement warehouse;
	
	@FindBy(xpath="//*[@id=\"item-receive-form\"]/div/div[1]/div/div/div[2]/div/div/div[5]/div/div[1]/ul/li[3]")
	WebElement selectWareHouse;
	
	@FindBy(xpath="//*[@id=\"row1\"]/td[1]/div/div/span")
	WebElement item;
	
	@FindBy(xpath="//*[@id=\"row1\"]/td[1]/div/div/ul/li[3]")
	WebElement itemSelection;
	
	@FindBy(xpath="//*[@id=\"unit_price1\"]")
	WebElement unitPrice;
	
	@FindBy(xpath="//*[@id=\"quantity1\"]")
	WebElement quantity;
	
	@FindBy(xpath="//*[@id=\"totalPaid\"]")
	WebElement totalPaid;
	
//	@FindBy(xpath="")
//	WebElement totalDue;
	
	@FindBy(xpath="//*[@id=\"item-receive-form\"]/div/div[2]/div[3]/div/div/div/div[1]/div/div/label")
	WebElement fullPaid;
	
	@FindBy(xpath="//*[@id=\"item-receive-form\"]/div/div[2]/div[3]/div/div/div/div[4]/button")
	WebElement receiveItem;
	
	//Item Receive List
	
	@FindBy(xpath="//*[@id=\"subMenuInventory\"]/li[6]/a")
	WebElement itemReceiveList;
	
	@FindBy(xpath="//*[@id=\"table_id\"]/tbody/tr[1]/td[1]")
	WebElement plusButton;
	
	@FindBy(xpath="//*[@id=\"table_id\"]/tbody/tr[2]/td/ul/li/span[2]/div/button")
	WebElement selectButton;
	
	@FindBy(xpath="//*[@id=\"table_id\"]/tbody/tr[2]/td/ul/li/span[2]/div/div/a[1]")
	WebElement viewButton;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div/div/div/div/div/div[2]/div/button")
	WebElement printButton;
	
	@FindBy(xpath="//*[@id=\"table_id\"]/tbody/tr[2]/td/ul/li/span[2]/div/div/a[2]")
	WebElement editButton;
	
	@FindBy(xpath="//*[@id=\"item-receive-form\"]/div/div[2]/div[3]/div/div/div/div[4]/button")
	WebElement updateButton;
	
	@FindBy(xpath="//*[@id=\"table_id\"]/tbody/tr[2]/td/ul/li/span[2]/div/div/a[3]")
	WebElement cancelButton;
	
	@FindBy(xpath="//*[@id=\"showDetaildModalBody\"]/div[2]/a/button")
	WebElement yesButton;
	
	//item Sell
	
	@FindBy(xpath="//*[@id=\"subMenuInventory\"]/li[7]/a")
	WebElement itemSell;
	
	@FindBy(xpath="//body[1]/div[2]/div[1]/section[2]/div[1]/div[1]/div[2]/a[1]")
	WebElement newItemSell;
	
	@FindBy(xpath="//body[1]/div[2]/div[1]/section[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]")
	WebElement incomeHead;
	
	@FindBy(xpath="//*[@id=\"item-sell-form\"]/div/div[1]/div/div/div[2]/div/div/div[1]/div[1]/ul/li[2]")
	WebElement selectIncomeHead;
	
	@FindBy(xpath="//*[@id=\"item-sell-form\"]/div/div[1]/div/div/div[2]/div/div/div[2]/div[1]")
	WebElement paymentMethodForSell;
	
	@FindBy(xpath="//*[@id=\"item-sell-form\"]/div/div[1]/div/div/div[2]/div/div/div[2]/div[1]/ul/li[2]")
	WebElement selectPaymentMethodForSell;
	
	@FindBy(xpath="//*[@id=\"item-sell-form\"]/div/div[1]/div/div/div[2]/div/div/div[4]/div[1]")
	WebElement sellTo;
	
	@FindBy(xpath="//*[@id=\"item-sell-form\"]/div/div[1]/div/div/div[2]/div/div/div[4]/div[1]/ul/li[3]")
	WebElement sellToUser;
	
	@FindBy(xpath="//*[@id=\"item-sell-form\"]/div/div[1]/div/div/div[2]/div/div/div[5]/div/div[1]/div[1]")
	WebElement selectClassForAddSell;
	
	@FindBy(xpath="//*[@id=\"item-sell-form\"]/div/div[1]/div/div/div[2]/div/div/div[5]/div/div[1]/div[1]/ul/li[2]")
	WebElement classSelectionForAddSell;
	
	@FindBy(xpath="//*[@id=\"select_section_div\"]/div[1]/span")
	WebElement selectSectionForAddSell;
	
	@FindBy(xpath="//*[@id=\"select_section_div\"]/div[1]/ul/li[3]")
	WebElement sectionSelectionForAddSell;
	
	@FindBy(xpath="//*[@id=\"select_student_div\"]/div[1]/span")
	WebElement selectStudentForAddSell;
	
	@FindBy(xpath="//body[1]/div[2]/div[1]/section[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/div[1]/div[3]/div[1]/ul[1]/li[3]")
	WebElement studentSelectionForAddSell;
	
	@FindBy(xpath="//*[@id=\"row1\"]/td[1]/div/div/span")
	WebElement selectItemForSell;
	
	@FindBy(xpath="//*[@id=\"row1\"]/td[1]/div/div/ul/li[3]")
	WebElement itemSelectionForSell;
	
	@FindBy(xpath="//*[@id=\"unit_price1\"]")
	WebElement sellPrice;
	
	@FindBy(xpath="//*[@id=\"quantity1\"]")
	WebElement sellQuantity;
	
	@FindBy(xpath="//*[@id=\"item-sell-form\"]/div/div[2]/div[3]/div/div/div/div[1]/div/div/label")
	WebElement fullPaidForSell;
	
	@FindBy(xpath="//*[@id=\"item-sell-form\"]/div/div[2]/div[3]/div/div/div/div[4]/button")
	WebElement sellButton;
	
	
	@FindBy(xpath="//*[@id=\"table_id\"]/tbody/tr/td[1]")
	WebElement plusButtonAtItemSell;
	
	@FindBy(xpath="//*[@id=\"table_id\"]/tbody/tr[2]/td/ul/li[2]/span[2]/div/button")
	WebElement selectButtonAtItemSell;
	
	@FindBy(xpath="//*[@id=\"table_id\"]/tbody/tr[2]/td/ul/li[2]/span[2]/div/div/a[1]")
	WebElement viewButtonAtItemSell;
	
	
	@FindBy(xpath="//*[@id=\"table_id\"]/tbody/tr[2]/td/ul/li[2]/span[2]/div/div/a[2]")
	WebElement editButtonAtItemSell;
	
	@FindBy(xpath="//*[@id=\"student-div\"]/div/div[1]/div[1]")
	WebElement selectClassForSell;
	
	@FindBy(xpath="//*[@id=\"student-div\"]/div/div[1]/div[1]/ul/li[2]")
	WebElement classSelectionForSell;
	
	@FindBy(xpath="//*[@id=\"select_section_div\"]/div[1]")
	WebElement selectSectionForsell;
	
	@FindBy(xpath="//*[@id=\"select_section_div\"]/div[1]/ul/li[3]")
	WebElement sectionSelectionForSell;
		
	
	@FindBy(xpath="//*[@id=\"edit-item-sell-form\"]/div/div[2]/div[3]/div/div/div/div[4]/button")
	WebElement updateButtonAtItemSell;
	
	@FindBy(xpath="//*[@id=\"table_id\"]/tbody/tr[2]/td/ul/li[2]/span[2]/div/div/a[3]")
	WebElement cancelButtonAtItemSell;
	
	@FindBy(xpath="//*[@id=\"showDetaildModalBody\"]/div[2]/a/button")
	WebElement yesButtonAtItemSell;
	
	//item Issue
	
	@FindBy(xpath="//*[@id=\"subMenuInventory\"]/li[8]/a")
	WebElement itemIssue;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[1]/div[1]/div")
	WebElement userType;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[1]/div[1]/div/ul/li[3]")
	WebElement selectUserType;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[1]/div[2]/div/div[1]/div")
	WebElement selectClassForIssue;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[1]/div[2]/div/div[1]/div/ul/li[2]")
	WebElement classSelectionForIssue;
	
	@FindBy(xpath="//*[@id=\"select_section_div\"]/div[1]")
	WebElement selectSectionForIssue;
	
	@FindBy(xpath="//*[@id=\"select_section_div\"]/div[1]/ul/li[3]")
	WebElement sectionselectionForIssue;
	
	@FindBy(xpath="//*[@id=\"select_student_div\"]/div[1]")
	WebElement selectStudentForIssue;
	
	@FindBy(xpath="//*[@id=\"select_student_div\"]/div[1]/ul/li[2]")
	WebElement studentSelectionForIssue;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[4]/div[1]/div/span")
	WebElement itemCategorySelect;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[4]/div[1]/div/ul/li[3]")
	WebElement selectionItemCategory;
	
	@FindBy(xpath="//*[@id=\"selectItemsDiv\"]/div")
	WebElement selectItemName;
	
	@FindBy(xpath="//*[@id=\"selectItemsDiv\"]/div/ul/li[2]")
	WebElement itemNameSelection;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[4]/div[3]/div/input")
	WebElement quantityNumber;
	
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[5]/div/button")
	WebElement saveIssue;
	
	@FindBy(xpath="//*[@id=\"table_id\"]/tbody/tr/td[1]")
	WebElement plusButtonAtIssue;
	
	@FindBy(xpath="//*[@id=\"table_id\"]/tbody/tr[2]/td/ul/li[3]/span[2]/div/button")
	WebElement selectButtonAtIssue;
	
	
	@FindBy(xpath="//*[@id=\"table_id\"]/tbody/tr[2]/td/ul/li[3]/span[2]/div/div/a")
	WebElement returnButton;
	
	@FindBy(xpath="//*[@id=\"showDetaildModalBody\"]/div[2]/a/button")
	WebElement confirmReturn;
	
	
	
	
	public POM_Inventory(WebDriver driver) {
		
		d= driver;
		PageFactory.initElements(d, this);		
	}
	
	public void itemCategory() throws InterruptedException {
		
		inventory.click();
		Thread.sleep(1000);
		
		itemCategory.click();
		Thread.sleep(1000);
		System.out.println("Successfully Enter in Item category");
		
		addCategory.sendKeys("Test");
		Thread.sleep(1000);
		
		saveCategory.click();
		Thread.sleep(1000);
		
		itemCategoryActions();
		System.out.println("Successfully complete item category");
		
		
		
	}
	
	public void itemList() throws InterruptedException {
		
//		inventory.click();
//		Thread.sleep(1000);
		
		itemList.click();
		Thread.sleep(1000);
		System.out.println("Successfully Enter in item list");
		
		itemName.sendKeys("RFL Table");
		Thread.sleep(1000);
		
		selectItemCategory.click();
		Thread.sleep(1000);
		
		itemCategorySelection.click();
		Thread.sleep(1000);
		
		saveItemList.click();
		Thread.sleep(1000);
		
		itemListActions();
		System.out.println("Successfully complete item list");

		
	}
	
	public void itemStore() throws InterruptedException {
		
//		inventory.click();
//		Thread.sleep(1000);
		
		itemStore.click();
		Thread.sleep(1000);
		System.out.println("Successfully Enter in item store");
		
		storeName.sendKeys("Demo Store");
		Thread.sleep(1000);
		
		storeNumber.sendKeys("2");
		Thread.sleep(1000);
		
		saveStore.click();
		Thread.sleep(1000);
		
		itemStoreAction();
		System.out.println("Successfully complete item store");
		
	}
	
	public void supplier() throws InterruptedException {
		
//		inventory.click();
//		Thread.sleep(1000);
		
		supplier.click();
		Thread.sleep(1000);
		System.out.println("Successfully Enter in supplier");
		
		addSupplier();
		
		supplierActions();
		System.out.println("Successfully complete supplier");
		
		
	}
	
	public void itemReceive() throws InterruptedException {
		
//		inventory.click();
//		Thread.sleep(1000);
		
		itemReceive.click();
		Thread.sleep(1000);
		System.out.println("Successfully Enter in item received");
		
		addReceive();
		
		System.out.println("Successfully complete item received");
		
		
	}
	
	public void itemReceiveList() throws InterruptedException {
		
//		inventory.click();
//		Thread.sleep(1000);
		
		itemReceiveList.click();
		Thread.sleep(1000);
		System.out.println("Successfully Enter in item received list");
		
		
		int size= d.findElements(By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr/td[9]/button[1]")).size();
		//body[1]/div[2]/div[1]/section[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[9]/button[1]
		System.out.println(size);
		//Thread.sleep(1000);

		int i=1;
		int paid= 0;
		int refund= 0;
		int partial= 0;
		
		while(i<size) {
			
			String text= d.findElement(By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr["+i+"]/td[9]/button[1]")).getText();
			
			if(text.matches("PAID") && paid == 0) {
				
				
					paid(i);
					paid=1;
					
					Thread.sleep(2000);
					
				}
				

			
			else if(text.matches("REFUND") && refund==0) {
				
				
					
					refund(i);
					refund=1;
			
				
				
				
			}
			
			else if(text.matches("PARTIAL") && partial==0) {
				
				
					
					partial(i);
					partial=1;
			
	

			}
			
			
			
			i++;	
		}
		
		System.out.println("Successfully complete item received list");
		
	}
	
	public void itemSell() throws InterruptedException {
		
//		inventory.click();
//		Thread.sleep(1000);
		
		itemSell.click();
		Thread.sleep(1000);
		
		
		
		
		int i=2;
		
		while(i<=3) {
			
			newItemSell.click();
			Thread.sleep(1000);
			
			incomeHead.click();
			Thread.sleep(1000);
			selectIncomeHead.click();
			
			paymentMethodForSell.click();
			Thread.sleep(1000);
			selectPaymentMethodForSell.click();
			
			sellTo.click();
			Thread.sleep(1000);
			
			String text= d.findElement(By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li["+i+"]")).getText();
			System.out.println(text);
			
			if(i==2) {
				
				d.findElement(By.xpath("//*[@id=\"item-sell-form\"]/div/div[1]/div/div/div[2]/div/div/div[4]/div[1]/ul/li[2]")).click();
				Thread.sleep(1000);
				
				d.findElement(By.xpath("//*[@id=\"selectStaffsDiv\"]/div[1]")).click();
				Thread.sleep(1000);
				
				d.findElement(By.xpath("//*[@id=\"selectStaffsDiv\"]/div[1]/ul/li[2]")).click();
				Thread.sleep(1000);
			}
			
			else {
				
				sellToUser.click();
				
				selectClassForAddSell.click();
				Thread.sleep(1000);
				classSelectionForAddSell.click();
				
				selectSectionForAddSell.click();
				Thread.sleep(1000);
				sectionSelectionForAddSell.click();
				
				
				selectStudentForAddSell.click();
				Thread.sleep(1000);
				studentSelectionForAddSell.click();
				
			}
			
			selectItemForSell.click();
			Thread.sleep(1000);
			itemSelectionForSell.click();
			
			
			sellPrice.sendKeys("200");
			Thread.sleep(1000);
			
			sellQuantity.sendKeys("0");
			Thread.sleep(1000);
			
			fullPaidForSell.click();
			Thread.sleep(1000);
			
			sellButton.click();
			Thread.sleep(1000);
			
			i++;
		}
		
		//cm.scroll();
		Thread.sleep(3000);
		
		
		int size= d.findElements(By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr/td[10]/button[1]")).size();
		System.out.println(size);
		int j=1;
		int paid=0;
		int refund=0;
		int partial=0;
		
		
		while(true) {
			
			//d.findElement(By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr["+i+"]/td[1]")).click();
			String status= d.findElement(By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr["+j+"]/td[10]")).getText();
			
			System.out.println(status);
			
			if(status.matches("PAID") && paid==0) {
				
				itemSellActions(j);
				paid=1;
			}
			
			else if (status.matches("REFUND") && refund==0) {
				
				itemSellActions(j);
				refund=1;
			}
			
			else if(status.matches("PARTIAL") && partial==0){
				
				itemSellActions(j);
				partial=1;
			}
			
			j++;	
			
			int sizeinloop= d.findElements(By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr/td[10]/button[1]")).size();
			
			if(j>sizeinloop) {
				
				break;
			}
		
			
			
			
		}
		
		
		
		
		
		
		

		/*
		
		plusButtonAtItemSell.click();
		Thread.sleep(1000);
		
		
		selectButtonAtItemSell.click();
		Thread.sleep(1000);
		
		viewButtonAtItemSell.click();
		Thread.sleep(1000);
		
		cm.scroll();
		Thread.sleep(1000);
		
		//printButton.click();
		//Thread.sleep(1000);
		
		d.navigate().back();
		Thread.sleep(1000);
		
		plusButtonAtItemSell.click();
		Thread.sleep(1000);
		
		selectButtonAtItemSell.click();
		Thread.sleep(1000);
		
		editButtonAtItemSell.click();
		Thread.sleep(1000);
		
		selectClassForSell.click();
		Thread.sleep(1000);
		
		classSelectionForSell.click();
		Thread.sleep(1000);
		
		selectSectionForsell.click();
		Thread.sleep(1000);
		
		sectionSelectionForSell.click();
		Thread.sleep(1000);
		
		updateButtonAtItemSell.click();
		Thread.sleep(1000);
		
		plusButtonAtItemSell.click();
		Thread.sleep(1000);
		
		selectButtonAtItemSell.click();
		Thread.sleep(1000);
		
		cancelButtonAtItemSell.click();
		Thread.sleep(1000);
		
		d.getWindowHandle();
		
		yesButtonAtItemSell.click();
		Thread.sleep(1000);  */
	}
	
	
	public void itemIssue() throws InterruptedException {
		
//		inventory.click();
//		Thread.sleep(1000);
		
		itemIssue.click();
		Thread.sleep(1000);
		
		itemIssueCondition();
		
		
		int i=1;
		
		int issued=0;
		int returned=0;
		
		int size= d.findElements(By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr/td[8]/button[1]")).size();
		
		
		while(i<=size) {
			
			String text= d.findElement(By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr["+i+"]/td[8]/button[1]")).getText();
			
			if(text.matches("ISSUED")  && issued==0) {
				
				d.findElement(By.xpath("//*[@id=\"table_id\"]/tbody/tr["+i+"]/td[1]")).click();
				Thread.sleep(1000);
				
				d.findElement(By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr["+(i+1)+"]/td[1]/ul[1]/li[1]/span[2]/div[1]/button[1]")).click();
				Thread.sleep(1000);
				
				d.findElement(By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr["+(i+1)+"]/td[1]/ul[1]/li[1]/span[2]/div[1]/div[1]/a[1]")).click();
				Thread.sleep(1000);
				
				d.getWindowHandle();
				
				d.findElement(By.xpath("//body[1]/div[3]/div[1]/div[1]/div[2]/div[2]/a[1]/button[1]")).click();
				Thread.sleep(1000);
				
				issued=1;
					
				
			}
			
			else if(text.matches("RETURNED") && returned==0){
				
				System.out.println(text);
				returned=1;
				Thread.sleep(1000);
			}
			
			i++;
		}
		
//		plusButtonAtIssue.click();
//		Thread.sleep(1000);
//		
//	selectButtonAtIssue.click();
//		Thread.sleep(1000);
//		
//		returnButton.click();
//		Thread.sleep(1000);
//		
//		d.getWindowHandle();
//		
//		confirmReturn.click();
//		Thread.sleep(1000);
		
		System.out.println("Checkout from Inventory");
		
	}
	
	public void itemCategoryActions() throws InterruptedException {
		
		selectCategory.click();
		Thread.sleep(1000);
//		
		editCategory.click();
		Thread.sleep(1000);
		
		updateCategory.click();
		Thread.sleep(1000);
		
		
		selectCategory.click();
		Thread.sleep(1000);
		
		deleteCategory.click();
		Thread.sleep(1000);
		
		d.getWindowHandle();
		
		confirmDelete.click();
		Thread.sleep(1000);
		
	}
	
	public void itemListActions() throws InterruptedException {
		
		selectItem.click();
		Thread.sleep(1000);
		
		editItem.click();
		Thread.sleep(1000);
		
		updateItem.click();
		Thread.sleep(1000);
		
		selectItem.click();
		Thread.sleep(1000);
		
		deleteItem.click();
		Thread.sleep(1000);
		
		d.getWindowHandle();
		
		confirmDeleteItem.click();
		Thread.sleep(1000);
		
	}
	
	public void itemStoreAction() throws InterruptedException {
		
		selectStore.click();
		Thread.sleep(1000);
		
		editStore.click();
		Thread.sleep(1000);
		
		updateStore.click();
		Thread.sleep(1000);
		
		selectStore.click();
		Thread.sleep(1000);
		
		deleteStore.click();
		Thread.sleep(1000);
		
		d.getWindowHandle();
		
		confirmDeleteStore.click();
		Thread.sleep(1000);
		
		
	}
	
	public void addSupplier() throws InterruptedException {
		companyName.sendKeys("Test Company");
		Thread.sleep(1000);
		
		companyAddress.sendKeys("Demo Address");
		Thread.sleep(1000);
		
		contactPersonName.sendKeys("Test Name");
		Thread.sleep(1000);
		
		saveSupplier.click();
		Thread.sleep(1000);
		
	}
	
	public void supplierActions() throws InterruptedException {
		
		selectSupplier.click();
		Thread.sleep(1000);
		
		editSupplier.click();
		Thread.sleep(1000);
		
		updateSupplier.click();
		Thread.sleep(1000);
		
		selectSupplier.click();
		Thread.sleep(1000);
		
		deleteSupplier.click();
		Thread.sleep(1000);
		
		d.getWindowHandle();
		
		confirmDeleteSupplier.click();
		Thread.sleep(1000);
		
	}
	
	public void addReceive() throws InterruptedException {
		expenseHead.click();
		Thread.sleep(1000);
		
		selectexpenseHead.click();
		Thread.sleep(1000);
		
		paymentMethod.click();
		Thread.sleep(1000);
		
		selectPaymentMethod.click();
		Thread.sleep(1000);
		
		selectSupplierList.click();
		Thread.sleep(1000);
		
		supplierSelection.click();
		Thread.sleep(1000);
		
		warehouse.click();
		Thread.sleep(1000);
		
		selectWareHouse.click();
		Thread.sleep(1000);
		
		item.click();
		Thread.sleep(1000);
		
		itemSelection.click();
		Thread.sleep(1000);
		
		String price= "100" ;
		unitPrice.sendKeys(price);
		Thread.sleep(1000);
		int unitPrice= Integer.parseInt(price);
		
		
		String quan= "5";
		quantity.sendKeys(quan);
		Thread.sleep(1000);
		int quantity= Integer.parseInt(quan);
		
		int totalPaidPrice= ((unitPrice*quantity)-100);
		
		System.out.println(totalPaidPrice);
		
		String paid= Integer.toString(totalPaidPrice);
		
		
		totalPaid.clear();
		totalPaid.sendKeys(paid);
		
//		fullPaid.click();
//		Thread.sleep(1000);
		
		receiveItem.click();
		Thread.sleep(1000);
		
		
	}
	
	public void paid(int i) throws InterruptedException {
		
//		d.findElement(By.xpath("//*[@id=\"table_id_filter\"]/label/input")).sendKeys("Test Company");
//		Thread.sleep(1000);
		//plus button
//		d.findElement(By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr["+i+"]/td[1]")).click();
//		Thread.sleep(1000);
		
		
		//select button
		d.findElement(By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr["+i+"]/td[10]/div[1]/button[1]")).click();
		Thread.sleep(1000);
		
		//view button
		d.findElement(By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr["+i+"]/td[10]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(1000);
		d.navigate().back();
		Thread.sleep(1000);
		
		
		//plus button
//		d.findElement(By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr["+i+"]/td[1]")).click();
//		Thread.sleep(1000);
		
		
		//select button
		d.findElement(By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr["+i+"]/td[10]/div[1]/button[1]")).click();
		Thread.sleep(1000);
		
		
		
		String text= d.findElement(By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr["+i+"]/td[10]/div[1]/div[1]/a[2]")).getText();
		System.out.println(text);
		
		
		if(text.matches("EDIT")) {
			//edit button
			d.findElement(By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr["+i+"]/td[10]/div[1]/div[1]/a[2]")).click();
			//update button
			d.findElement(By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/form[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[4]/button[1]")).click();
			Thread.sleep(1000);
			
			d.findElement(By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr["+i+"]/td[10]/div[1]/button[1]")).click();
			Thread.sleep(1000);
			
			
			//cancel button
			d.findElement(By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr["+i+"]/td[10]/div[1]/div[1]/a[3]")).click();
			Thread.sleep(1000);
			d.getWindowHandle();
//			
//			//yes button
			d.findElement(By.xpath("//*[@id=\"showDetaildModalBody\"]/div[2]/a/button")).click();
			Thread.sleep(1000);
		}
		
		else { 
			
			//cancel button
			d.findElement(By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr["+i+"]/td[10]/div[1]/div[1]/a[2]")).click();
			Thread.sleep(1000);
			d.getWindowHandle();
//			
//			//yes button
			d.findElement(By.xpath("//*[@id=\"showDetaildModalBody\"]/div[2]/a/button")).click();
			Thread.sleep(1000);
			
		}
		

	
	}
	
	public void refund(int i) throws InterruptedException {
		
		//plus button
//		d.findElement(By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr["+i+"]/td[1]")).click();
//		Thread.sleep(1000);
		
		
		//select button
		d.findElement(By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr["+i+"]/td[10]/div[1]/button[1]")).click();
		Thread.sleep(1000);
		
		//view button
		d.findElement(By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr["+i+"]/td[10]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(1000);   
		d.navigate().back();
		Thread.sleep(1000);
		
		//plus button
//		d.findElement(By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr["+i+"]/td[1]")).click();
//		Thread.sleep(1000);
		
		
		//select button
		d.findElement(By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr["+i+"]/td[10]/div[1]/button[1]")).click();
		Thread.sleep(1000);
		// view payment 
		d.findElement(By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr["+i+"]/td[10]/div[1]/div[1]/a[2]")).click();
		d.getWindowHandle();
		Thread.sleep(1000);
		
		//cross button
		d.findElement(By.xpath("//body[1]/div[3]/div[1]/div[1]/div[1]/button[1]")).click();
		Thread.sleep(1000);
		
		//plus button
//		d.findElement(By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr["+i+"]/td[1]")).click();
//		Thread.sleep(1000);
	}
	
	public void partial(int i) throws InterruptedException {
		
		//plus button
//		d.findElement(By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr["+i+"]/td[1]")).click();
//		Thread.sleep(1000);
		
		
		//select button
		d.findElement(By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr["+i+"]/td[10]/div[1]/button[1]")).click();
		Thread.sleep(1000);
		
		
		// add payment 
		d.findElement(By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr["+i+"]/td[10]/div[1]/div[1]/a[3]")).click();
		
		d.getWindowHandle();
		Thread.sleep(1000);
		
		d.findElement(By.xpath("//*[@id=\"reference_no\"]")).sendKeys("random");
		d.findElement(By.xpath("//*[@id=\"showDetaildModalBody\"]/div/form/div/div[2]/div/input")).click();
		Thread.sleep(1000);
		
	}
	
	
	public void itemSellActions(int j) throws InterruptedException {
		
		
		//select button
		d.findElement(By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr["+j+"]/td[11]/div[1]/button[1]")).click();
		Thread.sleep(1000);
		
		//view button
		d.findElement(By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr["+j+"]/td[11]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(1000);
		d.navigate().back();
		
		//select button
		d.findElement(By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr["+j+"]/td[11]/div[1]/button[1]")).click();
		Thread.sleep(1000);
		
		//edit button
		d.findElement(By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr["+j+"]/td[11]/div[1]/div[1]/a[2]")).click();
		Thread.sleep(1000);
		
		//update button
		d.findElement(By.xpath("//button[@class='primary-btn fix-gr-bg'][1]")).click();
		
		Thread.sleep(2000);
		
		
		//select button
		d.findElement(By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr["+j+"]/td[11]/div[1]/button[1]")).click();
		Thread.sleep(1000);
		
		
		//view payment
		String viewPayment=d.findElement(By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr["+j+"]/td[11]/div[1]/div[1]/a[3]")).getText();
		
		if(viewPayment.matches("VIEW PAYMENT")) {
			
			
			// view payment
			d.findElement(By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr["+j+"]/td[11]/div[1]/div[1]/a[3]")).click();
			Thread.sleep(1000);
			
			d.getWindowHandle();
			
			//cross button
			d.findElement(By.xpath("//body[1]/div[3]/div[1]/div[1]/div[1]/button[1]")).click();
			Thread.sleep(1000);
			//select button
			d.findElement(By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr["+j+"]/td[11]/div[1]/button[1]")).click();
			Thread.sleep(1000);
			
			//delete button
			d.findElement(By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr["+j+"]/td[11]/div[1]/div[1]/a[4]")).click();
			
			
			//yes button
			d.findElement(By.xpath("//body[1]/div[3]/div[1]/div[1]/div[2]/div[2]/a[1]/button[1]"));
			
			
		}
		
		else {
			
			//delete button
			d.findElement(By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr["+j+"]/td[11]/div[1]/div[1]/a[3]")).click();
			Thread.sleep(1000);
			
			d.getWindowHandle();
			//yes button
			d.findElement(By.xpath("//body[1]/div[3]/div[1]/div[1]/div[2]/div[2]/a[1]/button[1]")).click();
			Thread.sleep(1000);
			
		}
		

		
	}
	
	public void itemIssueCondition() throws InterruptedException {
		
		
		
		int i=3;
		
		//body[1]/div[2]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]
		while(i<=4) {
			
			String text= d.findElement(By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li["+i+"]")).getText();
			System.out.println(text);
			
			
			if(i==3) {
				
				userType.click();
				Thread.sleep(1000);
				selectUserType.click();
				
				selectClassForIssue.click();
				Thread.sleep(1000);
				classSelectionForIssue.click();
				
				selectSectionForIssue.click();
				Thread.sleep(1000);
				sectionselectionForIssue.click();
				
				selectStudentForIssue.click();
				Thread.sleep(1000);
				studentSelectionForIssue.click();
				
			    
				
				
				
				
			}
			
			else {
				
				userType.click();
				Thread.sleep(1000);
				
				//teacher select
				d.findElement(By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[4]")).click();
				Thread.sleep(1000);
				
				
				//teacher name
				d.findElement(By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/div[1]")).click();
				Thread.sleep(1000);
				d.findElement(By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[2]")).click();

				
				
			}
			
			
			itemCategorySelect.click();
			Thread.sleep(1000);
			selectionItemCategory.click();
			
			selectItemName.click();
			Thread.sleep(1000);
			itemNameSelection.click();
			
			quantityNumber.sendKeys("1");
			Thread.sleep(1000);
			
			saveIssue.click();
			Thread.sleep(1000);
			
			i++;
			
		} 
	}

}
