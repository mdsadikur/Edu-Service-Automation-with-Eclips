package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POM_Custom_Field {
	
	WebDriver driver = null;
	
	public POM_Custom_Field(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	//Custom field
	By Customefield = By.xpath("//div[contains(text(),'CUSTOM FIELD')]");
	
	//studentRegistration
	By studentRegistration = By.xpath("//*[@id=\"subMenuCustomField\"]/li[1]/a");
	
	//label
	By label1 = By.name("label");
	/*
	 * 
	 */
	
	//Type
	By selecttype1 = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div[2]/div/div/form/div[1]/div[2]/div");
	//inputtext
	By inputText1 = By.xpath("//li[contains(text(),'Text input')]");
	//minLength
	By minLength1 = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div[2]/div/div/form/div[2]/div[1]/div[1]/div[1]/div/input");
	//maxLength
	By maxLength1 = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div[2]/div/div/form/div[2]/div[1]/div[1]/div[2]/div/input");
	//width
	By width1 = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div[2]/div/div/form/div[2]/div[2]/div");
	//specificwidth1
	By specificwidth1 = By.xpath("//li[contains(text(),'Full Width')]");
	//save
	By save1 = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div[2]/div/div/form/div[3]/button");
	
	/*
	 * 
	 */
	
	//actionselect
	By actionselect = By.xpath("//*[@id=\"table_id\"]/tbody/tr[1]/td[7]/div/button");
	//edit
	By edit = By.xpath("//tbody/tr[1]/td[7]/div[1]/div[1]/a[1]");
	//update
	By update = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div[3]/div/div/form/div[3]/button");
	
	
	/*
	 * 
	 */
	
	//inputtext2
	By Numericinput = By.xpath("//li[contains(text(),'Numeric input')]");
	//minLength
	By minLength2 = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div[2]/div/div/form/div[2]/div[1]/div[2]/div[1]/div/input");
	//maxLength
	By maxLength2 = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div[2]/div/div/form/div[2]/div[1]/div[2]/div[2]/div/input");
	//width
	By width2 = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div[2]/div/div/form/div[2]/div[2]/div");
	//specificwidth1
	By specificwidth2 = By.xpath("//li[contains(text(),'Full Width')]");
	
	
	
	/*
	 * 
	 * 
	 */
	
	// inputtext3
	By Multilineinput = By.xpath("//li[contains(text(),'Multiline input')]");
	// minLength
	By minLength3 = By.xpath(
			"//*[@id=\"main-content\"]/section[2]/div/div[2]/div/div/form/div[2]/div[1]/div[1]/div[1]/div/input");
			
	// maxLength
	By maxLength3 = By.xpath(
			"//*[@id=\"main-content\"]/section[2]/div/div[2]/div/div/form/div[2]/div[1]/div[1]/div[2]/div/input");

	
	/*
	 * 
	 * 
	 */
	
	// inputtext4
	By Datepickerinput = By.xpath("//li[contains(text(),'Datepicker input')]");
	/*
	 * 
	 */
	//inputtext 5
	By Checkboxinput = By.xpath("//li[contains(text(),'Checkbox input')]");
	//add5
	By add5 = By.xpath("//button[@id='customFieldaddRowBtn']");
	//value1
	By value1 = By.xpath("//*[@id=\"addCustRow\"]/div/div[1]/div/input");
	
	/*
	 * 
	 */
	//inputtext 6
	By Radioinput = By.xpath("//li[contains(text(),'Radio input')]");
	
	/*
	 * 
	 */
	//inputtext 7
	By Dropdowninput = By.xpath("//li[contains(text(),'Dropdown input')]");
	
	/*
	 * 
	 */
	//inputtext 8
	By Fileinput = By.xpath("//li[contains(text(),'File input')]");
	
	/*
	 * 
	 * Staff registration
	 * 
	 */
	
	// studentRegistration
	By staffRegistration = By.xpath("//a[contains(text(),'Staff Registration')]");
	
	/*
	 * 
	 * 
	 * 
	 */
	
	public void student_Staff_registration() throws InterruptedException {
		
		// specific label
		driver.findElement(label1).sendKeys("Title 1");
		Thread.sleep(1000);

		/*
		 * 
		 */

		driver.findElement(selecttype1).click();
		Thread.sleep(1000);

		// clickinputlengthbutton
		driver.findElement(inputText1).click();
		Thread.sleep(1000);
		// clickminLengthbutton
		driver.findElement(minLength1).sendKeys("5");
		Thread.sleep(1000);
		// clickmaxLengthbutton
		driver.findElement(maxLength1).sendKeys("5");
		Thread.sleep(1000);
		// clickwidthbutton
		driver.findElement(width1).click();
		Thread.sleep(1000);
		// clickspecificwidth1button
		driver.findElement(specificwidth1).click();
		Thread.sleep(1000);

		// save
		driver.findElement(save1).click();
		Thread.sleep(1000);
		System.out.println("Successfully input text");

		/*
		 * 
		 */

		driver.findElement(actionselect).click();
		Thread.sleep(1000);

		driver.findElement(edit).click();
		Thread.sleep(1000);

		driver.findElement(update).click();
		Thread.sleep(1000);
		System.out.println("Successfully update text");

		/*
		 * title 2
		 */

		// clickslabelbutton
		driver.findElement(label1).sendKeys("Title 2");
		Thread.sleep(1000);

		// selecttype2
		driver.findElement(selecttype1).click();
		Thread.sleep(1000);

		// clickinputlengthbutton
		driver.findElement(Numericinput).click();
		Thread.sleep(1000);
		// clickminLengthbutton
		driver.findElement(minLength2).sendKeys("5");
		Thread.sleep(1000);
		// clickmaxLengthbutton
		driver.findElement(maxLength2).sendKeys("5");
		Thread.sleep(1000);
		// clickwidthbutton
		driver.findElement(width1).click();
		Thread.sleep(1000);
		// clickspecificwidth1button
		driver.findElement(specificwidth1).click();
		Thread.sleep(1000);

		// clicksavebutton
		driver.findElement(save1).click();
		System.out.println("Successfully input numeric input");

		/*
		 * Title 3
		 * 
		 */

		// clickslabelbutton
		driver.findElement(label1).clear();
		driver.findElement(label1).sendKeys("Title 3");
		Thread.sleep(1000);

		// selecttype2
		driver.findElement(selecttype1).click();
		Thread.sleep(1000);

		// clickinputlengthbutton
		driver.findElement(Multilineinput).click();
		Thread.sleep(1000);
		// clickminLengthbutton
		driver.findElement(minLength3).sendKeys("5");
		Thread.sleep(1000);
		// clickmaxLengthbutton
		driver.findElement(maxLength3).sendKeys("5");
		Thread.sleep(1000);
		// clickwidthbutton
		driver.findElement(width1).click();
		Thread.sleep(1000);
		// clickspecificwidth1button
		driver.findElement(specificwidth1).click();
		Thread.sleep(1000);

		// clicksavebutton
		driver.findElement(save1).click();
		Thread.sleep(1000);
		System.out.println("Successfully input multitine");

		/*
		 * 
		 * title 4
		 * 
		 */

		// clickslabelbutton
		driver.findElement(label1).clear();
		driver.findElement(label1).sendKeys("Title 4");
		Thread.sleep(1000);

		// selecttype2
		driver.findElement(selecttype1).click();
		Thread.sleep(1000);
		// clickinputlengthbutton
		driver.findElement(Datepickerinput).click();
		Thread.sleep(1000);

		// clickwidthbutton
		driver.findElement(width1).click();
		Thread.sleep(1000);
		// clickspecificwidth1button
		driver.findElement(specificwidth1).click();
		Thread.sleep(1000);

		// clicksavebutton
		driver.findElement(save1).click();
		Thread.sleep(1000);
		System.out.println("Successfully input width");

		/*
		 * 
		 * title 5
		 * 
		 */

		// clickslabelbutton
		driver.findElement(label1).clear();
		driver.findElement(label1).sendKeys("Title 5");
		Thread.sleep(1000);

		// selecttype2
		driver.findElement(selecttype1).click();
		Thread.sleep(1000);
		// clickinputlengthbutton
		driver.findElement(Checkboxinput).click();
		Thread.sleep(1000);

		// add5
		driver.findElement(add5).click();
		Thread.sleep(1000);
		// value1
		driver.findElement(value1).sendKeys("value5");
		Thread.sleep(1000);

		// clickwidthbutton
		driver.findElement(width1).click();
		Thread.sleep(1000);
		// clickspecificwidth1button
		driver.findElement(specificwidth1).click();
		Thread.sleep(1000);

		// clicksavebutton
		driver.findElement(save1).click();
		System.out.println("Successfully input checkbox");

		/*
		 * title 6
		 */

		// clickslabelbutton
		driver.findElement(label1).clear();
		driver.findElement(label1).sendKeys("Title 6");
		Thread.sleep(1000);

		// selecttype2
		driver.findElement(selecttype1).click();
		Thread.sleep(1000);
		// clickinputlengthbutton
		driver.findElement(Radioinput).click();
		Thread.sleep(1000);

		// add5
		driver.findElement(add5).click();
		Thread.sleep(1000);
		// value1
		driver.findElement(value1).sendKeys("value6");
		Thread.sleep(1000);

		// clickwidthbutton
		driver.findElement(width1).click();
		Thread.sleep(1000);
		// clickspecificwidth1button
		driver.findElement(specificwidth1).click();
		Thread.sleep(1000);

		// clicksavebutton
		driver.findElement(save1).click();
		System.out.println("Successfully input radio button");

		/*
		 * title 7
		 * 
		 */

		// clickslabelbutton
		driver.findElement(label1).clear();
		driver.findElement(label1).sendKeys("Title 7");
		Thread.sleep(1000);

		// selecttype2
		driver.findElement(selecttype1).click();
		Thread.sleep(1000);
		// clickinputlengthbutton
		driver.findElement(Dropdowninput).click();
		Thread.sleep(1000);

		// add5
		driver.findElement(add5).click();
		Thread.sleep(1000);
		// value1
		driver.findElement(value1).sendKeys("value7");
		Thread.sleep(1000);

		// clickwidthbutton
		driver.findElement(width1).click();
		Thread.sleep(1000);
		// clickspecificwidth1button
		driver.findElement(specificwidth1).click();
		Thread.sleep(1000);

		// clicksavebutton
		driver.findElement(save1).click();
		System.out.println("Successfully input dropdown");

		/*
		 * 
		 */
		// clickslabelbutton
		driver.findElement(label1).clear();
		driver.findElement(label1).sendKeys("Title 8");
		Thread.sleep(1000);

		// selecttype2
		driver.findElement(selecttype1).click();
		Thread.sleep(1000);
		// clickinputlengthbutton
		driver.findElement(Fileinput).click();
		Thread.sleep(1000);

		// clickwidthbutton
		driver.findElement(width1).click();
		Thread.sleep(1000);
		// clickspecificwidth1button
		driver.findElement(specificwidth1).click();
		Thread.sleep(1000);

		// clicksavebutton
		driver.findElement(save1).click();
		System.out.println("Successfully input file");
	}
	// clickcustomfieldbutton
	public void clickcustomfieldbutton() throws InterruptedException {
		//Customefield
		driver.findElement(Customefield).click();
		Thread.sleep(1000);
		
		//staffRegistration
		driver.findElement(studentRegistration).click();
		Thread.sleep(1000);
		System.out.println("Successfully enter student registration");
		
		//call student_Staff_registration
		student_Staff_registration();
		Thread.sleep(1000);
		
		
	}
	
	// clickcustomfieldbutton
	public void clickstaffbutton() throws InterruptedException {
		
		//staffRegistration
		driver.findElement(staffRegistration).click();
		Thread.sleep(1000);
		System.out.println("Successfully staff registration");
		
		//call student_Staff_registration
		student_Staff_registration();
		Thread.sleep(1000);
		System.out.println("Checkout from Custom field");
		
		
	}

	
	
	

}
