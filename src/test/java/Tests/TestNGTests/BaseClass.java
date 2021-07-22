package Tests.TestNGTests;

import Utils.BrowserUtils;
import Utils.Constants;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import static Utils.BrowserUtils.getBrowser;

public class BaseClass {

    WebDriver driver;

    @BeforeClass
    public void beforeAll(){
        System.out.println("BEFORE CLASS");
    }

    @BeforeMethod
    public void beforeTests() {
        System.out.println("BEFORE TEST");
        driver = BrowserUtils.getDriver(getBrowser(Constants.CURRENT_BROWSER));
        driver.get(Constants.URL_BASE);
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("AFTER TEST");
        if (driver != null) {
            driver.close();
        }
    }
    @AfterClass
    public void afterAll() {
        System.out.println("AFTER ALL");
    }
}
