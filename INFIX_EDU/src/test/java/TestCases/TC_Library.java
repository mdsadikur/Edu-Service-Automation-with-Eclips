package TestCases;

import org.testng.annotations.Test;

import Base.DriverSetup;
import PageObject.Pom_Library;


public class TC_Library extends DriverSetup {
	@Test(priority=9)
	
	public void library() throws InterruptedException {
		Pom_Library cbox = new Pom_Library(driver);
		
		cbox.BookCategories();
		Thread.sleep(2000);
		
		cbox.AddBook();
		Thread.sleep(2000);
		
		cbox.BookList();
		Thread.sleep(2000);
		
		cbox.AddMember();
		Thread.sleep(2000);
		

		cbox.Issue_Return_Book();
		Thread.sleep(2000);
	}

}