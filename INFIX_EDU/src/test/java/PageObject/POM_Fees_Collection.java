package PageObject;

import java.awt.AWTException;
import java.util.ArrayList;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Common_Method.CommonMethod;


public class POM_Fees_Collection {
	
	WebDriver driver = null;
	String Fees_discount_name,Fees_discount_code,feesName_collect;
	
	public POM_Fees_Collection(WebDriver driver) throws InterruptedException {
		
		this.driver = driver;
		Fees_discount_name = this.name();
		Fees_discount_code = this.code();
		
		//String  search_name = driver.findElement(By.xpath("//*[@id=\"main-content\"]/section/div/form/div/div/div[2]/div[2]/div/table/tbody[1]/tr[1]/td[2]")).getText();
		
	}
	
	CommonMethod upload = new CommonMethod();
	
	//Fees collection
	By fees_collection = By.xpath("//div[contains(text(),'Fees Collection')]");
	
	//Fees group
	By fees_group = By.xpath("(//a[contains(text(),'Fees Group')])[1]");
	
	//fees group name
	By fees_group_name = By.name("name");
	
	//fees group description
	By fees_group_collection = By.name("description");
	
	//fees group save
	By fees_group_save = By.xpath("//button[@class='primary-btn fix-gr-bg submit']");
	
	//fees group select
	By fees_group_select = By.xpath("(//button[@class='btn dropdown-toggle'])[1]");
	
	//fees group edit 
	By fees_group_edit = By.xpath("//*[@id=\"table_id\"]/tbody/tr[1]/td[3]/div/div/a[1]");
	
	//fees group delete
	By fees_group_delete = By.xpath("(//a[@class='dropdown-item deleteFeesGroupModal'])[1]");
	
	//fees group cancel
	By fees_group_delete_cancel = By.xpath("(//button[@class='primary-btn tr-bg'])[1]");
	
	//fees group delete
	By fees_group_delete_confirm = By.xpath("(//button[@class='primary-btn fix-gr-bg'])[1]");
	
	/*
	 * 
	 * Fees Type
	 * 
	 */
	
	//Fees type
	By fees_type = By.xpath("(//a[contains(text(),'Fees Type')])[1]");
	
	//Fees name
	By fees_type_name = By.name("name");
	
	//fees type group
	By fees_type_group = By.xpath("//div[@class='nice-select niceSelect w-100 bb form-control']");
	
	//fees type specific group
	By fees_type_specific_group = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[2]/div/div/ul/li[2]");
	
	//fees type description
	By fees_type_description = By.name("description");
	
	//fees_type_save
	By fees_type_save = By.xpath("//button[@class='primary-btn fix-gr-bg submit']");
	
	//fees type action select
	By fees_type_action_select = By.xpath("(//button[@class='btn dropdown-toggle'])[1]");
	
	//fees type edit
	By fees_type_edit = By.xpath("//*[@id=\"table_id\"]/tbody/tr[1]/td[4]/div/div/a[1]");
	
	//fees type delete
	By fees_type_delete = By.xpath("//*[@id=\"table_id\"]/tbody/tr[1]/td[4]/div/div/a[2]");
	
	//fee type delete cancel
	By fees_type_delete_cancel = By.xpath("(//button[@class='primary-btn tr-bg'])[1]");
	
	//fees type delete confirm
	By fees_type_delete_confirm = By.xpath("(//button[@class='primary-btn fix-gr-bg'])[1]");
	
	/*
	 * 
	 * Fees master
	 * 
	 */
	
	//fees master
	By fees_master = By.xpath("(//a[contains(text(),'Fees Master')])[1]");
	
	//fees master specific type
	By fees_master_specific_type = By.xpath("//*[@id=\"fees_master_form\"]/div/div/div[1]/div/div/ul/li[2]");
	
	/*
	 * 
	 * 
	 */
	//date
	//fees_master_click date
	By fees_master_clickdate = By.id("startDate");
	
	//fees_master_get month
	By fees_master_getmonth = By.xpath("/html[1]/body[1]/div[5]/div[1]/table[1]/thead[1]/tr[1]/th[2]");
	
	//fees_master_sitebar
	By fees_master_sitebar = By.xpath("//body[1]/div[5]/div[1]/table[1]/thead[1]/tr[1]/th[1]");
	
	//fees_master_datepicker
	public int  day = 15;
	By fees_master_ = By.xpath("/html[1]/body[1]/div[5]/div[1]/table[1]/tbody[1]/tr/td[contains(text(),"+day+")]");
	
	/*
	 * 
	 */
	
	//fees master amount
	By fees_master_amount = By.name("amount");
	
	//fees master save
	By fees_master_save = By.xpath("//button[@class='primary-btn fix-gr-bg submit']");
	
	//fees master select1
	By fees_master_select1 = By.xpath("(//button[@class='btn dropdown-toggle ml-20'])[1]");
	
	//fees master edit
	By fees_master_edit = By.xpath("//*[@id=\"table_id\"]/tbody/tr/td[2]/div[1]/div[3]/div/div/a[1]");
	
	//fees master delete
	By fees_master_delete = By.xpath("//*[@id=\"table_id\"]/tbody/tr/td[2]/div[1]/div[3]/div/div/a[2]");
	
	//fees master delete cancel
	By fees_master_delete_cancel = By.xpath("(//button[@class='primary-btn tr-bg'])[1]");
	
	//fees master delete confirm
	By fees_master_delete_confirm = By.xpath("(//button[@class='primary-btn fix-gr-bg'])[1]");
	
	/*
	 * 
	 */
	
	//fees master select2
	By fees_master_select2 = By.xpath("(//button[@class='btn dropdown-toggle'])[1]");
	
	//fess master assign/view
	By fees_master_assign = By.xpath("//*[@id=\"table_id\"]/tbody/tr/td[3]/div[1]/div/a[1]");
	
	//fees master select class 
	By fees_master_select_class = By.xpath("(//div[@class='nice-select niceSelect w-100 bb form-control'])[1]");
	
	//fees master specific class
	By fees_master_specific_class = By.xpath("//*[@id=\"search_studentA\"]/div/div[1]/div/ul/li[2]");
	
	//fees master select section
	By fees_master_select_section = By.xpath("(//div[@class='nice-select niceSelect w-100 bb form-control'])[2]");
	
	//fees master specific section
	By fees_master_specific_section = By.xpath("//*[@id=\"select_section_div\"]/div[1]/ul/li[2]");
	
	//fees master select category
	By fees_master_select_category = By.xpath("(//div[@class='nice-select niceSelect w-100 bb form-control'])[3]");
	
	//fees master specific category
	By fees_master_specific_category = By.xpath("//*[@id=\"search_studentA\"]/div/div[3]/div/ul/li[2]");
	
	//fees master select group
	By fees_master_select_group = By.xpath("(//div[@class='nice-select niceSelect w-100 bb form-control'])[4]");
	
	//fees master specific group
	By fees_master_specific_group = By.xpath("//*[@id=\"search_studentA\"]/div/div[4]/div/ul/li[2]");
	
	//fees master assign search
	By fees_master_asign_search = By.xpath("//button[@class='primary-btn small fix-gr-bg']");
	
	/*
	 * 
	 */
	
	//fees master check mark
	By fees_master_check_mark2 = By.xpath("//*[@id=\"main-content\"]/section/div/form/div/div/div[2]/div[2]/div/table/tbody[1]/tr[1]/td[1]/label");
	
	//fees master check mark
	By fees_master_check_mark = By.xpath("//*[@id=\"student.24\"]"); 

	//fees master check save fees
	By fees_master_check_save_fees = By.xpath("//button[@class='primary-btn fix-gr-bg mb-0 submit']");
	
	//fees master delete2
	By fees_master_delete2 = By.xpath("//*[@id=\"table_id\"]/tbody/tr/td[3]/div[1]/div/a[2]");
	
	//fees master delete confirm2
	By fees_master_delete_confirm2 = By.xpath("(//button[@class='primary-btn fix-gr-bg'])[1]");
	
	/*
	 * 
	 * 
	 * Fees Discount
	 * 
	 * 
	 */
	
	//fees discount
	By fees_discount = By.xpath("(//a[contains(text(),'Fees Discount')])[1]");
	
	//fees discount name
	By fees_discount_name = By.name("name");
	
	//fees discount code
	By fees_discount_code = By.name("code");
	
	//fees discount once
	By fees_discount_once = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[3]/div/div/div[1]/label");
	
	//fees discount year
	By fees_discount_year = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[3]/div/div/div[2]/label");
	
	//fees discount amount
	By fees_discount_amount = By.name("amount");
	
	//fees discount description
	By fees_discount_description = By.name("description");
	
	//fees discount save
	By fees_discount_save = By.xpath("//button[@class='primary-btn fix-gr-bg submit']");
	
	/*
	 * 
	 */
	
	//fees discount select
	By fees_discount_select = By.xpath("(//button[@class='btn dropdown-toggle'])[1]");
	
	//fees discount assign
	By fees_discount_assign = By.xpath("//*[@id=\"table_id\"]/tbody/tr[1]/td[5]/div/div/a[1]");
	
	//fees discount select fees type
	By fees_discount_select_fees_type = By.xpath("//*[@id=\"main-content\"]/section/div/form/div/div/div[2]/div[2]/div/table/tbody[1]/tr[1]/td[5]/div/span");
	
	//fees discount specific fees type 
	By fees_discount_specific_fees_type = By.xpath("//*[@id=\"main-content\"]/section/div/form/div/div/div[2]/div[2]/div/table/tbody[1]/tr[1]/td[5]/div/ul/li[3]");
	By fees_discount_specific_fees_type2 = By.xpath("//*[@id=\"main-content\"]/section/div/form/div/div/div[2]/div[2]/div/table/tbody[1]/tr[1]/td[5]/div/ul/li[2]");
	
	//fees discount assign complete
	By fees_discount_assign_complete = By.xpath("//button[@class='primary-btn fix-gr-bg mb-0']");
	
	//fees discount edit
	By fees_discount_edit = By.xpath("//*[@id=\"table_id\"]/tbody/tr[1]/td[5]/div/div/a[2]");
	
	//fees discount delete
	By fees_discount_delete = By.xpath("//*[@id=\"table_id\"]/tbody/tr[1]/td[5]/div/div/a[3]");
	
	//fees discount delete cancel
	By fees_discount_delete_cancel = By.xpath("(//button[@class='primary-btn tr-bg'])[2]");
	
	//fees discount delete confirm
	By fees_discount_delete_confirm = By.xpath("(//button[@class='primary-btn fix-gr-bg'])[2]");
	
	/*
	 * 
	 * 
	 * Collection Fees
	 * 
	 * 
	 */
	
	//collection fees
	By collection_fees = By.xpath("(//a[contains(text(),' Collect Fees')])");
	
	//collect fees class 
	By collect_fees_class = By.xpath("(//div[@class='nice-select w-100 bb niceSelect form-control'])[1]");
	
	//collect fees specific class
	By collect_fees_specific_class = By.xpath("//*[@id=\"search_student\"]/div/div[1]/div/ul/li[2]");
	
	//collect fees section
	By collect_fees_section = By.xpath("(//div[@class='nice-select w-100 bb niceSelect form-control'])[2]");
	
	//collect fees specific section
	By collect_fees_specific_section = By.xpath("//*[@id=\"select_section_div\"]/div[1]/ul/li[2]");
	
	//collect fees search name
	By collect_fees_search_name = By.name("keyword");
	
	//collect fees search
	By collect_fees_search = By.xpath("(//button[@class='primary-btn small fix-gr-bg'])");
	
	//action collect fees
	By action_collect_fees = By.xpath("//a[@class='primary-btn small tr-bg']");
	
	/*
	 * 
	 * Search fees Payment
	 * 
	 */
	
	//search fees payment
	By search_fees_payment = By.xpath("(//a[contains(text(),'Search Fees Payment')])[1]");
	
	//fees payment select
	By fees_payment_select = By.xpath("(//button[@class='btn dropdown-toggle'])[1]");
	
	//fees payment edit fees
	By fees_payment_edit_fees = By.xpath("(//a[@class='dropdown-item modalLink'])[1]");
	
	//fees payment save information
	By fees_payment_save_information = By.xpath("//*[@id=\"showDetaildModalBody\"]/div/form/div/div[2]/div/button[2]");
	
	//fees payment view
	By fees_payment_view = By.xpath("//*[@id=\"table_id\"]/tbody/tr[1]/td[8]/div/div/a[2]");
	
	/*
	 * 
	 * Search fees due
	 * 
	 */
	
	//search fees due
	By search_fees_due = By.xpath("(//a[contains(text(),'Search Fees Due')])[1]");
	
	//search fees due group
	By search_fees_due_group = By.xpath("(//div[@class='nice-select w-100 bb niceSelect form-control'])[1]");
	
	//search_fees_due_specific_group
	By search_fees_due_specific_group = By.xpath("//*[@id=\"search_student\"]/div/div[1]/div/ul/li[3]");
	
	//search fees due class
	By search_fees_due_class = By.xpath("(//div[@class='nice-select w-100 bb niceSelect form-control'])[2]");
	
	//By search_fees_due_specific class
	By search_fees_due_specific_class = By.xpath("//*[@id=\"search_student\"]/div/div[2]/div/ul/li[2]");
	
	//search fees due section
	By search_fees_due_section = By.xpath("(//div[@class='nice-select w-100 bb niceSelect form-control'])[3]");
	
	//search fees due specific section
	By search_fees_due_specific_section = By.xpath("//*[@id=\"select_section_div\"]/div[1]/ul/li[2]");
	
	//search fees due search
	By search_fees_due_search = By.xpath("(//button[@class='primary-btn small fix-gr-bg'])[1]");
	
	/*
	 * 
	 * Bank payment
	 * 
	 */
	
	//Bank Payment
	By fees_collection_bank_payment = By.xpath("(//a[contains(text(),' Bank Payment')])[1]");
	
	//fees collection select class
	By fees_collection_Class = By.xpath("(//div[@class='nice-select niceSelect w-100 bb form-control'])[1]");
	
	//fees collection specific class
	By fees_collection_specific_class = By.xpath("//*[@id=\"search_studentA\"]/div/div[1]/div/ul/li[2]");
	
	//fees collection select section
	By fees_collection_section = By.xpath("(//div[@class='nice-select niceSelect w-100 bb form-control'])[2]");
	
	//fees collection specific section
	By fees_collection_specific_section = By.xpath("//*[@id=\"select_section_div\"]/div[1]/ul/li[2]");
	
	//fees collection select status
	By fees_collection_status = By.xpath("(//div[@class='nice-select niceSelect w-100 bb form-control'])[3]");
	
	//fees collection status pending
	By fees_collection_status_pending = By.xpath("//*[@id=\"search_studentA\"]/div/div[4]/div/ul/li[2]");
	
	//fees collectionSearch
	By fees_collection_search = By.xpath("//*[@id=\"search_studentA\"]/div/div[5]/button");
	
	//fees collection status approved
	By fees_collection_status_approved = By.xpath("//*[@id=\"search_studentA\"]/div/div[4]/div/ul/li[3]");
	
	//fees collection pending select
	By fees_collection_pending_select = By.xpath("//*[@id=\"table_id\"]/tbody/tr/td[8]/div/button");
	
	//fees collection pending approve
	By fees_collection_pending_approve = By.xpath("//*[@id=\"table_id\"]/tbody/tr/td[8]/div/div/a[1]");
	
	//fees collection pending approve confirm
	By fees_collection_pending_approve_confirm = By.xpath("(//button[@class='primary-btn fix-gr-bg'])[1]");
	
	/*
	 * 
	 * Fees carry forward
	 * 
	 */
	
	//fees carry forward
	By fees_carryforward = By.xpath("(//a[contains(text(),'Fees Carry Forward')])[1]");
	
	//fees carry class
	By fees_carry_class = By.xpath("(//div[@class='nice-select niceSelect w-100 bb form-control'])[1]");
	
	//fees carry specific class
	By fees_carry_specific_class = By.xpath("//*[@id=\"search_studentA\"]/div/div[1]/div/ul/li[2]");
	
	//fees carry section
	By fees_carry_section = By.xpath("(//div[@class='nice-select niceSelect w-100 bb form-control'])[2]");
	
	//fees carry specific section
	By fees_carry_specific_section = By.xpath("//*[@id=\"select_section_div\"]/div/ul/li[2]");
	
	//fees carry forward search
	By fees_carry_forward_search = By.xpath("(//button[@class='primary-btn small fix-gr-bg'])");
	
	//fees carry forward save
	By fees_carry_forward_save = By.xpath("(//button[@class='primary-btn fix-gr-bg mb-0 submit'])");
	
	/*
	 * 
	 * collection report
	 * 
	 */
	
	//collection report
	By collection_report = By.xpath("(//a[contains(text(),'Collection Report')])[1]");
	
	//collection report date range
	By collection_reportdate_range = By.name("date_range");
	
	//collection fees date apply
	By collection_fees_date_apply = By.xpath("(//button[@class='applyBtn btn btn-sm btn-primary'])");
	
	//collection fees class
	By collection_fees_class = By.xpath("(//div[@class='nice-select niceSelect w-100 bb form-control'])[1]");
	
	//collection fees specific class
	By collection_fees_specific_class = By.xpath("//*[@id=\"search_student\"]/div/div[2]/div/ul/li[2]");
	
	//collection_fees_section
	By collection_fees_section = By.xpath("(//div[@class='nice-select niceSelect w-100 bb form-control'])[2]");
	
	//collection_fees_specific section
	By collection_fees_specific_section = By.xpath("//*[@id=\"select_section_div\"]/div[1]/ul/li[2]");
	
	//collection fees search
	By collection_fees_search = By.xpath("(//button[@class='primary-btn small fix-gr-bg'])");
	
	/*
	 * 
	 * 
	 * Fess Group
	 * 
	 * 
	 */
	
	public void clickFeesGroupButton() throws InterruptedException {
		
		
		//fees_collection
		driver.findElement(fees_collection).click();
		Thread.sleep(1000);
		
		System.out.println("Successfully Enter fees_group");
		
		//fees_group
		driver.findElement(fees_group).click();
		Thread.sleep(1000);
		
		//fees_group_name
		driver.findElement(fees_group_name).sendKeys("Group 1");
		Thread.sleep(1000);
		
		//fees_group_collection
		driver.findElement(fees_group_collection).sendKeys("It is a long established fact that a reader will be distracted "
				+ "by the readable content of a page when looking at its layout.");
		Thread.sleep(1000);
		
		//fees_group_save
		driver.findElement(fees_group_save).click();
		Thread.sleep(1000);
		
		//fees_group_select
		driver.findElement(fees_group_select).click();
		Thread.sleep(1000);
		
		//fees_group_edit
		driver.findElement(fees_group_edit).click();
		Thread.sleep(1000);
		
		//fees_group_save
		driver.findElement(fees_group_save).click();
		Thread.sleep(1000);
		
		//fees_group_select
		driver.findElement(fees_group_select).click();
		Thread.sleep(1000);
		
		//fees_group_delete
		driver.findElement(fees_group_delete).click();
		Thread.sleep(1000);
		
		//fees_group_delete_cancel
		driver.findElement(fees_group_delete_cancel).click();
		Thread.sleep(1000);
		
		System.out.println("Successfully Generated Fees Group");
		
//		//fees_group_select
//		driver.findElement(fees_group_select).click();
//		Thread.sleep(1000);
//		
//		//fees_group_delete
//		driver.findElement(fees_group_delete).click();
//		Thread.sleep(1000);
//		
//		//fees_group_delete_confirm
//		driver.findElement(fees_group_delete_confirm).click();
//		Thread.sleep(1000);
		
	}	
	
	/*
	 * 
	 * fees_type
	 * 
	 */
	
	public void clickfees_typeButton() throws InterruptedException {
		
		//fees_collection
		driver.findElement(fees_collection).click();
		Thread.sleep(1000);
		
		System.out.println("Successfully Enter fees_type");
		
		//fees_type
		driver.findElement(fees_type).click();
		Thread.sleep(1000);
		
		//fees_type_name
		driver.findElement(fees_type_name).sendKeys("Type 1");
		Thread.sleep(1000);
		
		//fees_type_group
		driver.findElement(fees_type_group).click();
		Thread.sleep(1000);
		
		//fees_type_specific_group
		driver.findElement(fees_type_specific_group).click();
		Thread.sleep(1000);
		
		//fees_type_description
		driver.findElement(fees_type_description).sendKeys("It is a long established fact that a reader will be "
				+ "distracted by the readable content of a page when looking at its layout.");
		
		//fees_type_save
		driver.findElement(fees_type_save).click();
		Thread.sleep(1000);
		
		//fees_type_action_select
		driver.findElement(fees_type_action_select).click();
		Thread.sleep(1000);
		
		//fees_type_edit
		driver.findElement(fees_type_edit).click();
		Thread.sleep(1000);
		
		//fees_type_save
		driver.findElement(fees_type_save).click();
		Thread.sleep(1000);
		
		System.out.println("Successfully Generated Fees Type");
		
//		//fees_type_action_select
//		driver.findElement(fees_type_action_select).click();
//		Thread.sleep(1000);
		
//		//fees_type_delete
//		driver.findElement(fees_type_delete).click();
//		Thread.sleep(1000);
//		
//		//fees_type_delete_cancel
//		driver.findElement(fees_type_delete_cancel).click();
//		Thread.sleep(1000);
		
//		//fees_type_action_select
//		driver.findElement(fees_type_action_select).click();
//		Thread.sleep(1000);
//		
//		//fees_type_delete
//		driver.findElement(fees_type_delete).click();
//		Thread.sleep(1000);
//		
//		//fees_type_delete_confirm
//		driver.findElement(fees_type_delete_confirm).click();
//		Thread.sleep(1000);
		
	}
	
	/*
	 * 
	 * Fees master
	 * 
	 */
	
	public void feesmaster() throws InterruptedException {
		
		//fees_master_select1
		driver.findElement(fees_master_select1).click();
		Thread.sleep(1000);
		
		//fees_master_edit
		driver.findElement(fees_master_edit).click();
		Thread.sleep(1000);
		
		//fees_master_save
		driver.findElement(fees_master_save).click();
		Thread.sleep(1000);
		
		System.out.println("Successfully Edit Fees Master");
		
//		//fees_master_select1
//		driver.findElement(fees_master_select1).click();
//		Thread.sleep(1000);
		
//		//fees_master_delete
//		driver.findElement(fees_master_delete).click();
//		Thread.sleep(1000);
//		
//		//fees_master_delete_cancel
//		driver.findElement(fees_master_delete_cancel).click();
//		Thread.sleep(1000);
		
//		//fees_master_select1
//		driver.findElement(fees_master_select1).click();
//		Thread.sleep(1000);
//		
//		//fees_master_delete
//		driver.findElement(fees_master_delete).click();
//		Thread.sleep(1000);
//		
//		//fees_master_delete_confirm
//		driver.findElement(fees_master_delete_confirm).click();
//		Thread.sleep(1000);
		
		/*
		 * 
		 */
		
		//fees_master_select2
		driver.findElement(fees_master_select2).click();
		Thread.sleep(1000);
		
		//fees_master_assign
		driver.findElement(fees_master_assign).click();
		Thread.sleep(1000);
		
		//fees_master_select_class
		driver.findElement(fees_master_select_class).click();
		Thread.sleep(1000);
		
		//fees_master_specific_class
		driver.findElement(fees_master_specific_class).click();
		Thread.sleep(1000);
		
		//fees_master_select_section
		driver.findElement(fees_master_select_section).click();
		Thread.sleep(1000);
		
		//fees_master_specific_section
		driver.findElement(fees_master_specific_section).click();
		Thread.sleep(1000);
		
		//fees_master_select_category
		driver.findElement(fees_master_select_category).click();
		Thread.sleep(1000);
		
		//fees_master_specific_category
		driver.findElement(fees_master_specific_category).click();
		Thread.sleep(1000);
		
		//fees_master_select_group
		driver.findElement(fees_master_select_group).click();
		Thread.sleep(1000);
		
		//fees_master_specific_group
		driver.findElement(fees_master_specific_group).click();
		Thread.sleep(1000);
		
		//fees_master_asign_search
		driver.findElement(fees_master_asign_search).click();
		Thread.sleep(1000);
		
		System.out.println("Successfully Search Fees Master Asign");
		
		if(driver.findElement(fees_master_check_mark).isSelected()) {
			
			driver.findElement(fees_master_check_save_fees).click();
			
			System.out.println("Successfully saved checked mark read fees master");
		}
		
		else{
			driver.findElement(fees_master_check_mark2).click();
			Thread.sleep(1000);
			driver.findElement(fees_master_check_save_fees).click();
			Thread.sleep(1000);
			
			System.out.println("Successfully saved Unchecked mark read fees master");
		}
		
//		/*
//		 * 
//		 */
//		
//		//fees_collection
//		driver.findElement(fees_collection).click();
//		Thread.sleep(1000);
//		
//		//fees_master
//		driver.findElement(fees_master).click();
//		Thread.sleep(1000);
//		
//		//fees_master_select2
//		driver.findElement(fees_master_select2).click();
//		Thread.sleep(1000);
//		
//		//fees_master_delete2
//		driver.findElement(fees_master_delete2).click();
//		Thread.sleep(1000);
//		
//		driver.findElement(fees_master_delete_confirm2).click();;
//		Thread.sleep(1000);
		
	}
	
	
	public void clickfees_masterButton() throws InterruptedException {
		
//		//fees_collection
//		driver.findElement(fees_collection).click();
//		Thread.sleep(1000);
		
		System.out.println("Successfully Enter fees_master");
		
		//fees_master
		driver.findElement(fees_master).click();
		Thread.sleep(1000);
		
		//fees_type_group
		driver.findElement(fees_type_group).click();
		Thread.sleep(1000);
		
		int size = driver.findElements(By.xpath("//*[@id=\"fees_master_form\"]/div/div/div[1]/div/div/ul/li")).size();
		System.out.println(size);
		
		if(size==1) {
			feesmaster();
		}
		
		else {
			
			//fees_master_specific_type
			driver.findElement(fees_master_specific_type).click();
			Thread.sleep(1000);
			
			/*
			 * 
			 * 
			 * 
			 */
			// date

			// clickuploaddatebutton

			String month2 = "MARCH 2022";

			driver.findElement(fees_master_clickdate).click(); // click calender

			while (true) {
				String text = driver.findElement(fees_master_getmonth).getText(); // locator is month and year

				if (text.equals(month2)) {
					break;
				} else {

					driver.findElement(fees_master_sitebar).click(); // locator of site arrow.you have to change it
				}
			}

			driver.findElement(fees_master_).click(); // locator of all date.
			
			
			//fees_master_amount
			driver.findElement(fees_master_amount).sendKeys("1234");
			Thread.sleep(1000);
			
			//fees_master_save
			driver.findElement(fees_master_save).click();
			Thread.sleep(1000);
			
			System.out.println("Successfully saved fees master with fees type");
			
			//feesmaster();
			feesmaster();
			
		}
		

	}
		

	
	/*
	 * 
	 * 
	 * fees_discount
	 * 
	 * 
	 */
	
public String name() {
		
		
		return RandomStringUtils.randomAlphabetic(5); 
	}

public String code() {
	
	
	return RandomStringUtils.randomAlphanumeric(5); 
}
	
	public void discount_code() throws InterruptedException {
		
		//fees_discount_name
		driver.findElement(fees_discount_name).sendKeys(this.Fees_discount_name);
		Thread.sleep(1000);
		
		//fees_discount_code
		driver.findElement(fees_discount_code).sendKeys(this.Fees_discount_code);
		Thread.sleep(1000);
		
	}
	
	public void Discountsave() throws InterruptedException {
		
		//fees_discount_amount
		driver.findElement(fees_discount_amount).sendKeys("123");
		Thread.sleep(1000);
		
		//fees_discount_description
		driver.findElement(fees_discount_description).sendKeys("It is a long established fact that a reader will be distracted"
				+ " by the readable content of a page when looking at its layout.");
		
		//fees_discount_save
		driver.findElement(fees_discount_save).click();
		Thread.sleep(1000);
		
		System.out.println("Successfully saved  Fees Discount");
	}
	
	/*
	 * 
	 * Discount year
	 * 
	 */
	public void discount_year(int i) throws InterruptedException {

		// fees_discount_select
		driver.findElement(By.xpath("//*[@id=\"table_id\"]/tbody/tr[" + i + "]/td[5]/div/button")).click();
		Thread.sleep(1000);

		// fees_discount_assign
		driver.findElement(By.xpath("//*[@id=\"table_id\"]/tbody/tr[" + i + "]/td[5]/div/div/a[1]")).click();
		Thread.sleep(1000);
		
		System.out.println("Successfully Enter assign in Fees Discount");

		/*
		 * 
		 * 
		 * 
		 * 
		 * 
		 */

		// fees_master_select_class
		driver.findElement(fees_master_select_class).click();
		Thread.sleep(1000);

		// fees_master_specific_class
		driver.findElement(fees_master_specific_class).click();
		Thread.sleep(1000);

		// fees_master_select_section
		driver.findElement(fees_master_select_section).click();
		Thread.sleep(1000);

		// fees_master_specific_section
		driver.findElement(fees_master_specific_section).click();
		Thread.sleep(1000);

		// fees_master_select_category
		driver.findElement(fees_master_select_category).click();
		Thread.sleep(1000);

		// fees_master_specific_category
		driver.findElement(fees_master_specific_category).click();
		Thread.sleep(1000);

		// fees_master_select_group
		driver.findElement(fees_master_select_group).click();
		Thread.sleep(1000);

		// fees_master_specific_group
		driver.findElement(fees_master_specific_group).click();
		Thread.sleep(1000);

		// fees_master_asign_search
		driver.findElement(fees_master_asign_search).click();
		Thread.sleep(1000);
		
		System.out.println("Successfully Search complete assign in Fees Discount");

		if (driver.findElement(fees_master_check_mark).isSelected()) {

//					//fees_discount_select_fees_type
//					driver.findElement(fees_discount_select_fees_type).click();
//					Thread.sleep(1000);
//					//fees_discount_specific_fees_type
//					driver.findElement(fees_discount_specific_fees_type2).click();
//					Thread.sleep(1000);

			driver.findElement(fees_discount_assign_complete).click();
			Thread.sleep(1000);
			
			System.out.println("Successfully Showing Checkmarked in Fees Discount");
		}

		else {
			driver.findElement(fees_master_check_mark).click();
			Thread.sleep(1000);

			// fees_discount_select_fees_type
			driver.findElement(fees_discount_select_fees_type).click();
			Thread.sleep(1000);
			// fees_discount_specific_fees_type
			driver.findElement(fees_discount_specific_fees_type).click();
			Thread.sleep(1000);
			driver.findElement(fees_discount_assign_complete).click();
			Thread.sleep(1000);
			
			System.out.println("Successfully Showing UnCheckmarked in Fees Discount");
		}

		// fees_collection
		driver.findElement(fees_collection).click();
		Thread.sleep(1000);

		// fees_discount
		driver.findElement(fees_discount).click();
		Thread.sleep(1000);

		// fees_discount_select
		driver.findElement(By.xpath("//*[@id=\"table_id\"]/tbody/tr["+i+"]/td[5]/div/button")).click();
		Thread.sleep(1000);

		// fees_discount_edit
		driver.findElement(By.xpath("//*[@id=\"table_id\"]/tbody/tr["+i+"]/td[5]/div/div/a[2]")).click();
		Thread.sleep(1000);

		// fees_discount_save
		driver.findElement(fees_discount_save).click();
		Thread.sleep(1000);
		
		System.out.println("Successfully edited Fees Discount");

		// fees_discount_select
		driver.findElement(By.xpath("//*[@id=\"table_id\"]/tbody/tr["+i+"]/td[5]/div/button")).click();
		Thread.sleep(1000);

		// fees_discount_delete
		driver.findElement(By.xpath("//*[@id=\"table_id\"]/tbody/tr["+i+"]/td[5]/div/div/a[3]")).click();
		Thread.sleep(1000);

		// fees_discount_delete_cancel
		driver.findElement(fees_discount_delete_cancel).click();
		Thread.sleep(1000);
		System.out.println("Successfully delete cancel Fees Discount");

//		// fees_discount_select
//		driver.findElement(By.xpath("//*[@id=\"table_id\"]/tbody/tr[" + i + "]/td[5]/div/button")).click();
//		Thread.sleep(1000);
//				
//		// fees_discount_delete
//		driver.findElement(fees_discount_delete).click();
//		Thread.sleep(1000);
//
//		// fees_discount_delete_confirm
//		driver.findElement(fees_discount_delete_confirm).click();
//		Thread.sleep(1000);
		
	}
	
	public void discount_once(int i) throws InterruptedException {
		
		//select
		driver.findElement(By.xpath("//*[@id=\"table_id\"]/tbody/tr["+i+"]/td[5]/div/button")).click();
		Thread.sleep(1000);
		
		//assign
		driver.findElement(By.xpath("//*[@id=\"table_id\"]/tbody/tr["+i+"]/td[5]/div/div/a[1]")).click();
		Thread.sleep(1000);
		
		System.out.println("Successfully Enter assign in Fees Discount");
		
		/*
		 * 
		 * 
		 * 
		 * 
		 * 
		 */

		// fees_master_select_class
		driver.findElement(fees_master_select_class).click();
		Thread.sleep(1000);

		// fees_master_specific_class
		driver.findElement(fees_master_specific_class).click();
		Thread.sleep(1000);

		// fees_master_select_section
		driver.findElement(fees_master_select_section).click();
		Thread.sleep(1000);

		// fees_master_specific_section
		driver.findElement(fees_master_specific_section).click();
		Thread.sleep(1000);

		// fees_master_select_category
		driver.findElement(fees_master_select_category).click();
		Thread.sleep(1000);

		// fees_master_specific_category
		driver.findElement(fees_master_specific_category).click();
		Thread.sleep(1000);

		// fees_master_select_group
		driver.findElement(fees_master_select_group).click();
		Thread.sleep(1000);

		// fees_master_specific_group
		driver.findElement(fees_master_specific_group).click();
		Thread.sleep(1000);

		// fees_master_asign_search
		driver.findElement(fees_master_asign_search).click();
		Thread.sleep(1000);
		
		System.out.println("Successfully Search complete assign in Fees Discount");
		
		if(driver.findElement(By.xpath("//*[@id=\"student.24\"]")).isSelected()) {
			
			driver.findElement(By.xpath("//*[@id=\"btn-assign-fees-discount\"]")).click();
			
			System.out.println("Successfully Showing Checkmarked in Fees Discount");
			
		}
		
		else {
			driver.findElement(By.xpath("//*[@id=\"main-content\"]/section/div/form/div/div/div[2]/div[2]/div/table/tbody[1]/tr[1]/td[1]/label")).click();
			
			//select
			driver.findElement(By.xpath("//*[@id=\"main-content\"]/section/div/form/div/div/div[2]/div[2]/div/table/tbody[1]/tr[1]/td[5]/div/span")).click();
			Thread.sleep(1000);
			 int size = driver.findElements(By.xpath("//*[@id=\"main-content\"]/section/div/form/div/div/div[2]/div[2]/div/table/tbody[1]/tr[1]/td[5]/div/ul/li[1]")).size();
			System.out.println(size);
			 if(size==1) {
					//assign discount
					driver.findElement(By.xpath("//*[@id=\"btn-assign-fees-discount\"]")).click();
					
					System.out.println("Successfully Showing UnCheckmarked in Fees Discount");
				 
			 }
			 
			 else {
				 
					//specific type
					driver.findElement(By.xpath("//*[@id=\"main-content\"]/section/div/form/div/div/div[2]/div[2]/div/table/tbody[1]/tr[1]/td[5]/div/ul/li[3]")).click();
					Thread.sleep(1000);
					
					//assign discount
					driver.findElement(By.xpath("//*[@id=\"btn-assign-fees-discount\"]")).click();
					
					System.out.println("Successfully Showing UnCheckmarked in Fees Discount");
			 }
			

		}
		
	}
	
	
	public void discount_code_year() throws InterruptedException {
		
		int i = 1;
		int year = 0;
		int once = 0;
		boolean found = true;
		
		while(found){
			
			if(driver.findElements(By.xpath("//*[@id=\"table_id\"]/tbody/tr["+i+"]/td[3]")).size()>0) {
				
				String str = driver.findElement(By.xpath("//*[@id=\"table_id\"]/tbody/tr[1]/td[3]")).getText().trim();
				
				System.out.println(str);
				
				if(str.matches("year") && year==0) {
					this.discount_year(i);
					year = 1;
					System.out.println("Enter in Discount Yesr =" + year);
					
				}
				
				else {
					
					this.discount_once(i);
					once = 1;
					System.out.println("Enter in discount once =" + once);
					
				}
				
				  if(year ==1 && once == 1)
					  break;
			}
			else {
				   
				   found = false;
			}
			i= i+1;
			
		}
		
		
	}

	public void clickfees_discountButton() throws InterruptedException {

		
		//fees_collection
		driver.findElement(fees_collection).click();
		Thread.sleep(1000);
		
		System.out.println("Successfully Enter fees_discount");
		
		//fees_discount
		driver.findElement(fees_discount).click();
		Thread.sleep(1000);
		
		//call discount_code
		discount_code();
		Thread.sleep(1000);
		System.out.println("Discount code is Generated");
		
		//fees_discount_once
		driver.findElement(fees_discount_once).click();
		Thread.sleep(1000);
		
		//call Discountsave
		Discountsave();
		Thread.sleep(1000);
		System.out.println("Generated Fees Discount");
		
		/*
		 * 
		 * discount year
		 * 
		 */
		
		//call discount_code
		discount_code();
		Thread.sleep(1000);
		System.out.println("Generated code");
		
		//fees_discount_once
		driver.findElement(fees_discount_year).click();
		Thread.sleep(1000);
		
		//call Discountsave
		Discountsave();
		Thread.sleep(1000);
		System.out.println("Generated Fees Discount");
		
		/*
		 * 
		 */
		
		//call discount_code_year
		discount_code_year();
		Thread.sleep(1000);
		

	}
		

	
	/*
	 * 
	 * collection_fees
	 * 
	 */

	public String feesCollectName() throws InterruptedException {
		
		//fees_collection
		driver.findElement(fees_collection).click();
		Thread.sleep(1000);
		
		//fees_discount
		driver.findElement(fees_discount).click();
		Thread.sleep(1000);
		
		//fees_discount_select
		driver.findElement(fees_discount_select).click();
		Thread.sleep(1000);
		
		//fees_discount_assign
		driver.findElement(fees_discount_assign).click();
		Thread.sleep(1000);
		
		System.out.println("Successfully Enter in fees_discount_assign");
		
		/*
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		//fees_master_select_class
		driver.findElement(fees_master_select_class).click();
		Thread.sleep(1000);
		
		//fees_master_specific_class
		driver.findElement(fees_master_specific_class).click();
		Thread.sleep(1000);
		
		//fees_master_select_section
		driver.findElement(fees_master_select_section).click();
		Thread.sleep(1000);
		
		//fees_master_specific_section
		driver.findElement(fees_master_specific_section).click();
		Thread.sleep(1000);
		
		//fees_master_select_category
		driver.findElement(fees_master_select_category).click();
		Thread.sleep(1000);
		
		//fees_master_specific_category
		driver.findElement(fees_master_specific_category).click();
		Thread.sleep(1000);
		
		//fees_master_select_group
		driver.findElement(fees_master_select_group).click();
		Thread.sleep(1000);
		
		//fees_master_specific_group
		driver.findElement(fees_master_specific_group).click();
		Thread.sleep(1000);
		
		//fees_master_asign_search
		driver.findElement(fees_master_asign_search).click();
		Thread.sleep(1000);
		
		System.out.println("Successfully Search fees_discount_assign");
		
		String  search_name = driver.findElement(By.xpath("//*[@id=\"main-content\"]/section/div/form/div/div/div[2]/div[2]/div/table/tbody[1]/tr[1]/td[2]")).getText();
		return search_name;
	}
	
	/*
	 * 
	 * 
	 */
	
	public void collectUnpaidFees(int i) throws InterruptedException, AWTException {
		
		//action select
		driver.findElement(By.xpath("//*[@id=\"main-content\"]/section[3]/div/div[2]/div/div/table/tbody/tr["+i+"]/td[13]/div/button")).click();
		Thread.sleep(1000);
		
		//add fees
		driver.findElement(By.xpath("//*[@id=\"main-content\"]/section[3]/div/div[2]/div/div/table/tbody/tr["+i+"]/td[13]/div/div/a")).click();
		Thread.sleep(1000);
		
		//browse file
		driver.findElement(By.xpath("//label[@class='primary-btn small fix-gr-bg']")).click();
		
		String filePath2=upload.getFilePath("home-banner1.jpg");
		upload.JPEGUpload(filePath2);
		Thread.sleep(1000);
		
		//save
		driver.findElement(By.xpath("//button[@class='primary-btn fix-gr-bg submit']")).click();
		Thread.sleep(1000);
		
		System.out.println("Successfully Saved collectUnpaidFees");
		
	}
	
	public void collectpaidFees(int i) throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\"main-content\"]/section[3]/div/div[2]/div/div/table/tbody/tr["+i+"]/td[13]/div/button")).click();
		Thread.sleep(1000);
		
		//payment done
		driver.findElement(By.xpath("//*[@id=\"main-content\"]/section[3]/div/div[2]/div/div/table/tbody/tr["+i+"]/td[13]/div/div/a")).click();
		Thread.sleep(1000);
		upload.scroll();
		
		System.out.println("Successfully Showing collectpaidFees");
		
	}
	
	public void chackingUnpaidPaid() throws InterruptedException, AWTException {
		
		int i = 1;
		int unpaid = 0;
		int paid = 0;
		boolean found = true;
		
		
		while(found) {
		System.out.println(i);
		int size =	driver.findElements(By.xpath("//*[@id=\"main-content\"]/section[3]/div/div[2]/div/div/table/tbody/tr["+i+"]")).size();
	
		if(size==0) {
		found = false;
		break;
	}
		if(driver.findElements(By.xpath("//*[@id=\"main-content\"]/section[3]/div/div[2]/div/div/table/tbody/tr["+i+"]/td[4]/button")).size()>0){
									   	//*[@id="main-content"]/section[3]/div/div[2]/div/div/table/tbody/tr[1]/td[4]/button
			
			String str =(driver.findElement(By.xpath("//*[@id=\"main-content\"]/section[3]/div/div[2]/div/div/table/tbody/tr["+i+"]/td[4]/button")).getText().trim());
						
			System.out.println(str);
			
			
			if(str.matches("UNPAID")&& unpaid ==0) {
				this.collectUnpaidFees(i);
				unpaid = 1;
				
				System.out.println("Unpaid = " +unpaid);
				System.out.println("Successfully fees Unpaid");
				
			}
			
			else {
//				this.collectpaidFees(i);
//				Thread.sleep(1000);
//				paid = 1;
//				System.out.println("Successfully fees paid");
				if (paid<1) {
					
					this.collectpaidFees(i);
					Thread.sleep(1000);
					paid = 1;
					System.out.println("Successfully fees paid");
				}
			}
			
			if(paid ==1 && unpaid == 1)
				  found = false;
			}
		
		i = i+1;
		
	}
	}
	

	
	public void clickcollection_feesButton() throws InterruptedException, AWTException {
		
		feesName_collect = this.feesCollectName();
		
		//fees_collection
		driver.findElement(fees_collection).click();
		Thread.sleep(1000);
		System.out.println("Successfully Enter collection_fees");
		
		//collection_fees
		driver.findElement(collection_fees).click();
		Thread.sleep(1000);
		
		//collect_fees_class
		driver.findElement(collect_fees_class).click();
		Thread.sleep(1000);
		
		//collect_fees_specific_class
		driver.findElement(collect_fees_specific_class).click();
		Thread.sleep(1000);
		
		//collect_fees_section
		driver.findElement(collect_fees_section).click();
		Thread.sleep(1000);
		
		//collect_fees_specific_section
		driver.findElement(collect_fees_specific_section).click();
		Thread.sleep(1000);
		
		
		//collect_fees_search_name
		driver.findElement(collect_fees_search_name).sendKeys(feesName_collect);
		Thread.sleep(1000);
		
		//collect_fees_search
		driver.findElement(collect_fees_search).click();
		Thread.sleep(1000);
		//driver.get("http://pos.rishfa.com/fees-collect-student-wise/24");
		//action_collect_fees
		driver.findElement(action_collect_fees).click();
		Thread.sleep(1000);
		
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));

		//chackingUnpaidPaid
		chackingUnpaidPaid();
		Thread.sleep(1000);

	}
	
	/*
	 * 
	 * search_fees_payment
	 * 
	 */
	
	public void clicksearch_fees_paymentButton() throws InterruptedException {
		
		//fees_collection
		driver.findElement(fees_collection).click();
		Thread.sleep(1000);

		
		//search_fees_payment
		driver.findElement(search_fees_payment).click();
		Thread.sleep(1000);
		System.out.println("Successfully Enter search_fees_payment");
		//fees_payment_select
		driver.findElement(fees_payment_select).click();
		Thread.sleep(1000);
		
		//fees_payment_edit_fees
		driver.findElement(fees_payment_edit_fees).click();
		Thread.sleep(3000);
		
		//fees_payment_save_information
		driver.findElement(fees_payment_save_information).click();
		Thread.sleep(1000);
		
		System.out.println("Successfully saved fees_payment_save_information");
		
		//fees_payment_select
		driver.findElement(fees_payment_select).click();
		Thread.sleep(1000);
		
		//fees_payment_view
		driver.findElement(fees_payment_view).click();
		Thread.sleep(3000);
		
		System.out.println("Successfully saved fees_payment_save_information");
		
		//switch driver in tab 2
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		Thread.sleep(3000);
		
		//close the tap
		driver.close();
		
		//back to the driver in main tab
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		Thread.sleep(3000);
		
		System.out.println("Successfully return previous tab");
		
	}
	
	/*
	 * 
	 * search_fees_due
	 * 
	 */
	
	public void clicksearch_fees_dueButton() throws InterruptedException {
		
//		//fees_collection
//		driver.findElement(fees_collection).click();
//		Thread.sleep(1000);
		
		System.out.println("Successfully Enter search_fees_due");
		
		//search_fees_due
		driver.findElement(search_fees_due).click();
		Thread.sleep(1000);
		
		//search_fees_due_group
		driver.findElement(search_fees_due_group).click();
		Thread.sleep(1000);
		
		//search_fees_due_specific_group
		driver.findElement(search_fees_due_specific_group).click();
		Thread.sleep(1000);
		
//		driver.findElement(By.xpath("//*[@id=\"search_student\"]/div/div[1]/div/ul/li[6]")).click();
//		Thread.sleep(1000);
		
		//search_fees_due_class
		driver.findElement(search_fees_due_class).click();
		Thread.sleep(1000);
		
		//search_fees_due_specific_class
		driver.findElement(search_fees_due_specific_class).click();
		Thread.sleep(1000);
		
		//search_fees_due_section
		driver.findElement(search_fees_due_section).click();
		Thread.sleep(1000);
		
		//search_fees_due_specific_section
		driver.findElement(search_fees_due_specific_section).click();
		Thread.sleep(1000);
		
		//search_fees_due_search
		driver.findElement(search_fees_due_search).click();
		Thread.sleep(1000);
		
		System.out.println("Successfully search Search_fees_due_search");
		
		int size =  driver.findElements(By.xpath("//*[@id=\"table_id\"]/tbody/tr/td")).size();
		System.out.println(size);
		
		if (size==1) {
			System.out.println("enter search fee due");
			
			//fees_collection
			driver.findElement(fees_collection).click();
			Thread.sleep(1000);
			
			//search_fees_due
			driver.findElement(search_fees_due).click();
			Thread.sleep(1000);
			System.out.println("enter search fee");
		}
		
		else {
			
			//select
			driver.findElement(By.xpath("//*[@id=\"table_id\"]/tbody/tr[1]/td[10]/div/button")).click();
			Thread.sleep(1000);
			
			//view
			driver.findElement(By.xpath("//*[@id=\"table_id\"]/tbody/tr[1]/td[10]/div/div/a")).click();
			Thread.sleep(1000);
		}

	}
	
	/*
	 * 
	 * fees_collection_bank_payment
	 * 
	 */
	
	public void bankpaypending() throws InterruptedException {
		
		//fees_collection_Class
		driver.findElement(fees_collection_Class).click();
		Thread.sleep(1000);
		
		//fees_collection_specific_class
		driver.findElement(fees_collection_specific_class).click();
		Thread.sleep(1000);
		
		//fees_collection_section
		driver.findElement(fees_collection_section).click();
		Thread.sleep(1000);
		
		//fees_collection_specific_section
		driver.findElement(fees_collection_specific_section).click();
		Thread.sleep(1000);
		
		//fees_collection_status
		driver.findElement(fees_collection_status).click();
		Thread.sleep(1000);	
	}
	
	public void pending_approve_check() throws InterruptedException {
		
		int i = 1;
		
		int pending = 0;
		int approve = 0;
		
		
		int siZe = driver.findElements(By.xpath("//*[@id=\"table_id\"]/tbody/tr/td")).size();
		
		System.out.println(siZe);
	
		while(i<=siZe) {
			
			if(siZe == 1) {
				
				//fees_collection_bank_payment
				driver.findElement(fees_collection_bank_payment).click();
				Thread.sleep(1000);
			}
			
			else {
				
				String str = driver.findElement(By.xpath("//*[@id=\"table_id\"]/tbody/tr["+i+"]/td[7]/button")).getText().trim();
				
				System.out.println(str);
				
				if(str.matches("PENDING") && pending==0) {
					
					driver.findElement(By.xpath("//*[@id=\"table_id\"]/tbody/tr["+i+"]/td[8]/div/button")).click();
					Thread.sleep(1000);
					
					//approve
					driver.findElement(By.xpath("//*[@id=\"table_id\"]/tbody/tr["+i+"]/td[8]/div/div/a[1]")).click();
					Thread.sleep(1000);
					
					//fees_collection_pending_approve_confirm
					driver.findElement(fees_collection_pending_approve_confirm).click();
					Thread.sleep(1000);
					
					pending =1;
					System.out.println("Payment status is pending =" +pending);
				}//if close
				
				else if(str.matches("APPROVED")&& approve ==0){
				
				//fees_collection_bank_payment
				driver.findElement(fees_collection_bank_payment).click();
				Thread.sleep(1000);
				approve =1;
				System.out.println("Payment status is prrove =" +approve);
				}
				
				if(pending ==1 || approve ==1) {
				break;
				}
			}
			
			i++;
		}
		
		} //function
		
		
	
	
	public void clickfees_collection_bank_paymentButton() throws InterruptedException {
		
//		//fees_collection
//		driver.findElement(fees_collection).click();
//		Thread.sleep(1000);
		
		System.out.println("Successfully Enter fees_collection_bank_payment");
		
		//fees_collection_bank_payment
		driver.findElement(fees_collection_bank_payment).click();
		Thread.sleep(1000);
		
		//bankpaypending
		bankpaypending();
		Thread.sleep(1000);
		
		//fees_collection_status_pending
		driver.findElement(fees_collection_status_pending).click();
		Thread.sleep(1000);
		
		//fees_collection_search
		driver.findElement(fees_collection_search).click();
		Thread.sleep(1000);
		
		//pending_approve_check
		pending_approve_check();
		Thread.sleep(1000);
		
		/*
		 * approve
		 */
		
		//bankpaypending
		bankpaypending();
		Thread.sleep(1000);
		
		//fees_collection_status_pending
		driver.findElement(fees_collection_status_approved).click();
		Thread.sleep(1000);
		
		//fees_collection_search
		driver.findElement(fees_collection_search).click();
		Thread.sleep(1000);
		
		//pending_approve_check
		pending_approve_check();
		Thread.sleep(1000);
	}
	
	/*
	 * 
	 * fees_carryforward
	 * 
	 */
	
	public void clickfees_carryforwardButton() throws InterruptedException {
		
//		//fees_collection
//		driver.findElement(fees_collection).click();
//		Thread.sleep(1000);
		
		System.out.println("Successfully Enter fees_carryforward");
		
		//fees_carryforward
		driver.findElement(fees_carryforward).click();
		Thread.sleep(1000);
		
		//fees_carry_class
		driver.findElement(fees_carry_class).click();
		Thread.sleep(1000);
		
		//fees_carry_specific_class
		driver.findElement(fees_carry_specific_class).click();
		Thread.sleep(1000);
		
		//fees_carry_section
		driver.findElement(fees_carry_section).click();
		Thread.sleep(1000);
		
		//fees_carry_specific_section
		driver.findElement(fees_carry_specific_section).click();
		Thread.sleep(1000);
		
		//fees_carry_forward_search
		driver.findElement(fees_carry_forward_search).click();
		Thread.sleep(1000);
		
		//fees_carry_forward_save
		driver.findElement(fees_carry_forward_save).click();
		Thread.sleep(1000);
		
		System.out.println("Successfully saved fees_carry_forward_save");
		
	}
	
	/*
	 * 
	 * collection_report
	 * 
	 */
	
	public void clickcollection_reportButton() throws InterruptedException {
		
		//fees_collection
		driver.findElement(fees_collection).click();
		Thread.sleep(1000);
		
		System.out.println("Successfully Enter collection_report");
		
		//collection_report
		driver.findElement(collection_report).click();
		Thread.sleep(1000);
		
		//collection_reportdate_range
		driver.findElement(collection_reportdate_range).click();
		Thread.sleep(1000);
		
		//collection_fees_date_apply
		driver.findElement(collection_fees_date_apply).click();
		Thread.sleep(1000);
		
		//collection_fees_class
		driver.findElement(collection_fees_class).click();
		Thread.sleep(1000);
		
		//collection_fees_specific_class
		driver.findElement(collection_fees_specific_class).click();
		Thread.sleep(1000);
		
		//collection_fees_section
		driver.findElement(collection_fees_section).click();
		Thread.sleep(1000);
		
		//collection_fees_specific_section
		driver.findElement(collection_fees_specific_section).click();
		Thread.sleep(1000);
		
		//collection_fees_search
		driver.findElement(collection_fees_search).click();
		Thread.sleep(1000);
		
		System.out.println("Successfully search collection_fees_search");
		System.out.println("Checkout from Fees collection");
	}
	

}
