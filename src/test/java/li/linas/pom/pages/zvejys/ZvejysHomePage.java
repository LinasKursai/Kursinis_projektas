package li.linas.pom.pages.zvejys;

import li.linas.pom.pages.Common;
import li.linas.pom.pages.Locators;

public class ZvejysHomePage {
    public static void open() {
        Common.setUpDriver();
        Common.openUrl("https://www.zvejys.lt/");
    }

    public static void clickOnPrekiuGrupesRites() {
        Common.clickOnPrekiuGrupeRites(Locators.Zvejys.Home.menuSelectGroup);
    }

    public static void clickOnRitesSpiningavimui() {
        Common.clickOnRitesSpiningavimui(Locators.Zvejys.Home.menuSelectRitesGroup);
    }
}
