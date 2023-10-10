package li.linas.pom.pages;

import org.openqa.selenium.By;

public class Locators {

    public static class Zvejys {
        public static class reelPage {
            public static By reelNameinput = By.xpath(
                    "//div[@class='ty-search-block']//input[@type='text']");
            public static By buttonClickOnPaieska = By.xpath(
                    "//div[@class='ty-search-block']//input[@type='submit']");
            public static By ButtonSearchItemName = By.xpath(
                    "//div[@class='vs-grid vs-grid-table']//a[@class='product-title']");
            public static By buttonSelectReelDam = By.xpath(
                    "//div[@id='category_products_2']//a[contains(text(),'DAM Quick 1 RD 3+1BB')]");
            public static By buttonSelectReelDamToCart = By.xpath("//a[@id='button_cart_1034489']");
            public static By notificationCloseShipingCart = By.xpath(
                    "//span[@class='cm-notification-close close']");
            public static By buttonSwitchToSpiningavimuiMenu = By.xpath("//a[@class='ty-breadcrumbs__a'][3]");
            public static By buttonSwitchToMeskeres = By.xpath("//*[@id='sidebox_75']/div[1]/a");
            public static By buttonSwitchToMeskeresUpems = By.xpath("//div[@id='scroll_list_2']//a[1]");
            public static By buttonSwitchToMeskeresSpiningavimui = By.xpath(
                    "//div[@class='owl-wrapper-outer']/div/div[1]/div/div[2]/a");
            public static By buttonSwitchToSpiningai = By.xpath("//div[@id='scroll_list_2']/div[1]/div/div[2]");
            public static By buttonSwitchToAddToCart = By.xpath("//i[@class='vs-icon-grid-add-to-cart']");
            public static By buttonSelectManokrepselisButton = By.xpath("//span[@class='minicart-title hand']");
            public static By buttonSelectRodytiManokrepselisButton = By.xpath("//a[@class='view-cart']");
            public static By shoppingCart = By.xpath("//div[@id='cart_items']//tbody/tr/td[2]//a[1]");
        }

        public static class paskyrosMenu {
            public static By buttonPaskyraMenu = By.xpath("//div[@id='sw_dropdown_251']");
            public static By buttonPaskyraMenuPrisijungti = By.xpath(
                    "//div[@class='ty-account-info__buttons buttons-container']" +
                            "//a[contains(text(),'Prisijungti')]");
            public static By loginEmail = By.xpath("//input[@name='user_login']");
            public static By loginPassword = By.xpath("//input[@name='password']");
            public static By buttonPaskyraPrisijungti = By.xpath(
                    "//div[@id='login_block251']//button[@type='submit']");
            public static By loginMessage = By.xpath(
                    "//li[@class='ty-account-info__item ty-dropdown-box__item ty-account-info__name']");
            public static By loginErrorMessage = By.xpath(
                    "//div[@class='cm-notification-container notification-container']");
            public static By accountInfo = By.xpath("//ul[@class='ty-account-info']/li[2]");
            public static By newLoginPassword = By.xpath(
                    "//div[@id='sa']//input[@x-autocompletetype='street-address']");
            public static By accountSave = By.xpath("//button[@id='save_profile_but']");
            public static By accountMessageChange = By.xpath(
                    "//div[@class='cm-notification-content " +
                            "notification-content cm-auto-hide alert-success']");
        }

        public static class Home {
            public static By menuSelectGroup = By.xpath("//ul[@id='vmenu_88']/li[2]");
            public static By menuSelectRitesGroup = By.xpath("//div[@class='owl-item'][1]");
        }
    }
}
