package helpers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helpers extends BaseTest {

    public static void selectOptionFromList(WebElement element, String option){
        WebElement select = element;
        new Select(select).selectByVisibleText(option);
    }


}
