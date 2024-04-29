package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class POM_Academics {
	WebDriver driver = null;

	public POM_Academics(WebDriver driver) {
		this.driver = driver;
	}

	By Academics = By.xpath("//*[@id=\"sidebar_menu\"]/li[5]/a/div[2]");

	// Class
	By Class = By.xpath("//*[@id=\"subMenuAcademic\"]/li[3]/a");

	// Class_Add Class
	By Class_AddClass = By.xpath(
			"//body[1]/div[2]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]");
	By Class_Section_Morning = By.xpath("//label[contains(text(),'Section Morning')]");
	By Class_Section_Day = By.xpath("//label[contains(text(),'Section Day')]");
	By Class_SaveButton = By.xpath(
			"//body[1]/div[2]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/button[1]");

	By Class_Search = By.xpath("//*[@id=\"table_id_filter\"]/label/input");

	// Class_Class List
	By Class_SelectButton = By.xpath("//button[contains(text(),'Select')]");

	// Class_Edit
	By Class_Edit = By.xpath("//a[contains(text(),'Edit')]");
	By Class_UpdateButton = By
			.xpath("//*[@id=\"main-content\"]/section[2]/div/div[2]/div[1]/div/div/form/div/div/div[3]/div/button");

	// Class_Delete
	By Class_Delete = By.xpath("//*[@id=\"table_id\"]/tbody/tr[1]/td[3]/div/div/a[2]");
	By Class_Delete2 = By
			.xpath("/html/body/div[2]/div/section[2]/div/div/div[2]/div[2]/div/div[3]/div/div/div[2]/div[2]/a/button");

	public void Class() throws InterruptedException {
		driver.findElement(Academics).click();
		Thread.sleep(2000);

		driver.findElement(Class).click();
		Thread.sleep(2000);

		driver.findElement(Class_AddClass).sendKeys("Class 12");
		Thread.sleep(2000);

		driver.findElement(Class_Section_Day).click();
		driver.findElement(Class_Section_Morning).click();
		Thread.sleep(2000);

		driver.findElement(Class_SaveButton).click();
		Thread.sleep(2000);

		System.out.println("Successfully Class Created");

		// Edit
		driver.findElement(Class_Search).sendKeys("Class 12");
		Thread.sleep(2000);

		driver.findElement(Class_SelectButton).click();
		Thread.sleep(2000);

		driver.findElement(Class_Edit).click();
		Thread.sleep(2000);
		driver.findElement(Class_UpdateButton).click();
		Thread.sleep(2000);

		System.out.println("Successfully Class Updated");

		// Delete
		driver.findElement(Class_SelectButton).click();
		Thread.sleep(2000);
		driver.findElement(Class_Delete).click();
		Thread.sleep(2000);

		driver.getWindowHandle();
		Thread.sleep(2000);
		driver.findElement(Class_Delete2).click();
		Thread.sleep(2000);

		System.out.println("Successfully Class Deleted");
	}

	/// Section
	By Section = By.xpath("//*[@id=\"subMenuAcademic\"]/li[2]/a");

	// Section_Add Section
	By Section_Name = By
			.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[1]/div/div/input[1]");
	By Section_SaveButton = By
			.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[2]/div/button");

	By Section_Search = By.xpath("//*[@id=\"table_id_filter\"]/label/input");

	By Section_Select = By.xpath("//*[@id=\"table_id\"]/tbody/tr[1]/td[2]/div/button");

	// Section_Edit
	By Section_Edit = By.xpath("//tbody/tr[1]/td[2]/div[1]/div[1]/a[1]");
	By Section_UpdateButton = By
			.xpath("//*[@id=\"main-content\"]/section[2]/div/div[2]/div[1]/div/div/form/div/div/div[2]/div/button");

	// Section_Delete
	By Section_Delete = By.xpath("//*[@id=\"table_id\"]/tbody/tr[1]/td[2]/div/div/a[2]");
	By Section_Delete2 = By
			.xpath("/html/body/div[2]/div/section[2]/div/div/div[2]/div[2]/div/div[3]/div/div/div[2]/div[2]/a/button");

	public void section() throws InterruptedException {

//		driver.findElement(Academics).click();
//		Thread.sleep(2000);
//		

		driver.findElement(Section).click();
		Thread.sleep(2000);
		driver.findElement(Section_Name).sendKeys("Test Section");
		Thread.sleep(2000);
		driver.findElement(Section_SaveButton).click();
		Thread.sleep(2000);

		System.out.println("Successfully Section Created");

		// Edit
		driver.findElement(Section_Search).sendKeys("Test Section");
		Thread.sleep(2000);

		driver.findElement(Section_Select).click();
		Thread.sleep(2000);

		driver.findElement(Section_Edit).click();
		Thread.sleep(2000);
		driver.findElement(Section_UpdateButton).click();
		Thread.sleep(2000);

		System.out.println("Successfully Class Updated");

		// Delete
		driver.findElement(Section_Search).sendKeys("Test Section");
		Thread.sleep(2000);

		driver.findElement(Section_Select).click();
		Thread.sleep(2000);
		driver.findElement(Section_Delete).click();
		Thread.sleep(2000);
		driver.findElement(Section_Delete2).click();
		Thread.sleep(2000);

		System.out.println("Successfully Section Deleted");

	}

	// ClassRoom
	By ClassRoom = By.xpath("//*[@id=\"subMenuAcademic\"]/li[7]/a");

	// ClassRoom_AddClassRoom
	By Classroom_RoomNumber = By
			.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[1]/div/div/input[1]");
	By Classroom_Capacity = By
			.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[2]/div/div/input");
	By Classroom_SaveClassRoom = By
			.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[3]/div/button");

	// ClassRoom_Search
	By Classroom_Search = By.xpath("//*[@id=\"table_id_filter\"]/label/input");

	By Classroom_SelectButton = By.xpath("//*[@id=\"table_id\"]/tbody/tr/td[3]/div/button");
	// Classroom_Edit
	By Classroom_Edit = By.xpath("//*[@id=\"table_id\"]/tbody/tr/td[3]/div/div/a[1]");
	By Classroom_Update = By
			.xpath("//*[@id=\"main-content\"]/section[2]/div/div[2]/div[1]/div/div/form/div/div/div[3]/div/button");

	// Classroom_Delete
	By Classroom_Delete = By.xpath("//*[@id=\"table_id\"]/tbody/tr/td[3]/div/div/a[2]");
	By Classroom_Delete2 = By
			.xpath("/html/body/div[2]/div/section[2]/div/div/div[2]/div[2]/div/div[2]/div/div/div[2]/div[2]/button[2]");

	public void classroom() throws InterruptedException {

//		driver.findElement(Academics).click();
//		Thread.sleep(2000);
//		
		driver.findElement(ClassRoom).click();
		Thread.sleep(2000);
		driver.findElement(Classroom_RoomNumber).sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(Classroom_Capacity).sendKeys("20");
		Thread.sleep(2000);
		driver.findElement(Classroom_SaveClassRoom).click();
		Thread.sleep(2000);

		System.out.println("Successfully Classroom Created");

		// Edit
		driver.findElement(Classroom_Search).click();
		Thread.sleep(2000);
		driver.findElement(Classroom_SelectButton).click();
		Thread.sleep(2000);
		driver.findElement(Classroom_Edit).click();
		Thread.sleep(2000);
		driver.findElement(Classroom_Update).click();
		Thread.sleep(2000);

		System.out.println("Successfully Classroom Updated");

		// Delete

		driver.findElement(Classroom_Search).click();
		Thread.sleep(2000);
		driver.findElement(Classroom_SelectButton).click();
		Thread.sleep(2000);
		driver.findElement(Classroom_Delete).click();
		Thread.sleep(2000);
		driver.findElement(Classroom_Delete2).click();
		Thread.sleep(2000);

		System.out.println("Successfully Classroom Deleted");

	}

	// Subjects
	By Subject = By.xpath("//*[@id=\"subMenuAcademic\"]/li[4]/a");

	// Subject_AddSubject
	By Subjects_SubjectName = By
			.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[1]/div/div/input[1]");
	By Subject_Theory = By.xpath(
			"//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[2]/div/div/div[1]/label");
	By Subject_SubjectCode = By
			.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[3]/div/div/input");
	By Subject_SaveButton = By
			.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[4]/div/button");

	// Subject Select Button

	By Subject_Select = By.xpath("//*[@id=\"table_id\"]/tbody/tr[1]/td[5]/div/button");

	// Subject Edit

	By Subject_Edit = By.xpath("//*[@id=\"table_id\"]/tbody/tr[1]/td[5]/div/div/a[1]");
	By Subject_UpdateButton = By
			.xpath("//*[@id=\"main-content\"]/section[2]/div/div[2]/div[1]/div/div/form/div/div/div[4]/div/button");

	// Delete

	By Subject_Delete = By.xpath("//*[@id=\"table_id\"]/tbody/tr[1]/td[5]/div/div/a[2]");
	By Subject_Delete2 = By
			.xpath("/html/body/div[2]/div/section[2]/div/div/div[2]/div[2]/div/div[1]/div/div/div[2]/div[2]/a/button");

	public void subject() throws InterruptedException {

//		driver.findElement(Academics).click();
//		Thread.sleep(2000);
//		
		driver.findElement(Subject).click();
		Thread.sleep(2000);

		// Add Subject
		driver.findElement(Subjects_SubjectName).sendKeys("Test Subject");
		Thread.sleep(2000);
		driver.findElement(Subject_SubjectCode).sendKeys("103");
		Thread.sleep(2000);
		driver.findElement(Subject_Theory).click();
		Thread.sleep(2000);
		driver.findElement(Subject_SaveButton).click();
		Thread.sleep(2000);

		System.out.println("Successfully Subject Created");

		// Edit
		driver.findElement(Subject_Select).click();
		Thread.sleep(2000);
		driver.findElement(Subject_Edit).click();
		Thread.sleep(2000);
		driver.findElement(Subject_UpdateButton).click();
		Thread.sleep(2000);

		System.out.println("Successfully Subject Updated");

		// Delete
		driver.findElement(Subject_Select).click();
		Thread.sleep(2000);
		driver.findElement(Subject_Delete).click();
		Thread.sleep(2000);
		driver.findElement(Subject_Delete2).click();
		Thread.sleep(2000);

		System.out.println("Successfully Subject Deleted");
	}

//Class Teacher

	By AssignClassTeacher = By.xpath("//*[@id=\"subMenuAcademic\"]/li[5]/a");

	// ClassTeacher_AssignClassTeacher

	By ClassTeacher_SelectClass = By
			.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[1]/div/div");
	By ClassTeacher_SelectClassDropdown = By
			.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[1]/div/div/ul/li[2]");

	By ClassTeacher_SelectSection = By.xpath("//*[@id=\"select_section_div\"]/div[1]");
	By ClassTeacher_SelectSectionDropdown = By.xpath("//*[@id=\"select_section_div\"]/div[1]/ul/li[2]");
	By ClassTeacher_Teacher = By
			.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[3]/div/div[1]/label");

	By ClassTeacher_SaveClassTeacher = By
			.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[4]/div/button");

	By ClassTeacher_SelectTeacher = By.xpath("//*[@id=\"table_id\"]/tbody/tr/td[4]/div/button");

	// Edit Button

	By ClassTeacher_Edit = By.xpath("//*[@id=\"table_id\"]/tbody/tr/td[4]/div/div/a[1]");
	By ClassTeacher_UpdateButton = By
			.xpath("//*[@id=\"main-content\"]/section[2]/div/div[2]/div[1]/div/div/form/div/div/div[4]/div/button");

	// Delete

	By ClassTeacher_Delete = By.xpath("//tbody/tr[1]/td[4]/div[1]/div[1]/a[2]");
	By ClassTeacher_Delete2 = By
			.xpath("/html/body/div[2]/div/section[2]/div/div/div[2]/div[2]/div/div[1]/div/div/div[2]/div[2]/button[2]");

	public void classteacher() throws InterruptedException {
//		driver.findElement(Academics).click();
//		Thread.sleep(2000);

		driver.findElement(AssignClassTeacher).click();
		Thread.sleep(2000);

		// Assign Class Teacher
		driver.findElement(ClassTeacher_SelectClass).click();
		Thread.sleep(2000);
		driver.findElement(ClassTeacher_SelectClassDropdown).click();
		Thread.sleep(2000);
		driver.findElement(ClassTeacher_SelectSection).click();
		Thread.sleep(2000);
		driver.findElement(ClassTeacher_SelectSectionDropdown).click();
		Thread.sleep(2000);
		driver.findElement(ClassTeacher_Teacher).click();
		Thread.sleep(2000);
		driver.findElement(ClassTeacher_SaveClassTeacher).click();
		Thread.sleep(2000);

		System.out.println("Successfully Class Teacher Created");

		// Edit ClassTeacher

		driver.findElement(ClassTeacher_SelectTeacher).click();
		Thread.sleep(2000);
		driver.findElement(ClassTeacher_Edit).click();
		Thread.sleep(2000);
		driver.findElement(ClassTeacher_UpdateButton).click();
		Thread.sleep(2000);

		System.out.println("Successfully Class Teacher Updated");

		// Delete ClassTeacher
		driver.findElement(ClassTeacher_SelectTeacher).click();
		Thread.sleep(2000);
		driver.findElement(ClassTeacher_Delete).click();
		Thread.sleep(2000);
		driver.findElement(ClassTeacher_Delete2).click();
		Thread.sleep(2000);

		System.out.println("Successfully Class Teacher Deleted");
	}

	// Assign Subject
	By AssignSubject = By.xpath("//*[@id=\"subMenuAcademic\"]/li[6]/a");

	// Add Assign Subject
	By AssignSubject_AddAssignSubject = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div[1]/div[2]/a");
	By AssignSubject_SelectClass = By.xpath("//*[@id=\"search_student\"]/div/div[1]/div");
	By AssignSubject_SelectClass3 = By.xpath("//*[@id=\"search_student\"]/div/div[1]/div/ul/li[2]");
	By AssignSubject_SelectSection = By.xpath("//*[@id=\"select_section_div\"]/div[1]");
	By AssignSubject_SelectSectionMorning = By.xpath("//*[@id=\"select_section_div\"]/div[1]/ul/li[2]");
	By AssignSubject_SearchButton = By.xpath("//*[@id=\"search_student\"]/div/div[3]/button");
	By AssignSubject_SaveButton = By.xpath("//*[@id=\"assign_subject\"]/div/div[2]/button");

	public void assignsubject() throws InterruptedException {
//		driver.findElement(Academics).click();
//		Thread.sleep(2000);

		driver.findElement(AssignSubject).click();
		Thread.sleep(1000);

		// Add Assignment subject
		driver.findElement(AssignSubject_AddAssignSubject).click();
		Thread.sleep(1000);

		driver.findElement(AssignSubject_SelectClass).click();
		Thread.sleep(1000);

		driver.findElement(AssignSubject_SelectClass3).click();
		Thread.sleep(1000);

		driver.findElement(AssignSubject_SelectSection).click();
		Thread.sleep(1000);

		driver.findElement(AssignSubject_SelectSectionMorning).click();
		Thread.sleep(1000);

		driver.findElement(AssignSubject_SearchButton).click();
		Thread.sleep(1000);

		// Save subject
		driver.findElement(AssignSubject_SaveButton).click();
		Thread.sleep(1000);

		System.out.println("Successfully Assign Subject Created");

	}

//Optional Subject

	By OptionalSubject = By.xpath("//body[1]/div[2]/nav[1]/ul[1]/li[5]/ul[1]/li[1]/a[1]");
	By OptionalSubject_SelectClass = By.xpath("//*[@id=\"search_student\"]/div/div[1]/div");
	By OptionalSubject_SelectClass3 = By.xpath("//*[@id=\"search_student\"]/div/div[1]/div/ul/li[2]");
	By OptionalSubject_SelectSection = By.xpath("//*[@id=\"select_section_div\"]/div[1]");
	By OptionalSubject_SelectSectionMorning = By.xpath("//*[@id=\"select_section_div\"]/div[1]/ul/li[2]");

	By OptionalSubject_SelectSubject = By.xpath("//*[@id=\"select_subject_div\"]/div[1]");
	By OptionalSubject_SelectSubjectPhysics = By.xpath("//*[@id=\"select_subject_div\"]/div[1]/ul/li[2]");

	By OptionalSubject_SearchButton = By.xpath("//*[@id=\"search_student\"]/div/div[4]/button");

	// Assign Optional Subject
	By OptionalSubject_SelectAllButton = By.xpath("//*[@id=\"all_check\"]");
	By OptionalSubject_AssignSubjectButton = By.xpath("//*[@id=\"formid\"]/div/div[2]/button");

	public void optionalsubject() throws InterruptedException {

		driver.findElement(Academics).click();
		Thread.sleep(2000);

		driver.findElement(OptionalSubject).click();
		Thread.sleep(2000);

		driver.findElement(OptionalSubject_SelectClass).click();
		Thread.sleep(2000);

		driver.findElement(OptionalSubject_SelectClass3).click();
		Thread.sleep(2000);

		driver.findElement(OptionalSubject_SelectSection).click();
		Thread.sleep(2000);

		driver.findElement(OptionalSubject_SelectSectionMorning).click();
		Thread.sleep(2000);

		driver.findElement(OptionalSubject_SelectSubject).click();
		Thread.sleep(2000);

		driver.findElement(OptionalSubject_SelectSubjectPhysics).click();
		Thread.sleep(2000);

		driver.findElement(OptionalSubject_SearchButton).click();
		Thread.sleep(2000);

		driver.findElement(OptionalSubject_AssignSubjectButton).click();
		Thread.sleep(2000);

		System.out.println("Optional Subject Clicked");
	}

//Class Routine

	By ClassRoutine = By.xpath("/html/body/div[2]/nav/ul/li[5]/ul/li[8]/a");

	By ClassRoutine_SelectClass1 = By.xpath("//*[@id=\"search_student\"]/div/div[1]/div");

	By ClassRoutine_SelectClass2 = By.xpath("//*[@id=\"search_student\"]/div/div[1]/div/ul/li[2]");

	By ClassRoutine_SelectSection = By.xpath("//*[@id=\"select_section_div\"]/div[1]");

	By ClassRoutine_SelectSearchButton = By.xpath("//*[@id=\"search_student\"]/div/div[3]/button");

	// Create
	By ClassRoutine_AddButton = By.xpath("//*[@id=\"addRowBtn\"]");

	// Class Routine_Class Routine
	By ClassRoutine_SelectSubject = By.xpath("//*[@id=\"classRoutineTable\"]/tbody/tr[\"+size+\"]/td[1]/div/div");

	By ClassRoutine_SelectSubject2 = By.xpath("//*[@id=\"classRoutineTable\"]/tbody/tr[2]/td[1]/div/div/ul/li[2]");

	// Class Routine_Select Teacher
	// By ClassRoutine_SelectTeacher =
	// By.xpath("//*[@id=\"classRoutineTable\"]/tbody/tr["+size+"]/td[2]/div/div");
	// By ClassRoutine_SelectTeacher1 = By.xpath("");

	// Class Routine_Time

	// By ClassRoutine_StartTime =
	// By.xpath("//*[@id=\"classRoutineTable\"]/tbody/tr["+size+"]/td[3]/div/div[1]/div/input");

	// By ClassRoutine_EndTime =
	// By.xpath("//*[@id=\"classRoutineTable\"]/tbody/tr[]/td[4]/div/div[1]/div/input")

	// Class Routine_Calendar
	By ClassRoutine_Calendar = By.xpath("//*[@id=\"row_1\"]/td[6]/div[1]/a/i");
	By ClassRoutine_Calendar2 = By.xpath("//*[@id=\"multipleDaysModal_1\"]/div/div/div[2]/div[1]/div[1]/label");
	By ClassRoutine_Calendar3 = By.xpath("//*[@id=\"multipleDaysModal_1\"]/div/div/div[2]/div[2]/div/button");

	// Classroom
	By ClassRoutine_Classroom = By.xpath("//*[@id=\"row_1\"]/td[7]/div/div/div");
	By ClassRoutine_Classroom1 = By.xpath(
			"/html/body/div[2]/div/section[3]/div/div[2]/div/div/div/div[2]/form/div[1]/div/table/tbody/tr/td[7]/div/div/div/ul/li[2]");

	// Savebutton
	By ClassRoutine_Savebutton = By.xpath("//*[@id=\"classRoutineSubmitButton\"]");

	// DeleteButton
	By ClassRoutine_Deletebutton1 = By.xpath("//*[@id=\"row_0\"]/td[8]/button");
	By ClassRoutine_Deletebutton2 = By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div[2]/button[2]");

	// Class Routine 2

	By ClassRoutine2_SelectSubject = By.xpath("//*[@id=\"row_2\"]/td[1]/div/div");

	By ClassRoutine2_SelectPhysics = By.xpath("//*[@id=\"row_2\"]/td[1]/div/div/ul/li[2]");

	By ClassRoutine2_SelectTeacher = By.xpath("//*[@id=\"teacher-div\"]/div/div[1]");
	By ClassRoutine2_SelectTeacher1 = By.xpath("//*[@id=\"teacher-div\"]/div/div[1]/ul/li[2]");

	By ClassRoutine2_StartTime = By.xpath("//*[@id=\"row_3\"]/td[3]/div/div[1]/div/input");

	By ClassRoutine2_EndTime = By.xpath("//*[@id=\"row_3\"]/td[4]/div/div[1]/div/input");

	By ClassRoutine2_Calendar = By.xpath("//*[@id=\"row_3\"]/td[6]/div[1]/a");
	By ClassRoutine2_Calendar2 = By.xpath("//*[@id=\"multipleDaysModal_3\"]/div/div/div[2]/label");
	By ClassRoutine2_Calendar3 = By.xpath("//*[@id=\"multipleDaysModal_3\"]/div/div/div[2]/div[2]/div/button");

	By ClassRoutine2_Classroom = By.xpath("//*[@id=\"row_3\"]/td[7]/div/div/div");
	By ClassRoutine2_Classroom1 = By.xpath(
			"/html/body/div[2]/div/section[3]/div/div[2]/div/div/div/div[2]/form/div[1]/div/table/tbody/tr[2]/td[7]/div/div/div/ul/li[2]");

	public void classroutine_condtion() throws InterruptedException {

		int size = driver.findElements(By.xpath("//*[@id=\"classRoutineTable\"]/tbody/tr")).size();

		driver.findElement(By.xpath("//*[@id=\"addRowBtn\"]")).click();
		Thread.sleep(1000);

		size = size + 1;

		System.out.println("Select Teacher");

		// Select Subject

		driver.findElement(By.xpath("//*[@id=\"classRoutineTable\"]/tbody/tr[" + size + "]/td[1]/div/div")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div[2]/div/section[3]/div/div[2]/div/div/div/div[2]/form/div[1]/div/table/tbody/tr["+size+"]/td[1]/div/div/ul/li[2]")).click();
		Thread.sleep(2000);

		// Select Teacher

		driver.findElement(By
				.xpath("/html/body/div[2]/div/section[3]/div/div[2]/div/div/div/div[2]/form/div[1]/div/table/tbody/tr["
						+ size + "]/td[2]/div/div/div[1]"))
				.click();
		Thread.sleep(2000);

		driver.findElement(By.xpath(
				"/html/body/div[2]/div/section[3]/div/div[2]/div/div/div/div[2]/form/div[1]/div/table/tbody/tr["+size+"]/td[2]/div/div/div[1]/ul/li[2]"))
				.click();
		Thread.sleep(2000);

		System.out.println("Teacher ");

		// Class Routine Startime
		driver.findElement(By
				.xpath("/html/body/div[2]/div/section[3]/div/div[2]/div/div/div/div[2]/form/div[1]/div/table/tbody/tr["
						+ size + "]/td[3]/div/div[1]/div/input"))
				.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(2000);

		driver.findElement(By
				.xpath("/html/body/div[2]/div/section[3]/div/div[2]/div/div/div/div[2]/form/div[1]/div/table/tbody/tr["
						+ size + "]/td[3]/div/div[1]/div/input"))
				.sendKeys(Keys.DELETE);
		Thread.sleep(2000);

		driver.findElement(By
				.xpath("/html/body/div[2]/div/section[3]/div/div[2]/div/div/div/div[2]/form/div[1]/div/table/tbody/tr["
						+ size + "]/td[3]/div/div[1]/div/input"))
				.sendKeys("7:00 AM");
		Thread.sleep(2000);

		// Class Routine End Time

		System.out.println("End time 1 ");

		driver.findElement(By
				.xpath("/html/body/div[2]/div/section[3]/div/div[2]/div/div/div/div[2]/form/div[1]/div/table/tbody/tr["
						+ size + "]/td[4]/div/div[1]/div/input"))
				.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(2000);

		System.out.println("End TIme 2");
		driver.findElement(By
				.xpath("/html/body/div[2]/div/section[3]/div/div[2]/div/div/div/div[2]/form/div[1]/div/table/tbody/tr["
						+ size + "]/td[4]/div/div[1]/div/input"))
				.sendKeys(Keys.DELETE);
		Thread.sleep(2000);

		System.out.println("End TIme 3");
		driver.findElement(By
				.xpath("/html/body/div[2]/div/section[3]/div/div[2]/div/div/div/div[2]/form/div[1]/div/table/tbody/tr["
						+ size + "]/td[4]/div/div[1]/div/input"))
				.sendKeys("8:30 AM");
		Thread.sleep(2000);

		// Class Routine
		driver.findElement(By
				.xpath("/html/body/div[2]/div/section[3]/div/div[2]/div/div/div/div[2]/form/div[1]/div/table/tbody/tr["
						+ size + "]/td[6]/div[1]/a"))
				.click();
		Thread.sleep(2000);

		driver.findElement(By
				.xpath("/html/body/div[2]/div/section[3]/div/div[2]/div/div/div/div[2]/form/div[1]/div/table/tbody/tr["
						+ size + "]/td[6]/div[2]/div/div/div[2]/label"))
				.click();
		Thread.sleep(2000);

		driver.findElement(By
				.xpath("/html/body/div[2]/div/section[3]/div/div[2]/div/div/div/div[2]/form/div[1]/div/table/tbody/tr["
						+ size + "]/td[6]/div[2]/div/div/div[2]/div[2]/div/button"))
				.click();
		Thread.sleep(2000);

		// Class Routine ClassRoom
		driver.findElement(By
				.xpath("/html/body/div[2]/div/section[3]/div/div[2]/div/div/div/div[2]/form/div[1]/div/table/tbody/tr["
						+ size + "]/td[7]/div/div/div"))
				.click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div[2]/div/section[3]/div/div[2]/div/div/div/div[2]/form/div[1]/div/table/tbody/tr[3]/td[7]/div/div/div/ul/li[2]")).click();
		Thread.sleep(2000);

	}

	public void classroutine() throws InterruptedException {
//		driver.findElement(Academics).click();
//		Thread.sleep(2000);

		driver.findElement(ClassRoutine).click();
		Thread.sleep(2000);

		driver.findElement(ClassRoutine_SelectClass1).click();
		Thread.sleep(2000);

		driver.findElement(ClassRoutine_SelectClass2).click();
		Thread.sleep(2000);

		driver.findElement(ClassRoutine_SelectSection).click();
		Thread.sleep(2000);

		driver.findElement(AssignSubject_SelectSectionMorning).click();
		Thread.sleep(2000);

		driver.findElement(ClassRoutine_SelectSearchButton).click();
		Thread.sleep(2000);

		System.out.println("Successfully Class Routine Searched");

//		driver.findElement(ClassRoutine_AddButton).click();
//		Thread.sleep(2000);

//		driver.findElement(ClassRoutine_SelectSubject).click();
//		Thread.sleep(2000);
//		
//		driver.findElement(ClassRoutine_SelectSubjectPhysics).click();
//		Thread.sleep(2000);
//		
//		driver.findElement(ClassRoutine_SelectTeacher).click();
//		Thread.sleep(2000);
//		
//		driver.findElement(ClassRoutine_SelectTeacher1).click();
//		Thread.sleep(2000);
//		
//		
//		driver.findElement(ClassRoutine_StartTime).sendKeys(Keys.CONTROL + "a");
//		Thread.sleep(2000);
//		
//		driver.findElement(ClassRoutine_StartTime).sendKeys(Keys.DELETE);
//		Thread.sleep(2000);
//		
//		driver.findElement(ClassRoutine_StartTime).sendKeys("7:00 PM");
//		Thread.sleep(2000);
//		
//		driver.findElement(ClassRoutine_EndTime).click();
//		Thread.sleep(2000);
//		
//		driver.findElement(ClassRoutine_EndTime).click();
//		Thread.sleep(2000);
//		
//		driver.findElement(ClassRoutine_Calendar).click();
//		Thread.sleep(2000);
//		
//		driver.findElement(ClassRoutine_Calendar2).click();
//		Thread.sleep(2000);
//		
//		driver.findElement(ClassRoutine_Calendar3).click();
//		Thread.sleep(2000);
//		
//		driver.findElement(ClassRoutine_Classroom).click();
//		Thread.sleep(2000);
//		
//		driver.findElement(ClassRoutine_Classroom1).click();
//		Thread.sleep(2000);

		classroutine_condtion();

		driver.findElement(ClassRoutine_Savebutton).click();
		Thread.sleep(2000);

		System.out.println("Successfully Class Routine Created");

//		
//		driver.findElement(ClassRoutine_Deletebutton1).click();
//		Thread.sleep(2000);
//		
//		driver.findElement(ClassRoutine_Deletebutton2).click();
//		Thread.sleep(2000);
//		
//		System.out.println("Successfully Class Routine Deleted");
	}

	// Teacher Class Routine
	By TeacherClassRoutine = By.xpath("//*[@id=\"subMenuAcademic\"]/li[9]/a");

	By TeacherClassRoutine_SelectTeacher = By
			.xpath("//*[@id=\"main-content\"]/section[2]/div/div[2]/div/div/form/div/div[1]/div");

	By TeacherClassRoutine_SelectTeacher1 = By
			.xpath("//*[@id=\"main-content\"]/section[2]/div/div[2]/div/div/form/div/div[1]/div/ul/li[2]");

	By TeacherClassRoutine_SearchButton = By
			.xpath("//*[@id=\"main-content\"]/section[2]/div/div[2]/div/div/form/div/div[2]/button");

	public void teacherclassroutine() throws InterruptedException {
		driver.findElement(Academics).click();
		Thread.sleep(2000);

		driver.findElement(TeacherClassRoutine).click();
		Thread.sleep(2000);

		driver.findElement(TeacherClassRoutine_SelectTeacher).click();
		Thread.sleep(2000);

		driver.findElement(TeacherClassRoutine_SelectTeacher1).click();
		Thread.sleep(2000);

		driver.findElement(TeacherClassRoutine_SearchButton).click();
		Thread.sleep(2000);

		System.out.println("Successfully Teacher Class Routine Searched");
	}

}
