package li.linas.pom.pages.zvejys;

import li.linas.pom.pages.Common;
import li.linas.pom.pages.Locators;

public class PaskyraPage {

    public static void clickOnManoPaskyrosMenu() {
        Common.clickOnManoPaskyraByAction(Locators.Zvejys.paskyrosMenu.buttonPaskyraMenu);
    }
    public static void clickOnManoPaskyraPrisijungti() {
        Common.clickOnManoPaskyraPrisijungtiByAction(Locators.Zvejys.paskyrosMenu.buttonPaskyraMenuPrisijungti);
    }
    public static void enterEmailAddress(String messageEmail) {
        Common.sendKeysToElement(Locators.Zvejys.paskyrosMenu.loginEmail, messageEmail);
    }
    public static void enterPassword(String password) {
        Common.sendKeysToElement(Locators.Zvejys.paskyrosMenu.loginPassword, password);
    }
    public static void clickOnAccountLoginButton() {
        Common.clickOnManoPaskyraPrisijungtiButtonByAction(Locators.Zvejys.paskyrosMenu.buttonPaskyraPrisijungti);
    }
    public static String readConnectedAccountEmail() {
        return Common.getTextFromElement(Locators.Zvejys.paskyrosMenu.loginMessage);
    }
    public static String readErrorMessage() {
        Common.waitForElementToBeVisible(Locators.Zvejys.paskyrosMenu.loginErrorMessage);
        return Common.getTextFromElement(Locators.Zvejys.paskyrosMenu.loginErrorMessage);
    }
    public static void clickOnAccountInfo() {
        Common.clickOnElement(Locators.Zvejys.paskyrosMenu.accountInfo);
    }
    public static void cleanPasswordBox() {
        Common.cleanTextBoxElement(Locators.Zvejys.paskyrosMenu.newLoginPassword);
    }
    public static void enterAddress(String address) {

        Common.sendKeysToElement(Locators.Zvejys.paskyrosMenu.newLoginPassword, address);
    }
    public static void clickOnSaugotiButton() {
        Common.clickOnElement(Locators.Zvejys.paskyrosMenu.accountSave);
    }
    public static String readAccountInfoChangeMessage() {
        return Common.getTextFromElement(Locators.Zvejys.paskyrosMenu.accountMessageChange);
    }
}