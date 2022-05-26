package tests.checkli;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

public class ProjectX extends BaseTest {

    @BeforeMethod
    public void openLink() {
        pages.checkli.ProjectX.open();
    }

    @Test

    public void CheckBoxes (){

        String expectedMessage = "Share your completed work!";

        pages.checkli.ProjectX.clickButtonForCheckBoxOne();
        pages.checkli.ProjectX.enterName();
        pages.checkli.ProjectX.clickContinueButton();
        pages.checkli.ProjectX.clickButtonForCheckBoxOne();
        pages.checkli.ProjectX.clickButtonForCheckBoxTwo();
        String actualMessage = pages.checkli.ProjectX.readCompleteMessage();

        Assert.assertEquals(actualMessage, expectedMessage);
    }
}
