package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.BaseTest;
import pageObjects.*;


import static data.TestData.*;

public class ID3_Test_Study_Case_1 extends BaseTest {
    AuthenticationPage authenticationPage;
    ProductProcessPage productProcessPage;
    BasketProcessPage  basketProcessPage;

    @Given("^I am on the sign (in|up) page$")
    public void sıgnInPage(String page) throws Throwable {
        authenticationPage = new AuthenticationPage(driver);
        driver.navigate().to(authenticationPage.pageUrl);
    }

    @When("^I sign in with valid credentials$")
    public void sıgnInValidCridentials() throws Throwable {
        authenticationPage = new AuthenticationPage(driver);
        authenticationPage.loginProcess(EXISTING_USER, EXISTING_PASS);
    }
/*
    @And("^Control account name and expected name$")
    public void ControlAccountName() throws Throwable {
        authenticationPage = new AuthenticationPage(driver);
        authenticationPage.loginProcessControl();
    }*/
    @And("^Go to the Dresses field$")
    public void GoDressesField() throws Throwable {
        productProcessPage = new ProductProcessPage(driver);
        productProcessPage.DressesPart();
    }
    @And("^Go to the Summer Dresses field$")
    public void GoSummerDressesField() throws Throwable {
        productProcessPage = new ProductProcessPage(driver);
        productProcessPage.SummerDressesPart();
    }
    @And("^The second product is added from Summer Dresses to the basket$")
    public void AddBasketSummerDresses() throws Throwable {
        productProcessPage = new ProductProcessPage(driver);
        productProcessPage.selectSummerDressesPart();
    }
    @And("^Go to the T-Shirts field$")
    public void clickTshirt() throws Throwable {
        productProcessPage = new ProductProcessPage(driver);
        productProcessPage.TshirtPart();
    }
    @And("^A Tshirt product is added to the basket$")
    public void AddTshirtBasket() throws Throwable {
        productProcessPage = new ProductProcessPage(driver);
        productProcessPage.SelectTshirtPart();
    }
    @When("^My shopping cart page should be open$")
    public void clickBasket() throws Throwable {
        productProcessPage = new ProductProcessPage(driver);
        productProcessPage.selectBasketPart();
    }
    @And("^Compare actual and expected name for summer dress$")
    public void CompareSummerDressName() throws Throwable {
        basketProcessPage = new BasketProcessPage(driver);
        basketProcessPage.compareSummerDressName();
    }
    @And("^Compare actual and expected price for summer dress$")
    public void CompareSummerDressPrice() throws Throwable {
        basketProcessPage = new BasketProcessPage(driver);
        basketProcessPage.compareSummerDressPrice();
    }
    @And("^Compare actual and expected name for T-shirts$")
    public void CompareTshirtName() throws Throwable {
        basketProcessPage = new BasketProcessPage(driver);
        basketProcessPage.compareTshirtName();
    }
    @And("^Compare actual and expected price for T-shirts$")
    public void CompareTshirtPrice() throws Throwable {
        basketProcessPage = new BasketProcessPage(driver);
        basketProcessPage.compareTshirtPrice();
    }
    @Then("^Compare actual total price and expected total price$")
    public void CompareTotalPrice() throws Throwable {
        basketProcessPage = new BasketProcessPage(driver);
        basketProcessPage.compareTotalPrice();
    }








}
