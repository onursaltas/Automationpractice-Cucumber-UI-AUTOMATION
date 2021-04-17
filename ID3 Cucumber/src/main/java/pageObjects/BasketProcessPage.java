package pageObjects;

import helpers.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasketProcessPage extends BaseTest{

    public BasketProcessPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    private WebDriverWait wait;

    //private String ExptectedSummerPrice = "$30.50";
    //private String ExpectedTshirtName = "Faded Short Sleeve T-shirts";
    private String ExpectedTshirtPrice = "$16.51";
    private String ExpectedTotalPrice = "$49.01";

    @FindBy(how = How.XPATH, using = "//td[@class='cart_unit']/child::span[@id='product_price_6_31_0']")
    private WebElement ExptectedSummerPrice;

    @FindBy(how = How.XPATH, using = "//td[@class='cart_unit']/child::span[@id='product_price_1_1_0']")
    private WebElement ExpectedTshirtName;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Printed Summer Dress')]")
    private WebElement compareSummerName;

    @FindBy(how = How.XPATH, using = "//td[@class='cart_total']/child::span[@id='total_product_price_6_31_0']")
    private WebElement compareSummerPrice;

    @FindBy(how = How.XPATH, using = "//td[@class='cart_total']/child::span[@id='total_product_price_1_1_0']")
    private WebElement compareDTshirtName;

    @FindBy(how = How.XPATH, using = "//td[@class='cart_total']/child::span[@id='total_product_price_1_1_0']")
    private WebElement compareDTshirtPrice;

    @FindBy(how = How.XPATH, using = "//td[@id='total_price_container']")
    private WebElement compareTotalValue;

    public void compareSummerDressName() {
        //wait.until(ExpectedConditions.elementToBeClickable(compareSummerName));
        String actualSummerName = driver.findElement((By) compareSummerName).getText();
        String ExptectedSummerName = "Printed Summer Dress";
        Assert.assertEquals(ExptectedSummerName, actualSummerName);
    };
    public void compareSummerDressPrice() {
        //wait.until(ExpectedConditions.elementToBeClickable(compareSummerPrice));
        String actualSummerPrice = driver.findElement((By) compareSummerPrice).getText();
        String exptectedSummerPrice = driver.findElement((By) ExptectedSummerPrice).getText();
        Assert.assertEquals(exptectedSummerPrice, actualSummerPrice);
    };
    public void compareTshirtName() {
        //wait.until(ExpectedConditions.elementToBeClickable(compareDTshirtName));
        String actualTshirtName = driver.findElement((By) compareDTshirtName).getText();
        String expectedTshirtName = driver.findElement((By) ExpectedTshirtName).getText();
        Assert.assertEquals(expectedTshirtName, actualTshirtName);
    };
    public void compareTshirtPrice() {
        //wait.until(ExpectedConditions.elementToBeClickable(compareDTshirtPrice));
        String actualTshirtPrice = driver.findElement((By) compareDTshirtPrice).getText();
        Assert.assertEquals(ExpectedTshirtPrice, actualTshirtPrice);
    };
    public void compareTotalPrice() {
        //wait.until(ExpectedConditions.elementToBeClickable(compareTotalValue));
        String actualTotalPrice = driver.findElement((By) compareTotalValue).getText();
        Assert.assertEquals(ExpectedTotalPrice, actualTotalPrice);
    };


}
