package PageObject;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Common_Method.CommonMethod;

public class POM_Communicate {
	WebDriver driver = null;
	
	public POM_Communicate(WebDriver driver) {
		
		this.driver = driver;
	}
	
	CommonMethod upload = new CommonMethod();
	
	//Notice board
	//communicate
	By communicate = By.xpath("//div[contains(text(),'Communicate')]");
	
	//notice Board
	By NoticeBoard = By.xpath("//*[@id=\"subMenuCommunicate\"]/li[1]/a");
	
	//add noticeboard
	By AddNoticeBoard = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div[1]/div[2]/a");
	
	//notice_title
	By notice_title = By.name("notice_title");
	
	//notice_message
	By notice_message = By.name("notice_message");
	
	//check mark publish website
	By checkmark = By.xpath("//label[contains(text(),'Is Published Web Site')]");
	
	// Notice date

	// clickdate
	By clickdate = By.id("notice_date");

	// monthYear
	By monthYear = By.xpath("/html[1]/body[1]/div[5]/div[1]/table[1]/thead[1]/tr[1]/th[2]");

	// sitebar
	By sitebar = By.xpath("//body[1]/div[5]/div[1]/table[1]/thead[1]/tr[1]/th[1]");

	// datepicker
	public int day = 15;
	By datepicker = By.xpath("/html[1]/body[1]/div[5]/div[1]/table[1]/tbody[1]/tr/td[contains(text()," + day + ")]");
	
	
	// Publish date

	// clickdate
	By clickdate2 = By.id("publish_on");

	// monthYear
	By monthYear2 = By.xpath("/html[1]/body[1]/div[5]/div[1]/table[1]/thead[1]/tr[1]/th[2]");

	// sitebar
	By sitebar2 = By.xpath("//body[1]/div[5]/div[1]/table[1]/thead[1]/tr[1]/th[1]");

	// datepicker
	public int day2 = 15;
	By datepicker2 = By.xpath("/html[1]/body[1]/div[5]/div[1]/table[1]/tbody[1]/tr/td[contains(text()," + day2 + ")]");
	
	//message to
	//parent
	By parent = By.xpath("//label[contains(text(),'Parents')]");
	
	//student
	By student = By.xpath("//label[contains(text(),'Student')]");
	
	//save content
	By SaveContent = By.xpath("//button[@class='primary-btn fix-gr-bg submit']");
	
	
	/*
	 * 
	 * 
	 * Edit
	 * 
	 */
	//edit
	By edit = By.xpath("//*[@id=\"accordion\"]/div[1]/div[1]/div/a[2]/button");
	
	//Update
	By update = By.xpath("//*[@id=\"main-content\"]/section[2]/div/form/div/div/div/div[2]/div/button");
	
	/*
	 * 
	 * Delete
	 * 
	 */
	
	//delete
	By delete = By.xpath("//*[@id=\"accordion\"]/div[2]/div[1]/div/a[3]/button");
	
	//cancel
	By cancel = By.xpath("//*[@id=\"showDetaildModalBody\"]/div[2]/button");
	
	//delete button
	By DeleteButton = By.xpath("//*[@id=\"showDetaildModalBody\"]/div[2]/a/button");
	
	/*
	 * 
	 * 
	 * Send email/sms
	 * 
	 * 
	 */
	
	//send email/sms
	By SendEmail_SMS = By.xpath("//a[contains(text(),'Send Email / Sms')]");
	
	//email_sms_title
	By email_sms_title = By.name("email_sms_title");
	
	//send email
	By SendEmail = By.xpath("//label[contains(text(),'Email')]");
	//label[contains(text(),'Email')]
	
	//description
	By description = By.name("description");
	
	//email/sms student
	By Email_SMS_Student = By.xpath("//label[contains(text(),'Student')]");
	
	// email/sms parent
	By Email_SMS_Parent = By.xpath("//label[contains(text(),'Parents')]");
	
	//email/sms update
	By Email_SMS_update = By.xpath("//button[@class='primary-btn fix-gr-bg']");
	
	/*
	 * 
	 * 
	 * Email/SMS Log
	 * 
	 * 
	 */
	
	//email/sms log
	By Email_SMS_Log = By.xpath("//*[@id=\"subMenuCommunicate\"]/li[3]/a");
	
	//add send mail
	By Add_send_mail = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div/div[1]/div/a");
	
	/*
	 * 
	 * 
	 * Event
	 * 
	 * 
	 */
	
	//event
	By event = By.cssSelector("a[href$='event']");
	
	//event name
	By EventName = By.name("event_title");
	
	//For whom
	By whom = By.cssSelector("div[class*='nice-select w-100 bb niceSelect form-control']");
	
	//specific member
	By specificmember = By.cssSelector("li[data-value*='Student']");
	
	//event_location
	By event_location = By.name("event_location");
	
	/*
	 * 
	 */
	
	// click From date
	By clickEventkdate = By.id("event_from_date");

	// monthYear
	By EventmonthYear = By.xpath("/html[1]/body[1]/div[5]/div[1]/table[1]/thead[1]/tr[1]/th[2]");

	// sitebar
	By Eventsitebar = By.xpath("//body[1]/div[5]/div[1]/table[1]/thead[1]/tr[1]/th[1]");

	// datepicker
	public int eventday = 15;
	By Eventdatepicker = By.xpath("/html[1]/body[1]/div[5]/div[1]/table[1]/tbody[1]/tr/td[contains(text()," + eventday + ")]");
	
	
	// click To date
	By clickEventkdate2 = By.id("event_to_date");

	// monthYear
	By EventmonthYear2 = By.xpath("/html[1]/body[1]/div[5]/div[1]/table[1]/thead[1]/tr[1]/th[2]");

	// sitebar
	By Eventsitebar2 = By.xpath("//body[1]/div[5]/div[1]/table[1]/thead[1]/tr[1]/th[3]");

	// datepicker
	public int eventday2 = 15;
	By Eventdatepicker2 = By
			.xpath("/html[1]/body[1]/div[5]/div[1]/table[1]/tbody[1]/tr/td[contains(text()," + eventday2 + ")]");

	/*
	 * 
	 */

	// event_des
	By event_des = By.name("event_des");

	// browse
	By browse = By.xpath("//label[contains(text(),'Browse')]");

	// save event
	By SaveEvent = By.cssSelector("button[class*='primary-btn fix-gr-bg submit']");

	/*
	 * 
	 * 
	 * 
	 */

	/*
	 * 
	 * 
	 * 
	 * 
	 */
	// clickNoticeBoardButton
	public void clickNoticeBoardButton() throws InterruptedException {
		
		driver.findElement(communicate).click();
		Thread.sleep(1000);

		// clickNoticeBoardButton
		driver.findElement(NoticeBoard).click();
		Thread.sleep(1000);
		System.out.println("Successfully enter in noticeboard");

		// clickAddNoticeBoardButton
		driver.findElement(AddNoticeBoard).click();
		Thread.sleep(1000);

		// clicknotice_titleButton
		driver.findElement(notice_title).sendKeys("Notice 1");
		Thread.sleep(1000);

		// clicknotice_messageButton

		driver.findElement(notice_message)
				.sendKeys("It is a long established fact that a reader will be distracted by the readable "
						+ "content of a page when looking at its layout.");
		Thread.sleep(1000);

		// clickcheckmarkButton
		driver.findElement(checkmark).click();
		Thread.sleep(1000);

		// upload notice time

		String month = "MARCH 2022";

		driver.findElement(clickdate).click(); // click calender
		Thread.sleep(2000);

		while (true) {
			String text = driver.findElement(monthYear).getText(); // locator is month and year

			if (text.equals(month)) {
				break;
			} else {

				driver.findElement(sitebar).click(); // locator of site arrow.you have to change it
			}
		}

		driver.findElement(datepicker).click(); // locator of all date.
		Thread.sleep(2000);

		// upload notice time

		String month2 = "NOVEMBER 2022";

		driver.findElement(clickdate2).click(); // click calender
		Thread.sleep(2000);

		while (true) {
			String text = driver.findElement(monthYear2).getText(); // locator is month and year

			if (text.equals(month2)) {
				break;
			} else {

				driver.findElement(sitebar2).click(); // locator of site arrow.you have to change it
			}
		}

		driver.findElement(datepicker2).click(); // locator of all date.
		Thread.sleep(2000);
		
		int size = driver.findElements(By.xpath("//*[@id=\"main-content\"]/section[2]/div/form/div/div/div/div[1]/div/div[2]/div[3]/div/label[1]")).size();
		
		System.out.println("Size is = " + size);
		
		int i = 1;
		while(i <= size) {
			if(driver.findElement(By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div["+i+"]/input")).isSelected()) {
			
			// clickStudentButton
			driver.findElement(SaveContent).click();
			Thread.sleep(1000);
			}
		
			else {
			
			driver.findElement(By.xpath("//*[@id=\"main-content\"]/section[2]/div/form/div/div/div/div[1]/div/div[2]/div[3]/div["+i+"]/label[1]")).click();

			}
			
			i++;
			
		}
		
		driver.findElement(SaveContent).click();
		Thread.sleep(1000);
		
		System.out.println("Notices Saved Successfully");
		/*
		 * 
		 * edit
		 * 
		 */
		// edit
		driver.findElement(edit).click();
		Thread.sleep(1000);

		// update
		driver.findElement(update).click();
		Thread.sleep(1000);
		System.out.println("Notices Update Successfully");
//
//		/*
//		 * 
//		 * Delete
//		 * 
//		 */
//		// delete
//		driver.findElement(delete).click();
//		Thread.sleep(3000);
//
//		// cancel
//		driver.findElement(cancel).click();
//		Thread.sleep(1000);
//
//		// delete
//		driver.findElement(delete).click();
//		Thread.sleep(3000);
//
//		// DeleteButton
//		driver.findElement(DeleteButton).click();
//		Thread.sleep(1000);
	}
		
	/*
	 * 
	 * 
	 * Send Email/SMS
	 * 	
	 */
	
	//clickEmail/SMSButton
		public void clickEmail_SMSButton() throws InterruptedException {
			
//			driver.findElement(communicate).click();
//			Thread.sleep(1000);
			
			//SendEmail_SMS
			driver.findElement(SendEmail_SMS).click();
			Thread.sleep(1000);
			System.out.println("Successfully enter in send email sms");
			
			//email_sms_title
			driver.findElement(email_sms_title).sendKeys("email title 1");
			Thread.sleep(1000);
			
			//SendEmail
			driver.findElement(SendEmail).click();
			Thread.sleep(1000);
			
			//description
			driver.findElement(description).sendKeys("It is a long established fact that a reader will be distracted by "
					+ "the readable content of a page when looking at its layout.");
			Thread.sleep(1000);
			
			int size = driver.findElements(By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div/label[1]")).size();
			System.out.println("Size is = "+size);
			int i =1;
			while(i<=size) {
			
			if(driver.findElement(By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div["+i+"]/input[1]")).isSelected()){
				
				//Email_SMS_update
				driver.findElement(Email_SMS_update).click();
				Thread.sleep(1000);
				
			}
			
			else {
				
				driver.findElement(By.xpath("//*[@id=\"group_email_sms\"]/div/div/div["+i+"]/label")).click();
				
				
				}
			i++;
			}
			
			//Email_SMS_update
			driver.findElement(Email_SMS_update).click();
			Thread.sleep(1000);
			
			System.out.println("Email send Successfully");

		}
		
		/*
		 * 
		 * 
		 * Email/sms log
		 * 
		 * 
		 */
		
		// clickEmail/SMS_logButton
		public void clickEmail_SMS_logButton() throws InterruptedException {

//			driver.findElement(communicate).click();
//			Thread.sleep(1000);

			// SendEmail_SMS
			driver.findElement(Email_SMS_Log).click();
			Thread.sleep(1000);
			System.out.println("Successfully enter in email sms log");
			
			//Add_send_mail
			driver.findElement(Add_send_mail).click();
			Thread.sleep(1000);

			// email_sms_title
			driver.findElement(email_sms_title).sendKeys("email title 1");
			Thread.sleep(2000);

			// SendEmail
			driver.findElement(SendEmail).click();
			Thread.sleep(2000);

			// description
			driver.findElement(description)
					.sendKeys("It is a long established fact that a reader will be distracted by "
							+ "the readable content of a page when looking at its layout.");
			Thread.sleep(1000);

			int size = driver.findElements(By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div/label[1]")).size();
			System.out.println("Size is = "+size);
			int i =1;
			while(i<=size) {
			
			if(driver.findElement(By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div["+i+"]/input[1]")).isSelected()){
				
				//Email_SMS_update
				driver.findElement(Email_SMS_update).click();
				Thread.sleep(1000);
				
			}
			
			else {
				
				driver.findElement(By.xpath("//*[@id=\"group_email_sms\"]/div/div/div["+i+"]/label")).click();
				
				
				}
			i++;
			}
			
			//Email_SMS_update
			driver.findElement(Email_SMS_update).click();
			Thread.sleep(1000);
			System.out.println("Email send Successfully");
			
		}
			public void clickEventButton() throws InterruptedException, AWTException {
				
//				driver.findElement(communicate).click();
//				Thread.sleep(1000);
				//clickevent
				driver.findElement(event).click();
				Thread.sleep(1000);
				
				System.out.println("Successfully enter in event");
				
				//clickevent
				driver.findElement(EventName).sendKeys("Event title 1");
				Thread.sleep(1000);
				
				//clickevent
				driver.findElement(whom).click();
				Thread.sleep(1000);
				
				//clickevent
				driver.findElement(specificmember).click();
				Thread.sleep(1000);
				
				//clickevent
				driver.findElement(event_location).sendKeys("Panthapath");
				Thread.sleep(1000);
				
				
				
				// upload_date From
				String eventmonth = "MARCH 2022";
				

				driver.findElement(clickEventkdate).click();   //click calender
				Thread.sleep(2000);

				while(true) {
				String text = driver.findElement(EventmonthYear).getText();   //locator is month and year
									
				if(text.equals(eventmonth))
				{
				 break;
				}
					else
					{
									
				driver.findElement(Eventsitebar).click();             //locator of site arrow.you have to change it
					}
				}
								
				driver.findElement(Eventdatepicker).click();   //locator of all date.
				Thread.sleep(2000);
				
				
				
				// upload_date To
				String eventmonth2 = "JANUARY 2023";
				

				driver.findElement(clickEventkdate2).click();   //click calender
				Thread.sleep(2000);

				while(true) {
				String text = driver.findElement(EventmonthYear2).getText();   //locator is month and year
									
				if(text.equals(eventmonth2))
				{
				 break;
				}
					else
					{
									
				driver.findElement(Eventsitebar2).click();             //locator of site arrow.you have to change it
					}
				}
								
				driver.findElement(Eventdatepicker2).click();   //locator of all date.
				Thread.sleep(2000);
				
				/*
				 * 
				 * 
				 */
				
				//event_des
				driver.findElement(event_des).sendKeys("It is a long established fact that a reader will be distracted by the"
						+ " readable content of a page when looking at its layout. ");
				
				/*
				 * 
				 */
				
				//upload file
				// using robot class 
				
				//click browse
				driver.findElement(browse).click();
				Thread.sleep(1000);
				
				//upload image
				String filePath2=upload.getFilePath("home-banner1.jpg");
				upload.JPEGUpload(filePath2);
				Thread.sleep(1000);
				
				//save
				//click browse
				driver.findElement(SaveEvent).click();
				Thread.sleep(1000);
				
				System.out.println("Event Saved Successfully");
				System.out.println("Checkout from Communications");
				
			}

		}
	
	


