package PageObject;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Common_Method.CommonMethod;

public class POM_Reports {
	
	WebDriver d;
	
	CommonMethod cm= new CommonMethod();
	
	
	
	@FindBy(xpath="//div[contains(text(),'Reports')]")
	WebElement reports;    //*[@id=\"sidebar_menu\"]/li[24]/a/div[2]
	
	
	//student report
	
	@FindBy(xpath="//*[@id=\"subMenusystemReports\"]/li[1]/a")
	WebElement studentReport;
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div/div[1]/div")
	WebElement selectClassForStudentReport;
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div/div[1]/div/ul/li[2]")
	WebElement classSelectionForStudentReport;
	
	@FindBy(xpath="//*[@id=\"select_section_div\"]/div[1]")
	WebElement sectionForStudentReport;
	
	@FindBy(xpath="//*[@id=\"select_section_div\"]/div[1]/ul/li[3]")
	WebElement sectionSelectionForStudentReport;
	
//	@FindBy(xpath="//*[@id=\"search_student\"]/div/div[3]/div")
//	WebElement typeForStudentReport;
//	
//	@FindBy(xpath="//*[@id=\"search_student\"]/div/div[3]/div/ul/li[2]")
//	WebElement typeSelectionForStudentReport;
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div/div[4]/div")
	WebElement genderForStudentReport;
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div/div[4]/div/ul/li[2]")
	WebElement genderSelectionForStudentReport;
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div/div[5]/button")
	WebElement buttonForStudentReport;
	
	
	//guardian report
	
	@FindBy(xpath="//*[@id=\"subMenusystemReports\"]/li[2]/a")
	WebElement guardianReport;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/form/div/div/div/div/div[1]/div/span")
	WebElement selectClassForGuardianReport;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/form/div/div/div/div/div[1]/div/ul/li[2]")
	WebElement classSelectionForGuardianReport;
	
	@FindBy(xpath="//*[@id=\"select_section_div\"]/div[1]/span")
	WebElement sectionForGuardianReport;
	

	@FindBy(xpath="//*[@id=\"select_section_div\"]/div[1]/ul/li[3]")
	WebElement sectionSelectionForGuardianReport;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/form/div/div/div/div/div[3]/button")
	WebElement searchForGuardianReport;
	
	//student history
	
	@FindBy(xpath="//*[@id=\"subMenusystemReports\"]/li[3]/a")
	WebElement studentHistory;
	
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div[1]/div[1]/div")
	WebElement selectClassForStudentHistory;
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div[1]/div[1]/div/ul/li[2]")
	WebElement classSelectionForStudentHisotry;
	
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div[1]/div[2]/div")
	WebElement sectionForStudentHistory;
	
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div[1]/div[2]/div/ul/li[2]")
	WebElement sectionSelectionForStudentHistory;
	
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div[2]/button")
	WebElement searchForStudentHistory;
	
	//student login Report
	
	@FindBy(xpath="//*[@id=\"subMenusystemReports\"]/li[4]/a")
	WebElement studentLoginReport;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/form/div/div/div/div/div[1]/div")
	WebElement selectClassForLoginReport;
	
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/form/div/div/div/div/div[1]/div/ul/li[2]")
	WebElement classSelectionForLoginReport;
	
	@FindBy(xpath="//*[@id=\"select_section_div\"]/div[1]/span")
	WebElement sectionForLoginReport;
	
	@FindBy(xpath="//*[@id=\"select_section_div\"]/div[1]/ul/li[3]")
	WebElement sectionSelectionForLoginReport;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/form/div/div/div/div/div[3]/button")
	WebElement searchForLoginReport;
	
	// fees statement
	
	@FindBy(xpath="(//a[contains(text(),'Fees Statement')])[1]")  
	WebElement feesStatement;
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div/div[1]/div")
	WebElement selectClassForStatement;
	
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div/div[1]/div/ul/li[2]")
	WebElement classSelectionForStatement;
	
	@FindBy(xpath="//*[@id=\"select_section_div\"]/div[1]/span")
	WebElement sectionForStatement;
	
	@FindBy(xpath="//*[@id=\"select_section_div\"]/div[1]/ul/li[3]")
	WebElement sectionSelectionForStatement;
	
	@FindBy(xpath="//*[@id=\"select_student_div\"]/div[1]/span")
	WebElement selectStudentForStatement;
	
	@FindBy(xpath="//*[@id=\"select_student_div\"]/div[1]/ul/li[2]")
	WebElement studentSelectionForStatement;
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div/div[4]/button/span")
	WebElement searchForStatement;
	
	
	//balance fee report
	
	@FindBy(xpath="//a[contains(text(),'Balance Fees Report')]")
	WebElement balancefeeReport;
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div/div[1]/div")
	WebElement selectClassForBalance;
	
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div/div[1]/div/ul/li[2]")
	WebElement classSelectionForBalance;
	
	@FindBy(xpath="//*[@id=\"select_section_div\"]/div[1]/span")
	WebElement sectionForBalance;
	
	@FindBy(xpath="//*[@id=\"select_section_div\"]/div[1]/ul/li[3]")
	WebElement sectionSelectionForBalance;
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div/div[3]/button")
	WebElement searchForBalance;
	
	
	
	//class report
	@FindBy(xpath="//a[contains(text(),'Class Report')]")  
	WebElement classReport;
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div/div[1]/div")
	WebElement selectClassForClassReport;
	
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div/div[1]/div/ul/li[2]")
	WebElement classSelectionForClassReport;
	
	@FindBy(xpath="//*[@id=\"select_section_div\"]/div[1]")
	WebElement sectionForClassReport;
	
	@FindBy(xpath="//*[@id=\"select_section_div\"]/div[1]/ul/li[3]")
	WebElement sectionSelectionForClassReport;
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div/div[3]/button")
	WebElement searchForClassReport;
	
	//class routine
	
	@FindBy(xpath="(//a[contains(text(),'Class Routine')])[3]")
	WebElement classRoutine;
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div/div[1]/div")
	WebElement selectClassForClassRoutine;
	
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div/div[1]/div/ul/li[2]")
	WebElement classSelectionForClassRoutine;
	
	@FindBy(xpath="//*[@id=\"select_section_div\"]/div[1]/span")
	WebElement sectionForClassRoutine;
	
	@FindBy(xpath="//*[@id=\"select_section_div\"]/div[1]/ul/li[3]")
	WebElement sectionSelectionForClassRoutine;
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div/div[3]/button")
	WebElement searchForClassRoutine;
	
	//exam routine report
	
	@FindBy(xpath="//a[contains(text(),'Exam Routine')]")
	WebElement examRoutine;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div[2]/div/div/form/div/div[1]/div")
	WebElement exam;
	
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div[2]/div/div/form/div/div[1]/div/ul/li[3]")
	WebElement selectExamForReport;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div[2]/div/div/form/div/div[2]/div")
	WebElement selectClassForReport;
	
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div[2]/div/div/form/div/div[2]/div/ul/li[2]")
	WebElement classSelectionForReport;
	
	
	@FindBy(xpath="//*[@id=\"select_section_div\"]/div[1]")
	WebElement sectionForReport;
	
	@FindBy(xpath="//*[@id=\"select_section_div\"]/div[1]/ul/li[3]")
	WebElement sectionSelectionForReport;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div[2]/div/div/form/div/div[4]/button/span")
	WebElement searchForReport;
	
	//merit list report
	
	@FindBy(xpath="//a[contains(text(),'Merit List Report')]")
	WebElement meritListReport;
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div/div[1]/div")
	WebElement examForMeritList;
	
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div/div[1]/div/ul/li[3]")
	WebElement selectExamForMeritList;
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div/div[2]/div")
	WebElement selectClassForMeritList;
	
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div/div[2]/div/ul/li[2]")
	WebElement classSelectionForMeritList;
	
	
	@FindBy(xpath="//*[@id=\"select_section_div\"]/div[1]/span")
	WebElement sectionForMeritList;
	
	@FindBy(xpath="//*[@id=\"select_section_div\"]/div[1]/ul/li[3]")
	WebElement sectionSelectionForMeritList;
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div/div[4]/button")
	WebElement searchForMeritList;
	
	//online exam report
	
	@FindBy(xpath="//a[contains(text(),'Online Exam Report')]")
	WebElement onlineExamReport;
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div/div[1]/div")
	WebElement onlineExam;
	
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div/div[1]/div/ul/li[2]")
	WebElement selectOnlineExam;
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div/div[2]/div")
	WebElement selectClassForOnlineExam;
	
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div/div[2]/div/ul/li[2]")
	WebElement classSelectionForOnlineExam;
	
	
	@FindBy(xpath="//*[@id=\"select_section_div\"]/div[1]/span")
	WebElement sectionForOnlineExam;
	
	@FindBy(xpath="//*[@id=\"select_section_div\"]/div[1]/ul/li[2]")
	WebElement sectionSelectionForOnlineExam;
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div/div[4]/button")
	WebElement searchForOnlineExam;
	
	//mark sheet Report
	
	@FindBy(xpath="//a[contains(text(),'Mark Sheet Report')]")
	WebElement markSheetReport;
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div/div[1]/div")
	WebElement selectExam;
	
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div/div[1]/div/ul/li[3]")
	WebElement selectExamForMarksheet;
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div/div[2]/div")
	WebElement selectClassForMarksheet;
	
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div/div[2]/div/ul/li[2]")
	WebElement classSelectionForMarksheet;
	
	
	@FindBy(xpath="//*[@id=\"select_section_div\"]/div[1]")
	WebElement sectionForMarksheet;
	
	@FindBy(xpath="//*[@id=\"select_section_div\"]/div[1]/ul/li[3]")
	WebElement sectionSelectionForMarksheet;
	
	@FindBy(xpath="//*[@id=\"select_student_div\"]/div[1]")
	WebElement studentForMarksheet;
	
	@FindBy(xpath="//*[@id=\"select_student_div\"]/div[1]/ul/li[3]")
	WebElement selectStudentForMarksheet;
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div/div[5]/button")
	WebElement searchForMarksheet;
	
	//tabulation sheet report
	
	@FindBy(xpath="//a[contains(text(),'Tabulation Sheet Report')]")
	WebElement tabulationSheetReport;
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div/div[1]/div")
	WebElement selectExamForTabulation;
	
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div/div[1]/div/ul/li[3]")
	WebElement examSelectionForTabulation;
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div/div[2]/div")
	WebElement selectClassForTabulation;
	
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div/div[2]/div/ul/li[2]")
	WebElement classSelectionForTabulation;
	
	
	@FindBy(xpath="//*[@id=\"select_section_div\"]/div[1]/span")
	WebElement sectionForTabulation;
	
	@FindBy(xpath="//*[@id=\"select_section_div\"]/div[1]/ul/li[3]")
	WebElement sectionSelectionForTabulation;
	
	@FindBy(xpath="//*[@id=\"select_student_div\"]/div[1]/span")
	WebElement studentForTabulation;
	
	@FindBy(xpath="//*[@id=\"select_student_div\"]/div[1]/ul/li[3]")
	WebElement selectStudentForTabulation;
	
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div/div[5]/button")
	WebElement searchForTabulation;
	
	
	//progress card report
	@FindBy(xpath="//a[contains(text(),'Progress Card Report')]")
	WebElement progress;
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div/div[1]/div")
	WebElement selectClassForProgress;
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div/div[1]/div/ul/li[2]")
	WebElement classSelectionForProgress;
	
	@FindBy(xpath="//*[@id=\"select_section_div\"]/div[1]")
	WebElement sectionForProgress;
	
	@FindBy(xpath="//*[@id=\"select_section_div\"]/div[1]/ul/li[3]")
	WebElement sectionSelectionForProgress;
	
	@FindBy(xpath="//*[@id=\"select_student_div\"]/div[1]")
	WebElement studentForProgress;
	
	@FindBy(xpath="//*[@id=\"select_student_div\"]/div[1]/ul/li[3]")
	WebElement selectStudentForProgress;
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div/div[4]/button")
	WebElement searchForProgress;
	
	@FindBy(xpath="//*[@id=\"search_student\"]/button/i")
	WebElement print;
	
	//user log
	
	@FindBy(xpath="//a[contains(text(),'User Log')]")
	WebElement userLog;
	
	// previous result
	
	@FindBy(xpath="//a[contains(text(),'Previous Result')]")
	WebElement previousResult;
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div/div[1]/div/input")
	WebElement adNumber;
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div/div[2]/button/span")
	WebElement search;
	
	
	//previous record
	
	
	@FindBy(xpath="//a[contains(text(),'Previous Record')]")
	WebElement previousRecord;
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div/div[1]/div")
	WebElement year;
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div/div[1]/div/ul/li[2]")
	WebElement selectYear;
	
	@FindBy(xpath="//*[@id=\"select_class_div\"]/div")
	WebElement selectClassForPreviousRecord;
	
	@FindBy(xpath="//*[@id=\"select_class_div\"]/div/ul/li[2]")
	WebElement classSelectionForPreviousRecord;
	
	@FindBy(xpath="//*[@id=\"select_section_div\"]/div[1]")
	WebElement sectionForPreviousRecord;
	
	@FindBy(xpath="//*[@id=\"select_section_div\"]/div[1]/ul/li[3]")
	WebElement sectionSelectionForPreviousRecord;
	
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div/div[4]/button")
	WebElement searchForRecord;
	
	
	
	
	
	
	
	
	
	
	
	
	
	public POM_Reports(WebDriver driver) {
		
		d= driver;
		PageFactory.initElements(d, this);
	}
	
	public void studentReport() throws InterruptedException {
		
		reports.click();
		Thread.sleep(1000);
		
		studentReport.click();
		Thread.sleep(1000);
		
		selectClassForStudentReport.click();
		Thread.sleep(1000);
		classSelectionForStudentReport.click();
		
		sectionForStudentReport.click();
		Thread.sleep(1000);
		sectionSelectionForStudentReport.click();
		
		
//		typeForStudentReport.click();
//		Thread.sleep(1000);
//		typeSelectionForStudentReport.click();
		
		genderForStudentReport.click();
		Thread.sleep(1000);
		genderSelectionForStudentReport.click();
		
		
		buttonForStudentReport.click();
		Thread.sleep(1000);
		
		cm.scroll();
		Thread.sleep(1000);
		
		System.out.println("Student Report Done");
	}
	
	public void guardianReport() throws InterruptedException {
		
//		reports.click();
//		Thread.sleep(1000);
		
		guardianReport.click();
		Thread.sleep(1000);
		
		selectClassForGuardianReport.click();
		Thread.sleep(1000);
		classSelectionForGuardianReport.click();
		
		sectionForGuardianReport.click();
		Thread.sleep(1000);
		sectionSelectionForGuardianReport.click();
		
		searchForGuardianReport.click();
		Thread.sleep(1000);
		
		cm.scroll();
		Thread.sleep(1000);
		
		System.out.println("Guardian Report Done");

		
		
	}
	
	public void studentHistory() throws InterruptedException {
		
		reports.click();
		Thread.sleep(1000);
		studentHistory.click();
		Thread.sleep(1000);
		
		selectClassForStudentHistory.click();
		Thread.sleep(1000);
		classSelectionForStudentHisotry.click();
		
		sectionForStudentHistory.click();
		Thread.sleep(1000);
		sectionSelectionForStudentHistory.click();
		
		searchForStudentHistory.click();
		Thread.sleep(1000);
		
		cm.scroll();
		Thread.sleep(1000);
		
		System.out.println("Student History Done");
		
		
	}
	
	public void studentLoginReport() throws InterruptedException {
		
		reports.click();
		Thread.sleep(1000);
		
		studentLoginReport.click();
		Thread.sleep(1000);
		
		
		selectClassForLoginReport.click();
		Thread.sleep(1000);
		classSelectionForLoginReport.click();
		 
		sectionForLoginReport.click();
		Thread.sleep(1000);
		sectionSelectionForLoginReport.click();
		
		searchForLoginReport.click();
		Thread.sleep(1000);
		
		cm.scroll();
		Thread.sleep(1000);
		 
		d.findElement(By.xpath("//*[@id=\"table_id_s\"]/tbody/tr[1]/td[5]/form/div/div[1]/div/input")).sendKeys("12345678");
		Thread.sleep(1000);
		
		d.findElement(By.xpath("//*[@id=\"table_id_s\"]/tbody/tr[1]/td[5]/form/div/div[2]/button")).click();
		Thread.sleep(1000);
		
		System.out.println("student login report Done");
	}

	public void feesStatement() throws InterruptedException {
		
			reports.click();  
			Thread.sleep(1000);
		
			
			feesStatement.click();
			Thread.sleep(1000);
			
			
			selectClassForStatement.click();
			Thread.sleep(1000);
			classSelectionForStatement.click();
			
			sectionForStatement.click();
			Thread.sleep(1000);
			sectionSelectionForStatement.click();
			
			
			selectStudentForStatement.click();
			Thread.sleep(1000);
			studentSelectionForStatement.click();
			
			searchForStatement.click();
			Thread.sleep(1000);
			
			cm.scroll();
			Thread.sleep(1000);
			
			 //balanceFeesReport();
			
		
			System.out.println("Fees statement Done");
	
			
		
		
		
	}
	
	public void balanceFeesReport() throws InterruptedException {
		
//		reports.click();
//		Thread.sleep(1000);
		
		balancefeeReport.click();
		Thread.sleep(1000);
		
		selectClassForBalance.click();
		Thread.sleep(1000);
		classSelectionForBalance.click();
		
		sectionForBalance.click();
		Thread.sleep(1000);
		sectionSelectionForBalance.click();
		
		searchForBalance.click();
		Thread.sleep(1000);
		
		cm.scroll();
		Thread.sleep(1000);
		
		System.out.println("Balance Report Done");
	}
	
	public void classReport() throws InterruptedException {
		
		reports.click();
		Thread.sleep(1000);
		
		classReport.click();
		Thread.sleep(1000);
		
		selectClassForClassReport.click();
		Thread.sleep(1000);
		classSelectionForClassReport.click();
		
		sectionForClassReport.click();
		Thread.sleep(1000);
		sectionSelectionForClassReport.click();
		
		searchForClassReport.click();
		Thread.sleep(1000);
		
		cm.scroll();
		
		d.navigate().back();
		Thread.sleep(1000);
		
		System.out.println("Class Report Done");
	}
	
	public void classRoutine() throws InterruptedException {
		
//		reports.click();
//		Thread.sleep(5000);
		
		System.out.println("Before Routine");
		
		classRoutine.click();
		Thread.sleep(1000);
		
		System.out.println("After Routine");
		
		selectClassForClassRoutine.click();
		Thread.sleep(1000);
		classSelectionForClassRoutine.click();
		
		sectionForClassRoutine.click();
		Thread.sleep(1000);
		sectionSelectionForClassRoutine.click();
		
		
		searchForClassRoutine.click();
		Thread.sleep(1000);
		
		cm.scroll();
		Thread.sleep(1000);
		
		d.findElement(By.xpath("//*[@id=\"main-content\"]/section[3]/div/div[1]/div[2]/a/i")).click();
		Thread.sleep(1000);
		
		ArrayList<String> tabs1 = new ArrayList<String>(d.getWindowHandles());
		d.switchTo().window(tabs1.get(1));
		Thread.sleep(1000);
		
		d.close();
		
		ArrayList<String> tabs2 = new ArrayList<String>(d.getWindowHandles());
		d.switchTo().window(tabs2.get(0));
		Thread.sleep(1000);
		
		System.out.println("Class Routine Done");

		
	}
	
	public void examRoutine() throws InterruptedException {
		
//		reports.click();
//		Thread.sleep(1000);
		
		examRoutine.click();
		Thread.sleep(1000);
		
		
		exam.click();
		Thread.sleep(1000);
		selectExamForReport.click();
		
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
		
		
		d.findElement(By.xpath("//*[@id=\"main-content\"]/section[3]/div/div[1]/div[2]/a")).click();
		
		ArrayList<String> tabs1 = new ArrayList<String>(d.getWindowHandles());
		d.switchTo().window(tabs1.get(1));
		Thread.sleep(1000);
		
		d.close();
		
		ArrayList<String> tabs2 = new ArrayList<String>(d.getWindowHandles());
		d.switchTo().window(tabs2.get(0));
		Thread.sleep(1000);
		
		System.out.println("Exam Routine Done");
		
	}
	
	public void meritListReport() throws InterruptedException {
		
//		reports.click();
//		Thread.sleep(1000);
		
		meritListReport.click();
		Thread.sleep(1000);
		
		examForMeritList.click();
		Thread.sleep(1000);
		selectExamForMeritList.click();
		
		
		selectClassForMeritList.click();
		Thread.sleep(1000);
		classSelectionForMeritList.click();
		
		sectionForMeritList.click();
		Thread.sleep(1000);
		sectionSelectionForMeritList.click();
		
		searchForMeritList.click();
		Thread.sleep(1000);
		
		cm.scroll();
		Thread.sleep(1000);
		
		System.out.println("Merit List Report Done");
		

	}
	
	public void onlineExamReport() throws InterruptedException {
		
//		reports.click();
//		Thread.sleep(1000);
		onlineExamReport.click();
		Thread.sleep(1000);
		
		
		onlineExam.click();
		Thread.sleep(1000);
		selectOnlineExam.click();
		
		selectClassForOnlineExam.click();
		Thread.sleep(1000);
		classSelectionForOnlineExam.click();
		
		sectionForOnlineExam.click();
		Thread.sleep(1000);
		sectionSelectionForOnlineExam.click();
		
		searchForOnlineExam.click();
		Thread.sleep(1000);
		
		cm.scroll();
		Thread.sleep(1000);
		
		System.out.println("Online Exam Report Done");
		
	}
	
	public void markSheetReport() throws InterruptedException {
		
//		reports.click();
//		Thread.sleep(1000);
		markSheetReport.click();
		Thread.sleep(1000);
		
		selectExam.click();
		Thread.sleep(1000);
		selectExamForMarksheet.click();
		
		selectClassForMarksheet.click();
		Thread.sleep(1000);
		classSelectionForMarksheet.click();
		
		sectionForMarksheet.click();
		Thread.sleep(1000);
		sectionSelectionForMarksheet.click();
		
		studentForMarksheet.click();
		Thread.sleep(1000);
		selectStudentForMarksheet.click();
		
		searchForMarksheet.click();
		Thread.sleep(2000);
		
		cm.scroll();
		Thread.sleep(1000);
		
		
		System.out.println("Mark Sheet Report Done");
		
	}
	
	public void tabulationSheetReport() throws InterruptedException {
		
//		reports.click();
//		Thread.sleep(1000);
		tabulationSheetReport.click();
		Thread.sleep(1000);
		
		selectExamForTabulation.click();
		Thread.sleep(1000);
		examSelectionForTabulation.click();
		
		selectClassForTabulation.click();
		Thread.sleep(1000);
		classSelectionForTabulation.click();
		
		sectionForTabulation.click();
		Thread.sleep(1000);
		sectionSelectionForTabulation.click();
		
		studentForTabulation.click();
		Thread.sleep(1000);
		selectStudentForTabulation.click();
		
		searchForTabulation.click();
		Thread.sleep(1000);
		
		cm.scroll();
		Thread.sleep(1000);
		
		d.navigate().back();
		Thread.sleep(1000);
		
		System.out.println("Tabulation Sheet Report Done");
		
	}
	
	public void progressCardReport() throws InterruptedException {
		
//		reports.click();
//		Thread.sleep(1000);
		
		progress.click();
		Thread.sleep(1000);
		
		selectClassForProgress.click();
		Thread.sleep(1000);
		classSelectionForProgress.click();
		
		sectionForProgress.click();
		Thread.sleep(1000);
		sectionSelectionForProgress.click();
		
		studentForProgress.click();
		Thread.sleep(1000);
		selectStudentForProgress.click();
		
		searchForProgress.click();
		Thread.sleep(1000);
		//print.click();
		
		cm.scroll();
		Thread.sleep(1000);
		
		
		System.out.println("Progress Card Report Done");
		
		
	}
	
	public void userLog() throws InterruptedException {
		
//		reports.click();
//		Thread.sleep(1000);
		
		userLog.click();
		Thread.sleep(1000);
		
		cm.scroll();
		Thread.sleep(1000);
		
		System.out.println("User Log Done");
	}
	
	public void previousResult() throws InterruptedException {
		
//		reports.click();
//		Thread.sleep(1000);
		
		previousResult.click();
		Thread.sleep(1000);
		
		adNumber.sendKeys("2");
		Thread.sleep(1000);
		
		
		search.click();
		Thread.sleep(1000);
		
		System.out.println("Previous Result Done");
		
	}
	
	public void previousRecord() throws InterruptedException {
		
//		reports.click();
//		Thread.sleep(1000);
		
		previousRecord.click();
		Thread.sleep(1000);
		
		year.click();
		Thread.sleep(1000);
		selectYear.click();
		
		selectClassForPreviousRecord.click();
		Thread.sleep(1000);
		classSelectionForPreviousRecord.click();
		
		sectionForPreviousRecord.click();
		Thread.sleep(1000);
		sectionSelectionForPreviousRecord.click();
		
		searchForRecord.click();
		Thread.sleep(1000);
		
		cm.scroll();
		Thread.sleep(1000);
		
		System.out.println("Previous Record Done");
		
		
	}
	
	
	
	public void reports() throws InterruptedException {
		
		int size = d.findElements(By.xpath("//body[1]/div[2]/nav[1]/ul[1]/li[24]/ul[1]/li/a[1]")).size();
		System.out.println(size);
		
		if(size == 17) {
			
			
			studentReport();
			Thread.sleep(1000);
			
			guardianReport();
			Thread.sleep(1000);
			
			studentHistory();
			Thread.sleep(1000);
			
			studentLoginReport();
			Thread.sleep(1000);
//			
			
			
			feesStatement();
			Thread.sleep(1000);
			
			balanceFeesReport();
			Thread.sleep(1000);
			
			classReport();
			Thread.sleep(1000);
			
			classRoutine();
			Thread.sleep(1000);
			
			examRoutine();
			Thread.sleep(1000);
			
			meritListReport();
			Thread.sleep(1000);
			
			
			onlineExamReport();
			Thread.sleep(1000);
			
			markSheetReport();
			Thread.sleep(1000);
			
			tabulationSheetReport();
			Thread.sleep(1000);
			
			progressCardReport();
			Thread.sleep(1000);
			
			
			userLog();
			Thread.sleep(2000);
			
			previousResult();
			Thread.sleep(1000);
			
			previousRecord();
			Thread.sleep(1000);
			
		}
		
		else {
			
			
			studentReport();
			Thread.sleep(1000);
			
			guardianReport();
			Thread.sleep(1000);
			
			studentHistory();
			Thread.sleep(1000);
			
			studentLoginReport();
			Thread.sleep(1000);		
			
			
			classReport();
			Thread.sleep(1000);
			
			classRoutine();
			Thread.sleep(1000);
			
			examRoutine();
			Thread.sleep(1000);
			
			meritListReport();
			Thread.sleep(1000);
			
			
			onlineExamReport();
			Thread.sleep(1000);
			
			markSheetReport();
			Thread.sleep(1000);
			
			tabulationSheetReport();
			Thread.sleep(1000);
			
			progressCardReport();
			Thread.sleep(1000);
			
			
			userLog();
			Thread.sleep(2000);
			
			previousResult();
			Thread.sleep(1000);
			
			previousRecord();
			Thread.sleep(1000);
			
			System.out.println("Checkout From Result");
			Thread.sleep(1000);
			
		}
		 
		 
		
	}
	
	
	
	

}
