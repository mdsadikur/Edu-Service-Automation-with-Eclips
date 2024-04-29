package PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Common_Method.CommonMethod;


public class POM_Homework {

	WebDriver d;

	CommonMethod cm = new CommonMethod();

	@FindBy(xpath = "//div[contains(text(),'HomeWork')]")
	WebElement homework;  //*[@id=\"sidebar_menu\"]/li[18]/a/div[2]

	// Add Homework
	@FindBy(xpath = "//*[@id=\"subMenuHomework\"]/li[1]/a")
	WebElement addHomework;

	@FindBy(xpath = "//*[@id=\"main-content\"]/section[2]/div/form/div/div/div/div[1]/div[1]/div[1]/div/div")
	WebElement addhomeworkClass;

	@FindBy(xpath = "//*[@id=\"main-content\"]/section[2]/div/form/div/div/div/div[1]/div[1]/div[1]/div/div/ul/li[2]")
	WebElement homeworkSelectClass;

	@FindBy(xpath = "//*[@id=\"subjectSelecttHomeworkDiv\"]/div[1]")
	WebElement homeworkSubejct;

	@FindBy(xpath = "//*[@id=\"subjectSelecttHomeworkDiv\"]/div[1]/ul/li[2]")
	WebElement homeworkSubjectSelection;

	@FindBy(xpath = "//*[@id=\"selectSectionsDiv\"]/div[2]/label")
	WebElement sectionSelect;

	@FindBy(xpath = "//*[@id=\"submission_date\"]")
	WebElement submissionDate;

	@FindBy(xpath = "//body[1]/div[5]/div[1]/table[1]/thead[1]/tr[1]/th[2]")
	WebElement monthYear;

	@FindBy(xpath = "//body[1]/div[5]/div[1]/table[1]/thead[1]/tr[1]/th[3]")
	WebElement rightArrow;

	@FindBy(xpath = "//body[1]/div[5]/div[1]/table[1]/tbody[1]/tr[2]/td[5]")
	WebElement calendarDate;

	@FindBy(xpath = "//*[@id=\"main-content\"]/section[2]/div/form/div/div/div/div[1]/div[2]/div[3]/div/div/div/input")
	WebElement addMark;

	@FindBy(xpath = "//*[@id=\"description *\"]")
	WebElement addDescription;

	@FindBy(xpath = "//*[@id=\"main-content\"]/section[2]/div/form/div/div/div/div[2]/div/button")
	WebElement saveHomework;

	// Homework List
	@FindBy(xpath = "//*[@id=\"subMenuHomework\"]/li[2]/a")
	WebElement homeworkList;

	@FindBy(xpath = "//*[@id=\"main-content\"]/section[2]/div/div[2]/div/div/form/div/div[1]/div/div")
	WebElement listSelectClass;

	@FindBy(xpath = "//*[@id=\"main-content\"]/section[2]/div/div[2]/div/div/form/div/div[1]/div/div/ul/li[2]")
	WebElement listClassSelection;

	@FindBy(xpath = "//*[@id=\"select_class_subject_div\"]/div[1]")
	WebElement listHomeworkSubejct;

	@FindBy(xpath = "//*[@id=\"select_class_subject_div\"]/div[1]/ul/li[2]")
	WebElement listHomeworkSubjectSelection;

	@FindBy(xpath = "//*[@id=\"m_select_subject_section_div\"]/div[1]/span")
	WebElement listSection;

	@FindBy(xpath = "//*[@id=\"m_select_subject_section_div\"]/div[1]/ul/li[2]")
	WebElement listSectionSelection;

	@FindBy(xpath = "//*[@id=\"main-content\"]/section[2]/div/div[2]/div/div/form/div/div[4]/button")
	WebElement listSearch;

	@FindBy(xpath = "//*[@id=\"table_id\"]/tbody/tr/td[1]")
	WebElement plusButton;

	@FindBy(xpath = "//*[@id=\"table_id\"]/tbody/tr[1]/td[9]/div/button")
	WebElement listSelect;  //*[@id="table_id"]/tbody/tr[1]/td[9]/div/button

	@FindBy(xpath = "//*[@id=\"table_id\"]/tbody/tr[1]/td[9]/div/div/a[2]")
	WebElement listEdit;

	@FindBy(xpath = "//*[@id=\"table_id\"]/tbody/tr[1]/td[9]/div/div/a[1]")
	WebElement listEvalution;

	@FindBy(xpath = "//*[@id=\"main-content\"]/section[2]/div/form/div/div/div/div[2]/div/button")
	WebElement updateHomework;

	@FindBy(xpath = "//*[@id=\"main-content\"]/section[2]/div/div/div/div/div/form/div/div[1]/div[1]/div/table/tbody/tr/td[3]/div/input")
	WebElement marks;

	@FindBy(xpath = "//*[@id=\"main-content\"]/section[2]/div/div/div/div/div/form/div/div[1]/div[1]/div/table/tbody/tr/td[4]/div/div[1]/label")
	WebElement good;

	@FindBy(xpath = "//*[@id=\"main-content\"]/section[2]/div/div/div/div/div/form/div/div[1]/div[1]/div/table/tbody/tr/td[5]/div/div[1]/label")
	WebElement complete;

	@FindBy(xpath = "//*[@id=\"main-content\"]/section[2]/div/div/div/div/div/form/div/div[1]/div[2]/div/div/button")
	WebElement saveEvalution;

	// homework Evalution Report
	@FindBy(xpath = "//*[@id=\"subMenuHomework\"]/li[3]/a")
	WebElement evaluation;

	@FindBy(xpath = "//*[@id=\"main-content\"]/section[2]/div/div[2]/div/div/form/div/div[1]/div/div")
	WebElement evaluationSelectClass;

	@FindBy(xpath = "//*[@id=\"main-content\"]/section[2]/div/div[2]/div/div/form/div/div[1]/div/div/ul/li[2]")
	WebElement evaluationClassSelection;

	@FindBy(xpath = "//*[@id=\"select_class_subject_div\"]/div[1]/span")
	WebElement evaluationHomeworkSubejct;

	@FindBy(xpath = "//*[@id=\"select_class_subject_div\"]/div[1]/ul/li[2]")
	WebElement evaluationHomeworkSubjectSelection;

	@FindBy(xpath = "//*[@id=\"m_select_subject_section_div\"]/div[1]")
	WebElement evaluationSection;

	@FindBy(xpath = "//*[@id=\"m_select_subject_section_div\"]/div[1]/ul/li[2]")
	WebElement evaluationSectionSelection;

	@FindBy(xpath = "//*[@id=\"main-content\"]/section[2]/div/div[2]/div/div/form/div/div[4]/button")
	WebElement evaluationSearch;

	@FindBy(xpath = "//*[@id=\"table_id\"]/tbody/tr[1]/td[6]/div/button")
	WebElement evaluationSelect;

	@FindBy(xpath = "//*[@id=\"table_id\"]/tbody/tr[1]/td[6]/div/div/a")
	WebElement evaluationView;

	@FindBy(xpath = "//*[@id=\"modalSize\"]/div/div[1]/button")
	WebElement evaluationCross;

	public POM_Homework(WebDriver driver) {

		d = driver;
		PageFactory.initElements(d, this);
	}

	public void addHomework() throws InterruptedException {
		homework.click();
		Thread.sleep(1000);

		addHomework.click();
		Thread.sleep(1000);
		System.out.println("Successfully Enter in Homework");

		addhomeworkClass.click();
		Thread.sleep(1000);

		homeworkSelectClass.click();
		Thread.sleep(1000);

		homeworkSubejct.click();
		Thread.sleep(1000);

		homeworkSubjectSelection.click();
		Thread.sleep(1000);

		sectionSelect.click();
		Thread.sleep(2000);

		selectDate("NOVEMBER 2023");
		Thread.sleep(2000);

		addMark.sendKeys("10");
		Thread.sleep(1000);

		addDescription.sendKeys("Must Submit");
		Thread.sleep(1000);

		saveHomework.click();
		Thread.sleep(1000);
		System.out.println("Successfully saved Homework");

	}

	public void homeworkList() throws InterruptedException {

//		homework.click();
//		Thread.sleep(1000);

		homeworkList.click();
		Thread.sleep(1000);
		System.out.println("Successfully Enter in Homework List");

		homeworkSearch();

		cm.scroll();
		Thread.sleep(1000);

//		plusButton.click();
//		Thread.sleep(1000);

		editHomeWorkActions();
		
		homeworkSearch();


		cm.scroll();
		Thread.sleep(1000);
//
//		plusButton.click();
//		Thread.sleep(1000);
		 
		

		evaluationHomeWorkActions();
		System.out.println("Successfully close Homework list");

	}

	public void evaluationList() throws InterruptedException {

//		homework.click();
//		Thread.sleep(1000);

		evaluation.click();
		Thread.sleep(1000);
		System.out.println("Successfully Enter in evaluation");

		evaluationSearchList();

		cm.scroll();
		Thread.sleep(1000);
		
		evaluationActions();
		Thread.sleep(1000);
		System.out.println("Checkout from Homework");
		
	}

	public String selectDate(String month) {

		submissionDate.click();
		while (true) {
			String text = monthYear.getText(); // locator is month and year

			if (text.equals(month)) {
				break;
			} else {

				rightArrow.click(); // locator of site arrow.you have to change it
			}
		}

		calendarDate.click();
		return month;

	}
	
	public void homeworkSearch() throws InterruptedException {
		
		listSelectClass.click();
		Thread.sleep(1000);

		listClassSelection.click();
		Thread.sleep(1000);

		listHomeworkSubejct.click();
		Thread.sleep(1000);

		listHomeworkSubjectSelection.click();
		Thread.sleep(1000);

		listSection.click();
		Thread.sleep(1000);

		listSectionSelection.click();
		Thread.sleep(1000);

		listSearch.click();
		Thread.sleep(1000);
	}

	public void editHomeWorkActions() throws InterruptedException {

		listSelect.click();
		Thread.sleep(1000);

		listEdit.click();
		Thread.sleep(1000);

		updateHomework.click();
		Thread.sleep(1000);
	}

	public void evaluationHomeWorkActions() throws InterruptedException {
		listSelect.click();
		Thread.sleep(1000);

		listEvalution.click();
		Thread.sleep(1000);

		marks.clear();
		marks.sendKeys("9");
		Thread.sleep(1000);

		good.click();
		Thread.sleep(1000);

		complete.click();
		Thread.sleep(1000);

		saveEvalution.click();
		Thread.sleep(1000);

	}
	
	public void evaluationSearchList() throws InterruptedException {
		evaluationSelectClass.click();
		Thread.sleep(1000);

		evaluationClassSelection.click();
		Thread.sleep(1000);

		evaluationHomeworkSubejct.click();
		Thread.sleep(1000);

		evaluationHomeworkSubjectSelection.click();
		Thread.sleep(1000);

		evaluationSection.click();
		Thread.sleep(1000);

		evaluationSectionSelection.click();
		Thread.sleep(1000);

		evaluationSearch.click();
		Thread.sleep(1000);
	}
	
	public void evaluationActions() throws InterruptedException {
		
		evaluationSelect.click();
		Thread.sleep(1000);

		evaluationView.click();
		Thread.sleep(1000);

		d.getWindowHandle();

		evaluationCross.click();
		Thread.sleep(1000);

//		d.close();

	}

}
