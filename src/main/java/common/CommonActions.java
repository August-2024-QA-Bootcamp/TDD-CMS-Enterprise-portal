package common;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.google.common.io.Files;

import constants.Attribute;
import reports.Loggers;

public class CommonActions {
	
	WebDriver driver;
	
	// common method for click ()
	public static void clickElement(WebElement element) {
		try {
			element.click();
			Loggers.logTheTest(element + "<--------> has been clicked");
		} catch (NoSuchElementException | NullPointerException e) {
			Loggers.logTheTest(element + "<----------> has not been found\n" + e.getMessage()); 
			// e.getMessage() and e.printStackTrace() give similar outcome
		}		
	}
	
	// common method for sleep()
	public static void pause(long millis) {
		try {
			Thread.sleep(millis);
			Loggers.logTheTest("Sleeping ... zZz " + millis);
		} catch (InterruptedException e) {
			Loggers.logTheTest("Sleep interrupted because of ... " + e.getMessage());
		}		
	}
	
	// common method for sendKeys()
	public static void inputText(WebElement element, String input) {
		try {
			element.sendKeys(input);
			Loggers.logTheTest(input + " <-----> has been put into <-----> " + element);
		} catch (NoSuchElementException | NullPointerException e) {
			Loggers.logTheTest(element + "<----------> has not been found becuase of ...\n" + e.getMessage() );
		}		
	}
	
	public static void elementDisplayed(WebElement element) {
		try {
			boolean flag = element.isDisplayed();
			Loggers.logTheTest(element + "<---------> is Displayed, " + flag);
		} catch (NoSuchElementException | NullPointerException e) {
			Loggers.logTheTest(element + "<----------> is not Displayed\n" + e.getMessage() );
		}		
	}
	
	public static void elementEnabled(WebElement element) {
		try {
			boolean flag = element.isEnabled();
			Loggers.logTheTest(element + "<---------> is Enabled, " + flag);
		} catch (NoSuchElementException | NullPointerException e) {
			Loggers.logTheTest(element + "<----------> is not Displayed\n" + e.getMessage() );
		}
	}
	
	public static void elementSelected (WebElement element){
		try {
			boolean flag = element.isSelected();
			Loggers.logTheTest(element + "<---------> is Selected, " + flag);
		} catch (NoSuchElementException | NullPointerException e) {
			Loggers.logTheTest(element + "<----------> is not Displayed\n" + e.getMessage() );
		}
	}
	
	public static void verifyTitle(WebDriver driver, String expectedTitle) {
		try {
			String actualTitle = driver.getTitle();
			Loggers.logTheTest("Actual Title is : " + actualTitle + " ---> And Expected Title is :" + expectedTitle);
			Assert.assertEquals(actualTitle, expectedTitle, "Title doesn't match up");
		} catch (NullPointerException e) {
			Loggers.logTheTest("Driver is not initiated properly Or Title doesn't match up");
			Assert.fail();
		}
		
	}
	
	public static void verifyCurrentUrl(WebDriver driver, String expectedURL) {
		try {
			String currentURL = driver.getCurrentUrl();
			Loggers.logTheTest("Current URL : " + currentURL + ", Expected URL : " + expectedURL);
			Assert.assertEquals(currentURL, expectedURL, "Current URL is not correct");	
		} catch (NullPointerException e) {
			Loggers.logTheTest("Driver is not initiated properly Or Current URL doesn't match");
			Assert.fail();
		}
			
	}
	
	public static void verifyTextOfTheWebElement(WebElement element, String expected) {
		try {
			String actual = element.getText();
			Loggers.logTheTest(element + " ---> Actual text : " + actual + ". Expected text : " + expected);
			Assert.assertEquals(actual, expected, "Text In the WebElement doesn't match");
		} catch (NoSuchElementException | NullPointerException e) {
			Loggers.logTheTest(element + "<----------> is not Displayed or Text doesn't match\n" + e.getMessage() );
		}
	}
	
	public static void clearTextFromTheField(WebElement element) {
		try {
			element.clear();
			Loggers.logTheTest("The Text from the " + element + " ---> is cleared");
		} catch (NoSuchElementException | NullPointerException e) {
			e.printStackTrace();
			Loggers.logTheTest(element + "<----------> has not been found\n" + e.getMessage());
			Assert.fail();
		}
	}
	
	public static void validationOfHeader(WebElement element, String expectedHeader) {
		try {
			String actualHeader = element.getText();
			Loggers.logTheTest(element + " ---> Actual Header : " + actualHeader + ". Expected Header : " + expectedHeader);
			Assert.assertEquals(actualHeader, expectedHeader, "Header doesn't match");
		} catch (NullPointerException | NoSuchElementException e) {
			e.printStackTrace();
			Loggers.logTheTest(element + " : This element Not Found");
			Assert.fail();
		}

	}
	
	public static void validationOfSubHeader(WebElement element, String expectedSubHeader) {
		try {
			String actualSubHeader = element.getText();
			Loggers.logTheTest(element + " ---> Actual SubHeader : " + actualSubHeader + ". Expected SubHeader : " + expectedSubHeader);
			Assert.assertEquals(actualSubHeader, expectedSubHeader, "SubHeader doesn't match");
		} catch (NullPointerException | NoSuchElementException e) {
			e.printStackTrace();
			Loggers.logTheTest(element + " : This element Not Found");
			Assert.fail();
		}
	
	}
	
	public static void validationOfOtherHeader(WebElement element, String expectedOtherHeader) {
		try {
			String actualOtherHeader = element.getText();
			Loggers.logTheTest(element + " ---> Actual Other Header : " + actualOtherHeader + ". Expected Other Header : "
					+ expectedOtherHeader);
			Assert.assertEquals(actualOtherHeader, expectedOtherHeader, "Other Header doesn't match");
		} catch (NullPointerException | NoSuchElementException e) {
			e.printStackTrace();
			Loggers.logTheTest(element + " : This element Not Found");
			Assert.fail();
		}

	}	
	
	
	public static void selectElelementFromDropdownOnebyOne(WebElement element, List<WebElement> elements) {
		try {
			Select select = new Select(element);
			// Why i not 0, because, 0 index show the instruction
			for(int i=1; i<elements.size(); i++) {
				Loggers.logTheTest(elements.get(i).getText() + " is selected in the dropdpwn");
				select.selectByIndex(i);
				pause(2000);
			}
			Loggers.logTheTest("Total Element: " + (elements.size() - 1) + " is present in the dropdown");
		} catch (NullPointerException | NoSuchElementException e) {
			e.printStackTrace();
			Loggers.logTheTest(element + " : This element Not Found");
			Assert.fail();
		}
	}
	
	
	// drop down by selectByVisibleText() is used as common action
	public static void selectDropdown(WebElement element, String value) {
		try {
			Select select = new Select(element);
			select.selectByVisibleText(value);
			Loggers.logTheTest(value + " has been selected from the dropdown of ---> " + element);
		} catch (NullPointerException | NoSuchElementException e) {
			e.printStackTrace();
			Loggers.logTheTest(element + " : This element Not Found");
			Assert.fail();
		}
	}
	
	public static void inputTextThenClickEnter(WebElement element, String input) {
		try {
			element.sendKeys(input, Keys.ENTER);
			Loggers.logTheTest(input + " <-----> has been put into <-----> " + element + " and then clicked by Enter Key");
		} catch (NoSuchElementException | NullPointerException e) {
			e.printStackTrace();
			Loggers.logTheTest(element + "<----------> has not been found\n" + e.getMessage() );
			Assert.fail();
		}
	}
	
	public static void inputTextThenClickReturn(WebElement element, String input) {
		try {
			element.sendKeys(input, Keys.RETURN);
			Loggers.logTheTest(input + " <-----> has been put into <-----> " + element + " and then clicked by Enter Key");
		} catch (NoSuchElementException | NullPointerException e) {
			e.printStackTrace();
			Loggers.logTheTest(element + "<----------> has not been found\n" + e.getMessage() );
			Assert.fail();
		}
	}
	
	public static void inputTextThenClickTab(WebElement element, String input) {
		try {
			element.sendKeys(input, Keys.TAB);
			Loggers.logTheTest(input + " <-----> has been put into <-----> " + element + " and then clicked by Enter Key");
		} catch (NoSuchElementException | NullPointerException e) {
			e.printStackTrace();
			Loggers.logTheTest(element + "<----------> has not been found\n" + e.getMessage() );
			Assert.fail();
		}
	}
	
	public static void clickElementThenTab(WebElement element) {
		try {
			element.sendKeys(Keys.TAB);
			Loggers.logTheTest(element + "<---------> has been clicked, then click Tab Key");
		} catch (NoSuchElementException | NullPointerException e) {
			e.printStackTrace();
			Loggers.logTheTest(element + "<----------> has not been found\n" + e.getMessage());
			Assert.fail();
		}
	}
	
	
	public static void clickUsingJavascriptExecutor(WebDriver driver, WebElement element) {
		// JavascriptExecutor js = (JavascriptExecutor)driver; // instead of writing this 'js' object
		// we can write below way, (JavascriptExecutor)driver is "js"
		((JavascriptExecutor)driver).executeScript("arguments[0].click()", element);
		Loggers.logTheTest("JavascriptExecutor executing ..." + " arguments[0].click()" + " to click on element ---> " + element);
	}
	
	public static void inputTextUsingJavascriptExecutor(WebDriver driver, String script, WebElement element) {
		((JavascriptExecutor) driver).executeScript(script, element);
		Loggers.logTheTest("JavascriptExecutor executing ..." + script + " to input Text on element ---> " + element);
	}
	
	public static void scrollIntoViewTheElementUsingJavascriptExecutor(WebDriver driver, WebElement element) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", element);
		Loggers.logTheTest("JavascriptExecutor executing ..." + " arguments[0].scrollIntoView(true)" + " to input Text on element ---> " + element);
	}	
	
	// This is for Enthrall IT photo upload common action, not needed for CMS
	public static void uploadPhotoImage(WebElement element, String location) {
		File file = new File(location);
		element.sendKeys(file.getAbsolutePath());
		pause(4000);
	}
	
	// very very important interview question
	// TakesScreenshot interface and getScreenshotAs method is used for taking screenshot
	public static String getSreenShot(String testName, WebDriver driver) {
		TakesScreenshot ss = (TakesScreenshot) driver;
		String path = System.getProperty("user.dir") + "/test-output/screenShots";
		File folder = new File(path);
		if (!folder.exists()) {
			folder.mkdirs();
		}

		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("MMddyyyy_hh.mm.ss");
		String formattedDate = dateFormat.format(date);

		File targetFile = new File(path + "/error_" + testName + "_" + formattedDate + ".png");
		try {
			File srcFile = ss.getScreenshotAs(OutputType.FILE);
			Files.copy(srcFile, targetFile);
			Loggers.logTheTest("Screenshot has been successfully capture at: \n" + targetFile.getAbsolutePath());
		} catch (WebDriverException | IOException e) {
			e.printStackTrace();
			Loggers.logTheTest("Screenshot cannot be captured");
		}
		return targetFile.getAbsolutePath();
	}
	
	// Attribute is coming from package constants, we will check the outcome later
	// Why String type see next method
	public static String getAttributeValue(WebElement element, Attribute attribute) {
		String value = null;
		try {
			String atr = attribute.getTheAttribute();
			value = element.getAttribute(atr);
			Loggers.logTheTest("Value for the attribute \"" + attribute + "\" in the WebElement " + element + " is executed and receive --> " + value);
		} catch (NoSuchElementException | NullPointerException e) {
			e.printStackTrace();
			Loggers.logTheTest(element + "<----------> has not been found\n" + e.getMessage() );
			Assert.fail();
		}			
		return value;
	}
	
	public static void verifyLengthOfTheFieldContent (WebElement element, Attribute attribute, String expectedLength) {
		try {
			String actualLength = getAttributeValue(element, attribute);
			Loggers.logTheTest("The field " + element + " ---> has Actual Length : " + actualLength + "and Expected Length : " + expectedLength);
			Assert.assertEquals(actualLength, expectedLength, "Length doesn't match");
		} catch (NoSuchElementException | NullPointerException e) {
			e.printStackTrace();
			Loggers.logTheTest(element + "<----------> has not been found\n" + e.getMessage() );
			Assert.fail();
		}
	}
	
	public static void verifyErrorMessageUnderTheField (WebElement element, Attribute attribute, String expectedErrorMessage) {
		try {
			String actualErrorMessage = getAttributeValue(element, attribute);
			Loggers.logTheTest("The Web Element " + element + " ---> has Actual Error Message : " + actualErrorMessage + "and Expected Error Message : " + expectedErrorMessage);
			Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Error Message doesn't match");
		} catch (NoSuchElementException | NullPointerException e) {
			e.printStackTrace();
			Loggers.logTheTest(element + "<----------> has not been found\n" + e.getMessage() );
			Assert.fail();
		}
	}
	
	public static void verifyErrorMessageOnTheTopOfThePage (WebElement element, Attribute attribute, String expectedErrorMessage) {
		try {
			String actualErrorMessage = getAttributeValue(element, attribute) + " is a required field.";
			Loggers.logTheTest("The Web Element " + element + " ---> has Actual Error Message : " + actualErrorMessage + " and Expected Error Message : " + expectedErrorMessage);
			Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Error Message doesn't match");
		} catch (NoSuchElementException | NullPointerException e) {
			e.printStackTrace();
			Loggers.logTheTest(element + "<----------> has not been found\n" + e.getMessage() );
			Assert.fail();
		}
	}
	
	// This is build ONLY for Enthrall IT Actions class inside
	public static void switchToChildWindow(WebDriver driver, WebElement element) {
		try {
			clickElement(element);
			Set<String> allWindowHandles = driver.getWindowHandles();
			Loggers.logTheTest("Total Windows Opened: " + allWindowHandles.size());
			// Extract Parent and child window from all window handles
			String parent = (String) allWindowHandles.toArray()[0];
			String child = (String) allWindowHandles.toArray()[1];
			driver.switchTo().window(child);
			Loggers.logTheTest(" The Window moved to --> " + child);
		} catch (NoSuchElementException | NullPointerException e) {
			e.printStackTrace();
			Loggers.logTheTest(element + "<----------> has not been found\n" + e.getMessage());
			Assert.fail();
		}
	}
	
	// This is build ONLY for Enthrall IT Actions class inside
	public static void mouseHoverAction (WebDriver driver,  WebElement hoverActionElement, WebElement elementNeedTobeClickFinally) {
		try {
			Actions actions = new Actions(driver);
			actions.moveToElement(hoverActionElement).build().perform();
			pause(3000);
			clickElement(elementNeedTobeClickFinally);
			Loggers.logTheTest(elementNeedTobeClickFinally + " has been selected from the mouse hover action ---> ");
		} catch (NoSuchElementException | NullPointerException e) {
			e.printStackTrace();
			Loggers.logTheTest(hoverActionElement + "<----------> has not been found\n" + e.getMessage());
			Assert.fail();
		}
	}
	
	
	public static void rightClickActionAccept (WebDriver driver,  WebElement rightClickActionElement, WebElement elementNeedTobeClickFinally) {
		try {
			Actions actions = new Actions(driver);
			actions.moveToElement(rightClickActionElement).contextClick().build().perform();
			Loggers.logTheTest(rightClickActionElement + " has been performing the right click action ---> ");
			pause(3000);
			clickElement(elementNeedTobeClickFinally);
			Loggers.logTheTest(elementNeedTobeClickFinally + " has been selected from the right click action ---> ");
			pause(3000);
			Alert alert = driver.switchTo().alert();
			System.out.println("\nAlert Text: " + alert.getText());
			alert.accept();
			pause(3000);			
			Loggers.logTheTest(elementNeedTobeClickFinally + " has been accepted from the Alert finally ---> ");
		} catch (NoSuchElementException | NullPointerException e) {
			e.printStackTrace();
			Loggers.logTheTest(rightClickActionElement + "<----------> has not been found\n" + e.getMessage());
			Assert.fail();
		}
	}
	
	public static void rightClickActionDismiss (WebDriver driver,  WebElement rightClickActionElement, WebElement elementNeedTobeClickFinally) {
		try {
			Actions actions = new Actions(driver);
			actions.moveToElement(rightClickActionElement).contextClick().build().perform();
			Loggers.logTheTest(rightClickActionElement + " has been performing the right click action ---> ");
			pause(3000);
			clickElement(elementNeedTobeClickFinally);
			Loggers.logTheTest(elementNeedTobeClickFinally + " has been selected from the right click action ---> ");
			pause(3000);
			Alert alert = driver.switchTo().alert();
			System.out.println("\nAlert Text: " + alert.getText());
			alert.dismiss();
			pause(3000);			
			Loggers.logTheTest(elementNeedTobeClickFinally + " has been accepted from the Alert finally ---> ");
		} catch (NoSuchElementException | NullPointerException e) {
			e.printStackTrace();
			Loggers.logTheTest(rightClickActionElement + "<----------> has not been found\n" + e.getMessage());
			Assert.fail();
		}
	}
	
	public static void doubleClickActionAccept (WebDriver driver,  WebElement doubleClickActionElement) {
		try {
			Actions actions = new Actions(driver);
			actions.doubleClick(doubleClickActionElement).build().perform();
			Loggers.logTheTest(doubleClickActionElement + " has been performing the double click action ---> ");
			pause(3000);
			Alert alert = driver.switchTo().alert();
			System.out.println("\nAlert Text: " + alert.getText());
			alert.accept();
			pause(3000);			
			Loggers.logTheTest(doubleClickActionElement + " has been accepted from the Alert finally ---> ");
		} catch (NoSuchElementException | NullPointerException e) {
			e.printStackTrace();
			Loggers.logTheTest(doubleClickActionElement + "<----------> has not been found\n" + e.getMessage());
			Assert.fail();
		}
	}
	
	public static void doubleClickActionDismiss (WebDriver driver,  WebElement doubleClickActionElement) {
		try {
			Actions actions = new Actions(driver);
			actions.doubleClick(doubleClickActionElement).build().perform();
			Loggers.logTheTest(doubleClickActionElement + " has been performing the double click action ---> ");
			pause(3000);
			Alert alert = driver.switchTo().alert();
			System.out.println("\nAlert Text: " + alert.getText());
			alert.dismiss();
			pause(3000);			
			Loggers.logTheTest(doubleClickActionElement + " has been dismissed from the Alert finally ---> ");
		} catch (NoSuchElementException | NullPointerException e) {
			e.printStackTrace();
			Loggers.logTheTest(doubleClickActionElement + "<----------> has not been found\n" + e.getMessage());
			Assert.fail();
		}
	}
	
	public static void findYourNameFromTheTable (WebElement elementOfYourname, String expected) {		
		// You have to create the web element like below
		// try with @FindBy, if it does not work, then use By class to create element
		// WebElement name = driver.findElement(By.cssSelector("table.navFooterMoreOnAmazon tr:nth-child(1) td:nth-child(7)"));
		try {
			String actual = elementOfYourname.getText();
			Loggers.logTheTest(elementOfYourname + " ---> Actual text : " + actual + ". Expected text : " + expected);
			Assert.assertEquals(actual, expected, "Name in the Table doesn't match");
		} catch (NoSuchElementException | NullPointerException e) {
			Loggers.logTheTest(elementOfYourname + "<----------> is not Displayed\n" + e.getMessage() );
		}					
	}
	
	public static void handleHiddenElement (WebDriver driver, String script, WebElement hiddenElement) {
	    // this is script ---> "arguments[0].value='Provide Value Here'"
		((JavascriptExecutor) driver).executeScript(script, hiddenElement);
		Loggers.logTheTest("JavascriptExecutor executing ..." + script + " to input Text on element ---> " + hiddenElement);			
		String value = (String)((JavascriptExecutor) driver).executeScript("return document.getElementById('displayed-text').value");
		Loggers.logTheTest("Value entered in hidden field: " + value);								
	}	
	
	// This is used for parameterized test
	public static void verifyErrorMessage (WebElement element, Attribute attribute, String expectedErrorMessage) {
		try {
			String actualErrorMessage = getAttributeValue(element, attribute);
			Loggers.logTheTest("The Web Element " + element + " ---> has Actual Error Message : " + actualErrorMessage + " and Expected Error Message : " + expectedErrorMessage);
			Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Error Message doesn't match");
		} catch (NoSuchElementException | NullPointerException e) {
			e.printStackTrace();
			Loggers.logTheTest(element + "<----------> has not been found\n" + e.getMessage() );
			Assert.fail();
		}
	}
				
		
		
		
		
						
}