package Tests;

import Utils.BrowserUtils;
import Utils.Constants;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;


public class TestNgClassses {
    WebDriver driver;
    @BeforeMethod
    public void beforeTests() {
        driver = BrowserUtils.getDriver(Constants.CURRENT_BROWSER);
        driver.get(Constants.URL_BASE);
    }
    @BeforeClass
    
    @Test
    public void Test01() {
        System.out.println("This is my very first test with test ng !");
    }
    
    @AfterMethod
    
    @AfterClass

}
