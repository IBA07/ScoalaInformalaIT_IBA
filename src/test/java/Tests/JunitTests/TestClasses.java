package Tests.JunitTests;

import org.junit.Test;

public class TestClasses extends BaseClassJunit{
    // moved to Constants
    //public static final String URL_BASE = "https://github.com/";
    //public static final String DRIVER_PATH = "src/test/resources/drivers/";


    @Test
    public void test01() {

        System.out.println("This is my very first test !");
       // String s = System.setProperty("webdriver.chrome.driver", DRIVER_PATH + "chromedriver.exe");
       // WebDriver driver = new ChromeDriver();
       // WebDriver driver = getDriver("chrome");
       // driver.navigate().to(URL_BASE);
       //driver.close();

    }
    @Test
    public void test02() {
        System.out.println("Firefox second test");
        // String s = System.setProperty("webdriver.gecko.driver", DRIVER_PATH + "geckodriver.exe");
        // WebDriver driver = new FirefoxDriver();
        //WebDriver driver = getDriver("firefox");
        //driver.navigate().to(URL_BASE);
        //driver.close();

    }
    @Test
    public void test03() {
        System.out.println("Edge third test");
        //String s = System.setProperty("webdriver.edge.driver", DRIVER_PATH + "msedgedriver.exe");
        //WebDriver driver = new EdgeDriver();
        // WebDriver driver = getDriver("edge");
        // driver.navigate().to(URL_BASE);
        //driver.close();

    }


    }
