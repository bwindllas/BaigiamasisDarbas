package tests.demoblaze;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

public class Contact extends BaseTest {

    @BeforeMethod
    public void openLink() {
        pages.demoblaze.Contact.open();
    }

    @Test
    public void sendMessage (){

        pages.demoblaze.Contact.clickButtonToOpenContact();
        pages.demoblaze.Contact.enterContactEmail();
        pages.demoblaze.Contact.enterContactName();
        pages.demoblaze.Contact.enterMessage();
        pages.demoblaze.Contact.clickSendMessage();

        Assert.assertTrue(pages.demoblaze.Contact.isAlertPresent());

    }
}
