package li.linas.pom.pages.zvejys;


import li.linas.pom.pages.Common;
import li.linas.pom.pages.Locators;

public class ZvejysPage  {
    public static void clickOnManoPaskyrosMenu() {
        Common.clickOnManoPaskyraByAction(Locators.Zvejys.paskyraMenu.manoPaskyraMenu);
    }
    public static void clickOnManoPaskyraPrisijungti() {
        Common.clickOnManoPaskyraPrisijungtiByAction(Locators.Zvejys.paskyraMenu.manoPaskyraMenuPrisijungti);
    }
    public static void enterEmailAddress(String messageEmail) {
        Common.sendKeysToElement(Locators.Zvejys.paskyraMenu.inputLoginEmail, messageEmail);
    }
    public static void enterPassword(String password) {
        Common.sendKeysToElement(Locators.Zvejys.paskyraMenu.inputLoginPassword, password);
    }
    public static void clickOnAccountLoginButton() {
        Common.clickOnManoPaskyraPrisijungtiButtonByAction(Locators.Zvejys.paskyraMenu.manoPaskyraPrisijungtiButton);
    }
    public static String readConnectedAccountEmail() {
        return Common.getTextFromElement(Locators.Zvejys.paskyraMenu.readMessage);
    }
    public static String readErrorMessage() {
        return Common.getTextFromElement(Locators.Zvejys.paskyraMenu.readErrorMessage);
    }
}
