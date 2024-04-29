package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Pom_Transport {
	WebDriver driver = null;
	
	public Pom_Transport(WebDriver driver) {
		this.driver=driver;
	}
	
	By Transport = By.xpath("//*[@id=\"sidebar_menu\"]/li[22]/a");
	
	//Route
	
	By Route = By.xpath("//*[@id=\"subMenuTransport\"]/li[1]/a");
	
	By Route_RouteTitle = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[1]/div/div/input[1]");
	
	By Route_Fare = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[2]/div/div/input");
	
	By Route_SaveRouteButton = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[3]/div/button");
	
	By Route_SearchBar = By.xpath("//*[@id=\"table_id_filter\"]/label/input");
	
	By Route_SelectButton = By.xpath("//*[@id=\"table_id\"]/tbody/tr/td[4]/div/button");
	
	By Route_SlButton = By.xpath("//*[@id=\"table_id\"]/thead/tr/th[1]");
	
	By Route_Edit = By.xpath("//*[@id=\"table_id\"]/tbody/tr/td[4]/div/div/a[1]");
	
	By Route_UpdateButton = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div[2]/div[1]/div/div/form/div/div/div[3]/div/button");
	
	By Route_DeleteButton1 = By.xpath("//*[@id=\"table_id\"]/tbody/tr/td[4]/div/div/a[2]");
	
	By Route_DeleteButton2 = By.xpath("/html/body/div[2]/div/section[2]/div/div/div[2]/div[2]/div/div[3]/div/div/div[2]/div[2]/button[2]");

	public void Route() throws InterruptedException {
		
		driver.findElement(Transport).click();
		Thread.sleep(2000);
		
		driver.findElement(Route).click();
		Thread.sleep(2000);
		
		driver.findElement(Route_RouteTitle).sendKeys("Test Route");
		Thread.sleep(2000);
		
		driver.findElement(Route_Fare).sendKeys("12");
		Thread.sleep(2000);
		
		driver.findElement(Route_SaveRouteButton).click();
		Thread.sleep(2000);
		
		//Edit
		driver.findElement(Route_SearchBar).sendKeys("Test Route");
		Thread.sleep(2000);
		
		driver.findElement(Route_SlButton).click();
		Thread.sleep(2000);
		
		driver.findElement(Route_SelectButton).click();
		Thread.sleep(2000);
		
		driver.findElement(Route_Edit).click();
		Thread.sleep(2000);
		
		driver.findElement(Route_UpdateButton).click();
		Thread.sleep(2000);
		
		//Delete
		driver.findElement(Route_SearchBar).sendKeys("Test Route");
		Thread.sleep(2000);
		
		driver.findElement(Route_SlButton).click();
		Thread.sleep(2000);
		
		
//		driver.findElement(Route_SelectButton).click();
//		Thread.sleep(2000);
//		
//		driver.findElement(Route_DeleteButton1).click();
//		Thread.sleep(2000);
//		
//		driver.getWindowHandle();
//		driver.findElement(Route_DeleteButton2).click();
//		Thread.sleep(2000);
	}	
	
	
	//Vehicle
	By Vehicle = By.xpath("//*[@id=\"subMenuTransport\"]/li[2]/a");
	
	By Vehicle_VehicleNumber = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[1]/div/div/input[1]");
	
	By Vehicle_VehicleModel = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[2]/div/div/input");
	
	By Vehicle_YearMade = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[3]/div/div/input");
	
	By Vehicle_SelectDriver = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[4]/div/div");
	
	By Vehicle_SaveButton = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[6]/div/button");
	
	By Vehicle_Searchbutton = By.xpath("//*[@id=\"table_id_filter\"]/label/input");
	
	By Vehicle_SelectButton = By.xpath("//*[@id=\"table_id\"]/tbody/tr/td[7]/div/button");
	
	By Vehicle_EditButton = By.xpath("//*[@id=\"table_id\"]/tbody/tr/td[7]/div/div/a[1]");
	
	By Vehicle_UpdateVehicle = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div[2]/div[1]/div/div/form/div/div/div[6]/div/button");
	
	By Vehicle_Delete1 = By.xpath("//*[@id=\"table_id\"]/tbody/tr/td[7]/div/div/a[2]");
	
	By Vehicle_Delete2 = By.xpath("/html/body/div[2]/div/section[2]/div/div/div[2]/div[2]/div/div[4]/div/div/div[2]/div[2]/button[2]");
	
	public void vehicledriver() throws InterruptedException {
		int size = driver.findElements(By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[4]/div/div/ul/li")).size();
		
		for(int i=1; i<=size; i++) {
			String text = driver.findElement(By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[4]/div/div/ul/li["+i+"]")).getText();
			if(text.matches("TONMOY HALDER")) {
			
			driver.findElement(By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[4]/div/div/ul/li["+i+"]")).click();
			Thread.sleep(2000);
		}
		}	
		
	}
	
	
	
	public void Vehicle() throws InterruptedException {
		
//		driver.findElement(Transport).click();
//		Thread.sleep(2000);
//	
		driver.findElement(Vehicle).click();
		Thread.sleep(2000);
		
		driver.findElement(Vehicle_VehicleNumber).sendKeys("101");
		Thread.sleep(2000);
		
		driver.findElement(Vehicle_VehicleModel).sendKeys("Test Vehicle Model");
		Thread.sleep(2000);
		
		driver.findElement(Vehicle_YearMade).sendKeys("1999");
		Thread.sleep(2000);
		
		driver.findElement(Vehicle_SelectDriver).click();
		Thread.sleep(2000);
		
		vehicledriver();
		Thread.sleep(2000);
		
		driver.findElement(Vehicle_SaveButton).click();
		Thread.sleep(2000);
		
		//Edit
		driver.findElement(Vehicle_Searchbutton).sendKeys("TEST VEHICLE");
		Thread.sleep(2000);
		
		driver.findElement(Vehicle_SelectButton).click();
		Thread.sleep(2000);
		
		driver.findElement(Vehicle_EditButton).click();
		Thread.sleep(2000);
		
		driver.findElement(Vehicle_UpdateVehicle).click();
		Thread.sleep(2000);
		
//		//Delete
//		
//		driver.findElement(Vehicle_Searchbutton).sendKeys("TEST VEHICLE");
//		Thread.sleep(2000);
//		
//		driver.findElement(Vehicle_SelectButton).click();
//		Thread.sleep(2000);
//		
//		driver.findElement(Vehicle_Delete1).click();
//		Thread.sleep(2000);
//		
//		driver.getWindowHandle();
//		driver.findElement(Vehicle_Delete2).click();
//		Thread.sleep(2000);
		
		
		
		
	}
	
	//Assign Vehicle
	
	
	public void AssignAddRoute() throws InterruptedException {
		
//		driver.findElement(Transport).click();
//		Thread.sleep(2000);
//		
		driver.findElement(Route).click();
		Thread.sleep(2000);
		
		driver.findElement(Route_RouteTitle).sendKeys("Test Assign Route");
		Thread.sleep(2000);
		
		driver.findElement(Route_Fare).sendKeys("12");
		Thread.sleep(2000);
		
		driver.findElement(Route_SaveRouteButton).click();
		Thread.sleep(2000);
		
	}
	
	public void AssignAddVehicle() throws InterruptedException {
		
		driver.findElement(Vehicle).click();
		Thread.sleep(2000);
		
		driver.findElement(Vehicle_VehicleNumber).sendKeys("123");
		Thread.sleep(2000);
		
		driver.findElement(Vehicle_VehicleModel).sendKeys("Test Assign Vehicle Modle");
		Thread.sleep(2000);
		
		driver.findElement(Vehicle_YearMade).sendKeys("1999");
		Thread.sleep(2000);
		
		driver.findElement(Vehicle_SelectDriver).click();
		Thread.sleep(2000);
		
		vehicledriver();
		Thread.sleep(2000);
		
		driver.findElement(Vehicle_SaveButton).click();
		Thread.sleep(2000);
		
	}
	By AssignVehicle = By.xpath("//*[@id=\"subMenuTransport\"]/li[3]/a");
	
	By AssignVehicle_Route1 = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[1]/div/div");
	
	By AssignVehicle_Route2 = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[1]/div/div/ul/li[3]");
	
	By AssignVehicle_Vehicle = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[2]/div/div[3]/label");
	
	By AssignVehicle_SaveButton = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[3]/div/button");
	
	By AssignVehicle_Searchbar = By.xpath("//*[@id=\"table_id_filter\"]/label/input");
	
	By AssignVehicle_SelectButton = By.xpath("//*[@id=\"table_id\"]/tbody/tr/td[3]/div/button");
	
	By AssignVehicle_Edit = By.xpath("//*[@id=\"table_id\"]/tbody/tr/td[3]/div/div/a[1]");
	
	By AssignVehicle_UpdateButton = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div[2]/div[1]/div/div/form/div/div/div[3]/div/button");
	
	By AssignVehicle_Delete1 = By.xpath("//*[@id=\"table_id\"]/tbody/tr/td[3]/div/div/a[2]");
	
	By AssignVehicle_Delete2 = By.xpath("//*[@id=\"deleteAssignVehicle\"]/div/div/div[2]/div[2]/form/button");
	
	public void AssignVehicle() throws InterruptedException {
		
		
		
		AssignAddRoute();
		Thread.sleep(2000);
		
		AssignAddVehicle();
		Thread.sleep(2000);
		
		//AddAssignVehicle
		driver.findElement(AssignVehicle).click();
		Thread.sleep(2000);
		
		driver.findElement(AssignVehicle_Route1).click();
		Thread.sleep(2000);
		
		driver.findElement(AssignVehicle_Route2).click();
		Thread.sleep(2000);
		
		driver.findElement(AssignVehicle_Vehicle).click();
		Thread.sleep(2000);
		
		driver.findElement(AssignVehicle_SaveButton).click();
		Thread.sleep(2000);
		
		//Edit
		driver.findElement(AssignVehicle_Searchbar).sendKeys("Test Assign Route");
		Thread.sleep(2000);
		
		driver.findElement(AssignVehicle_SelectButton).click();
		Thread.sleep(2000);
		
		driver.findElement(AssignVehicle_Edit).click();
		Thread.sleep(2000);
		
		driver.findElement(AssignVehicle_UpdateButton).click();
		Thread.sleep(2000);
//		//Delete
//		
//		driver.findElement(AssignVehicle_Searchbar).sendKeys("Test Assign Route");
//		Thread.sleep(2000);
//		
//		driver.findElement(AssignVehicle_SelectButton).click();
//		Thread.sleep(2000);
//		
//		driver.findElement(AssignVehicle_Delete1).click();
//		Thread.sleep(2000);
//		
//		driver.getWindowHandle();
//		driver.findElement(AssignVehicle_Delete2).click();
//		Thread.sleep(2000);
		
		
		
	}
	
	//Student Transport Report
	
	By StudentTransportReport = By.xpath("//*[@id=\"subMenuTransport\"]/li[4]/a");
	
	By StudentTransportReport_Class1 = By.xpath("//*[@id=\"search_student\"]/div/div[1]/div");
	
	By StudentTransportReport_Class2 = By.xpath("//*[@id=\"search_student\"]/div/div[1]/div/ul/li[2]");
	
	By StudentTransportReport_Section1 = By.xpath("//*[@id=\"select_section_div\"]/div[1]");
	
	By StudentTransportReport_Section2 = By.xpath("//*[@id=\"select_section_div\"]/div[1]/ul/li[2]");
	
	By StudentTransportReport_Route1 = By.xpath("//*[@id=\"search_student\"]/div/div[3]/div");
	
	By StudentTransportReport_Route2 = By.xpath("//*[@id=\"search_student\"]/div/div[3]/div/ul/li[3]");
	
	By StudentTransportReport_Vehicle1 = By.xpath("//*[@id=\"search_student\"]/div/div[4]/div");
	
	By StudentTransportReport_Vehicle2 = By.xpath("//*[@id=\"search_student\"]/div/div[4]/div/ul/li[4]");
	
	By StudentTransportReport_SearchButton = By.xpath("//*[@id=\"search_student\"]/div/div[5]/button");
	
	
	public void StudentTransportReport() throws InterruptedException {
		
//		driver.findElement(Transport).click();
//		Thread.sleep(2000);
		
		driver.findElement(StudentTransportReport).click();
		Thread.sleep(2000);
		
		driver.findElement(StudentTransportReport_Class1).click();
		Thread.sleep(2000);
		
		driver.findElement(StudentTransportReport_Class2).click();
		Thread.sleep(2000);
		
		driver.findElement(StudentTransportReport_Section1).click();
		Thread.sleep(2000);
		
		driver.findElement(StudentTransportReport_Section2).click();
		Thread.sleep(2000);
		
		driver.findElement(StudentTransportReport_Route1).click();
		Thread.sleep(2000);
		
		driver.findElement(StudentTransportReport_Route2).click();
		Thread.sleep(2000);
		
		driver.findElement(StudentTransportReport_Vehicle1).click();
		Thread.sleep(2000);
		
		driver.findElement(StudentTransportReport_Vehicle2).click();
		Thread.sleep(2000);
		
		driver.findElement(StudentTransportReport_SearchButton).click();
		Thread.sleep(2000);
		System.out.println("Checkout from Transport");
		
	}
	

	
	
}
