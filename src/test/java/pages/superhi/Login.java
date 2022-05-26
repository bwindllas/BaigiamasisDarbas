package pages.superhi;

import pages.Common;
import pages.Locators;

public class Login {

    public static void open() {
        Common.openUrl("https://account.superhi.com/login?redirectExternal=https%3A%2F%2Fwww.superhi.com%2F");
    }

    public static void enterEmail(String userName) {
        Common.sendKeysToElement(Locators.Superhi.Login.inputUserName, userName);
    }

    public static void enterPassword(String password) {
        Common.sendKeysToElement(Locators.Superhi.Login.inputPassword, password);
    }

    public static void clickLoginButton() {
        Common.clickElement(Locators.Superhi.Login.buttonLogIn);
    }


    public static void clickProfileButton() {
        Common.clickElement(Locators.Superhi.Login.buttonProfile);
    }

    public static String readUserName() {
        return Common.getElementText(Locators.Superhi.Login.fieldUserName);
    }
}

