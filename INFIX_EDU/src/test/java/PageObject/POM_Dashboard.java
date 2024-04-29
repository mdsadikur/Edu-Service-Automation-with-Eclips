package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Common_Method.CommonMethod;


public class POM_Dashboard {
	
	WebDriver d;
	
	CommonMethod cm= new CommonMethod();
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[1]/div/div[2]/div[1]/a/div")
	WebElement student;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[1]/div/div[2]/div[2]/a/div")
	WebElement teacher;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[1]/div/div[2]/div[4]/a/div")
	WebElement staff;
	
	@FindBy(xpath="//*[@id=\"barChartBtn\"]")
	WebElement monthlyIncomeMinimize;
	
	@FindBy(xpath="//*[@id=\"areaChartBtn\"]")
	WebElement yearlyIncomeMinimize;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[4]/div/div/div[2]/a/span")
	WebElement addNotice;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/form/div/div/div/div[1]/div/div[1]/div[1]/input")
	WebElement noticeTitle;
	
	@FindBy(xpath="//*[@id=\"article-ckeditor\"]")
	WebElement notice;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/form/div/div/div/div[2]/div/button")
	WebElement saveNotice;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[4]/div/div/div[3]/table/tbody/tr/td[3]/a")
	WebElement viewNotice;
	
	
	@FindBy(xpath="//*[@id=\"modalSize\"]/div/div[1]/button")
	WebElement viewCrossButton;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[5]/div/div/div[2]/div[1]/div[2]/a")
	WebElement addToDoList;
	
	@FindBy(xpath="//*[@id=\"todo_title\"]")
	WebElement todoTitle;
	
	
	@FindBy(xpath="//*[@id=\"add_to_do\"]/div/div/div[2]/div/form/div/div/div[3]/div/input")
	WebElement todoSave;
	
	@FindBy(xpath="//*[@id=\"toDoList\"]")
	WebElement incomplete;
	
	@FindBy(xpath="//*[@id=\"toDoListsCompleted\"]")
	WebElement complete;
	
	
	@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/ul[3]/li/div/span")
	WebElement theme;
	
	@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/ul[3]/li/div/ul/li[2]")
	WebElement defaultTheme;
	
	@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/ul[3]/li/div/ul/li[3]")
	WebElement lawnGreen;
	
	@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/ul[4]/li[1]/div/span")
	WebElement language;
	
	@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/ul[4]/li[1]/div/ul/li[2]")
	WebElement englishLanguage;
	
	@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/ul[4]/li[1]/div/ul/li[3]")
	WebElement banglaLanguage;
	
	@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/ul[4]/li[2]/a")
	WebElement chatIcon;
	
	
	@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/ul[4]/li[3]/div/button")
	WebElement notification;
	
	@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/ul[4]/li[3]/div/div/div/a")
	WebElement markAsRead;
	
	@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/ul[4]/li[4]/div")
	WebElement viewProfileIcon;
	
	@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/ul[4]/li[4]/div/div/div/ul/li[1]/a")
	WebElement viewProfile;
	
	
	
	
	public POM_Dashboard(WebDriver driver) {
		
		d= driver;
		PageFactory.initElements(d, this);
	}
	
	public void dashboard() throws InterruptedException {
		
		student.click();
		Thread.sleep(1000);
		
		d.navigate().back();
		
		teacher.click();
		Thread.sleep(1000);
		
		d.navigate().back();
		
		staff.click();
		Thread.sleep(1000);
		
		d.navigate().back();
		
		monthlyIncomeMinimize.click();
		Thread.sleep(1000);
		
		monthlyIncomeMinimize.click();
		Thread.sleep(1000);
		
		JavascriptExecutor js =(JavascriptExecutor)d;
		js.executeScript("window.scroll(0,500)");
		
		yearlyIncomeMinimize.click();
		Thread.sleep(1000);
		
		yearlyIncomeMinimize.click();
		Thread.sleep(1000);
		
		addNotice.click();
		Thread.sleep(1000);
		
		noticeTitle.sendKeys("Test Notice");
		Thread.sleep(1000);
		
		notice.sendKeys("This is a Test Notice");
		Thread.sleep(1000);
		
		int size= d.findElements(By.xpath("//body/div[2]/div[1]/section[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div/label[1]")).size();
		
		int i=1;
		
		while (i<=size) {
			
			d.findElement(By.xpath("//body/div[2]/div[1]/section[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div["+i+"]/label[1]")).click();
			
			i++;
		}
		
		Thread.sleep(1000);
		
		d.get("http://pos.rishfa.com/admin-dashboard");
		Thread.sleep(1000);
		
		
		js.executeScript("window.scroll(0,500)");
		Thread.sleep(1000);
		
		viewNotice.click();
		Thread.sleep(1000);
		
		d.getWindowHandle();
		
		viewCrossButton.click();
		Thread.sleep(1000);
		
		js.executeScript("window.scroll(500,1000)");
		Thread.sleep(1000);
		
		addToDoList.click();
		Thread.sleep(1000);
		
		d.getWindowHandle();
		Thread.sleep(1000);
		
		
		todoTitle.sendKeys("Test Work");
		Thread.sleep(1000);
		
		todoSave.click();
		Thread.sleep(1000);
		
		cm.scroll();
		Thread.sleep(1000);
		
//		incomplete.click();
//		Thread.sleep(1000);
		
		d.findElement(By.xpath("//body/div[2]/div/section[5]/div/div/div[2]/div[3]/div/div/div[2]/div/div/label")).click();
		Thread.sleep(1000);
		
		complete.click();
		Thread.sleep(1000);
		
		js.executeScript("window.scrollTo(document.body.scrollHeight,0);");
		Thread.sleep(5000);
		
		theme.click();
		Thread.sleep(1000);
		
		lawnGreen.click();
		Thread.sleep(1000);
		
		theme.click();
		Thread.sleep(1000);
		
		defaultTheme.click();
		Thread.sleep(1000);
		
		language.click();
		Thread.sleep(1000);
		
		banglaLanguage.click();
		Thread.sleep(1000);
		
		language.click();
		Thread.sleep(1000);
		
		englishLanguage.click();
		Thread.sleep(1000);
		
		chatIcon.click();
		Thread.sleep(1000);
		
		d.navigate().back();
		
		notification.click();
		Thread.sleep(1000);
		
		markAsRead.click();
		Thread.sleep(5000);
		
		
	}
	
	public void viewProfile() throws InterruptedException {
		
		cm.hover(viewProfileIcon);
		Thread.sleep(1000);
		
		viewProfile.click();
		Thread.sleep(1000);
		
		d.navigate().back();
		Thread.sleep(1000);
		System.out.println("Checkout from Dashboard");
		
	}

}
