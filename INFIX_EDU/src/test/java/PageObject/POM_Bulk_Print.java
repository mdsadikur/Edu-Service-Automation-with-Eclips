package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Common_Method.CommonMethod;

public class POM_Bulk_Print {
	
	WebDriver driver = null;
	
	public POM_Bulk_Print(WebDriver driver) {
		
		this.driver = driver;
	}
	
	CommonMethod upload = new CommonMethod();
	
	/*
	 * 
	 * 
	 * Generate id card
	 * 
	 * 
	 */
	
	// Bulk Print
	By bulk_print = By.xpath("//div[contains(text(),'Bulk Print')]");
			
	
	// generate id card
	By generate_id_card = By.xpath("(//a[contains(text(),'ID Card')])[3]");

	// select role
	By generate_id_role = By.xpath("//div[@class='nice-select niceSelect new_test w-100 bb form-control']");
	
	/*
	 * 
	 */
	
	// specific role super admin
	By generate_id_role_superAdmin = By.xpath("//li[contains(text(),'Super admin')]");

	// specific role student
	By generate_id_role_student = By.xpath("//li[contains(text(),'Student')]");

	// specific role parents
	By generate_id_role_parents = By.xpath("//li[contains(text(),'Parents')]");

	// specific role super teacher
	By generate_id_role_teacher = By.xpath("//li[contains(text(),'Teacher')]");

	// specific role admin
	By generate_id_role_admin = By.xpath("//li[contains(text(),'Admin')]");

	// specific role accountant
	By generate_id_role_accountant = By.xpath("//li[contains(text(),'Accountant')]");

	// specific role receptionist
	By generate_id_role_receptionist = By.xpath("//li[contains(text(),'Receptionist')]");

	// specific role librarian
	By generate_id_role_librarian = By.xpath("//li[contains(text(),'Librarian')]");
	
	// specific role driver
	By generate_id_role_driver = By.xpath("//li[contains(text(),'Driver')]");
	
	/*
	 * 
	 */
	
	//select id card
	By generate_select_id_card = By.xpath("//div[@class='nice-select niceSelect w-100 bb form-control']");
	
	//select specific id card
	By generate_specific_id_card = By.xpath("//*[@id=\"id-card-div\"]/div[1]/ul/li[2]");
	
	//generate id grid_gap
	By generate_id_grid_gap = By.name("grid_gap");
	
	//generate id save
	By generate_id_save = By.xpath("//button[@class='primary-btn small fix-gr-bg']");
	
	
	/*
	 * 
	 * 
	 * Generate Certificate
	 * 
	 * 
	 */
	
	//generate certificate
	By generate_certificate = By.xpath("(//a[contains(text(),'  Student Certificate')])");
	
	//generate certificate class
	By generate_certificate_class = By.xpath("//*[@id=\"main-content\"]/section[2]/div/form/div/div/div/div/div[1]/div");
	
	//generate certificate specific class
	By generate_certificate_specific_class = By.xpath("//li[contains(text(),'Class 3')]");
	
	//generate certificate section
	By generate_certificate_section = By.xpath("//*[@id=\"select_section_div\"]/div[1]");
	
	//generate certificate specific section
	By generate_certificate_specific_section = By.xpath("//li[contains(text(),'Day')]");
	
	//generate_certificate_select certificate
	By generate_certificate_select_certificate = By.xpath("//*[@id=\"main-content\"]/section[2]/div/form/div/div/div/div/div[3]/div");
	
	//generate_certificate_specific_certificate 
	By generate_certificate_specific_certificate = By.xpath("//li[contains(text(),'Certificate in Technical Communication (PCTC)')]");
	
	//generate certificate search
	By generate_certificate_search = By.xpath("//button[@class='primary-btn small fix-gr-bg']");
	
	//check mark
	By generate_certificate_checkmark = By.xpath("//tbody/tr[1]/td[1]/label[1]");
	
	//certificate_generate
	By certificate_generate = By.xpath("//a[@id='genearte-certificate-print-button']");
	
	/*
	 * 
	 * 
	 * payroll_bulk_print
	 * 
	 * 
	 */
	
	//payroll bulk print
	By payroll_bulk_print = By.xpath("(//a[contains(text(),' Payroll Bulk Print')])");
	
	//payroll bulk print roll
	By payroll_bulk_print_roll = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div[2]/div/div/form/div/div[1]/div");
	
	//payroll bulk accountant
	By payroll_bulk_accountant = By.xpath("//li[contains(text(),'Accountant')]");
	
	//payroll bulk admin
	By payroll_bulk_admin = By.xpath("//li[contains(text(),'Admin')]");
		
	//payroll bulk driver
	By payroll_bulk_driver = By.xpath("//li[contains(text(),'Driver')]");
		
	//payroll bulk librarian
	By payroll_bulk_librarian = By.xpath("//li[contains(text(),'Librarian')]");
		
	//payroll bulk receptionist
	By payroll_bulk_receptionist= By.xpath("//li[contains(text(),'Receptionist')]");
		
	//payroll bulk teacher
	By payroll_bulk_teacher = By.xpath("//li[contains(text(),'Teacher')]");
	
	//payroll bulk month
	By payroll_bulk_month = By.xpath("(//div[@class='nice-select niceSelect w-100 bb form-control'])[2]");
	
	//payroll bulk specific month
	By payroll_bulk_speciic_month = By.xpath("//li[contains(text(),'November')]");
	
	//payroll bulk year
	By payroll_bulk_year = By.xpath("(//div[@class='nice-select niceSelect w-100 bb form-control'])[3]");
	
	//Payroll bulk specific year
	By payroll_bulk_specific_year = By.xpath("(//li[contains(text(),'2022')])[2]");
	
	//payroll bulk search
	By payroll_bulk_search = By.xpath("//button[@class='primary-btn small fix-gr-bg']");
	
	
	/*
	 * 
	 * 
	 * Fees invoice Bulk print
	 * 
	 * 
	 */
	
	//fees invoice bulk print
	By fees_invoice_bulk_print = By.xpath("//a[contains(text(),' Fees invoice Bulk Print')]");
	
	//fees invoice class
	By fees_invoice_class = By.xpath("(//div[@class='nice-select w-100 niceSelect bb form-control'])[1]");
	By fees_invoice_class2 = By.xpath("(//div[@class='nice-select w-100 bb niceSelect form-control'])[1]");
	
	//fees invoice specific class
	By fees_invoice_specific_class = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div[2]/div/div/form/div/div[1]/div/ul/li[2]");
	
	//fees invoice section
	By fees_invoice_section = By.xpath("(//div[@class='nice-select w-100 niceSelect bb form-control'])[2]");
	By fees_invoice_section2 = By.xpath("(//div[@class='nice-select w-100 bb niceSelect form-control'])[2]");
	
	//fees invoice specific section
	By fees_invoice_specifc_section = By.xpath("//*[@id=\"feesSectionDiv\"]/div[1]/ul/li[2]");
	By fees_invoice_specific_section2 = By.xpath("//*[@id=\"select_section_div\"]/div[1]/ul/li[2]");										
	
	//fees invoice student
	By fees_invoice_student = By.xpath("(//div[@class='nice-select w-100 bb niceSelect form-control'])[3]");
	
	//fees invoice specific student
	By fees_invoice_specific_student = By.xpath("//*[@id=\"selectStudentDiv\"]/div[1]/ul/li[2]");
	
	//fees invoice print
	By fees_invoice_print = By.xpath("//button[@class='primary-btn small fix-gr-bg']");
	
	
	
	
	
	
	
	
	/*
	 * 
	 * 
	 * Generate ID card
	 * 
	 * 
	 */
	
//	public void generateidbasic() throws InterruptedException {		
//		//call selectIdcard
//		selectIdcard();
//
//		driver.navigate().back();
//		Thread.sleep(1000);
//		
//	}
	
	public void selectIdcard() throws InterruptedException {
		int id = driver.findElements(By.xpath("//*[@id=\"id-card-div\"]/div[1]/ul/li")).size();
		System.out.println("Size is = " + id);
		
		if(id==1) {
			
			driver.findElement(generate_id_card).click();
			Thread.sleep(1000);

		}
		
		else {
			driver.findElement(generate_specific_id_card).click();
			Thread.sleep(1000);
			
			//generate_id_grid_gap
			driver.findElement(generate_id_grid_gap).sendKeys("3");
			Thread.sleep(1000);
			
			//generate_id_save
			driver.findElement(generate_id_save).click();
			Thread.sleep(1000);
			
			driver.navigate().back();
			Thread.sleep(1000);
			
		}
	}
	
	public void ClickGenerateIdButton() throws InterruptedException {
		
		// admission_select
		driver.findElement(bulk_print).click();
		Thread.sleep(1000);
		
		//generate_id_card
		driver.findElement(generate_id_card).click();
		Thread.sleep(1000);
		System.out.println("Successfully enter ID card");
		
		//generate_id_role
		driver.findElement(generate_id_role).click();
		Thread.sleep(1000);
		
		// generate_id_role_student
		driver.findElement(generate_id_role_student).click();
		Thread.sleep(1000);
		
		//generate_select_id_card
		driver.findElement(generate_select_id_card).click();
		Thread.sleep(1000);

		selectIdcard();
		System.out.println("Student id card generate successfully");

		/*
		 * 
		 * 
		 */

		//generate_id_card
		driver.findElement(generate_id_card).click();
		Thread.sleep(1000);
		
		// generate_id_role
		driver.findElement(generate_id_role).click();
		Thread.sleep(1000);

		// generate_id_role_parents
		driver.findElement(generate_id_role_parents).click();
		Thread.sleep(1000);
		
		//generate_select_id_card
		driver.findElement(generate_select_id_card).click();
		Thread.sleep(1000);

		selectIdcard();
		System.out.println("Parents id card generate successfully");

		/*
		 * 
		 * 
		 */

		//generate_id_card
		driver.findElement(generate_id_card).click();
		Thread.sleep(1000);

		// generate_id_role
		driver.findElement(generate_id_role).click();
		Thread.sleep(1000);

		// generate_id_role_teacher
		driver.findElement(generate_id_role_teacher).click();
		Thread.sleep(1000);
		
		//generate_select_id_card
		driver.findElement(generate_select_id_card).click();
		Thread.sleep(1000);

		selectIdcard();
		System.out.println("Teacher id card generate successfully");

		/*
		 * 
		 * 
		 */

		//generate_id_card
		driver.findElement(generate_id_card).click();
		Thread.sleep(1000);
		System.out.println("Successfully enter generate_id_role");

		// generate_id_role
		driver.findElement(generate_id_role).click();
		Thread.sleep(1000);
		System.out.println("Successfully enter generate_id_role2");

		// generate_id_role_admin
		driver.findElement(generate_id_role_admin).click();
		Thread.sleep(1000);
		
		//generate_select_id_card
		driver.findElement(generate_select_id_card).click();
		Thread.sleep(1000);

		selectIdcard();
		System.out.println("Admin id card generate successfully");

		/*
		 * 
		 * 
		 */

		//generate_id_card
		driver.findElement(generate_id_card).click();
		Thread.sleep(1000);

		// generate_id_role
		driver.findElement(generate_id_role).click();
		Thread.sleep(1000);

		// generate_id_role_generate_id_role_accountant
		driver.findElement(generate_id_role_accountant).click();
		Thread.sleep(1000);
		
		//generate_select_id_card
		driver.findElement(generate_select_id_card).click();
		Thread.sleep(1000);

		selectIdcard();
		System.out.println("Accountant id card generate successfully");

		/*
		 * 
		 * 
		 */

		//generate_id_card
		driver.findElement(generate_id_card).click();
		Thread.sleep(1000);

		// generate_id_role
		driver.findElement(generate_id_role).click();
		Thread.sleep(1000);

		// generate_id_role_generate_id_role_receptionist
		driver.findElement(generate_id_role_receptionist).click();
		Thread.sleep(1000);
		
		//generate_select_id_card
		driver.findElement(generate_select_id_card).click();
		Thread.sleep(1000);

		selectIdcard();
		System.out.println("Receptionist id card generate successfully");

		/*
		 * 
		 * 
		 */

		//generate_id_card
		driver.findElement(generate_id_card).click();
		Thread.sleep(1000);

		// generate_id_role
		driver.findElement(generate_id_role).click();
		Thread.sleep(1000);

		// generate_id_role_generate_id_role_librarian
		driver.findElement(generate_id_role_librarian).click();
		Thread.sleep(1000);
		
		//generate_select_id_card
		driver.findElement(generate_select_id_card).click();
		Thread.sleep(1000);

		selectIdcard();
		System.out.println("Librarian id card generate successfully");
		
		/*
		 * 
		 * 
		 */

		//generate_id_card
		driver.findElement(generate_id_card).click();
		Thread.sleep(1000);

		// generate_id_role
		driver.findElement(generate_id_role).click();
		Thread.sleep(1000);

		// generate_id_role_generate_id_role_librarian
		driver.findElement(generate_id_role_driver).click();
		Thread.sleep(1000);
		
		//generate_select_id_card
		driver.findElement(generate_select_id_card).click();
		Thread.sleep(1000);

		selectIdcard();
		System.out.println("Driver id card generate successfully");
	}
	
	/*
	 * 
	 * 
	 * 
	 */
	
public void clickGenerateCertificate() throws InterruptedException {
		
		//generate certificate
		driver.findElement(generate_certificate).click();
		Thread.sleep(1000);
		System.out.println("Successfully enter student certificate");
		
		//generate_certificate_class
		driver.findElement(generate_certificate_class).click();
		Thread.sleep(1000);
		
		//generate_certificate_specific_class
		driver.findElement(generate_certificate_specific_class).click();
		Thread.sleep(2000);
		
		//generate_certificate_section
		driver.findElement(generate_certificate_section).click();
		Thread.sleep(1000);
		
		//generate_certificate_specific_section
		driver.findElement(generate_certificate_specific_section).click();
		Thread.sleep(1000);
		
		//generate_certificate_select_certificate
		driver.findElement(generate_certificate_select_certificate).click();
		Thread.sleep(1000);
		
		//generate_certificate_specific_certificate
		driver.findElement(generate_certificate_specific_certificate).click();
		Thread.sleep(1000);
		
		//generate_certificate_search
		driver.findElement(generate_certificate_search).click();
		Thread.sleep(5000);
		System.out.println("Successfully showing student certificate");
		
		
		driver.navigate().back();
		Thread.sleep(1000);
		
		
	}

	public void payroll_bulk_print() throws InterruptedException {
		
//		// payroll_bulk_month
//		driver.findElement(payroll_bulk_month).click();
//		Thread.sleep(1000);
//		
//		//payroll_bulk_speciic_month
//		driver.findElement(payroll_bulk_speciic_month).click();
//		Thread.sleep(1000);
		
		//payroll_bulk_year
		driver.findElement(payroll_bulk_year).click();
		Thread.sleep(1000);
		
		//payroll_bulk_specific_year
		driver.findElement(payroll_bulk_specific_year).click();
		Thread.sleep(1000);
		
		//payroll_bulk_search
		driver.findElement(payroll_bulk_search).click();
		Thread.sleep(1000);
		
		driver.navigate().back();
		Thread.sleep(1000);
		
	}

	public void clickpayroll_bulk_printButton() throws InterruptedException {
		
//		//bulk print
//		driver.findElement(bulk_print).click();
//		Thread.sleep(1000);
		
		//payroll_bulk_print
		driver.findElement(payroll_bulk_print).click();
		Thread.sleep(1000);
		System.out.println("Successfully enter payroll bulk print");
		
		//payroll_bulk_print_roll
		driver.findElement(payroll_bulk_print_roll).click();
		Thread.sleep(1000);
		
		//payroll_bulk_accountant
		driver.findElement(payroll_bulk_accountant).click();
		Thread.sleep(1000);
		System.out.println("Successfully showing accountant payroll bulk print");
		
		//call payroll bulk print
		payroll_bulk_print();
		
		//payroll_bulk_print_roll
		driver.findElement(payroll_bulk_print_roll).click();
		Thread.sleep(1000);
		
		//payroll_bulk_accountant
		driver.findElement(payroll_bulk_admin).click();
		Thread.sleep(1000);
		System.out.println("Successfully showing admin payroll bulk print");
		
		//call payroll bulk print
		payroll_bulk_print();
		
		//payroll_bulk_print_roll
		driver.findElement(payroll_bulk_print_roll).click();
		Thread.sleep(1000);
		
		//payroll_bulk_accountant
		driver.findElement(payroll_bulk_driver).click();
		Thread.sleep(1000);
		System.out.println("Successfully showing driver payroll bulk print");
		
		//call payroll bulk print
		payroll_bulk_print();
		
		//payroll_bulk_print_roll
		driver.findElement(payroll_bulk_print_roll).click();
		Thread.sleep(1000);
		
		//payroll_bulk_accountant
		driver.findElement(payroll_bulk_librarian).click();
		Thread.sleep(1000);
		System.out.println("Successfully showing librarian payroll bulk print");
		
		//call payroll bulk print
		payroll_bulk_print();
		
		//payroll_bulk_print_roll
		driver.findElement(payroll_bulk_print_roll).click();
		Thread.sleep(1000);
		
		//payroll_bulk_accountant
		driver.findElement(payroll_bulk_receptionist).click();
		Thread.sleep(1000);
		System.out.println("Successfully showing receptionist payroll bulk print");
		
		//call payroll bulk print
		payroll_bulk_print();
		
		//payroll_bulk_print_roll
		driver.findElement(payroll_bulk_print_roll).click();
		Thread.sleep(1000);
		
		//payroll_bulk_accountant
		driver.findElement(payroll_bulk_teacher).click();
		Thread.sleep(1000);
		System.out.println("Successfully showing teacher payroll bulk print");
		
		//call payroll bulk print
		payroll_bulk_print();
	}
	
	public void clickfees_invoice_bulk_printButton() throws InterruptedException {
		
//		// bulk print
//		driver.findElement(bulk_print).click();
//		Thread.sleep(1000);
		
		//fees_invoice_bulk_print
		driver.findElement(fees_invoice_bulk_print).click();
		Thread.sleep(1000);
		System.out.println("Successfully enter fees invoice bulk print");
		
		int size = driver.findElements(By.xpath("//*[@id=\"search_student\"]/div/div")).size();
		
		System.out.println("Size is = " + size);
		
		if(size == 3) {
		
		//fees_invoice_class
		driver.findElement(fees_invoice_class).click();
		Thread.sleep(1000);
		
		//fees_invoice_specific_class
		driver.findElement(fees_invoice_specific_class).click();
		Thread.sleep(2000);
		
		//fees_invoice_section
		driver.findElement(fees_invoice_section).click();
		Thread.sleep(1000);
		
		//fees_invoice_specifc_section
		driver.findElement(fees_invoice_specific_section2).click();
		Thread.sleep(2000);
		
		//fees_invoice_print
		driver.findElement(fees_invoice_print).click();
		Thread.sleep(1000);
		System.out.println("Successfully showing fees invoice bulk print");
		
		driver.navigate().back();
		Thread.sleep(1000);
		}
		
		else {
			
			//fees_invoice_class
			driver.findElement(fees_invoice_class2).click();
			Thread.sleep(1000);
			
			//fees_invoice_specific_class
			driver.findElement(fees_invoice_specific_class).click();
			Thread.sleep(2000);
			
			//fees_invoice_section
			driver.findElement(fees_invoice_section2).click();
			Thread.sleep(1000);
			
			//fees_invoice_specifc_section
			driver.findElement(fees_invoice_specifc_section).click();
			Thread.sleep(2000);
			
			//fees_invoice_student
			driver.findElement(fees_invoice_student).click();
			Thread.sleep(1000);
			
			//fees_invoice_specific_student
			driver.findElement(fees_invoice_specific_student).click();
			Thread.sleep(1000);
			
			//fees_invoice_print
			driver.findElement(fees_invoice_print).click();
			Thread.sleep(5000);
			
			System.out.println("Successfully showing fees invoice bulk print");
			
			driver.navigate().back();
			Thread.sleep(1000);
			System.out.println("Checkout from Bulk Print");
			
		}
	}

}
