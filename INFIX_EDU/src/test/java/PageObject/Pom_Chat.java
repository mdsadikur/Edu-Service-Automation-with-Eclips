package PageObject;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Common_Method.CommonMethod;


public class Pom_Chat {
	WebDriver driver = null;
	
	CommonMethod cm = new CommonMethod();
	
	public Pom_Chat(WebDriver driver) {
		this.driver=driver;
	}
	
	By Chat = By.xpath("//*[@id=\"sidebar_menu\"]/li[15]/a");
	
	By Chat_Box = By.xpath("//*[@id=\"subMenuChat\"]/li[1]/a");
	
	By Chat_Box_SearchPeopleGroup = By.xpath("//*[@id=\"users_list_sidebar\"]");
	
	By Chat_Box_StartOpenChat = By.xpath("//*[@id=\"admin-visitor-area\"]/div/div/div/div/div[2]/div[2]/div[2]/ul/li/div/div[3]/form/a");
	
	
	By Chat_Box_NewChatButton = By.xpath("//*[@id=\"admin-visitor-area\"]/div/div/div/div/div[1]/div[1]/a");
	
	By Chat_Box_CreateGroupButton1 = By.xpath("//*[@id=\"admin-visitor-area\"]/div/div/div/div/div[1]/div[2]/div/div[2]/label/a");
	
	By Chat_Box_GroupName = By.xpath("//*[@id=\"admin-visitor-area\"]/div/div/div/div/div[2]/div[2]/form/div/div[1]/input");
	
	By Chat_Box_GroupPhotoBrowse = By.xpath("//*[@id=\"admin-visitor-area\"]/div/div/div/div/div[2]/div[2]/form/div/div[2]/div/div[2]/button/label");
	
	By Chat_Box_GroupMemberButton1 = By.xpath("//*[@id=\"s2id_autogen1\"]/ul");
	
	By Chat_Box_CreateGroupButton2 = By.xpath("//*[@id=\"admin-visitor-area\"]/div/div/div/div/div[2]/div[2]/form/div/button");
	
	By Chat_Box_ChatTextArea = By.xpath("//*[@id=\"quill-container\"]/div[1]");
	
	By Chat_Box_ChatTextUploadfileButton = By.xpath("//*[@id=\"imgInp\"]");
	
	By Chat_Box_ChatSendButton = By.xpath("//*[@id=\"admin-visitor-area\"]/div/div/div/div/div[2]/div[1]/div[2]/form/div[1]/div[2]/div[2]/button[4]");
	
	By Chat_Box_AdminButton = By.xpath("//*[@id=\"dropdownMenu2\"]");
	
	By Chat_Box_AdminActive = By.xpath("//*[@id=\"admin-visitor-area\"]/div/div/div/div/div[2]/div[1]/div[1]/div[2]/div/a[1]");
	
	By Chat_Box_AdminInactive = By.xpath("//*[@id=\"admin-visitor-area\"]/div/div/div/div/div[2]/div[1]/div[1]/div[2]/div/a[2]");
	
	By Chat_Box_AdminAway = By.xpath("//*[@id=\"admin-visitor-area\"]/div/div/div/div/div[2]/div[1]/div[1]/div[2]/div/a[3]");
	
	By Chat_Box_AdminBusy = By.xpath("//*[@id=\"admin-visitor-area\"]/div/div/div/div/div[2]/div[1]/div[1]/div[2]/div/a[4]");
	
	By Chat_Box_MemberButton = By.xpath("//*[@id=\"dropdownMenu3\"]");
	
	By Chat_Box_MemberSearch = By.xpath("//*[@id=\"admin-visitor-area\"]/div/div/div/div/div[2]/div[1]/div[1]/div[1]/div/div/a[1]");
	
	By Chat_Box_MemberSearchKeyworkds = By.xpath("//*[@id=\"chat_search\"]/div/div/div[2]/div/div/div/input");
	
	By Chat_Box_MemberSearchButton = By.xpath("//*[@id=\"chat_search\"]/div/div/div[2]/div/div/button");
	
	By SelectMemeber = By.xpath("/html/body/div[7]/ul/li/div");
	
	
	By Chat_Box_MsgChatGroup = By.xpath("//*[@id=\"quill-container\"]/div[1]/p");
	
	By Chat_Box_MsgSentChatGroupButton = By.xpath("//*[@id=\"admin-visitor-area\"]/div/div/div/div/div[2]/div[1]/div[2]/form/div[1]/div[2]/div[2]/button[4]");
	
			
	By Chat_Box_GroupNameDropDown = By.xpath("//*[@id=\"dropdownMenu3\"]");
	
	By Chat_Box_GroupDeleteDropDown = By.xpath("//*[@id=\"admin-visitor-area\"]/div/div/div/div/div[2]/div[1]/div[1]/div[1]/div/div/a[7]");
	

	public void chatbox() throws AWTException, InterruptedException {
		
		
		driver.findElement(Chat).click();
		Thread.sleep(2000);
		
		driver.findElement(Chat_Box).click();
		Thread.sleep(2000);
		System.out.println("Successfully enter in chat box");
		
		
		//Create Chat Group with member
		driver.findElement(Chat_Box_SearchPeopleGroup).sendKeys("Manik Islam");
		Thread.sleep(2000);
		
		
		driver.findElement(Chat_Box_CreateGroupButton1).click();
		Thread.sleep(2000);
		
		driver.findElement(Chat_Box_GroupName).sendKeys("EDU Test Chat Group");
		Thread.sleep(2000);
		
		driver.findElement(Chat_Box_GroupPhotoBrowse).click();
		Thread.sleep(2000);
		
		String filePath2=cm.getFilePath("home-banner1.jpg");
		cm.JPEGUpload(filePath2);
		Thread.sleep(1000);
		
		driver.findElement(Chat_Box_GroupMemberButton1).click();
		Thread.sleep(2000);
		
		WebElement currentElement = driver.switchTo().activeElement();
		
		currentElement.sendKeys("Manik Islam");
		Thread.sleep(2000);
		
	
		currentElement.sendKeys(Keys.RETURN);
	    Thread.sleep(2000);
		
		driver.findElement(Chat_Box_CreateGroupButton2).click();
		Thread.sleep(2000);
		
		
		
		//Chatting in a chat group
		
		driver.findElement(Chat_Box_ChatTextArea).sendKeys("Hello My Name is Admin");
		Thread.sleep(2000);
		
//		driver.findElement(Chat_Box_ChatTextUploadfileButton).click();
//		Thread.sleep(2000);
//		
//		cm.fileupload("D:\\Aoradev51\\adv.jpg");
//		Thread.sleep(2000);
		
		driver.findElement(Chat_Box_ChatSendButton).click();
		Thread.sleep(2000);
		
		//Admin
		driver.findElement(Chat_Box_AdminButton).click();
		Thread.sleep(2000);
		
		driver.findElement(Chat_Box_AdminAway).click();
		Thread.sleep(2000);
		
		
		driver.findElement(Chat_Box_AdminButton).click();
		Thread.sleep(2000);
		driver.findElement(Chat_Box_AdminBusy).click();
		Thread.sleep(2000);
		
		driver.findElement(Chat_Box_AdminButton).click();
		Thread.sleep(2000);
		driver.findElement(Chat_Box_AdminInactive).click();
		Thread.sleep(2000);
		
		driver.findElement(Chat_Box_AdminButton).click();
		Thread.sleep(2000);
		driver.findElement(Chat_Box_AdminActive).click();
		Thread.sleep(2000);
		
		searchgroupname();
		Thread.sleep(2000);
		
		driver.findElement(Chat_Box_GroupNameDropDown).click();
		Thread.sleep(2000);
		
		driver.findElement(Chat_Box_MsgChatGroup).sendKeys("Hello");
		Thread.sleep(2000);
		
		driver.findElement(Chat_Box_MsgSentChatGroupButton).click();
		Thread.sleep(2000);
		System.out.println("Successfully complete chatbox");

	}
	
	public void searchgroupname() {
		int size = driver.findElements(By.xpath("//*[@id=\"admin-visitor-area\"]/div/div/div/div/div[1]/div[2]/div/div[3]/ul/li")).size();
		
		for(int i=1; i<=size; i++) {
			String text=driver.findElement(By.xpath("//*[@id=\"admin-visitor-area\"]/div/div/div/div/div[1]/div[2]/div/div[3]/ul/li["+i+"]")).getText();
			if(text.matches("EDU TEST CHAT GROUP"));{
				driver.findElement(By.xpath("//*[@id=\"admin-visitor-area\"]/div/div/div/div/div[1]/div[2]/div/div[3]/ul/li[\"+i+\"]")).click();
			}
		}
	}
	
	
	
	
	
	By Invitation = By.xpath("//*[@id=\"subMenuChat\"]/li[2]/a");
	
	By  Invitation_Wantstoconnect = By.xpath("//*[@id=\"admin-visitor-area\"]/div/div[2]/div/div/div[2]/div/ul/li/div/div[2]/a/h4");
	
	public void invitiation() throws InterruptedException {
		driver.findElement(Chat).click();
		Thread.sleep(2000);
		
		driver.findElement(Invitation).click();
		Thread.sleep(2000);
		System.out.println("Successfully enter in invitation");
		
		String text = driver.findElement(Invitation_Wantstoconnect).getText();
		System.out.println(text);
		Thread.sleep(2000);
		System.out.println("Successfully complete Invitation");
		
	}
	
	By Blocked_User = By.xpath("//*[@id=\"subMenuChat\"]/li[3]/a");
	
	public void blockeduser() throws InterruptedException {
		driver.findElement(Blocked_User).click();
		Thread.sleep(2000);
		System.out.println("Successfully enter in blocked user");
		System.out.println("Checkout from Chat");
	}
	

}
