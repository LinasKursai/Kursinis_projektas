package li.linas.pom.tests.zvejys;

import li.linas.pom.pages.zvejys.PaskyraPage;
import li.linas.pom.pages.zvejys.ZvejysHomePage;
import li.linas.pom.pages.zvejys.ZvejysPage;
import li.linas.pom.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PaskyraTest extends TestBase {
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

        PaskyraPage.clickOnManoPaskyrosMenu();
        PaskyraPage.clickOnManoPaskyraPrisijungti();
        PaskyraPage.enterEmailAddress(messageEmail);
        PaskyraPage.enterPassword(messagePassword);
        PaskyraPage.clickOnAccountLoginButton();
        PaskyraPage.clickOnManoPaskyrosMenu();
        actualResult = PaskyraPage.readConnectedAccountEmail();

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

        PaskyraPage.clickOnManoPaskyrosMenu();
        PaskyraPage.clickOnManoPaskyraPrisijungti();
        PaskyraPage.enterEmailAddress(messageEmail);
        PaskyraPage.enterPassword(messagePassword);
        PaskyraPage.clickOnAccountLoginButton();
        actualResult = PaskyraPage.readErrorMessage();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                String.format("Actual: %s; Expected: %s", actualResult, expectedResult));
    }

    @Test
    public void changeAddressInAccountInfo() {
        String messageEmail = "linaskursai@gmail.com";
        String messagePassword = "KursaiTestas1";
        String address = "Topolis";
        String expectedResult = "Jūsų profilis sėkmingai atnaujintas.";
        String actualResult;

        PaskyraPage.clickOnManoPaskyrosMenu();
        PaskyraPage.clickOnManoPaskyraPrisijungti();
        PaskyraPage.enterEmailAddress(messageEmail);
        PaskyraPage.enterPassword(messagePassword);
        PaskyraPage.clickOnAccountLoginButton();
        PaskyraPage.clickOnManoPaskyrosMenu();
        PaskyraPage.clickOnAccountInfo();
        PaskyraPage.cleanPasswordBox();
        PaskyraPage.enterAddress(address);
        PaskyraPage.clickOnSaugotiButton();

        actualResult = PaskyraPage.readAccountInfoChangeMessage();
        Assert.assertTrue(
                actualResult.contains(expectedResult),
                String.format("Actual: %s; Expected: %s", actualResult, expectedResult));
    }
}

