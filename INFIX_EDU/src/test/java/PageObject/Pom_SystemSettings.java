package PageObject;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Common_Method.CommonMethod;


public class Pom_SystemSettings {
	WebDriver driver;
	CommonMethod cm= new CommonMethod();
	public Pom_SystemSettings (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	By SystemSetting = By.xpath("//div[contains(text(),'System Settings')]");
		
	
	//General Settings
	
	//General Settings
		By GeneralSettings = By.xpath("//*[@id=\"subMenusystemSettings\"]/li[1]/a");
		
		//Edit
		By GeneralSettings_EditButton = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[2]/div[1]/div[2]/a");
		By GeneralSettings_UpdateButton = By.xpath("//*[@id=\"main-content\"]/section[2]/div/form/div/div/div/div[7]/div/button");
		
		//upload image(Change Logo) 
		By GeneralSettings_UploadButton = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div[1]/div/form/div/div[2]/div/label");
		By GeneralSettings_SaveButton = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div[1]/div/form/div/div[3]/button");
		
		//Upload image (Fav icon)
		By GeneralSettings_UploadButton2 = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div[2]/div/form/div/div[2]/div/label");
		By GeneralSettings_SaveButton2 = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div[2]/div/form/div/div[3]/button");
		
		//subject layout
		By GeneralSettings_SubjectLayout = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[2]/div[2]/div/div/div/div[18]/div/div[2]/div/img");
		By GeneralSettings_SubjectLayoutCrossButton = By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]");
	
		
		@FindBy(xpath="//*[@id=\"sidebar_menu\"]/li[26]/a/div[2]")  
		WebElement systemSettings;
		
		@FindBy(xpath="//*[@id=\"subMenusystemSettings\"]/li[1]/a")
		WebElement generalSettings;
		
		@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div/div[2]/div[1]/div[2]/a")
		WebElement edit;
		
		
		// promotion without exam
		
		@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/form/div/div/div/div[3]/div[1]/div/div[2]/label")
		WebElement disabled;  
		
		@FindBy(xpath="//*[@id=\"relationMother\"]")
		WebElement enabled;
		
		@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/form/div/div/div/div[7]/div/button")
		WebElement update;  //*[@id="main-content"]/section[2]/div/form/div/div/div/div[7]/div/button
		
		@FindBy(xpath="//*[@id=\"subMenuStudent\"]/li[9]/a")
		WebElement studentPromote;
		
		// subject attendance layout
		
		@FindBy(xpath="//body/div[2]/div/section[2]/div/form/div/div/div/div[4]/div[1]/div/div[1]/input")
		WebElement attendanceenableInput;
		
		@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/form/div/div/div/div[4]/div[1]/div/div[1]/label")
		WebElement attendanceenableLabel;
		
		@FindBy(xpath="//body/div[2]/div/section[2]/div/form/div/div/div/div[4]/div[1]/div/div[2]/input")
		WebElement attendancedisableinput;
		
		@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/form/div/div/div/div[4]/div[1]/div/div[2]/label")
		WebElement attendancedisableLabel;
		
		@FindBy(xpath="//*[@id=\"frm-example\"]/div[2]/div/button")
		WebElement submitForSubject;
		
		//multiple roll number
		
		@FindBy(xpath="//*[@id=\"roll_yes\"]")
		WebElement rollEnableInput;
		
		@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/form/div/div/div/div[2]/div[4]/div/div[1]/label")
		WebElement rollEnableLabel;
		
		@FindBy(xpath="//*[@id=\"roll_no\"]")
		WebElement rollDisableInput;
		
		@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/form/div/div/div/div[2]/div[4]/div/div[2]/label")
		WebElement rollDisableLabel;
		
		
		
		By system_setting =By.xpath("//*[@id=\"sidebar_menu\"]/li[26]/a/div[2]");
		
		//general setting
		By general_setting = By.xpath("(//a[contains(text(),'General Settings')])[1]");
		
		//general_setting_ edit
		By general_setting_edit = By.xpath("(//a[@class='primary-btn small fix-gr-bg '])");
		
		//subject attendance layout1
		By subject_attendance_layout1 = By.xpath("//*[@id=\"main-content\"]/section[2]/div/form/div/div/div/div[4]/div[1]/div/div[1]/label");
		
		//subject attendance layout2
		By subject_attendance_layout2 = By.xpath("//*[@id=\"main-content\"]/section[2]/div/form/div/div/div/div[4]/div[1]/div/div[2]/label");
		
		//general setting update
		By general_setting_update = By.xpath("(//button[@class='primary-btn fix-gr-bg submit'])");

		
		
		
		
		
		
		
	public void generalsetting() throws InterruptedException, AWTException {
		CommonMethod upload = new CommonMethod();
		
//		driver.findElement(SystemSetting).click();
//		Thread.sleep(2000);
//		driver.findElement(GeneralSettings).click();
//		Thread.sleep(2000);
//		//driver.findElement(SystemSettings).click();
//		Thread.sleep(2000);
//		driver.findElement(GeneralSettings_EditButton).click();
//		Thread.sleep(2000);
		
		multipleRollNumber();
		
		promotion();
		
		subjectAttendance();
		
		driver.get("http://pos.rishfa.com/general-settings");
		Thread.sleep(1000);
		
		
		clicksystem_settingButton();
		
		driver.get("http://pos.rishfa.com/general-settings");
		Thread.sleep(1000);
		
//		driver.findElement(GeneralSettings_UpdateButton).click();
//		Thread.sleep(2000);
		//upload image(Logo) 
		driver.findElement(GeneralSettings_UploadButton).click();
		Thread.sleep(2000);
		
		String filePath2=upload.getFilePath("php.png");
		upload.smalliconUpload(filePath2);
		Thread.sleep(1000);
		
		driver.findElement(GeneralSettings_SaveButton).click();
		Thread.sleep(2000);
		
		//Upload image(fav icon)
		driver.findElement(GeneralSettings_UploadButton2).click();
		String filePath=upload.getFilePath("php.png");
		upload.smalliconUpload(filePath);
		Thread.sleep(1000);
		driver.findElement(GeneralSettings_SaveButton2).click();
		Thread.sleep(2000);
		
		//Subject Layout
		//driver.findElement(GeneralSettings_SubjectLayout).click();
		//Thread.sleep(2000);
		//driver.findElement(GeneralSettings_SubjectLayoutCrossButton).click();
		//Thread.sleep(2000);
	}
	
	
	
	
	//Optional Subject
	
	By OptionalSubject = By.xpath("//*[@id=\"subMenusystemSettings\"]/li[2]/a");
	
	//Select Class
	By OptionalSubject_AllClass = By.xpath("//label[contains(text(),'All Select')]");
	By OptionalSubject_GPAAbove = By.xpath("//*[@id=\"exam_mark_main\"]");
	By OptionalSubject_SaveButton = By.xpath("//*[@id=\"select_subject_div\"]/button");
	
	
	//For Class 4
	//Edit
	
	By OptionalSubject_SelectButton = By.xpath("//*[@id=\"table_id\"]/tbody/tr[1]/td[4]/div/div/button");
	By OptionalSubject_EditButton = By.xpath("//*[@id=\"table_id\"]/tbody/tr[1]/td[4]/div/div/div/a[1]");
	By OptionalSubject_UpdateButton = By.xpath("//*[@id=\"select_subject_div\"]/button");
	
	
	//Delete
	By OptionalSubject_Delete1 = By.xpath("//*[@id=\"table_id\"]/tbody/tr[1]/td[4]/div/div/div/a[2]");
	By OptionalSubject_Delete2 = By.xpath("/html/body/div[2]/div/section[3]/div/div[2]/div/div[1]/div/div/div[2]/div[2]/a/button");

	
	public void optionalsubject() throws InterruptedException {
		
		
//		driver.findElement(SystemSetting).click();
//		Thread.sleep(2000);
		
		
		driver.findElement(OptionalSubject).click();
		Thread.sleep(2000);
		driver.findElement(OptionalSubject_AllClass).click();
		Thread.sleep(2000);
		driver.findElement(OptionalSubject_GPAAbove).sendKeys("1.00");
		Thread.sleep(2000);
		driver.findElement(OptionalSubject_SaveButton).click();
		Thread.sleep(2000);
		
		//Edit
		driver.findElement(OptionalSubject_SelectButton).click();
		Thread.sleep(2000);
		driver.findElement(OptionalSubject_EditButton).click();
		Thread.sleep(2000);
		driver.findElement(OptionalSubject_UpdateButton).click();
		Thread.sleep(2000);
		
		//Delete
		driver.findElement(OptionalSubject_SelectButton).click();
		Thread.sleep(2000);
		driver.findElement(OptionalSubject_Delete1).click();
		Thread.sleep(2000);
		driver.findElement(OptionalSubject_Delete2).click();
		Thread.sleep(2000);
	}
	
	
	
	//Academic Year
	
		By AcademicYear = By.xpath("//*[@id=\"subMenusystemSettings\"]/li[3]/a");
		
		//Add Academic year
		By Academic_Year = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[1]/div/div/input[1]");
		By Academic_YearTitle = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[2]/div/div/input[1]");
		
		//Calendar Starting Date
		By Academic_StartingDate1 = By.xpath("//*[@id=\"startDate\"]");
		By Academic_CalendarRightArrow = By.xpath("/html/body/div[5]/div[1]/table/thead/tr[1]/th[3]");
		By GeneralSettings_Date = By.xpath("/html/body/div[5]/div[1]/table/tbody/tr[2]/td[1]");
		
		//Calendar Ending Date
		By Academic_EndingDate = By.xpath("//input[@placeholder='Ending Date*']");
		By Academic_CalendarRightArrow2 = By.xpath("/html/body/div[5]/div[1]/table/thead/tr[1]/th[3]");
		By Academic_Date2 = By.xpath("/html/body/div[5]/div[1]/table/tbody/tr[3]/td[3]");
		
		//
		By Academic_SaveButton = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[6]/div/button");
	
		//Searchbar
		By Academic_Searchbar = By.xpath("//*[@id=\"table_id_filter\"]/label/input");
		
		By Academic_SelecButton = By.xpath("//*[@id=\"table_id\"]/tbody/tr[1]/td[5]/div/button");
		
		By Academic_Edit = By.xpath("//*[@id=\"table_id\"]/tbody/tr[1]/td[5]/div/div/a[1]");
		
		By Academic_UpdateButton = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div[2]/div[1]/div/div/form/div/div/div[6]/div/button");
		
		By Academic_Delete1 = By.xpath("//*[@id=\"table_id\"]/tbody/tr[1]/td[5]/div/div/a[2]");
		
		By Academic_Delete2 = By.xpath("/html/body/div[2]/div/section[2]/div/div[2]/div[2]/div[2]/div/div[2]/div/div/div[2]/div[2]/button[2]");
		
		public void acadmicyearselect() throws InterruptedException {
			driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul[2]/li/div")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul[2]/li/div/ul/li[2]")).click();
			Thread.sleep(2000);
			
			
		}
		
		public void academicyear() throws InterruptedException {
		
		driver.findElement(SystemSetting).click();
		Thread.sleep(2000);
	
		driver.findElement(AcademicYear).click();
		Thread.sleep(2000);
		
		driver.findElement(Academic_Year).sendKeys("2023");
		Thread.sleep(2000);
		driver.findElement(Academic_YearTitle).sendKeys("Academic Year");
		Thread.sleep(2000);
		
		//starting date
		driver.findElement(Academic_StartingDate1).click();
		Thread.sleep(2000);
		
		
		for(int i=1;i<5;i++)

		{
			
			driver.findElement(Academic_CalendarRightArrow).click();
			
		}
		
		Thread.sleep(3000);
		
//		driver.findElement(Academic_Date).click();
//		Thread.sleep(2000);
		
		//End date
		driver.findElement(Academic_EndingDate).click();
		Thread.sleep(2000);
		for(int i=1;i<8;i++)

		{
			
			driver.findElement(Academic_CalendarRightArrow2).click();
			
			
		}
		
		Thread.sleep(2000);
		driver.findElement(Academic_Date2).click();
		Thread.sleep(2000);
		
		
		driver.findElement(Academic_SaveButton).click();
		Thread.sleep(4000);
		
		acadmicyearselect();
		Thread.sleep(4000);
		
		//Edit
		
		driver.findElement(Academic_Searchbar).sendKeys("2023");
		Thread.sleep(4000);
		
		driver.findElement(Academic_SelecButton).click();
		Thread.sleep(4000);
		
		driver.findElement(Academic_Edit).click();
		Thread.sleep(4000);
		
		driver.findElement(Academic_UpdateButton).click();
		Thread.sleep(4000);
		
		driver.findElement(Academic_Searchbar).sendKeys("2023");
		Thread.sleep(4000);
		
		driver.findElement(Academic_SelecButton).click();
		Thread.sleep(4000);
		
		driver.findElement(Academic_Delete1).click();
		Thread.sleep(4000);
		
		driver.getWindowHandle();
		driver.findElement(Academic_Delete2).click();
		Thread.sleep(4000);
		
	}
	



	//Holiday
	By Holiday = By.xpath("//body/div[2]/nav[1]/ul[1]/li[26]/ul[1]/li[4]/a[1]");
	
	By HolidayDate = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[1]/div/div/input");
	
	//Holiday Date Edit
	
	By Holiday_FromDate = By.xpath("//*[@id=\"event_from_date\"]");
	By Holiday_CalendarArrowButton1 = By.xpath("//body[1]/div[5]/div[1]/table[1]/thead[1]/tr[1]/th[3]");
	By Holiday_CalendarDateButton1 = By.xpath("/html/body/div[5]/div[1]/table/tbody/tr[3]/td[3]");
	
	By Holiday_Todate = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[3]/div[1]/div/input");
	By Holiday_CalendarArrowButton2 = By.xpath("/html/body/div[5]/div[1]/table/thead/tr[1]/th[3]");
	By Holiday_CalendarDateButton2 = By.xpath("/html/body/div[5]/div[1]/table/tbody/tr[2]/td[5]");
	
	By Holiday_TestDescription = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[4]/div/div/textarea");
	
	//Browse File 
	By Holiday_BrowseFile = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[5]/div[2]/button/label");
	
	//Save Button 
	By Holiday_SaveButton = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[6]/div/button");
	
	
	By Holiday_Searchbar = By.xpath("//*[@id=\"table_id_filter\"]/label/input");
	
	//Action
	By Holiday_ActionPlusButton = By.xpath("//*[@id=\"table_id\"]/tbody/tr/td[1]");
	By Holiday_SelectButton = By.xpath("//*[@id=\"table_id\"]/tbody/tr/td[7]/div/button");
	
	//Edit 
	By Holiday_EditButton = By.xpath("//*[@id=\"table_id\"]/tbody/tr/td[7]/div/div/a[1]");
	By Holiday_UpdateButton = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div[2]/div[1]/div/div/form/div/div/div[6]/div/button");
	
	//System Settings Download
	By Holiday_SystemSettingsDownload = By.xpath("//*[@id=\"table_id\"]/tbody/tr/td[7]/div/div/a[3]");
	
	//Delete
	By Holiday_Delete = By.xpath("//*[@id=\"table_id\"]/tbody/tr/td[7]/div/div/a[2]");
	By Holiday_Delete2 = By.xpath("/html/body/div[3]/div/div/div[2]/div[2]/a/button");
	


	public void holiday() throws InterruptedException, AWTException {
		
		CommonMethod upload = new CommonMethod();
		
//		driver.findElement(SystemSetting).click();
//		Thread.sleep(2000);
////		
		driver.findElement(Holiday).click();
		Thread.sleep(2000);
		
		driver.findElement(HolidayDate).sendKeys("Test Holiday");
		Thread.sleep(2000);
		
		driver.findElement(Holiday_FromDate).click();
		Thread.sleep(2000);
		
		for(int i=0; i<5;i++) {
			
			driver.findElement(Holiday_CalendarArrowButton1).click();
			
		}
		Thread.sleep(2000);
		
		driver.findElement(Holiday_CalendarDateButton1).click();
		Thread.sleep(2000);
		
		
		
		
		driver.findElement(Holiday_Todate).click();
		Thread.sleep(2000);
		
		for (int i=0; i<8; i++) {
			
			driver.findElement(Holiday_CalendarArrowButton2).click();
		}
		
		Thread.sleep(2000);
		
		driver.findElement(Holiday_CalendarDateButton2).click();
		Thread.sleep(2000);
		
		driver.findElement(Holiday_TestDescription).sendKeys("Test Description");
		Thread.sleep(2000);
		
		driver.findElement(Holiday_BrowseFile).click();
		Thread.sleep(2000);
		
		String filePath2=upload.getFilePath("home-banner1.jpg");
		upload.JPEGUpload(filePath2);
		Thread.sleep(1000);
		
		driver.findElement(Holiday_SaveButton).click();
		Thread.sleep(2000);
		
		
		//Edit
		driver.findElement(Holiday_Searchbar).sendKeys("Test Holiday");
		
		driver.findElement(Holiday_ActionPlusButton).click();
		Thread.sleep(2000);
		driver.findElement(Holiday_SelectButton).click();
		Thread.sleep(2000);
		driver.findElement(Holiday_EditButton).click();
		Thread.sleep(2000);
		driver.findElement(Holiday_UpdateButton).click();
		Thread.sleep(2000);
		
		//systemSettings
		driver.findElement(Holiday_ActionPlusButton).click();
		Thread.sleep(3000);
		driver.findElement(Holiday_SelectButton).click();
		Thread.sleep(2000);
		driver.findElement(Holiday_SystemSettingsDownload).click();
		Thread.sleep(4000);
		
		//Delete
		//driver.findElement(ActionPlusButton).click();
		//Thread.sleep(3000);
		driver.findElement(Holiday_Searchbar).sendKeys("Test Holiday");
		Thread.sleep(2000);
		
		driver.findElement(Holiday_SelectButton).click();
		Thread.sleep(2000);
		driver.findElement(Holiday_Delete).click();
		Thread.sleep(2000);
		driver.findElement(Holiday_Delete2).click();
		
	}
	
	///SystemSettings>Manage Currency
		By ManageCurrency = By.xpath("//*[@id=\"subMenusystemSettings\"]/li[5]/a");
		//Manage Currency > Add Currency
		By Currency_Name  = By.xpath("//body/div[2]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]");
		By Currency_Code = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[2]/div/div/input");
		By Currency_Symbol = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[3]/div/div/input");
		By Currency_SaveCurrencyButton = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[4]/div/button");
		
		///SystemSettings>Manage Currency>Edit 
		By Currency_Search = By.xpath("//*[@id=\"table_id_filter\"]/label/input");
		By Currency_Action = By.xpath("//*[@id=\"table_id\"]/tbody/tr/td[5]/div/button");
		By Currency_Edit = By.xpath("//*[@id=\"table_id\"]/tbody/tr/td[5]/div/div/a[1]");
		By Currency_UpdateButton = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[4]/div/button");
		
	   ///SystemSettings>Manage Currency>Delete
		By Currency_Delete = By.xpath("//*[@id=\"table_id\"]/tbody/tr/td[5]/div/div/a[2]");
		By Currency_Delete2 = By.xpath("/html/body/div[2]/div/section[2]/div/div/div[2]/div[2]/div/div[121]/div/div/div[2]/div[2]/a/button");
		
				
	public void manage_currency() throws InterruptedException {
		//Manage Currency
		//Add Currency
		
//		driver.findElement(SystemSetting).click();
//		Thread.sleep(2000);
//		
		driver.findElement(ManageCurrency).click();
		Thread.sleep(2000);
		driver.findElement(Currency_Name).sendKeys("Test Currency");
		Thread.sleep(2000);
		driver.findElement(Currency_Code).sendKeys("123");
		Thread.sleep(2000);
		driver.findElement(Currency_Symbol).sendKeys("T");
		Thread.sleep(2000);
		driver.findElement(Currency_SaveCurrencyButton).click();
		Thread.sleep(3000);
		
		//Edit
		driver.findElement(Currency_Search).sendKeys("Test");
		Thread.sleep(2000);
		driver.findElement(Currency_Action).click();
		Thread.sleep(2000);
		driver.findElement(Currency_Edit).click();
		Thread.sleep(2000);
		driver.findElement(Currency_UpdateButton).click();
		Thread.sleep(2000);
		
		//Delete
		driver.findElement(Currency_Search).sendKeys("Test");
		Thread.sleep(2000);
		driver.findElement(Currency_Action).click();
		Thread.sleep(2000);
		driver.findElement(Currency_Delete).click();
		Thread.sleep(2000);
		driver.findElement(Currency_Delete2).click();
		Thread.sleep(2000);
	
	}
	
	
	//Weekend
		By Weekend = By.xpath("//*[@id=\"subMenusystemSettings\"]/li[6]/a");
		By Weekend_ActionButton = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div/div[2]/div/table/tbody/tr[1]/td[3]/label/span");
		
	
	
	public void weekend() throws InterruptedException {
	
//		driver.findElement(SystemSetting).click();
//		Thread.sleep(2000);
//		
		//Weekend
		driver.findElement(Weekend).click();
		Thread.sleep(2000);
		driver.findElement(Weekend_ActionButton).click();
		Thread.sleep(2000);
	
		driver.findElement(Weekend_ActionButton).click();
		Thread.sleep(2000);
	
	}

	//Language
			By Language_Language = By.xpath("//*[@id=\"subMenusystemSettings\"]/li[14]/a");
			By Language_Name = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[1]/div/div/input");
			By Language_Code = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[2]/div/div/input");
			By Language_Native = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[3]/div/div/input");
			By Language_SaveLanguage = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[5]/div/button");
	
	
	
	//Language Settings
		By LanguageSettings = By.xpath("//*[@id=\"subMenusystemSettings\"]/li[7]/a");
		By SelectLanguage1 = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[1]/div/div/div");
		By SelectLanguage2 = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[1]/div/div/div/ul/li[2]");
		By SaveLanguage = By.xpath("/html/body/div[2]/div/section[2]/div/div/div[1]/div/div/form/div/div/div[2]/div/button");
		
		//Language Action
		By LanguageSettings_Action = By.xpath("//*[@id=\"default_table\"]/tbody/tr[1]/td[1]");
		By LanguageSettings_DefaultButton = By.xpath("//*[@id=\"default_table\"]/tbody/tr[2]/td/ul/li/span[2]/a[1]");
		By LanguageSettings_Setup = By.xpath("//*[@id=\"default_table\"]/tbody/tr[2]/td/ul/li/span[2]/a[2]");
		By LanguageSettings_SelectModule = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div/form/div/div[1]/div/div/span");
		By LanguageSettings_Academics = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div/form/div/div[1]/div/div/ul/li[2]");
		By LanguageSettings_UpdateButton = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div/form/div/div[2]/div/div/div/button");
		
		
		public void languageselect() {
			driver.findElement(By.xpath("//*[@id=\"default_table_paginate\"]/span/a[2]")).click();
			
			int size = driver.findElements(By.xpath("//*[@id=\"default_table\"]/tbody/tr")).size();
			
			for(int i=1; i<=size; i++ ) {
				String text =driver.findElement(By.xpath("//*[@id=\"default_table\"]/tbody/tr["+i+"]")).getText();
				if(text.matches("TEST LANGUAGE"));
				System.out.println(text);
			
		}
		}
		
		public void languagesettings() throws InterruptedException {
		
//			driver.findElement(SystemSetting).click();
//			Thread.sleep(2000);
			
			driver.findElement(Language_Language).click();
			Thread.sleep(2000);
			driver.findElement(Language_Name).sendKeys("Test Language");
			Thread.sleep(2000);
			driver.findElement(Language_Code).sendKeys("00");
			Thread.sleep(2000);
			driver.findElement(Language_Native).sendKeys("TL Language");
			Thread.sleep(2000);
			driver.findElement(Language_SaveLanguage).click();
			Thread.sleep(2000);
			
			driver.findElement(LanguageSettings).click();
			Thread.sleep(2000);
			
			languageselect();
			Thread.sleep(2000);
			
			
//		//SystemSettings>Language Settings
//		driver.findElement(LanguageSettings).click();
//		Thread.sleep(2000);
//		driver.findElement(SelectLanguage1).click();
//		Thread.sleep(2000);
//		driver.findElement(SelectLanguage2).click();
//		Thread.sleep(2000);
//		driver.findElement(SaveLanguage).click();
//		Thread.sleep(2000);
//		
//		//SystemSettings Action
//		driver.findElement(LanguageSettings_Action).click();
//		Thread.sleep(2000);
//		driver.findElement(LanguageSettings_DefaultButton).click();
//		Thread.sleep(2000);
//		
//		//Language Setup
//		driver.findElement(LanguageSettings_Action).click();
//		Thread.sleep(2000);
//		driver.findElement(LanguageSettings_Setup).click();
//		Thread.sleep(2000);
//		driver.findElement(LanguageSettings_SelectModule).click();
//		Thread.sleep(2000);
//		driver.findElement(LanguageSettings_Academics).click();
//		Thread.sleep(2000);
//		driver.findElement(LanguageSettings_UpdateButton).click();
//		Thread.sleep(2000);
		
		}
		
		
		//Dashboard Settings
		
		By DashboardSettings = By.xpath("//*[@id=\"subMenusystemSettings\"]/li[8]/a");
		By DashboardSettings_WebsiteButton = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/form/div/div[1]/div/div/label/span");
		By DashboardSettings_UpdateButton = By.xpath("//*[@id=\"search_promote\"]");
		By DashboardSettings_Dashboard = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[2]/div/div/div[1]/div[2]/label/span");
		By DashboardSettings_Style = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[2]/div/div/div[1]/div[4]/label/span");
		By DashboardSettings_Report = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[2]/div/div/div[2]/div[2]/label/span");
		By DashboardSettings_SwitchLanguage = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[2]/div/div/div[2]/div[4]/label/span");
		
		
		
	
	public void dashboard() throws InterruptedException {
		
//		driver.findElement(SystemSetting).click();
//		Thread.sleep(2000);
//		
		//Dashboard Settings
		driver.findElement(DashboardSettings).click();
		Thread.sleep(2000);
		//Inactive
		driver.findElement(DashboardSettings_Dashboard).click();
		Thread.sleep(2000);
		driver.findElement(DashboardSettings_SwitchLanguage).click();
		Thread.sleep(3000);
		driver.findElement(DashboardSettings_Report).click();
		Thread.sleep(2000);
		driver.findElement(DashboardSettings_Style).click();
		Thread.sleep(2000);
		driver.findElement(DashboardSettings_WebsiteButton).click();
		Thread.sleep(2000);
		driver.findElement(DashboardSettings_UpdateButton).click();
		Thread.sleep(2000);
		
		//Active
		driver.findElement(DashboardSettings_Dashboard).click();
		Thread.sleep(2000);
		driver.findElement(DashboardSettings_SwitchLanguage).click();
		Thread.sleep(3000);
		driver.findElement(DashboardSettings_Report).click();
		Thread.sleep(2000);
		driver.findElement(DashboardSettings_Style).click();
		Thread.sleep(2000);
		driver.findElement(DashboardSettings_WebsiteButton).click();
		Thread.sleep(2000);
		driver.findElement(DashboardSettings_UpdateButton).click();
		Thread.sleep(2000);

	}
	
	//Payment Settings
		By PaymentSettings = By.xpath("//*[@id=\"subMenusystemSettings\"]/li[9]/a");
		By PaymentSettings_Cash = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/form/div/div[1]/div/table/tbody/tr[1]/td[1]/div/label");
		By PaymentSettings_Cheaque = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/form/div/div[1]/div/table/tbody/tr[2]/td[1]/div/label");
		By PaymentSettings_Bank = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/form/div/div[1]/div/table/tbody/tr[3]/td[1]/div/label");
		By PaymentSettings_PayPal = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/form/div/div[1]/div/table/tbody/tr[4]/td[1]/div/label");
		By PaymentSettings_Stripe = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/form/div/div[1]/div/table/tbody/tr[5]/td[1]/div/label");
		By PaymentSettings_PayStack = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/form/div/div[1]/div/table/tbody/tr[6]/td[1]/div/label");
		By PaymentSettings_Wallet = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/form/div/div[1]/div/table/tbody/tr[7]/td[1]/div/label");
		
		By PaymentSettingsSelectPaymentGatewayUpdateButton = By.xpath("//*[@id=\"PayPal\"]/form/div/div[2]/div/button");
	
	
	
	
	
	
	public void paymentsetting() throws InterruptedException {
	
//		driver.findElement(SystemSetting).click();
//		Thread.sleep(2000);
//		
	//PaymentSetting
		//Deselect
		driver.findElement(PaymentSettings).click();
		Thread.sleep(2000);
		driver.findElement(PaymentSettings_Bank).click();
		Thread.sleep(2000);
		driver.findElement(PaymentSettings_Cash).click();
		Thread.sleep(2000);
		driver.findElement(PaymentSettings_Cheaque).click();
		Thread.sleep(2000);
		driver.findElement(PaymentSettings_PayPal).click();
		Thread.sleep(2000);
		driver.findElement(PaymentSettings_PayStack).click();
		Thread.sleep(2000);
		driver.findElement(PaymentSettings_Stripe).click();
		Thread.sleep(2000);
		driver.findElement(PaymentSettings_Wallet).click();
		Thread.sleep(2000);
		
		//UpdateButton
		driver.findElement(PaymentSettingsSelectPaymentGatewayUpdateButton).click();
		Thread.sleep(2000);
		
		//select
		driver.findElement(PaymentSettings).click();
		Thread.sleep(2000);
		driver.findElement(PaymentSettings_Bank).click();
		Thread.sleep(2000);
		driver.findElement(PaymentSettings_Cash).click();
		Thread.sleep(2000);
		driver.findElement(PaymentSettings_Cheaque).click();
		Thread.sleep(2000);
		driver.findElement(PaymentSettings_PayPal).click();
		Thread.sleep(2000);
		driver.findElement(PaymentSettings_PayStack).click();
		Thread.sleep(2000);
		driver.findElement(PaymentSettings_Stripe).click();
		Thread.sleep(2000);
		driver.findElement(PaymentSettings_Wallet).click();
		Thread.sleep(2000);
		
		//UpdateButton
		driver.findElement(PaymentSettingsSelectPaymentGatewayUpdateButton).click();
		Thread.sleep(2000);

	}
	
	//Email Settings
		By EmailSettings = By.xpath("//*[@id=\"subMenusystemSettings\"]/li[10]/a");
		By EmailSettings_SMTP = By.xpath("//*[@id=\"main-content\"]/section[3]/div/div/div/ul/li[1]/a");
		By EmailSettings_SelectStatus = By.xpath("//*[@id=\"email_settings1\"]/div/div/div/div[4]/div[3]/div/div");
		By EmailSettings_SelectStatusEnable = By.xpath("//*[@id=\"email_settings1\"]/div/div/div/div[4]/div[3]/div/div/ul/li[2]");
		By EmailSettings_UpdateButton = By.xpath("//*[@id=\"email_settings1\"]/div/div/div/div[5]/div/button");
		By EmailSettings_PhpSettings = By.xpath("//*[@id=\"main-content\"]/section[3]/div/div/div/ul/li[2]/a");
		By EmailSettings_SendTestMail = By.xpath("//*[@id=\"email_settings1\"]/button");
		//EmailSettings
		By EmailSettings_SelectStatus2 = By.xpath("//*[@id=\"email_settings1\"]/div/div/div/div[1]/div[3]/div/div");
		By EmailSettings_SelectStatusEnable2 = By.xpath("//*[@id=\"email_settings1\"]/div/div/div/div[1]/div[3]/div/div");
		By EmailSettings_UpdateButton2 = By .xpath("//*[@id=\"email_settings1\"]/div/div/div/div[2]/div/button");
		
	
	
	
		
	public void emailsettings() throws InterruptedException {	
		
//		driver.findElement(SystemSetting).click();
//		Thread.sleep(2000);
		
//		//EmailSettings
		driver.findElement(EmailSettings).click();
		Thread.sleep(2000);
		driver.findElement(EmailSettings_SMTP).click();
		Thread.sleep(2000);
		driver.findElement(EmailSettings_SelectStatus).click();
		Thread.sleep(2000);
		driver.findElement(EmailSettings_SelectStatusEnable).click();
		Thread.sleep(2000);
		driver.findElement(EmailSettings_UpdateButton).click();
		Thread.sleep(2000);
		driver.findElement(EmailSettings_SendTestMail).click();
		Thread.sleep(2000);
		
		driver.findElement(EmailSettings_PhpSettings).click();
		Thread.sleep(2000);
		driver.findElement(EmailSettings_SelectStatus2).click();
		Thread.sleep(2000);
		driver.findElement(EmailSettings_SelectStatusEnable2).click();
		Thread.sleep(2000);
		driver.findElement(EmailSettings_UpdateButton2).click();
		Thread.sleep(3000);
		driver.findElement(EmailSettings_SendTestMail).click();
		Thread.sleep(2000);
		
	}
	
	
	//Sms Settings
		By SmsSettings = By.xpath("//*[@id=\"subMenusystemSettings\"]/li[11]/a");
		By SmsSettings_SelectaSmsService = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div/ul/li[1]/a");
		By SmsSettings_SelectSmsServiceDropdown = By.xpath("//*[@id=\"select_a_service\"]/div/div/div[1]/div/div");
		By SmsSettings_Twilio = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div/ul/li[2]/a");
		By SmsSettings_Twilio_UpdateBUtton = By.xpath("//*[@id=\"twilio_form\"]/div/div[2]/div/button");
		By SmsSettings_MSG91 = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div/ul/li[3]/a");
		By SmsSettings_MSG91_UpdateBUtton = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div/ul/li[3]/a");
		By SmsSettings_TextLocal = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div/ul/li[4]/a");
		By SmsSettings_TextLocal_UpdateButton= By.xpath("//*[@id=\"textlocal_form\"]/div/div[2]/div/button");
		By SmsSettings_Africatalking = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div/ul/li[5]/a");
		By SmsSettings_Africatalking_UpdateButton = By.xpath("//body/div[2]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[7]/form[1]/div[1]/div[2]/div[1]/button[1]");
		By SmsSettings_MobileSms = By.xpath("//a[contains(text(),'Mobile SMS')]");
		
	
	
	public void smssettings() throws InterruptedException {
		
		
//		driver.findElement(SystemSetting).click();
//		Thread.sleep(2000);
        
        
		driver.findElement(SmsSettings).click();
		Thread.sleep(2000);
		driver.findElement(SmsSettings_SelectSmsServiceDropdown).click();
		Thread.sleep(2000);
		driver.findElement(SmsSettings_Twilio).click();
		Thread.sleep(2000);
		driver.findElement(SmsSettings_Twilio_UpdateBUtton).click();
		Thread.sleep(2000);
		driver.findElement(SmsSettings_MSG91).click();
		Thread.sleep(2000);
		driver.findElement(SmsSettings_MSG91_UpdateBUtton).click();
		Thread.sleep(2000);
		driver.findElement(SmsSettings_TextLocal).click();
		Thread.sleep(2000);
		driver.findElement(SmsSettings_TextLocal_UpdateButton).click();
		Thread.sleep(2000);
		driver.findElement(SmsSettings_Africatalking).click();
		Thread.sleep(2000);
		driver.findElement(SmsSettings_Africatalking_UpdateButton).click();
		Thread.sleep(2000);
		driver.findElement(SmsSettings_MobileSms).click();
		Thread.sleep(2000);
		
		
		
	}
	
	//Preloader Settings
		By PreloaderSettings = By.xpath("//*[@id=\"subMenusystemSettings\"]/li[12]/a");
		By PreloaderSettings_PreloaderStyle = By.xpath("//*[@id=\"preloaderStyleDiv\"]/div/div[2]/label/div/div");
		By PreloaderSettings_Update = By.xpath("//*[@id=\"general_info_sbmt_btn\"]");
	
	
	
	public void preloadersettings() throws InterruptedException {
		
		
//		driver.findElement(SystemSetting).click();
//		Thread.sleep(2000);
        
		driver.findElement(PreloaderSettings).click();
		Thread.sleep(2000);
		driver.findElement(PreloaderSettings_PreloaderStyle).click();
		Thread.sleep(2000);
		driver.findElement(PreloaderSettings_Update).click();
		Thread.sleep(2000);
		
	}
	public void language() throws InterruptedException {
		
		
		driver.findElement(SystemSetting).click();
		Thread.sleep(2000);
        
		driver.findElement(Language_Language).click();
		Thread.sleep(2000);
		driver.findElement(Language_Name).sendKeys("Test Language");
		Thread.sleep(2000);
		driver.findElement(Language_Code).sendKeys("00");
		Thread.sleep(2000);
		driver.findElement(Language_Native).sendKeys("TL Language");
		Thread.sleep(2000);
		driver.findElement(Language_SaveLanguage).click();
		Thread.sleep(2000);
		
		
	
	
	}
	
	
		
		
		//Utilities
		By Utilities = By.xpath("//*[@id=\"subMenusystemSettings\"]/li[17]/a");
		By ClearCache = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/a");
	
	
	
	public void utilities() throws InterruptedException {
//		driver.findElement(SystemSetting).click();
//		Thread.sleep(2000);
		
		driver.findElement(Utilities).click();
		Thread.sleep(2000);
		driver.findElement(ClearCache).click();
		Thread.sleep(2000);
		System.out.println("Checkout from System Settings");
	}
	
	
public void promotion() throws InterruptedException, AWTException {
		
//		systemSettings.click();
//		Thread.sleep(1000);
//		
//		generalSettings.click();
//		Thread.sleep(1000);
//		
		edit.click();
		Thread.sleep(1000);
		
		if(enabled.isSelected()) {
			
			disabled.click();
			
			System.out.println("Entered in IF");
			Thread.sleep(1000);
		}
		
		else {
			
			driver.findElement(By.xpath("//*[@id=\"main-content\"]/section[2]/div/form/div/div/div/div[3]/div[1]/div/div[1]/label")).click();
			Thread.sleep(1000);
			
			System.out.println("Entered in ELSE");
			Thread.sleep(1000);
		}
		
		update.click();
		Thread.sleep(1000);
		
		
		//System.out.println("driver= " + d);
		
		driver.get("http://pos.rishfa.com/student-promote");
		Thread.sleep(1000);
		
		POM_Student_Info student= new POM_Student_Info(driver);
		
		student.studentPromote();
		
//		d.get("http://pos.rishfa.com/student-promote");
//		Thread.sleep(1000);
		
		
		
		
	}
	
	
	public void subjectAttendance() throws InterruptedException {
		
		systemSettings.click();
		Thread.sleep(1000);
		
		generalSettings.click();
		Thread.sleep(1000);
		
		edit.click();
		Thread.sleep(1000);
		
		if(attendanceenableInput.isSelected()) {
			
			attendancedisableLabel.click();
			Thread.sleep(1000);
			driver.getWindowHandle();
			
			driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/button")).click();
			Thread.sleep(1000);
			
			update.click();
			Thread.sleep(2000);
			
			driver.get("http://pos.rishfa.com/subject-wise-attendance");
			Thread.sleep(1000);
			
			POM_Student_Info newAttendance = new POM_Student_Info(driver);
			newAttendance.subjectAttendanceSearch();
			
			cm.scroll();
			
			
			int size= driver.findElements(By.xpath("//body/div[2]/div/section[2]/div/div[3]/div/div[4]/div/form/div[1]/table/tbody/tr/td[5]/label/span")).size();
			
			
			int i=1;
			
			while(i<=size) {
				
				WebElement attendance=driver.findElement(By.xpath("//body/div[2]/div/section[2]/div/div[3]/div/div[4]/div/form/div[1]/table/tbody/tr["+i+"]/td[5]/label/span"));
				
				attendance.click();
				
			
				
				i++;
			}
			
			Thread.sleep(1000);
			
			submitForSubject.click();
			Thread.sleep(1000);
			
			
			
		}
		
		else {
			
			attendanceenableLabel.click();
			Thread.sleep(2000);
			driver.getWindowHandle();
			
			driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/button")).click();
			Thread.sleep(2000);
			
			update.click();
			Thread.sleep(2000);
			
			POM_Student_Info newAttendance = new POM_Student_Info(driver);
			
			newAttendance.subjectWiseAttendance();
			
		}
		
		
		driver.get("http://pos.rishfa.com/general-settings");
		Thread.sleep(1000);
		
		
		
		
	}
	
	public void multipleRollNumber() throws InterruptedException {
		systemSettings.click();
		Thread.sleep(1000);
		
		generalSettings.click();
		Thread.sleep(1000);
		
		edit.click();
		Thread.sleep(1000);
		
		if(rollEnableInput.isSelected()) {
			
			rollDisableLabel.click();
			Thread.sleep(1000);
			
			update.click();
			Thread.sleep(2000);
			
			driver.get("http://pos.rishfa.com/general-settings");
			Thread.sleep(1000);
			
			
		}
		
		else {
			
			rollEnableLabel.click();
			Thread.sleep(1000);
			
			update.click();
			Thread.sleep(2000);
			
			driver.get("http://pos.rishfa.com/student-view/2");
			Thread.sleep(1000);
			
			POM_Student_Info roll = new POM_Student_Info(driver);
			
			roll.addRecord();
			
			systemSettings.click();
			Thread.sleep(1000);
			
			generalSettings.click();
			Thread.sleep(1000);
			
//			edit.click();
//			Thread.sleep(1000);
			
		}
		
		
		
		
	}
	
	
	public void clicksystem_settingButton() throws InterruptedException, AWTException {
		
		POM_Fees_Collection collection = new POM_Fees_Collection( driver);
		POM_Fees fees = new POM_Fees( driver);
		//system_setting
//		driver.findElement(system_setting).click();
//		Thread.sleep(1000);
//		
//		//general_setting
//		driver.findElement(general_setting).click();
//		Thread.sleep(1000);
		
		//general_setting_edit
		driver.findElement(general_setting_edit).click();
		Thread.sleep(1000);
		
		if(driver.findElement(By.xpath("//*[@id=\"fees_enable\"]")).isSelected()) {
			
			driver.findElement(By.xpath("//*[@id=\"main-content\"]/section[2]/div/form/div/div/div/div[4]/div[2]/div/div[2]/label")).click();
			Thread.sleep(1000);
			
			//general_setting_update
			driver.findElement(general_setting_update).click();
			Thread.sleep(1000);
			
			collection.clickFeesGroupButton();
			collection.clickfees_typeButton();
			collection.clickfees_masterButton();
			collection.clickfees_discountButton();
			collection.clickcollection_feesButton();
			collection.clicksearch_fees_paymentButton();
			collection.clicksearch_fees_dueButton();
			collection.clickfees_collection_bank_paymentButton();
			collection.clickfees_carryforwardButton();
			collection.clickcollection_reportButton();
			
			
		}
		
		else if(driver.findElement(By.xpath("//*[@id=\"fees_disable\"]")).isSelected()) {
			
			driver.findElement(By.xpath("//*[@id=\"main-content\"]/section[2]/div/form/div/div/div/div[4]/div[2]/div/div[1]/label")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//button[@class='primary-btn fix-gr-bg']")).click();
			Thread.sleep(1000);
			//general_setting_update
			driver.findElement(general_setting_update).click();
			Thread.sleep(1000);
			
			fees.clickFeesGroupButton();
			fees.clickfees_typeButton();
			fees.ClickfeesInvoice_addFeesButton();
			fees.clickFeesinvoiceButton();
			fees.clickBank_paymentButton();
			fees.clickfees_invoice_settingButton();
			fees.clickreportButton();
			
			
		}
		
		
	}


}
