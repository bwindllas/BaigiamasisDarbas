package pages.demoblaze;

import pages.Common;
import pages.Locators;

public class Contact {

    public static void open() {
        Common.openUrl("https://www.demoblaze.com/index.html");
    }

    public static void clickButtonToOpenContact() {
        Common.clickElement(Locators.Demoblaze.Contact.buttonContact);
    }

    public static void enterContactEmail() {
        Common.sendKeysToElement(Locators.Demoblaze.Contact.inputContactEmail, "test@test.com");
    }

    public static void enterContactName() {
        Common.sendKeysToElement(Locators.Demoblaze.Contact.inputContactName, "Mr. Test");

    }

    public static void enterMessage() {
        Common.sendKeysToElement(Locators.Demoblaze.Contact.inputMessage, "Need Help!");

    }

    public static void clickSendMessage() {
        Common.clickElement(Locators.Demoblaze.Contact.buttonSendMessage);
    }

    public static void clickOkToCloseAlertBox() {
        Common.acceptAlert();
    }

    public static Boolean isAlertPresent() {
        return Common.isAlertPresent();
    }
}
