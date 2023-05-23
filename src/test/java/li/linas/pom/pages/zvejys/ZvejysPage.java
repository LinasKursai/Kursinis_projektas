package li.linas.pom.pages.zvejys;


import li.linas.pom.pages.Common;
import li.linas.pom.pages.Locators;

import java.util.List;

public class ZvejysPage {
    public static void clickOnManoPaskyrosMenu() {
        Common.clickOnManoPaskyraByAction(Locators.Zvejys.paskyrosMenu.manoPaskyraMenu);
    }

    public static void clickOnManoPaskyraPrisijungti() {
        Common.clickOnManoPaskyraPrisijungtiByAction(Locators.Zvejys.paskyrosMenu.manoPaskyraMenuPrisijungti);
    }

    public static void enterEmailAddress(String messageEmail) {
        Common.sendKeysToElement(Locators.Zvejys.paskyrosMenu.inputLoginEmail, messageEmail);
    }

    public static void enterPassword(String password) {
        Common.sendKeysToElement(Locators.Zvejys.paskyrosMenu.inputLoginPassword, password);
    }

    public static void clickOnAccountLoginButton() {
        Common.clickOnManoPaskyraPrisijungtiButtonByAction(Locators.Zvejys.paskyrosMenu.manoPaskyraPrisijungtiButton);
    }

    public static String readConnectedAccountEmail() {
        return Common.getTextFromElement(Locators.Zvejys.paskyrosMenu.readMessage);
    }

    public static String readErrorMessage() {
        return Common.getTextFromElement(Locators.Zvejys.paskyrosMenu.readErrorMessage);
    }

    public static void enterReelNameToSearchBox(String reelName) {
        Common.sendKeysToElement(Locators.Zvejys.reelPage.inputReelName, reelName);
    }

    public static void clickOnPaieskaButton() {
        Common.clickOnElement(Locators.Zvejys.reelPage.clickOnPaieskaButton);
    }

    public static String getItemName() {
        return Common.getTextFromElement(
                Locators.Zvejys.reelPage.getSearchItemName
        );
    }

    public static void clickOnReelDamItem() {
        Common.clickOnElement(Locators.Zvejys.reelPage.selectReelDam);
    }

    public static void clickOnReelDamItemToCart() {
        Common.clickOnElement(Locators.Zvejys.reelPage.selectReelDamToCart);
    }

    public static void clickNotificationClose() {
        Common.clickOnElement(Locators.Zvejys.reelPage.closeNotificationShipingCart);
    }

    public static void clickOnRitesSpiningavimui() {
        Common.clickOnElement(Locators.Zvejys.reelPage.switchToSpiningavimuiMenu);
    }

    public static void clickOnMeskeres() {
        Common.clickOnElement(Locators.Zvejys.reelPage.switchToMeskeres);
    }

    public static void clickOnMeskeresUpems() {
        Common.clickOnElement(Locators.Zvejys.reelPage.switchToMeskeresUpems);
    }

    public static void clickOnSpiningavimui() {
        Common.clickOnElement(Locators.Zvejys.reelPage.switchToMeskeresSpiningavimui);
    }

    public static void clinkOnSpiningai() {
        Common.clickOnElement(Locators.Zvejys.reelPage.switchToSpiningai);
    }

    public static void clickOnAddToCart() {
        Common.clickOnElement(Locators.Zvejys.reelPage.switchToAddToCart);
    }

    public static void clickOnManoKrepselisButton() {
        Common.clickOnElement(Locators.Zvejys.reelPage.selectManokrepselisButton);
    }

    public static void clickOnRodytiKrepseliButton() {
        Common.clickOnElement(Locators.Zvejys.reelPage.selectRodytiManokrepselisButton);
    }

    public static boolean checkShoppingCart(boolean isAvailable, List<String> selectValues) {
        List<String> itemsNames = Common.getTextFromElements(
                Locators.Zvejys.reelPage.shoppingCart
        );
        for (String itemName : itemsNames) {
        }
        for (String value : selectValues) {
            if (!itemsNames.contains(value)) {
                return !isAvailable;
            }
        }
        return isAvailable;
    }
}
