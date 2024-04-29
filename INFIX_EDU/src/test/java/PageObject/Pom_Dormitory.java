package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Pom_Dormitory {
	WebDriver driver = null;
	
	public Pom_Dormitory(WebDriver driver) {
		this.driver=driver;
	}
	  
	By Dormitory = By.xpath("//*[@id=\"sidebar_menu\"]/li[23]/a/div[2]");
	
	//Dormitory
	By Dormitory_Dormitory = By.xpath("/html/body/div[2]/nav/ul/li[23]/ul/li[2]/a");
	
	//Add Dormitory
	By Dormitory_Name = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[1]/div/div/input[1]");
	By Dormitory_Type1 = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[2]/div/div");
	By Dormitory_Type2 = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[2]/div/div/ul/li[2]");
	
	By Dormitory_Address = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[3]/div/div/input");
	By Dormitory_Intake = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[4]/div/div/input");
	By Dormitory_Description = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[5]/div/div/textarea");
	By Dormitory_SaveDormitoryButton = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[6]/div/button");
	
	By Dormitory_Search = By.xpath("//*[@id=\"table_id_filter\"]/label/input");
	
	By Dormitory_ActionPlusButton = By.xpath("//*[@id=\"table_id\"]/tbody/tr[2]/td[1]");
	By Dormitory_SelectButton = By.xpath("//*[@id=\"table_id\"]/tbody/tr/td[6]/div/button");
	By Dormitory_Edit = By.xpath("//*[@id=\"table_id\"]/tbody/tr[1]/td[6]/div/div/a[1]");
	By Dormitory_UpdateButton= By.xpath("/html/body/div[2]/div/section[2]/div/div[2]/div[1]/div/div/form/div/div/div[6]/div/button");
	By Dormitory_Delete = By.xpath("//*[@id=\"table_id\"]/tbody/tr[1]/td[6]/div/div/a[2]");
	By Dormitory_Delete2 = By.xpath("/html/body/div[2]/div/section[2]/div/div/div[2]/div[2]/div/div[2]/div/div/div[2]/div[2]/button[2]");
	
	//public void scroll () throws InterruptedException {
	//	JavascriptExecutor js =(JavascriptExecutor)driver;
	//	js.executeScript("arguments[0].scrollIntoView();", Dormitory);
	//	Thread.sleep(5000);
	//}
	
	public void dormitory() throws InterruptedException {
		
		driver.findElement(Dormitory).click();
		Thread.sleep(2000);
		
		driver.findElement(Dormitory_Dormitory).click();
		Thread.sleep(2000);
		System.out.println("Successfully enter in dormitory");
		
		driver.findElement(Dormitory_Name).sendKeys("Test Dormitory");
		Thread.sleep(2000);
		
		driver.findElement(Dormitory_Type1).click();
		Thread.sleep(2000);
		
		driver.findElement(Dormitory_Type2).click();
		Thread.sleep(2000);
		
		driver.findElement(Dormitory_Address).sendKeys("Dhaka");
		Thread.sleep(2000);
		
		driver.findElement(Dormitory_Intake).sendKeys("02");
		Thread.sleep(2000);
		
		driver.findElement(Dormitory_SaveDormitoryButton).click();
		Thread.sleep(2000);
		
		//For Edit
		driver.findElement(Dormitory_Search).sendKeys("Test Dormitory");
		Thread.sleep(2000);
		
//		driver.findElement(Dormitory_ActionPlusButton).click();
//		Thread.sleep(2000);
		
		driver.findElement(Dormitory_SelectButton).click();
		Thread.sleep(2000);
		
		driver.findElement(Dormitory_Edit).click();
		Thread.sleep(2000);
		
		driver.findElement(Dormitory_UpdateButton).click();
		Thread.sleep(2000);
		System.out.println("Successfully saved dormitory");
		
//		//Delete
//		driver.findElement(Dormitory_Search).sendKeys("Test Dormitory");
//		Thread.sleep(2000);
//		
////		driver.findElement(Dormitory_ActionPlusButton).click();
////		Thread.sleep(2000);
//		
//		driver.findElement(Dormitory_SelectButton).click();
//		Thread.sleep(2000);
//		
//		driver.findElement(Dormitory_Delete).click();
//		Thread.sleep(2000);
//		
//		driver.getWindowHandle();
//		driver.findElement(Dormitory_Delete2).click();
//		Thread.sleep(2000);
		
		
		
	}
	
	
	//Dormitory Room
	//By Dormitory = By.xpath("//*[@id=\"sidebar_menu\"]/li[23]/a/div[2]");
	By DormitoryRoom = By.xpath("//*[@id=\"subMenuDormitory\"]/li[3]/a");
	
	By DormitoryRoom_Dormitory_Dropdown = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[1]/div/div");
	
	By DormitoryRoom_Dormitory_SearchDropdown = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[1]/div/div/div/input");
	
	By DormitoryRoom_Dormitory_Dropdown2 = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[3]/div/div/ul/li[3]");
	
	By DormitoryRoom_RoomNumber = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[2]/div/div/input[1]");
	
	By DormitoryRoom_RoomType1 = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[3]/div/div");
	
	By DormitoryRoom_RoomTypeSearch = By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/input[1]");
	
	By DormitoryRoom_RoomType2= By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[3]/div/div/ul/li[2]");
	
	By DormitoryRoom_NumberOfBed = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[4]/div/div/input");
	
	By DormitoryRoom_CostPerBed = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[5]/div/div/input");
	
	By DormitoryRoom_Description = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[6]/div/div/textarea");
	
	By DormitoryRoom_SaveRoomButton = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[7]/div/button");
	
	By DormitoryRoom_PlusActionButton = By.xpath("//*[@id=\"table_id\"]/tbody/tr[1]/td[1]");
	
	By DormitoryRoom_SelectButton = By.xpath("//*[@id=\"table_id\"]/tbody/tr/td[7]/div/button");
	
	By DormitoryRoom_Edit = By.xpath("//*[@id=\"table_id\"]/tbody/tr/td[7]/div/div/a[1]");
	
	By DormitoryRoom_UpdateButton = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div[2]/div[1]/div/div/form/div/div/div[7]/div/button");
	
	By DormitoryRoom_Delete1 = By.xpath("//*[@id=\"table_id\"]/tbody/tr/td[7]/div/div/a[2]");
	
	By DormitoryRoom_Delete2 = By.xpath("/html/body/div[2]/div/section[2]/div/div/div[2]/div[2]/div/div[1]/div/div/div[2]/div[2]/button[2]");
	
	
	public void dormitorysearchdropdown(){
		System.out.println("Entered");
		
		int size = driver.findElements(By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li")).size();
		
		System.out.println(size);
		int i = 1;
		while(i<=size) {
		  String text = driver.findElement(By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[1]/div/div/ul/li["+i+"]")).getText();
		 		
				 if(text.matches("EDU DORMITORY")) {
					 
					 System.out.println("Done");
					 
					 driver.findElement(By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[1]/div/div/ul/li["+i+"]")).click();
				 } 
			 i=i+1;
	 }
		

	}
	
	
	public void roomtypedropdown(){
		
		
		int size = driver.findElements(By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[3]/div/div/ul/li")).size();
		
		System.out.println(size);
		int i = 1;
		while(i<=size) {
		  String text = driver.findElement(By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[3]/div/div/ul/li["+i+"]")).getText();
		 		
				 if(text.matches("NON AC ROOM")) {
					 
					 System.out.println("Done");
					 
					 driver.findElement(By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[3]/div/div/ul/li["+i+"]")).click();
				 } 
			 i++;
	 }
		

	}
	
	
public void dormitoryRoom() throws InterruptedException {
		
		
	
	    roomtypename();
	    
//		driver.findElement(Dormitory).click();
//		Thread.sleep(2000);
		
		driver.findElement(DormitoryRoom).click();
		Thread.sleep(2000);
		System.out.println("Successfully enter in dormitory rooms");
		
		driver.findElement(DormitoryRoom_Dormitory_Dropdown).click();
		Thread.sleep(2000);
		
		dormitorysearchdropdown();
		
		
		
//		WebElement currentElement = driver.switchTo().activeElement();
//		currentElement.sendKeys("EDU DORMITORY");
//		currentElement.sendKeys(Keys.RETURN);
//		
		//dormitorysearchdropdown();
		
		//driver.findElement(DormitoryRoom_Dormitory_SearchDropdown).sendKeys("EDU Dormitory");
		//Thread.sleep(2000);
		
		//driver.findElement(DormitoryRoom_Dormitory_Dropdown2).click();
		//Thread.sleep(2000);
		
		driver.findElement(DormitoryRoom_RoomNumber).sendKeys("02");
		Thread.sleep(2000);
		
		driver.findElement(DormitoryRoom_RoomType1).click();
		Thread.sleep(2000);
		
		
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		
		
		roomtypedropdown();
		Thread.sleep(2000);
		
//		WebElement currentElement = driver.switchTo().activeElement();
//		currentElement.sendKeys("Test Room");
//		currentElement.sendKeys(Keys.RETURN); 
		
		//dormitorysearchdropdown();
		
		//driver.findElement(DormitoryRoom_RoomTypeSearch).sendKeys("Test Room");
		
		//driver.findElement(DormitoryRoom_RoomType2).click();
		//Thread.sleep(2000);
		
		driver.findElement(DormitoryRoom_NumberOfBed).sendKeys("05");
		Thread.sleep(2000);
		
		driver.findElement(DormitoryRoom_CostPerBed).sendKeys("2000");
		Thread.sleep(2000);
		
		driver.findElement(DormitoryRoom_Description).sendKeys("Test Description");
		Thread.sleep(2000);
		
		driver.findElement(DormitoryRoom_SaveRoomButton).click();
		Thread.sleep(2000);
		
		//For Edit
//		driver.findElement(DormitoryRoom_PlusActionButton).click();
//		Thread.sleep(2000);
		driver.findElement(DormitoryRoom_SelectButton).click();
		Thread.sleep(2000);
		driver.findElement(DormitoryRoom_Edit).click();
		Thread.sleep(2000);
		driver.findElement(DormitoryRoom_UpdateButton).click();
		Thread.sleep(2000);
		System.out.println("Successfully saved dormitory room");
		
		//for delete
//		driver.findElement(DormitoryRoom_PlusActionButton).click();
//		Thread.sleep(2000);
//		driver.findElement(DormitoryRoom_SelectButton).click();
//		Thread.sleep(2000);
//		driver.findElement(DormitoryRoom_Delete1).click();
//		Thread.sleep(2000);
//		
//		driver.getWindowHandle();
//		driver.findElement(DormitoryRoom_Delete2).click();
//		Thread.sleep(2000);
		
	}

//Room Type
public void roomtypename() throws InterruptedException {
	
//	driver.findElement(Dormitory).click();
//	Thread.sleep(2000);
	
	driver.findElement(RoomType).click();
	Thread.sleep(2000);
	
	
	driver.findElement(RoomType_name).sendKeys("Test Room");
	Thread.sleep(2000);
	
	driver.findElement(RoomType_Description).sendKeys("Test Description");
	Thread.sleep(2000);
	
	driver.findElement(RoomType_SaveRoomType).click();
	Thread.sleep(2000);
}


//By Dormitory = By.xpath("//*[@id=\"sidebar_menu\"]/li[23]/a/div[2]");
By RoomType = By.xpath("//*[@id=\"subMenuDormitory\"]/li[1]/a");

By RoomType_name = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[1]/div/div/input[1]");

By RoomType_Description = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[2]/div/div/textarea");

By RoomType_SaveRoomType = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[3]/div/button");

By RoomType_Search = By.xpath("//*[@id=\"table_id_filter\"]/label/input");

By RoomType_Selectbutton = By.xpath("//*[@id=\"table_id\"]/tbody/tr[1]/td[4]/div/button");

By RoomType_Edit = By.xpath("//*[@id=\"table_id\"]/tbody/tr[1]/td[4]/div/div/a[1]");

By RoomType_UpdateButton = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div[2]/div[1]/div/div/form/div/div/div[3]/div/button");

By RoomType_Delete = By.xpath("//*[@id=\"table_id\"]/tbody/tr[1]/td[4]/div/div/a[2]");

By RoomType_Delete2 = By.xpath("/html/body/div[2]/div/section[2]/div/div/div[2]/div[2]/div/div[6]/div/div/div[2]/div[2]/button[2]");


public void RoomType() throws InterruptedException {
	

	
	driver.findElement(RoomType).click();
	Thread.sleep(2000);
	System.out.println("Successfully enter in room type");
	
	driver.findElement(RoomType_name).sendKeys("Test Room type");
	Thread.sleep(2000);
	
	driver.findElement(RoomType_Description).sendKeys("Test Description");
	Thread.sleep(2000);
	
	driver.findElement(RoomType_SaveRoomType).click();
	Thread.sleep(2000);
	
	//Edit
	
	driver.findElement(RoomType_Search).sendKeys("Test Room Type");
	Thread.sleep(2000);
	
	driver.findElement(RoomType_Selectbutton).click();
	Thread.sleep(2000);
	
	driver.findElement(RoomType_Edit).click();
	Thread.sleep(2000);
	
	driver.findElement(RoomType_UpdateButton).click();
	Thread.sleep(2000);
	
//	//Delete
//	
//	driver.findElement(RoomType_Search).sendKeys("Test Room Type");
//	Thread.sleep(2000);
//	
//	driver.findElement(RoomType_Selectbutton).click();
//	Thread.sleep(2000);
//	
//	driver.findElement(RoomType_Delete).click();
//	Thread.sleep(2000);
//	
//	driver.getWindowHandle();
//	Thread.sleep(2000);
//	driver.findElement(RoomType_Delete2).click();
//	Thread.sleep(2000);
}






By StudentDormitoryReport = By.xpath("//*[@id=\"subMenuDormitory\"]/li[4]/a");

By StudentDormitoryReport_SelectClassDropdown1 = By.xpath("//*[@id=\"search_student\"]/div/div[1]/div");

By StudentDormitoryReport_SelectSectionDropdown1 = By.xpath("//*[@id=\"select_section_div\"]/div[1]");

By StudentDormitoryReport_SelectDormitoryDropdown1 = By.xpath("//*[@id=\"search_student\"]/div/div[3]/div");

By StudentDormitoryReport_Searchbutton = By.xpath("//*[@id=\"search_student\"]/div/div[4]/button");

By StudentDormitoryReport_PlusActionButton = By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]");




public void studentdormitoryreportselectclass() {
	int size = driver.findElements(By.xpath("//*[@id=\"search_student\"]/div/div[1]/div/ul/li")).size();
	
	System.out.println(size);
	int i = 1;
	while(i<=size) {
	  String text = driver.findElement(By.xpath("//*[@id=\"search_student\"]/div/div[1]/div/ul/li["+i+"]")).getText();
	 		
			 if(text.matches("CLASS 3")) {
				 
				 System.out.println("Done");
				 
				 driver.findElement(By.xpath("//*[@id=\"search_student\"]/div/div[1]/div/ul/li["+i+"]")).click();
			 } 
		 i++;
 }
	
}

public void studentdormitoryreportselectsection() {
	int size = driver.findElements(By.xpath("//*[@id=\"select_section_div\"]/div[1]/ul/li")).size();
	
	System.out.println(size);
	int i = 1;
	while(i<=size) {
	  String text = driver.findElement(By.xpath("//*[@id=\"select_section_div\"]/div[1]/ul/li["+i+"]")).getText();
	 		
			 if(text.matches("MORNING")) {
				 
				 System.out.println("Done");
				 
				 driver.findElement(By.xpath("//*[@id=\"select_section_div\"]/div[1]/ul/li["+i+"]")).click();
			 } 
		 i++;
 }
	
}

public void studentdormitoryreportselectdormitory() {
	int size = driver.findElements(By.xpath("//*[@id=\"search_student\"]/div/div[3]/div/ul/li")).size();
	
	System.out.println(size);
	int i = 1;
	while(i<=size) {
	  String text = driver.findElement(By.xpath("//*[@id=\"search_student\"]/div/div[3]/div/ul/li["+i+"]")).getText();
	 		
			 if(text.matches("EDU DORMITORY")) {
				 
				 System.out.println("Done");
				 
				 driver.findElement(By.xpath("//*[@id=\"search_student\"]/div/div[3]/div/ul/li["+i+"]")).click();
			 } 
		 i++;
 }
	
}



public void studentdormitoryreport() throws InterruptedException {
	
	
	
	driver.findElement(StudentDormitoryReport).click();
	Thread.sleep(2000);
	System.out.println("Successfully enter in dormitory report");
	
	driver.findElement(StudentDormitoryReport_SelectClassDropdown1).click();
	Thread.sleep(2000);
	
	studentdormitoryreportselectclass();
	Thread.sleep(2000);
	
	
	driver.findElement(StudentDormitoryReport_SelectSectionDropdown1).click();
	Thread.sleep(2000);
	
	studentdormitoryreportselectsection();
	Thread.sleep(2000);
	
	driver.findElement(StudentDormitoryReport_SelectDormitoryDropdown1).click();
	Thread.sleep(2000);
	
	studentdormitoryreportselectdormitory();
	Thread.sleep(2000);
	
	driver.findElement(StudentDormitoryReport_Searchbutton).click();
	Thread.sleep(2000);
	System.out.println("Checkout from Dormitory");
	
//	driver.findElement(StudentDormitoryReport_PlusActionButton).click();
//	Thread.sleep(2000);
	
	
}


}






