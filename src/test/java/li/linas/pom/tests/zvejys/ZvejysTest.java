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

        boolean isAvailable = true;
        boolean expectedResult = true;
        boolean actualResult;
        List<String> selectValues = Arrays.asList(
                "Spiningas Savage Gear SG2 Medium Game Travel 215cm 10-40g", "Ritė DAM Quick 1 RD 3+1BB");

        actualResult = ZvejysPage.checkShoppingCart(isAvailable, selectValues);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
