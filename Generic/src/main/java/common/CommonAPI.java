package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class CommonAPI {
    public static WebDriver driver = null;
    @Parameters({"browserName","url","operatingSystem"})
    @BeforeTest
    public void setUp(String browserName,String url , String operatingSystem ){
        getLocalDriver(browserName, operatingSystem);
        driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout( 35,TimeUnit.SECONDS);
        driver.get(url);
        driver.manage().window().maximize();
    }

    public WebDriver getLocalDriver(String browserName, String operatingSystem) {
        String browser = browserName.toLowerCase();
        String oS = operatingSystem.toLowerCase();
        if (browser.contains("chrome")) {
            if (oS.contains("os x") || oS.contains("windows")) {
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jainal Abedin\\IdeaProjects\\AstoriaPnt\\Generic\\driver\\chromedriver.exe");

            } else if (oS.contains("win")) {
                System.setProperty("webdriver.chrome.drive", "C:\\Users\\Jainal Abedin\\IdeaProjects\\AstoriaPnt\\Generic\\driver\\chromedriver.exe");
            }
            driver = new ChromeDriver();
        } else if (browser.contains("firefox")) {
            if (oS.contains("os x") || oS.contains("windows")) {
                System.setProperty("webdriver.gecko.driver", "C:\\Users\\Jainal Abedin\\IdeaProjects\\AstoriaPnt\\Generic\\driver\\geckodriver.exe");

            } else if (oS.contains("win")) {
                System.setProperty("webdriver.gecko.driver", "C:\\Users\\Jainal Abedin\\IdeaProjects\\AstoriaPnt\\Generic\\driver\\geckodriver.exe");
            }
            driver = new FirefoxDriver();
        }
        return driver;
    }
    @AfterTest
    public void cleanup(){ driver.quit(); }


        }





