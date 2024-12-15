package pagesTest;

import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class HomePageTest extends BaseClass {
	
	@Test
	public void landing_on_homePage_test() {
		homePage.landing_on_homePage();
	}
	
	@Test
	public void click_to_new_user_registration_test() {
		homePage.click_to_new_user_registration();
	}

}