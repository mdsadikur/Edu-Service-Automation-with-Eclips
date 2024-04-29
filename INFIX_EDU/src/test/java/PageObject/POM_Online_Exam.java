package PageObject;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class POM_Online_Exam {
	WebDriver driver = null;
	
	public POM_Online_Exam(WebDriver driver) {
		
		this.driver=driver;
	}
	
	/*
	 * 
	 * ONLINE EXAM
	 * 
	 */
	//online exam
	By OnlineExam = By.xpath("//*[@id=\"sidebar_menu\"]/li[17]/a/div[2]");
	//question group
	By QuestionGroup = By.xpath("//a[contains(text(),'Question Group')]");
	
	//title
	By title = By.name("title");
	
	//save
	By savebutton = By.xpath("//button[@class='primary-btn fix-gr-bg submit']");
	
	//actionselect
	By actionselect = By.xpath("//button[contains(text(),'Select')]");
	
	//selectspecific
	By selectspecificedit = By.xpath("//a[contains(text(),'Edit')]");
	
	/*
	 * 
	 * QUESTION BANK
	 * 
	 */
	
	//questionbank
	By Questionbank = By.xpath("//a[contains(text(),'Question Bank')]");
	
	//select group
	By SelectGroup = By.xpath("//*[@id=\"question_bank\"]/div/div[1]/div/div");
	
	//select specific group
	By SelectSpecificGroup = By.xpath("//*[@id=\"question_bank\"]/div/div[1]/div/div/ul/li[2]");
	
	/*
	 * 
	 */
	
	//select class
	By SelectClass = By.xpath("//*[@id=\"question_bank\"]/div/div[2]/div/div");
	
	//select specific class
	By SelectSpecificClass = By.xpath("//*[@id=\"question_bank\"]/div/div[2]/div/div/ul/li[2]");
	
	/*
	 * 
	 */
	
	//section
	By Section1 = By.xpath("//*[@id=\"selectSectionsDiv\"]/div[2]/label");
	
	By Section2 = By.xpath("//a[@class='select2-search-choice-close'] [@xpath='1']");
	
	
	//question type
	By QuestionType = By.xpath("//*[@id=\"question_bank\"]/div/div[4]/div/div");
	
	
	//select specific queston
	By SelectSpecificQuestionmultiple = By.xpath("//li[contains(text(),'Multiple Choice')]");
	By SelectSpecificQuestionTF = By.xpath("//li[contains(text(),'True False')]");
	By SelectSpecificQuestionFinB = By.xpath("//li[contains(text(),'Fill in the Blanks')]");
	
	/*
	 * 
	 */
	
	//question
	By question = By.name("question");
	//marks
	By marks = By.name("marks");
	//number_of_option
	By number_of_option = By.name("number_of_option");
	//create-option
	By create_option = By.id("create-option");
	
	/*
	 * 
	 */
	
	//option1
	By option1 = By.xpath("//*[@id=\"multiple-options\"]/div[1]/div[1]/div/input");
	//option2
	By option2 = By.xpath("//*[@id=\"multiple-options\"]/div[2]/div[1]/div/input");
	
	//answercheckmark
	By checkmark = By.xpath("//*[@id=\"multiple-options\"]/div[1]/div[2]/label");
	
	/*
	 * 
	 * True or False
	 * 
	 */
	//True
	By True = By.xpath("//label[contains(text(),'TRUE')]");
	
	/*
	 * 
	 * suitable_words
	 * 
	 */
	
	//suitable_words
	By BlankWord = By.name("suitable_words");
	
	//save question
	By savequestion = By.xpath("//*[@id=\"question_bank_submit\"]");
	
	/*
	 * 
	 * action select
	 * 
	 */
	
	//Select
	By select = By.xpath("//*[@id=\"table_id\"]/tbody/tr/td[5]/div/button");
	//edit
	By edit = By.xpath("//a[contains(text(),'Edit')]");
	//Update
	By Update = By.xpath("//*[@id=\"question_bank_submit\"]");
	
	
	
	/*
	 * 
	 * 
	 * ONLINE EXAM
	 * 
	 * 
	 */
	
	By onlineExam = By.xpath("//*[@id=\"subMenuOnlineExam\"]/li[3]/a");
	
	//title
	By online_exam_title = By.name("title");
	
	//select class
	By OnlineExamClass = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[2]/div/div");
	
	//select specific class
	By OnlineExamSpecificClass = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[2]/div/div/ul/li[2]");
	
	//select subject
	By OnlineExamSubject = By.xpath("//*[@id=\"subjectSelecttHomeworkDiv\"]/div[1]");
	
	//select specific subject
	By OnlineExamSpecificSubject = By.xpath("//*[@id=\"subjectSelecttHomeworkDiv\"]/div[1]/ul/li[2]");
	
	//section
	
	By exam_section = By.xpath("//*[@id=\"selectSectionsDiv\"]/div[2]/label");
	/*
	 * 
	 * 
	 * 
	 * 
	 */
	
	//Date From 
	
	//clickdate
	By clickdate = By.id("startDate");
	
	//monthYear
	By monthYear = By.xpath("/html[1]/body[1]/div[5]/div[1]/table[1]/thead[1]/tr[1]/th[2]");
	
	//sitebar
	By sitebar = By.xpath("//body[1]/div[5]/div[1]/table[1]/thead[1]/tr[1]/th[1]");
	
	//datepicker
	public int  day = 15;
	By datepicker = By.xpath("/html[1]/body[1]/div[5]/div[1]/table[1]/tbody[1]/tr/td[contains(text(),"+day+")]");
	
	
	// Date From

	// clickdate
	By clickdate2 = By.id("end_date");

	// monthYear
	By monthYear2 = By.xpath("/html[1]/body[1]/div[5]/div[1]/table[1]/thead[1]/tr[1]/th[2]");

	// sitebar
	By sitebar2 = By.xpath("//body[1]/div[5]/div[1]/table[1]/thead[1]/tr[1]/th[1]");

	// datepicker
	public int day2 = 20;
	By datepicker2 = By.xpath("/html[1]/body[1]/div[5]/div[1]/table[1]/tbody[1]/tr/td[contains(text()," + day2 + ")]");
	
	//intime
	By intime = By.name("start_time");
	
	// outtime
	By outtime = By.name("end_time");
	
	//percentage
	By percentage = By.name("percentage");
	
	//instruction
	By instruction = By.name("instruction");
	
	//save online exam
	By saveOnlineExam = By.xpath("//button[@class='primary-btn fix-gr-bg submit']");
	
	/*
	 * 
	 * 
	 */
	
	//clickonlineexambutton
	public void clickonlineexambutton() throws InterruptedException {
		driver.findElement(OnlineExam).click();
		Thread.sleep(1000);
		
		//questionbank
		driver.findElement(QuestionGroup).click();
		Thread.sleep(1000);
		System.out.println("Successfully enter in question group");
		
		//title
		driver.findElement(title).sendKeys("title 1");
		Thread.sleep(1000);
		
		//save button
		driver.findElement(savebutton).click();
		Thread.sleep(1000);
		
		//actionselect
		driver.findElement(actionselect).click();
		Thread.sleep(1000);
		
		//specific select
		driver.findElement(selectspecificedit).click();
		Thread.sleep(1000);
		
		//save
		driver.findElement(savebutton).click();
		Thread.sleep(1000);
		System.out.println("Successfully saved question group");
	}
	
	//click question bank field
	public void ClickQuestionBank() throws InterruptedException {
//		driver.findElement(OnlineExam).click();
//		Thread.sleep(1000);
		
		driver.findElement(Questionbank).click();
		Thread.sleep(1000);
		System.out.println("Successfully enter in question bank");
		
		//selectGroup
		driver.findElement(SelectGroup).click();
		Thread.sleep(1000);

		// SelectSpecificGroup
		driver.findElement(SelectSpecificGroup).click();
		Thread.sleep(1000);

		// SelectClass
		driver.findElement(SelectClass).click();
		Thread.sleep(1000);

		// SelectSpecificClass
		driver.findElement(SelectSpecificClass).click();
		Thread.sleep(3000);

		// Section
		driver.findElement(Section1).click();
		Thread.sleep(1000);
		
//		driver.findElement(Section1).sendKeys(Keys.ENTER);
//		Thread.sleep(1000);
//
//		driver.findElement(Section1).sendKeys("Day");
//
//		driver.findElement(Section1).sendKeys(Keys.RETURN);
//		Thread.sleep(1000);
//		driver.findElement(Section2).click();
//		Thread.sleep(1000);
//
//		driver.findElement(Section1).sendKeys(Keys.RETURN);
//		Thread.sleep(1000);
		

		/*
		 * 
		 * 
		 * 
		 */
		
		// QuestionType
		driver.findElement(QuestionType).click();
		Thread.sleep(1000);
		
		//SelectSpecificQuestionmultiple
		driver.findElement(SelectSpecificQuestionmultiple).click();
		Thread.sleep(1000);
		
		// question
		driver.findElement(question).sendKeys("Select The following option");
		Thread.sleep(1000);
		
		//marks
		driver.findElement(marks).sendKeys("5");
		Thread.sleep(1000);
		
		//number_of_option
		driver.findElement(number_of_option).sendKeys("2");
		Thread.sleep(1000);
		
		//create_option
		driver.findElement(create_option).click();
		Thread.sleep(1000);
		
		//option1
		driver.findElement(option1).sendKeys("option 1");
		Thread.sleep(1000);
		
		//option2
		driver.findElement(option2).sendKeys("option 2");
		Thread.sleep(1000);
		
		//checkmark
		driver.findElement(checkmark).click();
		Thread.sleep(1000);
		
		//savequestion
		driver.findElement(savequestion).click();
		Thread.sleep(1000);
		System.out.println("Successfully saved multiple choice");
		
		/*
		 * 
		 * True or false
		 * 
		 */
		
		driver.findElement(Questionbank).click();
		Thread.sleep(1000);
		
		//selectGroup
		driver.findElement(SelectGroup).click();
		Thread.sleep(1000);
		
		//SelectSpecificGroup
		driver.findElement(SelectSpecificGroup).click();
		Thread.sleep(1000);
		
		//SelectClass
		driver.findElement(SelectClass).click();
		Thread.sleep(1000);
		
		// SelectSpecificClass
		driver.findElement(SelectSpecificClass).click();
		Thread.sleep(5000);
		
		// Section
		driver.findElement(Section1).click();
		Thread.sleep(2000);
//		driver.findElement(Section1).click();
//		Thread.sleep(2000);
		
		/*
		 * 
		 * 
		 * 
		 */

		//student DropDown

//		driver.findElement(By.xpath("//*[@id=\"s2id_selectSectionss\"]")).click();
//		Thread.sleep(2000);
//				driver.findElement(By.xpath("//*[@id=\"s2id_selectSectionss\"]")).click();
//				Thread.sleep(5000);
//				
//				List <WebElement> optionList=driver.findElements(By.xpath("/html/body/div[6]"));
//				//html/body/div[6]
//				
//				for(int i=0;i<optionList.size();i++)
//				{
//					String text=optionList.get(i).getText();
//					System.out.println("Text is"+text);
//					if(text.contains("Day"))
//					{
//						optionList.get(i).click();
//						break;
//					}
//				}


		/*
		 * 
		 * 
		 * 
		 * 
		 */
		
		// QuestionType
		driver.findElement(QuestionType).click();
		Thread.sleep(1000);
		
		//SelectSpecificQuestionmultiple
		driver.findElement(SelectSpecificQuestionTF).click();
		Thread.sleep(1000);
		
		// question
		driver.findElement(question).sendKeys("Select The following option");
		Thread.sleep(1000);
		
		//marks
		driver.findElement(marks).sendKeys("5");
		Thread.sleep(1000);
		
		// True or false
		driver.findElement(True).click();
		Thread.sleep(1000);
		
		//savequestion
		driver.findElement(savequestion).click();
		Thread.sleep(1000);
		System.out.println("Successfully saved true or false");
		
		/*
		 * 
		 * Fill in the blank
		 * 
		 */
		
		driver.findElement(Questionbank).click();
		Thread.sleep(1000);
		
		//selectGroup
		driver.findElement(SelectGroup).click();
		Thread.sleep(1000);
		
		//SelectSpecificGroup
		driver.findElement(SelectSpecificGroup).click();
		Thread.sleep(1000);
		
		//SelectClass
		driver.findElement(SelectClass).click();
		Thread.sleep(1000);
		
		// SelectSpecificClass
		driver.findElement(SelectSpecificClass).click();
		Thread.sleep(1000);
		
		// Section
		driver.findElement(Section1).click();;
//		
//		driver.findElement(Section1).sendKeys(Keys.RETURN);
//		Thread.sleep(1000);
		
		// QuestionType
		driver.findElement(QuestionType).click();
		Thread.sleep(1000);
		
		//SelectSpecificQuestionmultiple
		driver.findElement(SelectSpecificQuestionFinB).click();
		Thread.sleep(1000);
		
		// question
		driver.findElement(question).sendKeys("Select The following option");
		Thread.sleep(1000);
		
		//marks
		driver.findElement(marks).sendKeys("5");
		Thread.sleep(1000);
		
		// Fill in the blank
		driver.findElement(BlankWord).sendKeys("Fill in the Blank");
		Thread.sleep(1000);
		
		//savequestion
		driver.findElement(savequestion).click();
		Thread.sleep(1000);
		System.out.println("Successfully saved fill in the blank");
		
		
	}
	
	/*
	 * 
	 * Action Select
	 * 
	 */
	//clickSelectButton
	public void clickSelectButton() throws InterruptedException {
		//select
		driver.findElement(select);
		Thread.sleep(1000);
		
		//edit
		driver.findElement(edit);
		Thread.sleep(1000);
		
		//Update
		driver.findElement(Update);
		Thread.sleep(1000);
	}
	
	
	/*
	 * 
	 * 
	 * ONLINE EXAM
	 * 
	 * 
	 */
	public void OnlineClass() throws InterruptedException, AWTException {
		
//		driver.findElement(OnlineExam).click();
//		Thread.sleep(1000);
		
		driver.findElement(onlineExam).click();
		Thread.sleep(1000);
		
		System.out.println("Successfully enter in online exam");
		
		//title
		driver.findElement(online_exam_title).sendKeys("Title 1");
		Thread.sleep(1000);
		
		//class
		driver.findElement(OnlineExamClass).click();
		Thread.sleep(1000);
		
		//specific class
		driver.findElement(OnlineExamSpecificClass).click();
		Thread.sleep(1000);
		
		//subject
		driver.findElement(OnlineExamSubject).click();
		Thread.sleep(1000);
		
		//specific subject
		driver.findElement(OnlineExamSpecificSubject).click();
		Thread.sleep(1000);
		
		//exam_section
		driver.findElement(exam_section).click();
		Thread.sleep(1000);
	
	
	
	
	// upload_date From
	String month2 = "MARCH 2022";
	

	driver.findElement(clickdate).click();   //click calender
	Thread.sleep(2000);

	while(true) {
	String text = driver.findElement(monthYear).getText();   //locator is month and year
						
	if(text.equals(month2))
	{
	 break;
	}
		else
		{
						
	driver.findElement(sitebar).click();             //locator of site arrow.you have to change it
		}
	}
					
	driver.findElement(datepicker).click();   //locator of all date.
	Thread.sleep(2000);
	
	
	// upload_date To
	String month = "MARCH 2022";

	driver.findElement(clickdate2).click(); // click calender
	Thread.sleep(2000);

	while (true) {
		String text = driver.findElement(monthYear2).getText(); // locator is month and year

		if (text.equals(month)) {
			break;
		} else {

			driver.findElement(sitebar2).click(); // locator of site arrow.you have to change it
		}
	}

	driver.findElement(datepicker2).click(); // locator of all date.
	Thread.sleep(2000);
	
	
	// in time

	driver.findElement(intime).sendKeys(Keys.CONTROL + "a");
	driver.findElement(intime).sendKeys(Keys.DELETE);
	driver.findElement(intime).sendKeys("2:45 PM");
	
	// out time

	driver.findElement(outtime).sendKeys(Keys.CONTROL + "a");
	driver.findElement(outtime).sendKeys(Keys.DELETE);
	driver.findElement(outtime).sendKeys("3:45 PM");
	
	
	//percentage
	driver.findElement(percentage).sendKeys("2");
	Thread.sleep(1000);
	
	//instruction
	driver.findElement(instruction).sendKeys("It is a long established fact that a reader will be distracted by "
			+ "the readable content of a page when looking at its layout." );
	Thread.sleep(1000);
	
	//saveOnlineExam
	driver.findElement(saveOnlineExam).click();
	Thread.sleep(1000);
	
	System.out.println("Successfully saved online exam");
	System.out.println("Checkout from Online Exam");
	
	}

}
