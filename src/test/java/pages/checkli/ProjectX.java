package pages.checkli;

import pages.Common;
import pages.Locators;

public class ProjectX {

    public static void open() {
        Common.openUrl("https://www.checkli.com/checklists/guest_view/628fbddf367da");
    }

    public static void clickButtonForCheckBoxOne (){
        Common.clickElement(Locators.CheckLi.ProjectX.buttonBoxFieldOne);
    }

    public static void enterName() {
        Common.sendKeysToElement(Locators.CheckLi.ProjectX.fieldEnterName, "Testas");
    }

    public static void clickContinueButton() {
        Common.clickElement(Locators.CheckLi.ProjectX.buttonContinue);
    }

    public static void clickButtonForCheckBoxTwo() {
        Common.clickElement(Locators.CheckLi.ProjectX.buttonBoxFieldTwo);
    }

    public static String readCompleteMessage() {
        return Common.getElementText(Locators.CheckLi.ProjectX.textCompleteMessage);
    }
}