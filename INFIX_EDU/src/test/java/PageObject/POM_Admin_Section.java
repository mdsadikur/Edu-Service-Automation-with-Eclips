package PageObject;

import java.awt.AWTException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import Common_Method.CommonMethod;

public class POM_Admin_Section {
	
	WebDriver driver = null;
	
	public POM_Admin_Section(WebDriver driver) {
		
		this.driver = driver;
	}
	
	//upload file call
	CommonMethod upload = new CommonMethod();
//	Utilities utility = new Utilities();
	
	//admission select
	By admission_select = By.xpath("(//div[contains(text(),'Admin Section')])");
	
	//admin setup
	By admin_setup = By.xpath("//a[contains(text(),'Admin Setup')]");
	
	//admin_setup_type
	By admin_setup_type = By.xpath("//div[@class='nice-select niceSelect w-100 bb form-control']");
	
	//admin_setup_source
	By admin_setup_source = By.xpath(
			"//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[1]/div/div/div/input");
	
	//admin setup add source
	By admin_setup_addSource = By.xpath("//li[contains(text(),'Source')]");
	
	//admin setup input name
	By admin_setup_inpuName = By.name("name");
	
	//admin setup description
	By admin_setup_description = By.name("description");
	
	//admin setup save 
	By admin_setup_save = By.xpath("//div[@class='row mt-40']//div//button");
	
	//admin setup purpose
	By admin_setup_purpose = By.xpath("//li[contains(text(),'Purpose')]");
	
	//admin setup complain type 
	By admin_setup_complainType = By.xpath("//li[contains(text(),'Complaint Type')]");
	
	//admin setup reference
	By admin_setup_reference = By.xpath("//li[contains(text(),'Reference')]");
	
	
	/*
	 * 
	 * 
	 * Admission Query
	 * 
	 * 
	 */
	
	//admission query
	By admission_query = By.xpath("//body/div[2]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/a[1]");
	
	//admission query add
	By admission_query_add = By.xpath("//button[@class='primary-btn-small-input primary-btn small fix-gr-bg']");
	
	//addmission queery add
	By admission_query_add_name = By.name("name");
	
	//admission query phone
	By admission_query_phone = By.name("phone");
	
	//admission query email
	By admission_query_email = By.name("email");
	
	//admission query address
	By admission_query_address = By.name("address");
	
	//admission query description
	By admission_query_description = By.name("description");
	
	
	/*
	 * 
	 */
	
	//admission query date from
	By addmission_query_date_from = By.id("startDate");
	
	//addmission query monthyear
	By admission_query_monthyear = By.xpath("/html/body/div[6]/div[1]/table/thead/tr[1]/th[2]");
	
	//admission query site bar
	By admission_query_sitebar = By.xpath("//body[1]/div[6]/div[1]/table[1]/thead[1]/tr[1]/th[1]");
	
	//admission query pickdate
	public int day = 15;
	By admission_query_pickdate = By.xpath("/html[1]/body[1]/div[6]/div[1]/table[1]/tbody[1]/tr/td[contains(text(),"+day+")]") ;
	
	/*
	 * 
	 */
	
	// admission query date To
	By addmission_query_date_To = By.id("endDate");

	// addmission query monthyear2
	By admission_query_monthyear2 = By.xpath("/html/body/div[6]/div[1]/table/thead/tr[1]/th[2]");

	// admission query site bar
	By admission_query_sitebar2 = By.xpath("//body[1]/div[6]/div[1]/table[1]/thead[1]/tr[1]/th[1]");

	// admission query pickdate
	public int day2 = 20;
	By admission_query_pickdate2 = By.xpath("/html[1]/body[1]/div[6]/div[1]/table[1]/tbody[1]/tr/td[contains(text(),"+day2+")]");
	
	/*
	 * 
	 */
	
	//admission query assign
	By admission_query_assign = By.id("assigned");
	
	//addmission query reference
	By admission_query_reference = By.xpath("//*[@id=\"admission-query-store\"]/div/div/div/div[4]/div/div[1]/div");
	
	//admission query specific reference
	By admission_query_specific_reference = By.xpath("//li[contains(text(),'Minhazul')]");
	
	//admission query source
	By admission_query_source = By.xpath("//*[@id=\"admission-query-store\"]/div/div/div/div[4]/div/div[2]/div");
	
	//admission query specific source
	By admission_query_specific_source = By.xpath("//*[@id=\"admission-query-store\"]/div/div/div/div[4]/div/div[2]/div/ul/li[2]");
	
	//admission query class
	By admission_query_class2 = By.xpath("//*[@id=\"admission-query-store\"]/div/div/div/div[4]/div/div[3]/div");
	
	//admission query specific class
	By admission_query_specific_class = By.xpath("//li[contains(text(),'Class 3')]");
	
	//admission query no of child
	By admission_query_child_no = By.id("no_of_child");
	
	//admission query save
	By admission_query_save = By.xpath("//button[@id='save_button_query']");
	
	/*
	 * 
	 * select action
	 * 
	 */
	
	//admission query select
	By admission_query_select = By.xpath("(//button[@class='btn dropdown-toggle'])[1]");
	
	//admission query add query
	By admission_query_add_query = By.xpath("//tbody/tr[1]/td[8]/div[1]/div[1]/a[1]");
	
	//admission_query edit
	By admission_query_edit = By.xpath("//*[@id=\"table_id\"]/tbody/tr[1]/td[8]/div/div/a[2]");
	
	//admission query update
	By admission_query_update = By.xpath("//button[@id='update_button_query']");
	
	//admission query delete
	By admission_query_delete = By.xpath("//*[@id=\"table_id\"]/tbody/tr[1]/td[8]/div/div/a[3]");
	
	// admission query delete cancel
	By admission_query_delete_cancel = By.xpath("(//button[@class='primary-btn tr-bg'])[1]");

	// admission query delete confirm
	By admission_query_delete_confirm = By.xpath("(//button[@class='primary-btn fix-gr-bg'])[1]");
	
	
	/*
	 * 
	 * add query date
	 * 
	 */
	
	// admission query date To
	By addmission_addquery_date_from = By.id("startDate");

	// addmission query monthyear2
	By admission_addquery_monthyear = By.xpath("/html[1]/body[1]/div[5]/div[1]/table[1]/thead[1]/tr[1]/th[2]");

	// admission query site bar
	By admission_addquery_sitebar = By.xpath("//body[1]/div[5]/div[1]/table[1]/thead[1]/tr[1]/th[1]");

	// admission query pickdate
	public int day3 = 15;
	By admission_addquery_pickdate = By
			.xpath("/html[1]/body[1]/div[5]/div[1]/table[1]/tbody[1]/tr/td[contains(text()," + day3 + ")]");
	
	/*
	 * 
	 */
	
	// admission query date To
	By addmission_addquery_date_To = By.id("endDate");

	// addmission query monthyear2
	By admission_addquery_monthyear2 = By.xpath("/html[1]/body[1]/div[5]/div[1]/table[1]/thead[1]/tr[1]/th[2]");

	// admission query site bar
	By admission_addquery_sitebar2 = By.xpath("//body[1]/div[5]/div[1]/table[1]/thead[1]/tr[1]/th[1]");

	// admission query pickdate
	public int day4 = 20;
	By admission_addquery_pickdate2 = By
			.xpath("/html[1]/body[1]/div[5]/div[1]/table[1]/tbody[1]/tr/td[contains(text()," + day4 + ")]");
	
	/*
	 * 
	 */
	//admission query  status
	By admission_query_status = By.xpath("(//div[@class='nice-select niceSelect w-100 bb'])[1]");
	
	//admission query specific status
	By admission_query_specific_status = By.xpath("//li[@class='option selected focus']");
	
	//admission query response
	By admission_query_response = By.name("response");
	
	//admission query note
	By admission_query_note = By.name("note");
	
	//admission_query_save_button
	By admission_query_save_button = By.xpath("//button[@class='primary-btn fix-gr-bg submit']");
	
	/*
	 * action select
	 */
	//admission query
	String admissionQuery_url = "http://pos.rishfa.com/admission-query";
	//admission query follow up select
	By admissionQuery_followup_select = By.xpath("(//button[@class='btn dropdown-toggle'])[1]");
	
	//admission query follow up delete
	By admissionQuery_followup_delete = By.xpath("//*[@id=\"table_id\"]/tbody/tr[1]/td[5]/div/div/a");
	
	//admission query follow up delete cancel
	By admissionQuery_followup_deletecancel = By.xpath("(//button[@class='primary-btn tr-bg'])[1]");
	
	// admission query follow up delete confirm
	By admissionQuery_followup_deleteconfirm = By.xpath("(//a[@class='text-light primary-btn fix-gr-bg'])[1]");
	
	
	/*
	 * 
	 * 
	 * Visitors book
	 * 
	 * 
	 */
	
	//visitors book
	By visitors_book = By.xpath("//a[text()='Visitor Book ']");
	
	//visit_purpose
	By visit_purpose = By.name("purpose");
	
	//visitor name
	By visitor_name = By.name("name");
	
	//visitor phone
	By visitor_phone = By.name("phone");
	
	//visitor id
	By visitor_id = By.name("visitor_id");
	
	//visitor person
	By visitor_person = By.name("no_of_person");
	
	/*
	 * 
	 */
	
	// Visitor date To
	By Visitor_date_To = By.id("startDate");

	// Visitor monthyear2
	By Visitor_monthyear = By.xpath("/html[1]/body[1]/div[5]/div[1]/table[1]/thead[1]/tr[1]/th[2]");

	// Visitor site bar
	By Visitor_sitebar = By.xpath("//body[1]/div[5]/div[1]/table[1]/thead[1]/tr[1]/th[1]");

	// Visitor pickdate
	public int day5 = 20;
	By Visitor_pickdate = By
			.xpath("/html[1]/body[1]/div[5]/div[1]/table[1]/tbody[1]/tr/td[contains(text()," + day5 + ")]");
	
	/*
	 * 
	 */
	
	//visitor in time
	By visitor_inTime = By.name("in_time");
	
	//visitor out time
	By visitor_outTime = By.name("out_time");
	
	/*
	 * 
	 */
	
	//visitor file
	By visitor_file = By.xpath("//label[@class='primary-btn small fix-gr-bg']");
	
	//visitor save button
	By visitor_save_button = By.xpath("//button[@class='primary-btn fix-gr-bg submit']");
	
	/*
	 * 
	 * action select
	 * 
	 */
	
	//visitor select
	By visitor_select = By.xpath("//button[@class='btn dropdown-toggle']");
	
	//visitor edit
	By visitor_edit = By.xpath("//*[@id=\"table_id\"]/tbody/tr/td[9]/div/div/a[1]");
	
	//visitor delete
	By visitor_delete = By.xpath("//*[@id=\"table_id\"]/tbody/tr[1]/td[9]/div/div/a[2]");
	
	//visitor delete cancel
	By visitor_delete_cancel = By.xpath("(//button[@class='primary-btn tr-bg'])[1]");
	
	//visitor delete confirm
	By visitor_delete_confirm = By.xpath("(//a[@class='primary-btn fix-gr-bg'])[1]");
	
	

	
	
	/*
	 * 
	 * 
	 * Complaint
	 * 
	 * 
	 */
	
	//complaint
	By complaint = By.xpath("//body/div[2]/nav[1]/ul[1]/li[3]/ul[1]/li[3]/a[1]");
	
	//complaint name
	By complaint_name = By.name("complaint_by");
	
	//complain type
	By complaint_type = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[2]/div/div");
	
	//complaint specific type
	By complaint_specific_type = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[2]/div/div/ul/li[2]");
	
	//complaint source
	By complaint_source = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[3]/div/div");
	
	//complaint specific source
	By complaint_specific_source = By.xpath("//li[contains(text(),'Md Sadikur Rahman')]");
	
	//complaint phone
	By complaint_phone = By.name("phone");
	
	/*
	 * 
	 */
	
	// complaint date To
	By complaint_date_To = By.id("startDate");

	// complaint monthyear2
	By complaint_monthyear = By.xpath("/html[1]/body[1]/div[5]/div[1]/table[1]/thead[1]/tr[1]/th[2]");

	// complaint site bar
	By complaint_sitebar = By.xpath("//body[1]/div[5]/div[1]/table[1]/thead[1]/tr[1]/th[1]");

	// complaint pickdate
	public int day6 = 20;
	By complaint_pickdate = By
			.xpath("/html[1]/body[1]/div[5]/div[1]/table[1]/tbody[1]/tr/td[contains(text()," + day6 + ")]");
	
	/*
	 * 
	 * 
	 */
	
	//complaint action taken
	By complaint_action_taken = By.name("action_taken");
	
	//complaint assign
	By complaint_assign = By.name("assigned");
	
	//complaint description
	By complaint_description = By.name("description");
	
	/*
	 * 
	 */
	
	//complaint browse
	By complaint_browse = By.xpath("//label[contains(text(),'Browse')]");
	
	/*
	 * 
	 */
	
	//complaint save
	By complaint_save = By.xpath("//button[@class='primary-btn fix-gr-bg now_wrap_lg submit']");
	
	/*
	 * 
	 * action select
	 * 
	 */
	
	//complaint select
	By complaint_select = By.xpath("//tbody/tr[1]/td[7]/div[1]/button[1]");
	
	//complaint view
	By complaint_view = By.xpath("//tbody/tr[1]/td[7]/div[1]/div[1]/a[1]");
	
	//complaint view cancel
	By complaint_view_cancel = By.xpath("//*[@id=\"modalSize\"]/div/div[1]/button");
	
	//complaint edit
	By complaint_edit = By.xpath("//tbody/tr[1]/td[7]/div[1]/div[1]/a[2]");
	
	//complaint delete
	By complaint_delete = By.xpath("//*[@id=\"table_id\"]/tbody/tr[1]/td[7]/div/div/a[3]");
	
	//complaint_delete_cancel
	By complaint_delete_cancel = By.xpath("(//button[@class='primary-btn tr-bg'])[1]");
	
	//complaint_delete confirm
	By complaint_delete_confirm = By.xpath("(//button[@class='primary-btn fix-gr-bg'])[1]");
	
	/*
	 * 
	 * 
	 * Postal Receive
	 * 
	 * 
	 */
	
	//postal receiver
	By postal_receive = By.xpath("//a[contains(text(),'Postal Receive')]");
	
	//postal receive title
	By postal_receive_title_from = By.name("from_title");
	
	//postal reference
	By postal_reference = By.name("reference_no");
	
	//postal address
	By postal_address = By.name("address");
	
	//postal note
	By postal_note = By.name("note");
	
	//postal title to
	By postal_title_to = By.name("to_title");
	
	/*
	 * 
	 */
	
	// postal_receive date
	By postal_receive_date = By.id("startDate");

	// postal_receive monthyear
	By postal_receive_monthyear = By.xpath("/html[1]/body[1]/div[5]/div[1]/table[1]/thead[1]/tr[1]/th[2]");

	// postal_receive site bar
	By postal_receive_sitebar = By.xpath("//body[1]/div[5]/div[1]/table[1]/thead[1]/tr[1]/th[1]");

	// postal_receive pickdate
	public int day7 = 20;
	By postal_receive_pickdate = By.xpath("/html[1]/body[1]/div[5]/div[1]/table[1]/tbody[1]/tr/td[contains(text(),"+day7+")]");
	
	/*
	 * 
	 */
	
	//postal browse
	By postal_browse = By.xpath("//label[contains(text(),'browse')]");
	
	/*
	 * 
	 */
	//postal save
	By postal_save = By.xpath("//button[@class='primary-btn fix-gr-bg submit']");
	
	/*
	 * 
	 */
	
	//postal select
	By postal_select = By.xpath("//tbody/tr[1]/td[7]/div[1]/button[1]");
	
	//postal edit
	By postal_edit = By.xpath("//tbody/tr[1]/td[7]/div[1]/div[1]/a[1]");
	
	//postal delete
	By postal_delete = By.xpath("//tbody/tr[1]/td[7]/div[1]/div[1]/a[2]");
	
	//postal delete cancel
	By postal_delete_cancel = By.xpath("(//button[@class='primary-btn tr-bg'])[2]");
	
	//postal delete confirm
	By postal_delete_confirm = By.xpath("(//button[@class='primary-btn fix-gr-bg'])[2]");
	
	/*
	 * 
	 * 
	 * Postal Dispatch
	 * 
	 * 
	 */
	
	//postal dispatch
	By postal_dispatch = By.xpath("//a[contains(text(),'Postal Dispatch')]");
	
	// postal dispatch title
	By postal_dispatch_title = By.name("to_title");

	// postal_dispatch reference
	By postal_dispatch_reference = By.name("reference_no");

	// postal_dispatch address
	By postal_dispatch_address = By.name("address");

	// postal_dispatch note
	By postal_dispatch_note = By.name("note");

	// postal_dispatch title to
	By postal_dispatch_title_to = By.name("from_title");

	/*
	 * 
	 */

	// postal_dispatch date
	By postal_dispatch_date = By.id("startDate");

	// postal_dispatch monthyear
	By postal_dispatch_monthyear = By.xpath("/html[1]/body[1]/div[5]/div[1]/table[1]/thead[1]/tr[1]/th[2]");

	// postal_receive site bar
	By postal_dispatch_sitebar = By.xpath("//body[1]/div[5]/div[1]/table[1]/thead[1]/tr[1]/th[1]");

	// postal_receive pickdate
	public int day8 = 20;
	By postal_dispatch_pickdate = By.xpath("/html[1]/body[1]/div[5]/div[1]/table[1]/tbody[1]/tr/td[contains(text()," + day8 + ")]");
	
	/*
	 * 
	 */
	
	// postal browse
	By postal_dispatch_browse = By.xpath("//label[contains(text(),'Browse')]");
	
	/*
	 * 
	 */
	//postal_dispatch save
	By postal_dispatch_save = By.xpath("//button[@class='primary-btn fix-gr-bg submit']");
	
	/*
	 * 
	 */
	
	//postal_dispatch select
	By postal_dispatch_select = By.xpath("//tbody/tr[1]/td[7]/div[1]/button[1]");
	
	//postal edit
	By postal_dispatch_edit = By.xpath("//tbody/tr[1]/td[7]/div[1]/div[1]/a[1]");
	
	//postal delete
	By postal_dispatch_delete = By.xpath("//tbody/tr[1]/td[7]/div[1]/div[1]/a[2]");
	
	//postal delete cancel
	By postal_dispatch_delete_cancel = By.xpath("(//button[@class='primary-btn tr-bg'])[1]");
	
	//postal delete confirm
	By postal_dispatch_delete_confirm = By.xpath("(//button[@class='primary-btn fix-gr-bg'])[1]");
	
	/*
	 * 
	 * 
	 * Phone Call Log
	 * 
	 * 
	 */
	
	//phonecall log
	By phone_call_log = By.xpath("//body/div[2]/nav[1]/ul[1]/li[3]/ul[1]/li[6]/a[1]");
	
	//phone call name
	By phone_call_name = By.name("name");
	
	//phone call number
	By phone_call_number = By.name("phone");
	
	/*
	 * 
	 */

	// phone_call date
	By phone_call_date = By.name("date");

	// phone_call monthyear
	By phone_call_monthyear = By.xpath("/html[1]/body[1]/div[5]/div[1]/table[1]/thead[1]/tr[1]/th[2]");

	// phone_call site bar
	By phone_call_sitebar = By.xpath("//body[1]/div[5]/div[1]/table[1]/thead[1]/tr[1]/th[1]");

	// phone_call pickdate
	public int day9 = 20;
	By phone_call_pickdate = By.xpath("/html[1]/body[1]/div[5]/div[1]/table[1]/tbody[1]/tr/td[contains(text()," + day9 + ")]");
	
	/*
	 * 
	 */

	// phone_call date2
	By phone_call_date2 = By.name("follow_up_date");

	// phone_call monthyear
	By phone_call_monthyear2 = By.xpath("/html[1]/body[1]/div[5]/div[1]/table[1]/thead[1]/tr[1]/th[2]");

	// phone_call site bar
	By phone_call_sitebar2 = By.xpath("//body[1]/div[5]/div[1]/table[1]/thead[1]/tr[1]/th[1]");

	// phone_call pickdate
	public int day10 = 20;
	By phone_call_pickdate2 = By.xpath("/html[1]/body[1]/div[5]/div[1]/table[1]/tbody[1]/tr/td[contains(text()," + day10 + ")]");
	
	/*
	 * 
	 */
	
	//phone call duration
	By phone_call_duration = By.name("call_duration");
	
	//phone call description
	By phone_call_description = By.name("description");
	
	//phone call outgoing
	By phone_call_outgoing = By.xpath("//label[contains(text(),'Outgoing')]");
	
	//phone call incoming
	By phone_call_incoming = By.xpath("//label[contains(text(),'Incoming')]");
	
	//phone call save
	By phone_call_save = By.xpath("//button[@class='primary-btn fix-gr-bg submit']");
	
	/*
	 * 
	 * action select
	 * 
	 */
	
	//phone call action
	By phone_call_action = By.xpath("//tbody/tr[1]/td[8]/div[1]/button[1]");
	
	//phone call edit
	By phone_call_edit = By.xpath("//tbody/tr[1]/td[8]/div[1]/div[1]/a[1]");
	
	//phone call delete
	By phone_call_delete = By.xpath("//tbody/tr[1]/td[8]/div[1]/div[1]/a[2]");
	
	//phone call delete cancel
	By phone_call_delete_cancel = By.xpath("(//button[@class='primary-btn tr-bg'])[8]");
	//*[@id="deleteCallLogModal12"]/div/div/div[2]/div[2]/button[1]
	
	//phone call delete confirm
	By phone_call_delete_confirm = By.xpath("(//button[@class='primary-btn fix-gr-bg'])[8]");
	
	/*
	 * 
	 * 
	 * Student Certificate
	 * 
	 * 
	 */
	
	//student certificate
	By student_certificate = By.xpath("//*[@id=\"sidebar_menu\"]/li[3]/ul/li[8]/a");
	
	//student certificate name
	By student_certificate_name = By.name("name");
	
	//header left text
	By Student_certificate_headerText = By.name("header_left_text");
	
	/*
	 * 
	 */

	// student_certificate date
	By student_certificate_date = By.id("startDate");

	// student_certificate monthyear
	By student_certificate_monthyear = By.xpath("/html[1]/body[1]/div[5]/div[1]/table[1]/thead[1]/tr[1]/th[2]");

	// student_certificate site bar
	By student_certificate_sitebar = By.xpath("//body[1]/div[5]/div[1]/table[1]/thead[1]/tr[1]/th[1]");

	// student_certificate pickdate
	public int day11 = 20;
	By student_certificatepickdate = By.xpath("/html[1]/body[1]/div[5]/div[1]/table[1]/tbody[1]/tr/td[contains(text()," + day11 + ")]");
	
	//student certificate body
	By student_certificate_body = By.name("body");
	
	//student certificate footer left
	By student_certificate_footer_left = By.name("footer_left_text");
	
	//student certificate footer center
	By student_certificate_footer_certer = By.name("footer_center_text");
	
	//student certificate footer right
	By student_certificate_footer_right = By.name("footer_right_text");
	
	/*
	 * 
	 */
	
	//upload certificate framne
	By upload_certificate_frame = By.xpath("//label[contains(text(),'Browse')]");
	
	/*
	 * 
	 */
	
	//save certificate
	By student_certificate_save = By.xpath("//button[@class='primary-btn fix-gr-bg submit']");
	
	/*
	 * 
	 * Action select
	 * 
	 */
	
	//student_certificate_select
	By student_certificate_select = By.xpath("(//button[@class='btn dropdown-toggle'])[1]");
	
	//student certificate view
	By student_certificate_view = By.xpath("(//a[@class='dropdown-item'])[2]");
	
	//student certificate view close
	By student_certificate_view_close = By.xpath("(//button[@class='close'])[6]");
	
	// student certificate edit
	By student_certificate_edit = By.xpath("(//a[@class='dropdown-item'])[3]");

	// student certificate delete
	By student_certificate_delete = By.xpath("(//a[@class='dropdown-item'])[4]");

	// student certificate delete_cancel
	By student_certificate_delete_cancel = By.xpath("(//button[@class='primary-btn tr-bg'])[3]");
	//*[@id="deleteSectionModal3"]/div/div/div[2]/div[2]/button[1]

	// student certificate delete_confirm
	By student_certificate_delete_confirm = By.xpath("(//button[@class='primary-btn fix-gr-bg'])[3]"); 
	
	/*
	 * 
	 * 
	 * Generate Certificate
	 * 
	 * 
	 */
	
	//generate certificate
	By generate_certificate = By.xpath("//*[@id=\"sidebar_menu\"]/li[3]/ul/li[9]/a");
	
	//generate certificate class
	By generate_certificate_class = By.xpath("//*[@id=\"main-content\"]/section[2]/div/form/div/div/div/div/div[1]/div");
	
	//generate certificate specific class
	By generate_certificate_specific_class = By.xpath("//li[contains(text(),'Class 3')]");
	
	//generate certificate section
	By generate_certificate_section = By.xpath("//*[@id=\"select_section_div\"]/div[1]");
	
	//generate certificate specific section
	By generate_certificate_specific_section = By.xpath("//li[contains(text(),'Day')]");
	
	//generate_certificate_select certificate
	By generate_certificate_select_certificate = By.xpath("//*[@id=\"main-content\"]/section[2]/div/form/div/div/div/div/div[3]/div");
	
	//generate_certificate_specific_certificate 
	By generate_certificate_specific_certificate = By.xpath("//li[contains(text(),'Certificate in Technical Communication (PCTC)')]");
	
	//generate certificate search
	By generate_certificate_search = By.xpath("//button[@class='primary-btn small fix-gr-bg']");
	
	//check mark
	By generate_certificate_checkmark = By.xpath("//tbody/tr[1]/td[1]/label[1]");
	
	//certificate_generate
	By certificate_generate = By.xpath("//a[@id='genearte-certificate-print-button']");
	
	/*
	 * 
	 * 
	 * ID Card
	 * 
	 * 
	 */
	
	//id card 
	By id_card = By.xpath("//*[@id=\"sidebar_menu\"]/li[3]/ul/li[10]/a");
	
	//create id card
	By create_id_card = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div[1]/div/a");
	
	//id card title
	By id_card_title = By.name("title");
	
	/*
	 * 
	 * Specific user
	 * 
	 */
	
	//id card user
	By id_card_user = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[4]/div/div/div[1]");
	
	//id card specific user
	By id_card_specific_user_student = By.xpath("//li[contains(text(),'Student')]");
	
	//id card guardian
	 By id_card_guardian = By.xpath("//li[contains(text(),'Guardian')]");
	 
	 //Id card staff
	 By id_card_staff = By.xpath("//li[contains(text(),'Staff')]");
	 
	 /*
	  * 
	  */
	 
	 //id card teacher
	 By id_card_teacher = By.xpath("//label[contains(text(),'Teacher')]");
	 
	 //Id card admin
	 By id_card_admin = By.xpath("//label[contains(text(),'Admin')]");
	 
	 //id card accountant
	 By id_card_accountant = By.xpath("//label[contains(text(),'Accountant')]");
	 
	 //id card receptionist
	 By id_card_receptionist = By.xpath("//label[contains(text(),'Receptionist')]");
	 
	 //id card librarian
	 By id_card_librarian = By.xpath("//label[contains(text(),'Librarian')]");
	 
	 //id card driver
	 By id_card_driver = By.xpath("//label[contains(text(),'Driver')]");
	
	
	/*
	 * 
	 * 
	 * 
	 */
	
	//id card logo browse
	By id_card_logo = By.xpath("(//label[@class='primary-btn small fix-gr-bg'])[3]");
	
	//id card signature browse
	By id_card_signature = By.xpath("(//label[@class='primary-btn small fix-gr-bg'])[4]");
	
	//save id card
	By save_id_card = By.xpath("//button[@class='primary-btn fix-gr-bg submit savaIdCard']");
	
	/*
	 * 
	 * action select
	 * 
	 */
	
	//id card select
	By id_card_select = By.xpath("(//button[@class='btn dropdown-toggle'])[1]");
	
	//id card preview
	By id_card_preview = By.xpath("(//a[@class='dropdown-item'])[2]");
	
	//id card preview cancel
	By id_card_preview_cancel = By.xpath("(//button[@class='close'])[1]");
	
	//id card edit
	By id_card_edit = By.xpath("(//a[@class='dropdown-item'])[3]");
	
	//Get id card  url again
	String id_card_url = "http://pos.rishfa.com/student-id-card";
	
	//id card delete
	By id_card_delete = By.xpath("(//a[@class='dropdown-item'])[4]");
	
	//id card delete cancel
	By id_card_delete_cancel = By.xpath("(//button[@class='primary-btn tr-bg'])[1]");
	
	//id card delete confirm
	By id_card_delete_confirm = By.xpath("(//button[@class='primary-btn fix-gr-bg'])[1]");
	
	/*
	 * 
	 * 
	 * Generate id card
	 * 
	 * 
	 */
	
	String generateId_url = "http://pos.rishfa.com/generate-id-card";
	// generate id card
	By generate_id_card = By.xpath("(//a[contains(text(),'Generate ID Card')])[1]");

	// select role
	By generate_id_role = By.xpath("//div[@class='nice-select niceSelect new_test w-100 bb form-control']");

	/*
	 * 
	 */
	
	// specific role super admin
	By generate_id_role_superAdmin = By.xpath("//li[contains(text(),'Super admin')]");

	// specific role student
	By generate_id_role_student = By.xpath("//li[contains(text(),'Student')]");

	// specific role parents
	By generate_id_role_parents = By.xpath("//li[contains(text(),'Parents')]");

	// specific role super teacher
	By generate_id_role_teacher = By.xpath("//li[contains(text(),'Teacher')]");

	// specific role admin
	By generate_id_role_admin = By.xpath("//li[contains(text(),'Admin')]");

	// specific role accountant
	By generate_id_role_accountant = By.xpath("//li[contains(text(),'Accountant')]");

	// specific role receptionist
	By generate_id_role_receptionist = By.xpath("//li[contains(text(),'Receptionist')]");

	// specific role librarian
	By generate_id_role_librarian = By.xpath("//li[contains(text(),'Librarian')]");
	
	//specific role driver
	By generate_id_role_driver = By.xpath("//li[contains(text(),'Driver')]");
	
	/*
	 * 
	 */
	
	//select id card
	By generate_select_id_card = By.xpath("//div[@class='nice-select niceSelect w-100 bb form-control']");
	
	//select specific id card
	By generate_specific_id_card = By.xpath("//*[@id=\"id-card-div\"]/div[1]/ul/li[2]");
	
	//generate id grid_gap
	By generate_id_grid_gap = By.name("grid_gap");
	
	//generate id save
	By generate_id_save = By.xpath("//button[@class='primary-btn small fix-gr-bg']");
	
	
	
	
	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	public void ClickadminSetpButton() throws InterruptedException {
		
	//admission_select
	driver.findElement(admission_select).click();
	Thread.sleep(1000);
	
	//admin_setup
	driver.findElement(admin_setup).click();
	Thread.sleep(1000);
	System.out.println("Successfully Enter Admin Setup");
	
	//admin_setup_type
	driver.findElement(admin_setup_type).click();
	Thread.sleep(1000);
	
	//admin_setup_source
	driver.findElement(admin_setup_source).sendKeys("source");
	Thread.sleep(1000);
	
	//admin_setup_addSource
	driver.findElement(admin_setup_addSource).click();
	Thread.sleep(1000);
	
	//admin_setup_inpuName
	driver.findElement(admin_setup_inpuName).sendKeys("Md Sadikur Rahman");
	Thread.sleep(1000);
	
	//admin_setup_description
	driver.findElement(admin_setup_description).sendKeys("description showing here");
	Thread.sleep(1000);
	
	//admin_setup_save
	driver.findElement(admin_setup_save).click();
	Thread.sleep(1000);
	
	System.out.println("Successfully saved source");
	
	/*
	 * 
	 */

	// admin_setup_type
	driver.findElement(admin_setup_type).click();
	Thread.sleep(1000);

	// admin_setup_source
	driver.findElement(admin_setup_source).sendKeys("purpose");
	Thread.sleep(1000);

	// admin_setup_purpose
	driver.findElement(admin_setup_purpose).click();
	Thread.sleep(1000);

	// admin_setup_inpuName
	driver.findElement(admin_setup_inpuName).sendKeys("Minhazul");
	Thread.sleep(1000);

	// admin_setup_description
	driver.findElement(admin_setup_description).sendKeys("description showing here");
	Thread.sleep(1000);

	// admin_setup_save
	driver.findElement(admin_setup_save).click();
	Thread.sleep(1000);
	
	System.out.println("Successfully saved purpose");
	
	/*
	 * 
	 */
	
	// admin_setup_type
	driver.findElement(admin_setup_type).click();
	Thread.sleep(1000);

//	// admin_setup_source
//	driver.findElement(admin_setup_source).sendKeys("source");
//	Thread.sleep(1000);

	// admin_setup_addSource
	driver.findElement(admin_setup_complainType).click();
	Thread.sleep(1000);

	// admin_setup_inpuName
	driver.findElement(admin_setup_inpuName).sendKeys("Major");
	Thread.sleep(1000);

	// admin_setup_description
	driver.findElement(admin_setup_description).sendKeys("description showing here");
	Thread.sleep(1000);

	// admin_setup_save
	driver.findElement(admin_setup_save).click();
	Thread.sleep(1000);
	System.out.println("Successfully saved Major");
	
	/*
	 * 
	 */
	
	// admin_setup_type
	driver.findElement(admin_setup_type).click();
	Thread.sleep(1000);

	// admin_setup_source
	driver.findElement(admin_setup_source).sendKeys("Reference");
	Thread.sleep(1000);

	// admin_setup_addSource
	driver.findElement(admin_setup_reference).click();
	Thread.sleep(1000);

	// admin_setup_inpuName
	driver.findElement(admin_setup_inpuName).sendKeys("Minhazul");
	Thread.sleep(1000);

	// admin_setup_description
	driver.findElement(admin_setup_description).sendKeys("description showing here");
	Thread.sleep(1000);

	// admin_setup_save
	driver.findElement(admin_setup_save).click();
	Thread.sleep(1000);
	System.out.println("Successfully saved Reference");
	
	}
	
	/*
	 * 
	 * 
	 * Admission Querry
	 * 
	 * 
	 */
	
	public void ClickAdmissionQueryButton() throws InterruptedException {
	
//		//admission_select
//		driver.findElement(admission_select).click();
//		Thread.sleep(1000);
	
	//admission_query
	driver.findElement(admission_query).click();
	Thread.sleep(1000);
	System.out.println("Successfully Enter Admission Query");
	
	//admission_query_add
	driver.findElement(admission_query_add).click();
	Thread.sleep(1000);
	
	//admission_query_add_name
	driver.findElement(admission_query_add_name).sendKeys("Sohel Rana");
	Thread.sleep(1000);
	
	//admission_query_phone
	driver.findElement(admission_query_phone).sendKeys("123456789");
	Thread.sleep(1000);
	
	//admission_query_email
	driver.findElement(admission_query_email).sendKeys("sohelrana@gmail.com");
	Thread.sleep(1000);
	
	//admission_query_address
	driver.findElement(admission_query_address).sendKeys("panthapath");
	Thread.sleep(1000);
	
	//admission_query_description
	driver.findElement(admission_query_description).sendKeys("admission_query_description");
	Thread.sleep(1000);
	
	/*
	 * date from
	 */
	
	// upload notice time

	String month = "MARCH 2022";

	driver.findElement(addmission_query_date_from).click(); // click calender
	Thread.sleep(2000);

	while (true) {
		String text = driver.findElement(admission_query_monthyear).getText(); // locator is month and year

		if (text.equals(month)) {
			break;
		} else {

			driver.findElement(admission_query_sitebar).click(); // locator of site arrow.you have to change it
		}
	}

	driver.findElement(admission_query_pickdate).click(); // locator of all date.
	Thread.sleep(2000);
	
	
	/*
	 * date to
	 */
	
	// upload notice time

	String month2 = "MARCH 2022";

	driver.findElement(addmission_query_date_To).click(); // click calender
	Thread.sleep(2000);

	while (true) {
		String text = driver.findElement(admission_query_monthyear2).getText(); // locator is month and year

		if (text.equals(month2)) {
			break;
		} else {

			driver.findElement(admission_query_sitebar2).click(); // locator of site arrow.you have to change it
		}
	}

	driver.findElement(admission_query_pickdate2).click(); // locator of all date.
	Thread.sleep(2000);
	
	/*
	 * 
	 */
	
	//admission_query_assign
	driver.findElement(admission_query_assign).sendKeys("Tanmoy");
	Thread.sleep(1000);
	
	//admission_query_reference
	driver.findElement(admission_query_reference).click();
	Thread.sleep(1000);
	
	//admission_query_specific_reference
	driver.findElement(admission_query_specific_reference).click();
	Thread.sleep(1000);
	
	//admission_query_source
	driver.findElement(admission_query_source).click();
	Thread.sleep(2000);
	
	//admission_query_specific_source
	driver.findElement(admission_query_specific_source).click();
	Thread.sleep(2000);
	
	//admission_query_class
	driver.findElement(admission_query_class2).click();
	Thread.sleep(3000);
	
	//admission_query_specific_class
	driver.findElement(admission_query_specific_class).click();
	Thread.sleep(3000);
	
	//admission_query_child_no
	driver.findElement(admission_query_child_no).sendKeys("2");
	Thread.sleep(1000);
	
	//admission_query_save
	driver.findElement(admission_query_save).click();
	Thread.sleep(1000);
	
	System.out.println("Successfully saved Admission Query");
	
	/*
	 * 
	 */
	
	//admission_query_select
	driver.findElement(admission_query_select).click();
	Thread.sleep(1000);
	
	//admission_query_add_query
	driver.findElement(admission_query_add_query).click();
	Thread.sleep(1000);
	
	/*
	 * 
	 * 
	 * date from
	 * 
	 * 
	 */
	
	// upload notice time

	String month3 = "MARCH 2022";

	driver.findElement(addmission_addquery_date_from).click(); // click calender
	Thread.sleep(2000);

	while (true) {
		String text = driver.findElement(admission_addquery_monthyear).getText(); // locator is month and year

		if (text.equals(month3)) {
			break;
		} else {

			driver.findElement(admission_addquery_sitebar).click(); // locator of site arrow.you have to change it
		}
	}

	driver.findElement(admission_addquery_pickdate).click(); // locator of all date.
	Thread.sleep(2000);
	
	
	/*
	 * 
	 * 
	 * date to
	 * 
	 * 
	 */
	
	// upload notice time

	String month4 = "MARCH 2022";

	driver.findElement(addmission_addquery_date_To).click(); // click calender
	Thread.sleep(2000);

	while (true) {
		String text = driver.findElement(admission_addquery_monthyear2).getText(); // locator is month and year

		if (text.equals(month4)) {
			break;
		} else {

			driver.findElement(admission_addquery_sitebar2).click(); // locator of site arrow.you have to change it
		}
	}

	driver.findElement(admission_addquery_pickdate2).click(); // locator of all date.
	Thread.sleep(2000);
	
	/*
	 * 
	 */
	
	//admission_query_status
	driver.findElement(admission_query_status).click();
	Thread.sleep(1000);
	
	//admission_query_specific_status
	driver.findElement(admission_query_specific_status).click();
	Thread.sleep(1000);
	
	//admission_query_response
	driver.findElement(admission_query_response).sendKeys("response");
	Thread.sleep(1000);
	
	//admission_query_note
	driver.findElement(admission_query_note).sendKeys("note");
	Thread.sleep(1000);
	
	//admission_query_save_button
	driver.findElement(admission_query_save_button).click();
	Thread.sleep(1000);
	
	System.out.println("Successfully Added Query");
	
	/*
	 * 
	 */
	
	
	
	//admissionQuery_followup_select
	driver.findElement(admissionQuery_followup_select).click();
	Thread.sleep(1000);
	
	//admissionQuery_followup_delete
	driver.findElement(admissionQuery_followup_delete).click();
	Thread.sleep(1000);
	
	//admissionQuery_followup_deletecancel
	driver.findElement(admissionQuery_followup_deletecancel).click();
	Thread.sleep(1000);
	System.out.println("Successfully Deleted Cancel Admission Query");
	
//	// admissionQuery_followup_select
//	driver.findElement(admissionQuery_followup_select).click();
//	Thread.sleep(1000);
//
//	// admissionQuery_followup_delete
//	driver.findElement(admissionQuery_followup_delete).click();
//	Thread.sleep(1000);
//	
//	//admissionQuery_followup_deleteconfirm
//	driver.findElement(admissionQuery_followup_deleteconfirm).click();
//	Thread.sleep(1000);
//	
//	System.out.println("Successfully Deleted confirm Admission Query");
	
	/*
	 * 
	 * 
	 * 
	 */
	
	
	//admission_select
	driver.findElement(admission_select).click();
	Thread.sleep(1000);

	//admission_query
	driver.findElement(admission_query).click();
	Thread.sleep(1000);

	// admission_query_select
	driver.findElement(admission_query_select).click();
	Thread.sleep(1000);

	// admission_query_delete
	driver.findElement(admission_query_delete).click();
	Thread.sleep(1000);

	// admission_query_delete_cancel
	driver.findElement(admission_query_delete_cancel).click();
	Thread.sleep(1000);
	
	System.out.println("Successfully Deleted cancel Admission Query");

	// admission_query_select
	driver.findElement(admission_query_select).click();
	Thread.sleep(1000);

	// admission_query_delete
	driver.findElement(admission_query_delete).click();
	Thread.sleep(1000);

	// admission_query_delete_confirm
	driver.findElement(admission_query_delete_confirm).click();
	Thread.sleep(1000);
	
	System.out.println("Successfully Deleted confirm Admission Query");
	
	
	
	
	
	
	}
	
	public void clickVisitorBookButton() throws InterruptedException, AWTException {
		
//		//admission_select
//		driver.findElement(admission_select).click();
//		Thread.sleep(1000);
		
		//visitors_book
		driver.findElement(visitors_book).click();
		Thread.sleep(1000);
		System.out.println("Successfully Enter Visitor book");
		
		//visit_purpose
		driver.findElement(visit_purpose).sendKeys("Visit");
		Thread.sleep(1000);
		
		//visitor_name
		driver.findElement(visitor_name).sendKeys("shaikat");
		Thread.sleep(1000);
		
		//visitor_phone
		driver.findElement(visitor_phone).sendKeys("1234567890");
		Thread.sleep(1000);
		
		//visitor_id
		driver.findElement(visitor_id).sendKeys("12345");
		Thread.sleep(1000);
		
		//visitor_person
		driver.findElement(visitor_person).sendKeys("1");
		Thread.sleep(1000);
		
		/*
		 * 
		 * 
		 * date to
		 * 
		 * 
		 */
		
		// upload notice time

		String month5 = "MARCH 2022";

		driver.findElement(Visitor_date_To).click(); // click calender
		Thread.sleep(2000);

		while (true) {
			String text = driver.findElement(Visitor_monthyear).getText(); // locator is month and year

			if (text.equals(month5)) {
				break;
			} else {

				driver.findElement(Visitor_sitebar).click(); // locator of site arrow.you have to change it
			}
		}

		driver.findElement(Visitor_pickdate).click(); // locator of all date.
		Thread.sleep(2000);
		
		
		/*
		 * 
		 */
		
	//in time
		
		driver.findElement(visitor_inTime).sendKeys(Keys.CONTROL + "a");
		driver.findElement(visitor_inTime).sendKeys(Keys.DELETE);
		driver.findElement(visitor_inTime).sendKeys("2:45 PM");
		
		//out time
		driver.findElement(visitor_outTime).sendKeys(Keys.CONTROL + "a");
		driver.findElement(visitor_outTime).sendKeys(Keys.DELETE);
		driver.findElement(visitor_outTime).sendKeys("3:45 PM");
		
		/*
		 * 
		 */
		//upload file
		// using robot class 
		
		//click browse
		driver.findElement(visitor_file).click();
		Thread.sleep(1000);
		
		//upload file
		String filePath=upload.getFilePath("Uploaded lesson file.txt");
		upload.profilePicUpload(filePath);
		Thread.sleep(1000);
		
		
		/*
		 * 
		 */
		
		//visitor_save_button
		driver.findElement(visitor_save_button).click();
		Thread.sleep(1000);
		
		/*
		 * 
		 */
		
		//visitor_select
		driver.findElement(visitor_select).click();
		Thread.sleep(1000);
		
		//visitor_edit
		driver.findElement(visitor_edit).click();
		Thread.sleep(1000);
		
		// visitor_save_button
		driver.findElement(visitor_save_button).click();
		Thread.sleep(1000);
		
		System.out.println("Successfully added visitor");

		// visitor_select
		driver.findElement(visitor_select).click();
		Thread.sleep(1000);
		
		//visitor_delete
		driver.findElement(visitor_delete).click();
		Thread.sleep(1000);
		
		// visitor_delete_cancel
		driver.findElement(visitor_delete_cancel).click();
		Thread.sleep(1000);
		
		System.out.println("Successfully delete cancel visitor book");

		// visitor_select
		driver.findElement(visitor_select).click();
		Thread.sleep(1000);

		// visitor_delete
		driver.findElement(visitor_delete).click();
		Thread.sleep(1000);
		
		//visitor_delete_confirm
		driver.findElement(visitor_delete_confirm).click();
		Thread.sleep(1000);
		
		System.out.println("Successfully delete confirm visitor book");
	
	}
	
	/*
	 * 
	 * 
	 * complaint
	 * 
	 * 
	 */
	
	public void clickcompaintButton() throws InterruptedException, AWTException {
		
//		//admission_select
//		driver.findElement(admission_select).click();
//		Thread.sleep(1000);
		
		//complaint
		driver.findElement(complaint).click();
		Thread.sleep(1000);
		System.out.println("Successfully Enter Complaint");
		
		//complaint_name
		driver.findElement(complaint_name).sendKeys("Shaikat");
		Thread.sleep(1000);
		
		//complaint_type
		driver.findElement(complaint_type).click();
		Thread.sleep(1000);
		
		//complaint_specific_type
		driver.findElement(complaint_specific_type).click();
		Thread.sleep(1000);
		
		//complaint_source
		driver.findElement(complaint_source).click();
		Thread.sleep(1000);
		
		//complaint_specific_source
		driver.findElement(complaint_specific_source).click();
		Thread.sleep(1000);
		
		//complaint_phone
		driver.findElement(complaint_phone).sendKeys("1234567890");
		Thread.sleep(1000);
		
		/*
		 * date from
		 */
		
		// upload notice time

		String month6 = "MARCH 2022";

		driver.findElement(complaint_date_To).click(); // click calender
		Thread.sleep(2000);

		while (true) {
			String text = driver.findElement(complaint_monthyear).getText(); // locator is month and year

			if (text.equals(month6)) {
				break;
			} else {

				driver.findElement(complaint_sitebar).click(); // locator of site arrow.you have to change it
			}
		}
		
		driver.findElement(complaint_pickdate).click(); // locator of all date.
		Thread.sleep(2000);
		
		//complaint_action_taken
		driver.findElement(complaint_action_taken).sendKeys("punished him");
		Thread.sleep(1000);
		
		//complaint_assign
		driver.findElement(complaint_assign).sendKeys("Tanvir");
		Thread.sleep(1000);
		
		//complaint_description
		driver.findElement(complaint_description).sendKeys("complaint_description");
		Thread.sleep(1000);
		
		/*
		 * 
		 */
		
		//complaint_browse
		driver.findElement(complaint_browse).click();
		Thread.sleep(1000);
		
		//upload file
		String filePath=upload.getFilePath("Uploaded lesson file.txt");
		upload.profilePicUpload(filePath);
		Thread.sleep(1000);
		/*
		 * 
		 */
		
		//complaint_save
		driver.findElement(complaint_save).click();
		Thread.sleep(1000);
		
		/*
		 * 
		 */
		
		//complaint_select
		driver.findElement(complaint_select).click();
		Thread.sleep(1000);
		
		//complaint_view
		driver.findElement(complaint_view).click();
		Thread.sleep(1000);
		
		//complaint_view_cancel
		driver.findElement(complaint_view_cancel).click();
		Thread.sleep(1000);
		
		// complaint_select
		driver.findElement(complaint_select).click();
		Thread.sleep(1000);
		
		//complaint_edit
		driver.findElement(complaint_edit).click();
		Thread.sleep(1000);
		
		// complaint_save
		driver.findElement(complaint_save).click();
		Thread.sleep(1000);
		
		System.out.println("Successfully saved complaint");
		
		//complaint_select
		driver.findElement(complaint_select).click();
		Thread.sleep(1000);
				
		//complaint_delete
		driver.findElement(complaint_delete).click();
		Thread.sleep(1000);
		
		//complaint_delete_cancel
		driver.findElement(complaint_delete_cancel).click();
		Thread.sleep(1000);
		System.out.println("Successfully delete cancel complaint");
		
		// complaint_select
		driver.findElement(complaint_select).click();
		Thread.sleep(1000);

		// complaint_delete
		driver.findElement(complaint_delete).click();
		Thread.sleep(1000);
		
		//complaint_delete_confirm
		driver.findElement(complaint_delete_confirm).click();
		Thread.sleep(1000);
		System.out.println("Successfully delete confirm complaint");
		
	}
	
	/*
	 * 
	 * 
	 * Postal receive
	 * 
	 * 
	 */
	
	public void clickPostalReceiveButton() throws InterruptedException, AWTException {
	
//		//admission_select
//		driver.findElement(admission_select).click();
//		Thread.sleep(1000);
		
	//postal_receive
	driver.findElement(postal_receive).click();
	Thread.sleep(1000);
	System.out.println("Successfully Enter Postal Receive");
	
	//postal_receive_title_from
	driver.findElement(postal_receive_title_from).sendKeys("Sayeed Library");
	Thread.sleep(1000);
	
	//postal_reference
	driver.findElement(postal_reference).sendKeys("123");
	Thread.sleep(1000);
	
	//postal_address
	driver.findElement(postal_address).sendKeys("Panthapath");
	Thread.sleep(1000);
	
	//postal_note
	driver.findElement(postal_note).sendKeys("It is a long established fact that a reader will be distracted by the readable "
			+ "content of a page when looking at its layout. ");
	
	//postal_title_to
	driver.findElement(postal_title_to).sendKeys("Head Master");
	Thread.sleep(1000);
	
	/*
	 * date from
	 */
	
	// upload notice time

	String month7 = "MARCH 2022";

	driver.findElement(postal_receive_date).click(); // click calender
	Thread.sleep(2000);

	while (true) {
		String text = driver.findElement(postal_receive_monthyear).getText(); // locator is month and year

		if (text.equals(month7)) {
			break;
		} else {

			driver.findElement(postal_receive_sitebar).click(); // locator of site arrow.you have to change it
		}
	}
	
	driver.findElement(postal_receive_pickdate).click(); // locator of all date.
	Thread.sleep(2000);
	
	/*
	 * 
	 * 
	 */
	
	//postal_browse
	driver.findElement(postal_browse).click();
	Thread.sleep(1000);
	
	//upload file
	String filePath=upload.getFilePath("Uploaded lesson file.txt");
	upload.profilePicUpload(filePath);
	Thread.sleep(1000);
	
	
	/*
	 * 
	 */
	
	//postal_save
	driver.findElement(postal_save).click();
	Thread.sleep(1000);
	
	/*
	 * 
	 */
	
	//postal_select
	driver.findElement(postal_select).click();
	Thread.sleep(1000);
	
	//postal_edit
	driver.findElement(postal_edit).click();
	Thread.sleep(1000);

	// postal_save
	driver.findElement(postal_save).click();
	Thread.sleep(1000);
	
	System.out.println("Successfully saved postal");
	
	// postal_select
	driver.findElement(postal_select).click();
	Thread.sleep(1000);
	
	//postal_delete
	driver.findElement(postal_delete).click();
	Thread.sleep(1000);
	
	//postal_delete_cancel
	driver.findElement(postal_delete_cancel).click();
	Thread.sleep(1000);
	System.out.println("Successfully delete cancel postal");
	
	// postal_select
	driver.findElement(postal_select).click();
	Thread.sleep(1000);

	// postal_delete
	driver.findElement(postal_delete).click();
	Thread.sleep(1000);
	
	//postal_delete_confirm
	driver.findElement(postal_delete_confirm).click();
	Thread.sleep(1000);
	System.out.println("Successfully delete confirm postal");
	
	}
	
	/*
	 * 
	 * 
	 * Postal receive
	 * 
	 * 
	 */
	
	public void clickPostalDispatchButton() throws InterruptedException, AWTException {

//		// admission_select
//		driver.findElement(admission_select).click();
//		Thread.sleep(1000);
//		
	//postal_receive
	driver.findElement(postal_dispatch).click();
	Thread.sleep(1000);
	System.out.println("Successfully Enter Postal Dispatch");
	
	//postal_receive_title_from
	driver.findElement(postal_dispatch_title).sendKeys("Sayeed Library");
	Thread.sleep(1000);
	
	//postal_reference
	driver.findElement(postal_dispatch_reference).sendKeys("123");
	Thread.sleep(1000);
	
	//postal_address
	driver.findElement(postal_dispatch_address).sendKeys("Panthapath");
	Thread.sleep(1000);
	
	//postal_note
	driver.findElement(postal_dispatch_note).sendKeys("It is a long established fact that a reader will be distracted by the readable "
			+ "content of a page when looking at its layout. ");
	
	//postal_title_to
	driver.findElement(postal_dispatch_title_to).sendKeys("Head Master");
	Thread.sleep(1000);
	
	/*
	 * date from
	 */
	
	// upload notice time

	String month8 = "MARCH 2022";

	driver.findElement(postal_dispatch_date).click(); // click calender
	Thread.sleep(2000);

	while (true) {
		String text = driver.findElement(postal_dispatch_monthyear).getText(); // locator is month and year

		if (text.equals(month8)) {
			break;
		} else {

			driver.findElement(postal_dispatch_sitebar).click(); // locator of site arrow.you have to change it
		}
	}
	
	driver.findElement(postal_dispatch_pickdate).click(); // locator of all date.
	Thread.sleep(2000);
	
	/*
	 * 
	 * 
	 */
	
	//postal_browse
	driver.findElement(postal_dispatch_browse).click();
	Thread.sleep(1000);
	
	//upload file
	String filePath=upload.getFilePath("Uploaded lesson file.txt");
	upload.profilePicUpload(filePath);
	Thread.sleep(1000);
	
	/*
	 * 
	 */
	
	//postal_save
	driver.findElement(postal_dispatch_save).click();
	Thread.sleep(1000);
	
	/*
	 * 
	 */
	
	//postal_select
	driver.findElement(postal_dispatch_select).click();
	Thread.sleep(1000);
	
	//postal_edit
	driver.findElement(postal_dispatch_edit).click();
	Thread.sleep(1000);
	
	// postal_save
	driver.findElement(postal_dispatch_save).click();
	Thread.sleep(1000);
	System.out.println("Successfully saved postal dispatch");
	
	// postal_select
	driver.findElement(postal_dispatch_select).click();
	Thread.sleep(1000);
	
	//postal_delete
	driver.findElement(postal_dispatch_delete).click();
	Thread.sleep(2000);
	
	//postal_delete_cancel
	driver.findElement(postal_dispatch_delete_cancel).click();
	Thread.sleep(1000);
	System.out.println("Successfully delete cancel postal dispatch");
	
	// postal_select
	driver.findElement(postal_dispatch_select).click();
	Thread.sleep(1000);

	// postal_delete
	driver.findElement(postal_dispatch_delete).click();
	Thread.sleep(2000);
	
	//postal_delete_confirm
	driver.findElement(postal_dispatch_delete_confirm).click();
	Thread.sleep(1000);
	System.out.println("Successfully delete confirm postal dispatch");
	
	}
	
	/*
	 * 
	 * 
	 * Phone Call Log
	 * 
	 * 
	 */
	public void ClickPhoneCallLogButton() throws InterruptedException {
		
//		// admission_select
//		driver.findElement(admission_select).click();
//		Thread.sleep(1000);
				
		
		//phone_call_log
		driver.findElement(phone_call_log).click();
		Thread.sleep(1000);
		System.out.println("Successfully Enter Phone call log");
		
		//phone_call_name
		driver.findElement(phone_call_name).sendKeys("Mizanur Rahman");
		Thread.sleep(1000);
		
		//phone_call_number
		driver.findElement(phone_call_number).sendKeys("1234567890");
		Thread.sleep(1000);
		
		/*
		 * date from
		 */
		
		// upload notice time

		String month9 = "MARCH 2022";

		driver.findElement(phone_call_date).click(); // click calender
		Thread.sleep(2000);

		while (true) {
			String text = driver.findElement(phone_call_monthyear).getText(); // locator is month and year

			if (text.equals(month9)) {
				break;
			} else {

				driver.findElement(phone_call_sitebar).click(); // locator of site arrow.you have to change it
			}
		}
		
		driver.findElement(phone_call_pickdate).click(); // locator of all date.
		Thread.sleep(2000);
		
		
		// upload notice time

		String month10 = "MARCH 2022";

		driver.findElement(phone_call_date2).click(); // click calender
		Thread.sleep(2000);

		while (true) {
			String text = driver.findElement(phone_call_monthyear2).getText(); // locator is month and year

			if (text.equals(month10)) {
				break;
			} else {

				driver.findElement(phone_call_sitebar2).click(); // locator of site arrow.you have to change it
			}
		}
		
		driver.findElement(phone_call_pickdate2).click(); // locator of all date.
		Thread.sleep(2000);
		
		/*
		 * 
		 */
		
		//phone_call_duration
		driver.findElement(phone_call_duration).sendKeys("10");
		Thread.sleep(1000);
		
		//phone_call_description
		driver.findElement(phone_call_description).sendKeys("It is a long established fact that a reader will be distracted "
				+ "by the readable content of a page when looking at its layout.");
		
		//phone_call_outgoing
		driver.findElement(phone_call_outgoing).click();
		Thread.sleep(1000);
		
		//phone_call_save
		driver.findElement(phone_call_save).click();
		Thread.sleep(1000);
		
		/*
		 * 
		 * 
		 * 
		 * 
		 */
		
		// phone_call_name
		driver.findElement(phone_call_name).sendKeys("Mizanur Rahman");
		Thread.sleep(1000);

		// phone_call_number
		driver.findElement(phone_call_number).sendKeys("1234567890");
		Thread.sleep(1000);

		/*
		 * date from
		 */

		// upload notice time

		String month11 = "MARCH 2022";

		driver.findElement(phone_call_date).click(); // click calender
		Thread.sleep(2000);

		while (true) {
			String text = driver.findElement(phone_call_monthyear).getText(); // locator is month and year

			if (text.equals(month11)) {
				break;
			} else {

				driver.findElement(phone_call_sitebar).click(); // locator of site arrow.you have to change it
			}
		}

		driver.findElement(phone_call_pickdate).click(); // locator of all date.
		Thread.sleep(2000);

		// upload notice time

		String month12 = "MARCH 2022";

		driver.findElement(phone_call_date2).click(); // click calender
		Thread.sleep(2000);

		while (true) {
			String text = driver.findElement(phone_call_monthyear2).getText(); // locator is month and year

			if (text.equals(month12)) {
				break;
			} else {

				driver.findElement(phone_call_sitebar2).click(); // locator of site arrow.you have to change it
			}
		}

		driver.findElement(phone_call_pickdate2).click(); // locator of all date.
		Thread.sleep(2000);

		/*
		 * 
		 */

		// phone_call_duration
		driver.findElement(phone_call_duration).sendKeys("10");
		Thread.sleep(1000);

		// phone_call_description
		driver.findElement(phone_call_description)
				.sendKeys("It is a long established fact that a reader will be distracted "
						+ "by the readable content of a page when looking at its layout.");

		// phone_call_outgoing
		driver.findElement(phone_call_incoming).click();
		Thread.sleep(1000);

		// phone_call_save
		driver.findElement(phone_call_save).click();
		Thread.sleep(1000);

		/*
		 * 
		 */

		// phone_call_action
		driver.findElement(phone_call_action).click();
		Thread.sleep(1000);

		// phone_call_edit
		driver.findElement(phone_call_edit).click();
		Thread.sleep(1000);

		// phone_call_save
		driver.findElement(phone_call_save).click();
		Thread.sleep(1000);
		System.out.println("Successfully saved phone call log");

		// phone_call_action
		driver.findElement(phone_call_action).click();
		Thread.sleep(1000);

		// phone_call_delete
		driver.findElement(phone_call_delete).click();
		Thread.sleep(2000);

		// phone_call_delete_cancel
		driver.findElement(phone_call_delete_cancel).click();
		Thread.sleep(2000);
		System.out.println("Successfully delete cancel phone call log");

		// phone_call_action
		driver.findElement(phone_call_action).click();
		Thread.sleep(1000);

		// phone_call_delete
		driver.findElement(phone_call_delete).click();
		Thread.sleep(2000);

		// phone_call_delete_confirm
		driver.findElement(phone_call_delete_confirm).click();
		Thread.sleep(2000);
		System.out.println("Successfully delete confirm phone call log");
		
	}
	
	/*
	 * 
	 * 
	 * Student certificate
	 * 
	 * 
	 */
	
	public void clickStudentCertificateButton() throws InterruptedException, AWTException {
		
//		// admission_select
//		driver.findElement(admission_select).click();
//		Thread.sleep(1000);
		
		//student_certificate
		driver.findElement(student_certificate).click();
		Thread.sleep(1000);
		System.out.println("Successfully Enter student certificate");
		
		//student_certificate_name
		driver.findElement(student_certificate_name).sendKeys("Certificate for promotion");
		Thread.sleep(1000);
		
		//Student_certificate_headerText
		driver.findElement(Student_certificate_headerText).sendKeys("lorean ipsum");
		Thread.sleep(1000);
		
		/*
		 * 
		 */
		
		// upload notice time

		String month12 = "MARCH 2022";

		driver.findElement(student_certificate_date).click(); // click calender
		Thread.sleep(2000);

		while (true) {
			String text = driver.findElement(student_certificate_monthyear).getText(); // locator is month and year

			if (text.equals(month12)) {
				break;
			} else {

				driver.findElement(student_certificate_sitebar).click(); // locator of site arrow.you have to change it
			}
		}

		driver.findElement(student_certificatepickdate).click(); // locator of all date.
		Thread.sleep(2000);
		
		/*
		 * 
		 */
		
		//student_certificate_body
		driver.findElement(student_certificate_body).sendKeys("It is a long established fact that a reader will be distracted by the "
				+ " readable content of a page when looking at its layout." );
		Thread.sleep(1000);
		
		//student_certificate_footer_left
		driver.findElement(student_certificate_footer_left).sendKeys("footer_left_text");
		Thread.sleep(1000);
		
		//student_certificate_footer_certer
		driver.findElement(student_certificate_footer_certer).sendKeys("footer_center_text");
		Thread.sleep(1000);
		
		//student_certificate_footer_right
		driver.findElement(student_certificate_footer_right).sendKeys("footer_right_text");
		Thread.sleep(1000);
		
		/*
		 * 
		 */
		
		//upload_certificate_frame
		driver.findElement(upload_certificate_frame).click();
		Thread.sleep(1000);
		
		//upload file
		String filePath=upload.getFilePath("certificate background.png");
		upload.certificateUpload(filePath);
		Thread.sleep(1000);
		
		//student_certificate_save
		driver.findElement(student_certificate_save).click();
		Thread.sleep(1000);
		System.out.println("Successfully saved student certificate");
		
		/*
		 * 
		 * 
		 */
		
		//student_certificate_select
		driver.findElement(student_certificate_select).click();
		Thread.sleep(1000);
		
		//student_certificate_view
		driver.findElement(student_certificate_view).click();
		Thread.sleep(1000);
		
		//student_certificate_view_close
		driver.findElement(student_certificate_view_close).click();
		Thread.sleep(1000);
		
		System.out.println("Successfully view closed student certificate");

		// student_certificate_select
		driver.findElement(student_certificate_select).click();
		Thread.sleep(1000);
		
		//student_certificate_edit
		driver.findElement(student_certificate_edit).click();
		Thread.sleep(1000);
		
		// student_certificate_save
		driver.findElement(student_certificate_save).click();
		Thread.sleep(1000);
		System.out.println("Successfully edited student certificate");

		// student_certificate_select
		driver.findElement(student_certificate_select).click();
		Thread.sleep(1000);
		
		//student_certificate_delete
		driver.findElement(student_certificate_delete).click();
		Thread.sleep(1000);
		
		//student_certificate_delete_cancel
		driver.findElement(student_certificate_delete_cancel).click();
		Thread.sleep(1000);
		System.out.println("Successfully delete cancel student certificate");
//
//		// student_certificate_select
//		driver.findElement(student_certificate_select).click();
//		Thread.sleep(1000);
//
//		// student_certificate_delete
//		driver.findElement(student_certificate_delete).click();
//		Thread.sleep(1000);
//		
//		//student_certificate_delete_confirm
//		driver.findElement(student_certificate_delete_confirm).click();
//		Thread.sleep(1000);
//		System.out.println("Successfully delete confirm student certificate");
	}
	
	/*
	 * 
	 * 
	 * Generate Certificate
	 * 
	 * 
	 */
	
	public void clickGenerateCertificate() throws InterruptedException {
		
//		// admission_select
//		driver.findElement(admission_select).click();
//		Thread.sleep(1000);
		
		//generate certificate
		driver.findElement(generate_certificate).click();
		Thread.sleep(1000);
		System.out.println("Successfully Enter Generate certificate");
		
		//generate_certificate_class
		driver.findElement(generate_certificate_class).click();
		Thread.sleep(1000);
		
		//generate_certificate_specific_class
		driver.findElement(generate_certificate_specific_class).click();
		Thread.sleep(1000);
		
		//generate_certificate_section
		driver.findElement(generate_certificate_section).click();
		Thread.sleep(1000);
		
		//generate_certificate_specific_section
		driver.findElement(generate_certificate_specific_section).click();
		Thread.sleep(1000);
		
		//generate_certificate_select_certificate
		driver.findElement(generate_certificate_select_certificate).click();
		Thread.sleep(1000);
		
		//generate_certificate_specific_certificate
		driver.findElement(generate_certificate_specific_certificate).click();
		Thread.sleep(1000);
		
		//generate_certificate_search
		driver.findElement(generate_certificate_search).click();
		Thread.sleep(1000);
		System.out.println("Successfully search generate_certificate");
		
		//generate_certificate_checkmark
		driver.findElement(generate_certificate_checkmark).click();
		Thread.sleep(1000);
		
		//certificate_generate
		driver.findElement(certificate_generate).click();
		Thread.sleep(1000);
		
		//switch previous window
		upload.switchpreviousWindow();
		Thread.sleep(1000);
		System.out.println("Successfully generated generate_certificate");
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(0)); 
		Thread.sleep(1000);
		
		
	}
	
	/*
	 * 
	 * 
	 * ID Card
	 * 
	 */
	public void IdCardButton() throws InterruptedException, AWTException {
		
//		// admin section_select
//		driver.findElement(admission_select).click();
//		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//a[contains(text(),'ID Card')])[1]")).click();
		Thread.sleep(1000);
		System.out.println("Successfully Enter Id Card");
		
		//id_card
		driver.findElement(id_card).click();
		Thread.sleep(1000);
		
		//create_id_card
		driver.findElement(create_id_card).click();
		Thread.sleep(1000);
		
		//id_card_title
		driver.findElement(id_card_title).sendKeys("lorean ipsum");
		Thread.sleep(1000);
		
	}
		
		
		
		public void IdCardBasic() throws InterruptedException, AWTException {
		/*
		 * 
		 */
		//id_card_logo
		driver.findElement(id_card_logo).click();
		Thread.sleep(1000);
		
		String filePath=upload.getFilePath("php.png");
		upload.profilePicUpload(filePath);
		Thread.sleep(1000);
		
		/*
		 * 
		 */
		// id_card_logo
		driver.findElement(id_card_signature).click();
		Thread.sleep(1000);
		
		String filePath2=upload.getFilePath("php.png");
		upload.profilePicUpload(filePath2);
		Thread.sleep(1000);
		
		//save_id_card
		driver.findElement(save_id_card).click();
		Thread.sleep(1000);
		
		/*
		 * 
		 */
		//id_card_select
		driver.findElement(id_card_select).click();
		Thread.sleep(1000);
		
		//id_card_preview
		driver.findElement(id_card_preview).click();
		Thread.sleep(1000);
		
		//id_card_preview_cancel
		driver.findElement(id_card_preview_cancel).click();
		Thread.sleep(1000);

		// id_card_select
		driver.findElement(id_card_select).click();
		Thread.sleep(1000);
		
		//id_card_edit
		driver.findElement(id_card_edit).click();
		Thread.sleep(1000);

		// save_id_card
		driver.findElement(save_id_card).click();
		Thread.sleep(2000);
		
//		//Get again id card page
//		driver.get(id_card_url);
		
		// admission_select
		driver.findElement(admission_select).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//a[contains(text(),'ID Card')])[1]")).click();
		Thread.sleep(1000);

		// id_card_select
		driver.findElement(id_card_select).click();
		Thread.sleep(2000);
		
		//id_card_delete
		driver.findElement(id_card_delete).click();
		Thread.sleep(2000);
		
		//id_card_delete_cancel
		driver.findElement(id_card_delete_cancel).click();
		Thread.sleep(2000);

//		// id_card_select
//		driver.findElement(id_card_select).click();
//		Thread.sleep(1000);
//
//		// id_card_delete
//		driver.findElement(id_card_delete).click();
//		Thread.sleep(1000);
//		
//		//id_card_delete_confirm
//		driver.findElement(id_card_delete_confirm).click();
//		Thread.sleep(1000);
//		System.out.println("Successfully generated id card");

	}
		
		public void clickIdCardButton() throws InterruptedException, AWTException {
			

			
			//click id card page
			IdCardButton();
			
			//id_card_user
			driver.findElement(id_card_user).click();
			Thread.sleep(1000);
			
			//id_card_specific_user
			driver.findElement(id_card_specific_user_student).click();
			Thread.sleep(1000);
			
			//id card general info
			IdCardBasic();
			System.out.println("Student id card Created successfully");
			
			/*
			 * 
			 * 
			 * 
			 */
			
			//for guardian id card
			
			//click id card page
			IdCardButton();
			
			//id_card_user
			driver.findElement(id_card_user).click();
			Thread.sleep(1000);
			
			//id_card_specific_user
			driver.findElement(id_card_guardian).click();
			Thread.sleep(1000);
			
			//id card general info
			IdCardBasic();
			System.out.println("Gurdian id card Created successfully");
			
			/*
			 * 
			 * 
			 */
			
			//for id_card_teacher

			// click id card page
			IdCardButton();

			// id_card_user
			driver.findElement(id_card_user).click();
			Thread.sleep(1000);

			// id_card_specific_user
			driver.findElement(id_card_staff).click();
			Thread.sleep(1000);
			
			//id_card_teacher
			driver.findElement(id_card_teacher).click();

			// id card general info
			IdCardBasic();
			System.out.println("Teacher id card Created successfully");
			
			/*
			 * 
			 * 
			 */
			
			//for id_card_admin

			// click id card page
			IdCardButton();

			// id_card_user
			driver.findElement(id_card_user).click();
			Thread.sleep(1000);

			// id_card_specific_user
			driver.findElement(id_card_staff).click();
			Thread.sleep(1000);
			
			//id_card_teacher
			driver.findElement(id_card_admin).click();

			// id card general info
			IdCardBasic();
			System.out.println("Admin id card Created successfully");
			
			/*
			 * 
			 * 
			 */
			
			//for id_card_accountant

			// click id card page
			IdCardButton();

			// id_card_user
			driver.findElement(id_card_user).click();
			Thread.sleep(1000);

			// id_card_specific_user
			driver.findElement(id_card_staff).click();
			Thread.sleep(1000);
			
			//id_card_teacher
			driver.findElement(id_card_accountant).click();

			// id card general info
			IdCardBasic();
			System.out.println("Accountant id card Created successfully");
			
			/*
			 * 
			 * 
			 */
			
			//for id_card_receptionist

			// click id card page
			IdCardButton();

			// id_card_user
			driver.findElement(id_card_user).click();
			Thread.sleep(1000);

			// id_card_specific_user
			driver.findElement(id_card_staff).click();
			Thread.sleep(1000);
			
			//id_card_teacher
			driver.findElement(id_card_receptionist).click();

			// id card general info
			IdCardBasic();
			System.out.println("Receptionist id card Created successfully");
			
			/*
			 * 
			 * 
			 */
			
			//for id_card_librarian

			// click id card page
			IdCardButton();

			// id_card_user
			driver.findElement(id_card_user).click();
			Thread.sleep(1000);

			// id_card_specific_user
			driver.findElement(id_card_staff).click();
			Thread.sleep(1000);
			
			//id_card_teacher
			driver.findElement(id_card_librarian).click();

			// id card general info
			IdCardBasic();
			System.out.println("Librarian id card Created successfully");
			
			/*
			 * 
			 * 
			 */
			
			//for id_card_driver

			// click id card page
			IdCardButton();

			// id_card_user
			driver.findElement(id_card_user).click();
			Thread.sleep(1000);

			// id_card_specific_user
			driver.findElement(id_card_staff).click();
			Thread.sleep(1000);
			
			//id_card_teacher
			driver.findElement(id_card_driver).click();

			// id card general info
			IdCardBasic();
			System.out.println("Driver id card Created successfully");
			
			
		}
		
		/*
		 * 
		 * 
		 * Generate ID card
		 * 
		 * 
		 */
		
		public void generateidbasic() throws InterruptedException {
			
			//generate_select_id_card
			driver.findElement(generate_select_id_card).click();
			Thread.sleep(1000);
			
			//generate_specific_id_card
			driver.findElement(generate_specific_id_card).click();
			Thread.sleep(1000);
			
			//generate_id_grid_gap
			driver.findElement(generate_id_grid_gap).sendKeys("3");
			Thread.sleep(1000);
			
			//generate_id_save
			driver.findElement(generate_id_save).click();
			Thread.sleep(1000);
			
			driver.navigate().back();
			Thread.sleep(1000);
			
		}
		
		public void ClickGenerateIdButton() throws InterruptedException {
			
//			// admission_select
//			driver.findElement(admission_select).click();
//			Thread.sleep(1000);
			
			//generate_id_card
			driver.findElement(generate_id_card).click();
			Thread.sleep(1000);
			System.out.println("Successfully Enter Generate id card");
			
			//generate_id_role
			driver.findElement(generate_id_role).click();
			Thread.sleep(1000);
			
			// generate_id_role_student
			driver.findElement(generate_id_role_student).click();
			Thread.sleep(1000);

			generateidbasic();
			System.out.println("Student id card Generated successfully");

			/*
			 * 
			 * 
			 */

			//generate_id_card
			driver.findElement(generate_id_card).click();
			Thread.sleep(1000);
			
			// generate_id_role
			driver.findElement(generate_id_role).click();
			Thread.sleep(1000);

			// generate_id_role_parents
			driver.findElement(generate_id_role_parents).click();
			Thread.sleep(1000);

			generateidbasic();
			System.out.println("Parents id card Generated successfully");

			/*
			 * 
			 * 
			 */

			//generate_id_card
			driver.findElement(generate_id_card).click();
			Thread.sleep(1000);

			// generate_id_role
			driver.findElement(generate_id_role).click();
			Thread.sleep(1000);

			// generate_id_role_teacher
			driver.findElement(generate_id_role_teacher).click();
			Thread.sleep(1000);

			generateidbasic();
			System.out.println("Teacher id card Generated successfully");

			/*
			 * 
			 * 
			 */

			//generate_id_card
			driver.findElement(generate_id_card).click();
			Thread.sleep(1000);

			// generate_id_role
			driver.findElement(generate_id_role).click();
			Thread.sleep(1000);

			// generate_id_role_admin
			driver.findElement(generate_id_role_admin).click();
			Thread.sleep(1000);

			generateidbasic();
			System.out.println("Admin id card Generated successfully");

			/*
			 * 
			 * 
			 */

			//generate_id_card
			driver.findElement(generate_id_card).click();
			Thread.sleep(1000);

			// generate_id_role
			driver.findElement(generate_id_role).click();
			Thread.sleep(1000);

			// generate_id_role_generate_id_role_accountant
			driver.findElement(generate_id_role_accountant).click();
			Thread.sleep(1000);

			generateidbasic();
			System.out.println("Accountant id card Generated successfully");

			/*
			 * 
			 * 
			 */

			//generate_id_card
			driver.findElement(generate_id_card).click();
			Thread.sleep(1000);

			// generate_id_role
			driver.findElement(generate_id_role).click();
			Thread.sleep(1000);

			// generate_id_role_generate_id_role_receptionist
			driver.findElement(generate_id_role_receptionist).click();
			Thread.sleep(1000);

			generateidbasic();
			System.out.println("Receptionist id card Generated successfully");

			/*
			 * 
			 * 
			 */

			//generate_id_card
			driver.findElement(generate_id_card).click();
			Thread.sleep(1000);

			// generate_id_role
			driver.findElement(generate_id_role).click();
			Thread.sleep(1000);

			// generate_id_role_generate_id_role_librarian
			driver.findElement(generate_id_role_librarian).click();
			Thread.sleep(1000);

			generateidbasic();
			System.out.println("Librarian id card Generated successfully");
			
			/*
			 * 
			 * 
			 */

			//generate_id_card
			driver.findElement(generate_id_card).click();
			Thread.sleep(1000);

			// generate_id_role
			driver.findElement(generate_id_role).click();
			Thread.sleep(1000);

			// generate_id_role_generate_id_role_librarian
			driver.findElement(generate_id_role_driver).click();
			Thread.sleep(1000);

			generateidbasic();
			System.out.println("Driver id card Generated successfully");
			System.out.println("Checkout from Admin Sections");
		}

}
