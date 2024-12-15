package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import constants.Attribute;
import static common.CommonActions.*;
import static common.CommonWaits.*;

import java.time.Duration;
import java.util.List;

public class NewUserRegistration {	

	WebDriver driver;
	WebDriverWait wait;
	
	public NewUserRegistration(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}
	
	@FindBy(css = "em.cms-icon.cms-sprite-loggedout.ms-3")
	WebElement logo;
	
	@FindBy(id = "cms-newuser-reg")
	WebElement newUserRegistration;

	@FindBy(xpath = "//p[contains(text(), 'Step #1')]")
	WebElement stepOneHeader;
	
	@FindBy(xpath = "//p[contains(text(), 'Step 1 of 3')]")
	WebElement stepOneSubHeader;
	
	@FindBy(xpath = "//div[@class='ng-input']")
	WebElement selectYourApplication;

	@FindBy(id = "textSearch")
	WebElement textSearchField;
	
	// @FindBy(xpath = "//a[text()='Cancel']//parent::div[@class='col-xs-12 col-sm-2 col-md-1 cms-agree-item cms-cancel']")
	// above line will not work as class is compound class
	// @FindBy(xpath = "(//a[text()='Cancel'])[1]")
	@FindBy(xpath = "(//a[@class='cms-p-reg-register-cancel'])[1]")
	WebElement stepOneCancel;
	
	@FindBy(id = "cms-tos-reg")
	WebElement agreeToTheTerms;
	
	@FindBy(xpath = "//div[@id='agreeErr']")
	WebElement agreeToTheTermsErrorMessag;

	@FindBy(name = "termsAndCondNext")
	WebElement stepOneNextButton;
	
	@FindBy(id = "cms-register-information")
	WebElement stepTwoHeader;

	@FindBy(xpath = "//p[contains(text(), ' Step 2 of 3')]")
	WebElement stepTwoSubHeader;
	
	@FindBy(xpath = "(//p[contains(text(), 'All f')])[1]")
	WebElement stepTwoOtherHeader;
	
	@FindBy(xpath = "(//a[contains(text(), 'Cancel')])[2]")
	WebElement stepTwoCancel;	
	
    
	// First Name
	@FindBy(id = "cms-newuser-firstName")
	WebElement firstName;
	
	@FindBy(xpath = "//span[text()='Must be alphabetic characters.']")
	WebElement alphabeticCharactersErrorMessageUnderTheField;
	
	@FindBy(xpath = "//span[contains(text(), 'Required field.')]")
	WebElement requiredFieldErrorMessageUnderFirstName;
	
	@FindBy(xpath = "//a[contains(text(), 'First Name')]")
	WebElement firstNameErrorMessageTopOfThePage;
	
	// Middle Name
	@FindBy(id = "cms-newuser-middleName")
	WebElement middleName;

	// Last Name
	@FindBy(id = "cms-newuser-lastName")
	WebElement lastName;
	
	@FindBy(xpath = "//span[contains(text(), 'Required field.')]")
	WebElement requiredFieldErrorMessageUnderLastName;
	
	@FindBy(xpath = "//a[contains(text(), 'Last Name')]")
	WebElement lastNameErrorMessageTopOfThePage;

	
	// Suffix
	@FindBy(id = "cms-newuser-nameSuffix")
	WebElement suffix;
	
	@FindBy(xpath = "//select[@id='cms-newuser-nameSuffix']/option")
	List <WebElement> suffixList;
	
	// DOB
	@FindBy(id = "cms-newuser-birthMonth")
	WebElement birthMonth;
	
	@FindBy(xpath = "//span[contains(text(), 'Required field.')]")
	WebElement requiredFieldErrorMessageUnderBirthMonth;
	
	@FindBy(xpath = "//a[contains(text(), 'Birth Month')]")
	WebElement birthMonthErrorMessageTopOfThePage;
	
	@FindBy(xpath = "//select[@id='cms-newuser-birthMonth']/option")
	List<WebElement> birthMonthList;

	@FindBy(id = "cms-newuser-birthDate")
	WebElement birthDate;
	
	@FindBy(xpath = "//span[contains(text(), 'Required field.')]")
	WebElement requiredFieldErrorMessageUnderBirthDate;
	
	@FindBy(xpath = "//a[contains(text(), 'Birth Date')]")
	WebElement birthDateErrorMessageTopOfThePage;
	
	@FindBy(xpath = "//select[@id='cms-newuser-birthDate']/option")
	List<WebElement> birthDateList;

	@FindBy(id = "cms-newuser-birthYear")
	WebElement birthYear;
	
	@FindBy(xpath = "//span[contains(text(), 'Required field.')]")
	WebElement requiredFieldErrorMessageUnderBirthYear;
	
	@FindBy(xpath = "//a[contains(text(), 'Birth Year')]")
	WebElement birthYearErrorMessageTopOfThePage;
	
	@FindBy(xpath = "//select[@id='cms-newuser-birthYear']/option")
	List<WebElement> birthYearList;
	
	// US Based Address
	@FindBy(xpath = "//label[@class='check-radio']//parent::li[@class='cms-radio-item']")
	WebElement usBasedAddress;

	@FindBy(xpath = "//label[@class='check-radio']//parent::li[@class='cms-radio-item2']")
	WebElement nonUsBasedAddress;

	// Address Line 1 and 2
	@FindBy(id = "cms-newuser-homeAddressLine1")
	WebElement addressLine1;
	
	@FindBy(xpath = "//span[contains(text(), 'Required field.')]")
	WebElement requiredFieldErrorMessageUnderHomeAddressLine1;
	
	@FindBy(xpath = "//a[contains(text(), 'Home Address Line1')]")
	WebElement homeAddressLine1ErrorMessageTopOfThePage;
	
	@FindBy(xpath = "//span[text()='Must be alphanumeric characters.']")
	WebElement alphanumericCharactersErrorMessageUnderTheField;

	@FindBy(id = "cms-newuser-usAddress2")
	WebElement addressLine2;
	
	// City
	@FindBy(id = "cms-newuser-usCity")
	WebElement city;
	
	@FindBy(xpath = "//span[contains(text(), 'Required field.')]")
	WebElement requiredFieldErrorMessageUnderCity;
	
	@FindBy(xpath = "//a[contains(text(), 'City')]")
	WebElement cityErrorMessageTopOfThePage;

	// State
	@FindBy(id = "cms-newuser-usState")
	WebElement state;
	
	@FindBy(xpath = "//span[contains(text(), 'Required field.')]")
	WebElement requiredFieldErrorMessageUnderState;
	
	@FindBy(xpath = "//a[contains(text(), 'State')]")
	WebElement stateErrorMessageTopOfThePage;
	
	@FindBy(xpath = "//select[@id='cms-newuser-usState']/option")
	List<WebElement> stateList;

	// Zip Code
	@FindBy(name = "cms-newuser-zipcode")
	WebElement zipCode;
	
	@FindBy(xpath = "//span[contains(text(), 'Required field.')]")
	WebElement requiredFieldErrorMessageUnderZipCode;
	
	@FindBy(xpath = "//a[contains(text(), 'Zip Code')]")
	WebElement zipCodeMessageTopOfThePage;

	@FindBy(xpath = "//span[text()='Must be a valid numeric ZIP Code.']")
	WebElement numericZipCodeErrorMessageUnderTheField;

	@FindBy(xpath = "//span[text()='Must be a valid numeric ZIP+4 Code.']")
	WebElement numericZipPlus4CodeErrorMessageUnderTheField;

	@FindBy(id = "cms-newuser-usZipcodeExt")
	WebElement zipCodeExt;

	@FindBy(id = "cms-newuser-usEmail")
	WebElement email;
	
	@FindBy(xpath = "//span[contains(text(), 'Required field.')]")
	WebElement requiredFieldErrorMessageUnderEmail;
	
	@FindBy(xpath = "//a[contains(text(), 'Email Address')]")
	WebElement emailAddressMessageTopOfThePage;

	@FindBy(id = "cms-newuser-usConfirmEmail")
	WebElement confirmEmail;
	
	@FindBy(xpath = "//span[contains(text(), 'Required field.')]")
	WebElement requiredFieldErrorMessageUnderConfirmEmail;
	
	@FindBy(xpath = "//a[contains(text(), 'Confirm Email Address')]")
	WebElement confirmEmailAddressMessageTopOfThePage;

	@FindBy(xpath = "//span[text()='Must match Email Address values.']")
	WebElement mismatchEmailAddressErrorMessageUnderTheField;

	@FindBy(id = "cms-newuser-usPhoneNumber")
	WebElement phoneNumber;
	
	@FindBy(xpath = "//span[contains(text(), 'Required field.')]")
	WebElement requiredFieldErrorMessageUnderPhoneNumber;
	
	@FindBy(xpath = "//a[contains(text(), 'Phone Number')]")
	WebElement phoneNumberMessageTopOfThePage;

	@FindBy(xpath = "//span[text()='Phone Number must not start with a 1 or 0.']")
	WebElement phoneNumberNotStartWithErrorMessageUnderTheField;

	@FindBy(xpath = "//span[text()='Must be a valid Phone Number.']")
	WebElement validPhoneNumberErrorMessageUnderTheField;

	@FindBy(id = "step2NextButton")
	WebElement nextButtonStep2;
	
	@FindBy(id = "step2BackButton")
	WebElement stepTwoBackButton;
	
	@FindBy(id = "cms-create-id-password")
	WebElement stepThreeHeader;

	@FindBy(xpath = "//p[contains(text(), 'Step 3')]")
	WebElement stepThreeSubHeader;
	
	@FindBy(xpath = "(//p[contains(text(), 'All')])[2]")
	WebElement stepThreeOtherHeader;
	
	public void landing_on_new_user_registration_page_step_one() {
		pause(3000);
		validationOfHeader(stepOneHeader, "Step #1: Select Your Application");
		validationOfSubHeader(stepOneSubHeader, "Step 1 of 3 - Select your application from the dropdown. You will then need to agree to the terms & conditions.");
		verifyTitle(driver, "CMS Enterprise Portal - New User Registration");
		verifyCurrentUrl(driver, "https://portal.cms.gov/portal/newuserregistration");
	}
	
	public void select_your_application_on_new_user_registration_page_step_one() {
		pause(3000);
		elementDisplayed(selectYourApplication);
		clickElement(selectYourApplication);
		elementDisplayed(textSearchField);
		inputTextThenClickEnter(textSearchField, "BCRS Web");
	}
	
	public void click_on_next_button_of_step_one_without_agree_to_terms() {
		pause(3000);
		elementEnabled(stepOneNextButton);
		verifyTextOfTheWebElement(stepOneNextButton, "Next");
		clickElement(stepOneNextButton);
		pause(3000);
		verifyErrorMessageUnderTheField(agreeToTheTermsErrorMessag, Attribute.INNER_HTML, "Please agree to the Terms &amp; Conditions.");		
		pause(3000);
	}
	
	public void click_on_cancel_button_of_step_One_direct_to_homePage() {
		pause(3000);
		scrollIntoViewTheElementUsingJavascriptExecutor(driver, stepOneCancel);
		elementEnabled(stepOneCancel);
		verifyTextOfTheWebElement(stepOneCancel, "Cancel");
		clickUsingJavascriptExecutor(driver, stepOneCancel);
		// above line is better, below line is ok too, but this cancel button take long tome to click
		// clickElement(stepOneCancel);
		pause(3000);
		verifyCurrentUrl(driver, "https://portal.cms.gov/portal/");
		elementDisplayed(logo);
		verifyTitle(driver, "CMS Enterprise Portal");
		pause(3000);	
	}
	
	public void click_on_next_button_of_step_one_with_agree_to_terms_direct_to_step_two() {
		pause(3000);
		scrollIntoViewTheElementUsingJavascriptExecutor(driver, stepOneNextButton);
		elementDisplayed(agreeToTheTerms);
		waitUntilTheConditionThenClick(driver, agreeToTheTerms);		
		pause(3000);
		elementEnabled(stepOneNextButton);
		verifyTextOfTheWebElement(stepOneNextButton, "Next");
		clickElement(stepOneNextButton);
		pause(3000);
	}

	

}