package pageObjects;

import helpers.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import static data.TestData.*;
import static helpers.Helpers.selectOptionFromList;

public class AuthenticationPage extends BaseTest {
    public String pageUrl = BASEURL + "/index.php?controller=authentication&back=my-account";

    @FindBy(how = How.XPATH, using = "//a[@class='login']")
    private WebElement signInLink;

    @FindBy(how = How.XPATH, using = "//a[@class='logout']")
    private WebElement signOutLink;

    @FindBy(how = How.ID, using = "email")
    private WebElement emailAddressFld;

    @FindBy(how = How.ID, using = "passwd")
    private WebElement passwordFld;

    @FindBy(how = How.ID, using = "SubmitLogin")
    private WebElement signInBtn;

    @FindBy(how = How.XPATH, using = "//div[@class='header_user_info']//a[@href='http://automationpractice.com/index.php?controller=my-account']")
    private WebElement accountNameField;

    private String expectedAccountName ="Onur Proje";
    public AuthenticationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void loginProcess(String email, String pass) {
        emailAddressFld.sendKeys(email);
        passwordFld.sendKeys(pass);
        signInBtn.click();

        };
/*
    public void loginProcessControl() {
        String actualTitle = driver.findElement((By) accountNameField).getText();;

        Assert.assertEquals(expectedAccountName, actualTitle);
    }*/




}