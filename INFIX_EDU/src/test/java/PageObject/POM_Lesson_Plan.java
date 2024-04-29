package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Common_Method.CommonMethod;

public class POM_Lesson_Plan {
	
	WebDriver d;
	
	CommonMethod cm= new CommonMethod();
	
	@FindBy(xpath="//div[contains(text(),'Lesson Plan')]")
	WebElement lessonPlan;  //*[@id=\"sidebar_menu\"]/li[7]/a/div[2]
	
	//lesson
	
	@FindBy(xpath="//*[@id=\"subMenuTeacherLesson\"]/li[1]/a")
	WebElement lesson;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/form/div/div[1]/div[1]/div/div[2]/div/div[1]/div/div")
	WebElement selectClassForLesson;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/form/div/div[1]/div[1]/div/div[2]/div/div[1]/div/div/ul/li[2]")
	WebElement classSelectionForLesson;
	
	@FindBy(xpath="//*[@id=\"select_subject_div\"]/div[1]/span")
	WebElement selectSubjectForLesson;
	
	@FindBy(xpath="//*[@id=\"select_subject_div\"]/div[1]/ul/li[2]")
	WebElement subjectSelectionForLesson;
	
	@FindBy(xpath="//*[@id=\"lesson\"]")
	WebElement title;
	
	@FindBy(xpath="//*[@id=\"addRowBtn\"]/span")
	WebElement plusButton;
	
	@FindBy(xpath="(//input[@class='primary-input form-control'])[2]")
	WebElement titleAgain;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/form/div/div[1]/div[3]/div/div/div/div/button")
	WebElement saveLesson;
	
	
	@FindBy(xpath="//*[@id=\"table_id\"]/tbody/tr[1]/td[6]/div/button")
	WebElement selectLesson;
	
	@FindBy(xpath="//*[@id=\"table_id\"]/tbody/tr[1]/td[6]/div/div/a[1]")
	WebElement editLesson;
	
	//@FindBy(xpath="")
	//WebElement updateLesson;
	
	@FindBy(xpath="//*[@id=\"table_id\"]/tbody/tr[1]/td[6]/div/div/a[2]")
	WebElement deleteLesson;
	
	@FindBy(xpath="(//button[@class='primary-btn fix-gr-bg'])[2]")
	WebElement confirmDeleteLesson;
	
	
	//Topic 
	
	@FindBy(xpath="//*[@id=\"subMenuTeacherLesson\"]/li[2]/a")
	WebElement topic;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/form/div/div[1]/div[1]/div/div[2]/div/div[1]/div/div")
	WebElement selectClassForTopic;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/form/div/div[1]/div[1]/div/div[2]/div/div[1]/div/div/ul/li[2]")
	WebElement classSelectionForTopic;
	
	@FindBy(xpath="//*[@id=\"select_section_div\"]/div[1]")
	WebElement selectSectionForTopic;
	
	@FindBy(xpath="//*[@id=\"select_section_div\"]/div[1]/ul/li[3]")
	WebElement sectionSelectionForTopic;
	
	@FindBy(xpath="//*[@id=\"select_subject_div\"]/div[1]/span")
	WebElement selectSubjectForTopic;
	
	@FindBy(xpath="//*[@id=\"select_subject_div\"]/div[1]/ul/li[2]")
	WebElement subjectSelectionForTopic;
	
	@FindBy(xpath="//*[@id=\"select_lesson_div\"]/div[1]/span")
	WebElement selectLessonForTopic;
	
	@FindBy(xpath="//*[@id=\"select_lesson_div\"]/div[1]/ul/li[2]")
	WebElement lessonSelectionForTopic;
	
	@FindBy(xpath="//*[@id=\"topic\"]")
	WebElement addTopic;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/form/div/div[1]/div[3]/div/div/div/div/button")
	WebElement saveTopic;
	
	@FindBy(xpath="//*[@id=\"table_id\"]/tbody/tr[1]/td[7]/div/button")
	WebElement selectTopic;
	
	@FindBy(xpath="//*[@id=\"table_id\"]/tbody/tr[1]/td[7]/div/div/a[1]")
	WebElement editTopic;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/form/div/div[1]/div[3]/div/div/div/div/button")
	WebElement updateTopic;
	
	@FindBy(xpath="//*[@id=\"table_id\"]/tbody/tr[1]/td[7]/div/div/a[2]")
	WebElement deleteTopic;
	
	@FindBy(xpath="(//button[@class='primary-btn fix-gr-bg'])[2]")
	WebElement confirmDeleteTopic;
	
	//topic overview 
	
	@FindBy(xpath="//*[@id=\"subMenuTeacherLesson\"]/li[3]/a")
	WebElement topicOverview;
	
	@FindBy(xpath="//*[@id=\"search_lesson_Plan\"]/div/div[1]/div")
	WebElement selectLessonForSearch;
	
	@FindBy(xpath="//*[@id=\"search_lesson_Plan\"]/div/div[1]/div/ul/li[2]")
	WebElement lessonSelection;
	
	@FindBy(xpath="//*[@id=\"search_lesson_Plan\"]/div/div[2]/button")
	WebElement searchTopic;
	
	
	//lesson Plan
	
	
	@FindBy(xpath="//*[@id=\"subMenuTeacherLesson\"]/li[4]/a")
	WebElement lessonPlanSubmenu;
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div/div[1]/div")
	WebElement selectTeacher;
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div/div[1]/div/ul/li[2]")
	WebElement teacherSelection;
	
	@FindBy(xpath="//*[@id=\"search_student\"]/div/div[2]/button")
	WebElement searchLessonPlan;
	
	
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[3]/div/div[2]/div/table/tbody/tr/td[1]/div/a")
	WebElement addLessonPlan;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[3]/div/div[2]/div/table/tbody/tr/td[1]/div/div[2]/a")
	WebElement crossButton;
	//*[@id="main-content"]/section[3]/div/div[2]/div/table/tbody/tr/td[1]/div/div[2]/a
	
	@FindBy(xpath="//*[@id=\"showDetaildModalBody\"]/div/form/div[1]/div[1]/div[1]/div/div")
	WebElement selectLessonPlan;
	
	@FindBy(xpath="//*[@id=\"showDetaildModalBody\"]/div/form/div[1]/div[1]/div[1]/div/div/ul/li[2]")
	WebElement lessonPlanSelection;
	
	@FindBy(xpath="//*[@id=\"select_topic_div\"]/div[1]/span")
	WebElement selectTopicForLessonPlan;
	
	@FindBy(xpath="//*[@id=\"select_topic_div\"]/div[1]/ul/li[2]")
	WebElement topicSelectionForLessonPlan;
	
	@FindBy(xpath="//*[@id=\"showDetaildModalBody\"]/div/form/div[2]/div/button[2]")
	WebElement saveInfo;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[3]/div/div[2]/div/table/tbody/tr/td[1]/div/div[1]/a/span")
	WebElement viewPopUp;
	
	@FindBy(xpath="//*[@id=\"headerTableModal\"]/tbody/tr[9]/td/label/input")
	WebElement inputStatus;  
	
	@FindBy(xpath="(//span[@class='slider round'])[1]")
	WebElement status;  
	//*[@id="headerTableModal"]/tbody/tr[9]/td/label/span
	
	@FindBy(xpath="//*[@id=\"modalSize\"]/div/div[1]/button")
	WebElement closeViewPopUp;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[3]/div/div[2]/div/table/tbody/tr/td[1]/div/div[3]/a")
	WebElement editLessonPlan;
	
	@FindBy(xpath="//*[@id=\"showDetaildModalBody\"]/div[1]/form/div[3]/button[2]")
	WebElement updateLessonPlan;
	
	@FindBy(xpath="//*[@id=\"showDetaildModalBody\"]/div[2]/a/button")
	WebElement deleteLessonPlan;
	
	//lessonPlan Overview
	
	@FindBy(xpath="//*[@id=\"subMenuTeacherLesson\"]/li[5]/a")
	WebElement lessonPlanOverview;
	
	@FindBy(xpath="//*[@id=\"search_lesson_Plan\"]/div/div[1]/div")
	WebElement selectTeacherForOverview;
	
	@FindBy(xpath="//*[@id=\"search_lesson_Plan\"]/div/div[1]/div/ul/li[2]")
	WebElement teacherSelectionForOverview;
	
	@FindBy(xpath="//*[@id=\"search_lesson_Plan\"]/div/div[2]/div/span")
	WebElement selectClassForOverview;
	
	@FindBy(xpath="//*[@id=\"search_lesson_Plan\"]/div/div[2]/div/ul/li[2]")
	WebElement classSelectionForOverview;
	
	@FindBy(xpath="//*[@id=\"select_section_div\"]/div[1]/span")
	WebElement sectionforOverview;
	
	@FindBy(xpath="//*[@id=\"select_section_div\"]/div[1]/ul/li[3]")
	WebElement selectSectionForOverview;
	
	@FindBy(xpath="//*[@id=\"select_subject_div\"]/div[1]/span")
	WebElement subjectOverview;
	
	@FindBy(xpath="//*[@id=\"select_subject_div\"]/div[1]/ul/li[2]")
	WebElement selectSubjectForOverview;
	
	@FindBy(xpath="//*[@id=\"search_lesson_Plan\"]/div/div[5]/button")
	WebElement searchOverview;
	
	@FindBy(xpath="//*[@id=\"table_id\"]/tbody/tr/td[7]/label/span")
	WebElement completeStatus;
	
	@FindBy(xpath="//body[1]/div[4]/div[1]/div[1]/div[1]/h4[1]")
	WebElement popUpTitle;
	
	@FindBy(xpath="//*[@id=\"CancelModal\"]/div/div/div[2]/form/div[2]/button[2]")
	WebElement yesButton;
	
	@FindBy(xpath="//*[@id=\"complete_date\"]")
	WebElement dateClick;
	
	
	@FindBy(xpath="//body/div[8]/div[1]/table/thead/tr[1]/th[2]")
	WebElement monthYear;
	
	@FindBy(xpath="//body/div[8]/div[1]/table/thead/tr[1]/th[3]")
	WebElement rightArrow;
	
	
	
	@FindBy(xpath="//body/div[8]/div[1]/table/thead/tr[1]/th[1]")
	WebElement leftArrow;
	
	@FindBy(xpath="/html/body/div[8]/div[1]/table/tbody/tr[4]/td[5]")
	WebElement date;
	
	@FindBy(xpath="//*[@id=\"showReasonModal\"]/div/div/div[2]/form/div[2]/button[2]")
	WebElement saveDate;
	
	
	
	//lesson Plan Setting
	
	@FindBy(xpath="//*[@id=\"subMenuTeacherLesson\"]/li[6]/a")
	WebElement lessonPlanSetting;
	
	@FindBy(xpath="//*[@id=\"sub_topic_enable\"]")
	WebElement enable;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/form/div/div/div/div[1]/div/div/div[2]/label")
	WebElement disableRadioButton;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/form/div/div/div/div[1]/div/div/div[1]/label")
	WebElement enableRadioButton;
	
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/form/div/div/div/div[2]/div/button")
	WebElement update;
	
	
	
	
	
	
	
	
	
	public POM_Lesson_Plan(WebDriver driver) {
		
		d= driver;
		PageFactory.initElements(d, this);
	}
	
	public void lesson() throws InterruptedException {
		
		lessonPlan.click();
		Thread.sleep(1000);
		
		lesson.click();
		Thread.sleep(1000);
		
		selectClassForLesson.click();
		Thread.sleep(1000);
		
		classSelectionForLesson.click();
		Thread.sleep(1000);
		
		selectSubjectForLesson.click();
		Thread.sleep(1000);
		
		subjectSelectionForLesson.click();
		Thread.sleep(1000);
		
		title.sendKeys("Lesson 1");
		Thread.sleep(1000);
		
		//plusButton.click();
		//Thread.sleep(1000);
		
		//titleAgain.sendKeys("Lesson 2");
		//Thread.sleep(1000);
		
		saveLesson.click();
		Thread.sleep(1000);
		
		//selectLesson.click();
		//Thread.sleep(1000);
		
		//editLesson.click();
		//Thread.sleep(1000);
		
		//deleteLesson.click();
		//Thread.sleep(1000);
		
		//d.getWindowHandle();
		
		//confirmDeleteLesson.click();
		//Thread.sleep(1000);
		
	}
	
	public void topic() throws InterruptedException {
		
		//lessonPlan.click();
		//Thread.sleep(1000);
		
		topic.click();
		Thread.sleep(1000);
		
		selectClassForTopic.click();
		Thread.sleep(1000);
		
		classSelectionForTopic.click();
		Thread.sleep(1000);
		
		selectSectionForTopic.click();
		Thread.sleep(1000);
		
		sectionSelectionForTopic.click();
		Thread.sleep(1000);
		
		selectSubjectForTopic.click();
		Thread.sleep(1000);
		
		subjectSelectionForTopic.click();
		Thread.sleep(1000);
		
		selectLessonForTopic.click();
		Thread.sleep(1000);
		
		lessonSelectionForTopic.click();
		Thread.sleep(1000);
		
		addTopic.sendKeys("Topic 1");
		Thread.sleep(1000);
		
		saveTopic.click();
		Thread.sleep(1000);
		
		selectTopic.click();
		Thread.sleep(1000);
		
		editTopic.click();
		Thread.sleep(1000);
		
		updateTopic.click();
		Thread.sleep(1000);
		/*
		selectTopic.click();
		Thread.sleep(1000);
		
		deleteTopic.click();
		Thread.sleep(1000);
		
		d.getWindowHandle();
		
		confirmDeleteTopic.click();
		Thread.sleep(1000);
		*/
		
	}
	
	public void topicOverview() throws InterruptedException {
		
		//lessonPlan.click();
		//Thread.sleep(1000);
		
		topicOverview.click();
		Thread.sleep(1000);
		
		selectLessonForSearch.click();
		Thread.sleep(1000);
		
		lessonSelection.click();
		Thread.sleep(1000);
		
		searchTopic.click();
		Thread.sleep(1000);
		
	}
	
	public void lessonPlan() throws InterruptedException {
		
		//lessonPlan.click();
		//Thread.sleep(1000);
		
		lessonPlanSubmenu.click();
		Thread.sleep(1000);
		
		selectTeacher.click();
		Thread.sleep(1000);
		
		teacherSelection.click();
		Thread.sleep(1000);
		
		searchLessonPlan.click();
		Thread.sleep(1000);
		
		int size=d.findElements(By.xpath("//*[@id=\"main-content\"]/section[3]/div/div[2]/div/table/tbody/tr/td[1]/div/a")).size();
		if(size<100) {
			
			popUp();
		}
		
			
		viewPopUp();
			
		editPopUp();
			
		deletePopUp();
		
		
		
		
	}
	
	public void lessonPlanOverview() throws InterruptedException {
		
		lessonPlan.click();
		Thread.sleep(1000);
		
		lessonPlanOverview.click();
		Thread.sleep(1000);
		
		selectTeacherForOverview.click();
		Thread.sleep(1000);
		
		teacherSelectionForOverview.click();
		Thread.sleep(1000);
		
		selectClassForOverview.click();
		Thread.sleep(1000);
		
		classSelectionForOverview.click();
		Thread.sleep(1000);
		
		sectionforOverview.click();
		Thread.sleep(1000);
		
		selectSectionForOverview.click();
		Thread.sleep(1000);
		
		subjectOverview.click();
		Thread.sleep(1000);
		
		selectSubjectForOverview.click();
		Thread.sleep(1000);
		
		searchOverview.click();
		Thread.sleep(1000);
		
		cm.scroll();
		Thread.sleep(1000);
		
		completeStatus.click();
		Thread.sleep(2000);
		
		d.getWindowHandle();
		
		String text= popUpTitle.getText();
		
		System.out.println(text);
		
		if(text.equals("Status")) {
			
			completeStatus();
		}
		
		else {
			
			inCompleteStatus();
		}
		
		Thread.sleep(1000);
	}
	
	public void lessonPlanSetting() throws InterruptedException {
		
		//lessonPlan.click();
		//Thread.sleep(1000);
		
		lessonPlanSetting.click();
		Thread.sleep(1000);
		
		if(enable.isSelected()) {
			disableRadioButton.click();
		}
		
		else {
			enableRadioButton.click();
		}
		
	
		Thread.sleep(1000);
		
		update.click();
		Thread.sleep(1000);
		System.out.println("Checkout from Lesson plan");
		
	}
	

	
	public void popUp() throws InterruptedException {
		
		addLessonPlan.click();
		Thread.sleep(1000);
		
		d.getWindowHandle();
		
		selectLessonPlan.click();
		Thread.sleep(1000);
		
		lessonPlanSelection.click();
		Thread.sleep(1000);
		
		selectTopicForLessonPlan.click();
		Thread.sleep(1000);
		
		topicSelectionForLessonPlan.click();
		Thread.sleep(1000);
		
		saveInfo.click();
		Thread.sleep(1000);
	}
	
	public void viewPopUp() throws InterruptedException {
		
		viewPopUp.click();
		Thread.sleep(1000);
		
		d.getWindowHandle();
		
		
		status.click();
		
		
		//status.click();
		Thread.sleep(1000);
		
		closeViewPopUp.click();
		Thread.sleep(1000);
	}
	
	public void editPopUp() throws InterruptedException {
		
		editLessonPlan.click();
		Thread.sleep(1000);
		
		updateLessonPlan.click();
		Thread.sleep(1000);
		
		
	}
	
	public void deletePopUp() throws InterruptedException {
		
		crossButton.click();
		Thread.sleep(1000);
		
		d.getWindowHandle();
		
		deleteLessonPlan.click();
		Thread.sleep(1000);
		
		
	}
	
	public void completeStatus() throws InterruptedException {
		
		
		
		yesButton.click();
		
		Thread.sleep(1000);
		
		
	}
	
	public void inCompleteStatus() throws InterruptedException {
		
		
		
		selectDate("NOVEMBER 2022");
		
		saveDate.click();
		Thread.sleep(1000);
		
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
	
	
	
	

}
