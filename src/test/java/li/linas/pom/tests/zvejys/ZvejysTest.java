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

    @Test
    public void inputIncorrectLoginInformation() {
        String messageEmail = "linaskursai@gmail.com";
        String messagePassword = "password";
        String expectedResult = "Vartotojo vardas arba slaptažodis yra neteisingi";
        String actualResult;

        ZvejysPage.clickOnManoPaskyrosMenu();
        ZvejysPage.clickOnManoPaskyraPrisijungti();

        ZvejysPage.enterEmailAddress(messageEmail);
        ZvejysPage.enterPassword(messagePassword);

        ZvejysPage.clickOnAccountLoginButton();
        actualResult = ZvejysPage.readErrorMessage();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                String.format("Actual: %s; Expected: %s", actualResult, expectedResult));
    }

    @Test
    public void testSearchBox() {

        String reelName = "Ritė Daiwa Laguna LT";
        String expectedResult = "Ritė Daiwa Laguna LT";
        String actualResult;

        ZvejysPage.enterReelNametoSearchBox(reelName);
        ZvejysPage.clickOnPaieskaButton();

        actualResult = ZvejysPage.getItemName();
        Assert.assertEquals(actualResult, expectedResult);
    }
}
