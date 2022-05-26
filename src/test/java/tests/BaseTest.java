package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    @BeforeMethod
    public void setup() {
        utils.Driver.setDriver();
    }

    @AfterMethod
    public void teardown() {
        utils.Driver.closeDriver();
    }
}