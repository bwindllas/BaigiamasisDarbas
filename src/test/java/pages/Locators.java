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

    public static class Demoblaze {

        public static class Contact {

            public static By buttonContact = By.xpath("//*[@class='nav-link' and text()='Contact']");
            public static By inputContactEmail = By.xpath("//*[@id='recipient-email']");
            public static By inputContactName = By.xpath("//*[@id='recipient-name']");
            public static By inputMessage = By.xpath("//*[@id='message-text']");
            public static By buttonSendMessage = By.xpath("(//*[@class='btn btn-primary'])[1]");

        }
    }

    public static class CheckLi {

        public static class ProjectX {

            public static By buttonBoxFieldOne = By.xpath("//*[@id='tasks']/li[1]/div[1]/label");
            public static By buttonBoxFieldTwo = By.xpath("//*[@id='tasks']/li[2]/div[1]/label");
            public static By fieldEnterName = By.xpath("//*[@id='field-name']");
            public static By buttonContinue = By.xpath("/html/body/div[2]/div/div[1]/div/div/div/a");
            public static By textCompleteMessage = By.xpath("/html/body/div[2]/div/div[1]/div/div/div/div/h1/span");
        }
    }

    public static class Saucedo {

        public static class PurchaseBackpack {

            public static By inputFieldUserName = By.xpath("//*[@id='user-name']");
            public static By inputFieldPassword = By.xpath("//*[@id='password']");
            public static By buttonLogin = By.xpath("//*[@id='login-button']");
            public static By buttonAddToCart = By.xpath("//*[@id='add-to-cart-sauce-labs-backpack']");
            public static By buttonImageCart = By.xpath("//*[@id='shopping_cart_container']");
            public static By buttonCheckout = By.xpath("//*[@id='checkout']");
            public static By inputFieldFirstName = By.xpath("//*[@id='first-name']");
            public static By inputFieldLastName = By.xpath("//*[@id='last-name']");
            public static By inputFieldZipCode = By.xpath("//*[@id='postal-code']");
            public static By buttonContinue = By.xpath("//*[@id='continue']");
            public static By buttonFinish = By.xpath("//*[@id='finish']");

            public static By textFieldComplete = By.xpath("//*[@class='title']");

        }
    }

    public static class Sportpoint {

        public static class PaskutinisDydis {

            public static By buttonAcceptCookie = By.xpath("//*[@class='cookieinfo-close']");
            public static By fieldCheckBoxAdidas = By.xpath("//*[@id='left_blocks']/li[1]/div/div[2]/div[2]/div/div[3]/div/label/a");
            public static By textFieldAdidas = By.xpath("//*[@class='a1']");


        }
    }
}
