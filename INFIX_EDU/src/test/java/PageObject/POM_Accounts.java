package PageObject;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Common_Method.CommonMethod;

public class POM_Accounts {
	WebDriver driver = null;

	public POM_Accounts(WebDriver driver) {

		this.driver = driver;
	}
	
	CommonMethod upload = new CommonMethod();

	// Accounts
	By accounts = By.xpath("//div[contains(text(),'Accounts')]");

	// Chart of Account
	By chartofAccount = By.xpath("//a[contains(text(),'Chart Of Account')]");

	// input head
	By inputhead = By.name("head");

	// acounts type
	By accountstype = By
			.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[2]/div/div");

	// account specific type
	By accountspecifictypeExpense = By.xpath("//li[contains(text(),'Expense')]");

	// account specific type
	By accountspecifictypeIncome = By.xpath("//li[contains(text(),'Income')]");

	// acount save head
	By account_save_Head = By.xpath("//button[@class='primary-btn fix-gr-bg submit']");

	/*
	 * 
	 * 
	 */

	// acounts action select
	By accountsactionselect = By.xpath("//*[@id=\"table_id\"]/tbody/tr[1]/td[3]/div/button");

	// account action edit
	By accountactionedit = By.xpath("//tbody/tr[1]/td[3]/div[1]/div[1]/a[1]");

	/*
	 * 
	 * Bank account
	 * 
	 * 
	 */

	// Bank account
	By bankaccount = By.xpath("//a[contains(text(),'Bank Account')]");

	// bank name
	By bankname = By.name("bank_name");

	// bank account name
	By bankaccountname = By.name("account_name");

	// bank account number
	By bankaccountnumber = By.name("account_number");

	// bank account type
	By bankaccounttype = By.name("account_type");

	// bank opening balance
	By bankopeningbalance = By.name("opening_balance");

	// bank account note
	By bankaccountnote = By.name("note");

	// bank account save
	By bankaccountsave = By.xpath("//button[@class='primary-btn fix-gr-bg submit submit']");

	// bank account action select
	By bankaccountactionselect = By.xpath("//*[@id=\"table_id\"]/tbody/tr/td[6]/div/button");

	// bank account transaction
	By bankaccounttransaction = By.xpath("//tbody/tr[1]/td[6]/div[1]/div[1]/a[1]");

	/*
	 * 
	 * 
	 * Income
	 * 
	 */

	// Income
	By income = By.xpath("//a[contains(text(),' Income')]");

	// income input name
	By incomeinputname = By.name("name");

	// income account head
	By incomeaccounthead = By.xpath("//*[@id=\"add-income\"]/div/div/div[2]/div/div");

	// income specific account head
	By incomespecificaccounthead = By.xpath("//*[@id=\"add-income\"]/div/div/div[2]/div/div/ul/li[2]");

	// income account method
	By incomeaccountmethod = By.xpath("//*[@id=\"add-income\"]/div/div/div[3]/div/div");

	// income specific account method
	By incomespecificaccountmethid = By.xpath("//li[contains(text(),'Cheque')]");

	/*
	 * 
	 */
	// income date click
	By incomedateclick = By.id("startDate");

	// income monthyear
	By incomemonthyear = By.xpath("/html[1]/body[1]/div[5]/div[1]/table[1]/thead[1]/tr[1]/th[2]");

	// income sitebar
	By incomesitebar = By.xpath("//body[1]/div[5]/div[1]/table[1]/thead[1]/tr[1]/th[1]");

	// income date
	public int day = 15;
	By incomedate = By.xpath("/html[1]/body[1]/div[5]/div[1]/table[1]/tbody[1]/tr/td[contains(text()," + day + ")]");

	/*
	 * 
	 */

	// income amount
	By incomeamount = By.name("amount");

	/*
	 * 
	 */

	// income browse file upload
	By incomebrowse = By.xpath("//label[contains(text(),'Browse')]");

	/*
	 * 
	 */

	// income description
	By incomedescription = By.name("description");

	// income save head
	By incomesavehead = By.xpath("//*[@id=\"add-income\"]/div/div/div[9]/div/button");

	// income action select
	By incomeactionselect = By.xpath("//tbody/tr[2]/td[6]/div[1]/button[1]");

	// income edit
	By incomeedit = By.xpath("//tbody/tr[2]/td[6]/div[1]/div[1]/a[1]");

	// income save update
	By incomesaveupdate = By.xpath("//*[@id=\"add-income-update\"]/div/div/div[9]/div/button");

	// income download
	By incomedownload = By.xpath("//*[@id=\"table_id\"]/tbody/tr[2]/td[6]/div/div/a[2]");

	/*
	 * 
	 * 
	 * Income and profit
	 * 
	 */

	// Profit & loss
	By profit_loss = By.xpath("//a[contains(text(),' Profit & Loss')]");

	// date
	By incomeandprofit_date = By.name("date_range");

	// Apply
	By incomeandprofit_apply = By.xpath("//button[contains(text(),'Apply')]");

	// search
	By incomeandprofit_search = By.xpath("//button[@class='primary-btn small fix-gr-bg']");

	/*
	 * 
	 * 
	 * Expense
	 * 
	 * 
	 */

	// expense
	By expense = By.xpath("//a[contains(text(),'Expense')]");

	// expense name
	By expense_name = By.name("name");

	// account holder
	By expenseAccountHolder = By.xpath("//*[@id=\"add-expense\"]/div/div/div[2]/div/div");

	// specific account holder
	By expense_specificAccountHolder = By.xpath("//*[@id=\"add-expense\"]/div/div/div[2]/div/div/ul/li[2]");

	// payment method
	By expense_paymentmethod = By.xpath("//span[contains(text(),'Payment Method *')]");

	// specific payment method
	By expense_specificPaymentMethod = By.xpath("//li[contains(text(),'Cash')]");

	/*
	 * 
	 */
	// expense date
	By expense_clickdate = By.id("startDate");

	// expense_month
	By expense_month = By.xpath("/html[1]/body[1]/div[5]/div[1]/table[1]/thead[1]/tr[1]/th[2]");

	// expense sitebar
	By expense_sitebar = By.xpath("//body[1]/div[5]/div[1]/table[1]/thead[1]/tr[1]/th[1]");

	// expense date picker
	public int expenseday = 15;
	By expense_datepicker = By
			.xpath("/html[1]/body[1]/div[5]/div[1]/table[1]/tbody[1]/tr/td[contains(text()," + expenseday + ")]");

	/*
	 * 
	 */

	// expense_amount
	By expense_amount = By.name("amount");

	/*
	 * 
	 */
	// expense file upload
	By expense_fileUpload = By.xpath("//label[contains(text(),'Browse')]");

	/*
	 * 
	 */
	// expense description
	By expense_description = By.name("description");

	// expense save
	By expense_save = By.xpath("//button[@class='primary-btn fix-gr-bg submit']");

	/*
	 * 
	 */
	// expense action select
	By expense_actionselect = By.xpath("//tbody/tr[2]/td[6]/div[1]/button[1]");

	// expense edit
	By expense_edit = By.xpath("//tbody/tr[2]/td[6]/div[1]/div[1]/a[1]");

	// expense_download
	By expense_download = By.xpath("//tbody/tr[2]/td[6]/div[1]/div[1]/a[3]");

	/*
	 * 
	 * Fund Transfer
	 * 
	 */

	// fund transfer
	By fundTransfer = By.xpath("//*[@id=\"subMenuAccount\"]/li[6]/a");

	// fund Transfer amount
	By fundTransferAmount = By.name("amount");

	// fund transfer purpose
	By fundTransferPurpose = By.name("purpose");

	// specific element from
	By fundTransferSpecific_elementFrom = By
			.xpath("//*[@id=\"main-content\"]/section[2]/div/div[2]/div/div/form/div/div[2]/div[2]/div/label");

	// specific element to
	By fundtransferSpecific_elementTo = By
			.xpath("//*[@id=\"main-content\"]/section[2]/div/div[2]/div/div/form/div/div[3]/div[7]/div/label");

	// fund transfer Button
	By fundTreanferButton = By.xpath("//button[@class='primary-btn fix-gr-bg']");

	/*
	 * 
	 * 
	 * Fine Report
	 * 
	 * 
	 */

	// Report
	By Report = By.xpath("//*[@id=\"subMenuAccount\"]/li[7]/a");
	//*[@id="subMenuAccount"]/li[7]/a

	// Fine Report
	By FineReport = By.xpath("//*[@id=\"subMenuAccountReport\"]/li[1]/a");

	// date range
	By date_range = By.name("date_range");

	// Fine report date range apply
	By Fine_report_Daterange_apply = By.xpath("//button[contains(text(),'Apply')]");

	// date range select class
	By Daterange_selectclass = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div[2]/div/div/form/div/div[2]/div");

	// select specific
	By daterange_specificSelect = By
			.xpath("//*[@id=\"main-content\"]/section[2]/div/div[2]/div/div/form/div/div[2]/div/ul/li[2]");

	// date range select section
	By dateRange_selectSection = By.xpath("//*[@id=\"select_section_div\"]/div[1]");

	// date range specific section
	By dateRangeSpecificSection = By.xpath("//*[@id=\"select_section_div\"]/div[1]/ul/li[3]");

	// date range search
	By DateRangeSearch = By.xpath("//button[@class='primary-btn small fix-gr-bg']");

	/*
	 * 
	 * Payroll report
	 * 
	 */

	// payroll report
	By Payroll_report = By.xpath("(//a[contains(text(),'Payroll Report')])[1]");

	// payroll report apply
	By Payroll_report_apply = By.xpath("//button[contains(text(),'Apply')]");

	// payroll search
	By payroll_search = By.xpath("//button[@class='primary-btn small fix-gr-bg']");

	/*
	 * 
	 * 
	 * Transaction
	 * 
	 */

	// Transaction
	By Transaction = By.xpath("(//a[contains(text(),' Transaction')])[2]");

	// Transactiondate range
	By Transactiondate_range = By.name("date_range");

	// Fine report date range apply
	By Transaction_Daterange_apply = By.xpath("//button[contains(text(),'Apply')]");

	// Transaction select class
	By Transaction_selectclass = By
			.xpath("//*[@id=\"main-content\"]/section[2]/div/div[2]/div/div/form/div/div[2]/div");

	// Transactionselect specific
	By Transaction_specificSelect = By.xpath("//li[contains(text(),'Income')]");

	// Transaction select section
	By Transaction_selectSection = By
			.xpath("//*[@id=\"main-content\"]/section[2]/div/div[2]/div/div/form/div/div[3]/div/div");

	// Transaction specific section
	By TransactionSpecificSection = By.xpath("//li[contains(text(),'Cash')]");

	// Transaction search
	By TransactionSearch = By.xpath("//button[@class='primary-btn small fix-gr-bg']");

	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	public void clickchartofaccount() throws InterruptedException {

		// Accounts
		driver.findElement(accounts).click();
		Thread.sleep(1000);


		// chartofAccount
		driver.findElement(chartofAccount).click();
		Thread.sleep(1000);
		
		System.out.println("Successfully enter chartofAccount");

		// inputhead
		driver.findElement(inputhead).sendKeys("Fine Collection");
		Thread.sleep(1000);

		// accountstype
		driver.findElement(accountstype).click();
		Thread.sleep(1000);

		// accountspecifictype
		driver.findElement(accountspecifictypeExpense).click();
		Thread.sleep(1000);

		// account_save_Head
		driver.findElement(account_save_Head).click();
		Thread.sleep(1000);

		System.out.println("Successfully created Expense ");
		
		// inputhead
		driver.findElement(inputhead).clear();
		Thread.sleep(1000);

		// inputhead
		driver.findElement(inputhead).sendKeys("Fine Collection");
		Thread.sleep(1000);

		// accountstype
		driver.findElement(accountstype).click();
		Thread.sleep(1000);

		// accountspecifictype
		driver.findElement(accountspecifictypeIncome).click();
		Thread.sleep(1000);

		// account_save_Head
		driver.findElement(account_save_Head).click();
		Thread.sleep(1000);

		System.out.println("Successfully created Income ");

		// accountsactionselect
		driver.findElement(accountsactionselect).click();
		Thread.sleep(1000);

		// accountactionedit
		driver.findElement(accountactionedit).click();
		Thread.sleep(1000);

		// account_save_Head
		driver.findElement(account_save_Head).click();
		Thread.sleep(1000);

		System.out.println("Successfully edited chartofAccount ");

	}

	/*
	 * 
	 *
	 * Bank account
	 * 
	 * 
	 */

	public void clickBankaccountButton() throws InterruptedException {


		// bankaccount
		driver.findElement(bankaccount).click();
		Thread.sleep(1000);
		
		System.out.println("Successfully enter bankaccount");

		// bankname
		driver.findElement(bankname).sendKeys("Dutch Bangla Bank");
		Thread.sleep(1000);

		// bankaccountname
		driver.findElement(bankaccountname).sendKeys("Md Rahman");
		Thread.sleep(1000);

		// bankaccountnumber
		driver.findElement(bankaccountnumber).sendKeys("124763247632");
		Thread.sleep(1000);

		// bankaccounttype
		driver.findElement(bankaccounttype).sendKeys("savings");
		Thread.sleep(1000);

		// bankopeningbalance
		driver.findElement(bankopeningbalance).sendKeys("1234");
		Thread.sleep(1000);

		// bankaccountnote
		driver.findElement(bankaccountnote).sendKeys("It is a long established fact that a reader will be distracted");
		Thread.sleep(1000);

		// bankaccountsave
		driver.findElement(bankaccountsave).click();
		Thread.sleep(1000);

		System.out.println("Successfully saved Bank account");

		// bankaccountactionselect
		driver.findElement(bankaccountactionselect).click();
		Thread.sleep(1000);

		// bankaccounttransaction
		driver.findElement(bankaccounttransaction).click();
		Thread.sleep(1000);

		driver.navigate().back();
		Thread.sleep(1000);

	}

	public void clickIncomeButton() throws InterruptedException, AWTException {


		// income
		driver.findElement(income).click();
		Thread.sleep(1000);
		
		System.out.println("Successfully enter income");

		// incomeinputname
		driver.findElement(incomeinputname).sendKeys("Income 2");
		Thread.sleep(1000);

		// incomeaccounthead
		driver.findElement(incomeaccounthead).click();
		Thread.sleep(1000);

		// incomespecificaccounthead
		driver.findElement(incomespecificaccounthead).click();
		Thread.sleep(1000);

		// incomeaccountmethod
		driver.findElement(incomeaccountmethod).click();
		Thread.sleep(1000);

		// incomespecificaccountmethid
		driver.findElement(incomespecificaccountmethid).click();
		Thread.sleep(1000);

		// income notice

		String month = "MARCH 2022";

		driver.findElement(incomedateclick).click(); // click calender
		Thread.sleep(2000);

		while (true) {
			String text = driver.findElement(incomemonthyear).getText(); // locator is month and year

			if (text.equals(month)) {
				break;
			} else {

				driver.findElement(incomesitebar).click(); // locator of site arrow.you have to change it
			}
		}
		driver.findElement(incomedate).click(); // locator of all date.
		Thread.sleep(2000);

		// incomeamount
		driver.findElement(incomeamount).sendKeys("1234");
		Thread.sleep(1000);

		// incomebrowse
		driver.findElement(incomebrowse).click();
		Thread.sleep(1000);

		// upload file
		String filePath2=upload.getFilePath("home-banner1.jpg");
		upload.JPEGUpload(filePath2);
		Thread.sleep(1000);


		// incomedescription
		driver.findElement(incomedescription).sendKeys("incomedescription");
		Thread.sleep(1000);

		// incomesavehead
		driver.findElement(incomesavehead).click();
		Thread.sleep(1000);

		System.out.println("Successfully saved Income");

		// incomeactionselect
		driver.findElement(incomeactionselect).click();
		Thread.sleep(1000);

		// incomeedit
		driver.findElement(incomeedit).click();
		Thread.sleep(1000);

		// incomesaveupdate
		driver.findElement(incomesaveupdate).click();
		Thread.sleep(1000);

		driver.navigate().back();
		Thread.sleep(1000);
		
		System.out.println("Successfully Complete Income");

//		//incomedownload
//		driver.findElement(incomedownload).click();
//		Thread.sleep(1000);

	}

	/*
	 * 
	 * income and profit
	 * 
	 */
	public void clickincomeandprofitButton() throws InterruptedException {

		// Accounts
		driver.findElement(accounts).click();
		Thread.sleep(1000);


		// profit_loss
		driver.findElement(profit_loss).click();
		Thread.sleep(1000);
		
		System.out.println("Successfully enter profit_loss");

		// incomeandprofit_date
		driver.findElement(incomeandprofit_date).click();
		Thread.sleep(1000);

		// incomeandprofit_apply
		driver.findElement(incomeandprofit_apply).click();
		Thread.sleep(1000);

		// incomeandprofit_search
		driver.findElement(incomeandprofit_search).click();
		Thread.sleep(1000);
		
		System.out.println("Successfully showing profit & loss");

	}

	/*
	 * 
	 * Expense
	 * 
	 */

	public void ClickExpenseButton() throws InterruptedException, AWTException {
//			
//		driver.findElement(accounts).click();
//		Thread.sleep(1000);

		
		// expense
		driver.findElement(expense).click();
		Thread.sleep(1000);
		
		System.out.println("Successfully enter expense");

		// expense_name
		driver.findElement(expense_name).sendKeys("Expense 1");
		Thread.sleep(1000);

		// expenseAccountHolder
		driver.findElement(expenseAccountHolder).click();
		Thread.sleep(1000);

		// expense_specificAccountHolder
		driver.findElement(expense_specificAccountHolder).click();
		Thread.sleep(1000);

		// expense_paymentmethod
		driver.findElement(expense_paymentmethod).click();
		Thread.sleep(1000);

		// expense_specificPaymentMethod
		driver.findElement(expense_specificPaymentMethod).click();
		Thread.sleep(1000);

		/*
		 * 
		 */

		// expense_clickdate
		driver.findElement(expense_clickdate).click();

		String month = "MARCH 2022";

		while (true) {
			String text = driver.findElement(expense_month).getText(); // locator is month and year

			if (text.equals(month)) {
				break;
			} else {

				driver.findElement(expense_sitebar).click(); // locator of site arrow.you have to change it
			}
		}
		driver.findElement(expense_datepicker).click(); // locator of all date.
		Thread.sleep(2000);

		/*
		 * 
		 */

		// expense_amount
		driver.findElement(expense_amount).sendKeys("2500");
		Thread.sleep(1000);

		/*
		 * 
		 */
		// expense_fileUpload
		driver.findElement(expense_fileUpload).click();
		Thread.sleep(1000);
		
		//upload file
		String filePath2=upload.getFilePath("home-banner1.jpg");
		upload.JPEGUpload(filePath2);
		Thread.sleep(1000);

		/*
		 * 
		 */

		// expense_description
		driver.findElement(expense_description)
				.sendKeys("It is a long established fact that a reader will be distracted "
						+ "by the readable content of a page when looking at its layout. ");
		Thread.sleep(1000);

		// expense_save
		driver.findElement(expense_save).click();
		Thread.sleep(1000);
		
		

		// expense_actionselect
		driver.findElement(expense_actionselect).click();
		Thread.sleep(1000);

		// expense_edit
		driver.findElement(expense_edit).click();
		Thread.sleep(1000);

		// expense_save
		driver.findElement(expense_save).click();
		Thread.sleep(1000);
		
		System.out.println("Successfully saved expense");

		// expense_actionselect
		driver.findElement(expense_actionselect).click();
		Thread.sleep(1000);

		// expense_download
		driver.findElement(expense_download).click();
		Thread.sleep(1000);
		
		System.out.println("Successfully expense downloaded");

	}

	public void clickFundTransferButton() throws InterruptedException {
		
//		// Accounts
//		driver.findElement(accounts).click();
//		Thread.sleep(1000);

		// fundTransfer
		driver.findElement(fundTransfer).click();
		Thread.sleep(1000);
		
		System.out.println("Successfully enter fundTransfer");

		// fundTransferAmount
		driver.findElement(fundTransferAmount).sendKeys("123");
		Thread.sleep(1000);

		// fundTransferPurpose
		driver.findElement(fundTransferPurpose).sendKeys("late fee");
		Thread.sleep(1000);

		// fundTransferSpecific_elementFrom
		driver.findElement(fundTransferSpecific_elementFrom).click();
		Thread.sleep(1000);

		// fundtransferSpecific_elementTo
		driver.findElement(fundtransferSpecific_elementTo).click();
		Thread.sleep(1000);

		// fundTreanferButton
		driver.findElement(fundTreanferButton).click();
		Thread.sleep(1000);
		
		System.out.println("Successfully Balance Transfered");
	}
	
	public void clickFineReportButton() throws InterruptedException {
		
//		// Accounts
//		driver.findElement(accounts).click();
//		Thread.sleep(1000);
		
		//Report
		driver.findElement(Report).click();
		Thread.sleep(3000);
		
		//FineReport
		driver.findElement(FineReport).click();
		Thread.sleep(1000);
		System.out.println("Successfully enter FineReport");
		
		//date_range
		driver.findElement(date_range).click();
		Thread.sleep(1000);
		
		//Fine_report_Daterange_apply
		driver.findElement(Fine_report_Daterange_apply).click();
		Thread.sleep(1000);
		
		//Daterange_selectclass
		driver.findElement(Daterange_selectclass).click();
		Thread.sleep(1000);
		
		//daterange_specificSelect
		driver.findElement(daterange_specificSelect).click();
		Thread.sleep(1000);
		
		//dateRange_selectSection
		driver.findElement(dateRange_selectSection).click();
		Thread.sleep(1000);
		
		//dateRangeSpecificSection
		driver.findElement(dateRangeSpecificSection).click();
		Thread.sleep(1000);
		
		//DateRangeSearch
		driver.findElement(DateRangeSearch).click();
		Thread.sleep(1000);
		
		System.out.println("Successfully Balance Transfered");
	}

	public void clickpayrollreportButton() throws InterruptedException {


		// Payroll_report
		driver.findElement(Payroll_report).click();
		Thread.sleep(1000);
		
		System.out.println("Successfully enter Payroll_report");
		
		//date range
		driver.findElement(By.name("date_range")).click();
		Thread.sleep(1000);

		// Payroll_report_apply
		driver.findElement(Payroll_report_apply).click();
		Thread.sleep(1000);

		// payroll_search
		driver.findElement(payroll_search).click();
		Thread.sleep(1000);
		
		System.out.println("Successfully search Fine report");
	}

	public void clickTransactionButton() throws InterruptedException {
		
		// Accounts
		driver.findElement(accounts).click();
		Thread.sleep(1000);
		
		//Report
		driver.findElement(Report).click();
		Thread.sleep(1000);

		// Transaction
		driver.findElement(Transaction).click();
		Thread.sleep(1000);
		
		System.out.println("Successfully enter Transaction");

		// Transactiondate_range
		driver.findElement(Transactiondate_range).click();
		Thread.sleep(1000);

		// Transaction_Daterange_apply
		driver.findElement(Transaction_Daterange_apply).click();
		Thread.sleep(1000);

		// Transaction_selectclass
		driver.findElement(Transaction_selectclass).click();
		Thread.sleep(1000);

		// Transaction_specificSelect
		driver.findElement(Transaction_specificSelect).click();
		Thread.sleep(1000);

		// Transaction_selectSection
		driver.findElement(Transaction_selectSection).click();
		Thread.sleep(1000);

		// TransactionSpecificSection
		driver.findElement(TransactionSpecificSection).click();
		Thread.sleep(1000);

		// TransactionSearch
		driver.findElement(TransactionSearch).click();
		Thread.sleep(1000);
		
		System.out.println("Successfully search Transaction report");
		System.out.println("Checkout from Accounts");

	}

}
