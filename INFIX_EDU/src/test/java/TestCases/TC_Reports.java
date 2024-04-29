package TestCases;

import org.testng.annotations.Test;

import Base.DriverSetup;
import PageObject.POM_Reports;


public class TC_Reports extends DriverSetup{
	
	
	@Test
	public void reports() throws InterruptedException {
		
		
		POM_Reports reports= new POM_Reports(driver);
		
		
		
//		reports.studentReport();
//		Thread.sleep(1000);
//		
//		reports.guardianReport();
//		Thread.sleep(1000);
//		
//		reports.studentHistory();
//		Thread.sleep(1000);
//		
//		reports.studentLoginReport();
//		Thread.sleep(1000);
////		
//		
//		
//		reports.feesStatement();
//		Thread.sleep(1000);
		
//		reports.balanceFeesReport();
//		Thread.sleep(1000);
		
//		reports.classReport();
//		Thread.sleep(1000);
		
//		reports.classRoutine();
//		Thread.sleep(1000);
//		
//		reports.examRoutine();
//		Thread.sleep(1000);
//		
//		reports.meritListReport();
//		Thread.sleep(1000);
//		
//		
//		reports.onlineExamReport();
//		Thread.sleep(1000);
//		
//		reports.markSheetReport();
//		Thread.sleep(1000);
//		
//		reports.tabulationSheetReport();
//		Thread.sleep(1000);
//		
//		reports.progressCardReport();
//		Thread.sleep(1000);
//		
//		
//		reports.userLog();
//		Thread.sleep(2000);
//		
//		reports.previousResult();
//		Thread.sleep(1000);
//		
//		reports.previousRecord();
//		Thread.sleep(1000);
		
		reports.reports();
		Thread.sleep(1000);
		
	}

}
