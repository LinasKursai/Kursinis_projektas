package li.linas.pom.tests.zvejys;

import li.linas.pom.pages.Common;
import li.linas.pom.pages.zvejys.ZvejysHomePage;
import li.linas.pom.pages.zvejys.ZvejysPage;
import li.linas.pom.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

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
    public void changeAddressInAccountInfo() {
        String messageEmail = "linaskursai@gmail.com";
        String messagePassword = "KursaiTestas1";
        String address = "Topolis";
        String expectedResult = "Jūsų profilis sėkmingai atnaujintas.";
        String actualResult;

        ZvejysPage.clickOnManoPaskyrosMenu();
        ZvejysPage.clickOnManoPaskyraPrisijungti();
        ZvejysPage.enterEmailAddress(messageEmail);
        ZvejysPage.enterPassword(messagePassword);
        ZvejysPage.clickOnAccountLoginButton();
        ZvejysPage.clickOnManoPaskyrosMenu();
        ZvejysPage.clickOnAccountInfo();
        ZvejysPage.cleanPasswordBox();
        ZvejysPage.enterAddress(address);
        ZvejysPage.clickOnSaugotiButton();

        actualResult = ZvejysPage.readAccountInfoChangeMessage();
        Assert.assertTrue(
                actualResult.contains(expectedResult),
                String.format("Actual: %s; Expected: %s", actualResult, expectedResult));
    }

    @Test
    public void testSearchBox() {

        String reelName = "Ritė Daiwa Laguna LT";
        String expectedResult = "Ritė Daiwa Laguna LT";
        String actualResult;

        ZvejysPage.enterReelNameToSearchBox(reelName);
        ZvejysPage.clickOnPaieskaButton();

        actualResult = ZvejysPage.getItemName();
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void addItemsToShoppingCartAndCheckList() {

        ZvejysPage.clickOnReelDamItem();
        ZvejysPage.clickOnReelDamItemToCart();
        ZvejysPage.clickNotificationClose();
        ZvejysPage.clickOnRitesSpiningavimui();
        ZvejysPage.clickOnMeskeres();
        ZvejysPage.clickOnMeskeresUpems();
        ZvejysPage.clickOnSpiningavimui();
        ZvejysPage.clinkOnSpiningai();
        ZvejysPage.clickOnAddToCart();
        ZvejysPage.clickNotificationClose();
        ZvejysPage.clickOnManoKrepselisButton();
        ZvejysPage.clickOnRodytiKrepseliButton();
        Common.sleep(2000);

        boolean isAvailable = true;
        boolean expectedResult = true;
        boolean actualResult;
        List<String> selectValues = Arrays.asList(
                "Shimano Technium DF BX CAST 240cm 15-40g", "Ritė DAM Quick Fighter Pro FD su valu");

        actualResult = ZvejysPage.checkShoppingCart(isAvailable, selectValues);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
