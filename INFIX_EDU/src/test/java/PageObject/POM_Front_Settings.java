package PageObject;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Common_Method.CommonMethod;

public class POM_Front_Settings {
	WebDriver driver = null;
	
	public POM_Front_Settings(WebDriver driver) {
		
		this.driver=driver;
	}
	
	CommonMethod upload = new CommonMethod();
	
	//Front setting
	By Front_settings = By.xpath("//*[@id=\"sidebar_menu\"]/li[28]/a/div[2]");
	
	//header menu manager
	By header_menu_manager = By.cssSelector("a[href*=header-menu-manager]");
	
	//home edit
	By Home_edit = By.xpath("//*[@id=\"heading_1\"]/div[2]/a[1]");
	
	//home update
	By Home_update = By.xpath("//*[@id=\"elementEditForm\"]/div/div[5]/div/button");
	
	//home_about
	By about_edit = By.xpath("//*[@id=\"heading_2\"]/div[2]/a[1]");
	
	//about_update
	By About_update = By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ol[1]/li[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[5]/div[1]/button[1]/i[1]");
	
	// home_course
	By course_edit = By.xpath("//*[@id=\"heading_3\"]/div[2]/a[1]");

	// course_update
	By course_update = By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ol[1]/li[3]/div[1]/div[2]/div[1]/form[1]/div[1]/div[5]/div[1]/button[1]");

	// home_news
	By news_edit = By.xpath("//*[@id=\"heading_4\"]/div[2]/a[1]");

	// news_update
	By news_update = By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ol[1]/li[4]/div[1]/div[2]/div[1]/form[1]/div[1]/div[5]/div[1]/button[1]");

	// home_contact
	By contact_edit = By.xpath("//*[@id=\"heading_5\"]/div[2]/a[1]");

	// contact_update
	By contact_update = By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ol[1]/li[5]/div[1]/div[2]/div[1]/form[1]/div[1]/div[5]/div[1]/button[1]");

	// home_login
	By login_edit = By.xpath("//*[@id=\"heading_6\"]/div[2]/a[1]");

	// login_update
	By login_update = By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ol[1]/li[6]/div[1]/div[2]/div[1]/form[1]/div[1]/div[5]/div[1]/button[1]");
	
	/*
	 * 
	 * 
	 * Home Page
	 * 
	 * 
	 */
	
	//Home_page
	By Home_page = By.xpath("//*[@id=\"subMenufrontEndSettings\"]/li[2]/a");
	
	//browse
	By browse = By.xpath("//label[contains(text(),'Browse')]");
	
	//save
	By save = By.cssSelector("button[class*='primary-btn fix-gr-bg']");
	
	/*
	 * 
	 * 
	 * News Heading
	 * 
	 * 
	 */
	
	//news heading
	By news_heading = By.xpath("//a[contains(text(),'News Heading')]");
	
	//new_heading_update
	By new_heading_update = By.cssSelector("button[class*='primary-btn fix-gr-bg']");
	
	/*
	 * 
	 * 
	 * News Category
	 * 
	 * 
	 */
	
	//news Category
	By news_category = By.xpath("//*[@id=\"subMenufrontEndSettings\"]/li[4]/a");
	
	//category_name
	By category_name = By.name("category_name");
	
	//category_name_save
	By category_name_save = By.cssSelector("button[class*='primary-btn fix-gr-bg submit']");
	
	/*
	 * action select
	 */
	//select
	By select = By.xpath("//*[@id=\"table_id\"]/tbody/tr[1]/td[2]/div/button");
	
	//edit
	By edit = By.xpath("//*[@id=\"table_id\"]/tbody/tr[1]/td[2]/div/div/a[1]");
	
	//delete
	By delete = By.xpath("//*[@id=\"table_id\"]/tbody/tr[1]/td[2]/div/div/a[2]");
	
	//delete_cancel
	By delete_cancel = By.xpath("//button[contains(text(),'Cancel')]");
	
	//delete_confirm
	By delete_confirm = By.xpath("//button[contains(text(),'delete')]");
	
	/*
	 * 
	 * 
	 * News List
	 * 
	 * 
	 */
	
	//News List
	By news_list = By.xpath("//*[@id=\"subMenufrontEndSettings\"]/li[5]/a");
	//*[@id="subMenufrontEndSettings"]/li[5]/a
	
	//news_list_title
	By news_list_title = By.name("title");
	
	//news_list_select
	By news_list_select = By.xpath("//*[@id=\"add-income\"]/div/div/div[1]/div[2]/div[1]/div/div");
	
	//specific select
	By specific_newsList_select = By.xpath("//*[@id=\"add-income\"]/div/div/div[1]/div[2]/div[1]/div/div/ul/li[2]");
	
	/*
	 * 
	 */
	//image browse
	By newsList_image = By.xpath("//label[contains(text(),'Browse')]");
	
	/*
	 * 
	 */
	
	// click From date
	By clicknewslistkdate = By.id("startDate");

	// monthYear
	By NewslistmonthYear = By.xpath("/html[1]/body[1]/div[5]/div[1]/table[1]/thead[1]/tr[1]/th[2]");

	// sitebar
	By Newslistsitebar = By.xpath("//body[1]/div[5]/div[1]/table[1]/thead[1]/tr[1]/th[1]");

	// datepicker
	public int eventday = 15;
	By Newslistdatepicker = By.xpath("/html[1]/body[1]/div[5]/div[1]/table[1]/tbody[1]/tr/td[contains(text()," + eventday + ")]");
	
	/*
	 * 
	 */
	
	//newsList_Description
	By newsList_DEscription = By.name("description");
	
	//NewsList_Save
	By NewsList_Save = By.cssSelector("button[class*='primary-btn fix-gr-bg']");
	
	/*
	 * 
	 * 
	 * Course Heading
	 * 
	 * 
	 */
	
	//course_heading
	By course_heading = By.xpath("//*[@id=\"subMenufrontEndSettings\"]/li[6]/a");
	
	//course_heading_update
	By course_heading_update = By.xpath("//button[@class='primary-btn fix-gr-bg']");
	
	/*
	 * 
	 * 
	 * Course details Heading
	 * 
	 * 
	 */
	
	//course_details_heading
	By course_details_heading = By.xpath("//*[@id=\"subMenufrontEndSettings\"]/li[7]/a");
	
	//course_heading_update
	By course_details_heading_update = By.xpath("//button[@class='primary-btn fix-gr-bg submit']");
	
	/*
	 * 
	 * 
	 * Course Category
	 * 
	 * 
	 */
	
	//course category
	By course_category = By.xpath("//*[@id=\"subMenufrontEndSettings\"]/li[8]/a");
	
	//category_name
	By Category_name = By.name("category_name");
	
	//course_category_browse
	By course_category_browse = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[2]/div[2]/button/label");
	
	//course_category_save
	By course_category_save = By.xpath("//button[@class='primary-btn fix-gr-bg submit']");
	
	/*
	 * 
	 * 
	 * Action select
	 * 
	 * 
	 */
	
	//course_category_select
	By course_category_select = By.xpath("//*[@id=\"table_id\"]/tbody/tr[1]/td[3]/div/button");
	
	//course_category_edit
	By course_category_edit = By.xpath("//*[@id=\"table_id\"]/tbody/tr[1]/td[3]/div/button");
	
	//course_category_delete
	By course_category_delete = By.xpath("//*[@id=\"table_id\"]/tbody/tr[1]/td[3]/div/div/a[2]");
	
	//course_category_delete_cancel
	By course_category_delete_cancel = By.xpath("//*[@id=\"deleteCourseCategory4\"]/div/div/div[2]/div[2]/button[1]");
	
	//course_category_delete_confirm
	By course_category_delete_confirm = By.xpath("//*[@id=\"deleteCourseCategory4\"]/div/div/div[2]/div[2]/button[2]");
	
	
	/*
	 * 
	 * 
	 *Course List
	 * 
	 * 
	 */
	
	//course_list
	By course_list = By.xpath("//a[contains(text(),'Course List')]");
	
	//course_list_title
	By course_list_title = By.name("title");
	
	//course_list_course_category
	By course_list_course_category = By.xpath("//*[@id=\"main-content\"]/section[2]/div[2]/div/div/div/form/div/div[1]/div[1]/div[2]/div/div");
	
	//course_list_specific_course_category
	By course_list_specific_course_category = By.xpath("//*[@id=\"main-content\"]/section[2]/div[2]/div/div/div/form/div/div[1]/div[1]/div[2]/div/div/ul/li[2]");
	
	//course_list_browse
	By course_list_browse = By.xpath("//label[contains(text(),'Browse')]");
	
	//course_list_save
	By course_list_save = By.cssSelector("button[class*='primary-btn fix-gr-bg']");
	
	/*
	 * 
	 * 
	 * Action select
	 * 
	 * 
	 */
	
	//course_list_select
	By course_list_select = By.xpath("//*[@id=\"table_id\"]/tbody/tr[1]/td[4]/div/button");
	
	//course_list_edit
	By course_list_edit = By.xpath("//*[@id=\"table_id\"]/tbody/tr[1]/td[4]/div/div/a[2]");
	
	//Course_list_update_save
	By Course_list_update_save = By.xpath("//*[@id=\"main-content\"]/section[2]/div[2]/div/div/div/form/div/div[2]/div/button");
	
	//course_list_delete
	By course_list_delete = By.xpath("//*[@id=\"table_id\"]/tbody/tr[1]/td[4]/div/div/a[3]");
	
	//course_list_delete_cancel
	By course_list_delete_cancel = By.xpath("//button[contains(text(),'Cancel')]");
	
	//course_list_delete_confirm
	By course_list_delete_confirm = By.xpath("//button[contains(text(),'delete')]");
	
	/*
	 * 
	 * 
	 * Testimonial
	 * 
	 * 
	 */
	
	//Testimonial
	By testimonial = By.xpath("//a[contains(text(),'Testimonial')]");
	
	//testimonial_name
	By testimonial_name = By.name("name");
	
	//testimonial_designation
	By testimonial_designation = By.name("designation");
	
	//testimonial_institution_name
	By testimonial_institution_name = By.name("institution_name");
	
	//testimonial_browse
	By testimonial_browse = By.xpath("//label[contains(text(),'Browse')]");
	
	//testimonial_description
	By testimonial_description = By.name("description");
	
	//testimonial_add
	By testimonial_add = By.xpath("//button[contains(text(),'Add')]");
	
	/*
	 * 
	 * action select
	 * 
	 */
	
	// testimonial_select
	By testimonial_select = By.xpath("//*[@id=\"table_id\"]/tbody/tr[1]/td[5]/div/button");
	
	//testimonial_view 
	By testimonial_view = By.xpath("//*[@id=\"table_id\"]/tbody/tr[1]/td[5]/div/div/a[1]");
			
	//testimonial_view
	By testimonial_view_cancel = By.xpath("//*[@id=\"modalSize\"]/div/div[1]/button");

	// testimonial_edit
	By testimonial_edit = By.xpath("//*[@id=\"table_id\"]/tbody/tr[1]/td[5]/div/div/a[2]");
	
	//testimonial_add
	By testimonial_update = By.xpath("//button[contains(text(),'Update')]");

	// testimonial_delete
	By testimonial_delete = By.xpath("//*[@id=\"table_id\"]/tbody/tr[1]/td[5]/div/div/a[3]");
	
	//testimonial_delete_cancel
	By testimonial_delete_cancel = By.xpath("//button[contains(text(),'Cancel')]");
	
	//testimonial_select_confirm
	By testimonial_delete_confirm = By.xpath("//button[contains(text(),'delete')]");
	
	/*
	 * 
	 * 
	 * Contact Page
	 * 
	 * 
	 */
	
	//contact_page
	By contact_page = By.xpath("//a[contains(text(),'Contact Page ')]");
	
	//contact_page_view
	By contact_page_view = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div/div[2]/div/table/tbody/tr/td[5]/a");
	
	//contact page view cancel
	By contact_page_view_cancel = By.xpath("//*[@id=\"showimageModal\"]/div/div/div[1]/button");
	
	//contact page edit
	By contact_page_edit = By.xpath("//a[contains(text(),'Edit')]");
	
	//contact page browse
	By contact_page_browse = By.xpath("//label[contains(text(),'Browse')]");
	
	//contact_page_update
	By contact_page_update = By.xpath("//button[@class='primary-btn fix-gr-bg']");
	
	/*
	 * 
	 * 
	 * About Us
	 * 
	 * 
	 */
	
	//About_us
	By about_us = By.xpath("//a[contains(text(),' About Us ')]");
	
	//about us view
	By about_us_view = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[2]/div[2]/div/table/tbody/tr/td[5]/a[1]");
	
	//about_us_view_cancel
	By about_us_view_cancel = By.xpath("//*[@id=\"showimageModal\"]/div/div/div[1]/button");
	
	//about us edit
	By about_us_edit = By.xpath("//a[contains(text(),'Edit')]");
	
	//about us image
	By about_us_image1 = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[2]/div[2]/button/label");
	
	//about us image
	By about_us_image2 = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[3]/div[2]/button/label");
	
	//about us update
	By about_us_update = By.xpath("//button[@class='primary-btn fix-gr-bg']");
	
	
	
	/*
	 * 
	 * 
	 * 
	 */
	public void Header_menu_manager() throws InterruptedException, AWTException {
		
		//Front setting
		driver.findElement(Front_settings).click();
		Thread.sleep(1000);
		
		//header menu manager
		driver.findElement(header_menu_manager).click();
		Thread.sleep(1000);
		System.out.println("Successfully enter header menu manager");
		
		//home edit
		driver.findElement(Home_edit).click();
		Thread.sleep(3000);
		
		//home update
		driver.findElement(Home_update).click();
		Thread.sleep(3000);
		System.out.println("Successfully update");
		
		//home_about
		driver.findElement(about_edit).click();
		Thread.sleep(2000);
		
		//about_update
		driver.findElement(About_update).click();
		Thread.sleep(2000);
		System.out.println("Successfully update");
		
//		// home_about
//		driver.findElement(course_edit).click();
//		Thread.sleep(3000);
//
//		// about_update
//		driver.findElement(Home_update).click();
//		Thread.sleep(3000);
//
//		// home_about
//		driver.findElement(news_edit).click();
//		Thread.sleep(2000);
//
//		// about_update
//		driver.findElement(news_update).click();
//		Thread.sleep(2000);
//
//		// home_about
//		driver.findElement(contact_edit).click();
//		Thread.sleep(2000);
//
//		// about_update
//		driver.findElement(contact_update).click();
//		Thread.sleep(2000);
//
//		// home_about
//		driver.findElement(login_edit).click();
//		Thread.sleep(2000);
//
//		// about_update
//		driver.findElement(login_update).click();
//		Thread.sleep(2000);
	}
		
		/*
		 * 
		 * 
		 * Homepage
		 * 
		 */
		public void clickhomepagebutton() throws InterruptedException, AWTException {
//			//Front setting
//			driver.findElement(Front_settings).click();
//			Thread.sleep(1000);
			
		driver.findElement(Home_page).click();
		Thread.sleep(1000);
		System.out.println("Successfully enter home page");
		
		//upload file
		// using robot class 
		
		//click browse
		driver.findElement(browse).click();
		Thread.sleep(1000);
		
		String filePath2=upload.getFilePath("home-banner1.jpg");
		upload.JPEGUpload(filePath2);
		Thread.sleep(1000);
		
		//save
		//click browse
		driver.findElement(save).click();
		Thread.sleep(1000);
		System.out.println("Successfully saved news heading");
		
		}
		
		/*
		 * 
		 * 
		 * News Heading
		 * 
		 * 
		 */
		
		public void clickNewsHeadingButton() throws InterruptedException {
			
//			//Front setting
//			driver.findElement(Front_settings).click();
//			Thread.sleep(1000);
			
			//news heading
			driver.findElement(news_heading).click();
			Thread.sleep(1000);
			System.out.println("Successfully enter news heading");
			
			//news heading update
			driver.findElement(new_heading_update).click();
			Thread.sleep(1000);
			
			//news category
			driver.findElement(news_category).click();
			Thread.sleep(1000);
			
			//category name
			driver.findElement(category_name).sendKeys("category 1");
			Thread.sleep(1000);
			
			//save
			driver.findElement(category_name_save).click();
			Thread.sleep(1000);
			System.out.println("Successfully saved news category");
			
			/*
			 * action select
			 */
			
			//select
			driver.findElement(select).click();
			Thread.sleep(1000);
			
			//edit
			driver.findElement(edit).click();
			Thread.sleep(1000);
			
			//save
			driver.findElement(category_name_save).click();
			Thread.sleep(3000);
			System.out.println("Successfully update news category");
			
//			//select
//			driver.findElement(select).click();
//			Thread.sleep(1000);
//			
//			//delete
//			driver.findElement(delete).click();
//			Thread.sleep(2000);
//			
//			//cancel_delete
//			driver.findElement(delete_cancel).click();
//			Thread.sleep(1000);
//			
//			//select
//			driver.findElement(select).click();
//			Thread.sleep(1000);
//			
//			//select
//			driver.findElement(delete).click();
//			Thread.sleep(2000);
//			
//			//confirm delete
//			driver.findElement(delete_confirm).click();
//			Thread.sleep(1000);
		}
		
			/*
			 * 
			 * 
			 * News List
			 * 
			 * 
			 */
			
			public void clickNews_List_Button() throws InterruptedException, AWTException {
				
				//Front setting
				driver.findElement(Front_settings).click();
				Thread.sleep(1000);
				
				//news_list
				driver.findElement(news_list).click();
				Thread.sleep(1000);
				System.out.println("Successfully enter news list");
				
				//news_list_title
				driver.findElement(news_list_title).sendKeys("news_list_title 1");
				Thread.sleep(1000);
				
				//news_list_select
				driver.findElement(news_list_select).click();
				Thread.sleep(1000);
				
				//specific_newsList_select
				driver.findElement(specific_newsList_select).click();
				Thread.sleep(1000);
				
				//newsList_image
				driver.findElement(newsList_image).click();
				Thread.sleep(1000);
				
				String filePath2=upload.getFilePath("home-banner1.jpg");
				upload.JPEGUpload(filePath2);
				Thread.sleep(1000);
				
				/*
				 * 
				 */
				
				// upload notice time

				String month = "MARCH 2022";

				driver.findElement(clicknewslistkdate).click(); // click calender
				Thread.sleep(2000);

				while (true) {
					String text = driver.findElement(NewslistmonthYear).getText(); // locator is month and year

					if (text.equals(month)) {
						break;
					} else {

						driver.findElement(Newslistsitebar).click(); // locator of site arrow.you have to change it
					}
				}

				driver.findElement(Newslistdatepicker).click(); // locator of all date.
				Thread.sleep(2000);
				
				//newsList_DEscription
				driver.findElement(newsList_DEscription).sendKeys("It is a long established fact that a reader will be distracted by "
						+ "the readable content of a page when looking at its layout.");
				Thread.sleep(1000);
				
				//NewsList_Save
				driver.findElement(NewsList_Save).click();
				Thread.sleep(1000);
				System.out.println("Successfully saved news list");
				
			}
			
			/*
			 * 
			 * course_heading
			 * 
			 */
		
			
			public void clickCourseHeadingButton() throws InterruptedException {
				
				//course_heading
				driver.findElement(course_heading).click();
				Thread.sleep(1000);
				System.out.println("Successfully enter course heading");
				
				//course_heading_update
				driver.findElement(course_heading_update).click();
				Thread.sleep(1000);
				
			}
			
			/*
			 * 
			 * course_details_heading
			 * 
			 */
			
			public void clickCourseDetailsHeadingButton() throws InterruptedException {
				
				//course_heading
				driver.findElement(course_details_heading).click();
				Thread.sleep(1000);
				System.out.println("Successfully enter course heading details");
				
				//course_heading_update
				driver.findElement(course_details_heading_update).click();
				Thread.sleep(1000);
				
			}
			
			/*
			 * 
			 * 
			 * course_category
			 * 
			 * 
			 */
			
			public void clickCourseCategoryButton() throws InterruptedException, AWTException {
				
//				//Front setting
//				driver.findElement(Front_settings).click();
//				Thread.sleep(1000);
				
				//course_category
				driver.findElement(course_category).click();
				Thread.sleep(1000);
				System.out.println("Successfully enter course category");
				
				//Category_name
				driver.findElement(Category_name).sendKeys("Course Category 1");
				Thread.sleep(1000);
				
				//course_category_browse
				driver.findElement(course_category_browse).click();
				Thread.sleep(1000);
				
				String filePath2=upload.getFilePath("home-banner1.jpg");
				upload.JPEGUpload(filePath2);
				Thread.sleep(1000);
				
				//course_category_save
				driver.findElement(course_category_save).click();
				Thread.sleep(1000);
				System.out.println("Successfully saved course category");
				
				/*
				 * 
				 * course_category_select
				 * 
				 */
				
				//course_category_select
				driver.findElement(course_category_select).click();
				Thread.sleep(1000);
				
				//course_category_edit
				driver.findElement(course_category_edit).click();
				Thread.sleep(2000);
				
				//course_category_save
				driver.findElement(course_category_save).click();
				Thread.sleep(1000);
				System.out.println("Successfully saved course category");
				
//				//course_category_select
//				driver.findElement(course_category_select).click();
//				Thread.sleep(1000);
//				
//				//course_category_delete
//				driver.findElement(course_category_delete).click();
//				Thread.sleep(2000);
//				
//				//course_category_delete_cancel
//				driver.findElement(course_category_delete_cancel).click();
//				Thread.sleep(2000);
//				
//				//course_category_select
//				driver.findElement(course_category_select).click();
//				Thread.sleep(1000);
//				
//				//course_category_delete
//				driver.findElement(course_category_delete).click();
//				Thread.sleep(2000);
//				
//				//course_category_delete_confirm
//				driver.findElement(course_category_delete_confirm).click();
//				Thread.sleep(2000);
				
			}
			
			public void clickCourseListButton() throws InterruptedException, AWTException {
				
				//course_list
				driver.findElement(course_list).click();
				Thread.sleep(1000);
				System.out.println("Successfully enter course list");
				
				//course_list_title
				driver.findElement(course_list_title).sendKeys("Course List 1");
				Thread.sleep(1000);
				
				//course_list_course_category
				driver.findElement(course_list_course_category).click();
				Thread.sleep(1000);
				
				//course_list_specific_course_category
				driver.findElement(course_list_specific_course_category).click();
				Thread.sleep(1000);
				
				//course_category_browse
				driver.findElement(course_list_browse).click();
				Thread.sleep(1000);
				
				String filePath2=upload.getFilePath("home-banner1.jpg");
				upload.JPEGUpload(filePath2);

				//course_category_save
				driver.findElement(course_list_save).click();
				Thread.sleep(1000);
				System.out.println("Successfully saved course list");
				
				/*
				 * 
				 * action select
				 * 
				 */
				//course_list_select
				driver.findElement(course_list_select).click();
				Thread.sleep(1000);
				
				//course_list_edit
				driver.findElement(course_list_edit).click();
				Thread.sleep(1000);
				
				//Course_list_update_save
				driver.findElement(Course_list_update_save).click();
				Thread.sleep(1000);
				System.out.println("Successfully update course list");
				
//				//course_list_select
//				driver.findElement(course_list_select).click();
//				Thread.sleep(1000);
//				
//				//course_list_delete
//				driver.findElement(course_list_delete).click();
//				Thread.sleep(1000);
//				
//				//course_list_delete_cancel
//				driver.findElement(course_list_delete_cancel).click();
//				Thread.sleep(1000);
//				
//				//course_list_select
//				driver.findElement(course_list_select).click();
//				Thread.sleep(1000);
//				
//				//course_list_delete
//				driver.findElement(course_list_delete).click();
//				Thread.sleep(1000);
//				
//				//course_list_delete_confirm
//				driver.findElement(course_list_delete_confirm).click();
//				Thread.sleep(1000);
			}
			
			public void clickTestimonialButton() throws InterruptedException, AWTException {
				
//				//Front setting
//				driver.findElement(Front_settings).click();
//				Thread.sleep(1000);
				
				//testimonial
				driver.findElement(testimonial).click();
				Thread.sleep(1000);
				System.out.println("Successfully enter testimonial");
				
				//testimonial_name
				driver.findElement(testimonial_name).sendKeys("Martin Alex");
				Thread.sleep(1000);
				
				//testimonial_designation
				driver.findElement(testimonial_designation).sendKeys("CEO");
				Thread.sleep(1000);
				
				//testimonial_institution_name
				driver.findElement(testimonial_institution_name).sendKeys("Aesthetic");
				Thread.sleep(1000);
				
				/*
				 * 
				 * testimonial_browse
				 * 
				 */
				
				//testimonial_browse
				driver.findElement(testimonial_browse).click();
				Thread.sleep(1000);

				String filePath=upload.getFilePath("1.jpg");
				upload.profilePicUpload(filePath);
				Thread.sleep(1000);

				
				/*
				 * 
				 */
				
				//testimonial_description
				driver.findElement(testimonial_description).sendKeys("Loren Ipsumn");
				Thread.sleep(1000);
				
				//testimonial_add
				driver.findElement(testimonial_add).click();
				Thread.sleep(1000);
				
				/*
				 * action select
				 */
				
				//testimonial_select
				driver.findElement(testimonial_select).click();
				Thread.sleep(1000);
				
				//testimonial_view
				driver.findElement(testimonial_view).click();
				Thread.sleep(1000);
				
				//testimonial_view_cancel
				driver.findElement(testimonial_view_cancel).click();
				Thread.sleep(1000);
				
				//testimonial_select
				driver.findElement(testimonial_select).click();
				Thread.sleep(1000);
				
				//testimonial_edit
				driver.findElement(testimonial_edit).click();
				Thread.sleep(1000);
				
				//testimonial_update
				driver.findElement(testimonial_update).click();
				Thread.sleep(1000);
				System.out.println("Successfully saved testimonial");
				
//				//testimonial_select
//				driver.findElement(testimonial_select).click();
//				Thread.sleep(1000);
//				
//				//testimonial_delete
//				driver.findElement(testimonial_delete).click();
//				Thread.sleep(1000);
//				
//				//testimonial_delete_cancel
//				driver.findElement(testimonial_delete_cancel).click();
//				Thread.sleep(1000);
//				
//				//testimonial_select
//				driver.findElement(testimonial_select).click();
//				Thread.sleep(1000);
//				
//				//testimonial_delete
//				driver.findElement(testimonial_delete).click();
//				Thread.sleep(1000);
//				
//				//testimonial_delete_confirm
//				driver.findElement(testimonial_delete_confirm).click();
//				Thread.sleep(1000);
				
			}
			
			public void clickContactPageButton() throws InterruptedException, AWTException {
				
				//Front setting
				driver.findElement(Front_settings).click();
				Thread.sleep(1000);
				
				//contact_page
				driver.findElement(contact_page).click();
				Thread.sleep(1000);
				System.out.println("Successfully enter contact page");
				
				//contact_page_view
				driver.findElement(contact_page_view).click();
				Thread.sleep(1000);
				
				//contact_page_view_cancel
				driver.findElement(contact_page_view_cancel).click();
				Thread.sleep(1000);
				
				//contact_page_edit
				driver.findElement(contact_page_edit).click();
				Thread.sleep(1000);
				
//				//contact_page_browse
//				driver.findElement(contact_page_browse).click();
//				Thread.sleep(1000);
				
				/*
				 * 
				 */
//				//upload file
//				Robot rb= new Robot(); 
//				rb.delay(2000);
//
//				// put path to file in a clipboard 
//				StringSelection ss= new StringSelection("C:\\Users\\X1 carbon  i5--7\\Desktop\\image\\1.jpg");
//				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
//
//				// ctrl v 
//				rb.keyPress(KeyEvent.VK_CONTROL);// press on control key
//				rb.keyPress(KeyEvent.VK_V);// press on v
//
//				rb.keyRelease(KeyEvent.VK_CONTROL);
//				rb.keyRelease(KeyEvent.VK_V);
//
//				// enter key 
//				rb.keyPress(KeyEvent.VK_ENTER);// press on enter key
//				rb.keyRelease(KeyEvent.VK_ENTER);
//				Thread.sleep(3000);
				
				//contact_page_update
				driver.findElement(contact_page_update).click();
				Thread.sleep(1000);
				
			}
			
			public void clickAboutusButton() throws InterruptedException {
				
//				//Front setting
//				driver.findElement(Front_settings).click();
//				Thread.sleep(1000);
				
				//about_us
				driver.findElement(about_us).click();
				Thread.sleep(1000);
				System.out.println("Successfully enter about us");
				
				//about_us_view
				driver.findElement(about_us_view).click();
				Thread.sleep(1000);
				
				//about_us_view_cancel
				driver.findElement(about_us_view_cancel).click();
				Thread.sleep(1000);
				
				//about_us_edit
				driver.findElement(about_us_edit).click();
				Thread.sleep(1000);
				
//				//about_us_image1
//				driver.findElement(about_us_image1).click();
//				Thread.sleep(1000);
				
				/*
				 * 
				 */
//				//upload file
//				Robot rb= new Robot(); 
//				rb.delay(2000);
//
//				// put path to file in a clipboard 
//				StringSelection ss= new StringSelection("C:\\Users\\X1 carbon  i5--7\\Desktop\\image\\1.jpg");
//				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
//
//				// ctrl v 
//				rb.keyPress(KeyEvent.VK_CONTROL);// press on control key
//				rb.keyPress(KeyEvent.VK_V);// press on v
//
//				rb.keyRelease(KeyEvent.VK_CONTROL);
//				rb.keyRelease(KeyEvent.VK_V);
//
//				// enter key 
//				rb.keyPress(KeyEvent.VK_ENTER);// press on enter key
//				rb.keyRelease(KeyEvent.VK_ENTER);
//				Thread.sleep(3000);
				
				/*
				 * 
				 * 
				 * 
				 */
				
//				//about_us_image2
//				driver.findElement(about_us_image2).click();
//				Thread.sleep(1000);
				
				/*
				 * 
				 */
//				//upload file
//				Robot rb= new Robot(); 
//				rb.delay(2000);
//
//				// put path to file in a clipboard 
//				StringSelection ss= new StringSelection("C:\\Users\\X1 carbon  i5--7\\Desktop\\image\\1.jpg");
//				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
//
//				// ctrl v 
//				rb.keyPress(KeyEvent.VK_CONTROL);// press on control key
//				rb.keyPress(KeyEvent.VK_V);// press on v
//
//				rb.keyRelease(KeyEvent.VK_CONTROL);
//				rb.keyRelease(KeyEvent.VK_V);
//
//				// enter key 
//				rb.keyPress(KeyEvent.VK_ENTER);// press on enter key
//				rb.keyRelease(KeyEvent.VK_ENTER);
//				Thread.sleep(3000);
				
				//about_us_update
				driver.findElement(about_us_update).click();
				Thread.sleep(1000);
				System.out.println("Successfully saved about us");
				System.out.println("Checkout from Fronts Settings");
				
				
				
			}
			
		
	}


