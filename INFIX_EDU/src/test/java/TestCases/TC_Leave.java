package TestCases;

import org.testng.annotations.Test;

import PageObject.POM_Leave;



public class TC_Leave extends Base.DriverSetup{
	
	
	
	@Test(priority=16)
	public void leave() throws InterruptedException {
		
		POM_Leave leave= new POM_Leave(driver);
		
		leave.leaveType();
		Thread.sleep(1000);
		
		leave.leaveDefine();
		Thread.sleep(1000);
		
		leave.approveLeaveRequest();
		Thread.sleep(1000);
		
		leave.pendingLeaveRequest();
		Thread.sleep(1000);
	}

}
