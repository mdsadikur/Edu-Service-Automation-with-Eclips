package PageObject;

import java.awt.AWTException;
import java.util.ArrayList;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Common_Method.CommonMethod;

public class POM_Human_Resource {
	
	WebDriver driver = null;
	String Random_email,first_Name,last_Name,father_name,mother_name;
	
	public POM_Human_Resource(WebDriver driver) {
		
		this.driver = driver;
	
	
		
	}
	CommonMethod upload = new CommonMethod();
	
	/*
	 * 
	 * Designation
	 * 
	 */
	
	//Humanresource
	By humanresource = By.xpath("//div[contains(text(),'Human Resource')]");
	//designation
	By designation = By.xpath("//a[contains(text(),'Designation')]");
	//designationtitle
	By designationtitle = By.name("title");
	//savedesignation
	By savedesignation = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[2]/div/button");
	//designationselect
	By designationselect = By.xpath("//*[@id=\"table_id\"]/tbody/tr[1]/td[2]/div/button");
	//edit
	By designationedit = By.xpath("//*[@id=\"table_id\"]/tbody/tr[1]/td[2]/div/div/a[1]");
	//update
	By updatedesignation = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div[2]/div[1]/div/div/form/div/div/div[2]/div/button");
	
	//delete
	By designation_delete = By.xpath("//*[@id=\"table_id\"]/tbody/tr[1]/td[2]/div/div/a[2]");
	
	//delete cancel
	By designation_delete_cancel = By.xpath("(//button[@class='primary-btn tr-bg'])[3]");
	
	//delete confirm
	By designation_delete_confirm = By.xpath("(//button[@class='primary-btn fix-gr-bg'])[4]");
	
	/*
	 * 
	 * Department
	 * 
	 */
	
	By department = By.xpath("//*[@id=\"subMenuHumanResource\"]/li[2]/a");
	// departmenttitle
	By departmenttitle = By.name("name");
	// savedepartment
	By savedepartment = By
			.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[2]/div/button");
	// departmentselect
	By departmentselect = By.xpath("(//button[@class='btn dropdown-toggle'])[1]");
	// edit
	By departmentedit = By.xpath("//*[@id=\"table_id\"]/tbody/tr[1]/td[2]/div/div/a[1]");
	// update
	By updatedepartment = By
			.xpath("//*[@id=\"main-content\"]/section[2]/div/div[2]/div[1]/div/div/form/div/div/div[2]/div/button");
	
	//department delete
	By department_delete = By.xpath("//*[@id=\"table_id\"]/tbody/tr[1]/td[2]/div/div/a[2]");
	
	//department delete confirm
	By department_delete_confirm = By.xpath("(//button[@class='primary-btn fix-gr-bg'])[6]");
	
	//department delete cancel
	By department_delete_cancel = By.xpath("(//button[@class='primary-btn tr-bg'])[5]");
	
	/*
	 * 
	 * Add Staff
	 * 
	 */
	
	// add staff
	By addstaff = By.xpath("//a[contains(text(),'Add Staff')]");
	//staffrole
	By staffrole = By.xpath("//*[@id=\"main-content\"]/section[2]/div/form/div/div/div/div[1]/div[3]/div[2]/div/div");
	//specificrole
	By specificrole_accountant = By.xpath("(//li[contains(text(),'Accountant')])");
	
	//role_admin
	By specificrole_admin = By.xpath("(//li[contains(text(),'Admin')])[1]");
	
	//role driver
	By specificrole_driver = By.xpath("(//li[contains(text(),'Driver')])[1]");
	
	//role librarian
	By specificrole_librarian = By.xpath("(//li[contains(text(),'Librarian')])[1]");
	
	//role receptionist
	By specificrole_receptionist = By.xpath("(//li[contains(text(),'Receptionist')])[1]");
	
	//role teacher
	By specificrole_teacher = By.xpath("(//li[contains(text(),'Teacher')])[1]");
	
	// department
	By staffdepartment = By.xpath("//*[@id=\"main-content\"]/section[2]/div/form/div/div/div/div[1]/div[3]/div[3]/div/div");
	// specificdepartment
	By specificdepartment = By.xpath("//*[@id=\"main-content\"]/section[2]/div/form/div/div/div/div[1]/div[3]/div[3]/div/div/ul/li[2]");
	
	// designation
	By staffdesignation = By
			.xpath("//*[@id=\"main-content\"]/section[2]/div/form/div/div/div/div[1]/div[3]/div[4]/div/div");
	// specificdesignation
	By specificdesignation = By.xpath("//*[@id=\"main-content\"]/section[2]/div/form/div/div/div/div[1]/div[3]/div[4]/div/div/ul/li[2]");
	
	//first_name
	By first_name = By.name("first_name");
	
	// last_name
	By last_name = By.name("last_name");

	// fathers_name
	By fathers_name = By.name("fathers_name");

	// mothers_name
	By mothers_name = By.name("mothers_name");
	
	// email
	By email = By.name("email");
	
	//gender
	By gender = By.xpath("//*[@id=\"main-content\"]/section[2]/div/form/div/div/div/div[1]/div[5]/div[2]/div/div");
	
	//specificgender
	By specificgender = By.xpath("//li[contains(text(),'Male')]");
	
	/*
	 * 
	 * 
	 */
	//date
	//click date
	By clickdate = By.id("startDate");
	
	//get month
	By getmonth = By.xpath("/html[1]/body[1]/div[5]/div[1]/table[1]/thead[1]/tr[1]/th[2]");
	
	//sitebar
	By sitebar = By.xpath("//body[1]/div[5]/div[1]/table[1]/thead[1]/tr[1]/th[1]");
	
	//datepicker
	public int  day = 15;
	By datepicker = By.xpath("/html[1]/body[1]/div[5]/div[1]/table[1]/tbody[1]/tr/td[contains(text(),"+day+")]");
	
	/*
	 * 
	 * 
	 * 
	 */
	//date of joining
	// click date
	By clickdate2 = By.id("date_of_joining");

	// get month
	By getmonth2 = By.xpath("/html[1]/body[1]/div[5]/div[1]/table[1]/thead[1]/tr[1]/th[2]");

	// sitebar
	By sitebar2 = By.xpath("//body[1]/div[5]/div[1]/table[1]/thead[1]/tr[1]/th[1]");

	// datepicker
	public int day2 = 15;
	By datepicker2 = By.xpath("/html[1]/body[1]/div[5]/div[1]/table[1]/tbody[1]/tr/td[contains(text(),"+day2+")]");
	
	/*
	 * 
	 * 
	 */
	// mobile
	By mobile = By.name("mobile");
	/*
	 * 
	 */
	//meritarial status
	By meritarialstatus = By.xpath("//*[@id=\"main-content\"]/section[2]/div/form/div/div/div/div[1]/div[6]/div[2]/div/div");
	
	//specificmeritarialstatus
	By specificmetitarialstatus = By.xpath("//li[contains(text(),'Unmarried')]");
	
	/*
	 * 
	 */
	//upload image
	By uploadimage = By.xpath("//*[@id=\"main-content\"]/section[2]/div/form/div/div/div/div[1]/div[7]/div/div/div[2]/button/label");
	
	//upload resume
	By upload_resume = By.xpath("(//label[@class='primary-btn small fix-gr-bg'])[2]");
	
	//upload join letter
	By upload_join_letter = By.xpath("(//label[@class='primary-btn small fix-gr-bg'])[3]");
	
	//upload other document
	By upload_other_document = By.xpath("(//label[@class='primary-btn small fix-gr-bg'])[4]");
	
	//crop
	By cropbutton = By.id("upload_logo");
	
	// current address
	By current_address = By.id("current_address");
	
	//basic_salary
	By basic_salary = By.name("basic_salary");
	
	//save staff
	By savedstaff = By.xpath("//button[@class='primary-btn fix-gr-bg submit']");
	
	//add staff
	By add_new_staff = By.xpath("//a[@class='primary-btn small fix-gr-bg']");
	By add_new_staff2 = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div[1]/div[2]/a");
	
	
	/*
	 * 
	 * 
	 * Staff directory
	 * 
	 * 
	 */
	
	//staff directory
	By staff_Directory = By.xpath("//a[contains(text(),'Staff Directory')]");
	
	//actionselect
	By actionslect = By.xpath("//*[@id=\"2\"]/td[9]/div/button");
	
	//edit
	By humanresourceedit = By.xpath("//tbody/tr[@id='2']/td[9]/div[1]/div[1]/a[2]");
	
	// save staff
	By Savedstaff1 = By.xpath("//button[@class='primary-btn fix-gr-bg submit']");
	
	//status
	By status = By.xpath("//*[@id=\"2\"]/td[8]/label/span");
	
	//view
	By view = By.xpath("//*[@id=\"2\"]/td[9]/div/div/a[1]");
	
	/*
	 * 
	 * 
	 */
	//payroll
	By payroll = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div[1]/div[2]/ul/li[2]/a");
	By leave = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div[1]/div[2]/ul/li[3]/a");
	By document = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div[1]/div[2]/ul/li[4]/a");
	By timeline = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div[1]/div[2]/ul/li[5]/a");
	By addtimeline = By.xpath("//*[@id=\"staffTimeline\"]/div/div/button");
	By nametitle = By.xpath("//input[@class='primary-input form-control{']");
	By clickdate1 = By.id("startDate");
	By getmonth1 = By.xpath("/html[1]/body[1]/div[6]/div[1]/table[1]/thead[1]/tr[1]/th[2]");
	By sitebar1 = By.xpath("//body[1]/div[6]/div[1]/table[1]/thead[1]/tr[1]/th[1]");
	public int day21 = 15;
	By datepicker1 = By.xpath("/html[1]/body[1]/div[6]/div[1]/table[1]/tbody[1]/tr/td[contains(text(),"+day21+")]");
	By Description = By.id("Description");
	By uploadfile = By.xpath("//*[@id=\"add_timeline_madal\"]/div/div/div[2]/div/form/div/div[4]/div/div[2]/button/label");
	By visibleperson = By.xpath("//label[contains(text(),'Visible To This Person')]");
	By savebutton = By.xpath("//*[@id=\"add_timeline_madal\"]/div/div/div[2]/div/form/div/div[6]/div/button[2]");
	
	
	//timeline download
	By timeline_download= By.xpath("(//a[@class='primary-btn tr-bg text-uppercase bord-rad'])[1]");
	
	//timeline delete
	By timeline_delete = By.xpath("//*[@id=\"staffTimeline\"]/div/div[2]/div[1]/div/div[2]/a[1]/span");
	
	//timeline delete cancel
	By timeline_delete_cancel = By.xpath("(//button[@class='primary-btn tr-bg'])[4]");
	
	//timeline delete confirm
	By timeline_delete_confirm = By.xpath("(//a[@class='primary-btn fix-gr-bg'])");
	
	//edit staff
	By edit_staff = By.xpath("//*[@id=\"2\"]/td[9]/div/div/a[2]");
	
	//save staff
	By Savedstaff = By.xpath("//button[@class='primary-btn fix-gr-bg submit']");
	
	//delete staff
	By delete_staff = By.xpath("//*[@id=\"2\"]/td[9]/div/div/a[3]");
	
	//delete staff cancel
	By delete_staff_cancel = By.xpath("(//button[@class='primary-btn tr-bg'])[2]");
	
	//delete staff confirm
	By delete_staff_confirm = By.xpath("(//button[@class='primary-btn fix-gr-bg'])[2]");
	
	String url = "http://pos.rishfa.com/staff-directory";
	
	/*
	 * 
	 * Staff attendance
	 * 
	 */
	
	// staff_Attendance
	By staff_attendance = By.xpath("//a[contains(text(),' Staff Attendance')]");
	
	/*
	 * 
	 */
	//import attendance
	By importattendance = By.xpath("//a[@class='primary-btn small fix-gr-bg pull-right sm_mb_20 sm2_mb_20']");
	
	//upload date
	By clickdate11 = By.id("startDate");
	By getmonth11 = By.xpath("/html[1]/body[1]/div[5]/div[1]/table[1]/thead[1]/tr[1]/th[2]");
	By sitebar11 = By.xpath("//body[1]/div[5]/div[1]/table[1]/thead[1]/tr[1]/th[1]");
	public int day211 = 15;
	By datepicker11 = By.xpath("/html[1]/body[1]/div[5]/div[1]/table[1]/tbody[1]/tr/td[contains(text(),"+day211+")]");
	
	//upload file
	By uploadfile1 = By.xpath("//label[contains(text(),'Browse')]");
	
	//saveattendance
	By saveattendance = By.xpath("//button[@class='primary-btn fix-gr-bg']");
	
	String url1 = "http://pos.rishfa.com/staff-attendance";
	
	//staff attendance role
	By staff_attendance_role = By.xpath("(//div[@class='nice-select niceSelect w-100 bb form-control'])");
	
	//staff attendance specific role
	By staff_attendance_accountant_role = By.xpath("//li[contains(text(),'Accountant')]");
	
	//staff attendance teacher role
	By staff_attendance_teacher_role = By.xpath("//li[contains(text(),'Teacher')]");
	
	//staff attendance driver role
	By staff_attendance_driver_role = By.xpath("//li[contains(text(),'Driver')]");
	
	//staff attendance Librarian role
	By staff_attendance_Librarian_role = By.xpath("//li[contains(text(),'Librarian')]");
	
	//staff attendance Admin role
	By staff_attendance_Admin_role = By.xpath("//li[contains(text(),'Admin')]");
	
	//staff attendance Receptionist role
	By staff_attendance_Receptionist_role = By.xpath("//li[contains(text(),'Receptionist')]");
	
	//staff attendance search
	By staff_attendance_search = By.xpath("//button[@class='primary-btn small fix-gr-bg']");
	
	//staff attendance present
	By staff_attentance_present = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div[3]/div/form/div/div/table/tbody/tr[1]/td[4]/div/div[1]/label");
	
	//staff attendance late
	By staff_attendance_late = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div[3]/div/form/div/div/table/tbody/tr[1]/td[4]/div/div[2]/label");
	
	//staff attendance absent
	By staff_attendance_absent = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div[3]/div/form/div/div/table/tbody/tr[1]/td[4]/div/div[3]/label");
	
	//staff attendance mark holiday
	By staff_attendance_mark_holiday = By.xpath("//button[contains(text(),'Mark Holiday')]");
	
	//staff attendance note
	By staff_attendance_note = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div[3]/div/form/div/div/table/tbody/tr[1]/td[5]/div/textarea");
		
	//save staff attendance
	By save_staff_attendance = By.xpath("//button[@class='primary-btn mr-40 fix-gr-bg nowrap submit']");
	
	/*
	 * 
	 * Staff attendance report
	 * 
	 */
	
	//staff attendance report
	By staff_attendence_report = By.xpath("(//a[contains(text(),'Staff Attendance Report')])[1]");
	
	//staff report role
	By staff_report_role = By.xpath("(//div[@class='nice-select w-100 niceSelect bb form-control'])[1]");
	
	//staff report search
	By staff_report_search = By.xpath("//button[@class='primary-btn small fix-gr-bg']");
	
	//staff report print
	By staff_report_print = By.xpath("//a[@class='primary-btn small fix-gr-bg pull-right']");
	
	String Staff_report_url = "http://pos.rishfa.com/staff-attendance-report";
	
	/*
	 * 
	 * Generate payroll
	 * 
	 */
	
	//staff payroll
	By staff_payroll = By.xpath("(//a[contains(text(), 'Payroll')])[3]");
	
	//staff payroll role
	By staff_payroll_role = By.xpath("(//div[@class='nice-select niceSelect w-100 bb form-control'])[1]");
	

	/*
	 * 
	 * Payroll report
	 * 
	 */
	
	//payroll report
	By payroll_report = By.xpath("(//a[contains(text(), ' Payroll Report')])[2]");
	
	//payroll report roll
	By payroll_report_roll = By.xpath("(//div[@class='nice-select niceSelect w-100 bb form-control'])[1]");
	
	
	// clickhumanresourceButton
	public void clickhumanresourceButton() throws InterruptedException {
		//human resource
		driver.findElement(humanresource).click();
		Thread.sleep(1000);
		
		//designation
		driver.findElement(designation).click();
		Thread.sleep(1000);
		System.out.println("Successfully enter designation");
		
		//designation title
		driver.findElement(designationtitle).sendKeys("Assistant teacher");
		Thread.sleep(1000);
		
		//save designation
		driver.findElement(savedesignation).click();
		Thread.sleep(1000);
		
		//designation select
		driver.findElement(designationselect).click();
		Thread.sleep(1000);
		
		//designation edit
		driver.findElement(designationedit).click();
		Thread.sleep(1000);
		
		//designation update
		driver.findElement(updatedesignation).click();
		Thread.sleep(1000);
		System.out.println("Successfully saved designation");
//		
//		//designation select
//		driver.findElement(designationselect).click();
//		Thread.sleep(1000);
//		
//		//designation_delete
//		driver.findElement(designation_delete).click();
//		Thread.sleep(1000);
//		
//		//designation_delete_cancel
//		driver.findElement(designation_delete_cancel).click();
//		Thread.sleep(1000);
//		
//		//designation select
//		driver.findElement(designationselect).click();
//		Thread.sleep(1000);
//		
//		//designation_delete
//		driver.findElement(designation_delete).click();
//		Thread.sleep(1000);
//		
//		//designation_delete_confirm
//		driver.findElement(designation_delete_confirm).click();
//		Thread.sleep(1000);
	}
	
	/*
	 * 
	 * department
	 * 
	 */
	
	// clickdepartmentButton
	public void clickdepartmentButton() throws InterruptedException {
		
//		//human resource
//		driver.findElement(humanresource).click();
//		Thread.sleep(1000);
		
		//department
		driver.findElement(department).click();
		Thread.sleep(1000);
		System.out.println("Successfully enter department");
		
		//department title
		driver.findElement(departmenttitle).sendKeys("Accounts");
		Thread.sleep(1000);
		
		//save department
		driver.findElement(savedepartment).click();
		Thread.sleep(1000);
		
		//department select
		driver.findElement(departmentselect).click();
		Thread.sleep(1000);
		
		//department edit
		driver.findElement(departmentedit).click();
		Thread.sleep(1000);
		
		//department update
		driver.findElement(updatedepartment).click();
		Thread.sleep(1000);
		
		System.out.println("Successfully saved Department");
		
//		//department select
//		driver.findElement(departmentselect).click();
//		Thread.sleep(1000);
//		
//		//department_delete
//		driver.findElement(department_delete).click();
//		Thread.sleep(1000);
//		
//		//department_delete_cancel
//		driver.findElement(department_delete_cancel).click();
//		Thread.sleep(1000);
//		
//		//department select
//		driver.findElement(departmentselect).click();
//		Thread.sleep(1000);
//		
//		//department_delete
//		driver.findElement(department_delete).click();
//		Thread.sleep(1000);
//		
//		//department_delete_confirm
//		driver.findElement(department_delete_confirm).click();
//		Thread.sleep(1000);
	}
	
	/*
	 * 
	 * Add staff
	 * 
	 */
	public String name() {
		
		
		return RandomStringUtils.randomAlphabetic(5); 
	}
	
	public void random_Email() {
		
		// email
		driver.findElement(email).sendKeys("username"+Random_email+"@gmail.com");
	
	}
	
	public void addStaffInfo() throws AWTException, InterruptedException {
		this.Random_email = this.name();
		this.first_Name = this.name();
		this.last_Name = this.name();
		this.father_name = this.name();
		this.mother_name = this.name();
		// department
		driver.findElement(staffdepartment).click();
		Thread.sleep(1000);

		// specific department
		driver.findElement(specificdepartment).click();
		Thread.sleep(1000);

		// designation
		driver.findElement(staffdesignation).click();
		Thread.sleep(1000);

		// specific designation
		driver.findElement(specificdesignation).click();
		Thread.sleep(1000);

		// first name
		driver.findElement(first_name).sendKeys(this.first_Name);
		Thread.sleep(1000);

		// last name
		driver.findElement(last_name).sendKeys(this.last_Name);
		Thread.sleep(1000);

		// father's name
		driver.findElement(fathers_name).sendKeys(this.father_name);
		Thread.sleep(1000);

		// mother's name
		driver.findElement(mothers_name).sendKeys(this.mother_name);
		Thread.sleep(1000);

		// email
		random_Email();
		Thread.sleep(1000);

		// gender
		driver.findElement(gender).click();
		Thread.sleep(1000);

		// specific gender
		driver.findElement(specificgender).click();
		Thread.sleep(1000);

		/*
		 * 
		 * 
		 * 
		 */
		// date

		// clickuploaddatebutton

		String month2 = "MARCH 2022";

		driver.findElement(clickdate).click(); // click calender

		while (true) {
			String text = driver.findElement(getmonth).getText(); // locator is month and year

			if (text.equals(month2)) {
				break;
			} else {

				driver.findElement(sitebar).click(); // locator of site arrow.you have to change it
			}
		}

		driver.findElement(datepicker).click(); // locator of all date.

		/*
		 * 
		 * 
		 * 
		 */
		// joining date
		// clickuploadjoindatebutton

		String month = "MARCH 2022";

		driver.findElement(clickdate2).click(); // click calender

		while (true) {
			String text = driver.findElement(getmonth2).getText(); // locator is month and year

			if (text.equals(month)) {
				break;
			} else {

				driver.findElement(sitebar2).click(); // locator of site arrow.you have to change it
			}
		}

		driver.findElement(datepicker2).click(); // locator of all date.

		/*
		 * 
		 * 
		 * 
		 */

		// mobile number
		driver.findElement(mobile).sendKeys("01709503168");
		Thread.sleep(1000);

		// meriatarial status
		driver.findElement(meritarialstatus).click();
		Thread.sleep(1000);

		// specific meritarial status
		driver.findElement(specificmetitarialstatus).click();
		Thread.sleep(1000);

		// upload image
		driver.findElement(uploadimage).click();
		Thread.sleep(1000);
		
		String filePath=upload.getFilePath("1.jpg");
		upload.profilePicUpload(filePath);
		Thread.sleep(1000);

		// crop button
		driver.findElement(cropbutton).click();
		Thread.sleep(1000);

		// address
		driver.findElement(current_address).sendKeys("mohammadpur");
		Thread.sleep(1000);

		// basic salary
		driver.findElement(basic_salary).sendKeys("50000");
		Thread.sleep(1000);

		// upload_resume
		driver.findElement(upload_resume).click();
		Thread.sleep(1000);
		String filePath1=upload.getFilePath("google_drive.pdf");
		upload.PDFfileUpload(filePath1);
		Thread.sleep(1000);

		// upload_join_letter
		driver.findElement(upload_join_letter).click();
		Thread.sleep(1000);
		String filePath2=upload.getFilePath("google_drive.pdf");
		upload.PDFfileUpload(filePath2);
		Thread.sleep(1000);

		// upload_other_document
		driver.findElement(upload_other_document).click();
		String filePath3=upload.getFilePath("google_drive.pdf");
		upload.PDFfileUpload(filePath3);
		Thread.sleep(1000);

		// add staff
		driver.findElement(savedstaff).click();
		Thread.sleep(1000);
		System.out.println("Successfully saved staff");
		

		
	}
	
	// clickaddstaffButton
	public void clickaddstaffButton() throws InterruptedException, AWTException {
		
//		//human resource
//		driver.findElement(humanresource).click();
//		Thread.sleep(1000);
		
		//add staff
		driver.findElement(addstaff).click();
		Thread.sleep(1000);
		System.out.println("Successfully enter add staff");
		
		//staff roll
		driver.findElement(staffrole).click();
		Thread.sleep(1000);
		
		//specific staff role
		driver.findElement(specificrole_accountant).click();
		Thread.sleep(1000);
		
		//call addStaffInfo
		addStaffInfo();
		Thread.sleep(1000);
		System.out.println("Successfully added accountant staff");
		

		
		/*
		 * admin
		 */
		//add staff
		driver.findElement(add_new_staff2).click();
		Thread.sleep(1000);
		
		//staff roll
		driver.findElement(staffrole).click();
		Thread.sleep(1000);
		
		//specific staff role
		driver.findElement(specificrole_admin).click();
		Thread.sleep(1000);
		
		//call addStaffInfo
		addStaffInfo();
		Thread.sleep(1000);
		System.out.println("Successfully added admin staff");
		
		/*
		 * driver
		 */
		
		//add staff
		driver.findElement(add_new_staff2).click();
		Thread.sleep(1000);
		//staff roll
		driver.findElement(staffrole).click();
		Thread.sleep(1000);
		
		//specific staff role
		driver.findElement(specificrole_driver).click();
		Thread.sleep(1000);
		
		//call addStaffInfo
		addStaffInfo();
		Thread.sleep(1000);
		System.out.println("Successfully added driver staff");
		
		/*
		 * librarian
		 */
		
		//add staff
		driver.findElement(add_new_staff2).click();
		Thread.sleep(1000);
		
		//staff roll
		driver.findElement(staffrole).click();
		Thread.sleep(1000);
		
		//specific staff role
		driver.findElement(specificrole_librarian).click();
		Thread.sleep(1000);
		
		//call addStaffInfo
		addStaffInfo();
		Thread.sleep(1000);
		System.out.println("Successfully added librarian staff");
		
		/*
		 * receptionist
		 */
		
		//add staff
		driver.findElement(add_new_staff2).click();
		Thread.sleep(1000);
		
		//staff roll
		driver.findElement(staffrole).click();
		Thread.sleep(1000);
		
		//specific staff role
		driver.findElement(specificrole_receptionist).click();
		Thread.sleep(1000);
		
		//call addStaffInfo
		addStaffInfo();
		Thread.sleep(1000);
		System.out.println("Successfully added receptionist staff");
		
		/*
		 * teacher
		 */
		
		//add staff
		driver.findElement(add_new_staff2).click();
		Thread.sleep(1000);
		
		//staff roll
		driver.findElement(staffrole).click();
		Thread.sleep(1000);
		
		//specific staff role
		driver.findElement(specificrole_teacher).click();
		Thread.sleep(1000);
		
		//call addStaffInfo
		addStaffInfo();
		Thread.sleep(1000);
		System.out.println("Successfully added teacher staff");
		
		

		}
	
	// clickstaff_DirectoryButton
	public void clickstaff_DirectoryButton() throws InterruptedException, AWTException {
		
//		//human resource
//		driver.findElement(humanresource).click();
//		Thread.sleep(1000);
		
		driver.findElement(staff_Directory).click();
		Thread.sleep(1000);
		System.out.println("Successfully enter staff directory");

		/*
		 * 
		 * 
		 */
		
		//clickactionselectbutton
		driver.findElement(actionslect).click();
		Thread.sleep(1000);
			
		//view
		driver.findElement(view).click();
		Thread.sleep(1000);
		
		driver.findElement(payroll).click();
		Thread.sleep(1000);
		
		driver.findElement(leave).click();
		Thread.sleep(1000);
		
		driver.findElement(document).click();
		Thread.sleep(1000);
		
		driver.findElement(timeline).click();
		Thread.sleep(1000);
		
		driver.findElement(addtimeline).click();
		Thread.sleep(1000);
		
		driver.findElement(nametitle).sendKeys("loren ipsum");
		Thread.sleep(1000);
		// clickuploadjoindatebutton
		String month = "MARCH 2022";

		driver.findElement(clickdate1).click(); // click calender

		while (true) {
			String text = driver.findElement(getmonth1).getText(); // locator is month and year

			if (text.equals(month)) {
				break;
			} else {

				driver.findElement(sitebar1).click(); // locator of site arrow.you have to change it
			}
		}

		driver.findElement(datepicker1).click(); // locator of all date.
		Thread.sleep(1000);
		
		//description
		driver.findElement(Description).sendKeys("It is a long established fact that a reader will be distracted"
				+ " by the readable content of a page when looking at its layout. ");
		Thread.sleep(1000);
		
		//upload file
		driver.findElement(uploadfile).click();
		Thread.sleep(2000);
		
		String filePath=upload.getFilePath("Uploaded lesson file.txt");
		upload.textfileUpload(filePath);
		Thread.sleep(1000);
		
		//visible person
		driver.findElement(visibleperson).click();
		
		//savebutton
		driver.findElement(savebutton).click();
		System.out.println("Successfully saved timeline");
		
		//timeline_download
		driver.findElement(timeline_download).click();
		Thread.sleep(1000);
		System.out.println("Successfully download timeline");
		
//		//timeline_delete
//		driver.findElement(timeline_delete).click();
//		Thread.sleep(1000);
//		
//		//timeline_delete_cancel
//		driver.findElement(timeline_delete_cancel).click();
//		Thread.sleep(2000);
		
//		//timeline_delete
//		driver.findElement(timeline_delete).click();
//		Thread.sleep(1000);
//		
//		//timeline_delete_confirm
//		driver.findElement(timeline_delete_confirm).click();
//		Thread.sleep(1000);
		
		/*
		 * 
		 */
		
//		//get staff list
//		driver.get(url);
//		Thread.sleep(1000);
//		
//
//		
//
//		//actionslect
//		driver.findElement(actionslect).click();
//		Thread.sleep(1000);
//		
//		//edit_staff
//		driver.findElement(edit_staff).click();
//		Thread.sleep(1000);
//		
//		//Savedstaff
//		driver.findElement(Savedstaff).click();
//		Thread.sleep(1000);
//		
//		//actionslect
//		driver.findElement(actionslect).click();
//		Thread.sleep(1000);
//		
//		//delete_staff
//		driver.findElement(delete_staff).click();
//		Thread.sleep(1000);
//		
//		//delete_staff_cancel
//		driver.findElement(delete_staff_cancel).click();
//		Thread.sleep(1000);
//		
//		//actionslect
//		driver.findElement(actionslect).click();
//		Thread.sleep(1000);
//		
//		//delete_staff
//		driver.findElement(delete_staff).click();
//		Thread.sleep(1000);
		
//		//delete_staff_confirm
//		driver.findElement(delete_staff_confirm).click();
//		Thread.sleep(1000);
	}
	
	/*
	 * 
	 * Staff attendance
	 * 
	 */
	
	// clickstaff_AttendanceButton
	public void clickstaff_AttendanceButton() throws InterruptedException, AWTException {
		
		//human resource
		driver.findElement(humanresource).click();
		Thread.sleep(1000);
		
		driver.findElement(staff_attendance).click();
		Thread.sleep(1000);
		System.out.println("Successfully enter staff attendance");
		
		//import attendance
		driver.findElement(importattendance).click();
		Thread.sleep(1000);
		
		//upload date

			String month = "MARCH 2022";

			driver.findElement(clickdate11).click(); // click calender

			while (true) {
				String text = driver.findElement(getmonth11).getText(); // locator is month and year

				if (text.equals(month)) {
					break;
				} else {

					driver.findElement(sitebar11).click(); // locator of site arrow.you have to change it
				}
			}

			driver.findElement(datepicker11).click(); // locator of all date.
			Thread.sleep(1000);
			
			//upload file
			driver.findElement(uploadfile1).click();
			Thread.sleep(2000);
			
			//upload list
			String filePath2=upload.getFilePath("staff_attendance.xlsx");
			upload.staffattentanceUpload(filePath2);
			Thread.sleep(1000);
			
			//saveattendancebutton
			driver.findElement(saveattendance).click();
			Thread.sleep(1000);
			System.out.println("Successfully saved imported Attendance");
			
			//human resource
			driver.findElement(humanresource).click();
			Thread.sleep(1000);
			
			driver.findElement(staff_attendance).click();
			Thread.sleep(1000);
			
			/*
			 * Accountant attendance late
			 */
			
			//staff_attendance_role
			driver.findElement(staff_attendance_role).click();
			Thread.sleep(1000);
			
			//staff_attendance_accountant_role
			driver.findElement(staff_attendance_accountant_role).click();
			Thread.sleep(1000);
			
			//staff_attendance_search
			driver.findElement(staff_attendance_search).click();
			Thread.sleep(1000);
			
			int size = driver.findElements(By.xpath("//*[@id=\"main-content\"]/section[2]/div/div[3]/div/form/div/div/table/tbody/tr/td[4]/div/div[2]/label")).size();
			System.out.println(size);
			
			int i =1;
			while (i <= size) {
				
				WebElement late = driver.findElement(By.xpath("//*[@id=\"main-content\"]/section[2]/div/div[3]/div/form/div/div/table/tbody/tr["+i+"]/td[4]/div/div[2]/label"));
				
				late.click();
				i++;
			}
			
			/*
			 * note
			 */
			
			int size4 = driver.findElements(By.xpath("//*[@id=\"main-content\"]/section[2]/div/div[3]/div/form/div/div/table/tbody/tr/td[5]/div/textarea")).size();
			System.out.println(size4);
			
			int i4 =1;
			while (i4 <= size4) {
				
				WebElement note1 = driver.findElement(By.xpath("//*[@id=\"main-content\"]/section[2]/div/div[3]/div/form/div/div/table/tbody/tr["+i4+"]/td[5]/div/textarea"));
				
				note1.clear();
				note1.sendKeys("Staff is late");
				i4++;
			}
				
			
			//save_staff_attendance
			driver.findElement(save_staff_attendance).click();
			Thread.sleep(1000);
			System.out.println("Successfully saved accountant Attendance");

			
			/*
			 * driver attendance absent
			 */
			
			//staff_attendance_role
			driver.findElement(staff_attendance_role).click();
			Thread.sleep(1000);
			
			//staff_attendance_accountant_role
			driver.findElement(staff_attendance_driver_role).click();
			Thread.sleep(1000);
			
			//staff_attendance_search
			driver.findElement(staff_attendance_search).click();
			Thread.sleep(1000);
			
			int size2 = driver.findElements(By.xpath("//*[@id=\"main-content\"]/section[2]/div/div[3]/div/form/div/div/table/tbody/tr/td[4]/div/div[3]/label")).size();
			System.out.println(size2);
			
			int i2 =1;
			while (i2 <= size2) {
				
				WebElement Absent = driver.findElement(By.xpath("//*[@id=\"main-content\"]/section[2]/div/div[3]/div/form/div/div/table/tbody/tr["+i2+"]/td[4]/div/div[3]/label"));
				
				Absent.click();
				i2++;
			}
			
			/*
			 * note
			 */
			
			int size5 = driver.findElements(By.xpath("//*[@id=\"main-content\"]/section[2]/div/div[3]/div/form/div/div/table/tbody/tr/td[5]/div/textarea")).size();
			System.out.println(size5);
			
			int i5 =1;
			while (i5 <= size5) {
				
				WebElement note2 = driver.findElement(By.xpath("//*[@id=\"main-content\"]/section[2]/div/div[3]/div/form/div/div/table/tbody/tr["+i5+"]/td[5]/div/textarea"));
				
				note2.clear();
				note2.sendKeys("Staff is Absent");
				i5++;
			}
				
			
			//save_staff_attendance
			driver.findElement(save_staff_attendance).click();
			Thread.sleep(1000);
			System.out.println("Successfully saved driver Attendance");
			
			
//			/*
//			 * Teacher attendance present
//			 */
//			
//			driver.get(url1);
//			Thread.sleep(1000);
		
			//staff_attendance_role
			driver.findElement(staff_attendance_role).click();
			Thread.sleep(1000);
			
			//staff_attendance_accountant_role
			driver.findElement(staff_attendance_teacher_role).click();
			Thread.sleep(1000);
			
			//staff_attendance_search
			driver.findElement(staff_attendance_search).click();
			Thread.sleep(1000);
			
			int size3 = driver.findElements(By.xpath("//*[@id=\"main-content\"]/section[2]/div/div[3]/div/form/div/div/table/tbody/tr/td[4]/div/div[1]/label")).size();
			System.out.println(size3);
			
			int i3 =1;
			while (i3 <= size3) {
				
				WebElement Present = driver.findElement(By.xpath("//*[@id=\"main-content\"]/section[2]/div/div[3]/div/form/div/div/table/tbody/tr["+i3+"]/td[4]/div/div[1]/label"));
				
				Present.click();
				i3++;
			}
			
			/*
			 * note
			 */
			
			int size6 = driver.findElements(By.xpath("//*[@id=\"main-content\"]/section[2]/div/div[3]/div/form/div/div/table/tbody/tr/td[5]/div/textarea")).size();
			System.out.println(size6);
			
			int i6 =1;
			while (i6 <= size6) {
				
				WebElement note2 = driver.findElement(By.xpath("//*[@id=\"main-content\"]/section[2]/div/div[3]/div/form/div/div/table/tbody/tr["+i6+"]/td[5]/div/textarea"));
				
				note2.clear();
				note2.sendKeys("Staff is Present");
				i6++;
			}
			
			//save_staff_attendance
			driver.findElement(save_staff_attendance).click();
			Thread.sleep(1000);
			System.out.println("Successfully saved teacher Attendance");
			
//			/*
//			 * librarian attendance holiday
//			 */
//			
//			driver.get(url1);
//			Thread.sleep(1000);
		
			//staff_attendance_role
			driver.findElement(staff_attendance_role).click();
			Thread.sleep(1000);
			
			//staff_attendance_accountant_role
			driver.findElement(staff_attendance_Librarian_role).click();
			Thread.sleep(1000);
			
			//staff_attendance_search
			driver.findElement(staff_attendance_search).click();
			Thread.sleep(1000);
			
			//staff_attendance_note
			driver.findElement(staff_attendance_note).clear();
			Thread.sleep(1000);
			driver.findElement(staff_attendance_note).sendKeys("Make a holiday");
			Thread.sleep(1000);
			
			//staff_attendance_mark_holiday
			driver.findElement(staff_attendance_mark_holiday).click();
			Thread.sleep(1000);
			System.out.println("Successfully saved librarian Attendance");

	}
	
	/*
	 * 
	 * 
	 * Staff attendabce report
	 * 
	 * 
	 */
	
	public void attendance_reportInfo() throws InterruptedException {
		
		//staff_report_search
		driver.findElement(staff_report_search).click();
		Thread.sleep(1000);
		
		//staff_report_print
		driver.findElement(staff_report_print).click();
		Thread.sleep(1000);
		
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1)); //switch to new tab
		Thread.sleep(2000);
		
		//close the window
		driver.close();
		
		//switch to previous window
		ArrayList<String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs1.get(0)); //switch to new tab
		Thread.sleep(2000);
		
	}
	
	public void clickstaff_attendence_reportButton() throws InterruptedException {
		
//		//human resource
//		driver.findElement(humanresource).click();
//		Thread.sleep(1000);
		
		//staff_attendence_report
		driver.findElement(staff_attendence_report).click();
		Thread.sleep(1000);
		System.out.println("Successfully enter attendance report");
		
		/*
		 * accountant report
		 */
		
		//staff_report_role
		driver.findElement(staff_report_role).click();
		Thread.sleep(1000);
		
		//staff_attendance_accountant_role
		driver.findElement(staff_attendance_accountant_role).click();
		Thread.sleep(1000);
		
		//call attendance_reportInfo
		attendance_reportInfo();
		Thread.sleep(1000);
		System.out.println("Successfully showing accountant Attendance");
		
		/*
		 * teacher report
		 */
		
		//staff_report_role
		driver.findElement(staff_report_role).click();
		Thread.sleep(1000);
		
		//staff_attendance_accountant_role
		driver.findElement(staff_attendance_teacher_role).click();
		Thread.sleep(1000);
		
		//call attendance_reportInfo
		attendance_reportInfo();
		Thread.sleep(1000);
		System.out.println("Successfully showing teacher Attendance");
		
		/*
		 * driver report
		 */
		
		//staff_report_role
		driver.findElement(staff_report_role).click();
		Thread.sleep(1000);
		
		//staff_attendance_accountant_role
		driver.findElement(staff_attendance_driver_role).click();
		Thread.sleep(1000);
		
		//call attendance_reportInfo
		attendance_reportInfo();
		Thread.sleep(1000);
		System.out.println("Successfully showing driver Attendance");
		
		/*
		 * librarian report
		 */
		
		//staff_report_role
		driver.findElement(staff_report_role).click();
		Thread.sleep(1000);
		
		//staff_attendance_accountant_role
		driver.findElement(staff_attendance_Librarian_role).click();
		Thread.sleep(1000);
		
		//call attendance_reportInfo
		attendance_reportInfo();
		Thread.sleep(1000);
		System.out.println("Successfully showing librarian Attendance");

	}
	
	/*
	 * 
	 * 
	 * Staff payroll
	 * 
	 * 
	 */
	
	public void generateButton(int i) throws InterruptedException {

		//action select
		driver.findElement(By.xpath("//*[@id=\"table_id\"]/tbody/tr["+i+"]/td[8]/div/button")).click();
		Thread.sleep(1000);
		
		//proceed to pay
		driver.findElement(By.xpath("//*[@id=\"table_id\"]/tbody/tr["+i+"]/td[8]/div/div/a[1]")).click();
		Thread.sleep(1000);
		
		//expense head
		driver.findElement(By.xpath("//*[@id=\"showDetaildModalBody\"]/div/form/div/div[1]/div[1]/div[2]/div/div/span")).click();
		Thread.sleep(1000);
		
		//specific head
		driver.findElement(By.xpath("//*[@id=\"showDetaildModalBody\"]/div/form/div/div[1]/div[1]/div[2]/div/div/ul/li[2]")).click();
		Thread.sleep(1000);
		
		//payment method
		driver.findElement(By.xpath("(//div[@class='nice-select niceSelect1 w-100 bb form-control'])[2]")).click();
		Thread.sleep(1000);
		
		//cash payment
		driver.findElement(By.xpath("(//li[contains(text(), 'Cash')])")).click();
		Thread.sleep(1000);
		
		//note
		driver.findElement(By.name("note")).sendKeys("Paid");
		Thread.sleep(1000);
		
		//save
		driver.findElement(By.xpath("//input[@class='primary-btn fix-gr-bg']")).click();
		Thread.sleep(1000);
		
//		//print
//		driver.findElement(By.xpath("//*[@id=\"table_id\"]/tbody/tr["+i+"]/td[8]/div/div/a[2]")).click();
//		Thread.sleep(1000);
		
	}
	
	public void not_generate(int i) throws InterruptedException {
	
		//action select
		driver.findElement(By.xpath("//*[@id=\"table_id\"]/tbody/tr["+i+"]/td[8]/div/button")).click();
		Thread.sleep(1000);
		
		//generate payroll
		driver.findElement(By.xpath("//*[@id=\"table_id\"]/tbody/tr["+i+"]/td[8]/div/div/a")).click();
		Thread.sleep(1000);
		
		//earning
		driver.findElement(By.xpath("//*[@id=\"main-content\"]/form/section/div/div/div[1]/div[1]/div[2]/button/span")).click();
		Thread.sleep(1000);
		
		//earning type
		driver.findElement(By.name("earningsType[]")).sendKeys("1212");
		Thread.sleep(1000);
		
		//deduction
		driver.findElement(By.name("deductionstype[]")).sendKeys("123");
		Thread.sleep(1000);
		
		//calculate
		driver.findElement(By.xpath("//button[@class='primary-btn small fix-gr-bg']")).click();
		Thread.sleep(1000);
		
		//submit
		driver.findElement(By.xpath("//button[@class='primary-btn fix-gr-bg']")).click();
		Thread.sleep(1000);
		
	}
	
	public void paidButton(int i) throws InterruptedException {
		
		//action select
		driver.findElement(By.xpath("//*[@id=\"table_id\"]/tbody/tr["+i+"]/td[8]/div/button")).click();
		Thread.sleep(1000);
		
		//view payslip
		driver.findElement(By.xpath("//*[@id=\"table_id\"]/tbody/tr[1]/td[8]/div/div/a")).click();
		Thread.sleep(1000);
		
//		//print
//		driver.findElement(By.xpath("//a[@class='primary-btn small fix-gr-bg pull-right']")).click();
//		Thread.sleep(1000);
//		
//		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
//		driver.switchTo().window(tabs.get(1)); //switch to new tab
//		Thread.sleep(2000);
//		
//		//close the window
//		driver.close();
//		
//		//switch to previous window
//		ArrayList<String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
//		driver.switchTo().window(tabs1.get(0)); //switch to new tab
//		Thread.sleep(2000);
		
		//cancel
		driver.findElement(By.xpath("//*[@id=\"modalSize\"]/div/div[1]/button")).click();
		Thread.sleep(1000);
	}
	
	public void checkstatus() throws InterruptedException {
		
		int i = 1;
		int generate = 0;
		int not_generate = 0;
		int paid = 0;
		boolean found = true;
		
		while(found) {
			
			if(driver.findElements(By.xpath("//*[@id=\"table_id\"]/tbody/tr["+i+"]/td[7]/button")).size()>0){
				
				String str = new String(driver.findElement(By.xpath("//*[@id=\"table_id\"]/tbody/tr["+i+"]/td[7]/button")).getText().trim());
				
				System.out.println(str);
				
				if(str.matches("GENERATE") && generate ==0) {
					System.out.println("Enter in Generate");
					this.generateButton(i);
					generate = 1;
					System.out.println("Generate =" +generate);
					
				}
				
				else if(str.matches("NOT GENERATED") && not_generate == 0) {
					System.out.println("Enter in Not Generate");
					this.not_generate(i);
					not_generate = 1;
					System.out.println("Not Generate=" + not_generate);
				}
				
				else if(str.matches("PAID") && paid == 0) {
					System.out.println("Enter in Paid");
					this.paidButton(i);
					paid = 1;
					System.out.println("Paid =" + paid);
				}
				
				if(generate ==1 && not_generate == 1 && paid == 1) {
					  break;
				}

				
			}
			
		else {
				found = false;
		}
			
			i = i+1;
		}
		
	}
	
	public void clickstaffpayrollbutton() throws InterruptedException {
		
		//human resource
		driver.findElement(humanresource).click();
		Thread.sleep(1000);
		
		//staff_payroll
		driver.findElement(staff_payroll).click();
		Thread.sleep(1000);
		System.out.println("Successfully enter staff payroll");
		
		/*
		 * driver payroll
		 */
		
		//staff_payroll_role
		driver.findElement(staff_payroll_role).click();
		Thread.sleep(1000);
		
		// staff_attendance_driver_role
		driver.findElement(staff_attendance_driver_role).click();
		Thread.sleep(1000);
		
		//staff_attendance_search
		driver.findElement(staff_attendance_search).click();
		Thread.sleep(1000);
		
		//call checkstatus
		checkstatus();
		Thread.sleep(1000);
		System.out.println("Checking complete payroll of driver");
		
		/*
		 * teacher payroll
		 */
		
		//staff_payroll_role
		driver.findElement(staff_payroll_role).click();
		Thread.sleep(1000);
		
		// staff_attendance_driver_role
		driver.findElement(staff_attendance_teacher_role).click();
		Thread.sleep(1000);
		
		//staff_attendance_search
		driver.findElement(staff_attendance_search).click();
		Thread.sleep(1000);
		
		//call checkstatus
		checkstatus();
		Thread.sleep(1000);
		System.out.println("Checking complete payroll of teacher");
		
		/*
		 * accountant payroll
		 */
		
		//staff_payroll_role
		driver.findElement(staff_payroll_role).click();
		Thread.sleep(1000);
		
		// staff_attendance_driver_role
		driver.findElement(staff_attendance_accountant_role).click();
		Thread.sleep(1000);
		
		//staff_attendance_search
		driver.findElement(staff_attendance_search).click();
		Thread.sleep(1000);
		
		//call checkstatus
		checkstatus();
		Thread.sleep(1000);
		System.out.println("Checking complete payroll of accountant");
		
		/*
		 * accountant payroll
		 */
		
		//staff_payroll_role
		driver.findElement(staff_payroll_role).click();
		Thread.sleep(1000);
		
		// staff_attendance_driver_role
		driver.findElement(staff_attendance_Librarian_role).click();
		Thread.sleep(1000);
		
		//staff_attendance_search
		driver.findElement(staff_attendance_search).click();
		Thread.sleep(1000);
		
		//call checkstatus
		checkstatus();
		Thread.sleep(1000);
		System.out.println("Checking complete payroll of librarian");
		
		/*
		 * admin payroll
		 */
		
		//staff_payroll_role
		driver.findElement(staff_payroll_role).click();
		Thread.sleep(1000);
		
		// staff_attendance_driver_role
		driver.findElement(staff_attendance_Admin_role).click();
		Thread.sleep(1000);
		
		//staff_attendance_search
		driver.findElement(staff_attendance_search).click();
		Thread.sleep(1000);
		
		//call checkstatus
		checkstatus();
		Thread.sleep(1000);
		System.out.println("Checking complete payroll of admin");
		
		/*
		 * Receptionist payroll
		 */
		
		//staff_payroll_role
		driver.findElement(staff_payroll_role).click();
		Thread.sleep(1000);
		
		// staff_attendance_driver_role
		driver.findElement(staff_attendance_Receptionist_role).click();
		Thread.sleep(1000);
		
		//staff_attendance_search
		driver.findElement(staff_attendance_search).click();
		Thread.sleep(1000);
		
		//call checkstatus
		checkstatus();
		Thread.sleep(1000);
		System.out.println("Checking complete payroll of receptionist");
	}
	
	/*
	 * 
	 * payroll_report
	 * 
	 */
	
	public void clickpayroll_reportButton() throws InterruptedException {
		
//		//human resource
//		driver.findElement(humanresource).click();
//		Thread.sleep(1000);
		
		//payroll_report
		driver.findElement(payroll_report).click();
		Thread.sleep(1000);
		System.out.println("Successfully enter payroll report");
		
		
		/*
		 * acoountant report
		 */
		
		//payroll_report_roll
		driver.findElement(payroll_report_roll).click();
		Thread.sleep(1000);
		
		//staff_attendance_accountant_role
		driver.findElement(staff_attendance_accountant_role).click();
		Thread.sleep(1000);
		
		//staff_report_search
		driver.findElement(staff_report_search).click();
		Thread.sleep(1000);
		System.out.println("Payroll Report Showing of accountant");
		
		/*
		 * receptionist report
		 */
		
		//payroll_report_roll
		driver.findElement(payroll_report_roll).click();
		Thread.sleep(1000);
		
		//staff_attendance_accountant_role
		driver.findElement(staff_attendance_Receptionist_role).click();
		Thread.sleep(1000);
		
		//staff_report_search
		driver.findElement(staff_report_search).click();
		Thread.sleep(1000);
		System.out.println("Payroll Report Showing of receptionist");
		
		/*
		 * admin report
		 */
		
		//payroll_report_roll
		driver.findElement(payroll_report_roll).click();
		Thread.sleep(1000);
		
		//staff_attendance_accountant_role
		driver.findElement(staff_attendance_Admin_role).click();
		Thread.sleep(1000);
		
		//staff_report_search
		driver.findElement(staff_report_search).click();
		Thread.sleep(1000);
		System.out.println("Payroll Report Showing of admin");
		
		/*
		 * librarian report
		 */
		
		//payroll_report_roll
		driver.findElement(payroll_report_roll).click();
		Thread.sleep(1000);
		
		//staff_attendance_accountant_role
		driver.findElement(staff_attendance_Librarian_role).click();
		Thread.sleep(1000);
		
		//staff_report_search
		driver.findElement(staff_report_search).click();
		Thread.sleep(1000);
		
		System.out.println("Payroll Report Showing of librarian");
		
		/*
		 * driver report
		 */
		
		//payroll_report_roll
		driver.findElement(payroll_report_roll).click();
		Thread.sleep(1000);
		
		//staff_attendance_accountant_role
		driver.findElement(staff_attendance_driver_role).click();
		Thread.sleep(1000);
		
		//staff_report_search
		driver.findElement(staff_report_search).click();
		Thread.sleep(1000);
		
		System.out.println("Payroll Report Showing of driver");
		
		/*
		 * teacher report
		 */
		
		//payroll_report_roll
		driver.findElement(payroll_report_roll).click();
		Thread.sleep(1000);
		
		//staff_attendance_accountant_role
		driver.findElement(staff_attendance_teacher_role).click();
		Thread.sleep(1000);
		
		//staff_report_search
		driver.findElement(staff_report_search).click();
		Thread.sleep(1000);
		System.out.println("Payroll Report Showing of teacher");
		System.out.println("Checkout from HumanResource");
		
	}

	
	
}
