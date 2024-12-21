package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
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
	
	// Step #1: Select Your Application
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
	
	
	// Step #2: Register Your Information
	@FindBy(id = "cms-register-information")
	WebElement stepTwoHeader;

	@FindBy(xpath = "//p[contains(text(), ' Step 2 of 3')]")
	WebElement stepTwoSubHeader;
	
	@FindBy(xpath = "(//p[contains(text(), 'All f')])[1]")
	WebElement stepTwoOtherHeader;
	
	@FindBy(xpath = "(//a[contains(text(), 'Cancel')])[2]")
	WebElement stepTwoCancel;	
	
	@FindBy(id = "step2BackButton")
	WebElement stepTwoBackButton;
	
    
	// First Name
	@FindBy(id = "cms-newuser-firstName")
	WebElement firstName;
	
	@FindBy(xpath = "//span[text()='Must be alphabetic characters.']")
	WebElement alphabeticCharactersErrorMessageUnderTheField;
	
	@FindBy(xpath = "//span[contains(text(), 'Required field.')]")
	WebElement requiredFieldErrorMessageUnderTheFirstName;
	
	@FindBy(xpath = "//a[contains(text(), 'First Name')]")
	WebElement firstNameErrorMessageOnTheTopOfThePage;
	
	
	// Middle Name
	@FindBy(id = "cms-newuser-middleName")
	WebElement middleName;
	

	// Last Name
	@FindBy(id = "cms-newuser-lastName")
	WebElement lastName;
	
	@FindBy(xpath = "//span[contains(text(), 'Required field.')]")
	WebElement requiredFieldErrorMessageUnderLastName;
	
	@FindBy(xpath = "//a[contains(text(), 'Last Name')]")
	WebElement lastNameErrorMessageOnTheTopOfThePage;

	
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
	WebElement birthMonthErrorMessageOnTheTopOfThePage;
	
	@FindBy(xpath = "//select[@id='cms-newuser-birthMonth']/option")
	List<WebElement> birthMonthList;

	@FindBy(id = "cms-newuser-birthDate")
	WebElement birthDate;
	
	@FindBy(xpath = "//span[contains(text(), 'Required field.')]")
	WebElement requiredFieldErrorMessageUnderBirthDate;
	
	@FindBy(xpath = "//a[contains(text(), 'Birth Date')]")
	WebElement birthDateErrorMessageOnTheTopOfThePage;
	
	@FindBy(xpath = "//select[@id='cms-newuser-birthDate']/option")
	List<WebElement> birthDateList;

	@FindBy(id = "cms-newuser-birthYear")
	WebElement birthYear;
	
	@FindBy(xpath = "//span[contains(text(), 'Required field.')]")
	WebElement requiredFieldErrorMessageUnderBirthYear;
	
	@FindBy(xpath = "//a[contains(text(), 'Birth Year')]")
	WebElement birthYearErrorMessageOnTheTopOfThePage;
	
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
	WebElement homeAddressLine1ErrorMessageOnTheTopOfThePage;
	
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
	WebElement cityErrorMessageOnTheTopOfThePage;

	// State
	@FindBy(id = "cms-newuser-usState")
	WebElement state;
	
	@FindBy(xpath = "//span[contains(text(), 'Required field.')]")
	WebElement requiredFieldErrorMessageUnderState;
	
	@FindBy(xpath = "//a[contains(text(), 'State')]")
	WebElement stateErrorMessageOnTheTopOfThePage;
	
	@FindBy(xpath = "//select[@id='cms-newuser-usState']/option")
	List<WebElement> stateList;

	// Zip Code
	@FindBy(name = "cms-newuser-zipcode")
	WebElement zipCode;
	
	@FindBy(xpath = "//span[contains(text(), 'Required field.')]")
	WebElement requiredFieldErrorMessageUnderZipCode;
	
	@FindBy(xpath = "//a[contains(text(), 'Zip Code')]")
	WebElement zipCodeMessageOnTheTopOfThePage;

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
	WebElement emailAddressMessageOnTheTopOfThePage;

	@FindBy(id = "cms-newuser-usConfirmEmail")
	WebElement confirmEmail;
	
	@FindBy(xpath = "//span[contains(text(), 'Required field.')]")
	WebElement requiredFieldErrorMessageUnderConfirmEmail;
	
	@FindBy(xpath = "//a[contains(text(), 'Confirm Email Address')]")
	WebElement confirmEmailAddressMessageOnTheTopOfThePage;

	@FindBy(xpath = "//span[text()='Must match Email Address values.']")
	WebElement mismatchEmailAddressErrorMessageUnderTheField;

	@FindBy(id = "cms-newuser-usPhoneNumber")
	WebElement phoneNumber;
	
	@FindBy(xpath = "//span[contains(text(), 'Required field.')]")
	WebElement requiredFieldErrorMessageUnderPhoneNumber;
	
	@FindBy(xpath = "//a[contains(text(), 'Phone Number')]")
	WebElement phoneNumberMessageOnTheTopOfThePage;

	@FindBy(xpath = "//span[text()='Phone Number must not start with a 1 or 0.']")
	WebElement phoneNumberNotStartWithErrorMessageUnderTheField;

	@FindBy(xpath = "//span[text()='Must be a valid Phone Number.']")
	WebElement validPhoneNumberErrorMessageUnderTheField;

	@FindBy(id = "step2NextButton")
	WebElement nextButtonStep2;
	
	
	// Step #3: Create User ID, Password & Security Question/Answer
	@FindBy(id = "cms-create-id-password")
	WebElement stepThreeHeader;

	@FindBy(xpath = "//p[contains(text(), 'Step 3')]")
	WebElement stepThreeSubHeader;
	
	@FindBy(xpath = "(//p[contains(text(), 'All')])[2]")
	WebElement stepThreeOtherHeader;
	
	@FindBy(xpath = "(//a[contains(text(), 'Cancel')])[3]")
	WebElement stepThreeCancel;	
	
	@FindBy(id = "step3buttonBack")
	WebElement stepThreeBackButton;
	
	@FindBy(id = "step3btnNxt")
	WebElement stepThreeNextButton;
	
	// User Id
	@FindBy(id = "cms-newuser-newuserId")
	WebElement userId;
	
	@FindBy(xpath = "//span[contains(text(), 'Required field.')]")
	WebElement requiredFieldErrorMessageUnderTheUserId;
	
	@FindBy(xpath = "//a[contains(text(), 'User ID')]")
	WebElement userIdErrorMessageOnTheTopOfThePage;
	
	@FindBy(xpath = "//span[contains(text(), ' Please refer to User ID requirements.')]")
	WebElement referToRequirementErrorMessageUnderTheUserIdField;
		
	// Password	
	@FindBy(id = "cms-newuser-password")
	WebElement password;
	
	@FindBy(xpath = "//span[contains(text(), 'Required field.')]")
	WebElement requiredFieldErrorMessageUnderThePassword;
	
	@FindBy(xpath = "//a[contains(text(), 'Password')]")
	WebElement passwordErrorMessageOnTheTopOfThePage;
	
	// Confirm Password
	@FindBy(id = "cms-newuser-confirmPassword")
	WebElement confirmNewPassword;
	
	@FindBy(xpath = "//span[contains(text(), 'Required field.')]")
	WebElement requiredFieldErrorMessageUnderTheConfirmNewPassword;
	
	@FindBy(xpath = "//a[contains(text(), 'Confirm New Password')]")
	WebElement confirmNewPasswordErrorMessageOnTheTopOfThePage;
	
	// Security Question
	@FindBy(id = "cms-newuser-securityQuestion")
	WebElement securityQuestion;
	
	@FindBy(xpath = "//select[@id='cms-newuser-securityQuestion']/option")
	List<WebElement> securityQuestionList;
	
	@FindBy(xpath = "//span[contains(text(), 'Required field.')]")
	WebElement requiredFieldErrorMessageUnderTheSecurityQuestion;
	
	@FindBy(xpath = "//a[contains(text(), 'Security Question')]")
	WebElement securityQuestionErrorMessageOnTheTopOfThePage;
	
	// Security Answer
	@FindBy(id = "cms-newuser-securityAnswer")
	WebElement securityAnswer;
	
	@FindBy(xpath = "//span[text() = ' Required field.']")
	WebElement requiredFieldErrorMessageUnderTheSecurityAnswer;
	
	@FindBy(xpath = "//a[contains(text(), 'Security Answer')]")
	WebElement securityAnswerErrorMessageOnTheTopOfThePage;
		
	// New User Registration Summary
	@FindBy(xpath = "//h1[text()='New User Registration Summary']")
	WebElement summaryPageHeader;

	@FindBy(xpath = "//p[text()=' Please review your information and make any necessary changes before submitting . ']")
	WebElement summaryPageSubHeader;
	
	@FindBy(xpath = "(//a[contains(text(), 'Cancel')])[4]")
	WebElement summaryPageCancel;	
	
	@FindBy(id = "submitUser")
	WebElement submitUser;
	
	@FindBy(xpath = "//span[contains(text(), 'An email has been sent')]")
	WebElement successMessage;
	
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

	public void step_two_title_and_header () {
		verifyTitle(driver, "CMS Enterprise Portal - New User Registration");
		verifyCurrentUrl(driver, "https://portal.cms.gov/portal/newuserregistration");
		validationOfHeader(stepTwoHeader, "Step #2: Register Your Information");
		validationOfSubHeader(stepTwoSubHeader, "Step 2 of 3 - Please enter your personal and contact information.");
		validationOfOtherHeader(stepTwoOtherHeader, "All fields are required unless marked (optional).");
		pause(4000);
	}
	
	public void click_on_back_button_on_step_two_direct_to_step_one() {
		scrollIntoViewTheElementUsingJavascriptExecutor(driver, stepTwoBackButton);
		elementEnabled(stepTwoBackButton);
		verifyTextOfTheWebElement(stepTwoBackButton, "Back");
		pause(4000);
		clickElement(stepTwoBackButton);
		pause(4000);
		verifyCurrentUrl(driver, "https://portal.cms.gov/portal/newuserregistration");
		verifyTitle(driver, "CMS Enterprise Portal - New User Registration");
		validationOfHeader(stepOneHeader, "Step #1: Select Your Application");
		validationOfSubHeader(stepOneSubHeader, "Step 1 of 3 - Select your application from the dropdown. You will then need to agree to the terms & conditions.");
		pause(4000);
	}
	
	public void click_on_cancel_button_on_step_two_direct_to_homepage() {
		scrollIntoViewTheElementUsingJavascriptExecutor(driver, stepTwoCancel);
		elementEnabled(stepTwoCancel);
		verifyTextOfTheWebElement(stepTwoCancel, "Cancel");
		pause(4000);
		clickElement(stepTwoCancel);
		pause(4000);
		verifyCurrentUrl(driver, "https://portal.cms.gov/portal/");
		verifyTitle(driver, "CMS Enterprise Portal");
		pause(4000);
	}
	
	public void click_on_next_button_of_step_two() {
		scrollIntoViewTheElementUsingJavascriptExecutor(driver, nextButtonStep2);
		elementEnabled(nextButtonStep2);
		verifyTextOfTheWebElement(nextButtonStep2, "Next");
		pause(3000);
		clickElement(nextButtonStep2);
		pause(3000);
	}
	
	public void error_message_under_and_top_of_the_page_on_step_two() {
		verifyErrorMessageOnTheTopOfThePage(firstNameErrorMessageOnTheTopOfThePage, Attribute.INNER_HTML, "First Name is a required field.");
		verifyErrorMessageOnTheTopOfThePage(lastNameErrorMessageOnTheTopOfThePage, Attribute.INNER_HTML, "Last Name is a required field.");
		verifyErrorMessageOnTheTopOfThePage(birthMonthErrorMessageOnTheTopOfThePage, Attribute.INNER_HTML, "Birth Month is a required field.");
		verifyErrorMessageOnTheTopOfThePage(birthDateErrorMessageOnTheTopOfThePage, Attribute.INNER_HTML, "Birth Date is a required field.");
		verifyErrorMessageOnTheTopOfThePage(birthYearErrorMessageOnTheTopOfThePage, Attribute.INNER_HTML, "Birth Year is a required field.");
		verifyErrorMessageOnTheTopOfThePage(homeAddressLine1ErrorMessageOnTheTopOfThePage, Attribute.INNER_HTML, "Home Address Line1 is a required field.");
		verifyErrorMessageOnTheTopOfThePage(cityErrorMessageOnTheTopOfThePage, Attribute.INNER_HTML, "City is a required field.");
		verifyErrorMessageOnTheTopOfThePage(stateErrorMessageOnTheTopOfThePage, Attribute.INNER_HTML, "State is a required field.");
		verifyErrorMessageOnTheTopOfThePage(zipCodeMessageOnTheTopOfThePage, Attribute.INNER_HTML, "Zip Code is a required field.");
		verifyErrorMessageOnTheTopOfThePage(emailAddressMessageOnTheTopOfThePage, Attribute.INNER_HTML, "Email Address is a required field.");
		verifyErrorMessageOnTheTopOfThePage(confirmEmailAddressMessageOnTheTopOfThePage, Attribute.INNER_HTML, "Confirm Email Address is a required field.");
		verifyErrorMessageOnTheTopOfThePage(phoneNumberMessageOnTheTopOfThePage, Attribute.INNER_HTML, "Phone Number is a required field.");
		pause(5000);
		verifyErrorMessageUnderTheField(requiredFieldErrorMessageUnderTheFirstName, Attribute.INNER_HTML, "Required field.");
		verifyErrorMessageUnderTheField(requiredFieldErrorMessageUnderLastName, Attribute.INNER_HTML, "Required field.");
		verifyErrorMessageUnderTheField(requiredFieldErrorMessageUnderBirthMonth, Attribute.INNER_HTML, "Required field.");
		verifyErrorMessageUnderTheField(requiredFieldErrorMessageUnderBirthDate, Attribute.INNER_HTML, "Required field.");
		verifyErrorMessageUnderTheField(requiredFieldErrorMessageUnderBirthYear, Attribute.INNER_HTML, "Required field.");
		verifyErrorMessageUnderTheField(requiredFieldErrorMessageUnderHomeAddressLine1, Attribute.INNER_HTML, "Required field.");
		verifyErrorMessageUnderTheField(requiredFieldErrorMessageUnderCity, Attribute.INNER_HTML, "Required field.");
		verifyErrorMessageUnderTheField(requiredFieldErrorMessageUnderState, Attribute.INNER_HTML, "Required field.");
		verifyErrorMessageUnderTheField(requiredFieldErrorMessageUnderZipCode, Attribute.INNER_HTML, "Required field.");
		verifyErrorMessageUnderTheField(requiredFieldErrorMessageUnderEmail, Attribute.INNER_HTML, "Required field.");
		verifyErrorMessageUnderTheField(requiredFieldErrorMessageUnderConfirmEmail, Attribute.INNER_HTML, "Required field.");
		verifyErrorMessageUnderTheField(requiredFieldErrorMessageUnderPhoneNumber, Attribute.INNER_HTML, "Required field.");
		pause(3000);
	}
	
	public void first_name () {
		verifyLengthOfTheFieldContent(firstName, Attribute.MAX_LENGTH, "20");
		inputTextThenClickTab(firstName, "%*&$^%*^*");
		verifyErrorMessageUnderTheField(alphabeticCharactersErrorMessageUnderTheField, Attribute.INNER_HTML, "Must be alphabetic characters.");
		pause(3000);
		clearTextFromTheField(firstName);
		verifyErrorMessageUnderTheField(requiredFieldErrorMessageUnderTheFirstName, Attribute.INNER_HTML, "Required field.");
		pause(3000);
		inputText(firstName, "47858634"); // input text then click tab is not necessary here
		verifyErrorMessageUnderTheField(alphabeticCharactersErrorMessageUnderTheField, Attribute.INNER_HTML, "Must be alphabetic characters.");
		pause(3000);
		clearTextFromTheField(firstName);
		pause(3000);
		inputTextThenClickTab(firstName, "Mo ham-ma'd Mohammad"); // input text then click tab is not necessary here
		pause(3000);
	}
	
	public void middle_name () {
		verifyLengthOfTheFieldContent(middleName, Attribute.MAX_LENGTH, "20");
		inputTextThenClickTab(middleName, "% & \\\" ( )");
		verifyErrorMessageUnderTheField(alphabeticCharactersErrorMessageUnderTheField, Attribute.INNER_HTML, "Must be alphabetic characters.");
		pause(3000);
		clearTextFromTheField(middleName);
		pause(3000);
		inputText(middleName, "6573684765");
		verifyErrorMessageUnderTheField(alphabeticCharactersErrorMessageUnderTheField, Attribute.INNER_HTML, "Must be alphabetic characters.");
		pause(3000);
		clearTextFromTheField(middleName);
		pause(3000);
		inputTextThenClickTab(middleName, "To'fael Ka-bi rrr'-r");
		pause(3000);
		clearTextFromTheField(middleName);
		pause(3000);
		inputTextThenClickTab(middleName, "");
		pause(3000);
	}
	
	public void last_name () {
		verifyLengthOfTheFieldContent(lastName, Attribute.MAX_LENGTH, "25");
		inputTextThenClickTab(lastName, "% & \\\" ( )");
		verifyErrorMessageUnderTheField(alphabeticCharactersErrorMessageUnderTheField, Attribute.INNER_HTML, "Must be alphabetic characters.");
		pause(3000);
		clearTextFromTheField(lastName);
		verifyErrorMessageUnderTheField(requiredFieldErrorMessageUnderLastName, Attribute.INNER_HTML, "Required field.");
		pause(3000);
		inputText(lastName, "6573684765");
		verifyErrorMessageUnderTheField(alphabeticCharactersErrorMessageUnderTheField, Attribute.INNER_HTML, "Must be alphabetic characters.");
		pause(3000);
		clearTextFromTheField(lastName);
		pause(3000);
		inputTextThenClickTab(lastName, "S'- harkarr Sh''a--rka rr");
		pause(3000);
	}
	
	public void suffix () {
		selectElelementFromDropdownOnebyOne(suffix, suffixList);
		pause(3000);
		selectDropdown(suffix, "SR");
		pause(3000);
	}
	
	public void birth_month () {	
		selectElelementFromDropdownOnebyOne(birthMonth, birthMonthList);
		pause(3000);
		selectDropdown(birthMonth, "Select Birth Month");
		pause(3000);
		verifyErrorMessageUnderTheField(requiredFieldErrorMessageUnderBirthMonth, Attribute.INNER_HTML, " Required field.");
		pause(3000);
		verifyErrorMessageOnTheTopOfThePage(birthMonthErrorMessageOnTheTopOfThePage, Attribute.INNER_HTML, "Birth Month is a required field.");
		pause(3000);
		selectDropdown(birthMonth, "February");
		pause(3000);					
	}
	
	public void birth_year () {	
		selectElelementFromDropdownOnebyOne(birthYear, birthYearList);
		pause(3000);
		selectDropdown(birthYear, "Select Birth Year");
		pause(3000);
		verifyErrorMessageUnderTheField(requiredFieldErrorMessageUnderBirthYear, Attribute.INNER_HTML, "Required field.");
		pause(3000);
		verifyErrorMessageOnTheTopOfThePage(birthYearErrorMessageOnTheTopOfThePage, Attribute.INNER_HTML, "Birth Year is a required field.");
		pause(3000);
		selectDropdown(birthYear, "1996");
		pause(3000);		
	}
	
	public void birth_date () {	
		selectElelementFromDropdownOnebyOne(birthDate, birthDateList);
		pause(3000);
		selectDropdown(birthDate, "Select Birth Date");
		pause(3000);		
		verifyErrorMessageUnderTheField(requiredFieldErrorMessageUnderBirthDate, Attribute.INNER_HTML, " Required field.");
		pause(3000);
		verifyErrorMessageOnTheTopOfThePage(birthDateErrorMessageOnTheTopOfThePage, Attribute.INNER_HTML, "Birth Date is a required field.");
		pause(3000);
		selectDropdown(birthDate, "29");
		pause(3000);		
	}
	
	public void address_line1 () {
		clickElement(nonUsBasedAddress);
		pause(3000);
		clickElement(usBasedAddress);
		// start of addressLine 1 validation
		verifyLengthOfTheFieldContent(addressLine1, Attribute.MAX_LENGTH, "60");
		inputTextThenClickTab(addressLine1, " * < > ^ ! # $ + / : ; = ? @ [ ] ");
		verifyErrorMessageUnderTheField(alphanumericCharactersErrorMessageUnderTheField, Attribute.INNER_HTML, "Must be alphanumeric characters.");
		pause(3000); // is not used in the industry, this is used when you scripting the test cases,
		// we will comment out all and run, if failed, then we will use web driver wait
		clearTextFromTheField(addressLine1);
		pause(3000);
		verifyErrorMessageUnderTheField(requiredFieldErrorMessageUnderHomeAddressLine1, Attribute.INNER_HTML, "Required field.");
		pause(3000);
		inputText(addressLine1, "6.1E 97th-s S_t, 66"); // **NOTE: Special characters allowed are: (Space) ' ‐ , . _
		pause(3000);
	}
	
	public void address_line2 () {
		verifyLengthOfTheFieldContent(addressLine2, Attribute.MAX_LENGTH, "64");
		inputTextThenClickTab(addressLine2, " * < > ^ ! # $ + / : ; = ? @ [ ] ");
		verifyErrorMessageUnderTheField(alphanumericCharactersErrorMessageUnderTheField, Attribute.INNER_HTML, "Must be alphanumeric characters.");
		pause(3000); 
		clearTextFromTheField(addressLine2);
		pause(3000);
		inputText(addressLine2, "A.pt 123123 E 1009th-s S_t, 66");
		pause(3000);
	}
	
	public void city () {
		verifyLengthOfTheFieldContent(city, Attribute.MAX_LENGTH, "30");
		pause(3000);
		inputTextThenClickTab(city, " > ^ ! # $ + / : ; = ? @");		
		verifyErrorMessageUnderTheField(alphabeticCharactersErrorMessageUnderTheField, Attribute.INNER_HTML, "Must be alphabetic characters.");
		pause(3000);
		clearTextFromTheField(city);
		pause(3000);
		verifyErrorMessageUnderTheField(requiredFieldErrorMessageUnderCity, Attribute.INNER_HTML, "Required field.");
		pause(3000);
		inputTextThenClickTab(city, "64783city");
		pause(3000);
		verifyErrorMessageUnderTheField(alphabeticCharactersErrorMessageUnderTheField, Attribute.INNER_HTML, "Must be alphabetic characters.");
		pause(3000);
		clearTextFromTheField(city);
		inputText(city, "Lindström");  // Real time bug of the Application
		// another example: Winston-Salem, Clark's Mountain
		// Arnesén and Lindström: Both cities in Minnesota have diacritics
		pause(3000);
	}
	
	public void state () {
		selectDropdown(state, "New York"); // function is not same as Birth Month
		pause(3000);
		selectDropdown(state, "Select State");
		pause(3000);
		clickElementThenTab(state); // This common action is used only here
		pause(3000);
		verifyErrorMessageUnderTheField(requiredFieldErrorMessageUnderState, Attribute.INNER_HTML, " Required field.");
		pause(3000);
		selectElelementFromDropdownOnebyOne(state, stateList);
		pause(3000);
		selectDropdown(state, "New York");
		pause(3000);
	}
	
	public void zip_code () {
		verifyLengthOfTheFieldContent(zipCode, Attribute.MAX_LENGTH, "5");	
		inputTextThenClickTab(zipCode, "1002");
		pause(3000);
		verifyErrorMessageUnderTheField(numericZipCodeErrorMessageUnderTheField, Attribute.INNER_HTML, "Must be a valid numeric ZIP Code.");
		clearTextFromTheField(zipCode);
		pause(3000);
		verifyErrorMessageUnderTheField(requiredFieldErrorMessageUnderZipCode, Attribute.INNER_HTML, "Required field.");
		pause(3000);
		inputTextThenClickTab(zipCode, " > ^ ! # $ + / : ; = ? @");
		verifyErrorMessageUnderTheField(numericZipCodeErrorMessageUnderTheField, Attribute.INNER_HTML, "Must be a valid numeric ZIP Code.");
		pause(3000);
		clearTextFromTheField(zipCode);
		inputText(zipCode, "AaBcR");
		verifyErrorMessageUnderTheField(numericZipCodeErrorMessageUnderTheField, Attribute.INNER_HTML, "Must be a valid numeric ZIP Code.");
		pause(3000);
		clearTextFromTheField(zipCode);
		inputText(zipCode, "10019");
		pause(3000);
	}
	
	public void zip_code_plus4 () {
		verifyLengthOfTheFieldContent(zipCodeExt, Attribute.MAX_LENGTH, "4");
		inputTextThenClickTab(zipCodeExt, "100");
		verifyErrorMessageUnderTheField(numericZipPlus4CodeErrorMessageUnderTheField, Attribute.INNER_HTML, "Must be a valid numeric ZIP+4 Code.");		
		clearTextFromTheField(zipCodeExt);
		pause(3000);
		inputTextThenClickTab(zipCodeExt, " > ^ ! # $ + / : ; = ? @");
		verifyErrorMessageUnderTheField(numericZipPlus4CodeErrorMessageUnderTheField, Attribute.INNER_HTML, "Must be a valid numeric ZIP+4 Code.");
		pause(3000);
		clearTextFromTheField(zipCodeExt);
		inputText(zipCodeExt, "AdBc");
		verifyErrorMessageUnderTheField(numericZipPlus4CodeErrorMessageUnderTheField, Attribute.INNER_HTML, "Must be a valid numeric ZIP+4 Code.");
		pause(3000);
		clearTextFromTheField(zipCodeExt);
		inputText(zipCodeExt, "1001");
		pause(3000);
	}
	
	public void email () {
		verifyLengthOfTheFieldContent(email, Attribute.MAX_LENGTH, "74");
		inputTextThenClickTab(email, "^%&^%^%&");
//		pause(3000);
//		verifyErrorMessageUnderTheField(email, "Must be a valid Email Address.");		// actual error message is not received
		pause(3000);
		clearTextFromTheField(email);
		pause(3000);
		verifyErrorMessageUnderTheField(requiredFieldErrorMessageUnderEmail, Attribute.INNER_HTML, "Required field.");
		pause(3000);
//		inputText(email, "12345");
//		verifyErrorMessageUnderTheField(email, "Must be a valid Email Address.");
//		pause(3000);
//		clearTextFromTheField(email);
		inputText(email, "tofael483@gmail.com");
		pause(3000);
		// Need to find out the requirements for email configuration
	}
	
	public void confirm_email () {
		verifyLengthOfTheFieldContent(confirmEmail, Attribute.MAX_LENGTH, "74");
		inputTextThenClickTab(confirmEmail, "amtks483@gmail.com");
		pause(3000);
		verifyErrorMessageUnderTheField(mismatchEmailAddressErrorMessageUnderTheField, Attribute.INNER_HTML, "Must match Email Address values.");
		pause(3000);
		clearTextFromTheField(confirmEmail);
		pause(3000);
		verifyErrorMessageUnderTheField(requiredFieldErrorMessageUnderConfirmEmail, Attribute.INNER_HTML, "Required field.");
		pause(3000);		
		inputText(confirmEmail, "tofael483@gmail.com");
		pause(3000);
	}
	
	public void phone_number () {
		verifyLengthOfTheFieldContent(phoneNumber, Attribute.MAX_LENGTH, "12");
		inputText(phoneNumber, "0929301602");
		verifyErrorMessageUnderTheField(phoneNumberNotStartWithErrorMessageUnderTheField, Attribute.INNER_HTML, "Phone Number must not start with a 1 or 0.");
		pause(3000);
		clearTextFromTheField(phoneNumber);
		pause(3000);
		verifyErrorMessageUnderTheField(requiredFieldErrorMessageUnderPhoneNumber, Attribute.INNER_HTML, "Required field.");
		pause(3000);
		inputText(phoneNumber, "1929301602");
		verifyErrorMessageUnderTheField(phoneNumberNotStartWithErrorMessageUnderTheField, Attribute.INNER_HTML, "Phone Number must not start with a 1 or 0.");
		pause(3000);
		clearTextFromTheField(phoneNumber);
		pause(3000);
		inputText(phoneNumber, "(3)*<>^9!#$+ ");
		pause(3000);
		verifyErrorMessageUnderTheField(validPhoneNumberErrorMessageUnderTheField, Attribute.INNER_HTML, "Must be a valid Phone Number.");
		pause(3000);
		clearTextFromTheField(phoneNumber);
		pause(3000);
		inputText(phoneNumber, "ahsuchbs");
		pause(3000);
		verifyErrorMessageUnderTheField(validPhoneNumberErrorMessageUnderTheField, Attribute.INNER_HTML, "Must be a valid Phone Number.");
		pause(3000);
		clearTextFromTheField(phoneNumber);
		pause(3000);
		inputText(phoneNumber, "9293016028");
		pause(3000);
	}
	
	public void happy_path_step_two() {
		pause(3000);
		inputText(firstName, "Moha'mm-ad Md");
		pause(3000);
		inputText(middleName, "To'fael Ka-bir");
		pause(3000);
		inputText(lastName, "S'- harkar");
		pause(3000);
		selectDropdown(suffix, "SR");
		pause(3000);
		selectDropdown(birthMonth, "February");
		pause(3000);
		selectDropdown(birthDate, "28");
		pause(3000);
		selectDropdown(birthYear, "1975");
		pause(3000);
		scrollIntoViewTheElementUsingJavascriptExecutor(driver, nextButtonStep2);
		inputText(addressLine1, "6.1E 97th-s S_t, 66");
		pause(3000);
		inputText(addressLine2, "A.pt 123123 E 1009th-s S_t, 66");
		pause(3000);
		inputText(city, "Clark's Mountain"); // another example: Winston-Salem
		pause(3000);
		selectDropdown(state, "New York");
		pause(3000);
		inputText(zipCode, "10019");
		pause(3000);
		inputText(zipCodeExt, "1001");
		pause(3000);
		inputText(email, "tofael483@gmail.com");
		pause(3000);
		inputText(confirmEmail, "tofael483@gmail.com");
		pause(3000);
		inputText(phoneNumber, "9293016028");
		pause(3000);		
	}
	
	public void step_three_title_and_header () {
		verifyTitle(driver, "CMS Enterprise Portal - New User Registration");
		verifyCurrentUrl(driver, "https://portal.cms.gov/portal/newuserregistration");
		pause(3000);
		validationOfHeader(stepThreeHeader, "Step #3: Create User ID, Password & Security Question/Answer");
		validationOfSubHeader(stepThreeSubHeader, "Step 3 of 3 - Please create User ID and Password. Select a Security Question and provide Answer.");
		validationOfOtherHeader(stepThreeOtherHeader, "All fields are required unless marked (optional).");
		pause(3000);
	}
	
	public void click_on_back_button_on_step_three_direct_to_step_two() {
		elementEnabled(stepThreeBackButton);
		verifyTextOfTheWebElement(stepThreeBackButton, "Back");
		pause(4000);
		clickElement(stepThreeBackButton);
		pause(4000);
		verifyCurrentUrl(driver, "https://portal.cms.gov/portal/newuserregistration");
		verifyTitle(driver, "CMS Enterprise Portal - New User Registration");
		validationOfHeader(stepTwoHeader, "Step #2: Register Your Information");
		validationOfSubHeader(stepTwoSubHeader, "Step 2 of 3 - Please enter your personal and contact information.");
		validationOfOtherHeader(stepTwoOtherHeader, "All fields are required unless marked (optional).");
		pause(4000);
	}
	
	public void click_on_cancel_button_on_step_three_direct_to_homepage() {
		elementEnabled(stepThreeCancel);
		verifyTextOfTheWebElement(stepThreeCancel, "Cancel");
		pause(4000);
		clickElement(stepThreeCancel);
		pause(4000);
		verifyCurrentUrl(driver, "https://portal.cms.gov/portal/");
		verifyTitle(driver, "CMS Enterprise Portal");
		pause(4000);
	}
	
	public void click_on_next_button_of_step_three() {
		elementEnabled(stepThreeNextButton);
		verifyTextOfTheWebElement(stepThreeNextButton, "Next");
		pause(3000);
		clickElement(stepThreeNextButton);
		pause(3000);
	}
	
	public void error_message_under_and_top_of_the_page_on_step_three() {
		verifyErrorMessageOnTheTopOfThePage(userIdErrorMessageOnTheTopOfThePage, Attribute.INNER_HTML, "User ID is a required field.");
		verifyErrorMessageOnTheTopOfThePage(passwordErrorMessageOnTheTopOfThePage, Attribute.INNER_HTML, "Password is a required field.");
		verifyErrorMessageOnTheTopOfThePage(confirmNewPasswordErrorMessageOnTheTopOfThePage, Attribute.INNER_HTML, "Confirm New Password is a required field.");
		verifyErrorMessageOnTheTopOfThePage(securityQuestionErrorMessageOnTheTopOfThePage, Attribute.INNER_HTML, "Security Question is a required field.");
		verifyErrorMessageOnTheTopOfThePage(securityAnswerErrorMessageOnTheTopOfThePage, Attribute.INNER_HTML, "Security Answer is a required field.");		
		pause(5000);		
		verifyErrorMessageUnderTheField(requiredFieldErrorMessageUnderTheUserId, Attribute.INNER_HTML, "Required field.");
		verifyErrorMessageUnderTheField(requiredFieldErrorMessageUnderThePassword, Attribute.INNER_HTML, "Required field.");
		verifyErrorMessageUnderTheField(requiredFieldErrorMessageUnderTheConfirmNewPassword, Attribute.INNER_HTML, "Required field.");
		verifyErrorMessageUnderTheField(requiredFieldErrorMessageUnderTheSecurityQuestion, Attribute.INNER_HTML, "Required field.");
		verifyErrorMessageUnderTheField(requiredFieldErrorMessageUnderTheSecurityAnswer, Attribute.INNER_HTML, " Required field."); // change here
		pause(3000);
	}
	
	public void userId () {
		verifyLengthOfTheFieldContent(userId, Attribute.MAX_LENGTH, "74");
		/*
		 We have create user id, by 5, 74 characters, without letter, user any email, 
		    - Cannot contain 9 consecutive numbers.
			- Cannot begin or end with special characters.
			- Cannot contain more than 1 consecutive special character.
		 */
		inputTextThenClickTab(userId, "&^%*&#^$%");
		pause(3000);
		verifyErrorMessageUnderTheField(referToRequirementErrorMessageUnderTheUserIdField, Attribute.INNER_HTML, "Please refer to User ID requirements.");
		pause(3000);
		clearTextFromTheField(userId);
		pause(3000);
		verifyErrorMessageUnderTheField(requiredFieldErrorMessageUnderTheUserId, Attribute.INNER_HTML, "Required field.");
		pause(3000);		
		inputText(userId, "Enthrall_20221");
		pause(3000);
	}
	
	public void password () {
		// need validation based on requirements
	}
	
	public void confirmNewPassword () {
		// need validation based on requirements
	}
	
	public void securityQuestion () {
		selectElelementFromDropdownOnebyOne(securityQuestion, securityQuestionList);
		pause(3000);
		selectDropdown(securityQuestion, "What was the first thing you learned to cook?");
		pause(3000);
	}
	
	public void securityAnswer () {
		// need validation based on requirements
	}
	
	public void happy_path_step_three() {
		inputTextThenClickTab(userId, "Enthrall_20221");
		pause(3000);
		inputTextThenClickTab(password, "EIT@2024eit@2024");
		pause(3000);
		inputTextThenClickTab(confirmNewPassword, "EIT@2024eit@2024");
		pause(3000);
		selectDropdown(securityQuestion, "What was the first thing you learned to cook?");
		pause(3000);
		inputText(securityAnswer, "Rice");
		pause(3000);		
	}
	
	public void summary_page_title_and_header () {
		verifyTitle(driver, "CMS Enterprise Portal - New User Registration");
		verifyCurrentUrl(driver, "https://portal.cms.gov/portal/newuserregistration");
		pause(3000);
		validationOfHeader(summaryPageHeader, "New User Registration Summary");
		validationOfSubHeader(summaryPageSubHeader, "Please review your information and make any necessary changes before submitting .");
		pause(3000);
	}
	
	public void click_on_cancel_button_on_summary_page_direct_to_homepage() {
		elementEnabled(summaryPageCancel);
		verifyTextOfTheWebElement(summaryPageCancel, "Cancel");
		pause(4000);
		clickElement(summaryPageCancel);
		pause(4000);
		verifyCurrentUrl(driver, "https://portal.cms.gov/portal/");
		verifyTitle(driver, "CMS Enterprise Portal");
		pause(4000);
	}
	
	public void click_on_submit_user_button_of_summary_page() {
		scrollIntoViewTheElementUsingJavascriptExecutor(driver, summaryPageCancel);
		elementEnabled(submitUser);
		verifyTextOfTheWebElement(submitUser, "Submit User");
		pause(3000);
		clickElement(submitUser);
		pause(3000);
	}
	
	public void success_message () {
		verifyTitle(driver, "CMS Enterprise Portal - New User Registration");
		verifyCurrentUrl(driver, "https://portal.cms.gov/portal/newuserregistration");
		pause(3000);
		verifyTextOfTheWebElement(successMessage, "Your User ID has been successfully registered with CMS Enterprise Portal. An email has been sent to your registered email address.");
		pause(3000);
	}
	
	
	
	

}