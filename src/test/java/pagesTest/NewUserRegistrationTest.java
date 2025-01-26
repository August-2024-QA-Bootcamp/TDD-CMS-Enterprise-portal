package pagesTest;

import org.testng.annotations.Test;
import baseUtil.BaseClass;

public class NewUserRegistrationTest extends BaseClass {
	
	@Test(groups = "smoke")
	public void landing_on_new_user_registration_page_step_one_test() {
		homePage.click_to_new_user_registration();
		newUserRegistration.landing_on_new_user_registration_page_step_one();		
	}
	
	@Test(groups = "regression")
	public void click_on_next_button_of_step_one_without_agree_to_terms_test() {
		homePage.click_to_new_user_registration();
		newUserRegistration.select_your_application_on_new_user_registration_page_step_one();
		newUserRegistration.click_on_next_button_of_step_one_without_agree_to_terms();		
	}
	
	@Test(groups = "regression")
	public void click_on_cancel_button_of_step_One_direct_to_homePage_test() {
		homePage.click_to_new_user_registration();
		newUserRegistration.select_your_application_on_new_user_registration_page_step_one();
		newUserRegistration.click_on_cancel_button_of_step_One_direct_to_homePage();
	}
	
	@Test(groups = "regression")
	public void click_on_next_button_of_step_one_with_agree_to_terms_direct_to_step_two_test() {
		homePage.click_to_new_user_registration();
		newUserRegistration.select_your_application_on_new_user_registration_page_step_one();
		newUserRegistration.click_on_next_button_of_step_one_with_agree_to_terms_direct_to_step_two();
		newUserRegistration.step_two_title_and_header();
	}
	
	@Test(groups = "regression")
	public void click_on_back_button_on_step_two_direct_to_step_one_test() {
		homePage.click_to_new_user_registration();
		newUserRegistration.select_your_application_on_new_user_registration_page_step_one();
		newUserRegistration.click_on_next_button_of_step_one_with_agree_to_terms_direct_to_step_two();
		newUserRegistration.click_on_back_button_on_step_two_direct_to_step_one();
	}
	
	@Test(groups = "regression")
	public void click_on_cancel_button_on_step_two_direct_to_homepage_test() {
		homePage.click_to_new_user_registration();
		newUserRegistration.select_your_application_on_new_user_registration_page_step_one();
		newUserRegistration.click_on_next_button_of_step_one_with_agree_to_terms_direct_to_step_two();
		newUserRegistration.click_on_cancel_button_on_step_two_direct_to_homepage();
	}
	
	@Test(groups = "regression")
	public void click_on_next_button_on_step2_without_any_data_test() {
		homePage.click_to_new_user_registration();
		newUserRegistration.select_your_application_on_new_user_registration_page_step_one();
		newUserRegistration.click_on_next_button_of_step_one_with_agree_to_terms_direct_to_step_two();
		newUserRegistration.click_on_next_button_of_step_two();
		newUserRegistration.error_message_under_and_top_of_the_page_on_step_two();
	}
	
	@Test(groups = "regression")
	public void first_name_test() {
		homePage.click_to_new_user_registration();
		newUserRegistration.select_your_application_on_new_user_registration_page_step_one();
		newUserRegistration.click_on_next_button_of_step_one_with_agree_to_terms_direct_to_step_two();
		newUserRegistration.first_name();
	}
	
	@Test(groups = "regression")
	public void middle_name_test() {
		homePage.click_to_new_user_registration();
		newUserRegistration.select_your_application_on_new_user_registration_page_step_one();
		newUserRegistration.click_on_next_button_of_step_one_with_agree_to_terms_direct_to_step_two();
		newUserRegistration.middle_name();
	}
	
	@Test(groups = "regression")
	public void last_name_test() {
		homePage.click_to_new_user_registration();
		newUserRegistration.select_your_application_on_new_user_registration_page_step_one();
		newUserRegistration.click_on_next_button_of_step_one_with_agree_to_terms_direct_to_step_two();
		newUserRegistration.last_name();
	}
	
	@Test(groups = "regression")
	public void suffix_test() {
		homePage.click_to_new_user_registration();
		newUserRegistration.select_your_application_on_new_user_registration_page_step_one();
		newUserRegistration.click_on_next_button_of_step_one_with_agree_to_terms_direct_to_step_two();
		newUserRegistration.suffix();	
	}
	
	@Test(groups = "regression")
	public void birth_month_test() {	
		homePage.click_to_new_user_registration();
		newUserRegistration.select_your_application_on_new_user_registration_page_step_one();
		newUserRegistration.click_on_next_button_of_step_one_with_agree_to_terms_direct_to_step_two();
		newUserRegistration.birth_month();
	}
	
	@Test(groups = "regression")
	public void birth_year_test() {	
		homePage.click_to_new_user_registration();
		newUserRegistration.select_your_application_on_new_user_registration_page_step_one();
		newUserRegistration.click_on_next_button_of_step_one_with_agree_to_terms_direct_to_step_two();
		newUserRegistration.birth_year();
	}
	
	@Test(groups = "regression")
	public void birth_date_test() {	
		homePage.click_to_new_user_registration();
		newUserRegistration.select_your_application_on_new_user_registration_page_step_one();
		newUserRegistration.click_on_next_button_of_step_one_with_agree_to_terms_direct_to_step_two();
		newUserRegistration.birth_date();
	}
	
	@Test(groups = "regression")
	public void address_line1_test () {
		homePage.click_to_new_user_registration();
		newUserRegistration.select_your_application_on_new_user_registration_page_step_one();
		newUserRegistration.click_on_next_button_of_step_one_with_agree_to_terms_direct_to_step_two();
		newUserRegistration.address_line1();
	}
	
	@Test(groups = "regression")
	public void address_line2_test () {
		homePage.click_to_new_user_registration();
		newUserRegistration.select_your_application_on_new_user_registration_page_step_one();
		newUserRegistration.click_on_next_button_of_step_one_with_agree_to_terms_direct_to_step_two();
		newUserRegistration.address_line2();
	}
	
	@Test(groups = "regression")
	public void city_test () {
		homePage.click_to_new_user_registration();
		newUserRegistration.select_your_application_on_new_user_registration_page_step_one();
		newUserRegistration.click_on_next_button_of_step_one_with_agree_to_terms_direct_to_step_two();
		newUserRegistration.city();
	}
	
	@Test(groups = "regression")
	public void state_test () {
		homePage.click_to_new_user_registration();
		newUserRegistration.select_your_application_on_new_user_registration_page_step_one();
		newUserRegistration.click_on_next_button_of_step_one_with_agree_to_terms_direct_to_step_two();
		newUserRegistration.state();
	}
	
	@Test(groups = "regression")
	public void zip_code_test () {
		homePage.click_to_new_user_registration();
		newUserRegistration.select_your_application_on_new_user_registration_page_step_one();
		newUserRegistration.click_on_next_button_of_step_one_with_agree_to_terms_direct_to_step_two();
		newUserRegistration.zip_code();
	}
	
	@Test(groups = "regression")
	public void zip_code_plus4_test () {
		homePage.click_to_new_user_registration();
		newUserRegistration.select_your_application_on_new_user_registration_page_step_one();
		newUserRegistration.click_on_next_button_of_step_one_with_agree_to_terms_direct_to_step_two();
		newUserRegistration.zip_code_plus4();
	}
	
	@Test(groups = "regression")
	public void email_test () {
		homePage.click_to_new_user_registration();
		newUserRegistration.select_your_application_on_new_user_registration_page_step_one();
		newUserRegistration.click_on_next_button_of_step_one_with_agree_to_terms_direct_to_step_two();
		newUserRegistration.email();
	}
	
	@Test(groups = "regression")
	public void confirm_email_test () {
		homePage.click_to_new_user_registration();
		newUserRegistration.select_your_application_on_new_user_registration_page_step_one();
		newUserRegistration.click_on_next_button_of_step_one_with_agree_to_terms_direct_to_step_two();
		newUserRegistration.confirm_email();
	}
	
	@Test(groups = "regression")
	public void phone_number_test () {
		homePage.click_to_new_user_registration();
		newUserRegistration.select_your_application_on_new_user_registration_page_step_one();
		newUserRegistration.click_on_next_button_of_step_one_with_agree_to_terms_direct_to_step_two();
		newUserRegistration.phone_number();
	}
	
	@Test(groups = "regression")
	public void click_on_next_button_of_step_two_with_data_direct_to_step_three_test(){
		homePage.click_to_new_user_registration();
		newUserRegistration.select_your_application_on_new_user_registration_page_step_one();
		newUserRegistration.click_on_next_button_of_step_one_with_agree_to_terms_direct_to_step_two();
		newUserRegistration.happy_path_step_two();
		newUserRegistration.click_on_next_button_of_step_two();
	}
	
	@Test(groups = "regression")
	public void step_three_title_and_header_test() {
		homePage.click_to_new_user_registration();
		newUserRegistration.select_your_application_on_new_user_registration_page_step_one();
		newUserRegistration.click_on_next_button_of_step_one_with_agree_to_terms_direct_to_step_two();
		newUserRegistration.happy_path_step_two();
		newUserRegistration.click_on_next_button_of_step_two();
		newUserRegistration.step_three_title_and_header();
	}
	
	@Test(groups = "regression")
	public void click_on_back_button_on_step_three_direct_to_step_two_test() {
		homePage.click_to_new_user_registration();
		newUserRegistration.select_your_application_on_new_user_registration_page_step_one();
		newUserRegistration.click_on_next_button_of_step_one_with_agree_to_terms_direct_to_step_two();
		newUserRegistration.happy_path_step_two();
		newUserRegistration.click_on_next_button_of_step_two();
		newUserRegistration.click_on_back_button_on_step_three_direct_to_step_two();
	}
	
	@Test(groups = "regression")
	public void click_on_cancel_button_on_step_three_direct_to_homepage_test() {
		homePage.click_to_new_user_registration();
		newUserRegistration.select_your_application_on_new_user_registration_page_step_one();
		newUserRegistration.click_on_next_button_of_step_one_with_agree_to_terms_direct_to_step_two();
		newUserRegistration.happy_path_step_two();
		newUserRegistration.click_on_next_button_of_step_two();
		newUserRegistration.click_on_cancel_button_on_step_three_direct_to_homepage();
	}
	
	@Test(groups = "regression")
	public void click_on_next_button_on_step_three_without_any_data_test() {
		homePage.click_to_new_user_registration();
		newUserRegistration.select_your_application_on_new_user_registration_page_step_one();
		newUserRegistration.click_on_next_button_of_step_one_with_agree_to_terms_direct_to_step_two();
		newUserRegistration.happy_path_step_two();
		newUserRegistration.click_on_next_button_of_step_two();
		newUserRegistration.click_on_next_button_of_step_three();
		newUserRegistration.error_message_under_and_top_of_the_page_on_step_three();
	}	
	
	@Test(groups = "regression")
	public void click_on_next_button_of_step_three_with_data_direct_to_summary_page_test(){
		homePage.click_to_new_user_registration();
		newUserRegistration.select_your_application_on_new_user_registration_page_step_one();
		newUserRegistration.click_on_next_button_of_step_one_with_agree_to_terms_direct_to_step_two();
		newUserRegistration.happy_path_step_two();
		newUserRegistration.click_on_next_button_of_step_two();
		newUserRegistration.happy_path_step_three();
		newUserRegistration.click_on_next_button_of_step_three();
	}
	
	@Test(groups = "regression")
	public void summary_page_title_and_header_test() {
		homePage.click_to_new_user_registration();
		newUserRegistration.select_your_application_on_new_user_registration_page_step_one();
		newUserRegistration.click_on_next_button_of_step_one_with_agree_to_terms_direct_to_step_two();
		newUserRegistration.happy_path_step_two();
		newUserRegistration.click_on_next_button_of_step_two();
		newUserRegistration.happy_path_step_three();
		newUserRegistration.click_on_next_button_of_step_three();
		newUserRegistration.summary_page_title_and_header();
	}
	
	@Test(groups = "regression")
	public void click_on_submit_user_button_of_summary_page_direct_to_success_message_test(){
		homePage.click_to_new_user_registration();
		newUserRegistration.select_your_application_on_new_user_registration_page_step_one();
		newUserRegistration.click_on_next_button_of_step_one_with_agree_to_terms_direct_to_step_two();
		newUserRegistration.happy_path_step_two();
		newUserRegistration.click_on_next_button_of_step_two();
		newUserRegistration.happy_path_step_three();
		newUserRegistration.click_on_next_button_of_step_three();
		newUserRegistration.summary_page_title_and_header();
		newUserRegistration.click_on_submit_user_button_of_summary_page();
		newUserRegistration.success_message();
	}
	
	
	
	
	
	
	
	
	
	
}