package PageObject;

import java.util.ArrayList;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Common_Method.CommonMethod;


public class POM_Examination {
	
	 WebDriver d;
	
	 CommonMethod cm= new CommonMethod();
	Random random = new Random();
	@FindBy(xpath="//div[contains(text(),'Examination')]")
	WebElement examination;  //*[@id=\"sidebar_menu\"]/li[16]/a/div[2]
	
	//exam type
	
	@FindBy(xpath="//*[@id=\"subMenuExam\"]/li[2]/a")
	WebElement examType;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div[2]/div[1]/div/div/form/div/div/div[1]/div/div/input[1]")
	WebElement examName;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div[2]/div[1]/div/div/form/div/div/div[2]/div/button")
	WebElement saveExamType;
	
	@FindBy(xpath="//*[@id=\"table_id\"]/tbody/tr[3]/td[3]/div/div/button")
	WebElement examSelect;  //*[@id="table_id"]/tbody/tr[1]/td[3]/div/div/button
	
	@FindBy(xpath="//*[@id=\"table_id\"]/tbody/tr[3]/td[3]/div/div/div/a[1]")
	WebElement examEdit;
	
	@FindBy(xpath="//*[@id=\"table_id\"]/tbody/tr[3]/td[3]/div/div/div/a[2]")
	WebElement examDelete;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div[3]/div[1]/div/div/form/div/div/div[2]/div/button")
	WebElement updateExam;
	
	@FindBy(xpath="(//button[@class='primary-btn fix-gr-bg'])[3]")
	WebElement examDeleteButton;
	
	@FindBy(xpath="//*[@id=\"table_id\"]/tbody/tr[4]/td[3]/div/a")
	WebElement examSetupFromExamType;
	
	//exam Setup
	
	@FindBy(xpath="//*[@id=\"subMenuExam\"]/li[3]/a")
	WebElement examSetup;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/form/div/div[1]/div[1]/div/div[2]/div/div[3]/div[1]/div[4]/label")
	WebElement selectExamType;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/form/div/div[1]/div[1]/div/div[2]/div/div[4]/div/div")
	WebElement examClass;
	
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/form/div/div[1]/div[1]/div/div[2]/div/div[4]/div/div/ul/li[2]")
	WebElement examClassSelect;
	
	@FindBy(xpath="//*[@id=\"exam_subejct\"]/div/div[1]/label")
	WebElement examsubjectSelect;
	
	@FindBy(xpath="//*[@id=\"exam_mark_main\"]")
	WebElement examMark;
	
	@FindBy(xpath="//*[@id=\"exam_title\"]")
	WebElement questionTitle;
	
	@FindBy(xpath="//*[@id=\"exam_mark\"]")
	WebElement addMark;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/form/div/div[1]/div[3]/div/div/div/div/button")
	WebElement saveMark;
	
	@FindBy(xpath="//*[@id=\"table_id\"]/tbody/tr[3]/td[1]")
	WebElement plusButton;
	
	@FindBy(xpath="(//button[@type='button'])[23]")
	WebElement examSetupSelect;
	

	@FindBy(xpath="(//a[@class='dropdown-item'])[4]")
	WebElement examSetupEdit;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/form/div/div/div/div/div[2]/div[3]/div/button")
	WebElement updateMarkDistribution;
	
	@FindBy(xpath="(//a[@class='dropdown-item'])[5]")
	WebElement examSetupDelete;
	
	@FindBy(xpath="(//button[@class='primary-btn fix-gr-bg'])[3]")
	WebElement examSetupDeletebutton;
	
	//exam schedule 
	
	@FindBy(xpath="//*[@id=\"subMenuExam\"]/li[4]/a")
	WebElement examSchedule;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div[1]/div[2]/a")
	WebElement addExamSchedule;
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div/div[1]/div")
	WebElement selectExam;
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div/div[1]/div/ul/li[2]")
	WebElement examSelection;
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div/div[2]/div/span")
	WebElement selectExamClass;
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div/div[2]/div/ul/li[2]")
	WebElement examClassSelection;
	
	@FindBy(xpath="//*[@id=\"select_section_div\"]/div[1]")
	WebElement selectExamSection;
	
	@FindBy(xpath="//*[@id=\"select_section_div\"]/div[1]/ul/li[3]")
	WebElement examSectionSelection;
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div/div[4]/button")
	WebElement searchForSchedule;
	
	@FindBy(xpath="//body[1]/div[2]/div[1]/section[3]/div[1]/form[1]/div[1]/div[1]/table[1]/tbody[1]/tr")
	WebElement tableRow;
	
	@FindBy(xpath="//*[@id=\"addRowBtn\"]/span")
	WebElement addSchedule;
	
	@FindBy(xpath="(//span[@class='current'])[7]")
	WebElement selectSubject;
	
//	@FindBy(xpath="(//li[@class='option'])[22]")
//	WebElement subjectSelectionForSchedule;
	
	
	@FindBy(xpath="(//li[@class='option'])[26]")
	WebElement subjectSelection;
	
	@FindBy(xpath="(//span[@class='current'])[9]")
	WebElement section;
	
	@FindBy(xpath="//body/div[2]/div/section[3]/div/form/div[1]/div/table/tbody/tr/td[3]/div/div/div[1]/ul/li[3]")
	WebElement sectionSelection;
	
	@FindBy(xpath="(//span[@class='current'])[10]")
	WebElement teacher;
	
	@FindBy(xpath="(//li[@class='option'])[32]")
	WebElement teacherSelection;
	
	@FindBy(xpath="//input[@class='primary-input time form-control'][1]")
	WebElement examStartTime; 
	
	@FindBy(xpath="//body[1]/div[2]/div[1]/section[3]/div[1]/form[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/div[1]/div[1]/div[1]/input[1]")
	WebElement examEndTime;
	
	@FindBy(xpath="(//span[@class='current'])[11]")
	WebElement room;
	
	@FindBy(xpath="//body[1]/div[2]/div[1]/section[3]/div[1]/form[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[8]/div[1]/div[1]/div[1]/ul[1]/li[2]")
	WebElement selectRoom; 
	
	@FindBy(xpath="//*[@id=\"validateAddNewExamRoutine\"]/div[2]/button")
	WebElement saveExam;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[3]/div/div/div[2]/a")
	WebElement printRoutine;
	
	//exam Attendance
	
	@FindBy(xpath="//*[@id=\"subMenuExam\"]/li[5]/a")
	WebElement examAttendance;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div[1]/div[2]/a")
	WebElement addExamAttendance;
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div/div[1]/div")
	WebElement selectExamForAttendance;
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div/div[1]/div/ul/li[2]")
	WebElement examSelectionForAttendance;
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div/div[2]/div/span")
	WebElement selectClassForAttendance;
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div/div[2]/div/ul/li[2]")
	WebElement classSelectionForAttendance;
	
	@FindBy(xpath="//*[@id=\"select_class_subject_div\"]/div[1]/span")
	WebElement selectSubjectForAttendance;
	
	@FindBy(xpath="//*[@id=\"select_class_subject_div\"]/div[1]/ul/li[3]")
	WebElement subjectSelectionForAttendance;
	
	@FindBy(xpath="//*[@id=\"m_select_subject_section_div\"]/div[1]/span")
	WebElement selectSectionForAttendance;
	
	@FindBy(xpath="//*[@id=\"m_select_subject_section_div\"]/div[1]/ul/li[2]")
	WebElement sectionSelectionForAttendance;
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div/div[5]/button")
	WebElement searchForAttendance;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/form/div/div/div[2]/div/div/div/button")
	WebElement saveAttendance;
	
	
	
	
	//mark register
	
	@FindBy(xpath="//*[@id=\"subMenuExam\"]/li[6]/a")
	WebElement markRegister;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div[1]/div/div[2]/a")
	WebElement createMark;
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div/div[1]/div")
	WebElement selectExamForMark;
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div/div[1]/div/ul/li[2]")
	WebElement examSelectionForMark;
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div/div[2]/div")
	WebElement selectClassForMark;
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div/div[2]/div/ul/li[2]")
	WebElement classSelectionForMark;
	
	@FindBy(xpath="//*[@id=\"select_class_subject_div\"]/div[1]")
	WebElement selectSubjectForMark;
	
	@FindBy(xpath="//*[@id=\"select_class_subject_div\"]/div[1]/ul/li[3]")
	WebElement subjectSelectionForMark;
	
	@FindBy(xpath="//*[@id=\"m_select_subject_section_div\"]/div[1]/span")
	WebElement selectSectionForMark;
	
	@FindBy(xpath="//*[@id=\"m_select_subject_section_div\"]/div[1]/ul/li[2]")
	WebElement sectionSelectionForMark;
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div/div[5]/button")
	WebElement searchForExam;
	
	
	@FindBy(xpath="//*[@id=\"marks_register_store\"]/div/div/table/tbody/tr[1]/td[5]/div/input[2]")
	WebElement Q1mark;
	
	@FindBy(xpath="//*[@id=\"marks_register_store\"]/div/div/table/tbody/tr[1]/td[6]/div/input")
	WebElement remarks;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	WebElement saveMarks;
	
	//marks Grade
	
	@FindBy(xpath="//*[@id=\"subMenuExam\"]/li[1]/a")
	WebElement marksGrade;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[1]/div/div/input[1]")
	WebElement gradeName;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[2]/div/div/input[1]")
	WebElement gpa;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[3]/div/div/input")
	WebElement percentFrom;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[4]/div/div/input[1]")
	WebElement percentTo;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[5]/div/div/input")
	WebElement gpaFrom;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[6]/div/div/input[1]")
	WebElement gpaTo;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[8]/div/button")
	WebElement saveGrade;
	
	@FindBy(xpath="//*[@id=\"table_id\"]/tbody/tr[1]/td[6]/div/button")
	WebElement selectGrade;
	
	@FindBy(xpath="//*[@id=\"table_id\"]/tbody/tr[1]/td[6]/div/div/a[1]")
	WebElement editGrade;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div[2]/div[1]/div/div/form/div/div/div[8]/div/button")
	WebElement updateGrade;
	
	@FindBy(xpath="//*[@id=\"table_id\"]/tbody/tr[1]/td[6]/div/div/a[2]")
	WebElement deleteGrade;
	
	@FindBy(xpath="(//button[@class='primary-btn fix-gr-bg'])[1]")
	WebElement deleteButtonGrade;
	
	//send mark by sms
	
	@FindBy(xpath="//*[@id=\"subMenuExam\"]/li[7]/a")
	WebElement sendMark;
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div/div[1]/div")
	WebElement examForSend;
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div/div[1]/div/ul/li[2]")
	WebElement selectExamForSend;
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div/div[2]/div/span")
	WebElement classForSend;
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div/div[2]/div/ul/li[2]")
	WebElement selectClassForSend;
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div/div[3]/div")
	WebElement receiver;
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div/div[3]/div/ul/li[2]")
	WebElement selectReceiver;
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div/div[4]/button")
	WebElement sendMarkViaSMS;
	
	
	//settings 
	@FindBy(xpath="//*[@id=\"subMenuExam\"]/li[8]/a")
	WebElement settings;
	
	//setup exam rule
	@FindBy(xpath="//*[@id=\"examSettings\"]/li[1]/a")
	WebElement setupExamRule;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div[1]/div[1]/div/div/form/div/div/div[1]/div[1]/div/div[2]/div/div/div/div/input")
	WebElement testExamPercent;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div[1]/div[1]/div/div/form/div/div/div[1]/div[2]/div/div[2]/div/div/div/div/input")
	WebElement termExamPercent;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div[1]/div[1]/div/div/form/div/div/div[2]/div/button")
	WebElement updateMark;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div[2]/div[2]/div[2]/div/div[1]/label")
	WebElement totalMark; 
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div[2]/div[2]/div[2]/div/div[2]/label")
	WebElement totalGrade;
	
	
	
	
	//format settings
	
	@FindBy(xpath="//*[@id=\"examSettings\"]/li[2]/a")
	WebElement formatSettings;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[1]/div[1]/div")
	WebElement selectExamForFormat;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[1]/div[1]/div/ul/li[2]")
	WebElement examSelectionForFormat;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[1]/div[2]/div/input")
	WebElement controllerTitle;
	
	
	
	
	@FindBy(xpath="//*[@id=\"start_date\"]")  
	WebElement startDate;
	
	@FindBy(xpath="//body/div[5]/div[1]/table/thead/tr[1]/th[2]")  
	WebElement monthYear;
	
	@FindBy(xpath="//body/div[5]/div[1]/table/thead/tr[1]/th[1]")
	WebElement leftArrow;
	
	@FindBy(xpath="//body/div[5]/div[1]/table/tbody/tr[2]/td[3]")
	WebElement sdate;
	
	@FindBy(xpath="//body/div[5]/div[1]/table/tbody/tr[2]/td[4]")
	WebElement edate;
	
	@FindBy(xpath="//*[@id=\"end_date\"]")
	WebElement endDate;
	
	
	
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[7]/div/button")
	WebElement saveContent;
	
	@FindBy(xpath="//*[@id=\"table_id\"]/tbody/tr[2]/td[1]")
	WebElement plusButtonFormat;
	
	@FindBy(xpath="//*[@id=\"table_id\"]/tbody/tr[2]/td[7]/div/button")
	WebElement selectButton; //*[@id="table_id"]/tbody/tr[1]/td[7]/div/button
	
	@FindBy(xpath="//*[@id=\"table_id\"]/tbody/tr[2]/td[7]/div/div/a[1]")
	WebElement editButton;  //*[@id="table_id"]/tbody/tr[1]/td[7]/div/div/a[1]
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[7]/div/button")
	WebElement updateButton;
	
	@FindBy(xpath="//*[@id=\"table_id\"]/tbody/tr[2]/td[7]/div/div/a[2]")
	WebElement deleteButton;
	
	@FindBy(xpath="(//button[@type='submit'])[5]")
	WebElement delete;
	
	
	
	
	
	public POM_Examination(WebDriver driver) {
		d= driver;
		PageFactory.initElements(d, this);
		
	}
	
	public void examType() throws InterruptedException {
		
		examination.click();
		Thread.sleep(1000);
		
		examType.click();
		Thread.sleep(1000);
		System.out.println("Successfully enter exam type");
		
		examName.sendKeys("Test");
		Thread.sleep(1000);
		
		saveExamType.click();
		Thread.sleep(1000);
		
		examActions();
		
		examSetupFromExamType.click();
		Thread.sleep(1000);
		
		examSet();
		System.out.println("Successfully complete exam type");
		
	}
	
	public void examSetup() throws InterruptedException {
		
		examination.click();
		Thread.sleep(1000);
		
		examSetup.click();
		Thread.sleep(1000);
		System.out.println("Successfully enter exam setup");
		
		selectExamType.click();
		Thread.sleep(1000);
		
		examSet();
		
		
		
//		plusButton.click();
//		Thread.sleep(1000);
		
		examSetActions();
		System.out.println("Successfully complete exam setup");
		
		
		
	}
	
	public void examSchedule() throws InterruptedException {
		
//		examination.click();
//		Thread.sleep(1000);
		
		examSchedule.click();
		Thread.sleep(1000);
		System.out.println("Successfully enter exam schedule");
		
		addExamSchedule();
		
		addExam();
		Thread.sleep(1000);
		
		ArrayList<String> tabs2 = new ArrayList<String>(d.getWindowHandles());
		d.switchTo().window(tabs2.get(0));
		
		Thread.sleep(1000);
		
		System.out.println("Successfully complete schedule");
		
	}
	
	public void examAttendance() throws InterruptedException {
		
		examination.click();
		Thread.sleep(1000);
		
		examAttendance.click();
		Thread.sleep(1000);
		System.out.println("Successfully enter exam attendance");
		
		attendanceSearch();
		
		cm.scroll();
		Thread.sleep(1000);
		
		int size=d.findElements(By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr/td[5]/button[1]")).size();
		int i=1;
		
		while(i<=size) {
			
			String text= d.findElement(By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr["+i+"]/td[5]/button[1]")).getText();
			if(text.matches("ABSENT")) {
				examAttendanceCreate();
				
				
				d.get("http://pos.rishfa.com/exam-attendance");
				
				attendanceSearch();
				Thread.sleep(1000);
				
				cm.scroll();
				Thread.sleep(1000);
				
			}
			else {
				System.out.println("OK");
				break;
				//d.navigate().back();
				
			}
			System.out.println("Successfully complete exam attendance");

		}
	
	}
	

	public void markRegister() throws InterruptedException {
		
//		examination.click();
//		Thread.sleep(1000);
		
		markRegister.click();
		Thread.sleep(1000);
		System.out.println("Successfully enter mark register");
		
		searchMark();
		
		int size=d.findElements(By.xpath("//body[1]/div[2]/div[1]/section[3]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr/td[5]/div[1]/p[1]")).size();
		System.out.println(size);
		int i=1;
		boolean loop= true;
		
		
		while(loop) {
			
			String text=d.findElement(By.xpath("//body[1]/div[2]/div[1]/section[3]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr["+i+"]/td[5]/div[1]/p[1]")).getText();
			String textAttendance=d.findElement(By.xpath("//body[1]/div[2]/div[1]/section[3]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr["+i+"]/td[6]/div[1]/button[1]")).getText();
			
			int number = Integer.parseInt(text);
			
			System.out.println(number);
			
			if(number==0 && textAttendance.matches("PRESENT")) {
				
				createMark();
			}
			
			else {
				
				if(textAttendance.matches("PRESENT")) {
					
					System.out.println("Mark Registerd");
				}
				
				else {
					System.out.println("You are absent");
					break;
				}
				
				//System.out.println("Please Register Mark");
				
			}
			loop = false ;
			System.out.println("Done");
//			d.get("http://pos.rishfa.com/marks-register");
//			searchMark();
			System.out.println("Successfully complete exam mark register");
			
		}
		
		
		
	
		
	}

	public void marksGrade() throws InterruptedException {
		
		examination.click();
		Thread.sleep(1000);
//		
		marksGrade.click();
		Thread.sleep(1000);
		System.out.println("Successfully enter marks grade");
		
		gradeCreation();
		
		gradeActions();
		System.out.println("Successfully complete exam marks grade");
		
		
	}
	
	public void sendMark() throws InterruptedException {
		
		//examination.click();
		//Thread.sleep(1000);
		
		sendMark.click();
		Thread.sleep(1000);
		System.out.println("Successfully enter send mark");
		
		examForSend.click();
		Thread.sleep(1000);
		
		selectExamForSend.click();
		Thread.sleep(1000);
		
		classForSend.click();
		Thread.sleep(1000);
		
		selectClassForSend.click();
		Thread.sleep(1000);
		
		receiver.click();
		Thread.sleep(1000);
		
		selectReceiver.click();
		Thread.sleep(1000);
		
		sendMarkViaSMS.click();
		Thread.sleep(1000);
		System.out.println("Successfully complete exam send mark");
		
		
	}
	
	public void examSetUpRule() throws InterruptedException {
		
//		examination.click();
//		Thread.sleep(1000);
		
		settings.click();
		Thread.sleep(1000);
		System.out.println("Successfully enter exam settings");
		
		setupExamRule.click();
		Thread.sleep(1000);
		
		
		int size= d.findElements(By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")).size();
		int i=1;

			
			int percent= random.nextInt(30);//29  
			String percentNumber =  Integer.toString(percent);
			
			int remain= 100-percent; // 71
			
			int reminder= remain % (size-1); // 2
			
			int p= (remain-reminder)/(size-1); //(71-2)/3=23
			
			while(i<=size) {
				

//				d.findElement(By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div["+i+"]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")).clear();
//				d.findElement(By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div["+i+"]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys(percentNumber1);
//				Thread.sleep(1000);
				
				if(i==1) {
					String percentNumber1= percentNumber; //29
					
					d.findElement(By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div["+i+"]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")).clear();
					d.findElement(By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div["+i+"]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys(percentNumber1);
					Thread.sleep(1000);
					//percentNumber =  Integer.toString(percent1);
				}
				else if(i==2) {
					String percentNumber1= Integer.toString(p+reminder); // 25
					
					d.findElement(By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div["+i+"]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")).clear();
					d.findElement(By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div["+i+"]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys(percentNumber1);
					Thread.sleep(1000);
				}
				else {
					
					String percentNumber1= Integer.toString(p); // 23 
					
					d.findElement(By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div["+i+"]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")).clear();
					d.findElement(By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div["+i+"]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys(percentNumber1);
					Thread.sleep(1000);
				}
				
				i++;
				
				
//			System.out.println(percentNumber1);
//				
//				String mark=d.findElement(By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/strong[1]/p[1]")).getText();
//				
//				String remainPercentage[] = mark.split(" ", 0);
//				
//				String remainMark[]= remainPercentage[1].split("%",0);
				
				//System.out.println(remainMark[0]);
				
			//	int percent1=  Integer.parseInt(remainMark[0]);
				
				
				//percent1= percent1/(size-i);
	

			}

			updateMark.click();
			Thread.sleep(1000);
			
			
			
			cm.scroll();
			Thread.sleep(1000);
			
			
			if(totalMark.isSelected()) {
				totalGrade.click();
				Thread.sleep(1000);
			}
			
			else {
				
				totalMark.click();
				Thread.sleep(1000);
				System.out.println("Successfully complete exam settings");
			}

			
		
		
		
		
	}
	
	
	
	public void formatSettings() throws InterruptedException {
//		examination.click();
//		Thread.sleep(1000);
//		
//		settings.click();
//		Thread.sleep(1000);
		
		formatSettings.click();
		Thread.sleep(1000);
		System.out.println("Successfully enter format settings");
		
		
		addFormatSettings();
		
		formatSettingsAction();
		System.out.println("Successfully complete exam format settings");
		
		
		
	}
	
	public String selectStartDate(String month) {
		
		startDate.click();
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
		
		
		
		sdate.click();
		return month;
		
	}
	
	public String selectEndDate(String month) {
		
		endDate.click();
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
		
		
		
		edate.click();
		return month;
		
	}
	
	public void examActions() throws InterruptedException {
		examSelect.click();
		Thread.sleep(1000);
		
		examEdit.click();
		Thread.sleep(1000);
		
		updateExam.click();
		Thread.sleep(1000);
		
		examSelect.click();
		Thread.sleep(1000);
		
		examDelete.click();
		Thread.sleep(1000);
		
		
		d.getWindowHandle();
		
		examDeleteButton.click(); 
		Thread.sleep(1000);
	}
	
	public void examSet() throws InterruptedException {
		
		examClass.click();
		Thread.sleep(1000);
		
		examClassSelect.click();
		Thread.sleep(1000);
		
		examsubjectSelect.click();
		Thread.sleep(1000);
		
		examMark.clear();
		examMark.sendKeys("10");
		
		cm.scroll();
		
		questionTitle.sendKeys("Q1");
		Thread.sleep(1000);
		
		addMark.clear();
		addMark.sendKeys("10");
		Thread.sleep(1000);
		
		saveMark.click();
		Thread.sleep(1000);
	}
	
	public void examSetActions() throws InterruptedException {
		examSetupSelect.click();
		Thread.sleep(1000);
		
		examSetupEdit.click();
		Thread.sleep(1000);
		
		updateMarkDistribution.click();
		Thread.sleep(1000);
		
//		plusButton.click();
//		Thread.sleep(1000);
//		
//		examSetupSelect.click();
//		Thread.sleep(1000);
//		
//		examSetupDelete.click();
//		Thread.sleep(1000);
//		
//		d.getWindowHandle();
//		
//		examSetupDeletebutton.click();
//		Thread.sleep(1000);
		
	}
	
	public void addExamSchedule() throws InterruptedException {
		
		addExamSchedule.click();
		Thread.sleep(1000);
		
		selectExam.click();
		Thread.sleep(1000);
		
		examSelection.click();
		Thread.sleep(1000);
		
		selectExamClass.click();
		Thread.sleep(1000);
		
		examClassSelection.click();
		Thread.sleep(1000);
		
		selectExamSection.click();
		Thread.sleep(1000);
		
		examSectionSelection.click();
		Thread.sleep(1000);
		
		searchForSchedule.click();
		Thread.sleep(1000);
	}
	
	public void addExam() throws InterruptedException {
		
		
			condition();
			
			saveExam.click();
			Thread.sleep(1000);
			
			//Trash button
			d.findElement(By.xpath("//body[1]/div[2]/div[1]/section[3]/div[1]/form[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[9]/button[1]")).click();
			Thread.sleep(1000);
			
			d.getWindowHandle();
//			
			d.findElement(By.xpath("//button[@id='classRoutineDeleteSubmitButton'][1]")).click();
			Thread.sleep(1000);
			
			printRoutine.click();
			Thread.sleep(1000);
			
			ArrayList<String> tabs2 = new ArrayList<String>(d.getWindowHandles());
			d.switchTo().window(tabs2.get(1));
			
			Thread.sleep(2000);
			
			d.close();
			
			
		}
		
		
		public void condition() throws InterruptedException {
			
			int size=d.findElements(By.xpath("//body[1]/div[2]/div[1]/section[3]/div[1]/form[1]/div[1]/div[1]/table[1]/tbody[1]/tr/td[1]")).size();
			System.out.println(size);
			if(size>0) {
				
				addSchedule.click();
				Thread.sleep(1000);
				
				cm.scroll();
				Thread.sleep(1000);
				
				d.findElement(By.xpath("(//span[@class='current'])[12]")).click();
				Thread.sleep(1000);
				System.out.println("Clicked on select button");
				
				d.findElement(By.xpath("//body/div[2]/div/section[3]/div/form/div[1]/div/table/tbody/tr[2]/td[1]/div/div/ul/li[2]")).click();
				
				
				d.findElement(By.xpath("(//span[@class='current'])[14]")).click();
				Thread.sleep(1000);
				d.findElement(By.xpath("//body/div[2]/div/section[3]/div/form/div[1]/div/table/tbody/tr[2]/td[3]/div/div/div[1]/ul/li[3]")).click();
				
				
				d.findElement(By.xpath("(//span[@class='current'])[15]")).click();
				Thread.sleep(1000);
				d.findElement(By.xpath("//body/div[2]/div/section[3]/div/form/div[1]/div/table/tbody/tr[2]/td[4]/div/div/div[1]/ul/li[2]")).click();
				
				d.findElement(By.xpath("//body[1]/div[2]/div[1]/section[3]/div[1]/form[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[6]/div[1]/div[1]/div[1]/input[1]")).sendKeys(Keys.CONTROL + "a");
				d.findElement(By.xpath("//body[1]/div[2]/div[1]/section[3]/div[1]/form[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[6]/div[1]/div[1]/div[1]/input[1]")).sendKeys(Keys.DELETE);
				d.findElement(By.xpath("//body[1]/div[2]/div[1]/section[3]/div[1]/form[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[6]/div[1]/div[1]/div[1]/input[1]")).sendKeys("7.00 PM");
				Thread.sleep(1000);
				
				d.findElement(By.xpath("//body[1]/div[2]/div[1]/section[3]/div[1]/form[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[7]/div[1]/div[1]/div[1]/input[1]")).sendKeys(Keys.CONTROL + "a");
				d.findElement(By.xpath("//body[1]/div[2]/div[1]/section[3]/div[1]/form[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[7]/div[1]/div[1]/div[1]/input[1]")).sendKeys(Keys.DELETE);
				d.findElement(By.xpath("//body[1]/div[2]/div[1]/section[3]/div[1]/form[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[7]/div[1]/div[1]/div[1]/input[1]")).sendKeys("8.00 PM");
				Thread.sleep(1000);
				
				d.findElement(By.xpath("(//span[@class='current'])[16]")).click();
				Thread.sleep(1000);
				d.findElement(By.xpath("//body[1]/div[2]/div[1]/section[3]/div[1]/form[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[8]/div[1]/div[1]/div[1]/ul[1]/li[2]")).click();
				Thread.sleep(1000);
				
				
				
//				
				
				
				
			}	
				
			else {
				
				System.out.println("Entered in else");
				
				addSchedule.click();
				Thread.sleep(1000);
				
				selectSubject.click();
				Thread.sleep(1000);
				subjectSelection.click();
				
				
				section.click();
				Thread.sleep(1000);
				System.out.println("Ok");
				sectionSelection.click();
				
				
				teacher.click();
				Thread.sleep(1000);
				teacherSelection.click();
				
				
				examStartTime.sendKeys(Keys.CONTROL + "a");
				examStartTime.sendKeys(Keys.DELETE);
				examStartTime.sendKeys("7.00 PM");
				Thread.sleep(1000);
				
				examEndTime.sendKeys(Keys.CONTROL + "a");
				examEndTime.sendKeys(Keys.DELETE);
				examEndTime.sendKeys("8.00 PM");
				Thread.sleep(1000);
				
				room.click();
				Thread.sleep(1000);
				
				selectRoom.click();
				Thread.sleep(1000);
			}
			
		}
		
		public void examAttendanceCreate() throws InterruptedException {
			addExamAttendance.click();
			Thread.sleep(1000);
			
			attendanceSearch();
			
			cm.scroll();
			Thread.sleep(1000);
			
			int size=d.findElements(By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr/td[5]/div[1]/div[2]/label[1]")).size();
			//List<WebElement> radio=d.findElements(By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr/td[5]/div[1]/div[1]/label[1]")); 
			
			//body[1]/div[2]/div[1]/section[2]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/div[1]/label[1]
			int i=1;
			
			while(i <= size) {
				
				//WebElement radio=d.findElement(By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr["+i+"]/td[5]/div[1]/div[1]/label[1]"));
				WebElement radio=d.findElement(By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr["+i+"]/td[5]/div[1]/div[1]/label[1]"));
				
				
				radio.click();
				

				
//				if(radio.isSelected()) {
//					radio2.click();
//				}
//				
//				else
//					radio.click();
//				
//				
				i++;	
				
			}
			
			
			
			saveAttendance.click();
			Thread.sleep(1000);
			
		}
		
		public void attendanceSearch() throws InterruptedException {
			selectExamForAttendance.click();
			Thread.sleep(1000);
			
			examSelectionForAttendance.click();
			Thread.sleep(1000);
			
			selectClassForAttendance.click();
			Thread.sleep(1000);
			
			classSelectionForAttendance.click();
			Thread.sleep(1000);
			
			selectSubjectForAttendance.click();
			Thread.sleep(1000);
			
			subjectSelectionForAttendance.click();
			Thread.sleep(1000);
			
			selectSectionForAttendance.click();
			Thread.sleep(1000);
			
			sectionSelectionForAttendance.click();
			Thread.sleep(2000);
			
			searchForAttendance.click();
			Thread.sleep(1000);
			
		}
		
		public void searchMark() throws InterruptedException {
			selectExamForMark.click();
			Thread.sleep(1000);
			
			examSelectionForMark.click();
			Thread.sleep(1000);
			
			selectClassForMark.click();
			Thread.sleep(1000);
			
			classSelectionForMark.click();
			Thread.sleep(1000);
			
			selectSubjectForMark.click();
			Thread.sleep(1000);
			
			subjectSelectionForMark.click();
			Thread.sleep(1000);
			
			selectSectionForMark.click();
			Thread.sleep(1000);
			
			sectionSelectionForMark.click();
			Thread.sleep(1000);
			
			searchForExam.click();
			Thread.sleep(1000);
			
			cm.scroll();

			Thread.sleep(2000);
		}
		
		public void createMark() throws InterruptedException {
			
			createMark.click();
			Thread.sleep(1000);
			
			
			searchMark();
			
			int size= d.findElements(By.xpath("//body[1]/div[2]/div[1]/section[3]/section[1]/div[1]/small[1]/form[1]/div[1]/div[1]/table[1]/tbody[1]/tr/td[5]/div[1]/input[2]")).size();
			int i=1;
			
			while(i<=size) {
				
				String text=d.findElement(By.xpath("//body[1]/div[2]/div[1]/section[3]/section[1]/div[1]/small[1]/form[1]/div[1]/div[1]/table[1]/tbody[1]/tr["+i+"]/td[7]/div[1]/button[1]")).getText();
				
				if(text.matches("PRESENT")) {
					
					int	 number= random.nextInt(15);
					
					String questionMark =  Integer.toString(number);
					d.findElement(By.xpath("//body[1]/div[2]/div[1]/section[3]/section[1]/div[1]/small[1]/form[1]/div[1]/div[1]/table[1]/tbody[1]/tr["+i+"]/td[5]/div[1]/input[2]")).clear();
					d.findElement(By.xpath("//body[1]/div[2]/div[1]/section[3]/section[1]/div[1]/small[1]/form[1]/div[1]/div[1]/table[1]/tbody[1]/tr["+i+"]/td[5]/div[1]/input[2]")).sendKeys(questionMark);
					
					Thread.sleep(1000);
					
					
					d.findElement(By.xpath("//body[1]/div[2]/div[1]/section[3]/section[1]/div[1]/small[1]/form[1]/div[1]/div[1]/table[1]/tbody[1]/tr["+i+"]/td[6]/div[1]/input[1]")).clear();
					d.findElement(By.xpath("//body[1]/div[2]/div[1]/section[3]/section[1]/div[1]/small[1]/form[1]/div[1]/div[1]/table[1]/tbody[1]/tr["+i+"]/td[6]/div[1]/input[1]")).sendKeys("Good");
					Thread.sleep(1000);
					
				}
				
				
				i++;
				
			}
			
			
//			Q1mark.clear();
//			Q1mark.sendKeys("9");
//			
//			
//			remarks.sendKeys("Excellent");
//			
//			
			saveMarks.click();
			Thread.sleep(1000);
		}
		
		public void gradeCreation() throws InterruptedException {
			
			gradeName.sendKeys("Test");
			Thread.sleep(1000);
			
			gpa.sendKeys("6");
			Thread.sleep(1000);
			
			percentFrom.sendKeys("20");
			Thread.sleep(1000);
			
			percentTo.sendKeys("30");
			Thread.sleep(1000);
			
			gpaFrom.sendKeys("5");
			Thread.sleep(1000);
			
			gpaTo.sendKeys("6");
			Thread.sleep(1000);
			
			saveGrade.click();
			Thread.sleep(1000);
		}
		
		public void gradeActions() throws InterruptedException {
			selectGrade.click();
			Thread.sleep(1000);
			
			editGrade.click();
			Thread.sleep(1000);
			
			updateGrade.click();
			Thread.sleep(1000);
			
			selectGrade.click();
			Thread.sleep(1000);
			
			deleteGrade.click();
			Thread.sleep(1000);
			
			d.getWindowHandle();
			
			deleteButtonGrade.click();
			Thread.sleep(1000);
			
		}
		
		public void addFormatSettings() throws InterruptedException {
			
			selectExamForFormat.click();
			Thread.sleep(1000);

			examSelectionForFormat.click();
			Thread.sleep(1000);

			controllerTitle.sendKeys("Test");
			Thread.sleep(1000);

			selectStartDate("NOVEMBER 2022");
			Thread.sleep(1000);

			selectEndDate("NOVEMBER 2022");
			Thread.sleep(1000);

			saveContent.click();
			Thread.sleep(1000);

		}
		
		public void formatSettingsAction() throws InterruptedException {
//			plusButtonFormat.click();
//			Thread.sleep(1000);

			selectButton.click();
			Thread.sleep(1000);

			editButton.click();
			Thread.sleep(1000);

			cm.scroll();
			Thread.sleep(1000);

			updateButton.click();
			Thread.sleep(1000);

//			plusButtonFormat.click();
//			Thread.sleep(1000);
//			
			selectButton.click();
			Thread.sleep(1000);
//			
			deleteButton.click();
			Thread.sleep(1000);
//			
			d.getWindowHandle();
			
			delete.click();
			Thread.sleep(1000);
			
		}
		
		
	}


