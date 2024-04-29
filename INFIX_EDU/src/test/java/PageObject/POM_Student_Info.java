package PageObject;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Common_Method.CommonMethod;


public class POM_Student_Info {
	
	WebDriver d;
	
	CommonMethod cm=  new CommonMethod();
	Random rm= new Random();
	
	
	@FindBy(xpath="//div[contains(text(),'Student Info')]")
	WebElement studentInfo;    //*[@id=\"sidebar_menu\"]/li[4]/a/div[2]
	
	//Student Category
	
	@FindBy(xpath="//*[@id=\"subMenuStudent\"]/li[1]/a")
	WebElement studentCategory;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[1]/div/div/input[1]")
	WebElement categoryType;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[2]/div/button")
	WebElement submitCategory;
	
	@FindBy(xpath="//*[@id=\"table_id\"]/tbody/tr/td[3]/div/button")
	WebElement selectCategory;
	
	@FindBy(xpath="//*[@id=\"table_id\"]/tbody/tr/td[3]/div/div/a[1]")
	WebElement editCategory;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div[2]/div[1]/div/div/form/div/div/div[2]/div/button")
	WebElement updateCategory;
	
	@FindBy(xpath="//*[@id=\"table_id\"]/tbody/tr/td[3]/div/div/a[2]")
	WebElement deleteCategory;
	
	@FindBy(xpath="(//button[@class='primary-btn fix-gr-bg'])[1]")
	WebElement confirmDeleteCategory;
	
	//student group
	
	@FindBy(xpath="//*[@id=\"subMenuStudent\"]/li[8]/a")
	WebElement studentGroup;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[1]/div/div/input[1]")
	WebElement createGroup;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[2]/div/button")
	WebElement submitGroup;
	
	@FindBy(xpath="//*[@id=\"table_id\"]/tbody/tr/td[3]/div/button")
	WebElement selectGroup;
	
	@FindBy(xpath="//*[@id=\"table_id\"]/tbody/tr/td[3]/div/div/a[1]")
	WebElement editGroup;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div[2]/div[1]/div/div/form/div/div/div[2]/div/button")
	WebElement updateGroup;
	
	@FindBy(xpath="//*[@id=\"table_id\"]/tbody/tr/td[3]/div/div/a[2]")
	WebElement deleteGroup;
	
	@FindBy(xpath="//body/div[2]/div[1]/section[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[2]/div[2]/a[1]/button[1]")
	WebElement confirmDeleteGroup;
	
	
	//Add Student 
	
	@FindBy(xpath="//*[@id=\"subMenuStudent\"]/li[2]/a")
	WebElement addStudent;
	
	@FindBy(xpath="//*[@id=\"student_form\"]/div/div/div/div/div[2]/div[1]/div/div")
	WebElement academic;
	
	@FindBy(xpath="//li[contains(text(),'2022[Jan-Dec]')]")
	WebElement academicyear;
	
	@FindBy(xpath="//*[@id=\"class-div\"]/div[1]")
	WebElement selectClassForAdd;
	
	@FindBy(xpath="//*[@id=\"class-div\"]/div[1]/ul/li[2]")
	WebElement classSelectionForAdd;
	
	@FindBy(xpath="//*[@id=\"sectionStudentDiv\"]/div[1]")
	WebElement sectionForAdd;
	
	@FindBy(xpath="//*[@id=\"sectionStudentDiv\"]/div[1]/ul/li[3]")
	WebElement sectionSelectForAdd;
	
	
	@FindBy(xpath="//*[@id=\"student_form\"]/div/div/div/div/div[3]/div[1]/div/input")
	WebElement firstname;
	
	@FindBy(xpath="//*[@id=\"student_form\"]/div/div/div/div/div[3]/div[2]/div/input")
	WebElement lastname;
	
	@FindBy(xpath="//*[@id=\"student_form\"]/div/div/div/div/div[3]/div[3]/div/div")
	WebElement gender;
	
	@FindBy(xpath="//*[@id=\"student_form\"]/div/div/div/div/div[3]/div[3]/div/div/ul/li[2]")
	WebElement genderSelect;
	
	@FindBy(xpath="//*[@id=\"startDate\"]")
	WebElement dateClick;
	
	
	@FindBy(xpath="/html/body/div[5]/div[1]/table/thead/tr[1]/th[2]")
	WebElement monthYear;
	
	@FindBy(xpath="/html/body/div[5]/div[1]/table/thead/tr[1]/th[3]")
	WebElement rightArrow;
	
	
	
	@FindBy(xpath="/html/body/div[5]/div[1]/table/thead/tr[1]/th[1]")
	WebElement leftArrow;
	
	@FindBy(xpath="/html/body/div[5]/div[1]/table/tbody/tr[4]/td[5]")
	WebElement date;
	
	@FindBy(xpath="//*[@id=\"email_address\"]")
	WebElement email;
	
	@FindBy(xpath="//*[@id=\"guardians_email\"]")
	WebElement guardianEmail;
	
	@FindBy(xpath="//*[@id=\"_submit_btn_admission\"]")
	WebElement submitStudent;
	
	
	//student list
	
	@FindBy(xpath="//*[@id=\"subMenuStudent\"]/li[3]/a")
	WebElement studentList;
	
	@FindBy(xpath="//*[@id=\"table_id_filter\"]/label/input")
	WebElement quickSearch;
	
	
	@FindBy(xpath="//*[@id=\"table_id\"]/tbody/tr[1]/td[2]/a")
	WebElement clickStudent;
	
	@FindBy(xpath="(//a[contains(text(),'Fees')])[13]")
	WebElement fees; 
	
	@FindBy(xpath="(//a[contains(text(),'Leave')])[5]")
	WebElement leaveList;  //a[contains(text(),'Class Report')]
	
	
	@FindBy(xpath="(//a[contains(text(),'Exam')])[9]")
	WebElement examList;
	
	@FindBy(xpath="//a[contains(text(),'Document')]")
	WebElement documentList;
	
	@FindBy(xpath="//*[@id=\"studentDocuments\"]/div/div[1]/button")
	WebElement uploadDocument;
	
	@FindBy(xpath="//*[@id=\"title\"]")
	WebElement title;
	
	@FindBy(xpath="//*[@id=\"add_document_madal\"]/div/div/div[2]/div/form/div/div[2]/div/div[2]/button/label")
	WebElement browse;
	
	
	@FindBy(xpath="//*[@id=\"add_document_madal\"]/div/div/div[2]/div/form/div/div[3]/div/button[2]")
	WebElement saveDoc;
	
	
	@FindBy(xpath="//a[contains(text(),'Student Record')]")
	WebElement studentRecord;  
	
	
	@FindBy(xpath="//*[@id=\"studentRecord\"]/div/div[1]/button/span")
	WebElement addstudentRecord;
	
	
	@FindBy(xpath="//*[@id=\"assignClass\"]/div/div/div[2]/div/form/div[1]/div/div/div")
	WebElement selectYear;
	
	
	@FindBy(xpath="//*[@id=\"assignClass\"]/div/div/div[2]/div/form/div[1]/div/div/div/ul/li[2]")
	WebElement year;
	
	
	
	@FindBy(xpath="//*[@id=\"class-div\"]/div[1]")
	WebElement selectClass;
	
	@FindBy(xpath="//*[@id=\"class-div\"]/div[1]/ul/li[2]")
	WebElement classSelection;
	
	
	@FindBy(xpath="//*[@id=\"sectionStudentDiv\"]/div[1]")
	WebElement section;
	
	
	@FindBy(xpath="//*[@id=\"sectionStudentDiv\"]/div[1]/ul/li[2]")
	WebElement sectionSelect;
	

	
	@FindBy(xpath="//*[@id=\"save_button_query\"]")
	WebElement submit;
	

	@FindBy(xpath="//a[contains(text(),'Timeline')]")
	WebElement timeline;
	
	@FindBy(xpath="//body[1]/div[2]/div[1]/section[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[9]/div[1]/button[1]")
	WebElement selectStudentFromList;
	
	@FindBy(xpath="//*[@id=\"table_id\"]/tbody/tr[1]/td[9]/div/div/a[3]")
	WebElement editStudentFromList;
	
	@FindBy(xpath="//*[@id=\"student_form\"]/div/div/div/div/div[22]/div/button")
	WebElement doneStudentFromList;
	
	//@FindBy(xpath="//*[@id=\"table_id\"]/tbody/tr[9]/td[9]/div/button")
	//WebElement selectLastStudent;
	
	@FindBy(xpath="//*[@id=\"table_id\"]/tbody/tr[1]/td[9]/div/div/a[4]")
	WebElement disableLastStudent;
	
	@FindBy(xpath="//*[@id=\"deleteStudentModal\"]/div/div/div[2]/div[2]/form/button")
	WebElement confirmDisableLastStudent;

	// student Attendance
	
	@FindBy(xpath="//body[1]/div[2]/nav[1]/ul[1]/li[4]/ul[1]/li[4]/a[1]")
	WebElement studentAttendance;
	
	@FindBy(xpath="//body[1]/div[2]/div[1]/section[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]")
	WebElement selectClassForAttendance;
	
	@FindBy(xpath="//body[1]/div[2]/div[1]/section[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/ul[1]/li[2]")
	WebElement classSelectionForAttendance;
	
	
	@FindBy(xpath="//body[1]/div[2]/div[1]/section[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]")
	WebElement sectionForAttendance;
	
	@FindBy(xpath="//body[1]/div[2]/div[1]/section[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/ul[1]/li[3]")
	WebElement sectionSelectForAttendance;
	
	
	@FindBy(xpath="//body[1]/div[2]/div[1]/section[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[4]/button[1]")
	WebElement searchAttendance;
	
	
	@FindBy(xpath="(//button[@class='primary-btn mr-40 fix-gr-bg nowrap submit'])[1]")
	WebElement saveAttendance;
	
	//Student Attendance Report
	
	@FindBy(xpath="//*[@id=\"subMenuStudent\"]/li[5]/a")
	WebElement studentAttendanceReport;
	

	@FindBy(xpath="//*[@id=\"search_student\"]/div/div[1]/div")
	WebElement selectClassForReport;
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div/div[1]/div/ul/li[2]")
	WebElement classSelectionForReport;
	
	
	@FindBy(xpath="//*[@id=\"select_section_div\"]/div[1]")
	WebElement sectionForReport;
	
	
	@FindBy(xpath="//*[@id=\"select_section_div\"]/div[1]/ul/li[3]")
	WebElement sectionSelectionForReport;
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div/div[5]/button")
	WebElement searchForReport;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[3]/div/div[1]/div/a/i")
	WebElement printForReport;
	
	// subject Wise Attendance
	
	@FindBy(xpath="//*[@id=\"subMenuStudent\"]/li[6]/a")
	WebElement subjectwiseAttendance;
	
	
	@FindBy(xpath="//*[@id=\"search_studentA\"]/div/div[1]/div")
	WebElement selectClassForSubject;
	
	@FindBy(xpath="//*[@id=\"search_studentA\"]/div/div[1]/div/ul/li[2]")
	WebElement classSelectionForSubject;
	
	
	@FindBy(xpath="//*[@id=\"select_section_div\"]/div[1]")
	WebElement sectionForSubject;
	
	
	@FindBy(xpath="//*[@id=\"select_section_div\"]/div[1]/ul/li[3]")
	WebElement sectionSelectionForSubject;
	
	
	@FindBy(xpath="//*[@id=\"select_subject_div\"]/div[1]")
	WebElement subjectForSubject;
	
	
	@FindBy(xpath="//*[@id=\"select_subject_div\"]/div[1]/ul/li[2]")
	WebElement subjectSelectForSubject;
	
	@FindBy(xpath="//*[@id=\"search_studentA\"]/div/div[5]/button")
	WebElement searchForSubjectAttendance;
	
	@FindBy(xpath="//button[@class='primary-btn mr-40 fix-gr-bg nowrap submit'][1]")
	WebElement submitForSubject;
	
	// subject attendance report
	
	@FindBy(xpath="//*[@id=\"subMenuStudent\"]/li[7]/a")
	WebElement subjectAttendanceReport;
	
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div/div[1]/div")
	WebElement selectClassReport;
	
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div/div[1]/div/ul/li[2]")
	WebElement classSelectReport;
	
	
	@FindBy(xpath="//*[@id=\"select_section_div\"]/div[1]")
	WebElement sectionReport;
	
	@FindBy(xpath="//*[@id=\"select_section_div\"]/div[1]/ul/li[3]")
	WebElement sectionSelectionReport;
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div/div[5]/button")
	WebElement searchReport;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[3]/div/div[1]/div[2]/a")
	WebElement printReport;
	
	// student promote
	
	@FindBy(xpath="//*[@id=\"subMenuStudent\"]/li[9]/a")
	WebElement studentPromote;
	
	@FindBy(xpath="//*[@id=\"search_promoteA\"]/div/div[1]/div/span")
	WebElement currentYear;
	
	@FindBy(xpath="//*[@id=\"search_promoteA\"]/div/div[1]/div/ul/li[2]")
	WebElement selectCurrentYear;
	
	@FindBy(xpath="//*[@id=\"search_promoteA\"]/div/div[2]/div/span")
	WebElement promoteYear;
	
	
	@FindBy(xpath="//*[@id=\"search_promoteA\"]/div/div[2]/div/ul/li[3]")
	WebElement selectPromoteYear;
	
	@FindBy(xpath="//*[@id=\"search_promoteA\"]/div/div[3]/div[1]/span")
	WebElement selectCurrentClass;
	
	@FindBy(xpath="//*[@id=\"search_promoteA\"]/div/div[3]/div[1]/ul/li[2]")
	WebElement currentClassSelection;
	
	@FindBy(xpath="//*[@id=\"sectionStudentDiv\"]/div[1]")
	WebElement currentSection;
	
	@FindBy(xpath="//*[@id=\"sectionStudentDiv\"]/div[1]/ul/li[3]")
	WebElement currentSectionSelection;
	
	
	@FindBy(xpath="//*[@id=\"search_promote\"]")
	WebElement searchForPromote;  //*[@id="search_promote"]  //*[@id="search_promote"]
	
	@FindBy(xpath="//*[@id=\"student_promote_submit\"]/div[1]/div/table/tbody/tr[3]/td[1]/label")
	WebElement checkbox;
	
	@FindBy(xpath="//*[@id=\"student_promote_submit\"]/div[1]/div/table/tbody/tr[3]/td[4]/div/div/div/span")
	WebElement promoteClass;
	
	@FindBy(xpath="//*[@id=\"student_promote_submit\"]/div[1]/div/table/tbody/tr[3]/td[4]/div/div/div/ul/li[3]")
	WebElement selectPromoteClass;
	
	
	
	
	@FindBy(xpath="//*[@id=\"promote_section_div2\"]/div[1]/span")
	WebElement promoteSection;
	
	
	@FindBy(xpath="//*[@id=\"promote_section_div2\"]/div[1]/ul/li[3]")
	WebElement selectPromotSection;
	
	@FindBy(xpath="//*[@id=\"search_promoteA\"]/div/div[5]/div/span")
	WebElement selectExamForPromotion;
	
	
	@FindBy(xpath="//*[@id=\"search_promoteA\"]/div/div[5]/div/ul/li[3]")
	WebElement examSelectionForPromotion;
	
	
	
	@FindBy(xpath="//*[@id=\"student_promote_submit\"]/div[1]/div/table/tbody/tr[3]/td[6]/div/div/div/input")
	WebElement rollNumber;
	
	@FindBy(xpath="//body[1]/div[2]/div[1]/section[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/button[1]")
	WebElement promote;
	
	// disabled student
	
	@FindBy(xpath="//*[@id=\"subMenuStudent\"]/li[10]/a")
	WebElement disabledStudent;
	
	@FindBy(xpath="//*[@id=\"table_id_filter\"]/label/input")
	WebElement disableSearch;
	
	@FindBy(xpath="//*[@id=\"table_id\"]/tbody/tr/td[10]/div/button")
	WebElement selectStudent;
	
	
	@FindBy(xpath="//*[@id=\"table_id\"]/tbody/tr/td[10]/div/div/a[1]")
	WebElement viewStudent;
	
	
	@FindBy(xpath="//*[@id=\"table_id\"]/tbody/tr/td[10]/div/div/a[3]")
	WebElement enableStudent;
	
	@FindBy(xpath="//*[@id=\"enableStudentModal\"]/div/div/div[2]/div[2]/form/button")
	WebElement confirmStudent;
	
	//student export
	@FindBy(xpath="//*[@id=\"subMenuStudent\"]/li[11]/a")
	WebElement studentExport;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div/div/div/div[2]/div/div/div/div/a[1]")
	WebElement exportToCsv;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div/div/div/div[2]/div/div/div/div/a[2]")
	WebElement exportToPdf;
	
	// sms sending time
	
	@FindBy(xpath="//*[@id=\"subMenuStudent\"]/li[12]/a")
	WebElement sendingSmsTime;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div[3]/div[1]/div/div/form/div/div/div[1]/div[1]/div/input")
	WebElement startTime;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div[3]/div[1]/div/div/form/div/div/div[3]/div/div")
	WebElement status;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div[3]/div[1]/div/div/form/div/div/div[3]/div/div/ul/li[2]")
	WebElement selectStatus;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div[3]/div[1]/div/div/form/div/div/div[4]/div/button")
	WebElement submitButton;
	
	
	//student settings
	
	@FindBy(xpath="//*[@id=\"subMenuStudent\"]/li[13]/a")
	WebElement settings;
	
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div/div/div/div/div[2]/div/div/div[1]/table/tbody/tr[4]/td[4]/label/span")
	WebElement roll;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div/div/div/div/div[2]/div/div/div[2]/table/tbody/tr[1]/td[2]/label/span")
	WebElement phone;
	
	
	String firstName, lastName;
	
	public POM_Student_Info(WebDriver driver) {
		d= driver;
		PageFactory.initElements(d, this);
		
		firstName=this.name();
		lastName= this.name();
	}
	
	public void studentCategory() throws InterruptedException {
		
		studentInfo.click();
		Thread.sleep(1000);
		
		createCategory();
		
		categoryActions();
		
	}
	
	public void studentGroup() throws InterruptedException {
		
		//studentInfo.click();
		//Thread.sleep(1000);
		
		studentGroup.click();
		Thread.sleep(1000);
		
		createGroup.sendKeys("Group 1");
		Thread.sleep(1000);
		
		submitGroup.click();
		Thread.sleep(1000);
		
		
		selectGroup.click();
		Thread.sleep(1000);
		
		editGroup.click();
		Thread.sleep(1000);
		
		updateGroup.click();
		Thread.sleep(1000);
		
		selectGroup.click();
		Thread.sleep(1000);
		
		deleteGroup.click();
		Thread.sleep(1000);
		
		d.getWindowHandle();
		
		confirmDeleteGroup.click();
		Thread.sleep(1000);
		
		
	}
	
	public void addStudent() throws InterruptedException {
		
		//studentInfo.click();
		//Thread.sleep(1000);
		
		addStudent.click();
		Thread.sleep(1000);
		
		
		academic.click();
		Thread.sleep(1000);
		academicyear.click();
		
		selectClassForAdd.click();
		Thread.sleep(1000);
		classSelectionForAdd.click();
		
		sectionForAdd.click();
		Thread.sleep(1000);
		sectionSelectForAdd.click();
		
		inputFields();
		Thread.sleep(1000);
		
		submitStudent.click();
		Thread.sleep(1000);
	}
	
	public void studentList() throws InterruptedException, AWTException {
		
		//studentInfo.click();
		//Thread.sleep(1000);
		
		studentList.click();
		Thread.sleep(1000);
		
		
		
		quickSearch.sendKeys(this.firstName);
		Thread.sleep(3000);
		
	
		
		actions();
		Thread.sleep(1000); 
		

		
	}
	
	public void studentAttendance() throws InterruptedException {
		
		
		
		studentAttendance.click();
		Thread.sleep(1000);
		
		selectClassForAttendance.click();
		Thread.sleep(1000);
		classSelectionForAttendance.click();
		
		sectionForAttendance.click();
		Thread.sleep(1000);
		sectionSelectForAttendance.click();
		
		searchAttendance.click();
		Thread.sleep(1000);
		
		cm.scroll();
		Thread.sleep(1000);
		
		saveAttendance.click();
		Thread.sleep(1000);

		
	}
	
	public void studentAttendanceReport() throws InterruptedException {
		
		
		
		studentAttendanceReport.click();
		Thread.sleep(1000);
		
		selectClassForReport.click();
		Thread.sleep(1000);
		classSelectionForReport.click();
		
		sectionForReport.click();
		Thread.sleep(1000);
		sectionSelectionForReport.click();
		
		searchForReport.click();
		Thread.sleep(1000);
		
		cm.scroll();
		Thread.sleep(1000);
		
		//printForReport.click();
		//Thread.sleep(1000);
		/*
		 * ArrayList<String> tabs2 = new ArrayList<String>(d.getWindowHandles());
		 * d.switchTo().window(tabs2.get(1)); Thread.sleep(1000);
		 */
	
		
	}
	
	public void subjectWiseAttendance() throws InterruptedException {
		
		studentInfo.click();
		Thread.sleep(1000);
		
		subjectwiseAttendance.click();
		Thread.sleep(1000);
		
		subjectAttendanceSearch();
		
		cm.scroll();
		Thread.sleep(1000);
		
		
		subjectAttendanceCreate();
		
		
		
		
	}
	
	public void subjectAttendanceReport() throws InterruptedException {
		
		
		
		
		subjectAttendanceReport.click();
		Thread.sleep(1000);
		
		selectClassReport.click();
		Thread.sleep(1000);
		classSelectReport.click();
		
		sectionReport.click();
		Thread.sleep(1000);
		sectionSelectionReport.click();
		
		
		searchReport.click();
		Thread.sleep(1000);
		
		/*
		printReport.click();
		Thread.sleep(1000);
		
		ArrayList<String> tabs2 = new ArrayList<String>(d.getWindowHandles());
		d.switchTo().window(tabs2.get(1));
		Thread.sleep(1000);
		
		d.close();
		Thread.sleep(1000);
		*/
		
	}
	
	public void studentPromote() throws InterruptedException {
		
		
		
		
		
		studentPromote.click();
		Thread.sleep(1000);
		
		
		int size = d.findElements(By.xpath("//body/div[2]/div/section[2]/div/div[2]/div/div/form/div/div")).size();
		
		System.out.println(size);
		
		if(size == 5) {
			
			System.out.println("IF Again");
			
			currentYear.click();
			Thread.sleep(1000);
			selectCurrentYear.click();
			
			
			promoteYear.click();
			Thread.sleep(1000);
			selectPromoteYear.click();
			
			
			selectCurrentClass.click();
			Thread.sleep(1000);
			currentClassSelection.click();
			
			
			currentSection.click();
			Thread.sleep(1000);
			currentSectionSelection.click();
			
			searchForPromote.click();
			Thread.sleep(1000);
			
			
			checkbox.click();
			Thread.sleep(1000);
			
			
			promoteClass.click();
			Thread.sleep(1000);
			selectPromoteClass.click();
			
			
			promoteSection.click();
			Thread.sleep(1000);
			selectPromotSection.click();
			
			rollNumber.sendKeys("1");
			Thread.sleep(1000);
			
			promote.click();
			Thread.sleep(1000);
			
			
		}
		
		else {
			
			System.out.println("Else Again" );
			
			
			currentYear.click();
			Thread.sleep(1000);
			selectCurrentYear.click();
			
			
			promoteYear.click();
			Thread.sleep(1000);
			selectPromoteYear.click();
			
			
			selectCurrentClass.click();
			Thread.sleep(1000);
			currentClassSelection.click();
			
			
			currentSection.click();
			Thread.sleep(1000);
			currentSectionSelection.click();
			
			selectExamForPromotion.click();
			Thread.sleep(1000);
			
			examSelectionForPromotion.click();
			Thread.sleep(1000);
			
			
			searchForPromote.click();
			Thread.sleep(1000);
			
			
			
			
			String currenturl=d.getCurrentUrl();
			
			String Url="http://pos.rishfa.com/student-current-search?current_session=1&promote_session=16&current_class=8&current_section=2";
			
			
			if(currenturl.matches(Url)) {
				
				checkbox.click();
				Thread.sleep(1000);
				
				
				promoteClass.click();
				Thread.sleep(1000);
				selectPromoteClass.click();
				
				
				promoteSection.click();
				Thread.sleep(1000);
				selectPromotSection.click();
				
				rollNumber.sendKeys("1");
				Thread.sleep(1000);
				
				promote.click();
				Thread.sleep(1000);
			}
			
			else {
				
				d.navigate().to(currenturl);
				Thread.sleep(1000);
			}

		}
		

		
	}
	
	public void disabledStudent() throws InterruptedException {
		
		studentInfo.click();
		Thread.sleep(1000);
		
		disabledStudent.click();
		Thread.sleep(1000);
		
		disableSearch.sendKeys(this.firstName);
		Thread.sleep(4000);
		
		selectStudent.click();
		Thread.sleep(1000);
		
		viewStudent.click();
		Thread.sleep(1000);
		
		d.navigate().back();
		Thread.sleep(1000);
		
		disableSearch.clear();
		Thread.sleep(1000);
		
		disableSearch.sendKeys(this.firstName);
		Thread.sleep(4000);
		
		selectStudent.click();
		Thread.sleep(1000);
		
		enableStudent.click();
		Thread.sleep(1000);
		
		d.getWindowHandle();
		Thread.sleep(1000);
		
		confirmStudent.click();
	}
	
	public void studentExport() throws InterruptedException{
		
		
		
		studentExport.click();
		Thread.sleep(1000);
		
		exportToCsv.click();
		Thread.sleep(1000);
		
		//exportToPdf.click();
		//Thread.sleep(1000);
		
	
		
	}
	
	public void smsSendingTime() throws InterruptedException {
		
		
		
		sendingSmsTime.click();
		Thread.sleep(1000);
		
		selectTime();
		Thread.sleep(1000);
		
		status.click();
		Thread.sleep(1000);
		
		selectStatus.click();
		Thread.sleep(1000);
		
		submitButton.click();
		Thread.sleep(1000);
	}
	
	public void studentSettings() throws InterruptedException {
		
		
		
		settings.click();
		Thread.sleep(1000);
		
		roll.click();
		Thread.sleep(1000);
		
		phone.click();
		Thread.sleep(1000);
	}

	
	
	
	public void createCategory() throws InterruptedException {
		studentCategory.click();
		Thread.sleep(1000);
		
		categoryType.sendKeys("Category 1");
		Thread.sleep(1000);
		
		submitCategory.click();
		Thread.sleep(1000);
		
	}
	
	public void categoryActions() throws InterruptedException {
		selectCategory.click();
		Thread.sleep(1000);
		
		editCategory.click();
		Thread.sleep(1000);
		
		updateCategory.click();
		Thread.sleep(1000);
		
//		selectCategory.click();
//		Thread.sleep(1000);
//		
//		deleteCategory.click();
//		Thread.sleep(1000);
//		
//		d.getWindowHandle();
//		
//		confirmDeleteCategory.click();
//		Thread.sleep(1000);
		
	}
	
	public void inputFields() throws InterruptedException {
		
		nameGenerator();
		Thread.sleep(1000);
		
		gender.click();
		genderSelect.click();
		Thread.sleep(1000);
		
		selectDate("MARCH 2015");
		Thread.sleep(1000);
		
		emailGenerator();
		
		cm.scroll();
		
		
	}
	
	public String selectDate(String month) {
		
		dateClick.click();
		while(true) {
			String text = monthYear.getText();   //locator is month and year
								
			if(text.equals(month))
			{
			 break;
			}
			else 
			{
								
				leftArrow.click();         //locator of site arrow.you have to change it
			}
		}
		
		
		
		date.click();
		return month;
		
	}
	public void emailGenerator() throws InterruptedException {
		
		int randomEmail= rm.nextInt(1000);
		email.sendKeys("username"+randomEmail+"@gmail.com"); 
		Thread.sleep(1000);
		
		int randomEmail2= rm.nextInt(1000);
		guardianEmail.sendKeys("username"+randomEmail2+"@gmail.com");
		Thread.sleep(1000);
	}
	
	public void nameGenerator() throws InterruptedException {
		//String firstName = RandomStringUtils.randomAlphabetic(8); 
		firstname.sendKeys(this.firstName);
		Thread.sleep(1000);
		
		//String lastName = RandomStringUtils.randomAlphabetic(8); 
		lastname.sendKeys(this.lastName);
		Thread.sleep(1000);
		
	}
	
	
	
	public void actions() throws InterruptedException, AWTException {
		
		
		clickStudent.click();
		Thread.sleep(1000);
		
		ArrayList<String> tabs2 = new ArrayList<String>(d.getWindowHandles());
		d.switchTo().window(tabs2.get(1));
		
		int size= d.findElements(By.xpath("//body/div[2]/div[1]/section[2]/div[1]/div[1]/div[2]/ul[1]/li/a[1]")).size();
		System.out.println(size);
		
		if(size==8) {
			
			fees.click();
			Thread.sleep(1000);
			
			leaveList.click();
			Thread.sleep(1000);
			
			examList.click();
			Thread.sleep(1000);
			
			documentList.click();
			Thread.sleep(1000);
			
			upDoc();
			
			addRecord();
			Thread.sleep(1000);
			
			timeline.click();
			
		}
		
		else {
			
			leaveList.click();
			Thread.sleep(1000);
			
			examList.click();
			Thread.sleep(1000);
			
			documentList.click();
			Thread.sleep(1000);
			
			upDoc();
			
			addRecord();
			Thread.sleep(1000);
			
			timeline.click();
			Thread.sleep(1000);
		}
		
		
		
		d.close();
		Thread.sleep(1000);
		
		ArrayList<String> tabs1 = new ArrayList<String>(d.getWindowHandles());
		d.switchTo().window(tabs1.get(0)); 
		
		
		selectStudentFromList.click();
		Thread.sleep(1000);
		
		editStudentFromList.click();
		Thread.sleep(1000);
		
		doneStudentFromList.click();
		Thread.sleep(1000);
		
		quickSearch.clear();
		Thread.sleep(1000);
		
		quickSearch.sendKeys(this.firstName);
		Thread.sleep(3000);
		
		selectStudentFromList.click();
		Thread.sleep(1000);
		
		disableLastStudent.click();
		Thread.sleep(1000);
		
		d.getWindowHandle();
		
		confirmDisableLastStudent.click();
		Thread.sleep(1000);
		
	}
	public void upDoc() throws AWTException, InterruptedException {
		
		uploadDocument.click();
		Thread.sleep(1000);
		
		d.getWindowHandle();
		
		title.sendKeys("My Document");
		browse.click();
		String filePath=cm.getFilePath("Uploaded lesson file.txt");
		
		System.out.println(filePath);
		 
		cm.fileUpload(filePath);
		saveDoc.click();
		
	}
	
	public void addRecord() throws InterruptedException {
		
		
		int size= d.findElements(By.xpath("//body/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/form[1]/div")).size();
		 System.out.println(size);
		 
		 
		 if(size>5) {
			 
			 	studentRecord.click();
				Thread.sleep(1000);
				
				addstudentRecord.click();
				Thread.sleep(1000);
				d.getWindowHandle();
				
				selectYear.click();
				Thread.sleep(1000);
				year.click();
				
				selectClass.click();
				Thread.sleep(1000);
				classSelection.click();
				
				section.click();
				Thread.sleep(1000);
				sectionSelect.click();
				

				d.findElement(By.xpath("//*[@id=\"roll_number\"]")).sendKeys("10");
				Thread.sleep(1000);
				
				
				submit.click();	
				Thread.sleep(1000);
			 
		 }
		 
		 else {
			 
			 	studentRecord.click();
				Thread.sleep(1000);
				
				addstudentRecord.click();
				Thread.sleep(1000);
				d.getWindowHandle();
				
				selectYear.click();
				Thread.sleep(1000);
				year.click();
				
				selectClass.click();
				Thread.sleep(1000);
				classSelection.click();
				
				section.click();
				Thread.sleep(1000);
				sectionSelect.click();
				
				submit.click();	
		 }
		
		
		
	}
	
	public String name() {
		
		
		return RandomStringUtils.randomAlphabetic(8); 
	}
	
	public void selectTime() throws InterruptedException {
		startTime.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		startTime.sendKeys(Keys.DELETE);
		Thread.sleep(1000);
		startTime.sendKeys("6:45 PM");
		startTime.sendKeys(Keys.ENTER);
			
    }
	
	public void subjectAttendanceSearch() throws InterruptedException {
		
		
		selectClassForSubject.click();
		Thread.sleep(1000);
		classSelectionForSubject.click();
		
		
		sectionForSubject.click();
		Thread.sleep(1000);
		sectionSelectionForSubject.click();
		
		
		subjectForSubject.click();
		Thread.sleep(1000);
		subjectSelectForSubject.click();
		
		
		searchForSubjectAttendance.click();
		Thread.sleep(1000);
		
		
	}
	
	public void subjectAttendanceCreate() throws InterruptedException {
		
		
		int size = d.findElements(By.xpath("//body/div[2]/div/section[2]/div/div[3]/div/form/div/div/table/tbody/tr/td[3]")).size();
		int i=1;
		
		while(i<=(size-1)) {
			
			
			WebElement absent=d.findElement(By.xpath("//body/div[2]/div/section[2]/div/div[3]/div/form/div/div/table/tbody/tr["+i+"]/td[5]/div/div[2]/input"));
			
			if(absent.isSelected()) {
				
				WebElement present=d.findElement(By.xpath("//body/div[2]/div/section[2]/div/div[3]/div/form/div/div/table/tbody/tr["+i+"]/td[5]/div/div[1]/label"));
				
				present.click();
			}
			
			else {

				WebElement radio=d.findElement(By.xpath("//body/div[2]/div/section[2]/div/div[3]/div/form/div/div/table/tbody/tr["+i+"]/td[5]/div/div[2]/label"));
				
				radio.click();
			}
			
			
			
			i++;
		}
		
		submitForSubject.click();
		Thread.sleep(1000);
	}
	
	
	

	
	  
}
