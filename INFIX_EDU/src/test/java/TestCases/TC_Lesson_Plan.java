package TestCases;

import org.testng.annotations.Test;

import PageObject.POM_Lesson_Plan;



public class TC_Lesson_Plan extends Base.DriverSetup{
	
	
	@Test(priority=5)
	public void lessonPlan() throws InterruptedException {
		POM_Lesson_Plan lesson = new POM_Lesson_Plan(driver);
		
		
		
		lesson.lesson();
		Thread.sleep(1000);
		
		lesson.topic();
		Thread.sleep(1000);
		
		lesson.topicOverview();
		Thread.sleep(1000); 
		
		lesson.lessonPlan();
		Thread.sleep(1000); 
		
		lesson.lessonPlanOverview();
		Thread.sleep(1000);
		
		lesson.lessonPlanSetting();
		Thread.sleep(1000);

		
	}

	
	
	
}
