package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Leave {
	
	WebDriver d;
	
	@FindBy(xpath="//div[contains(text(),'Leave')]")
	WebElement leave;  //*[@id=\"sidebar_menu\"]/li[13]/a/div[2]
	
	//leave type
	@FindBy(xpath="//*[@id=\"subMenuLeaveManagement\"]/li[1]/a")
	WebElement leaveType;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[1]/div/div/input[1]")
	WebElement addLeaveType;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[2]/div/button")
	WebElement saveLeaveType;
	
	@FindBy(xpath="//*[@id=\"table_id\"]/tbody/tr[2]/td[2]/div/button")
	WebElement selectLeaveType;
	
	@FindBy(xpath="//*[@id=\"table_id\"]/tbody/tr[2]/td[2]/div/div/a[1]")
	WebElement editLeaveType;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div[2]/div[1]/div/div/form/div/div/div[2]/div/button")
	WebElement updateLeaveType;
	
	@FindBy(xpath="//*[@id=\"table_id\"]/tbody/tr[2]/td[2]/div/div/a[2]")
	WebElement deleteLeaveType;
	
	@FindBy(xpath="//*[@id=\"deleteLeaveTypeModal10\"]/div/div/div[1]/h4")
	WebElement text;
	
	@FindBy(xpath="/html/body/div[2]/div/section[2]/div/div/div[2]/div[2]/div/div[2]/div/div/div[2]/div[2]/button[2]")
	WebElement confirmDelete;
	
	
	//leave define
	
	
	
	@FindBy(xpath="//*[@id=\"subMenuLeaveManagement\"]/li[2]/a")
	WebElement leaveDefine;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[1]/div[1]/div")
	WebElement selectUserForleave;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[1]/div[1]/div/ul/li[2]")
	WebElement userSelectionForLeave;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[1]/div[2]/div/div[1]/div")
	WebElement selectClassForLeave;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[1]/div[2]/div/div[1]/div/ul/li[2]")
	WebElement classSelectionForLeave;
	
	@FindBy(xpath="//*[@id=\"select_section__member_div\"]/div[1]")
	WebElement selectSectionForLeave;
	
	@FindBy(xpath="//*[@id=\"select_section__member_div\"]/div[1]/ul/li[3]")
	WebElement sectionSelectionForLeave;
	
	@FindBy(xpath="//*[@id=\"select_student_div\"]/div[1]")
	WebElement selectStudentForLeave;
	
	@FindBy(xpath="//*[@id=\"select_student_div\"]/div[1]/ul/li[3]")
	WebElement studentSelectionForLeave;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[2]/div/div")
	WebElement selectTypeForLeave;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[2]/div/div/ul/li[2]")
	WebElement typeSelectionForLeave;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[3]/div/div/input")
	WebElement selectDays;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[4]/div/button")
	WebElement saveLeave;
	
	@FindBy(xpath="//*[@id=\"table_id\"]/tbody/tr[2]/td[5]/div/button")
	WebElement selectLeaveDefine;
	
	@FindBy(xpath="//*[@id=\"table_id\"]/tbody/tr[2]/td[5]/div/div/a[1]")
	WebElement editLeaveDefine;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div[2]/div[1]/div/div/form/div/div/div[4]/div/button")
	WebElement updateLeaveDefine;
	
	@FindBy(xpath="//*[@id=\"table_id\"]/tbody/tr[2]/td[5]/div/div/a[2]")
	WebElement addDays;
	
	@FindBy(xpath="//*[@id=\"addLeaveDayModal\"]/div/div/div[2]/form/div[2]/button[2]")
	WebElement updateLeave;
	
	@FindBy(xpath="//*[@id=\"table_id\"]/tbody/tr[2]/td[5]/div/div/a[3]")
	WebElement deleteLeaveDefine;
	
	@FindBy(xpath="//*[@id=\"deleteLeaveDefineModal\"]/div/div/div[2]/div[2]/form/button")
	WebElement confirm;
	
	//approve leave request
	
	@FindBy(xpath="//*[@id=\"subMenuLeaveManagement\"]/li[3]/a")
	WebElement approveLeaveRequest;
	
	@FindBy(xpath="//body[1]/div[2]/div[1]/section[2]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[7]/div[1]/button[1]")
	WebElement selectApproveLeave;
	
	@FindBy(xpath="//*[@id=\"table_id\"]/tbody/tr/td[7]/div/div/a[1]")
	WebElement approveRequest;
	
	@FindBy(xpath="//*[@id=\"showDetaildModalBody\"]/div/div/div/div[1]/div/form/div[2]/div/div/button")
	WebElement saveLeaveStatus;
	
	@FindBy(xpath="//*[@id=\"table_id\"]/tbody/tr/td[7]/div/div/a[2]")
	WebElement deleteApproveLeave;
	
	@FindBy(xpath="//body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/label[1]")
	WebElement confirmApprovedStatus;  //body/div[3]/div/div/div[2]/div/div/div/div[1]/div/form/div[1]/div/div[2]/div/div[1]/label
	
	@FindBy(xpath="//*[@id=\"deleteApplyLeaveModal1\"]/div/div/div[2]/div[2]/button[2]")
	WebElement confirmStatus;
	
	//pending Leave Request
	
	@FindBy(xpath="//*[@id=\"subMenuLeaveManagement\"]/li[4]/a")
	WebElement pendingLeaveRequest;
	
	@FindBy(xpath="//*[@id=\"table_id\"]/tbody/tr/td[7]/div/button")
	WebElement selectPendingLeave;
	
	@FindBy(xpath="//*[@id=\"table_id\"]/tbody/tr/td[7]/div/div/a[1]")
	WebElement viewRequest;
	
	@FindBy(xpath="//*[@id=\"showDetaildModalBody\"]/div/div/div/div[1]/div/form/div[1]/div/div[2]/div/div[2]/label")
	WebElement clickStatus;
	
	@FindBy(xpath="//*[@id=\"showDetaildModalBody\"]/div/div/div/div[1]/div/form/div[2]/div/div/button")
	WebElement savePendingLeaveStatus;
	
	@FindBy(xpath="//*[@id=\"table_id\"]/tbody/tr/td[7]/div/div/a[2]")
	WebElement deletePendingLeave;
	
	@FindBy(xpath="//*[@id=\"deleteApplyLeaveModal3\"]/div/div/div[2]/div[2]/button[2]")
	WebElement confirmPendingStatus;
	
	
	
	
	
	
	
	public POM_Leave(WebDriver driver) {
		
		d= driver;
		PageFactory.initElements(d, this);
	}
	
	public void leaveType() throws InterruptedException {
		
		leave.click();
		Thread.sleep(1000);
		
		leaveType.click();
		Thread.sleep(1000);
		
		addLeaveType.sendKeys("Test");
		Thread.sleep(1000);
		
		saveLeaveType.click();
		Thread.sleep(1000);
		
		leaveTypeAction();
		
		
		
	}
	
	
	public void leaveDefine() throws InterruptedException {
		
		leave.click();
		Thread.sleep(1000);
		
		leaveDefine.click();
		Thread.sleep(1000);
		
		
		leaveDefineCondition();
		
		selectLeaveDefine.click();
		Thread.sleep(1000);
		
		editLeaveDefine.click();
		Thread.sleep(1000);
		
		updateLeaveDefine.click();
		Thread.sleep(1000);
		
		selectLeaveDefine.click();
		Thread.sleep(1000);
		
		addDays.click();
		Thread.sleep(1000);
		
		d.getWindowHandle();
		
		updateLeave.click();
		Thread.sleep(1000);
		
		selectLeaveDefine.click();
		Thread.sleep(1000);
		
		deleteLeaveDefine.click();
		Thread.sleep(1000);
		
		d.getWindowHandle();
		
		confirm.click();
		Thread.sleep(1000);
		
			
		
	}
	
	
	public void approveLeaveRequest() throws InterruptedException {
		
//		leave.click();
//		Thread.sleep(1000);
		
		approveLeaveRequest.click();
		Thread.sleep(1000);
		
		int size= d.findElements(By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr")).size();
		///html/body/div[2]/div/section[2]/div/div[2]/div/div[3]/table/tbody/tr[1]
		System.out.println(size);  
		
		if(size==0) {
			
			pendingLeaveRequest() ;
			
			
			
		}
		
		else {
			
			
			
			
			selectApproveLeave.click();
			Thread.sleep(1000);
			
			approveRequest.click();
			Thread.sleep(1000);
			
			d.getWindowHandle();
			
			confirmApprovedStatus.click();
			Thread.sleep(1000);
			
			saveLeaveStatus.click();
			Thread.sleep(1000);
			
			
		}
		
		
		
		
		
		/*
		selectApproveLeave.click();
		Thread.sleep(1000);
		
		deleteApproveLeave.click();
		Thread.sleep(1000);
		
		d.getWindowHandle();
		Thread.sleep(1000);
		
		confirmStatus.click();
		Thread.sleep(1000);
		*/
		
		
	}
	
	public void pendingLeaveRequest() throws InterruptedException {
		
//		leave.click();
//		Thread.sleep(1000);
		
		
		
		
		pendingLeaveRequest.click();
		Thread.sleep(1000);
		
		
		int size = d.findElements(By.xpath("//body/div[2]/div/section[2]/div/div[2]/div/div/table/tbody/tr")).size();
		System.out.println(size);
		
		
		
		boolean check= true;
		
		while(check) {
			
			if(size==1) {
				
				break;
			}
			
			else {
				
				selectPendingLeave.click();
				Thread.sleep(1000);
				
				viewRequest.click();
				Thread.sleep(1000);
				
				clickStatus.click();
				Thread.sleep(1000);
				
				d.getWindowHandle();
				
				savePendingLeaveStatus.click();
				Thread.sleep(1000);
			}
			
			
			check= false;
			
			
		}
		
		
		
		
		
		
		
		
		
		
		/*
		selectPendingLeave.click();
		Thread.sleep(1000);
		
		deletePendingLeave.click();
		Thread.sleep(1000);
		d.getWindowHandle();
		confirmPendingStatus.click();
		Thread.sleep(1000);
		*/
		
	}
	
	public void leaveTypeAction() throws InterruptedException {
		
		selectLeaveType.click();
		Thread.sleep(1000);
		
		editLeaveType.click();
		Thread.sleep(1000);
		
		updateLeaveType.click();
		Thread.sleep(1000);
		
		selectLeaveType.click();
		Thread.sleep(1000);
		
		deleteLeaveType.click();
		Thread.sleep(1000);
		
		
		d.getWindowHandle();
		
		
		confirmDelete.click();
		Thread.sleep(1000);
		
	}
	
	public void leaveDefineCondition() throws InterruptedException {
		
		
		
		int i=2;
		
		//body[1]/div[2]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]
		while(i<=3) {
			
			String text= d.findElement(By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li["+ i +"]")).getText();
			System.out.println(text);
			
			
			if(i==2) {
				
				selectUserForleave.click();
				Thread.sleep(1000);
				
				userSelectionForLeave.click();
				Thread.sleep(1000);
				
				selectClassForLeave.click();
				Thread.sleep(1000);
				
				classSelectionForLeave.click();
				Thread.sleep(1000);
				
				selectSectionForLeave.click();
				Thread.sleep(1000);
				
				sectionSelectionForLeave.click();
				Thread.sleep(1000);
				
				selectStudentForLeave.click();
				Thread.sleep(1000);
				
				studentSelectionForLeave.click();
				Thread.sleep(1000);
			}
			
			else {
				
				selectUserForleave.click();
				Thread.sleep(1000);
				
				
				// teacher select
				d.findElement(By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]")).click();
				Thread.sleep(1000);
				
				//teacher name
				d.findElement(By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/div[1]")).click();
				Thread.sleep(1000);
				
				//teacher name selection
				d.findElement(By.xpath("//body[1]/div[2]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[2]")).click();
				Thread.sleep(1000);
				
				
			}
			
			selectTypeForLeave.click();
			Thread.sleep(1000);
			
			typeSelectionForLeave.click();
			Thread.sleep(1000);
			
			selectDays.sendKeys("10");
			Thread.sleep(1000);
			
			saveLeave.click();
			Thread.sleep(1000);
			
			i++;
			
		}
	}
	
	public void leavedefineActions() throws InterruptedException {
		
		selectLeaveDefine.click();
		Thread.sleep(1000);
		
		editLeaveDefine.click();
		Thread.sleep(1000);
		
		updateLeaveDefine.click();
		Thread.sleep(1000);
	}

}
