package pages.sportpoint;

import pages.Common;
import pages.Locators;

public class PaskutinisDydis {

    public static void open() {
        Common.openUrl("http://www.sportpoint.lt/paskutinis-dydis");
    }

    public static void checkFilterAdidas() {
        Common.clickElement(Locators.Sportpoint.PaskutinisDydis.fieldCheckBoxAdidas);
    }

    public static void clickAcceptCookie() {
        Common.waitForElementToBeClickable(Locators.Sportpoint.PaskutinisDydis.buttonAcceptCookie);
        Common.clickElement(Locators.Sportpoint.PaskutinisDydis.buttonAcceptCookie);
    }

    public static String readNameOfFilterResult() {
        Common.waitForElementToBeVisible(Locators.Sportpoint.PaskutinisDydis.textFieldAdidas);
        return Common.getElementText(Locators.Sportpoint.PaskutinisDydis.textFieldAdidas);
    }
}

