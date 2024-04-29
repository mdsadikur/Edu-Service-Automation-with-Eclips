package Common_Method;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Base.DriverSetup;

public class CommonMethod extends DriverSetup{
	
	//For Text File
	public String textfileUpload(String profile_image) throws AWTException, InterruptedException {

		return fileUpload(profile_image);
	
	}
	
	//For PDF File
	public String PDFfileUpload(String profile_image) throws AWTException, InterruptedException {

		return fileUpload(profile_image);
	
	}
	
	//For JPEG File
	public String JPEGUpload(String profile_image) throws AWTException, InterruptedException {

		return fileUpload(profile_image);
	
	}
	
	// For small icon 
	public String profilePicUpload(String profile_image) throws AWTException, InterruptedException {

		return fileUpload(profile_image);
		

	}
	
	// For certificate File
	public String certificateUpload(String profile_image) throws AWTException, InterruptedException {

		return fileUpload(profile_image);

	}

	// For small icon 
	public String smalliconUpload(String profile_image) throws AWTException, InterruptedException {

		return fileUpload(profile_image);

	}
	
	// For small icon 
	public String staffattentanceUpload(String profile_image) throws AWTException, InterruptedException {

		return fileUpload(profile_image);

	}
	

	public String fileUpload(String fileLocation) throws AWTException, InterruptedException {
		
		// using robot class 
		Robot rb= new Robot(); 
		rb.delay(2000);

		// put path to file in a clipboard 
		StringSelection ss= new StringSelection(fileLocation);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		// ctrl v 
		rb.keyPress(KeyEvent.VK_CONTROL);// press on control key
		rb.keyPress(KeyEvent.VK_V);// press on v

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		// enter key 
		rb.keyPress(KeyEvent.VK_ENTER);// press on enter key
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		
		return fileLocation;	

	}
	
public String getFilePath(String file) {
		
		
		File filepath=new File("src/test/File/" + file);
		//WebElement fileobj = driver.findElement(By.name("toplogoupload"));
		//fileobj.sendKeys("\ntwinelogin.jpg");
		String Filepath=filepath.getAbsolutePath();
		return Filepath.trim();
		
	
	}
	
	
	/*
	 * 
	 */
	//for scrolling
	public void scroll() {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
	}
	/*
	 * 
	 */
	
	
	/*
	 * 
	 */
	//for switch previous window
	public void switchpreviousWindow() {
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));     //switch to new tab
	}
	
	/*
	 * 
	 */
	
	public void hover(WebElement element) {
		Actions action=new Actions(driver);
		action.moveToElement(element).perform();
	}



}
