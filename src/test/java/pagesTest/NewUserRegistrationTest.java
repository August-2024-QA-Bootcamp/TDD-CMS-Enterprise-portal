package pagesTest;

import static common.CommonActions.clearTextFromTheField;
import static common.CommonActions.clickElement;
import static common.CommonActions.elementEnabled;
import static common.CommonActions.inputText;
import static common.CommonActions.inputTextThenClickTab;
import static common.CommonActions.pause;
import static common.CommonActions.scrollIntoViewTheElementUsingJavascriptExecutor;
import static common.CommonActions.selectDropdown;
import static common.CommonActions.selectElelementFromDropdownOnebyOne;
import static common.CommonActions.validationOfHeader;
import static common.CommonActions.validationOfOtherHeader;
import static common.CommonActions.validationOfSubHeader;
import static common.CommonActions.verifyCurrentUrl;
import static common.CommonActions.verifyErrorMessageOnTheTopOfThePage;
import static common.CommonActions.verifyErrorMessageUnderTheField;
import static common.CommonActions.verifyLengthOfTheFieldContent;
import static common.CommonActions.verifyTextOfTheWebElement;
import static common.CommonActions.verifyTitle;

import org.testng.annotations.Test;
import baseUtil.BaseClass;
import constants.Attribute;

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
	
	@Test
	public void step_two_title_and_header_validation_test() {
		homePage.click_to_new_user_registration();
		newUserRegistration.select_your_application_on_new_user_registration_page_step_one();
		newUserRegistration.click_on_next_button_of_step_one_with_agree_to_terms_direct_to_step_two();
		newUserRegistration.step_two_title_and_header_validation();
	}
	
	@Test
	public void click_on_back_button_on_step_two_direct_to_step_one_test() {
		homePage.click_to_new_user_registration();
		newUserRegistration.select_your_application_on_new_user_registration_page_step_one();
		newUserRegistration.click_on_next_button_of_step_one_with_agree_to_terms_direct_to_step_two();
		newUserRegistration.click_on_back_button_on_step_two_direct_to_step_one();
	}
	
	@Test
	public void click_on_cancel_button_on_step_two_direct_to_homepage_test() {
		homePage.click_to_new_user_registration();
		newUserRegistration.select_your_application_on_new_user_registration_page_step_one();
		newUserRegistration.click_on_next_button_of_step_one_with_agree_to_terms_direct_to_step_two();
		newUserRegistration.click_on_cancel_button_on_step_two_direct_to_homepage();
	}
	
	@Test
	public void click_on_next_button_on_step2_without_any_data_test() {
		homePage.click_to_new_user_registration();
		newUserRegistration.select_your_application_on_new_user_registration_page_step_one();
		newUserRegistration.click_on_next_button_of_step_one_with_agree_to_terms_direct_to_step_two();
		newUserRegistration.click_on_next_button_of_step_two();
		newUserRegistration.error_message_under_and_top_of_the_page_on_step_two();
	}
	
	@Test
	public void first_name_validation_test() {
		homePage.click_to_new_user_registration();
		newUserRegistration.select_your_application_on_new_user_registration_page_step_one();
		newUserRegistration.click_on_next_button_of_step_one_with_agree_to_terms_direct_to_step_two();
		newUserRegistration.first_name_validation();
	}
	
	@Test
	public void middle_name_validation_test() {
		homePage.click_to_new_user_registration();
		newUserRegistration.select_your_application_on_new_user_registration_page_step_one();
		newUserRegistration.click_on_next_button_of_step_one_with_agree_to_terms_direct_to_step_two();
		newUserRegistration.middle_name_validation();
	}
	
	@Test
	public void last_name_validation_test() {
		homePage.click_to_new_user_registration();
		newUserRegistration.select_your_application_on_new_user_registration_page_step_one();
		newUserRegistration.click_on_next_button_of_step_one_with_agree_to_terms_direct_to_step_two();
		newUserRegistration.last_name_validation();
	}
	
	@Test
	public void suffix_validation_test() {
		homePage.click_to_new_user_registration();
		newUserRegistration.select_your_application_on_new_user_registration_page_step_one();
		newUserRegistration.click_on_next_button_of_step_one_with_agree_to_terms_direct_to_step_two();
		newUserRegistration.suffix_validation();	
	}
	
	@Test
	public void birth_month_validation_test() {	
		homePage.click_to_new_user_registration();
		newUserRegistration.select_your_application_on_new_user_registration_page_step_one();
		newUserRegistration.click_on_next_button_of_step_one_with_agree_to_terms_direct_to_step_two();
		newUserRegistration.birth_month_validation();
	}
	
	@Test
	public void birth_year_validation_test() {	
		homePage.click_to_new_user_registration();
		newUserRegistration.select_your_application_on_new_user_registration_page_step_one();
		newUserRegistration.click_on_next_button_of_step_one_with_agree_to_terms_direct_to_step_two();
		newUserRegistration.birth_year_validation();
	}
	
	@Test
	public void birth_date_validation_test() {	
		homePage.click_to_new_user_registration();
		newUserRegistration.select_your_application_on_new_user_registration_page_step_one();
		newUserRegistration.click_on_next_button_of_step_one_with_agree_to_terms_direct_to_step_two();
		newUserRegistration.birth_date_validation();
	}
	
	@Test
	public void untilClickOnNextButtonInStep2WithData_test() {
		homePage.click_to_new_user_registration();
		newUserRegistration.select_your_application_on_new_user_registration_page_step_one();
		newUserRegistration.click_on_next_button_of_step_one_with_agree_to_terms_direct_to_step_two();
		newUserRegistration.untilClickOnNextButtonInStep2WithData();
		newUserRegistration.click_on_next_button_of_step_two();
		newUserRegistration.stepThreeTitleAndHeaderValidation();
	}
	
	
	
	
	
	
	
	
	
	
}