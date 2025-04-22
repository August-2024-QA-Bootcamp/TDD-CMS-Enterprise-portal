package baseUtil;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import constants.BStack;
import constants.BStackCommon;
import constants.IResource;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import common.CommonActions;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;
import pages.HomePageParameterized;
import pages.NewUserRegistration;
import reports.ExtentReportManager;
import reports.TestManager;
import utils.Configuration;

import static utils.IConstant.*;

public class BaseClass {
    public WebDriver driver;
    public HomePage homePage;
    public HomePageParameterized homePageParameterized;
    public NewUserRegistration newUserRegistration;
    Configuration configuration;
    ExtentReports extentReports;
    ExtentTest extentTest;


    @BeforeSuite
    public void initialReporting() {
        extentReports = ExtentReportManager.initialReports();
    }

    @BeforeClass
    public void beforeClassSetUp() {
        configuration = new Configuration();
    }

    @BeforeMethod
    public void initialTest(Method method) {
        extentTest = TestManager.createTest(extentReports, method.getName());
        extentTest.assignCategory(method.getDeclaringClass().getName());
    }

    @Parameters("browser")
    @BeforeMethod
    public void setUp(@Optional(CHROME) String browserName)
	{
		String remoteInd = configuration.getProperties(REMOTE);
		driver = remoteInd.equalsIgnoreCase("Y") ? remoteSetup() : initDriver(browserName);

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(configuration.getProperties(URL));
        long pageLoadWait = Long.parseLong(configuration.getProperties(PAGELOAD_WAIT));
        long implicitlyWait = Long.parseLong(configuration.getProperties(IMPLICITLY_WAIT));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(pageLoadWait));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitlyWait));
        initClass();
    }

    public WebDriver initDriver(String browserName) {

        String os = System.getProperty("os.name");

        switch (browserName) {

            case CHROME:

                if (os.toLowerCase().contains("win")) {
                    System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
                } else {
                    WebDriverManager.chromedriver().setup();
                }
                
                driver = new ChromeDriver();
                break;

            case FIREFOX:

                if (os.toLowerCase().contains("win")) {
                    System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
                } else {
                    WebDriverManager.firefoxdriver().setup();
                }

                driver = new FirefoxDriver();
                break;

            case EDGE:

                if (os.toLowerCase().contains("win")) {
                    System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
                } else {
                    WebDriverManager.edgedriver().setup();
                }
                driver = new EdgeDriver();
                break;

            case HEADLESS:

                if (os.toLowerCase().contains("win")) {
                    System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
                } else {
                    WebDriverManager.chromedriver().setup();
                }

                // Headless, use browser value = ghost-mode in xml
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--headless=new");
                
                driver = new ChromeDriver(options);
                break;
                
            default:
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
        }

		return driver;
    }

    public void initClass() {
        homePage = new HomePage(driver);
        newUserRegistration = new NewUserRegistration(driver);
        homePageParameterized = new HomePageParameterized(driver);
    }

    @AfterMethod
    public void tearUp() {
        driver.quit();
    }

    @AfterMethod
    public void afterEachTest(Method method, ITestResult result) {
        for (String group : result.getMethod().getGroups()) {
            extentTest.assignCategory(group);
        }
        if (result.getStatus() == ITestResult.SUCCESS) {
            extentTest.log(Status.PASS, "Test PASSED");
        } else if (result.getStatus() == ITestResult.FAILURE) {
            extentTest.addScreenCaptureFromPath(CommonActions.getSreenShot(method.getName(), driver));
            extentTest.log(Status.FAIL, "Test FAILED");
        } else if (result.getStatus() == ITestResult.SKIP) {
            extentTest.log(Status.SKIP, "Test SKIPPED");
        }
    }

    @AfterSuite
    public void publishReport() {
        extentReports.flush();
    }

    public WebDriver remoteSetup()
	{
        Configuration remoteConfig = new Configuration(IResource.REMOTE_CONFIG);

        try {
            Map<String, String> map = new HashMap<>();
			map.put(getBSValue(BStack.OS), remoteConfig.getProperties(getBSKey(BStack.OS)));
			map.put(getBSValue(BStack.OS_VER), remoteConfig.getProperties(getBSKey(BStack.OS_VER)));
			map.put(getBSValue(BStack.BROWSER_NAME), remoteConfig.getProperties(getBSKey(BStack.BROWSER_NAME)));
			map.put(getBSValue(BStack.BROWSER_VER), remoteConfig.getProperties(getBSKey(BStack.BROWSER_VER)));

//            map.put(getBSValue(BStack.DEVICE_NAME), remoteConfig.getProperties(getBSKey(BStack.DEVICE_NAME)));
//            map.put(getBSValue(BStack.OS_VER), remoteConfig.getProperties(getBSKey(BStack.OS_VER)));
//            map.put(getBSValue(BStack.BROWSER_NAME), remoteConfig.getProperties(getBSKey(BStack.BROWSER_NAME)));
//            map.put(getBSValue(BStack.DEVICE_ORIENTATION), remoteConfig.getProperties(getBSKey(BStack.DEVICE_ORIENTATION)));

            MutableCapabilities caps = new MutableCapabilities();
            caps.setCapability(getBSValue(BStack.BS_OPTIONS), map);

            URL url = new URL(buildUrl(remoteConfig));
            driver = new RemoteWebDriver(url, caps);
        } catch (MalformedURLException e) {
            System.out.println("Remote connection failed");
        }

		return driver;
    }

    private String getBSValue(BStack bStack) {
        return bStack.toString();
    }


    private String getBSKey(BStack bStack) {
        return bStack.name();
    }


    private String buildUrl(Configuration config) {
        StringBuilder builder = new StringBuilder();
        builder.append("http://");
        builder.append(config.getProperties(BStackCommon.USER.name()));
        builder.append(":");
        builder.append(config.getProperties(BStackCommon.PASS.name()));
        builder.append(config.getProperties(BStackCommon.BS_URL.name()));

        return builder.toString();
    }
}