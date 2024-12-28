package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import constants.Attribute;
import static common.CommonActions.*;
import static common.CommonWaits.*;

import java.time.Duration;

public class HomePageParameterized {	

	WebDriver driver;
	WebDriverWait wait;
	
	public HomePageParameterized(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}

	@FindBy(name = "user-d")
	WebElement userId;
	
	@FindBy(how = How.NAME, using = "pass-d")
	WebElement password;	
	
	@FindBy(xpath = "//label[@id='cms-label-tc']")
	WebElement checkBox;
	
	@FindBy (id = "cms-login-submit")
	WebElement login;
	
	@FindBy(xpath = "//div[starts-with(text(),'Invalid')]")
	WebElement loginErrorMsg;
	
	// below methods Used in HomePageParameterizedTest Class	
	public void inputTextInUserIdField(String userIdFieldText) {
		inputText(userId, userIdFieldText);
	}
	
	public void inputTextInPasswordField(String passwordFieldText) {
		inputText(password, passwordFieldText);
	}
	
	public void clickCheckBox() {
		pause(3000);
		clickElement(checkBox);
	}
	
	public void clickLogin() {
		pause(3000);
		clickElement(login);		
	}
	
	public void errorMessage(String errMsg) {
		pause(3000);
		verifyErrorMessage(loginErrorMsg, Attribute.INNER_HTML, errMsg);
		pause(3000);
	}


	
	
	

}