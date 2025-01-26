package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static common.CommonActions.*;

import java.time.Duration;

public class HomePage {	

	WebDriver driver;
	WebDriverWait wait;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}

	@FindBy(css = "em.cms-icon.cms-sprite-loggedout.ms-3")
	WebElement logo;
	
	@FindBy(id = "cms-newuser-reg")
	WebElement newUserRegistration;
	
	public void landing_on_homePage() {
		elementDisplayed(logo);
		// If there is a header/sub header present, validate here
		verifyTitle(driver, "CMS Enterprise Portal");
		// getCurrentUrl needed when you move to other pages from landing page
	}
	
	public void click_to_new_user_registration() {
		wait.until(ExpectedConditions.visibilityOf(newUserRegistration));
		//pause(3000);
		elementEnabled(newUserRegistration);
		verifyTextOfTheWebElement(newUserRegistration, "New User Registration");
		clickElement(newUserRegistration);
	}
	
	/*
	 We can also validate:
	  Application
	  Help
	  About
	  Footer Logo
	  Footer Text
	  & Rest
	 */
	
}