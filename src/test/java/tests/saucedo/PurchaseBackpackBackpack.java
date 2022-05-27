package tests.saucedo;

import org.bouncycastle.crypto.agreement.jpake.JPAKEPrimeOrderGroup;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

public class PurchaseBackpackBackpack extends BaseTest {


    @BeforeMethod
    public void openLink() {
        pages.saucedo.PurchaseBackpack.open();
    }

    @Test
    public void Purchase() {

        String expectedMessage = "CHECKOUT: COMPLETE!";

        pages.saucedo.PurchaseBackpack.enterValidUserName();
        pages.saucedo.PurchaseBackpack.enterValidPassword();
        pages.saucedo.PurchaseBackpack.clickLogin();
        pages.saucedo.PurchaseBackpack.clickAddToCart();
        pages.saucedo.PurchaseBackpack.clickCartToOpen();
        pages.saucedo.PurchaseBackpack.clickCheckout();
        pages.saucedo.PurchaseBackpack.enterFristName();
        pages.saucedo.PurchaseBackpack.enterLastName();
        pages.saucedo.PurchaseBackpack.enterZipCode();
        pages.saucedo.PurchaseBackpack.clickContinue();
        pages.saucedo.PurchaseBackpack.clickFinish();
        String actualMessage = pages.saucedo.PurchaseBackpack.readCompleteMessage();

        Assert.assertEquals(actualMessage, expectedMessage);
    }
}
