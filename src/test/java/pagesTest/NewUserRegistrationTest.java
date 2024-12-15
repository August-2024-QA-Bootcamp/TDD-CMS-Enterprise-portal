package pagesTest;

import org.testng.annotations.Test;
import baseUtil.BaseClass;

public class NewUserRegistrationTest extends BaseClass {
	
	@Test
	public void landing_on_new_user_registration_page_step_one_test() {
		homePage.click_to_new_user_registration();
		newUserRegistration.landing_on_new_user_registration_page_step_one();		
	}
	
	@Test
	public void click_on_next_button_of_step_one_without_agree_to_terms_test() {
		homePage.click_to_new_user_registration();
		newUserRegistration.select_your_application_on_new_user_registration_page_step_one();
		newUserRegistration.click_on_next_button_of_step_one_without_agree_to_terms();		
	}
	
	@Test
	public void click_on_cancel_button_of_step_One_direct_to_homePage_test() {
		homePage.click_to_new_user_registration();
		newUserRegistration.select_your_application_on_new_user_registration_page_step_one();
		newUserRegistration.click_on_cancel_button_of_step_One_direct_to_homePage();
	}
	
	@Test
	public void click_on_next_button_of_step_one_with_agree_to_terms_direct_to_step_two_test() {
		homePage.click_to_new_user_registration();
		newUserRegistration.select_your_application_on_new_user_registration_page_step_one();
		newUserRegistration.click_on_next_button_of_step_one_with_agree_to_terms_direct_to_step_two();
	}
	
	// abc
	
	
	
	
	
	
	
	
	
}