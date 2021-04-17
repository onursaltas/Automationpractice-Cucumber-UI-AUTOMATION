package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

public class BaseTest {
    public static WebDriver driver = null;
    public static int timeout = 30;
    public static int wait = 10;

    public static void CreateWebDriver() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/");
        String actualTitle = driver.getTitle();
        String expectedTitle = "My Store";
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    public static WebDriver getDriver() {
        CreateWebDriver();
        return driver;
    }

    public static void closeBrowser() {
        driver.quit();
    }
}