package PageObject;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Common_Method.CommonMethod;


public class Pom_StudyMaterials {
	
	WebDriver driver=null;
	
	CommonMethod cm = new CommonMethod();
	
	public Pom_StudyMaterials(WebDriver driver) {
		this.driver=driver;
	}
	
	By StudyMaterials = By.xpath("//*[@id=\"sidebar_menu\"]/li[6]/a");
	
	//Upload Content
	
	By UploadContent = By.xpath("//*[@id=\"subMenuTeacher\"]/li[1]/a");
	
	By UploadContent_ContentTitle = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[1]/div[1]/div/input");
	
	By UploadContent_ContentType1 = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[1]/div[2]/div");
	
	By UploadContent_Assignment = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[1]/div[2]/div/ul/li[2]");
	
	By UploadContent_Syllabus = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[1]/div[2]/div/ul/li[3]");
	
	By UploadContent_OtherDownloads = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[1]/div[2]/div/ul/li[4]");
	
	By UploadContent_AvailableFor = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[1]/div[3]/div/label[2]");
	
	By UploadContent_SelectClass1 = By.xpath("//*[@id=\"contentDisabledDiv\"]/div/div[1]/div/div");
	
	By UploadContent_SelectClass2 = By.xpath("//*[@id=\"contentDisabledDiv\"]/div/div[1]/div/div/ul/li[2]");
	
	By UploadContent_SelectSection1 = By.xpath("//*[@id=\"sectionStudentDiv\"]/div[1]");
	
	By UploadContent_SelectSection2 = By.xpath("//*[@id=\"sectionStudentDiv\"]/div[1]/ul/li[2]");
	
	By UploadContent_Date = By.xpath("//*[@id=\"upload_date\"]");
	
	By UploadContent_DateRightArrow = By.xpath("/html/body/div[5]/div[1]/table/thead/tr[1]/th[3]");
	
	By UploadContent_DateNumber = By.xpath("/html/body/div[5]/div[1]/table/tbody/tr[2]/td[1]");
	
	By UploadContent_FileUploadBrowseButton = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[5]/div[2]/button/label");
	
	By UploadContent_UploadContentButton = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[6]/div/button");
	
	
	//UloadContent>Assignment List
	By UploadContent_Searchbar = By.xpath("//*[@id=\"table_id_filter\"]/label/input");
	
	By UploadContent_SelectButton = By.xpath("//*[@id=\"table_id\"]/tbody/tr/td[7]/div/button");
	
	By UploadContent_ViewButton = By.xpath("//*[@id=\"table_id\"]/tbody/tr/td[7]/div/div/a[1]");
	
	By UploadContent_CrossButton = By.xpath("//*[@id=\"modalSize\"]/div/div[1]/button");
	
	By UploadContent_EditButton = By.xpath("//*[@id=\"table_id\"]/tbody/tr/td[7]/div/div/a[2]");
	
	By UploadContentButton2 = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[6]/div/button");
	
	By UploadContent_DownloadButton = By.xpath("//*[@id=\"table_id\"]/tbody/tr/td[7]/div/div/a[4]");
	
	By UploadContent_Delete1 = By.xpath("//*[@id=\"table_id\"]/tbody/tr[1]/td[7]/div/div/a[3]");
	
	By UploadContent_Delete2 = By.xpath("/html/body/div[2]/div/section[2]/div/div/div[2]/div[2]/div/div[1]/div/div/div[2]/div[2]/button[2]");
	
	
	
	
	
	
	
	public void uploadcontent() throws InterruptedException, AWTException {
		
		
		//upload content with Assignment
		driver.findElement(StudyMaterials).click();
		Thread.sleep(2000);
		System.out.println("Successfully Enter Assignment");
		
		driver.findElement(UploadContent).click();
		Thread.sleep(2000);
		System.out.println("Successfully Enter Upload content");
		
		driver.findElement(UploadContent_ContentTitle).sendKeys("Testing Content");
		Thread.sleep(2000);
		
		
		
		driver.findElement(UploadContent_ContentType1).click();
		Thread.sleep(2000);
		
		
		driver.findElement(UploadContent_Assignment).click();
		Thread.sleep(2000);
		
		
		driver.findElement(UploadContent_AvailableFor).click();
		Thread.sleep(2000);
		
		driver.findElement(UploadContent_SelectClass1).click();
		Thread.sleep(2000);
		
		driver.findElement(UploadContent_SelectClass2).click();
		Thread.sleep(2000);
		
		driver.findElement(UploadContent_SelectSection1).click();
		Thread.sleep(2000);
		
		driver.findElement(UploadContent_SelectSection2).click();
		Thread.sleep(2000);
		
		driver.findElement(UploadContent_Date).click();
		Thread.sleep(2000);
		
		for(int i=1;i<5;i++)

		{
			driver.findElement(UploadContent_DateRightArrow).click();
		}
		
		Thread.sleep(2000);
		
		
		driver.findElement(UploadContent_DateNumber).click();
		Thread.sleep(2000);
		
		driver.findElement(UploadContent_FileUploadBrowseButton).click();
		Thread.sleep(2000);
		
		String filePath=cm.getFilePath("1.jpg");
		cm.profilePicUpload(filePath);
		Thread.sleep(1000);
		
		driver.findElement(UploadContent_UploadContentButton).click();
		Thread.sleep(2000);
		
		
		
		
		//Upload Content > Assignment> For download
		
		driver.findElement(UploadContent_Searchbar).sendKeys("Testing Content");
		Thread.sleep(2000);
		
//		driver.findElement(UploadContent_PlusActionButton).click();
//		Thread.sleep(2000);
		
		driver.findElement(UploadContent_SelectButton).click();
		Thread.sleep(2000);
		
		driver.findElement(UploadContent_DownloadButton).click();
		Thread.sleep(2000);
		
		
		
		
		
		//Upload Content > Assignment>for view
//				driver.findElement(UploadContent_Searchbar).sendKeys("Testing Content");
//				Thread.sleep(2000);
				
				//driver.findElement(UploadContent_PlusActionButton).click();
				//Thread.sleep(2000);
				
				driver.findElement(UploadContent_SelectButton).click();
				Thread.sleep(2000);
				
				driver.findElement(UploadContent_ViewButton).click();
				Thread.sleep(2000);
				
				driver.findElement(UploadContent_CrossButton).click();
				Thread.sleep(2000);
				
				
				//For edit
//				driver.findElement(UploadContent_Searchbar).sendKeys("Testing Content");
//				Thread.sleep(2000);
				
				driver.findElement(UploadContent_SelectButton).click();
				Thread.sleep(2000);
				
				driver.findElement(UploadContent_EditButton).click();
				Thread.sleep(2000);
				
				driver.findElement(UploadContentButton2).click();
				Thread.sleep(2000);
				
//				//For Delete
//				
//				driver.findElement(UploadContent).click();
//				Thread.sleep(2000);
//		
//				driver.findElement(UploadContent_Searchbar).sendKeys("Testing Content");
//				Thread.sleep(2000);
//				
////				driver.findElement(UploadContent_PlusActionButton).click();
////				Thread.sleep(2000);
//				
//				driver.findElement(UploadContent_SelectButton).click();
//				Thread.sleep(2000);
//				
//				driver.findElement(UploadContent_Delete1).click();
//				Thread.sleep(2000);
//				
//				driver.findElement(UploadContent_Delete2).click();
//				Thread.sleep(2000);	
				
				driver.navigate().refresh();
				
				//upload content with Syllabus
//				driver.findElement(StudyMaterials).click();
//				Thread.sleep(2000);
//				
				driver.findElement(UploadContent).click();
				Thread.sleep(2000);
				
				driver.findElement(UploadContent_ContentTitle).sendKeys("Testing Content");
				Thread.sleep(2000);
				
				
				
				driver.findElement(UploadContent_ContentType1).click();
				Thread.sleep(2000);
				
				
				driver.findElement(UploadContent_Syllabus).click();
				Thread.sleep(2000);
				
				
				driver.findElement(UploadContent_AvailableFor).click();
				Thread.sleep(2000);
				
				driver.findElement(UploadContent_SelectClass1).click();
				Thread.sleep(2000);
				
				driver.findElement(UploadContent_SelectClass2).click();
				Thread.sleep(2000);
				
				driver.findElement(UploadContent_SelectSection1).click();
				Thread.sleep(2000);
				
				driver.findElement(UploadContent_SelectSection2).click();
				Thread.sleep(2000);
				
				driver.findElement(UploadContent_Date).click();
				Thread.sleep(2000);
				
				for(int i=1;i<5;i++)

				{
					driver.findElement(UploadContent_DateRightArrow).click();
				}
				
				Thread.sleep(2000);
				
				
				driver.findElement(UploadContent_DateNumber).click();
				Thread.sleep(2000);
				
				driver.findElement(UploadContent_FileUploadBrowseButton).click();
				Thread.sleep(2000);
				
				String filePath2=cm.getFilePath("home-banner1.jpg");
				cm.JPEGUpload(filePath2);
				Thread.sleep(1000);
				
				driver.findElement(UploadContent_UploadContentButton).click();
				Thread.sleep(2000);
				
				
				//Upload Content > Syllabus> For download
				
				driver.findElement(UploadContent_Searchbar).sendKeys("Testing Content");
				Thread.sleep(2000);
				
//				driver.findElement(UploadContent_PlusActionButton).click();
//				Thread.sleep(2000);
				
				driver.findElement(UploadContent_SelectButton).click();
				Thread.sleep(2000);
				
				driver.findElement(UploadContent_DownloadButton).click();
				Thread.sleep(2000);
				
				
				//Upload Content > Syllabus>for view
						//driver.findElement(UploadContent_Searchbar).sendKeys("Testing Content");
						//Thread.sleep(2000);
						
						//driver.findElement(UploadContent_PlusActionButton).click();
						//Thread.sleep(2000);
						
						driver.findElement(UploadContent_SelectButton).click();
						Thread.sleep(2000);
						
						driver.findElement(UploadContent_ViewButton).click();
						Thread.sleep(2000);
						
						driver.findElement(UploadContent_CrossButton).click();
						Thread.sleep(2000);
						
						//For edit
						
						
						//driver.findElement(UploadContent_PlusActionButton).click();
						//Thread.sleep(2000);
						
						driver.findElement(UploadContent_SelectButton).click();
						Thread.sleep(2000);
						
						driver.findElement(UploadContent_EditButton).click();
						Thread.sleep(2000);
						
						driver.findElement(UploadContentButton2).click();
						Thread.sleep(4000);
						
						
						
//						//For Delete	
//						
//						driver.findElement(UploadContent).click();
//						Thread.sleep(2000);
//						
//						driver.findElement(UploadContent_Searchbar).sendKeys("Testing Content");
//						Thread.sleep(2000);
//						
////						driver.findElement(UploadContent_PlusActionButton).click();
////						Thread.sleep(2000);
//						
//						driver.findElement(UploadContent_SelectButton).click();
//						Thread.sleep(2000);
//						
//						driver.findElement(UploadContent_Delete1).click();
//						Thread.sleep(2000);
//						
//						driver.getWindowHandle();
//						driver.findElement(UploadContent_Delete2).click();
//						Thread.sleep(2000);	
						
						
						
				
						//driver.findElement(StudyMaterials).click();
					    //Thread.sleep(2000);
						
						driver.findElement(UploadContent).click();
						Thread.sleep(2000);
						
						driver.findElement(UploadContent_ContentTitle).sendKeys("Testing Content");
						Thread.sleep(2000);
						
						
						
						driver.findElement(UploadContent_ContentType1).click();
						Thread.sleep(2000);
						
						
						driver.findElement(UploadContent_OtherDownloads).click();
						Thread.sleep(2000);
						
						
						driver.findElement(UploadContent_AvailableFor).click();
						Thread.sleep(2000);
						
						driver.findElement(UploadContent_SelectClass1).click();
						Thread.sleep(2000);
						
						driver.findElement(UploadContent_SelectClass2).click();
						Thread.sleep(2000);
						
						driver.findElement(UploadContent_SelectSection1).click();
						Thread.sleep(2000);
						
						driver.findElement(UploadContent_SelectSection2).click();
						Thread.sleep(2000);
						
						driver.findElement(UploadContent_Date).click();
						Thread.sleep(2000);
						
						for(int i=1;i<5;i++)

						{
							driver.findElement(UploadContent_DateRightArrow).click();
						}
						
						Thread.sleep(2000);
						
						
						driver.findElement(UploadContent_DateNumber).click();
						Thread.sleep(2000);
						
						driver.findElement(UploadContent_FileUploadBrowseButton).click();
						Thread.sleep(2000);
						
						String filePath3=cm.getFilePath("home-banner1.jpg");
						cm.JPEGUpload(filePath3);
						Thread.sleep(1000);
						
						driver.findElement(UploadContent_UploadContentButton).click();
						Thread.sleep(2000);
						
						
						
						
						//Upload Content > 'Other Downloads'> For download
						
						driver.findElement(UploadContent_Searchbar).sendKeys("Testing Content");
						Thread.sleep(2000);
						
//						driver.findElement(UploadContent_PlusActionButton).click();
//						Thread.sleep(2000);
						
						driver.findElement(UploadContent_SelectButton).click();
						Thread.sleep(2000);
						
						driver.findElement(UploadContent_DownloadButton).click();
						Thread.sleep(2000);
					
						
						//Upload Content > 'Other Downloads'>for view
//								driver.findElement(UploadContent_Searchbar).sendKeys("Testing Content");
//								Thread.sleep(2000);
//								
								//driver.findElement(UploadContent_PlusActionButton).click();
								//Thread.sleep(2000);
								
								driver.findElement(UploadContent_SelectButton).click();
								Thread.sleep(2000);
								
								driver.findElement(UploadContent_ViewButton).click();
								Thread.sleep(2000);
								
								driver.findElement(UploadContent_CrossButton).click();
								Thread.sleep(2000);
								
								
								//For edit
								
								
								driver.findElement(UploadContent_SelectButton).click();
								Thread.sleep(2000);
								
								driver.findElement(UploadContent_EditButton).click();
								Thread.sleep(2000);
								
								driver.findElement(UploadContentButton2).click();
								Thread.sleep(4000);
								
//								//For Delete
//								
//								driver.findElement(UploadContent).click();
//								Thread.sleep(2000);
//								
//								driver.findElement(UploadContent_Searchbar).sendKeys("Testing Content");
//								Thread.sleep(2000);
//								
////								driver.findElement(UploadContent_PlusActionButton).click();
////								Thread.sleep(2000);
//								
//								driver.findElement(UploadContent_SelectButton).click();
//								Thread.sleep(2000);
//								
//								driver.findElement(UploadContent_Delete1).click();
//								Thread.sleep(2000);
//								
//								driver.getWindowHandle();
//								driver.findElement(UploadContent_Delete2).click();
//								Thread.sleep(2000);	
								System.out.println("Successfully Checkout from Upload content");
	}
	
	
	    //Assignment
		By Assignment = By.xpath("//*[@id=\"subMenuTeacher\"]/li[2]/a");
		
		By Assignment_SearchBar = By.xpath("//*[@id=\"table_id_filter\"]/label/input");
		
		By Assignment_SelectButton = By.xpath("//tbody/tr[1]/td[6]/div[1]/button[1]");
		
		By Assignment_Vielw = By.xpath("//*[@id=\"table_id\"]/tbody/tr[1]/td[6]/div/div/a[1]");
		
		By Assignment_Cross_View = By.xpath("//*[@id=\"modalSize\"]/div/div[1]/button");
		
		By Assignment_Edit = By.xpath("//tbody/tr[1]/td[6]/div[1]/div[1]/a[2]");
		
		By Assignment_UploadContentBUtton = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[6]/div/button");
		
		By Assignment_Delete = By.xpath("//*[@id=\"table_id\"]/tbody/tr[1]/td[6]/div/div/a[3]");
		
		By Assignment_Delete2 = By.xpath("/html/body/div[2]/div/div/div/div/form/div/div[2]/button[2]");
	
	
	public void assignment() throws InterruptedException, AWTException {
		//upload content with Assignment
//				driver.findElement(StudyMaterials).click();
//				Thread.sleep(2000);
				
				driver.findElement(UploadContent).click();
				Thread.sleep(2000);
				
				driver.findElement(UploadContent_ContentTitle).sendKeys("Assignment");
				Thread.sleep(2000);
				
				
				
				driver.findElement(UploadContent_ContentType1).click();
				Thread.sleep(2000);
				
				
				driver.findElement(UploadContent_Assignment).click();
				Thread.sleep(2000);
				
				
				driver.findElement(UploadContent_AvailableFor).click();
				Thread.sleep(2000);
				
				driver.findElement(UploadContent_SelectClass1).click();
				Thread.sleep(2000);
				
				driver.findElement(UploadContent_SelectClass2).click();
				Thread.sleep(2000);
				
				driver.findElement(UploadContent_SelectSection1).click();
				Thread.sleep(2000);
				
				driver.findElement(UploadContent_SelectSection2).click();
				Thread.sleep(2000);
				
				driver.findElement(UploadContent_Date).click();
				Thread.sleep(2000);
				
				for(int i=1;i<5;i++)

				{
					driver.findElement(UploadContent_DateRightArrow).click();
				}
				
				Thread.sleep(2000);
				
				
				driver.findElement(UploadContent_DateNumber).click();
				Thread.sleep(2000);
				
				driver.findElement(UploadContent_FileUploadBrowseButton).click();
				Thread.sleep(2000);
				
				String filePath2=cm.getFilePath("home-banner1.jpg");
				cm.JPEGUpload(filePath2);
				Thread.sleep(1000);
				
				driver.findElement(UploadContent_UploadContentButton).click();
				Thread.sleep(2000);
				
				//Go To Assignment
		
//		driver.findElement(StudyMaterials).click();
//		Thread.sleep(2000);
//				
				driver.findElement(Assignment).click();
				Thread.sleep(2000);
				System.out.println("Successfully Enter Assignment");
				
				//View
				driver.findElement(Assignment_SearchBar).sendKeys("Assignment");
				Thread.sleep(2000);
				
				driver.findElement(Assignment_SelectButton).click();
				Thread.sleep(2000);
				
				driver.findElement(Assignment_Vielw).click();
				Thread.sleep(2000);
				
				driver.findElement(Assignment_Cross_View).click();
				Thread.sleep(2000);
				
				//Edit
				driver.findElement(Assignment_SelectButton).click();
				Thread.sleep(2000);
				
				driver.findElement(Assignment_Edit).click();
				Thread.sleep(2000);
				
				driver.findElement(Assignment_UploadContentBUtton).click();
				Thread.sleep(2000);
				
				driver.findElement(Assignment).click();
				Thread.sleep(2000);
				
//				//Delete
//				driver.findElement(Assignment_SearchBar).sendKeys("Assignment");
//				Thread.sleep(2000);
//				
//				
//				driver.findElement(Assignment_SelectButton).click();
//				Thread.sleep(2000);
//				
//				driver.findElement(Assignment_Delete).click();
//				Thread.sleep(2000);
//				
//				driver.getWindowHandle();
//				driver.findElement(Assignment_Delete2).click();
//				Thread.sleep(2000);
				
				
				
				System.out.println("Successfully Checkout from Assignment");
		
		
	}
	
	//Syllabus
	
	By Syllabus = By.xpath("//*[@id=\"subMenuTeacher\"]/li[3]/a");
	
	By Syllabus_Searchbar = By.xpath("//*[@id=\"table_id_filter\"]/label/input");
	
	By Syllabus_SelectButton = By.xpath("//*[@id=\"table_id\"]/tbody/tr[1]/td[6]/div/button");
	
	By Syllabus_ViewButton = By.xpath("//*[@id=\"table_id\"]/tbody/tr[1]/td[6]/div/div/a[1]");
	
	By Syllabus_CrossButton = By.xpath("//*[@id=\"modalSize\"]/div/div[1]/button");
	
	By Syllabus_EditButton = By.xpath("//*[@id=\"table_id\"]/tbody/tr[1]/td[6]/div/div/a[2]");
	
	By Syllabus_UploadContentButton = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[6]/div/button");
	
	By Syllabus_Delete1 = By.xpath("//*[@id=\"table_id\"]/tbody/tr[1]/td[6]/div/div/a[3]");
	
	By Syllabus_Delete2 = By.xpath("/html/body/div[2]/div/div/div/div/form/div/div[2]/button[2]");
	
	public void syllabus() throws InterruptedException, AWTException {
		
//		driver.findElement(StudyMaterials).click();
//		Thread.sleep(2000);
		
		driver.findElement(UploadContent).click();
		Thread.sleep(2000);
		
		driver.findElement(UploadContent_ContentTitle).sendKeys("Test Syllabus");
		Thread.sleep(2000);
		
		
		
		driver.findElement(UploadContent_ContentType1).click();
		Thread.sleep(2000);
		
		
		driver.findElement(UploadContent_Syllabus).click();
		Thread.sleep(2000);
		
		
		driver.findElement(UploadContent_AvailableFor).click();
		Thread.sleep(2000);
		
		driver.findElement(UploadContent_SelectClass1).click();
		Thread.sleep(2000);
		
		driver.findElement(UploadContent_SelectClass2).click();
		Thread.sleep(2000);
		
		driver.findElement(UploadContent_SelectSection1).click();
		Thread.sleep(2000);
		
		driver.findElement(UploadContent_SelectSection2).click();
		Thread.sleep(2000);
		
		driver.findElement(UploadContent_Date).click();
		Thread.sleep(2000);
		
		for(int i=1;i<5;i++)

		{
			driver.findElement(UploadContent_DateRightArrow).click();
		}
		
		Thread.sleep(2000);
		
		
		driver.findElement(UploadContent_DateNumber).click();
		Thread.sleep(2000);
		
		driver.findElement(UploadContent_FileUploadBrowseButton).click();
		Thread.sleep(2000);
		
		String filePath2=cm.getFilePath("home-banner1.jpg");
		cm.JPEGUpload(filePath2);
		Thread.sleep(1000);
		
		driver.findElement(UploadContent_UploadContentButton).click();
		Thread.sleep(2000);
		
		//Go to Syllabus
		driver.findElement(Syllabus).click();
		Thread.sleep(2000);
		System.out.println("Successfully Enter Syllabus");
		
		
		//View
		driver.findElement(Syllabus_Searchbar).sendKeys("Test Syllabus");
		Thread.sleep(2000);
		
		driver.findElement(Syllabus_SelectButton).click();
		Thread.sleep(2000);
		
		driver.findElement(Syllabus_ViewButton).click();
		Thread.sleep(2000);
		
		driver.findElement(Syllabus_CrossButton).click();
		Thread.sleep(2000);
	
		//Edit
		
		driver.findElement(Syllabus_SelectButton).click();
		Thread.sleep(2000);
		
		driver.findElement(Syllabus_EditButton).click();
		Thread.sleep(2000);
		
		driver.findElement(Syllabus_UploadContentButton).click();
		Thread.sleep(2000);
		
		driver.findElement(Syllabus).click();
		Thread.sleep(2000);
//		//Delete
//		
//		driver.findElement(Syllabus_Searchbar).sendKeys("Test Syllabus");
//		Thread.sleep(2000);
//		
//		driver.findElement(Syllabus_SelectButton).click();
//		Thread.sleep(2000);
//		
//		driver.findElement(Syllabus_Delete1).click();
//		Thread.sleep(2000);
//		
//		driver.findElement(Syllabus_Delete2).click();
//		Thread.sleep(2000);
		System.out.println("Successfully Checkout from Syllabus");
		
	}
	
	By OtherDownloads = By.xpath("//*[@id=\"subMenuTeacher\"]/li[4]/a");
	
	By OtherDownloads_Searchbar = By.xpath("//*[@id=\"table_id_filter\"]/label/input");
	
	By OtherDownloads_SelectButton = By.xpath("//*[@id=\"table_id\"]/tbody/tr[1]/td[6]/div/button");
	
	By OtherDownloads_ViewButton = By.xpath("//*[@id=\"table_id\"]/tbody/tr[1]/td[6]/div/div/a[1]");
	
	By OtherDownloads_CrossViewButton = By.xpath("//*[@id=\"modalSize\"]/div/div[1]/button");
	
	By OtherDownloads_Edit = By.xpath("//*[@id=\"table_id\"]/tbody/tr[1]/td[6]/div/div/a[2]");
	
	By OtherDownloads_uploadcontentbutton = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[6]/div/button");
	
	By OtherDownloads_Delete1 = By.xpath("//*[@id=\"table_id\"]/tbody/tr[1]/td[6]/div/div/a[3]");
	
	By OtherDownloads_Delete2 = By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div[2]/div/div[3]/div/div/div[2]/div[2]/button[2]");
	
	public void otherdownloads() throws InterruptedException, AWTException {
		//Go to Other Downloads
//		driver.findElement(StudyMaterials).click();
//		Thread.sleep(2000);
		
		driver.findElement(UploadContent).click();
		Thread.sleep(2000);
		
		driver.findElement(UploadContent_ContentTitle).sendKeys("Test Other download");
		Thread.sleep(2000);
		
		
		
		driver.findElement(UploadContent_ContentType1).click();
		Thread.sleep(2000);
		
		
		driver.findElement(UploadContent_OtherDownloads).click();
		Thread.sleep(2000);
		
		
		driver.findElement(UploadContent_AvailableFor).click();
		Thread.sleep(2000);
		
		driver.findElement(UploadContent_SelectClass1).click();
		Thread.sleep(2000);
		
		driver.findElement(UploadContent_SelectClass2).click();
		Thread.sleep(2000);
		
		driver.findElement(UploadContent_SelectSection1).click();
		Thread.sleep(2000);
		
		driver.findElement(UploadContent_SelectSection2).click();
		Thread.sleep(2000);
		
		driver.findElement(UploadContent_Date).click();
		Thread.sleep(2000);
		
		for(int i=1;i<5;i++)

		{
			driver.findElement(UploadContent_DateRightArrow).click();
		}
		
		Thread.sleep(2000);
		
		
		driver.findElement(UploadContent_DateNumber).click();
		Thread.sleep(2000);
		
		driver.findElement(UploadContent_FileUploadBrowseButton).click();
		Thread.sleep(2000);
		
		String filePath2=cm.getFilePath("home-banner1.jpg");
		cm.JPEGUpload(filePath2);
		Thread.sleep(1000);
		
		driver.findElement(UploadContent_UploadContentButton).click();
		Thread.sleep(2000);

		driver.findElement(OtherDownloads).click();
		Thread.sleep(2000);
		System.out.println("Successfully Enter Other Downloads");
		
		//View
		driver.findElement(OtherDownloads_Searchbar).sendKeys("Test Other download");
		Thread.sleep(2000);
		
		
		driver.findElement(OtherDownloads_SelectButton).click();
		Thread.sleep(2000);
		
		driver.findElement(OtherDownloads_ViewButton).click();
		Thread.sleep(2000);
		
		
		driver.findElement(OtherDownloads_CrossViewButton).click();
		Thread.sleep(2000);
		
		
		//Edit
		
		driver.findElement(OtherDownloads_SelectButton).click();
		Thread.sleep(2000);
		
		driver.findElement(OtherDownloads_Edit).click();
		Thread.sleep(2000);
		
		driver.findElement(OtherDownloads_uploadcontentbutton).click();
		Thread.sleep(2000);
		
		driver.findElement(OtherDownloads).click();
		Thread.sleep(2000);
		
		
//		//Delete
//		
//		driver.findElement(OtherDownloads_Searchbar).sendKeys("Test Other download");
//		Thread.sleep(2000);
//		
//		driver.findElement(OtherDownloads_SelectButton).click();
//		Thread.sleep(2000);
//		
//		driver.findElement(OtherDownloads_Delete1).click();
//		Thread.sleep(2000);
//		
//		driver.getWindowHandle();
//		Thread.sleep(2000);
//		driver.findElement(OtherDownloads_Delete2).click();
//		Thread.sleep(2000);
		System.out.println("Checkout from Study Meterials");
	}
	

	
	
}
