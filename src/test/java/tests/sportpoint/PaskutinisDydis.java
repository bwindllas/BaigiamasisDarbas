package tests.sportpoint;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

public class PaskutinisDydis extends BaseTest {

    @BeforeMethod
    public void openLink() {
        pages.sportpoint.PaskutinisDydis.open();
    }

    @Test
    public void filterCheckBoxHokaOneOne() {

        String expectedMessage = "adidas Deep Threat Kids";

        pages.sportpoint.PaskutinisDydis.clickAcceptCookie();
        pages.sportpoint.PaskutinisDydis.checkFilterAdidas();
        String actualMessage = pages.sportpoint.PaskutinisDydis.readNameOfFilterResult();

        Assert.assertEquals(actualMessage, expectedMessage);

    }
}
