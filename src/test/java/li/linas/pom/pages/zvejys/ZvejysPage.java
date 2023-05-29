package li.linas.pom.pages.zvejys;


import li.linas.pom.pages.Common;
import li.linas.pom.pages.Locators;

import java.util.List;

public class ZvejysPage {

    public static void enterReelNameToSearchBox(String reelName) {
        Common.sendKeysToElement(Locators.Zvejys.reelPage.reelNameinput, reelName);
    }

    public static void clickOnPaieskaButton() {
        Common.clickOnElement(Locators.Zvejys.reelPage.buttonClickOnPaieska);
    }

    public static String getItemName() {
        return Common.getTextFromElement(
                Locators.Zvejys.reelPage.ButtonSearchItemName
        );
    }

    public static void clickOnReelDamItem() {
        Common.clickOnElement(Locators.Zvejys.reelPage.buttonSelectReelDam);
    }

    public static void clickOnReelDamItemToCart() {
        Common.clickOnElement(Locators.Zvejys.reelPage.buttonSelectReelDamToCart);
    }

    public static void clickNotificationClose() {
        Common.clickOnElement(Locators.Zvejys.reelPage.notificationCloseShipingCart);
    }

    public static void clickOnRitesSpiningavimui() {
        Common.clickOnElement(Locators.Zvejys.reelPage.buttonSwitchToSpiningavimuiMenu);
    }

    public static void clickOnMeskeres() {
        Common.clickOnElement(Locators.Zvejys.reelPage.buttonSwitchToMeskeres);
    }

    public static void clickOnMeskeresUpems() {
        Common.clickOnElement(Locators.Zvejys.reelPage.buttonSwitchToMeskeresUpems);
    }

    public static void clickOnSpiningavimui() {
        Common.clickOnElement(Locators.Zvejys.reelPage.buttonSwitchToMeskeresSpiningavimui);
    }

    public static void clinkOnSpiningai() {
        Common.clickOnElement(Locators.Zvejys.reelPage.buttonSwitchToSpiningai);
    }

    public static void clickOnAddToCart() {
        Common.clickOnElement(Locators.Zvejys.reelPage.buttonSwitchToAddToCart);
    }

    public static void clickOnManoKrepselisButton() {
        Common.clickOnElement(Locators.Zvejys.reelPage.buttonSelectManokrepselisButton);
    }

    public static void clickOnRodytiKrepseliButton() {
        Common.clickOnElement(Locators.Zvejys.reelPage.buttonSelectRodytiManokrepselisButton);
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
