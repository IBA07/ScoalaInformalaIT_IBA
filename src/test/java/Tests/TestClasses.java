package Tests;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class PotTestClasses {

    public static final String URL_BASE = "https://github.com/";
    public static final String DRIVER_PATH = "src/test/resources/drivers/";

    public WebDriver getDriver(String browser){
        WebDriver driver = null;
        switch (browser) {
            case "chrome" : {

                System.setProperty("webdriver.chrome.driver", DRIVER_PATH + "chromedriver.exe");
                driver = new ChromeDriver();
                break;
            }
            case "firefox" : {

                System.setProperty("webdriver.gecko.driver", DRIVER_PATH + "geckodriver.exe");
                driver = new FirefoxDriver();
                break;
            }
            case "edge" : {

                System.setProperty("webdriver.edge.driver", DRIVER_PATH + "msedgedriver.exe");
                driver = new EdgeDriver();
                break;
            }
            default: {
                throw new IllegalArgumentException("The value provider is illegal:" + browser);
            }

        }
        return driver;
    }

    @Before
    public void beforeTest(){
        System.out.println("This runs each time before any test!!!");
    }

    @Test
    public void test01() {

        System.out.println("This is my very first test !");
       // String s = System.setProperty("webdriver.chrome.driver", DRIVER_PATH + "chromedriver.exe");
       // WebDriver driver = new ChromeDriver();
        WebDriver driver = getDriver("chrome");
        driver.navigate().to(URL_BASE);
        //driver.close();

    }
    @Test
    public void test02() {
        System.out.println("Firefox first test");
        // String s = System.setProperty("webdriver.gecko.driver", DRIVER_PATH + "geckodriver.exe");
        // WebDriver driver = new FirefoxDriver();
        WebDriver driver = getDriver("firefox");
        driver.navigate().to(URL_BASE);
        //driver.close();

    }
    @Test
    public void test03() {
        System.out.println("Edge first test");
        //String s = System.setProperty("webdriver.edge.driver", DRIVER_PATH + "msedgedriver.exe");
        //WebDriver driver = new EdgeDriver();
        WebDriver driver = getDriver("edge");
        driver.navigate().to(URL_BASE);
        //driver.close();

    }

    }
