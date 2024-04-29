package TestCases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import Base.DriverSetup;
import PageObject.POM_Front_Settings;

public class TC_Fronts_Setting extends DriverSetup{
	
	@Test(priority=23)
	public void TC_FrontsSetting() throws InterruptedException, AWTException {
		
		POM_Front_Settings cbox = new POM_Front_Settings(driver);
		
		//click header menu manager
		cbox.Header_menu_manager();
		Thread.sleep(1000);
		
		//click homepage button
		cbox.clickhomepagebutton();
		Thread.sleep(1000);
		
		//clickNewsHeadingButton
		cbox.clickNewsHeadingButton();
		Thread.sleep(1000);
		
		//click_News_List_Button
		cbox.clickNews_List_Button();
		Thread.sleep(1000);
		
		//clickCourseHeadingButton
		cbox.clickCourseHeadingButton();
		Thread.sleep(1000);
		
		// clickCourseHeadingButton
		cbox.clickCourseDetailsHeadingButton();
		Thread.sleep(1000);
		
		//clickCourseCategoryButton
		cbox.clickCourseCategoryButton();
		Thread.sleep(1000);
		
		//clickCourseListButton
		cbox.clickCourseListButton();
		Thread.sleep(1000);
		
		//clickTestimonialButton
		cbox.clickTestimonialButton();
		Thread.sleep(1000);
		
		//clickContactPageButton
		cbox.clickContactPageButton();
		Thread.sleep(1000);
		
		//clickAboutusButton
		cbox.clickAboutusButton();
		Thread.sleep(1000);
		
	}

}
