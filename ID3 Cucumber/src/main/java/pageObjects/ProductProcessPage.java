package pageObjects;

import helpers.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductProcessPage extends BaseTest {


    private WebDriverWait wait;

    public ProductProcessPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }



    @FindBy(how = How.XPATH, using = "//ul[contains(@class,'submenu-container')]/preceding-sibling::a[@title='Dresses']")
    private WebElement Dresses;

    @FindBy(how = How.XPATH, using = "//div[@class='block_content']//a[@href='http://automationpractice.com/index.php?id_category=11&controller=category']")
    private WebElement SummerDresses;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Printed Summer Dress')]")
    private WebElement ClickselectSummerDresses;
    @FindBy(how = How.XPATH, using = "//p[@id='add_to_cart']//child::button[1]//child::span[1]")
    private WebElement selectSummerDresses;

    @FindBy(how = How.XPATH, using = "//span[@class='cross']")
    private WebElement ContinueShopping;

    @FindBy(how = How.XPATH, using = "//ul[contains(@class,'submenu-container')]/following::a[@title='T-shirts']")
    private WebElement Tshirt;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Faded Short Sleeve T-shirts')]")
    private WebElement ClickselectTshirt;
    @FindBy(how = How.XPATH, using = "//p[@id='add_to_cart']//child::button[1]//child::span[1]")
    private WebElement selectTshirt;

    @FindBy(how = How.XPATH, using = "//div[@class='shopping_cart']/a[@href='http://automationpractice.com/index.php?controller=order']")
    private WebElement selectBasket;

    public void DressesPart() {
        //wait.until(ExpectedConditions.elementToBeClickable(Dresses));
        Dresses.click();
    };

    public void SummerDressesPart() {
        //wait.until(ExpectedConditions.elementToBeClickable(SummerDresses));
        SummerDresses.click();
    };
    public void selectSummerDressesPart() {
        //wait.until(ExpectedConditions.elementToBeClickable(selectSummerDresses));
        ClickselectSummerDresses.click();
        selectSummerDresses.click();
    };
    public void TshirtPart() {
       // wait.until(ExpectedConditions.elementToBeClickable(Tshirt));
        Tshirt.click();
    };
    public void SelectTshirtPart() {
        //wait.until(ExpectedConditions.elementToBeClickable(selectTshirt));

        ClickselectTshirt.click();
       selectTshirt.click();
    };

    public void selectBasketPart() {
        //.until(ExpectedConditions.elementToBeClickable(selectBasket));
        selectBasket.click();
    };






}
