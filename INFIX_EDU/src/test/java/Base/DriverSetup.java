package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverSetup {
	
public static WebDriver driver= null;
	
	@BeforeSuite
	public void setup() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
//		WebDriverManager.firefoxdriver().setup();		
//		driver = new FirefoxDriver();
		
		String baseurl = "http://pos.rishfa.com/login";
		driver.get(baseurl);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//login
		driver.findElement(By.xpath("//input[@id='email-address']")).sendKeys("support@spondonit.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("12345678");
		driver.findElement(By.xpath("//button[@id='btnsubmit']")).click();
	}
	
	@AfterSuite
	public void teardown() {
		driver.quit();
	}

}
