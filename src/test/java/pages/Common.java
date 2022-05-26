package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Common {

    public static void openUrl(String url) {
        utils.Driver.getDriver().get(url);
    }

    public static WebElement getElement(By locator) {
        return utils.Driver.getDriver().findElement(locator);
    }

    public static void sendKeysToElement(By locator, String keys) {
        getElement(locator).sendKeys(keys);
    }

    public static void clickElement(By locator) {
        getElement(locator).click();
    }
    public static String getElementText(By locator) {
        return getElement(locator).getText();
    }
}