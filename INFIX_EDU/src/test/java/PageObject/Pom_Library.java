package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Pom_Library {
	WebDriver driver=null;
	
	public Pom_Library(WebDriver driver) {
		this.driver=driver;
		
	}
	By Library = By.xpath("//body/div[2]/nav/ul/li[20]/a/div[2]");
	//*[@id="sidebar_menu"]/li[20]/a/div[2]
	
	
	//Book Categories
	//library>BookCategories
			By BookCategories = By.xpath("//*[@id=\"subMenulibrary\"]/li[1]/a");
			
			//library>BookCategories>AddCategories
			By BookCategories_AddCategoriesname = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[1]/div/div/input");
						
			By BookCategories_SaveCategoryButton = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[2]/div/button");
			
			By BookCategories_SearchButton = By.xpath("//*[@id=\"table_id_filter\"]/label/input");
			
			//Edit
			By BookCategories_ClickSelectButton = By.xpath("//*[@id=\"table_id\"]/tbody/tr/td[3]/div/button");
		    
			By BookCategories_ClickEditButton = By.xpath("//*[@id=\"table_id\"]/tbody/tr/td[3]/div/div/a[1]");
		    
			By BookCategories_UpdateCategoryName = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div[2]/div[1]/div/div/form/div/div/div[1]/div/div/input");
			
			By BookCategories_ClickUpdateCateGory = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div[2]/div[1]/div/div/form/div/div/div[2]/div/button");
			
			//Delete
			
			By BookCategories_ClickDeleteButton = By.xpath("//*[@id=\"table_id\"]/tbody/tr/td[3]/div/div/a[2]");
			By BookCategories_ClickDeleteButton2 = By.xpath("/html/body/div[2]/div/section[2]/div/div/div[2]/div[2]/div/div[4]/div/div/div[2]/div[2]/button[2]");
			
			//Library>subject
			By ClickSubject = By.xpath("//*[@id=\"subMenulibrary\"]/li[2]/a");
			
			//Section>Add Subject
//			By SubjectName = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[1]/div/div/input[1]");
//			
//			By CategoryName = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[3]/div/div");
//			
//			By SubjectCode = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[4]/div/div/input");
//			
//			By SaveSubject = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[5]/div/button");

			
			public void BookCategories() throws InterruptedException {
//				JavascriptExecutor js =(JavascriptExecutor)driver;
//				js.executeScript("window.scroll(0,4000)");
				Thread.sleep(2000);
				System.out.println("Enter Library");
				driver.findElement(Library).click();
				Thread.sleep(2000);
				
				driver.findElement(BookCategories).click();
				Thread.sleep(2000);
				
//				//Add Book Categories
				driver.findElement(BookCategories_AddCategoriesname).sendKeys("Test Book Categories");
				Thread.sleep(2000);
				
				driver.findElement(BookCategories_SaveCategoryButton).click();
				Thread.sleep(2000);
				
				driver.findElement(BookCategories_SearchButton).sendKeys("Test Book Categories");
				Thread.sleep(2000);
				
				
				//Edit
				
				driver.findElement(BookCategories_ClickSelectButton).click();
				Thread.sleep(2000);
			    
				driver.findElement(BookCategories_ClickEditButton).click();
				Thread.sleep(2000);
				
				driver.findElement(BookCategories_UpdateCategoryName).clear();
			    Thread.sleep(2000);
			    
			    driver.findElement(BookCategories_UpdateCategoryName).sendKeys("Test Book Categories 1");
			    Thread.sleep(2000);
				
			    driver.findElement(BookCategories_ClickUpdateCateGory).click();
				Thread.sleep(2000);
				
//				//Delete
//				
//				driver.navigate().refresh();
//				
//				driver.findElement(BookCategories_SearchButton).sendKeys("Test Book Categories 1");
//				Thread.sleep(2000);
//				
//				driver.findElement(BookCategories_ClickSelectButton).click();
//				Thread.sleep(2000);
//				
//				driver.findElement(BookCategories_ClickDeleteButton).click();
//				Thread.sleep(2000);
//				
//				driver.getWindowHandle();
//				driver.findElement(BookCategories_ClickDeleteButton2).click();
//				Thread.sleep(2000);
				
				
			}
			
			//Add Book
			By AddBook = By.xpath("//*[@id=\"subMenulibrary\"]/li[3]/a");
			
			By AddBook_BookTitle = By.xpath("//*[@id=\"main-content\"]/section[2]/div/form/div/div/div/div[1]/div[1]/div[1]/div/input");
			
			By AddBook_SelectBookCategory = By.xpath("//*[@id=\"main-content\"]/section[2]/div/form/div/div/div/div[1]/div[1]/div[2]/div/div");
			
			By AddBook_BookNo = By.xpath("//*[@id=\"main-content\"]/section[2]/div/form/div/div/div/div[1]/div[1]/div[4]/div/input");
			
			By AddBook_IsbnNo = By.xpath("//*[@id=\"main-content\"]/section[2]/div/form/div/div/div/div[1]/div[2]/div[1]/div/input");
			
			By AddBook_Publishername = By.xpath("//*[@id=\"main-content\"]/section[2]/div/form/div/div/div/div[1]/div[2]/div[2]/div/input");
			
			By AddBook_AuthorName = By.xpath("//*[@id=\"main-content\"]/section[2]/div/form/div/div/div/div[1]/div[2]/div[3]/div/input");
			
			By AddBook_RackNumber = By.xpath("//*[@id=\"main-content\"]/section[2]/div/form/div/div/div/div[1]/div[3]/div/div/input");
			
			By AddBook_Quantity = By.xpath("//*[@id=\"main-content\"]/section[2]/div/form/div/div/div/div[1]/div[4]/div[1]/div/input");
			
			By AddBook_BookPrice = By.xpath("//*[@id=\"main-content\"]/section[2]/div/form/div/div/div/div[1]/div[4]/div[2]/div/input");
			
			By AddBook_SaveBook = By.xpath("//*[@id=\"main-content\"]/section[2]/div/form/div/div/div/div[2]/div/button");
			
			
			
			public void Selectbookcategory() throws InterruptedException {
				
				driver.findElement(By.xpath("//*[@id=\"main-content\"]/section[2]/div/form/div/div/div/div[1]/div[1]/div[2]/div/div")).click();
				Thread.sleep(2000);
				
				int size = driver.findElements(By.xpath("//*[@id=\"main-content\"]/section[2]/div/form/div/div/div/div[1]/div[1]/div[2]/div/div/ul/li")).size();
				
				System.out.println(size);
				int i = 1;
				while(i<=size) {
				  String text = driver.findElement(By.xpath("//*[@id=\"main-content\"]/section[2]/div/form/div/div/div/div[1]/div[1]/div[2]/div/div/ul/li["+i+"]")).getText();
				 		
						 if(text.matches("TEST ADD BOOK CATEGORY")) {
							 
							 System.out.println("Done");
							 
							 driver.findElement(By.xpath("//*[@id=\"main-content\"]/section[2]/div/form/div/div/div/div[1]/div[1]/div[2]/div/div/ul/li["+i+"]")).click();
						 } 
					 i=i+1;
			 }
				
				
			}
			
		
			By AddSubject = By.xpath("//*[@id=\"subMenulibrary\"]/li[2]/a");
			
			By SubjectName = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[1]/div/div/input[1]");
			
			By CategoryName1 = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[3]/div/div");
			
			By CategoryName2 = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[3]/div/div/ul/li[2]");
			
			By SubjectCode = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[4]/div/div/input");
			
			By SaveSubject = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[5]/div/button");
		
			
			public void addsubject() throws InterruptedException {
				//Section>Add Subject
				
				driver.findElement(By.xpath("//*[@id=\"main-content\"]/section[2]/div/form/div/div/div/div[1]/div[1]/div[3]/div/div")).click();
				Thread.sleep(2000);
				
				int size = driver.findElements(By.xpath("//*[@id=\"main-content\"]/section[2]/div/form/div/div/div/div[1]/div[1]/div[3]/div/div/ul/li")).size();
				
				System.out.println(size);
				int i = 1;
				while(i<=size) {
				  String text = driver.findElement(By.xpath("//*[@id=\"main-content\"]/section[2]/div/form/div/div/div/div[1]/div[1]/div[3]/div/div/ul/li["+i+"]")).getText();
				 		
						 if(text.matches("TEST SUBJECT")) {
							 
							 System.out.println("Done");
							 
							 driver.findElement(By.xpath("//*[@id=\"main-content\"]/section[2]/div/form/div/div/div/div[1]/div[1]/div[3]/div/div/ul/li["+i+"]")).click();
						 } 
					 i=i+1;
			 }
			
				
				}
			
			public void AddBook() throws InterruptedException {
				
//				JavascriptExecutor js =(JavascriptExecutor)driver;
//				js.executeScript("window.scroll(0,4000)");
//				driver.findElement(Library).click();
//				Thread.sleep(2000);
//				
				
				//AddBookCategories
				driver.findElement(BookCategories).click();
				Thread.sleep(2000);
				
				driver.findElement(BookCategories_AddCategoriesname).sendKeys("Test Add Book Category");
				Thread.sleep(2000);
				
				driver.findElement(BookCategories_SaveCategoryButton).click();
				Thread.sleep(2000);
				
				//AddSubject
				driver.findElement(AddSubject).click();
				Thread.sleep(2000);
				
				driver.findElement(SubjectName).sendKeys("Test Subject");
				Thread.sleep(2000);
				
				driver.findElement(CategoryName1).click();
				Thread.sleep(2000);
				
				driver.findElement(CategoryName2).click();
				Thread.sleep(2000);
				
				driver.findElement(SubjectCode).sendKeys("111");
				Thread.sleep(2000);
				
				driver.findElement(SaveSubject).click();
				Thread.sleep(2000);	
				
				
				//AddBook
				driver.findElement(AddBook).click();
				Thread.sleep(2000);
				
				driver.findElement(AddBook_BookTitle).sendKeys("Test Book");
				Thread.sleep(2000);
				
				Selectbookcategory();
				Thread.sleep(2000);
				
				addsubject();
				Thread.sleep(2000);
				
				driver.findElement(AddBook_BookNo).sendKeys("11");
				Thread.sleep(2000);
				
				driver.findElement(AddBook_IsbnNo).sendKeys("11");
				Thread.sleep(2000);
				
				driver.findElement(AddBook_Publishername).sendKeys("Test Publisher");
				Thread.sleep(2000);
				
				
				driver.findElement(AddBook_AuthorName).sendKeys("Test Author");
				Thread.sleep(2000);
				
				driver.findElement(AddBook_RackNumber).sendKeys("11");
				Thread.sleep(2000);
				
				driver.findElement(AddBook_Quantity).sendKeys("11");
				Thread.sleep(2000);
				
				driver.findElement(AddBook_BookPrice).sendKeys("100");
				Thread.sleep(2000);
				
				driver.findElement(AddBook_SaveBook).click();
				Thread.sleep(2000);
				
				
				
			}
			
			
			
			By BookList = By.xpath("//*[@id=\"subMenulibrary\"]/li[4]/a");
			
			By BookList_ActionPlusButton = By.xpath("//*[@id=\"table_id\"]/tbody/tr[1]/td[1]");
			
			By BookList_SelectButton = By.xpath("//*[@id=\"table_id\"]/tbody/tr[1]/td[10]/div/button");
			
			By BookList_EditButton = By.xpath("//*[@id=\"table_id\"]/tbody/tr[1]/td[10]/div/div/a[1]");
			
			By BookList_UpdateButton = By.xpath("//*[@id=\"main-content\"]/section[2]/div/form/div/div/div/div[2]/div/button");
			
			By BookList_DeleteButton = By.xpath("//*[@id=\"table_id\"]/tbody/tr[1]/td[10]/div/div/a[2]");
			
			By BookList_DeleteButton2 = By.xpath("/html/body/div[3]/div/div/div[2]/div[2]/a/button");
			
			public void BookList() throws InterruptedException {
//				driver.findElement(Library).click();
//				Thread.sleep(2000);
				
				driver.findElement(BookList).click();
				Thread.sleep(2000);
				//Edit
				//driver.findElement(BookList_ActionPlusButton).click();
				//Thread.sleep(2000);
				
				driver.findElement(BookList_SelectButton).click();
				Thread.sleep(2000);
				
				driver.findElement(BookList_EditButton).click();
				Thread.sleep(2000);
				
				driver.findElement(BookList_UpdateButton).click();
				Thread.sleep(2000);
				
//				//Delete
//				
//				driver.findElement(BookList_ActionPlusButton).click();
//				Thread.sleep(2000);
//				
//				driver.findElement(BookList_SelectButton).click();
//				Thread.sleep(2000);
//				
//				driver.findElement(BookList_DeleteButton).click();
//				Thread.sleep(2000);
//				
//				driver.findElement(BookList_DeleteButton2).click();
//				Thread.sleep(2000);
			}
			
			
			By AddMember = By.xpath("//*[@id=\"subMenulibrary\"]/li[5]/a");
			
			By AddMember_MemberType1 = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[1]/div[1]/div");
			
			By AddMember_MemberTypeStudent = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[1]/div[1]/div/ul/li[3]");
			
			By AddMember_SelectClass1 = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[1]/div[2]/div/div[1]/div");
			
			By AddMember_SelectClass2 = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[1]/div[2]/div/div[1]/div/ul/li[2]");
			
			By AddMember_SelectSection1 = By.xpath("//*[@id=\"select_section__member_div\"]/div[1]");
			
			By AddMember_SelectSection2 = By.xpath("//*[@id=\"select_section__member_div\"]/div[1]/ul/li[2]");
			
			By AddMember_SelectStudent1 = By.xpath("//*[@id=\"select_student_div\"]/div[1]");
			
			//By AddMember_SelectStudent2 = By.xpath("//*[@id=\"select_student_div\"]/div[1]/ul/li[2]");
			
			By AddMember_Savemember = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[2]/div/button");
			
			By AddMember_MemberID = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[1]/div[4]/div/input");
			
			By AddMember_ActionPlusButton = By.xpath("//*[@id=\"table_id\"]/tbody/tr/td[1]");
			
			By AddMember_CancelMembership = By.xpath("//*[@id=\"table_id\"]/tbody/tr/td[7]/a");
			
			public void Student() throws InterruptedException {
				//Section>Add Subject
				
				int size = driver.findElements(By.xpath("//*[@id=\"select_student_div\"]/div[1]/ul/li")).size();
				
				System.out.println(size);
				int i = 1;
				while(i<=size) {
				  String text = driver.findElement(By.xpath("//*[@id=\"select_student_div\"]/div[1]/ul/li["+i+"]")).getText();
				 		
						 if(text.matches("TEST STUDENT")) {
							 
							 System.out.println("Done");
							 
							 driver.findElement(By.xpath("//*[@id=\"select_student_div\"]/div[1]/ul/li["+i+"]")).click();
						 } 
					 i=i+1;
			 }
			
				
				}
			
			
			public void AddMember() throws InterruptedException {
				
//				driver.findElement(Library).click();
//				Thread.sleep(2000);
				
				driver.findElement(AddMember).click();
				Thread.sleep(2000);
				
				driver.findElement(AddMember_MemberType1).click();
				Thread.sleep(2000);
				
				driver.findElement(AddMember_MemberTypeStudent).click();
				Thread.sleep(2000);
				
				driver.findElement(AddMember_SelectClass1).click();
				Thread.sleep(2000);
				
				driver.findElement(AddMember_SelectClass2).click();
				Thread.sleep(2000);
				
				driver.findElement(AddMember_SelectSection1).click();
				Thread.sleep(2000);
				
				driver.findElement(AddMember_SelectSection2).click();
				Thread.sleep(2000);
				
				driver.findElement(AddMember_SelectStudent1).click();
				Thread.sleep(2000);
				
				Student();
				Thread.sleep(2000);
				
				driver.findElement(AddMember_MemberID).sendKeys("01");
				Thread.sleep(2000);
				
				driver.findElement(AddMember_Savemember).click();
				Thread.sleep(2000);
				
				driver.findElement(AddMember_ActionPlusButton).click();
				Thread.sleep(2000);
				
				driver.findElement(AddMember_CancelMembership).click();
				Thread.sleep(2000);
				
			}
			
			
By IssueReturnnBook = By.xpath("//*[@id=\"subMenulibrary\"]/li[6]/a");
			
			By IssueRetrunBook_IssueSort= By.xpath("//*[@id=\"table_id\"]/thead/tr/th[5]");
			
			By IssueReturnnBookButton = By.xpath("//*[@id=\"table_id\"]/tbody/tr/td[6]/a");
			
			By IssueReturnnBook_SelectBook1 = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div[3]/div/form/div/div/div[1]/div[1]/div/div");
			
			By IssueReturnnBook_SelectBook2 = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div[3]/div/form/div/div/div[1]/div[1]/div/div/ul/li[2]");
			
			By IssueReturnnBook_Calendar = By.xpath("//*[@id=\"due_date\"]");
			
			By IssueReturnnBook_IssueBookButton = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div[3]/div/form/div/div/div[2]/div/button");
			
			By IssueReturnnBook_ReturnBook = By.xpath("//*[@id=\"table_id\"]/tbody/tr/td[6]/div/a");
			
			By IssueReturnBook_ReturnPopUp =By.xpath("/html/body/div[3]/div/div/div[2]/div[2]/a/button");
		
			
			public void Return_calendar_Date() throws InterruptedException {
				int size = driver.findElements(By.xpath("//body/div[5]/div[1]/table/tbody/tr/td[2]")).size();
				//System.out.println("Size" + size);
				
				int i=1;
				int j;
				
				outerloop:
				while (i<=size) {
					
						
					for(j=1;j<=7;j++) {
						
						String text=driver.findElement(By.xpath("//body/div[5]/div[1]/table/tbody/tr["+i+"]/td["+j+"]")).getAttribute("class");
						System.out.println(text);
						if(text.matches("active day")) {
							
							System.out.println("Entered IN IF");
							driver.findElement(By.xpath("//body/div[5]/div[1]/table/tbody/tr["+i+"]/td["+(j+1)+"]")).click();
							Thread.sleep(2000);
							
					
							break outerloop;
							
						}
						
						
						
					}
					
					i++;
				}
				
				
				Thread.sleep(2000);
				
			}
			
			
			public void Issue_Return_Book() throws InterruptedException{
			
//				driver.findElement(Library).click();
//				Thread.sleep(2000);	
				
			
				
			driver.findElement(IssueReturnnBook).click();
			Thread.sleep(2000);
			
			driver.findElement(IssueReturnnBookButton).click();
			Thread.sleep(2000);
			
			driver.findElement(IssueReturnnBook_SelectBook1).click();
			Thread.sleep(2000);
			
			driver.findElement(IssueReturnnBook_SelectBook2).click();
			Thread.sleep(2000);
			
			driver.findElement(IssueReturnnBook_Calendar).click();
			Thread.sleep(2000);
			
			Return_calendar_Date();
			Thread.sleep(2000);				
			
			driver.findElement(IssueReturnnBook_IssueBookButton).click();
			Thread.sleep(2000);
			
			
			
			returnbook();
			Thread.sleep(2000);
			
			//Return
			
			driver.findElement(IssueReturnnBook_ReturnBook).click();
			Thread.sleep(2000);
			
			driver.findElement(IssueReturnBook_ReturnPopUp).click();
			Thread.sleep(2000);
			
			}
			
			
			
			public void returnbook() throws InterruptedException {
				driver.findElement(IssueRetrunBook_IssueSort).click();
				Thread.sleep(1000);
				
				int size = driver.findElements(By.xpath("//*[@id=\"table_id\"]/tbody/tr[1]")).size();
				System.out.println(size);
				
				
				for(int i=1; i<=1; i++ ) {
					String text = driver.findElement(By.xpath("//*[@id=\"table_id\"]/tbody/tr["+i+"]")).getText();
					if(text.matches("RETURN"));
					
					driver.findElement(By.xpath("//*[@id=\"table_id\"]/tbody/tr["+i+"]")).click();
					Thread.sleep(2000);
					
				}
			}
			
			
}
			
			
			
			




