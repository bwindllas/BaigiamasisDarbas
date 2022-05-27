package pages.saucedo;

import pages.Common;
import pages.Locators;

public class PurchaseBackpack {

    public static void open() {
        Common.openUrl("https://www.saucedemo.com/");
    }

    public static void enterValidUserName() {
        Common.sendKeysToElement(Locators.Saucedo.PurchaseBackpack.inputFieldUserName,"standard_user");
    }

    public static void enterValidPassword() {
        Common.sendKeysToElement(Locators.Saucedo.PurchaseBackpack.inputFieldPassword, "secret_sauce");
    }

    public static void clickLogin() {
        Common.clickElement(Locators.Saucedo.PurchaseBackpack.buttonLogin);
    }

    public static void clickAddToCart() {
        Common.clickElement(Locators.Saucedo.PurchaseBackpack.buttonAddToCart);
    }

    public static void clickCartToOpen() {
        Common.clickElement(Locators.Saucedo.PurchaseBackpack.buttonImageCart);
    }

    public static void clickCheckout() {
        Common.clickElement(Locators.Saucedo.PurchaseBackpack.buttonCheckout);
    }

    public static void enterFristName() {
        Common.sendKeysToElement(Locators.Saucedo.PurchaseBackpack.inputFieldFirstName, "Ponas");
    }

    public static void enterLastName() {
        Common.sendKeysToElement(Locators.Saucedo.PurchaseBackpack.inputFieldLastName, "Testas");
    }

    public static void enterZipCode() {
        Common.sendKeysToElement(Locators.Saucedo.PurchaseBackpack.inputFieldZipCode, "12345");
    }

    public static void clickContinue() {
        Common.clickElement(Locators.Saucedo.PurchaseBackpack.buttonContinue);
    }

    public static void clickFinish() {
        Common.clickElement(Locators.Saucedo.PurchaseBackpack.buttonFinish);
    }

    public static String readCompleteMessage() {
       return Common.getElementText(Locators.Saucedo.PurchaseBackpack.textFieldComplete);
    }
}
