package pages;

import org.openqa.selenium.By;

public class Locators {

    public static class Superhi {

        public static class Login {

            public static By inputUserName = By.xpath("//*[@id='log-in_username']");
            public static By inputPassword = By.xpath("//*[@id='log-in_password']");
            public static By buttonLogIn = By.xpath("(//*[@class='sc-gsnTZi zCmtE'])[1]");
            public static By buttonProfile = By.xpath("//*[@class='sc-ezWXYA gEoiyo']");
            public static By fieldUserName = By.xpath("//*[@id='__next']/nav/div[1]/div[2]/div/div/div/div/div/div[1]/div/p[2]");
        }
    }
}
