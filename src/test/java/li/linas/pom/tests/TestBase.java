package li.linas.pom.tests;

import li.linas.pom.pages.Common;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class TestBase {

    @BeforeMethod
    public abstract void seTup();

    @AfterMethod
    public void tearDown() {

        Common.closeDriver();
    }
}
