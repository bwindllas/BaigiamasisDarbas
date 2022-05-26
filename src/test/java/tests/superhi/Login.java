package tests.superhi;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

public class Login extends BaseTest {

    @BeforeMethod
    public void openLink() {
        pages.superhi.Login.open();
    }

    @Test
    public void Login() {

        String userName = "testas3@gmail.com";
        String password = "7%9a37J4782BUu&XiYuw7Ldq#";

        pages.superhi.Login.enterEmail(userName);
        pages.superhi.Login.enterPassword(password);
        pages.superhi.Login.clickLoginButton();
        pages.superhi.Login.clickProfileButton();
        String actualMessage = pages.superhi.Login.readUserName();

        Assert.assertEquals(actualMessage, userName);

    }
}
