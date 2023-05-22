package li.linas.pom.tests.zvejys;

import li.linas.pom.pages.Common;
import li.linas.pom.pages.zvejys.ZvejysHomePage;
import li.linas.pom.pages.zvejys.ZvejysPage;
import li.linas.pom.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ZvejysTest extends TestBase {
    @BeforeMethod
    @Override
    public void seTup() {
        ZvejysHomePage.open();
        ZvejysHomePage.clickOnPrekiuGrupesRites();
        ZvejysHomePage.clickOnRitesSpiningavimui();
    }
    @Test
    public void inputCorrectLoginInformation() {
        String messageEmail = "linaskursai@gmail.com";
        String messagePassword = "KursaiTestas1";

        String expectedResult = "linaskursai@gmail.com";
        String actualResult;

        ZvejysPage.clickOnManoPaskyrosMenu();
        ZvejysPage.clickOnManoPaskyraPrisijungti();

        ZvejysPage.enterEmailAddress(messageEmail);
        ZvejysPage.enterPassword(messagePassword);

        ZvejysPage.clickOnAccountLoginButton();
        ZvejysPage.clickOnManoPaskyrosMenu();
        actualResult = ZvejysPage.readConnectedAccountEmail();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                String.format("Actual: %s; Expected: %s", actualResult, expectedResult));
    }

}
