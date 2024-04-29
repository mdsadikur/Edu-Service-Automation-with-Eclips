package PageObject;

import java.awt.AWTException;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Common_Method.CommonMethod;

public class POM_Fees {
	
	WebDriver driver = null;
	
	String unique_id, prefix, class_limit, section_limit, admission_no_limit;
	
	
	public POM_Fees(WebDriver driver) {
		
		this.driver = driver;
		unique_id = this.name();
		prefix = this.name();
		class_limit = this.name();
		section_limit = this.name();
		admission_no_limit = this.name();
	}
	
	CommonMethod upload = new CommonMethod();
	
	//fees
	By fees = By.xpath("//div[contains(text(),'Fees')]");
	
	//Fees group
	By fees_group = By.xpath("//body/div[2]/nav[1]/ul[1]/li[8]/ul[1]/li[1]/a[1]");
	
	//fees name
	By fees_name = By.name("name");
	
	//fees description
	By fees_description = By.name("description");
	
	//fees save
	By fees_save = By.xpath("//button[@class='primary-btn fix-gr-bg submit']");
	
	/*
	 *
	 * action select
	 * 
	 */
	
	//fees select
	By fees_select = By.xpath("//*[@id=\"table_id\"]/tbody/tr/td[3]/div/button");
	
	//fees edit
	By fees_edit = By.xpath("//a[contains(text(),'Edit')]");
	
	//fees delete
	By fees_delete = By.xpath("(//a[@class='dropdown-item deleteFeesGroupModal'])[1]");
	
	//fees delete cancel
	By fees_delete_cancel = By.xpath("(//button[@class='primary-btn tr-bg'])[1]");
	
	//fees delete confirm
	By fees_delete_confirm = By.xpath("(//button[@class='primary-btn fix-gr-bg'])[1]");
	
	/*
	 * 
	 * 
	 * Fees Type
	 * 
	 * 
	 */
	
	//fees type
	By fees_type = By.xpath("//a[contains(text(),'Fees Type')]");
	
	//fees type name 
	By fees_type_name = By.name("name");
	
	//fees type group
	By fees_type_group = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[2]/div/div");
	
	//fees type specific group
	By fees_type_specific_group = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[2]/div/div/ul/li[2]");
	
	//fees type description
	By fees_type_description = By.name("description");
	
	//fees type save
	By fees_type_save = By.xpath("//button[@class='primary-btn fix-gr-bg submit']");
	
	/*
	 * 
	 * 
	 */
	
	//fees type select
	By fees_type_select = By.xpath("(//button[@class='btn dropdown-toggle'])[1]");
	
	//fees type edit
	By fees_type_edit = By.xpath("(//a[@class='dropdown-item'])[2]");
	
	//fees type delete
	By fees_type_delete = By.xpath("(//a[@class='dropdown-item'])[3]");
	
	//fees type delete cancel
	By fees_type_delete_cancel = By.xpath("(//button[@class='primary-btn tr-bg'])[2]");
	
	//fees type delete confirm
	By fees_type_delete_confirm = By.xpath("(//button[@class='primary-btn fix-gr-bg'])[2]");
	
	/*
	 * 
	 * 
	 * Fees invoice
	 * 
	 * 
	 */
	
	
	String Fees_invoice_url = "http://pos.rishfa.com/fees/fees-invoice-list";
	//paid status
	int i=1;
	By paid = By.xpath("//*[@id=\"table_id\"]/tbody/tr["+i+"]/td[8]/button");
	//*[@id="table_id"]/tbody/tr[1]/td[8]/button
	
	//fees invoice paid select
	By paid_select1 = By.xpath("//*[@id=\"table_id\"]/tbody/tr["+i+"]/td[10]/div/button");
	
	//fees invoice view payment
	 By paid_payment1 = By.xpath("//*[@id=\"table_id\"]/tbody/tr["+i+"]/td[10]/div/div/a[1]");
	 
	 //fees invoice view payment cancel
	 By paid_payment1_cancel = By.xpath("//*[@id=\"viewFeesPayment\"]/div/div/div[1]/button");
	 
	//fees invoice view
	 By paid_view1 = By.xpath("//*[@id=\"table_id\"]/tbody/tr["+i+"]/td[10]/div/div/a[2]");
	 
	 /*
	  * 
	  * 
	  * 
	  */
	 //unpaid_select2
	// By unpaid_select2 = By.xpath("//*[@id=\"table_id\"]/tbody/tr["+i+"]/td[10]/div/button");
	
	 //unpaid_payment2
	 By unpaid_payment2 = By.xpath("//*[@id=\"table_id\"]/tbody/tr["+i+"]/td[10]/div/div/a[1]");
	 
	 //unpaid_payment2_cancel
	 By unpaid_payment2_cancel = By.xpath("//*[@id=\"viewFeesPayment\"]/div/div/div[1]/button");
	 
	 //unpaid_view2
	 By unpaid_view2 = By.xpath("(//*[@id=\"table_id\"]/tbody/tr["+i+"]/td[10]/div/div/a[2]");
	 
	 //unpaid_add_payment
	 By unpaid_add_payment = By.xpath("//*[@id=\"table_id\"]/tbody/tr["+i+"]/td[10]/div/div/a[3]");
	 
	 //unpaid_paid_amount
	 By unpaid_paid_amount = By.name("paid_amount[]");
	 
	 //unpaid_payment_method
	 By unpaid_payment_method = By.xpath("(//div[@class='nice-select niceSelect w-100 bb form-control'])[1]");
	 
	 //unpaid_payment_cash
	 By unpaid_payment_cash = By.xpath("//li[contains(text(),'Cash')]");
	 
	 //unpaid due amount
	 By unpaid_due_amount = By.xpath("//*[@id=\"main-content\"]/section[2]/div/form/div/div[2]/div[2]/div/div/table/tbody/tr/td[4]/div/input[1]");
	 
	 //unpaid paid amount
	 By unpaid_due_amount_value = By.name("paid_amount[]");

		// unpaid_payment_cheque
		By unpaid_payment_cheque = By.xpath("//li[contains(text(),'Cheque')]");

		// unpaid_payment_note
		By unpaid_payment_note = By.name("payment_note");

		// unpaid_bank_browse
		By unpaid_bank_browse = By.xpath("//label[contains(text(),'Browse')]");

		// unpaid_payment_bank
		By unpaid_payment_bank = By.xpath("(//li[contains(text(),'Bank')])[1]");

		// unpaid_select_bank
		By unpaid_select_bank = By.xpath("(//div[@class='nice-select niceSelect w-100 bb form-control'])[2]");

		// unpaid_select_specific_bank
		By unpaid_select_specific_bank = By.xpath("//*[@id=\"bankPaymentAddFees\"]/div/div/ul/li[2]");

		// unpaid add payment
		By unpaid_Add_payment = By.xpath("//button[@class='primary-btn fix-gr-bg submit fmInvoice']");

		// unpaid edit
		By unpaid_edit = By.xpath("//*[@id=\"table_id\"]/tbody/tr["+i+"]/td[10]/div/div/a[4]");

		// fees invoice update
		By fees_invoice_update = By.xpath("//button[@class='primary-btn fix-gr-bg submit fmInvoice']");

		// fees invoice delete
		By fees_invoice_delete = By.xpath("//*[@id=\"table_id\"]/tbody/tr[2]/td[10]/div/div/a[5]");

		// fees invoice delete cancel
		By fees_invoice_delete_cancel = By.xpath("(//button[@class='primary-btn tr-bg'])[2]");

		// fees invoice delete confirm
		By fees_invoice_delete_confirm = By.xpath("(//button[@class='primary-btn fix-gr-bg'])[2]");
		
		/*
		 * 
		 * 
		 */
		
		//partial pay select
		By partial_pay_select = By.xpath("//*[@id=\"table_id\"]/tbody/tr["+i+"]/td[10]/div/button");
		
		//partial pay view payment
		By partial_pay_view_payment = By.xpath("//*[@id=\"table_id\"]/tbody/tr["+i+"]/td[10]/div/div/a[1]");
		
		//partial pay view
		By partial_pay_view = By.xpath("//*[@id=\"table_id\"]/tbody/tr["+i+"]/td[10]/div/div/a[2]");
		
		//partial pay add payment
		By partial_pay_add_payment = By.xpath("//*[@id=\"table_id\"]/tbody/tr["+i+"]/td[10]/div/div/a[3]");
		
		//partial pay view payment cancel
		By partial_pay_view_payment_cancel = By.xpath("(//button[@class='close'])[33]");
		
		//partial pay payment method
		By partial_pay_payment_method = By.xpath("(//div[@class='nice-select niceSelect w-100 bb form-control'])[1]");
		
		//partial pay cash
		By partial_pay_cash = By.xpath("//li[contains(text(),'Cash')]");
		
		//partial pay cheque
		By partial_pay_cheque = By.xpath("//li[contains(text(),'Cheque')]");
		
		//partial pay cheque note
		By partial_pay_cheque_note = By.name("payment_note");
		
		//partial pay browse
		By partial_pay_browse = By.xpath("//label[contains(text(),'Browse')]");
		
		//partial pay add button
		By partial_pay_add_payment_button = By.xpath("(//button[@class='primary-btn fix-gr-bg submit fmInvoice'])");
		
		//Partial pay bank
		By partial_pay_bank = By.xpath("(//li[contains(text(),'Bank')])[1]");
		
		//partial pay select bank
		By partial_pay_select_bank = By.xpath("(//div[@class='nice-select niceSelect w-100 bb form-control'])[2]");
		
		//partial pay specific bank 
		By partial_pay_specific_Bank_pay = By.xpath("//*[@id=\"bankPaymentAddFees\"]/div/div/ul/li[2]");
		
		By partial_pay_due = By.xpath("//*[@id=\"main-content\"]/section[2]/div/form/div/div[2]/div[2]/div/div/table/tbody/tr[1]/td[4]/div/input[1]");
		
		//partial pay paid amount
		By partial_pay_paid_amount = By.name("paid_amount[]");

		/*
		 * 
		 * 
		 */

		// add fees invoice
		By add_fees_invoice = By.xpath("//a[@class='primary-btn small fix-gr-bg']");

		// fees invoice class
		By fees_invoice_class = By.xpath("(//div[@class='nice-select niceSelect w-100 bb form-control'])[1]");

		// fees invoice specific class
		By fees_invoice_specific_class = By.xpath(
				"//*[@id=\"main-content\"]/section[2]/div/form/div/div[1]/div/div/div[2]/div/div[2]/div/div/ul/li[2]");

		// fees invoice select student
		By fees_invoice_select_student = By.xpath("//div[@class='nice-select w-100 bb niceSelect form-control']");

		// fees invoice select specific student
		By fees_invoice_select_specific_student = By.xpath("//*[@id=\"selectStudentDiv\"]/div[1]/ul/li[3]");

		
		
		/*
		 * 
		 */

		// fees_invoice date from
		By fees_invoice_date_from = By.name("create_date");

		// fees_invoice monthyear
		By fees_invoice_monthyear = By.xpath("/html[1]/body[1]/div[5]/div[1]/table[1]/thead[1]/tr[1]/th[2]");

		// admission query site bar
		By fees_invoice_sitebar = By.xpath("//body[1]/div[5]/div[1]/table[1]/thead[1]/tr[1]/th[1]");

		// admission query pickdate
		public int day = 15;
		By fees_invoice_pickdate = By
				.xpath("/html[1]/body[1]/div[5]/div[1]/table[1]/tbody[1]/tr/td[contains(text()," + day + ")]");

		/*
		 * 
		 */

		// fees_invoice date To
		By fees_invoice_date_To = By.name("due_date");

		// fees_invoice monthyear2
		By fees_invoice_monthyear2 = By.xpath("/html[1]/body[1]/div[5]/div[1]/table[1]/thead[1]/tr[1]/th[2]");

		// fees_invoice site bar
		By fees_invoice_sitebar2 = By.xpath("/html[1]/body[1]/div[5]/div[1]/table[1]/thead[1]/tr[1]/th[1]");

		// fees_invoice pickdate
		public int day2 = 20;
		By fees_invoice_pickdate2 = By
				.xpath("/html[1]/body[1]/div[5]/div[1]/table[1]/tbody[1]/tr/td[contains(text()," + day2 + ")]");
		
		/*
		 * 
		 */
		
		//payment status
		By payment_status = By.xpath("(//div[@class='nice-select niceSelect w-100 bb form-control'])[2]");
		
		//fees not paid
		By fees_not_paid = By.xpath("//li[contains(text(),'Not Paid')]");
		
		//fees partial paid
		By fees_partial_paid = By.xpath("//li[contains(text(),'Partial Paid')]");
		
		// fees payment method
		By fees_payment_method = By.xpath("(//div[@class='nice-select niceSelect w-100 bb form-control'])[3]");

		// fees method cash
		By fees_method_cash = By.xpath("//li[contains(text(),'Cash')]");

		// fees method cheque
		By fees_method_cheque = By.xpath("//li[contains(text(),'Cheque')]");

		// fees method bank
		By fees_method_bank = By.xpath("//*[@id=\"paymentMethod\"]/div/div/ul/li[4]");
		
		//fees method select bank
		By fees_method_select_bank = By.xpath("(//div[@class='nice-select niceSelect w-100 bb form-control'])[4]");
		
		//fees method select specific bank
		By fees_method_select_specific_bank = By.xpath("//*[@id=\"bankPayment\"]/div/div/ul/li[2]");
		
		/*
		 * 
		 */
		
		//fees full paid
		By fees_full_paid = By.xpath("//li[contains(text(),'Full Paid')]");
		
		//fees type
		By fees_Invoice_type = By.xpath("(//div[@class='nice-select niceSelect w-100 bb form-control'])[5]");
		
		//specific fees type
		By specific_fees_type = By.xpath("//*[@id=\"main-content\"]/section[2]/div/form/div/div[2]/div[2]/div/div[1]/div[1]/div/div/ul/li[3]");
		
		//fees type amount
		By fees_type_Totalamount = By.name("groups[0][amount]");
		
		//fees type paid amount
		By fees_type_paid_amount = By.name("groups[0][paid_amount]");
		
		
		/*
		 * 
		 *Bank Payment 
		 * 
		 */
		
		//Bank payment
		By Bank_payment = By.xpath("(//a[contains(text(),'Bank Payment')])[1]");
		
		//bank payment note
		By Bank_payment_note = By.xpath("//*[@id=\"table_id\"]/tbody/tr[1]/td[5]/a");
		
		//bank payment note cancel
		By Bank_payment_note_cancel = By.xpath("(//button[@class='close'])[1]");
		
		/*
		 * 
		 * 
		 * Fees invoice setting
		 * 
		 * 
		 */
		
		//fees invoice setting
		By fees_invoice_setting = By.xpath("(//a[contains(text(),'Fees Invoice Settings')])[1]");
		
		//invoice number input field
		By invoice_number_input_field = By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul/li[1]");
		
		//fees invoice unique start
		By fees_invoice_unique_start = By.name("uniq_id_start");
		
		//fees invoice prefix
		By fees_invoice_prefix = By.name("prefix");
		
		//fees_invoice_class limit
		By fees_invoice_class_limit = By.name("class_limit");
		
		//fees invoice section limit
		By fees_invoice_section_limit = By.name("section_limit");
		
		//fees invoice admission_limit
		By fees_invoice_admission_limit = By.name("admission_limit");
		
		//fees invoice update button
		By fees_invoice_update_button = By.xpath("(//button[@class='primary-btn fix-gr-bg submit'])");
		
		//invoice number preview
		By invoice_number_preview = By.xpath("(//div[@class='row fees_custom_preview'])");
		
		
		/*
		 * 
		 * 
		 * 
		 */
		
		//report
		By report = By.xpath("//*[@id=\"subMenuFees\"]/li[6]/a");
		
		//fees due report
		By fees_due_report = By.xpath("(//a[contains(text(),'Fees Due Report')])");
		
		//fees due report date range
		By fees_due_report_date_range = By.name("date_range");
		
		//fees due report date range apply
		By fees_due_report_date_range_apply = By.xpath("//button[@class='applyBtn btn btn-sm btn-primary']");
		
		//fees due report select class
		By fees_due_report_select_class = By.xpath("(//div[@class='nice-select w-100 bb niceSelect form-control'])[1]");
		
		//fees_due_report_select_specific_class
		By fees_due_report_select_specific_class = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div[2]/div/div/form/div/div[2]/div/ul/li[2]");
															//*[@id="main-content"]/section[2]/div/div[2]/div/div/form/div/div[2]/div/ul/li[2]
		
		//fees_due_report_select_section
		By fees_due_report_select_section = By.xpath("(//div[@class='nice-select w-100 bb niceSelect form-control'])[2]");
		
		//fees_due_report_select_specific_section
		By fees_due_report_select_specific_section = By.xpath("//*[@id=\"feesSectionDiv\"]/div[1]/ul/li[2]");
		
		//fees_due_report_select_student
		By fees_due_report_select_student = By.xpath("(//div[@class='nice-select w-100 bb niceSelect form-control'])[3]");
		
		//fees_due_report_select_specific_student
		By fees_due_report_select_specific_student = By.xpath("//*[@id=\"selectStudentDiv\"]/div[1]/ul/li[2]");
		
		//fees due report search
		By fees_due_report_search = By.xpath("//button[@class='primary-btn small fix-gr-bg']");
		
		/*
		 * 
		 */
		
		//fine report
		By fine_report = By.xpath("(//a[contains(text(),'Fine Report')])[1]");
		
		/*
		 * 
		 */
		
		//payment report
		By payment_report = By.xpath("(//a[contains(text(),'Payment Report')])[1]");
		
		/*
		 * 
		 */
		
		//balance report
		By balance_report = By.xpath("(//a[contains(text(),'Balance Report')])[1]");
		
		/*
		 * 
		 */
		
		//waiver report
		By waiver_report = By.xpath("(//a[contains(text(),'Waiver Report')])[1]");
	 
	 
	 
	 
	 
	 
	 
	
	
	/*
	 * 
	 * 
	 * 
	 * 
	 */
	
	public void clickFeesGroupButton() throws InterruptedException {
		
		//fees
		driver.findElement(fees).click();
		Thread.sleep(1000);
		
		//fees_group
		driver.findElement(fees_group).click();
		Thread.sleep(1000);
		
		//fees_name
		driver.findElement(fees_name).sendKeys("Fees Group 1");
		Thread.sleep(1000);
		
		//fees_description
		driver.findElement(fees_description).sendKeys("It is a long established fact that a reader will be"
				+ " distracted by the readable content of a page when looking at its layout.");
		
		//fees_save
		driver.findElement(fees_save).click();
		Thread.sleep(1000);
		
		System.out.println("Successfully saved fees group");
		
		/*
		 * 
		 */
		//fees_select
		driver.findElement(fees_select).click();
		Thread.sleep(1000);
		
		//fees_edit
		driver.findElement(fees_edit).click();
		Thread.sleep(1000);
		
		// fees_save
		driver.findElement(fees_save).click();
		Thread.sleep(1000);
		
		System.out.println("Successfully edit fees group");
		
		// fees_select
		driver.findElement(fees_select).click();
		Thread.sleep(1000);
		
		//fees_delete
		driver.findElement(fees_delete).click();
		Thread.sleep(1000);
		
		//fees_delete_cancel
		driver.findElement(fees_delete_cancel).click();
		Thread.sleep(1000);
		
		System.out.println("Successfully delete cancel fees group");
		
//		// fees_select
//		driver.findElement(fees_select).click();
//		Thread.sleep(1000);
//
//		// fees_delete
//		driver.findElement(fees_delete).click();
//		Thread.sleep(1000);
//		
//		//fees_delete_confirm
//		driver.findElement(fees_delete_confirm).click();
//		Thread.sleep(1000);
//		
//		System.out.println("Successfully deleted fees group");
		
	}
	
	/*
	 * 
	 * 
	 * Fees type
	 * 
	 * 
	 */
	
	public void clickfees_typeButton() throws InterruptedException {
		
//		// fees
//		driver.findElement(fees).click();
//		Thread.sleep(1000);
		
		//fees_type
		driver.findElement(fees_type).click();
		Thread.sleep(1000);
		
		//fees_type_name
		driver.findElement(fees_type_name).sendKeys("Late Fee");
		Thread.sleep(1000);
		
		//fees_type_group
		driver.findElement(fees_type_group).click();
		Thread.sleep(1000);
		
		//fees_type_specific_group
		driver.findElement(fees_type_specific_group).click();
		Thread.sleep(1000);
		
		//fees_type_description
		driver.findElement(fees_type_description).sendKeys("It is a long established fact that a reader will be "
				+ "distracted by the  readable content of a page when looking at its layout. ");
		
		//fees_type_save
		driver.findElement(fees_type_save).click();
		Thread.sleep(1000);
		
		System.out.println("Successfully saved fees Type");
		
		/*
		 * 
		 * 
		 */
		
		//fees_type_select
		driver.findElement(fees_type_select).click();
		Thread.sleep(1000);
		
		//fees_type_edit
		driver.findElement(fees_type_edit).click();
		Thread.sleep(1000);

		// fees_type_save
		driver.findElement(fees_type_save).click();
		Thread.sleep(1000);
		
		System.out.println("Successfully edit fees Type");

//		// fees_type_select
//		driver.findElement(fees_type_select).click();
//		Thread.sleep(1000);
//		
//		//fees_type_delete
//		driver.findElement(fees_type_delete).click();
//		Thread.sleep(1000);
//		
//		//fees_type_delete_cancel
//		driver.findElement(fees_type_delete_cancel).click();
//		Thread.sleep(1000);
//		
//		System.out.println("Successfully cancel delete fees Type");
//		
//		// fees_type_select
//		driver.findElement(fees_type_select).click();
//		Thread.sleep(1000);
//		
//		//fees_type_delete
//		driver.findElement(fees_type_delete).click();
//		Thread.sleep(1000);
//		
//		//fees_type_delete_confirm
//		driver.findElement(fees_type_delete_confirm).click();
//		Thread.sleep(1000);
//		
//		System.out.println("Successfully deleted fees Type");
		
		
		
	}
	
	/*
	 * 
	 * 
	 * Add fees invoice
	 * 
	 * 
	 */
	
	public void feesBasicInfo() throws InterruptedException {
		
		//fees_invoice_class
		driver.findElement(fees_invoice_class).click();
		Thread.sleep(1000);
		
		//fees_invoice_specific_class
		driver.findElement(fees_invoice_specific_class).click();
		Thread.sleep(1000);
		
		//fees_invoice_select_student
		driver.findElement(fees_invoice_select_student).click();
		Thread.sleep(1000);
		
		//fees_invoice_select_specific_student
		driver.findElement(fees_invoice_select_specific_student).click();
		Thread.sleep(1000);
		
		/*
		 * date from
		 */
		
		// upload notice time

		String month = "MARCH 2022";

		driver.findElement(fees_invoice_date_from).click(); // click calender
		Thread.sleep(2000);

		while (true) {
			String text = driver.findElement(fees_invoice_monthyear).getText(); // locator is month and year

			if (text.equals(month)) {
				break;
			} else {

				driver.findElement(fees_invoice_sitebar).click(); // locator of site arrow.you have to change it
			}
		}

		driver.findElement(fees_invoice_pickdate).click(); // locator of all date.
		Thread.sleep(2000);
		
		/*
		 * date To
		 */
		
		// upload notice time

		String month2 = "MARCH 2022";

		driver.findElement(fees_invoice_date_To).click(); // click calender
		Thread.sleep(2000);

		while (true) {
			String text = driver.findElement(fees_invoice_monthyear2).getText(); // locator is month and year

			if (text.equals(month2)) {
				break;
			} else {

				driver.findElement(fees_invoice_sitebar2).click(); // locator of site arrow.you have to change it
			}
		}

		driver.findElement(fees_invoice_pickdate2).click(); // locator of all date.
		Thread.sleep(2000);
		
	}
	
	/*
	 * 
	 * Not paid fees type
	 * 
	 */
	
	public void NotpaidFeesType() throws InterruptedException {
		
		//fees_Invoice_type
		driver.findElement(fees_Invoice_type).click();
		Thread.sleep(2000);
		
		//specific_fees_type
		driver.findElement(specific_fees_type).click();
		Thread.sleep(2000);
		
		//fees_type_Totalamount
		driver.findElement(fees_type_Totalamount).sendKeys("123");
		Thread.sleep(2000);
	}
	

	
	/*
	 * 
	 * Not paid
	 * 
	 * 
	 */
	
	public void feesNotpaid() throws InterruptedException {
		
		//fees_not_paid
		driver.findElement(fees_not_paid).click();
		Thread.sleep(2000);
		
		// call NotpaidFeesType
		NotpaidFeesType();

		// fees_invoice_update
		driver.findElement(fees_invoice_update).click();
		Thread.sleep(2000);
		System.out.println("Successfully update Not paid");
	
	}
	
	/*
	 * 
	 * 
	 * Full/Partial paid
	 * 
	 * 
	 */
	public void partial_Full_bank_paid() throws InterruptedException {
		
		//fees_method_bank
		driver.findElement(fees_method_bank).click();
		Thread.sleep(2000);
		
		//fees_method_select_bank
		driver.findElement(fees_method_select_bank).click();
		Thread.sleep(2000);
		
		//fees_method_select_specific_bank
		driver.findElement(fees_method_select_specific_bank).click();
		Thread.sleep(2000);
		
		
		
	}
	
	public void feespartial_full_paid_type() throws InterruptedException {

		// fees_Invoice_type
		driver.findElement(fees_Invoice_type).click();
		Thread.sleep(2000);

		// specific_fees_type
		driver.findElement(specific_fees_type).click();
		Thread.sleep(2000);
		
	}
	
	/*
	 * 
	 * 
	 * fees_method_cash
	 * 
	 * 
	 */
	

	public void partial_paid_cash() throws InterruptedException {
		

		
		//fees_payment_method
		driver.findElement(fees_payment_method).click();
		Thread.sleep(2000);
		
		//fees_method_cash
		driver.findElement(fees_method_cash).click();
		Thread.sleep(2000);
		
		//call feespartial_paid
		feespartial_full_paid_type();

		// fees_type_Totalamount
		driver.findElement(fees_type_Totalamount).sendKeys("123");
		Thread.sleep(2000);
		
		// fees_type_paid_amount
		driver.findElement(fees_type_paid_amount).sendKeys("12");
		Thread.sleep(2000);

		
	}
	
	/*
	 * 
	 * fees_method_cheque
	 * 
	 */
	
	public void partial_paid_cheque() throws InterruptedException {

		
		//fees_payment_method
		driver.findElement(fees_payment_method).click();
		Thread.sleep(2000);
		
		//fees_method_cash
		driver.findElement(fees_method_cheque).click();
		Thread.sleep(2000);
		
		//call feespartial_paid
		feespartial_full_paid_type();

		// fees_type_Totalamount
		driver.findElement(fees_type_Totalamount).sendKeys("123");
		Thread.sleep(2000);
		
		// fees_type_paid_amount
		driver.findElement(fees_type_paid_amount).sendKeys("12");
		Thread.sleep(2000);

		
	}
	
	
	/*
	 * 
	 * fees_method_bank
	 * 
	 */
	
	public void partial_paid_Bank() throws InterruptedException {
		
		//fees_payment_method
		driver.findElement(fees_payment_method).click();
		Thread.sleep(2000);

		// call partial_Full_bank_paid
		partial_Full_bank_paid();
		
		//call feespartial_paid
		feespartial_full_paid_type();

		// fees_type_Totalamount
		driver.findElement(fees_type_Totalamount).sendKeys("123");
		Thread.sleep(2000);
		
		// fees_type_paid_amount
		driver.findElement(fees_type_paid_amount).sendKeys("12");
		Thread.sleep(2000);

		
	}
	
	/*
	 * 
	 * Partial paid_cash
	 * 
	 */
	
	public void FeesPartialpaid_cash() throws InterruptedException {
		
		//fees_partial_paid
		driver.findElement(fees_partial_paid).click();
		Thread.sleep(2000);
		
		// call partial_full_paid
		partial_paid_cash();

		// fees_invoice_update
		driver.findElement(fees_invoice_update).click();
		Thread.sleep(2000);
		System.out.println("Successfully update with partial cash");
	}
	
	/*
	 * 
	 * Partial paid_cheque
	 * 
	 */
	
	public void FeesPartialpaid_cheque() throws InterruptedException {
		
		//fees_partial_paid
		driver.findElement(fees_partial_paid).click();
		Thread.sleep(2000);
		
		// call partial_full_paid
		partial_paid_cheque();

		// fees_invoice_update
		driver.findElement(fees_invoice_update).click();
		Thread.sleep(2000);
		System.out.println("Successfully update with partial cheque");
	}
	
	/*
	 * 
	 * Partial paid_Bank
	 * 
	 */
	
	public void FeesPartialpaid_Bank() throws InterruptedException {
		
		//fees_partial_paid
		driver.findElement(fees_partial_paid).click();
		Thread.sleep(2000);
		
		// call partial_full_paid
		partial_paid_Bank();

		// fees_invoice_update
		driver.findElement(fees_invoice_update).click();
		Thread.sleep(2000);
		System.out.println("Successfully update with partial bank");
	}
	
	
	/*
	 * 
	 * 
	 * fees_method_cash
	 * 
	 * 
	 */
	

	public void full_paid_cash() throws InterruptedException {
		
		//fees_payment_method
		driver.findElement(fees_payment_method).click();
		Thread.sleep(2000);
		
		//fees_method_cash
		driver.findElement(fees_method_cash).click();
		Thread.sleep(2000);
		
		//call feespartial_paid
		feespartial_full_paid_type();

		// fees_type_Totalamount
		driver.findElement(fees_type_Totalamount).sendKeys("123");
		Thread.sleep(2000);


		
	}
	
	/*
	 * 
	 * fees_method_cheque
	 * 
	 */
	
	public void full_paid_cheque() throws InterruptedException {
		
		//fees_payment_method
		driver.findElement(fees_payment_method).click();
		Thread.sleep(2000);
		
		//fees_method_cash
		driver.findElement(fees_method_cheque).click();
		Thread.sleep(2000);
		
		//call feespartial_paid
		feespartial_full_paid_type();

		// fees_type_Totalamount
		driver.findElement(fees_type_Totalamount).sendKeys("123");
		Thread.sleep(2000);
		
	}
	
	
	/*
	 * 
	 * fees_method_bank
	 * 
	 */
	
	public void full_paid_Bank() throws InterruptedException {		

		// fees_payment_method
		driver.findElement(fees_payment_method).click();
		Thread.sleep(2000);

		// call partial_Full_bank_paid
		partial_Full_bank_paid();
		
		//call feespartial_paid
		feespartial_full_paid_type();

		// fees_type_Totalamount
		driver.findElement(fees_type_Totalamount).sendKeys("123");
		Thread.sleep(2000);
	
	}
	
	/*
	 * 
	 * Partial paid_cash
	 * 
	 */
	
	public void FeesFullpaid_cash() throws InterruptedException {
		
		//fees_partial_paid
		driver.findElement(fees_full_paid).click();
		Thread.sleep(2000);
		
		// call partial_full_paid
		full_paid_cash();

		// fees_invoice_update
		driver.findElement(fees_invoice_update).click();
		Thread.sleep(2000);
		
		System.out.println("Successfully update with full cash");
	}
	
	/*
	 * 
	 * Partial paid_cheque
	 * 
	 */
	
	public void FeesFullpaid_cheque() throws InterruptedException {
		
		//fees_partial_paid
		driver.findElement(fees_full_paid).click();
		Thread.sleep(2000);
		
		// call partial_full_paid
		full_paid_cheque();

		// fees_invoice_update
		driver.findElement(fees_invoice_update).click();
		Thread.sleep(2000);
		
		System.out.println("Successfully update with full cheque");
	}
	
	/*
	 * 
	 * Partial paid_Bank
	 * 
	 */
	
	public void FeesFullpaid_Bank() throws InterruptedException {
		
//		//payment_status
//		driver.findElement(payment_status).click();
//		Thread.sleep(1000);
		
		//fees_partial_paid
		driver.findElement(fees_full_paid).click();
		Thread.sleep(2000);
		
		// call partial_full_paid
		full_paid_Bank();

		// fees_invoice_update
		driver.findElement(fees_invoice_update).click();
		Thread.sleep(2000);
		
		System.out.println("Successfully update with full bank");
	}
	
	/*
	 * 
	 * Add fees
	 * 
	 * 
	 */
	
	//fees invoice add fees
	public void ClickfeesInvoice_addFeesButton() throws InterruptedException, AWTException {
//		driver.get(Fees_invoice_url);
		
		driver.findElement(By.xpath("//*[@id=\"subMenuFees\"]/li[3]/a")).click();
		Thread.sleep(1000);
		
		//add_fees_invoice
		driver.findElement(add_fees_invoice).click();
		
		//call feesBasicInfo
		feesBasicInfo();
		System.out.println("Enter Basic info");
		
		System.out.println("Successfully inputed fees invoice basic info in cash");
		
		// payment_status
		driver.findElement(payment_status).click();
		Thread.sleep(2000);

		// call feesNotpaid();
		feesNotpaid();
		System.out.println("Successfull enter not paid");

		/*
		 * 
		 * partial paid cash
		 * 
		 */
		// call feesBasicInfo
		feesBasicInfo();
		System.out.println("Enter Basic info");

		// payment_status
		driver.findElement(payment_status).click();
		Thread.sleep(2000);

		// call feesNotpaid();
		FeesPartialpaid_cash();
		System.out.println("Successfull paid with partial cash");
		
		/*
		 * 
		 * partial paid cheque
		 * 
		 */
		// call feesBasicInfo
		feesBasicInfo();
		System.out.println("Successfully enter partial paid cheque");
		
		

		// payment_status
		driver.findElement(payment_status).click();
		Thread.sleep(2000);

		// call feesNotpaid();
		FeesPartialpaid_cheque();
		System.out.println("Successfull paid with partial cheque");
		
		/*
		 * 
		 * partial paid Bank
		 * 
		 */
		// call feesBasicInfo
		feesBasicInfo();
		System.out.println("Successfully inputed fees invoice basic info");

		// payment_status
		driver.findElement(payment_status).click();
		Thread.sleep(2000);

		// call feesNotpaid();
		FeesPartialpaid_Bank();
//		System.out.println("Successfull paid with partial Bank");

		/*
		 * 
		 * 
		 */
		// call feesBasicInfo
		feesBasicInfo();
		System.out.println("Enter Basic info");

		// payment_status
		driver.findElement(payment_status).click();
		Thread.sleep(2000);

		// call feesNotpaid();
		FeesFullpaid_cash();
		System.out.println("Successfull paid with full paid");

		/*
		 * 
		 * 
		 */
		// call feesBasicInfo
		feesBasicInfo();
		System.out.println("Enter Basic info");

		// payment_status
		driver.findElement(payment_status).click();
		Thread.sleep(2000);

		// call feesNotpaid();
		FeesFullpaid_cheque();
		System.out.println("Successfull paid with full cheque");
		

		/*
		 * 
		 * 
		 */
		// call feesBasicInfo
		feesBasicInfo();
		System.out.println("Enter Basic info");

		// payment_status
		driver.findElement(payment_status).click();
		Thread.sleep(2000);

		// call feesNotpaid();
		FeesFullpaid_Bank();
		System.out.println("Successfull paid with full Bank");
	
	}
	
	/*
	 * 
	 * 
	 * 
	 * 
	 */
	
	public void paidfunction(int i) throws InterruptedException {
		
		driver.findElement(paid_select1).click();
		Thread.sleep(1000);
		
		
//		driver.findElement(paid_payment1).click();
//		Thread.sleep(2000);
		
//		driver.findElement(paid_payment1_cancel).click();
//		Thread.sleep(2000);
		
//		driver.findElement(paid_select1).click();
//		Thread.sleep(1000);
		
		driver.findElement(paid_view1).click();
		Thread.sleep(1000);
		
		driver.navigate().back();
		Thread.sleep(1000);
		
	}
	
	/*
	 * 
	 * 
	 * 
	 * 
	 */
		


public void cash() throws InterruptedException {
	
	//unpaid_payment_method
	driver.findElement(unpaid_payment_method).click();
	Thread.sleep(1000);
	
	// unpaid_payment_cash
	driver.findElement(unpaid_payment_cash).click();
	Thread.sleep(1000);

	// partial_pay_due
	String due = driver.findElement(unpaid_due_amount).getAttribute("value");

	// partial_pay_paid_amount
	driver.findElement(unpaid_due_amount_value).sendKeys(due);
	Thread.sleep(1000);
	
	
	//fees_invoice_update
	driver.findElement(fees_invoice_update).click();
	Thread.sleep(1000);
	}

/*
 * 
 * 
 * Cheque
 * 
 */

public void cheque() throws InterruptedException, AWTException {
	
	//unpaid_payment_cheque
	driver.findElement(unpaid_payment_cheque).click();
	Thread.sleep(1000);
	
	//unpaid_payment_note
	driver.findElement(unpaid_payment_note).sendKeys("paid by cheque");
	Thread.sleep(1000);
	
	//unpaid_bank_browse
	driver.findElement(unpaid_bank_browse).click();
	Thread.sleep(1000);
	
	//file upload
	String filePath2=upload.getFilePath("home-banner1.jpg");
	upload.JPEGUpload(filePath2);
	Thread.sleep(1000);
	
	// fees_invoice_update
	driver.findElement(fees_invoice_update).click();
	Thread.sleep(1000);
	
	
}

/*
 * 
 * 
 * Bank
 * 
 * 
 */

public void bank() throws InterruptedException, AWTException {
	
	//unpaid_payment_bank
	driver.findElement(unpaid_payment_bank).click();
	Thread.sleep(1000);
	
	//unpaid_select_bank
	driver.findElement(unpaid_select_bank).click();
	Thread.sleep(1000);
	
	//unpaid_select_specific_bank
	driver.findElement(unpaid_select_specific_bank).click();
	Thread.sleep(1000);
	
	// unpaid_payment_note
	driver.findElement(unpaid_payment_note).sendKeys("paid by bank");
	Thread.sleep(1000);

	// unpaid_bank_browse
	driver.findElement(unpaid_bank_browse).click();
	Thread.sleep(1000);
	
	//file upload
	String filePath2=upload.getFilePath("home-banner1.jpg");
	upload.JPEGUpload(filePath2);
	Thread.sleep(1000);
	
	//unpaid_Add_payment
	driver.findElement(unpaid_Add_payment).click();
	Thread.sleep(1000);
	
}
	
	public void unpaidfunction(int i) throws InterruptedException, AWTException {
		
		
//		//click select
//		driver.findElement(By.xpath("//*[@id=\"table_id\"]/tbody/tr["+i+"]/td[10]/div/button")).click();
//		Thread.sleep(1000);
		
//		//click view payment
//		driver.findElement(By.xpath("//*[@id=\"table_id\"]/tbody/tr["+i+"]/td[10]/div/div/a[1]")).click();
//		Thread.sleep(3000);
		
		//cancel view payment
		//driver.findElement(By.xpath("(//button[@class='close'])[33]")).click();
		                             //body/div[2]/div[1]/section[2]/div[1]/div[2]/div[1]/div[34]/div[1]/div[1]/div[1]/button[1]
		//Thread.sleep(2000);
		
		//click select
		driver.findElement(By.xpath("//*[@id=\"table_id\"]/tbody/tr["+i+"]/td[10]/div/button")).click();
		Thread.sleep(2000);
		
		//view payment
		driver.findElement(By.xpath("//*[@id=\"table_id\"]/tbody/tr["+i+"]/td[10]/div/div/a[2]")).click();
		Thread.sleep(2000);
		driver.navigate().back();

		// click select
		driver.findElement(By.xpath("//*[@id=\"table_id\"]/tbody/tr["+i+"]/td[10]/div/button")).click();
		Thread.sleep(1000);
		
		//add payment
		driver.findElement(By.xpath("//*[@id=\"table_id\"]/tbody/tr[\"+i+\"]/td[10]/div/div/a[3]")).click();
		
		
		//call cash
		cash();
		Thread.sleep(1000);
		
		/*
		 * 
		 */
		
//		driver.findElement(By.xpath("//*[@id=\"table_id\"]/tbody/tr["+i+"]/td[10]/div/button")).click();
//		Thread.sleep(1000);
//		
//		
//		driver.findElement(By.xpath("//*[@id=\"table_id\"]/tbody/tr["+i+"]/td[10]/div/div/a[1]")).click();
//		Thread.sleep(1000);
//		
//		
//		driver.findElement(By.xpath("(//*[@id=\"table_id\"]/tbody/tr["+i+"]/td[10]/div/div/a[2]")).click();
//		Thread.sleep(1000);
//		
//		//call cheque
//		cheque();
//		Thread.sleep(1000);
//		
//		/*
//		 * 
//		 */
//		
//		driver.findElement(By.xpath("//*[@id=\"table_id\"]/tbody/tr["+i+"]/td[10]/div/button")).click();
//		Thread.sleep(1000);
//		
//		
//		driver.findElement(By.xpath("//*[@id=\"table_id\"]/tbody/tr["+i+"]/td[10]/div/div/a[1]")).click();
//		Thread.sleep(1000);
//		
//		
//		driver.findElement(By.xpath("(//*[@id=\"table_id\"]/tbody/tr["+i+"]/td[10]/div/div/a[2]")).click();
//		Thread.sleep(1000);
//		
//		//call cheque
//		bank();
//		Thread.sleep(1000);

		  
	}
		
	
	/*
	 * 
	 * 
	 * 
	 * 
	 */
	
	public void partial_paidView_cash() throws InterruptedException {
				
		//partial_pay_cash
		driver.findElement(partial_pay_cash).click();
		Thread.sleep(2000);
		
		//partial_pay_due
		String due = driver.findElement(partial_pay_due).getAttribute("value");
		
		//partial_pay_paid_amount
		driver.findElement(partial_pay_paid_amount).sendKeys(due);
		Thread.sleep(2000);
		
		//partial_pay_add_payment_button
		driver.findElement(partial_pay_add_payment_button).click();
		Thread.sleep(2000);
	
	}
	
	/*
	 * 
	 */
	
	public void partial_paidView_cheque() throws InterruptedException, AWTException {
		
		//partial_pay_cash
		driver.findElement(partial_pay_cheque).click();
		Thread.sleep(1000);
		
		//partial_pay_cheque_note
		driver.findElement(partial_pay_cheque_note).sendKeys("Payed by cheque");
		Thread.sleep(1000);
		
		//partial_pay_browse
		driver.findElement(partial_pay_browse).click();
		Thread.sleep(1000);
		
		//upload file
		String filePath2=upload.getFilePath("home-banner1.jpg");
		upload.JPEGUpload(filePath2);
		Thread.sleep(1000);
		
		//partial_pay_due
		String due = driver.findElement(partial_pay_due).getAttribute("value");
		
		//partial_pay_paid_amount
		driver.findElement(partial_pay_paid_amount).sendKeys(due);
		Thread.sleep(1000);
		
		//partial_pay_add_payment_button
		driver.findElement(partial_pay_add_payment_button).click();
		Thread.sleep(1000);
	
	}
	
	/*
	 * 
	 */
	
	public void partial_paidView_bank() throws InterruptedException, AWTException {
		
		//partial_pay_cash
		driver.findElement(partial_pay_bank).click();
		Thread.sleep(1000);
		
		//partial_pay_select_bank
		driver.findElement(partial_pay_select_bank).click();
		Thread.sleep(1000);
		
		//partial_pay_specific_Bank_pay
		driver.findElement(partial_pay_specific_Bank_pay).click();
		Thread.sleep(1000);
		
		//partial_pay_cheque_note
		driver.findElement(partial_pay_cheque_note).sendKeys("Payed by bank");
		Thread.sleep(1000);
		
		//partial_pay_browse
		driver.findElement(partial_pay_browse).click();
		Thread.sleep(1000);
		
		//upload file
		String filePath2=upload.getFilePath("home-banner1.jpg");
		upload.JPEGUpload(filePath2);
		Thread.sleep(1000);
		
		//partial_pay_due
		String due = driver.findElement(partial_pay_due).getAttribute("value");
		
		//partial_pay_paid_amount
		driver.findElement(partial_pay_paid_amount).sendKeys(due);
		Thread.sleep(1000);
		
		//partial_pay_add_payment_button
		driver.findElement(partial_pay_add_payment_button).click();
		Thread.sleep(1000);
	
	}
	
	public void partialPaidFunction(int i) throws InterruptedException, AWTException {
		
		
		//partial pay select
		By partial_pay_select = By.xpath("//*[@id=\"table_id\"]/tbody/tr["+i+"]/td[10]/div/button");
		
		//partial pay view payment
		//By partial_pay_view_payment = By.xpath("//*[@id=\"table_id\"]/tbody/tr["+i+"]/td[10]/div/div/a[1]");
		
//		//partial_pay_select
//		driver.findElement(partial_pay_select).click();
//		Thread.sleep(2000);
		
//		//partial_pay_view_payment
//		driver.findElement(partial_pay_view_payment).click();
//		Thread.sleep(3000);
		
		//partial_pay_view_payment_cancel
		//driver.findElement(partial_pay_view_payment_cancel).click();
		//Thread.sleep(1000);
		
		/*
		 * 
		 * 
		 */
		
		//partial_pay_select
		driver.findElement(partial_pay_select).click();
		Thread.sleep(1000);
		
		//partial pay view
		driver.findElement(By.xpath("//*[@id=\"table_id\"]/tbody/tr["+i+"]/td[10]/div/div/a[2]")).click();
		driver.navigate().back();
		
		//partial_pay_select
		driver.findElement(partial_pay_select).click();
		Thread.sleep(1000);
		
		//partial pay add payment
		driver.findElement(By.xpath("//*[@id=\"table_id\"]/tbody/tr["+i+"]/td[10]/div/div/a[3]")).click();
		
		//partial_pay_payment_method
		driver.findElement(partial_pay_payment_method).click();
		Thread.sleep(1000);
		
		//call paertial_paidView
		partial_paidView_cash();
		Thread.sleep(1000);
		
		/*
		 * 
		 * 
		 */
		
//		//partial_pay_select
//		driver.findElement(partial_pay_select).click();
//		Thread.sleep(1000);
		
//		//partial pay add payment
//		driver.findElement(By.xpath("//*[@id=\"table_id\"]/tbody/tr["+i+"]/td[10]/div/div/a[3]")).click();
//		
//		//partial_pay_payment_method
//		driver.findElement(partial_pay_payment_method).click();
//		Thread.sleep(1000);
//		
//		//call paertial_paidView
//		partial_paidView_cheque();
//		Thread.sleep(1000);
		
		/*
		 * 
		 * 
		 */
		
//		//partial_pay_select
//		driver.findElement(partial_pay_select).click();
//		Thread.sleep(1000);
//		
//		//partial pay add payment
//		driver.findElement(By.xpath("//*[@id=\"table_id\"]/tbody/tr["+i+"]/td[10]/div/div/a[3]")).click();
//		
//		//partial_pay_payment_method
//		driver.findElement(partial_pay_payment_method).click();
//		Thread.sleep(1000);
//		
//		//call paertial_paidView
//		partial_paidView_bank();
//		Thread.sleep(1000);
	
	}

	public void clickFeesinvoiceButton() throws InterruptedException, AWTException {
//		driver.get(Fees_invoice_url);
		
		driver.findElement(fees).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"subMenuFees\"]/li[3]/a")).click();
		Thread.sleep(1000);
			
		  int i=1;
		  int paid = 0;
		  int unpaid = 0;
		  int partial = 0;
		  boolean found = true;
		  
		  while(found) {
			   
			   if(driver.findElements(By.xpath("//*[@id=\"table_id\"]/tbody/tr["+i+"]/td[8]/button")).size() > 0) {
				   
				
				   
				  String Str = new String(driver.findElement(By.xpath("//*[@id=\"table_id\"]/tbody/tr["+i+"]/td[8]/button")).getText().trim());
				  System.out.println(Str);
					  
					  if(Str.matches("PAID")&& paid == 0) {
							System.out.println("Enter in Paid");
							this.paidfunction(i);
							paid =1;
							System.out.println("Paid =" + paid);
							
							System.out.println("Successfully fees paid");
							
						}
						else if(Str.matches("UNPAID")&& unpaid == 0)
						{
							System.out.println("Enter in Unpaid");
							//*[@id="table_id"]/tbody/tr["+i+"]/td[10]/div/button
							this.unpaidfunction(i);
							unpaid =1;
							System.out.println("UnPaid =" + unpaid);
							System.out.println("Successfully fees Unpaid");
						}
						else if(Str.matches("PARTIAL")&& partial == 0)
						{
							System.out.println("Enter in partial");
							this.partialPaidFunction(i);
							partial = 1;
							System.out.println("Partial =" + partial);
							System.out.println("Successfully fees partial paid");
							
						}
					  
					  if(paid ==1 && unpaid == 1 && partial == 1)
						  break;
					 
				   
			   } else {
				   
				   found = false;
			   }
			   i = i+1;
			  
		  }
		  
		  

	}
	
	/*
	 * 
	 * 
	 * Bank_payment
	 * 
	 * 
	 */
	
	public void clickBank_paymentButton() throws InterruptedException {
		
//		//fees
//		driver.findElement(fees).click();
//		Thread.sleep(1000);
		
		//Bank_payment
		driver.findElement(Bank_payment).click();
		Thread.sleep(1000);
		
//		//Bank_payment_note
//		driver.findElement(Bank_payment_note).click();
//		Thread.sleep(1000);
//		
//		//Bank_payment_note_cancel
//		driver.findElement(Bank_payment_note_cancel).click();
//		Thread.sleep(1000);
		
		
	}
	

	
	/*
	 * 
	 * 
	 * 
	 */
	
public String name() {
		
		
		return RandomStringUtils.randomAlphabetic(8); 
	}
	
	
	public void feesinvoiceinput() throws InterruptedException {

		// fees_invoice_unique_start
		driver.findElement(fees_invoice_unique_start).clear();
		Thread.sleep(1000);
		
		driver.findElement(fees_invoice_unique_start).sendKeys(this.unique_id);
		Thread.sleep(1000);

		// fees_invoice_prefix
		driver.findElement(fees_invoice_prefix).clear();
		Thread.sleep(1000);
		
		driver.findElement(fees_invoice_prefix).sendKeys(this.prefix);
		Thread.sleep(1000);

		// fees_invoice_class limit
		driver.findElement(fees_invoice_class_limit).clear();
		Thread.sleep(1000);
		
		driver.findElement(fees_invoice_class_limit).sendKeys(this.class_limit);
		Thread.sleep(1000);

		// fees_invoice_section limit
		driver.findElement(fees_invoice_section_limit).clear();
		Thread.sleep(1000);
		
		driver.findElement(fees_invoice_section_limit).sendKeys(this.section_limit);
		Thread.sleep(1000);

		// fees_invoice_admission limit
		driver.findElement(fees_invoice_admission_limit).clear();
		Thread.sleep(1000);
		
		driver.findElement(fees_invoice_admission_limit).sendKeys(this.admission_no_limit);
		Thread.sleep(1000);
	}
	
	public void clickfees_invoice_settingButton() throws InterruptedException, AWTException {
		
//		driver.findElement(fees).click();
//		Thread.sleep(1000);

		driver.findElement(fees_invoice_setting).click();
		Thread.sleep(1000);
				
		int position_number = driver.findElements(By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div/ul[1]/li")).size();
		System.out.println(position_number);
		int i = 1;

		while (i<position_number) {
			
			driver.findElement(By.xpath("//*[@id=\"s2id_e1\"]/ul/li[1]/a")).click();
			Thread.sleep(2000);
			i++;
			
		}

		
		WebElement ele = driver.switchTo().activeElement();

		ele.sendKeys("prefix");	
		ele.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			
			System.out.println("Successfully inputed invoice header");
			
			

		
		String preview = driver.findElement(invoice_number_preview).getText();
		System.out.println(preview);
		
		
		
		//call feesinvoiceinput
		feesinvoiceinput();
		Thread.sleep(1000);
		
		//call ClickfeesInvoice_addFeesButton
		ClickfeesInvoice_addFeesButton();
		Thread.sleep(1000);
		
		//call clickFeesinvoiceButton
		clickFeesinvoiceButton();
		Thread.sleep(1000);
		
		System.out.println("Successfully Created fees invoice settings");
	}
	
	/*
	 * 
	 * 
	 * Report
	 * 
	 * 
	 */
	
	public void reportButton() throws InterruptedException {
		
		//fees_due_report_date_range
		driver.findElement(fees_due_report_date_range).click();
		Thread.sleep(1000);
		
		//fees_due_report_date_range_apply
		driver.findElement(fees_due_report_date_range_apply).click();
		Thread.sleep(1000);
		
		//fees_due_report_select_class
		driver.findElement(fees_due_report_select_class).click();
		Thread.sleep(1000);
		
		//fees_due_report_select_specific_class
		driver.findElement(fees_due_report_select_specific_class).click();
		Thread.sleep(1000);
		
		//fees_due_report_select_section
		driver.findElement(fees_due_report_select_section).click();
		Thread.sleep(1000);
		
		//fees_due_report_select_specific_section
		driver.findElement(fees_due_report_select_specific_section).click();
		Thread.sleep(1000);
		
		//fees_due_report_select_student
		driver.findElement(fees_due_report_select_student).click();
		Thread.sleep(1000);
		
		//fees_due_report_select_specific_student
		driver.findElement(fees_due_report_select_specific_student).click();
		Thread.sleep(1000);
		
		//fees_due_report_search
		driver.findElement(fees_due_report_search).click();
		Thread.sleep(1000);
		
		
	}
	
	public void clickreportButton() throws InterruptedException {
		
		//fees
		driver.findElement(fees).click();
		Thread.sleep(1000);
		
		//report
		driver.findElement(report).click();
		Thread.sleep(1000);
		
		//fees_due_report
		driver.findElement(fees_due_report).click();
		Thread.sleep(1000);
		
		//call reportButton
		reportButton();
		Thread.sleep(1000);
		
		System.out.println("Successfully showed fees due report");

		/*
		 * 
		 */
		
		//fees
		driver.findElement(fees).click();
		Thread.sleep(1000);
		
		//report
		driver.findElement(report).click();
		Thread.sleep(1000);
		
		//fine_report
		driver.findElement(fine_report).click();
		Thread.sleep(1000);
		
		
		//call reportButton
		reportButton();
		Thread.sleep(1000);
		
		System.out.println("Successfully showed fine report");
		
		/*
		 * 
		 */
		
		//fees
		driver.findElement(fees).click();
		Thread.sleep(1000);
		
		//report
		driver.findElement(report).click();
		Thread.sleep(1000);
		
		//payment_report
		driver.findElement(payment_report).click();
		Thread.sleep(1000);
		
		//call reportButton
		reportButton();
		Thread.sleep(1000);
		
		System.out.println("Successfully showed payment report");
		
		/*
		 * 
		 */
		
		//fees
		driver.findElement(fees).click();
		Thread.sleep(1000);
		
		//report
		driver.findElement(report).click();
		Thread.sleep(1000);
		
		//payment_report
		driver.findElement(balance_report).click();
		Thread.sleep(1000);
		
		//call reportButton
		reportButton();
		Thread.sleep(1000);
		
		System.out.println("Successfully showed balance report");
		
		/*
		 * 
		 */
		
		//fees
		driver.findElement(fees).click();
		Thread.sleep(1000);
		
		//report
		driver.findElement(report).click();
		Thread.sleep(1000);
		
		//payment_report
		driver.findElement(waiver_report).click();
		Thread.sleep(1000);
		
		//call reportButton
		reportButton();
		Thread.sleep(1000);
		
		System.out.println("Successfully showed waiver report");
		System.out.println("Checkout from Fees");
		
	}

}
