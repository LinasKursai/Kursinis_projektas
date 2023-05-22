package li.linas.pom.pages;

import org.openqa.selenium.By;

public class Locators {

    public static class Zvejys {
        public static class search {

            public static By inputReelName = By.xpath(
                    "//div[@class='ty-search-block']//input[@type='text']");
            public static By clickOnPaieskaButton = By.xpath(
                    "//div[@class='ty-search-block']//input[@type='submit']");
            public static By getSearchItemName = By.xpath(
                    "//div[@class='vs-grid vs-grid-table']//a[@class='product-title']");
        }

        public static class paskyraMenu {

            public static By manoPaskyraMenu = By.xpath("//div[@id='sw_dropdown_251']");
            public static By manoPaskyraMenuPrisijungti = By.xpath(
                    "//div[@class='ty-account-info__buttons buttons-container']" +
                            "//a[contains(text(),'Prisijungti')]");
            public static By inputLoginEmail = By.xpath("//input[@name='user_login']");
            public static By inputLoginPassword = By.xpath("//input[@name='password']");
            public static By manoPaskyraPrisijungtiButton = By.xpath(
                    "//div[@id='login_block251']//button[@type='submit']");
            public static By readMessage = By.xpath(
                    "//li[@class='ty-account-info__item ty-dropdown-box__item ty-account-info__name']");
            public static By readErrorMessage = By.xpath(
                    "//div[@class='cm-notification-container notification-container']");
        }

        public static class Home {
            public static By menuSelectGroup = By.xpath("//ul[@id='vmenu_88']/li[2]");
            public static By menuSelectRitesGroup = By.xpath("//div[@class='owl-item'][1]");
        }
    }
}
